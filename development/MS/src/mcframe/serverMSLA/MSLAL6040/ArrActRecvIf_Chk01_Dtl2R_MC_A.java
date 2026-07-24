package mcframe.serverMSLA.MSLAL6040;

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
 * ブロック"ArrActRecvIf_Chk01_Dtl2"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ArrActRecvIf_Chk01_Dtl2R_MC_A extends MCConstRow {

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public static final String $data_lno = "data_lno";
	public static final String $aaIf = "aaIf";

	public static final String $peg_no = $aaIf + ".peg_no";
	public static final String $data_crud_typ = $aaIf + ".data_crud_typ";
	public static final String $arr_act_no = $aaIf + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$arr_act_no + "";
	public static final String $arr_schd_no = $aaIf + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$arr_schd_no + "";
	public static final String $trd_cd = $aaIf + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$trd_cd + "";
	public static final String $trd_ptn_typ = $aaIf + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$trd_ptn_typ + "";
	public static final String $purc_act_io_no = $aaIf + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$purc_act_io_no + "";
	public static final String $arr_tm = $aaIf + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$arr_tm + "";
	public static final String $ac_dt = $aaIf + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$ac_dt + "";
	public static final String $arr_loc_cd = $aaIf + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$arr_loc_cd + "";
	public static final String $str_ln_cd = $aaIf + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$str_ln_cd + "";
	public static final String $arr_dpt_cd = $aaIf + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$arr_dpt_cd + "";
	public static final String $arr_usr_cd = $aaIf + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$arr_usr_cd + "";
	public static final String $itm_cd = $aaIf + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$itm_cd + "";
	public static final String $itm_sub1 = $aaIf + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$itm_sub1 + "";
	public static final String $itm_sub2 = $aaIf + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$itm_sub2 + "";
	public static final String $itm_sub3 = $aaIf + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$itm_sub3 + "";
	public static final String $itm_nm = $aaIf + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$itm_nm + "";
	public static final String $rcpt_iv_itm_nm = $aaIf + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$rcpt_iv_itm_nm + "";
	public static final String $sundry_itm_flg = $aaIf + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$sundry_itm_flg + "";
	public static final String $purc_id_typ = $aaIf + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$purc_id_typ + "";
	public static final String $stk_mng_typ = $aaIf + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$stk_mng_typ + "";
	public static final String $sno1 = $aaIf + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$sno1 + "";
	public static final String $sno2 = $aaIf + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$sno2 + "";
	public static final String $sno3 = $aaIf + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$sno3 + "";
	public static final String $sno4 = $aaIf + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$sno4 + "";
	public static final String $lot_no = $aaIf + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$lot_no + "";
	public static final String $sublot_no = $aaIf + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$sublot_no + "";
	public static final String $ver_no = $aaIf + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$ver_no + "";
	public static final String $stk_arrv_bp_cd = $aaIf + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$stk_arrv_bp_cd + "";
	public static final String $gd_cd = $aaIf + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$gd_cd + "";
	public static final String $quality_typ = $aaIf + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$quality_typ + "";
	public static final String $stk_insp_typ = $aaIf + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$stk_insp_typ + "";
	public static final String $stk_id_typ = $aaIf + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$stk_id_typ + "";
	public static final String $stk_bp_cd = $aaIf + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$stk_bp_cd + "";
	public static final String $sppl_itm_cd = $aaIf + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$sppl_itm_cd + "";
	public static final String $sppl_itm_nm = $aaIf + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$sppl_itm_nm + "";
	public static final String $cst_cd = $aaIf + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$cst_cd + "";
	public static final String $sppl_cd = $aaIf + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$sppl_cd + "";
	public static final String $maker_cd = $aaIf + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$maker_cd + "";
	public static final String $bp_lot_no = $aaIf + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$bp_lot_no + "";
	public static final String $bp_dlv_slip_no = $aaIf + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$bp_dlv_slip_no + "";
	public static final String $bp_dlv_slip_d_no = $aaIf + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$bp_dlv_slip_d_no + "";
	public static final String $ship_fr_valid_dt = $aaIf + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$ship_fr_valid_dt + "";
	public static final String $trd_unit_qty = $aaIf + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$trd_unit_qty + "";
	public static final String $trd_unit_cd = $aaIf + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$trd_unit_cd + "";
	public static final String $base_unit_qty = $aaIf + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$base_unit_qty + "";
	public static final String $base_unit_cd = $aaIf + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$base_unit_cd + "";
	public static final String $purc_cont_qty = $aaIf + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$purc_cont_qty + "";
	public static final String $rsn_cd = $aaIf + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$rsn_cd + "";
	public static final String $bd_dpt_cd = $aaIf + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$bd_dpt_cd + "";
	public static final String $sync_flg = $aaIf + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$sync_flg + "";
	public static final String $edi_flg = $aaIf + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$edi_flg + "";
	public static final String $insp_cnt_rmrks = $aaIf + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$insp_cnt_rmrks + "";
	public static final String $intr_rmrks = $aaIf + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$intr_rmrks + "";
	public static final String $trd_rmrks = $aaIf + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$trd_rmrks + "";
	public static final String $trd_d_rmrks = $aaIf + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$trd_d_rmrks + "";
	public static final String $sub_char1 = $aaIf + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$sub_char1 + "";
	public static final String $sub_char2 = $aaIf + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$sub_char2 + "";
	public static final String $sub_char3 = $aaIf + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$sub_char3 + "";
	public static final String $can_ac_dt = $aaIf + ".can_ac_dt";
	public static final String $arr_pr_no = $aaIf + ".arr_pr_no";
	public static final String $rcpt_iv_no = $aaIf + ".rcpt_iv_no";
	public static final String $iv_no = $aaIf + ".iv_no";
	public static final String $arr_ptn_typ = $aaIf + ".arr_ptn_typ";
	public static final String $abort_flg = $aaIf + ".abort_flg";
	public static final String $crt_lot_flg = $aaIf + ".crt_lot_flg";
	public static final String $same_lot_flg = $aaIf + ".same_lot_flg";
	public static final String $mfg_inst_no = $aaIf + ".mfg_inst_no";
	public static final String $pre_outsrc_act_flg = $aaIf + ".pre_outsrc_act_flg";
	public static final String $prnt_flg = $aaIf + ".prnt_flg";
	public static final String $cststk_flg = $aaIf + ".cststk_flg";
	public static final String $arr_pr_upd_cntr = $aaIf + ".arr_pr_upd_cntr";
	public static final String $arr_act_upd_cntr = $aaIf + ".arr_act_upd_cntr";
	public static final String $arr_dpt_cd_upd_flg = $aaIf + ".arr_dpt_cd_upd_flg";
	public static final String $arr_usr_cd_upd_flg = $aaIf + ".arr_usr_cd_upd_flg";
	public static final String $sno1_upd_flg = $aaIf + ".sno1_upd_flg";
	public static final String $sno2_upd_flg = $aaIf + ".sno2_upd_flg";
	public static final String $sno3_upd_flg = $aaIf + ".sno3_upd_flg";
	public static final String $sno4_upd_flg = $aaIf + ".sno4_upd_flg";
	public static final String $lot_no_upd_flg = $aaIf + ".lot_no_upd_flg";
	public static final String $sublot_no_upd_flg = $aaIf + ".sublot_no_upd_flg";
	public static final String $ver_no_upd_flg = $aaIf + ".ver_no_upd_flg";
	public static final String $stk_arrv_bp_cd_upd_flg = $aaIf + ".stk_arrv_bp_cd_upd_flg";
	public static final String $gd_cd_upd_flg = $aaIf + ".gd_cd_upd_flg";
	public static final String $quality_typ_upd_flg = $aaIf + ".quality_typ_upd_flg";
	public static final String $stk_insp_typ_upd_flg = $aaIf + ".stk_insp_typ_upd_flg";
	public static final String $stk_id_typ_upd_flg = $aaIf + ".stk_id_typ_upd_flg";
	public static final String $stk_bp_cd_upd_flg = $aaIf + ".stk_bp_cd_upd_flg";
	public static final String $sppl_itm_cd_upd_flg = $aaIf + ".sppl_itm_cd_upd_flg";
	public static final String $sppl_itm_nm_upd_flg = $aaIf + ".sppl_itm_nm_upd_flg";
	public static final String $maker_cd_upd_flg = $aaIf + ".maker_cd_upd_flg";
	public static final String $bp_lot_no_upd_flg = $aaIf + ".bp_lot_no_upd_flg";
	public static final String $bp_dlv_slip_no_upd_flg = $aaIf + ".bp_dlv_slip_no_upd_flg";
	public static final String $bp_dlv_slip_d_no_upd_flg = $aaIf + ".bp_dlv_slip_d_no_upd_flg";
	public static final String $ship_fr_valid_dt_upd_flg = $aaIf + ".ship_fr_valid_dt_upd_flg";
	public static final String $purc_cont_qty_upd_flg = $aaIf + ".purc_cont_qty_upd_flg";
	public static final String $insp_cnt_rmrks_upd_flg = $aaIf + ".insp_cnt_rmrks_upd_flg";
	public static final String $intr_rmrks_upd_flg = $aaIf + ".intr_rmrks_upd_flg";
	public static final String $trd_rmrks_upd_flg = $aaIf + ".trd_rmrks_upd_flg";
	public static final String $trd_d_rmrks_upd_flg = $aaIf + ".trd_d_rmrks_upd_flg";
	public static final String $sub_char1_upd_flg = $aaIf + ".sub_char1_upd_flg";
	public static final String $sub_char2_upd_flg = $aaIf + ".sub_char2_upd_flg";
	public static final String $sub_char3_upd_flg = $aaIf + ".sub_char3_upd_flg";
	public static final String $arr_pr_no_upd_flg = $aaIf + ".arr_pr_no_upd_flg";
	public static final String $iv_no_upd_flg = $aaIf + ".iv_no_upd_flg";

	public static final MCMeta data_lno_META = createCommonMeta($data_lno, mcframe.commonMA.meta.MA_META.IF_DATA_LNO);
	public static final MCMeta aaIf_META = createInnerRowMeta($aaIf, mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.class);

	protected static final ConstMetaList<ArrActRecvIf_Chk01_Dtl2R> constMetas = new ConstMetaList<ArrActRecvIf_Chk01_Dtl2R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			data_lno_META,
			aaIf_META
		},
		new String[][]{
			{
				"peg_no",
				"data_crud_typ",
				"arr_act_no",
				"arr_schd_no",
				"trd_cd",
				"trd_ptn_typ",
				"purc_act_io_no",
				"arr_tm",
				"ac_dt",
				"arr_loc_cd",
				"str_ln_cd",
				"arr_dpt_cd",
				"arr_usr_cd",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"rcpt_iv_itm_nm",
				"sundry_itm_flg",
				"purc_id_typ",
				"stk_mng_typ",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"lot_no",
				"sublot_no",
				"ver_no",
				"stk_arrv_bp_cd",
				"gd_cd",
				"quality_typ",
				"stk_insp_typ",
				"stk_id_typ",
				"stk_bp_cd",
				"sppl_itm_cd",
				"sppl_itm_nm",
				"cst_cd",
				"sppl_cd",
				"maker_cd",
				"bp_lot_no",
				"bp_dlv_slip_no",
				"bp_dlv_slip_d_no",
				"ship_fr_valid_dt",
				"trd_unit_qty",
				"trd_unit_cd",
				"base_unit_qty",
				"base_unit_cd",
				"purc_cont_qty",
				"rsn_cd",
				"bd_dpt_cd",
				"sync_flg",
				"edi_flg",
				"insp_cnt_rmrks",
				"intr_rmrks",
				"trd_rmrks",
				"trd_d_rmrks",
				"sub_char1",
				"sub_char2",
				"sub_char3",
				"can_ac_dt",
				"arr_pr_no",
				"rcpt_iv_no",
				"iv_no",
				"arr_ptn_typ",
				"abort_flg",
				"crt_lot_flg",
				"same_lot_flg",
				"mfg_inst_no",
				"pre_outsrc_act_flg",
				"prnt_flg",
				"cststk_flg",
				"arr_pr_upd_cntr",
				"arr_act_upd_cntr",
				"arr_dpt_cd_upd_flg",
				"arr_usr_cd_upd_flg",
				"sno1_upd_flg",
				"sno2_upd_flg",
				"sno3_upd_flg",
				"sno4_upd_flg",
				"lot_no_upd_flg",
				"sublot_no_upd_flg",
				"ver_no_upd_flg",
				"stk_arrv_bp_cd_upd_flg",
				"gd_cd_upd_flg",
				"quality_typ_upd_flg",
				"stk_insp_typ_upd_flg",
				"stk_id_typ_upd_flg",
				"stk_bp_cd_upd_flg",
				"sppl_itm_cd_upd_flg",
				"sppl_itm_nm_upd_flg",
				"maker_cd_upd_flg",
				"bp_lot_no_upd_flg",
				"bp_dlv_slip_no_upd_flg",
				"bp_dlv_slip_d_no_upd_flg",
				"ship_fr_valid_dt_upd_flg",
				"purc_cont_qty_upd_flg",
				"insp_cnt_rmrks_upd_flg",
				"intr_rmrks_upd_flg",
				"trd_rmrks_upd_flg",
				"trd_d_rmrks_upd_flg",
				"sub_char1_upd_flg",
				"sub_char2_upd_flg",
				"sub_char3_upd_flg",
				"arr_pr_no_upd_flg",
				"iv_no_upd_flg"
			},
			{
				$peg_no,
				$data_crud_typ,
				$arr_act_no,
				$arr_schd_no,
				$trd_cd,
				$trd_ptn_typ,
				$purc_act_io_no,
				$arr_tm,
				$ac_dt,
				$arr_loc_cd,
				$str_ln_cd,
				$arr_dpt_cd,
				$arr_usr_cd,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$rcpt_iv_itm_nm,
				$sundry_itm_flg,
				$purc_id_typ,
				$stk_mng_typ,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$lot_no,
				$sublot_no,
				$ver_no,
				$stk_arrv_bp_cd,
				$gd_cd,
				$quality_typ,
				$stk_insp_typ,
				$stk_id_typ,
				$stk_bp_cd,
				$sppl_itm_cd,
				$sppl_itm_nm,
				$cst_cd,
				$sppl_cd,
				$maker_cd,
				$bp_lot_no,
				$bp_dlv_slip_no,
				$bp_dlv_slip_d_no,
				$ship_fr_valid_dt,
				$trd_unit_qty,
				$trd_unit_cd,
				$base_unit_qty,
				$base_unit_cd,
				$purc_cont_qty,
				$rsn_cd,
				$bd_dpt_cd,
				$sync_flg,
				$edi_flg,
				$insp_cnt_rmrks,
				$intr_rmrks,
				$trd_rmrks,
				$trd_d_rmrks,
				$sub_char1,
				$sub_char2,
				$sub_char3,
				$can_ac_dt,
				$arr_pr_no,
				$rcpt_iv_no,
				$iv_no,
				$arr_ptn_typ,
				$abort_flg,
				$crt_lot_flg,
				$same_lot_flg,
				$mfg_inst_no,
				$pre_outsrc_act_flg,
				$prnt_flg,
				$cststk_flg,
				$arr_pr_upd_cntr,
				$arr_act_upd_cntr,
				$arr_dpt_cd_upd_flg,
				$arr_usr_cd_upd_flg,
				$sno1_upd_flg,
				$sno2_upd_flg,
				$sno3_upd_flg,
				$sno4_upd_flg,
				$lot_no_upd_flg,
				$sublot_no_upd_flg,
				$ver_no_upd_flg,
				$stk_arrv_bp_cd_upd_flg,
				$gd_cd_upd_flg,
				$quality_typ_upd_flg,
				$stk_insp_typ_upd_flg,
				$stk_id_typ_upd_flg,
				$stk_bp_cd_upd_flg,
				$sppl_itm_cd_upd_flg,
				$sppl_itm_nm_upd_flg,
				$maker_cd_upd_flg,
				$bp_lot_no_upd_flg,
				$bp_dlv_slip_no_upd_flg,
				$bp_dlv_slip_d_no_upd_flg,
				$ship_fr_valid_dt_upd_flg,
				$purc_cont_qty_upd_flg,
				$insp_cnt_rmrks_upd_flg,
				$intr_rmrks_upd_flg,
				$trd_rmrks_upd_flg,
				$trd_d_rmrks_upd_flg,
				$sub_char1_upd_flg,
				$sub_char2_upd_flg,
				$sub_char3_upd_flg,
				$arr_pr_no_upd_flg,
				$iv_no_upd_flg
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
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
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
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
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
	protected ArrActRecvIf_Chk01_Dtl2R_MC_A(ConstMetaList<? extends ArrActRecvIf_Chk01_Dtl2R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ArrActRecvIf_Chk01_Dtl2R clone() {
		return (ArrActRecvIf_Chk01_Dtl2R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ArrActRecvIf_Chk01_Dtl2R createInstance() {
		return (ArrActRecvIf_Chk01_Dtl2R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ArrActRecvIf_Chk01_Dtl2R getValues(String... names) {
		return (ArrActRecvIf_Chk01_Dtl2R) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public MCNumber data_lno() {
		return getConstNumber(offset + 0, $data_lno);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(MCNumber value) {
		setConstNumber(offset + 0, $data_lno, value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(int value) {
		setConstNumber(offset + 0, $data_lno, value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(long value) {
		setConstNumber(offset + 0, $data_lno, value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(float value) {
		setConstNumber(offset + 0, $data_lno, value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(double value) {
		setConstNumber(offset + 0, $data_lno, value);
	}


	public mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR aaIf(){
		return (mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR) getConstInnerRow(offset + 1, $aaIf);
	}
	
	public void aaIf(mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR row){
		setConstInnerRow(offset + 1, $aaIf, row);
	}


	public MCNumber getNumber(String name) {
		if ($data_lno.equalsIgnoreCase(name)) {
			return data_lno();
		}
		return super.getNumber(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($data_lno.equalsIgnoreCase(name)) {
			return data_lno();
		}
		return super.getNumberNE(name);
	}

	public void setNumber(String name, MCNumber value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($aaIf.equalsIgnoreCase(name)) {
			return aaIf();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($aaIf.equalsIgnoreCase(name)) {
			aaIf(
				((MCContainerMeta) aaIf_META).castInnerRow(mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Data pegging No. データ紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return aaIf().peg_no();
	}

	/**
	 * Data pegging No. データ紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		aaIf().peg_no(value);
	}

	/**
	 * Data pegging No. データ紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		aaIf().peg_no(value);
	}

	/**
	 * Data pegging No. データ紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		aaIf().peg_no(value);
	}

	/**
	 * Data pegging No. データ紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		aaIf().peg_no(value);
	}

	/**
	 * Data pegging No. データ紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		aaIf().peg_no(value);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return aaIf().data_crud_typ();
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		aaIf().data_crud_typ(value);
	}

	/**
	 * Receipt result No. 入荷実績ＮＯ.<p>
	 *
	 */
	public String arr_act_no() {
		return aaIf().arr_act_no();
	}

	/**
	 * Receipt result No. 入荷実績ＮＯ.<p>
	 *
	 */
	public void arr_act_no(String value) {
		aaIf().arr_act_no(value);
	}

	/**
	 * Receipt schedule No. 入荷予定ＮＯ.<p>
	 *
	 */
	public String arr_schd_no() {
		return aaIf().arr_schd_no();
	}

	/**
	 * Receipt schedule No. 入荷予定ＮＯ.<p>
	 *
	 */
	public void arr_schd_no(String value) {
		aaIf().arr_schd_no(value);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return aaIf().trd_cd();
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		aaIf().trd_cd(value);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return aaIf().trd_ptn_typ();
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		aaIf().trd_ptn_typ(value);
	}

	/**
	 * Purchase result GR/GI No. 仕入実績受払ＮＯ.<p>
	 *
	 */
	public String purc_act_io_no() {
		return aaIf().purc_act_io_no();
	}

	/**
	 * Purchase result GR/GI No. 仕入実績受払ＮＯ.<p>
	 *
	 */
	public void purc_act_io_no(String value) {
		aaIf().purc_act_io_no(value);
	}

	/**
	 * Receipt date and time 入荷日時.<p>
	 *
	 */
	public MCDate arr_tm() {
		return aaIf().arr_tm();
	}

	/**
	 * Receipt date and time 入荷日時.<p>
	 *
	 */
	public void arr_tm(MCDate value) {
		aaIf().arr_tm(value);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return aaIf().ac_dt();
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		aaIf().ac_dt(value);
	}

	/**
	 * Receipt location cd. 入荷場所ＣＤ.<p>
	 *
	 */
	public String arr_loc_cd() {
		return aaIf().arr_loc_cd();
	}

	/**
	 * Receipt location cd. 入荷場所ＣＤ.<p>
	 *
	 */
	public void arr_loc_cd(String value) {
		aaIf().arr_loc_cd(value);
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return aaIf().str_ln_cd();
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		aaIf().str_ln_cd(value);
	}

	/**
	 * Receipt dept. cd. 入荷部門ＣＤ.<p>
	 *
	 */
	public String arr_dpt_cd() {
		return aaIf().arr_dpt_cd();
	}

	/**
	 * Receipt dept. cd. 入荷部門ＣＤ.<p>
	 *
	 */
	public void arr_dpt_cd(String value) {
		aaIf().arr_dpt_cd(value);
	}

	/**
	 * Receipt PIC cd. 入荷担当者ＣＤ.<p>
	 *
	 */
	public String arr_usr_cd() {
		return aaIf().arr_usr_cd();
	}

	/**
	 * Receipt PIC cd. 入荷担当者ＣＤ.<p>
	 *
	 */
	public void arr_usr_cd(String value) {
		aaIf().arr_usr_cd(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return aaIf().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		aaIf().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return aaIf().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		aaIf().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return aaIf().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		aaIf().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return aaIf().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		aaIf().itm_sub3(value);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return aaIf().itm_nm();
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		aaIf().itm_nm(value);
	}

	/**
	 * Item name for purchase invoice 受領インボイス表記品名.<p>
	 *
	 */
	public String rcpt_iv_itm_nm() {
		return aaIf().rcpt_iv_itm_nm();
	}

	/**
	 * Item name for purchase invoice 受領インボイス表記品名.<p>
	 *
	 */
	public void rcpt_iv_itm_nm(String value) {
		aaIf().rcpt_iv_itm_nm(value);
	}

	/**
	 * Miscellaneous item flg. 諸口品ＦＬＧ.<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return aaIf().sundry_itm_flg();
	}

	/**
	 * Miscellaneous item flg. 諸口品ＦＬＧ.<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		aaIf().sundry_itm_flg(value);
	}

	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public String purc_id_typ() {
		return aaIf().purc_id_typ();
	}

	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public void purc_id_typ(String value) {
		aaIf().purc_id_typ(value);
	}

	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public String stk_mng_typ() {
		return aaIf().stk_mng_typ();
	}

	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public void stk_mng_typ(String value) {
		aaIf().stk_mng_typ(value);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return aaIf().sno1();
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		aaIf().sno1(value);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return aaIf().sno2();
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		aaIf().sno2(value);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return aaIf().sno3();
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		aaIf().sno3(value);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return aaIf().sno4();
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		aaIf().sno4(value);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return aaIf().lot_no();
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		aaIf().lot_no(value);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return aaIf().sublot_no();
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		aaIf().sublot_no(value);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return aaIf().ver_no();
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		aaIf().ver_no(value);
	}

	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public String stk_arrv_bp_cd() {
		return aaIf().stk_arrv_bp_cd();
	}

	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public void stk_arrv_bp_cd(String value) {
		aaIf().stk_arrv_bp_cd(value);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return aaIf().gd_cd();
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		aaIf().gd_cd(value);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return aaIf().quality_typ();
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		aaIf().quality_typ(value);
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public String stk_insp_typ() {
		return aaIf().stk_insp_typ();
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public void stk_insp_typ(String value) {
		aaIf().stk_insp_typ(value);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return aaIf().stk_id_typ();
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		aaIf().stk_id_typ(value);
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public String stk_bp_cd() {
		return aaIf().stk_bp_cd();
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		aaIf().stk_bp_cd(value);
	}

	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public String sppl_itm_cd() {
		return aaIf().sppl_itm_cd();
	}

	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public void sppl_itm_cd(String value) {
		aaIf().sppl_itm_cd(value);
	}

	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public String sppl_itm_nm() {
		return aaIf().sppl_itm_nm();
	}

	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public void sppl_itm_nm(String value) {
		aaIf().sppl_itm_nm(value);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return aaIf().cst_cd();
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		aaIf().cst_cd(value);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return aaIf().sppl_cd();
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		aaIf().sppl_cd(value);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return aaIf().maker_cd();
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		aaIf().maker_cd(value);
	}

	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public String bp_lot_no() {
		return aaIf().bp_lot_no();
	}

	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public void bp_lot_no(String value) {
		aaIf().bp_lot_no(value);
	}

	/**
	 * Vendor delivery note No. 業者納品書ＮＯ.<p>
	 *
	 */
	public String bp_dlv_slip_no() {
		return aaIf().bp_dlv_slip_no();
	}

	/**
	 * Vendor delivery note No. 業者納品書ＮＯ.<p>
	 *
	 */
	public void bp_dlv_slip_no(String value) {
		aaIf().bp_dlv_slip_no(value);
	}

	/**
	 * Vendor delivery note details No. 業者納品書明細ＮＯ.<p>
	 *
	 */
	public String bp_dlv_slip_d_no() {
		return aaIf().bp_dlv_slip_d_no();
	}

	/**
	 * Vendor delivery note details No. 業者納品書明細ＮＯ.<p>
	 *
	 */
	public void bp_dlv_slip_d_no(String value) {
		aaIf().bp_dlv_slip_d_no(value);
	}

	/**
	 * Shipping point deadline 出荷元期限.<p>
	 *
	 */
	public MCDate ship_fr_valid_dt() {
		return aaIf().ship_fr_valid_dt();
	}

	/**
	 * Shipping point deadline 出荷元期限.<p>
	 *
	 */
	public void ship_fr_valid_dt(MCDate value) {
		aaIf().ship_fr_valid_dt(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return aaIf().trd_unit_qty();
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		aaIf().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		aaIf().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		aaIf().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		aaIf().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		aaIf().trd_unit_qty(value);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return aaIf().trd_unit_cd();
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		aaIf().trd_unit_cd(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return aaIf().base_unit_qty();
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		aaIf().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		aaIf().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		aaIf().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		aaIf().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		aaIf().base_unit_qty(value);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return aaIf().base_unit_cd();
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		aaIf().base_unit_cd(value);
	}

	/**
	 * Purchase active ingredient 仕入有効成分.<p>
	 *
	 */
	public MCNumber purc_cont_qty() {
		return aaIf().purc_cont_qty();
	}

	/**
	 * Purchase active ingredient 仕入有効成分.<p>
	 *
	 */
	public void purc_cont_qty(MCNumber value) {
		aaIf().purc_cont_qty(value);
	}

	/**
	 * Purchase active ingredient 仕入有効成分.<p>
	 *
	 */
	public void purc_cont_qty(int value) {
		aaIf().purc_cont_qty(value);
	}

	/**
	 * Purchase active ingredient 仕入有効成分.<p>
	 *
	 */
	public void purc_cont_qty(long value) {
		aaIf().purc_cont_qty(value);
	}

	/**
	 * Purchase active ingredient 仕入有効成分.<p>
	 *
	 */
	public void purc_cont_qty(float value) {
		aaIf().purc_cont_qty(value);
	}

	/**
	 * Purchase active ingredient 仕入有効成分.<p>
	 *
	 */
	public void purc_cont_qty(double value) {
		aaIf().purc_cont_qty(value);
	}

	/**
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public String rsn_cd() {
		return aaIf().rsn_cd();
	}

	/**
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public void rsn_cd(String value) {
		aaIf().rsn_cd(value);
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public String bd_dpt_cd() {
		return aaIf().bd_dpt_cd();
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		aaIf().bd_dpt_cd(value);
	}

	/**
	 * Simultaneous recording flg. 同時計上ＦＬＧ.<p>
	 *
	 */
	public boolean sync_flg() {
		return aaIf().sync_flg();
	}

	/**
	 * Simultaneous recording flg. 同時計上ＦＬＧ.<p>
	 *
	 */
	public void sync_flg(boolean value) {
		aaIf().sync_flg(value);
	}

	/**
	 * EDI flg. ＥＤＩＦＬＧ.<p>
	 *
	 */
	public boolean edi_flg() {
		return aaIf().edi_flg();
	}

	/**
	 * EDI flg. ＥＤＩＦＬＧ.<p>
	 *
	 */
	public void edi_flg(boolean value) {
		aaIf().edi_flg(value);
	}

	/**
	 * Inspection contact remarks 検査連絡備考.<p>
	 *
	 */
	public String insp_cnt_rmrks() {
		return aaIf().insp_cnt_rmrks();
	}

	/**
	 * Inspection contact remarks 検査連絡備考.<p>
	 *
	 */
	public void insp_cnt_rmrks(String value) {
		aaIf().insp_cnt_rmrks(value);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return aaIf().intr_rmrks();
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		aaIf().intr_rmrks(value);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return aaIf().trd_rmrks();
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		aaIf().trd_rmrks(value);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return aaIf().trd_d_rmrks();
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		aaIf().trd_d_rmrks(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return aaIf().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		aaIf().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return aaIf().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		aaIf().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return aaIf().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		aaIf().sub_char3(value);
	}

	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public MCDate can_ac_dt() {
		return aaIf().can_ac_dt();
	}

	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public void can_ac_dt(MCDate value) {
		aaIf().can_ac_dt(value);
	}

	/**
	 * Receipt progress No. 入荷進捗ＮＯ.<p>
	 *
	 */
	public String arr_pr_no() {
		return aaIf().arr_pr_no();
	}

	/**
	 * Receipt progress No. 入荷進捗ＮＯ.<p>
	 *
	 */
	public void arr_pr_no(String value) {
		aaIf().arr_pr_no(value);
	}

	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public String rcpt_iv_no() {
		return aaIf().rcpt_iv_no();
	}

	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public void rcpt_iv_no(String value) {
		aaIf().rcpt_iv_no(value);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return aaIf().iv_no();
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		aaIf().iv_no(value);
	}

	/**
	 * Receipt pattern type 入荷パタン区分.<p>
	 *
	 */
	public String arr_ptn_typ() {
		return aaIf().arr_ptn_typ();
	}

	/**
	 * Receipt pattern type 入荷パタン区分.<p>
	 *
	 */
	public void arr_ptn_typ(String value) {
		aaIf().arr_ptn_typ(value);
	}

	/**
	 * Cancel remaining flg. 打切ＦＬＧ.<p>
	 *
	 */
	public boolean abort_flg() {
		return aaIf().abort_flg();
	}

	/**
	 * Cancel remaining flg. 打切ＦＬＧ.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		aaIf().abort_flg(value);
	}

	/**
	 * Lot creation flg. ロット作成ＦＬＧ.<p>
	 *
	 */
	public boolean crt_lot_flg() {
		return aaIf().crt_lot_flg();
	}

	/**
	 * Lot creation flg. ロット作成ＦＬＧ.<p>
	 *
	 */
	public void crt_lot_flg(boolean value) {
		aaIf().crt_lot_flg(value);
	}

	/**
	 * Same lot flg. 同一ロットＦＬＧ.<p>
	 *
	 */
	public boolean same_lot_flg() {
		return aaIf().same_lot_flg();
	}

	/**
	 * Same lot flg. 同一ロットＦＬＧ.<p>
	 *
	 */
	public void same_lot_flg(boolean value) {
		aaIf().same_lot_flg(value);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return aaIf().mfg_inst_no();
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		aaIf().mfg_inst_no(value);
	}

	/**
	 * Subcontracting result prior flg. 外注実績先行ＦＬＧ.<p>
	 *
	 */
	public boolean pre_outsrc_act_flg() {
		return aaIf().pre_outsrc_act_flg();
	}

	/**
	 * Subcontracting result prior flg. 外注実績先行ＦＬＧ.<p>
	 *
	 */
	public void pre_outsrc_act_flg(boolean value) {
		aaIf().pre_outsrc_act_flg(value);
	}

	/**
	 * Issue flg. 発行ＦＬＧ.<p>
	 *
	 */
	public boolean prnt_flg() {
		return aaIf().prnt_flg();
	}

	/**
	 * Issue flg. 発行ＦＬＧ.<p>
	 *
	 */
	public void prnt_flg(boolean value) {
		aaIf().prnt_flg(value);
	}

	/**
	 * Customer inventory 預り.<p>
	 *
	 */
	public boolean cststk_flg() {
		return aaIf().cststk_flg();
	}

	/**
	 * Customer inventory 預り.<p>
	 *
	 */
	public void cststk_flg(boolean value) {
		aaIf().cststk_flg(value);
	}

	/**
	 * Update counter (Receipt progress) 更新カウンタ(入荷進捗).<p>
	 *
	 */
	public MCNumber arr_pr_upd_cntr() {
		return aaIf().arr_pr_upd_cntr();
	}

	/**
	 * Update counter (Receipt progress) 更新カウンタ(入荷進捗).<p>
	 *
	 */
	public void arr_pr_upd_cntr(MCNumber value) {
		aaIf().arr_pr_upd_cntr(value);
	}

	/**
	 * Update counter (Receipt progress) 更新カウンタ(入荷進捗).<p>
	 *
	 */
	public void arr_pr_upd_cntr(int value) {
		aaIf().arr_pr_upd_cntr(value);
	}

	/**
	 * Update counter (Receipt progress) 更新カウンタ(入荷進捗).<p>
	 *
	 */
	public void arr_pr_upd_cntr(long value) {
		aaIf().arr_pr_upd_cntr(value);
	}

	/**
	 * Update counter (Receipt progress) 更新カウンタ(入荷進捗).<p>
	 *
	 */
	public void arr_pr_upd_cntr(float value) {
		aaIf().arr_pr_upd_cntr(value);
	}

	/**
	 * Update counter (Receipt progress) 更新カウンタ(入荷進捗).<p>
	 *
	 */
	public void arr_pr_upd_cntr(double value) {
		aaIf().arr_pr_upd_cntr(value);
	}

	/**
	 * Update counter (Receipt result) 更新カウンタ(入荷実績).<p>
	 *
	 */
	public MCNumber arr_act_upd_cntr() {
		return aaIf().arr_act_upd_cntr();
	}

	/**
	 * Update counter (Receipt result) 更新カウンタ(入荷実績).<p>
	 *
	 */
	public void arr_act_upd_cntr(MCNumber value) {
		aaIf().arr_act_upd_cntr(value);
	}

	/**
	 * Update counter (Receipt result) 更新カウンタ(入荷実績).<p>
	 *
	 */
	public void arr_act_upd_cntr(int value) {
		aaIf().arr_act_upd_cntr(value);
	}

	/**
	 * Update counter (Receipt result) 更新カウンタ(入荷実績).<p>
	 *
	 */
	public void arr_act_upd_cntr(long value) {
		aaIf().arr_act_upd_cntr(value);
	}

	/**
	 * Update counter (Receipt result) 更新カウンタ(入荷実績).<p>
	 *
	 */
	public void arr_act_upd_cntr(float value) {
		aaIf().arr_act_upd_cntr(value);
	}

	/**
	 * Update counter (Receipt result) 更新カウンタ(入荷実績).<p>
	 *
	 */
	public void arr_act_upd_cntr(double value) {
		aaIf().arr_act_upd_cntr(value);
	}

	/**
	 * Receipt dept. cd. update flg. 入荷部門ＣＤ更新ＦＬＧ.<p>
	 *
	 */
	public boolean arr_dpt_cd_upd_flg() {
		return aaIf().arr_dpt_cd_upd_flg();
	}

	/**
	 * Receipt dept. cd. update flg. 入荷部門ＣＤ更新ＦＬＧ.<p>
	 *
	 */
	public void arr_dpt_cd_upd_flg(boolean value) {
		aaIf().arr_dpt_cd_upd_flg(value);
	}

	/**
	 * Receipt PIC cd. update flg. 入荷担当者ＣＤ更新ＦＬＧ.<p>
	 *
	 */
	public boolean arr_usr_cd_upd_flg() {
		return aaIf().arr_usr_cd_upd_flg();
	}

	/**
	 * Receipt PIC cd. update flg. 入荷担当者ＣＤ更新ＦＬＧ.<p>
	 *
	 */
	public void arr_usr_cd_upd_flg(boolean value) {
		aaIf().arr_usr_cd_upd_flg(value);
	}

	/**
	 * SEIBAN No. 1 update flg. 手配ＮＯ１更新ＦＬＧ.<p>
	 *
	 */
	public boolean sno1_upd_flg() {
		return aaIf().sno1_upd_flg();
	}

	/**
	 * SEIBAN No. 1 update flg. 手配ＮＯ１更新ＦＬＧ.<p>
	 *
	 */
	public void sno1_upd_flg(boolean value) {
		aaIf().sno1_upd_flg(value);
	}

	/**
	 * SEIBAN No. 2 update flg. 手配ＮＯ２更新ＦＬＧ.<p>
	 *
	 */
	public boolean sno2_upd_flg() {
		return aaIf().sno2_upd_flg();
	}

	/**
	 * SEIBAN No. 2 update flg. 手配ＮＯ２更新ＦＬＧ.<p>
	 *
	 */
	public void sno2_upd_flg(boolean value) {
		aaIf().sno2_upd_flg(value);
	}

	/**
	 * SEIBAN No. 3 update flg. 手配ＮＯ３更新ＦＬＧ.<p>
	 *
	 */
	public boolean sno3_upd_flg() {
		return aaIf().sno3_upd_flg();
	}

	/**
	 * SEIBAN No. 3 update flg. 手配ＮＯ３更新ＦＬＧ.<p>
	 *
	 */
	public void sno3_upd_flg(boolean value) {
		aaIf().sno3_upd_flg(value);
	}

	/**
	 * SEIBAN No. 4 update flg. 手配ＮＯ４更新ＦＬＧ.<p>
	 *
	 */
	public boolean sno4_upd_flg() {
		return aaIf().sno4_upd_flg();
	}

	/**
	 * SEIBAN No. 4 update flg. 手配ＮＯ４更新ＦＬＧ.<p>
	 *
	 */
	public void sno4_upd_flg(boolean value) {
		aaIf().sno4_upd_flg(value);
	}

	/**
	 * Lot No. update flg. ロットＮＯ更新ＦＬＧ.<p>
	 *
	 */
	public boolean lot_no_upd_flg() {
		return aaIf().lot_no_upd_flg();
	}

	/**
	 * Lot No. update flg. ロットＮＯ更新ＦＬＧ.<p>
	 *
	 */
	public void lot_no_upd_flg(boolean value) {
		aaIf().lot_no_upd_flg(value);
	}

	/**
	 * Sublot No.?update flg. サブロットＮＯ更新ＦＬＧ.<p>
	 *
	 */
	public boolean sublot_no_upd_flg() {
		return aaIf().sublot_no_upd_flg();
	}

	/**
	 * Sublot No.?update flg. サブロットＮＯ更新ＦＬＧ.<p>
	 *
	 */
	public void sublot_no_upd_flg(boolean value) {
		aaIf().sublot_no_upd_flg(value);
	}

	/**
	 * Version No. update flg. 版ＮＯ更新ＦＬＧ.<p>
	 *
	 */
	public boolean ver_no_upd_flg() {
		return aaIf().ver_no_upd_flg();
	}

	/**
	 * Version No. update flg. 版ＮＯ更新ＦＬＧ.<p>
	 *
	 */
	public void ver_no_upd_flg(boolean value) {
		aaIf().ver_no_upd_flg(value);
	}

	/**
	 * Inventory arriving point cd. update flg. 在庫着荷先ＣＤ更新ＦＬＧ.<p>
	 *
	 */
	public boolean stk_arrv_bp_cd_upd_flg() {
		return aaIf().stk_arrv_bp_cd_upd_flg();
	}

	/**
	 * Inventory arriving point cd. update flg. 在庫着荷先ＣＤ更新ＦＬＧ.<p>
	 *
	 */
	public void stk_arrv_bp_cd_upd_flg(boolean value) {
		aaIf().stk_arrv_bp_cd_upd_flg(value);
	}

	/**
	 * Grading cd. update flg. 格付ＣＤ更新ＦＬＧ.<p>
	 *
	 */
	public boolean gd_cd_upd_flg() {
		return aaIf().gd_cd_upd_flg();
	}

	/**
	 * Grading cd. update flg. 格付ＣＤ更新ＦＬＧ.<p>
	 *
	 */
	public void gd_cd_upd_flg(boolean value) {
		aaIf().gd_cd_upd_flg(value);
	}

	/**
	 * Conforming type update flg. 良品区分更新ＦＬＧ.<p>
	 *
	 */
	public boolean quality_typ_upd_flg() {
		return aaIf().quality_typ_upd_flg();
	}

	/**
	 * Conforming type update flg. 良品区分更新ＦＬＧ.<p>
	 *
	 */
	public void quality_typ_upd_flg(boolean value) {
		aaIf().quality_typ_upd_flg(value);
	}

	/**
	 * Inventory inspection type update flg. 在庫検査区分更新ＦＬＧ.<p>
	 *
	 */
	public boolean stk_insp_typ_upd_flg() {
		return aaIf().stk_insp_typ_upd_flg();
	}

	/**
	 * Inventory inspection type update flg. 在庫検査区分更新ＦＬＧ.<p>
	 *
	 */
	public void stk_insp_typ_upd_flg(boolean value) {
		aaIf().stk_insp_typ_upd_flg(value);
	}

	/**
	 * Inventory identification type update flg. 在庫識別区分更新ＦＬＧ.<p>
	 *
	 */
	public boolean stk_id_typ_upd_flg() {
		return aaIf().stk_id_typ_upd_flg();
	}

	/**
	 * Inventory identification type update flg. 在庫識別区分更新ＦＬＧ.<p>
	 *
	 */
	public void stk_id_typ_upd_flg(boolean value) {
		aaIf().stk_id_typ_upd_flg(value);
	}

	/**
	 * Inventory BP cd. update flg. 在庫取引先ＣＤ更新ＦＬＧ.<p>
	 *
	 */
	public boolean stk_bp_cd_upd_flg() {
		return aaIf().stk_bp_cd_upd_flg();
	}

	/**
	 * Inventory BP cd. update flg. 在庫取引先ＣＤ更新ＦＬＧ.<p>
	 *
	 */
	public void stk_bp_cd_upd_flg(boolean value) {
		aaIf().stk_bp_cd_upd_flg(value);
	}

	/**
	 * Supplier item cd. update flg. 発注先品目ＣＤ更新ＦＬＧ.<p>
	 *
	 */
	public boolean sppl_itm_cd_upd_flg() {
		return aaIf().sppl_itm_cd_upd_flg();
	}

	/**
	 * Supplier item cd. update flg. 発注先品目ＣＤ更新ＦＬＧ.<p>
	 *
	 */
	public void sppl_itm_cd_upd_flg(boolean value) {
		aaIf().sppl_itm_cd_upd_flg(value);
	}

	/**
	 * Supplier item name update flg. 発注先品名更新ＦＬＧ.<p>
	 *
	 */
	public boolean sppl_itm_nm_upd_flg() {
		return aaIf().sppl_itm_nm_upd_flg();
	}

	/**
	 * Supplier item name update flg. 発注先品名更新ＦＬＧ.<p>
	 *
	 */
	public void sppl_itm_nm_upd_flg(boolean value) {
		aaIf().sppl_itm_nm_upd_flg(value);
	}

	/**
	 * Maker cd. update flg. メーカーＣＤ更新ＦＬＧ.<p>
	 *
	 */
	public boolean maker_cd_upd_flg() {
		return aaIf().maker_cd_upd_flg();
	}

	/**
	 * Maker cd. update flg. メーカーＣＤ更新ＦＬＧ.<p>
	 *
	 */
	public void maker_cd_upd_flg(boolean value) {
		aaIf().maker_cd_upd_flg(value);
	}

	/**
	 * Vendor lot No. Update flg. 業者ロットＮＯ更新ＦＬＧ.<p>
	 *
	 */
	public boolean bp_lot_no_upd_flg() {
		return aaIf().bp_lot_no_upd_flg();
	}

	/**
	 * Vendor lot No. Update flg. 業者ロットＮＯ更新ＦＬＧ.<p>
	 *
	 */
	public void bp_lot_no_upd_flg(boolean value) {
		aaIf().bp_lot_no_upd_flg(value);
	}

	/**
	 * Vendor delivery note No. update flg. 業者納品書ＮＯ更新ＦＬＧ.<p>
	 *
	 */
	public boolean bp_dlv_slip_no_upd_flg() {
		return aaIf().bp_dlv_slip_no_upd_flg();
	}

	/**
	 * Vendor delivery note No. update flg. 業者納品書ＮＯ更新ＦＬＧ.<p>
	 *
	 */
	public void bp_dlv_slip_no_upd_flg(boolean value) {
		aaIf().bp_dlv_slip_no_upd_flg(value);
	}

	/**
	 * Vendor delivery note details No. update flg. 業者納品書明細ＮＯ更新ＦＬＧ.<p>
	 *
	 */
	public boolean bp_dlv_slip_d_no_upd_flg() {
		return aaIf().bp_dlv_slip_d_no_upd_flg();
	}

	/**
	 * Vendor delivery note details No. update flg. 業者納品書明細ＮＯ更新ＦＬＧ.<p>
	 *
	 */
	public void bp_dlv_slip_d_no_upd_flg(boolean value) {
		aaIf().bp_dlv_slip_d_no_upd_flg(value);
	}

	/**
	 * Shipping point expiration update flg. 出荷元期限更新ＦＬＧ.<p>
	 *
	 */
	public boolean ship_fr_valid_dt_upd_flg() {
		return aaIf().ship_fr_valid_dt_upd_flg();
	}

	/**
	 * Shipping point expiration update flg. 出荷元期限更新ＦＬＧ.<p>
	 *
	 */
	public void ship_fr_valid_dt_upd_flg(boolean value) {
		aaIf().ship_fr_valid_dt_upd_flg(value);
	}

	/**
	 * Purchase active ingredient update flg. 仕入有効成分更新ＦＬＧ.<p>
	 *
	 */
	public boolean purc_cont_qty_upd_flg() {
		return aaIf().purc_cont_qty_upd_flg();
	}

	/**
	 * Purchase active ingredient update flg. 仕入有効成分更新ＦＬＧ.<p>
	 *
	 */
	public void purc_cont_qty_upd_flg(boolean value) {
		aaIf().purc_cont_qty_upd_flg(value);
	}

	/**
	 * Inspection contact remarks update flg. 検査連絡備考更新ＦＬＧ.<p>
	 *
	 */
	public boolean insp_cnt_rmrks_upd_flg() {
		return aaIf().insp_cnt_rmrks_upd_flg();
	}

	/**
	 * Inspection contact remarks update flg. 検査連絡備考更新ＦＬＧ.<p>
	 *
	 */
	public void insp_cnt_rmrks_upd_flg(boolean value) {
		aaIf().insp_cnt_rmrks_upd_flg(value);
	}

	/**
	 * Internal remarks update flg. 内部備考更新ＦＬＧ.<p>
	 *
	 */
	public boolean intr_rmrks_upd_flg() {
		return aaIf().intr_rmrks_upd_flg();
	}

	/**
	 * Internal remarks update flg. 内部備考更新ＦＬＧ.<p>
	 *
	 */
	public void intr_rmrks_upd_flg(boolean value) {
		aaIf().intr_rmrks_upd_flg(value);
	}

	/**
	 * Transaction remarks update flg. 取引備考更新ＦＬＧ.<p>
	 *
	 */
	public boolean trd_rmrks_upd_flg() {
		return aaIf().trd_rmrks_upd_flg();
	}

	/**
	 * Transaction remarks update flg. 取引備考更新ＦＬＧ.<p>
	 *
	 */
	public void trd_rmrks_upd_flg(boolean value) {
		aaIf().trd_rmrks_upd_flg(value);
	}

	/**
	 * Transaction details remarks update flg. 取引明細備考更新ＦＬＧ.<p>
	 *
	 */
	public boolean trd_d_rmrks_upd_flg() {
		return aaIf().trd_d_rmrks_upd_flg();
	}

	/**
	 * Transaction details remarks update flg. 取引明細備考更新ＦＬＧ.<p>
	 *
	 */
	public void trd_d_rmrks_upd_flg(boolean value) {
		aaIf().trd_d_rmrks_upd_flg(value);
	}

	/**
	 * Update spare 1 flg. 予備１更新ＦＬＧ.<p>
	 *
	 */
	public boolean sub_char1_upd_flg() {
		return aaIf().sub_char1_upd_flg();
	}

	/**
	 * Update spare 1 flg. 予備１更新ＦＬＧ.<p>
	 *
	 */
	public void sub_char1_upd_flg(boolean value) {
		aaIf().sub_char1_upd_flg(value);
	}

	/**
	 * Update spare 2 flg. 予備２更新ＦＬＧ.<p>
	 *
	 */
	public boolean sub_char2_upd_flg() {
		return aaIf().sub_char2_upd_flg();
	}

	/**
	 * Update spare 2 flg. 予備２更新ＦＬＧ.<p>
	 *
	 */
	public void sub_char2_upd_flg(boolean value) {
		aaIf().sub_char2_upd_flg(value);
	}

	/**
	 * Update spare 3 flg. 予備３更新ＦＬＧ.<p>
	 *
	 */
	public boolean sub_char3_upd_flg() {
		return aaIf().sub_char3_upd_flg();
	}

	/**
	 * Update spare 3 flg. 予備３更新ＦＬＧ.<p>
	 *
	 */
	public void sub_char3_upd_flg(boolean value) {
		aaIf().sub_char3_upd_flg(value);
	}

	/**
	 * Receipt progress No. update flg. 入荷進捗ＮＯ更新ＦＬＧ.<p>
	 *
	 */
	public boolean arr_pr_no_upd_flg() {
		return aaIf().arr_pr_no_upd_flg();
	}

	/**
	 * Receipt progress No. update flg. 入荷進捗ＮＯ更新ＦＬＧ.<p>
	 *
	 */
	public void arr_pr_no_upd_flg(boolean value) {
		aaIf().arr_pr_no_upd_flg(value);
	}

	/**
	 * Invoice No. update flg. インボイスＮＯ更新ＦＬＧ.<p>
	 *
	 */
	public boolean iv_no_upd_flg() {
		return aaIf().iv_no_upd_flg();
	}

	/**
	 * Invoice No. update flg. インボイスＮＯ更新ＦＬＧ.<p>
	 *
	 */
	public void iv_no_upd_flg(boolean value) {
		aaIf().iv_no_upd_flg(value);
	}

}

