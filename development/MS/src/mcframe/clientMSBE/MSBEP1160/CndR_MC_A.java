package mcframe.clientMSBE.MSBEP1160;

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
	 * UPD,Modify (Result),1;PRNT,Issue report,2;REF_ACT,View (Result),3;REF_SCHD,View (Schedule),4; UPD,訂正する（実績）,1;PRNT,帳票発行,2;REF_ACT,参照する（実績）,3;REF_SCHD,参照する（予定）,4;.<p>
	 *
	 */
	public static final String $ope = "ope";
	/**
	 * Supply 支給.<p>
	 *
	 */
	public static final String $prov = "prov";
	/**
	 * Return 返品.<p>
	 *
	 */
	public static final String $prov_rtn = "prov_rtn";
	/**
	 * Non-chargeable supply 無償支給.<p>
	 *
	 */
	public static final String $ffr_prov_flg = "ffr_prov_flg";
	/**
	 * Chargeable supply 有償支給.<p>
	 *
	 */
	public static final String $onr_prov_flg = "onr_prov_flg";
	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public static final String $subcon_flg = "subcon_flg";
	/**
	 * Not for subcontract 下請対象外.<p>
	 *
	 */
	public static final String $not_subcon_flg = "not_subcon_flg";
	/**
	 * Delivery note unissued 納品書未発行.<p>
	 *
	 */
	public static final String $dlv_not_prnted = "dlv_not_prnted";
	/**
	 * Delivery note issued 納品書発行済.<p>
	 *
	 */
	public static final String $dlv_prnted = "dlv_prnted";
	/**
	 * for EDI ＥＤＩ対象.対象.<p>
	 *
	 */
	public static final String $on_edi_flg = "on_edi_flg";
	/**
	 * Not for EDI ＥＤＩ対象.対象外.<p>
	 *
	 */
	public static final String $off_edi_flg = "off_edi_flg";
	/**
	 * Acceptance date FROM 検収日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $accpt_dt_fr = "accpt_dt_fr";
	/**
	 * Acceptance date TO 検収日ＴＯ.<p>
	 *
	 */
	public static final String $accpt_dt_to = "accpt_dt_to";
	/**
	 * Recording month FROM 計上年月ＦＲＯＭ.<p>
	 *
	 */
	public static final String $ac_ym_fr = "ac_ym_fr";
	/**
	 * Recording month TO 計上年月ＴＯ.<p>
	 *
	 */
	public static final String $ac_ym_to = "ac_ym_to";
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
	public static final String $arr_act_dt_p = "arr_act_dt_p";
	/**
	 * Scheduled acceptance date FROM 検収予定日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $accpt_schd_dt_fr = "accpt_schd_dt_fr";
	/**
	 * Scheduled acceptance date TO 検収予定日ＴＯ.<p>
	 *
	 */
	public static final String $accpt_schd_dt_to = "accpt_schd_dt_to";
	public static final String $arr_schd_dt_p = "arr_schd_dt_p";
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
	 * Subcontractor cd. 支給先ＣＤ.<p>
	 *
	 */
	public static final String $prsppl_cd = "prsppl_cd";
	/**
	 * Subcontractor name 支給先名.<p>
	 *
	 */
	public static final String $prsppl_nm = "prsppl_nm";
	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public static final String $ap_dpt_cd = "ap_dpt_cd";
	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public static final String $ap_dpt_nm = "ap_dpt_nm";
	/**
	 * Subcontractor location cd. 支給先場所ＣＤ.<p>
	 *
	 */
	public static final String $prsppl_loc_cd = "prsppl_loc_cd";
	/**
	 * Subcontractor location name 支給先場所名.<p>
	 *
	 */
	public static final String $prsppl_loc_nm = "prsppl_loc_nm";
	/**
	 * Subcontractor rack/line cd. 支給先棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $prsppl_str_ln_cd = "prsppl_str_ln_cd";
	/**
	 * Subcontractor rack/line name 支給先棚・ライン名.<p>
	 *
	 */
	public static final String $prsppl_str_ln_nm = "prsppl_str_ln_nm";
	/**
	 * Subcontractor WG cd. 支給先ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $prsppl_wg_cd = "prsppl_wg_cd";
	/**
	 * Subcontractor WG name 支給先ワーキンググループ名.<p>
	 *
	 */
	public static final String $prsppl_wg_nm = "prsppl_wg_nm";
	/**
	 * Subcontractor distribution group cd. 支給先物流グループＣＤ.<p>
	 *
	 */
	public static final String $prsppl_lg_grp_cd = "prsppl_lg_grp_cd";
	/**
	 * Subcontractor distribution group name 支給先物流グループ名.<p>
	 *
	 */
	public static final String $prsppl_lg_grp_nm = "prsppl_lg_grp_nm";
	/**
	 * Subcontractor factory/distribution warehouse cd. 支給先工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $prsppl_site_cd = "prsppl_site_cd";
	/**
	 * Subcontractor factory/distribution warehouse name 支給先工場・物流倉庫名.<p>
	 *
	 */
	public static final String $prsppl_site_nm = "prsppl_site_nm";
	public static final String $itm_typ_p = "itm_typ_p";
	public static final String $itm_p = "itm_p";
	public static final String $ver_no_p = "ver_no_p";
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
	public static final String $sno_wrk_no_p = "sno_wrk_no_p";
	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public static final String $gd_cd = "gd_cd";
	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public static final String $gd_nm = "gd_nm";
	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public static final String $stk_id_typ = "stk_id_typ";
	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public static final String $stk_id_typ_nm = "stk_id_typ_nm";
	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public static final String $prov_basis_typ = "prov_basis_typ";
	/**
	 * Supply recording type name 支給計上区分名.<p>
	 *
	 */
	public static final String $prov_basis_typ_nm = "prov_basis_typ_nm";
	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public static final String $dlv_slip_no = "dlv_slip_no";
	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public static final String $dlv_slip_d_no = "dlv_slip_d_no";
	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public static final String $trd_cur_nm = "trd_cur_nm";
	/**
	 * Foreign currency only 外貨のみ.<p>
	 *
	 */
	public static final String $foreign_flg = "foreign_flg";
	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public static final String $tax_cd = "tax_cd";
	/**
	 * Tax name 税名.<p>
	 *
	 */
	public static final String $tax_nm = "tax_nm";
	/**
	 * Supply-from result type 支給元実績区分.<p>
	 *
	 */
	public static final String $prov_src_act_typ = "prov_src_act_typ";
	/**
	 * Supply-from result type name 支給元実績区分名.<p>
	 *
	 */
	public static final String $prov_src_act_typ_nm = "prov_src_act_typ_nm";
	/**
	 * Supply-from result No. 支給元実績ＮＯ.<p>
	 *
	 */
	public static final String $prov_src_act_no = "prov_src_act_no";
	/**
	 * Supply result No. 支給実績ＮＯ.<p>
	 *
	 */
	public static final String $prov_act_no = "prov_act_no";
	/**
	 * Supply-from schedule type 支給元予定区分.<p>
	 *
	 */
	public static final String $prov_src_schd_typ = "prov_src_schd_typ";
	/**
	 * Supply-from schedule type name 支給元予定区分名.<p>
	 *
	 */
	public static final String $prov_src_schd_typ_nm = "prov_src_schd_typ_nm";
	/**
	 * Supply-from schedule No. 1 支給元予定ＮＯ１.<p>
	 *
	 */
	public static final String $prov_src_schd_no1 = "prov_src_schd_no1";
	/**
	 * Supply-from schedule No. 2 支給元予定ＮＯ２.<p>
	 *
	 */
	public static final String $prov_src_schd_no2 = "prov_src_schd_no2";
	/**
	 * Supply schedule No. 支給予定ＮＯ.<p>
	 *
	 */
	public static final String $prov_schd_no = "prov_schd_no";
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public static final String $trd_d_rmrks = "trd_d_rmrks";
	/**
	 * Internal remarks 内部備考.<p>
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
	/**
	 * Include invalid/cancel 無効・取消含む.<p>
	 *
	 */
	public static final String $dis_can_disp_flg = "dis_can_disp_flg";
	/**
	 * Reverse the sign of the return amount 返品金額の符号を反転する.<p>
	 *
	 */
	public static final String $sign_rev_flg = "sign_rev_flg";
	public static final String $prsppl_grp_p = "prsppl_grp_p";
	public static final String $itm_grp_p = "itm_grp_p";

	public static final String $arr_act_dt_fr = $arr_act_dt_p + ".ymd_fr";
	public static final String $arr_act_hm_fr = $arr_act_dt_p + ".hm_fr";
	public static final String $arr_act_dt_to = $arr_act_dt_p + ".ymd_to";
	public static final String $arr_act_hm_to = $arr_act_dt_p + ".hm_to";
	public static final String $arr_schd_dt_fr = $arr_schd_dt_p + ".ymd_fr";
	public static final String $arr_schd_hm_fr = $arr_schd_dt_p + ".hm_fr";
	public static final String $arr_schd_dt_to = $arr_schd_dt_p + ".ymd_to";
	public static final String $arr_schd_hm_to = $arr_schd_dt_p + ".hm_to";
	public static final String $itm_typ = $itm_typ_p + ".itm_typ";
	public static final String $itm_typ_nm = $itm_typ_p + ".itm_typ_nm";
	public static final String $itm_typ_d_cd = $itm_typ_p + ".itm_typ_d_cd";
	public static final String $itm_typ_d_nm = $itm_typ_p + ".itm_typ_d_nm";
	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $ver_no = $ver_no_p + ".ver_no";
	public static final String $sno1 = $sno_wrk_no_p + ".sno1";
	public static final String $sno2 = $sno_wrk_no_p + ".sno2";
	public static final String $sno3 = $sno_wrk_no_p + ".sno3";
	public static final String $sno4 = $sno_wrk_no_p + ".sno4";
	public static final String $wrk_no = $sno_wrk_no_p + ".wrk_no";
	public static final String $wrk_nm = $sno_wrk_no_p + ".wrk_nm";
	public static final String $prsppl_grp_lab1 = $prsppl_grp_p + ".bp_grp_lab1";
	public static final String $prsppl_grp_flg1 = $prsppl_grp_p + ".bp_grp_flg1";
	public static final String $prsppl_grp_cd1 = $prsppl_grp_p + ".bp_grp_cd1";
	public static final String $prsppl_grp_nm1 = $prsppl_grp_p + ".bp_grp_nm1";
	public static final String $prsppl_grp_lab2 = $prsppl_grp_p + ".bp_grp_lab2";
	public static final String $prsppl_grp_flg2 = $prsppl_grp_p + ".bp_grp_flg2";
	public static final String $prsppl_grp_cd2 = $prsppl_grp_p + ".bp_grp_cd2";
	public static final String $prsppl_grp_nm2 = $prsppl_grp_p + ".bp_grp_nm2";
	public static final String $prsppl_grp_lab3 = $prsppl_grp_p + ".bp_grp_lab3";
	public static final String $prsppl_grp_flg3 = $prsppl_grp_p + ".bp_grp_flg3";
	public static final String $prsppl_grp_cd3 = $prsppl_grp_p + ".bp_grp_cd3";
	public static final String $prsppl_grp_nm3 = $prsppl_grp_p + ".bp_grp_nm3";
	public static final String $prsppl_grp_lab4 = $prsppl_grp_p + ".bp_grp_lab4";
	public static final String $prsppl_grp_flg4 = $prsppl_grp_p + ".bp_grp_flg4";
	public static final String $prsppl_grp_cd4 = $prsppl_grp_p + ".bp_grp_cd4";
	public static final String $prsppl_grp_nm4 = $prsppl_grp_p + ".bp_grp_nm4";
	public static final String $prsppl_grp_lab5 = $prsppl_grp_p + ".bp_grp_lab5";
	public static final String $prsppl_grp_flg5 = $prsppl_grp_p + ".bp_grp_flg5";
	public static final String $prsppl_grp_cd5 = $prsppl_grp_p + ".bp_grp_cd5";
	public static final String $prsppl_grp_nm5 = $prsppl_grp_p + ".bp_grp_nm5";
	public static final String $prsppl_grp_lab6 = $prsppl_grp_p + ".bp_grp_lab6";
	public static final String $prsppl_grp_flg6 = $prsppl_grp_p + ".bp_grp_flg6";
	public static final String $prsppl_grp_cd6 = $prsppl_grp_p + ".bp_grp_cd6";
	public static final String $prsppl_grp_nm6 = $prsppl_grp_p + ".bp_grp_nm6";
	public static final String $prsppl_grp_lab7 = $prsppl_grp_p + ".bp_grp_lab7";
	public static final String $prsppl_grp_flg7 = $prsppl_grp_p + ".bp_grp_flg7";
	public static final String $prsppl_grp_cd7 = $prsppl_grp_p + ".bp_grp_cd7";
	public static final String $prsppl_grp_nm7 = $prsppl_grp_p + ".bp_grp_nm7";
	public static final String $prsppl_grp_lab8 = $prsppl_grp_p + ".bp_grp_lab8";
	public static final String $prsppl_grp_flg8 = $prsppl_grp_p + ".bp_grp_flg8";
	public static final String $prsppl_grp_cd8 = $prsppl_grp_p + ".bp_grp_cd8";
	public static final String $prsppl_grp_nm8 = $prsppl_grp_p + ".bp_grp_nm8";
	public static final String $prsppl_grp_lab9 = $prsppl_grp_p + ".bp_grp_lab9";
	public static final String $prsppl_grp_flg9 = $prsppl_grp_p + ".bp_grp_flg9";
	public static final String $prsppl_grp_cd9 = $prsppl_grp_p + ".bp_grp_cd9";
	public static final String $prsppl_grp_nm9 = $prsppl_grp_p + ".bp_grp_nm9";
	public static final String $prsppl_grp_lab10 = $prsppl_grp_p + ".bp_grp_lab10";
	public static final String $prsppl_grp_flg10 = $prsppl_grp_p + ".bp_grp_flg10";
	public static final String $prsppl_grp_cd10 = $prsppl_grp_p + ".bp_grp_cd10";
	public static final String $prsppl_grp_nm10 = $prsppl_grp_p + ".bp_grp_nm10";
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
	public static final MCMeta prov_META = createCommonMeta($prov, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prov_rtn_META = createCommonMeta($prov_rtn, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ffr_prov_flg_META = createCommonMeta($ffr_prov_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta onr_prov_flg_META = createCommonMeta($onr_prov_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta subcon_flg_META = createCommonMeta($subcon_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_subcon_flg_META = createCommonMeta($not_subcon_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_not_prnted_META = createCommonMeta($dlv_not_prnted, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_prnted_META = createCommonMeta($dlv_prnted, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta on_edi_flg_META = createCommonMeta($on_edi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta off_edi_flg_META = createCommonMeta($off_edi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta accpt_dt_fr_META = createCommonMeta($accpt_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta accpt_dt_to_META = createCommonMeta($accpt_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ac_ym_fr_META = createCommonMeta($ac_ym_fr, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta ac_ym_to_META = createCommonMeta($ac_ym_to, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta ac_dt_fr_META = createCommonMeta($ac_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ac_dt_to_META = createCommonMeta($ac_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta arr_act_dt_p_META = createInnerRowMeta($arr_act_dt_p, mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class);
	public static final MCMeta accpt_schd_dt_fr_META = createCommonMeta($accpt_schd_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta accpt_schd_dt_to_META = createCommonMeta($accpt_schd_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta arr_schd_dt_p_META = createInnerRowMeta($arr_schd_dt_p, mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_nm_META = createCommonMeta($trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta prsppl_cd_META = createCommonMeta($prsppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta prsppl_nm_META = createCommonMeta($prsppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta ap_dpt_cd_META = createCommonMeta($ap_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ap_dpt_nm_META = createCommonMeta($ap_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta prsppl_loc_cd_META = createCommonMeta($prsppl_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta prsppl_loc_nm_META = createCommonMeta($prsppl_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta prsppl_str_ln_cd_META = createCommonMeta($prsppl_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta prsppl_str_ln_nm_META = createCommonMeta($prsppl_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta prsppl_wg_cd_META = createCommonMeta($prsppl_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta prsppl_wg_nm_META = createCommonMeta($prsppl_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta prsppl_lg_grp_cd_META = createCommonMeta($prsppl_lg_grp_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta prsppl_lg_grp_nm_META = createCommonMeta($prsppl_lg_grp_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta prsppl_site_cd_META = createCommonMeta($prsppl_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta prsppl_site_nm_META = createCommonMeta($prsppl_site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta itm_typ_p_META = createInnerRowMeta($itm_typ_p, mcframe.clientMAUB.MAUBP0100.ItmTypR.class);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta ver_no_p_META = createInnerRowMeta($ver_no_p, mcframe.clientMAUB.MAUBP0340.VerNoR.class);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sno_wrk_no_p_META = createInnerRowMeta($sno_wrk_no_p, mcframe.clientMSUB.MSUBP0020.SnoWrkNoR.class);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta gd_nm_META = createCommonMeta($gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta stk_id_typ_META = createCommonMeta($stk_id_typ, mcframe.commonMS.meta.MS_META.STK_ID_TYP);
	public static final MCMeta stk_id_typ_nm_META = createCommonMeta($stk_id_typ_nm, mcframe.commonMS.meta.MS_META.STK_ID_TYP_NM);
	public static final MCMeta prov_basis_typ_META = createCommonMeta($prov_basis_typ, mcframe.commonMA.meta.MA_META.PROV_BASIS_TYP);
	public static final MCMeta prov_basis_typ_nm_META = createCommonMeta($prov_basis_typ_nm, mcframe.commonMA.meta.MA_META.PROV_BASIS_TYP_NM);
	public static final MCMeta dlv_slip_no_META = createCommonMeta($dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta dlv_slip_d_no_META = createCommonMeta($dlv_slip_d_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_D_NO);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta foreign_flg_META = createCommonMeta($foreign_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tax_cd_META = createCommonMeta($tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta tax_nm_META = createCommonMeta($tax_nm, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta prov_src_act_typ_META = createCommonMeta($prov_src_act_typ, mcframe.commonMS.meta.MS_META.PROV_SRC_ACT_TYP);
	public static final MCMeta prov_src_act_typ_nm_META = createCommonMeta($prov_src_act_typ_nm, mcframe.commonMS.meta.MS_META.PROV_SRC_ACT_TYP_NM);
	public static final MCMeta prov_src_act_no_META = createCommonMeta($prov_src_act_no, mcframe.commonMA.meta.MA_META.PROV_SRC_ACT_NO);
	public static final MCMeta prov_act_no_META = createCommonMeta($prov_act_no, mcframe.commonMA.meta.MA_META.PROV_ACT_NO);
	public static final MCMeta prov_src_schd_typ_META = createCommonMeta($prov_src_schd_typ, mcframe.commonMS.meta.MS_META.PROV_SRC_SCHD_TYP);
	public static final MCMeta prov_src_schd_typ_nm_META = createCommonMeta($prov_src_schd_typ_nm, mcframe.commonMS.meta.MS_META.PROV_SRC_SCHD_TYP_NM);
	public static final MCMeta prov_src_schd_no1_META = createCommonMeta($prov_src_schd_no1, mcframe.commonMA.meta.MA_META.PROV_SRC_SCHD_NO);
	public static final MCMeta prov_src_schd_no2_META = createCommonMeta($prov_src_schd_no2, mcframe.commonMA.meta.MA_META.PROV_SRC_SCHD_NO);
	public static final MCMeta prov_schd_no_META = createCommonMeta($prov_schd_no, mcframe.commonMA.meta.MA_META.PROV_SCHD_NO);
	public static final MCMeta trd_d_rmrks_META = createCommonMeta($trd_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.PROV_ACT_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.PROV_ACT_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.PROV_ACT_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.PROV_ACT_SUB_CHAR3);
	public static final MCMeta dis_can_disp_flg_META = createCommonMeta($dis_can_disp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sign_rev_flg_META = createCommonMeta($sign_rev_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prsppl_grp_p_META = createInnerRowMeta($prsppl_grp_p, mcframe.clientMAUB.MAUBP0260.BpGrpR.class);
	public static final MCMeta itm_grp_p_META = createInnerRowMeta($itm_grp_p, mcframe.clientMAUB.MAUBP0250.ItmGrpR.class);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			prov_META,
			prov_rtn_META,
			ffr_prov_flg_META,
			onr_prov_flg_META,
			subcon_flg_META,
			not_subcon_flg_META,
			dlv_not_prnted_META,
			dlv_prnted_META,
			on_edi_flg_META,
			off_edi_flg_META,
			accpt_dt_fr_META,
			accpt_dt_to_META,
			ac_ym_fr_META,
			ac_ym_to_META,
			ac_dt_fr_META,
			ac_dt_to_META,
			arr_act_dt_p_META,
			accpt_schd_dt_fr_META,
			accpt_schd_dt_to_META,
			arr_schd_dt_p_META,
			trd_cd_META,
			trd_nm_META,
			prsppl_cd_META,
			prsppl_nm_META,
			ap_dpt_cd_META,
			ap_dpt_nm_META,
			prsppl_loc_cd_META,
			prsppl_loc_nm_META,
			prsppl_str_ln_cd_META,
			prsppl_str_ln_nm_META,
			prsppl_wg_cd_META,
			prsppl_wg_nm_META,
			prsppl_lg_grp_cd_META,
			prsppl_lg_grp_nm_META,
			prsppl_site_cd_META,
			prsppl_site_nm_META,
			itm_typ_p_META,
			itm_p_META,
			ver_no_p_META,
			lot_no_META,
			sublot_no_META,
			sno_wrk_no_p_META,
			gd_cd_META,
			gd_nm_META,
			stk_id_typ_META,
			stk_id_typ_nm_META,
			prov_basis_typ_META,
			prov_basis_typ_nm_META,
			dlv_slip_no_META,
			dlv_slip_d_no_META,
			trd_cur_cd_META,
			trd_cur_nm_META,
			foreign_flg_META,
			tax_cd_META,
			tax_nm_META,
			prov_src_act_typ_META,
			prov_src_act_typ_nm_META,
			prov_src_act_no_META,
			prov_act_no_META,
			prov_src_schd_typ_META,
			prov_src_schd_typ_nm_META,
			prov_src_schd_no1_META,
			prov_src_schd_no2_META,
			prov_schd_no_META,
			trd_d_rmrks_META,
			intr_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			dis_can_disp_flg_META,
			sign_rev_flg_META,
			prsppl_grp_p_META,
			itm_grp_p_META
		},
		new String[][]{
			{
				"arr_act_dt_fr",
				"arr_act_hm_fr",
				"arr_act_dt_to",
				"arr_act_hm_to",
				"arr_schd_dt_fr",
				"arr_schd_hm_fr",
				"arr_schd_dt_to",
				"arr_schd_hm_to",
				"itm_typ",
				"itm_typ_nm",
				"itm_typ_d_cd",
				"itm_typ_d_nm",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"ver_no",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"wrk_no",
				"wrk_nm",
				"prsppl_grp_flg1",
				"prsppl_grp_cd1",
				"prsppl_grp_nm1",
				"prsppl_grp_flg2",
				"prsppl_grp_cd2",
				"prsppl_grp_nm2",
				"prsppl_grp_flg3",
				"prsppl_grp_cd3",
				"prsppl_grp_nm3",
				"prsppl_grp_flg4",
				"prsppl_grp_cd4",
				"prsppl_grp_nm4",
				"prsppl_grp_flg5",
				"prsppl_grp_cd5",
				"prsppl_grp_nm5",
				"prsppl_grp_flg6",
				"prsppl_grp_cd6",
				"prsppl_grp_nm6",
				"prsppl_grp_flg7",
				"prsppl_grp_cd7",
				"prsppl_grp_nm7",
				"prsppl_grp_flg8",
				"prsppl_grp_cd8",
				"prsppl_grp_nm8",
				"prsppl_grp_flg9",
				"prsppl_grp_cd9",
				"prsppl_grp_nm9",
				"prsppl_grp_flg10",
				"prsppl_grp_cd10",
				"prsppl_grp_nm10",
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
				$arr_act_dt_fr,
				$arr_act_hm_fr,
				$arr_act_dt_to,
				$arr_act_hm_to,
				$arr_schd_dt_fr,
				$arr_schd_hm_fr,
				$arr_schd_dt_to,
				$arr_schd_hm_to,
				$itm_typ,
				$itm_typ_nm,
				$itm_typ_d_cd,
				$itm_typ_d_nm,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$ver_no,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$wrk_no,
				$wrk_nm,
				$prsppl_grp_flg1,
				$prsppl_grp_cd1,
				$prsppl_grp_nm1,
				$prsppl_grp_flg2,
				$prsppl_grp_cd2,
				$prsppl_grp_nm2,
				$prsppl_grp_flg3,
				$prsppl_grp_cd3,
				$prsppl_grp_nm3,
				$prsppl_grp_flg4,
				$prsppl_grp_cd4,
				$prsppl_grp_nm4,
				$prsppl_grp_flg5,
				$prsppl_grp_cd5,
				$prsppl_grp_nm5,
				$prsppl_grp_flg6,
				$prsppl_grp_cd6,
				$prsppl_grp_nm6,
				$prsppl_grp_flg7,
				$prsppl_grp_cd7,
				$prsppl_grp_nm7,
				$prsppl_grp_flg8,
				$prsppl_grp_cd8,
				$prsppl_grp_nm8,
				$prsppl_grp_flg9,
				$prsppl_grp_cd9,
				$prsppl_grp_nm9,
				$prsppl_grp_flg10,
				$prsppl_grp_cd10,
				$prsppl_grp_nm10,
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
				{$prsppl_cd, "bp_nm"},	// prsppl_cd
				{$ap_dpt_cd, "dpt_nm"},	// ap_dpt_cd
				{$prsppl_loc_cd, "loc_nm"},	// prsppl_loc_cd
				{$prsppl_str_ln_cd, "str_ln_nm"},	// prsppl_str_ln_cd
				{$prsppl_wg_cd, "wg_nm"},	// prsppl_wg_cd
				{$prsppl_lg_grp_cd, "lg_grp_nm"},	// prsppl_lg_grp_cd
				{$prsppl_site_cd, "site_nm"},	// prsppl_site_cd
				{$prov_basis_typ, "prov_basis_typ_nm"},	// prov_basis_typ
				{$trd_cur_cd, "cur_nm"},	// trd_cur_cd
				{$prov_src_act_typ, "prov_src_act_typ_nm"},	// prov_src_act_typ
				{$prov_src_schd_typ, "prov_src_schd_typ_nm"}	// prov_src_schd_typ
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$prsppl_cd, "MAC_BP_IS_SRCH_TYP.SPPL"},	// prsppl_cd
				{$ap_dpt_cd, "true;true;MAC_DPT_IS_SRCH_TYP.AP"},	// ap_dpt_cd
				{$prsppl_loc_cd, "MAC_LOC_IS_SRCH_TYP.OUTSIDE"},	// prsppl_loc_cd
				{$prsppl_str_ln_cd, "arr_loc_cd;true"},	// prsppl_str_ln_cd
				{$itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;true"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "itm_cd;MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;true"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "itm_cd;itm_sub1;MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;true"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "itm_cd;itm_sub1;itm_sub2;MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;true"},	// itm_p.itm_sub3
				{$lot_no, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// lot_no
				{$sublot_no, "itm_cd;itm_sub1;itm_sub2;itm_sub3;lot_no"}	// sublot_no
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$prsppl_cd, "bp_is_srch_typ"},	// prsppl_cd
				{$ap_dpt_cd, "dpt_nm_rem_flg;mode_today_flg;dpt_is_srch_typ"},	// ap_dpt_cd
				{$prsppl_loc_cd, "loc_is_srch_typ"},	// prsppl_loc_cd
				{$prsppl_str_ln_cd, "loc_cd;mode_nullval_flg"},	// prsppl_str_ln_cd
				{$itm_p + ".itm_cd", "itm_is_srch_typ;sundry_itm_nm_rem_flg"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "itm_cd;itm_is_srch_typ;sundry_itm_nm_rem_flg"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "itm_cd;itm_sub1;itm_is_srch_typ;sundry_itm_nm_rem_flg"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "itm_cd;itm_sub1;itm_sub2;itm_is_srch_typ;sundry_itm_nm_rem_flg"},	// itm_p.itm_sub3
				{$lot_no, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// lot_no
				{$sublot_no, "itm_cd;itm_sub1;itm_sub2;itm_sub3;lot_no"}	// sublot_no
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$prsppl_str_ln_cd, "STR_LN"},	// prsppl_str_ln_cd
				{$prsppl_str_ln_nm, "STR_LN"},	// prsppl_str_ln_nm
				{$prsppl_wg_cd, "WG"},	// prsppl_wg_cd
				{$prsppl_wg_nm, "WG"},	// prsppl_wg_nm
				{$prsppl_lg_grp_cd, "LG_GRP"},	// prsppl_lg_grp_cd
				{$prsppl_lg_grp_nm, "LG_GRP"},	// prsppl_lg_grp_nm
				{$prsppl_site_cd, "SITE"},	// prsppl_site_cd
				{$prsppl_site_nm, "SITE"},	// prsppl_site_nm
				{$gd_cd, "STK_GD"},	// gd_cd
				{$gd_nm, "STK_GD"}	// gd_nm
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
	 * UPD,Modify (Result),1;PRNT,Issue report,2;REF_ACT,View (Result),3;REF_SCHD,View (Schedule),4; UPD,訂正する（実績）,1;PRNT,帳票発行,2;REF_ACT,参照する（実績）,3;REF_SCHD,参照する（予定）,4;.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * UPD,Modify (Result),1;PRNT,Issue report,2;REF_ACT,View (Result),3;REF_SCHD,View (Schedule),4; UPD,訂正する（実績）,1;PRNT,帳票発行,2;REF_ACT,参照する（実績）,3;REF_SCHD,参照する（予定）,4;.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	/**
	 * Supply 支給.<p>
	 *
	 */
	public boolean prov() {
		return getConstBoolean(offset + 1, $prov);
	}

	/**
	 * Supply 支給.<p>
	 *
	 */
	public void prov(boolean value) {
		setConstBoolean(offset + 1, $prov, value);
	}


	/**
	 * Return 返品.<p>
	 *
	 */
	public boolean prov_rtn() {
		return getConstBoolean(offset + 2, $prov_rtn);
	}

	/**
	 * Return 返品.<p>
	 *
	 */
	public void prov_rtn(boolean value) {
		setConstBoolean(offset + 2, $prov_rtn, value);
	}


	/**
	 * Non-chargeable supply 無償支給.<p>
	 *
	 */
	public boolean ffr_prov_flg() {
		return getConstBoolean(offset + 3, $ffr_prov_flg);
	}

	/**
	 * Non-chargeable supply 無償支給.<p>
	 *
	 */
	public void ffr_prov_flg(boolean value) {
		setConstBoolean(offset + 3, $ffr_prov_flg, value);
	}


	/**
	 * Chargeable supply 有償支給.<p>
	 *
	 */
	public boolean onr_prov_flg() {
		return getConstBoolean(offset + 4, $onr_prov_flg);
	}

	/**
	 * Chargeable supply 有償支給.<p>
	 *
	 */
	public void onr_prov_flg(boolean value) {
		setConstBoolean(offset + 4, $onr_prov_flg, value);
	}


	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public boolean subcon_flg() {
		return getConstBoolean(offset + 5, $subcon_flg);
	}

	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public void subcon_flg(boolean value) {
		setConstBoolean(offset + 5, $subcon_flg, value);
	}


	/**
	 * Not for subcontract 下請対象外.<p>
	 *
	 */
	public boolean not_subcon_flg() {
		return getConstBoolean(offset + 6, $not_subcon_flg);
	}

	/**
	 * Not for subcontract 下請対象外.<p>
	 *
	 */
	public void not_subcon_flg(boolean value) {
		setConstBoolean(offset + 6, $not_subcon_flg, value);
	}


	/**
	 * Delivery note unissued 納品書未発行.<p>
	 *
	 */
	public boolean dlv_not_prnted() {
		return getConstBoolean(offset + 7, $dlv_not_prnted);
	}

	/**
	 * Delivery note unissued 納品書未発行.<p>
	 *
	 */
	public void dlv_not_prnted(boolean value) {
		setConstBoolean(offset + 7, $dlv_not_prnted, value);
	}


	/**
	 * Delivery note issued 納品書発行済.<p>
	 *
	 */
	public boolean dlv_prnted() {
		return getConstBoolean(offset + 8, $dlv_prnted);
	}

	/**
	 * Delivery note issued 納品書発行済.<p>
	 *
	 */
	public void dlv_prnted(boolean value) {
		setConstBoolean(offset + 8, $dlv_prnted, value);
	}


	/**
	 * for EDI ＥＤＩ対象.対象.<p>
	 *
	 */
	public boolean on_edi_flg() {
		return getConstBoolean(offset + 9, $on_edi_flg);
	}

	/**
	 * for EDI ＥＤＩ対象.対象.<p>
	 *
	 */
	public void on_edi_flg(boolean value) {
		setConstBoolean(offset + 9, $on_edi_flg, value);
	}


	/**
	 * Not for EDI ＥＤＩ対象.対象外.<p>
	 *
	 */
	public boolean off_edi_flg() {
		return getConstBoolean(offset + 10, $off_edi_flg);
	}

	/**
	 * Not for EDI ＥＤＩ対象.対象外.<p>
	 *
	 */
	public void off_edi_flg(boolean value) {
		setConstBoolean(offset + 10, $off_edi_flg, value);
	}


	/**
	 * Acceptance date FROM 検収日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate accpt_dt_fr() {
		return getConstDate(offset + 11, $accpt_dt_fr);
	}

	/**
	 * Acceptance date FROM 検収日ＦＲＯＭ.<p>
	 *
	 */
	public void accpt_dt_fr(MCDate value) {
		setConstDate(offset + 11, $accpt_dt_fr, value);
	}


	/**
	 * Acceptance date TO 検収日ＴＯ.<p>
	 *
	 */
	public MCDate accpt_dt_to() {
		return getConstDate(offset + 12, $accpt_dt_to);
	}

	/**
	 * Acceptance date TO 検収日ＴＯ.<p>
	 *
	 */
	public void accpt_dt_to(MCDate value) {
		setConstDate(offset + 12, $accpt_dt_to, value);
	}


	/**
	 * Recording month FROM 計上年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ac_ym_fr() {
		return getConstDate(offset + 13, $ac_ym_fr);
	}

	/**
	 * Recording month FROM 計上年月ＦＲＯＭ.<p>
	 *
	 */
	public void ac_ym_fr(MCDate value) {
		setConstDate(offset + 13, $ac_ym_fr, value);
	}


	/**
	 * Recording month TO 計上年月ＴＯ.<p>
	 *
	 */
	public MCDate ac_ym_to() {
		return getConstDate(offset + 14, $ac_ym_to);
	}

	/**
	 * Recording month TO 計上年月ＴＯ.<p>
	 *
	 */
	public void ac_ym_to(MCDate value) {
		setConstDate(offset + 14, $ac_ym_to, value);
	}


	/**
	 * Recording date FROM 計上日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ac_dt_fr() {
		return getConstDate(offset + 15, $ac_dt_fr);
	}

	/**
	 * Recording date FROM 計上日ＦＲＯＭ.<p>
	 *
	 */
	public void ac_dt_fr(MCDate value) {
		setConstDate(offset + 15, $ac_dt_fr, value);
	}


	/**
	 * Recording date TO 計上日ＴＯ.<p>
	 *
	 */
	public MCDate ac_dt_to() {
		return getConstDate(offset + 16, $ac_dt_to);
	}

	/**
	 * Recording date TO 計上日ＴＯ.<p>
	 *
	 */
	public void ac_dt_to(MCDate value) {
		setConstDate(offset + 16, $ac_dt_to, value);
	}


	public mcframe.clientMAUB.MAUBP0400.YmdHmFrToR arr_act_dt_p(){
		return (mcframe.clientMAUB.MAUBP0400.YmdHmFrToR) getConstInnerRow(offset + 17, $arr_act_dt_p);
	}
	
	public void arr_act_dt_p(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR row){
		setConstInnerRow(offset + 17, $arr_act_dt_p, row);
	}


	/**
	 * Scheduled acceptance date FROM 検収予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate accpt_schd_dt_fr() {
		return getConstDate(offset + 18, $accpt_schd_dt_fr);
	}

	/**
	 * Scheduled acceptance date FROM 検収予定日ＦＲＯＭ.<p>
	 *
	 */
	public void accpt_schd_dt_fr(MCDate value) {
		setConstDate(offset + 18, $accpt_schd_dt_fr, value);
	}


	/**
	 * Scheduled acceptance date TO 検収予定日ＴＯ.<p>
	 *
	 */
	public MCDate accpt_schd_dt_to() {
		return getConstDate(offset + 19, $accpt_schd_dt_to);
	}

	/**
	 * Scheduled acceptance date TO 検収予定日ＴＯ.<p>
	 *
	 */
	public void accpt_schd_dt_to(MCDate value) {
		setConstDate(offset + 19, $accpt_schd_dt_to, value);
	}


	public mcframe.clientMAUB.MAUBP0400.YmdHmFrToR arr_schd_dt_p(){
		return (mcframe.clientMAUB.MAUBP0400.YmdHmFrToR) getConstInnerRow(offset + 20, $arr_schd_dt_p);
	}
	
	public void arr_schd_dt_p(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR row){
		setConstInnerRow(offset + 20, $arr_schd_dt_p, row);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 21, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 21, $trd_cd, value);
	}


	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 22, $trd_nm);
	}

	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 22, $trd_nm, value);
	}


	/**
	 * Subcontractor cd. 支給先ＣＤ.<p>
	 *
	 */
	public String prsppl_cd() {
		return getConstString(offset + 23, $prsppl_cd);
	}

	/**
	 * Subcontractor cd. 支給先ＣＤ.<p>
	 *
	 */
	public void prsppl_cd(String value) {
		setConstString(offset + 23, $prsppl_cd, value);
	}


	/**
	 * Subcontractor name 支給先名.<p>
	 *
	 */
	public String prsppl_nm() {
		return getConstString(offset + 24, $prsppl_nm);
	}

	/**
	 * Subcontractor name 支給先名.<p>
	 *
	 */
	public void prsppl_nm(String value) {
		setConstString(offset + 24, $prsppl_nm, value);
	}


	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public String ap_dpt_cd() {
		return getConstString(offset + 25, $ap_dpt_cd);
	}

	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public void ap_dpt_cd(String value) {
		setConstString(offset + 25, $ap_dpt_cd, value);
	}


	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public String ap_dpt_nm() {
		return getConstString(offset + 26, $ap_dpt_nm);
	}

	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public void ap_dpt_nm(String value) {
		setConstString(offset + 26, $ap_dpt_nm, value);
	}


	/**
	 * Subcontractor location cd. 支給先場所ＣＤ.<p>
	 *
	 */
	public String prsppl_loc_cd() {
		return getConstString(offset + 27, $prsppl_loc_cd);
	}

	/**
	 * Subcontractor location cd. 支給先場所ＣＤ.<p>
	 *
	 */
	public void prsppl_loc_cd(String value) {
		setConstString(offset + 27, $prsppl_loc_cd, value);
	}


	/**
	 * Subcontractor location name 支給先場所名.<p>
	 *
	 */
	public String prsppl_loc_nm() {
		return getConstString(offset + 28, $prsppl_loc_nm);
	}

	/**
	 * Subcontractor location name 支給先場所名.<p>
	 *
	 */
	public void prsppl_loc_nm(String value) {
		setConstString(offset + 28, $prsppl_loc_nm, value);
	}


	/**
	 * Subcontractor rack/line cd. 支給先棚・ラインＣＤ.<p>
	 *
	 */
	public String prsppl_str_ln_cd() {
		return getConstString(offset + 29, $prsppl_str_ln_cd);
	}

	/**
	 * Subcontractor rack/line cd. 支給先棚・ラインＣＤ.<p>
	 *
	 */
	public void prsppl_str_ln_cd(String value) {
		setConstString(offset + 29, $prsppl_str_ln_cd, value);
	}


	/**
	 * Subcontractor rack/line name 支給先棚・ライン名.<p>
	 *
	 */
	public String prsppl_str_ln_nm() {
		return getConstString(offset + 30, $prsppl_str_ln_nm);
	}

	/**
	 * Subcontractor rack/line name 支給先棚・ライン名.<p>
	 *
	 */
	public void prsppl_str_ln_nm(String value) {
		setConstString(offset + 30, $prsppl_str_ln_nm, value);
	}


	/**
	 * Subcontractor WG cd. 支給先ワーキンググループＣＤ.<p>
	 *
	 */
	public String prsppl_wg_cd() {
		return getConstString(offset + 31, $prsppl_wg_cd);
	}

	/**
	 * Subcontractor WG cd. 支給先ワーキンググループＣＤ.<p>
	 *
	 */
	public void prsppl_wg_cd(String value) {
		setConstString(offset + 31, $prsppl_wg_cd, value);
	}


	/**
	 * Subcontractor WG name 支給先ワーキンググループ名.<p>
	 *
	 */
	public String prsppl_wg_nm() {
		return getConstString(offset + 32, $prsppl_wg_nm);
	}

	/**
	 * Subcontractor WG name 支給先ワーキンググループ名.<p>
	 *
	 */
	public void prsppl_wg_nm(String value) {
		setConstString(offset + 32, $prsppl_wg_nm, value);
	}


	/**
	 * Subcontractor distribution group cd. 支給先物流グループＣＤ.<p>
	 *
	 */
	public String prsppl_lg_grp_cd() {
		return getConstString(offset + 33, $prsppl_lg_grp_cd);
	}

	/**
	 * Subcontractor distribution group cd. 支給先物流グループＣＤ.<p>
	 *
	 */
	public void prsppl_lg_grp_cd(String value) {
		setConstString(offset + 33, $prsppl_lg_grp_cd, value);
	}


	/**
	 * Subcontractor distribution group name 支給先物流グループ名.<p>
	 *
	 */
	public String prsppl_lg_grp_nm() {
		return getConstString(offset + 34, $prsppl_lg_grp_nm);
	}

	/**
	 * Subcontractor distribution group name 支給先物流グループ名.<p>
	 *
	 */
	public void prsppl_lg_grp_nm(String value) {
		setConstString(offset + 34, $prsppl_lg_grp_nm, value);
	}


	/**
	 * Subcontractor factory/distribution warehouse cd. 支給先工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String prsppl_site_cd() {
		return getConstString(offset + 35, $prsppl_site_cd);
	}

	/**
	 * Subcontractor factory/distribution warehouse cd. 支給先工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void prsppl_site_cd(String value) {
		setConstString(offset + 35, $prsppl_site_cd, value);
	}


	/**
	 * Subcontractor factory/distribution warehouse name 支給先工場・物流倉庫名.<p>
	 *
	 */
	public String prsppl_site_nm() {
		return getConstString(offset + 36, $prsppl_site_nm);
	}

	/**
	 * Subcontractor factory/distribution warehouse name 支給先工場・物流倉庫名.<p>
	 *
	 */
	public void prsppl_site_nm(String value) {
		setConstString(offset + 36, $prsppl_site_nm, value);
	}


	public mcframe.clientMAUB.MAUBP0100.ItmTypR itm_typ_p(){
		return (mcframe.clientMAUB.MAUBP0100.ItmTypR) getConstInnerRow(offset + 37, $itm_typ_p);
	}
	
	public void itm_typ_p(mcframe.clientMAUB.MAUBP0100.ItmTypR row){
		setConstInnerRow(offset + 37, $itm_typ_p, row);
	}


	public mcframe.clientMAUB.MAUBP0030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 38, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 38, $itm_p, row);
	}


	public mcframe.clientMAUB.MAUBP0340.VerNoR ver_no_p(){
		return (mcframe.clientMAUB.MAUBP0340.VerNoR) getConstInnerRow(offset + 39, $ver_no_p);
	}
	
	public void ver_no_p(mcframe.clientMAUB.MAUBP0340.VerNoR row){
		setConstInnerRow(offset + 39, $ver_no_p, row);
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


	public mcframe.clientMSUB.MSUBP0020.SnoWrkNoR sno_wrk_no_p(){
		return (mcframe.clientMSUB.MSUBP0020.SnoWrkNoR) getConstInnerRow(offset + 42, $sno_wrk_no_p);
	}
	
	public void sno_wrk_no_p(mcframe.clientMSUB.MSUBP0020.SnoWrkNoR row){
		setConstInnerRow(offset + 42, $sno_wrk_no_p, row);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 43, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 43, $gd_cd, value);
	}


	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 44, $gd_nm);
	}

	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 44, $gd_nm, value);
	}


	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return getConstString(offset + 45, $stk_id_typ);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		setConstString(offset + 45, $stk_id_typ, value);
	}


	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public String stk_id_typ_nm() {
		return getConstString(offset + 46, $stk_id_typ_nm);
	}

	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public void stk_id_typ_nm(String value) {
		setConstString(offset + 46, $stk_id_typ_nm, value);
	}


	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public String prov_basis_typ() {
		return getConstString(offset + 47, $prov_basis_typ);
	}

	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public void prov_basis_typ(String value) {
		setConstString(offset + 47, $prov_basis_typ, value);
	}


	/**
	 * Supply recording type name 支給計上区分名.<p>
	 *
	 */
	public String prov_basis_typ_nm() {
		return getConstString(offset + 48, $prov_basis_typ_nm);
	}

	/**
	 * Supply recording type name 支給計上区分名.<p>
	 *
	 */
	public void prov_basis_typ_nm(String value) {
		setConstString(offset + 48, $prov_basis_typ_nm, value);
	}


	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public String dlv_slip_no() {
		return getConstString(offset + 49, $dlv_slip_no);
	}

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public void dlv_slip_no(String value) {
		setConstString(offset + 49, $dlv_slip_no, value);
	}


	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public String dlv_slip_d_no() {
		return getConstString(offset + 50, $dlv_slip_d_no);
	}

	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public void dlv_slip_d_no(String value) {
		setConstString(offset + 50, $dlv_slip_d_no, value);
	}


	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 51, $trd_cur_cd);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 51, $trd_cur_cd, value);
	}


	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 52, $trd_cur_nm);
	}

	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 52, $trd_cur_nm, value);
	}


	/**
	 * Foreign currency only 外貨のみ.<p>
	 *
	 */
	public boolean foreign_flg() {
		return getConstBoolean(offset + 53, $foreign_flg);
	}

	/**
	 * Foreign currency only 外貨のみ.<p>
	 *
	 */
	public void foreign_flg(boolean value) {
		setConstBoolean(offset + 53, $foreign_flg, value);
	}


	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public String tax_cd() {
		return getConstString(offset + 54, $tax_cd);
	}

	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public void tax_cd(String value) {
		setConstString(offset + 54, $tax_cd, value);
	}


	/**
	 * Tax name 税名.<p>
	 *
	 */
	public String tax_nm() {
		return getConstString(offset + 55, $tax_nm);
	}

	/**
	 * Tax name 税名.<p>
	 *
	 */
	public void tax_nm(String value) {
		setConstString(offset + 55, $tax_nm, value);
	}


	/**
	 * Supply-from result type 支給元実績区分.<p>
	 *
	 */
	public String prov_src_act_typ() {
		return getConstString(offset + 56, $prov_src_act_typ);
	}

	/**
	 * Supply-from result type 支給元実績区分.<p>
	 *
	 */
	public void prov_src_act_typ(String value) {
		setConstString(offset + 56, $prov_src_act_typ, value);
	}


	/**
	 * Supply-from result type name 支給元実績区分名.<p>
	 *
	 */
	public String prov_src_act_typ_nm() {
		return getConstString(offset + 57, $prov_src_act_typ_nm);
	}

	/**
	 * Supply-from result type name 支給元実績区分名.<p>
	 *
	 */
	public void prov_src_act_typ_nm(String value) {
		setConstString(offset + 57, $prov_src_act_typ_nm, value);
	}


	/**
	 * Supply-from result No. 支給元実績ＮＯ.<p>
	 *
	 */
	public String prov_src_act_no() {
		return getConstString(offset + 58, $prov_src_act_no);
	}

	/**
	 * Supply-from result No. 支給元実績ＮＯ.<p>
	 *
	 */
	public void prov_src_act_no(String value) {
		setConstString(offset + 58, $prov_src_act_no, value);
	}


	/**
	 * Supply result No. 支給実績ＮＯ.<p>
	 *
	 */
	public String prov_act_no() {
		return getConstString(offset + 59, $prov_act_no);
	}

	/**
	 * Supply result No. 支給実績ＮＯ.<p>
	 *
	 */
	public void prov_act_no(String value) {
		setConstString(offset + 59, $prov_act_no, value);
	}


	/**
	 * Supply-from schedule type 支給元予定区分.<p>
	 *
	 */
	public String prov_src_schd_typ() {
		return getConstString(offset + 60, $prov_src_schd_typ);
	}

	/**
	 * Supply-from schedule type 支給元予定区分.<p>
	 *
	 */
	public void prov_src_schd_typ(String value) {
		setConstString(offset + 60, $prov_src_schd_typ, value);
	}


	/**
	 * Supply-from schedule type name 支給元予定区分名.<p>
	 *
	 */
	public String prov_src_schd_typ_nm() {
		return getConstString(offset + 61, $prov_src_schd_typ_nm);
	}

	/**
	 * Supply-from schedule type name 支給元予定区分名.<p>
	 *
	 */
	public void prov_src_schd_typ_nm(String value) {
		setConstString(offset + 61, $prov_src_schd_typ_nm, value);
	}


	/**
	 * Supply-from schedule No. 1 支給元予定ＮＯ１.<p>
	 *
	 */
	public String prov_src_schd_no1() {
		return getConstString(offset + 62, $prov_src_schd_no1);
	}

	/**
	 * Supply-from schedule No. 1 支給元予定ＮＯ１.<p>
	 *
	 */
	public void prov_src_schd_no1(String value) {
		setConstString(offset + 62, $prov_src_schd_no1, value);
	}


	/**
	 * Supply-from schedule No. 2 支給元予定ＮＯ２.<p>
	 *
	 */
	public String prov_src_schd_no2() {
		return getConstString(offset + 63, $prov_src_schd_no2);
	}

	/**
	 * Supply-from schedule No. 2 支給元予定ＮＯ２.<p>
	 *
	 */
	public void prov_src_schd_no2(String value) {
		setConstString(offset + 63, $prov_src_schd_no2, value);
	}


	/**
	 * Supply schedule No. 支給予定ＮＯ.<p>
	 *
	 */
	public String prov_schd_no() {
		return getConstString(offset + 64, $prov_schd_no);
	}

	/**
	 * Supply schedule No. 支給予定ＮＯ.<p>
	 *
	 */
	public void prov_schd_no(String value) {
		setConstString(offset + 64, $prov_schd_no, value);
	}


	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return getConstString(offset + 65, $trd_d_rmrks);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		setConstString(offset + 65, $trd_d_rmrks, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 66, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 66, $intr_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 67, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 67, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 68, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 68, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 69, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 69, $sub_char3, value);
	}


	/**
	 * Include invalid/cancel 無効・取消含む.<p>
	 *
	 */
	public boolean dis_can_disp_flg() {
		return getConstBoolean(offset + 70, $dis_can_disp_flg);
	}

	/**
	 * Include invalid/cancel 無効・取消含む.<p>
	 *
	 */
	public void dis_can_disp_flg(boolean value) {
		setConstBoolean(offset + 70, $dis_can_disp_flg, value);
	}


	/**
	 * Reverse the sign of the return amount 返品金額の符号を反転する.<p>
	 *
	 */
	public boolean sign_rev_flg() {
		return getConstBoolean(offset + 71, $sign_rev_flg);
	}

	/**
	 * Reverse the sign of the return amount 返品金額の符号を反転する.<p>
	 *
	 */
	public void sign_rev_flg(boolean value) {
		setConstBoolean(offset + 71, $sign_rev_flg, value);
	}


	public mcframe.clientMAUB.MAUBP0260.BpGrpR prsppl_grp_p(){
		return (mcframe.clientMAUB.MAUBP0260.BpGrpR) getConstInnerRow(offset + 72, $prsppl_grp_p);
	}
	
	public void prsppl_grp_p(mcframe.clientMAUB.MAUBP0260.BpGrpR row){
		setConstInnerRow(offset + 72, $prsppl_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP0250.ItmGrpR itm_grp_p(){
		return (mcframe.clientMAUB.MAUBP0250.ItmGrpR) getConstInnerRow(offset + 73, $itm_grp_p);
	}
	
	public void itm_grp_p(mcframe.clientMAUB.MAUBP0250.ItmGrpR row){
		setConstInnerRow(offset + 73, $itm_grp_p, row);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($prsppl_cd.equalsIgnoreCase(name)) {
			return prsppl_cd();
		}
		if ($prsppl_nm.equalsIgnoreCase(name)) {
			return prsppl_nm();
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			return ap_dpt_nm();
		}
		if ($prsppl_loc_cd.equalsIgnoreCase(name)) {
			return prsppl_loc_cd();
		}
		if ($prsppl_loc_nm.equalsIgnoreCase(name)) {
			return prsppl_loc_nm();
		}
		if ($prsppl_str_ln_cd.equalsIgnoreCase(name)) {
			return prsppl_str_ln_cd();
		}
		if ($prsppl_str_ln_nm.equalsIgnoreCase(name)) {
			return prsppl_str_ln_nm();
		}
		if ($prsppl_wg_cd.equalsIgnoreCase(name)) {
			return prsppl_wg_cd();
		}
		if ($prsppl_wg_nm.equalsIgnoreCase(name)) {
			return prsppl_wg_nm();
		}
		if ($prsppl_lg_grp_cd.equalsIgnoreCase(name)) {
			return prsppl_lg_grp_cd();
		}
		if ($prsppl_lg_grp_nm.equalsIgnoreCase(name)) {
			return prsppl_lg_grp_nm();
		}
		if ($prsppl_site_cd.equalsIgnoreCase(name)) {
			return prsppl_site_cd();
		}
		if ($prsppl_site_nm.equalsIgnoreCase(name)) {
			return prsppl_site_nm();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			return stk_id_typ();
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			return stk_id_typ_nm();
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			return prov_basis_typ();
		}
		if ($prov_basis_typ_nm.equalsIgnoreCase(name)) {
			return prov_basis_typ_nm();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_d_no();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			return tax_nm();
		}
		if ($prov_src_act_typ.equalsIgnoreCase(name)) {
			return prov_src_act_typ();
		}
		if ($prov_src_act_typ_nm.equalsIgnoreCase(name)) {
			return prov_src_act_typ_nm();
		}
		if ($prov_src_act_no.equalsIgnoreCase(name)) {
			return prov_src_act_no();
		}
		if ($prov_act_no.equalsIgnoreCase(name)) {
			return prov_act_no();
		}
		if ($prov_src_schd_typ.equalsIgnoreCase(name)) {
			return prov_src_schd_typ();
		}
		if ($prov_src_schd_typ_nm.equalsIgnoreCase(name)) {
			return prov_src_schd_typ_nm();
		}
		if ($prov_src_schd_no1.equalsIgnoreCase(name)) {
			return prov_src_schd_no1();
		}
		if ($prov_src_schd_no2.equalsIgnoreCase(name)) {
			return prov_src_schd_no2();
		}
		if ($prov_schd_no.equalsIgnoreCase(name)) {
			return prov_schd_no();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
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
		if ($accpt_dt_fr.equalsIgnoreCase(name)) {
			return accpt_dt_fr();
		}
		if ($accpt_dt_to.equalsIgnoreCase(name)) {
			return accpt_dt_to();
		}
		if ($ac_ym_fr.equalsIgnoreCase(name)) {
			return ac_ym_fr();
		}
		if ($ac_ym_to.equalsIgnoreCase(name)) {
			return ac_ym_to();
		}
		if ($ac_dt_fr.equalsIgnoreCase(name)) {
			return ac_dt_fr();
		}
		if ($ac_dt_to.equalsIgnoreCase(name)) {
			return ac_dt_to();
		}
		if ($accpt_schd_dt_fr.equalsIgnoreCase(name)) {
			return accpt_schd_dt_fr();
		}
		if ($accpt_schd_dt_to.equalsIgnoreCase(name)) {
			return accpt_schd_dt_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($prov.equalsIgnoreCase(name)) {
			return prov();
		}
		if ($prov_rtn.equalsIgnoreCase(name)) {
			return prov_rtn();
		}
		if ($ffr_prov_flg.equalsIgnoreCase(name)) {
			return ffr_prov_flg();
		}
		if ($onr_prov_flg.equalsIgnoreCase(name)) {
			return onr_prov_flg();
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			return subcon_flg();
		}
		if ($not_subcon_flg.equalsIgnoreCase(name)) {
			return not_subcon_flg();
		}
		if ($dlv_not_prnted.equalsIgnoreCase(name)) {
			return dlv_not_prnted();
		}
		if ($dlv_prnted.equalsIgnoreCase(name)) {
			return dlv_prnted();
		}
		if ($on_edi_flg.equalsIgnoreCase(name)) {
			return on_edi_flg();
		}
		if ($off_edi_flg.equalsIgnoreCase(name)) {
			return off_edi_flg();
		}
		if ($foreign_flg.equalsIgnoreCase(name)) {
			return foreign_flg();
		}
		if ($dis_can_disp_flg.equalsIgnoreCase(name)) {
			return dis_can_disp_flg();
		}
		if ($sign_rev_flg.equalsIgnoreCase(name)) {
			return sign_rev_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($prsppl_cd.equalsIgnoreCase(name)) {
			return prsppl_cd();
		}
		if ($prsppl_nm.equalsIgnoreCase(name)) {
			return prsppl_nm();
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			return ap_dpt_nm();
		}
		if ($prsppl_loc_cd.equalsIgnoreCase(name)) {
			return prsppl_loc_cd();
		}
		if ($prsppl_loc_nm.equalsIgnoreCase(name)) {
			return prsppl_loc_nm();
		}
		if ($prsppl_str_ln_cd.equalsIgnoreCase(name)) {
			return prsppl_str_ln_cd();
		}
		if ($prsppl_str_ln_nm.equalsIgnoreCase(name)) {
			return prsppl_str_ln_nm();
		}
		if ($prsppl_wg_cd.equalsIgnoreCase(name)) {
			return prsppl_wg_cd();
		}
		if ($prsppl_wg_nm.equalsIgnoreCase(name)) {
			return prsppl_wg_nm();
		}
		if ($prsppl_lg_grp_cd.equalsIgnoreCase(name)) {
			return prsppl_lg_grp_cd();
		}
		if ($prsppl_lg_grp_nm.equalsIgnoreCase(name)) {
			return prsppl_lg_grp_nm();
		}
		if ($prsppl_site_cd.equalsIgnoreCase(name)) {
			return prsppl_site_cd();
		}
		if ($prsppl_site_nm.equalsIgnoreCase(name)) {
			return prsppl_site_nm();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			return stk_id_typ();
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			return stk_id_typ_nm();
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			return prov_basis_typ();
		}
		if ($prov_basis_typ_nm.equalsIgnoreCase(name)) {
			return prov_basis_typ_nm();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_d_no();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			return tax_nm();
		}
		if ($prov_src_act_typ.equalsIgnoreCase(name)) {
			return prov_src_act_typ();
		}
		if ($prov_src_act_typ_nm.equalsIgnoreCase(name)) {
			return prov_src_act_typ_nm();
		}
		if ($prov_src_act_no.equalsIgnoreCase(name)) {
			return prov_src_act_no();
		}
		if ($prov_act_no.equalsIgnoreCase(name)) {
			return prov_act_no();
		}
		if ($prov_src_schd_typ.equalsIgnoreCase(name)) {
			return prov_src_schd_typ();
		}
		if ($prov_src_schd_typ_nm.equalsIgnoreCase(name)) {
			return prov_src_schd_typ_nm();
		}
		if ($prov_src_schd_no1.equalsIgnoreCase(name)) {
			return prov_src_schd_no1();
		}
		if ($prov_src_schd_no2.equalsIgnoreCase(name)) {
			return prov_src_schd_no2();
		}
		if ($prov_schd_no.equalsIgnoreCase(name)) {
			return prov_schd_no();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
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
		if ($accpt_dt_fr.equalsIgnoreCase(name)) {
			return accpt_dt_fr();
		}
		if ($accpt_dt_to.equalsIgnoreCase(name)) {
			return accpt_dt_to();
		}
		if ($ac_ym_fr.equalsIgnoreCase(name)) {
			return ac_ym_fr();
		}
		if ($ac_ym_to.equalsIgnoreCase(name)) {
			return ac_ym_to();
		}
		if ($ac_dt_fr.equalsIgnoreCase(name)) {
			return ac_dt_fr();
		}
		if ($ac_dt_to.equalsIgnoreCase(name)) {
			return ac_dt_to();
		}
		if ($accpt_schd_dt_fr.equalsIgnoreCase(name)) {
			return accpt_schd_dt_fr();
		}
		if ($accpt_schd_dt_to.equalsIgnoreCase(name)) {
			return accpt_schd_dt_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($prov.equalsIgnoreCase(name)) {
			return prov();
		}
		if ($prov_rtn.equalsIgnoreCase(name)) {
			return prov_rtn();
		}
		if ($ffr_prov_flg.equalsIgnoreCase(name)) {
			return ffr_prov_flg();
		}
		if ($onr_prov_flg.equalsIgnoreCase(name)) {
			return onr_prov_flg();
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			return subcon_flg();
		}
		if ($not_subcon_flg.equalsIgnoreCase(name)) {
			return not_subcon_flg();
		}
		if ($dlv_not_prnted.equalsIgnoreCase(name)) {
			return dlv_not_prnted();
		}
		if ($dlv_prnted.equalsIgnoreCase(name)) {
			return dlv_prnted();
		}
		if ($on_edi_flg.equalsIgnoreCase(name)) {
			return on_edi_flg();
		}
		if ($off_edi_flg.equalsIgnoreCase(name)) {
			return off_edi_flg();
		}
		if ($foreign_flg.equalsIgnoreCase(name)) {
			return foreign_flg();
		}
		if ($dis_can_disp_flg.equalsIgnoreCase(name)) {
			return dis_can_disp_flg();
		}
		if ($sign_rev_flg.equalsIgnoreCase(name)) {
			return sign_rev_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
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
		if ($prsppl_cd.equalsIgnoreCase(name)) {
			prsppl_cd(value);
			return;
		}
		if ($prsppl_nm.equalsIgnoreCase(name)) {
			prsppl_nm(value);
			return;
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			ap_dpt_cd(value);
			return;
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			ap_dpt_nm(value);
			return;
		}
		if ($prsppl_loc_cd.equalsIgnoreCase(name)) {
			prsppl_loc_cd(value);
			return;
		}
		if ($prsppl_loc_nm.equalsIgnoreCase(name)) {
			prsppl_loc_nm(value);
			return;
		}
		if ($prsppl_str_ln_cd.equalsIgnoreCase(name)) {
			prsppl_str_ln_cd(value);
			return;
		}
		if ($prsppl_str_ln_nm.equalsIgnoreCase(name)) {
			prsppl_str_ln_nm(value);
			return;
		}
		if ($prsppl_wg_cd.equalsIgnoreCase(name)) {
			prsppl_wg_cd(value);
			return;
		}
		if ($prsppl_wg_nm.equalsIgnoreCase(name)) {
			prsppl_wg_nm(value);
			return;
		}
		if ($prsppl_lg_grp_cd.equalsIgnoreCase(name)) {
			prsppl_lg_grp_cd(value);
			return;
		}
		if ($prsppl_lg_grp_nm.equalsIgnoreCase(name)) {
			prsppl_lg_grp_nm(value);
			return;
		}
		if ($prsppl_site_cd.equalsIgnoreCase(name)) {
			prsppl_site_cd(value);
			return;
		}
		if ($prsppl_site_nm.equalsIgnoreCase(name)) {
			prsppl_site_nm(value);
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
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
			return;
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			stk_id_typ(value);
			return;
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			stk_id_typ_nm(value);
			return;
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			prov_basis_typ(value);
			return;
		}
		if ($prov_basis_typ_nm.equalsIgnoreCase(name)) {
			prov_basis_typ_nm(value);
			return;
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			dlv_slip_d_no(value);
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
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			tax_nm(value);
			return;
		}
		if ($prov_src_act_typ.equalsIgnoreCase(name)) {
			prov_src_act_typ(value);
			return;
		}
		if ($prov_src_act_typ_nm.equalsIgnoreCase(name)) {
			prov_src_act_typ_nm(value);
			return;
		}
		if ($prov_src_act_no.equalsIgnoreCase(name)) {
			prov_src_act_no(value);
			return;
		}
		if ($prov_act_no.equalsIgnoreCase(name)) {
			prov_act_no(value);
			return;
		}
		if ($prov_src_schd_typ.equalsIgnoreCase(name)) {
			prov_src_schd_typ(value);
			return;
		}
		if ($prov_src_schd_typ_nm.equalsIgnoreCase(name)) {
			prov_src_schd_typ_nm(value);
			return;
		}
		if ($prov_src_schd_no1.equalsIgnoreCase(name)) {
			prov_src_schd_no1(value);
			return;
		}
		if ($prov_src_schd_no2.equalsIgnoreCase(name)) {
			prov_src_schd_no2(value);
			return;
		}
		if ($prov_schd_no.equalsIgnoreCase(name)) {
			prov_schd_no(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
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
		if ($accpt_dt_fr.equalsIgnoreCase(name)) {
			accpt_dt_fr(value);
			return;
		}
		if ($accpt_dt_to.equalsIgnoreCase(name)) {
			accpt_dt_to(value);
			return;
		}
		if ($ac_ym_fr.equalsIgnoreCase(name)) {
			ac_ym_fr(value);
			return;
		}
		if ($ac_ym_to.equalsIgnoreCase(name)) {
			ac_ym_to(value);
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
		if ($accpt_schd_dt_fr.equalsIgnoreCase(name)) {
			accpt_schd_dt_fr(value);
			return;
		}
		if ($accpt_schd_dt_to.equalsIgnoreCase(name)) {
			accpt_schd_dt_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($prov.equalsIgnoreCase(name)) {
			prov(value);
			return;
		}
		if ($prov_rtn.equalsIgnoreCase(name)) {
			prov_rtn(value);
			return;
		}
		if ($ffr_prov_flg.equalsIgnoreCase(name)) {
			ffr_prov_flg(value);
			return;
		}
		if ($onr_prov_flg.equalsIgnoreCase(name)) {
			onr_prov_flg(value);
			return;
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			subcon_flg(value);
			return;
		}
		if ($not_subcon_flg.equalsIgnoreCase(name)) {
			not_subcon_flg(value);
			return;
		}
		if ($dlv_not_prnted.equalsIgnoreCase(name)) {
			dlv_not_prnted(value);
			return;
		}
		if ($dlv_prnted.equalsIgnoreCase(name)) {
			dlv_prnted(value);
			return;
		}
		if ($on_edi_flg.equalsIgnoreCase(name)) {
			on_edi_flg(value);
			return;
		}
		if ($off_edi_flg.equalsIgnoreCase(name)) {
			off_edi_flg(value);
			return;
		}
		if ($foreign_flg.equalsIgnoreCase(name)) {
			foreign_flg(value);
			return;
		}
		if ($dis_can_disp_flg.equalsIgnoreCase(name)) {
			dis_can_disp_flg(value);
			return;
		}
		if ($sign_rev_flg.equalsIgnoreCase(name)) {
			sign_rev_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
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
		if ($prsppl_cd.equalsIgnoreCase(name)) {
			prsppl_cd(value);
			return;
		}
		if ($prsppl_nm.equalsIgnoreCase(name)) {
			prsppl_nm(value);
			return;
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			ap_dpt_cd(value);
			return;
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			ap_dpt_nm(value);
			return;
		}
		if ($prsppl_loc_cd.equalsIgnoreCase(name)) {
			prsppl_loc_cd(value);
			return;
		}
		if ($prsppl_loc_nm.equalsIgnoreCase(name)) {
			prsppl_loc_nm(value);
			return;
		}
		if ($prsppl_str_ln_cd.equalsIgnoreCase(name)) {
			prsppl_str_ln_cd(value);
			return;
		}
		if ($prsppl_str_ln_nm.equalsIgnoreCase(name)) {
			prsppl_str_ln_nm(value);
			return;
		}
		if ($prsppl_wg_cd.equalsIgnoreCase(name)) {
			prsppl_wg_cd(value);
			return;
		}
		if ($prsppl_wg_nm.equalsIgnoreCase(name)) {
			prsppl_wg_nm(value);
			return;
		}
		if ($prsppl_lg_grp_cd.equalsIgnoreCase(name)) {
			prsppl_lg_grp_cd(value);
			return;
		}
		if ($prsppl_lg_grp_nm.equalsIgnoreCase(name)) {
			prsppl_lg_grp_nm(value);
			return;
		}
		if ($prsppl_site_cd.equalsIgnoreCase(name)) {
			prsppl_site_cd(value);
			return;
		}
		if ($prsppl_site_nm.equalsIgnoreCase(name)) {
			prsppl_site_nm(value);
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
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
			return;
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			stk_id_typ(value);
			return;
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			stk_id_typ_nm(value);
			return;
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			prov_basis_typ(value);
			return;
		}
		if ($prov_basis_typ_nm.equalsIgnoreCase(name)) {
			prov_basis_typ_nm(value);
			return;
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			dlv_slip_d_no(value);
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
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			tax_nm(value);
			return;
		}
		if ($prov_src_act_typ.equalsIgnoreCase(name)) {
			prov_src_act_typ(value);
			return;
		}
		if ($prov_src_act_typ_nm.equalsIgnoreCase(name)) {
			prov_src_act_typ_nm(value);
			return;
		}
		if ($prov_src_act_no.equalsIgnoreCase(name)) {
			prov_src_act_no(value);
			return;
		}
		if ($prov_act_no.equalsIgnoreCase(name)) {
			prov_act_no(value);
			return;
		}
		if ($prov_src_schd_typ.equalsIgnoreCase(name)) {
			prov_src_schd_typ(value);
			return;
		}
		if ($prov_src_schd_typ_nm.equalsIgnoreCase(name)) {
			prov_src_schd_typ_nm(value);
			return;
		}
		if ($prov_src_schd_no1.equalsIgnoreCase(name)) {
			prov_src_schd_no1(value);
			return;
		}
		if ($prov_src_schd_no2.equalsIgnoreCase(name)) {
			prov_src_schd_no2(value);
			return;
		}
		if ($prov_schd_no.equalsIgnoreCase(name)) {
			prov_schd_no(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
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
		if ($accpt_dt_fr.equalsIgnoreCase(name)) {
			accpt_dt_fr(value);
			return;
		}
		if ($accpt_dt_to.equalsIgnoreCase(name)) {
			accpt_dt_to(value);
			return;
		}
		if ($ac_ym_fr.equalsIgnoreCase(name)) {
			ac_ym_fr(value);
			return;
		}
		if ($ac_ym_to.equalsIgnoreCase(name)) {
			ac_ym_to(value);
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
		if ($accpt_schd_dt_fr.equalsIgnoreCase(name)) {
			accpt_schd_dt_fr(value);
			return;
		}
		if ($accpt_schd_dt_to.equalsIgnoreCase(name)) {
			accpt_schd_dt_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($prov.equalsIgnoreCase(name)) {
			prov(value);
			return;
		}
		if ($prov_rtn.equalsIgnoreCase(name)) {
			prov_rtn(value);
			return;
		}
		if ($ffr_prov_flg.equalsIgnoreCase(name)) {
			ffr_prov_flg(value);
			return;
		}
		if ($onr_prov_flg.equalsIgnoreCase(name)) {
			onr_prov_flg(value);
			return;
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			subcon_flg(value);
			return;
		}
		if ($not_subcon_flg.equalsIgnoreCase(name)) {
			not_subcon_flg(value);
			return;
		}
		if ($dlv_not_prnted.equalsIgnoreCase(name)) {
			dlv_not_prnted(value);
			return;
		}
		if ($dlv_prnted.equalsIgnoreCase(name)) {
			dlv_prnted(value);
			return;
		}
		if ($on_edi_flg.equalsIgnoreCase(name)) {
			on_edi_flg(value);
			return;
		}
		if ($off_edi_flg.equalsIgnoreCase(name)) {
			off_edi_flg(value);
			return;
		}
		if ($foreign_flg.equalsIgnoreCase(name)) {
			foreign_flg(value);
			return;
		}
		if ($dis_can_disp_flg.equalsIgnoreCase(name)) {
			dis_can_disp_flg(value);
			return;
		}
		if ($sign_rev_flg.equalsIgnoreCase(name)) {
			sign_rev_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($arr_act_dt_p.equalsIgnoreCase(name)) {
			return arr_act_dt_p();
		}
		if ($arr_schd_dt_p.equalsIgnoreCase(name)) {
			return arr_schd_dt_p();
		}
		if ($itm_typ_p.equalsIgnoreCase(name)) {
			return itm_typ_p();
		}
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($ver_no_p.equalsIgnoreCase(name)) {
			return ver_no_p();
		}
		if ($sno_wrk_no_p.equalsIgnoreCase(name)) {
			return sno_wrk_no_p();
		}
		if ($prsppl_grp_p.equalsIgnoreCase(name)) {
			return prsppl_grp_p();
		}
		if ($itm_grp_p.equalsIgnoreCase(name)) {
			return itm_grp_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($arr_act_dt_p.equalsIgnoreCase(name)) {
			arr_act_dt_p(
				((MCContainerMeta) arr_act_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class, value)
			);
			return;
		}
		if ($arr_schd_dt_p.equalsIgnoreCase(name)) {
			arr_schd_dt_p(
				((MCContainerMeta) arr_schd_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class, value)
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
		if ($ver_no_p.equalsIgnoreCase(name)) {
			ver_no_p(
				((MCContainerMeta) ver_no_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0340.VerNoR.class, value)
			);
			return;
		}
		if ($sno_wrk_no_p.equalsIgnoreCase(name)) {
			sno_wrk_no_p(
				((MCContainerMeta) sno_wrk_no_p_META).castInnerRow(mcframe.clientMSUB.MSUBP0020.SnoWrkNoR.class, value)
			);
			return;
		}
		if ($prsppl_grp_p.equalsIgnoreCase(name)) {
			prsppl_grp_p(
				((MCContainerMeta) prsppl_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0260.BpGrpR.class, value)
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
	 * Actual receipt date FROM 入荷実績日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate arr_act_dt_fr() {
		return arr_act_dt_p().ymd_fr();
	}

	/**
	 * Actual receipt date FROM 入荷実績日ＦＲＯＭ.<p>
	 *
	 */
	public void arr_act_dt_fr(MCDate value) {
		arr_act_dt_p().ymd_fr(value);
	}

	/**
	 * Actual receipt time FROM 入荷実績時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate arr_act_hm_fr() {
		return arr_act_dt_p().hm_fr();
	}

	/**
	 * Actual receipt time FROM 入荷実績時刻ＦＲＯＭ.<p>
	 *
	 */
	public void arr_act_hm_fr(MCDate value) {
		arr_act_dt_p().hm_fr(value);
	}

	/**
	 * Actual receipt date TO 入荷実績日ＴＯ.<p>
	 *
	 */
	public MCDate arr_act_dt_to() {
		return arr_act_dt_p().ymd_to();
	}

	/**
	 * Actual receipt date TO 入荷実績日ＴＯ.<p>
	 *
	 */
	public void arr_act_dt_to(MCDate value) {
		arr_act_dt_p().ymd_to(value);
	}

	/**
	 * Actual receipt time TO 入荷実績時刻ＴＯ.<p>
	 *
	 */
	public MCDate arr_act_hm_to() {
		return arr_act_dt_p().hm_to();
	}

	/**
	 * Actual receipt time TO 入荷実績時刻ＴＯ.<p>
	 *
	 */
	public void arr_act_hm_to(MCDate value) {
		arr_act_dt_p().hm_to(value);
	}

	/**
	 * Scheduled receipt date FROM 入荷予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate arr_schd_dt_fr() {
		return arr_schd_dt_p().ymd_fr();
	}

	/**
	 * Scheduled receipt date FROM 入荷予定日ＦＲＯＭ.<p>
	 *
	 */
	public void arr_schd_dt_fr(MCDate value) {
		arr_schd_dt_p().ymd_fr(value);
	}

	/**
	 * Receipt schedule time FROM 入荷予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate arr_schd_hm_fr() {
		return arr_schd_dt_p().hm_fr();
	}

	/**
	 * Receipt schedule time FROM 入荷予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public void arr_schd_hm_fr(MCDate value) {
		arr_schd_dt_p().hm_fr(value);
	}

	/**
	 * Scheduled receipt date TO 入荷予定日ＴＯ.<p>
	 *
	 */
	public MCDate arr_schd_dt_to() {
		return arr_schd_dt_p().ymd_to();
	}

	/**
	 * Scheduled receipt date TO 入荷予定日ＴＯ.<p>
	 *
	 */
	public void arr_schd_dt_to(MCDate value) {
		arr_schd_dt_p().ymd_to(value);
	}

	/**
	 * Receipt schedule time TO 入荷予定時刻ＴＯ.<p>
	 *
	 */
	public MCDate arr_schd_hm_to() {
		return arr_schd_dt_p().hm_to();
	}

	/**
	 * Receipt schedule time TO 入荷予定時刻ＴＯ.<p>
	 *
	 */
	public void arr_schd_hm_to(MCDate value) {
		arr_schd_dt_p().hm_to(value);
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

	public String ver_no() {
		return ver_no_p().ver_no();
	}

	public void ver_no(String value) {
		ver_no_p().ver_no(value);
	}

	public String sno1() {
		return sno_wrk_no_p().sno1();
	}

	public void sno1(String value) {
		sno_wrk_no_p().sno1(value);
	}

	public String sno2() {
		return sno_wrk_no_p().sno2();
	}

	public void sno2(String value) {
		sno_wrk_no_p().sno2(value);
	}

	public String sno3() {
		return sno_wrk_no_p().sno3();
	}

	public void sno3(String value) {
		sno_wrk_no_p().sno3(value);
	}

	public String sno4() {
		return sno_wrk_no_p().sno4();
	}

	public void sno4(String value) {
		sno_wrk_no_p().sno4(value);
	}

	public String wrk_no() {
		return sno_wrk_no_p().wrk_no();
	}

	public void wrk_no(String value) {
		sno_wrk_no_p().wrk_no(value);
	}

	public String wrk_nm() {
		return sno_wrk_no_p().wrk_nm();
	}

	public void wrk_nm(String value) {
		sno_wrk_no_p().wrk_nm(value);
	}

	/**
	 * Subcontractor classification 1 支給先分類１.<p>
	 *
	 */
	public boolean prsppl_grp_flg1() {
		return prsppl_grp_p().bp_grp_flg1();
	}

	/**
	 * Subcontractor classification 1 支給先分類１.<p>
	 *
	 */
	public void prsppl_grp_flg1(boolean value) {
		prsppl_grp_p().bp_grp_flg1(value);
	}

	/**
	 * Subcontractor classification cd. 1 支給先分類ＣＤ１.<p>
	 *
	 */
	public String prsppl_grp_cd1() {
		return prsppl_grp_p().bp_grp_cd1();
	}

	/**
	 * Subcontractor classification cd. 1 支給先分類ＣＤ１.<p>
	 *
	 */
	public void prsppl_grp_cd1(String value) {
		prsppl_grp_p().bp_grp_cd1(value);
	}

	/**
	 * Subcontractor classification name 1 支給先分類名１.<p>
	 *
	 */
	public String prsppl_grp_nm1() {
		return prsppl_grp_p().bp_grp_nm1();
	}

	/**
	 * Subcontractor classification name 1 支給先分類名１.<p>
	 *
	 */
	public void prsppl_grp_nm1(String value) {
		prsppl_grp_p().bp_grp_nm1(value);
	}

	/**
	 * Subcontractor classification 2 支給先分類２.<p>
	 *
	 */
	public boolean prsppl_grp_flg2() {
		return prsppl_grp_p().bp_grp_flg2();
	}

	/**
	 * Subcontractor classification 2 支給先分類２.<p>
	 *
	 */
	public void prsppl_grp_flg2(boolean value) {
		prsppl_grp_p().bp_grp_flg2(value);
	}

	/**
	 * Subcontractor classification cd. 2 支給先分類ＣＤ２.<p>
	 *
	 */
	public String prsppl_grp_cd2() {
		return prsppl_grp_p().bp_grp_cd2();
	}

	/**
	 * Subcontractor classification cd. 2 支給先分類ＣＤ２.<p>
	 *
	 */
	public void prsppl_grp_cd2(String value) {
		prsppl_grp_p().bp_grp_cd2(value);
	}

	/**
	 * Subcontractor classification name 2 支給先分類名２.<p>
	 *
	 */
	public String prsppl_grp_nm2() {
		return prsppl_grp_p().bp_grp_nm2();
	}

	/**
	 * Subcontractor classification name 2 支給先分類名２.<p>
	 *
	 */
	public void prsppl_grp_nm2(String value) {
		prsppl_grp_p().bp_grp_nm2(value);
	}

	/**
	 * Subcontractor classification 3 支給先分類３.<p>
	 *
	 */
	public boolean prsppl_grp_flg3() {
		return prsppl_grp_p().bp_grp_flg3();
	}

	/**
	 * Subcontractor classification 3 支給先分類３.<p>
	 *
	 */
	public void prsppl_grp_flg3(boolean value) {
		prsppl_grp_p().bp_grp_flg3(value);
	}

	/**
	 * Subcontractor classification cd. 3 支給先分類ＣＤ３.<p>
	 *
	 */
	public String prsppl_grp_cd3() {
		return prsppl_grp_p().bp_grp_cd3();
	}

	/**
	 * Subcontractor classification cd. 3 支給先分類ＣＤ３.<p>
	 *
	 */
	public void prsppl_grp_cd3(String value) {
		prsppl_grp_p().bp_grp_cd3(value);
	}

	/**
	 * Subcontractor classification name 3 支給先分類名３.<p>
	 *
	 */
	public String prsppl_grp_nm3() {
		return prsppl_grp_p().bp_grp_nm3();
	}

	/**
	 * Subcontractor classification name 3 支給先分類名３.<p>
	 *
	 */
	public void prsppl_grp_nm3(String value) {
		prsppl_grp_p().bp_grp_nm3(value);
	}

	/**
	 * Subcontractor classification 4 支給先分類４.<p>
	 *
	 */
	public boolean prsppl_grp_flg4() {
		return prsppl_grp_p().bp_grp_flg4();
	}

	/**
	 * Subcontractor classification 4 支給先分類４.<p>
	 *
	 */
	public void prsppl_grp_flg4(boolean value) {
		prsppl_grp_p().bp_grp_flg4(value);
	}

	/**
	 * Subcontractor classification cd. 4 支給先分類ＣＤ４.<p>
	 *
	 */
	public String prsppl_grp_cd4() {
		return prsppl_grp_p().bp_grp_cd4();
	}

	/**
	 * Subcontractor classification cd. 4 支給先分類ＣＤ４.<p>
	 *
	 */
	public void prsppl_grp_cd4(String value) {
		prsppl_grp_p().bp_grp_cd4(value);
	}

	/**
	 * Subcontractor classification name 4 支給先分類名４.<p>
	 *
	 */
	public String prsppl_grp_nm4() {
		return prsppl_grp_p().bp_grp_nm4();
	}

	/**
	 * Subcontractor classification name 4 支給先分類名４.<p>
	 *
	 */
	public void prsppl_grp_nm4(String value) {
		prsppl_grp_p().bp_grp_nm4(value);
	}

	/**
	 * Subcontractor classification 5 支給先分類５.<p>
	 *
	 */
	public boolean prsppl_grp_flg5() {
		return prsppl_grp_p().bp_grp_flg5();
	}

	/**
	 * Subcontractor classification 5 支給先分類５.<p>
	 *
	 */
	public void prsppl_grp_flg5(boolean value) {
		prsppl_grp_p().bp_grp_flg5(value);
	}

	/**
	 * Subcontractor classification cd. 5 支給先分類ＣＤ５.<p>
	 *
	 */
	public String prsppl_grp_cd5() {
		return prsppl_grp_p().bp_grp_cd5();
	}

	/**
	 * Subcontractor classification cd. 5 支給先分類ＣＤ５.<p>
	 *
	 */
	public void prsppl_grp_cd5(String value) {
		prsppl_grp_p().bp_grp_cd5(value);
	}

	/**
	 * Subcontractor classification name 5 支給先分類名５.<p>
	 *
	 */
	public String prsppl_grp_nm5() {
		return prsppl_grp_p().bp_grp_nm5();
	}

	/**
	 * Subcontractor classification name 5 支給先分類名５.<p>
	 *
	 */
	public void prsppl_grp_nm5(String value) {
		prsppl_grp_p().bp_grp_nm5(value);
	}

	/**
	 * Subcontractor classification 6 支給先分類６.<p>
	 *
	 */
	public boolean prsppl_grp_flg6() {
		return prsppl_grp_p().bp_grp_flg6();
	}

	/**
	 * Subcontractor classification 6 支給先分類６.<p>
	 *
	 */
	public void prsppl_grp_flg6(boolean value) {
		prsppl_grp_p().bp_grp_flg6(value);
	}

	/**
	 * Subcontractor classification cd. 6 支給先分類ＣＤ６.<p>
	 *
	 */
	public String prsppl_grp_cd6() {
		return prsppl_grp_p().bp_grp_cd6();
	}

	/**
	 * Subcontractor classification cd. 6 支給先分類ＣＤ６.<p>
	 *
	 */
	public void prsppl_grp_cd6(String value) {
		prsppl_grp_p().bp_grp_cd6(value);
	}

	/**
	 * Subcontractor classification name 6 支給先分類名６.<p>
	 *
	 */
	public String prsppl_grp_nm6() {
		return prsppl_grp_p().bp_grp_nm6();
	}

	/**
	 * Subcontractor classification name 6 支給先分類名６.<p>
	 *
	 */
	public void prsppl_grp_nm6(String value) {
		prsppl_grp_p().bp_grp_nm6(value);
	}

	/**
	 * Subcontractor classification 7 支給先分類７.<p>
	 *
	 */
	public boolean prsppl_grp_flg7() {
		return prsppl_grp_p().bp_grp_flg7();
	}

	/**
	 * Subcontractor classification 7 支給先分類７.<p>
	 *
	 */
	public void prsppl_grp_flg7(boolean value) {
		prsppl_grp_p().bp_grp_flg7(value);
	}

	/**
	 * Subcontractor classification cd. 7 支給先分類ＣＤ７.<p>
	 *
	 */
	public String prsppl_grp_cd7() {
		return prsppl_grp_p().bp_grp_cd7();
	}

	/**
	 * Subcontractor classification cd. 7 支給先分類ＣＤ７.<p>
	 *
	 */
	public void prsppl_grp_cd7(String value) {
		prsppl_grp_p().bp_grp_cd7(value);
	}

	/**
	 * Subcontractor classification name 7 支給先分類名７.<p>
	 *
	 */
	public String prsppl_grp_nm7() {
		return prsppl_grp_p().bp_grp_nm7();
	}

	/**
	 * Subcontractor classification name 7 支給先分類名７.<p>
	 *
	 */
	public void prsppl_grp_nm7(String value) {
		prsppl_grp_p().bp_grp_nm7(value);
	}

	/**
	 * Subcontractor classification 8 支給先分類８.<p>
	 *
	 */
	public boolean prsppl_grp_flg8() {
		return prsppl_grp_p().bp_grp_flg8();
	}

	/**
	 * Subcontractor classification 8 支給先分類８.<p>
	 *
	 */
	public void prsppl_grp_flg8(boolean value) {
		prsppl_grp_p().bp_grp_flg8(value);
	}

	/**
	 * Subcontractor classification cd. 8 支給先分類ＣＤ８.<p>
	 *
	 */
	public String prsppl_grp_cd8() {
		return prsppl_grp_p().bp_grp_cd8();
	}

	/**
	 * Subcontractor classification cd. 8 支給先分類ＣＤ８.<p>
	 *
	 */
	public void prsppl_grp_cd8(String value) {
		prsppl_grp_p().bp_grp_cd8(value);
	}

	/**
	 * Subcontractor classification name 8 支給先分類名８.<p>
	 *
	 */
	public String prsppl_grp_nm8() {
		return prsppl_grp_p().bp_grp_nm8();
	}

	/**
	 * Subcontractor classification name 8 支給先分類名８.<p>
	 *
	 */
	public void prsppl_grp_nm8(String value) {
		prsppl_grp_p().bp_grp_nm8(value);
	}

	/**
	 * Subcontractor classification 9 支給先分類９.<p>
	 *
	 */
	public boolean prsppl_grp_flg9() {
		return prsppl_grp_p().bp_grp_flg9();
	}

	/**
	 * Subcontractor classification 9 支給先分類９.<p>
	 *
	 */
	public void prsppl_grp_flg9(boolean value) {
		prsppl_grp_p().bp_grp_flg9(value);
	}

	/**
	 * Subcontractor classification cd. 9 支給先分類ＣＤ９.<p>
	 *
	 */
	public String prsppl_grp_cd9() {
		return prsppl_grp_p().bp_grp_cd9();
	}

	/**
	 * Subcontractor classification cd. 9 支給先分類ＣＤ９.<p>
	 *
	 */
	public void prsppl_grp_cd9(String value) {
		prsppl_grp_p().bp_grp_cd9(value);
	}

	/**
	 * Subcontractor classification name 9 支給先分類名９.<p>
	 *
	 */
	public String prsppl_grp_nm9() {
		return prsppl_grp_p().bp_grp_nm9();
	}

	/**
	 * Subcontractor classification name 9 支給先分類名９.<p>
	 *
	 */
	public void prsppl_grp_nm9(String value) {
		prsppl_grp_p().bp_grp_nm9(value);
	}

	/**
	 * Subcontractor classification 10 支給先分類１０.<p>
	 *
	 */
	public boolean prsppl_grp_flg10() {
		return prsppl_grp_p().bp_grp_flg10();
	}

	/**
	 * Subcontractor classification 10 支給先分類１０.<p>
	 *
	 */
	public void prsppl_grp_flg10(boolean value) {
		prsppl_grp_p().bp_grp_flg10(value);
	}

	/**
	 * Subcontractor classification cd. 10 支給先分類ＣＤ１０.<p>
	 *
	 */
	public String prsppl_grp_cd10() {
		return prsppl_grp_p().bp_grp_cd10();
	}

	/**
	 * Subcontractor classification cd. 10 支給先分類ＣＤ１０.<p>
	 *
	 */
	public void prsppl_grp_cd10(String value) {
		prsppl_grp_p().bp_grp_cd10(value);
	}

	/**
	 * Subcontractor classification name 10 支給先分類名１０.<p>
	 *
	 */
	public String prsppl_grp_nm10() {
		return prsppl_grp_p().bp_grp_nm10();
	}

	/**
	 * Subcontractor classification name 10 支給先分類名１０.<p>
	 *
	 */
	public void prsppl_grp_nm10(String value) {
		prsppl_grp_p().bp_grp_nm10(value);
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

