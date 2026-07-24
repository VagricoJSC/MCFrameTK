package mcframe.clientMABC.MABCP0570;

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
 * ブロック"Wrk1HdrAll"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Wrk1HdrAllR_MC_A extends MCConstRow {

	/**
	 * Select 選択.<p>
	 *
	 */
	public static final String $check = "check";
	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public static final String $bp_cd = "bp_cd";
	/**
	 * AP supplier 買掛先.<p>
	 *
	 */
	public static final String $asppl_flg = "asppl_flg";
	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public static final String $cntry_cd = "cntry_cd";
	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public static final String $asppl_cd = "asppl_cd";
	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public static final String $asppl_nm = "asppl_nm";
	/**
	 * Supplier dept. 発注先部署.<p>
	 *
	 */
	public static final String $sppl_cntct_dpt = "sppl_cntct_dpt";
	/**
	 * Supplier PIC 発注先担当者.<p>
	 *
	 */
	public static final String $sppl_cntct_psn = "sppl_cntct_psn";
	/**
	 * Supplier PIC form of address 発注先担当者敬称.<p>
	 *
	 */
	public static final String $sppl_cntct_psn_title = "sppl_cntct_psn_title";
	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public static final String $subcon_flg = "subcon_flg";
	/**
	 * Chargeable supplier 有償支給先.<p>
	 *
	 */
	public static final String $onr_prsppl_flg = "onr_prsppl_flg";
	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public static final String $repurc_obli_flg = "repurc_obli_flg";
	/**
	 * VMI purchasing dept. cd. ＶＭＩ購買部門ＣＤ.<p>
	 *
	 */
	public static final String $vmi_purc_dpt_cd = "vmi_purc_dpt_cd";
	/**
	 * VMI purchasing dept. name ＶＭＩ購買部門名.<p>
	 *
	 */
	public static final String $vmi_purc_dpt_nm = "vmi_purc_dpt_nm";
	/**
	 * VMI purchasing dept. cd. ＶＭＩ購買部門ＣＤ.<p>
	 *
	 */
	public static final String $check_vmi_purc_dpt_cd = "check_vmi_purc_dpt_cd";
	/**
	 * Purchase unit price acquisition type 購買単価取得区分.<p>
	 *
	 */
	public static final String $purc_upri_req_typ = "purc_upri_req_typ";
	/**
	 * Purchase unit price acquisition type name 購買単価取得区分名.<p>
	 *
	 */
	public static final String $purc_upri_req_typ_nm = "purc_upri_req_typ_nm";
	/**
	 * Allow purchasing unit price change 購買単価変更許可.<p>
	 *
	 */
	public static final String $purc_upri_cng_flg = "purc_upri_cng_flg";
	/**
	 * Check order promising 納期回答確認.<p>
	 *
	 */
	public static final String $prms_recv_flg = "prms_recv_flg";
	/**
	 * Rounding type (Purchase amount) 仕入金額端数処理区分.<p>
	 *
	 */
	public static final String $purc_amt_rnd_typ = "purc_amt_rnd_typ";
	/**
	 * Rounding type name (Purchase amount) 仕入金額端数処理区分名.<p>
	 *
	 */
	public static final String $purc_amt_rnd_typ_nm = "purc_amt_rnd_typ_nm";
	/**
	 * Purchase tax calculation type 仕入税計算区分.<p>
	 *
	 */
	public static final String $purc_tax_calc_typ = "purc_tax_calc_typ";
	/**
	 * Purchase tax calculation type name 仕入税計算区分名.<p>
	 *
	 */
	public static final String $purc_tax_calc_typ_nm = "purc_tax_calc_typ_nm";
	/**
	 * Rounding type (Purchase tax) 仕入税額端数処理区分.<p>
	 *
	 */
	public static final String $purc_tax_rnd_typ = "purc_tax_rnd_typ";
	/**
	 * Purchase tax amount rounding type 仕入税額端数処理区分名.<p>
	 *
	 */
	public static final String $purc_tax_rnd_typ_nm = "purc_tax_rnd_typ_nm";
	/**
	 * Purchase tax cd. 仕入税ＣＤ.<p>
	 *
	 */
	public static final String $purc_tax_cd = "purc_tax_cd";
	/**
	 * Purchase tax type name 仕入税名.<p>
	 *
	 */
	public static final String $purc_tax_nm = "purc_tax_nm";
	/**
	 * Purchase tax priority 仕入税優先.<p>
	 *
	 */
	public static final String $purc_tax_cd_prio_flg = "purc_tax_cd_prio_flg";
	/**
	 * Supplier calendar cd. 発注先カレンダＣＤ.<p>
	 *
	 */
	public static final String $sppl_cal_cd = "sppl_cal_cd";
	/**
	 * Supplier calendar name 発注先カレンダ名.<p>
	 *
	 */
	public static final String $sppl_cal_nm = "sppl_cal_nm";
	/**
	 * Display PO sheet cd. 注文書表示ＣＤ.<p>
	 *
	 */
	public static final String $po_print_cd = "po_print_cd";
	/**
	 * Display PO sheet name 注文書表示名.<p>
	 *
	 */
	public static final String $po_print_nm = "po_print_nm";
	/**
	 * Supplier delivery note cd. 発注先納品書ＣＤ.<p>
	 *
	 */
	public static final String $sppl_ship_form_cd = "sppl_ship_form_cd";
	/**
	 * Supplier delivery note name 発注先納品書名.<p>
	 *
	 */
	public static final String $sppl_ship_form_nm = "sppl_ship_form_nm";
	/**
	 * Delivery note at PO 発注時納品書.<p>
	 *
	 */
	public static final String $po_dlv_slip_flg = "po_dlv_slip_flg";
	/**
	 * Delivery note at delivery order 納入指示時納品書.<p>
	 *
	 */
	public static final String $dlv_inst_dlv_slip_flg = "dlv_inst_dlv_slip_flg";
	/**
	 * Delivery note at order promising result receipt 納期回答受領時納品書.<p>
	 *
	 */
	public static final String $prms_rcpt_dlv_slip_flg = "prms_rcpt_dlv_slip_flg";
	/**
	 * In-transit supply management type 支給積送管理区分.<p>
	 *
	 */
	public static final String $prov_rcv_typ = "prov_rcv_typ";
	/**
	 * Supply in-transit management type 支給積送管理区分名.<p>
	 *
	 */
	public static final String $prov_rcv_typ_nm = "prov_rcv_typ_nm";
	/**
	 * Purchase lot details split type 仕入ロット明細分割区分.<p>
	 *
	 */
	public static final String $purc_slip_each_lot_typ = "purc_slip_each_lot_typ";
	/**
	 * Purchase lot details split type name 仕入ロット明細分割区分名.<p>
	 *
	 */
	public static final String $purc_slip_each_lot_typ_nm = "purc_slip_each_lot_typ_nm";
	/**
	 * Supplier transaction terms cd. 1 発注先取引条件ＣＤ１.<p>
	 *
	 */
	public static final String $sppl_tterm_cd1 = "sppl_tterm_cd1";
	/**
	 * Supplier transaction terms name 1 発注先取引条件名１.<p>
	 *
	 */
	public static final String $sppl_tterm_nm1 = "sppl_tterm_nm1";
	/**
	 * Supplier transaction terms cd. 2 発注先取引条件ＣＤ２.<p>
	 *
	 */
	public static final String $sppl_tterm_cd2 = "sppl_tterm_cd2";
	/**
	 * Supplier transaction terms name 2 発注先取引条件名２.<p>
	 *
	 */
	public static final String $sppl_tterm_nm2 = "sppl_tterm_nm2";
	/**
	 * Supplier transaction terms cd. 3 発注先取引条件ＣＤ３.<p>
	 *
	 */
	public static final String $sppl_tterm_cd3 = "sppl_tterm_cd3";
	/**
	 * Supplier transaction terms name 3 発注先取引条件名３.<p>
	 *
	 */
	public static final String $sppl_tterm_nm3 = "sppl_tterm_nm3";
	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public static final String $pay_crryovr_times = "pay_crryovr_times";
	/**
	 * PO sheet by sales project 案件別注文書.<p>
	 *
	 */
	public static final String $wrk_po_flg = "wrk_po_flg";
	/**
	 * AP management by sales project 案件別債務管理.<p>
	 *
	 */
	public static final String $wrk_ap_flg = "wrk_ap_flg";
	/**
	 * Supplier invoice transaction 発注先インボイス取引.<p>
	 *
	 */
	public static final String $sppl_iv_flg = "sppl_iv_flg";
	/**
	 * Allow purchase invoice duplication 受領インボイス重複許可.<p>
	 *
	 */
	public static final String $rcpt_iv_dup_flg = "rcpt_iv_dup_flg";
	/**
	 * Subcontracting unit price type 外注単価区分.<p>
	 *
	 */
	public static final String $outsrc_upri_typ = "outsrc_upri_typ";
	/**
	 * Subcontracting unit price type name 外注単価区分名.<p>
	 *
	 */
	public static final String $outsrc_upri_typ_nm = "outsrc_upri_typ_nm";
	/**
	 * Purchase recording type 仕入計上区分.<p>
	 *
	 */
	public static final String $purc_basis_typ = "purc_basis_typ";
	/**
	 * Purchase recording type name 仕入計上区分名.<p>
	 *
	 */
	public static final String $purc_basis_typ_nm = "purc_basis_typ_nm";
	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public static final String $prov_basis_typ = "prov_basis_typ";
	/**
	 * Supply recording type name 支給計上区分名.<p>
	 *
	 */
	public static final String $prov_basis_typ_nm = "prov_basis_typ_nm";
	/**
	 * Allow supply unit price change 支給単価変更許可.<p>
	 *
	 */
	public static final String $prov_upri_cng_flg = "prov_upri_cng_flg";
	/**
	 * Supply tax cd. 支給税ＣＤ.<p>
	 *
	 */
	public static final String $prov_tax_cd = "prov_tax_cd";
	/**
	 * Supply tax name 支給税名.<p>
	 *
	 */
	public static final String $prov_tax_nm = "prov_tax_nm";
	/**
	 * Supply tax first 支給税優先.<p>
	 *
	 */
	public static final String $prov_tax_cd_prio_flg = "prov_tax_cd_prio_flg";
	/**
	 * Supply amount rounding type 支給金額端数処理区分.<p>
	 *
	 */
	public static final String $prov_amt_rnd_typ = "prov_amt_rnd_typ";
	/**
	 * Supply amount rounding type 支給金額端数処理区分名.<p>
	 *
	 */
	public static final String $prov_amt_rnd_typ_nm = "prov_amt_rnd_typ_nm";
	/**
	 * Supply tax calculation type 支給税計算区分.<p>
	 *
	 */
	public static final String $prov_tax_calc_typ = "prov_tax_calc_typ";
	/**
	 * Supply tax calculation type name 支給税計算区分名.<p>
	 *
	 */
	public static final String $prov_tax_calc_typ_nm = "prov_tax_calc_typ_nm";
	/**
	 * Supply tax rounding type 支給税額端数処理区分.<p>
	 *
	 */
	public static final String $prov_tax_rnd_typ = "prov_tax_rnd_typ";
	/**
	 * Supply tax amount rounding type 支給税額端数処理区分名.<p>
	 *
	 */
	public static final String $prov_tax_rnd_typ_nm = "prov_tax_rnd_typ_nm";
	/**
	 * Scheduled payee 支払予定管理先.<p>
	 *
	 */
	public static final String $bsppl_flg = "bsppl_flg";
	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public static final String $bsppl_cd = "bsppl_cd";
	/**
	 * Scheduled payee name 支払予定管理先名.<p>
	 *
	 */
	public static final String $bsppl_nm = "bsppl_nm";
	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public static final String $ap_dpt_cd = "ap_dpt_cd";
	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public static final String $ap_dpt_nm = "ap_dpt_nm";
	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public static final String $check_ap_dpt_cd = "check_ap_dpt_cd";
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
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public static final String $ins_ts = "ins_ts";
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
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";
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
	 * Update date and time 更新日時.<p>
	 *
	 */
	public static final String $upd_ts = "upd_ts";
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
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public static final String $upd_srv_req_no = "upd_srv_req_no";
	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public static final String $del_usr_id = "del_usr_id";
	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public static final String $del_usr_nm = "del_usr_nm";
	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public static final String $del_ts = "del_ts";
	/**
	 * Report issue type (Supplier) 帳票発行区分（発注先）.<p>
	 *
	 */
	public static final String $sppl_prnt_typ = "sppl_prnt_typ";
	/**
	 * Report issue type name (Supplier) 帳票発行区分名（発注先）.<p>
	 *
	 */
	public static final String $sppl_prnt_typ_nm = "sppl_prnt_typ_nm";


	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_cd_META = createCommonMeta($bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta asppl_flg_META = createCommonMeta($asppl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cntry_cd_META = createCommonMeta($cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta asppl_cd_META = createCommonMeta($asppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta asppl_nm_META = createCommonMeta($asppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta sppl_cntct_dpt_META = createCommonMeta($sppl_cntct_dpt, mcframe.commonMA.meta.MA_META.CNTCT_DPT);
	public static final MCMeta sppl_cntct_psn_META = createCommonMeta($sppl_cntct_psn, mcframe.commonMA.meta.MA_META.CNTCT_PSN);
	public static final MCMeta sppl_cntct_psn_title_META = createCommonMeta($sppl_cntct_psn_title, mcframe.commonMA.meta.MA_META.BP_PSN_TITLE);
	public static final MCMeta subcon_flg_META = createCommonMeta($subcon_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta onr_prsppl_flg_META = createCommonMeta($onr_prsppl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta repurc_obli_flg_META = createCommonMeta($repurc_obli_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta vmi_purc_dpt_cd_META = createCommonMeta($vmi_purc_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta vmi_purc_dpt_nm_META = createCommonMeta($vmi_purc_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta check_vmi_purc_dpt_cd_META = createCommonMeta($check_vmi_purc_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta purc_upri_req_typ_META = createCommonMeta($purc_upri_req_typ, mcframe.commonMA.meta.MA_META.PURC_UPRI_REQ_TYP);
	public static final MCMeta purc_upri_req_typ_nm_META = createCommonMeta($purc_upri_req_typ_nm, mcframe.commonMA.meta.MA_META.PURC_UPRI_REQ_TYP_NM);
	public static final MCMeta purc_upri_cng_flg_META = createCommonMeta($purc_upri_cng_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prms_recv_flg_META = createCommonMeta($prms_recv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_amt_rnd_typ_META = createCommonMeta($purc_amt_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta purc_amt_rnd_typ_nm_META = createCommonMeta($purc_amt_rnd_typ_nm, mcframe.commonMA.meta.MA_META.RND_TYP_NM);
	public static final MCMeta purc_tax_calc_typ_META = createCommonMeta($purc_tax_calc_typ, mcframe.commonMA.meta.MA_META.TAX_CALC_TYP);
	public static final MCMeta purc_tax_calc_typ_nm_META = createCommonMeta($purc_tax_calc_typ_nm, mcframe.commonMA.meta.MA_META.TAX_CALC_TYP_NM);
	public static final MCMeta purc_tax_rnd_typ_META = createCommonMeta($purc_tax_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta purc_tax_rnd_typ_nm_META = createCommonMeta($purc_tax_rnd_typ_nm, mcframe.commonMA.meta.MA_META.RND_TYP_NM);
	public static final MCMeta purc_tax_cd_META = createCommonMeta($purc_tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta purc_tax_nm_META = createCommonMeta($purc_tax_nm, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta purc_tax_cd_prio_flg_META = createCommonMeta($purc_tax_cd_prio_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_cal_cd_META = createCommonMeta($sppl_cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta sppl_cal_nm_META = createCommonMeta($sppl_cal_nm, mcframe.commonMA.meta.MA_META.CAL_NM);
	public static final MCMeta po_print_cd_META = createCommonMeta($po_print_cd, mcframe.commonMA.meta.MA_META.PO_PRINT_CD);
	public static final MCMeta po_print_nm_META = createCommonMeta($po_print_nm, mcframe.commonMA.meta.MA_META.PO_PRINT_NM);
	public static final MCMeta sppl_ship_form_cd_META = createCommonMeta($sppl_ship_form_cd, mcframe.commonMA.meta.MA_META.SLIP_FORM_CD);
	public static final MCMeta sppl_ship_form_nm_META = createCommonMeta($sppl_ship_form_nm, mcframe.commonMA.meta.MA_META.SLIP_FORM_NM);
	public static final MCMeta po_dlv_slip_flg_META = createCommonMeta($po_dlv_slip_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_inst_dlv_slip_flg_META = createCommonMeta($dlv_inst_dlv_slip_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prms_rcpt_dlv_slip_flg_META = createCommonMeta($prms_rcpt_dlv_slip_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prov_rcv_typ_META = createCommonMeta($prov_rcv_typ, mcframe.commonMA.meta.MA_META.PROV_RCV_TYP);
	public static final MCMeta prov_rcv_typ_nm_META = createCommonMeta($prov_rcv_typ_nm, mcframe.commonMA.meta.MA_META.PROV_RCV_TYP_NM);
	public static final MCMeta purc_slip_each_lot_typ_META = createCommonMeta($purc_slip_each_lot_typ, mcframe.commonMA.meta.MA_META.SLIP_EACH_LOT_TYP);
	public static final MCMeta purc_slip_each_lot_typ_nm_META = createCommonMeta($purc_slip_each_lot_typ_nm, mcframe.commonMA.meta.MA_META.SLIP_EACH_LOT_TYP_NM);
	public static final MCMeta sppl_tterm_cd1_META = createCommonMeta($sppl_tterm_cd1, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta sppl_tterm_nm1_META = createCommonMeta($sppl_tterm_nm1, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta sppl_tterm_cd2_META = createCommonMeta($sppl_tterm_cd2, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta sppl_tterm_nm2_META = createCommonMeta($sppl_tterm_nm2, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta sppl_tterm_cd3_META = createCommonMeta($sppl_tterm_cd3, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta sppl_tterm_nm3_META = createCommonMeta($sppl_tterm_nm3, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta pay_crryovr_times_META = createCommonMeta($pay_crryovr_times, mcframe.commonMA.meta.MA_META.CRRYOVR_TIMES);
	public static final MCMeta wrk_po_flg_META = createCommonMeta($wrk_po_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wrk_ap_flg_META = createCommonMeta($wrk_ap_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_iv_flg_META = createCommonMeta($sppl_iv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcpt_iv_dup_flg_META = createCommonMeta($rcpt_iv_dup_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta outsrc_upri_typ_META = createCommonMeta($outsrc_upri_typ, mcframe.commonMA.meta.MA_META.OUTSRC_UPRI_TYP);
	public static final MCMeta outsrc_upri_typ_nm_META = createCommonMeta($outsrc_upri_typ_nm, mcframe.commonMA.meta.MA_META.OUTSRC_UPRI_TYP_NM);
	public static final MCMeta purc_basis_typ_META = createCommonMeta($purc_basis_typ, mcframe.commonMA.meta.MA_META.PURC_BASIS_TYP);
	public static final MCMeta purc_basis_typ_nm_META = createCommonMeta($purc_basis_typ_nm, mcframe.commonMA.meta.MA_META.PURC_BASIS_TYP_NM);
	public static final MCMeta prov_basis_typ_META = createCommonMeta($prov_basis_typ, mcframe.commonMA.meta.MA_META.PROV_BASIS_TYP);
	public static final MCMeta prov_basis_typ_nm_META = createCommonMeta($prov_basis_typ_nm, mcframe.commonMA.meta.MA_META.PROV_BASIS_TYP_NM);
	public static final MCMeta prov_upri_cng_flg_META = createCommonMeta($prov_upri_cng_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prov_tax_cd_META = createCommonMeta($prov_tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta prov_tax_nm_META = createCommonMeta($prov_tax_nm, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta prov_tax_cd_prio_flg_META = createCommonMeta($prov_tax_cd_prio_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prov_amt_rnd_typ_META = createCommonMeta($prov_amt_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta prov_amt_rnd_typ_nm_META = createCommonMeta($prov_amt_rnd_typ_nm, mcframe.commonMA.meta.MA_META.RND_TYP_NM);
	public static final MCMeta prov_tax_calc_typ_META = createCommonMeta($prov_tax_calc_typ, mcframe.commonMA.meta.MA_META.TAX_CALC_TYP);
	public static final MCMeta prov_tax_calc_typ_nm_META = createCommonMeta($prov_tax_calc_typ_nm, mcframe.commonMA.meta.MA_META.TAX_CALC_TYP_NM);
	public static final MCMeta prov_tax_rnd_typ_META = createCommonMeta($prov_tax_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta prov_tax_rnd_typ_nm_META = createCommonMeta($prov_tax_rnd_typ_nm, mcframe.commonMA.meta.MA_META.RND_TYP_NM);
	public static final MCMeta bsppl_flg_META = createCommonMeta($bsppl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bsppl_cd_META = createCommonMeta($bsppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bsppl_nm_META = createCommonMeta($bsppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta ap_dpt_cd_META = createCommonMeta($ap_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ap_dpt_nm_META = createCommonMeta($ap_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta check_ap_dpt_cd_META = createCommonMeta($check_ap_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);
	public static final MCMeta del_usr_id_META = createCommonMeta($del_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta del_usr_nm_META = createCommonMeta($del_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta del_ts_META = createCommonMeta($del_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta sppl_prnt_typ_META = createCommonMeta($sppl_prnt_typ, mcframe.commonMA.meta.MA_META.PRNT_TYP);
	public static final MCMeta sppl_prnt_typ_nm_META = createCommonMeta($sppl_prnt_typ_nm, mcframe.commonMA.meta.MA_META.PRNT_TYP_NM);

	protected static final ConstMetaList<Wrk1HdrAllR> constMetas = new ConstMetaList<Wrk1HdrAllR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			bp_cd_META,
			asppl_flg_META,
			cntry_cd_META,
			asppl_cd_META,
			asppl_nm_META,
			sppl_cntct_dpt_META,
			sppl_cntct_psn_META,
			sppl_cntct_psn_title_META,
			subcon_flg_META,
			onr_prsppl_flg_META,
			repurc_obli_flg_META,
			vmi_purc_dpt_cd_META,
			vmi_purc_dpt_nm_META,
			check_vmi_purc_dpt_cd_META,
			purc_upri_req_typ_META,
			purc_upri_req_typ_nm_META,
			purc_upri_cng_flg_META,
			prms_recv_flg_META,
			purc_amt_rnd_typ_META,
			purc_amt_rnd_typ_nm_META,
			purc_tax_calc_typ_META,
			purc_tax_calc_typ_nm_META,
			purc_tax_rnd_typ_META,
			purc_tax_rnd_typ_nm_META,
			purc_tax_cd_META,
			purc_tax_nm_META,
			purc_tax_cd_prio_flg_META,
			sppl_cal_cd_META,
			sppl_cal_nm_META,
			po_print_cd_META,
			po_print_nm_META,
			sppl_ship_form_cd_META,
			sppl_ship_form_nm_META,
			po_dlv_slip_flg_META,
			dlv_inst_dlv_slip_flg_META,
			prms_rcpt_dlv_slip_flg_META,
			prov_rcv_typ_META,
			prov_rcv_typ_nm_META,
			purc_slip_each_lot_typ_META,
			purc_slip_each_lot_typ_nm_META,
			sppl_tterm_cd1_META,
			sppl_tterm_nm1_META,
			sppl_tterm_cd2_META,
			sppl_tterm_nm2_META,
			sppl_tterm_cd3_META,
			sppl_tterm_nm3_META,
			pay_crryovr_times_META,
			wrk_po_flg_META,
			wrk_ap_flg_META,
			sppl_iv_flg_META,
			rcpt_iv_dup_flg_META,
			outsrc_upri_typ_META,
			outsrc_upri_typ_nm_META,
			purc_basis_typ_META,
			purc_basis_typ_nm_META,
			prov_basis_typ_META,
			prov_basis_typ_nm_META,
			prov_upri_cng_flg_META,
			prov_tax_cd_META,
			prov_tax_nm_META,
			prov_tax_cd_prio_flg_META,
			prov_amt_rnd_typ_META,
			prov_amt_rnd_typ_nm_META,
			prov_tax_calc_typ_META,
			prov_tax_calc_typ_nm_META,
			prov_tax_rnd_typ_META,
			prov_tax_rnd_typ_nm_META,
			bsppl_flg_META,
			bsppl_cd_META,
			bsppl_nm_META,
			ap_dpt_cd_META,
			ap_dpt_nm_META,
			check_ap_dpt_cd_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_ts_META,
			ins_func_id_META,
			ins_func_nm_META,
			upd_cntr_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_ts_META,
			upd_func_id_META,
			upd_func_nm_META,
			upd_srv_req_no_META,
			del_usr_id_META,
			del_usr_nm_META,
			del_ts_META,
			sppl_prnt_typ_META,
			sppl_prnt_typ_nm_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
			$bp_cd	// bp_cd
		}
	);

	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$wrk_po_flg, "WRK"},	// wrk_po_flg
				{$wrk_ap_flg, "WRK"}	// wrk_ap_flg
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
	protected Wrk1HdrAllR_MC_A(ConstMetaList<? extends Wrk1HdrAllR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Wrk1HdrAllR clone() {
		return (Wrk1HdrAllR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Wrk1HdrAllR createInstance() {
		return (Wrk1HdrAllR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Wrk1HdrAllR getValues(String... names) {
		return (Wrk1HdrAllR) super.getValues(names);
	}



	/**
	 * Select 選択.<p>
	 *
	 */
	public boolean check() {
		return getConstBoolean(offset + 0, $check);
	}

	/**
	 * Select 選択.<p>
	 *
	 */
	public void check(boolean value) {
		setConstBoolean(offset + 0, $check, value);
	}


	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public String bp_cd() {
		return getConstString(offset + 1, $bp_cd);
	}

	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public void bp_cd(String value) {
		setConstString(offset + 1, $bp_cd, value);
	}


	/**
	 * AP supplier 買掛先.<p>
	 *
	 */
	public boolean asppl_flg() {
		return getConstBoolean(offset + 2, $asppl_flg);
	}

	/**
	 * AP supplier 買掛先.<p>
	 *
	 */
	public void asppl_flg(boolean value) {
		setConstBoolean(offset + 2, $asppl_flg, value);
	}


	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public String cntry_cd() {
		return getConstString(offset + 3, $cntry_cd);
	}

	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public void cntry_cd(String value) {
		setConstString(offset + 3, $cntry_cd, value);
	}


	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public String asppl_cd() {
		return getConstString(offset + 4, $asppl_cd);
	}

	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public void asppl_cd(String value) {
		setConstString(offset + 4, $asppl_cd, value);
	}


	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public String asppl_nm() {
		return getConstString(offset + 5, $asppl_nm);
	}

	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public void asppl_nm(String value) {
		setConstString(offset + 5, $asppl_nm, value);
	}


	/**
	 * Supplier dept. 発注先部署.<p>
	 *
	 */
	public String sppl_cntct_dpt() {
		return getConstString(offset + 6, $sppl_cntct_dpt);
	}

	/**
	 * Supplier dept. 発注先部署.<p>
	 *
	 */
	public void sppl_cntct_dpt(String value) {
		setConstString(offset + 6, $sppl_cntct_dpt, value);
	}


	/**
	 * Supplier PIC 発注先担当者.<p>
	 *
	 */
	public String sppl_cntct_psn() {
		return getConstString(offset + 7, $sppl_cntct_psn);
	}

	/**
	 * Supplier PIC 発注先担当者.<p>
	 *
	 */
	public void sppl_cntct_psn(String value) {
		setConstString(offset + 7, $sppl_cntct_psn, value);
	}


	/**
	 * Supplier PIC form of address 発注先担当者敬称.<p>
	 *
	 */
	public String sppl_cntct_psn_title() {
		return getConstString(offset + 8, $sppl_cntct_psn_title);
	}

	/**
	 * Supplier PIC form of address 発注先担当者敬称.<p>
	 *
	 */
	public void sppl_cntct_psn_title(String value) {
		setConstString(offset + 8, $sppl_cntct_psn_title, value);
	}


	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public boolean subcon_flg() {
		return getConstBoolean(offset + 9, $subcon_flg);
	}

	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public void subcon_flg(boolean value) {
		setConstBoolean(offset + 9, $subcon_flg, value);
	}


	/**
	 * Chargeable supplier 有償支給先.<p>
	 *
	 */
	public boolean onr_prsppl_flg() {
		return getConstBoolean(offset + 10, $onr_prsppl_flg);
	}

	/**
	 * Chargeable supplier 有償支給先.<p>
	 *
	 */
	public void onr_prsppl_flg(boolean value) {
		setConstBoolean(offset + 10, $onr_prsppl_flg, value);
	}


	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public boolean repurc_obli_flg() {
		return getConstBoolean(offset + 11, $repurc_obli_flg);
	}

	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public void repurc_obli_flg(boolean value) {
		setConstBoolean(offset + 11, $repurc_obli_flg, value);
	}


	/**
	 * VMI purchasing dept. cd. ＶＭＩ購買部門ＣＤ.<p>
	 *
	 */
	public String vmi_purc_dpt_cd() {
		return getConstString(offset + 12, $vmi_purc_dpt_cd);
	}

	/**
	 * VMI purchasing dept. cd. ＶＭＩ購買部門ＣＤ.<p>
	 *
	 */
	public void vmi_purc_dpt_cd(String value) {
		setConstString(offset + 12, $vmi_purc_dpt_cd, value);
	}


	/**
	 * VMI purchasing dept. name ＶＭＩ購買部門名.<p>
	 *
	 */
	public String vmi_purc_dpt_nm() {
		return getConstString(offset + 13, $vmi_purc_dpt_nm);
	}

	/**
	 * VMI purchasing dept. name ＶＭＩ購買部門名.<p>
	 *
	 */
	public void vmi_purc_dpt_nm(String value) {
		setConstString(offset + 13, $vmi_purc_dpt_nm, value);
	}


	/**
	 * VMI purchasing dept. cd. ＶＭＩ購買部門ＣＤ.<p>
	 *
	 */
	public String check_vmi_purc_dpt_cd() {
		return getConstString(offset + 14, $check_vmi_purc_dpt_cd);
	}

	/**
	 * VMI purchasing dept. cd. ＶＭＩ購買部門ＣＤ.<p>
	 *
	 */
	public void check_vmi_purc_dpt_cd(String value) {
		setConstString(offset + 14, $check_vmi_purc_dpt_cd, value);
	}


	/**
	 * Purchase unit price acquisition type 購買単価取得区分.<p>
	 *
	 */
	public String purc_upri_req_typ() {
		return getConstString(offset + 15, $purc_upri_req_typ);
	}

	/**
	 * Purchase unit price acquisition type 購買単価取得区分.<p>
	 *
	 */
	public void purc_upri_req_typ(String value) {
		setConstString(offset + 15, $purc_upri_req_typ, value);
	}


	/**
	 * Purchase unit price acquisition type name 購買単価取得区分名.<p>
	 *
	 */
	public String purc_upri_req_typ_nm() {
		return getConstString(offset + 16, $purc_upri_req_typ_nm);
	}

	/**
	 * Purchase unit price acquisition type name 購買単価取得区分名.<p>
	 *
	 */
	public void purc_upri_req_typ_nm(String value) {
		setConstString(offset + 16, $purc_upri_req_typ_nm, value);
	}


	/**
	 * Allow purchasing unit price change 購買単価変更許可.<p>
	 *
	 */
	public boolean purc_upri_cng_flg() {
		return getConstBoolean(offset + 17, $purc_upri_cng_flg);
	}

	/**
	 * Allow purchasing unit price change 購買単価変更許可.<p>
	 *
	 */
	public void purc_upri_cng_flg(boolean value) {
		setConstBoolean(offset + 17, $purc_upri_cng_flg, value);
	}


	/**
	 * Check order promising 納期回答確認.<p>
	 *
	 */
	public boolean prms_recv_flg() {
		return getConstBoolean(offset + 18, $prms_recv_flg);
	}

	/**
	 * Check order promising 納期回答確認.<p>
	 *
	 */
	public void prms_recv_flg(boolean value) {
		setConstBoolean(offset + 18, $prms_recv_flg, value);
	}


	/**
	 * Rounding type (Purchase amount) 仕入金額端数処理区分.<p>
	 *
	 */
	public String purc_amt_rnd_typ() {
		return getConstString(offset + 19, $purc_amt_rnd_typ);
	}

	/**
	 * Rounding type (Purchase amount) 仕入金額端数処理区分.<p>
	 *
	 */
	public void purc_amt_rnd_typ(String value) {
		setConstString(offset + 19, $purc_amt_rnd_typ, value);
	}


	/**
	 * Rounding type name (Purchase amount) 仕入金額端数処理区分名.<p>
	 *
	 */
	public String purc_amt_rnd_typ_nm() {
		return getConstString(offset + 20, $purc_amt_rnd_typ_nm);
	}

	/**
	 * Rounding type name (Purchase amount) 仕入金額端数処理区分名.<p>
	 *
	 */
	public void purc_amt_rnd_typ_nm(String value) {
		setConstString(offset + 20, $purc_amt_rnd_typ_nm, value);
	}


	/**
	 * Purchase tax calculation type 仕入税計算区分.<p>
	 *
	 */
	public String purc_tax_calc_typ() {
		return getConstString(offset + 21, $purc_tax_calc_typ);
	}

	/**
	 * Purchase tax calculation type 仕入税計算区分.<p>
	 *
	 */
	public void purc_tax_calc_typ(String value) {
		setConstString(offset + 21, $purc_tax_calc_typ, value);
	}


	/**
	 * Purchase tax calculation type name 仕入税計算区分名.<p>
	 *
	 */
	public String purc_tax_calc_typ_nm() {
		return getConstString(offset + 22, $purc_tax_calc_typ_nm);
	}

	/**
	 * Purchase tax calculation type name 仕入税計算区分名.<p>
	 *
	 */
	public void purc_tax_calc_typ_nm(String value) {
		setConstString(offset + 22, $purc_tax_calc_typ_nm, value);
	}


	/**
	 * Rounding type (Purchase tax) 仕入税額端数処理区分.<p>
	 *
	 */
	public String purc_tax_rnd_typ() {
		return getConstString(offset + 23, $purc_tax_rnd_typ);
	}

	/**
	 * Rounding type (Purchase tax) 仕入税額端数処理区分.<p>
	 *
	 */
	public void purc_tax_rnd_typ(String value) {
		setConstString(offset + 23, $purc_tax_rnd_typ, value);
	}


	/**
	 * Purchase tax amount rounding type 仕入税額端数処理区分名.<p>
	 *
	 */
	public String purc_tax_rnd_typ_nm() {
		return getConstString(offset + 24, $purc_tax_rnd_typ_nm);
	}

	/**
	 * Purchase tax amount rounding type 仕入税額端数処理区分名.<p>
	 *
	 */
	public void purc_tax_rnd_typ_nm(String value) {
		setConstString(offset + 24, $purc_tax_rnd_typ_nm, value);
	}


	/**
	 * Purchase tax cd. 仕入税ＣＤ.<p>
	 *
	 */
	public String purc_tax_cd() {
		return getConstString(offset + 25, $purc_tax_cd);
	}

	/**
	 * Purchase tax cd. 仕入税ＣＤ.<p>
	 *
	 */
	public void purc_tax_cd(String value) {
		setConstString(offset + 25, $purc_tax_cd, value);
	}


	/**
	 * Purchase tax type name 仕入税名.<p>
	 *
	 */
	public String purc_tax_nm() {
		return getConstString(offset + 26, $purc_tax_nm);
	}

	/**
	 * Purchase tax type name 仕入税名.<p>
	 *
	 */
	public void purc_tax_nm(String value) {
		setConstString(offset + 26, $purc_tax_nm, value);
	}


	/**
	 * Purchase tax priority 仕入税優先.<p>
	 *
	 */
	public boolean purc_tax_cd_prio_flg() {
		return getConstBoolean(offset + 27, $purc_tax_cd_prio_flg);
	}

	/**
	 * Purchase tax priority 仕入税優先.<p>
	 *
	 */
	public void purc_tax_cd_prio_flg(boolean value) {
		setConstBoolean(offset + 27, $purc_tax_cd_prio_flg, value);
	}


	/**
	 * Supplier calendar cd. 発注先カレンダＣＤ.<p>
	 *
	 */
	public String sppl_cal_cd() {
		return getConstString(offset + 28, $sppl_cal_cd);
	}

	/**
	 * Supplier calendar cd. 発注先カレンダＣＤ.<p>
	 *
	 */
	public void sppl_cal_cd(String value) {
		setConstString(offset + 28, $sppl_cal_cd, value);
	}


	/**
	 * Supplier calendar name 発注先カレンダ名.<p>
	 *
	 */
	public String sppl_cal_nm() {
		return getConstString(offset + 29, $sppl_cal_nm);
	}

	/**
	 * Supplier calendar name 発注先カレンダ名.<p>
	 *
	 */
	public void sppl_cal_nm(String value) {
		setConstString(offset + 29, $sppl_cal_nm, value);
	}


	/**
	 * Display PO sheet cd. 注文書表示ＣＤ.<p>
	 *
	 */
	public String po_print_cd() {
		return getConstString(offset + 30, $po_print_cd);
	}

	/**
	 * Display PO sheet cd. 注文書表示ＣＤ.<p>
	 *
	 */
	public void po_print_cd(String value) {
		setConstString(offset + 30, $po_print_cd, value);
	}


	/**
	 * Display PO sheet name 注文書表示名.<p>
	 *
	 */
	public String po_print_nm() {
		return getConstString(offset + 31, $po_print_nm);
	}

	/**
	 * Display PO sheet name 注文書表示名.<p>
	 *
	 */
	public void po_print_nm(String value) {
		setConstString(offset + 31, $po_print_nm, value);
	}


	/**
	 * Supplier delivery note cd. 発注先納品書ＣＤ.<p>
	 *
	 */
	public String sppl_ship_form_cd() {
		return getConstString(offset + 32, $sppl_ship_form_cd);
	}

	/**
	 * Supplier delivery note cd. 発注先納品書ＣＤ.<p>
	 *
	 */
	public void sppl_ship_form_cd(String value) {
		setConstString(offset + 32, $sppl_ship_form_cd, value);
	}


	/**
	 * Supplier delivery note name 発注先納品書名.<p>
	 *
	 */
	public String sppl_ship_form_nm() {
		return getConstString(offset + 33, $sppl_ship_form_nm);
	}

	/**
	 * Supplier delivery note name 発注先納品書名.<p>
	 *
	 */
	public void sppl_ship_form_nm(String value) {
		setConstString(offset + 33, $sppl_ship_form_nm, value);
	}


	/**
	 * Delivery note at PO 発注時納品書.<p>
	 *
	 */
	public boolean po_dlv_slip_flg() {
		return getConstBoolean(offset + 34, $po_dlv_slip_flg);
	}

	/**
	 * Delivery note at PO 発注時納品書.<p>
	 *
	 */
	public void po_dlv_slip_flg(boolean value) {
		setConstBoolean(offset + 34, $po_dlv_slip_flg, value);
	}


	/**
	 * Delivery note at delivery order 納入指示時納品書.<p>
	 *
	 */
	public boolean dlv_inst_dlv_slip_flg() {
		return getConstBoolean(offset + 35, $dlv_inst_dlv_slip_flg);
	}

	/**
	 * Delivery note at delivery order 納入指示時納品書.<p>
	 *
	 */
	public void dlv_inst_dlv_slip_flg(boolean value) {
		setConstBoolean(offset + 35, $dlv_inst_dlv_slip_flg, value);
	}


	/**
	 * Delivery note at order promising result receipt 納期回答受領時納品書.<p>
	 *
	 */
	public boolean prms_rcpt_dlv_slip_flg() {
		return getConstBoolean(offset + 36, $prms_rcpt_dlv_slip_flg);
	}

	/**
	 * Delivery note at order promising result receipt 納期回答受領時納品書.<p>
	 *
	 */
	public void prms_rcpt_dlv_slip_flg(boolean value) {
		setConstBoolean(offset + 36, $prms_rcpt_dlv_slip_flg, value);
	}


	/**
	 * In-transit supply management type 支給積送管理区分.<p>
	 *
	 */
	public String prov_rcv_typ() {
		return getConstString(offset + 37, $prov_rcv_typ);
	}

	/**
	 * In-transit supply management type 支給積送管理区分.<p>
	 *
	 */
	public void prov_rcv_typ(String value) {
		setConstString(offset + 37, $prov_rcv_typ, value);
	}


	/**
	 * Supply in-transit management type 支給積送管理区分名.<p>
	 *
	 */
	public String prov_rcv_typ_nm() {
		return getConstString(offset + 38, $prov_rcv_typ_nm);
	}

	/**
	 * Supply in-transit management type 支給積送管理区分名.<p>
	 *
	 */
	public void prov_rcv_typ_nm(String value) {
		setConstString(offset + 38, $prov_rcv_typ_nm, value);
	}


	/**
	 * Purchase lot details split type 仕入ロット明細分割区分.<p>
	 *
	 */
	public String purc_slip_each_lot_typ() {
		return getConstString(offset + 39, $purc_slip_each_lot_typ);
	}

	/**
	 * Purchase lot details split type 仕入ロット明細分割区分.<p>
	 *
	 */
	public void purc_slip_each_lot_typ(String value) {
		setConstString(offset + 39, $purc_slip_each_lot_typ, value);
	}


	/**
	 * Purchase lot details split type name 仕入ロット明細分割区分名.<p>
	 *
	 */
	public String purc_slip_each_lot_typ_nm() {
		return getConstString(offset + 40, $purc_slip_each_lot_typ_nm);
	}

	/**
	 * Purchase lot details split type name 仕入ロット明細分割区分名.<p>
	 *
	 */
	public void purc_slip_each_lot_typ_nm(String value) {
		setConstString(offset + 40, $purc_slip_each_lot_typ_nm, value);
	}


	/**
	 * Supplier transaction terms cd. 1 発注先取引条件ＣＤ１.<p>
	 *
	 */
	public String sppl_tterm_cd1() {
		return getConstString(offset + 41, $sppl_tterm_cd1);
	}

	/**
	 * Supplier transaction terms cd. 1 発注先取引条件ＣＤ１.<p>
	 *
	 */
	public void sppl_tterm_cd1(String value) {
		setConstString(offset + 41, $sppl_tterm_cd1, value);
	}


	/**
	 * Supplier transaction terms name 1 発注先取引条件名１.<p>
	 *
	 */
	public String sppl_tterm_nm1() {
		return getConstString(offset + 42, $sppl_tterm_nm1);
	}

	/**
	 * Supplier transaction terms name 1 発注先取引条件名１.<p>
	 *
	 */
	public void sppl_tterm_nm1(String value) {
		setConstString(offset + 42, $sppl_tterm_nm1, value);
	}


	/**
	 * Supplier transaction terms cd. 2 発注先取引条件ＣＤ２.<p>
	 *
	 */
	public String sppl_tterm_cd2() {
		return getConstString(offset + 43, $sppl_tterm_cd2);
	}

	/**
	 * Supplier transaction terms cd. 2 発注先取引条件ＣＤ２.<p>
	 *
	 */
	public void sppl_tterm_cd2(String value) {
		setConstString(offset + 43, $sppl_tterm_cd2, value);
	}


	/**
	 * Supplier transaction terms name 2 発注先取引条件名２.<p>
	 *
	 */
	public String sppl_tterm_nm2() {
		return getConstString(offset + 44, $sppl_tterm_nm2);
	}

	/**
	 * Supplier transaction terms name 2 発注先取引条件名２.<p>
	 *
	 */
	public void sppl_tterm_nm2(String value) {
		setConstString(offset + 44, $sppl_tterm_nm2, value);
	}


	/**
	 * Supplier transaction terms cd. 3 発注先取引条件ＣＤ３.<p>
	 *
	 */
	public String sppl_tterm_cd3() {
		return getConstString(offset + 45, $sppl_tterm_cd3);
	}

	/**
	 * Supplier transaction terms cd. 3 発注先取引条件ＣＤ３.<p>
	 *
	 */
	public void sppl_tterm_cd3(String value) {
		setConstString(offset + 45, $sppl_tterm_cd3, value);
	}


	/**
	 * Supplier transaction terms name 3 発注先取引条件名３.<p>
	 *
	 */
	public String sppl_tterm_nm3() {
		return getConstString(offset + 46, $sppl_tterm_nm3);
	}

	/**
	 * Supplier transaction terms name 3 発注先取引条件名３.<p>
	 *
	 */
	public void sppl_tterm_nm3(String value) {
		setConstString(offset + 46, $sppl_tterm_nm3, value);
	}


	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public MCNumber pay_crryovr_times() {
		return getConstNumber(offset + 47, $pay_crryovr_times);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(MCNumber value) {
		setConstNumber(offset + 47, $pay_crryovr_times, value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(int value) {
		setConstNumber(offset + 47, $pay_crryovr_times, value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(long value) {
		setConstNumber(offset + 47, $pay_crryovr_times, value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(float value) {
		setConstNumber(offset + 47, $pay_crryovr_times, value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(double value) {
		setConstNumber(offset + 47, $pay_crryovr_times, value);
	}


	/**
	 * PO sheet by sales project 案件別注文書.<p>
	 *
	 */
	public boolean wrk_po_flg() {
		return getConstBoolean(offset + 48, $wrk_po_flg);
	}

	/**
	 * PO sheet by sales project 案件別注文書.<p>
	 *
	 */
	public void wrk_po_flg(boolean value) {
		setConstBoolean(offset + 48, $wrk_po_flg, value);
	}


	/**
	 * AP management by sales project 案件別債務管理.<p>
	 *
	 */
	public boolean wrk_ap_flg() {
		return getConstBoolean(offset + 49, $wrk_ap_flg);
	}

	/**
	 * AP management by sales project 案件別債務管理.<p>
	 *
	 */
	public void wrk_ap_flg(boolean value) {
		setConstBoolean(offset + 49, $wrk_ap_flg, value);
	}


	/**
	 * Supplier invoice transaction 発注先インボイス取引.<p>
	 *
	 */
	public boolean sppl_iv_flg() {
		return getConstBoolean(offset + 50, $sppl_iv_flg);
	}

	/**
	 * Supplier invoice transaction 発注先インボイス取引.<p>
	 *
	 */
	public void sppl_iv_flg(boolean value) {
		setConstBoolean(offset + 50, $sppl_iv_flg, value);
	}


	/**
	 * Allow purchase invoice duplication 受領インボイス重複許可.<p>
	 *
	 */
	public boolean rcpt_iv_dup_flg() {
		return getConstBoolean(offset + 51, $rcpt_iv_dup_flg);
	}

	/**
	 * Allow purchase invoice duplication 受領インボイス重複許可.<p>
	 *
	 */
	public void rcpt_iv_dup_flg(boolean value) {
		setConstBoolean(offset + 51, $rcpt_iv_dup_flg, value);
	}


	/**
	 * Subcontracting unit price type 外注単価区分.<p>
	 *
	 */
	public String outsrc_upri_typ() {
		return getConstString(offset + 52, $outsrc_upri_typ);
	}

	/**
	 * Subcontracting unit price type 外注単価区分.<p>
	 *
	 */
	public void outsrc_upri_typ(String value) {
		setConstString(offset + 52, $outsrc_upri_typ, value);
	}


	/**
	 * Subcontracting unit price type name 外注単価区分名.<p>
	 *
	 */
	public String outsrc_upri_typ_nm() {
		return getConstString(offset + 53, $outsrc_upri_typ_nm);
	}

	/**
	 * Subcontracting unit price type name 外注単価区分名.<p>
	 *
	 */
	public void outsrc_upri_typ_nm(String value) {
		setConstString(offset + 53, $outsrc_upri_typ_nm, value);
	}


	/**
	 * Purchase recording type 仕入計上区分.<p>
	 *
	 */
	public String purc_basis_typ() {
		return getConstString(offset + 54, $purc_basis_typ);
	}

	/**
	 * Purchase recording type 仕入計上区分.<p>
	 *
	 */
	public void purc_basis_typ(String value) {
		setConstString(offset + 54, $purc_basis_typ, value);
	}


	/**
	 * Purchase recording type name 仕入計上区分名.<p>
	 *
	 */
	public String purc_basis_typ_nm() {
		return getConstString(offset + 55, $purc_basis_typ_nm);
	}

	/**
	 * Purchase recording type name 仕入計上区分名.<p>
	 *
	 */
	public void purc_basis_typ_nm(String value) {
		setConstString(offset + 55, $purc_basis_typ_nm, value);
	}


	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public String prov_basis_typ() {
		return getConstString(offset + 56, $prov_basis_typ);
	}

	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public void prov_basis_typ(String value) {
		setConstString(offset + 56, $prov_basis_typ, value);
	}


	/**
	 * Supply recording type name 支給計上区分名.<p>
	 *
	 */
	public String prov_basis_typ_nm() {
		return getConstString(offset + 57, $prov_basis_typ_nm);
	}

	/**
	 * Supply recording type name 支給計上区分名.<p>
	 *
	 */
	public void prov_basis_typ_nm(String value) {
		setConstString(offset + 57, $prov_basis_typ_nm, value);
	}


	/**
	 * Allow supply unit price change 支給単価変更許可.<p>
	 *
	 */
	public boolean prov_upri_cng_flg() {
		return getConstBoolean(offset + 58, $prov_upri_cng_flg);
	}

	/**
	 * Allow supply unit price change 支給単価変更許可.<p>
	 *
	 */
	public void prov_upri_cng_flg(boolean value) {
		setConstBoolean(offset + 58, $prov_upri_cng_flg, value);
	}


	/**
	 * Supply tax cd. 支給税ＣＤ.<p>
	 *
	 */
	public String prov_tax_cd() {
		return getConstString(offset + 59, $prov_tax_cd);
	}

	/**
	 * Supply tax cd. 支給税ＣＤ.<p>
	 *
	 */
	public void prov_tax_cd(String value) {
		setConstString(offset + 59, $prov_tax_cd, value);
	}


	/**
	 * Supply tax name 支給税名.<p>
	 *
	 */
	public String prov_tax_nm() {
		return getConstString(offset + 60, $prov_tax_nm);
	}

	/**
	 * Supply tax name 支給税名.<p>
	 *
	 */
	public void prov_tax_nm(String value) {
		setConstString(offset + 60, $prov_tax_nm, value);
	}


	/**
	 * Supply tax first 支給税優先.<p>
	 *
	 */
	public boolean prov_tax_cd_prio_flg() {
		return getConstBoolean(offset + 61, $prov_tax_cd_prio_flg);
	}

	/**
	 * Supply tax first 支給税優先.<p>
	 *
	 */
	public void prov_tax_cd_prio_flg(boolean value) {
		setConstBoolean(offset + 61, $prov_tax_cd_prio_flg, value);
	}


	/**
	 * Supply amount rounding type 支給金額端数処理区分.<p>
	 *
	 */
	public String prov_amt_rnd_typ() {
		return getConstString(offset + 62, $prov_amt_rnd_typ);
	}

	/**
	 * Supply amount rounding type 支給金額端数処理区分.<p>
	 *
	 */
	public void prov_amt_rnd_typ(String value) {
		setConstString(offset + 62, $prov_amt_rnd_typ, value);
	}


	/**
	 * Supply amount rounding type 支給金額端数処理区分名.<p>
	 *
	 */
	public String prov_amt_rnd_typ_nm() {
		return getConstString(offset + 63, $prov_amt_rnd_typ_nm);
	}

	/**
	 * Supply amount rounding type 支給金額端数処理区分名.<p>
	 *
	 */
	public void prov_amt_rnd_typ_nm(String value) {
		setConstString(offset + 63, $prov_amt_rnd_typ_nm, value);
	}


	/**
	 * Supply tax calculation type 支給税計算区分.<p>
	 *
	 */
	public String prov_tax_calc_typ() {
		return getConstString(offset + 64, $prov_tax_calc_typ);
	}

	/**
	 * Supply tax calculation type 支給税計算区分.<p>
	 *
	 */
	public void prov_tax_calc_typ(String value) {
		setConstString(offset + 64, $prov_tax_calc_typ, value);
	}


	/**
	 * Supply tax calculation type name 支給税計算区分名.<p>
	 *
	 */
	public String prov_tax_calc_typ_nm() {
		return getConstString(offset + 65, $prov_tax_calc_typ_nm);
	}

	/**
	 * Supply tax calculation type name 支給税計算区分名.<p>
	 *
	 */
	public void prov_tax_calc_typ_nm(String value) {
		setConstString(offset + 65, $prov_tax_calc_typ_nm, value);
	}


	/**
	 * Supply tax rounding type 支給税額端数処理区分.<p>
	 *
	 */
	public String prov_tax_rnd_typ() {
		return getConstString(offset + 66, $prov_tax_rnd_typ);
	}

	/**
	 * Supply tax rounding type 支給税額端数処理区分.<p>
	 *
	 */
	public void prov_tax_rnd_typ(String value) {
		setConstString(offset + 66, $prov_tax_rnd_typ, value);
	}


	/**
	 * Supply tax amount rounding type 支給税額端数処理区分名.<p>
	 *
	 */
	public String prov_tax_rnd_typ_nm() {
		return getConstString(offset + 67, $prov_tax_rnd_typ_nm);
	}

	/**
	 * Supply tax amount rounding type 支給税額端数処理区分名.<p>
	 *
	 */
	public void prov_tax_rnd_typ_nm(String value) {
		setConstString(offset + 67, $prov_tax_rnd_typ_nm, value);
	}


	/**
	 * Scheduled payee 支払予定管理先.<p>
	 *
	 */
	public boolean bsppl_flg() {
		return getConstBoolean(offset + 68, $bsppl_flg);
	}

	/**
	 * Scheduled payee 支払予定管理先.<p>
	 *
	 */
	public void bsppl_flg(boolean value) {
		setConstBoolean(offset + 68, $bsppl_flg, value);
	}


	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public String bsppl_cd() {
		return getConstString(offset + 69, $bsppl_cd);
	}

	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public void bsppl_cd(String value) {
		setConstString(offset + 69, $bsppl_cd, value);
	}


	/**
	 * Scheduled payee name 支払予定管理先名.<p>
	 *
	 */
	public String bsppl_nm() {
		return getConstString(offset + 70, $bsppl_nm);
	}

	/**
	 * Scheduled payee name 支払予定管理先名.<p>
	 *
	 */
	public void bsppl_nm(String value) {
		setConstString(offset + 70, $bsppl_nm, value);
	}


	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public String ap_dpt_cd() {
		return getConstString(offset + 71, $ap_dpt_cd);
	}

	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public void ap_dpt_cd(String value) {
		setConstString(offset + 71, $ap_dpt_cd, value);
	}


	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public String ap_dpt_nm() {
		return getConstString(offset + 72, $ap_dpt_nm);
	}

	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public void ap_dpt_nm(String value) {
		setConstString(offset + 72, $ap_dpt_nm, value);
	}


	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public String check_ap_dpt_cd() {
		return getConstString(offset + 73, $check_ap_dpt_cd);
	}

	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public void check_ap_dpt_cd(String value) {
		setConstString(offset + 73, $check_ap_dpt_cd, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 74, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 74, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 75, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 75, $ins_usr_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 76, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 76, $ins_ts, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 77, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 77, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 78, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 78, $ins_func_nm, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 79, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 79, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 79, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 79, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 79, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 79, $upd_cntr, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 80, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 80, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 81, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 81, $upd_usr_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 82, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 82, $upd_ts, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 83, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 83, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 84, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 84, $upd_func_nm, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 85, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 85, $upd_srv_req_no, value);
	}


	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 86, $del_usr_id);
	}

	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 86, $del_usr_id, value);
	}


	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 87, $del_usr_nm);
	}

	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 87, $del_usr_nm, value);
	}


	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 88, $del_ts);
	}

	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 88, $del_ts, value);
	}


	/**
	 * Report issue type (Supplier) 帳票発行区分（発注先）.<p>
	 *
	 */
	public String sppl_prnt_typ() {
		return getConstString(offset + 89, $sppl_prnt_typ);
	}

	/**
	 * Report issue type (Supplier) 帳票発行区分（発注先）.<p>
	 *
	 */
	public void sppl_prnt_typ(String value) {
		setConstString(offset + 89, $sppl_prnt_typ, value);
	}


	/**
	 * Report issue type name (Supplier) 帳票発行区分名（発注先）.<p>
	 *
	 */
	public String sppl_prnt_typ_nm() {
		return getConstString(offset + 90, $sppl_prnt_typ_nm);
	}

	/**
	 * Report issue type name (Supplier) 帳票発行区分名（発注先）.<p>
	 *
	 */
	public void sppl_prnt_typ_nm(String value) {
		setConstString(offset + 90, $sppl_prnt_typ_nm, value);
	}


	public String getString(String name) {
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			return cntry_cd();
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			return asppl_cd();
		}
		if ($asppl_nm.equalsIgnoreCase(name)) {
			return asppl_nm();
		}
		if ($sppl_cntct_dpt.equalsIgnoreCase(name)) {
			return sppl_cntct_dpt();
		}
		if ($sppl_cntct_psn.equalsIgnoreCase(name)) {
			return sppl_cntct_psn();
		}
		if ($sppl_cntct_psn_title.equalsIgnoreCase(name)) {
			return sppl_cntct_psn_title();
		}
		if ($vmi_purc_dpt_cd.equalsIgnoreCase(name)) {
			return vmi_purc_dpt_cd();
		}
		if ($vmi_purc_dpt_nm.equalsIgnoreCase(name)) {
			return vmi_purc_dpt_nm();
		}
		if ($check_vmi_purc_dpt_cd.equalsIgnoreCase(name)) {
			return check_vmi_purc_dpt_cd();
		}
		if ($purc_upri_req_typ.equalsIgnoreCase(name)) {
			return purc_upri_req_typ();
		}
		if ($purc_upri_req_typ_nm.equalsIgnoreCase(name)) {
			return purc_upri_req_typ_nm();
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			return purc_amt_rnd_typ();
		}
		if ($purc_amt_rnd_typ_nm.equalsIgnoreCase(name)) {
			return purc_amt_rnd_typ_nm();
		}
		if ($purc_tax_calc_typ.equalsIgnoreCase(name)) {
			return purc_tax_calc_typ();
		}
		if ($purc_tax_calc_typ_nm.equalsIgnoreCase(name)) {
			return purc_tax_calc_typ_nm();
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			return purc_tax_rnd_typ();
		}
		if ($purc_tax_rnd_typ_nm.equalsIgnoreCase(name)) {
			return purc_tax_rnd_typ_nm();
		}
		if ($purc_tax_cd.equalsIgnoreCase(name)) {
			return purc_tax_cd();
		}
		if ($purc_tax_nm.equalsIgnoreCase(name)) {
			return purc_tax_nm();
		}
		if ($sppl_cal_cd.equalsIgnoreCase(name)) {
			return sppl_cal_cd();
		}
		if ($sppl_cal_nm.equalsIgnoreCase(name)) {
			return sppl_cal_nm();
		}
		if ($po_print_cd.equalsIgnoreCase(name)) {
			return po_print_cd();
		}
		if ($po_print_nm.equalsIgnoreCase(name)) {
			return po_print_nm();
		}
		if ($sppl_ship_form_cd.equalsIgnoreCase(name)) {
			return sppl_ship_form_cd();
		}
		if ($sppl_ship_form_nm.equalsIgnoreCase(name)) {
			return sppl_ship_form_nm();
		}
		if ($prov_rcv_typ.equalsIgnoreCase(name)) {
			return prov_rcv_typ();
		}
		if ($prov_rcv_typ_nm.equalsIgnoreCase(name)) {
			return prov_rcv_typ_nm();
		}
		if ($purc_slip_each_lot_typ.equalsIgnoreCase(name)) {
			return purc_slip_each_lot_typ();
		}
		if ($purc_slip_each_lot_typ_nm.equalsIgnoreCase(name)) {
			return purc_slip_each_lot_typ_nm();
		}
		if ($sppl_tterm_cd1.equalsIgnoreCase(name)) {
			return sppl_tterm_cd1();
		}
		if ($sppl_tterm_nm1.equalsIgnoreCase(name)) {
			return sppl_tterm_nm1();
		}
		if ($sppl_tterm_cd2.equalsIgnoreCase(name)) {
			return sppl_tterm_cd2();
		}
		if ($sppl_tterm_nm2.equalsIgnoreCase(name)) {
			return sppl_tterm_nm2();
		}
		if ($sppl_tterm_cd3.equalsIgnoreCase(name)) {
			return sppl_tterm_cd3();
		}
		if ($sppl_tterm_nm3.equalsIgnoreCase(name)) {
			return sppl_tterm_nm3();
		}
		if ($outsrc_upri_typ.equalsIgnoreCase(name)) {
			return outsrc_upri_typ();
		}
		if ($outsrc_upri_typ_nm.equalsIgnoreCase(name)) {
			return outsrc_upri_typ_nm();
		}
		if ($purc_basis_typ.equalsIgnoreCase(name)) {
			return purc_basis_typ();
		}
		if ($purc_basis_typ_nm.equalsIgnoreCase(name)) {
			return purc_basis_typ_nm();
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			return prov_basis_typ();
		}
		if ($prov_basis_typ_nm.equalsIgnoreCase(name)) {
			return prov_basis_typ_nm();
		}
		if ($prov_tax_cd.equalsIgnoreCase(name)) {
			return prov_tax_cd();
		}
		if ($prov_tax_nm.equalsIgnoreCase(name)) {
			return prov_tax_nm();
		}
		if ($prov_amt_rnd_typ.equalsIgnoreCase(name)) {
			return prov_amt_rnd_typ();
		}
		if ($prov_amt_rnd_typ_nm.equalsIgnoreCase(name)) {
			return prov_amt_rnd_typ_nm();
		}
		if ($prov_tax_calc_typ.equalsIgnoreCase(name)) {
			return prov_tax_calc_typ();
		}
		if ($prov_tax_calc_typ_nm.equalsIgnoreCase(name)) {
			return prov_tax_calc_typ_nm();
		}
		if ($prov_tax_rnd_typ.equalsIgnoreCase(name)) {
			return prov_tax_rnd_typ();
		}
		if ($prov_tax_rnd_typ_nm.equalsIgnoreCase(name)) {
			return prov_tax_rnd_typ_nm();
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			return bsppl_cd();
		}
		if ($bsppl_nm.equalsIgnoreCase(name)) {
			return bsppl_nm();
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			return ap_dpt_nm();
		}
		if ($check_ap_dpt_cd.equalsIgnoreCase(name)) {
			return check_ap_dpt_cd();
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
		if ($del_usr_id.equalsIgnoreCase(name)) {
			return del_usr_id();
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			return del_usr_nm();
		}
		if ($sppl_prnt_typ.equalsIgnoreCase(name)) {
			return sppl_prnt_typ();
		}
		if ($sppl_prnt_typ_nm.equalsIgnoreCase(name)) {
			return sppl_prnt_typ_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			return pay_crryovr_times();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCTimestamp getTimestamp(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		if ($del_ts.equalsIgnoreCase(name)) {
			return del_ts();
		}
		return super.getTimestamp(name);
	}
	public boolean getBoolean(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($asppl_flg.equalsIgnoreCase(name)) {
			return asppl_flg();
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			return subcon_flg();
		}
		if ($onr_prsppl_flg.equalsIgnoreCase(name)) {
			return onr_prsppl_flg();
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			return repurc_obli_flg();
		}
		if ($purc_upri_cng_flg.equalsIgnoreCase(name)) {
			return purc_upri_cng_flg();
		}
		if ($prms_recv_flg.equalsIgnoreCase(name)) {
			return prms_recv_flg();
		}
		if ($purc_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			return purc_tax_cd_prio_flg();
		}
		if ($po_dlv_slip_flg.equalsIgnoreCase(name)) {
			return po_dlv_slip_flg();
		}
		if ($dlv_inst_dlv_slip_flg.equalsIgnoreCase(name)) {
			return dlv_inst_dlv_slip_flg();
		}
		if ($prms_rcpt_dlv_slip_flg.equalsIgnoreCase(name)) {
			return prms_rcpt_dlv_slip_flg();
		}
		if ($wrk_po_flg.equalsIgnoreCase(name)) {
			return wrk_po_flg();
		}
		if ($wrk_ap_flg.equalsIgnoreCase(name)) {
			return wrk_ap_flg();
		}
		if ($sppl_iv_flg.equalsIgnoreCase(name)) {
			return sppl_iv_flg();
		}
		if ($rcpt_iv_dup_flg.equalsIgnoreCase(name)) {
			return rcpt_iv_dup_flg();
		}
		if ($prov_upri_cng_flg.equalsIgnoreCase(name)) {
			return prov_upri_cng_flg();
		}
		if ($prov_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			return prov_tax_cd_prio_flg();
		}
		if ($bsppl_flg.equalsIgnoreCase(name)) {
			return bsppl_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			return cntry_cd();
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			return asppl_cd();
		}
		if ($asppl_nm.equalsIgnoreCase(name)) {
			return asppl_nm();
		}
		if ($sppl_cntct_dpt.equalsIgnoreCase(name)) {
			return sppl_cntct_dpt();
		}
		if ($sppl_cntct_psn.equalsIgnoreCase(name)) {
			return sppl_cntct_psn();
		}
		if ($sppl_cntct_psn_title.equalsIgnoreCase(name)) {
			return sppl_cntct_psn_title();
		}
		if ($vmi_purc_dpt_cd.equalsIgnoreCase(name)) {
			return vmi_purc_dpt_cd();
		}
		if ($vmi_purc_dpt_nm.equalsIgnoreCase(name)) {
			return vmi_purc_dpt_nm();
		}
		if ($check_vmi_purc_dpt_cd.equalsIgnoreCase(name)) {
			return check_vmi_purc_dpt_cd();
		}
		if ($purc_upri_req_typ.equalsIgnoreCase(name)) {
			return purc_upri_req_typ();
		}
		if ($purc_upri_req_typ_nm.equalsIgnoreCase(name)) {
			return purc_upri_req_typ_nm();
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			return purc_amt_rnd_typ();
		}
		if ($purc_amt_rnd_typ_nm.equalsIgnoreCase(name)) {
			return purc_amt_rnd_typ_nm();
		}
		if ($purc_tax_calc_typ.equalsIgnoreCase(name)) {
			return purc_tax_calc_typ();
		}
		if ($purc_tax_calc_typ_nm.equalsIgnoreCase(name)) {
			return purc_tax_calc_typ_nm();
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			return purc_tax_rnd_typ();
		}
		if ($purc_tax_rnd_typ_nm.equalsIgnoreCase(name)) {
			return purc_tax_rnd_typ_nm();
		}
		if ($purc_tax_cd.equalsIgnoreCase(name)) {
			return purc_tax_cd();
		}
		if ($purc_tax_nm.equalsIgnoreCase(name)) {
			return purc_tax_nm();
		}
		if ($sppl_cal_cd.equalsIgnoreCase(name)) {
			return sppl_cal_cd();
		}
		if ($sppl_cal_nm.equalsIgnoreCase(name)) {
			return sppl_cal_nm();
		}
		if ($po_print_cd.equalsIgnoreCase(name)) {
			return po_print_cd();
		}
		if ($po_print_nm.equalsIgnoreCase(name)) {
			return po_print_nm();
		}
		if ($sppl_ship_form_cd.equalsIgnoreCase(name)) {
			return sppl_ship_form_cd();
		}
		if ($sppl_ship_form_nm.equalsIgnoreCase(name)) {
			return sppl_ship_form_nm();
		}
		if ($prov_rcv_typ.equalsIgnoreCase(name)) {
			return prov_rcv_typ();
		}
		if ($prov_rcv_typ_nm.equalsIgnoreCase(name)) {
			return prov_rcv_typ_nm();
		}
		if ($purc_slip_each_lot_typ.equalsIgnoreCase(name)) {
			return purc_slip_each_lot_typ();
		}
		if ($purc_slip_each_lot_typ_nm.equalsIgnoreCase(name)) {
			return purc_slip_each_lot_typ_nm();
		}
		if ($sppl_tterm_cd1.equalsIgnoreCase(name)) {
			return sppl_tterm_cd1();
		}
		if ($sppl_tterm_nm1.equalsIgnoreCase(name)) {
			return sppl_tterm_nm1();
		}
		if ($sppl_tterm_cd2.equalsIgnoreCase(name)) {
			return sppl_tterm_cd2();
		}
		if ($sppl_tterm_nm2.equalsIgnoreCase(name)) {
			return sppl_tterm_nm2();
		}
		if ($sppl_tterm_cd3.equalsIgnoreCase(name)) {
			return sppl_tterm_cd3();
		}
		if ($sppl_tterm_nm3.equalsIgnoreCase(name)) {
			return sppl_tterm_nm3();
		}
		if ($outsrc_upri_typ.equalsIgnoreCase(name)) {
			return outsrc_upri_typ();
		}
		if ($outsrc_upri_typ_nm.equalsIgnoreCase(name)) {
			return outsrc_upri_typ_nm();
		}
		if ($purc_basis_typ.equalsIgnoreCase(name)) {
			return purc_basis_typ();
		}
		if ($purc_basis_typ_nm.equalsIgnoreCase(name)) {
			return purc_basis_typ_nm();
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			return prov_basis_typ();
		}
		if ($prov_basis_typ_nm.equalsIgnoreCase(name)) {
			return prov_basis_typ_nm();
		}
		if ($prov_tax_cd.equalsIgnoreCase(name)) {
			return prov_tax_cd();
		}
		if ($prov_tax_nm.equalsIgnoreCase(name)) {
			return prov_tax_nm();
		}
		if ($prov_amt_rnd_typ.equalsIgnoreCase(name)) {
			return prov_amt_rnd_typ();
		}
		if ($prov_amt_rnd_typ_nm.equalsIgnoreCase(name)) {
			return prov_amt_rnd_typ_nm();
		}
		if ($prov_tax_calc_typ.equalsIgnoreCase(name)) {
			return prov_tax_calc_typ();
		}
		if ($prov_tax_calc_typ_nm.equalsIgnoreCase(name)) {
			return prov_tax_calc_typ_nm();
		}
		if ($prov_tax_rnd_typ.equalsIgnoreCase(name)) {
			return prov_tax_rnd_typ();
		}
		if ($prov_tax_rnd_typ_nm.equalsIgnoreCase(name)) {
			return prov_tax_rnd_typ_nm();
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			return bsppl_cd();
		}
		if ($bsppl_nm.equalsIgnoreCase(name)) {
			return bsppl_nm();
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			return ap_dpt_nm();
		}
		if ($check_ap_dpt_cd.equalsIgnoreCase(name)) {
			return check_ap_dpt_cd();
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
		if ($del_usr_id.equalsIgnoreCase(name)) {
			return del_usr_id();
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			return del_usr_nm();
		}
		if ($sppl_prnt_typ.equalsIgnoreCase(name)) {
			return sppl_prnt_typ();
		}
		if ($sppl_prnt_typ_nm.equalsIgnoreCase(name)) {
			return sppl_prnt_typ_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			return pay_crryovr_times();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCTimestamp getTimestampNE(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		if ($del_ts.equalsIgnoreCase(name)) {
			return del_ts();
		}
		return super.getTimestampNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($asppl_flg.equalsIgnoreCase(name)) {
			return asppl_flg();
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			return subcon_flg();
		}
		if ($onr_prsppl_flg.equalsIgnoreCase(name)) {
			return onr_prsppl_flg();
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			return repurc_obli_flg();
		}
		if ($purc_upri_cng_flg.equalsIgnoreCase(name)) {
			return purc_upri_cng_flg();
		}
		if ($prms_recv_flg.equalsIgnoreCase(name)) {
			return prms_recv_flg();
		}
		if ($purc_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			return purc_tax_cd_prio_flg();
		}
		if ($po_dlv_slip_flg.equalsIgnoreCase(name)) {
			return po_dlv_slip_flg();
		}
		if ($dlv_inst_dlv_slip_flg.equalsIgnoreCase(name)) {
			return dlv_inst_dlv_slip_flg();
		}
		if ($prms_rcpt_dlv_slip_flg.equalsIgnoreCase(name)) {
			return prms_rcpt_dlv_slip_flg();
		}
		if ($wrk_po_flg.equalsIgnoreCase(name)) {
			return wrk_po_flg();
		}
		if ($wrk_ap_flg.equalsIgnoreCase(name)) {
			return wrk_ap_flg();
		}
		if ($sppl_iv_flg.equalsIgnoreCase(name)) {
			return sppl_iv_flg();
		}
		if ($rcpt_iv_dup_flg.equalsIgnoreCase(name)) {
			return rcpt_iv_dup_flg();
		}
		if ($prov_upri_cng_flg.equalsIgnoreCase(name)) {
			return prov_upri_cng_flg();
		}
		if ($prov_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			return prov_tax_cd_prio_flg();
		}
		if ($bsppl_flg.equalsIgnoreCase(name)) {
			return bsppl_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			cntry_cd(value);
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
		if ($sppl_cntct_dpt.equalsIgnoreCase(name)) {
			sppl_cntct_dpt(value);
			return;
		}
		if ($sppl_cntct_psn.equalsIgnoreCase(name)) {
			sppl_cntct_psn(value);
			return;
		}
		if ($sppl_cntct_psn_title.equalsIgnoreCase(name)) {
			sppl_cntct_psn_title(value);
			return;
		}
		if ($vmi_purc_dpt_cd.equalsIgnoreCase(name)) {
			vmi_purc_dpt_cd(value);
			return;
		}
		if ($vmi_purc_dpt_nm.equalsIgnoreCase(name)) {
			vmi_purc_dpt_nm(value);
			return;
		}
		if ($check_vmi_purc_dpt_cd.equalsIgnoreCase(name)) {
			check_vmi_purc_dpt_cd(value);
			return;
		}
		if ($purc_upri_req_typ.equalsIgnoreCase(name)) {
			purc_upri_req_typ(value);
			return;
		}
		if ($purc_upri_req_typ_nm.equalsIgnoreCase(name)) {
			purc_upri_req_typ_nm(value);
			return;
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			purc_amt_rnd_typ(value);
			return;
		}
		if ($purc_amt_rnd_typ_nm.equalsIgnoreCase(name)) {
			purc_amt_rnd_typ_nm(value);
			return;
		}
		if ($purc_tax_calc_typ.equalsIgnoreCase(name)) {
			purc_tax_calc_typ(value);
			return;
		}
		if ($purc_tax_calc_typ_nm.equalsIgnoreCase(name)) {
			purc_tax_calc_typ_nm(value);
			return;
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			purc_tax_rnd_typ(value);
			return;
		}
		if ($purc_tax_rnd_typ_nm.equalsIgnoreCase(name)) {
			purc_tax_rnd_typ_nm(value);
			return;
		}
		if ($purc_tax_cd.equalsIgnoreCase(name)) {
			purc_tax_cd(value);
			return;
		}
		if ($purc_tax_nm.equalsIgnoreCase(name)) {
			purc_tax_nm(value);
			return;
		}
		if ($sppl_cal_cd.equalsIgnoreCase(name)) {
			sppl_cal_cd(value);
			return;
		}
		if ($sppl_cal_nm.equalsIgnoreCase(name)) {
			sppl_cal_nm(value);
			return;
		}
		if ($po_print_cd.equalsIgnoreCase(name)) {
			po_print_cd(value);
			return;
		}
		if ($po_print_nm.equalsIgnoreCase(name)) {
			po_print_nm(value);
			return;
		}
		if ($sppl_ship_form_cd.equalsIgnoreCase(name)) {
			sppl_ship_form_cd(value);
			return;
		}
		if ($sppl_ship_form_nm.equalsIgnoreCase(name)) {
			sppl_ship_form_nm(value);
			return;
		}
		if ($prov_rcv_typ.equalsIgnoreCase(name)) {
			prov_rcv_typ(value);
			return;
		}
		if ($prov_rcv_typ_nm.equalsIgnoreCase(name)) {
			prov_rcv_typ_nm(value);
			return;
		}
		if ($purc_slip_each_lot_typ.equalsIgnoreCase(name)) {
			purc_slip_each_lot_typ(value);
			return;
		}
		if ($purc_slip_each_lot_typ_nm.equalsIgnoreCase(name)) {
			purc_slip_each_lot_typ_nm(value);
			return;
		}
		if ($sppl_tterm_cd1.equalsIgnoreCase(name)) {
			sppl_tterm_cd1(value);
			return;
		}
		if ($sppl_tterm_nm1.equalsIgnoreCase(name)) {
			sppl_tterm_nm1(value);
			return;
		}
		if ($sppl_tterm_cd2.equalsIgnoreCase(name)) {
			sppl_tterm_cd2(value);
			return;
		}
		if ($sppl_tterm_nm2.equalsIgnoreCase(name)) {
			sppl_tterm_nm2(value);
			return;
		}
		if ($sppl_tterm_cd3.equalsIgnoreCase(name)) {
			sppl_tterm_cd3(value);
			return;
		}
		if ($sppl_tterm_nm3.equalsIgnoreCase(name)) {
			sppl_tterm_nm3(value);
			return;
		}
		if ($outsrc_upri_typ.equalsIgnoreCase(name)) {
			outsrc_upri_typ(value);
			return;
		}
		if ($outsrc_upri_typ_nm.equalsIgnoreCase(name)) {
			outsrc_upri_typ_nm(value);
			return;
		}
		if ($purc_basis_typ.equalsIgnoreCase(name)) {
			purc_basis_typ(value);
			return;
		}
		if ($purc_basis_typ_nm.equalsIgnoreCase(name)) {
			purc_basis_typ_nm(value);
			return;
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			prov_basis_typ(value);
			return;
		}
		if ($prov_basis_typ_nm.equalsIgnoreCase(name)) {
			prov_basis_typ_nm(value);
			return;
		}
		if ($prov_tax_cd.equalsIgnoreCase(name)) {
			prov_tax_cd(value);
			return;
		}
		if ($prov_tax_nm.equalsIgnoreCase(name)) {
			prov_tax_nm(value);
			return;
		}
		if ($prov_amt_rnd_typ.equalsIgnoreCase(name)) {
			prov_amt_rnd_typ(value);
			return;
		}
		if ($prov_amt_rnd_typ_nm.equalsIgnoreCase(name)) {
			prov_amt_rnd_typ_nm(value);
			return;
		}
		if ($prov_tax_calc_typ.equalsIgnoreCase(name)) {
			prov_tax_calc_typ(value);
			return;
		}
		if ($prov_tax_calc_typ_nm.equalsIgnoreCase(name)) {
			prov_tax_calc_typ_nm(value);
			return;
		}
		if ($prov_tax_rnd_typ.equalsIgnoreCase(name)) {
			prov_tax_rnd_typ(value);
			return;
		}
		if ($prov_tax_rnd_typ_nm.equalsIgnoreCase(name)) {
			prov_tax_rnd_typ_nm(value);
			return;
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			bsppl_cd(value);
			return;
		}
		if ($bsppl_nm.equalsIgnoreCase(name)) {
			bsppl_nm(value);
			return;
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			ap_dpt_cd(value);
			return;
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			ap_dpt_nm(value);
			return;
		}
		if ($check_ap_dpt_cd.equalsIgnoreCase(name)) {
			check_ap_dpt_cd(value);
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
		if ($del_usr_id.equalsIgnoreCase(name)) {
			del_usr_id(value);
			return;
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			del_usr_nm(value);
			return;
		}
		if ($sppl_prnt_typ.equalsIgnoreCase(name)) {
			sppl_prnt_typ(value);
			return;
		}
		if ($sppl_prnt_typ_nm.equalsIgnoreCase(name)) {
			sppl_prnt_typ_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
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
		if ($del_ts.equalsIgnoreCase(name)) {
			del_ts(value);
			return;
		}
		super.setTimestamp(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($asppl_flg.equalsIgnoreCase(name)) {
			asppl_flg(value);
			return;
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			subcon_flg(value);
			return;
		}
		if ($onr_prsppl_flg.equalsIgnoreCase(name)) {
			onr_prsppl_flg(value);
			return;
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			repurc_obli_flg(value);
			return;
		}
		if ($purc_upri_cng_flg.equalsIgnoreCase(name)) {
			purc_upri_cng_flg(value);
			return;
		}
		if ($prms_recv_flg.equalsIgnoreCase(name)) {
			prms_recv_flg(value);
			return;
		}
		if ($purc_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			purc_tax_cd_prio_flg(value);
			return;
		}
		if ($po_dlv_slip_flg.equalsIgnoreCase(name)) {
			po_dlv_slip_flg(value);
			return;
		}
		if ($dlv_inst_dlv_slip_flg.equalsIgnoreCase(name)) {
			dlv_inst_dlv_slip_flg(value);
			return;
		}
		if ($prms_rcpt_dlv_slip_flg.equalsIgnoreCase(name)) {
			prms_rcpt_dlv_slip_flg(value);
			return;
		}
		if ($wrk_po_flg.equalsIgnoreCase(name)) {
			wrk_po_flg(value);
			return;
		}
		if ($wrk_ap_flg.equalsIgnoreCase(name)) {
			wrk_ap_flg(value);
			return;
		}
		if ($sppl_iv_flg.equalsIgnoreCase(name)) {
			sppl_iv_flg(value);
			return;
		}
		if ($rcpt_iv_dup_flg.equalsIgnoreCase(name)) {
			rcpt_iv_dup_flg(value);
			return;
		}
		if ($prov_upri_cng_flg.equalsIgnoreCase(name)) {
			prov_upri_cng_flg(value);
			return;
		}
		if ($prov_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			prov_tax_cd_prio_flg(value);
			return;
		}
		if ($bsppl_flg.equalsIgnoreCase(name)) {
			bsppl_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			cntry_cd(value);
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
		if ($sppl_cntct_dpt.equalsIgnoreCase(name)) {
			sppl_cntct_dpt(value);
			return;
		}
		if ($sppl_cntct_psn.equalsIgnoreCase(name)) {
			sppl_cntct_psn(value);
			return;
		}
		if ($sppl_cntct_psn_title.equalsIgnoreCase(name)) {
			sppl_cntct_psn_title(value);
			return;
		}
		if ($vmi_purc_dpt_cd.equalsIgnoreCase(name)) {
			vmi_purc_dpt_cd(value);
			return;
		}
		if ($vmi_purc_dpt_nm.equalsIgnoreCase(name)) {
			vmi_purc_dpt_nm(value);
			return;
		}
		if ($check_vmi_purc_dpt_cd.equalsIgnoreCase(name)) {
			check_vmi_purc_dpt_cd(value);
			return;
		}
		if ($purc_upri_req_typ.equalsIgnoreCase(name)) {
			purc_upri_req_typ(value);
			return;
		}
		if ($purc_upri_req_typ_nm.equalsIgnoreCase(name)) {
			purc_upri_req_typ_nm(value);
			return;
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			purc_amt_rnd_typ(value);
			return;
		}
		if ($purc_amt_rnd_typ_nm.equalsIgnoreCase(name)) {
			purc_amt_rnd_typ_nm(value);
			return;
		}
		if ($purc_tax_calc_typ.equalsIgnoreCase(name)) {
			purc_tax_calc_typ(value);
			return;
		}
		if ($purc_tax_calc_typ_nm.equalsIgnoreCase(name)) {
			purc_tax_calc_typ_nm(value);
			return;
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			purc_tax_rnd_typ(value);
			return;
		}
		if ($purc_tax_rnd_typ_nm.equalsIgnoreCase(name)) {
			purc_tax_rnd_typ_nm(value);
			return;
		}
		if ($purc_tax_cd.equalsIgnoreCase(name)) {
			purc_tax_cd(value);
			return;
		}
		if ($purc_tax_nm.equalsIgnoreCase(name)) {
			purc_tax_nm(value);
			return;
		}
		if ($sppl_cal_cd.equalsIgnoreCase(name)) {
			sppl_cal_cd(value);
			return;
		}
		if ($sppl_cal_nm.equalsIgnoreCase(name)) {
			sppl_cal_nm(value);
			return;
		}
		if ($po_print_cd.equalsIgnoreCase(name)) {
			po_print_cd(value);
			return;
		}
		if ($po_print_nm.equalsIgnoreCase(name)) {
			po_print_nm(value);
			return;
		}
		if ($sppl_ship_form_cd.equalsIgnoreCase(name)) {
			sppl_ship_form_cd(value);
			return;
		}
		if ($sppl_ship_form_nm.equalsIgnoreCase(name)) {
			sppl_ship_form_nm(value);
			return;
		}
		if ($prov_rcv_typ.equalsIgnoreCase(name)) {
			prov_rcv_typ(value);
			return;
		}
		if ($prov_rcv_typ_nm.equalsIgnoreCase(name)) {
			prov_rcv_typ_nm(value);
			return;
		}
		if ($purc_slip_each_lot_typ.equalsIgnoreCase(name)) {
			purc_slip_each_lot_typ(value);
			return;
		}
		if ($purc_slip_each_lot_typ_nm.equalsIgnoreCase(name)) {
			purc_slip_each_lot_typ_nm(value);
			return;
		}
		if ($sppl_tterm_cd1.equalsIgnoreCase(name)) {
			sppl_tterm_cd1(value);
			return;
		}
		if ($sppl_tterm_nm1.equalsIgnoreCase(name)) {
			sppl_tterm_nm1(value);
			return;
		}
		if ($sppl_tterm_cd2.equalsIgnoreCase(name)) {
			sppl_tterm_cd2(value);
			return;
		}
		if ($sppl_tterm_nm2.equalsIgnoreCase(name)) {
			sppl_tterm_nm2(value);
			return;
		}
		if ($sppl_tterm_cd3.equalsIgnoreCase(name)) {
			sppl_tterm_cd3(value);
			return;
		}
		if ($sppl_tterm_nm3.equalsIgnoreCase(name)) {
			sppl_tterm_nm3(value);
			return;
		}
		if ($outsrc_upri_typ.equalsIgnoreCase(name)) {
			outsrc_upri_typ(value);
			return;
		}
		if ($outsrc_upri_typ_nm.equalsIgnoreCase(name)) {
			outsrc_upri_typ_nm(value);
			return;
		}
		if ($purc_basis_typ.equalsIgnoreCase(name)) {
			purc_basis_typ(value);
			return;
		}
		if ($purc_basis_typ_nm.equalsIgnoreCase(name)) {
			purc_basis_typ_nm(value);
			return;
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			prov_basis_typ(value);
			return;
		}
		if ($prov_basis_typ_nm.equalsIgnoreCase(name)) {
			prov_basis_typ_nm(value);
			return;
		}
		if ($prov_tax_cd.equalsIgnoreCase(name)) {
			prov_tax_cd(value);
			return;
		}
		if ($prov_tax_nm.equalsIgnoreCase(name)) {
			prov_tax_nm(value);
			return;
		}
		if ($prov_amt_rnd_typ.equalsIgnoreCase(name)) {
			prov_amt_rnd_typ(value);
			return;
		}
		if ($prov_amt_rnd_typ_nm.equalsIgnoreCase(name)) {
			prov_amt_rnd_typ_nm(value);
			return;
		}
		if ($prov_tax_calc_typ.equalsIgnoreCase(name)) {
			prov_tax_calc_typ(value);
			return;
		}
		if ($prov_tax_calc_typ_nm.equalsIgnoreCase(name)) {
			prov_tax_calc_typ_nm(value);
			return;
		}
		if ($prov_tax_rnd_typ.equalsIgnoreCase(name)) {
			prov_tax_rnd_typ(value);
			return;
		}
		if ($prov_tax_rnd_typ_nm.equalsIgnoreCase(name)) {
			prov_tax_rnd_typ_nm(value);
			return;
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			bsppl_cd(value);
			return;
		}
		if ($bsppl_nm.equalsIgnoreCase(name)) {
			bsppl_nm(value);
			return;
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			ap_dpt_cd(value);
			return;
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			ap_dpt_nm(value);
			return;
		}
		if ($check_ap_dpt_cd.equalsIgnoreCase(name)) {
			check_ap_dpt_cd(value);
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
		if ($del_usr_id.equalsIgnoreCase(name)) {
			del_usr_id(value);
			return;
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			del_usr_nm(value);
			return;
		}
		if ($sppl_prnt_typ.equalsIgnoreCase(name)) {
			sppl_prnt_typ(value);
			return;
		}
		if ($sppl_prnt_typ_nm.equalsIgnoreCase(name)) {
			sppl_prnt_typ_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
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
		if ($del_ts.equalsIgnoreCase(name)) {
			del_ts(value);
			return;
		}
		super.setTimestampNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($asppl_flg.equalsIgnoreCase(name)) {
			asppl_flg(value);
			return;
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			subcon_flg(value);
			return;
		}
		if ($onr_prsppl_flg.equalsIgnoreCase(name)) {
			onr_prsppl_flg(value);
			return;
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			repurc_obli_flg(value);
			return;
		}
		if ($purc_upri_cng_flg.equalsIgnoreCase(name)) {
			purc_upri_cng_flg(value);
			return;
		}
		if ($prms_recv_flg.equalsIgnoreCase(name)) {
			prms_recv_flg(value);
			return;
		}
		if ($purc_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			purc_tax_cd_prio_flg(value);
			return;
		}
		if ($po_dlv_slip_flg.equalsIgnoreCase(name)) {
			po_dlv_slip_flg(value);
			return;
		}
		if ($dlv_inst_dlv_slip_flg.equalsIgnoreCase(name)) {
			dlv_inst_dlv_slip_flg(value);
			return;
		}
		if ($prms_rcpt_dlv_slip_flg.equalsIgnoreCase(name)) {
			prms_rcpt_dlv_slip_flg(value);
			return;
		}
		if ($wrk_po_flg.equalsIgnoreCase(name)) {
			wrk_po_flg(value);
			return;
		}
		if ($wrk_ap_flg.equalsIgnoreCase(name)) {
			wrk_ap_flg(value);
			return;
		}
		if ($sppl_iv_flg.equalsIgnoreCase(name)) {
			sppl_iv_flg(value);
			return;
		}
		if ($rcpt_iv_dup_flg.equalsIgnoreCase(name)) {
			rcpt_iv_dup_flg(value);
			return;
		}
		if ($prov_upri_cng_flg.equalsIgnoreCase(name)) {
			prov_upri_cng_flg(value);
			return;
		}
		if ($prov_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			prov_tax_cd_prio_flg(value);
			return;
		}
		if ($bsppl_flg.equalsIgnoreCase(name)) {
			bsppl_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

