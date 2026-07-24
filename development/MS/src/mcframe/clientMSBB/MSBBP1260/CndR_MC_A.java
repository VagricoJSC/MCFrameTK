package mcframe.clientMSBB.MSBBP1260;

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
	 * UPD,Create/Modify;DEL,Cancel;REF,View;PRNT,Issue report UPD,登録・訂正する;DEL,取り消す;REF,参照する;PRNT,帳票発行.<p>
	 *
	 */
	public static final String $ope = "ope";
	/**
	 * Target 対象.<p>
	 *
	 */
	public static final String $edi_flg = "edi_flg";
	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public static final String $not_edi_flg = "not_edi_flg";
	/**
	 * Unanswered 未回答.<p>
	 *
	 */
	public static final String $not_prms_flg = "not_prms_flg";
	/**
	 * Replied 回答済.<p>
	 *
	 */
	public static final String $prms_flg = "prms_flg";
	/**
	 * Unissued 未発行.<p>
	 *
	 */
	public static final String $prms_not_prnted = "prms_not_prnted";
	/**
	 * Issued 発行済.<p>
	 *
	 */
	public static final String $prms_prnted = "prms_prnted";
	/**
	 * Sales order date FROM 受注日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $slo_dt_fr = "slo_dt_fr";
	/**
	 * Sales order date TO 受注日ＴＯ.<p>
	 *
	 */
	public static final String $slo_dt_to = "slo_dt_to";
	public static final String $dlv_inst_dt_p = "dlv_inst_dt_p";
	public static final String $ship_rqst_dt_p = "ship_rqst_dt_p";
	public static final String $pd_inst_dlv_dt_p = "pd_inst_dlv_dt_p";
	public static final String $ship_schd_dt_p = "ship_schd_dt_p";
	public static final String $dlv_schd_dt_p = "dlv_schd_dt_p";
	public static final String $prms_dt_p = "prms_dt_p";
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public static final String $cst_cd = "cst_cd";
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public static final String $cst_nm = "cst_nm";
	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public static final String $dlv_cd = "dlv_cd";
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public static final String $dlv_nm = "dlv_nm";
	public static final String $itm_typ_p = "itm_typ_p";
	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public static final String $cst_itm_cd = "cst_itm_cd";
	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public static final String $cst_itm_nm = "cst_itm_nm";
	public static final String $itm_p = "itm_p";
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public static final String $slo_no = "slo_no";
	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public static final String $slo_d_no = "slo_d_no";
	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public static final String $cst_po_no = "cst_po_no";
	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public static final String $cst_po_d_no = "cst_po_d_no";
	/**
	 * Customer delivery order No. 得意先納入指示ＮＯ.<p>
	 *
	 */
	public static final String $cst_dlv_inst_no = "cst_dlv_inst_no";
	/**
	 * Customer delivery order details No. 得意先納入指示明細ＮＯ.<p>
	 *
	 */
	public static final String $cst_dlv_inst_d_no = "cst_dlv_inst_d_no";
	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public static final String $ship_schd_no = "ship_schd_no";
	/**
	 * Sales order promising header No. 受注納期回答ヘッダＮＯ.<p>
	 *
	 */
	public static final String $slo_prms_h_no = "slo_prms_h_no";
	/**
	 * Sales order promising No. 受注納期回答ＮＯ.<p>
	 *
	 */
	public static final String $slo_prms_no = "slo_prms_no";
	/**
	 * Order promising remarks 納期回答備考.<p>
	 *
	 */
	public static final String $prms_rmrks = "prms_rmrks";
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
	 * Include cancel 取消含む.<p>
	 *
	 */
	public static final String $incl_can_flg = "incl_can_flg";
	public static final String $dlv_grp_p = "dlv_grp_p";
	public static final String $cst_grp_p = "cst_grp_p";
	public static final String $itm_grp_p = "itm_grp_p";

	public static final String $dlv_inst_dt_fr = $dlv_inst_dt_p + ".ymd_fr";
	public static final String $dlv_inst_hm_fr = $dlv_inst_dt_p + ".hm_fr";
	public static final String $dlv_inst_dt_to = $dlv_inst_dt_p + ".ymd_to";
	public static final String $dlv_inst_hm_to = $dlv_inst_dt_p + ".hm_to";
	public static final String $ship_rqst_dt_fr = $ship_rqst_dt_p + ".ymd_fr";
	public static final String $ship_rqst_hm_fr = $ship_rqst_dt_p + ".hm_fr";
	public static final String $ship_rqst_dt_to = $ship_rqst_dt_p + ".ymd_to";
	public static final String $ship_rqst_hm_to = $ship_rqst_dt_p + ".hm_to";
	public static final String $pd_inst_dlv_dt_fr = $pd_inst_dlv_dt_p + ".ymd_fr";
	public static final String $pd_inst_dlv_hm_fr = $pd_inst_dlv_dt_p + ".hm_fr";
	public static final String $pd_inst_dlv_dt_to = $pd_inst_dlv_dt_p + ".ymd_to";
	public static final String $pd_inst_dlv_hm_to = $pd_inst_dlv_dt_p + ".hm_to";
	public static final String $ship_schd_dt_fr = $ship_schd_dt_p + ".ymd_fr";
	public static final String $ship_schd_hm_fr = $ship_schd_dt_p + ".hm_fr";
	public static final String $ship_schd_dt_to = $ship_schd_dt_p + ".ymd_to";
	public static final String $ship_schd_hm_to = $ship_schd_dt_p + ".hm_to";
	public static final String $dlv_schd_dt_fr = $dlv_schd_dt_p + ".ymd_fr";
	public static final String $dlv_schd_hm_fr = $dlv_schd_dt_p + ".hm_fr";
	public static final String $dlv_schd_dt_to = $dlv_schd_dt_p + ".ymd_to";
	public static final String $dlv_schd_hm_to = $dlv_schd_dt_p + ".hm_to";
	public static final String $prms_dt_fr = $prms_dt_p + ".ymd_fr";
	public static final String $prms_hm_fr = $prms_dt_p + ".hm_fr";
	public static final String $prms_dt_to = $prms_dt_p + ".ymd_to";
	public static final String $prms_hm_to = $prms_dt_p + ".hm_to";
	public static final String $itm_typ = $itm_typ_p + ".itm_typ";
	public static final String $itm_typ_d_cd = $itm_typ_p + ".itm_typ_d_cd";
	public static final String $itm_typ_d_nm = $itm_typ_p + ".itm_typ_d_nm";
	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $dlv_grp_lab1 = $dlv_grp_p + ".bp_grp_lab1";
	public static final String $dlv_grp_flg1 = $dlv_grp_p + ".bp_grp_flg1";
	public static final String $dlv_grp_cd1 = $dlv_grp_p + ".bp_grp_cd1";
	public static final String $dlv_grp_nm1 = $dlv_grp_p + ".bp_grp_nm1";
	public static final String $dlv_grp_lab2 = $dlv_grp_p + ".bp_grp_lab2";
	public static final String $dlv_grp_flg2 = $dlv_grp_p + ".bp_grp_flg2";
	public static final String $dlv_grp_cd2 = $dlv_grp_p + ".bp_grp_cd2";
	public static final String $dlv_grp_nm2 = $dlv_grp_p + ".bp_grp_nm2";
	public static final String $dlv_grp_lab3 = $dlv_grp_p + ".bp_grp_lab3";
	public static final String $dlv_grp_flg3 = $dlv_grp_p + ".bp_grp_flg3";
	public static final String $dlv_grp_cd3 = $dlv_grp_p + ".bp_grp_cd3";
	public static final String $dlv_grp_nm3 = $dlv_grp_p + ".bp_grp_nm3";
	public static final String $dlv_grp_lab4 = $dlv_grp_p + ".bp_grp_lab4";
	public static final String $dlv_grp_flg4 = $dlv_grp_p + ".bp_grp_flg4";
	public static final String $dlv_grp_cd4 = $dlv_grp_p + ".bp_grp_cd4";
	public static final String $dlv_grp_nm4 = $dlv_grp_p + ".bp_grp_nm4";
	public static final String $dlv_grp_lab5 = $dlv_grp_p + ".bp_grp_lab5";
	public static final String $dlv_grp_flg5 = $dlv_grp_p + ".bp_grp_flg5";
	public static final String $dlv_grp_cd5 = $dlv_grp_p + ".bp_grp_cd5";
	public static final String $dlv_grp_nm5 = $dlv_grp_p + ".bp_grp_nm5";
	public static final String $dlv_grp_lab6 = $dlv_grp_p + ".bp_grp_lab6";
	public static final String $dlv_grp_flg6 = $dlv_grp_p + ".bp_grp_flg6";
	public static final String $dlv_grp_cd6 = $dlv_grp_p + ".bp_grp_cd6";
	public static final String $dlv_grp_nm6 = $dlv_grp_p + ".bp_grp_nm6";
	public static final String $dlv_grp_lab7 = $dlv_grp_p + ".bp_grp_lab7";
	public static final String $dlv_grp_flg7 = $dlv_grp_p + ".bp_grp_flg7";
	public static final String $dlv_grp_cd7 = $dlv_grp_p + ".bp_grp_cd7";
	public static final String $dlv_grp_nm7 = $dlv_grp_p + ".bp_grp_nm7";
	public static final String $dlv_grp_lab8 = $dlv_grp_p + ".bp_grp_lab8";
	public static final String $dlv_grp_flg8 = $dlv_grp_p + ".bp_grp_flg8";
	public static final String $dlv_grp_cd8 = $dlv_grp_p + ".bp_grp_cd8";
	public static final String $dlv_grp_nm8 = $dlv_grp_p + ".bp_grp_nm8";
	public static final String $dlv_grp_lab9 = $dlv_grp_p + ".bp_grp_lab9";
	public static final String $dlv_grp_flg9 = $dlv_grp_p + ".bp_grp_flg9";
	public static final String $dlv_grp_cd9 = $dlv_grp_p + ".bp_grp_cd9";
	public static final String $dlv_grp_nm9 = $dlv_grp_p + ".bp_grp_nm9";
	public static final String $dlv_grp_lab10 = $dlv_grp_p + ".bp_grp_lab10";
	public static final String $dlv_grp_flg10 = $dlv_grp_p + ".bp_grp_flg10";
	public static final String $dlv_grp_cd10 = $dlv_grp_p + ".bp_grp_cd10";
	public static final String $dlv_grp_nm10 = $dlv_grp_p + ".bp_grp_nm10";
	public static final String $cst_grp_lab1 = $cst_grp_p + ".bp_grp_lab1";
	public static final String $cst_grp_flg1 = $cst_grp_p + ".bp_grp_flg1";
	public static final String $cst_grp_cd1 = $cst_grp_p + ".bp_grp_cd1";
	public static final String $cst_grp_nm1 = $cst_grp_p + ".bp_grp_nm1";
	public static final String $cst_grp_lab2 = $cst_grp_p + ".bp_grp_lab2";
	public static final String $cst_grp_flg2 = $cst_grp_p + ".bp_grp_flg2";
	public static final String $cst_grp_cd2 = $cst_grp_p + ".bp_grp_cd2";
	public static final String $cst_grp_nm2 = $cst_grp_p + ".bp_grp_nm2";
	public static final String $cst_grp_lab3 = $cst_grp_p + ".bp_grp_lab3";
	public static final String $cst_grp_flg3 = $cst_grp_p + ".bp_grp_flg3";
	public static final String $cst_grp_cd3 = $cst_grp_p + ".bp_grp_cd3";
	public static final String $cst_grp_nm3 = $cst_grp_p + ".bp_grp_nm3";
	public static final String $cst_grp_lab4 = $cst_grp_p + ".bp_grp_lab4";
	public static final String $cst_grp_flg4 = $cst_grp_p + ".bp_grp_flg4";
	public static final String $cst_grp_cd4 = $cst_grp_p + ".bp_grp_cd4";
	public static final String $cst_grp_nm4 = $cst_grp_p + ".bp_grp_nm4";
	public static final String $cst_grp_lab5 = $cst_grp_p + ".bp_grp_lab5";
	public static final String $cst_grp_flg5 = $cst_grp_p + ".bp_grp_flg5";
	public static final String $cst_grp_cd5 = $cst_grp_p + ".bp_grp_cd5";
	public static final String $cst_grp_nm5 = $cst_grp_p + ".bp_grp_nm5";
	public static final String $cst_grp_lab6 = $cst_grp_p + ".bp_grp_lab6";
	public static final String $cst_grp_flg6 = $cst_grp_p + ".bp_grp_flg6";
	public static final String $cst_grp_cd6 = $cst_grp_p + ".bp_grp_cd6";
	public static final String $cst_grp_nm6 = $cst_grp_p + ".bp_grp_nm6";
	public static final String $cst_grp_lab7 = $cst_grp_p + ".bp_grp_lab7";
	public static final String $cst_grp_flg7 = $cst_grp_p + ".bp_grp_flg7";
	public static final String $cst_grp_cd7 = $cst_grp_p + ".bp_grp_cd7";
	public static final String $cst_grp_nm7 = $cst_grp_p + ".bp_grp_nm7";
	public static final String $cst_grp_lab8 = $cst_grp_p + ".bp_grp_lab8";
	public static final String $cst_grp_flg8 = $cst_grp_p + ".bp_grp_flg8";
	public static final String $cst_grp_cd8 = $cst_grp_p + ".bp_grp_cd8";
	public static final String $cst_grp_nm8 = $cst_grp_p + ".bp_grp_nm8";
	public static final String $cst_grp_lab9 = $cst_grp_p + ".bp_grp_lab9";
	public static final String $cst_grp_flg9 = $cst_grp_p + ".bp_grp_flg9";
	public static final String $cst_grp_cd9 = $cst_grp_p + ".bp_grp_cd9";
	public static final String $cst_grp_nm9 = $cst_grp_p + ".bp_grp_nm9";
	public static final String $cst_grp_lab10 = $cst_grp_p + ".bp_grp_lab10";
	public static final String $cst_grp_flg10 = $cst_grp_p + ".bp_grp_flg10";
	public static final String $cst_grp_cd10 = $cst_grp_p + ".bp_grp_cd10";
	public static final String $cst_grp_nm10 = $cst_grp_p + ".bp_grp_nm10";
	public static final String $itm_grp_lab1 = $itm_grp_p + ".itm_grp_lab1";
	public static final String $itm_grp_flg1 = $itm_grp_p + ".itm_grp_flg1";
	public static final String $itm_grp_cd1 = $itm_grp_p + ".itm_grp_cd1";
	public static final String $itm_grp_nm1 = $itm_grp_p + ".itm_grp_nm1";
	public static final String $itm_grp_lab2 = $itm_grp_p + ".itm_grp_lab2";
	public static final String $itm_grp_flg2 = $itm_grp_p + ".itm_grp_flg2";
	public static final String $itm_grp_cd2 = $itm_grp_p + ".itm_grp_cd2";
	public static final String $itm_grp_nm2 = $itm_grp_p + ".itm_grp_nm2";
	public static final String $itm_grp_lab3 = $itm_grp_p + ".itm_grp_lab3";
	public static final String $itm_grp_flg3 = $itm_grp_p + ".itm_grp_flg3";
	public static final String $itm_grp_cd3 = $itm_grp_p + ".itm_grp_cd3";
	public static final String $itm_grp_nm3 = $itm_grp_p + ".itm_grp_nm3";
	public static final String $itm_grp_lab4 = $itm_grp_p + ".itm_grp_lab4";
	public static final String $itm_grp_flg4 = $itm_grp_p + ".itm_grp_flg4";
	public static final String $itm_grp_cd4 = $itm_grp_p + ".itm_grp_cd4";
	public static final String $itm_grp_nm4 = $itm_grp_p + ".itm_grp_nm4";
	public static final String $itm_grp_lab5 = $itm_grp_p + ".itm_grp_lab5";
	public static final String $itm_grp_flg5 = $itm_grp_p + ".itm_grp_flg5";
	public static final String $itm_grp_cd5 = $itm_grp_p + ".itm_grp_cd5";
	public static final String $itm_grp_nm5 = $itm_grp_p + ".itm_grp_nm5";
	public static final String $itm_grp_lab6 = $itm_grp_p + ".itm_grp_lab6";
	public static final String $itm_grp_flg6 = $itm_grp_p + ".itm_grp_flg6";
	public static final String $itm_grp_cd6 = $itm_grp_p + ".itm_grp_cd6";
	public static final String $itm_grp_nm6 = $itm_grp_p + ".itm_grp_nm6";
	public static final String $itm_grp_lab7 = $itm_grp_p + ".itm_grp_lab7";
	public static final String $itm_grp_flg7 = $itm_grp_p + ".itm_grp_flg7";
	public static final String $itm_grp_cd7 = $itm_grp_p + ".itm_grp_cd7";
	public static final String $itm_grp_nm7 = $itm_grp_p + ".itm_grp_nm7";
	public static final String $itm_grp_lab8 = $itm_grp_p + ".itm_grp_lab8";
	public static final String $itm_grp_flg8 = $itm_grp_p + ".itm_grp_flg8";
	public static final String $itm_grp_cd8 = $itm_grp_p + ".itm_grp_cd8";
	public static final String $itm_grp_nm8 = $itm_grp_p + ".itm_grp_nm8";
	public static final String $itm_grp_lab9 = $itm_grp_p + ".itm_grp_lab9";
	public static final String $itm_grp_flg9 = $itm_grp_p + ".itm_grp_flg9";
	public static final String $itm_grp_cd9 = $itm_grp_p + ".itm_grp_cd9";
	public static final String $itm_grp_nm9 = $itm_grp_p + ".itm_grp_nm9";
	public static final String $itm_grp_lab10 = $itm_grp_p + ".itm_grp_lab10";
	public static final String $itm_grp_flg10 = $itm_grp_p + ".itm_grp_flg10";
	public static final String $itm_grp_cd10 = $itm_grp_p + ".itm_grp_cd10";
	public static final String $itm_grp_nm10 = $itm_grp_p + ".itm_grp_nm10";

	public static final MCMeta ope_META = createStringMeta($ope);
	public static final MCMeta edi_flg_META = createCommonMeta($edi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_edi_flg_META = createCommonMeta($not_edi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_prms_flg_META = createCommonMeta($not_prms_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prms_flg_META = createCommonMeta($prms_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prms_not_prnted_META = createCommonMeta($prms_not_prnted, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prms_prnted_META = createCommonMeta($prms_prnted, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta slo_dt_fr_META = createCommonMeta($slo_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta slo_dt_to_META = createCommonMeta($slo_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dlv_inst_dt_p_META = createInnerRowMeta($dlv_inst_dt_p, mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class);
	public static final MCMeta ship_rqst_dt_p_META = createInnerRowMeta($ship_rqst_dt_p, mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class);
	public static final MCMeta pd_inst_dlv_dt_p_META = createInnerRowMeta($pd_inst_dlv_dt_p, mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class);
	public static final MCMeta ship_schd_dt_p_META = createInnerRowMeta($ship_schd_dt_p, mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class);
	public static final MCMeta dlv_schd_dt_p_META = createInnerRowMeta($dlv_schd_dt_p, mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class);
	public static final MCMeta prms_dt_p_META = createInnerRowMeta($prms_dt_p, mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cst_nm_META = createCommonMeta($cst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dlv_cd_META = createCommonMeta($dlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dlv_nm_META = createCommonMeta($dlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta itm_typ_p_META = createInnerRowMeta($itm_typ_p, mcframe.clientMAUB.MAUBP0100.ItmTypR.class);
	public static final MCMeta cst_itm_cd_META = createCommonMeta($cst_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta cst_itm_nm_META = createCommonMeta($cst_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta slo_d_no_META = createCommonMeta($slo_d_no, mcframe.commonMA.meta.MA_META.SLO_D_NO);
	public static final MCMeta cst_po_no_META = createCommonMeta($cst_po_no, mcframe.commonMA.meta.MA_META.CST_PO_NO);
	public static final MCMeta cst_po_d_no_META = createCommonMeta($cst_po_d_no, mcframe.commonMA.meta.MA_META.CST_PO_D_NO);
	public static final MCMeta cst_dlv_inst_no_META = createCommonMeta($cst_dlv_inst_no, mcframe.commonMA.meta.MA_META.CST_DLV_INST_NO);
	public static final MCMeta cst_dlv_inst_d_no_META = createCommonMeta($cst_dlv_inst_d_no, mcframe.commonMA.meta.MA_META.CST_DLV_INST_D_NO);
	public static final MCMeta ship_schd_no_META = createCommonMeta($ship_schd_no, mcframe.commonMA.meta.MA_META.SHIP_SCHD_NO);
	public static final MCMeta slo_prms_h_no_META = createCommonMeta($slo_prms_h_no, mcframe.commonMA.meta.MA_META.SLO_PRMS_H_NO);
	public static final MCMeta slo_prms_no_META = createCommonMeta($slo_prms_no, mcframe.commonMA.meta.MA_META.SLO_PRMS_NO);
	public static final MCMeta prms_rmrks_META = createCommonMeta($prms_rmrks, mcframe.commonMS.meta.MS_META.SLO_PRMS_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.SLO_PRMS_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.SLO_PRMS_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.SLO_PRMS_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.SLO_PRMS_SUB_CHAR3);
	public static final MCMeta incl_can_flg_META = createCommonMeta($incl_can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_grp_p_META = createInnerRowMeta($dlv_grp_p, mcframe.clientMAUB.MAUBP0260.BpGrpR.class);
	public static final MCMeta cst_grp_p_META = createInnerRowMeta($cst_grp_p, mcframe.clientMAUB.MAUBP0260.BpGrpR.class);
	public static final MCMeta itm_grp_p_META = createInnerRowMeta($itm_grp_p, mcframe.clientMAUB.MAUBP0250.ItmGrpR.class);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			edi_flg_META,
			not_edi_flg_META,
			not_prms_flg_META,
			prms_flg_META,
			prms_not_prnted_META,
			prms_prnted_META,
			slo_dt_fr_META,
			slo_dt_to_META,
			dlv_inst_dt_p_META,
			ship_rqst_dt_p_META,
			pd_inst_dlv_dt_p_META,
			ship_schd_dt_p_META,
			dlv_schd_dt_p_META,
			prms_dt_p_META,
			cst_cd_META,
			cst_nm_META,
			dlv_cd_META,
			dlv_nm_META,
			itm_typ_p_META,
			cst_itm_cd_META,
			cst_itm_nm_META,
			itm_p_META,
			slo_no_META,
			slo_d_no_META,
			cst_po_no_META,
			cst_po_d_no_META,
			cst_dlv_inst_no_META,
			cst_dlv_inst_d_no_META,
			ship_schd_no_META,
			slo_prms_h_no_META,
			slo_prms_no_META,
			prms_rmrks_META,
			intr_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			incl_can_flg_META,
			dlv_grp_p_META,
			cst_grp_p_META,
			itm_grp_p_META
		},
		new String[][]{
			{
				"dlv_inst_dt_fr",
				"dlv_inst_hm_fr",
				"dlv_inst_dt_to",
				"dlv_inst_hm_to",
				"ship_rqst_dt_fr",
				"ship_rqst_hm_fr",
				"ship_rqst_dt_to",
				"ship_rqst_hm_to",
				"pd_inst_dlv_dt_fr",
				"pd_inst_dlv_hm_fr",
				"pd_inst_dlv_dt_to",
				"pd_inst_dlv_hm_to",
				"ship_schd_dt_fr",
				"ship_schd_hm_fr",
				"ship_schd_dt_to",
				"ship_schd_hm_to",
				"dlv_schd_dt_fr",
				"dlv_schd_hm_fr",
				"dlv_schd_dt_to",
				"dlv_schd_hm_to",
				"prms_dt_fr",
				"prms_hm_fr",
				"prms_dt_to",
				"prms_hm_to",
				"itm_typ",
				"itm_typ_d_cd",
				"itm_typ_d_nm",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"dlv_grp_flg1",
				"dlv_grp_cd1",
				"dlv_grp_nm1",
				"dlv_grp_flg2",
				"dlv_grp_cd2",
				"dlv_grp_nm2",
				"dlv_grp_flg3",
				"dlv_grp_cd3",
				"dlv_grp_nm3",
				"dlv_grp_flg4",
				"dlv_grp_cd4",
				"dlv_grp_nm4",
				"dlv_grp_flg5",
				"dlv_grp_cd5",
				"dlv_grp_nm5",
				"dlv_grp_flg6",
				"dlv_grp_cd6",
				"dlv_grp_nm6",
				"dlv_grp_flg7",
				"dlv_grp_cd7",
				"dlv_grp_nm7",
				"dlv_grp_flg8",
				"dlv_grp_cd8",
				"dlv_grp_nm8",
				"dlv_grp_flg9",
				"dlv_grp_cd9",
				"dlv_grp_nm9",
				"dlv_grp_flg10",
				"dlv_grp_cd10",
				"dlv_grp_nm10",
				"cst_grp_flg1",
				"cst_grp_cd1",
				"cst_grp_nm1",
				"cst_grp_flg2",
				"cst_grp_cd2",
				"cst_grp_nm2",
				"cst_grp_flg3",
				"cst_grp_cd3",
				"cst_grp_nm3",
				"cst_grp_flg4",
				"cst_grp_cd4",
				"cst_grp_nm4",
				"cst_grp_flg5",
				"cst_grp_cd5",
				"cst_grp_nm5",
				"cst_grp_flg6",
				"cst_grp_cd6",
				"cst_grp_nm6",
				"cst_grp_flg7",
				"cst_grp_cd7",
				"cst_grp_nm7",
				"cst_grp_flg8",
				"cst_grp_cd8",
				"cst_grp_nm8",
				"cst_grp_flg9",
				"cst_grp_cd9",
				"cst_grp_nm9",
				"cst_grp_flg10",
				"cst_grp_cd10",
				"cst_grp_nm10",
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
				$dlv_inst_dt_fr,
				$dlv_inst_hm_fr,
				$dlv_inst_dt_to,
				$dlv_inst_hm_to,
				$ship_rqst_dt_fr,
				$ship_rqst_hm_fr,
				$ship_rqst_dt_to,
				$ship_rqst_hm_to,
				$pd_inst_dlv_dt_fr,
				$pd_inst_dlv_hm_fr,
				$pd_inst_dlv_dt_to,
				$pd_inst_dlv_hm_to,
				$ship_schd_dt_fr,
				$ship_schd_hm_fr,
				$ship_schd_dt_to,
				$ship_schd_hm_to,
				$dlv_schd_dt_fr,
				$dlv_schd_hm_fr,
				$dlv_schd_dt_to,
				$dlv_schd_hm_to,
				$prms_dt_fr,
				$prms_hm_fr,
				$prms_dt_to,
				$prms_hm_to,
				$itm_typ,
				$itm_typ_d_cd,
				$itm_typ_d_nm,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$dlv_grp_flg1,
				$dlv_grp_cd1,
				$dlv_grp_nm1,
				$dlv_grp_flg2,
				$dlv_grp_cd2,
				$dlv_grp_nm2,
				$dlv_grp_flg3,
				$dlv_grp_cd3,
				$dlv_grp_nm3,
				$dlv_grp_flg4,
				$dlv_grp_cd4,
				$dlv_grp_nm4,
				$dlv_grp_flg5,
				$dlv_grp_cd5,
				$dlv_grp_nm5,
				$dlv_grp_flg6,
				$dlv_grp_cd6,
				$dlv_grp_nm6,
				$dlv_grp_flg7,
				$dlv_grp_cd7,
				$dlv_grp_nm7,
				$dlv_grp_flg8,
				$dlv_grp_cd8,
				$dlv_grp_nm8,
				$dlv_grp_flg9,
				$dlv_grp_cd9,
				$dlv_grp_nm9,
				$dlv_grp_flg10,
				$dlv_grp_cd10,
				$dlv_grp_nm10,
				$cst_grp_flg1,
				$cst_grp_cd1,
				$cst_grp_nm1,
				$cst_grp_flg2,
				$cst_grp_cd2,
				$cst_grp_nm2,
				$cst_grp_flg3,
				$cst_grp_cd3,
				$cst_grp_nm3,
				$cst_grp_flg4,
				$cst_grp_cd4,
				$cst_grp_nm4,
				$cst_grp_flg5,
				$cst_grp_cd5,
				$cst_grp_nm5,
				$cst_grp_flg6,
				$cst_grp_cd6,
				$cst_grp_nm6,
				$cst_grp_flg7,
				$cst_grp_cd7,
				$cst_grp_nm7,
				$cst_grp_flg8,
				$cst_grp_cd8,
				$cst_grp_nm8,
				$cst_grp_flg9,
				$cst_grp_cd9,
				$cst_grp_nm9,
				$cst_grp_flg10,
				$cst_grp_cd10,
				$cst_grp_nm10,
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
				{$cst_cd, "bp_nm"},	// cst_cd
				{$dlv_cd, "bp_nm"},	// dlv_cd
				{$cst_itm_cd, "bp_itm_nm"}	// cst_itm_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$cst_cd, "MAC_BP_IS_SRCH_TYP.CST_NOT_SUNDRY"},	// cst_cd
				{$dlv_cd, "MAC_BP_IS_SRCH_TYP.DLV;true"},	// dlv_cd
				{$itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3"}	// itm_p.itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$cst_cd, "bp_is_srch_typ"},	// cst_cd
				{$dlv_cd, "bp_is_srch_typ;dlv_sundry_nm_rem_flg"},	// dlv_cd
				{$itm_p + ".itm_cd", "itm_is_srch_typ"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "itm_is_srch_typ"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "itm_is_srch_typ"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "itm_is_srch_typ"}	// itm_p.itm_sub3
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
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
	 * UPD,Create/Modify;DEL,Cancel;REF,View;PRNT,Issue report UPD,登録・訂正する;DEL,取り消す;REF,参照する;PRNT,帳票発行.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * UPD,Create/Modify;DEL,Cancel;REF,View;PRNT,Issue report UPD,登録・訂正する;DEL,取り消す;REF,参照する;PRNT,帳票発行.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	/**
	 * Target 対象.<p>
	 *
	 */
	public boolean edi_flg() {
		return getConstBoolean(offset + 1, $edi_flg);
	}

	/**
	 * Target 対象.<p>
	 *
	 */
	public void edi_flg(boolean value) {
		setConstBoolean(offset + 1, $edi_flg, value);
	}


	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public boolean not_edi_flg() {
		return getConstBoolean(offset + 2, $not_edi_flg);
	}

	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public void not_edi_flg(boolean value) {
		setConstBoolean(offset + 2, $not_edi_flg, value);
	}


	/**
	 * Unanswered 未回答.<p>
	 *
	 */
	public boolean not_prms_flg() {
		return getConstBoolean(offset + 3, $not_prms_flg);
	}

	/**
	 * Unanswered 未回答.<p>
	 *
	 */
	public void not_prms_flg(boolean value) {
		setConstBoolean(offset + 3, $not_prms_flg, value);
	}


	/**
	 * Replied 回答済.<p>
	 *
	 */
	public boolean prms_flg() {
		return getConstBoolean(offset + 4, $prms_flg);
	}

	/**
	 * Replied 回答済.<p>
	 *
	 */
	public void prms_flg(boolean value) {
		setConstBoolean(offset + 4, $prms_flg, value);
	}


	/**
	 * Unissued 未発行.<p>
	 *
	 */
	public boolean prms_not_prnted() {
		return getConstBoolean(offset + 5, $prms_not_prnted);
	}

	/**
	 * Unissued 未発行.<p>
	 *
	 */
	public void prms_not_prnted(boolean value) {
		setConstBoolean(offset + 5, $prms_not_prnted, value);
	}


	/**
	 * Issued 発行済.<p>
	 *
	 */
	public boolean prms_prnted() {
		return getConstBoolean(offset + 6, $prms_prnted);
	}

	/**
	 * Issued 発行済.<p>
	 *
	 */
	public void prms_prnted(boolean value) {
		setConstBoolean(offset + 6, $prms_prnted, value);
	}


	/**
	 * Sales order date FROM 受注日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate slo_dt_fr() {
		return getConstDate(offset + 7, $slo_dt_fr);
	}

	/**
	 * Sales order date FROM 受注日ＦＲＯＭ.<p>
	 *
	 */
	public void slo_dt_fr(MCDate value) {
		setConstDate(offset + 7, $slo_dt_fr, value);
	}


	/**
	 * Sales order date TO 受注日ＴＯ.<p>
	 *
	 */
	public MCDate slo_dt_to() {
		return getConstDate(offset + 8, $slo_dt_to);
	}

	/**
	 * Sales order date TO 受注日ＴＯ.<p>
	 *
	 */
	public void slo_dt_to(MCDate value) {
		setConstDate(offset + 8, $slo_dt_to, value);
	}


	public mcframe.clientMAUB.MAUBP0400.YmdHmFrToR dlv_inst_dt_p(){
		return (mcframe.clientMAUB.MAUBP0400.YmdHmFrToR) getConstInnerRow(offset + 9, $dlv_inst_dt_p);
	}
	
	public void dlv_inst_dt_p(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR row){
		setConstInnerRow(offset + 9, $dlv_inst_dt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0400.YmdHmFrToR ship_rqst_dt_p(){
		return (mcframe.clientMAUB.MAUBP0400.YmdHmFrToR) getConstInnerRow(offset + 10, $ship_rqst_dt_p);
	}
	
	public void ship_rqst_dt_p(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR row){
		setConstInnerRow(offset + 10, $ship_rqst_dt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0400.YmdHmFrToR pd_inst_dlv_dt_p(){
		return (mcframe.clientMAUB.MAUBP0400.YmdHmFrToR) getConstInnerRow(offset + 11, $pd_inst_dlv_dt_p);
	}
	
	public void pd_inst_dlv_dt_p(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR row){
		setConstInnerRow(offset + 11, $pd_inst_dlv_dt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0400.YmdHmFrToR ship_schd_dt_p(){
		return (mcframe.clientMAUB.MAUBP0400.YmdHmFrToR) getConstInnerRow(offset + 12, $ship_schd_dt_p);
	}
	
	public void ship_schd_dt_p(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR row){
		setConstInnerRow(offset + 12, $ship_schd_dt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0400.YmdHmFrToR dlv_schd_dt_p(){
		return (mcframe.clientMAUB.MAUBP0400.YmdHmFrToR) getConstInnerRow(offset + 13, $dlv_schd_dt_p);
	}
	
	public void dlv_schd_dt_p(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR row){
		setConstInnerRow(offset + 13, $dlv_schd_dt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0400.YmdHmFrToR prms_dt_p(){
		return (mcframe.clientMAUB.MAUBP0400.YmdHmFrToR) getConstInnerRow(offset + 14, $prms_dt_p);
	}
	
	public void prms_dt_p(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR row){
		setConstInnerRow(offset + 14, $prms_dt_p, row);
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 15, $cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 15, $cst_cd, value);
	}


	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public String cst_nm() {
		return getConstString(offset + 16, $cst_nm);
	}

	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public void cst_nm(String value) {
		setConstString(offset + 16, $cst_nm, value);
	}


	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public String dlv_cd() {
		return getConstString(offset + 17, $dlv_cd);
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public void dlv_cd(String value) {
		setConstString(offset + 17, $dlv_cd, value);
	}


	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public String dlv_nm() {
		return getConstString(offset + 18, $dlv_nm);
	}

	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public void dlv_nm(String value) {
		setConstString(offset + 18, $dlv_nm, value);
	}


	public mcframe.clientMAUB.MAUBP0100.ItmTypR itm_typ_p(){
		return (mcframe.clientMAUB.MAUBP0100.ItmTypR) getConstInnerRow(offset + 19, $itm_typ_p);
	}
	
	public void itm_typ_p(mcframe.clientMAUB.MAUBP0100.ItmTypR row){
		setConstInnerRow(offset + 19, $itm_typ_p, row);
	}


	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public String cst_itm_cd() {
		return getConstString(offset + 20, $cst_itm_cd);
	}

	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public void cst_itm_cd(String value) {
		setConstString(offset + 20, $cst_itm_cd, value);
	}


	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public String cst_itm_nm() {
		return getConstString(offset + 21, $cst_itm_nm);
	}

	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public void cst_itm_nm(String value) {
		setConstString(offset + 21, $cst_itm_nm, value);
	}


	public mcframe.clientMAUB.MAUBP0030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 22, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 22, $itm_p, row);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 23, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 23, $slo_no, value);
	}


	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public String slo_d_no() {
		return getConstString(offset + 24, $slo_d_no);
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public void slo_d_no(String value) {
		setConstString(offset + 24, $slo_d_no, value);
	}


	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public String cst_po_no() {
		return getConstString(offset + 25, $cst_po_no);
	}

	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public void cst_po_no(String value) {
		setConstString(offset + 25, $cst_po_no, value);
	}


	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public String cst_po_d_no() {
		return getConstString(offset + 26, $cst_po_d_no);
	}

	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public void cst_po_d_no(String value) {
		setConstString(offset + 26, $cst_po_d_no, value);
	}


	/**
	 * Customer delivery order No. 得意先納入指示ＮＯ.<p>
	 *
	 */
	public String cst_dlv_inst_no() {
		return getConstString(offset + 27, $cst_dlv_inst_no);
	}

	/**
	 * Customer delivery order No. 得意先納入指示ＮＯ.<p>
	 *
	 */
	public void cst_dlv_inst_no(String value) {
		setConstString(offset + 27, $cst_dlv_inst_no, value);
	}


	/**
	 * Customer delivery order details No. 得意先納入指示明細ＮＯ.<p>
	 *
	 */
	public String cst_dlv_inst_d_no() {
		return getConstString(offset + 28, $cst_dlv_inst_d_no);
	}

	/**
	 * Customer delivery order details No. 得意先納入指示明細ＮＯ.<p>
	 *
	 */
	public void cst_dlv_inst_d_no(String value) {
		setConstString(offset + 28, $cst_dlv_inst_d_no, value);
	}


	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public String ship_schd_no() {
		return getConstString(offset + 29, $ship_schd_no);
	}

	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public void ship_schd_no(String value) {
		setConstString(offset + 29, $ship_schd_no, value);
	}


	/**
	 * Sales order promising header No. 受注納期回答ヘッダＮＯ.<p>
	 *
	 */
	public String slo_prms_h_no() {
		return getConstString(offset + 30, $slo_prms_h_no);
	}

	/**
	 * Sales order promising header No. 受注納期回答ヘッダＮＯ.<p>
	 *
	 */
	public void slo_prms_h_no(String value) {
		setConstString(offset + 30, $slo_prms_h_no, value);
	}


	/**
	 * Sales order promising No. 受注納期回答ＮＯ.<p>
	 *
	 */
	public String slo_prms_no() {
		return getConstString(offset + 31, $slo_prms_no);
	}

	/**
	 * Sales order promising No. 受注納期回答ＮＯ.<p>
	 *
	 */
	public void slo_prms_no(String value) {
		setConstString(offset + 31, $slo_prms_no, value);
	}


	/**
	 * Order promising remarks 納期回答備考.<p>
	 *
	 */
	public String prms_rmrks() {
		return getConstString(offset + 32, $prms_rmrks);
	}

	/**
	 * Order promising remarks 納期回答備考.<p>
	 *
	 */
	public void prms_rmrks(String value) {
		setConstString(offset + 32, $prms_rmrks, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 33, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 33, $intr_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 34, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 34, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 35, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 35, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 36, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 36, $sub_char3, value);
	}


	/**
	 * Include cancel 取消含む.<p>
	 *
	 */
	public boolean incl_can_flg() {
		return getConstBoolean(offset + 37, $incl_can_flg);
	}

	/**
	 * Include cancel 取消含む.<p>
	 *
	 */
	public void incl_can_flg(boolean value) {
		setConstBoolean(offset + 37, $incl_can_flg, value);
	}


	public mcframe.clientMAUB.MAUBP0260.BpGrpR dlv_grp_p(){
		return (mcframe.clientMAUB.MAUBP0260.BpGrpR) getConstInnerRow(offset + 38, $dlv_grp_p);
	}
	
	public void dlv_grp_p(mcframe.clientMAUB.MAUBP0260.BpGrpR row){
		setConstInnerRow(offset + 38, $dlv_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP0260.BpGrpR cst_grp_p(){
		return (mcframe.clientMAUB.MAUBP0260.BpGrpR) getConstInnerRow(offset + 39, $cst_grp_p);
	}
	
	public void cst_grp_p(mcframe.clientMAUB.MAUBP0260.BpGrpR row){
		setConstInnerRow(offset + 39, $cst_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP0250.ItmGrpR itm_grp_p(){
		return (mcframe.clientMAUB.MAUBP0250.ItmGrpR) getConstInnerRow(offset + 40, $itm_grp_p);
	}
	
	public void itm_grp_p(mcframe.clientMAUB.MAUBP0250.ItmGrpR row){
		setConstInnerRow(offset + 40, $itm_grp_p, row);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			return cst_po_no();
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			return cst_po_d_no();
		}
		if ($cst_dlv_inst_no.equalsIgnoreCase(name)) {
			return cst_dlv_inst_no();
		}
		if ($cst_dlv_inst_d_no.equalsIgnoreCase(name)) {
			return cst_dlv_inst_d_no();
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			return ship_schd_no();
		}
		if ($slo_prms_h_no.equalsIgnoreCase(name)) {
			return slo_prms_h_no();
		}
		if ($slo_prms_no.equalsIgnoreCase(name)) {
			return slo_prms_no();
		}
		if ($prms_rmrks.equalsIgnoreCase(name)) {
			return prms_rmrks();
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
		if ($slo_dt_fr.equalsIgnoreCase(name)) {
			return slo_dt_fr();
		}
		if ($slo_dt_to.equalsIgnoreCase(name)) {
			return slo_dt_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($edi_flg.equalsIgnoreCase(name)) {
			return edi_flg();
		}
		if ($not_edi_flg.equalsIgnoreCase(name)) {
			return not_edi_flg();
		}
		if ($not_prms_flg.equalsIgnoreCase(name)) {
			return not_prms_flg();
		}
		if ($prms_flg.equalsIgnoreCase(name)) {
			return prms_flg();
		}
		if ($prms_not_prnted.equalsIgnoreCase(name)) {
			return prms_not_prnted();
		}
		if ($prms_prnted.equalsIgnoreCase(name)) {
			return prms_prnted();
		}
		if ($incl_can_flg.equalsIgnoreCase(name)) {
			return incl_can_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			return cst_po_no();
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			return cst_po_d_no();
		}
		if ($cst_dlv_inst_no.equalsIgnoreCase(name)) {
			return cst_dlv_inst_no();
		}
		if ($cst_dlv_inst_d_no.equalsIgnoreCase(name)) {
			return cst_dlv_inst_d_no();
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			return ship_schd_no();
		}
		if ($slo_prms_h_no.equalsIgnoreCase(name)) {
			return slo_prms_h_no();
		}
		if ($slo_prms_no.equalsIgnoreCase(name)) {
			return slo_prms_no();
		}
		if ($prms_rmrks.equalsIgnoreCase(name)) {
			return prms_rmrks();
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
		if ($slo_dt_fr.equalsIgnoreCase(name)) {
			return slo_dt_fr();
		}
		if ($slo_dt_to.equalsIgnoreCase(name)) {
			return slo_dt_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($edi_flg.equalsIgnoreCase(name)) {
			return edi_flg();
		}
		if ($not_edi_flg.equalsIgnoreCase(name)) {
			return not_edi_flg();
		}
		if ($not_prms_flg.equalsIgnoreCase(name)) {
			return not_prms_flg();
		}
		if ($prms_flg.equalsIgnoreCase(name)) {
			return prms_flg();
		}
		if ($prms_not_prnted.equalsIgnoreCase(name)) {
			return prms_not_prnted();
		}
		if ($prms_prnted.equalsIgnoreCase(name)) {
			return prms_prnted();
		}
		if ($incl_can_flg.equalsIgnoreCase(name)) {
			return incl_can_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
			return;
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			dlv_nm(value);
			return;
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			cst_itm_cd(value);
			return;
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			cst_itm_nm(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			cst_po_no(value);
			return;
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			cst_po_d_no(value);
			return;
		}
		if ($cst_dlv_inst_no.equalsIgnoreCase(name)) {
			cst_dlv_inst_no(value);
			return;
		}
		if ($cst_dlv_inst_d_no.equalsIgnoreCase(name)) {
			cst_dlv_inst_d_no(value);
			return;
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			ship_schd_no(value);
			return;
		}
		if ($slo_prms_h_no.equalsIgnoreCase(name)) {
			slo_prms_h_no(value);
			return;
		}
		if ($slo_prms_no.equalsIgnoreCase(name)) {
			slo_prms_no(value);
			return;
		}
		if ($prms_rmrks.equalsIgnoreCase(name)) {
			prms_rmrks(value);
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
		if ($slo_dt_fr.equalsIgnoreCase(name)) {
			slo_dt_fr(value);
			return;
		}
		if ($slo_dt_to.equalsIgnoreCase(name)) {
			slo_dt_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($edi_flg.equalsIgnoreCase(name)) {
			edi_flg(value);
			return;
		}
		if ($not_edi_flg.equalsIgnoreCase(name)) {
			not_edi_flg(value);
			return;
		}
		if ($not_prms_flg.equalsIgnoreCase(name)) {
			not_prms_flg(value);
			return;
		}
		if ($prms_flg.equalsIgnoreCase(name)) {
			prms_flg(value);
			return;
		}
		if ($prms_not_prnted.equalsIgnoreCase(name)) {
			prms_not_prnted(value);
			return;
		}
		if ($prms_prnted.equalsIgnoreCase(name)) {
			prms_prnted(value);
			return;
		}
		if ($incl_can_flg.equalsIgnoreCase(name)) {
			incl_can_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
			return;
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			dlv_nm(value);
			return;
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			cst_itm_cd(value);
			return;
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			cst_itm_nm(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			cst_po_no(value);
			return;
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			cst_po_d_no(value);
			return;
		}
		if ($cst_dlv_inst_no.equalsIgnoreCase(name)) {
			cst_dlv_inst_no(value);
			return;
		}
		if ($cst_dlv_inst_d_no.equalsIgnoreCase(name)) {
			cst_dlv_inst_d_no(value);
			return;
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			ship_schd_no(value);
			return;
		}
		if ($slo_prms_h_no.equalsIgnoreCase(name)) {
			slo_prms_h_no(value);
			return;
		}
		if ($slo_prms_no.equalsIgnoreCase(name)) {
			slo_prms_no(value);
			return;
		}
		if ($prms_rmrks.equalsIgnoreCase(name)) {
			prms_rmrks(value);
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
		if ($slo_dt_fr.equalsIgnoreCase(name)) {
			slo_dt_fr(value);
			return;
		}
		if ($slo_dt_to.equalsIgnoreCase(name)) {
			slo_dt_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($edi_flg.equalsIgnoreCase(name)) {
			edi_flg(value);
			return;
		}
		if ($not_edi_flg.equalsIgnoreCase(name)) {
			not_edi_flg(value);
			return;
		}
		if ($not_prms_flg.equalsIgnoreCase(name)) {
			not_prms_flg(value);
			return;
		}
		if ($prms_flg.equalsIgnoreCase(name)) {
			prms_flg(value);
			return;
		}
		if ($prms_not_prnted.equalsIgnoreCase(name)) {
			prms_not_prnted(value);
			return;
		}
		if ($prms_prnted.equalsIgnoreCase(name)) {
			prms_prnted(value);
			return;
		}
		if ($incl_can_flg.equalsIgnoreCase(name)) {
			incl_can_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($dlv_inst_dt_p.equalsIgnoreCase(name)) {
			return dlv_inst_dt_p();
		}
		if ($ship_rqst_dt_p.equalsIgnoreCase(name)) {
			return ship_rqst_dt_p();
		}
		if ($pd_inst_dlv_dt_p.equalsIgnoreCase(name)) {
			return pd_inst_dlv_dt_p();
		}
		if ($ship_schd_dt_p.equalsIgnoreCase(name)) {
			return ship_schd_dt_p();
		}
		if ($dlv_schd_dt_p.equalsIgnoreCase(name)) {
			return dlv_schd_dt_p();
		}
		if ($prms_dt_p.equalsIgnoreCase(name)) {
			return prms_dt_p();
		}
		if ($itm_typ_p.equalsIgnoreCase(name)) {
			return itm_typ_p();
		}
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($dlv_grp_p.equalsIgnoreCase(name)) {
			return dlv_grp_p();
		}
		if ($cst_grp_p.equalsIgnoreCase(name)) {
			return cst_grp_p();
		}
		if ($itm_grp_p.equalsIgnoreCase(name)) {
			return itm_grp_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($dlv_inst_dt_p.equalsIgnoreCase(name)) {
			dlv_inst_dt_p(
				((MCContainerMeta) dlv_inst_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class, value)
			);
			return;
		}
		if ($ship_rqst_dt_p.equalsIgnoreCase(name)) {
			ship_rqst_dt_p(
				((MCContainerMeta) ship_rqst_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class, value)
			);
			return;
		}
		if ($pd_inst_dlv_dt_p.equalsIgnoreCase(name)) {
			pd_inst_dlv_dt_p(
				((MCContainerMeta) pd_inst_dlv_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class, value)
			);
			return;
		}
		if ($ship_schd_dt_p.equalsIgnoreCase(name)) {
			ship_schd_dt_p(
				((MCContainerMeta) ship_schd_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class, value)
			);
			return;
		}
		if ($dlv_schd_dt_p.equalsIgnoreCase(name)) {
			dlv_schd_dt_p(
				((MCContainerMeta) dlv_schd_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class, value)
			);
			return;
		}
		if ($prms_dt_p.equalsIgnoreCase(name)) {
			prms_dt_p(
				((MCContainerMeta) prms_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class, value)
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
		if ($dlv_grp_p.equalsIgnoreCase(name)) {
			dlv_grp_p(
				((MCContainerMeta) dlv_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0260.BpGrpR.class, value)
			);
			return;
		}
		if ($cst_grp_p.equalsIgnoreCase(name)) {
			cst_grp_p(
				((MCContainerMeta) cst_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0260.BpGrpR.class, value)
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
	 * Delivery order date FROM 納入指示日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate dlv_inst_dt_fr() {
		return dlv_inst_dt_p().ymd_fr();
	}

	/**
	 * Delivery order date FROM 納入指示日ＦＲＯＭ.<p>
	 *
	 */
	public void dlv_inst_dt_fr(MCDate value) {
		dlv_inst_dt_p().ymd_fr(value);
	}

	/**
	 * Delivery order time FROM 納入指示時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate dlv_inst_hm_fr() {
		return dlv_inst_dt_p().hm_fr();
	}

	/**
	 * Delivery order time FROM 納入指示時刻ＦＲＯＭ.<p>
	 *
	 */
	public void dlv_inst_hm_fr(MCDate value) {
		dlv_inst_dt_p().hm_fr(value);
	}

	/**
	 * Delivery order date TO 納入指示日ＴＯ.<p>
	 *
	 */
	public MCDate dlv_inst_dt_to() {
		return dlv_inst_dt_p().ymd_to();
	}

	/**
	 * Delivery order date TO 納入指示日ＴＯ.<p>
	 *
	 */
	public void dlv_inst_dt_to(MCDate value) {
		dlv_inst_dt_p().ymd_to(value);
	}

	/**
	 * Delivery order time TO 納入指示時刻ＴＯ.<p>
	 *
	 */
	public MCDate dlv_inst_hm_to() {
		return dlv_inst_dt_p().hm_to();
	}

	/**
	 * Delivery order time TO 納入指示時刻ＴＯ.<p>
	 *
	 */
	public void dlv_inst_hm_to(MCDate value) {
		dlv_inst_dt_p().hm_to(value);
	}

	/**
	 * Desired shipping date FROM 出荷希望日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ship_rqst_dt_fr() {
		return ship_rqst_dt_p().ymd_fr();
	}

	/**
	 * Desired shipping date FROM 出荷希望日ＦＲＯＭ.<p>
	 *
	 */
	public void ship_rqst_dt_fr(MCDate value) {
		ship_rqst_dt_p().ymd_fr(value);
	}

	/**
	 * Desired shipping time FROM 出荷希望時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ship_rqst_hm_fr() {
		return ship_rqst_dt_p().hm_fr();
	}

	/**
	 * Desired shipping time FROM 出荷希望時刻ＦＲＯＭ.<p>
	 *
	 */
	public void ship_rqst_hm_fr(MCDate value) {
		ship_rqst_dt_p().hm_fr(value);
	}

	/**
	 * Desired shipping date TO 出荷希望日ＴＯ.<p>
	 *
	 */
	public MCDate ship_rqst_dt_to() {
		return ship_rqst_dt_p().ymd_to();
	}

	/**
	 * Desired shipping date TO 出荷希望日ＴＯ.<p>
	 *
	 */
	public void ship_rqst_dt_to(MCDate value) {
		ship_rqst_dt_p().ymd_to(value);
	}

	/**
	 * Desired shipping time TO 出荷希望時刻ＴＯ.<p>
	 *
	 */
	public MCDate ship_rqst_hm_to() {
		return ship_rqst_dt_p().hm_to();
	}

	/**
	 * Desired shipping time TO 出荷希望時刻ＴＯ.<p>
	 *
	 */
	public void ship_rqst_hm_to(MCDate value) {
		ship_rqst_dt_p().hm_to(value);
	}

	/**
	 * Delivery request date FROM 納品依頼日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate pd_inst_dlv_dt_fr() {
		return pd_inst_dlv_dt_p().ymd_fr();
	}

	/**
	 * Delivery request date FROM 納品依頼日ＦＲＯＭ.<p>
	 *
	 */
	public void pd_inst_dlv_dt_fr(MCDate value) {
		pd_inst_dlv_dt_p().ymd_fr(value);
	}

	/**
	 * Delivery request time FROM 納品依頼時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate pd_inst_dlv_hm_fr() {
		return pd_inst_dlv_dt_p().hm_fr();
	}

	/**
	 * Delivery request time FROM 納品依頼時刻ＦＲＯＭ.<p>
	 *
	 */
	public void pd_inst_dlv_hm_fr(MCDate value) {
		pd_inst_dlv_dt_p().hm_fr(value);
	}

	/**
	 * Delivery request date TO 納品依頼日ＴＯ.<p>
	 *
	 */
	public MCDate pd_inst_dlv_dt_to() {
		return pd_inst_dlv_dt_p().ymd_to();
	}

	/**
	 * Delivery request date TO 納品依頼日ＴＯ.<p>
	 *
	 */
	public void pd_inst_dlv_dt_to(MCDate value) {
		pd_inst_dlv_dt_p().ymd_to(value);
	}

	/**
	 * Delivery request time TO 納品依頼時刻ＴＯ.<p>
	 *
	 */
	public MCDate pd_inst_dlv_hm_to() {
		return pd_inst_dlv_dt_p().hm_to();
	}

	/**
	 * Delivery request time TO 納品依頼時刻ＴＯ.<p>
	 *
	 */
	public void pd_inst_dlv_hm_to(MCDate value) {
		pd_inst_dlv_dt_p().hm_to(value);
	}

	/**
	 * Scheduled shipping date FROM 出荷予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ship_schd_dt_fr() {
		return ship_schd_dt_p().ymd_fr();
	}

	/**
	 * Scheduled shipping date FROM 出荷予定日ＦＲＯＭ.<p>
	 *
	 */
	public void ship_schd_dt_fr(MCDate value) {
		ship_schd_dt_p().ymd_fr(value);
	}

	/**
	 * Shipping schedule time FROM 出荷予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ship_schd_hm_fr() {
		return ship_schd_dt_p().hm_fr();
	}

	/**
	 * Shipping schedule time FROM 出荷予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public void ship_schd_hm_fr(MCDate value) {
		ship_schd_dt_p().hm_fr(value);
	}

	/**
	 * Scheduled shipping date TO 出荷予定日ＴＯ.<p>
	 *
	 */
	public MCDate ship_schd_dt_to() {
		return ship_schd_dt_p().ymd_to();
	}

	/**
	 * Scheduled shipping date TO 出荷予定日ＴＯ.<p>
	 *
	 */
	public void ship_schd_dt_to(MCDate value) {
		ship_schd_dt_p().ymd_to(value);
	}

	/**
	 * Shipping schedule time TO 出荷予定時刻ＴＯ.<p>
	 *
	 */
	public MCDate ship_schd_hm_to() {
		return ship_schd_dt_p().hm_to();
	}

	/**
	 * Shipping schedule time TO 出荷予定時刻ＴＯ.<p>
	 *
	 */
	public void ship_schd_hm_to(MCDate value) {
		ship_schd_dt_p().hm_to(value);
	}

	/**
	 * Scheduled delivery date FROM 納品予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate dlv_schd_dt_fr() {
		return dlv_schd_dt_p().ymd_fr();
	}

	/**
	 * Scheduled delivery date FROM 納品予定日ＦＲＯＭ.<p>
	 *
	 */
	public void dlv_schd_dt_fr(MCDate value) {
		dlv_schd_dt_p().ymd_fr(value);
	}

	/**
	 * Scheduled delivery time FROM 納品予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate dlv_schd_hm_fr() {
		return dlv_schd_dt_p().hm_fr();
	}

	/**
	 * Scheduled delivery time FROM 納品予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public void dlv_schd_hm_fr(MCDate value) {
		dlv_schd_dt_p().hm_fr(value);
	}

	/**
	 * Scheduled delivery date TO 納品予定日ＴＯ.<p>
	 *
	 */
	public MCDate dlv_schd_dt_to() {
		return dlv_schd_dt_p().ymd_to();
	}

	/**
	 * Scheduled delivery date TO 納品予定日ＴＯ.<p>
	 *
	 */
	public void dlv_schd_dt_to(MCDate value) {
		dlv_schd_dt_p().ymd_to(value);
	}

	/**
	 * Scheduled delivery time TO 納品予定時刻ＴＯ.<p>
	 *
	 */
	public MCDate dlv_schd_hm_to() {
		return dlv_schd_dt_p().hm_to();
	}

	/**
	 * Scheduled delivery time TO 納品予定時刻ＴＯ.<p>
	 *
	 */
	public void dlv_schd_hm_to(MCDate value) {
		dlv_schd_dt_p().hm_to(value);
	}

	/**
	 * Replied delivery date FROM 回答納入日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate prms_dt_fr() {
		return prms_dt_p().ymd_fr();
	}

	/**
	 * Replied delivery date FROM 回答納入日ＦＲＯＭ.<p>
	 *
	 */
	public void prms_dt_fr(MCDate value) {
		prms_dt_p().ymd_fr(value);
	}

	/**
	 * Replied delivery time FROM 回答納入時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate prms_hm_fr() {
		return prms_dt_p().hm_fr();
	}

	/**
	 * Replied delivery time FROM 回答納入時刻ＦＲＯＭ.<p>
	 *
	 */
	public void prms_hm_fr(MCDate value) {
		prms_dt_p().hm_fr(value);
	}

	/**
	 * Replied delivery date TO 回答納入日ＴＯ.<p>
	 *
	 */
	public MCDate prms_dt_to() {
		return prms_dt_p().ymd_to();
	}

	/**
	 * Replied delivery date TO 回答納入日ＴＯ.<p>
	 *
	 */
	public void prms_dt_to(MCDate value) {
		prms_dt_p().ymd_to(value);
	}

	/**
	 * Replied delivery time TO 回答納入時刻ＴＯ.<p>
	 *
	 */
	public MCDate prms_hm_to() {
		return prms_dt_p().hm_to();
	}

	/**
	 * Replied delivery time TO 回答納入時刻ＴＯ.<p>
	 *
	 */
	public void prms_hm_to(MCDate value) {
		prms_dt_p().hm_to(value);
	}

	public String itm_typ() {
		return itm_typ_p().itm_typ();
	}

	public void itm_typ(String value) {
		itm_typ_p().itm_typ(value);
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
	 * Delivery destination classification 1 納品先分類１.<p>
	 *
	 */
	public boolean dlv_grp_flg1() {
		return dlv_grp_p().bp_grp_flg1();
	}

	/**
	 * Delivery destination classification 1 納品先分類１.<p>
	 *
	 */
	public void dlv_grp_flg1(boolean value) {
		dlv_grp_p().bp_grp_flg1(value);
	}

	/**
	 * Delivery destination classification cd. 1 納品先分類ＣＤ１.<p>
	 *
	 */
	public String dlv_grp_cd1() {
		return dlv_grp_p().bp_grp_cd1();
	}

	/**
	 * Delivery destination classification cd. 1 納品先分類ＣＤ１.<p>
	 *
	 */
	public void dlv_grp_cd1(String value) {
		dlv_grp_p().bp_grp_cd1(value);
	}

	/**
	 * Delivery destination classification name 1 納品先分類名１.<p>
	 *
	 */
	public String dlv_grp_nm1() {
		return dlv_grp_p().bp_grp_nm1();
	}

	/**
	 * Delivery destination classification name 1 納品先分類名１.<p>
	 *
	 */
	public void dlv_grp_nm1(String value) {
		dlv_grp_p().bp_grp_nm1(value);
	}

	/**
	 * Delivery destination classification 2 納品先分類２.<p>
	 *
	 */
	public boolean dlv_grp_flg2() {
		return dlv_grp_p().bp_grp_flg2();
	}

	/**
	 * Delivery destination classification 2 納品先分類２.<p>
	 *
	 */
	public void dlv_grp_flg2(boolean value) {
		dlv_grp_p().bp_grp_flg2(value);
	}

	/**
	 * Delivery destination classification cd. 2 納品先分類ＣＤ２.<p>
	 *
	 */
	public String dlv_grp_cd2() {
		return dlv_grp_p().bp_grp_cd2();
	}

	/**
	 * Delivery destination classification cd. 2 納品先分類ＣＤ２.<p>
	 *
	 */
	public void dlv_grp_cd2(String value) {
		dlv_grp_p().bp_grp_cd2(value);
	}

	/**
	 * Delivery destination classification name 2 納品先分類名２.<p>
	 *
	 */
	public String dlv_grp_nm2() {
		return dlv_grp_p().bp_grp_nm2();
	}

	/**
	 * Delivery destination classification name 2 納品先分類名２.<p>
	 *
	 */
	public void dlv_grp_nm2(String value) {
		dlv_grp_p().bp_grp_nm2(value);
	}

	/**
	 * Delivery destination classification 3 納品先分類３.<p>
	 *
	 */
	public boolean dlv_grp_flg3() {
		return dlv_grp_p().bp_grp_flg3();
	}

	/**
	 * Delivery destination classification 3 納品先分類３.<p>
	 *
	 */
	public void dlv_grp_flg3(boolean value) {
		dlv_grp_p().bp_grp_flg3(value);
	}

	/**
	 * Delivery destination classification cd. 3 納品先分類ＣＤ３.<p>
	 *
	 */
	public String dlv_grp_cd3() {
		return dlv_grp_p().bp_grp_cd3();
	}

	/**
	 * Delivery destination classification cd. 3 納品先分類ＣＤ３.<p>
	 *
	 */
	public void dlv_grp_cd3(String value) {
		dlv_grp_p().bp_grp_cd3(value);
	}

	/**
	 * Delivery destination classification name 3 納品先分類名３.<p>
	 *
	 */
	public String dlv_grp_nm3() {
		return dlv_grp_p().bp_grp_nm3();
	}

	/**
	 * Delivery destination classification name 3 納品先分類名３.<p>
	 *
	 */
	public void dlv_grp_nm3(String value) {
		dlv_grp_p().bp_grp_nm3(value);
	}

	/**
	 * Delivery destination classification 4 納品先分類４.<p>
	 *
	 */
	public boolean dlv_grp_flg4() {
		return dlv_grp_p().bp_grp_flg4();
	}

	/**
	 * Delivery destination classification 4 納品先分類４.<p>
	 *
	 */
	public void dlv_grp_flg4(boolean value) {
		dlv_grp_p().bp_grp_flg4(value);
	}

	/**
	 * Delivery destination classification cd. 4 納品先分類ＣＤ４.<p>
	 *
	 */
	public String dlv_grp_cd4() {
		return dlv_grp_p().bp_grp_cd4();
	}

	/**
	 * Delivery destination classification cd. 4 納品先分類ＣＤ４.<p>
	 *
	 */
	public void dlv_grp_cd4(String value) {
		dlv_grp_p().bp_grp_cd4(value);
	}

	/**
	 * Delivery destination classification name 4 納品先分類名４.<p>
	 *
	 */
	public String dlv_grp_nm4() {
		return dlv_grp_p().bp_grp_nm4();
	}

	/**
	 * Delivery destination classification name 4 納品先分類名４.<p>
	 *
	 */
	public void dlv_grp_nm4(String value) {
		dlv_grp_p().bp_grp_nm4(value);
	}

	/**
	 * Delivery destination classification 5 納品先分類５.<p>
	 *
	 */
	public boolean dlv_grp_flg5() {
		return dlv_grp_p().bp_grp_flg5();
	}

	/**
	 * Delivery destination classification 5 納品先分類５.<p>
	 *
	 */
	public void dlv_grp_flg5(boolean value) {
		dlv_grp_p().bp_grp_flg5(value);
	}

	/**
	 * Delivery destination classification cd. 5 納品先分類ＣＤ５.<p>
	 *
	 */
	public String dlv_grp_cd5() {
		return dlv_grp_p().bp_grp_cd5();
	}

	/**
	 * Delivery destination classification cd. 5 納品先分類ＣＤ５.<p>
	 *
	 */
	public void dlv_grp_cd5(String value) {
		dlv_grp_p().bp_grp_cd5(value);
	}

	/**
	 * Delivery destination classification name 5 納品先分類名５.<p>
	 *
	 */
	public String dlv_grp_nm5() {
		return dlv_grp_p().bp_grp_nm5();
	}

	/**
	 * Delivery destination classification name 5 納品先分類名５.<p>
	 *
	 */
	public void dlv_grp_nm5(String value) {
		dlv_grp_p().bp_grp_nm5(value);
	}

	/**
	 * Delivery destination classification 6 納品先分類６.<p>
	 *
	 */
	public boolean dlv_grp_flg6() {
		return dlv_grp_p().bp_grp_flg6();
	}

	/**
	 * Delivery destination classification 6 納品先分類６.<p>
	 *
	 */
	public void dlv_grp_flg6(boolean value) {
		dlv_grp_p().bp_grp_flg6(value);
	}

	/**
	 * Delivery destination classification cd. 6 納品先分類ＣＤ６.<p>
	 *
	 */
	public String dlv_grp_cd6() {
		return dlv_grp_p().bp_grp_cd6();
	}

	/**
	 * Delivery destination classification cd. 6 納品先分類ＣＤ６.<p>
	 *
	 */
	public void dlv_grp_cd6(String value) {
		dlv_grp_p().bp_grp_cd6(value);
	}

	/**
	 * Delivery destination classification name 6 納品先分類名６.<p>
	 *
	 */
	public String dlv_grp_nm6() {
		return dlv_grp_p().bp_grp_nm6();
	}

	/**
	 * Delivery destination classification name 6 納品先分類名６.<p>
	 *
	 */
	public void dlv_grp_nm6(String value) {
		dlv_grp_p().bp_grp_nm6(value);
	}

	/**
	 * Delivery destination classification 7 納品先分類７.<p>
	 *
	 */
	public boolean dlv_grp_flg7() {
		return dlv_grp_p().bp_grp_flg7();
	}

	/**
	 * Delivery destination classification 7 納品先分類７.<p>
	 *
	 */
	public void dlv_grp_flg7(boolean value) {
		dlv_grp_p().bp_grp_flg7(value);
	}

	/**
	 * Delivery destination classification cd. 7 納品先分類ＣＤ７.<p>
	 *
	 */
	public String dlv_grp_cd7() {
		return dlv_grp_p().bp_grp_cd7();
	}

	/**
	 * Delivery destination classification cd. 7 納品先分類ＣＤ７.<p>
	 *
	 */
	public void dlv_grp_cd7(String value) {
		dlv_grp_p().bp_grp_cd7(value);
	}

	/**
	 * Delivery destination classification name 7 納品先分類名７.<p>
	 *
	 */
	public String dlv_grp_nm7() {
		return dlv_grp_p().bp_grp_nm7();
	}

	/**
	 * Delivery destination classification name 7 納品先分類名７.<p>
	 *
	 */
	public void dlv_grp_nm7(String value) {
		dlv_grp_p().bp_grp_nm7(value);
	}

	/**
	 * Delivery destination classification 8 納品先分類８.<p>
	 *
	 */
	public boolean dlv_grp_flg8() {
		return dlv_grp_p().bp_grp_flg8();
	}

	/**
	 * Delivery destination classification 8 納品先分類８.<p>
	 *
	 */
	public void dlv_grp_flg8(boolean value) {
		dlv_grp_p().bp_grp_flg8(value);
	}

	/**
	 * Delivery destination classification cd. 8 納品先分類ＣＤ８.<p>
	 *
	 */
	public String dlv_grp_cd8() {
		return dlv_grp_p().bp_grp_cd8();
	}

	/**
	 * Delivery destination classification cd. 8 納品先分類ＣＤ８.<p>
	 *
	 */
	public void dlv_grp_cd8(String value) {
		dlv_grp_p().bp_grp_cd8(value);
	}

	/**
	 * Delivery destination classification name 8 納品先分類名８.<p>
	 *
	 */
	public String dlv_grp_nm8() {
		return dlv_grp_p().bp_grp_nm8();
	}

	/**
	 * Delivery destination classification name 8 納品先分類名８.<p>
	 *
	 */
	public void dlv_grp_nm8(String value) {
		dlv_grp_p().bp_grp_nm8(value);
	}

	/**
	 * Delivery destination classification 9 納品先分類９.<p>
	 *
	 */
	public boolean dlv_grp_flg9() {
		return dlv_grp_p().bp_grp_flg9();
	}

	/**
	 * Delivery destination classification 9 納品先分類９.<p>
	 *
	 */
	public void dlv_grp_flg9(boolean value) {
		dlv_grp_p().bp_grp_flg9(value);
	}

	/**
	 * Delivery destination classification cd. 9 納品先分類ＣＤ９.<p>
	 *
	 */
	public String dlv_grp_cd9() {
		return dlv_grp_p().bp_grp_cd9();
	}

	/**
	 * Delivery destination classification cd. 9 納品先分類ＣＤ９.<p>
	 *
	 */
	public void dlv_grp_cd9(String value) {
		dlv_grp_p().bp_grp_cd9(value);
	}

	/**
	 * Delivery destination classification name 9 納品先分類名９.<p>
	 *
	 */
	public String dlv_grp_nm9() {
		return dlv_grp_p().bp_grp_nm9();
	}

	/**
	 * Delivery destination classification name 9 納品先分類名９.<p>
	 *
	 */
	public void dlv_grp_nm9(String value) {
		dlv_grp_p().bp_grp_nm9(value);
	}

	/**
	 * Delivery destination classification 10 納品先分類１０.<p>
	 *
	 */
	public boolean dlv_grp_flg10() {
		return dlv_grp_p().bp_grp_flg10();
	}

	/**
	 * Delivery destination classification 10 納品先分類１０.<p>
	 *
	 */
	public void dlv_grp_flg10(boolean value) {
		dlv_grp_p().bp_grp_flg10(value);
	}

	/**
	 * Delivery destination classification cd. 10 納品先分類ＣＤ１０.<p>
	 *
	 */
	public String dlv_grp_cd10() {
		return dlv_grp_p().bp_grp_cd10();
	}

	/**
	 * Delivery destination classification cd. 10 納品先分類ＣＤ１０.<p>
	 *
	 */
	public void dlv_grp_cd10(String value) {
		dlv_grp_p().bp_grp_cd10(value);
	}

	/**
	 * Delivery destination classification name 10 納品先分類名１０.<p>
	 *
	 */
	public String dlv_grp_nm10() {
		return dlv_grp_p().bp_grp_nm10();
	}

	/**
	 * Delivery destination classification name 10 納品先分類名１０.<p>
	 *
	 */
	public void dlv_grp_nm10(String value) {
		dlv_grp_p().bp_grp_nm10(value);
	}

	/**
	 * Customer classification 1 得意先分類１.<p>
	 *
	 */
	public boolean cst_grp_flg1() {
		return cst_grp_p().bp_grp_flg1();
	}

	/**
	 * Customer classification 1 得意先分類１.<p>
	 *
	 */
	public void cst_grp_flg1(boolean value) {
		cst_grp_p().bp_grp_flg1(value);
	}

	/**
	 * Customer classification cd. 1 得意先分類ＣＤ１.<p>
	 *
	 */
	public String cst_grp_cd1() {
		return cst_grp_p().bp_grp_cd1();
	}

	/**
	 * Customer classification cd. 1 得意先分類ＣＤ１.<p>
	 *
	 */
	public void cst_grp_cd1(String value) {
		cst_grp_p().bp_grp_cd1(value);
	}

	/**
	 * Customer classification name 1 得意先分類名１.<p>
	 *
	 */
	public String cst_grp_nm1() {
		return cst_grp_p().bp_grp_nm1();
	}

	/**
	 * Customer classification name 1 得意先分類名１.<p>
	 *
	 */
	public void cst_grp_nm1(String value) {
		cst_grp_p().bp_grp_nm1(value);
	}

	/**
	 * Customer classification 2 得意先分類２.<p>
	 *
	 */
	public boolean cst_grp_flg2() {
		return cst_grp_p().bp_grp_flg2();
	}

	/**
	 * Customer classification 2 得意先分類２.<p>
	 *
	 */
	public void cst_grp_flg2(boolean value) {
		cst_grp_p().bp_grp_flg2(value);
	}

	/**
	 * Customer classification cd. 2 得意先分類ＣＤ２.<p>
	 *
	 */
	public String cst_grp_cd2() {
		return cst_grp_p().bp_grp_cd2();
	}

	/**
	 * Customer classification cd. 2 得意先分類ＣＤ２.<p>
	 *
	 */
	public void cst_grp_cd2(String value) {
		cst_grp_p().bp_grp_cd2(value);
	}

	/**
	 * Customer classification name 2 得意先分類名２.<p>
	 *
	 */
	public String cst_grp_nm2() {
		return cst_grp_p().bp_grp_nm2();
	}

	/**
	 * Customer classification name 2 得意先分類名２.<p>
	 *
	 */
	public void cst_grp_nm2(String value) {
		cst_grp_p().bp_grp_nm2(value);
	}

	/**
	 * Customer classification 3 得意先分類３.<p>
	 *
	 */
	public boolean cst_grp_flg3() {
		return cst_grp_p().bp_grp_flg3();
	}

	/**
	 * Customer classification 3 得意先分類３.<p>
	 *
	 */
	public void cst_grp_flg3(boolean value) {
		cst_grp_p().bp_grp_flg3(value);
	}

	/**
	 * Customer classification cd. 3 得意先分類ＣＤ３.<p>
	 *
	 */
	public String cst_grp_cd3() {
		return cst_grp_p().bp_grp_cd3();
	}

	/**
	 * Customer classification cd. 3 得意先分類ＣＤ３.<p>
	 *
	 */
	public void cst_grp_cd3(String value) {
		cst_grp_p().bp_grp_cd3(value);
	}

	/**
	 * Customer classification name 3 得意先分類名３.<p>
	 *
	 */
	public String cst_grp_nm3() {
		return cst_grp_p().bp_grp_nm3();
	}

	/**
	 * Customer classification name 3 得意先分類名３.<p>
	 *
	 */
	public void cst_grp_nm3(String value) {
		cst_grp_p().bp_grp_nm3(value);
	}

	/**
	 * Customer classification 4 得意先分類４.<p>
	 *
	 */
	public boolean cst_grp_flg4() {
		return cst_grp_p().bp_grp_flg4();
	}

	/**
	 * Customer classification 4 得意先分類４.<p>
	 *
	 */
	public void cst_grp_flg4(boolean value) {
		cst_grp_p().bp_grp_flg4(value);
	}

	/**
	 * Customer classification cd. 4 得意先分類ＣＤ４.<p>
	 *
	 */
	public String cst_grp_cd4() {
		return cst_grp_p().bp_grp_cd4();
	}

	/**
	 * Customer classification cd. 4 得意先分類ＣＤ４.<p>
	 *
	 */
	public void cst_grp_cd4(String value) {
		cst_grp_p().bp_grp_cd4(value);
	}

	/**
	 * Customer classification name 4 得意先分類名４.<p>
	 *
	 */
	public String cst_grp_nm4() {
		return cst_grp_p().bp_grp_nm4();
	}

	/**
	 * Customer classification name 4 得意先分類名４.<p>
	 *
	 */
	public void cst_grp_nm4(String value) {
		cst_grp_p().bp_grp_nm4(value);
	}

	/**
	 * Customer classification 5 得意先分類５.<p>
	 *
	 */
	public boolean cst_grp_flg5() {
		return cst_grp_p().bp_grp_flg5();
	}

	/**
	 * Customer classification 5 得意先分類５.<p>
	 *
	 */
	public void cst_grp_flg5(boolean value) {
		cst_grp_p().bp_grp_flg5(value);
	}

	/**
	 * Customer classification cd. 5 得意先分類ＣＤ５.<p>
	 *
	 */
	public String cst_grp_cd5() {
		return cst_grp_p().bp_grp_cd5();
	}

	/**
	 * Customer classification cd. 5 得意先分類ＣＤ５.<p>
	 *
	 */
	public void cst_grp_cd5(String value) {
		cst_grp_p().bp_grp_cd5(value);
	}

	/**
	 * Customer classification name 5 得意先分類名５.<p>
	 *
	 */
	public String cst_grp_nm5() {
		return cst_grp_p().bp_grp_nm5();
	}

	/**
	 * Customer classification name 5 得意先分類名５.<p>
	 *
	 */
	public void cst_grp_nm5(String value) {
		cst_grp_p().bp_grp_nm5(value);
	}

	/**
	 * Customer classification 6 得意先分類６.<p>
	 *
	 */
	public boolean cst_grp_flg6() {
		return cst_grp_p().bp_grp_flg6();
	}

	/**
	 * Customer classification 6 得意先分類６.<p>
	 *
	 */
	public void cst_grp_flg6(boolean value) {
		cst_grp_p().bp_grp_flg6(value);
	}

	/**
	 * Customer classification cd. 6 得意先分類ＣＤ６.<p>
	 *
	 */
	public String cst_grp_cd6() {
		return cst_grp_p().bp_grp_cd6();
	}

	/**
	 * Customer classification cd. 6 得意先分類ＣＤ６.<p>
	 *
	 */
	public void cst_grp_cd6(String value) {
		cst_grp_p().bp_grp_cd6(value);
	}

	/**
	 * Customer classification name 6 得意先分類名６.<p>
	 *
	 */
	public String cst_grp_nm6() {
		return cst_grp_p().bp_grp_nm6();
	}

	/**
	 * Customer classification name 6 得意先分類名６.<p>
	 *
	 */
	public void cst_grp_nm6(String value) {
		cst_grp_p().bp_grp_nm6(value);
	}

	/**
	 * Customer classification 7 得意先分類７.<p>
	 *
	 */
	public boolean cst_grp_flg7() {
		return cst_grp_p().bp_grp_flg7();
	}

	/**
	 * Customer classification 7 得意先分類７.<p>
	 *
	 */
	public void cst_grp_flg7(boolean value) {
		cst_grp_p().bp_grp_flg7(value);
	}

	/**
	 * Customer classification cd. 7 得意先分類ＣＤ７.<p>
	 *
	 */
	public String cst_grp_cd7() {
		return cst_grp_p().bp_grp_cd7();
	}

	/**
	 * Customer classification cd. 7 得意先分類ＣＤ７.<p>
	 *
	 */
	public void cst_grp_cd7(String value) {
		cst_grp_p().bp_grp_cd7(value);
	}

	/**
	 * Customer classification name 7 得意先分類名７.<p>
	 *
	 */
	public String cst_grp_nm7() {
		return cst_grp_p().bp_grp_nm7();
	}

	/**
	 * Customer classification name 7 得意先分類名７.<p>
	 *
	 */
	public void cst_grp_nm7(String value) {
		cst_grp_p().bp_grp_nm7(value);
	}

	/**
	 * Customer classification 8 得意先分類８.<p>
	 *
	 */
	public boolean cst_grp_flg8() {
		return cst_grp_p().bp_grp_flg8();
	}

	/**
	 * Customer classification 8 得意先分類８.<p>
	 *
	 */
	public void cst_grp_flg8(boolean value) {
		cst_grp_p().bp_grp_flg8(value);
	}

	/**
	 * Customer classification cd. 8 得意先分類ＣＤ８.<p>
	 *
	 */
	public String cst_grp_cd8() {
		return cst_grp_p().bp_grp_cd8();
	}

	/**
	 * Customer classification cd. 8 得意先分類ＣＤ８.<p>
	 *
	 */
	public void cst_grp_cd8(String value) {
		cst_grp_p().bp_grp_cd8(value);
	}

	/**
	 * Customer classification name 8 得意先分類名８.<p>
	 *
	 */
	public String cst_grp_nm8() {
		return cst_grp_p().bp_grp_nm8();
	}

	/**
	 * Customer classification name 8 得意先分類名８.<p>
	 *
	 */
	public void cst_grp_nm8(String value) {
		cst_grp_p().bp_grp_nm8(value);
	}

	/**
	 * Customer classification 9 得意先分類９.<p>
	 *
	 */
	public boolean cst_grp_flg9() {
		return cst_grp_p().bp_grp_flg9();
	}

	/**
	 * Customer classification 9 得意先分類９.<p>
	 *
	 */
	public void cst_grp_flg9(boolean value) {
		cst_grp_p().bp_grp_flg9(value);
	}

	/**
	 * Customer classification cd. 9 得意先分類ＣＤ９.<p>
	 *
	 */
	public String cst_grp_cd9() {
		return cst_grp_p().bp_grp_cd9();
	}

	/**
	 * Customer classification cd. 9 得意先分類ＣＤ９.<p>
	 *
	 */
	public void cst_grp_cd9(String value) {
		cst_grp_p().bp_grp_cd9(value);
	}

	/**
	 * Customer classification name 9 得意先分類名９.<p>
	 *
	 */
	public String cst_grp_nm9() {
		return cst_grp_p().bp_grp_nm9();
	}

	/**
	 * Customer classification name 9 得意先分類名９.<p>
	 *
	 */
	public void cst_grp_nm9(String value) {
		cst_grp_p().bp_grp_nm9(value);
	}

	/**
	 * Customer classification 10 得意先分類１０.<p>
	 *
	 */
	public boolean cst_grp_flg10() {
		return cst_grp_p().bp_grp_flg10();
	}

	/**
	 * Customer classification 10 得意先分類１０.<p>
	 *
	 */
	public void cst_grp_flg10(boolean value) {
		cst_grp_p().bp_grp_flg10(value);
	}

	/**
	 * Customer classification cd. 10 得意先分類ＣＤ１０.<p>
	 *
	 */
	public String cst_grp_cd10() {
		return cst_grp_p().bp_grp_cd10();
	}

	/**
	 * Customer classification cd. 10 得意先分類ＣＤ１０.<p>
	 *
	 */
	public void cst_grp_cd10(String value) {
		cst_grp_p().bp_grp_cd10(value);
	}

	/**
	 * Customer classification name 10 得意先分類名１０.<p>
	 *
	 */
	public String cst_grp_nm10() {
		return cst_grp_p().bp_grp_nm10();
	}

	/**
	 * Customer classification name 10 得意先分類名１０.<p>
	 *
	 */
	public void cst_grp_nm10(String value) {
		cst_grp_p().bp_grp_nm10(value);
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

