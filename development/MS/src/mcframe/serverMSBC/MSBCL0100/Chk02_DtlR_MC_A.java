package mcframe.serverMSBC.MSBCL0100;

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
 * ブロック"Chk02_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Chk02_DtlR_MC_A extends MCConstRow {

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
	public static final String $ord = "ord";
	/**
	 * Item name 品名.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public static final String $unit_cd = "unit_cd";
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public static final String $unit_nm = "unit_nm";
	/**
	 * Mfg. factory/distribution warehouse cd. 製造場所工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $mfg_site_cd = "mfg_site_cd";
	/**
	 * Mfg. factory/distribution warehouse name 製造場所工場・物流倉庫名.<p>
	 *
	 */
	public static final String $mfg_site_nm = "mfg_site_nm";
	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public static final String $mfg_loc_grp_cd = "mfg_loc_grp_cd";
	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public static final String $mfg_loc_grp_nm = "mfg_loc_grp_nm";
	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public static final String $mfg_loc_nm = "mfg_loc_nm";
	/**
	 * Operation location name 工程場所名.<p>
	 *
	 */
	public static final String $loc_nm = "loc_nm";
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public static final String $itm_typ = "itm_typ";
	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public static final String $itm_typ_nm = "itm_typ_nm";
	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public static final String $itm_typ_d_cd = "itm_typ_d_cd";
	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public static final String $itm_typ_d_nm = "itm_typ_d_nm";
	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public static final String $wrk_no = "wrk_no";
	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public static final String $wrk_nm = "wrk_nm";
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public static final String $ext_sys_nm = "ext_sys_nm";
	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public static final String $rtn_sts_typ = "rtn_sts_typ";
	public static final String $oord = "oord";
	/**
	 * Operation status name 工程状況名.<p>
	 *
	 */
	public static final String $oper_ord_sts_typ_nm = "oper_ord_sts_typ_nm";
	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public static final String $oper_nm = "oper_nm";

	public static final String $itm_ord_no = $ord + ".itm_ord_no";
	public static final String $itm_ord_typ = $ord + ".itm_ord_typ";
	public static final String $ord_gnrt_typ = $ord + ".ord_gnrt_typ";
	public static final String $itm_cd = $ord + ".itm_cd";
	public static final String $itm_sub1 = $ord + ".itm_sub1";
	public static final String $itm_sub2 = $ord + ".itm_sub2";
	public static final String $itm_sub3 = $ord + ".itm_sub3";
	public static final String $ver_no = $ord + ".ver_no";
	public static final String $strg_loc_cd = $ord + ".strg_loc_cd";
	public static final String $mfg_loc_cd = $ord + ".mfg_loc_cd";
	public static final String $mst_mfg_loc_cd = $ord + ".mst_mfg_loc_cd";
	public static final String $sppl_cd = $ord + ".sppl_cd";
	public static final String $maker_cd = $ord + ".maker_cd";
	public static final String $rqst_loc_cd = $ord + ".rqst_loc_cd";
	public static final String $rqst_wg_cd = $ord + ".rqst_wg_cd";
	public static final String $bom_ptn = $ord + ".bom_ptn";
	public static final String $oper_ptn = $ord + ".oper_ptn";
	public static final String $inst_qty = $ord + ".inst_qty";
	public static final String $yield_schd_qty = $ord + ".yield_schd_qty";
	public static final String $nmr_qty = $ord + ".nmr_qty";
	public static final String $dnm_qty = $ord + ".dnm_qty";
	public static final String $fxd_yield_qty = $ord + ".fxd_yield_qty";
	public static final String $itm_ord_sts_typ = $ord + ".itm_ord_sts_typ";
	public static final String $fix_dt = $ord + ".fix_dt";
	public static final String $po_schd_dt = $ord + ".po_schd_dt";
	public static final String $mrp_po_schd_dt = $ord + ".mrp_po_schd_dt";
	public static final String $mrp_purc_lt = $ord + ".mrp_purc_lt";
	public static final String $purc_lt = $ord + ".purc_lt";
	public static final String $mfg_st_schd_dt = $ord + ".mfg_st_schd_dt";
	public static final String $mrp_mfg_st_schd_dt = $ord + ".mrp_mfg_st_schd_dt";
	public static final String $mfg_end_schd_dt = $ord + ".mfg_end_schd_dt";
	public static final String $mrp_mfg_end_schd_dt = $ord + ".mrp_mfg_end_schd_dt";
	public static final String $mrp_mfg_lt = $ord + ".mrp_mfg_lt";
	public static final String $mfg_lt = $ord + ".mfg_lt";
	public static final String $gi_schd_dt = $ord + ".gi_schd_dt";
	public static final String $mrp_gi_schd_dt = $ord + ".mrp_gi_schd_dt";
	public static final String $strg_schd_dt = $ord + ".strg_schd_dt";
	public static final String $mrp_strg_schd_dt = $ord + ".mrp_strg_schd_dt";
	public static final String $xfr_lt = $ord + ".xfr_lt";
	public static final String $accpt_schd_dt = $ord + ".accpt_schd_dt";
	public static final String $mrp_accpt_schd_dt = $ord + ".mrp_accpt_schd_dt";
	public static final String $accpt_insp_lt = $ord + ".accpt_insp_lt";
	public static final String $insp_st_schd_dt = $ord + ".insp_st_schd_dt";
	public static final String $mrp_insp_st_schd_dt = $ord + ".mrp_insp_st_schd_dt";
	public static final String $insp_end_schd_dt = $ord + ".insp_end_schd_dt";
	public static final String $mrp_insp_end_schd_dt = $ord + ".mrp_insp_end_schd_dt";
	public static final String $insp_lt = $ord + ".insp_lt";
	public static final String $insp_offst = $ord + ".insp_offst";
	public static final String $avl_schd_dt = $ord + ".avl_schd_dt";
	public static final String $mrp_avl_schd_dt = $ord + ".mrp_avl_schd_dt";
	public static final String $master_dt = $ord + ".master_dt";
	public static final String $sno1 = $ord + ".sno1";
	public static final String $sno_typ1 = $ord + ".sno_typ1";
	public static final String $sno2 = $ord + ".sno2";
	public static final String $sno_typ2 = $ord + ".sno_typ2";
	public static final String $sno3 = $ord + ".sno3";
	public static final String $sno_typ3 = $ord + ".sno_typ3";
	public static final String $sno4 = $ord + ".sno4";
	public static final String $sno_typ4 = $ord + ".sno_typ4";
	public static final String $lmt_dt = $ord + ".lmt_dt";
	public static final String $wg_cd = $ord + ".wg_cd";
	public static final String $not_fix_flg = $ord + ".not_fix_flg";
	public static final String $ord_fix_pd = $ord + ".ord_fix_pd";
	public static final String $rqmt_no = $ord + ".rqmt_no";
	public static final String $inst_po_cnt_rmrks = $ord + ".inst_po_cnt_rmrks";
	public static final String $sim_mrp_no = $ord + ".sim_mrp_no";
	public static final String $io_schd_pr_no = $ord + ".io_schd_pr_no";
	public static final String $itm_order_upd_cntr = $ord + ".upd_cntr";
	public static final String $ord_rcv_flg = $ord + ".ord_rcv_flg";
	public static final String $ord_snd_flg = $ord + ".ord_snd_flg";
	public static final String $ext_sys_cd = $ord + ".ext_sys_cd";
	public static final String $ext_itm_ord_no = $ord + ".ext_itm_ord_no";
	public static final String $oper_ord_no = $oord + ".oper_ord_no";
	public static final String $oper_ord_sts_typ = $oord + ".oper_ord_sts_typ";
	public static final String $oper_cd = $oord + ".oper_cd";
	public static final String $oper_seq = $oord + ".oper_seq";
	public static final String $loc_cd = $oord + ".loc_cd";
	public static final String $disp_seq = $oord + ".disp_seq";
	public static final String $oper_schd_qty = $oord + ".oper_schd_qty";
	public static final String $yield_oper_flg = $oord + ".yield_oper_flg";
	public static final String $st_schd_tm = $oord + ".st_schd_tm";
	public static final String $inst_st_schd_tm = $oord + ".inst_st_schd_tm";
	public static final String $act_st_tm = $oord + ".act_st_tm";
	public static final String $end_schd_tm = $oord + ".end_schd_tm";
	public static final String $inst_end_schd_tm = $oord + ".inst_end_schd_tm";
	public static final String $act_end_tm = $oord + ".act_end_tm";
	public static final String $oper_lt = $oord + ".oper_lt";
	public static final String $oper_offst_typ = $oord + ".oper_offst_typ";
	public static final String $oper_offst = $oord + ".oper_offst";
	public static final String $oper_rsrc = $oord + ".oper_rsrc";
	public static final String $intr_rmrks = $oord + ".intr_rmrks";
	public static final String $sub_char1 = $oord + ".sub_char1";
	public static final String $sub_char2 = $oord + ".sub_char2";
	public static final String $sub_char3 = $oord + ".sub_char3";
	public static final String $ext_oper_ord_no = $oord + ".ext_oper_ord_no";
	public static final String $scheduler_frozen_flg = $oord + ".scheduler_frozen_flg";

	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ord_META = createInnerRowMeta($ord, mcframe.serverMS.dbc.MST_ITM_ORDER_R.class);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta unit_nm_META = createCommonMeta($unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta mfg_site_cd_META = createCommonMeta($mfg_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta mfg_site_nm_META = createCommonMeta($mfg_site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta mfg_loc_grp_cd_META = createCommonMeta($mfg_loc_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta mfg_loc_grp_nm_META = createCommonMeta($mfg_loc_grp_nm, mcframe.commonMA.meta.MA_META.LOC_GRP_NM);
	public static final MCMeta mfg_loc_nm_META = createCommonMeta($mfg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta ext_sys_nm_META = createCommonMeta($ext_sys_nm, mcframe.commonMA.meta.MA_META.EXT_SYS_NM);
	public static final MCMeta rtn_sts_typ_META = createCommonMeta($rtn_sts_typ, mcframe.commonMA.meta.MA_META.RTN_STS_TYP);
	public static final MCMeta oord_META = createInnerRowMeta($oord, mcframe.serverMS.dbc.MST_OPER_ORDER_R.class);
	public static final MCMeta oper_ord_sts_typ_nm_META = createCommonMeta($oper_ord_sts_typ_nm, mcframe.commonMS.meta.MS_META.OPER_ORD_STS_TYP_NM);
	public static final MCMeta oper_nm_META = createCommonMeta($oper_nm, mcframe.commonMA.meta.MA_META.OPER_NM);

	protected static final ConstMetaList<Chk02_DtlR> constMetas = new ConstMetaList<Chk02_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			err_flg_META,
			ord_META,
			itm_nm_META,
			unit_cd_META,
			unit_nm_META,
			mfg_site_cd_META,
			mfg_site_nm_META,
			mfg_loc_grp_cd_META,
			mfg_loc_grp_nm_META,
			mfg_loc_nm_META,
			loc_nm_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			wrk_no_META,
			wrk_nm_META,
			wg_nm_META,
			ext_sys_nm_META,
			rtn_sts_typ_META,
			oord_META,
			oper_ord_sts_typ_nm_META,
			oper_nm_META
		},
		new String[][]{
			{
				"itm_ord_no",
				"itm_ord_typ",
				"ord_gnrt_typ",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"ver_no",
				"strg_loc_cd",
				"mfg_loc_cd",
				"mst_mfg_loc_cd",
				"sppl_cd",
				"maker_cd",
				"rqst_loc_cd",
				"rqst_wg_cd",
				"bom_ptn",
				"oper_ptn",
				"inst_qty",
				"yield_schd_qty",
				"nmr_qty",
				"dnm_qty",
				"fxd_yield_qty",
				"itm_ord_sts_typ",
				"fix_dt",
				"po_schd_dt",
				"mrp_po_schd_dt",
				"mrp_purc_lt",
				"purc_lt",
				"mfg_st_schd_dt",
				"mrp_mfg_st_schd_dt",
				"mfg_end_schd_dt",
				"mrp_mfg_end_schd_dt",
				"mrp_mfg_lt",
				"mfg_lt",
				"gi_schd_dt",
				"mrp_gi_schd_dt",
				"strg_schd_dt",
				"mrp_strg_schd_dt",
				"xfr_lt",
				"accpt_schd_dt",
				"mrp_accpt_schd_dt",
				"accpt_insp_lt",
				"insp_st_schd_dt",
				"mrp_insp_st_schd_dt",
				"insp_end_schd_dt",
				"mrp_insp_end_schd_dt",
				"insp_lt",
				"insp_offst",
				"avl_schd_dt",
				"mrp_avl_schd_dt",
				"master_dt",
				"sno1",
				"sno_typ1",
				"sno2",
				"sno_typ2",
				"sno3",
				"sno_typ3",
				"sno4",
				"sno_typ4",
				"lmt_dt",
				"wg_cd",
				"not_fix_flg",
				"ord_fix_pd",
				"rqmt_no",
				"inst_po_cnt_rmrks",
				"sim_mrp_no",
				"io_schd_pr_no",
				"itm_order_upd_cntr",
				"ord_rcv_flg",
				"ord_snd_flg",
				"ext_sys_cd",
				"ext_itm_ord_no",
				"oper_ord_no",
				"oper_ord_sts_typ",
				"oper_cd",
				"oper_seq",
				"loc_cd",
				"disp_seq",
				"oper_schd_qty",
				"yield_oper_flg",
				"st_schd_tm",
				"inst_st_schd_tm",
				"act_st_tm",
				"end_schd_tm",
				"inst_end_schd_tm",
				"act_end_tm",
				"oper_lt",
				"oper_offst_typ",
				"oper_offst",
				"oper_rsrc",
				"intr_rmrks",
				"sub_char1",
				"sub_char2",
				"sub_char3",
				"ext_oper_ord_no",
				"scheduler_frozen_flg"
			},
			{
				$itm_ord_no,
				$itm_ord_typ,
				$ord_gnrt_typ,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$ver_no,
				$strg_loc_cd,
				$mfg_loc_cd,
				$mst_mfg_loc_cd,
				$sppl_cd,
				$maker_cd,
				$rqst_loc_cd,
				$rqst_wg_cd,
				$bom_ptn,
				$oper_ptn,
				$inst_qty,
				$yield_schd_qty,
				$nmr_qty,
				$dnm_qty,
				$fxd_yield_qty,
				$itm_ord_sts_typ,
				$fix_dt,
				$po_schd_dt,
				$mrp_po_schd_dt,
				$mrp_purc_lt,
				$purc_lt,
				$mfg_st_schd_dt,
				$mrp_mfg_st_schd_dt,
				$mfg_end_schd_dt,
				$mrp_mfg_end_schd_dt,
				$mrp_mfg_lt,
				$mfg_lt,
				$gi_schd_dt,
				$mrp_gi_schd_dt,
				$strg_schd_dt,
				$mrp_strg_schd_dt,
				$xfr_lt,
				$accpt_schd_dt,
				$mrp_accpt_schd_dt,
				$accpt_insp_lt,
				$insp_st_schd_dt,
				$mrp_insp_st_schd_dt,
				$insp_end_schd_dt,
				$mrp_insp_end_schd_dt,
				$insp_lt,
				$insp_offst,
				$avl_schd_dt,
				$mrp_avl_schd_dt,
				$master_dt,
				$sno1,
				$sno_typ1,
				$sno2,
				$sno_typ2,
				$sno3,
				$sno_typ3,
				$sno4,
				$sno_typ4,
				$lmt_dt,
				$wg_cd,
				$not_fix_flg,
				$ord_fix_pd,
				$rqmt_no,
				$inst_po_cnt_rmrks,
				$sim_mrp_no,
				$io_schd_pr_no,
				$itm_order_upd_cntr,
				$ord_rcv_flg,
				$ord_snd_flg,
				$ext_sys_cd,
				$ext_itm_ord_no,
				$oper_ord_no,
				$oper_ord_sts_typ,
				$oper_cd,
				$oper_seq,
				$loc_cd,
				$disp_seq,
				$oper_schd_qty,
				$yield_oper_flg,
				$st_schd_tm,
				$inst_st_schd_tm,
				$act_st_tm,
				$end_schd_tm,
				$inst_end_schd_tm,
				$act_end_tm,
				$oper_lt,
				$oper_offst_typ,
				$oper_offst,
				$oper_rsrc,
				$intr_rmrks,
				$sub_char1,
				$sub_char2,
				$sub_char3,
				$ext_oper_ord_no,
				$scheduler_frozen_flg
			}
		}
	);

	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";
	/** 項目属性情報のグループ[REQ_UPD_CNT_CHK]のキー定数 */
	public static final String $$REQ_UPD_CNT_CHK = "REQ_UPD_CNT_CHK";
	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";
	/** 項目属性情報のグループ[CHK_NUM]のキー定数 */
	public static final String $$CHK_NUM = "CHK_NUM";
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

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$itm_typ, "MAC_ITM_TYP"},	// itm_typ
				{$oord + ".oper_ord_sts_typ", "MSC_OPER_ORD_STS_TYP"}	// oord.oper_ord_sts_typ
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$ord + ".itm_ord_no", "E"},	// ord.itm_ord_no
				{$ord + ".itm_cd", "E"},	// ord.itm_cd
				{$ord + ".itm_sub1", "E"},	// ord.itm_sub1
				{$ord + ".itm_sub2", "E"},	// ord.itm_sub2
				{$ord + ".itm_sub3", "E"},	// ord.itm_sub3
				{$ord + ".oper_ptn", "E"},	// ord.oper_ptn
				{$oord + ".oper_ord_sts_typ", "E"},	// oord.oper_ord_sts_typ
				{$oord + ".oper_seq", "E"},	// oord.oper_seq
				{$oord + ".loc_cd", "E"},	// oord.loc_cd
				{$oord + ".oper_schd_qty", "E"},	// oord.oper_schd_qty
				{$oord + ".st_schd_tm", "E"},	// oord.st_schd_tm
				{$oord + ".end_schd_tm", "E"}	// oord.end_schd_tm
			}
		)),
		new MCExtMap.Entry($$REQ_UPD_CNT_CHK, new MCExtList(
			new String[][]{
				{$ord + ".itm_ord_no", "E"}	// ord.itm_ord_no
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
				{$ord + ".itm_sub1", "E"},	// ord.itm_sub1
				{$ord + ".itm_sub2", "E"},	// ord.itm_sub2
				{$ord + ".itm_sub3", "E"},	// ord.itm_sub3
				{$oord + ".oper_cd", "E"}	// oord.oper_cd
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
				{$oord + ".oper_schd_qty", "positive"}	// oord.oper_schd_qty
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$oord + ".oper_cd", "MA.MAUAL0010.Oper"},	// oord.oper_cd
				{$oord + ".loc_cd", "MA.MAUAL0010.Loc"}	// oord.loc_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$oord + ".oper_cd", "oper_nm"},	// oord.oper_cd
				{$oord + ".loc_cd", "loc_nm"}	// oord.loc_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$oord + ".oper_cd", "oper_nm"},	// oord.oper_cd
				{$oord + ".loc_cd", "loc_nm"}	// oord.loc_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
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
	protected Chk02_DtlR_MC_A(ConstMetaList<? extends Chk02_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk02_DtlR clone() {
		return (Chk02_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk02_DtlR createInstance() {
		return (Chk02_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk02_DtlR getValues(String... names) {
		return (Chk02_DtlR) super.getValues(names);
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


	public mcframe.serverMS.dbc.MST_ITM_ORDER_R ord(){
		return (mcframe.serverMS.dbc.MST_ITM_ORDER_R) getConstInnerRow(offset + 2, $ord);
	}
	
	public void ord(mcframe.serverMS.dbc.MST_ITM_ORDER_R row){
		setConstInnerRow(offset + 2, $ord, row);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 3, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 3, $itm_nm, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 4, $unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 4, $unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String unit_nm() {
		return getConstString(offset + 5, $unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void unit_nm(String value) {
		setConstString(offset + 5, $unit_nm, value);
	}


	/**
	 * Mfg. factory/distribution warehouse cd. 製造場所工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String mfg_site_cd() {
		return getConstString(offset + 6, $mfg_site_cd);
	}

	/**
	 * Mfg. factory/distribution warehouse cd. 製造場所工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void mfg_site_cd(String value) {
		setConstString(offset + 6, $mfg_site_cd, value);
	}


	/**
	 * Mfg. factory/distribution warehouse name 製造場所工場・物流倉庫名.<p>
	 *
	 */
	public String mfg_site_nm() {
		return getConstString(offset + 7, $mfg_site_nm);
	}

	/**
	 * Mfg. factory/distribution warehouse name 製造場所工場・物流倉庫名.<p>
	 *
	 */
	public void mfg_site_nm(String value) {
		setConstString(offset + 7, $mfg_site_nm, value);
	}


	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public String mfg_loc_grp_cd() {
		return getConstString(offset + 8, $mfg_loc_grp_cd);
	}

	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public void mfg_loc_grp_cd(String value) {
		setConstString(offset + 8, $mfg_loc_grp_cd, value);
	}


	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public String mfg_loc_grp_nm() {
		return getConstString(offset + 9, $mfg_loc_grp_nm);
	}

	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public void mfg_loc_grp_nm(String value) {
		setConstString(offset + 9, $mfg_loc_grp_nm, value);
	}


	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public String mfg_loc_nm() {
		return getConstString(offset + 10, $mfg_loc_nm);
	}

	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public void mfg_loc_nm(String value) {
		setConstString(offset + 10, $mfg_loc_nm, value);
	}


	/**
	 * Operation location name 工程場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 11, $loc_nm);
	}

	/**
	 * Operation location name 工程場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 11, $loc_nm, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 12, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 12, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 13, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 13, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 14, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 14, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 15, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 15, $itm_typ_d_nm, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 16, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 16, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 17, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 17, $wrk_nm, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 18, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 18, $wg_nm, value);
	}


	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public String ext_sys_nm() {
		return getConstString(offset + 19, $ext_sys_nm);
	}

	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public void ext_sys_nm(String value) {
		setConstString(offset + 19, $ext_sys_nm, value);
	}


	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public String rtn_sts_typ() {
		return getConstString(offset + 20, $rtn_sts_typ);
	}

	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public void rtn_sts_typ(String value) {
		setConstString(offset + 20, $rtn_sts_typ, value);
	}


	public mcframe.serverMS.dbc.MST_OPER_ORDER_R oord(){
		return (mcframe.serverMS.dbc.MST_OPER_ORDER_R) getConstInnerRow(offset + 21, $oord);
	}
	
	public void oord(mcframe.serverMS.dbc.MST_OPER_ORDER_R row){
		setConstInnerRow(offset + 21, $oord, row);
	}


	/**
	 * Operation status name 工程状況名.<p>
	 *
	 */
	public String oper_ord_sts_typ_nm() {
		return getConstString(offset + 22, $oper_ord_sts_typ_nm);
	}

	/**
	 * Operation status name 工程状況名.<p>
	 *
	 */
	public void oper_ord_sts_typ_nm(String value) {
		setConstString(offset + 22, $oper_ord_sts_typ_nm, value);
	}


	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public String oper_nm() {
		return getConstString(offset + 23, $oper_nm);
	}

	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public void oper_nm(String value) {
		setConstString(offset + 23, $oper_nm, value);
	}


	public String getString(String name) {
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($mfg_site_cd.equalsIgnoreCase(name)) {
			return mfg_site_cd();
		}
		if ($mfg_site_nm.equalsIgnoreCase(name)) {
			return mfg_site_nm();
		}
		if ($mfg_loc_grp_cd.equalsIgnoreCase(name)) {
			return mfg_loc_grp_cd();
		}
		if ($mfg_loc_grp_nm.equalsIgnoreCase(name)) {
			return mfg_loc_grp_nm();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			return itm_typ_nm();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			return ext_sys_nm();
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		if ($oper_ord_sts_typ_nm.equalsIgnoreCase(name)) {
			return oper_ord_sts_typ_nm();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($mfg_site_cd.equalsIgnoreCase(name)) {
			return mfg_site_cd();
		}
		if ($mfg_site_nm.equalsIgnoreCase(name)) {
			return mfg_site_nm();
		}
		if ($mfg_loc_grp_cd.equalsIgnoreCase(name)) {
			return mfg_loc_grp_cd();
		}
		if ($mfg_loc_grp_nm.equalsIgnoreCase(name)) {
			return mfg_loc_grp_nm();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			return itm_typ_nm();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			return ext_sys_nm();
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		if ($oper_ord_sts_typ_nm.equalsIgnoreCase(name)) {
			return oper_ord_sts_typ_nm();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		if ($mfg_site_cd.equalsIgnoreCase(name)) {
			mfg_site_cd(value);
			return;
		}
		if ($mfg_site_nm.equalsIgnoreCase(name)) {
			mfg_site_nm(value);
			return;
		}
		if ($mfg_loc_grp_cd.equalsIgnoreCase(name)) {
			mfg_loc_grp_cd(value);
			return;
		}
		if ($mfg_loc_grp_nm.equalsIgnoreCase(name)) {
			mfg_loc_grp_nm(value);
			return;
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			mfg_loc_nm(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
			return;
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			itm_typ_nm(value);
			return;
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			itm_typ_d_cd(value);
			return;
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			itm_typ_d_nm(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			ext_sys_nm(value);
			return;
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		if ($oper_ord_sts_typ_nm.equalsIgnoreCase(name)) {
			oper_ord_sts_typ_nm(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
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
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		if ($mfg_site_cd.equalsIgnoreCase(name)) {
			mfg_site_cd(value);
			return;
		}
		if ($mfg_site_nm.equalsIgnoreCase(name)) {
			mfg_site_nm(value);
			return;
		}
		if ($mfg_loc_grp_cd.equalsIgnoreCase(name)) {
			mfg_loc_grp_cd(value);
			return;
		}
		if ($mfg_loc_grp_nm.equalsIgnoreCase(name)) {
			mfg_loc_grp_nm(value);
			return;
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			mfg_loc_nm(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
			return;
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			itm_typ_nm(value);
			return;
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			itm_typ_d_cd(value);
			return;
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			itm_typ_d_nm(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			ext_sys_nm(value);
			return;
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		if ($oper_ord_sts_typ_nm.equalsIgnoreCase(name)) {
			oper_ord_sts_typ_nm(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
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
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($ord.equalsIgnoreCase(name)) {
			return ord();
		}
		if ($oord.equalsIgnoreCase(name)) {
			return oord();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($ord.equalsIgnoreCase(name)) {
			ord(
				((MCContainerMeta) ord_META).castInnerRow(mcframe.serverMS.dbc.MST_ITM_ORDER_R.class, value)
			);
			return;
		}
		if ($oord.equalsIgnoreCase(name)) {
			oord(
				((MCContainerMeta) oord_META).castInnerRow(mcframe.serverMS.dbc.MST_OPER_ORDER_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public String itm_ord_no() {
		return ord().itm_ord_no();
	}

	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public void itm_ord_no(String value) {
		ord().itm_ord_no(value);
	}

	/**
	 * Order type オーダ区分.<p>
	 *
	 */
	public String itm_ord_typ() {
		return ord().itm_ord_typ();
	}

	/**
	 * Order type オーダ区分.<p>
	 *
	 */
	public void itm_ord_typ(String value) {
		ord().itm_ord_typ(value);
	}

	/**
	 * Order generation type オーダ生成区分.<p>
	 *
	 */
	public String ord_gnrt_typ() {
		return ord().ord_gnrt_typ();
	}

	/**
	 * Order generation type オーダ生成区分.<p>
	 *
	 */
	public void ord_gnrt_typ(String value) {
		ord().ord_gnrt_typ(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return ord().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		ord().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return ord().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		ord().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return ord().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		ord().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return ord().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		ord().itm_sub3(value);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return ord().ver_no();
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		ord().ver_no(value);
	}

	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public String strg_loc_cd() {
		return ord().strg_loc_cd();
	}

	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public void strg_loc_cd(String value) {
		ord().strg_loc_cd(value);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return ord().mfg_loc_cd();
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		ord().mfg_loc_cd(value);
	}

	/**
	 * Master mfg. location cd. マスタ製造場所ＣＤ.<p>
	 *
	 */
	public String mst_mfg_loc_cd() {
		return ord().mst_mfg_loc_cd();
	}

	/**
	 * Master mfg. location cd. マスタ製造場所ＣＤ.<p>
	 *
	 */
	public void mst_mfg_loc_cd(String value) {
		ord().mst_mfg_loc_cd(value);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return ord().sppl_cd();
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		ord().sppl_cd(value);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return ord().maker_cd();
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		ord().maker_cd(value);
	}

	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public String rqst_loc_cd() {
		return ord().rqst_loc_cd();
	}

	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public void rqst_loc_cd(String value) {
		ord().rqst_loc_cd(value);
	}

	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public String rqst_wg_cd() {
		return ord().rqst_wg_cd();
	}

	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public void rqst_wg_cd(String value) {
		ord().rqst_wg_cd(value);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return ord().bom_ptn();
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		ord().bom_ptn(value);
	}

	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public String oper_ptn() {
		return ord().oper_ptn();
	}

	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public void oper_ptn(String value) {
		ord().oper_ptn(value);
	}

	/**
	 * Order scheduled qty. 指図予定数量.<p>
	 *
	 */
	public MCNumber inst_qty() {
		return ord().inst_qty();
	}

	/**
	 * Order scheduled qty. 指図予定数量.<p>
	 *
	 */
	public void inst_qty(MCNumber value) {
		ord().inst_qty(value);
	}

	/**
	 * Order scheduled qty. 指図予定数量.<p>
	 *
	 */
	public void inst_qty(int value) {
		ord().inst_qty(value);
	}

	/**
	 * Order scheduled qty. 指図予定数量.<p>
	 *
	 */
	public void inst_qty(long value) {
		ord().inst_qty(value);
	}

	/**
	 * Order scheduled qty. 指図予定数量.<p>
	 *
	 */
	public void inst_qty(float value) {
		ord().inst_qty(value);
	}

	/**
	 * Order scheduled qty. 指図予定数量.<p>
	 *
	 */
	public void inst_qty(double value) {
		ord().inst_qty(value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public MCNumber yield_schd_qty() {
		return ord().yield_schd_qty();
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void yield_schd_qty(MCNumber value) {
		ord().yield_schd_qty(value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void yield_schd_qty(int value) {
		ord().yield_schd_qty(value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void yield_schd_qty(long value) {
		ord().yield_schd_qty(value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void yield_schd_qty(float value) {
		ord().yield_schd_qty(value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void yield_schd_qty(double value) {
		ord().yield_schd_qty(value);
	}

	/**
	 * Yield numerator 歩留分子.<p>
	 *
	 */
	public MCNumber nmr_qty() {
		return ord().nmr_qty();
	}

	/**
	 * Yield numerator 歩留分子.<p>
	 *
	 */
	public void nmr_qty(MCNumber value) {
		ord().nmr_qty(value);
	}

	/**
	 * Yield numerator 歩留分子.<p>
	 *
	 */
	public void nmr_qty(int value) {
		ord().nmr_qty(value);
	}

	/**
	 * Yield numerator 歩留分子.<p>
	 *
	 */
	public void nmr_qty(long value) {
		ord().nmr_qty(value);
	}

	/**
	 * Yield numerator 歩留分子.<p>
	 *
	 */
	public void nmr_qty(float value) {
		ord().nmr_qty(value);
	}

	/**
	 * Yield numerator 歩留分子.<p>
	 *
	 */
	public void nmr_qty(double value) {
		ord().nmr_qty(value);
	}

	/**
	 * Yield denominator 歩留分母.<p>
	 *
	 */
	public MCNumber dnm_qty() {
		return ord().dnm_qty();
	}

	/**
	 * Yield denominator 歩留分母.<p>
	 *
	 */
	public void dnm_qty(MCNumber value) {
		ord().dnm_qty(value);
	}

	/**
	 * Yield denominator 歩留分母.<p>
	 *
	 */
	public void dnm_qty(int value) {
		ord().dnm_qty(value);
	}

	/**
	 * Yield denominator 歩留分母.<p>
	 *
	 */
	public void dnm_qty(long value) {
		ord().dnm_qty(value);
	}

	/**
	 * Yield denominator 歩留分母.<p>
	 *
	 */
	public void dnm_qty(float value) {
		ord().dnm_qty(value);
	}

	/**
	 * Yield denominator 歩留分母.<p>
	 *
	 */
	public void dnm_qty(double value) {
		ord().dnm_qty(value);
	}

	/**
	 * Constant yield qty. 固定歩留数量.<p>
	 *
	 */
	public MCNumber fxd_yield_qty() {
		return ord().fxd_yield_qty();
	}

	/**
	 * Constant yield qty. 固定歩留数量.<p>
	 *
	 */
	public void fxd_yield_qty(MCNumber value) {
		ord().fxd_yield_qty(value);
	}

	/**
	 * Constant yield qty. 固定歩留数量.<p>
	 *
	 */
	public void fxd_yield_qty(int value) {
		ord().fxd_yield_qty(value);
	}

	/**
	 * Constant yield qty. 固定歩留数量.<p>
	 *
	 */
	public void fxd_yield_qty(long value) {
		ord().fxd_yield_qty(value);
	}

	/**
	 * Constant yield qty. 固定歩留数量.<p>
	 *
	 */
	public void fxd_yield_qty(float value) {
		ord().fxd_yield_qty(value);
	}

	/**
	 * Constant yield qty. 固定歩留数量.<p>
	 *
	 */
	public void fxd_yield_qty(double value) {
		ord().fxd_yield_qty(value);
	}

	/**
	 * Order status type オーダ状況区分.<p>
	 *
	 */
	public String itm_ord_sts_typ() {
		return ord().itm_ord_sts_typ();
	}

	/**
	 * Order status type オーダ状況区分.<p>
	 *
	 */
	public void itm_ord_sts_typ(String value) {
		ord().itm_ord_sts_typ(value);
	}

	/**
	 * Firm date 確定日.<p>
	 *
	 */
	public MCDate fix_dt() {
		return ord().fix_dt();
	}

	/**
	 * Firm date 確定日.<p>
	 *
	 */
	public void fix_dt(MCDate value) {
		ord().fix_dt(value);
	}

	/**
	 * Scheduled PO date 発注予定日.<p>
	 *
	 */
	public MCDate po_schd_dt() {
		return ord().po_schd_dt();
	}

	/**
	 * Scheduled PO date 発注予定日.<p>
	 *
	 */
	public void po_schd_dt(MCDate value) {
		ord().po_schd_dt(value);
	}

	/**
	 * Scheduled PO date (MRP) 発注予定日（ＭＲＰ）.<p>
	 *
	 */
	public MCDate mrp_po_schd_dt() {
		return ord().mrp_po_schd_dt();
	}

	/**
	 * Scheduled PO date (MRP) 発注予定日（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_po_schd_dt(MCDate value) {
		ord().mrp_po_schd_dt(value);
	}

	/**
	 * Purchase LT (MRP) 購入ＬＴ（ＭＲＰ）.<p>
	 *
	 */
	public MCNumber mrp_purc_lt() {
		return ord().mrp_purc_lt();
	}

	/**
	 * Purchase LT (MRP) 購入ＬＴ（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_purc_lt(MCNumber value) {
		ord().mrp_purc_lt(value);
	}

	/**
	 * Purchase LT (MRP) 購入ＬＴ（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_purc_lt(int value) {
		ord().mrp_purc_lt(value);
	}

	/**
	 * Purchase LT (MRP) 購入ＬＴ（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_purc_lt(long value) {
		ord().mrp_purc_lt(value);
	}

	/**
	 * Purchase LT (MRP) 購入ＬＴ（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_purc_lt(float value) {
		ord().mrp_purc_lt(value);
	}

	/**
	 * Purchase LT (MRP) 購入ＬＴ（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_purc_lt(double value) {
		ord().mrp_purc_lt(value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public MCNumber purc_lt() {
		return ord().purc_lt();
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(MCNumber value) {
		ord().purc_lt(value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(int value) {
		ord().purc_lt(value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(long value) {
		ord().purc_lt(value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(float value) {
		ord().purc_lt(value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(double value) {
		ord().purc_lt(value);
	}

	/**
	 * Scheduled mfg. start date 製造着手予定日.<p>
	 *
	 */
	public MCDate mfg_st_schd_dt() {
		return ord().mfg_st_schd_dt();
	}

	/**
	 * Scheduled mfg. start date 製造着手予定日.<p>
	 *
	 */
	public void mfg_st_schd_dt(MCDate value) {
		ord().mfg_st_schd_dt(value);
	}

	/**
	 * Scheduled mfg. start date (MRP) 製造着手予定日（ＭＲＰ）.<p>
	 *
	 */
	public MCDate mrp_mfg_st_schd_dt() {
		return ord().mrp_mfg_st_schd_dt();
	}

	/**
	 * Scheduled mfg. start date (MRP) 製造着手予定日（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_mfg_st_schd_dt(MCDate value) {
		ord().mrp_mfg_st_schd_dt(value);
	}

	/**
	 * Scheduled mfg. end date 製造終了予定日.<p>
	 *
	 */
	public MCDate mfg_end_schd_dt() {
		return ord().mfg_end_schd_dt();
	}

	/**
	 * Scheduled mfg. end date 製造終了予定日.<p>
	 *
	 */
	public void mfg_end_schd_dt(MCDate value) {
		ord().mfg_end_schd_dt(value);
	}

	/**
	 * Scheduled mfg. end date (MRP) 製造終了予定日（ＭＲＰ）.<p>
	 *
	 */
	public MCDate mrp_mfg_end_schd_dt() {
		return ord().mrp_mfg_end_schd_dt();
	}

	/**
	 * Scheduled mfg. end date (MRP) 製造終了予定日（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_mfg_end_schd_dt(MCDate value) {
		ord().mrp_mfg_end_schd_dt(value);
	}

	/**
	 * Mfg. LT (MRP) 製造ＬＴ（ＭＲＰ）.<p>
	 *
	 */
	public MCNumber mrp_mfg_lt() {
		return ord().mrp_mfg_lt();
	}

	/**
	 * Mfg. LT (MRP) 製造ＬＴ（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_mfg_lt(MCNumber value) {
		ord().mrp_mfg_lt(value);
	}

	/**
	 * Mfg. LT (MRP) 製造ＬＴ（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_mfg_lt(int value) {
		ord().mrp_mfg_lt(value);
	}

	/**
	 * Mfg. LT (MRP) 製造ＬＴ（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_mfg_lt(long value) {
		ord().mrp_mfg_lt(value);
	}

	/**
	 * Mfg. LT (MRP) 製造ＬＴ（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_mfg_lt(float value) {
		ord().mrp_mfg_lt(value);
	}

	/**
	 * Mfg. LT (MRP) 製造ＬＴ（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_mfg_lt(double value) {
		ord().mrp_mfg_lt(value);
	}

	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public MCNumber mfg_lt() {
		return ord().mfg_lt();
	}

	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public void mfg_lt(MCNumber value) {
		ord().mfg_lt(value);
	}

	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public void mfg_lt(int value) {
		ord().mfg_lt(value);
	}

	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public void mfg_lt(long value) {
		ord().mfg_lt(value);
	}

	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public void mfg_lt(float value) {
		ord().mfg_lt(value);
	}

	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public void mfg_lt(double value) {
		ord().mfg_lt(value);
	}

	/**
	 * Scheduled GI date 出庫予定日.<p>
	 *
	 */
	public MCDate gi_schd_dt() {
		return ord().gi_schd_dt();
	}

	/**
	 * Scheduled GI date 出庫予定日.<p>
	 *
	 */
	public void gi_schd_dt(MCDate value) {
		ord().gi_schd_dt(value);
	}

	/**
	 * Scheduled GI date (MRP) 出庫予定日（ＭＲＰ）.<p>
	 *
	 */
	public MCDate mrp_gi_schd_dt() {
		return ord().mrp_gi_schd_dt();
	}

	/**
	 * Scheduled GI date (MRP) 出庫予定日（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_gi_schd_dt(MCDate value) {
		ord().mrp_gi_schd_dt(value);
	}

	/**
	 * Scheduled storage completion date 格納完了予定日.<p>
	 *
	 */
	public MCDate strg_schd_dt() {
		return ord().strg_schd_dt();
	}

	/**
	 * Scheduled storage completion date 格納完了予定日.<p>
	 *
	 */
	public void strg_schd_dt(MCDate value) {
		ord().strg_schd_dt(value);
	}

	/**
	 * Scheduled storage completion date (MRP) 格納完了予定日（ＭＲＰ）.<p>
	 *
	 */
	public MCDate mrp_strg_schd_dt() {
		return ord().mrp_strg_schd_dt();
	}

	/**
	 * Scheduled storage completion date (MRP) 格納完了予定日（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_strg_schd_dt(MCDate value) {
		ord().mrp_strg_schd_dt(value);
	}

	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public MCNumber xfr_lt() {
		return ord().xfr_lt();
	}

	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(MCNumber value) {
		ord().xfr_lt(value);
	}

	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(int value) {
		ord().xfr_lt(value);
	}

	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(long value) {
		ord().xfr_lt(value);
	}

	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(float value) {
		ord().xfr_lt(value);
	}

	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(double value) {
		ord().xfr_lt(value);
	}

	/**
	 * Scheduled acceptance date 検収予定日.<p>
	 *
	 */
	public MCDate accpt_schd_dt() {
		return ord().accpt_schd_dt();
	}

	/**
	 * Scheduled acceptance date 検収予定日.<p>
	 *
	 */
	public void accpt_schd_dt(MCDate value) {
		ord().accpt_schd_dt(value);
	}

	/**
	 * Scheduled acceptance date (MRP) 検収予定日（ＭＲＰ）.<p>
	 *
	 */
	public MCDate mrp_accpt_schd_dt() {
		return ord().mrp_accpt_schd_dt();
	}

	/**
	 * Scheduled acceptance date (MRP) 検収予定日（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_accpt_schd_dt(MCDate value) {
		ord().mrp_accpt_schd_dt(value);
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public MCNumber accpt_insp_lt() {
		return ord().accpt_insp_lt();
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(MCNumber value) {
		ord().accpt_insp_lt(value);
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(int value) {
		ord().accpt_insp_lt(value);
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(long value) {
		ord().accpt_insp_lt(value);
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(float value) {
		ord().accpt_insp_lt(value);
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(double value) {
		ord().accpt_insp_lt(value);
	}

	/**
	 * Scheduled inspection start date 検査着手予定日.<p>
	 *
	 */
	public MCDate insp_st_schd_dt() {
		return ord().insp_st_schd_dt();
	}

	/**
	 * Scheduled inspection start date 検査着手予定日.<p>
	 *
	 */
	public void insp_st_schd_dt(MCDate value) {
		ord().insp_st_schd_dt(value);
	}

	/**
	 * Scheduled inspection start date (MRP) 検査着手予定日（ＭＲＰ）.<p>
	 *
	 */
	public MCDate mrp_insp_st_schd_dt() {
		return ord().mrp_insp_st_schd_dt();
	}

	/**
	 * Scheduled inspection start date (MRP) 検査着手予定日（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_insp_st_schd_dt(MCDate value) {
		ord().mrp_insp_st_schd_dt(value);
	}

	/**
	 * Scheduled inspection end date 検査終了予定日.<p>
	 *
	 */
	public MCDate insp_end_schd_dt() {
		return ord().insp_end_schd_dt();
	}

	/**
	 * Scheduled inspection end date 検査終了予定日.<p>
	 *
	 */
	public void insp_end_schd_dt(MCDate value) {
		ord().insp_end_schd_dt(value);
	}

	/**
	 * Scheduled inspection end date (MRP) 検査終了予定日（ＭＲＰ）.<p>
	 *
	 */
	public MCDate mrp_insp_end_schd_dt() {
		return ord().mrp_insp_end_schd_dt();
	}

	/**
	 * Scheduled inspection end date (MRP) 検査終了予定日（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_insp_end_schd_dt(MCDate value) {
		ord().mrp_insp_end_schd_dt(value);
	}

	/**
	 * Inspection LT 検査ＬＴ.<p>
	 *
	 */
	public MCNumber insp_lt() {
		return ord().insp_lt();
	}

	/**
	 * Inspection LT 検査ＬＴ.<p>
	 *
	 */
	public void insp_lt(MCNumber value) {
		ord().insp_lt(value);
	}

	/**
	 * Inspection LT 検査ＬＴ.<p>
	 *
	 */
	public void insp_lt(int value) {
		ord().insp_lt(value);
	}

	/**
	 * Inspection LT 検査ＬＴ.<p>
	 *
	 */
	public void insp_lt(long value) {
		ord().insp_lt(value);
	}

	/**
	 * Inspection LT 検査ＬＴ.<p>
	 *
	 */
	public void insp_lt(float value) {
		ord().insp_lt(value);
	}

	/**
	 * Inspection LT 検査ＬＴ.<p>
	 *
	 */
	public void insp_lt(double value) {
		ord().insp_lt(value);
	}

	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public MCNumber insp_offst() {
		return ord().insp_offst();
	}

	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public void insp_offst(MCNumber value) {
		ord().insp_offst(value);
	}

	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public void insp_offst(int value) {
		ord().insp_offst(value);
	}

	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public void insp_offst(long value) {
		ord().insp_offst(value);
	}

	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public void insp_offst(float value) {
		ord().insp_offst(value);
	}

	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public void insp_offst(double value) {
		ord().insp_offst(value);
	}

	/**
	 * Available date 使用可能予定日.<p>
	 *
	 */
	public MCDate avl_schd_dt() {
		return ord().avl_schd_dt();
	}

	/**
	 * Available date 使用可能予定日.<p>
	 *
	 */
	public void avl_schd_dt(MCDate value) {
		ord().avl_schd_dt(value);
	}

	/**
	 * Available date (MRP) 使用可能予定日（ＭＲＰ）.<p>
	 *
	 */
	public MCDate mrp_avl_schd_dt() {
		return ord().mrp_avl_schd_dt();
	}

	/**
	 * Available date (MRP) 使用可能予定日（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_avl_schd_dt(MCDate value) {
		ord().mrp_avl_schd_dt(value);
	}

	/**
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public MCDate master_dt() {
		return ord().master_dt();
	}

	/**
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public void master_dt(MCDate value) {
		ord().master_dt(value);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return ord().sno1();
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		ord().sno1(value);
	}

	/**
	 * SEIBAN No. 1 type 手配ＮＯ１区分.<p>
	 *
	 */
	public String sno_typ1() {
		return ord().sno_typ1();
	}

	/**
	 * SEIBAN No. 1 type 手配ＮＯ１区分.<p>
	 *
	 */
	public void sno_typ1(String value) {
		ord().sno_typ1(value);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return ord().sno2();
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		ord().sno2(value);
	}

	/**
	 * SEIBAN No. 2 type 手配ＮＯ２区分.<p>
	 *
	 */
	public String sno_typ2() {
		return ord().sno_typ2();
	}

	/**
	 * SEIBAN No. 2 type 手配ＮＯ２区分.<p>
	 *
	 */
	public void sno_typ2(String value) {
		ord().sno_typ2(value);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return ord().sno3();
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		ord().sno3(value);
	}

	/**
	 * SEIBAN No. 3 type 手配ＮＯ３区分.<p>
	 *
	 */
	public String sno_typ3() {
		return ord().sno_typ3();
	}

	/**
	 * SEIBAN No. 3 type 手配ＮＯ３区分.<p>
	 *
	 */
	public void sno_typ3(String value) {
		ord().sno_typ3(value);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return ord().sno4();
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		ord().sno4(value);
	}

	/**
	 * SEIBAN No. 4 type 手配ＮＯ４区分.<p>
	 *
	 */
	public String sno_typ4() {
		return ord().sno_typ4();
	}

	/**
	 * SEIBAN No. 4 type 手配ＮＯ４区分.<p>
	 *
	 */
	public void sno_typ4(String value) {
		ord().sno_typ4(value);
	}

	/**
	 * Expired date 期限切れ日.<p>
	 *
	 */
	public MCDate lmt_dt() {
		return ord().lmt_dt();
	}

	/**
	 * Expired date 期限切れ日.<p>
	 *
	 */
	public void lmt_dt(MCDate value) {
		ord().lmt_dt(value);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return ord().wg_cd();
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		ord().wg_cd(value);
	}

	/**
	 * Disallow procurement 手配不許可.<p>
	 *
	 */
	public boolean not_fix_flg() {
		return ord().not_fix_flg();
	}

	/**
	 * Disallow procurement 手配不許可.<p>
	 *
	 */
	public void not_fix_flg(boolean value) {
		ord().not_fix_flg(value);
	}

	/**
	 * Order auto-firming period (Date) オーダ自動確定期間（日）.<p>
	 *
	 */
	public MCNumber ord_fix_pd() {
		return ord().ord_fix_pd();
	}

	/**
	 * Order auto-firming period (Date) オーダ自動確定期間（日）.<p>
	 *
	 */
	public void ord_fix_pd(MCNumber value) {
		ord().ord_fix_pd(value);
	}

	/**
	 * Order auto-firming period (Date) オーダ自動確定期間（日）.<p>
	 *
	 */
	public void ord_fix_pd(int value) {
		ord().ord_fix_pd(value);
	}

	/**
	 * Order auto-firming period (Date) オーダ自動確定期間（日）.<p>
	 *
	 */
	public void ord_fix_pd(long value) {
		ord().ord_fix_pd(value);
	}

	/**
	 * Order auto-firming period (Date) オーダ自動確定期間（日）.<p>
	 *
	 */
	public void ord_fix_pd(float value) {
		ord().ord_fix_pd(value);
	}

	/**
	 * Order auto-firming period (Date) オーダ自動確定期間（日）.<p>
	 *
	 */
	public void ord_fix_pd(double value) {
		ord().ord_fix_pd(value);
	}

	/**
	 * Requirements No. 所要ＮＯ.<p>
	 *
	 */
	public String rqmt_no() {
		return ord().rqmt_no();
	}

	/**
	 * Requirements No. 所要ＮＯ.<p>
	 *
	 */
	public void rqmt_no(String value) {
		ord().rqmt_no(value);
	}

	/**
	 * Order/PO contact remarks 指図・発注連絡備考.<p>
	 *
	 */
	public String inst_po_cnt_rmrks() {
		return ord().inst_po_cnt_rmrks();
	}

	/**
	 * Order/PO contact remarks 指図・発注連絡備考.<p>
	 *
	 */
	public void inst_po_cnt_rmrks(String value) {
		ord().inst_po_cnt_rmrks(value);
	}

	/**
	 * Simulation No. シミュレーションＮＯ.<p>
	 *
	 */
	public String sim_mrp_no() {
		return ord().sim_mrp_no();
	}

	/**
	 * Simulation No. シミュレーションＮＯ.<p>
	 *
	 */
	public void sim_mrp_no(String value) {
		ord().sim_mrp_no(value);
	}

	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public String io_schd_pr_no() {
		return ord().io_schd_pr_no();
	}

	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public void io_schd_pr_no(String value) {
		ord().io_schd_pr_no(value);
	}

	/**
	 * Item order update counter 品目オーダ更新カウンタ.<p>
	 *
	 */
	public MCNumber itm_order_upd_cntr() {
		return ord().upd_cntr();
	}

	/**
	 * Item order update counter 品目オーダ更新カウンタ.<p>
	 *
	 */
	public void itm_order_upd_cntr(MCNumber value) {
		ord().upd_cntr(value);
	}

	/**
	 * Item order update counter 品目オーダ更新カウンタ.<p>
	 *
	 */
	public void itm_order_upd_cntr(int value) {
		ord().upd_cntr(value);
	}

	/**
	 * Item order update counter 品目オーダ更新カウンタ.<p>
	 *
	 */
	public void itm_order_upd_cntr(long value) {
		ord().upd_cntr(value);
	}

	/**
	 * Item order update counter 品目オーダ更新カウンタ.<p>
	 *
	 */
	public void itm_order_upd_cntr(float value) {
		ord().upd_cntr(value);
	}

	/**
	 * Item order update counter 品目オーダ更新カウンタ.<p>
	 *
	 */
	public void itm_order_upd_cntr(double value) {
		ord().upd_cntr(value);
	}

	/**
	 * Order import オーダ受信.<p>
	 *
	 */
	public boolean ord_rcv_flg() {
		return ord().ord_rcv_flg();
	}

	/**
	 * Order import オーダ受信.<p>
	 *
	 */
	public void ord_rcv_flg(boolean value) {
		ord().ord_rcv_flg(value);
	}

	/**
	 * Export Order オーダ送信.<p>
	 *
	 */
	public boolean ord_snd_flg() {
		return ord().ord_snd_flg();
	}

	/**
	 * Export Order オーダ送信.<p>
	 *
	 */
	public void ord_snd_flg(boolean value) {
		ord().ord_snd_flg(value);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return ord().ext_sys_cd();
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		ord().ext_sys_cd(value);
	}

	/**
	 * External item order No. 外部品目オーダＮＯ.<p>
	 *
	 */
	public String ext_itm_ord_no() {
		return ord().ext_itm_ord_no();
	}

	/**
	 * External item order No. 外部品目オーダＮＯ.<p>
	 *
	 */
	public void ext_itm_ord_no(String value) {
		ord().ext_itm_ord_no(value);
	}

	/**
	 * Operation order No. 工程オーダＮＯ.<p>
	 *
	 */
	public String oper_ord_no() {
		return oord().oper_ord_no();
	}

	/**
	 * Operation order No. 工程オーダＮＯ.<p>
	 *
	 */
	public void oper_ord_no(String value) {
		oord().oper_ord_no(value);
	}

	/**
	 * Operation order status type 工程オーダ状況区分.<p>
	 *
	 */
	public String oper_ord_sts_typ() {
		return oord().oper_ord_sts_typ();
	}

	/**
	 * Operation order status type 工程オーダ状況区分.<p>
	 *
	 */
	public void oper_ord_sts_typ(String value) {
		oord().oper_ord_sts_typ(value);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return oord().oper_cd();
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		oord().oper_cd(value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public MCNumber oper_seq() {
		return oord().oper_seq();
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(MCNumber value) {
		oord().oper_seq(value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(int value) {
		oord().oper_seq(value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(long value) {
		oord().oper_seq(value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(float value) {
		oord().oper_seq(value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(double value) {
		oord().oper_seq(value);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return oord().loc_cd();
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		oord().loc_cd(value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return oord().disp_seq();
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		oord().disp_seq(value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(int value) {
		oord().disp_seq(value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(long value) {
		oord().disp_seq(value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(float value) {
		oord().disp_seq(value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(double value) {
		oord().disp_seq(value);
	}

	/**
	 * Operation order scheduled qty. 工程指図予定数量.<p>
	 *
	 */
	public MCNumber oper_schd_qty() {
		return oord().oper_schd_qty();
	}

	/**
	 * Operation order scheduled qty. 工程指図予定数量.<p>
	 *
	 */
	public void oper_schd_qty(MCNumber value) {
		oord().oper_schd_qty(value);
	}

	/**
	 * Operation order scheduled qty. 工程指図予定数量.<p>
	 *
	 */
	public void oper_schd_qty(int value) {
		oord().oper_schd_qty(value);
	}

	/**
	 * Operation order scheduled qty. 工程指図予定数量.<p>
	 *
	 */
	public void oper_schd_qty(long value) {
		oord().oper_schd_qty(value);
	}

	/**
	 * Operation order scheduled qty. 工程指図予定数量.<p>
	 *
	 */
	public void oper_schd_qty(float value) {
		oord().oper_schd_qty(value);
	}

	/**
	 * Operation order scheduled qty. 工程指図予定数量.<p>
	 *
	 */
	public void oper_schd_qty(double value) {
		oord().oper_schd_qty(value);
	}

	/**
	 * Output recording operation 出来高計上工程.<p>
	 *
	 */
	public boolean yield_oper_flg() {
		return oord().yield_oper_flg();
	}

	/**
	 * Output recording operation 出来高計上工程.<p>
	 *
	 */
	public void yield_oper_flg(boolean value) {
		oord().yield_oper_flg(value);
	}

	/**
	 * Scheduled operation start date and time 工程着手予定日時.<p>
	 *
	 */
	public MCDate st_schd_tm() {
		return oord().st_schd_tm();
	}

	/**
	 * Scheduled operation start date and time 工程着手予定日時.<p>
	 *
	 */
	public void st_schd_tm(MCDate value) {
		oord().st_schd_tm(value);
	}

	/**
	 * Scheduled operation start date and time (Order) 工程着手予定日時（指図）.<p>
	 *
	 */
	public MCDate inst_st_schd_tm() {
		return oord().inst_st_schd_tm();
	}

	/**
	 * Scheduled operation start date and time (Order) 工程着手予定日時（指図）.<p>
	 *
	 */
	public void inst_st_schd_tm(MCDate value) {
		oord().inst_st_schd_tm(value);
	}

	/**
	 * Actual earliest operation start date and time 最早工程着手実績日時.<p>
	 *
	 */
	public MCDate act_st_tm() {
		return oord().act_st_tm();
	}

	/**
	 * Actual earliest operation start date and time 最早工程着手実績日時.<p>
	 *
	 */
	public void act_st_tm(MCDate value) {
		oord().act_st_tm(value);
	}

	/**
	 * Scheduled operation end date and time 工程終了予定日時.<p>
	 *
	 */
	public MCDate end_schd_tm() {
		return oord().end_schd_tm();
	}

	/**
	 * Scheduled operation end date and time 工程終了予定日時.<p>
	 *
	 */
	public void end_schd_tm(MCDate value) {
		oord().end_schd_tm(value);
	}

	/**
	 * Scheduled operation end date and time (Order) 工程終了予定日時（指図）.<p>
	 *
	 */
	public MCDate inst_end_schd_tm() {
		return oord().inst_end_schd_tm();
	}

	/**
	 * Scheduled operation end date and time (Order) 工程終了予定日時（指図）.<p>
	 *
	 */
	public void inst_end_schd_tm(MCDate value) {
		oord().inst_end_schd_tm(value);
	}

	/**
	 * Actual latest operation end date and time 最遅工程終了実績日時.<p>
	 *
	 */
	public MCDate act_end_tm() {
		return oord().act_end_tm();
	}

	/**
	 * Actual latest operation end date and time 最遅工程終了実績日時.<p>
	 *
	 */
	public void act_end_tm(MCDate value) {
		oord().act_end_tm(value);
	}

	/**
	 * Operation LT 工程ＬＴ.<p>
	 *
	 */
	public MCNumber oper_lt() {
		return oord().oper_lt();
	}

	/**
	 * Operation LT 工程ＬＴ.<p>
	 *
	 */
	public void oper_lt(MCNumber value) {
		oord().oper_lt(value);
	}

	/**
	 * Operation LT 工程ＬＴ.<p>
	 *
	 */
	public void oper_lt(int value) {
		oord().oper_lt(value);
	}

	/**
	 * Operation LT 工程ＬＴ.<p>
	 *
	 */
	public void oper_lt(long value) {
		oord().oper_lt(value);
	}

	/**
	 * Operation LT 工程ＬＴ.<p>
	 *
	 */
	public void oper_lt(float value) {
		oord().oper_lt(value);
	}

	/**
	 * Operation LT 工程ＬＴ.<p>
	 *
	 */
	public void oper_lt(double value) {
		oord().oper_lt(value);
	}

	/**
	 * Operation offset type 工程オフセット区分.<p>
	 *
	 */
	public String oper_offst_typ() {
		return oord().oper_offst_typ();
	}

	/**
	 * Operation offset type 工程オフセット区分.<p>
	 *
	 */
	public void oper_offst_typ(String value) {
		oord().oper_offst_typ(value);
	}

	/**
	 * Operation offset 工程オフセット.<p>
	 *
	 */
	public MCNumber oper_offst() {
		return oord().oper_offst();
	}

	/**
	 * Operation offset 工程オフセット.<p>
	 *
	 */
	public void oper_offst(MCNumber value) {
		oord().oper_offst(value);
	}

	/**
	 * Operation offset 工程オフセット.<p>
	 *
	 */
	public void oper_offst(int value) {
		oord().oper_offst(value);
	}

	/**
	 * Operation offset 工程オフセット.<p>
	 *
	 */
	public void oper_offst(long value) {
		oord().oper_offst(value);
	}

	/**
	 * Operation offset 工程オフセット.<p>
	 *
	 */
	public void oper_offst(float value) {
		oord().oper_offst(value);
	}

	/**
	 * Operation offset 工程オフセット.<p>
	 *
	 */
	public void oper_offst(double value) {
		oord().oper_offst(value);
	}

	/**
	 * Operation resources 工程資源.<p>
	 *
	 */
	public String oper_rsrc() {
		return oord().oper_rsrc();
	}

	/**
	 * Operation resources 工程資源.<p>
	 *
	 */
	public void oper_rsrc(String value) {
		oord().oper_rsrc(value);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return oord().intr_rmrks();
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		oord().intr_rmrks(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return oord().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		oord().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return oord().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		oord().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return oord().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		oord().sub_char3(value);
	}

	/**
	 * External operation order No. 外部工程オーダＮＯ.<p>
	 *
	 */
	public String ext_oper_ord_no() {
		return oord().ext_oper_ord_no();
	}

	/**
	 * External operation order No. 外部工程オーダＮＯ.<p>
	 *
	 */
	public void ext_oper_ord_no(String value) {
		oord().ext_oper_ord_no(value);
	}

	/**
	 * Scheduler frozen スケジューラ凍結.<p>
	 *
	 */
	public boolean scheduler_frozen_flg() {
		return oord().scheduler_frozen_flg();
	}

	/**
	 * Scheduler frozen スケジューラ凍結.<p>
	 *
	 */
	public void scheduler_frozen_flg(boolean value) {
		oord().scheduler_frozen_flg(value);
	}

}

