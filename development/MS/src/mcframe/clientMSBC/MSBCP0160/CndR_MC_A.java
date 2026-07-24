package mcframe.clientMSBC.MSBCP0160;

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
 * ブロック"Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class CndR_MC_A extends MCConstRow {

	/**
	 * OPN,Apply;EXP,Undo application;REF,View OPN,反映する;EXP,反映解除する;REF,参照する.<p>
	 *
	 */
	public static final String $ope = "ope";
	/**
	 * Not applied 未反映.<p>
	 *
	 */
	public static final String $opn = "opn";
	/**
	 * Applied 反映済.<p>
	 *
	 */
	public static final String $exp = "exp";
	/**
	 * Mfg. 製造.<p>
	 *
	 */
	public static final String $mfg_flg = "mfg_flg";
	/**
	 * Purchase 購買.<p>
	 *
	 */
	public static final String $purc_flg = "purc_flg";
	/**
	 * Subcontracting 外注.<p>
	 *
	 */
	public static final String $outsrc_flg = "outsrc_flg";
	/**
	 * Transport 移送.<p>
	 *
	 */
	public static final String $xfr_flg = "xfr_flg";
	/**
	 * Transport between WG ワーキンググループ間移送.<p>
	 *
	 */
	public static final String $wg_xfr_flg = "wg_xfr_flg";
	/**
	 * Disallow procurement 手配不許可.<p>
	 *
	 */
	public static final String $true_not_fix_flg = "true_not_fix_flg";
	/**
	 * Allow procurement 手配許可.<p>
	 *
	 */
	public static final String $false_not_fix_flg = "false_not_fix_flg";
	/**
	 * Scheduled mfg. start date FROM 製造着手予定日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $mfg_st_schd_dt_fr = "mfg_st_schd_dt_fr";
	/**
	 * Scheduled mfg. start date TO 製造着手予定日ＴＯ.<p>
	 *
	 */
	public static final String $mfg_st_schd_dt_to = "mfg_st_schd_dt_to";
	/**
	 * Scheduled mfg. end date FROM 製造終了予定日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $mfg_end_schd_dt_fr = "mfg_end_schd_dt_fr";
	/**
	 * Scheduled mfg. end date TO 製造終了予定日ＴＯ.<p>
	 *
	 */
	public static final String $mfg_end_schd_dt_to = "mfg_end_schd_dt_to";
	/**
	 * Scheduled PO date FROM 発注予定日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $po_schd_dt_fr = "po_schd_dt_fr";
	/**
	 * Scheduled PO date TO 発注予定日ＴＯ.<p>
	 *
	 */
	public static final String $po_schd_dt_to = "po_schd_dt_to";
	/**
	 * Scheduled GI date FROM 出庫予定日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $gi_schd_dt_fr = "gi_schd_dt_fr";
	/**
	 * Scheduled GI date TO 出庫予定日ＴＯ.<p>
	 *
	 */
	public static final String $gi_schd_dt_to = "gi_schd_dt_to";
	/**
	 * Available FROM 使用可能予定日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $avl_schd_dt_fr = "avl_schd_dt_fr";
	/**
	 * Available TO 使用可能予定日ＴＯ.<p>
	 *
	 */
	public static final String $avl_schd_dt_to = "avl_schd_dt_to";
	/**
	 * Scheduled storage completion date FROM 格納完了予定日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $strg_schd_dt_fr = "strg_schd_dt_fr";
	/**
	 * Scheduled storage completion date TO 格納完了予定日ＴＯ.<p>
	 *
	 */
	public static final String $strg_schd_dt_to = "strg_schd_dt_to";
	/**
	 * Scheduled acceptance date FROM 検収予定日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $accpt_schd_dt_fr = "accpt_schd_dt_fr";
	/**
	 * Scheduled acceptance date TO 検収予定日ＴＯ.<p>
	 *
	 */
	public static final String $accpt_schd_dt_to = "accpt_schd_dt_to";
	/**
	 * Scheduled inspection start date FROM 検査着手予定日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $insp_st_schd_dt_fr = "insp_st_schd_dt_fr";
	/**
	 * Scheduled inspection start date TO 検査着手予定日ＴＯ.<p>
	 *
	 */
	public static final String $insp_st_schd_dt_to = "insp_st_schd_dt_to";
	/**
	 * Scheduled inspection end date FROM 検査終了予定日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $insp_end_schd_dt_fr = "insp_end_schd_dt_fr";
	/**
	 * Scheduled inspection end date TO 検査終了予定日ＴＯ.<p>
	 *
	 */
	public static final String $insp_end_schd_dt_to = "insp_end_schd_dt_to";
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
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public static final String $strg_alloc_grp_cd = "strg_alloc_grp_cd";
	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public static final String $strg_alloc_grp_nm = "strg_alloc_grp_nm";
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
	public static final String $itm_typ_p = "itm_typ_p";
	/**
	 * Order generation type オーダ生成区分.<p>
	 *
	 */
	public static final String $ord_gnrt_typ = "ord_gnrt_typ";
	/**
	 * Order generation type name オーダ生成区分名.<p>
	 *
	 */
	public static final String $ord_gnrt_typ_nm = "ord_gnrt_typ_nm";
	public static final String $itm_p = "itm_p";
	public static final String $ver_no_p = "ver_no_p";
	public static final String $sno_wrk_no_p = "sno_wrk_no_p";
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
	/**
	 * Simulation No. シミュレーションＮＯ.<p>
	 *
	 */
	public static final String $sim_mrp_no = "sim_mrp_no";
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
	public static final String $itm_grp_p = "itm_grp_p";

	public static final String $itm_typ = $itm_typ_p + ".itm_typ";
	public static final String $itm_typ_d_cd = $itm_typ_p + ".itm_typ_d_cd";
	public static final String $itm_typ_d_nm = $itm_typ_p + ".itm_typ_d_nm";
	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $ver_no = $ver_no_p + ".ver_no";
	public static final String $sno1 = $sno_wrk_no_p + ".sno1";
	public static final String $sno2 = $sno_wrk_no_p + ".sno2";
	public static final String $sno3 = $sno_wrk_no_p + ".sno3";
	public static final String $sno4 = $sno_wrk_no_p + ".sno4";
	public static final String $wrk_no = $sno_wrk_no_p + ".wrk_no";
	public static final String $wrk_nm = $sno_wrk_no_p + ".wrk_nm";
	public static final String $itm_grp_flg1 = $itm_grp_p + ".itm_grp_flg1";
	public static final String $itm_grp_cd1 = $itm_grp_p + ".itm_grp_cd1";
	public static final String $itm_grp_nm1 = $itm_grp_p + ".itm_grp_nm1";
	public static final String $itm_grp_flg2 = $itm_grp_p + ".itm_grp_flg2";
	public static final String $itm_grp_cd2 = $itm_grp_p + ".itm_grp_cd2";
	public static final String $itm_grp_nm2 = $itm_grp_p + ".itm_grp_nm2";
	public static final String $itm_grp_flg3 = $itm_grp_p + ".itm_grp_flg3";
	public static final String $itm_grp_cd3 = $itm_grp_p + ".itm_grp_cd3";
	public static final String $itm_grp_nm3 = $itm_grp_p + ".itm_grp_nm3";
	public static final String $itm_grp_flg4 = $itm_grp_p + ".itm_grp_flg4";
	public static final String $itm_grp_cd4 = $itm_grp_p + ".itm_grp_cd4";
	public static final String $itm_grp_nm4 = $itm_grp_p + ".itm_grp_nm4";
	public static final String $itm_grp_flg5 = $itm_grp_p + ".itm_grp_flg5";
	public static final String $itm_grp_cd5 = $itm_grp_p + ".itm_grp_cd5";
	public static final String $itm_grp_nm5 = $itm_grp_p + ".itm_grp_nm5";
	public static final String $itm_grp_flg6 = $itm_grp_p + ".itm_grp_flg6";
	public static final String $itm_grp_cd6 = $itm_grp_p + ".itm_grp_cd6";
	public static final String $itm_grp_nm6 = $itm_grp_p + ".itm_grp_nm6";
	public static final String $itm_grp_flg7 = $itm_grp_p + ".itm_grp_flg7";
	public static final String $itm_grp_cd7 = $itm_grp_p + ".itm_grp_cd7";
	public static final String $itm_grp_nm7 = $itm_grp_p + ".itm_grp_nm7";
	public static final String $itm_grp_flg8 = $itm_grp_p + ".itm_grp_flg8";
	public static final String $itm_grp_cd8 = $itm_grp_p + ".itm_grp_cd8";
	public static final String $itm_grp_nm8 = $itm_grp_p + ".itm_grp_nm8";
	public static final String $itm_grp_flg9 = $itm_grp_p + ".itm_grp_flg9";
	public static final String $itm_grp_cd9 = $itm_grp_p + ".itm_grp_cd9";
	public static final String $itm_grp_nm9 = $itm_grp_p + ".itm_grp_nm9";
	public static final String $itm_grp_flg10 = $itm_grp_p + ".itm_grp_flg10";
	public static final String $itm_grp_cd10 = $itm_grp_p + ".itm_grp_cd10";
	public static final String $itm_grp_nm10 = $itm_grp_p + ".itm_grp_nm10";

	public static final MCMeta ope_META = createStringMeta($ope);
	public static final MCMeta opn_META = createCommonMeta($opn, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta exp_META = createCommonMeta($exp, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_flg_META = createCommonMeta($mfg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_flg_META = createCommonMeta($purc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta outsrc_flg_META = createCommonMeta($outsrc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta xfr_flg_META = createCommonMeta($xfr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wg_xfr_flg_META = createCommonMeta($wg_xfr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta true_not_fix_flg_META = createCommonMeta($true_not_fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta false_not_fix_flg_META = createCommonMeta($false_not_fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_st_schd_dt_fr_META = createCommonMeta($mfg_st_schd_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mfg_st_schd_dt_to_META = createCommonMeta($mfg_st_schd_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mfg_end_schd_dt_fr_META = createCommonMeta($mfg_end_schd_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mfg_end_schd_dt_to_META = createCommonMeta($mfg_end_schd_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta po_schd_dt_fr_META = createCommonMeta($po_schd_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta po_schd_dt_to_META = createCommonMeta($po_schd_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta gi_schd_dt_fr_META = createCommonMeta($gi_schd_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta gi_schd_dt_to_META = createCommonMeta($gi_schd_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta avl_schd_dt_fr_META = createCommonMeta($avl_schd_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta avl_schd_dt_to_META = createCommonMeta($avl_schd_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta strg_schd_dt_fr_META = createCommonMeta($strg_schd_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta strg_schd_dt_to_META = createCommonMeta($strg_schd_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta accpt_schd_dt_fr_META = createCommonMeta($accpt_schd_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta accpt_schd_dt_to_META = createCommonMeta($accpt_schd_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta insp_st_schd_dt_fr_META = createCommonMeta($insp_st_schd_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta insp_st_schd_dt_to_META = createCommonMeta($insp_st_schd_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta insp_end_schd_dt_fr_META = createCommonMeta($insp_end_schd_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta insp_end_schd_dt_to_META = createCommonMeta($insp_end_schd_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta rqst_wg_cd_META = createCommonMeta($rqst_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta rqst_wg_nm_META = createCommonMeta($rqst_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta strg_alloc_grp_cd_META = createCommonMeta($strg_alloc_grp_cd, mcframe.commonMA.meta.MA_META.ALLOC_GRP_CD);
	public static final MCMeta strg_alloc_grp_nm_META = createCommonMeta($strg_alloc_grp_nm, mcframe.commonMA.meta.MA_META.ALLOC_GRP_NM);
	public static final MCMeta mfg_loc_grp_cd_META = createCommonMeta($mfg_loc_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta mfg_loc_grp_nm_META = createCommonMeta($mfg_loc_grp_nm, mcframe.commonMA.meta.MA_META.LOC_GRP_NM);
	public static final MCMeta strg_loc_cd_META = createCommonMeta($strg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta strg_loc_nm_META = createCommonMeta($strg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta strg_site_cd_META = createCommonMeta($strg_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta strg_site_nm_META = createCommonMeta($strg_site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta strg_lg_grp_cd_META = createCommonMeta($strg_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta strg_lg_grp_nm_META = createCommonMeta($strg_lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta strg_loc_grp_cd_META = createCommonMeta($strg_loc_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta strg_loc_grp_nm_META = createCommonMeta($strg_loc_grp_nm, mcframe.commonMA.meta.MA_META.LOC_GRP_NM);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta mfg_loc_nm_META = createCommonMeta($mfg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta mfg_site_cd_META = createCommonMeta($mfg_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta mfg_site_nm_META = createCommonMeta($mfg_site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta rqst_loc_cd_META = createCommonMeta($rqst_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta rqst_loc_nm_META = createCommonMeta($rqst_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta rqst_site_cd_META = createCommonMeta($rqst_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta rqst_site_nm_META = createCommonMeta($rqst_site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta rqst_loc_grp_cd_META = createCommonMeta($rqst_loc_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta rqst_loc_grp_nm_META = createCommonMeta($rqst_loc_grp_nm, mcframe.commonMA.meta.MA_META.LOC_GRP_NM);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta maker_cd_META = createCommonMeta($maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta maker_nm_META = createCommonMeta($maker_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta itm_typ_p_META = createInnerRowMeta($itm_typ_p, mcframe.clientMAUB.MAUBP0100.ItmTypR.class);
	public static final MCMeta ord_gnrt_typ_META = createCommonMeta($ord_gnrt_typ, mcframe.commonMS.meta.MS_META.ORD_GNRT_TYP);
	public static final MCMeta ord_gnrt_typ_nm_META = createCommonMeta($ord_gnrt_typ_nm, mcframe.commonMS.meta.MS_META.ORD_GNRT_TYP_NM);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta ver_no_p_META = createInnerRowMeta($ver_no_p, mcframe.clientMAUB.MAUBP0340.VerNoR.class);
	public static final MCMeta sno_wrk_no_p_META = createInnerRowMeta($sno_wrk_no_p, mcframe.clientMSUB.MSUBP0020.SnoWrkNoR.class);
	public static final MCMeta itm_ord_no_META = createCommonMeta($itm_ord_no, mcframe.commonMA.meta.MA_META.ITM_ORD_NO);
	public static final MCMeta rqmt_no_META = createCommonMeta($rqmt_no, mcframe.commonMA.meta.MA_META.RQMT_NO);
	public static final MCMeta sim_mrp_no_META = createCommonMeta($sim_mrp_no, mcframe.commonMA.meta.MA_META.SIM_MRP_NO);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.IORD_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.IORD_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.IORD_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.IORD_SUB_CHAR3);
	public static final MCMeta itm_grp_p_META = createInnerRowMeta($itm_grp_p, mcframe.clientMAUB.MAUBP0250.ItmGrpR.class);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			opn_META,
			exp_META,
			mfg_flg_META,
			purc_flg_META,
			outsrc_flg_META,
			xfr_flg_META,
			wg_xfr_flg_META,
			true_not_fix_flg_META,
			false_not_fix_flg_META,
			mfg_st_schd_dt_fr_META,
			mfg_st_schd_dt_to_META,
			mfg_end_schd_dt_fr_META,
			mfg_end_schd_dt_to_META,
			po_schd_dt_fr_META,
			po_schd_dt_to_META,
			gi_schd_dt_fr_META,
			gi_schd_dt_to_META,
			avl_schd_dt_fr_META,
			avl_schd_dt_to_META,
			strg_schd_dt_fr_META,
			strg_schd_dt_to_META,
			accpt_schd_dt_fr_META,
			accpt_schd_dt_to_META,
			insp_st_schd_dt_fr_META,
			insp_st_schd_dt_to_META,
			insp_end_schd_dt_fr_META,
			insp_end_schd_dt_to_META,
			wg_cd_META,
			wg_nm_META,
			rqst_wg_cd_META,
			rqst_wg_nm_META,
			strg_alloc_grp_cd_META,
			strg_alloc_grp_nm_META,
			mfg_loc_grp_cd_META,
			mfg_loc_grp_nm_META,
			strg_loc_cd_META,
			strg_loc_nm_META,
			strg_site_cd_META,
			strg_site_nm_META,
			strg_lg_grp_cd_META,
			strg_lg_grp_nm_META,
			strg_loc_grp_cd_META,
			strg_loc_grp_nm_META,
			mfg_loc_cd_META,
			mfg_loc_nm_META,
			mfg_site_cd_META,
			mfg_site_nm_META,
			rqst_loc_cd_META,
			rqst_loc_nm_META,
			rqst_site_cd_META,
			rqst_site_nm_META,
			rqst_loc_grp_cd_META,
			rqst_loc_grp_nm_META,
			sppl_cd_META,
			sppl_nm_META,
			maker_cd_META,
			maker_nm_META,
			itm_typ_p_META,
			ord_gnrt_typ_META,
			ord_gnrt_typ_nm_META,
			itm_p_META,
			ver_no_p_META,
			sno_wrk_no_p_META,
			itm_ord_no_META,
			rqmt_no_META,
			sim_mrp_no_META,
			intr_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			itm_grp_p_META
		},
		new String[][]{
			{
				"itm_typ",
				"itm_typ_d_cd",
				"itm_typ_d_nm",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"ver_no",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"wrk_no",
				"wrk_nm",
				"itm_grp_flg1",
				"itm_grp_cd1",
				"itm_grp_nm1",
				"itm_grp_flg2",
				"itm_grp_cd2",
				"itm_grp_nm2",
				"itm_grp_flg3",
				"itm_grp_cd3",
				"itm_grp_nm3",
				"itm_grp_flg4",
				"itm_grp_cd4",
				"itm_grp_nm4",
				"itm_grp_flg5",
				"itm_grp_cd5",
				"itm_grp_nm5",
				"itm_grp_flg6",
				"itm_grp_cd6",
				"itm_grp_nm6",
				"itm_grp_flg7",
				"itm_grp_cd7",
				"itm_grp_nm7",
				"itm_grp_flg8",
				"itm_grp_cd8",
				"itm_grp_nm8",
				"itm_grp_flg9",
				"itm_grp_cd9",
				"itm_grp_nm9",
				"itm_grp_flg10",
				"itm_grp_cd10",
				"itm_grp_nm10"
			},
			{
				$itm_typ,
				$itm_typ_d_cd,
				$itm_typ_d_nm,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$ver_no,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$wrk_no,
				$wrk_nm,
				$itm_grp_flg1,
				$itm_grp_cd1,
				$itm_grp_nm1,
				$itm_grp_flg2,
				$itm_grp_cd2,
				$itm_grp_nm2,
				$itm_grp_flg3,
				$itm_grp_cd3,
				$itm_grp_nm3,
				$itm_grp_flg4,
				$itm_grp_cd4,
				$itm_grp_nm4,
				$itm_grp_flg5,
				$itm_grp_cd5,
				$itm_grp_nm5,
				$itm_grp_flg6,
				$itm_grp_cd6,
				$itm_grp_nm6,
				$itm_grp_flg7,
				$itm_grp_cd7,
				$itm_grp_nm7,
				$itm_grp_flg8,
				$itm_grp_cd8,
				$itm_grp_nm8,
				$itm_grp_flg9,
				$itm_grp_cd9,
				$itm_grp_nm9,
				$itm_grp_flg10,
				$itm_grp_cd10,
				$itm_grp_nm10
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
				{$rqst_wg_cd, "wg_nm"},	// rqst_wg_cd
				{$strg_alloc_grp_cd, "alloc_grp_nm"},	// strg_alloc_grp_cd
				{$mfg_loc_grp_cd, "loc_grp_nm"},	// mfg_loc_grp_cd
				{$strg_loc_cd, "loc_nm"},	// strg_loc_cd
				{$strg_site_cd, "site_nm"},	// strg_site_cd
				{$strg_lg_grp_cd, "lg_grp_nm"},	// strg_lg_grp_cd
				{$strg_loc_grp_cd, "loc_grp_nm"},	// strg_loc_grp_cd
				{$mfg_loc_cd, "loc_nm"},	// mfg_loc_cd
				{$mfg_site_cd, "site_nm"},	// mfg_site_cd
				{$rqst_loc_cd, "loc_nm"},	// rqst_loc_cd
				{$rqst_site_cd, "site_nm"},	// rqst_site_cd
				{$rqst_loc_grp_cd, "loc_grp_nm"},	// rqst_loc_grp_cd
				{$sppl_cd, "bp_nm"},	// sppl_cd
				{$maker_cd, "bp_nm"}	// maker_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$strg_loc_cd, "MAC_LOC_IS_SRCH_TYP.COMM"},	// strg_loc_cd
				{$mfg_loc_cd, "MAC_LOC_IS_SRCH_TYP.COMM"},	// mfg_loc_cd
				{$rqst_loc_cd, "MAC_LOC_IS_SRCH_TYP.COMM"},	// rqst_loc_cd
				{$sppl_cd, "MAC_BP_IS_SRCH_TYP.SPPL"},	// sppl_cd
				{$maker_cd, "MAC_BP_IS_SRCH_TYP.MAKER"},	// maker_cd
				{$itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "itm_cd;MAC_ITM_IS_SRCH_TYP.NOT_ASSET3"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "itm_cd;itm_sub1;MAC_ITM_IS_SRCH_TYP.NOT_ASSET3"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "itm_cd;itm_sub1;itm_sub2;MAC_ITM_IS_SRCH_TYP.NOT_ASSET3"}	// itm_p.itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$strg_loc_cd, "loc_is_srch_typ"},	// strg_loc_cd
				{$mfg_loc_cd, "loc_is_srch_typ"},	// mfg_loc_cd
				{$rqst_loc_cd, "loc_is_srch_typ"},	// rqst_loc_cd
				{$sppl_cd, "bp_is_srch_typ"},	// sppl_cd
				{$maker_cd, "bp_is_srch_typ"},	// maker_cd
				{$itm_p + ".itm_cd", "itm_is_srch_typ"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "itm_cd;itm_is_srch_typ"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "itm_cd;itm_sub1;itm_is_srch_typ"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "itm_cd;itm_sub1;itm_sub2;itm_is_srch_typ"}	// itm_p.itm_sub3
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$wg_xfr_flg, "WG"},	// wg_xfr_flg
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"},	// wg_nm
				{$rqst_wg_cd, "WG"},	// rqst_wg_cd
				{$rqst_wg_nm, "WG"},	// rqst_wg_nm
				{$strg_alloc_grp_cd, "ALLOC_GRP"},	// strg_alloc_grp_cd
				{$strg_alloc_grp_nm, "ALLOC_GRP"},	// strg_alloc_grp_nm
				{$mfg_loc_grp_cd, "LOC_GRP"},	// mfg_loc_grp_cd
				{$mfg_loc_grp_nm, "LOC_GRP"},	// mfg_loc_grp_nm
				{$strg_site_cd, "SITE"},	// strg_site_cd
				{$strg_site_nm, "SITE"},	// strg_site_nm
				{$strg_lg_grp_cd, "LG_GRP"},	// strg_lg_grp_cd
				{$strg_lg_grp_nm, "LG_GRP"},	// strg_lg_grp_nm
				{$strg_loc_grp_cd, "LOC_GRP"},	// strg_loc_grp_cd
				{$strg_loc_grp_nm, "LOC_GRP"},	// strg_loc_grp_nm
				{$mfg_site_cd, "SITE"},	// mfg_site_cd
				{$mfg_site_nm, "SITE"},	// mfg_site_nm
				{$rqst_site_cd, "SITE"},	// rqst_site_cd
				{$rqst_site_nm, "SITE"},	// rqst_site_nm
				{$rqst_loc_grp_cd, "LOC_GRP"},	// rqst_loc_grp_cd
				{$rqst_loc_grp_nm, "LOC_GRP"},	// rqst_loc_grp_nm
				{$maker_cd, "MAKER"},	// maker_cd
				{$maker_nm, "MAKER"}	// maker_nm
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
	protected CndR_MC_A(ConstMetaList<? extends CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR clone() {
		return (CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR createInstance() {
		return (CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR getValues(String... names) {
		return (CndR) super.getValues(names);
	}



	/**
	 * OPN,Apply;EXP,Undo application;REF,View OPN,反映する;EXP,反映解除する;REF,参照する.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * OPN,Apply;EXP,Undo application;REF,View OPN,反映する;EXP,反映解除する;REF,参照する.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	/**
	 * Not applied 未反映.<p>
	 *
	 */
	public boolean opn() {
		return getConstBoolean(offset + 1, $opn);
	}

	/**
	 * Not applied 未反映.<p>
	 *
	 */
	public void opn(boolean value) {
		setConstBoolean(offset + 1, $opn, value);
	}


	/**
	 * Applied 反映済.<p>
	 *
	 */
	public boolean exp() {
		return getConstBoolean(offset + 2, $exp);
	}

	/**
	 * Applied 反映済.<p>
	 *
	 */
	public void exp(boolean value) {
		setConstBoolean(offset + 2, $exp, value);
	}


	/**
	 * Mfg. 製造.<p>
	 *
	 */
	public boolean mfg_flg() {
		return getConstBoolean(offset + 3, $mfg_flg);
	}

	/**
	 * Mfg. 製造.<p>
	 *
	 */
	public void mfg_flg(boolean value) {
		setConstBoolean(offset + 3, $mfg_flg, value);
	}


	/**
	 * Purchase 購買.<p>
	 *
	 */
	public boolean purc_flg() {
		return getConstBoolean(offset + 4, $purc_flg);
	}

	/**
	 * Purchase 購買.<p>
	 *
	 */
	public void purc_flg(boolean value) {
		setConstBoolean(offset + 4, $purc_flg, value);
	}


	/**
	 * Subcontracting 外注.<p>
	 *
	 */
	public boolean outsrc_flg() {
		return getConstBoolean(offset + 5, $outsrc_flg);
	}

	/**
	 * Subcontracting 外注.<p>
	 *
	 */
	public void outsrc_flg(boolean value) {
		setConstBoolean(offset + 5, $outsrc_flg, value);
	}


	/**
	 * Transport 移送.<p>
	 *
	 */
	public boolean xfr_flg() {
		return getConstBoolean(offset + 6, $xfr_flg);
	}

	/**
	 * Transport 移送.<p>
	 *
	 */
	public void xfr_flg(boolean value) {
		setConstBoolean(offset + 6, $xfr_flg, value);
	}


	/**
	 * Transport between WG ワーキンググループ間移送.<p>
	 *
	 */
	public boolean wg_xfr_flg() {
		return getConstBoolean(offset + 7, $wg_xfr_flg);
	}

	/**
	 * Transport between WG ワーキンググループ間移送.<p>
	 *
	 */
	public void wg_xfr_flg(boolean value) {
		setConstBoolean(offset + 7, $wg_xfr_flg, value);
	}


	/**
	 * Disallow procurement 手配不許可.<p>
	 *
	 */
	public boolean true_not_fix_flg() {
		return getConstBoolean(offset + 8, $true_not_fix_flg);
	}

	/**
	 * Disallow procurement 手配不許可.<p>
	 *
	 */
	public void true_not_fix_flg(boolean value) {
		setConstBoolean(offset + 8, $true_not_fix_flg, value);
	}


	/**
	 * Allow procurement 手配許可.<p>
	 *
	 */
	public boolean false_not_fix_flg() {
		return getConstBoolean(offset + 9, $false_not_fix_flg);
	}

	/**
	 * Allow procurement 手配許可.<p>
	 *
	 */
	public void false_not_fix_flg(boolean value) {
		setConstBoolean(offset + 9, $false_not_fix_flg, value);
	}


	/**
	 * Scheduled mfg. start date FROM 製造着手予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate mfg_st_schd_dt_fr() {
		return getConstDate(offset + 10, $mfg_st_schd_dt_fr);
	}

	/**
	 * Scheduled mfg. start date FROM 製造着手予定日ＦＲＯＭ.<p>
	 *
	 */
	public void mfg_st_schd_dt_fr(MCDate value) {
		setConstDate(offset + 10, $mfg_st_schd_dt_fr, value);
	}


	/**
	 * Scheduled mfg. start date TO 製造着手予定日ＴＯ.<p>
	 *
	 */
	public MCDate mfg_st_schd_dt_to() {
		return getConstDate(offset + 11, $mfg_st_schd_dt_to);
	}

	/**
	 * Scheduled mfg. start date TO 製造着手予定日ＴＯ.<p>
	 *
	 */
	public void mfg_st_schd_dt_to(MCDate value) {
		setConstDate(offset + 11, $mfg_st_schd_dt_to, value);
	}


	/**
	 * Scheduled mfg. end date FROM 製造終了予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate mfg_end_schd_dt_fr() {
		return getConstDate(offset + 12, $mfg_end_schd_dt_fr);
	}

	/**
	 * Scheduled mfg. end date FROM 製造終了予定日ＦＲＯＭ.<p>
	 *
	 */
	public void mfg_end_schd_dt_fr(MCDate value) {
		setConstDate(offset + 12, $mfg_end_schd_dt_fr, value);
	}


	/**
	 * Scheduled mfg. end date TO 製造終了予定日ＴＯ.<p>
	 *
	 */
	public MCDate mfg_end_schd_dt_to() {
		return getConstDate(offset + 13, $mfg_end_schd_dt_to);
	}

	/**
	 * Scheduled mfg. end date TO 製造終了予定日ＴＯ.<p>
	 *
	 */
	public void mfg_end_schd_dt_to(MCDate value) {
		setConstDate(offset + 13, $mfg_end_schd_dt_to, value);
	}


	/**
	 * Scheduled PO date FROM 発注予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate po_schd_dt_fr() {
		return getConstDate(offset + 14, $po_schd_dt_fr);
	}

	/**
	 * Scheduled PO date FROM 発注予定日ＦＲＯＭ.<p>
	 *
	 */
	public void po_schd_dt_fr(MCDate value) {
		setConstDate(offset + 14, $po_schd_dt_fr, value);
	}


	/**
	 * Scheduled PO date TO 発注予定日ＴＯ.<p>
	 *
	 */
	public MCDate po_schd_dt_to() {
		return getConstDate(offset + 15, $po_schd_dt_to);
	}

	/**
	 * Scheduled PO date TO 発注予定日ＴＯ.<p>
	 *
	 */
	public void po_schd_dt_to(MCDate value) {
		setConstDate(offset + 15, $po_schd_dt_to, value);
	}


	/**
	 * Scheduled GI date FROM 出庫予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate gi_schd_dt_fr() {
		return getConstDate(offset + 16, $gi_schd_dt_fr);
	}

	/**
	 * Scheduled GI date FROM 出庫予定日ＦＲＯＭ.<p>
	 *
	 */
	public void gi_schd_dt_fr(MCDate value) {
		setConstDate(offset + 16, $gi_schd_dt_fr, value);
	}


	/**
	 * Scheduled GI date TO 出庫予定日ＴＯ.<p>
	 *
	 */
	public MCDate gi_schd_dt_to() {
		return getConstDate(offset + 17, $gi_schd_dt_to);
	}

	/**
	 * Scheduled GI date TO 出庫予定日ＴＯ.<p>
	 *
	 */
	public void gi_schd_dt_to(MCDate value) {
		setConstDate(offset + 17, $gi_schd_dt_to, value);
	}


	/**
	 * Available FROM 使用可能予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate avl_schd_dt_fr() {
		return getConstDate(offset + 18, $avl_schd_dt_fr);
	}

	/**
	 * Available FROM 使用可能予定日ＦＲＯＭ.<p>
	 *
	 */
	public void avl_schd_dt_fr(MCDate value) {
		setConstDate(offset + 18, $avl_schd_dt_fr, value);
	}


	/**
	 * Available TO 使用可能予定日ＴＯ.<p>
	 *
	 */
	public MCDate avl_schd_dt_to() {
		return getConstDate(offset + 19, $avl_schd_dt_to);
	}

	/**
	 * Available TO 使用可能予定日ＴＯ.<p>
	 *
	 */
	public void avl_schd_dt_to(MCDate value) {
		setConstDate(offset + 19, $avl_schd_dt_to, value);
	}


	/**
	 * Scheduled storage completion date FROM 格納完了予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate strg_schd_dt_fr() {
		return getConstDate(offset + 20, $strg_schd_dt_fr);
	}

	/**
	 * Scheduled storage completion date FROM 格納完了予定日ＦＲＯＭ.<p>
	 *
	 */
	public void strg_schd_dt_fr(MCDate value) {
		setConstDate(offset + 20, $strg_schd_dt_fr, value);
	}


	/**
	 * Scheduled storage completion date TO 格納完了予定日ＴＯ.<p>
	 *
	 */
	public MCDate strg_schd_dt_to() {
		return getConstDate(offset + 21, $strg_schd_dt_to);
	}

	/**
	 * Scheduled storage completion date TO 格納完了予定日ＴＯ.<p>
	 *
	 */
	public void strg_schd_dt_to(MCDate value) {
		setConstDate(offset + 21, $strg_schd_dt_to, value);
	}


	/**
	 * Scheduled acceptance date FROM 検収予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate accpt_schd_dt_fr() {
		return getConstDate(offset + 22, $accpt_schd_dt_fr);
	}

	/**
	 * Scheduled acceptance date FROM 検収予定日ＦＲＯＭ.<p>
	 *
	 */
	public void accpt_schd_dt_fr(MCDate value) {
		setConstDate(offset + 22, $accpt_schd_dt_fr, value);
	}


	/**
	 * Scheduled acceptance date TO 検収予定日ＴＯ.<p>
	 *
	 */
	public MCDate accpt_schd_dt_to() {
		return getConstDate(offset + 23, $accpt_schd_dt_to);
	}

	/**
	 * Scheduled acceptance date TO 検収予定日ＴＯ.<p>
	 *
	 */
	public void accpt_schd_dt_to(MCDate value) {
		setConstDate(offset + 23, $accpt_schd_dt_to, value);
	}


	/**
	 * Scheduled inspection start date FROM 検査着手予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate insp_st_schd_dt_fr() {
		return getConstDate(offset + 24, $insp_st_schd_dt_fr);
	}

	/**
	 * Scheduled inspection start date FROM 検査着手予定日ＦＲＯＭ.<p>
	 *
	 */
	public void insp_st_schd_dt_fr(MCDate value) {
		setConstDate(offset + 24, $insp_st_schd_dt_fr, value);
	}


	/**
	 * Scheduled inspection start date TO 検査着手予定日ＴＯ.<p>
	 *
	 */
	public MCDate insp_st_schd_dt_to() {
		return getConstDate(offset + 25, $insp_st_schd_dt_to);
	}

	/**
	 * Scheduled inspection start date TO 検査着手予定日ＴＯ.<p>
	 *
	 */
	public void insp_st_schd_dt_to(MCDate value) {
		setConstDate(offset + 25, $insp_st_schd_dt_to, value);
	}


	/**
	 * Scheduled inspection end date FROM 検査終了予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate insp_end_schd_dt_fr() {
		return getConstDate(offset + 26, $insp_end_schd_dt_fr);
	}

	/**
	 * Scheduled inspection end date FROM 検査終了予定日ＦＲＯＭ.<p>
	 *
	 */
	public void insp_end_schd_dt_fr(MCDate value) {
		setConstDate(offset + 26, $insp_end_schd_dt_fr, value);
	}


	/**
	 * Scheduled inspection end date TO 検査終了予定日ＴＯ.<p>
	 *
	 */
	public MCDate insp_end_schd_dt_to() {
		return getConstDate(offset + 27, $insp_end_schd_dt_to);
	}

	/**
	 * Scheduled inspection end date TO 検査終了予定日ＴＯ.<p>
	 *
	 */
	public void insp_end_schd_dt_to(MCDate value) {
		setConstDate(offset + 27, $insp_end_schd_dt_to, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 28, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 28, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 29, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 29, $wg_nm, value);
	}


	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public String rqst_wg_cd() {
		return getConstString(offset + 30, $rqst_wg_cd);
	}

	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public void rqst_wg_cd(String value) {
		setConstString(offset + 30, $rqst_wg_cd, value);
	}


	/**
	 * Requested WG name 依頼先ワーキンググループ名.<p>
	 *
	 */
	public String rqst_wg_nm() {
		return getConstString(offset + 31, $rqst_wg_nm);
	}

	/**
	 * Requested WG name 依頼先ワーキンググループ名.<p>
	 *
	 */
	public void rqst_wg_nm(String value) {
		setConstString(offset + 31, $rqst_wg_nm, value);
	}


	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public String strg_alloc_grp_cd() {
		return getConstString(offset + 32, $strg_alloc_grp_cd);
	}

	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public void strg_alloc_grp_cd(String value) {
		setConstString(offset + 32, $strg_alloc_grp_cd, value);
	}


	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public String strg_alloc_grp_nm() {
		return getConstString(offset + 33, $strg_alloc_grp_nm);
	}

	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public void strg_alloc_grp_nm(String value) {
		setConstString(offset + 33, $strg_alloc_grp_nm, value);
	}


	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public String mfg_loc_grp_cd() {
		return getConstString(offset + 34, $mfg_loc_grp_cd);
	}

	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public void mfg_loc_grp_cd(String value) {
		setConstString(offset + 34, $mfg_loc_grp_cd, value);
	}


	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public String mfg_loc_grp_nm() {
		return getConstString(offset + 35, $mfg_loc_grp_nm);
	}

	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public void mfg_loc_grp_nm(String value) {
		setConstString(offset + 35, $mfg_loc_grp_nm, value);
	}


	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public String strg_loc_cd() {
		return getConstString(offset + 36, $strg_loc_cd);
	}

	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public void strg_loc_cd(String value) {
		setConstString(offset + 36, $strg_loc_cd, value);
	}


	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public String strg_loc_nm() {
		return getConstString(offset + 37, $strg_loc_nm);
	}

	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public void strg_loc_nm(String value) {
		setConstString(offset + 37, $strg_loc_nm, value);
	}


	/**
	 * Storage factory/distribution warehouse cd. 格納先工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String strg_site_cd() {
		return getConstString(offset + 38, $strg_site_cd);
	}

	/**
	 * Storage factory/distribution warehouse cd. 格納先工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void strg_site_cd(String value) {
		setConstString(offset + 38, $strg_site_cd, value);
	}


	/**
	 * Storage factory/distribution warehouse name 格納先工場・物流倉庫名.<p>
	 *
	 */
	public String strg_site_nm() {
		return getConstString(offset + 39, $strg_site_nm);
	}

	/**
	 * Storage factory/distribution warehouse name 格納先工場・物流倉庫名.<p>
	 *
	 */
	public void strg_site_nm(String value) {
		setConstString(offset + 39, $strg_site_nm, value);
	}


	/**
	 * Storage location distribution group cd. 格納場所物流グループＣＤ.<p>
	 *
	 */
	public String strg_lg_grp_cd() {
		return getConstString(offset + 40, $strg_lg_grp_cd);
	}

	/**
	 * Storage location distribution group cd. 格納場所物流グループＣＤ.<p>
	 *
	 */
	public void strg_lg_grp_cd(String value) {
		setConstString(offset + 40, $strg_lg_grp_cd, value);
	}


	/**
	 * Storage location distribution group name 格納場所物流グループ名.<p>
	 *
	 */
	public String strg_lg_grp_nm() {
		return getConstString(offset + 41, $strg_lg_grp_nm);
	}

	/**
	 * Storage location distribution group name 格納場所物流グループ名.<p>
	 *
	 */
	public void strg_lg_grp_nm(String value) {
		setConstString(offset + 41, $strg_lg_grp_nm, value);
	}


	/**
	 * Storage location group cd. 格納場所グループＣＤ.<p>
	 *
	 */
	public String strg_loc_grp_cd() {
		return getConstString(offset + 42, $strg_loc_grp_cd);
	}

	/**
	 * Storage location group cd. 格納場所グループＣＤ.<p>
	 *
	 */
	public void strg_loc_grp_cd(String value) {
		setConstString(offset + 42, $strg_loc_grp_cd, value);
	}


	/**
	 * Storage location group name 格納場所グループ名.<p>
	 *
	 */
	public String strg_loc_grp_nm() {
		return getConstString(offset + 43, $strg_loc_grp_nm);
	}

	/**
	 * Storage location group name 格納場所グループ名.<p>
	 *
	 */
	public void strg_loc_grp_nm(String value) {
		setConstString(offset + 43, $strg_loc_grp_nm, value);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 44, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 44, $mfg_loc_cd, value);
	}


	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public String mfg_loc_nm() {
		return getConstString(offset + 45, $mfg_loc_nm);
	}

	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public void mfg_loc_nm(String value) {
		setConstString(offset + 45, $mfg_loc_nm, value);
	}


	/**
	 * Mfg. factory/distribution warehouse cd. 製造場所工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String mfg_site_cd() {
		return getConstString(offset + 46, $mfg_site_cd);
	}

	/**
	 * Mfg. factory/distribution warehouse cd. 製造場所工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void mfg_site_cd(String value) {
		setConstString(offset + 46, $mfg_site_cd, value);
	}


	/**
	 * Mfg. factory/distribution warehouse name 製造場所工場・物流倉庫名.<p>
	 *
	 */
	public String mfg_site_nm() {
		return getConstString(offset + 47, $mfg_site_nm);
	}

	/**
	 * Mfg. factory/distribution warehouse name 製造場所工場・物流倉庫名.<p>
	 *
	 */
	public void mfg_site_nm(String value) {
		setConstString(offset + 47, $mfg_site_nm, value);
	}


	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public String rqst_loc_cd() {
		return getConstString(offset + 48, $rqst_loc_cd);
	}

	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public void rqst_loc_cd(String value) {
		setConstString(offset + 48, $rqst_loc_cd, value);
	}


	/**
	 * Location name (Requested) 依頼先場所名.<p>
	 *
	 */
	public String rqst_loc_nm() {
		return getConstString(offset + 49, $rqst_loc_nm);
	}

	/**
	 * Location name (Requested) 依頼先場所名.<p>
	 *
	 */
	public void rqst_loc_nm(String value) {
		setConstString(offset + 49, $rqst_loc_nm, value);
	}


	/**
	 * Factory/Distribution warehouse cd. (Requested) 依頼先工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String rqst_site_cd() {
		return getConstString(offset + 50, $rqst_site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. (Requested) 依頼先工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void rqst_site_cd(String value) {
		setConstString(offset + 50, $rqst_site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name (Requested) 依頼先工場・物流倉庫名.<p>
	 *
	 */
	public String rqst_site_nm() {
		return getConstString(offset + 51, $rqst_site_nm);
	}

	/**
	 * Factory/Distribution warehouse name (Requested) 依頼先工場・物流倉庫名.<p>
	 *
	 */
	public void rqst_site_nm(String value) {
		setConstString(offset + 51, $rqst_site_nm, value);
	}


	/**
	 * Requested location group cd. 依頼先場所グループＣＤ.<p>
	 *
	 */
	public String rqst_loc_grp_cd() {
		return getConstString(offset + 52, $rqst_loc_grp_cd);
	}

	/**
	 * Requested location group cd. 依頼先場所グループＣＤ.<p>
	 *
	 */
	public void rqst_loc_grp_cd(String value) {
		setConstString(offset + 52, $rqst_loc_grp_cd, value);
	}


	/**
	 * Requested location group name 依頼先場所グループ名.<p>
	 *
	 */
	public String rqst_loc_grp_nm() {
		return getConstString(offset + 53, $rqst_loc_grp_nm);
	}

	/**
	 * Requested location group name 依頼先場所グループ名.<p>
	 *
	 */
	public void rqst_loc_grp_nm(String value) {
		setConstString(offset + 53, $rqst_loc_grp_nm, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 54, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 54, $sppl_cd, value);
	}


	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 55, $sppl_nm);
	}

	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 55, $sppl_nm, value);
	}


	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 56, $maker_cd);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 56, $maker_cd, value);
	}


	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public String maker_nm() {
		return getConstString(offset + 57, $maker_nm);
	}

	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public void maker_nm(String value) {
		setConstString(offset + 57, $maker_nm, value);
	}


	public mcframe.clientMAUB.MAUBP0100.ItmTypR itm_typ_p(){
		return (mcframe.clientMAUB.MAUBP0100.ItmTypR) getConstInnerRow(offset + 58, $itm_typ_p);
	}
	
	public void itm_typ_p(mcframe.clientMAUB.MAUBP0100.ItmTypR row){
		setConstInnerRow(offset + 58, $itm_typ_p, row);
	}


	/**
	 * Order generation type オーダ生成区分.<p>
	 *
	 */
	public String ord_gnrt_typ() {
		return getConstString(offset + 59, $ord_gnrt_typ);
	}

	/**
	 * Order generation type オーダ生成区分.<p>
	 *
	 */
	public void ord_gnrt_typ(String value) {
		setConstString(offset + 59, $ord_gnrt_typ, value);
	}


	/**
	 * Order generation type name オーダ生成区分名.<p>
	 *
	 */
	public String ord_gnrt_typ_nm() {
		return getConstString(offset + 60, $ord_gnrt_typ_nm);
	}

	/**
	 * Order generation type name オーダ生成区分名.<p>
	 *
	 */
	public void ord_gnrt_typ_nm(String value) {
		setConstString(offset + 60, $ord_gnrt_typ_nm, value);
	}


	public mcframe.clientMAUB.MAUBP0030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 61, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 61, $itm_p, row);
	}


	public mcframe.clientMAUB.MAUBP0340.VerNoR ver_no_p(){
		return (mcframe.clientMAUB.MAUBP0340.VerNoR) getConstInnerRow(offset + 62, $ver_no_p);
	}
	
	public void ver_no_p(mcframe.clientMAUB.MAUBP0340.VerNoR row){
		setConstInnerRow(offset + 62, $ver_no_p, row);
	}


	public mcframe.clientMSUB.MSUBP0020.SnoWrkNoR sno_wrk_no_p(){
		return (mcframe.clientMSUB.MSUBP0020.SnoWrkNoR) getConstInnerRow(offset + 63, $sno_wrk_no_p);
	}
	
	public void sno_wrk_no_p(mcframe.clientMSUB.MSUBP0020.SnoWrkNoR row){
		setConstInnerRow(offset + 63, $sno_wrk_no_p, row);
	}


	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public String itm_ord_no() {
		return getConstString(offset + 64, $itm_ord_no);
	}

	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public void itm_ord_no(String value) {
		setConstString(offset + 64, $itm_ord_no, value);
	}


	/**
	 * Requirements No. 所要ＮＯ.<p>
	 *
	 */
	public String rqmt_no() {
		return getConstString(offset + 65, $rqmt_no);
	}

	/**
	 * Requirements No. 所要ＮＯ.<p>
	 *
	 */
	public void rqmt_no(String value) {
		setConstString(offset + 65, $rqmt_no, value);
	}


	/**
	 * Simulation No. シミュレーションＮＯ.<p>
	 *
	 */
	public String sim_mrp_no() {
		return getConstString(offset + 66, $sim_mrp_no);
	}

	/**
	 * Simulation No. シミュレーションＮＯ.<p>
	 *
	 */
	public void sim_mrp_no(String value) {
		setConstString(offset + 66, $sim_mrp_no, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 67, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 67, $intr_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 68, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 68, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 69, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 69, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 70, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 70, $sub_char3, value);
	}


	public mcframe.clientMAUB.MAUBP0250.ItmGrpR itm_grp_p(){
		return (mcframe.clientMAUB.MAUBP0250.ItmGrpR) getConstInnerRow(offset + 71, $itm_grp_p);
	}
	
	public void itm_grp_p(mcframe.clientMAUB.MAUBP0250.ItmGrpR row){
		setConstInnerRow(offset + 71, $itm_grp_p, row);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			return rqst_wg_cd();
		}
		if ($rqst_wg_nm.equalsIgnoreCase(name)) {
			return rqst_wg_nm();
		}
		if ($strg_alloc_grp_cd.equalsIgnoreCase(name)) {
			return strg_alloc_grp_cd();
		}
		if ($strg_alloc_grp_nm.equalsIgnoreCase(name)) {
			return strg_alloc_grp_nm();
		}
		if ($mfg_loc_grp_cd.equalsIgnoreCase(name)) {
			return mfg_loc_grp_cd();
		}
		if ($mfg_loc_grp_nm.equalsIgnoreCase(name)) {
			return mfg_loc_grp_nm();
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
		if ($strg_lg_grp_cd.equalsIgnoreCase(name)) {
			return strg_lg_grp_cd();
		}
		if ($strg_lg_grp_nm.equalsIgnoreCase(name)) {
			return strg_lg_grp_nm();
		}
		if ($strg_loc_grp_cd.equalsIgnoreCase(name)) {
			return strg_loc_grp_cd();
		}
		if ($strg_loc_grp_nm.equalsIgnoreCase(name)) {
			return strg_loc_grp_nm();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($mfg_site_cd.equalsIgnoreCase(name)) {
			return mfg_site_cd();
		}
		if ($mfg_site_nm.equalsIgnoreCase(name)) {
			return mfg_site_nm();
		}
		if ($rqst_loc_cd.equalsIgnoreCase(name)) {
			return rqst_loc_cd();
		}
		if ($rqst_loc_nm.equalsIgnoreCase(name)) {
			return rqst_loc_nm();
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
		if ($ord_gnrt_typ.equalsIgnoreCase(name)) {
			return ord_gnrt_typ();
		}
		if ($ord_gnrt_typ_nm.equalsIgnoreCase(name)) {
			return ord_gnrt_typ_nm();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($rqmt_no.equalsIgnoreCase(name)) {
			return rqmt_no();
		}
		if ($sim_mrp_no.equalsIgnoreCase(name)) {
			return sim_mrp_no();
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
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($mfg_st_schd_dt_fr.equalsIgnoreCase(name)) {
			return mfg_st_schd_dt_fr();
		}
		if ($mfg_st_schd_dt_to.equalsIgnoreCase(name)) {
			return mfg_st_schd_dt_to();
		}
		if ($mfg_end_schd_dt_fr.equalsIgnoreCase(name)) {
			return mfg_end_schd_dt_fr();
		}
		if ($mfg_end_schd_dt_to.equalsIgnoreCase(name)) {
			return mfg_end_schd_dt_to();
		}
		if ($po_schd_dt_fr.equalsIgnoreCase(name)) {
			return po_schd_dt_fr();
		}
		if ($po_schd_dt_to.equalsIgnoreCase(name)) {
			return po_schd_dt_to();
		}
		if ($gi_schd_dt_fr.equalsIgnoreCase(name)) {
			return gi_schd_dt_fr();
		}
		if ($gi_schd_dt_to.equalsIgnoreCase(name)) {
			return gi_schd_dt_to();
		}
		if ($avl_schd_dt_fr.equalsIgnoreCase(name)) {
			return avl_schd_dt_fr();
		}
		if ($avl_schd_dt_to.equalsIgnoreCase(name)) {
			return avl_schd_dt_to();
		}
		if ($strg_schd_dt_fr.equalsIgnoreCase(name)) {
			return strg_schd_dt_fr();
		}
		if ($strg_schd_dt_to.equalsIgnoreCase(name)) {
			return strg_schd_dt_to();
		}
		if ($accpt_schd_dt_fr.equalsIgnoreCase(name)) {
			return accpt_schd_dt_fr();
		}
		if ($accpt_schd_dt_to.equalsIgnoreCase(name)) {
			return accpt_schd_dt_to();
		}
		if ($insp_st_schd_dt_fr.equalsIgnoreCase(name)) {
			return insp_st_schd_dt_fr();
		}
		if ($insp_st_schd_dt_to.equalsIgnoreCase(name)) {
			return insp_st_schd_dt_to();
		}
		if ($insp_end_schd_dt_fr.equalsIgnoreCase(name)) {
			return insp_end_schd_dt_fr();
		}
		if ($insp_end_schd_dt_to.equalsIgnoreCase(name)) {
			return insp_end_schd_dt_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($opn.equalsIgnoreCase(name)) {
			return opn();
		}
		if ($exp.equalsIgnoreCase(name)) {
			return exp();
		}
		if ($mfg_flg.equalsIgnoreCase(name)) {
			return mfg_flg();
		}
		if ($purc_flg.equalsIgnoreCase(name)) {
			return purc_flg();
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			return outsrc_flg();
		}
		if ($xfr_flg.equalsIgnoreCase(name)) {
			return xfr_flg();
		}
		if ($wg_xfr_flg.equalsIgnoreCase(name)) {
			return wg_xfr_flg();
		}
		if ($true_not_fix_flg.equalsIgnoreCase(name)) {
			return true_not_fix_flg();
		}
		if ($false_not_fix_flg.equalsIgnoreCase(name)) {
			return false_not_fix_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			return rqst_wg_cd();
		}
		if ($rqst_wg_nm.equalsIgnoreCase(name)) {
			return rqst_wg_nm();
		}
		if ($strg_alloc_grp_cd.equalsIgnoreCase(name)) {
			return strg_alloc_grp_cd();
		}
		if ($strg_alloc_grp_nm.equalsIgnoreCase(name)) {
			return strg_alloc_grp_nm();
		}
		if ($mfg_loc_grp_cd.equalsIgnoreCase(name)) {
			return mfg_loc_grp_cd();
		}
		if ($mfg_loc_grp_nm.equalsIgnoreCase(name)) {
			return mfg_loc_grp_nm();
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
		if ($strg_lg_grp_cd.equalsIgnoreCase(name)) {
			return strg_lg_grp_cd();
		}
		if ($strg_lg_grp_nm.equalsIgnoreCase(name)) {
			return strg_lg_grp_nm();
		}
		if ($strg_loc_grp_cd.equalsIgnoreCase(name)) {
			return strg_loc_grp_cd();
		}
		if ($strg_loc_grp_nm.equalsIgnoreCase(name)) {
			return strg_loc_grp_nm();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($mfg_site_cd.equalsIgnoreCase(name)) {
			return mfg_site_cd();
		}
		if ($mfg_site_nm.equalsIgnoreCase(name)) {
			return mfg_site_nm();
		}
		if ($rqst_loc_cd.equalsIgnoreCase(name)) {
			return rqst_loc_cd();
		}
		if ($rqst_loc_nm.equalsIgnoreCase(name)) {
			return rqst_loc_nm();
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
		if ($ord_gnrt_typ.equalsIgnoreCase(name)) {
			return ord_gnrt_typ();
		}
		if ($ord_gnrt_typ_nm.equalsIgnoreCase(name)) {
			return ord_gnrt_typ_nm();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($rqmt_no.equalsIgnoreCase(name)) {
			return rqmt_no();
		}
		if ($sim_mrp_no.equalsIgnoreCase(name)) {
			return sim_mrp_no();
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
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($mfg_st_schd_dt_fr.equalsIgnoreCase(name)) {
			return mfg_st_schd_dt_fr();
		}
		if ($mfg_st_schd_dt_to.equalsIgnoreCase(name)) {
			return mfg_st_schd_dt_to();
		}
		if ($mfg_end_schd_dt_fr.equalsIgnoreCase(name)) {
			return mfg_end_schd_dt_fr();
		}
		if ($mfg_end_schd_dt_to.equalsIgnoreCase(name)) {
			return mfg_end_schd_dt_to();
		}
		if ($po_schd_dt_fr.equalsIgnoreCase(name)) {
			return po_schd_dt_fr();
		}
		if ($po_schd_dt_to.equalsIgnoreCase(name)) {
			return po_schd_dt_to();
		}
		if ($gi_schd_dt_fr.equalsIgnoreCase(name)) {
			return gi_schd_dt_fr();
		}
		if ($gi_schd_dt_to.equalsIgnoreCase(name)) {
			return gi_schd_dt_to();
		}
		if ($avl_schd_dt_fr.equalsIgnoreCase(name)) {
			return avl_schd_dt_fr();
		}
		if ($avl_schd_dt_to.equalsIgnoreCase(name)) {
			return avl_schd_dt_to();
		}
		if ($strg_schd_dt_fr.equalsIgnoreCase(name)) {
			return strg_schd_dt_fr();
		}
		if ($strg_schd_dt_to.equalsIgnoreCase(name)) {
			return strg_schd_dt_to();
		}
		if ($accpt_schd_dt_fr.equalsIgnoreCase(name)) {
			return accpt_schd_dt_fr();
		}
		if ($accpt_schd_dt_to.equalsIgnoreCase(name)) {
			return accpt_schd_dt_to();
		}
		if ($insp_st_schd_dt_fr.equalsIgnoreCase(name)) {
			return insp_st_schd_dt_fr();
		}
		if ($insp_st_schd_dt_to.equalsIgnoreCase(name)) {
			return insp_st_schd_dt_to();
		}
		if ($insp_end_schd_dt_fr.equalsIgnoreCase(name)) {
			return insp_end_schd_dt_fr();
		}
		if ($insp_end_schd_dt_to.equalsIgnoreCase(name)) {
			return insp_end_schd_dt_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($opn.equalsIgnoreCase(name)) {
			return opn();
		}
		if ($exp.equalsIgnoreCase(name)) {
			return exp();
		}
		if ($mfg_flg.equalsIgnoreCase(name)) {
			return mfg_flg();
		}
		if ($purc_flg.equalsIgnoreCase(name)) {
			return purc_flg();
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			return outsrc_flg();
		}
		if ($xfr_flg.equalsIgnoreCase(name)) {
			return xfr_flg();
		}
		if ($wg_xfr_flg.equalsIgnoreCase(name)) {
			return wg_xfr_flg();
		}
		if ($true_not_fix_flg.equalsIgnoreCase(name)) {
			return true_not_fix_flg();
		}
		if ($false_not_fix_flg.equalsIgnoreCase(name)) {
			return false_not_fix_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
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
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			rqst_wg_cd(value);
			return;
		}
		if ($rqst_wg_nm.equalsIgnoreCase(name)) {
			rqst_wg_nm(value);
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
		if ($mfg_loc_grp_cd.equalsIgnoreCase(name)) {
			mfg_loc_grp_cd(value);
			return;
		}
		if ($mfg_loc_grp_nm.equalsIgnoreCase(name)) {
			mfg_loc_grp_nm(value);
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
		if ($strg_lg_grp_cd.equalsIgnoreCase(name)) {
			strg_lg_grp_cd(value);
			return;
		}
		if ($strg_lg_grp_nm.equalsIgnoreCase(name)) {
			strg_lg_grp_nm(value);
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
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			mfg_loc_nm(value);
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
		if ($rqst_loc_cd.equalsIgnoreCase(name)) {
			rqst_loc_cd(value);
			return;
		}
		if ($rqst_loc_nm.equalsIgnoreCase(name)) {
			rqst_loc_nm(value);
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
		if ($ord_gnrt_typ.equalsIgnoreCase(name)) {
			ord_gnrt_typ(value);
			return;
		}
		if ($ord_gnrt_typ_nm.equalsIgnoreCase(name)) {
			ord_gnrt_typ_nm(value);
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
		if ($sim_mrp_no.equalsIgnoreCase(name)) {
			sim_mrp_no(value);
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
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($mfg_st_schd_dt_fr.equalsIgnoreCase(name)) {
			mfg_st_schd_dt_fr(value);
			return;
		}
		if ($mfg_st_schd_dt_to.equalsIgnoreCase(name)) {
			mfg_st_schd_dt_to(value);
			return;
		}
		if ($mfg_end_schd_dt_fr.equalsIgnoreCase(name)) {
			mfg_end_schd_dt_fr(value);
			return;
		}
		if ($mfg_end_schd_dt_to.equalsIgnoreCase(name)) {
			mfg_end_schd_dt_to(value);
			return;
		}
		if ($po_schd_dt_fr.equalsIgnoreCase(name)) {
			po_schd_dt_fr(value);
			return;
		}
		if ($po_schd_dt_to.equalsIgnoreCase(name)) {
			po_schd_dt_to(value);
			return;
		}
		if ($gi_schd_dt_fr.equalsIgnoreCase(name)) {
			gi_schd_dt_fr(value);
			return;
		}
		if ($gi_schd_dt_to.equalsIgnoreCase(name)) {
			gi_schd_dt_to(value);
			return;
		}
		if ($avl_schd_dt_fr.equalsIgnoreCase(name)) {
			avl_schd_dt_fr(value);
			return;
		}
		if ($avl_schd_dt_to.equalsIgnoreCase(name)) {
			avl_schd_dt_to(value);
			return;
		}
		if ($strg_schd_dt_fr.equalsIgnoreCase(name)) {
			strg_schd_dt_fr(value);
			return;
		}
		if ($strg_schd_dt_to.equalsIgnoreCase(name)) {
			strg_schd_dt_to(value);
			return;
		}
		if ($accpt_schd_dt_fr.equalsIgnoreCase(name)) {
			accpt_schd_dt_fr(value);
			return;
		}
		if ($accpt_schd_dt_to.equalsIgnoreCase(name)) {
			accpt_schd_dt_to(value);
			return;
		}
		if ($insp_st_schd_dt_fr.equalsIgnoreCase(name)) {
			insp_st_schd_dt_fr(value);
			return;
		}
		if ($insp_st_schd_dt_to.equalsIgnoreCase(name)) {
			insp_st_schd_dt_to(value);
			return;
		}
		if ($insp_end_schd_dt_fr.equalsIgnoreCase(name)) {
			insp_end_schd_dt_fr(value);
			return;
		}
		if ($insp_end_schd_dt_to.equalsIgnoreCase(name)) {
			insp_end_schd_dt_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($opn.equalsIgnoreCase(name)) {
			opn(value);
			return;
		}
		if ($exp.equalsIgnoreCase(name)) {
			exp(value);
			return;
		}
		if ($mfg_flg.equalsIgnoreCase(name)) {
			mfg_flg(value);
			return;
		}
		if ($purc_flg.equalsIgnoreCase(name)) {
			purc_flg(value);
			return;
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			outsrc_flg(value);
			return;
		}
		if ($xfr_flg.equalsIgnoreCase(name)) {
			xfr_flg(value);
			return;
		}
		if ($wg_xfr_flg.equalsIgnoreCase(name)) {
			wg_xfr_flg(value);
			return;
		}
		if ($true_not_fix_flg.equalsIgnoreCase(name)) {
			true_not_fix_flg(value);
			return;
		}
		if ($false_not_fix_flg.equalsIgnoreCase(name)) {
			false_not_fix_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
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
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			rqst_wg_cd(value);
			return;
		}
		if ($rqst_wg_nm.equalsIgnoreCase(name)) {
			rqst_wg_nm(value);
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
		if ($mfg_loc_grp_cd.equalsIgnoreCase(name)) {
			mfg_loc_grp_cd(value);
			return;
		}
		if ($mfg_loc_grp_nm.equalsIgnoreCase(name)) {
			mfg_loc_grp_nm(value);
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
		if ($strg_lg_grp_cd.equalsIgnoreCase(name)) {
			strg_lg_grp_cd(value);
			return;
		}
		if ($strg_lg_grp_nm.equalsIgnoreCase(name)) {
			strg_lg_grp_nm(value);
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
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			mfg_loc_nm(value);
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
		if ($rqst_loc_cd.equalsIgnoreCase(name)) {
			rqst_loc_cd(value);
			return;
		}
		if ($rqst_loc_nm.equalsIgnoreCase(name)) {
			rqst_loc_nm(value);
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
		if ($ord_gnrt_typ.equalsIgnoreCase(name)) {
			ord_gnrt_typ(value);
			return;
		}
		if ($ord_gnrt_typ_nm.equalsIgnoreCase(name)) {
			ord_gnrt_typ_nm(value);
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
		if ($sim_mrp_no.equalsIgnoreCase(name)) {
			sim_mrp_no(value);
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
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($mfg_st_schd_dt_fr.equalsIgnoreCase(name)) {
			mfg_st_schd_dt_fr(value);
			return;
		}
		if ($mfg_st_schd_dt_to.equalsIgnoreCase(name)) {
			mfg_st_schd_dt_to(value);
			return;
		}
		if ($mfg_end_schd_dt_fr.equalsIgnoreCase(name)) {
			mfg_end_schd_dt_fr(value);
			return;
		}
		if ($mfg_end_schd_dt_to.equalsIgnoreCase(name)) {
			mfg_end_schd_dt_to(value);
			return;
		}
		if ($po_schd_dt_fr.equalsIgnoreCase(name)) {
			po_schd_dt_fr(value);
			return;
		}
		if ($po_schd_dt_to.equalsIgnoreCase(name)) {
			po_schd_dt_to(value);
			return;
		}
		if ($gi_schd_dt_fr.equalsIgnoreCase(name)) {
			gi_schd_dt_fr(value);
			return;
		}
		if ($gi_schd_dt_to.equalsIgnoreCase(name)) {
			gi_schd_dt_to(value);
			return;
		}
		if ($avl_schd_dt_fr.equalsIgnoreCase(name)) {
			avl_schd_dt_fr(value);
			return;
		}
		if ($avl_schd_dt_to.equalsIgnoreCase(name)) {
			avl_schd_dt_to(value);
			return;
		}
		if ($strg_schd_dt_fr.equalsIgnoreCase(name)) {
			strg_schd_dt_fr(value);
			return;
		}
		if ($strg_schd_dt_to.equalsIgnoreCase(name)) {
			strg_schd_dt_to(value);
			return;
		}
		if ($accpt_schd_dt_fr.equalsIgnoreCase(name)) {
			accpt_schd_dt_fr(value);
			return;
		}
		if ($accpt_schd_dt_to.equalsIgnoreCase(name)) {
			accpt_schd_dt_to(value);
			return;
		}
		if ($insp_st_schd_dt_fr.equalsIgnoreCase(name)) {
			insp_st_schd_dt_fr(value);
			return;
		}
		if ($insp_st_schd_dt_to.equalsIgnoreCase(name)) {
			insp_st_schd_dt_to(value);
			return;
		}
		if ($insp_end_schd_dt_fr.equalsIgnoreCase(name)) {
			insp_end_schd_dt_fr(value);
			return;
		}
		if ($insp_end_schd_dt_to.equalsIgnoreCase(name)) {
			insp_end_schd_dt_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($opn.equalsIgnoreCase(name)) {
			opn(value);
			return;
		}
		if ($exp.equalsIgnoreCase(name)) {
			exp(value);
			return;
		}
		if ($mfg_flg.equalsIgnoreCase(name)) {
			mfg_flg(value);
			return;
		}
		if ($purc_flg.equalsIgnoreCase(name)) {
			purc_flg(value);
			return;
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			outsrc_flg(value);
			return;
		}
		if ($xfr_flg.equalsIgnoreCase(name)) {
			xfr_flg(value);
			return;
		}
		if ($wg_xfr_flg.equalsIgnoreCase(name)) {
			wg_xfr_flg(value);
			return;
		}
		if ($true_not_fix_flg.equalsIgnoreCase(name)) {
			true_not_fix_flg(value);
			return;
		}
		if ($false_not_fix_flg.equalsIgnoreCase(name)) {
			false_not_fix_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itm_typ_p.equalsIgnoreCase(name)) {
			return itm_typ_p();
		}
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($ver_no_p.equalsIgnoreCase(name)) {
			return ver_no_p();
		}
		if ($sno_wrk_no_p.equalsIgnoreCase(name)) {
			return sno_wrk_no_p();
		}
		if ($itm_grp_p.equalsIgnoreCase(name)) {
			return itm_grp_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($itm_typ_p.equalsIgnoreCase(name)) {
			itm_typ_p(
				((MCContainerMeta) itm_typ_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0100.ItmTypR.class, value)
			);
			return;
		}
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
		if ($sno_wrk_no_p.equalsIgnoreCase(name)) {
			sno_wrk_no_p(
				((MCContainerMeta) sno_wrk_no_p_META).castInnerRow(mcframe.clientMSUB.MSUBP0020.SnoWrkNoR.class, value)
			);
			return;
		}
		if ($itm_grp_p.equalsIgnoreCase(name)) {
			itm_grp_p(
				((MCContainerMeta) itm_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0250.ItmGrpR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public String itm_typ() {
		return itm_typ_p().itm_typ();
	}

	public void itm_typ(String value) {
		itm_typ_p().itm_typ(value);
	}

	public String itm_typ_d_cd() {
		return itm_typ_p().itm_typ_d_cd();
	}

	public void itm_typ_d_cd(String value) {
		itm_typ_p().itm_typ_d_cd(value);
	}

	public String itm_typ_d_nm() {
		return itm_typ_p().itm_typ_d_nm();
	}

	public void itm_typ_d_nm(String value) {
		itm_typ_p().itm_typ_d_nm(value);
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

	public boolean itm_grp_flg1() {
		return itm_grp_p().itm_grp_flg1();
	}

	public void itm_grp_flg1(boolean value) {
		itm_grp_p().itm_grp_flg1(value);
	}

	public String itm_grp_cd1() {
		return itm_grp_p().itm_grp_cd1();
	}

	public void itm_grp_cd1(String value) {
		itm_grp_p().itm_grp_cd1(value);
	}

	public String itm_grp_nm1() {
		return itm_grp_p().itm_grp_nm1();
	}

	public void itm_grp_nm1(String value) {
		itm_grp_p().itm_grp_nm1(value);
	}

	public boolean itm_grp_flg2() {
		return itm_grp_p().itm_grp_flg2();
	}

	public void itm_grp_flg2(boolean value) {
		itm_grp_p().itm_grp_flg2(value);
	}

	public String itm_grp_cd2() {
		return itm_grp_p().itm_grp_cd2();
	}

	public void itm_grp_cd2(String value) {
		itm_grp_p().itm_grp_cd2(value);
	}

	public String itm_grp_nm2() {
		return itm_grp_p().itm_grp_nm2();
	}

	public void itm_grp_nm2(String value) {
		itm_grp_p().itm_grp_nm2(value);
	}

	public boolean itm_grp_flg3() {
		return itm_grp_p().itm_grp_flg3();
	}

	public void itm_grp_flg3(boolean value) {
		itm_grp_p().itm_grp_flg3(value);
	}

	public String itm_grp_cd3() {
		return itm_grp_p().itm_grp_cd3();
	}

	public void itm_grp_cd3(String value) {
		itm_grp_p().itm_grp_cd3(value);
	}

	public String itm_grp_nm3() {
		return itm_grp_p().itm_grp_nm3();
	}

	public void itm_grp_nm3(String value) {
		itm_grp_p().itm_grp_nm3(value);
	}

	public boolean itm_grp_flg4() {
		return itm_grp_p().itm_grp_flg4();
	}

	public void itm_grp_flg4(boolean value) {
		itm_grp_p().itm_grp_flg4(value);
	}

	public String itm_grp_cd4() {
		return itm_grp_p().itm_grp_cd4();
	}

	public void itm_grp_cd4(String value) {
		itm_grp_p().itm_grp_cd4(value);
	}

	public String itm_grp_nm4() {
		return itm_grp_p().itm_grp_nm4();
	}

	public void itm_grp_nm4(String value) {
		itm_grp_p().itm_grp_nm4(value);
	}

	public boolean itm_grp_flg5() {
		return itm_grp_p().itm_grp_flg5();
	}

	public void itm_grp_flg5(boolean value) {
		itm_grp_p().itm_grp_flg5(value);
	}

	public String itm_grp_cd5() {
		return itm_grp_p().itm_grp_cd5();
	}

	public void itm_grp_cd5(String value) {
		itm_grp_p().itm_grp_cd5(value);
	}

	public String itm_grp_nm5() {
		return itm_grp_p().itm_grp_nm5();
	}

	public void itm_grp_nm5(String value) {
		itm_grp_p().itm_grp_nm5(value);
	}

	public boolean itm_grp_flg6() {
		return itm_grp_p().itm_grp_flg6();
	}

	public void itm_grp_flg6(boolean value) {
		itm_grp_p().itm_grp_flg6(value);
	}

	public String itm_grp_cd6() {
		return itm_grp_p().itm_grp_cd6();
	}

	public void itm_grp_cd6(String value) {
		itm_grp_p().itm_grp_cd6(value);
	}

	public String itm_grp_nm6() {
		return itm_grp_p().itm_grp_nm6();
	}

	public void itm_grp_nm6(String value) {
		itm_grp_p().itm_grp_nm6(value);
	}

	public boolean itm_grp_flg7() {
		return itm_grp_p().itm_grp_flg7();
	}

	public void itm_grp_flg7(boolean value) {
		itm_grp_p().itm_grp_flg7(value);
	}

	public String itm_grp_cd7() {
		return itm_grp_p().itm_grp_cd7();
	}

	public void itm_grp_cd7(String value) {
		itm_grp_p().itm_grp_cd7(value);
	}

	public String itm_grp_nm7() {
		return itm_grp_p().itm_grp_nm7();
	}

	public void itm_grp_nm7(String value) {
		itm_grp_p().itm_grp_nm7(value);
	}

	public boolean itm_grp_flg8() {
		return itm_grp_p().itm_grp_flg8();
	}

	public void itm_grp_flg8(boolean value) {
		itm_grp_p().itm_grp_flg8(value);
	}

	public String itm_grp_cd8() {
		return itm_grp_p().itm_grp_cd8();
	}

	public void itm_grp_cd8(String value) {
		itm_grp_p().itm_grp_cd8(value);
	}

	public String itm_grp_nm8() {
		return itm_grp_p().itm_grp_nm8();
	}

	public void itm_grp_nm8(String value) {
		itm_grp_p().itm_grp_nm8(value);
	}

	public boolean itm_grp_flg9() {
		return itm_grp_p().itm_grp_flg9();
	}

	public void itm_grp_flg9(boolean value) {
		itm_grp_p().itm_grp_flg9(value);
	}

	public String itm_grp_cd9() {
		return itm_grp_p().itm_grp_cd9();
	}

	public void itm_grp_cd9(String value) {
		itm_grp_p().itm_grp_cd9(value);
	}

	public String itm_grp_nm9() {
		return itm_grp_p().itm_grp_nm9();
	}

	public void itm_grp_nm9(String value) {
		itm_grp_p().itm_grp_nm9(value);
	}

	public boolean itm_grp_flg10() {
		return itm_grp_p().itm_grp_flg10();
	}

	public void itm_grp_flg10(boolean value) {
		itm_grp_p().itm_grp_flg10(value);
	}

	public String itm_grp_cd10() {
		return itm_grp_p().itm_grp_cd10();
	}

	public void itm_grp_cd10(String value) {
		itm_grp_p().itm_grp_cd10(value);
	}

	public String itm_grp_nm10() {
		return itm_grp_p().itm_grp_nm10();
	}

	public void itm_grp_nm10(String value) {
		itm_grp_p().itm_grp_nm10(value);
	}

}

