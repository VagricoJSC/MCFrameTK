package mcframe.serverMSBC.MSBCL5010;

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
 * ブロック"Ord_Imp01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Ord_Imp01_DtlR_MC_A extends MCConstRow {

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
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * MRP type ＭＲＰタイプ.<p>
	 *
	 */
	public static final String $mrp_typ = "mrp_typ";
	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public static final String $itm_ord_no = "itm_ord_no";
	/**
	 * Order type オーダ区分.<p>
	 *
	 */
	public static final String $itm_ord_typ = "itm_ord_typ";
	/**
	 * Order generation type オーダ生成区分.<p>
	 *
	 */
	public static final String $ord_gnrt_typ = "ord_gnrt_typ";
	/**
	 * Item cd. 品目ＣＤ.<p>
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
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public static final String $ver_no = "ver_no";
	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public static final String $strg_loc_cd = "strg_loc_cd";
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public static final String $mfg_loc_cd = "mfg_loc_cd";
	/**
	 * Supplier location cd. 発注先場所ＣＤ.<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public static final String $maker_cd = "maker_cd";
	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public static final String $rqst_loc_cd = "rqst_loc_cd";
	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $rqst_wg_cd = "rqst_wg_cd";
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public static final String $bom_ptn = "bom_ptn";
	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public static final String $oper_ptn = "oper_ptn";
	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public static final String $yield_schd_qty = "yield_schd_qty";
	/**
	 * Order scheduled qty. 指図予定数量.<p>
	 *
	 */
	public static final String $inst_qty = "inst_qty";
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public static final String $unit_cd = "unit_cd";
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
	 * Order status type オーダ状況区分.<p>
	 *
	 */
	public static final String $itm_ord_sts_typ = "itm_ord_sts_typ";
	/**
	 * Scheduled PO date 発注予定日.<p>
	 *
	 */
	public static final String $po_schd_dt = "po_schd_dt";
	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public static final String $purc_lt = "purc_lt";
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
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public static final String $mfg_lt = "mfg_lt";
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
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public static final String $xfr_lt = "xfr_lt";
	/**
	 * Scheduled acceptance date 検収予定日.<p>
	 *
	 */
	public static final String $accpt_schd_dt = "accpt_schd_dt";
	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public static final String $accpt_insp_lt = "accpt_insp_lt";
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
	 * Available date 使用可能予定日.<p>
	 *
	 */
	public static final String $avl_schd_dt = "avl_schd_dt";
	/**
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public static final String $master_dt = "master_dt";
	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public static final String $sno1 = "sno1";
	/**
	 * SEIBAN No. 1 type 手配ＮＯ１区分.<p>
	 *
	 */
	public static final String $sno_typ1 = "sno_typ1";
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public static final String $sno2 = "sno2";
	/**
	 * SEIBAN No. 2 type 手配ＮＯ２区分.<p>
	 *
	 */
	public static final String $sno_typ2 = "sno_typ2";
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public static final String $sno3 = "sno3";
	/**
	 * SEIBAN No. 3 type 手配ＮＯ３区分.<p>
	 *
	 */
	public static final String $sno_typ3 = "sno_typ3";
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public static final String $sno4 = "sno4";
	/**
	 * SEIBAN No. 4 type 手配ＮＯ４区分.<p>
	 *
	 */
	public static final String $sno_typ4 = "sno_typ4";
	/**
	 * Expired date 期限切れ日.<p>
	 *
	 */
	public static final String $lmt_dt = "lmt_dt";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * Disallow procurement 手配不許可.<p>
	 *
	 */
	public static final String $not_fix_flg = "not_fix_flg";
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
	 * Order/PO contact remarks 指図・発注連絡備考.<p>
	 *
	 */
	public static final String $inst_po_cnt_rmrks = "inst_po_cnt_rmrks";
	/**
	 * Simulation No. シミュレーションＮＯ.<p>
	 *
	 */
	public static final String $sim_mrp_no = "sim_mrp_no";
	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public static final String $io_schd_pr_no = "io_schd_pr_no";
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
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
	 * Item name 品名.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public static final String $unit_nm = "unit_nm";
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public static final String $cont_fctr_flg = "cont_fctr_flg";
	/**
	 * Active ingredient (Order scheduled qty.) 有効成分(指図予定数量).<p>
	 *
	 */
	public static final String $cont_fctr_inst_qty = "cont_fctr_inst_qty";
	/**
	 * Active ingredient (Output scheduled qty.) 有効成分(出来高予定数量).<p>
	 *
	 */
	public static final String $cont_fctr_schd_yield = "cont_fctr_schd_yield";
	/**
	 * Active ingredient unit cd. 有効成分単位ＣＤ.<p>
	 *
	 */
	public static final String $cont_fctr_unit_cd = "cont_fctr_unit_cd";
	/**
	 * Active ingredient unit name 有効成分単位名.<p>
	 *
	 */
	public static final String $cont_fctr_unit_nm = "cont_fctr_unit_nm";
	/**
	 * Standard coefficient 標準係数.<p>
	 *
	 */
	public static final String $std_cont_fctr = "std_cont_fctr";
	/**
	 * Storage factory/distribution warehouse cd. 格納先工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $strg_site_cd = "strg_site_cd";
	/**
	 * Storage factory/distribution warehouse name 格納先工場・物流倉庫名.<p>
	 *
	 */
	public static final String $strg_site_nm = "strg_site_nm";
	/**
	 * Storage location group cd. 格納場所グループＣＤ.<p>
	 *
	 */
	public static final String $strg_loc_grp_cd = "strg_loc_grp_cd";
	/**
	 * Storage location group name 格納場所グループ名.<p>
	 *
	 */
	public static final String $strg_loc_grp_nm = "strg_loc_grp_nm";
	/**
	 * Storage location distribution group cd. 格納場所物流グループＣＤ.<p>
	 *
	 */
	public static final String $strg_lg_grp_cd = "strg_lg_grp_cd";
	/**
	 * Storage location distribution group name 格納場所物流グループ名.<p>
	 *
	 */
	public static final String $strg_lg_grp_nm = "strg_lg_grp_nm";
	/**
	 * Storage location gross allocation location group cd. 格納場所総量引当場所グループＣＤ.<p>
	 *
	 */
	public static final String $strg_alloc_grp_cd = "strg_alloc_grp_cd";
	/**
	 * Storage location gross allocation location group name 格納場所総量引当場所グループ名.<p>
	 *
	 */
	public static final String $strg_alloc_grp_nm = "strg_alloc_grp_nm";
	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public static final String $strg_loc_nm = "strg_loc_nm";
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
	 * Supplier name 発注先名.<p>
	 *
	 */
	public static final String $sppl_nm = "sppl_nm";
	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public static final String $maker_nm = "maker_nm";
	/**
	 * Factory/Distribution warehouse cd. (Requested) 依頼先工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $rqst_site_cd = "rqst_site_cd";
	/**
	 * Factory/Distribution warehouse name (Requested) 依頼先工場・物流倉庫名.<p>
	 *
	 */
	public static final String $rqst_site_nm = "rqst_site_nm";
	/**
	 * Requested location group cd. 依頼先場所グループＣＤ.<p>
	 *
	 */
	public static final String $rqst_loc_grp_cd = "rqst_loc_grp_cd";
	/**
	 * Requested location group name 依頼先場所グループ名.<p>
	 *
	 */
	public static final String $rqst_loc_grp_nm = "rqst_loc_grp_nm";
	/**
	 * Location name (Requested) 依頼先場所名.<p>
	 *
	 */
	public static final String $rqst_loc_nm = "rqst_loc_nm";
	/**
	 * Requested WG name 依頼先ワーキンググループ名.<p>
	 *
	 */
	public static final String $rqst_wg_nm = "rqst_wg_nm";
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
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
	 * Item type 品目区分.<p>
	 *
	 */
	public static final String $itm_typ = "itm_typ";
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


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mrp_typ_META = createCommonMeta($mrp_typ, mcframe.commonMS.meta.MS_META.MRP_TYP);
	public static final MCMeta itm_ord_no_META = createCommonMeta($itm_ord_no, mcframe.commonMA.meta.MA_META.ITM_ORD_NO);
	public static final MCMeta itm_ord_typ_META = createCommonMeta($itm_ord_typ, mcframe.commonMS.meta.MS_META.ITM_ORD_TYP);
	public static final MCMeta ord_gnrt_typ_META = createCommonMeta($ord_gnrt_typ, mcframe.commonMS.meta.MS_META.ORD_GNRT_TYP);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta strg_loc_cd_META = createCommonMeta($strg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta maker_cd_META = createCommonMeta($maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta rqst_loc_cd_META = createCommonMeta($rqst_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta rqst_wg_cd_META = createCommonMeta($rqst_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta bom_ptn_META = createCommonMeta($bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta oper_ptn_META = createCommonMeta($oper_ptn, mcframe.commonMA.meta.MA_META.OPER_PTN);
	public static final MCMeta yield_schd_qty_META = createCommonMeta($yield_schd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta inst_qty_META = createCommonMeta($inst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta nmr_qty_META = createCommonMeta($nmr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta dnm_qty_META = createCommonMeta($dnm_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta fxd_yield_qty_META = createCommonMeta($fxd_yield_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta itm_ord_sts_typ_META = createCommonMeta($itm_ord_sts_typ, mcframe.commonMS.meta.MS_META.ITM_ORD_STS_TYP);
	public static final MCMeta po_schd_dt_META = createCommonMeta($po_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta purc_lt_META = createCommonMeta($purc_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta mfg_st_schd_dt_META = createCommonMeta($mfg_st_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mfg_end_schd_dt_META = createCommonMeta($mfg_end_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mfg_lt_META = createCommonMeta($mfg_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta gi_schd_dt_META = createCommonMeta($gi_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta strg_schd_dt_META = createCommonMeta($strg_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta xfr_lt_META = createCommonMeta($xfr_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta accpt_schd_dt_META = createCommonMeta($accpt_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta accpt_insp_lt_META = createCommonMeta($accpt_insp_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta insp_st_schd_dt_META = createCommonMeta($insp_st_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta insp_end_schd_dt_META = createCommonMeta($insp_end_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta insp_lt_META = createCommonMeta($insp_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta insp_offst_META = createCommonMeta($insp_offst, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta avl_schd_dt_META = createCommonMeta($avl_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta master_dt_META = createCommonMeta($master_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno_typ1_META = createCommonMeta($sno_typ1, mcframe.commonMA.meta.MA_META.SNO_TYP);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno_typ2_META = createCommonMeta($sno_typ2, mcframe.commonMA.meta.MA_META.SNO_TYP);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno_typ3_META = createCommonMeta($sno_typ3, mcframe.commonMA.meta.MA_META.SNO_TYP);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta sno_typ4_META = createCommonMeta($sno_typ4, mcframe.commonMA.meta.MA_META.SNO_TYP);
	public static final MCMeta lmt_dt_META = createCommonMeta($lmt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta not_fix_flg_META = createCommonMeta($not_fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ord_fix_pd_META = createCommonMeta($ord_fix_pd, mcframe.commonMA.meta.MA_META.ORD_FIX_PD);
	public static final MCMeta rqmt_no_META = createCommonMeta($rqmt_no, mcframe.commonMA.meta.MA_META.RQMT_NO);
	public static final MCMeta inst_po_cnt_rmrks_META = createCommonMeta($inst_po_cnt_rmrks, mcframe.commonMS.meta.MS_META.INST_PO_CNT_RMRKS);
	public static final MCMeta sim_mrp_no_META = createCommonMeta($sim_mrp_no, mcframe.commonMA.meta.MA_META.SIM_MRP_NO);
	public static final MCMeta io_schd_pr_no_META = createCommonMeta($io_schd_pr_no, mcframe.commonMA.meta.MA_META.IO_SCHD_PR_NO);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.IORD_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.IORD_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.IORD_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.IORD_SUB_CHAR3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta unit_nm_META = createCommonMeta($unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta cont_fctr_flg_META = createCommonMeta($cont_fctr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cont_fctr_inst_qty_META = createCommonMeta($cont_fctr_inst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta cont_fctr_schd_yield_META = createCommonMeta($cont_fctr_schd_yield, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta cont_fctr_unit_cd_META = createCommonMeta($cont_fctr_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta cont_fctr_unit_nm_META = createCommonMeta($cont_fctr_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta std_cont_fctr_META = createCommonMeta($std_cont_fctr, mcframe.commonMA.meta.MA_META.STD_CONT_FCTR);
	public static final MCMeta strg_site_cd_META = createCommonMeta($strg_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta strg_site_nm_META = createCommonMeta($strg_site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta strg_loc_grp_cd_META = createCommonMeta($strg_loc_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta strg_loc_grp_nm_META = createCommonMeta($strg_loc_grp_nm, mcframe.commonMA.meta.MA_META.LOC_GRP_NM);
	public static final MCMeta strg_lg_grp_cd_META = createCommonMeta($strg_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta strg_lg_grp_nm_META = createCommonMeta($strg_lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta strg_alloc_grp_cd_META = createCommonMeta($strg_alloc_grp_cd, mcframe.commonMA.meta.MA_META.ALLOC_GRP_CD);
	public static final MCMeta strg_alloc_grp_nm_META = createCommonMeta($strg_alloc_grp_nm, mcframe.commonMA.meta.MA_META.ALLOC_GRP_NM);
	public static final MCMeta strg_loc_nm_META = createCommonMeta($strg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta mfg_site_cd_META = createCommonMeta($mfg_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta mfg_site_nm_META = createCommonMeta($mfg_site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta mfg_loc_grp_cd_META = createCommonMeta($mfg_loc_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta mfg_loc_grp_nm_META = createCommonMeta($mfg_loc_grp_nm, mcframe.commonMA.meta.MA_META.LOC_GRP_NM);
	public static final MCMeta mfg_loc_nm_META = createCommonMeta($mfg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta maker_nm_META = createCommonMeta($maker_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta rqst_site_cd_META = createCommonMeta($rqst_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta rqst_site_nm_META = createCommonMeta($rqst_site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta rqst_loc_grp_cd_META = createCommonMeta($rqst_loc_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta rqst_loc_grp_nm_META = createCommonMeta($rqst_loc_grp_nm, mcframe.commonMA.meta.MA_META.LOC_GRP_NM);
	public static final MCMeta rqst_loc_nm_META = createCommonMeta($rqst_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta rqst_wg_nm_META = createCommonMeta($rqst_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);

	protected static final ConstMetaList<Ord_Imp01_DtlR> constMetas = new ConstMetaList<Ord_Imp01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			data_crud_typ_META,
			err_flg_META,
			mrp_typ_META,
			itm_ord_no_META,
			itm_ord_typ_META,
			ord_gnrt_typ_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			ver_no_META,
			strg_loc_cd_META,
			mfg_loc_cd_META,
			sppl_cd_META,
			maker_cd_META,
			rqst_loc_cd_META,
			rqst_wg_cd_META,
			bom_ptn_META,
			oper_ptn_META,
			yield_schd_qty_META,
			inst_qty_META,
			unit_cd_META,
			nmr_qty_META,
			dnm_qty_META,
			fxd_yield_qty_META,
			itm_ord_sts_typ_META,
			po_schd_dt_META,
			purc_lt_META,
			mfg_st_schd_dt_META,
			mfg_end_schd_dt_META,
			mfg_lt_META,
			gi_schd_dt_META,
			strg_schd_dt_META,
			xfr_lt_META,
			accpt_schd_dt_META,
			accpt_insp_lt_META,
			insp_st_schd_dt_META,
			insp_end_schd_dt_META,
			insp_lt_META,
			insp_offst_META,
			avl_schd_dt_META,
			master_dt_META,
			sno1_META,
			sno_typ1_META,
			sno2_META,
			sno_typ2_META,
			sno3_META,
			sno_typ3_META,
			sno4_META,
			sno_typ4_META,
			lmt_dt_META,
			wg_cd_META,
			not_fix_flg_META,
			ord_fix_pd_META,
			rqmt_no_META,
			inst_po_cnt_rmrks_META,
			sim_mrp_no_META,
			io_schd_pr_no_META,
			intr_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			itm_nm_META,
			unit_nm_META,
			cont_fctr_flg_META,
			cont_fctr_inst_qty_META,
			cont_fctr_schd_yield_META,
			cont_fctr_unit_cd_META,
			cont_fctr_unit_nm_META,
			std_cont_fctr_META,
			strg_site_cd_META,
			strg_site_nm_META,
			strg_loc_grp_cd_META,
			strg_loc_grp_nm_META,
			strg_lg_grp_cd_META,
			strg_lg_grp_nm_META,
			strg_alloc_grp_cd_META,
			strg_alloc_grp_nm_META,
			strg_loc_nm_META,
			mfg_site_cd_META,
			mfg_site_nm_META,
			mfg_loc_grp_cd_META,
			mfg_loc_grp_nm_META,
			mfg_loc_nm_META,
			sppl_nm_META,
			maker_nm_META,
			rqst_site_cd_META,
			rqst_site_nm_META,
			rqst_loc_grp_cd_META,
			rqst_loc_grp_nm_META,
			rqst_loc_nm_META,
			rqst_wg_nm_META,
			wg_nm_META,
			wrk_no_META,
			wrk_nm_META,
			itm_typ_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META
		},
		new String[][]{
			{
			},
			{
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
	protected Ord_Imp01_DtlR_MC_A(ConstMetaList<? extends Ord_Imp01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Ord_Imp01_DtlR clone() {
		return (Ord_Imp01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Ord_Imp01_DtlR createInstance() {
		return (Ord_Imp01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Ord_Imp01_DtlR getValues(String... names) {
		return (Ord_Imp01_DtlR) super.getValues(names);
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
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 2, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 2, $err_flg, value);
	}


	/**
	 * MRP type ＭＲＰタイプ.<p>
	 *
	 */
	public String mrp_typ() {
		return getConstString(offset + 3, $mrp_typ);
	}

	/**
	 * MRP type ＭＲＰタイプ.<p>
	 *
	 */
	public void mrp_typ(String value) {
		setConstString(offset + 3, $mrp_typ, value);
	}


	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public String itm_ord_no() {
		return getConstString(offset + 4, $itm_ord_no);
	}

	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public void itm_ord_no(String value) {
		setConstString(offset + 4, $itm_ord_no, value);
	}


	/**
	 * Order type オーダ区分.<p>
	 *
	 */
	public String itm_ord_typ() {
		return getConstString(offset + 5, $itm_ord_typ);
	}

	/**
	 * Order type オーダ区分.<p>
	 *
	 */
	public void itm_ord_typ(String value) {
		setConstString(offset + 5, $itm_ord_typ, value);
	}


	/**
	 * Order generation type オーダ生成区分.<p>
	 *
	 */
	public String ord_gnrt_typ() {
		return getConstString(offset + 6, $ord_gnrt_typ);
	}

	/**
	 * Order generation type オーダ生成区分.<p>
	 *
	 */
	public void ord_gnrt_typ(String value) {
		setConstString(offset + 6, $ord_gnrt_typ, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 7, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 7, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 8, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 8, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 9, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 9, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 10, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 10, $itm_sub3, value);
	}


	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 11, $ver_no);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 11, $ver_no, value);
	}


	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public String strg_loc_cd() {
		return getConstString(offset + 12, $strg_loc_cd);
	}

	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public void strg_loc_cd(String value) {
		setConstString(offset + 12, $strg_loc_cd, value);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 13, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 13, $mfg_loc_cd, value);
	}


	/**
	 * Supplier location cd. 発注先場所ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 14, $sppl_cd);
	}

	/**
	 * Supplier location cd. 発注先場所ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 14, $sppl_cd, value);
	}


	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 15, $maker_cd);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 15, $maker_cd, value);
	}


	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public String rqst_loc_cd() {
		return getConstString(offset + 16, $rqst_loc_cd);
	}

	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public void rqst_loc_cd(String value) {
		setConstString(offset + 16, $rqst_loc_cd, value);
	}


	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public String rqst_wg_cd() {
		return getConstString(offset + 17, $rqst_wg_cd);
	}

	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public void rqst_wg_cd(String value) {
		setConstString(offset + 17, $rqst_wg_cd, value);
	}


	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return getConstString(offset + 18, $bom_ptn);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		setConstString(offset + 18, $bom_ptn, value);
	}


	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public String oper_ptn() {
		return getConstString(offset + 19, $oper_ptn);
	}

	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public void oper_ptn(String value) {
		setConstString(offset + 19, $oper_ptn, value);
	}


	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public MCNumber yield_schd_qty() {
		return getConstNumber(offset + 20, $yield_schd_qty);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void yield_schd_qty(MCNumber value) {
		setConstNumber(offset + 20, $yield_schd_qty, value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void yield_schd_qty(int value) {
		setConstNumber(offset + 20, $yield_schd_qty, value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void yield_schd_qty(long value) {
		setConstNumber(offset + 20, $yield_schd_qty, value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void yield_schd_qty(float value) {
		setConstNumber(offset + 20, $yield_schd_qty, value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void yield_schd_qty(double value) {
		setConstNumber(offset + 20, $yield_schd_qty, value);
	}


	/**
	 * Order scheduled qty. 指図予定数量.<p>
	 *
	 */
	public MCNumber inst_qty() {
		return getConstNumber(offset + 21, $inst_qty);
	}

	/**
	 * Order scheduled qty. 指図予定数量.<p>
	 *
	 */
	public void inst_qty(MCNumber value) {
		setConstNumber(offset + 21, $inst_qty, value);
	}

	/**
	 * Order scheduled qty. 指図予定数量.<p>
	 *
	 */
	public void inst_qty(int value) {
		setConstNumber(offset + 21, $inst_qty, value);
	}

	/**
	 * Order scheduled qty. 指図予定数量.<p>
	 *
	 */
	public void inst_qty(long value) {
		setConstNumber(offset + 21, $inst_qty, value);
	}

	/**
	 * Order scheduled qty. 指図予定数量.<p>
	 *
	 */
	public void inst_qty(float value) {
		setConstNumber(offset + 21, $inst_qty, value);
	}

	/**
	 * Order scheduled qty. 指図予定数量.<p>
	 *
	 */
	public void inst_qty(double value) {
		setConstNumber(offset + 21, $inst_qty, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 22, $unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 22, $unit_cd, value);
	}


	/**
	 * Yield numerator 歩留分子.<p>
	 *
	 */
	public MCNumber nmr_qty() {
		return getConstNumber(offset + 23, $nmr_qty);
	}

	/**
	 * Yield numerator 歩留分子.<p>
	 *
	 */
	public void nmr_qty(MCNumber value) {
		setConstNumber(offset + 23, $nmr_qty, value);
	}

	/**
	 * Yield numerator 歩留分子.<p>
	 *
	 */
	public void nmr_qty(int value) {
		setConstNumber(offset + 23, $nmr_qty, value);
	}

	/**
	 * Yield numerator 歩留分子.<p>
	 *
	 */
	public void nmr_qty(long value) {
		setConstNumber(offset + 23, $nmr_qty, value);
	}

	/**
	 * Yield numerator 歩留分子.<p>
	 *
	 */
	public void nmr_qty(float value) {
		setConstNumber(offset + 23, $nmr_qty, value);
	}

	/**
	 * Yield numerator 歩留分子.<p>
	 *
	 */
	public void nmr_qty(double value) {
		setConstNumber(offset + 23, $nmr_qty, value);
	}


	/**
	 * Yield denominator 歩留分母.<p>
	 *
	 */
	public MCNumber dnm_qty() {
		return getConstNumber(offset + 24, $dnm_qty);
	}

	/**
	 * Yield denominator 歩留分母.<p>
	 *
	 */
	public void dnm_qty(MCNumber value) {
		setConstNumber(offset + 24, $dnm_qty, value);
	}

	/**
	 * Yield denominator 歩留分母.<p>
	 *
	 */
	public void dnm_qty(int value) {
		setConstNumber(offset + 24, $dnm_qty, value);
	}

	/**
	 * Yield denominator 歩留分母.<p>
	 *
	 */
	public void dnm_qty(long value) {
		setConstNumber(offset + 24, $dnm_qty, value);
	}

	/**
	 * Yield denominator 歩留分母.<p>
	 *
	 */
	public void dnm_qty(float value) {
		setConstNumber(offset + 24, $dnm_qty, value);
	}

	/**
	 * Yield denominator 歩留分母.<p>
	 *
	 */
	public void dnm_qty(double value) {
		setConstNumber(offset + 24, $dnm_qty, value);
	}


	/**
	 * Constant yield qty. 固定歩留数量.<p>
	 *
	 */
	public MCNumber fxd_yield_qty() {
		return getConstNumber(offset + 25, $fxd_yield_qty);
	}

	/**
	 * Constant yield qty. 固定歩留数量.<p>
	 *
	 */
	public void fxd_yield_qty(MCNumber value) {
		setConstNumber(offset + 25, $fxd_yield_qty, value);
	}

	/**
	 * Constant yield qty. 固定歩留数量.<p>
	 *
	 */
	public void fxd_yield_qty(int value) {
		setConstNumber(offset + 25, $fxd_yield_qty, value);
	}

	/**
	 * Constant yield qty. 固定歩留数量.<p>
	 *
	 */
	public void fxd_yield_qty(long value) {
		setConstNumber(offset + 25, $fxd_yield_qty, value);
	}

	/**
	 * Constant yield qty. 固定歩留数量.<p>
	 *
	 */
	public void fxd_yield_qty(float value) {
		setConstNumber(offset + 25, $fxd_yield_qty, value);
	}

	/**
	 * Constant yield qty. 固定歩留数量.<p>
	 *
	 */
	public void fxd_yield_qty(double value) {
		setConstNumber(offset + 25, $fxd_yield_qty, value);
	}


	/**
	 * Order status type オーダ状況区分.<p>
	 *
	 */
	public String itm_ord_sts_typ() {
		return getConstString(offset + 26, $itm_ord_sts_typ);
	}

	/**
	 * Order status type オーダ状況区分.<p>
	 *
	 */
	public void itm_ord_sts_typ(String value) {
		setConstString(offset + 26, $itm_ord_sts_typ, value);
	}


	/**
	 * Scheduled PO date 発注予定日.<p>
	 *
	 */
	public MCDate po_schd_dt() {
		return getConstDate(offset + 27, $po_schd_dt);
	}

	/**
	 * Scheduled PO date 発注予定日.<p>
	 *
	 */
	public void po_schd_dt(MCDate value) {
		setConstDate(offset + 27, $po_schd_dt, value);
	}


	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public MCNumber purc_lt() {
		return getConstNumber(offset + 28, $purc_lt);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(MCNumber value) {
		setConstNumber(offset + 28, $purc_lt, value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(int value) {
		setConstNumber(offset + 28, $purc_lt, value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(long value) {
		setConstNumber(offset + 28, $purc_lt, value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(float value) {
		setConstNumber(offset + 28, $purc_lt, value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(double value) {
		setConstNumber(offset + 28, $purc_lt, value);
	}


	/**
	 * Scheduled mfg. start date 製造着手予定日.<p>
	 *
	 */
	public MCDate mfg_st_schd_dt() {
		return getConstDate(offset + 29, $mfg_st_schd_dt);
	}

	/**
	 * Scheduled mfg. start date 製造着手予定日.<p>
	 *
	 */
	public void mfg_st_schd_dt(MCDate value) {
		setConstDate(offset + 29, $mfg_st_schd_dt, value);
	}


	/**
	 * Scheduled mfg. end date 製造終了予定日.<p>
	 *
	 */
	public MCDate mfg_end_schd_dt() {
		return getConstDate(offset + 30, $mfg_end_schd_dt);
	}

	/**
	 * Scheduled mfg. end date 製造終了予定日.<p>
	 *
	 */
	public void mfg_end_schd_dt(MCDate value) {
		setConstDate(offset + 30, $mfg_end_schd_dt, value);
	}


	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public MCNumber mfg_lt() {
		return getConstNumber(offset + 31, $mfg_lt);
	}

	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public void mfg_lt(MCNumber value) {
		setConstNumber(offset + 31, $mfg_lt, value);
	}

	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public void mfg_lt(int value) {
		setConstNumber(offset + 31, $mfg_lt, value);
	}

	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public void mfg_lt(long value) {
		setConstNumber(offset + 31, $mfg_lt, value);
	}

	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public void mfg_lt(float value) {
		setConstNumber(offset + 31, $mfg_lt, value);
	}

	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public void mfg_lt(double value) {
		setConstNumber(offset + 31, $mfg_lt, value);
	}


	/**
	 * Scheduled GI date 出庫予定日.<p>
	 *
	 */
	public MCDate gi_schd_dt() {
		return getConstDate(offset + 32, $gi_schd_dt);
	}

	/**
	 * Scheduled GI date 出庫予定日.<p>
	 *
	 */
	public void gi_schd_dt(MCDate value) {
		setConstDate(offset + 32, $gi_schd_dt, value);
	}


	/**
	 * Scheduled storage completion date 格納完了予定日.<p>
	 *
	 */
	public MCDate strg_schd_dt() {
		return getConstDate(offset + 33, $strg_schd_dt);
	}

	/**
	 * Scheduled storage completion date 格納完了予定日.<p>
	 *
	 */
	public void strg_schd_dt(MCDate value) {
		setConstDate(offset + 33, $strg_schd_dt, value);
	}


	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public MCNumber xfr_lt() {
		return getConstNumber(offset + 34, $xfr_lt);
	}

	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(MCNumber value) {
		setConstNumber(offset + 34, $xfr_lt, value);
	}

	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(int value) {
		setConstNumber(offset + 34, $xfr_lt, value);
	}

	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(long value) {
		setConstNumber(offset + 34, $xfr_lt, value);
	}

	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(float value) {
		setConstNumber(offset + 34, $xfr_lt, value);
	}

	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(double value) {
		setConstNumber(offset + 34, $xfr_lt, value);
	}


	/**
	 * Scheduled acceptance date 検収予定日.<p>
	 *
	 */
	public MCDate accpt_schd_dt() {
		return getConstDate(offset + 35, $accpt_schd_dt);
	}

	/**
	 * Scheduled acceptance date 検収予定日.<p>
	 *
	 */
	public void accpt_schd_dt(MCDate value) {
		setConstDate(offset + 35, $accpt_schd_dt, value);
	}


	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public MCNumber accpt_insp_lt() {
		return getConstNumber(offset + 36, $accpt_insp_lt);
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(MCNumber value) {
		setConstNumber(offset + 36, $accpt_insp_lt, value);
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(int value) {
		setConstNumber(offset + 36, $accpt_insp_lt, value);
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(long value) {
		setConstNumber(offset + 36, $accpt_insp_lt, value);
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(float value) {
		setConstNumber(offset + 36, $accpt_insp_lt, value);
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(double value) {
		setConstNumber(offset + 36, $accpt_insp_lt, value);
	}


	/**
	 * Scheduled inspection start date 検査着手予定日.<p>
	 *
	 */
	public MCDate insp_st_schd_dt() {
		return getConstDate(offset + 37, $insp_st_schd_dt);
	}

	/**
	 * Scheduled inspection start date 検査着手予定日.<p>
	 *
	 */
	public void insp_st_schd_dt(MCDate value) {
		setConstDate(offset + 37, $insp_st_schd_dt, value);
	}


	/**
	 * Scheduled inspection end date 検査終了予定日.<p>
	 *
	 */
	public MCDate insp_end_schd_dt() {
		return getConstDate(offset + 38, $insp_end_schd_dt);
	}

	/**
	 * Scheduled inspection end date 検査終了予定日.<p>
	 *
	 */
	public void insp_end_schd_dt(MCDate value) {
		setConstDate(offset + 38, $insp_end_schd_dt, value);
	}


	/**
	 * Inspection LT 検査ＬＴ.<p>
	 *
	 */
	public MCNumber insp_lt() {
		return getConstNumber(offset + 39, $insp_lt);
	}

	/**
	 * Inspection LT 検査ＬＴ.<p>
	 *
	 */
	public void insp_lt(MCNumber value) {
		setConstNumber(offset + 39, $insp_lt, value);
	}

	/**
	 * Inspection LT 検査ＬＴ.<p>
	 *
	 */
	public void insp_lt(int value) {
		setConstNumber(offset + 39, $insp_lt, value);
	}

	/**
	 * Inspection LT 検査ＬＴ.<p>
	 *
	 */
	public void insp_lt(long value) {
		setConstNumber(offset + 39, $insp_lt, value);
	}

	/**
	 * Inspection LT 検査ＬＴ.<p>
	 *
	 */
	public void insp_lt(float value) {
		setConstNumber(offset + 39, $insp_lt, value);
	}

	/**
	 * Inspection LT 検査ＬＴ.<p>
	 *
	 */
	public void insp_lt(double value) {
		setConstNumber(offset + 39, $insp_lt, value);
	}


	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public MCNumber insp_offst() {
		return getConstNumber(offset + 40, $insp_offst);
	}

	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public void insp_offst(MCNumber value) {
		setConstNumber(offset + 40, $insp_offst, value);
	}

	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public void insp_offst(int value) {
		setConstNumber(offset + 40, $insp_offst, value);
	}

	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public void insp_offst(long value) {
		setConstNumber(offset + 40, $insp_offst, value);
	}

	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public void insp_offst(float value) {
		setConstNumber(offset + 40, $insp_offst, value);
	}

	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public void insp_offst(double value) {
		setConstNumber(offset + 40, $insp_offst, value);
	}


	/**
	 * Available date 使用可能予定日.<p>
	 *
	 */
	public MCDate avl_schd_dt() {
		return getConstDate(offset + 41, $avl_schd_dt);
	}

	/**
	 * Available date 使用可能予定日.<p>
	 *
	 */
	public void avl_schd_dt(MCDate value) {
		setConstDate(offset + 41, $avl_schd_dt, value);
	}


	/**
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public MCDate master_dt() {
		return getConstDate(offset + 42, $master_dt);
	}

	/**
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public void master_dt(MCDate value) {
		setConstDate(offset + 42, $master_dt, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 43, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 43, $sno1, value);
	}


	/**
	 * SEIBAN No. 1 type 手配ＮＯ１区分.<p>
	 *
	 */
	public String sno_typ1() {
		return getConstString(offset + 44, $sno_typ1);
	}

	/**
	 * SEIBAN No. 1 type 手配ＮＯ１区分.<p>
	 *
	 */
	public void sno_typ1(String value) {
		setConstString(offset + 44, $sno_typ1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 45, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 45, $sno2, value);
	}


	/**
	 * SEIBAN No. 2 type 手配ＮＯ２区分.<p>
	 *
	 */
	public String sno_typ2() {
		return getConstString(offset + 46, $sno_typ2);
	}

	/**
	 * SEIBAN No. 2 type 手配ＮＯ２区分.<p>
	 *
	 */
	public void sno_typ2(String value) {
		setConstString(offset + 46, $sno_typ2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 47, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 47, $sno3, value);
	}


	/**
	 * SEIBAN No. 3 type 手配ＮＯ３区分.<p>
	 *
	 */
	public String sno_typ3() {
		return getConstString(offset + 48, $sno_typ3);
	}

	/**
	 * SEIBAN No. 3 type 手配ＮＯ３区分.<p>
	 *
	 */
	public void sno_typ3(String value) {
		setConstString(offset + 48, $sno_typ3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 49, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 49, $sno4, value);
	}


	/**
	 * SEIBAN No. 4 type 手配ＮＯ４区分.<p>
	 *
	 */
	public String sno_typ4() {
		return getConstString(offset + 50, $sno_typ4);
	}

	/**
	 * SEIBAN No. 4 type 手配ＮＯ４区分.<p>
	 *
	 */
	public void sno_typ4(String value) {
		setConstString(offset + 50, $sno_typ4, value);
	}


	/**
	 * Expired date 期限切れ日.<p>
	 *
	 */
	public MCDate lmt_dt() {
		return getConstDate(offset + 51, $lmt_dt);
	}

	/**
	 * Expired date 期限切れ日.<p>
	 *
	 */
	public void lmt_dt(MCDate value) {
		setConstDate(offset + 51, $lmt_dt, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 52, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 52, $wg_cd, value);
	}


	/**
	 * Disallow procurement 手配不許可.<p>
	 *
	 */
	public boolean not_fix_flg() {
		return getConstBoolean(offset + 53, $not_fix_flg);
	}

	/**
	 * Disallow procurement 手配不許可.<p>
	 *
	 */
	public void not_fix_flg(boolean value) {
		setConstBoolean(offset + 53, $not_fix_flg, value);
	}


	/**
	 * Order auto-firming period (Date) オーダ自動確定期間（日）.<p>
	 *
	 */
	public MCNumber ord_fix_pd() {
		return getConstNumber(offset + 54, $ord_fix_pd);
	}

	/**
	 * Order auto-firming period (Date) オーダ自動確定期間（日）.<p>
	 *
	 */
	public void ord_fix_pd(MCNumber value) {
		setConstNumber(offset + 54, $ord_fix_pd, value);
	}

	/**
	 * Order auto-firming period (Date) オーダ自動確定期間（日）.<p>
	 *
	 */
	public void ord_fix_pd(int value) {
		setConstNumber(offset + 54, $ord_fix_pd, value);
	}

	/**
	 * Order auto-firming period (Date) オーダ自動確定期間（日）.<p>
	 *
	 */
	public void ord_fix_pd(long value) {
		setConstNumber(offset + 54, $ord_fix_pd, value);
	}

	/**
	 * Order auto-firming period (Date) オーダ自動確定期間（日）.<p>
	 *
	 */
	public void ord_fix_pd(float value) {
		setConstNumber(offset + 54, $ord_fix_pd, value);
	}

	/**
	 * Order auto-firming period (Date) オーダ自動確定期間（日）.<p>
	 *
	 */
	public void ord_fix_pd(double value) {
		setConstNumber(offset + 54, $ord_fix_pd, value);
	}


	/**
	 * Requirements No. 所要ＮＯ.<p>
	 *
	 */
	public String rqmt_no() {
		return getConstString(offset + 55, $rqmt_no);
	}

	/**
	 * Requirements No. 所要ＮＯ.<p>
	 *
	 */
	public void rqmt_no(String value) {
		setConstString(offset + 55, $rqmt_no, value);
	}


	/**
	 * Order/PO contact remarks 指図・発注連絡備考.<p>
	 *
	 */
	public String inst_po_cnt_rmrks() {
		return getConstString(offset + 56, $inst_po_cnt_rmrks);
	}

	/**
	 * Order/PO contact remarks 指図・発注連絡備考.<p>
	 *
	 */
	public void inst_po_cnt_rmrks(String value) {
		setConstString(offset + 56, $inst_po_cnt_rmrks, value);
	}


	/**
	 * Simulation No. シミュレーションＮＯ.<p>
	 *
	 */
	public String sim_mrp_no() {
		return getConstString(offset + 57, $sim_mrp_no);
	}

	/**
	 * Simulation No. シミュレーションＮＯ.<p>
	 *
	 */
	public void sim_mrp_no(String value) {
		setConstString(offset + 57, $sim_mrp_no, value);
	}


	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public String io_schd_pr_no() {
		return getConstString(offset + 58, $io_schd_pr_no);
	}

	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public void io_schd_pr_no(String value) {
		setConstString(offset + 58, $io_schd_pr_no, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 59, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 59, $intr_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 60, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 60, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 61, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 61, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 62, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 62, $sub_char3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 63, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 63, $itm_nm, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String unit_nm() {
		return getConstString(offset + 64, $unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void unit_nm(String value) {
		setConstString(offset + 64, $unit_nm, value);
	}


	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public boolean cont_fctr_flg() {
		return getConstBoolean(offset + 65, $cont_fctr_flg);
	}

	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public void cont_fctr_flg(boolean value) {
		setConstBoolean(offset + 65, $cont_fctr_flg, value);
	}


	/**
	 * Active ingredient (Order scheduled qty.) 有効成分(指図予定数量).<p>
	 *
	 */
	public MCNumber cont_fctr_inst_qty() {
		return getConstNumber(offset + 66, $cont_fctr_inst_qty);
	}

	/**
	 * Active ingredient (Order scheduled qty.) 有効成分(指図予定数量).<p>
	 *
	 */
	public void cont_fctr_inst_qty(MCNumber value) {
		setConstNumber(offset + 66, $cont_fctr_inst_qty, value);
	}

	/**
	 * Active ingredient (Order scheduled qty.) 有効成分(指図予定数量).<p>
	 *
	 */
	public void cont_fctr_inst_qty(int value) {
		setConstNumber(offset + 66, $cont_fctr_inst_qty, value);
	}

	/**
	 * Active ingredient (Order scheduled qty.) 有効成分(指図予定数量).<p>
	 *
	 */
	public void cont_fctr_inst_qty(long value) {
		setConstNumber(offset + 66, $cont_fctr_inst_qty, value);
	}

	/**
	 * Active ingredient (Order scheduled qty.) 有効成分(指図予定数量).<p>
	 *
	 */
	public void cont_fctr_inst_qty(float value) {
		setConstNumber(offset + 66, $cont_fctr_inst_qty, value);
	}

	/**
	 * Active ingredient (Order scheduled qty.) 有効成分(指図予定数量).<p>
	 *
	 */
	public void cont_fctr_inst_qty(double value) {
		setConstNumber(offset + 66, $cont_fctr_inst_qty, value);
	}


	/**
	 * Active ingredient (Output scheduled qty.) 有効成分(出来高予定数量).<p>
	 *
	 */
	public MCNumber cont_fctr_schd_yield() {
		return getConstNumber(offset + 67, $cont_fctr_schd_yield);
	}

	/**
	 * Active ingredient (Output scheduled qty.) 有効成分(出来高予定数量).<p>
	 *
	 */
	public void cont_fctr_schd_yield(MCNumber value) {
		setConstNumber(offset + 67, $cont_fctr_schd_yield, value);
	}

	/**
	 * Active ingredient (Output scheduled qty.) 有効成分(出来高予定数量).<p>
	 *
	 */
	public void cont_fctr_schd_yield(int value) {
		setConstNumber(offset + 67, $cont_fctr_schd_yield, value);
	}

	/**
	 * Active ingredient (Output scheduled qty.) 有効成分(出来高予定数量).<p>
	 *
	 */
	public void cont_fctr_schd_yield(long value) {
		setConstNumber(offset + 67, $cont_fctr_schd_yield, value);
	}

	/**
	 * Active ingredient (Output scheduled qty.) 有効成分(出来高予定数量).<p>
	 *
	 */
	public void cont_fctr_schd_yield(float value) {
		setConstNumber(offset + 67, $cont_fctr_schd_yield, value);
	}

	/**
	 * Active ingredient (Output scheduled qty.) 有効成分(出来高予定数量).<p>
	 *
	 */
	public void cont_fctr_schd_yield(double value) {
		setConstNumber(offset + 67, $cont_fctr_schd_yield, value);
	}


	/**
	 * Active ingredient unit cd. 有効成分単位ＣＤ.<p>
	 *
	 */
	public String cont_fctr_unit_cd() {
		return getConstString(offset + 68, $cont_fctr_unit_cd);
	}

	/**
	 * Active ingredient unit cd. 有効成分単位ＣＤ.<p>
	 *
	 */
	public void cont_fctr_unit_cd(String value) {
		setConstString(offset + 68, $cont_fctr_unit_cd, value);
	}


	/**
	 * Active ingredient unit name 有効成分単位名.<p>
	 *
	 */
	public String cont_fctr_unit_nm() {
		return getConstString(offset + 69, $cont_fctr_unit_nm);
	}

	/**
	 * Active ingredient unit name 有効成分単位名.<p>
	 *
	 */
	public void cont_fctr_unit_nm(String value) {
		setConstString(offset + 69, $cont_fctr_unit_nm, value);
	}


	/**
	 * Standard coefficient 標準係数.<p>
	 *
	 */
	public MCNumber std_cont_fctr() {
		return getConstNumber(offset + 70, $std_cont_fctr);
	}

	/**
	 * Standard coefficient 標準係数.<p>
	 *
	 */
	public void std_cont_fctr(MCNumber value) {
		setConstNumber(offset + 70, $std_cont_fctr, value);
	}

	/**
	 * Standard coefficient 標準係数.<p>
	 *
	 */
	public void std_cont_fctr(int value) {
		setConstNumber(offset + 70, $std_cont_fctr, value);
	}

	/**
	 * Standard coefficient 標準係数.<p>
	 *
	 */
	public void std_cont_fctr(long value) {
		setConstNumber(offset + 70, $std_cont_fctr, value);
	}

	/**
	 * Standard coefficient 標準係数.<p>
	 *
	 */
	public void std_cont_fctr(float value) {
		setConstNumber(offset + 70, $std_cont_fctr, value);
	}

	/**
	 * Standard coefficient 標準係数.<p>
	 *
	 */
	public void std_cont_fctr(double value) {
		setConstNumber(offset + 70, $std_cont_fctr, value);
	}


	/**
	 * Storage factory/distribution warehouse cd. 格納先工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String strg_site_cd() {
		return getConstString(offset + 71, $strg_site_cd);
	}

	/**
	 * Storage factory/distribution warehouse cd. 格納先工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void strg_site_cd(String value) {
		setConstString(offset + 71, $strg_site_cd, value);
	}


	/**
	 * Storage factory/distribution warehouse name 格納先工場・物流倉庫名.<p>
	 *
	 */
	public String strg_site_nm() {
		return getConstString(offset + 72, $strg_site_nm);
	}

	/**
	 * Storage factory/distribution warehouse name 格納先工場・物流倉庫名.<p>
	 *
	 */
	public void strg_site_nm(String value) {
		setConstString(offset + 72, $strg_site_nm, value);
	}


	/**
	 * Storage location group cd. 格納場所グループＣＤ.<p>
	 *
	 */
	public String strg_loc_grp_cd() {
		return getConstString(offset + 73, $strg_loc_grp_cd);
	}

	/**
	 * Storage location group cd. 格納場所グループＣＤ.<p>
	 *
	 */
	public void strg_loc_grp_cd(String value) {
		setConstString(offset + 73, $strg_loc_grp_cd, value);
	}


	/**
	 * Storage location group name 格納場所グループ名.<p>
	 *
	 */
	public String strg_loc_grp_nm() {
		return getConstString(offset + 74, $strg_loc_grp_nm);
	}

	/**
	 * Storage location group name 格納場所グループ名.<p>
	 *
	 */
	public void strg_loc_grp_nm(String value) {
		setConstString(offset + 74, $strg_loc_grp_nm, value);
	}


	/**
	 * Storage location distribution group cd. 格納場所物流グループＣＤ.<p>
	 *
	 */
	public String strg_lg_grp_cd() {
		return getConstString(offset + 75, $strg_lg_grp_cd);
	}

	/**
	 * Storage location distribution group cd. 格納場所物流グループＣＤ.<p>
	 *
	 */
	public void strg_lg_grp_cd(String value) {
		setConstString(offset + 75, $strg_lg_grp_cd, value);
	}


	/**
	 * Storage location distribution group name 格納場所物流グループ名.<p>
	 *
	 */
	public String strg_lg_grp_nm() {
		return getConstString(offset + 76, $strg_lg_grp_nm);
	}

	/**
	 * Storage location distribution group name 格納場所物流グループ名.<p>
	 *
	 */
	public void strg_lg_grp_nm(String value) {
		setConstString(offset + 76, $strg_lg_grp_nm, value);
	}


	/**
	 * Storage location gross allocation location group cd. 格納場所総量引当場所グループＣＤ.<p>
	 *
	 */
	public String strg_alloc_grp_cd() {
		return getConstString(offset + 77, $strg_alloc_grp_cd);
	}

	/**
	 * Storage location gross allocation location group cd. 格納場所総量引当場所グループＣＤ.<p>
	 *
	 */
	public void strg_alloc_grp_cd(String value) {
		setConstString(offset + 77, $strg_alloc_grp_cd, value);
	}


	/**
	 * Storage location gross allocation location group name 格納場所総量引当場所グループ名.<p>
	 *
	 */
	public String strg_alloc_grp_nm() {
		return getConstString(offset + 78, $strg_alloc_grp_nm);
	}

	/**
	 * Storage location gross allocation location group name 格納場所総量引当場所グループ名.<p>
	 *
	 */
	public void strg_alloc_grp_nm(String value) {
		setConstString(offset + 78, $strg_alloc_grp_nm, value);
	}


	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public String strg_loc_nm() {
		return getConstString(offset + 79, $strg_loc_nm);
	}

	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public void strg_loc_nm(String value) {
		setConstString(offset + 79, $strg_loc_nm, value);
	}


	/**
	 * Mfg. factory/distribution warehouse cd. 製造場所工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String mfg_site_cd() {
		return getConstString(offset + 80, $mfg_site_cd);
	}

	/**
	 * Mfg. factory/distribution warehouse cd. 製造場所工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void mfg_site_cd(String value) {
		setConstString(offset + 80, $mfg_site_cd, value);
	}


	/**
	 * Mfg. factory/distribution warehouse name 製造場所工場・物流倉庫名.<p>
	 *
	 */
	public String mfg_site_nm() {
		return getConstString(offset + 81, $mfg_site_nm);
	}

	/**
	 * Mfg. factory/distribution warehouse name 製造場所工場・物流倉庫名.<p>
	 *
	 */
	public void mfg_site_nm(String value) {
		setConstString(offset + 81, $mfg_site_nm, value);
	}


	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public String mfg_loc_grp_cd() {
		return getConstString(offset + 82, $mfg_loc_grp_cd);
	}

	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public void mfg_loc_grp_cd(String value) {
		setConstString(offset + 82, $mfg_loc_grp_cd, value);
	}


	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public String mfg_loc_grp_nm() {
		return getConstString(offset + 83, $mfg_loc_grp_nm);
	}

	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public void mfg_loc_grp_nm(String value) {
		setConstString(offset + 83, $mfg_loc_grp_nm, value);
	}


	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public String mfg_loc_nm() {
		return getConstString(offset + 84, $mfg_loc_nm);
	}

	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public void mfg_loc_nm(String value) {
		setConstString(offset + 84, $mfg_loc_nm, value);
	}


	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 85, $sppl_nm);
	}

	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 85, $sppl_nm, value);
	}


	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public String maker_nm() {
		return getConstString(offset + 86, $maker_nm);
	}

	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public void maker_nm(String value) {
		setConstString(offset + 86, $maker_nm, value);
	}


	/**
	 * Factory/Distribution warehouse cd. (Requested) 依頼先工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String rqst_site_cd() {
		return getConstString(offset + 87, $rqst_site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. (Requested) 依頼先工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void rqst_site_cd(String value) {
		setConstString(offset + 87, $rqst_site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name (Requested) 依頼先工場・物流倉庫名.<p>
	 *
	 */
	public String rqst_site_nm() {
		return getConstString(offset + 88, $rqst_site_nm);
	}

	/**
	 * Factory/Distribution warehouse name (Requested) 依頼先工場・物流倉庫名.<p>
	 *
	 */
	public void rqst_site_nm(String value) {
		setConstString(offset + 88, $rqst_site_nm, value);
	}


	/**
	 * Requested location group cd. 依頼先場所グループＣＤ.<p>
	 *
	 */
	public String rqst_loc_grp_cd() {
		return getConstString(offset + 89, $rqst_loc_grp_cd);
	}

	/**
	 * Requested location group cd. 依頼先場所グループＣＤ.<p>
	 *
	 */
	public void rqst_loc_grp_cd(String value) {
		setConstString(offset + 89, $rqst_loc_grp_cd, value);
	}


	/**
	 * Requested location group name 依頼先場所グループ名.<p>
	 *
	 */
	public String rqst_loc_grp_nm() {
		return getConstString(offset + 90, $rqst_loc_grp_nm);
	}

	/**
	 * Requested location group name 依頼先場所グループ名.<p>
	 *
	 */
	public void rqst_loc_grp_nm(String value) {
		setConstString(offset + 90, $rqst_loc_grp_nm, value);
	}


	/**
	 * Location name (Requested) 依頼先場所名.<p>
	 *
	 */
	public String rqst_loc_nm() {
		return getConstString(offset + 91, $rqst_loc_nm);
	}

	/**
	 * Location name (Requested) 依頼先場所名.<p>
	 *
	 */
	public void rqst_loc_nm(String value) {
		setConstString(offset + 91, $rqst_loc_nm, value);
	}


	/**
	 * Requested WG name 依頼先ワーキンググループ名.<p>
	 *
	 */
	public String rqst_wg_nm() {
		return getConstString(offset + 92, $rqst_wg_nm);
	}

	/**
	 * Requested WG name 依頼先ワーキンググループ名.<p>
	 *
	 */
	public void rqst_wg_nm(String value) {
		setConstString(offset + 92, $rqst_wg_nm, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 93, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 93, $wg_nm, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 94, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 94, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 95, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 95, $wrk_nm, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 96, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 96, $itm_typ, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 97, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 97, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 98, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 98, $itm_typ_d_nm, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($mrp_typ.equalsIgnoreCase(name)) {
			return mrp_typ();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($itm_ord_typ.equalsIgnoreCase(name)) {
			return itm_ord_typ();
		}
		if ($ord_gnrt_typ.equalsIgnoreCase(name)) {
			return ord_gnrt_typ();
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
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			return strg_loc_cd();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($rqst_loc_cd.equalsIgnoreCase(name)) {
			return rqst_loc_cd();
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			return rqst_wg_cd();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			return oper_ptn();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($itm_ord_sts_typ.equalsIgnoreCase(name)) {
			return itm_ord_sts_typ();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno_typ1.equalsIgnoreCase(name)) {
			return sno_typ1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno_typ2.equalsIgnoreCase(name)) {
			return sno_typ2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno_typ3.equalsIgnoreCase(name)) {
			return sno_typ3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($sno_typ4.equalsIgnoreCase(name)) {
			return sno_typ4();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($rqmt_no.equalsIgnoreCase(name)) {
			return rqmt_no();
		}
		if ($inst_po_cnt_rmrks.equalsIgnoreCase(name)) {
			return inst_po_cnt_rmrks();
		}
		if ($sim_mrp_no.equalsIgnoreCase(name)) {
			return sim_mrp_no();
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			return io_schd_pr_no();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			return cont_fctr_unit_cd();
		}
		if ($cont_fctr_unit_nm.equalsIgnoreCase(name)) {
			return cont_fctr_unit_nm();
		}
		if ($strg_site_cd.equalsIgnoreCase(name)) {
			return strg_site_cd();
		}
		if ($strg_site_nm.equalsIgnoreCase(name)) {
			return strg_site_nm();
		}
		if ($strg_loc_grp_cd.equalsIgnoreCase(name)) {
			return strg_loc_grp_cd();
		}
		if ($strg_loc_grp_nm.equalsIgnoreCase(name)) {
			return strg_loc_grp_nm();
		}
		if ($strg_lg_grp_cd.equalsIgnoreCase(name)) {
			return strg_lg_grp_cd();
		}
		if ($strg_lg_grp_nm.equalsIgnoreCase(name)) {
			return strg_lg_grp_nm();
		}
		if ($strg_alloc_grp_cd.equalsIgnoreCase(name)) {
			return strg_alloc_grp_cd();
		}
		if ($strg_alloc_grp_nm.equalsIgnoreCase(name)) {
			return strg_alloc_grp_nm();
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			return strg_loc_nm();
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
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			return maker_nm();
		}
		if ($rqst_site_cd.equalsIgnoreCase(name)) {
			return rqst_site_cd();
		}
		if ($rqst_site_nm.equalsIgnoreCase(name)) {
			return rqst_site_nm();
		}
		if ($rqst_loc_grp_cd.equalsIgnoreCase(name)) {
			return rqst_loc_grp_cd();
		}
		if ($rqst_loc_grp_nm.equalsIgnoreCase(name)) {
			return rqst_loc_grp_nm();
		}
		if ($rqst_loc_nm.equalsIgnoreCase(name)) {
			return rqst_loc_nm();
		}
		if ($rqst_wg_nm.equalsIgnoreCase(name)) {
			return rqst_wg_nm();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			return yield_schd_qty();
		}
		if ($inst_qty.equalsIgnoreCase(name)) {
			return inst_qty();
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
		if ($cont_fctr_inst_qty.equalsIgnoreCase(name)) {
			return cont_fctr_inst_qty();
		}
		if ($cont_fctr_schd_yield.equalsIgnoreCase(name)) {
			return cont_fctr_schd_yield();
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			return std_cont_fctr();
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
		if ($master_dt.equalsIgnoreCase(name)) {
			return master_dt();
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			return lmt_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($not_fix_flg.equalsIgnoreCase(name)) {
			return not_fix_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($mrp_typ.equalsIgnoreCase(name)) {
			return mrp_typ();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($itm_ord_typ.equalsIgnoreCase(name)) {
			return itm_ord_typ();
		}
		if ($ord_gnrt_typ.equalsIgnoreCase(name)) {
			return ord_gnrt_typ();
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
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			return strg_loc_cd();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($rqst_loc_cd.equalsIgnoreCase(name)) {
			return rqst_loc_cd();
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			return rqst_wg_cd();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			return oper_ptn();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($itm_ord_sts_typ.equalsIgnoreCase(name)) {
			return itm_ord_sts_typ();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno_typ1.equalsIgnoreCase(name)) {
			return sno_typ1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno_typ2.equalsIgnoreCase(name)) {
			return sno_typ2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno_typ3.equalsIgnoreCase(name)) {
			return sno_typ3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($sno_typ4.equalsIgnoreCase(name)) {
			return sno_typ4();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($rqmt_no.equalsIgnoreCase(name)) {
			return rqmt_no();
		}
		if ($inst_po_cnt_rmrks.equalsIgnoreCase(name)) {
			return inst_po_cnt_rmrks();
		}
		if ($sim_mrp_no.equalsIgnoreCase(name)) {
			return sim_mrp_no();
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			return io_schd_pr_no();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			return cont_fctr_unit_cd();
		}
		if ($cont_fctr_unit_nm.equalsIgnoreCase(name)) {
			return cont_fctr_unit_nm();
		}
		if ($strg_site_cd.equalsIgnoreCase(name)) {
			return strg_site_cd();
		}
		if ($strg_site_nm.equalsIgnoreCase(name)) {
			return strg_site_nm();
		}
		if ($strg_loc_grp_cd.equalsIgnoreCase(name)) {
			return strg_loc_grp_cd();
		}
		if ($strg_loc_grp_nm.equalsIgnoreCase(name)) {
			return strg_loc_grp_nm();
		}
		if ($strg_lg_grp_cd.equalsIgnoreCase(name)) {
			return strg_lg_grp_cd();
		}
		if ($strg_lg_grp_nm.equalsIgnoreCase(name)) {
			return strg_lg_grp_nm();
		}
		if ($strg_alloc_grp_cd.equalsIgnoreCase(name)) {
			return strg_alloc_grp_cd();
		}
		if ($strg_alloc_grp_nm.equalsIgnoreCase(name)) {
			return strg_alloc_grp_nm();
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			return strg_loc_nm();
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
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			return maker_nm();
		}
		if ($rqst_site_cd.equalsIgnoreCase(name)) {
			return rqst_site_cd();
		}
		if ($rqst_site_nm.equalsIgnoreCase(name)) {
			return rqst_site_nm();
		}
		if ($rqst_loc_grp_cd.equalsIgnoreCase(name)) {
			return rqst_loc_grp_cd();
		}
		if ($rqst_loc_grp_nm.equalsIgnoreCase(name)) {
			return rqst_loc_grp_nm();
		}
		if ($rqst_loc_nm.equalsIgnoreCase(name)) {
			return rqst_loc_nm();
		}
		if ($rqst_wg_nm.equalsIgnoreCase(name)) {
			return rqst_wg_nm();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			return yield_schd_qty();
		}
		if ($inst_qty.equalsIgnoreCase(name)) {
			return inst_qty();
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
		if ($cont_fctr_inst_qty.equalsIgnoreCase(name)) {
			return cont_fctr_inst_qty();
		}
		if ($cont_fctr_schd_yield.equalsIgnoreCase(name)) {
			return cont_fctr_schd_yield();
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			return std_cont_fctr();
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
		if ($master_dt.equalsIgnoreCase(name)) {
			return master_dt();
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			return lmt_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($not_fix_flg.equalsIgnoreCase(name)) {
			return not_fix_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($mrp_typ.equalsIgnoreCase(name)) {
			mrp_typ(value);
			return;
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
			return;
		}
		if ($itm_ord_typ.equalsIgnoreCase(name)) {
			itm_ord_typ(value);
			return;
		}
		if ($ord_gnrt_typ.equalsIgnoreCase(name)) {
			ord_gnrt_typ(value);
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
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			strg_loc_cd(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($rqst_loc_cd.equalsIgnoreCase(name)) {
			rqst_loc_cd(value);
			return;
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			rqst_wg_cd(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			oper_ptn(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($itm_ord_sts_typ.equalsIgnoreCase(name)) {
			itm_ord_sts_typ(value);
			return;
		}
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno_typ1.equalsIgnoreCase(name)) {
			sno_typ1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno_typ2.equalsIgnoreCase(name)) {
			sno_typ2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno_typ3.equalsIgnoreCase(name)) {
			sno_typ3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($sno_typ4.equalsIgnoreCase(name)) {
			sno_typ4(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($rqmt_no.equalsIgnoreCase(name)) {
			rqmt_no(value);
			return;
		}
		if ($inst_po_cnt_rmrks.equalsIgnoreCase(name)) {
			inst_po_cnt_rmrks(value);
			return;
		}
		if ($sim_mrp_no.equalsIgnoreCase(name)) {
			sim_mrp_no(value);
			return;
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			io_schd_pr_no(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		if ($cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			cont_fctr_unit_cd(value);
			return;
		}
		if ($cont_fctr_unit_nm.equalsIgnoreCase(name)) {
			cont_fctr_unit_nm(value);
			return;
		}
		if ($strg_site_cd.equalsIgnoreCase(name)) {
			strg_site_cd(value);
			return;
		}
		if ($strg_site_nm.equalsIgnoreCase(name)) {
			strg_site_nm(value);
			return;
		}
		if ($strg_loc_grp_cd.equalsIgnoreCase(name)) {
			strg_loc_grp_cd(value);
			return;
		}
		if ($strg_loc_grp_nm.equalsIgnoreCase(name)) {
			strg_loc_grp_nm(value);
			return;
		}
		if ($strg_lg_grp_cd.equalsIgnoreCase(name)) {
			strg_lg_grp_cd(value);
			return;
		}
		if ($strg_lg_grp_nm.equalsIgnoreCase(name)) {
			strg_lg_grp_nm(value);
			return;
		}
		if ($strg_alloc_grp_cd.equalsIgnoreCase(name)) {
			strg_alloc_grp_cd(value);
			return;
		}
		if ($strg_alloc_grp_nm.equalsIgnoreCase(name)) {
			strg_alloc_grp_nm(value);
			return;
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			strg_loc_nm(value);
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
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			maker_nm(value);
			return;
		}
		if ($rqst_site_cd.equalsIgnoreCase(name)) {
			rqst_site_cd(value);
			return;
		}
		if ($rqst_site_nm.equalsIgnoreCase(name)) {
			rqst_site_nm(value);
			return;
		}
		if ($rqst_loc_grp_cd.equalsIgnoreCase(name)) {
			rqst_loc_grp_cd(value);
			return;
		}
		if ($rqst_loc_grp_nm.equalsIgnoreCase(name)) {
			rqst_loc_grp_nm(value);
			return;
		}
		if ($rqst_loc_nm.equalsIgnoreCase(name)) {
			rqst_loc_nm(value);
			return;
		}
		if ($rqst_wg_nm.equalsIgnoreCase(name)) {
			rqst_wg_nm(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
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
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
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
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($inst_qty.equalsIgnoreCase(name)) {
			inst_qty(value);
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
		if ($cont_fctr_inst_qty.equalsIgnoreCase(name)) {
			cont_fctr_inst_qty(value);
			return;
		}
		if ($cont_fctr_schd_yield.equalsIgnoreCase(name)) {
			cont_fctr_schd_yield(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($inst_qty.equalsIgnoreCase(name)) {
			inst_qty(value);
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
		if ($cont_fctr_inst_qty.equalsIgnoreCase(name)) {
			cont_fctr_inst_qty(value);
			return;
		}
		if ($cont_fctr_schd_yield.equalsIgnoreCase(name)) {
			cont_fctr_schd_yield(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($inst_qty.equalsIgnoreCase(name)) {
			inst_qty(value);
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
		if ($cont_fctr_inst_qty.equalsIgnoreCase(name)) {
			cont_fctr_inst_qty(value);
			return;
		}
		if ($cont_fctr_schd_yield.equalsIgnoreCase(name)) {
			cont_fctr_schd_yield(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($inst_qty.equalsIgnoreCase(name)) {
			inst_qty(value);
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
		if ($cont_fctr_inst_qty.equalsIgnoreCase(name)) {
			cont_fctr_inst_qty(value);
			return;
		}
		if ($cont_fctr_schd_yield.equalsIgnoreCase(name)) {
			cont_fctr_schd_yield(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($inst_qty.equalsIgnoreCase(name)) {
			inst_qty(value);
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
		if ($cont_fctr_inst_qty.equalsIgnoreCase(name)) {
			cont_fctr_inst_qty(value);
			return;
		}
		if ($cont_fctr_schd_yield.equalsIgnoreCase(name)) {
			cont_fctr_schd_yield(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
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
		if ($master_dt.equalsIgnoreCase(name)) {
			master_dt(value);
			return;
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			lmt_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($not_fix_flg.equalsIgnoreCase(name)) {
			not_fix_flg(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($mrp_typ.equalsIgnoreCase(name)) {
			mrp_typ(value);
			return;
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
			return;
		}
		if ($itm_ord_typ.equalsIgnoreCase(name)) {
			itm_ord_typ(value);
			return;
		}
		if ($ord_gnrt_typ.equalsIgnoreCase(name)) {
			ord_gnrt_typ(value);
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
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			strg_loc_cd(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($rqst_loc_cd.equalsIgnoreCase(name)) {
			rqst_loc_cd(value);
			return;
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			rqst_wg_cd(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			oper_ptn(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($itm_ord_sts_typ.equalsIgnoreCase(name)) {
			itm_ord_sts_typ(value);
			return;
		}
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno_typ1.equalsIgnoreCase(name)) {
			sno_typ1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno_typ2.equalsIgnoreCase(name)) {
			sno_typ2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno_typ3.equalsIgnoreCase(name)) {
			sno_typ3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($sno_typ4.equalsIgnoreCase(name)) {
			sno_typ4(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($rqmt_no.equalsIgnoreCase(name)) {
			rqmt_no(value);
			return;
		}
		if ($inst_po_cnt_rmrks.equalsIgnoreCase(name)) {
			inst_po_cnt_rmrks(value);
			return;
		}
		if ($sim_mrp_no.equalsIgnoreCase(name)) {
			sim_mrp_no(value);
			return;
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			io_schd_pr_no(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		if ($cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			cont_fctr_unit_cd(value);
			return;
		}
		if ($cont_fctr_unit_nm.equalsIgnoreCase(name)) {
			cont_fctr_unit_nm(value);
			return;
		}
		if ($strg_site_cd.equalsIgnoreCase(name)) {
			strg_site_cd(value);
			return;
		}
		if ($strg_site_nm.equalsIgnoreCase(name)) {
			strg_site_nm(value);
			return;
		}
		if ($strg_loc_grp_cd.equalsIgnoreCase(name)) {
			strg_loc_grp_cd(value);
			return;
		}
		if ($strg_loc_grp_nm.equalsIgnoreCase(name)) {
			strg_loc_grp_nm(value);
			return;
		}
		if ($strg_lg_grp_cd.equalsIgnoreCase(name)) {
			strg_lg_grp_cd(value);
			return;
		}
		if ($strg_lg_grp_nm.equalsIgnoreCase(name)) {
			strg_lg_grp_nm(value);
			return;
		}
		if ($strg_alloc_grp_cd.equalsIgnoreCase(name)) {
			strg_alloc_grp_cd(value);
			return;
		}
		if ($strg_alloc_grp_nm.equalsIgnoreCase(name)) {
			strg_alloc_grp_nm(value);
			return;
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			strg_loc_nm(value);
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
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			maker_nm(value);
			return;
		}
		if ($rqst_site_cd.equalsIgnoreCase(name)) {
			rqst_site_cd(value);
			return;
		}
		if ($rqst_site_nm.equalsIgnoreCase(name)) {
			rqst_site_nm(value);
			return;
		}
		if ($rqst_loc_grp_cd.equalsIgnoreCase(name)) {
			rqst_loc_grp_cd(value);
			return;
		}
		if ($rqst_loc_grp_nm.equalsIgnoreCase(name)) {
			rqst_loc_grp_nm(value);
			return;
		}
		if ($rqst_loc_nm.equalsIgnoreCase(name)) {
			rqst_loc_nm(value);
			return;
		}
		if ($rqst_wg_nm.equalsIgnoreCase(name)) {
			rqst_wg_nm(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
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
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
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
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($inst_qty.equalsIgnoreCase(name)) {
			inst_qty(value);
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
		if ($cont_fctr_inst_qty.equalsIgnoreCase(name)) {
			cont_fctr_inst_qty(value);
			return;
		}
		if ($cont_fctr_schd_yield.equalsIgnoreCase(name)) {
			cont_fctr_schd_yield(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($inst_qty.equalsIgnoreCase(name)) {
			inst_qty(value);
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
		if ($cont_fctr_inst_qty.equalsIgnoreCase(name)) {
			cont_fctr_inst_qty(value);
			return;
		}
		if ($cont_fctr_schd_yield.equalsIgnoreCase(name)) {
			cont_fctr_schd_yield(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($inst_qty.equalsIgnoreCase(name)) {
			inst_qty(value);
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
		if ($cont_fctr_inst_qty.equalsIgnoreCase(name)) {
			cont_fctr_inst_qty(value);
			return;
		}
		if ($cont_fctr_schd_yield.equalsIgnoreCase(name)) {
			cont_fctr_schd_yield(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($inst_qty.equalsIgnoreCase(name)) {
			inst_qty(value);
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
		if ($cont_fctr_inst_qty.equalsIgnoreCase(name)) {
			cont_fctr_inst_qty(value);
			return;
		}
		if ($cont_fctr_schd_yield.equalsIgnoreCase(name)) {
			cont_fctr_schd_yield(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($inst_qty.equalsIgnoreCase(name)) {
			inst_qty(value);
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
		if ($cont_fctr_inst_qty.equalsIgnoreCase(name)) {
			cont_fctr_inst_qty(value);
			return;
		}
		if ($cont_fctr_schd_yield.equalsIgnoreCase(name)) {
			cont_fctr_schd_yield(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
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
		if ($master_dt.equalsIgnoreCase(name)) {
			master_dt(value);
			return;
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			lmt_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($not_fix_flg.equalsIgnoreCase(name)) {
			not_fix_flg(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

