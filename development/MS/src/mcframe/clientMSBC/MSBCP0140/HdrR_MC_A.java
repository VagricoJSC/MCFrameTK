package mcframe.clientMSBC.MSBCP0140;

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
 * ブロック"Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class HdrR_MC_A extends MCConstRow {

	/**
	 * Item order status type 品目オーダ状況区分.<p>
	 *
	 */
	public static final String $itm_ord_sts_typ = "itm_ord_sts_typ";
	/**
	 * Item order status type name 品目オーダ状況区分名.<p>
	 *
	 */
	public static final String $itm_ord_sts_typ_nm = "itm_ord_sts_typ_nm";
	/**
	 * Item order status type before change 変更前品目オーダ状況区分.<p>
	 *
	 */
	public static final String $itm_ord_sts_typ_old = "itm_ord_sts_typ_old";
	/**
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public static final String $master_dt = "master_dt";
	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public static final String $itm_ord_no = "itm_ord_no";
	/**
	 * Requirements No. 所要ＮＯ.<p>
	 *
	 */
	public static final String $rqmt_no = "rqmt_no";
	public static final String $itm_p = "itm_p";
	public static final String $ver_no_p = "ver_no_p";
	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public static final String $strg_loc_cd = "strg_loc_cd";
	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public static final String $strg_loc_nm = "strg_loc_nm";
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
	 * Storage location supplier cd. 格納場所発注先ＣＤ.<p>
	 *
	 */
	public static final String $strg_sppl_cd = "strg_sppl_cd";
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
	 * Disallow procurement 手配不許可.<p>
	 *
	 */
	public static final String $not_fix_flg = "not_fix_flg";
	/**
	 * Mfg. 製造.<p>
	 *
	 */
	public static final String $mfg_flg = "mfg_flg";
	/**
	 * Subcontracting 外注.<p>
	 *
	 */
	public static final String $outsrc_flg = "outsrc_flg";
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public static final String $mfg_loc_cd = "mfg_loc_cd";
	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public static final String $mfg_loc_nm = "mfg_loc_nm";
	/**
	 * Mfg. location supplier cd. 製造場所発注先ＣＤ.<p>
	 *
	 */
	public static final String $mfg_sppl_cd = "mfg_sppl_cd";
	/**
	 * Mfg. location maker cd. 製造場所メーカＣＤ.<p>
	 *
	 */
	public static final String $mfg_maker_cd = "mfg_maker_cd";
	/**
	 * Master mfg. location cd. マスタ製造場所ＣＤ.<p>
	 *
	 */
	public static final String $mst_mfg_loc_cd = "mst_mfg_loc_cd";
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public static final String $bom_ptn = "bom_ptn";
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public static final String $sppl_nm = "sppl_nm";
	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public static final String $maker_cd = "maker_cd";
	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public static final String $maker_nm = "maker_nm";
	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public static final String $rqst_loc_cd = "rqst_loc_cd";
	/**
	 * Location name (Requested) 依頼先場所名.<p>
	 *
	 */
	public static final String $rqst_loc_nm = "rqst_loc_nm";
	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $rqst_wg_cd = "rqst_wg_cd";
	/**
	 * Requested WG name 依頼先ワーキンググループ名.<p>
	 *
	 */
	public static final String $rqst_wg_nm = "rqst_wg_nm";
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
	 * Unrequired quantity linkage 数量連動不要.<p>
	 *
	 */
	public static final String $not_qty_rlt_flg = "not_qty_rlt_flg";
	public static final String $inst_qty_p = "inst_qty_p";
	public static final String $yield_schd_qty_p = "yield_schd_qty_p";
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
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public static final String $cont_fctr_flg = "cont_fctr_flg";
	/**
	 * Expired date 期限切れ日.<p>
	 *
	 */
	public static final String $lmt_dt = "lmt_dt";
	public static final String $sno_wrk_no_p = "sno_wrk_no_p";
	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public static final String $sno1_mng_typ = "sno1_mng_typ";
	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public static final String $sno2_mng_typ = "sno2_mng_typ";
	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public static final String $sno3_mng_typ = "sno3_mng_typ";
	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public static final String $sno4_mng_typ = "sno4_mng_typ";
	/**
	 * For inspection 検査対象.<p>
	 *
	 */
	public static final String $insp_flg = "insp_flg";
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
	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public static final String $oper_ptn = "oper_ptn";
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
	public static final String $inst_cont_qty_p = "inst_cont_qty_p";
	public static final String $yield_cont_qty_p = "yield_cont_qty_p";
	public static final String $cont_unit_p = "cont_unit_p";
	public static final String $std_cont_p = "std_cont_p";
	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public static final String $cont_fctr_dec_place = "cont_fctr_dec_place";
	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public static final String $cont_fctr_rnd_typ = "cont_fctr_rnd_typ";
	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public static final String $ver_flg = "ver_flg";
	/**
	 * Order/PO contact remarks 指図・発注連絡備考.<p>
	 *
	 */
	public static final String $inst_po_cnt_rmrks = "inst_po_cnt_rmrks";
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
	public static final String $itm_order_upd_cntr = "itm_order_upd_cntr";
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
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public static final String $ins_ts = "ins_ts";
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public static final String $upd_ts = "upd_ts";
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public static final String $upd_srv_req_no = "upd_srv_req_no";
	public static final String $has_oper = "has_oper";

	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $ver_no = $ver_no_p + ".ver_no";
	public static final String $inst_qty = $inst_qty_p + ".qty";
	public static final String $yield_schd_qty = $yield_schd_qty_p + ".qty";
	public static final String $sno1 = $sno_wrk_no_p + ".sno1";
	public static final String $sno2 = $sno_wrk_no_p + ".sno2";
	public static final String $sno3 = $sno_wrk_no_p + ".sno3";
	public static final String $sno4 = $sno_wrk_no_p + ".sno4";
	public static final String $wrk_no = $sno_wrk_no_p + ".wrk_no";
	public static final String $wrk_nm = $sno_wrk_no_p + ".wrk_nm";
	public static final String $cont_fctr_inst_qty = $inst_cont_qty_p + ".cont_qty";
	public static final String $cont_fctr_schd_yield = $yield_cont_qty_p + ".cont_qty";
	public static final String $cont_fctr_unit_cd = $cont_unit_p + ".cont_fctr_unit_cd";
	public static final String $cont_fctr_unit_nm = $cont_unit_p + ".cont_fctr_unit_nm";
	public static final String $std_cont_fctr = $std_cont_p + ".std_cont_fctr";

	public static final MCMeta itm_ord_sts_typ_META = createCommonMeta($itm_ord_sts_typ, mcframe.commonMS.meta.MS_META.ITM_ORD_STS_TYP);
	public static final MCMeta itm_ord_sts_typ_nm_META = createCommonMeta($itm_ord_sts_typ_nm, mcframe.commonMS.meta.MS_META.ITM_ORD_STS_TYP_NM);
	public static final MCMeta itm_ord_sts_typ_old_META = createCommonMeta($itm_ord_sts_typ_old, mcframe.commonMS.meta.MS_META.ITM_ORD_STS_TYP);
	public static final MCMeta master_dt_META = createCommonMeta($master_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta itm_ord_no_META = createCommonMeta($itm_ord_no, mcframe.commonMA.meta.MA_META.ITM_ORD_NO);
	public static final MCMeta rqmt_no_META = createCommonMeta($rqmt_no, mcframe.commonMA.meta.MA_META.RQMT_NO);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta ver_no_p_META = createInnerRowMeta($ver_no_p, mcframe.clientMAUB.MAUBP0340.VerNoR.class);
	public static final MCMeta strg_loc_cd_META = createCommonMeta($strg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta strg_loc_nm_META = createCommonMeta($strg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta strg_site_cd_META = createCommonMeta($strg_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta strg_site_nm_META = createCommonMeta($strg_site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta strg_sppl_cd_META = createCommonMeta($strg_sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta itm_ord_typ_META = createCommonMeta($itm_ord_typ, mcframe.commonMS.meta.MS_META.ITM_ORD_TYP);
	public static final MCMeta itm_ord_typ_nm_META = createCommonMeta($itm_ord_typ_nm, mcframe.commonMS.meta.MS_META.ITM_ORD_TYP_NM);
	public static final MCMeta not_fix_flg_META = createCommonMeta($not_fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_flg_META = createCommonMeta($mfg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta outsrc_flg_META = createCommonMeta($outsrc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta mfg_loc_nm_META = createCommonMeta($mfg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta mfg_sppl_cd_META = createCommonMeta($mfg_sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta mfg_maker_cd_META = createCommonMeta($mfg_maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta mst_mfg_loc_cd_META = createCommonMeta($mst_mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta bom_ptn_META = createCommonMeta($bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta maker_cd_META = createCommonMeta($maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta maker_nm_META = createCommonMeta($maker_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta rqst_loc_cd_META = createCommonMeta($rqst_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta rqst_loc_nm_META = createCommonMeta($rqst_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta rqst_wg_cd_META = createCommonMeta($rqst_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta rqst_wg_nm_META = createCommonMeta($rqst_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta nmr_qty_META = createCommonMeta($nmr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta dnm_qty_META = createCommonMeta($dnm_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta fxd_yield_qty_META = createCommonMeta($fxd_yield_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta not_qty_rlt_flg_META = createCommonMeta($not_qty_rlt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_qty_p_META = createInnerRowMeta($inst_qty_p, mcframe.clientMAUB.MAUBP0050.QtyR.class);
	public static final MCMeta yield_schd_qty_p_META = createInnerRowMeta($yield_schd_qty_p, mcframe.clientMAUB.MAUBP0050.QtyR.class);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta unit_nm_META = createCommonMeta($unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta rnd_typ_META = createCommonMeta($rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta cont_fctr_flg_META = createCommonMeta($cont_fctr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lmt_dt_META = createCommonMeta($lmt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sno_wrk_no_p_META = createInnerRowMeta($sno_wrk_no_p, mcframe.clientMSUB.MSUBP0040.SnoWrkNoR.class);
	public static final MCMeta sno1_mng_typ_META = createCommonMeta($sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno2_mng_typ_META = createCommonMeta($sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno3_mng_typ_META = createCommonMeta($sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno4_mng_typ_META = createCommonMeta($sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta insp_flg_META = createCommonMeta($insp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta po_schd_dt_META = createCommonMeta($po_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mfg_st_schd_dt_META = createCommonMeta($mfg_st_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mfg_end_schd_dt_META = createCommonMeta($mfg_end_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta gi_schd_dt_META = createCommonMeta($gi_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta strg_schd_dt_META = createCommonMeta($strg_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta accpt_schd_dt_META = createCommonMeta($accpt_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta insp_st_schd_dt_META = createCommonMeta($insp_st_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta insp_end_schd_dt_META = createCommonMeta($insp_end_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta avl_schd_dt_META = createCommonMeta($avl_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta oper_ptn_META = createCommonMeta($oper_ptn, mcframe.commonMA.meta.MA_META.OPER_PTN);
	public static final MCMeta purc_lt_META = createCommonMeta($purc_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta mfg_lt_META = createCommonMeta($mfg_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta xfr_lt_META = createCommonMeta($xfr_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta accpt_insp_lt_META = createCommonMeta($accpt_insp_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta insp_lt_META = createCommonMeta($insp_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta insp_offst_META = createCommonMeta($insp_offst, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta ord_fix_pd_META = createCommonMeta($ord_fix_pd, mcframe.commonMA.meta.MA_META.ORD_FIX_PD);
	public static final MCMeta inst_cont_qty_p_META = createInnerRowMeta($inst_cont_qty_p, mcframe.clientMAUB.MAUBP0350.ContQtyR.class);
	public static final MCMeta yield_cont_qty_p_META = createInnerRowMeta($yield_cont_qty_p, mcframe.clientMAUB.MAUBP0350.ContQtyR.class);
	public static final MCMeta cont_unit_p_META = createInnerRowMeta($cont_unit_p, mcframe.clientMAUB.MAUBP0360.ContFctrUnitR.class);
	public static final MCMeta std_cont_p_META = createInnerRowMeta($std_cont_p, mcframe.clientMAUB.MAUBP0370.StdContFctrR.class);
	public static final MCMeta cont_fctr_dec_place_META = createCommonMeta($cont_fctr_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta cont_fctr_rnd_typ_META = createCommonMeta($cont_fctr_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta ver_flg_META = createCommonMeta($ver_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_po_cnt_rmrks_META = createCommonMeta($inst_po_cnt_rmrks, mcframe.commonMS.meta.MS_META.INST_PO_CNT_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.IORD_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.IORD_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.IORD_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.IORD_SUB_CHAR3);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta itm_order_upd_cntr_META = createCommonMeta($itm_order_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);
	public static final MCMeta has_oper_META = createCommonMeta($has_oper, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<HdrR> constMetas = new ConstMetaList<HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			itm_ord_sts_typ_META,
			itm_ord_sts_typ_nm_META,
			itm_ord_sts_typ_old_META,
			master_dt_META,
			itm_ord_no_META,
			rqmt_no_META,
			itm_p_META,
			ver_no_p_META,
			strg_loc_cd_META,
			strg_loc_nm_META,
			strg_site_cd_META,
			strg_site_nm_META,
			strg_sppl_cd_META,
			wg_cd_META,
			wg_nm_META,
			itm_ord_typ_META,
			itm_ord_typ_nm_META,
			not_fix_flg_META,
			mfg_flg_META,
			outsrc_flg_META,
			mfg_loc_cd_META,
			mfg_loc_nm_META,
			mfg_sppl_cd_META,
			mfg_maker_cd_META,
			mst_mfg_loc_cd_META,
			bom_ptn_META,
			sppl_cd_META,
			sppl_nm_META,
			maker_cd_META,
			maker_nm_META,
			rqst_loc_cd_META,
			rqst_loc_nm_META,
			rqst_wg_cd_META,
			rqst_wg_nm_META,
			nmr_qty_META,
			dnm_qty_META,
			fxd_yield_qty_META,
			not_qty_rlt_flg_META,
			inst_qty_p_META,
			yield_schd_qty_p_META,
			unit_cd_META,
			unit_nm_META,
			dec_place_META,
			rnd_typ_META,
			cont_fctr_flg_META,
			lmt_dt_META,
			sno_wrk_no_p_META,
			sno1_mng_typ_META,
			sno2_mng_typ_META,
			sno3_mng_typ_META,
			sno4_mng_typ_META,
			insp_flg_META,
			po_schd_dt_META,
			mfg_st_schd_dt_META,
			mfg_end_schd_dt_META,
			gi_schd_dt_META,
			strg_schd_dt_META,
			accpt_schd_dt_META,
			insp_st_schd_dt_META,
			insp_end_schd_dt_META,
			avl_schd_dt_META,
			oper_ptn_META,
			purc_lt_META,
			mfg_lt_META,
			xfr_lt_META,
			accpt_insp_lt_META,
			insp_lt_META,
			insp_offst_META,
			ord_fix_pd_META,
			inst_cont_qty_p_META,
			yield_cont_qty_p_META,
			cont_unit_p_META,
			std_cont_p_META,
			cont_fctr_dec_place_META,
			cont_fctr_rnd_typ_META,
			ver_flg_META,
			inst_po_cnt_rmrks_META,
			intr_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_func_id_META,
			ins_func_nm_META,
			itm_order_upd_cntr_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_func_id_META,
			upd_func_nm_META,
			ins_ts_META,
			upd_ts_META,
			upd_srv_req_no_META,
			has_oper_META
		},
		new String[][]{
			{
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"ver_no",
				"inst_qty",
				"yield_schd_qty",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"wrk_no",
				"wrk_nm",
				"cont_fctr_inst_qty",
				"cont_fctr_schd_yield",
				"cont_fctr_unit_cd",
				"cont_fctr_unit_nm",
				"std_cont_fctr"
			},
			{
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$ver_no,
				$inst_qty,
				$yield_schd_qty,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$wrk_no,
				$wrk_nm,
				$cont_fctr_inst_qty,
				$cont_fctr_schd_yield,
				$cont_fctr_unit_cd,
				$cont_fctr_unit_nm,
				$std_cont_fctr
			}
		}
	);

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
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
				{$strg_loc_cd, "loc_nm;site_cd;site_nm;wg_cd;wg_nm;sppl_cd"},	// strg_loc_cd
				{$mfg_loc_cd, "mfg_loc_nm;sppl_cd;maker_cd"},	// mfg_loc_cd
				{$bom_ptn, "rqst_wg_cd;rqst_wg_nm;oper_ptn;yield_schd_qty;mfg_inst_qty;fxd_rqmt_qty"},	// bom_ptn
				{$sppl_cd, "bp_nm"},	// sppl_cd
				{$maker_cd, "bp_nm;rqst_wg_cd;rqst_wg_nm"}	// maker_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;itm_sub1"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;itm_sub1;itm_sub2"},	// itm_p.itm_sub3
				{$strg_loc_cd, "MAC_LOC_IS_SRCH_TYP.COMM;TRUE"},	// strg_loc_cd
				{$mfg_loc_cd, "master_dt;itm_cd;itm_sub1;itm_sub2;itm_sub3;wg_cd;mfg_flg;outsrc_flg"},	// mfg_loc_cd
				{$bom_ptn, "master_dt;itm_cd;itm_sub1;itm_sub2;itm_sub3;wg_cd;mfg_loc_cd"},	// bom_ptn
				{$sppl_cd, "master_dt;itm_cd;itm_sub1;itm_sub2;itm_sub3;wg_cd"},	// sppl_cd
				{$maker_cd, "master_dt;itm_cd;itm_sub1;itm_sub2;itm_sub3;wg_cd;sppl_cd"},	// maker_cd
				{$rqst_loc_cd, "master_dt;itm_cd;itm_sub1;itm_sub2;itm_sub3;wg_cd;strg_loc_cd;itm_ord_typ"},	// rqst_loc_cd
				{$oper_ptn, "itm_cd;itm_sub1;itm_sub2;itm_sub3;mfg_loc_cd;mfg_st_schd_dt;mode_nullval_flg"}	// oper_ptn
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$itm_p + ".itm_cd", "itm_is_srch_typ"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "itm_is_srch_typ;itm_cd"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "itm_is_srch_typ;itm_cd;itm_sub1"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"},	// itm_p.itm_sub3
				{$strg_loc_cd, "loc_is_srch_typ;wr_flg"},	// strg_loc_cd
				{$mfg_loc_cd, "master_dt;itm_cd;itm_sub1;itm_sub2;itm_sub3;wg_cd;mfg_flg;outsrc_flg"},	// mfg_loc_cd
				{$bom_ptn, "dt;itm_cd;itm_sub1;itm_sub2;itm_sub3;wg_cd;mfg_loc_cd"},	// bom_ptn
				{$sppl_cd, "master_dt;itm_cd;itm_sub1;itm_sub2;itm_sub3;wg_cd"},	// sppl_cd
				{$maker_cd, "master_dt;itm_cd;itm_sub1;itm_sub2;itm_sub3;wg_cd;sppl_cd"},	// maker_cd
				{$rqst_loc_cd, "master_dt;itm_cd;itm_sub1;itm_sub2;itm_sub3;wg_cd;strg_loc_cd;itm_ord_typ"},	// rqst_loc_cd
				{$oper_ptn, "itm_cd;itm_sub1;itm_sub2;itm_sub3;loc_cd;dt;true"}	// oper_ptn
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$strg_site_cd, "SITE"},	// strg_site_cd
				{$strg_site_nm, "SITE"},	// strg_site_nm
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"},	// wg_nm
				{$mfg_maker_cd, "MAKER"},	// mfg_maker_cd
				{$maker_cd, "MAKER"},	// maker_cd
				{$maker_nm, "MAKER"},	// maker_nm
				{$rqst_wg_cd, "WG"},	// rqst_wg_cd
				{$rqst_wg_nm, "WG"}	// rqst_wg_nm
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
	protected HdrR_MC_A(ConstMetaList<? extends HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrR clone() {
		return (HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrR createInstance() {
		return (HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrR getValues(String... names) {
		return (HdrR) super.getValues(names);
	}



	/**
	 * Item order status type 品目オーダ状況区分.<p>
	 *
	 */
	public String itm_ord_sts_typ() {
		return getConstString(offset + 0, $itm_ord_sts_typ);
	}

	/**
	 * Item order status type 品目オーダ状況区分.<p>
	 *
	 */
	public void itm_ord_sts_typ(String value) {
		setConstString(offset + 0, $itm_ord_sts_typ, value);
	}


	/**
	 * Item order status type name 品目オーダ状況区分名.<p>
	 *
	 */
	public String itm_ord_sts_typ_nm() {
		return getConstString(offset + 1, $itm_ord_sts_typ_nm);
	}

	/**
	 * Item order status type name 品目オーダ状況区分名.<p>
	 *
	 */
	public void itm_ord_sts_typ_nm(String value) {
		setConstString(offset + 1, $itm_ord_sts_typ_nm, value);
	}


	/**
	 * Item order status type before change 変更前品目オーダ状況区分.<p>
	 *
	 */
	public String itm_ord_sts_typ_old() {
		return getConstString(offset + 2, $itm_ord_sts_typ_old);
	}

	/**
	 * Item order status type before change 変更前品目オーダ状況区分.<p>
	 *
	 */
	public void itm_ord_sts_typ_old(String value) {
		setConstString(offset + 2, $itm_ord_sts_typ_old, value);
	}


	/**
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public MCDate master_dt() {
		return getConstDate(offset + 3, $master_dt);
	}

	/**
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public void master_dt(MCDate value) {
		setConstDate(offset + 3, $master_dt, value);
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
	 * Requirements No. 所要ＮＯ.<p>
	 *
	 */
	public String rqmt_no() {
		return getConstString(offset + 5, $rqmt_no);
	}

	/**
	 * Requirements No. 所要ＮＯ.<p>
	 *
	 */
	public void rqmt_no(String value) {
		setConstString(offset + 5, $rqmt_no, value);
	}


	public mcframe.clientMAUB.MAUBP0030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 6, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 6, $itm_p, row);
	}


	public mcframe.clientMAUB.MAUBP0340.VerNoR ver_no_p(){
		return (mcframe.clientMAUB.MAUBP0340.VerNoR) getConstInnerRow(offset + 7, $ver_no_p);
	}
	
	public void ver_no_p(mcframe.clientMAUB.MAUBP0340.VerNoR row){
		setConstInnerRow(offset + 7, $ver_no_p, row);
	}


	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public String strg_loc_cd() {
		return getConstString(offset + 8, $strg_loc_cd);
	}

	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public void strg_loc_cd(String value) {
		setConstString(offset + 8, $strg_loc_cd, value);
	}


	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public String strg_loc_nm() {
		return getConstString(offset + 9, $strg_loc_nm);
	}

	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public void strg_loc_nm(String value) {
		setConstString(offset + 9, $strg_loc_nm, value);
	}


	/**
	 * Storage factory/distribution warehouse cd. 格納先工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String strg_site_cd() {
		return getConstString(offset + 10, $strg_site_cd);
	}

	/**
	 * Storage factory/distribution warehouse cd. 格納先工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void strg_site_cd(String value) {
		setConstString(offset + 10, $strg_site_cd, value);
	}


	/**
	 * Storage factory/distribution warehouse name 格納先工場・物流倉庫名.<p>
	 *
	 */
	public String strg_site_nm() {
		return getConstString(offset + 11, $strg_site_nm);
	}

	/**
	 * Storage factory/distribution warehouse name 格納先工場・物流倉庫名.<p>
	 *
	 */
	public void strg_site_nm(String value) {
		setConstString(offset + 11, $strg_site_nm, value);
	}


	/**
	 * Storage location supplier cd. 格納場所発注先ＣＤ.<p>
	 *
	 */
	public String strg_sppl_cd() {
		return getConstString(offset + 12, $strg_sppl_cd);
	}

	/**
	 * Storage location supplier cd. 格納場所発注先ＣＤ.<p>
	 *
	 */
	public void strg_sppl_cd(String value) {
		setConstString(offset + 12, $strg_sppl_cd, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 13, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 13, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 14, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 14, $wg_nm, value);
	}


	/**
	 * Order type オーダ区分.<p>
	 *
	 */
	public String itm_ord_typ() {
		return getConstString(offset + 15, $itm_ord_typ);
	}

	/**
	 * Order type オーダ区分.<p>
	 *
	 */
	public void itm_ord_typ(String value) {
		setConstString(offset + 15, $itm_ord_typ, value);
	}


	/**
	 * Order type name オーダ区分名.<p>
	 *
	 */
	public String itm_ord_typ_nm() {
		return getConstString(offset + 16, $itm_ord_typ_nm);
	}

	/**
	 * Order type name オーダ区分名.<p>
	 *
	 */
	public void itm_ord_typ_nm(String value) {
		setConstString(offset + 16, $itm_ord_typ_nm, value);
	}


	/**
	 * Disallow procurement 手配不許可.<p>
	 *
	 */
	public boolean not_fix_flg() {
		return getConstBoolean(offset + 17, $not_fix_flg);
	}

	/**
	 * Disallow procurement 手配不許可.<p>
	 *
	 */
	public void not_fix_flg(boolean value) {
		setConstBoolean(offset + 17, $not_fix_flg, value);
	}


	/**
	 * Mfg. 製造.<p>
	 *
	 */
	public boolean mfg_flg() {
		return getConstBoolean(offset + 18, $mfg_flg);
	}

	/**
	 * Mfg. 製造.<p>
	 *
	 */
	public void mfg_flg(boolean value) {
		setConstBoolean(offset + 18, $mfg_flg, value);
	}


	/**
	 * Subcontracting 外注.<p>
	 *
	 */
	public boolean outsrc_flg() {
		return getConstBoolean(offset + 19, $outsrc_flg);
	}

	/**
	 * Subcontracting 外注.<p>
	 *
	 */
	public void outsrc_flg(boolean value) {
		setConstBoolean(offset + 19, $outsrc_flg, value);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 20, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 20, $mfg_loc_cd, value);
	}


	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public String mfg_loc_nm() {
		return getConstString(offset + 21, $mfg_loc_nm);
	}

	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public void mfg_loc_nm(String value) {
		setConstString(offset + 21, $mfg_loc_nm, value);
	}


	/**
	 * Mfg. location supplier cd. 製造場所発注先ＣＤ.<p>
	 *
	 */
	public String mfg_sppl_cd() {
		return getConstString(offset + 22, $mfg_sppl_cd);
	}

	/**
	 * Mfg. location supplier cd. 製造場所発注先ＣＤ.<p>
	 *
	 */
	public void mfg_sppl_cd(String value) {
		setConstString(offset + 22, $mfg_sppl_cd, value);
	}


	/**
	 * Mfg. location maker cd. 製造場所メーカＣＤ.<p>
	 *
	 */
	public String mfg_maker_cd() {
		return getConstString(offset + 23, $mfg_maker_cd);
	}

	/**
	 * Mfg. location maker cd. 製造場所メーカＣＤ.<p>
	 *
	 */
	public void mfg_maker_cd(String value) {
		setConstString(offset + 23, $mfg_maker_cd, value);
	}


	/**
	 * Master mfg. location cd. マスタ製造場所ＣＤ.<p>
	 *
	 */
	public String mst_mfg_loc_cd() {
		return getConstString(offset + 24, $mst_mfg_loc_cd);
	}

	/**
	 * Master mfg. location cd. マスタ製造場所ＣＤ.<p>
	 *
	 */
	public void mst_mfg_loc_cd(String value) {
		setConstString(offset + 24, $mst_mfg_loc_cd, value);
	}


	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return getConstString(offset + 25, $bom_ptn);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		setConstString(offset + 25, $bom_ptn, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 26, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 26, $sppl_cd, value);
	}


	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 27, $sppl_nm);
	}

	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 27, $sppl_nm, value);
	}


	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 28, $maker_cd);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 28, $maker_cd, value);
	}


	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public String maker_nm() {
		return getConstString(offset + 29, $maker_nm);
	}

	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public void maker_nm(String value) {
		setConstString(offset + 29, $maker_nm, value);
	}


	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public String rqst_loc_cd() {
		return getConstString(offset + 30, $rqst_loc_cd);
	}

	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public void rqst_loc_cd(String value) {
		setConstString(offset + 30, $rqst_loc_cd, value);
	}


	/**
	 * Location name (Requested) 依頼先場所名.<p>
	 *
	 */
	public String rqst_loc_nm() {
		return getConstString(offset + 31, $rqst_loc_nm);
	}

	/**
	 * Location name (Requested) 依頼先場所名.<p>
	 *
	 */
	public void rqst_loc_nm(String value) {
		setConstString(offset + 31, $rqst_loc_nm, value);
	}


	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public String rqst_wg_cd() {
		return getConstString(offset + 32, $rqst_wg_cd);
	}

	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public void rqst_wg_cd(String value) {
		setConstString(offset + 32, $rqst_wg_cd, value);
	}


	/**
	 * Requested WG name 依頼先ワーキンググループ名.<p>
	 *
	 */
	public String rqst_wg_nm() {
		return getConstString(offset + 33, $rqst_wg_nm);
	}

	/**
	 * Requested WG name 依頼先ワーキンググループ名.<p>
	 *
	 */
	public void rqst_wg_nm(String value) {
		setConstString(offset + 33, $rqst_wg_nm, value);
	}


	/**
	 * Yield numerator 歩留分子.<p>
	 *
	 */
	public MCNumber nmr_qty() {
		return getConstNumber(offset + 34, $nmr_qty);
	}

	/**
	 * Yield numerator 歩留分子.<p>
	 *
	 */
	public void nmr_qty(MCNumber value) {
		setConstNumber(offset + 34, $nmr_qty, value);
	}

	/**
	 * Yield numerator 歩留分子.<p>
	 *
	 */
	public void nmr_qty(int value) {
		setConstNumber(offset + 34, $nmr_qty, value);
	}

	/**
	 * Yield numerator 歩留分子.<p>
	 *
	 */
	public void nmr_qty(long value) {
		setConstNumber(offset + 34, $nmr_qty, value);
	}

	/**
	 * Yield numerator 歩留分子.<p>
	 *
	 */
	public void nmr_qty(float value) {
		setConstNumber(offset + 34, $nmr_qty, value);
	}

	/**
	 * Yield numerator 歩留分子.<p>
	 *
	 */
	public void nmr_qty(double value) {
		setConstNumber(offset + 34, $nmr_qty, value);
	}


	/**
	 * Yield denominator 歩留分母.<p>
	 *
	 */
	public MCNumber dnm_qty() {
		return getConstNumber(offset + 35, $dnm_qty);
	}

	/**
	 * Yield denominator 歩留分母.<p>
	 *
	 */
	public void dnm_qty(MCNumber value) {
		setConstNumber(offset + 35, $dnm_qty, value);
	}

	/**
	 * Yield denominator 歩留分母.<p>
	 *
	 */
	public void dnm_qty(int value) {
		setConstNumber(offset + 35, $dnm_qty, value);
	}

	/**
	 * Yield denominator 歩留分母.<p>
	 *
	 */
	public void dnm_qty(long value) {
		setConstNumber(offset + 35, $dnm_qty, value);
	}

	/**
	 * Yield denominator 歩留分母.<p>
	 *
	 */
	public void dnm_qty(float value) {
		setConstNumber(offset + 35, $dnm_qty, value);
	}

	/**
	 * Yield denominator 歩留分母.<p>
	 *
	 */
	public void dnm_qty(double value) {
		setConstNumber(offset + 35, $dnm_qty, value);
	}


	/**
	 * Constant yield qty. 固定歩留数量.<p>
	 *
	 */
	public MCNumber fxd_yield_qty() {
		return getConstNumber(offset + 36, $fxd_yield_qty);
	}

	/**
	 * Constant yield qty. 固定歩留数量.<p>
	 *
	 */
	public void fxd_yield_qty(MCNumber value) {
		setConstNumber(offset + 36, $fxd_yield_qty, value);
	}

	/**
	 * Constant yield qty. 固定歩留数量.<p>
	 *
	 */
	public void fxd_yield_qty(int value) {
		setConstNumber(offset + 36, $fxd_yield_qty, value);
	}

	/**
	 * Constant yield qty. 固定歩留数量.<p>
	 *
	 */
	public void fxd_yield_qty(long value) {
		setConstNumber(offset + 36, $fxd_yield_qty, value);
	}

	/**
	 * Constant yield qty. 固定歩留数量.<p>
	 *
	 */
	public void fxd_yield_qty(float value) {
		setConstNumber(offset + 36, $fxd_yield_qty, value);
	}

	/**
	 * Constant yield qty. 固定歩留数量.<p>
	 *
	 */
	public void fxd_yield_qty(double value) {
		setConstNumber(offset + 36, $fxd_yield_qty, value);
	}


	/**
	 * Unrequired quantity linkage 数量連動不要.<p>
	 *
	 */
	public boolean not_qty_rlt_flg() {
		return getConstBoolean(offset + 37, $not_qty_rlt_flg);
	}

	/**
	 * Unrequired quantity linkage 数量連動不要.<p>
	 *
	 */
	public void not_qty_rlt_flg(boolean value) {
		setConstBoolean(offset + 37, $not_qty_rlt_flg, value);
	}


	public mcframe.clientMAUB.MAUBP0050.QtyR inst_qty_p(){
		return (mcframe.clientMAUB.MAUBP0050.QtyR) getConstInnerRow(offset + 38, $inst_qty_p);
	}
	
	public void inst_qty_p(mcframe.clientMAUB.MAUBP0050.QtyR row){
		setConstInnerRow(offset + 38, $inst_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP0050.QtyR yield_schd_qty_p(){
		return (mcframe.clientMAUB.MAUBP0050.QtyR) getConstInnerRow(offset + 39, $yield_schd_qty_p);
	}
	
	public void yield_schd_qty_p(mcframe.clientMAUB.MAUBP0050.QtyR row){
		setConstInnerRow(offset + 39, $yield_schd_qty_p, row);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 40, $unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 40, $unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String unit_nm() {
		return getConstString(offset + 41, $unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void unit_nm(String value) {
		setConstString(offset + 41, $unit_nm, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 42, $dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 42, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 42, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 42, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 42, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 42, $dec_place, value);
	}


	/**
	 * Rounding type 端数処理区分.<p>
	 *
	 */
	public String rnd_typ() {
		return getConstString(offset + 43, $rnd_typ);
	}

	/**
	 * Rounding type 端数処理区分.<p>
	 *
	 */
	public void rnd_typ(String value) {
		setConstString(offset + 43, $rnd_typ, value);
	}


	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public boolean cont_fctr_flg() {
		return getConstBoolean(offset + 44, $cont_fctr_flg);
	}

	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public void cont_fctr_flg(boolean value) {
		setConstBoolean(offset + 44, $cont_fctr_flg, value);
	}


	/**
	 * Expired date 期限切れ日.<p>
	 *
	 */
	public MCDate lmt_dt() {
		return getConstDate(offset + 45, $lmt_dt);
	}

	/**
	 * Expired date 期限切れ日.<p>
	 *
	 */
	public void lmt_dt(MCDate value) {
		setConstDate(offset + 45, $lmt_dt, value);
	}


	public mcframe.clientMSUB.MSUBP0040.SnoWrkNoR sno_wrk_no_p(){
		return (mcframe.clientMSUB.MSUBP0040.SnoWrkNoR) getConstInnerRow(offset + 46, $sno_wrk_no_p);
	}
	
	public void sno_wrk_no_p(mcframe.clientMSUB.MSUBP0040.SnoWrkNoR row){
		setConstInnerRow(offset + 46, $sno_wrk_no_p, row);
	}


	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return getConstString(offset + 47, $sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		setConstString(offset + 47, $sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return getConstString(offset + 48, $sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		setConstString(offset + 48, $sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return getConstString(offset + 49, $sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		setConstString(offset + 49, $sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return getConstString(offset + 50, $sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		setConstString(offset + 50, $sno4_mng_typ, value);
	}


	/**
	 * For inspection 検査対象.<p>
	 *
	 */
	public boolean insp_flg() {
		return getConstBoolean(offset + 51, $insp_flg);
	}

	/**
	 * For inspection 検査対象.<p>
	 *
	 */
	public void insp_flg(boolean value) {
		setConstBoolean(offset + 51, $insp_flg, value);
	}


	/**
	 * Scheduled PO date 発注予定日.<p>
	 *
	 */
	public MCDate po_schd_dt() {
		return getConstDate(offset + 52, $po_schd_dt);
	}

	/**
	 * Scheduled PO date 発注予定日.<p>
	 *
	 */
	public void po_schd_dt(MCDate value) {
		setConstDate(offset + 52, $po_schd_dt, value);
	}


	/**
	 * Scheduled mfg. start date 製造着手予定日.<p>
	 *
	 */
	public MCDate mfg_st_schd_dt() {
		return getConstDate(offset + 53, $mfg_st_schd_dt);
	}

	/**
	 * Scheduled mfg. start date 製造着手予定日.<p>
	 *
	 */
	public void mfg_st_schd_dt(MCDate value) {
		setConstDate(offset + 53, $mfg_st_schd_dt, value);
	}


	/**
	 * Scheduled mfg. end date 製造終了予定日.<p>
	 *
	 */
	public MCDate mfg_end_schd_dt() {
		return getConstDate(offset + 54, $mfg_end_schd_dt);
	}

	/**
	 * Scheduled mfg. end date 製造終了予定日.<p>
	 *
	 */
	public void mfg_end_schd_dt(MCDate value) {
		setConstDate(offset + 54, $mfg_end_schd_dt, value);
	}


	/**
	 * Scheduled GI date 出庫予定日.<p>
	 *
	 */
	public MCDate gi_schd_dt() {
		return getConstDate(offset + 55, $gi_schd_dt);
	}

	/**
	 * Scheduled GI date 出庫予定日.<p>
	 *
	 */
	public void gi_schd_dt(MCDate value) {
		setConstDate(offset + 55, $gi_schd_dt, value);
	}


	/**
	 * Scheduled storage completion date 格納完了予定日.<p>
	 *
	 */
	public MCDate strg_schd_dt() {
		return getConstDate(offset + 56, $strg_schd_dt);
	}

	/**
	 * Scheduled storage completion date 格納完了予定日.<p>
	 *
	 */
	public void strg_schd_dt(MCDate value) {
		setConstDate(offset + 56, $strg_schd_dt, value);
	}


	/**
	 * Scheduled acceptance date 検収予定日.<p>
	 *
	 */
	public MCDate accpt_schd_dt() {
		return getConstDate(offset + 57, $accpt_schd_dt);
	}

	/**
	 * Scheduled acceptance date 検収予定日.<p>
	 *
	 */
	public void accpt_schd_dt(MCDate value) {
		setConstDate(offset + 57, $accpt_schd_dt, value);
	}


	/**
	 * Scheduled inspection start date 検査着手予定日.<p>
	 *
	 */
	public MCDate insp_st_schd_dt() {
		return getConstDate(offset + 58, $insp_st_schd_dt);
	}

	/**
	 * Scheduled inspection start date 検査着手予定日.<p>
	 *
	 */
	public void insp_st_schd_dt(MCDate value) {
		setConstDate(offset + 58, $insp_st_schd_dt, value);
	}


	/**
	 * Scheduled inspection end date 検査終了予定日.<p>
	 *
	 */
	public MCDate insp_end_schd_dt() {
		return getConstDate(offset + 59, $insp_end_schd_dt);
	}

	/**
	 * Scheduled inspection end date 検査終了予定日.<p>
	 *
	 */
	public void insp_end_schd_dt(MCDate value) {
		setConstDate(offset + 59, $insp_end_schd_dt, value);
	}


	/**
	 * Available date 使用可能予定日.<p>
	 *
	 */
	public MCDate avl_schd_dt() {
		return getConstDate(offset + 60, $avl_schd_dt);
	}

	/**
	 * Available date 使用可能予定日.<p>
	 *
	 */
	public void avl_schd_dt(MCDate value) {
		setConstDate(offset + 60, $avl_schd_dt, value);
	}


	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public String oper_ptn() {
		return getConstString(offset + 61, $oper_ptn);
	}

	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public void oper_ptn(String value) {
		setConstString(offset + 61, $oper_ptn, value);
	}


	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public MCNumber purc_lt() {
		return getConstNumber(offset + 62, $purc_lt);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(MCNumber value) {
		setConstNumber(offset + 62, $purc_lt, value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(int value) {
		setConstNumber(offset + 62, $purc_lt, value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(long value) {
		setConstNumber(offset + 62, $purc_lt, value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(float value) {
		setConstNumber(offset + 62, $purc_lt, value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(double value) {
		setConstNumber(offset + 62, $purc_lt, value);
	}


	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public MCNumber mfg_lt() {
		return getConstNumber(offset + 63, $mfg_lt);
	}

	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public void mfg_lt(MCNumber value) {
		setConstNumber(offset + 63, $mfg_lt, value);
	}

	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public void mfg_lt(int value) {
		setConstNumber(offset + 63, $mfg_lt, value);
	}

	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public void mfg_lt(long value) {
		setConstNumber(offset + 63, $mfg_lt, value);
	}

	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public void mfg_lt(float value) {
		setConstNumber(offset + 63, $mfg_lt, value);
	}

	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public void mfg_lt(double value) {
		setConstNumber(offset + 63, $mfg_lt, value);
	}


	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public MCNumber xfr_lt() {
		return getConstNumber(offset + 64, $xfr_lt);
	}

	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(MCNumber value) {
		setConstNumber(offset + 64, $xfr_lt, value);
	}

	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(int value) {
		setConstNumber(offset + 64, $xfr_lt, value);
	}

	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(long value) {
		setConstNumber(offset + 64, $xfr_lt, value);
	}

	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(float value) {
		setConstNumber(offset + 64, $xfr_lt, value);
	}

	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(double value) {
		setConstNumber(offset + 64, $xfr_lt, value);
	}


	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public MCNumber accpt_insp_lt() {
		return getConstNumber(offset + 65, $accpt_insp_lt);
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(MCNumber value) {
		setConstNumber(offset + 65, $accpt_insp_lt, value);
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(int value) {
		setConstNumber(offset + 65, $accpt_insp_lt, value);
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(long value) {
		setConstNumber(offset + 65, $accpt_insp_lt, value);
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(float value) {
		setConstNumber(offset + 65, $accpt_insp_lt, value);
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(double value) {
		setConstNumber(offset + 65, $accpt_insp_lt, value);
	}


	/**
	 * Inspection LT 検査ＬＴ.<p>
	 *
	 */
	public MCNumber insp_lt() {
		return getConstNumber(offset + 66, $insp_lt);
	}

	/**
	 * Inspection LT 検査ＬＴ.<p>
	 *
	 */
	public void insp_lt(MCNumber value) {
		setConstNumber(offset + 66, $insp_lt, value);
	}

	/**
	 * Inspection LT 検査ＬＴ.<p>
	 *
	 */
	public void insp_lt(int value) {
		setConstNumber(offset + 66, $insp_lt, value);
	}

	/**
	 * Inspection LT 検査ＬＴ.<p>
	 *
	 */
	public void insp_lt(long value) {
		setConstNumber(offset + 66, $insp_lt, value);
	}

	/**
	 * Inspection LT 検査ＬＴ.<p>
	 *
	 */
	public void insp_lt(float value) {
		setConstNumber(offset + 66, $insp_lt, value);
	}

	/**
	 * Inspection LT 検査ＬＴ.<p>
	 *
	 */
	public void insp_lt(double value) {
		setConstNumber(offset + 66, $insp_lt, value);
	}


	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public MCNumber insp_offst() {
		return getConstNumber(offset + 67, $insp_offst);
	}

	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public void insp_offst(MCNumber value) {
		setConstNumber(offset + 67, $insp_offst, value);
	}

	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public void insp_offst(int value) {
		setConstNumber(offset + 67, $insp_offst, value);
	}

	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public void insp_offst(long value) {
		setConstNumber(offset + 67, $insp_offst, value);
	}

	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public void insp_offst(float value) {
		setConstNumber(offset + 67, $insp_offst, value);
	}

	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public void insp_offst(double value) {
		setConstNumber(offset + 67, $insp_offst, value);
	}


	/**
	 * Order auto-firming period (Date) オーダ自動確定期間（日）.<p>
	 *
	 */
	public MCNumber ord_fix_pd() {
		return getConstNumber(offset + 68, $ord_fix_pd);
	}

	/**
	 * Order auto-firming period (Date) オーダ自動確定期間（日）.<p>
	 *
	 */
	public void ord_fix_pd(MCNumber value) {
		setConstNumber(offset + 68, $ord_fix_pd, value);
	}

	/**
	 * Order auto-firming period (Date) オーダ自動確定期間（日）.<p>
	 *
	 */
	public void ord_fix_pd(int value) {
		setConstNumber(offset + 68, $ord_fix_pd, value);
	}

	/**
	 * Order auto-firming period (Date) オーダ自動確定期間（日）.<p>
	 *
	 */
	public void ord_fix_pd(long value) {
		setConstNumber(offset + 68, $ord_fix_pd, value);
	}

	/**
	 * Order auto-firming period (Date) オーダ自動確定期間（日）.<p>
	 *
	 */
	public void ord_fix_pd(float value) {
		setConstNumber(offset + 68, $ord_fix_pd, value);
	}

	/**
	 * Order auto-firming period (Date) オーダ自動確定期間（日）.<p>
	 *
	 */
	public void ord_fix_pd(double value) {
		setConstNumber(offset + 68, $ord_fix_pd, value);
	}


	public mcframe.clientMAUB.MAUBP0350.ContQtyR inst_cont_qty_p(){
		return (mcframe.clientMAUB.MAUBP0350.ContQtyR) getConstInnerRow(offset + 69, $inst_cont_qty_p);
	}
	
	public void inst_cont_qty_p(mcframe.clientMAUB.MAUBP0350.ContQtyR row){
		setConstInnerRow(offset + 69, $inst_cont_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP0350.ContQtyR yield_cont_qty_p(){
		return (mcframe.clientMAUB.MAUBP0350.ContQtyR) getConstInnerRow(offset + 70, $yield_cont_qty_p);
	}
	
	public void yield_cont_qty_p(mcframe.clientMAUB.MAUBP0350.ContQtyR row){
		setConstInnerRow(offset + 70, $yield_cont_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP0360.ContFctrUnitR cont_unit_p(){
		return (mcframe.clientMAUB.MAUBP0360.ContFctrUnitR) getConstInnerRow(offset + 71, $cont_unit_p);
	}
	
	public void cont_unit_p(mcframe.clientMAUB.MAUBP0360.ContFctrUnitR row){
		setConstInnerRow(offset + 71, $cont_unit_p, row);
	}


	public mcframe.clientMAUB.MAUBP0370.StdContFctrR std_cont_p(){
		return (mcframe.clientMAUB.MAUBP0370.StdContFctrR) getConstInnerRow(offset + 72, $std_cont_p);
	}
	
	public void std_cont_p(mcframe.clientMAUB.MAUBP0370.StdContFctrR row){
		setConstInnerRow(offset + 72, $std_cont_p, row);
	}


	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public MCNumber cont_fctr_dec_place() {
		return getConstNumber(offset + 73, $cont_fctr_dec_place);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(MCNumber value) {
		setConstNumber(offset + 73, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(int value) {
		setConstNumber(offset + 73, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(long value) {
		setConstNumber(offset + 73, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(float value) {
		setConstNumber(offset + 73, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(double value) {
		setConstNumber(offset + 73, $cont_fctr_dec_place, value);
	}


	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public String cont_fctr_rnd_typ() {
		return getConstString(offset + 74, $cont_fctr_rnd_typ);
	}

	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public void cont_fctr_rnd_typ(String value) {
		setConstString(offset + 74, $cont_fctr_rnd_typ, value);
	}


	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public boolean ver_flg() {
		return getConstBoolean(offset + 75, $ver_flg);
	}

	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public void ver_flg(boolean value) {
		setConstBoolean(offset + 75, $ver_flg, value);
	}


	/**
	 * Order/PO contact remarks 指図・発注連絡備考.<p>
	 *
	 */
	public String inst_po_cnt_rmrks() {
		return getConstString(offset + 76, $inst_po_cnt_rmrks);
	}

	/**
	 * Order/PO contact remarks 指図・発注連絡備考.<p>
	 *
	 */
	public void inst_po_cnt_rmrks(String value) {
		setConstString(offset + 76, $inst_po_cnt_rmrks, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 77, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 77, $intr_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 78, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 78, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 79, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 79, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 80, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 80, $sub_char3, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 81, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 81, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 82, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 82, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 83, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 83, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 84, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 84, $ins_func_nm, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber itm_order_upd_cntr() {
		return getConstNumber(offset + 85, $itm_order_upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void itm_order_upd_cntr(MCNumber value) {
		setConstNumber(offset + 85, $itm_order_upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void itm_order_upd_cntr(int value) {
		setConstNumber(offset + 85, $itm_order_upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void itm_order_upd_cntr(long value) {
		setConstNumber(offset + 85, $itm_order_upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void itm_order_upd_cntr(float value) {
		setConstNumber(offset + 85, $itm_order_upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void itm_order_upd_cntr(double value) {
		setConstNumber(offset + 85, $itm_order_upd_cntr, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 86, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 86, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 87, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 87, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 88, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 88, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 89, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 89, $upd_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 90, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 90, $ins_ts, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 91, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 91, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 92, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 92, $upd_srv_req_no, value);
	}


	public boolean has_oper() {
		return getConstBoolean(offset + 93, $has_oper);
	}

	public void has_oper(boolean value) {
		setConstBoolean(offset + 93, $has_oper, value);
	}


	public String getString(String name) {
		if ($itm_ord_sts_typ.equalsIgnoreCase(name)) {
			return itm_ord_sts_typ();
		}
		if ($itm_ord_sts_typ_nm.equalsIgnoreCase(name)) {
			return itm_ord_sts_typ_nm();
		}
		if ($itm_ord_sts_typ_old.equalsIgnoreCase(name)) {
			return itm_ord_sts_typ_old();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($rqmt_no.equalsIgnoreCase(name)) {
			return rqmt_no();
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			return strg_loc_cd();
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			return strg_loc_nm();
		}
		if ($strg_site_cd.equalsIgnoreCase(name)) {
			return strg_site_cd();
		}
		if ($strg_site_nm.equalsIgnoreCase(name)) {
			return strg_site_nm();
		}
		if ($strg_sppl_cd.equalsIgnoreCase(name)) {
			return strg_sppl_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($itm_ord_typ.equalsIgnoreCase(name)) {
			return itm_ord_typ();
		}
		if ($itm_ord_typ_nm.equalsIgnoreCase(name)) {
			return itm_ord_typ_nm();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($mfg_sppl_cd.equalsIgnoreCase(name)) {
			return mfg_sppl_cd();
		}
		if ($mfg_maker_cd.equalsIgnoreCase(name)) {
			return mfg_maker_cd();
		}
		if ($mst_mfg_loc_cd.equalsIgnoreCase(name)) {
			return mst_mfg_loc_cd();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			return maker_nm();
		}
		if ($rqst_loc_cd.equalsIgnoreCase(name)) {
			return rqst_loc_cd();
		}
		if ($rqst_loc_nm.equalsIgnoreCase(name)) {
			return rqst_loc_nm();
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			return rqst_wg_cd();
		}
		if ($rqst_wg_nm.equalsIgnoreCase(name)) {
			return rqst_wg_nm();
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
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			return sno1_mng_typ();
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			return sno2_mng_typ();
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			return sno3_mng_typ();
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			return sno4_mng_typ();
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			return oper_ptn();
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			return cont_fctr_rnd_typ();
		}
		if ($inst_po_cnt_rmrks.equalsIgnoreCase(name)) {
			return inst_po_cnt_rmrks();
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
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($nmr_qty.equalsIgnoreCase(name)) {
			return nmr_qty();
		}
		if ($dnm_qty.equalsIgnoreCase(name)) {
			return dnm_qty();
		}
		if ($fxd_yield_qty.equalsIgnoreCase(name)) {
			return fxd_yield_qty();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
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
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		if ($itm_order_upd_cntr.equalsIgnoreCase(name)) {
			return itm_order_upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($master_dt.equalsIgnoreCase(name)) {
			return master_dt();
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			return lmt_dt();
		}
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
	public MCTimestamp getTimestamp(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestamp(name);
	}
	public boolean getBoolean(String name) {
		if ($not_fix_flg.equalsIgnoreCase(name)) {
			return not_fix_flg();
		}
		if ($mfg_flg.equalsIgnoreCase(name)) {
			return mfg_flg();
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			return outsrc_flg();
		}
		if ($not_qty_rlt_flg.equalsIgnoreCase(name)) {
			return not_qty_rlt_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($insp_flg.equalsIgnoreCase(name)) {
			return insp_flg();
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		if ($has_oper.equalsIgnoreCase(name)) {
			return has_oper();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($itm_ord_sts_typ.equalsIgnoreCase(name)) {
			return itm_ord_sts_typ();
		}
		if ($itm_ord_sts_typ_nm.equalsIgnoreCase(name)) {
			return itm_ord_sts_typ_nm();
		}
		if ($itm_ord_sts_typ_old.equalsIgnoreCase(name)) {
			return itm_ord_sts_typ_old();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($rqmt_no.equalsIgnoreCase(name)) {
			return rqmt_no();
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			return strg_loc_cd();
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			return strg_loc_nm();
		}
		if ($strg_site_cd.equalsIgnoreCase(name)) {
			return strg_site_cd();
		}
		if ($strg_site_nm.equalsIgnoreCase(name)) {
			return strg_site_nm();
		}
		if ($strg_sppl_cd.equalsIgnoreCase(name)) {
			return strg_sppl_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($itm_ord_typ.equalsIgnoreCase(name)) {
			return itm_ord_typ();
		}
		if ($itm_ord_typ_nm.equalsIgnoreCase(name)) {
			return itm_ord_typ_nm();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($mfg_sppl_cd.equalsIgnoreCase(name)) {
			return mfg_sppl_cd();
		}
		if ($mfg_maker_cd.equalsIgnoreCase(name)) {
			return mfg_maker_cd();
		}
		if ($mst_mfg_loc_cd.equalsIgnoreCase(name)) {
			return mst_mfg_loc_cd();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			return maker_nm();
		}
		if ($rqst_loc_cd.equalsIgnoreCase(name)) {
			return rqst_loc_cd();
		}
		if ($rqst_loc_nm.equalsIgnoreCase(name)) {
			return rqst_loc_nm();
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			return rqst_wg_cd();
		}
		if ($rqst_wg_nm.equalsIgnoreCase(name)) {
			return rqst_wg_nm();
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
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			return sno1_mng_typ();
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			return sno2_mng_typ();
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			return sno3_mng_typ();
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			return sno4_mng_typ();
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			return oper_ptn();
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			return cont_fctr_rnd_typ();
		}
		if ($inst_po_cnt_rmrks.equalsIgnoreCase(name)) {
			return inst_po_cnt_rmrks();
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
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($nmr_qty.equalsIgnoreCase(name)) {
			return nmr_qty();
		}
		if ($dnm_qty.equalsIgnoreCase(name)) {
			return dnm_qty();
		}
		if ($fxd_yield_qty.equalsIgnoreCase(name)) {
			return fxd_yield_qty();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
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
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		if ($itm_order_upd_cntr.equalsIgnoreCase(name)) {
			return itm_order_upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($master_dt.equalsIgnoreCase(name)) {
			return master_dt();
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			return lmt_dt();
		}
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
	public MCTimestamp getTimestampNE(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestampNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($not_fix_flg.equalsIgnoreCase(name)) {
			return not_fix_flg();
		}
		if ($mfg_flg.equalsIgnoreCase(name)) {
			return mfg_flg();
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			return outsrc_flg();
		}
		if ($not_qty_rlt_flg.equalsIgnoreCase(name)) {
			return not_qty_rlt_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($insp_flg.equalsIgnoreCase(name)) {
			return insp_flg();
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		if ($has_oper.equalsIgnoreCase(name)) {
			return has_oper();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($itm_ord_sts_typ.equalsIgnoreCase(name)) {
			itm_ord_sts_typ(value);
			return;
		}
		if ($itm_ord_sts_typ_nm.equalsIgnoreCase(name)) {
			itm_ord_sts_typ_nm(value);
			return;
		}
		if ($itm_ord_sts_typ_old.equalsIgnoreCase(name)) {
			itm_ord_sts_typ_old(value);
			return;
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
			return;
		}
		if ($rqmt_no.equalsIgnoreCase(name)) {
			rqmt_no(value);
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
		if ($strg_site_cd.equalsIgnoreCase(name)) {
			strg_site_cd(value);
			return;
		}
		if ($strg_site_nm.equalsIgnoreCase(name)) {
			strg_site_nm(value);
			return;
		}
		if ($strg_sppl_cd.equalsIgnoreCase(name)) {
			strg_sppl_cd(value);
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
		if ($itm_ord_typ.equalsIgnoreCase(name)) {
			itm_ord_typ(value);
			return;
		}
		if ($itm_ord_typ_nm.equalsIgnoreCase(name)) {
			itm_ord_typ_nm(value);
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
		if ($mfg_sppl_cd.equalsIgnoreCase(name)) {
			mfg_sppl_cd(value);
			return;
		}
		if ($mfg_maker_cd.equalsIgnoreCase(name)) {
			mfg_maker_cd(value);
			return;
		}
		if ($mst_mfg_loc_cd.equalsIgnoreCase(name)) {
			mst_mfg_loc_cd(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			maker_nm(value);
			return;
		}
		if ($rqst_loc_cd.equalsIgnoreCase(name)) {
			rqst_loc_cd(value);
			return;
		}
		if ($rqst_loc_nm.equalsIgnoreCase(name)) {
			rqst_loc_nm(value);
			return;
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			rqst_wg_cd(value);
			return;
		}
		if ($rqst_wg_nm.equalsIgnoreCase(name)) {
			rqst_wg_nm(value);
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
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			sno1_mng_typ(value);
			return;
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			sno2_mng_typ(value);
			return;
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			sno3_mng_typ(value);
			return;
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			sno4_mng_typ(value);
			return;
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			oper_ptn(value);
			return;
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			cont_fctr_rnd_typ(value);
			return;
		}
		if ($inst_po_cnt_rmrks.equalsIgnoreCase(name)) {
			inst_po_cnt_rmrks(value);
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
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
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
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
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
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($itm_order_upd_cntr.equalsIgnoreCase(name)) {
			itm_order_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
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
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
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
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($itm_order_upd_cntr.equalsIgnoreCase(name)) {
			itm_order_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
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
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
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
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($itm_order_upd_cntr.equalsIgnoreCase(name)) {
			itm_order_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
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
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
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
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($itm_order_upd_cntr.equalsIgnoreCase(name)) {
			itm_order_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
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
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
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
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($itm_order_upd_cntr.equalsIgnoreCase(name)) {
			itm_order_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($master_dt.equalsIgnoreCase(name)) {
			master_dt(value);
			return;
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			lmt_dt(value);
			return;
		}
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
	public void setTimestamp(String name, MCTimestamp value) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		super.setTimestamp(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($not_fix_flg.equalsIgnoreCase(name)) {
			not_fix_flg(value);
			return;
		}
		if ($mfg_flg.equalsIgnoreCase(name)) {
			mfg_flg(value);
			return;
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			outsrc_flg(value);
			return;
		}
		if ($not_qty_rlt_flg.equalsIgnoreCase(name)) {
			not_qty_rlt_flg(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($insp_flg.equalsIgnoreCase(name)) {
			insp_flg(value);
			return;
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		if ($has_oper.equalsIgnoreCase(name)) {
			has_oper(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($itm_ord_sts_typ.equalsIgnoreCase(name)) {
			itm_ord_sts_typ(value);
			return;
		}
		if ($itm_ord_sts_typ_nm.equalsIgnoreCase(name)) {
			itm_ord_sts_typ_nm(value);
			return;
		}
		if ($itm_ord_sts_typ_old.equalsIgnoreCase(name)) {
			itm_ord_sts_typ_old(value);
			return;
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
			return;
		}
		if ($rqmt_no.equalsIgnoreCase(name)) {
			rqmt_no(value);
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
		if ($strg_site_cd.equalsIgnoreCase(name)) {
			strg_site_cd(value);
			return;
		}
		if ($strg_site_nm.equalsIgnoreCase(name)) {
			strg_site_nm(value);
			return;
		}
		if ($strg_sppl_cd.equalsIgnoreCase(name)) {
			strg_sppl_cd(value);
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
		if ($itm_ord_typ.equalsIgnoreCase(name)) {
			itm_ord_typ(value);
			return;
		}
		if ($itm_ord_typ_nm.equalsIgnoreCase(name)) {
			itm_ord_typ_nm(value);
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
		if ($mfg_sppl_cd.equalsIgnoreCase(name)) {
			mfg_sppl_cd(value);
			return;
		}
		if ($mfg_maker_cd.equalsIgnoreCase(name)) {
			mfg_maker_cd(value);
			return;
		}
		if ($mst_mfg_loc_cd.equalsIgnoreCase(name)) {
			mst_mfg_loc_cd(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			maker_nm(value);
			return;
		}
		if ($rqst_loc_cd.equalsIgnoreCase(name)) {
			rqst_loc_cd(value);
			return;
		}
		if ($rqst_loc_nm.equalsIgnoreCase(name)) {
			rqst_loc_nm(value);
			return;
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			rqst_wg_cd(value);
			return;
		}
		if ($rqst_wg_nm.equalsIgnoreCase(name)) {
			rqst_wg_nm(value);
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
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			sno1_mng_typ(value);
			return;
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			sno2_mng_typ(value);
			return;
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			sno3_mng_typ(value);
			return;
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			sno4_mng_typ(value);
			return;
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			oper_ptn(value);
			return;
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			cont_fctr_rnd_typ(value);
			return;
		}
		if ($inst_po_cnt_rmrks.equalsIgnoreCase(name)) {
			inst_po_cnt_rmrks(value);
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
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
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
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
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
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($itm_order_upd_cntr.equalsIgnoreCase(name)) {
			itm_order_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
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
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
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
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($itm_order_upd_cntr.equalsIgnoreCase(name)) {
			itm_order_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
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
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
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
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($itm_order_upd_cntr.equalsIgnoreCase(name)) {
			itm_order_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
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
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
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
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($itm_order_upd_cntr.equalsIgnoreCase(name)) {
			itm_order_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
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
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
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
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($itm_order_upd_cntr.equalsIgnoreCase(name)) {
			itm_order_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($master_dt.equalsIgnoreCase(name)) {
			master_dt(value);
			return;
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			lmt_dt(value);
			return;
		}
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
	public void setTimestampNE(String name, MCTimestamp value) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		super.setTimestampNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($not_fix_flg.equalsIgnoreCase(name)) {
			not_fix_flg(value);
			return;
		}
		if ($mfg_flg.equalsIgnoreCase(name)) {
			mfg_flg(value);
			return;
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			outsrc_flg(value);
			return;
		}
		if ($not_qty_rlt_flg.equalsIgnoreCase(name)) {
			not_qty_rlt_flg(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($insp_flg.equalsIgnoreCase(name)) {
			insp_flg(value);
			return;
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		if ($has_oper.equalsIgnoreCase(name)) {
			has_oper(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($ver_no_p.equalsIgnoreCase(name)) {
			return ver_no_p();
		}
		if ($inst_qty_p.equalsIgnoreCase(name)) {
			return inst_qty_p();
		}
		if ($yield_schd_qty_p.equalsIgnoreCase(name)) {
			return yield_schd_qty_p();
		}
		if ($sno_wrk_no_p.equalsIgnoreCase(name)) {
			return sno_wrk_no_p();
		}
		if ($inst_cont_qty_p.equalsIgnoreCase(name)) {
			return inst_cont_qty_p();
		}
		if ($yield_cont_qty_p.equalsIgnoreCase(name)) {
			return yield_cont_qty_p();
		}
		if ($cont_unit_p.equalsIgnoreCase(name)) {
			return cont_unit_p();
		}
		if ($std_cont_p.equalsIgnoreCase(name)) {
			return std_cont_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($itm_p.equalsIgnoreCase(name)) {
			itm_p(
				((MCContainerMeta) itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0030.ItmR.class, value)
			);
			return;
		}
		if ($ver_no_p.equalsIgnoreCase(name)) {
			ver_no_p(
				((MCContainerMeta) ver_no_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0340.VerNoR.class, value)
			);
			return;
		}
		if ($inst_qty_p.equalsIgnoreCase(name)) {
			inst_qty_p(
				((MCContainerMeta) inst_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0050.QtyR.class, value)
			);
			return;
		}
		if ($yield_schd_qty_p.equalsIgnoreCase(name)) {
			yield_schd_qty_p(
				((MCContainerMeta) yield_schd_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0050.QtyR.class, value)
			);
			return;
		}
		if ($sno_wrk_no_p.equalsIgnoreCase(name)) {
			sno_wrk_no_p(
				((MCContainerMeta) sno_wrk_no_p_META).castInnerRow(mcframe.clientMSUB.MSUBP0040.SnoWrkNoR.class, value)
			);
			return;
		}
		if ($inst_cont_qty_p.equalsIgnoreCase(name)) {
			inst_cont_qty_p(
				((MCContainerMeta) inst_cont_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0350.ContQtyR.class, value)
			);
			return;
		}
		if ($yield_cont_qty_p.equalsIgnoreCase(name)) {
			yield_cont_qty_p(
				((MCContainerMeta) yield_cont_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0350.ContQtyR.class, value)
			);
			return;
		}
		if ($cont_unit_p.equalsIgnoreCase(name)) {
			cont_unit_p(
				((MCContainerMeta) cont_unit_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0360.ContFctrUnitR.class, value)
			);
			return;
		}
		if ($std_cont_p.equalsIgnoreCase(name)) {
			std_cont_p(
				((MCContainerMeta) std_cont_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0370.StdContFctrR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public String itm_cd() {
		return itm_p().itm_cd();
	}

	public void itm_cd(String value) {
		itm_p().itm_cd(value);
	}

	public String itm_sub1() {
		return itm_p().itm_sub1();
	}

	public void itm_sub1(String value) {
		itm_p().itm_sub1(value);
	}

	public String itm_sub2() {
		return itm_p().itm_sub2();
	}

	public void itm_sub2(String value) {
		itm_p().itm_sub2(value);
	}

	public String itm_sub3() {
		return itm_p().itm_sub3();
	}

	public void itm_sub3(String value) {
		itm_p().itm_sub3(value);
	}

	public String itm_nm() {
		return itm_p().itm_nm();
	}

	public void itm_nm(String value) {
		itm_p().itm_nm(value);
	}

	public String ver_no() {
		return ver_no_p().ver_no();
	}

	public void ver_no(String value) {
		ver_no_p().ver_no(value);
	}

	/**
	 * Order scheduled qty. 指図予定数量.<p>
	 *
	 */
	public MCNumber inst_qty() {
		return inst_qty_p().qty();
	}

	/**
	 * Order scheduled qty. 指図予定数量.<p>
	 *
	 */
	public void inst_qty(MCNumber value) {
		inst_qty_p().qty(value);
	}

	/**
	 * Order scheduled qty. 指図予定数量.<p>
	 *
	 */
	public void inst_qty(int value) {
		inst_qty_p().qty(value);
	}

	/**
	 * Order scheduled qty. 指図予定数量.<p>
	 *
	 */
	public void inst_qty(long value) {
		inst_qty_p().qty(value);
	}

	/**
	 * Order scheduled qty. 指図予定数量.<p>
	 *
	 */
	public void inst_qty(float value) {
		inst_qty_p().qty(value);
	}

	/**
	 * Order scheduled qty. 指図予定数量.<p>
	 *
	 */
	public void inst_qty(double value) {
		inst_qty_p().qty(value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public MCNumber yield_schd_qty() {
		return yield_schd_qty_p().qty();
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void yield_schd_qty(MCNumber value) {
		yield_schd_qty_p().qty(value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void yield_schd_qty(int value) {
		yield_schd_qty_p().qty(value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void yield_schd_qty(long value) {
		yield_schd_qty_p().qty(value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void yield_schd_qty(float value) {
		yield_schd_qty_p().qty(value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void yield_schd_qty(double value) {
		yield_schd_qty_p().qty(value);
	}

	public String sno1() {
		return sno_wrk_no_p().sno1();
	}

	public void sno1(String value) {
		sno_wrk_no_p().sno1(value);
	}

	public String sno2() {
		return sno_wrk_no_p().sno2();
	}

	public void sno2(String value) {
		sno_wrk_no_p().sno2(value);
	}

	public String sno3() {
		return sno_wrk_no_p().sno3();
	}

	public void sno3(String value) {
		sno_wrk_no_p().sno3(value);
	}

	public String sno4() {
		return sno_wrk_no_p().sno4();
	}

	public void sno4(String value) {
		sno_wrk_no_p().sno4(value);
	}

	public String wrk_no() {
		return sno_wrk_no_p().wrk_no();
	}

	public void wrk_no(String value) {
		sno_wrk_no_p().wrk_no(value);
	}

	public String wrk_nm() {
		return sno_wrk_no_p().wrk_nm();
	}

	public void wrk_nm(String value) {
		sno_wrk_no_p().wrk_nm(value);
	}

	/**
	 * Active ingredient (Order scheduled qty.) 有効成分(指図予定数量).<p>
	 *
	 */
	public MCNumber cont_fctr_inst_qty() {
		return inst_cont_qty_p().cont_qty();
	}

	/**
	 * Active ingredient (Order scheduled qty.) 有効成分(指図予定数量).<p>
	 *
	 */
	public void cont_fctr_inst_qty(MCNumber value) {
		inst_cont_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Order scheduled qty.) 有効成分(指図予定数量).<p>
	 *
	 */
	public void cont_fctr_inst_qty(int value) {
		inst_cont_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Order scheduled qty.) 有効成分(指図予定数量).<p>
	 *
	 */
	public void cont_fctr_inst_qty(long value) {
		inst_cont_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Order scheduled qty.) 有効成分(指図予定数量).<p>
	 *
	 */
	public void cont_fctr_inst_qty(float value) {
		inst_cont_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Order scheduled qty.) 有効成分(指図予定数量).<p>
	 *
	 */
	public void cont_fctr_inst_qty(double value) {
		inst_cont_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Output scheduled qty.) 有効成分(出来高予定数量).<p>
	 *
	 */
	public MCNumber cont_fctr_schd_yield() {
		return yield_cont_qty_p().cont_qty();
	}

	/**
	 * Active ingredient (Output scheduled qty.) 有効成分(出来高予定数量).<p>
	 *
	 */
	public void cont_fctr_schd_yield(MCNumber value) {
		yield_cont_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Output scheduled qty.) 有効成分(出来高予定数量).<p>
	 *
	 */
	public void cont_fctr_schd_yield(int value) {
		yield_cont_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Output scheduled qty.) 有効成分(出来高予定数量).<p>
	 *
	 */
	public void cont_fctr_schd_yield(long value) {
		yield_cont_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Output scheduled qty.) 有効成分(出来高予定数量).<p>
	 *
	 */
	public void cont_fctr_schd_yield(float value) {
		yield_cont_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Output scheduled qty.) 有効成分(出来高予定数量).<p>
	 *
	 */
	public void cont_fctr_schd_yield(double value) {
		yield_cont_qty_p().cont_qty(value);
	}

	public String cont_fctr_unit_cd() {
		return cont_unit_p().cont_fctr_unit_cd();
	}

	public void cont_fctr_unit_cd(String value) {
		cont_unit_p().cont_fctr_unit_cd(value);
	}

	public String cont_fctr_unit_nm() {
		return cont_unit_p().cont_fctr_unit_nm();
	}

	public void cont_fctr_unit_nm(String value) {
		cont_unit_p().cont_fctr_unit_nm(value);
	}

	public MCNumber std_cont_fctr() {
		return std_cont_p().std_cont_fctr();
	}

	public void std_cont_fctr(MCNumber value) {
		std_cont_p().std_cont_fctr(value);
	}

	public void std_cont_fctr(int value) {
		std_cont_p().std_cont_fctr(value);
	}

	public void std_cont_fctr(long value) {
		std_cont_p().std_cont_fctr(value);
	}

	public void std_cont_fctr(float value) {
		std_cont_p().std_cont_fctr(value);
	}

	public void std_cont_fctr(double value) {
		std_cont_p().std_cont_fctr(value);
	}

}

