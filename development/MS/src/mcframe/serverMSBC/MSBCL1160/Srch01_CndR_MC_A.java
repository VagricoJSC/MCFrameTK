package mcframe.serverMSBC.MSBCL1160;

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
 * ブロック"Srch01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_CndR_MC_A extends MCConstRow {

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
	/**
	 * Completed (Character string) 完了（文字列）.<p>
	 *
	 */
	public static final String $w_cmpl_flg_str = "w_cmpl_flg_str";
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
	 * Version change status type 版切替状況区分.<p>
	 *
	 */
	public static final String $ver_chg_sts_typ = "ver_chg_sts_typ";
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
	 * Child item type 子品目区分.<p>
	 *
	 */
	public static final String $chd_itm_typ = "chd_itm_typ";
	/**
	 * Child item type details cd. 子品目区分詳細ＣＤ.<p>
	 *
	 */
	public static final String $chd_itm_typ_d_cd = "chd_itm_typ_d_cd";
	/**
	 * Child item type details name 子品目区分詳細名.<p>
	 *
	 */
	public static final String $chd_itm_typ_d_nm = "chd_itm_typ_d_nm";
	/**
	 * Child item cd. 子品目ＣＤ.<p>
	 *
	 */
	public static final String $chd_itm_cd = "chd_itm_cd";
	/**
	 * Child branch No. 1 子枝番１.<p>
	 *
	 */
	public static final String $chd_itm_sub1 = "chd_itm_sub1";
	/**
	 * Child branch No. 2 子枝番２.<p>
	 *
	 */
	public static final String $chd_itm_sub2 = "chd_itm_sub2";
	/**
	 * Child branch No. 3 子枝番３.<p>
	 *
	 */
	public static final String $chd_itm_sub3 = "chd_itm_sub3";
	/**
	 * Child item name 子品名.<p>
	 *
	 */
	public static final String $chd_itm_nm = "chd_itm_nm";
	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public static final String $ver_no = "ver_no";
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
	 * Parent item type 親品目区分.<p>
	 *
	 */
	public static final String $par_itm_typ = "par_itm_typ";
	/**
	 * Parent item type details cd. 親品目区分詳細ＣＤ.<p>
	 *
	 */
	public static final String $par_itm_typ_d_cd = "par_itm_typ_d_cd";
	/**
	 * Parent item type details name 親品目区分詳細名.<p>
	 *
	 */
	public static final String $par_itm_typ_d_nm = "par_itm_typ_d_nm";
	/**
	 * Parent item cd. 親品目ＣＤ.<p>
	 *
	 */
	public static final String $par_itm_cd = "par_itm_cd";
	/**
	 * Parent branch No. 1 親枝番１.<p>
	 *
	 */
	public static final String $par_itm_sub1 = "par_itm_sub1";
	/**
	 * Parent branch No. 2 親枝番２.<p>
	 *
	 */
	public static final String $par_itm_sub2 = "par_itm_sub2";
	/**
	 * Parent branch No. 3 親枝番３.<p>
	 *
	 */
	public static final String $par_itm_sub3 = "par_itm_sub3";
	/**
	 * Parent item name 親品名.<p>
	 *
	 */
	public static final String $par_itm_nm = "par_itm_nm";
	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public static final String $sno1 = "sno1";
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public static final String $sno2 = "sno2";
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public static final String $sno3 = "sno3";
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public static final String $sno4 = "sno4";
	/**
	 * Application start date (Order) FROM 適用開始日（指図）ＦＲＯＭ.<p>
	 *
	 */
	public static final String $first_inst_st_dt_fr = "first_inst_st_dt_fr";
	/**
	 * Application start time (Order) FROM 適用開始時（指図）ＦＲＯＭ.<p>
	 *
	 */
	public static final String $first_inst_st_hm_fr = "first_inst_st_hm_fr";
	/**
	 * Application start date (Order) TO 適用開始日（指図）ＴＯ.<p>
	 *
	 */
	public static final String $first_inst_st_dt_to = "first_inst_st_dt_to";
	/**
	 * Application start time (Order) TO 適用開始時（指図）ＴＯ.<p>
	 *
	 */
	public static final String $first_inst_st_hm_to = "first_inst_st_hm_to";
	/**
	 * Application start date (Result) FROM 適用開始日（実績）ＦＲＯＭ.<p>
	 *
	 */
	public static final String $first_act_st_dt_fr = "first_act_st_dt_fr";
	/**
	 * Application start time (Result) FROM 適用開始時（実績）ＦＲＯＭ.<p>
	 *
	 */
	public static final String $first_act_st_hm_fr = "first_act_st_hm_fr";
	/**
	 * Application start date (Result) TO 適用開始日（実績）ＴＯ.<p>
	 *
	 */
	public static final String $first_act_st_dt_to = "first_act_st_dt_to";
	/**
	 * Application start time (Result) TO 適用開始時（実績）ＴＯ.<p>
	 *
	 */
	public static final String $first_act_st_hm_to = "first_act_st_hm_to";
	/**
	 * Last start date FROM 最終着手日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $last_act_st_dt_fr = "last_act_st_dt_fr";
	/**
	 * Last start time FROM 最終着手時ＦＲＯＭ.<p>
	 *
	 */
	public static final String $last_act_st_hm_fr = "last_act_st_hm_fr";
	/**
	 * Last start date TO 最終着手日ＴＯ.<p>
	 *
	 */
	public static final String $last_act_st_dt_to = "last_act_st_dt_to";
	/**
	 * Last start time TO 最終着手時ＴＯ.<p>
	 *
	 */
	public static final String $last_act_st_hm_to = "last_act_st_hm_to";
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
	 * Child item classification 1 子品目分類１.<p>
	 *
	 */
	public static final String $chd_itm_grp_flg1 = "chd_itm_grp_flg1";
	/**
	 * Child item classification cd. 1 子品目分類ＣＤ１.<p>
	 *
	 */
	public static final String $chd_itm_grp_cd1 = "chd_itm_grp_cd1";
	/**
	 * Child item classification name 1 子品目分類名１.<p>
	 *
	 */
	public static final String $chd_itm_grp_nm1 = "chd_itm_grp_nm1";
	/**
	 * Child item classification 2 子品目分類２.<p>
	 *
	 */
	public static final String $chd_itm_grp_flg2 = "chd_itm_grp_flg2";
	/**
	 * Child item classification cd. 2 子品目分類ＣＤ２.<p>
	 *
	 */
	public static final String $chd_itm_grp_cd2 = "chd_itm_grp_cd2";
	/**
	 * Child item classification name 2 子品目分類名２.<p>
	 *
	 */
	public static final String $chd_itm_grp_nm2 = "chd_itm_grp_nm2";
	/**
	 * Child item classification 3 子品目分類３.<p>
	 *
	 */
	public static final String $chd_itm_grp_flg3 = "chd_itm_grp_flg3";
	/**
	 * Child item classification cd. 3 子品目分類ＣＤ３.<p>
	 *
	 */
	public static final String $chd_itm_grp_cd3 = "chd_itm_grp_cd3";
	/**
	 * Child item classification name 3 子品目分類名３.<p>
	 *
	 */
	public static final String $chd_itm_grp_nm3 = "chd_itm_grp_nm3";
	/**
	 * Child item classification 4 子品目分類４.<p>
	 *
	 */
	public static final String $chd_itm_grp_flg4 = "chd_itm_grp_flg4";
	/**
	 * Child item classification cd. 4 子品目分類ＣＤ４.<p>
	 *
	 */
	public static final String $chd_itm_grp_cd4 = "chd_itm_grp_cd4";
	/**
	 * Child item classification name 4 子品目分類名４.<p>
	 *
	 */
	public static final String $chd_itm_grp_nm4 = "chd_itm_grp_nm4";
	/**
	 * Child item classification 5 子品目分類５.<p>
	 *
	 */
	public static final String $chd_itm_grp_flg5 = "chd_itm_grp_flg5";
	/**
	 * Child item classification cd. 5 子品目分類ＣＤ５.<p>
	 *
	 */
	public static final String $chd_itm_grp_cd5 = "chd_itm_grp_cd5";
	/**
	 * Child item classification name 5 子品目分類名５.<p>
	 *
	 */
	public static final String $chd_itm_grp_nm5 = "chd_itm_grp_nm5";
	/**
	 * Child item classification 6 子品目分類６.<p>
	 *
	 */
	public static final String $chd_itm_grp_flg6 = "chd_itm_grp_flg6";
	/**
	 * Child item classification cd. 6 子品目分類ＣＤ６.<p>
	 *
	 */
	public static final String $chd_itm_grp_cd6 = "chd_itm_grp_cd6";
	/**
	 * Child item classification name 6 子品目分類名６.<p>
	 *
	 */
	public static final String $chd_itm_grp_nm6 = "chd_itm_grp_nm6";
	/**
	 * Child item classification 7 子品目分類７.<p>
	 *
	 */
	public static final String $chd_itm_grp_flg7 = "chd_itm_grp_flg7";
	/**
	 * Child item classification cd. 7 子品目分類ＣＤ７.<p>
	 *
	 */
	public static final String $chd_itm_grp_cd7 = "chd_itm_grp_cd7";
	/**
	 * Child item classification name 7 子品目分類名７.<p>
	 *
	 */
	public static final String $chd_itm_grp_nm7 = "chd_itm_grp_nm7";
	/**
	 * Child item classification 8 子品目分類８.<p>
	 *
	 */
	public static final String $chd_itm_grp_flg8 = "chd_itm_grp_flg8";
	/**
	 * Child item classification cd. 8 子品目分類ＣＤ８.<p>
	 *
	 */
	public static final String $chd_itm_grp_cd8 = "chd_itm_grp_cd8";
	/**
	 * Child item classification name 8 子品目分類名８.<p>
	 *
	 */
	public static final String $chd_itm_grp_nm8 = "chd_itm_grp_nm8";
	/**
	 * Child item classification 9 子品目分類９.<p>
	 *
	 */
	public static final String $chd_itm_grp_flg9 = "chd_itm_grp_flg9";
	/**
	 * Child item classification cd. 9 子品目分類ＣＤ９.<p>
	 *
	 */
	public static final String $chd_itm_grp_cd9 = "chd_itm_grp_cd9";
	/**
	 * Child item classification name 9 子品目分類名９.<p>
	 *
	 */
	public static final String $chd_itm_grp_nm9 = "chd_itm_grp_nm9";
	/**
	 * Child item classification 10 子品目分類１０.<p>
	 *
	 */
	public static final String $chd_itm_grp_flg10 = "chd_itm_grp_flg10";
	/**
	 * Child item classification cd. 10 子品目分類ＣＤ１０.<p>
	 *
	 */
	public static final String $chd_itm_grp_cd10 = "chd_itm_grp_cd10";
	/**
	 * Child item classification name 10 子品目分類名１０.<p>
	 *
	 */
	public static final String $chd_itm_grp_nm10 = "chd_itm_grp_nm10";
	/**
	 * Parent item classification 1 親品目分類１.<p>
	 *
	 */
	public static final String $par_itm_grp_flg1 = "par_itm_grp_flg1";
	/**
	 * Parent item classification cd. 1 親品目分類ＣＤ１.<p>
	 *
	 */
	public static final String $par_itm_grp_cd1 = "par_itm_grp_cd1";
	/**
	 * Parent item classification name 1 親品目分類名１.<p>
	 *
	 */
	public static final String $par_itm_grp_nm1 = "par_itm_grp_nm1";
	/**
	 * Parent item classification 2 親品目分類２.<p>
	 *
	 */
	public static final String $par_itm_grp_flg2 = "par_itm_grp_flg2";
	/**
	 * Parent item classification cd. 2 親品目分類ＣＤ２.<p>
	 *
	 */
	public static final String $par_itm_grp_cd2 = "par_itm_grp_cd2";
	/**
	 * Parent item classification name 2 親品目分類名２.<p>
	 *
	 */
	public static final String $par_itm_grp_nm2 = "par_itm_grp_nm2";
	/**
	 * Parent item classification 3 親品目分類３.<p>
	 *
	 */
	public static final String $par_itm_grp_flg3 = "par_itm_grp_flg3";
	/**
	 * Parent item classification cd. 3 親品目分類ＣＤ３.<p>
	 *
	 */
	public static final String $par_itm_grp_cd3 = "par_itm_grp_cd3";
	/**
	 * Parent item classification name 3 親品目分類名３.<p>
	 *
	 */
	public static final String $par_itm_grp_nm3 = "par_itm_grp_nm3";
	/**
	 * Parent item classification 4 親品目分類４.<p>
	 *
	 */
	public static final String $par_itm_grp_flg4 = "par_itm_grp_flg4";
	/**
	 * Parent item classification cd. 4 親品目分類ＣＤ４.<p>
	 *
	 */
	public static final String $par_itm_grp_cd4 = "par_itm_grp_cd4";
	/**
	 * Parent item classification name 4 親品目分類名４.<p>
	 *
	 */
	public static final String $par_itm_grp_nm4 = "par_itm_grp_nm4";
	/**
	 * Parent item classification 5 親品目分類５.<p>
	 *
	 */
	public static final String $par_itm_grp_flg5 = "par_itm_grp_flg5";
	/**
	 * Parent item classification cd. 5 親品目分類ＣＤ５.<p>
	 *
	 */
	public static final String $par_itm_grp_cd5 = "par_itm_grp_cd5";
	/**
	 * Parent item classification name 5 親品目分類名５.<p>
	 *
	 */
	public static final String $par_itm_grp_nm5 = "par_itm_grp_nm5";
	/**
	 * Parent item classification 6 親品目分類６.<p>
	 *
	 */
	public static final String $par_itm_grp_flg6 = "par_itm_grp_flg6";
	/**
	 * Parent item classification cd. 6 親品目分類ＣＤ６.<p>
	 *
	 */
	public static final String $par_itm_grp_cd6 = "par_itm_grp_cd6";
	/**
	 * Parent item classification name 6 親品目分類名６.<p>
	 *
	 */
	public static final String $par_itm_grp_nm6 = "par_itm_grp_nm6";
	/**
	 * Parent item classification 7 親品目分類７.<p>
	 *
	 */
	public static final String $par_itm_grp_flg7 = "par_itm_grp_flg7";
	/**
	 * Parent item classification cd. 7 親品目分類ＣＤ７.<p>
	 *
	 */
	public static final String $par_itm_grp_cd7 = "par_itm_grp_cd7";
	/**
	 * Parent item classification name 7 親品目分類名７.<p>
	 *
	 */
	public static final String $par_itm_grp_nm7 = "par_itm_grp_nm7";
	/**
	 * Parent item classification 8 親品目分類８.<p>
	 *
	 */
	public static final String $par_itm_grp_flg8 = "par_itm_grp_flg8";
	/**
	 * Parent item classification cd. 8 親品目分類ＣＤ８.<p>
	 *
	 */
	public static final String $par_itm_grp_cd8 = "par_itm_grp_cd8";
	/**
	 * Parent item classification name 8 親品目分類名８.<p>
	 *
	 */
	public static final String $par_itm_grp_nm8 = "par_itm_grp_nm8";
	/**
	 * Parent item classification 9 親品目分類９.<p>
	 *
	 */
	public static final String $par_itm_grp_flg9 = "par_itm_grp_flg9";
	/**
	 * Parent item classification cd. 9 親品目分類ＣＤ９.<p>
	 *
	 */
	public static final String $par_itm_grp_cd9 = "par_itm_grp_cd9";
	/**
	 * Parent item classification name 9 親品目分類名９.<p>
	 *
	 */
	public static final String $par_itm_grp_nm9 = "par_itm_grp_nm9";
	/**
	 * Parent item classification 10 親品目分類１０.<p>
	 *
	 */
	public static final String $par_itm_grp_flg10 = "par_itm_grp_flg10";
	/**
	 * Parent item classification cd. 10 親品目分類ＣＤ１０.<p>
	 *
	 */
	public static final String $par_itm_grp_cd10 = "par_itm_grp_cd10";
	/**
	 * Parent item classification name 10 親品目分類名１０.<p>
	 *
	 */
	public static final String $par_itm_grp_nm10 = "par_itm_grp_nm10";


	public static final MCMeta uncmpl_flg_META = createCommonMeta($uncmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cmpl_flg_META = createCommonMeta($cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta w_cmpl_flg_str_META = createStringMeta($w_cmpl_flg_str);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta site_nm_META = createCommonMeta($site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta ver_chg_sts_typ_META = createCommonMeta($ver_chg_sts_typ, mcframe.commonMS.meta.MS_META.VER_CHG_STS_TYP);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta chd_itm_typ_META = createCommonMeta($chd_itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta chd_itm_typ_d_cd_META = createCommonMeta($chd_itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta chd_itm_typ_d_nm_META = createCommonMeta($chd_itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta chd_itm_cd_META = createCommonMeta($chd_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta chd_itm_sub1_META = createCommonMeta($chd_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta chd_itm_sub2_META = createCommonMeta($chd_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta chd_itm_sub3_META = createCommonMeta($chd_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta chd_itm_nm_META = createCommonMeta($chd_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta purc_st_dt_fr_META = createCommonMeta($purc_st_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta purc_st_dt_to_META = createCommonMeta($purc_st_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta par_itm_typ_META = createCommonMeta($par_itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta par_itm_typ_d_cd_META = createCommonMeta($par_itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta par_itm_typ_d_nm_META = createCommonMeta($par_itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta par_itm_cd_META = createCommonMeta($par_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta par_itm_sub1_META = createCommonMeta($par_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta par_itm_sub2_META = createCommonMeta($par_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta par_itm_sub3_META = createCommonMeta($par_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta par_itm_nm_META = createCommonMeta($par_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta first_inst_st_dt_fr_META = createCommonMeta($first_inst_st_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta first_inst_st_hm_fr_META = createCommonMeta($first_inst_st_hm_fr, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta first_inst_st_dt_to_META = createCommonMeta($first_inst_st_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta first_inst_st_hm_to_META = createCommonMeta($first_inst_st_hm_to, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta first_act_st_dt_fr_META = createCommonMeta($first_act_st_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta first_act_st_hm_fr_META = createCommonMeta($first_act_st_hm_fr, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta first_act_st_dt_to_META = createCommonMeta($first_act_st_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta first_act_st_hm_to_META = createCommonMeta($first_act_st_hm_to, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta last_act_st_dt_fr_META = createCommonMeta($last_act_st_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta last_act_st_hm_fr_META = createCommonMeta($last_act_st_hm_fr, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta last_act_st_dt_to_META = createCommonMeta($last_act_st_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta last_act_st_hm_to_META = createCommonMeta($last_act_st_hm_to, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.VER_CHG_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.VER_CHG_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.VER_CHG_SUB_CHAR3);
	public static final MCMeta chd_itm_grp_flg1_META = createCommonMeta($chd_itm_grp_flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta chd_itm_grp_cd1_META = createCommonMeta($chd_itm_grp_cd1, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta chd_itm_grp_nm1_META = createCommonMeta($chd_itm_grp_nm1, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta chd_itm_grp_flg2_META = createCommonMeta($chd_itm_grp_flg2, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta chd_itm_grp_cd2_META = createCommonMeta($chd_itm_grp_cd2, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta chd_itm_grp_nm2_META = createCommonMeta($chd_itm_grp_nm2, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta chd_itm_grp_flg3_META = createCommonMeta($chd_itm_grp_flg3, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta chd_itm_grp_cd3_META = createCommonMeta($chd_itm_grp_cd3, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta chd_itm_grp_nm3_META = createCommonMeta($chd_itm_grp_nm3, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta chd_itm_grp_flg4_META = createCommonMeta($chd_itm_grp_flg4, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta chd_itm_grp_cd4_META = createCommonMeta($chd_itm_grp_cd4, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta chd_itm_grp_nm4_META = createCommonMeta($chd_itm_grp_nm4, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta chd_itm_grp_flg5_META = createCommonMeta($chd_itm_grp_flg5, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta chd_itm_grp_cd5_META = createCommonMeta($chd_itm_grp_cd5, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta chd_itm_grp_nm5_META = createCommonMeta($chd_itm_grp_nm5, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta chd_itm_grp_flg6_META = createCommonMeta($chd_itm_grp_flg6, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta chd_itm_grp_cd6_META = createCommonMeta($chd_itm_grp_cd6, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta chd_itm_grp_nm6_META = createCommonMeta($chd_itm_grp_nm6, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta chd_itm_grp_flg7_META = createCommonMeta($chd_itm_grp_flg7, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta chd_itm_grp_cd7_META = createCommonMeta($chd_itm_grp_cd7, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta chd_itm_grp_nm7_META = createCommonMeta($chd_itm_grp_nm7, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta chd_itm_grp_flg8_META = createCommonMeta($chd_itm_grp_flg8, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta chd_itm_grp_cd8_META = createCommonMeta($chd_itm_grp_cd8, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta chd_itm_grp_nm8_META = createCommonMeta($chd_itm_grp_nm8, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta chd_itm_grp_flg9_META = createCommonMeta($chd_itm_grp_flg9, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta chd_itm_grp_cd9_META = createCommonMeta($chd_itm_grp_cd9, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta chd_itm_grp_nm9_META = createCommonMeta($chd_itm_grp_nm9, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta chd_itm_grp_flg10_META = createCommonMeta($chd_itm_grp_flg10, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta chd_itm_grp_cd10_META = createCommonMeta($chd_itm_grp_cd10, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta chd_itm_grp_nm10_META = createCommonMeta($chd_itm_grp_nm10, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta par_itm_grp_flg1_META = createCommonMeta($par_itm_grp_flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta par_itm_grp_cd1_META = createCommonMeta($par_itm_grp_cd1, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta par_itm_grp_nm1_META = createCommonMeta($par_itm_grp_nm1, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta par_itm_grp_flg2_META = createCommonMeta($par_itm_grp_flg2, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta par_itm_grp_cd2_META = createCommonMeta($par_itm_grp_cd2, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta par_itm_grp_nm2_META = createCommonMeta($par_itm_grp_nm2, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta par_itm_grp_flg3_META = createCommonMeta($par_itm_grp_flg3, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta par_itm_grp_cd3_META = createCommonMeta($par_itm_grp_cd3, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta par_itm_grp_nm3_META = createCommonMeta($par_itm_grp_nm3, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta par_itm_grp_flg4_META = createCommonMeta($par_itm_grp_flg4, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta par_itm_grp_cd4_META = createCommonMeta($par_itm_grp_cd4, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta par_itm_grp_nm4_META = createCommonMeta($par_itm_grp_nm4, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta par_itm_grp_flg5_META = createCommonMeta($par_itm_grp_flg5, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta par_itm_grp_cd5_META = createCommonMeta($par_itm_grp_cd5, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta par_itm_grp_nm5_META = createCommonMeta($par_itm_grp_nm5, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta par_itm_grp_flg6_META = createCommonMeta($par_itm_grp_flg6, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta par_itm_grp_cd6_META = createCommonMeta($par_itm_grp_cd6, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta par_itm_grp_nm6_META = createCommonMeta($par_itm_grp_nm6, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta par_itm_grp_flg7_META = createCommonMeta($par_itm_grp_flg7, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta par_itm_grp_cd7_META = createCommonMeta($par_itm_grp_cd7, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta par_itm_grp_nm7_META = createCommonMeta($par_itm_grp_nm7, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta par_itm_grp_flg8_META = createCommonMeta($par_itm_grp_flg8, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta par_itm_grp_cd8_META = createCommonMeta($par_itm_grp_cd8, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta par_itm_grp_nm8_META = createCommonMeta($par_itm_grp_nm8, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta par_itm_grp_flg9_META = createCommonMeta($par_itm_grp_flg9, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta par_itm_grp_cd9_META = createCommonMeta($par_itm_grp_cd9, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta par_itm_grp_nm9_META = createCommonMeta($par_itm_grp_nm9, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta par_itm_grp_flg10_META = createCommonMeta($par_itm_grp_flg10, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta par_itm_grp_cd10_META = createCommonMeta($par_itm_grp_cd10, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta par_itm_grp_nm10_META = createCommonMeta($par_itm_grp_nm10, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);

	protected static final ConstMetaList<Srch01_CndR> constMetas = new ConstMetaList<Srch01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			uncmpl_flg_META,
			cmpl_flg_META,
			w_cmpl_flg_str_META,
			site_cd_META,
			site_nm_META,
			ver_chg_sts_typ_META,
			wg_cd_META,
			wg_nm_META,
			chd_itm_typ_META,
			chd_itm_typ_d_cd_META,
			chd_itm_typ_d_nm_META,
			chd_itm_cd_META,
			chd_itm_sub1_META,
			chd_itm_sub2_META,
			chd_itm_sub3_META,
			chd_itm_nm_META,
			ver_no_META,
			purc_st_dt_fr_META,
			purc_st_dt_to_META,
			par_itm_typ_META,
			par_itm_typ_d_cd_META,
			par_itm_typ_d_nm_META,
			par_itm_cd_META,
			par_itm_sub1_META,
			par_itm_sub2_META,
			par_itm_sub3_META,
			par_itm_nm_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			first_inst_st_dt_fr_META,
			first_inst_st_hm_fr_META,
			first_inst_st_dt_to_META,
			first_inst_st_hm_to_META,
			first_act_st_dt_fr_META,
			first_act_st_hm_fr_META,
			first_act_st_dt_to_META,
			first_act_st_hm_to_META,
			last_act_st_dt_fr_META,
			last_act_st_hm_fr_META,
			last_act_st_dt_to_META,
			last_act_st_hm_to_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			chd_itm_grp_flg1_META,
			chd_itm_grp_cd1_META,
			chd_itm_grp_nm1_META,
			chd_itm_grp_flg2_META,
			chd_itm_grp_cd2_META,
			chd_itm_grp_nm2_META,
			chd_itm_grp_flg3_META,
			chd_itm_grp_cd3_META,
			chd_itm_grp_nm3_META,
			chd_itm_grp_flg4_META,
			chd_itm_grp_cd4_META,
			chd_itm_grp_nm4_META,
			chd_itm_grp_flg5_META,
			chd_itm_grp_cd5_META,
			chd_itm_grp_nm5_META,
			chd_itm_grp_flg6_META,
			chd_itm_grp_cd6_META,
			chd_itm_grp_nm6_META,
			chd_itm_grp_flg7_META,
			chd_itm_grp_cd7_META,
			chd_itm_grp_nm7_META,
			chd_itm_grp_flg8_META,
			chd_itm_grp_cd8_META,
			chd_itm_grp_nm8_META,
			chd_itm_grp_flg9_META,
			chd_itm_grp_cd9_META,
			chd_itm_grp_nm9_META,
			chd_itm_grp_flg10_META,
			chd_itm_grp_cd10_META,
			chd_itm_grp_nm10_META,
			par_itm_grp_flg1_META,
			par_itm_grp_cd1_META,
			par_itm_grp_nm1_META,
			par_itm_grp_flg2_META,
			par_itm_grp_cd2_META,
			par_itm_grp_nm2_META,
			par_itm_grp_flg3_META,
			par_itm_grp_cd3_META,
			par_itm_grp_nm3_META,
			par_itm_grp_flg4_META,
			par_itm_grp_cd4_META,
			par_itm_grp_nm4_META,
			par_itm_grp_flg5_META,
			par_itm_grp_cd5_META,
			par_itm_grp_nm5_META,
			par_itm_grp_flg6_META,
			par_itm_grp_cd6_META,
			par_itm_grp_nm6_META,
			par_itm_grp_flg7_META,
			par_itm_grp_cd7_META,
			par_itm_grp_nm7_META,
			par_itm_grp_flg8_META,
			par_itm_grp_cd8_META,
			par_itm_grp_nm8_META,
			par_itm_grp_flg9_META,
			par_itm_grp_cd9_META,
			par_itm_grp_nm9_META,
			par_itm_grp_flg10_META,
			par_itm_grp_cd10_META,
			par_itm_grp_nm10_META
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
	protected Srch01_CndR_MC_A(ConstMetaList<? extends Srch01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR clone() {
		return (Srch01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR createInstance() {
		return (Srch01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR getValues(String... names) {
		return (Srch01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
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


	/**
	 * Completed (Character string) 完了（文字列）.<p>
	 *
	 */
	public String w_cmpl_flg_str() {
		return getConstString(offset + 2, $w_cmpl_flg_str);
	}

	/**
	 * Completed (Character string) 完了（文字列）.<p>
	 *
	 */
	public void w_cmpl_flg_str(String value) {
		setConstString(offset + 2, $w_cmpl_flg_str, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 3, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 3, $site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 4, $site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 4, $site_nm, value);
	}


	/**
	 * Version change status type 版切替状況区分.<p>
	 *
	 */
	public String ver_chg_sts_typ() {
		return getConstString(offset + 5, $ver_chg_sts_typ);
	}

	/**
	 * Version change status type 版切替状況区分.<p>
	 *
	 */
	public void ver_chg_sts_typ(String value) {
		setConstString(offset + 5, $ver_chg_sts_typ, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 6, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 6, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 7, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 7, $wg_nm, value);
	}


	/**
	 * Child item type 子品目区分.<p>
	 *
	 */
	public String chd_itm_typ() {
		return getConstString(offset + 8, $chd_itm_typ);
	}

	/**
	 * Child item type 子品目区分.<p>
	 *
	 */
	public void chd_itm_typ(String value) {
		setConstString(offset + 8, $chd_itm_typ, value);
	}


	/**
	 * Child item type details cd. 子品目区分詳細ＣＤ.<p>
	 *
	 */
	public String chd_itm_typ_d_cd() {
		return getConstString(offset + 9, $chd_itm_typ_d_cd);
	}

	/**
	 * Child item type details cd. 子品目区分詳細ＣＤ.<p>
	 *
	 */
	public void chd_itm_typ_d_cd(String value) {
		setConstString(offset + 9, $chd_itm_typ_d_cd, value);
	}


	/**
	 * Child item type details name 子品目区分詳細名.<p>
	 *
	 */
	public String chd_itm_typ_d_nm() {
		return getConstString(offset + 10, $chd_itm_typ_d_nm);
	}

	/**
	 * Child item type details name 子品目区分詳細名.<p>
	 *
	 */
	public void chd_itm_typ_d_nm(String value) {
		setConstString(offset + 10, $chd_itm_typ_d_nm, value);
	}


	/**
	 * Child item cd. 子品目ＣＤ.<p>
	 *
	 */
	public String chd_itm_cd() {
		return getConstString(offset + 11, $chd_itm_cd);
	}

	/**
	 * Child item cd. 子品目ＣＤ.<p>
	 *
	 */
	public void chd_itm_cd(String value) {
		setConstString(offset + 11, $chd_itm_cd, value);
	}


	/**
	 * Child branch No. 1 子枝番１.<p>
	 *
	 */
	public String chd_itm_sub1() {
		return getConstString(offset + 12, $chd_itm_sub1);
	}

	/**
	 * Child branch No. 1 子枝番１.<p>
	 *
	 */
	public void chd_itm_sub1(String value) {
		setConstString(offset + 12, $chd_itm_sub1, value);
	}


	/**
	 * Child branch No. 2 子枝番２.<p>
	 *
	 */
	public String chd_itm_sub2() {
		return getConstString(offset + 13, $chd_itm_sub2);
	}

	/**
	 * Child branch No. 2 子枝番２.<p>
	 *
	 */
	public void chd_itm_sub2(String value) {
		setConstString(offset + 13, $chd_itm_sub2, value);
	}


	/**
	 * Child branch No. 3 子枝番３.<p>
	 *
	 */
	public String chd_itm_sub3() {
		return getConstString(offset + 14, $chd_itm_sub3);
	}

	/**
	 * Child branch No. 3 子枝番３.<p>
	 *
	 */
	public void chd_itm_sub3(String value) {
		setConstString(offset + 14, $chd_itm_sub3, value);
	}


	/**
	 * Child item name 子品名.<p>
	 *
	 */
	public String chd_itm_nm() {
		return getConstString(offset + 15, $chd_itm_nm);
	}

	/**
	 * Child item name 子品名.<p>
	 *
	 */
	public void chd_itm_nm(String value) {
		setConstString(offset + 15, $chd_itm_nm, value);
	}


	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 16, $ver_no);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 16, $ver_no, value);
	}


	/**
	 * Purchase application start date FROM 購買適用開始日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate purc_st_dt_fr() {
		return getConstDate(offset + 17, $purc_st_dt_fr);
	}

	/**
	 * Purchase application start date FROM 購買適用開始日ＦＲＯＭ.<p>
	 *
	 */
	public void purc_st_dt_fr(MCDate value) {
		setConstDate(offset + 17, $purc_st_dt_fr, value);
	}


	/**
	 * Purchase application start date TO 購買適用開始日ＴＯ.<p>
	 *
	 */
	public MCDate purc_st_dt_to() {
		return getConstDate(offset + 18, $purc_st_dt_to);
	}

	/**
	 * Purchase application start date TO 購買適用開始日ＴＯ.<p>
	 *
	 */
	public void purc_st_dt_to(MCDate value) {
		setConstDate(offset + 18, $purc_st_dt_to, value);
	}


	/**
	 * Parent item type 親品目区分.<p>
	 *
	 */
	public String par_itm_typ() {
		return getConstString(offset + 19, $par_itm_typ);
	}

	/**
	 * Parent item type 親品目区分.<p>
	 *
	 */
	public void par_itm_typ(String value) {
		setConstString(offset + 19, $par_itm_typ, value);
	}


	/**
	 * Parent item type details cd. 親品目区分詳細ＣＤ.<p>
	 *
	 */
	public String par_itm_typ_d_cd() {
		return getConstString(offset + 20, $par_itm_typ_d_cd);
	}

	/**
	 * Parent item type details cd. 親品目区分詳細ＣＤ.<p>
	 *
	 */
	public void par_itm_typ_d_cd(String value) {
		setConstString(offset + 20, $par_itm_typ_d_cd, value);
	}


	/**
	 * Parent item type details name 親品目区分詳細名.<p>
	 *
	 */
	public String par_itm_typ_d_nm() {
		return getConstString(offset + 21, $par_itm_typ_d_nm);
	}

	/**
	 * Parent item type details name 親品目区分詳細名.<p>
	 *
	 */
	public void par_itm_typ_d_nm(String value) {
		setConstString(offset + 21, $par_itm_typ_d_nm, value);
	}


	/**
	 * Parent item cd. 親品目ＣＤ.<p>
	 *
	 */
	public String par_itm_cd() {
		return getConstString(offset + 22, $par_itm_cd);
	}

	/**
	 * Parent item cd. 親品目ＣＤ.<p>
	 *
	 */
	public void par_itm_cd(String value) {
		setConstString(offset + 22, $par_itm_cd, value);
	}


	/**
	 * Parent branch No. 1 親枝番１.<p>
	 *
	 */
	public String par_itm_sub1() {
		return getConstString(offset + 23, $par_itm_sub1);
	}

	/**
	 * Parent branch No. 1 親枝番１.<p>
	 *
	 */
	public void par_itm_sub1(String value) {
		setConstString(offset + 23, $par_itm_sub1, value);
	}


	/**
	 * Parent branch No. 2 親枝番２.<p>
	 *
	 */
	public String par_itm_sub2() {
		return getConstString(offset + 24, $par_itm_sub2);
	}

	/**
	 * Parent branch No. 2 親枝番２.<p>
	 *
	 */
	public void par_itm_sub2(String value) {
		setConstString(offset + 24, $par_itm_sub2, value);
	}


	/**
	 * Parent branch No. 3 親枝番３.<p>
	 *
	 */
	public String par_itm_sub3() {
		return getConstString(offset + 25, $par_itm_sub3);
	}

	/**
	 * Parent branch No. 3 親枝番３.<p>
	 *
	 */
	public void par_itm_sub3(String value) {
		setConstString(offset + 25, $par_itm_sub3, value);
	}


	/**
	 * Parent item name 親品名.<p>
	 *
	 */
	public String par_itm_nm() {
		return getConstString(offset + 26, $par_itm_nm);
	}

	/**
	 * Parent item name 親品名.<p>
	 *
	 */
	public void par_itm_nm(String value) {
		setConstString(offset + 26, $par_itm_nm, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 27, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 27, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 28, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 28, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 29, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 29, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 30, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 30, $sno4, value);
	}


	/**
	 * Application start date (Order) FROM 適用開始日（指図）ＦＲＯＭ.<p>
	 *
	 */
	public MCDate first_inst_st_dt_fr() {
		return getConstDate(offset + 31, $first_inst_st_dt_fr);
	}

	/**
	 * Application start date (Order) FROM 適用開始日（指図）ＦＲＯＭ.<p>
	 *
	 */
	public void first_inst_st_dt_fr(MCDate value) {
		setConstDate(offset + 31, $first_inst_st_dt_fr, value);
	}


	/**
	 * Application start time (Order) FROM 適用開始時（指図）ＦＲＯＭ.<p>
	 *
	 */
	public MCDate first_inst_st_hm_fr() {
		return getConstDate(offset + 32, $first_inst_st_hm_fr);
	}

	/**
	 * Application start time (Order) FROM 適用開始時（指図）ＦＲＯＭ.<p>
	 *
	 */
	public void first_inst_st_hm_fr(MCDate value) {
		setConstDate(offset + 32, $first_inst_st_hm_fr, value);
	}


	/**
	 * Application start date (Order) TO 適用開始日（指図）ＴＯ.<p>
	 *
	 */
	public MCDate first_inst_st_dt_to() {
		return getConstDate(offset + 33, $first_inst_st_dt_to);
	}

	/**
	 * Application start date (Order) TO 適用開始日（指図）ＴＯ.<p>
	 *
	 */
	public void first_inst_st_dt_to(MCDate value) {
		setConstDate(offset + 33, $first_inst_st_dt_to, value);
	}


	/**
	 * Application start time (Order) TO 適用開始時（指図）ＴＯ.<p>
	 *
	 */
	public MCDate first_inst_st_hm_to() {
		return getConstDate(offset + 34, $first_inst_st_hm_to);
	}

	/**
	 * Application start time (Order) TO 適用開始時（指図）ＴＯ.<p>
	 *
	 */
	public void first_inst_st_hm_to(MCDate value) {
		setConstDate(offset + 34, $first_inst_st_hm_to, value);
	}


	/**
	 * Application start date (Result) FROM 適用開始日（実績）ＦＲＯＭ.<p>
	 *
	 */
	public MCDate first_act_st_dt_fr() {
		return getConstDate(offset + 35, $first_act_st_dt_fr);
	}

	/**
	 * Application start date (Result) FROM 適用開始日（実績）ＦＲＯＭ.<p>
	 *
	 */
	public void first_act_st_dt_fr(MCDate value) {
		setConstDate(offset + 35, $first_act_st_dt_fr, value);
	}


	/**
	 * Application start time (Result) FROM 適用開始時（実績）ＦＲＯＭ.<p>
	 *
	 */
	public MCDate first_act_st_hm_fr() {
		return getConstDate(offset + 36, $first_act_st_hm_fr);
	}

	/**
	 * Application start time (Result) FROM 適用開始時（実績）ＦＲＯＭ.<p>
	 *
	 */
	public void first_act_st_hm_fr(MCDate value) {
		setConstDate(offset + 36, $first_act_st_hm_fr, value);
	}


	/**
	 * Application start date (Result) TO 適用開始日（実績）ＴＯ.<p>
	 *
	 */
	public MCDate first_act_st_dt_to() {
		return getConstDate(offset + 37, $first_act_st_dt_to);
	}

	/**
	 * Application start date (Result) TO 適用開始日（実績）ＴＯ.<p>
	 *
	 */
	public void first_act_st_dt_to(MCDate value) {
		setConstDate(offset + 37, $first_act_st_dt_to, value);
	}


	/**
	 * Application start time (Result) TO 適用開始時（実績）ＴＯ.<p>
	 *
	 */
	public MCDate first_act_st_hm_to() {
		return getConstDate(offset + 38, $first_act_st_hm_to);
	}

	/**
	 * Application start time (Result) TO 適用開始時（実績）ＴＯ.<p>
	 *
	 */
	public void first_act_st_hm_to(MCDate value) {
		setConstDate(offset + 38, $first_act_st_hm_to, value);
	}


	/**
	 * Last start date FROM 最終着手日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate last_act_st_dt_fr() {
		return getConstDate(offset + 39, $last_act_st_dt_fr);
	}

	/**
	 * Last start date FROM 最終着手日ＦＲＯＭ.<p>
	 *
	 */
	public void last_act_st_dt_fr(MCDate value) {
		setConstDate(offset + 39, $last_act_st_dt_fr, value);
	}


	/**
	 * Last start time FROM 最終着手時ＦＲＯＭ.<p>
	 *
	 */
	public MCDate last_act_st_hm_fr() {
		return getConstDate(offset + 40, $last_act_st_hm_fr);
	}

	/**
	 * Last start time FROM 最終着手時ＦＲＯＭ.<p>
	 *
	 */
	public void last_act_st_hm_fr(MCDate value) {
		setConstDate(offset + 40, $last_act_st_hm_fr, value);
	}


	/**
	 * Last start date TO 最終着手日ＴＯ.<p>
	 *
	 */
	public MCDate last_act_st_dt_to() {
		return getConstDate(offset + 41, $last_act_st_dt_to);
	}

	/**
	 * Last start date TO 最終着手日ＴＯ.<p>
	 *
	 */
	public void last_act_st_dt_to(MCDate value) {
		setConstDate(offset + 41, $last_act_st_dt_to, value);
	}


	/**
	 * Last start time TO 最終着手時ＴＯ.<p>
	 *
	 */
	public MCDate last_act_st_hm_to() {
		return getConstDate(offset + 42, $last_act_st_hm_to);
	}

	/**
	 * Last start time TO 最終着手時ＴＯ.<p>
	 *
	 */
	public void last_act_st_hm_to(MCDate value) {
		setConstDate(offset + 42, $last_act_st_hm_to, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 43, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 43, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 44, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 44, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 45, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 45, $sub_char3, value);
	}


	/**
	 * Child item classification 1 子品目分類１.<p>
	 *
	 */
	public boolean chd_itm_grp_flg1() {
		return getConstBoolean(offset + 46, $chd_itm_grp_flg1);
	}

	/**
	 * Child item classification 1 子品目分類１.<p>
	 *
	 */
	public void chd_itm_grp_flg1(boolean value) {
		setConstBoolean(offset + 46, $chd_itm_grp_flg1, value);
	}


	/**
	 * Child item classification cd. 1 子品目分類ＣＤ１.<p>
	 *
	 */
	public String chd_itm_grp_cd1() {
		return getConstString(offset + 47, $chd_itm_grp_cd1);
	}

	/**
	 * Child item classification cd. 1 子品目分類ＣＤ１.<p>
	 *
	 */
	public void chd_itm_grp_cd1(String value) {
		setConstString(offset + 47, $chd_itm_grp_cd1, value);
	}


	/**
	 * Child item classification name 1 子品目分類名１.<p>
	 *
	 */
	public String chd_itm_grp_nm1() {
		return getConstString(offset + 48, $chd_itm_grp_nm1);
	}

	/**
	 * Child item classification name 1 子品目分類名１.<p>
	 *
	 */
	public void chd_itm_grp_nm1(String value) {
		setConstString(offset + 48, $chd_itm_grp_nm1, value);
	}


	/**
	 * Child item classification 2 子品目分類２.<p>
	 *
	 */
	public boolean chd_itm_grp_flg2() {
		return getConstBoolean(offset + 49, $chd_itm_grp_flg2);
	}

	/**
	 * Child item classification 2 子品目分類２.<p>
	 *
	 */
	public void chd_itm_grp_flg2(boolean value) {
		setConstBoolean(offset + 49, $chd_itm_grp_flg2, value);
	}


	/**
	 * Child item classification cd. 2 子品目分類ＣＤ２.<p>
	 *
	 */
	public String chd_itm_grp_cd2() {
		return getConstString(offset + 50, $chd_itm_grp_cd2);
	}

	/**
	 * Child item classification cd. 2 子品目分類ＣＤ２.<p>
	 *
	 */
	public void chd_itm_grp_cd2(String value) {
		setConstString(offset + 50, $chd_itm_grp_cd2, value);
	}


	/**
	 * Child item classification name 2 子品目分類名２.<p>
	 *
	 */
	public String chd_itm_grp_nm2() {
		return getConstString(offset + 51, $chd_itm_grp_nm2);
	}

	/**
	 * Child item classification name 2 子品目分類名２.<p>
	 *
	 */
	public void chd_itm_grp_nm2(String value) {
		setConstString(offset + 51, $chd_itm_grp_nm2, value);
	}


	/**
	 * Child item classification 3 子品目分類３.<p>
	 *
	 */
	public boolean chd_itm_grp_flg3() {
		return getConstBoolean(offset + 52, $chd_itm_grp_flg3);
	}

	/**
	 * Child item classification 3 子品目分類３.<p>
	 *
	 */
	public void chd_itm_grp_flg3(boolean value) {
		setConstBoolean(offset + 52, $chd_itm_grp_flg3, value);
	}


	/**
	 * Child item classification cd. 3 子品目分類ＣＤ３.<p>
	 *
	 */
	public String chd_itm_grp_cd3() {
		return getConstString(offset + 53, $chd_itm_grp_cd3);
	}

	/**
	 * Child item classification cd. 3 子品目分類ＣＤ３.<p>
	 *
	 */
	public void chd_itm_grp_cd3(String value) {
		setConstString(offset + 53, $chd_itm_grp_cd3, value);
	}


	/**
	 * Child item classification name 3 子品目分類名３.<p>
	 *
	 */
	public String chd_itm_grp_nm3() {
		return getConstString(offset + 54, $chd_itm_grp_nm3);
	}

	/**
	 * Child item classification name 3 子品目分類名３.<p>
	 *
	 */
	public void chd_itm_grp_nm3(String value) {
		setConstString(offset + 54, $chd_itm_grp_nm3, value);
	}


	/**
	 * Child item classification 4 子品目分類４.<p>
	 *
	 */
	public boolean chd_itm_grp_flg4() {
		return getConstBoolean(offset + 55, $chd_itm_grp_flg4);
	}

	/**
	 * Child item classification 4 子品目分類４.<p>
	 *
	 */
	public void chd_itm_grp_flg4(boolean value) {
		setConstBoolean(offset + 55, $chd_itm_grp_flg4, value);
	}


	/**
	 * Child item classification cd. 4 子品目分類ＣＤ４.<p>
	 *
	 */
	public String chd_itm_grp_cd4() {
		return getConstString(offset + 56, $chd_itm_grp_cd4);
	}

	/**
	 * Child item classification cd. 4 子品目分類ＣＤ４.<p>
	 *
	 */
	public void chd_itm_grp_cd4(String value) {
		setConstString(offset + 56, $chd_itm_grp_cd4, value);
	}


	/**
	 * Child item classification name 4 子品目分類名４.<p>
	 *
	 */
	public String chd_itm_grp_nm4() {
		return getConstString(offset + 57, $chd_itm_grp_nm4);
	}

	/**
	 * Child item classification name 4 子品目分類名４.<p>
	 *
	 */
	public void chd_itm_grp_nm4(String value) {
		setConstString(offset + 57, $chd_itm_grp_nm4, value);
	}


	/**
	 * Child item classification 5 子品目分類５.<p>
	 *
	 */
	public boolean chd_itm_grp_flg5() {
		return getConstBoolean(offset + 58, $chd_itm_grp_flg5);
	}

	/**
	 * Child item classification 5 子品目分類５.<p>
	 *
	 */
	public void chd_itm_grp_flg5(boolean value) {
		setConstBoolean(offset + 58, $chd_itm_grp_flg5, value);
	}


	/**
	 * Child item classification cd. 5 子品目分類ＣＤ５.<p>
	 *
	 */
	public String chd_itm_grp_cd5() {
		return getConstString(offset + 59, $chd_itm_grp_cd5);
	}

	/**
	 * Child item classification cd. 5 子品目分類ＣＤ５.<p>
	 *
	 */
	public void chd_itm_grp_cd5(String value) {
		setConstString(offset + 59, $chd_itm_grp_cd5, value);
	}


	/**
	 * Child item classification name 5 子品目分類名５.<p>
	 *
	 */
	public String chd_itm_grp_nm5() {
		return getConstString(offset + 60, $chd_itm_grp_nm5);
	}

	/**
	 * Child item classification name 5 子品目分類名５.<p>
	 *
	 */
	public void chd_itm_grp_nm5(String value) {
		setConstString(offset + 60, $chd_itm_grp_nm5, value);
	}


	/**
	 * Child item classification 6 子品目分類６.<p>
	 *
	 */
	public boolean chd_itm_grp_flg6() {
		return getConstBoolean(offset + 61, $chd_itm_grp_flg6);
	}

	/**
	 * Child item classification 6 子品目分類６.<p>
	 *
	 */
	public void chd_itm_grp_flg6(boolean value) {
		setConstBoolean(offset + 61, $chd_itm_grp_flg6, value);
	}


	/**
	 * Child item classification cd. 6 子品目分類ＣＤ６.<p>
	 *
	 */
	public String chd_itm_grp_cd6() {
		return getConstString(offset + 62, $chd_itm_grp_cd6);
	}

	/**
	 * Child item classification cd. 6 子品目分類ＣＤ６.<p>
	 *
	 */
	public void chd_itm_grp_cd6(String value) {
		setConstString(offset + 62, $chd_itm_grp_cd6, value);
	}


	/**
	 * Child item classification name 6 子品目分類名６.<p>
	 *
	 */
	public String chd_itm_grp_nm6() {
		return getConstString(offset + 63, $chd_itm_grp_nm6);
	}

	/**
	 * Child item classification name 6 子品目分類名６.<p>
	 *
	 */
	public void chd_itm_grp_nm6(String value) {
		setConstString(offset + 63, $chd_itm_grp_nm6, value);
	}


	/**
	 * Child item classification 7 子品目分類７.<p>
	 *
	 */
	public boolean chd_itm_grp_flg7() {
		return getConstBoolean(offset + 64, $chd_itm_grp_flg7);
	}

	/**
	 * Child item classification 7 子品目分類７.<p>
	 *
	 */
	public void chd_itm_grp_flg7(boolean value) {
		setConstBoolean(offset + 64, $chd_itm_grp_flg7, value);
	}


	/**
	 * Child item classification cd. 7 子品目分類ＣＤ７.<p>
	 *
	 */
	public String chd_itm_grp_cd7() {
		return getConstString(offset + 65, $chd_itm_grp_cd7);
	}

	/**
	 * Child item classification cd. 7 子品目分類ＣＤ７.<p>
	 *
	 */
	public void chd_itm_grp_cd7(String value) {
		setConstString(offset + 65, $chd_itm_grp_cd7, value);
	}


	/**
	 * Child item classification name 7 子品目分類名７.<p>
	 *
	 */
	public String chd_itm_grp_nm7() {
		return getConstString(offset + 66, $chd_itm_grp_nm7);
	}

	/**
	 * Child item classification name 7 子品目分類名７.<p>
	 *
	 */
	public void chd_itm_grp_nm7(String value) {
		setConstString(offset + 66, $chd_itm_grp_nm7, value);
	}


	/**
	 * Child item classification 8 子品目分類８.<p>
	 *
	 */
	public boolean chd_itm_grp_flg8() {
		return getConstBoolean(offset + 67, $chd_itm_grp_flg8);
	}

	/**
	 * Child item classification 8 子品目分類８.<p>
	 *
	 */
	public void chd_itm_grp_flg8(boolean value) {
		setConstBoolean(offset + 67, $chd_itm_grp_flg8, value);
	}


	/**
	 * Child item classification cd. 8 子品目分類ＣＤ８.<p>
	 *
	 */
	public String chd_itm_grp_cd8() {
		return getConstString(offset + 68, $chd_itm_grp_cd8);
	}

	/**
	 * Child item classification cd. 8 子品目分類ＣＤ８.<p>
	 *
	 */
	public void chd_itm_grp_cd8(String value) {
		setConstString(offset + 68, $chd_itm_grp_cd8, value);
	}


	/**
	 * Child item classification name 8 子品目分類名８.<p>
	 *
	 */
	public String chd_itm_grp_nm8() {
		return getConstString(offset + 69, $chd_itm_grp_nm8);
	}

	/**
	 * Child item classification name 8 子品目分類名８.<p>
	 *
	 */
	public void chd_itm_grp_nm8(String value) {
		setConstString(offset + 69, $chd_itm_grp_nm8, value);
	}


	/**
	 * Child item classification 9 子品目分類９.<p>
	 *
	 */
	public boolean chd_itm_grp_flg9() {
		return getConstBoolean(offset + 70, $chd_itm_grp_flg9);
	}

	/**
	 * Child item classification 9 子品目分類９.<p>
	 *
	 */
	public void chd_itm_grp_flg9(boolean value) {
		setConstBoolean(offset + 70, $chd_itm_grp_flg9, value);
	}


	/**
	 * Child item classification cd. 9 子品目分類ＣＤ９.<p>
	 *
	 */
	public String chd_itm_grp_cd9() {
		return getConstString(offset + 71, $chd_itm_grp_cd9);
	}

	/**
	 * Child item classification cd. 9 子品目分類ＣＤ９.<p>
	 *
	 */
	public void chd_itm_grp_cd9(String value) {
		setConstString(offset + 71, $chd_itm_grp_cd9, value);
	}


	/**
	 * Child item classification name 9 子品目分類名９.<p>
	 *
	 */
	public String chd_itm_grp_nm9() {
		return getConstString(offset + 72, $chd_itm_grp_nm9);
	}

	/**
	 * Child item classification name 9 子品目分類名９.<p>
	 *
	 */
	public void chd_itm_grp_nm9(String value) {
		setConstString(offset + 72, $chd_itm_grp_nm9, value);
	}


	/**
	 * Child item classification 10 子品目分類１０.<p>
	 *
	 */
	public boolean chd_itm_grp_flg10() {
		return getConstBoolean(offset + 73, $chd_itm_grp_flg10);
	}

	/**
	 * Child item classification 10 子品目分類１０.<p>
	 *
	 */
	public void chd_itm_grp_flg10(boolean value) {
		setConstBoolean(offset + 73, $chd_itm_grp_flg10, value);
	}


	/**
	 * Child item classification cd. 10 子品目分類ＣＤ１０.<p>
	 *
	 */
	public String chd_itm_grp_cd10() {
		return getConstString(offset + 74, $chd_itm_grp_cd10);
	}

	/**
	 * Child item classification cd. 10 子品目分類ＣＤ１０.<p>
	 *
	 */
	public void chd_itm_grp_cd10(String value) {
		setConstString(offset + 74, $chd_itm_grp_cd10, value);
	}


	/**
	 * Child item classification name 10 子品目分類名１０.<p>
	 *
	 */
	public String chd_itm_grp_nm10() {
		return getConstString(offset + 75, $chd_itm_grp_nm10);
	}

	/**
	 * Child item classification name 10 子品目分類名１０.<p>
	 *
	 */
	public void chd_itm_grp_nm10(String value) {
		setConstString(offset + 75, $chd_itm_grp_nm10, value);
	}


	/**
	 * Parent item classification 1 親品目分類１.<p>
	 *
	 */
	public boolean par_itm_grp_flg1() {
		return getConstBoolean(offset + 76, $par_itm_grp_flg1);
	}

	/**
	 * Parent item classification 1 親品目分類１.<p>
	 *
	 */
	public void par_itm_grp_flg1(boolean value) {
		setConstBoolean(offset + 76, $par_itm_grp_flg1, value);
	}


	/**
	 * Parent item classification cd. 1 親品目分類ＣＤ１.<p>
	 *
	 */
	public String par_itm_grp_cd1() {
		return getConstString(offset + 77, $par_itm_grp_cd1);
	}

	/**
	 * Parent item classification cd. 1 親品目分類ＣＤ１.<p>
	 *
	 */
	public void par_itm_grp_cd1(String value) {
		setConstString(offset + 77, $par_itm_grp_cd1, value);
	}


	/**
	 * Parent item classification name 1 親品目分類名１.<p>
	 *
	 */
	public String par_itm_grp_nm1() {
		return getConstString(offset + 78, $par_itm_grp_nm1);
	}

	/**
	 * Parent item classification name 1 親品目分類名１.<p>
	 *
	 */
	public void par_itm_grp_nm1(String value) {
		setConstString(offset + 78, $par_itm_grp_nm1, value);
	}


	/**
	 * Parent item classification 2 親品目分類２.<p>
	 *
	 */
	public boolean par_itm_grp_flg2() {
		return getConstBoolean(offset + 79, $par_itm_grp_flg2);
	}

	/**
	 * Parent item classification 2 親品目分類２.<p>
	 *
	 */
	public void par_itm_grp_flg2(boolean value) {
		setConstBoolean(offset + 79, $par_itm_grp_flg2, value);
	}


	/**
	 * Parent item classification cd. 2 親品目分類ＣＤ２.<p>
	 *
	 */
	public String par_itm_grp_cd2() {
		return getConstString(offset + 80, $par_itm_grp_cd2);
	}

	/**
	 * Parent item classification cd. 2 親品目分類ＣＤ２.<p>
	 *
	 */
	public void par_itm_grp_cd2(String value) {
		setConstString(offset + 80, $par_itm_grp_cd2, value);
	}


	/**
	 * Parent item classification name 2 親品目分類名２.<p>
	 *
	 */
	public String par_itm_grp_nm2() {
		return getConstString(offset + 81, $par_itm_grp_nm2);
	}

	/**
	 * Parent item classification name 2 親品目分類名２.<p>
	 *
	 */
	public void par_itm_grp_nm2(String value) {
		setConstString(offset + 81, $par_itm_grp_nm2, value);
	}


	/**
	 * Parent item classification 3 親品目分類３.<p>
	 *
	 */
	public boolean par_itm_grp_flg3() {
		return getConstBoolean(offset + 82, $par_itm_grp_flg3);
	}

	/**
	 * Parent item classification 3 親品目分類３.<p>
	 *
	 */
	public void par_itm_grp_flg3(boolean value) {
		setConstBoolean(offset + 82, $par_itm_grp_flg3, value);
	}


	/**
	 * Parent item classification cd. 3 親品目分類ＣＤ３.<p>
	 *
	 */
	public String par_itm_grp_cd3() {
		return getConstString(offset + 83, $par_itm_grp_cd3);
	}

	/**
	 * Parent item classification cd. 3 親品目分類ＣＤ３.<p>
	 *
	 */
	public void par_itm_grp_cd3(String value) {
		setConstString(offset + 83, $par_itm_grp_cd3, value);
	}


	/**
	 * Parent item classification name 3 親品目分類名３.<p>
	 *
	 */
	public String par_itm_grp_nm3() {
		return getConstString(offset + 84, $par_itm_grp_nm3);
	}

	/**
	 * Parent item classification name 3 親品目分類名３.<p>
	 *
	 */
	public void par_itm_grp_nm3(String value) {
		setConstString(offset + 84, $par_itm_grp_nm3, value);
	}


	/**
	 * Parent item classification 4 親品目分類４.<p>
	 *
	 */
	public boolean par_itm_grp_flg4() {
		return getConstBoolean(offset + 85, $par_itm_grp_flg4);
	}

	/**
	 * Parent item classification 4 親品目分類４.<p>
	 *
	 */
	public void par_itm_grp_flg4(boolean value) {
		setConstBoolean(offset + 85, $par_itm_grp_flg4, value);
	}


	/**
	 * Parent item classification cd. 4 親品目分類ＣＤ４.<p>
	 *
	 */
	public String par_itm_grp_cd4() {
		return getConstString(offset + 86, $par_itm_grp_cd4);
	}

	/**
	 * Parent item classification cd. 4 親品目分類ＣＤ４.<p>
	 *
	 */
	public void par_itm_grp_cd4(String value) {
		setConstString(offset + 86, $par_itm_grp_cd4, value);
	}


	/**
	 * Parent item classification name 4 親品目分類名４.<p>
	 *
	 */
	public String par_itm_grp_nm4() {
		return getConstString(offset + 87, $par_itm_grp_nm4);
	}

	/**
	 * Parent item classification name 4 親品目分類名４.<p>
	 *
	 */
	public void par_itm_grp_nm4(String value) {
		setConstString(offset + 87, $par_itm_grp_nm4, value);
	}


	/**
	 * Parent item classification 5 親品目分類５.<p>
	 *
	 */
	public boolean par_itm_grp_flg5() {
		return getConstBoolean(offset + 88, $par_itm_grp_flg5);
	}

	/**
	 * Parent item classification 5 親品目分類５.<p>
	 *
	 */
	public void par_itm_grp_flg5(boolean value) {
		setConstBoolean(offset + 88, $par_itm_grp_flg5, value);
	}


	/**
	 * Parent item classification cd. 5 親品目分類ＣＤ５.<p>
	 *
	 */
	public String par_itm_grp_cd5() {
		return getConstString(offset + 89, $par_itm_grp_cd5);
	}

	/**
	 * Parent item classification cd. 5 親品目分類ＣＤ５.<p>
	 *
	 */
	public void par_itm_grp_cd5(String value) {
		setConstString(offset + 89, $par_itm_grp_cd5, value);
	}


	/**
	 * Parent item classification name 5 親品目分類名５.<p>
	 *
	 */
	public String par_itm_grp_nm5() {
		return getConstString(offset + 90, $par_itm_grp_nm5);
	}

	/**
	 * Parent item classification name 5 親品目分類名５.<p>
	 *
	 */
	public void par_itm_grp_nm5(String value) {
		setConstString(offset + 90, $par_itm_grp_nm5, value);
	}


	/**
	 * Parent item classification 6 親品目分類６.<p>
	 *
	 */
	public boolean par_itm_grp_flg6() {
		return getConstBoolean(offset + 91, $par_itm_grp_flg6);
	}

	/**
	 * Parent item classification 6 親品目分類６.<p>
	 *
	 */
	public void par_itm_grp_flg6(boolean value) {
		setConstBoolean(offset + 91, $par_itm_grp_flg6, value);
	}


	/**
	 * Parent item classification cd. 6 親品目分類ＣＤ６.<p>
	 *
	 */
	public String par_itm_grp_cd6() {
		return getConstString(offset + 92, $par_itm_grp_cd6);
	}

	/**
	 * Parent item classification cd. 6 親品目分類ＣＤ６.<p>
	 *
	 */
	public void par_itm_grp_cd6(String value) {
		setConstString(offset + 92, $par_itm_grp_cd6, value);
	}


	/**
	 * Parent item classification name 6 親品目分類名６.<p>
	 *
	 */
	public String par_itm_grp_nm6() {
		return getConstString(offset + 93, $par_itm_grp_nm6);
	}

	/**
	 * Parent item classification name 6 親品目分類名６.<p>
	 *
	 */
	public void par_itm_grp_nm6(String value) {
		setConstString(offset + 93, $par_itm_grp_nm6, value);
	}


	/**
	 * Parent item classification 7 親品目分類７.<p>
	 *
	 */
	public boolean par_itm_grp_flg7() {
		return getConstBoolean(offset + 94, $par_itm_grp_flg7);
	}

	/**
	 * Parent item classification 7 親品目分類７.<p>
	 *
	 */
	public void par_itm_grp_flg7(boolean value) {
		setConstBoolean(offset + 94, $par_itm_grp_flg7, value);
	}


	/**
	 * Parent item classification cd. 7 親品目分類ＣＤ７.<p>
	 *
	 */
	public String par_itm_grp_cd7() {
		return getConstString(offset + 95, $par_itm_grp_cd7);
	}

	/**
	 * Parent item classification cd. 7 親品目分類ＣＤ７.<p>
	 *
	 */
	public void par_itm_grp_cd7(String value) {
		setConstString(offset + 95, $par_itm_grp_cd7, value);
	}


	/**
	 * Parent item classification name 7 親品目分類名７.<p>
	 *
	 */
	public String par_itm_grp_nm7() {
		return getConstString(offset + 96, $par_itm_grp_nm7);
	}

	/**
	 * Parent item classification name 7 親品目分類名７.<p>
	 *
	 */
	public void par_itm_grp_nm7(String value) {
		setConstString(offset + 96, $par_itm_grp_nm7, value);
	}


	/**
	 * Parent item classification 8 親品目分類８.<p>
	 *
	 */
	public boolean par_itm_grp_flg8() {
		return getConstBoolean(offset + 97, $par_itm_grp_flg8);
	}

	/**
	 * Parent item classification 8 親品目分類８.<p>
	 *
	 */
	public void par_itm_grp_flg8(boolean value) {
		setConstBoolean(offset + 97, $par_itm_grp_flg8, value);
	}


	/**
	 * Parent item classification cd. 8 親品目分類ＣＤ８.<p>
	 *
	 */
	public String par_itm_grp_cd8() {
		return getConstString(offset + 98, $par_itm_grp_cd8);
	}

	/**
	 * Parent item classification cd. 8 親品目分類ＣＤ８.<p>
	 *
	 */
	public void par_itm_grp_cd8(String value) {
		setConstString(offset + 98, $par_itm_grp_cd8, value);
	}


	/**
	 * Parent item classification name 8 親品目分類名８.<p>
	 *
	 */
	public String par_itm_grp_nm8() {
		return getConstString(offset + 99, $par_itm_grp_nm8);
	}

	/**
	 * Parent item classification name 8 親品目分類名８.<p>
	 *
	 */
	public void par_itm_grp_nm8(String value) {
		setConstString(offset + 99, $par_itm_grp_nm8, value);
	}


	/**
	 * Parent item classification 9 親品目分類９.<p>
	 *
	 */
	public boolean par_itm_grp_flg9() {
		return getConstBoolean(offset + 100, $par_itm_grp_flg9);
	}

	/**
	 * Parent item classification 9 親品目分類９.<p>
	 *
	 */
	public void par_itm_grp_flg9(boolean value) {
		setConstBoolean(offset + 100, $par_itm_grp_flg9, value);
	}


	/**
	 * Parent item classification cd. 9 親品目分類ＣＤ９.<p>
	 *
	 */
	public String par_itm_grp_cd9() {
		return getConstString(offset + 101, $par_itm_grp_cd9);
	}

	/**
	 * Parent item classification cd. 9 親品目分類ＣＤ９.<p>
	 *
	 */
	public void par_itm_grp_cd9(String value) {
		setConstString(offset + 101, $par_itm_grp_cd9, value);
	}


	/**
	 * Parent item classification name 9 親品目分類名９.<p>
	 *
	 */
	public String par_itm_grp_nm9() {
		return getConstString(offset + 102, $par_itm_grp_nm9);
	}

	/**
	 * Parent item classification name 9 親品目分類名９.<p>
	 *
	 */
	public void par_itm_grp_nm9(String value) {
		setConstString(offset + 102, $par_itm_grp_nm9, value);
	}


	/**
	 * Parent item classification 10 親品目分類１０.<p>
	 *
	 */
	public boolean par_itm_grp_flg10() {
		return getConstBoolean(offset + 103, $par_itm_grp_flg10);
	}

	/**
	 * Parent item classification 10 親品目分類１０.<p>
	 *
	 */
	public void par_itm_grp_flg10(boolean value) {
		setConstBoolean(offset + 103, $par_itm_grp_flg10, value);
	}


	/**
	 * Parent item classification cd. 10 親品目分類ＣＤ１０.<p>
	 *
	 */
	public String par_itm_grp_cd10() {
		return getConstString(offset + 104, $par_itm_grp_cd10);
	}

	/**
	 * Parent item classification cd. 10 親品目分類ＣＤ１０.<p>
	 *
	 */
	public void par_itm_grp_cd10(String value) {
		setConstString(offset + 104, $par_itm_grp_cd10, value);
	}


	/**
	 * Parent item classification name 10 親品目分類名１０.<p>
	 *
	 */
	public String par_itm_grp_nm10() {
		return getConstString(offset + 105, $par_itm_grp_nm10);
	}

	/**
	 * Parent item classification name 10 親品目分類名１０.<p>
	 *
	 */
	public void par_itm_grp_nm10(String value) {
		setConstString(offset + 105, $par_itm_grp_nm10, value);
	}


	public String getString(String name) {
		if ($w_cmpl_flg_str.equalsIgnoreCase(name)) {
			return w_cmpl_flg_str();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($ver_chg_sts_typ.equalsIgnoreCase(name)) {
			return ver_chg_sts_typ();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($chd_itm_typ.equalsIgnoreCase(name)) {
			return chd_itm_typ();
		}
		if ($chd_itm_typ_d_cd.equalsIgnoreCase(name)) {
			return chd_itm_typ_d_cd();
		}
		if ($chd_itm_typ_d_nm.equalsIgnoreCase(name)) {
			return chd_itm_typ_d_nm();
		}
		if ($chd_itm_cd.equalsIgnoreCase(name)) {
			return chd_itm_cd();
		}
		if ($chd_itm_sub1.equalsIgnoreCase(name)) {
			return chd_itm_sub1();
		}
		if ($chd_itm_sub2.equalsIgnoreCase(name)) {
			return chd_itm_sub2();
		}
		if ($chd_itm_sub3.equalsIgnoreCase(name)) {
			return chd_itm_sub3();
		}
		if ($chd_itm_nm.equalsIgnoreCase(name)) {
			return chd_itm_nm();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($par_itm_typ.equalsIgnoreCase(name)) {
			return par_itm_typ();
		}
		if ($par_itm_typ_d_cd.equalsIgnoreCase(name)) {
			return par_itm_typ_d_cd();
		}
		if ($par_itm_typ_d_nm.equalsIgnoreCase(name)) {
			return par_itm_typ_d_nm();
		}
		if ($par_itm_cd.equalsIgnoreCase(name)) {
			return par_itm_cd();
		}
		if ($par_itm_sub1.equalsIgnoreCase(name)) {
			return par_itm_sub1();
		}
		if ($par_itm_sub2.equalsIgnoreCase(name)) {
			return par_itm_sub2();
		}
		if ($par_itm_sub3.equalsIgnoreCase(name)) {
			return par_itm_sub3();
		}
		if ($par_itm_nm.equalsIgnoreCase(name)) {
			return par_itm_nm();
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
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		if ($chd_itm_grp_cd1.equalsIgnoreCase(name)) {
			return chd_itm_grp_cd1();
		}
		if ($chd_itm_grp_nm1.equalsIgnoreCase(name)) {
			return chd_itm_grp_nm1();
		}
		if ($chd_itm_grp_cd2.equalsIgnoreCase(name)) {
			return chd_itm_grp_cd2();
		}
		if ($chd_itm_grp_nm2.equalsIgnoreCase(name)) {
			return chd_itm_grp_nm2();
		}
		if ($chd_itm_grp_cd3.equalsIgnoreCase(name)) {
			return chd_itm_grp_cd3();
		}
		if ($chd_itm_grp_nm3.equalsIgnoreCase(name)) {
			return chd_itm_grp_nm3();
		}
		if ($chd_itm_grp_cd4.equalsIgnoreCase(name)) {
			return chd_itm_grp_cd4();
		}
		if ($chd_itm_grp_nm4.equalsIgnoreCase(name)) {
			return chd_itm_grp_nm4();
		}
		if ($chd_itm_grp_cd5.equalsIgnoreCase(name)) {
			return chd_itm_grp_cd5();
		}
		if ($chd_itm_grp_nm5.equalsIgnoreCase(name)) {
			return chd_itm_grp_nm5();
		}
		if ($chd_itm_grp_cd6.equalsIgnoreCase(name)) {
			return chd_itm_grp_cd6();
		}
		if ($chd_itm_grp_nm6.equalsIgnoreCase(name)) {
			return chd_itm_grp_nm6();
		}
		if ($chd_itm_grp_cd7.equalsIgnoreCase(name)) {
			return chd_itm_grp_cd7();
		}
		if ($chd_itm_grp_nm7.equalsIgnoreCase(name)) {
			return chd_itm_grp_nm7();
		}
		if ($chd_itm_grp_cd8.equalsIgnoreCase(name)) {
			return chd_itm_grp_cd8();
		}
		if ($chd_itm_grp_nm8.equalsIgnoreCase(name)) {
			return chd_itm_grp_nm8();
		}
		if ($chd_itm_grp_cd9.equalsIgnoreCase(name)) {
			return chd_itm_grp_cd9();
		}
		if ($chd_itm_grp_nm9.equalsIgnoreCase(name)) {
			return chd_itm_grp_nm9();
		}
		if ($chd_itm_grp_cd10.equalsIgnoreCase(name)) {
			return chd_itm_grp_cd10();
		}
		if ($chd_itm_grp_nm10.equalsIgnoreCase(name)) {
			return chd_itm_grp_nm10();
		}
		if ($par_itm_grp_cd1.equalsIgnoreCase(name)) {
			return par_itm_grp_cd1();
		}
		if ($par_itm_grp_nm1.equalsIgnoreCase(name)) {
			return par_itm_grp_nm1();
		}
		if ($par_itm_grp_cd2.equalsIgnoreCase(name)) {
			return par_itm_grp_cd2();
		}
		if ($par_itm_grp_nm2.equalsIgnoreCase(name)) {
			return par_itm_grp_nm2();
		}
		if ($par_itm_grp_cd3.equalsIgnoreCase(name)) {
			return par_itm_grp_cd3();
		}
		if ($par_itm_grp_nm3.equalsIgnoreCase(name)) {
			return par_itm_grp_nm3();
		}
		if ($par_itm_grp_cd4.equalsIgnoreCase(name)) {
			return par_itm_grp_cd4();
		}
		if ($par_itm_grp_nm4.equalsIgnoreCase(name)) {
			return par_itm_grp_nm4();
		}
		if ($par_itm_grp_cd5.equalsIgnoreCase(name)) {
			return par_itm_grp_cd5();
		}
		if ($par_itm_grp_nm5.equalsIgnoreCase(name)) {
			return par_itm_grp_nm5();
		}
		if ($par_itm_grp_cd6.equalsIgnoreCase(name)) {
			return par_itm_grp_cd6();
		}
		if ($par_itm_grp_nm6.equalsIgnoreCase(name)) {
			return par_itm_grp_nm6();
		}
		if ($par_itm_grp_cd7.equalsIgnoreCase(name)) {
			return par_itm_grp_cd7();
		}
		if ($par_itm_grp_nm7.equalsIgnoreCase(name)) {
			return par_itm_grp_nm7();
		}
		if ($par_itm_grp_cd8.equalsIgnoreCase(name)) {
			return par_itm_grp_cd8();
		}
		if ($par_itm_grp_nm8.equalsIgnoreCase(name)) {
			return par_itm_grp_nm8();
		}
		if ($par_itm_grp_cd9.equalsIgnoreCase(name)) {
			return par_itm_grp_cd9();
		}
		if ($par_itm_grp_nm9.equalsIgnoreCase(name)) {
			return par_itm_grp_nm9();
		}
		if ($par_itm_grp_cd10.equalsIgnoreCase(name)) {
			return par_itm_grp_cd10();
		}
		if ($par_itm_grp_nm10.equalsIgnoreCase(name)) {
			return par_itm_grp_nm10();
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
		if ($first_inst_st_dt_fr.equalsIgnoreCase(name)) {
			return first_inst_st_dt_fr();
		}
		if ($first_inst_st_hm_fr.equalsIgnoreCase(name)) {
			return first_inst_st_hm_fr();
		}
		if ($first_inst_st_dt_to.equalsIgnoreCase(name)) {
			return first_inst_st_dt_to();
		}
		if ($first_inst_st_hm_to.equalsIgnoreCase(name)) {
			return first_inst_st_hm_to();
		}
		if ($first_act_st_dt_fr.equalsIgnoreCase(name)) {
			return first_act_st_dt_fr();
		}
		if ($first_act_st_hm_fr.equalsIgnoreCase(name)) {
			return first_act_st_hm_fr();
		}
		if ($first_act_st_dt_to.equalsIgnoreCase(name)) {
			return first_act_st_dt_to();
		}
		if ($first_act_st_hm_to.equalsIgnoreCase(name)) {
			return first_act_st_hm_to();
		}
		if ($last_act_st_dt_fr.equalsIgnoreCase(name)) {
			return last_act_st_dt_fr();
		}
		if ($last_act_st_hm_fr.equalsIgnoreCase(name)) {
			return last_act_st_hm_fr();
		}
		if ($last_act_st_dt_to.equalsIgnoreCase(name)) {
			return last_act_st_dt_to();
		}
		if ($last_act_st_hm_to.equalsIgnoreCase(name)) {
			return last_act_st_hm_to();
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
		if ($chd_itm_grp_flg1.equalsIgnoreCase(name)) {
			return chd_itm_grp_flg1();
		}
		if ($chd_itm_grp_flg2.equalsIgnoreCase(name)) {
			return chd_itm_grp_flg2();
		}
		if ($chd_itm_grp_flg3.equalsIgnoreCase(name)) {
			return chd_itm_grp_flg3();
		}
		if ($chd_itm_grp_flg4.equalsIgnoreCase(name)) {
			return chd_itm_grp_flg4();
		}
		if ($chd_itm_grp_flg5.equalsIgnoreCase(name)) {
			return chd_itm_grp_flg5();
		}
		if ($chd_itm_grp_flg6.equalsIgnoreCase(name)) {
			return chd_itm_grp_flg6();
		}
		if ($chd_itm_grp_flg7.equalsIgnoreCase(name)) {
			return chd_itm_grp_flg7();
		}
		if ($chd_itm_grp_flg8.equalsIgnoreCase(name)) {
			return chd_itm_grp_flg8();
		}
		if ($chd_itm_grp_flg9.equalsIgnoreCase(name)) {
			return chd_itm_grp_flg9();
		}
		if ($chd_itm_grp_flg10.equalsIgnoreCase(name)) {
			return chd_itm_grp_flg10();
		}
		if ($par_itm_grp_flg1.equalsIgnoreCase(name)) {
			return par_itm_grp_flg1();
		}
		if ($par_itm_grp_flg2.equalsIgnoreCase(name)) {
			return par_itm_grp_flg2();
		}
		if ($par_itm_grp_flg3.equalsIgnoreCase(name)) {
			return par_itm_grp_flg3();
		}
		if ($par_itm_grp_flg4.equalsIgnoreCase(name)) {
			return par_itm_grp_flg4();
		}
		if ($par_itm_grp_flg5.equalsIgnoreCase(name)) {
			return par_itm_grp_flg5();
		}
		if ($par_itm_grp_flg6.equalsIgnoreCase(name)) {
			return par_itm_grp_flg6();
		}
		if ($par_itm_grp_flg7.equalsIgnoreCase(name)) {
			return par_itm_grp_flg7();
		}
		if ($par_itm_grp_flg8.equalsIgnoreCase(name)) {
			return par_itm_grp_flg8();
		}
		if ($par_itm_grp_flg9.equalsIgnoreCase(name)) {
			return par_itm_grp_flg9();
		}
		if ($par_itm_grp_flg10.equalsIgnoreCase(name)) {
			return par_itm_grp_flg10();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($w_cmpl_flg_str.equalsIgnoreCase(name)) {
			return w_cmpl_flg_str();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($ver_chg_sts_typ.equalsIgnoreCase(name)) {
			return ver_chg_sts_typ();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($chd_itm_typ.equalsIgnoreCase(name)) {
			return chd_itm_typ();
		}
		if ($chd_itm_typ_d_cd.equalsIgnoreCase(name)) {
			return chd_itm_typ_d_cd();
		}
		if ($chd_itm_typ_d_nm.equalsIgnoreCase(name)) {
			return chd_itm_typ_d_nm();
		}
		if ($chd_itm_cd.equalsIgnoreCase(name)) {
			return chd_itm_cd();
		}
		if ($chd_itm_sub1.equalsIgnoreCase(name)) {
			return chd_itm_sub1();
		}
		if ($chd_itm_sub2.equalsIgnoreCase(name)) {
			return chd_itm_sub2();
		}
		if ($chd_itm_sub3.equalsIgnoreCase(name)) {
			return chd_itm_sub3();
		}
		if ($chd_itm_nm.equalsIgnoreCase(name)) {
			return chd_itm_nm();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($par_itm_typ.equalsIgnoreCase(name)) {
			return par_itm_typ();
		}
		if ($par_itm_typ_d_cd.equalsIgnoreCase(name)) {
			return par_itm_typ_d_cd();
		}
		if ($par_itm_typ_d_nm.equalsIgnoreCase(name)) {
			return par_itm_typ_d_nm();
		}
		if ($par_itm_cd.equalsIgnoreCase(name)) {
			return par_itm_cd();
		}
		if ($par_itm_sub1.equalsIgnoreCase(name)) {
			return par_itm_sub1();
		}
		if ($par_itm_sub2.equalsIgnoreCase(name)) {
			return par_itm_sub2();
		}
		if ($par_itm_sub3.equalsIgnoreCase(name)) {
			return par_itm_sub3();
		}
		if ($par_itm_nm.equalsIgnoreCase(name)) {
			return par_itm_nm();
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
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		if ($chd_itm_grp_cd1.equalsIgnoreCase(name)) {
			return chd_itm_grp_cd1();
		}
		if ($chd_itm_grp_nm1.equalsIgnoreCase(name)) {
			return chd_itm_grp_nm1();
		}
		if ($chd_itm_grp_cd2.equalsIgnoreCase(name)) {
			return chd_itm_grp_cd2();
		}
		if ($chd_itm_grp_nm2.equalsIgnoreCase(name)) {
			return chd_itm_grp_nm2();
		}
		if ($chd_itm_grp_cd3.equalsIgnoreCase(name)) {
			return chd_itm_grp_cd3();
		}
		if ($chd_itm_grp_nm3.equalsIgnoreCase(name)) {
			return chd_itm_grp_nm3();
		}
		if ($chd_itm_grp_cd4.equalsIgnoreCase(name)) {
			return chd_itm_grp_cd4();
		}
		if ($chd_itm_grp_nm4.equalsIgnoreCase(name)) {
			return chd_itm_grp_nm4();
		}
		if ($chd_itm_grp_cd5.equalsIgnoreCase(name)) {
			return chd_itm_grp_cd5();
		}
		if ($chd_itm_grp_nm5.equalsIgnoreCase(name)) {
			return chd_itm_grp_nm5();
		}
		if ($chd_itm_grp_cd6.equalsIgnoreCase(name)) {
			return chd_itm_grp_cd6();
		}
		if ($chd_itm_grp_nm6.equalsIgnoreCase(name)) {
			return chd_itm_grp_nm6();
		}
		if ($chd_itm_grp_cd7.equalsIgnoreCase(name)) {
			return chd_itm_grp_cd7();
		}
		if ($chd_itm_grp_nm7.equalsIgnoreCase(name)) {
			return chd_itm_grp_nm7();
		}
		if ($chd_itm_grp_cd8.equalsIgnoreCase(name)) {
			return chd_itm_grp_cd8();
		}
		if ($chd_itm_grp_nm8.equalsIgnoreCase(name)) {
			return chd_itm_grp_nm8();
		}
		if ($chd_itm_grp_cd9.equalsIgnoreCase(name)) {
			return chd_itm_grp_cd9();
		}
		if ($chd_itm_grp_nm9.equalsIgnoreCase(name)) {
			return chd_itm_grp_nm9();
		}
		if ($chd_itm_grp_cd10.equalsIgnoreCase(name)) {
			return chd_itm_grp_cd10();
		}
		if ($chd_itm_grp_nm10.equalsIgnoreCase(name)) {
			return chd_itm_grp_nm10();
		}
		if ($par_itm_grp_cd1.equalsIgnoreCase(name)) {
			return par_itm_grp_cd1();
		}
		if ($par_itm_grp_nm1.equalsIgnoreCase(name)) {
			return par_itm_grp_nm1();
		}
		if ($par_itm_grp_cd2.equalsIgnoreCase(name)) {
			return par_itm_grp_cd2();
		}
		if ($par_itm_grp_nm2.equalsIgnoreCase(name)) {
			return par_itm_grp_nm2();
		}
		if ($par_itm_grp_cd3.equalsIgnoreCase(name)) {
			return par_itm_grp_cd3();
		}
		if ($par_itm_grp_nm3.equalsIgnoreCase(name)) {
			return par_itm_grp_nm3();
		}
		if ($par_itm_grp_cd4.equalsIgnoreCase(name)) {
			return par_itm_grp_cd4();
		}
		if ($par_itm_grp_nm4.equalsIgnoreCase(name)) {
			return par_itm_grp_nm4();
		}
		if ($par_itm_grp_cd5.equalsIgnoreCase(name)) {
			return par_itm_grp_cd5();
		}
		if ($par_itm_grp_nm5.equalsIgnoreCase(name)) {
			return par_itm_grp_nm5();
		}
		if ($par_itm_grp_cd6.equalsIgnoreCase(name)) {
			return par_itm_grp_cd6();
		}
		if ($par_itm_grp_nm6.equalsIgnoreCase(name)) {
			return par_itm_grp_nm6();
		}
		if ($par_itm_grp_cd7.equalsIgnoreCase(name)) {
			return par_itm_grp_cd7();
		}
		if ($par_itm_grp_nm7.equalsIgnoreCase(name)) {
			return par_itm_grp_nm7();
		}
		if ($par_itm_grp_cd8.equalsIgnoreCase(name)) {
			return par_itm_grp_cd8();
		}
		if ($par_itm_grp_nm8.equalsIgnoreCase(name)) {
			return par_itm_grp_nm8();
		}
		if ($par_itm_grp_cd9.equalsIgnoreCase(name)) {
			return par_itm_grp_cd9();
		}
		if ($par_itm_grp_nm9.equalsIgnoreCase(name)) {
			return par_itm_grp_nm9();
		}
		if ($par_itm_grp_cd10.equalsIgnoreCase(name)) {
			return par_itm_grp_cd10();
		}
		if ($par_itm_grp_nm10.equalsIgnoreCase(name)) {
			return par_itm_grp_nm10();
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
		if ($first_inst_st_dt_fr.equalsIgnoreCase(name)) {
			return first_inst_st_dt_fr();
		}
		if ($first_inst_st_hm_fr.equalsIgnoreCase(name)) {
			return first_inst_st_hm_fr();
		}
		if ($first_inst_st_dt_to.equalsIgnoreCase(name)) {
			return first_inst_st_dt_to();
		}
		if ($first_inst_st_hm_to.equalsIgnoreCase(name)) {
			return first_inst_st_hm_to();
		}
		if ($first_act_st_dt_fr.equalsIgnoreCase(name)) {
			return first_act_st_dt_fr();
		}
		if ($first_act_st_hm_fr.equalsIgnoreCase(name)) {
			return first_act_st_hm_fr();
		}
		if ($first_act_st_dt_to.equalsIgnoreCase(name)) {
			return first_act_st_dt_to();
		}
		if ($first_act_st_hm_to.equalsIgnoreCase(name)) {
			return first_act_st_hm_to();
		}
		if ($last_act_st_dt_fr.equalsIgnoreCase(name)) {
			return last_act_st_dt_fr();
		}
		if ($last_act_st_hm_fr.equalsIgnoreCase(name)) {
			return last_act_st_hm_fr();
		}
		if ($last_act_st_dt_to.equalsIgnoreCase(name)) {
			return last_act_st_dt_to();
		}
		if ($last_act_st_hm_to.equalsIgnoreCase(name)) {
			return last_act_st_hm_to();
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
		if ($chd_itm_grp_flg1.equalsIgnoreCase(name)) {
			return chd_itm_grp_flg1();
		}
		if ($chd_itm_grp_flg2.equalsIgnoreCase(name)) {
			return chd_itm_grp_flg2();
		}
		if ($chd_itm_grp_flg3.equalsIgnoreCase(name)) {
			return chd_itm_grp_flg3();
		}
		if ($chd_itm_grp_flg4.equalsIgnoreCase(name)) {
			return chd_itm_grp_flg4();
		}
		if ($chd_itm_grp_flg5.equalsIgnoreCase(name)) {
			return chd_itm_grp_flg5();
		}
		if ($chd_itm_grp_flg6.equalsIgnoreCase(name)) {
			return chd_itm_grp_flg6();
		}
		if ($chd_itm_grp_flg7.equalsIgnoreCase(name)) {
			return chd_itm_grp_flg7();
		}
		if ($chd_itm_grp_flg8.equalsIgnoreCase(name)) {
			return chd_itm_grp_flg8();
		}
		if ($chd_itm_grp_flg9.equalsIgnoreCase(name)) {
			return chd_itm_grp_flg9();
		}
		if ($chd_itm_grp_flg10.equalsIgnoreCase(name)) {
			return chd_itm_grp_flg10();
		}
		if ($par_itm_grp_flg1.equalsIgnoreCase(name)) {
			return par_itm_grp_flg1();
		}
		if ($par_itm_grp_flg2.equalsIgnoreCase(name)) {
			return par_itm_grp_flg2();
		}
		if ($par_itm_grp_flg3.equalsIgnoreCase(name)) {
			return par_itm_grp_flg3();
		}
		if ($par_itm_grp_flg4.equalsIgnoreCase(name)) {
			return par_itm_grp_flg4();
		}
		if ($par_itm_grp_flg5.equalsIgnoreCase(name)) {
			return par_itm_grp_flg5();
		}
		if ($par_itm_grp_flg6.equalsIgnoreCase(name)) {
			return par_itm_grp_flg6();
		}
		if ($par_itm_grp_flg7.equalsIgnoreCase(name)) {
			return par_itm_grp_flg7();
		}
		if ($par_itm_grp_flg8.equalsIgnoreCase(name)) {
			return par_itm_grp_flg8();
		}
		if ($par_itm_grp_flg9.equalsIgnoreCase(name)) {
			return par_itm_grp_flg9();
		}
		if ($par_itm_grp_flg10.equalsIgnoreCase(name)) {
			return par_itm_grp_flg10();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($w_cmpl_flg_str.equalsIgnoreCase(name)) {
			w_cmpl_flg_str(value);
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
		if ($ver_chg_sts_typ.equalsIgnoreCase(name)) {
			ver_chg_sts_typ(value);
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
		if ($chd_itm_typ.equalsIgnoreCase(name)) {
			chd_itm_typ(value);
			return;
		}
		if ($chd_itm_typ_d_cd.equalsIgnoreCase(name)) {
			chd_itm_typ_d_cd(value);
			return;
		}
		if ($chd_itm_typ_d_nm.equalsIgnoreCase(name)) {
			chd_itm_typ_d_nm(value);
			return;
		}
		if ($chd_itm_cd.equalsIgnoreCase(name)) {
			chd_itm_cd(value);
			return;
		}
		if ($chd_itm_sub1.equalsIgnoreCase(name)) {
			chd_itm_sub1(value);
			return;
		}
		if ($chd_itm_sub2.equalsIgnoreCase(name)) {
			chd_itm_sub2(value);
			return;
		}
		if ($chd_itm_sub3.equalsIgnoreCase(name)) {
			chd_itm_sub3(value);
			return;
		}
		if ($chd_itm_nm.equalsIgnoreCase(name)) {
			chd_itm_nm(value);
			return;
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($par_itm_typ.equalsIgnoreCase(name)) {
			par_itm_typ(value);
			return;
		}
		if ($par_itm_typ_d_cd.equalsIgnoreCase(name)) {
			par_itm_typ_d_cd(value);
			return;
		}
		if ($par_itm_typ_d_nm.equalsIgnoreCase(name)) {
			par_itm_typ_d_nm(value);
			return;
		}
		if ($par_itm_cd.equalsIgnoreCase(name)) {
			par_itm_cd(value);
			return;
		}
		if ($par_itm_sub1.equalsIgnoreCase(name)) {
			par_itm_sub1(value);
			return;
		}
		if ($par_itm_sub2.equalsIgnoreCase(name)) {
			par_itm_sub2(value);
			return;
		}
		if ($par_itm_sub3.equalsIgnoreCase(name)) {
			par_itm_sub3(value);
			return;
		}
		if ($par_itm_nm.equalsIgnoreCase(name)) {
			par_itm_nm(value);
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
		if ($chd_itm_grp_cd1.equalsIgnoreCase(name)) {
			chd_itm_grp_cd1(value);
			return;
		}
		if ($chd_itm_grp_nm1.equalsIgnoreCase(name)) {
			chd_itm_grp_nm1(value);
			return;
		}
		if ($chd_itm_grp_cd2.equalsIgnoreCase(name)) {
			chd_itm_grp_cd2(value);
			return;
		}
		if ($chd_itm_grp_nm2.equalsIgnoreCase(name)) {
			chd_itm_grp_nm2(value);
			return;
		}
		if ($chd_itm_grp_cd3.equalsIgnoreCase(name)) {
			chd_itm_grp_cd3(value);
			return;
		}
		if ($chd_itm_grp_nm3.equalsIgnoreCase(name)) {
			chd_itm_grp_nm3(value);
			return;
		}
		if ($chd_itm_grp_cd4.equalsIgnoreCase(name)) {
			chd_itm_grp_cd4(value);
			return;
		}
		if ($chd_itm_grp_nm4.equalsIgnoreCase(name)) {
			chd_itm_grp_nm4(value);
			return;
		}
		if ($chd_itm_grp_cd5.equalsIgnoreCase(name)) {
			chd_itm_grp_cd5(value);
			return;
		}
		if ($chd_itm_grp_nm5.equalsIgnoreCase(name)) {
			chd_itm_grp_nm5(value);
			return;
		}
		if ($chd_itm_grp_cd6.equalsIgnoreCase(name)) {
			chd_itm_grp_cd6(value);
			return;
		}
		if ($chd_itm_grp_nm6.equalsIgnoreCase(name)) {
			chd_itm_grp_nm6(value);
			return;
		}
		if ($chd_itm_grp_cd7.equalsIgnoreCase(name)) {
			chd_itm_grp_cd7(value);
			return;
		}
		if ($chd_itm_grp_nm7.equalsIgnoreCase(name)) {
			chd_itm_grp_nm7(value);
			return;
		}
		if ($chd_itm_grp_cd8.equalsIgnoreCase(name)) {
			chd_itm_grp_cd8(value);
			return;
		}
		if ($chd_itm_grp_nm8.equalsIgnoreCase(name)) {
			chd_itm_grp_nm8(value);
			return;
		}
		if ($chd_itm_grp_cd9.equalsIgnoreCase(name)) {
			chd_itm_grp_cd9(value);
			return;
		}
		if ($chd_itm_grp_nm9.equalsIgnoreCase(name)) {
			chd_itm_grp_nm9(value);
			return;
		}
		if ($chd_itm_grp_cd10.equalsIgnoreCase(name)) {
			chd_itm_grp_cd10(value);
			return;
		}
		if ($chd_itm_grp_nm10.equalsIgnoreCase(name)) {
			chd_itm_grp_nm10(value);
			return;
		}
		if ($par_itm_grp_cd1.equalsIgnoreCase(name)) {
			par_itm_grp_cd1(value);
			return;
		}
		if ($par_itm_grp_nm1.equalsIgnoreCase(name)) {
			par_itm_grp_nm1(value);
			return;
		}
		if ($par_itm_grp_cd2.equalsIgnoreCase(name)) {
			par_itm_grp_cd2(value);
			return;
		}
		if ($par_itm_grp_nm2.equalsIgnoreCase(name)) {
			par_itm_grp_nm2(value);
			return;
		}
		if ($par_itm_grp_cd3.equalsIgnoreCase(name)) {
			par_itm_grp_cd3(value);
			return;
		}
		if ($par_itm_grp_nm3.equalsIgnoreCase(name)) {
			par_itm_grp_nm3(value);
			return;
		}
		if ($par_itm_grp_cd4.equalsIgnoreCase(name)) {
			par_itm_grp_cd4(value);
			return;
		}
		if ($par_itm_grp_nm4.equalsIgnoreCase(name)) {
			par_itm_grp_nm4(value);
			return;
		}
		if ($par_itm_grp_cd5.equalsIgnoreCase(name)) {
			par_itm_grp_cd5(value);
			return;
		}
		if ($par_itm_grp_nm5.equalsIgnoreCase(name)) {
			par_itm_grp_nm5(value);
			return;
		}
		if ($par_itm_grp_cd6.equalsIgnoreCase(name)) {
			par_itm_grp_cd6(value);
			return;
		}
		if ($par_itm_grp_nm6.equalsIgnoreCase(name)) {
			par_itm_grp_nm6(value);
			return;
		}
		if ($par_itm_grp_cd7.equalsIgnoreCase(name)) {
			par_itm_grp_cd7(value);
			return;
		}
		if ($par_itm_grp_nm7.equalsIgnoreCase(name)) {
			par_itm_grp_nm7(value);
			return;
		}
		if ($par_itm_grp_cd8.equalsIgnoreCase(name)) {
			par_itm_grp_cd8(value);
			return;
		}
		if ($par_itm_grp_nm8.equalsIgnoreCase(name)) {
			par_itm_grp_nm8(value);
			return;
		}
		if ($par_itm_grp_cd9.equalsIgnoreCase(name)) {
			par_itm_grp_cd9(value);
			return;
		}
		if ($par_itm_grp_nm9.equalsIgnoreCase(name)) {
			par_itm_grp_nm9(value);
			return;
		}
		if ($par_itm_grp_cd10.equalsIgnoreCase(name)) {
			par_itm_grp_cd10(value);
			return;
		}
		if ($par_itm_grp_nm10.equalsIgnoreCase(name)) {
			par_itm_grp_nm10(value);
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
		if ($first_inst_st_dt_fr.equalsIgnoreCase(name)) {
			first_inst_st_dt_fr(value);
			return;
		}
		if ($first_inst_st_hm_fr.equalsIgnoreCase(name)) {
			first_inst_st_hm_fr(value);
			return;
		}
		if ($first_inst_st_dt_to.equalsIgnoreCase(name)) {
			first_inst_st_dt_to(value);
			return;
		}
		if ($first_inst_st_hm_to.equalsIgnoreCase(name)) {
			first_inst_st_hm_to(value);
			return;
		}
		if ($first_act_st_dt_fr.equalsIgnoreCase(name)) {
			first_act_st_dt_fr(value);
			return;
		}
		if ($first_act_st_hm_fr.equalsIgnoreCase(name)) {
			first_act_st_hm_fr(value);
			return;
		}
		if ($first_act_st_dt_to.equalsIgnoreCase(name)) {
			first_act_st_dt_to(value);
			return;
		}
		if ($first_act_st_hm_to.equalsIgnoreCase(name)) {
			first_act_st_hm_to(value);
			return;
		}
		if ($last_act_st_dt_fr.equalsIgnoreCase(name)) {
			last_act_st_dt_fr(value);
			return;
		}
		if ($last_act_st_hm_fr.equalsIgnoreCase(name)) {
			last_act_st_hm_fr(value);
			return;
		}
		if ($last_act_st_dt_to.equalsIgnoreCase(name)) {
			last_act_st_dt_to(value);
			return;
		}
		if ($last_act_st_hm_to.equalsIgnoreCase(name)) {
			last_act_st_hm_to(value);
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
		if ($chd_itm_grp_flg1.equalsIgnoreCase(name)) {
			chd_itm_grp_flg1(value);
			return;
		}
		if ($chd_itm_grp_flg2.equalsIgnoreCase(name)) {
			chd_itm_grp_flg2(value);
			return;
		}
		if ($chd_itm_grp_flg3.equalsIgnoreCase(name)) {
			chd_itm_grp_flg3(value);
			return;
		}
		if ($chd_itm_grp_flg4.equalsIgnoreCase(name)) {
			chd_itm_grp_flg4(value);
			return;
		}
		if ($chd_itm_grp_flg5.equalsIgnoreCase(name)) {
			chd_itm_grp_flg5(value);
			return;
		}
		if ($chd_itm_grp_flg6.equalsIgnoreCase(name)) {
			chd_itm_grp_flg6(value);
			return;
		}
		if ($chd_itm_grp_flg7.equalsIgnoreCase(name)) {
			chd_itm_grp_flg7(value);
			return;
		}
		if ($chd_itm_grp_flg8.equalsIgnoreCase(name)) {
			chd_itm_grp_flg8(value);
			return;
		}
		if ($chd_itm_grp_flg9.equalsIgnoreCase(name)) {
			chd_itm_grp_flg9(value);
			return;
		}
		if ($chd_itm_grp_flg10.equalsIgnoreCase(name)) {
			chd_itm_grp_flg10(value);
			return;
		}
		if ($par_itm_grp_flg1.equalsIgnoreCase(name)) {
			par_itm_grp_flg1(value);
			return;
		}
		if ($par_itm_grp_flg2.equalsIgnoreCase(name)) {
			par_itm_grp_flg2(value);
			return;
		}
		if ($par_itm_grp_flg3.equalsIgnoreCase(name)) {
			par_itm_grp_flg3(value);
			return;
		}
		if ($par_itm_grp_flg4.equalsIgnoreCase(name)) {
			par_itm_grp_flg4(value);
			return;
		}
		if ($par_itm_grp_flg5.equalsIgnoreCase(name)) {
			par_itm_grp_flg5(value);
			return;
		}
		if ($par_itm_grp_flg6.equalsIgnoreCase(name)) {
			par_itm_grp_flg6(value);
			return;
		}
		if ($par_itm_grp_flg7.equalsIgnoreCase(name)) {
			par_itm_grp_flg7(value);
			return;
		}
		if ($par_itm_grp_flg8.equalsIgnoreCase(name)) {
			par_itm_grp_flg8(value);
			return;
		}
		if ($par_itm_grp_flg9.equalsIgnoreCase(name)) {
			par_itm_grp_flg9(value);
			return;
		}
		if ($par_itm_grp_flg10.equalsIgnoreCase(name)) {
			par_itm_grp_flg10(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($w_cmpl_flg_str.equalsIgnoreCase(name)) {
			w_cmpl_flg_str(value);
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
		if ($ver_chg_sts_typ.equalsIgnoreCase(name)) {
			ver_chg_sts_typ(value);
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
		if ($chd_itm_typ.equalsIgnoreCase(name)) {
			chd_itm_typ(value);
			return;
		}
		if ($chd_itm_typ_d_cd.equalsIgnoreCase(name)) {
			chd_itm_typ_d_cd(value);
			return;
		}
		if ($chd_itm_typ_d_nm.equalsIgnoreCase(name)) {
			chd_itm_typ_d_nm(value);
			return;
		}
		if ($chd_itm_cd.equalsIgnoreCase(name)) {
			chd_itm_cd(value);
			return;
		}
		if ($chd_itm_sub1.equalsIgnoreCase(name)) {
			chd_itm_sub1(value);
			return;
		}
		if ($chd_itm_sub2.equalsIgnoreCase(name)) {
			chd_itm_sub2(value);
			return;
		}
		if ($chd_itm_sub3.equalsIgnoreCase(name)) {
			chd_itm_sub3(value);
			return;
		}
		if ($chd_itm_nm.equalsIgnoreCase(name)) {
			chd_itm_nm(value);
			return;
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($par_itm_typ.equalsIgnoreCase(name)) {
			par_itm_typ(value);
			return;
		}
		if ($par_itm_typ_d_cd.equalsIgnoreCase(name)) {
			par_itm_typ_d_cd(value);
			return;
		}
		if ($par_itm_typ_d_nm.equalsIgnoreCase(name)) {
			par_itm_typ_d_nm(value);
			return;
		}
		if ($par_itm_cd.equalsIgnoreCase(name)) {
			par_itm_cd(value);
			return;
		}
		if ($par_itm_sub1.equalsIgnoreCase(name)) {
			par_itm_sub1(value);
			return;
		}
		if ($par_itm_sub2.equalsIgnoreCase(name)) {
			par_itm_sub2(value);
			return;
		}
		if ($par_itm_sub3.equalsIgnoreCase(name)) {
			par_itm_sub3(value);
			return;
		}
		if ($par_itm_nm.equalsIgnoreCase(name)) {
			par_itm_nm(value);
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
		if ($chd_itm_grp_cd1.equalsIgnoreCase(name)) {
			chd_itm_grp_cd1(value);
			return;
		}
		if ($chd_itm_grp_nm1.equalsIgnoreCase(name)) {
			chd_itm_grp_nm1(value);
			return;
		}
		if ($chd_itm_grp_cd2.equalsIgnoreCase(name)) {
			chd_itm_grp_cd2(value);
			return;
		}
		if ($chd_itm_grp_nm2.equalsIgnoreCase(name)) {
			chd_itm_grp_nm2(value);
			return;
		}
		if ($chd_itm_grp_cd3.equalsIgnoreCase(name)) {
			chd_itm_grp_cd3(value);
			return;
		}
		if ($chd_itm_grp_nm3.equalsIgnoreCase(name)) {
			chd_itm_grp_nm3(value);
			return;
		}
		if ($chd_itm_grp_cd4.equalsIgnoreCase(name)) {
			chd_itm_grp_cd4(value);
			return;
		}
		if ($chd_itm_grp_nm4.equalsIgnoreCase(name)) {
			chd_itm_grp_nm4(value);
			return;
		}
		if ($chd_itm_grp_cd5.equalsIgnoreCase(name)) {
			chd_itm_grp_cd5(value);
			return;
		}
		if ($chd_itm_grp_nm5.equalsIgnoreCase(name)) {
			chd_itm_grp_nm5(value);
			return;
		}
		if ($chd_itm_grp_cd6.equalsIgnoreCase(name)) {
			chd_itm_grp_cd6(value);
			return;
		}
		if ($chd_itm_grp_nm6.equalsIgnoreCase(name)) {
			chd_itm_grp_nm6(value);
			return;
		}
		if ($chd_itm_grp_cd7.equalsIgnoreCase(name)) {
			chd_itm_grp_cd7(value);
			return;
		}
		if ($chd_itm_grp_nm7.equalsIgnoreCase(name)) {
			chd_itm_grp_nm7(value);
			return;
		}
		if ($chd_itm_grp_cd8.equalsIgnoreCase(name)) {
			chd_itm_grp_cd8(value);
			return;
		}
		if ($chd_itm_grp_nm8.equalsIgnoreCase(name)) {
			chd_itm_grp_nm8(value);
			return;
		}
		if ($chd_itm_grp_cd9.equalsIgnoreCase(name)) {
			chd_itm_grp_cd9(value);
			return;
		}
		if ($chd_itm_grp_nm9.equalsIgnoreCase(name)) {
			chd_itm_grp_nm9(value);
			return;
		}
		if ($chd_itm_grp_cd10.equalsIgnoreCase(name)) {
			chd_itm_grp_cd10(value);
			return;
		}
		if ($chd_itm_grp_nm10.equalsIgnoreCase(name)) {
			chd_itm_grp_nm10(value);
			return;
		}
		if ($par_itm_grp_cd1.equalsIgnoreCase(name)) {
			par_itm_grp_cd1(value);
			return;
		}
		if ($par_itm_grp_nm1.equalsIgnoreCase(name)) {
			par_itm_grp_nm1(value);
			return;
		}
		if ($par_itm_grp_cd2.equalsIgnoreCase(name)) {
			par_itm_grp_cd2(value);
			return;
		}
		if ($par_itm_grp_nm2.equalsIgnoreCase(name)) {
			par_itm_grp_nm2(value);
			return;
		}
		if ($par_itm_grp_cd3.equalsIgnoreCase(name)) {
			par_itm_grp_cd3(value);
			return;
		}
		if ($par_itm_grp_nm3.equalsIgnoreCase(name)) {
			par_itm_grp_nm3(value);
			return;
		}
		if ($par_itm_grp_cd4.equalsIgnoreCase(name)) {
			par_itm_grp_cd4(value);
			return;
		}
		if ($par_itm_grp_nm4.equalsIgnoreCase(name)) {
			par_itm_grp_nm4(value);
			return;
		}
		if ($par_itm_grp_cd5.equalsIgnoreCase(name)) {
			par_itm_grp_cd5(value);
			return;
		}
		if ($par_itm_grp_nm5.equalsIgnoreCase(name)) {
			par_itm_grp_nm5(value);
			return;
		}
		if ($par_itm_grp_cd6.equalsIgnoreCase(name)) {
			par_itm_grp_cd6(value);
			return;
		}
		if ($par_itm_grp_nm6.equalsIgnoreCase(name)) {
			par_itm_grp_nm6(value);
			return;
		}
		if ($par_itm_grp_cd7.equalsIgnoreCase(name)) {
			par_itm_grp_cd7(value);
			return;
		}
		if ($par_itm_grp_nm7.equalsIgnoreCase(name)) {
			par_itm_grp_nm7(value);
			return;
		}
		if ($par_itm_grp_cd8.equalsIgnoreCase(name)) {
			par_itm_grp_cd8(value);
			return;
		}
		if ($par_itm_grp_nm8.equalsIgnoreCase(name)) {
			par_itm_grp_nm8(value);
			return;
		}
		if ($par_itm_grp_cd9.equalsIgnoreCase(name)) {
			par_itm_grp_cd9(value);
			return;
		}
		if ($par_itm_grp_nm9.equalsIgnoreCase(name)) {
			par_itm_grp_nm9(value);
			return;
		}
		if ($par_itm_grp_cd10.equalsIgnoreCase(name)) {
			par_itm_grp_cd10(value);
			return;
		}
		if ($par_itm_grp_nm10.equalsIgnoreCase(name)) {
			par_itm_grp_nm10(value);
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
		if ($first_inst_st_dt_fr.equalsIgnoreCase(name)) {
			first_inst_st_dt_fr(value);
			return;
		}
		if ($first_inst_st_hm_fr.equalsIgnoreCase(name)) {
			first_inst_st_hm_fr(value);
			return;
		}
		if ($first_inst_st_dt_to.equalsIgnoreCase(name)) {
			first_inst_st_dt_to(value);
			return;
		}
		if ($first_inst_st_hm_to.equalsIgnoreCase(name)) {
			first_inst_st_hm_to(value);
			return;
		}
		if ($first_act_st_dt_fr.equalsIgnoreCase(name)) {
			first_act_st_dt_fr(value);
			return;
		}
		if ($first_act_st_hm_fr.equalsIgnoreCase(name)) {
			first_act_st_hm_fr(value);
			return;
		}
		if ($first_act_st_dt_to.equalsIgnoreCase(name)) {
			first_act_st_dt_to(value);
			return;
		}
		if ($first_act_st_hm_to.equalsIgnoreCase(name)) {
			first_act_st_hm_to(value);
			return;
		}
		if ($last_act_st_dt_fr.equalsIgnoreCase(name)) {
			last_act_st_dt_fr(value);
			return;
		}
		if ($last_act_st_hm_fr.equalsIgnoreCase(name)) {
			last_act_st_hm_fr(value);
			return;
		}
		if ($last_act_st_dt_to.equalsIgnoreCase(name)) {
			last_act_st_dt_to(value);
			return;
		}
		if ($last_act_st_hm_to.equalsIgnoreCase(name)) {
			last_act_st_hm_to(value);
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
		if ($chd_itm_grp_flg1.equalsIgnoreCase(name)) {
			chd_itm_grp_flg1(value);
			return;
		}
		if ($chd_itm_grp_flg2.equalsIgnoreCase(name)) {
			chd_itm_grp_flg2(value);
			return;
		}
		if ($chd_itm_grp_flg3.equalsIgnoreCase(name)) {
			chd_itm_grp_flg3(value);
			return;
		}
		if ($chd_itm_grp_flg4.equalsIgnoreCase(name)) {
			chd_itm_grp_flg4(value);
			return;
		}
		if ($chd_itm_grp_flg5.equalsIgnoreCase(name)) {
			chd_itm_grp_flg5(value);
			return;
		}
		if ($chd_itm_grp_flg6.equalsIgnoreCase(name)) {
			chd_itm_grp_flg6(value);
			return;
		}
		if ($chd_itm_grp_flg7.equalsIgnoreCase(name)) {
			chd_itm_grp_flg7(value);
			return;
		}
		if ($chd_itm_grp_flg8.equalsIgnoreCase(name)) {
			chd_itm_grp_flg8(value);
			return;
		}
		if ($chd_itm_grp_flg9.equalsIgnoreCase(name)) {
			chd_itm_grp_flg9(value);
			return;
		}
		if ($chd_itm_grp_flg10.equalsIgnoreCase(name)) {
			chd_itm_grp_flg10(value);
			return;
		}
		if ($par_itm_grp_flg1.equalsIgnoreCase(name)) {
			par_itm_grp_flg1(value);
			return;
		}
		if ($par_itm_grp_flg2.equalsIgnoreCase(name)) {
			par_itm_grp_flg2(value);
			return;
		}
		if ($par_itm_grp_flg3.equalsIgnoreCase(name)) {
			par_itm_grp_flg3(value);
			return;
		}
		if ($par_itm_grp_flg4.equalsIgnoreCase(name)) {
			par_itm_grp_flg4(value);
			return;
		}
		if ($par_itm_grp_flg5.equalsIgnoreCase(name)) {
			par_itm_grp_flg5(value);
			return;
		}
		if ($par_itm_grp_flg6.equalsIgnoreCase(name)) {
			par_itm_grp_flg6(value);
			return;
		}
		if ($par_itm_grp_flg7.equalsIgnoreCase(name)) {
			par_itm_grp_flg7(value);
			return;
		}
		if ($par_itm_grp_flg8.equalsIgnoreCase(name)) {
			par_itm_grp_flg8(value);
			return;
		}
		if ($par_itm_grp_flg9.equalsIgnoreCase(name)) {
			par_itm_grp_flg9(value);
			return;
		}
		if ($par_itm_grp_flg10.equalsIgnoreCase(name)) {
			par_itm_grp_flg10(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

