package mcframe.serverMSBC.MSBCL0360;

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
 * ブロック"Srch01_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_RsltR_MC_A extends MCConstRow {

	/**
	 * Hierarchy 階層.<p>
	 *
	 */
	public static final String $hrrchy = "hrrchy";
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
	 * Scheduled input date 投入予定日.<p>
	 *
	 */
	public static final String $schd_in_dt = "schd_in_dt";
	/**
	 * Production possibility 生産可否状況.<p>
	 *
	 */
	public static final String $prod_avlbl_sts = "prod_avlbl_sts";
	/**
	 * Parts status 部品状況.<p>
	 *
	 */
	public static final String $purc_itm_sts = "purc_itm_sts";
	/**
	 * Item 品目.<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public static final String $itm_sub1 = "itm_sub1";
	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public static final String $itm_sub2 = "itm_sub2";
	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public static final String $itm_sub3 = "itm_sub3";
	/**
	 * Item name 品名.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public static final String $sno1 = "sno1";
	/**
	 * Allow without SEIBAN No. 1 手配ＮＯ１無し可.<p>
	 *
	 */
	public static final String $sno1_null_flg = "sno1_null_flg";
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public static final String $sno2 = "sno2";
	/**
	 * Allow without SEIBAN No. 2 手配ＮＯ２無し可.<p>
	 *
	 */
	public static final String $sno2_null_flg = "sno2_null_flg";
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public static final String $sno3 = "sno3";
	/**
	 * Allow without SEIBAN No. 3 手配ＮＯ３無し可.<p>
	 *
	 */
	public static final String $sno3_null_flg = "sno3_null_flg";
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public static final String $sno4 = "sno4";
	/**
	 * Allow without SEIBAN No. 4 手配ＮＯ４無し可.<p>
	 *
	 */
	public static final String $sno4_null_flg = "sno4_null_flg";
	/**
	 * Order qty. オーダ数量.<p>
	 *
	 */
	public static final String $ord_qty = "ord_qty";
	/**
	 * Required qty. 必要数量.<p>
	 *
	 */
	public static final String $need_qty = "need_qty";
	/**
	 * Allocatable inventory qty. 引当可能在庫数量.<p>
	 *
	 */
	public static final String $alloc_avlbl_qty = "alloc_avlbl_qty";
	/**
	 * Allocation qty. 引当数量.<p>
	 *
	 */
	public static final String $alloc_qty = "alloc_qty";
	/**
	 * Possible production qty. 生産可能数量.<p>
	 *
	 */
	public static final String $prod_avlbl_qty = "prod_avlbl_qty";
	/**
	 * Order type オーダ区分.<p>
	 *
	 */
	public static final String $itm_ord_typ = "itm_ord_typ";
	/**
	 * Order type name オーダ区分名.<p>
	 *
	 */
	public static final String $itm_ord_typ_nm = "itm_ord_typ_nm";
	/**
	 * Item status 品目状況.<p>
	 *
	 */
	public static final String $itm_ord_sts_typ = "itm_ord_sts_typ";
	/**
	 * Item status name 品目状況名.<p>
	 *
	 */
	public static final String $itm_ord_sts_typ_nm = "itm_ord_sts_typ_nm";
	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public static final String $itm_ord_no = "itm_ord_no";
	/**
	 * Mfg. location 製造場所.<p>
	 *
	 */
	public static final String $mfg_loc_cd = "mfg_loc_cd";
	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public static final String $mfg_loc_nm = "mfg_loc_nm";
	/**
	 * Storage location 格納場所.<p>
	 *
	 */
	public static final String $strg_loc_cd = "strg_loc_cd";
	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public static final String $strg_loc_nm = "strg_loc_nm";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public static final String $bom_ptn = "bom_ptn";
	/**
	 * Operation order No. 工程オーダＮＯ.<p>
	 *
	 */
	public static final String $oper_ord_no = "oper_ord_no";
	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public static final String $oper_cd = "oper_cd";
	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public static final String $oper_nm = "oper_nm";
	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public static final String $oper_seq = "oper_seq";
	/**
	 * Operation unordered qty. 工程未指図数量.<p>
	 *
	 */
	public static final String $not_oper_schd_qty = "not_oper_schd_qty";
	/**
	 * Scheduled operation start date and time 工程着手予定日時.<p>
	 *
	 */
	public static final String $st_schd_tm = "st_schd_tm";
	/**
	 * Scheduled operation end date and time 工程終了予定日時.<p>
	 *
	 */
	public static final String $end_schd_tm = "end_schd_tm";
	/**
	 * Allocation control type 引当制御区分.<p>
	 *
	 */
	public static final String $alloc_ctl_typ = "alloc_ctl_typ";
	/**
	 * Allocation control type name 引当制御区分名.<p>
	 *
	 */
	public static final String $alloc_ctl_typ_nm = "alloc_ctl_typ_nm";
	/**
	 * Input control type 投入制御区分.<p>
	 *
	 */
	public static final String $inpt_ctl_typ = "inpt_ctl_typ";
	/**
	 * Input control type name 投入制御区分名.<p>
	 *
	 */
	public static final String $inpt_ctl_typ_nm = "inpt_ctl_typ_nm";
	/**
	 * Input offset type 投入オフセット区分.<p>
	 *
	 */
	public static final String $offst_typ = "offst_typ";
	/**
	 * Input offset type name 投入オフセット区分名.<p>
	 *
	 */
	public static final String $offst_typ_nm = "offst_typ_nm";
	/**
	 * Input offset 投入オフセット.<p>
	 *
	 */
	public static final String $offst = "offst";
	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public static final String $prov_typ = "prov_typ";
	/**
	 * Supply type name 支給区分名.<p>
	 *
	 */
	public static final String $prov_typ_nm = "prov_typ_nm";
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public static final String $unit_cd = "unit_cd";
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public static final String $unit_nm = "unit_nm";
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public static final String $dec_place = "dec_place";
	/**
	 * Rounding type 端数処理区分.<p>
	 *
	 */
	public static final String $rnd_typ = "rnd_typ";
	/**
	 * Rounding type name 端数処理区分名.<p>
	 *
	 */
	public static final String $rnd_typ_nm = "rnd_typ_nm";
	/**
	 * Alternative item flg. 代替品目ＦＬＧ.<p>
	 *
	 */
	public static final String $alt_itm_flg = "alt_itm_flg";
	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public static final String $alt_grp_cd = "alt_grp_cd";
	/**
	 * Alternative group name 代替グループ名.<p>
	 *
	 */
	public static final String $alt_grp_nm = "alt_grp_nm";
	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public static final String $alt_grp_seq = "alt_grp_seq";
	/**
	 * Alternative item selection type 代替品目選択区分.<p>
	 *
	 */
	public static final String $alt_itm_typ = "alt_itm_typ";
	/**
	 * Alternative item selection type name 代替品目選択区分名.<p>
	 *
	 */
	public static final String $alt_itm_typ_nm = "alt_itm_typ_nm";
	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public static final String $alt_itm_ratio = "alt_itm_ratio";
	/**
	 * Allocation priority 引当優先順.<p>
	 *
	 */
	public static final String $alt_alloc_prio = "alt_alloc_prio";
	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Details sequence number 明細連番.<p>
	 *
	 */
	public static final String $seq_no = "seq_no";
	/**
	 * Non-target flg. 対象外フラグ.<p>
	 *
	 */
	public static final String $not_target_flg = "not_target_flg";
	/**
	 * Selected alternative item flg. 選択代替品フラグ.<p>
	 *
	 */
	public static final String $select_alt_flg = "select_alt_flg";
	/**
	 * Not to display flg. 表示対象外フラグ.<p>
	 *
	 */
	public static final String $no_output_flg = "no_output_flg";


	public static final MCMeta hrrchy_META = createCommonMeta($hrrchy, mcframe.commonMA.meta.MA_META.TREE_LVL);
	public static final MCMeta mfg_st_schd_dt_META = createCommonMeta($mfg_st_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mfg_end_schd_dt_META = createCommonMeta($mfg_end_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta schd_in_dt_META = createCommonMeta($schd_in_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta prod_avlbl_sts_META = createStringMeta($prod_avlbl_sts);
	public static final MCMeta purc_itm_sts_META = createStringMeta($purc_itm_sts);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno1_null_flg_META = createCommonMeta($sno1_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno2_null_flg_META = createCommonMeta($sno2_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno3_null_flg_META = createCommonMeta($sno3_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta sno4_null_flg_META = createCommonMeta($sno4_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ord_qty_META = createCommonMeta($ord_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta need_qty_META = createCommonMeta($need_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta alloc_avlbl_qty_META = createCommonMeta($alloc_avlbl_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta alloc_qty_META = createCommonMeta($alloc_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta prod_avlbl_qty_META = createCommonMeta($prod_avlbl_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta itm_ord_typ_META = createCommonMeta($itm_ord_typ, mcframe.commonMS.meta.MS_META.ITM_ORD_TYP);
	public static final MCMeta itm_ord_typ_nm_META = createCommonMeta($itm_ord_typ_nm, mcframe.commonMS.meta.MS_META.ITM_ORD_TYP_NM);
	public static final MCMeta itm_ord_sts_typ_META = createCommonMeta($itm_ord_sts_typ, mcframe.commonMS.meta.MS_META.ITM_ORD_STS_TYP);
	public static final MCMeta itm_ord_sts_typ_nm_META = createCommonMeta($itm_ord_sts_typ_nm, mcframe.commonMS.meta.MS_META.ITM_ORD_STS_TYP_NM);
	public static final MCMeta itm_ord_no_META = createCommonMeta($itm_ord_no, mcframe.commonMA.meta.MA_META.ITM_ORD_NO);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta mfg_loc_nm_META = createCommonMeta($mfg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta strg_loc_cd_META = createCommonMeta($strg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta strg_loc_nm_META = createCommonMeta($strg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta bom_ptn_META = createCommonMeta($bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta oper_ord_no_META = createCommonMeta($oper_ord_no, mcframe.commonMA.meta.MA_META.OPER_ORD_NO);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_nm_META = createCommonMeta($oper_nm, mcframe.commonMA.meta.MA_META.OPER_NM);
	public static final MCMeta oper_seq_META = createCommonMeta($oper_seq, mcframe.commonMA.meta.MA_META.OPER_SEQ);
	public static final MCMeta not_oper_schd_qty_META = createCommonMeta($not_oper_schd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta st_schd_tm_META = createCommonMeta($st_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta end_schd_tm_META = createCommonMeta($end_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta alloc_ctl_typ_META = createCommonMeta($alloc_ctl_typ, mcframe.commonMA.meta.MA_META.ALLOC_CTL_TYP);
	public static final MCMeta alloc_ctl_typ_nm_META = createCommonMeta($alloc_ctl_typ_nm, mcframe.commonMA.meta.MA_META.ALLOC_CTL_TYP_NM);
	public static final MCMeta inpt_ctl_typ_META = createCommonMeta($inpt_ctl_typ, mcframe.commonMA.meta.MA_META.INPT_CTL_TYP);
	public static final MCMeta inpt_ctl_typ_nm_META = createCommonMeta($inpt_ctl_typ_nm, mcframe.commonMA.meta.MA_META.INPT_CTL_TYP_NM);
	public static final MCMeta offst_typ_META = createCommonMeta($offst_typ, mcframe.commonMA.meta.MA_META.OFFST_TYP);
	public static final MCMeta offst_typ_nm_META = createCommonMeta($offst_typ_nm, mcframe.commonMA.meta.MA_META.OFFST_TYP_NM);
	public static final MCMeta offst_META = createCommonMeta($offst, mcframe.commonMA.meta.MA_META.OFFST);
	public static final MCMeta prov_typ_META = createCommonMeta($prov_typ, mcframe.commonMA.meta.MA_META.PROV_TYP);
	public static final MCMeta prov_typ_nm_META = createCommonMeta($prov_typ_nm, mcframe.commonMA.meta.MA_META.PROV_TYP_NM);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta unit_nm_META = createCommonMeta($unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta rnd_typ_META = createCommonMeta($rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta rnd_typ_nm_META = createCommonMeta($rnd_typ_nm, mcframe.commonMA.meta.MA_META.RND_TYP_NM);
	public static final MCMeta alt_itm_flg_META = createCommonMeta($alt_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alt_grp_cd_META = createCommonMeta($alt_grp_cd, mcframe.commonMA.meta.MA_META.ALT_GRP_CD);
	public static final MCMeta alt_grp_nm_META = createCommonMeta($alt_grp_nm, mcframe.commonMA.meta.MA_META.ALT_GRP_NM);
	public static final MCMeta alt_grp_seq_META = createCommonMeta($alt_grp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta alt_itm_typ_META = createCommonMeta($alt_itm_typ, mcframe.commonMA.meta.MA_META.ALT_ITM_TYP);
	public static final MCMeta alt_itm_typ_nm_META = createCommonMeta($alt_itm_typ_nm, mcframe.commonMA.meta.MA_META.ALT_ITM_TYP_NM);
	public static final MCMeta alt_itm_ratio_META = createCommonMeta($alt_itm_ratio, mcframe.commonMA.meta.MA_META.ALT_ITM_RATIO);
	public static final MCMeta alt_alloc_prio_META = createCommonMeta($alt_alloc_prio, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta seq_no_META = createCommonMeta($seq_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta not_target_flg_META = createCommonMeta($not_target_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta select_alt_flg_META = createCommonMeta($select_alt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta no_output_flg_META = createCommonMeta($no_output_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Srch01_RsltR> constMetas = new ConstMetaList<Srch01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			hrrchy_META,
			mfg_st_schd_dt_META,
			mfg_end_schd_dt_META,
			schd_in_dt_META,
			prod_avlbl_sts_META,
			purc_itm_sts_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			sno1_META,
			sno1_null_flg_META,
			sno2_META,
			sno2_null_flg_META,
			sno3_META,
			sno3_null_flg_META,
			sno4_META,
			sno4_null_flg_META,
			ord_qty_META,
			need_qty_META,
			alloc_avlbl_qty_META,
			alloc_qty_META,
			prod_avlbl_qty_META,
			itm_ord_typ_META,
			itm_ord_typ_nm_META,
			itm_ord_sts_typ_META,
			itm_ord_sts_typ_nm_META,
			itm_ord_no_META,
			mfg_loc_cd_META,
			mfg_loc_nm_META,
			strg_loc_cd_META,
			strg_loc_nm_META,
			wg_cd_META,
			wg_nm_META,
			bom_ptn_META,
			oper_ord_no_META,
			oper_cd_META,
			oper_nm_META,
			oper_seq_META,
			not_oper_schd_qty_META,
			st_schd_tm_META,
			end_schd_tm_META,
			alloc_ctl_typ_META,
			alloc_ctl_typ_nm_META,
			inpt_ctl_typ_META,
			inpt_ctl_typ_nm_META,
			offst_typ_META,
			offst_typ_nm_META,
			offst_META,
			prov_typ_META,
			prov_typ_nm_META,
			unit_cd_META,
			unit_nm_META,
			dec_place_META,
			rnd_typ_META,
			rnd_typ_nm_META,
			alt_itm_flg_META,
			alt_grp_cd_META,
			alt_grp_nm_META,
			alt_grp_seq_META,
			alt_itm_typ_META,
			alt_itm_typ_nm_META,
			alt_itm_ratio_META,
			alt_alloc_prio_META,
			peg_no_META,
			seq_no_META,
			not_target_flg_META,
			select_alt_flg_META,
			no_output_flg_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$itm_ord_typ, "MSC_ITM_ORD_TYP"},	// itm_ord_typ
				{$itm_ord_sts_typ, "MSC_ITM_ORD_STS_TYP"},	// itm_ord_sts_typ
				{$alloc_ctl_typ, "MAC_ALLOC_CTL_TYP"},	// alloc_ctl_typ
				{$inpt_ctl_typ, "MAC_INPT_CTL_TYP"},	// inpt_ctl_typ
				{$offst_typ, "MAC_OFFST_TYP"},	// offst_typ
				{$prov_typ, "MAC_PROV_TYP"},	// prov_typ
				{$rnd_typ, "MAC_RND_TYP"},	// rnd_typ
				{$alt_itm_typ, "MAC_ALT_ITM_TYP"}	// alt_itm_typ
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
	protected Srch01_RsltR_MC_A(ConstMetaList<? extends Srch01_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR clone() {
		return (Srch01_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR createInstance() {
		return (Srch01_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR getValues(String... names) {
		return (Srch01_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Hierarchy 階層.<p>
	 *
	 */
	public MCNumber hrrchy() {
		return getConstNumber(offset + 0, $hrrchy);
	}

	/**
	 * Hierarchy 階層.<p>
	 *
	 */
	public void hrrchy(MCNumber value) {
		setConstNumber(offset + 0, $hrrchy, value);
	}

	/**
	 * Hierarchy 階層.<p>
	 *
	 */
	public void hrrchy(int value) {
		setConstNumber(offset + 0, $hrrchy, value);
	}

	/**
	 * Hierarchy 階層.<p>
	 *
	 */
	public void hrrchy(long value) {
		setConstNumber(offset + 0, $hrrchy, value);
	}

	/**
	 * Hierarchy 階層.<p>
	 *
	 */
	public void hrrchy(float value) {
		setConstNumber(offset + 0, $hrrchy, value);
	}

	/**
	 * Hierarchy 階層.<p>
	 *
	 */
	public void hrrchy(double value) {
		setConstNumber(offset + 0, $hrrchy, value);
	}


	/**
	 * Scheduled mfg. start date 製造着手予定日.<p>
	 *
	 */
	public MCDate mfg_st_schd_dt() {
		return getConstDate(offset + 1, $mfg_st_schd_dt);
	}

	/**
	 * Scheduled mfg. start date 製造着手予定日.<p>
	 *
	 */
	public void mfg_st_schd_dt(MCDate value) {
		setConstDate(offset + 1, $mfg_st_schd_dt, value);
	}


	/**
	 * Scheduled mfg. end date 製造終了予定日.<p>
	 *
	 */
	public MCDate mfg_end_schd_dt() {
		return getConstDate(offset + 2, $mfg_end_schd_dt);
	}

	/**
	 * Scheduled mfg. end date 製造終了予定日.<p>
	 *
	 */
	public void mfg_end_schd_dt(MCDate value) {
		setConstDate(offset + 2, $mfg_end_schd_dt, value);
	}


	/**
	 * Scheduled input date 投入予定日.<p>
	 *
	 */
	public MCDate schd_in_dt() {
		return getConstDate(offset + 3, $schd_in_dt);
	}

	/**
	 * Scheduled input date 投入予定日.<p>
	 *
	 */
	public void schd_in_dt(MCDate value) {
		setConstDate(offset + 3, $schd_in_dt, value);
	}


	/**
	 * Production possibility 生産可否状況.<p>
	 *
	 */
	public String prod_avlbl_sts() {
		return getConstString(offset + 4, $prod_avlbl_sts);
	}

	/**
	 * Production possibility 生産可否状況.<p>
	 *
	 */
	public void prod_avlbl_sts(String value) {
		setConstString(offset + 4, $prod_avlbl_sts, value);
	}


	/**
	 * Parts status 部品状況.<p>
	 *
	 */
	public String purc_itm_sts() {
		return getConstString(offset + 5, $purc_itm_sts);
	}

	/**
	 * Parts status 部品状況.<p>
	 *
	 */
	public void purc_itm_sts(String value) {
		setConstString(offset + 5, $purc_itm_sts, value);
	}


	/**
	 * Item 品目.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 6, $itm_cd);
	}

	/**
	 * Item 品目.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 6, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 7, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 7, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 8, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 8, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 9, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 9, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 10, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 10, $itm_nm, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 11, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 11, $sno1, value);
	}


	/**
	 * Allow without SEIBAN No. 1 手配ＮＯ１無し可.<p>
	 *
	 */
	public boolean sno1_null_flg() {
		return getConstBoolean(offset + 12, $sno1_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 1 手配ＮＯ１無し可.<p>
	 *
	 */
	public void sno1_null_flg(boolean value) {
		setConstBoolean(offset + 12, $sno1_null_flg, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 13, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 13, $sno2, value);
	}


	/**
	 * Allow without SEIBAN No. 2 手配ＮＯ２無し可.<p>
	 *
	 */
	public boolean sno2_null_flg() {
		return getConstBoolean(offset + 14, $sno2_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 2 手配ＮＯ２無し可.<p>
	 *
	 */
	public void sno2_null_flg(boolean value) {
		setConstBoolean(offset + 14, $sno2_null_flg, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 15, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 15, $sno3, value);
	}


	/**
	 * Allow without SEIBAN No. 3 手配ＮＯ３無し可.<p>
	 *
	 */
	public boolean sno3_null_flg() {
		return getConstBoolean(offset + 16, $sno3_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 3 手配ＮＯ３無し可.<p>
	 *
	 */
	public void sno3_null_flg(boolean value) {
		setConstBoolean(offset + 16, $sno3_null_flg, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 17, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 17, $sno4, value);
	}


	/**
	 * Allow without SEIBAN No. 4 手配ＮＯ４無し可.<p>
	 *
	 */
	public boolean sno4_null_flg() {
		return getConstBoolean(offset + 18, $sno4_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 4 手配ＮＯ４無し可.<p>
	 *
	 */
	public void sno4_null_flg(boolean value) {
		setConstBoolean(offset + 18, $sno4_null_flg, value);
	}


	/**
	 * Order qty. オーダ数量.<p>
	 *
	 */
	public MCNumber ord_qty() {
		return getConstNumber(offset + 19, $ord_qty);
	}

	/**
	 * Order qty. オーダ数量.<p>
	 *
	 */
	public void ord_qty(MCNumber value) {
		setConstNumber(offset + 19, $ord_qty, value);
	}

	/**
	 * Order qty. オーダ数量.<p>
	 *
	 */
	public void ord_qty(int value) {
		setConstNumber(offset + 19, $ord_qty, value);
	}

	/**
	 * Order qty. オーダ数量.<p>
	 *
	 */
	public void ord_qty(long value) {
		setConstNumber(offset + 19, $ord_qty, value);
	}

	/**
	 * Order qty. オーダ数量.<p>
	 *
	 */
	public void ord_qty(float value) {
		setConstNumber(offset + 19, $ord_qty, value);
	}

	/**
	 * Order qty. オーダ数量.<p>
	 *
	 */
	public void ord_qty(double value) {
		setConstNumber(offset + 19, $ord_qty, value);
	}


	/**
	 * Required qty. 必要数量.<p>
	 *
	 */
	public MCNumber need_qty() {
		return getConstNumber(offset + 20, $need_qty);
	}

	/**
	 * Required qty. 必要数量.<p>
	 *
	 */
	public void need_qty(MCNumber value) {
		setConstNumber(offset + 20, $need_qty, value);
	}

	/**
	 * Required qty. 必要数量.<p>
	 *
	 */
	public void need_qty(int value) {
		setConstNumber(offset + 20, $need_qty, value);
	}

	/**
	 * Required qty. 必要数量.<p>
	 *
	 */
	public void need_qty(long value) {
		setConstNumber(offset + 20, $need_qty, value);
	}

	/**
	 * Required qty. 必要数量.<p>
	 *
	 */
	public void need_qty(float value) {
		setConstNumber(offset + 20, $need_qty, value);
	}

	/**
	 * Required qty. 必要数量.<p>
	 *
	 */
	public void need_qty(double value) {
		setConstNumber(offset + 20, $need_qty, value);
	}


	/**
	 * Allocatable inventory qty. 引当可能在庫数量.<p>
	 *
	 */
	public MCNumber alloc_avlbl_qty() {
		return getConstNumber(offset + 21, $alloc_avlbl_qty);
	}

	/**
	 * Allocatable inventory qty. 引当可能在庫数量.<p>
	 *
	 */
	public void alloc_avlbl_qty(MCNumber value) {
		setConstNumber(offset + 21, $alloc_avlbl_qty, value);
	}

	/**
	 * Allocatable inventory qty. 引当可能在庫数量.<p>
	 *
	 */
	public void alloc_avlbl_qty(int value) {
		setConstNumber(offset + 21, $alloc_avlbl_qty, value);
	}

	/**
	 * Allocatable inventory qty. 引当可能在庫数量.<p>
	 *
	 */
	public void alloc_avlbl_qty(long value) {
		setConstNumber(offset + 21, $alloc_avlbl_qty, value);
	}

	/**
	 * Allocatable inventory qty. 引当可能在庫数量.<p>
	 *
	 */
	public void alloc_avlbl_qty(float value) {
		setConstNumber(offset + 21, $alloc_avlbl_qty, value);
	}

	/**
	 * Allocatable inventory qty. 引当可能在庫数量.<p>
	 *
	 */
	public void alloc_avlbl_qty(double value) {
		setConstNumber(offset + 21, $alloc_avlbl_qty, value);
	}


	/**
	 * Allocation qty. 引当数量.<p>
	 *
	 */
	public MCNumber alloc_qty() {
		return getConstNumber(offset + 22, $alloc_qty);
	}

	/**
	 * Allocation qty. 引当数量.<p>
	 *
	 */
	public void alloc_qty(MCNumber value) {
		setConstNumber(offset + 22, $alloc_qty, value);
	}

	/**
	 * Allocation qty. 引当数量.<p>
	 *
	 */
	public void alloc_qty(int value) {
		setConstNumber(offset + 22, $alloc_qty, value);
	}

	/**
	 * Allocation qty. 引当数量.<p>
	 *
	 */
	public void alloc_qty(long value) {
		setConstNumber(offset + 22, $alloc_qty, value);
	}

	/**
	 * Allocation qty. 引当数量.<p>
	 *
	 */
	public void alloc_qty(float value) {
		setConstNumber(offset + 22, $alloc_qty, value);
	}

	/**
	 * Allocation qty. 引当数量.<p>
	 *
	 */
	public void alloc_qty(double value) {
		setConstNumber(offset + 22, $alloc_qty, value);
	}


	/**
	 * Possible production qty. 生産可能数量.<p>
	 *
	 */
	public MCNumber prod_avlbl_qty() {
		return getConstNumber(offset + 23, $prod_avlbl_qty);
	}

	/**
	 * Possible production qty. 生産可能数量.<p>
	 *
	 */
	public void prod_avlbl_qty(MCNumber value) {
		setConstNumber(offset + 23, $prod_avlbl_qty, value);
	}

	/**
	 * Possible production qty. 生産可能数量.<p>
	 *
	 */
	public void prod_avlbl_qty(int value) {
		setConstNumber(offset + 23, $prod_avlbl_qty, value);
	}

	/**
	 * Possible production qty. 生産可能数量.<p>
	 *
	 */
	public void prod_avlbl_qty(long value) {
		setConstNumber(offset + 23, $prod_avlbl_qty, value);
	}

	/**
	 * Possible production qty. 生産可能数量.<p>
	 *
	 */
	public void prod_avlbl_qty(float value) {
		setConstNumber(offset + 23, $prod_avlbl_qty, value);
	}

	/**
	 * Possible production qty. 生産可能数量.<p>
	 *
	 */
	public void prod_avlbl_qty(double value) {
		setConstNumber(offset + 23, $prod_avlbl_qty, value);
	}


	/**
	 * Order type オーダ区分.<p>
	 *
	 */
	public String itm_ord_typ() {
		return getConstString(offset + 24, $itm_ord_typ);
	}

	/**
	 * Order type オーダ区分.<p>
	 *
	 */
	public void itm_ord_typ(String value) {
		setConstString(offset + 24, $itm_ord_typ, value);
	}


	/**
	 * Order type name オーダ区分名.<p>
	 *
	 */
	public String itm_ord_typ_nm() {
		return getConstString(offset + 25, $itm_ord_typ_nm);
	}

	/**
	 * Order type name オーダ区分名.<p>
	 *
	 */
	public void itm_ord_typ_nm(String value) {
		setConstString(offset + 25, $itm_ord_typ_nm, value);
	}


	/**
	 * Item status 品目状況.<p>
	 *
	 */
	public String itm_ord_sts_typ() {
		return getConstString(offset + 26, $itm_ord_sts_typ);
	}

	/**
	 * Item status 品目状況.<p>
	 *
	 */
	public void itm_ord_sts_typ(String value) {
		setConstString(offset + 26, $itm_ord_sts_typ, value);
	}


	/**
	 * Item status name 品目状況名.<p>
	 *
	 */
	public String itm_ord_sts_typ_nm() {
		return getConstString(offset + 27, $itm_ord_sts_typ_nm);
	}

	/**
	 * Item status name 品目状況名.<p>
	 *
	 */
	public void itm_ord_sts_typ_nm(String value) {
		setConstString(offset + 27, $itm_ord_sts_typ_nm, value);
	}


	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public String itm_ord_no() {
		return getConstString(offset + 28, $itm_ord_no);
	}

	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public void itm_ord_no(String value) {
		setConstString(offset + 28, $itm_ord_no, value);
	}


	/**
	 * Mfg. location 製造場所.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 29, $mfg_loc_cd);
	}

	/**
	 * Mfg. location 製造場所.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 29, $mfg_loc_cd, value);
	}


	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public String mfg_loc_nm() {
		return getConstString(offset + 30, $mfg_loc_nm);
	}

	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public void mfg_loc_nm(String value) {
		setConstString(offset + 30, $mfg_loc_nm, value);
	}


	/**
	 * Storage location 格納場所.<p>
	 *
	 */
	public String strg_loc_cd() {
		return getConstString(offset + 31, $strg_loc_cd);
	}

	/**
	 * Storage location 格納場所.<p>
	 *
	 */
	public void strg_loc_cd(String value) {
		setConstString(offset + 31, $strg_loc_cd, value);
	}


	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public String strg_loc_nm() {
		return getConstString(offset + 32, $strg_loc_nm);
	}

	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public void strg_loc_nm(String value) {
		setConstString(offset + 32, $strg_loc_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 33, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 33, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 34, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 34, $wg_nm, value);
	}


	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return getConstString(offset + 35, $bom_ptn);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		setConstString(offset + 35, $bom_ptn, value);
	}


	/**
	 * Operation order No. 工程オーダＮＯ.<p>
	 *
	 */
	public String oper_ord_no() {
		return getConstString(offset + 36, $oper_ord_no);
	}

	/**
	 * Operation order No. 工程オーダＮＯ.<p>
	 *
	 */
	public void oper_ord_no(String value) {
		setConstString(offset + 36, $oper_ord_no, value);
	}


	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 37, $oper_cd);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 37, $oper_cd, value);
	}


	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public String oper_nm() {
		return getConstString(offset + 38, $oper_nm);
	}

	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public void oper_nm(String value) {
		setConstString(offset + 38, $oper_nm, value);
	}


	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public MCNumber oper_seq() {
		return getConstNumber(offset + 39, $oper_seq);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(MCNumber value) {
		setConstNumber(offset + 39, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(int value) {
		setConstNumber(offset + 39, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(long value) {
		setConstNumber(offset + 39, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(float value) {
		setConstNumber(offset + 39, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(double value) {
		setConstNumber(offset + 39, $oper_seq, value);
	}


	/**
	 * Operation unordered qty. 工程未指図数量.<p>
	 *
	 */
	public MCNumber not_oper_schd_qty() {
		return getConstNumber(offset + 40, $not_oper_schd_qty);
	}

	/**
	 * Operation unordered qty. 工程未指図数量.<p>
	 *
	 */
	public void not_oper_schd_qty(MCNumber value) {
		setConstNumber(offset + 40, $not_oper_schd_qty, value);
	}

	/**
	 * Operation unordered qty. 工程未指図数量.<p>
	 *
	 */
	public void not_oper_schd_qty(int value) {
		setConstNumber(offset + 40, $not_oper_schd_qty, value);
	}

	/**
	 * Operation unordered qty. 工程未指図数量.<p>
	 *
	 */
	public void not_oper_schd_qty(long value) {
		setConstNumber(offset + 40, $not_oper_schd_qty, value);
	}

	/**
	 * Operation unordered qty. 工程未指図数量.<p>
	 *
	 */
	public void not_oper_schd_qty(float value) {
		setConstNumber(offset + 40, $not_oper_schd_qty, value);
	}

	/**
	 * Operation unordered qty. 工程未指図数量.<p>
	 *
	 */
	public void not_oper_schd_qty(double value) {
		setConstNumber(offset + 40, $not_oper_schd_qty, value);
	}


	/**
	 * Scheduled operation start date and time 工程着手予定日時.<p>
	 *
	 */
	public MCDate st_schd_tm() {
		return getConstDate(offset + 41, $st_schd_tm);
	}

	/**
	 * Scheduled operation start date and time 工程着手予定日時.<p>
	 *
	 */
	public void st_schd_tm(MCDate value) {
		setConstDate(offset + 41, $st_schd_tm, value);
	}


	/**
	 * Scheduled operation end date and time 工程終了予定日時.<p>
	 *
	 */
	public MCDate end_schd_tm() {
		return getConstDate(offset + 42, $end_schd_tm);
	}

	/**
	 * Scheduled operation end date and time 工程終了予定日時.<p>
	 *
	 */
	public void end_schd_tm(MCDate value) {
		setConstDate(offset + 42, $end_schd_tm, value);
	}


	/**
	 * Allocation control type 引当制御区分.<p>
	 *
	 */
	public String alloc_ctl_typ() {
		return getConstString(offset + 43, $alloc_ctl_typ);
	}

	/**
	 * Allocation control type 引当制御区分.<p>
	 *
	 */
	public void alloc_ctl_typ(String value) {
		setConstString(offset + 43, $alloc_ctl_typ, value);
	}


	/**
	 * Allocation control type name 引当制御区分名.<p>
	 *
	 */
	public String alloc_ctl_typ_nm() {
		return getConstString(offset + 44, $alloc_ctl_typ_nm);
	}

	/**
	 * Allocation control type name 引当制御区分名.<p>
	 *
	 */
	public void alloc_ctl_typ_nm(String value) {
		setConstString(offset + 44, $alloc_ctl_typ_nm, value);
	}


	/**
	 * Input control type 投入制御区分.<p>
	 *
	 */
	public String inpt_ctl_typ() {
		return getConstString(offset + 45, $inpt_ctl_typ);
	}

	/**
	 * Input control type 投入制御区分.<p>
	 *
	 */
	public void inpt_ctl_typ(String value) {
		setConstString(offset + 45, $inpt_ctl_typ, value);
	}


	/**
	 * Input control type name 投入制御区分名.<p>
	 *
	 */
	public String inpt_ctl_typ_nm() {
		return getConstString(offset + 46, $inpt_ctl_typ_nm);
	}

	/**
	 * Input control type name 投入制御区分名.<p>
	 *
	 */
	public void inpt_ctl_typ_nm(String value) {
		setConstString(offset + 46, $inpt_ctl_typ_nm, value);
	}


	/**
	 * Input offset type 投入オフセット区分.<p>
	 *
	 */
	public String offst_typ() {
		return getConstString(offset + 47, $offst_typ);
	}

	/**
	 * Input offset type 投入オフセット区分.<p>
	 *
	 */
	public void offst_typ(String value) {
		setConstString(offset + 47, $offst_typ, value);
	}


	/**
	 * Input offset type name 投入オフセット区分名.<p>
	 *
	 */
	public String offst_typ_nm() {
		return getConstString(offset + 48, $offst_typ_nm);
	}

	/**
	 * Input offset type name 投入オフセット区分名.<p>
	 *
	 */
	public void offst_typ_nm(String value) {
		setConstString(offset + 48, $offst_typ_nm, value);
	}


	/**
	 * Input offset 投入オフセット.<p>
	 *
	 */
	public MCNumber offst() {
		return getConstNumber(offset + 49, $offst);
	}

	/**
	 * Input offset 投入オフセット.<p>
	 *
	 */
	public void offst(MCNumber value) {
		setConstNumber(offset + 49, $offst, value);
	}

	/**
	 * Input offset 投入オフセット.<p>
	 *
	 */
	public void offst(int value) {
		setConstNumber(offset + 49, $offst, value);
	}

	/**
	 * Input offset 投入オフセット.<p>
	 *
	 */
	public void offst(long value) {
		setConstNumber(offset + 49, $offst, value);
	}

	/**
	 * Input offset 投入オフセット.<p>
	 *
	 */
	public void offst(float value) {
		setConstNumber(offset + 49, $offst, value);
	}

	/**
	 * Input offset 投入オフセット.<p>
	 *
	 */
	public void offst(double value) {
		setConstNumber(offset + 49, $offst, value);
	}


	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public String prov_typ() {
		return getConstString(offset + 50, $prov_typ);
	}

	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public void prov_typ(String value) {
		setConstString(offset + 50, $prov_typ, value);
	}


	/**
	 * Supply type name 支給区分名.<p>
	 *
	 */
	public String prov_typ_nm() {
		return getConstString(offset + 51, $prov_typ_nm);
	}

	/**
	 * Supply type name 支給区分名.<p>
	 *
	 */
	public void prov_typ_nm(String value) {
		setConstString(offset + 51, $prov_typ_nm, value);
	}


	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 52, $unit_cd);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 52, $unit_cd, value);
	}


	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public String unit_nm() {
		return getConstString(offset + 53, $unit_nm);
	}

	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public void unit_nm(String value) {
		setConstString(offset + 53, $unit_nm, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 54, $dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 54, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 54, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 54, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 54, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 54, $dec_place, value);
	}


	/**
	 * Rounding type 端数処理区分.<p>
	 *
	 */
	public String rnd_typ() {
		return getConstString(offset + 55, $rnd_typ);
	}

	/**
	 * Rounding type 端数処理区分.<p>
	 *
	 */
	public void rnd_typ(String value) {
		setConstString(offset + 55, $rnd_typ, value);
	}


	/**
	 * Rounding type name 端数処理区分名.<p>
	 *
	 */
	public String rnd_typ_nm() {
		return getConstString(offset + 56, $rnd_typ_nm);
	}

	/**
	 * Rounding type name 端数処理区分名.<p>
	 *
	 */
	public void rnd_typ_nm(String value) {
		setConstString(offset + 56, $rnd_typ_nm, value);
	}


	/**
	 * Alternative item flg. 代替品目ＦＬＧ.<p>
	 *
	 */
	public boolean alt_itm_flg() {
		return getConstBoolean(offset + 57, $alt_itm_flg);
	}

	/**
	 * Alternative item flg. 代替品目ＦＬＧ.<p>
	 *
	 */
	public void alt_itm_flg(boolean value) {
		setConstBoolean(offset + 57, $alt_itm_flg, value);
	}


	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public String alt_grp_cd() {
		return getConstString(offset + 58, $alt_grp_cd);
	}

	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public void alt_grp_cd(String value) {
		setConstString(offset + 58, $alt_grp_cd, value);
	}


	/**
	 * Alternative group name 代替グループ名.<p>
	 *
	 */
	public String alt_grp_nm() {
		return getConstString(offset + 59, $alt_grp_nm);
	}

	/**
	 * Alternative group name 代替グループ名.<p>
	 *
	 */
	public void alt_grp_nm(String value) {
		setConstString(offset + 59, $alt_grp_nm, value);
	}


	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public MCNumber alt_grp_seq() {
		return getConstNumber(offset + 60, $alt_grp_seq);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(MCNumber value) {
		setConstNumber(offset + 60, $alt_grp_seq, value);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(int value) {
		setConstNumber(offset + 60, $alt_grp_seq, value);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(long value) {
		setConstNumber(offset + 60, $alt_grp_seq, value);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(float value) {
		setConstNumber(offset + 60, $alt_grp_seq, value);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(double value) {
		setConstNumber(offset + 60, $alt_grp_seq, value);
	}


	/**
	 * Alternative item selection type 代替品目選択区分.<p>
	 *
	 */
	public String alt_itm_typ() {
		return getConstString(offset + 61, $alt_itm_typ);
	}

	/**
	 * Alternative item selection type 代替品目選択区分.<p>
	 *
	 */
	public void alt_itm_typ(String value) {
		setConstString(offset + 61, $alt_itm_typ, value);
	}


	/**
	 * Alternative item selection type name 代替品目選択区分名.<p>
	 *
	 */
	public String alt_itm_typ_nm() {
		return getConstString(offset + 62, $alt_itm_typ_nm);
	}

	/**
	 * Alternative item selection type name 代替品目選択区分名.<p>
	 *
	 */
	public void alt_itm_typ_nm(String value) {
		setConstString(offset + 62, $alt_itm_typ_nm, value);
	}


	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public MCNumber alt_itm_ratio() {
		return getConstNumber(offset + 63, $alt_itm_ratio);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(MCNumber value) {
		setConstNumber(offset + 63, $alt_itm_ratio, value);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(int value) {
		setConstNumber(offset + 63, $alt_itm_ratio, value);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(long value) {
		setConstNumber(offset + 63, $alt_itm_ratio, value);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(float value) {
		setConstNumber(offset + 63, $alt_itm_ratio, value);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(double value) {
		setConstNumber(offset + 63, $alt_itm_ratio, value);
	}


	/**
	 * Allocation priority 引当優先順.<p>
	 *
	 */
	public MCNumber alt_alloc_prio() {
		return getConstNumber(offset + 64, $alt_alloc_prio);
	}

	/**
	 * Allocation priority 引当優先順.<p>
	 *
	 */
	public void alt_alloc_prio(MCNumber value) {
		setConstNumber(offset + 64, $alt_alloc_prio, value);
	}

	/**
	 * Allocation priority 引当優先順.<p>
	 *
	 */
	public void alt_alloc_prio(int value) {
		setConstNumber(offset + 64, $alt_alloc_prio, value);
	}

	/**
	 * Allocation priority 引当優先順.<p>
	 *
	 */
	public void alt_alloc_prio(long value) {
		setConstNumber(offset + 64, $alt_alloc_prio, value);
	}

	/**
	 * Allocation priority 引当優先順.<p>
	 *
	 */
	public void alt_alloc_prio(float value) {
		setConstNumber(offset + 64, $alt_alloc_prio, value);
	}

	/**
	 * Allocation priority 引当優先順.<p>
	 *
	 */
	public void alt_alloc_prio(double value) {
		setConstNumber(offset + 64, $alt_alloc_prio, value);
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 65, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 65, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 65, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 65, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 65, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 65, $peg_no, value);
	}


	/**
	 * Details sequence number 明細連番.<p>
	 *
	 */
	public MCNumber seq_no() {
		return getConstNumber(offset + 66, $seq_no);
	}

	/**
	 * Details sequence number 明細連番.<p>
	 *
	 */
	public void seq_no(MCNumber value) {
		setConstNumber(offset + 66, $seq_no, value);
	}

	/**
	 * Details sequence number 明細連番.<p>
	 *
	 */
	public void seq_no(int value) {
		setConstNumber(offset + 66, $seq_no, value);
	}

	/**
	 * Details sequence number 明細連番.<p>
	 *
	 */
	public void seq_no(long value) {
		setConstNumber(offset + 66, $seq_no, value);
	}

	/**
	 * Details sequence number 明細連番.<p>
	 *
	 */
	public void seq_no(float value) {
		setConstNumber(offset + 66, $seq_no, value);
	}

	/**
	 * Details sequence number 明細連番.<p>
	 *
	 */
	public void seq_no(double value) {
		setConstNumber(offset + 66, $seq_no, value);
	}


	/**
	 * Non-target flg. 対象外フラグ.<p>
	 *
	 */
	public boolean not_target_flg() {
		return getConstBoolean(offset + 67, $not_target_flg);
	}

	/**
	 * Non-target flg. 対象外フラグ.<p>
	 *
	 */
	public void not_target_flg(boolean value) {
		setConstBoolean(offset + 67, $not_target_flg, value);
	}


	/**
	 * Selected alternative item flg. 選択代替品フラグ.<p>
	 *
	 */
	public boolean select_alt_flg() {
		return getConstBoolean(offset + 68, $select_alt_flg);
	}

	/**
	 * Selected alternative item flg. 選択代替品フラグ.<p>
	 *
	 */
	public void select_alt_flg(boolean value) {
		setConstBoolean(offset + 68, $select_alt_flg, value);
	}


	/**
	 * Not to display flg. 表示対象外フラグ.<p>
	 *
	 */
	public boolean no_output_flg() {
		return getConstBoolean(offset + 69, $no_output_flg);
	}

	/**
	 * Not to display flg. 表示対象外フラグ.<p>
	 *
	 */
	public void no_output_flg(boolean value) {
		setConstBoolean(offset + 69, $no_output_flg, value);
	}


	public String getString(String name) {
		if ($prod_avlbl_sts.equalsIgnoreCase(name)) {
			return prod_avlbl_sts();
		}
		if ($purc_itm_sts.equalsIgnoreCase(name)) {
			return purc_itm_sts();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($itm_ord_typ.equalsIgnoreCase(name)) {
			return itm_ord_typ();
		}
		if ($itm_ord_typ_nm.equalsIgnoreCase(name)) {
			return itm_ord_typ_nm();
		}
		if ($itm_ord_sts_typ.equalsIgnoreCase(name)) {
			return itm_ord_sts_typ();
		}
		if ($itm_ord_sts_typ_nm.equalsIgnoreCase(name)) {
			return itm_ord_sts_typ_nm();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			return strg_loc_cd();
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			return strg_loc_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($oper_ord_no.equalsIgnoreCase(name)) {
			return oper_ord_no();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($alloc_ctl_typ.equalsIgnoreCase(name)) {
			return alloc_ctl_typ();
		}
		if ($alloc_ctl_typ_nm.equalsIgnoreCase(name)) {
			return alloc_ctl_typ_nm();
		}
		if ($inpt_ctl_typ.equalsIgnoreCase(name)) {
			return inpt_ctl_typ();
		}
		if ($inpt_ctl_typ_nm.equalsIgnoreCase(name)) {
			return inpt_ctl_typ_nm();
		}
		if ($offst_typ.equalsIgnoreCase(name)) {
			return offst_typ();
		}
		if ($offst_typ_nm.equalsIgnoreCase(name)) {
			return offst_typ_nm();
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			return prov_typ();
		}
		if ($prov_typ_nm.equalsIgnoreCase(name)) {
			return prov_typ_nm();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($rnd_typ.equalsIgnoreCase(name)) {
			return rnd_typ();
		}
		if ($rnd_typ_nm.equalsIgnoreCase(name)) {
			return rnd_typ_nm();
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			return alt_grp_cd();
		}
		if ($alt_grp_nm.equalsIgnoreCase(name)) {
			return alt_grp_nm();
		}
		if ($alt_itm_typ.equalsIgnoreCase(name)) {
			return alt_itm_typ();
		}
		if ($alt_itm_typ_nm.equalsIgnoreCase(name)) {
			return alt_itm_typ_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($hrrchy.equalsIgnoreCase(name)) {
			return hrrchy();
		}
		if ($ord_qty.equalsIgnoreCase(name)) {
			return ord_qty();
		}
		if ($need_qty.equalsIgnoreCase(name)) {
			return need_qty();
		}
		if ($alloc_avlbl_qty.equalsIgnoreCase(name)) {
			return alloc_avlbl_qty();
		}
		if ($alloc_qty.equalsIgnoreCase(name)) {
			return alloc_qty();
		}
		if ($prod_avlbl_qty.equalsIgnoreCase(name)) {
			return prod_avlbl_qty();
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($not_oper_schd_qty.equalsIgnoreCase(name)) {
			return not_oper_schd_qty();
		}
		if ($offst.equalsIgnoreCase(name)) {
			return offst();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			return alt_grp_seq();
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			return alt_itm_ratio();
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			return alt_alloc_prio();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($seq_no.equalsIgnoreCase(name)) {
			return seq_no();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($mfg_st_schd_dt.equalsIgnoreCase(name)) {
			return mfg_st_schd_dt();
		}
		if ($mfg_end_schd_dt.equalsIgnoreCase(name)) {
			return mfg_end_schd_dt();
		}
		if ($schd_in_dt.equalsIgnoreCase(name)) {
			return schd_in_dt();
		}
		if ($st_schd_tm.equalsIgnoreCase(name)) {
			return st_schd_tm();
		}
		if ($end_schd_tm.equalsIgnoreCase(name)) {
			return end_schd_tm();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($sno1_null_flg.equalsIgnoreCase(name)) {
			return sno1_null_flg();
		}
		if ($sno2_null_flg.equalsIgnoreCase(name)) {
			return sno2_null_flg();
		}
		if ($sno3_null_flg.equalsIgnoreCase(name)) {
			return sno3_null_flg();
		}
		if ($sno4_null_flg.equalsIgnoreCase(name)) {
			return sno4_null_flg();
		}
		if ($alt_itm_flg.equalsIgnoreCase(name)) {
			return alt_itm_flg();
		}
		if ($not_target_flg.equalsIgnoreCase(name)) {
			return not_target_flg();
		}
		if ($select_alt_flg.equalsIgnoreCase(name)) {
			return select_alt_flg();
		}
		if ($no_output_flg.equalsIgnoreCase(name)) {
			return no_output_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($prod_avlbl_sts.equalsIgnoreCase(name)) {
			return prod_avlbl_sts();
		}
		if ($purc_itm_sts.equalsIgnoreCase(name)) {
			return purc_itm_sts();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($itm_ord_typ.equalsIgnoreCase(name)) {
			return itm_ord_typ();
		}
		if ($itm_ord_typ_nm.equalsIgnoreCase(name)) {
			return itm_ord_typ_nm();
		}
		if ($itm_ord_sts_typ.equalsIgnoreCase(name)) {
			return itm_ord_sts_typ();
		}
		if ($itm_ord_sts_typ_nm.equalsIgnoreCase(name)) {
			return itm_ord_sts_typ_nm();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			return strg_loc_cd();
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			return strg_loc_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($oper_ord_no.equalsIgnoreCase(name)) {
			return oper_ord_no();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($alloc_ctl_typ.equalsIgnoreCase(name)) {
			return alloc_ctl_typ();
		}
		if ($alloc_ctl_typ_nm.equalsIgnoreCase(name)) {
			return alloc_ctl_typ_nm();
		}
		if ($inpt_ctl_typ.equalsIgnoreCase(name)) {
			return inpt_ctl_typ();
		}
		if ($inpt_ctl_typ_nm.equalsIgnoreCase(name)) {
			return inpt_ctl_typ_nm();
		}
		if ($offst_typ.equalsIgnoreCase(name)) {
			return offst_typ();
		}
		if ($offst_typ_nm.equalsIgnoreCase(name)) {
			return offst_typ_nm();
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			return prov_typ();
		}
		if ($prov_typ_nm.equalsIgnoreCase(name)) {
			return prov_typ_nm();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($rnd_typ.equalsIgnoreCase(name)) {
			return rnd_typ();
		}
		if ($rnd_typ_nm.equalsIgnoreCase(name)) {
			return rnd_typ_nm();
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			return alt_grp_cd();
		}
		if ($alt_grp_nm.equalsIgnoreCase(name)) {
			return alt_grp_nm();
		}
		if ($alt_itm_typ.equalsIgnoreCase(name)) {
			return alt_itm_typ();
		}
		if ($alt_itm_typ_nm.equalsIgnoreCase(name)) {
			return alt_itm_typ_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($hrrchy.equalsIgnoreCase(name)) {
			return hrrchy();
		}
		if ($ord_qty.equalsIgnoreCase(name)) {
			return ord_qty();
		}
		if ($need_qty.equalsIgnoreCase(name)) {
			return need_qty();
		}
		if ($alloc_avlbl_qty.equalsIgnoreCase(name)) {
			return alloc_avlbl_qty();
		}
		if ($alloc_qty.equalsIgnoreCase(name)) {
			return alloc_qty();
		}
		if ($prod_avlbl_qty.equalsIgnoreCase(name)) {
			return prod_avlbl_qty();
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($not_oper_schd_qty.equalsIgnoreCase(name)) {
			return not_oper_schd_qty();
		}
		if ($offst.equalsIgnoreCase(name)) {
			return offst();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			return alt_grp_seq();
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			return alt_itm_ratio();
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			return alt_alloc_prio();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($seq_no.equalsIgnoreCase(name)) {
			return seq_no();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($mfg_st_schd_dt.equalsIgnoreCase(name)) {
			return mfg_st_schd_dt();
		}
		if ($mfg_end_schd_dt.equalsIgnoreCase(name)) {
			return mfg_end_schd_dt();
		}
		if ($schd_in_dt.equalsIgnoreCase(name)) {
			return schd_in_dt();
		}
		if ($st_schd_tm.equalsIgnoreCase(name)) {
			return st_schd_tm();
		}
		if ($end_schd_tm.equalsIgnoreCase(name)) {
			return end_schd_tm();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($sno1_null_flg.equalsIgnoreCase(name)) {
			return sno1_null_flg();
		}
		if ($sno2_null_flg.equalsIgnoreCase(name)) {
			return sno2_null_flg();
		}
		if ($sno3_null_flg.equalsIgnoreCase(name)) {
			return sno3_null_flg();
		}
		if ($sno4_null_flg.equalsIgnoreCase(name)) {
			return sno4_null_flg();
		}
		if ($alt_itm_flg.equalsIgnoreCase(name)) {
			return alt_itm_flg();
		}
		if ($not_target_flg.equalsIgnoreCase(name)) {
			return not_target_flg();
		}
		if ($select_alt_flg.equalsIgnoreCase(name)) {
			return select_alt_flg();
		}
		if ($no_output_flg.equalsIgnoreCase(name)) {
			return no_output_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($prod_avlbl_sts.equalsIgnoreCase(name)) {
			prod_avlbl_sts(value);
			return;
		}
		if ($purc_itm_sts.equalsIgnoreCase(name)) {
			purc_itm_sts(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($itm_ord_typ.equalsIgnoreCase(name)) {
			itm_ord_typ(value);
			return;
		}
		if ($itm_ord_typ_nm.equalsIgnoreCase(name)) {
			itm_ord_typ_nm(value);
			return;
		}
		if ($itm_ord_sts_typ.equalsIgnoreCase(name)) {
			itm_ord_sts_typ(value);
			return;
		}
		if ($itm_ord_sts_typ_nm.equalsIgnoreCase(name)) {
			itm_ord_sts_typ_nm(value);
			return;
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			mfg_loc_nm(value);
			return;
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			strg_loc_cd(value);
			return;
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			strg_loc_nm(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($oper_ord_no.equalsIgnoreCase(name)) {
			oper_ord_no(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
			return;
		}
		if ($alloc_ctl_typ.equalsIgnoreCase(name)) {
			alloc_ctl_typ(value);
			return;
		}
		if ($alloc_ctl_typ_nm.equalsIgnoreCase(name)) {
			alloc_ctl_typ_nm(value);
			return;
		}
		if ($inpt_ctl_typ.equalsIgnoreCase(name)) {
			inpt_ctl_typ(value);
			return;
		}
		if ($inpt_ctl_typ_nm.equalsIgnoreCase(name)) {
			inpt_ctl_typ_nm(value);
			return;
		}
		if ($offst_typ.equalsIgnoreCase(name)) {
			offst_typ(value);
			return;
		}
		if ($offst_typ_nm.equalsIgnoreCase(name)) {
			offst_typ_nm(value);
			return;
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			prov_typ(value);
			return;
		}
		if ($prov_typ_nm.equalsIgnoreCase(name)) {
			prov_typ_nm(value);
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
		if ($rnd_typ.equalsIgnoreCase(name)) {
			rnd_typ(value);
			return;
		}
		if ($rnd_typ_nm.equalsIgnoreCase(name)) {
			rnd_typ_nm(value);
			return;
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			alt_grp_cd(value);
			return;
		}
		if ($alt_grp_nm.equalsIgnoreCase(name)) {
			alt_grp_nm(value);
			return;
		}
		if ($alt_itm_typ.equalsIgnoreCase(name)) {
			alt_itm_typ(value);
			return;
		}
		if ($alt_itm_typ_nm.equalsIgnoreCase(name)) {
			alt_itm_typ_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		if ($ord_qty.equalsIgnoreCase(name)) {
			ord_qty(value);
			return;
		}
		if ($need_qty.equalsIgnoreCase(name)) {
			need_qty(value);
			return;
		}
		if ($alloc_avlbl_qty.equalsIgnoreCase(name)) {
			alloc_avlbl_qty(value);
			return;
		}
		if ($alloc_qty.equalsIgnoreCase(name)) {
			alloc_qty(value);
			return;
		}
		if ($prod_avlbl_qty.equalsIgnoreCase(name)) {
			prod_avlbl_qty(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($not_oper_schd_qty.equalsIgnoreCase(name)) {
			not_oper_schd_qty(value);
			return;
		}
		if ($offst.equalsIgnoreCase(name)) {
			offst(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($seq_no.equalsIgnoreCase(name)) {
			seq_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		if ($ord_qty.equalsIgnoreCase(name)) {
			ord_qty(value);
			return;
		}
		if ($need_qty.equalsIgnoreCase(name)) {
			need_qty(value);
			return;
		}
		if ($alloc_avlbl_qty.equalsIgnoreCase(name)) {
			alloc_avlbl_qty(value);
			return;
		}
		if ($alloc_qty.equalsIgnoreCase(name)) {
			alloc_qty(value);
			return;
		}
		if ($prod_avlbl_qty.equalsIgnoreCase(name)) {
			prod_avlbl_qty(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($not_oper_schd_qty.equalsIgnoreCase(name)) {
			not_oper_schd_qty(value);
			return;
		}
		if ($offst.equalsIgnoreCase(name)) {
			offst(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($seq_no.equalsIgnoreCase(name)) {
			seq_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		if ($ord_qty.equalsIgnoreCase(name)) {
			ord_qty(value);
			return;
		}
		if ($need_qty.equalsIgnoreCase(name)) {
			need_qty(value);
			return;
		}
		if ($alloc_avlbl_qty.equalsIgnoreCase(name)) {
			alloc_avlbl_qty(value);
			return;
		}
		if ($alloc_qty.equalsIgnoreCase(name)) {
			alloc_qty(value);
			return;
		}
		if ($prod_avlbl_qty.equalsIgnoreCase(name)) {
			prod_avlbl_qty(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($not_oper_schd_qty.equalsIgnoreCase(name)) {
			not_oper_schd_qty(value);
			return;
		}
		if ($offst.equalsIgnoreCase(name)) {
			offst(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($seq_no.equalsIgnoreCase(name)) {
			seq_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		if ($ord_qty.equalsIgnoreCase(name)) {
			ord_qty(value);
			return;
		}
		if ($need_qty.equalsIgnoreCase(name)) {
			need_qty(value);
			return;
		}
		if ($alloc_avlbl_qty.equalsIgnoreCase(name)) {
			alloc_avlbl_qty(value);
			return;
		}
		if ($alloc_qty.equalsIgnoreCase(name)) {
			alloc_qty(value);
			return;
		}
		if ($prod_avlbl_qty.equalsIgnoreCase(name)) {
			prod_avlbl_qty(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($not_oper_schd_qty.equalsIgnoreCase(name)) {
			not_oper_schd_qty(value);
			return;
		}
		if ($offst.equalsIgnoreCase(name)) {
			offst(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($seq_no.equalsIgnoreCase(name)) {
			seq_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		if ($ord_qty.equalsIgnoreCase(name)) {
			ord_qty(value);
			return;
		}
		if ($need_qty.equalsIgnoreCase(name)) {
			need_qty(value);
			return;
		}
		if ($alloc_avlbl_qty.equalsIgnoreCase(name)) {
			alloc_avlbl_qty(value);
			return;
		}
		if ($alloc_qty.equalsIgnoreCase(name)) {
			alloc_qty(value);
			return;
		}
		if ($prod_avlbl_qty.equalsIgnoreCase(name)) {
			prod_avlbl_qty(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($not_oper_schd_qty.equalsIgnoreCase(name)) {
			not_oper_schd_qty(value);
			return;
		}
		if ($offst.equalsIgnoreCase(name)) {
			offst(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($seq_no.equalsIgnoreCase(name)) {
			seq_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($mfg_st_schd_dt.equalsIgnoreCase(name)) {
			mfg_st_schd_dt(value);
			return;
		}
		if ($mfg_end_schd_dt.equalsIgnoreCase(name)) {
			mfg_end_schd_dt(value);
			return;
		}
		if ($schd_in_dt.equalsIgnoreCase(name)) {
			schd_in_dt(value);
			return;
		}
		if ($st_schd_tm.equalsIgnoreCase(name)) {
			st_schd_tm(value);
			return;
		}
		if ($end_schd_tm.equalsIgnoreCase(name)) {
			end_schd_tm(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($sno1_null_flg.equalsIgnoreCase(name)) {
			sno1_null_flg(value);
			return;
		}
		if ($sno2_null_flg.equalsIgnoreCase(name)) {
			sno2_null_flg(value);
			return;
		}
		if ($sno3_null_flg.equalsIgnoreCase(name)) {
			sno3_null_flg(value);
			return;
		}
		if ($sno4_null_flg.equalsIgnoreCase(name)) {
			sno4_null_flg(value);
			return;
		}
		if ($alt_itm_flg.equalsIgnoreCase(name)) {
			alt_itm_flg(value);
			return;
		}
		if ($not_target_flg.equalsIgnoreCase(name)) {
			not_target_flg(value);
			return;
		}
		if ($select_alt_flg.equalsIgnoreCase(name)) {
			select_alt_flg(value);
			return;
		}
		if ($no_output_flg.equalsIgnoreCase(name)) {
			no_output_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($prod_avlbl_sts.equalsIgnoreCase(name)) {
			prod_avlbl_sts(value);
			return;
		}
		if ($purc_itm_sts.equalsIgnoreCase(name)) {
			purc_itm_sts(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($itm_ord_typ.equalsIgnoreCase(name)) {
			itm_ord_typ(value);
			return;
		}
		if ($itm_ord_typ_nm.equalsIgnoreCase(name)) {
			itm_ord_typ_nm(value);
			return;
		}
		if ($itm_ord_sts_typ.equalsIgnoreCase(name)) {
			itm_ord_sts_typ(value);
			return;
		}
		if ($itm_ord_sts_typ_nm.equalsIgnoreCase(name)) {
			itm_ord_sts_typ_nm(value);
			return;
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			mfg_loc_nm(value);
			return;
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			strg_loc_cd(value);
			return;
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			strg_loc_nm(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($oper_ord_no.equalsIgnoreCase(name)) {
			oper_ord_no(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
			return;
		}
		if ($alloc_ctl_typ.equalsIgnoreCase(name)) {
			alloc_ctl_typ(value);
			return;
		}
		if ($alloc_ctl_typ_nm.equalsIgnoreCase(name)) {
			alloc_ctl_typ_nm(value);
			return;
		}
		if ($inpt_ctl_typ.equalsIgnoreCase(name)) {
			inpt_ctl_typ(value);
			return;
		}
		if ($inpt_ctl_typ_nm.equalsIgnoreCase(name)) {
			inpt_ctl_typ_nm(value);
			return;
		}
		if ($offst_typ.equalsIgnoreCase(name)) {
			offst_typ(value);
			return;
		}
		if ($offst_typ_nm.equalsIgnoreCase(name)) {
			offst_typ_nm(value);
			return;
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			prov_typ(value);
			return;
		}
		if ($prov_typ_nm.equalsIgnoreCase(name)) {
			prov_typ_nm(value);
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
		if ($rnd_typ.equalsIgnoreCase(name)) {
			rnd_typ(value);
			return;
		}
		if ($rnd_typ_nm.equalsIgnoreCase(name)) {
			rnd_typ_nm(value);
			return;
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			alt_grp_cd(value);
			return;
		}
		if ($alt_grp_nm.equalsIgnoreCase(name)) {
			alt_grp_nm(value);
			return;
		}
		if ($alt_itm_typ.equalsIgnoreCase(name)) {
			alt_itm_typ(value);
			return;
		}
		if ($alt_itm_typ_nm.equalsIgnoreCase(name)) {
			alt_itm_typ_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		if ($ord_qty.equalsIgnoreCase(name)) {
			ord_qty(value);
			return;
		}
		if ($need_qty.equalsIgnoreCase(name)) {
			need_qty(value);
			return;
		}
		if ($alloc_avlbl_qty.equalsIgnoreCase(name)) {
			alloc_avlbl_qty(value);
			return;
		}
		if ($alloc_qty.equalsIgnoreCase(name)) {
			alloc_qty(value);
			return;
		}
		if ($prod_avlbl_qty.equalsIgnoreCase(name)) {
			prod_avlbl_qty(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($not_oper_schd_qty.equalsIgnoreCase(name)) {
			not_oper_schd_qty(value);
			return;
		}
		if ($offst.equalsIgnoreCase(name)) {
			offst(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($seq_no.equalsIgnoreCase(name)) {
			seq_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		if ($ord_qty.equalsIgnoreCase(name)) {
			ord_qty(value);
			return;
		}
		if ($need_qty.equalsIgnoreCase(name)) {
			need_qty(value);
			return;
		}
		if ($alloc_avlbl_qty.equalsIgnoreCase(name)) {
			alloc_avlbl_qty(value);
			return;
		}
		if ($alloc_qty.equalsIgnoreCase(name)) {
			alloc_qty(value);
			return;
		}
		if ($prod_avlbl_qty.equalsIgnoreCase(name)) {
			prod_avlbl_qty(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($not_oper_schd_qty.equalsIgnoreCase(name)) {
			not_oper_schd_qty(value);
			return;
		}
		if ($offst.equalsIgnoreCase(name)) {
			offst(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($seq_no.equalsIgnoreCase(name)) {
			seq_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		if ($ord_qty.equalsIgnoreCase(name)) {
			ord_qty(value);
			return;
		}
		if ($need_qty.equalsIgnoreCase(name)) {
			need_qty(value);
			return;
		}
		if ($alloc_avlbl_qty.equalsIgnoreCase(name)) {
			alloc_avlbl_qty(value);
			return;
		}
		if ($alloc_qty.equalsIgnoreCase(name)) {
			alloc_qty(value);
			return;
		}
		if ($prod_avlbl_qty.equalsIgnoreCase(name)) {
			prod_avlbl_qty(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($not_oper_schd_qty.equalsIgnoreCase(name)) {
			not_oper_schd_qty(value);
			return;
		}
		if ($offst.equalsIgnoreCase(name)) {
			offst(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($seq_no.equalsIgnoreCase(name)) {
			seq_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		if ($ord_qty.equalsIgnoreCase(name)) {
			ord_qty(value);
			return;
		}
		if ($need_qty.equalsIgnoreCase(name)) {
			need_qty(value);
			return;
		}
		if ($alloc_avlbl_qty.equalsIgnoreCase(name)) {
			alloc_avlbl_qty(value);
			return;
		}
		if ($alloc_qty.equalsIgnoreCase(name)) {
			alloc_qty(value);
			return;
		}
		if ($prod_avlbl_qty.equalsIgnoreCase(name)) {
			prod_avlbl_qty(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($not_oper_schd_qty.equalsIgnoreCase(name)) {
			not_oper_schd_qty(value);
			return;
		}
		if ($offst.equalsIgnoreCase(name)) {
			offst(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($seq_no.equalsIgnoreCase(name)) {
			seq_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		if ($ord_qty.equalsIgnoreCase(name)) {
			ord_qty(value);
			return;
		}
		if ($need_qty.equalsIgnoreCase(name)) {
			need_qty(value);
			return;
		}
		if ($alloc_avlbl_qty.equalsIgnoreCase(name)) {
			alloc_avlbl_qty(value);
			return;
		}
		if ($alloc_qty.equalsIgnoreCase(name)) {
			alloc_qty(value);
			return;
		}
		if ($prod_avlbl_qty.equalsIgnoreCase(name)) {
			prod_avlbl_qty(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($not_oper_schd_qty.equalsIgnoreCase(name)) {
			not_oper_schd_qty(value);
			return;
		}
		if ($offst.equalsIgnoreCase(name)) {
			offst(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($seq_no.equalsIgnoreCase(name)) {
			seq_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($mfg_st_schd_dt.equalsIgnoreCase(name)) {
			mfg_st_schd_dt(value);
			return;
		}
		if ($mfg_end_schd_dt.equalsIgnoreCase(name)) {
			mfg_end_schd_dt(value);
			return;
		}
		if ($schd_in_dt.equalsIgnoreCase(name)) {
			schd_in_dt(value);
			return;
		}
		if ($st_schd_tm.equalsIgnoreCase(name)) {
			st_schd_tm(value);
			return;
		}
		if ($end_schd_tm.equalsIgnoreCase(name)) {
			end_schd_tm(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($sno1_null_flg.equalsIgnoreCase(name)) {
			sno1_null_flg(value);
			return;
		}
		if ($sno2_null_flg.equalsIgnoreCase(name)) {
			sno2_null_flg(value);
			return;
		}
		if ($sno3_null_flg.equalsIgnoreCase(name)) {
			sno3_null_flg(value);
			return;
		}
		if ($sno4_null_flg.equalsIgnoreCase(name)) {
			sno4_null_flg(value);
			return;
		}
		if ($alt_itm_flg.equalsIgnoreCase(name)) {
			alt_itm_flg(value);
			return;
		}
		if ($not_target_flg.equalsIgnoreCase(name)) {
			not_target_flg(value);
			return;
		}
		if ($select_alt_flg.equalsIgnoreCase(name)) {
			select_alt_flg(value);
			return;
		}
		if ($no_output_flg.equalsIgnoreCase(name)) {
			no_output_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

