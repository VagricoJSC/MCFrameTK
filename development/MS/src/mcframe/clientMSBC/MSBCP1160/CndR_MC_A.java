package mcframe.clientMSBC.MSBCP1160;

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
	 * Uncompleted 未完了.<p>
	 *
	 */
	public static final String $uncmpl_flg = "uncmpl_flg";
	/**
	 * Completed 完了.<p>
	 *
	 */
	public static final String $cmpl_flg = "cmpl_flg";
	public static final String $first_inst_st_p = "first_inst_st_p";
	public static final String $first_act_st_p = "first_act_st_p";
	public static final String $last_act_st_p = "last_act_st_p";
	/**
	 * Purchase application start date FROM 購買適用開始日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $purc_st_dt_fr = "purc_st_dt_fr";
	/**
	 * Purchase application start date TO 購買適用開始日ＴＯ.<p>
	 *
	 */
	public static final String $purc_st_dt_to = "purc_st_dt_to";
	/**
	 * Version change status type 版切替状況区分.<p>
	 *
	 */
	public static final String $ver_chg_sts_typ = "ver_chg_sts_typ";
	/**
	 * Version change status type name 版切替状況区分名.<p>
	 *
	 */
	public static final String $ver_chg_sts_typ_nm = "ver_chg_sts_typ_nm";
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
	public static final String $chd_itm_typ_p = "chd_itm_typ_p";
	public static final String $chd_itm_p = "chd_itm_p";
	public static final String $ver_no_p = "ver_no_p";
	public static final String $par_itm_typ_p = "par_itm_typ_p";
	public static final String $par_itm_p = "par_itm_p";
	public static final String $sno_p = "sno_p";
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
	public static final String $chd_itm_grp_p = "chd_itm_grp_p";
	public static final String $par_itm_grp_p = "par_itm_grp_p";

	public static final String $first_inst_st_dt_fr = $first_inst_st_p + ".ymd_fr";
	public static final String $first_inst_st_hm_fr = $first_inst_st_p + ".hm_fr";
	public static final String $first_inst_st_dt_to = $first_inst_st_p + ".ymd_to";
	public static final String $first_inst_st_hm_to = $first_inst_st_p + ".hm_to";
	public static final String $first_act_st_dt_fr = $first_act_st_p + ".ymd_fr";
	public static final String $first_act_st_hm_fr = $first_act_st_p + ".hm_fr";
	public static final String $first_act_st_dt_to = $first_act_st_p + ".ymd_to";
	public static final String $first_act_st_hm_to = $first_act_st_p + ".hm_to";
	public static final String $last_act_st_dt_fr = $last_act_st_p + ".ymd_fr";
	public static final String $last_act_st_hm_fr = $last_act_st_p + ".hm_fr";
	public static final String $last_act_st_dt_to = $last_act_st_p + ".ymd_to";
	public static final String $last_act_st_hm_to = $last_act_st_p + ".hm_to";
	public static final String $chd_itm_typ = $chd_itm_typ_p + ".itm_typ";
	public static final String $chd_itm_typ_d_cd = $chd_itm_typ_p + ".itm_typ_d_cd";
	public static final String $chd_itm_typ_d_nm = $chd_itm_typ_p + ".itm_typ_d_nm";
	public static final String $chd_itm_cd = $chd_itm_p + ".itm_cd";
	public static final String $chd_itm_sub1 = $chd_itm_p + ".itm_sub1";
	public static final String $chd_itm_sub2 = $chd_itm_p + ".itm_sub2";
	public static final String $chd_itm_sub3 = $chd_itm_p + ".itm_sub3";
	public static final String $chd_itm_nm = $chd_itm_p + ".itm_nm";
	public static final String $ver_no = $ver_no_p + ".ver_no";
	public static final String $par_itm_typ = $par_itm_typ_p + ".itm_typ";
	public static final String $par_itm_typ_d_cd = $par_itm_typ_p + ".itm_typ_d_cd";
	public static final String $par_itm_typ_d_nm = $par_itm_typ_p + ".itm_typ_d_nm";
	public static final String $par_itm_cd = $par_itm_p + ".itm_cd";
	public static final String $par_itm_sub1 = $par_itm_p + ".itm_sub1";
	public static final String $par_itm_sub2 = $par_itm_p + ".itm_sub2";
	public static final String $par_itm_sub3 = $par_itm_p + ".itm_sub3";
	public static final String $par_itm_nm = $par_itm_p + ".itm_nm";
	public static final String $sno1 = $sno_p + ".sno1";
	public static final String $sno2 = $sno_p + ".sno2";
	public static final String $sno3 = $sno_p + ".sno3";
	public static final String $sno4 = $sno_p + ".sno4";
	public static final String $chd_itm_grp_lab1 = $chd_itm_grp_p + ".itm_grp_lab1";
	public static final String $chd_itm_grp_flg1 = $chd_itm_grp_p + ".itm_grp_flg1";
	public static final String $chd_itm_grp_cd1 = $chd_itm_grp_p + ".itm_grp_cd1";
	public static final String $chd_itm_grp_nm1 = $chd_itm_grp_p + ".itm_grp_nm1";
	public static final String $chd_itm_grp_lab2 = $chd_itm_grp_p + ".itm_grp_lab2";
	public static final String $chd_itm_grp_flg2 = $chd_itm_grp_p + ".itm_grp_flg2";
	public static final String $chd_itm_grp_cd2 = $chd_itm_grp_p + ".itm_grp_cd2";
	public static final String $chd_itm_grp_nm2 = $chd_itm_grp_p + ".itm_grp_nm2";
	public static final String $chd_itm_grp_lab3 = $chd_itm_grp_p + ".itm_grp_lab3";
	public static final String $chd_itm_grp_flg3 = $chd_itm_grp_p + ".itm_grp_flg3";
	public static final String $chd_itm_grp_cd3 = $chd_itm_grp_p + ".itm_grp_cd3";
	public static final String $chd_itm_grp_nm3 = $chd_itm_grp_p + ".itm_grp_nm3";
	public static final String $chd_itm_grp_lab4 = $chd_itm_grp_p + ".itm_grp_lab4";
	public static final String $chd_itm_grp_flg4 = $chd_itm_grp_p + ".itm_grp_flg4";
	public static final String $chd_itm_grp_cd4 = $chd_itm_grp_p + ".itm_grp_cd4";
	public static final String $chd_itm_grp_nm4 = $chd_itm_grp_p + ".itm_grp_nm4";
	public static final String $chd_itm_grp_lab5 = $chd_itm_grp_p + ".itm_grp_lab5";
	public static final String $chd_itm_grp_flg5 = $chd_itm_grp_p + ".itm_grp_flg5";
	public static final String $chd_itm_grp_cd5 = $chd_itm_grp_p + ".itm_grp_cd5";
	public static final String $chd_itm_grp_nm5 = $chd_itm_grp_p + ".itm_grp_nm5";
	public static final String $chd_itm_grp_lab6 = $chd_itm_grp_p + ".itm_grp_lab6";
	public static final String $chd_itm_grp_flg6 = $chd_itm_grp_p + ".itm_grp_flg6";
	public static final String $chd_itm_grp_cd6 = $chd_itm_grp_p + ".itm_grp_cd6";
	public static final String $chd_itm_grp_nm6 = $chd_itm_grp_p + ".itm_grp_nm6";
	public static final String $chd_itm_grp_lab7 = $chd_itm_grp_p + ".itm_grp_lab7";
	public static final String $chd_itm_grp_flg7 = $chd_itm_grp_p + ".itm_grp_flg7";
	public static final String $chd_itm_grp_cd7 = $chd_itm_grp_p + ".itm_grp_cd7";
	public static final String $chd_itm_grp_nm7 = $chd_itm_grp_p + ".itm_grp_nm7";
	public static final String $chd_itm_grp_lab8 = $chd_itm_grp_p + ".itm_grp_lab8";
	public static final String $chd_itm_grp_flg8 = $chd_itm_grp_p + ".itm_grp_flg8";
	public static final String $chd_itm_grp_cd8 = $chd_itm_grp_p + ".itm_grp_cd8";
	public static final String $chd_itm_grp_nm8 = $chd_itm_grp_p + ".itm_grp_nm8";
	public static final String $chd_itm_grp_lab9 = $chd_itm_grp_p + ".itm_grp_lab9";
	public static final String $chd_itm_grp_flg9 = $chd_itm_grp_p + ".itm_grp_flg9";
	public static final String $chd_itm_grp_cd9 = $chd_itm_grp_p + ".itm_grp_cd9";
	public static final String $chd_itm_grp_nm9 = $chd_itm_grp_p + ".itm_grp_nm9";
	public static final String $chd_itm_grp_lab10 = $chd_itm_grp_p + ".itm_grp_lab10";
	public static final String $chd_itm_grp_flg10 = $chd_itm_grp_p + ".itm_grp_flg10";
	public static final String $chd_itm_grp_cd10 = $chd_itm_grp_p + ".itm_grp_cd10";
	public static final String $chd_itm_grp_nm10 = $chd_itm_grp_p + ".itm_grp_nm10";
	public static final String $par_itm_grp_lab1 = $par_itm_grp_p + ".itm_grp_lab1";
	public static final String $par_itm_grp_flg1 = $par_itm_grp_p + ".itm_grp_flg1";
	public static final String $par_itm_grp_cd1 = $par_itm_grp_p + ".itm_grp_cd1";
	public static final String $par_itm_grp_nm1 = $par_itm_grp_p + ".itm_grp_nm1";
	public static final String $par_itm_grp_lab2 = $par_itm_grp_p + ".itm_grp_lab2";
	public static final String $par_itm_grp_flg2 = $par_itm_grp_p + ".itm_grp_flg2";
	public static final String $par_itm_grp_cd2 = $par_itm_grp_p + ".itm_grp_cd2";
	public static final String $par_itm_grp_nm2 = $par_itm_grp_p + ".itm_grp_nm2";
	public static final String $par_itm_grp_lab3 = $par_itm_grp_p + ".itm_grp_lab3";
	public static final String $par_itm_grp_flg3 = $par_itm_grp_p + ".itm_grp_flg3";
	public static final String $par_itm_grp_cd3 = $par_itm_grp_p + ".itm_grp_cd3";
	public static final String $par_itm_grp_nm3 = $par_itm_grp_p + ".itm_grp_nm3";
	public static final String $par_itm_grp_lab4 = $par_itm_grp_p + ".itm_grp_lab4";
	public static final String $par_itm_grp_flg4 = $par_itm_grp_p + ".itm_grp_flg4";
	public static final String $par_itm_grp_cd4 = $par_itm_grp_p + ".itm_grp_cd4";
	public static final String $par_itm_grp_nm4 = $par_itm_grp_p + ".itm_grp_nm4";
	public static final String $par_itm_grp_lab5 = $par_itm_grp_p + ".itm_grp_lab5";
	public static final String $par_itm_grp_flg5 = $par_itm_grp_p + ".itm_grp_flg5";
	public static final String $par_itm_grp_cd5 = $par_itm_grp_p + ".itm_grp_cd5";
	public static final String $par_itm_grp_nm5 = $par_itm_grp_p + ".itm_grp_nm5";
	public static final String $par_itm_grp_lab6 = $par_itm_grp_p + ".itm_grp_lab6";
	public static final String $par_itm_grp_flg6 = $par_itm_grp_p + ".itm_grp_flg6";
	public static final String $par_itm_grp_cd6 = $par_itm_grp_p + ".itm_grp_cd6";
	public static final String $par_itm_grp_nm6 = $par_itm_grp_p + ".itm_grp_nm6";
	public static final String $par_itm_grp_lab7 = $par_itm_grp_p + ".itm_grp_lab7";
	public static final String $par_itm_grp_flg7 = $par_itm_grp_p + ".itm_grp_flg7";
	public static final String $par_itm_grp_cd7 = $par_itm_grp_p + ".itm_grp_cd7";
	public static final String $par_itm_grp_nm7 = $par_itm_grp_p + ".itm_grp_nm7";
	public static final String $par_itm_grp_lab8 = $par_itm_grp_p + ".itm_grp_lab8";
	public static final String $par_itm_grp_flg8 = $par_itm_grp_p + ".itm_grp_flg8";
	public static final String $par_itm_grp_cd8 = $par_itm_grp_p + ".itm_grp_cd8";
	public static final String $par_itm_grp_nm8 = $par_itm_grp_p + ".itm_grp_nm8";
	public static final String $par_itm_grp_lab9 = $par_itm_grp_p + ".itm_grp_lab9";
	public static final String $par_itm_grp_flg9 = $par_itm_grp_p + ".itm_grp_flg9";
	public static final String $par_itm_grp_cd9 = $par_itm_grp_p + ".itm_grp_cd9";
	public static final String $par_itm_grp_nm9 = $par_itm_grp_p + ".itm_grp_nm9";
	public static final String $par_itm_grp_lab10 = $par_itm_grp_p + ".itm_grp_lab10";
	public static final String $par_itm_grp_flg10 = $par_itm_grp_p + ".itm_grp_flg10";
	public static final String $par_itm_grp_cd10 = $par_itm_grp_p + ".itm_grp_cd10";
	public static final String $par_itm_grp_nm10 = $par_itm_grp_p + ".itm_grp_nm10";

	public static final MCMeta uncmpl_flg_META = createCommonMeta($uncmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cmpl_flg_META = createCommonMeta($cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta first_inst_st_p_META = createInnerRowMeta($first_inst_st_p, mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class);
	public static final MCMeta first_act_st_p_META = createInnerRowMeta($first_act_st_p, mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class);
	public static final MCMeta last_act_st_p_META = createInnerRowMeta($last_act_st_p, mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class);
	public static final MCMeta purc_st_dt_fr_META = createCommonMeta($purc_st_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta purc_st_dt_to_META = createCommonMeta($purc_st_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ver_chg_sts_typ_META = createCommonMeta($ver_chg_sts_typ, mcframe.commonMS.meta.MS_META.VER_CHG_STS_TYP);
	public static final MCMeta ver_chg_sts_typ_nm_META = createCommonMeta($ver_chg_sts_typ_nm, mcframe.commonMS.meta.MS_META.VER_CHG_STS_TYP_NM);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta site_nm_META = createCommonMeta($site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta chd_itm_typ_p_META = createInnerRowMeta($chd_itm_typ_p, mcframe.clientMAUB.MAUBP0100.ItmTypR.class);
	public static final MCMeta chd_itm_p_META = createInnerRowMeta($chd_itm_p, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta ver_no_p_META = createInnerRowMeta($ver_no_p, mcframe.clientMAUB.MAUBP0340.VerNoR.class);
	public static final MCMeta par_itm_typ_p_META = createInnerRowMeta($par_itm_typ_p, mcframe.clientMAUB.MAUBP0100.ItmTypR.class);
	public static final MCMeta par_itm_p_META = createInnerRowMeta($par_itm_p, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta sno_p_META = createInnerRowMeta($sno_p, mcframe.clientMAUB.MAUBP0080.SnoR.class);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.VER_CHG_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.VER_CHG_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.VER_CHG_SUB_CHAR3);
	public static final MCMeta chd_itm_grp_p_META = createInnerRowMeta($chd_itm_grp_p, mcframe.clientMAUB.MAUBP0250.ItmGrpR.class);
	public static final MCMeta par_itm_grp_p_META = createInnerRowMeta($par_itm_grp_p, mcframe.clientMAUB.MAUBP0250.ItmGrpR.class);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			uncmpl_flg_META,
			cmpl_flg_META,
			first_inst_st_p_META,
			first_act_st_p_META,
			last_act_st_p_META,
			purc_st_dt_fr_META,
			purc_st_dt_to_META,
			ver_chg_sts_typ_META,
			ver_chg_sts_typ_nm_META,
			site_cd_META,
			site_nm_META,
			wg_cd_META,
			wg_nm_META,
			chd_itm_typ_p_META,
			chd_itm_p_META,
			ver_no_p_META,
			par_itm_typ_p_META,
			par_itm_p_META,
			sno_p_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			chd_itm_grp_p_META,
			par_itm_grp_p_META
		},
		new String[][]{
			{
				"first_inst_st_dt_fr",
				"first_inst_st_hm_fr",
				"first_inst_st_dt_to",
				"first_inst_st_hm_to",
				"first_act_st_dt_fr",
				"first_act_st_hm_fr",
				"first_act_st_dt_to",
				"first_act_st_hm_to",
				"last_act_st_dt_fr",
				"last_act_st_hm_fr",
				"last_act_st_dt_to",
				"last_act_st_hm_to",
				"chd_itm_typ",
				"chd_itm_typ_d_cd",
				"chd_itm_typ_d_nm",
				"chd_itm_cd",
				"chd_itm_sub1",
				"chd_itm_sub2",
				"chd_itm_sub3",
				"chd_itm_nm",
				"ver_no",
				"par_itm_typ",
				"par_itm_typ_d_cd",
				"par_itm_typ_d_nm",
				"par_itm_cd",
				"par_itm_sub1",
				"par_itm_sub2",
				"par_itm_sub3",
				"par_itm_nm",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"chd_itm_grp_flg1",
				"chd_itm_grp_cd1",
				"chd_itm_grp_nm1",
				"chd_itm_grp_flg2",
				"chd_itm_grp_cd2",
				"chd_itm_grp_nm2",
				"chd_itm_grp_flg3",
				"chd_itm_grp_cd3",
				"chd_itm_grp_nm3",
				"chd_itm_grp_flg4",
				"chd_itm_grp_cd4",
				"chd_itm_grp_nm4",
				"chd_itm_grp_flg5",
				"chd_itm_grp_cd5",
				"chd_itm_grp_nm5",
				"chd_itm_grp_flg6",
				"chd_itm_grp_cd6",
				"chd_itm_grp_nm6",
				"chd_itm_grp_flg7",
				"chd_itm_grp_cd7",
				"chd_itm_grp_nm7",
				"chd_itm_grp_flg8",
				"chd_itm_grp_cd8",
				"chd_itm_grp_nm8",
				"chd_itm_grp_flg9",
				"chd_itm_grp_cd9",
				"chd_itm_grp_nm9",
				"chd_itm_grp_flg10",
				"chd_itm_grp_cd10",
				"chd_itm_grp_nm10",
				"par_itm_grp_flg1",
				"par_itm_grp_cd1",
				"par_itm_grp_nm1",
				"par_itm_grp_flg2",
				"par_itm_grp_cd2",
				"par_itm_grp_nm2",
				"par_itm_grp_flg3",
				"par_itm_grp_cd3",
				"par_itm_grp_nm3",
				"par_itm_grp_flg4",
				"par_itm_grp_cd4",
				"par_itm_grp_nm4",
				"par_itm_grp_flg5",
				"par_itm_grp_cd5",
				"par_itm_grp_nm5",
				"par_itm_grp_flg6",
				"par_itm_grp_cd6",
				"par_itm_grp_nm6",
				"par_itm_grp_flg7",
				"par_itm_grp_cd7",
				"par_itm_grp_nm7",
				"par_itm_grp_flg8",
				"par_itm_grp_cd8",
				"par_itm_grp_nm8",
				"par_itm_grp_flg9",
				"par_itm_grp_cd9",
				"par_itm_grp_nm9",
				"par_itm_grp_flg10",
				"par_itm_grp_cd10",
				"par_itm_grp_nm10"
			},
			{
				$first_inst_st_dt_fr,
				$first_inst_st_hm_fr,
				$first_inst_st_dt_to,
				$first_inst_st_hm_to,
				$first_act_st_dt_fr,
				$first_act_st_hm_fr,
				$first_act_st_dt_to,
				$first_act_st_hm_to,
				$last_act_st_dt_fr,
				$last_act_st_hm_fr,
				$last_act_st_dt_to,
				$last_act_st_hm_to,
				$chd_itm_typ,
				$chd_itm_typ_d_cd,
				$chd_itm_typ_d_nm,
				$chd_itm_cd,
				$chd_itm_sub1,
				$chd_itm_sub2,
				$chd_itm_sub3,
				$chd_itm_nm,
				$ver_no,
				$par_itm_typ,
				$par_itm_typ_d_cd,
				$par_itm_typ_d_nm,
				$par_itm_cd,
				$par_itm_sub1,
				$par_itm_sub2,
				$par_itm_sub3,
				$par_itm_nm,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$chd_itm_grp_flg1,
				$chd_itm_grp_cd1,
				$chd_itm_grp_nm1,
				$chd_itm_grp_flg2,
				$chd_itm_grp_cd2,
				$chd_itm_grp_nm2,
				$chd_itm_grp_flg3,
				$chd_itm_grp_cd3,
				$chd_itm_grp_nm3,
				$chd_itm_grp_flg4,
				$chd_itm_grp_cd4,
				$chd_itm_grp_nm4,
				$chd_itm_grp_flg5,
				$chd_itm_grp_cd5,
				$chd_itm_grp_nm5,
				$chd_itm_grp_flg6,
				$chd_itm_grp_cd6,
				$chd_itm_grp_nm6,
				$chd_itm_grp_flg7,
				$chd_itm_grp_cd7,
				$chd_itm_grp_nm7,
				$chd_itm_grp_flg8,
				$chd_itm_grp_cd8,
				$chd_itm_grp_nm8,
				$chd_itm_grp_flg9,
				$chd_itm_grp_cd9,
				$chd_itm_grp_nm9,
				$chd_itm_grp_flg10,
				$chd_itm_grp_cd10,
				$chd_itm_grp_nm10,
				$par_itm_grp_flg1,
				$par_itm_grp_cd1,
				$par_itm_grp_nm1,
				$par_itm_grp_flg2,
				$par_itm_grp_cd2,
				$par_itm_grp_nm2,
				$par_itm_grp_flg3,
				$par_itm_grp_cd3,
				$par_itm_grp_nm3,
				$par_itm_grp_flg4,
				$par_itm_grp_cd4,
				$par_itm_grp_nm4,
				$par_itm_grp_flg5,
				$par_itm_grp_cd5,
				$par_itm_grp_nm5,
				$par_itm_grp_flg6,
				$par_itm_grp_cd6,
				$par_itm_grp_nm6,
				$par_itm_grp_flg7,
				$par_itm_grp_cd7,
				$par_itm_grp_nm7,
				$par_itm_grp_flg8,
				$par_itm_grp_cd8,
				$par_itm_grp_nm8,
				$par_itm_grp_flg9,
				$par_itm_grp_cd9,
				$par_itm_grp_nm9,
				$par_itm_grp_flg10,
				$par_itm_grp_cd10,
				$par_itm_grp_nm10
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

	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$site_cd, "SITE"},	// site_cd
				{$site_nm, "SITE"},	// site_nm
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"}	// wg_nm
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
	 * Uncompleted 未完了.<p>
	 *
	 */
	public boolean uncmpl_flg() {
		return getConstBoolean(offset + 0, $uncmpl_flg);
	}

	/**
	 * Uncompleted 未完了.<p>
	 *
	 */
	public void uncmpl_flg(boolean value) {
		setConstBoolean(offset + 0, $uncmpl_flg, value);
	}


	/**
	 * Completed 完了.<p>
	 *
	 */
	public boolean cmpl_flg() {
		return getConstBoolean(offset + 1, $cmpl_flg);
	}

	/**
	 * Completed 完了.<p>
	 *
	 */
	public void cmpl_flg(boolean value) {
		setConstBoolean(offset + 1, $cmpl_flg, value);
	}


	public mcframe.clientMAUB.MAUBP0400.YmdHmFrToR first_inst_st_p(){
		return (mcframe.clientMAUB.MAUBP0400.YmdHmFrToR) getConstInnerRow(offset + 2, $first_inst_st_p);
	}
	
	public void first_inst_st_p(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR row){
		setConstInnerRow(offset + 2, $first_inst_st_p, row);
	}


	public mcframe.clientMAUB.MAUBP0400.YmdHmFrToR first_act_st_p(){
		return (mcframe.clientMAUB.MAUBP0400.YmdHmFrToR) getConstInnerRow(offset + 3, $first_act_st_p);
	}
	
	public void first_act_st_p(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR row){
		setConstInnerRow(offset + 3, $first_act_st_p, row);
	}


	public mcframe.clientMAUB.MAUBP0400.YmdHmFrToR last_act_st_p(){
		return (mcframe.clientMAUB.MAUBP0400.YmdHmFrToR) getConstInnerRow(offset + 4, $last_act_st_p);
	}
	
	public void last_act_st_p(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR row){
		setConstInnerRow(offset + 4, $last_act_st_p, row);
	}


	/**
	 * Purchase application start date FROM 購買適用開始日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate purc_st_dt_fr() {
		return getConstDate(offset + 5, $purc_st_dt_fr);
	}

	/**
	 * Purchase application start date FROM 購買適用開始日ＦＲＯＭ.<p>
	 *
	 */
	public void purc_st_dt_fr(MCDate value) {
		setConstDate(offset + 5, $purc_st_dt_fr, value);
	}


	/**
	 * Purchase application start date TO 購買適用開始日ＴＯ.<p>
	 *
	 */
	public MCDate purc_st_dt_to() {
		return getConstDate(offset + 6, $purc_st_dt_to);
	}

	/**
	 * Purchase application start date TO 購買適用開始日ＴＯ.<p>
	 *
	 */
	public void purc_st_dt_to(MCDate value) {
		setConstDate(offset + 6, $purc_st_dt_to, value);
	}


	/**
	 * Version change status type 版切替状況区分.<p>
	 *
	 */
	public String ver_chg_sts_typ() {
		return getConstString(offset + 7, $ver_chg_sts_typ);
	}

	/**
	 * Version change status type 版切替状況区分.<p>
	 *
	 */
	public void ver_chg_sts_typ(String value) {
		setConstString(offset + 7, $ver_chg_sts_typ, value);
	}


	/**
	 * Version change status type name 版切替状況区分名.<p>
	 *
	 */
	public String ver_chg_sts_typ_nm() {
		return getConstString(offset + 8, $ver_chg_sts_typ_nm);
	}

	/**
	 * Version change status type name 版切替状況区分名.<p>
	 *
	 */
	public void ver_chg_sts_typ_nm(String value) {
		setConstString(offset + 8, $ver_chg_sts_typ_nm, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 9, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 9, $site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 10, $site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 10, $site_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 11, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 11, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 12, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 12, $wg_nm, value);
	}


	public mcframe.clientMAUB.MAUBP0100.ItmTypR chd_itm_typ_p(){
		return (mcframe.clientMAUB.MAUBP0100.ItmTypR) getConstInnerRow(offset + 13, $chd_itm_typ_p);
	}
	
	public void chd_itm_typ_p(mcframe.clientMAUB.MAUBP0100.ItmTypR row){
		setConstInnerRow(offset + 13, $chd_itm_typ_p, row);
	}


	public mcframe.clientMAUB.MAUBP0030.ItmR chd_itm_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 14, $chd_itm_p);
	}
	
	public void chd_itm_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 14, $chd_itm_p, row);
	}


	public mcframe.clientMAUB.MAUBP0340.VerNoR ver_no_p(){
		return (mcframe.clientMAUB.MAUBP0340.VerNoR) getConstInnerRow(offset + 15, $ver_no_p);
	}
	
	public void ver_no_p(mcframe.clientMAUB.MAUBP0340.VerNoR row){
		setConstInnerRow(offset + 15, $ver_no_p, row);
	}


	public mcframe.clientMAUB.MAUBP0100.ItmTypR par_itm_typ_p(){
		return (mcframe.clientMAUB.MAUBP0100.ItmTypR) getConstInnerRow(offset + 16, $par_itm_typ_p);
	}
	
	public void par_itm_typ_p(mcframe.clientMAUB.MAUBP0100.ItmTypR row){
		setConstInnerRow(offset + 16, $par_itm_typ_p, row);
	}


	public mcframe.clientMAUB.MAUBP0030.ItmR par_itm_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 17, $par_itm_p);
	}
	
	public void par_itm_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 17, $par_itm_p, row);
	}


	public mcframe.clientMAUB.MAUBP0080.SnoR sno_p(){
		return (mcframe.clientMAUB.MAUBP0080.SnoR) getConstInnerRow(offset + 18, $sno_p);
	}
	
	public void sno_p(mcframe.clientMAUB.MAUBP0080.SnoR row){
		setConstInnerRow(offset + 18, $sno_p, row);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 19, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 19, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 20, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 20, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 21, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 21, $sub_char3, value);
	}


	public mcframe.clientMAUB.MAUBP0250.ItmGrpR chd_itm_grp_p(){
		return (mcframe.clientMAUB.MAUBP0250.ItmGrpR) getConstInnerRow(offset + 22, $chd_itm_grp_p);
	}
	
	public void chd_itm_grp_p(mcframe.clientMAUB.MAUBP0250.ItmGrpR row){
		setConstInnerRow(offset + 22, $chd_itm_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP0250.ItmGrpR par_itm_grp_p(){
		return (mcframe.clientMAUB.MAUBP0250.ItmGrpR) getConstInnerRow(offset + 23, $par_itm_grp_p);
	}
	
	public void par_itm_grp_p(mcframe.clientMAUB.MAUBP0250.ItmGrpR row){
		setConstInnerRow(offset + 23, $par_itm_grp_p, row);
	}


	public String getString(String name) {
		if ($ver_chg_sts_typ.equalsIgnoreCase(name)) {
			return ver_chg_sts_typ();
		}
		if ($ver_chg_sts_typ_nm.equalsIgnoreCase(name)) {
			return ver_chg_sts_typ_nm();
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
		if ($purc_st_dt_fr.equalsIgnoreCase(name)) {
			return purc_st_dt_fr();
		}
		if ($purc_st_dt_to.equalsIgnoreCase(name)) {
			return purc_st_dt_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($uncmpl_flg.equalsIgnoreCase(name)) {
			return uncmpl_flg();
		}
		if ($cmpl_flg.equalsIgnoreCase(name)) {
			return cmpl_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ver_chg_sts_typ.equalsIgnoreCase(name)) {
			return ver_chg_sts_typ();
		}
		if ($ver_chg_sts_typ_nm.equalsIgnoreCase(name)) {
			return ver_chg_sts_typ_nm();
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
		if ($purc_st_dt_fr.equalsIgnoreCase(name)) {
			return purc_st_dt_fr();
		}
		if ($purc_st_dt_to.equalsIgnoreCase(name)) {
			return purc_st_dt_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($uncmpl_flg.equalsIgnoreCase(name)) {
			return uncmpl_flg();
		}
		if ($cmpl_flg.equalsIgnoreCase(name)) {
			return cmpl_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ver_chg_sts_typ.equalsIgnoreCase(name)) {
			ver_chg_sts_typ(value);
			return;
		}
		if ($ver_chg_sts_typ_nm.equalsIgnoreCase(name)) {
			ver_chg_sts_typ_nm(value);
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
		if ($purc_st_dt_fr.equalsIgnoreCase(name)) {
			purc_st_dt_fr(value);
			return;
		}
		if ($purc_st_dt_to.equalsIgnoreCase(name)) {
			purc_st_dt_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($uncmpl_flg.equalsIgnoreCase(name)) {
			uncmpl_flg(value);
			return;
		}
		if ($cmpl_flg.equalsIgnoreCase(name)) {
			cmpl_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ver_chg_sts_typ.equalsIgnoreCase(name)) {
			ver_chg_sts_typ(value);
			return;
		}
		if ($ver_chg_sts_typ_nm.equalsIgnoreCase(name)) {
			ver_chg_sts_typ_nm(value);
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
		if ($purc_st_dt_fr.equalsIgnoreCase(name)) {
			purc_st_dt_fr(value);
			return;
		}
		if ($purc_st_dt_to.equalsIgnoreCase(name)) {
			purc_st_dt_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($uncmpl_flg.equalsIgnoreCase(name)) {
			uncmpl_flg(value);
			return;
		}
		if ($cmpl_flg.equalsIgnoreCase(name)) {
			cmpl_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($first_inst_st_p.equalsIgnoreCase(name)) {
			return first_inst_st_p();
		}
		if ($first_act_st_p.equalsIgnoreCase(name)) {
			return first_act_st_p();
		}
		if ($last_act_st_p.equalsIgnoreCase(name)) {
			return last_act_st_p();
		}
		if ($chd_itm_typ_p.equalsIgnoreCase(name)) {
			return chd_itm_typ_p();
		}
		if ($chd_itm_p.equalsIgnoreCase(name)) {
			return chd_itm_p();
		}
		if ($ver_no_p.equalsIgnoreCase(name)) {
			return ver_no_p();
		}
		if ($par_itm_typ_p.equalsIgnoreCase(name)) {
			return par_itm_typ_p();
		}
		if ($par_itm_p.equalsIgnoreCase(name)) {
			return par_itm_p();
		}
		if ($sno_p.equalsIgnoreCase(name)) {
			return sno_p();
		}
		if ($chd_itm_grp_p.equalsIgnoreCase(name)) {
			return chd_itm_grp_p();
		}
		if ($par_itm_grp_p.equalsIgnoreCase(name)) {
			return par_itm_grp_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($first_inst_st_p.equalsIgnoreCase(name)) {
			first_inst_st_p(
				((MCContainerMeta) first_inst_st_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class, value)
			);
			return;
		}
		if ($first_act_st_p.equalsIgnoreCase(name)) {
			first_act_st_p(
				((MCContainerMeta) first_act_st_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class, value)
			);
			return;
		}
		if ($last_act_st_p.equalsIgnoreCase(name)) {
			last_act_st_p(
				((MCContainerMeta) last_act_st_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class, value)
			);
			return;
		}
		if ($chd_itm_typ_p.equalsIgnoreCase(name)) {
			chd_itm_typ_p(
				((MCContainerMeta) chd_itm_typ_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0100.ItmTypR.class, value)
			);
			return;
		}
		if ($chd_itm_p.equalsIgnoreCase(name)) {
			chd_itm_p(
				((MCContainerMeta) chd_itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0030.ItmR.class, value)
			);
			return;
		}
		if ($ver_no_p.equalsIgnoreCase(name)) {
			ver_no_p(
				((MCContainerMeta) ver_no_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0340.VerNoR.class, value)
			);
			return;
		}
		if ($par_itm_typ_p.equalsIgnoreCase(name)) {
			par_itm_typ_p(
				((MCContainerMeta) par_itm_typ_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0100.ItmTypR.class, value)
			);
			return;
		}
		if ($par_itm_p.equalsIgnoreCase(name)) {
			par_itm_p(
				((MCContainerMeta) par_itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0030.ItmR.class, value)
			);
			return;
		}
		if ($sno_p.equalsIgnoreCase(name)) {
			sno_p(
				((MCContainerMeta) sno_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0080.SnoR.class, value)
			);
			return;
		}
		if ($chd_itm_grp_p.equalsIgnoreCase(name)) {
			chd_itm_grp_p(
				((MCContainerMeta) chd_itm_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0250.ItmGrpR.class, value)
			);
			return;
		}
		if ($par_itm_grp_p.equalsIgnoreCase(name)) {
			par_itm_grp_p(
				((MCContainerMeta) par_itm_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0250.ItmGrpR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Application start date (Order) FROM 適用開始日（指図）ＦＲＯＭ.<p>
	 *
	 */
	public MCDate first_inst_st_dt_fr() {
		return first_inst_st_p().ymd_fr();
	}

	/**
	 * Application start date (Order) FROM 適用開始日（指図）ＦＲＯＭ.<p>
	 *
	 */
	public void first_inst_st_dt_fr(MCDate value) {
		first_inst_st_p().ymd_fr(value);
	}

	/**
	 * Application start time (Order) FROM 適用開始時（指図）ＦＲＯＭ.<p>
	 *
	 */
	public MCDate first_inst_st_hm_fr() {
		return first_inst_st_p().hm_fr();
	}

	/**
	 * Application start time (Order) FROM 適用開始時（指図）ＦＲＯＭ.<p>
	 *
	 */
	public void first_inst_st_hm_fr(MCDate value) {
		first_inst_st_p().hm_fr(value);
	}

	/**
	 * Application start date (Order) TO 適用開始日（指図）ＴＯ.<p>
	 *
	 */
	public MCDate first_inst_st_dt_to() {
		return first_inst_st_p().ymd_to();
	}

	/**
	 * Application start date (Order) TO 適用開始日（指図）ＴＯ.<p>
	 *
	 */
	public void first_inst_st_dt_to(MCDate value) {
		first_inst_st_p().ymd_to(value);
	}

	/**
	 * Application start time (Order) TO 適用開始時（指図）ＴＯ.<p>
	 *
	 */
	public MCDate first_inst_st_hm_to() {
		return first_inst_st_p().hm_to();
	}

	/**
	 * Application start time (Order) TO 適用開始時（指図）ＴＯ.<p>
	 *
	 */
	public void first_inst_st_hm_to(MCDate value) {
		first_inst_st_p().hm_to(value);
	}

	/**
	 * Application start date (Result) FROM 適用開始日（実績）ＦＲＯＭ.<p>
	 *
	 */
	public MCDate first_act_st_dt_fr() {
		return first_act_st_p().ymd_fr();
	}

	/**
	 * Application start date (Result) FROM 適用開始日（実績）ＦＲＯＭ.<p>
	 *
	 */
	public void first_act_st_dt_fr(MCDate value) {
		first_act_st_p().ymd_fr(value);
	}

	/**
	 * Application start time (Result) FROM 適用開始時（実績）ＦＲＯＭ.<p>
	 *
	 */
	public MCDate first_act_st_hm_fr() {
		return first_act_st_p().hm_fr();
	}

	/**
	 * Application start time (Result) FROM 適用開始時（実績）ＦＲＯＭ.<p>
	 *
	 */
	public void first_act_st_hm_fr(MCDate value) {
		first_act_st_p().hm_fr(value);
	}

	/**
	 * Application start date (Result) TO 適用開始日（実績）ＴＯ.<p>
	 *
	 */
	public MCDate first_act_st_dt_to() {
		return first_act_st_p().ymd_to();
	}

	/**
	 * Application start date (Result) TO 適用開始日（実績）ＴＯ.<p>
	 *
	 */
	public void first_act_st_dt_to(MCDate value) {
		first_act_st_p().ymd_to(value);
	}

	/**
	 * Application start time (Result) TO 適用開始時（実績）ＴＯ.<p>
	 *
	 */
	public MCDate first_act_st_hm_to() {
		return first_act_st_p().hm_to();
	}

	/**
	 * Application start time (Result) TO 適用開始時（実績）ＴＯ.<p>
	 *
	 */
	public void first_act_st_hm_to(MCDate value) {
		first_act_st_p().hm_to(value);
	}

	/**
	 * Last start date FROM 最終着手日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate last_act_st_dt_fr() {
		return last_act_st_p().ymd_fr();
	}

	/**
	 * Last start date FROM 最終着手日ＦＲＯＭ.<p>
	 *
	 */
	public void last_act_st_dt_fr(MCDate value) {
		last_act_st_p().ymd_fr(value);
	}

	/**
	 * Last start time FROM 最終着手時ＦＲＯＭ.<p>
	 *
	 */
	public MCDate last_act_st_hm_fr() {
		return last_act_st_p().hm_fr();
	}

	/**
	 * Last start time FROM 最終着手時ＦＲＯＭ.<p>
	 *
	 */
	public void last_act_st_hm_fr(MCDate value) {
		last_act_st_p().hm_fr(value);
	}

	/**
	 * Last start date TO 最終着手日ＴＯ.<p>
	 *
	 */
	public MCDate last_act_st_dt_to() {
		return last_act_st_p().ymd_to();
	}

	/**
	 * Last start date TO 最終着手日ＴＯ.<p>
	 *
	 */
	public void last_act_st_dt_to(MCDate value) {
		last_act_st_p().ymd_to(value);
	}

	/**
	 * Last start time TO 最終着手時ＴＯ.<p>
	 *
	 */
	public MCDate last_act_st_hm_to() {
		return last_act_st_p().hm_to();
	}

	/**
	 * Last start time TO 最終着手時ＴＯ.<p>
	 *
	 */
	public void last_act_st_hm_to(MCDate value) {
		last_act_st_p().hm_to(value);
	}

	/**
	 * Child item type 子品目区分.<p>
	 *
	 */
	public String chd_itm_typ() {
		return chd_itm_typ_p().itm_typ();
	}

	/**
	 * Child item type 子品目区分.<p>
	 *
	 */
	public void chd_itm_typ(String value) {
		chd_itm_typ_p().itm_typ(value);
	}

	/**
	 * Child item type details 子品目区分詳細.<p>
	 *
	 */
	public String chd_itm_typ_d_cd() {
		return chd_itm_typ_p().itm_typ_d_cd();
	}

	/**
	 * Child item type details 子品目区分詳細.<p>
	 *
	 */
	public void chd_itm_typ_d_cd(String value) {
		chd_itm_typ_p().itm_typ_d_cd(value);
	}

	public String chd_itm_typ_d_nm() {
		return chd_itm_typ_p().itm_typ_d_nm();
	}

	public void chd_itm_typ_d_nm(String value) {
		chd_itm_typ_p().itm_typ_d_nm(value);
	}

	/**
	 * Child item cd. 子品目ＣＤ.<p>
	 *
	 */
	public String chd_itm_cd() {
		return chd_itm_p().itm_cd();
	}

	/**
	 * Child item cd. 子品目ＣＤ.<p>
	 *
	 */
	public void chd_itm_cd(String value) {
		chd_itm_p().itm_cd(value);
	}

	/**
	 * Child branch No. 1 子枝番１.<p>
	 *
	 */
	public String chd_itm_sub1() {
		return chd_itm_p().itm_sub1();
	}

	/**
	 * Child branch No. 1 子枝番１.<p>
	 *
	 */
	public void chd_itm_sub1(String value) {
		chd_itm_p().itm_sub1(value);
	}

	/**
	 * Child branch No. 2 子枝番２.<p>
	 *
	 */
	public String chd_itm_sub2() {
		return chd_itm_p().itm_sub2();
	}

	/**
	 * Child branch No. 2 子枝番２.<p>
	 *
	 */
	public void chd_itm_sub2(String value) {
		chd_itm_p().itm_sub2(value);
	}

	/**
	 * Child branch No. 3 子枝番３.<p>
	 *
	 */
	public String chd_itm_sub3() {
		return chd_itm_p().itm_sub3();
	}

	/**
	 * Child branch No. 3 子枝番３.<p>
	 *
	 */
	public void chd_itm_sub3(String value) {
		chd_itm_p().itm_sub3(value);
	}

	/**
	 * Child item name 子品目名.<p>
	 *
	 */
	public String chd_itm_nm() {
		return chd_itm_p().itm_nm();
	}

	/**
	 * Child item name 子品目名.<p>
	 *
	 */
	public void chd_itm_nm(String value) {
		chd_itm_p().itm_nm(value);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return ver_no_p().ver_no();
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		ver_no_p().ver_no(value);
	}

	/**
	 * Parent item type 親品目区分.<p>
	 *
	 */
	public String par_itm_typ() {
		return par_itm_typ_p().itm_typ();
	}

	/**
	 * Parent item type 親品目区分.<p>
	 *
	 */
	public void par_itm_typ(String value) {
		par_itm_typ_p().itm_typ(value);
	}

	/**
	 * Parent item type details 親品目区分詳細.<p>
	 *
	 */
	public String par_itm_typ_d_cd() {
		return par_itm_typ_p().itm_typ_d_cd();
	}

	/**
	 * Parent item type details 親品目区分詳細.<p>
	 *
	 */
	public void par_itm_typ_d_cd(String value) {
		par_itm_typ_p().itm_typ_d_cd(value);
	}

	public String par_itm_typ_d_nm() {
		return par_itm_typ_p().itm_typ_d_nm();
	}

	public void par_itm_typ_d_nm(String value) {
		par_itm_typ_p().itm_typ_d_nm(value);
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
	 * Parent item name 親品目名.<p>
	 *
	 */
	public String par_itm_nm() {
		return par_itm_p().itm_nm();
	}

	/**
	 * Parent item name 親品目名.<p>
	 *
	 */
	public void par_itm_nm(String value) {
		par_itm_p().itm_nm(value);
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

	/**
	 * Child item classification 1 子品目分類１.<p>
	 *
	 */
	public boolean chd_itm_grp_flg1() {
		return chd_itm_grp_p().itm_grp_flg1();
	}

	/**
	 * Child item classification 1 子品目分類１.<p>
	 *
	 */
	public void chd_itm_grp_flg1(boolean value) {
		chd_itm_grp_p().itm_grp_flg1(value);
	}

	/**
	 * Child item classification cd. 1 子品目分類ＣＤ１.<p>
	 *
	 */
	public String chd_itm_grp_cd1() {
		return chd_itm_grp_p().itm_grp_cd1();
	}

	/**
	 * Child item classification cd. 1 子品目分類ＣＤ１.<p>
	 *
	 */
	public void chd_itm_grp_cd1(String value) {
		chd_itm_grp_p().itm_grp_cd1(value);
	}

	/**
	 * Child item classification name 1 子品目分類名１.<p>
	 *
	 */
	public String chd_itm_grp_nm1() {
		return chd_itm_grp_p().itm_grp_nm1();
	}

	/**
	 * Child item classification name 1 子品目分類名１.<p>
	 *
	 */
	public void chd_itm_grp_nm1(String value) {
		chd_itm_grp_p().itm_grp_nm1(value);
	}

	/**
	 * Child item classification 2 子品目分類２.<p>
	 *
	 */
	public boolean chd_itm_grp_flg2() {
		return chd_itm_grp_p().itm_grp_flg2();
	}

	/**
	 * Child item classification 2 子品目分類２.<p>
	 *
	 */
	public void chd_itm_grp_flg2(boolean value) {
		chd_itm_grp_p().itm_grp_flg2(value);
	}

	/**
	 * Child item classification cd. 2 子品目分類ＣＤ２.<p>
	 *
	 */
	public String chd_itm_grp_cd2() {
		return chd_itm_grp_p().itm_grp_cd2();
	}

	/**
	 * Child item classification cd. 2 子品目分類ＣＤ２.<p>
	 *
	 */
	public void chd_itm_grp_cd2(String value) {
		chd_itm_grp_p().itm_grp_cd2(value);
	}

	/**
	 * Child item classification name 2 子品目分類名２.<p>
	 *
	 */
	public String chd_itm_grp_nm2() {
		return chd_itm_grp_p().itm_grp_nm2();
	}

	/**
	 * Child item classification name 2 子品目分類名２.<p>
	 *
	 */
	public void chd_itm_grp_nm2(String value) {
		chd_itm_grp_p().itm_grp_nm2(value);
	}

	/**
	 * Child item classification 3 子品目分類３.<p>
	 *
	 */
	public boolean chd_itm_grp_flg3() {
		return chd_itm_grp_p().itm_grp_flg3();
	}

	/**
	 * Child item classification 3 子品目分類３.<p>
	 *
	 */
	public void chd_itm_grp_flg3(boolean value) {
		chd_itm_grp_p().itm_grp_flg3(value);
	}

	/**
	 * Child item classification cd. 3 子品目分類ＣＤ３.<p>
	 *
	 */
	public String chd_itm_grp_cd3() {
		return chd_itm_grp_p().itm_grp_cd3();
	}

	/**
	 * Child item classification cd. 3 子品目分類ＣＤ３.<p>
	 *
	 */
	public void chd_itm_grp_cd3(String value) {
		chd_itm_grp_p().itm_grp_cd3(value);
	}

	/**
	 * Child item classification name 3 子品目分類名３.<p>
	 *
	 */
	public String chd_itm_grp_nm3() {
		return chd_itm_grp_p().itm_grp_nm3();
	}

	/**
	 * Child item classification name 3 子品目分類名３.<p>
	 *
	 */
	public void chd_itm_grp_nm3(String value) {
		chd_itm_grp_p().itm_grp_nm3(value);
	}

	/**
	 * Child item classification 4 子品目分類４.<p>
	 *
	 */
	public boolean chd_itm_grp_flg4() {
		return chd_itm_grp_p().itm_grp_flg4();
	}

	/**
	 * Child item classification 4 子品目分類４.<p>
	 *
	 */
	public void chd_itm_grp_flg4(boolean value) {
		chd_itm_grp_p().itm_grp_flg4(value);
	}

	/**
	 * Child item classification cd. 4 子品目分類ＣＤ４.<p>
	 *
	 */
	public String chd_itm_grp_cd4() {
		return chd_itm_grp_p().itm_grp_cd4();
	}

	/**
	 * Child item classification cd. 4 子品目分類ＣＤ４.<p>
	 *
	 */
	public void chd_itm_grp_cd4(String value) {
		chd_itm_grp_p().itm_grp_cd4(value);
	}

	/**
	 * Child item classification name 4 子品目分類名４.<p>
	 *
	 */
	public String chd_itm_grp_nm4() {
		return chd_itm_grp_p().itm_grp_nm4();
	}

	/**
	 * Child item classification name 4 子品目分類名４.<p>
	 *
	 */
	public void chd_itm_grp_nm4(String value) {
		chd_itm_grp_p().itm_grp_nm4(value);
	}

	/**
	 * Child item classification 5 子品目分類５.<p>
	 *
	 */
	public boolean chd_itm_grp_flg5() {
		return chd_itm_grp_p().itm_grp_flg5();
	}

	/**
	 * Child item classification 5 子品目分類５.<p>
	 *
	 */
	public void chd_itm_grp_flg5(boolean value) {
		chd_itm_grp_p().itm_grp_flg5(value);
	}

	/**
	 * Child item classification cd. 5 子品目分類ＣＤ５.<p>
	 *
	 */
	public String chd_itm_grp_cd5() {
		return chd_itm_grp_p().itm_grp_cd5();
	}

	/**
	 * Child item classification cd. 5 子品目分類ＣＤ５.<p>
	 *
	 */
	public void chd_itm_grp_cd5(String value) {
		chd_itm_grp_p().itm_grp_cd5(value);
	}

	/**
	 * Child item classification name 5 子品目分類名５.<p>
	 *
	 */
	public String chd_itm_grp_nm5() {
		return chd_itm_grp_p().itm_grp_nm5();
	}

	/**
	 * Child item classification name 5 子品目分類名５.<p>
	 *
	 */
	public void chd_itm_grp_nm5(String value) {
		chd_itm_grp_p().itm_grp_nm5(value);
	}

	/**
	 * Child item classification 6 子品目分類６.<p>
	 *
	 */
	public boolean chd_itm_grp_flg6() {
		return chd_itm_grp_p().itm_grp_flg6();
	}

	/**
	 * Child item classification 6 子品目分類６.<p>
	 *
	 */
	public void chd_itm_grp_flg6(boolean value) {
		chd_itm_grp_p().itm_grp_flg6(value);
	}

	/**
	 * Child item classification cd. 6 子品目分類ＣＤ６.<p>
	 *
	 */
	public String chd_itm_grp_cd6() {
		return chd_itm_grp_p().itm_grp_cd6();
	}

	/**
	 * Child item classification cd. 6 子品目分類ＣＤ６.<p>
	 *
	 */
	public void chd_itm_grp_cd6(String value) {
		chd_itm_grp_p().itm_grp_cd6(value);
	}

	/**
	 * Child item classification name 6 子品目分類名６.<p>
	 *
	 */
	public String chd_itm_grp_nm6() {
		return chd_itm_grp_p().itm_grp_nm6();
	}

	/**
	 * Child item classification name 6 子品目分類名６.<p>
	 *
	 */
	public void chd_itm_grp_nm6(String value) {
		chd_itm_grp_p().itm_grp_nm6(value);
	}

	/**
	 * Child item classification 7 子品目分類７.<p>
	 *
	 */
	public boolean chd_itm_grp_flg7() {
		return chd_itm_grp_p().itm_grp_flg7();
	}

	/**
	 * Child item classification 7 子品目分類７.<p>
	 *
	 */
	public void chd_itm_grp_flg7(boolean value) {
		chd_itm_grp_p().itm_grp_flg7(value);
	}

	/**
	 * Child item classification cd. 7 子品目分類ＣＤ７.<p>
	 *
	 */
	public String chd_itm_grp_cd7() {
		return chd_itm_grp_p().itm_grp_cd7();
	}

	/**
	 * Child item classification cd. 7 子品目分類ＣＤ７.<p>
	 *
	 */
	public void chd_itm_grp_cd7(String value) {
		chd_itm_grp_p().itm_grp_cd7(value);
	}

	/**
	 * Child item classification name 7 子品目分類名７.<p>
	 *
	 */
	public String chd_itm_grp_nm7() {
		return chd_itm_grp_p().itm_grp_nm7();
	}

	/**
	 * Child item classification name 7 子品目分類名７.<p>
	 *
	 */
	public void chd_itm_grp_nm7(String value) {
		chd_itm_grp_p().itm_grp_nm7(value);
	}

	/**
	 * Child item classification 8 子品目分類８.<p>
	 *
	 */
	public boolean chd_itm_grp_flg8() {
		return chd_itm_grp_p().itm_grp_flg8();
	}

	/**
	 * Child item classification 8 子品目分類８.<p>
	 *
	 */
	public void chd_itm_grp_flg8(boolean value) {
		chd_itm_grp_p().itm_grp_flg8(value);
	}

	/**
	 * Child item classification cd. 8 子品目分類ＣＤ８.<p>
	 *
	 */
	public String chd_itm_grp_cd8() {
		return chd_itm_grp_p().itm_grp_cd8();
	}

	/**
	 * Child item classification cd. 8 子品目分類ＣＤ８.<p>
	 *
	 */
	public void chd_itm_grp_cd8(String value) {
		chd_itm_grp_p().itm_grp_cd8(value);
	}

	/**
	 * Child item classification name 8 子品目分類名８.<p>
	 *
	 */
	public String chd_itm_grp_nm8() {
		return chd_itm_grp_p().itm_grp_nm8();
	}

	/**
	 * Child item classification name 8 子品目分類名８.<p>
	 *
	 */
	public void chd_itm_grp_nm8(String value) {
		chd_itm_grp_p().itm_grp_nm8(value);
	}

	/**
	 * Child item classification 9 子品目分類９.<p>
	 *
	 */
	public boolean chd_itm_grp_flg9() {
		return chd_itm_grp_p().itm_grp_flg9();
	}

	/**
	 * Child item classification 9 子品目分類９.<p>
	 *
	 */
	public void chd_itm_grp_flg9(boolean value) {
		chd_itm_grp_p().itm_grp_flg9(value);
	}

	/**
	 * Child item classification cd. 9 子品目分類ＣＤ９.<p>
	 *
	 */
	public String chd_itm_grp_cd9() {
		return chd_itm_grp_p().itm_grp_cd9();
	}

	/**
	 * Child item classification cd. 9 子品目分類ＣＤ９.<p>
	 *
	 */
	public void chd_itm_grp_cd9(String value) {
		chd_itm_grp_p().itm_grp_cd9(value);
	}

	/**
	 * Child item classification name 9 子品目分類名９.<p>
	 *
	 */
	public String chd_itm_grp_nm9() {
		return chd_itm_grp_p().itm_grp_nm9();
	}

	/**
	 * Child item classification name 9 子品目分類名９.<p>
	 *
	 */
	public void chd_itm_grp_nm9(String value) {
		chd_itm_grp_p().itm_grp_nm9(value);
	}

	/**
	 * Child item classification 10 子品目分類１０.<p>
	 *
	 */
	public boolean chd_itm_grp_flg10() {
		return chd_itm_grp_p().itm_grp_flg10();
	}

	/**
	 * Child item classification 10 子品目分類１０.<p>
	 *
	 */
	public void chd_itm_grp_flg10(boolean value) {
		chd_itm_grp_p().itm_grp_flg10(value);
	}

	/**
	 * Child item classification cd. 10 子品目分類ＣＤ１０.<p>
	 *
	 */
	public String chd_itm_grp_cd10() {
		return chd_itm_grp_p().itm_grp_cd10();
	}

	/**
	 * Child item classification cd. 10 子品目分類ＣＤ１０.<p>
	 *
	 */
	public void chd_itm_grp_cd10(String value) {
		chd_itm_grp_p().itm_grp_cd10(value);
	}

	/**
	 * Child item classification name 10 子品目分類名１０.<p>
	 *
	 */
	public String chd_itm_grp_nm10() {
		return chd_itm_grp_p().itm_grp_nm10();
	}

	/**
	 * Child item classification name 10 子品目分類名１０.<p>
	 *
	 */
	public void chd_itm_grp_nm10(String value) {
		chd_itm_grp_p().itm_grp_nm10(value);
	}

	/**
	 * Parent item classification 1 親品目分類１.<p>
	 *
	 */
	public boolean par_itm_grp_flg1() {
		return par_itm_grp_p().itm_grp_flg1();
	}

	/**
	 * Parent item classification 1 親品目分類１.<p>
	 *
	 */
	public void par_itm_grp_flg1(boolean value) {
		par_itm_grp_p().itm_grp_flg1(value);
	}

	/**
	 * Parent item classification cd. 1 親品目分類ＣＤ１.<p>
	 *
	 */
	public String par_itm_grp_cd1() {
		return par_itm_grp_p().itm_grp_cd1();
	}

	/**
	 * Parent item classification cd. 1 親品目分類ＣＤ１.<p>
	 *
	 */
	public void par_itm_grp_cd1(String value) {
		par_itm_grp_p().itm_grp_cd1(value);
	}

	/**
	 * Parent item classification name 1 親品目分類名１.<p>
	 *
	 */
	public String par_itm_grp_nm1() {
		return par_itm_grp_p().itm_grp_nm1();
	}

	/**
	 * Parent item classification name 1 親品目分類名１.<p>
	 *
	 */
	public void par_itm_grp_nm1(String value) {
		par_itm_grp_p().itm_grp_nm1(value);
	}

	/**
	 * Parent item classification 2 親品目分類２.<p>
	 *
	 */
	public boolean par_itm_grp_flg2() {
		return par_itm_grp_p().itm_grp_flg2();
	}

	/**
	 * Parent item classification 2 親品目分類２.<p>
	 *
	 */
	public void par_itm_grp_flg2(boolean value) {
		par_itm_grp_p().itm_grp_flg2(value);
	}

	/**
	 * Parent item classification cd. 2 親品目分類ＣＤ２.<p>
	 *
	 */
	public String par_itm_grp_cd2() {
		return par_itm_grp_p().itm_grp_cd2();
	}

	/**
	 * Parent item classification cd. 2 親品目分類ＣＤ２.<p>
	 *
	 */
	public void par_itm_grp_cd2(String value) {
		par_itm_grp_p().itm_grp_cd2(value);
	}

	/**
	 * Parent item classification name 2 親品目分類名２.<p>
	 *
	 */
	public String par_itm_grp_nm2() {
		return par_itm_grp_p().itm_grp_nm2();
	}

	/**
	 * Parent item classification name 2 親品目分類名２.<p>
	 *
	 */
	public void par_itm_grp_nm2(String value) {
		par_itm_grp_p().itm_grp_nm2(value);
	}

	/**
	 * Parent item classification 3 親品目分類３.<p>
	 *
	 */
	public boolean par_itm_grp_flg3() {
		return par_itm_grp_p().itm_grp_flg3();
	}

	/**
	 * Parent item classification 3 親品目分類３.<p>
	 *
	 */
	public void par_itm_grp_flg3(boolean value) {
		par_itm_grp_p().itm_grp_flg3(value);
	}

	/**
	 * Parent item classification cd. 3 親品目分類ＣＤ３.<p>
	 *
	 */
	public String par_itm_grp_cd3() {
		return par_itm_grp_p().itm_grp_cd3();
	}

	/**
	 * Parent item classification cd. 3 親品目分類ＣＤ３.<p>
	 *
	 */
	public void par_itm_grp_cd3(String value) {
		par_itm_grp_p().itm_grp_cd3(value);
	}

	/**
	 * Parent item classification name 3 親品目分類名３.<p>
	 *
	 */
	public String par_itm_grp_nm3() {
		return par_itm_grp_p().itm_grp_nm3();
	}

	/**
	 * Parent item classification name 3 親品目分類名３.<p>
	 *
	 */
	public void par_itm_grp_nm3(String value) {
		par_itm_grp_p().itm_grp_nm3(value);
	}

	/**
	 * Parent item classification 4 親品目分類４.<p>
	 *
	 */
	public boolean par_itm_grp_flg4() {
		return par_itm_grp_p().itm_grp_flg4();
	}

	/**
	 * Parent item classification 4 親品目分類４.<p>
	 *
	 */
	public void par_itm_grp_flg4(boolean value) {
		par_itm_grp_p().itm_grp_flg4(value);
	}

	/**
	 * Parent item classification cd. 4 親品目分類ＣＤ４.<p>
	 *
	 */
	public String par_itm_grp_cd4() {
		return par_itm_grp_p().itm_grp_cd4();
	}

	/**
	 * Parent item classification cd. 4 親品目分類ＣＤ４.<p>
	 *
	 */
	public void par_itm_grp_cd4(String value) {
		par_itm_grp_p().itm_grp_cd4(value);
	}

	/**
	 * Parent item classification name 4 親品目分類名４.<p>
	 *
	 */
	public String par_itm_grp_nm4() {
		return par_itm_grp_p().itm_grp_nm4();
	}

	/**
	 * Parent item classification name 4 親品目分類名４.<p>
	 *
	 */
	public void par_itm_grp_nm4(String value) {
		par_itm_grp_p().itm_grp_nm4(value);
	}

	/**
	 * Parent item classification 5 親品目分類５.<p>
	 *
	 */
	public boolean par_itm_grp_flg5() {
		return par_itm_grp_p().itm_grp_flg5();
	}

	/**
	 * Parent item classification 5 親品目分類５.<p>
	 *
	 */
	public void par_itm_grp_flg5(boolean value) {
		par_itm_grp_p().itm_grp_flg5(value);
	}

	/**
	 * Parent item classification cd. 5 親品目分類ＣＤ５.<p>
	 *
	 */
	public String par_itm_grp_cd5() {
		return par_itm_grp_p().itm_grp_cd5();
	}

	/**
	 * Parent item classification cd. 5 親品目分類ＣＤ５.<p>
	 *
	 */
	public void par_itm_grp_cd5(String value) {
		par_itm_grp_p().itm_grp_cd5(value);
	}

	/**
	 * Parent item classification name 5 親品目分類名５.<p>
	 *
	 */
	public String par_itm_grp_nm5() {
		return par_itm_grp_p().itm_grp_nm5();
	}

	/**
	 * Parent item classification name 5 親品目分類名５.<p>
	 *
	 */
	public void par_itm_grp_nm5(String value) {
		par_itm_grp_p().itm_grp_nm5(value);
	}

	/**
	 * Parent item classification 6 親品目分類６.<p>
	 *
	 */
	public boolean par_itm_grp_flg6() {
		return par_itm_grp_p().itm_grp_flg6();
	}

	/**
	 * Parent item classification 6 親品目分類６.<p>
	 *
	 */
	public void par_itm_grp_flg6(boolean value) {
		par_itm_grp_p().itm_grp_flg6(value);
	}

	/**
	 * Parent item classification cd. 6 親品目分類ＣＤ６.<p>
	 *
	 */
	public String par_itm_grp_cd6() {
		return par_itm_grp_p().itm_grp_cd6();
	}

	/**
	 * Parent item classification cd. 6 親品目分類ＣＤ６.<p>
	 *
	 */
	public void par_itm_grp_cd6(String value) {
		par_itm_grp_p().itm_grp_cd6(value);
	}

	/**
	 * Parent item classification name 6 親品目分類名６.<p>
	 *
	 */
	public String par_itm_grp_nm6() {
		return par_itm_grp_p().itm_grp_nm6();
	}

	/**
	 * Parent item classification name 6 親品目分類名６.<p>
	 *
	 */
	public void par_itm_grp_nm6(String value) {
		par_itm_grp_p().itm_grp_nm6(value);
	}

	/**
	 * Parent item classification 7 親品目分類７.<p>
	 *
	 */
	public boolean par_itm_grp_flg7() {
		return par_itm_grp_p().itm_grp_flg7();
	}

	/**
	 * Parent item classification 7 親品目分類７.<p>
	 *
	 */
	public void par_itm_grp_flg7(boolean value) {
		par_itm_grp_p().itm_grp_flg7(value);
	}

	/**
	 * Parent item classification cd. 7 親品目分類ＣＤ７.<p>
	 *
	 */
	public String par_itm_grp_cd7() {
		return par_itm_grp_p().itm_grp_cd7();
	}

	/**
	 * Parent item classification cd. 7 親品目分類ＣＤ７.<p>
	 *
	 */
	public void par_itm_grp_cd7(String value) {
		par_itm_grp_p().itm_grp_cd7(value);
	}

	/**
	 * Parent item classification name 7 親品目分類名７.<p>
	 *
	 */
	public String par_itm_grp_nm7() {
		return par_itm_grp_p().itm_grp_nm7();
	}

	/**
	 * Parent item classification name 7 親品目分類名７.<p>
	 *
	 */
	public void par_itm_grp_nm7(String value) {
		par_itm_grp_p().itm_grp_nm7(value);
	}

	/**
	 * Parent item classification 8 親品目分類８.<p>
	 *
	 */
	public boolean par_itm_grp_flg8() {
		return par_itm_grp_p().itm_grp_flg8();
	}

	/**
	 * Parent item classification 8 親品目分類８.<p>
	 *
	 */
	public void par_itm_grp_flg8(boolean value) {
		par_itm_grp_p().itm_grp_flg8(value);
	}

	/**
	 * Parent item classification cd. 8 親品目分類ＣＤ８.<p>
	 *
	 */
	public String par_itm_grp_cd8() {
		return par_itm_grp_p().itm_grp_cd8();
	}

	/**
	 * Parent item classification cd. 8 親品目分類ＣＤ８.<p>
	 *
	 */
	public void par_itm_grp_cd8(String value) {
		par_itm_grp_p().itm_grp_cd8(value);
	}

	/**
	 * Parent item classification name 8 親品目分類名８.<p>
	 *
	 */
	public String par_itm_grp_nm8() {
		return par_itm_grp_p().itm_grp_nm8();
	}

	/**
	 * Parent item classification name 8 親品目分類名８.<p>
	 *
	 */
	public void par_itm_grp_nm8(String value) {
		par_itm_grp_p().itm_grp_nm8(value);
	}

	/**
	 * Parent item classification 9 親品目分類９.<p>
	 *
	 */
	public boolean par_itm_grp_flg9() {
		return par_itm_grp_p().itm_grp_flg9();
	}

	/**
	 * Parent item classification 9 親品目分類９.<p>
	 *
	 */
	public void par_itm_grp_flg9(boolean value) {
		par_itm_grp_p().itm_grp_flg9(value);
	}

	/**
	 * Parent item classification cd. 9 親品目分類ＣＤ９.<p>
	 *
	 */
	public String par_itm_grp_cd9() {
		return par_itm_grp_p().itm_grp_cd9();
	}

	/**
	 * Parent item classification cd. 9 親品目分類ＣＤ９.<p>
	 *
	 */
	public void par_itm_grp_cd9(String value) {
		par_itm_grp_p().itm_grp_cd9(value);
	}

	/**
	 * Parent item classification name 9 親品目分類名９.<p>
	 *
	 */
	public String par_itm_grp_nm9() {
		return par_itm_grp_p().itm_grp_nm9();
	}

	/**
	 * Parent item classification name 9 親品目分類名９.<p>
	 *
	 */
	public void par_itm_grp_nm9(String value) {
		par_itm_grp_p().itm_grp_nm9(value);
	}

	/**
	 * Parent item classification 10 親品目分類１０.<p>
	 *
	 */
	public boolean par_itm_grp_flg10() {
		return par_itm_grp_p().itm_grp_flg10();
	}

	/**
	 * Parent item classification 10 親品目分類１０.<p>
	 *
	 */
	public void par_itm_grp_flg10(boolean value) {
		par_itm_grp_p().itm_grp_flg10(value);
	}

	/**
	 * Parent item classification cd. 10 親品目分類ＣＤ１０.<p>
	 *
	 */
	public String par_itm_grp_cd10() {
		return par_itm_grp_p().itm_grp_cd10();
	}

	/**
	 * Parent item classification cd. 10 親品目分類ＣＤ１０.<p>
	 *
	 */
	public void par_itm_grp_cd10(String value) {
		par_itm_grp_p().itm_grp_cd10(value);
	}

	/**
	 * Parent item classification name 10 親品目分類名１０.<p>
	 *
	 */
	public String par_itm_grp_nm10() {
		return par_itm_grp_p().itm_grp_nm10();
	}

	/**
	 * Parent item classification name 10 親品目分類名１０.<p>
	 *
	 */
	public void par_itm_grp_nm10(String value) {
		par_itm_grp_p().itm_grp_nm10(value);
	}

}

