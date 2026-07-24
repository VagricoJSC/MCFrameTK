package mcframe.clientMSBE.MSBEP2430;

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
	 * REF2,View order,2;REF3,View result,3;PRNT_ACXFR,Issue transfer slip,5; REF2,指図を参照する,2;REF3,実績を参照する,3;PRNT_ACXFR,振替伝票発行,5;.<p>
	 *
	 */
	public static final String $ope = "ope";
	/**
	 * Unordered 未指図.<p>
	 *
	 */
	public static final String $not_inst_flg = "not_inst_flg";
	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public static final String $inst_flg = "inst_flg";
	/**
	 * Partially completed 一部完了.<p>
	 *
	 */
	public static final String $part_comp_flg = "part_comp_flg";
	/**
	 * Completed 完了.<p>
	 *
	 */
	public static final String $comp_flg = "comp_flg";
	/**
	 * Target 対象.<p>
	 *
	 */
	public static final String $wms_flg = "wms_flg";
	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public static final String $not_wms_flg = "not_wms_flg";
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
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public static final String $trd_ptn_typ = "trd_ptn_typ";
	/**
	 * WG ＷＧ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * WG name ＷＧ名.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
	/**
	 * Other accounting transfer schedule No. 他勘定振替予定ＮＯ.<p>
	 *
	 */
	public static final String $acxfr_schd_no = "acxfr_schd_no";
	/**
	 * Other accounting transfer order No. 他勘定振替指図ＮＯ.<p>
	 *
	 */
	public static final String $acxfr_inst_no = "acxfr_inst_no";
	/**
	 * Other accounting transfer order details No. 他勘定振替指図明細ＮＯ.<p>
	 *
	 */
	public static final String $acxfr_inst_d_no = "acxfr_inst_d_no";
	/**
	 * Other accounting transfer result No. 他勘定振替実績ＮＯ.<p>
	 *
	 */
	public static final String $acxfr_act_no = "acxfr_act_no";
	/**
	 * Other accounting transfer result details No. 他勘定振替実績明細ＮＯ.<p>
	 *
	 */
	public static final String $acxfr_act_d_no = "acxfr_act_d_no";
	/**
	 * External other accounting transfer result No. 外部他勘定振替実績ＮＯ.<p>
	 *
	 */
	public static final String $ext_acxfr_act_no = "ext_acxfr_act_no";
	/**
	 * Include cancel remaining 打切含む.<p>
	 *
	 */
	public static final String $abort_flg = "abort_flg";
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public static final String $loc_nm = "loc_nm";
	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $str_ln_cd = "str_ln_cd";
	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public static final String $str_ln_nm = "str_ln_nm";
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
	public static final String $sno_p = "sno_p";
	/**
	 * Location group cd. 場所グループＣＤ.<p>
	 *
	 */
	public static final String $loc_grp_cd = "loc_grp_cd";
	/**
	 * Location group name 場所グループ名.<p>
	 *
	 */
	public static final String $loc_grp_nm = "loc_grp_nm";
	/**
	 * Charged dept. 負担部門.<p>
	 *
	 */
	public static final String $bd_dpt_cd = "bd_dpt_cd";
	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public static final String $bd_dpt_nm = "bd_dpt_nm";
	/**
	 * Transfer requested date 振替依頼日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $rqst_dt_fr = "rqst_dt_fr";
	/**
	 * Transfer request date TO 振替依頼日ＴＯ.<p>
	 *
	 */
	public static final String $rqst_dt_to = "rqst_dt_to";
	/**
	 * Scheduled transfer date FROM 振替予定日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $acxfr_schd_dt_fr = "acxfr_schd_dt_fr";
	/**
	 * Scheduled transfer date TO 振替予定日ＴＯ.<p>
	 *
	 */
	public static final String $acxfr_schd_dt_to = "acxfr_schd_dt_to";
	/**
	 * Transfer order date FROM 振替指図日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $acxfr_inst_dt_fr = "acxfr_inst_dt_fr";
	/**
	 * Transfer order date TO 振替指図日ＴＯ.<p>
	 *
	 */
	public static final String $acxfr_inst_dt_to = "acxfr_inst_dt_to";
	public static final String $acxfr_act_dt_p = "acxfr_act_dt_p";
	/**
	 * Transfer recording date FROM 振替計上日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $ac_dt_fr = "ac_dt_fr";
	/**
	 * Transfer recording date TO 振替計上日ＴＯ.<p>
	 *
	 */
	public static final String $ac_dt_to = "ac_dt_to";
	/**
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public static final String $rsn_cd = "rsn_cd";
	/**
	 * Reason name 理由名.<p>
	 *
	 */
	public static final String $rsn_nm = "rsn_nm";
	/**
	 * Disposal application No. 廃棄申請ＮＯ.<p>
	 *
	 */
	public static final String $dspsl_no = "dspsl_no";
	/**
	 * Include scheduled unapproved 予定未承認含む.<p>
	 *
	 */
	public static final String $schd_no_aprv_flg = "schd_no_aprv_flg";
	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public static final String $rqst_usr_cd = "rqst_usr_cd";
	/**
	 * Requesting PIC name 依頼元担当者名.<p>
	 *
	 */
	public static final String $rqst_usr_nm = "rqst_usr_nm";
	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public static final String $rqst_dpt_cd = "rqst_dpt_cd";
	/**
	 * Requesting dept. name 依頼元部門名.<p>
	 *
	 */
	public static final String $rqst_dpt_nm = "rqst_dpt_nm";
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
	 * Implementation PIC cd. 実施担当者ＣＤ.<p>
	 *
	 */
	public static final String $act_usr_cd = "act_usr_cd";
	/**
	 * Implementation PC name 実施担当者名.<p>
	 *
	 */
	public static final String $act_usr_nm = "act_usr_nm";
	/**
	 * Implement dept. cd. 実施部門ＣＤ.<p>
	 *
	 */
	public static final String $act_dpt_cd = "act_dpt_cd";
	/**
	 * Implement dept. name 実施部門名.<p>
	 *
	 */
	public static final String $act_dpt_nm = "act_dpt_nm";
	/**
	 * Transaction details remarks (Schedule) 取引明細備考（予定）.<p>
	 *
	 */
	public static final String $schd_trd_d_rmrks = "schd_trd_d_rmrks";
	/**
	 * Disposal request remarks (schedule) 廃棄申請備考（予定）.<p>
	 *
	 */
	public static final String $schd_dspsl_rmrks = "schd_dspsl_rmrks";
	/**
	 * Spare 1 (Schedule) 予備１（予定）.<p>
	 *
	 */
	public static final String $schd_sub_char1 = "schd_sub_char1";
	/**
	 * Spare 2 (Schedule) 予備２（予定）.<p>
	 *
	 */
	public static final String $schd_sub_char2 = "schd_sub_char2";
	/**
	 * Spare 3 (Schedule) 予備３（予定）.<p>
	 *
	 */
	public static final String $schd_sub_char3 = "schd_sub_char3";
	/**
	 * Internal remarks (Order header) 内部備考（指図ヘッダ）.<p>
	 *
	 */
	public static final String $inst_intr_rmrks = "inst_intr_rmrks";
	/**
	 * Transaction remarks (Order header) 取引備考（指図ヘッダ）.<p>
	 *
	 */
	public static final String $inst_trd_rmrks = "inst_trd_rmrks";
	/**
	 * Order remarks (Order header) 指図備考（指図ヘッダ）.<p>
	 *
	 */
	public static final String $inst_rmrks = "inst_rmrks";
	/**
	 * Spare 1 (Order header) 予備１（指図ヘッダ）.<p>
	 *
	 */
	public static final String $inst_sub_char1 = "inst_sub_char1";
	/**
	 * Spare 2 (Order header) 予備２（指図ヘッダ）.<p>
	 *
	 */
	public static final String $inst_sub_char2 = "inst_sub_char2";
	/**
	 * Spare 3 (Order header) 予備３（指図ヘッダ）.<p>
	 *
	 */
	public static final String $inst_sub_char3 = "inst_sub_char3";
	/**
	 * Internal details remarks (Order details) 内部明細備考（指図明細）.<p>
	 *
	 */
	public static final String $inst_intr_d_rmrks = "inst_intr_d_rmrks";
	/**
	 * Transaction details remarks (Order details) 取引明細備考（指図明細）.<p>
	 *
	 */
	public static final String $inst_trd_d_rmrks = "inst_trd_d_rmrks";
	/**
	 * Order details remarks (Details) 指図明細備考（指図明細）.<p>
	 *
	 */
	public static final String $inst_d_rmrks = "inst_d_rmrks";
	/**
	 * Spare 1 (Order details) 予備１（指図明細）.<p>
	 *
	 */
	public static final String $inst_d_sub_char1 = "inst_d_sub_char1";
	/**
	 * Spare 2 (Order details) 予備２（指図明細）.<p>
	 *
	 */
	public static final String $inst_d_sub_char2 = "inst_d_sub_char2";
	/**
	 * Spare 3 (Order details) 予備３（指図明細）.<p>
	 *
	 */
	public static final String $inst_d_sub_char3 = "inst_d_sub_char3";
	/**
	 * Internal remarks (Result header) 内部備考（実績ヘッダ）.<p>
	 *
	 */
	public static final String $act_intr_rmrks = "act_intr_rmrks";
	/**
	 * Transaction remarks (Result header) 取引備考（実績ヘッダ）.<p>
	 *
	 */
	public static final String $act_trd_rmrks = "act_trd_rmrks";
	/**
	 * Spare 1 (Result header) 予備１（実績ヘッダ）.<p>
	 *
	 */
	public static final String $act_sub_char1 = "act_sub_char1";
	/**
	 * Spare 2 (Result header) 予備２（実績ヘッダ）.<p>
	 *
	 */
	public static final String $act_sub_char2 = "act_sub_char2";
	/**
	 * Spare 3 (Result header) 予備３（実績ヘッダ）.<p>
	 *
	 */
	public static final String $act_sub_char3 = "act_sub_char3";
	/**
	 * Internal details remarks (Result details) 内部明細備考（実績明細）.<p>
	 *
	 */
	public static final String $act_intr_d_rmrks = "act_intr_d_rmrks";
	/**
	 * Transaction details remarks (Result details) 取引明細備考（実績明細）.<p>
	 *
	 */
	public static final String $act_trd_d_rmrks = "act_trd_d_rmrks";
	/**
	 * Spare 1 (Result details) 予備１（実績明細）.<p>
	 *
	 */
	public static final String $act_d_sub_char1 = "act_d_sub_char1";
	/**
	 * Spare 2 (Result details) 予備２（実績明細）.<p>
	 *
	 */
	public static final String $act_d_sub_char2 = "act_d_sub_char2";
	/**
	 * Spare 3 (Result details) 予備３（実績明細）.<p>
	 *
	 */
	public static final String $act_d_sub_char3 = "act_d_sub_char3";
	public static final String $itm_grp_p = "itm_grp_p";

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
	public static final String $sno1 = $sno_p + ".sno1";
	public static final String $sno2 = $sno_p + ".sno2";
	public static final String $sno3 = $sno_p + ".sno3";
	public static final String $sno4 = $sno_p + ".sno4";
	public static final String $wrk_no = $sno_p + ".wrk_no";
	public static final String $wrk_nm = $sno_p + ".wrk_nm";
	public static final String $acxfr_act_dt_fr = $acxfr_act_dt_p + ".ymd_fr";
	public static final String $acxfr_act_hm_fr = $acxfr_act_dt_p + ".hm_fr";
	public static final String $acxfr_act_dt_to = $acxfr_act_dt_p + ".ymd_to";
	public static final String $acxfr_act_hm_to = $acxfr_act_dt_p + ".hm_to";
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
	public static final MCMeta not_inst_flg_META = createCommonMeta($not_inst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_flg_META = createCommonMeta($inst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta part_comp_flg_META = createCommonMeta($part_comp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta comp_flg_META = createCommonMeta($comp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wms_flg_META = createCommonMeta($wms_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_wms_flg_META = createCommonMeta($not_wms_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_nm_META = createCommonMeta($trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta acxfr_schd_no_META = createCommonMeta($acxfr_schd_no, mcframe.commonMA.meta.MA_META.ACXFR_SCHD_NO);
	public static final MCMeta acxfr_inst_no_META = createCommonMeta($acxfr_inst_no, mcframe.commonMA.meta.MA_META.ACXFR_INST_NO);
	public static final MCMeta acxfr_inst_d_no_META = createCommonMeta($acxfr_inst_d_no, mcframe.commonMA.meta.MA_META.ACXFR_INST_D_NO);
	public static final MCMeta acxfr_act_no_META = createCommonMeta($acxfr_act_no, mcframe.commonMA.meta.MA_META.ACXFR_ACT_NO);
	public static final MCMeta acxfr_act_d_no_META = createCommonMeta($acxfr_act_d_no, mcframe.commonMA.meta.MA_META.ACXFR_ACT_D_NO);
	public static final MCMeta ext_acxfr_act_no_META = createCommonMeta($ext_acxfr_act_no, mcframe.commonMA.meta.MA_META.EXT_ACXFR_ACT_NO);
	public static final MCMeta abort_flg_META = createCommonMeta($abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta str_ln_cd_META = createCommonMeta($str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta str_ln_nm_META = createCommonMeta($str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta itm_typ_p_META = createInnerRowMeta($itm_typ_p, mcframe.clientMAUB.MAUBP0100.ItmTypR.class);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta ver_no_p_META = createInnerRowMeta($ver_no_p, mcframe.clientMAUB.MAUBP0340.VerNoR.class);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sno_p_META = createInnerRowMeta($sno_p, mcframe.clientMSUB.MSUBP0020.SnoWrkNoR.class);
	public static final MCMeta loc_grp_cd_META = createCommonMeta($loc_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta loc_grp_nm_META = createCommonMeta($loc_grp_nm, mcframe.commonMA.meta.MA_META.LOC_GRP_NM);
	public static final MCMeta bd_dpt_cd_META = createCommonMeta($bd_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bd_dpt_nm_META = createCommonMeta($bd_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta rqst_dt_fr_META = createCommonMeta($rqst_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rqst_dt_to_META = createCommonMeta($rqst_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta acxfr_schd_dt_fr_META = createCommonMeta($acxfr_schd_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta acxfr_schd_dt_to_META = createCommonMeta($acxfr_schd_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta acxfr_inst_dt_fr_META = createCommonMeta($acxfr_inst_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta acxfr_inst_dt_to_META = createCommonMeta($acxfr_inst_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta acxfr_act_dt_p_META = createInnerRowMeta($acxfr_act_dt_p, mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class);
	public static final MCMeta ac_dt_fr_META = createCommonMeta($ac_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ac_dt_to_META = createCommonMeta($ac_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rsn_cd_META = createCommonMeta($rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta rsn_nm_META = createCommonMeta($rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta dspsl_no_META = createCommonMeta($dspsl_no, mcframe.commonMA.meta.MA_META.DSPSL_NO);
	public static final MCMeta schd_no_aprv_flg_META = createCommonMeta($schd_no_aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rqst_usr_cd_META = createCommonMeta($rqst_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta rqst_usr_nm_META = createCommonMeta($rqst_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta rqst_dpt_cd_META = createCommonMeta($rqst_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta rqst_dpt_nm_META = createCommonMeta($rqst_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta inst_usr_cd_META = createCommonMeta($inst_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta inst_usr_nm_META = createCommonMeta($inst_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta inst_dpt_cd_META = createCommonMeta($inst_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta inst_dpt_nm_META = createCommonMeta($inst_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta act_usr_cd_META = createCommonMeta($act_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta act_usr_nm_META = createCommonMeta($act_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta act_dpt_cd_META = createCommonMeta($act_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta act_dpt_nm_META = createCommonMeta($act_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta schd_trd_d_rmrks_META = createCommonMeta($schd_trd_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta schd_dspsl_rmrks_META = createCommonMeta($schd_dspsl_rmrks, mcframe.commonMS.meta.MS_META.DSPSL_RMRKS);
	public static final MCMeta schd_sub_char1_META = createCommonMeta($schd_sub_char1, mcframe.commonMS.meta.MS_META.ACXFR_SCHD_SUB_CHAR1);
	public static final MCMeta schd_sub_char2_META = createCommonMeta($schd_sub_char2, mcframe.commonMS.meta.MS_META.ACXFR_SCHD_SUB_CHAR2);
	public static final MCMeta schd_sub_char3_META = createCommonMeta($schd_sub_char3, mcframe.commonMS.meta.MS_META.ACXFR_SCHD_SUB_CHAR3);
	public static final MCMeta inst_intr_rmrks_META = createCommonMeta($inst_intr_rmrks, mcframe.commonMS.meta.MS_META.ACXFR_INST_INTR_RMRKS);
	public static final MCMeta inst_trd_rmrks_META = createCommonMeta($inst_trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta inst_rmrks_META = createCommonMeta($inst_rmrks, mcframe.commonMS.meta.MS_META.ACXFR_INST_RMRKS);
	public static final MCMeta inst_sub_char1_META = createCommonMeta($inst_sub_char1, mcframe.commonMS.meta.MS_META.ACXFR_INST_SUB_CHAR1);
	public static final MCMeta inst_sub_char2_META = createCommonMeta($inst_sub_char2, mcframe.commonMS.meta.MS_META.ACXFR_INST_SUB_CHAR2);
	public static final MCMeta inst_sub_char3_META = createCommonMeta($inst_sub_char3, mcframe.commonMS.meta.MS_META.ACXFR_INST_SUB_CHAR3);
	public static final MCMeta inst_intr_d_rmrks_META = createCommonMeta($inst_intr_d_rmrks, mcframe.commonMS.meta.MS_META.ACXFR_INST_INTR_D_RMRKS);
	public static final MCMeta inst_trd_d_rmrks_META = createCommonMeta($inst_trd_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta inst_d_rmrks_META = createCommonMeta($inst_d_rmrks, mcframe.commonMS.meta.MS_META.ACXFR_INST_D_RMRKS);
	public static final MCMeta inst_d_sub_char1_META = createCommonMeta($inst_d_sub_char1, mcframe.commonMS.meta.MS_META.ACXFR_INST_D_SUB_CHAR1);
	public static final MCMeta inst_d_sub_char2_META = createCommonMeta($inst_d_sub_char2, mcframe.commonMS.meta.MS_META.ACXFR_INST_D_SUB_CHAR2);
	public static final MCMeta inst_d_sub_char3_META = createCommonMeta($inst_d_sub_char3, mcframe.commonMS.meta.MS_META.ACXFR_INST_D_SUB_CHAR3);
	public static final MCMeta act_intr_rmrks_META = createCommonMeta($act_intr_rmrks, mcframe.commonMS.meta.MS_META.ACXFR_ACT_INTR_RMRKS);
	public static final MCMeta act_trd_rmrks_META = createCommonMeta($act_trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta act_sub_char1_META = createCommonMeta($act_sub_char1, mcframe.commonMS.meta.MS_META.ACXFR_ACT_SUB_CHAR1);
	public static final MCMeta act_sub_char2_META = createCommonMeta($act_sub_char2, mcframe.commonMS.meta.MS_META.ACXFR_ACT_SUB_CHAR2);
	public static final MCMeta act_sub_char3_META = createCommonMeta($act_sub_char3, mcframe.commonMS.meta.MS_META.ACXFR_ACT_SUB_CHAR3);
	public static final MCMeta act_intr_d_rmrks_META = createCommonMeta($act_intr_d_rmrks, mcframe.commonMS.meta.MS_META.ACXFR_ACT_INTR_D_RMRKS);
	public static final MCMeta act_trd_d_rmrks_META = createCommonMeta($act_trd_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta act_d_sub_char1_META = createCommonMeta($act_d_sub_char1, mcframe.commonMS.meta.MS_META.ACXFR_ACT_D_SUB_CHAR1);
	public static final MCMeta act_d_sub_char2_META = createCommonMeta($act_d_sub_char2, mcframe.commonMS.meta.MS_META.ACXFR_ACT_D_SUB_CHAR2);
	public static final MCMeta act_d_sub_char3_META = createCommonMeta($act_d_sub_char3, mcframe.commonMS.meta.MS_META.ACXFR_ACT_D_SUB_CHAR3);
	public static final MCMeta itm_grp_p_META = createInnerRowMeta($itm_grp_p, mcframe.clientMAUB.MAUBP0250.ItmGrpR.class);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			not_inst_flg_META,
			inst_flg_META,
			part_comp_flg_META,
			comp_flg_META,
			wms_flg_META,
			not_wms_flg_META,
			trd_cd_META,
			trd_nm_META,
			trd_ptn_typ_META,
			wg_cd_META,
			wg_nm_META,
			acxfr_schd_no_META,
			acxfr_inst_no_META,
			acxfr_inst_d_no_META,
			acxfr_act_no_META,
			acxfr_act_d_no_META,
			ext_acxfr_act_no_META,
			abort_flg_META,
			loc_cd_META,
			loc_nm_META,
			str_ln_cd_META,
			str_ln_nm_META,
			itm_typ_p_META,
			itm_p_META,
			ver_no_p_META,
			lot_no_META,
			sublot_no_META,
			sno_p_META,
			loc_grp_cd_META,
			loc_grp_nm_META,
			bd_dpt_cd_META,
			bd_dpt_nm_META,
			rqst_dt_fr_META,
			rqst_dt_to_META,
			acxfr_schd_dt_fr_META,
			acxfr_schd_dt_to_META,
			acxfr_inst_dt_fr_META,
			acxfr_inst_dt_to_META,
			acxfr_act_dt_p_META,
			ac_dt_fr_META,
			ac_dt_to_META,
			rsn_cd_META,
			rsn_nm_META,
			dspsl_no_META,
			schd_no_aprv_flg_META,
			rqst_usr_cd_META,
			rqst_usr_nm_META,
			rqst_dpt_cd_META,
			rqst_dpt_nm_META,
			inst_usr_cd_META,
			inst_usr_nm_META,
			inst_dpt_cd_META,
			inst_dpt_nm_META,
			act_usr_cd_META,
			act_usr_nm_META,
			act_dpt_cd_META,
			act_dpt_nm_META,
			schd_trd_d_rmrks_META,
			schd_dspsl_rmrks_META,
			schd_sub_char1_META,
			schd_sub_char2_META,
			schd_sub_char3_META,
			inst_intr_rmrks_META,
			inst_trd_rmrks_META,
			inst_rmrks_META,
			inst_sub_char1_META,
			inst_sub_char2_META,
			inst_sub_char3_META,
			inst_intr_d_rmrks_META,
			inst_trd_d_rmrks_META,
			inst_d_rmrks_META,
			inst_d_sub_char1_META,
			inst_d_sub_char2_META,
			inst_d_sub_char3_META,
			act_intr_rmrks_META,
			act_trd_rmrks_META,
			act_sub_char1_META,
			act_sub_char2_META,
			act_sub_char3_META,
			act_intr_d_rmrks_META,
			act_trd_d_rmrks_META,
			act_d_sub_char1_META,
			act_d_sub_char2_META,
			act_d_sub_char3_META,
			itm_grp_p_META
		},
		new String[][]{
			{
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
				"acxfr_act_dt_fr",
				"acxfr_act_hm_fr",
				"acxfr_act_dt_to",
				"acxfr_act_hm_to",
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
				$acxfr_act_dt_fr,
				$acxfr_act_hm_fr,
				$acxfr_act_dt_to,
				$acxfr_act_hm_to,
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
	/** 項目属性情報のグループ[SHOW]のキー定数 */
	public static final String $$SHOW = "SHOW";
	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$bd_dpt_cd, "dpt_nm"},	// bd_dpt_cd
				{$rsn_cd, "biz_rsn_nm"},	// rsn_cd
				{$rqst_usr_cd, "usr_nm"},	// rqst_usr_cd
				{$rqst_dpt_cd, "dpt_nm"},	// rqst_dpt_cd
				{$inst_usr_cd, "usr_nm"},	// inst_usr_cd
				{$inst_dpt_cd, "dpt_nm"},	// inst_dpt_cd
				{$act_usr_cd, "usr_nm"},	// act_usr_cd
				{$act_dpt_cd, "dpt_nm"}	// act_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$str_ln_cd, "loc_cd;true"},	// str_ln_cd
				{$lot_no, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// lot_no
				{$sublot_no, "itm_cd;itm_sub1;itm_sub2;itm_sub3;lot_no"},	// sublot_no
				{$bd_dpt_cd, "true;true;MAC_DPT_IS_SRCH_TYP.BD"},	// bd_dpt_cd
				{$rsn_cd, "true;true;true"},	// rsn_cd
				{$rqst_dpt_cd, "true;true;MAC_DPT_IS_SRCH_TYP.COMM"},	// rqst_dpt_cd
				{$inst_dpt_cd, "true;true;MAC_DPT_IS_SRCH_TYP.SCE"},	// inst_dpt_cd
				{$act_dpt_cd, "true;true;MAC_DPT_IS_SRCH_TYP.SCE"}	// act_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$str_ln_cd, "loc_cd;mode_nullval_flg"},	// str_ln_cd
				{$lot_no, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// lot_no
				{$sublot_no, "itm_cd;itm_sub1;itm_sub2;itm_sub3;lot_no"},	// sublot_no
				{$bd_dpt_cd, "dpt_nm_rem_flg;mode_today_flg;dpt_is_srch_typ"},	// bd_dpt_cd
				{$rsn_cd, "acxfr_gr_flg;acxfr_gi_flg;disp_flg"},	// rsn_cd
				{$rqst_dpt_cd, "dpt_nm_rem_flg;mode_today_flg;dpt_is_srch_typ"},	// rqst_dpt_cd
				{$inst_dpt_cd, "dpt_nm_rem_flg;mode_today_flg;dpt_is_srch_typ"},	// inst_dpt_cd
				{$act_dpt_cd, "dpt_nm_rem_flg;mode_today_flg;dpt_is_srch_typ"}	// act_dpt_cd
			}
		)),
		new MCExtMap.Entry($$SHOW, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"},	// wg_nm
				{$str_ln_cd, "STR_LN"},	// str_ln_cd
				{$str_ln_nm, "STR_LN"},	// str_ln_nm
				{$ver_no_p, "VER_NO"},	// ver_no_p
				{$ver_no_p + ".ver_no", "VER_NO"},	// ver_no_p.ver_no
				{$loc_grp_cd, "LOC_GRP"},	// loc_grp_cd
				{$loc_grp_nm, "LOC_GRP"}	// loc_grp_nm
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
	 * REF2,View order,2;REF3,View result,3;PRNT_ACXFR,Issue transfer slip,5; REF2,指図を参照する,2;REF3,実績を参照する,3;PRNT_ACXFR,振替伝票発行,5;.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * REF2,View order,2;REF3,View result,3;PRNT_ACXFR,Issue transfer slip,5; REF2,指図を参照する,2;REF3,実績を参照する,3;PRNT_ACXFR,振替伝票発行,5;.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	/**
	 * Unordered 未指図.<p>
	 *
	 */
	public boolean not_inst_flg() {
		return getConstBoolean(offset + 1, $not_inst_flg);
	}

	/**
	 * Unordered 未指図.<p>
	 *
	 */
	public void not_inst_flg(boolean value) {
		setConstBoolean(offset + 1, $not_inst_flg, value);
	}


	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public boolean inst_flg() {
		return getConstBoolean(offset + 2, $inst_flg);
	}

	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public void inst_flg(boolean value) {
		setConstBoolean(offset + 2, $inst_flg, value);
	}


	/**
	 * Partially completed 一部完了.<p>
	 *
	 */
	public boolean part_comp_flg() {
		return getConstBoolean(offset + 3, $part_comp_flg);
	}

	/**
	 * Partially completed 一部完了.<p>
	 *
	 */
	public void part_comp_flg(boolean value) {
		setConstBoolean(offset + 3, $part_comp_flg, value);
	}


	/**
	 * Completed 完了.<p>
	 *
	 */
	public boolean comp_flg() {
		return getConstBoolean(offset + 4, $comp_flg);
	}

	/**
	 * Completed 完了.<p>
	 *
	 */
	public void comp_flg(boolean value) {
		setConstBoolean(offset + 4, $comp_flg, value);
	}


	/**
	 * Target 対象.<p>
	 *
	 */
	public boolean wms_flg() {
		return getConstBoolean(offset + 5, $wms_flg);
	}

	/**
	 * Target 対象.<p>
	 *
	 */
	public void wms_flg(boolean value) {
		setConstBoolean(offset + 5, $wms_flg, value);
	}


	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public boolean not_wms_flg() {
		return getConstBoolean(offset + 6, $not_wms_flg);
	}

	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public void not_wms_flg(boolean value) {
		setConstBoolean(offset + 6, $not_wms_flg, value);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 7, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 7, $trd_cd, value);
	}


	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 8, $trd_nm);
	}

	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 8, $trd_nm, value);
	}


	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 9, $trd_ptn_typ);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 9, $trd_ptn_typ, value);
	}


	/**
	 * WG ＷＧ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 10, $wg_cd);
	}

	/**
	 * WG ＷＧ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 10, $wg_cd, value);
	}


	/**
	 * WG name ＷＧ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 11, $wg_nm);
	}

	/**
	 * WG name ＷＧ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 11, $wg_nm, value);
	}


	/**
	 * Other accounting transfer schedule No. 他勘定振替予定ＮＯ.<p>
	 *
	 */
	public String acxfr_schd_no() {
		return getConstString(offset + 12, $acxfr_schd_no);
	}

	/**
	 * Other accounting transfer schedule No. 他勘定振替予定ＮＯ.<p>
	 *
	 */
	public void acxfr_schd_no(String value) {
		setConstString(offset + 12, $acxfr_schd_no, value);
	}


	/**
	 * Other accounting transfer order No. 他勘定振替指図ＮＯ.<p>
	 *
	 */
	public String acxfr_inst_no() {
		return getConstString(offset + 13, $acxfr_inst_no);
	}

	/**
	 * Other accounting transfer order No. 他勘定振替指図ＮＯ.<p>
	 *
	 */
	public void acxfr_inst_no(String value) {
		setConstString(offset + 13, $acxfr_inst_no, value);
	}


	/**
	 * Other accounting transfer order details No. 他勘定振替指図明細ＮＯ.<p>
	 *
	 */
	public String acxfr_inst_d_no() {
		return getConstString(offset + 14, $acxfr_inst_d_no);
	}

	/**
	 * Other accounting transfer order details No. 他勘定振替指図明細ＮＯ.<p>
	 *
	 */
	public void acxfr_inst_d_no(String value) {
		setConstString(offset + 14, $acxfr_inst_d_no, value);
	}


	/**
	 * Other accounting transfer result No. 他勘定振替実績ＮＯ.<p>
	 *
	 */
	public String acxfr_act_no() {
		return getConstString(offset + 15, $acxfr_act_no);
	}

	/**
	 * Other accounting transfer result No. 他勘定振替実績ＮＯ.<p>
	 *
	 */
	public void acxfr_act_no(String value) {
		setConstString(offset + 15, $acxfr_act_no, value);
	}


	/**
	 * Other accounting transfer result details No. 他勘定振替実績明細ＮＯ.<p>
	 *
	 */
	public String acxfr_act_d_no() {
		return getConstString(offset + 16, $acxfr_act_d_no);
	}

	/**
	 * Other accounting transfer result details No. 他勘定振替実績明細ＮＯ.<p>
	 *
	 */
	public void acxfr_act_d_no(String value) {
		setConstString(offset + 16, $acxfr_act_d_no, value);
	}


	/**
	 * External other accounting transfer result No. 外部他勘定振替実績ＮＯ.<p>
	 *
	 */
	public String ext_acxfr_act_no() {
		return getConstString(offset + 17, $ext_acxfr_act_no);
	}

	/**
	 * External other accounting transfer result No. 外部他勘定振替実績ＮＯ.<p>
	 *
	 */
	public void ext_acxfr_act_no(String value) {
		setConstString(offset + 17, $ext_acxfr_act_no, value);
	}


	/**
	 * Include cancel remaining 打切含む.<p>
	 *
	 */
	public boolean abort_flg() {
		return getConstBoolean(offset + 18, $abort_flg);
	}

	/**
	 * Include cancel remaining 打切含む.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		setConstBoolean(offset + 18, $abort_flg, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 19, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 19, $loc_cd, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 20, $loc_nm);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 20, $loc_nm, value);
	}


	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return getConstString(offset + 21, $str_ln_cd);
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		setConstString(offset + 21, $str_ln_cd, value);
	}


	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public String str_ln_nm() {
		return getConstString(offset + 22, $str_ln_nm);
	}

	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public void str_ln_nm(String value) {
		setConstString(offset + 22, $str_ln_nm, value);
	}


	public mcframe.clientMAUB.MAUBP0100.ItmTypR itm_typ_p(){
		return (mcframe.clientMAUB.MAUBP0100.ItmTypR) getConstInnerRow(offset + 23, $itm_typ_p);
	}
	
	public void itm_typ_p(mcframe.clientMAUB.MAUBP0100.ItmTypR row){
		setConstInnerRow(offset + 23, $itm_typ_p, row);
	}


	public mcframe.clientMAUB.MAUBP0030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 24, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 24, $itm_p, row);
	}


	public mcframe.clientMAUB.MAUBP0340.VerNoR ver_no_p(){
		return (mcframe.clientMAUB.MAUBP0340.VerNoR) getConstInnerRow(offset + 25, $ver_no_p);
	}
	
	public void ver_no_p(mcframe.clientMAUB.MAUBP0340.VerNoR row){
		setConstInnerRow(offset + 25, $ver_no_p, row);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 26, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 26, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 27, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 27, $sublot_no, value);
	}


	public mcframe.clientMSUB.MSUBP0020.SnoWrkNoR sno_p(){
		return (mcframe.clientMSUB.MSUBP0020.SnoWrkNoR) getConstInnerRow(offset + 28, $sno_p);
	}
	
	public void sno_p(mcframe.clientMSUB.MSUBP0020.SnoWrkNoR row){
		setConstInnerRow(offset + 28, $sno_p, row);
	}


	/**
	 * Location group cd. 場所グループＣＤ.<p>
	 *
	 */
	public String loc_grp_cd() {
		return getConstString(offset + 29, $loc_grp_cd);
	}

	/**
	 * Location group cd. 場所グループＣＤ.<p>
	 *
	 */
	public void loc_grp_cd(String value) {
		setConstString(offset + 29, $loc_grp_cd, value);
	}


	/**
	 * Location group name 場所グループ名.<p>
	 *
	 */
	public String loc_grp_nm() {
		return getConstString(offset + 30, $loc_grp_nm);
	}

	/**
	 * Location group name 場所グループ名.<p>
	 *
	 */
	public void loc_grp_nm(String value) {
		setConstString(offset + 30, $loc_grp_nm, value);
	}


	/**
	 * Charged dept. 負担部門.<p>
	 *
	 */
	public String bd_dpt_cd() {
		return getConstString(offset + 31, $bd_dpt_cd);
	}

	/**
	 * Charged dept. 負担部門.<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		setConstString(offset + 31, $bd_dpt_cd, value);
	}


	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public String bd_dpt_nm() {
		return getConstString(offset + 32, $bd_dpt_nm);
	}

	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public void bd_dpt_nm(String value) {
		setConstString(offset + 32, $bd_dpt_nm, value);
	}


	/**
	 * Transfer requested date 振替依頼日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate rqst_dt_fr() {
		return getConstDate(offset + 33, $rqst_dt_fr);
	}

	/**
	 * Transfer requested date 振替依頼日ＦＲＯＭ.<p>
	 *
	 */
	public void rqst_dt_fr(MCDate value) {
		setConstDate(offset + 33, $rqst_dt_fr, value);
	}


	/**
	 * Transfer request date TO 振替依頼日ＴＯ.<p>
	 *
	 */
	public MCDate rqst_dt_to() {
		return getConstDate(offset + 34, $rqst_dt_to);
	}

	/**
	 * Transfer request date TO 振替依頼日ＴＯ.<p>
	 *
	 */
	public void rqst_dt_to(MCDate value) {
		setConstDate(offset + 34, $rqst_dt_to, value);
	}


	/**
	 * Scheduled transfer date FROM 振替予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate acxfr_schd_dt_fr() {
		return getConstDate(offset + 35, $acxfr_schd_dt_fr);
	}

	/**
	 * Scheduled transfer date FROM 振替予定日ＦＲＯＭ.<p>
	 *
	 */
	public void acxfr_schd_dt_fr(MCDate value) {
		setConstDate(offset + 35, $acxfr_schd_dt_fr, value);
	}


	/**
	 * Scheduled transfer date TO 振替予定日ＴＯ.<p>
	 *
	 */
	public MCDate acxfr_schd_dt_to() {
		return getConstDate(offset + 36, $acxfr_schd_dt_to);
	}

	/**
	 * Scheduled transfer date TO 振替予定日ＴＯ.<p>
	 *
	 */
	public void acxfr_schd_dt_to(MCDate value) {
		setConstDate(offset + 36, $acxfr_schd_dt_to, value);
	}


	/**
	 * Transfer order date FROM 振替指図日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate acxfr_inst_dt_fr() {
		return getConstDate(offset + 37, $acxfr_inst_dt_fr);
	}

	/**
	 * Transfer order date FROM 振替指図日ＦＲＯＭ.<p>
	 *
	 */
	public void acxfr_inst_dt_fr(MCDate value) {
		setConstDate(offset + 37, $acxfr_inst_dt_fr, value);
	}


	/**
	 * Transfer order date TO 振替指図日ＴＯ.<p>
	 *
	 */
	public MCDate acxfr_inst_dt_to() {
		return getConstDate(offset + 38, $acxfr_inst_dt_to);
	}

	/**
	 * Transfer order date TO 振替指図日ＴＯ.<p>
	 *
	 */
	public void acxfr_inst_dt_to(MCDate value) {
		setConstDate(offset + 38, $acxfr_inst_dt_to, value);
	}


	public mcframe.clientMAUB.MAUBP0400.YmdHmFrToR acxfr_act_dt_p(){
		return (mcframe.clientMAUB.MAUBP0400.YmdHmFrToR) getConstInnerRow(offset + 39, $acxfr_act_dt_p);
	}
	
	public void acxfr_act_dt_p(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR row){
		setConstInnerRow(offset + 39, $acxfr_act_dt_p, row);
	}


	/**
	 * Transfer recording date FROM 振替計上日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ac_dt_fr() {
		return getConstDate(offset + 40, $ac_dt_fr);
	}

	/**
	 * Transfer recording date FROM 振替計上日ＦＲＯＭ.<p>
	 *
	 */
	public void ac_dt_fr(MCDate value) {
		setConstDate(offset + 40, $ac_dt_fr, value);
	}


	/**
	 * Transfer recording date TO 振替計上日ＴＯ.<p>
	 *
	 */
	public MCDate ac_dt_to() {
		return getConstDate(offset + 41, $ac_dt_to);
	}

	/**
	 * Transfer recording date TO 振替計上日ＴＯ.<p>
	 *
	 */
	public void ac_dt_to(MCDate value) {
		setConstDate(offset + 41, $ac_dt_to, value);
	}


	/**
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public String rsn_cd() {
		return getConstString(offset + 42, $rsn_cd);
	}

	/**
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public void rsn_cd(String value) {
		setConstString(offset + 42, $rsn_cd, value);
	}


	/**
	 * Reason name 理由名.<p>
	 *
	 */
	public String rsn_nm() {
		return getConstString(offset + 43, $rsn_nm);
	}

	/**
	 * Reason name 理由名.<p>
	 *
	 */
	public void rsn_nm(String value) {
		setConstString(offset + 43, $rsn_nm, value);
	}


	/**
	 * Disposal application No. 廃棄申請ＮＯ.<p>
	 *
	 */
	public String dspsl_no() {
		return getConstString(offset + 44, $dspsl_no);
	}

	/**
	 * Disposal application No. 廃棄申請ＮＯ.<p>
	 *
	 */
	public void dspsl_no(String value) {
		setConstString(offset + 44, $dspsl_no, value);
	}


	/**
	 * Include scheduled unapproved 予定未承認含む.<p>
	 *
	 */
	public boolean schd_no_aprv_flg() {
		return getConstBoolean(offset + 45, $schd_no_aprv_flg);
	}

	/**
	 * Include scheduled unapproved 予定未承認含む.<p>
	 *
	 */
	public void schd_no_aprv_flg(boolean value) {
		setConstBoolean(offset + 45, $schd_no_aprv_flg, value);
	}


	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public String rqst_usr_cd() {
		return getConstString(offset + 46, $rqst_usr_cd);
	}

	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public void rqst_usr_cd(String value) {
		setConstString(offset + 46, $rqst_usr_cd, value);
	}


	/**
	 * Requesting PIC name 依頼元担当者名.<p>
	 *
	 */
	public String rqst_usr_nm() {
		return getConstString(offset + 47, $rqst_usr_nm);
	}

	/**
	 * Requesting PIC name 依頼元担当者名.<p>
	 *
	 */
	public void rqst_usr_nm(String value) {
		setConstString(offset + 47, $rqst_usr_nm, value);
	}


	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public String rqst_dpt_cd() {
		return getConstString(offset + 48, $rqst_dpt_cd);
	}

	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public void rqst_dpt_cd(String value) {
		setConstString(offset + 48, $rqst_dpt_cd, value);
	}


	/**
	 * Requesting dept. name 依頼元部門名.<p>
	 *
	 */
	public String rqst_dpt_nm() {
		return getConstString(offset + 49, $rqst_dpt_nm);
	}

	/**
	 * Requesting dept. name 依頼元部門名.<p>
	 *
	 */
	public void rqst_dpt_nm(String value) {
		setConstString(offset + 49, $rqst_dpt_nm, value);
	}


	/**
	 * Order PIC cd. 指図担当者ＣＤ.<p>
	 *
	 */
	public String inst_usr_cd() {
		return getConstString(offset + 50, $inst_usr_cd);
	}

	/**
	 * Order PIC cd. 指図担当者ＣＤ.<p>
	 *
	 */
	public void inst_usr_cd(String value) {
		setConstString(offset + 50, $inst_usr_cd, value);
	}


	/**
	 * Order PIC name 指図担当者名.<p>
	 *
	 */
	public String inst_usr_nm() {
		return getConstString(offset + 51, $inst_usr_nm);
	}

	/**
	 * Order PIC name 指図担当者名.<p>
	 *
	 */
	public void inst_usr_nm(String value) {
		setConstString(offset + 51, $inst_usr_nm, value);
	}


	/**
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public String inst_dpt_cd() {
		return getConstString(offset + 52, $inst_dpt_cd);
	}

	/**
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public void inst_dpt_cd(String value) {
		setConstString(offset + 52, $inst_dpt_cd, value);
	}


	/**
	 * Order dept. name 指図部門名.<p>
	 *
	 */
	public String inst_dpt_nm() {
		return getConstString(offset + 53, $inst_dpt_nm);
	}

	/**
	 * Order dept. name 指図部門名.<p>
	 *
	 */
	public void inst_dpt_nm(String value) {
		setConstString(offset + 53, $inst_dpt_nm, value);
	}


	/**
	 * Implementation PIC cd. 実施担当者ＣＤ.<p>
	 *
	 */
	public String act_usr_cd() {
		return getConstString(offset + 54, $act_usr_cd);
	}

	/**
	 * Implementation PIC cd. 実施担当者ＣＤ.<p>
	 *
	 */
	public void act_usr_cd(String value) {
		setConstString(offset + 54, $act_usr_cd, value);
	}


	/**
	 * Implementation PC name 実施担当者名.<p>
	 *
	 */
	public String act_usr_nm() {
		return getConstString(offset + 55, $act_usr_nm);
	}

	/**
	 * Implementation PC name 実施担当者名.<p>
	 *
	 */
	public void act_usr_nm(String value) {
		setConstString(offset + 55, $act_usr_nm, value);
	}


	/**
	 * Implement dept. cd. 実施部門ＣＤ.<p>
	 *
	 */
	public String act_dpt_cd() {
		return getConstString(offset + 56, $act_dpt_cd);
	}

	/**
	 * Implement dept. cd. 実施部門ＣＤ.<p>
	 *
	 */
	public void act_dpt_cd(String value) {
		setConstString(offset + 56, $act_dpt_cd, value);
	}


	/**
	 * Implement dept. name 実施部門名.<p>
	 *
	 */
	public String act_dpt_nm() {
		return getConstString(offset + 57, $act_dpt_nm);
	}

	/**
	 * Implement dept. name 実施部門名.<p>
	 *
	 */
	public void act_dpt_nm(String value) {
		setConstString(offset + 57, $act_dpt_nm, value);
	}


	/**
	 * Transaction details remarks (Schedule) 取引明細備考（予定）.<p>
	 *
	 */
	public String schd_trd_d_rmrks() {
		return getConstString(offset + 58, $schd_trd_d_rmrks);
	}

	/**
	 * Transaction details remarks (Schedule) 取引明細備考（予定）.<p>
	 *
	 */
	public void schd_trd_d_rmrks(String value) {
		setConstString(offset + 58, $schd_trd_d_rmrks, value);
	}


	/**
	 * Disposal request remarks (schedule) 廃棄申請備考（予定）.<p>
	 *
	 */
	public String schd_dspsl_rmrks() {
		return getConstString(offset + 59, $schd_dspsl_rmrks);
	}

	/**
	 * Disposal request remarks (schedule) 廃棄申請備考（予定）.<p>
	 *
	 */
	public void schd_dspsl_rmrks(String value) {
		setConstString(offset + 59, $schd_dspsl_rmrks, value);
	}


	/**
	 * Spare 1 (Schedule) 予備１（予定）.<p>
	 *
	 */
	public String schd_sub_char1() {
		return getConstString(offset + 60, $schd_sub_char1);
	}

	/**
	 * Spare 1 (Schedule) 予備１（予定）.<p>
	 *
	 */
	public void schd_sub_char1(String value) {
		setConstString(offset + 60, $schd_sub_char1, value);
	}


	/**
	 * Spare 2 (Schedule) 予備２（予定）.<p>
	 *
	 */
	public String schd_sub_char2() {
		return getConstString(offset + 61, $schd_sub_char2);
	}

	/**
	 * Spare 2 (Schedule) 予備２（予定）.<p>
	 *
	 */
	public void schd_sub_char2(String value) {
		setConstString(offset + 61, $schd_sub_char2, value);
	}


	/**
	 * Spare 3 (Schedule) 予備３（予定）.<p>
	 *
	 */
	public String schd_sub_char3() {
		return getConstString(offset + 62, $schd_sub_char3);
	}

	/**
	 * Spare 3 (Schedule) 予備３（予定）.<p>
	 *
	 */
	public void schd_sub_char3(String value) {
		setConstString(offset + 62, $schd_sub_char3, value);
	}


	/**
	 * Internal remarks (Order header) 内部備考（指図ヘッダ）.<p>
	 *
	 */
	public String inst_intr_rmrks() {
		return getConstString(offset + 63, $inst_intr_rmrks);
	}

	/**
	 * Internal remarks (Order header) 内部備考（指図ヘッダ）.<p>
	 *
	 */
	public void inst_intr_rmrks(String value) {
		setConstString(offset + 63, $inst_intr_rmrks, value);
	}


	/**
	 * Transaction remarks (Order header) 取引備考（指図ヘッダ）.<p>
	 *
	 */
	public String inst_trd_rmrks() {
		return getConstString(offset + 64, $inst_trd_rmrks);
	}

	/**
	 * Transaction remarks (Order header) 取引備考（指図ヘッダ）.<p>
	 *
	 */
	public void inst_trd_rmrks(String value) {
		setConstString(offset + 64, $inst_trd_rmrks, value);
	}


	/**
	 * Order remarks (Order header) 指図備考（指図ヘッダ）.<p>
	 *
	 */
	public String inst_rmrks() {
		return getConstString(offset + 65, $inst_rmrks);
	}

	/**
	 * Order remarks (Order header) 指図備考（指図ヘッダ）.<p>
	 *
	 */
	public void inst_rmrks(String value) {
		setConstString(offset + 65, $inst_rmrks, value);
	}


	/**
	 * Spare 1 (Order header) 予備１（指図ヘッダ）.<p>
	 *
	 */
	public String inst_sub_char1() {
		return getConstString(offset + 66, $inst_sub_char1);
	}

	/**
	 * Spare 1 (Order header) 予備１（指図ヘッダ）.<p>
	 *
	 */
	public void inst_sub_char1(String value) {
		setConstString(offset + 66, $inst_sub_char1, value);
	}


	/**
	 * Spare 2 (Order header) 予備２（指図ヘッダ）.<p>
	 *
	 */
	public String inst_sub_char2() {
		return getConstString(offset + 67, $inst_sub_char2);
	}

	/**
	 * Spare 2 (Order header) 予備２（指図ヘッダ）.<p>
	 *
	 */
	public void inst_sub_char2(String value) {
		setConstString(offset + 67, $inst_sub_char2, value);
	}


	/**
	 * Spare 3 (Order header) 予備３（指図ヘッダ）.<p>
	 *
	 */
	public String inst_sub_char3() {
		return getConstString(offset + 68, $inst_sub_char3);
	}

	/**
	 * Spare 3 (Order header) 予備３（指図ヘッダ）.<p>
	 *
	 */
	public void inst_sub_char3(String value) {
		setConstString(offset + 68, $inst_sub_char3, value);
	}


	/**
	 * Internal details remarks (Order details) 内部明細備考（指図明細）.<p>
	 *
	 */
	public String inst_intr_d_rmrks() {
		return getConstString(offset + 69, $inst_intr_d_rmrks);
	}

	/**
	 * Internal details remarks (Order details) 内部明細備考（指図明細）.<p>
	 *
	 */
	public void inst_intr_d_rmrks(String value) {
		setConstString(offset + 69, $inst_intr_d_rmrks, value);
	}


	/**
	 * Transaction details remarks (Order details) 取引明細備考（指図明細）.<p>
	 *
	 */
	public String inst_trd_d_rmrks() {
		return getConstString(offset + 70, $inst_trd_d_rmrks);
	}

	/**
	 * Transaction details remarks (Order details) 取引明細備考（指図明細）.<p>
	 *
	 */
	public void inst_trd_d_rmrks(String value) {
		setConstString(offset + 70, $inst_trd_d_rmrks, value);
	}


	/**
	 * Order details remarks (Details) 指図明細備考（指図明細）.<p>
	 *
	 */
	public String inst_d_rmrks() {
		return getConstString(offset + 71, $inst_d_rmrks);
	}

	/**
	 * Order details remarks (Details) 指図明細備考（指図明細）.<p>
	 *
	 */
	public void inst_d_rmrks(String value) {
		setConstString(offset + 71, $inst_d_rmrks, value);
	}


	/**
	 * Spare 1 (Order details) 予備１（指図明細）.<p>
	 *
	 */
	public String inst_d_sub_char1() {
		return getConstString(offset + 72, $inst_d_sub_char1);
	}

	/**
	 * Spare 1 (Order details) 予備１（指図明細）.<p>
	 *
	 */
	public void inst_d_sub_char1(String value) {
		setConstString(offset + 72, $inst_d_sub_char1, value);
	}


	/**
	 * Spare 2 (Order details) 予備２（指図明細）.<p>
	 *
	 */
	public String inst_d_sub_char2() {
		return getConstString(offset + 73, $inst_d_sub_char2);
	}

	/**
	 * Spare 2 (Order details) 予備２（指図明細）.<p>
	 *
	 */
	public void inst_d_sub_char2(String value) {
		setConstString(offset + 73, $inst_d_sub_char2, value);
	}


	/**
	 * Spare 3 (Order details) 予備３（指図明細）.<p>
	 *
	 */
	public String inst_d_sub_char3() {
		return getConstString(offset + 74, $inst_d_sub_char3);
	}

	/**
	 * Spare 3 (Order details) 予備３（指図明細）.<p>
	 *
	 */
	public void inst_d_sub_char3(String value) {
		setConstString(offset + 74, $inst_d_sub_char3, value);
	}


	/**
	 * Internal remarks (Result header) 内部備考（実績ヘッダ）.<p>
	 *
	 */
	public String act_intr_rmrks() {
		return getConstString(offset + 75, $act_intr_rmrks);
	}

	/**
	 * Internal remarks (Result header) 内部備考（実績ヘッダ）.<p>
	 *
	 */
	public void act_intr_rmrks(String value) {
		setConstString(offset + 75, $act_intr_rmrks, value);
	}


	/**
	 * Transaction remarks (Result header) 取引備考（実績ヘッダ）.<p>
	 *
	 */
	public String act_trd_rmrks() {
		return getConstString(offset + 76, $act_trd_rmrks);
	}

	/**
	 * Transaction remarks (Result header) 取引備考（実績ヘッダ）.<p>
	 *
	 */
	public void act_trd_rmrks(String value) {
		setConstString(offset + 76, $act_trd_rmrks, value);
	}


	/**
	 * Spare 1 (Result header) 予備１（実績ヘッダ）.<p>
	 *
	 */
	public String act_sub_char1() {
		return getConstString(offset + 77, $act_sub_char1);
	}

	/**
	 * Spare 1 (Result header) 予備１（実績ヘッダ）.<p>
	 *
	 */
	public void act_sub_char1(String value) {
		setConstString(offset + 77, $act_sub_char1, value);
	}


	/**
	 * Spare 2 (Result header) 予備２（実績ヘッダ）.<p>
	 *
	 */
	public String act_sub_char2() {
		return getConstString(offset + 78, $act_sub_char2);
	}

	/**
	 * Spare 2 (Result header) 予備２（実績ヘッダ）.<p>
	 *
	 */
	public void act_sub_char2(String value) {
		setConstString(offset + 78, $act_sub_char2, value);
	}


	/**
	 * Spare 3 (Result header) 予備３（実績ヘッダ）.<p>
	 *
	 */
	public String act_sub_char3() {
		return getConstString(offset + 79, $act_sub_char3);
	}

	/**
	 * Spare 3 (Result header) 予備３（実績ヘッダ）.<p>
	 *
	 */
	public void act_sub_char3(String value) {
		setConstString(offset + 79, $act_sub_char3, value);
	}


	/**
	 * Internal details remarks (Result details) 内部明細備考（実績明細）.<p>
	 *
	 */
	public String act_intr_d_rmrks() {
		return getConstString(offset + 80, $act_intr_d_rmrks);
	}

	/**
	 * Internal details remarks (Result details) 内部明細備考（実績明細）.<p>
	 *
	 */
	public void act_intr_d_rmrks(String value) {
		setConstString(offset + 80, $act_intr_d_rmrks, value);
	}


	/**
	 * Transaction details remarks (Result details) 取引明細備考（実績明細）.<p>
	 *
	 */
	public String act_trd_d_rmrks() {
		return getConstString(offset + 81, $act_trd_d_rmrks);
	}

	/**
	 * Transaction details remarks (Result details) 取引明細備考（実績明細）.<p>
	 *
	 */
	public void act_trd_d_rmrks(String value) {
		setConstString(offset + 81, $act_trd_d_rmrks, value);
	}


	/**
	 * Spare 1 (Result details) 予備１（実績明細）.<p>
	 *
	 */
	public String act_d_sub_char1() {
		return getConstString(offset + 82, $act_d_sub_char1);
	}

	/**
	 * Spare 1 (Result details) 予備１（実績明細）.<p>
	 *
	 */
	public void act_d_sub_char1(String value) {
		setConstString(offset + 82, $act_d_sub_char1, value);
	}


	/**
	 * Spare 2 (Result details) 予備２（実績明細）.<p>
	 *
	 */
	public String act_d_sub_char2() {
		return getConstString(offset + 83, $act_d_sub_char2);
	}

	/**
	 * Spare 2 (Result details) 予備２（実績明細）.<p>
	 *
	 */
	public void act_d_sub_char2(String value) {
		setConstString(offset + 83, $act_d_sub_char2, value);
	}


	/**
	 * Spare 3 (Result details) 予備３（実績明細）.<p>
	 *
	 */
	public String act_d_sub_char3() {
		return getConstString(offset + 84, $act_d_sub_char3);
	}

	/**
	 * Spare 3 (Result details) 予備３（実績明細）.<p>
	 *
	 */
	public void act_d_sub_char3(String value) {
		setConstString(offset + 84, $act_d_sub_char3, value);
	}


	public mcframe.clientMAUB.MAUBP0250.ItmGrpR itm_grp_p(){
		return (mcframe.clientMAUB.MAUBP0250.ItmGrpR) getConstInnerRow(offset + 85, $itm_grp_p);
	}
	
	public void itm_grp_p(mcframe.clientMAUB.MAUBP0250.ItmGrpR row){
		setConstInnerRow(offset + 85, $itm_grp_p, row);
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
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($acxfr_schd_no.equalsIgnoreCase(name)) {
			return acxfr_schd_no();
		}
		if ($acxfr_inst_no.equalsIgnoreCase(name)) {
			return acxfr_inst_no();
		}
		if ($acxfr_inst_d_no.equalsIgnoreCase(name)) {
			return acxfr_inst_d_no();
		}
		if ($acxfr_act_no.equalsIgnoreCase(name)) {
			return acxfr_act_no();
		}
		if ($acxfr_act_d_no.equalsIgnoreCase(name)) {
			return acxfr_act_d_no();
		}
		if ($ext_acxfr_act_no.equalsIgnoreCase(name)) {
			return ext_acxfr_act_no();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			return str_ln_nm();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			return loc_grp_cd();
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			return loc_grp_nm();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			return bd_dpt_nm();
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			return rsn_cd();
		}
		if ($rsn_nm.equalsIgnoreCase(name)) {
			return rsn_nm();
		}
		if ($dspsl_no.equalsIgnoreCase(name)) {
			return dspsl_no();
		}
		if ($rqst_usr_cd.equalsIgnoreCase(name)) {
			return rqst_usr_cd();
		}
		if ($rqst_usr_nm.equalsIgnoreCase(name)) {
			return rqst_usr_nm();
		}
		if ($rqst_dpt_cd.equalsIgnoreCase(name)) {
			return rqst_dpt_cd();
		}
		if ($rqst_dpt_nm.equalsIgnoreCase(name)) {
			return rqst_dpt_nm();
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
		if ($schd_trd_d_rmrks.equalsIgnoreCase(name)) {
			return schd_trd_d_rmrks();
		}
		if ($schd_dspsl_rmrks.equalsIgnoreCase(name)) {
			return schd_dspsl_rmrks();
		}
		if ($schd_sub_char1.equalsIgnoreCase(name)) {
			return schd_sub_char1();
		}
		if ($schd_sub_char2.equalsIgnoreCase(name)) {
			return schd_sub_char2();
		}
		if ($schd_sub_char3.equalsIgnoreCase(name)) {
			return schd_sub_char3();
		}
		if ($inst_intr_rmrks.equalsIgnoreCase(name)) {
			return inst_intr_rmrks();
		}
		if ($inst_trd_rmrks.equalsIgnoreCase(name)) {
			return inst_trd_rmrks();
		}
		if ($inst_rmrks.equalsIgnoreCase(name)) {
			return inst_rmrks();
		}
		if ($inst_sub_char1.equalsIgnoreCase(name)) {
			return inst_sub_char1();
		}
		if ($inst_sub_char2.equalsIgnoreCase(name)) {
			return inst_sub_char2();
		}
		if ($inst_sub_char3.equalsIgnoreCase(name)) {
			return inst_sub_char3();
		}
		if ($inst_intr_d_rmrks.equalsIgnoreCase(name)) {
			return inst_intr_d_rmrks();
		}
		if ($inst_trd_d_rmrks.equalsIgnoreCase(name)) {
			return inst_trd_d_rmrks();
		}
		if ($inst_d_rmrks.equalsIgnoreCase(name)) {
			return inst_d_rmrks();
		}
		if ($inst_d_sub_char1.equalsIgnoreCase(name)) {
			return inst_d_sub_char1();
		}
		if ($inst_d_sub_char2.equalsIgnoreCase(name)) {
			return inst_d_sub_char2();
		}
		if ($inst_d_sub_char3.equalsIgnoreCase(name)) {
			return inst_d_sub_char3();
		}
		if ($act_intr_rmrks.equalsIgnoreCase(name)) {
			return act_intr_rmrks();
		}
		if ($act_trd_rmrks.equalsIgnoreCase(name)) {
			return act_trd_rmrks();
		}
		if ($act_sub_char1.equalsIgnoreCase(name)) {
			return act_sub_char1();
		}
		if ($act_sub_char2.equalsIgnoreCase(name)) {
			return act_sub_char2();
		}
		if ($act_sub_char3.equalsIgnoreCase(name)) {
			return act_sub_char3();
		}
		if ($act_intr_d_rmrks.equalsIgnoreCase(name)) {
			return act_intr_d_rmrks();
		}
		if ($act_trd_d_rmrks.equalsIgnoreCase(name)) {
			return act_trd_d_rmrks();
		}
		if ($act_d_sub_char1.equalsIgnoreCase(name)) {
			return act_d_sub_char1();
		}
		if ($act_d_sub_char2.equalsIgnoreCase(name)) {
			return act_d_sub_char2();
		}
		if ($act_d_sub_char3.equalsIgnoreCase(name)) {
			return act_d_sub_char3();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($rqst_dt_fr.equalsIgnoreCase(name)) {
			return rqst_dt_fr();
		}
		if ($rqst_dt_to.equalsIgnoreCase(name)) {
			return rqst_dt_to();
		}
		if ($acxfr_schd_dt_fr.equalsIgnoreCase(name)) {
			return acxfr_schd_dt_fr();
		}
		if ($acxfr_schd_dt_to.equalsIgnoreCase(name)) {
			return acxfr_schd_dt_to();
		}
		if ($acxfr_inst_dt_fr.equalsIgnoreCase(name)) {
			return acxfr_inst_dt_fr();
		}
		if ($acxfr_inst_dt_to.equalsIgnoreCase(name)) {
			return acxfr_inst_dt_to();
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
		if ($not_inst_flg.equalsIgnoreCase(name)) {
			return not_inst_flg();
		}
		if ($inst_flg.equalsIgnoreCase(name)) {
			return inst_flg();
		}
		if ($part_comp_flg.equalsIgnoreCase(name)) {
			return part_comp_flg();
		}
		if ($comp_flg.equalsIgnoreCase(name)) {
			return comp_flg();
		}
		if ($wms_flg.equalsIgnoreCase(name)) {
			return wms_flg();
		}
		if ($not_wms_flg.equalsIgnoreCase(name)) {
			return not_wms_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($schd_no_aprv_flg.equalsIgnoreCase(name)) {
			return schd_no_aprv_flg();
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
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($acxfr_schd_no.equalsIgnoreCase(name)) {
			return acxfr_schd_no();
		}
		if ($acxfr_inst_no.equalsIgnoreCase(name)) {
			return acxfr_inst_no();
		}
		if ($acxfr_inst_d_no.equalsIgnoreCase(name)) {
			return acxfr_inst_d_no();
		}
		if ($acxfr_act_no.equalsIgnoreCase(name)) {
			return acxfr_act_no();
		}
		if ($acxfr_act_d_no.equalsIgnoreCase(name)) {
			return acxfr_act_d_no();
		}
		if ($ext_acxfr_act_no.equalsIgnoreCase(name)) {
			return ext_acxfr_act_no();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			return str_ln_nm();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			return loc_grp_cd();
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			return loc_grp_nm();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			return bd_dpt_nm();
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			return rsn_cd();
		}
		if ($rsn_nm.equalsIgnoreCase(name)) {
			return rsn_nm();
		}
		if ($dspsl_no.equalsIgnoreCase(name)) {
			return dspsl_no();
		}
		if ($rqst_usr_cd.equalsIgnoreCase(name)) {
			return rqst_usr_cd();
		}
		if ($rqst_usr_nm.equalsIgnoreCase(name)) {
			return rqst_usr_nm();
		}
		if ($rqst_dpt_cd.equalsIgnoreCase(name)) {
			return rqst_dpt_cd();
		}
		if ($rqst_dpt_nm.equalsIgnoreCase(name)) {
			return rqst_dpt_nm();
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
		if ($schd_trd_d_rmrks.equalsIgnoreCase(name)) {
			return schd_trd_d_rmrks();
		}
		if ($schd_dspsl_rmrks.equalsIgnoreCase(name)) {
			return schd_dspsl_rmrks();
		}
		if ($schd_sub_char1.equalsIgnoreCase(name)) {
			return schd_sub_char1();
		}
		if ($schd_sub_char2.equalsIgnoreCase(name)) {
			return schd_sub_char2();
		}
		if ($schd_sub_char3.equalsIgnoreCase(name)) {
			return schd_sub_char3();
		}
		if ($inst_intr_rmrks.equalsIgnoreCase(name)) {
			return inst_intr_rmrks();
		}
		if ($inst_trd_rmrks.equalsIgnoreCase(name)) {
			return inst_trd_rmrks();
		}
		if ($inst_rmrks.equalsIgnoreCase(name)) {
			return inst_rmrks();
		}
		if ($inst_sub_char1.equalsIgnoreCase(name)) {
			return inst_sub_char1();
		}
		if ($inst_sub_char2.equalsIgnoreCase(name)) {
			return inst_sub_char2();
		}
		if ($inst_sub_char3.equalsIgnoreCase(name)) {
			return inst_sub_char3();
		}
		if ($inst_intr_d_rmrks.equalsIgnoreCase(name)) {
			return inst_intr_d_rmrks();
		}
		if ($inst_trd_d_rmrks.equalsIgnoreCase(name)) {
			return inst_trd_d_rmrks();
		}
		if ($inst_d_rmrks.equalsIgnoreCase(name)) {
			return inst_d_rmrks();
		}
		if ($inst_d_sub_char1.equalsIgnoreCase(name)) {
			return inst_d_sub_char1();
		}
		if ($inst_d_sub_char2.equalsIgnoreCase(name)) {
			return inst_d_sub_char2();
		}
		if ($inst_d_sub_char3.equalsIgnoreCase(name)) {
			return inst_d_sub_char3();
		}
		if ($act_intr_rmrks.equalsIgnoreCase(name)) {
			return act_intr_rmrks();
		}
		if ($act_trd_rmrks.equalsIgnoreCase(name)) {
			return act_trd_rmrks();
		}
		if ($act_sub_char1.equalsIgnoreCase(name)) {
			return act_sub_char1();
		}
		if ($act_sub_char2.equalsIgnoreCase(name)) {
			return act_sub_char2();
		}
		if ($act_sub_char3.equalsIgnoreCase(name)) {
			return act_sub_char3();
		}
		if ($act_intr_d_rmrks.equalsIgnoreCase(name)) {
			return act_intr_d_rmrks();
		}
		if ($act_trd_d_rmrks.equalsIgnoreCase(name)) {
			return act_trd_d_rmrks();
		}
		if ($act_d_sub_char1.equalsIgnoreCase(name)) {
			return act_d_sub_char1();
		}
		if ($act_d_sub_char2.equalsIgnoreCase(name)) {
			return act_d_sub_char2();
		}
		if ($act_d_sub_char3.equalsIgnoreCase(name)) {
			return act_d_sub_char3();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($rqst_dt_fr.equalsIgnoreCase(name)) {
			return rqst_dt_fr();
		}
		if ($rqst_dt_to.equalsIgnoreCase(name)) {
			return rqst_dt_to();
		}
		if ($acxfr_schd_dt_fr.equalsIgnoreCase(name)) {
			return acxfr_schd_dt_fr();
		}
		if ($acxfr_schd_dt_to.equalsIgnoreCase(name)) {
			return acxfr_schd_dt_to();
		}
		if ($acxfr_inst_dt_fr.equalsIgnoreCase(name)) {
			return acxfr_inst_dt_fr();
		}
		if ($acxfr_inst_dt_to.equalsIgnoreCase(name)) {
			return acxfr_inst_dt_to();
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
		if ($not_inst_flg.equalsIgnoreCase(name)) {
			return not_inst_flg();
		}
		if ($inst_flg.equalsIgnoreCase(name)) {
			return inst_flg();
		}
		if ($part_comp_flg.equalsIgnoreCase(name)) {
			return part_comp_flg();
		}
		if ($comp_flg.equalsIgnoreCase(name)) {
			return comp_flg();
		}
		if ($wms_flg.equalsIgnoreCase(name)) {
			return wms_flg();
		}
		if ($not_wms_flg.equalsIgnoreCase(name)) {
			return not_wms_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($schd_no_aprv_flg.equalsIgnoreCase(name)) {
			return schd_no_aprv_flg();
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
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
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
		if ($acxfr_schd_no.equalsIgnoreCase(name)) {
			acxfr_schd_no(value);
			return;
		}
		if ($acxfr_inst_no.equalsIgnoreCase(name)) {
			acxfr_inst_no(value);
			return;
		}
		if ($acxfr_inst_d_no.equalsIgnoreCase(name)) {
			acxfr_inst_d_no(value);
			return;
		}
		if ($acxfr_act_no.equalsIgnoreCase(name)) {
			acxfr_act_no(value);
			return;
		}
		if ($acxfr_act_d_no.equalsIgnoreCase(name)) {
			acxfr_act_d_no(value);
			return;
		}
		if ($ext_acxfr_act_no.equalsIgnoreCase(name)) {
			ext_acxfr_act_no(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			str_ln_nm(value);
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
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			loc_grp_cd(value);
			return;
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			loc_grp_nm(value);
			return;
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			bd_dpt_cd(value);
			return;
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			bd_dpt_nm(value);
			return;
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			rsn_cd(value);
			return;
		}
		if ($rsn_nm.equalsIgnoreCase(name)) {
			rsn_nm(value);
			return;
		}
		if ($dspsl_no.equalsIgnoreCase(name)) {
			dspsl_no(value);
			return;
		}
		if ($rqst_usr_cd.equalsIgnoreCase(name)) {
			rqst_usr_cd(value);
			return;
		}
		if ($rqst_usr_nm.equalsIgnoreCase(name)) {
			rqst_usr_nm(value);
			return;
		}
		if ($rqst_dpt_cd.equalsIgnoreCase(name)) {
			rqst_dpt_cd(value);
			return;
		}
		if ($rqst_dpt_nm.equalsIgnoreCase(name)) {
			rqst_dpt_nm(value);
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
		if ($schd_trd_d_rmrks.equalsIgnoreCase(name)) {
			schd_trd_d_rmrks(value);
			return;
		}
		if ($schd_dspsl_rmrks.equalsIgnoreCase(name)) {
			schd_dspsl_rmrks(value);
			return;
		}
		if ($schd_sub_char1.equalsIgnoreCase(name)) {
			schd_sub_char1(value);
			return;
		}
		if ($schd_sub_char2.equalsIgnoreCase(name)) {
			schd_sub_char2(value);
			return;
		}
		if ($schd_sub_char3.equalsIgnoreCase(name)) {
			schd_sub_char3(value);
			return;
		}
		if ($inst_intr_rmrks.equalsIgnoreCase(name)) {
			inst_intr_rmrks(value);
			return;
		}
		if ($inst_trd_rmrks.equalsIgnoreCase(name)) {
			inst_trd_rmrks(value);
			return;
		}
		if ($inst_rmrks.equalsIgnoreCase(name)) {
			inst_rmrks(value);
			return;
		}
		if ($inst_sub_char1.equalsIgnoreCase(name)) {
			inst_sub_char1(value);
			return;
		}
		if ($inst_sub_char2.equalsIgnoreCase(name)) {
			inst_sub_char2(value);
			return;
		}
		if ($inst_sub_char3.equalsIgnoreCase(name)) {
			inst_sub_char3(value);
			return;
		}
		if ($inst_intr_d_rmrks.equalsIgnoreCase(name)) {
			inst_intr_d_rmrks(value);
			return;
		}
		if ($inst_trd_d_rmrks.equalsIgnoreCase(name)) {
			inst_trd_d_rmrks(value);
			return;
		}
		if ($inst_d_rmrks.equalsIgnoreCase(name)) {
			inst_d_rmrks(value);
			return;
		}
		if ($inst_d_sub_char1.equalsIgnoreCase(name)) {
			inst_d_sub_char1(value);
			return;
		}
		if ($inst_d_sub_char2.equalsIgnoreCase(name)) {
			inst_d_sub_char2(value);
			return;
		}
		if ($inst_d_sub_char3.equalsIgnoreCase(name)) {
			inst_d_sub_char3(value);
			return;
		}
		if ($act_intr_rmrks.equalsIgnoreCase(name)) {
			act_intr_rmrks(value);
			return;
		}
		if ($act_trd_rmrks.equalsIgnoreCase(name)) {
			act_trd_rmrks(value);
			return;
		}
		if ($act_sub_char1.equalsIgnoreCase(name)) {
			act_sub_char1(value);
			return;
		}
		if ($act_sub_char2.equalsIgnoreCase(name)) {
			act_sub_char2(value);
			return;
		}
		if ($act_sub_char3.equalsIgnoreCase(name)) {
			act_sub_char3(value);
			return;
		}
		if ($act_intr_d_rmrks.equalsIgnoreCase(name)) {
			act_intr_d_rmrks(value);
			return;
		}
		if ($act_trd_d_rmrks.equalsIgnoreCase(name)) {
			act_trd_d_rmrks(value);
			return;
		}
		if ($act_d_sub_char1.equalsIgnoreCase(name)) {
			act_d_sub_char1(value);
			return;
		}
		if ($act_d_sub_char2.equalsIgnoreCase(name)) {
			act_d_sub_char2(value);
			return;
		}
		if ($act_d_sub_char3.equalsIgnoreCase(name)) {
			act_d_sub_char3(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($rqst_dt_fr.equalsIgnoreCase(name)) {
			rqst_dt_fr(value);
			return;
		}
		if ($rqst_dt_to.equalsIgnoreCase(name)) {
			rqst_dt_to(value);
			return;
		}
		if ($acxfr_schd_dt_fr.equalsIgnoreCase(name)) {
			acxfr_schd_dt_fr(value);
			return;
		}
		if ($acxfr_schd_dt_to.equalsIgnoreCase(name)) {
			acxfr_schd_dt_to(value);
			return;
		}
		if ($acxfr_inst_dt_fr.equalsIgnoreCase(name)) {
			acxfr_inst_dt_fr(value);
			return;
		}
		if ($acxfr_inst_dt_to.equalsIgnoreCase(name)) {
			acxfr_inst_dt_to(value);
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
		if ($not_inst_flg.equalsIgnoreCase(name)) {
			not_inst_flg(value);
			return;
		}
		if ($inst_flg.equalsIgnoreCase(name)) {
			inst_flg(value);
			return;
		}
		if ($part_comp_flg.equalsIgnoreCase(name)) {
			part_comp_flg(value);
			return;
		}
		if ($comp_flg.equalsIgnoreCase(name)) {
			comp_flg(value);
			return;
		}
		if ($wms_flg.equalsIgnoreCase(name)) {
			wms_flg(value);
			return;
		}
		if ($not_wms_flg.equalsIgnoreCase(name)) {
			not_wms_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($schd_no_aprv_flg.equalsIgnoreCase(name)) {
			schd_no_aprv_flg(value);
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
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
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
		if ($acxfr_schd_no.equalsIgnoreCase(name)) {
			acxfr_schd_no(value);
			return;
		}
		if ($acxfr_inst_no.equalsIgnoreCase(name)) {
			acxfr_inst_no(value);
			return;
		}
		if ($acxfr_inst_d_no.equalsIgnoreCase(name)) {
			acxfr_inst_d_no(value);
			return;
		}
		if ($acxfr_act_no.equalsIgnoreCase(name)) {
			acxfr_act_no(value);
			return;
		}
		if ($acxfr_act_d_no.equalsIgnoreCase(name)) {
			acxfr_act_d_no(value);
			return;
		}
		if ($ext_acxfr_act_no.equalsIgnoreCase(name)) {
			ext_acxfr_act_no(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			str_ln_nm(value);
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
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			loc_grp_cd(value);
			return;
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			loc_grp_nm(value);
			return;
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			bd_dpt_cd(value);
			return;
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			bd_dpt_nm(value);
			return;
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			rsn_cd(value);
			return;
		}
		if ($rsn_nm.equalsIgnoreCase(name)) {
			rsn_nm(value);
			return;
		}
		if ($dspsl_no.equalsIgnoreCase(name)) {
			dspsl_no(value);
			return;
		}
		if ($rqst_usr_cd.equalsIgnoreCase(name)) {
			rqst_usr_cd(value);
			return;
		}
		if ($rqst_usr_nm.equalsIgnoreCase(name)) {
			rqst_usr_nm(value);
			return;
		}
		if ($rqst_dpt_cd.equalsIgnoreCase(name)) {
			rqst_dpt_cd(value);
			return;
		}
		if ($rqst_dpt_nm.equalsIgnoreCase(name)) {
			rqst_dpt_nm(value);
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
		if ($schd_trd_d_rmrks.equalsIgnoreCase(name)) {
			schd_trd_d_rmrks(value);
			return;
		}
		if ($schd_dspsl_rmrks.equalsIgnoreCase(name)) {
			schd_dspsl_rmrks(value);
			return;
		}
		if ($schd_sub_char1.equalsIgnoreCase(name)) {
			schd_sub_char1(value);
			return;
		}
		if ($schd_sub_char2.equalsIgnoreCase(name)) {
			schd_sub_char2(value);
			return;
		}
		if ($schd_sub_char3.equalsIgnoreCase(name)) {
			schd_sub_char3(value);
			return;
		}
		if ($inst_intr_rmrks.equalsIgnoreCase(name)) {
			inst_intr_rmrks(value);
			return;
		}
		if ($inst_trd_rmrks.equalsIgnoreCase(name)) {
			inst_trd_rmrks(value);
			return;
		}
		if ($inst_rmrks.equalsIgnoreCase(name)) {
			inst_rmrks(value);
			return;
		}
		if ($inst_sub_char1.equalsIgnoreCase(name)) {
			inst_sub_char1(value);
			return;
		}
		if ($inst_sub_char2.equalsIgnoreCase(name)) {
			inst_sub_char2(value);
			return;
		}
		if ($inst_sub_char3.equalsIgnoreCase(name)) {
			inst_sub_char3(value);
			return;
		}
		if ($inst_intr_d_rmrks.equalsIgnoreCase(name)) {
			inst_intr_d_rmrks(value);
			return;
		}
		if ($inst_trd_d_rmrks.equalsIgnoreCase(name)) {
			inst_trd_d_rmrks(value);
			return;
		}
		if ($inst_d_rmrks.equalsIgnoreCase(name)) {
			inst_d_rmrks(value);
			return;
		}
		if ($inst_d_sub_char1.equalsIgnoreCase(name)) {
			inst_d_sub_char1(value);
			return;
		}
		if ($inst_d_sub_char2.equalsIgnoreCase(name)) {
			inst_d_sub_char2(value);
			return;
		}
		if ($inst_d_sub_char3.equalsIgnoreCase(name)) {
			inst_d_sub_char3(value);
			return;
		}
		if ($act_intr_rmrks.equalsIgnoreCase(name)) {
			act_intr_rmrks(value);
			return;
		}
		if ($act_trd_rmrks.equalsIgnoreCase(name)) {
			act_trd_rmrks(value);
			return;
		}
		if ($act_sub_char1.equalsIgnoreCase(name)) {
			act_sub_char1(value);
			return;
		}
		if ($act_sub_char2.equalsIgnoreCase(name)) {
			act_sub_char2(value);
			return;
		}
		if ($act_sub_char3.equalsIgnoreCase(name)) {
			act_sub_char3(value);
			return;
		}
		if ($act_intr_d_rmrks.equalsIgnoreCase(name)) {
			act_intr_d_rmrks(value);
			return;
		}
		if ($act_trd_d_rmrks.equalsIgnoreCase(name)) {
			act_trd_d_rmrks(value);
			return;
		}
		if ($act_d_sub_char1.equalsIgnoreCase(name)) {
			act_d_sub_char1(value);
			return;
		}
		if ($act_d_sub_char2.equalsIgnoreCase(name)) {
			act_d_sub_char2(value);
			return;
		}
		if ($act_d_sub_char3.equalsIgnoreCase(name)) {
			act_d_sub_char3(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($rqst_dt_fr.equalsIgnoreCase(name)) {
			rqst_dt_fr(value);
			return;
		}
		if ($rqst_dt_to.equalsIgnoreCase(name)) {
			rqst_dt_to(value);
			return;
		}
		if ($acxfr_schd_dt_fr.equalsIgnoreCase(name)) {
			acxfr_schd_dt_fr(value);
			return;
		}
		if ($acxfr_schd_dt_to.equalsIgnoreCase(name)) {
			acxfr_schd_dt_to(value);
			return;
		}
		if ($acxfr_inst_dt_fr.equalsIgnoreCase(name)) {
			acxfr_inst_dt_fr(value);
			return;
		}
		if ($acxfr_inst_dt_to.equalsIgnoreCase(name)) {
			acxfr_inst_dt_to(value);
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
		if ($not_inst_flg.equalsIgnoreCase(name)) {
			not_inst_flg(value);
			return;
		}
		if ($inst_flg.equalsIgnoreCase(name)) {
			inst_flg(value);
			return;
		}
		if ($part_comp_flg.equalsIgnoreCase(name)) {
			part_comp_flg(value);
			return;
		}
		if ($comp_flg.equalsIgnoreCase(name)) {
			comp_flg(value);
			return;
		}
		if ($wms_flg.equalsIgnoreCase(name)) {
			wms_flg(value);
			return;
		}
		if ($not_wms_flg.equalsIgnoreCase(name)) {
			not_wms_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($schd_no_aprv_flg.equalsIgnoreCase(name)) {
			schd_no_aprv_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itm_typ_p.equalsIgnoreCase(name)) {
			return itm_typ_p();
		}
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($ver_no_p.equalsIgnoreCase(name)) {
			return ver_no_p();
		}
		if ($sno_p.equalsIgnoreCase(name)) {
			return sno_p();
		}
		if ($acxfr_act_dt_p.equalsIgnoreCase(name)) {
			return acxfr_act_dt_p();
		}
		if ($itm_grp_p.equalsIgnoreCase(name)) {
			return itm_grp_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
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
		if ($sno_p.equalsIgnoreCase(name)) {
			sno_p(
				((MCContainerMeta) sno_p_META).castInnerRow(mcframe.clientMSUB.MSUBP0020.SnoWrkNoR.class, value)
			);
			return;
		}
		if ($acxfr_act_dt_p.equalsIgnoreCase(name)) {
			acxfr_act_dt_p(
				((MCContainerMeta) acxfr_act_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class, value)
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
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return ver_no_p().ver_no();
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		ver_no_p().ver_no(value);
	}

	public String sno1() {
		return sno_p().sno1();
	}

	public void sno1(String value) {
		sno_p().sno1(value);
	}

	public String sno2() {
		return sno_p().sno2();
	}

	public void sno2(String value) {
		sno_p().sno2(value);
	}

	public String sno3() {
		return sno_p().sno3();
	}

	public void sno3(String value) {
		sno_p().sno3(value);
	}

	public String sno4() {
		return sno_p().sno4();
	}

	public void sno4(String value) {
		sno_p().sno4(value);
	}

	public String wrk_no() {
		return sno_p().wrk_no();
	}

	public void wrk_no(String value) {
		sno_p().wrk_no(value);
	}

	public String wrk_nm() {
		return sno_p().wrk_nm();
	}

	public void wrk_nm(String value) {
		sno_p().wrk_nm(value);
	}

	/**
	 * Actual transfer date FROM 振替実績日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate acxfr_act_dt_fr() {
		return acxfr_act_dt_p().ymd_fr();
	}

	/**
	 * Actual transfer date FROM 振替実績日ＦＲＯＭ.<p>
	 *
	 */
	public void acxfr_act_dt_fr(MCDate value) {
		acxfr_act_dt_p().ymd_fr(value);
	}

	/**
	 * Actual transfer time FROM 振替実績時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate acxfr_act_hm_fr() {
		return acxfr_act_dt_p().hm_fr();
	}

	/**
	 * Actual transfer time FROM 振替実績時刻ＦＲＯＭ.<p>
	 *
	 */
	public void acxfr_act_hm_fr(MCDate value) {
		acxfr_act_dt_p().hm_fr(value);
	}

	/**
	 * Actual transfer date TO 振替実績日ＴＯ.<p>
	 *
	 */
	public MCDate acxfr_act_dt_to() {
		return acxfr_act_dt_p().ymd_to();
	}

	/**
	 * Actual transfer date TO 振替実績日ＴＯ.<p>
	 *
	 */
	public void acxfr_act_dt_to(MCDate value) {
		acxfr_act_dt_p().ymd_to(value);
	}

	/**
	 * Actual transfer time TO 振替実績時刻ＴＯ.<p>
	 *
	 */
	public MCDate acxfr_act_hm_to() {
		return acxfr_act_dt_p().hm_to();
	}

	/**
	 * Actual transfer time TO 振替実績時刻ＴＯ.<p>
	 *
	 */
	public void acxfr_act_hm_to(MCDate value) {
		acxfr_act_dt_p().hm_to(value);
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

