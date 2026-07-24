package mcframe.serverMSBG.MSBGL0190;

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
	 * Outstanding 未決済.<p>
	 *
	 */
	public static final String $not_mat_flg = "not_mat_flg";
	/**
	 * Settlement 決済.<p>
	 *
	 */
	public static final String $mat_flg = "mat_flg";
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
	 * Drawing date FROM 振出日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $draw_dt_fr = "draw_dt_fr";
	/**
	 * Drawing date TO 振出日ＴＯ.<p>
	 *
	 */
	public static final String $draw_dt_to = "draw_dt_to";
	/**
	 * Payment due date FROM 支払期日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $due_dt_fr = "due_dt_fr";
	/**
	 * Payment due date TO 支払期日ＴＯ.<p>
	 *
	 */
	public static final String $due_dt_to = "due_dt_to";
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
	 * Note number 手形番号.<p>
	 *
	 */
	public static final String $note_no = "note_no";
	/**
	 * Note type 手形区分.<p>
	 *
	 */
	public static final String $note_typ = "note_typ";
	/**
	 * Drawer name 振出人名.<p>
	 *
	 */
	public static final String $drawer_nm = "drawer_nm";
	/**
	 * Note reason cd. 手形理由ＣＤ.<p>
	 *
	 */
	public static final String $note_rsn_cd = "note_rsn_cd";
	/**
	 * Note reason name 手形理由名.<p>
	 *
	 */
	public static final String $note_rsn_nm = "note_rsn_nm";
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
	 * Payment received No. 入金ＮＯ.<p>
	 *
	 */
	public static final String $rcv_no = "rcv_no";
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
	 * Payment received result No. 入金実績ＮＯ.<p>
	 *
	 */
	public static final String $rcv_act_no = "rcv_act_no";
	/**
	 * Note spare 1 手形予備１.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	/**
	 * Note spare 2 手形予備２.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	/**
	 * Note spare 3 手形予備３.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";
	/**
	 * Payer classification 1 入金先分類１.<p>
	 *
	 */
	public static final String $rcv_grp_flg1 = "rcv_grp_flg1";
	/**
	 * Payer classification cd. 1 入金先分類ＣＤ１.<p>
	 *
	 */
	public static final String $rcv_grp_cd1 = "rcv_grp_cd1";
	/**
	 * Payer classification name 1 入金先分類名１.<p>
	 *
	 */
	public static final String $rcv_grp_nm1 = "rcv_grp_nm1";
	/**
	 * Payer classification 2 入金先分類２.<p>
	 *
	 */
	public static final String $rcv_grp_flg2 = "rcv_grp_flg2";
	/**
	 * Payer classification cd. 2 入金先分類ＣＤ２.<p>
	 *
	 */
	public static final String $rcv_grp_cd2 = "rcv_grp_cd2";
	/**
	 * Payer classification name 2 入金先分類名２.<p>
	 *
	 */
	public static final String $rcv_grp_nm2 = "rcv_grp_nm2";
	/**
	 * Payer classification 3 入金先分類３.<p>
	 *
	 */
	public static final String $rcv_grp_flg3 = "rcv_grp_flg3";
	/**
	 * Payer classification cd. 3 入金先分類ＣＤ３.<p>
	 *
	 */
	public static final String $rcv_grp_cd3 = "rcv_grp_cd3";
	/**
	 * Payer classification name 3 入金先分類名３.<p>
	 *
	 */
	public static final String $rcv_grp_nm3 = "rcv_grp_nm3";
	/**
	 * Payer classification 4 入金先分類４.<p>
	 *
	 */
	public static final String $rcv_grp_flg4 = "rcv_grp_flg4";
	/**
	 * Payer classification cd. 4 入金先分類ＣＤ４.<p>
	 *
	 */
	public static final String $rcv_grp_cd4 = "rcv_grp_cd4";
	/**
	 * Payer classification name 4 入金先分類名４.<p>
	 *
	 */
	public static final String $rcv_grp_nm4 = "rcv_grp_nm4";
	/**
	 * Payer classification 5 入金先分類５.<p>
	 *
	 */
	public static final String $rcv_grp_flg5 = "rcv_grp_flg5";
	/**
	 * Payer classification cd. 5 入金先分類ＣＤ５.<p>
	 *
	 */
	public static final String $rcv_grp_cd5 = "rcv_grp_cd5";
	/**
	 * Payer classification name 5 入金先分類名５.<p>
	 *
	 */
	public static final String $rcv_grp_nm5 = "rcv_grp_nm5";
	/**
	 * Payer classification 6 入金先分類６.<p>
	 *
	 */
	public static final String $rcv_grp_flg6 = "rcv_grp_flg6";
	/**
	 * Payer classification cd. 6 入金先分類ＣＤ６.<p>
	 *
	 */
	public static final String $rcv_grp_cd6 = "rcv_grp_cd6";
	/**
	 * Payer classification name 6 入金先分類名６.<p>
	 *
	 */
	public static final String $rcv_grp_nm6 = "rcv_grp_nm6";
	/**
	 * Payer classification 7 入金先分類７.<p>
	 *
	 */
	public static final String $rcv_grp_flg7 = "rcv_grp_flg7";
	/**
	 * Payer classification cd. 7 入金先分類ＣＤ７.<p>
	 *
	 */
	public static final String $rcv_grp_cd7 = "rcv_grp_cd7";
	/**
	 * Payer classification name 7 入金先分類名７.<p>
	 *
	 */
	public static final String $rcv_grp_nm7 = "rcv_grp_nm7";
	/**
	 * Payer classification 8 入金先分類８.<p>
	 *
	 */
	public static final String $rcv_grp_flg8 = "rcv_grp_flg8";
	/**
	 * Payer classification cd. 8 入金先分類ＣＤ８.<p>
	 *
	 */
	public static final String $rcv_grp_cd8 = "rcv_grp_cd8";
	/**
	 * Payer classification name 8 入金先分類名８.<p>
	 *
	 */
	public static final String $rcv_grp_nm8 = "rcv_grp_nm8";
	/**
	 * Payer classification 9 入金先分類９.<p>
	 *
	 */
	public static final String $rcv_grp_flg9 = "rcv_grp_flg9";
	/**
	 * Payer classification cd. 9 入金先分類ＣＤ９.<p>
	 *
	 */
	public static final String $rcv_grp_cd9 = "rcv_grp_cd9";
	/**
	 * Payer classification name 9 入金先分類名９.<p>
	 *
	 */
	public static final String $rcv_grp_nm9 = "rcv_grp_nm9";
	/**
	 * Payer classification 10 入金先分類１０.<p>
	 *
	 */
	public static final String $rcv_grp_flg10 = "rcv_grp_flg10";
	/**
	 * Payer classification cd. 10 入金先分類ＣＤ１０.<p>
	 *
	 */
	public static final String $rcv_grp_cd10 = "rcv_grp_cd10";
	/**
	 * Payer classification name 10 入金先分類名１０.<p>
	 *
	 */
	public static final String $rcv_grp_nm10 = "rcv_grp_nm10";
	/**
	 * Billing customer classification 1 請求先分類１.<p>
	 *
	 */
	public static final String $bill_grp_flg1 = "bill_grp_flg1";
	/**
	 * Billing customer classification cd. 1 請求先分類ＣＤ１.<p>
	 *
	 */
	public static final String $bill_grp_cd1 = "bill_grp_cd1";
	/**
	 * Billing customer classification name 1 請求先分類名１.<p>
	 *
	 */
	public static final String $bill_grp_nm1 = "bill_grp_nm1";
	/**
	 * Billing customer classification 2 請求先分類２.<p>
	 *
	 */
	public static final String $bill_grp_flg2 = "bill_grp_flg2";
	/**
	 * Billing customer classification cd. 2 請求先分類ＣＤ２.<p>
	 *
	 */
	public static final String $bill_grp_cd2 = "bill_grp_cd2";
	/**
	 * Billing customer classification name 2 請求先分類名２.<p>
	 *
	 */
	public static final String $bill_grp_nm2 = "bill_grp_nm2";
	/**
	 * Billing customer classification 3 請求先分類３.<p>
	 *
	 */
	public static final String $bill_grp_flg3 = "bill_grp_flg3";
	/**
	 * Billing customer classification cd. 3 請求先分類ＣＤ３.<p>
	 *
	 */
	public static final String $bill_grp_cd3 = "bill_grp_cd3";
	/**
	 * Billing customer classification name 3 請求先分類名３.<p>
	 *
	 */
	public static final String $bill_grp_nm3 = "bill_grp_nm3";
	/**
	 * Billing customer classification 4 請求先分類４.<p>
	 *
	 */
	public static final String $bill_grp_flg4 = "bill_grp_flg4";
	/**
	 * Billing customer classification cd. 4 請求先分類ＣＤ４.<p>
	 *
	 */
	public static final String $bill_grp_cd4 = "bill_grp_cd4";
	/**
	 * Billing customer classification name 4 請求先分類名４.<p>
	 *
	 */
	public static final String $bill_grp_nm4 = "bill_grp_nm4";
	/**
	 * Billing customer classification 5 請求先分類５.<p>
	 *
	 */
	public static final String $bill_grp_flg5 = "bill_grp_flg5";
	/**
	 * Billing customer classification cd. 5 請求先分類ＣＤ５.<p>
	 *
	 */
	public static final String $bill_grp_cd5 = "bill_grp_cd5";
	/**
	 * Billing customer classification name 5 請求先分類名５.<p>
	 *
	 */
	public static final String $bill_grp_nm5 = "bill_grp_nm5";
	/**
	 * Billing customer classification 6 請求先分類６.<p>
	 *
	 */
	public static final String $bill_grp_flg6 = "bill_grp_flg6";
	/**
	 * Billing customer classification cd. 6 請求先分類ＣＤ６.<p>
	 *
	 */
	public static final String $bill_grp_cd6 = "bill_grp_cd6";
	/**
	 * Billing customer classification name 6 請求先分類名６.<p>
	 *
	 */
	public static final String $bill_grp_nm6 = "bill_grp_nm6";
	/**
	 * Billing customer classification 7 請求先分類７.<p>
	 *
	 */
	public static final String $bill_grp_flg7 = "bill_grp_flg7";
	/**
	 * Billing customer classification cd. 7 請求先分類ＣＤ７.<p>
	 *
	 */
	public static final String $bill_grp_cd7 = "bill_grp_cd7";
	/**
	 * Billing customer classification name 7 請求先分類名７.<p>
	 *
	 */
	public static final String $bill_grp_nm7 = "bill_grp_nm7";
	/**
	 * Billing customer classification 8 請求先分類８.<p>
	 *
	 */
	public static final String $bill_grp_flg8 = "bill_grp_flg8";
	/**
	 * Billing customer classification cd. 8 請求先分類ＣＤ８.<p>
	 *
	 */
	public static final String $bill_grp_cd8 = "bill_grp_cd8";
	/**
	 * Billing customer classification name 8 請求先分類名８.<p>
	 *
	 */
	public static final String $bill_grp_nm8 = "bill_grp_nm8";
	/**
	 * Billing customer classification 9 請求先分類９.<p>
	 *
	 */
	public static final String $bill_grp_flg9 = "bill_grp_flg9";
	/**
	 * Billing customer classification cd. 9 請求先分類ＣＤ９.<p>
	 *
	 */
	public static final String $bill_grp_cd9 = "bill_grp_cd9";
	/**
	 * Billing customer classification name 9 請求先分類名９.<p>
	 *
	 */
	public static final String $bill_grp_nm9 = "bill_grp_nm9";
	/**
	 * Billing customer classification 10 請求先分類１０.<p>
	 *
	 */
	public static final String $bill_grp_flg10 = "bill_grp_flg10";
	/**
	 * Billing customer classification cd. 10 請求先分類ＣＤ１０.<p>
	 *
	 */
	public static final String $bill_grp_cd10 = "bill_grp_cd10";
	/**
	 * Billing customer classification name 10 請求先分類名１０.<p>
	 *
	 */
	public static final String $bill_grp_nm10 = "bill_grp_nm10";


	public static final MCMeta not_mat_flg_META = createCommonMeta($not_mat_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mat_flg_META = createCommonMeta($mat_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta fb_t_flg_META = createCommonMeta($fb_t_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta fb_f_flg_META = createCommonMeta($fb_f_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcv_dt_fr_META = createCommonMeta($rcv_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rcv_dt_to_META = createCommonMeta($rcv_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta draw_dt_fr_META = createCommonMeta($draw_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta draw_dt_to_META = createCommonMeta($draw_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta due_dt_fr_META = createCommonMeta($due_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta due_dt_to_META = createCommonMeta($due_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rcst_cd_META = createCommonMeta($rcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta rcst_nm_META = createCommonMeta($rcst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta rcv_dpt_cd_META = createCommonMeta($rcv_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta rcv_dpt_nm_META = createCommonMeta($rcv_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta rcv_usr_cd_META = createCommonMeta($rcv_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta rcv_usr_nm_META = createCommonMeta($rcv_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta bcst_cd_META = createCommonMeta($bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bcst_nm_META = createCommonMeta($bcst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bill_dpt_cd_META = createCommonMeta($bill_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bill_dpt_nm_META = createCommonMeta($bill_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta note_no_META = createCommonMeta($note_no, mcframe.commonMA.meta.MA_META.NOTE_NO);
	public static final MCMeta note_typ_META = createCommonMeta($note_typ, mcframe.commonMA.meta.MA_META.NOTE_TYP);
	public static final MCMeta drawer_nm_META = createCommonMeta($drawer_nm, mcframe.commonMA.meta.MA_META.DRAWER_NM);
	public static final MCMeta note_rsn_cd_META = createCommonMeta($note_rsn_cd, mcframe.commonMA.meta.MA_META.NOTE_RSN_CD);
	public static final MCMeta note_rsn_nm_META = createCommonMeta($note_rsn_nm, mcframe.commonMA.meta.MA_META.NOTE_RSN_NM);
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta cur_nm_META = createCommonMeta($cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta rcv_no_META = createCommonMeta($rcv_no, mcframe.commonMA.meta.MA_META.RCV_NO);
	public static final MCMeta rcv_mtd_cd_META = createCommonMeta($rcv_mtd_cd, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta rcv_mtd_nm_META = createCommonMeta($rcv_mtd_nm, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta rcv_act_no_META = createCommonMeta($rcv_act_no, mcframe.commonMA.meta.MA_META.RCV_ACT_NO);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.NOTE_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.NOTE_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.NOTE_SUB_CHAR3);
	public static final MCMeta rcv_grp_flg1_META = createCommonMeta($rcv_grp_flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcv_grp_cd1_META = createCommonMeta($rcv_grp_cd1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta rcv_grp_nm1_META = createCommonMeta($rcv_grp_nm1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta rcv_grp_flg2_META = createCommonMeta($rcv_grp_flg2, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcv_grp_cd2_META = createCommonMeta($rcv_grp_cd2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta rcv_grp_nm2_META = createCommonMeta($rcv_grp_nm2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta rcv_grp_flg3_META = createCommonMeta($rcv_grp_flg3, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcv_grp_cd3_META = createCommonMeta($rcv_grp_cd3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta rcv_grp_nm3_META = createCommonMeta($rcv_grp_nm3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta rcv_grp_flg4_META = createCommonMeta($rcv_grp_flg4, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcv_grp_cd4_META = createCommonMeta($rcv_grp_cd4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta rcv_grp_nm4_META = createCommonMeta($rcv_grp_nm4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta rcv_grp_flg5_META = createCommonMeta($rcv_grp_flg5, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcv_grp_cd5_META = createCommonMeta($rcv_grp_cd5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta rcv_grp_nm5_META = createCommonMeta($rcv_grp_nm5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta rcv_grp_flg6_META = createCommonMeta($rcv_grp_flg6, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcv_grp_cd6_META = createCommonMeta($rcv_grp_cd6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta rcv_grp_nm6_META = createCommonMeta($rcv_grp_nm6, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta rcv_grp_flg7_META = createCommonMeta($rcv_grp_flg7, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcv_grp_cd7_META = createCommonMeta($rcv_grp_cd7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta rcv_grp_nm7_META = createCommonMeta($rcv_grp_nm7, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta rcv_grp_flg8_META = createCommonMeta($rcv_grp_flg8, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcv_grp_cd8_META = createCommonMeta($rcv_grp_cd8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta rcv_grp_nm8_META = createCommonMeta($rcv_grp_nm8, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta rcv_grp_flg9_META = createCommonMeta($rcv_grp_flg9, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcv_grp_cd9_META = createCommonMeta($rcv_grp_cd9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta rcv_grp_nm9_META = createCommonMeta($rcv_grp_nm9, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta rcv_grp_flg10_META = createCommonMeta($rcv_grp_flg10, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcv_grp_cd10_META = createCommonMeta($rcv_grp_cd10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta rcv_grp_nm10_META = createCommonMeta($rcv_grp_nm10, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bill_grp_flg1_META = createCommonMeta($bill_grp_flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_grp_cd1_META = createCommonMeta($bill_grp_cd1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bill_grp_nm1_META = createCommonMeta($bill_grp_nm1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bill_grp_flg2_META = createCommonMeta($bill_grp_flg2, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_grp_cd2_META = createCommonMeta($bill_grp_cd2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bill_grp_nm2_META = createCommonMeta($bill_grp_nm2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bill_grp_flg3_META = createCommonMeta($bill_grp_flg3, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_grp_cd3_META = createCommonMeta($bill_grp_cd3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bill_grp_nm3_META = createCommonMeta($bill_grp_nm3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bill_grp_flg4_META = createCommonMeta($bill_grp_flg4, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_grp_cd4_META = createCommonMeta($bill_grp_cd4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bill_grp_nm4_META = createCommonMeta($bill_grp_nm4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bill_grp_flg5_META = createCommonMeta($bill_grp_flg5, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_grp_cd5_META = createCommonMeta($bill_grp_cd5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bill_grp_nm5_META = createCommonMeta($bill_grp_nm5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bill_grp_flg6_META = createCommonMeta($bill_grp_flg6, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_grp_cd6_META = createCommonMeta($bill_grp_cd6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bill_grp_nm6_META = createCommonMeta($bill_grp_nm6, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bill_grp_flg7_META = createCommonMeta($bill_grp_flg7, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_grp_cd7_META = createCommonMeta($bill_grp_cd7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bill_grp_nm7_META = createCommonMeta($bill_grp_nm7, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bill_grp_flg8_META = createCommonMeta($bill_grp_flg8, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_grp_cd8_META = createCommonMeta($bill_grp_cd8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bill_grp_nm8_META = createCommonMeta($bill_grp_nm8, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bill_grp_flg9_META = createCommonMeta($bill_grp_flg9, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_grp_cd9_META = createCommonMeta($bill_grp_cd9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bill_grp_nm9_META = createCommonMeta($bill_grp_nm9, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bill_grp_flg10_META = createCommonMeta($bill_grp_flg10, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_grp_cd10_META = createCommonMeta($bill_grp_cd10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bill_grp_nm10_META = createCommonMeta($bill_grp_nm10, mcframe.commonMA.meta.MA_META.BP_GRP_NM);

	protected static final ConstMetaList<Srch01_CndR> constMetas = new ConstMetaList<Srch01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			not_mat_flg_META,
			mat_flg_META,
			fb_t_flg_META,
			fb_f_flg_META,
			rcv_dt_fr_META,
			rcv_dt_to_META,
			draw_dt_fr_META,
			draw_dt_to_META,
			due_dt_fr_META,
			due_dt_to_META,
			rcst_cd_META,
			rcst_nm_META,
			rcv_dpt_cd_META,
			rcv_dpt_nm_META,
			wg_cd_META,
			wg_nm_META,
			rcv_usr_cd_META,
			rcv_usr_nm_META,
			bcst_cd_META,
			bcst_nm_META,
			bill_dpt_cd_META,
			bill_dpt_nm_META,
			note_no_META,
			note_typ_META,
			drawer_nm_META,
			note_rsn_cd_META,
			note_rsn_nm_META,
			cur_cd_META,
			cur_nm_META,
			rcv_no_META,
			rcv_mtd_cd_META,
			rcv_mtd_nm_META,
			rcv_act_no_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			rcv_grp_flg1_META,
			rcv_grp_cd1_META,
			rcv_grp_nm1_META,
			rcv_grp_flg2_META,
			rcv_grp_cd2_META,
			rcv_grp_nm2_META,
			rcv_grp_flg3_META,
			rcv_grp_cd3_META,
			rcv_grp_nm3_META,
			rcv_grp_flg4_META,
			rcv_grp_cd4_META,
			rcv_grp_nm4_META,
			rcv_grp_flg5_META,
			rcv_grp_cd5_META,
			rcv_grp_nm5_META,
			rcv_grp_flg6_META,
			rcv_grp_cd6_META,
			rcv_grp_nm6_META,
			rcv_grp_flg7_META,
			rcv_grp_cd7_META,
			rcv_grp_nm7_META,
			rcv_grp_flg8_META,
			rcv_grp_cd8_META,
			rcv_grp_nm8_META,
			rcv_grp_flg9_META,
			rcv_grp_cd9_META,
			rcv_grp_nm9_META,
			rcv_grp_flg10_META,
			rcv_grp_cd10_META,
			rcv_grp_nm10_META,
			bill_grp_flg1_META,
			bill_grp_cd1_META,
			bill_grp_nm1_META,
			bill_grp_flg2_META,
			bill_grp_cd2_META,
			bill_grp_nm2_META,
			bill_grp_flg3_META,
			bill_grp_cd3_META,
			bill_grp_nm3_META,
			bill_grp_flg4_META,
			bill_grp_cd4_META,
			bill_grp_nm4_META,
			bill_grp_flg5_META,
			bill_grp_cd5_META,
			bill_grp_nm5_META,
			bill_grp_flg6_META,
			bill_grp_cd6_META,
			bill_grp_nm6_META,
			bill_grp_flg7_META,
			bill_grp_cd7_META,
			bill_grp_nm7_META,
			bill_grp_flg8_META,
			bill_grp_cd8_META,
			bill_grp_nm8_META,
			bill_grp_flg9_META,
			bill_grp_cd9_META,
			bill_grp_nm9_META,
			bill_grp_flg10_META,
			bill_grp_cd10_META,
			bill_grp_nm10_META
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
	 * Outstanding 未決済.<p>
	 *
	 */
	public boolean not_mat_flg() {
		return getConstBoolean(offset + 0, $not_mat_flg);
	}

	/**
	 * Outstanding 未決済.<p>
	 *
	 */
	public void not_mat_flg(boolean value) {
		setConstBoolean(offset + 0, $not_mat_flg, value);
	}


	/**
	 * Settlement 決済.<p>
	 *
	 */
	public boolean mat_flg() {
		return getConstBoolean(offset + 1, $mat_flg);
	}

	/**
	 * Settlement 決済.<p>
	 *
	 */
	public void mat_flg(boolean value) {
		setConstBoolean(offset + 1, $mat_flg, value);
	}


	/**
	 * Target 対象.<p>
	 *
	 */
	public boolean fb_t_flg() {
		return getConstBoolean(offset + 2, $fb_t_flg);
	}

	/**
	 * Target 対象.<p>
	 *
	 */
	public void fb_t_flg(boolean value) {
		setConstBoolean(offset + 2, $fb_t_flg, value);
	}


	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public boolean fb_f_flg() {
		return getConstBoolean(offset + 3, $fb_f_flg);
	}

	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public void fb_f_flg(boolean value) {
		setConstBoolean(offset + 3, $fb_f_flg, value);
	}


	/**
	 * Payment received date FROM 入金日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate rcv_dt_fr() {
		return getConstDate(offset + 4, $rcv_dt_fr);
	}

	/**
	 * Payment received date FROM 入金日ＦＲＯＭ.<p>
	 *
	 */
	public void rcv_dt_fr(MCDate value) {
		setConstDate(offset + 4, $rcv_dt_fr, value);
	}


	/**
	 * Payment received date 入金日ＴＯ.<p>
	 *
	 */
	public MCDate rcv_dt_to() {
		return getConstDate(offset + 5, $rcv_dt_to);
	}

	/**
	 * Payment received date 入金日ＴＯ.<p>
	 *
	 */
	public void rcv_dt_to(MCDate value) {
		setConstDate(offset + 5, $rcv_dt_to, value);
	}


	/**
	 * Drawing date FROM 振出日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate draw_dt_fr() {
		return getConstDate(offset + 6, $draw_dt_fr);
	}

	/**
	 * Drawing date FROM 振出日ＦＲＯＭ.<p>
	 *
	 */
	public void draw_dt_fr(MCDate value) {
		setConstDate(offset + 6, $draw_dt_fr, value);
	}


	/**
	 * Drawing date TO 振出日ＴＯ.<p>
	 *
	 */
	public MCDate draw_dt_to() {
		return getConstDate(offset + 7, $draw_dt_to);
	}

	/**
	 * Drawing date TO 振出日ＴＯ.<p>
	 *
	 */
	public void draw_dt_to(MCDate value) {
		setConstDate(offset + 7, $draw_dt_to, value);
	}


	/**
	 * Payment due date FROM 支払期日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate due_dt_fr() {
		return getConstDate(offset + 8, $due_dt_fr);
	}

	/**
	 * Payment due date FROM 支払期日ＦＲＯＭ.<p>
	 *
	 */
	public void due_dt_fr(MCDate value) {
		setConstDate(offset + 8, $due_dt_fr, value);
	}


	/**
	 * Payment due date TO 支払期日ＴＯ.<p>
	 *
	 */
	public MCDate due_dt_to() {
		return getConstDate(offset + 9, $due_dt_to);
	}

	/**
	 * Payment due date TO 支払期日ＴＯ.<p>
	 *
	 */
	public void due_dt_to(MCDate value) {
		setConstDate(offset + 9, $due_dt_to, value);
	}


	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public String rcst_cd() {
		return getConstString(offset + 10, $rcst_cd);
	}

	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public void rcst_cd(String value) {
		setConstString(offset + 10, $rcst_cd, value);
	}


	/**
	 * Payer name 入金先名.<p>
	 *
	 */
	public String rcst_nm() {
		return getConstString(offset + 11, $rcst_nm);
	}

	/**
	 * Payer name 入金先名.<p>
	 *
	 */
	public void rcst_nm(String value) {
		setConstString(offset + 11, $rcst_nm, value);
	}


	/**
	 * Payment receiving dept. cd. 入金部門ＣＤ.<p>
	 *
	 */
	public String rcv_dpt_cd() {
		return getConstString(offset + 12, $rcv_dpt_cd);
	}

	/**
	 * Payment receiving dept. cd. 入金部門ＣＤ.<p>
	 *
	 */
	public void rcv_dpt_cd(String value) {
		setConstString(offset + 12, $rcv_dpt_cd, value);
	}


	/**
	 * Payment receiving dept. name 入金部門名.<p>
	 *
	 */
	public String rcv_dpt_nm() {
		return getConstString(offset + 13, $rcv_dpt_nm);
	}

	/**
	 * Payment receiving dept. name 入金部門名.<p>
	 *
	 */
	public void rcv_dpt_nm(String value) {
		setConstString(offset + 13, $rcv_dpt_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 14, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 14, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 15, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 15, $wg_nm, value);
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
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public String bcst_cd() {
		return getConstString(offset + 18, $bcst_cd);
	}

	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public void bcst_cd(String value) {
		setConstString(offset + 18, $bcst_cd, value);
	}


	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public String bcst_nm() {
		return getConstString(offset + 19, $bcst_nm);
	}

	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public void bcst_nm(String value) {
		setConstString(offset + 19, $bcst_nm, value);
	}


	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public String bill_dpt_cd() {
		return getConstString(offset + 20, $bill_dpt_cd);
	}

	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public void bill_dpt_cd(String value) {
		setConstString(offset + 20, $bill_dpt_cd, value);
	}


	/**
	 * Billing dept. name 請求部門名.<p>
	 *
	 */
	public String bill_dpt_nm() {
		return getConstString(offset + 21, $bill_dpt_nm);
	}

	/**
	 * Billing dept. name 請求部門名.<p>
	 *
	 */
	public void bill_dpt_nm(String value) {
		setConstString(offset + 21, $bill_dpt_nm, value);
	}


	/**
	 * Note number 手形番号.<p>
	 *
	 */
	public String note_no() {
		return getConstString(offset + 22, $note_no);
	}

	/**
	 * Note number 手形番号.<p>
	 *
	 */
	public void note_no(String value) {
		setConstString(offset + 22, $note_no, value);
	}


	/**
	 * Note type 手形区分.<p>
	 *
	 */
	public String note_typ() {
		return getConstString(offset + 23, $note_typ);
	}

	/**
	 * Note type 手形区分.<p>
	 *
	 */
	public void note_typ(String value) {
		setConstString(offset + 23, $note_typ, value);
	}


	/**
	 * Drawer name 振出人名.<p>
	 *
	 */
	public String drawer_nm() {
		return getConstString(offset + 24, $drawer_nm);
	}

	/**
	 * Drawer name 振出人名.<p>
	 *
	 */
	public void drawer_nm(String value) {
		setConstString(offset + 24, $drawer_nm, value);
	}


	/**
	 * Note reason cd. 手形理由ＣＤ.<p>
	 *
	 */
	public String note_rsn_cd() {
		return getConstString(offset + 25, $note_rsn_cd);
	}

	/**
	 * Note reason cd. 手形理由ＣＤ.<p>
	 *
	 */
	public void note_rsn_cd(String value) {
		setConstString(offset + 25, $note_rsn_cd, value);
	}


	/**
	 * Note reason name 手形理由名.<p>
	 *
	 */
	public String note_rsn_nm() {
		return getConstString(offset + 26, $note_rsn_nm);
	}

	/**
	 * Note reason name 手形理由名.<p>
	 *
	 */
	public void note_rsn_nm(String value) {
		setConstString(offset + 26, $note_rsn_nm, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 27, $cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 27, $cur_cd, value);
	}


	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public String cur_nm() {
		return getConstString(offset + 28, $cur_nm);
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public void cur_nm(String value) {
		setConstString(offset + 28, $cur_nm, value);
	}


	/**
	 * Payment received No. 入金ＮＯ.<p>
	 *
	 */
	public String rcv_no() {
		return getConstString(offset + 29, $rcv_no);
	}

	/**
	 * Payment received No. 入金ＮＯ.<p>
	 *
	 */
	public void rcv_no(String value) {
		setConstString(offset + 29, $rcv_no, value);
	}


	/**
	 * Payment received method cd. 入金方法ＣＤ.<p>
	 *
	 */
	public String rcv_mtd_cd() {
		return getConstString(offset + 30, $rcv_mtd_cd);
	}

	/**
	 * Payment received method cd. 入金方法ＣＤ.<p>
	 *
	 */
	public void rcv_mtd_cd(String value) {
		setConstString(offset + 30, $rcv_mtd_cd, value);
	}


	/**
	 * Payment received method name 入金方法名.<p>
	 *
	 */
	public String rcv_mtd_nm() {
		return getConstString(offset + 31, $rcv_mtd_nm);
	}

	/**
	 * Payment received method name 入金方法名.<p>
	 *
	 */
	public void rcv_mtd_nm(String value) {
		setConstString(offset + 31, $rcv_mtd_nm, value);
	}


	/**
	 * Payment received result No. 入金実績ＮＯ.<p>
	 *
	 */
	public String rcv_act_no() {
		return getConstString(offset + 32, $rcv_act_no);
	}

	/**
	 * Payment received result No. 入金実績ＮＯ.<p>
	 *
	 */
	public void rcv_act_no(String value) {
		setConstString(offset + 32, $rcv_act_no, value);
	}


	/**
	 * Note spare 1 手形予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 33, $sub_char1);
	}

	/**
	 * Note spare 1 手形予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 33, $sub_char1, value);
	}


	/**
	 * Note spare 2 手形予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 34, $sub_char2);
	}

	/**
	 * Note spare 2 手形予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 34, $sub_char2, value);
	}


	/**
	 * Note spare 3 手形予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 35, $sub_char3);
	}

	/**
	 * Note spare 3 手形予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 35, $sub_char3, value);
	}


	/**
	 * Payer classification 1 入金先分類１.<p>
	 *
	 */
	public boolean rcv_grp_flg1() {
		return getConstBoolean(offset + 36, $rcv_grp_flg1);
	}

	/**
	 * Payer classification 1 入金先分類１.<p>
	 *
	 */
	public void rcv_grp_flg1(boolean value) {
		setConstBoolean(offset + 36, $rcv_grp_flg1, value);
	}


	/**
	 * Payer classification cd. 1 入金先分類ＣＤ１.<p>
	 *
	 */
	public String rcv_grp_cd1() {
		return getConstString(offset + 37, $rcv_grp_cd1);
	}

	/**
	 * Payer classification cd. 1 入金先分類ＣＤ１.<p>
	 *
	 */
	public void rcv_grp_cd1(String value) {
		setConstString(offset + 37, $rcv_grp_cd1, value);
	}


	/**
	 * Payer classification name 1 入金先分類名１.<p>
	 *
	 */
	public String rcv_grp_nm1() {
		return getConstString(offset + 38, $rcv_grp_nm1);
	}

	/**
	 * Payer classification name 1 入金先分類名１.<p>
	 *
	 */
	public void rcv_grp_nm1(String value) {
		setConstString(offset + 38, $rcv_grp_nm1, value);
	}


	/**
	 * Payer classification 2 入金先分類２.<p>
	 *
	 */
	public boolean rcv_grp_flg2() {
		return getConstBoolean(offset + 39, $rcv_grp_flg2);
	}

	/**
	 * Payer classification 2 入金先分類２.<p>
	 *
	 */
	public void rcv_grp_flg2(boolean value) {
		setConstBoolean(offset + 39, $rcv_grp_flg2, value);
	}


	/**
	 * Payer classification cd. 2 入金先分類ＣＤ２.<p>
	 *
	 */
	public String rcv_grp_cd2() {
		return getConstString(offset + 40, $rcv_grp_cd2);
	}

	/**
	 * Payer classification cd. 2 入金先分類ＣＤ２.<p>
	 *
	 */
	public void rcv_grp_cd2(String value) {
		setConstString(offset + 40, $rcv_grp_cd2, value);
	}


	/**
	 * Payer classification name 2 入金先分類名２.<p>
	 *
	 */
	public String rcv_grp_nm2() {
		return getConstString(offset + 41, $rcv_grp_nm2);
	}

	/**
	 * Payer classification name 2 入金先分類名２.<p>
	 *
	 */
	public void rcv_grp_nm2(String value) {
		setConstString(offset + 41, $rcv_grp_nm2, value);
	}


	/**
	 * Payer classification 3 入金先分類３.<p>
	 *
	 */
	public boolean rcv_grp_flg3() {
		return getConstBoolean(offset + 42, $rcv_grp_flg3);
	}

	/**
	 * Payer classification 3 入金先分類３.<p>
	 *
	 */
	public void rcv_grp_flg3(boolean value) {
		setConstBoolean(offset + 42, $rcv_grp_flg3, value);
	}


	/**
	 * Payer classification cd. 3 入金先分類ＣＤ３.<p>
	 *
	 */
	public String rcv_grp_cd3() {
		return getConstString(offset + 43, $rcv_grp_cd3);
	}

	/**
	 * Payer classification cd. 3 入金先分類ＣＤ３.<p>
	 *
	 */
	public void rcv_grp_cd3(String value) {
		setConstString(offset + 43, $rcv_grp_cd3, value);
	}


	/**
	 * Payer classification name 3 入金先分類名３.<p>
	 *
	 */
	public String rcv_grp_nm3() {
		return getConstString(offset + 44, $rcv_grp_nm3);
	}

	/**
	 * Payer classification name 3 入金先分類名３.<p>
	 *
	 */
	public void rcv_grp_nm3(String value) {
		setConstString(offset + 44, $rcv_grp_nm3, value);
	}


	/**
	 * Payer classification 4 入金先分類４.<p>
	 *
	 */
	public boolean rcv_grp_flg4() {
		return getConstBoolean(offset + 45, $rcv_grp_flg4);
	}

	/**
	 * Payer classification 4 入金先分類４.<p>
	 *
	 */
	public void rcv_grp_flg4(boolean value) {
		setConstBoolean(offset + 45, $rcv_grp_flg4, value);
	}


	/**
	 * Payer classification cd. 4 入金先分類ＣＤ４.<p>
	 *
	 */
	public String rcv_grp_cd4() {
		return getConstString(offset + 46, $rcv_grp_cd4);
	}

	/**
	 * Payer classification cd. 4 入金先分類ＣＤ４.<p>
	 *
	 */
	public void rcv_grp_cd4(String value) {
		setConstString(offset + 46, $rcv_grp_cd4, value);
	}


	/**
	 * Payer classification name 4 入金先分類名４.<p>
	 *
	 */
	public String rcv_grp_nm4() {
		return getConstString(offset + 47, $rcv_grp_nm4);
	}

	/**
	 * Payer classification name 4 入金先分類名４.<p>
	 *
	 */
	public void rcv_grp_nm4(String value) {
		setConstString(offset + 47, $rcv_grp_nm4, value);
	}


	/**
	 * Payer classification 5 入金先分類５.<p>
	 *
	 */
	public boolean rcv_grp_flg5() {
		return getConstBoolean(offset + 48, $rcv_grp_flg5);
	}

	/**
	 * Payer classification 5 入金先分類５.<p>
	 *
	 */
	public void rcv_grp_flg5(boolean value) {
		setConstBoolean(offset + 48, $rcv_grp_flg5, value);
	}


	/**
	 * Payer classification cd. 5 入金先分類ＣＤ５.<p>
	 *
	 */
	public String rcv_grp_cd5() {
		return getConstString(offset + 49, $rcv_grp_cd5);
	}

	/**
	 * Payer classification cd. 5 入金先分類ＣＤ５.<p>
	 *
	 */
	public void rcv_grp_cd5(String value) {
		setConstString(offset + 49, $rcv_grp_cd5, value);
	}


	/**
	 * Payer classification name 5 入金先分類名５.<p>
	 *
	 */
	public String rcv_grp_nm5() {
		return getConstString(offset + 50, $rcv_grp_nm5);
	}

	/**
	 * Payer classification name 5 入金先分類名５.<p>
	 *
	 */
	public void rcv_grp_nm5(String value) {
		setConstString(offset + 50, $rcv_grp_nm5, value);
	}


	/**
	 * Payer classification 6 入金先分類６.<p>
	 *
	 */
	public boolean rcv_grp_flg6() {
		return getConstBoolean(offset + 51, $rcv_grp_flg6);
	}

	/**
	 * Payer classification 6 入金先分類６.<p>
	 *
	 */
	public void rcv_grp_flg6(boolean value) {
		setConstBoolean(offset + 51, $rcv_grp_flg6, value);
	}


	/**
	 * Payer classification cd. 6 入金先分類ＣＤ６.<p>
	 *
	 */
	public String rcv_grp_cd6() {
		return getConstString(offset + 52, $rcv_grp_cd6);
	}

	/**
	 * Payer classification cd. 6 入金先分類ＣＤ６.<p>
	 *
	 */
	public void rcv_grp_cd6(String value) {
		setConstString(offset + 52, $rcv_grp_cd6, value);
	}


	/**
	 * Payer classification name 6 入金先分類名６.<p>
	 *
	 */
	public String rcv_grp_nm6() {
		return getConstString(offset + 53, $rcv_grp_nm6);
	}

	/**
	 * Payer classification name 6 入金先分類名６.<p>
	 *
	 */
	public void rcv_grp_nm6(String value) {
		setConstString(offset + 53, $rcv_grp_nm6, value);
	}


	/**
	 * Payer classification 7 入金先分類７.<p>
	 *
	 */
	public boolean rcv_grp_flg7() {
		return getConstBoolean(offset + 54, $rcv_grp_flg7);
	}

	/**
	 * Payer classification 7 入金先分類７.<p>
	 *
	 */
	public void rcv_grp_flg7(boolean value) {
		setConstBoolean(offset + 54, $rcv_grp_flg7, value);
	}


	/**
	 * Payer classification cd. 7 入金先分類ＣＤ７.<p>
	 *
	 */
	public String rcv_grp_cd7() {
		return getConstString(offset + 55, $rcv_grp_cd7);
	}

	/**
	 * Payer classification cd. 7 入金先分類ＣＤ７.<p>
	 *
	 */
	public void rcv_grp_cd7(String value) {
		setConstString(offset + 55, $rcv_grp_cd7, value);
	}


	/**
	 * Payer classification name 7 入金先分類名７.<p>
	 *
	 */
	public String rcv_grp_nm7() {
		return getConstString(offset + 56, $rcv_grp_nm7);
	}

	/**
	 * Payer classification name 7 入金先分類名７.<p>
	 *
	 */
	public void rcv_grp_nm7(String value) {
		setConstString(offset + 56, $rcv_grp_nm7, value);
	}


	/**
	 * Payer classification 8 入金先分類８.<p>
	 *
	 */
	public boolean rcv_grp_flg8() {
		return getConstBoolean(offset + 57, $rcv_grp_flg8);
	}

	/**
	 * Payer classification 8 入金先分類８.<p>
	 *
	 */
	public void rcv_grp_flg8(boolean value) {
		setConstBoolean(offset + 57, $rcv_grp_flg8, value);
	}


	/**
	 * Payer classification cd. 8 入金先分類ＣＤ８.<p>
	 *
	 */
	public String rcv_grp_cd8() {
		return getConstString(offset + 58, $rcv_grp_cd8);
	}

	/**
	 * Payer classification cd. 8 入金先分類ＣＤ８.<p>
	 *
	 */
	public void rcv_grp_cd8(String value) {
		setConstString(offset + 58, $rcv_grp_cd8, value);
	}


	/**
	 * Payer classification name 8 入金先分類名８.<p>
	 *
	 */
	public String rcv_grp_nm8() {
		return getConstString(offset + 59, $rcv_grp_nm8);
	}

	/**
	 * Payer classification name 8 入金先分類名８.<p>
	 *
	 */
	public void rcv_grp_nm8(String value) {
		setConstString(offset + 59, $rcv_grp_nm8, value);
	}


	/**
	 * Payer classification 9 入金先分類９.<p>
	 *
	 */
	public boolean rcv_grp_flg9() {
		return getConstBoolean(offset + 60, $rcv_grp_flg9);
	}

	/**
	 * Payer classification 9 入金先分類９.<p>
	 *
	 */
	public void rcv_grp_flg9(boolean value) {
		setConstBoolean(offset + 60, $rcv_grp_flg9, value);
	}


	/**
	 * Payer classification cd. 9 入金先分類ＣＤ９.<p>
	 *
	 */
	public String rcv_grp_cd9() {
		return getConstString(offset + 61, $rcv_grp_cd9);
	}

	/**
	 * Payer classification cd. 9 入金先分類ＣＤ９.<p>
	 *
	 */
	public void rcv_grp_cd9(String value) {
		setConstString(offset + 61, $rcv_grp_cd9, value);
	}


	/**
	 * Payer classification name 9 入金先分類名９.<p>
	 *
	 */
	public String rcv_grp_nm9() {
		return getConstString(offset + 62, $rcv_grp_nm9);
	}

	/**
	 * Payer classification name 9 入金先分類名９.<p>
	 *
	 */
	public void rcv_grp_nm9(String value) {
		setConstString(offset + 62, $rcv_grp_nm9, value);
	}


	/**
	 * Payer classification 10 入金先分類１０.<p>
	 *
	 */
	public boolean rcv_grp_flg10() {
		return getConstBoolean(offset + 63, $rcv_grp_flg10);
	}

	/**
	 * Payer classification 10 入金先分類１０.<p>
	 *
	 */
	public void rcv_grp_flg10(boolean value) {
		setConstBoolean(offset + 63, $rcv_grp_flg10, value);
	}


	/**
	 * Payer classification cd. 10 入金先分類ＣＤ１０.<p>
	 *
	 */
	public String rcv_grp_cd10() {
		return getConstString(offset + 64, $rcv_grp_cd10);
	}

	/**
	 * Payer classification cd. 10 入金先分類ＣＤ１０.<p>
	 *
	 */
	public void rcv_grp_cd10(String value) {
		setConstString(offset + 64, $rcv_grp_cd10, value);
	}


	/**
	 * Payer classification name 10 入金先分類名１０.<p>
	 *
	 */
	public String rcv_grp_nm10() {
		return getConstString(offset + 65, $rcv_grp_nm10);
	}

	/**
	 * Payer classification name 10 入金先分類名１０.<p>
	 *
	 */
	public void rcv_grp_nm10(String value) {
		setConstString(offset + 65, $rcv_grp_nm10, value);
	}


	/**
	 * Billing customer classification 1 請求先分類１.<p>
	 *
	 */
	public boolean bill_grp_flg1() {
		return getConstBoolean(offset + 66, $bill_grp_flg1);
	}

	/**
	 * Billing customer classification 1 請求先分類１.<p>
	 *
	 */
	public void bill_grp_flg1(boolean value) {
		setConstBoolean(offset + 66, $bill_grp_flg1, value);
	}


	/**
	 * Billing customer classification cd. 1 請求先分類ＣＤ１.<p>
	 *
	 */
	public String bill_grp_cd1() {
		return getConstString(offset + 67, $bill_grp_cd1);
	}

	/**
	 * Billing customer classification cd. 1 請求先分類ＣＤ１.<p>
	 *
	 */
	public void bill_grp_cd1(String value) {
		setConstString(offset + 67, $bill_grp_cd1, value);
	}


	/**
	 * Billing customer classification name 1 請求先分類名１.<p>
	 *
	 */
	public String bill_grp_nm1() {
		return getConstString(offset + 68, $bill_grp_nm1);
	}

	/**
	 * Billing customer classification name 1 請求先分類名１.<p>
	 *
	 */
	public void bill_grp_nm1(String value) {
		setConstString(offset + 68, $bill_grp_nm1, value);
	}


	/**
	 * Billing customer classification 2 請求先分類２.<p>
	 *
	 */
	public boolean bill_grp_flg2() {
		return getConstBoolean(offset + 69, $bill_grp_flg2);
	}

	/**
	 * Billing customer classification 2 請求先分類２.<p>
	 *
	 */
	public void bill_grp_flg2(boolean value) {
		setConstBoolean(offset + 69, $bill_grp_flg2, value);
	}


	/**
	 * Billing customer classification cd. 2 請求先分類ＣＤ２.<p>
	 *
	 */
	public String bill_grp_cd2() {
		return getConstString(offset + 70, $bill_grp_cd2);
	}

	/**
	 * Billing customer classification cd. 2 請求先分類ＣＤ２.<p>
	 *
	 */
	public void bill_grp_cd2(String value) {
		setConstString(offset + 70, $bill_grp_cd2, value);
	}


	/**
	 * Billing customer classification name 2 請求先分類名２.<p>
	 *
	 */
	public String bill_grp_nm2() {
		return getConstString(offset + 71, $bill_grp_nm2);
	}

	/**
	 * Billing customer classification name 2 請求先分類名２.<p>
	 *
	 */
	public void bill_grp_nm2(String value) {
		setConstString(offset + 71, $bill_grp_nm2, value);
	}


	/**
	 * Billing customer classification 3 請求先分類３.<p>
	 *
	 */
	public boolean bill_grp_flg3() {
		return getConstBoolean(offset + 72, $bill_grp_flg3);
	}

	/**
	 * Billing customer classification 3 請求先分類３.<p>
	 *
	 */
	public void bill_grp_flg3(boolean value) {
		setConstBoolean(offset + 72, $bill_grp_flg3, value);
	}


	/**
	 * Billing customer classification cd. 3 請求先分類ＣＤ３.<p>
	 *
	 */
	public String bill_grp_cd3() {
		return getConstString(offset + 73, $bill_grp_cd3);
	}

	/**
	 * Billing customer classification cd. 3 請求先分類ＣＤ３.<p>
	 *
	 */
	public void bill_grp_cd3(String value) {
		setConstString(offset + 73, $bill_grp_cd3, value);
	}


	/**
	 * Billing customer classification name 3 請求先分類名３.<p>
	 *
	 */
	public String bill_grp_nm3() {
		return getConstString(offset + 74, $bill_grp_nm3);
	}

	/**
	 * Billing customer classification name 3 請求先分類名３.<p>
	 *
	 */
	public void bill_grp_nm3(String value) {
		setConstString(offset + 74, $bill_grp_nm3, value);
	}


	/**
	 * Billing customer classification 4 請求先分類４.<p>
	 *
	 */
	public boolean bill_grp_flg4() {
		return getConstBoolean(offset + 75, $bill_grp_flg4);
	}

	/**
	 * Billing customer classification 4 請求先分類４.<p>
	 *
	 */
	public void bill_grp_flg4(boolean value) {
		setConstBoolean(offset + 75, $bill_grp_flg4, value);
	}


	/**
	 * Billing customer classification cd. 4 請求先分類ＣＤ４.<p>
	 *
	 */
	public String bill_grp_cd4() {
		return getConstString(offset + 76, $bill_grp_cd4);
	}

	/**
	 * Billing customer classification cd. 4 請求先分類ＣＤ４.<p>
	 *
	 */
	public void bill_grp_cd4(String value) {
		setConstString(offset + 76, $bill_grp_cd4, value);
	}


	/**
	 * Billing customer classification name 4 請求先分類名４.<p>
	 *
	 */
	public String bill_grp_nm4() {
		return getConstString(offset + 77, $bill_grp_nm4);
	}

	/**
	 * Billing customer classification name 4 請求先分類名４.<p>
	 *
	 */
	public void bill_grp_nm4(String value) {
		setConstString(offset + 77, $bill_grp_nm4, value);
	}


	/**
	 * Billing customer classification 5 請求先分類５.<p>
	 *
	 */
	public boolean bill_grp_flg5() {
		return getConstBoolean(offset + 78, $bill_grp_flg5);
	}

	/**
	 * Billing customer classification 5 請求先分類５.<p>
	 *
	 */
	public void bill_grp_flg5(boolean value) {
		setConstBoolean(offset + 78, $bill_grp_flg5, value);
	}


	/**
	 * Billing customer classification cd. 5 請求先分類ＣＤ５.<p>
	 *
	 */
	public String bill_grp_cd5() {
		return getConstString(offset + 79, $bill_grp_cd5);
	}

	/**
	 * Billing customer classification cd. 5 請求先分類ＣＤ５.<p>
	 *
	 */
	public void bill_grp_cd5(String value) {
		setConstString(offset + 79, $bill_grp_cd5, value);
	}


	/**
	 * Billing customer classification name 5 請求先分類名５.<p>
	 *
	 */
	public String bill_grp_nm5() {
		return getConstString(offset + 80, $bill_grp_nm5);
	}

	/**
	 * Billing customer classification name 5 請求先分類名５.<p>
	 *
	 */
	public void bill_grp_nm5(String value) {
		setConstString(offset + 80, $bill_grp_nm5, value);
	}


	/**
	 * Billing customer classification 6 請求先分類６.<p>
	 *
	 */
	public boolean bill_grp_flg6() {
		return getConstBoolean(offset + 81, $bill_grp_flg6);
	}

	/**
	 * Billing customer classification 6 請求先分類６.<p>
	 *
	 */
	public void bill_grp_flg6(boolean value) {
		setConstBoolean(offset + 81, $bill_grp_flg6, value);
	}


	/**
	 * Billing customer classification cd. 6 請求先分類ＣＤ６.<p>
	 *
	 */
	public String bill_grp_cd6() {
		return getConstString(offset + 82, $bill_grp_cd6);
	}

	/**
	 * Billing customer classification cd. 6 請求先分類ＣＤ６.<p>
	 *
	 */
	public void bill_grp_cd6(String value) {
		setConstString(offset + 82, $bill_grp_cd6, value);
	}


	/**
	 * Billing customer classification name 6 請求先分類名６.<p>
	 *
	 */
	public String bill_grp_nm6() {
		return getConstString(offset + 83, $bill_grp_nm6);
	}

	/**
	 * Billing customer classification name 6 請求先分類名６.<p>
	 *
	 */
	public void bill_grp_nm6(String value) {
		setConstString(offset + 83, $bill_grp_nm6, value);
	}


	/**
	 * Billing customer classification 7 請求先分類７.<p>
	 *
	 */
	public boolean bill_grp_flg7() {
		return getConstBoolean(offset + 84, $bill_grp_flg7);
	}

	/**
	 * Billing customer classification 7 請求先分類７.<p>
	 *
	 */
	public void bill_grp_flg7(boolean value) {
		setConstBoolean(offset + 84, $bill_grp_flg7, value);
	}


	/**
	 * Billing customer classification cd. 7 請求先分類ＣＤ７.<p>
	 *
	 */
	public String bill_grp_cd7() {
		return getConstString(offset + 85, $bill_grp_cd7);
	}

	/**
	 * Billing customer classification cd. 7 請求先分類ＣＤ７.<p>
	 *
	 */
	public void bill_grp_cd7(String value) {
		setConstString(offset + 85, $bill_grp_cd7, value);
	}


	/**
	 * Billing customer classification name 7 請求先分類名７.<p>
	 *
	 */
	public String bill_grp_nm7() {
		return getConstString(offset + 86, $bill_grp_nm7);
	}

	/**
	 * Billing customer classification name 7 請求先分類名７.<p>
	 *
	 */
	public void bill_grp_nm7(String value) {
		setConstString(offset + 86, $bill_grp_nm7, value);
	}


	/**
	 * Billing customer classification 8 請求先分類８.<p>
	 *
	 */
	public boolean bill_grp_flg8() {
		return getConstBoolean(offset + 87, $bill_grp_flg8);
	}

	/**
	 * Billing customer classification 8 請求先分類８.<p>
	 *
	 */
	public void bill_grp_flg8(boolean value) {
		setConstBoolean(offset + 87, $bill_grp_flg8, value);
	}


	/**
	 * Billing customer classification cd. 8 請求先分類ＣＤ８.<p>
	 *
	 */
	public String bill_grp_cd8() {
		return getConstString(offset + 88, $bill_grp_cd8);
	}

	/**
	 * Billing customer classification cd. 8 請求先分類ＣＤ８.<p>
	 *
	 */
	public void bill_grp_cd8(String value) {
		setConstString(offset + 88, $bill_grp_cd8, value);
	}


	/**
	 * Billing customer classification name 8 請求先分類名８.<p>
	 *
	 */
	public String bill_grp_nm8() {
		return getConstString(offset + 89, $bill_grp_nm8);
	}

	/**
	 * Billing customer classification name 8 請求先分類名８.<p>
	 *
	 */
	public void bill_grp_nm8(String value) {
		setConstString(offset + 89, $bill_grp_nm8, value);
	}


	/**
	 * Billing customer classification 9 請求先分類９.<p>
	 *
	 */
	public boolean bill_grp_flg9() {
		return getConstBoolean(offset + 90, $bill_grp_flg9);
	}

	/**
	 * Billing customer classification 9 請求先分類９.<p>
	 *
	 */
	public void bill_grp_flg9(boolean value) {
		setConstBoolean(offset + 90, $bill_grp_flg9, value);
	}


	/**
	 * Billing customer classification cd. 9 請求先分類ＣＤ９.<p>
	 *
	 */
	public String bill_grp_cd9() {
		return getConstString(offset + 91, $bill_grp_cd9);
	}

	/**
	 * Billing customer classification cd. 9 請求先分類ＣＤ９.<p>
	 *
	 */
	public void bill_grp_cd9(String value) {
		setConstString(offset + 91, $bill_grp_cd9, value);
	}


	/**
	 * Billing customer classification name 9 請求先分類名９.<p>
	 *
	 */
	public String bill_grp_nm9() {
		return getConstString(offset + 92, $bill_grp_nm9);
	}

	/**
	 * Billing customer classification name 9 請求先分類名９.<p>
	 *
	 */
	public void bill_grp_nm9(String value) {
		setConstString(offset + 92, $bill_grp_nm9, value);
	}


	/**
	 * Billing customer classification 10 請求先分類１０.<p>
	 *
	 */
	public boolean bill_grp_flg10() {
		return getConstBoolean(offset + 93, $bill_grp_flg10);
	}

	/**
	 * Billing customer classification 10 請求先分類１０.<p>
	 *
	 */
	public void bill_grp_flg10(boolean value) {
		setConstBoolean(offset + 93, $bill_grp_flg10, value);
	}


	/**
	 * Billing customer classification cd. 10 請求先分類ＣＤ１０.<p>
	 *
	 */
	public String bill_grp_cd10() {
		return getConstString(offset + 94, $bill_grp_cd10);
	}

	/**
	 * Billing customer classification cd. 10 請求先分類ＣＤ１０.<p>
	 *
	 */
	public void bill_grp_cd10(String value) {
		setConstString(offset + 94, $bill_grp_cd10, value);
	}


	/**
	 * Billing customer classification name 10 請求先分類名１０.<p>
	 *
	 */
	public String bill_grp_nm10() {
		return getConstString(offset + 95, $bill_grp_nm10);
	}

	/**
	 * Billing customer classification name 10 請求先分類名１０.<p>
	 *
	 */
	public void bill_grp_nm10(String value) {
		setConstString(offset + 95, $bill_grp_nm10, value);
	}


	public String getString(String name) {
		if ($rcst_cd.equalsIgnoreCase(name)) {
			return rcst_cd();
		}
		if ($rcst_nm.equalsIgnoreCase(name)) {
			return rcst_nm();
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
		if ($rcv_usr_cd.equalsIgnoreCase(name)) {
			return rcv_usr_cd();
		}
		if ($rcv_usr_nm.equalsIgnoreCase(name)) {
			return rcv_usr_nm();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			return bcst_nm();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($bill_dpt_nm.equalsIgnoreCase(name)) {
			return bill_dpt_nm();
		}
		if ($note_no.equalsIgnoreCase(name)) {
			return note_no();
		}
		if ($note_typ.equalsIgnoreCase(name)) {
			return note_typ();
		}
		if ($drawer_nm.equalsIgnoreCase(name)) {
			return drawer_nm();
		}
		if ($note_rsn_cd.equalsIgnoreCase(name)) {
			return note_rsn_cd();
		}
		if ($note_rsn_nm.equalsIgnoreCase(name)) {
			return note_rsn_nm();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		if ($rcv_no.equalsIgnoreCase(name)) {
			return rcv_no();
		}
		if ($rcv_mtd_cd.equalsIgnoreCase(name)) {
			return rcv_mtd_cd();
		}
		if ($rcv_mtd_nm.equalsIgnoreCase(name)) {
			return rcv_mtd_nm();
		}
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			return rcv_act_no();
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
		if ($rcv_grp_cd1.equalsIgnoreCase(name)) {
			return rcv_grp_cd1();
		}
		if ($rcv_grp_nm1.equalsIgnoreCase(name)) {
			return rcv_grp_nm1();
		}
		if ($rcv_grp_cd2.equalsIgnoreCase(name)) {
			return rcv_grp_cd2();
		}
		if ($rcv_grp_nm2.equalsIgnoreCase(name)) {
			return rcv_grp_nm2();
		}
		if ($rcv_grp_cd3.equalsIgnoreCase(name)) {
			return rcv_grp_cd3();
		}
		if ($rcv_grp_nm3.equalsIgnoreCase(name)) {
			return rcv_grp_nm3();
		}
		if ($rcv_grp_cd4.equalsIgnoreCase(name)) {
			return rcv_grp_cd4();
		}
		if ($rcv_grp_nm4.equalsIgnoreCase(name)) {
			return rcv_grp_nm4();
		}
		if ($rcv_grp_cd5.equalsIgnoreCase(name)) {
			return rcv_grp_cd5();
		}
		if ($rcv_grp_nm5.equalsIgnoreCase(name)) {
			return rcv_grp_nm5();
		}
		if ($rcv_grp_cd6.equalsIgnoreCase(name)) {
			return rcv_grp_cd6();
		}
		if ($rcv_grp_nm6.equalsIgnoreCase(name)) {
			return rcv_grp_nm6();
		}
		if ($rcv_grp_cd7.equalsIgnoreCase(name)) {
			return rcv_grp_cd7();
		}
		if ($rcv_grp_nm7.equalsIgnoreCase(name)) {
			return rcv_grp_nm7();
		}
		if ($rcv_grp_cd8.equalsIgnoreCase(name)) {
			return rcv_grp_cd8();
		}
		if ($rcv_grp_nm8.equalsIgnoreCase(name)) {
			return rcv_grp_nm8();
		}
		if ($rcv_grp_cd9.equalsIgnoreCase(name)) {
			return rcv_grp_cd9();
		}
		if ($rcv_grp_nm9.equalsIgnoreCase(name)) {
			return rcv_grp_nm9();
		}
		if ($rcv_grp_cd10.equalsIgnoreCase(name)) {
			return rcv_grp_cd10();
		}
		if ($rcv_grp_nm10.equalsIgnoreCase(name)) {
			return rcv_grp_nm10();
		}
		if ($bill_grp_cd1.equalsIgnoreCase(name)) {
			return bill_grp_cd1();
		}
		if ($bill_grp_nm1.equalsIgnoreCase(name)) {
			return bill_grp_nm1();
		}
		if ($bill_grp_cd2.equalsIgnoreCase(name)) {
			return bill_grp_cd2();
		}
		if ($bill_grp_nm2.equalsIgnoreCase(name)) {
			return bill_grp_nm2();
		}
		if ($bill_grp_cd3.equalsIgnoreCase(name)) {
			return bill_grp_cd3();
		}
		if ($bill_grp_nm3.equalsIgnoreCase(name)) {
			return bill_grp_nm3();
		}
		if ($bill_grp_cd4.equalsIgnoreCase(name)) {
			return bill_grp_cd4();
		}
		if ($bill_grp_nm4.equalsIgnoreCase(name)) {
			return bill_grp_nm4();
		}
		if ($bill_grp_cd5.equalsIgnoreCase(name)) {
			return bill_grp_cd5();
		}
		if ($bill_grp_nm5.equalsIgnoreCase(name)) {
			return bill_grp_nm5();
		}
		if ($bill_grp_cd6.equalsIgnoreCase(name)) {
			return bill_grp_cd6();
		}
		if ($bill_grp_nm6.equalsIgnoreCase(name)) {
			return bill_grp_nm6();
		}
		if ($bill_grp_cd7.equalsIgnoreCase(name)) {
			return bill_grp_cd7();
		}
		if ($bill_grp_nm7.equalsIgnoreCase(name)) {
			return bill_grp_nm7();
		}
		if ($bill_grp_cd8.equalsIgnoreCase(name)) {
			return bill_grp_cd8();
		}
		if ($bill_grp_nm8.equalsIgnoreCase(name)) {
			return bill_grp_nm8();
		}
		if ($bill_grp_cd9.equalsIgnoreCase(name)) {
			return bill_grp_cd9();
		}
		if ($bill_grp_nm9.equalsIgnoreCase(name)) {
			return bill_grp_nm9();
		}
		if ($bill_grp_cd10.equalsIgnoreCase(name)) {
			return bill_grp_cd10();
		}
		if ($bill_grp_nm10.equalsIgnoreCase(name)) {
			return bill_grp_nm10();
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
		if ($draw_dt_fr.equalsIgnoreCase(name)) {
			return draw_dt_fr();
		}
		if ($draw_dt_to.equalsIgnoreCase(name)) {
			return draw_dt_to();
		}
		if ($due_dt_fr.equalsIgnoreCase(name)) {
			return due_dt_fr();
		}
		if ($due_dt_to.equalsIgnoreCase(name)) {
			return due_dt_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($not_mat_flg.equalsIgnoreCase(name)) {
			return not_mat_flg();
		}
		if ($mat_flg.equalsIgnoreCase(name)) {
			return mat_flg();
		}
		if ($fb_t_flg.equalsIgnoreCase(name)) {
			return fb_t_flg();
		}
		if ($fb_f_flg.equalsIgnoreCase(name)) {
			return fb_f_flg();
		}
		if ($rcv_grp_flg1.equalsIgnoreCase(name)) {
			return rcv_grp_flg1();
		}
		if ($rcv_grp_flg2.equalsIgnoreCase(name)) {
			return rcv_grp_flg2();
		}
		if ($rcv_grp_flg3.equalsIgnoreCase(name)) {
			return rcv_grp_flg3();
		}
		if ($rcv_grp_flg4.equalsIgnoreCase(name)) {
			return rcv_grp_flg4();
		}
		if ($rcv_grp_flg5.equalsIgnoreCase(name)) {
			return rcv_grp_flg5();
		}
		if ($rcv_grp_flg6.equalsIgnoreCase(name)) {
			return rcv_grp_flg6();
		}
		if ($rcv_grp_flg7.equalsIgnoreCase(name)) {
			return rcv_grp_flg7();
		}
		if ($rcv_grp_flg8.equalsIgnoreCase(name)) {
			return rcv_grp_flg8();
		}
		if ($rcv_grp_flg9.equalsIgnoreCase(name)) {
			return rcv_grp_flg9();
		}
		if ($rcv_grp_flg10.equalsIgnoreCase(name)) {
			return rcv_grp_flg10();
		}
		if ($bill_grp_flg1.equalsIgnoreCase(name)) {
			return bill_grp_flg1();
		}
		if ($bill_grp_flg2.equalsIgnoreCase(name)) {
			return bill_grp_flg2();
		}
		if ($bill_grp_flg3.equalsIgnoreCase(name)) {
			return bill_grp_flg3();
		}
		if ($bill_grp_flg4.equalsIgnoreCase(name)) {
			return bill_grp_flg4();
		}
		if ($bill_grp_flg5.equalsIgnoreCase(name)) {
			return bill_grp_flg5();
		}
		if ($bill_grp_flg6.equalsIgnoreCase(name)) {
			return bill_grp_flg6();
		}
		if ($bill_grp_flg7.equalsIgnoreCase(name)) {
			return bill_grp_flg7();
		}
		if ($bill_grp_flg8.equalsIgnoreCase(name)) {
			return bill_grp_flg8();
		}
		if ($bill_grp_flg9.equalsIgnoreCase(name)) {
			return bill_grp_flg9();
		}
		if ($bill_grp_flg10.equalsIgnoreCase(name)) {
			return bill_grp_flg10();
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
		if ($rcv_usr_cd.equalsIgnoreCase(name)) {
			return rcv_usr_cd();
		}
		if ($rcv_usr_nm.equalsIgnoreCase(name)) {
			return rcv_usr_nm();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			return bcst_nm();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($bill_dpt_nm.equalsIgnoreCase(name)) {
			return bill_dpt_nm();
		}
		if ($note_no.equalsIgnoreCase(name)) {
			return note_no();
		}
		if ($note_typ.equalsIgnoreCase(name)) {
			return note_typ();
		}
		if ($drawer_nm.equalsIgnoreCase(name)) {
			return drawer_nm();
		}
		if ($note_rsn_cd.equalsIgnoreCase(name)) {
			return note_rsn_cd();
		}
		if ($note_rsn_nm.equalsIgnoreCase(name)) {
			return note_rsn_nm();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		if ($rcv_no.equalsIgnoreCase(name)) {
			return rcv_no();
		}
		if ($rcv_mtd_cd.equalsIgnoreCase(name)) {
			return rcv_mtd_cd();
		}
		if ($rcv_mtd_nm.equalsIgnoreCase(name)) {
			return rcv_mtd_nm();
		}
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			return rcv_act_no();
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
		if ($rcv_grp_cd1.equalsIgnoreCase(name)) {
			return rcv_grp_cd1();
		}
		if ($rcv_grp_nm1.equalsIgnoreCase(name)) {
			return rcv_grp_nm1();
		}
		if ($rcv_grp_cd2.equalsIgnoreCase(name)) {
			return rcv_grp_cd2();
		}
		if ($rcv_grp_nm2.equalsIgnoreCase(name)) {
			return rcv_grp_nm2();
		}
		if ($rcv_grp_cd3.equalsIgnoreCase(name)) {
			return rcv_grp_cd3();
		}
		if ($rcv_grp_nm3.equalsIgnoreCase(name)) {
			return rcv_grp_nm3();
		}
		if ($rcv_grp_cd4.equalsIgnoreCase(name)) {
			return rcv_grp_cd4();
		}
		if ($rcv_grp_nm4.equalsIgnoreCase(name)) {
			return rcv_grp_nm4();
		}
		if ($rcv_grp_cd5.equalsIgnoreCase(name)) {
			return rcv_grp_cd5();
		}
		if ($rcv_grp_nm5.equalsIgnoreCase(name)) {
			return rcv_grp_nm5();
		}
		if ($rcv_grp_cd6.equalsIgnoreCase(name)) {
			return rcv_grp_cd6();
		}
		if ($rcv_grp_nm6.equalsIgnoreCase(name)) {
			return rcv_grp_nm6();
		}
		if ($rcv_grp_cd7.equalsIgnoreCase(name)) {
			return rcv_grp_cd7();
		}
		if ($rcv_grp_nm7.equalsIgnoreCase(name)) {
			return rcv_grp_nm7();
		}
		if ($rcv_grp_cd8.equalsIgnoreCase(name)) {
			return rcv_grp_cd8();
		}
		if ($rcv_grp_nm8.equalsIgnoreCase(name)) {
			return rcv_grp_nm8();
		}
		if ($rcv_grp_cd9.equalsIgnoreCase(name)) {
			return rcv_grp_cd9();
		}
		if ($rcv_grp_nm9.equalsIgnoreCase(name)) {
			return rcv_grp_nm9();
		}
		if ($rcv_grp_cd10.equalsIgnoreCase(name)) {
			return rcv_grp_cd10();
		}
		if ($rcv_grp_nm10.equalsIgnoreCase(name)) {
			return rcv_grp_nm10();
		}
		if ($bill_grp_cd1.equalsIgnoreCase(name)) {
			return bill_grp_cd1();
		}
		if ($bill_grp_nm1.equalsIgnoreCase(name)) {
			return bill_grp_nm1();
		}
		if ($bill_grp_cd2.equalsIgnoreCase(name)) {
			return bill_grp_cd2();
		}
		if ($bill_grp_nm2.equalsIgnoreCase(name)) {
			return bill_grp_nm2();
		}
		if ($bill_grp_cd3.equalsIgnoreCase(name)) {
			return bill_grp_cd3();
		}
		if ($bill_grp_nm3.equalsIgnoreCase(name)) {
			return bill_grp_nm3();
		}
		if ($bill_grp_cd4.equalsIgnoreCase(name)) {
			return bill_grp_cd4();
		}
		if ($bill_grp_nm4.equalsIgnoreCase(name)) {
			return bill_grp_nm4();
		}
		if ($bill_grp_cd5.equalsIgnoreCase(name)) {
			return bill_grp_cd5();
		}
		if ($bill_grp_nm5.equalsIgnoreCase(name)) {
			return bill_grp_nm5();
		}
		if ($bill_grp_cd6.equalsIgnoreCase(name)) {
			return bill_grp_cd6();
		}
		if ($bill_grp_nm6.equalsIgnoreCase(name)) {
			return bill_grp_nm6();
		}
		if ($bill_grp_cd7.equalsIgnoreCase(name)) {
			return bill_grp_cd7();
		}
		if ($bill_grp_nm7.equalsIgnoreCase(name)) {
			return bill_grp_nm7();
		}
		if ($bill_grp_cd8.equalsIgnoreCase(name)) {
			return bill_grp_cd8();
		}
		if ($bill_grp_nm8.equalsIgnoreCase(name)) {
			return bill_grp_nm8();
		}
		if ($bill_grp_cd9.equalsIgnoreCase(name)) {
			return bill_grp_cd9();
		}
		if ($bill_grp_nm9.equalsIgnoreCase(name)) {
			return bill_grp_nm9();
		}
		if ($bill_grp_cd10.equalsIgnoreCase(name)) {
			return bill_grp_cd10();
		}
		if ($bill_grp_nm10.equalsIgnoreCase(name)) {
			return bill_grp_nm10();
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
		if ($draw_dt_fr.equalsIgnoreCase(name)) {
			return draw_dt_fr();
		}
		if ($draw_dt_to.equalsIgnoreCase(name)) {
			return draw_dt_to();
		}
		if ($due_dt_fr.equalsIgnoreCase(name)) {
			return due_dt_fr();
		}
		if ($due_dt_to.equalsIgnoreCase(name)) {
			return due_dt_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($not_mat_flg.equalsIgnoreCase(name)) {
			return not_mat_flg();
		}
		if ($mat_flg.equalsIgnoreCase(name)) {
			return mat_flg();
		}
		if ($fb_t_flg.equalsIgnoreCase(name)) {
			return fb_t_flg();
		}
		if ($fb_f_flg.equalsIgnoreCase(name)) {
			return fb_f_flg();
		}
		if ($rcv_grp_flg1.equalsIgnoreCase(name)) {
			return rcv_grp_flg1();
		}
		if ($rcv_grp_flg2.equalsIgnoreCase(name)) {
			return rcv_grp_flg2();
		}
		if ($rcv_grp_flg3.equalsIgnoreCase(name)) {
			return rcv_grp_flg3();
		}
		if ($rcv_grp_flg4.equalsIgnoreCase(name)) {
			return rcv_grp_flg4();
		}
		if ($rcv_grp_flg5.equalsIgnoreCase(name)) {
			return rcv_grp_flg5();
		}
		if ($rcv_grp_flg6.equalsIgnoreCase(name)) {
			return rcv_grp_flg6();
		}
		if ($rcv_grp_flg7.equalsIgnoreCase(name)) {
			return rcv_grp_flg7();
		}
		if ($rcv_grp_flg8.equalsIgnoreCase(name)) {
			return rcv_grp_flg8();
		}
		if ($rcv_grp_flg9.equalsIgnoreCase(name)) {
			return rcv_grp_flg9();
		}
		if ($rcv_grp_flg10.equalsIgnoreCase(name)) {
			return rcv_grp_flg10();
		}
		if ($bill_grp_flg1.equalsIgnoreCase(name)) {
			return bill_grp_flg1();
		}
		if ($bill_grp_flg2.equalsIgnoreCase(name)) {
			return bill_grp_flg2();
		}
		if ($bill_grp_flg3.equalsIgnoreCase(name)) {
			return bill_grp_flg3();
		}
		if ($bill_grp_flg4.equalsIgnoreCase(name)) {
			return bill_grp_flg4();
		}
		if ($bill_grp_flg5.equalsIgnoreCase(name)) {
			return bill_grp_flg5();
		}
		if ($bill_grp_flg6.equalsIgnoreCase(name)) {
			return bill_grp_flg6();
		}
		if ($bill_grp_flg7.equalsIgnoreCase(name)) {
			return bill_grp_flg7();
		}
		if ($bill_grp_flg8.equalsIgnoreCase(name)) {
			return bill_grp_flg8();
		}
		if ($bill_grp_flg9.equalsIgnoreCase(name)) {
			return bill_grp_flg9();
		}
		if ($bill_grp_flg10.equalsIgnoreCase(name)) {
			return bill_grp_flg10();
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
		if ($rcv_usr_cd.equalsIgnoreCase(name)) {
			rcv_usr_cd(value);
			return;
		}
		if ($rcv_usr_nm.equalsIgnoreCase(name)) {
			rcv_usr_nm(value);
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
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		if ($bill_dpt_nm.equalsIgnoreCase(name)) {
			bill_dpt_nm(value);
			return;
		}
		if ($note_no.equalsIgnoreCase(name)) {
			note_no(value);
			return;
		}
		if ($note_typ.equalsIgnoreCase(name)) {
			note_typ(value);
			return;
		}
		if ($drawer_nm.equalsIgnoreCase(name)) {
			drawer_nm(value);
			return;
		}
		if ($note_rsn_cd.equalsIgnoreCase(name)) {
			note_rsn_cd(value);
			return;
		}
		if ($note_rsn_nm.equalsIgnoreCase(name)) {
			note_rsn_nm(value);
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
		if ($rcv_no.equalsIgnoreCase(name)) {
			rcv_no(value);
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
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			rcv_act_no(value);
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
		if ($rcv_grp_cd1.equalsIgnoreCase(name)) {
			rcv_grp_cd1(value);
			return;
		}
		if ($rcv_grp_nm1.equalsIgnoreCase(name)) {
			rcv_grp_nm1(value);
			return;
		}
		if ($rcv_grp_cd2.equalsIgnoreCase(name)) {
			rcv_grp_cd2(value);
			return;
		}
		if ($rcv_grp_nm2.equalsIgnoreCase(name)) {
			rcv_grp_nm2(value);
			return;
		}
		if ($rcv_grp_cd3.equalsIgnoreCase(name)) {
			rcv_grp_cd3(value);
			return;
		}
		if ($rcv_grp_nm3.equalsIgnoreCase(name)) {
			rcv_grp_nm3(value);
			return;
		}
		if ($rcv_grp_cd4.equalsIgnoreCase(name)) {
			rcv_grp_cd4(value);
			return;
		}
		if ($rcv_grp_nm4.equalsIgnoreCase(name)) {
			rcv_grp_nm4(value);
			return;
		}
		if ($rcv_grp_cd5.equalsIgnoreCase(name)) {
			rcv_grp_cd5(value);
			return;
		}
		if ($rcv_grp_nm5.equalsIgnoreCase(name)) {
			rcv_grp_nm5(value);
			return;
		}
		if ($rcv_grp_cd6.equalsIgnoreCase(name)) {
			rcv_grp_cd6(value);
			return;
		}
		if ($rcv_grp_nm6.equalsIgnoreCase(name)) {
			rcv_grp_nm6(value);
			return;
		}
		if ($rcv_grp_cd7.equalsIgnoreCase(name)) {
			rcv_grp_cd7(value);
			return;
		}
		if ($rcv_grp_nm7.equalsIgnoreCase(name)) {
			rcv_grp_nm7(value);
			return;
		}
		if ($rcv_grp_cd8.equalsIgnoreCase(name)) {
			rcv_grp_cd8(value);
			return;
		}
		if ($rcv_grp_nm8.equalsIgnoreCase(name)) {
			rcv_grp_nm8(value);
			return;
		}
		if ($rcv_grp_cd9.equalsIgnoreCase(name)) {
			rcv_grp_cd9(value);
			return;
		}
		if ($rcv_grp_nm9.equalsIgnoreCase(name)) {
			rcv_grp_nm9(value);
			return;
		}
		if ($rcv_grp_cd10.equalsIgnoreCase(name)) {
			rcv_grp_cd10(value);
			return;
		}
		if ($rcv_grp_nm10.equalsIgnoreCase(name)) {
			rcv_grp_nm10(value);
			return;
		}
		if ($bill_grp_cd1.equalsIgnoreCase(name)) {
			bill_grp_cd1(value);
			return;
		}
		if ($bill_grp_nm1.equalsIgnoreCase(name)) {
			bill_grp_nm1(value);
			return;
		}
		if ($bill_grp_cd2.equalsIgnoreCase(name)) {
			bill_grp_cd2(value);
			return;
		}
		if ($bill_grp_nm2.equalsIgnoreCase(name)) {
			bill_grp_nm2(value);
			return;
		}
		if ($bill_grp_cd3.equalsIgnoreCase(name)) {
			bill_grp_cd3(value);
			return;
		}
		if ($bill_grp_nm3.equalsIgnoreCase(name)) {
			bill_grp_nm3(value);
			return;
		}
		if ($bill_grp_cd4.equalsIgnoreCase(name)) {
			bill_grp_cd4(value);
			return;
		}
		if ($bill_grp_nm4.equalsIgnoreCase(name)) {
			bill_grp_nm4(value);
			return;
		}
		if ($bill_grp_cd5.equalsIgnoreCase(name)) {
			bill_grp_cd5(value);
			return;
		}
		if ($bill_grp_nm5.equalsIgnoreCase(name)) {
			bill_grp_nm5(value);
			return;
		}
		if ($bill_grp_cd6.equalsIgnoreCase(name)) {
			bill_grp_cd6(value);
			return;
		}
		if ($bill_grp_nm6.equalsIgnoreCase(name)) {
			bill_grp_nm6(value);
			return;
		}
		if ($bill_grp_cd7.equalsIgnoreCase(name)) {
			bill_grp_cd7(value);
			return;
		}
		if ($bill_grp_nm7.equalsIgnoreCase(name)) {
			bill_grp_nm7(value);
			return;
		}
		if ($bill_grp_cd8.equalsIgnoreCase(name)) {
			bill_grp_cd8(value);
			return;
		}
		if ($bill_grp_nm8.equalsIgnoreCase(name)) {
			bill_grp_nm8(value);
			return;
		}
		if ($bill_grp_cd9.equalsIgnoreCase(name)) {
			bill_grp_cd9(value);
			return;
		}
		if ($bill_grp_nm9.equalsIgnoreCase(name)) {
			bill_grp_nm9(value);
			return;
		}
		if ($bill_grp_cd10.equalsIgnoreCase(name)) {
			bill_grp_cd10(value);
			return;
		}
		if ($bill_grp_nm10.equalsIgnoreCase(name)) {
			bill_grp_nm10(value);
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
		if ($draw_dt_fr.equalsIgnoreCase(name)) {
			draw_dt_fr(value);
			return;
		}
		if ($draw_dt_to.equalsIgnoreCase(name)) {
			draw_dt_to(value);
			return;
		}
		if ($due_dt_fr.equalsIgnoreCase(name)) {
			due_dt_fr(value);
			return;
		}
		if ($due_dt_to.equalsIgnoreCase(name)) {
			due_dt_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($not_mat_flg.equalsIgnoreCase(name)) {
			not_mat_flg(value);
			return;
		}
		if ($mat_flg.equalsIgnoreCase(name)) {
			mat_flg(value);
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
		if ($rcv_grp_flg1.equalsIgnoreCase(name)) {
			rcv_grp_flg1(value);
			return;
		}
		if ($rcv_grp_flg2.equalsIgnoreCase(name)) {
			rcv_grp_flg2(value);
			return;
		}
		if ($rcv_grp_flg3.equalsIgnoreCase(name)) {
			rcv_grp_flg3(value);
			return;
		}
		if ($rcv_grp_flg4.equalsIgnoreCase(name)) {
			rcv_grp_flg4(value);
			return;
		}
		if ($rcv_grp_flg5.equalsIgnoreCase(name)) {
			rcv_grp_flg5(value);
			return;
		}
		if ($rcv_grp_flg6.equalsIgnoreCase(name)) {
			rcv_grp_flg6(value);
			return;
		}
		if ($rcv_grp_flg7.equalsIgnoreCase(name)) {
			rcv_grp_flg7(value);
			return;
		}
		if ($rcv_grp_flg8.equalsIgnoreCase(name)) {
			rcv_grp_flg8(value);
			return;
		}
		if ($rcv_grp_flg9.equalsIgnoreCase(name)) {
			rcv_grp_flg9(value);
			return;
		}
		if ($rcv_grp_flg10.equalsIgnoreCase(name)) {
			rcv_grp_flg10(value);
			return;
		}
		if ($bill_grp_flg1.equalsIgnoreCase(name)) {
			bill_grp_flg1(value);
			return;
		}
		if ($bill_grp_flg2.equalsIgnoreCase(name)) {
			bill_grp_flg2(value);
			return;
		}
		if ($bill_grp_flg3.equalsIgnoreCase(name)) {
			bill_grp_flg3(value);
			return;
		}
		if ($bill_grp_flg4.equalsIgnoreCase(name)) {
			bill_grp_flg4(value);
			return;
		}
		if ($bill_grp_flg5.equalsIgnoreCase(name)) {
			bill_grp_flg5(value);
			return;
		}
		if ($bill_grp_flg6.equalsIgnoreCase(name)) {
			bill_grp_flg6(value);
			return;
		}
		if ($bill_grp_flg7.equalsIgnoreCase(name)) {
			bill_grp_flg7(value);
			return;
		}
		if ($bill_grp_flg8.equalsIgnoreCase(name)) {
			bill_grp_flg8(value);
			return;
		}
		if ($bill_grp_flg9.equalsIgnoreCase(name)) {
			bill_grp_flg9(value);
			return;
		}
		if ($bill_grp_flg10.equalsIgnoreCase(name)) {
			bill_grp_flg10(value);
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
		if ($rcv_usr_cd.equalsIgnoreCase(name)) {
			rcv_usr_cd(value);
			return;
		}
		if ($rcv_usr_nm.equalsIgnoreCase(name)) {
			rcv_usr_nm(value);
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
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		if ($bill_dpt_nm.equalsIgnoreCase(name)) {
			bill_dpt_nm(value);
			return;
		}
		if ($note_no.equalsIgnoreCase(name)) {
			note_no(value);
			return;
		}
		if ($note_typ.equalsIgnoreCase(name)) {
			note_typ(value);
			return;
		}
		if ($drawer_nm.equalsIgnoreCase(name)) {
			drawer_nm(value);
			return;
		}
		if ($note_rsn_cd.equalsIgnoreCase(name)) {
			note_rsn_cd(value);
			return;
		}
		if ($note_rsn_nm.equalsIgnoreCase(name)) {
			note_rsn_nm(value);
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
		if ($rcv_no.equalsIgnoreCase(name)) {
			rcv_no(value);
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
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			rcv_act_no(value);
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
		if ($rcv_grp_cd1.equalsIgnoreCase(name)) {
			rcv_grp_cd1(value);
			return;
		}
		if ($rcv_grp_nm1.equalsIgnoreCase(name)) {
			rcv_grp_nm1(value);
			return;
		}
		if ($rcv_grp_cd2.equalsIgnoreCase(name)) {
			rcv_grp_cd2(value);
			return;
		}
		if ($rcv_grp_nm2.equalsIgnoreCase(name)) {
			rcv_grp_nm2(value);
			return;
		}
		if ($rcv_grp_cd3.equalsIgnoreCase(name)) {
			rcv_grp_cd3(value);
			return;
		}
		if ($rcv_grp_nm3.equalsIgnoreCase(name)) {
			rcv_grp_nm3(value);
			return;
		}
		if ($rcv_grp_cd4.equalsIgnoreCase(name)) {
			rcv_grp_cd4(value);
			return;
		}
		if ($rcv_grp_nm4.equalsIgnoreCase(name)) {
			rcv_grp_nm4(value);
			return;
		}
		if ($rcv_grp_cd5.equalsIgnoreCase(name)) {
			rcv_grp_cd5(value);
			return;
		}
		if ($rcv_grp_nm5.equalsIgnoreCase(name)) {
			rcv_grp_nm5(value);
			return;
		}
		if ($rcv_grp_cd6.equalsIgnoreCase(name)) {
			rcv_grp_cd6(value);
			return;
		}
		if ($rcv_grp_nm6.equalsIgnoreCase(name)) {
			rcv_grp_nm6(value);
			return;
		}
		if ($rcv_grp_cd7.equalsIgnoreCase(name)) {
			rcv_grp_cd7(value);
			return;
		}
		if ($rcv_grp_nm7.equalsIgnoreCase(name)) {
			rcv_grp_nm7(value);
			return;
		}
		if ($rcv_grp_cd8.equalsIgnoreCase(name)) {
			rcv_grp_cd8(value);
			return;
		}
		if ($rcv_grp_nm8.equalsIgnoreCase(name)) {
			rcv_grp_nm8(value);
			return;
		}
		if ($rcv_grp_cd9.equalsIgnoreCase(name)) {
			rcv_grp_cd9(value);
			return;
		}
		if ($rcv_grp_nm9.equalsIgnoreCase(name)) {
			rcv_grp_nm9(value);
			return;
		}
		if ($rcv_grp_cd10.equalsIgnoreCase(name)) {
			rcv_grp_cd10(value);
			return;
		}
		if ($rcv_grp_nm10.equalsIgnoreCase(name)) {
			rcv_grp_nm10(value);
			return;
		}
		if ($bill_grp_cd1.equalsIgnoreCase(name)) {
			bill_grp_cd1(value);
			return;
		}
		if ($bill_grp_nm1.equalsIgnoreCase(name)) {
			bill_grp_nm1(value);
			return;
		}
		if ($bill_grp_cd2.equalsIgnoreCase(name)) {
			bill_grp_cd2(value);
			return;
		}
		if ($bill_grp_nm2.equalsIgnoreCase(name)) {
			bill_grp_nm2(value);
			return;
		}
		if ($bill_grp_cd3.equalsIgnoreCase(name)) {
			bill_grp_cd3(value);
			return;
		}
		if ($bill_grp_nm3.equalsIgnoreCase(name)) {
			bill_grp_nm3(value);
			return;
		}
		if ($bill_grp_cd4.equalsIgnoreCase(name)) {
			bill_grp_cd4(value);
			return;
		}
		if ($bill_grp_nm4.equalsIgnoreCase(name)) {
			bill_grp_nm4(value);
			return;
		}
		if ($bill_grp_cd5.equalsIgnoreCase(name)) {
			bill_grp_cd5(value);
			return;
		}
		if ($bill_grp_nm5.equalsIgnoreCase(name)) {
			bill_grp_nm5(value);
			return;
		}
		if ($bill_grp_cd6.equalsIgnoreCase(name)) {
			bill_grp_cd6(value);
			return;
		}
		if ($bill_grp_nm6.equalsIgnoreCase(name)) {
			bill_grp_nm6(value);
			return;
		}
		if ($bill_grp_cd7.equalsIgnoreCase(name)) {
			bill_grp_cd7(value);
			return;
		}
		if ($bill_grp_nm7.equalsIgnoreCase(name)) {
			bill_grp_nm7(value);
			return;
		}
		if ($bill_grp_cd8.equalsIgnoreCase(name)) {
			bill_grp_cd8(value);
			return;
		}
		if ($bill_grp_nm8.equalsIgnoreCase(name)) {
			bill_grp_nm8(value);
			return;
		}
		if ($bill_grp_cd9.equalsIgnoreCase(name)) {
			bill_grp_cd9(value);
			return;
		}
		if ($bill_grp_nm9.equalsIgnoreCase(name)) {
			bill_grp_nm9(value);
			return;
		}
		if ($bill_grp_cd10.equalsIgnoreCase(name)) {
			bill_grp_cd10(value);
			return;
		}
		if ($bill_grp_nm10.equalsIgnoreCase(name)) {
			bill_grp_nm10(value);
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
		if ($draw_dt_fr.equalsIgnoreCase(name)) {
			draw_dt_fr(value);
			return;
		}
		if ($draw_dt_to.equalsIgnoreCase(name)) {
			draw_dt_to(value);
			return;
		}
		if ($due_dt_fr.equalsIgnoreCase(name)) {
			due_dt_fr(value);
			return;
		}
		if ($due_dt_to.equalsIgnoreCase(name)) {
			due_dt_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($not_mat_flg.equalsIgnoreCase(name)) {
			not_mat_flg(value);
			return;
		}
		if ($mat_flg.equalsIgnoreCase(name)) {
			mat_flg(value);
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
		if ($rcv_grp_flg1.equalsIgnoreCase(name)) {
			rcv_grp_flg1(value);
			return;
		}
		if ($rcv_grp_flg2.equalsIgnoreCase(name)) {
			rcv_grp_flg2(value);
			return;
		}
		if ($rcv_grp_flg3.equalsIgnoreCase(name)) {
			rcv_grp_flg3(value);
			return;
		}
		if ($rcv_grp_flg4.equalsIgnoreCase(name)) {
			rcv_grp_flg4(value);
			return;
		}
		if ($rcv_grp_flg5.equalsIgnoreCase(name)) {
			rcv_grp_flg5(value);
			return;
		}
		if ($rcv_grp_flg6.equalsIgnoreCase(name)) {
			rcv_grp_flg6(value);
			return;
		}
		if ($rcv_grp_flg7.equalsIgnoreCase(name)) {
			rcv_grp_flg7(value);
			return;
		}
		if ($rcv_grp_flg8.equalsIgnoreCase(name)) {
			rcv_grp_flg8(value);
			return;
		}
		if ($rcv_grp_flg9.equalsIgnoreCase(name)) {
			rcv_grp_flg9(value);
			return;
		}
		if ($rcv_grp_flg10.equalsIgnoreCase(name)) {
			rcv_grp_flg10(value);
			return;
		}
		if ($bill_grp_flg1.equalsIgnoreCase(name)) {
			bill_grp_flg1(value);
			return;
		}
		if ($bill_grp_flg2.equalsIgnoreCase(name)) {
			bill_grp_flg2(value);
			return;
		}
		if ($bill_grp_flg3.equalsIgnoreCase(name)) {
			bill_grp_flg3(value);
			return;
		}
		if ($bill_grp_flg4.equalsIgnoreCase(name)) {
			bill_grp_flg4(value);
			return;
		}
		if ($bill_grp_flg5.equalsIgnoreCase(name)) {
			bill_grp_flg5(value);
			return;
		}
		if ($bill_grp_flg6.equalsIgnoreCase(name)) {
			bill_grp_flg6(value);
			return;
		}
		if ($bill_grp_flg7.equalsIgnoreCase(name)) {
			bill_grp_flg7(value);
			return;
		}
		if ($bill_grp_flg8.equalsIgnoreCase(name)) {
			bill_grp_flg8(value);
			return;
		}
		if ($bill_grp_flg9.equalsIgnoreCase(name)) {
			bill_grp_flg9(value);
			return;
		}
		if ($bill_grp_flg10.equalsIgnoreCase(name)) {
			bill_grp_flg10(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

