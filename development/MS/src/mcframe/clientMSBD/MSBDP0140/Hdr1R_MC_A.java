package mcframe.clientMSBD.MSBDP0140;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.clientCore.container.MCKeyList;
import mcframe.clientCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"Hdr1"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Hdr1R_MC_A extends MCConstRow {

	/**
	 * Firm flg. 確定ＦＬＧ.<p>
	 *
	 */
	public static final String $fix_flg = "fix_flg";
	/**
	 * Transaction 取引.<p>
	 *
	 */
	public static final String $trd_cd = "trd_cd";
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public static final String $trd_nm = "trd_nm";
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public static final String $trd_ptn_typ = "trd_ptn_typ";
	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public static final String $ac_ym = "ac_ym";
	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public static final String $purc_act_no = "purc_act_no";
	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public static final String $purc_act_seq = "purc_act_seq";
	/**
	 * Purchase result rev. number 仕入実績改訂番号.<p>
	 *
	 */
	public static final String $purc_act_rev = "purc_act_rev";
	/**
	 * Purchase I/V No. 受領Ｉ／ＶＮＯ.<p>
	 *
	 */
	public static final String $rcpt_iv_no = "rcpt_iv_no";
	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public static final String $rcpt_iv_mng_no = "rcpt_iv_mng_no";
	/**
	 * Purchase I/V rev. number 受領Ｉ／Ｖ改訂番号.<p>
	 *
	 */
	public static final String $rcpt_iv_rev = "rcpt_iv_rev";
	/**
	 * Latest flg. 最新ＦＬＧ.<p>
	 *
	 */
	public static final String $latest_flg = "latest_flg";
	/**
	 * Cancel flg. 取消ＦＬＧ.<p>
	 *
	 */
	public static final String $can_flg = "can_flg";
	/**
	 * Purchase invoice creating source type 受領インボイス作成元区分.<p>
	 *
	 */
	public static final String $rcpt_iv_src_typ = "rcpt_iv_src_typ";
	/**
	 * Purchase invoice creating source type name 受領インボイス作成元区分名.<p>
	 *
	 */
	public static final String $rcpt_iv_src_typ_nm = "rcpt_iv_src_typ_nm";
	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public static final String $purc_schd_dt = "purc_schd_dt";
	/**
	 * Purchase date 仕入日.<p>
	 *
	 */
	public static final String $purc_dt = "purc_dt";
	/**
	 * I/V date Ｉ／Ｖ日付.<p>
	 *
	 */
	public static final String $iv_dt = "iv_dt";
	/**
	 * Scheduled purchase recording date 仕入計上予定日.<p>
	 *
	 */
	public static final String $purc_ac_schd_dt = "purc_ac_schd_dt";
	/**
	 * Exchange rate base date 為替レート基準日.<p>
	 *
	 */
	public static final String $xrate_base_dt = "xrate_base_dt";
	/**
	 * Dept. base date 部門基準日.<p>
	 *
	 */
	public static final String $dpt_base_dt = "dpt_base_dt";
	public static final String $ac_dt_p = "ac_dt_p";
	public static final String $can_ac_dt_p = "can_ac_dt_p";
	/**
	 * Payment base date 支払起算日.<p>
	 *
	 */
	public static final String $pay_basis_dt = "pay_basis_dt";
	/**
	 * Scheduled payment date 支払予定日.<p>
	 *
	 */
	public static final String $pay_schd_dt = "pay_schd_dt";
	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public static final String $po_no = "po_no";
	public static final String $inherited_src_no = "inherited_src_no";
	/**
	 * Supplier 発注先.<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public static final String $sppl_nm = "sppl_nm";
	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public static final String $subcon_flg = "subcon_flg";
	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public static final String $repurc_obli_flg = "repurc_obli_flg";
	/**
	 * Subcontracting unit price type 外注単価区分.<p>
	 *
	 */
	public static final String $outsrc_upri_typ = "outsrc_upri_typ";
	/**
	 * Delivery destination identification type 納入先識別区分.<p>
	 *
	 */
	public static final String $in_to_id_typ = "in_to_id_typ";
	/**
	 * Delivery destination identification type name 納入先識別区分名.<p>
	 *
	 */
	public static final String $in_to_id_typ_nm = "in_to_id_typ_nm";
	/**
	 * Delivery destination identification cd. 納入先識別ＣＤ.<p>
	 *
	 */
	public static final String $in_to_id_cd = "in_to_id_cd";
	/**
	 * Delivery destination identification name 納入先識別名.<p>
	 *
	 */
	public static final String $in_to_id_nm = "in_to_id_nm";
	public static final String $in_to_id_cd_dmy = "in_to_id_cd_dmy";
	public static final String $sppl_addr_p = "sppl_addr_p";
	/**
	 * For invoice transaction インボイス取引対象.<p>
	 *
	 */
	public static final String $sppl_iv_flg = "sppl_iv_flg";
	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public static final String $ap_dpt_cd = "ap_dpt_cd";
	/**
	 * Master AP dept. cd. マスタ債務部門ＣＤ.<p>
	 *
	 */
	public static final String $mst_ap_dpt_cd = "mst_ap_dpt_cd";
	/**
	 * Payment per transaction 都度支払.<p>
	 *
	 */
	public static final String $pay_spot_flg = "pay_spot_flg";
	/**
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public static final String $prnt_lcl_cd = "prnt_lcl_cd";
	/**
	 * Purchase tax calculation type 仕入税計算区分.<p>
	 *
	 */
	public static final String $purc_tax_calc_typ = "purc_tax_calc_typ";
	/**
	 * Delivery location WG cd. 納入場所ＷＧ ＣＤ.<p>
	 *
	 */
	public static final String $dlv_loc_wg_cd = "dlv_loc_wg_cd";
	public static final String $purc_usr_dpt_p = "purc_usr_dpt_p";
	/**
	 * Default purchasing PIC cd. デフォルト購買担当者ＣＤ.<p>
	 *
	 */
	public static final String $def_purc_usr_cd = "def_purc_usr_cd";
	/**
	 * Default purchasing dept. cd. デフォルト購買部門ＣＤ.<p>
	 *
	 */
	public static final String $def_purc_dpt_cd = "def_purc_dpt_cd";
	/**
	 * AP dept. 債務部門.<p>
	 *
	 */
	public static final String $ap_dpt_flg = "ap_dpt_flg";
	/**
	 * WG cd. ＷＧ ＣＤ.<p>
	 *
	 */
	public static final String $purc_dpt_wg_cd = "purc_dpt_wg_cd";
	/**
	 * WG name ＷＧ名.<p>
	 *
	 */
	public static final String $purc_dpt_wg_nm = "purc_dpt_wg_nm";
	/**
	 * Transportation method cd. 輸送方法ＣＤ.<p>
	 *
	 */
	public static final String $trnspt_cd = "trnspt_cd";
	/**
	 * Transportation method name 輸送方法名.<p>
	 *
	 */
	public static final String $trnspt_nm = "trnspt_nm";
	/**
	 * Ship/flight name 船名／便名.<p>
	 *
	 */
	public static final String $vssl_flght = "vssl_flght";
	/**
	 * Loading port cd. 船積港ＣＤ.<p>
	 *
	 */
	public static final String $load_port_cd = "load_port_cd";
	/**
	 * Loading port name 船積港名.<p>
	 *
	 */
	public static final String $load_port_nm = "load_port_nm";
	/**
	 * Estimated date of loading 船積予定日.<p>
	 *
	 */
	public static final String $etd_dt = "etd_dt";
	/**
	 * Unloading port cd. 船卸港ＣＤ.<p>
	 *
	 */
	public static final String $dschrg_port_cd = "dschrg_port_cd";
	/**
	 * Unloading port name 船卸港名.<p>
	 *
	 */
	public static final String $dschrg_port_nm = "dschrg_port_nm";
	/**
	 * Estimated date of unloading 船卸予定日.<p>
	 *
	 */
	public static final String $eta_dt = "eta_dt";
	/**
	 * Stopover point cd. 経由地ＣＤ.<p>
	 *
	 */
	public static final String $via_port_cd = "via_port_cd";
	/**
	 * Stopover point name 経由地名.<p>
	 *
	 */
	public static final String $via_port_nm = "via_port_nm";
	/**
	 * Estimated stopover date 経由予定日.<p>
	 *
	 */
	public static final String $via_schd_dt = "via_schd_dt";
	/**
	 * Transaction terms 1 取引条件１.<p>
	 *
	 */
	public static final String $tterm_cd1 = "tterm_cd1";
	/**
	 * Transaction terms name 1 取引条件名１.<p>
	 *
	 */
	public static final String $tterm_nm1 = "tterm_nm1";
	/**
	 * Transaction terms remarks 1 取引条件備考１.<p>
	 *
	 */
	public static final String $tterm_rmrks1 = "tterm_rmrks1";
	/**
	 * Transaction terms 2 取引条件２.<p>
	 *
	 */
	public static final String $tterm_cd2 = "tterm_cd2";
	/**
	 * Transaction terms name 2 取引条件名２.<p>
	 *
	 */
	public static final String $tterm_nm2 = "tterm_nm2";
	/**
	 * Transaction terms remarks 2 取引条件備考２.<p>
	 *
	 */
	public static final String $tterm_rmrks2 = "tterm_rmrks2";
	/**
	 * Transaction terms 3 取引条件３.<p>
	 *
	 */
	public static final String $tterm_cd3 = "tterm_cd3";
	/**
	 * Transaction terms name 3 取引条件名３.<p>
	 *
	 */
	public static final String $tterm_nm3 = "tterm_nm3";
	/**
	 * Transaction terms remarks 3 取引条件備考３.<p>
	 *
	 */
	public static final String $tterm_rmrks3 = "tterm_rmrks3";
	/**
	 * Currency 通貨.<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public static final String $trd_cur_nm = "trd_cur_nm";
	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_cur_upri_dec_place = "trd_cur_upri_dec_place";
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_cur_amt_dec_place = "trd_cur_amt_dec_place";
	/**
	 * Currency cd. at PO 発注時通貨ＣＤ.<p>
	 *
	 */
	public static final String $src_trd_cur_cd = "src_trd_cur_cd";
	/**
	 * Set scheduled rate 予定レート指定.<p>
	 *
	 */
	public static final String $xrate_inpt_flg = "xrate_inpt_flg";
	/**
	 * Purchase exchange rate cd. 仕入為替レートＣＤ.<p>
	 *
	 */
	public static final String $purc_xrate_cd = "purc_xrate_cd";
	public static final String $xrate_p = "xrate_p";
	public static final String $src_xrate = "src_xrate";
	/**
	 * Base currency 基準通貨.<p>
	 *
	 */
	public static final String $base_cur_cd = "base_cur_cd";
	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public static final String $base_cur_nm = "base_cur_nm";
	/**
	 * Unit price number of decimal places (Base currency) 単価小数部有効桁数（基準通貨）.<p>
	 *
	 */
	public static final String $base_cur_upri_dec_place = "base_cur_upri_dec_place";
	/**
	 * Amount number of decimal places (Base currency) 金額小数部有効桁数（基準通貨）.<p>
	 *
	 */
	public static final String $base_cur_amt_dec_place = "base_cur_amt_dec_place";
	/**
	 * Tax currency 納税通貨.<p>
	 *
	 */
	public static final String $ptax_cur_cd = "ptax_cur_cd";
	/**
	 * Tax currency name 納税通貨名.<p>
	 *
	 */
	public static final String $ptax_cur_nm = "ptax_cur_nm";
	/**
	 * Unit price number of decimal places (Base currency) 単価小数部有効桁数（基準通貨）.<p>
	 *
	 */
	public static final String $ptax_cur_upri_dec_place = "ptax_cur_upri_dec_place";
	/**
	 * Amount number of decimal places (Base currency) 金額小数部有効桁数（基準通貨）.<p>
	 *
	 */
	public static final String $ptax_cur_amt_dec_place = "ptax_cur_amt_dec_place";
	/**
	 * Taxpaying date 納税日.<p>
	 *
	 */
	public static final String $ptax_dt = "ptax_dt";
	/**
	 * Set tax schedule rate 納税予定レート指定.<p>
	 *
	 */
	public static final String $ptax_xrate_inpt_flg = "ptax_xrate_inpt_flg";
	public static final String $ptax_xrate_p = "ptax_xrate_p";
	public static final String $src_ptax_xrate = "src_ptax_xrate";
	/**
	 * Rounding type (Purchase amount) 仕入金額端数処理区分.<p>
	 *
	 */
	public static final String $purc_amt_rnd_typ = "purc_amt_rnd_typ";
	/**
	 * Purchase tax rounding type 仕入税端数処理区分.<p>
	 *
	 */
	public static final String $purc_tax_rnd_typ = "purc_tax_rnd_typ";
	/**
	 * Purchase tax priority flg. 仕入税優先ＦＬＧ.<p>
	 *
	 */
	public static final String $purc_tax_cd_prio_flg = "purc_tax_cd_prio_flg";
	/**
	 * Standard payment carry-over count 標準支払繰越回数.<p>
	 *
	 */
	public static final String $pay_crryovr_times = "pay_crryovr_times";
	/**
	 * Allow purchasing unit price change flg. 購買単価変更許可ＦＬＧ.<p>
	 *
	 */
	public static final String $purc_upri_cng_flg = "purc_upri_cng_flg";
	/**
	 * Purchase lot details split type 仕入ロット明細分割区分.<p>
	 *
	 */
	public static final String $purc_slip_each_lot_typ = "purc_slip_each_lot_typ";
	public static final String $trd_cur_amt_p = "trd_cur_amt_p";
	public static final String $trd_cur_inc_tax_amt_p = "trd_cur_inc_tax_amt_p";
	/**
	 * AP supplier 買掛先.<p>
	 *
	 */
	public static final String $asppl_cd = "asppl_cd";
	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public static final String $asppl_nm = "asppl_nm";
	/**
	 * EDI ＥＤＩ.<p>
	 *
	 */
	public static final String $edi_flg = "edi_flg";
	/**
	 * Purchase I/V remarks 受領Ｉ／Ｖ備考.<p>
	 *
	 */
	public static final String $rcpt_iv_rmrks = "rcpt_iv_rmrks";
	/**
	 * Purchase I/V internal remarks 受領Ｉ／Ｖ内部備考.<p>
	 *
	 */
	public static final String $rcpt_iv_intr_rmrks = "rcpt_iv_intr_rmrks";
	/**
	 * Purchase I/V spare 1 受領Ｉ／Ｖ予備１.<p>
	 *
	 */
	public static final String $rcpt_iv_sub_char1 = "rcpt_iv_sub_char1";
	/**
	 * Purchase I/V spare 2 受領Ｉ／Ｖ予備２.<p>
	 *
	 */
	public static final String $rcpt_iv_sub_char2 = "rcpt_iv_sub_char2";
	/**
	 * Purchase I/V spare 3 受領Ｉ／Ｖ予備３.<p>
	 *
	 */
	public static final String $rcpt_iv_sub_char3 = "rcpt_iv_sub_char3";
	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public static final String $trd_rmrks = "trd_rmrks";
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	/**
	 * PO sheet remarks 注文書備考.<p>
	 *
	 */
	public static final String $po_print_rmrks = "po_print_rmrks";
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";
	/**
	 * Update counter (Purchase result header) 更新カウンタ（仕入実績ヘッダ）.<p>
	 *
	 */
	public static final String $purc_act_upd_cntr = "purc_act_upd_cntr";
	/**
	 * Update counter (Purchase invoice header) 更新カウンタ（受領インボイスヘッダ）.<p>
	 *
	 */
	public static final String $rcpt_iv_upd_cntr = "rcpt_iv_upd_cntr";
	/**
	 * Invoice entered インボイス登録済.<p>
	 *
	 */
	public static final String $iv_reg_flg = "iv_reg_flg";
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public static final String $cst_cd = "cst_cd";
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public static final String $cst_nm = "cst_nm";
	/**
	 * Sales order transaction pattern type 受注取引パタン区分.<p>
	 *
	 */
	public static final String $slo_trd_ptn_typ = "slo_trd_ptn_typ";
	/**
	 * Sales order transaction pattern type name 受注取引パタン区分名.<p>
	 *
	 */
	public static final String $slo_trd_ptn_typ_nm = "slo_trd_ptn_typ_nm";
	/**
	 * Revenue recording type 売上計上区分.<p>
	 *
	 */
	public static final String $sls_basis_typ = "sls_basis_typ";
	/**
	 * Revenue recording type name 売上計上区分名.<p>
	 *
	 */
	public static final String $sls_basis_typ_nm = "sls_basis_typ_nm";
	/**
	 * Sales order transaction terms cd. 1 受注取引条件ＣＤ１.<p>
	 *
	 */
	public static final String $slo_tterm_cd1 = "slo_tterm_cd1";
	/**
	 * Sales order transaction terms name 1 受注取引条件名１.<p>
	 *
	 */
	public static final String $slo_tterm_nm1 = "slo_tterm_nm1";
	/**
	 * Sales order transaction terms remarks 1 受注取引条件備考１.<p>
	 *
	 */
	public static final String $slo_tterm_rmrks1 = "slo_tterm_rmrks1";
	/**
	 * Sales order transaction terms cd. 2 受注取引条件ＣＤ２.<p>
	 *
	 */
	public static final String $slo_tterm_cd2 = "slo_tterm_cd2";
	/**
	 * Sales order transaction terms name 2 受注取引条件名２.<p>
	 *
	 */
	public static final String $slo_tterm_nm2 = "slo_tterm_nm2";
	/**
	 * Sales order transaction terms remarks 2 受注取引条件備考２.<p>
	 *
	 */
	public static final String $slo_tterm_rmrks2 = "slo_tterm_rmrks2";
	/**
	 * Sales order transaction terms cd. 3 受注取引条件ＣＤ３.<p>
	 *
	 */
	public static final String $slo_tterm_cd3 = "slo_tterm_cd3";
	/**
	 * Sales order transaction terms name 3 受注取引条件名３.<p>
	 *
	 */
	public static final String $slo_tterm_nm3 = "slo_tterm_nm3";
	/**
	 * Sales order transaction terms remarks 3 受注取引条件備考３.<p>
	 *
	 */
	public static final String $slo_tterm_rmrks3 = "slo_tterm_rmrks3";
	/**
	 * Sales order currency cd. 受注通貨ＣＤ.<p>
	 *
	 */
	public static final String $slo_cur_cd = "slo_cur_cd";
	/**
	 * Sales order currency name 受注通貨名.<p>
	 *
	 */
	public static final String $slo_cur_nm = "slo_cur_nm";
	/**
	 * Sales order exchange rate 受注為替レート.<p>
	 *
	 */
	public static final String $slo_xrate = "slo_xrate";
	/**
	 * Sales order taxpaying exchange rate 受注納税為替レート.<p>
	 *
	 */
	public static final String $slo_ptax_xrate = "slo_ptax_xrate";
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public static final String $ins_usr_id = "ins_usr_id";
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public static final String $ins_usr_nm = "ins_usr_nm";
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public static final String $ins_func_id = "ins_func_id";
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public static final String $ins_func_nm = "ins_func_nm";
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public static final String $upd_usr_id = "upd_usr_id";
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public static final String $upd_usr_nm = "upd_usr_nm";
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public static final String $upd_func_id = "upd_func_id";
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public static final String $upd_func_nm = "upd_func_nm";
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public static final String $ins_ts = "ins_ts";
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public static final String $upd_ts = "upd_ts";
	/**
	 * Request No. リクエストNO.<p>
	 *
	 */
	public static final String $upd_srv_req_no = "upd_srv_req_no";

	public static final String $ac_dt = $ac_dt_p + ".ac_dt";
	public static final String $can_ac_dt_for_input = $can_ac_dt_p + ".can_ac_dt_for_input";
	public static final String $can_ac_dt = $can_ac_dt_p + ".can_ac_dt_for_call";
	public static final String $ac_dt_after_srch = $can_ac_dt_p + ".ac_dt_after_srch";
	public static final String $sppl_show_dtl = $sppl_addr_p + ".show_dtl";
	public static final String $sppl_lg_grp_cd = $sppl_addr_p + ".lg_grp_cd";
	public static final String $sppl_lg_grp_nm = $sppl_addr_p + ".lg_grp_nm";
	public static final String $sppl_cntry_cd = $sppl_addr_p + ".cntry_cd";
	public static final String $sppl_cntry_nm = $sppl_addr_p + ".cntry_nm";
	public static final String $sppl_zip_cd = $sppl_addr_p + ".zip_cd";
	public static final String $sppl_addr1 = $sppl_addr_p + ".addr1";
	public static final String $sppl_addr2 = $sppl_addr_p + ".addr2";
	public static final String $sppl_addr3 = $sppl_addr_p + ".addr3";
	public static final String $sppl_addr4 = $sppl_addr_p + ".addr4";
	public static final String $sppl_cntct_dpt = $sppl_addr_p + ".cntct_dpt";
	public static final String $sppl_cntct_psn = $sppl_addr_p + ".cntct_psn";
	public static final String $sppl_tel = $sppl_addr_p + ".tel";
	public static final String $sppl_fax = $sppl_addr_p + ".fax";
	public static final String $purc_usr_cd = $purc_usr_dpt_p + ".usr_cd";
	public static final String $purc_usr_nm = $purc_usr_dpt_p + ".usr_nm";
	public static final String $purc_dpt_cd = $purc_usr_dpt_p + ".dpt_cd";
	public static final String $purc_dpt_nm = $purc_usr_dpt_p + ".dpt_nm";
	public static final String $xrate = $xrate_p + ".xrate";
	public static final String $ptax_xrate = $ptax_xrate_p + ".xrate";
	public static final String $trd_cur_amt = $trd_cur_amt_p + ".amt";
	public static final String $trd_cur_inc_tax_amt = $trd_cur_inc_tax_amt_p + ".amt";

	public static final MCMeta fix_flg_META = createCommonMeta($fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_nm_META = createCommonMeta($trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta ac_ym_META = createCommonMeta($ac_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta purc_act_no_META = createCommonMeta($purc_act_no, mcframe.commonMA.meta.MA_META.PURC_ACT_NO);
	public static final MCMeta purc_act_seq_META = createCommonMeta($purc_act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta purc_act_rev_META = createCommonMeta($purc_act_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta rcpt_iv_no_META = createCommonMeta($rcpt_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta rcpt_iv_mng_no_META = createCommonMeta($rcpt_iv_mng_no, mcframe.commonMA.meta.MA_META.RCPT_IV_MNG_NO);
	public static final MCMeta rcpt_iv_rev_META = createCommonMeta($rcpt_iv_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta latest_flg_META = createCommonMeta($latest_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta can_flg_META = createCommonMeta($can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcpt_iv_src_typ_META = createCommonMeta($rcpt_iv_src_typ, mcframe.commonMS.meta.MS_META.RCPT_IV_SRC_TYP);
	public static final MCMeta rcpt_iv_src_typ_nm_META = createCommonMeta($rcpt_iv_src_typ_nm, mcframe.commonMS.meta.MS_META.RCPT_IV_SRC_TYP_NM);
	public static final MCMeta purc_schd_dt_META = createCommonMeta($purc_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta purc_dt_META = createCommonMeta($purc_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta iv_dt_META = createCommonMeta($iv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta purc_ac_schd_dt_META = createCommonMeta($purc_ac_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta xrate_base_dt_META = createCommonMeta($xrate_base_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dpt_base_dt_META = createCommonMeta($dpt_base_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ac_dt_p_META = createInnerRowMeta($ac_dt_p, mcframe.clientMAUB.MAUBP0310.AcDtR.class);
	public static final MCMeta can_ac_dt_p_META = createInnerRowMeta($can_ac_dt_p, mcframe.clientMAUB.MAUBP0330.CanAcDtR.class);
	public static final MCMeta pay_basis_dt_META = createCommonMeta($pay_basis_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_schd_dt_META = createCommonMeta($pay_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta po_no_META = createCommonMeta($po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta inherited_src_no_META = createCommonMeta($inherited_src_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta subcon_flg_META = createCommonMeta($subcon_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta repurc_obli_flg_META = createCommonMeta($repurc_obli_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta outsrc_upri_typ_META = createCommonMeta($outsrc_upri_typ, mcframe.commonMA.meta.MA_META.OUTSRC_UPRI_TYP);
	public static final MCMeta in_to_id_typ_META = createCommonMeta($in_to_id_typ, mcframe.commonMS.meta.MS_META.IN_TO_ID_TYP);
	public static final MCMeta in_to_id_typ_nm_META = createCommonMeta($in_to_id_typ_nm, mcframe.commonMS.meta.MS_META.IN_TO_ID_TYP_NM);
	public static final MCMeta in_to_id_cd_META = createCommonMeta($in_to_id_cd, mcframe.commonMS.meta.MS_META.IN_TO_ID_CD);
	public static final MCMeta in_to_id_nm_META = createCommonMeta($in_to_id_nm, mcframe.commonMS.meta.MS_META.IN_TO_ID_NM);
	public static final MCMeta in_to_id_cd_dmy_META = createCommonMeta($in_to_id_cd_dmy, mcframe.commonMS.meta.MS_META.IN_TO_ID_CD);
	public static final MCMeta sppl_addr_p_META = createInnerRowMeta($sppl_addr_p, mcframe.clientMAUB.MAUBP0410.AddrR.class);
	public static final MCMeta sppl_iv_flg_META = createCommonMeta($sppl_iv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ap_dpt_cd_META = createCommonMeta($ap_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta mst_ap_dpt_cd_META = createCommonMeta($mst_ap_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta pay_spot_flg_META = createCommonMeta($pay_spot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prnt_lcl_cd_META = createCommonMeta($prnt_lcl_cd, mcframe.commonMA.meta.MA_META.LCL_CD);
	public static final MCMeta purc_tax_calc_typ_META = createCommonMeta($purc_tax_calc_typ, mcframe.commonMA.meta.MA_META.TAX_CALC_TYP);
	public static final MCMeta dlv_loc_wg_cd_META = createCommonMeta($dlv_loc_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta purc_usr_dpt_p_META = createInnerRowMeta($purc_usr_dpt_p, mcframe.clientMAUB.MAUBP0320.UsrDptR.class);
	public static final MCMeta def_purc_usr_cd_META = createCommonMeta($def_purc_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta def_purc_dpt_cd_META = createCommonMeta($def_purc_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ap_dpt_flg_META = createCommonMeta($ap_dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_dpt_wg_cd_META = createCommonMeta($purc_dpt_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta purc_dpt_wg_nm_META = createCommonMeta($purc_dpt_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta trnspt_cd_META = createCommonMeta($trnspt_cd, mcframe.commonMA.meta.MA_META.TRNSPT_CD);
	public static final MCMeta trnspt_nm_META = createCommonMeta($trnspt_nm, mcframe.commonMA.meta.MA_META.TRNSPT_NM);
	public static final MCMeta vssl_flght_META = createCommonMeta($vssl_flght, mcframe.commonMA.meta.MA_META.VSSL_FLGHT);
	public static final MCMeta load_port_cd_META = createCommonMeta($load_port_cd, mcframe.commonMA.meta.MA_META.PORT_CD);
	public static final MCMeta load_port_nm_META = createCommonMeta($load_port_nm, mcframe.commonMA.meta.MA_META.PORT_NM);
	public static final MCMeta etd_dt_META = createCommonMeta($etd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dschrg_port_cd_META = createCommonMeta($dschrg_port_cd, mcframe.commonMA.meta.MA_META.PORT_CD);
	public static final MCMeta dschrg_port_nm_META = createCommonMeta($dschrg_port_nm, mcframe.commonMA.meta.MA_META.PORT_NM);
	public static final MCMeta eta_dt_META = createCommonMeta($eta_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta via_port_cd_META = createCommonMeta($via_port_cd, mcframe.commonMA.meta.MA_META.PORT_CD);
	public static final MCMeta via_port_nm_META = createCommonMeta($via_port_nm, mcframe.commonMA.meta.MA_META.PORT_NM);
	public static final MCMeta via_schd_dt_META = createCommonMeta($via_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta tterm_cd1_META = createCommonMeta($tterm_cd1, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_nm1_META = createCommonMeta($tterm_nm1, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta tterm_rmrks1_META = createCommonMeta($tterm_rmrks1, mcframe.commonMS.meta.MS_META.TTERM_RMRKS1);
	public static final MCMeta tterm_cd2_META = createCommonMeta($tterm_cd2, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_nm2_META = createCommonMeta($tterm_nm2, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta tterm_rmrks2_META = createCommonMeta($tterm_rmrks2, mcframe.commonMS.meta.MS_META.TTERM_RMRKS2);
	public static final MCMeta tterm_cd3_META = createCommonMeta($tterm_cd3, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_nm3_META = createCommonMeta($tterm_nm3, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta tterm_rmrks3_META = createCommonMeta($tterm_rmrks3, mcframe.commonMS.meta.MS_META.TTERM_RMRKS3);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta trd_cur_upri_dec_place_META = createCommonMeta($trd_cur_upri_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_cur_amt_dec_place_META = createCommonMeta($trd_cur_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta src_trd_cur_cd_META = createCommonMeta($src_trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta xrate_inpt_flg_META = createCommonMeta($xrate_inpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_xrate_cd_META = createCommonMeta($purc_xrate_cd, mcframe.commonMA.meta.MA_META.XRATE_CD);
	public static final MCMeta xrate_p_META = createInnerRowMeta($xrate_p, mcframe.clientMAUB.MAUBP0420.XrateR.class);
	public static final MCMeta src_xrate_META = createCommonMeta($src_xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_cd_META = createCommonMeta($base_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta base_cur_nm_META = createCommonMeta($base_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta base_cur_upri_dec_place_META = createCommonMeta($base_cur_upri_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_cur_amt_dec_place_META = createCommonMeta($base_cur_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta ptax_cur_cd_META = createCommonMeta($ptax_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta ptax_cur_nm_META = createCommonMeta($ptax_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta ptax_cur_upri_dec_place_META = createCommonMeta($ptax_cur_upri_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta ptax_cur_amt_dec_place_META = createCommonMeta($ptax_cur_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta ptax_dt_META = createCommonMeta($ptax_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ptax_xrate_inpt_flg_META = createCommonMeta($ptax_xrate_inpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ptax_xrate_p_META = createInnerRowMeta($ptax_xrate_p, mcframe.clientMAUB.MAUBP0420.XrateR.class);
	public static final MCMeta src_ptax_xrate_META = createCommonMeta($src_ptax_xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_amt_rnd_typ_META = createCommonMeta($purc_amt_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta purc_tax_rnd_typ_META = createCommonMeta($purc_tax_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta purc_tax_cd_prio_flg_META = createCommonMeta($purc_tax_cd_prio_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_crryovr_times_META = createCommonMeta($pay_crryovr_times, mcframe.commonMA.meta.MA_META.CRRYOVR_TIMES);
	public static final MCMeta purc_upri_cng_flg_META = createCommonMeta($purc_upri_cng_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_slip_each_lot_typ_META = createCommonMeta($purc_slip_each_lot_typ, mcframe.commonMA.meta.MA_META.SLIP_EACH_LOT_TYP);
	public static final MCMeta trd_cur_amt_p_META = createInnerRowMeta($trd_cur_amt_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta trd_cur_inc_tax_amt_p_META = createInnerRowMeta($trd_cur_inc_tax_amt_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta asppl_cd_META = createCommonMeta($asppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta asppl_nm_META = createCommonMeta($asppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta edi_flg_META = createCommonMeta($edi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcpt_iv_rmrks_META = createCommonMeta($rcpt_iv_rmrks, mcframe.commonMS.meta.MS_META.IV_RMRKS);
	public static final MCMeta rcpt_iv_intr_rmrks_META = createCommonMeta($rcpt_iv_intr_rmrks, mcframe.commonMS.meta.MS_META.RCPT_IV_INTR_RMRKS);
	public static final MCMeta rcpt_iv_sub_char1_META = createCommonMeta($rcpt_iv_sub_char1, mcframe.commonMS.meta.MS_META.RCPT_IV_SUB_CHAR1);
	public static final MCMeta rcpt_iv_sub_char2_META = createCommonMeta($rcpt_iv_sub_char2, mcframe.commonMS.meta.MS_META.RCPT_IV_SUB_CHAR2);
	public static final MCMeta rcpt_iv_sub_char3_META = createCommonMeta($rcpt_iv_sub_char3, mcframe.commonMS.meta.MS_META.RCPT_IV_SUB_CHAR3);
	public static final MCMeta trd_rmrks_META = createCommonMeta($trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.PURC_ACT_INTR_RMRKS);
	public static final MCMeta po_print_rmrks_META = createCommonMeta($po_print_rmrks, mcframe.commonMS.meta.MS_META.PO_PRINT_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.PURC_ACT_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.PURC_ACT_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.PURC_ACT_SUB_CHAR3);
	public static final MCMeta purc_act_upd_cntr_META = createCommonMeta($purc_act_upd_cntr, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta rcpt_iv_upd_cntr_META = createCommonMeta($rcpt_iv_upd_cntr, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta iv_reg_flg_META = createCommonMeta($iv_reg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cst_nm_META = createCommonMeta($cst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta slo_trd_ptn_typ_META = createCommonMeta($slo_trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta slo_trd_ptn_typ_nm_META = createCommonMeta($slo_trd_ptn_typ_nm, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP_NM);
	public static final MCMeta sls_basis_typ_META = createCommonMeta($sls_basis_typ, mcframe.commonMA.meta.MA_META.SLS_BASIS_TYP);
	public static final MCMeta sls_basis_typ_nm_META = createCommonMeta($sls_basis_typ_nm, mcframe.commonMA.meta.MA_META.SLS_BASIS_TYP_NM);
	public static final MCMeta slo_tterm_cd1_META = createCommonMeta($slo_tterm_cd1, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta slo_tterm_nm1_META = createCommonMeta($slo_tterm_nm1, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta slo_tterm_rmrks1_META = createCommonMeta($slo_tterm_rmrks1, mcframe.commonMS.meta.MS_META.TTERM_RMRKS1);
	public static final MCMeta slo_tterm_cd2_META = createCommonMeta($slo_tterm_cd2, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta slo_tterm_nm2_META = createCommonMeta($slo_tterm_nm2, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta slo_tterm_rmrks2_META = createCommonMeta($slo_tterm_rmrks2, mcframe.commonMS.meta.MS_META.TTERM_RMRKS2);
	public static final MCMeta slo_tterm_cd3_META = createCommonMeta($slo_tterm_cd3, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta slo_tterm_nm3_META = createCommonMeta($slo_tterm_nm3, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta slo_tterm_rmrks3_META = createCommonMeta($slo_tterm_rmrks3, mcframe.commonMS.meta.MS_META.TTERM_RMRKS3);
	public static final MCMeta slo_cur_cd_META = createCommonMeta($slo_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta slo_cur_nm_META = createCommonMeta($slo_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta slo_xrate_META = createCommonMeta($slo_xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta slo_ptax_xrate_META = createCommonMeta($slo_ptax_xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);

	protected static final ConstMetaList<Hdr1R> constMetas = new ConstMetaList<Hdr1R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			fix_flg_META,
			trd_cd_META,
			trd_nm_META,
			trd_ptn_typ_META,
			ac_ym_META,
			purc_act_no_META,
			purc_act_seq_META,
			purc_act_rev_META,
			rcpt_iv_no_META,
			rcpt_iv_mng_no_META,
			rcpt_iv_rev_META,
			latest_flg_META,
			can_flg_META,
			rcpt_iv_src_typ_META,
			rcpt_iv_src_typ_nm_META,
			purc_schd_dt_META,
			purc_dt_META,
			iv_dt_META,
			purc_ac_schd_dt_META,
			xrate_base_dt_META,
			dpt_base_dt_META,
			ac_dt_p_META,
			can_ac_dt_p_META,
			pay_basis_dt_META,
			pay_schd_dt_META,
			po_no_META,
			inherited_src_no_META,
			sppl_cd_META,
			sppl_nm_META,
			subcon_flg_META,
			repurc_obli_flg_META,
			outsrc_upri_typ_META,
			in_to_id_typ_META,
			in_to_id_typ_nm_META,
			in_to_id_cd_META,
			in_to_id_nm_META,
			in_to_id_cd_dmy_META,
			sppl_addr_p_META,
			sppl_iv_flg_META,
			ap_dpt_cd_META,
			mst_ap_dpt_cd_META,
			pay_spot_flg_META,
			prnt_lcl_cd_META,
			purc_tax_calc_typ_META,
			dlv_loc_wg_cd_META,
			purc_usr_dpt_p_META,
			def_purc_usr_cd_META,
			def_purc_dpt_cd_META,
			ap_dpt_flg_META,
			purc_dpt_wg_cd_META,
			purc_dpt_wg_nm_META,
			trnspt_cd_META,
			trnspt_nm_META,
			vssl_flght_META,
			load_port_cd_META,
			load_port_nm_META,
			etd_dt_META,
			dschrg_port_cd_META,
			dschrg_port_nm_META,
			eta_dt_META,
			via_port_cd_META,
			via_port_nm_META,
			via_schd_dt_META,
			tterm_cd1_META,
			tterm_nm1_META,
			tterm_rmrks1_META,
			tterm_cd2_META,
			tterm_nm2_META,
			tterm_rmrks2_META,
			tterm_cd3_META,
			tterm_nm3_META,
			tterm_rmrks3_META,
			trd_cur_cd_META,
			trd_cur_nm_META,
			trd_cur_upri_dec_place_META,
			trd_cur_amt_dec_place_META,
			src_trd_cur_cd_META,
			xrate_inpt_flg_META,
			purc_xrate_cd_META,
			xrate_p_META,
			src_xrate_META,
			base_cur_cd_META,
			base_cur_nm_META,
			base_cur_upri_dec_place_META,
			base_cur_amt_dec_place_META,
			ptax_cur_cd_META,
			ptax_cur_nm_META,
			ptax_cur_upri_dec_place_META,
			ptax_cur_amt_dec_place_META,
			ptax_dt_META,
			ptax_xrate_inpt_flg_META,
			ptax_xrate_p_META,
			src_ptax_xrate_META,
			purc_amt_rnd_typ_META,
			purc_tax_rnd_typ_META,
			purc_tax_cd_prio_flg_META,
			pay_crryovr_times_META,
			purc_upri_cng_flg_META,
			purc_slip_each_lot_typ_META,
			trd_cur_amt_p_META,
			trd_cur_inc_tax_amt_p_META,
			asppl_cd_META,
			asppl_nm_META,
			edi_flg_META,
			rcpt_iv_rmrks_META,
			rcpt_iv_intr_rmrks_META,
			rcpt_iv_sub_char1_META,
			rcpt_iv_sub_char2_META,
			rcpt_iv_sub_char3_META,
			trd_rmrks_META,
			intr_rmrks_META,
			po_print_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			purc_act_upd_cntr_META,
			rcpt_iv_upd_cntr_META,
			iv_reg_flg_META,
			cst_cd_META,
			cst_nm_META,
			slo_trd_ptn_typ_META,
			slo_trd_ptn_typ_nm_META,
			sls_basis_typ_META,
			sls_basis_typ_nm_META,
			slo_tterm_cd1_META,
			slo_tterm_nm1_META,
			slo_tterm_rmrks1_META,
			slo_tterm_cd2_META,
			slo_tterm_nm2_META,
			slo_tterm_rmrks2_META,
			slo_tterm_cd3_META,
			slo_tterm_nm3_META,
			slo_tterm_rmrks3_META,
			slo_cur_cd_META,
			slo_cur_nm_META,
			slo_xrate_META,
			slo_ptax_xrate_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_func_id_META,
			ins_func_nm_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_func_id_META,
			upd_func_nm_META,
			ins_ts_META,
			upd_ts_META,
			upd_srv_req_no_META
		},
		new String[][]{
			{
				"ac_dt",
				"can_ac_dt_for_input",
				"can_ac_dt",
				"ac_dt_after_srch",
				"sppl_lg_grp_cd",
				"sppl_lg_grp_nm",
				"sppl_cntry_cd",
				"sppl_cntry_nm",
				"sppl_zip_cd",
				"sppl_addr1",
				"sppl_addr2",
				"sppl_addr3",
				"sppl_addr4",
				"sppl_cntct_dpt",
				"sppl_cntct_psn",
				"sppl_tel",
				"sppl_fax",
				"purc_usr_cd",
				"purc_usr_nm",
				"purc_dpt_cd",
				"purc_dpt_nm",
				"xrate",
				"ptax_xrate",
				"trd_cur_amt",
				"trd_cur_inc_tax_amt"
			},
			{
				$ac_dt,
				$can_ac_dt_for_input,
				$can_ac_dt,
				$ac_dt_after_srch,
				$sppl_lg_grp_cd,
				$sppl_lg_grp_nm,
				$sppl_cntry_cd,
				$sppl_cntry_nm,
				$sppl_zip_cd,
				$sppl_addr1,
				$sppl_addr2,
				$sppl_addr3,
				$sppl_addr4,
				$sppl_cntct_dpt,
				$sppl_cntct_psn,
				$sppl_tel,
				$sppl_fax,
				$purc_usr_cd,
				$purc_usr_nm,
				$purc_dpt_cd,
				$purc_dpt_nm,
				$xrate,
				$ptax_xrate,
				$trd_cur_amt,
				$trd_cur_inc_tax_amt
			}
		}
	);

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
		}
	);

	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[IV_ONLY_ITEM]のキー定数 */
	public static final String $$IV_ONLY_ITEM = "IV_ONLY_ITEM";
	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$sppl_cd, "bp_nm;subcon_flg;purc_usr_cd;purc_dpt_cd;ap_dpt_cd;sppl_cntct_dpt;sppl_cntct_psn;tel;fax;cntry_cd;cntry_nm;sppl_iv_flg;cur_cd;asppl_cd;purc_amt_rnd_typ;purc_tax_rnd_typ;purc_upri_cng_flg;pay_crryovr_times;ap_dpt_cd;prnt_lcl_cd;purc_tax_calc_typ;sppl_tterm_cd1;sppl_tterm_cd2;sppl_tterm_cd3;repurc_obli_flg;outsrc_upri_typ;pay_spot_flg"},	// sppl_cd
				{$in_to_id_cd, "loc_nm;wg_cd"},	// in_to_id_cd
				{$in_to_id_cd_dmy, "in_to_id_nm;cntry_cd;cntry_nm;zip_cd;addr1;addr2;addr3;addr4;tel;fax;in_to_cntct_dpt;in_to_cntct_psn"},	// in_to_id_cd_dmy
				{$purc_usr_dpt_p + ".dpt_cd", "dpt_nm;wg_cd;wg_nm;ap_dpt_flg"},	// purc_usr_dpt_p.dpt_cd
				{$load_port_cd, "port_nm"},	// load_port_cd
				{$dschrg_port_cd, "port_nm"},	// dschrg_port_cd
				{$via_port_cd, "port_nm"},	// via_port_cd
				{$tterm_cd1, "tterm_nm"},	// tterm_cd1
				{$tterm_cd2, "tterm_nm"},	// tterm_cd2
				{$tterm_cd3, "tterm_nm"},	// tterm_cd3
				{$trd_cur_cd, "cur_nm;amt_dec_place;upri_dec_place"},	// trd_cur_cd
				{$asppl_cd, "bp_nm"}	// asppl_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$sppl_cd, "MAC_BP_IS_SRCH_TYP.SPPL_PURC;purc_dt"},	// sppl_cd
				{$in_to_id_cd, "MAC_LOC_IS_SRCH_TYP.COMM"},	// in_to_id_cd
				{$in_to_id_cd_dmy, "in_to_id_typ;purc_dt"},	// in_to_id_cd_dmy
				{$purc_usr_dpt_p + ".dpt_cd", "MAC_DPT_IS_SRCH_TYP.PURC;ac_dt;purc_usr_cd;true;true"},	// purc_usr_dpt_p.dpt_cd
				{$tterm_cd1, "MAC_TTERM_TYP.TTERM1"},	// tterm_cd1
				{$tterm_cd2, "MAC_TTERM_TYP.TTERM2"},	// tterm_cd2
				{$tterm_cd3, "MAC_TTERM_TYP.TTERM3"},	// tterm_cd3
				{$asppl_cd, "MAC_BP_IS_SRCH_TYP.ASPPL"}	// asppl_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$sppl_cd, "bp_is_srch_typ;dt"},	// sppl_cd
				{$in_to_id_cd, "loc_is_srch_typ"},	// in_to_id_cd
				{$in_to_id_cd_dmy, "in_to_id_typ;base_dt"},	// in_to_id_cd_dmy
				{$purc_usr_dpt_p + ".dpt_cd", "dpt_is_srch_typ;dt;usr_cd;rd_flg;wr_flg"},	// purc_usr_dpt_p.dpt_cd
				{$tterm_cd1, "tterm_typ"},	// tterm_cd1
				{$tterm_cd2, "tterm_typ"},	// tterm_cd2
				{$tterm_cd3, "tterm_typ"},	// tterm_cd3
				{$asppl_cd, "bp_is_srch_typ"}	// asppl_cd
			}
		)),
		new MCExtMap.Entry($$IV_ONLY_ITEM, new MCExtList(
			new String[][]{
				{$fix_flg, "E"},	// fix_flg
				{$rcpt_iv_no, "E"},	// rcpt_iv_no
				{$rcpt_iv_mng_no, "E"},	// rcpt_iv_mng_no
				{$rcpt_iv_rev, "E"},	// rcpt_iv_rev
				{$rcpt_iv_src_typ, "E"},	// rcpt_iv_src_typ
				{$rcpt_iv_src_typ_nm, "E"},	// rcpt_iv_src_typ_nm
				{$purc_schd_dt, "E"},	// purc_schd_dt
				{$iv_dt, "E"},	// iv_dt
				{$purc_ac_schd_dt, "E"},	// purc_ac_schd_dt
				{$xrate_base_dt, "E"},	// xrate_base_dt
				{$dpt_base_dt, "E"},	// dpt_base_dt
				{$pay_schd_dt, "E"},	// pay_schd_dt
				{$in_to_id_typ, "E"},	// in_to_id_typ
				{$in_to_id_typ_nm, "E"},	// in_to_id_typ_nm
				{$in_to_id_cd, "E"},	// in_to_id_cd
				{$in_to_id_nm, "E"},	// in_to_id_nm
				{$in_to_id_cd_dmy, "E"},	// in_to_id_cd_dmy
				{$sppl_addr_p + ".show_dtl", "E"},	// sppl_addr_p.show_dtl
				{$sppl_addr_p + ".cntry_cd", "E"},	// sppl_addr_p.cntry_cd
				{$sppl_addr_p + ".cntry_nm", "E"},	// sppl_addr_p.cntry_nm
				{$sppl_addr_p + ".zip_cd", "E"},	// sppl_addr_p.zip_cd
				{$sppl_addr_p + ".addr1", "E"},	// sppl_addr_p.addr1
				{$sppl_addr_p + ".addr2", "E"},	// sppl_addr_p.addr2
				{$sppl_addr_p + ".addr3", "E"},	// sppl_addr_p.addr3
				{$sppl_addr_p + ".addr4", "E"},	// sppl_addr_p.addr4
				{$pay_spot_flg, "E"},	// pay_spot_flg
				{$dlv_loc_wg_cd, "E"},	// dlv_loc_wg_cd
				{$trnspt_cd, "E"},	// trnspt_cd
				{$trnspt_nm, "E"},	// trnspt_nm
				{$vssl_flght, "E"},	// vssl_flght
				{$load_port_cd, "E"},	// load_port_cd
				{$load_port_nm, "E"},	// load_port_nm
				{$etd_dt, "E"},	// etd_dt
				{$dschrg_port_cd, "E"},	// dschrg_port_cd
				{$dschrg_port_nm, "E"},	// dschrg_port_nm
				{$eta_dt, "E"},	// eta_dt
				{$via_port_cd, "E"},	// via_port_cd
				{$via_port_nm, "E"},	// via_port_nm
				{$via_schd_dt, "E"},	// via_schd_dt
				{$rcpt_iv_rmrks, "E"},	// rcpt_iv_rmrks
				{$rcpt_iv_intr_rmrks, "E"},	// rcpt_iv_intr_rmrks
				{$rcpt_iv_sub_char1, "E"},	// rcpt_iv_sub_char1
				{$rcpt_iv_sub_char2, "E"},	// rcpt_iv_sub_char2
				{$rcpt_iv_sub_char3, "E"}	// rcpt_iv_sub_char3
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$purc_dpt_wg_cd, "WG"},	// purc_dpt_wg_cd
				{$purc_dpt_wg_nm, "WG"},	// purc_dpt_wg_nm
				{$xrate_inpt_flg, "BASE_CUR"},	// xrate_inpt_flg
				{$purc_xrate_cd, "BASE_CUR"},	// purc_xrate_cd
				{$xrate_p + ".xrate", "BASE_CUR"},	// xrate_p.xrate
				{$base_cur_cd, "BASE_CUR"},	// base_cur_cd
				{$base_cur_nm, "BASE_CUR"},	// base_cur_nm
				{$base_cur_upri_dec_place, "BASE_CUR"},	// base_cur_upri_dec_place
				{$base_cur_amt_dec_place, "BASE_CUR"},	// base_cur_amt_dec_place
				{$ptax_cur_cd, "PTAX"},	// ptax_cur_cd
				{$ptax_cur_nm, "PTAX"},	// ptax_cur_nm
				{$ptax_cur_upri_dec_place, "PTAX"},	// ptax_cur_upri_dec_place
				{$ptax_cur_amt_dec_place, "PTAX"},	// ptax_cur_amt_dec_place
				{$ptax_dt, "PTAX"},	// ptax_dt
				{$ptax_xrate_inpt_flg, "PTAX"},	// ptax_xrate_inpt_flg
				{$ptax_xrate_p + ".xrate", "PTAX"}	// ptax_xrate_p.xrate
			}
		))
	);

	/**
	 * クラスに定義されている固定カラム名を配列で返します。
	 *
	 * 並び順は定義順と同じです。
	 * 固定カラムがない場合は要素0の配列が返ります。
	 * 
	 * @return 固定カラム名の配列
	 */
	public static String[] colnames() {
		return constMetas.toNameArray();
	}

	/**
	 * クラスに定義されている固定カラムメタを配列で返します。
	 *
	 * 並び順は定義順と同じです。
	 * 固定カラムがない場合は要素0の配列が返ります。
	 * 
	 * @return 固定カラムメタの配列
	 */
	public static MCMeta[] colmetas() {
		return constMetas.toMetaArray();
	}

	/**
	 * 実際のカラム位置を知るためオフセットです。
	 */
	private static final int offset = constMetas.offset();

	/**
	 * "KEYS"グループのキー項目情報を返します。
	 */
	public MCKeyList getKeys(){
		return KEYS;
	}

	/**
	 * 指定グループの項目属性情報を返します。
	 */
	public Map<String, String> getExtMap(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.get(aGroup);
	}

	/**
	 * 指定グループの項目属性が登録された項目リストを返します。
	 */
	public MCKeyList getKeys(String aGroup){
		if(aGroup == null) return null;
		return new MCKeyList(EXTMAP.getKeyList(aGroup));
	}

	/**
	 * 項目属性のグループのSet情報を返します。
	 */
	public Set<String> getExtGroups(){
		Set<String> ret = EXTMAP.keySet();
		return ret;
	}

	/**
	 * コンストラクタです。
	 */
	protected Hdr1R_MC_A(ConstMetaList<? extends Hdr1R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Hdr1R clone() {
		return (Hdr1R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Hdr1R createInstance() {
		return (Hdr1R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Hdr1R getValues(String... names) {
		return (Hdr1R) super.getValues(names);
	}



	/**
	 * Firm flg. 確定ＦＬＧ.<p>
	 *
	 */
	public boolean fix_flg() {
		return getConstBoolean(offset + 0, $fix_flg);
	}

	/**
	 * Firm flg. 確定ＦＬＧ.<p>
	 *
	 */
	public void fix_flg(boolean value) {
		setConstBoolean(offset + 0, $fix_flg, value);
	}


	/**
	 * Transaction 取引.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 1, $trd_cd);
	}

	/**
	 * Transaction 取引.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 1, $trd_cd, value);
	}


	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 2, $trd_nm);
	}

	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 2, $trd_nm, value);
	}


	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 3, $trd_ptn_typ);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 3, $trd_ptn_typ, value);
	}


	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public MCDate ac_ym() {
		return getConstDate(offset + 4, $ac_ym);
	}

	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public void ac_ym(MCDate value) {
		setConstDate(offset + 4, $ac_ym, value);
	}


	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public String purc_act_no() {
		return getConstString(offset + 5, $purc_act_no);
	}

	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public void purc_act_no(String value) {
		setConstString(offset + 5, $purc_act_no, value);
	}


	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public MCNumber purc_act_seq() {
		return getConstNumber(offset + 6, $purc_act_seq);
	}

	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public void purc_act_seq(MCNumber value) {
		setConstNumber(offset + 6, $purc_act_seq, value);
	}

	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public void purc_act_seq(int value) {
		setConstNumber(offset + 6, $purc_act_seq, value);
	}

	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public void purc_act_seq(long value) {
		setConstNumber(offset + 6, $purc_act_seq, value);
	}

	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public void purc_act_seq(float value) {
		setConstNumber(offset + 6, $purc_act_seq, value);
	}

	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public void purc_act_seq(double value) {
		setConstNumber(offset + 6, $purc_act_seq, value);
	}


	/**
	 * Purchase result rev. number 仕入実績改訂番号.<p>
	 *
	 */
	public MCNumber purc_act_rev() {
		return getConstNumber(offset + 7, $purc_act_rev);
	}

	/**
	 * Purchase result rev. number 仕入実績改訂番号.<p>
	 *
	 */
	public void purc_act_rev(MCNumber value) {
		setConstNumber(offset + 7, $purc_act_rev, value);
	}

	/**
	 * Purchase result rev. number 仕入実績改訂番号.<p>
	 *
	 */
	public void purc_act_rev(int value) {
		setConstNumber(offset + 7, $purc_act_rev, value);
	}

	/**
	 * Purchase result rev. number 仕入実績改訂番号.<p>
	 *
	 */
	public void purc_act_rev(long value) {
		setConstNumber(offset + 7, $purc_act_rev, value);
	}

	/**
	 * Purchase result rev. number 仕入実績改訂番号.<p>
	 *
	 */
	public void purc_act_rev(float value) {
		setConstNumber(offset + 7, $purc_act_rev, value);
	}

	/**
	 * Purchase result rev. number 仕入実績改訂番号.<p>
	 *
	 */
	public void purc_act_rev(double value) {
		setConstNumber(offset + 7, $purc_act_rev, value);
	}


	/**
	 * Purchase I/V No. 受領Ｉ／ＶＮＯ.<p>
	 *
	 */
	public String rcpt_iv_no() {
		return getConstString(offset + 8, $rcpt_iv_no);
	}

	/**
	 * Purchase I/V No. 受領Ｉ／ＶＮＯ.<p>
	 *
	 */
	public void rcpt_iv_no(String value) {
		setConstString(offset + 8, $rcpt_iv_no, value);
	}


	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public String rcpt_iv_mng_no() {
		return getConstString(offset + 9, $rcpt_iv_mng_no);
	}

	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public void rcpt_iv_mng_no(String value) {
		setConstString(offset + 9, $rcpt_iv_mng_no, value);
	}


	/**
	 * Purchase I/V rev. number 受領Ｉ／Ｖ改訂番号.<p>
	 *
	 */
	public MCNumber rcpt_iv_rev() {
		return getConstNumber(offset + 10, $rcpt_iv_rev);
	}

	/**
	 * Purchase I/V rev. number 受領Ｉ／Ｖ改訂番号.<p>
	 *
	 */
	public void rcpt_iv_rev(MCNumber value) {
		setConstNumber(offset + 10, $rcpt_iv_rev, value);
	}

	/**
	 * Purchase I/V rev. number 受領Ｉ／Ｖ改訂番号.<p>
	 *
	 */
	public void rcpt_iv_rev(int value) {
		setConstNumber(offset + 10, $rcpt_iv_rev, value);
	}

	/**
	 * Purchase I/V rev. number 受領Ｉ／Ｖ改訂番号.<p>
	 *
	 */
	public void rcpt_iv_rev(long value) {
		setConstNumber(offset + 10, $rcpt_iv_rev, value);
	}

	/**
	 * Purchase I/V rev. number 受領Ｉ／Ｖ改訂番号.<p>
	 *
	 */
	public void rcpt_iv_rev(float value) {
		setConstNumber(offset + 10, $rcpt_iv_rev, value);
	}

	/**
	 * Purchase I/V rev. number 受領Ｉ／Ｖ改訂番号.<p>
	 *
	 */
	public void rcpt_iv_rev(double value) {
		setConstNumber(offset + 10, $rcpt_iv_rev, value);
	}


	/**
	 * Latest flg. 最新ＦＬＧ.<p>
	 *
	 */
	public boolean latest_flg() {
		return getConstBoolean(offset + 11, $latest_flg);
	}

	/**
	 * Latest flg. 最新ＦＬＧ.<p>
	 *
	 */
	public void latest_flg(boolean value) {
		setConstBoolean(offset + 11, $latest_flg, value);
	}


	/**
	 * Cancel flg. 取消ＦＬＧ.<p>
	 *
	 */
	public boolean can_flg() {
		return getConstBoolean(offset + 12, $can_flg);
	}

	/**
	 * Cancel flg. 取消ＦＬＧ.<p>
	 *
	 */
	public void can_flg(boolean value) {
		setConstBoolean(offset + 12, $can_flg, value);
	}


	/**
	 * Purchase invoice creating source type 受領インボイス作成元区分.<p>
	 *
	 */
	public String rcpt_iv_src_typ() {
		return getConstString(offset + 13, $rcpt_iv_src_typ);
	}

	/**
	 * Purchase invoice creating source type 受領インボイス作成元区分.<p>
	 *
	 */
	public void rcpt_iv_src_typ(String value) {
		setConstString(offset + 13, $rcpt_iv_src_typ, value);
	}


	/**
	 * Purchase invoice creating source type name 受領インボイス作成元区分名.<p>
	 *
	 */
	public String rcpt_iv_src_typ_nm() {
		return getConstString(offset + 14, $rcpt_iv_src_typ_nm);
	}

	/**
	 * Purchase invoice creating source type name 受領インボイス作成元区分名.<p>
	 *
	 */
	public void rcpt_iv_src_typ_nm(String value) {
		setConstString(offset + 14, $rcpt_iv_src_typ_nm, value);
	}


	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public MCDate purc_schd_dt() {
		return getConstDate(offset + 15, $purc_schd_dt);
	}

	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public void purc_schd_dt(MCDate value) {
		setConstDate(offset + 15, $purc_schd_dt, value);
	}


	/**
	 * Purchase date 仕入日.<p>
	 *
	 */
	public MCDate purc_dt() {
		return getConstDate(offset + 16, $purc_dt);
	}

	/**
	 * Purchase date 仕入日.<p>
	 *
	 */
	public void purc_dt(MCDate value) {
		setConstDate(offset + 16, $purc_dt, value);
	}


	/**
	 * I/V date Ｉ／Ｖ日付.<p>
	 *
	 */
	public MCDate iv_dt() {
		return getConstDate(offset + 17, $iv_dt);
	}

	/**
	 * I/V date Ｉ／Ｖ日付.<p>
	 *
	 */
	public void iv_dt(MCDate value) {
		setConstDate(offset + 17, $iv_dt, value);
	}


	/**
	 * Scheduled purchase recording date 仕入計上予定日.<p>
	 *
	 */
	public MCDate purc_ac_schd_dt() {
		return getConstDate(offset + 18, $purc_ac_schd_dt);
	}

	/**
	 * Scheduled purchase recording date 仕入計上予定日.<p>
	 *
	 */
	public void purc_ac_schd_dt(MCDate value) {
		setConstDate(offset + 18, $purc_ac_schd_dt, value);
	}


	/**
	 * Exchange rate base date 為替レート基準日.<p>
	 *
	 */
	public MCDate xrate_base_dt() {
		return getConstDate(offset + 19, $xrate_base_dt);
	}

	/**
	 * Exchange rate base date 為替レート基準日.<p>
	 *
	 */
	public void xrate_base_dt(MCDate value) {
		setConstDate(offset + 19, $xrate_base_dt, value);
	}


	/**
	 * Dept. base date 部門基準日.<p>
	 *
	 */
	public MCDate dpt_base_dt() {
		return getConstDate(offset + 20, $dpt_base_dt);
	}

	/**
	 * Dept. base date 部門基準日.<p>
	 *
	 */
	public void dpt_base_dt(MCDate value) {
		setConstDate(offset + 20, $dpt_base_dt, value);
	}


	public mcframe.clientMAUB.MAUBP0310.AcDtR ac_dt_p(){
		return (mcframe.clientMAUB.MAUBP0310.AcDtR) getConstInnerRow(offset + 21, $ac_dt_p);
	}
	
	public void ac_dt_p(mcframe.clientMAUB.MAUBP0310.AcDtR row){
		setConstInnerRow(offset + 21, $ac_dt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0330.CanAcDtR can_ac_dt_p(){
		return (mcframe.clientMAUB.MAUBP0330.CanAcDtR) getConstInnerRow(offset + 22, $can_ac_dt_p);
	}
	
	public void can_ac_dt_p(mcframe.clientMAUB.MAUBP0330.CanAcDtR row){
		setConstInnerRow(offset + 22, $can_ac_dt_p, row);
	}


	/**
	 * Payment base date 支払起算日.<p>
	 *
	 */
	public MCDate pay_basis_dt() {
		return getConstDate(offset + 23, $pay_basis_dt);
	}

	/**
	 * Payment base date 支払起算日.<p>
	 *
	 */
	public void pay_basis_dt(MCDate value) {
		setConstDate(offset + 23, $pay_basis_dt, value);
	}


	/**
	 * Scheduled payment date 支払予定日.<p>
	 *
	 */
	public MCDate pay_schd_dt() {
		return getConstDate(offset + 24, $pay_schd_dt);
	}

	/**
	 * Scheduled payment date 支払予定日.<p>
	 *
	 */
	public void pay_schd_dt(MCDate value) {
		setConstDate(offset + 24, $pay_schd_dt, value);
	}


	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 25, $po_no);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 25, $po_no, value);
	}


	public String inherited_src_no() {
		return getConstString(offset + 26, $inherited_src_no);
	}

	public void inherited_src_no(String value) {
		setConstString(offset + 26, $inherited_src_no, value);
	}


	/**
	 * Supplier 発注先.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 27, $sppl_cd);
	}

	/**
	 * Supplier 発注先.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 27, $sppl_cd, value);
	}


	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 28, $sppl_nm);
	}

	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 28, $sppl_nm, value);
	}


	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public boolean subcon_flg() {
		return getConstBoolean(offset + 29, $subcon_flg);
	}

	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public void subcon_flg(boolean value) {
		setConstBoolean(offset + 29, $subcon_flg, value);
	}


	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public boolean repurc_obli_flg() {
		return getConstBoolean(offset + 30, $repurc_obli_flg);
	}

	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public void repurc_obli_flg(boolean value) {
		setConstBoolean(offset + 30, $repurc_obli_flg, value);
	}


	/**
	 * Subcontracting unit price type 外注単価区分.<p>
	 *
	 */
	public String outsrc_upri_typ() {
		return getConstString(offset + 31, $outsrc_upri_typ);
	}

	/**
	 * Subcontracting unit price type 外注単価区分.<p>
	 *
	 */
	public void outsrc_upri_typ(String value) {
		setConstString(offset + 31, $outsrc_upri_typ, value);
	}


	/**
	 * Delivery destination identification type 納入先識別区分.<p>
	 *
	 */
	public String in_to_id_typ() {
		return getConstString(offset + 32, $in_to_id_typ);
	}

	/**
	 * Delivery destination identification type 納入先識別区分.<p>
	 *
	 */
	public void in_to_id_typ(String value) {
		setConstString(offset + 32, $in_to_id_typ, value);
	}


	/**
	 * Delivery destination identification type name 納入先識別区分名.<p>
	 *
	 */
	public String in_to_id_typ_nm() {
		return getConstString(offset + 33, $in_to_id_typ_nm);
	}

	/**
	 * Delivery destination identification type name 納入先識別区分名.<p>
	 *
	 */
	public void in_to_id_typ_nm(String value) {
		setConstString(offset + 33, $in_to_id_typ_nm, value);
	}


	/**
	 * Delivery destination identification cd. 納入先識別ＣＤ.<p>
	 *
	 */
	public String in_to_id_cd() {
		return getConstString(offset + 34, $in_to_id_cd);
	}

	/**
	 * Delivery destination identification cd. 納入先識別ＣＤ.<p>
	 *
	 */
	public void in_to_id_cd(String value) {
		setConstString(offset + 34, $in_to_id_cd, value);
	}


	/**
	 * Delivery destination identification name 納入先識別名.<p>
	 *
	 */
	public String in_to_id_nm() {
		return getConstString(offset + 35, $in_to_id_nm);
	}

	/**
	 * Delivery destination identification name 納入先識別名.<p>
	 *
	 */
	public void in_to_id_nm(String value) {
		setConstString(offset + 35, $in_to_id_nm, value);
	}


	public String in_to_id_cd_dmy() {
		return getConstString(offset + 36, $in_to_id_cd_dmy);
	}

	public void in_to_id_cd_dmy(String value) {
		setConstString(offset + 36, $in_to_id_cd_dmy, value);
	}


	public mcframe.clientMAUB.MAUBP0410.AddrR sppl_addr_p(){
		return (mcframe.clientMAUB.MAUBP0410.AddrR) getConstInnerRow(offset + 37, $sppl_addr_p);
	}
	
	public void sppl_addr_p(mcframe.clientMAUB.MAUBP0410.AddrR row){
		setConstInnerRow(offset + 37, $sppl_addr_p, row);
	}


	/**
	 * For invoice transaction インボイス取引対象.<p>
	 *
	 */
	public boolean sppl_iv_flg() {
		return getConstBoolean(offset + 38, $sppl_iv_flg);
	}

	/**
	 * For invoice transaction インボイス取引対象.<p>
	 *
	 */
	public void sppl_iv_flg(boolean value) {
		setConstBoolean(offset + 38, $sppl_iv_flg, value);
	}


	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public String ap_dpt_cd() {
		return getConstString(offset + 39, $ap_dpt_cd);
	}

	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public void ap_dpt_cd(String value) {
		setConstString(offset + 39, $ap_dpt_cd, value);
	}


	/**
	 * Master AP dept. cd. マスタ債務部門ＣＤ.<p>
	 *
	 */
	public String mst_ap_dpt_cd() {
		return getConstString(offset + 40, $mst_ap_dpt_cd);
	}

	/**
	 * Master AP dept. cd. マスタ債務部門ＣＤ.<p>
	 *
	 */
	public void mst_ap_dpt_cd(String value) {
		setConstString(offset + 40, $mst_ap_dpt_cd, value);
	}


	/**
	 * Payment per transaction 都度支払.<p>
	 *
	 */
	public boolean pay_spot_flg() {
		return getConstBoolean(offset + 41, $pay_spot_flg);
	}

	/**
	 * Payment per transaction 都度支払.<p>
	 *
	 */
	public void pay_spot_flg(boolean value) {
		setConstBoolean(offset + 41, $pay_spot_flg, value);
	}


	/**
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public String prnt_lcl_cd() {
		return getConstString(offset + 42, $prnt_lcl_cd);
	}

	/**
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public void prnt_lcl_cd(String value) {
		setConstString(offset + 42, $prnt_lcl_cd, value);
	}


	/**
	 * Purchase tax calculation type 仕入税計算区分.<p>
	 *
	 */
	public String purc_tax_calc_typ() {
		return getConstString(offset + 43, $purc_tax_calc_typ);
	}

	/**
	 * Purchase tax calculation type 仕入税計算区分.<p>
	 *
	 */
	public void purc_tax_calc_typ(String value) {
		setConstString(offset + 43, $purc_tax_calc_typ, value);
	}


	/**
	 * Delivery location WG cd. 納入場所ＷＧ ＣＤ.<p>
	 *
	 */
	public String dlv_loc_wg_cd() {
		return getConstString(offset + 44, $dlv_loc_wg_cd);
	}

	/**
	 * Delivery location WG cd. 納入場所ＷＧ ＣＤ.<p>
	 *
	 */
	public void dlv_loc_wg_cd(String value) {
		setConstString(offset + 44, $dlv_loc_wg_cd, value);
	}


	public mcframe.clientMAUB.MAUBP0320.UsrDptR purc_usr_dpt_p(){
		return (mcframe.clientMAUB.MAUBP0320.UsrDptR) getConstInnerRow(offset + 45, $purc_usr_dpt_p);
	}
	
	public void purc_usr_dpt_p(mcframe.clientMAUB.MAUBP0320.UsrDptR row){
		setConstInnerRow(offset + 45, $purc_usr_dpt_p, row);
	}


	/**
	 * Default purchasing PIC cd. デフォルト購買担当者ＣＤ.<p>
	 *
	 */
	public String def_purc_usr_cd() {
		return getConstString(offset + 46, $def_purc_usr_cd);
	}

	/**
	 * Default purchasing PIC cd. デフォルト購買担当者ＣＤ.<p>
	 *
	 */
	public void def_purc_usr_cd(String value) {
		setConstString(offset + 46, $def_purc_usr_cd, value);
	}


	/**
	 * Default purchasing dept. cd. デフォルト購買部門ＣＤ.<p>
	 *
	 */
	public String def_purc_dpt_cd() {
		return getConstString(offset + 47, $def_purc_dpt_cd);
	}

	/**
	 * Default purchasing dept. cd. デフォルト購買部門ＣＤ.<p>
	 *
	 */
	public void def_purc_dpt_cd(String value) {
		setConstString(offset + 47, $def_purc_dpt_cd, value);
	}


	/**
	 * AP dept. 債務部門.<p>
	 *
	 */
	public boolean ap_dpt_flg() {
		return getConstBoolean(offset + 48, $ap_dpt_flg);
	}

	/**
	 * AP dept. 債務部門.<p>
	 *
	 */
	public void ap_dpt_flg(boolean value) {
		setConstBoolean(offset + 48, $ap_dpt_flg, value);
	}


	/**
	 * WG cd. ＷＧ ＣＤ.<p>
	 *
	 */
	public String purc_dpt_wg_cd() {
		return getConstString(offset + 49, $purc_dpt_wg_cd);
	}

	/**
	 * WG cd. ＷＧ ＣＤ.<p>
	 *
	 */
	public void purc_dpt_wg_cd(String value) {
		setConstString(offset + 49, $purc_dpt_wg_cd, value);
	}


	/**
	 * WG name ＷＧ名.<p>
	 *
	 */
	public String purc_dpt_wg_nm() {
		return getConstString(offset + 50, $purc_dpt_wg_nm);
	}

	/**
	 * WG name ＷＧ名.<p>
	 *
	 */
	public void purc_dpt_wg_nm(String value) {
		setConstString(offset + 50, $purc_dpt_wg_nm, value);
	}


	/**
	 * Transportation method cd. 輸送方法ＣＤ.<p>
	 *
	 */
	public String trnspt_cd() {
		return getConstString(offset + 51, $trnspt_cd);
	}

	/**
	 * Transportation method cd. 輸送方法ＣＤ.<p>
	 *
	 */
	public void trnspt_cd(String value) {
		setConstString(offset + 51, $trnspt_cd, value);
	}


	/**
	 * Transportation method name 輸送方法名.<p>
	 *
	 */
	public String trnspt_nm() {
		return getConstString(offset + 52, $trnspt_nm);
	}

	/**
	 * Transportation method name 輸送方法名.<p>
	 *
	 */
	public void trnspt_nm(String value) {
		setConstString(offset + 52, $trnspt_nm, value);
	}


	/**
	 * Ship/flight name 船名／便名.<p>
	 *
	 */
	public String vssl_flght() {
		return getConstString(offset + 53, $vssl_flght);
	}

	/**
	 * Ship/flight name 船名／便名.<p>
	 *
	 */
	public void vssl_flght(String value) {
		setConstString(offset + 53, $vssl_flght, value);
	}


	/**
	 * Loading port cd. 船積港ＣＤ.<p>
	 *
	 */
	public String load_port_cd() {
		return getConstString(offset + 54, $load_port_cd);
	}

	/**
	 * Loading port cd. 船積港ＣＤ.<p>
	 *
	 */
	public void load_port_cd(String value) {
		setConstString(offset + 54, $load_port_cd, value);
	}


	/**
	 * Loading port name 船積港名.<p>
	 *
	 */
	public String load_port_nm() {
		return getConstString(offset + 55, $load_port_nm);
	}

	/**
	 * Loading port name 船積港名.<p>
	 *
	 */
	public void load_port_nm(String value) {
		setConstString(offset + 55, $load_port_nm, value);
	}


	/**
	 * Estimated date of loading 船積予定日.<p>
	 *
	 */
	public MCDate etd_dt() {
		return getConstDate(offset + 56, $etd_dt);
	}

	/**
	 * Estimated date of loading 船積予定日.<p>
	 *
	 */
	public void etd_dt(MCDate value) {
		setConstDate(offset + 56, $etd_dt, value);
	}


	/**
	 * Unloading port cd. 船卸港ＣＤ.<p>
	 *
	 */
	public String dschrg_port_cd() {
		return getConstString(offset + 57, $dschrg_port_cd);
	}

	/**
	 * Unloading port cd. 船卸港ＣＤ.<p>
	 *
	 */
	public void dschrg_port_cd(String value) {
		setConstString(offset + 57, $dschrg_port_cd, value);
	}


	/**
	 * Unloading port name 船卸港名.<p>
	 *
	 */
	public String dschrg_port_nm() {
		return getConstString(offset + 58, $dschrg_port_nm);
	}

	/**
	 * Unloading port name 船卸港名.<p>
	 *
	 */
	public void dschrg_port_nm(String value) {
		setConstString(offset + 58, $dschrg_port_nm, value);
	}


	/**
	 * Estimated date of unloading 船卸予定日.<p>
	 *
	 */
	public MCDate eta_dt() {
		return getConstDate(offset + 59, $eta_dt);
	}

	/**
	 * Estimated date of unloading 船卸予定日.<p>
	 *
	 */
	public void eta_dt(MCDate value) {
		setConstDate(offset + 59, $eta_dt, value);
	}


	/**
	 * Stopover point cd. 経由地ＣＤ.<p>
	 *
	 */
	public String via_port_cd() {
		return getConstString(offset + 60, $via_port_cd);
	}

	/**
	 * Stopover point cd. 経由地ＣＤ.<p>
	 *
	 */
	public void via_port_cd(String value) {
		setConstString(offset + 60, $via_port_cd, value);
	}


	/**
	 * Stopover point name 経由地名.<p>
	 *
	 */
	public String via_port_nm() {
		return getConstString(offset + 61, $via_port_nm);
	}

	/**
	 * Stopover point name 経由地名.<p>
	 *
	 */
	public void via_port_nm(String value) {
		setConstString(offset + 61, $via_port_nm, value);
	}


	/**
	 * Estimated stopover date 経由予定日.<p>
	 *
	 */
	public MCDate via_schd_dt() {
		return getConstDate(offset + 62, $via_schd_dt);
	}

	/**
	 * Estimated stopover date 経由予定日.<p>
	 *
	 */
	public void via_schd_dt(MCDate value) {
		setConstDate(offset + 62, $via_schd_dt, value);
	}


	/**
	 * Transaction terms 1 取引条件１.<p>
	 *
	 */
	public String tterm_cd1() {
		return getConstString(offset + 63, $tterm_cd1);
	}

	/**
	 * Transaction terms 1 取引条件１.<p>
	 *
	 */
	public void tterm_cd1(String value) {
		setConstString(offset + 63, $tterm_cd1, value);
	}


	/**
	 * Transaction terms name 1 取引条件名１.<p>
	 *
	 */
	public String tterm_nm1() {
		return getConstString(offset + 64, $tterm_nm1);
	}

	/**
	 * Transaction terms name 1 取引条件名１.<p>
	 *
	 */
	public void tterm_nm1(String value) {
		setConstString(offset + 64, $tterm_nm1, value);
	}


	/**
	 * Transaction terms remarks 1 取引条件備考１.<p>
	 *
	 */
	public String tterm_rmrks1() {
		return getConstString(offset + 65, $tterm_rmrks1);
	}

	/**
	 * Transaction terms remarks 1 取引条件備考１.<p>
	 *
	 */
	public void tterm_rmrks1(String value) {
		setConstString(offset + 65, $tterm_rmrks1, value);
	}


	/**
	 * Transaction terms 2 取引条件２.<p>
	 *
	 */
	public String tterm_cd2() {
		return getConstString(offset + 66, $tterm_cd2);
	}

	/**
	 * Transaction terms 2 取引条件２.<p>
	 *
	 */
	public void tterm_cd2(String value) {
		setConstString(offset + 66, $tterm_cd2, value);
	}


	/**
	 * Transaction terms name 2 取引条件名２.<p>
	 *
	 */
	public String tterm_nm2() {
		return getConstString(offset + 67, $tterm_nm2);
	}

	/**
	 * Transaction terms name 2 取引条件名２.<p>
	 *
	 */
	public void tterm_nm2(String value) {
		setConstString(offset + 67, $tterm_nm2, value);
	}


	/**
	 * Transaction terms remarks 2 取引条件備考２.<p>
	 *
	 */
	public String tterm_rmrks2() {
		return getConstString(offset + 68, $tterm_rmrks2);
	}

	/**
	 * Transaction terms remarks 2 取引条件備考２.<p>
	 *
	 */
	public void tterm_rmrks2(String value) {
		setConstString(offset + 68, $tterm_rmrks2, value);
	}


	/**
	 * Transaction terms 3 取引条件３.<p>
	 *
	 */
	public String tterm_cd3() {
		return getConstString(offset + 69, $tterm_cd3);
	}

	/**
	 * Transaction terms 3 取引条件３.<p>
	 *
	 */
	public void tterm_cd3(String value) {
		setConstString(offset + 69, $tterm_cd3, value);
	}


	/**
	 * Transaction terms name 3 取引条件名３.<p>
	 *
	 */
	public String tterm_nm3() {
		return getConstString(offset + 70, $tterm_nm3);
	}

	/**
	 * Transaction terms name 3 取引条件名３.<p>
	 *
	 */
	public void tterm_nm3(String value) {
		setConstString(offset + 70, $tterm_nm3, value);
	}


	/**
	 * Transaction terms remarks 3 取引条件備考３.<p>
	 *
	 */
	public String tterm_rmrks3() {
		return getConstString(offset + 71, $tterm_rmrks3);
	}

	/**
	 * Transaction terms remarks 3 取引条件備考３.<p>
	 *
	 */
	public void tterm_rmrks3(String value) {
		setConstString(offset + 71, $tterm_rmrks3, value);
	}


	/**
	 * Currency 通貨.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 72, $trd_cur_cd);
	}

	/**
	 * Currency 通貨.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 72, $trd_cur_cd, value);
	}


	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 73, $trd_cur_nm);
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 73, $trd_cur_nm, value);
	}


	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_cur_upri_dec_place() {
		return getConstNumber(offset + 74, $trd_cur_upri_dec_place);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(MCNumber value) {
		setConstNumber(offset + 74, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(int value) {
		setConstNumber(offset + 74, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(long value) {
		setConstNumber(offset + 74, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(float value) {
		setConstNumber(offset + 74, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(double value) {
		setConstNumber(offset + 74, $trd_cur_upri_dec_place, value);
	}


	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_cur_amt_dec_place() {
		return getConstNumber(offset + 75, $trd_cur_amt_dec_place);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 75, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(int value) {
		setConstNumber(offset + 75, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(long value) {
		setConstNumber(offset + 75, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(float value) {
		setConstNumber(offset + 75, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(double value) {
		setConstNumber(offset + 75, $trd_cur_amt_dec_place, value);
	}


	/**
	 * Currency cd. at PO 発注時通貨ＣＤ.<p>
	 *
	 */
	public String src_trd_cur_cd() {
		return getConstString(offset + 76, $src_trd_cur_cd);
	}

	/**
	 * Currency cd. at PO 発注時通貨ＣＤ.<p>
	 *
	 */
	public void src_trd_cur_cd(String value) {
		setConstString(offset + 76, $src_trd_cur_cd, value);
	}


	/**
	 * Set scheduled rate 予定レート指定.<p>
	 *
	 */
	public boolean xrate_inpt_flg() {
		return getConstBoolean(offset + 77, $xrate_inpt_flg);
	}

	/**
	 * Set scheduled rate 予定レート指定.<p>
	 *
	 */
	public void xrate_inpt_flg(boolean value) {
		setConstBoolean(offset + 77, $xrate_inpt_flg, value);
	}


	/**
	 * Purchase exchange rate cd. 仕入為替レートＣＤ.<p>
	 *
	 */
	public String purc_xrate_cd() {
		return getConstString(offset + 78, $purc_xrate_cd);
	}

	/**
	 * Purchase exchange rate cd. 仕入為替レートＣＤ.<p>
	 *
	 */
	public void purc_xrate_cd(String value) {
		setConstString(offset + 78, $purc_xrate_cd, value);
	}


	public mcframe.clientMAUB.MAUBP0420.XrateR xrate_p(){
		return (mcframe.clientMAUB.MAUBP0420.XrateR) getConstInnerRow(offset + 79, $xrate_p);
	}
	
	public void xrate_p(mcframe.clientMAUB.MAUBP0420.XrateR row){
		setConstInnerRow(offset + 79, $xrate_p, row);
	}


	public MCNumber src_xrate() {
		return getConstNumber(offset + 80, $src_xrate);
	}

	public void src_xrate(MCNumber value) {
		setConstNumber(offset + 80, $src_xrate, value);
	}

	public void src_xrate(int value) {
		setConstNumber(offset + 80, $src_xrate, value);
	}

	public void src_xrate(long value) {
		setConstNumber(offset + 80, $src_xrate, value);
	}

	public void src_xrate(float value) {
		setConstNumber(offset + 80, $src_xrate, value);
	}

	public void src_xrate(double value) {
		setConstNumber(offset + 80, $src_xrate, value);
	}


	/**
	 * Base currency 基準通貨.<p>
	 *
	 */
	public String base_cur_cd() {
		return getConstString(offset + 81, $base_cur_cd);
	}

	/**
	 * Base currency 基準通貨.<p>
	 *
	 */
	public void base_cur_cd(String value) {
		setConstString(offset + 81, $base_cur_cd, value);
	}


	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public String base_cur_nm() {
		return getConstString(offset + 82, $base_cur_nm);
	}

	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public void base_cur_nm(String value) {
		setConstString(offset + 82, $base_cur_nm, value);
	}


	/**
	 * Unit price number of decimal places (Base currency) 単価小数部有効桁数（基準通貨）.<p>
	 *
	 */
	public MCNumber base_cur_upri_dec_place() {
		return getConstNumber(offset + 83, $base_cur_upri_dec_place);
	}

	/**
	 * Unit price number of decimal places (Base currency) 単価小数部有効桁数（基準通貨）.<p>
	 *
	 */
	public void base_cur_upri_dec_place(MCNumber value) {
		setConstNumber(offset + 83, $base_cur_upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places (Base currency) 単価小数部有効桁数（基準通貨）.<p>
	 *
	 */
	public void base_cur_upri_dec_place(int value) {
		setConstNumber(offset + 83, $base_cur_upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places (Base currency) 単価小数部有効桁数（基準通貨）.<p>
	 *
	 */
	public void base_cur_upri_dec_place(long value) {
		setConstNumber(offset + 83, $base_cur_upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places (Base currency) 単価小数部有効桁数（基準通貨）.<p>
	 *
	 */
	public void base_cur_upri_dec_place(float value) {
		setConstNumber(offset + 83, $base_cur_upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places (Base currency) 単価小数部有効桁数（基準通貨）.<p>
	 *
	 */
	public void base_cur_upri_dec_place(double value) {
		setConstNumber(offset + 83, $base_cur_upri_dec_place, value);
	}


	/**
	 * Amount number of decimal places (Base currency) 金額小数部有効桁数（基準通貨）.<p>
	 *
	 */
	public MCNumber base_cur_amt_dec_place() {
		return getConstNumber(offset + 84, $base_cur_amt_dec_place);
	}

	/**
	 * Amount number of decimal places (Base currency) 金額小数部有効桁数（基準通貨）.<p>
	 *
	 */
	public void base_cur_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 84, $base_cur_amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places (Base currency) 金額小数部有効桁数（基準通貨）.<p>
	 *
	 */
	public void base_cur_amt_dec_place(int value) {
		setConstNumber(offset + 84, $base_cur_amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places (Base currency) 金額小数部有効桁数（基準通貨）.<p>
	 *
	 */
	public void base_cur_amt_dec_place(long value) {
		setConstNumber(offset + 84, $base_cur_amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places (Base currency) 金額小数部有効桁数（基準通貨）.<p>
	 *
	 */
	public void base_cur_amt_dec_place(float value) {
		setConstNumber(offset + 84, $base_cur_amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places (Base currency) 金額小数部有効桁数（基準通貨）.<p>
	 *
	 */
	public void base_cur_amt_dec_place(double value) {
		setConstNumber(offset + 84, $base_cur_amt_dec_place, value);
	}


	/**
	 * Tax currency 納税通貨.<p>
	 *
	 */
	public String ptax_cur_cd() {
		return getConstString(offset + 85, $ptax_cur_cd);
	}

	/**
	 * Tax currency 納税通貨.<p>
	 *
	 */
	public void ptax_cur_cd(String value) {
		setConstString(offset + 85, $ptax_cur_cd, value);
	}


	/**
	 * Tax currency name 納税通貨名.<p>
	 *
	 */
	public String ptax_cur_nm() {
		return getConstString(offset + 86, $ptax_cur_nm);
	}

	/**
	 * Tax currency name 納税通貨名.<p>
	 *
	 */
	public void ptax_cur_nm(String value) {
		setConstString(offset + 86, $ptax_cur_nm, value);
	}


	/**
	 * Unit price number of decimal places (Base currency) 単価小数部有効桁数（基準通貨）.<p>
	 *
	 */
	public MCNumber ptax_cur_upri_dec_place() {
		return getConstNumber(offset + 87, $ptax_cur_upri_dec_place);
	}

	/**
	 * Unit price number of decimal places (Base currency) 単価小数部有効桁数（基準通貨）.<p>
	 *
	 */
	public void ptax_cur_upri_dec_place(MCNumber value) {
		setConstNumber(offset + 87, $ptax_cur_upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places (Base currency) 単価小数部有効桁数（基準通貨）.<p>
	 *
	 */
	public void ptax_cur_upri_dec_place(int value) {
		setConstNumber(offset + 87, $ptax_cur_upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places (Base currency) 単価小数部有効桁数（基準通貨）.<p>
	 *
	 */
	public void ptax_cur_upri_dec_place(long value) {
		setConstNumber(offset + 87, $ptax_cur_upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places (Base currency) 単価小数部有効桁数（基準通貨）.<p>
	 *
	 */
	public void ptax_cur_upri_dec_place(float value) {
		setConstNumber(offset + 87, $ptax_cur_upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places (Base currency) 単価小数部有効桁数（基準通貨）.<p>
	 *
	 */
	public void ptax_cur_upri_dec_place(double value) {
		setConstNumber(offset + 87, $ptax_cur_upri_dec_place, value);
	}


	/**
	 * Amount number of decimal places (Base currency) 金額小数部有効桁数（基準通貨）.<p>
	 *
	 */
	public MCNumber ptax_cur_amt_dec_place() {
		return getConstNumber(offset + 88, $ptax_cur_amt_dec_place);
	}

	/**
	 * Amount number of decimal places (Base currency) 金額小数部有効桁数（基準通貨）.<p>
	 *
	 */
	public void ptax_cur_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 88, $ptax_cur_amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places (Base currency) 金額小数部有効桁数（基準通貨）.<p>
	 *
	 */
	public void ptax_cur_amt_dec_place(int value) {
		setConstNumber(offset + 88, $ptax_cur_amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places (Base currency) 金額小数部有効桁数（基準通貨）.<p>
	 *
	 */
	public void ptax_cur_amt_dec_place(long value) {
		setConstNumber(offset + 88, $ptax_cur_amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places (Base currency) 金額小数部有効桁数（基準通貨）.<p>
	 *
	 */
	public void ptax_cur_amt_dec_place(float value) {
		setConstNumber(offset + 88, $ptax_cur_amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places (Base currency) 金額小数部有効桁数（基準通貨）.<p>
	 *
	 */
	public void ptax_cur_amt_dec_place(double value) {
		setConstNumber(offset + 88, $ptax_cur_amt_dec_place, value);
	}


	/**
	 * Taxpaying date 納税日.<p>
	 *
	 */
	public MCDate ptax_dt() {
		return getConstDate(offset + 89, $ptax_dt);
	}

	/**
	 * Taxpaying date 納税日.<p>
	 *
	 */
	public void ptax_dt(MCDate value) {
		setConstDate(offset + 89, $ptax_dt, value);
	}


	/**
	 * Set tax schedule rate 納税予定レート指定.<p>
	 *
	 */
	public boolean ptax_xrate_inpt_flg() {
		return getConstBoolean(offset + 90, $ptax_xrate_inpt_flg);
	}

	/**
	 * Set tax schedule rate 納税予定レート指定.<p>
	 *
	 */
	public void ptax_xrate_inpt_flg(boolean value) {
		setConstBoolean(offset + 90, $ptax_xrate_inpt_flg, value);
	}


	public mcframe.clientMAUB.MAUBP0420.XrateR ptax_xrate_p(){
		return (mcframe.clientMAUB.MAUBP0420.XrateR) getConstInnerRow(offset + 91, $ptax_xrate_p);
	}
	
	public void ptax_xrate_p(mcframe.clientMAUB.MAUBP0420.XrateR row){
		setConstInnerRow(offset + 91, $ptax_xrate_p, row);
	}


	public MCNumber src_ptax_xrate() {
		return getConstNumber(offset + 92, $src_ptax_xrate);
	}

	public void src_ptax_xrate(MCNumber value) {
		setConstNumber(offset + 92, $src_ptax_xrate, value);
	}

	public void src_ptax_xrate(int value) {
		setConstNumber(offset + 92, $src_ptax_xrate, value);
	}

	public void src_ptax_xrate(long value) {
		setConstNumber(offset + 92, $src_ptax_xrate, value);
	}

	public void src_ptax_xrate(float value) {
		setConstNumber(offset + 92, $src_ptax_xrate, value);
	}

	public void src_ptax_xrate(double value) {
		setConstNumber(offset + 92, $src_ptax_xrate, value);
	}


	/**
	 * Rounding type (Purchase amount) 仕入金額端数処理区分.<p>
	 *
	 */
	public String purc_amt_rnd_typ() {
		return getConstString(offset + 93, $purc_amt_rnd_typ);
	}

	/**
	 * Rounding type (Purchase amount) 仕入金額端数処理区分.<p>
	 *
	 */
	public void purc_amt_rnd_typ(String value) {
		setConstString(offset + 93, $purc_amt_rnd_typ, value);
	}


	/**
	 * Purchase tax rounding type 仕入税端数処理区分.<p>
	 *
	 */
	public String purc_tax_rnd_typ() {
		return getConstString(offset + 94, $purc_tax_rnd_typ);
	}

	/**
	 * Purchase tax rounding type 仕入税端数処理区分.<p>
	 *
	 */
	public void purc_tax_rnd_typ(String value) {
		setConstString(offset + 94, $purc_tax_rnd_typ, value);
	}


	/**
	 * Purchase tax priority flg. 仕入税優先ＦＬＧ.<p>
	 *
	 */
	public boolean purc_tax_cd_prio_flg() {
		return getConstBoolean(offset + 95, $purc_tax_cd_prio_flg);
	}

	/**
	 * Purchase tax priority flg. 仕入税優先ＦＬＧ.<p>
	 *
	 */
	public void purc_tax_cd_prio_flg(boolean value) {
		setConstBoolean(offset + 95, $purc_tax_cd_prio_flg, value);
	}


	/**
	 * Standard payment carry-over count 標準支払繰越回数.<p>
	 *
	 */
	public MCNumber pay_crryovr_times() {
		return getConstNumber(offset + 96, $pay_crryovr_times);
	}

	/**
	 * Standard payment carry-over count 標準支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(MCNumber value) {
		setConstNumber(offset + 96, $pay_crryovr_times, value);
	}

	/**
	 * Standard payment carry-over count 標準支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(int value) {
		setConstNumber(offset + 96, $pay_crryovr_times, value);
	}

	/**
	 * Standard payment carry-over count 標準支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(long value) {
		setConstNumber(offset + 96, $pay_crryovr_times, value);
	}

	/**
	 * Standard payment carry-over count 標準支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(float value) {
		setConstNumber(offset + 96, $pay_crryovr_times, value);
	}

	/**
	 * Standard payment carry-over count 標準支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(double value) {
		setConstNumber(offset + 96, $pay_crryovr_times, value);
	}


	/**
	 * Allow purchasing unit price change flg. 購買単価変更許可ＦＬＧ.<p>
	 *
	 */
	public boolean purc_upri_cng_flg() {
		return getConstBoolean(offset + 97, $purc_upri_cng_flg);
	}

	/**
	 * Allow purchasing unit price change flg. 購買単価変更許可ＦＬＧ.<p>
	 *
	 */
	public void purc_upri_cng_flg(boolean value) {
		setConstBoolean(offset + 97, $purc_upri_cng_flg, value);
	}


	/**
	 * Purchase lot details split type 仕入ロット明細分割区分.<p>
	 *
	 */
	public String purc_slip_each_lot_typ() {
		return getConstString(offset + 98, $purc_slip_each_lot_typ);
	}

	/**
	 * Purchase lot details split type 仕入ロット明細分割区分.<p>
	 *
	 */
	public void purc_slip_each_lot_typ(String value) {
		setConstString(offset + 98, $purc_slip_each_lot_typ, value);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR trd_cur_amt_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 99, $trd_cur_amt_p);
	}
	
	public void trd_cur_amt_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 99, $trd_cur_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR trd_cur_inc_tax_amt_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 100, $trd_cur_inc_tax_amt_p);
	}
	
	public void trd_cur_inc_tax_amt_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 100, $trd_cur_inc_tax_amt_p, row);
	}


	/**
	 * AP supplier 買掛先.<p>
	 *
	 */
	public String asppl_cd() {
		return getConstString(offset + 101, $asppl_cd);
	}

	/**
	 * AP supplier 買掛先.<p>
	 *
	 */
	public void asppl_cd(String value) {
		setConstString(offset + 101, $asppl_cd, value);
	}


	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public String asppl_nm() {
		return getConstString(offset + 102, $asppl_nm);
	}

	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public void asppl_nm(String value) {
		setConstString(offset + 102, $asppl_nm, value);
	}


	/**
	 * EDI ＥＤＩ.<p>
	 *
	 */
	public boolean edi_flg() {
		return getConstBoolean(offset + 103, $edi_flg);
	}

	/**
	 * EDI ＥＤＩ.<p>
	 *
	 */
	public void edi_flg(boolean value) {
		setConstBoolean(offset + 103, $edi_flg, value);
	}


	/**
	 * Purchase I/V remarks 受領Ｉ／Ｖ備考.<p>
	 *
	 */
	public String rcpt_iv_rmrks() {
		return getConstString(offset + 104, $rcpt_iv_rmrks);
	}

	/**
	 * Purchase I/V remarks 受領Ｉ／Ｖ備考.<p>
	 *
	 */
	public void rcpt_iv_rmrks(String value) {
		setConstString(offset + 104, $rcpt_iv_rmrks, value);
	}


	/**
	 * Purchase I/V internal remarks 受領Ｉ／Ｖ内部備考.<p>
	 *
	 */
	public String rcpt_iv_intr_rmrks() {
		return getConstString(offset + 105, $rcpt_iv_intr_rmrks);
	}

	/**
	 * Purchase I/V internal remarks 受領Ｉ／Ｖ内部備考.<p>
	 *
	 */
	public void rcpt_iv_intr_rmrks(String value) {
		setConstString(offset + 105, $rcpt_iv_intr_rmrks, value);
	}


	/**
	 * Purchase I/V spare 1 受領Ｉ／Ｖ予備１.<p>
	 *
	 */
	public String rcpt_iv_sub_char1() {
		return getConstString(offset + 106, $rcpt_iv_sub_char1);
	}

	/**
	 * Purchase I/V spare 1 受領Ｉ／Ｖ予備１.<p>
	 *
	 */
	public void rcpt_iv_sub_char1(String value) {
		setConstString(offset + 106, $rcpt_iv_sub_char1, value);
	}


	/**
	 * Purchase I/V spare 2 受領Ｉ／Ｖ予備２.<p>
	 *
	 */
	public String rcpt_iv_sub_char2() {
		return getConstString(offset + 107, $rcpt_iv_sub_char2);
	}

	/**
	 * Purchase I/V spare 2 受領Ｉ／Ｖ予備２.<p>
	 *
	 */
	public void rcpt_iv_sub_char2(String value) {
		setConstString(offset + 107, $rcpt_iv_sub_char2, value);
	}


	/**
	 * Purchase I/V spare 3 受領Ｉ／Ｖ予備３.<p>
	 *
	 */
	public String rcpt_iv_sub_char3() {
		return getConstString(offset + 108, $rcpt_iv_sub_char3);
	}

	/**
	 * Purchase I/V spare 3 受領Ｉ／Ｖ予備３.<p>
	 *
	 */
	public void rcpt_iv_sub_char3(String value) {
		setConstString(offset + 108, $rcpt_iv_sub_char3, value);
	}


	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return getConstString(offset + 109, $trd_rmrks);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		setConstString(offset + 109, $trd_rmrks, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 110, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 110, $intr_rmrks, value);
	}


	/**
	 * PO sheet remarks 注文書備考.<p>
	 *
	 */
	public String po_print_rmrks() {
		return getConstString(offset + 111, $po_print_rmrks);
	}

	/**
	 * PO sheet remarks 注文書備考.<p>
	 *
	 */
	public void po_print_rmrks(String value) {
		setConstString(offset + 111, $po_print_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 112, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 112, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 113, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 113, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 114, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 114, $sub_char3, value);
	}


	/**
	 * Update counter (Purchase result header) 更新カウンタ（仕入実績ヘッダ）.<p>
	 *
	 */
	public MCNumber purc_act_upd_cntr() {
		return getConstNumber(offset + 115, $purc_act_upd_cntr);
	}

	/**
	 * Update counter (Purchase result header) 更新カウンタ（仕入実績ヘッダ）.<p>
	 *
	 */
	public void purc_act_upd_cntr(MCNumber value) {
		setConstNumber(offset + 115, $purc_act_upd_cntr, value);
	}

	/**
	 * Update counter (Purchase result header) 更新カウンタ（仕入実績ヘッダ）.<p>
	 *
	 */
	public void purc_act_upd_cntr(int value) {
		setConstNumber(offset + 115, $purc_act_upd_cntr, value);
	}

	/**
	 * Update counter (Purchase result header) 更新カウンタ（仕入実績ヘッダ）.<p>
	 *
	 */
	public void purc_act_upd_cntr(long value) {
		setConstNumber(offset + 115, $purc_act_upd_cntr, value);
	}

	/**
	 * Update counter (Purchase result header) 更新カウンタ（仕入実績ヘッダ）.<p>
	 *
	 */
	public void purc_act_upd_cntr(float value) {
		setConstNumber(offset + 115, $purc_act_upd_cntr, value);
	}

	/**
	 * Update counter (Purchase result header) 更新カウンタ（仕入実績ヘッダ）.<p>
	 *
	 */
	public void purc_act_upd_cntr(double value) {
		setConstNumber(offset + 115, $purc_act_upd_cntr, value);
	}


	/**
	 * Update counter (Purchase invoice header) 更新カウンタ（受領インボイスヘッダ）.<p>
	 *
	 */
	public MCNumber rcpt_iv_upd_cntr() {
		return getConstNumber(offset + 116, $rcpt_iv_upd_cntr);
	}

	/**
	 * Update counter (Purchase invoice header) 更新カウンタ（受領インボイスヘッダ）.<p>
	 *
	 */
	public void rcpt_iv_upd_cntr(MCNumber value) {
		setConstNumber(offset + 116, $rcpt_iv_upd_cntr, value);
	}

	/**
	 * Update counter (Purchase invoice header) 更新カウンタ（受領インボイスヘッダ）.<p>
	 *
	 */
	public void rcpt_iv_upd_cntr(int value) {
		setConstNumber(offset + 116, $rcpt_iv_upd_cntr, value);
	}

	/**
	 * Update counter (Purchase invoice header) 更新カウンタ（受領インボイスヘッダ）.<p>
	 *
	 */
	public void rcpt_iv_upd_cntr(long value) {
		setConstNumber(offset + 116, $rcpt_iv_upd_cntr, value);
	}

	/**
	 * Update counter (Purchase invoice header) 更新カウンタ（受領インボイスヘッダ）.<p>
	 *
	 */
	public void rcpt_iv_upd_cntr(float value) {
		setConstNumber(offset + 116, $rcpt_iv_upd_cntr, value);
	}

	/**
	 * Update counter (Purchase invoice header) 更新カウンタ（受領インボイスヘッダ）.<p>
	 *
	 */
	public void rcpt_iv_upd_cntr(double value) {
		setConstNumber(offset + 116, $rcpt_iv_upd_cntr, value);
	}


	/**
	 * Invoice entered インボイス登録済.<p>
	 *
	 */
	public boolean iv_reg_flg() {
		return getConstBoolean(offset + 117, $iv_reg_flg);
	}

	/**
	 * Invoice entered インボイス登録済.<p>
	 *
	 */
	public void iv_reg_flg(boolean value) {
		setConstBoolean(offset + 117, $iv_reg_flg, value);
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 118, $cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 118, $cst_cd, value);
	}


	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public String cst_nm() {
		return getConstString(offset + 119, $cst_nm);
	}

	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public void cst_nm(String value) {
		setConstString(offset + 119, $cst_nm, value);
	}


	/**
	 * Sales order transaction pattern type 受注取引パタン区分.<p>
	 *
	 */
	public String slo_trd_ptn_typ() {
		return getConstString(offset + 120, $slo_trd_ptn_typ);
	}

	/**
	 * Sales order transaction pattern type 受注取引パタン区分.<p>
	 *
	 */
	public void slo_trd_ptn_typ(String value) {
		setConstString(offset + 120, $slo_trd_ptn_typ, value);
	}


	/**
	 * Sales order transaction pattern type name 受注取引パタン区分名.<p>
	 *
	 */
	public String slo_trd_ptn_typ_nm() {
		return getConstString(offset + 121, $slo_trd_ptn_typ_nm);
	}

	/**
	 * Sales order transaction pattern type name 受注取引パタン区分名.<p>
	 *
	 */
	public void slo_trd_ptn_typ_nm(String value) {
		setConstString(offset + 121, $slo_trd_ptn_typ_nm, value);
	}


	/**
	 * Revenue recording type 売上計上区分.<p>
	 *
	 */
	public String sls_basis_typ() {
		return getConstString(offset + 122, $sls_basis_typ);
	}

	/**
	 * Revenue recording type 売上計上区分.<p>
	 *
	 */
	public void sls_basis_typ(String value) {
		setConstString(offset + 122, $sls_basis_typ, value);
	}


	/**
	 * Revenue recording type name 売上計上区分名.<p>
	 *
	 */
	public String sls_basis_typ_nm() {
		return getConstString(offset + 123, $sls_basis_typ_nm);
	}

	/**
	 * Revenue recording type name 売上計上区分名.<p>
	 *
	 */
	public void sls_basis_typ_nm(String value) {
		setConstString(offset + 123, $sls_basis_typ_nm, value);
	}


	/**
	 * Sales order transaction terms cd. 1 受注取引条件ＣＤ１.<p>
	 *
	 */
	public String slo_tterm_cd1() {
		return getConstString(offset + 124, $slo_tterm_cd1);
	}

	/**
	 * Sales order transaction terms cd. 1 受注取引条件ＣＤ１.<p>
	 *
	 */
	public void slo_tterm_cd1(String value) {
		setConstString(offset + 124, $slo_tterm_cd1, value);
	}


	/**
	 * Sales order transaction terms name 1 受注取引条件名１.<p>
	 *
	 */
	public String slo_tterm_nm1() {
		return getConstString(offset + 125, $slo_tterm_nm1);
	}

	/**
	 * Sales order transaction terms name 1 受注取引条件名１.<p>
	 *
	 */
	public void slo_tterm_nm1(String value) {
		setConstString(offset + 125, $slo_tterm_nm1, value);
	}


	/**
	 * Sales order transaction terms remarks 1 受注取引条件備考１.<p>
	 *
	 */
	public String slo_tterm_rmrks1() {
		return getConstString(offset + 126, $slo_tterm_rmrks1);
	}

	/**
	 * Sales order transaction terms remarks 1 受注取引条件備考１.<p>
	 *
	 */
	public void slo_tterm_rmrks1(String value) {
		setConstString(offset + 126, $slo_tterm_rmrks1, value);
	}


	/**
	 * Sales order transaction terms cd. 2 受注取引条件ＣＤ２.<p>
	 *
	 */
	public String slo_tterm_cd2() {
		return getConstString(offset + 127, $slo_tterm_cd2);
	}

	/**
	 * Sales order transaction terms cd. 2 受注取引条件ＣＤ２.<p>
	 *
	 */
	public void slo_tterm_cd2(String value) {
		setConstString(offset + 127, $slo_tterm_cd2, value);
	}


	/**
	 * Sales order transaction terms name 2 受注取引条件名２.<p>
	 *
	 */
	public String slo_tterm_nm2() {
		return getConstString(offset + 128, $slo_tterm_nm2);
	}

	/**
	 * Sales order transaction terms name 2 受注取引条件名２.<p>
	 *
	 */
	public void slo_tterm_nm2(String value) {
		setConstString(offset + 128, $slo_tterm_nm2, value);
	}


	/**
	 * Sales order transaction terms remarks 2 受注取引条件備考２.<p>
	 *
	 */
	public String slo_tterm_rmrks2() {
		return getConstString(offset + 129, $slo_tterm_rmrks2);
	}

	/**
	 * Sales order transaction terms remarks 2 受注取引条件備考２.<p>
	 *
	 */
	public void slo_tterm_rmrks2(String value) {
		setConstString(offset + 129, $slo_tterm_rmrks2, value);
	}


	/**
	 * Sales order transaction terms cd. 3 受注取引条件ＣＤ３.<p>
	 *
	 */
	public String slo_tterm_cd3() {
		return getConstString(offset + 130, $slo_tterm_cd3);
	}

	/**
	 * Sales order transaction terms cd. 3 受注取引条件ＣＤ３.<p>
	 *
	 */
	public void slo_tterm_cd3(String value) {
		setConstString(offset + 130, $slo_tterm_cd3, value);
	}


	/**
	 * Sales order transaction terms name 3 受注取引条件名３.<p>
	 *
	 */
	public String slo_tterm_nm3() {
		return getConstString(offset + 131, $slo_tterm_nm3);
	}

	/**
	 * Sales order transaction terms name 3 受注取引条件名３.<p>
	 *
	 */
	public void slo_tterm_nm3(String value) {
		setConstString(offset + 131, $slo_tterm_nm3, value);
	}


	/**
	 * Sales order transaction terms remarks 3 受注取引条件備考３.<p>
	 *
	 */
	public String slo_tterm_rmrks3() {
		return getConstString(offset + 132, $slo_tterm_rmrks3);
	}

	/**
	 * Sales order transaction terms remarks 3 受注取引条件備考３.<p>
	 *
	 */
	public void slo_tterm_rmrks3(String value) {
		setConstString(offset + 132, $slo_tterm_rmrks3, value);
	}


	/**
	 * Sales order currency cd. 受注通貨ＣＤ.<p>
	 *
	 */
	public String slo_cur_cd() {
		return getConstString(offset + 133, $slo_cur_cd);
	}

	/**
	 * Sales order currency cd. 受注通貨ＣＤ.<p>
	 *
	 */
	public void slo_cur_cd(String value) {
		setConstString(offset + 133, $slo_cur_cd, value);
	}


	/**
	 * Sales order currency name 受注通貨名.<p>
	 *
	 */
	public String slo_cur_nm() {
		return getConstString(offset + 134, $slo_cur_nm);
	}

	/**
	 * Sales order currency name 受注通貨名.<p>
	 *
	 */
	public void slo_cur_nm(String value) {
		setConstString(offset + 134, $slo_cur_nm, value);
	}


	/**
	 * Sales order exchange rate 受注為替レート.<p>
	 *
	 */
	public MCNumber slo_xrate() {
		return getConstNumber(offset + 135, $slo_xrate);
	}

	/**
	 * Sales order exchange rate 受注為替レート.<p>
	 *
	 */
	public void slo_xrate(MCNumber value) {
		setConstNumber(offset + 135, $slo_xrate, value);
	}

	/**
	 * Sales order exchange rate 受注為替レート.<p>
	 *
	 */
	public void slo_xrate(int value) {
		setConstNumber(offset + 135, $slo_xrate, value);
	}

	/**
	 * Sales order exchange rate 受注為替レート.<p>
	 *
	 */
	public void slo_xrate(long value) {
		setConstNumber(offset + 135, $slo_xrate, value);
	}

	/**
	 * Sales order exchange rate 受注為替レート.<p>
	 *
	 */
	public void slo_xrate(float value) {
		setConstNumber(offset + 135, $slo_xrate, value);
	}

	/**
	 * Sales order exchange rate 受注為替レート.<p>
	 *
	 */
	public void slo_xrate(double value) {
		setConstNumber(offset + 135, $slo_xrate, value);
	}


	/**
	 * Sales order taxpaying exchange rate 受注納税為替レート.<p>
	 *
	 */
	public MCNumber slo_ptax_xrate() {
		return getConstNumber(offset + 136, $slo_ptax_xrate);
	}

	/**
	 * Sales order taxpaying exchange rate 受注納税為替レート.<p>
	 *
	 */
	public void slo_ptax_xrate(MCNumber value) {
		setConstNumber(offset + 136, $slo_ptax_xrate, value);
	}

	/**
	 * Sales order taxpaying exchange rate 受注納税為替レート.<p>
	 *
	 */
	public void slo_ptax_xrate(int value) {
		setConstNumber(offset + 136, $slo_ptax_xrate, value);
	}

	/**
	 * Sales order taxpaying exchange rate 受注納税為替レート.<p>
	 *
	 */
	public void slo_ptax_xrate(long value) {
		setConstNumber(offset + 136, $slo_ptax_xrate, value);
	}

	/**
	 * Sales order taxpaying exchange rate 受注納税為替レート.<p>
	 *
	 */
	public void slo_ptax_xrate(float value) {
		setConstNumber(offset + 136, $slo_ptax_xrate, value);
	}

	/**
	 * Sales order taxpaying exchange rate 受注納税為替レート.<p>
	 *
	 */
	public void slo_ptax_xrate(double value) {
		setConstNumber(offset + 136, $slo_ptax_xrate, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 137, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 137, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 138, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 138, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 139, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 139, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 140, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 140, $ins_func_nm, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 141, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 141, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 142, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 142, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 143, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 143, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 144, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 144, $upd_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 145, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 145, $ins_ts, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 146, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 146, $upd_ts, value);
	}


	/**
	 * Request No. リクエストNO.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 147, $upd_srv_req_no);
	}

	/**
	 * Request No. リクエストNO.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 147, $upd_srv_req_no, value);
	}


	public String getString(String name) {
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			return purc_act_no();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no();
		}
		if ($rcpt_iv_src_typ.equalsIgnoreCase(name)) {
			return rcpt_iv_src_typ();
		}
		if ($rcpt_iv_src_typ_nm.equalsIgnoreCase(name)) {
			return rcpt_iv_src_typ_nm();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($inherited_src_no.equalsIgnoreCase(name)) {
			return inherited_src_no();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($outsrc_upri_typ.equalsIgnoreCase(name)) {
			return outsrc_upri_typ();
		}
		if ($in_to_id_typ.equalsIgnoreCase(name)) {
			return in_to_id_typ();
		}
		if ($in_to_id_typ_nm.equalsIgnoreCase(name)) {
			return in_to_id_typ_nm();
		}
		if ($in_to_id_cd.equalsIgnoreCase(name)) {
			return in_to_id_cd();
		}
		if ($in_to_id_nm.equalsIgnoreCase(name)) {
			return in_to_id_nm();
		}
		if ($in_to_id_cd_dmy.equalsIgnoreCase(name)) {
			return in_to_id_cd_dmy();
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($mst_ap_dpt_cd.equalsIgnoreCase(name)) {
			return mst_ap_dpt_cd();
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			return prnt_lcl_cd();
		}
		if ($purc_tax_calc_typ.equalsIgnoreCase(name)) {
			return purc_tax_calc_typ();
		}
		if ($dlv_loc_wg_cd.equalsIgnoreCase(name)) {
			return dlv_loc_wg_cd();
		}
		if ($def_purc_usr_cd.equalsIgnoreCase(name)) {
			return def_purc_usr_cd();
		}
		if ($def_purc_dpt_cd.equalsIgnoreCase(name)) {
			return def_purc_dpt_cd();
		}
		if ($purc_dpt_wg_cd.equalsIgnoreCase(name)) {
			return purc_dpt_wg_cd();
		}
		if ($purc_dpt_wg_nm.equalsIgnoreCase(name)) {
			return purc_dpt_wg_nm();
		}
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			return trnspt_cd();
		}
		if ($trnspt_nm.equalsIgnoreCase(name)) {
			return trnspt_nm();
		}
		if ($vssl_flght.equalsIgnoreCase(name)) {
			return vssl_flght();
		}
		if ($load_port_cd.equalsIgnoreCase(name)) {
			return load_port_cd();
		}
		if ($load_port_nm.equalsIgnoreCase(name)) {
			return load_port_nm();
		}
		if ($dschrg_port_cd.equalsIgnoreCase(name)) {
			return dschrg_port_cd();
		}
		if ($dschrg_port_nm.equalsIgnoreCase(name)) {
			return dschrg_port_nm();
		}
		if ($via_port_cd.equalsIgnoreCase(name)) {
			return via_port_cd();
		}
		if ($via_port_nm.equalsIgnoreCase(name)) {
			return via_port_nm();
		}
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			return tterm_cd1();
		}
		if ($tterm_nm1.equalsIgnoreCase(name)) {
			return tterm_nm1();
		}
		if ($tterm_rmrks1.equalsIgnoreCase(name)) {
			return tterm_rmrks1();
		}
		if ($tterm_cd2.equalsIgnoreCase(name)) {
			return tterm_cd2();
		}
		if ($tterm_nm2.equalsIgnoreCase(name)) {
			return tterm_nm2();
		}
		if ($tterm_rmrks2.equalsIgnoreCase(name)) {
			return tterm_rmrks2();
		}
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			return tterm_cd3();
		}
		if ($tterm_nm3.equalsIgnoreCase(name)) {
			return tterm_nm3();
		}
		if ($tterm_rmrks3.equalsIgnoreCase(name)) {
			return tterm_rmrks3();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($src_trd_cur_cd.equalsIgnoreCase(name)) {
			return src_trd_cur_cd();
		}
		if ($purc_xrate_cd.equalsIgnoreCase(name)) {
			return purc_xrate_cd();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			return base_cur_nm();
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			return ptax_cur_cd();
		}
		if ($ptax_cur_nm.equalsIgnoreCase(name)) {
			return ptax_cur_nm();
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			return purc_amt_rnd_typ();
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			return purc_tax_rnd_typ();
		}
		if ($purc_slip_each_lot_typ.equalsIgnoreCase(name)) {
			return purc_slip_each_lot_typ();
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			return asppl_cd();
		}
		if ($asppl_nm.equalsIgnoreCase(name)) {
			return asppl_nm();
		}
		if ($rcpt_iv_rmrks.equalsIgnoreCase(name)) {
			return rcpt_iv_rmrks();
		}
		if ($rcpt_iv_intr_rmrks.equalsIgnoreCase(name)) {
			return rcpt_iv_intr_rmrks();
		}
		if ($rcpt_iv_sub_char1.equalsIgnoreCase(name)) {
			return rcpt_iv_sub_char1();
		}
		if ($rcpt_iv_sub_char2.equalsIgnoreCase(name)) {
			return rcpt_iv_sub_char2();
		}
		if ($rcpt_iv_sub_char3.equalsIgnoreCase(name)) {
			return rcpt_iv_sub_char3();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($po_print_rmrks.equalsIgnoreCase(name)) {
			return po_print_rmrks();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($slo_trd_ptn_typ.equalsIgnoreCase(name)) {
			return slo_trd_ptn_typ();
		}
		if ($slo_trd_ptn_typ_nm.equalsIgnoreCase(name)) {
			return slo_trd_ptn_typ_nm();
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			return sls_basis_typ();
		}
		if ($sls_basis_typ_nm.equalsIgnoreCase(name)) {
			return sls_basis_typ_nm();
		}
		if ($slo_tterm_cd1.equalsIgnoreCase(name)) {
			return slo_tterm_cd1();
		}
		if ($slo_tterm_nm1.equalsIgnoreCase(name)) {
			return slo_tterm_nm1();
		}
		if ($slo_tterm_rmrks1.equalsIgnoreCase(name)) {
			return slo_tterm_rmrks1();
		}
		if ($slo_tterm_cd2.equalsIgnoreCase(name)) {
			return slo_tterm_cd2();
		}
		if ($slo_tterm_nm2.equalsIgnoreCase(name)) {
			return slo_tterm_nm2();
		}
		if ($slo_tterm_rmrks2.equalsIgnoreCase(name)) {
			return slo_tterm_rmrks2();
		}
		if ($slo_tterm_cd3.equalsIgnoreCase(name)) {
			return slo_tterm_cd3();
		}
		if ($slo_tterm_nm3.equalsIgnoreCase(name)) {
			return slo_tterm_nm3();
		}
		if ($slo_tterm_rmrks3.equalsIgnoreCase(name)) {
			return slo_tterm_rmrks3();
		}
		if ($slo_cur_cd.equalsIgnoreCase(name)) {
			return slo_cur_cd();
		}
		if ($slo_cur_nm.equalsIgnoreCase(name)) {
			return slo_cur_nm();
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			return ins_usr_id();
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			return ins_usr_nm();
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			return ins_func_id();
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			return ins_func_nm();
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			return upd_usr_id();
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			return upd_usr_nm();
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			return upd_func_id();
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			return upd_func_nm();
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			return upd_srv_req_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			return purc_act_seq();
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			return purc_act_rev();
		}
		if ($rcpt_iv_rev.equalsIgnoreCase(name)) {
			return rcpt_iv_rev();
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_upri_dec_place();
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_amt_dec_place();
		}
		if ($src_xrate.equalsIgnoreCase(name)) {
			return src_xrate();
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return base_cur_upri_dec_place();
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return base_cur_amt_dec_place();
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return ptax_cur_upri_dec_place();
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return ptax_cur_amt_dec_place();
		}
		if ($src_ptax_xrate.equalsIgnoreCase(name)) {
			return src_ptax_xrate();
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			return pay_crryovr_times();
		}
		if ($purc_act_upd_cntr.equalsIgnoreCase(name)) {
			return purc_act_upd_cntr();
		}
		if ($rcpt_iv_upd_cntr.equalsIgnoreCase(name)) {
			return rcpt_iv_upd_cntr();
		}
		if ($slo_xrate.equalsIgnoreCase(name)) {
			return slo_xrate();
		}
		if ($slo_ptax_xrate.equalsIgnoreCase(name)) {
			return slo_ptax_xrate();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
		}
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			return purc_schd_dt();
		}
		if ($purc_dt.equalsIgnoreCase(name)) {
			return purc_dt();
		}
		if ($iv_dt.equalsIgnoreCase(name)) {
			return iv_dt();
		}
		if ($purc_ac_schd_dt.equalsIgnoreCase(name)) {
			return purc_ac_schd_dt();
		}
		if ($xrate_base_dt.equalsIgnoreCase(name)) {
			return xrate_base_dt();
		}
		if ($dpt_base_dt.equalsIgnoreCase(name)) {
			return dpt_base_dt();
		}
		if ($pay_basis_dt.equalsIgnoreCase(name)) {
			return pay_basis_dt();
		}
		if ($pay_schd_dt.equalsIgnoreCase(name)) {
			return pay_schd_dt();
		}
		if ($etd_dt.equalsIgnoreCase(name)) {
			return etd_dt();
		}
		if ($eta_dt.equalsIgnoreCase(name)) {
			return eta_dt();
		}
		if ($via_schd_dt.equalsIgnoreCase(name)) {
			return via_schd_dt();
		}
		if ($ptax_dt.equalsIgnoreCase(name)) {
			return ptax_dt();
		}
		return super.getDate(name);
	}
	public MCTimestamp getTimestamp(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestamp(name);
	}
	public boolean getBoolean(String name) {
		if ($fix_flg.equalsIgnoreCase(name)) {
			return fix_flg();
		}
		if ($latest_flg.equalsIgnoreCase(name)) {
			return latest_flg();
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			return subcon_flg();
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			return repurc_obli_flg();
		}
		if ($sppl_iv_flg.equalsIgnoreCase(name)) {
			return sppl_iv_flg();
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			return pay_spot_flg();
		}
		if ($ap_dpt_flg.equalsIgnoreCase(name)) {
			return ap_dpt_flg();
		}
		if ($xrate_inpt_flg.equalsIgnoreCase(name)) {
			return xrate_inpt_flg();
		}
		if ($ptax_xrate_inpt_flg.equalsIgnoreCase(name)) {
			return ptax_xrate_inpt_flg();
		}
		if ($purc_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			return purc_tax_cd_prio_flg();
		}
		if ($purc_upri_cng_flg.equalsIgnoreCase(name)) {
			return purc_upri_cng_flg();
		}
		if ($edi_flg.equalsIgnoreCase(name)) {
			return edi_flg();
		}
		if ($iv_reg_flg.equalsIgnoreCase(name)) {
			return iv_reg_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			return purc_act_no();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no();
		}
		if ($rcpt_iv_src_typ.equalsIgnoreCase(name)) {
			return rcpt_iv_src_typ();
		}
		if ($rcpt_iv_src_typ_nm.equalsIgnoreCase(name)) {
			return rcpt_iv_src_typ_nm();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($inherited_src_no.equalsIgnoreCase(name)) {
			return inherited_src_no();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($outsrc_upri_typ.equalsIgnoreCase(name)) {
			return outsrc_upri_typ();
		}
		if ($in_to_id_typ.equalsIgnoreCase(name)) {
			return in_to_id_typ();
		}
		if ($in_to_id_typ_nm.equalsIgnoreCase(name)) {
			return in_to_id_typ_nm();
		}
		if ($in_to_id_cd.equalsIgnoreCase(name)) {
			return in_to_id_cd();
		}
		if ($in_to_id_nm.equalsIgnoreCase(name)) {
			return in_to_id_nm();
		}
		if ($in_to_id_cd_dmy.equalsIgnoreCase(name)) {
			return in_to_id_cd_dmy();
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($mst_ap_dpt_cd.equalsIgnoreCase(name)) {
			return mst_ap_dpt_cd();
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			return prnt_lcl_cd();
		}
		if ($purc_tax_calc_typ.equalsIgnoreCase(name)) {
			return purc_tax_calc_typ();
		}
		if ($dlv_loc_wg_cd.equalsIgnoreCase(name)) {
			return dlv_loc_wg_cd();
		}
		if ($def_purc_usr_cd.equalsIgnoreCase(name)) {
			return def_purc_usr_cd();
		}
		if ($def_purc_dpt_cd.equalsIgnoreCase(name)) {
			return def_purc_dpt_cd();
		}
		if ($purc_dpt_wg_cd.equalsIgnoreCase(name)) {
			return purc_dpt_wg_cd();
		}
		if ($purc_dpt_wg_nm.equalsIgnoreCase(name)) {
			return purc_dpt_wg_nm();
		}
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			return trnspt_cd();
		}
		if ($trnspt_nm.equalsIgnoreCase(name)) {
			return trnspt_nm();
		}
		if ($vssl_flght.equalsIgnoreCase(name)) {
			return vssl_flght();
		}
		if ($load_port_cd.equalsIgnoreCase(name)) {
			return load_port_cd();
		}
		if ($load_port_nm.equalsIgnoreCase(name)) {
			return load_port_nm();
		}
		if ($dschrg_port_cd.equalsIgnoreCase(name)) {
			return dschrg_port_cd();
		}
		if ($dschrg_port_nm.equalsIgnoreCase(name)) {
			return dschrg_port_nm();
		}
		if ($via_port_cd.equalsIgnoreCase(name)) {
			return via_port_cd();
		}
		if ($via_port_nm.equalsIgnoreCase(name)) {
			return via_port_nm();
		}
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			return tterm_cd1();
		}
		if ($tterm_nm1.equalsIgnoreCase(name)) {
			return tterm_nm1();
		}
		if ($tterm_rmrks1.equalsIgnoreCase(name)) {
			return tterm_rmrks1();
		}
		if ($tterm_cd2.equalsIgnoreCase(name)) {
			return tterm_cd2();
		}
		if ($tterm_nm2.equalsIgnoreCase(name)) {
			return tterm_nm2();
		}
		if ($tterm_rmrks2.equalsIgnoreCase(name)) {
			return tterm_rmrks2();
		}
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			return tterm_cd3();
		}
		if ($tterm_nm3.equalsIgnoreCase(name)) {
			return tterm_nm3();
		}
		if ($tterm_rmrks3.equalsIgnoreCase(name)) {
			return tterm_rmrks3();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($src_trd_cur_cd.equalsIgnoreCase(name)) {
			return src_trd_cur_cd();
		}
		if ($purc_xrate_cd.equalsIgnoreCase(name)) {
			return purc_xrate_cd();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			return base_cur_nm();
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			return ptax_cur_cd();
		}
		if ($ptax_cur_nm.equalsIgnoreCase(name)) {
			return ptax_cur_nm();
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			return purc_amt_rnd_typ();
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			return purc_tax_rnd_typ();
		}
		if ($purc_slip_each_lot_typ.equalsIgnoreCase(name)) {
			return purc_slip_each_lot_typ();
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			return asppl_cd();
		}
		if ($asppl_nm.equalsIgnoreCase(name)) {
			return asppl_nm();
		}
		if ($rcpt_iv_rmrks.equalsIgnoreCase(name)) {
			return rcpt_iv_rmrks();
		}
		if ($rcpt_iv_intr_rmrks.equalsIgnoreCase(name)) {
			return rcpt_iv_intr_rmrks();
		}
		if ($rcpt_iv_sub_char1.equalsIgnoreCase(name)) {
			return rcpt_iv_sub_char1();
		}
		if ($rcpt_iv_sub_char2.equalsIgnoreCase(name)) {
			return rcpt_iv_sub_char2();
		}
		if ($rcpt_iv_sub_char3.equalsIgnoreCase(name)) {
			return rcpt_iv_sub_char3();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($po_print_rmrks.equalsIgnoreCase(name)) {
			return po_print_rmrks();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($slo_trd_ptn_typ.equalsIgnoreCase(name)) {
			return slo_trd_ptn_typ();
		}
		if ($slo_trd_ptn_typ_nm.equalsIgnoreCase(name)) {
			return slo_trd_ptn_typ_nm();
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			return sls_basis_typ();
		}
		if ($sls_basis_typ_nm.equalsIgnoreCase(name)) {
			return sls_basis_typ_nm();
		}
		if ($slo_tterm_cd1.equalsIgnoreCase(name)) {
			return slo_tterm_cd1();
		}
		if ($slo_tterm_nm1.equalsIgnoreCase(name)) {
			return slo_tterm_nm1();
		}
		if ($slo_tterm_rmrks1.equalsIgnoreCase(name)) {
			return slo_tterm_rmrks1();
		}
		if ($slo_tterm_cd2.equalsIgnoreCase(name)) {
			return slo_tterm_cd2();
		}
		if ($slo_tterm_nm2.equalsIgnoreCase(name)) {
			return slo_tterm_nm2();
		}
		if ($slo_tterm_rmrks2.equalsIgnoreCase(name)) {
			return slo_tterm_rmrks2();
		}
		if ($slo_tterm_cd3.equalsIgnoreCase(name)) {
			return slo_tterm_cd3();
		}
		if ($slo_tterm_nm3.equalsIgnoreCase(name)) {
			return slo_tterm_nm3();
		}
		if ($slo_tterm_rmrks3.equalsIgnoreCase(name)) {
			return slo_tterm_rmrks3();
		}
		if ($slo_cur_cd.equalsIgnoreCase(name)) {
			return slo_cur_cd();
		}
		if ($slo_cur_nm.equalsIgnoreCase(name)) {
			return slo_cur_nm();
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			return ins_usr_id();
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			return ins_usr_nm();
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			return ins_func_id();
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			return ins_func_nm();
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			return upd_usr_id();
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			return upd_usr_nm();
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			return upd_func_id();
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			return upd_func_nm();
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			return upd_srv_req_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			return purc_act_seq();
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			return purc_act_rev();
		}
		if ($rcpt_iv_rev.equalsIgnoreCase(name)) {
			return rcpt_iv_rev();
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_upri_dec_place();
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_amt_dec_place();
		}
		if ($src_xrate.equalsIgnoreCase(name)) {
			return src_xrate();
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return base_cur_upri_dec_place();
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return base_cur_amt_dec_place();
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return ptax_cur_upri_dec_place();
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return ptax_cur_amt_dec_place();
		}
		if ($src_ptax_xrate.equalsIgnoreCase(name)) {
			return src_ptax_xrate();
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			return pay_crryovr_times();
		}
		if ($purc_act_upd_cntr.equalsIgnoreCase(name)) {
			return purc_act_upd_cntr();
		}
		if ($rcpt_iv_upd_cntr.equalsIgnoreCase(name)) {
			return rcpt_iv_upd_cntr();
		}
		if ($slo_xrate.equalsIgnoreCase(name)) {
			return slo_xrate();
		}
		if ($slo_ptax_xrate.equalsIgnoreCase(name)) {
			return slo_ptax_xrate();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
		}
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			return purc_schd_dt();
		}
		if ($purc_dt.equalsIgnoreCase(name)) {
			return purc_dt();
		}
		if ($iv_dt.equalsIgnoreCase(name)) {
			return iv_dt();
		}
		if ($purc_ac_schd_dt.equalsIgnoreCase(name)) {
			return purc_ac_schd_dt();
		}
		if ($xrate_base_dt.equalsIgnoreCase(name)) {
			return xrate_base_dt();
		}
		if ($dpt_base_dt.equalsIgnoreCase(name)) {
			return dpt_base_dt();
		}
		if ($pay_basis_dt.equalsIgnoreCase(name)) {
			return pay_basis_dt();
		}
		if ($pay_schd_dt.equalsIgnoreCase(name)) {
			return pay_schd_dt();
		}
		if ($etd_dt.equalsIgnoreCase(name)) {
			return etd_dt();
		}
		if ($eta_dt.equalsIgnoreCase(name)) {
			return eta_dt();
		}
		if ($via_schd_dt.equalsIgnoreCase(name)) {
			return via_schd_dt();
		}
		if ($ptax_dt.equalsIgnoreCase(name)) {
			return ptax_dt();
		}
		return super.getDateNE(name);
	}
	public MCTimestamp getTimestampNE(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestampNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($fix_flg.equalsIgnoreCase(name)) {
			return fix_flg();
		}
		if ($latest_flg.equalsIgnoreCase(name)) {
			return latest_flg();
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			return subcon_flg();
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			return repurc_obli_flg();
		}
		if ($sppl_iv_flg.equalsIgnoreCase(name)) {
			return sppl_iv_flg();
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			return pay_spot_flg();
		}
		if ($ap_dpt_flg.equalsIgnoreCase(name)) {
			return ap_dpt_flg();
		}
		if ($xrate_inpt_flg.equalsIgnoreCase(name)) {
			return xrate_inpt_flg();
		}
		if ($ptax_xrate_inpt_flg.equalsIgnoreCase(name)) {
			return ptax_xrate_inpt_flg();
		}
		if ($purc_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			return purc_tax_cd_prio_flg();
		}
		if ($purc_upri_cng_flg.equalsIgnoreCase(name)) {
			return purc_upri_cng_flg();
		}
		if ($edi_flg.equalsIgnoreCase(name)) {
			return edi_flg();
		}
		if ($iv_reg_flg.equalsIgnoreCase(name)) {
			return iv_reg_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			purc_act_no(value);
			return;
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
			return;
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			rcpt_iv_mng_no(value);
			return;
		}
		if ($rcpt_iv_src_typ.equalsIgnoreCase(name)) {
			rcpt_iv_src_typ(value);
			return;
		}
		if ($rcpt_iv_src_typ_nm.equalsIgnoreCase(name)) {
			rcpt_iv_src_typ_nm(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($inherited_src_no.equalsIgnoreCase(name)) {
			inherited_src_no(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($outsrc_upri_typ.equalsIgnoreCase(name)) {
			outsrc_upri_typ(value);
			return;
		}
		if ($in_to_id_typ.equalsIgnoreCase(name)) {
			in_to_id_typ(value);
			return;
		}
		if ($in_to_id_typ_nm.equalsIgnoreCase(name)) {
			in_to_id_typ_nm(value);
			return;
		}
		if ($in_to_id_cd.equalsIgnoreCase(name)) {
			in_to_id_cd(value);
			return;
		}
		if ($in_to_id_nm.equalsIgnoreCase(name)) {
			in_to_id_nm(value);
			return;
		}
		if ($in_to_id_cd_dmy.equalsIgnoreCase(name)) {
			in_to_id_cd_dmy(value);
			return;
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			ap_dpt_cd(value);
			return;
		}
		if ($mst_ap_dpt_cd.equalsIgnoreCase(name)) {
			mst_ap_dpt_cd(value);
			return;
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			prnt_lcl_cd(value);
			return;
		}
		if ($purc_tax_calc_typ.equalsIgnoreCase(name)) {
			purc_tax_calc_typ(value);
			return;
		}
		if ($dlv_loc_wg_cd.equalsIgnoreCase(name)) {
			dlv_loc_wg_cd(value);
			return;
		}
		if ($def_purc_usr_cd.equalsIgnoreCase(name)) {
			def_purc_usr_cd(value);
			return;
		}
		if ($def_purc_dpt_cd.equalsIgnoreCase(name)) {
			def_purc_dpt_cd(value);
			return;
		}
		if ($purc_dpt_wg_cd.equalsIgnoreCase(name)) {
			purc_dpt_wg_cd(value);
			return;
		}
		if ($purc_dpt_wg_nm.equalsIgnoreCase(name)) {
			purc_dpt_wg_nm(value);
			return;
		}
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			trnspt_cd(value);
			return;
		}
		if ($trnspt_nm.equalsIgnoreCase(name)) {
			trnspt_nm(value);
			return;
		}
		if ($vssl_flght.equalsIgnoreCase(name)) {
			vssl_flght(value);
			return;
		}
		if ($load_port_cd.equalsIgnoreCase(name)) {
			load_port_cd(value);
			return;
		}
		if ($load_port_nm.equalsIgnoreCase(name)) {
			load_port_nm(value);
			return;
		}
		if ($dschrg_port_cd.equalsIgnoreCase(name)) {
			dschrg_port_cd(value);
			return;
		}
		if ($dschrg_port_nm.equalsIgnoreCase(name)) {
			dschrg_port_nm(value);
			return;
		}
		if ($via_port_cd.equalsIgnoreCase(name)) {
			via_port_cd(value);
			return;
		}
		if ($via_port_nm.equalsIgnoreCase(name)) {
			via_port_nm(value);
			return;
		}
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			tterm_cd1(value);
			return;
		}
		if ($tterm_nm1.equalsIgnoreCase(name)) {
			tterm_nm1(value);
			return;
		}
		if ($tterm_rmrks1.equalsIgnoreCase(name)) {
			tterm_rmrks1(value);
			return;
		}
		if ($tterm_cd2.equalsIgnoreCase(name)) {
			tterm_cd2(value);
			return;
		}
		if ($tterm_nm2.equalsIgnoreCase(name)) {
			tterm_nm2(value);
			return;
		}
		if ($tterm_rmrks2.equalsIgnoreCase(name)) {
			tterm_rmrks2(value);
			return;
		}
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			tterm_cd3(value);
			return;
		}
		if ($tterm_nm3.equalsIgnoreCase(name)) {
			tterm_nm3(value);
			return;
		}
		if ($tterm_rmrks3.equalsIgnoreCase(name)) {
			tterm_rmrks3(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		if ($src_trd_cur_cd.equalsIgnoreCase(name)) {
			src_trd_cur_cd(value);
			return;
		}
		if ($purc_xrate_cd.equalsIgnoreCase(name)) {
			purc_xrate_cd(value);
			return;
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
			return;
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			base_cur_nm(value);
			return;
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			ptax_cur_cd(value);
			return;
		}
		if ($ptax_cur_nm.equalsIgnoreCase(name)) {
			ptax_cur_nm(value);
			return;
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			purc_amt_rnd_typ(value);
			return;
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			purc_tax_rnd_typ(value);
			return;
		}
		if ($purc_slip_each_lot_typ.equalsIgnoreCase(name)) {
			purc_slip_each_lot_typ(value);
			return;
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			asppl_cd(value);
			return;
		}
		if ($asppl_nm.equalsIgnoreCase(name)) {
			asppl_nm(value);
			return;
		}
		if ($rcpt_iv_rmrks.equalsIgnoreCase(name)) {
			rcpt_iv_rmrks(value);
			return;
		}
		if ($rcpt_iv_intr_rmrks.equalsIgnoreCase(name)) {
			rcpt_iv_intr_rmrks(value);
			return;
		}
		if ($rcpt_iv_sub_char1.equalsIgnoreCase(name)) {
			rcpt_iv_sub_char1(value);
			return;
		}
		if ($rcpt_iv_sub_char2.equalsIgnoreCase(name)) {
			rcpt_iv_sub_char2(value);
			return;
		}
		if ($rcpt_iv_sub_char3.equalsIgnoreCase(name)) {
			rcpt_iv_sub_char3(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($po_print_rmrks.equalsIgnoreCase(name)) {
			po_print_rmrks(value);
			return;
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
			return;
		}
		if ($slo_trd_ptn_typ.equalsIgnoreCase(name)) {
			slo_trd_ptn_typ(value);
			return;
		}
		if ($slo_trd_ptn_typ_nm.equalsIgnoreCase(name)) {
			slo_trd_ptn_typ_nm(value);
			return;
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			sls_basis_typ(value);
			return;
		}
		if ($sls_basis_typ_nm.equalsIgnoreCase(name)) {
			sls_basis_typ_nm(value);
			return;
		}
		if ($slo_tterm_cd1.equalsIgnoreCase(name)) {
			slo_tterm_cd1(value);
			return;
		}
		if ($slo_tterm_nm1.equalsIgnoreCase(name)) {
			slo_tterm_nm1(value);
			return;
		}
		if ($slo_tterm_rmrks1.equalsIgnoreCase(name)) {
			slo_tterm_rmrks1(value);
			return;
		}
		if ($slo_tterm_cd2.equalsIgnoreCase(name)) {
			slo_tterm_cd2(value);
			return;
		}
		if ($slo_tterm_nm2.equalsIgnoreCase(name)) {
			slo_tterm_nm2(value);
			return;
		}
		if ($slo_tterm_rmrks2.equalsIgnoreCase(name)) {
			slo_tterm_rmrks2(value);
			return;
		}
		if ($slo_tterm_cd3.equalsIgnoreCase(name)) {
			slo_tterm_cd3(value);
			return;
		}
		if ($slo_tterm_nm3.equalsIgnoreCase(name)) {
			slo_tterm_nm3(value);
			return;
		}
		if ($slo_tterm_rmrks3.equalsIgnoreCase(name)) {
			slo_tterm_rmrks3(value);
			return;
		}
		if ($slo_cur_cd.equalsIgnoreCase(name)) {
			slo_cur_cd(value);
			return;
		}
		if ($slo_cur_nm.equalsIgnoreCase(name)) {
			slo_cur_nm(value);
			return;
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			ins_usr_id(value);
			return;
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			ins_usr_nm(value);
			return;
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			ins_func_id(value);
			return;
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			ins_func_nm(value);
			return;
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			upd_usr_id(value);
			return;
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			upd_usr_nm(value);
			return;
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			upd_func_id(value);
			return;
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			upd_func_nm(value);
			return;
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			upd_srv_req_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
			return;
		}
		if ($rcpt_iv_rev.equalsIgnoreCase(name)) {
			rcpt_iv_rev(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($src_xrate.equalsIgnoreCase(name)) {
			src_xrate(value);
			return;
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($src_ptax_xrate.equalsIgnoreCase(name)) {
			src_ptax_xrate(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($purc_act_upd_cntr.equalsIgnoreCase(name)) {
			purc_act_upd_cntr(value);
			return;
		}
		if ($rcpt_iv_upd_cntr.equalsIgnoreCase(name)) {
			rcpt_iv_upd_cntr(value);
			return;
		}
		if ($slo_xrate.equalsIgnoreCase(name)) {
			slo_xrate(value);
			return;
		}
		if ($slo_ptax_xrate.equalsIgnoreCase(name)) {
			slo_ptax_xrate(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
			return;
		}
		if ($rcpt_iv_rev.equalsIgnoreCase(name)) {
			rcpt_iv_rev(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($src_xrate.equalsIgnoreCase(name)) {
			src_xrate(value);
			return;
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($src_ptax_xrate.equalsIgnoreCase(name)) {
			src_ptax_xrate(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($purc_act_upd_cntr.equalsIgnoreCase(name)) {
			purc_act_upd_cntr(value);
			return;
		}
		if ($rcpt_iv_upd_cntr.equalsIgnoreCase(name)) {
			rcpt_iv_upd_cntr(value);
			return;
		}
		if ($slo_xrate.equalsIgnoreCase(name)) {
			slo_xrate(value);
			return;
		}
		if ($slo_ptax_xrate.equalsIgnoreCase(name)) {
			slo_ptax_xrate(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
			return;
		}
		if ($rcpt_iv_rev.equalsIgnoreCase(name)) {
			rcpt_iv_rev(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($src_xrate.equalsIgnoreCase(name)) {
			src_xrate(value);
			return;
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($src_ptax_xrate.equalsIgnoreCase(name)) {
			src_ptax_xrate(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($purc_act_upd_cntr.equalsIgnoreCase(name)) {
			purc_act_upd_cntr(value);
			return;
		}
		if ($rcpt_iv_upd_cntr.equalsIgnoreCase(name)) {
			rcpt_iv_upd_cntr(value);
			return;
		}
		if ($slo_xrate.equalsIgnoreCase(name)) {
			slo_xrate(value);
			return;
		}
		if ($slo_ptax_xrate.equalsIgnoreCase(name)) {
			slo_ptax_xrate(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
			return;
		}
		if ($rcpt_iv_rev.equalsIgnoreCase(name)) {
			rcpt_iv_rev(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($src_xrate.equalsIgnoreCase(name)) {
			src_xrate(value);
			return;
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($src_ptax_xrate.equalsIgnoreCase(name)) {
			src_ptax_xrate(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($purc_act_upd_cntr.equalsIgnoreCase(name)) {
			purc_act_upd_cntr(value);
			return;
		}
		if ($rcpt_iv_upd_cntr.equalsIgnoreCase(name)) {
			rcpt_iv_upd_cntr(value);
			return;
		}
		if ($slo_xrate.equalsIgnoreCase(name)) {
			slo_xrate(value);
			return;
		}
		if ($slo_ptax_xrate.equalsIgnoreCase(name)) {
			slo_ptax_xrate(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
			return;
		}
		if ($rcpt_iv_rev.equalsIgnoreCase(name)) {
			rcpt_iv_rev(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($src_xrate.equalsIgnoreCase(name)) {
			src_xrate(value);
			return;
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($src_ptax_xrate.equalsIgnoreCase(name)) {
			src_ptax_xrate(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($purc_act_upd_cntr.equalsIgnoreCase(name)) {
			purc_act_upd_cntr(value);
			return;
		}
		if ($rcpt_iv_upd_cntr.equalsIgnoreCase(name)) {
			rcpt_iv_upd_cntr(value);
			return;
		}
		if ($slo_xrate.equalsIgnoreCase(name)) {
			slo_xrate(value);
			return;
		}
		if ($slo_ptax_xrate.equalsIgnoreCase(name)) {
			slo_ptax_xrate(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
			return;
		}
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			purc_schd_dt(value);
			return;
		}
		if ($purc_dt.equalsIgnoreCase(name)) {
			purc_dt(value);
			return;
		}
		if ($iv_dt.equalsIgnoreCase(name)) {
			iv_dt(value);
			return;
		}
		if ($purc_ac_schd_dt.equalsIgnoreCase(name)) {
			purc_ac_schd_dt(value);
			return;
		}
		if ($xrate_base_dt.equalsIgnoreCase(name)) {
			xrate_base_dt(value);
			return;
		}
		if ($dpt_base_dt.equalsIgnoreCase(name)) {
			dpt_base_dt(value);
			return;
		}
		if ($pay_basis_dt.equalsIgnoreCase(name)) {
			pay_basis_dt(value);
			return;
		}
		if ($pay_schd_dt.equalsIgnoreCase(name)) {
			pay_schd_dt(value);
			return;
		}
		if ($etd_dt.equalsIgnoreCase(name)) {
			etd_dt(value);
			return;
		}
		if ($eta_dt.equalsIgnoreCase(name)) {
			eta_dt(value);
			return;
		}
		if ($via_schd_dt.equalsIgnoreCase(name)) {
			via_schd_dt(value);
			return;
		}
		if ($ptax_dt.equalsIgnoreCase(name)) {
			ptax_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setTimestamp(String name, MCTimestamp value) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		super.setTimestamp(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($fix_flg.equalsIgnoreCase(name)) {
			fix_flg(value);
			return;
		}
		if ($latest_flg.equalsIgnoreCase(name)) {
			latest_flg(value);
			return;
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			can_flg(value);
			return;
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			subcon_flg(value);
			return;
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			repurc_obli_flg(value);
			return;
		}
		if ($sppl_iv_flg.equalsIgnoreCase(name)) {
			sppl_iv_flg(value);
			return;
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			pay_spot_flg(value);
			return;
		}
		if ($ap_dpt_flg.equalsIgnoreCase(name)) {
			ap_dpt_flg(value);
			return;
		}
		if ($xrate_inpt_flg.equalsIgnoreCase(name)) {
			xrate_inpt_flg(value);
			return;
		}
		if ($ptax_xrate_inpt_flg.equalsIgnoreCase(name)) {
			ptax_xrate_inpt_flg(value);
			return;
		}
		if ($purc_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			purc_tax_cd_prio_flg(value);
			return;
		}
		if ($purc_upri_cng_flg.equalsIgnoreCase(name)) {
			purc_upri_cng_flg(value);
			return;
		}
		if ($edi_flg.equalsIgnoreCase(name)) {
			edi_flg(value);
			return;
		}
		if ($iv_reg_flg.equalsIgnoreCase(name)) {
			iv_reg_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			purc_act_no(value);
			return;
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
			return;
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			rcpt_iv_mng_no(value);
			return;
		}
		if ($rcpt_iv_src_typ.equalsIgnoreCase(name)) {
			rcpt_iv_src_typ(value);
			return;
		}
		if ($rcpt_iv_src_typ_nm.equalsIgnoreCase(name)) {
			rcpt_iv_src_typ_nm(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($inherited_src_no.equalsIgnoreCase(name)) {
			inherited_src_no(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($outsrc_upri_typ.equalsIgnoreCase(name)) {
			outsrc_upri_typ(value);
			return;
		}
		if ($in_to_id_typ.equalsIgnoreCase(name)) {
			in_to_id_typ(value);
			return;
		}
		if ($in_to_id_typ_nm.equalsIgnoreCase(name)) {
			in_to_id_typ_nm(value);
			return;
		}
		if ($in_to_id_cd.equalsIgnoreCase(name)) {
			in_to_id_cd(value);
			return;
		}
		if ($in_to_id_nm.equalsIgnoreCase(name)) {
			in_to_id_nm(value);
			return;
		}
		if ($in_to_id_cd_dmy.equalsIgnoreCase(name)) {
			in_to_id_cd_dmy(value);
			return;
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			ap_dpt_cd(value);
			return;
		}
		if ($mst_ap_dpt_cd.equalsIgnoreCase(name)) {
			mst_ap_dpt_cd(value);
			return;
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			prnt_lcl_cd(value);
			return;
		}
		if ($purc_tax_calc_typ.equalsIgnoreCase(name)) {
			purc_tax_calc_typ(value);
			return;
		}
		if ($dlv_loc_wg_cd.equalsIgnoreCase(name)) {
			dlv_loc_wg_cd(value);
			return;
		}
		if ($def_purc_usr_cd.equalsIgnoreCase(name)) {
			def_purc_usr_cd(value);
			return;
		}
		if ($def_purc_dpt_cd.equalsIgnoreCase(name)) {
			def_purc_dpt_cd(value);
			return;
		}
		if ($purc_dpt_wg_cd.equalsIgnoreCase(name)) {
			purc_dpt_wg_cd(value);
			return;
		}
		if ($purc_dpt_wg_nm.equalsIgnoreCase(name)) {
			purc_dpt_wg_nm(value);
			return;
		}
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			trnspt_cd(value);
			return;
		}
		if ($trnspt_nm.equalsIgnoreCase(name)) {
			trnspt_nm(value);
			return;
		}
		if ($vssl_flght.equalsIgnoreCase(name)) {
			vssl_flght(value);
			return;
		}
		if ($load_port_cd.equalsIgnoreCase(name)) {
			load_port_cd(value);
			return;
		}
		if ($load_port_nm.equalsIgnoreCase(name)) {
			load_port_nm(value);
			return;
		}
		if ($dschrg_port_cd.equalsIgnoreCase(name)) {
			dschrg_port_cd(value);
			return;
		}
		if ($dschrg_port_nm.equalsIgnoreCase(name)) {
			dschrg_port_nm(value);
			return;
		}
		if ($via_port_cd.equalsIgnoreCase(name)) {
			via_port_cd(value);
			return;
		}
		if ($via_port_nm.equalsIgnoreCase(name)) {
			via_port_nm(value);
			return;
		}
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			tterm_cd1(value);
			return;
		}
		if ($tterm_nm1.equalsIgnoreCase(name)) {
			tterm_nm1(value);
			return;
		}
		if ($tterm_rmrks1.equalsIgnoreCase(name)) {
			tterm_rmrks1(value);
			return;
		}
		if ($tterm_cd2.equalsIgnoreCase(name)) {
			tterm_cd2(value);
			return;
		}
		if ($tterm_nm2.equalsIgnoreCase(name)) {
			tterm_nm2(value);
			return;
		}
		if ($tterm_rmrks2.equalsIgnoreCase(name)) {
			tterm_rmrks2(value);
			return;
		}
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			tterm_cd3(value);
			return;
		}
		if ($tterm_nm3.equalsIgnoreCase(name)) {
			tterm_nm3(value);
			return;
		}
		if ($tterm_rmrks3.equalsIgnoreCase(name)) {
			tterm_rmrks3(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		if ($src_trd_cur_cd.equalsIgnoreCase(name)) {
			src_trd_cur_cd(value);
			return;
		}
		if ($purc_xrate_cd.equalsIgnoreCase(name)) {
			purc_xrate_cd(value);
			return;
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
			return;
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			base_cur_nm(value);
			return;
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			ptax_cur_cd(value);
			return;
		}
		if ($ptax_cur_nm.equalsIgnoreCase(name)) {
			ptax_cur_nm(value);
			return;
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			purc_amt_rnd_typ(value);
			return;
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			purc_tax_rnd_typ(value);
			return;
		}
		if ($purc_slip_each_lot_typ.equalsIgnoreCase(name)) {
			purc_slip_each_lot_typ(value);
			return;
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			asppl_cd(value);
			return;
		}
		if ($asppl_nm.equalsIgnoreCase(name)) {
			asppl_nm(value);
			return;
		}
		if ($rcpt_iv_rmrks.equalsIgnoreCase(name)) {
			rcpt_iv_rmrks(value);
			return;
		}
		if ($rcpt_iv_intr_rmrks.equalsIgnoreCase(name)) {
			rcpt_iv_intr_rmrks(value);
			return;
		}
		if ($rcpt_iv_sub_char1.equalsIgnoreCase(name)) {
			rcpt_iv_sub_char1(value);
			return;
		}
		if ($rcpt_iv_sub_char2.equalsIgnoreCase(name)) {
			rcpt_iv_sub_char2(value);
			return;
		}
		if ($rcpt_iv_sub_char3.equalsIgnoreCase(name)) {
			rcpt_iv_sub_char3(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($po_print_rmrks.equalsIgnoreCase(name)) {
			po_print_rmrks(value);
			return;
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
			return;
		}
		if ($slo_trd_ptn_typ.equalsIgnoreCase(name)) {
			slo_trd_ptn_typ(value);
			return;
		}
		if ($slo_trd_ptn_typ_nm.equalsIgnoreCase(name)) {
			slo_trd_ptn_typ_nm(value);
			return;
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			sls_basis_typ(value);
			return;
		}
		if ($sls_basis_typ_nm.equalsIgnoreCase(name)) {
			sls_basis_typ_nm(value);
			return;
		}
		if ($slo_tterm_cd1.equalsIgnoreCase(name)) {
			slo_tterm_cd1(value);
			return;
		}
		if ($slo_tterm_nm1.equalsIgnoreCase(name)) {
			slo_tterm_nm1(value);
			return;
		}
		if ($slo_tterm_rmrks1.equalsIgnoreCase(name)) {
			slo_tterm_rmrks1(value);
			return;
		}
		if ($slo_tterm_cd2.equalsIgnoreCase(name)) {
			slo_tterm_cd2(value);
			return;
		}
		if ($slo_tterm_nm2.equalsIgnoreCase(name)) {
			slo_tterm_nm2(value);
			return;
		}
		if ($slo_tterm_rmrks2.equalsIgnoreCase(name)) {
			slo_tterm_rmrks2(value);
			return;
		}
		if ($slo_tterm_cd3.equalsIgnoreCase(name)) {
			slo_tterm_cd3(value);
			return;
		}
		if ($slo_tterm_nm3.equalsIgnoreCase(name)) {
			slo_tterm_nm3(value);
			return;
		}
		if ($slo_tterm_rmrks3.equalsIgnoreCase(name)) {
			slo_tterm_rmrks3(value);
			return;
		}
		if ($slo_cur_cd.equalsIgnoreCase(name)) {
			slo_cur_cd(value);
			return;
		}
		if ($slo_cur_nm.equalsIgnoreCase(name)) {
			slo_cur_nm(value);
			return;
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			ins_usr_id(value);
			return;
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			ins_usr_nm(value);
			return;
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			ins_func_id(value);
			return;
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			ins_func_nm(value);
			return;
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			upd_usr_id(value);
			return;
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			upd_usr_nm(value);
			return;
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			upd_func_id(value);
			return;
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			upd_func_nm(value);
			return;
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			upd_srv_req_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
			return;
		}
		if ($rcpt_iv_rev.equalsIgnoreCase(name)) {
			rcpt_iv_rev(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($src_xrate.equalsIgnoreCase(name)) {
			src_xrate(value);
			return;
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($src_ptax_xrate.equalsIgnoreCase(name)) {
			src_ptax_xrate(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($purc_act_upd_cntr.equalsIgnoreCase(name)) {
			purc_act_upd_cntr(value);
			return;
		}
		if ($rcpt_iv_upd_cntr.equalsIgnoreCase(name)) {
			rcpt_iv_upd_cntr(value);
			return;
		}
		if ($slo_xrate.equalsIgnoreCase(name)) {
			slo_xrate(value);
			return;
		}
		if ($slo_ptax_xrate.equalsIgnoreCase(name)) {
			slo_ptax_xrate(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
			return;
		}
		if ($rcpt_iv_rev.equalsIgnoreCase(name)) {
			rcpt_iv_rev(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($src_xrate.equalsIgnoreCase(name)) {
			src_xrate(value);
			return;
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($src_ptax_xrate.equalsIgnoreCase(name)) {
			src_ptax_xrate(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($purc_act_upd_cntr.equalsIgnoreCase(name)) {
			purc_act_upd_cntr(value);
			return;
		}
		if ($rcpt_iv_upd_cntr.equalsIgnoreCase(name)) {
			rcpt_iv_upd_cntr(value);
			return;
		}
		if ($slo_xrate.equalsIgnoreCase(name)) {
			slo_xrate(value);
			return;
		}
		if ($slo_ptax_xrate.equalsIgnoreCase(name)) {
			slo_ptax_xrate(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
			return;
		}
		if ($rcpt_iv_rev.equalsIgnoreCase(name)) {
			rcpt_iv_rev(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($src_xrate.equalsIgnoreCase(name)) {
			src_xrate(value);
			return;
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($src_ptax_xrate.equalsIgnoreCase(name)) {
			src_ptax_xrate(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($purc_act_upd_cntr.equalsIgnoreCase(name)) {
			purc_act_upd_cntr(value);
			return;
		}
		if ($rcpt_iv_upd_cntr.equalsIgnoreCase(name)) {
			rcpt_iv_upd_cntr(value);
			return;
		}
		if ($slo_xrate.equalsIgnoreCase(name)) {
			slo_xrate(value);
			return;
		}
		if ($slo_ptax_xrate.equalsIgnoreCase(name)) {
			slo_ptax_xrate(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
			return;
		}
		if ($rcpt_iv_rev.equalsIgnoreCase(name)) {
			rcpt_iv_rev(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($src_xrate.equalsIgnoreCase(name)) {
			src_xrate(value);
			return;
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($src_ptax_xrate.equalsIgnoreCase(name)) {
			src_ptax_xrate(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($purc_act_upd_cntr.equalsIgnoreCase(name)) {
			purc_act_upd_cntr(value);
			return;
		}
		if ($rcpt_iv_upd_cntr.equalsIgnoreCase(name)) {
			rcpt_iv_upd_cntr(value);
			return;
		}
		if ($slo_xrate.equalsIgnoreCase(name)) {
			slo_xrate(value);
			return;
		}
		if ($slo_ptax_xrate.equalsIgnoreCase(name)) {
			slo_ptax_xrate(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
			return;
		}
		if ($rcpt_iv_rev.equalsIgnoreCase(name)) {
			rcpt_iv_rev(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($src_xrate.equalsIgnoreCase(name)) {
			src_xrate(value);
			return;
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($src_ptax_xrate.equalsIgnoreCase(name)) {
			src_ptax_xrate(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($purc_act_upd_cntr.equalsIgnoreCase(name)) {
			purc_act_upd_cntr(value);
			return;
		}
		if ($rcpt_iv_upd_cntr.equalsIgnoreCase(name)) {
			rcpt_iv_upd_cntr(value);
			return;
		}
		if ($slo_xrate.equalsIgnoreCase(name)) {
			slo_xrate(value);
			return;
		}
		if ($slo_ptax_xrate.equalsIgnoreCase(name)) {
			slo_ptax_xrate(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
			return;
		}
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			purc_schd_dt(value);
			return;
		}
		if ($purc_dt.equalsIgnoreCase(name)) {
			purc_dt(value);
			return;
		}
		if ($iv_dt.equalsIgnoreCase(name)) {
			iv_dt(value);
			return;
		}
		if ($purc_ac_schd_dt.equalsIgnoreCase(name)) {
			purc_ac_schd_dt(value);
			return;
		}
		if ($xrate_base_dt.equalsIgnoreCase(name)) {
			xrate_base_dt(value);
			return;
		}
		if ($dpt_base_dt.equalsIgnoreCase(name)) {
			dpt_base_dt(value);
			return;
		}
		if ($pay_basis_dt.equalsIgnoreCase(name)) {
			pay_basis_dt(value);
			return;
		}
		if ($pay_schd_dt.equalsIgnoreCase(name)) {
			pay_schd_dt(value);
			return;
		}
		if ($etd_dt.equalsIgnoreCase(name)) {
			etd_dt(value);
			return;
		}
		if ($eta_dt.equalsIgnoreCase(name)) {
			eta_dt(value);
			return;
		}
		if ($via_schd_dt.equalsIgnoreCase(name)) {
			via_schd_dt(value);
			return;
		}
		if ($ptax_dt.equalsIgnoreCase(name)) {
			ptax_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setTimestampNE(String name, MCTimestamp value) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		super.setTimestampNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($fix_flg.equalsIgnoreCase(name)) {
			fix_flg(value);
			return;
		}
		if ($latest_flg.equalsIgnoreCase(name)) {
			latest_flg(value);
			return;
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			can_flg(value);
			return;
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			subcon_flg(value);
			return;
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			repurc_obli_flg(value);
			return;
		}
		if ($sppl_iv_flg.equalsIgnoreCase(name)) {
			sppl_iv_flg(value);
			return;
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			pay_spot_flg(value);
			return;
		}
		if ($ap_dpt_flg.equalsIgnoreCase(name)) {
			ap_dpt_flg(value);
			return;
		}
		if ($xrate_inpt_flg.equalsIgnoreCase(name)) {
			xrate_inpt_flg(value);
			return;
		}
		if ($ptax_xrate_inpt_flg.equalsIgnoreCase(name)) {
			ptax_xrate_inpt_flg(value);
			return;
		}
		if ($purc_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			purc_tax_cd_prio_flg(value);
			return;
		}
		if ($purc_upri_cng_flg.equalsIgnoreCase(name)) {
			purc_upri_cng_flg(value);
			return;
		}
		if ($edi_flg.equalsIgnoreCase(name)) {
			edi_flg(value);
			return;
		}
		if ($iv_reg_flg.equalsIgnoreCase(name)) {
			iv_reg_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($ac_dt_p.equalsIgnoreCase(name)) {
			return ac_dt_p();
		}
		if ($can_ac_dt_p.equalsIgnoreCase(name)) {
			return can_ac_dt_p();
		}
		if ($sppl_addr_p.equalsIgnoreCase(name)) {
			return sppl_addr_p();
		}
		if ($purc_usr_dpt_p.equalsIgnoreCase(name)) {
			return purc_usr_dpt_p();
		}
		if ($xrate_p.equalsIgnoreCase(name)) {
			return xrate_p();
		}
		if ($ptax_xrate_p.equalsIgnoreCase(name)) {
			return ptax_xrate_p();
		}
		if ($trd_cur_amt_p.equalsIgnoreCase(name)) {
			return trd_cur_amt_p();
		}
		if ($trd_cur_inc_tax_amt_p.equalsIgnoreCase(name)) {
			return trd_cur_inc_tax_amt_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($ac_dt_p.equalsIgnoreCase(name)) {
			ac_dt_p(
				((MCContainerMeta) ac_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0310.AcDtR.class, value)
			);
			return;
		}
		if ($can_ac_dt_p.equalsIgnoreCase(name)) {
			can_ac_dt_p(
				((MCContainerMeta) can_ac_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0330.CanAcDtR.class, value)
			);
			return;
		}
		if ($sppl_addr_p.equalsIgnoreCase(name)) {
			sppl_addr_p(
				((MCContainerMeta) sppl_addr_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0410.AddrR.class, value)
			);
			return;
		}
		if ($purc_usr_dpt_p.equalsIgnoreCase(name)) {
			purc_usr_dpt_p(
				((MCContainerMeta) purc_usr_dpt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0320.UsrDptR.class, value)
			);
			return;
		}
		if ($xrate_p.equalsIgnoreCase(name)) {
			xrate_p(
				((MCContainerMeta) xrate_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0420.XrateR.class, value)
			);
			return;
		}
		if ($ptax_xrate_p.equalsIgnoreCase(name)) {
			ptax_xrate_p(
				((MCContainerMeta) ptax_xrate_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0420.XrateR.class, value)
			);
			return;
		}
		if ($trd_cur_amt_p.equalsIgnoreCase(name)) {
			trd_cur_amt_p(
				((MCContainerMeta) trd_cur_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($trd_cur_inc_tax_amt_p.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt_p(
				((MCContainerMeta) trd_cur_inc_tax_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public MCDate ac_dt() {
		return ac_dt_p().ac_dt();
	}

	public void ac_dt(MCDate value) {
		ac_dt_p().ac_dt(value);
	}

	public MCDate can_ac_dt_for_input() {
		return can_ac_dt_p().can_ac_dt_for_input();
	}

	public void can_ac_dt_for_input(MCDate value) {
		can_ac_dt_p().can_ac_dt_for_input(value);
	}

	public MCDate can_ac_dt() {
		return can_ac_dt_p().can_ac_dt_for_call();
	}

	public void can_ac_dt(MCDate value) {
		can_ac_dt_p().can_ac_dt_for_call(value);
	}

	public MCDate ac_dt_after_srch() {
		return can_ac_dt_p().ac_dt_after_srch();
	}

	public void ac_dt_after_srch(MCDate value) {
		can_ac_dt_p().ac_dt_after_srch(value);
	}

	public String sppl_lg_grp_cd() {
		return sppl_addr_p().lg_grp_cd();
	}

	public void sppl_lg_grp_cd(String value) {
		sppl_addr_p().lg_grp_cd(value);
	}

	public String sppl_lg_grp_nm() {
		return sppl_addr_p().lg_grp_nm();
	}

	public void sppl_lg_grp_nm(String value) {
		sppl_addr_p().lg_grp_nm(value);
	}

	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public String sppl_cntry_cd() {
		return sppl_addr_p().cntry_cd();
	}

	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public void sppl_cntry_cd(String value) {
		sppl_addr_p().cntry_cd(value);
	}

	/**
	 * Country name 国名.<p>
	 *
	 */
	public String sppl_cntry_nm() {
		return sppl_addr_p().cntry_nm();
	}

	/**
	 * Country name 国名.<p>
	 *
	 */
	public void sppl_cntry_nm(String value) {
		sppl_addr_p().cntry_nm(value);
	}

	/**
	 * Zip code 郵便番号.<p>
	 *
	 */
	public String sppl_zip_cd() {
		return sppl_addr_p().zip_cd();
	}

	/**
	 * Zip code 郵便番号.<p>
	 *
	 */
	public void sppl_zip_cd(String value) {
		sppl_addr_p().zip_cd(value);
	}

	/**
	 * Address 1 住所１.<p>
	 *
	 */
	public String sppl_addr1() {
		return sppl_addr_p().addr1();
	}

	/**
	 * Address 1 住所１.<p>
	 *
	 */
	public void sppl_addr1(String value) {
		sppl_addr_p().addr1(value);
	}

	/**
	 * Address 2 住所２.<p>
	 *
	 */
	public String sppl_addr2() {
		return sppl_addr_p().addr2();
	}

	/**
	 * Address 2 住所２.<p>
	 *
	 */
	public void sppl_addr2(String value) {
		sppl_addr_p().addr2(value);
	}

	/**
	 * Address 3 住所３.<p>
	 *
	 */
	public String sppl_addr3() {
		return sppl_addr_p().addr3();
	}

	/**
	 * Address 3 住所３.<p>
	 *
	 */
	public void sppl_addr3(String value) {
		sppl_addr_p().addr3(value);
	}

	/**
	 * Address 4 住所４.<p>
	 *
	 */
	public String sppl_addr4() {
		return sppl_addr_p().addr4();
	}

	/**
	 * Address 4 住所４.<p>
	 *
	 */
	public void sppl_addr4(String value) {
		sppl_addr_p().addr4(value);
	}

	/**
	 * Dept. 部署.<p>
	 *
	 */
	public String sppl_cntct_dpt() {
		return sppl_addr_p().cntct_dpt();
	}

	/**
	 * Dept. 部署.<p>
	 *
	 */
	public void sppl_cntct_dpt(String value) {
		sppl_addr_p().cntct_dpt(value);
	}

	/**
	 * PIC 担当者.<p>
	 *
	 */
	public String sppl_cntct_psn() {
		return sppl_addr_p().cntct_psn();
	}

	/**
	 * PIC 担当者.<p>
	 *
	 */
	public void sppl_cntct_psn(String value) {
		sppl_addr_p().cntct_psn(value);
	}

	/**
	 * TEL ＴＥＬ.<p>
	 *
	 */
	public String sppl_tel() {
		return sppl_addr_p().tel();
	}

	/**
	 * TEL ＴＥＬ.<p>
	 *
	 */
	public void sppl_tel(String value) {
		sppl_addr_p().tel(value);
	}

	/**
	 * FAX ＦＡＸ.<p>
	 *
	 */
	public String sppl_fax() {
		return sppl_addr_p().fax();
	}

	/**
	 * FAX ＦＡＸ.<p>
	 *
	 */
	public void sppl_fax(String value) {
		sppl_addr_p().fax(value);
	}

	/**
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public String purc_usr_cd() {
		return purc_usr_dpt_p().usr_cd();
	}

	/**
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public void purc_usr_cd(String value) {
		purc_usr_dpt_p().usr_cd(value);
	}

	/**
	 * Purchasing PIC name 購買担当者名.<p>
	 *
	 */
	public String purc_usr_nm() {
		return purc_usr_dpt_p().usr_nm();
	}

	/**
	 * Purchasing PIC name 購買担当者名.<p>
	 *
	 */
	public void purc_usr_nm(String value) {
		purc_usr_dpt_p().usr_nm(value);
	}

	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public String purc_dpt_cd() {
		return purc_usr_dpt_p().dpt_cd();
	}

	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public void purc_dpt_cd(String value) {
		purc_usr_dpt_p().dpt_cd(value);
	}

	/**
	 * Purchasing dept. name 購買部門名.<p>
	 *
	 */
	public String purc_dpt_nm() {
		return purc_usr_dpt_p().dpt_nm();
	}

	/**
	 * Purchasing dept. name 購買部門名.<p>
	 *
	 */
	public void purc_dpt_nm(String value) {
		purc_usr_dpt_p().dpt_nm(value);
	}

	public MCNumber xrate() {
		return xrate_p().xrate();
	}

	public void xrate(MCNumber value) {
		xrate_p().xrate(value);
	}

	public void xrate(int value) {
		xrate_p().xrate(value);
	}

	public void xrate(long value) {
		xrate_p().xrate(value);
	}

	public void xrate(float value) {
		xrate_p().xrate(value);
	}

	public void xrate(double value) {
		xrate_p().xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public MCNumber ptax_xrate() {
		return ptax_xrate_p().xrate();
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(MCNumber value) {
		ptax_xrate_p().xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(int value) {
		ptax_xrate_p().xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(long value) {
		ptax_xrate_p().xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(float value) {
		ptax_xrate_p().xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(double value) {
		ptax_xrate_p().xrate(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return trd_cur_amt_p().amt();
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		trd_cur_amt_p().amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		trd_cur_amt_p().amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		trd_cur_amt_p().amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		trd_cur_amt_p().amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		trd_cur_amt_p().amt(value);
	}

	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public MCNumber trd_cur_inc_tax_amt() {
		return trd_cur_inc_tax_amt_p().amt();
	}

	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(MCNumber value) {
		trd_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(int value) {
		trd_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(long value) {
		trd_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(float value) {
		trd_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(double value) {
		trd_cur_inc_tax_amt_p().amt(value);
	}

}

