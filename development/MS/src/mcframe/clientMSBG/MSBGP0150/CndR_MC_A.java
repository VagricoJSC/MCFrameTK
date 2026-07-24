package mcframe.clientMSBG.MSBGP0150;

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
	 * PRNT,Issue report,0;REF,View,1 PRNT,帳票発行する,0;REF,参照する,1.<p>
	 *
	 */
	public static final String $ope = "ope";
	/**
	 * Operation type 操作種別.<p>
	 *
	 */
	public static final String $scr_ope_flg = "scr_ope_flg";
	/**
	 * Payment received 入金.<p>
	 *
	 */
	public static final String $rcv_flg = "rcv_flg";
	/**
	 * Suspense received 仮受金.<p>
	 *
	 */
	public static final String $susp_flg = "susp_flg";
	/**
	 * Advance received 前受金.<p>
	 *
	 */
	public static final String $adv_flg = "adv_flg";
	/**
	 * AP amount offset 買掛金相殺.<p>
	 *
	 */
	public static final String $ap_flg = "ap_flg";
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
	 * Target 対象.<p>
	 *
	 */
	public static final String $fb_t_flg = "fb_t_flg";
	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public static final String $fb_f_flg = "fb_f_flg";
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
	 * Payment received PIC cd. 入金担当者ＣＤ.<p>
	 *
	 */
	public static final String $rcv_usr_cd = "rcv_usr_cd";
	/**
	 * Payment received PIC name 入金担当者名.<p>
	 *
	 */
	public static final String $rcv_usr_nm = "rcv_usr_nm";
	/**
	 * Payment receiving dept. cd. 入金部門ＣＤ.<p>
	 *
	 */
	public static final String $rcv_dpt_cd = "rcv_dpt_cd";
	/**
	 * Payment receiving dept. name 入金部門名.<p>
	 *
	 */
	public static final String $rcv_dpt_nm = "rcv_dpt_nm";
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
	 * Payment received remarks 入金備考.<p>
	 *
	 */
	public static final String $rcv_rmrks = "rcv_rmrks";
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
	 * Payment result No. 支払実績ＮＯ.<p>
	 *
	 */
	public static final String $pay_act_no = "pay_act_no";
	/**
	 * Payment received method cd. 入金方法ＣＤ.<p>
	 *
	 */
	public static final String $rcv_mtd_cd = "rcv_mtd_cd";
	/**
	 * Payment received method name 入金方法名.<p>
	 *
	 */
	public static final String $rcv_mtd_nm = "rcv_mtd_nm";
	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public static final String $bank_ac_cd = "bank_ac_cd";
	/**
	 * Bank account name 口座名.<p>
	 *
	 */
	public static final String $bank_ac_nm = "bank_ac_nm";
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
	 * Auto-reconciliation status type 自動消込状況区分.<p>
	 *
	 */
	public static final String $auto_appl_sts_typ = "auto_appl_sts_typ";
	/**
	 * Auto-reconciliation status type name 自動消込状況区分名.<p>
	 *
	 */
	public static final String $auto_appl_sts_typ_nm = "auto_appl_sts_typ_nm";
	/**
	 * IF payment received No. ＩＦ入金ＮＯ.<p>
	 *
	 */
	public static final String $if_rcv_no = "if_rcv_no";
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
	 * Include processed 処理済含む.<p>
	 *
	 */
	public static final String $proc_flg = "proc_flg";
	public static final String $rcv_grp = "rcv_grp";
	public static final String $bill_grp = "bill_grp";

	public static final String $rcv_grp_lab1 = $rcv_grp + ".bp_grp_lab1";
	public static final String $rcv_grp_flg1 = $rcv_grp + ".bp_grp_flg1";
	public static final String $rcv_grp_cd1 = $rcv_grp + ".bp_grp_cd1";
	public static final String $rcv_grp_nm1 = $rcv_grp + ".bp_grp_nm1";
	public static final String $rcv_grp_lab2 = $rcv_grp + ".bp_grp_lab2";
	public static final String $rcv_grp_flg2 = $rcv_grp + ".bp_grp_flg2";
	public static final String $rcv_grp_cd2 = $rcv_grp + ".bp_grp_cd2";
	public static final String $rcv_grp_nm2 = $rcv_grp + ".bp_grp_nm2";
	public static final String $rcv_grp_lab3 = $rcv_grp + ".bp_grp_lab3";
	public static final String $rcv_grp_flg3 = $rcv_grp + ".bp_grp_flg3";
	public static final String $rcv_grp_cd3 = $rcv_grp + ".bp_grp_cd3";
	public static final String $rcv_grp_nm3 = $rcv_grp + ".bp_grp_nm3";
	public static final String $rcv_grp_lab4 = $rcv_grp + ".bp_grp_lab4";
	public static final String $rcv_grp_flg4 = $rcv_grp + ".bp_grp_flg4";
	public static final String $rcv_grp_cd4 = $rcv_grp + ".bp_grp_cd4";
	public static final String $rcv_grp_nm4 = $rcv_grp + ".bp_grp_nm4";
	public static final String $rcv_grp_lab5 = $rcv_grp + ".bp_grp_lab5";
	public static final String $rcv_grp_flg5 = $rcv_grp + ".bp_grp_flg5";
	public static final String $rcv_grp_cd5 = $rcv_grp + ".bp_grp_cd5";
	public static final String $rcv_grp_nm5 = $rcv_grp + ".bp_grp_nm5";
	public static final String $rcv_grp_lab6 = $rcv_grp + ".bp_grp_lab6";
	public static final String $rcv_grp_flg6 = $rcv_grp + ".bp_grp_flg6";
	public static final String $rcv_grp_cd6 = $rcv_grp + ".bp_grp_cd6";
	public static final String $rcv_grp_nm6 = $rcv_grp + ".bp_grp_nm6";
	public static final String $rcv_grp_lab7 = $rcv_grp + ".bp_grp_lab7";
	public static final String $rcv_grp_flg7 = $rcv_grp + ".bp_grp_flg7";
	public static final String $rcv_grp_cd7 = $rcv_grp + ".bp_grp_cd7";
	public static final String $rcv_grp_nm7 = $rcv_grp + ".bp_grp_nm7";
	public static final String $rcv_grp_lab8 = $rcv_grp + ".bp_grp_lab8";
	public static final String $rcv_grp_flg8 = $rcv_grp + ".bp_grp_flg8";
	public static final String $rcv_grp_cd8 = $rcv_grp + ".bp_grp_cd8";
	public static final String $rcv_grp_nm8 = $rcv_grp + ".bp_grp_nm8";
	public static final String $rcv_grp_lab9 = $rcv_grp + ".bp_grp_lab9";
	public static final String $rcv_grp_flg9 = $rcv_grp + ".bp_grp_flg9";
	public static final String $rcv_grp_cd9 = $rcv_grp + ".bp_grp_cd9";
	public static final String $rcv_grp_nm9 = $rcv_grp + ".bp_grp_nm9";
	public static final String $rcv_grp_lab10 = $rcv_grp + ".bp_grp_lab10";
	public static final String $rcv_grp_flg10 = $rcv_grp + ".bp_grp_flg10";
	public static final String $rcv_grp_cd10 = $rcv_grp + ".bp_grp_cd10";
	public static final String $rcv_grp_nm10 = $rcv_grp + ".bp_grp_nm10";
	public static final String $bill_grp_lab1 = $bill_grp + ".bp_grp_lab1";
	public static final String $bill_grp_flg1 = $bill_grp + ".bp_grp_flg1";
	public static final String $bill_grp_cd1 = $bill_grp + ".bp_grp_cd1";
	public static final String $bill_grp_nm1 = $bill_grp + ".bp_grp_nm1";
	public static final String $bill_grp_lab2 = $bill_grp + ".bp_grp_lab2";
	public static final String $bill_grp_flg2 = $bill_grp + ".bp_grp_flg2";
	public static final String $bill_grp_cd2 = $bill_grp + ".bp_grp_cd2";
	public static final String $bill_grp_nm2 = $bill_grp + ".bp_grp_nm2";
	public static final String $bill_grp_lab3 = $bill_grp + ".bp_grp_lab3";
	public static final String $bill_grp_flg3 = $bill_grp + ".bp_grp_flg3";
	public static final String $bill_grp_cd3 = $bill_grp + ".bp_grp_cd3";
	public static final String $bill_grp_nm3 = $bill_grp + ".bp_grp_nm3";
	public static final String $bill_grp_lab4 = $bill_grp + ".bp_grp_lab4";
	public static final String $bill_grp_flg4 = $bill_grp + ".bp_grp_flg4";
	public static final String $bill_grp_cd4 = $bill_grp + ".bp_grp_cd4";
	public static final String $bill_grp_nm4 = $bill_grp + ".bp_grp_nm4";
	public static final String $bill_grp_lab5 = $bill_grp + ".bp_grp_lab5";
	public static final String $bill_grp_flg5 = $bill_grp + ".bp_grp_flg5";
	public static final String $bill_grp_cd5 = $bill_grp + ".bp_grp_cd5";
	public static final String $bill_grp_nm5 = $bill_grp + ".bp_grp_nm5";
	public static final String $bill_grp_lab6 = $bill_grp + ".bp_grp_lab6";
	public static final String $bill_grp_flg6 = $bill_grp + ".bp_grp_flg6";
	public static final String $bill_grp_cd6 = $bill_grp + ".bp_grp_cd6";
	public static final String $bill_grp_nm6 = $bill_grp + ".bp_grp_nm6";
	public static final String $bill_grp_lab7 = $bill_grp + ".bp_grp_lab7";
	public static final String $bill_grp_flg7 = $bill_grp + ".bp_grp_flg7";
	public static final String $bill_grp_cd7 = $bill_grp + ".bp_grp_cd7";
	public static final String $bill_grp_nm7 = $bill_grp + ".bp_grp_nm7";
	public static final String $bill_grp_lab8 = $bill_grp + ".bp_grp_lab8";
	public static final String $bill_grp_flg8 = $bill_grp + ".bp_grp_flg8";
	public static final String $bill_grp_cd8 = $bill_grp + ".bp_grp_cd8";
	public static final String $bill_grp_nm8 = $bill_grp + ".bp_grp_nm8";
	public static final String $bill_grp_lab9 = $bill_grp + ".bp_grp_lab9";
	public static final String $bill_grp_flg9 = $bill_grp + ".bp_grp_flg9";
	public static final String $bill_grp_cd9 = $bill_grp + ".bp_grp_cd9";
	public static final String $bill_grp_nm9 = $bill_grp + ".bp_grp_nm9";
	public static final String $bill_grp_lab10 = $bill_grp + ".bp_grp_lab10";
	public static final String $bill_grp_flg10 = $bill_grp + ".bp_grp_flg10";
	public static final String $bill_grp_cd10 = $bill_grp + ".bp_grp_cd10";
	public static final String $bill_grp_nm10 = $bill_grp + ".bp_grp_nm10";

	public static final MCMeta ope_META = createStringMeta($ope);
	public static final MCMeta scr_ope_flg_META = createCommonMeta($scr_ope_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcv_flg_META = createCommonMeta($rcv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta susp_flg_META = createCommonMeta($susp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta adv_flg_META = createCommonMeta($adv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ap_flg_META = createCommonMeta($ap_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_prnt_flg_META = createCommonMeta($not_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prnt_flg_META = createCommonMeta($prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta fb_t_flg_META = createCommonMeta($fb_t_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta fb_f_flg_META = createCommonMeta($fb_f_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcv_dt_fr_META = createCommonMeta($rcv_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rcv_dt_to_META = createCommonMeta($rcv_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rcst_cd_META = createCommonMeta($rcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta rcst_nm_META = createCommonMeta($rcst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bcst_cd_META = createCommonMeta($bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bcst_nm_META = createCommonMeta($bcst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta rcv_usr_cd_META = createCommonMeta($rcv_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta rcv_usr_nm_META = createCommonMeta($rcv_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta rcv_dpt_cd_META = createCommonMeta($rcv_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta rcv_dpt_nm_META = createCommonMeta($rcv_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta rcv_rmrks_META = createCommonMeta($rcv_rmrks, mcframe.commonMS.meta.MS_META.RCV_RMRKS);
	public static final MCMeta rcv_no_META = createCommonMeta($rcv_no, mcframe.commonMA.meta.MA_META.RCV_NO);
	public static final MCMeta note_no_META = createCommonMeta($note_no, mcframe.commonMA.meta.MA_META.NOTE_NO);
	public static final MCMeta pay_act_no_META = createCommonMeta($pay_act_no, mcframe.commonMA.meta.MA_META.PAY_ACT_NO);
	public static final MCMeta rcv_mtd_cd_META = createCommonMeta($rcv_mtd_cd, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta rcv_mtd_nm_META = createCommonMeta($rcv_mtd_nm, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta bank_ac_cd_META = createCommonMeta($bank_ac_cd, mcframe.commonMA.meta.MA_META.BANK_AC_CD);
	public static final MCMeta bank_ac_nm_META = createCommonMeta($bank_ac_nm, mcframe.commonMA.meta.MA_META.BANK_AC_NM);
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta cur_nm_META = createCommonMeta($cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta bill_dpt_cd_META = createCommonMeta($bill_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bill_dpt_nm_META = createCommonMeta($bill_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta auto_appl_sts_typ_META = createCommonMeta($auto_appl_sts_typ, mcframe.commonMS.meta.MS_META.AUTO_APPL_STS_TYP);
	public static final MCMeta auto_appl_sts_typ_nm_META = createCommonMeta($auto_appl_sts_typ_nm, mcframe.commonMS.meta.MS_META.AUTO_APPL_STS_TYP_NM);
	public static final MCMeta if_rcv_no_META = createCommonMeta($if_rcv_no, mcframe.commonMA.meta.MA_META.IF_EXT_DATA_NO);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.NOTE_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.NOTE_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.NOTE_SUB_CHAR3);
	public static final MCMeta proc_flg_META = createCommonMeta($proc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcv_grp_META = createInnerRowMeta($rcv_grp, mcframe.clientMAUB.MAUBP0260.BpGrpR.class);
	public static final MCMeta bill_grp_META = createInnerRowMeta($bill_grp, mcframe.clientMAUB.MAUBP0260.BpGrpR.class);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			scr_ope_flg_META,
			rcv_flg_META,
			susp_flg_META,
			adv_flg_META,
			ap_flg_META,
			not_prnt_flg_META,
			prnt_flg_META,
			fb_t_flg_META,
			fb_f_flg_META,
			rcv_dt_fr_META,
			rcv_dt_to_META,
			rcst_cd_META,
			rcst_nm_META,
			bcst_cd_META,
			bcst_nm_META,
			rcv_usr_cd_META,
			rcv_usr_nm_META,
			rcv_dpt_cd_META,
			rcv_dpt_nm_META,
			wg_cd_META,
			wg_nm_META,
			rcv_rmrks_META,
			rcv_no_META,
			note_no_META,
			pay_act_no_META,
			rcv_mtd_cd_META,
			rcv_mtd_nm_META,
			bank_ac_cd_META,
			bank_ac_nm_META,
			cur_cd_META,
			cur_nm_META,
			bill_dpt_cd_META,
			bill_dpt_nm_META,
			auto_appl_sts_typ_META,
			auto_appl_sts_typ_nm_META,
			if_rcv_no_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			proc_flg_META,
			rcv_grp_META,
			bill_grp_META
		},
		new String[][]{
			{
				"rcv_grp_flg1",
				"rcv_grp_cd1",
				"rcv_grp_nm1",
				"rcv_grp_flg2",
				"rcv_grp_cd2",
				"rcv_grp_nm2",
				"rcv_grp_flg3",
				"rcv_grp_cd3",
				"rcv_grp_nm3",
				"rcv_grp_flg4",
				"rcv_grp_cd4",
				"rcv_grp_nm4",
				"rcv_grp_flg5",
				"rcv_grp_cd5",
				"rcv_grp_nm5",
				"rcv_grp_flg6",
				"rcv_grp_cd6",
				"rcv_grp_nm6",
				"rcv_grp_flg7",
				"rcv_grp_cd7",
				"rcv_grp_nm7",
				"rcv_grp_flg8",
				"rcv_grp_cd8",
				"rcv_grp_nm8",
				"rcv_grp_flg9",
				"rcv_grp_cd9",
				"rcv_grp_nm9",
				"rcv_grp_flg10",
				"rcv_grp_cd10",
				"rcv_grp_nm10",
				"bill_grp_flg1",
				"bill_grp_cd1",
				"bill_grp_nm1",
				"bill_grp_flg2",
				"bill_grp_cd2",
				"bill_grp_nm2",
				"bill_grp_flg3",
				"bill_grp_cd3",
				"bill_grp_nm3",
				"bill_grp_flg4",
				"bill_grp_cd4",
				"bill_grp_nm4",
				"bill_grp_flg5",
				"bill_grp_cd5",
				"bill_grp_nm5",
				"bill_grp_flg6",
				"bill_grp_cd6",
				"bill_grp_nm6",
				"bill_grp_flg7",
				"bill_grp_cd7",
				"bill_grp_nm7",
				"bill_grp_flg8",
				"bill_grp_cd8",
				"bill_grp_nm8",
				"bill_grp_flg9",
				"bill_grp_cd9",
				"bill_grp_nm9",
				"bill_grp_flg10",
				"bill_grp_cd10",
				"bill_grp_nm10"
			},
			{
				$rcv_grp_flg1,
				$rcv_grp_cd1,
				$rcv_grp_nm1,
				$rcv_grp_flg2,
				$rcv_grp_cd2,
				$rcv_grp_nm2,
				$rcv_grp_flg3,
				$rcv_grp_cd3,
				$rcv_grp_nm3,
				$rcv_grp_flg4,
				$rcv_grp_cd4,
				$rcv_grp_nm4,
				$rcv_grp_flg5,
				$rcv_grp_cd5,
				$rcv_grp_nm5,
				$rcv_grp_flg6,
				$rcv_grp_cd6,
				$rcv_grp_nm6,
				$rcv_grp_flg7,
				$rcv_grp_cd7,
				$rcv_grp_nm7,
				$rcv_grp_flg8,
				$rcv_grp_cd8,
				$rcv_grp_nm8,
				$rcv_grp_flg9,
				$rcv_grp_cd9,
				$rcv_grp_nm9,
				$rcv_grp_flg10,
				$rcv_grp_cd10,
				$rcv_grp_nm10,
				$bill_grp_flg1,
				$bill_grp_cd1,
				$bill_grp_nm1,
				$bill_grp_flg2,
				$bill_grp_cd2,
				$bill_grp_nm2,
				$bill_grp_flg3,
				$bill_grp_cd3,
				$bill_grp_nm3,
				$bill_grp_flg4,
				$bill_grp_cd4,
				$bill_grp_nm4,
				$bill_grp_flg5,
				$bill_grp_cd5,
				$bill_grp_nm5,
				$bill_grp_flg6,
				$bill_grp_cd6,
				$bill_grp_nm6,
				$bill_grp_flg7,
				$bill_grp_cd7,
				$bill_grp_nm7,
				$bill_grp_flg8,
				$bill_grp_cd8,
				$bill_grp_nm8,
				$bill_grp_flg9,
				$bill_grp_cd9,
				$bill_grp_nm9,
				$bill_grp_flg10,
				$bill_grp_cd10,
				$bill_grp_nm10
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
				{$rcv_usr_cd, "usr_nm"},	// rcv_usr_cd
				{$rcv_dpt_cd, "dpt_nm"},	// rcv_dpt_cd
				{$rcv_mtd_cd, "sttl_nm"},	// rcv_mtd_cd
				{$bill_dpt_cd, "dpt_nm"}	// bill_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$rcst_cd, "MAC_BP_IS_SRCH_TYP.RCST"},	// rcst_cd
				{$bcst_cd, "MAC_BP_IS_SRCH_TYP.BCST"},	// bcst_cd
				{$rcv_dpt_cd, "true;true;MAC_DPT_IS_SRCH_TYP.AR"},	// rcv_dpt_cd
				{$bill_dpt_cd, "true;true;MAC_DPT_IS_SRCH_TYP.AR"}	// bill_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$rcst_cd, "bp_is_srch_typ"},	// rcst_cd
				{$bcst_cd, "bp_is_srch_typ"},	// bcst_cd
				{$rcv_dpt_cd, "dpt_nm_rem_flg;mode_today_flg;dpt_is_srch_typ"},	// rcv_dpt_cd
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
	 * PRNT,Issue report,0;REF,View,1 PRNT,帳票発行する,0;REF,参照する,1.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * PRNT,Issue report,0;REF,View,1 PRNT,帳票発行する,0;REF,参照する,1.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	/**
	 * Operation type 操作種別.<p>
	 *
	 */
	public boolean scr_ope_flg() {
		return getConstBoolean(offset + 1, $scr_ope_flg);
	}

	/**
	 * Operation type 操作種別.<p>
	 *
	 */
	public void scr_ope_flg(boolean value) {
		setConstBoolean(offset + 1, $scr_ope_flg, value);
	}


	/**
	 * Payment received 入金.<p>
	 *
	 */
	public boolean rcv_flg() {
		return getConstBoolean(offset + 2, $rcv_flg);
	}

	/**
	 * Payment received 入金.<p>
	 *
	 */
	public void rcv_flg(boolean value) {
		setConstBoolean(offset + 2, $rcv_flg, value);
	}


	/**
	 * Suspense received 仮受金.<p>
	 *
	 */
	public boolean susp_flg() {
		return getConstBoolean(offset + 3, $susp_flg);
	}

	/**
	 * Suspense received 仮受金.<p>
	 *
	 */
	public void susp_flg(boolean value) {
		setConstBoolean(offset + 3, $susp_flg, value);
	}


	/**
	 * Advance received 前受金.<p>
	 *
	 */
	public boolean adv_flg() {
		return getConstBoolean(offset + 4, $adv_flg);
	}

	/**
	 * Advance received 前受金.<p>
	 *
	 */
	public void adv_flg(boolean value) {
		setConstBoolean(offset + 4, $adv_flg, value);
	}


	/**
	 * AP amount offset 買掛金相殺.<p>
	 *
	 */
	public boolean ap_flg() {
		return getConstBoolean(offset + 5, $ap_flg);
	}

	/**
	 * AP amount offset 買掛金相殺.<p>
	 *
	 */
	public void ap_flg(boolean value) {
		setConstBoolean(offset + 5, $ap_flg, value);
	}


	/**
	 * Unissued 未発行.<p>
	 *
	 */
	public boolean not_prnt_flg() {
		return getConstBoolean(offset + 6, $not_prnt_flg);
	}

	/**
	 * Unissued 未発行.<p>
	 *
	 */
	public void not_prnt_flg(boolean value) {
		setConstBoolean(offset + 6, $not_prnt_flg, value);
	}


	/**
	 * Issued 発行済.<p>
	 *
	 */
	public boolean prnt_flg() {
		return getConstBoolean(offset + 7, $prnt_flg);
	}

	/**
	 * Issued 発行済.<p>
	 *
	 */
	public void prnt_flg(boolean value) {
		setConstBoolean(offset + 7, $prnt_flg, value);
	}


	/**
	 * Target 対象.<p>
	 *
	 */
	public boolean fb_t_flg() {
		return getConstBoolean(offset + 8, $fb_t_flg);
	}

	/**
	 * Target 対象.<p>
	 *
	 */
	public void fb_t_flg(boolean value) {
		setConstBoolean(offset + 8, $fb_t_flg, value);
	}


	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public boolean fb_f_flg() {
		return getConstBoolean(offset + 9, $fb_f_flg);
	}

	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public void fb_f_flg(boolean value) {
		setConstBoolean(offset + 9, $fb_f_flg, value);
	}


	/**
	 * Payment received date FROM 入金日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate rcv_dt_fr() {
		return getConstDate(offset + 10, $rcv_dt_fr);
	}

	/**
	 * Payment received date FROM 入金日ＦＲＯＭ.<p>
	 *
	 */
	public void rcv_dt_fr(MCDate value) {
		setConstDate(offset + 10, $rcv_dt_fr, value);
	}


	/**
	 * Payment received date 入金日ＴＯ.<p>
	 *
	 */
	public MCDate rcv_dt_to() {
		return getConstDate(offset + 11, $rcv_dt_to);
	}

	/**
	 * Payment received date 入金日ＴＯ.<p>
	 *
	 */
	public void rcv_dt_to(MCDate value) {
		setConstDate(offset + 11, $rcv_dt_to, value);
	}


	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public String rcst_cd() {
		return getConstString(offset + 12, $rcst_cd);
	}

	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public void rcst_cd(String value) {
		setConstString(offset + 12, $rcst_cd, value);
	}


	/**
	 * Payer name 入金先名.<p>
	 *
	 */
	public String rcst_nm() {
		return getConstString(offset + 13, $rcst_nm);
	}

	/**
	 * Payer name 入金先名.<p>
	 *
	 */
	public void rcst_nm(String value) {
		setConstString(offset + 13, $rcst_nm, value);
	}


	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public String bcst_cd() {
		return getConstString(offset + 14, $bcst_cd);
	}

	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public void bcst_cd(String value) {
		setConstString(offset + 14, $bcst_cd, value);
	}


	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public String bcst_nm() {
		return getConstString(offset + 15, $bcst_nm);
	}

	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public void bcst_nm(String value) {
		setConstString(offset + 15, $bcst_nm, value);
	}


	/**
	 * Payment received PIC cd. 入金担当者ＣＤ.<p>
	 *
	 */
	public String rcv_usr_cd() {
		return getConstString(offset + 16, $rcv_usr_cd);
	}

	/**
	 * Payment received PIC cd. 入金担当者ＣＤ.<p>
	 *
	 */
	public void rcv_usr_cd(String value) {
		setConstString(offset + 16, $rcv_usr_cd, value);
	}


	/**
	 * Payment received PIC name 入金担当者名.<p>
	 *
	 */
	public String rcv_usr_nm() {
		return getConstString(offset + 17, $rcv_usr_nm);
	}

	/**
	 * Payment received PIC name 入金担当者名.<p>
	 *
	 */
	public void rcv_usr_nm(String value) {
		setConstString(offset + 17, $rcv_usr_nm, value);
	}


	/**
	 * Payment receiving dept. cd. 入金部門ＣＤ.<p>
	 *
	 */
	public String rcv_dpt_cd() {
		return getConstString(offset + 18, $rcv_dpt_cd);
	}

	/**
	 * Payment receiving dept. cd. 入金部門ＣＤ.<p>
	 *
	 */
	public void rcv_dpt_cd(String value) {
		setConstString(offset + 18, $rcv_dpt_cd, value);
	}


	/**
	 * Payment receiving dept. name 入金部門名.<p>
	 *
	 */
	public String rcv_dpt_nm() {
		return getConstString(offset + 19, $rcv_dpt_nm);
	}

	/**
	 * Payment receiving dept. name 入金部門名.<p>
	 *
	 */
	public void rcv_dpt_nm(String value) {
		setConstString(offset + 19, $rcv_dpt_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 20, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 20, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 21, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 21, $wg_nm, value);
	}


	/**
	 * Payment received remarks 入金備考.<p>
	 *
	 */
	public String rcv_rmrks() {
		return getConstString(offset + 22, $rcv_rmrks);
	}

	/**
	 * Payment received remarks 入金備考.<p>
	 *
	 */
	public void rcv_rmrks(String value) {
		setConstString(offset + 22, $rcv_rmrks, value);
	}


	/**
	 * Payment received No. 入金ＮＯ.<p>
	 *
	 */
	public String rcv_no() {
		return getConstString(offset + 23, $rcv_no);
	}

	/**
	 * Payment received No. 入金ＮＯ.<p>
	 *
	 */
	public void rcv_no(String value) {
		setConstString(offset + 23, $rcv_no, value);
	}


	/**
	 * Note number 手形番号.<p>
	 *
	 */
	public String note_no() {
		return getConstString(offset + 24, $note_no);
	}

	/**
	 * Note number 手形番号.<p>
	 *
	 */
	public void note_no(String value) {
		setConstString(offset + 24, $note_no, value);
	}


	/**
	 * Payment result No. 支払実績ＮＯ.<p>
	 *
	 */
	public String pay_act_no() {
		return getConstString(offset + 25, $pay_act_no);
	}

	/**
	 * Payment result No. 支払実績ＮＯ.<p>
	 *
	 */
	public void pay_act_no(String value) {
		setConstString(offset + 25, $pay_act_no, value);
	}


	/**
	 * Payment received method cd. 入金方法ＣＤ.<p>
	 *
	 */
	public String rcv_mtd_cd() {
		return getConstString(offset + 26, $rcv_mtd_cd);
	}

	/**
	 * Payment received method cd. 入金方法ＣＤ.<p>
	 *
	 */
	public void rcv_mtd_cd(String value) {
		setConstString(offset + 26, $rcv_mtd_cd, value);
	}


	/**
	 * Payment received method name 入金方法名.<p>
	 *
	 */
	public String rcv_mtd_nm() {
		return getConstString(offset + 27, $rcv_mtd_nm);
	}

	/**
	 * Payment received method name 入金方法名.<p>
	 *
	 */
	public void rcv_mtd_nm(String value) {
		setConstString(offset + 27, $rcv_mtd_nm, value);
	}


	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public String bank_ac_cd() {
		return getConstString(offset + 28, $bank_ac_cd);
	}

	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public void bank_ac_cd(String value) {
		setConstString(offset + 28, $bank_ac_cd, value);
	}


	/**
	 * Bank account name 口座名.<p>
	 *
	 */
	public String bank_ac_nm() {
		return getConstString(offset + 29, $bank_ac_nm);
	}

	/**
	 * Bank account name 口座名.<p>
	 *
	 */
	public void bank_ac_nm(String value) {
		setConstString(offset + 29, $bank_ac_nm, value);
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
	 * Auto-reconciliation status type 自動消込状況区分.<p>
	 *
	 */
	public String auto_appl_sts_typ() {
		return getConstString(offset + 34, $auto_appl_sts_typ);
	}

	/**
	 * Auto-reconciliation status type 自動消込状況区分.<p>
	 *
	 */
	public void auto_appl_sts_typ(String value) {
		setConstString(offset + 34, $auto_appl_sts_typ, value);
	}


	/**
	 * Auto-reconciliation status type name 自動消込状況区分名.<p>
	 *
	 */
	public String auto_appl_sts_typ_nm() {
		return getConstString(offset + 35, $auto_appl_sts_typ_nm);
	}

	/**
	 * Auto-reconciliation status type name 自動消込状況区分名.<p>
	 *
	 */
	public void auto_appl_sts_typ_nm(String value) {
		setConstString(offset + 35, $auto_appl_sts_typ_nm, value);
	}


	/**
	 * IF payment received No. ＩＦ入金ＮＯ.<p>
	 *
	 */
	public MCNumber if_rcv_no() {
		return getConstNumber(offset + 36, $if_rcv_no);
	}

	/**
	 * IF payment received No. ＩＦ入金ＮＯ.<p>
	 *
	 */
	public void if_rcv_no(MCNumber value) {
		setConstNumber(offset + 36, $if_rcv_no, value);
	}

	/**
	 * IF payment received No. ＩＦ入金ＮＯ.<p>
	 *
	 */
	public void if_rcv_no(int value) {
		setConstNumber(offset + 36, $if_rcv_no, value);
	}

	/**
	 * IF payment received No. ＩＦ入金ＮＯ.<p>
	 *
	 */
	public void if_rcv_no(long value) {
		setConstNumber(offset + 36, $if_rcv_no, value);
	}

	/**
	 * IF payment received No. ＩＦ入金ＮＯ.<p>
	 *
	 */
	public void if_rcv_no(float value) {
		setConstNumber(offset + 36, $if_rcv_no, value);
	}

	/**
	 * IF payment received No. ＩＦ入金ＮＯ.<p>
	 *
	 */
	public void if_rcv_no(double value) {
		setConstNumber(offset + 36, $if_rcv_no, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 37, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 37, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 38, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 38, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 39, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 39, $sub_char3, value);
	}


	/**
	 * Include processed 処理済含む.<p>
	 *
	 */
	public boolean proc_flg() {
		return getConstBoolean(offset + 40, $proc_flg);
	}

	/**
	 * Include processed 処理済含む.<p>
	 *
	 */
	public void proc_flg(boolean value) {
		setConstBoolean(offset + 40, $proc_flg, value);
	}


	public mcframe.clientMAUB.MAUBP0260.BpGrpR rcv_grp(){
		return (mcframe.clientMAUB.MAUBP0260.BpGrpR) getConstInnerRow(offset + 41, $rcv_grp);
	}
	
	public void rcv_grp(mcframe.clientMAUB.MAUBP0260.BpGrpR row){
		setConstInnerRow(offset + 41, $rcv_grp, row);
	}


	public mcframe.clientMAUB.MAUBP0260.BpGrpR bill_grp(){
		return (mcframe.clientMAUB.MAUBP0260.BpGrpR) getConstInnerRow(offset + 42, $bill_grp);
	}
	
	public void bill_grp(mcframe.clientMAUB.MAUBP0260.BpGrpR row){
		setConstInnerRow(offset + 42, $bill_grp, row);
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
		if ($rcv_usr_cd.equalsIgnoreCase(name)) {
			return rcv_usr_cd();
		}
		if ($rcv_usr_nm.equalsIgnoreCase(name)) {
			return rcv_usr_nm();
		}
		if ($rcv_dpt_cd.equalsIgnoreCase(name)) {
			return rcv_dpt_cd();
		}
		if ($rcv_dpt_nm.equalsIgnoreCase(name)) {
			return rcv_dpt_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($rcv_rmrks.equalsIgnoreCase(name)) {
			return rcv_rmrks();
		}
		if ($rcv_no.equalsIgnoreCase(name)) {
			return rcv_no();
		}
		if ($note_no.equalsIgnoreCase(name)) {
			return note_no();
		}
		if ($pay_act_no.equalsIgnoreCase(name)) {
			return pay_act_no();
		}
		if ($rcv_mtd_cd.equalsIgnoreCase(name)) {
			return rcv_mtd_cd();
		}
		if ($rcv_mtd_nm.equalsIgnoreCase(name)) {
			return rcv_mtd_nm();
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			return bank_ac_cd();
		}
		if ($bank_ac_nm.equalsIgnoreCase(name)) {
			return bank_ac_nm();
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
		if ($auto_appl_sts_typ.equalsIgnoreCase(name)) {
			return auto_appl_sts_typ();
		}
		if ($auto_appl_sts_typ_nm.equalsIgnoreCase(name)) {
			return auto_appl_sts_typ_nm();
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
	public MCNumber getNumber(String name) {
		if ($if_rcv_no.equalsIgnoreCase(name)) {
			return if_rcv_no();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($rcv_dt_fr.equalsIgnoreCase(name)) {
			return rcv_dt_fr();
		}
		if ($rcv_dt_to.equalsIgnoreCase(name)) {
			return rcv_dt_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($scr_ope_flg.equalsIgnoreCase(name)) {
			return scr_ope_flg();
		}
		if ($rcv_flg.equalsIgnoreCase(name)) {
			return rcv_flg();
		}
		if ($susp_flg.equalsIgnoreCase(name)) {
			return susp_flg();
		}
		if ($adv_flg.equalsIgnoreCase(name)) {
			return adv_flg();
		}
		if ($ap_flg.equalsIgnoreCase(name)) {
			return ap_flg();
		}
		if ($not_prnt_flg.equalsIgnoreCase(name)) {
			return not_prnt_flg();
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			return prnt_flg();
		}
		if ($fb_t_flg.equalsIgnoreCase(name)) {
			return fb_t_flg();
		}
		if ($fb_f_flg.equalsIgnoreCase(name)) {
			return fb_f_flg();
		}
		if ($proc_flg.equalsIgnoreCase(name)) {
			return proc_flg();
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
		if ($rcv_usr_cd.equalsIgnoreCase(name)) {
			return rcv_usr_cd();
		}
		if ($rcv_usr_nm.equalsIgnoreCase(name)) {
			return rcv_usr_nm();
		}
		if ($rcv_dpt_cd.equalsIgnoreCase(name)) {
			return rcv_dpt_cd();
		}
		if ($rcv_dpt_nm.equalsIgnoreCase(name)) {
			return rcv_dpt_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($rcv_rmrks.equalsIgnoreCase(name)) {
			return rcv_rmrks();
		}
		if ($rcv_no.equalsIgnoreCase(name)) {
			return rcv_no();
		}
		if ($note_no.equalsIgnoreCase(name)) {
			return note_no();
		}
		if ($pay_act_no.equalsIgnoreCase(name)) {
			return pay_act_no();
		}
		if ($rcv_mtd_cd.equalsIgnoreCase(name)) {
			return rcv_mtd_cd();
		}
		if ($rcv_mtd_nm.equalsIgnoreCase(name)) {
			return rcv_mtd_nm();
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			return bank_ac_cd();
		}
		if ($bank_ac_nm.equalsIgnoreCase(name)) {
			return bank_ac_nm();
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
		if ($auto_appl_sts_typ.equalsIgnoreCase(name)) {
			return auto_appl_sts_typ();
		}
		if ($auto_appl_sts_typ_nm.equalsIgnoreCase(name)) {
			return auto_appl_sts_typ_nm();
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
	public MCNumber getNumberNE(String name) {
		if ($if_rcv_no.equalsIgnoreCase(name)) {
			return if_rcv_no();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($rcv_dt_fr.equalsIgnoreCase(name)) {
			return rcv_dt_fr();
		}
		if ($rcv_dt_to.equalsIgnoreCase(name)) {
			return rcv_dt_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($scr_ope_flg.equalsIgnoreCase(name)) {
			return scr_ope_flg();
		}
		if ($rcv_flg.equalsIgnoreCase(name)) {
			return rcv_flg();
		}
		if ($susp_flg.equalsIgnoreCase(name)) {
			return susp_flg();
		}
		if ($adv_flg.equalsIgnoreCase(name)) {
			return adv_flg();
		}
		if ($ap_flg.equalsIgnoreCase(name)) {
			return ap_flg();
		}
		if ($not_prnt_flg.equalsIgnoreCase(name)) {
			return not_prnt_flg();
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			return prnt_flg();
		}
		if ($fb_t_flg.equalsIgnoreCase(name)) {
			return fb_t_flg();
		}
		if ($fb_f_flg.equalsIgnoreCase(name)) {
			return fb_f_flg();
		}
		if ($proc_flg.equalsIgnoreCase(name)) {
			return proc_flg();
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
		if ($rcv_usr_cd.equalsIgnoreCase(name)) {
			rcv_usr_cd(value);
			return;
		}
		if ($rcv_usr_nm.equalsIgnoreCase(name)) {
			rcv_usr_nm(value);
			return;
		}
		if ($rcv_dpt_cd.equalsIgnoreCase(name)) {
			rcv_dpt_cd(value);
			return;
		}
		if ($rcv_dpt_nm.equalsIgnoreCase(name)) {
			rcv_dpt_nm(value);
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
		if ($rcv_rmrks.equalsIgnoreCase(name)) {
			rcv_rmrks(value);
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
		if ($pay_act_no.equalsIgnoreCase(name)) {
			pay_act_no(value);
			return;
		}
		if ($rcv_mtd_cd.equalsIgnoreCase(name)) {
			rcv_mtd_cd(value);
			return;
		}
		if ($rcv_mtd_nm.equalsIgnoreCase(name)) {
			rcv_mtd_nm(value);
			return;
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			bank_ac_cd(value);
			return;
		}
		if ($bank_ac_nm.equalsIgnoreCase(name)) {
			bank_ac_nm(value);
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
		if ($auto_appl_sts_typ.equalsIgnoreCase(name)) {
			auto_appl_sts_typ(value);
			return;
		}
		if ($auto_appl_sts_typ_nm.equalsIgnoreCase(name)) {
			auto_appl_sts_typ_nm(value);
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
	public void setNumber(String name, MCNumber value) {
		if ($if_rcv_no.equalsIgnoreCase(name)) {
			if_rcv_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($if_rcv_no.equalsIgnoreCase(name)) {
			if_rcv_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($if_rcv_no.equalsIgnoreCase(name)) {
			if_rcv_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($if_rcv_no.equalsIgnoreCase(name)) {
			if_rcv_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($if_rcv_no.equalsIgnoreCase(name)) {
			if_rcv_no(value);
			return;
		}
		super.setNumber(name, value);
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
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($scr_ope_flg.equalsIgnoreCase(name)) {
			scr_ope_flg(value);
			return;
		}
		if ($rcv_flg.equalsIgnoreCase(name)) {
			rcv_flg(value);
			return;
		}
		if ($susp_flg.equalsIgnoreCase(name)) {
			susp_flg(value);
			return;
		}
		if ($adv_flg.equalsIgnoreCase(name)) {
			adv_flg(value);
			return;
		}
		if ($ap_flg.equalsIgnoreCase(name)) {
			ap_flg(value);
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
		if ($fb_t_flg.equalsIgnoreCase(name)) {
			fb_t_flg(value);
			return;
		}
		if ($fb_f_flg.equalsIgnoreCase(name)) {
			fb_f_flg(value);
			return;
		}
		if ($proc_flg.equalsIgnoreCase(name)) {
			proc_flg(value);
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
		if ($rcv_usr_cd.equalsIgnoreCase(name)) {
			rcv_usr_cd(value);
			return;
		}
		if ($rcv_usr_nm.equalsIgnoreCase(name)) {
			rcv_usr_nm(value);
			return;
		}
		if ($rcv_dpt_cd.equalsIgnoreCase(name)) {
			rcv_dpt_cd(value);
			return;
		}
		if ($rcv_dpt_nm.equalsIgnoreCase(name)) {
			rcv_dpt_nm(value);
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
		if ($rcv_rmrks.equalsIgnoreCase(name)) {
			rcv_rmrks(value);
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
		if ($pay_act_no.equalsIgnoreCase(name)) {
			pay_act_no(value);
			return;
		}
		if ($rcv_mtd_cd.equalsIgnoreCase(name)) {
			rcv_mtd_cd(value);
			return;
		}
		if ($rcv_mtd_nm.equalsIgnoreCase(name)) {
			rcv_mtd_nm(value);
			return;
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			bank_ac_cd(value);
			return;
		}
		if ($bank_ac_nm.equalsIgnoreCase(name)) {
			bank_ac_nm(value);
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
		if ($auto_appl_sts_typ.equalsIgnoreCase(name)) {
			auto_appl_sts_typ(value);
			return;
		}
		if ($auto_appl_sts_typ_nm.equalsIgnoreCase(name)) {
			auto_appl_sts_typ_nm(value);
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
	public void setNumberNE(String name, MCNumber value) {
		if ($if_rcv_no.equalsIgnoreCase(name)) {
			if_rcv_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($if_rcv_no.equalsIgnoreCase(name)) {
			if_rcv_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($if_rcv_no.equalsIgnoreCase(name)) {
			if_rcv_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($if_rcv_no.equalsIgnoreCase(name)) {
			if_rcv_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($if_rcv_no.equalsIgnoreCase(name)) {
			if_rcv_no(value);
			return;
		}
		super.setNumberNE(name, value);
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
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($scr_ope_flg.equalsIgnoreCase(name)) {
			scr_ope_flg(value);
			return;
		}
		if ($rcv_flg.equalsIgnoreCase(name)) {
			rcv_flg(value);
			return;
		}
		if ($susp_flg.equalsIgnoreCase(name)) {
			susp_flg(value);
			return;
		}
		if ($adv_flg.equalsIgnoreCase(name)) {
			adv_flg(value);
			return;
		}
		if ($ap_flg.equalsIgnoreCase(name)) {
			ap_flg(value);
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
		if ($fb_t_flg.equalsIgnoreCase(name)) {
			fb_t_flg(value);
			return;
		}
		if ($fb_f_flg.equalsIgnoreCase(name)) {
			fb_f_flg(value);
			return;
		}
		if ($proc_flg.equalsIgnoreCase(name)) {
			proc_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($rcv_grp.equalsIgnoreCase(name)) {
			return rcv_grp();
		}
		if ($bill_grp.equalsIgnoreCase(name)) {
			return bill_grp();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($rcv_grp.equalsIgnoreCase(name)) {
			rcv_grp(
				((MCContainerMeta) rcv_grp_META).castInnerRow(mcframe.clientMAUB.MAUBP0260.BpGrpR.class, value)
			);
			return;
		}
		if ($bill_grp.equalsIgnoreCase(name)) {
			bill_grp(
				((MCContainerMeta) bill_grp_META).castInnerRow(mcframe.clientMAUB.MAUBP0260.BpGrpR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Payer classification 1 入金先分類１.<p>
	 *
	 */
	public boolean rcv_grp_flg1() {
		return rcv_grp().bp_grp_flg1();
	}

	/**
	 * Payer classification 1 入金先分類１.<p>
	 *
	 */
	public void rcv_grp_flg1(boolean value) {
		rcv_grp().bp_grp_flg1(value);
	}

	/**
	 * Payer classification cd. 1 入金先分類ＣＤ１.<p>
	 *
	 */
	public String rcv_grp_cd1() {
		return rcv_grp().bp_grp_cd1();
	}

	/**
	 * Payer classification cd. 1 入金先分類ＣＤ１.<p>
	 *
	 */
	public void rcv_grp_cd1(String value) {
		rcv_grp().bp_grp_cd1(value);
	}

	/**
	 * Payer classification name 1 入金先分類名１.<p>
	 *
	 */
	public String rcv_grp_nm1() {
		return rcv_grp().bp_grp_nm1();
	}

	/**
	 * Payer classification name 1 入金先分類名１.<p>
	 *
	 */
	public void rcv_grp_nm1(String value) {
		rcv_grp().bp_grp_nm1(value);
	}

	/**
	 * Payer classification 2 入金先分類２.<p>
	 *
	 */
	public boolean rcv_grp_flg2() {
		return rcv_grp().bp_grp_flg2();
	}

	/**
	 * Payer classification 2 入金先分類２.<p>
	 *
	 */
	public void rcv_grp_flg2(boolean value) {
		rcv_grp().bp_grp_flg2(value);
	}

	/**
	 * Payer classification cd. 2 入金先分類ＣＤ２.<p>
	 *
	 */
	public String rcv_grp_cd2() {
		return rcv_grp().bp_grp_cd2();
	}

	/**
	 * Payer classification cd. 2 入金先分類ＣＤ２.<p>
	 *
	 */
	public void rcv_grp_cd2(String value) {
		rcv_grp().bp_grp_cd2(value);
	}

	/**
	 * Payer classification name 2 入金先分類名２.<p>
	 *
	 */
	public String rcv_grp_nm2() {
		return rcv_grp().bp_grp_nm2();
	}

	/**
	 * Payer classification name 2 入金先分類名２.<p>
	 *
	 */
	public void rcv_grp_nm2(String value) {
		rcv_grp().bp_grp_nm2(value);
	}

	/**
	 * Payer classification 3 入金先分類３.<p>
	 *
	 */
	public boolean rcv_grp_flg3() {
		return rcv_grp().bp_grp_flg3();
	}

	/**
	 * Payer classification 3 入金先分類３.<p>
	 *
	 */
	public void rcv_grp_flg3(boolean value) {
		rcv_grp().bp_grp_flg3(value);
	}

	/**
	 * Payer classification cd. 3 入金先分類ＣＤ３.<p>
	 *
	 */
	public String rcv_grp_cd3() {
		return rcv_grp().bp_grp_cd3();
	}

	/**
	 * Payer classification cd. 3 入金先分類ＣＤ３.<p>
	 *
	 */
	public void rcv_grp_cd3(String value) {
		rcv_grp().bp_grp_cd3(value);
	}

	/**
	 * Payer classification name 3 入金先分類名３.<p>
	 *
	 */
	public String rcv_grp_nm3() {
		return rcv_grp().bp_grp_nm3();
	}

	/**
	 * Payer classification name 3 入金先分類名３.<p>
	 *
	 */
	public void rcv_grp_nm3(String value) {
		rcv_grp().bp_grp_nm3(value);
	}

	/**
	 * Payer classification 4 入金先分類４.<p>
	 *
	 */
	public boolean rcv_grp_flg4() {
		return rcv_grp().bp_grp_flg4();
	}

	/**
	 * Payer classification 4 入金先分類４.<p>
	 *
	 */
	public void rcv_grp_flg4(boolean value) {
		rcv_grp().bp_grp_flg4(value);
	}

	/**
	 * Payer classification cd. 4 入金先分類ＣＤ４.<p>
	 *
	 */
	public String rcv_grp_cd4() {
		return rcv_grp().bp_grp_cd4();
	}

	/**
	 * Payer classification cd. 4 入金先分類ＣＤ４.<p>
	 *
	 */
	public void rcv_grp_cd4(String value) {
		rcv_grp().bp_grp_cd4(value);
	}

	/**
	 * Payer classification name 4 入金先分類名４.<p>
	 *
	 */
	public String rcv_grp_nm4() {
		return rcv_grp().bp_grp_nm4();
	}

	/**
	 * Payer classification name 4 入金先分類名４.<p>
	 *
	 */
	public void rcv_grp_nm4(String value) {
		rcv_grp().bp_grp_nm4(value);
	}

	/**
	 * Payer classification 5 入金先分類５.<p>
	 *
	 */
	public boolean rcv_grp_flg5() {
		return rcv_grp().bp_grp_flg5();
	}

	/**
	 * Payer classification 5 入金先分類５.<p>
	 *
	 */
	public void rcv_grp_flg5(boolean value) {
		rcv_grp().bp_grp_flg5(value);
	}

	/**
	 * Payer classification cd. 5 入金先分類ＣＤ５.<p>
	 *
	 */
	public String rcv_grp_cd5() {
		return rcv_grp().bp_grp_cd5();
	}

	/**
	 * Payer classification cd. 5 入金先分類ＣＤ５.<p>
	 *
	 */
	public void rcv_grp_cd5(String value) {
		rcv_grp().bp_grp_cd5(value);
	}

	/**
	 * Payer classification name 5 入金先分類名５.<p>
	 *
	 */
	public String rcv_grp_nm5() {
		return rcv_grp().bp_grp_nm5();
	}

	/**
	 * Payer classification name 5 入金先分類名５.<p>
	 *
	 */
	public void rcv_grp_nm5(String value) {
		rcv_grp().bp_grp_nm5(value);
	}

	/**
	 * Payer classification 6 入金先分類６.<p>
	 *
	 */
	public boolean rcv_grp_flg6() {
		return rcv_grp().bp_grp_flg6();
	}

	/**
	 * Payer classification 6 入金先分類６.<p>
	 *
	 */
	public void rcv_grp_flg6(boolean value) {
		rcv_grp().bp_grp_flg6(value);
	}

	/**
	 * Payer classification cd. 6 入金先分類ＣＤ６.<p>
	 *
	 */
	public String rcv_grp_cd6() {
		return rcv_grp().bp_grp_cd6();
	}

	/**
	 * Payer classification cd. 6 入金先分類ＣＤ６.<p>
	 *
	 */
	public void rcv_grp_cd6(String value) {
		rcv_grp().bp_grp_cd6(value);
	}

	/**
	 * Payer classification name 6 入金先分類名６.<p>
	 *
	 */
	public String rcv_grp_nm6() {
		return rcv_grp().bp_grp_nm6();
	}

	/**
	 * Payer classification name 6 入金先分類名６.<p>
	 *
	 */
	public void rcv_grp_nm6(String value) {
		rcv_grp().bp_grp_nm6(value);
	}

	/**
	 * Payer classification 7 入金先分類７.<p>
	 *
	 */
	public boolean rcv_grp_flg7() {
		return rcv_grp().bp_grp_flg7();
	}

	/**
	 * Payer classification 7 入金先分類７.<p>
	 *
	 */
	public void rcv_grp_flg7(boolean value) {
		rcv_grp().bp_grp_flg7(value);
	}

	/**
	 * Payer classification cd. 7 入金先分類ＣＤ７.<p>
	 *
	 */
	public String rcv_grp_cd7() {
		return rcv_grp().bp_grp_cd7();
	}

	/**
	 * Payer classification cd. 7 入金先分類ＣＤ７.<p>
	 *
	 */
	public void rcv_grp_cd7(String value) {
		rcv_grp().bp_grp_cd7(value);
	}

	/**
	 * Payer classification name 7 入金先分類名７.<p>
	 *
	 */
	public String rcv_grp_nm7() {
		return rcv_grp().bp_grp_nm7();
	}

	/**
	 * Payer classification name 7 入金先分類名７.<p>
	 *
	 */
	public void rcv_grp_nm7(String value) {
		rcv_grp().bp_grp_nm7(value);
	}

	/**
	 * Payer classification 8 入金先分類８.<p>
	 *
	 */
	public boolean rcv_grp_flg8() {
		return rcv_grp().bp_grp_flg8();
	}

	/**
	 * Payer classification 8 入金先分類８.<p>
	 *
	 */
	public void rcv_grp_flg8(boolean value) {
		rcv_grp().bp_grp_flg8(value);
	}

	/**
	 * Payer classification cd. 8 入金先分類ＣＤ８.<p>
	 *
	 */
	public String rcv_grp_cd8() {
		return rcv_grp().bp_grp_cd8();
	}

	/**
	 * Payer classification cd. 8 入金先分類ＣＤ８.<p>
	 *
	 */
	public void rcv_grp_cd8(String value) {
		rcv_grp().bp_grp_cd8(value);
	}

	/**
	 * Payer classification name 8 入金先分類名８.<p>
	 *
	 */
	public String rcv_grp_nm8() {
		return rcv_grp().bp_grp_nm8();
	}

	/**
	 * Payer classification name 8 入金先分類名８.<p>
	 *
	 */
	public void rcv_grp_nm8(String value) {
		rcv_grp().bp_grp_nm8(value);
	}

	/**
	 * Payer classification 9 入金先分類９.<p>
	 *
	 */
	public boolean rcv_grp_flg9() {
		return rcv_grp().bp_grp_flg9();
	}

	/**
	 * Payer classification 9 入金先分類９.<p>
	 *
	 */
	public void rcv_grp_flg9(boolean value) {
		rcv_grp().bp_grp_flg9(value);
	}

	/**
	 * Payer classification cd. 9 入金先分類ＣＤ９.<p>
	 *
	 */
	public String rcv_grp_cd9() {
		return rcv_grp().bp_grp_cd9();
	}

	/**
	 * Payer classification cd. 9 入金先分類ＣＤ９.<p>
	 *
	 */
	public void rcv_grp_cd9(String value) {
		rcv_grp().bp_grp_cd9(value);
	}

	/**
	 * Payer classification name 9 入金先分類名９.<p>
	 *
	 */
	public String rcv_grp_nm9() {
		return rcv_grp().bp_grp_nm9();
	}

	/**
	 * Payer classification name 9 入金先分類名９.<p>
	 *
	 */
	public void rcv_grp_nm9(String value) {
		rcv_grp().bp_grp_nm9(value);
	}

	/**
	 * Payer classification 10 入金先分類１０.<p>
	 *
	 */
	public boolean rcv_grp_flg10() {
		return rcv_grp().bp_grp_flg10();
	}

	/**
	 * Payer classification 10 入金先分類１０.<p>
	 *
	 */
	public void rcv_grp_flg10(boolean value) {
		rcv_grp().bp_grp_flg10(value);
	}

	/**
	 * Payer classification cd. 10 入金先分類ＣＤ１０.<p>
	 *
	 */
	public String rcv_grp_cd10() {
		return rcv_grp().bp_grp_cd10();
	}

	/**
	 * Payer classification cd. 10 入金先分類ＣＤ１０.<p>
	 *
	 */
	public void rcv_grp_cd10(String value) {
		rcv_grp().bp_grp_cd10(value);
	}

	/**
	 * Payer classification name 10 入金先分類名１０.<p>
	 *
	 */
	public String rcv_grp_nm10() {
		return rcv_grp().bp_grp_nm10();
	}

	/**
	 * Payer classification name 10 入金先分類名１０.<p>
	 *
	 */
	public void rcv_grp_nm10(String value) {
		rcv_grp().bp_grp_nm10(value);
	}

	/**
	 * Billing customer classification 1 請求先分類１.<p>
	 *
	 */
	public boolean bill_grp_flg1() {
		return bill_grp().bp_grp_flg1();
	}

	/**
	 * Billing customer classification 1 請求先分類１.<p>
	 *
	 */
	public void bill_grp_flg1(boolean value) {
		bill_grp().bp_grp_flg1(value);
	}

	/**
	 * Billing customer classification cd. 1 請求先分類ＣＤ１.<p>
	 *
	 */
	public String bill_grp_cd1() {
		return bill_grp().bp_grp_cd1();
	}

	/**
	 * Billing customer classification cd. 1 請求先分類ＣＤ１.<p>
	 *
	 */
	public void bill_grp_cd1(String value) {
		bill_grp().bp_grp_cd1(value);
	}

	/**
	 * Billing customer classification name 1 請求先分類名１.<p>
	 *
	 */
	public String bill_grp_nm1() {
		return bill_grp().bp_grp_nm1();
	}

	/**
	 * Billing customer classification name 1 請求先分類名１.<p>
	 *
	 */
	public void bill_grp_nm1(String value) {
		bill_grp().bp_grp_nm1(value);
	}

	/**
	 * Billing customer classification 2 請求先分類２.<p>
	 *
	 */
	public boolean bill_grp_flg2() {
		return bill_grp().bp_grp_flg2();
	}

	/**
	 * Billing customer classification 2 請求先分類２.<p>
	 *
	 */
	public void bill_grp_flg2(boolean value) {
		bill_grp().bp_grp_flg2(value);
	}

	/**
	 * Billing customer classification cd. 2 請求先分類ＣＤ２.<p>
	 *
	 */
	public String bill_grp_cd2() {
		return bill_grp().bp_grp_cd2();
	}

	/**
	 * Billing customer classification cd. 2 請求先分類ＣＤ２.<p>
	 *
	 */
	public void bill_grp_cd2(String value) {
		bill_grp().bp_grp_cd2(value);
	}

	/**
	 * Billing customer classification name 2 請求先分類名２.<p>
	 *
	 */
	public String bill_grp_nm2() {
		return bill_grp().bp_grp_nm2();
	}

	/**
	 * Billing customer classification name 2 請求先分類名２.<p>
	 *
	 */
	public void bill_grp_nm2(String value) {
		bill_grp().bp_grp_nm2(value);
	}

	/**
	 * Billing customer classification 3 請求先分類３.<p>
	 *
	 */
	public boolean bill_grp_flg3() {
		return bill_grp().bp_grp_flg3();
	}

	/**
	 * Billing customer classification 3 請求先分類３.<p>
	 *
	 */
	public void bill_grp_flg3(boolean value) {
		bill_grp().bp_grp_flg3(value);
	}

	/**
	 * Billing customer classification cd. 3 請求先分類ＣＤ３.<p>
	 *
	 */
	public String bill_grp_cd3() {
		return bill_grp().bp_grp_cd3();
	}

	/**
	 * Billing customer classification cd. 3 請求先分類ＣＤ３.<p>
	 *
	 */
	public void bill_grp_cd3(String value) {
		bill_grp().bp_grp_cd3(value);
	}

	/**
	 * Billing customer classification name 3 請求先分類名３.<p>
	 *
	 */
	public String bill_grp_nm3() {
		return bill_grp().bp_grp_nm3();
	}

	/**
	 * Billing customer classification name 3 請求先分類名３.<p>
	 *
	 */
	public void bill_grp_nm3(String value) {
		bill_grp().bp_grp_nm3(value);
	}

	/**
	 * Billing customer classification 4 請求先分類４.<p>
	 *
	 */
	public boolean bill_grp_flg4() {
		return bill_grp().bp_grp_flg4();
	}

	/**
	 * Billing customer classification 4 請求先分類４.<p>
	 *
	 */
	public void bill_grp_flg4(boolean value) {
		bill_grp().bp_grp_flg4(value);
	}

	/**
	 * Billing customer classification cd. 4 請求先分類ＣＤ４.<p>
	 *
	 */
	public String bill_grp_cd4() {
		return bill_grp().bp_grp_cd4();
	}

	/**
	 * Billing customer classification cd. 4 請求先分類ＣＤ４.<p>
	 *
	 */
	public void bill_grp_cd4(String value) {
		bill_grp().bp_grp_cd4(value);
	}

	/**
	 * Billing customer classification name 4 請求先分類名４.<p>
	 *
	 */
	public String bill_grp_nm4() {
		return bill_grp().bp_grp_nm4();
	}

	/**
	 * Billing customer classification name 4 請求先分類名４.<p>
	 *
	 */
	public void bill_grp_nm4(String value) {
		bill_grp().bp_grp_nm4(value);
	}

	/**
	 * Billing customer classification 5 請求先分類５.<p>
	 *
	 */
	public boolean bill_grp_flg5() {
		return bill_grp().bp_grp_flg5();
	}

	/**
	 * Billing customer classification 5 請求先分類５.<p>
	 *
	 */
	public void bill_grp_flg5(boolean value) {
		bill_grp().bp_grp_flg5(value);
	}

	/**
	 * Billing customer classification cd. 5 請求先分類ＣＤ５.<p>
	 *
	 */
	public String bill_grp_cd5() {
		return bill_grp().bp_grp_cd5();
	}

	/**
	 * Billing customer classification cd. 5 請求先分類ＣＤ５.<p>
	 *
	 */
	public void bill_grp_cd5(String value) {
		bill_grp().bp_grp_cd5(value);
	}

	/**
	 * Billing customer classification name 5 請求先分類名５.<p>
	 *
	 */
	public String bill_grp_nm5() {
		return bill_grp().bp_grp_nm5();
	}

	/**
	 * Billing customer classification name 5 請求先分類名５.<p>
	 *
	 */
	public void bill_grp_nm5(String value) {
		bill_grp().bp_grp_nm5(value);
	}

	/**
	 * Billing customer classification 6 請求先分類６.<p>
	 *
	 */
	public boolean bill_grp_flg6() {
		return bill_grp().bp_grp_flg6();
	}

	/**
	 * Billing customer classification 6 請求先分類６.<p>
	 *
	 */
	public void bill_grp_flg6(boolean value) {
		bill_grp().bp_grp_flg6(value);
	}

	/**
	 * Billing customer classification cd. 6 請求先分類ＣＤ６.<p>
	 *
	 */
	public String bill_grp_cd6() {
		return bill_grp().bp_grp_cd6();
	}

	/**
	 * Billing customer classification cd. 6 請求先分類ＣＤ６.<p>
	 *
	 */
	public void bill_grp_cd6(String value) {
		bill_grp().bp_grp_cd6(value);
	}

	/**
	 * Billing customer classification name 6 請求先分類名６.<p>
	 *
	 */
	public String bill_grp_nm6() {
		return bill_grp().bp_grp_nm6();
	}

	/**
	 * Billing customer classification name 6 請求先分類名６.<p>
	 *
	 */
	public void bill_grp_nm6(String value) {
		bill_grp().bp_grp_nm6(value);
	}

	/**
	 * Billing customer classification 7 請求先分類７.<p>
	 *
	 */
	public boolean bill_grp_flg7() {
		return bill_grp().bp_grp_flg7();
	}

	/**
	 * Billing customer classification 7 請求先分類７.<p>
	 *
	 */
	public void bill_grp_flg7(boolean value) {
		bill_grp().bp_grp_flg7(value);
	}

	/**
	 * Billing customer classification cd. 7 請求先分類ＣＤ７.<p>
	 *
	 */
	public String bill_grp_cd7() {
		return bill_grp().bp_grp_cd7();
	}

	/**
	 * Billing customer classification cd. 7 請求先分類ＣＤ７.<p>
	 *
	 */
	public void bill_grp_cd7(String value) {
		bill_grp().bp_grp_cd7(value);
	}

	/**
	 * Billing customer classification name 7 請求先分類名７.<p>
	 *
	 */
	public String bill_grp_nm7() {
		return bill_grp().bp_grp_nm7();
	}

	/**
	 * Billing customer classification name 7 請求先分類名７.<p>
	 *
	 */
	public void bill_grp_nm7(String value) {
		bill_grp().bp_grp_nm7(value);
	}

	/**
	 * Billing customer classification 8 請求先分類８.<p>
	 *
	 */
	public boolean bill_grp_flg8() {
		return bill_grp().bp_grp_flg8();
	}

	/**
	 * Billing customer classification 8 請求先分類８.<p>
	 *
	 */
	public void bill_grp_flg8(boolean value) {
		bill_grp().bp_grp_flg8(value);
	}

	/**
	 * Billing customer classification cd. 8 請求先分類ＣＤ８.<p>
	 *
	 */
	public String bill_grp_cd8() {
		return bill_grp().bp_grp_cd8();
	}

	/**
	 * Billing customer classification cd. 8 請求先分類ＣＤ８.<p>
	 *
	 */
	public void bill_grp_cd8(String value) {
		bill_grp().bp_grp_cd8(value);
	}

	/**
	 * Billing customer classification name 8 請求先分類名８.<p>
	 *
	 */
	public String bill_grp_nm8() {
		return bill_grp().bp_grp_nm8();
	}

	/**
	 * Billing customer classification name 8 請求先分類名８.<p>
	 *
	 */
	public void bill_grp_nm8(String value) {
		bill_grp().bp_grp_nm8(value);
	}

	/**
	 * Billing customer classification 9 請求先分類９.<p>
	 *
	 */
	public boolean bill_grp_flg9() {
		return bill_grp().bp_grp_flg9();
	}

	/**
	 * Billing customer classification 9 請求先分類９.<p>
	 *
	 */
	public void bill_grp_flg9(boolean value) {
		bill_grp().bp_grp_flg9(value);
	}

	/**
	 * Billing customer classification cd. 9 請求先分類ＣＤ９.<p>
	 *
	 */
	public String bill_grp_cd9() {
		return bill_grp().bp_grp_cd9();
	}

	/**
	 * Billing customer classification cd. 9 請求先分類ＣＤ９.<p>
	 *
	 */
	public void bill_grp_cd9(String value) {
		bill_grp().bp_grp_cd9(value);
	}

	/**
	 * Billing customer classification name 9 請求先分類名９.<p>
	 *
	 */
	public String bill_grp_nm9() {
		return bill_grp().bp_grp_nm9();
	}

	/**
	 * Billing customer classification name 9 請求先分類名９.<p>
	 *
	 */
	public void bill_grp_nm9(String value) {
		bill_grp().bp_grp_nm9(value);
	}

	/**
	 * Billing customer classification 10 請求先分類１０.<p>
	 *
	 */
	public boolean bill_grp_flg10() {
		return bill_grp().bp_grp_flg10();
	}

	/**
	 * Billing customer classification 10 請求先分類１０.<p>
	 *
	 */
	public void bill_grp_flg10(boolean value) {
		bill_grp().bp_grp_flg10(value);
	}

	/**
	 * Billing customer classification cd. 10 請求先分類ＣＤ１０.<p>
	 *
	 */
	public String bill_grp_cd10() {
		return bill_grp().bp_grp_cd10();
	}

	/**
	 * Billing customer classification cd. 10 請求先分類ＣＤ１０.<p>
	 *
	 */
	public void bill_grp_cd10(String value) {
		bill_grp().bp_grp_cd10(value);
	}

	/**
	 * Billing customer classification name 10 請求先分類名１０.<p>
	 *
	 */
	public String bill_grp_nm10() {
		return bill_grp().bp_grp_nm10();
	}

	/**
	 * Billing customer classification name 10 請求先分類名１０.<p>
	 *
	 */
	public void bill_grp_nm10(String value) {
		bill_grp().bp_grp_nm10(value);
	}

}

