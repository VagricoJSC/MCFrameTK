package mcframe.clientMSBG.MSBGP0260;

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
	public static final String $wrk_no_p = "wrk_no_p";
	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public static final String $ar_typ = "ar_typ";
	/**
	 * AR type name 債権区分名.<p>
	 *
	 */
	public static final String $ar_typ_nm = "ar_typ_nm";
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
	public static final String $acst_grp_p = "acst_grp_p";
	public static final String $rcst_grp_p = "rcst_grp_p";
	public static final String $bcst_grp_p = "bcst_grp_p";

	public static final String $wrk_no = $wrk_no_p + ".wrk_no";
	public static final String $wrk_nm = $wrk_no_p + ".wrk_nm";
	public static final String $acst_grp_lab1 = $acst_grp_p + ".bp_grp_lab1";
	public static final String $acst_grp_flg1 = $acst_grp_p + ".bp_grp_flg1";
	public static final String $acst_grp_cd1 = $acst_grp_p + ".bp_grp_cd1";
	public static final String $acst_grp_nm1 = $acst_grp_p + ".bp_grp_nm1";
	public static final String $acst_grp_lab2 = $acst_grp_p + ".bp_grp_lab2";
	public static final String $acst_grp_flg2 = $acst_grp_p + ".bp_grp_flg2";
	public static final String $acst_grp_cd2 = $acst_grp_p + ".bp_grp_cd2";
	public static final String $acst_grp_nm2 = $acst_grp_p + ".bp_grp_nm2";
	public static final String $acst_grp_lab3 = $acst_grp_p + ".bp_grp_lab3";
	public static final String $acst_grp_flg3 = $acst_grp_p + ".bp_grp_flg3";
	public static final String $acst_grp_cd3 = $acst_grp_p + ".bp_grp_cd3";
	public static final String $acst_grp_nm3 = $acst_grp_p + ".bp_grp_nm3";
	public static final String $acst_grp_lab4 = $acst_grp_p + ".bp_grp_lab4";
	public static final String $acst_grp_flg4 = $acst_grp_p + ".bp_grp_flg4";
	public static final String $acst_grp_cd4 = $acst_grp_p + ".bp_grp_cd4";
	public static final String $acst_grp_nm4 = $acst_grp_p + ".bp_grp_nm4";
	public static final String $acst_grp_lab5 = $acst_grp_p + ".bp_grp_lab5";
	public static final String $acst_grp_flg5 = $acst_grp_p + ".bp_grp_flg5";
	public static final String $acst_grp_cd5 = $acst_grp_p + ".bp_grp_cd5";
	public static final String $acst_grp_nm5 = $acst_grp_p + ".bp_grp_nm5";
	public static final String $acst_grp_lab6 = $acst_grp_p + ".bp_grp_lab6";
	public static final String $acst_grp_flg6 = $acst_grp_p + ".bp_grp_flg6";
	public static final String $acst_grp_cd6 = $acst_grp_p + ".bp_grp_cd6";
	public static final String $acst_grp_nm6 = $acst_grp_p + ".bp_grp_nm6";
	public static final String $acst_grp_lab7 = $acst_grp_p + ".bp_grp_lab7";
	public static final String $acst_grp_flg7 = $acst_grp_p + ".bp_grp_flg7";
	public static final String $acst_grp_cd7 = $acst_grp_p + ".bp_grp_cd7";
	public static final String $acst_grp_nm7 = $acst_grp_p + ".bp_grp_nm7";
	public static final String $acst_grp_lab8 = $acst_grp_p + ".bp_grp_lab8";
	public static final String $acst_grp_flg8 = $acst_grp_p + ".bp_grp_flg8";
	public static final String $acst_grp_cd8 = $acst_grp_p + ".bp_grp_cd8";
	public static final String $acst_grp_nm8 = $acst_grp_p + ".bp_grp_nm8";
	public static final String $acst_grp_lab9 = $acst_grp_p + ".bp_grp_lab9";
	public static final String $acst_grp_flg9 = $acst_grp_p + ".bp_grp_flg9";
	public static final String $acst_grp_cd9 = $acst_grp_p + ".bp_grp_cd9";
	public static final String $acst_grp_nm9 = $acst_grp_p + ".bp_grp_nm9";
	public static final String $acst_grp_lab10 = $acst_grp_p + ".bp_grp_lab10";
	public static final String $acst_grp_flg10 = $acst_grp_p + ".bp_grp_flg10";
	public static final String $acst_grp_cd10 = $acst_grp_p + ".bp_grp_cd10";
	public static final String $acst_grp_nm10 = $acst_grp_p + ".bp_grp_nm10";
	public static final String $rcst_grp_lab1 = $rcst_grp_p + ".bp_grp_lab1";
	public static final String $rcst_grp_flg1 = $rcst_grp_p + ".bp_grp_flg1";
	public static final String $rcst_grp_cd1 = $rcst_grp_p + ".bp_grp_cd1";
	public static final String $rcst_grp_nm1 = $rcst_grp_p + ".bp_grp_nm1";
	public static final String $rcst_grp_lab2 = $rcst_grp_p + ".bp_grp_lab2";
	public static final String $rcst_grp_flg2 = $rcst_grp_p + ".bp_grp_flg2";
	public static final String $rcst_grp_cd2 = $rcst_grp_p + ".bp_grp_cd2";
	public static final String $rcst_grp_nm2 = $rcst_grp_p + ".bp_grp_nm2";
	public static final String $rcst_grp_lab3 = $rcst_grp_p + ".bp_grp_lab3";
	public static final String $rcst_grp_flg3 = $rcst_grp_p + ".bp_grp_flg3";
	public static final String $rcst_grp_cd3 = $rcst_grp_p + ".bp_grp_cd3";
	public static final String $rcst_grp_nm3 = $rcst_grp_p + ".bp_grp_nm3";
	public static final String $rcst_grp_lab4 = $rcst_grp_p + ".bp_grp_lab4";
	public static final String $rcst_grp_flg4 = $rcst_grp_p + ".bp_grp_flg4";
	public static final String $rcst_grp_cd4 = $rcst_grp_p + ".bp_grp_cd4";
	public static final String $rcst_grp_nm4 = $rcst_grp_p + ".bp_grp_nm4";
	public static final String $rcst_grp_lab5 = $rcst_grp_p + ".bp_grp_lab5";
	public static final String $rcst_grp_flg5 = $rcst_grp_p + ".bp_grp_flg5";
	public static final String $rcst_grp_cd5 = $rcst_grp_p + ".bp_grp_cd5";
	public static final String $rcst_grp_nm5 = $rcst_grp_p + ".bp_grp_nm5";
	public static final String $rcst_grp_lab6 = $rcst_grp_p + ".bp_grp_lab6";
	public static final String $rcst_grp_flg6 = $rcst_grp_p + ".bp_grp_flg6";
	public static final String $rcst_grp_cd6 = $rcst_grp_p + ".bp_grp_cd6";
	public static final String $rcst_grp_nm6 = $rcst_grp_p + ".bp_grp_nm6";
	public static final String $rcst_grp_lab7 = $rcst_grp_p + ".bp_grp_lab7";
	public static final String $rcst_grp_flg7 = $rcst_grp_p + ".bp_grp_flg7";
	public static final String $rcst_grp_cd7 = $rcst_grp_p + ".bp_grp_cd7";
	public static final String $rcst_grp_nm7 = $rcst_grp_p + ".bp_grp_nm7";
	public static final String $rcst_grp_lab8 = $rcst_grp_p + ".bp_grp_lab8";
	public static final String $rcst_grp_flg8 = $rcst_grp_p + ".bp_grp_flg8";
	public static final String $rcst_grp_cd8 = $rcst_grp_p + ".bp_grp_cd8";
	public static final String $rcst_grp_nm8 = $rcst_grp_p + ".bp_grp_nm8";
	public static final String $rcst_grp_lab9 = $rcst_grp_p + ".bp_grp_lab9";
	public static final String $rcst_grp_flg9 = $rcst_grp_p + ".bp_grp_flg9";
	public static final String $rcst_grp_cd9 = $rcst_grp_p + ".bp_grp_cd9";
	public static final String $rcst_grp_nm9 = $rcst_grp_p + ".bp_grp_nm9";
	public static final String $rcst_grp_lab10 = $rcst_grp_p + ".bp_grp_lab10";
	public static final String $rcst_grp_flg10 = $rcst_grp_p + ".bp_grp_flg10";
	public static final String $rcst_grp_cd10 = $rcst_grp_p + ".bp_grp_cd10";
	public static final String $rcst_grp_nm10 = $rcst_grp_p + ".bp_grp_nm10";
	public static final String $bcst_grp_lab1 = $bcst_grp_p + ".bp_grp_lab1";
	public static final String $bcst_grp_flg1 = $bcst_grp_p + ".bp_grp_flg1";
	public static final String $bcst_grp_cd1 = $bcst_grp_p + ".bp_grp_cd1";
	public static final String $bcst_grp_nm1 = $bcst_grp_p + ".bp_grp_nm1";
	public static final String $bcst_grp_lab2 = $bcst_grp_p + ".bp_grp_lab2";
	public static final String $bcst_grp_flg2 = $bcst_grp_p + ".bp_grp_flg2";
	public static final String $bcst_grp_cd2 = $bcst_grp_p + ".bp_grp_cd2";
	public static final String $bcst_grp_nm2 = $bcst_grp_p + ".bp_grp_nm2";
	public static final String $bcst_grp_lab3 = $bcst_grp_p + ".bp_grp_lab3";
	public static final String $bcst_grp_flg3 = $bcst_grp_p + ".bp_grp_flg3";
	public static final String $bcst_grp_cd3 = $bcst_grp_p + ".bp_grp_cd3";
	public static final String $bcst_grp_nm3 = $bcst_grp_p + ".bp_grp_nm3";
	public static final String $bcst_grp_lab4 = $bcst_grp_p + ".bp_grp_lab4";
	public static final String $bcst_grp_flg4 = $bcst_grp_p + ".bp_grp_flg4";
	public static final String $bcst_grp_cd4 = $bcst_grp_p + ".bp_grp_cd4";
	public static final String $bcst_grp_nm4 = $bcst_grp_p + ".bp_grp_nm4";
	public static final String $bcst_grp_lab5 = $bcst_grp_p + ".bp_grp_lab5";
	public static final String $bcst_grp_flg5 = $bcst_grp_p + ".bp_grp_flg5";
	public static final String $bcst_grp_cd5 = $bcst_grp_p + ".bp_grp_cd5";
	public static final String $bcst_grp_nm5 = $bcst_grp_p + ".bp_grp_nm5";
	public static final String $bcst_grp_lab6 = $bcst_grp_p + ".bp_grp_lab6";
	public static final String $bcst_grp_flg6 = $bcst_grp_p + ".bp_grp_flg6";
	public static final String $bcst_grp_cd6 = $bcst_grp_p + ".bp_grp_cd6";
	public static final String $bcst_grp_nm6 = $bcst_grp_p + ".bp_grp_nm6";
	public static final String $bcst_grp_lab7 = $bcst_grp_p + ".bp_grp_lab7";
	public static final String $bcst_grp_flg7 = $bcst_grp_p + ".bp_grp_flg7";
	public static final String $bcst_grp_cd7 = $bcst_grp_p + ".bp_grp_cd7";
	public static final String $bcst_grp_nm7 = $bcst_grp_p + ".bp_grp_nm7";
	public static final String $bcst_grp_lab8 = $bcst_grp_p + ".bp_grp_lab8";
	public static final String $bcst_grp_flg8 = $bcst_grp_p + ".bp_grp_flg8";
	public static final String $bcst_grp_cd8 = $bcst_grp_p + ".bp_grp_cd8";
	public static final String $bcst_grp_nm8 = $bcst_grp_p + ".bp_grp_nm8";
	public static final String $bcst_grp_lab9 = $bcst_grp_p + ".bp_grp_lab9";
	public static final String $bcst_grp_flg9 = $bcst_grp_p + ".bp_grp_flg9";
	public static final String $bcst_grp_cd9 = $bcst_grp_p + ".bp_grp_cd9";
	public static final String $bcst_grp_nm9 = $bcst_grp_p + ".bp_grp_nm9";
	public static final String $bcst_grp_lab10 = $bcst_grp_p + ".bp_grp_lab10";
	public static final String $bcst_grp_flg10 = $bcst_grp_p + ".bp_grp_flg10";
	public static final String $bcst_grp_cd10 = $bcst_grp_p + ".bp_grp_cd10";
	public static final String $bcst_grp_nm10 = $bcst_grp_p + ".bp_grp_nm10";

	public static final MCMeta rcv_dt_fr_META = createCommonMeta($rcv_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rcv_dt_to_META = createCommonMeta($rcv_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ac_dt_fr_META = createCommonMeta($ac_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ac_dt_to_META = createCommonMeta($ac_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rcst_cd_META = createCommonMeta($rcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta rcst_nm_META = createCommonMeta($rcst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bcst_cd_META = createCommonMeta($bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bcst_nm_META = createCommonMeta($bcst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta acst_cd_META = createCommonMeta($acst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta acst_nm_META = createCommonMeta($acst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
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
	public static final MCMeta wrk_no_p_META = createInnerRowMeta($wrk_no_p, mcframe.clientMSUB.MSUBP0010.WrkNoR.class);
	public static final MCMeta ar_typ_META = createCommonMeta($ar_typ, mcframe.commonMA.meta.MA_META.AR_TYP);
	public static final MCMeta ar_typ_nm_META = createCommonMeta($ar_typ_nm, mcframe.commonMA.meta.MA_META.AR_TYP_NM);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.RCV_ACT_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.RCV_ACT_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.RCV_ACT_SUB_CHAR3);
	public static final MCMeta appl_cmpl_flg_META = createCommonMeta($appl_cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta acst_grp_p_META = createInnerRowMeta($acst_grp_p, mcframe.clientMAUB.MAUBP0260.BpGrpR.class);
	public static final MCMeta rcst_grp_p_META = createInnerRowMeta($rcst_grp_p, mcframe.clientMAUB.MAUBP0260.BpGrpR.class);
	public static final MCMeta bcst_grp_p_META = createInnerRowMeta($bcst_grp_p, mcframe.clientMAUB.MAUBP0260.BpGrpR.class);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			rcv_dt_fr_META,
			rcv_dt_to_META,
			ac_dt_fr_META,
			ac_dt_to_META,
			rcst_cd_META,
			rcst_nm_META,
			bcst_cd_META,
			bcst_nm_META,
			acst_cd_META,
			acst_nm_META,
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
			wrk_no_p_META,
			ar_typ_META,
			ar_typ_nm_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			appl_cmpl_flg_META,
			acst_grp_p_META,
			rcst_grp_p_META,
			bcst_grp_p_META
		},
		new String[][]{
			{
				"wrk_no",
				"wrk_nm",
				"acst_grp_flg1",
				"acst_grp_cd1",
				"acst_grp_nm1",
				"acst_grp_flg2",
				"acst_grp_cd2",
				"acst_grp_nm2",
				"acst_grp_flg3",
				"acst_grp_cd3",
				"acst_grp_nm3",
				"acst_grp_flg4",
				"acst_grp_cd4",
				"acst_grp_nm4",
				"acst_grp_flg5",
				"acst_grp_cd5",
				"acst_grp_nm5",
				"acst_grp_flg6",
				"acst_grp_cd6",
				"acst_grp_nm6",
				"acst_grp_flg7",
				"acst_grp_cd7",
				"acst_grp_nm7",
				"acst_grp_flg8",
				"acst_grp_cd8",
				"acst_grp_nm8",
				"acst_grp_flg9",
				"acst_grp_cd9",
				"acst_grp_nm9",
				"acst_grp_flg10",
				"acst_grp_cd10",
				"acst_grp_nm10",
				"rcst_grp_flg1",
				"rcst_grp_cd1",
				"rcst_grp_nm1",
				"rcst_grp_flg2",
				"rcst_grp_cd2",
				"rcst_grp_nm2",
				"rcst_grp_flg3",
				"rcst_grp_cd3",
				"rcst_grp_nm3",
				"rcst_grp_flg4",
				"rcst_grp_cd4",
				"rcst_grp_nm4",
				"rcst_grp_flg5",
				"rcst_grp_cd5",
				"rcst_grp_nm5",
				"rcst_grp_flg6",
				"rcst_grp_cd6",
				"rcst_grp_nm6",
				"rcst_grp_flg7",
				"rcst_grp_cd7",
				"rcst_grp_nm7",
				"rcst_grp_flg8",
				"rcst_grp_cd8",
				"rcst_grp_nm8",
				"rcst_grp_flg9",
				"rcst_grp_cd9",
				"rcst_grp_nm9",
				"rcst_grp_flg10",
				"rcst_grp_cd10",
				"rcst_grp_nm10",
				"bcst_grp_flg1",
				"bcst_grp_cd1",
				"bcst_grp_nm1",
				"bcst_grp_flg2",
				"bcst_grp_cd2",
				"bcst_grp_nm2",
				"bcst_grp_flg3",
				"bcst_grp_cd3",
				"bcst_grp_nm3",
				"bcst_grp_flg4",
				"bcst_grp_cd4",
				"bcst_grp_nm4",
				"bcst_grp_flg5",
				"bcst_grp_cd5",
				"bcst_grp_nm5",
				"bcst_grp_flg6",
				"bcst_grp_cd6",
				"bcst_grp_nm6",
				"bcst_grp_flg7",
				"bcst_grp_cd7",
				"bcst_grp_nm7",
				"bcst_grp_flg8",
				"bcst_grp_cd8",
				"bcst_grp_nm8",
				"bcst_grp_flg9",
				"bcst_grp_cd9",
				"bcst_grp_nm9",
				"bcst_grp_flg10",
				"bcst_grp_cd10",
				"bcst_grp_nm10"
			},
			{
				$wrk_no,
				$wrk_nm,
				$acst_grp_flg1,
				$acst_grp_cd1,
				$acst_grp_nm1,
				$acst_grp_flg2,
				$acst_grp_cd2,
				$acst_grp_nm2,
				$acst_grp_flg3,
				$acst_grp_cd3,
				$acst_grp_nm3,
				$acst_grp_flg4,
				$acst_grp_cd4,
				$acst_grp_nm4,
				$acst_grp_flg5,
				$acst_grp_cd5,
				$acst_grp_nm5,
				$acst_grp_flg6,
				$acst_grp_cd6,
				$acst_grp_nm6,
				$acst_grp_flg7,
				$acst_grp_cd7,
				$acst_grp_nm7,
				$acst_grp_flg8,
				$acst_grp_cd8,
				$acst_grp_nm8,
				$acst_grp_flg9,
				$acst_grp_cd9,
				$acst_grp_nm9,
				$acst_grp_flg10,
				$acst_grp_cd10,
				$acst_grp_nm10,
				$rcst_grp_flg1,
				$rcst_grp_cd1,
				$rcst_grp_nm1,
				$rcst_grp_flg2,
				$rcst_grp_cd2,
				$rcst_grp_nm2,
				$rcst_grp_flg3,
				$rcst_grp_cd3,
				$rcst_grp_nm3,
				$rcst_grp_flg4,
				$rcst_grp_cd4,
				$rcst_grp_nm4,
				$rcst_grp_flg5,
				$rcst_grp_cd5,
				$rcst_grp_nm5,
				$rcst_grp_flg6,
				$rcst_grp_cd6,
				$rcst_grp_nm6,
				$rcst_grp_flg7,
				$rcst_grp_cd7,
				$rcst_grp_nm7,
				$rcst_grp_flg8,
				$rcst_grp_cd8,
				$rcst_grp_nm8,
				$rcst_grp_flg9,
				$rcst_grp_cd9,
				$rcst_grp_nm9,
				$rcst_grp_flg10,
				$rcst_grp_cd10,
				$rcst_grp_nm10,
				$bcst_grp_flg1,
				$bcst_grp_cd1,
				$bcst_grp_nm1,
				$bcst_grp_flg2,
				$bcst_grp_cd2,
				$bcst_grp_nm2,
				$bcst_grp_flg3,
				$bcst_grp_cd3,
				$bcst_grp_nm3,
				$bcst_grp_flg4,
				$bcst_grp_cd4,
				$bcst_grp_nm4,
				$bcst_grp_flg5,
				$bcst_grp_cd5,
				$bcst_grp_nm5,
				$bcst_grp_flg6,
				$bcst_grp_cd6,
				$bcst_grp_nm6,
				$bcst_grp_flg7,
				$bcst_grp_cd7,
				$bcst_grp_nm7,
				$bcst_grp_flg8,
				$bcst_grp_cd8,
				$bcst_grp_nm8,
				$bcst_grp_flg9,
				$bcst_grp_cd9,
				$bcst_grp_nm9,
				$bcst_grp_flg10,
				$bcst_grp_cd10,
				$bcst_grp_nm10
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
				{$rcst_cd, "bp_nm"},	// rcst_cd
				{$bcst_cd, "bp_nm"},	// bcst_cd
				{$acst_cd, "bp_nm"},	// acst_cd
				{$ar_dpt_cd, "dpt_nm"},	// ar_dpt_cd
				{$trd_cur_cd, "cur_nm"},	// trd_cur_cd
				{$bill_dpt_cd, "dpt_nm"}	// bill_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$rcst_cd, "MAC_BP_IS_SRCH_TYP.RCST"},	// rcst_cd
				{$bcst_cd, "MAC_BP_IS_SRCH_TYP.BCST"},	// bcst_cd
				{$acst_cd, "MAC_BP_IS_SRCH_TYP.ACST"},	// acst_cd
				{$ar_dpt_cd, "true;true;MAC_DPT_IS_SRCH_TYP.AR"},	// ar_dpt_cd
				{$bill_dpt_cd, "true;true;MAC_DPT_IS_SRCH_TYP.AR"}	// bill_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$rcst_cd, "bp_is_srch_typ"},	// rcst_cd
				{$bcst_cd, "bp_is_srch_typ"},	// bcst_cd
				{$acst_cd, "bp_is_srch_typ"},	// acst_cd
				{$ar_dpt_cd, "dpt_nm_rem_flg;mode_today_flg;dpt_is_srch_typ"},	// ar_dpt_cd
				{$bill_dpt_cd, "dpt_nm_rem_flg;mode_today_flg;dpt_is_srch_typ"}	// bill_dpt_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
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
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public String rcst_cd() {
		return getConstString(offset + 4, $rcst_cd);
	}

	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public void rcst_cd(String value) {
		setConstString(offset + 4, $rcst_cd, value);
	}


	/**
	 * Payer name 入金先名.<p>
	 *
	 */
	public String rcst_nm() {
		return getConstString(offset + 5, $rcst_nm);
	}

	/**
	 * Payer name 入金先名.<p>
	 *
	 */
	public void rcst_nm(String value) {
		setConstString(offset + 5, $rcst_nm, value);
	}


	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public String bcst_cd() {
		return getConstString(offset + 6, $bcst_cd);
	}

	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public void bcst_cd(String value) {
		setConstString(offset + 6, $bcst_cd, value);
	}


	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public String bcst_nm() {
		return getConstString(offset + 7, $bcst_nm);
	}

	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public void bcst_nm(String value) {
		setConstString(offset + 7, $bcst_nm, value);
	}


	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public String acst_cd() {
		return getConstString(offset + 8, $acst_cd);
	}

	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public void acst_cd(String value) {
		setConstString(offset + 8, $acst_cd, value);
	}


	/**
	 * AR customer name 売掛先名.<p>
	 *
	 */
	public String acst_nm() {
		return getConstString(offset + 9, $acst_nm);
	}

	/**
	 * AR customer name 売掛先名.<p>
	 *
	 */
	public void acst_nm(String value) {
		setConstString(offset + 9, $acst_nm, value);
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


	public mcframe.clientMSUB.MSUBP0010.WrkNoR wrk_no_p(){
		return (mcframe.clientMSUB.MSUBP0010.WrkNoR) getConstInnerRow(offset + 23, $wrk_no_p);
	}
	
	public void wrk_no_p(mcframe.clientMSUB.MSUBP0010.WrkNoR row){
		setConstInnerRow(offset + 23, $wrk_no_p, row);
	}


	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public String ar_typ() {
		return getConstString(offset + 24, $ar_typ);
	}

	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public void ar_typ(String value) {
		setConstString(offset + 24, $ar_typ, value);
	}


	/**
	 * AR type name 債権区分名.<p>
	 *
	 */
	public String ar_typ_nm() {
		return getConstString(offset + 25, $ar_typ_nm);
	}

	/**
	 * AR type name 債権区分名.<p>
	 *
	 */
	public void ar_typ_nm(String value) {
		setConstString(offset + 25, $ar_typ_nm, value);
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


	public mcframe.clientMAUB.MAUBP0260.BpGrpR acst_grp_p(){
		return (mcframe.clientMAUB.MAUBP0260.BpGrpR) getConstInnerRow(offset + 30, $acst_grp_p);
	}
	
	public void acst_grp_p(mcframe.clientMAUB.MAUBP0260.BpGrpR row){
		setConstInnerRow(offset + 30, $acst_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP0260.BpGrpR rcst_grp_p(){
		return (mcframe.clientMAUB.MAUBP0260.BpGrpR) getConstInnerRow(offset + 31, $rcst_grp_p);
	}
	
	public void rcst_grp_p(mcframe.clientMAUB.MAUBP0260.BpGrpR row){
		setConstInnerRow(offset + 31, $rcst_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP0260.BpGrpR bcst_grp_p(){
		return (mcframe.clientMAUB.MAUBP0260.BpGrpR) getConstInnerRow(offset + 32, $bcst_grp_p);
	}
	
	public void bcst_grp_p(mcframe.clientMAUB.MAUBP0260.BpGrpR row){
		setConstInnerRow(offset + 32, $bcst_grp_p, row);
	}


	public String getString(String name) {
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
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($acst_nm.equalsIgnoreCase(name)) {
			return acst_nm();
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
		if ($ar_typ.equalsIgnoreCase(name)) {
			return ar_typ();
		}
		if ($ar_typ_nm.equalsIgnoreCase(name)) {
			return ar_typ_nm();
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
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
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
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($acst_nm.equalsIgnoreCase(name)) {
			return acst_nm();
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
		if ($ar_typ.equalsIgnoreCase(name)) {
			return ar_typ();
		}
		if ($ar_typ_nm.equalsIgnoreCase(name)) {
			return ar_typ_nm();
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
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
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
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($acst_nm.equalsIgnoreCase(name)) {
			acst_nm(value);
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
		if ($ar_typ.equalsIgnoreCase(name)) {
			ar_typ(value);
			return;
		}
		if ($ar_typ_nm.equalsIgnoreCase(name)) {
			ar_typ_nm(value);
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
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
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
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($acst_nm.equalsIgnoreCase(name)) {
			acst_nm(value);
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
		if ($ar_typ.equalsIgnoreCase(name)) {
			ar_typ(value);
			return;
		}
		if ($ar_typ_nm.equalsIgnoreCase(name)) {
			ar_typ_nm(value);
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
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($wrk_no_p.equalsIgnoreCase(name)) {
			return wrk_no_p();
		}
		if ($acst_grp_p.equalsIgnoreCase(name)) {
			return acst_grp_p();
		}
		if ($rcst_grp_p.equalsIgnoreCase(name)) {
			return rcst_grp_p();
		}
		if ($bcst_grp_p.equalsIgnoreCase(name)) {
			return bcst_grp_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($wrk_no_p.equalsIgnoreCase(name)) {
			wrk_no_p(
				((MCContainerMeta) wrk_no_p_META).castInnerRow(mcframe.clientMSUB.MSUBP0010.WrkNoR.class, value)
			);
			return;
		}
		if ($acst_grp_p.equalsIgnoreCase(name)) {
			acst_grp_p(
				((MCContainerMeta) acst_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0260.BpGrpR.class, value)
			);
			return;
		}
		if ($rcst_grp_p.equalsIgnoreCase(name)) {
			rcst_grp_p(
				((MCContainerMeta) rcst_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0260.BpGrpR.class, value)
			);
			return;
		}
		if ($bcst_grp_p.equalsIgnoreCase(name)) {
			bcst_grp_p(
				((MCContainerMeta) bcst_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0260.BpGrpR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public String wrk_no() {
		return wrk_no_p().wrk_no();
	}

	public void wrk_no(String value) {
		wrk_no_p().wrk_no(value);
	}

	public String wrk_nm() {
		return wrk_no_p().wrk_nm();
	}

	public void wrk_nm(String value) {
		wrk_no_p().wrk_nm(value);
	}

	/**
	 * AR customer classification 1 売掛先分類１.<p>
	 *
	 */
	public boolean acst_grp_flg1() {
		return acst_grp_p().bp_grp_flg1();
	}

	/**
	 * AR customer classification 1 売掛先分類１.<p>
	 *
	 */
	public void acst_grp_flg1(boolean value) {
		acst_grp_p().bp_grp_flg1(value);
	}

	/**
	 * AR customer classification cd. 1 売掛先分類ＣＤ１.<p>
	 *
	 */
	public String acst_grp_cd1() {
		return acst_grp_p().bp_grp_cd1();
	}

	/**
	 * AR customer classification cd. 1 売掛先分類ＣＤ１.<p>
	 *
	 */
	public void acst_grp_cd1(String value) {
		acst_grp_p().bp_grp_cd1(value);
	}

	/**
	 * AR customer classification name 1 売掛先分類名１.<p>
	 *
	 */
	public String acst_grp_nm1() {
		return acst_grp_p().bp_grp_nm1();
	}

	/**
	 * AR customer classification name 1 売掛先分類名１.<p>
	 *
	 */
	public void acst_grp_nm1(String value) {
		acst_grp_p().bp_grp_nm1(value);
	}

	/**
	 * AR customer classification 2 売掛先分類２.<p>
	 *
	 */
	public boolean acst_grp_flg2() {
		return acst_grp_p().bp_grp_flg2();
	}

	/**
	 * AR customer classification 2 売掛先分類２.<p>
	 *
	 */
	public void acst_grp_flg2(boolean value) {
		acst_grp_p().bp_grp_flg2(value);
	}

	/**
	 * AR customer classification cd. 2 売掛先分類ＣＤ２.<p>
	 *
	 */
	public String acst_grp_cd2() {
		return acst_grp_p().bp_grp_cd2();
	}

	/**
	 * AR customer classification cd. 2 売掛先分類ＣＤ２.<p>
	 *
	 */
	public void acst_grp_cd2(String value) {
		acst_grp_p().bp_grp_cd2(value);
	}

	/**
	 * AR customer classification name 2 売掛先分類名２.<p>
	 *
	 */
	public String acst_grp_nm2() {
		return acst_grp_p().bp_grp_nm2();
	}

	/**
	 * AR customer classification name 2 売掛先分類名２.<p>
	 *
	 */
	public void acst_grp_nm2(String value) {
		acst_grp_p().bp_grp_nm2(value);
	}

	/**
	 * AR customer classification 3 売掛先分類３.<p>
	 *
	 */
	public boolean acst_grp_flg3() {
		return acst_grp_p().bp_grp_flg3();
	}

	/**
	 * AR customer classification 3 売掛先分類３.<p>
	 *
	 */
	public void acst_grp_flg3(boolean value) {
		acst_grp_p().bp_grp_flg3(value);
	}

	/**
	 * AR customer classification cd. 3 売掛先分類ＣＤ３.<p>
	 *
	 */
	public String acst_grp_cd3() {
		return acst_grp_p().bp_grp_cd3();
	}

	/**
	 * AR customer classification cd. 3 売掛先分類ＣＤ３.<p>
	 *
	 */
	public void acst_grp_cd3(String value) {
		acst_grp_p().bp_grp_cd3(value);
	}

	/**
	 * AR customer classification name 3 売掛先分類名３.<p>
	 *
	 */
	public String acst_grp_nm3() {
		return acst_grp_p().bp_grp_nm3();
	}

	/**
	 * AR customer classification name 3 売掛先分類名３.<p>
	 *
	 */
	public void acst_grp_nm3(String value) {
		acst_grp_p().bp_grp_nm3(value);
	}

	/**
	 * AR customer classification 4 売掛先分類４.<p>
	 *
	 */
	public boolean acst_grp_flg4() {
		return acst_grp_p().bp_grp_flg4();
	}

	/**
	 * AR customer classification 4 売掛先分類４.<p>
	 *
	 */
	public void acst_grp_flg4(boolean value) {
		acst_grp_p().bp_grp_flg4(value);
	}

	/**
	 * AR customer classification cd. 4 売掛先分類ＣＤ４.<p>
	 *
	 */
	public String acst_grp_cd4() {
		return acst_grp_p().bp_grp_cd4();
	}

	/**
	 * AR customer classification cd. 4 売掛先分類ＣＤ４.<p>
	 *
	 */
	public void acst_grp_cd4(String value) {
		acst_grp_p().bp_grp_cd4(value);
	}

	/**
	 * AR customer classification name 4 売掛先分類名４.<p>
	 *
	 */
	public String acst_grp_nm4() {
		return acst_grp_p().bp_grp_nm4();
	}

	/**
	 * AR customer classification name 4 売掛先分類名４.<p>
	 *
	 */
	public void acst_grp_nm4(String value) {
		acst_grp_p().bp_grp_nm4(value);
	}

	/**
	 * AR customer classification 5 売掛先分類５.<p>
	 *
	 */
	public boolean acst_grp_flg5() {
		return acst_grp_p().bp_grp_flg5();
	}

	/**
	 * AR customer classification 5 売掛先分類５.<p>
	 *
	 */
	public void acst_grp_flg5(boolean value) {
		acst_grp_p().bp_grp_flg5(value);
	}

	/**
	 * AR customer classification cd. 5 売掛先分類ＣＤ５.<p>
	 *
	 */
	public String acst_grp_cd5() {
		return acst_grp_p().bp_grp_cd5();
	}

	/**
	 * AR customer classification cd. 5 売掛先分類ＣＤ５.<p>
	 *
	 */
	public void acst_grp_cd5(String value) {
		acst_grp_p().bp_grp_cd5(value);
	}

	/**
	 * AR customer classification name 5 売掛先分類名５.<p>
	 *
	 */
	public String acst_grp_nm5() {
		return acst_grp_p().bp_grp_nm5();
	}

	/**
	 * AR customer classification name 5 売掛先分類名５.<p>
	 *
	 */
	public void acst_grp_nm5(String value) {
		acst_grp_p().bp_grp_nm5(value);
	}

	/**
	 * AR customer classification 6 売掛先分類６.<p>
	 *
	 */
	public boolean acst_grp_flg6() {
		return acst_grp_p().bp_grp_flg6();
	}

	/**
	 * AR customer classification 6 売掛先分類６.<p>
	 *
	 */
	public void acst_grp_flg6(boolean value) {
		acst_grp_p().bp_grp_flg6(value);
	}

	/**
	 * AR customer classification cd. 6 売掛先分類ＣＤ６.<p>
	 *
	 */
	public String acst_grp_cd6() {
		return acst_grp_p().bp_grp_cd6();
	}

	/**
	 * AR customer classification cd. 6 売掛先分類ＣＤ６.<p>
	 *
	 */
	public void acst_grp_cd6(String value) {
		acst_grp_p().bp_grp_cd6(value);
	}

	/**
	 * AR customer classification name 6 売掛先分類名６.<p>
	 *
	 */
	public String acst_grp_nm6() {
		return acst_grp_p().bp_grp_nm6();
	}

	/**
	 * AR customer classification name 6 売掛先分類名６.<p>
	 *
	 */
	public void acst_grp_nm6(String value) {
		acst_grp_p().bp_grp_nm6(value);
	}

	/**
	 * AR customer classification 7 売掛先分類７.<p>
	 *
	 */
	public boolean acst_grp_flg7() {
		return acst_grp_p().bp_grp_flg7();
	}

	/**
	 * AR customer classification 7 売掛先分類７.<p>
	 *
	 */
	public void acst_grp_flg7(boolean value) {
		acst_grp_p().bp_grp_flg7(value);
	}

	/**
	 * AR customer classification cd. 7 売掛先分類ＣＤ７.<p>
	 *
	 */
	public String acst_grp_cd7() {
		return acst_grp_p().bp_grp_cd7();
	}

	/**
	 * AR customer classification cd. 7 売掛先分類ＣＤ７.<p>
	 *
	 */
	public void acst_grp_cd7(String value) {
		acst_grp_p().bp_grp_cd7(value);
	}

	/**
	 * AR customer classification name 7 売掛先分類名７.<p>
	 *
	 */
	public String acst_grp_nm7() {
		return acst_grp_p().bp_grp_nm7();
	}

	/**
	 * AR customer classification name 7 売掛先分類名７.<p>
	 *
	 */
	public void acst_grp_nm7(String value) {
		acst_grp_p().bp_grp_nm7(value);
	}

	/**
	 * AR customer classification 8 売掛先分類８.<p>
	 *
	 */
	public boolean acst_grp_flg8() {
		return acst_grp_p().bp_grp_flg8();
	}

	/**
	 * AR customer classification 8 売掛先分類８.<p>
	 *
	 */
	public void acst_grp_flg8(boolean value) {
		acst_grp_p().bp_grp_flg8(value);
	}

	/**
	 * AR customer classification cd. 8 売掛先分類ＣＤ８.<p>
	 *
	 */
	public String acst_grp_cd8() {
		return acst_grp_p().bp_grp_cd8();
	}

	/**
	 * AR customer classification cd. 8 売掛先分類ＣＤ８.<p>
	 *
	 */
	public void acst_grp_cd8(String value) {
		acst_grp_p().bp_grp_cd8(value);
	}

	/**
	 * AR customer classification name 8 売掛先分類名８.<p>
	 *
	 */
	public String acst_grp_nm8() {
		return acst_grp_p().bp_grp_nm8();
	}

	/**
	 * AR customer classification name 8 売掛先分類名８.<p>
	 *
	 */
	public void acst_grp_nm8(String value) {
		acst_grp_p().bp_grp_nm8(value);
	}

	/**
	 * AR customer classification 9 売掛先分類９.<p>
	 *
	 */
	public boolean acst_grp_flg9() {
		return acst_grp_p().bp_grp_flg9();
	}

	/**
	 * AR customer classification 9 売掛先分類９.<p>
	 *
	 */
	public void acst_grp_flg9(boolean value) {
		acst_grp_p().bp_grp_flg9(value);
	}

	/**
	 * AR customer classification cd. 9 売掛先分類ＣＤ９.<p>
	 *
	 */
	public String acst_grp_cd9() {
		return acst_grp_p().bp_grp_cd9();
	}

	/**
	 * AR customer classification cd. 9 売掛先分類ＣＤ９.<p>
	 *
	 */
	public void acst_grp_cd9(String value) {
		acst_grp_p().bp_grp_cd9(value);
	}

	/**
	 * AR customer classification name 9 売掛先分類名９.<p>
	 *
	 */
	public String acst_grp_nm9() {
		return acst_grp_p().bp_grp_nm9();
	}

	/**
	 * AR customer classification name 9 売掛先分類名９.<p>
	 *
	 */
	public void acst_grp_nm9(String value) {
		acst_grp_p().bp_grp_nm9(value);
	}

	/**
	 * AR customer classification 10 売掛先分類１０.<p>
	 *
	 */
	public boolean acst_grp_flg10() {
		return acst_grp_p().bp_grp_flg10();
	}

	/**
	 * AR customer classification 10 売掛先分類１０.<p>
	 *
	 */
	public void acst_grp_flg10(boolean value) {
		acst_grp_p().bp_grp_flg10(value);
	}

	/**
	 * AR customer classification cd. 10 売掛先分類ＣＤ１０.<p>
	 *
	 */
	public String acst_grp_cd10() {
		return acst_grp_p().bp_grp_cd10();
	}

	/**
	 * AR customer classification cd. 10 売掛先分類ＣＤ１０.<p>
	 *
	 */
	public void acst_grp_cd10(String value) {
		acst_grp_p().bp_grp_cd10(value);
	}

	/**
	 * AR customer classification name 10 売掛先分類名１０.<p>
	 *
	 */
	public String acst_grp_nm10() {
		return acst_grp_p().bp_grp_nm10();
	}

	/**
	 * AR customer classification name 10 売掛先分類名１０.<p>
	 *
	 */
	public void acst_grp_nm10(String value) {
		acst_grp_p().bp_grp_nm10(value);
	}

	/**
	 * Payer classification 1 入金先分類１.<p>
	 *
	 */
	public boolean rcst_grp_flg1() {
		return rcst_grp_p().bp_grp_flg1();
	}

	/**
	 * Payer classification 1 入金先分類１.<p>
	 *
	 */
	public void rcst_grp_flg1(boolean value) {
		rcst_grp_p().bp_grp_flg1(value);
	}

	/**
	 * Payer classification cd. 1 入金先分類ＣＤ１.<p>
	 *
	 */
	public String rcst_grp_cd1() {
		return rcst_grp_p().bp_grp_cd1();
	}

	/**
	 * Payer classification cd. 1 入金先分類ＣＤ１.<p>
	 *
	 */
	public void rcst_grp_cd1(String value) {
		rcst_grp_p().bp_grp_cd1(value);
	}

	/**
	 * Payer classification name 1 入金先分類名１.<p>
	 *
	 */
	public String rcst_grp_nm1() {
		return rcst_grp_p().bp_grp_nm1();
	}

	/**
	 * Payer classification name 1 入金先分類名１.<p>
	 *
	 */
	public void rcst_grp_nm1(String value) {
		rcst_grp_p().bp_grp_nm1(value);
	}

	/**
	 * Payer classification 2 入金先分類２.<p>
	 *
	 */
	public boolean rcst_grp_flg2() {
		return rcst_grp_p().bp_grp_flg2();
	}

	/**
	 * Payer classification 2 入金先分類２.<p>
	 *
	 */
	public void rcst_grp_flg2(boolean value) {
		rcst_grp_p().bp_grp_flg2(value);
	}

	/**
	 * Payer classification cd. 2 入金先分類ＣＤ２.<p>
	 *
	 */
	public String rcst_grp_cd2() {
		return rcst_grp_p().bp_grp_cd2();
	}

	/**
	 * Payer classification cd. 2 入金先分類ＣＤ２.<p>
	 *
	 */
	public void rcst_grp_cd2(String value) {
		rcst_grp_p().bp_grp_cd2(value);
	}

	/**
	 * Payer classification name 2 入金先分類名２.<p>
	 *
	 */
	public String rcst_grp_nm2() {
		return rcst_grp_p().bp_grp_nm2();
	}

	/**
	 * Payer classification name 2 入金先分類名２.<p>
	 *
	 */
	public void rcst_grp_nm2(String value) {
		rcst_grp_p().bp_grp_nm2(value);
	}

	/**
	 * Payer classification 3 入金先分類３.<p>
	 *
	 */
	public boolean rcst_grp_flg3() {
		return rcst_grp_p().bp_grp_flg3();
	}

	/**
	 * Payer classification 3 入金先分類３.<p>
	 *
	 */
	public void rcst_grp_flg3(boolean value) {
		rcst_grp_p().bp_grp_flg3(value);
	}

	/**
	 * Payer classification cd. 3 入金先分類ＣＤ３.<p>
	 *
	 */
	public String rcst_grp_cd3() {
		return rcst_grp_p().bp_grp_cd3();
	}

	/**
	 * Payer classification cd. 3 入金先分類ＣＤ３.<p>
	 *
	 */
	public void rcst_grp_cd3(String value) {
		rcst_grp_p().bp_grp_cd3(value);
	}

	/**
	 * Payer classification name 3 入金先分類名３.<p>
	 *
	 */
	public String rcst_grp_nm3() {
		return rcst_grp_p().bp_grp_nm3();
	}

	/**
	 * Payer classification name 3 入金先分類名３.<p>
	 *
	 */
	public void rcst_grp_nm3(String value) {
		rcst_grp_p().bp_grp_nm3(value);
	}

	/**
	 * Payer classification 4 入金先分類４.<p>
	 *
	 */
	public boolean rcst_grp_flg4() {
		return rcst_grp_p().bp_grp_flg4();
	}

	/**
	 * Payer classification 4 入金先分類４.<p>
	 *
	 */
	public void rcst_grp_flg4(boolean value) {
		rcst_grp_p().bp_grp_flg4(value);
	}

	/**
	 * Payer classification cd. 4 入金先分類ＣＤ４.<p>
	 *
	 */
	public String rcst_grp_cd4() {
		return rcst_grp_p().bp_grp_cd4();
	}

	/**
	 * Payer classification cd. 4 入金先分類ＣＤ４.<p>
	 *
	 */
	public void rcst_grp_cd4(String value) {
		rcst_grp_p().bp_grp_cd4(value);
	}

	/**
	 * Payer classification name 4 入金先分類名４.<p>
	 *
	 */
	public String rcst_grp_nm4() {
		return rcst_grp_p().bp_grp_nm4();
	}

	/**
	 * Payer classification name 4 入金先分類名４.<p>
	 *
	 */
	public void rcst_grp_nm4(String value) {
		rcst_grp_p().bp_grp_nm4(value);
	}

	/**
	 * Payer classification 5 入金先分類５.<p>
	 *
	 */
	public boolean rcst_grp_flg5() {
		return rcst_grp_p().bp_grp_flg5();
	}

	/**
	 * Payer classification 5 入金先分類５.<p>
	 *
	 */
	public void rcst_grp_flg5(boolean value) {
		rcst_grp_p().bp_grp_flg5(value);
	}

	/**
	 * Payer classification cd. 5 入金先分類ＣＤ５.<p>
	 *
	 */
	public String rcst_grp_cd5() {
		return rcst_grp_p().bp_grp_cd5();
	}

	/**
	 * Payer classification cd. 5 入金先分類ＣＤ５.<p>
	 *
	 */
	public void rcst_grp_cd5(String value) {
		rcst_grp_p().bp_grp_cd5(value);
	}

	/**
	 * Payer classification name 5 入金先分類名５.<p>
	 *
	 */
	public String rcst_grp_nm5() {
		return rcst_grp_p().bp_grp_nm5();
	}

	/**
	 * Payer classification name 5 入金先分類名５.<p>
	 *
	 */
	public void rcst_grp_nm5(String value) {
		rcst_grp_p().bp_grp_nm5(value);
	}

	/**
	 * Payer classification 6 入金先分類６.<p>
	 *
	 */
	public boolean rcst_grp_flg6() {
		return rcst_grp_p().bp_grp_flg6();
	}

	/**
	 * Payer classification 6 入金先分類６.<p>
	 *
	 */
	public void rcst_grp_flg6(boolean value) {
		rcst_grp_p().bp_grp_flg6(value);
	}

	/**
	 * Payer classification cd. 6 入金先分類ＣＤ６.<p>
	 *
	 */
	public String rcst_grp_cd6() {
		return rcst_grp_p().bp_grp_cd6();
	}

	/**
	 * Payer classification cd. 6 入金先分類ＣＤ６.<p>
	 *
	 */
	public void rcst_grp_cd6(String value) {
		rcst_grp_p().bp_grp_cd6(value);
	}

	/**
	 * Payer classification name 6 入金先分類名６.<p>
	 *
	 */
	public String rcst_grp_nm6() {
		return rcst_grp_p().bp_grp_nm6();
	}

	/**
	 * Payer classification name 6 入金先分類名６.<p>
	 *
	 */
	public void rcst_grp_nm6(String value) {
		rcst_grp_p().bp_grp_nm6(value);
	}

	/**
	 * Payer classification 7 入金先分類７.<p>
	 *
	 */
	public boolean rcst_grp_flg7() {
		return rcst_grp_p().bp_grp_flg7();
	}

	/**
	 * Payer classification 7 入金先分類７.<p>
	 *
	 */
	public void rcst_grp_flg7(boolean value) {
		rcst_grp_p().bp_grp_flg7(value);
	}

	/**
	 * Payer classification cd. 7 入金先分類ＣＤ７.<p>
	 *
	 */
	public String rcst_grp_cd7() {
		return rcst_grp_p().bp_grp_cd7();
	}

	/**
	 * Payer classification cd. 7 入金先分類ＣＤ７.<p>
	 *
	 */
	public void rcst_grp_cd7(String value) {
		rcst_grp_p().bp_grp_cd7(value);
	}

	/**
	 * Payer classification name 7 入金先分類名７.<p>
	 *
	 */
	public String rcst_grp_nm7() {
		return rcst_grp_p().bp_grp_nm7();
	}

	/**
	 * Payer classification name 7 入金先分類名７.<p>
	 *
	 */
	public void rcst_grp_nm7(String value) {
		rcst_grp_p().bp_grp_nm7(value);
	}

	/**
	 * Payer classification 8 入金先分類８.<p>
	 *
	 */
	public boolean rcst_grp_flg8() {
		return rcst_grp_p().bp_grp_flg8();
	}

	/**
	 * Payer classification 8 入金先分類８.<p>
	 *
	 */
	public void rcst_grp_flg8(boolean value) {
		rcst_grp_p().bp_grp_flg8(value);
	}

	/**
	 * Payer classification cd. 8 入金先分類ＣＤ８.<p>
	 *
	 */
	public String rcst_grp_cd8() {
		return rcst_grp_p().bp_grp_cd8();
	}

	/**
	 * Payer classification cd. 8 入金先分類ＣＤ８.<p>
	 *
	 */
	public void rcst_grp_cd8(String value) {
		rcst_grp_p().bp_grp_cd8(value);
	}

	/**
	 * Payer classification name 8 入金先分類名８.<p>
	 *
	 */
	public String rcst_grp_nm8() {
		return rcst_grp_p().bp_grp_nm8();
	}

	/**
	 * Payer classification name 8 入金先分類名８.<p>
	 *
	 */
	public void rcst_grp_nm8(String value) {
		rcst_grp_p().bp_grp_nm8(value);
	}

	/**
	 * Payer classification 9 入金先分類９.<p>
	 *
	 */
	public boolean rcst_grp_flg9() {
		return rcst_grp_p().bp_grp_flg9();
	}

	/**
	 * Payer classification 9 入金先分類９.<p>
	 *
	 */
	public void rcst_grp_flg9(boolean value) {
		rcst_grp_p().bp_grp_flg9(value);
	}

	/**
	 * Payer classification cd. 9 入金先分類ＣＤ９.<p>
	 *
	 */
	public String rcst_grp_cd9() {
		return rcst_grp_p().bp_grp_cd9();
	}

	/**
	 * Payer classification cd. 9 入金先分類ＣＤ９.<p>
	 *
	 */
	public void rcst_grp_cd9(String value) {
		rcst_grp_p().bp_grp_cd9(value);
	}

	/**
	 * Payer classification name 9 入金先分類名９.<p>
	 *
	 */
	public String rcst_grp_nm9() {
		return rcst_grp_p().bp_grp_nm9();
	}

	/**
	 * Payer classification name 9 入金先分類名９.<p>
	 *
	 */
	public void rcst_grp_nm9(String value) {
		rcst_grp_p().bp_grp_nm9(value);
	}

	/**
	 * Payer classification 10 入金先分類１０.<p>
	 *
	 */
	public boolean rcst_grp_flg10() {
		return rcst_grp_p().bp_grp_flg10();
	}

	/**
	 * Payer classification 10 入金先分類１０.<p>
	 *
	 */
	public void rcst_grp_flg10(boolean value) {
		rcst_grp_p().bp_grp_flg10(value);
	}

	/**
	 * Payer classification cd. 10 入金先分類ＣＤ１０.<p>
	 *
	 */
	public String rcst_grp_cd10() {
		return rcst_grp_p().bp_grp_cd10();
	}

	/**
	 * Payer classification cd. 10 入金先分類ＣＤ１０.<p>
	 *
	 */
	public void rcst_grp_cd10(String value) {
		rcst_grp_p().bp_grp_cd10(value);
	}

	/**
	 * Payer classification name 10 入金先分類名１０.<p>
	 *
	 */
	public String rcst_grp_nm10() {
		return rcst_grp_p().bp_grp_nm10();
	}

	/**
	 * Payer classification name 10 入金先分類名１０.<p>
	 *
	 */
	public void rcst_grp_nm10(String value) {
		rcst_grp_p().bp_grp_nm10(value);
	}

	/**
	 * Billing customer classification 1 請求先分類１.<p>
	 *
	 */
	public boolean bcst_grp_flg1() {
		return bcst_grp_p().bp_grp_flg1();
	}

	/**
	 * Billing customer classification 1 請求先分類１.<p>
	 *
	 */
	public void bcst_grp_flg1(boolean value) {
		bcst_grp_p().bp_grp_flg1(value);
	}

	/**
	 * Billing customer classification cd. 1 請求先分類ＣＤ１.<p>
	 *
	 */
	public String bcst_grp_cd1() {
		return bcst_grp_p().bp_grp_cd1();
	}

	/**
	 * Billing customer classification cd. 1 請求先分類ＣＤ１.<p>
	 *
	 */
	public void bcst_grp_cd1(String value) {
		bcst_grp_p().bp_grp_cd1(value);
	}

	/**
	 * Billing customer classification name 1 請求先分類名１.<p>
	 *
	 */
	public String bcst_grp_nm1() {
		return bcst_grp_p().bp_grp_nm1();
	}

	/**
	 * Billing customer classification name 1 請求先分類名１.<p>
	 *
	 */
	public void bcst_grp_nm1(String value) {
		bcst_grp_p().bp_grp_nm1(value);
	}

	/**
	 * Billing customer classification 2 請求先分類２.<p>
	 *
	 */
	public boolean bcst_grp_flg2() {
		return bcst_grp_p().bp_grp_flg2();
	}

	/**
	 * Billing customer classification 2 請求先分類２.<p>
	 *
	 */
	public void bcst_grp_flg2(boolean value) {
		bcst_grp_p().bp_grp_flg2(value);
	}

	/**
	 * Billing customer classification cd. 2 請求先分類ＣＤ２.<p>
	 *
	 */
	public String bcst_grp_cd2() {
		return bcst_grp_p().bp_grp_cd2();
	}

	/**
	 * Billing customer classification cd. 2 請求先分類ＣＤ２.<p>
	 *
	 */
	public void bcst_grp_cd2(String value) {
		bcst_grp_p().bp_grp_cd2(value);
	}

	/**
	 * Billing customer classification name 2 請求先分類名２.<p>
	 *
	 */
	public String bcst_grp_nm2() {
		return bcst_grp_p().bp_grp_nm2();
	}

	/**
	 * Billing customer classification name 2 請求先分類名２.<p>
	 *
	 */
	public void bcst_grp_nm2(String value) {
		bcst_grp_p().bp_grp_nm2(value);
	}

	/**
	 * Billing customer classification 3 請求先分類３.<p>
	 *
	 */
	public boolean bcst_grp_flg3() {
		return bcst_grp_p().bp_grp_flg3();
	}

	/**
	 * Billing customer classification 3 請求先分類３.<p>
	 *
	 */
	public void bcst_grp_flg3(boolean value) {
		bcst_grp_p().bp_grp_flg3(value);
	}

	/**
	 * Billing customer classification cd. 3 請求先分類ＣＤ３.<p>
	 *
	 */
	public String bcst_grp_cd3() {
		return bcst_grp_p().bp_grp_cd3();
	}

	/**
	 * Billing customer classification cd. 3 請求先分類ＣＤ３.<p>
	 *
	 */
	public void bcst_grp_cd3(String value) {
		bcst_grp_p().bp_grp_cd3(value);
	}

	/**
	 * Billing customer classification name 3 請求先分類名３.<p>
	 *
	 */
	public String bcst_grp_nm3() {
		return bcst_grp_p().bp_grp_nm3();
	}

	/**
	 * Billing customer classification name 3 請求先分類名３.<p>
	 *
	 */
	public void bcst_grp_nm3(String value) {
		bcst_grp_p().bp_grp_nm3(value);
	}

	/**
	 * Billing customer classification 4 請求先分類４.<p>
	 *
	 */
	public boolean bcst_grp_flg4() {
		return bcst_grp_p().bp_grp_flg4();
	}

	/**
	 * Billing customer classification 4 請求先分類４.<p>
	 *
	 */
	public void bcst_grp_flg4(boolean value) {
		bcst_grp_p().bp_grp_flg4(value);
	}

	/**
	 * Billing customer classification cd. 4 請求先分類ＣＤ４.<p>
	 *
	 */
	public String bcst_grp_cd4() {
		return bcst_grp_p().bp_grp_cd4();
	}

	/**
	 * Billing customer classification cd. 4 請求先分類ＣＤ４.<p>
	 *
	 */
	public void bcst_grp_cd4(String value) {
		bcst_grp_p().bp_grp_cd4(value);
	}

	/**
	 * Billing customer classification name 4 請求先分類名４.<p>
	 *
	 */
	public String bcst_grp_nm4() {
		return bcst_grp_p().bp_grp_nm4();
	}

	/**
	 * Billing customer classification name 4 請求先分類名４.<p>
	 *
	 */
	public void bcst_grp_nm4(String value) {
		bcst_grp_p().bp_grp_nm4(value);
	}

	/**
	 * Billing customer classification 5 請求先分類５.<p>
	 *
	 */
	public boolean bcst_grp_flg5() {
		return bcst_grp_p().bp_grp_flg5();
	}

	/**
	 * Billing customer classification 5 請求先分類５.<p>
	 *
	 */
	public void bcst_grp_flg5(boolean value) {
		bcst_grp_p().bp_grp_flg5(value);
	}

	/**
	 * Billing customer classification cd. 5 請求先分類ＣＤ５.<p>
	 *
	 */
	public String bcst_grp_cd5() {
		return bcst_grp_p().bp_grp_cd5();
	}

	/**
	 * Billing customer classification cd. 5 請求先分類ＣＤ５.<p>
	 *
	 */
	public void bcst_grp_cd5(String value) {
		bcst_grp_p().bp_grp_cd5(value);
	}

	/**
	 * Billing customer classification name 5 請求先分類名５.<p>
	 *
	 */
	public String bcst_grp_nm5() {
		return bcst_grp_p().bp_grp_nm5();
	}

	/**
	 * Billing customer classification name 5 請求先分類名５.<p>
	 *
	 */
	public void bcst_grp_nm5(String value) {
		bcst_grp_p().bp_grp_nm5(value);
	}

	/**
	 * Billing customer classification 6 請求先分類６.<p>
	 *
	 */
	public boolean bcst_grp_flg6() {
		return bcst_grp_p().bp_grp_flg6();
	}

	/**
	 * Billing customer classification 6 請求先分類６.<p>
	 *
	 */
	public void bcst_grp_flg6(boolean value) {
		bcst_grp_p().bp_grp_flg6(value);
	}

	/**
	 * Billing customer classification cd. 6 請求先分類ＣＤ６.<p>
	 *
	 */
	public String bcst_grp_cd6() {
		return bcst_grp_p().bp_grp_cd6();
	}

	/**
	 * Billing customer classification cd. 6 請求先分類ＣＤ６.<p>
	 *
	 */
	public void bcst_grp_cd6(String value) {
		bcst_grp_p().bp_grp_cd6(value);
	}

	/**
	 * Billing customer classification name 6 請求先分類名６.<p>
	 *
	 */
	public String bcst_grp_nm6() {
		return bcst_grp_p().bp_grp_nm6();
	}

	/**
	 * Billing customer classification name 6 請求先分類名６.<p>
	 *
	 */
	public void bcst_grp_nm6(String value) {
		bcst_grp_p().bp_grp_nm6(value);
	}

	/**
	 * Billing customer classification 7 請求先分類７.<p>
	 *
	 */
	public boolean bcst_grp_flg7() {
		return bcst_grp_p().bp_grp_flg7();
	}

	/**
	 * Billing customer classification 7 請求先分類７.<p>
	 *
	 */
	public void bcst_grp_flg7(boolean value) {
		bcst_grp_p().bp_grp_flg7(value);
	}

	/**
	 * Billing customer classification cd. 7 請求先分類ＣＤ７.<p>
	 *
	 */
	public String bcst_grp_cd7() {
		return bcst_grp_p().bp_grp_cd7();
	}

	/**
	 * Billing customer classification cd. 7 請求先分類ＣＤ７.<p>
	 *
	 */
	public void bcst_grp_cd7(String value) {
		bcst_grp_p().bp_grp_cd7(value);
	}

	/**
	 * Billing customer classification name 7 請求先分類名７.<p>
	 *
	 */
	public String bcst_grp_nm7() {
		return bcst_grp_p().bp_grp_nm7();
	}

	/**
	 * Billing customer classification name 7 請求先分類名７.<p>
	 *
	 */
	public void bcst_grp_nm7(String value) {
		bcst_grp_p().bp_grp_nm7(value);
	}

	/**
	 * Billing customer classification 8 請求先分類８.<p>
	 *
	 */
	public boolean bcst_grp_flg8() {
		return bcst_grp_p().bp_grp_flg8();
	}

	/**
	 * Billing customer classification 8 請求先分類８.<p>
	 *
	 */
	public void bcst_grp_flg8(boolean value) {
		bcst_grp_p().bp_grp_flg8(value);
	}

	/**
	 * Billing customer classification cd. 8 請求先分類ＣＤ８.<p>
	 *
	 */
	public String bcst_grp_cd8() {
		return bcst_grp_p().bp_grp_cd8();
	}

	/**
	 * Billing customer classification cd. 8 請求先分類ＣＤ８.<p>
	 *
	 */
	public void bcst_grp_cd8(String value) {
		bcst_grp_p().bp_grp_cd8(value);
	}

	/**
	 * Billing customer classification name 8 請求先分類名８.<p>
	 *
	 */
	public String bcst_grp_nm8() {
		return bcst_grp_p().bp_grp_nm8();
	}

	/**
	 * Billing customer classification name 8 請求先分類名８.<p>
	 *
	 */
	public void bcst_grp_nm8(String value) {
		bcst_grp_p().bp_grp_nm8(value);
	}

	/**
	 * Billing customer classification 9 請求先分類９.<p>
	 *
	 */
	public boolean bcst_grp_flg9() {
		return bcst_grp_p().bp_grp_flg9();
	}

	/**
	 * Billing customer classification 9 請求先分類９.<p>
	 *
	 */
	public void bcst_grp_flg9(boolean value) {
		bcst_grp_p().bp_grp_flg9(value);
	}

	/**
	 * Billing customer classification cd. 9 請求先分類ＣＤ９.<p>
	 *
	 */
	public String bcst_grp_cd9() {
		return bcst_grp_p().bp_grp_cd9();
	}

	/**
	 * Billing customer classification cd. 9 請求先分類ＣＤ９.<p>
	 *
	 */
	public void bcst_grp_cd9(String value) {
		bcst_grp_p().bp_grp_cd9(value);
	}

	/**
	 * Billing customer classification name 9 請求先分類名９.<p>
	 *
	 */
	public String bcst_grp_nm9() {
		return bcst_grp_p().bp_grp_nm9();
	}

	/**
	 * Billing customer classification name 9 請求先分類名９.<p>
	 *
	 */
	public void bcst_grp_nm9(String value) {
		bcst_grp_p().bp_grp_nm9(value);
	}

	/**
	 * Billing customer classification 10 請求先分類１０.<p>
	 *
	 */
	public boolean bcst_grp_flg10() {
		return bcst_grp_p().bp_grp_flg10();
	}

	/**
	 * Billing customer classification 10 請求先分類１０.<p>
	 *
	 */
	public void bcst_grp_flg10(boolean value) {
		bcst_grp_p().bp_grp_flg10(value);
	}

	/**
	 * Billing customer classification cd. 10 請求先分類ＣＤ１０.<p>
	 *
	 */
	public String bcst_grp_cd10() {
		return bcst_grp_p().bp_grp_cd10();
	}

	/**
	 * Billing customer classification cd. 10 請求先分類ＣＤ１０.<p>
	 *
	 */
	public void bcst_grp_cd10(String value) {
		bcst_grp_p().bp_grp_cd10(value);
	}

	/**
	 * Billing customer classification name 10 請求先分類名１０.<p>
	 *
	 */
	public String bcst_grp_nm10() {
		return bcst_grp_p().bp_grp_nm10();
	}

	/**
	 * Billing customer classification name 10 請求先分類名１０.<p>
	 *
	 */
	public void bcst_grp_nm10(String value) {
		bcst_grp_p().bp_grp_nm10(value);
	}

}

