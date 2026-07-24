package mcframe.serverMSBG.MSBGL0260;

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
	 * Payment received date FROM 入金日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $rcv_dt_fr = "rcv_dt_fr";
	/**
	 * Payment received date 入金日ＴＯ.<p>
	 *
	 */
	public static final String $rcv_dt_to = "rcv_dt_to";
	/**
	 * Recording date FROM 計上日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $ac_dt_fr = "ac_dt_fr";
	/**
	 * Recording date TO 計上日ＴＯ.<p>
	 *
	 */
	public static final String $ac_dt_to = "ac_dt_to";
	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public static final String $acst_cd = "acst_cd";
	/**
	 * AR customer name 売掛先名.<p>
	 *
	 */
	public static final String $acst_nm = "acst_nm";
	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public static final String $rcst_cd = "rcst_cd";
	/**
	 * Payer name 入金先名.<p>
	 *
	 */
	public static final String $rcst_nm = "rcst_nm";
	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public static final String $bcst_cd = "bcst_cd";
	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public static final String $bcst_nm = "bcst_nm";
	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public static final String $ar_dpt_cd = "ar_dpt_cd";
	/**
	 * AR dept. name 債権部門名.<p>
	 *
	 */
	public static final String $ar_dpt_nm = "ar_dpt_nm";
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
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public static final String $trd_rmrks = "trd_rmrks";
	/**
	 * Payment received result No. 入金実績ＮＯ.<p>
	 *
	 */
	public static final String $rcv_act_no = "rcv_act_no";
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public static final String $trd_cd = "trd_cd";
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public static final String $trd_nm = "trd_nm";
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public static final String $trd_cur_nm = "trd_cur_nm";
	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public static final String $bill_dpt_cd = "bill_dpt_cd";
	/**
	 * Billing dept. name 請求部門名.<p>
	 *
	 */
	public static final String $bill_dpt_nm = "bill_dpt_nm";
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
	 * AR type 債権区分.<p>
	 *
	 */
	public static final String $ar_typ = "ar_typ";
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
	 * Include reconciled 消込完了含む.<p>
	 *
	 */
	public static final String $appl_cmpl_flg = "appl_cmpl_flg";
	/**
	 * AR customer classification 1 売掛先分類１.<p>
	 *
	 */
	public static final String $acst_grp_flg1 = "acst_grp_flg1";
	/**
	 * AR customer classification cd. 1 売掛先分類ＣＤ１.<p>
	 *
	 */
	public static final String $acst_grp_cd1 = "acst_grp_cd1";
	/**
	 * AR customer classification name 1 売掛先分類名１.<p>
	 *
	 */
	public static final String $acst_grp_nm1 = "acst_grp_nm1";
	/**
	 * AR customer classification 2 売掛先分類２.<p>
	 *
	 */
	public static final String $acst_grp_flg2 = "acst_grp_flg2";
	/**
	 * AR customer classification cd. 2 売掛先分類ＣＤ２.<p>
	 *
	 */
	public static final String $acst_grp_cd2 = "acst_grp_cd2";
	/**
	 * AR customer classification name 2 売掛先分類名２.<p>
	 *
	 */
	public static final String $acst_grp_nm2 = "acst_grp_nm2";
	/**
	 * AR customer classification 3 売掛先分類３.<p>
	 *
	 */
	public static final String $acst_grp_flg3 = "acst_grp_flg3";
	/**
	 * AR customer classification cd. 3 売掛先分類ＣＤ３.<p>
	 *
	 */
	public static final String $acst_grp_cd3 = "acst_grp_cd3";
	/**
	 * AR customer classification name 3 売掛先分類名３.<p>
	 *
	 */
	public static final String $acst_grp_nm3 = "acst_grp_nm3";
	/**
	 * AR customer classification 4 売掛先分類４.<p>
	 *
	 */
	public static final String $acst_grp_flg4 = "acst_grp_flg4";
	/**
	 * AR customer classification cd. 4 売掛先分類ＣＤ４.<p>
	 *
	 */
	public static final String $acst_grp_cd4 = "acst_grp_cd4";
	/**
	 * AR customer classification name 4 売掛先分類名４.<p>
	 *
	 */
	public static final String $acst_grp_nm4 = "acst_grp_nm4";
	/**
	 * AR customer classification 5 売掛先分類５.<p>
	 *
	 */
	public static final String $acst_grp_flg5 = "acst_grp_flg5";
	/**
	 * AR customer classification cd. 5 売掛先分類ＣＤ５.<p>
	 *
	 */
	public static final String $acst_grp_cd5 = "acst_grp_cd5";
	/**
	 * AR customer classification name 5 売掛先分類名５.<p>
	 *
	 */
	public static final String $acst_grp_nm5 = "acst_grp_nm5";
	/**
	 * AR customer classification 6 売掛先分類６.<p>
	 *
	 */
	public static final String $acst_grp_flg6 = "acst_grp_flg6";
	/**
	 * AR customer classification cd. 6 売掛先分類ＣＤ６.<p>
	 *
	 */
	public static final String $acst_grp_cd6 = "acst_grp_cd6";
	/**
	 * AR customer classification name 6 売掛先分類名６.<p>
	 *
	 */
	public static final String $acst_grp_nm6 = "acst_grp_nm6";
	/**
	 * AR customer classification 7 売掛先分類７.<p>
	 *
	 */
	public static final String $acst_grp_flg7 = "acst_grp_flg7";
	/**
	 * AR customer classification cd. 7 売掛先分類ＣＤ７.<p>
	 *
	 */
	public static final String $acst_grp_cd7 = "acst_grp_cd7";
	/**
	 * AR customer classification name 7 売掛先分類名７.<p>
	 *
	 */
	public static final String $acst_grp_nm7 = "acst_grp_nm7";
	/**
	 * AR customer classification 8 売掛先分類８.<p>
	 *
	 */
	public static final String $acst_grp_flg8 = "acst_grp_flg8";
	/**
	 * AR customer classification cd. 8 売掛先分類ＣＤ８.<p>
	 *
	 */
	public static final String $acst_grp_cd8 = "acst_grp_cd8";
	/**
	 * AR customer classification name 8 売掛先分類名８.<p>
	 *
	 */
	public static final String $acst_grp_nm8 = "acst_grp_nm8";
	/**
	 * AR customer classification 9 売掛先分類９.<p>
	 *
	 */
	public static final String $acst_grp_flg9 = "acst_grp_flg9";
	/**
	 * AR customer classification cd. 9 売掛先分類ＣＤ９.<p>
	 *
	 */
	public static final String $acst_grp_cd9 = "acst_grp_cd9";
	/**
	 * AR customer classification name 9 売掛先分類名９.<p>
	 *
	 */
	public static final String $acst_grp_nm9 = "acst_grp_nm9";
	/**
	 * AR customer classification 10 売掛先分類１０.<p>
	 *
	 */
	public static final String $acst_grp_flg10 = "acst_grp_flg10";
	/**
	 * AR customer classification cd. 10 売掛先分類ＣＤ１０.<p>
	 *
	 */
	public static final String $acst_grp_cd10 = "acst_grp_cd10";
	/**
	 * AR customer classification name 10 売掛先分類名１０.<p>
	 *
	 */
	public static final String $acst_grp_nm10 = "acst_grp_nm10";
	/**
	 * Payer classification 1 入金先分類１.<p>
	 *
	 */
	public static final String $rcst_grp_flg1 = "rcst_grp_flg1";
	/**
	 * Payer classification cd. 1 入金先分類ＣＤ１.<p>
	 *
	 */
	public static final String $rcst_grp_cd1 = "rcst_grp_cd1";
	/**
	 * Payer classification name 1 入金先分類名１.<p>
	 *
	 */
	public static final String $rcst_grp_nm1 = "rcst_grp_nm1";
	/**
	 * Payer classification 2 入金先分類２.<p>
	 *
	 */
	public static final String $rcst_grp_flg2 = "rcst_grp_flg2";
	/**
	 * Payer classification cd. 2 入金先分類ＣＤ２.<p>
	 *
	 */
	public static final String $rcst_grp_cd2 = "rcst_grp_cd2";
	/**
	 * Payer classification name 2 入金先分類名２.<p>
	 *
	 */
	public static final String $rcst_grp_nm2 = "rcst_grp_nm2";
	/**
	 * Payer classification 3 入金先分類３.<p>
	 *
	 */
	public static final String $rcst_grp_flg3 = "rcst_grp_flg3";
	/**
	 * Payer classification cd. 3 入金先分類ＣＤ３.<p>
	 *
	 */
	public static final String $rcst_grp_cd3 = "rcst_grp_cd3";
	/**
	 * Payer classification name 3 入金先分類名３.<p>
	 *
	 */
	public static final String $rcst_grp_nm3 = "rcst_grp_nm3";
	/**
	 * Payer classification 4 入金先分類４.<p>
	 *
	 */
	public static final String $rcst_grp_flg4 = "rcst_grp_flg4";
	/**
	 * Payer classification cd. 4 入金先分類ＣＤ４.<p>
	 *
	 */
	public static final String $rcst_grp_cd4 = "rcst_grp_cd4";
	/**
	 * Payer classification name 4 入金先分類名４.<p>
	 *
	 */
	public static final String $rcst_grp_nm4 = "rcst_grp_nm4";
	/**
	 * Payer classification 5 入金先分類５.<p>
	 *
	 */
	public static final String $rcst_grp_flg5 = "rcst_grp_flg5";
	/**
	 * Payer classification cd. 5 入金先分類ＣＤ５.<p>
	 *
	 */
	public static final String $rcst_grp_cd5 = "rcst_grp_cd5";
	/**
	 * Payer classification name 5 入金先分類名５.<p>
	 *
	 */
	public static final String $rcst_grp_nm5 = "rcst_grp_nm5";
	/**
	 * Payer classification 6 入金先分類６.<p>
	 *
	 */
	public static final String $rcst_grp_flg6 = "rcst_grp_flg6";
	/**
	 * Payer classification cd. 6 入金先分類ＣＤ６.<p>
	 *
	 */
	public static final String $rcst_grp_cd6 = "rcst_grp_cd6";
	/**
	 * Payer classification name 6 入金先分類名６.<p>
	 *
	 */
	public static final String $rcst_grp_nm6 = "rcst_grp_nm6";
	/**
	 * Payer classification 7 入金先分類７.<p>
	 *
	 */
	public static final String $rcst_grp_flg7 = "rcst_grp_flg7";
	/**
	 * Payer classification cd. 7 入金先分類ＣＤ７.<p>
	 *
	 */
	public static final String $rcst_grp_cd7 = "rcst_grp_cd7";
	/**
	 * Payer classification name 7 入金先分類名７.<p>
	 *
	 */
	public static final String $rcst_grp_nm7 = "rcst_grp_nm7";
	/**
	 * Payer classification 8 入金先分類８.<p>
	 *
	 */
	public static final String $rcst_grp_flg8 = "rcst_grp_flg8";
	/**
	 * Payer classification cd. 8 入金先分類ＣＤ８.<p>
	 *
	 */
	public static final String $rcst_grp_cd8 = "rcst_grp_cd8";
	/**
	 * Payer classification name 8 入金先分類名８.<p>
	 *
	 */
	public static final String $rcst_grp_nm8 = "rcst_grp_nm8";
	/**
	 * Payer classification 9 入金先分類９.<p>
	 *
	 */
	public static final String $rcst_grp_flg9 = "rcst_grp_flg9";
	/**
	 * Payer classification cd. 9 入金先分類ＣＤ９.<p>
	 *
	 */
	public static final String $rcst_grp_cd9 = "rcst_grp_cd9";
	/**
	 * Payer classification name 9 入金先分類名９.<p>
	 *
	 */
	public static final String $rcst_grp_nm9 = "rcst_grp_nm9";
	/**
	 * Payer classification 10 入金先分類１０.<p>
	 *
	 */
	public static final String $rcst_grp_flg10 = "rcst_grp_flg10";
	/**
	 * Payer classification cd. 10 入金先分類ＣＤ１０.<p>
	 *
	 */
	public static final String $rcst_grp_cd10 = "rcst_grp_cd10";
	/**
	 * Payer classification name 10 入金先分類名１０.<p>
	 *
	 */
	public static final String $rcst_grp_nm10 = "rcst_grp_nm10";
	/**
	 * Billing customer classification 1 請求先分類１.<p>
	 *
	 */
	public static final String $bcst_grp_flg1 = "bcst_grp_flg1";
	/**
	 * Billing customer classification cd. 1 請求先分類ＣＤ１.<p>
	 *
	 */
	public static final String $bcst_grp_cd1 = "bcst_grp_cd1";
	/**
	 * Billing customer classification name 1 請求先分類名１.<p>
	 *
	 */
	public static final String $bcst_grp_nm1 = "bcst_grp_nm1";
	/**
	 * Billing customer classification 2 請求先分類２.<p>
	 *
	 */
	public static final String $bcst_grp_flg2 = "bcst_grp_flg2";
	/**
	 * Billing customer classification cd. 2 請求先分類ＣＤ２.<p>
	 *
	 */
	public static final String $bcst_grp_cd2 = "bcst_grp_cd2";
	/**
	 * Billing customer classification name 2 請求先分類名２.<p>
	 *
	 */
	public static final String $bcst_grp_nm2 = "bcst_grp_nm2";
	/**
	 * Billing customer classification 3 請求先分類３.<p>
	 *
	 */
	public static final String $bcst_grp_flg3 = "bcst_grp_flg3";
	/**
	 * Billing customer classification cd. 3 請求先分類ＣＤ３.<p>
	 *
	 */
	public static final String $bcst_grp_cd3 = "bcst_grp_cd3";
	/**
	 * Billing customer classification name 3 請求先分類名３.<p>
	 *
	 */
	public static final String $bcst_grp_nm3 = "bcst_grp_nm3";
	/**
	 * Billing customer classification 4 請求先分類４.<p>
	 *
	 */
	public static final String $bcst_grp_flg4 = "bcst_grp_flg4";
	/**
	 * Billing customer classification cd. 4 請求先分類ＣＤ４.<p>
	 *
	 */
	public static final String $bcst_grp_cd4 = "bcst_grp_cd4";
	/**
	 * Billing customer classification name 4 請求先分類名４.<p>
	 *
	 */
	public static final String $bcst_grp_nm4 = "bcst_grp_nm4";
	/**
	 * Billing customer classification 5 請求先分類５.<p>
	 *
	 */
	public static final String $bcst_grp_flg5 = "bcst_grp_flg5";
	/**
	 * Billing customer classification cd. 5 請求先分類ＣＤ５.<p>
	 *
	 */
	public static final String $bcst_grp_cd5 = "bcst_grp_cd5";
	/**
	 * Billing customer classification name 5 請求先分類名５.<p>
	 *
	 */
	public static final String $bcst_grp_nm5 = "bcst_grp_nm5";
	/**
	 * Billing customer classification 6 請求先分類６.<p>
	 *
	 */
	public static final String $bcst_grp_flg6 = "bcst_grp_flg6";
	/**
	 * Billing customer classification cd. 6 請求先分類ＣＤ６.<p>
	 *
	 */
	public static final String $bcst_grp_cd6 = "bcst_grp_cd6";
	/**
	 * Billing customer classification name 6 請求先分類名６.<p>
	 *
	 */
	public static final String $bcst_grp_nm6 = "bcst_grp_nm6";
	/**
	 * Billing customer classification 7 請求先分類７.<p>
	 *
	 */
	public static final String $bcst_grp_flg7 = "bcst_grp_flg7";
	/**
	 * Billing customer classification cd. 7 請求先分類ＣＤ７.<p>
	 *
	 */
	public static final String $bcst_grp_cd7 = "bcst_grp_cd7";
	/**
	 * Billing customer classification name 7 請求先分類名７.<p>
	 *
	 */
	public static final String $bcst_grp_nm7 = "bcst_grp_nm7";
	/**
	 * Billing customer classification 8 請求先分類８.<p>
	 *
	 */
	public static final String $bcst_grp_flg8 = "bcst_grp_flg8";
	/**
	 * Billing customer classification cd. 8 請求先分類ＣＤ８.<p>
	 *
	 */
	public static final String $bcst_grp_cd8 = "bcst_grp_cd8";
	/**
	 * Billing customer classification name 8 請求先分類名８.<p>
	 *
	 */
	public static final String $bcst_grp_nm8 = "bcst_grp_nm8";
	/**
	 * Billing customer classification 9 請求先分類９.<p>
	 *
	 */
	public static final String $bcst_grp_flg9 = "bcst_grp_flg9";
	/**
	 * Billing customer classification cd. 9 請求先分類ＣＤ９.<p>
	 *
	 */
	public static final String $bcst_grp_cd9 = "bcst_grp_cd9";
	/**
	 * Billing customer classification name 9 請求先分類名９.<p>
	 *
	 */
	public static final String $bcst_grp_nm9 = "bcst_grp_nm9";
	/**
	 * Billing customer classification 10 請求先分類１０.<p>
	 *
	 */
	public static final String $bcst_grp_flg10 = "bcst_grp_flg10";
	/**
	 * Billing customer classification cd. 10 請求先分類ＣＤ１０.<p>
	 *
	 */
	public static final String $bcst_grp_cd10 = "bcst_grp_cd10";
	/**
	 * Billing customer classification name 10 請求先分類名１０.<p>
	 *
	 */
	public static final String $bcst_grp_nm10 = "bcst_grp_nm10";


	public static final MCMeta rcv_dt_fr_META = createCommonMeta($rcv_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rcv_dt_to_META = createCommonMeta($rcv_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ac_dt_fr_META = createCommonMeta($ac_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ac_dt_to_META = createCommonMeta($ac_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta acst_cd_META = createCommonMeta($acst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta acst_nm_META = createCommonMeta($acst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta rcst_cd_META = createCommonMeta($rcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta rcst_nm_META = createCommonMeta($rcst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bcst_cd_META = createCommonMeta($bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bcst_nm_META = createCommonMeta($bcst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta ar_dpt_cd_META = createCommonMeta($ar_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ar_dpt_nm_META = createCommonMeta($ar_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta trd_rmrks_META = createCommonMeta($trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta rcv_act_no_META = createCommonMeta($rcv_act_no, mcframe.commonMA.meta.MA_META.RCV_ACT_NO);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_nm_META = createCommonMeta($trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta bill_dpt_cd_META = createCommonMeta($bill_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bill_dpt_nm_META = createCommonMeta($bill_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta ar_typ_META = createCommonMeta($ar_typ, mcframe.commonMA.meta.MA_META.AR_TYP);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.RCV_ACT_D_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.RCV_ACT_D_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.RCV_ACT_D_SUB_CHAR3);
	public static final MCMeta appl_cmpl_flg_META = createCommonMeta($appl_cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta acst_grp_flg1_META = createCommonMeta($acst_grp_flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta acst_grp_cd1_META = createCommonMeta($acst_grp_cd1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta acst_grp_nm1_META = createCommonMeta($acst_grp_nm1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta acst_grp_flg2_META = createCommonMeta($acst_grp_flg2, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta acst_grp_cd2_META = createCommonMeta($acst_grp_cd2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta acst_grp_nm2_META = createCommonMeta($acst_grp_nm2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta acst_grp_flg3_META = createCommonMeta($acst_grp_flg3, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta acst_grp_cd3_META = createCommonMeta($acst_grp_cd3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta acst_grp_nm3_META = createCommonMeta($acst_grp_nm3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta acst_grp_flg4_META = createCommonMeta($acst_grp_flg4, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta acst_grp_cd4_META = createCommonMeta($acst_grp_cd4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta acst_grp_nm4_META = createCommonMeta($acst_grp_nm4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta acst_grp_flg5_META = createCommonMeta($acst_grp_flg5, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta acst_grp_cd5_META = createCommonMeta($acst_grp_cd5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta acst_grp_nm5_META = createCommonMeta($acst_grp_nm5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta acst_grp_flg6_META = createCommonMeta($acst_grp_flg6, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta acst_grp_cd6_META = createCommonMeta($acst_grp_cd6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta acst_grp_nm6_META = createCommonMeta($acst_grp_nm6, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta acst_grp_flg7_META = createCommonMeta($acst_grp_flg7, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta acst_grp_cd7_META = createCommonMeta($acst_grp_cd7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta acst_grp_nm7_META = createCommonMeta($acst_grp_nm7, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta acst_grp_flg8_META = createCommonMeta($acst_grp_flg8, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta acst_grp_cd8_META = createCommonMeta($acst_grp_cd8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta acst_grp_nm8_META = createCommonMeta($acst_grp_nm8, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta acst_grp_flg9_META = createCommonMeta($acst_grp_flg9, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta acst_grp_cd9_META = createCommonMeta($acst_grp_cd9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta acst_grp_nm9_META = createCommonMeta($acst_grp_nm9, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta acst_grp_flg10_META = createCommonMeta($acst_grp_flg10, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta acst_grp_cd10_META = createCommonMeta($acst_grp_cd10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta acst_grp_nm10_META = createCommonMeta($acst_grp_nm10, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta rcst_grp_flg1_META = createCommonMeta($rcst_grp_flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcst_grp_cd1_META = createCommonMeta($rcst_grp_cd1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta rcst_grp_nm1_META = createCommonMeta($rcst_grp_nm1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta rcst_grp_flg2_META = createCommonMeta($rcst_grp_flg2, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcst_grp_cd2_META = createCommonMeta($rcst_grp_cd2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta rcst_grp_nm2_META = createCommonMeta($rcst_grp_nm2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta rcst_grp_flg3_META = createCommonMeta($rcst_grp_flg3, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcst_grp_cd3_META = createCommonMeta($rcst_grp_cd3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta rcst_grp_nm3_META = createCommonMeta($rcst_grp_nm3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta rcst_grp_flg4_META = createCommonMeta($rcst_grp_flg4, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcst_grp_cd4_META = createCommonMeta($rcst_grp_cd4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta rcst_grp_nm4_META = createCommonMeta($rcst_grp_nm4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta rcst_grp_flg5_META = createCommonMeta($rcst_grp_flg5, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcst_grp_cd5_META = createCommonMeta($rcst_grp_cd5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta rcst_grp_nm5_META = createCommonMeta($rcst_grp_nm5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta rcst_grp_flg6_META = createCommonMeta($rcst_grp_flg6, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcst_grp_cd6_META = createCommonMeta($rcst_grp_cd6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta rcst_grp_nm6_META = createCommonMeta($rcst_grp_nm6, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta rcst_grp_flg7_META = createCommonMeta($rcst_grp_flg7, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcst_grp_cd7_META = createCommonMeta($rcst_grp_cd7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta rcst_grp_nm7_META = createCommonMeta($rcst_grp_nm7, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta rcst_grp_flg8_META = createCommonMeta($rcst_grp_flg8, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcst_grp_cd8_META = createCommonMeta($rcst_grp_cd8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta rcst_grp_nm8_META = createCommonMeta($rcst_grp_nm8, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta rcst_grp_flg9_META = createCommonMeta($rcst_grp_flg9, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcst_grp_cd9_META = createCommonMeta($rcst_grp_cd9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta rcst_grp_nm9_META = createCommonMeta($rcst_grp_nm9, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta rcst_grp_flg10_META = createCommonMeta($rcst_grp_flg10, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcst_grp_cd10_META = createCommonMeta($rcst_grp_cd10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta rcst_grp_nm10_META = createCommonMeta($rcst_grp_nm10, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bcst_grp_flg1_META = createCommonMeta($bcst_grp_flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bcst_grp_cd1_META = createCommonMeta($bcst_grp_cd1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bcst_grp_nm1_META = createCommonMeta($bcst_grp_nm1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bcst_grp_flg2_META = createCommonMeta($bcst_grp_flg2, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bcst_grp_cd2_META = createCommonMeta($bcst_grp_cd2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bcst_grp_nm2_META = createCommonMeta($bcst_grp_nm2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bcst_grp_flg3_META = createCommonMeta($bcst_grp_flg3, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bcst_grp_cd3_META = createCommonMeta($bcst_grp_cd3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bcst_grp_nm3_META = createCommonMeta($bcst_grp_nm3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bcst_grp_flg4_META = createCommonMeta($bcst_grp_flg4, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bcst_grp_cd4_META = createCommonMeta($bcst_grp_cd4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bcst_grp_nm4_META = createCommonMeta($bcst_grp_nm4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bcst_grp_flg5_META = createCommonMeta($bcst_grp_flg5, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bcst_grp_cd5_META = createCommonMeta($bcst_grp_cd5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bcst_grp_nm5_META = createCommonMeta($bcst_grp_nm5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bcst_grp_flg6_META = createCommonMeta($bcst_grp_flg6, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bcst_grp_cd6_META = createCommonMeta($bcst_grp_cd6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bcst_grp_nm6_META = createCommonMeta($bcst_grp_nm6, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bcst_grp_flg7_META = createCommonMeta($bcst_grp_flg7, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bcst_grp_cd7_META = createCommonMeta($bcst_grp_cd7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bcst_grp_nm7_META = createCommonMeta($bcst_grp_nm7, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bcst_grp_flg8_META = createCommonMeta($bcst_grp_flg8, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bcst_grp_cd8_META = createCommonMeta($bcst_grp_cd8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bcst_grp_nm8_META = createCommonMeta($bcst_grp_nm8, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bcst_grp_flg9_META = createCommonMeta($bcst_grp_flg9, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bcst_grp_cd9_META = createCommonMeta($bcst_grp_cd9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bcst_grp_nm9_META = createCommonMeta($bcst_grp_nm9, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bcst_grp_flg10_META = createCommonMeta($bcst_grp_flg10, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bcst_grp_cd10_META = createCommonMeta($bcst_grp_cd10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bcst_grp_nm10_META = createCommonMeta($bcst_grp_nm10, mcframe.commonMA.meta.MA_META.BP_GRP_NM);

	protected static final ConstMetaList<Srch01_CndR> constMetas = new ConstMetaList<Srch01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			rcv_dt_fr_META,
			rcv_dt_to_META,
			ac_dt_fr_META,
			ac_dt_to_META,
			acst_cd_META,
			acst_nm_META,
			rcst_cd_META,
			rcst_nm_META,
			bcst_cd_META,
			bcst_nm_META,
			ar_dpt_cd_META,
			ar_dpt_nm_META,
			wg_cd_META,
			wg_nm_META,
			trd_rmrks_META,
			rcv_act_no_META,
			iv_no_META,
			trd_cd_META,
			trd_nm_META,
			trd_cur_cd_META,
			trd_cur_nm_META,
			bill_dpt_cd_META,
			bill_dpt_nm_META,
			wrk_no_META,
			wrk_nm_META,
			ar_typ_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			appl_cmpl_flg_META,
			acst_grp_flg1_META,
			acst_grp_cd1_META,
			acst_grp_nm1_META,
			acst_grp_flg2_META,
			acst_grp_cd2_META,
			acst_grp_nm2_META,
			acst_grp_flg3_META,
			acst_grp_cd3_META,
			acst_grp_nm3_META,
			acst_grp_flg4_META,
			acst_grp_cd4_META,
			acst_grp_nm4_META,
			acst_grp_flg5_META,
			acst_grp_cd5_META,
			acst_grp_nm5_META,
			acst_grp_flg6_META,
			acst_grp_cd6_META,
			acst_grp_nm6_META,
			acst_grp_flg7_META,
			acst_grp_cd7_META,
			acst_grp_nm7_META,
			acst_grp_flg8_META,
			acst_grp_cd8_META,
			acst_grp_nm8_META,
			acst_grp_flg9_META,
			acst_grp_cd9_META,
			acst_grp_nm9_META,
			acst_grp_flg10_META,
			acst_grp_cd10_META,
			acst_grp_nm10_META,
			rcst_grp_flg1_META,
			rcst_grp_cd1_META,
			rcst_grp_nm1_META,
			rcst_grp_flg2_META,
			rcst_grp_cd2_META,
			rcst_grp_nm2_META,
			rcst_grp_flg3_META,
			rcst_grp_cd3_META,
			rcst_grp_nm3_META,
			rcst_grp_flg4_META,
			rcst_grp_cd4_META,
			rcst_grp_nm4_META,
			rcst_grp_flg5_META,
			rcst_grp_cd5_META,
			rcst_grp_nm5_META,
			rcst_grp_flg6_META,
			rcst_grp_cd6_META,
			rcst_grp_nm6_META,
			rcst_grp_flg7_META,
			rcst_grp_cd7_META,
			rcst_grp_nm7_META,
			rcst_grp_flg8_META,
			rcst_grp_cd8_META,
			rcst_grp_nm8_META,
			rcst_grp_flg9_META,
			rcst_grp_cd9_META,
			rcst_grp_nm9_META,
			rcst_grp_flg10_META,
			rcst_grp_cd10_META,
			rcst_grp_nm10_META,
			bcst_grp_flg1_META,
			bcst_grp_cd1_META,
			bcst_grp_nm1_META,
			bcst_grp_flg2_META,
			bcst_grp_cd2_META,
			bcst_grp_nm2_META,
			bcst_grp_flg3_META,
			bcst_grp_cd3_META,
			bcst_grp_nm3_META,
			bcst_grp_flg4_META,
			bcst_grp_cd4_META,
			bcst_grp_nm4_META,
			bcst_grp_flg5_META,
			bcst_grp_cd5_META,
			bcst_grp_nm5_META,
			bcst_grp_flg6_META,
			bcst_grp_cd6_META,
			bcst_grp_nm6_META,
			bcst_grp_flg7_META,
			bcst_grp_cd7_META,
			bcst_grp_nm7_META,
			bcst_grp_flg8_META,
			bcst_grp_cd8_META,
			bcst_grp_nm8_META,
			bcst_grp_flg9_META,
			bcst_grp_cd9_META,
			bcst_grp_nm9_META,
			bcst_grp_flg10_META,
			bcst_grp_cd10_META,
			bcst_grp_nm10_META
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
	 * Payment received date FROM 入金日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate rcv_dt_fr() {
		return getConstDate(offset + 0, $rcv_dt_fr);
	}

	/**
	 * Payment received date FROM 入金日ＦＲＯＭ.<p>
	 *
	 */
	public void rcv_dt_fr(MCDate value) {
		setConstDate(offset + 0, $rcv_dt_fr, value);
	}


	/**
	 * Payment received date 入金日ＴＯ.<p>
	 *
	 */
	public MCDate rcv_dt_to() {
		return getConstDate(offset + 1, $rcv_dt_to);
	}

	/**
	 * Payment received date 入金日ＴＯ.<p>
	 *
	 */
	public void rcv_dt_to(MCDate value) {
		setConstDate(offset + 1, $rcv_dt_to, value);
	}


	/**
	 * Recording date FROM 計上日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ac_dt_fr() {
		return getConstDate(offset + 2, $ac_dt_fr);
	}

	/**
	 * Recording date FROM 計上日ＦＲＯＭ.<p>
	 *
	 */
	public void ac_dt_fr(MCDate value) {
		setConstDate(offset + 2, $ac_dt_fr, value);
	}


	/**
	 * Recording date TO 計上日ＴＯ.<p>
	 *
	 */
	public MCDate ac_dt_to() {
		return getConstDate(offset + 3, $ac_dt_to);
	}

	/**
	 * Recording date TO 計上日ＴＯ.<p>
	 *
	 */
	public void ac_dt_to(MCDate value) {
		setConstDate(offset + 3, $ac_dt_to, value);
	}


	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public String acst_cd() {
		return getConstString(offset + 4, $acst_cd);
	}

	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public void acst_cd(String value) {
		setConstString(offset + 4, $acst_cd, value);
	}


	/**
	 * AR customer name 売掛先名.<p>
	 *
	 */
	public String acst_nm() {
		return getConstString(offset + 5, $acst_nm);
	}

	/**
	 * AR customer name 売掛先名.<p>
	 *
	 */
	public void acst_nm(String value) {
		setConstString(offset + 5, $acst_nm, value);
	}


	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public String rcst_cd() {
		return getConstString(offset + 6, $rcst_cd);
	}

	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public void rcst_cd(String value) {
		setConstString(offset + 6, $rcst_cd, value);
	}


	/**
	 * Payer name 入金先名.<p>
	 *
	 */
	public String rcst_nm() {
		return getConstString(offset + 7, $rcst_nm);
	}

	/**
	 * Payer name 入金先名.<p>
	 *
	 */
	public void rcst_nm(String value) {
		setConstString(offset + 7, $rcst_nm, value);
	}


	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public String bcst_cd() {
		return getConstString(offset + 8, $bcst_cd);
	}

	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public void bcst_cd(String value) {
		setConstString(offset + 8, $bcst_cd, value);
	}


	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public String bcst_nm() {
		return getConstString(offset + 9, $bcst_nm);
	}

	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public void bcst_nm(String value) {
		setConstString(offset + 9, $bcst_nm, value);
	}


	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public String ar_dpt_cd() {
		return getConstString(offset + 10, $ar_dpt_cd);
	}

	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public void ar_dpt_cd(String value) {
		setConstString(offset + 10, $ar_dpt_cd, value);
	}


	/**
	 * AR dept. name 債権部門名.<p>
	 *
	 */
	public String ar_dpt_nm() {
		return getConstString(offset + 11, $ar_dpt_nm);
	}

	/**
	 * AR dept. name 債権部門名.<p>
	 *
	 */
	public void ar_dpt_nm(String value) {
		setConstString(offset + 11, $ar_dpt_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 12, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 12, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 13, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 13, $wg_nm, value);
	}


	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return getConstString(offset + 14, $trd_rmrks);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		setConstString(offset + 14, $trd_rmrks, value);
	}


	/**
	 * Payment received result No. 入金実績ＮＯ.<p>
	 *
	 */
	public String rcv_act_no() {
		return getConstString(offset + 15, $rcv_act_no);
	}

	/**
	 * Payment received result No. 入金実績ＮＯ.<p>
	 *
	 */
	public void rcv_act_no(String value) {
		setConstString(offset + 15, $rcv_act_no, value);
	}


	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 16, $iv_no);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 16, $iv_no, value);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 17, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 17, $trd_cd, value);
	}


	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 18, $trd_nm);
	}

	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 18, $trd_nm, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 19, $trd_cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 19, $trd_cur_cd, value);
	}


	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 20, $trd_cur_nm);
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 20, $trd_cur_nm, value);
	}


	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public String bill_dpt_cd() {
		return getConstString(offset + 21, $bill_dpt_cd);
	}

	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public void bill_dpt_cd(String value) {
		setConstString(offset + 21, $bill_dpt_cd, value);
	}


	/**
	 * Billing dept. name 請求部門名.<p>
	 *
	 */
	public String bill_dpt_nm() {
		return getConstString(offset + 22, $bill_dpt_nm);
	}

	/**
	 * Billing dept. name 請求部門名.<p>
	 *
	 */
	public void bill_dpt_nm(String value) {
		setConstString(offset + 22, $bill_dpt_nm, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 23, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 23, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 24, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 24, $wrk_nm, value);
	}


	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public String ar_typ() {
		return getConstString(offset + 25, $ar_typ);
	}

	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public void ar_typ(String value) {
		setConstString(offset + 25, $ar_typ, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 26, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 26, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 27, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 27, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 28, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 28, $sub_char3, value);
	}


	/**
	 * Include reconciled 消込完了含む.<p>
	 *
	 */
	public boolean appl_cmpl_flg() {
		return getConstBoolean(offset + 29, $appl_cmpl_flg);
	}

	/**
	 * Include reconciled 消込完了含む.<p>
	 *
	 */
	public void appl_cmpl_flg(boolean value) {
		setConstBoolean(offset + 29, $appl_cmpl_flg, value);
	}


	/**
	 * AR customer classification 1 売掛先分類１.<p>
	 *
	 */
	public boolean acst_grp_flg1() {
		return getConstBoolean(offset + 30, $acst_grp_flg1);
	}

	/**
	 * AR customer classification 1 売掛先分類１.<p>
	 *
	 */
	public void acst_grp_flg1(boolean value) {
		setConstBoolean(offset + 30, $acst_grp_flg1, value);
	}


	/**
	 * AR customer classification cd. 1 売掛先分類ＣＤ１.<p>
	 *
	 */
	public String acst_grp_cd1() {
		return getConstString(offset + 31, $acst_grp_cd1);
	}

	/**
	 * AR customer classification cd. 1 売掛先分類ＣＤ１.<p>
	 *
	 */
	public void acst_grp_cd1(String value) {
		setConstString(offset + 31, $acst_grp_cd1, value);
	}


	/**
	 * AR customer classification name 1 売掛先分類名１.<p>
	 *
	 */
	public String acst_grp_nm1() {
		return getConstString(offset + 32, $acst_grp_nm1);
	}

	/**
	 * AR customer classification name 1 売掛先分類名１.<p>
	 *
	 */
	public void acst_grp_nm1(String value) {
		setConstString(offset + 32, $acst_grp_nm1, value);
	}


	/**
	 * AR customer classification 2 売掛先分類２.<p>
	 *
	 */
	public boolean acst_grp_flg2() {
		return getConstBoolean(offset + 33, $acst_grp_flg2);
	}

	/**
	 * AR customer classification 2 売掛先分類２.<p>
	 *
	 */
	public void acst_grp_flg2(boolean value) {
		setConstBoolean(offset + 33, $acst_grp_flg2, value);
	}


	/**
	 * AR customer classification cd. 2 売掛先分類ＣＤ２.<p>
	 *
	 */
	public String acst_grp_cd2() {
		return getConstString(offset + 34, $acst_grp_cd2);
	}

	/**
	 * AR customer classification cd. 2 売掛先分類ＣＤ２.<p>
	 *
	 */
	public void acst_grp_cd2(String value) {
		setConstString(offset + 34, $acst_grp_cd2, value);
	}


	/**
	 * AR customer classification name 2 売掛先分類名２.<p>
	 *
	 */
	public String acst_grp_nm2() {
		return getConstString(offset + 35, $acst_grp_nm2);
	}

	/**
	 * AR customer classification name 2 売掛先分類名２.<p>
	 *
	 */
	public void acst_grp_nm2(String value) {
		setConstString(offset + 35, $acst_grp_nm2, value);
	}


	/**
	 * AR customer classification 3 売掛先分類３.<p>
	 *
	 */
	public boolean acst_grp_flg3() {
		return getConstBoolean(offset + 36, $acst_grp_flg3);
	}

	/**
	 * AR customer classification 3 売掛先分類３.<p>
	 *
	 */
	public void acst_grp_flg3(boolean value) {
		setConstBoolean(offset + 36, $acst_grp_flg3, value);
	}


	/**
	 * AR customer classification cd. 3 売掛先分類ＣＤ３.<p>
	 *
	 */
	public String acst_grp_cd3() {
		return getConstString(offset + 37, $acst_grp_cd3);
	}

	/**
	 * AR customer classification cd. 3 売掛先分類ＣＤ３.<p>
	 *
	 */
	public void acst_grp_cd3(String value) {
		setConstString(offset + 37, $acst_grp_cd3, value);
	}


	/**
	 * AR customer classification name 3 売掛先分類名３.<p>
	 *
	 */
	public String acst_grp_nm3() {
		return getConstString(offset + 38, $acst_grp_nm3);
	}

	/**
	 * AR customer classification name 3 売掛先分類名３.<p>
	 *
	 */
	public void acst_grp_nm3(String value) {
		setConstString(offset + 38, $acst_grp_nm3, value);
	}


	/**
	 * AR customer classification 4 売掛先分類４.<p>
	 *
	 */
	public boolean acst_grp_flg4() {
		return getConstBoolean(offset + 39, $acst_grp_flg4);
	}

	/**
	 * AR customer classification 4 売掛先分類４.<p>
	 *
	 */
	public void acst_grp_flg4(boolean value) {
		setConstBoolean(offset + 39, $acst_grp_flg4, value);
	}


	/**
	 * AR customer classification cd. 4 売掛先分類ＣＤ４.<p>
	 *
	 */
	public String acst_grp_cd4() {
		return getConstString(offset + 40, $acst_grp_cd4);
	}

	/**
	 * AR customer classification cd. 4 売掛先分類ＣＤ４.<p>
	 *
	 */
	public void acst_grp_cd4(String value) {
		setConstString(offset + 40, $acst_grp_cd4, value);
	}


	/**
	 * AR customer classification name 4 売掛先分類名４.<p>
	 *
	 */
	public String acst_grp_nm4() {
		return getConstString(offset + 41, $acst_grp_nm4);
	}

	/**
	 * AR customer classification name 4 売掛先分類名４.<p>
	 *
	 */
	public void acst_grp_nm4(String value) {
		setConstString(offset + 41, $acst_grp_nm4, value);
	}


	/**
	 * AR customer classification 5 売掛先分類５.<p>
	 *
	 */
	public boolean acst_grp_flg5() {
		return getConstBoolean(offset + 42, $acst_grp_flg5);
	}

	/**
	 * AR customer classification 5 売掛先分類５.<p>
	 *
	 */
	public void acst_grp_flg5(boolean value) {
		setConstBoolean(offset + 42, $acst_grp_flg5, value);
	}


	/**
	 * AR customer classification cd. 5 売掛先分類ＣＤ５.<p>
	 *
	 */
	public String acst_grp_cd5() {
		return getConstString(offset + 43, $acst_grp_cd5);
	}

	/**
	 * AR customer classification cd. 5 売掛先分類ＣＤ５.<p>
	 *
	 */
	public void acst_grp_cd5(String value) {
		setConstString(offset + 43, $acst_grp_cd5, value);
	}


	/**
	 * AR customer classification name 5 売掛先分類名５.<p>
	 *
	 */
	public String acst_grp_nm5() {
		return getConstString(offset + 44, $acst_grp_nm5);
	}

	/**
	 * AR customer classification name 5 売掛先分類名５.<p>
	 *
	 */
	public void acst_grp_nm5(String value) {
		setConstString(offset + 44, $acst_grp_nm5, value);
	}


	/**
	 * AR customer classification 6 売掛先分類６.<p>
	 *
	 */
	public boolean acst_grp_flg6() {
		return getConstBoolean(offset + 45, $acst_grp_flg6);
	}

	/**
	 * AR customer classification 6 売掛先分類６.<p>
	 *
	 */
	public void acst_grp_flg6(boolean value) {
		setConstBoolean(offset + 45, $acst_grp_flg6, value);
	}


	/**
	 * AR customer classification cd. 6 売掛先分類ＣＤ６.<p>
	 *
	 */
	public String acst_grp_cd6() {
		return getConstString(offset + 46, $acst_grp_cd6);
	}

	/**
	 * AR customer classification cd. 6 売掛先分類ＣＤ６.<p>
	 *
	 */
	public void acst_grp_cd6(String value) {
		setConstString(offset + 46, $acst_grp_cd6, value);
	}


	/**
	 * AR customer classification name 6 売掛先分類名６.<p>
	 *
	 */
	public String acst_grp_nm6() {
		return getConstString(offset + 47, $acst_grp_nm6);
	}

	/**
	 * AR customer classification name 6 売掛先分類名６.<p>
	 *
	 */
	public void acst_grp_nm6(String value) {
		setConstString(offset + 47, $acst_grp_nm6, value);
	}


	/**
	 * AR customer classification 7 売掛先分類７.<p>
	 *
	 */
	public boolean acst_grp_flg7() {
		return getConstBoolean(offset + 48, $acst_grp_flg7);
	}

	/**
	 * AR customer classification 7 売掛先分類７.<p>
	 *
	 */
	public void acst_grp_flg7(boolean value) {
		setConstBoolean(offset + 48, $acst_grp_flg7, value);
	}


	/**
	 * AR customer classification cd. 7 売掛先分類ＣＤ７.<p>
	 *
	 */
	public String acst_grp_cd7() {
		return getConstString(offset + 49, $acst_grp_cd7);
	}

	/**
	 * AR customer classification cd. 7 売掛先分類ＣＤ７.<p>
	 *
	 */
	public void acst_grp_cd7(String value) {
		setConstString(offset + 49, $acst_grp_cd7, value);
	}


	/**
	 * AR customer classification name 7 売掛先分類名７.<p>
	 *
	 */
	public String acst_grp_nm7() {
		return getConstString(offset + 50, $acst_grp_nm7);
	}

	/**
	 * AR customer classification name 7 売掛先分類名７.<p>
	 *
	 */
	public void acst_grp_nm7(String value) {
		setConstString(offset + 50, $acst_grp_nm7, value);
	}


	/**
	 * AR customer classification 8 売掛先分類８.<p>
	 *
	 */
	public boolean acst_grp_flg8() {
		return getConstBoolean(offset + 51, $acst_grp_flg8);
	}

	/**
	 * AR customer classification 8 売掛先分類８.<p>
	 *
	 */
	public void acst_grp_flg8(boolean value) {
		setConstBoolean(offset + 51, $acst_grp_flg8, value);
	}


	/**
	 * AR customer classification cd. 8 売掛先分類ＣＤ８.<p>
	 *
	 */
	public String acst_grp_cd8() {
		return getConstString(offset + 52, $acst_grp_cd8);
	}

	/**
	 * AR customer classification cd. 8 売掛先分類ＣＤ８.<p>
	 *
	 */
	public void acst_grp_cd8(String value) {
		setConstString(offset + 52, $acst_grp_cd8, value);
	}


	/**
	 * AR customer classification name 8 売掛先分類名８.<p>
	 *
	 */
	public String acst_grp_nm8() {
		return getConstString(offset + 53, $acst_grp_nm8);
	}

	/**
	 * AR customer classification name 8 売掛先分類名８.<p>
	 *
	 */
	public void acst_grp_nm8(String value) {
		setConstString(offset + 53, $acst_grp_nm8, value);
	}


	/**
	 * AR customer classification 9 売掛先分類９.<p>
	 *
	 */
	public boolean acst_grp_flg9() {
		return getConstBoolean(offset + 54, $acst_grp_flg9);
	}

	/**
	 * AR customer classification 9 売掛先分類９.<p>
	 *
	 */
	public void acst_grp_flg9(boolean value) {
		setConstBoolean(offset + 54, $acst_grp_flg9, value);
	}


	/**
	 * AR customer classification cd. 9 売掛先分類ＣＤ９.<p>
	 *
	 */
	public String acst_grp_cd9() {
		return getConstString(offset + 55, $acst_grp_cd9);
	}

	/**
	 * AR customer classification cd. 9 売掛先分類ＣＤ９.<p>
	 *
	 */
	public void acst_grp_cd9(String value) {
		setConstString(offset + 55, $acst_grp_cd9, value);
	}


	/**
	 * AR customer classification name 9 売掛先分類名９.<p>
	 *
	 */
	public String acst_grp_nm9() {
		return getConstString(offset + 56, $acst_grp_nm9);
	}

	/**
	 * AR customer classification name 9 売掛先分類名９.<p>
	 *
	 */
	public void acst_grp_nm9(String value) {
		setConstString(offset + 56, $acst_grp_nm9, value);
	}


	/**
	 * AR customer classification 10 売掛先分類１０.<p>
	 *
	 */
	public boolean acst_grp_flg10() {
		return getConstBoolean(offset + 57, $acst_grp_flg10);
	}

	/**
	 * AR customer classification 10 売掛先分類１０.<p>
	 *
	 */
	public void acst_grp_flg10(boolean value) {
		setConstBoolean(offset + 57, $acst_grp_flg10, value);
	}


	/**
	 * AR customer classification cd. 10 売掛先分類ＣＤ１０.<p>
	 *
	 */
	public String acst_grp_cd10() {
		return getConstString(offset + 58, $acst_grp_cd10);
	}

	/**
	 * AR customer classification cd. 10 売掛先分類ＣＤ１０.<p>
	 *
	 */
	public void acst_grp_cd10(String value) {
		setConstString(offset + 58, $acst_grp_cd10, value);
	}


	/**
	 * AR customer classification name 10 売掛先分類名１０.<p>
	 *
	 */
	public String acst_grp_nm10() {
		return getConstString(offset + 59, $acst_grp_nm10);
	}

	/**
	 * AR customer classification name 10 売掛先分類名１０.<p>
	 *
	 */
	public void acst_grp_nm10(String value) {
		setConstString(offset + 59, $acst_grp_nm10, value);
	}


	/**
	 * Payer classification 1 入金先分類１.<p>
	 *
	 */
	public boolean rcst_grp_flg1() {
		return getConstBoolean(offset + 60, $rcst_grp_flg1);
	}

	/**
	 * Payer classification 1 入金先分類１.<p>
	 *
	 */
	public void rcst_grp_flg1(boolean value) {
		setConstBoolean(offset + 60, $rcst_grp_flg1, value);
	}


	/**
	 * Payer classification cd. 1 入金先分類ＣＤ１.<p>
	 *
	 */
	public String rcst_grp_cd1() {
		return getConstString(offset + 61, $rcst_grp_cd1);
	}

	/**
	 * Payer classification cd. 1 入金先分類ＣＤ１.<p>
	 *
	 */
	public void rcst_grp_cd1(String value) {
		setConstString(offset + 61, $rcst_grp_cd1, value);
	}


	/**
	 * Payer classification name 1 入金先分類名１.<p>
	 *
	 */
	public String rcst_grp_nm1() {
		return getConstString(offset + 62, $rcst_grp_nm1);
	}

	/**
	 * Payer classification name 1 入金先分類名１.<p>
	 *
	 */
	public void rcst_grp_nm1(String value) {
		setConstString(offset + 62, $rcst_grp_nm1, value);
	}


	/**
	 * Payer classification 2 入金先分類２.<p>
	 *
	 */
	public boolean rcst_grp_flg2() {
		return getConstBoolean(offset + 63, $rcst_grp_flg2);
	}

	/**
	 * Payer classification 2 入金先分類２.<p>
	 *
	 */
	public void rcst_grp_flg2(boolean value) {
		setConstBoolean(offset + 63, $rcst_grp_flg2, value);
	}


	/**
	 * Payer classification cd. 2 入金先分類ＣＤ２.<p>
	 *
	 */
	public String rcst_grp_cd2() {
		return getConstString(offset + 64, $rcst_grp_cd2);
	}

	/**
	 * Payer classification cd. 2 入金先分類ＣＤ２.<p>
	 *
	 */
	public void rcst_grp_cd2(String value) {
		setConstString(offset + 64, $rcst_grp_cd2, value);
	}


	/**
	 * Payer classification name 2 入金先分類名２.<p>
	 *
	 */
	public String rcst_grp_nm2() {
		return getConstString(offset + 65, $rcst_grp_nm2);
	}

	/**
	 * Payer classification name 2 入金先分類名２.<p>
	 *
	 */
	public void rcst_grp_nm2(String value) {
		setConstString(offset + 65, $rcst_grp_nm2, value);
	}


	/**
	 * Payer classification 3 入金先分類３.<p>
	 *
	 */
	public boolean rcst_grp_flg3() {
		return getConstBoolean(offset + 66, $rcst_grp_flg3);
	}

	/**
	 * Payer classification 3 入金先分類３.<p>
	 *
	 */
	public void rcst_grp_flg3(boolean value) {
		setConstBoolean(offset + 66, $rcst_grp_flg3, value);
	}


	/**
	 * Payer classification cd. 3 入金先分類ＣＤ３.<p>
	 *
	 */
	public String rcst_grp_cd3() {
		return getConstString(offset + 67, $rcst_grp_cd3);
	}

	/**
	 * Payer classification cd. 3 入金先分類ＣＤ３.<p>
	 *
	 */
	public void rcst_grp_cd3(String value) {
		setConstString(offset + 67, $rcst_grp_cd3, value);
	}


	/**
	 * Payer classification name 3 入金先分類名３.<p>
	 *
	 */
	public String rcst_grp_nm3() {
		return getConstString(offset + 68, $rcst_grp_nm3);
	}

	/**
	 * Payer classification name 3 入金先分類名３.<p>
	 *
	 */
	public void rcst_grp_nm3(String value) {
		setConstString(offset + 68, $rcst_grp_nm3, value);
	}


	/**
	 * Payer classification 4 入金先分類４.<p>
	 *
	 */
	public boolean rcst_grp_flg4() {
		return getConstBoolean(offset + 69, $rcst_grp_flg4);
	}

	/**
	 * Payer classification 4 入金先分類４.<p>
	 *
	 */
	public void rcst_grp_flg4(boolean value) {
		setConstBoolean(offset + 69, $rcst_grp_flg4, value);
	}


	/**
	 * Payer classification cd. 4 入金先分類ＣＤ４.<p>
	 *
	 */
	public String rcst_grp_cd4() {
		return getConstString(offset + 70, $rcst_grp_cd4);
	}

	/**
	 * Payer classification cd. 4 入金先分類ＣＤ４.<p>
	 *
	 */
	public void rcst_grp_cd4(String value) {
		setConstString(offset + 70, $rcst_grp_cd4, value);
	}


	/**
	 * Payer classification name 4 入金先分類名４.<p>
	 *
	 */
	public String rcst_grp_nm4() {
		return getConstString(offset + 71, $rcst_grp_nm4);
	}

	/**
	 * Payer classification name 4 入金先分類名４.<p>
	 *
	 */
	public void rcst_grp_nm4(String value) {
		setConstString(offset + 71, $rcst_grp_nm4, value);
	}


	/**
	 * Payer classification 5 入金先分類５.<p>
	 *
	 */
	public boolean rcst_grp_flg5() {
		return getConstBoolean(offset + 72, $rcst_grp_flg5);
	}

	/**
	 * Payer classification 5 入金先分類５.<p>
	 *
	 */
	public void rcst_grp_flg5(boolean value) {
		setConstBoolean(offset + 72, $rcst_grp_flg5, value);
	}


	/**
	 * Payer classification cd. 5 入金先分類ＣＤ５.<p>
	 *
	 */
	public String rcst_grp_cd5() {
		return getConstString(offset + 73, $rcst_grp_cd5);
	}

	/**
	 * Payer classification cd. 5 入金先分類ＣＤ５.<p>
	 *
	 */
	public void rcst_grp_cd5(String value) {
		setConstString(offset + 73, $rcst_grp_cd5, value);
	}


	/**
	 * Payer classification name 5 入金先分類名５.<p>
	 *
	 */
	public String rcst_grp_nm5() {
		return getConstString(offset + 74, $rcst_grp_nm5);
	}

	/**
	 * Payer classification name 5 入金先分類名５.<p>
	 *
	 */
	public void rcst_grp_nm5(String value) {
		setConstString(offset + 74, $rcst_grp_nm5, value);
	}


	/**
	 * Payer classification 6 入金先分類６.<p>
	 *
	 */
	public boolean rcst_grp_flg6() {
		return getConstBoolean(offset + 75, $rcst_grp_flg6);
	}

	/**
	 * Payer classification 6 入金先分類６.<p>
	 *
	 */
	public void rcst_grp_flg6(boolean value) {
		setConstBoolean(offset + 75, $rcst_grp_flg6, value);
	}


	/**
	 * Payer classification cd. 6 入金先分類ＣＤ６.<p>
	 *
	 */
	public String rcst_grp_cd6() {
		return getConstString(offset + 76, $rcst_grp_cd6);
	}

	/**
	 * Payer classification cd. 6 入金先分類ＣＤ６.<p>
	 *
	 */
	public void rcst_grp_cd6(String value) {
		setConstString(offset + 76, $rcst_grp_cd6, value);
	}


	/**
	 * Payer classification name 6 入金先分類名６.<p>
	 *
	 */
	public String rcst_grp_nm6() {
		return getConstString(offset + 77, $rcst_grp_nm6);
	}

	/**
	 * Payer classification name 6 入金先分類名６.<p>
	 *
	 */
	public void rcst_grp_nm6(String value) {
		setConstString(offset + 77, $rcst_grp_nm6, value);
	}


	/**
	 * Payer classification 7 入金先分類７.<p>
	 *
	 */
	public boolean rcst_grp_flg7() {
		return getConstBoolean(offset + 78, $rcst_grp_flg7);
	}

	/**
	 * Payer classification 7 入金先分類７.<p>
	 *
	 */
	public void rcst_grp_flg7(boolean value) {
		setConstBoolean(offset + 78, $rcst_grp_flg7, value);
	}


	/**
	 * Payer classification cd. 7 入金先分類ＣＤ７.<p>
	 *
	 */
	public String rcst_grp_cd7() {
		return getConstString(offset + 79, $rcst_grp_cd7);
	}

	/**
	 * Payer classification cd. 7 入金先分類ＣＤ７.<p>
	 *
	 */
	public void rcst_grp_cd7(String value) {
		setConstString(offset + 79, $rcst_grp_cd7, value);
	}


	/**
	 * Payer classification name 7 入金先分類名７.<p>
	 *
	 */
	public String rcst_grp_nm7() {
		return getConstString(offset + 80, $rcst_grp_nm7);
	}

	/**
	 * Payer classification name 7 入金先分類名７.<p>
	 *
	 */
	public void rcst_grp_nm7(String value) {
		setConstString(offset + 80, $rcst_grp_nm7, value);
	}


	/**
	 * Payer classification 8 入金先分類８.<p>
	 *
	 */
	public boolean rcst_grp_flg8() {
		return getConstBoolean(offset + 81, $rcst_grp_flg8);
	}

	/**
	 * Payer classification 8 入金先分類８.<p>
	 *
	 */
	public void rcst_grp_flg8(boolean value) {
		setConstBoolean(offset + 81, $rcst_grp_flg8, value);
	}


	/**
	 * Payer classification cd. 8 入金先分類ＣＤ８.<p>
	 *
	 */
	public String rcst_grp_cd8() {
		return getConstString(offset + 82, $rcst_grp_cd8);
	}

	/**
	 * Payer classification cd. 8 入金先分類ＣＤ８.<p>
	 *
	 */
	public void rcst_grp_cd8(String value) {
		setConstString(offset + 82, $rcst_grp_cd8, value);
	}


	/**
	 * Payer classification name 8 入金先分類名８.<p>
	 *
	 */
	public String rcst_grp_nm8() {
		return getConstString(offset + 83, $rcst_grp_nm8);
	}

	/**
	 * Payer classification name 8 入金先分類名８.<p>
	 *
	 */
	public void rcst_grp_nm8(String value) {
		setConstString(offset + 83, $rcst_grp_nm8, value);
	}


	/**
	 * Payer classification 9 入金先分類９.<p>
	 *
	 */
	public boolean rcst_grp_flg9() {
		return getConstBoolean(offset + 84, $rcst_grp_flg9);
	}

	/**
	 * Payer classification 9 入金先分類９.<p>
	 *
	 */
	public void rcst_grp_flg9(boolean value) {
		setConstBoolean(offset + 84, $rcst_grp_flg9, value);
	}


	/**
	 * Payer classification cd. 9 入金先分類ＣＤ９.<p>
	 *
	 */
	public String rcst_grp_cd9() {
		return getConstString(offset + 85, $rcst_grp_cd9);
	}

	/**
	 * Payer classification cd. 9 入金先分類ＣＤ９.<p>
	 *
	 */
	public void rcst_grp_cd9(String value) {
		setConstString(offset + 85, $rcst_grp_cd9, value);
	}


	/**
	 * Payer classification name 9 入金先分類名９.<p>
	 *
	 */
	public String rcst_grp_nm9() {
		return getConstString(offset + 86, $rcst_grp_nm9);
	}

	/**
	 * Payer classification name 9 入金先分類名９.<p>
	 *
	 */
	public void rcst_grp_nm9(String value) {
		setConstString(offset + 86, $rcst_grp_nm9, value);
	}


	/**
	 * Payer classification 10 入金先分類１０.<p>
	 *
	 */
	public boolean rcst_grp_flg10() {
		return getConstBoolean(offset + 87, $rcst_grp_flg10);
	}

	/**
	 * Payer classification 10 入金先分類１０.<p>
	 *
	 */
	public void rcst_grp_flg10(boolean value) {
		setConstBoolean(offset + 87, $rcst_grp_flg10, value);
	}


	/**
	 * Payer classification cd. 10 入金先分類ＣＤ１０.<p>
	 *
	 */
	public String rcst_grp_cd10() {
		return getConstString(offset + 88, $rcst_grp_cd10);
	}

	/**
	 * Payer classification cd. 10 入金先分類ＣＤ１０.<p>
	 *
	 */
	public void rcst_grp_cd10(String value) {
		setConstString(offset + 88, $rcst_grp_cd10, value);
	}


	/**
	 * Payer classification name 10 入金先分類名１０.<p>
	 *
	 */
	public String rcst_grp_nm10() {
		return getConstString(offset + 89, $rcst_grp_nm10);
	}

	/**
	 * Payer classification name 10 入金先分類名１０.<p>
	 *
	 */
	public void rcst_grp_nm10(String value) {
		setConstString(offset + 89, $rcst_grp_nm10, value);
	}


	/**
	 * Billing customer classification 1 請求先分類１.<p>
	 *
	 */
	public boolean bcst_grp_flg1() {
		return getConstBoolean(offset + 90, $bcst_grp_flg1);
	}

	/**
	 * Billing customer classification 1 請求先分類１.<p>
	 *
	 */
	public void bcst_grp_flg1(boolean value) {
		setConstBoolean(offset + 90, $bcst_grp_flg1, value);
	}


	/**
	 * Billing customer classification cd. 1 請求先分類ＣＤ１.<p>
	 *
	 */
	public String bcst_grp_cd1() {
		return getConstString(offset + 91, $bcst_grp_cd1);
	}

	/**
	 * Billing customer classification cd. 1 請求先分類ＣＤ１.<p>
	 *
	 */
	public void bcst_grp_cd1(String value) {
		setConstString(offset + 91, $bcst_grp_cd1, value);
	}


	/**
	 * Billing customer classification name 1 請求先分類名１.<p>
	 *
	 */
	public String bcst_grp_nm1() {
		return getConstString(offset + 92, $bcst_grp_nm1);
	}

	/**
	 * Billing customer classification name 1 請求先分類名１.<p>
	 *
	 */
	public void bcst_grp_nm1(String value) {
		setConstString(offset + 92, $bcst_grp_nm1, value);
	}


	/**
	 * Billing customer classification 2 請求先分類２.<p>
	 *
	 */
	public boolean bcst_grp_flg2() {
		return getConstBoolean(offset + 93, $bcst_grp_flg2);
	}

	/**
	 * Billing customer classification 2 請求先分類２.<p>
	 *
	 */
	public void bcst_grp_flg2(boolean value) {
		setConstBoolean(offset + 93, $bcst_grp_flg2, value);
	}


	/**
	 * Billing customer classification cd. 2 請求先分類ＣＤ２.<p>
	 *
	 */
	public String bcst_grp_cd2() {
		return getConstString(offset + 94, $bcst_grp_cd2);
	}

	/**
	 * Billing customer classification cd. 2 請求先分類ＣＤ２.<p>
	 *
	 */
	public void bcst_grp_cd2(String value) {
		setConstString(offset + 94, $bcst_grp_cd2, value);
	}


	/**
	 * Billing customer classification name 2 請求先分類名２.<p>
	 *
	 */
	public String bcst_grp_nm2() {
		return getConstString(offset + 95, $bcst_grp_nm2);
	}

	/**
	 * Billing customer classification name 2 請求先分類名２.<p>
	 *
	 */
	public void bcst_grp_nm2(String value) {
		setConstString(offset + 95, $bcst_grp_nm2, value);
	}


	/**
	 * Billing customer classification 3 請求先分類３.<p>
	 *
	 */
	public boolean bcst_grp_flg3() {
		return getConstBoolean(offset + 96, $bcst_grp_flg3);
	}

	/**
	 * Billing customer classification 3 請求先分類３.<p>
	 *
	 */
	public void bcst_grp_flg3(boolean value) {
		setConstBoolean(offset + 96, $bcst_grp_flg3, value);
	}


	/**
	 * Billing customer classification cd. 3 請求先分類ＣＤ３.<p>
	 *
	 */
	public String bcst_grp_cd3() {
		return getConstString(offset + 97, $bcst_grp_cd3);
	}

	/**
	 * Billing customer classification cd. 3 請求先分類ＣＤ３.<p>
	 *
	 */
	public void bcst_grp_cd3(String value) {
		setConstString(offset + 97, $bcst_grp_cd3, value);
	}


	/**
	 * Billing customer classification name 3 請求先分類名３.<p>
	 *
	 */
	public String bcst_grp_nm3() {
		return getConstString(offset + 98, $bcst_grp_nm3);
	}

	/**
	 * Billing customer classification name 3 請求先分類名３.<p>
	 *
	 */
	public void bcst_grp_nm3(String value) {
		setConstString(offset + 98, $bcst_grp_nm3, value);
	}


	/**
	 * Billing customer classification 4 請求先分類４.<p>
	 *
	 */
	public boolean bcst_grp_flg4() {
		return getConstBoolean(offset + 99, $bcst_grp_flg4);
	}

	/**
	 * Billing customer classification 4 請求先分類４.<p>
	 *
	 */
	public void bcst_grp_flg4(boolean value) {
		setConstBoolean(offset + 99, $bcst_grp_flg4, value);
	}


	/**
	 * Billing customer classification cd. 4 請求先分類ＣＤ４.<p>
	 *
	 */
	public String bcst_grp_cd4() {
		return getConstString(offset + 100, $bcst_grp_cd4);
	}

	/**
	 * Billing customer classification cd. 4 請求先分類ＣＤ４.<p>
	 *
	 */
	public void bcst_grp_cd4(String value) {
		setConstString(offset + 100, $bcst_grp_cd4, value);
	}


	/**
	 * Billing customer classification name 4 請求先分類名４.<p>
	 *
	 */
	public String bcst_grp_nm4() {
		return getConstString(offset + 101, $bcst_grp_nm4);
	}

	/**
	 * Billing customer classification name 4 請求先分類名４.<p>
	 *
	 */
	public void bcst_grp_nm4(String value) {
		setConstString(offset + 101, $bcst_grp_nm4, value);
	}


	/**
	 * Billing customer classification 5 請求先分類５.<p>
	 *
	 */
	public boolean bcst_grp_flg5() {
		return getConstBoolean(offset + 102, $bcst_grp_flg5);
	}

	/**
	 * Billing customer classification 5 請求先分類５.<p>
	 *
	 */
	public void bcst_grp_flg5(boolean value) {
		setConstBoolean(offset + 102, $bcst_grp_flg5, value);
	}


	/**
	 * Billing customer classification cd. 5 請求先分類ＣＤ５.<p>
	 *
	 */
	public String bcst_grp_cd5() {
		return getConstString(offset + 103, $bcst_grp_cd5);
	}

	/**
	 * Billing customer classification cd. 5 請求先分類ＣＤ５.<p>
	 *
	 */
	public void bcst_grp_cd5(String value) {
		setConstString(offset + 103, $bcst_grp_cd5, value);
	}


	/**
	 * Billing customer classification name 5 請求先分類名５.<p>
	 *
	 */
	public String bcst_grp_nm5() {
		return getConstString(offset + 104, $bcst_grp_nm5);
	}

	/**
	 * Billing customer classification name 5 請求先分類名５.<p>
	 *
	 */
	public void bcst_grp_nm5(String value) {
		setConstString(offset + 104, $bcst_grp_nm5, value);
	}


	/**
	 * Billing customer classification 6 請求先分類６.<p>
	 *
	 */
	public boolean bcst_grp_flg6() {
		return getConstBoolean(offset + 105, $bcst_grp_flg6);
	}

	/**
	 * Billing customer classification 6 請求先分類６.<p>
	 *
	 */
	public void bcst_grp_flg6(boolean value) {
		setConstBoolean(offset + 105, $bcst_grp_flg6, value);
	}


	/**
	 * Billing customer classification cd. 6 請求先分類ＣＤ６.<p>
	 *
	 */
	public String bcst_grp_cd6() {
		return getConstString(offset + 106, $bcst_grp_cd6);
	}

	/**
	 * Billing customer classification cd. 6 請求先分類ＣＤ６.<p>
	 *
	 */
	public void bcst_grp_cd6(String value) {
		setConstString(offset + 106, $bcst_grp_cd6, value);
	}


	/**
	 * Billing customer classification name 6 請求先分類名６.<p>
	 *
	 */
	public String bcst_grp_nm6() {
		return getConstString(offset + 107, $bcst_grp_nm6);
	}

	/**
	 * Billing customer classification name 6 請求先分類名６.<p>
	 *
	 */
	public void bcst_grp_nm6(String value) {
		setConstString(offset + 107, $bcst_grp_nm6, value);
	}


	/**
	 * Billing customer classification 7 請求先分類７.<p>
	 *
	 */
	public boolean bcst_grp_flg7() {
		return getConstBoolean(offset + 108, $bcst_grp_flg7);
	}

	/**
	 * Billing customer classification 7 請求先分類７.<p>
	 *
	 */
	public void bcst_grp_flg7(boolean value) {
		setConstBoolean(offset + 108, $bcst_grp_flg7, value);
	}


	/**
	 * Billing customer classification cd. 7 請求先分類ＣＤ７.<p>
	 *
	 */
	public String bcst_grp_cd7() {
		return getConstString(offset + 109, $bcst_grp_cd7);
	}

	/**
	 * Billing customer classification cd. 7 請求先分類ＣＤ７.<p>
	 *
	 */
	public void bcst_grp_cd7(String value) {
		setConstString(offset + 109, $bcst_grp_cd7, value);
	}


	/**
	 * Billing customer classification name 7 請求先分類名７.<p>
	 *
	 */
	public String bcst_grp_nm7() {
		return getConstString(offset + 110, $bcst_grp_nm7);
	}

	/**
	 * Billing customer classification name 7 請求先分類名７.<p>
	 *
	 */
	public void bcst_grp_nm7(String value) {
		setConstString(offset + 110, $bcst_grp_nm7, value);
	}


	/**
	 * Billing customer classification 8 請求先分類８.<p>
	 *
	 */
	public boolean bcst_grp_flg8() {
		return getConstBoolean(offset + 111, $bcst_grp_flg8);
	}

	/**
	 * Billing customer classification 8 請求先分類８.<p>
	 *
	 */
	public void bcst_grp_flg8(boolean value) {
		setConstBoolean(offset + 111, $bcst_grp_flg8, value);
	}


	/**
	 * Billing customer classification cd. 8 請求先分類ＣＤ８.<p>
	 *
	 */
	public String bcst_grp_cd8() {
		return getConstString(offset + 112, $bcst_grp_cd8);
	}

	/**
	 * Billing customer classification cd. 8 請求先分類ＣＤ８.<p>
	 *
	 */
	public void bcst_grp_cd8(String value) {
		setConstString(offset + 112, $bcst_grp_cd8, value);
	}


	/**
	 * Billing customer classification name 8 請求先分類名８.<p>
	 *
	 */
	public String bcst_grp_nm8() {
		return getConstString(offset + 113, $bcst_grp_nm8);
	}

	/**
	 * Billing customer classification name 8 請求先分類名８.<p>
	 *
	 */
	public void bcst_grp_nm8(String value) {
		setConstString(offset + 113, $bcst_grp_nm8, value);
	}


	/**
	 * Billing customer classification 9 請求先分類９.<p>
	 *
	 */
	public boolean bcst_grp_flg9() {
		return getConstBoolean(offset + 114, $bcst_grp_flg9);
	}

	/**
	 * Billing customer classification 9 請求先分類９.<p>
	 *
	 */
	public void bcst_grp_flg9(boolean value) {
		setConstBoolean(offset + 114, $bcst_grp_flg9, value);
	}


	/**
	 * Billing customer classification cd. 9 請求先分類ＣＤ９.<p>
	 *
	 */
	public String bcst_grp_cd9() {
		return getConstString(offset + 115, $bcst_grp_cd9);
	}

	/**
	 * Billing customer classification cd. 9 請求先分類ＣＤ９.<p>
	 *
	 */
	public void bcst_grp_cd9(String value) {
		setConstString(offset + 115, $bcst_grp_cd9, value);
	}


	/**
	 * Billing customer classification name 9 請求先分類名９.<p>
	 *
	 */
	public String bcst_grp_nm9() {
		return getConstString(offset + 116, $bcst_grp_nm9);
	}

	/**
	 * Billing customer classification name 9 請求先分類名９.<p>
	 *
	 */
	public void bcst_grp_nm9(String value) {
		setConstString(offset + 116, $bcst_grp_nm9, value);
	}


	/**
	 * Billing customer classification 10 請求先分類１０.<p>
	 *
	 */
	public boolean bcst_grp_flg10() {
		return getConstBoolean(offset + 117, $bcst_grp_flg10);
	}

	/**
	 * Billing customer classification 10 請求先分類１０.<p>
	 *
	 */
	public void bcst_grp_flg10(boolean value) {
		setConstBoolean(offset + 117, $bcst_grp_flg10, value);
	}


	/**
	 * Billing customer classification cd. 10 請求先分類ＣＤ１０.<p>
	 *
	 */
	public String bcst_grp_cd10() {
		return getConstString(offset + 118, $bcst_grp_cd10);
	}

	/**
	 * Billing customer classification cd. 10 請求先分類ＣＤ１０.<p>
	 *
	 */
	public void bcst_grp_cd10(String value) {
		setConstString(offset + 118, $bcst_grp_cd10, value);
	}


	/**
	 * Billing customer classification name 10 請求先分類名１０.<p>
	 *
	 */
	public String bcst_grp_nm10() {
		return getConstString(offset + 119, $bcst_grp_nm10);
	}

	/**
	 * Billing customer classification name 10 請求先分類名１０.<p>
	 *
	 */
	public void bcst_grp_nm10(String value) {
		setConstString(offset + 119, $bcst_grp_nm10, value);
	}


	public String getString(String name) {
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($acst_nm.equalsIgnoreCase(name)) {
			return acst_nm();
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			return rcst_cd();
		}
		if ($rcst_nm.equalsIgnoreCase(name)) {
			return rcst_nm();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			return bcst_nm();
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($ar_dpt_nm.equalsIgnoreCase(name)) {
			return ar_dpt_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			return rcv_act_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($bill_dpt_nm.equalsIgnoreCase(name)) {
			return bill_dpt_nm();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			return ar_typ();
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
		if ($acst_grp_cd1.equalsIgnoreCase(name)) {
			return acst_grp_cd1();
		}
		if ($acst_grp_nm1.equalsIgnoreCase(name)) {
			return acst_grp_nm1();
		}
		if ($acst_grp_cd2.equalsIgnoreCase(name)) {
			return acst_grp_cd2();
		}
		if ($acst_grp_nm2.equalsIgnoreCase(name)) {
			return acst_grp_nm2();
		}
		if ($acst_grp_cd3.equalsIgnoreCase(name)) {
			return acst_grp_cd3();
		}
		if ($acst_grp_nm3.equalsIgnoreCase(name)) {
			return acst_grp_nm3();
		}
		if ($acst_grp_cd4.equalsIgnoreCase(name)) {
			return acst_grp_cd4();
		}
		if ($acst_grp_nm4.equalsIgnoreCase(name)) {
			return acst_grp_nm4();
		}
		if ($acst_grp_cd5.equalsIgnoreCase(name)) {
			return acst_grp_cd5();
		}
		if ($acst_grp_nm5.equalsIgnoreCase(name)) {
			return acst_grp_nm5();
		}
		if ($acst_grp_cd6.equalsIgnoreCase(name)) {
			return acst_grp_cd6();
		}
		if ($acst_grp_nm6.equalsIgnoreCase(name)) {
			return acst_grp_nm6();
		}
		if ($acst_grp_cd7.equalsIgnoreCase(name)) {
			return acst_grp_cd7();
		}
		if ($acst_grp_nm7.equalsIgnoreCase(name)) {
			return acst_grp_nm7();
		}
		if ($acst_grp_cd8.equalsIgnoreCase(name)) {
			return acst_grp_cd8();
		}
		if ($acst_grp_nm8.equalsIgnoreCase(name)) {
			return acst_grp_nm8();
		}
		if ($acst_grp_cd9.equalsIgnoreCase(name)) {
			return acst_grp_cd9();
		}
		if ($acst_grp_nm9.equalsIgnoreCase(name)) {
			return acst_grp_nm9();
		}
		if ($acst_grp_cd10.equalsIgnoreCase(name)) {
			return acst_grp_cd10();
		}
		if ($acst_grp_nm10.equalsIgnoreCase(name)) {
			return acst_grp_nm10();
		}
		if ($rcst_grp_cd1.equalsIgnoreCase(name)) {
			return rcst_grp_cd1();
		}
		if ($rcst_grp_nm1.equalsIgnoreCase(name)) {
			return rcst_grp_nm1();
		}
		if ($rcst_grp_cd2.equalsIgnoreCase(name)) {
			return rcst_grp_cd2();
		}
		if ($rcst_grp_nm2.equalsIgnoreCase(name)) {
			return rcst_grp_nm2();
		}
		if ($rcst_grp_cd3.equalsIgnoreCase(name)) {
			return rcst_grp_cd3();
		}
		if ($rcst_grp_nm3.equalsIgnoreCase(name)) {
			return rcst_grp_nm3();
		}
		if ($rcst_grp_cd4.equalsIgnoreCase(name)) {
			return rcst_grp_cd4();
		}
		if ($rcst_grp_nm4.equalsIgnoreCase(name)) {
			return rcst_grp_nm4();
		}
		if ($rcst_grp_cd5.equalsIgnoreCase(name)) {
			return rcst_grp_cd5();
		}
		if ($rcst_grp_nm5.equalsIgnoreCase(name)) {
			return rcst_grp_nm5();
		}
		if ($rcst_grp_cd6.equalsIgnoreCase(name)) {
			return rcst_grp_cd6();
		}
		if ($rcst_grp_nm6.equalsIgnoreCase(name)) {
			return rcst_grp_nm6();
		}
		if ($rcst_grp_cd7.equalsIgnoreCase(name)) {
			return rcst_grp_cd7();
		}
		if ($rcst_grp_nm7.equalsIgnoreCase(name)) {
			return rcst_grp_nm7();
		}
		if ($rcst_grp_cd8.equalsIgnoreCase(name)) {
			return rcst_grp_cd8();
		}
		if ($rcst_grp_nm8.equalsIgnoreCase(name)) {
			return rcst_grp_nm8();
		}
		if ($rcst_grp_cd9.equalsIgnoreCase(name)) {
			return rcst_grp_cd9();
		}
		if ($rcst_grp_nm9.equalsIgnoreCase(name)) {
			return rcst_grp_nm9();
		}
		if ($rcst_grp_cd10.equalsIgnoreCase(name)) {
			return rcst_grp_cd10();
		}
		if ($rcst_grp_nm10.equalsIgnoreCase(name)) {
			return rcst_grp_nm10();
		}
		if ($bcst_grp_cd1.equalsIgnoreCase(name)) {
			return bcst_grp_cd1();
		}
		if ($bcst_grp_nm1.equalsIgnoreCase(name)) {
			return bcst_grp_nm1();
		}
		if ($bcst_grp_cd2.equalsIgnoreCase(name)) {
			return bcst_grp_cd2();
		}
		if ($bcst_grp_nm2.equalsIgnoreCase(name)) {
			return bcst_grp_nm2();
		}
		if ($bcst_grp_cd3.equalsIgnoreCase(name)) {
			return bcst_grp_cd3();
		}
		if ($bcst_grp_nm3.equalsIgnoreCase(name)) {
			return bcst_grp_nm3();
		}
		if ($bcst_grp_cd4.equalsIgnoreCase(name)) {
			return bcst_grp_cd4();
		}
		if ($bcst_grp_nm4.equalsIgnoreCase(name)) {
			return bcst_grp_nm4();
		}
		if ($bcst_grp_cd5.equalsIgnoreCase(name)) {
			return bcst_grp_cd5();
		}
		if ($bcst_grp_nm5.equalsIgnoreCase(name)) {
			return bcst_grp_nm5();
		}
		if ($bcst_grp_cd6.equalsIgnoreCase(name)) {
			return bcst_grp_cd6();
		}
		if ($bcst_grp_nm6.equalsIgnoreCase(name)) {
			return bcst_grp_nm6();
		}
		if ($bcst_grp_cd7.equalsIgnoreCase(name)) {
			return bcst_grp_cd7();
		}
		if ($bcst_grp_nm7.equalsIgnoreCase(name)) {
			return bcst_grp_nm7();
		}
		if ($bcst_grp_cd8.equalsIgnoreCase(name)) {
			return bcst_grp_cd8();
		}
		if ($bcst_grp_nm8.equalsIgnoreCase(name)) {
			return bcst_grp_nm8();
		}
		if ($bcst_grp_cd9.equalsIgnoreCase(name)) {
			return bcst_grp_cd9();
		}
		if ($bcst_grp_nm9.equalsIgnoreCase(name)) {
			return bcst_grp_nm9();
		}
		if ($bcst_grp_cd10.equalsIgnoreCase(name)) {
			return bcst_grp_cd10();
		}
		if ($bcst_grp_nm10.equalsIgnoreCase(name)) {
			return bcst_grp_nm10();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($rcv_dt_fr.equalsIgnoreCase(name)) {
			return rcv_dt_fr();
		}
		if ($rcv_dt_to.equalsIgnoreCase(name)) {
			return rcv_dt_to();
		}
		if ($ac_dt_fr.equalsIgnoreCase(name)) {
			return ac_dt_fr();
		}
		if ($ac_dt_to.equalsIgnoreCase(name)) {
			return ac_dt_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($appl_cmpl_flg.equalsIgnoreCase(name)) {
			return appl_cmpl_flg();
		}
		if ($acst_grp_flg1.equalsIgnoreCase(name)) {
			return acst_grp_flg1();
		}
		if ($acst_grp_flg2.equalsIgnoreCase(name)) {
			return acst_grp_flg2();
		}
		if ($acst_grp_flg3.equalsIgnoreCase(name)) {
			return acst_grp_flg3();
		}
		if ($acst_grp_flg4.equalsIgnoreCase(name)) {
			return acst_grp_flg4();
		}
		if ($acst_grp_flg5.equalsIgnoreCase(name)) {
			return acst_grp_flg5();
		}
		if ($acst_grp_flg6.equalsIgnoreCase(name)) {
			return acst_grp_flg6();
		}
		if ($acst_grp_flg7.equalsIgnoreCase(name)) {
			return acst_grp_flg7();
		}
		if ($acst_grp_flg8.equalsIgnoreCase(name)) {
			return acst_grp_flg8();
		}
		if ($acst_grp_flg9.equalsIgnoreCase(name)) {
			return acst_grp_flg9();
		}
		if ($acst_grp_flg10.equalsIgnoreCase(name)) {
			return acst_grp_flg10();
		}
		if ($rcst_grp_flg1.equalsIgnoreCase(name)) {
			return rcst_grp_flg1();
		}
		if ($rcst_grp_flg2.equalsIgnoreCase(name)) {
			return rcst_grp_flg2();
		}
		if ($rcst_grp_flg3.equalsIgnoreCase(name)) {
			return rcst_grp_flg3();
		}
		if ($rcst_grp_flg4.equalsIgnoreCase(name)) {
			return rcst_grp_flg4();
		}
		if ($rcst_grp_flg5.equalsIgnoreCase(name)) {
			return rcst_grp_flg5();
		}
		if ($rcst_grp_flg6.equalsIgnoreCase(name)) {
			return rcst_grp_flg6();
		}
		if ($rcst_grp_flg7.equalsIgnoreCase(name)) {
			return rcst_grp_flg7();
		}
		if ($rcst_grp_flg8.equalsIgnoreCase(name)) {
			return rcst_grp_flg8();
		}
		if ($rcst_grp_flg9.equalsIgnoreCase(name)) {
			return rcst_grp_flg9();
		}
		if ($rcst_grp_flg10.equalsIgnoreCase(name)) {
			return rcst_grp_flg10();
		}
		if ($bcst_grp_flg1.equalsIgnoreCase(name)) {
			return bcst_grp_flg1();
		}
		if ($bcst_grp_flg2.equalsIgnoreCase(name)) {
			return bcst_grp_flg2();
		}
		if ($bcst_grp_flg3.equalsIgnoreCase(name)) {
			return bcst_grp_flg3();
		}
		if ($bcst_grp_flg4.equalsIgnoreCase(name)) {
			return bcst_grp_flg4();
		}
		if ($bcst_grp_flg5.equalsIgnoreCase(name)) {
			return bcst_grp_flg5();
		}
		if ($bcst_grp_flg6.equalsIgnoreCase(name)) {
			return bcst_grp_flg6();
		}
		if ($bcst_grp_flg7.equalsIgnoreCase(name)) {
			return bcst_grp_flg7();
		}
		if ($bcst_grp_flg8.equalsIgnoreCase(name)) {
			return bcst_grp_flg8();
		}
		if ($bcst_grp_flg9.equalsIgnoreCase(name)) {
			return bcst_grp_flg9();
		}
		if ($bcst_grp_flg10.equalsIgnoreCase(name)) {
			return bcst_grp_flg10();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($acst_nm.equalsIgnoreCase(name)) {
			return acst_nm();
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			return rcst_cd();
		}
		if ($rcst_nm.equalsIgnoreCase(name)) {
			return rcst_nm();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			return bcst_nm();
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($ar_dpt_nm.equalsIgnoreCase(name)) {
			return ar_dpt_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			return rcv_act_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($bill_dpt_nm.equalsIgnoreCase(name)) {
			return bill_dpt_nm();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			return ar_typ();
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
		if ($acst_grp_cd1.equalsIgnoreCase(name)) {
			return acst_grp_cd1();
		}
		if ($acst_grp_nm1.equalsIgnoreCase(name)) {
			return acst_grp_nm1();
		}
		if ($acst_grp_cd2.equalsIgnoreCase(name)) {
			return acst_grp_cd2();
		}
		if ($acst_grp_nm2.equalsIgnoreCase(name)) {
			return acst_grp_nm2();
		}
		if ($acst_grp_cd3.equalsIgnoreCase(name)) {
			return acst_grp_cd3();
		}
		if ($acst_grp_nm3.equalsIgnoreCase(name)) {
			return acst_grp_nm3();
		}
		if ($acst_grp_cd4.equalsIgnoreCase(name)) {
			return acst_grp_cd4();
		}
		if ($acst_grp_nm4.equalsIgnoreCase(name)) {
			return acst_grp_nm4();
		}
		if ($acst_grp_cd5.equalsIgnoreCase(name)) {
			return acst_grp_cd5();
		}
		if ($acst_grp_nm5.equalsIgnoreCase(name)) {
			return acst_grp_nm5();
		}
		if ($acst_grp_cd6.equalsIgnoreCase(name)) {
			return acst_grp_cd6();
		}
		if ($acst_grp_nm6.equalsIgnoreCase(name)) {
			return acst_grp_nm6();
		}
		if ($acst_grp_cd7.equalsIgnoreCase(name)) {
			return acst_grp_cd7();
		}
		if ($acst_grp_nm7.equalsIgnoreCase(name)) {
			return acst_grp_nm7();
		}
		if ($acst_grp_cd8.equalsIgnoreCase(name)) {
			return acst_grp_cd8();
		}
		if ($acst_grp_nm8.equalsIgnoreCase(name)) {
			return acst_grp_nm8();
		}
		if ($acst_grp_cd9.equalsIgnoreCase(name)) {
			return acst_grp_cd9();
		}
		if ($acst_grp_nm9.equalsIgnoreCase(name)) {
			return acst_grp_nm9();
		}
		if ($acst_grp_cd10.equalsIgnoreCase(name)) {
			return acst_grp_cd10();
		}
		if ($acst_grp_nm10.equalsIgnoreCase(name)) {
			return acst_grp_nm10();
		}
		if ($rcst_grp_cd1.equalsIgnoreCase(name)) {
			return rcst_grp_cd1();
		}
		if ($rcst_grp_nm1.equalsIgnoreCase(name)) {
			return rcst_grp_nm1();
		}
		if ($rcst_grp_cd2.equalsIgnoreCase(name)) {
			return rcst_grp_cd2();
		}
		if ($rcst_grp_nm2.equalsIgnoreCase(name)) {
			return rcst_grp_nm2();
		}
		if ($rcst_grp_cd3.equalsIgnoreCase(name)) {
			return rcst_grp_cd3();
		}
		if ($rcst_grp_nm3.equalsIgnoreCase(name)) {
			return rcst_grp_nm3();
		}
		if ($rcst_grp_cd4.equalsIgnoreCase(name)) {
			return rcst_grp_cd4();
		}
		if ($rcst_grp_nm4.equalsIgnoreCase(name)) {
			return rcst_grp_nm4();
		}
		if ($rcst_grp_cd5.equalsIgnoreCase(name)) {
			return rcst_grp_cd5();
		}
		if ($rcst_grp_nm5.equalsIgnoreCase(name)) {
			return rcst_grp_nm5();
		}
		if ($rcst_grp_cd6.equalsIgnoreCase(name)) {
			return rcst_grp_cd6();
		}
		if ($rcst_grp_nm6.equalsIgnoreCase(name)) {
			return rcst_grp_nm6();
		}
		if ($rcst_grp_cd7.equalsIgnoreCase(name)) {
			return rcst_grp_cd7();
		}
		if ($rcst_grp_nm7.equalsIgnoreCase(name)) {
			return rcst_grp_nm7();
		}
		if ($rcst_grp_cd8.equalsIgnoreCase(name)) {
			return rcst_grp_cd8();
		}
		if ($rcst_grp_nm8.equalsIgnoreCase(name)) {
			return rcst_grp_nm8();
		}
		if ($rcst_grp_cd9.equalsIgnoreCase(name)) {
			return rcst_grp_cd9();
		}
		if ($rcst_grp_nm9.equalsIgnoreCase(name)) {
			return rcst_grp_nm9();
		}
		if ($rcst_grp_cd10.equalsIgnoreCase(name)) {
			return rcst_grp_cd10();
		}
		if ($rcst_grp_nm10.equalsIgnoreCase(name)) {
			return rcst_grp_nm10();
		}
		if ($bcst_grp_cd1.equalsIgnoreCase(name)) {
			return bcst_grp_cd1();
		}
		if ($bcst_grp_nm1.equalsIgnoreCase(name)) {
			return bcst_grp_nm1();
		}
		if ($bcst_grp_cd2.equalsIgnoreCase(name)) {
			return bcst_grp_cd2();
		}
		if ($bcst_grp_nm2.equalsIgnoreCase(name)) {
			return bcst_grp_nm2();
		}
		if ($bcst_grp_cd3.equalsIgnoreCase(name)) {
			return bcst_grp_cd3();
		}
		if ($bcst_grp_nm3.equalsIgnoreCase(name)) {
			return bcst_grp_nm3();
		}
		if ($bcst_grp_cd4.equalsIgnoreCase(name)) {
			return bcst_grp_cd4();
		}
		if ($bcst_grp_nm4.equalsIgnoreCase(name)) {
			return bcst_grp_nm4();
		}
		if ($bcst_grp_cd5.equalsIgnoreCase(name)) {
			return bcst_grp_cd5();
		}
		if ($bcst_grp_nm5.equalsIgnoreCase(name)) {
			return bcst_grp_nm5();
		}
		if ($bcst_grp_cd6.equalsIgnoreCase(name)) {
			return bcst_grp_cd6();
		}
		if ($bcst_grp_nm6.equalsIgnoreCase(name)) {
			return bcst_grp_nm6();
		}
		if ($bcst_grp_cd7.equalsIgnoreCase(name)) {
			return bcst_grp_cd7();
		}
		if ($bcst_grp_nm7.equalsIgnoreCase(name)) {
			return bcst_grp_nm7();
		}
		if ($bcst_grp_cd8.equalsIgnoreCase(name)) {
			return bcst_grp_cd8();
		}
		if ($bcst_grp_nm8.equalsIgnoreCase(name)) {
			return bcst_grp_nm8();
		}
		if ($bcst_grp_cd9.equalsIgnoreCase(name)) {
			return bcst_grp_cd9();
		}
		if ($bcst_grp_nm9.equalsIgnoreCase(name)) {
			return bcst_grp_nm9();
		}
		if ($bcst_grp_cd10.equalsIgnoreCase(name)) {
			return bcst_grp_cd10();
		}
		if ($bcst_grp_nm10.equalsIgnoreCase(name)) {
			return bcst_grp_nm10();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($rcv_dt_fr.equalsIgnoreCase(name)) {
			return rcv_dt_fr();
		}
		if ($rcv_dt_to.equalsIgnoreCase(name)) {
			return rcv_dt_to();
		}
		if ($ac_dt_fr.equalsIgnoreCase(name)) {
			return ac_dt_fr();
		}
		if ($ac_dt_to.equalsIgnoreCase(name)) {
			return ac_dt_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($appl_cmpl_flg.equalsIgnoreCase(name)) {
			return appl_cmpl_flg();
		}
		if ($acst_grp_flg1.equalsIgnoreCase(name)) {
			return acst_grp_flg1();
		}
		if ($acst_grp_flg2.equalsIgnoreCase(name)) {
			return acst_grp_flg2();
		}
		if ($acst_grp_flg3.equalsIgnoreCase(name)) {
			return acst_grp_flg3();
		}
		if ($acst_grp_flg4.equalsIgnoreCase(name)) {
			return acst_grp_flg4();
		}
		if ($acst_grp_flg5.equalsIgnoreCase(name)) {
			return acst_grp_flg5();
		}
		if ($acst_grp_flg6.equalsIgnoreCase(name)) {
			return acst_grp_flg6();
		}
		if ($acst_grp_flg7.equalsIgnoreCase(name)) {
			return acst_grp_flg7();
		}
		if ($acst_grp_flg8.equalsIgnoreCase(name)) {
			return acst_grp_flg8();
		}
		if ($acst_grp_flg9.equalsIgnoreCase(name)) {
			return acst_grp_flg9();
		}
		if ($acst_grp_flg10.equalsIgnoreCase(name)) {
			return acst_grp_flg10();
		}
		if ($rcst_grp_flg1.equalsIgnoreCase(name)) {
			return rcst_grp_flg1();
		}
		if ($rcst_grp_flg2.equalsIgnoreCase(name)) {
			return rcst_grp_flg2();
		}
		if ($rcst_grp_flg3.equalsIgnoreCase(name)) {
			return rcst_grp_flg3();
		}
		if ($rcst_grp_flg4.equalsIgnoreCase(name)) {
			return rcst_grp_flg4();
		}
		if ($rcst_grp_flg5.equalsIgnoreCase(name)) {
			return rcst_grp_flg5();
		}
		if ($rcst_grp_flg6.equalsIgnoreCase(name)) {
			return rcst_grp_flg6();
		}
		if ($rcst_grp_flg7.equalsIgnoreCase(name)) {
			return rcst_grp_flg7();
		}
		if ($rcst_grp_flg8.equalsIgnoreCase(name)) {
			return rcst_grp_flg8();
		}
		if ($rcst_grp_flg9.equalsIgnoreCase(name)) {
			return rcst_grp_flg9();
		}
		if ($rcst_grp_flg10.equalsIgnoreCase(name)) {
			return rcst_grp_flg10();
		}
		if ($bcst_grp_flg1.equalsIgnoreCase(name)) {
			return bcst_grp_flg1();
		}
		if ($bcst_grp_flg2.equalsIgnoreCase(name)) {
			return bcst_grp_flg2();
		}
		if ($bcst_grp_flg3.equalsIgnoreCase(name)) {
			return bcst_grp_flg3();
		}
		if ($bcst_grp_flg4.equalsIgnoreCase(name)) {
			return bcst_grp_flg4();
		}
		if ($bcst_grp_flg5.equalsIgnoreCase(name)) {
			return bcst_grp_flg5();
		}
		if ($bcst_grp_flg6.equalsIgnoreCase(name)) {
			return bcst_grp_flg6();
		}
		if ($bcst_grp_flg7.equalsIgnoreCase(name)) {
			return bcst_grp_flg7();
		}
		if ($bcst_grp_flg8.equalsIgnoreCase(name)) {
			return bcst_grp_flg8();
		}
		if ($bcst_grp_flg9.equalsIgnoreCase(name)) {
			return bcst_grp_flg9();
		}
		if ($bcst_grp_flg10.equalsIgnoreCase(name)) {
			return bcst_grp_flg10();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($acst_nm.equalsIgnoreCase(name)) {
			acst_nm(value);
			return;
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			rcst_cd(value);
			return;
		}
		if ($rcst_nm.equalsIgnoreCase(name)) {
			rcst_nm(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			bcst_nm(value);
			return;
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			ar_dpt_cd(value);
			return;
		}
		if ($ar_dpt_nm.equalsIgnoreCase(name)) {
			ar_dpt_nm(value);
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
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			rcv_act_no(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		if ($bill_dpt_nm.equalsIgnoreCase(name)) {
			bill_dpt_nm(value);
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
		if ($ar_typ.equalsIgnoreCase(name)) {
			ar_typ(value);
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
		if ($acst_grp_cd1.equalsIgnoreCase(name)) {
			acst_grp_cd1(value);
			return;
		}
		if ($acst_grp_nm1.equalsIgnoreCase(name)) {
			acst_grp_nm1(value);
			return;
		}
		if ($acst_grp_cd2.equalsIgnoreCase(name)) {
			acst_grp_cd2(value);
			return;
		}
		if ($acst_grp_nm2.equalsIgnoreCase(name)) {
			acst_grp_nm2(value);
			return;
		}
		if ($acst_grp_cd3.equalsIgnoreCase(name)) {
			acst_grp_cd3(value);
			return;
		}
		if ($acst_grp_nm3.equalsIgnoreCase(name)) {
			acst_grp_nm3(value);
			return;
		}
		if ($acst_grp_cd4.equalsIgnoreCase(name)) {
			acst_grp_cd4(value);
			return;
		}
		if ($acst_grp_nm4.equalsIgnoreCase(name)) {
			acst_grp_nm4(value);
			return;
		}
		if ($acst_grp_cd5.equalsIgnoreCase(name)) {
			acst_grp_cd5(value);
			return;
		}
		if ($acst_grp_nm5.equalsIgnoreCase(name)) {
			acst_grp_nm5(value);
			return;
		}
		if ($acst_grp_cd6.equalsIgnoreCase(name)) {
			acst_grp_cd6(value);
			return;
		}
		if ($acst_grp_nm6.equalsIgnoreCase(name)) {
			acst_grp_nm6(value);
			return;
		}
		if ($acst_grp_cd7.equalsIgnoreCase(name)) {
			acst_grp_cd7(value);
			return;
		}
		if ($acst_grp_nm7.equalsIgnoreCase(name)) {
			acst_grp_nm7(value);
			return;
		}
		if ($acst_grp_cd8.equalsIgnoreCase(name)) {
			acst_grp_cd8(value);
			return;
		}
		if ($acst_grp_nm8.equalsIgnoreCase(name)) {
			acst_grp_nm8(value);
			return;
		}
		if ($acst_grp_cd9.equalsIgnoreCase(name)) {
			acst_grp_cd9(value);
			return;
		}
		if ($acst_grp_nm9.equalsIgnoreCase(name)) {
			acst_grp_nm9(value);
			return;
		}
		if ($acst_grp_cd10.equalsIgnoreCase(name)) {
			acst_grp_cd10(value);
			return;
		}
		if ($acst_grp_nm10.equalsIgnoreCase(name)) {
			acst_grp_nm10(value);
			return;
		}
		if ($rcst_grp_cd1.equalsIgnoreCase(name)) {
			rcst_grp_cd1(value);
			return;
		}
		if ($rcst_grp_nm1.equalsIgnoreCase(name)) {
			rcst_grp_nm1(value);
			return;
		}
		if ($rcst_grp_cd2.equalsIgnoreCase(name)) {
			rcst_grp_cd2(value);
			return;
		}
		if ($rcst_grp_nm2.equalsIgnoreCase(name)) {
			rcst_grp_nm2(value);
			return;
		}
		if ($rcst_grp_cd3.equalsIgnoreCase(name)) {
			rcst_grp_cd3(value);
			return;
		}
		if ($rcst_grp_nm3.equalsIgnoreCase(name)) {
			rcst_grp_nm3(value);
			return;
		}
		if ($rcst_grp_cd4.equalsIgnoreCase(name)) {
			rcst_grp_cd4(value);
			return;
		}
		if ($rcst_grp_nm4.equalsIgnoreCase(name)) {
			rcst_grp_nm4(value);
			return;
		}
		if ($rcst_grp_cd5.equalsIgnoreCase(name)) {
			rcst_grp_cd5(value);
			return;
		}
		if ($rcst_grp_nm5.equalsIgnoreCase(name)) {
			rcst_grp_nm5(value);
			return;
		}
		if ($rcst_grp_cd6.equalsIgnoreCase(name)) {
			rcst_grp_cd6(value);
			return;
		}
		if ($rcst_grp_nm6.equalsIgnoreCase(name)) {
			rcst_grp_nm6(value);
			return;
		}
		if ($rcst_grp_cd7.equalsIgnoreCase(name)) {
			rcst_grp_cd7(value);
			return;
		}
		if ($rcst_grp_nm7.equalsIgnoreCase(name)) {
			rcst_grp_nm7(value);
			return;
		}
		if ($rcst_grp_cd8.equalsIgnoreCase(name)) {
			rcst_grp_cd8(value);
			return;
		}
		if ($rcst_grp_nm8.equalsIgnoreCase(name)) {
			rcst_grp_nm8(value);
			return;
		}
		if ($rcst_grp_cd9.equalsIgnoreCase(name)) {
			rcst_grp_cd9(value);
			return;
		}
		if ($rcst_grp_nm9.equalsIgnoreCase(name)) {
			rcst_grp_nm9(value);
			return;
		}
		if ($rcst_grp_cd10.equalsIgnoreCase(name)) {
			rcst_grp_cd10(value);
			return;
		}
		if ($rcst_grp_nm10.equalsIgnoreCase(name)) {
			rcst_grp_nm10(value);
			return;
		}
		if ($bcst_grp_cd1.equalsIgnoreCase(name)) {
			bcst_grp_cd1(value);
			return;
		}
		if ($bcst_grp_nm1.equalsIgnoreCase(name)) {
			bcst_grp_nm1(value);
			return;
		}
		if ($bcst_grp_cd2.equalsIgnoreCase(name)) {
			bcst_grp_cd2(value);
			return;
		}
		if ($bcst_grp_nm2.equalsIgnoreCase(name)) {
			bcst_grp_nm2(value);
			return;
		}
		if ($bcst_grp_cd3.equalsIgnoreCase(name)) {
			bcst_grp_cd3(value);
			return;
		}
		if ($bcst_grp_nm3.equalsIgnoreCase(name)) {
			bcst_grp_nm3(value);
			return;
		}
		if ($bcst_grp_cd4.equalsIgnoreCase(name)) {
			bcst_grp_cd4(value);
			return;
		}
		if ($bcst_grp_nm4.equalsIgnoreCase(name)) {
			bcst_grp_nm4(value);
			return;
		}
		if ($bcst_grp_cd5.equalsIgnoreCase(name)) {
			bcst_grp_cd5(value);
			return;
		}
		if ($bcst_grp_nm5.equalsIgnoreCase(name)) {
			bcst_grp_nm5(value);
			return;
		}
		if ($bcst_grp_cd6.equalsIgnoreCase(name)) {
			bcst_grp_cd6(value);
			return;
		}
		if ($bcst_grp_nm6.equalsIgnoreCase(name)) {
			bcst_grp_nm6(value);
			return;
		}
		if ($bcst_grp_cd7.equalsIgnoreCase(name)) {
			bcst_grp_cd7(value);
			return;
		}
		if ($bcst_grp_nm7.equalsIgnoreCase(name)) {
			bcst_grp_nm7(value);
			return;
		}
		if ($bcst_grp_cd8.equalsIgnoreCase(name)) {
			bcst_grp_cd8(value);
			return;
		}
		if ($bcst_grp_nm8.equalsIgnoreCase(name)) {
			bcst_grp_nm8(value);
			return;
		}
		if ($bcst_grp_cd9.equalsIgnoreCase(name)) {
			bcst_grp_cd9(value);
			return;
		}
		if ($bcst_grp_nm9.equalsIgnoreCase(name)) {
			bcst_grp_nm9(value);
			return;
		}
		if ($bcst_grp_cd10.equalsIgnoreCase(name)) {
			bcst_grp_cd10(value);
			return;
		}
		if ($bcst_grp_nm10.equalsIgnoreCase(name)) {
			bcst_grp_nm10(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($rcv_dt_fr.equalsIgnoreCase(name)) {
			rcv_dt_fr(value);
			return;
		}
		if ($rcv_dt_to.equalsIgnoreCase(name)) {
			rcv_dt_to(value);
			return;
		}
		if ($ac_dt_fr.equalsIgnoreCase(name)) {
			ac_dt_fr(value);
			return;
		}
		if ($ac_dt_to.equalsIgnoreCase(name)) {
			ac_dt_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($appl_cmpl_flg.equalsIgnoreCase(name)) {
			appl_cmpl_flg(value);
			return;
		}
		if ($acst_grp_flg1.equalsIgnoreCase(name)) {
			acst_grp_flg1(value);
			return;
		}
		if ($acst_grp_flg2.equalsIgnoreCase(name)) {
			acst_grp_flg2(value);
			return;
		}
		if ($acst_grp_flg3.equalsIgnoreCase(name)) {
			acst_grp_flg3(value);
			return;
		}
		if ($acst_grp_flg4.equalsIgnoreCase(name)) {
			acst_grp_flg4(value);
			return;
		}
		if ($acst_grp_flg5.equalsIgnoreCase(name)) {
			acst_grp_flg5(value);
			return;
		}
		if ($acst_grp_flg6.equalsIgnoreCase(name)) {
			acst_grp_flg6(value);
			return;
		}
		if ($acst_grp_flg7.equalsIgnoreCase(name)) {
			acst_grp_flg7(value);
			return;
		}
		if ($acst_grp_flg8.equalsIgnoreCase(name)) {
			acst_grp_flg8(value);
			return;
		}
		if ($acst_grp_flg9.equalsIgnoreCase(name)) {
			acst_grp_flg9(value);
			return;
		}
		if ($acst_grp_flg10.equalsIgnoreCase(name)) {
			acst_grp_flg10(value);
			return;
		}
		if ($rcst_grp_flg1.equalsIgnoreCase(name)) {
			rcst_grp_flg1(value);
			return;
		}
		if ($rcst_grp_flg2.equalsIgnoreCase(name)) {
			rcst_grp_flg2(value);
			return;
		}
		if ($rcst_grp_flg3.equalsIgnoreCase(name)) {
			rcst_grp_flg3(value);
			return;
		}
		if ($rcst_grp_flg4.equalsIgnoreCase(name)) {
			rcst_grp_flg4(value);
			return;
		}
		if ($rcst_grp_flg5.equalsIgnoreCase(name)) {
			rcst_grp_flg5(value);
			return;
		}
		if ($rcst_grp_flg6.equalsIgnoreCase(name)) {
			rcst_grp_flg6(value);
			return;
		}
		if ($rcst_grp_flg7.equalsIgnoreCase(name)) {
			rcst_grp_flg7(value);
			return;
		}
		if ($rcst_grp_flg8.equalsIgnoreCase(name)) {
			rcst_grp_flg8(value);
			return;
		}
		if ($rcst_grp_flg9.equalsIgnoreCase(name)) {
			rcst_grp_flg9(value);
			return;
		}
		if ($rcst_grp_flg10.equalsIgnoreCase(name)) {
			rcst_grp_flg10(value);
			return;
		}
		if ($bcst_grp_flg1.equalsIgnoreCase(name)) {
			bcst_grp_flg1(value);
			return;
		}
		if ($bcst_grp_flg2.equalsIgnoreCase(name)) {
			bcst_grp_flg2(value);
			return;
		}
		if ($bcst_grp_flg3.equalsIgnoreCase(name)) {
			bcst_grp_flg3(value);
			return;
		}
		if ($bcst_grp_flg4.equalsIgnoreCase(name)) {
			bcst_grp_flg4(value);
			return;
		}
		if ($bcst_grp_flg5.equalsIgnoreCase(name)) {
			bcst_grp_flg5(value);
			return;
		}
		if ($bcst_grp_flg6.equalsIgnoreCase(name)) {
			bcst_grp_flg6(value);
			return;
		}
		if ($bcst_grp_flg7.equalsIgnoreCase(name)) {
			bcst_grp_flg7(value);
			return;
		}
		if ($bcst_grp_flg8.equalsIgnoreCase(name)) {
			bcst_grp_flg8(value);
			return;
		}
		if ($bcst_grp_flg9.equalsIgnoreCase(name)) {
			bcst_grp_flg9(value);
			return;
		}
		if ($bcst_grp_flg10.equalsIgnoreCase(name)) {
			bcst_grp_flg10(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($acst_nm.equalsIgnoreCase(name)) {
			acst_nm(value);
			return;
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			rcst_cd(value);
			return;
		}
		if ($rcst_nm.equalsIgnoreCase(name)) {
			rcst_nm(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			bcst_nm(value);
			return;
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			ar_dpt_cd(value);
			return;
		}
		if ($ar_dpt_nm.equalsIgnoreCase(name)) {
			ar_dpt_nm(value);
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
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			rcv_act_no(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		if ($bill_dpt_nm.equalsIgnoreCase(name)) {
			bill_dpt_nm(value);
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
		if ($ar_typ.equalsIgnoreCase(name)) {
			ar_typ(value);
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
		if ($acst_grp_cd1.equalsIgnoreCase(name)) {
			acst_grp_cd1(value);
			return;
		}
		if ($acst_grp_nm1.equalsIgnoreCase(name)) {
			acst_grp_nm1(value);
			return;
		}
		if ($acst_grp_cd2.equalsIgnoreCase(name)) {
			acst_grp_cd2(value);
			return;
		}
		if ($acst_grp_nm2.equalsIgnoreCase(name)) {
			acst_grp_nm2(value);
			return;
		}
		if ($acst_grp_cd3.equalsIgnoreCase(name)) {
			acst_grp_cd3(value);
			return;
		}
		if ($acst_grp_nm3.equalsIgnoreCase(name)) {
			acst_grp_nm3(value);
			return;
		}
		if ($acst_grp_cd4.equalsIgnoreCase(name)) {
			acst_grp_cd4(value);
			return;
		}
		if ($acst_grp_nm4.equalsIgnoreCase(name)) {
			acst_grp_nm4(value);
			return;
		}
		if ($acst_grp_cd5.equalsIgnoreCase(name)) {
			acst_grp_cd5(value);
			return;
		}
		if ($acst_grp_nm5.equalsIgnoreCase(name)) {
			acst_grp_nm5(value);
			return;
		}
		if ($acst_grp_cd6.equalsIgnoreCase(name)) {
			acst_grp_cd6(value);
			return;
		}
		if ($acst_grp_nm6.equalsIgnoreCase(name)) {
			acst_grp_nm6(value);
			return;
		}
		if ($acst_grp_cd7.equalsIgnoreCase(name)) {
			acst_grp_cd7(value);
			return;
		}
		if ($acst_grp_nm7.equalsIgnoreCase(name)) {
			acst_grp_nm7(value);
			return;
		}
		if ($acst_grp_cd8.equalsIgnoreCase(name)) {
			acst_grp_cd8(value);
			return;
		}
		if ($acst_grp_nm8.equalsIgnoreCase(name)) {
			acst_grp_nm8(value);
			return;
		}
		if ($acst_grp_cd9.equalsIgnoreCase(name)) {
			acst_grp_cd9(value);
			return;
		}
		if ($acst_grp_nm9.equalsIgnoreCase(name)) {
			acst_grp_nm9(value);
			return;
		}
		if ($acst_grp_cd10.equalsIgnoreCase(name)) {
			acst_grp_cd10(value);
			return;
		}
		if ($acst_grp_nm10.equalsIgnoreCase(name)) {
			acst_grp_nm10(value);
			return;
		}
		if ($rcst_grp_cd1.equalsIgnoreCase(name)) {
			rcst_grp_cd1(value);
			return;
		}
		if ($rcst_grp_nm1.equalsIgnoreCase(name)) {
			rcst_grp_nm1(value);
			return;
		}
		if ($rcst_grp_cd2.equalsIgnoreCase(name)) {
			rcst_grp_cd2(value);
			return;
		}
		if ($rcst_grp_nm2.equalsIgnoreCase(name)) {
			rcst_grp_nm2(value);
			return;
		}
		if ($rcst_grp_cd3.equalsIgnoreCase(name)) {
			rcst_grp_cd3(value);
			return;
		}
		if ($rcst_grp_nm3.equalsIgnoreCase(name)) {
			rcst_grp_nm3(value);
			return;
		}
		if ($rcst_grp_cd4.equalsIgnoreCase(name)) {
			rcst_grp_cd4(value);
			return;
		}
		if ($rcst_grp_nm4.equalsIgnoreCase(name)) {
			rcst_grp_nm4(value);
			return;
		}
		if ($rcst_grp_cd5.equalsIgnoreCase(name)) {
			rcst_grp_cd5(value);
			return;
		}
		if ($rcst_grp_nm5.equalsIgnoreCase(name)) {
			rcst_grp_nm5(value);
			return;
		}
		if ($rcst_grp_cd6.equalsIgnoreCase(name)) {
			rcst_grp_cd6(value);
			return;
		}
		if ($rcst_grp_nm6.equalsIgnoreCase(name)) {
			rcst_grp_nm6(value);
			return;
		}
		if ($rcst_grp_cd7.equalsIgnoreCase(name)) {
			rcst_grp_cd7(value);
			return;
		}
		if ($rcst_grp_nm7.equalsIgnoreCase(name)) {
			rcst_grp_nm7(value);
			return;
		}
		if ($rcst_grp_cd8.equalsIgnoreCase(name)) {
			rcst_grp_cd8(value);
			return;
		}
		if ($rcst_grp_nm8.equalsIgnoreCase(name)) {
			rcst_grp_nm8(value);
			return;
		}
		if ($rcst_grp_cd9.equalsIgnoreCase(name)) {
			rcst_grp_cd9(value);
			return;
		}
		if ($rcst_grp_nm9.equalsIgnoreCase(name)) {
			rcst_grp_nm9(value);
			return;
		}
		if ($rcst_grp_cd10.equalsIgnoreCase(name)) {
			rcst_grp_cd10(value);
			return;
		}
		if ($rcst_grp_nm10.equalsIgnoreCase(name)) {
			rcst_grp_nm10(value);
			return;
		}
		if ($bcst_grp_cd1.equalsIgnoreCase(name)) {
			bcst_grp_cd1(value);
			return;
		}
		if ($bcst_grp_nm1.equalsIgnoreCase(name)) {
			bcst_grp_nm1(value);
			return;
		}
		if ($bcst_grp_cd2.equalsIgnoreCase(name)) {
			bcst_grp_cd2(value);
			return;
		}
		if ($bcst_grp_nm2.equalsIgnoreCase(name)) {
			bcst_grp_nm2(value);
			return;
		}
		if ($bcst_grp_cd3.equalsIgnoreCase(name)) {
			bcst_grp_cd3(value);
			return;
		}
		if ($bcst_grp_nm3.equalsIgnoreCase(name)) {
			bcst_grp_nm3(value);
			return;
		}
		if ($bcst_grp_cd4.equalsIgnoreCase(name)) {
			bcst_grp_cd4(value);
			return;
		}
		if ($bcst_grp_nm4.equalsIgnoreCase(name)) {
			bcst_grp_nm4(value);
			return;
		}
		if ($bcst_grp_cd5.equalsIgnoreCase(name)) {
			bcst_grp_cd5(value);
			return;
		}
		if ($bcst_grp_nm5.equalsIgnoreCase(name)) {
			bcst_grp_nm5(value);
			return;
		}
		if ($bcst_grp_cd6.equalsIgnoreCase(name)) {
			bcst_grp_cd6(value);
			return;
		}
		if ($bcst_grp_nm6.equalsIgnoreCase(name)) {
			bcst_grp_nm6(value);
			return;
		}
		if ($bcst_grp_cd7.equalsIgnoreCase(name)) {
			bcst_grp_cd7(value);
			return;
		}
		if ($bcst_grp_nm7.equalsIgnoreCase(name)) {
			bcst_grp_nm7(value);
			return;
		}
		if ($bcst_grp_cd8.equalsIgnoreCase(name)) {
			bcst_grp_cd8(value);
			return;
		}
		if ($bcst_grp_nm8.equalsIgnoreCase(name)) {
			bcst_grp_nm8(value);
			return;
		}
		if ($bcst_grp_cd9.equalsIgnoreCase(name)) {
			bcst_grp_cd9(value);
			return;
		}
		if ($bcst_grp_nm9.equalsIgnoreCase(name)) {
			bcst_grp_nm9(value);
			return;
		}
		if ($bcst_grp_cd10.equalsIgnoreCase(name)) {
			bcst_grp_cd10(value);
			return;
		}
		if ($bcst_grp_nm10.equalsIgnoreCase(name)) {
			bcst_grp_nm10(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($rcv_dt_fr.equalsIgnoreCase(name)) {
			rcv_dt_fr(value);
			return;
		}
		if ($rcv_dt_to.equalsIgnoreCase(name)) {
			rcv_dt_to(value);
			return;
		}
		if ($ac_dt_fr.equalsIgnoreCase(name)) {
			ac_dt_fr(value);
			return;
		}
		if ($ac_dt_to.equalsIgnoreCase(name)) {
			ac_dt_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($appl_cmpl_flg.equalsIgnoreCase(name)) {
			appl_cmpl_flg(value);
			return;
		}
		if ($acst_grp_flg1.equalsIgnoreCase(name)) {
			acst_grp_flg1(value);
			return;
		}
		if ($acst_grp_flg2.equalsIgnoreCase(name)) {
			acst_grp_flg2(value);
			return;
		}
		if ($acst_grp_flg3.equalsIgnoreCase(name)) {
			acst_grp_flg3(value);
			return;
		}
		if ($acst_grp_flg4.equalsIgnoreCase(name)) {
			acst_grp_flg4(value);
			return;
		}
		if ($acst_grp_flg5.equalsIgnoreCase(name)) {
			acst_grp_flg5(value);
			return;
		}
		if ($acst_grp_flg6.equalsIgnoreCase(name)) {
			acst_grp_flg6(value);
			return;
		}
		if ($acst_grp_flg7.equalsIgnoreCase(name)) {
			acst_grp_flg7(value);
			return;
		}
		if ($acst_grp_flg8.equalsIgnoreCase(name)) {
			acst_grp_flg8(value);
			return;
		}
		if ($acst_grp_flg9.equalsIgnoreCase(name)) {
			acst_grp_flg9(value);
			return;
		}
		if ($acst_grp_flg10.equalsIgnoreCase(name)) {
			acst_grp_flg10(value);
			return;
		}
		if ($rcst_grp_flg1.equalsIgnoreCase(name)) {
			rcst_grp_flg1(value);
			return;
		}
		if ($rcst_grp_flg2.equalsIgnoreCase(name)) {
			rcst_grp_flg2(value);
			return;
		}
		if ($rcst_grp_flg3.equalsIgnoreCase(name)) {
			rcst_grp_flg3(value);
			return;
		}
		if ($rcst_grp_flg4.equalsIgnoreCase(name)) {
			rcst_grp_flg4(value);
			return;
		}
		if ($rcst_grp_flg5.equalsIgnoreCase(name)) {
			rcst_grp_flg5(value);
			return;
		}
		if ($rcst_grp_flg6.equalsIgnoreCase(name)) {
			rcst_grp_flg6(value);
			return;
		}
		if ($rcst_grp_flg7.equalsIgnoreCase(name)) {
			rcst_grp_flg7(value);
			return;
		}
		if ($rcst_grp_flg8.equalsIgnoreCase(name)) {
			rcst_grp_flg8(value);
			return;
		}
		if ($rcst_grp_flg9.equalsIgnoreCase(name)) {
			rcst_grp_flg9(value);
			return;
		}
		if ($rcst_grp_flg10.equalsIgnoreCase(name)) {
			rcst_grp_flg10(value);
			return;
		}
		if ($bcst_grp_flg1.equalsIgnoreCase(name)) {
			bcst_grp_flg1(value);
			return;
		}
		if ($bcst_grp_flg2.equalsIgnoreCase(name)) {
			bcst_grp_flg2(value);
			return;
		}
		if ($bcst_grp_flg3.equalsIgnoreCase(name)) {
			bcst_grp_flg3(value);
			return;
		}
		if ($bcst_grp_flg4.equalsIgnoreCase(name)) {
			bcst_grp_flg4(value);
			return;
		}
		if ($bcst_grp_flg5.equalsIgnoreCase(name)) {
			bcst_grp_flg5(value);
			return;
		}
		if ($bcst_grp_flg6.equalsIgnoreCase(name)) {
			bcst_grp_flg6(value);
			return;
		}
		if ($bcst_grp_flg7.equalsIgnoreCase(name)) {
			bcst_grp_flg7(value);
			return;
		}
		if ($bcst_grp_flg8.equalsIgnoreCase(name)) {
			bcst_grp_flg8(value);
			return;
		}
		if ($bcst_grp_flg9.equalsIgnoreCase(name)) {
			bcst_grp_flg9(value);
			return;
		}
		if ($bcst_grp_flg10.equalsIgnoreCase(name)) {
			bcst_grp_flg10(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

