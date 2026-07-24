package mcframe.serverMSBE.MSBEL5300;

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
 * ブロック"XfrActIF_HdrDtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class XfrActIF_HdrDtlR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public static final String $rtn_sts_typ = "rtn_sts_typ";
	public static final String $xah = "xah";
	/**
	 * Delivery note immediate issue flg. 納品書即時発行ＦＬＧ.<p>
	 *
	 */
	public static final String $immd_dlv_prnt_flg = "immd_dlv_prnt_flg";
	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public static final String $can_ac_dt = "can_ac_dt";
	public static final String $xad = "xad";
	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public static final String $trd_unit_conv_base_qty = "trd_unit_conv_base_qty";
	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public static final String $trd_unit_conv_qty = "trd_unit_conv_qty";
	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_unit_dec_place = "trd_unit_dec_place";
	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public static final String $trd_unit_rnd_typ = "trd_unit_rnd_typ";
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public static final String $base_unit_dec_place = "base_unit_dec_place";
	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public static final String $base_unit_rnd_typ = "base_unit_rnd_typ";
	/**
	 * Cancel remaining flg. 打切ＦＬＧ.<p>
	 *
	 */
	public static final String $abort_flg = "abort_flg";
	/**
	 * Supply schedule No. 支給予定ＮＯ.<p>
	 *
	 */
	public static final String $prov_schd_no = "prov_schd_no";
	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public static final String $prov_typ = "prov_typ";
	/**
	 * Supply schedule No. (Return) 支給予定ＮＯ（返品）.<p>
	 *
	 */
	public static final String $ret_prov_schd_no = "ret_prov_schd_no";
	/**
	 * Supply type (Return) 支給区分（返品）.<p>
	 *
	 */
	public static final String $ret_prov_typ = "ret_prov_typ";
	/**
	 * Allocation status update counter 引当状況更新カウンタ.<p>
	 *
	 */
	public static final String $alloc_sts_upd_cntr = "alloc_sts_upd_cntr";
	/**
	 * Order update counter 指図更新カウンタ.<p>
	 *
	 */
	public static final String $inst_upd_cntr = "inst_upd_cntr";
	/**
	 * Result update counter 実績更新カウンタ.<p>
	 *
	 */
	public static final String $act_upd_cntr = "act_upd_cntr";
	/**
	 * Implementation PIC cd. update flg. 実施担当者ＣＤ更新ＦＬＧ.<p>
	 *
	 */
	public static final String $act_usr_cd_upd_flg = "act_usr_cd_upd_flg";
	/**
	 * Implementation dept. cd. update flg. 実施部門ＣＤ更新ＦＬＧ.<p>
	 *
	 */
	public static final String $act_dpt_cd_upd_flg = "act_dpt_cd_upd_flg";
	/**
	 * Internal remarks update flg. 内部備考更新ＦＬＧ.<p>
	 *
	 */
	public static final String $intr_rmrks_upd_flg = "intr_rmrks_upd_flg";
	/**
	 * Transaction remarks update flg. 取引備考更新ＦＬＧ.<p>
	 *
	 */
	public static final String $trd_rmrks_upd_flg = "trd_rmrks_upd_flg";
	/**
	 * Update spare 1 flg. 予備１更新ＦＬＧ.<p>
	 *
	 */
	public static final String $sub_char1_upd_flg = "sub_char1_upd_flg";
	/**
	 * Update spare 2 flg. 予備２更新ＦＬＧ.<p>
	 *
	 */
	public static final String $sub_char2_upd_flg = "sub_char2_upd_flg";
	/**
	 * Update spare 3 flg. 予備３更新ＦＬＧ.<p>
	 *
	 */
	public static final String $sub_char3_upd_flg = "sub_char3_upd_flg";
	/**
	 * Internal details remarks update flg. 内部明細備考更新ＦＬＧ.<p>
	 *
	 */
	public static final String $intr_d_rmrks_upd_flg = "intr_d_rmrks_upd_flg";
	/**
	 * Transaction details remarks update flg. 取引明細備考更新ＦＬＧ.<p>
	 *
	 */
	public static final String $trd_d_rmrks_upd_flg = "trd_d_rmrks_upd_flg";
	/**
	 * Update details spare 1 flg. 明細予備１更新ＦＬＧ.<p>
	 *
	 */
	public static final String $sub_char1_dtl_upd_flg = "sub_char1_dtl_upd_flg";
	/**
	 * Details spare 2 update flg. 明細予備２更新ＦＬＧ.<p>
	 *
	 */
	public static final String $sub_char2_dtl_upd_flg = "sub_char2_dtl_upd_flg";
	/**
	 * Details spare 3 update flg. 明細予備３更新ＦＬＧ.<p>
	 *
	 */
	public static final String $sub_char3_dtl_upd_flg = "sub_char3_dtl_upd_flg";
	/**
	 * GR factory/distribution warehouse cd. 入庫工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $gr_site_cd = "gr_site_cd";
	/**
	 * GI factory/distribution warehouse cd. 出庫工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $gi_site_cd = "gi_site_cd";
	/**
	 * GR supplier cd. 入庫発注先ＣＤ.<p>
	 *
	 */
	public static final String $gr_sppl_cd = "gr_sppl_cd";
	/**
	 * GR chargeable supplier flg. 入庫有償支給先ＦＬＧ.<p>
	 *
	 */
	public static final String $gr_onr_prsppl_flg = "gr_onr_prsppl_flg";
	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public static final String $lot_mng_typ = "lot_mng_typ";
	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public static final String $sublot_mng_typ = "sublot_mng_typ";
	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public static final String $asset_mng_typ = "asset_mng_typ";
	/**
	 * GI WG cd. 出庫ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $gi_wg_cd = "gi_wg_cd";
	/**
	 * GI distribution group cd. 出庫物流グループＣＤ.<p>
	 *
	 */
	public static final String $gi_lg_grp_cd = "gi_lg_grp_cd";
	/**
	 * GI supplier cd. 出庫発注先ＣＤ.<p>
	 *
	 */
	public static final String $gi_sppl_cd = "gi_sppl_cd";
	/**
	 * Other accounting GI 他勘定出庫.<p>
	 *
	 */
	public static final String $acxfr_gi_flg = "acxfr_gi_flg";

	public static final String $xfr_act_no = $xah + ".xfr_act_no";
	public static final String $xfr_inst_no = $xah + ".xfr_inst_no";
	public static final String $trd_cd = $xah + ".trd_cd";
	public static final String $trd_ptn_typ = $xah + ".trd_ptn_typ";
	public static final String $wg_cd = $xah + ".wg_cd";
	public static final String $lg_grp_cd = $xah + ".lg_grp_cd";
	public static final String $gr_loc_cd = $xah + ".gr_loc_cd";
	public static final String $gr_stk_arrv_bp_cd = $xah + ".gr_stk_arrv_bp_cd";
	public static final String $xfr_dt = $xah + ".xfr_dt";
	public static final String $ac_dt = $xah + ".ac_dt";
	public static final String $act_usr_cd = $xah + ".act_usr_cd";
	public static final String $act_dpt_cd = $xah + ".act_dpt_cd";
	public static final String $intr_rmrks = $xah + ".intr_rmrks";
	public static final String $trd_rmrks = $xah + ".trd_rmrks";
	public static final String $sub_char1 = $xah + ".sub_char1";
	public static final String $sub_char2 = $xah + ".sub_char2";
	public static final String $sub_char3 = $xah + ".sub_char3";
	public static final String $xfr_act_d_no = $xad + ".xfr_act_d_no";
	public static final String $xfr_act_no_dtl = $xad + ".xfr_act_no";
	public static final String $xfr_alloc_sts_no = $xad + ".xfr_alloc_sts_no";
	public static final String $xfr_inst_d_no = $xad + ".xfr_inst_d_no";
	public static final String $gi_loc_cd = $xad + ".gi_loc_cd";
	public static final String $gi_str_ln_cd = $xad + ".gi_str_ln_cd";
	public static final String $gi_stk_arrv_bp_cd = $xad + ".gi_stk_arrv_bp_cd";
	public static final String $gr_str_ln_cd = $xad + ".gr_str_ln_cd";
	public static final String $itm_cd = $xad + ".itm_cd";
	public static final String $itm_sub1 = $xad + ".itm_sub1";
	public static final String $itm_sub2 = $xad + ".itm_sub2";
	public static final String $itm_sub3 = $xad + ".itm_sub3";
	public static final String $lot_no = $xad + ".lot_no";
	public static final String $sublot_no = $xad + ".sublot_no";
	public static final String $sno1 = $xad + ".sno1";
	public static final String $sno2 = $xad + ".sno2";
	public static final String $sno3 = $xad + ".sno3";
	public static final String $sno4 = $xad + ".sno4";
	public static final String $gd_cd = $xad + ".gd_cd";
	public static final String $quality_typ = $xad + ".quality_typ";
	public static final String $stk_insp_typ = $xad + ".stk_insp_typ";
	public static final String $stk_id_typ = $xad + ".stk_id_typ";
	public static final String $stk_bp_cd = $xad + ".stk_bp_cd";
	public static final String $trd_unit_cd = $xad + ".trd_unit_cd";
	public static final String $trd_unit_qty = $xad + ".trd_unit_qty";
	public static final String $base_unit_cd = $xad + ".base_unit_cd";
	public static final String $base_unit_qty = $xad + ".base_unit_qty";
	public static final String $skip_chk_ship_flg = $xad + ".skip_chk_ship_flg";
	public static final String $rsn_cd = $xad + ".rsn_cd";
	public static final String $bd_dpt_cd = $xad + ".bd_dpt_cd";
	public static final String $dlv_slip_no = $xad + ".dlv_slip_no";
	public static final String $io_schd_pr_no = $xad + ".io_schd_pr_no";
	public static final String $base_dlv_slip_no = $xad + ".base_dlv_slip_no";
	public static final String $base_prov_act_no = $xad + ".base_prov_act_no";
	public static final String $base_ac_dt = $xad + ".base_ac_dt";
	public static final String $disp_seq = $xad + ".disp_seq";
	public static final String $intr_d_rmrks = $xad + ".intr_d_rmrks";
	public static final String $trd_d_rmrks = $xad + ".trd_d_rmrks";
	public static final String $sub_char1_dtl = $xad + ".sub_char1";
	public static final String $sub_char2_dtl = $xad + ".sub_char2";
	public static final String $sub_char3_dtl = $xad + ".sub_char3";
	public static final String $wms_flg = $xad + ".wms_flg";
	public static final String $ext_sys_cd = $xad + ".ext_sys_cd";
	public static final String $ext_xfr_act_no = $xad + ".ext_xfr_act_no";

	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rtn_sts_typ_META = createCommonMeta($rtn_sts_typ, mcframe.commonMA.meta.MA_META.RTN_STS_TYP);
	public static final MCMeta xah_META = createInnerRowMeta($xah, mcframe.serverMS.dbc.MST_XFR_ACT_R.class);
	public static final MCMeta immd_dlv_prnt_flg_META = createCommonMeta($immd_dlv_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta can_ac_dt_META = createCommonMeta($can_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta xad_META = createInnerRowMeta($xad, mcframe.serverMS.dbc.MST_XFR_ACT_D_R.class);
	public static final MCMeta trd_unit_conv_base_qty_META = createCommonMeta($trd_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_conv_qty_META = createCommonMeta($trd_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_dec_place_META = createCommonMeta($trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_unit_rnd_typ_META = createCommonMeta($trd_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_rnd_typ_META = createCommonMeta($base_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta abort_flg_META = createCommonMeta($abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prov_schd_no_META = createCommonMeta($prov_schd_no, mcframe.commonMA.meta.MA_META.PROV_SCHD_NO);
	public static final MCMeta prov_typ_META = createCommonMeta($prov_typ, mcframe.commonMA.meta.MA_META.PROV_TYP);
	public static final MCMeta ret_prov_schd_no_META = createCommonMeta($ret_prov_schd_no, mcframe.commonMA.meta.MA_META.PROV_SCHD_NO);
	public static final MCMeta ret_prov_typ_META = createCommonMeta($ret_prov_typ, mcframe.commonMA.meta.MA_META.PROV_TYP);
	public static final MCMeta alloc_sts_upd_cntr_META = createCommonMeta($alloc_sts_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta inst_upd_cntr_META = createCommonMeta($inst_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta act_upd_cntr_META = createCommonMeta($act_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta act_usr_cd_upd_flg_META = createCommonMeta($act_usr_cd_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta act_dpt_cd_upd_flg_META = createCommonMeta($act_dpt_cd_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta intr_rmrks_upd_flg_META = createCommonMeta($intr_rmrks_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_rmrks_upd_flg_META = createCommonMeta($trd_rmrks_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sub_char1_upd_flg_META = createCommonMeta($sub_char1_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sub_char2_upd_flg_META = createCommonMeta($sub_char2_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sub_char3_upd_flg_META = createCommonMeta($sub_char3_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta intr_d_rmrks_upd_flg_META = createCommonMeta($intr_d_rmrks_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_d_rmrks_upd_flg_META = createCommonMeta($trd_d_rmrks_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sub_char1_dtl_upd_flg_META = createCommonMeta($sub_char1_dtl_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sub_char2_dtl_upd_flg_META = createCommonMeta($sub_char2_dtl_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sub_char3_dtl_upd_flg_META = createCommonMeta($sub_char3_dtl_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gr_site_cd_META = createCommonMeta($gr_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta gi_site_cd_META = createCommonMeta($gi_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta gr_sppl_cd_META = createCommonMeta($gr_sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta gr_onr_prsppl_flg_META = createCommonMeta($gr_onr_prsppl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_mng_typ_META = createCommonMeta($lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta sublot_mng_typ_META = createCommonMeta($sublot_mng_typ, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP);
	public static final MCMeta asset_mng_typ_META = createCommonMeta($asset_mng_typ, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP);
	public static final MCMeta gi_wg_cd_META = createCommonMeta($gi_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta gi_lg_grp_cd_META = createCommonMeta($gi_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta gi_sppl_cd_META = createCommonMeta($gi_sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta acxfr_gi_flg_META = createCommonMeta($acxfr_gi_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<XfrActIF_HdrDtlR> constMetas = new ConstMetaList<XfrActIF_HdrDtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			data_crud_typ_META,
			err_flg_META,
			rtn_sts_typ_META,
			xah_META,
			immd_dlv_prnt_flg_META,
			can_ac_dt_META,
			xad_META,
			trd_unit_conv_base_qty_META,
			trd_unit_conv_qty_META,
			trd_unit_dec_place_META,
			trd_unit_rnd_typ_META,
			base_unit_dec_place_META,
			base_unit_rnd_typ_META,
			abort_flg_META,
			prov_schd_no_META,
			prov_typ_META,
			ret_prov_schd_no_META,
			ret_prov_typ_META,
			alloc_sts_upd_cntr_META,
			inst_upd_cntr_META,
			act_upd_cntr_META,
			act_usr_cd_upd_flg_META,
			act_dpt_cd_upd_flg_META,
			intr_rmrks_upd_flg_META,
			trd_rmrks_upd_flg_META,
			sub_char1_upd_flg_META,
			sub_char2_upd_flg_META,
			sub_char3_upd_flg_META,
			intr_d_rmrks_upd_flg_META,
			trd_d_rmrks_upd_flg_META,
			sub_char1_dtl_upd_flg_META,
			sub_char2_dtl_upd_flg_META,
			sub_char3_dtl_upd_flg_META,
			gr_site_cd_META,
			gi_site_cd_META,
			gr_sppl_cd_META,
			gr_onr_prsppl_flg_META,
			lot_mng_typ_META,
			sublot_mng_typ_META,
			asset_mng_typ_META,
			gi_wg_cd_META,
			gi_lg_grp_cd_META,
			gi_sppl_cd_META,
			acxfr_gi_flg_META
		},
		new String[][]{
			{
				"xfr_act_no",
				"xfr_inst_no",
				"trd_cd",
				"trd_ptn_typ",
				"wg_cd",
				"lg_grp_cd",
				"gr_loc_cd",
				"gr_stk_arrv_bp_cd",
				"xfr_dt",
				"ac_dt",
				"act_usr_cd",
				"act_dpt_cd",
				"intr_rmrks",
				"trd_rmrks",
				"sub_char1",
				"sub_char2",
				"sub_char3",
				"xfr_act_d_no",
				"xfr_act_no_dtl",
				"xfr_alloc_sts_no",
				"xfr_inst_d_no",
				"gi_loc_cd",
				"gi_str_ln_cd",
				"gi_stk_arrv_bp_cd",
				"gr_str_ln_cd",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"lot_no",
				"sublot_no",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"gd_cd",
				"quality_typ",
				"stk_insp_typ",
				"stk_id_typ",
				"stk_bp_cd",
				"trd_unit_cd",
				"trd_unit_qty",
				"base_unit_cd",
				"base_unit_qty",
				"skip_chk_ship_flg",
				"rsn_cd",
				"bd_dpt_cd",
				"dlv_slip_no",
				"io_schd_pr_no",
				"base_dlv_slip_no",
				"base_prov_act_no",
				"base_ac_dt",
				"disp_seq",
				"intr_d_rmrks",
				"trd_d_rmrks",
				"sub_char1_dtl",
				"sub_char2_dtl",
				"sub_char3_dtl",
				"wms_flg",
				"ext_sys_cd",
				"ext_xfr_act_no"
			},
			{
				$xfr_act_no,
				$xfr_inst_no,
				$trd_cd,
				$trd_ptn_typ,
				$wg_cd,
				$lg_grp_cd,
				$gr_loc_cd,
				$gr_stk_arrv_bp_cd,
				$xfr_dt,
				$ac_dt,
				$act_usr_cd,
				$act_dpt_cd,
				$intr_rmrks,
				$trd_rmrks,
				$sub_char1,
				$sub_char2,
				$sub_char3,
				$xfr_act_d_no,
				$xfr_act_no_dtl,
				$xfr_alloc_sts_no,
				$xfr_inst_d_no,
				$gi_loc_cd,
				$gi_str_ln_cd,
				$gi_stk_arrv_bp_cd,
				$gr_str_ln_cd,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$lot_no,
				$sublot_no,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$gd_cd,
				$quality_typ,
				$stk_insp_typ,
				$stk_id_typ,
				$stk_bp_cd,
				$trd_unit_cd,
				$trd_unit_qty,
				$base_unit_cd,
				$base_unit_qty,
				$skip_chk_ship_flg,
				$rsn_cd,
				$bd_dpt_cd,
				$dlv_slip_no,
				$io_schd_pr_no,
				$base_dlv_slip_no,
				$base_prov_act_no,
				$base_ac_dt,
				$disp_seq,
				$intr_d_rmrks,
				$trd_d_rmrks,
				$sub_char1_dtl,
				$sub_char2_dtl,
				$sub_char3_dtl,
				$wms_flg,
				$ext_sys_cd,
				$ext_xfr_act_no
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
				{$peg_no, "E"},	// peg_no
				{$data_crud_typ, "E"},	// data_crud_typ
				{$xah + ".trd_cd", "E"},	// xah.trd_cd
				{$xah + ".gr_loc_cd", "E"},	// xah.gr_loc_cd
				{$xah + ".xfr_dt", "E"},	// xah.xfr_dt
				{$xah + ".ac_dt", "E"},	// xah.ac_dt
				{$xad + ".gi_loc_cd", "E"},	// xad.gi_loc_cd
				{$xad + ".itm_cd", "E"},	// xad.itm_cd
				{$xad + ".gd_cd", "E"},	// xad.gd_cd
				{$xad + ".quality_typ", "E"},	// xad.quality_typ
				{$xad + ".stk_insp_typ", "E"},	// xad.stk_insp_typ
				{$xad + ".stk_id_typ", "E"},	// xad.stk_id_typ
				{$xad + ".trd_unit_cd", "E"},	// xad.trd_unit_cd
				{$xad + ".trd_unit_qty", "E"}	// xad.trd_unit_qty
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
				{$xad + ".trd_unit_qty", "positive"}	// xad.trd_unit_qty
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_DT, new MCExtList(
			new String[][]{
				{$xah + ".xfr_dt", "bfToday"},	// xah.xfr_dt
				{$xah + ".ac_dt", "bfToday"},	// xah.ac_dt
				{$can_ac_dt, "bfToday"}	// can_ac_dt
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
				{$xah + ".trd_cd", "MA.MAUAL0010.Trd"},	// xah.trd_cd
				{$xah + ".gr_loc_cd", "MA.MAUAL0010.Loc"},	// xah.gr_loc_cd
				{$xah + ".gr_stk_arrv_bp_cd", "MA.MAUAL0010.Bp"},	// xah.gr_stk_arrv_bp_cd
				{$xah + ".act_usr_cd", "MA.MAUAL0010.Usr"},	// xah.act_usr_cd
				{$xah + ".act_dpt_cd", "MA.MAUAL0010.Dpt"},	// xah.act_dpt_cd
				{$xad + ".gi_loc_cd", "MA.MAUAL0010.Loc"},	// xad.gi_loc_cd
				{$xad + ".gi_str_ln_cd", "MA.MAUAL0010.StrLn"},	// xad.gi_str_ln_cd
				{$xad + ".gi_stk_arrv_bp_cd", "MA.MAUAL0010.Bp"},	// xad.gi_stk_arrv_bp_cd
				{$xad + ".gr_str_ln_cd", "MA.MAUAL0010.StrLn"},	// xad.gr_str_ln_cd
				{$xad + ".itm_sub3", "MA.MAUAL0010.ItmSub3"},	// xad.itm_sub3
				{$xad + ".gd_cd", "MA.MAUAL0010.StkGd"},	// xad.gd_cd
				{$xad + ".stk_bp_cd", "MA.MAUAL0010.Bp"},	// xad.stk_bp_cd
				{$xad + ".trd_unit_cd", "MA.MAUAL0010.ItmUnit"},	// xad.trd_unit_cd
				{$xad + ".rsn_cd", "MA.MAUAL0010.XfrBizRsn"},	// xad.rsn_cd
				{$xad + ".bd_dpt_cd", "MA.MAUAL0010.Dpt"},	// xad.bd_dpt_cd
				{$gr_sppl_cd, "MA.MAUAL0010.Bp"}	// gr_sppl_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$xah + ".trd_cd", "trd_ptn_typ"},	// xah.trd_cd
				{$xah + ".gr_loc_cd", "wg_cd;lg_grp_cd;gr_stk_arrv_bp_cd;gr_sppl_cd"},	// xah.gr_loc_cd
				{$xad + ".gi_loc_cd", "gi_wg_cd;gi_lg_grp_cd;gi_stk_arrv_bp_cd;gi_sppl_cd"},	// xad.gi_loc_cd
				{$xad + ".itm_sub3", "stk_mng_typ;asset_mng_typ;sundry_itm_flg;base_unit_cd;base_unit_dec_place;base_unit_rnd_typ;lot_mng_typ;lot_no_typ;sublot_mng_typ;sublot_no_typ"},	// xad.itm_sub3
				{$xad + ".trd_unit_cd", "trd_unit_conv_base_qty;trd_unit_conv_qty;trd_unit_dec_place;trd_unit_rnd_typ"},	// xad.trd_unit_cd
				{$xad + ".rsn_cd", "acxfr_gi_flg"},	// xad.rsn_cd
				{$gr_sppl_cd, "gr_onr_prsppl_flg"}	// gr_sppl_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$xah + ".trd_cd", "trd_ptn_typ"},	// xah.trd_cd
				{$xah + ".gr_loc_cd", "wg_cd;lg_grp_cd;sppl_cd;sppl_cd"},	// xah.gr_loc_cd
				{$xad + ".gi_loc_cd", "wg_cd;lg_grp_cd;sppl_cd;sppl_cd"},	// xad.gi_loc_cd
				{$xad + ".itm_sub3", "stk_mng_typ;asset_mng_typ;sundry_itm_flg;unit_cd;dec_place;rnd_typ;lot_mng_typ;lot_no_typ;sublot_mng_typ;sublot_no_typ"},	// xad.itm_sub3
				{$xad + ".trd_unit_cd", "conv_base_qty;conv_qty;dec_place;rnd_typ"},	// xad.trd_unit_cd
				{$xad + ".rsn_cd", "acxfr_gi_flg"},	// xad.rsn_cd
				{$gr_sppl_cd, "onr_prsppl_flg"}	// gr_sppl_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$xah + ".gr_stk_arrv_bp_cd", "true"},	// xah.gr_stk_arrv_bp_cd
				{$xah + ".act_dpt_cd", "ac_dt;act_usr_cd;MAC_DPT_IS_SRCH_TYP.SCE"},	// xah.act_dpt_cd
				{$xad + ".gi_str_ln_cd", "gi_loc_cd;true"},	// xad.gi_str_ln_cd
				{$xad + ".gi_stk_arrv_bp_cd", "true"},	// xad.gi_stk_arrv_bp_cd
				{$xad + ".gr_str_ln_cd", "gr_loc_cd;true"},	// xad.gr_str_ln_cd
				{$xad + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.STK1;itm_cd;itm_sub1;itm_sub2"},	// xad.itm_sub3
				{$xad + ".stk_bp_cd", "true"},	// xad.stk_bp_cd
				{$xad + ".trd_unit_cd", "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// xad.trd_unit_cd
				{$xad + ".bd_dpt_cd", "ac_dt;MAC_DPT_IS_SRCH_TYP.BD;true"}	// xad.bd_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$xah + ".gr_stk_arrv_bp_cd", "mode_nullval_flg"},	// xah.gr_stk_arrv_bp_cd
				{$xah + ".act_dpt_cd", "dt;usr_cd;dpt_is_srch_typ"},	// xah.act_dpt_cd
				{$xad + ".gi_str_ln_cd", "loc_cd;mode_nullval_flg"},	// xad.gi_str_ln_cd
				{$xad + ".gi_stk_arrv_bp_cd", "mode_nullval_flg"},	// xad.gi_stk_arrv_bp_cd
				{$xad + ".gr_str_ln_cd", "loc_cd;mode_nullval_flg"},	// xad.gr_str_ln_cd
				{$xad + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"},	// xad.itm_sub3
				{$xad + ".stk_bp_cd", "mode_nullval_flg"},	// xad.stk_bp_cd
				{$xad + ".trd_unit_cd", "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// xad.trd_unit_cd
				{$xad + ".bd_dpt_cd", "dt;dpt_is_srch_typ;mode_nullval_flg"}	// xad.bd_dpt_cd
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$data_crud_typ, "MAC_DATA_CRUD_TYP"},	// data_crud_typ
				{$xad + ".quality_typ", "MAC_QUALITY_TYP"},	// xad.quality_typ
				{$xad + ".stk_insp_typ", "MSC_STK_INSP_TYP"},	// xad.stk_insp_typ
				{$xad + ".stk_id_typ", "MSC_STK_ID_TYP"},	// xad.stk_id_typ
				{$prov_typ, "MAC_PROV_TYP"},	// prov_typ
				{$ret_prov_typ, "MAC_PROV_TYP"}	// ret_prov_typ
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
				{$xad + ".gi_stk_arrv_bp_cd", "E"},	// xad.gi_stk_arrv_bp_cd
				{$xad + ".itm_sub1", "E"},	// xad.itm_sub1
				{$xad + ".itm_sub2", "E"},	// xad.itm_sub2
				{$xad + ".itm_sub3", "E"},	// xad.itm_sub3
				{$xad + ".sno1", "E"},	// xad.sno1
				{$xad + ".sno2", "E"},	// xad.sno2
				{$xad + ".sno3", "E"},	// xad.sno3
				{$xad + ".sno4", "E"}	// xad.sno4
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
	protected XfrActIF_HdrDtlR_MC_A(ConstMetaList<? extends XfrActIF_HdrDtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public XfrActIF_HdrDtlR clone() {
		return (XfrActIF_HdrDtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public XfrActIF_HdrDtlR createInstance() {
		return (XfrActIF_HdrDtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public XfrActIF_HdrDtlR getValues(String... names) {
		return (XfrActIF_HdrDtlR) super.getValues(names);
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
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 1, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 1, $data_crud_typ, value);
	}


	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 2, $err_flg);
	}

	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 2, $err_flg, value);
	}


	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public String rtn_sts_typ() {
		return getConstString(offset + 3, $rtn_sts_typ);
	}

	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public void rtn_sts_typ(String value) {
		setConstString(offset + 3, $rtn_sts_typ, value);
	}


	public mcframe.serverMS.dbc.MST_XFR_ACT_R xah(){
		return (mcframe.serverMS.dbc.MST_XFR_ACT_R) getConstInnerRow(offset + 4, $xah);
	}
	
	public void xah(mcframe.serverMS.dbc.MST_XFR_ACT_R row){
		setConstInnerRow(offset + 4, $xah, row);
	}


	/**
	 * Delivery note immediate issue flg. 納品書即時発行ＦＬＧ.<p>
	 *
	 */
	public boolean immd_dlv_prnt_flg() {
		return getConstBoolean(offset + 5, $immd_dlv_prnt_flg);
	}

	/**
	 * Delivery note immediate issue flg. 納品書即時発行ＦＬＧ.<p>
	 *
	 */
	public void immd_dlv_prnt_flg(boolean value) {
		setConstBoolean(offset + 5, $immd_dlv_prnt_flg, value);
	}


	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public MCDate can_ac_dt() {
		return getConstDate(offset + 6, $can_ac_dt);
	}

	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public void can_ac_dt(MCDate value) {
		setConstDate(offset + 6, $can_ac_dt, value);
	}


	public mcframe.serverMS.dbc.MST_XFR_ACT_D_R xad(){
		return (mcframe.serverMS.dbc.MST_XFR_ACT_D_R) getConstInnerRow(offset + 7, $xad);
	}
	
	public void xad(mcframe.serverMS.dbc.MST_XFR_ACT_D_R row){
		setConstInnerRow(offset + 7, $xad, row);
	}


	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_base_qty() {
		return getConstNumber(offset + 8, $trd_unit_conv_base_qty);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 8, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(int value) {
		setConstNumber(offset + 8, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(long value) {
		setConstNumber(offset + 8, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(float value) {
		setConstNumber(offset + 8, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(double value) {
		setConstNumber(offset + 8, $trd_unit_conv_base_qty, value);
	}


	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_qty() {
		return getConstNumber(offset + 9, $trd_unit_conv_qty);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 9, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(int value) {
		setConstNumber(offset + 9, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(long value) {
		setConstNumber(offset + 9, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(float value) {
		setConstNumber(offset + 9, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(double value) {
		setConstNumber(offset + 9, $trd_unit_conv_qty, value);
	}


	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_unit_dec_place() {
		return getConstNumber(offset + 10, $trd_unit_dec_place);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 10, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(int value) {
		setConstNumber(offset + 10, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(long value) {
		setConstNumber(offset + 10, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(float value) {
		setConstNumber(offset + 10, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(double value) {
		setConstNumber(offset + 10, $trd_unit_dec_place, value);
	}


	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public String trd_unit_rnd_typ() {
		return getConstString(offset + 11, $trd_unit_rnd_typ);
	}

	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public void trd_unit_rnd_typ(String value) {
		setConstString(offset + 11, $trd_unit_rnd_typ, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 12, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 12, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 12, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 12, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 12, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 12, $base_unit_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public String base_unit_rnd_typ() {
		return getConstString(offset + 13, $base_unit_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public void base_unit_rnd_typ(String value) {
		setConstString(offset + 13, $base_unit_rnd_typ, value);
	}


	/**
	 * Cancel remaining flg. 打切ＦＬＧ.<p>
	 *
	 */
	public boolean abort_flg() {
		return getConstBoolean(offset + 14, $abort_flg);
	}

	/**
	 * Cancel remaining flg. 打切ＦＬＧ.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		setConstBoolean(offset + 14, $abort_flg, value);
	}


	/**
	 * Supply schedule No. 支給予定ＮＯ.<p>
	 *
	 */
	public String prov_schd_no() {
		return getConstString(offset + 15, $prov_schd_no);
	}

	/**
	 * Supply schedule No. 支給予定ＮＯ.<p>
	 *
	 */
	public void prov_schd_no(String value) {
		setConstString(offset + 15, $prov_schd_no, value);
	}


	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public String prov_typ() {
		return getConstString(offset + 16, $prov_typ);
	}

	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public void prov_typ(String value) {
		setConstString(offset + 16, $prov_typ, value);
	}


	/**
	 * Supply schedule No. (Return) 支給予定ＮＯ（返品）.<p>
	 *
	 */
	public String ret_prov_schd_no() {
		return getConstString(offset + 17, $ret_prov_schd_no);
	}

	/**
	 * Supply schedule No. (Return) 支給予定ＮＯ（返品）.<p>
	 *
	 */
	public void ret_prov_schd_no(String value) {
		setConstString(offset + 17, $ret_prov_schd_no, value);
	}


	/**
	 * Supply type (Return) 支給区分（返品）.<p>
	 *
	 */
	public String ret_prov_typ() {
		return getConstString(offset + 18, $ret_prov_typ);
	}

	/**
	 * Supply type (Return) 支給区分（返品）.<p>
	 *
	 */
	public void ret_prov_typ(String value) {
		setConstString(offset + 18, $ret_prov_typ, value);
	}


	/**
	 * Allocation status update counter 引当状況更新カウンタ.<p>
	 *
	 */
	public MCNumber alloc_sts_upd_cntr() {
		return getConstNumber(offset + 19, $alloc_sts_upd_cntr);
	}

	/**
	 * Allocation status update counter 引当状況更新カウンタ.<p>
	 *
	 */
	public void alloc_sts_upd_cntr(MCNumber value) {
		setConstNumber(offset + 19, $alloc_sts_upd_cntr, value);
	}

	/**
	 * Allocation status update counter 引当状況更新カウンタ.<p>
	 *
	 */
	public void alloc_sts_upd_cntr(int value) {
		setConstNumber(offset + 19, $alloc_sts_upd_cntr, value);
	}

	/**
	 * Allocation status update counter 引当状況更新カウンタ.<p>
	 *
	 */
	public void alloc_sts_upd_cntr(long value) {
		setConstNumber(offset + 19, $alloc_sts_upd_cntr, value);
	}

	/**
	 * Allocation status update counter 引当状況更新カウンタ.<p>
	 *
	 */
	public void alloc_sts_upd_cntr(float value) {
		setConstNumber(offset + 19, $alloc_sts_upd_cntr, value);
	}

	/**
	 * Allocation status update counter 引当状況更新カウンタ.<p>
	 *
	 */
	public void alloc_sts_upd_cntr(double value) {
		setConstNumber(offset + 19, $alloc_sts_upd_cntr, value);
	}


	/**
	 * Order update counter 指図更新カウンタ.<p>
	 *
	 */
	public MCNumber inst_upd_cntr() {
		return getConstNumber(offset + 20, $inst_upd_cntr);
	}

	/**
	 * Order update counter 指図更新カウンタ.<p>
	 *
	 */
	public void inst_upd_cntr(MCNumber value) {
		setConstNumber(offset + 20, $inst_upd_cntr, value);
	}

	/**
	 * Order update counter 指図更新カウンタ.<p>
	 *
	 */
	public void inst_upd_cntr(int value) {
		setConstNumber(offset + 20, $inst_upd_cntr, value);
	}

	/**
	 * Order update counter 指図更新カウンタ.<p>
	 *
	 */
	public void inst_upd_cntr(long value) {
		setConstNumber(offset + 20, $inst_upd_cntr, value);
	}

	/**
	 * Order update counter 指図更新カウンタ.<p>
	 *
	 */
	public void inst_upd_cntr(float value) {
		setConstNumber(offset + 20, $inst_upd_cntr, value);
	}

	/**
	 * Order update counter 指図更新カウンタ.<p>
	 *
	 */
	public void inst_upd_cntr(double value) {
		setConstNumber(offset + 20, $inst_upd_cntr, value);
	}


	/**
	 * Result update counter 実績更新カウンタ.<p>
	 *
	 */
	public MCNumber act_upd_cntr() {
		return getConstNumber(offset + 21, $act_upd_cntr);
	}

	/**
	 * Result update counter 実績更新カウンタ.<p>
	 *
	 */
	public void act_upd_cntr(MCNumber value) {
		setConstNumber(offset + 21, $act_upd_cntr, value);
	}

	/**
	 * Result update counter 実績更新カウンタ.<p>
	 *
	 */
	public void act_upd_cntr(int value) {
		setConstNumber(offset + 21, $act_upd_cntr, value);
	}

	/**
	 * Result update counter 実績更新カウンタ.<p>
	 *
	 */
	public void act_upd_cntr(long value) {
		setConstNumber(offset + 21, $act_upd_cntr, value);
	}

	/**
	 * Result update counter 実績更新カウンタ.<p>
	 *
	 */
	public void act_upd_cntr(float value) {
		setConstNumber(offset + 21, $act_upd_cntr, value);
	}

	/**
	 * Result update counter 実績更新カウンタ.<p>
	 *
	 */
	public void act_upd_cntr(double value) {
		setConstNumber(offset + 21, $act_upd_cntr, value);
	}


	/**
	 * Implementation PIC cd. update flg. 実施担当者ＣＤ更新ＦＬＧ.<p>
	 *
	 */
	public boolean act_usr_cd_upd_flg() {
		return getConstBoolean(offset + 22, $act_usr_cd_upd_flg);
	}

	/**
	 * Implementation PIC cd. update flg. 実施担当者ＣＤ更新ＦＬＧ.<p>
	 *
	 */
	public void act_usr_cd_upd_flg(boolean value) {
		setConstBoolean(offset + 22, $act_usr_cd_upd_flg, value);
	}


	/**
	 * Implementation dept. cd. update flg. 実施部門ＣＤ更新ＦＬＧ.<p>
	 *
	 */
	public boolean act_dpt_cd_upd_flg() {
		return getConstBoolean(offset + 23, $act_dpt_cd_upd_flg);
	}

	/**
	 * Implementation dept. cd. update flg. 実施部門ＣＤ更新ＦＬＧ.<p>
	 *
	 */
	public void act_dpt_cd_upd_flg(boolean value) {
		setConstBoolean(offset + 23, $act_dpt_cd_upd_flg, value);
	}


	/**
	 * Internal remarks update flg. 内部備考更新ＦＬＧ.<p>
	 *
	 */
	public boolean intr_rmrks_upd_flg() {
		return getConstBoolean(offset + 24, $intr_rmrks_upd_flg);
	}

	/**
	 * Internal remarks update flg. 内部備考更新ＦＬＧ.<p>
	 *
	 */
	public void intr_rmrks_upd_flg(boolean value) {
		setConstBoolean(offset + 24, $intr_rmrks_upd_flg, value);
	}


	/**
	 * Transaction remarks update flg. 取引備考更新ＦＬＧ.<p>
	 *
	 */
	public boolean trd_rmrks_upd_flg() {
		return getConstBoolean(offset + 25, $trd_rmrks_upd_flg);
	}

	/**
	 * Transaction remarks update flg. 取引備考更新ＦＬＧ.<p>
	 *
	 */
	public void trd_rmrks_upd_flg(boolean value) {
		setConstBoolean(offset + 25, $trd_rmrks_upd_flg, value);
	}


	/**
	 * Update spare 1 flg. 予備１更新ＦＬＧ.<p>
	 *
	 */
	public boolean sub_char1_upd_flg() {
		return getConstBoolean(offset + 26, $sub_char1_upd_flg);
	}

	/**
	 * Update spare 1 flg. 予備１更新ＦＬＧ.<p>
	 *
	 */
	public void sub_char1_upd_flg(boolean value) {
		setConstBoolean(offset + 26, $sub_char1_upd_flg, value);
	}


	/**
	 * Update spare 2 flg. 予備２更新ＦＬＧ.<p>
	 *
	 */
	public boolean sub_char2_upd_flg() {
		return getConstBoolean(offset + 27, $sub_char2_upd_flg);
	}

	/**
	 * Update spare 2 flg. 予備２更新ＦＬＧ.<p>
	 *
	 */
	public void sub_char2_upd_flg(boolean value) {
		setConstBoolean(offset + 27, $sub_char2_upd_flg, value);
	}


	/**
	 * Update spare 3 flg. 予備３更新ＦＬＧ.<p>
	 *
	 */
	public boolean sub_char3_upd_flg() {
		return getConstBoolean(offset + 28, $sub_char3_upd_flg);
	}

	/**
	 * Update spare 3 flg. 予備３更新ＦＬＧ.<p>
	 *
	 */
	public void sub_char3_upd_flg(boolean value) {
		setConstBoolean(offset + 28, $sub_char3_upd_flg, value);
	}


	/**
	 * Internal details remarks update flg. 内部明細備考更新ＦＬＧ.<p>
	 *
	 */
	public boolean intr_d_rmrks_upd_flg() {
		return getConstBoolean(offset + 29, $intr_d_rmrks_upd_flg);
	}

	/**
	 * Internal details remarks update flg. 内部明細備考更新ＦＬＧ.<p>
	 *
	 */
	public void intr_d_rmrks_upd_flg(boolean value) {
		setConstBoolean(offset + 29, $intr_d_rmrks_upd_flg, value);
	}


	/**
	 * Transaction details remarks update flg. 取引明細備考更新ＦＬＧ.<p>
	 *
	 */
	public boolean trd_d_rmrks_upd_flg() {
		return getConstBoolean(offset + 30, $trd_d_rmrks_upd_flg);
	}

	/**
	 * Transaction details remarks update flg. 取引明細備考更新ＦＬＧ.<p>
	 *
	 */
	public void trd_d_rmrks_upd_flg(boolean value) {
		setConstBoolean(offset + 30, $trd_d_rmrks_upd_flg, value);
	}


	/**
	 * Update details spare 1 flg. 明細予備１更新ＦＬＧ.<p>
	 *
	 */
	public boolean sub_char1_dtl_upd_flg() {
		return getConstBoolean(offset + 31, $sub_char1_dtl_upd_flg);
	}

	/**
	 * Update details spare 1 flg. 明細予備１更新ＦＬＧ.<p>
	 *
	 */
	public void sub_char1_dtl_upd_flg(boolean value) {
		setConstBoolean(offset + 31, $sub_char1_dtl_upd_flg, value);
	}


	/**
	 * Details spare 2 update flg. 明細予備２更新ＦＬＧ.<p>
	 *
	 */
	public boolean sub_char2_dtl_upd_flg() {
		return getConstBoolean(offset + 32, $sub_char2_dtl_upd_flg);
	}

	/**
	 * Details spare 2 update flg. 明細予備２更新ＦＬＧ.<p>
	 *
	 */
	public void sub_char2_dtl_upd_flg(boolean value) {
		setConstBoolean(offset + 32, $sub_char2_dtl_upd_flg, value);
	}


	/**
	 * Details spare 3 update flg. 明細予備３更新ＦＬＧ.<p>
	 *
	 */
	public boolean sub_char3_dtl_upd_flg() {
		return getConstBoolean(offset + 33, $sub_char3_dtl_upd_flg);
	}

	/**
	 * Details spare 3 update flg. 明細予備３更新ＦＬＧ.<p>
	 *
	 */
	public void sub_char3_dtl_upd_flg(boolean value) {
		setConstBoolean(offset + 33, $sub_char3_dtl_upd_flg, value);
	}


	/**
	 * GR factory/distribution warehouse cd. 入庫工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String gr_site_cd() {
		return getConstString(offset + 34, $gr_site_cd);
	}

	/**
	 * GR factory/distribution warehouse cd. 入庫工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void gr_site_cd(String value) {
		setConstString(offset + 34, $gr_site_cd, value);
	}


	/**
	 * GI factory/distribution warehouse cd. 出庫工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String gi_site_cd() {
		return getConstString(offset + 35, $gi_site_cd);
	}

	/**
	 * GI factory/distribution warehouse cd. 出庫工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void gi_site_cd(String value) {
		setConstString(offset + 35, $gi_site_cd, value);
	}


	/**
	 * GR supplier cd. 入庫発注先ＣＤ.<p>
	 *
	 */
	public String gr_sppl_cd() {
		return getConstString(offset + 36, $gr_sppl_cd);
	}

	/**
	 * GR supplier cd. 入庫発注先ＣＤ.<p>
	 *
	 */
	public void gr_sppl_cd(String value) {
		setConstString(offset + 36, $gr_sppl_cd, value);
	}


	/**
	 * GR chargeable supplier flg. 入庫有償支給先ＦＬＧ.<p>
	 *
	 */
	public boolean gr_onr_prsppl_flg() {
		return getConstBoolean(offset + 37, $gr_onr_prsppl_flg);
	}

	/**
	 * GR chargeable supplier flg. 入庫有償支給先ＦＬＧ.<p>
	 *
	 */
	public void gr_onr_prsppl_flg(boolean value) {
		setConstBoolean(offset + 37, $gr_onr_prsppl_flg, value);
	}


	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public String lot_mng_typ() {
		return getConstString(offset + 38, $lot_mng_typ);
	}

	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public void lot_mng_typ(String value) {
		setConstString(offset + 38, $lot_mng_typ, value);
	}


	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public String sublot_mng_typ() {
		return getConstString(offset + 39, $sublot_mng_typ);
	}

	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public void sublot_mng_typ(String value) {
		setConstString(offset + 39, $sublot_mng_typ, value);
	}


	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public String asset_mng_typ() {
		return getConstString(offset + 40, $asset_mng_typ);
	}

	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public void asset_mng_typ(String value) {
		setConstString(offset + 40, $asset_mng_typ, value);
	}


	/**
	 * GI WG cd. 出庫ワーキンググループＣＤ.<p>
	 *
	 */
	public String gi_wg_cd() {
		return getConstString(offset + 41, $gi_wg_cd);
	}

	/**
	 * GI WG cd. 出庫ワーキンググループＣＤ.<p>
	 *
	 */
	public void gi_wg_cd(String value) {
		setConstString(offset + 41, $gi_wg_cd, value);
	}


	/**
	 * GI distribution group cd. 出庫物流グループＣＤ.<p>
	 *
	 */
	public String gi_lg_grp_cd() {
		return getConstString(offset + 42, $gi_lg_grp_cd);
	}

	/**
	 * GI distribution group cd. 出庫物流グループＣＤ.<p>
	 *
	 */
	public void gi_lg_grp_cd(String value) {
		setConstString(offset + 42, $gi_lg_grp_cd, value);
	}


	/**
	 * GI supplier cd. 出庫発注先ＣＤ.<p>
	 *
	 */
	public String gi_sppl_cd() {
		return getConstString(offset + 43, $gi_sppl_cd);
	}

	/**
	 * GI supplier cd. 出庫発注先ＣＤ.<p>
	 *
	 */
	public void gi_sppl_cd(String value) {
		setConstString(offset + 43, $gi_sppl_cd, value);
	}


	/**
	 * Other accounting GI 他勘定出庫.<p>
	 *
	 */
	public boolean acxfr_gi_flg() {
		return getConstBoolean(offset + 44, $acxfr_gi_flg);
	}

	/**
	 * Other accounting GI 他勘定出庫.<p>
	 *
	 */
	public void acxfr_gi_flg(boolean value) {
		setConstBoolean(offset + 44, $acxfr_gi_flg, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return trd_unit_rnd_typ();
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_rnd_typ();
		}
		if ($prov_schd_no.equalsIgnoreCase(name)) {
			return prov_schd_no();
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			return prov_typ();
		}
		if ($ret_prov_schd_no.equalsIgnoreCase(name)) {
			return ret_prov_schd_no();
		}
		if ($ret_prov_typ.equalsIgnoreCase(name)) {
			return ret_prov_typ();
		}
		if ($gr_site_cd.equalsIgnoreCase(name)) {
			return gr_site_cd();
		}
		if ($gi_site_cd.equalsIgnoreCase(name)) {
			return gi_site_cd();
		}
		if ($gr_sppl_cd.equalsIgnoreCase(name)) {
			return gr_sppl_cd();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		if ($gi_wg_cd.equalsIgnoreCase(name)) {
			return gi_wg_cd();
		}
		if ($gi_lg_grp_cd.equalsIgnoreCase(name)) {
			return gi_lg_grp_cd();
		}
		if ($gi_sppl_cd.equalsIgnoreCase(name)) {
			return gi_sppl_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_base_qty();
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_qty();
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($alloc_sts_upd_cntr.equalsIgnoreCase(name)) {
			return alloc_sts_upd_cntr();
		}
		if ($inst_upd_cntr.equalsIgnoreCase(name)) {
			return inst_upd_cntr();
		}
		if ($act_upd_cntr.equalsIgnoreCase(name)) {
			return act_upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($immd_dlv_prnt_flg.equalsIgnoreCase(name)) {
			return immd_dlv_prnt_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($act_usr_cd_upd_flg.equalsIgnoreCase(name)) {
			return act_usr_cd_upd_flg();
		}
		if ($act_dpt_cd_upd_flg.equalsIgnoreCase(name)) {
			return act_dpt_cd_upd_flg();
		}
		if ($intr_rmrks_upd_flg.equalsIgnoreCase(name)) {
			return intr_rmrks_upd_flg();
		}
		if ($trd_rmrks_upd_flg.equalsIgnoreCase(name)) {
			return trd_rmrks_upd_flg();
		}
		if ($sub_char1_upd_flg.equalsIgnoreCase(name)) {
			return sub_char1_upd_flg();
		}
		if ($sub_char2_upd_flg.equalsIgnoreCase(name)) {
			return sub_char2_upd_flg();
		}
		if ($sub_char3_upd_flg.equalsIgnoreCase(name)) {
			return sub_char3_upd_flg();
		}
		if ($intr_d_rmrks_upd_flg.equalsIgnoreCase(name)) {
			return intr_d_rmrks_upd_flg();
		}
		if ($trd_d_rmrks_upd_flg.equalsIgnoreCase(name)) {
			return trd_d_rmrks_upd_flg();
		}
		if ($sub_char1_dtl_upd_flg.equalsIgnoreCase(name)) {
			return sub_char1_dtl_upd_flg();
		}
		if ($sub_char2_dtl_upd_flg.equalsIgnoreCase(name)) {
			return sub_char2_dtl_upd_flg();
		}
		if ($sub_char3_dtl_upd_flg.equalsIgnoreCase(name)) {
			return sub_char3_dtl_upd_flg();
		}
		if ($gr_onr_prsppl_flg.equalsIgnoreCase(name)) {
			return gr_onr_prsppl_flg();
		}
		if ($acxfr_gi_flg.equalsIgnoreCase(name)) {
			return acxfr_gi_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return trd_unit_rnd_typ();
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_rnd_typ();
		}
		if ($prov_schd_no.equalsIgnoreCase(name)) {
			return prov_schd_no();
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			return prov_typ();
		}
		if ($ret_prov_schd_no.equalsIgnoreCase(name)) {
			return ret_prov_schd_no();
		}
		if ($ret_prov_typ.equalsIgnoreCase(name)) {
			return ret_prov_typ();
		}
		if ($gr_site_cd.equalsIgnoreCase(name)) {
			return gr_site_cd();
		}
		if ($gi_site_cd.equalsIgnoreCase(name)) {
			return gi_site_cd();
		}
		if ($gr_sppl_cd.equalsIgnoreCase(name)) {
			return gr_sppl_cd();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		if ($gi_wg_cd.equalsIgnoreCase(name)) {
			return gi_wg_cd();
		}
		if ($gi_lg_grp_cd.equalsIgnoreCase(name)) {
			return gi_lg_grp_cd();
		}
		if ($gi_sppl_cd.equalsIgnoreCase(name)) {
			return gi_sppl_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_base_qty();
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_qty();
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($alloc_sts_upd_cntr.equalsIgnoreCase(name)) {
			return alloc_sts_upd_cntr();
		}
		if ($inst_upd_cntr.equalsIgnoreCase(name)) {
			return inst_upd_cntr();
		}
		if ($act_upd_cntr.equalsIgnoreCase(name)) {
			return act_upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($immd_dlv_prnt_flg.equalsIgnoreCase(name)) {
			return immd_dlv_prnt_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($act_usr_cd_upd_flg.equalsIgnoreCase(name)) {
			return act_usr_cd_upd_flg();
		}
		if ($act_dpt_cd_upd_flg.equalsIgnoreCase(name)) {
			return act_dpt_cd_upd_flg();
		}
		if ($intr_rmrks_upd_flg.equalsIgnoreCase(name)) {
			return intr_rmrks_upd_flg();
		}
		if ($trd_rmrks_upd_flg.equalsIgnoreCase(name)) {
			return trd_rmrks_upd_flg();
		}
		if ($sub_char1_upd_flg.equalsIgnoreCase(name)) {
			return sub_char1_upd_flg();
		}
		if ($sub_char2_upd_flg.equalsIgnoreCase(name)) {
			return sub_char2_upd_flg();
		}
		if ($sub_char3_upd_flg.equalsIgnoreCase(name)) {
			return sub_char3_upd_flg();
		}
		if ($intr_d_rmrks_upd_flg.equalsIgnoreCase(name)) {
			return intr_d_rmrks_upd_flg();
		}
		if ($trd_d_rmrks_upd_flg.equalsIgnoreCase(name)) {
			return trd_d_rmrks_upd_flg();
		}
		if ($sub_char1_dtl_upd_flg.equalsIgnoreCase(name)) {
			return sub_char1_dtl_upd_flg();
		}
		if ($sub_char2_dtl_upd_flg.equalsIgnoreCase(name)) {
			return sub_char2_dtl_upd_flg();
		}
		if ($sub_char3_dtl_upd_flg.equalsIgnoreCase(name)) {
			return sub_char3_dtl_upd_flg();
		}
		if ($gr_onr_prsppl_flg.equalsIgnoreCase(name)) {
			return gr_onr_prsppl_flg();
		}
		if ($acxfr_gi_flg.equalsIgnoreCase(name)) {
			return acxfr_gi_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			trd_unit_rnd_typ(value);
			return;
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_rnd_typ(value);
			return;
		}
		if ($prov_schd_no.equalsIgnoreCase(name)) {
			prov_schd_no(value);
			return;
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			prov_typ(value);
			return;
		}
		if ($ret_prov_schd_no.equalsIgnoreCase(name)) {
			ret_prov_schd_no(value);
			return;
		}
		if ($ret_prov_typ.equalsIgnoreCase(name)) {
			ret_prov_typ(value);
			return;
		}
		if ($gr_site_cd.equalsIgnoreCase(name)) {
			gr_site_cd(value);
			return;
		}
		if ($gi_site_cd.equalsIgnoreCase(name)) {
			gi_site_cd(value);
			return;
		}
		if ($gr_sppl_cd.equalsIgnoreCase(name)) {
			gr_sppl_cd(value);
			return;
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			lot_mng_typ(value);
			return;
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			sublot_mng_typ(value);
			return;
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
			return;
		}
		if ($gi_wg_cd.equalsIgnoreCase(name)) {
			gi_wg_cd(value);
			return;
		}
		if ($gi_lg_grp_cd.equalsIgnoreCase(name)) {
			gi_lg_grp_cd(value);
			return;
		}
		if ($gi_sppl_cd.equalsIgnoreCase(name)) {
			gi_sppl_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($alloc_sts_upd_cntr.equalsIgnoreCase(name)) {
			alloc_sts_upd_cntr(value);
			return;
		}
		if ($inst_upd_cntr.equalsIgnoreCase(name)) {
			inst_upd_cntr(value);
			return;
		}
		if ($act_upd_cntr.equalsIgnoreCase(name)) {
			act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($alloc_sts_upd_cntr.equalsIgnoreCase(name)) {
			alloc_sts_upd_cntr(value);
			return;
		}
		if ($inst_upd_cntr.equalsIgnoreCase(name)) {
			inst_upd_cntr(value);
			return;
		}
		if ($act_upd_cntr.equalsIgnoreCase(name)) {
			act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($alloc_sts_upd_cntr.equalsIgnoreCase(name)) {
			alloc_sts_upd_cntr(value);
			return;
		}
		if ($inst_upd_cntr.equalsIgnoreCase(name)) {
			inst_upd_cntr(value);
			return;
		}
		if ($act_upd_cntr.equalsIgnoreCase(name)) {
			act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($alloc_sts_upd_cntr.equalsIgnoreCase(name)) {
			alloc_sts_upd_cntr(value);
			return;
		}
		if ($inst_upd_cntr.equalsIgnoreCase(name)) {
			inst_upd_cntr(value);
			return;
		}
		if ($act_upd_cntr.equalsIgnoreCase(name)) {
			act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($alloc_sts_upd_cntr.equalsIgnoreCase(name)) {
			alloc_sts_upd_cntr(value);
			return;
		}
		if ($inst_upd_cntr.equalsIgnoreCase(name)) {
			inst_upd_cntr(value);
			return;
		}
		if ($act_upd_cntr.equalsIgnoreCase(name)) {
			act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			can_ac_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($immd_dlv_prnt_flg.equalsIgnoreCase(name)) {
			immd_dlv_prnt_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($act_usr_cd_upd_flg.equalsIgnoreCase(name)) {
			act_usr_cd_upd_flg(value);
			return;
		}
		if ($act_dpt_cd_upd_flg.equalsIgnoreCase(name)) {
			act_dpt_cd_upd_flg(value);
			return;
		}
		if ($intr_rmrks_upd_flg.equalsIgnoreCase(name)) {
			intr_rmrks_upd_flg(value);
			return;
		}
		if ($trd_rmrks_upd_flg.equalsIgnoreCase(name)) {
			trd_rmrks_upd_flg(value);
			return;
		}
		if ($sub_char1_upd_flg.equalsIgnoreCase(name)) {
			sub_char1_upd_flg(value);
			return;
		}
		if ($sub_char2_upd_flg.equalsIgnoreCase(name)) {
			sub_char2_upd_flg(value);
			return;
		}
		if ($sub_char3_upd_flg.equalsIgnoreCase(name)) {
			sub_char3_upd_flg(value);
			return;
		}
		if ($intr_d_rmrks_upd_flg.equalsIgnoreCase(name)) {
			intr_d_rmrks_upd_flg(value);
			return;
		}
		if ($trd_d_rmrks_upd_flg.equalsIgnoreCase(name)) {
			trd_d_rmrks_upd_flg(value);
			return;
		}
		if ($sub_char1_dtl_upd_flg.equalsIgnoreCase(name)) {
			sub_char1_dtl_upd_flg(value);
			return;
		}
		if ($sub_char2_dtl_upd_flg.equalsIgnoreCase(name)) {
			sub_char2_dtl_upd_flg(value);
			return;
		}
		if ($sub_char3_dtl_upd_flg.equalsIgnoreCase(name)) {
			sub_char3_dtl_upd_flg(value);
			return;
		}
		if ($gr_onr_prsppl_flg.equalsIgnoreCase(name)) {
			gr_onr_prsppl_flg(value);
			return;
		}
		if ($acxfr_gi_flg.equalsIgnoreCase(name)) {
			acxfr_gi_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			trd_unit_rnd_typ(value);
			return;
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_rnd_typ(value);
			return;
		}
		if ($prov_schd_no.equalsIgnoreCase(name)) {
			prov_schd_no(value);
			return;
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			prov_typ(value);
			return;
		}
		if ($ret_prov_schd_no.equalsIgnoreCase(name)) {
			ret_prov_schd_no(value);
			return;
		}
		if ($ret_prov_typ.equalsIgnoreCase(name)) {
			ret_prov_typ(value);
			return;
		}
		if ($gr_site_cd.equalsIgnoreCase(name)) {
			gr_site_cd(value);
			return;
		}
		if ($gi_site_cd.equalsIgnoreCase(name)) {
			gi_site_cd(value);
			return;
		}
		if ($gr_sppl_cd.equalsIgnoreCase(name)) {
			gr_sppl_cd(value);
			return;
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			lot_mng_typ(value);
			return;
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			sublot_mng_typ(value);
			return;
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
			return;
		}
		if ($gi_wg_cd.equalsIgnoreCase(name)) {
			gi_wg_cd(value);
			return;
		}
		if ($gi_lg_grp_cd.equalsIgnoreCase(name)) {
			gi_lg_grp_cd(value);
			return;
		}
		if ($gi_sppl_cd.equalsIgnoreCase(name)) {
			gi_sppl_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($alloc_sts_upd_cntr.equalsIgnoreCase(name)) {
			alloc_sts_upd_cntr(value);
			return;
		}
		if ($inst_upd_cntr.equalsIgnoreCase(name)) {
			inst_upd_cntr(value);
			return;
		}
		if ($act_upd_cntr.equalsIgnoreCase(name)) {
			act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($alloc_sts_upd_cntr.equalsIgnoreCase(name)) {
			alloc_sts_upd_cntr(value);
			return;
		}
		if ($inst_upd_cntr.equalsIgnoreCase(name)) {
			inst_upd_cntr(value);
			return;
		}
		if ($act_upd_cntr.equalsIgnoreCase(name)) {
			act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($alloc_sts_upd_cntr.equalsIgnoreCase(name)) {
			alloc_sts_upd_cntr(value);
			return;
		}
		if ($inst_upd_cntr.equalsIgnoreCase(name)) {
			inst_upd_cntr(value);
			return;
		}
		if ($act_upd_cntr.equalsIgnoreCase(name)) {
			act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($alloc_sts_upd_cntr.equalsIgnoreCase(name)) {
			alloc_sts_upd_cntr(value);
			return;
		}
		if ($inst_upd_cntr.equalsIgnoreCase(name)) {
			inst_upd_cntr(value);
			return;
		}
		if ($act_upd_cntr.equalsIgnoreCase(name)) {
			act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($alloc_sts_upd_cntr.equalsIgnoreCase(name)) {
			alloc_sts_upd_cntr(value);
			return;
		}
		if ($inst_upd_cntr.equalsIgnoreCase(name)) {
			inst_upd_cntr(value);
			return;
		}
		if ($act_upd_cntr.equalsIgnoreCase(name)) {
			act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			can_ac_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($immd_dlv_prnt_flg.equalsIgnoreCase(name)) {
			immd_dlv_prnt_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($act_usr_cd_upd_flg.equalsIgnoreCase(name)) {
			act_usr_cd_upd_flg(value);
			return;
		}
		if ($act_dpt_cd_upd_flg.equalsIgnoreCase(name)) {
			act_dpt_cd_upd_flg(value);
			return;
		}
		if ($intr_rmrks_upd_flg.equalsIgnoreCase(name)) {
			intr_rmrks_upd_flg(value);
			return;
		}
		if ($trd_rmrks_upd_flg.equalsIgnoreCase(name)) {
			trd_rmrks_upd_flg(value);
			return;
		}
		if ($sub_char1_upd_flg.equalsIgnoreCase(name)) {
			sub_char1_upd_flg(value);
			return;
		}
		if ($sub_char2_upd_flg.equalsIgnoreCase(name)) {
			sub_char2_upd_flg(value);
			return;
		}
		if ($sub_char3_upd_flg.equalsIgnoreCase(name)) {
			sub_char3_upd_flg(value);
			return;
		}
		if ($intr_d_rmrks_upd_flg.equalsIgnoreCase(name)) {
			intr_d_rmrks_upd_flg(value);
			return;
		}
		if ($trd_d_rmrks_upd_flg.equalsIgnoreCase(name)) {
			trd_d_rmrks_upd_flg(value);
			return;
		}
		if ($sub_char1_dtl_upd_flg.equalsIgnoreCase(name)) {
			sub_char1_dtl_upd_flg(value);
			return;
		}
		if ($sub_char2_dtl_upd_flg.equalsIgnoreCase(name)) {
			sub_char2_dtl_upd_flg(value);
			return;
		}
		if ($sub_char3_dtl_upd_flg.equalsIgnoreCase(name)) {
			sub_char3_dtl_upd_flg(value);
			return;
		}
		if ($gr_onr_prsppl_flg.equalsIgnoreCase(name)) {
			gr_onr_prsppl_flg(value);
			return;
		}
		if ($acxfr_gi_flg.equalsIgnoreCase(name)) {
			acxfr_gi_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($xah.equalsIgnoreCase(name)) {
			return xah();
		}
		if ($xad.equalsIgnoreCase(name)) {
			return xad();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($xah.equalsIgnoreCase(name)) {
			xah(
				((MCContainerMeta) xah_META).castInnerRow(mcframe.serverMS.dbc.MST_XFR_ACT_R.class, value)
			);
			return;
		}
		if ($xad.equalsIgnoreCase(name)) {
			xad(
				((MCContainerMeta) xad_META).castInnerRow(mcframe.serverMS.dbc.MST_XFR_ACT_D_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Movement result No. 移動実績ＮＯ.<p>
	 *
	 */
	public String xfr_act_no() {
		return xah().xfr_act_no();
	}

	/**
	 * Movement result No. 移動実績ＮＯ.<p>
	 *
	 */
	public void xfr_act_no(String value) {
		xah().xfr_act_no(value);
	}

	/**
	 * Movement order No. 移動指図ＮＯ.<p>
	 *
	 */
	public String xfr_inst_no() {
		return xah().xfr_inst_no();
	}

	/**
	 * Movement order No. 移動指図ＮＯ.<p>
	 *
	 */
	public void xfr_inst_no(String value) {
		xah().xfr_inst_no(value);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return xah().trd_cd();
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		xah().trd_cd(value);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return xah().trd_ptn_typ();
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		xah().trd_ptn_typ(value);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return xah().wg_cd();
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		xah().wg_cd(value);
	}

	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public String lg_grp_cd() {
		return xah().lg_grp_cd();
	}

	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public void lg_grp_cd(String value) {
		xah().lg_grp_cd(value);
	}

	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public String gr_loc_cd() {
		return xah().gr_loc_cd();
	}

	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public void gr_loc_cd(String value) {
		xah().gr_loc_cd(value);
	}

	/**
	 * GR inventory arriving point cd. 入庫在庫着荷先ＣＤ.<p>
	 *
	 */
	public String gr_stk_arrv_bp_cd() {
		return xah().gr_stk_arrv_bp_cd();
	}

	/**
	 * GR inventory arriving point cd. 入庫在庫着荷先ＣＤ.<p>
	 *
	 */
	public void gr_stk_arrv_bp_cd(String value) {
		xah().gr_stk_arrv_bp_cd(value);
	}

	/**
	 * Movement day 移動日.<p>
	 *
	 */
	public MCDate xfr_dt() {
		return xah().xfr_dt();
	}

	/**
	 * Movement day 移動日.<p>
	 *
	 */
	public void xfr_dt(MCDate value) {
		xah().xfr_dt(value);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return xah().ac_dt();
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		xah().ac_dt(value);
	}

	/**
	 * Implementation PIC cd. 実施担当者ＣＤ.<p>
	 *
	 */
	public String act_usr_cd() {
		return xah().act_usr_cd();
	}

	/**
	 * Implementation PIC cd. 実施担当者ＣＤ.<p>
	 *
	 */
	public void act_usr_cd(String value) {
		xah().act_usr_cd(value);
	}

	/**
	 * Implement dept. cd. 実施部門ＣＤ.<p>
	 *
	 */
	public String act_dpt_cd() {
		return xah().act_dpt_cd();
	}

	/**
	 * Implement dept. cd. 実施部門ＣＤ.<p>
	 *
	 */
	public void act_dpt_cd(String value) {
		xah().act_dpt_cd(value);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return xah().intr_rmrks();
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		xah().intr_rmrks(value);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return xah().trd_rmrks();
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		xah().trd_rmrks(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return xah().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		xah().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return xah().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		xah().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return xah().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		xah().sub_char3(value);
	}

	/**
	 * Movement result details No. 移動実績明細ＮＯ.<p>
	 *
	 */
	public String xfr_act_d_no() {
		return xad().xfr_act_d_no();
	}

	/**
	 * Movement result details No. 移動実績明細ＮＯ.<p>
	 *
	 */
	public void xfr_act_d_no(String value) {
		xad().xfr_act_d_no(value);
	}

	/**
	 * Movement result No. 移動実績ＮＯ.<p>
	 *
	 */
	public String xfr_act_no_dtl() {
		return xad().xfr_act_no();
	}

	/**
	 * Movement result No. 移動実績ＮＯ.<p>
	 *
	 */
	public void xfr_act_no_dtl(String value) {
		xad().xfr_act_no(value);
	}

	/**
	 * Movement allocation status No. 移動引当状況ＮＯ.<p>
	 *
	 */
	public String xfr_alloc_sts_no() {
		return xad().xfr_alloc_sts_no();
	}

	/**
	 * Movement allocation status No. 移動引当状況ＮＯ.<p>
	 *
	 */
	public void xfr_alloc_sts_no(String value) {
		xad().xfr_alloc_sts_no(value);
	}

	/**
	 * Movement order details No. 移動指図明細ＮＯ.<p>
	 *
	 */
	public String xfr_inst_d_no() {
		return xad().xfr_inst_d_no();
	}

	/**
	 * Movement order details No. 移動指図明細ＮＯ.<p>
	 *
	 */
	public void xfr_inst_d_no(String value) {
		xad().xfr_inst_d_no(value);
	}

	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public String gi_loc_cd() {
		return xad().gi_loc_cd();
	}

	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public void gi_loc_cd(String value) {
		xad().gi_loc_cd(value);
	}

	/**
	 * GI rack/line cd. 出庫棚・ラインＣＤ.<p>
	 *
	 */
	public String gi_str_ln_cd() {
		return xad().gi_str_ln_cd();
	}

	/**
	 * GI rack/line cd. 出庫棚・ラインＣＤ.<p>
	 *
	 */
	public void gi_str_ln_cd(String value) {
		xad().gi_str_ln_cd(value);
	}

	/**
	 * GI inventory arriving point cd. 出庫在庫着荷先ＣＤ.<p>
	 *
	 */
	public String gi_stk_arrv_bp_cd() {
		return xad().gi_stk_arrv_bp_cd();
	}

	/**
	 * GI inventory arriving point cd. 出庫在庫着荷先ＣＤ.<p>
	 *
	 */
	public void gi_stk_arrv_bp_cd(String value) {
		xad().gi_stk_arrv_bp_cd(value);
	}

	/**
	 * GR rack/line cd. 入庫棚・ラインＣＤ.<p>
	 *
	 */
	public String gr_str_ln_cd() {
		return xad().gr_str_ln_cd();
	}

	/**
	 * GR rack/line cd. 入庫棚・ラインＣＤ.<p>
	 *
	 */
	public void gr_str_ln_cd(String value) {
		xad().gr_str_ln_cd(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return xad().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		xad().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return xad().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		xad().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return xad().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		xad().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return xad().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		xad().itm_sub3(value);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return xad().lot_no();
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		xad().lot_no(value);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return xad().sublot_no();
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		xad().sublot_no(value);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return xad().sno1();
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		xad().sno1(value);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return xad().sno2();
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		xad().sno2(value);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return xad().sno3();
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		xad().sno3(value);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return xad().sno4();
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		xad().sno4(value);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return xad().gd_cd();
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		xad().gd_cd(value);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return xad().quality_typ();
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		xad().quality_typ(value);
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public String stk_insp_typ() {
		return xad().stk_insp_typ();
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public void stk_insp_typ(String value) {
		xad().stk_insp_typ(value);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return xad().stk_id_typ();
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		xad().stk_id_typ(value);
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public String stk_bp_cd() {
		return xad().stk_bp_cd();
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		xad().stk_bp_cd(value);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return xad().trd_unit_cd();
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		xad().trd_unit_cd(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return xad().trd_unit_qty();
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		xad().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		xad().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		xad().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		xad().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		xad().trd_unit_qty(value);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return xad().base_unit_cd();
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		xad().base_unit_cd(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return xad().base_unit_qty();
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		xad().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		xad().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		xad().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		xad().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		xad().base_unit_qty(value);
	}

	/**
	 * Component check not required at shipping flg. 出荷時構成チェック不要ＦＬＧ.<p>
	 *
	 */
	public boolean skip_chk_ship_flg() {
		return xad().skip_chk_ship_flg();
	}

	/**
	 * Component check not required at shipping flg. 出荷時構成チェック不要ＦＬＧ.<p>
	 *
	 */
	public void skip_chk_ship_flg(boolean value) {
		xad().skip_chk_ship_flg(value);
	}

	/**
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public String rsn_cd() {
		return xad().rsn_cd();
	}

	/**
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public void rsn_cd(String value) {
		xad().rsn_cd(value);
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public String bd_dpt_cd() {
		return xad().bd_dpt_cd();
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		xad().bd_dpt_cd(value);
	}

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public String dlv_slip_no() {
		return xad().dlv_slip_no();
	}

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public void dlv_slip_no(String value) {
		xad().dlv_slip_no(value);
	}

	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public String io_schd_pr_no() {
		return xad().io_schd_pr_no();
	}

	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public void io_schd_pr_no(String value) {
		xad().io_schd_pr_no(value);
	}

	/**
	 * Return-from delivery note No. 返品元納品書ＮＯ.<p>
	 *
	 */
	public String base_dlv_slip_no() {
		return xad().base_dlv_slip_no();
	}

	/**
	 * Return-from delivery note No. 返品元納品書ＮＯ.<p>
	 *
	 */
	public void base_dlv_slip_no(String value) {
		xad().base_dlv_slip_no(value);
	}

	/**
	 * Return-from supply result No. 返品元支給実績ＮＯ.<p>
	 *
	 */
	public String base_prov_act_no() {
		return xad().base_prov_act_no();
	}

	/**
	 * Return-from supply result No. 返品元支給実績ＮＯ.<p>
	 *
	 */
	public void base_prov_act_no(String value) {
		xad().base_prov_act_no(value);
	}

	/**
	 * Supply recording date (Base) 支給計上日（基）.<p>
	 *
	 */
	public MCDate base_ac_dt() {
		return xad().base_ac_dt();
	}

	/**
	 * Supply recording date (Base) 支給計上日（基）.<p>
	 *
	 */
	public void base_ac_dt(MCDate value) {
		xad().base_ac_dt(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return xad().disp_seq();
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		xad().disp_seq(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		xad().disp_seq(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		xad().disp_seq(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		xad().disp_seq(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		xad().disp_seq(value);
	}

	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public String intr_d_rmrks() {
		return xad().intr_d_rmrks();
	}

	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public void intr_d_rmrks(String value) {
		xad().intr_d_rmrks(value);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return xad().trd_d_rmrks();
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		xad().trd_d_rmrks(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1_dtl() {
		return xad().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1_dtl(String value) {
		xad().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2_dtl() {
		return xad().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2_dtl(String value) {
		xad().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3_dtl() {
		return xad().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3_dtl(String value) {
		xad().sub_char3(value);
	}

	/**
	 * WMS ＷＭＳ.<p>
	 *
	 */
	public boolean wms_flg() {
		return xad().wms_flg();
	}

	/**
	 * WMS ＷＭＳ.<p>
	 *
	 */
	public void wms_flg(boolean value) {
		xad().wms_flg(value);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return xad().ext_sys_cd();
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		xad().ext_sys_cd(value);
	}

	/**
	 * External movement result No. 外部移動実績ＮＯ.<p>
	 *
	 */
	public String ext_xfr_act_no() {
		return xad().ext_xfr_act_no();
	}

	/**
	 * External movement result No. 外部移動実績ＮＯ.<p>
	 *
	 */
	public void ext_xfr_act_no(String value) {
		xad().ext_xfr_act_no(value);
	}

}

