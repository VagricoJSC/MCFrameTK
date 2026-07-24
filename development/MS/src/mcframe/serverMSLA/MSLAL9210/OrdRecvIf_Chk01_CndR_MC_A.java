package mcframe.serverMSLA.MSLAL9210;

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
 * ブロック"OrdRecvIf_Chk01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class OrdRecvIf_Chk01_CndR_MC_A extends MCConstRow {

	public static final String $ordif = "ordif";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public static final String $itm_ord_no = "itm_ord_no";
	/**
	 * Operation order No. 工程オーダＮＯ.<p>
	 *
	 */
	public static final String $oper_ord_no = "oper_ord_no";
	/**
	 * Header data update type ヘッダデータ更新区分.<p>
	 *
	 */
	public static final String $hdr_data_crud_typ = "hdr_data_crud_typ";
	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Order status type オーダ状況区分.<p>
	 *
	 */
	public static final String $itm_ord_sts_typ = "itm_ord_sts_typ";
	/**
	 * MRP type ＭＲＰタイプ.<p>
	 *
	 */
	public static final String $mrp_typ = "mrp_typ";
	/**
	 * Order generation type オーダ生成区分.<p>
	 *
	 */
	public static final String $ord_gnrt_typ = "ord_gnrt_typ";
	/**
	 * Operation order generation 工程オーダ生成.<p>
	 *
	 */
	public static final String $oper_ord_pr_flg = "oper_ord_pr_flg";
	/**
	 * Generate GR/GI schedule 受払予定生成.<p>
	 *
	 */
	public static final String $io_schd_pr_flg = "io_schd_pr_flg";
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public static final String $unit_cd = "unit_cd";
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public static final String $dec_place = "dec_place";
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
	 * Yield numerator 歩留分子.<p>
	 *
	 */
	public static final String $nmr_qty = "nmr_qty";
	/**
	 * Yield denominator 歩留分母.<p>
	 *
	 */
	public static final String $dnm_qty = "dnm_qty";
	/**
	 * Constant yield qty. 固定歩留数量.<p>
	 *
	 */
	public static final String $fxd_yield_qty = "fxd_yield_qty";
	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $rqst_wg_cd = "rqst_wg_cd";
	/**
	 * Subcontractor cd. 外注発注先ＣＤ.<p>
	 *
	 */
	public static final String $mfg_sppl_cd = "mfg_sppl_cd";
	/**
	 * Subcontracting maker cd. 外注メーカＣＤ.<p>
	 *
	 */
	public static final String $mfg_maker_cd = "mfg_maker_cd";
	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public static final String $purc_lt = "purc_lt";
	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public static final String $mfg_lt = "mfg_lt";
	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public static final String $xfr_lt = "xfr_lt";
	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public static final String $accpt_insp_lt = "accpt_insp_lt";
	/**
	 * Inspection LT 検査ＬＴ.<p>
	 *
	 */
	public static final String $insp_lt = "insp_lt";
	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public static final String $insp_offst = "insp_offst";
	/**
	 * Order auto-firming period (Date) オーダ自動確定期間（日）.<p>
	 *
	 */
	public static final String $ord_fix_pd = "ord_fix_pd";
	/**
	 * Requirements No. 所要ＮＯ.<p>
	 *
	 */
	public static final String $rqmt_no = "rqmt_no";
	/**
	 * Simulation No. シミュレーションＮＯ.<p>
	 *
	 */
	public static final String $sim_mrp_no = "sim_mrp_no";
	/**
	 * Storage location supplier cd. 格納場所発注先ＣＤ.<p>
	 *
	 */
	public static final String $strg_sppl_cd = "strg_sppl_cd";
	/**
	 * Storage factory/distribution warehouse cd. 格納先工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $strg_site_cd = "strg_site_cd";
	/**
	 * Storage location WG cd. 格納場所ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $strg_wg_cd = "strg_wg_cd";
	/**
	 * Mfg. location WG cd. 製造場所ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $mfg_wg_cd = "mfg_wg_cd";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * Operation LT 工程ＬＴ.<p>
	 *
	 */
	public static final String $oper_lt = "oper_lt";
	/**
	 * Operation offset type 工程オフセット区分.<p>
	 *
	 */
	public static final String $oper_offst_typ = "oper_offst_typ";
	/**
	 * Output recording operation 出来高計上工程.<p>
	 *
	 */
	public static final String $yield_oper_flg = "yield_oper_flg";
	/**
	 * Linkage scheduler type 連携スケジューラ区分.<p>
	 *
	 */
	public static final String $if_scheduler_typ = "if_scheduler_typ";
	/**
	 * Allow subcontracting scheduling flg. 外注スケジューリング許可ＦＬＧ.<p>
	 *
	 */
	public static final String $allow_outsrc_schd_flg = "allow_outsrc_schd_flg";

	public static final String $data_lno = $ordif + ".data_lno";
	public static final String $data_no = $ordif + ".data_no";
	public static final String $data_crud_typ = $ordif + ".data_crud_typ";
	public static final String $exe_sts_typ = $ordif + ".exe_sts_typ";
	public static final String $ext_sys_cd = $ordif + ".ext_sys_cd";
	public static final String $ext_data_lno = $ordif + ".ext_data_lno";
	public static final String $ext_data_no = $ordif + ".ext_data_no";
	public static final String $data_make_dt = $ordif + ".data_make_dt";
	public static final String $imp_flg = $ordif + ".imp_flg";
	public static final String $recv_dt = $ordif + ".recv_dt";
	public static final String $ext_itm_ord_no = $ordif + ".ext_itm_ord_no";
	public static final String $ext_oper_ord_no = $ordif + ".ext_oper_ord_no";
	public static final String $itm_ord_typ = $ordif + ".itm_ord_typ";
	public static final String $itm_cd = $ordif + ".itm_cd";
	public static final String $itm_sub1 = $ordif + ".itm_sub1";
	public static final String $itm_sub2 = $ordif + ".itm_sub2";
	public static final String $itm_sub3 = $ordif + ".itm_sub3";
	public static final String $itm_nm = $ordif + ".itm_nm";
	public static final String $ver_no = $ordif + ".ver_no";
	public static final String $strg_loc_cd = $ordif + ".strg_loc_cd";
	public static final String $mfg_loc_cd = $ordif + ".mfg_loc_cd";
	public static final String $bom_ptn = $ordif + ".bom_ptn";
	public static final String $oper_ptn = $ordif + ".oper_ptn";
	public static final String $inst_qty = $ordif + ".inst_qty";
	public static final String $yield_schd_qty = $ordif + ".yield_schd_qty";
	public static final String $po_schd_dt = $ordif + ".po_schd_dt";
	public static final String $mfg_st_schd_dt = $ordif + ".mfg_st_schd_dt";
	public static final String $mfg_end_schd_dt = $ordif + ".mfg_end_schd_dt";
	public static final String $strg_schd_dt = $ordif + ".strg_schd_dt";
	public static final String $accpt_schd_dt = $ordif + ".accpt_schd_dt";
	public static final String $insp_st_schd_dt = $ordif + ".insp_st_schd_dt";
	public static final String $insp_end_schd_dt = $ordif + ".insp_end_schd_dt";
	public static final String $avl_schd_dt = $ordif + ".avl_schd_dt";
	public static final String $master_dt = $ordif + ".master_dt";
	public static final String $sno1 = $ordif + ".sno1";
	public static final String $sno2 = $ordif + ".sno2";
	public static final String $sno3 = $ordif + ".sno3";
	public static final String $sno4 = $ordif + ".sno4";
	public static final String $inst_po_cnt_rmrks = $ordif + ".inst_po_cnt_rmrks";
	public static final String $itm_ord_intr_rmrks = $ordif + ".itm_ord_intr_rmrks";
	public static final String $itm_ord_sub_char1 = $ordif + ".itm_ord_sub_char1";
	public static final String $itm_ord_sub_char2 = $ordif + ".itm_ord_sub_char2";
	public static final String $itm_ord_sub_char3 = $ordif + ".itm_ord_sub_char3";
	public static final String $st_schd_tm = $ordif + ".st_schd_tm";
	public static final String $end_schd_tm = $ordif + ".end_schd_tm";
	public static final String $oper_schd_qty = $ordif + ".oper_schd_qty";
	public static final String $disp_seq = $ordif + ".disp_seq";
	public static final String $oper_cd = $ordif + ".oper_cd";
	public static final String $oper_seq = $ordif + ".oper_seq";
	public static final String $loc_cd = $ordif + ".loc_cd";
	public static final String $oper_rsrc = $ordif + ".oper_rsrc";
	public static final String $oper_ord_intr_rmrks = $ordif + ".oper_ord_intr_rmrks";
	public static final String $oper_ord_sub_char1 = $ordif + ".oper_ord_sub_char1";
	public static final String $oper_ord_sub_char2 = $ordif + ".oper_ord_sub_char2";
	public static final String $oper_ord_sub_char3 = $ordif + ".oper_ord_sub_char3";
	public static final String $scheduler_frozen_flg = $ordif + ".scheduler_frozen_flg";

	public static final MCMeta ordif_META = createInnerRowMeta($ordif, mcframe.serverMS.dbc.MST_ORDER_RECV_IF_R.class);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_ord_no_META = createCommonMeta($itm_ord_no, mcframe.commonMA.meta.MA_META.ITM_ORD_NO);
	public static final MCMeta oper_ord_no_META = createCommonMeta($oper_ord_no, mcframe.commonMA.meta.MA_META.OPER_ORD_NO);
	public static final MCMeta hdr_data_crud_typ_META = createCommonMeta($hdr_data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta itm_ord_sts_typ_META = createCommonMeta($itm_ord_sts_typ, mcframe.commonMS.meta.MS_META.ITM_ORD_STS_TYP);
	public static final MCMeta mrp_typ_META = createCommonMeta($mrp_typ, mcframe.commonMS.meta.MS_META.MRP_TYP);
	public static final MCMeta ord_gnrt_typ_META = createCommonMeta($ord_gnrt_typ, mcframe.commonMS.meta.MS_META.ORD_GNRT_TYP);
	public static final MCMeta oper_ord_pr_flg_META = createCommonMeta($oper_ord_pr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta io_schd_pr_flg_META = createCommonMeta($io_schd_pr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta lot_mng_typ_META = createCommonMeta($lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta sublot_mng_typ_META = createCommonMeta($sublot_mng_typ, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP);
	public static final MCMeta nmr_qty_META = createCommonMeta($nmr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta dnm_qty_META = createCommonMeta($dnm_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta fxd_yield_qty_META = createCommonMeta($fxd_yield_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta rqst_wg_cd_META = createCommonMeta($rqst_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta mfg_sppl_cd_META = createCommonMeta($mfg_sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta mfg_maker_cd_META = createCommonMeta($mfg_maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta purc_lt_META = createCommonMeta($purc_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta mfg_lt_META = createCommonMeta($mfg_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta xfr_lt_META = createCommonMeta($xfr_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta accpt_insp_lt_META = createCommonMeta($accpt_insp_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta insp_lt_META = createCommonMeta($insp_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta insp_offst_META = createCommonMeta($insp_offst, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta ord_fix_pd_META = createCommonMeta($ord_fix_pd, mcframe.commonMA.meta.MA_META.ORD_FIX_PD);
	public static final MCMeta rqmt_no_META = createCommonMeta($rqmt_no, mcframe.commonMA.meta.MA_META.RQMT_NO);
	public static final MCMeta sim_mrp_no_META = createCommonMeta($sim_mrp_no, mcframe.commonMA.meta.MA_META.SIM_MRP_NO);
	public static final MCMeta strg_sppl_cd_META = createCommonMeta($strg_sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta strg_site_cd_META = createCommonMeta($strg_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta strg_wg_cd_META = createCommonMeta($strg_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta mfg_wg_cd_META = createCommonMeta($mfg_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta oper_lt_META = createCommonMeta($oper_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta oper_offst_typ_META = createCommonMeta($oper_offst_typ, mcframe.commonMA.meta.MA_META.OFFST_TYP);
	public static final MCMeta yield_oper_flg_META = createCommonMeta($yield_oper_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta if_scheduler_typ_META = createCommonMeta($if_scheduler_typ, mcframe.commonMS.meta.MS_META.IF_SCHEDULER_TYP);
	public static final MCMeta allow_outsrc_schd_flg_META = createCommonMeta($allow_outsrc_schd_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<OrdRecvIf_Chk01_CndR> constMetas = new ConstMetaList<OrdRecvIf_Chk01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ordif_META,
			err_flg_META,
			itm_ord_no_META,
			oper_ord_no_META,
			hdr_data_crud_typ_META,
			peg_no_META,
			itm_ord_sts_typ_META,
			mrp_typ_META,
			ord_gnrt_typ_META,
			oper_ord_pr_flg_META,
			io_schd_pr_flg_META,
			unit_cd_META,
			dec_place_META,
			lot_mng_typ_META,
			sublot_mng_typ_META,
			nmr_qty_META,
			dnm_qty_META,
			fxd_yield_qty_META,
			rqst_wg_cd_META,
			mfg_sppl_cd_META,
			mfg_maker_cd_META,
			purc_lt_META,
			mfg_lt_META,
			xfr_lt_META,
			accpt_insp_lt_META,
			insp_lt_META,
			insp_offst_META,
			ord_fix_pd_META,
			rqmt_no_META,
			sim_mrp_no_META,
			strg_sppl_cd_META,
			strg_site_cd_META,
			strg_wg_cd_META,
			mfg_wg_cd_META,
			wg_cd_META,
			oper_lt_META,
			oper_offst_typ_META,
			yield_oper_flg_META,
			if_scheduler_typ_META,
			allow_outsrc_schd_flg_META
		},
		new String[][]{
			{
				"data_lno",
				"data_no",
				"data_crud_typ",
				"exe_sts_typ",
				"ext_sys_cd",
				"ext_data_lno",
				"ext_data_no",
				"data_make_dt",
				"imp_flg",
				"recv_dt",
				"ext_itm_ord_no",
				"ext_oper_ord_no",
				"itm_ord_typ",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"ver_no",
				"strg_loc_cd",
				"mfg_loc_cd",
				"bom_ptn",
				"oper_ptn",
				"inst_qty",
				"yield_schd_qty",
				"po_schd_dt",
				"mfg_st_schd_dt",
				"mfg_end_schd_dt",
				"strg_schd_dt",
				"accpt_schd_dt",
				"insp_st_schd_dt",
				"insp_end_schd_dt",
				"avl_schd_dt",
				"master_dt",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"inst_po_cnt_rmrks",
				"itm_ord_intr_rmrks",
				"itm_ord_sub_char1",
				"itm_ord_sub_char2",
				"itm_ord_sub_char3",
				"st_schd_tm",
				"end_schd_tm",
				"oper_schd_qty",
				"disp_seq",
				"oper_cd",
				"oper_seq",
				"loc_cd",
				"oper_rsrc",
				"oper_ord_intr_rmrks",
				"oper_ord_sub_char1",
				"oper_ord_sub_char2",
				"oper_ord_sub_char3",
				"scheduler_frozen_flg"
			},
			{
				$data_lno,
				$data_no,
				$data_crud_typ,
				$exe_sts_typ,
				$ext_sys_cd,
				$ext_data_lno,
				$ext_data_no,
				$data_make_dt,
				$imp_flg,
				$recv_dt,
				$ext_itm_ord_no,
				$ext_oper_ord_no,
				$itm_ord_typ,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$ver_no,
				$strg_loc_cd,
				$mfg_loc_cd,
				$bom_ptn,
				$oper_ptn,
				$inst_qty,
				$yield_schd_qty,
				$po_schd_dt,
				$mfg_st_schd_dt,
				$mfg_end_schd_dt,
				$strg_schd_dt,
				$accpt_schd_dt,
				$insp_st_schd_dt,
				$insp_end_schd_dt,
				$avl_schd_dt,
				$master_dt,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$inst_po_cnt_rmrks,
				$itm_ord_intr_rmrks,
				$itm_ord_sub_char1,
				$itm_ord_sub_char2,
				$itm_ord_sub_char3,
				$st_schd_tm,
				$end_schd_tm,
				$oper_schd_qty,
				$disp_seq,
				$oper_cd,
				$oper_seq,
				$loc_cd,
				$oper_rsrc,
				$oper_ord_intr_rmrks,
				$oper_ord_sub_char1,
				$oper_ord_sub_char2,
				$oper_ord_sub_char3,
				$scheduler_frozen_flg
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
				{$ordif + ".ext_itm_ord_no", "E"},	// ordif.ext_itm_ord_no
				{$ordif + ".ext_oper_ord_no", "E"},	// ordif.ext_oper_ord_no
				{$ordif + ".itm_ord_typ", "E"},	// ordif.itm_ord_typ
				{$ordif + ".itm_cd", "E"},	// ordif.itm_cd
				{$ordif + ".itm_sub1", "E"},	// ordif.itm_sub1
				{$ordif + ".itm_sub2", "E"},	// ordif.itm_sub2
				{$ordif + ".itm_sub3", "E"},	// ordif.itm_sub3
				{$ordif + ".master_dt", "E"}	// ordif.master_dt
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
				{$ordif + ".inst_qty", "positive"},	// ordif.inst_qty
				{$ordif + ".yield_schd_qty", "positive"},	// ordif.yield_schd_qty
				{$ordif + ".oper_schd_qty", "positive"}	// ordif.oper_schd_qty
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
				{$ordif + ".itm_sub3", "MA.MAUAL0010.ItmSub3"},	// ordif.itm_sub3
				{$ordif + ".strg_loc_cd", "MA.MAUAL0010.Loc"},	// ordif.strg_loc_cd
				{$ordif + ".mfg_loc_cd", "MA.MAUAL0010.Loc"},	// ordif.mfg_loc_cd
				{$ordif + ".loc_cd", "MA.MAUAL0010.Loc"}	// ordif.loc_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$ordif + ".itm_sub3", "sundry_itm_flg;mst_itm_nm;dscnt_itm_flg;asset_mng_typ;ver_flg;arr_skip_flg;base_unit_cd;base_unit_dec_place;base_unit_rnd_typ;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;itm_pay_crryovr_times;stk_mng_typ;itm_purc_upri_cng_flg"},	// ordif.itm_sub3
				{$ordif + ".strg_loc_cd", "strg_sppl_cd;wg_cd"},	// ordif.strg_loc_cd
				{$ordif + ".mfg_loc_cd", "mfg_sppl_cd"}	// ordif.mfg_loc_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$ordif + ".itm_sub3", "sundry_itm_flg;itm_nm;dscnt_itm_flg;asset_mng_typ;ver_flg;arr_skip_flg;unit_cd;dec_place;rnd_typ;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;pay_crryovr_times;stk_mng_typ;purc_upri_cng_flg"},	// ordif.itm_sub3
				{$ordif + ".strg_loc_cd", "sppl_cd;wg_cd"},	// ordif.strg_loc_cd
				{$ordif + ".mfg_loc_cd", "sppl_cd"}	// ordif.mfg_loc_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$ordif + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;itm_sub1;itm_sub2"},	// ordif.itm_sub3
				{$ordif + ".mfg_loc_cd", "true"},	// ordif.mfg_loc_cd
				{$ordif + ".loc_cd", "MAC_LOC_IS_SRCH_TYP.WG;wg_cd"}	// ordif.loc_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$ordif + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"},	// ordif.itm_sub3
				{$ordif + ".mfg_loc_cd", "mode_nullval_flg"},	// ordif.mfg_loc_cd
				{$ordif + ".loc_cd", "loc_is_srch_typ;wg_cd"}	// ordif.loc_cd
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$ordif + ".data_crud_typ", "MAC_DATA_CRUD_TYP"},	// ordif.data_crud_typ
				{$ordif + ".itm_ord_typ", "MSC_ITM_ORD_TYP"}	// ordif.itm_ord_typ
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
				{$ordif + ".itm_sub1", "E"},	// ordif.itm_sub1
				{$ordif + ".itm_sub2", "E"},	// ordif.itm_sub2
				{$ordif + ".itm_sub3", "E"}	// ordif.itm_sub3
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
	protected OrdRecvIf_Chk01_CndR_MC_A(ConstMetaList<? extends OrdRecvIf_Chk01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public OrdRecvIf_Chk01_CndR clone() {
		return (OrdRecvIf_Chk01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public OrdRecvIf_Chk01_CndR createInstance() {
		return (OrdRecvIf_Chk01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public OrdRecvIf_Chk01_CndR getValues(String... names) {
		return (OrdRecvIf_Chk01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	public mcframe.serverMS.dbc.MST_ORDER_RECV_IF_R ordif(){
		return (mcframe.serverMS.dbc.MST_ORDER_RECV_IF_R) getConstInnerRow(offset + 0, $ordif);
	}
	
	public void ordif(mcframe.serverMS.dbc.MST_ORDER_RECV_IF_R row){
		setConstInnerRow(offset + 0, $ordif, row);
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
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public String itm_ord_no() {
		return getConstString(offset + 2, $itm_ord_no);
	}

	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public void itm_ord_no(String value) {
		setConstString(offset + 2, $itm_ord_no, value);
	}


	/**
	 * Operation order No. 工程オーダＮＯ.<p>
	 *
	 */
	public String oper_ord_no() {
		return getConstString(offset + 3, $oper_ord_no);
	}

	/**
	 * Operation order No. 工程オーダＮＯ.<p>
	 *
	 */
	public void oper_ord_no(String value) {
		setConstString(offset + 3, $oper_ord_no, value);
	}


	/**
	 * Header data update type ヘッダデータ更新区分.<p>
	 *
	 */
	public String hdr_data_crud_typ() {
		return getConstString(offset + 4, $hdr_data_crud_typ);
	}

	/**
	 * Header data update type ヘッダデータ更新区分.<p>
	 *
	 */
	public void hdr_data_crud_typ(String value) {
		setConstString(offset + 4, $hdr_data_crud_typ, value);
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 5, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 5, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 5, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 5, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 5, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 5, $peg_no, value);
	}


	/**
	 * Order status type オーダ状況区分.<p>
	 *
	 */
	public String itm_ord_sts_typ() {
		return getConstString(offset + 6, $itm_ord_sts_typ);
	}

	/**
	 * Order status type オーダ状況区分.<p>
	 *
	 */
	public void itm_ord_sts_typ(String value) {
		setConstString(offset + 6, $itm_ord_sts_typ, value);
	}


	/**
	 * MRP type ＭＲＰタイプ.<p>
	 *
	 */
	public String mrp_typ() {
		return getConstString(offset + 7, $mrp_typ);
	}

	/**
	 * MRP type ＭＲＰタイプ.<p>
	 *
	 */
	public void mrp_typ(String value) {
		setConstString(offset + 7, $mrp_typ, value);
	}


	/**
	 * Order generation type オーダ生成区分.<p>
	 *
	 */
	public String ord_gnrt_typ() {
		return getConstString(offset + 8, $ord_gnrt_typ);
	}

	/**
	 * Order generation type オーダ生成区分.<p>
	 *
	 */
	public void ord_gnrt_typ(String value) {
		setConstString(offset + 8, $ord_gnrt_typ, value);
	}


	/**
	 * Operation order generation 工程オーダ生成.<p>
	 *
	 */
	public boolean oper_ord_pr_flg() {
		return getConstBoolean(offset + 9, $oper_ord_pr_flg);
	}

	/**
	 * Operation order generation 工程オーダ生成.<p>
	 *
	 */
	public void oper_ord_pr_flg(boolean value) {
		setConstBoolean(offset + 9, $oper_ord_pr_flg, value);
	}


	/**
	 * Generate GR/GI schedule 受払予定生成.<p>
	 *
	 */
	public boolean io_schd_pr_flg() {
		return getConstBoolean(offset + 10, $io_schd_pr_flg);
	}

	/**
	 * Generate GR/GI schedule 受払予定生成.<p>
	 *
	 */
	public void io_schd_pr_flg(boolean value) {
		setConstBoolean(offset + 10, $io_schd_pr_flg, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 11, $unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 11, $unit_cd, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 12, $dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 12, $dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 12, $dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 12, $dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 12, $dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 12, $dec_place, value);
	}


	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public String lot_mng_typ() {
		return getConstString(offset + 13, $lot_mng_typ);
	}

	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public void lot_mng_typ(String value) {
		setConstString(offset + 13, $lot_mng_typ, value);
	}


	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public String sublot_mng_typ() {
		return getConstString(offset + 14, $sublot_mng_typ);
	}

	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public void sublot_mng_typ(String value) {
		setConstString(offset + 14, $sublot_mng_typ, value);
	}


	/**
	 * Yield numerator 歩留分子.<p>
	 *
	 */
	public MCNumber nmr_qty() {
		return getConstNumber(offset + 15, $nmr_qty);
	}

	/**
	 * Yield numerator 歩留分子.<p>
	 *
	 */
	public void nmr_qty(MCNumber value) {
		setConstNumber(offset + 15, $nmr_qty, value);
	}

	/**
	 * Yield numerator 歩留分子.<p>
	 *
	 */
	public void nmr_qty(int value) {
		setConstNumber(offset + 15, $nmr_qty, value);
	}

	/**
	 * Yield numerator 歩留分子.<p>
	 *
	 */
	public void nmr_qty(long value) {
		setConstNumber(offset + 15, $nmr_qty, value);
	}

	/**
	 * Yield numerator 歩留分子.<p>
	 *
	 */
	public void nmr_qty(float value) {
		setConstNumber(offset + 15, $nmr_qty, value);
	}

	/**
	 * Yield numerator 歩留分子.<p>
	 *
	 */
	public void nmr_qty(double value) {
		setConstNumber(offset + 15, $nmr_qty, value);
	}


	/**
	 * Yield denominator 歩留分母.<p>
	 *
	 */
	public MCNumber dnm_qty() {
		return getConstNumber(offset + 16, $dnm_qty);
	}

	/**
	 * Yield denominator 歩留分母.<p>
	 *
	 */
	public void dnm_qty(MCNumber value) {
		setConstNumber(offset + 16, $dnm_qty, value);
	}

	/**
	 * Yield denominator 歩留分母.<p>
	 *
	 */
	public void dnm_qty(int value) {
		setConstNumber(offset + 16, $dnm_qty, value);
	}

	/**
	 * Yield denominator 歩留分母.<p>
	 *
	 */
	public void dnm_qty(long value) {
		setConstNumber(offset + 16, $dnm_qty, value);
	}

	/**
	 * Yield denominator 歩留分母.<p>
	 *
	 */
	public void dnm_qty(float value) {
		setConstNumber(offset + 16, $dnm_qty, value);
	}

	/**
	 * Yield denominator 歩留分母.<p>
	 *
	 */
	public void dnm_qty(double value) {
		setConstNumber(offset + 16, $dnm_qty, value);
	}


	/**
	 * Constant yield qty. 固定歩留数量.<p>
	 *
	 */
	public MCNumber fxd_yield_qty() {
		return getConstNumber(offset + 17, $fxd_yield_qty);
	}

	/**
	 * Constant yield qty. 固定歩留数量.<p>
	 *
	 */
	public void fxd_yield_qty(MCNumber value) {
		setConstNumber(offset + 17, $fxd_yield_qty, value);
	}

	/**
	 * Constant yield qty. 固定歩留数量.<p>
	 *
	 */
	public void fxd_yield_qty(int value) {
		setConstNumber(offset + 17, $fxd_yield_qty, value);
	}

	/**
	 * Constant yield qty. 固定歩留数量.<p>
	 *
	 */
	public void fxd_yield_qty(long value) {
		setConstNumber(offset + 17, $fxd_yield_qty, value);
	}

	/**
	 * Constant yield qty. 固定歩留数量.<p>
	 *
	 */
	public void fxd_yield_qty(float value) {
		setConstNumber(offset + 17, $fxd_yield_qty, value);
	}

	/**
	 * Constant yield qty. 固定歩留数量.<p>
	 *
	 */
	public void fxd_yield_qty(double value) {
		setConstNumber(offset + 17, $fxd_yield_qty, value);
	}


	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public String rqst_wg_cd() {
		return getConstString(offset + 18, $rqst_wg_cd);
	}

	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public void rqst_wg_cd(String value) {
		setConstString(offset + 18, $rqst_wg_cd, value);
	}


	/**
	 * Subcontractor cd. 外注発注先ＣＤ.<p>
	 *
	 */
	public String mfg_sppl_cd() {
		return getConstString(offset + 19, $mfg_sppl_cd);
	}

	/**
	 * Subcontractor cd. 外注発注先ＣＤ.<p>
	 *
	 */
	public void mfg_sppl_cd(String value) {
		setConstString(offset + 19, $mfg_sppl_cd, value);
	}


	/**
	 * Subcontracting maker cd. 外注メーカＣＤ.<p>
	 *
	 */
	public String mfg_maker_cd() {
		return getConstString(offset + 20, $mfg_maker_cd);
	}

	/**
	 * Subcontracting maker cd. 外注メーカＣＤ.<p>
	 *
	 */
	public void mfg_maker_cd(String value) {
		setConstString(offset + 20, $mfg_maker_cd, value);
	}


	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public MCNumber purc_lt() {
		return getConstNumber(offset + 21, $purc_lt);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(MCNumber value) {
		setConstNumber(offset + 21, $purc_lt, value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(int value) {
		setConstNumber(offset + 21, $purc_lt, value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(long value) {
		setConstNumber(offset + 21, $purc_lt, value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(float value) {
		setConstNumber(offset + 21, $purc_lt, value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(double value) {
		setConstNumber(offset + 21, $purc_lt, value);
	}


	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public MCNumber mfg_lt() {
		return getConstNumber(offset + 22, $mfg_lt);
	}

	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public void mfg_lt(MCNumber value) {
		setConstNumber(offset + 22, $mfg_lt, value);
	}

	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public void mfg_lt(int value) {
		setConstNumber(offset + 22, $mfg_lt, value);
	}

	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public void mfg_lt(long value) {
		setConstNumber(offset + 22, $mfg_lt, value);
	}

	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public void mfg_lt(float value) {
		setConstNumber(offset + 22, $mfg_lt, value);
	}

	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public void mfg_lt(double value) {
		setConstNumber(offset + 22, $mfg_lt, value);
	}


	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public MCNumber xfr_lt() {
		return getConstNumber(offset + 23, $xfr_lt);
	}

	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(MCNumber value) {
		setConstNumber(offset + 23, $xfr_lt, value);
	}

	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(int value) {
		setConstNumber(offset + 23, $xfr_lt, value);
	}

	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(long value) {
		setConstNumber(offset + 23, $xfr_lt, value);
	}

	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(float value) {
		setConstNumber(offset + 23, $xfr_lt, value);
	}

	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(double value) {
		setConstNumber(offset + 23, $xfr_lt, value);
	}


	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public MCNumber accpt_insp_lt() {
		return getConstNumber(offset + 24, $accpt_insp_lt);
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(MCNumber value) {
		setConstNumber(offset + 24, $accpt_insp_lt, value);
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(int value) {
		setConstNumber(offset + 24, $accpt_insp_lt, value);
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(long value) {
		setConstNumber(offset + 24, $accpt_insp_lt, value);
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(float value) {
		setConstNumber(offset + 24, $accpt_insp_lt, value);
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(double value) {
		setConstNumber(offset + 24, $accpt_insp_lt, value);
	}


	/**
	 * Inspection LT 検査ＬＴ.<p>
	 *
	 */
	public MCNumber insp_lt() {
		return getConstNumber(offset + 25, $insp_lt);
	}

	/**
	 * Inspection LT 検査ＬＴ.<p>
	 *
	 */
	public void insp_lt(MCNumber value) {
		setConstNumber(offset + 25, $insp_lt, value);
	}

	/**
	 * Inspection LT 検査ＬＴ.<p>
	 *
	 */
	public void insp_lt(int value) {
		setConstNumber(offset + 25, $insp_lt, value);
	}

	/**
	 * Inspection LT 検査ＬＴ.<p>
	 *
	 */
	public void insp_lt(long value) {
		setConstNumber(offset + 25, $insp_lt, value);
	}

	/**
	 * Inspection LT 検査ＬＴ.<p>
	 *
	 */
	public void insp_lt(float value) {
		setConstNumber(offset + 25, $insp_lt, value);
	}

	/**
	 * Inspection LT 検査ＬＴ.<p>
	 *
	 */
	public void insp_lt(double value) {
		setConstNumber(offset + 25, $insp_lt, value);
	}


	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public MCNumber insp_offst() {
		return getConstNumber(offset + 26, $insp_offst);
	}

	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public void insp_offst(MCNumber value) {
		setConstNumber(offset + 26, $insp_offst, value);
	}

	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public void insp_offst(int value) {
		setConstNumber(offset + 26, $insp_offst, value);
	}

	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public void insp_offst(long value) {
		setConstNumber(offset + 26, $insp_offst, value);
	}

	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public void insp_offst(float value) {
		setConstNumber(offset + 26, $insp_offst, value);
	}

	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public void insp_offst(double value) {
		setConstNumber(offset + 26, $insp_offst, value);
	}


	/**
	 * Order auto-firming period (Date) オーダ自動確定期間（日）.<p>
	 *
	 */
	public MCNumber ord_fix_pd() {
		return getConstNumber(offset + 27, $ord_fix_pd);
	}

	/**
	 * Order auto-firming period (Date) オーダ自動確定期間（日）.<p>
	 *
	 */
	public void ord_fix_pd(MCNumber value) {
		setConstNumber(offset + 27, $ord_fix_pd, value);
	}

	/**
	 * Order auto-firming period (Date) オーダ自動確定期間（日）.<p>
	 *
	 */
	public void ord_fix_pd(int value) {
		setConstNumber(offset + 27, $ord_fix_pd, value);
	}

	/**
	 * Order auto-firming period (Date) オーダ自動確定期間（日）.<p>
	 *
	 */
	public void ord_fix_pd(long value) {
		setConstNumber(offset + 27, $ord_fix_pd, value);
	}

	/**
	 * Order auto-firming period (Date) オーダ自動確定期間（日）.<p>
	 *
	 */
	public void ord_fix_pd(float value) {
		setConstNumber(offset + 27, $ord_fix_pd, value);
	}

	/**
	 * Order auto-firming period (Date) オーダ自動確定期間（日）.<p>
	 *
	 */
	public void ord_fix_pd(double value) {
		setConstNumber(offset + 27, $ord_fix_pd, value);
	}


	/**
	 * Requirements No. 所要ＮＯ.<p>
	 *
	 */
	public String rqmt_no() {
		return getConstString(offset + 28, $rqmt_no);
	}

	/**
	 * Requirements No. 所要ＮＯ.<p>
	 *
	 */
	public void rqmt_no(String value) {
		setConstString(offset + 28, $rqmt_no, value);
	}


	/**
	 * Simulation No. シミュレーションＮＯ.<p>
	 *
	 */
	public String sim_mrp_no() {
		return getConstString(offset + 29, $sim_mrp_no);
	}

	/**
	 * Simulation No. シミュレーションＮＯ.<p>
	 *
	 */
	public void sim_mrp_no(String value) {
		setConstString(offset + 29, $sim_mrp_no, value);
	}


	/**
	 * Storage location supplier cd. 格納場所発注先ＣＤ.<p>
	 *
	 */
	public String strg_sppl_cd() {
		return getConstString(offset + 30, $strg_sppl_cd);
	}

	/**
	 * Storage location supplier cd. 格納場所発注先ＣＤ.<p>
	 *
	 */
	public void strg_sppl_cd(String value) {
		setConstString(offset + 30, $strg_sppl_cd, value);
	}


	/**
	 * Storage factory/distribution warehouse cd. 格納先工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String strg_site_cd() {
		return getConstString(offset + 31, $strg_site_cd);
	}

	/**
	 * Storage factory/distribution warehouse cd. 格納先工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void strg_site_cd(String value) {
		setConstString(offset + 31, $strg_site_cd, value);
	}


	/**
	 * Storage location WG cd. 格納場所ワーキンググループＣＤ.<p>
	 *
	 */
	public String strg_wg_cd() {
		return getConstString(offset + 32, $strg_wg_cd);
	}

	/**
	 * Storage location WG cd. 格納場所ワーキンググループＣＤ.<p>
	 *
	 */
	public void strg_wg_cd(String value) {
		setConstString(offset + 32, $strg_wg_cd, value);
	}


	/**
	 * Mfg. location WG cd. 製造場所ワーキンググループＣＤ.<p>
	 *
	 */
	public String mfg_wg_cd() {
		return getConstString(offset + 33, $mfg_wg_cd);
	}

	/**
	 * Mfg. location WG cd. 製造場所ワーキンググループＣＤ.<p>
	 *
	 */
	public void mfg_wg_cd(String value) {
		setConstString(offset + 33, $mfg_wg_cd, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 34, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 34, $wg_cd, value);
	}


	/**
	 * Operation LT 工程ＬＴ.<p>
	 *
	 */
	public MCNumber oper_lt() {
		return getConstNumber(offset + 35, $oper_lt);
	}

	/**
	 * Operation LT 工程ＬＴ.<p>
	 *
	 */
	public void oper_lt(MCNumber value) {
		setConstNumber(offset + 35, $oper_lt, value);
	}

	/**
	 * Operation LT 工程ＬＴ.<p>
	 *
	 */
	public void oper_lt(int value) {
		setConstNumber(offset + 35, $oper_lt, value);
	}

	/**
	 * Operation LT 工程ＬＴ.<p>
	 *
	 */
	public void oper_lt(long value) {
		setConstNumber(offset + 35, $oper_lt, value);
	}

	/**
	 * Operation LT 工程ＬＴ.<p>
	 *
	 */
	public void oper_lt(float value) {
		setConstNumber(offset + 35, $oper_lt, value);
	}

	/**
	 * Operation LT 工程ＬＴ.<p>
	 *
	 */
	public void oper_lt(double value) {
		setConstNumber(offset + 35, $oper_lt, value);
	}


	/**
	 * Operation offset type 工程オフセット区分.<p>
	 *
	 */
	public String oper_offst_typ() {
		return getConstString(offset + 36, $oper_offst_typ);
	}

	/**
	 * Operation offset type 工程オフセット区分.<p>
	 *
	 */
	public void oper_offst_typ(String value) {
		setConstString(offset + 36, $oper_offst_typ, value);
	}


	/**
	 * Output recording operation 出来高計上工程.<p>
	 *
	 */
	public boolean yield_oper_flg() {
		return getConstBoolean(offset + 37, $yield_oper_flg);
	}

	/**
	 * Output recording operation 出来高計上工程.<p>
	 *
	 */
	public void yield_oper_flg(boolean value) {
		setConstBoolean(offset + 37, $yield_oper_flg, value);
	}


	/**
	 * Linkage scheduler type 連携スケジューラ区分.<p>
	 *
	 */
	public String if_scheduler_typ() {
		return getConstString(offset + 38, $if_scheduler_typ);
	}

	/**
	 * Linkage scheduler type 連携スケジューラ区分.<p>
	 *
	 */
	public void if_scheduler_typ(String value) {
		setConstString(offset + 38, $if_scheduler_typ, value);
	}


	/**
	 * Allow subcontracting scheduling flg. 外注スケジューリング許可ＦＬＧ.<p>
	 *
	 */
	public boolean allow_outsrc_schd_flg() {
		return getConstBoolean(offset + 39, $allow_outsrc_schd_flg);
	}

	/**
	 * Allow subcontracting scheduling flg. 外注スケジューリング許可ＦＬＧ.<p>
	 *
	 */
	public void allow_outsrc_schd_flg(boolean value) {
		setConstBoolean(offset + 39, $allow_outsrc_schd_flg, value);
	}


	public String getString(String name) {
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($oper_ord_no.equalsIgnoreCase(name)) {
			return oper_ord_no();
		}
		if ($hdr_data_crud_typ.equalsIgnoreCase(name)) {
			return hdr_data_crud_typ();
		}
		if ($itm_ord_sts_typ.equalsIgnoreCase(name)) {
			return itm_ord_sts_typ();
		}
		if ($mrp_typ.equalsIgnoreCase(name)) {
			return mrp_typ();
		}
		if ($ord_gnrt_typ.equalsIgnoreCase(name)) {
			return ord_gnrt_typ();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			return rqst_wg_cd();
		}
		if ($mfg_sppl_cd.equalsIgnoreCase(name)) {
			return mfg_sppl_cd();
		}
		if ($mfg_maker_cd.equalsIgnoreCase(name)) {
			return mfg_maker_cd();
		}
		if ($rqmt_no.equalsIgnoreCase(name)) {
			return rqmt_no();
		}
		if ($sim_mrp_no.equalsIgnoreCase(name)) {
			return sim_mrp_no();
		}
		if ($strg_sppl_cd.equalsIgnoreCase(name)) {
			return strg_sppl_cd();
		}
		if ($strg_site_cd.equalsIgnoreCase(name)) {
			return strg_site_cd();
		}
		if ($strg_wg_cd.equalsIgnoreCase(name)) {
			return strg_wg_cd();
		}
		if ($mfg_wg_cd.equalsIgnoreCase(name)) {
			return mfg_wg_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($oper_offst_typ.equalsIgnoreCase(name)) {
			return oper_offst_typ();
		}
		if ($if_scheduler_typ.equalsIgnoreCase(name)) {
			return if_scheduler_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($nmr_qty.equalsIgnoreCase(name)) {
			return nmr_qty();
		}
		if ($dnm_qty.equalsIgnoreCase(name)) {
			return dnm_qty();
		}
		if ($fxd_yield_qty.equalsIgnoreCase(name)) {
			return fxd_yield_qty();
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			return purc_lt();
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			return mfg_lt();
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			return xfr_lt();
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			return accpt_insp_lt();
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			return insp_lt();
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			return insp_offst();
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			return ord_fix_pd();
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			return oper_lt();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($oper_ord_pr_flg.equalsIgnoreCase(name)) {
			return oper_ord_pr_flg();
		}
		if ($io_schd_pr_flg.equalsIgnoreCase(name)) {
			return io_schd_pr_flg();
		}
		if ($yield_oper_flg.equalsIgnoreCase(name)) {
			return yield_oper_flg();
		}
		if ($allow_outsrc_schd_flg.equalsIgnoreCase(name)) {
			return allow_outsrc_schd_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($oper_ord_no.equalsIgnoreCase(name)) {
			return oper_ord_no();
		}
		if ($hdr_data_crud_typ.equalsIgnoreCase(name)) {
			return hdr_data_crud_typ();
		}
		if ($itm_ord_sts_typ.equalsIgnoreCase(name)) {
			return itm_ord_sts_typ();
		}
		if ($mrp_typ.equalsIgnoreCase(name)) {
			return mrp_typ();
		}
		if ($ord_gnrt_typ.equalsIgnoreCase(name)) {
			return ord_gnrt_typ();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			return rqst_wg_cd();
		}
		if ($mfg_sppl_cd.equalsIgnoreCase(name)) {
			return mfg_sppl_cd();
		}
		if ($mfg_maker_cd.equalsIgnoreCase(name)) {
			return mfg_maker_cd();
		}
		if ($rqmt_no.equalsIgnoreCase(name)) {
			return rqmt_no();
		}
		if ($sim_mrp_no.equalsIgnoreCase(name)) {
			return sim_mrp_no();
		}
		if ($strg_sppl_cd.equalsIgnoreCase(name)) {
			return strg_sppl_cd();
		}
		if ($strg_site_cd.equalsIgnoreCase(name)) {
			return strg_site_cd();
		}
		if ($strg_wg_cd.equalsIgnoreCase(name)) {
			return strg_wg_cd();
		}
		if ($mfg_wg_cd.equalsIgnoreCase(name)) {
			return mfg_wg_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($oper_offst_typ.equalsIgnoreCase(name)) {
			return oper_offst_typ();
		}
		if ($if_scheduler_typ.equalsIgnoreCase(name)) {
			return if_scheduler_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($nmr_qty.equalsIgnoreCase(name)) {
			return nmr_qty();
		}
		if ($dnm_qty.equalsIgnoreCase(name)) {
			return dnm_qty();
		}
		if ($fxd_yield_qty.equalsIgnoreCase(name)) {
			return fxd_yield_qty();
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			return purc_lt();
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			return mfg_lt();
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			return xfr_lt();
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			return accpt_insp_lt();
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			return insp_lt();
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			return insp_offst();
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			return ord_fix_pd();
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			return oper_lt();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($oper_ord_pr_flg.equalsIgnoreCase(name)) {
			return oper_ord_pr_flg();
		}
		if ($io_schd_pr_flg.equalsIgnoreCase(name)) {
			return io_schd_pr_flg();
		}
		if ($yield_oper_flg.equalsIgnoreCase(name)) {
			return yield_oper_flg();
		}
		if ($allow_outsrc_schd_flg.equalsIgnoreCase(name)) {
			return allow_outsrc_schd_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
			return;
		}
		if ($oper_ord_no.equalsIgnoreCase(name)) {
			oper_ord_no(value);
			return;
		}
		if ($hdr_data_crud_typ.equalsIgnoreCase(name)) {
			hdr_data_crud_typ(value);
			return;
		}
		if ($itm_ord_sts_typ.equalsIgnoreCase(name)) {
			itm_ord_sts_typ(value);
			return;
		}
		if ($mrp_typ.equalsIgnoreCase(name)) {
			mrp_typ(value);
			return;
		}
		if ($ord_gnrt_typ.equalsIgnoreCase(name)) {
			ord_gnrt_typ(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
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
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			rqst_wg_cd(value);
			return;
		}
		if ($mfg_sppl_cd.equalsIgnoreCase(name)) {
			mfg_sppl_cd(value);
			return;
		}
		if ($mfg_maker_cd.equalsIgnoreCase(name)) {
			mfg_maker_cd(value);
			return;
		}
		if ($rqmt_no.equalsIgnoreCase(name)) {
			rqmt_no(value);
			return;
		}
		if ($sim_mrp_no.equalsIgnoreCase(name)) {
			sim_mrp_no(value);
			return;
		}
		if ($strg_sppl_cd.equalsIgnoreCase(name)) {
			strg_sppl_cd(value);
			return;
		}
		if ($strg_site_cd.equalsIgnoreCase(name)) {
			strg_site_cd(value);
			return;
		}
		if ($strg_wg_cd.equalsIgnoreCase(name)) {
			strg_wg_cd(value);
			return;
		}
		if ($mfg_wg_cd.equalsIgnoreCase(name)) {
			mfg_wg_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($oper_offst_typ.equalsIgnoreCase(name)) {
			oper_offst_typ(value);
			return;
		}
		if ($if_scheduler_typ.equalsIgnoreCase(name)) {
			if_scheduler_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($nmr_qty.equalsIgnoreCase(name)) {
			nmr_qty(value);
			return;
		}
		if ($dnm_qty.equalsIgnoreCase(name)) {
			dnm_qty(value);
			return;
		}
		if ($fxd_yield_qty.equalsIgnoreCase(name)) {
			fxd_yield_qty(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($nmr_qty.equalsIgnoreCase(name)) {
			nmr_qty(value);
			return;
		}
		if ($dnm_qty.equalsIgnoreCase(name)) {
			dnm_qty(value);
			return;
		}
		if ($fxd_yield_qty.equalsIgnoreCase(name)) {
			fxd_yield_qty(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($nmr_qty.equalsIgnoreCase(name)) {
			nmr_qty(value);
			return;
		}
		if ($dnm_qty.equalsIgnoreCase(name)) {
			dnm_qty(value);
			return;
		}
		if ($fxd_yield_qty.equalsIgnoreCase(name)) {
			fxd_yield_qty(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($nmr_qty.equalsIgnoreCase(name)) {
			nmr_qty(value);
			return;
		}
		if ($dnm_qty.equalsIgnoreCase(name)) {
			dnm_qty(value);
			return;
		}
		if ($fxd_yield_qty.equalsIgnoreCase(name)) {
			fxd_yield_qty(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($nmr_qty.equalsIgnoreCase(name)) {
			nmr_qty(value);
			return;
		}
		if ($dnm_qty.equalsIgnoreCase(name)) {
			dnm_qty(value);
			return;
		}
		if ($fxd_yield_qty.equalsIgnoreCase(name)) {
			fxd_yield_qty(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($oper_ord_pr_flg.equalsIgnoreCase(name)) {
			oper_ord_pr_flg(value);
			return;
		}
		if ($io_schd_pr_flg.equalsIgnoreCase(name)) {
			io_schd_pr_flg(value);
			return;
		}
		if ($yield_oper_flg.equalsIgnoreCase(name)) {
			yield_oper_flg(value);
			return;
		}
		if ($allow_outsrc_schd_flg.equalsIgnoreCase(name)) {
			allow_outsrc_schd_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
			return;
		}
		if ($oper_ord_no.equalsIgnoreCase(name)) {
			oper_ord_no(value);
			return;
		}
		if ($hdr_data_crud_typ.equalsIgnoreCase(name)) {
			hdr_data_crud_typ(value);
			return;
		}
		if ($itm_ord_sts_typ.equalsIgnoreCase(name)) {
			itm_ord_sts_typ(value);
			return;
		}
		if ($mrp_typ.equalsIgnoreCase(name)) {
			mrp_typ(value);
			return;
		}
		if ($ord_gnrt_typ.equalsIgnoreCase(name)) {
			ord_gnrt_typ(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
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
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			rqst_wg_cd(value);
			return;
		}
		if ($mfg_sppl_cd.equalsIgnoreCase(name)) {
			mfg_sppl_cd(value);
			return;
		}
		if ($mfg_maker_cd.equalsIgnoreCase(name)) {
			mfg_maker_cd(value);
			return;
		}
		if ($rqmt_no.equalsIgnoreCase(name)) {
			rqmt_no(value);
			return;
		}
		if ($sim_mrp_no.equalsIgnoreCase(name)) {
			sim_mrp_no(value);
			return;
		}
		if ($strg_sppl_cd.equalsIgnoreCase(name)) {
			strg_sppl_cd(value);
			return;
		}
		if ($strg_site_cd.equalsIgnoreCase(name)) {
			strg_site_cd(value);
			return;
		}
		if ($strg_wg_cd.equalsIgnoreCase(name)) {
			strg_wg_cd(value);
			return;
		}
		if ($mfg_wg_cd.equalsIgnoreCase(name)) {
			mfg_wg_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($oper_offst_typ.equalsIgnoreCase(name)) {
			oper_offst_typ(value);
			return;
		}
		if ($if_scheduler_typ.equalsIgnoreCase(name)) {
			if_scheduler_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($nmr_qty.equalsIgnoreCase(name)) {
			nmr_qty(value);
			return;
		}
		if ($dnm_qty.equalsIgnoreCase(name)) {
			dnm_qty(value);
			return;
		}
		if ($fxd_yield_qty.equalsIgnoreCase(name)) {
			fxd_yield_qty(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($nmr_qty.equalsIgnoreCase(name)) {
			nmr_qty(value);
			return;
		}
		if ($dnm_qty.equalsIgnoreCase(name)) {
			dnm_qty(value);
			return;
		}
		if ($fxd_yield_qty.equalsIgnoreCase(name)) {
			fxd_yield_qty(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($nmr_qty.equalsIgnoreCase(name)) {
			nmr_qty(value);
			return;
		}
		if ($dnm_qty.equalsIgnoreCase(name)) {
			dnm_qty(value);
			return;
		}
		if ($fxd_yield_qty.equalsIgnoreCase(name)) {
			fxd_yield_qty(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($nmr_qty.equalsIgnoreCase(name)) {
			nmr_qty(value);
			return;
		}
		if ($dnm_qty.equalsIgnoreCase(name)) {
			dnm_qty(value);
			return;
		}
		if ($fxd_yield_qty.equalsIgnoreCase(name)) {
			fxd_yield_qty(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($nmr_qty.equalsIgnoreCase(name)) {
			nmr_qty(value);
			return;
		}
		if ($dnm_qty.equalsIgnoreCase(name)) {
			dnm_qty(value);
			return;
		}
		if ($fxd_yield_qty.equalsIgnoreCase(name)) {
			fxd_yield_qty(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($oper_ord_pr_flg.equalsIgnoreCase(name)) {
			oper_ord_pr_flg(value);
			return;
		}
		if ($io_schd_pr_flg.equalsIgnoreCase(name)) {
			io_schd_pr_flg(value);
			return;
		}
		if ($yield_oper_flg.equalsIgnoreCase(name)) {
			yield_oper_flg(value);
			return;
		}
		if ($allow_outsrc_schd_flg.equalsIgnoreCase(name)) {
			allow_outsrc_schd_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($ordif.equalsIgnoreCase(name)) {
			return ordif();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($ordif.equalsIgnoreCase(name)) {
			ordif(
				((MCContainerMeta) ordif_META).castInnerRow(mcframe.serverMS.dbc.MST_ORDER_RECV_IF_R.class, value)
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
		return ordif().data_lno();
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(MCNumber value) {
		ordif().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(int value) {
		ordif().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(long value) {
		ordif().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(float value) {
		ordif().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(double value) {
		ordif().data_lno(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public MCNumber data_no() {
		return ordif().data_no();
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(MCNumber value) {
		ordif().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(int value) {
		ordif().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(long value) {
		ordif().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(float value) {
		ordif().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(double value) {
		ordif().data_no(value);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return ordif().data_crud_typ();
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		ordif().data_crud_typ(value);
	}

	/**
	 * PG execution status type ＰＧ実行状況区分.<p>
	 *
	 */
	public String exe_sts_typ() {
		return ordif().exe_sts_typ();
	}

	/**
	 * PG execution status type ＰＧ実行状況区分.<p>
	 *
	 */
	public void exe_sts_typ(String value) {
		ordif().exe_sts_typ(value);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return ordif().ext_sys_cd();
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		ordif().ext_sys_cd(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public MCNumber ext_data_lno() {
		return ordif().ext_data_lno();
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(MCNumber value) {
		ordif().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(int value) {
		ordif().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(long value) {
		ordif().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(float value) {
		ordif().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(double value) {
		ordif().ext_data_lno(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public MCNumber ext_data_no() {
		return ordif().ext_data_no();
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(MCNumber value) {
		ordif().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(int value) {
		ordif().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(long value) {
		ordif().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(float value) {
		ordif().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(double value) {
		ordif().ext_data_no(value);
	}

	/**
	 * Creation date and time of source record 送信元レコード作成日時.<p>
	 *
	 */
	public MCDate data_make_dt() {
		return ordif().data_make_dt();
	}

	/**
	 * Creation date and time of source record 送信元レコード作成日時.<p>
	 *
	 */
	public void data_make_dt(MCDate value) {
		ordif().data_make_dt(value);
	}

	/**
	 * To import flg. 取込対象ＦＬＧ.<p>
	 *
	 */
	public boolean imp_flg() {
		return ordif().imp_flg();
	}

	/**
	 * To import flg. 取込対象ＦＬＧ.<p>
	 *
	 */
	public void imp_flg(boolean value) {
		ordif().imp_flg(value);
	}

	/**
	 * Receiving date 受信日.<p>
	 *
	 */
	public MCDate recv_dt() {
		return ordif().recv_dt();
	}

	/**
	 * Receiving date 受信日.<p>
	 *
	 */
	public void recv_dt(MCDate value) {
		ordif().recv_dt(value);
	}

	/**
	 * External item order No. 外部品目オーダＮＯ.<p>
	 *
	 */
	public String ext_itm_ord_no() {
		return ordif().ext_itm_ord_no();
	}

	/**
	 * External item order No. 外部品目オーダＮＯ.<p>
	 *
	 */
	public void ext_itm_ord_no(String value) {
		ordif().ext_itm_ord_no(value);
	}

	/**
	 * External operation order No. 外部工程オーダＮＯ.<p>
	 *
	 */
	public String ext_oper_ord_no() {
		return ordif().ext_oper_ord_no();
	}

	/**
	 * External operation order No. 外部工程オーダＮＯ.<p>
	 *
	 */
	public void ext_oper_ord_no(String value) {
		ordif().ext_oper_ord_no(value);
	}

	/**
	 * Order type オーダ区分.<p>
	 *
	 */
	public String itm_ord_typ() {
		return ordif().itm_ord_typ();
	}

	/**
	 * Order type オーダ区分.<p>
	 *
	 */
	public void itm_ord_typ(String value) {
		ordif().itm_ord_typ(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return ordif().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		ordif().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return ordif().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		ordif().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return ordif().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		ordif().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return ordif().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		ordif().itm_sub3(value);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return ordif().itm_nm();
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		ordif().itm_nm(value);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return ordif().ver_no();
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		ordif().ver_no(value);
	}

	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public String strg_loc_cd() {
		return ordif().strg_loc_cd();
	}

	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public void strg_loc_cd(String value) {
		ordif().strg_loc_cd(value);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return ordif().mfg_loc_cd();
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		ordif().mfg_loc_cd(value);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return ordif().bom_ptn();
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		ordif().bom_ptn(value);
	}

	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public String oper_ptn() {
		return ordif().oper_ptn();
	}

	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public void oper_ptn(String value) {
		ordif().oper_ptn(value);
	}

	/**
	 * Order scheduled qty. 指図予定数量.<p>
	 *
	 */
	public MCNumber inst_qty() {
		return ordif().inst_qty();
	}

	/**
	 * Order scheduled qty. 指図予定数量.<p>
	 *
	 */
	public void inst_qty(MCNumber value) {
		ordif().inst_qty(value);
	}

	/**
	 * Order scheduled qty. 指図予定数量.<p>
	 *
	 */
	public void inst_qty(int value) {
		ordif().inst_qty(value);
	}

	/**
	 * Order scheduled qty. 指図予定数量.<p>
	 *
	 */
	public void inst_qty(long value) {
		ordif().inst_qty(value);
	}

	/**
	 * Order scheduled qty. 指図予定数量.<p>
	 *
	 */
	public void inst_qty(float value) {
		ordif().inst_qty(value);
	}

	/**
	 * Order scheduled qty. 指図予定数量.<p>
	 *
	 */
	public void inst_qty(double value) {
		ordif().inst_qty(value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public MCNumber yield_schd_qty() {
		return ordif().yield_schd_qty();
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void yield_schd_qty(MCNumber value) {
		ordif().yield_schd_qty(value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void yield_schd_qty(int value) {
		ordif().yield_schd_qty(value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void yield_schd_qty(long value) {
		ordif().yield_schd_qty(value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void yield_schd_qty(float value) {
		ordif().yield_schd_qty(value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void yield_schd_qty(double value) {
		ordif().yield_schd_qty(value);
	}

	/**
	 * Scheduled PO date 発注予定日.<p>
	 *
	 */
	public MCDate po_schd_dt() {
		return ordif().po_schd_dt();
	}

	/**
	 * Scheduled PO date 発注予定日.<p>
	 *
	 */
	public void po_schd_dt(MCDate value) {
		ordif().po_schd_dt(value);
	}

	/**
	 * Scheduled mfg. start date 製造着手予定日.<p>
	 *
	 */
	public MCDate mfg_st_schd_dt() {
		return ordif().mfg_st_schd_dt();
	}

	/**
	 * Scheduled mfg. start date 製造着手予定日.<p>
	 *
	 */
	public void mfg_st_schd_dt(MCDate value) {
		ordif().mfg_st_schd_dt(value);
	}

	/**
	 * Scheduled mfg. end date 製造終了予定日.<p>
	 *
	 */
	public MCDate mfg_end_schd_dt() {
		return ordif().mfg_end_schd_dt();
	}

	/**
	 * Scheduled mfg. end date 製造終了予定日.<p>
	 *
	 */
	public void mfg_end_schd_dt(MCDate value) {
		ordif().mfg_end_schd_dt(value);
	}

	/**
	 * Scheduled storage completion date 格納完了予定日.<p>
	 *
	 */
	public MCDate strg_schd_dt() {
		return ordif().strg_schd_dt();
	}

	/**
	 * Scheduled storage completion date 格納完了予定日.<p>
	 *
	 */
	public void strg_schd_dt(MCDate value) {
		ordif().strg_schd_dt(value);
	}

	/**
	 * Scheduled acceptance date 検収予定日.<p>
	 *
	 */
	public MCDate accpt_schd_dt() {
		return ordif().accpt_schd_dt();
	}

	/**
	 * Scheduled acceptance date 検収予定日.<p>
	 *
	 */
	public void accpt_schd_dt(MCDate value) {
		ordif().accpt_schd_dt(value);
	}

	/**
	 * Scheduled inspection start date 検査着手予定日.<p>
	 *
	 */
	public MCDate insp_st_schd_dt() {
		return ordif().insp_st_schd_dt();
	}

	/**
	 * Scheduled inspection start date 検査着手予定日.<p>
	 *
	 */
	public void insp_st_schd_dt(MCDate value) {
		ordif().insp_st_schd_dt(value);
	}

	/**
	 * Scheduled inspection end date 検査終了予定日.<p>
	 *
	 */
	public MCDate insp_end_schd_dt() {
		return ordif().insp_end_schd_dt();
	}

	/**
	 * Scheduled inspection end date 検査終了予定日.<p>
	 *
	 */
	public void insp_end_schd_dt(MCDate value) {
		ordif().insp_end_schd_dt(value);
	}

	/**
	 * Available date 使用可能予定日.<p>
	 *
	 */
	public MCDate avl_schd_dt() {
		return ordif().avl_schd_dt();
	}

	/**
	 * Available date 使用可能予定日.<p>
	 *
	 */
	public void avl_schd_dt(MCDate value) {
		ordif().avl_schd_dt(value);
	}

	/**
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public MCDate master_dt() {
		return ordif().master_dt();
	}

	/**
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public void master_dt(MCDate value) {
		ordif().master_dt(value);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return ordif().sno1();
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		ordif().sno1(value);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return ordif().sno2();
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		ordif().sno2(value);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return ordif().sno3();
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		ordif().sno3(value);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return ordif().sno4();
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		ordif().sno4(value);
	}

	/**
	 * Order/PO contact remarks 指図・発注連絡備考.<p>
	 *
	 */
	public String inst_po_cnt_rmrks() {
		return ordif().inst_po_cnt_rmrks();
	}

	/**
	 * Order/PO contact remarks 指図・発注連絡備考.<p>
	 *
	 */
	public void inst_po_cnt_rmrks(String value) {
		ordif().inst_po_cnt_rmrks(value);
	}

	/**
	 * Item order internal remarks 品目オーダ内部備考.<p>
	 *
	 */
	public String itm_ord_intr_rmrks() {
		return ordif().itm_ord_intr_rmrks();
	}

	/**
	 * Item order internal remarks 品目オーダ内部備考.<p>
	 *
	 */
	public void itm_ord_intr_rmrks(String value) {
		ordif().itm_ord_intr_rmrks(value);
	}

	/**
	 * Item order spare 1 品目オーダ予備１.<p>
	 *
	 */
	public String itm_ord_sub_char1() {
		return ordif().itm_ord_sub_char1();
	}

	/**
	 * Item order spare 1 品目オーダ予備１.<p>
	 *
	 */
	public void itm_ord_sub_char1(String value) {
		ordif().itm_ord_sub_char1(value);
	}

	/**
	 * Item order spare 2 品目オーダ予備２.<p>
	 *
	 */
	public String itm_ord_sub_char2() {
		return ordif().itm_ord_sub_char2();
	}

	/**
	 * Item order spare 2 品目オーダ予備２.<p>
	 *
	 */
	public void itm_ord_sub_char2(String value) {
		ordif().itm_ord_sub_char2(value);
	}

	/**
	 * Item order spare 3 品目オーダ予備３.<p>
	 *
	 */
	public String itm_ord_sub_char3() {
		return ordif().itm_ord_sub_char3();
	}

	/**
	 * Item order spare 3 品目オーダ予備３.<p>
	 *
	 */
	public void itm_ord_sub_char3(String value) {
		ordif().itm_ord_sub_char3(value);
	}

	/**
	 * Scheduled operation start date and time 工程着手予定日時.<p>
	 *
	 */
	public MCDate st_schd_tm() {
		return ordif().st_schd_tm();
	}

	/**
	 * Scheduled operation start date and time 工程着手予定日時.<p>
	 *
	 */
	public void st_schd_tm(MCDate value) {
		ordif().st_schd_tm(value);
	}

	/**
	 * Scheduled operation end date and time 工程終了予定日時.<p>
	 *
	 */
	public MCDate end_schd_tm() {
		return ordif().end_schd_tm();
	}

	/**
	 * Scheduled operation end date and time 工程終了予定日時.<p>
	 *
	 */
	public void end_schd_tm(MCDate value) {
		ordif().end_schd_tm(value);
	}

	/**
	 * Operation order scheduled qty. 工程指図予定数量.<p>
	 *
	 */
	public MCNumber oper_schd_qty() {
		return ordif().oper_schd_qty();
	}

	/**
	 * Operation order scheduled qty. 工程指図予定数量.<p>
	 *
	 */
	public void oper_schd_qty(MCNumber value) {
		ordif().oper_schd_qty(value);
	}

	/**
	 * Operation order scheduled qty. 工程指図予定数量.<p>
	 *
	 */
	public void oper_schd_qty(int value) {
		ordif().oper_schd_qty(value);
	}

	/**
	 * Operation order scheduled qty. 工程指図予定数量.<p>
	 *
	 */
	public void oper_schd_qty(long value) {
		ordif().oper_schd_qty(value);
	}

	/**
	 * Operation order scheduled qty. 工程指図予定数量.<p>
	 *
	 */
	public void oper_schd_qty(float value) {
		ordif().oper_schd_qty(value);
	}

	/**
	 * Operation order scheduled qty. 工程指図予定数量.<p>
	 *
	 */
	public void oper_schd_qty(double value) {
		ordif().oper_schd_qty(value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return ordif().disp_seq();
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		ordif().disp_seq(value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(int value) {
		ordif().disp_seq(value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(long value) {
		ordif().disp_seq(value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(float value) {
		ordif().disp_seq(value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(double value) {
		ordif().disp_seq(value);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return ordif().oper_cd();
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		ordif().oper_cd(value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public MCNumber oper_seq() {
		return ordif().oper_seq();
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(MCNumber value) {
		ordif().oper_seq(value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(int value) {
		ordif().oper_seq(value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(long value) {
		ordif().oper_seq(value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(float value) {
		ordif().oper_seq(value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(double value) {
		ordif().oper_seq(value);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return ordif().loc_cd();
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		ordif().loc_cd(value);
	}

	/**
	 * Operation resources 工程資源.<p>
	 *
	 */
	public String oper_rsrc() {
		return ordif().oper_rsrc();
	}

	/**
	 * Operation resources 工程資源.<p>
	 *
	 */
	public void oper_rsrc(String value) {
		ordif().oper_rsrc(value);
	}

	/**
	 * Operation order internal remarks 工程オーダ内部備考.<p>
	 *
	 */
	public String oper_ord_intr_rmrks() {
		return ordif().oper_ord_intr_rmrks();
	}

	/**
	 * Operation order internal remarks 工程オーダ内部備考.<p>
	 *
	 */
	public void oper_ord_intr_rmrks(String value) {
		ordif().oper_ord_intr_rmrks(value);
	}

	/**
	 * Operation order spare 1 工程オーダ予備１.<p>
	 *
	 */
	public String oper_ord_sub_char1() {
		return ordif().oper_ord_sub_char1();
	}

	/**
	 * Operation order spare 1 工程オーダ予備１.<p>
	 *
	 */
	public void oper_ord_sub_char1(String value) {
		ordif().oper_ord_sub_char1(value);
	}

	/**
	 * Operation order spare 2 工程オーダ予備２.<p>
	 *
	 */
	public String oper_ord_sub_char2() {
		return ordif().oper_ord_sub_char2();
	}

	/**
	 * Operation order spare 2 工程オーダ予備２.<p>
	 *
	 */
	public void oper_ord_sub_char2(String value) {
		ordif().oper_ord_sub_char2(value);
	}

	/**
	 * Operation order spare 3 工程オーダ予備３.<p>
	 *
	 */
	public String oper_ord_sub_char3() {
		return ordif().oper_ord_sub_char3();
	}

	/**
	 * Operation order spare 3 工程オーダ予備３.<p>
	 *
	 */
	public void oper_ord_sub_char3(String value) {
		ordif().oper_ord_sub_char3(value);
	}

	/**
	 * Scheduler frozen スケジューラ凍結.<p>
	 *
	 */
	public boolean scheduler_frozen_flg() {
		return ordif().scheduler_frozen_flg();
	}

	/**
	 * Scheduler frozen スケジューラ凍結.<p>
	 *
	 */
	public void scheduler_frozen_flg(boolean value) {
		ordif().scheduler_frozen_flg(value);
	}

}

