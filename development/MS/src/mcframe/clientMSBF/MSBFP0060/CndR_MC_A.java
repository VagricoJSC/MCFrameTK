package mcframe.clientMSBF.MSBFP0060;

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
	 * UPD,Create/Modify,UPD;JUDG,Decide,JUDG;DEL,Cancel result,DEL;DEL_JUDG,Cancel decision,DEL_JUDG;REF,View,REF;PRNT_RSLT,Issue report,PRNT_RSLT UPD,登録・訂正する,UPD;JUDG,判定する,JUDG;DEL,実績を取り消す,DEL;DEL_JUDG,判定を取り消す,DEL_JUDG;REF,参照する,REF;PRNT_RSLT,成績書発行,PRNT_RSLT.<p>
	 *
	 */
	public static final String $ope = "ope";
	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public static final String $ord_flg = "ord_flg";
	/**
	 * In process 着手中.<p>
	 *
	 */
	public static final String $stt_flg = "stt_flg";
	/**
	 * Completed 完了.<p>
	 *
	 */
	public static final String $cmpl_flg = "cmpl_flg";
	/**
	 * Unissued 未発行.<p>
	 *
	 */
	public static final String $insp_rslt_not_prnt_flg = "insp_rslt_not_prnt_flg";
	/**
	 * Issued 発行済.<p>
	 *
	 */
	public static final String $insp_rslt_prnt_flg = "insp_rslt_prnt_flg";
	/**
	 * Checked 確認済.<p>
	 *
	 */
	public static final String $cnf_cmpl_flg = "cnf_cmpl_flg";
	/**
	 * With unchecked 未確認有.<p>
	 *
	 */
	public static final String $cnf_not_cmpl_flg = "cnf_not_cmpl_flg";
	/**
	 * Target 対象.<p>
	 *
	 */
	public static final String $lims_flg = "lims_flg";
	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public static final String $not_lims_flg = "not_lims_flg";
	public static final String $inst_st_dt_p = "inst_st_dt_p";
	public static final String $inst_end_dt_p = "inst_end_dt_p";
	public static final String $st_dt_p = "st_dt_p";
	public static final String $end_dt_p = "end_dt_p";
	/**
	 * Order date FROM 指図日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $inst_dt_fr = "inst_dt_fr";
	/**
	 * Order date TO 指図日ＴＯ.<p>
	 *
	 */
	public static final String $inst_dt_to = "inst_dt_to";
	/**
	 * Decision date FROM 判定日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $judg_dt_fr = "judg_dt_fr";
	/**
	 * Decision date TO 判定日ＴＯ.<p>
	 *
	 */
	public static final String $judg_dt_to = "judg_dt_to";
	/**
	 * Update date and time FROM 更新日時ＦＲＯＭ.<p>
	 *
	 */
	public static final String $upd_ts_fr = "upd_ts_fr";
	/**
	 * Update date and time TO 更新日時ＴＯ.<p>
	 *
	 */
	public static final String $upd_ts_to = "upd_ts_to";
	/**
	 * Inspection report printed date and time FROM 検査成績書発行日時ＦＲＯＭ.<p>
	 *
	 */
	public static final String $insp_rslt_prnt_tm_fr = "insp_rslt_prnt_tm_fr";
	/**
	 * Inspection report printed date and time TO 検査成績書発行日時ＴＯ.<p>
	 *
	 */
	public static final String $insp_rslt_prnt_tm_to = "insp_rslt_prnt_tm_to";
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
	/**
	 * Inspection classification type 検査種類区分.<p>
	 *
	 */
	public static final String $insp_typ = "insp_typ";
	/**
	 * Inspection classification type name 検査種類区分名.<p>
	 *
	 */
	public static final String $insp_typ_nm = "insp_typ_nm";
	/**
	 * Inspection pattern cd. 検査パタンＣＤ.<p>
	 *
	 */
	public static final String $insp_ptn_cd = "insp_ptn_cd";
	/**
	 * Inspection pattern name 検査パタン名.<p>
	 *
	 */
	public static final String $insp_ptn_nm = "insp_ptn_nm";
	/**
	 * Inspection method type 検査方法区分.<p>
	 *
	 */
	public static final String $insp_mtd_typ = "insp_mtd_typ";
	/**
	 * Inspection method type name 検査方法区分名.<p>
	 *
	 */
	public static final String $insp_mtd_typ_nm = "insp_mtd_typ_nm";
	/**
	 * Inspection approval status type 検査承認状況区分.<p>
	 *
	 */
	public static final String $insp_aprv_sts_typ = "insp_aprv_sts_typ";
	/**
	 * Inspection approval status type name 検査承認状況区分名.<p>
	 *
	 */
	public static final String $insp_aprv_sts_typ_nm = "insp_aprv_sts_typ_nm";
	public static final String $itm_typ_p = "itm_typ_p";
	public static final String $itm_p = "itm_p";
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public static final String $lot_no = "lot_no";
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public static final String $sublot_no = "sublot_no";
	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public static final String $bp_lot_no = "bp_lot_no";
	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public static final String $insp_no = "insp_no";
	/**
	 * Order PIC cd. 指図担当者ＣＤ.<p>
	 *
	 */
	public static final String $inst_usr_cd = "inst_usr_cd";
	/**
	 * Order PIC name 指図担当者名.<p>
	 *
	 */
	public static final String $inst_usr_nm = "inst_usr_nm";
	/**
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public static final String $inst_dpt_cd = "inst_dpt_cd";
	/**
	 * Order dept. name 指図部門名.<p>
	 *
	 */
	public static final String $inst_dpt_nm = "inst_dpt_nm";
	/**
	 * Result PIC cd. 実績担当者ＣＤ.<p>
	 *
	 */
	public static final String $act_usr_cd = "act_usr_cd";
	/**
	 * Result PIC name 実績担当者名.<p>
	 *
	 */
	public static final String $act_usr_nm = "act_usr_nm";
	/**
	 * Result dept. cd. 実績部門ＣＤ.<p>
	 *
	 */
	public static final String $act_dpt_cd = "act_dpt_cd";
	/**
	 * Result dept. name 実績部門名.<p>
	 *
	 */
	public static final String $act_dpt_nm = "act_dpt_nm";
	/**
	 * Decision PIC cd. 判定者ＣＤ.<p>
	 *
	 */
	public static final String $judg_usr_cd = "judg_usr_cd";
	/**
	 * Decision PIC name 判定者名.<p>
	 *
	 */
	public static final String $judg_usr_nm = "judg_usr_nm";
	/**
	 * Decision dept. cd. 判定部門ＣＤ.<p>
	 *
	 */
	public static final String $judg_dpt_cd = "judg_dpt_cd";
	/**
	 * Decision dept. name 判定部門名.<p>
	 *
	 */
	public static final String $judg_dpt_nm = "judg_dpt_nm";
	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public static final String $mfg_inst_no = "mfg_inst_no";
	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public static final String $po_d_no = "po_d_no";
	/**
	 * Inspection result No. 検査実績ＮＯ.<p>
	 *
	 */
	public static final String $insp_act_no = "insp_act_no";
	/**
	 * External inspection result No. 外部検査実績ＮＯ.<p>
	 *
	 */
	public static final String $ext_insp_act_no = "ext_insp_act_no";
	/**
	 * Result internal remarks 実績内部備考.<p>
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
	public static final String $sppl_grp_p = "sppl_grp_p";
	public static final String $itm_grp_p = "itm_grp_p";

	public static final String $inst_st_dt_fr = $inst_st_dt_p + ".ymd_fr";
	public static final String $inst_st_hm_fr = $inst_st_dt_p + ".hm_fr";
	public static final String $inst_st_dt_to = $inst_st_dt_p + ".ymd_to";
	public static final String $inst_st_hm_to = $inst_st_dt_p + ".hm_to";
	public static final String $inst_end_dt_fr = $inst_end_dt_p + ".ymd_fr";
	public static final String $inst_end_hm_fr = $inst_end_dt_p + ".hm_fr";
	public static final String $inst_end_dt_to = $inst_end_dt_p + ".ymd_to";
	public static final String $inst_end_hm_to = $inst_end_dt_p + ".hm_to";
	public static final String $st_dt_fr = $st_dt_p + ".ymd_fr";
	public static final String $st_hm_fr = $st_dt_p + ".hm_fr";
	public static final String $st_dt_to = $st_dt_p + ".ymd_to";
	public static final String $st_hm_to = $st_dt_p + ".hm_to";
	public static final String $end_dt_fr = $end_dt_p + ".ymd_fr";
	public static final String $end_hm_fr = $end_dt_p + ".hm_fr";
	public static final String $end_dt_to = $end_dt_p + ".ymd_to";
	public static final String $end_hm_to = $end_dt_p + ".hm_to";
	public static final String $itm_typ = $itm_typ_p + ".itm_typ";
	public static final String $itm_typ_nm = $itm_typ_p + ".itm_typ_nm";
	public static final String $itm_typ_d_cd = $itm_typ_p + ".itm_typ_d_cd";
	public static final String $itm_typ_d_nm = $itm_typ_p + ".itm_typ_d_nm";
	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $sppl_grp_lab1 = $sppl_grp_p + ".bp_grp_lab1";
	public static final String $sppl_grp_flg1 = $sppl_grp_p + ".bp_grp_flg1";
	public static final String $sppl_grp_cd1 = $sppl_grp_p + ".bp_grp_cd1";
	public static final String $sppl_grp_nm1 = $sppl_grp_p + ".bp_grp_nm1";
	public static final String $sppl_grp_lab2 = $sppl_grp_p + ".bp_grp_lab2";
	public static final String $sppl_grp_flg2 = $sppl_grp_p + ".bp_grp_flg2";
	public static final String $sppl_grp_cd2 = $sppl_grp_p + ".bp_grp_cd2";
	public static final String $sppl_grp_nm2 = $sppl_grp_p + ".bp_grp_nm2";
	public static final String $sppl_grp_lab3 = $sppl_grp_p + ".bp_grp_lab3";
	public static final String $sppl_grp_flg3 = $sppl_grp_p + ".bp_grp_flg3";
	public static final String $sppl_grp_cd3 = $sppl_grp_p + ".bp_grp_cd3";
	public static final String $sppl_grp_nm3 = $sppl_grp_p + ".bp_grp_nm3";
	public static final String $sppl_grp_lab4 = $sppl_grp_p + ".bp_grp_lab4";
	public static final String $sppl_grp_flg4 = $sppl_grp_p + ".bp_grp_flg4";
	public static final String $sppl_grp_cd4 = $sppl_grp_p + ".bp_grp_cd4";
	public static final String $sppl_grp_nm4 = $sppl_grp_p + ".bp_grp_nm4";
	public static final String $sppl_grp_lab5 = $sppl_grp_p + ".bp_grp_lab5";
	public static final String $sppl_grp_flg5 = $sppl_grp_p + ".bp_grp_flg5";
	public static final String $sppl_grp_cd5 = $sppl_grp_p + ".bp_grp_cd5";
	public static final String $sppl_grp_nm5 = $sppl_grp_p + ".bp_grp_nm5";
	public static final String $sppl_grp_lab6 = $sppl_grp_p + ".bp_grp_lab6";
	public static final String $sppl_grp_flg6 = $sppl_grp_p + ".bp_grp_flg6";
	public static final String $sppl_grp_cd6 = $sppl_grp_p + ".bp_grp_cd6";
	public static final String $sppl_grp_nm6 = $sppl_grp_p + ".bp_grp_nm6";
	public static final String $sppl_grp_lab7 = $sppl_grp_p + ".bp_grp_lab7";
	public static final String $sppl_grp_flg7 = $sppl_grp_p + ".bp_grp_flg7";
	public static final String $sppl_grp_cd7 = $sppl_grp_p + ".bp_grp_cd7";
	public static final String $sppl_grp_nm7 = $sppl_grp_p + ".bp_grp_nm7";
	public static final String $sppl_grp_lab8 = $sppl_grp_p + ".bp_grp_lab8";
	public static final String $sppl_grp_flg8 = $sppl_grp_p + ".bp_grp_flg8";
	public static final String $sppl_grp_cd8 = $sppl_grp_p + ".bp_grp_cd8";
	public static final String $sppl_grp_nm8 = $sppl_grp_p + ".bp_grp_nm8";
	public static final String $sppl_grp_lab9 = $sppl_grp_p + ".bp_grp_lab9";
	public static final String $sppl_grp_flg9 = $sppl_grp_p + ".bp_grp_flg9";
	public static final String $sppl_grp_cd9 = $sppl_grp_p + ".bp_grp_cd9";
	public static final String $sppl_grp_nm9 = $sppl_grp_p + ".bp_grp_nm9";
	public static final String $sppl_grp_lab10 = $sppl_grp_p + ".bp_grp_lab10";
	public static final String $sppl_grp_flg10 = $sppl_grp_p + ".bp_grp_flg10";
	public static final String $sppl_grp_cd10 = $sppl_grp_p + ".bp_grp_cd10";
	public static final String $sppl_grp_nm10 = $sppl_grp_p + ".bp_grp_nm10";
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
	public static final MCMeta ord_flg_META = createCommonMeta($ord_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stt_flg_META = createCommonMeta($stt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cmpl_flg_META = createCommonMeta($cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_rslt_not_prnt_flg_META = createCommonMeta($insp_rslt_not_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_rslt_prnt_flg_META = createCommonMeta($insp_rslt_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cnf_cmpl_flg_META = createCommonMeta($cnf_cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cnf_not_cmpl_flg_META = createCommonMeta($cnf_not_cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lims_flg_META = createCommonMeta($lims_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_lims_flg_META = createCommonMeta($not_lims_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_st_dt_p_META = createInnerRowMeta($inst_st_dt_p, mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class);
	public static final MCMeta inst_end_dt_p_META = createInnerRowMeta($inst_end_dt_p, mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class);
	public static final MCMeta st_dt_p_META = createInnerRowMeta($st_dt_p, mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class);
	public static final MCMeta end_dt_p_META = createInnerRowMeta($end_dt_p, mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class);
	public static final MCMeta inst_dt_fr_META = createCommonMeta($inst_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta inst_dt_to_META = createCommonMeta($inst_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta judg_dt_fr_META = createCommonMeta($judg_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta judg_dt_to_META = createCommonMeta($judg_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta upd_ts_fr_META = createCommonMeta($upd_ts_fr, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_ts_to_META = createCommonMeta($upd_ts_to, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta insp_rslt_prnt_tm_fr_META = createCommonMeta($insp_rslt_prnt_tm_fr, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta insp_rslt_prnt_tm_to_META = createCommonMeta($insp_rslt_prnt_tm_to, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta site_nm_META = createCommonMeta($site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta mfg_loc_nm_META = createCommonMeta($mfg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta maker_cd_META = createCommonMeta($maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta maker_nm_META = createCommonMeta($maker_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta insp_typ_META = createCommonMeta($insp_typ, mcframe.commonMS.meta.MS_META.INSP_TYP);
	public static final MCMeta insp_typ_nm_META = createCommonMeta($insp_typ_nm, mcframe.commonMS.meta.MS_META.INSP_TYP_NM);
	public static final MCMeta insp_ptn_cd_META = createCommonMeta($insp_ptn_cd, mcframe.commonMA.meta.MA_META.INSP_PTN_CD);
	public static final MCMeta insp_ptn_nm_META = createCommonMeta($insp_ptn_nm, mcframe.commonMA.meta.MA_META.INSP_PTN_NM);
	public static final MCMeta insp_mtd_typ_META = createCommonMeta($insp_mtd_typ, mcframe.commonMA.meta.MA_META.INSP_MTD_TYP);
	public static final MCMeta insp_mtd_typ_nm_META = createCommonMeta($insp_mtd_typ_nm, mcframe.commonMA.meta.MA_META.INSP_MTD_TYP_NM);
	public static final MCMeta insp_aprv_sts_typ_META = createCommonMeta($insp_aprv_sts_typ, mcframe.commonMS.meta.MS_META.INSP_APRV_STS_TYP);
	public static final MCMeta insp_aprv_sts_typ_nm_META = createCommonMeta($insp_aprv_sts_typ_nm, mcframe.commonMS.meta.MS_META.INSP_APRV_STS_TYP_NM);
	public static final MCMeta itm_typ_p_META = createInnerRowMeta($itm_typ_p, mcframe.clientMAUB.MAUBP0100.ItmTypR.class);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta bp_lot_no_META = createCommonMeta($bp_lot_no, mcframe.commonMA.meta.MA_META.BP_LOT_NO);
	public static final MCMeta insp_no_META = createCommonMeta($insp_no, mcframe.commonMA.meta.MA_META.INSP_NO);
	public static final MCMeta inst_usr_cd_META = createCommonMeta($inst_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta inst_usr_nm_META = createCommonMeta($inst_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta inst_dpt_cd_META = createCommonMeta($inst_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta inst_dpt_nm_META = createCommonMeta($inst_dpt_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta act_usr_cd_META = createCommonMeta($act_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta act_usr_nm_META = createCommonMeta($act_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta act_dpt_cd_META = createCommonMeta($act_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta act_dpt_nm_META = createCommonMeta($act_dpt_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta judg_usr_cd_META = createCommonMeta($judg_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta judg_usr_nm_META = createCommonMeta($judg_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta judg_dpt_cd_META = createCommonMeta($judg_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta judg_dpt_nm_META = createCommonMeta($judg_dpt_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta po_d_no_META = createCommonMeta($po_d_no, mcframe.commonMA.meta.MA_META.PO_D_NO);
	public static final MCMeta insp_act_no_META = createCommonMeta($insp_act_no, mcframe.commonMA.meta.MA_META.INSP_ACT_NO);
	public static final MCMeta ext_insp_act_no_META = createCommonMeta($ext_insp_act_no, mcframe.commonMA.meta.MA_META.EXT_INSP_ACT_NO);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.INSP_ACT_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.INSP_ACT_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.INSP_ACT_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.INSP_ACT_SUB_CHAR3);
	public static final MCMeta sppl_grp_p_META = createInnerRowMeta($sppl_grp_p, mcframe.clientMAUB.MAUBP0260.BpGrpR.class);
	public static final MCMeta itm_grp_p_META = createInnerRowMeta($itm_grp_p, mcframe.clientMAUB.MAUBP0250.ItmGrpR.class);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			ord_flg_META,
			stt_flg_META,
			cmpl_flg_META,
			insp_rslt_not_prnt_flg_META,
			insp_rslt_prnt_flg_META,
			cnf_cmpl_flg_META,
			cnf_not_cmpl_flg_META,
			lims_flg_META,
			not_lims_flg_META,
			inst_st_dt_p_META,
			inst_end_dt_p_META,
			st_dt_p_META,
			end_dt_p_META,
			inst_dt_fr_META,
			inst_dt_to_META,
			judg_dt_fr_META,
			judg_dt_to_META,
			upd_ts_fr_META,
			upd_ts_to_META,
			insp_rslt_prnt_tm_fr_META,
			insp_rslt_prnt_tm_to_META,
			site_cd_META,
			site_nm_META,
			mfg_loc_cd_META,
			mfg_loc_nm_META,
			sppl_cd_META,
			sppl_nm_META,
			maker_cd_META,
			maker_nm_META,
			insp_typ_META,
			insp_typ_nm_META,
			insp_ptn_cd_META,
			insp_ptn_nm_META,
			insp_mtd_typ_META,
			insp_mtd_typ_nm_META,
			insp_aprv_sts_typ_META,
			insp_aprv_sts_typ_nm_META,
			itm_typ_p_META,
			itm_p_META,
			lot_no_META,
			sublot_no_META,
			bp_lot_no_META,
			insp_no_META,
			inst_usr_cd_META,
			inst_usr_nm_META,
			inst_dpt_cd_META,
			inst_dpt_nm_META,
			act_usr_cd_META,
			act_usr_nm_META,
			act_dpt_cd_META,
			act_dpt_nm_META,
			judg_usr_cd_META,
			judg_usr_nm_META,
			judg_dpt_cd_META,
			judg_dpt_nm_META,
			mfg_inst_no_META,
			po_d_no_META,
			insp_act_no_META,
			ext_insp_act_no_META,
			intr_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			sppl_grp_p_META,
			itm_grp_p_META
		},
		new String[][]{
			{
				"inst_st_dt_fr",
				"inst_st_hm_fr",
				"inst_st_dt_to",
				"inst_st_hm_to",
				"inst_end_dt_fr",
				"inst_end_hm_fr",
				"inst_end_dt_to",
				"inst_end_hm_to",
				"st_dt_fr",
				"st_hm_fr",
				"st_dt_to",
				"st_hm_to",
				"end_dt_fr",
				"end_hm_fr",
				"end_dt_to",
				"end_hm_to",
				"itm_typ",
				"itm_typ_nm",
				"itm_typ_d_cd",
				"itm_typ_d_nm",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"sppl_grp_flg1",
				"sppl_grp_cd1",
				"sppl_grp_nm1",
				"sppl_grp_flg2",
				"sppl_grp_cd2",
				"sppl_grp_nm2",
				"sppl_grp_flg3",
				"sppl_grp_cd3",
				"sppl_grp_nm3",
				"sppl_grp_flg4",
				"sppl_grp_cd4",
				"sppl_grp_nm4",
				"sppl_grp_flg5",
				"sppl_grp_cd5",
				"sppl_grp_nm5",
				"sppl_grp_flg6",
				"sppl_grp_cd6",
				"sppl_grp_nm6",
				"sppl_grp_flg7",
				"sppl_grp_cd7",
				"sppl_grp_nm7",
				"sppl_grp_flg8",
				"sppl_grp_cd8",
				"sppl_grp_nm8",
				"sppl_grp_flg9",
				"sppl_grp_cd9",
				"sppl_grp_nm9",
				"sppl_grp_flg10",
				"sppl_grp_cd10",
				"sppl_grp_nm10",
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
				$inst_st_dt_fr,
				$inst_st_hm_fr,
				$inst_st_dt_to,
				$inst_st_hm_to,
				$inst_end_dt_fr,
				$inst_end_hm_fr,
				$inst_end_dt_to,
				$inst_end_hm_to,
				$st_dt_fr,
				$st_hm_fr,
				$st_dt_to,
				$st_hm_to,
				$end_dt_fr,
				$end_hm_fr,
				$end_dt_to,
				$end_hm_to,
				$itm_typ,
				$itm_typ_nm,
				$itm_typ_d_cd,
				$itm_typ_d_nm,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$sppl_grp_flg1,
				$sppl_grp_cd1,
				$sppl_grp_nm1,
				$sppl_grp_flg2,
				$sppl_grp_cd2,
				$sppl_grp_nm2,
				$sppl_grp_flg3,
				$sppl_grp_cd3,
				$sppl_grp_nm3,
				$sppl_grp_flg4,
				$sppl_grp_cd4,
				$sppl_grp_nm4,
				$sppl_grp_flg5,
				$sppl_grp_cd5,
				$sppl_grp_nm5,
				$sppl_grp_flg6,
				$sppl_grp_cd6,
				$sppl_grp_nm6,
				$sppl_grp_flg7,
				$sppl_grp_cd7,
				$sppl_grp_nm7,
				$sppl_grp_flg8,
				$sppl_grp_cd8,
				$sppl_grp_nm8,
				$sppl_grp_flg9,
				$sppl_grp_cd9,
				$sppl_grp_nm9,
				$sppl_grp_flg10,
				$sppl_grp_cd10,
				$sppl_grp_nm10,
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
				{$mfg_loc_cd, "loc_nm"},	// mfg_loc_cd
				{$sppl_cd, "bp_nm"},	// sppl_cd
				{$maker_cd, "bp_nm"},	// maker_cd
				{$inst_usr_cd, "usr_nm"},	// inst_usr_cd
				{$inst_dpt_cd, "dpt_nm"},	// inst_dpt_cd
				{$act_usr_cd, "usr_nm"},	// act_usr_cd
				{$act_dpt_cd, "dpt_nm"},	// act_dpt_cd
				{$judg_usr_cd, "usr_nm"},	// judg_usr_cd
				{$judg_dpt_cd, "dpt_nm"}	// judg_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$sppl_cd, "MAC_BP_IS_SRCH_TYP.SPPL"},	// sppl_cd
				{$maker_cd, "MAC_BP_IS_SRCH_TYP.MAKER"},	// maker_cd
				{$itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.STK1"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "MAC_ITM_IS_SRCH_TYP.STK1;itm_cd"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "MAC_ITM_IS_SRCH_TYP.STK1;itm_cd;itm_sub1"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.STK1;itm_cd;itm_sub1;itm_sub2"},	// itm_p.itm_sub3
				{$lot_no, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// lot_no
				{$sublot_no, "itm_cd;itm_sub1;itm_sub2;itm_sub3;lot_no"},	// sublot_no
				{$inst_dpt_cd, "MAC_DPT_IS_SRCH_TYP.INSP;true;true"},	// inst_dpt_cd
				{$act_dpt_cd, "MAC_DPT_IS_SRCH_TYP.INSP;true;true"},	// act_dpt_cd
				{$judg_dpt_cd, "MAC_DPT_IS_SRCH_TYP.INSP;true;true"}	// judg_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$sppl_cd, "bp_is_srch_typ"},	// sppl_cd
				{$maker_cd, "bp_is_srch_typ"},	// maker_cd
				{$itm_p + ".itm_cd", "itm_is_srch_typ"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "itm_is_srch_typ;itm_cd"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "itm_is_srch_typ;itm_cd;itm_sub1"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"},	// itm_p.itm_sub3
				{$lot_no, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// lot_no
				{$sublot_no, "itm_cd;itm_sub1;itm_sub2;itm_sub3;lot_no"},	// sublot_no
				{$inst_dpt_cd, "dpt_is_srch_typ;dpt_nm_rem_flg;mode_today_flg"},	// inst_dpt_cd
				{$act_dpt_cd, "dpt_is_srch_typ;dpt_nm_rem_flg;mode_today_flg"},	// act_dpt_cd
				{$judg_dpt_cd, "dpt_is_srch_typ;dpt_nm_rem_flg;mode_today_flg"}	// judg_dpt_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$judg_dt_fr, "MFG_APRV"},	// judg_dt_fr
				{$judg_dt_to, "MFG_APRV"},	// judg_dt_to
				{$site_cd, "SITE"},	// site_cd
				{$site_nm, "SITE"},	// site_nm
				{$maker_cd, "MAKER"},	// maker_cd
				{$maker_nm, "MAKER"},	// maker_nm
				{$insp_aprv_sts_typ, "MFG_APRV"},	// insp_aprv_sts_typ
				{$insp_aprv_sts_typ_nm, "MFG_APRV"},	// insp_aprv_sts_typ_nm
				{$judg_usr_cd, "MFG_APRV"},	// judg_usr_cd
				{$judg_usr_nm, "MFG_APRV"},	// judg_usr_nm
				{$judg_dpt_cd, "MFG_APRV"},	// judg_dpt_cd
				{$judg_dpt_nm, "MFG_APRV"}	// judg_dpt_nm
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
	 * UPD,Create/Modify,UPD;JUDG,Decide,JUDG;DEL,Cancel result,DEL;DEL_JUDG,Cancel decision,DEL_JUDG;REF,View,REF;PRNT_RSLT,Issue report,PRNT_RSLT UPD,登録・訂正する,UPD;JUDG,判定する,JUDG;DEL,実績を取り消す,DEL;DEL_JUDG,判定を取り消す,DEL_JUDG;REF,参照する,REF;PRNT_RSLT,成績書発行,PRNT_RSLT.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * UPD,Create/Modify,UPD;JUDG,Decide,JUDG;DEL,Cancel result,DEL;DEL_JUDG,Cancel decision,DEL_JUDG;REF,View,REF;PRNT_RSLT,Issue report,PRNT_RSLT UPD,登録・訂正する,UPD;JUDG,判定する,JUDG;DEL,実績を取り消す,DEL;DEL_JUDG,判定を取り消す,DEL_JUDG;REF,参照する,REF;PRNT_RSLT,成績書発行,PRNT_RSLT.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public boolean ord_flg() {
		return getConstBoolean(offset + 1, $ord_flg);
	}

	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public void ord_flg(boolean value) {
		setConstBoolean(offset + 1, $ord_flg, value);
	}


	/**
	 * In process 着手中.<p>
	 *
	 */
	public boolean stt_flg() {
		return getConstBoolean(offset + 2, $stt_flg);
	}

	/**
	 * In process 着手中.<p>
	 *
	 */
	public void stt_flg(boolean value) {
		setConstBoolean(offset + 2, $stt_flg, value);
	}


	/**
	 * Completed 完了.<p>
	 *
	 */
	public boolean cmpl_flg() {
		return getConstBoolean(offset + 3, $cmpl_flg);
	}

	/**
	 * Completed 完了.<p>
	 *
	 */
	public void cmpl_flg(boolean value) {
		setConstBoolean(offset + 3, $cmpl_flg, value);
	}


	/**
	 * Unissued 未発行.<p>
	 *
	 */
	public boolean insp_rslt_not_prnt_flg() {
		return getConstBoolean(offset + 4, $insp_rslt_not_prnt_flg);
	}

	/**
	 * Unissued 未発行.<p>
	 *
	 */
	public void insp_rslt_not_prnt_flg(boolean value) {
		setConstBoolean(offset + 4, $insp_rslt_not_prnt_flg, value);
	}


	/**
	 * Issued 発行済.<p>
	 *
	 */
	public boolean insp_rslt_prnt_flg() {
		return getConstBoolean(offset + 5, $insp_rslt_prnt_flg);
	}

	/**
	 * Issued 発行済.<p>
	 *
	 */
	public void insp_rslt_prnt_flg(boolean value) {
		setConstBoolean(offset + 5, $insp_rslt_prnt_flg, value);
	}


	/**
	 * Checked 確認済.<p>
	 *
	 */
	public boolean cnf_cmpl_flg() {
		return getConstBoolean(offset + 6, $cnf_cmpl_flg);
	}

	/**
	 * Checked 確認済.<p>
	 *
	 */
	public void cnf_cmpl_flg(boolean value) {
		setConstBoolean(offset + 6, $cnf_cmpl_flg, value);
	}


	/**
	 * With unchecked 未確認有.<p>
	 *
	 */
	public boolean cnf_not_cmpl_flg() {
		return getConstBoolean(offset + 7, $cnf_not_cmpl_flg);
	}

	/**
	 * With unchecked 未確認有.<p>
	 *
	 */
	public void cnf_not_cmpl_flg(boolean value) {
		setConstBoolean(offset + 7, $cnf_not_cmpl_flg, value);
	}


	/**
	 * Target 対象.<p>
	 *
	 */
	public boolean lims_flg() {
		return getConstBoolean(offset + 8, $lims_flg);
	}

	/**
	 * Target 対象.<p>
	 *
	 */
	public void lims_flg(boolean value) {
		setConstBoolean(offset + 8, $lims_flg, value);
	}


	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public boolean not_lims_flg() {
		return getConstBoolean(offset + 9, $not_lims_flg);
	}

	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public void not_lims_flg(boolean value) {
		setConstBoolean(offset + 9, $not_lims_flg, value);
	}


	public mcframe.clientMAUB.MAUBP0400.YmdHmFrToR inst_st_dt_p(){
		return (mcframe.clientMAUB.MAUBP0400.YmdHmFrToR) getConstInnerRow(offset + 10, $inst_st_dt_p);
	}
	
	public void inst_st_dt_p(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR row){
		setConstInnerRow(offset + 10, $inst_st_dt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0400.YmdHmFrToR inst_end_dt_p(){
		return (mcframe.clientMAUB.MAUBP0400.YmdHmFrToR) getConstInnerRow(offset + 11, $inst_end_dt_p);
	}
	
	public void inst_end_dt_p(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR row){
		setConstInnerRow(offset + 11, $inst_end_dt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0400.YmdHmFrToR st_dt_p(){
		return (mcframe.clientMAUB.MAUBP0400.YmdHmFrToR) getConstInnerRow(offset + 12, $st_dt_p);
	}
	
	public void st_dt_p(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR row){
		setConstInnerRow(offset + 12, $st_dt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0400.YmdHmFrToR end_dt_p(){
		return (mcframe.clientMAUB.MAUBP0400.YmdHmFrToR) getConstInnerRow(offset + 13, $end_dt_p);
	}
	
	public void end_dt_p(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR row){
		setConstInnerRow(offset + 13, $end_dt_p, row);
	}


	/**
	 * Order date FROM 指図日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate inst_dt_fr() {
		return getConstDate(offset + 14, $inst_dt_fr);
	}

	/**
	 * Order date FROM 指図日ＦＲＯＭ.<p>
	 *
	 */
	public void inst_dt_fr(MCDate value) {
		setConstDate(offset + 14, $inst_dt_fr, value);
	}


	/**
	 * Order date TO 指図日ＴＯ.<p>
	 *
	 */
	public MCDate inst_dt_to() {
		return getConstDate(offset + 15, $inst_dt_to);
	}

	/**
	 * Order date TO 指図日ＴＯ.<p>
	 *
	 */
	public void inst_dt_to(MCDate value) {
		setConstDate(offset + 15, $inst_dt_to, value);
	}


	/**
	 * Decision date FROM 判定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate judg_dt_fr() {
		return getConstDate(offset + 16, $judg_dt_fr);
	}

	/**
	 * Decision date FROM 判定日ＦＲＯＭ.<p>
	 *
	 */
	public void judg_dt_fr(MCDate value) {
		setConstDate(offset + 16, $judg_dt_fr, value);
	}


	/**
	 * Decision date TO 判定日ＴＯ.<p>
	 *
	 */
	public MCDate judg_dt_to() {
		return getConstDate(offset + 17, $judg_dt_to);
	}

	/**
	 * Decision date TO 判定日ＴＯ.<p>
	 *
	 */
	public void judg_dt_to(MCDate value) {
		setConstDate(offset + 17, $judg_dt_to, value);
	}


	/**
	 * Update date and time FROM 更新日時ＦＲＯＭ.<p>
	 *
	 */
	public MCTimestamp upd_ts_fr() {
		return getConstTimestamp(offset + 18, $upd_ts_fr);
	}

	/**
	 * Update date and time FROM 更新日時ＦＲＯＭ.<p>
	 *
	 */
	public void upd_ts_fr(MCTimestamp value) {
		setConstTimestamp(offset + 18, $upd_ts_fr, value);
	}


	/**
	 * Update date and time TO 更新日時ＴＯ.<p>
	 *
	 */
	public MCTimestamp upd_ts_to() {
		return getConstTimestamp(offset + 19, $upd_ts_to);
	}

	/**
	 * Update date and time TO 更新日時ＴＯ.<p>
	 *
	 */
	public void upd_ts_to(MCTimestamp value) {
		setConstTimestamp(offset + 19, $upd_ts_to, value);
	}


	/**
	 * Inspection report printed date and time FROM 検査成績書発行日時ＦＲＯＭ.<p>
	 *
	 */
	public MCDate insp_rslt_prnt_tm_fr() {
		return getConstDate(offset + 20, $insp_rslt_prnt_tm_fr);
	}

	/**
	 * Inspection report printed date and time FROM 検査成績書発行日時ＦＲＯＭ.<p>
	 *
	 */
	public void insp_rslt_prnt_tm_fr(MCDate value) {
		setConstDate(offset + 20, $insp_rslt_prnt_tm_fr, value);
	}


	/**
	 * Inspection report printed date and time TO 検査成績書発行日時ＴＯ.<p>
	 *
	 */
	public MCDate insp_rslt_prnt_tm_to() {
		return getConstDate(offset + 21, $insp_rslt_prnt_tm_to);
	}

	/**
	 * Inspection report printed date and time TO 検査成績書発行日時ＴＯ.<p>
	 *
	 */
	public void insp_rslt_prnt_tm_to(MCDate value) {
		setConstDate(offset + 21, $insp_rslt_prnt_tm_to, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 22, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 22, $site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 23, $site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 23, $site_nm, value);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 24, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 24, $mfg_loc_cd, value);
	}


	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public String mfg_loc_nm() {
		return getConstString(offset + 25, $mfg_loc_nm);
	}

	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public void mfg_loc_nm(String value) {
		setConstString(offset + 25, $mfg_loc_nm, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 26, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 26, $sppl_cd, value);
	}


	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 27, $sppl_nm);
	}

	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 27, $sppl_nm, value);
	}


	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 28, $maker_cd);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 28, $maker_cd, value);
	}


	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public String maker_nm() {
		return getConstString(offset + 29, $maker_nm);
	}

	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public void maker_nm(String value) {
		setConstString(offset + 29, $maker_nm, value);
	}


	/**
	 * Inspection classification type 検査種類区分.<p>
	 *
	 */
	public String insp_typ() {
		return getConstString(offset + 30, $insp_typ);
	}

	/**
	 * Inspection classification type 検査種類区分.<p>
	 *
	 */
	public void insp_typ(String value) {
		setConstString(offset + 30, $insp_typ, value);
	}


	/**
	 * Inspection classification type name 検査種類区分名.<p>
	 *
	 */
	public String insp_typ_nm() {
		return getConstString(offset + 31, $insp_typ_nm);
	}

	/**
	 * Inspection classification type name 検査種類区分名.<p>
	 *
	 */
	public void insp_typ_nm(String value) {
		setConstString(offset + 31, $insp_typ_nm, value);
	}


	/**
	 * Inspection pattern cd. 検査パタンＣＤ.<p>
	 *
	 */
	public String insp_ptn_cd() {
		return getConstString(offset + 32, $insp_ptn_cd);
	}

	/**
	 * Inspection pattern cd. 検査パタンＣＤ.<p>
	 *
	 */
	public void insp_ptn_cd(String value) {
		setConstString(offset + 32, $insp_ptn_cd, value);
	}


	/**
	 * Inspection pattern name 検査パタン名.<p>
	 *
	 */
	public String insp_ptn_nm() {
		return getConstString(offset + 33, $insp_ptn_nm);
	}

	/**
	 * Inspection pattern name 検査パタン名.<p>
	 *
	 */
	public void insp_ptn_nm(String value) {
		setConstString(offset + 33, $insp_ptn_nm, value);
	}


	/**
	 * Inspection method type 検査方法区分.<p>
	 *
	 */
	public String insp_mtd_typ() {
		return getConstString(offset + 34, $insp_mtd_typ);
	}

	/**
	 * Inspection method type 検査方法区分.<p>
	 *
	 */
	public void insp_mtd_typ(String value) {
		setConstString(offset + 34, $insp_mtd_typ, value);
	}


	/**
	 * Inspection method type name 検査方法区分名.<p>
	 *
	 */
	public String insp_mtd_typ_nm() {
		return getConstString(offset + 35, $insp_mtd_typ_nm);
	}

	/**
	 * Inspection method type name 検査方法区分名.<p>
	 *
	 */
	public void insp_mtd_typ_nm(String value) {
		setConstString(offset + 35, $insp_mtd_typ_nm, value);
	}


	/**
	 * Inspection approval status type 検査承認状況区分.<p>
	 *
	 */
	public String insp_aprv_sts_typ() {
		return getConstString(offset + 36, $insp_aprv_sts_typ);
	}

	/**
	 * Inspection approval status type 検査承認状況区分.<p>
	 *
	 */
	public void insp_aprv_sts_typ(String value) {
		setConstString(offset + 36, $insp_aprv_sts_typ, value);
	}


	/**
	 * Inspection approval status type name 検査承認状況区分名.<p>
	 *
	 */
	public String insp_aprv_sts_typ_nm() {
		return getConstString(offset + 37, $insp_aprv_sts_typ_nm);
	}

	/**
	 * Inspection approval status type name 検査承認状況区分名.<p>
	 *
	 */
	public void insp_aprv_sts_typ_nm(String value) {
		setConstString(offset + 37, $insp_aprv_sts_typ_nm, value);
	}


	public mcframe.clientMAUB.MAUBP0100.ItmTypR itm_typ_p(){
		return (mcframe.clientMAUB.MAUBP0100.ItmTypR) getConstInnerRow(offset + 38, $itm_typ_p);
	}
	
	public void itm_typ_p(mcframe.clientMAUB.MAUBP0100.ItmTypR row){
		setConstInnerRow(offset + 38, $itm_typ_p, row);
	}


	public mcframe.clientMAUB.MAUBP0030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 39, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 39, $itm_p, row);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 40, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 40, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 41, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 41, $sublot_no, value);
	}


	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public String bp_lot_no() {
		return getConstString(offset + 42, $bp_lot_no);
	}

	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public void bp_lot_no(String value) {
		setConstString(offset + 42, $bp_lot_no, value);
	}


	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public String insp_no() {
		return getConstString(offset + 43, $insp_no);
	}

	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public void insp_no(String value) {
		setConstString(offset + 43, $insp_no, value);
	}


	/**
	 * Order PIC cd. 指図担当者ＣＤ.<p>
	 *
	 */
	public String inst_usr_cd() {
		return getConstString(offset + 44, $inst_usr_cd);
	}

	/**
	 * Order PIC cd. 指図担当者ＣＤ.<p>
	 *
	 */
	public void inst_usr_cd(String value) {
		setConstString(offset + 44, $inst_usr_cd, value);
	}


	/**
	 * Order PIC name 指図担当者名.<p>
	 *
	 */
	public String inst_usr_nm() {
		return getConstString(offset + 45, $inst_usr_nm);
	}

	/**
	 * Order PIC name 指図担当者名.<p>
	 *
	 */
	public void inst_usr_nm(String value) {
		setConstString(offset + 45, $inst_usr_nm, value);
	}


	/**
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public String inst_dpt_cd() {
		return getConstString(offset + 46, $inst_dpt_cd);
	}

	/**
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public void inst_dpt_cd(String value) {
		setConstString(offset + 46, $inst_dpt_cd, value);
	}


	/**
	 * Order dept. name 指図部門名.<p>
	 *
	 */
	public String inst_dpt_nm() {
		return getConstString(offset + 47, $inst_dpt_nm);
	}

	/**
	 * Order dept. name 指図部門名.<p>
	 *
	 */
	public void inst_dpt_nm(String value) {
		setConstString(offset + 47, $inst_dpt_nm, value);
	}


	/**
	 * Result PIC cd. 実績担当者ＣＤ.<p>
	 *
	 */
	public String act_usr_cd() {
		return getConstString(offset + 48, $act_usr_cd);
	}

	/**
	 * Result PIC cd. 実績担当者ＣＤ.<p>
	 *
	 */
	public void act_usr_cd(String value) {
		setConstString(offset + 48, $act_usr_cd, value);
	}


	/**
	 * Result PIC name 実績担当者名.<p>
	 *
	 */
	public String act_usr_nm() {
		return getConstString(offset + 49, $act_usr_nm);
	}

	/**
	 * Result PIC name 実績担当者名.<p>
	 *
	 */
	public void act_usr_nm(String value) {
		setConstString(offset + 49, $act_usr_nm, value);
	}


	/**
	 * Result dept. cd. 実績部門ＣＤ.<p>
	 *
	 */
	public String act_dpt_cd() {
		return getConstString(offset + 50, $act_dpt_cd);
	}

	/**
	 * Result dept. cd. 実績部門ＣＤ.<p>
	 *
	 */
	public void act_dpt_cd(String value) {
		setConstString(offset + 50, $act_dpt_cd, value);
	}


	/**
	 * Result dept. name 実績部門名.<p>
	 *
	 */
	public String act_dpt_nm() {
		return getConstString(offset + 51, $act_dpt_nm);
	}

	/**
	 * Result dept. name 実績部門名.<p>
	 *
	 */
	public void act_dpt_nm(String value) {
		setConstString(offset + 51, $act_dpt_nm, value);
	}


	/**
	 * Decision PIC cd. 判定者ＣＤ.<p>
	 *
	 */
	public String judg_usr_cd() {
		return getConstString(offset + 52, $judg_usr_cd);
	}

	/**
	 * Decision PIC cd. 判定者ＣＤ.<p>
	 *
	 */
	public void judg_usr_cd(String value) {
		setConstString(offset + 52, $judg_usr_cd, value);
	}


	/**
	 * Decision PIC name 判定者名.<p>
	 *
	 */
	public String judg_usr_nm() {
		return getConstString(offset + 53, $judg_usr_nm);
	}

	/**
	 * Decision PIC name 判定者名.<p>
	 *
	 */
	public void judg_usr_nm(String value) {
		setConstString(offset + 53, $judg_usr_nm, value);
	}


	/**
	 * Decision dept. cd. 判定部門ＣＤ.<p>
	 *
	 */
	public String judg_dpt_cd() {
		return getConstString(offset + 54, $judg_dpt_cd);
	}

	/**
	 * Decision dept. cd. 判定部門ＣＤ.<p>
	 *
	 */
	public void judg_dpt_cd(String value) {
		setConstString(offset + 54, $judg_dpt_cd, value);
	}


	/**
	 * Decision dept. name 判定部門名.<p>
	 *
	 */
	public String judg_dpt_nm() {
		return getConstString(offset + 55, $judg_dpt_nm);
	}

	/**
	 * Decision dept. name 判定部門名.<p>
	 *
	 */
	public void judg_dpt_nm(String value) {
		setConstString(offset + 55, $judg_dpt_nm, value);
	}


	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 56, $mfg_inst_no);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 56, $mfg_inst_no, value);
	}


	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public String po_d_no() {
		return getConstString(offset + 57, $po_d_no);
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public void po_d_no(String value) {
		setConstString(offset + 57, $po_d_no, value);
	}


	/**
	 * Inspection result No. 検査実績ＮＯ.<p>
	 *
	 */
	public String insp_act_no() {
		return getConstString(offset + 58, $insp_act_no);
	}

	/**
	 * Inspection result No. 検査実績ＮＯ.<p>
	 *
	 */
	public void insp_act_no(String value) {
		setConstString(offset + 58, $insp_act_no, value);
	}


	/**
	 * External inspection result No. 外部検査実績ＮＯ.<p>
	 *
	 */
	public String ext_insp_act_no() {
		return getConstString(offset + 59, $ext_insp_act_no);
	}

	/**
	 * External inspection result No. 外部検査実績ＮＯ.<p>
	 *
	 */
	public void ext_insp_act_no(String value) {
		setConstString(offset + 59, $ext_insp_act_no, value);
	}


	/**
	 * Result internal remarks 実績内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 60, $intr_rmrks);
	}

	/**
	 * Result internal remarks 実績内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 60, $intr_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 61, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 61, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 62, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 62, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 63, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 63, $sub_char3, value);
	}


	public mcframe.clientMAUB.MAUBP0260.BpGrpR sppl_grp_p(){
		return (mcframe.clientMAUB.MAUBP0260.BpGrpR) getConstInnerRow(offset + 64, $sppl_grp_p);
	}
	
	public void sppl_grp_p(mcframe.clientMAUB.MAUBP0260.BpGrpR row){
		setConstInnerRow(offset + 64, $sppl_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP0250.ItmGrpR itm_grp_p(){
		return (mcframe.clientMAUB.MAUBP0250.ItmGrpR) getConstInnerRow(offset + 65, $itm_grp_p);
	}
	
	public void itm_grp_p(mcframe.clientMAUB.MAUBP0250.ItmGrpR row){
		setConstInnerRow(offset + 65, $itm_grp_p, row);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
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
		if ($insp_typ.equalsIgnoreCase(name)) {
			return insp_typ();
		}
		if ($insp_typ_nm.equalsIgnoreCase(name)) {
			return insp_typ_nm();
		}
		if ($insp_ptn_cd.equalsIgnoreCase(name)) {
			return insp_ptn_cd();
		}
		if ($insp_ptn_nm.equalsIgnoreCase(name)) {
			return insp_ptn_nm();
		}
		if ($insp_mtd_typ.equalsIgnoreCase(name)) {
			return insp_mtd_typ();
		}
		if ($insp_mtd_typ_nm.equalsIgnoreCase(name)) {
			return insp_mtd_typ_nm();
		}
		if ($insp_aprv_sts_typ.equalsIgnoreCase(name)) {
			return insp_aprv_sts_typ();
		}
		if ($insp_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return insp_aprv_sts_typ_nm();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			return insp_no();
		}
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			return inst_usr_cd();
		}
		if ($inst_usr_nm.equalsIgnoreCase(name)) {
			return inst_usr_nm();
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			return inst_dpt_cd();
		}
		if ($inst_dpt_nm.equalsIgnoreCase(name)) {
			return inst_dpt_nm();
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			return act_usr_cd();
		}
		if ($act_usr_nm.equalsIgnoreCase(name)) {
			return act_usr_nm();
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			return act_dpt_cd();
		}
		if ($act_dpt_nm.equalsIgnoreCase(name)) {
			return act_dpt_nm();
		}
		if ($judg_usr_cd.equalsIgnoreCase(name)) {
			return judg_usr_cd();
		}
		if ($judg_usr_nm.equalsIgnoreCase(name)) {
			return judg_usr_nm();
		}
		if ($judg_dpt_cd.equalsIgnoreCase(name)) {
			return judg_dpt_cd();
		}
		if ($judg_dpt_nm.equalsIgnoreCase(name)) {
			return judg_dpt_nm();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($insp_act_no.equalsIgnoreCase(name)) {
			return insp_act_no();
		}
		if ($ext_insp_act_no.equalsIgnoreCase(name)) {
			return ext_insp_act_no();
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
		if ($inst_dt_fr.equalsIgnoreCase(name)) {
			return inst_dt_fr();
		}
		if ($inst_dt_to.equalsIgnoreCase(name)) {
			return inst_dt_to();
		}
		if ($judg_dt_fr.equalsIgnoreCase(name)) {
			return judg_dt_fr();
		}
		if ($judg_dt_to.equalsIgnoreCase(name)) {
			return judg_dt_to();
		}
		if ($insp_rslt_prnt_tm_fr.equalsIgnoreCase(name)) {
			return insp_rslt_prnt_tm_fr();
		}
		if ($insp_rslt_prnt_tm_to.equalsIgnoreCase(name)) {
			return insp_rslt_prnt_tm_to();
		}
		return super.getDate(name);
	}
	public MCTimestamp getTimestamp(String name) {
		if ($upd_ts_fr.equalsIgnoreCase(name)) {
			return upd_ts_fr();
		}
		if ($upd_ts_to.equalsIgnoreCase(name)) {
			return upd_ts_to();
		}
		return super.getTimestamp(name);
	}
	public boolean getBoolean(String name) {
		if ($ord_flg.equalsIgnoreCase(name)) {
			return ord_flg();
		}
		if ($stt_flg.equalsIgnoreCase(name)) {
			return stt_flg();
		}
		if ($cmpl_flg.equalsIgnoreCase(name)) {
			return cmpl_flg();
		}
		if ($insp_rslt_not_prnt_flg.equalsIgnoreCase(name)) {
			return insp_rslt_not_prnt_flg();
		}
		if ($insp_rslt_prnt_flg.equalsIgnoreCase(name)) {
			return insp_rslt_prnt_flg();
		}
		if ($cnf_cmpl_flg.equalsIgnoreCase(name)) {
			return cnf_cmpl_flg();
		}
		if ($cnf_not_cmpl_flg.equalsIgnoreCase(name)) {
			return cnf_not_cmpl_flg();
		}
		if ($lims_flg.equalsIgnoreCase(name)) {
			return lims_flg();
		}
		if ($not_lims_flg.equalsIgnoreCase(name)) {
			return not_lims_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
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
		if ($insp_typ.equalsIgnoreCase(name)) {
			return insp_typ();
		}
		if ($insp_typ_nm.equalsIgnoreCase(name)) {
			return insp_typ_nm();
		}
		if ($insp_ptn_cd.equalsIgnoreCase(name)) {
			return insp_ptn_cd();
		}
		if ($insp_ptn_nm.equalsIgnoreCase(name)) {
			return insp_ptn_nm();
		}
		if ($insp_mtd_typ.equalsIgnoreCase(name)) {
			return insp_mtd_typ();
		}
		if ($insp_mtd_typ_nm.equalsIgnoreCase(name)) {
			return insp_mtd_typ_nm();
		}
		if ($insp_aprv_sts_typ.equalsIgnoreCase(name)) {
			return insp_aprv_sts_typ();
		}
		if ($insp_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return insp_aprv_sts_typ_nm();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			return insp_no();
		}
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			return inst_usr_cd();
		}
		if ($inst_usr_nm.equalsIgnoreCase(name)) {
			return inst_usr_nm();
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			return inst_dpt_cd();
		}
		if ($inst_dpt_nm.equalsIgnoreCase(name)) {
			return inst_dpt_nm();
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			return act_usr_cd();
		}
		if ($act_usr_nm.equalsIgnoreCase(name)) {
			return act_usr_nm();
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			return act_dpt_cd();
		}
		if ($act_dpt_nm.equalsIgnoreCase(name)) {
			return act_dpt_nm();
		}
		if ($judg_usr_cd.equalsIgnoreCase(name)) {
			return judg_usr_cd();
		}
		if ($judg_usr_nm.equalsIgnoreCase(name)) {
			return judg_usr_nm();
		}
		if ($judg_dpt_cd.equalsIgnoreCase(name)) {
			return judg_dpt_cd();
		}
		if ($judg_dpt_nm.equalsIgnoreCase(name)) {
			return judg_dpt_nm();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($insp_act_no.equalsIgnoreCase(name)) {
			return insp_act_no();
		}
		if ($ext_insp_act_no.equalsIgnoreCase(name)) {
			return ext_insp_act_no();
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
		if ($inst_dt_fr.equalsIgnoreCase(name)) {
			return inst_dt_fr();
		}
		if ($inst_dt_to.equalsIgnoreCase(name)) {
			return inst_dt_to();
		}
		if ($judg_dt_fr.equalsIgnoreCase(name)) {
			return judg_dt_fr();
		}
		if ($judg_dt_to.equalsIgnoreCase(name)) {
			return judg_dt_to();
		}
		if ($insp_rslt_prnt_tm_fr.equalsIgnoreCase(name)) {
			return insp_rslt_prnt_tm_fr();
		}
		if ($insp_rslt_prnt_tm_to.equalsIgnoreCase(name)) {
			return insp_rslt_prnt_tm_to();
		}
		return super.getDateNE(name);
	}
	public MCTimestamp getTimestampNE(String name) {
		if ($upd_ts_fr.equalsIgnoreCase(name)) {
			return upd_ts_fr();
		}
		if ($upd_ts_to.equalsIgnoreCase(name)) {
			return upd_ts_to();
		}
		return super.getTimestampNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($ord_flg.equalsIgnoreCase(name)) {
			return ord_flg();
		}
		if ($stt_flg.equalsIgnoreCase(name)) {
			return stt_flg();
		}
		if ($cmpl_flg.equalsIgnoreCase(name)) {
			return cmpl_flg();
		}
		if ($insp_rslt_not_prnt_flg.equalsIgnoreCase(name)) {
			return insp_rslt_not_prnt_flg();
		}
		if ($insp_rslt_prnt_flg.equalsIgnoreCase(name)) {
			return insp_rslt_prnt_flg();
		}
		if ($cnf_cmpl_flg.equalsIgnoreCase(name)) {
			return cnf_cmpl_flg();
		}
		if ($cnf_not_cmpl_flg.equalsIgnoreCase(name)) {
			return cnf_not_cmpl_flg();
		}
		if ($lims_flg.equalsIgnoreCase(name)) {
			return lims_flg();
		}
		if ($not_lims_flg.equalsIgnoreCase(name)) {
			return not_lims_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
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
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			mfg_loc_nm(value);
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
		if ($insp_typ.equalsIgnoreCase(name)) {
			insp_typ(value);
			return;
		}
		if ($insp_typ_nm.equalsIgnoreCase(name)) {
			insp_typ_nm(value);
			return;
		}
		if ($insp_ptn_cd.equalsIgnoreCase(name)) {
			insp_ptn_cd(value);
			return;
		}
		if ($insp_ptn_nm.equalsIgnoreCase(name)) {
			insp_ptn_nm(value);
			return;
		}
		if ($insp_mtd_typ.equalsIgnoreCase(name)) {
			insp_mtd_typ(value);
			return;
		}
		if ($insp_mtd_typ_nm.equalsIgnoreCase(name)) {
			insp_mtd_typ_nm(value);
			return;
		}
		if ($insp_aprv_sts_typ.equalsIgnoreCase(name)) {
			insp_aprv_sts_typ(value);
			return;
		}
		if ($insp_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			insp_aprv_sts_typ_nm(value);
			return;
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
			return;
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			insp_no(value);
			return;
		}
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			inst_usr_cd(value);
			return;
		}
		if ($inst_usr_nm.equalsIgnoreCase(name)) {
			inst_usr_nm(value);
			return;
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			inst_dpt_cd(value);
			return;
		}
		if ($inst_dpt_nm.equalsIgnoreCase(name)) {
			inst_dpt_nm(value);
			return;
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			act_usr_cd(value);
			return;
		}
		if ($act_usr_nm.equalsIgnoreCase(name)) {
			act_usr_nm(value);
			return;
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			act_dpt_cd(value);
			return;
		}
		if ($act_dpt_nm.equalsIgnoreCase(name)) {
			act_dpt_nm(value);
			return;
		}
		if ($judg_usr_cd.equalsIgnoreCase(name)) {
			judg_usr_cd(value);
			return;
		}
		if ($judg_usr_nm.equalsIgnoreCase(name)) {
			judg_usr_nm(value);
			return;
		}
		if ($judg_dpt_cd.equalsIgnoreCase(name)) {
			judg_dpt_cd(value);
			return;
		}
		if ($judg_dpt_nm.equalsIgnoreCase(name)) {
			judg_dpt_nm(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($insp_act_no.equalsIgnoreCase(name)) {
			insp_act_no(value);
			return;
		}
		if ($ext_insp_act_no.equalsIgnoreCase(name)) {
			ext_insp_act_no(value);
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
		if ($inst_dt_fr.equalsIgnoreCase(name)) {
			inst_dt_fr(value);
			return;
		}
		if ($inst_dt_to.equalsIgnoreCase(name)) {
			inst_dt_to(value);
			return;
		}
		if ($judg_dt_fr.equalsIgnoreCase(name)) {
			judg_dt_fr(value);
			return;
		}
		if ($judg_dt_to.equalsIgnoreCase(name)) {
			judg_dt_to(value);
			return;
		}
		if ($insp_rslt_prnt_tm_fr.equalsIgnoreCase(name)) {
			insp_rslt_prnt_tm_fr(value);
			return;
		}
		if ($insp_rslt_prnt_tm_to.equalsIgnoreCase(name)) {
			insp_rslt_prnt_tm_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setTimestamp(String name, MCTimestamp value) {
		if ($upd_ts_fr.equalsIgnoreCase(name)) {
			upd_ts_fr(value);
			return;
		}
		if ($upd_ts_to.equalsIgnoreCase(name)) {
			upd_ts_to(value);
			return;
		}
		super.setTimestamp(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($ord_flg.equalsIgnoreCase(name)) {
			ord_flg(value);
			return;
		}
		if ($stt_flg.equalsIgnoreCase(name)) {
			stt_flg(value);
			return;
		}
		if ($cmpl_flg.equalsIgnoreCase(name)) {
			cmpl_flg(value);
			return;
		}
		if ($insp_rslt_not_prnt_flg.equalsIgnoreCase(name)) {
			insp_rslt_not_prnt_flg(value);
			return;
		}
		if ($insp_rslt_prnt_flg.equalsIgnoreCase(name)) {
			insp_rslt_prnt_flg(value);
			return;
		}
		if ($cnf_cmpl_flg.equalsIgnoreCase(name)) {
			cnf_cmpl_flg(value);
			return;
		}
		if ($cnf_not_cmpl_flg.equalsIgnoreCase(name)) {
			cnf_not_cmpl_flg(value);
			return;
		}
		if ($lims_flg.equalsIgnoreCase(name)) {
			lims_flg(value);
			return;
		}
		if ($not_lims_flg.equalsIgnoreCase(name)) {
			not_lims_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
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
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			mfg_loc_nm(value);
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
		if ($insp_typ.equalsIgnoreCase(name)) {
			insp_typ(value);
			return;
		}
		if ($insp_typ_nm.equalsIgnoreCase(name)) {
			insp_typ_nm(value);
			return;
		}
		if ($insp_ptn_cd.equalsIgnoreCase(name)) {
			insp_ptn_cd(value);
			return;
		}
		if ($insp_ptn_nm.equalsIgnoreCase(name)) {
			insp_ptn_nm(value);
			return;
		}
		if ($insp_mtd_typ.equalsIgnoreCase(name)) {
			insp_mtd_typ(value);
			return;
		}
		if ($insp_mtd_typ_nm.equalsIgnoreCase(name)) {
			insp_mtd_typ_nm(value);
			return;
		}
		if ($insp_aprv_sts_typ.equalsIgnoreCase(name)) {
			insp_aprv_sts_typ(value);
			return;
		}
		if ($insp_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			insp_aprv_sts_typ_nm(value);
			return;
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
			return;
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			insp_no(value);
			return;
		}
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			inst_usr_cd(value);
			return;
		}
		if ($inst_usr_nm.equalsIgnoreCase(name)) {
			inst_usr_nm(value);
			return;
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			inst_dpt_cd(value);
			return;
		}
		if ($inst_dpt_nm.equalsIgnoreCase(name)) {
			inst_dpt_nm(value);
			return;
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			act_usr_cd(value);
			return;
		}
		if ($act_usr_nm.equalsIgnoreCase(name)) {
			act_usr_nm(value);
			return;
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			act_dpt_cd(value);
			return;
		}
		if ($act_dpt_nm.equalsIgnoreCase(name)) {
			act_dpt_nm(value);
			return;
		}
		if ($judg_usr_cd.equalsIgnoreCase(name)) {
			judg_usr_cd(value);
			return;
		}
		if ($judg_usr_nm.equalsIgnoreCase(name)) {
			judg_usr_nm(value);
			return;
		}
		if ($judg_dpt_cd.equalsIgnoreCase(name)) {
			judg_dpt_cd(value);
			return;
		}
		if ($judg_dpt_nm.equalsIgnoreCase(name)) {
			judg_dpt_nm(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($insp_act_no.equalsIgnoreCase(name)) {
			insp_act_no(value);
			return;
		}
		if ($ext_insp_act_no.equalsIgnoreCase(name)) {
			ext_insp_act_no(value);
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
		if ($inst_dt_fr.equalsIgnoreCase(name)) {
			inst_dt_fr(value);
			return;
		}
		if ($inst_dt_to.equalsIgnoreCase(name)) {
			inst_dt_to(value);
			return;
		}
		if ($judg_dt_fr.equalsIgnoreCase(name)) {
			judg_dt_fr(value);
			return;
		}
		if ($judg_dt_to.equalsIgnoreCase(name)) {
			judg_dt_to(value);
			return;
		}
		if ($insp_rslt_prnt_tm_fr.equalsIgnoreCase(name)) {
			insp_rslt_prnt_tm_fr(value);
			return;
		}
		if ($insp_rslt_prnt_tm_to.equalsIgnoreCase(name)) {
			insp_rslt_prnt_tm_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setTimestampNE(String name, MCTimestamp value) {
		if ($upd_ts_fr.equalsIgnoreCase(name)) {
			upd_ts_fr(value);
			return;
		}
		if ($upd_ts_to.equalsIgnoreCase(name)) {
			upd_ts_to(value);
			return;
		}
		super.setTimestampNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($ord_flg.equalsIgnoreCase(name)) {
			ord_flg(value);
			return;
		}
		if ($stt_flg.equalsIgnoreCase(name)) {
			stt_flg(value);
			return;
		}
		if ($cmpl_flg.equalsIgnoreCase(name)) {
			cmpl_flg(value);
			return;
		}
		if ($insp_rslt_not_prnt_flg.equalsIgnoreCase(name)) {
			insp_rslt_not_prnt_flg(value);
			return;
		}
		if ($insp_rslt_prnt_flg.equalsIgnoreCase(name)) {
			insp_rslt_prnt_flg(value);
			return;
		}
		if ($cnf_cmpl_flg.equalsIgnoreCase(name)) {
			cnf_cmpl_flg(value);
			return;
		}
		if ($cnf_not_cmpl_flg.equalsIgnoreCase(name)) {
			cnf_not_cmpl_flg(value);
			return;
		}
		if ($lims_flg.equalsIgnoreCase(name)) {
			lims_flg(value);
			return;
		}
		if ($not_lims_flg.equalsIgnoreCase(name)) {
			not_lims_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($inst_st_dt_p.equalsIgnoreCase(name)) {
			return inst_st_dt_p();
		}
		if ($inst_end_dt_p.equalsIgnoreCase(name)) {
			return inst_end_dt_p();
		}
		if ($st_dt_p.equalsIgnoreCase(name)) {
			return st_dt_p();
		}
		if ($end_dt_p.equalsIgnoreCase(name)) {
			return end_dt_p();
		}
		if ($itm_typ_p.equalsIgnoreCase(name)) {
			return itm_typ_p();
		}
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($sppl_grp_p.equalsIgnoreCase(name)) {
			return sppl_grp_p();
		}
		if ($itm_grp_p.equalsIgnoreCase(name)) {
			return itm_grp_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($inst_st_dt_p.equalsIgnoreCase(name)) {
			inst_st_dt_p(
				((MCContainerMeta) inst_st_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class, value)
			);
			return;
		}
		if ($inst_end_dt_p.equalsIgnoreCase(name)) {
			inst_end_dt_p(
				((MCContainerMeta) inst_end_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class, value)
			);
			return;
		}
		if ($st_dt_p.equalsIgnoreCase(name)) {
			st_dt_p(
				((MCContainerMeta) st_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class, value)
			);
			return;
		}
		if ($end_dt_p.equalsIgnoreCase(name)) {
			end_dt_p(
				((MCContainerMeta) end_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class, value)
			);
			return;
		}
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
		if ($sppl_grp_p.equalsIgnoreCase(name)) {
			sppl_grp_p(
				((MCContainerMeta) sppl_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0260.BpGrpR.class, value)
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


	/**
	 * Scheduled start date FROM 開始予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate inst_st_dt_fr() {
		return inst_st_dt_p().ymd_fr();
	}

	/**
	 * Scheduled start date FROM 開始予定日ＦＲＯＭ.<p>
	 *
	 */
	public void inst_st_dt_fr(MCDate value) {
		inst_st_dt_p().ymd_fr(value);
	}

	/**
	 * Scheduled start time FROM 開始予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate inst_st_hm_fr() {
		return inst_st_dt_p().hm_fr();
	}

	/**
	 * Scheduled start time FROM 開始予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public void inst_st_hm_fr(MCDate value) {
		inst_st_dt_p().hm_fr(value);
	}

	/**
	 * Scheduled start date TO 開始予定日ＴＯ.<p>
	 *
	 */
	public MCDate inst_st_dt_to() {
		return inst_st_dt_p().ymd_to();
	}

	/**
	 * Scheduled start date TO 開始予定日ＴＯ.<p>
	 *
	 */
	public void inst_st_dt_to(MCDate value) {
		inst_st_dt_p().ymd_to(value);
	}

	/**
	 * Scheduled start time TO 開始予定時刻ＴＯ.<p>
	 *
	 */
	public MCDate inst_st_hm_to() {
		return inst_st_dt_p().hm_to();
	}

	/**
	 * Scheduled start time TO 開始予定時刻ＴＯ.<p>
	 *
	 */
	public void inst_st_hm_to(MCDate value) {
		inst_st_dt_p().hm_to(value);
	}

	/**
	 * Scheduled end date FROM 終了予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate inst_end_dt_fr() {
		return inst_end_dt_p().ymd_fr();
	}

	/**
	 * Scheduled end date FROM 終了予定日ＦＲＯＭ.<p>
	 *
	 */
	public void inst_end_dt_fr(MCDate value) {
		inst_end_dt_p().ymd_fr(value);
	}

	/**
	 * Scheduled end time FROM 終了予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate inst_end_hm_fr() {
		return inst_end_dt_p().hm_fr();
	}

	/**
	 * Scheduled end time FROM 終了予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public void inst_end_hm_fr(MCDate value) {
		inst_end_dt_p().hm_fr(value);
	}

	/**
	 * Scheduled end date TO 終了予定日ＴＯ.<p>
	 *
	 */
	public MCDate inst_end_dt_to() {
		return inst_end_dt_p().ymd_to();
	}

	/**
	 * Scheduled end date TO 終了予定日ＴＯ.<p>
	 *
	 */
	public void inst_end_dt_to(MCDate value) {
		inst_end_dt_p().ymd_to(value);
	}

	/**
	 * Scheduled end time TO 終了予定時刻ＴＯ.<p>
	 *
	 */
	public MCDate inst_end_hm_to() {
		return inst_end_dt_p().hm_to();
	}

	/**
	 * Scheduled end time TO 終了予定時刻ＴＯ.<p>
	 *
	 */
	public void inst_end_hm_to(MCDate value) {
		inst_end_dt_p().hm_to(value);
	}

	/**
	 * Start date FROM 開始日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate st_dt_fr() {
		return st_dt_p().ymd_fr();
	}

	/**
	 * Start date FROM 開始日ＦＲＯＭ.<p>
	 *
	 */
	public void st_dt_fr(MCDate value) {
		st_dt_p().ymd_fr(value);
	}

	/**
	 * Start time FROM 開始時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate st_hm_fr() {
		return st_dt_p().hm_fr();
	}

	/**
	 * Start time FROM 開始時刻ＦＲＯＭ.<p>
	 *
	 */
	public void st_hm_fr(MCDate value) {
		st_dt_p().hm_fr(value);
	}

	/**
	 * Start date TO 開始日ＴＯ.<p>
	 *
	 */
	public MCDate st_dt_to() {
		return st_dt_p().ymd_to();
	}

	/**
	 * Start date TO 開始日ＴＯ.<p>
	 *
	 */
	public void st_dt_to(MCDate value) {
		st_dt_p().ymd_to(value);
	}

	/**
	 * Start time TO 開始時刻ＴＯ.<p>
	 *
	 */
	public MCDate st_hm_to() {
		return st_dt_p().hm_to();
	}

	/**
	 * Start time TO 開始時刻ＴＯ.<p>
	 *
	 */
	public void st_hm_to(MCDate value) {
		st_dt_p().hm_to(value);
	}

	/**
	 * End date FROM 終了日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate end_dt_fr() {
		return end_dt_p().ymd_fr();
	}

	/**
	 * End date FROM 終了日ＦＲＯＭ.<p>
	 *
	 */
	public void end_dt_fr(MCDate value) {
		end_dt_p().ymd_fr(value);
	}

	/**
	 * End time FROM 終了時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate end_hm_fr() {
		return end_dt_p().hm_fr();
	}

	/**
	 * End time FROM 終了時刻ＦＲＯＭ.<p>
	 *
	 */
	public void end_hm_fr(MCDate value) {
		end_dt_p().hm_fr(value);
	}

	/**
	 * End date TO 終了日ＴＯ.<p>
	 *
	 */
	public MCDate end_dt_to() {
		return end_dt_p().ymd_to();
	}

	/**
	 * End date TO 終了日ＴＯ.<p>
	 *
	 */
	public void end_dt_to(MCDate value) {
		end_dt_p().ymd_to(value);
	}

	/**
	 * End time TO 終了時刻ＴＯ.<p>
	 *
	 */
	public MCDate end_hm_to() {
		return end_dt_p().hm_to();
	}

	/**
	 * End time TO 終了時刻ＴＯ.<p>
	 *
	 */
	public void end_hm_to(MCDate value) {
		end_dt_p().hm_to(value);
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

	/**
	 * Supplier classification 1 発注先分類１.<p>
	 *
	 */
	public boolean sppl_grp_flg1() {
		return sppl_grp_p().bp_grp_flg1();
	}

	/**
	 * Supplier classification 1 発注先分類１.<p>
	 *
	 */
	public void sppl_grp_flg1(boolean value) {
		sppl_grp_p().bp_grp_flg1(value);
	}

	/**
	 * Supplier classification cd. 1 発注先分類ＣＤ１.<p>
	 *
	 */
	public String sppl_grp_cd1() {
		return sppl_grp_p().bp_grp_cd1();
	}

	/**
	 * Supplier classification cd. 1 発注先分類ＣＤ１.<p>
	 *
	 */
	public void sppl_grp_cd1(String value) {
		sppl_grp_p().bp_grp_cd1(value);
	}

	/**
	 * Supplier classification name 1 発注先分類名１.<p>
	 *
	 */
	public String sppl_grp_nm1() {
		return sppl_grp_p().bp_grp_nm1();
	}

	/**
	 * Supplier classification name 1 発注先分類名１.<p>
	 *
	 */
	public void sppl_grp_nm1(String value) {
		sppl_grp_p().bp_grp_nm1(value);
	}

	/**
	 * Supplier classification 2 発注先分類２.<p>
	 *
	 */
	public boolean sppl_grp_flg2() {
		return sppl_grp_p().bp_grp_flg2();
	}

	/**
	 * Supplier classification 2 発注先分類２.<p>
	 *
	 */
	public void sppl_grp_flg2(boolean value) {
		sppl_grp_p().bp_grp_flg2(value);
	}

	/**
	 * Supplier classification cd. 2 発注先分類ＣＤ２.<p>
	 *
	 */
	public String sppl_grp_cd2() {
		return sppl_grp_p().bp_grp_cd2();
	}

	/**
	 * Supplier classification cd. 2 発注先分類ＣＤ２.<p>
	 *
	 */
	public void sppl_grp_cd2(String value) {
		sppl_grp_p().bp_grp_cd2(value);
	}

	/**
	 * Supplier classification name 2 発注先分類名２.<p>
	 *
	 */
	public String sppl_grp_nm2() {
		return sppl_grp_p().bp_grp_nm2();
	}

	/**
	 * Supplier classification name 2 発注先分類名２.<p>
	 *
	 */
	public void sppl_grp_nm2(String value) {
		sppl_grp_p().bp_grp_nm2(value);
	}

	/**
	 * Supplier classification 3 発注先分類３.<p>
	 *
	 */
	public boolean sppl_grp_flg3() {
		return sppl_grp_p().bp_grp_flg3();
	}

	/**
	 * Supplier classification 3 発注先分類３.<p>
	 *
	 */
	public void sppl_grp_flg3(boolean value) {
		sppl_grp_p().bp_grp_flg3(value);
	}

	/**
	 * Supplier classification cd. 3 発注先分類ＣＤ３.<p>
	 *
	 */
	public String sppl_grp_cd3() {
		return sppl_grp_p().bp_grp_cd3();
	}

	/**
	 * Supplier classification cd. 3 発注先分類ＣＤ３.<p>
	 *
	 */
	public void sppl_grp_cd3(String value) {
		sppl_grp_p().bp_grp_cd3(value);
	}

	/**
	 * Supplier classification name 3 発注先分類名３.<p>
	 *
	 */
	public String sppl_grp_nm3() {
		return sppl_grp_p().bp_grp_nm3();
	}

	/**
	 * Supplier classification name 3 発注先分類名３.<p>
	 *
	 */
	public void sppl_grp_nm3(String value) {
		sppl_grp_p().bp_grp_nm3(value);
	}

	/**
	 * Supplier classification 4 発注先分類４.<p>
	 *
	 */
	public boolean sppl_grp_flg4() {
		return sppl_grp_p().bp_grp_flg4();
	}

	/**
	 * Supplier classification 4 発注先分類４.<p>
	 *
	 */
	public void sppl_grp_flg4(boolean value) {
		sppl_grp_p().bp_grp_flg4(value);
	}

	/**
	 * Supplier classification cd. 4 発注先分類ＣＤ４.<p>
	 *
	 */
	public String sppl_grp_cd4() {
		return sppl_grp_p().bp_grp_cd4();
	}

	/**
	 * Supplier classification cd. 4 発注先分類ＣＤ４.<p>
	 *
	 */
	public void sppl_grp_cd4(String value) {
		sppl_grp_p().bp_grp_cd4(value);
	}

	/**
	 * Supplier classification name 4 発注先分類名４.<p>
	 *
	 */
	public String sppl_grp_nm4() {
		return sppl_grp_p().bp_grp_nm4();
	}

	/**
	 * Supplier classification name 4 発注先分類名４.<p>
	 *
	 */
	public void sppl_grp_nm4(String value) {
		sppl_grp_p().bp_grp_nm4(value);
	}

	/**
	 * Supplier classification 5 発注先分類５.<p>
	 *
	 */
	public boolean sppl_grp_flg5() {
		return sppl_grp_p().bp_grp_flg5();
	}

	/**
	 * Supplier classification 5 発注先分類５.<p>
	 *
	 */
	public void sppl_grp_flg5(boolean value) {
		sppl_grp_p().bp_grp_flg5(value);
	}

	/**
	 * Supplier classification cd. 5 発注先分類ＣＤ５.<p>
	 *
	 */
	public String sppl_grp_cd5() {
		return sppl_grp_p().bp_grp_cd5();
	}

	/**
	 * Supplier classification cd. 5 発注先分類ＣＤ５.<p>
	 *
	 */
	public void sppl_grp_cd5(String value) {
		sppl_grp_p().bp_grp_cd5(value);
	}

	/**
	 * Supplier classification name 5 発注先分類名５.<p>
	 *
	 */
	public String sppl_grp_nm5() {
		return sppl_grp_p().bp_grp_nm5();
	}

	/**
	 * Supplier classification name 5 発注先分類名５.<p>
	 *
	 */
	public void sppl_grp_nm5(String value) {
		sppl_grp_p().bp_grp_nm5(value);
	}

	/**
	 * Supplier classification 6 発注先分類６.<p>
	 *
	 */
	public boolean sppl_grp_flg6() {
		return sppl_grp_p().bp_grp_flg6();
	}

	/**
	 * Supplier classification 6 発注先分類６.<p>
	 *
	 */
	public void sppl_grp_flg6(boolean value) {
		sppl_grp_p().bp_grp_flg6(value);
	}

	/**
	 * Supplier classification cd. 6 発注先分類ＣＤ６.<p>
	 *
	 */
	public String sppl_grp_cd6() {
		return sppl_grp_p().bp_grp_cd6();
	}

	/**
	 * Supplier classification cd. 6 発注先分類ＣＤ６.<p>
	 *
	 */
	public void sppl_grp_cd6(String value) {
		sppl_grp_p().bp_grp_cd6(value);
	}

	/**
	 * Supplier classification name 6 発注先分類名６.<p>
	 *
	 */
	public String sppl_grp_nm6() {
		return sppl_grp_p().bp_grp_nm6();
	}

	/**
	 * Supplier classification name 6 発注先分類名６.<p>
	 *
	 */
	public void sppl_grp_nm6(String value) {
		sppl_grp_p().bp_grp_nm6(value);
	}

	/**
	 * Supplier classification 7 発注先分類７.<p>
	 *
	 */
	public boolean sppl_grp_flg7() {
		return sppl_grp_p().bp_grp_flg7();
	}

	/**
	 * Supplier classification 7 発注先分類７.<p>
	 *
	 */
	public void sppl_grp_flg7(boolean value) {
		sppl_grp_p().bp_grp_flg7(value);
	}

	/**
	 * Supplier classification cd. 7 発注先分類ＣＤ７.<p>
	 *
	 */
	public String sppl_grp_cd7() {
		return sppl_grp_p().bp_grp_cd7();
	}

	/**
	 * Supplier classification cd. 7 発注先分類ＣＤ７.<p>
	 *
	 */
	public void sppl_grp_cd7(String value) {
		sppl_grp_p().bp_grp_cd7(value);
	}

	/**
	 * Supplier classification name 7 発注先分類名７.<p>
	 *
	 */
	public String sppl_grp_nm7() {
		return sppl_grp_p().bp_grp_nm7();
	}

	/**
	 * Supplier classification name 7 発注先分類名７.<p>
	 *
	 */
	public void sppl_grp_nm7(String value) {
		sppl_grp_p().bp_grp_nm7(value);
	}

	/**
	 * Supplier classification 8 発注先分類８.<p>
	 *
	 */
	public boolean sppl_grp_flg8() {
		return sppl_grp_p().bp_grp_flg8();
	}

	/**
	 * Supplier classification 8 発注先分類８.<p>
	 *
	 */
	public void sppl_grp_flg8(boolean value) {
		sppl_grp_p().bp_grp_flg8(value);
	}

	/**
	 * Supplier classification cd. 8 発注先分類ＣＤ８.<p>
	 *
	 */
	public String sppl_grp_cd8() {
		return sppl_grp_p().bp_grp_cd8();
	}

	/**
	 * Supplier classification cd. 8 発注先分類ＣＤ８.<p>
	 *
	 */
	public void sppl_grp_cd8(String value) {
		sppl_grp_p().bp_grp_cd8(value);
	}

	/**
	 * Supplier classification name 8 発注先分類名８.<p>
	 *
	 */
	public String sppl_grp_nm8() {
		return sppl_grp_p().bp_grp_nm8();
	}

	/**
	 * Supplier classification name 8 発注先分類名８.<p>
	 *
	 */
	public void sppl_grp_nm8(String value) {
		sppl_grp_p().bp_grp_nm8(value);
	}

	/**
	 * Supplier classification 9 発注先分類９.<p>
	 *
	 */
	public boolean sppl_grp_flg9() {
		return sppl_grp_p().bp_grp_flg9();
	}

	/**
	 * Supplier classification 9 発注先分類９.<p>
	 *
	 */
	public void sppl_grp_flg9(boolean value) {
		sppl_grp_p().bp_grp_flg9(value);
	}

	/**
	 * Supplier classification cd. 9 発注先分類ＣＤ９.<p>
	 *
	 */
	public String sppl_grp_cd9() {
		return sppl_grp_p().bp_grp_cd9();
	}

	/**
	 * Supplier classification cd. 9 発注先分類ＣＤ９.<p>
	 *
	 */
	public void sppl_grp_cd9(String value) {
		sppl_grp_p().bp_grp_cd9(value);
	}

	/**
	 * Supplier classification name 9 発注先分類名９.<p>
	 *
	 */
	public String sppl_grp_nm9() {
		return sppl_grp_p().bp_grp_nm9();
	}

	/**
	 * Supplier classification name 9 発注先分類名９.<p>
	 *
	 */
	public void sppl_grp_nm9(String value) {
		sppl_grp_p().bp_grp_nm9(value);
	}

	/**
	 * Supplier classification 10 発注先分類１０.<p>
	 *
	 */
	public boolean sppl_grp_flg10() {
		return sppl_grp_p().bp_grp_flg10();
	}

	/**
	 * Supplier classification 10 発注先分類１０.<p>
	 *
	 */
	public void sppl_grp_flg10(boolean value) {
		sppl_grp_p().bp_grp_flg10(value);
	}

	/**
	 * Supplier classification cd. 10 発注先分類ＣＤ１０.<p>
	 *
	 */
	public String sppl_grp_cd10() {
		return sppl_grp_p().bp_grp_cd10();
	}

	/**
	 * Supplier classification cd. 10 発注先分類ＣＤ１０.<p>
	 *
	 */
	public void sppl_grp_cd10(String value) {
		sppl_grp_p().bp_grp_cd10(value);
	}

	/**
	 * Supplier classification name 10 発注先分類名１０.<p>
	 *
	 */
	public String sppl_grp_nm10() {
		return sppl_grp_p().bp_grp_nm10();
	}

	/**
	 * Supplier classification name 10 発注先分類名１０.<p>
	 *
	 */
	public void sppl_grp_nm10(String value) {
		sppl_grp_p().bp_grp_nm10(value);
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

