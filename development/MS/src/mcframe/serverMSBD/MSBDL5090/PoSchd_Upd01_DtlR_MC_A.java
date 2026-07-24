package mcframe.serverMSBD.MSBDL5090;

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
 * ブロック"PoSchd_Upd01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class PoSchd_Upd01_DtlR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * PO placed 発注済.<p>
	 *
	 */
	public static final String $po_flg = "po_flg";
	/**
	 * Resulted 実績済.<p>
	 *
	 */
	public static final String $act_flg = "act_flg";
	/**
	 * Call on mfg. order 製造指図時呼出.<p>
	 *
	 */
	public static final String $fr_mfg_inst_flg = "fr_mfg_inst_flg";
	/**
	 * Screen correction 画面訂正.<p>
	 *
	 */
	public static final String $fr_pnl_flg = "fr_pnl_flg";
	/**
	 * Cancel remaining before update 更新前打切.<p>
	 *
	 */
	public static final String $bef_abort_flg = "bef_abort_flg";
	/**
	 * Expense purchase 経費購買.<p>
	 *
	 */
	public static final String $xpns_purc_flg = "xpns_purc_flg";
	/**
	 * Scheduled inspection end date 検査終了予定日.<p>
	 *
	 */
	public static final String $insp_schd_end_dt = "insp_schd_end_dt";
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public static final String $itm_dec_place = "itm_dec_place";
	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public static final String $itm_rnd_typ = "itm_rnd_typ";
	/**
	 * PO unit cd. 発注単位ＣＤ.<p>
	 *
	 */
	public static final String $purc_unit_cd = "purc_unit_cd";
	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public static final String $asset_mng_typ = "asset_mng_typ";
	/**
	 * Min. lot qty. 最小ロット数量.<p>
	 *
	 */
	public static final String $min_lot_qty = "min_lot_qty";
	/**
	 * Increments lot qty. 刻みロット数量.<p>
	 *
	 */
	public static final String $batch_lot_qty = "batch_lot_qty";
	/**
	 * Location WG cd. 場所ＷＧ　ＣＤ.<p>
	 *
	 */
	public static final String $loc_wg_cd = "loc_wg_cd";
	/**
	 * Subcontracting location supplier cd. 外注場所発注先ＣＤ.<p>
	 *
	 */
	public static final String $outsrc_sppl_cd = "outsrc_sppl_cd";
	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public static final String $lg_grp_cd = "lg_grp_cd";
	/**
	 * Supplier invoice transaction 発注先インボイス取引.<p>
	 *
	 */
	public static final String $sppl_iv_flg = "sppl_iv_flg";
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
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public static final String $prov_basis_typ = "prov_basis_typ";
	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public static final String $prov_typ = "prov_typ";
	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public static final String $tax_rate = "tax_rate";
	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_cur_amt_dec_place = "trd_cur_amt_dec_place";
	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public static final String $base_cur_cd = "base_cur_cd";
	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public static final String $ptax_cur_cd = "ptax_cur_cd";
	/**
	 * Purchase exchange rate cd. 仕入為替レートＣＤ.<p>
	 *
	 */
	public static final String $purc_xrate_cd = "purc_xrate_cd";
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $site_cd = "site_cd";
	public static final String $po_schd = "po_schd";
	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public static final String $inc_tax_flg = "inc_tax_flg";
	/**
	 * No credit update 与信更新無.<p>
	 *
	 */
	public static final String $cred_no_up_flg = "cred_no_up_flg";
	/**
	 * Subcontractor currency cd. 外注先通貨ＣＤ.<p>
	 *
	 */
	public static final String $outsrc_sppl_cur_cd = "outsrc_sppl_cur_cd";

	public static final String $po_schd_no = $po_schd + ".po_schd_no";
	public static final String $po_schd_src_typ = $po_schd + ".po_schd_src_typ";
	public static final String $po_schd_src_no = $po_schd + ".po_schd_src_no";
	public static final String $io_schd_pr_no = $po_schd + ".io_schd_pr_no";
	public static final String $trd_cd = $po_schd + ".trd_cd";
	public static final String $trd_ptn_typ = $po_schd + ".trd_ptn_typ";
	public static final String $itm_cd = $po_schd + ".itm_cd";
	public static final String $itm_sub1 = $po_schd + ".itm_sub1";
	public static final String $itm_sub2 = $po_schd + ".itm_sub2";
	public static final String $itm_sub3 = $po_schd + ".itm_sub3";
	public static final String $itm_nm = $po_schd + ".itm_nm";
	public static final String $iv_itm_nm = $po_schd + ".iv_itm_nm";
	public static final String $ver_no = $po_schd + ".ver_no";
	public static final String $sppl_itm_cd = $po_schd + ".sppl_itm_cd";
	public static final String $sppl_itm_nm = $po_schd + ".sppl_itm_nm";
	public static final String $sno1 = $po_schd + ".sno1";
	public static final String $sno2 = $po_schd + ".sno2";
	public static final String $sno3 = $po_schd + ".sno3";
	public static final String $sno4 = $po_schd + ".sno4";
	public static final String $purc_rsn_cd = $po_schd + ".purc_rsn_cd";
	public static final String $in_to_loc_cd = $po_schd + ".in_to_loc_cd";
	public static final String $str_ln_cd = $po_schd + ".str_ln_cd";
	public static final String $dlv_cd = $po_schd + ".dlv_cd";
	public static final String $dlv_sundry_flg = $po_schd + ".dlv_sundry_flg";
	public static final String $dlv_nm = $po_schd + ".dlv_nm";
	public static final String $dlv_cntct_dpt = $po_schd + ".dlv_cntct_dpt";
	public static final String $dlv_cntct_psn = $po_schd + ".dlv_cntct_psn";
	public static final String $dlv_zip_cd = $po_schd + ".dlv_zip_cd";
	public static final String $dlv_addr1 = $po_schd + ".dlv_addr1";
	public static final String $dlv_addr2 = $po_schd + ".dlv_addr2";
	public static final String $dlv_addr3 = $po_schd + ".dlv_addr3";
	public static final String $dlv_addr4 = $po_schd + ".dlv_addr4";
	public static final String $dlv_tel = $po_schd + ".dlv_tel";
	public static final String $dlv_fax = $po_schd + ".dlv_fax";
	public static final String $tdlv_cd = $po_schd + ".tdlv_cd";
	public static final String $tdlv_sundry_flg = $po_schd + ".tdlv_sundry_flg";
	public static final String $tdlv_cntct_dpt = $po_schd + ".tdlv_cntct_dpt";
	public static final String $tdlv_cntct_psn = $po_schd + ".tdlv_cntct_psn";
	public static final String $tdlv_nm = $po_schd + ".tdlv_nm";
	public static final String $tdlv_zip_cd = $po_schd + ".tdlv_zip_cd";
	public static final String $tdlv_addr1 = $po_schd + ".tdlv_addr1";
	public static final String $tdlv_addr2 = $po_schd + ".tdlv_addr2";
	public static final String $tdlv_addr3 = $po_schd + ".tdlv_addr3";
	public static final String $tdlv_addr4 = $po_schd + ".tdlv_addr4";
	public static final String $tdlv_tel = $po_schd + ".tdlv_tel";
	public static final String $tdlv_fax = $po_schd + ".tdlv_fax";
	public static final String $reg_dt = $po_schd + ".reg_dt";
	public static final String $rqst_wg_cd = $po_schd + ".rqst_wg_cd";
	public static final String $purc_usr_cd = $po_schd + ".purc_usr_cd";
	public static final String $purc_dpt_cd = $po_schd + ".purc_dpt_cd";
	public static final String $wg_cd = $po_schd + ".wg_cd";
	public static final String $sppl_cd = $po_schd + ".sppl_cd";
	public static final String $maker_cd = $po_schd + ".maker_cd";
	public static final String $outsrc_flg = $po_schd + ".outsrc_flg";
	public static final String $outsrc_itm_ord_no = $po_schd + ".outsrc_itm_ord_no";
	public static final String $pln_itm_ord_no = $po_schd + ".pln_itm_ord_no";
	public static final String $mfg_loc_cd = $po_schd + ".mfg_loc_cd";
	public static final String $bom_ptn = $po_schd + ".bom_ptn";
	public static final String $trd_unit_qty = $po_schd + ".trd_unit_qty";
	public static final String $trd_unit_cd = $po_schd + ".trd_unit_cd";
	public static final String $base_unit_qty = $po_schd + ".base_unit_qty";
	public static final String $base_unit_cd = $po_schd + ".base_unit_cd";
	public static final String $purc_upri_req_typ = $po_schd + ".purc_upri_req_typ";
	public static final String $trd_cur_cd = $po_schd + ".trd_cur_cd";
	public static final String $tax_cd = $po_schd + ".tax_cd";
	public static final String $xrate_inpt_flg = $po_schd + ".xrate_inpt_flg";
	public static final String $xrate = $po_schd + ".xrate";
	public static final String $ptax_xrate = $po_schd + ".ptax_xrate";
	public static final String $ptax_xrate_inpt_flg = $po_schd + ".ptax_xrate_inpt_flg";
	public static final String $upri_not_tgt_flg = $po_schd + ".upri_not_tgt_flg";
	public static final String $interim_flg = $po_schd + ".interim_flg";
	public static final String $trd_cur_upri = $po_schd + ".trd_cur_upri";
	public static final String $trd_cur_proc_upri = $po_schd + ".trd_cur_proc_upri";
	public static final String $trd_cur_onr_prov_upri = $po_schd + ".trd_cur_onr_prov_upri";
	public static final String $po_schd_dt = $po_schd + ".po_schd_dt";
	public static final String $purc_schd_dt = $po_schd + ".purc_schd_dt";
	public static final String $rqst_avl_rqst_dt = $po_schd + ".rqst_avl_rqst_dt";
	public static final String $rqst_upd_stop_flg = $po_schd + ".rqst_upd_stop_flg";
	public static final String $bd_itm_cd = $po_schd + ".bd_itm_cd";
	public static final String $bd_itm_sub1 = $po_schd + ".bd_itm_sub1";
	public static final String $bd_itm_sub2 = $po_schd + ".bd_itm_sub2";
	public static final String $bd_itm_sub3 = $po_schd + ".bd_itm_sub3";
	public static final String $bd_sno1 = $po_schd + ".bd_sno1";
	public static final String $bd_sno2 = $po_schd + ".bd_sno2";
	public static final String $bd_sno3 = $po_schd + ".bd_sno3";
	public static final String $bd_sno4 = $po_schd + ".bd_sno4";
	public static final String $bd_lot_no = $po_schd + ".bd_lot_no";
	public static final String $bd_sublot_no = $po_schd + ".bd_sublot_no";
	public static final String $bd_loc_cd = $po_schd + ".bd_loc_cd";
	public static final String $bd_dpt_cd = $po_schd + ".bd_dpt_cd";
	public static final String $bd_ctg_cd = $po_schd + ".bd_ctg_cd";
	public static final String $bd_oper_cd = $po_schd + ".bd_oper_cd";
	public static final String $bd_slo_no = $po_schd + ".bd_slo_no";
	public static final String $bd_iv_no = $po_schd + ".bd_iv_no";
	public static final String $bd_po_no = $po_schd + ".bd_po_no";
	public static final String $abort_flg = $po_schd + ".abort_flg";
	public static final String $intr_rmrks = $po_schd + ".intr_rmrks";
	public static final String $trd_d_rmrks = $po_schd + ".trd_d_rmrks";
	public static final String $po_cnt_rmrks = $po_schd + ".po_cnt_rmrks";
	public static final String $sub_char1 = $po_schd + ".sub_char1";
	public static final String $sub_char2 = $po_schd + ".sub_char2";
	public static final String $sub_char3 = $po_schd + ".sub_char3";
	public static final String $dlv_rqst_tm = $po_schd + ".dlv_rqst_tm";
	public static final String $rqst_dlv_rqst_tm = $po_schd + ".rqst_dlv_rqst_tm";
	public static final String $rqst_crrct_flg = $po_schd + ".rqst_crrct_flg";
	public static final String $sundry_itm_flg = $po_schd + ".sundry_itm_flg";
	public static final String $outsrc_itm_ord_crt_flg = $po_schd + ".outsrc_itm_ord_crt_flg";
	public static final String $trd_cur_amt = $po_schd + ".trd_cur_amt";
	public static final String $trd_cur_proc_amt = $po_schd + ".trd_cur_proc_amt";
	public static final String $trd_cur_onr_prov_amt = $po_schd + ".trd_cur_onr_prov_amt";
	public static final String $trd_cur_tax_amt = $po_schd + ".trd_cur_tax_amt";
	public static final String $purc_lt = $po_schd + ".purc_lt";
	public static final String $drct_dlv_typ = $po_schd + ".drct_dlv_typ";
	public static final String $po_schd_chg_typ = $po_schd + ".po_schd_chg_typ";
	public static final String $split_src_schd_no = $po_schd + ".split_src_schd_no";
	public static final String $bd_wg_cd = $po_schd + ".bd_wg_cd";
	public static final String $bd_bp_cd = $po_schd + ".bd_bp_cd";
	public static final String $base_unit_po_qty = $po_schd + ".base_unit_po_qty";
	public static final String $slo_no = $po_schd + ".slo_no";
	public static final String $slo_d_no = $po_schd + ".slo_d_no";
	public static final String $add_flg = $po_schd + ".add_flg";
	public static final String $org_flg = $po_schd + ".org_flg";
	public static final String $rqst_fr_dpt_cd = $po_schd + ".rqst_fr_dpt_cd";
	public static final String $rqst_fr_usr_cd = $po_schd + ".rqst_fr_usr_cd";

	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta po_flg_META = createCommonMeta($po_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta act_flg_META = createCommonMeta($act_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta fr_mfg_inst_flg_META = createCommonMeta($fr_mfg_inst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta fr_pnl_flg_META = createCommonMeta($fr_pnl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bef_abort_flg_META = createCommonMeta($bef_abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta xpns_purc_flg_META = createCommonMeta($xpns_purc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_schd_end_dt_META = createCommonMeta($insp_schd_end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta itm_dec_place_META = createCommonMeta($itm_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta itm_rnd_typ_META = createCommonMeta($itm_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta purc_unit_cd_META = createCommonMeta($purc_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta asset_mng_typ_META = createCommonMeta($asset_mng_typ, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP);
	public static final MCMeta min_lot_qty_META = createCommonMeta($min_lot_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta batch_lot_qty_META = createCommonMeta($batch_lot_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta loc_wg_cd_META = createCommonMeta($loc_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta outsrc_sppl_cd_META = createCommonMeta($outsrc_sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta lg_grp_cd_META = createCommonMeta($lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta sppl_iv_flg_META = createCommonMeta($sppl_iv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_amt_rnd_typ_META = createCommonMeta($purc_amt_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta purc_tax_rnd_typ_META = createCommonMeta($purc_tax_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta prov_basis_typ_META = createCommonMeta($prov_basis_typ, mcframe.commonMA.meta.MA_META.PROV_BASIS_TYP);
	public static final MCMeta prov_typ_META = createCommonMeta($prov_typ, mcframe.commonMA.meta.MA_META.PROV_TYP);
	public static final MCMeta tax_rate_META = createCommonMeta($tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta trd_cur_amt_dec_place_META = createCommonMeta($trd_cur_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_cur_cd_META = createCommonMeta($base_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta ptax_cur_cd_META = createCommonMeta($ptax_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta purc_xrate_cd_META = createCommonMeta($purc_xrate_cd, mcframe.commonMA.meta.MA_META.XRATE_CD);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta po_schd_META = createInnerRowMeta($po_schd, mcframe.serverMS.dbc.MST_PO_SCHD_R.class);
	public static final MCMeta inc_tax_flg_META = createCommonMeta($inc_tax_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cred_no_up_flg_META = createCommonMeta($cred_no_up_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta outsrc_sppl_cur_cd_META = createCommonMeta($outsrc_sppl_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);

	protected static final ConstMetaList<PoSchd_Upd01_DtlR> constMetas = new ConstMetaList<PoSchd_Upd01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			err_flg_META,
			data_crud_typ_META,
			po_flg_META,
			act_flg_META,
			fr_mfg_inst_flg_META,
			fr_pnl_flg_META,
			bef_abort_flg_META,
			xpns_purc_flg_META,
			insp_schd_end_dt_META,
			itm_dec_place_META,
			itm_rnd_typ_META,
			purc_unit_cd_META,
			asset_mng_typ_META,
			min_lot_qty_META,
			batch_lot_qty_META,
			loc_wg_cd_META,
			outsrc_sppl_cd_META,
			lg_grp_cd_META,
			sppl_iv_flg_META,
			purc_amt_rnd_typ_META,
			purc_tax_rnd_typ_META,
			prov_basis_typ_META,
			prov_typ_META,
			tax_rate_META,
			trd_cur_amt_dec_place_META,
			base_cur_cd_META,
			ptax_cur_cd_META,
			purc_xrate_cd_META,
			site_cd_META,
			po_schd_META,
			inc_tax_flg_META,
			cred_no_up_flg_META,
			outsrc_sppl_cur_cd_META
		},
		new String[][]{
			{
				"po_schd_no",
				"po_schd_src_typ",
				"po_schd_src_no",
				"io_schd_pr_no",
				"trd_cd",
				"trd_ptn_typ",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"iv_itm_nm",
				"ver_no",
				"sppl_itm_cd",
				"sppl_itm_nm",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"purc_rsn_cd",
				"in_to_loc_cd",
				"str_ln_cd",
				"dlv_cd",
				"dlv_sundry_flg",
				"dlv_nm",
				"dlv_cntct_dpt",
				"dlv_cntct_psn",
				"dlv_zip_cd",
				"dlv_addr1",
				"dlv_addr2",
				"dlv_addr3",
				"dlv_addr4",
				"dlv_tel",
				"dlv_fax",
				"tdlv_cd",
				"tdlv_sundry_flg",
				"tdlv_cntct_dpt",
				"tdlv_cntct_psn",
				"tdlv_nm",
				"tdlv_zip_cd",
				"tdlv_addr1",
				"tdlv_addr2",
				"tdlv_addr3",
				"tdlv_addr4",
				"tdlv_tel",
				"tdlv_fax",
				"reg_dt",
				"rqst_wg_cd",
				"purc_usr_cd",
				"purc_dpt_cd",
				"wg_cd",
				"sppl_cd",
				"maker_cd",
				"outsrc_flg",
				"outsrc_itm_ord_no",
				"pln_itm_ord_no",
				"mfg_loc_cd",
				"bom_ptn",
				"trd_unit_qty",
				"trd_unit_cd",
				"base_unit_qty",
				"base_unit_cd",
				"purc_upri_req_typ",
				"trd_cur_cd",
				"tax_cd",
				"xrate_inpt_flg",
				"xrate",
				"ptax_xrate",
				"ptax_xrate_inpt_flg",
				"upri_not_tgt_flg",
				"interim_flg",
				"trd_cur_upri",
				"trd_cur_proc_upri",
				"trd_cur_onr_prov_upri",
				"po_schd_dt",
				"purc_schd_dt",
				"rqst_avl_rqst_dt",
				"rqst_upd_stop_flg",
				"bd_itm_cd",
				"bd_itm_sub1",
				"bd_itm_sub2",
				"bd_itm_sub3",
				"bd_sno1",
				"bd_sno2",
				"bd_sno3",
				"bd_sno4",
				"bd_lot_no",
				"bd_sublot_no",
				"bd_loc_cd",
				"bd_dpt_cd",
				"bd_ctg_cd",
				"bd_oper_cd",
				"bd_slo_no",
				"bd_iv_no",
				"bd_po_no",
				"abort_flg",
				"intr_rmrks",
				"trd_d_rmrks",
				"po_cnt_rmrks",
				"sub_char1",
				"sub_char2",
				"sub_char3",
				"dlv_rqst_tm",
				"rqst_dlv_rqst_tm",
				"rqst_crrct_flg",
				"sundry_itm_flg",
				"outsrc_itm_ord_crt_flg",
				"trd_cur_amt",
				"trd_cur_proc_amt",
				"trd_cur_onr_prov_amt",
				"trd_cur_tax_amt",
				"purc_lt",
				"drct_dlv_typ",
				"po_schd_chg_typ",
				"split_src_schd_no",
				"bd_wg_cd",
				"bd_bp_cd",
				"base_unit_po_qty",
				"slo_no",
				"slo_d_no",
				"add_flg",
				"org_flg",
				"rqst_fr_dpt_cd",
				"rqst_fr_usr_cd"
			},
			{
				$po_schd_no,
				$po_schd_src_typ,
				$po_schd_src_no,
				$io_schd_pr_no,
				$trd_cd,
				$trd_ptn_typ,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$iv_itm_nm,
				$ver_no,
				$sppl_itm_cd,
				$sppl_itm_nm,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$purc_rsn_cd,
				$in_to_loc_cd,
				$str_ln_cd,
				$dlv_cd,
				$dlv_sundry_flg,
				$dlv_nm,
				$dlv_cntct_dpt,
				$dlv_cntct_psn,
				$dlv_zip_cd,
				$dlv_addr1,
				$dlv_addr2,
				$dlv_addr3,
				$dlv_addr4,
				$dlv_tel,
				$dlv_fax,
				$tdlv_cd,
				$tdlv_sundry_flg,
				$tdlv_cntct_dpt,
				$tdlv_cntct_psn,
				$tdlv_nm,
				$tdlv_zip_cd,
				$tdlv_addr1,
				$tdlv_addr2,
				$tdlv_addr3,
				$tdlv_addr4,
				$tdlv_tel,
				$tdlv_fax,
				$reg_dt,
				$rqst_wg_cd,
				$purc_usr_cd,
				$purc_dpt_cd,
				$wg_cd,
				$sppl_cd,
				$maker_cd,
				$outsrc_flg,
				$outsrc_itm_ord_no,
				$pln_itm_ord_no,
				$mfg_loc_cd,
				$bom_ptn,
				$trd_unit_qty,
				$trd_unit_cd,
				$base_unit_qty,
				$base_unit_cd,
				$purc_upri_req_typ,
				$trd_cur_cd,
				$tax_cd,
				$xrate_inpt_flg,
				$xrate,
				$ptax_xrate,
				$ptax_xrate_inpt_flg,
				$upri_not_tgt_flg,
				$interim_flg,
				$trd_cur_upri,
				$trd_cur_proc_upri,
				$trd_cur_onr_prov_upri,
				$po_schd_dt,
				$purc_schd_dt,
				$rqst_avl_rqst_dt,
				$rqst_upd_stop_flg,
				$bd_itm_cd,
				$bd_itm_sub1,
				$bd_itm_sub2,
				$bd_itm_sub3,
				$bd_sno1,
				$bd_sno2,
				$bd_sno3,
				$bd_sno4,
				$bd_lot_no,
				$bd_sublot_no,
				$bd_loc_cd,
				$bd_dpt_cd,
				$bd_ctg_cd,
				$bd_oper_cd,
				$bd_slo_no,
				$bd_iv_no,
				$bd_po_no,
				$abort_flg,
				$intr_rmrks,
				$trd_d_rmrks,
				$po_cnt_rmrks,
				$sub_char1,
				$sub_char2,
				$sub_char3,
				$dlv_rqst_tm,
				$rqst_dlv_rqst_tm,
				$rqst_crrct_flg,
				$sundry_itm_flg,
				$outsrc_itm_ord_crt_flg,
				$trd_cur_amt,
				$trd_cur_proc_amt,
				$trd_cur_onr_prov_amt,
				$trd_cur_tax_amt,
				$purc_lt,
				$drct_dlv_typ,
				$po_schd_chg_typ,
				$split_src_schd_no,
				$bd_wg_cd,
				$bd_bp_cd,
				$base_unit_po_qty,
				$slo_no,
				$slo_d_no,
				$add_flg,
				$org_flg,
				$rqst_fr_dpt_cd,
				$rqst_fr_usr_cd
			}
		}
	);


	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null
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
	protected PoSchd_Upd01_DtlR_MC_A(ConstMetaList<? extends PoSchd_Upd01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PoSchd_Upd01_DtlR clone() {
		return (PoSchd_Upd01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PoSchd_Upd01_DtlR createInstance() {
		return (PoSchd_Upd01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PoSchd_Upd01_DtlR getValues(String... names) {
		return (PoSchd_Upd01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 0, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 0, $peg_no, value);
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
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 2, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 2, $data_crud_typ, value);
	}


	/**
	 * PO placed 発注済.<p>
	 *
	 */
	public boolean po_flg() {
		return getConstBoolean(offset + 3, $po_flg);
	}

	/**
	 * PO placed 発注済.<p>
	 *
	 */
	public void po_flg(boolean value) {
		setConstBoolean(offset + 3, $po_flg, value);
	}


	/**
	 * Resulted 実績済.<p>
	 *
	 */
	public boolean act_flg() {
		return getConstBoolean(offset + 4, $act_flg);
	}

	/**
	 * Resulted 実績済.<p>
	 *
	 */
	public void act_flg(boolean value) {
		setConstBoolean(offset + 4, $act_flg, value);
	}


	/**
	 * Call on mfg. order 製造指図時呼出.<p>
	 *
	 */
	public boolean fr_mfg_inst_flg() {
		return getConstBoolean(offset + 5, $fr_mfg_inst_flg);
	}

	/**
	 * Call on mfg. order 製造指図時呼出.<p>
	 *
	 */
	public void fr_mfg_inst_flg(boolean value) {
		setConstBoolean(offset + 5, $fr_mfg_inst_flg, value);
	}


	/**
	 * Screen correction 画面訂正.<p>
	 *
	 */
	public boolean fr_pnl_flg() {
		return getConstBoolean(offset + 6, $fr_pnl_flg);
	}

	/**
	 * Screen correction 画面訂正.<p>
	 *
	 */
	public void fr_pnl_flg(boolean value) {
		setConstBoolean(offset + 6, $fr_pnl_flg, value);
	}


	/**
	 * Cancel remaining before update 更新前打切.<p>
	 *
	 */
	public boolean bef_abort_flg() {
		return getConstBoolean(offset + 7, $bef_abort_flg);
	}

	/**
	 * Cancel remaining before update 更新前打切.<p>
	 *
	 */
	public void bef_abort_flg(boolean value) {
		setConstBoolean(offset + 7, $bef_abort_flg, value);
	}


	/**
	 * Expense purchase 経費購買.<p>
	 *
	 */
	public boolean xpns_purc_flg() {
		return getConstBoolean(offset + 8, $xpns_purc_flg);
	}

	/**
	 * Expense purchase 経費購買.<p>
	 *
	 */
	public void xpns_purc_flg(boolean value) {
		setConstBoolean(offset + 8, $xpns_purc_flg, value);
	}


	/**
	 * Scheduled inspection end date 検査終了予定日.<p>
	 *
	 */
	public MCDate insp_schd_end_dt() {
		return getConstDate(offset + 9, $insp_schd_end_dt);
	}

	/**
	 * Scheduled inspection end date 検査終了予定日.<p>
	 *
	 */
	public void insp_schd_end_dt(MCDate value) {
		setConstDate(offset + 9, $insp_schd_end_dt, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber itm_dec_place() {
		return getConstNumber(offset + 10, $itm_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void itm_dec_place(MCNumber value) {
		setConstNumber(offset + 10, $itm_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void itm_dec_place(int value) {
		setConstNumber(offset + 10, $itm_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void itm_dec_place(long value) {
		setConstNumber(offset + 10, $itm_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void itm_dec_place(float value) {
		setConstNumber(offset + 10, $itm_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void itm_dec_place(double value) {
		setConstNumber(offset + 10, $itm_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public String itm_rnd_typ() {
		return getConstString(offset + 11, $itm_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public void itm_rnd_typ(String value) {
		setConstString(offset + 11, $itm_rnd_typ, value);
	}


	/**
	 * PO unit cd. 発注単位ＣＤ.<p>
	 *
	 */
	public String purc_unit_cd() {
		return getConstString(offset + 12, $purc_unit_cd);
	}

	/**
	 * PO unit cd. 発注単位ＣＤ.<p>
	 *
	 */
	public void purc_unit_cd(String value) {
		setConstString(offset + 12, $purc_unit_cd, value);
	}


	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public String asset_mng_typ() {
		return getConstString(offset + 13, $asset_mng_typ);
	}

	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public void asset_mng_typ(String value) {
		setConstString(offset + 13, $asset_mng_typ, value);
	}


	/**
	 * Min. lot qty. 最小ロット数量.<p>
	 *
	 */
	public MCNumber min_lot_qty() {
		return getConstNumber(offset + 14, $min_lot_qty);
	}

	/**
	 * Min. lot qty. 最小ロット数量.<p>
	 *
	 */
	public void min_lot_qty(MCNumber value) {
		setConstNumber(offset + 14, $min_lot_qty, value);
	}

	/**
	 * Min. lot qty. 最小ロット数量.<p>
	 *
	 */
	public void min_lot_qty(int value) {
		setConstNumber(offset + 14, $min_lot_qty, value);
	}

	/**
	 * Min. lot qty. 最小ロット数量.<p>
	 *
	 */
	public void min_lot_qty(long value) {
		setConstNumber(offset + 14, $min_lot_qty, value);
	}

	/**
	 * Min. lot qty. 最小ロット数量.<p>
	 *
	 */
	public void min_lot_qty(float value) {
		setConstNumber(offset + 14, $min_lot_qty, value);
	}

	/**
	 * Min. lot qty. 最小ロット数量.<p>
	 *
	 */
	public void min_lot_qty(double value) {
		setConstNumber(offset + 14, $min_lot_qty, value);
	}


	/**
	 * Increments lot qty. 刻みロット数量.<p>
	 *
	 */
	public MCNumber batch_lot_qty() {
		return getConstNumber(offset + 15, $batch_lot_qty);
	}

	/**
	 * Increments lot qty. 刻みロット数量.<p>
	 *
	 */
	public void batch_lot_qty(MCNumber value) {
		setConstNumber(offset + 15, $batch_lot_qty, value);
	}

	/**
	 * Increments lot qty. 刻みロット数量.<p>
	 *
	 */
	public void batch_lot_qty(int value) {
		setConstNumber(offset + 15, $batch_lot_qty, value);
	}

	/**
	 * Increments lot qty. 刻みロット数量.<p>
	 *
	 */
	public void batch_lot_qty(long value) {
		setConstNumber(offset + 15, $batch_lot_qty, value);
	}

	/**
	 * Increments lot qty. 刻みロット数量.<p>
	 *
	 */
	public void batch_lot_qty(float value) {
		setConstNumber(offset + 15, $batch_lot_qty, value);
	}

	/**
	 * Increments lot qty. 刻みロット数量.<p>
	 *
	 */
	public void batch_lot_qty(double value) {
		setConstNumber(offset + 15, $batch_lot_qty, value);
	}


	/**
	 * Location WG cd. 場所ＷＧ　ＣＤ.<p>
	 *
	 */
	public String loc_wg_cd() {
		return getConstString(offset + 16, $loc_wg_cd);
	}

	/**
	 * Location WG cd. 場所ＷＧ　ＣＤ.<p>
	 *
	 */
	public void loc_wg_cd(String value) {
		setConstString(offset + 16, $loc_wg_cd, value);
	}


	/**
	 * Subcontracting location supplier cd. 外注場所発注先ＣＤ.<p>
	 *
	 */
	public String outsrc_sppl_cd() {
		return getConstString(offset + 17, $outsrc_sppl_cd);
	}

	/**
	 * Subcontracting location supplier cd. 外注場所発注先ＣＤ.<p>
	 *
	 */
	public void outsrc_sppl_cd(String value) {
		setConstString(offset + 17, $outsrc_sppl_cd, value);
	}


	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public String lg_grp_cd() {
		return getConstString(offset + 18, $lg_grp_cd);
	}

	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public void lg_grp_cd(String value) {
		setConstString(offset + 18, $lg_grp_cd, value);
	}


	/**
	 * Supplier invoice transaction 発注先インボイス取引.<p>
	 *
	 */
	public boolean sppl_iv_flg() {
		return getConstBoolean(offset + 19, $sppl_iv_flg);
	}

	/**
	 * Supplier invoice transaction 発注先インボイス取引.<p>
	 *
	 */
	public void sppl_iv_flg(boolean value) {
		setConstBoolean(offset + 19, $sppl_iv_flg, value);
	}


	/**
	 * Rounding type (Purchase amount) 仕入金額端数処理区分.<p>
	 *
	 */
	public String purc_amt_rnd_typ() {
		return getConstString(offset + 20, $purc_amt_rnd_typ);
	}

	/**
	 * Rounding type (Purchase amount) 仕入金額端数処理区分.<p>
	 *
	 */
	public void purc_amt_rnd_typ(String value) {
		setConstString(offset + 20, $purc_amt_rnd_typ, value);
	}


	/**
	 * Purchase tax rounding type 仕入税端数処理区分.<p>
	 *
	 */
	public String purc_tax_rnd_typ() {
		return getConstString(offset + 21, $purc_tax_rnd_typ);
	}

	/**
	 * Purchase tax rounding type 仕入税端数処理区分.<p>
	 *
	 */
	public void purc_tax_rnd_typ(String value) {
		setConstString(offset + 21, $purc_tax_rnd_typ, value);
	}


	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public String prov_basis_typ() {
		return getConstString(offset + 22, $prov_basis_typ);
	}

	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public void prov_basis_typ(String value) {
		setConstString(offset + 22, $prov_basis_typ, value);
	}


	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public String prov_typ() {
		return getConstString(offset + 23, $prov_typ);
	}

	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public void prov_typ(String value) {
		setConstString(offset + 23, $prov_typ, value);
	}


	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public MCNumber tax_rate() {
		return getConstNumber(offset + 24, $tax_rate);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(MCNumber value) {
		setConstNumber(offset + 24, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(int value) {
		setConstNumber(offset + 24, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(long value) {
		setConstNumber(offset + 24, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(float value) {
		setConstNumber(offset + 24, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(double value) {
		setConstNumber(offset + 24, $tax_rate, value);
	}


	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_cur_amt_dec_place() {
		return getConstNumber(offset + 25, $trd_cur_amt_dec_place);
	}

	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 25, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(int value) {
		setConstNumber(offset + 25, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(long value) {
		setConstNumber(offset + 25, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(float value) {
		setConstNumber(offset + 25, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(double value) {
		setConstNumber(offset + 25, $trd_cur_amt_dec_place, value);
	}


	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public String base_cur_cd() {
		return getConstString(offset + 26, $base_cur_cd);
	}

	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public void base_cur_cd(String value) {
		setConstString(offset + 26, $base_cur_cd, value);
	}


	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public String ptax_cur_cd() {
		return getConstString(offset + 27, $ptax_cur_cd);
	}

	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public void ptax_cur_cd(String value) {
		setConstString(offset + 27, $ptax_cur_cd, value);
	}


	/**
	 * Purchase exchange rate cd. 仕入為替レートＣＤ.<p>
	 *
	 */
	public String purc_xrate_cd() {
		return getConstString(offset + 28, $purc_xrate_cd);
	}

	/**
	 * Purchase exchange rate cd. 仕入為替レートＣＤ.<p>
	 *
	 */
	public void purc_xrate_cd(String value) {
		setConstString(offset + 28, $purc_xrate_cd, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 29, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 29, $site_cd, value);
	}


	public mcframe.serverMS.dbc.MST_PO_SCHD_R po_schd(){
		return (mcframe.serverMS.dbc.MST_PO_SCHD_R) getConstInnerRow(offset + 30, $po_schd);
	}
	
	public void po_schd(mcframe.serverMS.dbc.MST_PO_SCHD_R row){
		setConstInnerRow(offset + 30, $po_schd, row);
	}


	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public boolean inc_tax_flg() {
		return getConstBoolean(offset + 31, $inc_tax_flg);
	}

	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public void inc_tax_flg(boolean value) {
		setConstBoolean(offset + 31, $inc_tax_flg, value);
	}


	/**
	 * No credit update 与信更新無.<p>
	 *
	 */
	public boolean cred_no_up_flg() {
		return getConstBoolean(offset + 32, $cred_no_up_flg);
	}

	/**
	 * No credit update 与信更新無.<p>
	 *
	 */
	public void cred_no_up_flg(boolean value) {
		setConstBoolean(offset + 32, $cred_no_up_flg, value);
	}


	/**
	 * Subcontractor currency cd. 外注先通貨ＣＤ.<p>
	 *
	 */
	public String outsrc_sppl_cur_cd() {
		return getConstString(offset + 33, $outsrc_sppl_cur_cd);
	}

	/**
	 * Subcontractor currency cd. 外注先通貨ＣＤ.<p>
	 *
	 */
	public void outsrc_sppl_cur_cd(String value) {
		setConstString(offset + 33, $outsrc_sppl_cur_cd, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($itm_rnd_typ.equalsIgnoreCase(name)) {
			return itm_rnd_typ();
		}
		if ($purc_unit_cd.equalsIgnoreCase(name)) {
			return purc_unit_cd();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		if ($loc_wg_cd.equalsIgnoreCase(name)) {
			return loc_wg_cd();
		}
		if ($outsrc_sppl_cd.equalsIgnoreCase(name)) {
			return outsrc_sppl_cd();
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			return purc_amt_rnd_typ();
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			return purc_tax_rnd_typ();
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			return prov_basis_typ();
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			return prov_typ();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			return ptax_cur_cd();
		}
		if ($purc_xrate_cd.equalsIgnoreCase(name)) {
			return purc_xrate_cd();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($outsrc_sppl_cur_cd.equalsIgnoreCase(name)) {
			return outsrc_sppl_cur_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($itm_dec_place.equalsIgnoreCase(name)) {
			return itm_dec_place();
		}
		if ($min_lot_qty.equalsIgnoreCase(name)) {
			return min_lot_qty();
		}
		if ($batch_lot_qty.equalsIgnoreCase(name)) {
			return batch_lot_qty();
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_amt_dec_place();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($insp_schd_end_dt.equalsIgnoreCase(name)) {
			return insp_schd_end_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($po_flg.equalsIgnoreCase(name)) {
			return po_flg();
		}
		if ($act_flg.equalsIgnoreCase(name)) {
			return act_flg();
		}
		if ($fr_mfg_inst_flg.equalsIgnoreCase(name)) {
			return fr_mfg_inst_flg();
		}
		if ($fr_pnl_flg.equalsIgnoreCase(name)) {
			return fr_pnl_flg();
		}
		if ($bef_abort_flg.equalsIgnoreCase(name)) {
			return bef_abort_flg();
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			return xpns_purc_flg();
		}
		if ($sppl_iv_flg.equalsIgnoreCase(name)) {
			return sppl_iv_flg();
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		if ($cred_no_up_flg.equalsIgnoreCase(name)) {
			return cred_no_up_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($itm_rnd_typ.equalsIgnoreCase(name)) {
			return itm_rnd_typ();
		}
		if ($purc_unit_cd.equalsIgnoreCase(name)) {
			return purc_unit_cd();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		if ($loc_wg_cd.equalsIgnoreCase(name)) {
			return loc_wg_cd();
		}
		if ($outsrc_sppl_cd.equalsIgnoreCase(name)) {
			return outsrc_sppl_cd();
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			return purc_amt_rnd_typ();
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			return purc_tax_rnd_typ();
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			return prov_basis_typ();
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			return prov_typ();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			return ptax_cur_cd();
		}
		if ($purc_xrate_cd.equalsIgnoreCase(name)) {
			return purc_xrate_cd();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($outsrc_sppl_cur_cd.equalsIgnoreCase(name)) {
			return outsrc_sppl_cur_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($itm_dec_place.equalsIgnoreCase(name)) {
			return itm_dec_place();
		}
		if ($min_lot_qty.equalsIgnoreCase(name)) {
			return min_lot_qty();
		}
		if ($batch_lot_qty.equalsIgnoreCase(name)) {
			return batch_lot_qty();
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_amt_dec_place();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($insp_schd_end_dt.equalsIgnoreCase(name)) {
			return insp_schd_end_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($po_flg.equalsIgnoreCase(name)) {
			return po_flg();
		}
		if ($act_flg.equalsIgnoreCase(name)) {
			return act_flg();
		}
		if ($fr_mfg_inst_flg.equalsIgnoreCase(name)) {
			return fr_mfg_inst_flg();
		}
		if ($fr_pnl_flg.equalsIgnoreCase(name)) {
			return fr_pnl_flg();
		}
		if ($bef_abort_flg.equalsIgnoreCase(name)) {
			return bef_abort_flg();
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			return xpns_purc_flg();
		}
		if ($sppl_iv_flg.equalsIgnoreCase(name)) {
			return sppl_iv_flg();
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		if ($cred_no_up_flg.equalsIgnoreCase(name)) {
			return cred_no_up_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($itm_rnd_typ.equalsIgnoreCase(name)) {
			itm_rnd_typ(value);
			return;
		}
		if ($purc_unit_cd.equalsIgnoreCase(name)) {
			purc_unit_cd(value);
			return;
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
			return;
		}
		if ($loc_wg_cd.equalsIgnoreCase(name)) {
			loc_wg_cd(value);
			return;
		}
		if ($outsrc_sppl_cd.equalsIgnoreCase(name)) {
			outsrc_sppl_cd(value);
			return;
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
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
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			prov_basis_typ(value);
			return;
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			prov_typ(value);
			return;
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
			return;
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			ptax_cur_cd(value);
			return;
		}
		if ($purc_xrate_cd.equalsIgnoreCase(name)) {
			purc_xrate_cd(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($outsrc_sppl_cur_cd.equalsIgnoreCase(name)) {
			outsrc_sppl_cur_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($itm_dec_place.equalsIgnoreCase(name)) {
			itm_dec_place(value);
			return;
		}
		if ($min_lot_qty.equalsIgnoreCase(name)) {
			min_lot_qty(value);
			return;
		}
		if ($batch_lot_qty.equalsIgnoreCase(name)) {
			batch_lot_qty(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($itm_dec_place.equalsIgnoreCase(name)) {
			itm_dec_place(value);
			return;
		}
		if ($min_lot_qty.equalsIgnoreCase(name)) {
			min_lot_qty(value);
			return;
		}
		if ($batch_lot_qty.equalsIgnoreCase(name)) {
			batch_lot_qty(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($itm_dec_place.equalsIgnoreCase(name)) {
			itm_dec_place(value);
			return;
		}
		if ($min_lot_qty.equalsIgnoreCase(name)) {
			min_lot_qty(value);
			return;
		}
		if ($batch_lot_qty.equalsIgnoreCase(name)) {
			batch_lot_qty(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($itm_dec_place.equalsIgnoreCase(name)) {
			itm_dec_place(value);
			return;
		}
		if ($min_lot_qty.equalsIgnoreCase(name)) {
			min_lot_qty(value);
			return;
		}
		if ($batch_lot_qty.equalsIgnoreCase(name)) {
			batch_lot_qty(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($itm_dec_place.equalsIgnoreCase(name)) {
			itm_dec_place(value);
			return;
		}
		if ($min_lot_qty.equalsIgnoreCase(name)) {
			min_lot_qty(value);
			return;
		}
		if ($batch_lot_qty.equalsIgnoreCase(name)) {
			batch_lot_qty(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($insp_schd_end_dt.equalsIgnoreCase(name)) {
			insp_schd_end_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($po_flg.equalsIgnoreCase(name)) {
			po_flg(value);
			return;
		}
		if ($act_flg.equalsIgnoreCase(name)) {
			act_flg(value);
			return;
		}
		if ($fr_mfg_inst_flg.equalsIgnoreCase(name)) {
			fr_mfg_inst_flg(value);
			return;
		}
		if ($fr_pnl_flg.equalsIgnoreCase(name)) {
			fr_pnl_flg(value);
			return;
		}
		if ($bef_abort_flg.equalsIgnoreCase(name)) {
			bef_abort_flg(value);
			return;
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			xpns_purc_flg(value);
			return;
		}
		if ($sppl_iv_flg.equalsIgnoreCase(name)) {
			sppl_iv_flg(value);
			return;
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			inc_tax_flg(value);
			return;
		}
		if ($cred_no_up_flg.equalsIgnoreCase(name)) {
			cred_no_up_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($itm_rnd_typ.equalsIgnoreCase(name)) {
			itm_rnd_typ(value);
			return;
		}
		if ($purc_unit_cd.equalsIgnoreCase(name)) {
			purc_unit_cd(value);
			return;
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
			return;
		}
		if ($loc_wg_cd.equalsIgnoreCase(name)) {
			loc_wg_cd(value);
			return;
		}
		if ($outsrc_sppl_cd.equalsIgnoreCase(name)) {
			outsrc_sppl_cd(value);
			return;
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
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
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			prov_basis_typ(value);
			return;
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			prov_typ(value);
			return;
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
			return;
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			ptax_cur_cd(value);
			return;
		}
		if ($purc_xrate_cd.equalsIgnoreCase(name)) {
			purc_xrate_cd(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($outsrc_sppl_cur_cd.equalsIgnoreCase(name)) {
			outsrc_sppl_cur_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($itm_dec_place.equalsIgnoreCase(name)) {
			itm_dec_place(value);
			return;
		}
		if ($min_lot_qty.equalsIgnoreCase(name)) {
			min_lot_qty(value);
			return;
		}
		if ($batch_lot_qty.equalsIgnoreCase(name)) {
			batch_lot_qty(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($itm_dec_place.equalsIgnoreCase(name)) {
			itm_dec_place(value);
			return;
		}
		if ($min_lot_qty.equalsIgnoreCase(name)) {
			min_lot_qty(value);
			return;
		}
		if ($batch_lot_qty.equalsIgnoreCase(name)) {
			batch_lot_qty(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($itm_dec_place.equalsIgnoreCase(name)) {
			itm_dec_place(value);
			return;
		}
		if ($min_lot_qty.equalsIgnoreCase(name)) {
			min_lot_qty(value);
			return;
		}
		if ($batch_lot_qty.equalsIgnoreCase(name)) {
			batch_lot_qty(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($itm_dec_place.equalsIgnoreCase(name)) {
			itm_dec_place(value);
			return;
		}
		if ($min_lot_qty.equalsIgnoreCase(name)) {
			min_lot_qty(value);
			return;
		}
		if ($batch_lot_qty.equalsIgnoreCase(name)) {
			batch_lot_qty(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($itm_dec_place.equalsIgnoreCase(name)) {
			itm_dec_place(value);
			return;
		}
		if ($min_lot_qty.equalsIgnoreCase(name)) {
			min_lot_qty(value);
			return;
		}
		if ($batch_lot_qty.equalsIgnoreCase(name)) {
			batch_lot_qty(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($insp_schd_end_dt.equalsIgnoreCase(name)) {
			insp_schd_end_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($po_flg.equalsIgnoreCase(name)) {
			po_flg(value);
			return;
		}
		if ($act_flg.equalsIgnoreCase(name)) {
			act_flg(value);
			return;
		}
		if ($fr_mfg_inst_flg.equalsIgnoreCase(name)) {
			fr_mfg_inst_flg(value);
			return;
		}
		if ($fr_pnl_flg.equalsIgnoreCase(name)) {
			fr_pnl_flg(value);
			return;
		}
		if ($bef_abort_flg.equalsIgnoreCase(name)) {
			bef_abort_flg(value);
			return;
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			xpns_purc_flg(value);
			return;
		}
		if ($sppl_iv_flg.equalsIgnoreCase(name)) {
			sppl_iv_flg(value);
			return;
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			inc_tax_flg(value);
			return;
		}
		if ($cred_no_up_flg.equalsIgnoreCase(name)) {
			cred_no_up_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($po_schd.equalsIgnoreCase(name)) {
			return po_schd();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($po_schd.equalsIgnoreCase(name)) {
			po_schd(
				((MCContainerMeta) po_schd_META).castInnerRow(mcframe.serverMS.dbc.MST_PO_SCHD_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * PO schedule No. 発注予定ＮＯ.<p>
	 *
	 */
	public String po_schd_no() {
		return po_schd().po_schd_no();
	}

	/**
	 * PO schedule No. 発注予定ＮＯ.<p>
	 *
	 */
	public void po_schd_no(String value) {
		po_schd().po_schd_no(value);
	}

	/**
	 * PO schedule creating source type 発注予定作成元区分.<p>
	 *
	 */
	public String po_schd_src_typ() {
		return po_schd().po_schd_src_typ();
	}

	/**
	 * PO schedule creating source type 発注予定作成元区分.<p>
	 *
	 */
	public void po_schd_src_typ(String value) {
		po_schd().po_schd_src_typ(value);
	}

	/**
	 * PO schedule creating source No. 発注予定作成元ＮＯ.<p>
	 *
	 */
	public String po_schd_src_no() {
		return po_schd().po_schd_src_no();
	}

	/**
	 * PO schedule creating source No. 発注予定作成元ＮＯ.<p>
	 *
	 */
	public void po_schd_src_no(String value) {
		po_schd().po_schd_src_no(value);
	}

	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public String io_schd_pr_no() {
		return po_schd().io_schd_pr_no();
	}

	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public void io_schd_pr_no(String value) {
		po_schd().io_schd_pr_no(value);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return po_schd().trd_cd();
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		po_schd().trd_cd(value);
	}

	/**
	 * Transaction type 取引区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return po_schd().trd_ptn_typ();
	}

	/**
	 * Transaction type 取引区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		po_schd().trd_ptn_typ(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return po_schd().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		po_schd().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return po_schd().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		po_schd().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return po_schd().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		po_schd().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return po_schd().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		po_schd().itm_sub3(value);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return po_schd().itm_nm();
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		po_schd().itm_nm(value);
	}

	/**
	 * Item name for invoice インボイス表記品名.<p>
	 *
	 */
	public String iv_itm_nm() {
		return po_schd().iv_itm_nm();
	}

	/**
	 * Item name for invoice インボイス表記品名.<p>
	 *
	 */
	public void iv_itm_nm(String value) {
		po_schd().iv_itm_nm(value);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return po_schd().ver_no();
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		po_schd().ver_no(value);
	}

	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public String sppl_itm_cd() {
		return po_schd().sppl_itm_cd();
	}

	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public void sppl_itm_cd(String value) {
		po_schd().sppl_itm_cd(value);
	}

	/**
	 * Supplier item name 発注先品目名.<p>
	 *
	 */
	public String sppl_itm_nm() {
		return po_schd().sppl_itm_nm();
	}

	/**
	 * Supplier item name 発注先品目名.<p>
	 *
	 */
	public void sppl_itm_nm(String value) {
		po_schd().sppl_itm_nm(value);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return po_schd().sno1();
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		po_schd().sno1(value);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return po_schd().sno2();
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		po_schd().sno2(value);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return po_schd().sno3();
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		po_schd().sno3(value);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return po_schd().sno4();
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		po_schd().sno4(value);
	}

	/**
	 * Purchase reason cd. 仕入理由ＣＤ.<p>
	 *
	 */
	public String purc_rsn_cd() {
		return po_schd().purc_rsn_cd();
	}

	/**
	 * Purchase reason cd. 仕入理由ＣＤ.<p>
	 *
	 */
	public void purc_rsn_cd(String value) {
		po_schd().purc_rsn_cd(value);
	}

	/**
	 * Delivery location cd. 納入場所ＣＤ.<p>
	 *
	 */
	public String in_to_loc_cd() {
		return po_schd().in_to_loc_cd();
	}

	/**
	 * Delivery location cd. 納入場所ＣＤ.<p>
	 *
	 */
	public void in_to_loc_cd(String value) {
		po_schd().in_to_loc_cd(value);
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return po_schd().str_ln_cd();
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		po_schd().str_ln_cd(value);
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public String dlv_cd() {
		return po_schd().dlv_cd();
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public void dlv_cd(String value) {
		po_schd().dlv_cd(value);
	}

	/**
	 * Miscellaneous delivery destination 納品先諸口.<p>
	 *
	 */
	public boolean dlv_sundry_flg() {
		return po_schd().dlv_sundry_flg();
	}

	/**
	 * Miscellaneous delivery destination 納品先諸口.<p>
	 *
	 */
	public void dlv_sundry_flg(boolean value) {
		po_schd().dlv_sundry_flg(value);
	}

	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public String dlv_nm() {
		return po_schd().dlv_nm();
	}

	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public void dlv_nm(String value) {
		po_schd().dlv_nm(value);
	}

	/**
	 * Delivery destination dept. 納品先部署.<p>
	 *
	 */
	public String dlv_cntct_dpt() {
		return po_schd().dlv_cntct_dpt();
	}

	/**
	 * Delivery destination dept. 納品先部署.<p>
	 *
	 */
	public void dlv_cntct_dpt(String value) {
		po_schd().dlv_cntct_dpt(value);
	}

	/**
	 * Delivery destination PIC 納品先担当者.<p>
	 *
	 */
	public String dlv_cntct_psn() {
		return po_schd().dlv_cntct_psn();
	}

	/**
	 * Delivery destination PIC 納品先担当者.<p>
	 *
	 */
	public void dlv_cntct_psn(String value) {
		po_schd().dlv_cntct_psn(value);
	}

	/**
	 * Zip code (Delivery destination) 納品先郵便番号.<p>
	 *
	 */
	public String dlv_zip_cd() {
		return po_schd().dlv_zip_cd();
	}

	/**
	 * Zip code (Delivery destination) 納品先郵便番号.<p>
	 *
	 */
	public void dlv_zip_cd(String value) {
		po_schd().dlv_zip_cd(value);
	}

	/**
	 * Address 1 (Delivery destination) 納品先住所１.<p>
	 *
	 */
	public String dlv_addr1() {
		return po_schd().dlv_addr1();
	}

	/**
	 * Address 1 (Delivery destination) 納品先住所１.<p>
	 *
	 */
	public void dlv_addr1(String value) {
		po_schd().dlv_addr1(value);
	}

	/**
	 * Address 2 (Delivery destination) 納品先住所２.<p>
	 *
	 */
	public String dlv_addr2() {
		return po_schd().dlv_addr2();
	}

	/**
	 * Address 2 (Delivery destination) 納品先住所２.<p>
	 *
	 */
	public void dlv_addr2(String value) {
		po_schd().dlv_addr2(value);
	}

	/**
	 * Address 3 (Delivery destination) 納品先住所３.<p>
	 *
	 */
	public String dlv_addr3() {
		return po_schd().dlv_addr3();
	}

	/**
	 * Address 3 (Delivery destination) 納品先住所３.<p>
	 *
	 */
	public void dlv_addr3(String value) {
		po_schd().dlv_addr3(value);
	}

	/**
	 * Address 4 (Delivery destination) 納品先住所４.<p>
	 *
	 */
	public String dlv_addr4() {
		return po_schd().dlv_addr4();
	}

	/**
	 * Address 4 (Delivery destination) 納品先住所４.<p>
	 *
	 */
	public void dlv_addr4(String value) {
		po_schd().dlv_addr4(value);
	}

	/**
	 * TEL (Delivery destination) 納品先ＴＥＬ.<p>
	 *
	 */
	public String dlv_tel() {
		return po_schd().dlv_tel();
	}

	/**
	 * TEL (Delivery destination) 納品先ＴＥＬ.<p>
	 *
	 */
	public void dlv_tel(String value) {
		po_schd().dlv_tel(value);
	}

	/**
	 * FAX (Delivery destination) 納品先ＦＡＸ.<p>
	 *
	 */
	public String dlv_fax() {
		return po_schd().dlv_fax();
	}

	/**
	 * FAX (Delivery destination) 納品先ＦＡＸ.<p>
	 *
	 */
	public void dlv_fax(String value) {
		po_schd().dlv_fax(value);
	}

	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public String tdlv_cd() {
		return po_schd().tdlv_cd();
	}

	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public void tdlv_cd(String value) {
		po_schd().tdlv_cd(value);
	}

	/**
	 * Miscellaneous receiving point 配送先諸口.<p>
	 *
	 */
	public boolean tdlv_sundry_flg() {
		return po_schd().tdlv_sundry_flg();
	}

	/**
	 * Miscellaneous receiving point 配送先諸口.<p>
	 *
	 */
	public void tdlv_sundry_flg(boolean value) {
		po_schd().tdlv_sundry_flg(value);
	}

	/**
	 * Delivery destination dept. 配送先担当部署.<p>
	 *
	 */
	public String tdlv_cntct_dpt() {
		return po_schd().tdlv_cntct_dpt();
	}

	/**
	 * Delivery destination dept. 配送先担当部署.<p>
	 *
	 */
	public void tdlv_cntct_dpt(String value) {
		po_schd().tdlv_cntct_dpt(value);
	}

	/**
	 * Receiving point PIC 配送先担当者.<p>
	 *
	 */
	public String tdlv_cntct_psn() {
		return po_schd().tdlv_cntct_psn();
	}

	/**
	 * Receiving point PIC 配送先担当者.<p>
	 *
	 */
	public void tdlv_cntct_psn(String value) {
		po_schd().tdlv_cntct_psn(value);
	}

	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public String tdlv_nm() {
		return po_schd().tdlv_nm();
	}

	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public void tdlv_nm(String value) {
		po_schd().tdlv_nm(value);
	}

	/**
	 * Receiving point zip code 配送先郵便番号.<p>
	 *
	 */
	public String tdlv_zip_cd() {
		return po_schd().tdlv_zip_cd();
	}

	/**
	 * Receiving point zip code 配送先郵便番号.<p>
	 *
	 */
	public void tdlv_zip_cd(String value) {
		po_schd().tdlv_zip_cd(value);
	}

	/**
	 * Receiving point address 1 配送先住所１.<p>
	 *
	 */
	public String tdlv_addr1() {
		return po_schd().tdlv_addr1();
	}

	/**
	 * Receiving point address 1 配送先住所１.<p>
	 *
	 */
	public void tdlv_addr1(String value) {
		po_schd().tdlv_addr1(value);
	}

	/**
	 * Receiving point address 2 配送先住所２.<p>
	 *
	 */
	public String tdlv_addr2() {
		return po_schd().tdlv_addr2();
	}

	/**
	 * Receiving point address 2 配送先住所２.<p>
	 *
	 */
	public void tdlv_addr2(String value) {
		po_schd().tdlv_addr2(value);
	}

	/**
	 * Receiving point address 3 配送先住所３.<p>
	 *
	 */
	public String tdlv_addr3() {
		return po_schd().tdlv_addr3();
	}

	/**
	 * Receiving point address 3 配送先住所３.<p>
	 *
	 */
	public void tdlv_addr3(String value) {
		po_schd().tdlv_addr3(value);
	}

	/**
	 * Receiving point address 4 配送先住所４.<p>
	 *
	 */
	public String tdlv_addr4() {
		return po_schd().tdlv_addr4();
	}

	/**
	 * Receiving point address 4 配送先住所４.<p>
	 *
	 */
	public void tdlv_addr4(String value) {
		po_schd().tdlv_addr4(value);
	}

	/**
	 * Receiving point TEL 配送先ＴＥＬ.<p>
	 *
	 */
	public String tdlv_tel() {
		return po_schd().tdlv_tel();
	}

	/**
	 * Receiving point TEL 配送先ＴＥＬ.<p>
	 *
	 */
	public void tdlv_tel(String value) {
		po_schd().tdlv_tel(value);
	}

	/**
	 * Receiving point FAX 配送先ＦＡＸ.<p>
	 *
	 */
	public String tdlv_fax() {
		return po_schd().tdlv_fax();
	}

	/**
	 * Receiving point FAX 配送先ＦＡＸ.<p>
	 *
	 */
	public void tdlv_fax(String value) {
		po_schd().tdlv_fax(value);
	}

	/**
	 * Entry date 登録日.<p>
	 *
	 */
	public MCDate reg_dt() {
		return po_schd().reg_dt();
	}

	/**
	 * Entry date 登録日.<p>
	 *
	 */
	public void reg_dt(MCDate value) {
		po_schd().reg_dt(value);
	}

	/**
	 * Requesting WG cd. 依頼元ＷＧ ＣＤ.<p>
	 *
	 */
	public String rqst_wg_cd() {
		return po_schd().rqst_wg_cd();
	}

	/**
	 * Requesting WG cd. 依頼元ＷＧ ＣＤ.<p>
	 *
	 */
	public void rqst_wg_cd(String value) {
		po_schd().rqst_wg_cd(value);
	}

	/**
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public String purc_usr_cd() {
		return po_schd().purc_usr_cd();
	}

	/**
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public void purc_usr_cd(String value) {
		po_schd().purc_usr_cd(value);
	}

	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public String purc_dpt_cd() {
		return po_schd().purc_dpt_cd();
	}

	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public void purc_dpt_cd(String value) {
		po_schd().purc_dpt_cd(value);
	}

	/**
	 * WG cd. ＷＧ ＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return po_schd().wg_cd();
	}

	/**
	 * WG cd. ＷＧ ＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		po_schd().wg_cd(value);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return po_schd().sppl_cd();
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		po_schd().sppl_cd(value);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return po_schd().maker_cd();
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		po_schd().maker_cd(value);
	}

	/**
	 * Subcontracting 外注.<p>
	 *
	 */
	public boolean outsrc_flg() {
		return po_schd().outsrc_flg();
	}

	/**
	 * Subcontracting 外注.<p>
	 *
	 */
	public void outsrc_flg(boolean value) {
		po_schd().outsrc_flg(value);
	}

	/**
	 * Subcontracting item order No. 外注品目オーダＮＯ.<p>
	 *
	 */
	public String outsrc_itm_ord_no() {
		return po_schd().outsrc_itm_ord_no();
	}

	/**
	 * Subcontracting item order No. 外注品目オーダＮＯ.<p>
	 *
	 */
	public void outsrc_itm_ord_no(String value) {
		po_schd().outsrc_itm_ord_no(value);
	}

	/**
	 * Plan item order No. 計画品目オーダＮＯ.<p>
	 *
	 */
	public String pln_itm_ord_no() {
		return po_schd().pln_itm_ord_no();
	}

	/**
	 * Plan item order No. 計画品目オーダＮＯ.<p>
	 *
	 */
	public void pln_itm_ord_no(String value) {
		po_schd().pln_itm_ord_no(value);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return po_schd().mfg_loc_cd();
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		po_schd().mfg_loc_cd(value);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return po_schd().bom_ptn();
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		po_schd().bom_ptn(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return po_schd().trd_unit_qty();
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		po_schd().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		po_schd().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		po_schd().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		po_schd().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		po_schd().trd_unit_qty(value);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return po_schd().trd_unit_cd();
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		po_schd().trd_unit_cd(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return po_schd().base_unit_qty();
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		po_schd().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		po_schd().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		po_schd().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		po_schd().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		po_schd().base_unit_qty(value);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return po_schd().base_unit_cd();
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		po_schd().base_unit_cd(value);
	}

	/**
	 * Purchase unit price acquisition type 購買単価取得区分.<p>
	 *
	 */
	public String purc_upri_req_typ() {
		return po_schd().purc_upri_req_typ();
	}

	/**
	 * Purchase unit price acquisition type 購買単価取得区分.<p>
	 *
	 */
	public void purc_upri_req_typ(String value) {
		po_schd().purc_upri_req_typ(value);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return po_schd().trd_cur_cd();
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		po_schd().trd_cur_cd(value);
	}

	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public String tax_cd() {
		return po_schd().tax_cd();
	}

	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public void tax_cd(String value) {
		po_schd().tax_cd(value);
	}

	/**
	 * Set exchange rate 為替レート指定.<p>
	 *
	 */
	public boolean xrate_inpt_flg() {
		return po_schd().xrate_inpt_flg();
	}

	/**
	 * Set exchange rate 為替レート指定.<p>
	 *
	 */
	public void xrate_inpt_flg(boolean value) {
		po_schd().xrate_inpt_flg(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCNumber xrate() {
		return po_schd().xrate();
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		po_schd().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(int value) {
		po_schd().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(long value) {
		po_schd().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(float value) {
		po_schd().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(double value) {
		po_schd().xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public MCNumber ptax_xrate() {
		return po_schd().ptax_xrate();
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(MCNumber value) {
		po_schd().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(int value) {
		po_schd().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(long value) {
		po_schd().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(float value) {
		po_schd().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(double value) {
		po_schd().ptax_xrate(value);
	}

	/**
	 * Set tax exchange rate 納税為替レート指定.<p>
	 *
	 */
	public boolean ptax_xrate_inpt_flg() {
		return po_schd().ptax_xrate_inpt_flg();
	}

	/**
	 * Set tax exchange rate 納税為替レート指定.<p>
	 *
	 */
	public void ptax_xrate_inpt_flg(boolean value) {
		po_schd().ptax_xrate_inpt_flg(value);
	}

	/**
	 * Not to reacquire unit price 単価再取得対象外.<p>
	 *
	 */
	public boolean upri_not_tgt_flg() {
		return po_schd().upri_not_tgt_flg();
	}

	/**
	 * Not to reacquire unit price 単価再取得対象外.<p>
	 *
	 */
	public void upri_not_tgt_flg(boolean value) {
		po_schd().upri_not_tgt_flg(value);
	}

	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public boolean interim_flg() {
		return po_schd().interim_flg();
	}

	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public void interim_flg(boolean value) {
		po_schd().interim_flg(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public MCNumber trd_cur_upri() {
		return po_schd().trd_cur_upri();
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(MCNumber value) {
		po_schd().trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(int value) {
		po_schd().trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(long value) {
		po_schd().trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(float value) {
		po_schd().trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(double value) {
		po_schd().trd_cur_upri(value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public MCNumber trd_cur_proc_upri() {
		return po_schd().trd_cur_proc_upri();
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(MCNumber value) {
		po_schd().trd_cur_proc_upri(value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(int value) {
		po_schd().trd_cur_proc_upri(value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(long value) {
		po_schd().trd_cur_proc_upri(value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(float value) {
		po_schd().trd_cur_proc_upri(value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(double value) {
		po_schd().trd_cur_proc_upri(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public MCNumber trd_cur_onr_prov_upri() {
		return po_schd().trd_cur_onr_prov_upri();
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(MCNumber value) {
		po_schd().trd_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(int value) {
		po_schd().trd_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(long value) {
		po_schd().trd_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(float value) {
		po_schd().trd_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(double value) {
		po_schd().trd_cur_onr_prov_upri(value);
	}

	/**
	 * Scheduled PO date 発注予定日.<p>
	 *
	 */
	public MCDate po_schd_dt() {
		return po_schd().po_schd_dt();
	}

	/**
	 * Scheduled PO date 発注予定日.<p>
	 *
	 */
	public void po_schd_dt(MCDate value) {
		po_schd().po_schd_dt(value);
	}

	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public MCDate purc_schd_dt() {
		return po_schd().purc_schd_dt();
	}

	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public void purc_schd_dt(MCDate value) {
		po_schd().purc_schd_dt(value);
	}

	/**
	 * Request source desired available date 依頼元使用可能希望日.<p>
	 *
	 */
	public MCDate rqst_avl_rqst_dt() {
		return po_schd().rqst_avl_rqst_dt();
	}

	/**
	 * Request source desired available date 依頼元使用可能希望日.<p>
	 *
	 */
	public void rqst_avl_rqst_dt(MCDate value) {
		po_schd().rqst_avl_rqst_dt(value);
	}

	/**
	 * Do not allow request source update 依頼元更新不可.<p>
	 *
	 */
	public boolean rqst_upd_stop_flg() {
		return po_schd().rqst_upd_stop_flg();
	}

	/**
	 * Do not allow request source update 依頼元更新不可.<p>
	 *
	 */
	public void rqst_upd_stop_flg(boolean value) {
		po_schd().rqst_upd_stop_flg(value);
	}

	/**
	 * Charged item cd. 負担品目ＣＤ.<p>
	 *
	 */
	public String bd_itm_cd() {
		return po_schd().bd_itm_cd();
	}

	/**
	 * Charged item cd. 負担品目ＣＤ.<p>
	 *
	 */
	public void bd_itm_cd(String value) {
		po_schd().bd_itm_cd(value);
	}

	/**
	 * Charged branch No. 1 負担枝番１.<p>
	 *
	 */
	public String bd_itm_sub1() {
		return po_schd().bd_itm_sub1();
	}

	/**
	 * Charged branch No. 1 負担枝番１.<p>
	 *
	 */
	public void bd_itm_sub1(String value) {
		po_schd().bd_itm_sub1(value);
	}

	/**
	 * Charged branch No. 2 負担枝番２.<p>
	 *
	 */
	public String bd_itm_sub2() {
		return po_schd().bd_itm_sub2();
	}

	/**
	 * Charged branch No. 2 負担枝番２.<p>
	 *
	 */
	public void bd_itm_sub2(String value) {
		po_schd().bd_itm_sub2(value);
	}

	/**
	 * Charged branch No. 3 負担枝番３.<p>
	 *
	 */
	public String bd_itm_sub3() {
		return po_schd().bd_itm_sub3();
	}

	/**
	 * Charged branch No. 3 負担枝番３.<p>
	 *
	 */
	public void bd_itm_sub3(String value) {
		po_schd().bd_itm_sub3(value);
	}

	/**
	 * Charged SEIBAN No. 1 負担手配ＮＯ１.<p>
	 *
	 */
	public String bd_sno1() {
		return po_schd().bd_sno1();
	}

	/**
	 * Charged SEIBAN No. 1 負担手配ＮＯ１.<p>
	 *
	 */
	public void bd_sno1(String value) {
		po_schd().bd_sno1(value);
	}

	/**
	 * Charged SEIBAN No. 2 負担手配ＮＯ２.<p>
	 *
	 */
	public String bd_sno2() {
		return po_schd().bd_sno2();
	}

	/**
	 * Charged SEIBAN No. 2 負担手配ＮＯ２.<p>
	 *
	 */
	public void bd_sno2(String value) {
		po_schd().bd_sno2(value);
	}

	/**
	 * Charged SEIBAN No. 3 負担手配ＮＯ３.<p>
	 *
	 */
	public String bd_sno3() {
		return po_schd().bd_sno3();
	}

	/**
	 * Charged SEIBAN No. 3 負担手配ＮＯ３.<p>
	 *
	 */
	public void bd_sno3(String value) {
		po_schd().bd_sno3(value);
	}

	/**
	 * Charged SEIBAN No. 4 負担手配ＮＯ４.<p>
	 *
	 */
	public String bd_sno4() {
		return po_schd().bd_sno4();
	}

	/**
	 * Charged SEIBAN No. 4 負担手配ＮＯ４.<p>
	 *
	 */
	public void bd_sno4(String value) {
		po_schd().bd_sno4(value);
	}

	/**
	 * Charged lot No. 負担ロットＮＯ.<p>
	 *
	 */
	public String bd_lot_no() {
		return po_schd().bd_lot_no();
	}

	/**
	 * Charged lot No. 負担ロットＮＯ.<p>
	 *
	 */
	public void bd_lot_no(String value) {
		po_schd().bd_lot_no(value);
	}

	/**
	 * Charged sublot No. 負担サブロットＮＯ.<p>
	 *
	 */
	public String bd_sublot_no() {
		return po_schd().bd_sublot_no();
	}

	/**
	 * Charged sublot No. 負担サブロットＮＯ.<p>
	 *
	 */
	public void bd_sublot_no(String value) {
		po_schd().bd_sublot_no(value);
	}

	/**
	 * Charged location cd. 負担場所ＣＤ.<p>
	 *
	 */
	public String bd_loc_cd() {
		return po_schd().bd_loc_cd();
	}

	/**
	 * Charged location cd. 負担場所ＣＤ.<p>
	 *
	 */
	public void bd_loc_cd(String value) {
		po_schd().bd_loc_cd(value);
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public String bd_dpt_cd() {
		return po_schd().bd_dpt_cd();
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		po_schd().bd_dpt_cd(value);
	}

	/**
	 * Charged item category cd. 負担品群ＣＤ.<p>
	 *
	 */
	public String bd_ctg_cd() {
		return po_schd().bd_ctg_cd();
	}

	/**
	 * Charged item category cd. 負担品群ＣＤ.<p>
	 *
	 */
	public void bd_ctg_cd(String value) {
		po_schd().bd_ctg_cd(value);
	}

	/**
	 * Charged operation cd. 負担工程ＣＤ.<p>
	 *
	 */
	public String bd_oper_cd() {
		return po_schd().bd_oper_cd();
	}

	/**
	 * Charged operation cd. 負担工程ＣＤ.<p>
	 *
	 */
	public void bd_oper_cd(String value) {
		po_schd().bd_oper_cd(value);
	}

	/**
	 * Charged sales No. 負担受注ＮＯ.<p>
	 *
	 */
	public String bd_slo_no() {
		return po_schd().bd_slo_no();
	}

	/**
	 * Charged sales No. 負担受注ＮＯ.<p>
	 *
	 */
	public void bd_slo_no(String value) {
		po_schd().bd_slo_no(value);
	}

	/**
	 * Charged invoice No. 負担インボイスＮＯ.<p>
	 *
	 */
	public String bd_iv_no() {
		return po_schd().bd_iv_no();
	}

	/**
	 * Charged invoice No. 負担インボイスＮＯ.<p>
	 *
	 */
	public void bd_iv_no(String value) {
		po_schd().bd_iv_no(value);
	}

	/**
	 * Charged PO No. 負担発注ＮＯ.<p>
	 *
	 */
	public String bd_po_no() {
		return po_schd().bd_po_no();
	}

	/**
	 * Charged PO No. 負担発注ＮＯ.<p>
	 *
	 */
	public void bd_po_no(String value) {
		po_schd().bd_po_no(value);
	}

	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public boolean abort_flg() {
		return po_schd().abort_flg();
	}

	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		po_schd().abort_flg(value);
	}

	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return po_schd().intr_rmrks();
	}

	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		po_schd().intr_rmrks(value);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return po_schd().trd_d_rmrks();
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		po_schd().trd_d_rmrks(value);
	}

	/**
	 * PO contact remarks 発注連絡備考.<p>
	 *
	 */
	public String po_cnt_rmrks() {
		return po_schd().po_cnt_rmrks();
	}

	/**
	 * PO contact remarks 発注連絡備考.<p>
	 *
	 */
	public void po_cnt_rmrks(String value) {
		po_schd().po_cnt_rmrks(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return po_schd().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		po_schd().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return po_schd().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		po_schd().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return po_schd().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		po_schd().sub_char3(value);
	}

	/**
	 * Desired delivery time 納入希望時刻.<p>
	 *
	 */
	public MCDate dlv_rqst_tm() {
		return po_schd().dlv_rqst_tm();
	}

	/**
	 * Desired delivery time 納入希望時刻.<p>
	 *
	 */
	public void dlv_rqst_tm(MCDate value) {
		po_schd().dlv_rqst_tm(value);
	}

	/**
	 * Request source desired delivery date 依頼元納入希望日.<p>
	 *
	 */
	public MCDate rqst_dlv_rqst_tm() {
		return po_schd().rqst_dlv_rqst_tm();
	}

	/**
	 * Request source desired delivery date 依頼元納入希望日.<p>
	 *
	 */
	public void rqst_dlv_rqst_tm(MCDate value) {
		po_schd().rqst_dlv_rqst_tm(value);
	}

	/**
	 * Edited by request source 依頼元訂正.<p>
	 *
	 */
	public boolean rqst_crrct_flg() {
		return po_schd().rqst_crrct_flg();
	}

	/**
	 * Edited by request source 依頼元訂正.<p>
	 *
	 */
	public void rqst_crrct_flg(boolean value) {
		po_schd().rqst_crrct_flg(value);
	}

	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return po_schd().sundry_itm_flg();
	}

	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		po_schd().sundry_itm_flg(value);
	}

	/**
	 * Create subcontracting item order 外注品目オーダ作成.<p>
	 *
	 */
	public boolean outsrc_itm_ord_crt_flg() {
		return po_schd().outsrc_itm_ord_crt_flg();
	}

	/**
	 * Create subcontracting item order 外注品目オーダ作成.<p>
	 *
	 */
	public void outsrc_itm_ord_crt_flg(boolean value) {
		po_schd().outsrc_itm_ord_crt_flg(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return po_schd().trd_cur_amt();
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		po_schd().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		po_schd().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		po_schd().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		po_schd().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		po_schd().trd_cur_amt(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public MCNumber trd_cur_proc_amt() {
		return po_schd().trd_cur_proc_amt();
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(MCNumber value) {
		po_schd().trd_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(int value) {
		po_schd().trd_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(long value) {
		po_schd().trd_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(float value) {
		po_schd().trd_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(double value) {
		po_schd().trd_cur_proc_amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public MCNumber trd_cur_onr_prov_amt() {
		return po_schd().trd_cur_onr_prov_amt();
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(MCNumber value) {
		po_schd().trd_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(int value) {
		po_schd().trd_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(long value) {
		po_schd().trd_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(float value) {
		po_schd().trd_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(double value) {
		po_schd().trd_cur_onr_prov_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt() {
		return po_schd().trd_cur_tax_amt();
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(MCNumber value) {
		po_schd().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(int value) {
		po_schd().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(long value) {
		po_schd().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(float value) {
		po_schd().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(double value) {
		po_schd().trd_cur_tax_amt(value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public MCNumber purc_lt() {
		return po_schd().purc_lt();
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(MCNumber value) {
		po_schd().purc_lt(value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(int value) {
		po_schd().purc_lt(value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(long value) {
		po_schd().purc_lt(value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(float value) {
		po_schd().purc_lt(value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(double value) {
		po_schd().purc_lt(value);
	}

	/**
	 * Direct-delivery type 直納区分.<p>
	 *
	 */
	public String drct_dlv_typ() {
		return po_schd().drct_dlv_typ();
	}

	/**
	 * Direct-delivery type 直納区分.<p>
	 *
	 */
	public void drct_dlv_typ(String value) {
		po_schd().drct_dlv_typ(value);
	}

	/**
	 * PO schedule change type 発注予定変更区分.<p>
	 *
	 */
	public String po_schd_chg_typ() {
		return po_schd().po_schd_chg_typ();
	}

	/**
	 * PO schedule change type 発注予定変更区分.<p>
	 *
	 */
	public void po_schd_chg_typ(String value) {
		po_schd().po_schd_chg_typ(value);
	}

	/**
	 * Schedule split source No. 分割元予定ＮＯ.<p>
	 *
	 */
	public String split_src_schd_no() {
		return po_schd().split_src_schd_no();
	}

	/**
	 * Schedule split source No. 分割元予定ＮＯ.<p>
	 *
	 */
	public void split_src_schd_no(String value) {
		po_schd().split_src_schd_no(value);
	}

	/**
	 * Charged WG cd. 負担ＷＧ ＣＤ.<p>
	 *
	 */
	public String bd_wg_cd() {
		return po_schd().bd_wg_cd();
	}

	/**
	 * Charged WG cd. 負担ＷＧ ＣＤ.<p>
	 *
	 */
	public void bd_wg_cd(String value) {
		po_schd().bd_wg_cd(value);
	}

	/**
	 * Charged BP cd. 負担取引先ＣＤ.<p>
	 *
	 */
	public String bd_bp_cd() {
		return po_schd().bd_bp_cd();
	}

	/**
	 * Charged BP cd. 負担取引先ＣＤ.<p>
	 *
	 */
	public void bd_bp_cd(String value) {
		po_schd().bd_bp_cd(value);
	}

	/**
	 * Base unit PO qty. 基準単位発注数量.<p>
	 *
	 */
	public MCNumber base_unit_po_qty() {
		return po_schd().base_unit_po_qty();
	}

	/**
	 * Base unit PO qty. 基準単位発注数量.<p>
	 *
	 */
	public void base_unit_po_qty(MCNumber value) {
		po_schd().base_unit_po_qty(value);
	}

	/**
	 * Base unit PO qty. 基準単位発注数量.<p>
	 *
	 */
	public void base_unit_po_qty(int value) {
		po_schd().base_unit_po_qty(value);
	}

	/**
	 * Base unit PO qty. 基準単位発注数量.<p>
	 *
	 */
	public void base_unit_po_qty(long value) {
		po_schd().base_unit_po_qty(value);
	}

	/**
	 * Base unit PO qty. 基準単位発注数量.<p>
	 *
	 */
	public void base_unit_po_qty(float value) {
		po_schd().base_unit_po_qty(value);
	}

	/**
	 * Base unit PO qty. 基準単位発注数量.<p>
	 *
	 */
	public void base_unit_po_qty(double value) {
		po_schd().base_unit_po_qty(value);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return po_schd().slo_no();
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		po_schd().slo_no(value);
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public String slo_d_no() {
		return po_schd().slo_d_no();
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public void slo_d_no(String value) {
		po_schd().slo_d_no(value);
	}

	/**
	 * Add 追加.<p>
	 *
	 */
	public boolean add_flg() {
		return po_schd().add_flg();
	}

	/**
	 * Add 追加.<p>
	 *
	 */
	public void add_flg(boolean value) {
		po_schd().add_flg(value);
	}

	/**
	 * Source schedule 元予定.<p>
	 *
	 */
	public boolean org_flg() {
		return po_schd().org_flg();
	}

	/**
	 * Source schedule 元予定.<p>
	 *
	 */
	public void org_flg(boolean value) {
		po_schd().org_flg(value);
	}

	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public String rqst_fr_dpt_cd() {
		return po_schd().rqst_fr_dpt_cd();
	}

	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public void rqst_fr_dpt_cd(String value) {
		po_schd().rqst_fr_dpt_cd(value);
	}

	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public String rqst_fr_usr_cd() {
		return po_schd().rqst_fr_usr_cd();
	}

	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public void rqst_fr_usr_cd(String value) {
		po_schd().rqst_fr_usr_cd(value);
	}

}

