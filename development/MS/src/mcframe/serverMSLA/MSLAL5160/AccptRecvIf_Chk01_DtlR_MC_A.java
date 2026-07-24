package mcframe.serverMSLA.MSLAL5160;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.commonCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"AccptRecvIf_Chk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class AccptRecvIf_Chk01_DtlR_MC_A extends MCConstRow {

	public static final String $accpt = "accpt";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Firm revenue recording type 確定売上計上区分.<p>
	 *
	 */
	public static final String $fix_sls_basis_typ = "fix_sls_basis_typ";
	/**
	 * Firm sales schedule No. 確定売上予定ＮＯ.<p>
	 *
	 */
	public static final String $fix_sls_schd_no = "fix_sls_schd_no";
	/**
	 * Firm delivery note No. 確定納品書ＮＯ.<p>
	 *
	 */
	public static final String $fix_dlv_slip_no = "fix_dlv_slip_no";
	/**
	 * Firm delivery not details No. 確定納品書明細ＮＯ.<p>
	 *
	 */
	public static final String $fix_dlv_slip_d_no = "fix_dlv_slip_d_no";
	/**
	 * Firm sales order No. 確定受注ＮＯ.<p>
	 *
	 */
	public static final String $fix_slo_no = "fix_slo_no";
	/**
	 * Firm sales order details No. 確定受注明細ＮＯ.<p>
	 *
	 */
	public static final String $fix_slo_d_no = "fix_slo_d_no";
	/**
	 * Firm base unit qty. 確定基準単位数量.<p>
	 *
	 */
	public static final String $fix_base_unit_qty = "fix_base_unit_qty";
	/**
	 * Firm tax cd. 確定税ＣＤ.<p>
	 *
	 */
	public static final String $fix_tax_cd = "fix_tax_cd";
	/**
	 * Firm transaction currency cd. 確定取引通貨ＣＤ.<p>
	 *
	 */
	public static final String $fix_trd_cur_cd = "fix_trd_cur_cd";
	/**
	 * Firm transaction currency unit price 確定取引通貨単価.<p>
	 *
	 */
	public static final String $fix_trd_cur_upri = "fix_trd_cur_upri";
	/**
	 * Firm transaction currency amount 確定取引通貨金額.<p>
	 *
	 */
	public static final String $fix_trd_cur_amt = "fix_trd_cur_amt";
	/**
	 * Firm transaction currency discount amount 確定取引通貨値引額.<p>
	 *
	 */
	public static final String $fix_trd_cur_dscnt_amt = "fix_trd_cur_dscnt_amt";
	/**
	 * Firm transaction pattern type 確定取引パタン区分.<p>
	 *
	 */
	public static final String $fix_trd_ptn_typ = "fix_trd_ptn_typ";
	/**
	 * Purchase simultaneously recorded 仕入同時計上.<p>
	 *
	 */
	public static final String $sync_flg = "sync_flg";
	/**
	 * Multiple sales schedule 売上予定複数.<p>
	 *
	 */
	public static final String $sls_schd_mult_flg = "sls_schd_mult_flg";
	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public static final String $dlv_slip_seq = "dlv_slip_seq";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * Original tax cd. オリジナル税ＣＤ.<p>
	 *
	 */
	public static final String $org_tax_cd = "org_tax_cd";
	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public static final String $via_dlv_typ = "via_dlv_typ";
	/**
	 * Billing closing type 請求締処理区分.<p>
	 *
	 */
	public static final String $bill_cl_typ = "bill_cl_typ";
	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public static final String $trd_unit_conv_qty = "trd_unit_conv_qty";
	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public static final String $trd_unit_conv_base_qty = "trd_unit_conv_base_qty";
	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public static final String $sls_dpt_cd = "sls_dpt_cd";
	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public static final String $sls_usr_cd = "sls_usr_cd";
	/**
	 * Dept. application date 部門適用日.<p>
	 *
	 */
	public static final String $dpt_base_dt = "dpt_base_dt";
	/**
	 * Prohibit customer sales 得意先売上禁止.<p>
	 *
	 */
	public static final String $cst_sls_stop_flg = "cst_sls_stop_flg";
	/**
	 * Item sales prohibited 品目売上禁止.<p>
	 *
	 */
	public static final String $itm_sls_stop_flg = "itm_sls_stop_flg";
	/**
	 * Application date 適用日.<p>
	 *
	 */
	public static final String $base_dt = "base_dt";
	/**
	 * For supplier direct delivery 仕入直送対象.<p>
	 *
	 */
	public static final String $ddlvTgtFlg = "ddlvTgtFlg";
	/**
	 * For invoice direct delivery インボイス仕入直送対象.<p>
	 *
	 */
	public static final String $ivDdlvTgtFlg = "ivDdlvTgtFlg";
	/**
	 * For sales order acquisition 受注情報取得対象.<p>
	 *
	 */
	public static final String $sloInfoTgtFlg = "sloInfoTgtFlg";
	/**
	 * Original delivery slip No. オリジナル納品書ＮＯ.<p>
	 *
	 */
	public static final String $org_dlv_slip_no = "org_dlv_slip_no";
	/**
	 * Original delivery slip details No. オリジナル納品書明細ＮＯ.<p>
	 *
	 */
	public static final String $org_dlv_slip_d_no = "org_dlv_slip_d_no";
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
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public static final String $purc_act_d_no = "purc_act_d_no";
	/**
	 * Purchase result details sequence number 仕入実績明細連番.<p>
	 *
	 */
	public static final String $purc_act_d_seq = "purc_act_d_seq";
	/**
	 * Purchase result GR/GI No. 仕入実績受払ＮＯ.<p>
	 *
	 */
	public static final String $purc_act_io_no = "purc_act_io_no";
	/**
	 * Purchase result GR/GI sequence number 仕入実績受払連番.<p>
	 *
	 */
	public static final String $purc_act_io_seq = "purc_act_io_seq";
	/**
	 * Receipt result No. 入荷実績ＮＯ.<p>
	 *
	 */
	public static final String $arr_act_no = "arr_act_no";
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $str_ln_cd = "str_ln_cd";
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public static final String $sublot_no = "sublot_no";
	/**
	 * Create lot ロット作成.<p>
	 *
	 */
	public static final String $crt_lot_flg = "crt_lot_flg";
	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public static final String $lot_mng_typ = "lot_mng_typ";
	/**
	 * Lot No. type ロットＮＯ区分.<p>
	 *
	 */
	public static final String $lot_no_typ = "lot_no_typ";
	/**
	 * Lot No. numbering type ロットＮＯ発番区分.<p>
	 *
	 */
	public static final String $lot_no_ptn_cd = "lot_no_ptn_cd";
	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public static final String $sublot_mng_typ = "sublot_mng_typ";
	/**
	 * Sublot No. type サブロットＮＯ区分.<p>
	 *
	 */
	public static final String $sublot_no_typ = "sublot_no_typ";
	/**
	 * Sublot No. numbering type サブロットＮＯ発番区分.<p>
	 *
	 */
	public static final String $sublot_no_ptn_cd = "sublot_no_ptn_cd";
	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public static final String $stk_mng_typ = "stk_mng_typ";
	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public static final String $dscnt_itm_flg = "dscnt_itm_flg";

	public static final String $data_lno = $accpt + ".data_lno";
	public static final String $data_no = $accpt + ".data_no";
	public static final String $data_crud_typ = $accpt + ".data_crud_typ";
	public static final String $ext_sys_cd = $accpt + ".ext_sys_cd";
	public static final String $exe_sts_typ = $accpt + ".exe_sts_typ";
	public static final String $ext_data_no = $accpt + ".ext_data_no";
	public static final String $ext_data_lno = $accpt + ".ext_data_lno";
	public static final String $data_make_dt = $accpt + ".data_make_dt";
	public static final String $imp_flg = $accpt + ".imp_flg";
	public static final String $recv_dt = $accpt + ".recv_dt";
	public static final String $accpt_dt = $accpt + ".accpt_dt";
	public static final String $rcv_schd_dt = $accpt + ".rcv_schd_dt";
	public static final String $dlv_slip_no = $accpt + ".dlv_slip_no";
	public static final String $dlv_slip_d_no = $accpt + ".dlv_slip_d_no";
	public static final String $cst_po_no = $accpt + ".cst_po_no";
	public static final String $cst_po_d_no = $accpt + ".cst_po_d_no";
	public static final String $ext_purc_act_d_no = $accpt + ".ext_purc_act_d_no";
	public static final String $iv_flg = $accpt + ".iv_flg";
	public static final String $abort_flg = $accpt + ".abort_flg";
	public static final String $cst_cd = $accpt + ".cst_cd";
	public static final String $trd_cur_cd = $accpt + ".trd_cur_cd";
	public static final String $trd_unit_cd = $accpt + ".trd_unit_cd";
	public static final String $trd_unit_qty = $accpt + ".trd_unit_qty";
	public static final String $inc_tax_flg = $accpt + ".inc_tax_flg";
	public static final String $tax_typ = $accpt + ".tax_typ";
	public static final String $interim_flg = $accpt + ".interim_flg";
	public static final String $trd_cur_upri = $accpt + ".trd_cur_upri";
	public static final String $trd_cur_amt = $accpt + ".trd_cur_amt";
	public static final String $tax_rate = $accpt + ".tax_rate";
	public static final String $trd_cur_tax_amt = $accpt + ".trd_cur_tax_amt";
	public static final String $trd_cur_dscnt_amt = $accpt + ".trd_cur_dscnt_amt";
	public static final String $dscnt_rsn_cd = $accpt + ".dscnt_rsn_cd";
	public static final String $accpt_dfct_flg = $accpt + ".accpt_dfct_flg";
	public static final String $itm_cd = $accpt + ".itm_cd";
	public static final String $itm_sub1 = $accpt + ".itm_sub1";
	public static final String $itm_sub2 = $accpt + ".itm_sub2";
	public static final String $itm_sub3 = $accpt + ".itm_sub3";
	public static final String $itm_nm = $accpt + ".itm_nm";
	public static final String $lot_no = $accpt + ".lot_no";
	public static final String $sno1 = $accpt + ".sno1";
	public static final String $sno2 = $accpt + ".sno2";
	public static final String $sno3 = $accpt + ".sno3";
	public static final String $sno4 = $accpt + ".sno4";
	public static final String $upri_not_chk_flg = $accpt + ".upri_not_chk_flg";
	public static final String $amt_not_chk_flg = $accpt + ".amt_not_chk_flg";
	public static final String $tax_not_chk_flg = $accpt + ".tax_not_chk_flg";
	public static final String $sub_char1 = $accpt + ".sub_char1";
	public static final String $sub_char2 = $accpt + ".sub_char2";
	public static final String $sub_char3 = $accpt + ".sub_char3";
	public static final String $sub_char4 = $accpt + ".sub_char4";
	public static final String $sub_char5 = $accpt + ".sub_char5";
	public static final String $sub_char6 = $accpt + ".sub_char6";
	public static final String $sub_char7 = $accpt + ".sub_char7";
	public static final String $sub_char8 = $accpt + ".sub_char8";
	public static final String $sub_char9 = $accpt + ".sub_char9";
	public static final String $sub_char10 = $accpt + ".sub_char10";
	public static final String $sub_char11 = $accpt + ".sub_char11";
	public static final String $sub_char12 = $accpt + ".sub_char12";
	public static final String $sub_char13 = $accpt + ".sub_char13";
	public static final String $sub_char14 = $accpt + ".sub_char14";
	public static final String $sub_char15 = $accpt + ".sub_char15";
	public static final String $sub_char16 = $accpt + ".sub_char16";
	public static final String $sub_char17 = $accpt + ".sub_char17";
	public static final String $sub_char18 = $accpt + ".sub_char18";
	public static final String $sub_char19 = $accpt + ".sub_char19";
	public static final String $sub_char20 = $accpt + ".sub_char20";
	public static final String $sub_char21 = $accpt + ".sub_char21";
	public static final String $sub_char22 = $accpt + ".sub_char22";
	public static final String $sub_char23 = $accpt + ".sub_char23";
	public static final String $sub_char24 = $accpt + ".sub_char24";
	public static final String $sub_char25 = $accpt + ".sub_char25";
	public static final String $sub_char26 = $accpt + ".sub_char26";
	public static final String $sub_char27 = $accpt + ".sub_char27";
	public static final String $sub_char28 = $accpt + ".sub_char28";
	public static final String $sub_char29 = $accpt + ".sub_char29";
	public static final String $sub_char30 = $accpt + ".sub_char30";
	public static final String $sub_num1 = $accpt + ".sub_num1";
	public static final String $sub_num2 = $accpt + ".sub_num2";
	public static final String $sub_num3 = $accpt + ".sub_num3";
	public static final String $sub_num4 = $accpt + ".sub_num4";
	public static final String $sub_num5 = $accpt + ".sub_num5";
	public static final String $sub_dt1 = $accpt + ".sub_dt1";
	public static final String $sub_dt2 = $accpt + ".sub_dt2";
	public static final String $sub_dt3 = $accpt + ".sub_dt3";
	public static final String $sub_dt4 = $accpt + ".sub_dt4";
	public static final String $sub_dt5 = $accpt + ".sub_dt5";
	public static final String $log_sub_key1 = $accpt + ".log_sub_key1";
	public static final String $log_sub_key2 = $accpt + ".log_sub_key2";

	public static final MCMeta accpt_META = createInnerRowMeta($accpt, mcframe.serverMS.dbc.MST_ACCPT_RECV_IF_R.class);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta fix_sls_basis_typ_META = createCommonMeta($fix_sls_basis_typ, mcframe.commonMA.meta.MA_META.SLS_BASIS_TYP);
	public static final MCMeta fix_sls_schd_no_META = createCommonMeta($fix_sls_schd_no, mcframe.commonMA.meta.MA_META.SLS_SCHD_NO);
	public static final MCMeta fix_dlv_slip_no_META = createCommonMeta($fix_dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta fix_dlv_slip_d_no_META = createCommonMeta($fix_dlv_slip_d_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_D_NO);
	public static final MCMeta fix_slo_no_META = createCommonMeta($fix_slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta fix_slo_d_no_META = createCommonMeta($fix_slo_d_no, mcframe.commonMA.meta.MA_META.SLO_D_NO);
	public static final MCMeta fix_base_unit_qty_META = createCommonMeta($fix_base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta fix_tax_cd_META = createCommonMeta($fix_tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta fix_trd_cur_cd_META = createCommonMeta($fix_trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta fix_trd_cur_upri_META = createCommonMeta($fix_trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta fix_trd_cur_amt_META = createCommonMeta($fix_trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta fix_trd_cur_dscnt_amt_META = createCommonMeta($fix_trd_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta fix_trd_ptn_typ_META = createCommonMeta($fix_trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta sync_flg_META = createCommonMeta($sync_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_schd_mult_flg_META = createCommonMeta($sls_schd_mult_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_slip_seq_META = createCommonMeta($dlv_slip_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta org_tax_cd_META = createCommonMeta($org_tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta via_dlv_typ_META = createCommonMeta($via_dlv_typ, mcframe.commonMA.meta.MA_META.VIA_DLV_TYP);
	public static final MCMeta bill_cl_typ_META = createCommonMeta($bill_cl_typ, mcframe.commonMA.meta.MA_META.BILL_CL_TYP);
	public static final MCMeta trd_unit_conv_qty_META = createCommonMeta($trd_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_conv_base_qty_META = createCommonMeta($trd_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta sls_dpt_cd_META = createCommonMeta($sls_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta sls_usr_cd_META = createCommonMeta($sls_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta dpt_base_dt_META = createCommonMeta($dpt_base_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta cst_sls_stop_flg_META = createCommonMeta($cst_sls_stop_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_sls_stop_flg_META = createCommonMeta($itm_sls_stop_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta base_dt_META = createCommonMeta($base_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ddlvTgtFlg_META = createCommonMeta($ddlvTgtFlg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ivDdlvTgtFlg_META = createCommonMeta($ivDdlvTgtFlg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sloInfoTgtFlg_META = createCommonMeta($sloInfoTgtFlg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta org_dlv_slip_no_META = createCommonMeta($org_dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta org_dlv_slip_d_no_META = createCommonMeta($org_dlv_slip_d_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_D_NO);
	public static final MCMeta purc_act_no_META = createCommonMeta($purc_act_no, mcframe.commonMA.meta.MA_META.PURC_ACT_NO);
	public static final MCMeta purc_act_seq_META = createCommonMeta($purc_act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta purc_act_d_no_META = createCommonMeta($purc_act_d_no, mcframe.commonMA.meta.MA_META.PURC_ACT_D_NO);
	public static final MCMeta purc_act_d_seq_META = createCommonMeta($purc_act_d_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta purc_act_io_no_META = createCommonMeta($purc_act_io_no, mcframe.commonMA.meta.MA_META.PURC_ACT_IO_NO);
	public static final MCMeta purc_act_io_seq_META = createCommonMeta($purc_act_io_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta arr_act_no_META = createCommonMeta($arr_act_no, mcframe.commonMA.meta.MA_META.ARR_ACT_NO);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta str_ln_cd_META = createCommonMeta($str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta crt_lot_flg_META = createCommonMeta($crt_lot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_mng_typ_META = createCommonMeta($lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta lot_no_typ_META = createCommonMeta($lot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta lot_no_ptn_cd_META = createCommonMeta($lot_no_ptn_cd, mcframe.commonMA.meta.MA_META.NUM_PTN_CD);
	public static final MCMeta sublot_mng_typ_META = createCommonMeta($sublot_mng_typ, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP);
	public static final MCMeta sublot_no_typ_META = createCommonMeta($sublot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta sublot_no_ptn_cd_META = createCommonMeta($sublot_no_ptn_cd, mcframe.commonMA.meta.MA_META.NUM_PTN_CD);
	public static final MCMeta stk_mng_typ_META = createCommonMeta($stk_mng_typ, mcframe.commonMA.meta.MA_META.STK_MNG_TYP);
	public static final MCMeta dscnt_itm_flg_META = createCommonMeta($dscnt_itm_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<AccptRecvIf_Chk01_DtlR> constMetas = new ConstMetaList<AccptRecvIf_Chk01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			accpt_META,
			err_flg_META,
			peg_no_META,
			fix_sls_basis_typ_META,
			fix_sls_schd_no_META,
			fix_dlv_slip_no_META,
			fix_dlv_slip_d_no_META,
			fix_slo_no_META,
			fix_slo_d_no_META,
			fix_base_unit_qty_META,
			fix_tax_cd_META,
			fix_trd_cur_cd_META,
			fix_trd_cur_upri_META,
			fix_trd_cur_amt_META,
			fix_trd_cur_dscnt_amt_META,
			fix_trd_ptn_typ_META,
			sync_flg_META,
			sls_schd_mult_flg_META,
			dlv_slip_seq_META,
			wg_cd_META,
			org_tax_cd_META,
			via_dlv_typ_META,
			bill_cl_typ_META,
			trd_unit_conv_qty_META,
			trd_unit_conv_base_qty_META,
			sls_dpt_cd_META,
			sls_usr_cd_META,
			dpt_base_dt_META,
			cst_sls_stop_flg_META,
			itm_sls_stop_flg_META,
			base_dt_META,
			ddlvTgtFlg_META,
			ivDdlvTgtFlg_META,
			sloInfoTgtFlg_META,
			org_dlv_slip_no_META,
			org_dlv_slip_d_no_META,
			purc_act_no_META,
			purc_act_seq_META,
			purc_act_d_no_META,
			purc_act_d_seq_META,
			purc_act_io_no_META,
			purc_act_io_seq_META,
			arr_act_no_META,
			loc_cd_META,
			str_ln_cd_META,
			sublot_no_META,
			crt_lot_flg_META,
			lot_mng_typ_META,
			lot_no_typ_META,
			lot_no_ptn_cd_META,
			sublot_mng_typ_META,
			sublot_no_typ_META,
			sublot_no_ptn_cd_META,
			stk_mng_typ_META,
			dscnt_itm_flg_META
		},
		new String[][]{
			{
				"data_lno",
				"data_no",
				"data_crud_typ",
				"ext_sys_cd",
				"exe_sts_typ",
				"ext_data_no",
				"ext_data_lno",
				"data_make_dt",
				"imp_flg",
				"recv_dt",
				"accpt_dt",
				"rcv_schd_dt",
				"dlv_slip_no",
				"dlv_slip_d_no",
				"cst_po_no",
				"cst_po_d_no",
				"ext_purc_act_d_no",
				"iv_flg",
				"abort_flg",
				"cst_cd",
				"trd_cur_cd",
				"trd_unit_cd",
				"trd_unit_qty",
				"inc_tax_flg",
				"tax_typ",
				"interim_flg",
				"trd_cur_upri",
				"trd_cur_amt",
				"tax_rate",
				"trd_cur_tax_amt",
				"trd_cur_dscnt_amt",
				"dscnt_rsn_cd",
				"accpt_dfct_flg",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"lot_no",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"upri_not_chk_flg",
				"amt_not_chk_flg",
				"tax_not_chk_flg",
				"sub_char1",
				"sub_char2",
				"sub_char3",
				"sub_char4",
				"sub_char5",
				"sub_char6",
				"sub_char7",
				"sub_char8",
				"sub_char9",
				"sub_char10",
				"sub_char11",
				"sub_char12",
				"sub_char13",
				"sub_char14",
				"sub_char15",
				"sub_char16",
				"sub_char17",
				"sub_char18",
				"sub_char19",
				"sub_char20",
				"sub_char21",
				"sub_char22",
				"sub_char23",
				"sub_char24",
				"sub_char25",
				"sub_char26",
				"sub_char27",
				"sub_char28",
				"sub_char29",
				"sub_char30",
				"sub_num1",
				"sub_num2",
				"sub_num3",
				"sub_num4",
				"sub_num5",
				"sub_dt1",
				"sub_dt2",
				"sub_dt3",
				"sub_dt4",
				"sub_dt5",
				"log_sub_key1",
				"log_sub_key2"
			},
			{
				$data_lno,
				$data_no,
				$data_crud_typ,
				$ext_sys_cd,
				$exe_sts_typ,
				$ext_data_no,
				$ext_data_lno,
				$data_make_dt,
				$imp_flg,
				$recv_dt,
				$accpt_dt,
				$rcv_schd_dt,
				$dlv_slip_no,
				$dlv_slip_d_no,
				$cst_po_no,
				$cst_po_d_no,
				$ext_purc_act_d_no,
				$iv_flg,
				$abort_flg,
				$cst_cd,
				$trd_cur_cd,
				$trd_unit_cd,
				$trd_unit_qty,
				$inc_tax_flg,
				$tax_typ,
				$interim_flg,
				$trd_cur_upri,
				$trd_cur_amt,
				$tax_rate,
				$trd_cur_tax_amt,
				$trd_cur_dscnt_amt,
				$dscnt_rsn_cd,
				$accpt_dfct_flg,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$lot_no,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$upri_not_chk_flg,
				$amt_not_chk_flg,
				$tax_not_chk_flg,
				$sub_char1,
				$sub_char2,
				$sub_char3,
				$sub_char4,
				$sub_char5,
				$sub_char6,
				$sub_char7,
				$sub_char8,
				$sub_char9,
				$sub_char10,
				$sub_char11,
				$sub_char12,
				$sub_char13,
				$sub_char14,
				$sub_char15,
				$sub_char16,
				$sub_char17,
				$sub_char18,
				$sub_char19,
				$sub_char20,
				$sub_char21,
				$sub_char22,
				$sub_char23,
				$sub_char24,
				$sub_char25,
				$sub_char26,
				$sub_char27,
				$sub_char28,
				$sub_char29,
				$sub_char30,
				$sub_num1,
				$sub_num2,
				$sub_num3,
				$sub_num4,
				$sub_num5,
				$sub_dt1,
				$sub_dt2,
				$sub_dt3,
				$sub_dt4,
				$sub_dt5,
				$log_sub_key1,
				$log_sub_key2
			}
		}
	);

	/** 項目属性情報のグループ[REQ_UPD_CNT_CHK]のキー定数 */
	public static final String $$REQ_UPD_CNT_CHK = "REQ_UPD_CNT_CHK";
	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";
	/** 項目属性情報のグループ[CHK_NUM]のキー定数 */
	public static final String $$CHK_NUM = "CHK_NUM";
	/** 項目属性情報のグループ[SMALL_LARGE]のキー定数 */
	public static final String $$SMALL_LARGE = "SMALL_LARGE";
	/** 項目属性情報のグループ[CHK_DT]のキー定数 */
	public static final String $$CHK_DT = "CHK_DT";
	/** 項目属性情報のグループ[BEFORE_AFTER]のキー定数 */
	public static final String $$BEFORE_AFTER = "BEFORE_AFTER";
	/** 項目属性情報のグループ[CHK_PTN]のキー定数 */
	public static final String $$CHK_PTN = "CHK_PTN";
	/** 項目属性情報のグループ[DUPLICATE]のキー定数 */
	public static final String $$DUPLICATE = "DUPLICATE";
	/** 項目属性情報のグループ[TOO_MANY_INPUTS]のキー定数 */
	public static final String $$TOO_MANY_INPUTS = "TOO_MANY_INPUTS";
	/** 項目属性情報のグループ[AT_LEAST_ONE]のキー定数 */
	public static final String $$AT_LEAST_ONE = "AT_LEAST_ONE";
	/** 項目属性情報のグループ[ONLY_ONE_INPUT]のキー定数 */
	public static final String $$ONLY_ONE_INPUT = "ONLY_ONE_INPUT";
	/** 項目属性情報のグループ[LIST_LOGIC]のキー定数 */
	public static final String $$LIST_LOGIC = "LIST_LOGIC";
	/** 項目属性情報のグループ[LIST_OUT]のキー定数 */
	public static final String $$LIST_OUT = "LIST_OUT";
	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQ_UPD_CNT_CHK, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$accpt + ".cst_cd", "E"}	// accpt.cst_cd
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
				{$accpt + ".trd_unit_qty", "positive"}	// accpt.trd_unit_qty
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_DT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_PTN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DUPLICATE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$TOO_MANY_INPUTS, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$AT_LEAST_ONE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$ONLY_ONE_INPUT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$accpt + ".cst_cd", "MA.MAUAL0010.Bp"},	// accpt.cst_cd
				{$accpt + ".trd_cur_cd", "MA.MAUAL0010.Cur"},	// accpt.trd_cur_cd
				{$accpt + ".itm_sub3", "MA.MAUAL0010.ItmSub3"}	// accpt.itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$accpt + ".cst_cd", "MAC_BP_IS_SRCH_TYP.CST_NOT_SUNDRY"},	// accpt.cst_cd
				{$accpt + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3_NOT_COMP_SPEC;itm_cd;itm_sub1;itm_sub2;true"}	// accpt.itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$accpt + ".cst_cd", "bp_is_srch_typ"},	// accpt.cst_cd
				{$accpt + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2;release_flg_on"}	// accpt.itm_sub3
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$accpt + ".data_crud_typ", "MAC_DATA_CRUD_TYP"}	// accpt.data_crud_typ
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
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
	 * 指定グループの項目属性情報を返します。
	 */
	public Map<String, String> getExtMap(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.get(aGroup);
	}

	/**
	 * 指定グループの項目属性が登録された項目リストを返します。
	 */
	public List<String> getKeys(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.getKeyList(aGroup);
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
	protected AccptRecvIf_Chk01_DtlR_MC_A(ConstMetaList<? extends AccptRecvIf_Chk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public AccptRecvIf_Chk01_DtlR clone() {
		return (AccptRecvIf_Chk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public AccptRecvIf_Chk01_DtlR createInstance() {
		return (AccptRecvIf_Chk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public AccptRecvIf_Chk01_DtlR getValues(String... names) {
		return (AccptRecvIf_Chk01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	public mcframe.serverMS.dbc.MST_ACCPT_RECV_IF_R accpt(){
		return (mcframe.serverMS.dbc.MST_ACCPT_RECV_IF_R) getConstInnerRow(offset + 0, $accpt);
	}
	
	public void accpt(mcframe.serverMS.dbc.MST_ACCPT_RECV_IF_R row){
		setConstInnerRow(offset + 0, $accpt, row);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 1, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 1, $err_flg, value);
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 2, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 2, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 2, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 2, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 2, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 2, $peg_no, value);
	}


	/**
	 * Firm revenue recording type 確定売上計上区分.<p>
	 *
	 */
	public String fix_sls_basis_typ() {
		return getConstString(offset + 3, $fix_sls_basis_typ);
	}

	/**
	 * Firm revenue recording type 確定売上計上区分.<p>
	 *
	 */
	public void fix_sls_basis_typ(String value) {
		setConstString(offset + 3, $fix_sls_basis_typ, value);
	}


	/**
	 * Firm sales schedule No. 確定売上予定ＮＯ.<p>
	 *
	 */
	public String fix_sls_schd_no() {
		return getConstString(offset + 4, $fix_sls_schd_no);
	}

	/**
	 * Firm sales schedule No. 確定売上予定ＮＯ.<p>
	 *
	 */
	public void fix_sls_schd_no(String value) {
		setConstString(offset + 4, $fix_sls_schd_no, value);
	}


	/**
	 * Firm delivery note No. 確定納品書ＮＯ.<p>
	 *
	 */
	public String fix_dlv_slip_no() {
		return getConstString(offset + 5, $fix_dlv_slip_no);
	}

	/**
	 * Firm delivery note No. 確定納品書ＮＯ.<p>
	 *
	 */
	public void fix_dlv_slip_no(String value) {
		setConstString(offset + 5, $fix_dlv_slip_no, value);
	}


	/**
	 * Firm delivery not details No. 確定納品書明細ＮＯ.<p>
	 *
	 */
	public String fix_dlv_slip_d_no() {
		return getConstString(offset + 6, $fix_dlv_slip_d_no);
	}

	/**
	 * Firm delivery not details No. 確定納品書明細ＮＯ.<p>
	 *
	 */
	public void fix_dlv_slip_d_no(String value) {
		setConstString(offset + 6, $fix_dlv_slip_d_no, value);
	}


	/**
	 * Firm sales order No. 確定受注ＮＯ.<p>
	 *
	 */
	public String fix_slo_no() {
		return getConstString(offset + 7, $fix_slo_no);
	}

	/**
	 * Firm sales order No. 確定受注ＮＯ.<p>
	 *
	 */
	public void fix_slo_no(String value) {
		setConstString(offset + 7, $fix_slo_no, value);
	}


	/**
	 * Firm sales order details No. 確定受注明細ＮＯ.<p>
	 *
	 */
	public String fix_slo_d_no() {
		return getConstString(offset + 8, $fix_slo_d_no);
	}

	/**
	 * Firm sales order details No. 確定受注明細ＮＯ.<p>
	 *
	 */
	public void fix_slo_d_no(String value) {
		setConstString(offset + 8, $fix_slo_d_no, value);
	}


	/**
	 * Firm base unit qty. 確定基準単位数量.<p>
	 *
	 */
	public MCNumber fix_base_unit_qty() {
		return getConstNumber(offset + 9, $fix_base_unit_qty);
	}

	/**
	 * Firm base unit qty. 確定基準単位数量.<p>
	 *
	 */
	public void fix_base_unit_qty(MCNumber value) {
		setConstNumber(offset + 9, $fix_base_unit_qty, value);
	}

	/**
	 * Firm base unit qty. 確定基準単位数量.<p>
	 *
	 */
	public void fix_base_unit_qty(int value) {
		setConstNumber(offset + 9, $fix_base_unit_qty, value);
	}

	/**
	 * Firm base unit qty. 確定基準単位数量.<p>
	 *
	 */
	public void fix_base_unit_qty(long value) {
		setConstNumber(offset + 9, $fix_base_unit_qty, value);
	}

	/**
	 * Firm base unit qty. 確定基準単位数量.<p>
	 *
	 */
	public void fix_base_unit_qty(float value) {
		setConstNumber(offset + 9, $fix_base_unit_qty, value);
	}

	/**
	 * Firm base unit qty. 確定基準単位数量.<p>
	 *
	 */
	public void fix_base_unit_qty(double value) {
		setConstNumber(offset + 9, $fix_base_unit_qty, value);
	}


	/**
	 * Firm tax cd. 確定税ＣＤ.<p>
	 *
	 */
	public String fix_tax_cd() {
		return getConstString(offset + 10, $fix_tax_cd);
	}

	/**
	 * Firm tax cd. 確定税ＣＤ.<p>
	 *
	 */
	public void fix_tax_cd(String value) {
		setConstString(offset + 10, $fix_tax_cd, value);
	}


	/**
	 * Firm transaction currency cd. 確定取引通貨ＣＤ.<p>
	 *
	 */
	public String fix_trd_cur_cd() {
		return getConstString(offset + 11, $fix_trd_cur_cd);
	}

	/**
	 * Firm transaction currency cd. 確定取引通貨ＣＤ.<p>
	 *
	 */
	public void fix_trd_cur_cd(String value) {
		setConstString(offset + 11, $fix_trd_cur_cd, value);
	}


	/**
	 * Firm transaction currency unit price 確定取引通貨単価.<p>
	 *
	 */
	public MCNumber fix_trd_cur_upri() {
		return getConstNumber(offset + 12, $fix_trd_cur_upri);
	}

	/**
	 * Firm transaction currency unit price 確定取引通貨単価.<p>
	 *
	 */
	public void fix_trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 12, $fix_trd_cur_upri, value);
	}

	/**
	 * Firm transaction currency unit price 確定取引通貨単価.<p>
	 *
	 */
	public void fix_trd_cur_upri(int value) {
		setConstNumber(offset + 12, $fix_trd_cur_upri, value);
	}

	/**
	 * Firm transaction currency unit price 確定取引通貨単価.<p>
	 *
	 */
	public void fix_trd_cur_upri(long value) {
		setConstNumber(offset + 12, $fix_trd_cur_upri, value);
	}

	/**
	 * Firm transaction currency unit price 確定取引通貨単価.<p>
	 *
	 */
	public void fix_trd_cur_upri(float value) {
		setConstNumber(offset + 12, $fix_trd_cur_upri, value);
	}

	/**
	 * Firm transaction currency unit price 確定取引通貨単価.<p>
	 *
	 */
	public void fix_trd_cur_upri(double value) {
		setConstNumber(offset + 12, $fix_trd_cur_upri, value);
	}


	/**
	 * Firm transaction currency amount 確定取引通貨金額.<p>
	 *
	 */
	public MCNumber fix_trd_cur_amt() {
		return getConstNumber(offset + 13, $fix_trd_cur_amt);
	}

	/**
	 * Firm transaction currency amount 確定取引通貨金額.<p>
	 *
	 */
	public void fix_trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 13, $fix_trd_cur_amt, value);
	}

	/**
	 * Firm transaction currency amount 確定取引通貨金額.<p>
	 *
	 */
	public void fix_trd_cur_amt(int value) {
		setConstNumber(offset + 13, $fix_trd_cur_amt, value);
	}

	/**
	 * Firm transaction currency amount 確定取引通貨金額.<p>
	 *
	 */
	public void fix_trd_cur_amt(long value) {
		setConstNumber(offset + 13, $fix_trd_cur_amt, value);
	}

	/**
	 * Firm transaction currency amount 確定取引通貨金額.<p>
	 *
	 */
	public void fix_trd_cur_amt(float value) {
		setConstNumber(offset + 13, $fix_trd_cur_amt, value);
	}

	/**
	 * Firm transaction currency amount 確定取引通貨金額.<p>
	 *
	 */
	public void fix_trd_cur_amt(double value) {
		setConstNumber(offset + 13, $fix_trd_cur_amt, value);
	}


	/**
	 * Firm transaction currency discount amount 確定取引通貨値引額.<p>
	 *
	 */
	public MCNumber fix_trd_cur_dscnt_amt() {
		return getConstNumber(offset + 14, $fix_trd_cur_dscnt_amt);
	}

	/**
	 * Firm transaction currency discount amount 確定取引通貨値引額.<p>
	 *
	 */
	public void fix_trd_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 14, $fix_trd_cur_dscnt_amt, value);
	}

	/**
	 * Firm transaction currency discount amount 確定取引通貨値引額.<p>
	 *
	 */
	public void fix_trd_cur_dscnt_amt(int value) {
		setConstNumber(offset + 14, $fix_trd_cur_dscnt_amt, value);
	}

	/**
	 * Firm transaction currency discount amount 確定取引通貨値引額.<p>
	 *
	 */
	public void fix_trd_cur_dscnt_amt(long value) {
		setConstNumber(offset + 14, $fix_trd_cur_dscnt_amt, value);
	}

	/**
	 * Firm transaction currency discount amount 確定取引通貨値引額.<p>
	 *
	 */
	public void fix_trd_cur_dscnt_amt(float value) {
		setConstNumber(offset + 14, $fix_trd_cur_dscnt_amt, value);
	}

	/**
	 * Firm transaction currency discount amount 確定取引通貨値引額.<p>
	 *
	 */
	public void fix_trd_cur_dscnt_amt(double value) {
		setConstNumber(offset + 14, $fix_trd_cur_dscnt_amt, value);
	}


	/**
	 * Firm transaction pattern type 確定取引パタン区分.<p>
	 *
	 */
	public String fix_trd_ptn_typ() {
		return getConstString(offset + 15, $fix_trd_ptn_typ);
	}

	/**
	 * Firm transaction pattern type 確定取引パタン区分.<p>
	 *
	 */
	public void fix_trd_ptn_typ(String value) {
		setConstString(offset + 15, $fix_trd_ptn_typ, value);
	}


	/**
	 * Purchase simultaneously recorded 仕入同時計上.<p>
	 *
	 */
	public boolean sync_flg() {
		return getConstBoolean(offset + 16, $sync_flg);
	}

	/**
	 * Purchase simultaneously recorded 仕入同時計上.<p>
	 *
	 */
	public void sync_flg(boolean value) {
		setConstBoolean(offset + 16, $sync_flg, value);
	}


	/**
	 * Multiple sales schedule 売上予定複数.<p>
	 *
	 */
	public boolean sls_schd_mult_flg() {
		return getConstBoolean(offset + 17, $sls_schd_mult_flg);
	}

	/**
	 * Multiple sales schedule 売上予定複数.<p>
	 *
	 */
	public void sls_schd_mult_flg(boolean value) {
		setConstBoolean(offset + 17, $sls_schd_mult_flg, value);
	}


	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public MCNumber dlv_slip_seq() {
		return getConstNumber(offset + 18, $dlv_slip_seq);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(MCNumber value) {
		setConstNumber(offset + 18, $dlv_slip_seq, value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(int value) {
		setConstNumber(offset + 18, $dlv_slip_seq, value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(long value) {
		setConstNumber(offset + 18, $dlv_slip_seq, value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(float value) {
		setConstNumber(offset + 18, $dlv_slip_seq, value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(double value) {
		setConstNumber(offset + 18, $dlv_slip_seq, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 19, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 19, $wg_cd, value);
	}


	/**
	 * Original tax cd. オリジナル税ＣＤ.<p>
	 *
	 */
	public String org_tax_cd() {
		return getConstString(offset + 20, $org_tax_cd);
	}

	/**
	 * Original tax cd. オリジナル税ＣＤ.<p>
	 *
	 */
	public void org_tax_cd(String value) {
		setConstString(offset + 20, $org_tax_cd, value);
	}


	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public String via_dlv_typ() {
		return getConstString(offset + 21, $via_dlv_typ);
	}

	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public void via_dlv_typ(String value) {
		setConstString(offset + 21, $via_dlv_typ, value);
	}


	/**
	 * Billing closing type 請求締処理区分.<p>
	 *
	 */
	public String bill_cl_typ() {
		return getConstString(offset + 22, $bill_cl_typ);
	}

	/**
	 * Billing closing type 請求締処理区分.<p>
	 *
	 */
	public void bill_cl_typ(String value) {
		setConstString(offset + 22, $bill_cl_typ, value);
	}


	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_qty() {
		return getConstNumber(offset + 23, $trd_unit_conv_qty);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 23, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(int value) {
		setConstNumber(offset + 23, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(long value) {
		setConstNumber(offset + 23, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(float value) {
		setConstNumber(offset + 23, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(double value) {
		setConstNumber(offset + 23, $trd_unit_conv_qty, value);
	}


	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_base_qty() {
		return getConstNumber(offset + 24, $trd_unit_conv_base_qty);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 24, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(int value) {
		setConstNumber(offset + 24, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(long value) {
		setConstNumber(offset + 24, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(float value) {
		setConstNumber(offset + 24, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(double value) {
		setConstNumber(offset + 24, $trd_unit_conv_base_qty, value);
	}


	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public String sls_dpt_cd() {
		return getConstString(offset + 25, $sls_dpt_cd);
	}

	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public void sls_dpt_cd(String value) {
		setConstString(offset + 25, $sls_dpt_cd, value);
	}


	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public String sls_usr_cd() {
		return getConstString(offset + 26, $sls_usr_cd);
	}

	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public void sls_usr_cd(String value) {
		setConstString(offset + 26, $sls_usr_cd, value);
	}


	/**
	 * Dept. application date 部門適用日.<p>
	 *
	 */
	public MCDate dpt_base_dt() {
		return getConstDate(offset + 27, $dpt_base_dt);
	}

	/**
	 * Dept. application date 部門適用日.<p>
	 *
	 */
	public void dpt_base_dt(MCDate value) {
		setConstDate(offset + 27, $dpt_base_dt, value);
	}


	/**
	 * Prohibit customer sales 得意先売上禁止.<p>
	 *
	 */
	public boolean cst_sls_stop_flg() {
		return getConstBoolean(offset + 28, $cst_sls_stop_flg);
	}

	/**
	 * Prohibit customer sales 得意先売上禁止.<p>
	 *
	 */
	public void cst_sls_stop_flg(boolean value) {
		setConstBoolean(offset + 28, $cst_sls_stop_flg, value);
	}


	/**
	 * Item sales prohibited 品目売上禁止.<p>
	 *
	 */
	public boolean itm_sls_stop_flg() {
		return getConstBoolean(offset + 29, $itm_sls_stop_flg);
	}

	/**
	 * Item sales prohibited 品目売上禁止.<p>
	 *
	 */
	public void itm_sls_stop_flg(boolean value) {
		setConstBoolean(offset + 29, $itm_sls_stop_flg, value);
	}


	/**
	 * Application date 適用日.<p>
	 *
	 */
	public MCDate base_dt() {
		return getConstDate(offset + 30, $base_dt);
	}

	/**
	 * Application date 適用日.<p>
	 *
	 */
	public void base_dt(MCDate value) {
		setConstDate(offset + 30, $base_dt, value);
	}


	/**
	 * For supplier direct delivery 仕入直送対象.<p>
	 *
	 */
	public boolean ddlvTgtFlg() {
		return getConstBoolean(offset + 31, $ddlvTgtFlg);
	}

	/**
	 * For supplier direct delivery 仕入直送対象.<p>
	 *
	 */
	public void ddlvTgtFlg(boolean value) {
		setConstBoolean(offset + 31, $ddlvTgtFlg, value);
	}


	/**
	 * For invoice direct delivery インボイス仕入直送対象.<p>
	 *
	 */
	public boolean ivDdlvTgtFlg() {
		return getConstBoolean(offset + 32, $ivDdlvTgtFlg);
	}

	/**
	 * For invoice direct delivery インボイス仕入直送対象.<p>
	 *
	 */
	public void ivDdlvTgtFlg(boolean value) {
		setConstBoolean(offset + 32, $ivDdlvTgtFlg, value);
	}


	/**
	 * For sales order acquisition 受注情報取得対象.<p>
	 *
	 */
	public boolean sloInfoTgtFlg() {
		return getConstBoolean(offset + 33, $sloInfoTgtFlg);
	}

	/**
	 * For sales order acquisition 受注情報取得対象.<p>
	 *
	 */
	public void sloInfoTgtFlg(boolean value) {
		setConstBoolean(offset + 33, $sloInfoTgtFlg, value);
	}


	/**
	 * Original delivery slip No. オリジナル納品書ＮＯ.<p>
	 *
	 */
	public String org_dlv_slip_no() {
		return getConstString(offset + 34, $org_dlv_slip_no);
	}

	/**
	 * Original delivery slip No. オリジナル納品書ＮＯ.<p>
	 *
	 */
	public void org_dlv_slip_no(String value) {
		setConstString(offset + 34, $org_dlv_slip_no, value);
	}


	/**
	 * Original delivery slip details No. オリジナル納品書明細ＮＯ.<p>
	 *
	 */
	public String org_dlv_slip_d_no() {
		return getConstString(offset + 35, $org_dlv_slip_d_no);
	}

	/**
	 * Original delivery slip details No. オリジナル納品書明細ＮＯ.<p>
	 *
	 */
	public void org_dlv_slip_d_no(String value) {
		setConstString(offset + 35, $org_dlv_slip_d_no, value);
	}


	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public String purc_act_no() {
		return getConstString(offset + 36, $purc_act_no);
	}

	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public void purc_act_no(String value) {
		setConstString(offset + 36, $purc_act_no, value);
	}


	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public MCNumber purc_act_seq() {
		return getConstNumber(offset + 37, $purc_act_seq);
	}

	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public void purc_act_seq(MCNumber value) {
		setConstNumber(offset + 37, $purc_act_seq, value);
	}

	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public void purc_act_seq(int value) {
		setConstNumber(offset + 37, $purc_act_seq, value);
	}

	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public void purc_act_seq(long value) {
		setConstNumber(offset + 37, $purc_act_seq, value);
	}

	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public void purc_act_seq(float value) {
		setConstNumber(offset + 37, $purc_act_seq, value);
	}

	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public void purc_act_seq(double value) {
		setConstNumber(offset + 37, $purc_act_seq, value);
	}


	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public String purc_act_d_no() {
		return getConstString(offset + 38, $purc_act_d_no);
	}

	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public void purc_act_d_no(String value) {
		setConstString(offset + 38, $purc_act_d_no, value);
	}


	/**
	 * Purchase result details sequence number 仕入実績明細連番.<p>
	 *
	 */
	public MCNumber purc_act_d_seq() {
		return getConstNumber(offset + 39, $purc_act_d_seq);
	}

	/**
	 * Purchase result details sequence number 仕入実績明細連番.<p>
	 *
	 */
	public void purc_act_d_seq(MCNumber value) {
		setConstNumber(offset + 39, $purc_act_d_seq, value);
	}

	/**
	 * Purchase result details sequence number 仕入実績明細連番.<p>
	 *
	 */
	public void purc_act_d_seq(int value) {
		setConstNumber(offset + 39, $purc_act_d_seq, value);
	}

	/**
	 * Purchase result details sequence number 仕入実績明細連番.<p>
	 *
	 */
	public void purc_act_d_seq(long value) {
		setConstNumber(offset + 39, $purc_act_d_seq, value);
	}

	/**
	 * Purchase result details sequence number 仕入実績明細連番.<p>
	 *
	 */
	public void purc_act_d_seq(float value) {
		setConstNumber(offset + 39, $purc_act_d_seq, value);
	}

	/**
	 * Purchase result details sequence number 仕入実績明細連番.<p>
	 *
	 */
	public void purc_act_d_seq(double value) {
		setConstNumber(offset + 39, $purc_act_d_seq, value);
	}


	/**
	 * Purchase result GR/GI No. 仕入実績受払ＮＯ.<p>
	 *
	 */
	public String purc_act_io_no() {
		return getConstString(offset + 40, $purc_act_io_no);
	}

	/**
	 * Purchase result GR/GI No. 仕入実績受払ＮＯ.<p>
	 *
	 */
	public void purc_act_io_no(String value) {
		setConstString(offset + 40, $purc_act_io_no, value);
	}


	/**
	 * Purchase result GR/GI sequence number 仕入実績受払連番.<p>
	 *
	 */
	public MCNumber purc_act_io_seq() {
		return getConstNumber(offset + 41, $purc_act_io_seq);
	}

	/**
	 * Purchase result GR/GI sequence number 仕入実績受払連番.<p>
	 *
	 */
	public void purc_act_io_seq(MCNumber value) {
		setConstNumber(offset + 41, $purc_act_io_seq, value);
	}

	/**
	 * Purchase result GR/GI sequence number 仕入実績受払連番.<p>
	 *
	 */
	public void purc_act_io_seq(int value) {
		setConstNumber(offset + 41, $purc_act_io_seq, value);
	}

	/**
	 * Purchase result GR/GI sequence number 仕入実績受払連番.<p>
	 *
	 */
	public void purc_act_io_seq(long value) {
		setConstNumber(offset + 41, $purc_act_io_seq, value);
	}

	/**
	 * Purchase result GR/GI sequence number 仕入実績受払連番.<p>
	 *
	 */
	public void purc_act_io_seq(float value) {
		setConstNumber(offset + 41, $purc_act_io_seq, value);
	}

	/**
	 * Purchase result GR/GI sequence number 仕入実績受払連番.<p>
	 *
	 */
	public void purc_act_io_seq(double value) {
		setConstNumber(offset + 41, $purc_act_io_seq, value);
	}


	/**
	 * Receipt result No. 入荷実績ＮＯ.<p>
	 *
	 */
	public String arr_act_no() {
		return getConstString(offset + 42, $arr_act_no);
	}

	/**
	 * Receipt result No. 入荷実績ＮＯ.<p>
	 *
	 */
	public void arr_act_no(String value) {
		setConstString(offset + 42, $arr_act_no, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 43, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 43, $loc_cd, value);
	}


	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return getConstString(offset + 44, $str_ln_cd);
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		setConstString(offset + 44, $str_ln_cd, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 45, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 45, $sublot_no, value);
	}


	/**
	 * Create lot ロット作成.<p>
	 *
	 */
	public boolean crt_lot_flg() {
		return getConstBoolean(offset + 46, $crt_lot_flg);
	}

	/**
	 * Create lot ロット作成.<p>
	 *
	 */
	public void crt_lot_flg(boolean value) {
		setConstBoolean(offset + 46, $crt_lot_flg, value);
	}


	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public String lot_mng_typ() {
		return getConstString(offset + 47, $lot_mng_typ);
	}

	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public void lot_mng_typ(String value) {
		setConstString(offset + 47, $lot_mng_typ, value);
	}


	/**
	 * Lot No. type ロットＮＯ区分.<p>
	 *
	 */
	public String lot_no_typ() {
		return getConstString(offset + 48, $lot_no_typ);
	}

	/**
	 * Lot No. type ロットＮＯ区分.<p>
	 *
	 */
	public void lot_no_typ(String value) {
		setConstString(offset + 48, $lot_no_typ, value);
	}


	/**
	 * Lot No. numbering type ロットＮＯ発番区分.<p>
	 *
	 */
	public String lot_no_ptn_cd() {
		return getConstString(offset + 49, $lot_no_ptn_cd);
	}

	/**
	 * Lot No. numbering type ロットＮＯ発番区分.<p>
	 *
	 */
	public void lot_no_ptn_cd(String value) {
		setConstString(offset + 49, $lot_no_ptn_cd, value);
	}


	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public String sublot_mng_typ() {
		return getConstString(offset + 50, $sublot_mng_typ);
	}

	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public void sublot_mng_typ(String value) {
		setConstString(offset + 50, $sublot_mng_typ, value);
	}


	/**
	 * Sublot No. type サブロットＮＯ区分.<p>
	 *
	 */
	public String sublot_no_typ() {
		return getConstString(offset + 51, $sublot_no_typ);
	}

	/**
	 * Sublot No. type サブロットＮＯ区分.<p>
	 *
	 */
	public void sublot_no_typ(String value) {
		setConstString(offset + 51, $sublot_no_typ, value);
	}


	/**
	 * Sublot No. numbering type サブロットＮＯ発番区分.<p>
	 *
	 */
	public String sublot_no_ptn_cd() {
		return getConstString(offset + 52, $sublot_no_ptn_cd);
	}

	/**
	 * Sublot No. numbering type サブロットＮＯ発番区分.<p>
	 *
	 */
	public void sublot_no_ptn_cd(String value) {
		setConstString(offset + 52, $sublot_no_ptn_cd, value);
	}


	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public String stk_mng_typ() {
		return getConstString(offset + 53, $stk_mng_typ);
	}

	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public void stk_mng_typ(String value) {
		setConstString(offset + 53, $stk_mng_typ, value);
	}


	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public boolean dscnt_itm_flg() {
		return getConstBoolean(offset + 54, $dscnt_itm_flg);
	}

	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public void dscnt_itm_flg(boolean value) {
		setConstBoolean(offset + 54, $dscnt_itm_flg, value);
	}


	public String getString(String name) {
		if ($fix_sls_basis_typ.equalsIgnoreCase(name)) {
			return fix_sls_basis_typ();
		}
		if ($fix_sls_schd_no.equalsIgnoreCase(name)) {
			return fix_sls_schd_no();
		}
		if ($fix_dlv_slip_no.equalsIgnoreCase(name)) {
			return fix_dlv_slip_no();
		}
		if ($fix_dlv_slip_d_no.equalsIgnoreCase(name)) {
			return fix_dlv_slip_d_no();
		}
		if ($fix_slo_no.equalsIgnoreCase(name)) {
			return fix_slo_no();
		}
		if ($fix_slo_d_no.equalsIgnoreCase(name)) {
			return fix_slo_d_no();
		}
		if ($fix_tax_cd.equalsIgnoreCase(name)) {
			return fix_tax_cd();
		}
		if ($fix_trd_cur_cd.equalsIgnoreCase(name)) {
			return fix_trd_cur_cd();
		}
		if ($fix_trd_ptn_typ.equalsIgnoreCase(name)) {
			return fix_trd_ptn_typ();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($org_tax_cd.equalsIgnoreCase(name)) {
			return org_tax_cd();
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			return via_dlv_typ();
		}
		if ($bill_cl_typ.equalsIgnoreCase(name)) {
			return bill_cl_typ();
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			return sls_dpt_cd();
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			return sls_usr_cd();
		}
		if ($org_dlv_slip_no.equalsIgnoreCase(name)) {
			return org_dlv_slip_no();
		}
		if ($org_dlv_slip_d_no.equalsIgnoreCase(name)) {
			return org_dlv_slip_d_no();
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			return purc_act_no();
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			return purc_act_d_no();
		}
		if ($purc_act_io_no.equalsIgnoreCase(name)) {
			return purc_act_io_no();
		}
		if ($arr_act_no.equalsIgnoreCase(name)) {
			return arr_act_no();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($lot_no_typ.equalsIgnoreCase(name)) {
			return lot_no_typ();
		}
		if ($lot_no_ptn_cd.equalsIgnoreCase(name)) {
			return lot_no_ptn_cd();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($sublot_no_typ.equalsIgnoreCase(name)) {
			return sublot_no_typ();
		}
		if ($sublot_no_ptn_cd.equalsIgnoreCase(name)) {
			return sublot_no_ptn_cd();
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($fix_base_unit_qty.equalsIgnoreCase(name)) {
			return fix_base_unit_qty();
		}
		if ($fix_trd_cur_upri.equalsIgnoreCase(name)) {
			return fix_trd_cur_upri();
		}
		if ($fix_trd_cur_amt.equalsIgnoreCase(name)) {
			return fix_trd_cur_amt();
		}
		if ($fix_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return fix_trd_cur_dscnt_amt();
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			return dlv_slip_seq();
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_qty();
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_base_qty();
		}
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			return purc_act_seq();
		}
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			return purc_act_d_seq();
		}
		if ($purc_act_io_seq.equalsIgnoreCase(name)) {
			return purc_act_io_seq();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($dpt_base_dt.equalsIgnoreCase(name)) {
			return dpt_base_dt();
		}
		if ($base_dt.equalsIgnoreCase(name)) {
			return base_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($sync_flg.equalsIgnoreCase(name)) {
			return sync_flg();
		}
		if ($sls_schd_mult_flg.equalsIgnoreCase(name)) {
			return sls_schd_mult_flg();
		}
		if ($cst_sls_stop_flg.equalsIgnoreCase(name)) {
			return cst_sls_stop_flg();
		}
		if ($itm_sls_stop_flg.equalsIgnoreCase(name)) {
			return itm_sls_stop_flg();
		}
		if ($ddlvTgtFlg.equalsIgnoreCase(name)) {
			return ddlvTgtFlg();
		}
		if ($ivDdlvTgtFlg.equalsIgnoreCase(name)) {
			return ivDdlvTgtFlg();
		}
		if ($sloInfoTgtFlg.equalsIgnoreCase(name)) {
			return sloInfoTgtFlg();
		}
		if ($crt_lot_flg.equalsIgnoreCase(name)) {
			return crt_lot_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($fix_sls_basis_typ.equalsIgnoreCase(name)) {
			return fix_sls_basis_typ();
		}
		if ($fix_sls_schd_no.equalsIgnoreCase(name)) {
			return fix_sls_schd_no();
		}
		if ($fix_dlv_slip_no.equalsIgnoreCase(name)) {
			return fix_dlv_slip_no();
		}
		if ($fix_dlv_slip_d_no.equalsIgnoreCase(name)) {
			return fix_dlv_slip_d_no();
		}
		if ($fix_slo_no.equalsIgnoreCase(name)) {
			return fix_slo_no();
		}
		if ($fix_slo_d_no.equalsIgnoreCase(name)) {
			return fix_slo_d_no();
		}
		if ($fix_tax_cd.equalsIgnoreCase(name)) {
			return fix_tax_cd();
		}
		if ($fix_trd_cur_cd.equalsIgnoreCase(name)) {
			return fix_trd_cur_cd();
		}
		if ($fix_trd_ptn_typ.equalsIgnoreCase(name)) {
			return fix_trd_ptn_typ();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($org_tax_cd.equalsIgnoreCase(name)) {
			return org_tax_cd();
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			return via_dlv_typ();
		}
		if ($bill_cl_typ.equalsIgnoreCase(name)) {
			return bill_cl_typ();
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			return sls_dpt_cd();
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			return sls_usr_cd();
		}
		if ($org_dlv_slip_no.equalsIgnoreCase(name)) {
			return org_dlv_slip_no();
		}
		if ($org_dlv_slip_d_no.equalsIgnoreCase(name)) {
			return org_dlv_slip_d_no();
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			return purc_act_no();
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			return purc_act_d_no();
		}
		if ($purc_act_io_no.equalsIgnoreCase(name)) {
			return purc_act_io_no();
		}
		if ($arr_act_no.equalsIgnoreCase(name)) {
			return arr_act_no();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($lot_no_typ.equalsIgnoreCase(name)) {
			return lot_no_typ();
		}
		if ($lot_no_ptn_cd.equalsIgnoreCase(name)) {
			return lot_no_ptn_cd();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($sublot_no_typ.equalsIgnoreCase(name)) {
			return sublot_no_typ();
		}
		if ($sublot_no_ptn_cd.equalsIgnoreCase(name)) {
			return sublot_no_ptn_cd();
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($fix_base_unit_qty.equalsIgnoreCase(name)) {
			return fix_base_unit_qty();
		}
		if ($fix_trd_cur_upri.equalsIgnoreCase(name)) {
			return fix_trd_cur_upri();
		}
		if ($fix_trd_cur_amt.equalsIgnoreCase(name)) {
			return fix_trd_cur_amt();
		}
		if ($fix_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return fix_trd_cur_dscnt_amt();
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			return dlv_slip_seq();
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_qty();
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_base_qty();
		}
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			return purc_act_seq();
		}
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			return purc_act_d_seq();
		}
		if ($purc_act_io_seq.equalsIgnoreCase(name)) {
			return purc_act_io_seq();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($dpt_base_dt.equalsIgnoreCase(name)) {
			return dpt_base_dt();
		}
		if ($base_dt.equalsIgnoreCase(name)) {
			return base_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($sync_flg.equalsIgnoreCase(name)) {
			return sync_flg();
		}
		if ($sls_schd_mult_flg.equalsIgnoreCase(name)) {
			return sls_schd_mult_flg();
		}
		if ($cst_sls_stop_flg.equalsIgnoreCase(name)) {
			return cst_sls_stop_flg();
		}
		if ($itm_sls_stop_flg.equalsIgnoreCase(name)) {
			return itm_sls_stop_flg();
		}
		if ($ddlvTgtFlg.equalsIgnoreCase(name)) {
			return ddlvTgtFlg();
		}
		if ($ivDdlvTgtFlg.equalsIgnoreCase(name)) {
			return ivDdlvTgtFlg();
		}
		if ($sloInfoTgtFlg.equalsIgnoreCase(name)) {
			return sloInfoTgtFlg();
		}
		if ($crt_lot_flg.equalsIgnoreCase(name)) {
			return crt_lot_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($fix_sls_basis_typ.equalsIgnoreCase(name)) {
			fix_sls_basis_typ(value);
			return;
		}
		if ($fix_sls_schd_no.equalsIgnoreCase(name)) {
			fix_sls_schd_no(value);
			return;
		}
		if ($fix_dlv_slip_no.equalsIgnoreCase(name)) {
			fix_dlv_slip_no(value);
			return;
		}
		if ($fix_dlv_slip_d_no.equalsIgnoreCase(name)) {
			fix_dlv_slip_d_no(value);
			return;
		}
		if ($fix_slo_no.equalsIgnoreCase(name)) {
			fix_slo_no(value);
			return;
		}
		if ($fix_slo_d_no.equalsIgnoreCase(name)) {
			fix_slo_d_no(value);
			return;
		}
		if ($fix_tax_cd.equalsIgnoreCase(name)) {
			fix_tax_cd(value);
			return;
		}
		if ($fix_trd_cur_cd.equalsIgnoreCase(name)) {
			fix_trd_cur_cd(value);
			return;
		}
		if ($fix_trd_ptn_typ.equalsIgnoreCase(name)) {
			fix_trd_ptn_typ(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($org_tax_cd.equalsIgnoreCase(name)) {
			org_tax_cd(value);
			return;
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			via_dlv_typ(value);
			return;
		}
		if ($bill_cl_typ.equalsIgnoreCase(name)) {
			bill_cl_typ(value);
			return;
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			sls_dpt_cd(value);
			return;
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			sls_usr_cd(value);
			return;
		}
		if ($org_dlv_slip_no.equalsIgnoreCase(name)) {
			org_dlv_slip_no(value);
			return;
		}
		if ($org_dlv_slip_d_no.equalsIgnoreCase(name)) {
			org_dlv_slip_d_no(value);
			return;
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			purc_act_no(value);
			return;
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			purc_act_d_no(value);
			return;
		}
		if ($purc_act_io_no.equalsIgnoreCase(name)) {
			purc_act_io_no(value);
			return;
		}
		if ($arr_act_no.equalsIgnoreCase(name)) {
			arr_act_no(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			lot_mng_typ(value);
			return;
		}
		if ($lot_no_typ.equalsIgnoreCase(name)) {
			lot_no_typ(value);
			return;
		}
		if ($lot_no_ptn_cd.equalsIgnoreCase(name)) {
			lot_no_ptn_cd(value);
			return;
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			sublot_mng_typ(value);
			return;
		}
		if ($sublot_no_typ.equalsIgnoreCase(name)) {
			sublot_no_typ(value);
			return;
		}
		if ($sublot_no_ptn_cd.equalsIgnoreCase(name)) {
			sublot_no_ptn_cd(value);
			return;
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			stk_mng_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($fix_base_unit_qty.equalsIgnoreCase(name)) {
			fix_base_unit_qty(value);
			return;
		}
		if ($fix_trd_cur_upri.equalsIgnoreCase(name)) {
			fix_trd_cur_upri(value);
			return;
		}
		if ($fix_trd_cur_amt.equalsIgnoreCase(name)) {
			fix_trd_cur_amt(value);
			return;
		}
		if ($fix_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			fix_trd_cur_dscnt_amt(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			purc_act_d_seq(value);
			return;
		}
		if ($purc_act_io_seq.equalsIgnoreCase(name)) {
			purc_act_io_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($fix_base_unit_qty.equalsIgnoreCase(name)) {
			fix_base_unit_qty(value);
			return;
		}
		if ($fix_trd_cur_upri.equalsIgnoreCase(name)) {
			fix_trd_cur_upri(value);
			return;
		}
		if ($fix_trd_cur_amt.equalsIgnoreCase(name)) {
			fix_trd_cur_amt(value);
			return;
		}
		if ($fix_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			fix_trd_cur_dscnt_amt(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			purc_act_d_seq(value);
			return;
		}
		if ($purc_act_io_seq.equalsIgnoreCase(name)) {
			purc_act_io_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($fix_base_unit_qty.equalsIgnoreCase(name)) {
			fix_base_unit_qty(value);
			return;
		}
		if ($fix_trd_cur_upri.equalsIgnoreCase(name)) {
			fix_trd_cur_upri(value);
			return;
		}
		if ($fix_trd_cur_amt.equalsIgnoreCase(name)) {
			fix_trd_cur_amt(value);
			return;
		}
		if ($fix_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			fix_trd_cur_dscnt_amt(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			purc_act_d_seq(value);
			return;
		}
		if ($purc_act_io_seq.equalsIgnoreCase(name)) {
			purc_act_io_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($fix_base_unit_qty.equalsIgnoreCase(name)) {
			fix_base_unit_qty(value);
			return;
		}
		if ($fix_trd_cur_upri.equalsIgnoreCase(name)) {
			fix_trd_cur_upri(value);
			return;
		}
		if ($fix_trd_cur_amt.equalsIgnoreCase(name)) {
			fix_trd_cur_amt(value);
			return;
		}
		if ($fix_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			fix_trd_cur_dscnt_amt(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			purc_act_d_seq(value);
			return;
		}
		if ($purc_act_io_seq.equalsIgnoreCase(name)) {
			purc_act_io_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($fix_base_unit_qty.equalsIgnoreCase(name)) {
			fix_base_unit_qty(value);
			return;
		}
		if ($fix_trd_cur_upri.equalsIgnoreCase(name)) {
			fix_trd_cur_upri(value);
			return;
		}
		if ($fix_trd_cur_amt.equalsIgnoreCase(name)) {
			fix_trd_cur_amt(value);
			return;
		}
		if ($fix_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			fix_trd_cur_dscnt_amt(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			purc_act_d_seq(value);
			return;
		}
		if ($purc_act_io_seq.equalsIgnoreCase(name)) {
			purc_act_io_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($dpt_base_dt.equalsIgnoreCase(name)) {
			dpt_base_dt(value);
			return;
		}
		if ($base_dt.equalsIgnoreCase(name)) {
			base_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($sync_flg.equalsIgnoreCase(name)) {
			sync_flg(value);
			return;
		}
		if ($sls_schd_mult_flg.equalsIgnoreCase(name)) {
			sls_schd_mult_flg(value);
			return;
		}
		if ($cst_sls_stop_flg.equalsIgnoreCase(name)) {
			cst_sls_stop_flg(value);
			return;
		}
		if ($itm_sls_stop_flg.equalsIgnoreCase(name)) {
			itm_sls_stop_flg(value);
			return;
		}
		if ($ddlvTgtFlg.equalsIgnoreCase(name)) {
			ddlvTgtFlg(value);
			return;
		}
		if ($ivDdlvTgtFlg.equalsIgnoreCase(name)) {
			ivDdlvTgtFlg(value);
			return;
		}
		if ($sloInfoTgtFlg.equalsIgnoreCase(name)) {
			sloInfoTgtFlg(value);
			return;
		}
		if ($crt_lot_flg.equalsIgnoreCase(name)) {
			crt_lot_flg(value);
			return;
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($fix_sls_basis_typ.equalsIgnoreCase(name)) {
			fix_sls_basis_typ(value);
			return;
		}
		if ($fix_sls_schd_no.equalsIgnoreCase(name)) {
			fix_sls_schd_no(value);
			return;
		}
		if ($fix_dlv_slip_no.equalsIgnoreCase(name)) {
			fix_dlv_slip_no(value);
			return;
		}
		if ($fix_dlv_slip_d_no.equalsIgnoreCase(name)) {
			fix_dlv_slip_d_no(value);
			return;
		}
		if ($fix_slo_no.equalsIgnoreCase(name)) {
			fix_slo_no(value);
			return;
		}
		if ($fix_slo_d_no.equalsIgnoreCase(name)) {
			fix_slo_d_no(value);
			return;
		}
		if ($fix_tax_cd.equalsIgnoreCase(name)) {
			fix_tax_cd(value);
			return;
		}
		if ($fix_trd_cur_cd.equalsIgnoreCase(name)) {
			fix_trd_cur_cd(value);
			return;
		}
		if ($fix_trd_ptn_typ.equalsIgnoreCase(name)) {
			fix_trd_ptn_typ(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($org_tax_cd.equalsIgnoreCase(name)) {
			org_tax_cd(value);
			return;
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			via_dlv_typ(value);
			return;
		}
		if ($bill_cl_typ.equalsIgnoreCase(name)) {
			bill_cl_typ(value);
			return;
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			sls_dpt_cd(value);
			return;
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			sls_usr_cd(value);
			return;
		}
		if ($org_dlv_slip_no.equalsIgnoreCase(name)) {
			org_dlv_slip_no(value);
			return;
		}
		if ($org_dlv_slip_d_no.equalsIgnoreCase(name)) {
			org_dlv_slip_d_no(value);
			return;
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			purc_act_no(value);
			return;
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			purc_act_d_no(value);
			return;
		}
		if ($purc_act_io_no.equalsIgnoreCase(name)) {
			purc_act_io_no(value);
			return;
		}
		if ($arr_act_no.equalsIgnoreCase(name)) {
			arr_act_no(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			lot_mng_typ(value);
			return;
		}
		if ($lot_no_typ.equalsIgnoreCase(name)) {
			lot_no_typ(value);
			return;
		}
		if ($lot_no_ptn_cd.equalsIgnoreCase(name)) {
			lot_no_ptn_cd(value);
			return;
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			sublot_mng_typ(value);
			return;
		}
		if ($sublot_no_typ.equalsIgnoreCase(name)) {
			sublot_no_typ(value);
			return;
		}
		if ($sublot_no_ptn_cd.equalsIgnoreCase(name)) {
			sublot_no_ptn_cd(value);
			return;
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			stk_mng_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($fix_base_unit_qty.equalsIgnoreCase(name)) {
			fix_base_unit_qty(value);
			return;
		}
		if ($fix_trd_cur_upri.equalsIgnoreCase(name)) {
			fix_trd_cur_upri(value);
			return;
		}
		if ($fix_trd_cur_amt.equalsIgnoreCase(name)) {
			fix_trd_cur_amt(value);
			return;
		}
		if ($fix_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			fix_trd_cur_dscnt_amt(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			purc_act_d_seq(value);
			return;
		}
		if ($purc_act_io_seq.equalsIgnoreCase(name)) {
			purc_act_io_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($fix_base_unit_qty.equalsIgnoreCase(name)) {
			fix_base_unit_qty(value);
			return;
		}
		if ($fix_trd_cur_upri.equalsIgnoreCase(name)) {
			fix_trd_cur_upri(value);
			return;
		}
		if ($fix_trd_cur_amt.equalsIgnoreCase(name)) {
			fix_trd_cur_amt(value);
			return;
		}
		if ($fix_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			fix_trd_cur_dscnt_amt(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			purc_act_d_seq(value);
			return;
		}
		if ($purc_act_io_seq.equalsIgnoreCase(name)) {
			purc_act_io_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($fix_base_unit_qty.equalsIgnoreCase(name)) {
			fix_base_unit_qty(value);
			return;
		}
		if ($fix_trd_cur_upri.equalsIgnoreCase(name)) {
			fix_trd_cur_upri(value);
			return;
		}
		if ($fix_trd_cur_amt.equalsIgnoreCase(name)) {
			fix_trd_cur_amt(value);
			return;
		}
		if ($fix_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			fix_trd_cur_dscnt_amt(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			purc_act_d_seq(value);
			return;
		}
		if ($purc_act_io_seq.equalsIgnoreCase(name)) {
			purc_act_io_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($fix_base_unit_qty.equalsIgnoreCase(name)) {
			fix_base_unit_qty(value);
			return;
		}
		if ($fix_trd_cur_upri.equalsIgnoreCase(name)) {
			fix_trd_cur_upri(value);
			return;
		}
		if ($fix_trd_cur_amt.equalsIgnoreCase(name)) {
			fix_trd_cur_amt(value);
			return;
		}
		if ($fix_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			fix_trd_cur_dscnt_amt(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			purc_act_d_seq(value);
			return;
		}
		if ($purc_act_io_seq.equalsIgnoreCase(name)) {
			purc_act_io_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($fix_base_unit_qty.equalsIgnoreCase(name)) {
			fix_base_unit_qty(value);
			return;
		}
		if ($fix_trd_cur_upri.equalsIgnoreCase(name)) {
			fix_trd_cur_upri(value);
			return;
		}
		if ($fix_trd_cur_amt.equalsIgnoreCase(name)) {
			fix_trd_cur_amt(value);
			return;
		}
		if ($fix_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			fix_trd_cur_dscnt_amt(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			purc_act_d_seq(value);
			return;
		}
		if ($purc_act_io_seq.equalsIgnoreCase(name)) {
			purc_act_io_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($dpt_base_dt.equalsIgnoreCase(name)) {
			dpt_base_dt(value);
			return;
		}
		if ($base_dt.equalsIgnoreCase(name)) {
			base_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($sync_flg.equalsIgnoreCase(name)) {
			sync_flg(value);
			return;
		}
		if ($sls_schd_mult_flg.equalsIgnoreCase(name)) {
			sls_schd_mult_flg(value);
			return;
		}
		if ($cst_sls_stop_flg.equalsIgnoreCase(name)) {
			cst_sls_stop_flg(value);
			return;
		}
		if ($itm_sls_stop_flg.equalsIgnoreCase(name)) {
			itm_sls_stop_flg(value);
			return;
		}
		if ($ddlvTgtFlg.equalsIgnoreCase(name)) {
			ddlvTgtFlg(value);
			return;
		}
		if ($ivDdlvTgtFlg.equalsIgnoreCase(name)) {
			ivDdlvTgtFlg(value);
			return;
		}
		if ($sloInfoTgtFlg.equalsIgnoreCase(name)) {
			sloInfoTgtFlg(value);
			return;
		}
		if ($crt_lot_flg.equalsIgnoreCase(name)) {
			crt_lot_flg(value);
			return;
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($accpt.equalsIgnoreCase(name)) {
			return accpt();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($accpt.equalsIgnoreCase(name)) {
			accpt(
				((MCContainerMeta) accpt_META).castInnerRow(mcframe.serverMS.dbc.MST_ACCPT_RECV_IF_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public MCNumber data_lno() {
		return accpt().data_lno();
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(MCNumber value) {
		accpt().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(int value) {
		accpt().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(long value) {
		accpt().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(float value) {
		accpt().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(double value) {
		accpt().data_lno(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public MCNumber data_no() {
		return accpt().data_no();
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(MCNumber value) {
		accpt().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(int value) {
		accpt().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(long value) {
		accpt().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(float value) {
		accpt().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(double value) {
		accpt().data_no(value);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return accpt().data_crud_typ();
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		accpt().data_crud_typ(value);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return accpt().ext_sys_cd();
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		accpt().ext_sys_cd(value);
	}

	/**
	 * PG execution status type ＰＧ実行状況区分.<p>
	 *
	 */
	public String exe_sts_typ() {
		return accpt().exe_sts_typ();
	}

	/**
	 * PG execution status type ＰＧ実行状況区分.<p>
	 *
	 */
	public void exe_sts_typ(String value) {
		accpt().exe_sts_typ(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public MCNumber ext_data_no() {
		return accpt().ext_data_no();
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(MCNumber value) {
		accpt().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(int value) {
		accpt().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(long value) {
		accpt().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(float value) {
		accpt().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(double value) {
		accpt().ext_data_no(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public MCNumber ext_data_lno() {
		return accpt().ext_data_lno();
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(MCNumber value) {
		accpt().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(int value) {
		accpt().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(long value) {
		accpt().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(float value) {
		accpt().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(double value) {
		accpt().ext_data_lno(value);
	}

	/**
	 * Creation date and time of source record 送信元レコード作成日時.<p>
	 *
	 */
	public MCDate data_make_dt() {
		return accpt().data_make_dt();
	}

	/**
	 * Creation date and time of source record 送信元レコード作成日時.<p>
	 *
	 */
	public void data_make_dt(MCDate value) {
		accpt().data_make_dt(value);
	}

	/**
	 * To import 取込対象.<p>
	 *
	 */
	public boolean imp_flg() {
		return accpt().imp_flg();
	}

	/**
	 * To import 取込対象.<p>
	 *
	 */
	public void imp_flg(boolean value) {
		accpt().imp_flg(value);
	}

	/**
	 * Receiving date 受信日.<p>
	 *
	 */
	public MCDate recv_dt() {
		return accpt().recv_dt();
	}

	/**
	 * Receiving date 受信日.<p>
	 *
	 */
	public void recv_dt(MCDate value) {
		accpt().recv_dt(value);
	}

	/**
	 * Acceptance date 検収日.<p>
	 *
	 */
	public MCDate accpt_dt() {
		return accpt().accpt_dt();
	}

	/**
	 * Acceptance date 検収日.<p>
	 *
	 */
	public void accpt_dt(MCDate value) {
		accpt().accpt_dt(value);
	}

	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public MCDate rcv_schd_dt() {
		return accpt().rcv_schd_dt();
	}

	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public void rcv_schd_dt(MCDate value) {
		accpt().rcv_schd_dt(value);
	}

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public String dlv_slip_no() {
		return accpt().dlv_slip_no();
	}

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public void dlv_slip_no(String value) {
		accpt().dlv_slip_no(value);
	}

	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public String dlv_slip_d_no() {
		return accpt().dlv_slip_d_no();
	}

	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public void dlv_slip_d_no(String value) {
		accpt().dlv_slip_d_no(value);
	}

	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public String cst_po_no() {
		return accpt().cst_po_no();
	}

	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public void cst_po_no(String value) {
		accpt().cst_po_no(value);
	}

	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public String cst_po_d_no() {
		return accpt().cst_po_d_no();
	}

	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public void cst_po_d_no(String value) {
		accpt().cst_po_d_no(value);
	}

	/**
	 * External purchase result details No. 外部仕入実績明細ＮＯ.<p>
	 *
	 */
	public String ext_purc_act_d_no() {
		return accpt().ext_purc_act_d_no();
	}

	/**
	 * External purchase result details No. 外部仕入実績明細ＮＯ.<p>
	 *
	 */
	public void ext_purc_act_d_no(String value) {
		accpt().ext_purc_act_d_no(value);
	}

	/**
	 * Invoice インボイス.<p>
	 *
	 */
	public boolean iv_flg() {
		return accpt().iv_flg();
	}

	/**
	 * Invoice インボイス.<p>
	 *
	 */
	public void iv_flg(boolean value) {
		accpt().iv_flg(value);
	}

	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public boolean abort_flg() {
		return accpt().abort_flg();
	}

	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		accpt().abort_flg(value);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return accpt().cst_cd();
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		accpt().cst_cd(value);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return accpt().trd_cur_cd();
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		accpt().trd_cur_cd(value);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return accpt().trd_unit_cd();
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		accpt().trd_unit_cd(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return accpt().trd_unit_qty();
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		accpt().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		accpt().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		accpt().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		accpt().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		accpt().trd_unit_qty(value);
	}

	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public boolean inc_tax_flg() {
		return accpt().inc_tax_flg();
	}

	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public void inc_tax_flg(boolean value) {
		accpt().inc_tax_flg(value);
	}

	/**
	 * Tax type 税区分.<p>
	 *
	 */
	public String tax_typ() {
		return accpt().tax_typ();
	}

	/**
	 * Tax type 税区分.<p>
	 *
	 */
	public void tax_typ(String value) {
		accpt().tax_typ(value);
	}

	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public boolean interim_flg() {
		return accpt().interim_flg();
	}

	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public void interim_flg(boolean value) {
		accpt().interim_flg(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public MCNumber trd_cur_upri() {
		return accpt().trd_cur_upri();
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(MCNumber value) {
		accpt().trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(int value) {
		accpt().trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(long value) {
		accpt().trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(float value) {
		accpt().trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(double value) {
		accpt().trd_cur_upri(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return accpt().trd_cur_amt();
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		accpt().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		accpt().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		accpt().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		accpt().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		accpt().trd_cur_amt(value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public MCNumber tax_rate() {
		return accpt().tax_rate();
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(MCNumber value) {
		accpt().tax_rate(value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(int value) {
		accpt().tax_rate(value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(long value) {
		accpt().tax_rate(value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(float value) {
		accpt().tax_rate(value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(double value) {
		accpt().tax_rate(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt() {
		return accpt().trd_cur_tax_amt();
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(MCNumber value) {
		accpt().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(int value) {
		accpt().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(long value) {
		accpt().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(float value) {
		accpt().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(double value) {
		accpt().trd_cur_tax_amt(value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public MCNumber trd_cur_dscnt_amt() {
		return accpt().trd_cur_dscnt_amt();
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(MCNumber value) {
		accpt().trd_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(int value) {
		accpt().trd_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(long value) {
		accpt().trd_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(float value) {
		accpt().trd_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(double value) {
		accpt().trd_cur_dscnt_amt(value);
	}

	/**
	 * Discount reason cd. 値引理由ＣＤ.<p>
	 *
	 */
	public String dscnt_rsn_cd() {
		return accpt().dscnt_rsn_cd();
	}

	/**
	 * Discount reason cd. 値引理由ＣＤ.<p>
	 *
	 */
	public void dscnt_rsn_cd(String value) {
		accpt().dscnt_rsn_cd(value);
	}

	/**
	 * Acceptance defective flg. 検収不良ＦＬＧ.<p>
	 *
	 */
	public boolean accpt_dfct_flg() {
		return accpt().accpt_dfct_flg();
	}

	/**
	 * Acceptance defective flg. 検収不良ＦＬＧ.<p>
	 *
	 */
	public void accpt_dfct_flg(boolean value) {
		accpt().accpt_dfct_flg(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return accpt().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		accpt().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return accpt().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		accpt().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return accpt().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		accpt().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return accpt().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		accpt().itm_sub3(value);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return accpt().itm_nm();
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		accpt().itm_nm(value);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return accpt().lot_no();
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		accpt().lot_no(value);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return accpt().sno1();
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		accpt().sno1(value);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return accpt().sno2();
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		accpt().sno2(value);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return accpt().sno3();
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		accpt().sno3(value);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return accpt().sno4();
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		accpt().sno4(value);
	}

	/**
	 * Not for unit price check 単価チェック対象外.<p>
	 *
	 */
	public boolean upri_not_chk_flg() {
		return accpt().upri_not_chk_flg();
	}

	/**
	 * Not for unit price check 単価チェック対象外.<p>
	 *
	 */
	public void upri_not_chk_flg(boolean value) {
		accpt().upri_not_chk_flg(value);
	}

	/**
	 * Not for amount check 金額チェック対象外.<p>
	 *
	 */
	public boolean amt_not_chk_flg() {
		return accpt().amt_not_chk_flg();
	}

	/**
	 * Not for amount check 金額チェック対象外.<p>
	 *
	 */
	public void amt_not_chk_flg(boolean value) {
		accpt().amt_not_chk_flg(value);
	}

	/**
	 * Not for tax check 税チェック対象外.<p>
	 *
	 */
	public boolean tax_not_chk_flg() {
		return accpt().tax_not_chk_flg();
	}

	/**
	 * Not for tax check 税チェック対象外.<p>
	 *
	 */
	public void tax_not_chk_flg(boolean value) {
		accpt().tax_not_chk_flg(value);
	}

	/**
	 * Spare CHAR column 1 予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public String sub_char1() {
		return accpt().sub_char1();
	}

	/**
	 * Spare CHAR column 1 予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public void sub_char1(String value) {
		accpt().sub_char1(value);
	}

	/**
	 * Spare CHAR column 2 予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public String sub_char2() {
		return accpt().sub_char2();
	}

	/**
	 * Spare CHAR column 2 予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public void sub_char2(String value) {
		accpt().sub_char2(value);
	}

	/**
	 * Spare CHAR column 3 予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public String sub_char3() {
		return accpt().sub_char3();
	}

	/**
	 * Spare CHAR column 3 予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public void sub_char3(String value) {
		accpt().sub_char3(value);
	}

	/**
	 * Spare CHAR column 4 予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public String sub_char4() {
		return accpt().sub_char4();
	}

	/**
	 * Spare CHAR column 4 予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public void sub_char4(String value) {
		accpt().sub_char4(value);
	}

	/**
	 * Spare CHAR column 5 予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public String sub_char5() {
		return accpt().sub_char5();
	}

	/**
	 * Spare CHAR column 5 予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public void sub_char5(String value) {
		accpt().sub_char5(value);
	}

	/**
	 * Spare CHAR column 6 予備ＣＨＡＲ項目６.<p>
	 *
	 */
	public String sub_char6() {
		return accpt().sub_char6();
	}

	/**
	 * Spare CHAR column 6 予備ＣＨＡＲ項目６.<p>
	 *
	 */
	public void sub_char6(String value) {
		accpt().sub_char6(value);
	}

	/**
	 * Spare CHAR column 7 予備ＣＨＡＲ項目７.<p>
	 *
	 */
	public String sub_char7() {
		return accpt().sub_char7();
	}

	/**
	 * Spare CHAR column 7 予備ＣＨＡＲ項目７.<p>
	 *
	 */
	public void sub_char7(String value) {
		accpt().sub_char7(value);
	}

	/**
	 * Spare CHAR column 8 予備ＣＨＡＲ項目８.<p>
	 *
	 */
	public String sub_char8() {
		return accpt().sub_char8();
	}

	/**
	 * Spare CHAR column 8 予備ＣＨＡＲ項目８.<p>
	 *
	 */
	public void sub_char8(String value) {
		accpt().sub_char8(value);
	}

	/**
	 * Spare CHAR column 9 予備ＣＨＡＲ項目９.<p>
	 *
	 */
	public String sub_char9() {
		return accpt().sub_char9();
	}

	/**
	 * Spare CHAR column 9 予備ＣＨＡＲ項目９.<p>
	 *
	 */
	public void sub_char9(String value) {
		accpt().sub_char9(value);
	}

	/**
	 * Spare CHAR column 10 予備ＣＨＡＲ項目１０.<p>
	 *
	 */
	public String sub_char10() {
		return accpt().sub_char10();
	}

	/**
	 * Spare CHAR column 10 予備ＣＨＡＲ項目１０.<p>
	 *
	 */
	public void sub_char10(String value) {
		accpt().sub_char10(value);
	}

	/**
	 * Spare CHAR column 11 予備ＣＨＡＲ項目１１.<p>
	 *
	 */
	public String sub_char11() {
		return accpt().sub_char11();
	}

	/**
	 * Spare CHAR column 11 予備ＣＨＡＲ項目１１.<p>
	 *
	 */
	public void sub_char11(String value) {
		accpt().sub_char11(value);
	}

	/**
	 * Spare CHAR column 12 予備ＣＨＡＲ項目１２.<p>
	 *
	 */
	public String sub_char12() {
		return accpt().sub_char12();
	}

	/**
	 * Spare CHAR column 12 予備ＣＨＡＲ項目１２.<p>
	 *
	 */
	public void sub_char12(String value) {
		accpt().sub_char12(value);
	}

	/**
	 * Spare CHAR column 13 予備ＣＨＡＲ項目１３.<p>
	 *
	 */
	public String sub_char13() {
		return accpt().sub_char13();
	}

	/**
	 * Spare CHAR column 13 予備ＣＨＡＲ項目１３.<p>
	 *
	 */
	public void sub_char13(String value) {
		accpt().sub_char13(value);
	}

	/**
	 * Spare CHAR column 14 予備ＣＨＡＲ項目１４.<p>
	 *
	 */
	public String sub_char14() {
		return accpt().sub_char14();
	}

	/**
	 * Spare CHAR column 14 予備ＣＨＡＲ項目１４.<p>
	 *
	 */
	public void sub_char14(String value) {
		accpt().sub_char14(value);
	}

	/**
	 * Spare CHAR column 15 予備ＣＨＡＲ項目１５.<p>
	 *
	 */
	public String sub_char15() {
		return accpt().sub_char15();
	}

	/**
	 * Spare CHAR column 15 予備ＣＨＡＲ項目１５.<p>
	 *
	 */
	public void sub_char15(String value) {
		accpt().sub_char15(value);
	}

	/**
	 * Spare CHAR column 16 予備ＣＨＡＲ項目１６.<p>
	 *
	 */
	public String sub_char16() {
		return accpt().sub_char16();
	}

	/**
	 * Spare CHAR column 16 予備ＣＨＡＲ項目１６.<p>
	 *
	 */
	public void sub_char16(String value) {
		accpt().sub_char16(value);
	}

	/**
	 * Spare CHAR column 17 予備ＣＨＡＲ項目１７.<p>
	 *
	 */
	public String sub_char17() {
		return accpt().sub_char17();
	}

	/**
	 * Spare CHAR column 17 予備ＣＨＡＲ項目１７.<p>
	 *
	 */
	public void sub_char17(String value) {
		accpt().sub_char17(value);
	}

	/**
	 * Spare CHAR column 18 予備ＣＨＡＲ項目１８.<p>
	 *
	 */
	public String sub_char18() {
		return accpt().sub_char18();
	}

	/**
	 * Spare CHAR column 18 予備ＣＨＡＲ項目１８.<p>
	 *
	 */
	public void sub_char18(String value) {
		accpt().sub_char18(value);
	}

	/**
	 * Spare CHAR column 19 予備ＣＨＡＲ項目１９.<p>
	 *
	 */
	public String sub_char19() {
		return accpt().sub_char19();
	}

	/**
	 * Spare CHAR column 19 予備ＣＨＡＲ項目１９.<p>
	 *
	 */
	public void sub_char19(String value) {
		accpt().sub_char19(value);
	}

	/**
	 * Spare CHAR column 20 予備ＣＨＡＲ項目２０.<p>
	 *
	 */
	public String sub_char20() {
		return accpt().sub_char20();
	}

	/**
	 * Spare CHAR column 20 予備ＣＨＡＲ項目２０.<p>
	 *
	 */
	public void sub_char20(String value) {
		accpt().sub_char20(value);
	}

	/**
	 * Spare CHAR column 21 予備ＣＨＡＲ項目２１.<p>
	 *
	 */
	public String sub_char21() {
		return accpt().sub_char21();
	}

	/**
	 * Spare CHAR column 21 予備ＣＨＡＲ項目２１.<p>
	 *
	 */
	public void sub_char21(String value) {
		accpt().sub_char21(value);
	}

	/**
	 * Spare CHAR column 22 予備ＣＨＡＲ項目２２.<p>
	 *
	 */
	public String sub_char22() {
		return accpt().sub_char22();
	}

	/**
	 * Spare CHAR column 22 予備ＣＨＡＲ項目２２.<p>
	 *
	 */
	public void sub_char22(String value) {
		accpt().sub_char22(value);
	}

	/**
	 * Spare CHAR column 23 予備ＣＨＡＲ項目２３.<p>
	 *
	 */
	public String sub_char23() {
		return accpt().sub_char23();
	}

	/**
	 * Spare CHAR column 23 予備ＣＨＡＲ項目２３.<p>
	 *
	 */
	public void sub_char23(String value) {
		accpt().sub_char23(value);
	}

	/**
	 * Spare CHAR column 24 予備ＣＨＡＲ項目２４.<p>
	 *
	 */
	public String sub_char24() {
		return accpt().sub_char24();
	}

	/**
	 * Spare CHAR column 24 予備ＣＨＡＲ項目２４.<p>
	 *
	 */
	public void sub_char24(String value) {
		accpt().sub_char24(value);
	}

	/**
	 * Spare CHAR column 25 予備ＣＨＡＲ項目２５.<p>
	 *
	 */
	public String sub_char25() {
		return accpt().sub_char25();
	}

	/**
	 * Spare CHAR column 25 予備ＣＨＡＲ項目２５.<p>
	 *
	 */
	public void sub_char25(String value) {
		accpt().sub_char25(value);
	}

	/**
	 * Spare CHAR column 26 予備ＣＨＡＲ項目２６.<p>
	 *
	 */
	public String sub_char26() {
		return accpt().sub_char26();
	}

	/**
	 * Spare CHAR column 26 予備ＣＨＡＲ項目２６.<p>
	 *
	 */
	public void sub_char26(String value) {
		accpt().sub_char26(value);
	}

	/**
	 * Spare CHAR column 27 予備ＣＨＡＲ項目２７.<p>
	 *
	 */
	public String sub_char27() {
		return accpt().sub_char27();
	}

	/**
	 * Spare CHAR column 27 予備ＣＨＡＲ項目２７.<p>
	 *
	 */
	public void sub_char27(String value) {
		accpt().sub_char27(value);
	}

	/**
	 * Spare CHAR column 28 予備ＣＨＡＲ項目２８.<p>
	 *
	 */
	public String sub_char28() {
		return accpt().sub_char28();
	}

	/**
	 * Spare CHAR column 28 予備ＣＨＡＲ項目２８.<p>
	 *
	 */
	public void sub_char28(String value) {
		accpt().sub_char28(value);
	}

	/**
	 * Spare CHAR column 29 予備ＣＨＡＲ項目２９.<p>
	 *
	 */
	public String sub_char29() {
		return accpt().sub_char29();
	}

	/**
	 * Spare CHAR column 29 予備ＣＨＡＲ項目２９.<p>
	 *
	 */
	public void sub_char29(String value) {
		accpt().sub_char29(value);
	}

	/**
	 * Spare CHAR column 30 予備ＣＨＡＲ項目３０.<p>
	 *
	 */
	public String sub_char30() {
		return accpt().sub_char30();
	}

	/**
	 * Spare CHAR column 30 予備ＣＨＡＲ項目３０.<p>
	 *
	 */
	public void sub_char30(String value) {
		accpt().sub_char30(value);
	}

	/**
	 * Spare NUM column 1 予備ＮＵＭ項目１.<p>
	 *
	 */
	public MCNumber sub_num1() {
		return accpt().sub_num1();
	}

	/**
	 * Spare NUM column 1 予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(MCNumber value) {
		accpt().sub_num1(value);
	}

	/**
	 * Spare NUM column 1 予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(int value) {
		accpt().sub_num1(value);
	}

	/**
	 * Spare NUM column 1 予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(long value) {
		accpt().sub_num1(value);
	}

	/**
	 * Spare NUM column 1 予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(float value) {
		accpt().sub_num1(value);
	}

	/**
	 * Spare NUM column 1 予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(double value) {
		accpt().sub_num1(value);
	}

	/**
	 * Spare NUM column 2 予備ＮＵＭ項目２.<p>
	 *
	 */
	public MCNumber sub_num2() {
		return accpt().sub_num2();
	}

	/**
	 * Spare NUM column 2 予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(MCNumber value) {
		accpt().sub_num2(value);
	}

	/**
	 * Spare NUM column 2 予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(int value) {
		accpt().sub_num2(value);
	}

	/**
	 * Spare NUM column 2 予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(long value) {
		accpt().sub_num2(value);
	}

	/**
	 * Spare NUM column 2 予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(float value) {
		accpt().sub_num2(value);
	}

	/**
	 * Spare NUM column 2 予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(double value) {
		accpt().sub_num2(value);
	}

	/**
	 * Spare NUM column 3 予備ＮＵＭ項目３.<p>
	 *
	 */
	public MCNumber sub_num3() {
		return accpt().sub_num3();
	}

	/**
	 * Spare NUM column 3 予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(MCNumber value) {
		accpt().sub_num3(value);
	}

	/**
	 * Spare NUM column 3 予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(int value) {
		accpt().sub_num3(value);
	}

	/**
	 * Spare NUM column 3 予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(long value) {
		accpt().sub_num3(value);
	}

	/**
	 * Spare NUM column 3 予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(float value) {
		accpt().sub_num3(value);
	}

	/**
	 * Spare NUM column 3 予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(double value) {
		accpt().sub_num3(value);
	}

	/**
	 * Spare NUM column 4 予備ＮＵＭ項目４.<p>
	 *
	 */
	public MCNumber sub_num4() {
		return accpt().sub_num4();
	}

	/**
	 * Spare NUM column 4 予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(MCNumber value) {
		accpt().sub_num4(value);
	}

	/**
	 * Spare NUM column 4 予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(int value) {
		accpt().sub_num4(value);
	}

	/**
	 * Spare NUM column 4 予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(long value) {
		accpt().sub_num4(value);
	}

	/**
	 * Spare NUM column 4 予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(float value) {
		accpt().sub_num4(value);
	}

	/**
	 * Spare NUM column 4 予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(double value) {
		accpt().sub_num4(value);
	}

	/**
	 * Spare NUM column 5 予備ＮＵＭ項目５.<p>
	 *
	 */
	public MCNumber sub_num5() {
		return accpt().sub_num5();
	}

	/**
	 * Spare NUM column 5 予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(MCNumber value) {
		accpt().sub_num5(value);
	}

	/**
	 * Spare NUM column 5 予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(int value) {
		accpt().sub_num5(value);
	}

	/**
	 * Spare NUM column 5 予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(long value) {
		accpt().sub_num5(value);
	}

	/**
	 * Spare NUM column 5 予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(float value) {
		accpt().sub_num5(value);
	}

	/**
	 * Spare NUM column 5 予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(double value) {
		accpt().sub_num5(value);
	}

	/**
	 * Spare DATE column 1 予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public MCDate sub_dt1() {
		return accpt().sub_dt1();
	}

	/**
	 * Spare DATE column 1 予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public void sub_dt1(MCDate value) {
		accpt().sub_dt1(value);
	}

	/**
	 * Spare DATE column 2 予備ＤＡＴＥ項目２.<p>
	 *
	 */
	public MCDate sub_dt2() {
		return accpt().sub_dt2();
	}

	/**
	 * Spare DATE column 2 予備ＤＡＴＥ項目２.<p>
	 *
	 */
	public void sub_dt2(MCDate value) {
		accpt().sub_dt2(value);
	}

	/**
	 * Spare DATE column 3 予備ＤＡＴＥ項目３.<p>
	 *
	 */
	public MCDate sub_dt3() {
		return accpt().sub_dt3();
	}

	/**
	 * Spare DATE column 3 予備ＤＡＴＥ項目３.<p>
	 *
	 */
	public void sub_dt3(MCDate value) {
		accpt().sub_dt3(value);
	}

	/**
	 * Spare DATE column 4 予備ＤＡＴＥ項目４.<p>
	 *
	 */
	public MCDate sub_dt4() {
		return accpt().sub_dt4();
	}

	/**
	 * Spare DATE column 4 予備ＤＡＴＥ項目４.<p>
	 *
	 */
	public void sub_dt4(MCDate value) {
		accpt().sub_dt4(value);
	}

	/**
	 * Spare DATE column 5 予備ＤＡＴＥ項目５.<p>
	 *
	 */
	public MCDate sub_dt5() {
		return accpt().sub_dt5();
	}

	/**
	 * Spare DATE column 5 予備ＤＡＴＥ項目５.<p>
	 *
	 */
	public void sub_dt5(MCDate value) {
		accpt().sub_dt5(value);
	}

	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public MCNumber log_sub_key1() {
		return accpt().log_sub_key1();
	}

	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public void log_sub_key1(MCNumber value) {
		accpt().log_sub_key1(value);
	}

	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public void log_sub_key1(int value) {
		accpt().log_sub_key1(value);
	}

	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public void log_sub_key1(long value) {
		accpt().log_sub_key1(value);
	}

	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public void log_sub_key1(float value) {
		accpt().log_sub_key1(value);
	}

	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public void log_sub_key1(double value) {
		accpt().log_sub_key1(value);
	}

	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public MCNumber log_sub_key2() {
		return accpt().log_sub_key2();
	}

	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public void log_sub_key2(MCNumber value) {
		accpt().log_sub_key2(value);
	}

	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public void log_sub_key2(int value) {
		accpt().log_sub_key2(value);
	}

	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public void log_sub_key2(long value) {
		accpt().log_sub_key2(value);
	}

	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public void log_sub_key2(float value) {
		accpt().log_sub_key2(value);
	}

	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public void log_sub_key2(double value) {
		accpt().log_sub_key2(value);
	}

}

