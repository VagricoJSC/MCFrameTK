package mcframe.clientMSBG.MSBGP0250;

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
	 * PRNT,Issue report;REF,View PRNT,帳票発行する;REF,参照する.<p>
	 *
	 */
	public static final String $ope = "ope";
	/**
	 * AR reconciliation entry 売掛消込登録.<p>
	 *
	 */
	public static final String $ar_appl_flg = "ar_appl_flg";
	/**
	 * Advance/suspense received entry 前受仮受登録.<p>
	 *
	 */
	public static final String $susp_adv_flg = "susp_adv_flg";
	/**
	 * Transfer 振替.<p>
	 *
	 */
	public static final String $sw_flg = "sw_flg";
	/**
	 * Tax variance 消費税差額.<p>
	 *
	 */
	public static final String $tax_diff_flg = "tax_diff_flg";
	/**
	 * Unissued 未発行.<p>
	 *
	 */
	public static final String $not_prnt_flg = "not_prnt_flg";
	/**
	 * Issued 発行済.<p>
	 *
	 */
	public static final String $prnt_flg = "prnt_flg";
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
	 * Transfer cd. 振替先ＣＤ.<p>
	 *
	 */
	public static final String $sw_to_bcst_cd = "sw_to_bcst_cd";
	/**
	 * Transfer name 振替先名.<p>
	 *
	 */
	public static final String $sw_to_bcst_nm = "sw_to_bcst_nm";
	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public static final String $usr_cd = "usr_cd";
	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public static final String $usr_nm = "usr_nm";
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public static final String $dpt_cd = "dpt_cd";
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public static final String $dpt_nm = "dpt_nm";
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
	 * Payment received No. 入金ＮＯ.<p>
	 *
	 */
	public static final String $rcv_no = "rcv_no";
	/**
	 * Note number 手形番号.<p>
	 *
	 */
	public static final String $note_no = "note_no";
	/**
	 * Transfer payment received result No. 振替先入金実績ＮＯ.<p>
	 *
	 */
	public static final String $sw_to_rcv_act_no = "sw_to_rcv_act_no";
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
	public static final String $cur_cd = "cur_cd";
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public static final String $cur_nm = "cur_nm";
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
	 * Source incoming payment result No. 発生入金ＮＯ.<p>
	 *
	 */
	public static final String $gen_rcv_no = "gen_rcv_no";
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
	 * Include invalid/cancel 無効・取消含む.<p>
	 *
	 */
	public static final String $can_flg = "can_flg";
	/**
	 * Auto-reconciliation only 入金自動消込のみ.<p>
	 *
	 */
	public static final String $rcv_auto_appl_flg = "rcv_auto_appl_flg";
	public static final String $rcst_grp_p = "rcst_grp_p";
	public static final String $bcst_grp_p = "bcst_grp_p";

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

	public static final MCMeta ope_META = createStringMeta($ope);
	public static final MCMeta ar_appl_flg_META = createCommonMeta($ar_appl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta susp_adv_flg_META = createCommonMeta($susp_adv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sw_flg_META = createCommonMeta($sw_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tax_diff_flg_META = createCommonMeta($tax_diff_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_prnt_flg_META = createCommonMeta($not_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prnt_flg_META = createCommonMeta($prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcv_dt_fr_META = createCommonMeta($rcv_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rcv_dt_to_META = createCommonMeta($rcv_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ac_dt_fr_META = createCommonMeta($ac_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ac_dt_to_META = createCommonMeta($ac_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rcst_cd_META = createCommonMeta($rcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta rcst_nm_META = createCommonMeta($rcst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bcst_cd_META = createCommonMeta($bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bcst_nm_META = createCommonMeta($bcst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta sw_to_bcst_cd_META = createCommonMeta($sw_to_bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sw_to_bcst_nm_META = createCommonMeta($sw_to_bcst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta usr_cd_META = createCommonMeta($usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta usr_nm_META = createCommonMeta($usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta dpt_nm_META = createCommonMeta($dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta trd_rmrks_META = createCommonMeta($trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta rcv_act_no_META = createCommonMeta($rcv_act_no, mcframe.commonMA.meta.MA_META.RCV_ACT_NO);
	public static final MCMeta rcv_no_META = createCommonMeta($rcv_no, mcframe.commonMA.meta.MA_META.RCV_NO);
	public static final MCMeta note_no_META = createCommonMeta($note_no, mcframe.commonMA.meta.MA_META.NOTE_NO);
	public static final MCMeta sw_to_rcv_act_no_META = createCommonMeta($sw_to_rcv_act_no, mcframe.commonMA.meta.MA_META.RCV_ACT_NO);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_nm_META = createCommonMeta($trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta cur_nm_META = createCommonMeta($cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta bill_dpt_cd_META = createCommonMeta($bill_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bill_dpt_nm_META = createCommonMeta($bill_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta gen_rcv_no_META = createCommonMeta($gen_rcv_no, mcframe.commonMA.meta.MA_META.RCV_NO);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.RCV_ACT_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.RCV_ACT_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.RCV_ACT_SUB_CHAR3);
	public static final MCMeta can_flg_META = createCommonMeta($can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcv_auto_appl_flg_META = createCommonMeta($rcv_auto_appl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcst_grp_p_META = createInnerRowMeta($rcst_grp_p, mcframe.clientMAUB.MAUBP0260.BpGrpR.class);
	public static final MCMeta bcst_grp_p_META = createInnerRowMeta($bcst_grp_p, mcframe.clientMAUB.MAUBP0260.BpGrpR.class);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			ar_appl_flg_META,
			susp_adv_flg_META,
			sw_flg_META,
			tax_diff_flg_META,
			not_prnt_flg_META,
			prnt_flg_META,
			rcv_dt_fr_META,
			rcv_dt_to_META,
			ac_dt_fr_META,
			ac_dt_to_META,
			rcst_cd_META,
			rcst_nm_META,
			bcst_cd_META,
			bcst_nm_META,
			sw_to_bcst_cd_META,
			sw_to_bcst_nm_META,
			usr_cd_META,
			usr_nm_META,
			dpt_cd_META,
			dpt_nm_META,
			wg_cd_META,
			wg_nm_META,
			trd_rmrks_META,
			rcv_act_no_META,
			rcv_no_META,
			note_no_META,
			sw_to_rcv_act_no_META,
			trd_cd_META,
			trd_nm_META,
			cur_cd_META,
			cur_nm_META,
			bill_dpt_cd_META,
			bill_dpt_nm_META,
			gen_rcv_no_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			can_flg_META,
			rcv_auto_appl_flg_META,
			rcst_grp_p_META,
			bcst_grp_p_META
		},
		new String[][]{
			{
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
				{$sw_to_bcst_cd, "bp_nm"},	// sw_to_bcst_cd
				{$usr_cd, "usr_nm"},	// usr_cd
				{$bill_dpt_cd, "dpt_nm"}	// bill_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$rcst_cd, "MAC_BP_IS_SRCH_TYP.RCST"},	// rcst_cd
				{$bcst_cd, "MAC_BP_IS_SRCH_TYP.BCST"},	// bcst_cd
				{$sw_to_bcst_cd, "MAC_BP_IS_SRCH_TYP.BCST"},	// sw_to_bcst_cd
				{$dpt_cd, "true;true;MAC_DPT_IS_SRCH_TYP.AR"},	// dpt_cd
				{$bill_dpt_cd, "true;true;MAC_DPT_IS_SRCH_TYP.AR"}	// bill_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$rcst_cd, "bp_is_srch_typ"},	// rcst_cd
				{$bcst_cd, "bp_is_srch_typ"},	// bcst_cd
				{$sw_to_bcst_cd, "bp_is_srch_typ"},	// sw_to_bcst_cd
				{$dpt_cd, "dpt_nm_rem_flg;mode_today_flg;dpt_is_srch_typ"},	// dpt_cd
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
	 * PRNT,Issue report;REF,View PRNT,帳票発行する;REF,参照する.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * PRNT,Issue report;REF,View PRNT,帳票発行する;REF,参照する.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	/**
	 * AR reconciliation entry 売掛消込登録.<p>
	 *
	 */
	public boolean ar_appl_flg() {
		return getConstBoolean(offset + 1, $ar_appl_flg);
	}

	/**
	 * AR reconciliation entry 売掛消込登録.<p>
	 *
	 */
	public void ar_appl_flg(boolean value) {
		setConstBoolean(offset + 1, $ar_appl_flg, value);
	}


	/**
	 * Advance/suspense received entry 前受仮受登録.<p>
	 *
	 */
	public boolean susp_adv_flg() {
		return getConstBoolean(offset + 2, $susp_adv_flg);
	}

	/**
	 * Advance/suspense received entry 前受仮受登録.<p>
	 *
	 */
	public void susp_adv_flg(boolean value) {
		setConstBoolean(offset + 2, $susp_adv_flg, value);
	}


	/**
	 * Transfer 振替.<p>
	 *
	 */
	public boolean sw_flg() {
		return getConstBoolean(offset + 3, $sw_flg);
	}

	/**
	 * Transfer 振替.<p>
	 *
	 */
	public void sw_flg(boolean value) {
		setConstBoolean(offset + 3, $sw_flg, value);
	}


	/**
	 * Tax variance 消費税差額.<p>
	 *
	 */
	public boolean tax_diff_flg() {
		return getConstBoolean(offset + 4, $tax_diff_flg);
	}

	/**
	 * Tax variance 消費税差額.<p>
	 *
	 */
	public void tax_diff_flg(boolean value) {
		setConstBoolean(offset + 4, $tax_diff_flg, value);
	}


	/**
	 * Unissued 未発行.<p>
	 *
	 */
	public boolean not_prnt_flg() {
		return getConstBoolean(offset + 5, $not_prnt_flg);
	}

	/**
	 * Unissued 未発行.<p>
	 *
	 */
	public void not_prnt_flg(boolean value) {
		setConstBoolean(offset + 5, $not_prnt_flg, value);
	}


	/**
	 * Issued 発行済.<p>
	 *
	 */
	public boolean prnt_flg() {
		return getConstBoolean(offset + 6, $prnt_flg);
	}

	/**
	 * Issued 発行済.<p>
	 *
	 */
	public void prnt_flg(boolean value) {
		setConstBoolean(offset + 6, $prnt_flg, value);
	}


	/**
	 * Payment received date FROM 入金日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate rcv_dt_fr() {
		return getConstDate(offset + 7, $rcv_dt_fr);
	}

	/**
	 * Payment received date FROM 入金日ＦＲＯＭ.<p>
	 *
	 */
	public void rcv_dt_fr(MCDate value) {
		setConstDate(offset + 7, $rcv_dt_fr, value);
	}


	/**
	 * Payment received date 入金日ＴＯ.<p>
	 *
	 */
	public MCDate rcv_dt_to() {
		return getConstDate(offset + 8, $rcv_dt_to);
	}

	/**
	 * Payment received date 入金日ＴＯ.<p>
	 *
	 */
	public void rcv_dt_to(MCDate value) {
		setConstDate(offset + 8, $rcv_dt_to, value);
	}


	/**
	 * Recording date FROM 計上日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ac_dt_fr() {
		return getConstDate(offset + 9, $ac_dt_fr);
	}

	/**
	 * Recording date FROM 計上日ＦＲＯＭ.<p>
	 *
	 */
	public void ac_dt_fr(MCDate value) {
		setConstDate(offset + 9, $ac_dt_fr, value);
	}


	/**
	 * Recording date TO 計上日ＴＯ.<p>
	 *
	 */
	public MCDate ac_dt_to() {
		return getConstDate(offset + 10, $ac_dt_to);
	}

	/**
	 * Recording date TO 計上日ＴＯ.<p>
	 *
	 */
	public void ac_dt_to(MCDate value) {
		setConstDate(offset + 10, $ac_dt_to, value);
	}


	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public String rcst_cd() {
		return getConstString(offset + 11, $rcst_cd);
	}

	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public void rcst_cd(String value) {
		setConstString(offset + 11, $rcst_cd, value);
	}


	/**
	 * Payer name 入金先名.<p>
	 *
	 */
	public String rcst_nm() {
		return getConstString(offset + 12, $rcst_nm);
	}

	/**
	 * Payer name 入金先名.<p>
	 *
	 */
	public void rcst_nm(String value) {
		setConstString(offset + 12, $rcst_nm, value);
	}


	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public String bcst_cd() {
		return getConstString(offset + 13, $bcst_cd);
	}

	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public void bcst_cd(String value) {
		setConstString(offset + 13, $bcst_cd, value);
	}


	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public String bcst_nm() {
		return getConstString(offset + 14, $bcst_nm);
	}

	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public void bcst_nm(String value) {
		setConstString(offset + 14, $bcst_nm, value);
	}


	/**
	 * Transfer cd. 振替先ＣＤ.<p>
	 *
	 */
	public String sw_to_bcst_cd() {
		return getConstString(offset + 15, $sw_to_bcst_cd);
	}

	/**
	 * Transfer cd. 振替先ＣＤ.<p>
	 *
	 */
	public void sw_to_bcst_cd(String value) {
		setConstString(offset + 15, $sw_to_bcst_cd, value);
	}


	/**
	 * Transfer name 振替先名.<p>
	 *
	 */
	public String sw_to_bcst_nm() {
		return getConstString(offset + 16, $sw_to_bcst_nm);
	}

	/**
	 * Transfer name 振替先名.<p>
	 *
	 */
	public void sw_to_bcst_nm(String value) {
		setConstString(offset + 16, $sw_to_bcst_nm, value);
	}


	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public String usr_cd() {
		return getConstString(offset + 17, $usr_cd);
	}

	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public void usr_cd(String value) {
		setConstString(offset + 17, $usr_cd, value);
	}


	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public String usr_nm() {
		return getConstString(offset + 18, $usr_nm);
	}

	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public void usr_nm(String value) {
		setConstString(offset + 18, $usr_nm, value);
	}


	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 19, $dpt_cd);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 19, $dpt_cd, value);
	}


	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public String dpt_nm() {
		return getConstString(offset + 20, $dpt_nm);
	}

	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public void dpt_nm(String value) {
		setConstString(offset + 20, $dpt_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 21, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 21, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 22, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 22, $wg_nm, value);
	}


	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return getConstString(offset + 23, $trd_rmrks);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		setConstString(offset + 23, $trd_rmrks, value);
	}


	/**
	 * Payment received result No. 入金実績ＮＯ.<p>
	 *
	 */
	public String rcv_act_no() {
		return getConstString(offset + 24, $rcv_act_no);
	}

	/**
	 * Payment received result No. 入金実績ＮＯ.<p>
	 *
	 */
	public void rcv_act_no(String value) {
		setConstString(offset + 24, $rcv_act_no, value);
	}


	/**
	 * Payment received No. 入金ＮＯ.<p>
	 *
	 */
	public String rcv_no() {
		return getConstString(offset + 25, $rcv_no);
	}

	/**
	 * Payment received No. 入金ＮＯ.<p>
	 *
	 */
	public void rcv_no(String value) {
		setConstString(offset + 25, $rcv_no, value);
	}


	/**
	 * Note number 手形番号.<p>
	 *
	 */
	public String note_no() {
		return getConstString(offset + 26, $note_no);
	}

	/**
	 * Note number 手形番号.<p>
	 *
	 */
	public void note_no(String value) {
		setConstString(offset + 26, $note_no, value);
	}


	/**
	 * Transfer payment received result No. 振替先入金実績ＮＯ.<p>
	 *
	 */
	public String sw_to_rcv_act_no() {
		return getConstString(offset + 27, $sw_to_rcv_act_no);
	}

	/**
	 * Transfer payment received result No. 振替先入金実績ＮＯ.<p>
	 *
	 */
	public void sw_to_rcv_act_no(String value) {
		setConstString(offset + 27, $sw_to_rcv_act_no, value);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 28, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 28, $trd_cd, value);
	}


	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 29, $trd_nm);
	}

	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 29, $trd_nm, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 30, $cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 30, $cur_cd, value);
	}


	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public String cur_nm() {
		return getConstString(offset + 31, $cur_nm);
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public void cur_nm(String value) {
		setConstString(offset + 31, $cur_nm, value);
	}


	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public String bill_dpt_cd() {
		return getConstString(offset + 32, $bill_dpt_cd);
	}

	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public void bill_dpt_cd(String value) {
		setConstString(offset + 32, $bill_dpt_cd, value);
	}


	/**
	 * Billing dept. name 請求部門名.<p>
	 *
	 */
	public String bill_dpt_nm() {
		return getConstString(offset + 33, $bill_dpt_nm);
	}

	/**
	 * Billing dept. name 請求部門名.<p>
	 *
	 */
	public void bill_dpt_nm(String value) {
		setConstString(offset + 33, $bill_dpt_nm, value);
	}


	/**
	 * Source incoming payment result No. 発生入金ＮＯ.<p>
	 *
	 */
	public String gen_rcv_no() {
		return getConstString(offset + 34, $gen_rcv_no);
	}

	/**
	 * Source incoming payment result No. 発生入金ＮＯ.<p>
	 *
	 */
	public void gen_rcv_no(String value) {
		setConstString(offset + 34, $gen_rcv_no, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 35, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 35, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 36, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 36, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 37, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 37, $sub_char3, value);
	}


	/**
	 * Include invalid/cancel 無効・取消含む.<p>
	 *
	 */
	public boolean can_flg() {
		return getConstBoolean(offset + 38, $can_flg);
	}

	/**
	 * Include invalid/cancel 無効・取消含む.<p>
	 *
	 */
	public void can_flg(boolean value) {
		setConstBoolean(offset + 38, $can_flg, value);
	}


	/**
	 * Auto-reconciliation only 入金自動消込のみ.<p>
	 *
	 */
	public boolean rcv_auto_appl_flg() {
		return getConstBoolean(offset + 39, $rcv_auto_appl_flg);
	}

	/**
	 * Auto-reconciliation only 入金自動消込のみ.<p>
	 *
	 */
	public void rcv_auto_appl_flg(boolean value) {
		setConstBoolean(offset + 39, $rcv_auto_appl_flg, value);
	}


	public mcframe.clientMAUB.MAUBP0260.BpGrpR rcst_grp_p(){
		return (mcframe.clientMAUB.MAUBP0260.BpGrpR) getConstInnerRow(offset + 40, $rcst_grp_p);
	}
	
	public void rcst_grp_p(mcframe.clientMAUB.MAUBP0260.BpGrpR row){
		setConstInnerRow(offset + 40, $rcst_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP0260.BpGrpR bcst_grp_p(){
		return (mcframe.clientMAUB.MAUBP0260.BpGrpR) getConstInnerRow(offset + 41, $bcst_grp_p);
	}
	
	public void bcst_grp_p(mcframe.clientMAUB.MAUBP0260.BpGrpR row){
		setConstInnerRow(offset + 41, $bcst_grp_p, row);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
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
		if ($sw_to_bcst_cd.equalsIgnoreCase(name)) {
			return sw_to_bcst_cd();
		}
		if ($sw_to_bcst_nm.equalsIgnoreCase(name)) {
			return sw_to_bcst_nm();
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			return usr_nm();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
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
		if ($rcv_no.equalsIgnoreCase(name)) {
			return rcv_no();
		}
		if ($note_no.equalsIgnoreCase(name)) {
			return note_no();
		}
		if ($sw_to_rcv_act_no.equalsIgnoreCase(name)) {
			return sw_to_rcv_act_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($bill_dpt_nm.equalsIgnoreCase(name)) {
			return bill_dpt_nm();
		}
		if ($gen_rcv_no.equalsIgnoreCase(name)) {
			return gen_rcv_no();
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
		if ($ar_appl_flg.equalsIgnoreCase(name)) {
			return ar_appl_flg();
		}
		if ($susp_adv_flg.equalsIgnoreCase(name)) {
			return susp_adv_flg();
		}
		if ($sw_flg.equalsIgnoreCase(name)) {
			return sw_flg();
		}
		if ($tax_diff_flg.equalsIgnoreCase(name)) {
			return tax_diff_flg();
		}
		if ($not_prnt_flg.equalsIgnoreCase(name)) {
			return not_prnt_flg();
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			return prnt_flg();
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
		}
		if ($rcv_auto_appl_flg.equalsIgnoreCase(name)) {
			return rcv_auto_appl_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
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
		if ($sw_to_bcst_cd.equalsIgnoreCase(name)) {
			return sw_to_bcst_cd();
		}
		if ($sw_to_bcst_nm.equalsIgnoreCase(name)) {
			return sw_to_bcst_nm();
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			return usr_nm();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
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
		if ($rcv_no.equalsIgnoreCase(name)) {
			return rcv_no();
		}
		if ($note_no.equalsIgnoreCase(name)) {
			return note_no();
		}
		if ($sw_to_rcv_act_no.equalsIgnoreCase(name)) {
			return sw_to_rcv_act_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($bill_dpt_nm.equalsIgnoreCase(name)) {
			return bill_dpt_nm();
		}
		if ($gen_rcv_no.equalsIgnoreCase(name)) {
			return gen_rcv_no();
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
		if ($ar_appl_flg.equalsIgnoreCase(name)) {
			return ar_appl_flg();
		}
		if ($susp_adv_flg.equalsIgnoreCase(name)) {
			return susp_adv_flg();
		}
		if ($sw_flg.equalsIgnoreCase(name)) {
			return sw_flg();
		}
		if ($tax_diff_flg.equalsIgnoreCase(name)) {
			return tax_diff_flg();
		}
		if ($not_prnt_flg.equalsIgnoreCase(name)) {
			return not_prnt_flg();
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			return prnt_flg();
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
		}
		if ($rcv_auto_appl_flg.equalsIgnoreCase(name)) {
			return rcv_auto_appl_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
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
		if ($sw_to_bcst_cd.equalsIgnoreCase(name)) {
			sw_to_bcst_cd(value);
			return;
		}
		if ($sw_to_bcst_nm.equalsIgnoreCase(name)) {
			sw_to_bcst_nm(value);
			return;
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			usr_nm(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
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
		if ($rcv_no.equalsIgnoreCase(name)) {
			rcv_no(value);
			return;
		}
		if ($note_no.equalsIgnoreCase(name)) {
			note_no(value);
			return;
		}
		if ($sw_to_rcv_act_no.equalsIgnoreCase(name)) {
			sw_to_rcv_act_no(value);
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
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			cur_nm(value);
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
		if ($gen_rcv_no.equalsIgnoreCase(name)) {
			gen_rcv_no(value);
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
		if ($ar_appl_flg.equalsIgnoreCase(name)) {
			ar_appl_flg(value);
			return;
		}
		if ($susp_adv_flg.equalsIgnoreCase(name)) {
			susp_adv_flg(value);
			return;
		}
		if ($sw_flg.equalsIgnoreCase(name)) {
			sw_flg(value);
			return;
		}
		if ($tax_diff_flg.equalsIgnoreCase(name)) {
			tax_diff_flg(value);
			return;
		}
		if ($not_prnt_flg.equalsIgnoreCase(name)) {
			not_prnt_flg(value);
			return;
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			prnt_flg(value);
			return;
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			can_flg(value);
			return;
		}
		if ($rcv_auto_appl_flg.equalsIgnoreCase(name)) {
			rcv_auto_appl_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
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
		if ($sw_to_bcst_cd.equalsIgnoreCase(name)) {
			sw_to_bcst_cd(value);
			return;
		}
		if ($sw_to_bcst_nm.equalsIgnoreCase(name)) {
			sw_to_bcst_nm(value);
			return;
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			usr_nm(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
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
		if ($rcv_no.equalsIgnoreCase(name)) {
			rcv_no(value);
			return;
		}
		if ($note_no.equalsIgnoreCase(name)) {
			note_no(value);
			return;
		}
		if ($sw_to_rcv_act_no.equalsIgnoreCase(name)) {
			sw_to_rcv_act_no(value);
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
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			cur_nm(value);
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
		if ($gen_rcv_no.equalsIgnoreCase(name)) {
			gen_rcv_no(value);
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
		if ($ar_appl_flg.equalsIgnoreCase(name)) {
			ar_appl_flg(value);
			return;
		}
		if ($susp_adv_flg.equalsIgnoreCase(name)) {
			susp_adv_flg(value);
			return;
		}
		if ($sw_flg.equalsIgnoreCase(name)) {
			sw_flg(value);
			return;
		}
		if ($tax_diff_flg.equalsIgnoreCase(name)) {
			tax_diff_flg(value);
			return;
		}
		if ($not_prnt_flg.equalsIgnoreCase(name)) {
			not_prnt_flg(value);
			return;
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			prnt_flg(value);
			return;
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			can_flg(value);
			return;
		}
		if ($rcv_auto_appl_flg.equalsIgnoreCase(name)) {
			rcv_auto_appl_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($rcst_grp_p.equalsIgnoreCase(name)) {
			return rcst_grp_p();
		}
		if ($bcst_grp_p.equalsIgnoreCase(name)) {
			return bcst_grp_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
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

