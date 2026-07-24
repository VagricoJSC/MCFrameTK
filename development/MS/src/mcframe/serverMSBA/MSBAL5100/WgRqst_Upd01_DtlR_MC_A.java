package mcframe.serverMSBA.MSBAL5100;

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
 * ブロック"WgRqst_Upd01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class WgRqst_Upd01_DtlR_MC_A extends MCConstRow {

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * Pegging number 紐付け番号.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	public static final String $wg_rqst = "wg_rqst";
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public static final String $cst_cd = "cst_cd";
	/**
	 * Auto-reply 自動回答.<p>
	 *
	 */
	public static final String $auto_prms_flg = "auto_prms_flg";
	/**
	 * For auto-reply 自動回答対象.<p>
	 *
	 */
	public static final String $auto_prms_tgt_flg = "auto_prms_tgt_flg";
	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public static final String $abort_flg = "abort_flg";
	/**
	 * Cancellation for cancelled remaining 打切取消.<p>
	 *
	 */
	public static final String $abort_can_flg = "abort_can_flg";
	/**
	 * No credit update 与信更新無し.<p>
	 *
	 */
	public static final String $cred_no_up_flg = "cred_no_up_flg";
	/**
	 * Screen correction 画面訂正.<p>
	 *
	 */
	public static final String $screen_crct_flg = "screen_crct_flg";
	/**
	 * Scheduled PO date 発注予定日.<p>
	 *
	 */
	public static final String $po_schd_dt = "po_schd_dt";
	/**
	 * Scheduled mfg. start date 製造着手予定日.<p>
	 *
	 */
	public static final String $mfg_st_schd_dt = "mfg_st_schd_dt";
	/**
	 * Scheduled mfg. end date 製造終了予定日.<p>
	 *
	 */
	public static final String $mfg_end_schd_dt = "mfg_end_schd_dt";
	/**
	 * Scheduled GI date 出庫予定日.<p>
	 *
	 */
	public static final String $gi_schd_dt = "gi_schd_dt";
	/**
	 * Scheduled storage completion date 格納完了予定日.<p>
	 *
	 */
	public static final String $strg_schd_dt = "strg_schd_dt";
	/**
	 * Scheduled acceptance date 検収予定日.<p>
	 *
	 */
	public static final String $accpt_schd_dt = "accpt_schd_dt";
	/**
	 * Scheduled inspection start date 検査着手予定日.<p>
	 *
	 */
	public static final String $insp_st_schd_dt = "insp_st_schd_dt";
	/**
	 * Scheduled inspection end date 検査終了予定日.<p>
	 *
	 */
	public static final String $insp_end_schd_dt = "insp_end_schd_dt";
	/**
	 * Available date 使用可能予定日.<p>
	 *
	 */
	public static final String $avl_schd_dt = "avl_schd_dt";

	public static final String $wg_rqst_no = $wg_rqst + ".wg_rqst_no";
	public static final String $last_wg_rqst_no = $wg_rqst + ".last_wg_rqst_no";
	public static final String $wg_rqst_typ = $wg_rqst + ".wg_rqst_typ";
	public static final String $wg_rqst_src_typ = $wg_rqst + ".wg_rqst_src_typ";
	public static final String $wg_rqst_src_no = $wg_rqst + ".wg_rqst_src_no";
	public static final String $wg_rqst_sts_typ = $wg_rqst + ".wg_rqst_sts_typ";
	public static final String $rqst_dt = $wg_rqst + ".rqst_dt";
	public static final String $prms_ntc_flg = $wg_rqst + ".prms_ntc_flg";
	public static final String $prms_dt = $wg_rqst + ".prms_dt";
	public static final String $prms_uncn_flg = $wg_rqst + ".prms_uncn_flg";
	public static final String $re_rqst_flg = $wg_rqst + ".re_rqst_flg";
	public static final String $re_rqst_dt = $wg_rqst + ".re_rqst_dt";
	public static final String $rqst_crrct_flg = $wg_rqst + ".rqst_crrct_flg";
	public static final String $dlv_inst_rcpt_flg = $wg_rqst + ".dlv_inst_rcpt_flg";
	public static final String $can_flg = $wg_rqst + ".can_flg";
	public static final String $rqst_fr_wg_cd = $wg_rqst + ".rqst_fr_wg_cd";
	public static final String $rqst_fr_dpt_cd = $wg_rqst + ".rqst_fr_dpt_cd";
	public static final String $rqst_fr_usr_cd = $wg_rqst + ".rqst_fr_usr_cd";
	public static final String $gr_loc_wg_cd = $wg_rqst + ".gr_loc_wg_cd";
	public static final String $gr_lg_grp_cd = $wg_rqst + ".gr_lg_grp_cd";
	public static final String $gr_loc_cd = $wg_rqst + ".gr_loc_cd";
	public static final String $gr_str_ln_cd = $wg_rqst + ".gr_str_ln_cd";
	public static final String $gr_rqst_tm = $wg_rqst + ".gr_rqst_tm";
	public static final String $rqst_to_wg_cd = $wg_rqst + ".rqst_to_wg_cd";
	public static final String $gi_loc_wg_cd = $wg_rqst + ".gi_loc_wg_cd";
	public static final String $gi_lg_grp_cd = $wg_rqst + ".gi_lg_grp_cd";
	public static final String $gi_loc_cd = $wg_rqst + ".gi_loc_cd";
	public static final String $gi_str_ln_cd = $wg_rqst + ".gi_str_ln_cd";
	public static final String $gi_rqst_tm = $wg_rqst + ".gi_rqst_tm";
	public static final String $itm_cd = $wg_rqst + ".itm_cd";
	public static final String $itm_sub1 = $wg_rqst + ".itm_sub1";
	public static final String $itm_sub2 = $wg_rqst + ".itm_sub2";
	public static final String $itm_sub3 = $wg_rqst + ".itm_sub3";
	public static final String $itm_nm = $wg_rqst + ".itm_nm";
	public static final String $iv_itm_nm = $wg_rqst + ".iv_itm_nm";
	public static final String $sundry_itm_flg = $wg_rqst + ".sundry_itm_flg";
	public static final String $lot_no = $wg_rqst + ".lot_no";
	public static final String $sublot_no = $wg_rqst + ".sublot_no";
	public static final String $sno1 = $wg_rqst + ".sno1";
	public static final String $sno1_null_flg = $wg_rqst + ".sno1_null_flg";
	public static final String $sno2 = $wg_rqst + ".sno2";
	public static final String $sno2_null_flg = $wg_rqst + ".sno2_null_flg";
	public static final String $sno3 = $wg_rqst + ".sno3";
	public static final String $sno3_null_flg = $wg_rqst + ".sno3_null_flg";
	public static final String $sno4 = $wg_rqst + ".sno4";
	public static final String $sno4_null_flg = $wg_rqst + ".sno4_null_flg";
	public static final String $ver_no = $wg_rqst + ".ver_no";
	public static final String $gd_cd = $wg_rqst + ".gd_cd";
	public static final String $vld_dt_fr = $wg_rqst + ".vld_dt_fr";
	public static final String $vld_dt_to = $wg_rqst + ".vld_dt_to";
	public static final String $trd_unit_qty = $wg_rqst + ".trd_unit_qty";
	public static final String $trd_unit_cd = $wg_rqst + ".trd_unit_cd";
	public static final String $base_unit_qty = $wg_rqst + ".base_unit_qty";
	public static final String $base_unit_cd = $wg_rqst + ".base_unit_cd";
	public static final String $not_cmpl_qty = $wg_rqst + ".not_cmpl_qty";
	public static final String $sppl_cd = $wg_rqst + ".sppl_cd";
	public static final String $maker_cd = $wg_rqst + ".maker_cd";
	public static final String $io_schd_pr_no = $wg_rqst + ".io_schd_pr_no";
	public static final String $slo_no = $wg_rqst + ".slo_no";
	public static final String $slo_d_no = $wg_rqst + ".slo_d_no";
	public static final String $dlv_cd = $wg_rqst + ".dlv_cd";
	public static final String $dlv_sundry_flg = $wg_rqst + ".dlv_sundry_flg";
	public static final String $dlv_nm = $wg_rqst + ".dlv_nm";
	public static final String $dlv_cntct_dpt = $wg_rqst + ".dlv_cntct_dpt";
	public static final String $dlv_cntct_psn = $wg_rqst + ".dlv_cntct_psn";
	public static final String $dlv_zip_cd = $wg_rqst + ".dlv_zip_cd";
	public static final String $dlv_addr1 = $wg_rqst + ".dlv_addr1";
	public static final String $dlv_addr2 = $wg_rqst + ".dlv_addr2";
	public static final String $dlv_addr3 = $wg_rqst + ".dlv_addr3";
	public static final String $dlv_addr4 = $wg_rqst + ".dlv_addr4";
	public static final String $dlv_tel = $wg_rqst + ".dlv_tel";
	public static final String $dlv_fax = $wg_rqst + ".dlv_fax";
	public static final String $tdlv_cd = $wg_rqst + ".tdlv_cd";
	public static final String $tdlv_sundry_flg = $wg_rqst + ".tdlv_sundry_flg";
	public static final String $tdlv_nm = $wg_rqst + ".tdlv_nm";
	public static final String $tdlv_zip_cd = $wg_rqst + ".tdlv_zip_cd";
	public static final String $tdlv_addr1 = $wg_rqst + ".tdlv_addr1";
	public static final String $tdlv_addr2 = $wg_rqst + ".tdlv_addr2";
	public static final String $tdlv_addr3 = $wg_rqst + ".tdlv_addr3";
	public static final String $tdlv_addr4 = $wg_rqst + ".tdlv_addr4";
	public static final String $tdlv_cntct_dpt = $wg_rqst + ".tdlv_cntct_dpt";
	public static final String $tdlv_cntct_psn = $wg_rqst + ".tdlv_cntct_psn";
	public static final String $tdlv_tel = $wg_rqst + ".tdlv_tel";
	public static final String $tdlv_fax = $wg_rqst + ".tdlv_fax";
	public static final String $itm_ord_no = $wg_rqst + ".itm_ord_no";
	public static final String $mfg_loc_cd = $wg_rqst + ".mfg_loc_cd";
	public static final String $bom_ptn = $wg_rqst + ".bom_ptn";
	public static final String $purc_rsn_cd = $wg_rqst + ".purc_rsn_cd";
	public static final String $xpns_po_flg = $wg_rqst + ".xpns_po_flg";
	public static final String $trd_cd = $wg_rqst + ".trd_cd";
	public static final String $trd_ptn_typ = $wg_rqst + ".trd_ptn_typ";
	public static final String $bd_itm_cd = $wg_rqst + ".bd_itm_cd";
	public static final String $bd_itm_sub1 = $wg_rqst + ".bd_itm_sub1";
	public static final String $bd_itm_sub2 = $wg_rqst + ".bd_itm_sub2";
	public static final String $bd_itm_sub3 = $wg_rqst + ".bd_itm_sub3";
	public static final String $bd_sno1 = $wg_rqst + ".bd_sno1";
	public static final String $bd_sno2 = $wg_rqst + ".bd_sno2";
	public static final String $bd_sno3 = $wg_rqst + ".bd_sno3";
	public static final String $bd_sno4 = $wg_rqst + ".bd_sno4";
	public static final String $bd_lot_no = $wg_rqst + ".bd_lot_no";
	public static final String $bd_sublot_no = $wg_rqst + ".bd_sublot_no";
	public static final String $bd_loc_cd = $wg_rqst + ".bd_loc_cd";
	public static final String $bd_dpt_cd = $wg_rqst + ".bd_dpt_cd";
	public static final String $bd_ctg_cd = $wg_rqst + ".bd_ctg_cd";
	public static final String $bd_oper_cd = $wg_rqst + ".bd_oper_cd";
	public static final String $bd_slo_no = $wg_rqst + ".bd_slo_no";
	public static final String $bd_iv_no = $wg_rqst + ".bd_iv_no";
	public static final String $bd_po_no = $wg_rqst + ".bd_po_no";
	public static final String $wg_rqst_cnt_rmrks = $wg_rqst + ".wg_rqst_cnt_rmrks";
	public static final String $wg_re_rqst_cnt_rmrks = $wg_rqst + ".wg_re_rqst_cnt_rmrks";
	public static final String $intr_rmrks = $wg_rqst + ".intr_rmrks";
	public static final String $comp_cng_flg = $wg_rqst + ".comp_cng_flg";
	public static final String $spec_cng_flg = $wg_rqst + ".spec_cng_flg";
	public static final String $sub_char1 = $wg_rqst + ".sub_char1";
	public static final String $sub_char2 = $wg_rqst + ".sub_char2";
	public static final String $sub_char3 = $wg_rqst + ".sub_char3";

	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta wg_rqst_META = createInnerRowMeta($wg_rqst, mcframe.serverMS.dbc.MST_WG_RQST_R.class);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta auto_prms_flg_META = createCommonMeta($auto_prms_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta auto_prms_tgt_flg_META = createCommonMeta($auto_prms_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta abort_flg_META = createCommonMeta($abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta abort_can_flg_META = createCommonMeta($abort_can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cred_no_up_flg_META = createCommonMeta($cred_no_up_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta screen_crct_flg_META = createCommonMeta($screen_crct_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta po_schd_dt_META = createCommonMeta($po_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mfg_st_schd_dt_META = createCommonMeta($mfg_st_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mfg_end_schd_dt_META = createCommonMeta($mfg_end_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta gi_schd_dt_META = createCommonMeta($gi_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta strg_schd_dt_META = createCommonMeta($strg_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta accpt_schd_dt_META = createCommonMeta($accpt_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta insp_st_schd_dt_META = createCommonMeta($insp_st_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta insp_end_schd_dt_META = createCommonMeta($insp_end_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta avl_schd_dt_META = createCommonMeta($avl_schd_dt, mcframe.commonMA.meta.MA_META.DT);

	protected static final ConstMetaList<WgRqst_Upd01_DtlR> constMetas = new ConstMetaList<WgRqst_Upd01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			data_crud_typ_META,
			peg_no_META,
			wg_rqst_META,
			cst_cd_META,
			auto_prms_flg_META,
			auto_prms_tgt_flg_META,
			abort_flg_META,
			abort_can_flg_META,
			cred_no_up_flg_META,
			screen_crct_flg_META,
			po_schd_dt_META,
			mfg_st_schd_dt_META,
			mfg_end_schd_dt_META,
			gi_schd_dt_META,
			strg_schd_dt_META,
			accpt_schd_dt_META,
			insp_st_schd_dt_META,
			insp_end_schd_dt_META,
			avl_schd_dt_META
		},
		new String[][]{
			{
				"wg_rqst_no",
				"last_wg_rqst_no",
				"wg_rqst_typ",
				"wg_rqst_src_typ",
				"wg_rqst_src_no",
				"wg_rqst_sts_typ",
				"rqst_dt",
				"prms_ntc_flg",
				"prms_dt",
				"prms_uncn_flg",
				"re_rqst_flg",
				"re_rqst_dt",
				"rqst_crrct_flg",
				"dlv_inst_rcpt_flg",
				"can_flg",
				"rqst_fr_wg_cd",
				"rqst_fr_dpt_cd",
				"rqst_fr_usr_cd",
				"gr_loc_wg_cd",
				"gr_lg_grp_cd",
				"gr_loc_cd",
				"gr_str_ln_cd",
				"gr_rqst_tm",
				"rqst_to_wg_cd",
				"gi_loc_wg_cd",
				"gi_lg_grp_cd",
				"gi_loc_cd",
				"gi_str_ln_cd",
				"gi_rqst_tm",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"iv_itm_nm",
				"sundry_itm_flg",
				"lot_no",
				"sublot_no",
				"sno1",
				"sno1_null_flg",
				"sno2",
				"sno2_null_flg",
				"sno3",
				"sno3_null_flg",
				"sno4",
				"sno4_null_flg",
				"ver_no",
				"gd_cd",
				"vld_dt_fr",
				"vld_dt_to",
				"trd_unit_qty",
				"trd_unit_cd",
				"base_unit_qty",
				"base_unit_cd",
				"not_cmpl_qty",
				"sppl_cd",
				"maker_cd",
				"io_schd_pr_no",
				"slo_no",
				"slo_d_no",
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
				"tdlv_nm",
				"tdlv_zip_cd",
				"tdlv_addr1",
				"tdlv_addr2",
				"tdlv_addr3",
				"tdlv_addr4",
				"tdlv_cntct_dpt",
				"tdlv_cntct_psn",
				"tdlv_tel",
				"tdlv_fax",
				"itm_ord_no",
				"mfg_loc_cd",
				"bom_ptn",
				"purc_rsn_cd",
				"xpns_po_flg",
				"trd_cd",
				"trd_ptn_typ",
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
				"wg_rqst_cnt_rmrks",
				"wg_re_rqst_cnt_rmrks",
				"intr_rmrks",
				"comp_cng_flg",
				"spec_cng_flg",
				"sub_char1",
				"sub_char2",
				"sub_char3"
			},
			{
				$wg_rqst_no,
				$last_wg_rqst_no,
				$wg_rqst_typ,
				$wg_rqst_src_typ,
				$wg_rqst_src_no,
				$wg_rqst_sts_typ,
				$rqst_dt,
				$prms_ntc_flg,
				$prms_dt,
				$prms_uncn_flg,
				$re_rqst_flg,
				$re_rqst_dt,
				$rqst_crrct_flg,
				$dlv_inst_rcpt_flg,
				$can_flg,
				$rqst_fr_wg_cd,
				$rqst_fr_dpt_cd,
				$rqst_fr_usr_cd,
				$gr_loc_wg_cd,
				$gr_lg_grp_cd,
				$gr_loc_cd,
				$gr_str_ln_cd,
				$gr_rqst_tm,
				$rqst_to_wg_cd,
				$gi_loc_wg_cd,
				$gi_lg_grp_cd,
				$gi_loc_cd,
				$gi_str_ln_cd,
				$gi_rqst_tm,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$iv_itm_nm,
				$sundry_itm_flg,
				$lot_no,
				$sublot_no,
				$sno1,
				$sno1_null_flg,
				$sno2,
				$sno2_null_flg,
				$sno3,
				$sno3_null_flg,
				$sno4,
				$sno4_null_flg,
				$ver_no,
				$gd_cd,
				$vld_dt_fr,
				$vld_dt_to,
				$trd_unit_qty,
				$trd_unit_cd,
				$base_unit_qty,
				$base_unit_cd,
				$not_cmpl_qty,
				$sppl_cd,
				$maker_cd,
				$io_schd_pr_no,
				$slo_no,
				$slo_d_no,
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
				$tdlv_nm,
				$tdlv_zip_cd,
				$tdlv_addr1,
				$tdlv_addr2,
				$tdlv_addr3,
				$tdlv_addr4,
				$tdlv_cntct_dpt,
				$tdlv_cntct_psn,
				$tdlv_tel,
				$tdlv_fax,
				$itm_ord_no,
				$mfg_loc_cd,
				$bom_ptn,
				$purc_rsn_cd,
				$xpns_po_flg,
				$trd_cd,
				$trd_ptn_typ,
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
				$wg_rqst_cnt_rmrks,
				$wg_re_rqst_cnt_rmrks,
				$intr_rmrks,
				$comp_cng_flg,
				$spec_cng_flg,
				$sub_char1,
				$sub_char2,
				$sub_char3
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
	protected WgRqst_Upd01_DtlR_MC_A(ConstMetaList<? extends WgRqst_Upd01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public WgRqst_Upd01_DtlR clone() {
		return (WgRqst_Upd01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public WgRqst_Upd01_DtlR createInstance() {
		return (WgRqst_Upd01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public WgRqst_Upd01_DtlR getValues(String... names) {
		return (WgRqst_Upd01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 0, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 0, $data_crud_typ, value);
	}


	/**
	 * Pegging number 紐付け番号.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 1, $peg_no);
	}

	/**
	 * Pegging number 紐付け番号.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging number 紐付け番号.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging number 紐付け番号.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging number 紐付け番号.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging number 紐付け番号.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 1, $peg_no, value);
	}


	public mcframe.serverMS.dbc.MST_WG_RQST_R wg_rqst(){
		return (mcframe.serverMS.dbc.MST_WG_RQST_R) getConstInnerRow(offset + 2, $wg_rqst);
	}
	
	public void wg_rqst(mcframe.serverMS.dbc.MST_WG_RQST_R row){
		setConstInnerRow(offset + 2, $wg_rqst, row);
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 3, $cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 3, $cst_cd, value);
	}


	/**
	 * Auto-reply 自動回答.<p>
	 *
	 */
	public boolean auto_prms_flg() {
		return getConstBoolean(offset + 4, $auto_prms_flg);
	}

	/**
	 * Auto-reply 自動回答.<p>
	 *
	 */
	public void auto_prms_flg(boolean value) {
		setConstBoolean(offset + 4, $auto_prms_flg, value);
	}


	/**
	 * For auto-reply 自動回答対象.<p>
	 *
	 */
	public boolean auto_prms_tgt_flg() {
		return getConstBoolean(offset + 5, $auto_prms_tgt_flg);
	}

	/**
	 * For auto-reply 自動回答対象.<p>
	 *
	 */
	public void auto_prms_tgt_flg(boolean value) {
		setConstBoolean(offset + 5, $auto_prms_tgt_flg, value);
	}


	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public boolean abort_flg() {
		return getConstBoolean(offset + 6, $abort_flg);
	}

	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		setConstBoolean(offset + 6, $abort_flg, value);
	}


	/**
	 * Cancellation for cancelled remaining 打切取消.<p>
	 *
	 */
	public boolean abort_can_flg() {
		return getConstBoolean(offset + 7, $abort_can_flg);
	}

	/**
	 * Cancellation for cancelled remaining 打切取消.<p>
	 *
	 */
	public void abort_can_flg(boolean value) {
		setConstBoolean(offset + 7, $abort_can_flg, value);
	}


	/**
	 * No credit update 与信更新無し.<p>
	 *
	 */
	public boolean cred_no_up_flg() {
		return getConstBoolean(offset + 8, $cred_no_up_flg);
	}

	/**
	 * No credit update 与信更新無し.<p>
	 *
	 */
	public void cred_no_up_flg(boolean value) {
		setConstBoolean(offset + 8, $cred_no_up_flg, value);
	}


	/**
	 * Screen correction 画面訂正.<p>
	 *
	 */
	public boolean screen_crct_flg() {
		return getConstBoolean(offset + 9, $screen_crct_flg);
	}

	/**
	 * Screen correction 画面訂正.<p>
	 *
	 */
	public void screen_crct_flg(boolean value) {
		setConstBoolean(offset + 9, $screen_crct_flg, value);
	}


	/**
	 * Scheduled PO date 発注予定日.<p>
	 *
	 */
	public MCDate po_schd_dt() {
		return getConstDate(offset + 10, $po_schd_dt);
	}

	/**
	 * Scheduled PO date 発注予定日.<p>
	 *
	 */
	public void po_schd_dt(MCDate value) {
		setConstDate(offset + 10, $po_schd_dt, value);
	}


	/**
	 * Scheduled mfg. start date 製造着手予定日.<p>
	 *
	 */
	public MCDate mfg_st_schd_dt() {
		return getConstDate(offset + 11, $mfg_st_schd_dt);
	}

	/**
	 * Scheduled mfg. start date 製造着手予定日.<p>
	 *
	 */
	public void mfg_st_schd_dt(MCDate value) {
		setConstDate(offset + 11, $mfg_st_schd_dt, value);
	}


	/**
	 * Scheduled mfg. end date 製造終了予定日.<p>
	 *
	 */
	public MCDate mfg_end_schd_dt() {
		return getConstDate(offset + 12, $mfg_end_schd_dt);
	}

	/**
	 * Scheduled mfg. end date 製造終了予定日.<p>
	 *
	 */
	public void mfg_end_schd_dt(MCDate value) {
		setConstDate(offset + 12, $mfg_end_schd_dt, value);
	}


	/**
	 * Scheduled GI date 出庫予定日.<p>
	 *
	 */
	public MCDate gi_schd_dt() {
		return getConstDate(offset + 13, $gi_schd_dt);
	}

	/**
	 * Scheduled GI date 出庫予定日.<p>
	 *
	 */
	public void gi_schd_dt(MCDate value) {
		setConstDate(offset + 13, $gi_schd_dt, value);
	}


	/**
	 * Scheduled storage completion date 格納完了予定日.<p>
	 *
	 */
	public MCDate strg_schd_dt() {
		return getConstDate(offset + 14, $strg_schd_dt);
	}

	/**
	 * Scheduled storage completion date 格納完了予定日.<p>
	 *
	 */
	public void strg_schd_dt(MCDate value) {
		setConstDate(offset + 14, $strg_schd_dt, value);
	}


	/**
	 * Scheduled acceptance date 検収予定日.<p>
	 *
	 */
	public MCDate accpt_schd_dt() {
		return getConstDate(offset + 15, $accpt_schd_dt);
	}

	/**
	 * Scheduled acceptance date 検収予定日.<p>
	 *
	 */
	public void accpt_schd_dt(MCDate value) {
		setConstDate(offset + 15, $accpt_schd_dt, value);
	}


	/**
	 * Scheduled inspection start date 検査着手予定日.<p>
	 *
	 */
	public MCDate insp_st_schd_dt() {
		return getConstDate(offset + 16, $insp_st_schd_dt);
	}

	/**
	 * Scheduled inspection start date 検査着手予定日.<p>
	 *
	 */
	public void insp_st_schd_dt(MCDate value) {
		setConstDate(offset + 16, $insp_st_schd_dt, value);
	}


	/**
	 * Scheduled inspection end date 検査終了予定日.<p>
	 *
	 */
	public MCDate insp_end_schd_dt() {
		return getConstDate(offset + 17, $insp_end_schd_dt);
	}

	/**
	 * Scheduled inspection end date 検査終了予定日.<p>
	 *
	 */
	public void insp_end_schd_dt(MCDate value) {
		setConstDate(offset + 17, $insp_end_schd_dt, value);
	}


	/**
	 * Available date 使用可能予定日.<p>
	 *
	 */
	public MCDate avl_schd_dt() {
		return getConstDate(offset + 18, $avl_schd_dt);
	}

	/**
	 * Available date 使用可能予定日.<p>
	 *
	 */
	public void avl_schd_dt(MCDate value) {
		setConstDate(offset + 18, $avl_schd_dt, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($po_schd_dt.equalsIgnoreCase(name)) {
			return po_schd_dt();
		}
		if ($mfg_st_schd_dt.equalsIgnoreCase(name)) {
			return mfg_st_schd_dt();
		}
		if ($mfg_end_schd_dt.equalsIgnoreCase(name)) {
			return mfg_end_schd_dt();
		}
		if ($gi_schd_dt.equalsIgnoreCase(name)) {
			return gi_schd_dt();
		}
		if ($strg_schd_dt.equalsIgnoreCase(name)) {
			return strg_schd_dt();
		}
		if ($accpt_schd_dt.equalsIgnoreCase(name)) {
			return accpt_schd_dt();
		}
		if ($insp_st_schd_dt.equalsIgnoreCase(name)) {
			return insp_st_schd_dt();
		}
		if ($insp_end_schd_dt.equalsIgnoreCase(name)) {
			return insp_end_schd_dt();
		}
		if ($avl_schd_dt.equalsIgnoreCase(name)) {
			return avl_schd_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($auto_prms_flg.equalsIgnoreCase(name)) {
			return auto_prms_flg();
		}
		if ($auto_prms_tgt_flg.equalsIgnoreCase(name)) {
			return auto_prms_tgt_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($abort_can_flg.equalsIgnoreCase(name)) {
			return abort_can_flg();
		}
		if ($cred_no_up_flg.equalsIgnoreCase(name)) {
			return cred_no_up_flg();
		}
		if ($screen_crct_flg.equalsIgnoreCase(name)) {
			return screen_crct_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($po_schd_dt.equalsIgnoreCase(name)) {
			return po_schd_dt();
		}
		if ($mfg_st_schd_dt.equalsIgnoreCase(name)) {
			return mfg_st_schd_dt();
		}
		if ($mfg_end_schd_dt.equalsIgnoreCase(name)) {
			return mfg_end_schd_dt();
		}
		if ($gi_schd_dt.equalsIgnoreCase(name)) {
			return gi_schd_dt();
		}
		if ($strg_schd_dt.equalsIgnoreCase(name)) {
			return strg_schd_dt();
		}
		if ($accpt_schd_dt.equalsIgnoreCase(name)) {
			return accpt_schd_dt();
		}
		if ($insp_st_schd_dt.equalsIgnoreCase(name)) {
			return insp_st_schd_dt();
		}
		if ($insp_end_schd_dt.equalsIgnoreCase(name)) {
			return insp_end_schd_dt();
		}
		if ($avl_schd_dt.equalsIgnoreCase(name)) {
			return avl_schd_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($auto_prms_flg.equalsIgnoreCase(name)) {
			return auto_prms_flg();
		}
		if ($auto_prms_tgt_flg.equalsIgnoreCase(name)) {
			return auto_prms_tgt_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($abort_can_flg.equalsIgnoreCase(name)) {
			return abort_can_flg();
		}
		if ($cred_no_up_flg.equalsIgnoreCase(name)) {
			return cred_no_up_flg();
		}
		if ($screen_crct_flg.equalsIgnoreCase(name)) {
			return screen_crct_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($po_schd_dt.equalsIgnoreCase(name)) {
			po_schd_dt(value);
			return;
		}
		if ($mfg_st_schd_dt.equalsIgnoreCase(name)) {
			mfg_st_schd_dt(value);
			return;
		}
		if ($mfg_end_schd_dt.equalsIgnoreCase(name)) {
			mfg_end_schd_dt(value);
			return;
		}
		if ($gi_schd_dt.equalsIgnoreCase(name)) {
			gi_schd_dt(value);
			return;
		}
		if ($strg_schd_dt.equalsIgnoreCase(name)) {
			strg_schd_dt(value);
			return;
		}
		if ($accpt_schd_dt.equalsIgnoreCase(name)) {
			accpt_schd_dt(value);
			return;
		}
		if ($insp_st_schd_dt.equalsIgnoreCase(name)) {
			insp_st_schd_dt(value);
			return;
		}
		if ($insp_end_schd_dt.equalsIgnoreCase(name)) {
			insp_end_schd_dt(value);
			return;
		}
		if ($avl_schd_dt.equalsIgnoreCase(name)) {
			avl_schd_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($auto_prms_flg.equalsIgnoreCase(name)) {
			auto_prms_flg(value);
			return;
		}
		if ($auto_prms_tgt_flg.equalsIgnoreCase(name)) {
			auto_prms_tgt_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($abort_can_flg.equalsIgnoreCase(name)) {
			abort_can_flg(value);
			return;
		}
		if ($cred_no_up_flg.equalsIgnoreCase(name)) {
			cred_no_up_flg(value);
			return;
		}
		if ($screen_crct_flg.equalsIgnoreCase(name)) {
			screen_crct_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($po_schd_dt.equalsIgnoreCase(name)) {
			po_schd_dt(value);
			return;
		}
		if ($mfg_st_schd_dt.equalsIgnoreCase(name)) {
			mfg_st_schd_dt(value);
			return;
		}
		if ($mfg_end_schd_dt.equalsIgnoreCase(name)) {
			mfg_end_schd_dt(value);
			return;
		}
		if ($gi_schd_dt.equalsIgnoreCase(name)) {
			gi_schd_dt(value);
			return;
		}
		if ($strg_schd_dt.equalsIgnoreCase(name)) {
			strg_schd_dt(value);
			return;
		}
		if ($accpt_schd_dt.equalsIgnoreCase(name)) {
			accpt_schd_dt(value);
			return;
		}
		if ($insp_st_schd_dt.equalsIgnoreCase(name)) {
			insp_st_schd_dt(value);
			return;
		}
		if ($insp_end_schd_dt.equalsIgnoreCase(name)) {
			insp_end_schd_dt(value);
			return;
		}
		if ($avl_schd_dt.equalsIgnoreCase(name)) {
			avl_schd_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($auto_prms_flg.equalsIgnoreCase(name)) {
			auto_prms_flg(value);
			return;
		}
		if ($auto_prms_tgt_flg.equalsIgnoreCase(name)) {
			auto_prms_tgt_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($abort_can_flg.equalsIgnoreCase(name)) {
			abort_can_flg(value);
			return;
		}
		if ($cred_no_up_flg.equalsIgnoreCase(name)) {
			cred_no_up_flg(value);
			return;
		}
		if ($screen_crct_flg.equalsIgnoreCase(name)) {
			screen_crct_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($wg_rqst.equalsIgnoreCase(name)) {
			return wg_rqst();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($wg_rqst.equalsIgnoreCase(name)) {
			wg_rqst(
				((MCContainerMeta) wg_rqst_META).castInnerRow(mcframe.serverMS.dbc.MST_WG_RQST_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * No. of inventory request from other WG ＷＧ間依頼ＮＯ.<p>
	 *
	 */
	public String wg_rqst_no() {
		return wg_rqst().wg_rqst_no();
	}

	/**
	 * No. of inventory request from other WG ＷＧ間依頼ＮＯ.<p>
	 *
	 */
	public void wg_rqst_no(String value) {
		wg_rqst().wg_rqst_no(value);
	}

	/**
	 * Last inventory request No. from other WG 前回ＷＧ間依頼ＮＯ.<p>
	 *
	 */
	public String last_wg_rqst_no() {
		return wg_rqst().last_wg_rqst_no();
	}

	/**
	 * Last inventory request No. from other WG 前回ＷＧ間依頼ＮＯ.<p>
	 *
	 */
	public void last_wg_rqst_no(String value) {
		wg_rqst().last_wg_rqst_no(value);
	}

	/**
	 * Inventory request from other WG classification type ＷＧ間依頼種類区分.<p>
	 *
	 */
	public String wg_rqst_typ() {
		return wg_rqst().wg_rqst_typ();
	}

	/**
	 * Inventory request from other WG classification type ＷＧ間依頼種類区分.<p>
	 *
	 */
	public void wg_rqst_typ(String value) {
		wg_rqst().wg_rqst_typ(value);
	}

	/**
	 * Source of inventory request from other WG?creation type ＷＧ間依頼元作成区分.<p>
	 *
	 */
	public String wg_rqst_src_typ() {
		return wg_rqst().wg_rqst_src_typ();
	}

	/**
	 * Source of inventory request from other WG?creation type ＷＧ間依頼元作成区分.<p>
	 *
	 */
	public void wg_rqst_src_typ(String value) {
		wg_rqst().wg_rqst_src_typ(value);
	}

	/**
	 * Source of inventory request from other WG identification No. ＷＧ間依頼元識別ＮＯ.<p>
	 *
	 */
	public String wg_rqst_src_no() {
		return wg_rqst().wg_rqst_src_no();
	}

	/**
	 * Source of inventory request from other WG identification No. ＷＧ間依頼元識別ＮＯ.<p>
	 *
	 */
	public void wg_rqst_src_no(String value) {
		wg_rqst().wg_rqst_src_no(value);
	}

	/**
	 * Inventory request from other WG status type ＷＧ間依頼状況区分.<p>
	 *
	 */
	public String wg_rqst_sts_typ() {
		return wg_rqst().wg_rqst_sts_typ();
	}

	/**
	 * Inventory request from other WG status type ＷＧ間依頼状況区分.<p>
	 *
	 */
	public void wg_rqst_sts_typ(String value) {
		wg_rqst().wg_rqst_sts_typ(value);
	}

	/**
	 * Request date 依頼日.<p>
	 *
	 */
	public MCDate rqst_dt() {
		return wg_rqst().rqst_dt();
	}

	/**
	 * Request date 依頼日.<p>
	 *
	 */
	public void rqst_dt(MCDate value) {
		wg_rqst().rqst_dt(value);
	}

	/**
	 * Replied notification 回答通知.<p>
	 *
	 */
	public boolean prms_ntc_flg() {
		return wg_rqst().prms_ntc_flg();
	}

	/**
	 * Replied notification 回答通知.<p>
	 *
	 */
	public void prms_ntc_flg(boolean value) {
		wg_rqst().prms_ntc_flg(value);
	}

	/**
	 * Replied date 回答通知日.<p>
	 *
	 */
	public MCDate prms_dt() {
		return wg_rqst().prms_dt();
	}

	/**
	 * Replied date 回答通知日.<p>
	 *
	 */
	public void prms_dt(MCDate value) {
		wg_rqst().prms_dt(value);
	}

	/**
	 * Reply unchecked 回答未確認.<p>
	 *
	 */
	public boolean prms_uncn_flg() {
		return wg_rqst().prms_uncn_flg();
	}

	/**
	 * Reply unchecked 回答未確認.<p>
	 *
	 */
	public void prms_uncn_flg(boolean value) {
		wg_rqst().prms_uncn_flg(value);
	}

	/**
	 * Readjustment request 再調整依頼.<p>
	 *
	 */
	public boolean re_rqst_flg() {
		return wg_rqst().re_rqst_flg();
	}

	/**
	 * Readjustment request 再調整依頼.<p>
	 *
	 */
	public void re_rqst_flg(boolean value) {
		wg_rqst().re_rqst_flg(value);
	}

	/**
	 * Readjustment request date 再調整依頼日.<p>
	 *
	 */
	public MCDate re_rqst_dt() {
		return wg_rqst().re_rqst_dt();
	}

	/**
	 * Readjustment request date 再調整依頼日.<p>
	 *
	 */
	public void re_rqst_dt(MCDate value) {
		wg_rqst().re_rqst_dt(value);
	}

	/**
	 * Edited by request source 依頼元訂正.<p>
	 *
	 */
	public boolean rqst_crrct_flg() {
		return wg_rqst().rqst_crrct_flg();
	}

	/**
	 * Edited by request source 依頼元訂正.<p>
	 *
	 */
	public void rqst_crrct_flg(boolean value) {
		wg_rqst().rqst_crrct_flg(value);
	}

	/**
	 * Delivery order received 納入指示受領.<p>
	 *
	 */
	public boolean dlv_inst_rcpt_flg() {
		return wg_rqst().dlv_inst_rcpt_flg();
	}

	/**
	 * Delivery order received 納入指示受領.<p>
	 *
	 */
	public void dlv_inst_rcpt_flg(boolean value) {
		wg_rqst().dlv_inst_rcpt_flg(value);
	}

	/**
	 * Cancel 取消.<p>
	 *
	 */
	public boolean can_flg() {
		return wg_rqst().can_flg();
	}

	/**
	 * Cancel 取消.<p>
	 *
	 */
	public void can_flg(boolean value) {
		wg_rqst().can_flg(value);
	}

	/**
	 * Requesting WG cd. 依頼元ワーキンググループＣＤ.<p>
	 *
	 */
	public String rqst_fr_wg_cd() {
		return wg_rqst().rqst_fr_wg_cd();
	}

	/**
	 * Requesting WG cd. 依頼元ワーキンググループＣＤ.<p>
	 *
	 */
	public void rqst_fr_wg_cd(String value) {
		wg_rqst().rqst_fr_wg_cd(value);
	}

	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public String rqst_fr_dpt_cd() {
		return wg_rqst().rqst_fr_dpt_cd();
	}

	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public void rqst_fr_dpt_cd(String value) {
		wg_rqst().rqst_fr_dpt_cd(value);
	}

	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public String rqst_fr_usr_cd() {
		return wg_rqst().rqst_fr_usr_cd();
	}

	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public void rqst_fr_usr_cd(String value) {
		wg_rqst().rqst_fr_usr_cd(value);
	}

	/**
	 * GR WG cd. 入庫ワーキンググループＣＤ.<p>
	 *
	 */
	public String gr_loc_wg_cd() {
		return wg_rqst().gr_loc_wg_cd();
	}

	/**
	 * GR WG cd. 入庫ワーキンググループＣＤ.<p>
	 *
	 */
	public void gr_loc_wg_cd(String value) {
		wg_rqst().gr_loc_wg_cd(value);
	}

	/**
	 * GR distribution group cd. 入庫物流グループＣＤ.<p>
	 *
	 */
	public String gr_lg_grp_cd() {
		return wg_rqst().gr_lg_grp_cd();
	}

	/**
	 * GR distribution group cd. 入庫物流グループＣＤ.<p>
	 *
	 */
	public void gr_lg_grp_cd(String value) {
		wg_rqst().gr_lg_grp_cd(value);
	}

	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public String gr_loc_cd() {
		return wg_rqst().gr_loc_cd();
	}

	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public void gr_loc_cd(String value) {
		wg_rqst().gr_loc_cd(value);
	}

	/**
	 * GR rack/line cd. 入庫棚・ラインＣＤ.<p>
	 *
	 */
	public String gr_str_ln_cd() {
		return wg_rqst().gr_str_ln_cd();
	}

	/**
	 * GR rack/line cd. 入庫棚・ラインＣＤ.<p>
	 *
	 */
	public void gr_str_ln_cd(String value) {
		wg_rqst().gr_str_ln_cd(value);
	}

	/**
	 * GR request date and time 入庫依頼日時.<p>
	 *
	 */
	public MCDate gr_rqst_tm() {
		return wg_rqst().gr_rqst_tm();
	}

	/**
	 * GR request date and time 入庫依頼日時.<p>
	 *
	 */
	public void gr_rqst_tm(MCDate value) {
		wg_rqst().gr_rqst_tm(value);
	}

	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public String rqst_to_wg_cd() {
		return wg_rqst().rqst_to_wg_cd();
	}

	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public void rqst_to_wg_cd(String value) {
		wg_rqst().rqst_to_wg_cd(value);
	}

	/**
	 * GI WG cd. 出庫ワーキンググループＣＤ.<p>
	 *
	 */
	public String gi_loc_wg_cd() {
		return wg_rqst().gi_loc_wg_cd();
	}

	/**
	 * GI WG cd. 出庫ワーキンググループＣＤ.<p>
	 *
	 */
	public void gi_loc_wg_cd(String value) {
		wg_rqst().gi_loc_wg_cd(value);
	}

	/**
	 * GI distribution group cd. 出庫物流グループＣＤ.<p>
	 *
	 */
	public String gi_lg_grp_cd() {
		return wg_rqst().gi_lg_grp_cd();
	}

	/**
	 * GI distribution group cd. 出庫物流グループＣＤ.<p>
	 *
	 */
	public void gi_lg_grp_cd(String value) {
		wg_rqst().gi_lg_grp_cd(value);
	}

	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public String gi_loc_cd() {
		return wg_rqst().gi_loc_cd();
	}

	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public void gi_loc_cd(String value) {
		wg_rqst().gi_loc_cd(value);
	}

	/**
	 * GI rack/line cd. 出庫棚・ラインＣＤ.<p>
	 *
	 */
	public String gi_str_ln_cd() {
		return wg_rqst().gi_str_ln_cd();
	}

	/**
	 * GI rack/line cd. 出庫棚・ラインＣＤ.<p>
	 *
	 */
	public void gi_str_ln_cd(String value) {
		wg_rqst().gi_str_ln_cd(value);
	}

	/**
	 * GI request date and time 出庫依頼日時.<p>
	 *
	 */
	public MCDate gi_rqst_tm() {
		return wg_rqst().gi_rqst_tm();
	}

	/**
	 * GI request date and time 出庫依頼日時.<p>
	 *
	 */
	public void gi_rqst_tm(MCDate value) {
		wg_rqst().gi_rqst_tm(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return wg_rqst().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		wg_rqst().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return wg_rqst().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		wg_rqst().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return wg_rqst().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		wg_rqst().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return wg_rqst().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		wg_rqst().itm_sub3(value);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return wg_rqst().itm_nm();
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		wg_rqst().itm_nm(value);
	}

	/**
	 * Item name for invoice インボイス表記品名.<p>
	 *
	 */
	public String iv_itm_nm() {
		return wg_rqst().iv_itm_nm();
	}

	/**
	 * Item name for invoice インボイス表記品名.<p>
	 *
	 */
	public void iv_itm_nm(String value) {
		wg_rqst().iv_itm_nm(value);
	}

	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return wg_rqst().sundry_itm_flg();
	}

	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		wg_rqst().sundry_itm_flg(value);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return wg_rqst().lot_no();
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		wg_rqst().lot_no(value);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return wg_rqst().sublot_no();
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		wg_rqst().sublot_no(value);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return wg_rqst().sno1();
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		wg_rqst().sno1(value);
	}

	/**
	 * Allow without SEIBAN No. 1 手配ＮＯ１無し可.<p>
	 *
	 */
	public boolean sno1_null_flg() {
		return wg_rqst().sno1_null_flg();
	}

	/**
	 * Allow without SEIBAN No. 1 手配ＮＯ１無し可.<p>
	 *
	 */
	public void sno1_null_flg(boolean value) {
		wg_rqst().sno1_null_flg(value);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return wg_rqst().sno2();
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		wg_rqst().sno2(value);
	}

	/**
	 * Allow without SEIBAN No. 2 手配ＮＯ２無し可.<p>
	 *
	 */
	public boolean sno2_null_flg() {
		return wg_rqst().sno2_null_flg();
	}

	/**
	 * Allow without SEIBAN No. 2 手配ＮＯ２無し可.<p>
	 *
	 */
	public void sno2_null_flg(boolean value) {
		wg_rqst().sno2_null_flg(value);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return wg_rqst().sno3();
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		wg_rqst().sno3(value);
	}

	/**
	 * Allow without SEIBAN No. 3 手配ＮＯ３無し可.<p>
	 *
	 */
	public boolean sno3_null_flg() {
		return wg_rqst().sno3_null_flg();
	}

	/**
	 * Allow without SEIBAN No. 3 手配ＮＯ３無し可.<p>
	 *
	 */
	public void sno3_null_flg(boolean value) {
		wg_rqst().sno3_null_flg(value);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return wg_rqst().sno4();
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		wg_rqst().sno4(value);
	}

	/**
	 * Allow without SEIBAN No. 4 手配ＮＯ４無し可.<p>
	 *
	 */
	public boolean sno4_null_flg() {
		return wg_rqst().sno4_null_flg();
	}

	/**
	 * Allow without SEIBAN No. 4 手配ＮＯ４無し可.<p>
	 *
	 */
	public void sno4_null_flg(boolean value) {
		wg_rqst().sno4_null_flg(value);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return wg_rqst().ver_no();
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		wg_rqst().ver_no(value);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return wg_rqst().gd_cd();
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		wg_rqst().gd_cd(value);
	}

	/**
	 * Expiration date FROM 有効期限ＦＲＯＭ.<p>
	 *
	 */
	public MCDate vld_dt_fr() {
		return wg_rqst().vld_dt_fr();
	}

	/**
	 * Expiration date FROM 有効期限ＦＲＯＭ.<p>
	 *
	 */
	public void vld_dt_fr(MCDate value) {
		wg_rqst().vld_dt_fr(value);
	}

	/**
	 * Expiration date TO 有効期限ＴＯ.<p>
	 *
	 */
	public MCDate vld_dt_to() {
		return wg_rqst().vld_dt_to();
	}

	/**
	 * Expiration date TO 有効期限ＴＯ.<p>
	 *
	 */
	public void vld_dt_to(MCDate value) {
		wg_rqst().vld_dt_to(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return wg_rqst().trd_unit_qty();
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		wg_rqst().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		wg_rqst().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		wg_rqst().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		wg_rqst().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		wg_rqst().trd_unit_qty(value);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return wg_rqst().trd_unit_cd();
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		wg_rqst().trd_unit_cd(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return wg_rqst().base_unit_qty();
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		wg_rqst().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		wg_rqst().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		wg_rqst().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		wg_rqst().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		wg_rqst().base_unit_qty(value);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return wg_rqst().base_unit_cd();
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		wg_rqst().base_unit_cd(value);
	}

	/**
	 * Base unit remaining request qty. 基準単位依頼残数量.<p>
	 *
	 */
	public MCNumber not_cmpl_qty() {
		return wg_rqst().not_cmpl_qty();
	}

	/**
	 * Base unit remaining request qty. 基準単位依頼残数量.<p>
	 *
	 */
	public void not_cmpl_qty(MCNumber value) {
		wg_rqst().not_cmpl_qty(value);
	}

	/**
	 * Base unit remaining request qty. 基準単位依頼残数量.<p>
	 *
	 */
	public void not_cmpl_qty(int value) {
		wg_rqst().not_cmpl_qty(value);
	}

	/**
	 * Base unit remaining request qty. 基準単位依頼残数量.<p>
	 *
	 */
	public void not_cmpl_qty(long value) {
		wg_rqst().not_cmpl_qty(value);
	}

	/**
	 * Base unit remaining request qty. 基準単位依頼残数量.<p>
	 *
	 */
	public void not_cmpl_qty(float value) {
		wg_rqst().not_cmpl_qty(value);
	}

	/**
	 * Base unit remaining request qty. 基準単位依頼残数量.<p>
	 *
	 */
	public void not_cmpl_qty(double value) {
		wg_rqst().not_cmpl_qty(value);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return wg_rqst().sppl_cd();
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		wg_rqst().sppl_cd(value);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return wg_rqst().maker_cd();
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		wg_rqst().maker_cd(value);
	}

	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public String io_schd_pr_no() {
		return wg_rqst().io_schd_pr_no();
	}

	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public void io_schd_pr_no(String value) {
		wg_rqst().io_schd_pr_no(value);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return wg_rqst().slo_no();
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		wg_rqst().slo_no(value);
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public String slo_d_no() {
		return wg_rqst().slo_d_no();
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public void slo_d_no(String value) {
		wg_rqst().slo_d_no(value);
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public String dlv_cd() {
		return wg_rqst().dlv_cd();
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public void dlv_cd(String value) {
		wg_rqst().dlv_cd(value);
	}

	/**
	 * Miscellaneous delivery destination 納品先諸口.<p>
	 *
	 */
	public boolean dlv_sundry_flg() {
		return wg_rqst().dlv_sundry_flg();
	}

	/**
	 * Miscellaneous delivery destination 納品先諸口.<p>
	 *
	 */
	public void dlv_sundry_flg(boolean value) {
		wg_rqst().dlv_sundry_flg(value);
	}

	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public String dlv_nm() {
		return wg_rqst().dlv_nm();
	}

	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public void dlv_nm(String value) {
		wg_rqst().dlv_nm(value);
	}

	/**
	 * Delivery destination dept. 納品先部署.<p>
	 *
	 */
	public String dlv_cntct_dpt() {
		return wg_rqst().dlv_cntct_dpt();
	}

	/**
	 * Delivery destination dept. 納品先部署.<p>
	 *
	 */
	public void dlv_cntct_dpt(String value) {
		wg_rqst().dlv_cntct_dpt(value);
	}

	/**
	 * Delivery destination PIC 納品先担当者.<p>
	 *
	 */
	public String dlv_cntct_psn() {
		return wg_rqst().dlv_cntct_psn();
	}

	/**
	 * Delivery destination PIC 納品先担当者.<p>
	 *
	 */
	public void dlv_cntct_psn(String value) {
		wg_rqst().dlv_cntct_psn(value);
	}

	/**
	 * Zip code (Delivery destination) 納品先郵便番号.<p>
	 *
	 */
	public String dlv_zip_cd() {
		return wg_rqst().dlv_zip_cd();
	}

	/**
	 * Zip code (Delivery destination) 納品先郵便番号.<p>
	 *
	 */
	public void dlv_zip_cd(String value) {
		wg_rqst().dlv_zip_cd(value);
	}

	/**
	 * Address 1 (Delivery destination) 納品先住所１.<p>
	 *
	 */
	public String dlv_addr1() {
		return wg_rqst().dlv_addr1();
	}

	/**
	 * Address 1 (Delivery destination) 納品先住所１.<p>
	 *
	 */
	public void dlv_addr1(String value) {
		wg_rqst().dlv_addr1(value);
	}

	/**
	 * Address 2 (Delivery destination) 納品先住所２.<p>
	 *
	 */
	public String dlv_addr2() {
		return wg_rqst().dlv_addr2();
	}

	/**
	 * Address 2 (Delivery destination) 納品先住所２.<p>
	 *
	 */
	public void dlv_addr2(String value) {
		wg_rqst().dlv_addr2(value);
	}

	/**
	 * Address 3 (Delivery destination) 納品先住所３.<p>
	 *
	 */
	public String dlv_addr3() {
		return wg_rqst().dlv_addr3();
	}

	/**
	 * Address 3 (Delivery destination) 納品先住所３.<p>
	 *
	 */
	public void dlv_addr3(String value) {
		wg_rqst().dlv_addr3(value);
	}

	/**
	 * Address 4 (Delivery destination) 納品先住所４.<p>
	 *
	 */
	public String dlv_addr4() {
		return wg_rqst().dlv_addr4();
	}

	/**
	 * Address 4 (Delivery destination) 納品先住所４.<p>
	 *
	 */
	public void dlv_addr4(String value) {
		wg_rqst().dlv_addr4(value);
	}

	/**
	 * TEL (Delivery destination) 納品先ＴＥＬ.<p>
	 *
	 */
	public String dlv_tel() {
		return wg_rqst().dlv_tel();
	}

	/**
	 * TEL (Delivery destination) 納品先ＴＥＬ.<p>
	 *
	 */
	public void dlv_tel(String value) {
		wg_rqst().dlv_tel(value);
	}

	/**
	 * FAX (Delivery destination) 納品先ＦＡＸ.<p>
	 *
	 */
	public String dlv_fax() {
		return wg_rqst().dlv_fax();
	}

	/**
	 * FAX (Delivery destination) 納品先ＦＡＸ.<p>
	 *
	 */
	public void dlv_fax(String value) {
		wg_rqst().dlv_fax(value);
	}

	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public String tdlv_cd() {
		return wg_rqst().tdlv_cd();
	}

	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public void tdlv_cd(String value) {
		wg_rqst().tdlv_cd(value);
	}

	/**
	 * Miscellaneous receiving point 配送先諸口.<p>
	 *
	 */
	public boolean tdlv_sundry_flg() {
		return wg_rqst().tdlv_sundry_flg();
	}

	/**
	 * Miscellaneous receiving point 配送先諸口.<p>
	 *
	 */
	public void tdlv_sundry_flg(boolean value) {
		wg_rqst().tdlv_sundry_flg(value);
	}

	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public String tdlv_nm() {
		return wg_rqst().tdlv_nm();
	}

	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public void tdlv_nm(String value) {
		wg_rqst().tdlv_nm(value);
	}

	/**
	 * Receiving point zip code 配送先郵便番号.<p>
	 *
	 */
	public String tdlv_zip_cd() {
		return wg_rqst().tdlv_zip_cd();
	}

	/**
	 * Receiving point zip code 配送先郵便番号.<p>
	 *
	 */
	public void tdlv_zip_cd(String value) {
		wg_rqst().tdlv_zip_cd(value);
	}

	/**
	 * Receiving point address 1 配送先住所１.<p>
	 *
	 */
	public String tdlv_addr1() {
		return wg_rqst().tdlv_addr1();
	}

	/**
	 * Receiving point address 1 配送先住所１.<p>
	 *
	 */
	public void tdlv_addr1(String value) {
		wg_rqst().tdlv_addr1(value);
	}

	/**
	 * Receiving point address 2 配送先住所２.<p>
	 *
	 */
	public String tdlv_addr2() {
		return wg_rqst().tdlv_addr2();
	}

	/**
	 * Receiving point address 2 配送先住所２.<p>
	 *
	 */
	public void tdlv_addr2(String value) {
		wg_rqst().tdlv_addr2(value);
	}

	/**
	 * Receiving point address 3 配送先住所３.<p>
	 *
	 */
	public String tdlv_addr3() {
		return wg_rqst().tdlv_addr3();
	}

	/**
	 * Receiving point address 3 配送先住所３.<p>
	 *
	 */
	public void tdlv_addr3(String value) {
		wg_rqst().tdlv_addr3(value);
	}

	/**
	 * Receiving point address 4 配送先住所４.<p>
	 *
	 */
	public String tdlv_addr4() {
		return wg_rqst().tdlv_addr4();
	}

	/**
	 * Receiving point address 4 配送先住所４.<p>
	 *
	 */
	public void tdlv_addr4(String value) {
		wg_rqst().tdlv_addr4(value);
	}

	/**
	 * Receiving point dept. 配送先部署.<p>
	 *
	 */
	public String tdlv_cntct_dpt() {
		return wg_rqst().tdlv_cntct_dpt();
	}

	/**
	 * Receiving point dept. 配送先部署.<p>
	 *
	 */
	public void tdlv_cntct_dpt(String value) {
		wg_rqst().tdlv_cntct_dpt(value);
	}

	/**
	 * Receiving point PIC 配送先担当者.<p>
	 *
	 */
	public String tdlv_cntct_psn() {
		return wg_rqst().tdlv_cntct_psn();
	}

	/**
	 * Receiving point PIC 配送先担当者.<p>
	 *
	 */
	public void tdlv_cntct_psn(String value) {
		wg_rqst().tdlv_cntct_psn(value);
	}

	/**
	 * Receiving point TEL 配送先ＴＥＬ.<p>
	 *
	 */
	public String tdlv_tel() {
		return wg_rqst().tdlv_tel();
	}

	/**
	 * Receiving point TEL 配送先ＴＥＬ.<p>
	 *
	 */
	public void tdlv_tel(String value) {
		wg_rqst().tdlv_tel(value);
	}

	/**
	 * Receiving point FAX 配送先ＦＡＸ.<p>
	 *
	 */
	public String tdlv_fax() {
		return wg_rqst().tdlv_fax();
	}

	/**
	 * Receiving point FAX 配送先ＦＡＸ.<p>
	 *
	 */
	public void tdlv_fax(String value) {
		wg_rqst().tdlv_fax(value);
	}

	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public String itm_ord_no() {
		return wg_rqst().itm_ord_no();
	}

	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public void itm_ord_no(String value) {
		wg_rqst().itm_ord_no(value);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return wg_rqst().mfg_loc_cd();
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		wg_rqst().mfg_loc_cd(value);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return wg_rqst().bom_ptn();
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		wg_rqst().bom_ptn(value);
	}

	/**
	 * Purchase reason cd. 仕入理由ＣＤ.<p>
	 *
	 */
	public String purc_rsn_cd() {
		return wg_rqst().purc_rsn_cd();
	}

	/**
	 * Purchase reason cd. 仕入理由ＣＤ.<p>
	 *
	 */
	public void purc_rsn_cd(String value) {
		wg_rqst().purc_rsn_cd(value);
	}

	/**
	 * Expense purchase 経費購買.<p>
	 *
	 */
	public boolean xpns_po_flg() {
		return wg_rqst().xpns_po_flg();
	}

	/**
	 * Expense purchase 経費購買.<p>
	 *
	 */
	public void xpns_po_flg(boolean value) {
		wg_rqst().xpns_po_flg(value);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return wg_rqst().trd_cd();
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		wg_rqst().trd_cd(value);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return wg_rqst().trd_ptn_typ();
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		wg_rqst().trd_ptn_typ(value);
	}

	/**
	 * Charged item cd. 負担品目ＣＤ.<p>
	 *
	 */
	public String bd_itm_cd() {
		return wg_rqst().bd_itm_cd();
	}

	/**
	 * Charged item cd. 負担品目ＣＤ.<p>
	 *
	 */
	public void bd_itm_cd(String value) {
		wg_rqst().bd_itm_cd(value);
	}

	/**
	 * Charged branch No. 1 負担枝番１.<p>
	 *
	 */
	public String bd_itm_sub1() {
		return wg_rqst().bd_itm_sub1();
	}

	/**
	 * Charged branch No. 1 負担枝番１.<p>
	 *
	 */
	public void bd_itm_sub1(String value) {
		wg_rqst().bd_itm_sub1(value);
	}

	/**
	 * Charged branch No. 2 負担枝番２.<p>
	 *
	 */
	public String bd_itm_sub2() {
		return wg_rqst().bd_itm_sub2();
	}

	/**
	 * Charged branch No. 2 負担枝番２.<p>
	 *
	 */
	public void bd_itm_sub2(String value) {
		wg_rqst().bd_itm_sub2(value);
	}

	/**
	 * Charged branch No. 3 負担枝番３.<p>
	 *
	 */
	public String bd_itm_sub3() {
		return wg_rqst().bd_itm_sub3();
	}

	/**
	 * Charged branch No. 3 負担枝番３.<p>
	 *
	 */
	public void bd_itm_sub3(String value) {
		wg_rqst().bd_itm_sub3(value);
	}

	/**
	 * Charged SEIBAN No. 1 負担手配ＮＯ１.<p>
	 *
	 */
	public String bd_sno1() {
		return wg_rqst().bd_sno1();
	}

	/**
	 * Charged SEIBAN No. 1 負担手配ＮＯ１.<p>
	 *
	 */
	public void bd_sno1(String value) {
		wg_rqst().bd_sno1(value);
	}

	/**
	 * Charged SEIBAN No. 2 負担手配ＮＯ２.<p>
	 *
	 */
	public String bd_sno2() {
		return wg_rqst().bd_sno2();
	}

	/**
	 * Charged SEIBAN No. 2 負担手配ＮＯ２.<p>
	 *
	 */
	public void bd_sno2(String value) {
		wg_rqst().bd_sno2(value);
	}

	/**
	 * Charged SEIBAN No. 3 負担手配ＮＯ３.<p>
	 *
	 */
	public String bd_sno3() {
		return wg_rqst().bd_sno3();
	}

	/**
	 * Charged SEIBAN No. 3 負担手配ＮＯ３.<p>
	 *
	 */
	public void bd_sno3(String value) {
		wg_rqst().bd_sno3(value);
	}

	/**
	 * Charged SEIBAN No. 4 負担手配ＮＯ４.<p>
	 *
	 */
	public String bd_sno4() {
		return wg_rqst().bd_sno4();
	}

	/**
	 * Charged SEIBAN No. 4 負担手配ＮＯ４.<p>
	 *
	 */
	public void bd_sno4(String value) {
		wg_rqst().bd_sno4(value);
	}

	/**
	 * Charged lot No. 負担ロットＮＯ.<p>
	 *
	 */
	public String bd_lot_no() {
		return wg_rqst().bd_lot_no();
	}

	/**
	 * Charged lot No. 負担ロットＮＯ.<p>
	 *
	 */
	public void bd_lot_no(String value) {
		wg_rqst().bd_lot_no(value);
	}

	/**
	 * Charged sublot No. 負担サブロットＮＯ.<p>
	 *
	 */
	public String bd_sublot_no() {
		return wg_rqst().bd_sublot_no();
	}

	/**
	 * Charged sublot No. 負担サブロットＮＯ.<p>
	 *
	 */
	public void bd_sublot_no(String value) {
		wg_rqst().bd_sublot_no(value);
	}

	/**
	 * Charged location cd. 負担場所ＣＤ.<p>
	 *
	 */
	public String bd_loc_cd() {
		return wg_rqst().bd_loc_cd();
	}

	/**
	 * Charged location cd. 負担場所ＣＤ.<p>
	 *
	 */
	public void bd_loc_cd(String value) {
		wg_rqst().bd_loc_cd(value);
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public String bd_dpt_cd() {
		return wg_rqst().bd_dpt_cd();
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		wg_rqst().bd_dpt_cd(value);
	}

	/**
	 * Charged item category cd. 負担品群ＣＤ.<p>
	 *
	 */
	public String bd_ctg_cd() {
		return wg_rqst().bd_ctg_cd();
	}

	/**
	 * Charged item category cd. 負担品群ＣＤ.<p>
	 *
	 */
	public void bd_ctg_cd(String value) {
		wg_rqst().bd_ctg_cd(value);
	}

	/**
	 * Charged operation cd. 負担工程ＣＤ.<p>
	 *
	 */
	public String bd_oper_cd() {
		return wg_rqst().bd_oper_cd();
	}

	/**
	 * Charged operation cd. 負担工程ＣＤ.<p>
	 *
	 */
	public void bd_oper_cd(String value) {
		wg_rqst().bd_oper_cd(value);
	}

	/**
	 * Charged sales No. 負担受注ＮＯ.<p>
	 *
	 */
	public String bd_slo_no() {
		return wg_rqst().bd_slo_no();
	}

	/**
	 * Charged sales No. 負担受注ＮＯ.<p>
	 *
	 */
	public void bd_slo_no(String value) {
		wg_rqst().bd_slo_no(value);
	}

	/**
	 * Charged invoice No. 負担インボイスＮＯ.<p>
	 *
	 */
	public String bd_iv_no() {
		return wg_rqst().bd_iv_no();
	}

	/**
	 * Charged invoice No. 負担インボイスＮＯ.<p>
	 *
	 */
	public void bd_iv_no(String value) {
		wg_rqst().bd_iv_no(value);
	}

	/**
	 * Charged PO No. 負担発注ＮＯ.<p>
	 *
	 */
	public String bd_po_no() {
		return wg_rqst().bd_po_no();
	}

	/**
	 * Charged PO No. 負担発注ＮＯ.<p>
	 *
	 */
	public void bd_po_no(String value) {
		wg_rqst().bd_po_no(value);
	}

	/**
	 * Request contact remarks 依頼連絡備考.<p>
	 *
	 */
	public String wg_rqst_cnt_rmrks() {
		return wg_rqst().wg_rqst_cnt_rmrks();
	}

	/**
	 * Request contact remarks 依頼連絡備考.<p>
	 *
	 */
	public void wg_rqst_cnt_rmrks(String value) {
		wg_rqst().wg_rqst_cnt_rmrks(value);
	}

	/**
	 * Readjustment request contact remarks 再調整依頼連絡備考.<p>
	 *
	 */
	public String wg_re_rqst_cnt_rmrks() {
		return wg_rqst().wg_re_rqst_cnt_rmrks();
	}

	/**
	 * Readjustment request contact remarks 再調整依頼連絡備考.<p>
	 *
	 */
	public void wg_re_rqst_cnt_rmrks(String value) {
		wg_rqst().wg_re_rqst_cnt_rmrks(value);
	}

	/**
	 * Request source internal remarks 依頼元内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return wg_rqst().intr_rmrks();
	}

	/**
	 * Request source internal remarks 依頼元内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		wg_rqst().intr_rmrks(value);
	}

	/**
	 * Edit configuration 構成変更.<p>
	 *
	 */
	public boolean comp_cng_flg() {
		return wg_rqst().comp_cng_flg();
	}

	/**
	 * Edit configuration 構成変更.<p>
	 *
	 */
	public void comp_cng_flg(boolean value) {
		wg_rqst().comp_cng_flg(value);
	}

	/**
	 * Specification change 仕様変更.<p>
	 *
	 */
	public boolean spec_cng_flg() {
		return wg_rqst().spec_cng_flg();
	}

	/**
	 * Specification change 仕様変更.<p>
	 *
	 */
	public void spec_cng_flg(boolean value) {
		wg_rqst().spec_cng_flg(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return wg_rqst().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		wg_rqst().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return wg_rqst().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		wg_rqst().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return wg_rqst().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		wg_rqst().sub_char3(value);
	}

}

