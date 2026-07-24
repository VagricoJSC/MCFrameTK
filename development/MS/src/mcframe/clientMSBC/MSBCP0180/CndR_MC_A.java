package mcframe.clientMSBC.MSBCP0180;

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
	 * SRCH_STK,Inventory generation base,1;SRCH_ASST,Asset generation base,2;SRCH_USE,Available date base,3; SRCH_STK,在庫発生基準,1;SRCH_ASST,資産発生基準,2;SRCH_USE,使用可能日基準,3;.<p>
	 *
	 */
	public static final String $ope = "ope";
	/**
	 * Long LT order 先行手配.<p>
	 *
	 */
	public static final String $gr_prcd_flg = "gr_prcd_flg";
	/**
	 * Unfirm 未確定.<p>
	 *
	 */
	public static final String $gr_sts_opn_grp_flg = "gr_sts_opn_grp_flg";
	/**
	 * Order save オーダ保存.<p>
	 *
	 */
	public static final String $gr_sts_ordsav_grp_flg = "gr_sts_ordsav_grp_flg";
	/**
	 * Request 依頼.<p>
	 *
	 */
	public static final String $gr_sts_fix_grp_flg = "gr_sts_fix_grp_flg";
	/**
	 * Schedule 予定.<p>
	 *
	 */
	public static final String $gr_sts_schd_grp_flg = "gr_sts_schd_grp_flg";
	/**
	 * Order 指図.<p>
	 *
	 */
	public static final String $gr_sts_ord_grp_flg = "gr_sts_ord_grp_flg";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $gr_act_flg = "gr_act_flg";
	/**
	 * Long LT order 先行手配.<p>
	 *
	 */
	public static final String $gi_prcd_flg = "gi_prcd_flg";
	/**
	 * Unfirm 未確定.<p>
	 *
	 */
	public static final String $gi_sts_opn_grp_flg = "gi_sts_opn_grp_flg";
	/**
	 * Order save オーダ保存.<p>
	 *
	 */
	public static final String $gi_sts_ordsav_grp_flg = "gi_sts_ordsav_grp_flg";
	/**
	 * Request 依頼.<p>
	 *
	 */
	public static final String $gi_sts_fix_grp_flg = "gi_sts_fix_grp_flg";
	/**
	 * Schedule 予定.<p>
	 *
	 */
	public static final String $gi_sts_schd_grp_flg = "gi_sts_schd_grp_flg";
	/**
	 * Order 指図.<p>
	 *
	 */
	public static final String $gi_sts_ord_grp_flg = "gi_sts_ord_grp_flg";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $gi_act_flg = "gi_act_flg";
	/**
	 * Period FROM 期間ＦＲＯＭ.<p>
	 *
	 */
	public static final String $dt_fr = "dt_fr";
	/**
	 * Period TO 期間ＴＯ.<p>
	 *
	 */
	public static final String $dt_to = "dt_to";
	/**
	 * With missing goods only 欠品ありのみ.<p>
	 *
	 */
	public static final String $missing_flg = "missing_flg";
	/**
	 * Simulation No. シミュレーションＮＯ.<p>
	 *
	 */
	public static final String $sim_mrp_no = "sim_mrp_no";
	/**
	 * Only with simulation シミュレーションありのみ.<p>
	 *
	 */
	public static final String $sim_flg = "sim_flg";
	/**
	 * Scheduled purchase change date FROM 購買切替予定日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $purc_dt_fr = "purc_dt_fr";
	/**
	 * Scheduled purchase change date TO 購買切替予定日ＴＯ.<p>
	 *
	 */
	public static final String $purc_dt_to = "purc_dt_to";
	/**
	 * For version control only 版管理対象のみ.<p>
	 *
	 */
	public static final String $tgt_ver_flg = "tgt_ver_flg";
	/**
	 * Incomplete version only 未完了版のみ.<p>
	 *
	 */
	public static final String $non_cmpl_ver_flg = "non_cmpl_ver_flg";
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public static final String $loc_nm = "loc_nm";
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $site_cd = "site_cd";
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public static final String $site_nm = "site_nm";
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
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public static final String $lg_grp_cd = "lg_grp_cd";
	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public static final String $lg_grp_nm = "lg_grp_nm";
	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public static final String $alloc_grp_cd = "alloc_grp_cd";
	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public static final String $alloc_grp_nm = "alloc_grp_nm";
	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public static final String $loc_grp_cd = "loc_grp_cd";
	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public static final String $loc_grp_nm = "loc_grp_nm";
	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public static final String $quality_typ = "quality_typ";
	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public static final String $quality_typ_nm = "quality_typ_nm";
	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public static final String $gd_cd = "gd_cd";
	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public static final String $gd_nm = "gd_nm";
	public static final String $itm_typ_p = "itm_typ_p";
	public static final String $itm_p = "itm_p";
	public static final String $ver_no_p = "ver_no_p";
	public static final String $sno_p = "sno_p";
	public static final String $par_itm_p = "par_itm_p";
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public static final String $bom_ptn = "bom_ptn";
	/**
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public static final String $master_dt = "master_dt";
	/**
	 * Allocated input/GI schedule only 引当済の投入・出庫予定のみ.<p>
	 *
	 */
	public static final String $alloc_gi_flg = "alloc_gi_flg";
	public static final String $itm_grp_p = "itm_grp_p";
	/**
	 * 0,Location;1,Factory/Distribution warehouse;2,WG;3,Distribution G;4,Gross allocation location G;5,Mfg. location G; 0,場所;1,工場・物流倉庫;2,ＷＧ;3,物流Ｇ;4,総量引当場所Ｇ;5,製造場所Ｇ;.<p>
	 *
	 */
	public static final String $disp_typ = "disp_typ";
	public static final String $sno_flg_p = "sno_flg_p";
	/**
	 * Display key column キー項目表示.<p>
	 *
	 */
	public static final String $key_flg = "key_flg";
	/**
	 * Aggregated unit type 集計単位区分.<p>
	 *
	 */
	public static final String $sum_unit_typ = "sum_unit_typ";
	/**
	 * Closing date 締日.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";

	public static final String $itm_typ = $itm_typ_p + ".itm_typ";
	public static final String $itm_typ_nm = $itm_typ_p + ".itm_typ_nm";
	public static final String $itm_typ_d_cd = $itm_typ_p + ".itm_typ_d_cd";
	public static final String $itm_typ_d_nm = $itm_typ_p + ".itm_typ_d_nm";
	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $ver_no = $ver_no_p + ".ver_no";
	public static final String $sno1 = $sno_p + ".sno1";
	public static final String $sno2 = $sno_p + ".sno2";
	public static final String $sno3 = $sno_p + ".sno3";
	public static final String $sno4 = $sno_p + ".sno4";
	public static final String $wrk_no = $sno_p + ".wrk_no";
	public static final String $wrk_nm = $sno_p + ".wrk_nm";
	public static final String $par_itm_cd = $par_itm_p + ".itm_cd";
	public static final String $par_itm_sub1 = $par_itm_p + ".itm_sub1";
	public static final String $par_itm_sub2 = $par_itm_p + ".itm_sub2";
	public static final String $par_itm_sub3 = $par_itm_p + ".itm_sub3";
	public static final String $par_itm_nm = $par_itm_p + ".itm_nm";
	public static final String $itm_grp_lab1 = $itm_grp_p + ".itm_grp_lab1";
	public static final String $itm_grp_flg1 = $itm_grp_p + ".itm_grp_flg1";
	public static final String $itm_grp_cd1 = $itm_grp_p + ".itm_grp_cd1";
	public static final String $itm_grp_nm1 = $itm_grp_p + ".itm_grp_nm1";
	public static final String $itm_grp_lab2 = $itm_grp_p + ".itm_grp_lab2";
	public static final String $itm_grp_flg2 = $itm_grp_p + ".itm_grp_flg2";
	public static final String $itm_grp_cd2 = $itm_grp_p + ".itm_grp_cd2";
	public static final String $itm_grp_nm2 = $itm_grp_p + ".itm_grp_nm2";
	public static final String $itm_grp_lab3 = $itm_grp_p + ".itm_grp_lab3";
	public static final String $itm_grp_flg3 = $itm_grp_p + ".itm_grp_flg3";
	public static final String $itm_grp_cd3 = $itm_grp_p + ".itm_grp_cd3";
	public static final String $itm_grp_nm3 = $itm_grp_p + ".itm_grp_nm3";
	public static final String $itm_grp_lab4 = $itm_grp_p + ".itm_grp_lab4";
	public static final String $itm_grp_flg4 = $itm_grp_p + ".itm_grp_flg4";
	public static final String $itm_grp_cd4 = $itm_grp_p + ".itm_grp_cd4";
	public static final String $itm_grp_nm4 = $itm_grp_p + ".itm_grp_nm4";
	public static final String $itm_grp_lab5 = $itm_grp_p + ".itm_grp_lab5";
	public static final String $itm_grp_flg5 = $itm_grp_p + ".itm_grp_flg5";
	public static final String $itm_grp_cd5 = $itm_grp_p + ".itm_grp_cd5";
	public static final String $itm_grp_nm5 = $itm_grp_p + ".itm_grp_nm5";
	public static final String $itm_grp_lab6 = $itm_grp_p + ".itm_grp_lab6";
	public static final String $itm_grp_flg6 = $itm_grp_p + ".itm_grp_flg6";
	public static final String $itm_grp_cd6 = $itm_grp_p + ".itm_grp_cd6";
	public static final String $itm_grp_nm6 = $itm_grp_p + ".itm_grp_nm6";
	public static final String $itm_grp_lab7 = $itm_grp_p + ".itm_grp_lab7";
	public static final String $itm_grp_flg7 = $itm_grp_p + ".itm_grp_flg7";
	public static final String $itm_grp_cd7 = $itm_grp_p + ".itm_grp_cd7";
	public static final String $itm_grp_nm7 = $itm_grp_p + ".itm_grp_nm7";
	public static final String $itm_grp_lab8 = $itm_grp_p + ".itm_grp_lab8";
	public static final String $itm_grp_flg8 = $itm_grp_p + ".itm_grp_flg8";
	public static final String $itm_grp_cd8 = $itm_grp_p + ".itm_grp_cd8";
	public static final String $itm_grp_nm8 = $itm_grp_p + ".itm_grp_nm8";
	public static final String $itm_grp_lab9 = $itm_grp_p + ".itm_grp_lab9";
	public static final String $itm_grp_flg9 = $itm_grp_p + ".itm_grp_flg9";
	public static final String $itm_grp_cd9 = $itm_grp_p + ".itm_grp_cd9";
	public static final String $itm_grp_nm9 = $itm_grp_p + ".itm_grp_nm9";
	public static final String $itm_grp_lab10 = $itm_grp_p + ".itm_grp_lab10";
	public static final String $itm_grp_flg10 = $itm_grp_p + ".itm_grp_flg10";
	public static final String $itm_grp_cd10 = $itm_grp_p + ".itm_grp_cd10";
	public static final String $itm_grp_nm10 = $itm_grp_p + ".itm_grp_nm10";
	public static final String $sno1_flg = $sno_flg_p + ".sno1_flg";
	public static final String $sno2_flg = $sno_flg_p + ".sno2_flg";
	public static final String $sno3_flg = $sno_flg_p + ".sno3_flg";
	public static final String $sno4_flg = $sno_flg_p + ".sno4_flg";

	public static final MCMeta ope_META = createStringMeta($ope);
	public static final MCMeta gr_prcd_flg_META = createCommonMeta($gr_prcd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gr_sts_opn_grp_flg_META = createCommonMeta($gr_sts_opn_grp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gr_sts_ordsav_grp_flg_META = createCommonMeta($gr_sts_ordsav_grp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gr_sts_fix_grp_flg_META = createCommonMeta($gr_sts_fix_grp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gr_sts_schd_grp_flg_META = createCommonMeta($gr_sts_schd_grp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gr_sts_ord_grp_flg_META = createCommonMeta($gr_sts_ord_grp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gr_act_flg_META = createCommonMeta($gr_act_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gi_prcd_flg_META = createCommonMeta($gi_prcd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gi_sts_opn_grp_flg_META = createCommonMeta($gi_sts_opn_grp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gi_sts_ordsav_grp_flg_META = createCommonMeta($gi_sts_ordsav_grp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gi_sts_fix_grp_flg_META = createCommonMeta($gi_sts_fix_grp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gi_sts_schd_grp_flg_META = createCommonMeta($gi_sts_schd_grp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gi_sts_ord_grp_flg_META = createCommonMeta($gi_sts_ord_grp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gi_act_flg_META = createCommonMeta($gi_act_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dt_fr_META = createCommonMeta($dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dt_to_META = createCommonMeta($dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta missing_flg_META = createCommonMeta($missing_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sim_mrp_no_META = createCommonMeta($sim_mrp_no, mcframe.commonMA.meta.MA_META.SIM_MRP_NO);
	public static final MCMeta sim_flg_META = createCommonMeta($sim_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_dt_fr_META = createCommonMeta($purc_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta purc_dt_to_META = createCommonMeta($purc_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta tgt_ver_flg_META = createCommonMeta($tgt_ver_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta non_cmpl_ver_flg_META = createCommonMeta($non_cmpl_ver_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta site_nm_META = createCommonMeta($site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta lg_grp_cd_META = createCommonMeta($lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta lg_grp_nm_META = createCommonMeta($lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta alloc_grp_cd_META = createCommonMeta($alloc_grp_cd, mcframe.commonMA.meta.MA_META.ALLOC_GRP_CD);
	public static final MCMeta alloc_grp_nm_META = createCommonMeta($alloc_grp_nm, mcframe.commonMA.meta.MA_META.ALLOC_GRP_NM);
	public static final MCMeta loc_grp_cd_META = createCommonMeta($loc_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta loc_grp_nm_META = createCommonMeta($loc_grp_nm, mcframe.commonMA.meta.MA_META.LOC_GRP_NM);
	public static final MCMeta quality_typ_META = createCommonMeta($quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta quality_typ_nm_META = createCommonMeta($quality_typ_nm, mcframe.commonMA.meta.MA_META.QUALITY_TYP_NM);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta gd_nm_META = createCommonMeta($gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta itm_typ_p_META = createInnerRowMeta($itm_typ_p, mcframe.clientMAUB.MAUBP0100.ItmTypR.class);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta ver_no_p_META = createInnerRowMeta($ver_no_p, mcframe.clientMAUB.MAUBP0340.VerNoR.class);
	public static final MCMeta sno_p_META = createInnerRowMeta($sno_p, mcframe.clientMSUB.MSUBP0020.SnoWrkNoR.class);
	public static final MCMeta par_itm_p_META = createInnerRowMeta($par_itm_p, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta bom_ptn_META = createCommonMeta($bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta master_dt_META = createCommonMeta($master_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta alloc_gi_flg_META = createCommonMeta($alloc_gi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_p_META = createInnerRowMeta($itm_grp_p, mcframe.clientMAUB.MAUBP0250.ItmGrpR.class);
	public static final MCMeta disp_typ_META = createStringMeta($disp_typ);
	public static final MCMeta sno_flg_p_META = createInnerRowMeta($sno_flg_p, mcframe.clientMAUB.MAUBP0440.SnoFlgR.class);
	public static final MCMeta key_flg_META = createCommonMeta($key_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sum_unit_typ_META = createCommonMeta($sum_unit_typ, mcframe.commonMS.meta.MS_META.SUM_UNIT_TYP);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			gr_prcd_flg_META,
			gr_sts_opn_grp_flg_META,
			gr_sts_ordsav_grp_flg_META,
			gr_sts_fix_grp_flg_META,
			gr_sts_schd_grp_flg_META,
			gr_sts_ord_grp_flg_META,
			gr_act_flg_META,
			gi_prcd_flg_META,
			gi_sts_opn_grp_flg_META,
			gi_sts_ordsav_grp_flg_META,
			gi_sts_fix_grp_flg_META,
			gi_sts_schd_grp_flg_META,
			gi_sts_ord_grp_flg_META,
			gi_act_flg_META,
			dt_fr_META,
			dt_to_META,
			missing_flg_META,
			sim_mrp_no_META,
			sim_flg_META,
			purc_dt_fr_META,
			purc_dt_to_META,
			tgt_ver_flg_META,
			non_cmpl_ver_flg_META,
			loc_cd_META,
			loc_nm_META,
			site_cd_META,
			site_nm_META,
			wg_cd_META,
			wg_nm_META,
			lg_grp_cd_META,
			lg_grp_nm_META,
			alloc_grp_cd_META,
			alloc_grp_nm_META,
			loc_grp_cd_META,
			loc_grp_nm_META,
			quality_typ_META,
			quality_typ_nm_META,
			gd_cd_META,
			gd_nm_META,
			itm_typ_p_META,
			itm_p_META,
			ver_no_p_META,
			sno_p_META,
			par_itm_p_META,
			bom_ptn_META,
			master_dt_META,
			alloc_gi_flg_META,
			itm_grp_p_META,
			disp_typ_META,
			sno_flg_p_META,
			key_flg_META,
			sum_unit_typ_META,
			ac_dt_META
		},
		new String[][]{
			{
				"itm_typ",
				"itm_typ_nm",
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
				"par_itm_cd",
				"par_itm_sub1",
				"par_itm_sub2",
				"par_itm_sub3",
				"par_itm_nm",
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
				"itm_grp_nm10",
				"sno1_flg",
				"sno2_flg",
				"sno3_flg",
				"sno4_flg"
			},
			{
				$itm_typ,
				$itm_typ_nm,
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
				$par_itm_cd,
				$par_itm_sub1,
				$par_itm_sub2,
				$par_itm_sub3,
				$par_itm_nm,
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
				$itm_grp_nm10,
				$sno1_flg,
				$sno2_flg,
				$sno3_flg,
				$sno4_flg
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
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;itm_sub1"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;itm_sub1;itm_sub2"},	// itm_p.itm_sub3
				{$par_itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3"},	// par_itm_p.itm_cd
				{$par_itm_p + ".itm_sub1", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;par_itm_cd"},	// par_itm_p.itm_sub1
				{$par_itm_p + ".itm_sub2", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;par_itm_cd;par_itm_sub1"},	// par_itm_p.itm_sub2
				{$par_itm_p + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;par_itm_cd;par_itm_sub1;par_itm_sub2"},	// par_itm_p.itm_sub3
				{$bom_ptn, "par_itm_cd;par_itm_sub1;par_itm_sub2;par_itm_sub3;wg_cd"}	// bom_ptn
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$itm_p + ".itm_cd", "itm_is_srch_typ"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "itm_is_srch_typ;itm_cd"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "itm_is_srch_typ;itm_cd;itm_sub1"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"},	// itm_p.itm_sub3
				{$par_itm_p + ".itm_cd", "itm_is_srch_typ"},	// par_itm_p.itm_cd
				{$par_itm_p + ".itm_sub1", "itm_is_srch_typ;itm_cd"},	// par_itm_p.itm_sub1
				{$par_itm_p + ".itm_sub2", "itm_is_srch_typ;itm_cd;itm_sub1"},	// par_itm_p.itm_sub2
				{$par_itm_p + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"},	// par_itm_p.itm_sub3
				{$bom_ptn, "par_itm_cd;par_itm_sub1;par_itm_sub2;par_itm_sub3;wg_cd"}	// bom_ptn
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$purc_dt_fr, "VER_NO"},	// purc_dt_fr
				{$purc_dt_to, "VER_NO"},	// purc_dt_to
				{$tgt_ver_flg, "VER_NO"},	// tgt_ver_flg
				{$non_cmpl_ver_flg, "VER_NO"},	// non_cmpl_ver_flg
				{$site_cd, "SITE"},	// site_cd
				{$site_nm, "SITE"},	// site_nm
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"},	// wg_nm
				{$lg_grp_cd, "LG_GRP"},	// lg_grp_cd
				{$lg_grp_nm, "LG_GRP"},	// lg_grp_nm
				{$alloc_grp_cd, "ALLOC_GRP"},	// alloc_grp_cd
				{$alloc_grp_nm, "ALLOC_GRP"},	// alloc_grp_nm
				{$loc_grp_cd, "LOC_GRP"},	// loc_grp_cd
				{$loc_grp_nm, "LOC_GRP"},	// loc_grp_nm
				{$gd_cd, "STK_GD"},	// gd_cd
				{$gd_nm, "STK_GD"}	// gd_nm
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
	 * SRCH_STK,Inventory generation base,1;SRCH_ASST,Asset generation base,2;SRCH_USE,Available date base,3; SRCH_STK,在庫発生基準,1;SRCH_ASST,資産発生基準,2;SRCH_USE,使用可能日基準,3;.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * SRCH_STK,Inventory generation base,1;SRCH_ASST,Asset generation base,2;SRCH_USE,Available date base,3; SRCH_STK,在庫発生基準,1;SRCH_ASST,資産発生基準,2;SRCH_USE,使用可能日基準,3;.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	/**
	 * Long LT order 先行手配.<p>
	 *
	 */
	public boolean gr_prcd_flg() {
		return getConstBoolean(offset + 1, $gr_prcd_flg);
	}

	/**
	 * Long LT order 先行手配.<p>
	 *
	 */
	public void gr_prcd_flg(boolean value) {
		setConstBoolean(offset + 1, $gr_prcd_flg, value);
	}


	/**
	 * Unfirm 未確定.<p>
	 *
	 */
	public boolean gr_sts_opn_grp_flg() {
		return getConstBoolean(offset + 2, $gr_sts_opn_grp_flg);
	}

	/**
	 * Unfirm 未確定.<p>
	 *
	 */
	public void gr_sts_opn_grp_flg(boolean value) {
		setConstBoolean(offset + 2, $gr_sts_opn_grp_flg, value);
	}


	/**
	 * Order save オーダ保存.<p>
	 *
	 */
	public boolean gr_sts_ordsav_grp_flg() {
		return getConstBoolean(offset + 3, $gr_sts_ordsav_grp_flg);
	}

	/**
	 * Order save オーダ保存.<p>
	 *
	 */
	public void gr_sts_ordsav_grp_flg(boolean value) {
		setConstBoolean(offset + 3, $gr_sts_ordsav_grp_flg, value);
	}


	/**
	 * Request 依頼.<p>
	 *
	 */
	public boolean gr_sts_fix_grp_flg() {
		return getConstBoolean(offset + 4, $gr_sts_fix_grp_flg);
	}

	/**
	 * Request 依頼.<p>
	 *
	 */
	public void gr_sts_fix_grp_flg(boolean value) {
		setConstBoolean(offset + 4, $gr_sts_fix_grp_flg, value);
	}


	/**
	 * Schedule 予定.<p>
	 *
	 */
	public boolean gr_sts_schd_grp_flg() {
		return getConstBoolean(offset + 5, $gr_sts_schd_grp_flg);
	}

	/**
	 * Schedule 予定.<p>
	 *
	 */
	public void gr_sts_schd_grp_flg(boolean value) {
		setConstBoolean(offset + 5, $gr_sts_schd_grp_flg, value);
	}


	/**
	 * Order 指図.<p>
	 *
	 */
	public boolean gr_sts_ord_grp_flg() {
		return getConstBoolean(offset + 6, $gr_sts_ord_grp_flg);
	}

	/**
	 * Order 指図.<p>
	 *
	 */
	public void gr_sts_ord_grp_flg(boolean value) {
		setConstBoolean(offset + 6, $gr_sts_ord_grp_flg, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public boolean gr_act_flg() {
		return getConstBoolean(offset + 7, $gr_act_flg);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void gr_act_flg(boolean value) {
		setConstBoolean(offset + 7, $gr_act_flg, value);
	}


	/**
	 * Long LT order 先行手配.<p>
	 *
	 */
	public boolean gi_prcd_flg() {
		return getConstBoolean(offset + 8, $gi_prcd_flg);
	}

	/**
	 * Long LT order 先行手配.<p>
	 *
	 */
	public void gi_prcd_flg(boolean value) {
		setConstBoolean(offset + 8, $gi_prcd_flg, value);
	}


	/**
	 * Unfirm 未確定.<p>
	 *
	 */
	public boolean gi_sts_opn_grp_flg() {
		return getConstBoolean(offset + 9, $gi_sts_opn_grp_flg);
	}

	/**
	 * Unfirm 未確定.<p>
	 *
	 */
	public void gi_sts_opn_grp_flg(boolean value) {
		setConstBoolean(offset + 9, $gi_sts_opn_grp_flg, value);
	}


	/**
	 * Order save オーダ保存.<p>
	 *
	 */
	public boolean gi_sts_ordsav_grp_flg() {
		return getConstBoolean(offset + 10, $gi_sts_ordsav_grp_flg);
	}

	/**
	 * Order save オーダ保存.<p>
	 *
	 */
	public void gi_sts_ordsav_grp_flg(boolean value) {
		setConstBoolean(offset + 10, $gi_sts_ordsav_grp_flg, value);
	}


	/**
	 * Request 依頼.<p>
	 *
	 */
	public boolean gi_sts_fix_grp_flg() {
		return getConstBoolean(offset + 11, $gi_sts_fix_grp_flg);
	}

	/**
	 * Request 依頼.<p>
	 *
	 */
	public void gi_sts_fix_grp_flg(boolean value) {
		setConstBoolean(offset + 11, $gi_sts_fix_grp_flg, value);
	}


	/**
	 * Schedule 予定.<p>
	 *
	 */
	public boolean gi_sts_schd_grp_flg() {
		return getConstBoolean(offset + 12, $gi_sts_schd_grp_flg);
	}

	/**
	 * Schedule 予定.<p>
	 *
	 */
	public void gi_sts_schd_grp_flg(boolean value) {
		setConstBoolean(offset + 12, $gi_sts_schd_grp_flg, value);
	}


	/**
	 * Order 指図.<p>
	 *
	 */
	public boolean gi_sts_ord_grp_flg() {
		return getConstBoolean(offset + 13, $gi_sts_ord_grp_flg);
	}

	/**
	 * Order 指図.<p>
	 *
	 */
	public void gi_sts_ord_grp_flg(boolean value) {
		setConstBoolean(offset + 13, $gi_sts_ord_grp_flg, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public boolean gi_act_flg() {
		return getConstBoolean(offset + 14, $gi_act_flg);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void gi_act_flg(boolean value) {
		setConstBoolean(offset + 14, $gi_act_flg, value);
	}


	/**
	 * Period FROM 期間ＦＲＯＭ.<p>
	 *
	 */
	public MCDate dt_fr() {
		return getConstDate(offset + 15, $dt_fr);
	}

	/**
	 * Period FROM 期間ＦＲＯＭ.<p>
	 *
	 */
	public void dt_fr(MCDate value) {
		setConstDate(offset + 15, $dt_fr, value);
	}


	/**
	 * Period TO 期間ＴＯ.<p>
	 *
	 */
	public MCDate dt_to() {
		return getConstDate(offset + 16, $dt_to);
	}

	/**
	 * Period TO 期間ＴＯ.<p>
	 *
	 */
	public void dt_to(MCDate value) {
		setConstDate(offset + 16, $dt_to, value);
	}


	/**
	 * With missing goods only 欠品ありのみ.<p>
	 *
	 */
	public boolean missing_flg() {
		return getConstBoolean(offset + 17, $missing_flg);
	}

	/**
	 * With missing goods only 欠品ありのみ.<p>
	 *
	 */
	public void missing_flg(boolean value) {
		setConstBoolean(offset + 17, $missing_flg, value);
	}


	/**
	 * Simulation No. シミュレーションＮＯ.<p>
	 *
	 */
	public String sim_mrp_no() {
		return getConstString(offset + 18, $sim_mrp_no);
	}

	/**
	 * Simulation No. シミュレーションＮＯ.<p>
	 *
	 */
	public void sim_mrp_no(String value) {
		setConstString(offset + 18, $sim_mrp_no, value);
	}


	/**
	 * Only with simulation シミュレーションありのみ.<p>
	 *
	 */
	public boolean sim_flg() {
		return getConstBoolean(offset + 19, $sim_flg);
	}

	/**
	 * Only with simulation シミュレーションありのみ.<p>
	 *
	 */
	public void sim_flg(boolean value) {
		setConstBoolean(offset + 19, $sim_flg, value);
	}


	/**
	 * Scheduled purchase change date FROM 購買切替予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate purc_dt_fr() {
		return getConstDate(offset + 20, $purc_dt_fr);
	}

	/**
	 * Scheduled purchase change date FROM 購買切替予定日ＦＲＯＭ.<p>
	 *
	 */
	public void purc_dt_fr(MCDate value) {
		setConstDate(offset + 20, $purc_dt_fr, value);
	}


	/**
	 * Scheduled purchase change date TO 購買切替予定日ＴＯ.<p>
	 *
	 */
	public MCDate purc_dt_to() {
		return getConstDate(offset + 21, $purc_dt_to);
	}

	/**
	 * Scheduled purchase change date TO 購買切替予定日ＴＯ.<p>
	 *
	 */
	public void purc_dt_to(MCDate value) {
		setConstDate(offset + 21, $purc_dt_to, value);
	}


	/**
	 * For version control only 版管理対象のみ.<p>
	 *
	 */
	public boolean tgt_ver_flg() {
		return getConstBoolean(offset + 22, $tgt_ver_flg);
	}

	/**
	 * For version control only 版管理対象のみ.<p>
	 *
	 */
	public void tgt_ver_flg(boolean value) {
		setConstBoolean(offset + 22, $tgt_ver_flg, value);
	}


	/**
	 * Incomplete version only 未完了版のみ.<p>
	 *
	 */
	public boolean non_cmpl_ver_flg() {
		return getConstBoolean(offset + 23, $non_cmpl_ver_flg);
	}

	/**
	 * Incomplete version only 未完了版のみ.<p>
	 *
	 */
	public void non_cmpl_ver_flg(boolean value) {
		setConstBoolean(offset + 23, $non_cmpl_ver_flg, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 24, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 24, $loc_cd, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 25, $loc_nm);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 25, $loc_nm, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 26, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 26, $site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 27, $site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 27, $site_nm, value);
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
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public String lg_grp_cd() {
		return getConstString(offset + 30, $lg_grp_cd);
	}

	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public void lg_grp_cd(String value) {
		setConstString(offset + 30, $lg_grp_cd, value);
	}


	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public String lg_grp_nm() {
		return getConstString(offset + 31, $lg_grp_nm);
	}

	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public void lg_grp_nm(String value) {
		setConstString(offset + 31, $lg_grp_nm, value);
	}


	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public String alloc_grp_cd() {
		return getConstString(offset + 32, $alloc_grp_cd);
	}

	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public void alloc_grp_cd(String value) {
		setConstString(offset + 32, $alloc_grp_cd, value);
	}


	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public String alloc_grp_nm() {
		return getConstString(offset + 33, $alloc_grp_nm);
	}

	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public void alloc_grp_nm(String value) {
		setConstString(offset + 33, $alloc_grp_nm, value);
	}


	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public String loc_grp_cd() {
		return getConstString(offset + 34, $loc_grp_cd);
	}

	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public void loc_grp_cd(String value) {
		setConstString(offset + 34, $loc_grp_cd, value);
	}


	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public String loc_grp_nm() {
		return getConstString(offset + 35, $loc_grp_nm);
	}

	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public void loc_grp_nm(String value) {
		setConstString(offset + 35, $loc_grp_nm, value);
	}


	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return getConstString(offset + 36, $quality_typ);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		setConstString(offset + 36, $quality_typ, value);
	}


	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public String quality_typ_nm() {
		return getConstString(offset + 37, $quality_typ_nm);
	}

	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public void quality_typ_nm(String value) {
		setConstString(offset + 37, $quality_typ_nm, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 38, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 38, $gd_cd, value);
	}


	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 39, $gd_nm);
	}

	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 39, $gd_nm, value);
	}


	public mcframe.clientMAUB.MAUBP0100.ItmTypR itm_typ_p(){
		return (mcframe.clientMAUB.MAUBP0100.ItmTypR) getConstInnerRow(offset + 40, $itm_typ_p);
	}
	
	public void itm_typ_p(mcframe.clientMAUB.MAUBP0100.ItmTypR row){
		setConstInnerRow(offset + 40, $itm_typ_p, row);
	}


	public mcframe.clientMAUB.MAUBP0030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 41, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 41, $itm_p, row);
	}


	public mcframe.clientMAUB.MAUBP0340.VerNoR ver_no_p(){
		return (mcframe.clientMAUB.MAUBP0340.VerNoR) getConstInnerRow(offset + 42, $ver_no_p);
	}
	
	public void ver_no_p(mcframe.clientMAUB.MAUBP0340.VerNoR row){
		setConstInnerRow(offset + 42, $ver_no_p, row);
	}


	public mcframe.clientMSUB.MSUBP0020.SnoWrkNoR sno_p(){
		return (mcframe.clientMSUB.MSUBP0020.SnoWrkNoR) getConstInnerRow(offset + 43, $sno_p);
	}
	
	public void sno_p(mcframe.clientMSUB.MSUBP0020.SnoWrkNoR row){
		setConstInnerRow(offset + 43, $sno_p, row);
	}


	public mcframe.clientMAUB.MAUBP0030.ItmR par_itm_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 44, $par_itm_p);
	}
	
	public void par_itm_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 44, $par_itm_p, row);
	}


	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return getConstString(offset + 45, $bom_ptn);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		setConstString(offset + 45, $bom_ptn, value);
	}


	/**
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public MCDate master_dt() {
		return getConstDate(offset + 46, $master_dt);
	}

	/**
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public void master_dt(MCDate value) {
		setConstDate(offset + 46, $master_dt, value);
	}


	/**
	 * Allocated input/GI schedule only 引当済の投入・出庫予定のみ.<p>
	 *
	 */
	public boolean alloc_gi_flg() {
		return getConstBoolean(offset + 47, $alloc_gi_flg);
	}

	/**
	 * Allocated input/GI schedule only 引当済の投入・出庫予定のみ.<p>
	 *
	 */
	public void alloc_gi_flg(boolean value) {
		setConstBoolean(offset + 47, $alloc_gi_flg, value);
	}


	public mcframe.clientMAUB.MAUBP0250.ItmGrpR itm_grp_p(){
		return (mcframe.clientMAUB.MAUBP0250.ItmGrpR) getConstInnerRow(offset + 48, $itm_grp_p);
	}
	
	public void itm_grp_p(mcframe.clientMAUB.MAUBP0250.ItmGrpR row){
		setConstInnerRow(offset + 48, $itm_grp_p, row);
	}


	/**
	 * 0,Location;1,Factory/Distribution warehouse;2,WG;3,Distribution G;4,Gross allocation location G;5,Mfg. location G; 0,場所;1,工場・物流倉庫;2,ＷＧ;3,物流Ｇ;4,総量引当場所Ｇ;5,製造場所Ｇ;.<p>
	 *
	 */
	public String disp_typ() {
		return getConstString(offset + 49, $disp_typ);
	}

	/**
	 * 0,Location;1,Factory/Distribution warehouse;2,WG;3,Distribution G;4,Gross allocation location G;5,Mfg. location G; 0,場所;1,工場・物流倉庫;2,ＷＧ;3,物流Ｇ;4,総量引当場所Ｇ;5,製造場所Ｇ;.<p>
	 *
	 */
	public void disp_typ(String value) {
		setConstString(offset + 49, $disp_typ, value);
	}


	public mcframe.clientMAUB.MAUBP0440.SnoFlgR sno_flg_p(){
		return (mcframe.clientMAUB.MAUBP0440.SnoFlgR) getConstInnerRow(offset + 50, $sno_flg_p);
	}
	
	public void sno_flg_p(mcframe.clientMAUB.MAUBP0440.SnoFlgR row){
		setConstInnerRow(offset + 50, $sno_flg_p, row);
	}


	/**
	 * Display key column キー項目表示.<p>
	 *
	 */
	public boolean key_flg() {
		return getConstBoolean(offset + 51, $key_flg);
	}

	/**
	 * Display key column キー項目表示.<p>
	 *
	 */
	public void key_flg(boolean value) {
		setConstBoolean(offset + 51, $key_flg, value);
	}


	/**
	 * Aggregated unit type 集計単位区分.<p>
	 *
	 */
	public String sum_unit_typ() {
		return getConstString(offset + 52, $sum_unit_typ);
	}

	/**
	 * Aggregated unit type 集計単位区分.<p>
	 *
	 */
	public void sum_unit_typ(String value) {
		setConstString(offset + 52, $sum_unit_typ, value);
	}


	/**
	 * Closing date 締日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 53, $ac_dt);
	}

	/**
	 * Closing date 締日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 53, $ac_dt, value);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($sim_mrp_no.equalsIgnoreCase(name)) {
			return sim_mrp_no();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			return lg_grp_nm();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			return alloc_grp_nm();
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			return loc_grp_cd();
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			return loc_grp_nm();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			return quality_typ_nm();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($disp_typ.equalsIgnoreCase(name)) {
			return disp_typ();
		}
		if ($sum_unit_typ.equalsIgnoreCase(name)) {
			return sum_unit_typ();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($dt_fr.equalsIgnoreCase(name)) {
			return dt_fr();
		}
		if ($dt_to.equalsIgnoreCase(name)) {
			return dt_to();
		}
		if ($purc_dt_fr.equalsIgnoreCase(name)) {
			return purc_dt_fr();
		}
		if ($purc_dt_to.equalsIgnoreCase(name)) {
			return purc_dt_to();
		}
		if ($master_dt.equalsIgnoreCase(name)) {
			return master_dt();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($gr_prcd_flg.equalsIgnoreCase(name)) {
			return gr_prcd_flg();
		}
		if ($gr_sts_opn_grp_flg.equalsIgnoreCase(name)) {
			return gr_sts_opn_grp_flg();
		}
		if ($gr_sts_ordsav_grp_flg.equalsIgnoreCase(name)) {
			return gr_sts_ordsav_grp_flg();
		}
		if ($gr_sts_fix_grp_flg.equalsIgnoreCase(name)) {
			return gr_sts_fix_grp_flg();
		}
		if ($gr_sts_schd_grp_flg.equalsIgnoreCase(name)) {
			return gr_sts_schd_grp_flg();
		}
		if ($gr_sts_ord_grp_flg.equalsIgnoreCase(name)) {
			return gr_sts_ord_grp_flg();
		}
		if ($gr_act_flg.equalsIgnoreCase(name)) {
			return gr_act_flg();
		}
		if ($gi_prcd_flg.equalsIgnoreCase(name)) {
			return gi_prcd_flg();
		}
		if ($gi_sts_opn_grp_flg.equalsIgnoreCase(name)) {
			return gi_sts_opn_grp_flg();
		}
		if ($gi_sts_ordsav_grp_flg.equalsIgnoreCase(name)) {
			return gi_sts_ordsav_grp_flg();
		}
		if ($gi_sts_fix_grp_flg.equalsIgnoreCase(name)) {
			return gi_sts_fix_grp_flg();
		}
		if ($gi_sts_schd_grp_flg.equalsIgnoreCase(name)) {
			return gi_sts_schd_grp_flg();
		}
		if ($gi_sts_ord_grp_flg.equalsIgnoreCase(name)) {
			return gi_sts_ord_grp_flg();
		}
		if ($gi_act_flg.equalsIgnoreCase(name)) {
			return gi_act_flg();
		}
		if ($missing_flg.equalsIgnoreCase(name)) {
			return missing_flg();
		}
		if ($sim_flg.equalsIgnoreCase(name)) {
			return sim_flg();
		}
		if ($tgt_ver_flg.equalsIgnoreCase(name)) {
			return tgt_ver_flg();
		}
		if ($non_cmpl_ver_flg.equalsIgnoreCase(name)) {
			return non_cmpl_ver_flg();
		}
		if ($alloc_gi_flg.equalsIgnoreCase(name)) {
			return alloc_gi_flg();
		}
		if ($key_flg.equalsIgnoreCase(name)) {
			return key_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($sim_mrp_no.equalsIgnoreCase(name)) {
			return sim_mrp_no();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			return lg_grp_nm();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			return alloc_grp_nm();
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			return loc_grp_cd();
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			return loc_grp_nm();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			return quality_typ_nm();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($disp_typ.equalsIgnoreCase(name)) {
			return disp_typ();
		}
		if ($sum_unit_typ.equalsIgnoreCase(name)) {
			return sum_unit_typ();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($dt_fr.equalsIgnoreCase(name)) {
			return dt_fr();
		}
		if ($dt_to.equalsIgnoreCase(name)) {
			return dt_to();
		}
		if ($purc_dt_fr.equalsIgnoreCase(name)) {
			return purc_dt_fr();
		}
		if ($purc_dt_to.equalsIgnoreCase(name)) {
			return purc_dt_to();
		}
		if ($master_dt.equalsIgnoreCase(name)) {
			return master_dt();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($gr_prcd_flg.equalsIgnoreCase(name)) {
			return gr_prcd_flg();
		}
		if ($gr_sts_opn_grp_flg.equalsIgnoreCase(name)) {
			return gr_sts_opn_grp_flg();
		}
		if ($gr_sts_ordsav_grp_flg.equalsIgnoreCase(name)) {
			return gr_sts_ordsav_grp_flg();
		}
		if ($gr_sts_fix_grp_flg.equalsIgnoreCase(name)) {
			return gr_sts_fix_grp_flg();
		}
		if ($gr_sts_schd_grp_flg.equalsIgnoreCase(name)) {
			return gr_sts_schd_grp_flg();
		}
		if ($gr_sts_ord_grp_flg.equalsIgnoreCase(name)) {
			return gr_sts_ord_grp_flg();
		}
		if ($gr_act_flg.equalsIgnoreCase(name)) {
			return gr_act_flg();
		}
		if ($gi_prcd_flg.equalsIgnoreCase(name)) {
			return gi_prcd_flg();
		}
		if ($gi_sts_opn_grp_flg.equalsIgnoreCase(name)) {
			return gi_sts_opn_grp_flg();
		}
		if ($gi_sts_ordsav_grp_flg.equalsIgnoreCase(name)) {
			return gi_sts_ordsav_grp_flg();
		}
		if ($gi_sts_fix_grp_flg.equalsIgnoreCase(name)) {
			return gi_sts_fix_grp_flg();
		}
		if ($gi_sts_schd_grp_flg.equalsIgnoreCase(name)) {
			return gi_sts_schd_grp_flg();
		}
		if ($gi_sts_ord_grp_flg.equalsIgnoreCase(name)) {
			return gi_sts_ord_grp_flg();
		}
		if ($gi_act_flg.equalsIgnoreCase(name)) {
			return gi_act_flg();
		}
		if ($missing_flg.equalsIgnoreCase(name)) {
			return missing_flg();
		}
		if ($sim_flg.equalsIgnoreCase(name)) {
			return sim_flg();
		}
		if ($tgt_ver_flg.equalsIgnoreCase(name)) {
			return tgt_ver_flg();
		}
		if ($non_cmpl_ver_flg.equalsIgnoreCase(name)) {
			return non_cmpl_ver_flg();
		}
		if ($alloc_gi_flg.equalsIgnoreCase(name)) {
			return alloc_gi_flg();
		}
		if ($key_flg.equalsIgnoreCase(name)) {
			return key_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($sim_mrp_no.equalsIgnoreCase(name)) {
			sim_mrp_no(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
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
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
			return;
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			lg_grp_nm(value);
			return;
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			alloc_grp_cd(value);
			return;
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			alloc_grp_nm(value);
			return;
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			loc_grp_cd(value);
			return;
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			loc_grp_nm(value);
			return;
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			quality_typ_nm(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($disp_typ.equalsIgnoreCase(name)) {
			disp_typ(value);
			return;
		}
		if ($sum_unit_typ.equalsIgnoreCase(name)) {
			sum_unit_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($dt_fr.equalsIgnoreCase(name)) {
			dt_fr(value);
			return;
		}
		if ($dt_to.equalsIgnoreCase(name)) {
			dt_to(value);
			return;
		}
		if ($purc_dt_fr.equalsIgnoreCase(name)) {
			purc_dt_fr(value);
			return;
		}
		if ($purc_dt_to.equalsIgnoreCase(name)) {
			purc_dt_to(value);
			return;
		}
		if ($master_dt.equalsIgnoreCase(name)) {
			master_dt(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($gr_prcd_flg.equalsIgnoreCase(name)) {
			gr_prcd_flg(value);
			return;
		}
		if ($gr_sts_opn_grp_flg.equalsIgnoreCase(name)) {
			gr_sts_opn_grp_flg(value);
			return;
		}
		if ($gr_sts_ordsav_grp_flg.equalsIgnoreCase(name)) {
			gr_sts_ordsav_grp_flg(value);
			return;
		}
		if ($gr_sts_fix_grp_flg.equalsIgnoreCase(name)) {
			gr_sts_fix_grp_flg(value);
			return;
		}
		if ($gr_sts_schd_grp_flg.equalsIgnoreCase(name)) {
			gr_sts_schd_grp_flg(value);
			return;
		}
		if ($gr_sts_ord_grp_flg.equalsIgnoreCase(name)) {
			gr_sts_ord_grp_flg(value);
			return;
		}
		if ($gr_act_flg.equalsIgnoreCase(name)) {
			gr_act_flg(value);
			return;
		}
		if ($gi_prcd_flg.equalsIgnoreCase(name)) {
			gi_prcd_flg(value);
			return;
		}
		if ($gi_sts_opn_grp_flg.equalsIgnoreCase(name)) {
			gi_sts_opn_grp_flg(value);
			return;
		}
		if ($gi_sts_ordsav_grp_flg.equalsIgnoreCase(name)) {
			gi_sts_ordsav_grp_flg(value);
			return;
		}
		if ($gi_sts_fix_grp_flg.equalsIgnoreCase(name)) {
			gi_sts_fix_grp_flg(value);
			return;
		}
		if ($gi_sts_schd_grp_flg.equalsIgnoreCase(name)) {
			gi_sts_schd_grp_flg(value);
			return;
		}
		if ($gi_sts_ord_grp_flg.equalsIgnoreCase(name)) {
			gi_sts_ord_grp_flg(value);
			return;
		}
		if ($gi_act_flg.equalsIgnoreCase(name)) {
			gi_act_flg(value);
			return;
		}
		if ($missing_flg.equalsIgnoreCase(name)) {
			missing_flg(value);
			return;
		}
		if ($sim_flg.equalsIgnoreCase(name)) {
			sim_flg(value);
			return;
		}
		if ($tgt_ver_flg.equalsIgnoreCase(name)) {
			tgt_ver_flg(value);
			return;
		}
		if ($non_cmpl_ver_flg.equalsIgnoreCase(name)) {
			non_cmpl_ver_flg(value);
			return;
		}
		if ($alloc_gi_flg.equalsIgnoreCase(name)) {
			alloc_gi_flg(value);
			return;
		}
		if ($key_flg.equalsIgnoreCase(name)) {
			key_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($sim_mrp_no.equalsIgnoreCase(name)) {
			sim_mrp_no(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
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
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
			return;
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			lg_grp_nm(value);
			return;
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			alloc_grp_cd(value);
			return;
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			alloc_grp_nm(value);
			return;
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			loc_grp_cd(value);
			return;
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			loc_grp_nm(value);
			return;
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			quality_typ_nm(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($disp_typ.equalsIgnoreCase(name)) {
			disp_typ(value);
			return;
		}
		if ($sum_unit_typ.equalsIgnoreCase(name)) {
			sum_unit_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($dt_fr.equalsIgnoreCase(name)) {
			dt_fr(value);
			return;
		}
		if ($dt_to.equalsIgnoreCase(name)) {
			dt_to(value);
			return;
		}
		if ($purc_dt_fr.equalsIgnoreCase(name)) {
			purc_dt_fr(value);
			return;
		}
		if ($purc_dt_to.equalsIgnoreCase(name)) {
			purc_dt_to(value);
			return;
		}
		if ($master_dt.equalsIgnoreCase(name)) {
			master_dt(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($gr_prcd_flg.equalsIgnoreCase(name)) {
			gr_prcd_flg(value);
			return;
		}
		if ($gr_sts_opn_grp_flg.equalsIgnoreCase(name)) {
			gr_sts_opn_grp_flg(value);
			return;
		}
		if ($gr_sts_ordsav_grp_flg.equalsIgnoreCase(name)) {
			gr_sts_ordsav_grp_flg(value);
			return;
		}
		if ($gr_sts_fix_grp_flg.equalsIgnoreCase(name)) {
			gr_sts_fix_grp_flg(value);
			return;
		}
		if ($gr_sts_schd_grp_flg.equalsIgnoreCase(name)) {
			gr_sts_schd_grp_flg(value);
			return;
		}
		if ($gr_sts_ord_grp_flg.equalsIgnoreCase(name)) {
			gr_sts_ord_grp_flg(value);
			return;
		}
		if ($gr_act_flg.equalsIgnoreCase(name)) {
			gr_act_flg(value);
			return;
		}
		if ($gi_prcd_flg.equalsIgnoreCase(name)) {
			gi_prcd_flg(value);
			return;
		}
		if ($gi_sts_opn_grp_flg.equalsIgnoreCase(name)) {
			gi_sts_opn_grp_flg(value);
			return;
		}
		if ($gi_sts_ordsav_grp_flg.equalsIgnoreCase(name)) {
			gi_sts_ordsav_grp_flg(value);
			return;
		}
		if ($gi_sts_fix_grp_flg.equalsIgnoreCase(name)) {
			gi_sts_fix_grp_flg(value);
			return;
		}
		if ($gi_sts_schd_grp_flg.equalsIgnoreCase(name)) {
			gi_sts_schd_grp_flg(value);
			return;
		}
		if ($gi_sts_ord_grp_flg.equalsIgnoreCase(name)) {
			gi_sts_ord_grp_flg(value);
			return;
		}
		if ($gi_act_flg.equalsIgnoreCase(name)) {
			gi_act_flg(value);
			return;
		}
		if ($missing_flg.equalsIgnoreCase(name)) {
			missing_flg(value);
			return;
		}
		if ($sim_flg.equalsIgnoreCase(name)) {
			sim_flg(value);
			return;
		}
		if ($tgt_ver_flg.equalsIgnoreCase(name)) {
			tgt_ver_flg(value);
			return;
		}
		if ($non_cmpl_ver_flg.equalsIgnoreCase(name)) {
			non_cmpl_ver_flg(value);
			return;
		}
		if ($alloc_gi_flg.equalsIgnoreCase(name)) {
			alloc_gi_flg(value);
			return;
		}
		if ($key_flg.equalsIgnoreCase(name)) {
			key_flg(value);
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
		if ($sno_p.equalsIgnoreCase(name)) {
			return sno_p();
		}
		if ($par_itm_p.equalsIgnoreCase(name)) {
			return par_itm_p();
		}
		if ($itm_grp_p.equalsIgnoreCase(name)) {
			return itm_grp_p();
		}
		if ($sno_flg_p.equalsIgnoreCase(name)) {
			return sno_flg_p();
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
		if ($sno_p.equalsIgnoreCase(name)) {
			sno_p(
				((MCContainerMeta) sno_p_META).castInnerRow(mcframe.clientMSUB.MSUBP0020.SnoWrkNoR.class, value)
			);
			return;
		}
		if ($par_itm_p.equalsIgnoreCase(name)) {
			par_itm_p(
				((MCContainerMeta) par_itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0030.ItmR.class, value)
			);
			return;
		}
		if ($itm_grp_p.equalsIgnoreCase(name)) {
			itm_grp_p(
				((MCContainerMeta) itm_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0250.ItmGrpR.class, value)
			);
			return;
		}
		if ($sno_flg_p.equalsIgnoreCase(name)) {
			sno_flg_p(
				((MCContainerMeta) sno_flg_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0440.SnoFlgR.class, value)
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

	public String itm_typ_nm() {
		return itm_typ_p().itm_typ_nm();
	}

	public void itm_typ_nm(String value) {
		itm_typ_p().itm_typ_nm(value);
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
		return sno_p().sno1();
	}

	public void sno1(String value) {
		sno_p().sno1(value);
	}

	public String sno2() {
		return sno_p().sno2();
	}

	public void sno2(String value) {
		sno_p().sno2(value);
	}

	public String sno3() {
		return sno_p().sno3();
	}

	public void sno3(String value) {
		sno_p().sno3(value);
	}

	public String sno4() {
		return sno_p().sno4();
	}

	public void sno4(String value) {
		sno_p().sno4(value);
	}

	public String wrk_no() {
		return sno_p().wrk_no();
	}

	public void wrk_no(String value) {
		sno_p().wrk_no(value);
	}

	public String wrk_nm() {
		return sno_p().wrk_nm();
	}

	public void wrk_nm(String value) {
		sno_p().wrk_nm(value);
	}

	/**
	 * Parent item cd. 親品目ＣＤ.<p>
	 *
	 */
	public String par_itm_cd() {
		return par_itm_p().itm_cd();
	}

	/**
	 * Parent item cd. 親品目ＣＤ.<p>
	 *
	 */
	public void par_itm_cd(String value) {
		par_itm_p().itm_cd(value);
	}

	/**
	 * Parent branch No. 1 親枝番１.<p>
	 *
	 */
	public String par_itm_sub1() {
		return par_itm_p().itm_sub1();
	}

	/**
	 * Parent branch No. 1 親枝番１.<p>
	 *
	 */
	public void par_itm_sub1(String value) {
		par_itm_p().itm_sub1(value);
	}

	/**
	 * Parent branch No. 2 親枝番２.<p>
	 *
	 */
	public String par_itm_sub2() {
		return par_itm_p().itm_sub2();
	}

	/**
	 * Parent branch No. 2 親枝番２.<p>
	 *
	 */
	public void par_itm_sub2(String value) {
		par_itm_p().itm_sub2(value);
	}

	/**
	 * Parent branch No. 3 親枝番３.<p>
	 *
	 */
	public String par_itm_sub3() {
		return par_itm_p().itm_sub3();
	}

	/**
	 * Parent branch No. 3 親枝番３.<p>
	 *
	 */
	public void par_itm_sub3(String value) {
		par_itm_p().itm_sub3(value);
	}

	/**
	 * Parent item name 親品名.<p>
	 *
	 */
	public String par_itm_nm() {
		return par_itm_p().itm_nm();
	}

	/**
	 * Parent item name 親品名.<p>
	 *
	 */
	public void par_itm_nm(String value) {
		par_itm_p().itm_nm(value);
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

	public boolean sno1_flg() {
		return sno_flg_p().sno1_flg();
	}

	public void sno1_flg(boolean value) {
		sno_flg_p().sno1_flg(value);
	}

	public boolean sno2_flg() {
		return sno_flg_p().sno2_flg();
	}

	public void sno2_flg(boolean value) {
		sno_flg_p().sno2_flg(value);
	}

	public boolean sno3_flg() {
		return sno_flg_p().sno3_flg();
	}

	public void sno3_flg(boolean value) {
		sno_flg_p().sno3_flg(value);
	}

	public boolean sno4_flg() {
		return sno_flg_p().sno4_flg();
	}

	public void sno4_flg(boolean value) {
		sno_flg_p().sno4_flg(value);
	}

}

