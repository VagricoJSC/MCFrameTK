package mcframe.clientMSBB.MSBBP0110;

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
	 * USR,Input;SUM,Aggregate USR,入力;SUM,集計.<p>
	 *
	 */
	public static final String $upd_ope = "upd_ope";
	/**
	 * UPD,Create/Modify;DTL_DEL,Cancel details;HDR_DEL,Cancel header;REF,View;VERS_COPY,Copy version UPD,登録・訂正する;DTL_DEL,明細を取り消す;HDR_DEL,ヘッダを取り消す;REF,参照する;VERS_COPY,バージョンをコピーする.<p>
	 *
	 */
	public static final String $ope = "ope";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $act_flg = "act_flg";
	/**
	 * Last time 前回.<p>
	 *
	 */
	public static final String $pre_flg = "pre_flg";
	/**
	 * Comparison 比較.<p>
	 *
	 */
	public static final String $ref_flg = "ref_flg";
	/**
	 * Plan month 計画年月.<p>
	 *
	 */
	public static final String $usr_ym = "usr_ym";
	/**
	 * Sale month FROM 販売年月ＦＲＯＭ.<p>
	 *
	 */
	public static final String $usr_spln_ym_fr = "usr_spln_ym_fr";
	/**
	 * Sale month TO 販売年月ＴＯ.<p>
	 *
	 */
	public static final String $usr_spln_ym_to = "usr_spln_ym_to";
	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public static final String $usr_usr_cd = "usr_usr_cd";
	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public static final String $usr_usr_nm = "usr_usr_nm";
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public static final String $usr_dpt_cd = "usr_dpt_cd";
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public static final String $usr_dpt_nm = "usr_dpt_nm";
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public static final String $usr_cst_cd = "usr_cst_cd";
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public static final String $usr_cst_nm = "usr_cst_nm";
	public static final String $usr_wrk_no_p = "usr_wrk_no_p";
	/**
	 * Non-entry 未登録.<p>
	 *
	 */
	public static final String $usr_reg_f_flg = "usr_reg_f_flg";
	/**
	 * Entered 登録済.<p>
	 *
	 */
	public static final String $usr_reg_t_flg = "usr_reg_t_flg";
	/**
	 * Unfirm 未確定.<p>
	 *
	 */
	public static final String $usr_fix_f_flg = "usr_fix_f_flg";
	/**
	 * Firmed 確定済.<p>
	 *
	 */
	public static final String $usr_fix_t_flg = "usr_fix_t_flg";
	/**
	 * Plan item cd. 計画品目ＣＤ.<p>
	 *
	 */
	public static final String $usr_spln_itm_cd = "usr_spln_itm_cd";
	/**
	 * Plan item name 計画品名.<p>
	 *
	 */
	public static final String $usr_spln_itm_nm = "usr_spln_itm_nm";
	public static final String $usr_itm_typ_p = "usr_itm_typ_p";
	public static final String $usr_itm_p = "usr_itm_p";
	/**
	 * Plan month 計画年月.<p>
	 *
	 */
	public static final String $sum_ym = "sum_ym";
	/**
	 * Sale month FROM 販売年月ＦＲＯＭ.<p>
	 *
	 */
	public static final String $sum_spln_ym_fr = "sum_spln_ym_fr";
	/**
	 * Sale month TO 販売年月ＴＯ.<p>
	 *
	 */
	public static final String $sum_spln_ym_to = "sum_spln_ym_to";
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public static final String $sum_dpt_cd = "sum_dpt_cd";
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public static final String $sum_dpt_nm = "sum_dpt_nm";
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public static final String $sum_cst_cd = "sum_cst_cd";
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public static final String $sum_cst_nm = "sum_cst_nm";
	public static final String $sum_wrk_no_p = "sum_wrk_no_p";
	/**
	 * Version バージョン.<p>
	 *
	 */
	public static final String $sum_spln_vers = "sum_spln_vers";
	/**
	 * Comparison version 比較バージョン.<p>
	 *
	 */
	public static final String $sum_ref_vers = "sum_ref_vers";
	/**
	 * Non-entry 未登録.<p>
	 *
	 */
	public static final String $sum_reg_f_flg = "sum_reg_f_flg";
	/**
	 * Entered 登録済.<p>
	 *
	 */
	public static final String $sum_reg_t_flg = "sum_reg_t_flg";
	/**
	 * Unfirm 未確定.<p>
	 *
	 */
	public static final String $sum_fix_f_flg = "sum_fix_f_flg";
	/**
	 * Firmed 確定済.<p>
	 *
	 */
	public static final String $sum_fix_t_flg = "sum_fix_t_flg";
	/**
	 * Plan item cd. 計画品目ＣＤ.<p>
	 *
	 */
	public static final String $sum_spln_itm_cd = "sum_spln_itm_cd";
	/**
	 * Plan item name 計画品名.<p>
	 *
	 */
	public static final String $sum_spln_itm_nm = "sum_spln_itm_nm";
	public static final String $sum_itm_typ_p = "sum_itm_typ_p";
	public static final String $sum_itm_p = "sum_itm_p";
	/**
	 * Sale month FROM 販売年月ＦＲＯＭ.<p>
	 *
	 */
	public static final String $ref_spln_ym_fr = "ref_spln_ym_fr";
	/**
	 * Sale month TO 販売年月ＴＯ.<p>
	 *
	 */
	public static final String $ref_spln_ym_to = "ref_spln_ym_to";
	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public static final String $ref_usr_cd = "ref_usr_cd";
	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public static final String $ref_usr_nm = "ref_usr_nm";
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public static final String $ref_dpt_cd = "ref_dpt_cd";
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public static final String $ref_dpt_nm = "ref_dpt_nm";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $ref_wg_cd = "ref_wg_cd";
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public static final String $ref_wg_nm = "ref_wg_nm";
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public static final String $ref_cst_cd = "ref_cst_cd";
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public static final String $ref_cst_nm = "ref_cst_nm";
	public static final String $ref_wrk_no_p = "ref_wrk_no_p";
	/**
	 * Plan month FROM 計画年月ＦＲＯＭ.<p>
	 *
	 */
	public static final String $ref_ym_fr = "ref_ym_fr";
	/**
	 * Plan month TO 計画年月ＴＯ.<p>
	 *
	 */
	public static final String $ref_ym_to = "ref_ym_to";
	/**
	 * Version バージョン.<p>
	 *
	 */
	public static final String $ref_spln_vers = "ref_spln_vers";
	/**
	 * Plan item cd. 計画品目ＣＤ.<p>
	 *
	 */
	public static final String $ref_spln_itm_cd = "ref_spln_itm_cd";
	/**
	 * Plan item name 計画品名.<p>
	 *
	 */
	public static final String $ref_spln_itm_nm = "ref_spln_itm_nm";
	/**
	 * Include unfirm 未確定含む.<p>
	 *
	 */
	public static final String $ref_fix_f_flg = "ref_fix_f_flg";
	/**
	 * Include invalid 無効含む.<p>
	 *
	 */
	public static final String $ref_del_flg = "ref_del_flg";
	public static final String $ref_itm_typ_p = "ref_itm_typ_p";
	public static final String $ref_itm_p = "ref_itm_p";
	public static final String $itm_grp_p = "itm_grp_p";
	public static final String $bp_grp_p = "bp_grp_p";
	/**
	 * Header cancellation ヘッダ取消.<p>
	 *
	 */
	public static final String $hdr_del_flg = "hdr_del_flg";
	/**
	 * Sale month FROM 販売年月ＦＲＯＭ.<p>
	 *
	 */
	public static final String $spln_ym_fr = "spln_ym_fr";
	/**
	 * Sale month TO 販売年月ＴＯ.<p>
	 *
	 */
	public static final String $spln_ym_to = "spln_ym_to";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $show_act_flg = "show_act_flg";
	/**
	 * Last time 前回.<p>
	 *
	 */
	public static final String $show_pre_flg = "show_pre_flg";
	/**
	 * Comparison 比較.<p>
	 *
	 */
	public static final String $show_ref_flg = "show_ref_flg";
	/**
	 * Breakdown 内訳.<p>
	 *
	 */
	public static final String $show_sub_flg = "show_sub_flg";
	/**
	 * Blank line 空行.<p>
	 *
	 */
	public static final String $show_blk_flg = "show_blk_flg";
	/**
	 * Label ラベル.<p>
	 *
	 */
	public static final String $show_label_flg = "show_label_flg";
	/**
	 * Cd. コード.<p>
	 *
	 */
	public static final String $show_code_flg = "show_code_flg";
	/**
	 * Name 名称.<p>
	 *
	 */
	public static final String $show_name_flg = "show_name_flg";
	/**
	 * Classification 分類.<p>
	 *
	 */
	public static final String $show_grp_flg = "show_grp_flg";
	/**
	 * Other その他.<p>
	 *
	 */
	public static final String $show_others_flg = "show_others_flg";

	public static final String $usr_wrk_no = $usr_wrk_no_p + ".wrk_no";
	public static final String $usr_wrk_nm = $usr_wrk_no_p + ".wrk_nm";
	public static final String $usr_itm_typ = $usr_itm_typ_p + ".itm_typ";
	public static final String $usr_itm_typ_d_cd = $usr_itm_typ_p + ".itm_typ_d_cd";
	public static final String $usr_itm_typ_d_nm = $usr_itm_typ_p + ".itm_typ_d_nm";
	public static final String $usr_itm_cd = $usr_itm_p + ".itm_cd";
	public static final String $usr_itm_sub1 = $usr_itm_p + ".itm_sub1";
	public static final String $usr_itm_sub2 = $usr_itm_p + ".itm_sub2";
	public static final String $usr_itm_sub3 = $usr_itm_p + ".itm_sub3";
	public static final String $usr_itm_nm = $usr_itm_p + ".itm_nm";
	public static final String $sum_wrk_no = $sum_wrk_no_p + ".wrk_no";
	public static final String $sum_wrk_nm = $sum_wrk_no_p + ".wrk_nm";
	public static final String $sum_itm_typ = $sum_itm_typ_p + ".itm_typ";
	public static final String $sum_itm_typ_d_cd = $sum_itm_typ_p + ".itm_typ_d_cd";
	public static final String $sum_itm_typ_d_nm = $sum_itm_typ_p + ".itm_typ_d_nm";
	public static final String $sum_itm_cd = $sum_itm_p + ".itm_cd";
	public static final String $sum_itm_sub1 = $sum_itm_p + ".itm_sub1";
	public static final String $sum_itm_sub2 = $sum_itm_p + ".itm_sub2";
	public static final String $sum_itm_sub3 = $sum_itm_p + ".itm_sub3";
	public static final String $sum_itm_nm = $sum_itm_p + ".itm_nm";
	public static final String $ref_wrk_no = $ref_wrk_no_p + ".wrk_no";
	public static final String $ref_wrk_nm = $ref_wrk_no_p + ".wrk_nm";
	public static final String $ref_itm_typ = $ref_itm_typ_p + ".itm_typ";
	public static final String $ref_itm_typ_d_cd = $ref_itm_typ_p + ".itm_typ_d_cd";
	public static final String $ref_itm_typ_d_nm = $ref_itm_typ_p + ".itm_typ_d_nm";
	public static final String $ref_itm_cd = $ref_itm_p + ".itm_cd";
	public static final String $ref_itm_sub1 = $ref_itm_p + ".itm_sub1";
	public static final String $ref_itm_sub2 = $ref_itm_p + ".itm_sub2";
	public static final String $ref_itm_sub3 = $ref_itm_p + ".itm_sub3";
	public static final String $ref_itm_nm = $ref_itm_p + ".itm_nm";
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
	public static final String $bp_grp_lab1 = $bp_grp_p + ".bp_grp_lab1";
	public static final String $bp_grp_flg1 = $bp_grp_p + ".bp_grp_flg1";
	public static final String $bp_grp_cd1 = $bp_grp_p + ".bp_grp_cd1";
	public static final String $bp_grp_nm1 = $bp_grp_p + ".bp_grp_nm1";
	public static final String $bp_grp_lab2 = $bp_grp_p + ".bp_grp_lab2";
	public static final String $bp_grp_flg2 = $bp_grp_p + ".bp_grp_flg2";
	public static final String $bp_grp_cd2 = $bp_grp_p + ".bp_grp_cd2";
	public static final String $bp_grp_nm2 = $bp_grp_p + ".bp_grp_nm2";
	public static final String $bp_grp_lab3 = $bp_grp_p + ".bp_grp_lab3";
	public static final String $bp_grp_flg3 = $bp_grp_p + ".bp_grp_flg3";
	public static final String $bp_grp_cd3 = $bp_grp_p + ".bp_grp_cd3";
	public static final String $bp_grp_nm3 = $bp_grp_p + ".bp_grp_nm3";
	public static final String $bp_grp_lab4 = $bp_grp_p + ".bp_grp_lab4";
	public static final String $bp_grp_flg4 = $bp_grp_p + ".bp_grp_flg4";
	public static final String $bp_grp_cd4 = $bp_grp_p + ".bp_grp_cd4";
	public static final String $bp_grp_nm4 = $bp_grp_p + ".bp_grp_nm4";
	public static final String $bp_grp_lab5 = $bp_grp_p + ".bp_grp_lab5";
	public static final String $bp_grp_flg5 = $bp_grp_p + ".bp_grp_flg5";
	public static final String $bp_grp_cd5 = $bp_grp_p + ".bp_grp_cd5";
	public static final String $bp_grp_nm5 = $bp_grp_p + ".bp_grp_nm5";
	public static final String $bp_grp_lab6 = $bp_grp_p + ".bp_grp_lab6";
	public static final String $bp_grp_flg6 = $bp_grp_p + ".bp_grp_flg6";
	public static final String $bp_grp_cd6 = $bp_grp_p + ".bp_grp_cd6";
	public static final String $bp_grp_nm6 = $bp_grp_p + ".bp_grp_nm6";
	public static final String $bp_grp_lab7 = $bp_grp_p + ".bp_grp_lab7";
	public static final String $bp_grp_flg7 = $bp_grp_p + ".bp_grp_flg7";
	public static final String $bp_grp_cd7 = $bp_grp_p + ".bp_grp_cd7";
	public static final String $bp_grp_nm7 = $bp_grp_p + ".bp_grp_nm7";
	public static final String $bp_grp_lab8 = $bp_grp_p + ".bp_grp_lab8";
	public static final String $bp_grp_flg8 = $bp_grp_p + ".bp_grp_flg8";
	public static final String $bp_grp_cd8 = $bp_grp_p + ".bp_grp_cd8";
	public static final String $bp_grp_nm8 = $bp_grp_p + ".bp_grp_nm8";
	public static final String $bp_grp_lab9 = $bp_grp_p + ".bp_grp_lab9";
	public static final String $bp_grp_flg9 = $bp_grp_p + ".bp_grp_flg9";
	public static final String $bp_grp_cd9 = $bp_grp_p + ".bp_grp_cd9";
	public static final String $bp_grp_nm9 = $bp_grp_p + ".bp_grp_nm9";
	public static final String $bp_grp_lab10 = $bp_grp_p + ".bp_grp_lab10";
	public static final String $bp_grp_flg10 = $bp_grp_p + ".bp_grp_flg10";
	public static final String $bp_grp_cd10 = $bp_grp_p + ".bp_grp_cd10";
	public static final String $bp_grp_nm10 = $bp_grp_p + ".bp_grp_nm10";

	public static final MCMeta upd_ope_META = createStringMeta($upd_ope);
	public static final MCMeta ope_META = createStringMeta($ope);
	public static final MCMeta act_flg_META = createCommonMeta($act_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pre_flg_META = createCommonMeta($pre_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ref_flg_META = createCommonMeta($ref_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta usr_ym_META = createCommonMeta($usr_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta usr_spln_ym_fr_META = createCommonMeta($usr_spln_ym_fr, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta usr_spln_ym_to_META = createCommonMeta($usr_spln_ym_to, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta usr_usr_cd_META = createCommonMeta($usr_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta usr_usr_nm_META = createCommonMeta($usr_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta usr_dpt_cd_META = createCommonMeta($usr_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta usr_dpt_nm_META = createCommonMeta($usr_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta usr_cst_cd_META = createCommonMeta($usr_cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta usr_cst_nm_META = createCommonMeta($usr_cst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta usr_wrk_no_p_META = createInnerRowMeta($usr_wrk_no_p, mcframe.clientMSUB.MSUBP0010.WrkNoR.class);
	public static final MCMeta usr_reg_f_flg_META = createCommonMeta($usr_reg_f_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta usr_reg_t_flg_META = createCommonMeta($usr_reg_t_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta usr_fix_f_flg_META = createCommonMeta($usr_fix_f_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta usr_fix_t_flg_META = createCommonMeta($usr_fix_t_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta usr_spln_itm_cd_META = createCommonMeta($usr_spln_itm_cd, mcframe.commonMA.meta.MA_META.SPLN_ITM_CD);
	public static final MCMeta usr_spln_itm_nm_META = createCommonMeta($usr_spln_itm_nm, mcframe.commonMA.meta.MA_META.SPLN_ITM_NM);
	public static final MCMeta usr_itm_typ_p_META = createInnerRowMeta($usr_itm_typ_p, mcframe.clientMAUB.MAUBP0100.ItmTypR.class);
	public static final MCMeta usr_itm_p_META = createInnerRowMeta($usr_itm_p, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta sum_ym_META = createCommonMeta($sum_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta sum_spln_ym_fr_META = createCommonMeta($sum_spln_ym_fr, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta sum_spln_ym_to_META = createCommonMeta($sum_spln_ym_to, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta sum_dpt_cd_META = createCommonMeta($sum_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta sum_dpt_nm_META = createCommonMeta($sum_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta sum_cst_cd_META = createCommonMeta($sum_cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sum_cst_nm_META = createCommonMeta($sum_cst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta sum_wrk_no_p_META = createInnerRowMeta($sum_wrk_no_p, mcframe.clientMSUB.MSUBP0010.WrkNoR.class);
	public static final MCMeta sum_spln_vers_META = createCommonMeta($sum_spln_vers, mcframe.commonMS.meta.MS_META.SPLN_VERS);
	public static final MCMeta sum_ref_vers_META = createCommonMeta($sum_ref_vers, mcframe.commonMS.meta.MS_META.SPLN_VERS);
	public static final MCMeta sum_reg_f_flg_META = createCommonMeta($sum_reg_f_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sum_reg_t_flg_META = createCommonMeta($sum_reg_t_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sum_fix_f_flg_META = createCommonMeta($sum_fix_f_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sum_fix_t_flg_META = createCommonMeta($sum_fix_t_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sum_spln_itm_cd_META = createCommonMeta($sum_spln_itm_cd, mcframe.commonMA.meta.MA_META.SPLN_ITM_CD);
	public static final MCMeta sum_spln_itm_nm_META = createCommonMeta($sum_spln_itm_nm, mcframe.commonMA.meta.MA_META.SPLN_ITM_NM);
	public static final MCMeta sum_itm_typ_p_META = createInnerRowMeta($sum_itm_typ_p, mcframe.clientMAUB.MAUBP0100.ItmTypR.class);
	public static final MCMeta sum_itm_p_META = createInnerRowMeta($sum_itm_p, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta ref_spln_ym_fr_META = createCommonMeta($ref_spln_ym_fr, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta ref_spln_ym_to_META = createCommonMeta($ref_spln_ym_to, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta ref_usr_cd_META = createCommonMeta($ref_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta ref_usr_nm_META = createCommonMeta($ref_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta ref_dpt_cd_META = createCommonMeta($ref_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ref_dpt_nm_META = createCommonMeta($ref_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta ref_wg_cd_META = createCommonMeta($ref_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta ref_wg_nm_META = createCommonMeta($ref_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta ref_cst_cd_META = createCommonMeta($ref_cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta ref_cst_nm_META = createCommonMeta($ref_cst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta ref_wrk_no_p_META = createInnerRowMeta($ref_wrk_no_p, mcframe.clientMSUB.MSUBP0010.WrkNoR.class);
	public static final MCMeta ref_ym_fr_META = createCommonMeta($ref_ym_fr, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta ref_ym_to_META = createCommonMeta($ref_ym_to, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta ref_spln_vers_META = createCommonMeta($ref_spln_vers, mcframe.commonMS.meta.MS_META.SPLN_VERS);
	public static final MCMeta ref_spln_itm_cd_META = createCommonMeta($ref_spln_itm_cd, mcframe.commonMA.meta.MA_META.SPLN_ITM_CD);
	public static final MCMeta ref_spln_itm_nm_META = createCommonMeta($ref_spln_itm_nm, mcframe.commonMA.meta.MA_META.SPLN_ITM_NM);
	public static final MCMeta ref_fix_f_flg_META = createCommonMeta($ref_fix_f_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ref_del_flg_META = createCommonMeta($ref_del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ref_itm_typ_p_META = createInnerRowMeta($ref_itm_typ_p, mcframe.clientMAUB.MAUBP0100.ItmTypR.class);
	public static final MCMeta ref_itm_p_META = createInnerRowMeta($ref_itm_p, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta itm_grp_p_META = createInnerRowMeta($itm_grp_p, mcframe.clientMAUB.MAUBP0250.ItmGrpR.class);
	public static final MCMeta bp_grp_p_META = createInnerRowMeta($bp_grp_p, mcframe.clientMAUB.MAUBP0260.BpGrpR.class);
	public static final MCMeta hdr_del_flg_META = createCommonMeta($hdr_del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta spln_ym_fr_META = createCommonMeta($spln_ym_fr, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta spln_ym_to_META = createCommonMeta($spln_ym_to, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta show_act_flg_META = createCommonMeta($show_act_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta show_pre_flg_META = createCommonMeta($show_pre_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta show_ref_flg_META = createCommonMeta($show_ref_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta show_sub_flg_META = createCommonMeta($show_sub_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta show_blk_flg_META = createCommonMeta($show_blk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta show_label_flg_META = createCommonMeta($show_label_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta show_code_flg_META = createCommonMeta($show_code_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta show_name_flg_META = createCommonMeta($show_name_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta show_grp_flg_META = createCommonMeta($show_grp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta show_others_flg_META = createCommonMeta($show_others_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			upd_ope_META,
			ope_META,
			act_flg_META,
			pre_flg_META,
			ref_flg_META,
			usr_ym_META,
			usr_spln_ym_fr_META,
			usr_spln_ym_to_META,
			usr_usr_cd_META,
			usr_usr_nm_META,
			usr_dpt_cd_META,
			usr_dpt_nm_META,
			usr_cst_cd_META,
			usr_cst_nm_META,
			usr_wrk_no_p_META,
			usr_reg_f_flg_META,
			usr_reg_t_flg_META,
			usr_fix_f_flg_META,
			usr_fix_t_flg_META,
			usr_spln_itm_cd_META,
			usr_spln_itm_nm_META,
			usr_itm_typ_p_META,
			usr_itm_p_META,
			sum_ym_META,
			sum_spln_ym_fr_META,
			sum_spln_ym_to_META,
			sum_dpt_cd_META,
			sum_dpt_nm_META,
			sum_cst_cd_META,
			sum_cst_nm_META,
			sum_wrk_no_p_META,
			sum_spln_vers_META,
			sum_ref_vers_META,
			sum_reg_f_flg_META,
			sum_reg_t_flg_META,
			sum_fix_f_flg_META,
			sum_fix_t_flg_META,
			sum_spln_itm_cd_META,
			sum_spln_itm_nm_META,
			sum_itm_typ_p_META,
			sum_itm_p_META,
			ref_spln_ym_fr_META,
			ref_spln_ym_to_META,
			ref_usr_cd_META,
			ref_usr_nm_META,
			ref_dpt_cd_META,
			ref_dpt_nm_META,
			ref_wg_cd_META,
			ref_wg_nm_META,
			ref_cst_cd_META,
			ref_cst_nm_META,
			ref_wrk_no_p_META,
			ref_ym_fr_META,
			ref_ym_to_META,
			ref_spln_vers_META,
			ref_spln_itm_cd_META,
			ref_spln_itm_nm_META,
			ref_fix_f_flg_META,
			ref_del_flg_META,
			ref_itm_typ_p_META,
			ref_itm_p_META,
			itm_grp_p_META,
			bp_grp_p_META,
			hdr_del_flg_META,
			spln_ym_fr_META,
			spln_ym_to_META,
			show_act_flg_META,
			show_pre_flg_META,
			show_ref_flg_META,
			show_sub_flg_META,
			show_blk_flg_META,
			show_label_flg_META,
			show_code_flg_META,
			show_name_flg_META,
			show_grp_flg_META,
			show_others_flg_META
		},
		new String[][]{
			{
				"usr_wrk_no",
				"usr_wrk_nm",
				"usr_itm_typ",
				"usr_itm_typ_d_cd",
				"usr_itm_typ_d_nm",
				"usr_itm_cd",
				"usr_itm_sub1",
				"usr_itm_sub2",
				"usr_itm_sub3",
				"usr_itm_nm",
				"sum_wrk_no",
				"sum_wrk_nm",
				"sum_itm_typ",
				"sum_itm_typ_d_cd",
				"sum_itm_typ_d_nm",
				"sum_itm_cd",
				"sum_itm_sub1",
				"sum_itm_sub2",
				"sum_itm_sub3",
				"sum_itm_nm",
				"ref_wrk_no",
				"ref_wrk_nm",
				"ref_itm_typ",
				"ref_itm_typ_d_cd",
				"ref_itm_typ_d_nm",
				"ref_itm_cd",
				"ref_itm_sub1",
				"ref_itm_sub2",
				"ref_itm_sub3",
				"ref_itm_nm",
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
				"bp_grp_flg1",
				"bp_grp_cd1",
				"bp_grp_nm1",
				"bp_grp_flg2",
				"bp_grp_cd2",
				"bp_grp_nm2",
				"bp_grp_flg3",
				"bp_grp_cd3",
				"bp_grp_nm3",
				"bp_grp_flg4",
				"bp_grp_cd4",
				"bp_grp_nm4",
				"bp_grp_flg5",
				"bp_grp_cd5",
				"bp_grp_nm5",
				"bp_grp_flg6",
				"bp_grp_cd6",
				"bp_grp_nm6",
				"bp_grp_flg7",
				"bp_grp_cd7",
				"bp_grp_nm7",
				"bp_grp_flg8",
				"bp_grp_cd8",
				"bp_grp_nm8",
				"bp_grp_flg9",
				"bp_grp_cd9",
				"bp_grp_nm9",
				"bp_grp_flg10",
				"bp_grp_cd10",
				"bp_grp_nm10"
			},
			{
				$usr_wrk_no,
				$usr_wrk_nm,
				$usr_itm_typ,
				$usr_itm_typ_d_cd,
				$usr_itm_typ_d_nm,
				$usr_itm_cd,
				$usr_itm_sub1,
				$usr_itm_sub2,
				$usr_itm_sub3,
				$usr_itm_nm,
				$sum_wrk_no,
				$sum_wrk_nm,
				$sum_itm_typ,
				$sum_itm_typ_d_cd,
				$sum_itm_typ_d_nm,
				$sum_itm_cd,
				$sum_itm_sub1,
				$sum_itm_sub2,
				$sum_itm_sub3,
				$sum_itm_nm,
				$ref_wrk_no,
				$ref_wrk_nm,
				$ref_itm_typ,
				$ref_itm_typ_d_cd,
				$ref_itm_typ_d_nm,
				$ref_itm_cd,
				$ref_itm_sub1,
				$ref_itm_sub2,
				$ref_itm_sub3,
				$ref_itm_nm,
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
				$bp_grp_flg1,
				$bp_grp_cd1,
				$bp_grp_nm1,
				$bp_grp_flg2,
				$bp_grp_cd2,
				$bp_grp_nm2,
				$bp_grp_flg3,
				$bp_grp_cd3,
				$bp_grp_nm3,
				$bp_grp_flg4,
				$bp_grp_cd4,
				$bp_grp_nm4,
				$bp_grp_flg5,
				$bp_grp_cd5,
				$bp_grp_nm5,
				$bp_grp_flg6,
				$bp_grp_cd6,
				$bp_grp_nm6,
				$bp_grp_flg7,
				$bp_grp_cd7,
				$bp_grp_nm7,
				$bp_grp_flg8,
				$bp_grp_cd8,
				$bp_grp_nm8,
				$bp_grp_flg9,
				$bp_grp_cd9,
				$bp_grp_nm9,
				$bp_grp_flg10,
				$bp_grp_cd10,
				$bp_grp_nm10
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
	/** 項目属性情報のグループ[VH_KEY]のキー定数 */
	public static final String $$VH_KEY = "VH_KEY";
	/** 項目属性情報のグループ[VH_DISP_COL]のキー定数 */
	public static final String $$VH_DISP_COL = "VH_DISP_COL";
	/** 項目属性情報のグループ[VH_DISP_GRP]のキー定数 */
	public static final String $$VH_DISP_GRP = "VH_DISP_GRP";
	/** 項目属性情報のグループ[VH_DISP_IDX]のキー定数 */
	public static final String $$VH_DISP_IDX = "VH_DISP_IDX";
	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$usr_usr_cd, "usr_nm;dpt_cd"},	// usr_usr_cd
				{$usr_dpt_cd, "dpt_nm"},	// usr_dpt_cd
				{$usr_cst_cd, "bp_nm"},	// usr_cst_cd
				{$usr_wrk_no_p + ".wrk_no", "wrk_nm"},	// usr_wrk_no_p.wrk_no
				{$usr_spln_itm_cd, "spln_itm_nm"},	// usr_spln_itm_cd
				{$usr_itm_p + ".itm_cd", "itm_nm;itm_sub1;itm_sub2;itm_sub3"},	// usr_itm_p.itm_cd
				{$usr_itm_p + ".itm_sub1", "itm_nm;itm_sub2;itm_sub3"},	// usr_itm_p.itm_sub1
				{$usr_itm_p + ".itm_sub2", "itm_nm;itm_sub3"},	// usr_itm_p.itm_sub2
				{$usr_itm_p + ".itm_sub3", "itm_nm"},	// usr_itm_p.itm_sub3
				{$sum_dpt_cd, "dpt_nm"},	// sum_dpt_cd
				{$sum_cst_cd, "bp_nm"},	// sum_cst_cd
				{$sum_wrk_no_p + ".wrk_no", "wrk_nm"},	// sum_wrk_no_p.wrk_no
				{$sum_spln_itm_cd, "spln_itm_nm"},	// sum_spln_itm_cd
				{$sum_itm_p + ".itm_cd", "itm_nm;itm_sub1;itm_sub2;itm_sub3"},	// sum_itm_p.itm_cd
				{$sum_itm_p + ".itm_sub1", "itm_nm;itm_sub2;itm_sub3"},	// sum_itm_p.itm_sub1
				{$sum_itm_p + ".itm_sub2", "itm_nm;itm_sub3"},	// sum_itm_p.itm_sub2
				{$sum_itm_p + ".itm_sub3", "itm_nm"},	// sum_itm_p.itm_sub3
				{$ref_usr_cd, "usr_nm"},	// ref_usr_cd
				{$ref_dpt_cd, "dpt_nm"},	// ref_dpt_cd
				{$ref_wg_cd, "wg_nm"},	// ref_wg_cd
				{$ref_cst_cd, "bp_nm"},	// ref_cst_cd
				{$ref_spln_itm_cd, "spln_itm_nm"},	// ref_spln_itm_cd
				{$ref_itm_p + ".itm_cd", "itm_nm;itm_sub1;itm_sub2;itm_sub3"},	// ref_itm_p.itm_cd
				{$ref_itm_p + ".itm_sub1", "itm_nm;itm_sub2;itm_sub3"},	// ref_itm_p.itm_sub1
				{$ref_itm_p + ".itm_sub2", "itm_nm;itm_sub3"},	// ref_itm_p.itm_sub2
				{$ref_itm_p + ".itm_sub3", "itm_nm"}	// ref_itm_p.itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$usr_dpt_cd, "MAC_DPT_IS_SRCH_TYP.SLS"},	// usr_dpt_cd
				{$usr_cst_cd, "MAC_BP_IS_SRCH_TYP.CST"},	// usr_cst_cd
				{$usr_itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.SPLN"},	// usr_itm_p.itm_cd
				{$usr_itm_p + ".itm_sub1", "MAC_ITM_IS_SRCH_TYP.SPLN;usr_itm_cd"},	// usr_itm_p.itm_sub1
				{$usr_itm_p + ".itm_sub2", "MAC_ITM_IS_SRCH_TYP.SPLN;usr_itm_cd;usr_itm_sub1"},	// usr_itm_p.itm_sub2
				{$usr_itm_p + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.SPLN;usr_itm_cd;usr_itm_sub1;usr_itm_sub2"},	// usr_itm_p.itm_sub3
				{$sum_dpt_cd, "MAC_DPT_IS_SRCH_TYP.SLS"},	// sum_dpt_cd
				{$sum_cst_cd, "MAC_BP_IS_SRCH_TYP.CST"},	// sum_cst_cd
				{$sum_spln_vers, "sum_ym;sum_dpt_cd;sum_cst_cd;sum_wrk_no"},	// sum_spln_vers
				{$sum_ref_vers, "sum_ym;sum_dpt_cd;sum_cst_cd;sum_wrk_no"},	// sum_ref_vers
				{$sum_itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.SPLN"},	// sum_itm_p.itm_cd
				{$sum_itm_p + ".itm_sub1", "MAC_ITM_IS_SRCH_TYP.SPLN;sum_itm_cd"},	// sum_itm_p.itm_sub1
				{$sum_itm_p + ".itm_sub2", "MAC_ITM_IS_SRCH_TYP.SPLN;sum_itm_cd;sum_itm_sub1"},	// sum_itm_p.itm_sub2
				{$sum_itm_p + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.SPLN;sum_itm_cd;sum_itm_sub1;sum_itm_sub2"},	// sum_itm_p.itm_sub3
				{$ref_dpt_cd, "MAC_DPT_IS_SRCH_TYP.SLS;true"},	// ref_dpt_cd
				{$ref_cst_cd, "MAC_BP_IS_SRCH_TYP.CST"},	// ref_cst_cd
				{$ref_itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.SPLN"},	// ref_itm_p.itm_cd
				{$ref_itm_p + ".itm_sub1", "MAC_ITM_IS_SRCH_TYP.SPLN;ref_itm_cd"},	// ref_itm_p.itm_sub1
				{$ref_itm_p + ".itm_sub2", "MAC_ITM_IS_SRCH_TYP.SPLN;ref_itm_cd;ref_itm_sub1"},	// ref_itm_p.itm_sub2
				{$ref_itm_p + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.SPLN;ref_itm_cd;ref_itm_sub1;ref_itm_sub2"}	// ref_itm_p.itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$usr_dpt_cd, "dpt_is_srch_typ"},	// usr_dpt_cd
				{$usr_cst_cd, "bp_is_srch_typ"},	// usr_cst_cd
				{$usr_itm_p + ".itm_cd", "itm_is_srch_typ"},	// usr_itm_p.itm_cd
				{$usr_itm_p + ".itm_sub1", "itm_is_srch_typ;itm_cd"},	// usr_itm_p.itm_sub1
				{$usr_itm_p + ".itm_sub2", "itm_is_srch_typ;itm_cd;itm_sub1"},	// usr_itm_p.itm_sub2
				{$usr_itm_p + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"},	// usr_itm_p.itm_sub3
				{$sum_dpt_cd, "dpt_is_srch_typ"},	// sum_dpt_cd
				{$sum_cst_cd, "bp_is_srch_typ"},	// sum_cst_cd
				{$sum_spln_vers, "ym;dpt_cd;cst_cd;wrk_no"},	// sum_spln_vers
				{$sum_ref_vers, "ym;dpt_cd;cst_cd;wrk_no"},	// sum_ref_vers
				{$sum_itm_p + ".itm_cd", "itm_is_srch_typ"},	// sum_itm_p.itm_cd
				{$sum_itm_p + ".itm_sub1", "itm_is_srch_typ;itm_cd"},	// sum_itm_p.itm_sub1
				{$sum_itm_p + ".itm_sub2", "itm_is_srch_typ;itm_cd;itm_sub1"},	// sum_itm_p.itm_sub2
				{$sum_itm_p + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"},	// sum_itm_p.itm_sub3
				{$ref_dpt_cd, "dpt_is_srch_typ;mode_today_flg"},	// ref_dpt_cd
				{$ref_cst_cd, "bp_is_srch_typ"},	// ref_cst_cd
				{$ref_itm_p + ".itm_cd", "itm_is_srch_typ"},	// ref_itm_p.itm_cd
				{$ref_itm_p + ".itm_sub1", "itm_is_srch_typ;itm_cd"},	// ref_itm_p.itm_sub1
				{$ref_itm_p + ".itm_sub2", "itm_is_srch_typ;itm_cd;itm_sub1"},	// ref_itm_p.itm_sub2
				{$ref_itm_p + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"}	// ref_itm_p.itm_sub3
			}
		)),
		new MCExtMap.Entry($$VH_KEY, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$VH_DISP_COL, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$VH_DISP_GRP, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$VH_DISP_IDX, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$ref_wg_cd, "WG"},	// ref_wg_cd
				{$ref_wg_nm, "WG"}	// ref_wg_nm
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
	 * USR,Input;SUM,Aggregate USR,入力;SUM,集計.<p>
	 *
	 */
	public String upd_ope() {
		return getConstString(offset + 0, $upd_ope);
	}

	/**
	 * USR,Input;SUM,Aggregate USR,入力;SUM,集計.<p>
	 *
	 */
	public void upd_ope(String value) {
		setConstString(offset + 0, $upd_ope, value);
	}


	/**
	 * UPD,Create/Modify;DTL_DEL,Cancel details;HDR_DEL,Cancel header;REF,View;VERS_COPY,Copy version UPD,登録・訂正する;DTL_DEL,明細を取り消す;HDR_DEL,ヘッダを取り消す;REF,参照する;VERS_COPY,バージョンをコピーする.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 1, $ope);
	}

	/**
	 * UPD,Create/Modify;DTL_DEL,Cancel details;HDR_DEL,Cancel header;REF,View;VERS_COPY,Copy version UPD,登録・訂正する;DTL_DEL,明細を取り消す;HDR_DEL,ヘッダを取り消す;REF,参照する;VERS_COPY,バージョンをコピーする.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 1, $ope, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public boolean act_flg() {
		return getConstBoolean(offset + 2, $act_flg);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act_flg(boolean value) {
		setConstBoolean(offset + 2, $act_flg, value);
	}


	/**
	 * Last time 前回.<p>
	 *
	 */
	public boolean pre_flg() {
		return getConstBoolean(offset + 3, $pre_flg);
	}

	/**
	 * Last time 前回.<p>
	 *
	 */
	public void pre_flg(boolean value) {
		setConstBoolean(offset + 3, $pre_flg, value);
	}


	/**
	 * Comparison 比較.<p>
	 *
	 */
	public boolean ref_flg() {
		return getConstBoolean(offset + 4, $ref_flg);
	}

	/**
	 * Comparison 比較.<p>
	 *
	 */
	public void ref_flg(boolean value) {
		setConstBoolean(offset + 4, $ref_flg, value);
	}


	/**
	 * Plan month 計画年月.<p>
	 *
	 */
	public MCDate usr_ym() {
		return getConstDate(offset + 5, $usr_ym);
	}

	/**
	 * Plan month 計画年月.<p>
	 *
	 */
	public void usr_ym(MCDate value) {
		setConstDate(offset + 5, $usr_ym, value);
	}


	/**
	 * Sale month FROM 販売年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDate usr_spln_ym_fr() {
		return getConstDate(offset + 6, $usr_spln_ym_fr);
	}

	/**
	 * Sale month FROM 販売年月ＦＲＯＭ.<p>
	 *
	 */
	public void usr_spln_ym_fr(MCDate value) {
		setConstDate(offset + 6, $usr_spln_ym_fr, value);
	}


	/**
	 * Sale month TO 販売年月ＴＯ.<p>
	 *
	 */
	public MCDate usr_spln_ym_to() {
		return getConstDate(offset + 7, $usr_spln_ym_to);
	}

	/**
	 * Sale month TO 販売年月ＴＯ.<p>
	 *
	 */
	public void usr_spln_ym_to(MCDate value) {
		setConstDate(offset + 7, $usr_spln_ym_to, value);
	}


	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public String usr_usr_cd() {
		return getConstString(offset + 8, $usr_usr_cd);
	}

	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public void usr_usr_cd(String value) {
		setConstString(offset + 8, $usr_usr_cd, value);
	}


	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public String usr_usr_nm() {
		return getConstString(offset + 9, $usr_usr_nm);
	}

	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public void usr_usr_nm(String value) {
		setConstString(offset + 9, $usr_usr_nm, value);
	}


	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String usr_dpt_cd() {
		return getConstString(offset + 10, $usr_dpt_cd);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void usr_dpt_cd(String value) {
		setConstString(offset + 10, $usr_dpt_cd, value);
	}


	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public String usr_dpt_nm() {
		return getConstString(offset + 11, $usr_dpt_nm);
	}

	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public void usr_dpt_nm(String value) {
		setConstString(offset + 11, $usr_dpt_nm, value);
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String usr_cst_cd() {
		return getConstString(offset + 12, $usr_cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void usr_cst_cd(String value) {
		setConstString(offset + 12, $usr_cst_cd, value);
	}


	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public String usr_cst_nm() {
		return getConstString(offset + 13, $usr_cst_nm);
	}

	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public void usr_cst_nm(String value) {
		setConstString(offset + 13, $usr_cst_nm, value);
	}


	public mcframe.clientMSUB.MSUBP0010.WrkNoR usr_wrk_no_p(){
		return (mcframe.clientMSUB.MSUBP0010.WrkNoR) getConstInnerRow(offset + 14, $usr_wrk_no_p);
	}
	
	public void usr_wrk_no_p(mcframe.clientMSUB.MSUBP0010.WrkNoR row){
		setConstInnerRow(offset + 14, $usr_wrk_no_p, row);
	}


	/**
	 * Non-entry 未登録.<p>
	 *
	 */
	public boolean usr_reg_f_flg() {
		return getConstBoolean(offset + 15, $usr_reg_f_flg);
	}

	/**
	 * Non-entry 未登録.<p>
	 *
	 */
	public void usr_reg_f_flg(boolean value) {
		setConstBoolean(offset + 15, $usr_reg_f_flg, value);
	}


	/**
	 * Entered 登録済.<p>
	 *
	 */
	public boolean usr_reg_t_flg() {
		return getConstBoolean(offset + 16, $usr_reg_t_flg);
	}

	/**
	 * Entered 登録済.<p>
	 *
	 */
	public void usr_reg_t_flg(boolean value) {
		setConstBoolean(offset + 16, $usr_reg_t_flg, value);
	}


	/**
	 * Unfirm 未確定.<p>
	 *
	 */
	public boolean usr_fix_f_flg() {
		return getConstBoolean(offset + 17, $usr_fix_f_flg);
	}

	/**
	 * Unfirm 未確定.<p>
	 *
	 */
	public void usr_fix_f_flg(boolean value) {
		setConstBoolean(offset + 17, $usr_fix_f_flg, value);
	}


	/**
	 * Firmed 確定済.<p>
	 *
	 */
	public boolean usr_fix_t_flg() {
		return getConstBoolean(offset + 18, $usr_fix_t_flg);
	}

	/**
	 * Firmed 確定済.<p>
	 *
	 */
	public void usr_fix_t_flg(boolean value) {
		setConstBoolean(offset + 18, $usr_fix_t_flg, value);
	}


	/**
	 * Plan item cd. 計画品目ＣＤ.<p>
	 *
	 */
	public String usr_spln_itm_cd() {
		return getConstString(offset + 19, $usr_spln_itm_cd);
	}

	/**
	 * Plan item cd. 計画品目ＣＤ.<p>
	 *
	 */
	public void usr_spln_itm_cd(String value) {
		setConstString(offset + 19, $usr_spln_itm_cd, value);
	}


	/**
	 * Plan item name 計画品名.<p>
	 *
	 */
	public String usr_spln_itm_nm() {
		return getConstString(offset + 20, $usr_spln_itm_nm);
	}

	/**
	 * Plan item name 計画品名.<p>
	 *
	 */
	public void usr_spln_itm_nm(String value) {
		setConstString(offset + 20, $usr_spln_itm_nm, value);
	}


	public mcframe.clientMAUB.MAUBP0100.ItmTypR usr_itm_typ_p(){
		return (mcframe.clientMAUB.MAUBP0100.ItmTypR) getConstInnerRow(offset + 21, $usr_itm_typ_p);
	}
	
	public void usr_itm_typ_p(mcframe.clientMAUB.MAUBP0100.ItmTypR row){
		setConstInnerRow(offset + 21, $usr_itm_typ_p, row);
	}


	public mcframe.clientMAUB.MAUBP0030.ItmR usr_itm_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 22, $usr_itm_p);
	}
	
	public void usr_itm_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 22, $usr_itm_p, row);
	}


	/**
	 * Plan month 計画年月.<p>
	 *
	 */
	public MCDate sum_ym() {
		return getConstDate(offset + 23, $sum_ym);
	}

	/**
	 * Plan month 計画年月.<p>
	 *
	 */
	public void sum_ym(MCDate value) {
		setConstDate(offset + 23, $sum_ym, value);
	}


	/**
	 * Sale month FROM 販売年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDate sum_spln_ym_fr() {
		return getConstDate(offset + 24, $sum_spln_ym_fr);
	}

	/**
	 * Sale month FROM 販売年月ＦＲＯＭ.<p>
	 *
	 */
	public void sum_spln_ym_fr(MCDate value) {
		setConstDate(offset + 24, $sum_spln_ym_fr, value);
	}


	/**
	 * Sale month TO 販売年月ＴＯ.<p>
	 *
	 */
	public MCDate sum_spln_ym_to() {
		return getConstDate(offset + 25, $sum_spln_ym_to);
	}

	/**
	 * Sale month TO 販売年月ＴＯ.<p>
	 *
	 */
	public void sum_spln_ym_to(MCDate value) {
		setConstDate(offset + 25, $sum_spln_ym_to, value);
	}


	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String sum_dpt_cd() {
		return getConstString(offset + 26, $sum_dpt_cd);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void sum_dpt_cd(String value) {
		setConstString(offset + 26, $sum_dpt_cd, value);
	}


	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public String sum_dpt_nm() {
		return getConstString(offset + 27, $sum_dpt_nm);
	}

	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public void sum_dpt_nm(String value) {
		setConstString(offset + 27, $sum_dpt_nm, value);
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String sum_cst_cd() {
		return getConstString(offset + 28, $sum_cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void sum_cst_cd(String value) {
		setConstString(offset + 28, $sum_cst_cd, value);
	}


	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public String sum_cst_nm() {
		return getConstString(offset + 29, $sum_cst_nm);
	}

	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public void sum_cst_nm(String value) {
		setConstString(offset + 29, $sum_cst_nm, value);
	}


	public mcframe.clientMSUB.MSUBP0010.WrkNoR sum_wrk_no_p(){
		return (mcframe.clientMSUB.MSUBP0010.WrkNoR) getConstInnerRow(offset + 30, $sum_wrk_no_p);
	}
	
	public void sum_wrk_no_p(mcframe.clientMSUB.MSUBP0010.WrkNoR row){
		setConstInnerRow(offset + 30, $sum_wrk_no_p, row);
	}


	/**
	 * Version バージョン.<p>
	 *
	 */
	public String sum_spln_vers() {
		return getConstString(offset + 31, $sum_spln_vers);
	}

	/**
	 * Version バージョン.<p>
	 *
	 */
	public void sum_spln_vers(String value) {
		setConstString(offset + 31, $sum_spln_vers, value);
	}


	/**
	 * Comparison version 比較バージョン.<p>
	 *
	 */
	public String sum_ref_vers() {
		return getConstString(offset + 32, $sum_ref_vers);
	}

	/**
	 * Comparison version 比較バージョン.<p>
	 *
	 */
	public void sum_ref_vers(String value) {
		setConstString(offset + 32, $sum_ref_vers, value);
	}


	/**
	 * Non-entry 未登録.<p>
	 *
	 */
	public boolean sum_reg_f_flg() {
		return getConstBoolean(offset + 33, $sum_reg_f_flg);
	}

	/**
	 * Non-entry 未登録.<p>
	 *
	 */
	public void sum_reg_f_flg(boolean value) {
		setConstBoolean(offset + 33, $sum_reg_f_flg, value);
	}


	/**
	 * Entered 登録済.<p>
	 *
	 */
	public boolean sum_reg_t_flg() {
		return getConstBoolean(offset + 34, $sum_reg_t_flg);
	}

	/**
	 * Entered 登録済.<p>
	 *
	 */
	public void sum_reg_t_flg(boolean value) {
		setConstBoolean(offset + 34, $sum_reg_t_flg, value);
	}


	/**
	 * Unfirm 未確定.<p>
	 *
	 */
	public boolean sum_fix_f_flg() {
		return getConstBoolean(offset + 35, $sum_fix_f_flg);
	}

	/**
	 * Unfirm 未確定.<p>
	 *
	 */
	public void sum_fix_f_flg(boolean value) {
		setConstBoolean(offset + 35, $sum_fix_f_flg, value);
	}


	/**
	 * Firmed 確定済.<p>
	 *
	 */
	public boolean sum_fix_t_flg() {
		return getConstBoolean(offset + 36, $sum_fix_t_flg);
	}

	/**
	 * Firmed 確定済.<p>
	 *
	 */
	public void sum_fix_t_flg(boolean value) {
		setConstBoolean(offset + 36, $sum_fix_t_flg, value);
	}


	/**
	 * Plan item cd. 計画品目ＣＤ.<p>
	 *
	 */
	public String sum_spln_itm_cd() {
		return getConstString(offset + 37, $sum_spln_itm_cd);
	}

	/**
	 * Plan item cd. 計画品目ＣＤ.<p>
	 *
	 */
	public void sum_spln_itm_cd(String value) {
		setConstString(offset + 37, $sum_spln_itm_cd, value);
	}


	/**
	 * Plan item name 計画品名.<p>
	 *
	 */
	public String sum_spln_itm_nm() {
		return getConstString(offset + 38, $sum_spln_itm_nm);
	}

	/**
	 * Plan item name 計画品名.<p>
	 *
	 */
	public void sum_spln_itm_nm(String value) {
		setConstString(offset + 38, $sum_spln_itm_nm, value);
	}


	public mcframe.clientMAUB.MAUBP0100.ItmTypR sum_itm_typ_p(){
		return (mcframe.clientMAUB.MAUBP0100.ItmTypR) getConstInnerRow(offset + 39, $sum_itm_typ_p);
	}
	
	public void sum_itm_typ_p(mcframe.clientMAUB.MAUBP0100.ItmTypR row){
		setConstInnerRow(offset + 39, $sum_itm_typ_p, row);
	}


	public mcframe.clientMAUB.MAUBP0030.ItmR sum_itm_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 40, $sum_itm_p);
	}
	
	public void sum_itm_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 40, $sum_itm_p, row);
	}


	/**
	 * Sale month FROM 販売年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ref_spln_ym_fr() {
		return getConstDate(offset + 41, $ref_spln_ym_fr);
	}

	/**
	 * Sale month FROM 販売年月ＦＲＯＭ.<p>
	 *
	 */
	public void ref_spln_ym_fr(MCDate value) {
		setConstDate(offset + 41, $ref_spln_ym_fr, value);
	}


	/**
	 * Sale month TO 販売年月ＴＯ.<p>
	 *
	 */
	public MCDate ref_spln_ym_to() {
		return getConstDate(offset + 42, $ref_spln_ym_to);
	}

	/**
	 * Sale month TO 販売年月ＴＯ.<p>
	 *
	 */
	public void ref_spln_ym_to(MCDate value) {
		setConstDate(offset + 42, $ref_spln_ym_to, value);
	}


	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public String ref_usr_cd() {
		return getConstString(offset + 43, $ref_usr_cd);
	}

	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public void ref_usr_cd(String value) {
		setConstString(offset + 43, $ref_usr_cd, value);
	}


	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public String ref_usr_nm() {
		return getConstString(offset + 44, $ref_usr_nm);
	}

	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public void ref_usr_nm(String value) {
		setConstString(offset + 44, $ref_usr_nm, value);
	}


	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String ref_dpt_cd() {
		return getConstString(offset + 45, $ref_dpt_cd);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void ref_dpt_cd(String value) {
		setConstString(offset + 45, $ref_dpt_cd, value);
	}


	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public String ref_dpt_nm() {
		return getConstString(offset + 46, $ref_dpt_nm);
	}

	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public void ref_dpt_nm(String value) {
		setConstString(offset + 46, $ref_dpt_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String ref_wg_cd() {
		return getConstString(offset + 47, $ref_wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void ref_wg_cd(String value) {
		setConstString(offset + 47, $ref_wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String ref_wg_nm() {
		return getConstString(offset + 48, $ref_wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void ref_wg_nm(String value) {
		setConstString(offset + 48, $ref_wg_nm, value);
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String ref_cst_cd() {
		return getConstString(offset + 49, $ref_cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void ref_cst_cd(String value) {
		setConstString(offset + 49, $ref_cst_cd, value);
	}


	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public String ref_cst_nm() {
		return getConstString(offset + 50, $ref_cst_nm);
	}

	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public void ref_cst_nm(String value) {
		setConstString(offset + 50, $ref_cst_nm, value);
	}


	public mcframe.clientMSUB.MSUBP0010.WrkNoR ref_wrk_no_p(){
		return (mcframe.clientMSUB.MSUBP0010.WrkNoR) getConstInnerRow(offset + 51, $ref_wrk_no_p);
	}
	
	public void ref_wrk_no_p(mcframe.clientMSUB.MSUBP0010.WrkNoR row){
		setConstInnerRow(offset + 51, $ref_wrk_no_p, row);
	}


	/**
	 * Plan month FROM 計画年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ref_ym_fr() {
		return getConstDate(offset + 52, $ref_ym_fr);
	}

	/**
	 * Plan month FROM 計画年月ＦＲＯＭ.<p>
	 *
	 */
	public void ref_ym_fr(MCDate value) {
		setConstDate(offset + 52, $ref_ym_fr, value);
	}


	/**
	 * Plan month TO 計画年月ＴＯ.<p>
	 *
	 */
	public MCDate ref_ym_to() {
		return getConstDate(offset + 53, $ref_ym_to);
	}

	/**
	 * Plan month TO 計画年月ＴＯ.<p>
	 *
	 */
	public void ref_ym_to(MCDate value) {
		setConstDate(offset + 53, $ref_ym_to, value);
	}


	/**
	 * Version バージョン.<p>
	 *
	 */
	public String ref_spln_vers() {
		return getConstString(offset + 54, $ref_spln_vers);
	}

	/**
	 * Version バージョン.<p>
	 *
	 */
	public void ref_spln_vers(String value) {
		setConstString(offset + 54, $ref_spln_vers, value);
	}


	/**
	 * Plan item cd. 計画品目ＣＤ.<p>
	 *
	 */
	public String ref_spln_itm_cd() {
		return getConstString(offset + 55, $ref_spln_itm_cd);
	}

	/**
	 * Plan item cd. 計画品目ＣＤ.<p>
	 *
	 */
	public void ref_spln_itm_cd(String value) {
		setConstString(offset + 55, $ref_spln_itm_cd, value);
	}


	/**
	 * Plan item name 計画品名.<p>
	 *
	 */
	public String ref_spln_itm_nm() {
		return getConstString(offset + 56, $ref_spln_itm_nm);
	}

	/**
	 * Plan item name 計画品名.<p>
	 *
	 */
	public void ref_spln_itm_nm(String value) {
		setConstString(offset + 56, $ref_spln_itm_nm, value);
	}


	/**
	 * Include unfirm 未確定含む.<p>
	 *
	 */
	public boolean ref_fix_f_flg() {
		return getConstBoolean(offset + 57, $ref_fix_f_flg);
	}

	/**
	 * Include unfirm 未確定含む.<p>
	 *
	 */
	public void ref_fix_f_flg(boolean value) {
		setConstBoolean(offset + 57, $ref_fix_f_flg, value);
	}


	/**
	 * Include invalid 無効含む.<p>
	 *
	 */
	public boolean ref_del_flg() {
		return getConstBoolean(offset + 58, $ref_del_flg);
	}

	/**
	 * Include invalid 無効含む.<p>
	 *
	 */
	public void ref_del_flg(boolean value) {
		setConstBoolean(offset + 58, $ref_del_flg, value);
	}


	public mcframe.clientMAUB.MAUBP0100.ItmTypR ref_itm_typ_p(){
		return (mcframe.clientMAUB.MAUBP0100.ItmTypR) getConstInnerRow(offset + 59, $ref_itm_typ_p);
	}
	
	public void ref_itm_typ_p(mcframe.clientMAUB.MAUBP0100.ItmTypR row){
		setConstInnerRow(offset + 59, $ref_itm_typ_p, row);
	}


	public mcframe.clientMAUB.MAUBP0030.ItmR ref_itm_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 60, $ref_itm_p);
	}
	
	public void ref_itm_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 60, $ref_itm_p, row);
	}


	public mcframe.clientMAUB.MAUBP0250.ItmGrpR itm_grp_p(){
		return (mcframe.clientMAUB.MAUBP0250.ItmGrpR) getConstInnerRow(offset + 61, $itm_grp_p);
	}
	
	public void itm_grp_p(mcframe.clientMAUB.MAUBP0250.ItmGrpR row){
		setConstInnerRow(offset + 61, $itm_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP0260.BpGrpR bp_grp_p(){
		return (mcframe.clientMAUB.MAUBP0260.BpGrpR) getConstInnerRow(offset + 62, $bp_grp_p);
	}
	
	public void bp_grp_p(mcframe.clientMAUB.MAUBP0260.BpGrpR row){
		setConstInnerRow(offset + 62, $bp_grp_p, row);
	}


	/**
	 * Header cancellation ヘッダ取消.<p>
	 *
	 */
	public boolean hdr_del_flg() {
		return getConstBoolean(offset + 63, $hdr_del_flg);
	}

	/**
	 * Header cancellation ヘッダ取消.<p>
	 *
	 */
	public void hdr_del_flg(boolean value) {
		setConstBoolean(offset + 63, $hdr_del_flg, value);
	}


	/**
	 * Sale month FROM 販売年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDate spln_ym_fr() {
		return getConstDate(offset + 64, $spln_ym_fr);
	}

	/**
	 * Sale month FROM 販売年月ＦＲＯＭ.<p>
	 *
	 */
	public void spln_ym_fr(MCDate value) {
		setConstDate(offset + 64, $spln_ym_fr, value);
	}


	/**
	 * Sale month TO 販売年月ＴＯ.<p>
	 *
	 */
	public MCDate spln_ym_to() {
		return getConstDate(offset + 65, $spln_ym_to);
	}

	/**
	 * Sale month TO 販売年月ＴＯ.<p>
	 *
	 */
	public void spln_ym_to(MCDate value) {
		setConstDate(offset + 65, $spln_ym_to, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public boolean show_act_flg() {
		return getConstBoolean(offset + 66, $show_act_flg);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void show_act_flg(boolean value) {
		setConstBoolean(offset + 66, $show_act_flg, value);
	}


	/**
	 * Last time 前回.<p>
	 *
	 */
	public boolean show_pre_flg() {
		return getConstBoolean(offset + 67, $show_pre_flg);
	}

	/**
	 * Last time 前回.<p>
	 *
	 */
	public void show_pre_flg(boolean value) {
		setConstBoolean(offset + 67, $show_pre_flg, value);
	}


	/**
	 * Comparison 比較.<p>
	 *
	 */
	public boolean show_ref_flg() {
		return getConstBoolean(offset + 68, $show_ref_flg);
	}

	/**
	 * Comparison 比較.<p>
	 *
	 */
	public void show_ref_flg(boolean value) {
		setConstBoolean(offset + 68, $show_ref_flg, value);
	}


	/**
	 * Breakdown 内訳.<p>
	 *
	 */
	public boolean show_sub_flg() {
		return getConstBoolean(offset + 69, $show_sub_flg);
	}

	/**
	 * Breakdown 内訳.<p>
	 *
	 */
	public void show_sub_flg(boolean value) {
		setConstBoolean(offset + 69, $show_sub_flg, value);
	}


	/**
	 * Blank line 空行.<p>
	 *
	 */
	public boolean show_blk_flg() {
		return getConstBoolean(offset + 70, $show_blk_flg);
	}

	/**
	 * Blank line 空行.<p>
	 *
	 */
	public void show_blk_flg(boolean value) {
		setConstBoolean(offset + 70, $show_blk_flg, value);
	}


	/**
	 * Label ラベル.<p>
	 *
	 */
	public boolean show_label_flg() {
		return getConstBoolean(offset + 71, $show_label_flg);
	}

	/**
	 * Label ラベル.<p>
	 *
	 */
	public void show_label_flg(boolean value) {
		setConstBoolean(offset + 71, $show_label_flg, value);
	}


	/**
	 * Cd. コード.<p>
	 *
	 */
	public boolean show_code_flg() {
		return getConstBoolean(offset + 72, $show_code_flg);
	}

	/**
	 * Cd. コード.<p>
	 *
	 */
	public void show_code_flg(boolean value) {
		setConstBoolean(offset + 72, $show_code_flg, value);
	}


	/**
	 * Name 名称.<p>
	 *
	 */
	public boolean show_name_flg() {
		return getConstBoolean(offset + 73, $show_name_flg);
	}

	/**
	 * Name 名称.<p>
	 *
	 */
	public void show_name_flg(boolean value) {
		setConstBoolean(offset + 73, $show_name_flg, value);
	}


	/**
	 * Classification 分類.<p>
	 *
	 */
	public boolean show_grp_flg() {
		return getConstBoolean(offset + 74, $show_grp_flg);
	}

	/**
	 * Classification 分類.<p>
	 *
	 */
	public void show_grp_flg(boolean value) {
		setConstBoolean(offset + 74, $show_grp_flg, value);
	}


	/**
	 * Other その他.<p>
	 *
	 */
	public boolean show_others_flg() {
		return getConstBoolean(offset + 75, $show_others_flg);
	}

	/**
	 * Other その他.<p>
	 *
	 */
	public void show_others_flg(boolean value) {
		setConstBoolean(offset + 75, $show_others_flg, value);
	}


	public String getString(String name) {
		if ($upd_ope.equalsIgnoreCase(name)) {
			return upd_ope();
		}
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($usr_usr_cd.equalsIgnoreCase(name)) {
			return usr_usr_cd();
		}
		if ($usr_usr_nm.equalsIgnoreCase(name)) {
			return usr_usr_nm();
		}
		if ($usr_dpt_cd.equalsIgnoreCase(name)) {
			return usr_dpt_cd();
		}
		if ($usr_dpt_nm.equalsIgnoreCase(name)) {
			return usr_dpt_nm();
		}
		if ($usr_cst_cd.equalsIgnoreCase(name)) {
			return usr_cst_cd();
		}
		if ($usr_cst_nm.equalsIgnoreCase(name)) {
			return usr_cst_nm();
		}
		if ($usr_spln_itm_cd.equalsIgnoreCase(name)) {
			return usr_spln_itm_cd();
		}
		if ($usr_spln_itm_nm.equalsIgnoreCase(name)) {
			return usr_spln_itm_nm();
		}
		if ($sum_dpt_cd.equalsIgnoreCase(name)) {
			return sum_dpt_cd();
		}
		if ($sum_dpt_nm.equalsIgnoreCase(name)) {
			return sum_dpt_nm();
		}
		if ($sum_cst_cd.equalsIgnoreCase(name)) {
			return sum_cst_cd();
		}
		if ($sum_cst_nm.equalsIgnoreCase(name)) {
			return sum_cst_nm();
		}
		if ($sum_spln_vers.equalsIgnoreCase(name)) {
			return sum_spln_vers();
		}
		if ($sum_ref_vers.equalsIgnoreCase(name)) {
			return sum_ref_vers();
		}
		if ($sum_spln_itm_cd.equalsIgnoreCase(name)) {
			return sum_spln_itm_cd();
		}
		if ($sum_spln_itm_nm.equalsIgnoreCase(name)) {
			return sum_spln_itm_nm();
		}
		if ($ref_usr_cd.equalsIgnoreCase(name)) {
			return ref_usr_cd();
		}
		if ($ref_usr_nm.equalsIgnoreCase(name)) {
			return ref_usr_nm();
		}
		if ($ref_dpt_cd.equalsIgnoreCase(name)) {
			return ref_dpt_cd();
		}
		if ($ref_dpt_nm.equalsIgnoreCase(name)) {
			return ref_dpt_nm();
		}
		if ($ref_wg_cd.equalsIgnoreCase(name)) {
			return ref_wg_cd();
		}
		if ($ref_wg_nm.equalsIgnoreCase(name)) {
			return ref_wg_nm();
		}
		if ($ref_cst_cd.equalsIgnoreCase(name)) {
			return ref_cst_cd();
		}
		if ($ref_cst_nm.equalsIgnoreCase(name)) {
			return ref_cst_nm();
		}
		if ($ref_spln_vers.equalsIgnoreCase(name)) {
			return ref_spln_vers();
		}
		if ($ref_spln_itm_cd.equalsIgnoreCase(name)) {
			return ref_spln_itm_cd();
		}
		if ($ref_spln_itm_nm.equalsIgnoreCase(name)) {
			return ref_spln_itm_nm();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($usr_ym.equalsIgnoreCase(name)) {
			return usr_ym();
		}
		if ($usr_spln_ym_fr.equalsIgnoreCase(name)) {
			return usr_spln_ym_fr();
		}
		if ($usr_spln_ym_to.equalsIgnoreCase(name)) {
			return usr_spln_ym_to();
		}
		if ($sum_ym.equalsIgnoreCase(name)) {
			return sum_ym();
		}
		if ($sum_spln_ym_fr.equalsIgnoreCase(name)) {
			return sum_spln_ym_fr();
		}
		if ($sum_spln_ym_to.equalsIgnoreCase(name)) {
			return sum_spln_ym_to();
		}
		if ($ref_spln_ym_fr.equalsIgnoreCase(name)) {
			return ref_spln_ym_fr();
		}
		if ($ref_spln_ym_to.equalsIgnoreCase(name)) {
			return ref_spln_ym_to();
		}
		if ($ref_ym_fr.equalsIgnoreCase(name)) {
			return ref_ym_fr();
		}
		if ($ref_ym_to.equalsIgnoreCase(name)) {
			return ref_ym_to();
		}
		if ($spln_ym_fr.equalsIgnoreCase(name)) {
			return spln_ym_fr();
		}
		if ($spln_ym_to.equalsIgnoreCase(name)) {
			return spln_ym_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($act_flg.equalsIgnoreCase(name)) {
			return act_flg();
		}
		if ($pre_flg.equalsIgnoreCase(name)) {
			return pre_flg();
		}
		if ($ref_flg.equalsIgnoreCase(name)) {
			return ref_flg();
		}
		if ($usr_reg_f_flg.equalsIgnoreCase(name)) {
			return usr_reg_f_flg();
		}
		if ($usr_reg_t_flg.equalsIgnoreCase(name)) {
			return usr_reg_t_flg();
		}
		if ($usr_fix_f_flg.equalsIgnoreCase(name)) {
			return usr_fix_f_flg();
		}
		if ($usr_fix_t_flg.equalsIgnoreCase(name)) {
			return usr_fix_t_flg();
		}
		if ($sum_reg_f_flg.equalsIgnoreCase(name)) {
			return sum_reg_f_flg();
		}
		if ($sum_reg_t_flg.equalsIgnoreCase(name)) {
			return sum_reg_t_flg();
		}
		if ($sum_fix_f_flg.equalsIgnoreCase(name)) {
			return sum_fix_f_flg();
		}
		if ($sum_fix_t_flg.equalsIgnoreCase(name)) {
			return sum_fix_t_flg();
		}
		if ($ref_fix_f_flg.equalsIgnoreCase(name)) {
			return ref_fix_f_flg();
		}
		if ($ref_del_flg.equalsIgnoreCase(name)) {
			return ref_del_flg();
		}
		if ($hdr_del_flg.equalsIgnoreCase(name)) {
			return hdr_del_flg();
		}
		if ($show_act_flg.equalsIgnoreCase(name)) {
			return show_act_flg();
		}
		if ($show_pre_flg.equalsIgnoreCase(name)) {
			return show_pre_flg();
		}
		if ($show_ref_flg.equalsIgnoreCase(name)) {
			return show_ref_flg();
		}
		if ($show_sub_flg.equalsIgnoreCase(name)) {
			return show_sub_flg();
		}
		if ($show_blk_flg.equalsIgnoreCase(name)) {
			return show_blk_flg();
		}
		if ($show_label_flg.equalsIgnoreCase(name)) {
			return show_label_flg();
		}
		if ($show_code_flg.equalsIgnoreCase(name)) {
			return show_code_flg();
		}
		if ($show_name_flg.equalsIgnoreCase(name)) {
			return show_name_flg();
		}
		if ($show_grp_flg.equalsIgnoreCase(name)) {
			return show_grp_flg();
		}
		if ($show_others_flg.equalsIgnoreCase(name)) {
			return show_others_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($upd_ope.equalsIgnoreCase(name)) {
			return upd_ope();
		}
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($usr_usr_cd.equalsIgnoreCase(name)) {
			return usr_usr_cd();
		}
		if ($usr_usr_nm.equalsIgnoreCase(name)) {
			return usr_usr_nm();
		}
		if ($usr_dpt_cd.equalsIgnoreCase(name)) {
			return usr_dpt_cd();
		}
		if ($usr_dpt_nm.equalsIgnoreCase(name)) {
			return usr_dpt_nm();
		}
		if ($usr_cst_cd.equalsIgnoreCase(name)) {
			return usr_cst_cd();
		}
		if ($usr_cst_nm.equalsIgnoreCase(name)) {
			return usr_cst_nm();
		}
		if ($usr_spln_itm_cd.equalsIgnoreCase(name)) {
			return usr_spln_itm_cd();
		}
		if ($usr_spln_itm_nm.equalsIgnoreCase(name)) {
			return usr_spln_itm_nm();
		}
		if ($sum_dpt_cd.equalsIgnoreCase(name)) {
			return sum_dpt_cd();
		}
		if ($sum_dpt_nm.equalsIgnoreCase(name)) {
			return sum_dpt_nm();
		}
		if ($sum_cst_cd.equalsIgnoreCase(name)) {
			return sum_cst_cd();
		}
		if ($sum_cst_nm.equalsIgnoreCase(name)) {
			return sum_cst_nm();
		}
		if ($sum_spln_vers.equalsIgnoreCase(name)) {
			return sum_spln_vers();
		}
		if ($sum_ref_vers.equalsIgnoreCase(name)) {
			return sum_ref_vers();
		}
		if ($sum_spln_itm_cd.equalsIgnoreCase(name)) {
			return sum_spln_itm_cd();
		}
		if ($sum_spln_itm_nm.equalsIgnoreCase(name)) {
			return sum_spln_itm_nm();
		}
		if ($ref_usr_cd.equalsIgnoreCase(name)) {
			return ref_usr_cd();
		}
		if ($ref_usr_nm.equalsIgnoreCase(name)) {
			return ref_usr_nm();
		}
		if ($ref_dpt_cd.equalsIgnoreCase(name)) {
			return ref_dpt_cd();
		}
		if ($ref_dpt_nm.equalsIgnoreCase(name)) {
			return ref_dpt_nm();
		}
		if ($ref_wg_cd.equalsIgnoreCase(name)) {
			return ref_wg_cd();
		}
		if ($ref_wg_nm.equalsIgnoreCase(name)) {
			return ref_wg_nm();
		}
		if ($ref_cst_cd.equalsIgnoreCase(name)) {
			return ref_cst_cd();
		}
		if ($ref_cst_nm.equalsIgnoreCase(name)) {
			return ref_cst_nm();
		}
		if ($ref_spln_vers.equalsIgnoreCase(name)) {
			return ref_spln_vers();
		}
		if ($ref_spln_itm_cd.equalsIgnoreCase(name)) {
			return ref_spln_itm_cd();
		}
		if ($ref_spln_itm_nm.equalsIgnoreCase(name)) {
			return ref_spln_itm_nm();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($usr_ym.equalsIgnoreCase(name)) {
			return usr_ym();
		}
		if ($usr_spln_ym_fr.equalsIgnoreCase(name)) {
			return usr_spln_ym_fr();
		}
		if ($usr_spln_ym_to.equalsIgnoreCase(name)) {
			return usr_spln_ym_to();
		}
		if ($sum_ym.equalsIgnoreCase(name)) {
			return sum_ym();
		}
		if ($sum_spln_ym_fr.equalsIgnoreCase(name)) {
			return sum_spln_ym_fr();
		}
		if ($sum_spln_ym_to.equalsIgnoreCase(name)) {
			return sum_spln_ym_to();
		}
		if ($ref_spln_ym_fr.equalsIgnoreCase(name)) {
			return ref_spln_ym_fr();
		}
		if ($ref_spln_ym_to.equalsIgnoreCase(name)) {
			return ref_spln_ym_to();
		}
		if ($ref_ym_fr.equalsIgnoreCase(name)) {
			return ref_ym_fr();
		}
		if ($ref_ym_to.equalsIgnoreCase(name)) {
			return ref_ym_to();
		}
		if ($spln_ym_fr.equalsIgnoreCase(name)) {
			return spln_ym_fr();
		}
		if ($spln_ym_to.equalsIgnoreCase(name)) {
			return spln_ym_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($act_flg.equalsIgnoreCase(name)) {
			return act_flg();
		}
		if ($pre_flg.equalsIgnoreCase(name)) {
			return pre_flg();
		}
		if ($ref_flg.equalsIgnoreCase(name)) {
			return ref_flg();
		}
		if ($usr_reg_f_flg.equalsIgnoreCase(name)) {
			return usr_reg_f_flg();
		}
		if ($usr_reg_t_flg.equalsIgnoreCase(name)) {
			return usr_reg_t_flg();
		}
		if ($usr_fix_f_flg.equalsIgnoreCase(name)) {
			return usr_fix_f_flg();
		}
		if ($usr_fix_t_flg.equalsIgnoreCase(name)) {
			return usr_fix_t_flg();
		}
		if ($sum_reg_f_flg.equalsIgnoreCase(name)) {
			return sum_reg_f_flg();
		}
		if ($sum_reg_t_flg.equalsIgnoreCase(name)) {
			return sum_reg_t_flg();
		}
		if ($sum_fix_f_flg.equalsIgnoreCase(name)) {
			return sum_fix_f_flg();
		}
		if ($sum_fix_t_flg.equalsIgnoreCase(name)) {
			return sum_fix_t_flg();
		}
		if ($ref_fix_f_flg.equalsIgnoreCase(name)) {
			return ref_fix_f_flg();
		}
		if ($ref_del_flg.equalsIgnoreCase(name)) {
			return ref_del_flg();
		}
		if ($hdr_del_flg.equalsIgnoreCase(name)) {
			return hdr_del_flg();
		}
		if ($show_act_flg.equalsIgnoreCase(name)) {
			return show_act_flg();
		}
		if ($show_pre_flg.equalsIgnoreCase(name)) {
			return show_pre_flg();
		}
		if ($show_ref_flg.equalsIgnoreCase(name)) {
			return show_ref_flg();
		}
		if ($show_sub_flg.equalsIgnoreCase(name)) {
			return show_sub_flg();
		}
		if ($show_blk_flg.equalsIgnoreCase(name)) {
			return show_blk_flg();
		}
		if ($show_label_flg.equalsIgnoreCase(name)) {
			return show_label_flg();
		}
		if ($show_code_flg.equalsIgnoreCase(name)) {
			return show_code_flg();
		}
		if ($show_name_flg.equalsIgnoreCase(name)) {
			return show_name_flg();
		}
		if ($show_grp_flg.equalsIgnoreCase(name)) {
			return show_grp_flg();
		}
		if ($show_others_flg.equalsIgnoreCase(name)) {
			return show_others_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($upd_ope.equalsIgnoreCase(name)) {
			upd_ope(value);
			return;
		}
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($usr_usr_cd.equalsIgnoreCase(name)) {
			usr_usr_cd(value);
			return;
		}
		if ($usr_usr_nm.equalsIgnoreCase(name)) {
			usr_usr_nm(value);
			return;
		}
		if ($usr_dpt_cd.equalsIgnoreCase(name)) {
			usr_dpt_cd(value);
			return;
		}
		if ($usr_dpt_nm.equalsIgnoreCase(name)) {
			usr_dpt_nm(value);
			return;
		}
		if ($usr_cst_cd.equalsIgnoreCase(name)) {
			usr_cst_cd(value);
			return;
		}
		if ($usr_cst_nm.equalsIgnoreCase(name)) {
			usr_cst_nm(value);
			return;
		}
		if ($usr_spln_itm_cd.equalsIgnoreCase(name)) {
			usr_spln_itm_cd(value);
			return;
		}
		if ($usr_spln_itm_nm.equalsIgnoreCase(name)) {
			usr_spln_itm_nm(value);
			return;
		}
		if ($sum_dpt_cd.equalsIgnoreCase(name)) {
			sum_dpt_cd(value);
			return;
		}
		if ($sum_dpt_nm.equalsIgnoreCase(name)) {
			sum_dpt_nm(value);
			return;
		}
		if ($sum_cst_cd.equalsIgnoreCase(name)) {
			sum_cst_cd(value);
			return;
		}
		if ($sum_cst_nm.equalsIgnoreCase(name)) {
			sum_cst_nm(value);
			return;
		}
		if ($sum_spln_vers.equalsIgnoreCase(name)) {
			sum_spln_vers(value);
			return;
		}
		if ($sum_ref_vers.equalsIgnoreCase(name)) {
			sum_ref_vers(value);
			return;
		}
		if ($sum_spln_itm_cd.equalsIgnoreCase(name)) {
			sum_spln_itm_cd(value);
			return;
		}
		if ($sum_spln_itm_nm.equalsIgnoreCase(name)) {
			sum_spln_itm_nm(value);
			return;
		}
		if ($ref_usr_cd.equalsIgnoreCase(name)) {
			ref_usr_cd(value);
			return;
		}
		if ($ref_usr_nm.equalsIgnoreCase(name)) {
			ref_usr_nm(value);
			return;
		}
		if ($ref_dpt_cd.equalsIgnoreCase(name)) {
			ref_dpt_cd(value);
			return;
		}
		if ($ref_dpt_nm.equalsIgnoreCase(name)) {
			ref_dpt_nm(value);
			return;
		}
		if ($ref_wg_cd.equalsIgnoreCase(name)) {
			ref_wg_cd(value);
			return;
		}
		if ($ref_wg_nm.equalsIgnoreCase(name)) {
			ref_wg_nm(value);
			return;
		}
		if ($ref_cst_cd.equalsIgnoreCase(name)) {
			ref_cst_cd(value);
			return;
		}
		if ($ref_cst_nm.equalsIgnoreCase(name)) {
			ref_cst_nm(value);
			return;
		}
		if ($ref_spln_vers.equalsIgnoreCase(name)) {
			ref_spln_vers(value);
			return;
		}
		if ($ref_spln_itm_cd.equalsIgnoreCase(name)) {
			ref_spln_itm_cd(value);
			return;
		}
		if ($ref_spln_itm_nm.equalsIgnoreCase(name)) {
			ref_spln_itm_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($usr_ym.equalsIgnoreCase(name)) {
			usr_ym(value);
			return;
		}
		if ($usr_spln_ym_fr.equalsIgnoreCase(name)) {
			usr_spln_ym_fr(value);
			return;
		}
		if ($usr_spln_ym_to.equalsIgnoreCase(name)) {
			usr_spln_ym_to(value);
			return;
		}
		if ($sum_ym.equalsIgnoreCase(name)) {
			sum_ym(value);
			return;
		}
		if ($sum_spln_ym_fr.equalsIgnoreCase(name)) {
			sum_spln_ym_fr(value);
			return;
		}
		if ($sum_spln_ym_to.equalsIgnoreCase(name)) {
			sum_spln_ym_to(value);
			return;
		}
		if ($ref_spln_ym_fr.equalsIgnoreCase(name)) {
			ref_spln_ym_fr(value);
			return;
		}
		if ($ref_spln_ym_to.equalsIgnoreCase(name)) {
			ref_spln_ym_to(value);
			return;
		}
		if ($ref_ym_fr.equalsIgnoreCase(name)) {
			ref_ym_fr(value);
			return;
		}
		if ($ref_ym_to.equalsIgnoreCase(name)) {
			ref_ym_to(value);
			return;
		}
		if ($spln_ym_fr.equalsIgnoreCase(name)) {
			spln_ym_fr(value);
			return;
		}
		if ($spln_ym_to.equalsIgnoreCase(name)) {
			spln_ym_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($act_flg.equalsIgnoreCase(name)) {
			act_flg(value);
			return;
		}
		if ($pre_flg.equalsIgnoreCase(name)) {
			pre_flg(value);
			return;
		}
		if ($ref_flg.equalsIgnoreCase(name)) {
			ref_flg(value);
			return;
		}
		if ($usr_reg_f_flg.equalsIgnoreCase(name)) {
			usr_reg_f_flg(value);
			return;
		}
		if ($usr_reg_t_flg.equalsIgnoreCase(name)) {
			usr_reg_t_flg(value);
			return;
		}
		if ($usr_fix_f_flg.equalsIgnoreCase(name)) {
			usr_fix_f_flg(value);
			return;
		}
		if ($usr_fix_t_flg.equalsIgnoreCase(name)) {
			usr_fix_t_flg(value);
			return;
		}
		if ($sum_reg_f_flg.equalsIgnoreCase(name)) {
			sum_reg_f_flg(value);
			return;
		}
		if ($sum_reg_t_flg.equalsIgnoreCase(name)) {
			sum_reg_t_flg(value);
			return;
		}
		if ($sum_fix_f_flg.equalsIgnoreCase(name)) {
			sum_fix_f_flg(value);
			return;
		}
		if ($sum_fix_t_flg.equalsIgnoreCase(name)) {
			sum_fix_t_flg(value);
			return;
		}
		if ($ref_fix_f_flg.equalsIgnoreCase(name)) {
			ref_fix_f_flg(value);
			return;
		}
		if ($ref_del_flg.equalsIgnoreCase(name)) {
			ref_del_flg(value);
			return;
		}
		if ($hdr_del_flg.equalsIgnoreCase(name)) {
			hdr_del_flg(value);
			return;
		}
		if ($show_act_flg.equalsIgnoreCase(name)) {
			show_act_flg(value);
			return;
		}
		if ($show_pre_flg.equalsIgnoreCase(name)) {
			show_pre_flg(value);
			return;
		}
		if ($show_ref_flg.equalsIgnoreCase(name)) {
			show_ref_flg(value);
			return;
		}
		if ($show_sub_flg.equalsIgnoreCase(name)) {
			show_sub_flg(value);
			return;
		}
		if ($show_blk_flg.equalsIgnoreCase(name)) {
			show_blk_flg(value);
			return;
		}
		if ($show_label_flg.equalsIgnoreCase(name)) {
			show_label_flg(value);
			return;
		}
		if ($show_code_flg.equalsIgnoreCase(name)) {
			show_code_flg(value);
			return;
		}
		if ($show_name_flg.equalsIgnoreCase(name)) {
			show_name_flg(value);
			return;
		}
		if ($show_grp_flg.equalsIgnoreCase(name)) {
			show_grp_flg(value);
			return;
		}
		if ($show_others_flg.equalsIgnoreCase(name)) {
			show_others_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($upd_ope.equalsIgnoreCase(name)) {
			upd_ope(value);
			return;
		}
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($usr_usr_cd.equalsIgnoreCase(name)) {
			usr_usr_cd(value);
			return;
		}
		if ($usr_usr_nm.equalsIgnoreCase(name)) {
			usr_usr_nm(value);
			return;
		}
		if ($usr_dpt_cd.equalsIgnoreCase(name)) {
			usr_dpt_cd(value);
			return;
		}
		if ($usr_dpt_nm.equalsIgnoreCase(name)) {
			usr_dpt_nm(value);
			return;
		}
		if ($usr_cst_cd.equalsIgnoreCase(name)) {
			usr_cst_cd(value);
			return;
		}
		if ($usr_cst_nm.equalsIgnoreCase(name)) {
			usr_cst_nm(value);
			return;
		}
		if ($usr_spln_itm_cd.equalsIgnoreCase(name)) {
			usr_spln_itm_cd(value);
			return;
		}
		if ($usr_spln_itm_nm.equalsIgnoreCase(name)) {
			usr_spln_itm_nm(value);
			return;
		}
		if ($sum_dpt_cd.equalsIgnoreCase(name)) {
			sum_dpt_cd(value);
			return;
		}
		if ($sum_dpt_nm.equalsIgnoreCase(name)) {
			sum_dpt_nm(value);
			return;
		}
		if ($sum_cst_cd.equalsIgnoreCase(name)) {
			sum_cst_cd(value);
			return;
		}
		if ($sum_cst_nm.equalsIgnoreCase(name)) {
			sum_cst_nm(value);
			return;
		}
		if ($sum_spln_vers.equalsIgnoreCase(name)) {
			sum_spln_vers(value);
			return;
		}
		if ($sum_ref_vers.equalsIgnoreCase(name)) {
			sum_ref_vers(value);
			return;
		}
		if ($sum_spln_itm_cd.equalsIgnoreCase(name)) {
			sum_spln_itm_cd(value);
			return;
		}
		if ($sum_spln_itm_nm.equalsIgnoreCase(name)) {
			sum_spln_itm_nm(value);
			return;
		}
		if ($ref_usr_cd.equalsIgnoreCase(name)) {
			ref_usr_cd(value);
			return;
		}
		if ($ref_usr_nm.equalsIgnoreCase(name)) {
			ref_usr_nm(value);
			return;
		}
		if ($ref_dpt_cd.equalsIgnoreCase(name)) {
			ref_dpt_cd(value);
			return;
		}
		if ($ref_dpt_nm.equalsIgnoreCase(name)) {
			ref_dpt_nm(value);
			return;
		}
		if ($ref_wg_cd.equalsIgnoreCase(name)) {
			ref_wg_cd(value);
			return;
		}
		if ($ref_wg_nm.equalsIgnoreCase(name)) {
			ref_wg_nm(value);
			return;
		}
		if ($ref_cst_cd.equalsIgnoreCase(name)) {
			ref_cst_cd(value);
			return;
		}
		if ($ref_cst_nm.equalsIgnoreCase(name)) {
			ref_cst_nm(value);
			return;
		}
		if ($ref_spln_vers.equalsIgnoreCase(name)) {
			ref_spln_vers(value);
			return;
		}
		if ($ref_spln_itm_cd.equalsIgnoreCase(name)) {
			ref_spln_itm_cd(value);
			return;
		}
		if ($ref_spln_itm_nm.equalsIgnoreCase(name)) {
			ref_spln_itm_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($usr_ym.equalsIgnoreCase(name)) {
			usr_ym(value);
			return;
		}
		if ($usr_spln_ym_fr.equalsIgnoreCase(name)) {
			usr_spln_ym_fr(value);
			return;
		}
		if ($usr_spln_ym_to.equalsIgnoreCase(name)) {
			usr_spln_ym_to(value);
			return;
		}
		if ($sum_ym.equalsIgnoreCase(name)) {
			sum_ym(value);
			return;
		}
		if ($sum_spln_ym_fr.equalsIgnoreCase(name)) {
			sum_spln_ym_fr(value);
			return;
		}
		if ($sum_spln_ym_to.equalsIgnoreCase(name)) {
			sum_spln_ym_to(value);
			return;
		}
		if ($ref_spln_ym_fr.equalsIgnoreCase(name)) {
			ref_spln_ym_fr(value);
			return;
		}
		if ($ref_spln_ym_to.equalsIgnoreCase(name)) {
			ref_spln_ym_to(value);
			return;
		}
		if ($ref_ym_fr.equalsIgnoreCase(name)) {
			ref_ym_fr(value);
			return;
		}
		if ($ref_ym_to.equalsIgnoreCase(name)) {
			ref_ym_to(value);
			return;
		}
		if ($spln_ym_fr.equalsIgnoreCase(name)) {
			spln_ym_fr(value);
			return;
		}
		if ($spln_ym_to.equalsIgnoreCase(name)) {
			spln_ym_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($act_flg.equalsIgnoreCase(name)) {
			act_flg(value);
			return;
		}
		if ($pre_flg.equalsIgnoreCase(name)) {
			pre_flg(value);
			return;
		}
		if ($ref_flg.equalsIgnoreCase(name)) {
			ref_flg(value);
			return;
		}
		if ($usr_reg_f_flg.equalsIgnoreCase(name)) {
			usr_reg_f_flg(value);
			return;
		}
		if ($usr_reg_t_flg.equalsIgnoreCase(name)) {
			usr_reg_t_flg(value);
			return;
		}
		if ($usr_fix_f_flg.equalsIgnoreCase(name)) {
			usr_fix_f_flg(value);
			return;
		}
		if ($usr_fix_t_flg.equalsIgnoreCase(name)) {
			usr_fix_t_flg(value);
			return;
		}
		if ($sum_reg_f_flg.equalsIgnoreCase(name)) {
			sum_reg_f_flg(value);
			return;
		}
		if ($sum_reg_t_flg.equalsIgnoreCase(name)) {
			sum_reg_t_flg(value);
			return;
		}
		if ($sum_fix_f_flg.equalsIgnoreCase(name)) {
			sum_fix_f_flg(value);
			return;
		}
		if ($sum_fix_t_flg.equalsIgnoreCase(name)) {
			sum_fix_t_flg(value);
			return;
		}
		if ($ref_fix_f_flg.equalsIgnoreCase(name)) {
			ref_fix_f_flg(value);
			return;
		}
		if ($ref_del_flg.equalsIgnoreCase(name)) {
			ref_del_flg(value);
			return;
		}
		if ($hdr_del_flg.equalsIgnoreCase(name)) {
			hdr_del_flg(value);
			return;
		}
		if ($show_act_flg.equalsIgnoreCase(name)) {
			show_act_flg(value);
			return;
		}
		if ($show_pre_flg.equalsIgnoreCase(name)) {
			show_pre_flg(value);
			return;
		}
		if ($show_ref_flg.equalsIgnoreCase(name)) {
			show_ref_flg(value);
			return;
		}
		if ($show_sub_flg.equalsIgnoreCase(name)) {
			show_sub_flg(value);
			return;
		}
		if ($show_blk_flg.equalsIgnoreCase(name)) {
			show_blk_flg(value);
			return;
		}
		if ($show_label_flg.equalsIgnoreCase(name)) {
			show_label_flg(value);
			return;
		}
		if ($show_code_flg.equalsIgnoreCase(name)) {
			show_code_flg(value);
			return;
		}
		if ($show_name_flg.equalsIgnoreCase(name)) {
			show_name_flg(value);
			return;
		}
		if ($show_grp_flg.equalsIgnoreCase(name)) {
			show_grp_flg(value);
			return;
		}
		if ($show_others_flg.equalsIgnoreCase(name)) {
			show_others_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($usr_wrk_no_p.equalsIgnoreCase(name)) {
			return usr_wrk_no_p();
		}
		if ($usr_itm_typ_p.equalsIgnoreCase(name)) {
			return usr_itm_typ_p();
		}
		if ($usr_itm_p.equalsIgnoreCase(name)) {
			return usr_itm_p();
		}
		if ($sum_wrk_no_p.equalsIgnoreCase(name)) {
			return sum_wrk_no_p();
		}
		if ($sum_itm_typ_p.equalsIgnoreCase(name)) {
			return sum_itm_typ_p();
		}
		if ($sum_itm_p.equalsIgnoreCase(name)) {
			return sum_itm_p();
		}
		if ($ref_wrk_no_p.equalsIgnoreCase(name)) {
			return ref_wrk_no_p();
		}
		if ($ref_itm_typ_p.equalsIgnoreCase(name)) {
			return ref_itm_typ_p();
		}
		if ($ref_itm_p.equalsIgnoreCase(name)) {
			return ref_itm_p();
		}
		if ($itm_grp_p.equalsIgnoreCase(name)) {
			return itm_grp_p();
		}
		if ($bp_grp_p.equalsIgnoreCase(name)) {
			return bp_grp_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($usr_wrk_no_p.equalsIgnoreCase(name)) {
			usr_wrk_no_p(
				((MCContainerMeta) usr_wrk_no_p_META).castInnerRow(mcframe.clientMSUB.MSUBP0010.WrkNoR.class, value)
			);
			return;
		}
		if ($usr_itm_typ_p.equalsIgnoreCase(name)) {
			usr_itm_typ_p(
				((MCContainerMeta) usr_itm_typ_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0100.ItmTypR.class, value)
			);
			return;
		}
		if ($usr_itm_p.equalsIgnoreCase(name)) {
			usr_itm_p(
				((MCContainerMeta) usr_itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0030.ItmR.class, value)
			);
			return;
		}
		if ($sum_wrk_no_p.equalsIgnoreCase(name)) {
			sum_wrk_no_p(
				((MCContainerMeta) sum_wrk_no_p_META).castInnerRow(mcframe.clientMSUB.MSUBP0010.WrkNoR.class, value)
			);
			return;
		}
		if ($sum_itm_typ_p.equalsIgnoreCase(name)) {
			sum_itm_typ_p(
				((MCContainerMeta) sum_itm_typ_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0100.ItmTypR.class, value)
			);
			return;
		}
		if ($sum_itm_p.equalsIgnoreCase(name)) {
			sum_itm_p(
				((MCContainerMeta) sum_itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0030.ItmR.class, value)
			);
			return;
		}
		if ($ref_wrk_no_p.equalsIgnoreCase(name)) {
			ref_wrk_no_p(
				((MCContainerMeta) ref_wrk_no_p_META).castInnerRow(mcframe.clientMSUB.MSUBP0010.WrkNoR.class, value)
			);
			return;
		}
		if ($ref_itm_typ_p.equalsIgnoreCase(name)) {
			ref_itm_typ_p(
				((MCContainerMeta) ref_itm_typ_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0100.ItmTypR.class, value)
			);
			return;
		}
		if ($ref_itm_p.equalsIgnoreCase(name)) {
			ref_itm_p(
				((MCContainerMeta) ref_itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0030.ItmR.class, value)
			);
			return;
		}
		if ($itm_grp_p.equalsIgnoreCase(name)) {
			itm_grp_p(
				((MCContainerMeta) itm_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0250.ItmGrpR.class, value)
			);
			return;
		}
		if ($bp_grp_p.equalsIgnoreCase(name)) {
			bp_grp_p(
				((MCContainerMeta) bp_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0260.BpGrpR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public String usr_wrk_no() {
		return usr_wrk_no_p().wrk_no();
	}

	public void usr_wrk_no(String value) {
		usr_wrk_no_p().wrk_no(value);
	}

	public String usr_wrk_nm() {
		return usr_wrk_no_p().wrk_nm();
	}

	public void usr_wrk_nm(String value) {
		usr_wrk_no_p().wrk_nm(value);
	}

	public String usr_itm_typ() {
		return usr_itm_typ_p().itm_typ();
	}

	public void usr_itm_typ(String value) {
		usr_itm_typ_p().itm_typ(value);
	}

	public String usr_itm_typ_d_cd() {
		return usr_itm_typ_p().itm_typ_d_cd();
	}

	public void usr_itm_typ_d_cd(String value) {
		usr_itm_typ_p().itm_typ_d_cd(value);
	}

	public String usr_itm_typ_d_nm() {
		return usr_itm_typ_p().itm_typ_d_nm();
	}

	public void usr_itm_typ_d_nm(String value) {
		usr_itm_typ_p().itm_typ_d_nm(value);
	}

	public String usr_itm_cd() {
		return usr_itm_p().itm_cd();
	}

	public void usr_itm_cd(String value) {
		usr_itm_p().itm_cd(value);
	}

	public String usr_itm_sub1() {
		return usr_itm_p().itm_sub1();
	}

	public void usr_itm_sub1(String value) {
		usr_itm_p().itm_sub1(value);
	}

	public String usr_itm_sub2() {
		return usr_itm_p().itm_sub2();
	}

	public void usr_itm_sub2(String value) {
		usr_itm_p().itm_sub2(value);
	}

	public String usr_itm_sub3() {
		return usr_itm_p().itm_sub3();
	}

	public void usr_itm_sub3(String value) {
		usr_itm_p().itm_sub3(value);
	}

	public String usr_itm_nm() {
		return usr_itm_p().itm_nm();
	}

	public void usr_itm_nm(String value) {
		usr_itm_p().itm_nm(value);
	}

	public String sum_wrk_no() {
		return sum_wrk_no_p().wrk_no();
	}

	public void sum_wrk_no(String value) {
		sum_wrk_no_p().wrk_no(value);
	}

	public String sum_wrk_nm() {
		return sum_wrk_no_p().wrk_nm();
	}

	public void sum_wrk_nm(String value) {
		sum_wrk_no_p().wrk_nm(value);
	}

	public String sum_itm_typ() {
		return sum_itm_typ_p().itm_typ();
	}

	public void sum_itm_typ(String value) {
		sum_itm_typ_p().itm_typ(value);
	}

	public String sum_itm_typ_d_cd() {
		return sum_itm_typ_p().itm_typ_d_cd();
	}

	public void sum_itm_typ_d_cd(String value) {
		sum_itm_typ_p().itm_typ_d_cd(value);
	}

	public String sum_itm_typ_d_nm() {
		return sum_itm_typ_p().itm_typ_d_nm();
	}

	public void sum_itm_typ_d_nm(String value) {
		sum_itm_typ_p().itm_typ_d_nm(value);
	}

	public String sum_itm_cd() {
		return sum_itm_p().itm_cd();
	}

	public void sum_itm_cd(String value) {
		sum_itm_p().itm_cd(value);
	}

	public String sum_itm_sub1() {
		return sum_itm_p().itm_sub1();
	}

	public void sum_itm_sub1(String value) {
		sum_itm_p().itm_sub1(value);
	}

	public String sum_itm_sub2() {
		return sum_itm_p().itm_sub2();
	}

	public void sum_itm_sub2(String value) {
		sum_itm_p().itm_sub2(value);
	}

	public String sum_itm_sub3() {
		return sum_itm_p().itm_sub3();
	}

	public void sum_itm_sub3(String value) {
		sum_itm_p().itm_sub3(value);
	}

	public String sum_itm_nm() {
		return sum_itm_p().itm_nm();
	}

	public void sum_itm_nm(String value) {
		sum_itm_p().itm_nm(value);
	}

	public String ref_wrk_no() {
		return ref_wrk_no_p().wrk_no();
	}

	public void ref_wrk_no(String value) {
		ref_wrk_no_p().wrk_no(value);
	}

	public String ref_wrk_nm() {
		return ref_wrk_no_p().wrk_nm();
	}

	public void ref_wrk_nm(String value) {
		ref_wrk_no_p().wrk_nm(value);
	}

	public String ref_itm_typ() {
		return ref_itm_typ_p().itm_typ();
	}

	public void ref_itm_typ(String value) {
		ref_itm_typ_p().itm_typ(value);
	}

	public String ref_itm_typ_d_cd() {
		return ref_itm_typ_p().itm_typ_d_cd();
	}

	public void ref_itm_typ_d_cd(String value) {
		ref_itm_typ_p().itm_typ_d_cd(value);
	}

	public String ref_itm_typ_d_nm() {
		return ref_itm_typ_p().itm_typ_d_nm();
	}

	public void ref_itm_typ_d_nm(String value) {
		ref_itm_typ_p().itm_typ_d_nm(value);
	}

	public String ref_itm_cd() {
		return ref_itm_p().itm_cd();
	}

	public void ref_itm_cd(String value) {
		ref_itm_p().itm_cd(value);
	}

	public String ref_itm_sub1() {
		return ref_itm_p().itm_sub1();
	}

	public void ref_itm_sub1(String value) {
		ref_itm_p().itm_sub1(value);
	}

	public String ref_itm_sub2() {
		return ref_itm_p().itm_sub2();
	}

	public void ref_itm_sub2(String value) {
		ref_itm_p().itm_sub2(value);
	}

	public String ref_itm_sub3() {
		return ref_itm_p().itm_sub3();
	}

	public void ref_itm_sub3(String value) {
		ref_itm_p().itm_sub3(value);
	}

	public String ref_itm_nm() {
		return ref_itm_p().itm_nm();
	}

	public void ref_itm_nm(String value) {
		ref_itm_p().itm_nm(value);
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

	/**
	 * Customer classification 1 得意先分類１.<p>
	 *
	 */
	public boolean bp_grp_flg1() {
		return bp_grp_p().bp_grp_flg1();
	}

	/**
	 * Customer classification 1 得意先分類１.<p>
	 *
	 */
	public void bp_grp_flg1(boolean value) {
		bp_grp_p().bp_grp_flg1(value);
	}

	/**
	 * Customer classification cd. 1 得意先分類ＣＤ１.<p>
	 *
	 */
	public String bp_grp_cd1() {
		return bp_grp_p().bp_grp_cd1();
	}

	/**
	 * Customer classification cd. 1 得意先分類ＣＤ１.<p>
	 *
	 */
	public void bp_grp_cd1(String value) {
		bp_grp_p().bp_grp_cd1(value);
	}

	/**
	 * Customer classification name 1 得意先分類名１.<p>
	 *
	 */
	public String bp_grp_nm1() {
		return bp_grp_p().bp_grp_nm1();
	}

	/**
	 * Customer classification name 1 得意先分類名１.<p>
	 *
	 */
	public void bp_grp_nm1(String value) {
		bp_grp_p().bp_grp_nm1(value);
	}

	/**
	 * Customer classification 2 得意先分類２.<p>
	 *
	 */
	public boolean bp_grp_flg2() {
		return bp_grp_p().bp_grp_flg2();
	}

	/**
	 * Customer classification 2 得意先分類２.<p>
	 *
	 */
	public void bp_grp_flg2(boolean value) {
		bp_grp_p().bp_grp_flg2(value);
	}

	/**
	 * Customer classification cd. 2 得意先分類ＣＤ２.<p>
	 *
	 */
	public String bp_grp_cd2() {
		return bp_grp_p().bp_grp_cd2();
	}

	/**
	 * Customer classification cd. 2 得意先分類ＣＤ２.<p>
	 *
	 */
	public void bp_grp_cd2(String value) {
		bp_grp_p().bp_grp_cd2(value);
	}

	/**
	 * Customer classification name 2 得意先分類名２.<p>
	 *
	 */
	public String bp_grp_nm2() {
		return bp_grp_p().bp_grp_nm2();
	}

	/**
	 * Customer classification name 2 得意先分類名２.<p>
	 *
	 */
	public void bp_grp_nm2(String value) {
		bp_grp_p().bp_grp_nm2(value);
	}

	/**
	 * Customer classification 3 得意先分類３.<p>
	 *
	 */
	public boolean bp_grp_flg3() {
		return bp_grp_p().bp_grp_flg3();
	}

	/**
	 * Customer classification 3 得意先分類３.<p>
	 *
	 */
	public void bp_grp_flg3(boolean value) {
		bp_grp_p().bp_grp_flg3(value);
	}

	/**
	 * Customer classification cd. 3 得意先分類ＣＤ３.<p>
	 *
	 */
	public String bp_grp_cd3() {
		return bp_grp_p().bp_grp_cd3();
	}

	/**
	 * Customer classification cd. 3 得意先分類ＣＤ３.<p>
	 *
	 */
	public void bp_grp_cd3(String value) {
		bp_grp_p().bp_grp_cd3(value);
	}

	/**
	 * Customer classification name 3 得意先分類名３.<p>
	 *
	 */
	public String bp_grp_nm3() {
		return bp_grp_p().bp_grp_nm3();
	}

	/**
	 * Customer classification name 3 得意先分類名３.<p>
	 *
	 */
	public void bp_grp_nm3(String value) {
		bp_grp_p().bp_grp_nm3(value);
	}

	/**
	 * Customer classification 4 得意先分類４.<p>
	 *
	 */
	public boolean bp_grp_flg4() {
		return bp_grp_p().bp_grp_flg4();
	}

	/**
	 * Customer classification 4 得意先分類４.<p>
	 *
	 */
	public void bp_grp_flg4(boolean value) {
		bp_grp_p().bp_grp_flg4(value);
	}

	/**
	 * Customer classification cd. 4 得意先分類ＣＤ４.<p>
	 *
	 */
	public String bp_grp_cd4() {
		return bp_grp_p().bp_grp_cd4();
	}

	/**
	 * Customer classification cd. 4 得意先分類ＣＤ４.<p>
	 *
	 */
	public void bp_grp_cd4(String value) {
		bp_grp_p().bp_grp_cd4(value);
	}

	/**
	 * Customer classification name 4 得意先分類名４.<p>
	 *
	 */
	public String bp_grp_nm4() {
		return bp_grp_p().bp_grp_nm4();
	}

	/**
	 * Customer classification name 4 得意先分類名４.<p>
	 *
	 */
	public void bp_grp_nm4(String value) {
		bp_grp_p().bp_grp_nm4(value);
	}

	/**
	 * Customer classification 5 得意先分類５.<p>
	 *
	 */
	public boolean bp_grp_flg5() {
		return bp_grp_p().bp_grp_flg5();
	}

	/**
	 * Customer classification 5 得意先分類５.<p>
	 *
	 */
	public void bp_grp_flg5(boolean value) {
		bp_grp_p().bp_grp_flg5(value);
	}

	/**
	 * Customer classification cd. 5 得意先分類ＣＤ５.<p>
	 *
	 */
	public String bp_grp_cd5() {
		return bp_grp_p().bp_grp_cd5();
	}

	/**
	 * Customer classification cd. 5 得意先分類ＣＤ５.<p>
	 *
	 */
	public void bp_grp_cd5(String value) {
		bp_grp_p().bp_grp_cd5(value);
	}

	/**
	 * Customer classification name 5 得意先分類名５.<p>
	 *
	 */
	public String bp_grp_nm5() {
		return bp_grp_p().bp_grp_nm5();
	}

	/**
	 * Customer classification name 5 得意先分類名５.<p>
	 *
	 */
	public void bp_grp_nm5(String value) {
		bp_grp_p().bp_grp_nm5(value);
	}

	/**
	 * Customer classification 6 得意先分類６.<p>
	 *
	 */
	public boolean bp_grp_flg6() {
		return bp_grp_p().bp_grp_flg6();
	}

	/**
	 * Customer classification 6 得意先分類６.<p>
	 *
	 */
	public void bp_grp_flg6(boolean value) {
		bp_grp_p().bp_grp_flg6(value);
	}

	/**
	 * Customer classification cd. 6 得意先分類ＣＤ６.<p>
	 *
	 */
	public String bp_grp_cd6() {
		return bp_grp_p().bp_grp_cd6();
	}

	/**
	 * Customer classification cd. 6 得意先分類ＣＤ６.<p>
	 *
	 */
	public void bp_grp_cd6(String value) {
		bp_grp_p().bp_grp_cd6(value);
	}

	/**
	 * Customer classification name 6 得意先分類名６.<p>
	 *
	 */
	public String bp_grp_nm6() {
		return bp_grp_p().bp_grp_nm6();
	}

	/**
	 * Customer classification name 6 得意先分類名６.<p>
	 *
	 */
	public void bp_grp_nm6(String value) {
		bp_grp_p().bp_grp_nm6(value);
	}

	/**
	 * Customer classification 7 得意先分類７.<p>
	 *
	 */
	public boolean bp_grp_flg7() {
		return bp_grp_p().bp_grp_flg7();
	}

	/**
	 * Customer classification 7 得意先分類７.<p>
	 *
	 */
	public void bp_grp_flg7(boolean value) {
		bp_grp_p().bp_grp_flg7(value);
	}

	/**
	 * Customer classification cd. 7 得意先分類ＣＤ７.<p>
	 *
	 */
	public String bp_grp_cd7() {
		return bp_grp_p().bp_grp_cd7();
	}

	/**
	 * Customer classification cd. 7 得意先分類ＣＤ７.<p>
	 *
	 */
	public void bp_grp_cd7(String value) {
		bp_grp_p().bp_grp_cd7(value);
	}

	/**
	 * Customer classification name 7 得意先分類名７.<p>
	 *
	 */
	public String bp_grp_nm7() {
		return bp_grp_p().bp_grp_nm7();
	}

	/**
	 * Customer classification name 7 得意先分類名７.<p>
	 *
	 */
	public void bp_grp_nm7(String value) {
		bp_grp_p().bp_grp_nm7(value);
	}

	/**
	 * Customer classification 8 得意先分類８.<p>
	 *
	 */
	public boolean bp_grp_flg8() {
		return bp_grp_p().bp_grp_flg8();
	}

	/**
	 * Customer classification 8 得意先分類８.<p>
	 *
	 */
	public void bp_grp_flg8(boolean value) {
		bp_grp_p().bp_grp_flg8(value);
	}

	/**
	 * Customer classification cd. 8 得意先分類ＣＤ８.<p>
	 *
	 */
	public String bp_grp_cd8() {
		return bp_grp_p().bp_grp_cd8();
	}

	/**
	 * Customer classification cd. 8 得意先分類ＣＤ８.<p>
	 *
	 */
	public void bp_grp_cd8(String value) {
		bp_grp_p().bp_grp_cd8(value);
	}

	/**
	 * Customer classification name 8 得意先分類名８.<p>
	 *
	 */
	public String bp_grp_nm8() {
		return bp_grp_p().bp_grp_nm8();
	}

	/**
	 * Customer classification name 8 得意先分類名８.<p>
	 *
	 */
	public void bp_grp_nm8(String value) {
		bp_grp_p().bp_grp_nm8(value);
	}

	/**
	 * Customer classification 9 得意先分類９.<p>
	 *
	 */
	public boolean bp_grp_flg9() {
		return bp_grp_p().bp_grp_flg9();
	}

	/**
	 * Customer classification 9 得意先分類９.<p>
	 *
	 */
	public void bp_grp_flg9(boolean value) {
		bp_grp_p().bp_grp_flg9(value);
	}

	/**
	 * Customer classification cd. 9 得意先分類ＣＤ９.<p>
	 *
	 */
	public String bp_grp_cd9() {
		return bp_grp_p().bp_grp_cd9();
	}

	/**
	 * Customer classification cd. 9 得意先分類ＣＤ９.<p>
	 *
	 */
	public void bp_grp_cd9(String value) {
		bp_grp_p().bp_grp_cd9(value);
	}

	/**
	 * Customer classification name 9 得意先分類名９.<p>
	 *
	 */
	public String bp_grp_nm9() {
		return bp_grp_p().bp_grp_nm9();
	}

	/**
	 * Customer classification name 9 得意先分類名９.<p>
	 *
	 */
	public void bp_grp_nm9(String value) {
		bp_grp_p().bp_grp_nm9(value);
	}

	/**
	 * Customer classification 10 得意先分類１０.<p>
	 *
	 */
	public boolean bp_grp_flg10() {
		return bp_grp_p().bp_grp_flg10();
	}

	/**
	 * Customer classification 10 得意先分類１０.<p>
	 *
	 */
	public void bp_grp_flg10(boolean value) {
		bp_grp_p().bp_grp_flg10(value);
	}

	/**
	 * Customer classification cd. 10 得意先分類ＣＤ１０.<p>
	 *
	 */
	public String bp_grp_cd10() {
		return bp_grp_p().bp_grp_cd10();
	}

	/**
	 * Customer classification cd. 10 得意先分類ＣＤ１０.<p>
	 *
	 */
	public void bp_grp_cd10(String value) {
		bp_grp_p().bp_grp_cd10(value);
	}

	/**
	 * Customer classification name 10 得意先分類名１０.<p>
	 *
	 */
	public String bp_grp_nm10() {
		return bp_grp_p().bp_grp_nm10();
	}

	/**
	 * Customer classification name 10 得意先分類名１０.<p>
	 *
	 */
	public void bp_grp_nm10(String value) {
		bp_grp_p().bp_grp_nm10(value);
	}

}

