package mcframe.serverMSBG.MSBGL0250;

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
	 * Operation type 操作種別.<p>
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
	 * Source incoming payment result No. 発生入金ＮＯ.<p>
	 *
	 */
	public static final String $gen_rcv_no = "gen_rcv_no";
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
	public static final MCMeta gen_rcv_no_META = createCommonMeta($gen_rcv_no, mcframe.commonMA.meta.MA_META.RCV_NO);
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
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.RCV_ACT_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.RCV_ACT_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.RCV_ACT_SUB_CHAR3);
	public static final MCMeta can_flg_META = createCommonMeta($can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcv_auto_appl_flg_META = createCommonMeta($rcv_auto_appl_flg, mcframe.commonMA.meta.MA_META.FLG);
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
			gen_rcv_no_META,
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
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			can_flg_META,
			rcv_auto_appl_flg_META,
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
	 * Operation type 操作種別.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * Operation type 操作種別.<p>
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
	 * Source incoming payment result No. 発生入金ＮＯ.<p>
	 *
	 */
	public String gen_rcv_no() {
		return getConstString(offset + 23, $gen_rcv_no);
	}

	/**
	 * Source incoming payment result No. 発生入金ＮＯ.<p>
	 *
	 */
	public void gen_rcv_no(String value) {
		setConstString(offset + 23, $gen_rcv_no, value);
	}


	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return getConstString(offset + 24, $trd_rmrks);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		setConstString(offset + 24, $trd_rmrks, value);
	}


	/**
	 * Payment received result No. 入金実績ＮＯ.<p>
	 *
	 */
	public String rcv_act_no() {
		return getConstString(offset + 25, $rcv_act_no);
	}

	/**
	 * Payment received result No. 入金実績ＮＯ.<p>
	 *
	 */
	public void rcv_act_no(String value) {
		setConstString(offset + 25, $rcv_act_no, value);
	}


	/**
	 * Payment received No. 入金ＮＯ.<p>
	 *
	 */
	public String rcv_no() {
		return getConstString(offset + 26, $rcv_no);
	}

	/**
	 * Payment received No. 入金ＮＯ.<p>
	 *
	 */
	public void rcv_no(String value) {
		setConstString(offset + 26, $rcv_no, value);
	}


	/**
	 * Note number 手形番号.<p>
	 *
	 */
	public String note_no() {
		return getConstString(offset + 27, $note_no);
	}

	/**
	 * Note number 手形番号.<p>
	 *
	 */
	public void note_no(String value) {
		setConstString(offset + 27, $note_no, value);
	}


	/**
	 * Transfer payment received result No. 振替先入金実績ＮＯ.<p>
	 *
	 */
	public String sw_to_rcv_act_no() {
		return getConstString(offset + 28, $sw_to_rcv_act_no);
	}

	/**
	 * Transfer payment received result No. 振替先入金実績ＮＯ.<p>
	 *
	 */
	public void sw_to_rcv_act_no(String value) {
		setConstString(offset + 28, $sw_to_rcv_act_no, value);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 29, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 29, $trd_cd, value);
	}


	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 30, $trd_nm);
	}

	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 30, $trd_nm, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 31, $cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 31, $cur_cd, value);
	}


	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public String cur_nm() {
		return getConstString(offset + 32, $cur_nm);
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public void cur_nm(String value) {
		setConstString(offset + 32, $cur_nm, value);
	}


	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public String bill_dpt_cd() {
		return getConstString(offset + 33, $bill_dpt_cd);
	}

	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public void bill_dpt_cd(String value) {
		setConstString(offset + 33, $bill_dpt_cd, value);
	}


	/**
	 * Billing dept. name 請求部門名.<p>
	 *
	 */
	public String bill_dpt_nm() {
		return getConstString(offset + 34, $bill_dpt_nm);
	}

	/**
	 * Billing dept. name 請求部門名.<p>
	 *
	 */
	public void bill_dpt_nm(String value) {
		setConstString(offset + 34, $bill_dpt_nm, value);
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


	/**
	 * Payer classification 1 入金先分類１.<p>
	 *
	 */
	public boolean rcst_grp_flg1() {
		return getConstBoolean(offset + 40, $rcst_grp_flg1);
	}

	/**
	 * Payer classification 1 入金先分類１.<p>
	 *
	 */
	public void rcst_grp_flg1(boolean value) {
		setConstBoolean(offset + 40, $rcst_grp_flg1, value);
	}


	/**
	 * Payer classification cd. 1 入金先分類ＣＤ１.<p>
	 *
	 */
	public String rcst_grp_cd1() {
		return getConstString(offset + 41, $rcst_grp_cd1);
	}

	/**
	 * Payer classification cd. 1 入金先分類ＣＤ１.<p>
	 *
	 */
	public void rcst_grp_cd1(String value) {
		setConstString(offset + 41, $rcst_grp_cd1, value);
	}


	/**
	 * Payer classification name 1 入金先分類名１.<p>
	 *
	 */
	public String rcst_grp_nm1() {
		return getConstString(offset + 42, $rcst_grp_nm1);
	}

	/**
	 * Payer classification name 1 入金先分類名１.<p>
	 *
	 */
	public void rcst_grp_nm1(String value) {
		setConstString(offset + 42, $rcst_grp_nm1, value);
	}


	/**
	 * Payer classification 2 入金先分類２.<p>
	 *
	 */
	public boolean rcst_grp_flg2() {
		return getConstBoolean(offset + 43, $rcst_grp_flg2);
	}

	/**
	 * Payer classification 2 入金先分類２.<p>
	 *
	 */
	public void rcst_grp_flg2(boolean value) {
		setConstBoolean(offset + 43, $rcst_grp_flg2, value);
	}


	/**
	 * Payer classification cd. 2 入金先分類ＣＤ２.<p>
	 *
	 */
	public String rcst_grp_cd2() {
		return getConstString(offset + 44, $rcst_grp_cd2);
	}

	/**
	 * Payer classification cd. 2 入金先分類ＣＤ２.<p>
	 *
	 */
	public void rcst_grp_cd2(String value) {
		setConstString(offset + 44, $rcst_grp_cd2, value);
	}


	/**
	 * Payer classification name 2 入金先分類名２.<p>
	 *
	 */
	public String rcst_grp_nm2() {
		return getConstString(offset + 45, $rcst_grp_nm2);
	}

	/**
	 * Payer classification name 2 入金先分類名２.<p>
	 *
	 */
	public void rcst_grp_nm2(String value) {
		setConstString(offset + 45, $rcst_grp_nm2, value);
	}


	/**
	 * Payer classification 3 入金先分類３.<p>
	 *
	 */
	public boolean rcst_grp_flg3() {
		return getConstBoolean(offset + 46, $rcst_grp_flg3);
	}

	/**
	 * Payer classification 3 入金先分類３.<p>
	 *
	 */
	public void rcst_grp_flg3(boolean value) {
		setConstBoolean(offset + 46, $rcst_grp_flg3, value);
	}


	/**
	 * Payer classification cd. 3 入金先分類ＣＤ３.<p>
	 *
	 */
	public String rcst_grp_cd3() {
		return getConstString(offset + 47, $rcst_grp_cd3);
	}

	/**
	 * Payer classification cd. 3 入金先分類ＣＤ３.<p>
	 *
	 */
	public void rcst_grp_cd3(String value) {
		setConstString(offset + 47, $rcst_grp_cd3, value);
	}


	/**
	 * Payer classification name 3 入金先分類名３.<p>
	 *
	 */
	public String rcst_grp_nm3() {
		return getConstString(offset + 48, $rcst_grp_nm3);
	}

	/**
	 * Payer classification name 3 入金先分類名３.<p>
	 *
	 */
	public void rcst_grp_nm3(String value) {
		setConstString(offset + 48, $rcst_grp_nm3, value);
	}


	/**
	 * Payer classification 4 入金先分類４.<p>
	 *
	 */
	public boolean rcst_grp_flg4() {
		return getConstBoolean(offset + 49, $rcst_grp_flg4);
	}

	/**
	 * Payer classification 4 入金先分類４.<p>
	 *
	 */
	public void rcst_grp_flg4(boolean value) {
		setConstBoolean(offset + 49, $rcst_grp_flg4, value);
	}


	/**
	 * Payer classification cd. 4 入金先分類ＣＤ４.<p>
	 *
	 */
	public String rcst_grp_cd4() {
		return getConstString(offset + 50, $rcst_grp_cd4);
	}

	/**
	 * Payer classification cd. 4 入金先分類ＣＤ４.<p>
	 *
	 */
	public void rcst_grp_cd4(String value) {
		setConstString(offset + 50, $rcst_grp_cd4, value);
	}


	/**
	 * Payer classification name 4 入金先分類名４.<p>
	 *
	 */
	public String rcst_grp_nm4() {
		return getConstString(offset + 51, $rcst_grp_nm4);
	}

	/**
	 * Payer classification name 4 入金先分類名４.<p>
	 *
	 */
	public void rcst_grp_nm4(String value) {
		setConstString(offset + 51, $rcst_grp_nm4, value);
	}


	/**
	 * Payer classification 5 入金先分類５.<p>
	 *
	 */
	public boolean rcst_grp_flg5() {
		return getConstBoolean(offset + 52, $rcst_grp_flg5);
	}

	/**
	 * Payer classification 5 入金先分類５.<p>
	 *
	 */
	public void rcst_grp_flg5(boolean value) {
		setConstBoolean(offset + 52, $rcst_grp_flg5, value);
	}


	/**
	 * Payer classification cd. 5 入金先分類ＣＤ５.<p>
	 *
	 */
	public String rcst_grp_cd5() {
		return getConstString(offset + 53, $rcst_grp_cd5);
	}

	/**
	 * Payer classification cd. 5 入金先分類ＣＤ５.<p>
	 *
	 */
	public void rcst_grp_cd5(String value) {
		setConstString(offset + 53, $rcst_grp_cd5, value);
	}


	/**
	 * Payer classification name 5 入金先分類名５.<p>
	 *
	 */
	public String rcst_grp_nm5() {
		return getConstString(offset + 54, $rcst_grp_nm5);
	}

	/**
	 * Payer classification name 5 入金先分類名５.<p>
	 *
	 */
	public void rcst_grp_nm5(String value) {
		setConstString(offset + 54, $rcst_grp_nm5, value);
	}


	/**
	 * Payer classification 6 入金先分類６.<p>
	 *
	 */
	public boolean rcst_grp_flg6() {
		return getConstBoolean(offset + 55, $rcst_grp_flg6);
	}

	/**
	 * Payer classification 6 入金先分類６.<p>
	 *
	 */
	public void rcst_grp_flg6(boolean value) {
		setConstBoolean(offset + 55, $rcst_grp_flg6, value);
	}


	/**
	 * Payer classification cd. 6 入金先分類ＣＤ６.<p>
	 *
	 */
	public String rcst_grp_cd6() {
		return getConstString(offset + 56, $rcst_grp_cd6);
	}

	/**
	 * Payer classification cd. 6 入金先分類ＣＤ６.<p>
	 *
	 */
	public void rcst_grp_cd6(String value) {
		setConstString(offset + 56, $rcst_grp_cd6, value);
	}


	/**
	 * Payer classification name 6 入金先分類名６.<p>
	 *
	 */
	public String rcst_grp_nm6() {
		return getConstString(offset + 57, $rcst_grp_nm6);
	}

	/**
	 * Payer classification name 6 入金先分類名６.<p>
	 *
	 */
	public void rcst_grp_nm6(String value) {
		setConstString(offset + 57, $rcst_grp_nm6, value);
	}


	/**
	 * Payer classification 7 入金先分類７.<p>
	 *
	 */
	public boolean rcst_grp_flg7() {
		return getConstBoolean(offset + 58, $rcst_grp_flg7);
	}

	/**
	 * Payer classification 7 入金先分類７.<p>
	 *
	 */
	public void rcst_grp_flg7(boolean value) {
		setConstBoolean(offset + 58, $rcst_grp_flg7, value);
	}


	/**
	 * Payer classification cd. 7 入金先分類ＣＤ７.<p>
	 *
	 */
	public String rcst_grp_cd7() {
		return getConstString(offset + 59, $rcst_grp_cd7);
	}

	/**
	 * Payer classification cd. 7 入金先分類ＣＤ７.<p>
	 *
	 */
	public void rcst_grp_cd7(String value) {
		setConstString(offset + 59, $rcst_grp_cd7, value);
	}


	/**
	 * Payer classification name 7 入金先分類名７.<p>
	 *
	 */
	public String rcst_grp_nm7() {
		return getConstString(offset + 60, $rcst_grp_nm7);
	}

	/**
	 * Payer classification name 7 入金先分類名７.<p>
	 *
	 */
	public void rcst_grp_nm7(String value) {
		setConstString(offset + 60, $rcst_grp_nm7, value);
	}


	/**
	 * Payer classification 8 入金先分類８.<p>
	 *
	 */
	public boolean rcst_grp_flg8() {
		return getConstBoolean(offset + 61, $rcst_grp_flg8);
	}

	/**
	 * Payer classification 8 入金先分類８.<p>
	 *
	 */
	public void rcst_grp_flg8(boolean value) {
		setConstBoolean(offset + 61, $rcst_grp_flg8, value);
	}


	/**
	 * Payer classification cd. 8 入金先分類ＣＤ８.<p>
	 *
	 */
	public String rcst_grp_cd8() {
		return getConstString(offset + 62, $rcst_grp_cd8);
	}

	/**
	 * Payer classification cd. 8 入金先分類ＣＤ８.<p>
	 *
	 */
	public void rcst_grp_cd8(String value) {
		setConstString(offset + 62, $rcst_grp_cd8, value);
	}


	/**
	 * Payer classification name 8 入金先分類名８.<p>
	 *
	 */
	public String rcst_grp_nm8() {
		return getConstString(offset + 63, $rcst_grp_nm8);
	}

	/**
	 * Payer classification name 8 入金先分類名８.<p>
	 *
	 */
	public void rcst_grp_nm8(String value) {
		setConstString(offset + 63, $rcst_grp_nm8, value);
	}


	/**
	 * Payer classification 9 入金先分類９.<p>
	 *
	 */
	public boolean rcst_grp_flg9() {
		return getConstBoolean(offset + 64, $rcst_grp_flg9);
	}

	/**
	 * Payer classification 9 入金先分類９.<p>
	 *
	 */
	public void rcst_grp_flg9(boolean value) {
		setConstBoolean(offset + 64, $rcst_grp_flg9, value);
	}


	/**
	 * Payer classification cd. 9 入金先分類ＣＤ９.<p>
	 *
	 */
	public String rcst_grp_cd9() {
		return getConstString(offset + 65, $rcst_grp_cd9);
	}

	/**
	 * Payer classification cd. 9 入金先分類ＣＤ９.<p>
	 *
	 */
	public void rcst_grp_cd9(String value) {
		setConstString(offset + 65, $rcst_grp_cd9, value);
	}


	/**
	 * Payer classification name 9 入金先分類名９.<p>
	 *
	 */
	public String rcst_grp_nm9() {
		return getConstString(offset + 66, $rcst_grp_nm9);
	}

	/**
	 * Payer classification name 9 入金先分類名９.<p>
	 *
	 */
	public void rcst_grp_nm9(String value) {
		setConstString(offset + 66, $rcst_grp_nm9, value);
	}


	/**
	 * Payer classification 10 入金先分類１０.<p>
	 *
	 */
	public boolean rcst_grp_flg10() {
		return getConstBoolean(offset + 67, $rcst_grp_flg10);
	}

	/**
	 * Payer classification 10 入金先分類１０.<p>
	 *
	 */
	public void rcst_grp_flg10(boolean value) {
		setConstBoolean(offset + 67, $rcst_grp_flg10, value);
	}


	/**
	 * Payer classification cd. 10 入金先分類ＣＤ１０.<p>
	 *
	 */
	public String rcst_grp_cd10() {
		return getConstString(offset + 68, $rcst_grp_cd10);
	}

	/**
	 * Payer classification cd. 10 入金先分類ＣＤ１０.<p>
	 *
	 */
	public void rcst_grp_cd10(String value) {
		setConstString(offset + 68, $rcst_grp_cd10, value);
	}


	/**
	 * Payer classification name 10 入金先分類名１０.<p>
	 *
	 */
	public String rcst_grp_nm10() {
		return getConstString(offset + 69, $rcst_grp_nm10);
	}

	/**
	 * Payer classification name 10 入金先分類名１０.<p>
	 *
	 */
	public void rcst_grp_nm10(String value) {
		setConstString(offset + 69, $rcst_grp_nm10, value);
	}


	/**
	 * Billing customer classification 1 請求先分類１.<p>
	 *
	 */
	public boolean bcst_grp_flg1() {
		return getConstBoolean(offset + 70, $bcst_grp_flg1);
	}

	/**
	 * Billing customer classification 1 請求先分類１.<p>
	 *
	 */
	public void bcst_grp_flg1(boolean value) {
		setConstBoolean(offset + 70, $bcst_grp_flg1, value);
	}


	/**
	 * Billing customer classification cd. 1 請求先分類ＣＤ１.<p>
	 *
	 */
	public String bcst_grp_cd1() {
		return getConstString(offset + 71, $bcst_grp_cd1);
	}

	/**
	 * Billing customer classification cd. 1 請求先分類ＣＤ１.<p>
	 *
	 */
	public void bcst_grp_cd1(String value) {
		setConstString(offset + 71, $bcst_grp_cd1, value);
	}


	/**
	 * Billing customer classification name 1 請求先分類名１.<p>
	 *
	 */
	public String bcst_grp_nm1() {
		return getConstString(offset + 72, $bcst_grp_nm1);
	}

	/**
	 * Billing customer classification name 1 請求先分類名１.<p>
	 *
	 */
	public void bcst_grp_nm1(String value) {
		setConstString(offset + 72, $bcst_grp_nm1, value);
	}


	/**
	 * Billing customer classification 2 請求先分類２.<p>
	 *
	 */
	public boolean bcst_grp_flg2() {
		return getConstBoolean(offset + 73, $bcst_grp_flg2);
	}

	/**
	 * Billing customer classification 2 請求先分類２.<p>
	 *
	 */
	public void bcst_grp_flg2(boolean value) {
		setConstBoolean(offset + 73, $bcst_grp_flg2, value);
	}


	/**
	 * Billing customer classification cd. 2 請求先分類ＣＤ２.<p>
	 *
	 */
	public String bcst_grp_cd2() {
		return getConstString(offset + 74, $bcst_grp_cd2);
	}

	/**
	 * Billing customer classification cd. 2 請求先分類ＣＤ２.<p>
	 *
	 */
	public void bcst_grp_cd2(String value) {
		setConstString(offset + 74, $bcst_grp_cd2, value);
	}


	/**
	 * Billing customer classification name 2 請求先分類名２.<p>
	 *
	 */
	public String bcst_grp_nm2() {
		return getConstString(offset + 75, $bcst_grp_nm2);
	}

	/**
	 * Billing customer classification name 2 請求先分類名２.<p>
	 *
	 */
	public void bcst_grp_nm2(String value) {
		setConstString(offset + 75, $bcst_grp_nm2, value);
	}


	/**
	 * Billing customer classification 3 請求先分類３.<p>
	 *
	 */
	public boolean bcst_grp_flg3() {
		return getConstBoolean(offset + 76, $bcst_grp_flg3);
	}

	/**
	 * Billing customer classification 3 請求先分類３.<p>
	 *
	 */
	public void bcst_grp_flg3(boolean value) {
		setConstBoolean(offset + 76, $bcst_grp_flg3, value);
	}


	/**
	 * Billing customer classification cd. 3 請求先分類ＣＤ３.<p>
	 *
	 */
	public String bcst_grp_cd3() {
		return getConstString(offset + 77, $bcst_grp_cd3);
	}

	/**
	 * Billing customer classification cd. 3 請求先分類ＣＤ３.<p>
	 *
	 */
	public void bcst_grp_cd3(String value) {
		setConstString(offset + 77, $bcst_grp_cd3, value);
	}


	/**
	 * Billing customer classification name 3 請求先分類名３.<p>
	 *
	 */
	public String bcst_grp_nm3() {
		return getConstString(offset + 78, $bcst_grp_nm3);
	}

	/**
	 * Billing customer classification name 3 請求先分類名３.<p>
	 *
	 */
	public void bcst_grp_nm3(String value) {
		setConstString(offset + 78, $bcst_grp_nm3, value);
	}


	/**
	 * Billing customer classification 4 請求先分類４.<p>
	 *
	 */
	public boolean bcst_grp_flg4() {
		return getConstBoolean(offset + 79, $bcst_grp_flg4);
	}

	/**
	 * Billing customer classification 4 請求先分類４.<p>
	 *
	 */
	public void bcst_grp_flg4(boolean value) {
		setConstBoolean(offset + 79, $bcst_grp_flg4, value);
	}


	/**
	 * Billing customer classification cd. 4 請求先分類ＣＤ４.<p>
	 *
	 */
	public String bcst_grp_cd4() {
		return getConstString(offset + 80, $bcst_grp_cd4);
	}

	/**
	 * Billing customer classification cd. 4 請求先分類ＣＤ４.<p>
	 *
	 */
	public void bcst_grp_cd4(String value) {
		setConstString(offset + 80, $bcst_grp_cd4, value);
	}


	/**
	 * Billing customer classification name 4 請求先分類名４.<p>
	 *
	 */
	public String bcst_grp_nm4() {
		return getConstString(offset + 81, $bcst_grp_nm4);
	}

	/**
	 * Billing customer classification name 4 請求先分類名４.<p>
	 *
	 */
	public void bcst_grp_nm4(String value) {
		setConstString(offset + 81, $bcst_grp_nm4, value);
	}


	/**
	 * Billing customer classification 5 請求先分類５.<p>
	 *
	 */
	public boolean bcst_grp_flg5() {
		return getConstBoolean(offset + 82, $bcst_grp_flg5);
	}

	/**
	 * Billing customer classification 5 請求先分類５.<p>
	 *
	 */
	public void bcst_grp_flg5(boolean value) {
		setConstBoolean(offset + 82, $bcst_grp_flg5, value);
	}


	/**
	 * Billing customer classification cd. 5 請求先分類ＣＤ５.<p>
	 *
	 */
	public String bcst_grp_cd5() {
		return getConstString(offset + 83, $bcst_grp_cd5);
	}

	/**
	 * Billing customer classification cd. 5 請求先分類ＣＤ５.<p>
	 *
	 */
	public void bcst_grp_cd5(String value) {
		setConstString(offset + 83, $bcst_grp_cd5, value);
	}


	/**
	 * Billing customer classification name 5 請求先分類名５.<p>
	 *
	 */
	public String bcst_grp_nm5() {
		return getConstString(offset + 84, $bcst_grp_nm5);
	}

	/**
	 * Billing customer classification name 5 請求先分類名５.<p>
	 *
	 */
	public void bcst_grp_nm5(String value) {
		setConstString(offset + 84, $bcst_grp_nm5, value);
	}


	/**
	 * Billing customer classification 6 請求先分類６.<p>
	 *
	 */
	public boolean bcst_grp_flg6() {
		return getConstBoolean(offset + 85, $bcst_grp_flg6);
	}

	/**
	 * Billing customer classification 6 請求先分類６.<p>
	 *
	 */
	public void bcst_grp_flg6(boolean value) {
		setConstBoolean(offset + 85, $bcst_grp_flg6, value);
	}


	/**
	 * Billing customer classification cd. 6 請求先分類ＣＤ６.<p>
	 *
	 */
	public String bcst_grp_cd6() {
		return getConstString(offset + 86, $bcst_grp_cd6);
	}

	/**
	 * Billing customer classification cd. 6 請求先分類ＣＤ６.<p>
	 *
	 */
	public void bcst_grp_cd6(String value) {
		setConstString(offset + 86, $bcst_grp_cd6, value);
	}


	/**
	 * Billing customer classification name 6 請求先分類名６.<p>
	 *
	 */
	public String bcst_grp_nm6() {
		return getConstString(offset + 87, $bcst_grp_nm6);
	}

	/**
	 * Billing customer classification name 6 請求先分類名６.<p>
	 *
	 */
	public void bcst_grp_nm6(String value) {
		setConstString(offset + 87, $bcst_grp_nm6, value);
	}


	/**
	 * Billing customer classification 7 請求先分類７.<p>
	 *
	 */
	public boolean bcst_grp_flg7() {
		return getConstBoolean(offset + 88, $bcst_grp_flg7);
	}

	/**
	 * Billing customer classification 7 請求先分類７.<p>
	 *
	 */
	public void bcst_grp_flg7(boolean value) {
		setConstBoolean(offset + 88, $bcst_grp_flg7, value);
	}


	/**
	 * Billing customer classification cd. 7 請求先分類ＣＤ７.<p>
	 *
	 */
	public String bcst_grp_cd7() {
		return getConstString(offset + 89, $bcst_grp_cd7);
	}

	/**
	 * Billing customer classification cd. 7 請求先分類ＣＤ７.<p>
	 *
	 */
	public void bcst_grp_cd7(String value) {
		setConstString(offset + 89, $bcst_grp_cd7, value);
	}


	/**
	 * Billing customer classification name 7 請求先分類名７.<p>
	 *
	 */
	public String bcst_grp_nm7() {
		return getConstString(offset + 90, $bcst_grp_nm7);
	}

	/**
	 * Billing customer classification name 7 請求先分類名７.<p>
	 *
	 */
	public void bcst_grp_nm7(String value) {
		setConstString(offset + 90, $bcst_grp_nm7, value);
	}


	/**
	 * Billing customer classification 8 請求先分類８.<p>
	 *
	 */
	public boolean bcst_grp_flg8() {
		return getConstBoolean(offset + 91, $bcst_grp_flg8);
	}

	/**
	 * Billing customer classification 8 請求先分類８.<p>
	 *
	 */
	public void bcst_grp_flg8(boolean value) {
		setConstBoolean(offset + 91, $bcst_grp_flg8, value);
	}


	/**
	 * Billing customer classification cd. 8 請求先分類ＣＤ８.<p>
	 *
	 */
	public String bcst_grp_cd8() {
		return getConstString(offset + 92, $bcst_grp_cd8);
	}

	/**
	 * Billing customer classification cd. 8 請求先分類ＣＤ８.<p>
	 *
	 */
	public void bcst_grp_cd8(String value) {
		setConstString(offset + 92, $bcst_grp_cd8, value);
	}


	/**
	 * Billing customer classification name 8 請求先分類名８.<p>
	 *
	 */
	public String bcst_grp_nm8() {
		return getConstString(offset + 93, $bcst_grp_nm8);
	}

	/**
	 * Billing customer classification name 8 請求先分類名８.<p>
	 *
	 */
	public void bcst_grp_nm8(String value) {
		setConstString(offset + 93, $bcst_grp_nm8, value);
	}


	/**
	 * Billing customer classification 9 請求先分類９.<p>
	 *
	 */
	public boolean bcst_grp_flg9() {
		return getConstBoolean(offset + 94, $bcst_grp_flg9);
	}

	/**
	 * Billing customer classification 9 請求先分類９.<p>
	 *
	 */
	public void bcst_grp_flg9(boolean value) {
		setConstBoolean(offset + 94, $bcst_grp_flg9, value);
	}


	/**
	 * Billing customer classification cd. 9 請求先分類ＣＤ９.<p>
	 *
	 */
	public String bcst_grp_cd9() {
		return getConstString(offset + 95, $bcst_grp_cd9);
	}

	/**
	 * Billing customer classification cd. 9 請求先分類ＣＤ９.<p>
	 *
	 */
	public void bcst_grp_cd9(String value) {
		setConstString(offset + 95, $bcst_grp_cd9, value);
	}


	/**
	 * Billing customer classification name 9 請求先分類名９.<p>
	 *
	 */
	public String bcst_grp_nm9() {
		return getConstString(offset + 96, $bcst_grp_nm9);
	}

	/**
	 * Billing customer classification name 9 請求先分類名９.<p>
	 *
	 */
	public void bcst_grp_nm9(String value) {
		setConstString(offset + 96, $bcst_grp_nm9, value);
	}


	/**
	 * Billing customer classification 10 請求先分類１０.<p>
	 *
	 */
	public boolean bcst_grp_flg10() {
		return getConstBoolean(offset + 97, $bcst_grp_flg10);
	}

	/**
	 * Billing customer classification 10 請求先分類１０.<p>
	 *
	 */
	public void bcst_grp_flg10(boolean value) {
		setConstBoolean(offset + 97, $bcst_grp_flg10, value);
	}


	/**
	 * Billing customer classification cd. 10 請求先分類ＣＤ１０.<p>
	 *
	 */
	public String bcst_grp_cd10() {
		return getConstString(offset + 98, $bcst_grp_cd10);
	}

	/**
	 * Billing customer classification cd. 10 請求先分類ＣＤ１０.<p>
	 *
	 */
	public void bcst_grp_cd10(String value) {
		setConstString(offset + 98, $bcst_grp_cd10, value);
	}


	/**
	 * Billing customer classification name 10 請求先分類名１０.<p>
	 *
	 */
	public String bcst_grp_nm10() {
		return getConstString(offset + 99, $bcst_grp_nm10);
	}

	/**
	 * Billing customer classification name 10 請求先分類名１０.<p>
	 *
	 */
	public void bcst_grp_nm10(String value) {
		setConstString(offset + 99, $bcst_grp_nm10, value);
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
		if ($gen_rcv_no.equalsIgnoreCase(name)) {
			return gen_rcv_no();
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
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
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
		if ($gen_rcv_no.equalsIgnoreCase(name)) {
			return gen_rcv_no();
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
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
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
		if ($gen_rcv_no.equalsIgnoreCase(name)) {
			gen_rcv_no(value);
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
		if ($gen_rcv_no.equalsIgnoreCase(name)) {
			gen_rcv_no(value);
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

