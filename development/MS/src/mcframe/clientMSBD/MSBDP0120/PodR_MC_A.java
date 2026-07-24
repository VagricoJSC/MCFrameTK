package mcframe.clientMSBD.MSBDP0120;

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
 * ブロック"Pod"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class PodR_MC_A extends MCConstRow {

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public static final String $po_d_no = "po_d_no";
	/**
	 * Receipt progress No. 入荷進捗ＮＯ.<p>
	 *
	 */
	public static final String $arr_pr_no = "arr_pr_no";
	public static final String $itm_p = "itm_p";
	/**
	 * Item name for I/V Ｉ／Ｖ表記品名.<p>
	 *
	 */
	public static final String $iv_itm_nm = "iv_itm_nm";
	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public static final String $sundry_itm_flg = "sundry_itm_flg";
	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public static final String $dscnt_itm_flg = "dscnt_itm_flg";
	/**
	 * Delivery location cd. 納入場所ＣＤ.<p>
	 *
	 */
	public static final String $in_to_loc_cd = "in_to_loc_cd";
	/**
	 * Delivery location name 納入場所名.<p>
	 *
	 */
	public static final String $in_to_loc_nm = "in_to_loc_nm";
	/**
	 * For rack/line 棚・ライン対象.<p>
	 *
	 */
	public static final String $in_to_str_ln_tgt_flg = "in_to_str_ln_tgt_flg";
	public static final String $in_to_loc_addr_p = "in_to_loc_addr_p";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $in_to_loc_wg_cd = "in_to_loc_wg_cd";
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $site_cd = "site_cd";
	/**
	 * Delivery location distribution group cd. 納入場所物流グループＣＤ.<p>
	 *
	 */
	public static final String $in_to_loc_lg_grp_cd = "in_to_loc_lg_grp_cd";
	/**
	 * Delivery location calendar cd. 納入場所カレンダＣＤ.<p>
	 *
	 */
	public static final String $in_to_loc_cal_cd = "in_to_loc_cal_cd";
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
	/**
	 * Without rack/line 棚・ライン無.<p>
	 *
	 */
	public static final String $str_ln_cd_none_flg = "str_ln_cd_none_flg";
	/**
	 * Subcontractor 外注発注先.<p>
	 *
	 */
	public static final String $outsrc_sppl_cd = "outsrc_sppl_cd";
	/**
	 * Direct-delivery type 直納区分.<p>
	 *
	 */
	public static final String $drct_dlv_typ = "drct_dlv_typ";
	/**
	 * Direct-delivery type name 直納区分名.<p>
	 *
	 */
	public static final String $drct_dlv_typ_nm = "drct_dlv_typ_nm";
	public static final String $dlv_addr_p = "dlv_addr_p";
	/**
	 * Delivery destination calendar 納品先カレンダ.<p>
	 *
	 */
	public static final String $dlv_cal_cd = "dlv_cal_cd";
	public static final String $tdlv_addr_p = "tdlv_addr_p";
	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public static final String $purc_id_typ = "purc_id_typ";
	/**
	 * Purchase identification type name 購買識別区分名.<p>
	 *
	 */
	public static final String $purc_id_typ_nm = "purc_id_typ_nm";
	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public static final String $abort_flg = "abort_flg";
	/**
	 * Purchase status type 購買状況区分.<p>
	 *
	 */
	public static final String $purc_sts_typ = "purc_sts_typ";
	/**
	 * Purchase status type name 購買状況区分名.<p>
	 *
	 */
	public static final String $purc_sts_typ_nm = "purc_sts_typ_nm";
	public static final String $ver_no_p = "ver_no_p";
	/**
	 * Desired delivery date 納入希望日.<p>
	 *
	 */
	public static final String $dlv_rqst_dt = "dlv_rqst_dt";
	/**
	 * Desired delivery time 納入希望時刻.<p>
	 *
	 */
	public static final String $dlv_rqst_hm = "dlv_rqst_hm";
	/**
	 * Request source desired delivery date 依頼元納入希望日.<p>
	 *
	 */
	public static final String $rqst_dlv_rqst_dt = "rqst_dlv_rqst_dt";
	/**
	 * Request source desired delivery time 依頼元納入希望時刻.<p>
	 *
	 */
	public static final String $rqst_dlv_rqst_hm = "rqst_dlv_rqst_hm";
	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public static final String $purc_schd_dt = "purc_schd_dt";
	/**
	 * Simultaneous recording 同時計上.<p>
	 *
	 */
	public static final String $sync_flg = "sync_flg";
	/**
	 * Purchase recording type 仕入計上区分.<p>
	 *
	 */
	public static final String $purc_basis_typ = "purc_basis_typ";
	/**
	 * Purchase recording type name 仕入計上区分名.<p>
	 *
	 */
	public static final String $purc_basis_typ_nm = "purc_basis_typ_nm";
	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public static final String $sppl_itm_cd = "sppl_itm_cd";
	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public static final String $sppl_itm_nm = "sppl_itm_nm";
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
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public static final String $bom_ptn = "bom_ptn";
	/**
	 * Subcontracting 外注.<p>
	 *
	 */
	public static final String $outsrc_flg = "outsrc_flg";
	public static final String $sno_p = "sno_p";
	public static final String $qty_p = "qty_p";
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public static final String $trd_unit_cd = "trd_unit_cd";
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public static final String $trd_unit_nm = "trd_unit_nm";
	/**
	 * Transaction unit number of decimal places 小数部有効桁数（取引単位）.<p>
	 *
	 */
	public static final String $trd_unit_dec_place = "trd_unit_dec_place";
	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public static final String $trd_unit_conv_base_qty = "trd_unit_conv_base_qty";
	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public static final String $trd_unit_conv_qty = "trd_unit_conv_qty";
	public static final String $base_unit_qty_p = "base_unit_qty_p";
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public static final String $base_unit_nm = "base_unit_nm";
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public static final String $base_unit_dec_place = "base_unit_dec_place";
	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public static final String $base_unit_rnd_typ = "base_unit_rnd_typ";
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public static final String $cont_fctr_flg = "cont_fctr_flg";
	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public static final String $cont_fctr_dec_place = "cont_fctr_dec_place";
	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public static final String $cont_fctr_rnd_typ = "cont_fctr_rnd_typ";
	public static final String $cont_qty_p = "cont_qty_p";
	public static final String $cont_fctr_unit_p = "cont_fctr_unit_p";
	public static final String $std_cont_fctr_p = "std_cont_fctr_p";
	/**
	 * Delivery order date 納入指示日.<p>
	 *
	 */
	public static final String $dlv_inst_dt = "dlv_inst_dt";
	public static final String $dlv_inst_qty_p = "dlv_inst_qty_p";
	/**
	 * Delivery order replied received date 納入指示回答受領日.<p>
	 *
	 */
	public static final String $dlv_inst_prms_rcpt_dt = "dlv_inst_prms_rcpt_dt";
	/**
	 * Delivery order reply applied date 納入指示回答反映日.<p>
	 *
	 */
	public static final String $dlv_inst_prms_refl_dt = "dlv_inst_prms_refl_dt";
	/**
	 * Order promising result received date 納期回答受領日.<p>
	 *
	 */
	public static final String $prms_rcpt_dt = "prms_rcpt_dt";
	/**
	 * Order promising applied date 納期回答反映日.<p>
	 *
	 */
	public static final String $prms_refl_dt = "prms_refl_dt";
	/**
	 * Replied delivery date 回答納入日.<p>
	 *
	 */
	public static final String $prms_dlv_dt = "prms_dlv_dt";
	public static final String $prms_rcpt_qty_p = "prms_rcpt_qty_p";
	public static final String $prms_refl_qty_p = "prms_refl_qty_p";
	public static final String $dlv_inst_prms_rcpt_qty_p = "dlv_inst_prms_rcpt_qty_p";
	public static final String $dlv_inst_prms_refl_qty_p = "dlv_inst_prms_refl_qty_p";
	public static final String $rcpt_iv_qty_p = "rcpt_iv_qty_p";
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
	 * Details PO sheet remarks 明細注文書備考.<p>
	 *
	 */
	public static final String $po_print_d_rmrks = "po_print_d_rmrks";
	/**
	 * External PO details No. 外部発注明細ＮＯ.<p>
	 *
	 */
	public static final String $ext_po_d_no = "ext_po_d_no";
	/**
	 * Current EDI delivery order 今回ＥＤＩ納入指示.<p>
	 *
	 */
	public static final String $crnt_edi_dlv_inst_flg = "crnt_edi_dlv_inst_flg";
	/**
	 * Last EDI delivery order 前回ＥＤＩ納入指示.<p>
	 *
	 */
	public static final String $edi_dlv_inst_flg = "edi_dlv_inst_flg";
	/**
	 * For EDI ＥＤＩ対象.<p>
	 *
	 */
	public static final String $edi_tgt_flg = "edi_tgt_flg";
	/**
	 * Delivery order external system type 納入指示外部システム区分.<p>
	 *
	 */
	public static final String $dlv_inst_ext_sys_typ = "dlv_inst_ext_sys_typ";
	/**
	 * Receipt progress update counter 入荷進捗更新カウンタ.<p>
	 *
	 */
	public static final String $arr_pr_upd_cntr = "arr_pr_upd_cntr";
	/**
	 * Sales order date 受注日.<p>
	 *
	 */
	public static final String $slo_dt = "slo_dt";
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public static final String $cst_cd = "cst_cd";
	/**
	 * Assortment type 品揃区分.<p>
	 *
	 */
	public static final String $assort_typ = "assort_typ";
	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public static final String $set_itm_grp_no = "set_itm_grp_no";

	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $cntry_cd = $in_to_loc_addr_p + ".cntry_cd";
	public static final String $cntry_nm = $in_to_loc_addr_p + ".cntry_nm";
	public static final String $in_to_loc_zip_cd = $in_to_loc_addr_p + ".zip_cd";
	public static final String $in_to_loc_addr1 = $in_to_loc_addr_p + ".addr1";
	public static final String $in_to_loc_addr2 = $in_to_loc_addr_p + ".addr2";
	public static final String $in_to_loc_addr3 = $in_to_loc_addr_p + ".addr3";
	public static final String $in_to_loc_addr4 = $in_to_loc_addr_p + ".addr4";
	public static final String $in_to_loc_tel = $in_to_loc_addr_p + ".tel";
	public static final String $in_to_loc_fax = $in_to_loc_addr_p + ".fax";
	public static final String $cntct_dpt = $in_to_loc_addr_p + ".cntct_dpt";
	public static final String $cntct_psn = $in_to_loc_addr_p + ".cntct_psn";
	public static final String $dlv_cd = $dlv_addr_p + ".bp_cd";
	public static final String $dlv_nm = $dlv_addr_p + ".bp_nm";
	public static final String $dlv_sundry_flg = $dlv_addr_p + ".dlv_sundry_flg";
	public static final String $lg_grp_cd = $dlv_addr_p + ".lg_grp_cd";
	public static final String $lg_grp_nm = $dlv_addr_p + ".lg_grp_nm";
	public static final String $dlv_cntry_cd = $dlv_addr_p + ".cntry_cd";
	public static final String $dlv_cntry_nm = $dlv_addr_p + ".cntry_nm";
	public static final String $dlv_zip_cd = $dlv_addr_p + ".zip_cd";
	public static final String $dlv_addr1 = $dlv_addr_p + ".addr1";
	public static final String $dlv_addr2 = $dlv_addr_p + ".addr2";
	public static final String $dlv_addr3 = $dlv_addr_p + ".addr3";
	public static final String $dlv_addr4 = $dlv_addr_p + ".addr4";
	public static final String $dlv_tel = $dlv_addr_p + ".tel";
	public static final String $dlv_fax = $dlv_addr_p + ".fax";
	public static final String $dlv_cntct_dpt = $dlv_addr_p + ".dlv_cntct_dpt";
	public static final String $dlv_cntct_psn = $dlv_addr_p + ".dlv_cntct_psn";
	public static final String $pri_prnt_flg = $dlv_addr_p + ".pri_prnt_flg";
	public static final String $tdlv_cd = $tdlv_addr_p + ".bp_cd";
	public static final String $tdlv_nm = $tdlv_addr_p + ".bp_nm";
	public static final String $tdlv_sundry_flg = $tdlv_addr_p + ".dlv_sundry_flg";
	public static final String $tdlv_show_dt = $tdlv_addr_p + ".show_dtl";
	public static final String $tdlv_cntry_cd = $tdlv_addr_p + ".cntry_cd";
	public static final String $tdlv_cntry_nm = $tdlv_addr_p + ".cntry_nm";
	public static final String $tdlv_zip_cd = $tdlv_addr_p + ".zip_cd";
	public static final String $tdlv_addr1 = $tdlv_addr_p + ".addr1";
	public static final String $tdlv_addr2 = $tdlv_addr_p + ".addr2";
	public static final String $tdlv_addr3 = $tdlv_addr_p + ".addr3";
	public static final String $tdlv_addr4 = $tdlv_addr_p + ".addr4";
	public static final String $tdlv_tel = $tdlv_addr_p + ".tel";
	public static final String $tdlv_fax = $tdlv_addr_p + ".fax";
	public static final String $tdlv_cntct_dpt = $tdlv_addr_p + ".dlv_cntct_dpt";
	public static final String $tdlv_cntct_psn = $tdlv_addr_p + ".dlv_cntct_psn";
	public static final String $ver_no = $ver_no_p + ".ver_no";
	public static final String $sno1 = $sno_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "";
	public static final String $sno2 = $sno_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "";
	public static final String $sno3 = $sno_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "";
	public static final String $sno4 = $sno_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "";
	public static final String $wrk_no = $sno_p + ".wrk_no";
	public static final String $wrk_nm = $sno_p + ".wrk_nm";
	public static final String $trd_unit_qty = $qty_p + ".qty";
	public static final String $base_unit_qty = $base_unit_qty_p + ".qty";
	public static final String $cont_qty = $cont_qty_p + ".cont_qty";
	public static final String $cont_fctr_unit_cd = $cont_fctr_unit_p + ".cont_fctr_unit_cd";
	public static final String $cont_fctr_unit_nm = $cont_fctr_unit_p + ".cont_fctr_unit_nm";
	public static final String $std_cont_fctr = $std_cont_fctr_p + ".std_cont_fctr";
	public static final String $dlv_inst_qty = $dlv_inst_qty_p + ".qty";
	public static final String $prms_rcpt_qty = $prms_rcpt_qty_p + ".qty";
	public static final String $prms_refl_qty = $prms_refl_qty_p + ".qty";
	public static final String $dlv_inst_prms_rcpt_qty = $dlv_inst_prms_rcpt_qty_p + ".qty";
	public static final String $dlv_inst_prms_refl_qty = $dlv_inst_prms_refl_qty_p + ".qty";
	public static final String $rcpt_iv_qty = $rcpt_iv_qty_p + ".qty";

	public static final MCMeta po_d_no_META = createCommonMeta($po_d_no, mcframe.commonMA.meta.MA_META.PO_D_NO);
	public static final MCMeta arr_pr_no_META = createCommonMeta($arr_pr_no, mcframe.commonMA.meta.MA_META.ARR_PR_NO);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta iv_itm_nm_META = createCommonMeta($iv_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta sundry_itm_flg_META = createCommonMeta($sundry_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dscnt_itm_flg_META = createCommonMeta($dscnt_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta in_to_loc_cd_META = createCommonMeta($in_to_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta in_to_loc_nm_META = createCommonMeta($in_to_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta in_to_str_ln_tgt_flg_META = createCommonMeta($in_to_str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta in_to_loc_addr_p_META = createInnerRowMeta($in_to_loc_addr_p, mcframe.clientMAUB.MAUBP5360.AddrR.class);
	public static final MCMeta in_to_loc_wg_cd_META = createCommonMeta($in_to_loc_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta in_to_loc_lg_grp_cd_META = createCommonMeta($in_to_loc_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta in_to_loc_cal_cd_META = createCommonMeta($in_to_loc_cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta str_ln_cd_META = createCommonMeta($str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta str_ln_nm_META = createCommonMeta($str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta str_ln_cd_none_flg_META = createCommonMeta($str_ln_cd_none_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta outsrc_sppl_cd_META = createCommonMeta($outsrc_sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta drct_dlv_typ_META = createCommonMeta($drct_dlv_typ, mcframe.commonMS.meta.MS_META.DRCT_DLV_TYP);
	public static final MCMeta drct_dlv_typ_nm_META = createCommonMeta($drct_dlv_typ_nm, mcframe.commonMS.meta.MS_META.DRCT_DLV_TYP_NM);
	public static final MCMeta dlv_addr_p_META = createInnerRowMeta($dlv_addr_p, mcframe.clientMAUB.MAUBP5150.DlvR.class);
	public static final MCMeta dlv_cal_cd_META = createCommonMeta($dlv_cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta tdlv_addr_p_META = createInnerRowMeta($tdlv_addr_p, mcframe.clientMAUB.MAUBP5150.DlvR.class);
	public static final MCMeta purc_id_typ_META = createCommonMeta($purc_id_typ, mcframe.commonMA.meta.MA_META.PURC_ID_TYP);
	public static final MCMeta purc_id_typ_nm_META = createCommonMeta($purc_id_typ_nm, mcframe.commonMA.meta.MA_META.PURC_ID_TYP_NM);
	public static final MCMeta abort_flg_META = createCommonMeta($abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_sts_typ_META = createCommonMeta($purc_sts_typ, mcframe.commonMS.meta.MS_META.PURC_STS_TYP);
	public static final MCMeta purc_sts_typ_nm_META = createCommonMeta($purc_sts_typ_nm, mcframe.commonMS.meta.MS_META.PURC_STS_TYP_NM);
	public static final MCMeta ver_no_p_META = createInnerRowMeta($ver_no_p, mcframe.clientMAUB.MAUBP5250.VerNoR.class);
	public static final MCMeta dlv_rqst_dt_META = createCommonMeta($dlv_rqst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dlv_rqst_hm_META = createCommonMeta($dlv_rqst_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta rqst_dlv_rqst_dt_META = createCommonMeta($rqst_dlv_rqst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rqst_dlv_rqst_hm_META = createCommonMeta($rqst_dlv_rqst_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta purc_schd_dt_META = createCommonMeta($purc_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sync_flg_META = createCommonMeta($sync_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_basis_typ_META = createCommonMeta($purc_basis_typ, mcframe.commonMA.meta.MA_META.PURC_BASIS_TYP);
	public static final MCMeta purc_basis_typ_nm_META = createCommonMeta($purc_basis_typ_nm, mcframe.commonMA.meta.MA_META.PURC_BASIS_TYP_NM);
	public static final MCMeta sppl_itm_cd_META = createCommonMeta($sppl_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta sppl_itm_nm_META = createCommonMeta($sppl_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
	public static final MCMeta cst_itm_cd_META = createCommonMeta($cst_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta cst_itm_nm_META = createCommonMeta($cst_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
	public static final MCMeta maker_cd_META = createCommonMeta($maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta maker_nm_META = createCommonMeta($maker_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta mfg_loc_nm_META = createCommonMeta($mfg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta bom_ptn_META = createCommonMeta($bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta outsrc_flg_META = createCommonMeta($outsrc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno_p_META = createInnerRowMeta($sno_p, mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.class);
	public static final MCMeta qty_p_META = createInnerRowMeta($qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta trd_unit_nm_META = createCommonMeta($trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta trd_unit_dec_place_META = createCommonMeta($trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_unit_conv_base_qty_META = createCommonMeta($trd_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_conv_qty_META = createCommonMeta($trd_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_qty_p_META = createInnerRowMeta($base_unit_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_rnd_typ_META = createCommonMeta($base_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta cont_fctr_flg_META = createCommonMeta($cont_fctr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cont_fctr_dec_place_META = createCommonMeta($cont_fctr_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta cont_fctr_rnd_typ_META = createCommonMeta($cont_fctr_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta cont_qty_p_META = createInnerRowMeta($cont_qty_p, mcframe.clientMAUB.MAUBP5260.ContQtyR.class);
	public static final MCMeta cont_fctr_unit_p_META = createInnerRowMeta($cont_fctr_unit_p, mcframe.clientMAUB.MAUBP5270.ContFctrUnitR.class);
	public static final MCMeta std_cont_fctr_p_META = createInnerRowMeta($std_cont_fctr_p, mcframe.clientMAUB.MAUBP5280.StdContFctrR.class);
	public static final MCMeta dlv_inst_dt_META = createCommonMeta($dlv_inst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dlv_inst_qty_p_META = createInnerRowMeta($dlv_inst_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta dlv_inst_prms_rcpt_dt_META = createCommonMeta($dlv_inst_prms_rcpt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dlv_inst_prms_refl_dt_META = createCommonMeta($dlv_inst_prms_refl_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta prms_rcpt_dt_META = createCommonMeta($prms_rcpt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta prms_refl_dt_META = createCommonMeta($prms_refl_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta prms_dlv_dt_META = createCommonMeta($prms_dlv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta prms_rcpt_qty_p_META = createInnerRowMeta($prms_rcpt_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta prms_refl_qty_p_META = createInnerRowMeta($prms_refl_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta dlv_inst_prms_rcpt_qty_p_META = createInnerRowMeta($dlv_inst_prms_rcpt_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta dlv_inst_prms_refl_qty_p_META = createInnerRowMeta($dlv_inst_prms_refl_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta rcpt_iv_qty_p_META = createInnerRowMeta($rcpt_iv_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta slo_d_no_META = createCommonMeta($slo_d_no, mcframe.commonMA.meta.MA_META.SLO_D_NO);
	public static final MCMeta po_print_d_rmrks_META = createCommonMeta($po_print_d_rmrks, mcframe.commonMS.meta.MS_META.PO_PRINT_D_RMRKS);
	public static final MCMeta ext_po_d_no_META = createCommonMeta($ext_po_d_no, mcframe.commonMA.meta.MA_META.EXT_PO_D_NO);
	public static final MCMeta crnt_edi_dlv_inst_flg_META = createCommonMeta($crnt_edi_dlv_inst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta edi_dlv_inst_flg_META = createCommonMeta($edi_dlv_inst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta edi_tgt_flg_META = createCommonMeta($edi_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_inst_ext_sys_typ_META = createCommonMeta($dlv_inst_ext_sys_typ, mcframe.commonMA.meta.MA_META.EXT_SYS_TYP);
	public static final MCMeta arr_pr_upd_cntr_META = createCommonMeta($arr_pr_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta slo_dt_META = createCommonMeta($slo_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta assort_typ_META = createCommonMeta($assort_typ, mcframe.commonMS.meta.MS_META.SHIP_ASSORT_TYP);
	public static final MCMeta set_itm_grp_no_META = createCommonMeta($set_itm_grp_no, mcframe.commonMA.meta.MA_META.SET_ITM_GRP_NO);

	protected static final ConstMetaList<PodR> constMetas = new ConstMetaList<PodR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			po_d_no_META,
			arr_pr_no_META,
			itm_p_META,
			iv_itm_nm_META,
			sundry_itm_flg_META,
			dscnt_itm_flg_META,
			in_to_loc_cd_META,
			in_to_loc_nm_META,
			in_to_str_ln_tgt_flg_META,
			in_to_loc_addr_p_META,
			in_to_loc_wg_cd_META,
			site_cd_META,
			in_to_loc_lg_grp_cd_META,
			in_to_loc_cal_cd_META,
			str_ln_cd_META,
			str_ln_nm_META,
			str_ln_cd_none_flg_META,
			outsrc_sppl_cd_META,
			drct_dlv_typ_META,
			drct_dlv_typ_nm_META,
			dlv_addr_p_META,
			dlv_cal_cd_META,
			tdlv_addr_p_META,
			purc_id_typ_META,
			purc_id_typ_nm_META,
			abort_flg_META,
			purc_sts_typ_META,
			purc_sts_typ_nm_META,
			ver_no_p_META,
			dlv_rqst_dt_META,
			dlv_rqst_hm_META,
			rqst_dlv_rqst_dt_META,
			rqst_dlv_rqst_hm_META,
			purc_schd_dt_META,
			sync_flg_META,
			purc_basis_typ_META,
			purc_basis_typ_nm_META,
			sppl_itm_cd_META,
			sppl_itm_nm_META,
			cst_itm_cd_META,
			cst_itm_nm_META,
			maker_cd_META,
			maker_nm_META,
			mfg_loc_cd_META,
			mfg_loc_nm_META,
			bom_ptn_META,
			outsrc_flg_META,
			sno_p_META,
			qty_p_META,
			trd_unit_cd_META,
			trd_unit_nm_META,
			trd_unit_dec_place_META,
			trd_unit_conv_base_qty_META,
			trd_unit_conv_qty_META,
			base_unit_qty_p_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_dec_place_META,
			base_unit_rnd_typ_META,
			cont_fctr_flg_META,
			cont_fctr_dec_place_META,
			cont_fctr_rnd_typ_META,
			cont_qty_p_META,
			cont_fctr_unit_p_META,
			std_cont_fctr_p_META,
			dlv_inst_dt_META,
			dlv_inst_qty_p_META,
			dlv_inst_prms_rcpt_dt_META,
			dlv_inst_prms_refl_dt_META,
			prms_rcpt_dt_META,
			prms_refl_dt_META,
			prms_dlv_dt_META,
			prms_rcpt_qty_p_META,
			prms_refl_qty_p_META,
			dlv_inst_prms_rcpt_qty_p_META,
			dlv_inst_prms_refl_qty_p_META,
			rcpt_iv_qty_p_META,
			slo_no_META,
			slo_d_no_META,
			po_print_d_rmrks_META,
			ext_po_d_no_META,
			crnt_edi_dlv_inst_flg_META,
			edi_dlv_inst_flg_META,
			edi_tgt_flg_META,
			dlv_inst_ext_sys_typ_META,
			arr_pr_upd_cntr_META,
			slo_dt_META,
			cst_cd_META,
			assort_typ_META,
			set_itm_grp_no_META
		},
		new String[][]{
			{
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"cntry_cd",
				"cntry_nm",
				"in_to_loc_zip_cd",
				"in_to_loc_addr1",
				"in_to_loc_addr2",
				"in_to_loc_addr3",
				"in_to_loc_addr4",
				"in_to_loc_tel",
				"in_to_loc_fax",
				"cntct_dpt",
				"cntct_psn",
				"dlv_cd",
				"dlv_nm",
				"dlv_sundry_flg",
				"lg_grp_cd",
				"lg_grp_nm",
				"dlv_cntry_cd",
				"dlv_cntry_nm",
				"dlv_zip_cd",
				"dlv_addr1",
				"dlv_addr2",
				"dlv_addr3",
				"dlv_addr4",
				"dlv_tel",
				"dlv_fax",
				"dlv_cntct_dpt",
				"dlv_cntct_psn",
				"pri_prnt_flg",
				"tdlv_cd",
				"tdlv_nm",
				"tdlv_sundry_flg",
				"tdlv_cntry_cd",
				"tdlv_cntry_nm",
				"tdlv_zip_cd",
				"tdlv_addr1",
				"tdlv_addr2",
				"tdlv_addr3",
				"tdlv_addr4",
				"tdlv_tel",
				"tdlv_fax",
				"tdlv_cntct_dpt",
				"tdlv_cntct_psn",
				"ver_no",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"wrk_no",
				"wrk_nm",
				"trd_unit_qty",
				"base_unit_qty",
				"cont_qty",
				"cont_fctr_unit_cd",
				"cont_fctr_unit_nm",
				"std_cont_fctr",
				"dlv_inst_qty",
				"prms_rcpt_qty",
				"prms_refl_qty",
				"dlv_inst_prms_rcpt_qty",
				"dlv_inst_prms_refl_qty",
				"rcpt_iv_qty"
			},
			{
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$cntry_cd,
				$cntry_nm,
				$in_to_loc_zip_cd,
				$in_to_loc_addr1,
				$in_to_loc_addr2,
				$in_to_loc_addr3,
				$in_to_loc_addr4,
				$in_to_loc_tel,
				$in_to_loc_fax,
				$cntct_dpt,
				$cntct_psn,
				$dlv_cd,
				$dlv_nm,
				$dlv_sundry_flg,
				$lg_grp_cd,
				$lg_grp_nm,
				$dlv_cntry_cd,
				$dlv_cntry_nm,
				$dlv_zip_cd,
				$dlv_addr1,
				$dlv_addr2,
				$dlv_addr3,
				$dlv_addr4,
				$dlv_tel,
				$dlv_fax,
				$dlv_cntct_dpt,
				$dlv_cntct_psn,
				$pri_prnt_flg,
				$tdlv_cd,
				$tdlv_nm,
				$tdlv_sundry_flg,
				$tdlv_cntry_cd,
				$tdlv_cntry_nm,
				$tdlv_zip_cd,
				$tdlv_addr1,
				$tdlv_addr2,
				$tdlv_addr3,
				$tdlv_addr4,
				$tdlv_tel,
				$tdlv_fax,
				$tdlv_cntct_dpt,
				$tdlv_cntct_psn,
				$ver_no,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$wrk_no,
				$wrk_nm,
				$trd_unit_qty,
				$base_unit_qty,
				$cont_qty,
				$cont_fctr_unit_cd,
				$cont_fctr_unit_nm,
				$std_cont_fctr,
				$dlv_inst_qty,
				$prms_rcpt_qty,
				$prms_refl_qty,
				$dlv_inst_prms_rcpt_qty,
				$dlv_inst_prms_refl_qty,
				$rcpt_iv_qty
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
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$in_to_str_ln_tgt_flg, "STR_LN"},	// in_to_str_ln_tgt_flg
				{$in_to_loc_wg_cd, "WG"},	// in_to_loc_wg_cd
				{$site_cd, "SITE"},	// site_cd
				{$in_to_loc_lg_grp_cd, "LG_GRP"},	// in_to_loc_lg_grp_cd
				{$str_ln_cd, "STR_LN"},	// str_ln_cd
				{$str_ln_nm, "STR_LN"},	// str_ln_nm
				{$str_ln_cd_none_flg, "STR_LN"},	// str_ln_cd_none_flg
				{$dlv_rqst_hm, "TM"},	// dlv_rqst_hm
				{$rqst_dlv_rqst_hm, "TM"},	// rqst_dlv_rqst_hm
				{$maker_cd, "MAKER"},	// maker_cd
				{$maker_nm, "MAKER"},	// maker_nm
				{$base_unit_qty_p + ".qty", "BASE_UNIT"},	// base_unit_qty_p.qty
				{$base_unit_cd, "BASE_UNIT"},	// base_unit_cd
				{$base_unit_nm, "BASE_UNIT"},	// base_unit_nm
				{$base_unit_dec_place, "BASE_UNIT"},	// base_unit_dec_place
				{$base_unit_rnd_typ, "BASE_UNIT"}	// base_unit_rnd_typ
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
	protected PodR_MC_A(ConstMetaList<? extends PodR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PodR clone() {
		return (PodR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PodR createInstance() {
		return (PodR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PodR getValues(String... names) {
		return (PodR) super.getValues(names);
	}



	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public String po_d_no() {
		return getConstString(offset + 0, $po_d_no);
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public void po_d_no(String value) {
		setConstString(offset + 0, $po_d_no, value);
	}


	/**
	 * Receipt progress No. 入荷進捗ＮＯ.<p>
	 *
	 */
	public String arr_pr_no() {
		return getConstString(offset + 1, $arr_pr_no);
	}

	/**
	 * Receipt progress No. 入荷進捗ＮＯ.<p>
	 *
	 */
	public void arr_pr_no(String value) {
		setConstString(offset + 1, $arr_pr_no, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 2, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 2, $itm_p, row);
	}


	/**
	 * Item name for I/V Ｉ／Ｖ表記品名.<p>
	 *
	 */
	public String iv_itm_nm() {
		return getConstString(offset + 3, $iv_itm_nm);
	}

	/**
	 * Item name for I/V Ｉ／Ｖ表記品名.<p>
	 *
	 */
	public void iv_itm_nm(String value) {
		setConstString(offset + 3, $iv_itm_nm, value);
	}


	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return getConstBoolean(offset + 4, $sundry_itm_flg);
	}

	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		setConstBoolean(offset + 4, $sundry_itm_flg, value);
	}


	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public boolean dscnt_itm_flg() {
		return getConstBoolean(offset + 5, $dscnt_itm_flg);
	}

	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public void dscnt_itm_flg(boolean value) {
		setConstBoolean(offset + 5, $dscnt_itm_flg, value);
	}


	/**
	 * Delivery location cd. 納入場所ＣＤ.<p>
	 *
	 */
	public String in_to_loc_cd() {
		return getConstString(offset + 6, $in_to_loc_cd);
	}

	/**
	 * Delivery location cd. 納入場所ＣＤ.<p>
	 *
	 */
	public void in_to_loc_cd(String value) {
		setConstString(offset + 6, $in_to_loc_cd, value);
	}


	/**
	 * Delivery location name 納入場所名.<p>
	 *
	 */
	public String in_to_loc_nm() {
		return getConstString(offset + 7, $in_to_loc_nm);
	}

	/**
	 * Delivery location name 納入場所名.<p>
	 *
	 */
	public void in_to_loc_nm(String value) {
		setConstString(offset + 7, $in_to_loc_nm, value);
	}


	/**
	 * For rack/line 棚・ライン対象.<p>
	 *
	 */
	public boolean in_to_str_ln_tgt_flg() {
		return getConstBoolean(offset + 8, $in_to_str_ln_tgt_flg);
	}

	/**
	 * For rack/line 棚・ライン対象.<p>
	 *
	 */
	public void in_to_str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 8, $in_to_str_ln_tgt_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5360.AddrR in_to_loc_addr_p(){
		return (mcframe.clientMAUB.MAUBP5360.AddrR) getConstInnerRow(offset + 9, $in_to_loc_addr_p);
	}
	
	public void in_to_loc_addr_p(mcframe.clientMAUB.MAUBP5360.AddrR row){
		setConstInnerRow(offset + 9, $in_to_loc_addr_p, row);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String in_to_loc_wg_cd() {
		return getConstString(offset + 10, $in_to_loc_wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void in_to_loc_wg_cd(String value) {
		setConstString(offset + 10, $in_to_loc_wg_cd, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 11, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 11, $site_cd, value);
	}


	/**
	 * Delivery location distribution group cd. 納入場所物流グループＣＤ.<p>
	 *
	 */
	public String in_to_loc_lg_grp_cd() {
		return getConstString(offset + 12, $in_to_loc_lg_grp_cd);
	}

	/**
	 * Delivery location distribution group cd. 納入場所物流グループＣＤ.<p>
	 *
	 */
	public void in_to_loc_lg_grp_cd(String value) {
		setConstString(offset + 12, $in_to_loc_lg_grp_cd, value);
	}


	/**
	 * Delivery location calendar cd. 納入場所カレンダＣＤ.<p>
	 *
	 */
	public String in_to_loc_cal_cd() {
		return getConstString(offset + 13, $in_to_loc_cal_cd);
	}

	/**
	 * Delivery location calendar cd. 納入場所カレンダＣＤ.<p>
	 *
	 */
	public void in_to_loc_cal_cd(String value) {
		setConstString(offset + 13, $in_to_loc_cal_cd, value);
	}


	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return getConstString(offset + 14, $str_ln_cd);
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		setConstString(offset + 14, $str_ln_cd, value);
	}


	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public String str_ln_nm() {
		return getConstString(offset + 15, $str_ln_nm);
	}

	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public void str_ln_nm(String value) {
		setConstString(offset + 15, $str_ln_nm, value);
	}


	/**
	 * Without rack/line 棚・ライン無.<p>
	 *
	 */
	public boolean str_ln_cd_none_flg() {
		return getConstBoolean(offset + 16, $str_ln_cd_none_flg);
	}

	/**
	 * Without rack/line 棚・ライン無.<p>
	 *
	 */
	public void str_ln_cd_none_flg(boolean value) {
		setConstBoolean(offset + 16, $str_ln_cd_none_flg, value);
	}


	/**
	 * Subcontractor 外注発注先.<p>
	 *
	 */
	public String outsrc_sppl_cd() {
		return getConstString(offset + 17, $outsrc_sppl_cd);
	}

	/**
	 * Subcontractor 外注発注先.<p>
	 *
	 */
	public void outsrc_sppl_cd(String value) {
		setConstString(offset + 17, $outsrc_sppl_cd, value);
	}


	/**
	 * Direct-delivery type 直納区分.<p>
	 *
	 */
	public String drct_dlv_typ() {
		return getConstString(offset + 18, $drct_dlv_typ);
	}

	/**
	 * Direct-delivery type 直納区分.<p>
	 *
	 */
	public void drct_dlv_typ(String value) {
		setConstString(offset + 18, $drct_dlv_typ, value);
	}


	/**
	 * Direct-delivery type name 直納区分名.<p>
	 *
	 */
	public String drct_dlv_typ_nm() {
		return getConstString(offset + 19, $drct_dlv_typ_nm);
	}

	/**
	 * Direct-delivery type name 直納区分名.<p>
	 *
	 */
	public void drct_dlv_typ_nm(String value) {
		setConstString(offset + 19, $drct_dlv_typ_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5150.DlvR dlv_addr_p(){
		return (mcframe.clientMAUB.MAUBP5150.DlvR) getConstInnerRow(offset + 20, $dlv_addr_p);
	}
	
	public void dlv_addr_p(mcframe.clientMAUB.MAUBP5150.DlvR row){
		setConstInnerRow(offset + 20, $dlv_addr_p, row);
	}


	/**
	 * Delivery destination calendar 納品先カレンダ.<p>
	 *
	 */
	public String dlv_cal_cd() {
		return getConstString(offset + 21, $dlv_cal_cd);
	}

	/**
	 * Delivery destination calendar 納品先カレンダ.<p>
	 *
	 */
	public void dlv_cal_cd(String value) {
		setConstString(offset + 21, $dlv_cal_cd, value);
	}


	public mcframe.clientMAUB.MAUBP5150.DlvR tdlv_addr_p(){
		return (mcframe.clientMAUB.MAUBP5150.DlvR) getConstInnerRow(offset + 22, $tdlv_addr_p);
	}
	
	public void tdlv_addr_p(mcframe.clientMAUB.MAUBP5150.DlvR row){
		setConstInnerRow(offset + 22, $tdlv_addr_p, row);
	}


	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public String purc_id_typ() {
		return getConstString(offset + 23, $purc_id_typ);
	}

	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public void purc_id_typ(String value) {
		setConstString(offset + 23, $purc_id_typ, value);
	}


	/**
	 * Purchase identification type name 購買識別区分名.<p>
	 *
	 */
	public String purc_id_typ_nm() {
		return getConstString(offset + 24, $purc_id_typ_nm);
	}

	/**
	 * Purchase identification type name 購買識別区分名.<p>
	 *
	 */
	public void purc_id_typ_nm(String value) {
		setConstString(offset + 24, $purc_id_typ_nm, value);
	}


	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public boolean abort_flg() {
		return getConstBoolean(offset + 25, $abort_flg);
	}

	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		setConstBoolean(offset + 25, $abort_flg, value);
	}


	/**
	 * Purchase status type 購買状況区分.<p>
	 *
	 */
	public String purc_sts_typ() {
		return getConstString(offset + 26, $purc_sts_typ);
	}

	/**
	 * Purchase status type 購買状況区分.<p>
	 *
	 */
	public void purc_sts_typ(String value) {
		setConstString(offset + 26, $purc_sts_typ, value);
	}


	/**
	 * Purchase status type name 購買状況区分名.<p>
	 *
	 */
	public String purc_sts_typ_nm() {
		return getConstString(offset + 27, $purc_sts_typ_nm);
	}

	/**
	 * Purchase status type name 購買状況区分名.<p>
	 *
	 */
	public void purc_sts_typ_nm(String value) {
		setConstString(offset + 27, $purc_sts_typ_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5250.VerNoR ver_no_p(){
		return (mcframe.clientMAUB.MAUBP5250.VerNoR) getConstInnerRow(offset + 28, $ver_no_p);
	}
	
	public void ver_no_p(mcframe.clientMAUB.MAUBP5250.VerNoR row){
		setConstInnerRow(offset + 28, $ver_no_p, row);
	}


	/**
	 * Desired delivery date 納入希望日.<p>
	 *
	 */
	public MCDate dlv_rqst_dt() {
		return getConstDate(offset + 29, $dlv_rqst_dt);
	}

	/**
	 * Desired delivery date 納入希望日.<p>
	 *
	 */
	public void dlv_rqst_dt(MCDate value) {
		setConstDate(offset + 29, $dlv_rqst_dt, value);
	}


	/**
	 * Desired delivery time 納入希望時刻.<p>
	 *
	 */
	public MCDate dlv_rqst_hm() {
		return getConstDate(offset + 30, $dlv_rqst_hm);
	}

	/**
	 * Desired delivery time 納入希望時刻.<p>
	 *
	 */
	public void dlv_rqst_hm(MCDate value) {
		setConstDate(offset + 30, $dlv_rqst_hm, value);
	}


	/**
	 * Request source desired delivery date 依頼元納入希望日.<p>
	 *
	 */
	public MCDate rqst_dlv_rqst_dt() {
		return getConstDate(offset + 31, $rqst_dlv_rqst_dt);
	}

	/**
	 * Request source desired delivery date 依頼元納入希望日.<p>
	 *
	 */
	public void rqst_dlv_rqst_dt(MCDate value) {
		setConstDate(offset + 31, $rqst_dlv_rqst_dt, value);
	}


	/**
	 * Request source desired delivery time 依頼元納入希望時刻.<p>
	 *
	 */
	public MCDate rqst_dlv_rqst_hm() {
		return getConstDate(offset + 32, $rqst_dlv_rqst_hm);
	}

	/**
	 * Request source desired delivery time 依頼元納入希望時刻.<p>
	 *
	 */
	public void rqst_dlv_rqst_hm(MCDate value) {
		setConstDate(offset + 32, $rqst_dlv_rqst_hm, value);
	}


	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public MCDate purc_schd_dt() {
		return getConstDate(offset + 33, $purc_schd_dt);
	}

	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public void purc_schd_dt(MCDate value) {
		setConstDate(offset + 33, $purc_schd_dt, value);
	}


	/**
	 * Simultaneous recording 同時計上.<p>
	 *
	 */
	public boolean sync_flg() {
		return getConstBoolean(offset + 34, $sync_flg);
	}

	/**
	 * Simultaneous recording 同時計上.<p>
	 *
	 */
	public void sync_flg(boolean value) {
		setConstBoolean(offset + 34, $sync_flg, value);
	}


	/**
	 * Purchase recording type 仕入計上区分.<p>
	 *
	 */
	public String purc_basis_typ() {
		return getConstString(offset + 35, $purc_basis_typ);
	}

	/**
	 * Purchase recording type 仕入計上区分.<p>
	 *
	 */
	public void purc_basis_typ(String value) {
		setConstString(offset + 35, $purc_basis_typ, value);
	}


	/**
	 * Purchase recording type name 仕入計上区分名.<p>
	 *
	 */
	public String purc_basis_typ_nm() {
		return getConstString(offset + 36, $purc_basis_typ_nm);
	}

	/**
	 * Purchase recording type name 仕入計上区分名.<p>
	 *
	 */
	public void purc_basis_typ_nm(String value) {
		setConstString(offset + 36, $purc_basis_typ_nm, value);
	}


	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public String sppl_itm_cd() {
		return getConstString(offset + 37, $sppl_itm_cd);
	}

	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public void sppl_itm_cd(String value) {
		setConstString(offset + 37, $sppl_itm_cd, value);
	}


	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public String sppl_itm_nm() {
		return getConstString(offset + 38, $sppl_itm_nm);
	}

	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public void sppl_itm_nm(String value) {
		setConstString(offset + 38, $sppl_itm_nm, value);
	}


	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public String cst_itm_cd() {
		return getConstString(offset + 39, $cst_itm_cd);
	}

	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public void cst_itm_cd(String value) {
		setConstString(offset + 39, $cst_itm_cd, value);
	}


	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public String cst_itm_nm() {
		return getConstString(offset + 40, $cst_itm_nm);
	}

	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public void cst_itm_nm(String value) {
		setConstString(offset + 40, $cst_itm_nm, value);
	}


	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 41, $maker_cd);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 41, $maker_cd, value);
	}


	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public String maker_nm() {
		return getConstString(offset + 42, $maker_nm);
	}

	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public void maker_nm(String value) {
		setConstString(offset + 42, $maker_nm, value);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 43, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 43, $mfg_loc_cd, value);
	}


	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public String mfg_loc_nm() {
		return getConstString(offset + 44, $mfg_loc_nm);
	}

	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public void mfg_loc_nm(String value) {
		setConstString(offset + 44, $mfg_loc_nm, value);
	}


	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return getConstString(offset + 45, $bom_ptn);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		setConstString(offset + 45, $bom_ptn, value);
	}


	/**
	 * Subcontracting 外注.<p>
	 *
	 */
	public boolean outsrc_flg() {
		return getConstBoolean(offset + 46, $outsrc_flg);
	}

	/**
	 * Subcontracting 外注.<p>
	 *
	 */
	public void outsrc_flg(boolean value) {
		setConstBoolean(offset + 46, $outsrc_flg, value);
	}


	public mcframe.clientMSUB.MSUBP5020.SnoWrkNoR sno_p(){
		return (mcframe.clientMSUB.MSUBP5020.SnoWrkNoR) getConstInnerRow(offset + 47, $sno_p);
	}
	
	public void sno_p(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR row){
		setConstInnerRow(offset + 47, $sno_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 48, $qty_p);
	}
	
	public void qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 48, $qty_p, row);
	}


	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 49, $trd_unit_cd);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 49, $trd_unit_cd, value);
	}


	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public String trd_unit_nm() {
		return getConstString(offset + 50, $trd_unit_nm);
	}

	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public void trd_unit_nm(String value) {
		setConstString(offset + 50, $trd_unit_nm, value);
	}


	/**
	 * Transaction unit number of decimal places 小数部有効桁数（取引単位）.<p>
	 *
	 */
	public MCNumber trd_unit_dec_place() {
		return getConstNumber(offset + 51, $trd_unit_dec_place);
	}

	/**
	 * Transaction unit number of decimal places 小数部有効桁数（取引単位）.<p>
	 *
	 */
	public void trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 51, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 小数部有効桁数（取引単位）.<p>
	 *
	 */
	public void trd_unit_dec_place(int value) {
		setConstNumber(offset + 51, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 小数部有効桁数（取引単位）.<p>
	 *
	 */
	public void trd_unit_dec_place(long value) {
		setConstNumber(offset + 51, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 小数部有効桁数（取引単位）.<p>
	 *
	 */
	public void trd_unit_dec_place(float value) {
		setConstNumber(offset + 51, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 小数部有効桁数（取引単位）.<p>
	 *
	 */
	public void trd_unit_dec_place(double value) {
		setConstNumber(offset + 51, $trd_unit_dec_place, value);
	}


	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_base_qty() {
		return getConstNumber(offset + 52, $trd_unit_conv_base_qty);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 52, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(int value) {
		setConstNumber(offset + 52, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(long value) {
		setConstNumber(offset + 52, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(float value) {
		setConstNumber(offset + 52, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(double value) {
		setConstNumber(offset + 52, $trd_unit_conv_base_qty, value);
	}


	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_qty() {
		return getConstNumber(offset + 53, $trd_unit_conv_qty);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 53, $trd_unit_conv_qty, value);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(int value) {
		setConstNumber(offset + 53, $trd_unit_conv_qty, value);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(long value) {
		setConstNumber(offset + 53, $trd_unit_conv_qty, value);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(float value) {
		setConstNumber(offset + 53, $trd_unit_conv_qty, value);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(double value) {
		setConstNumber(offset + 53, $trd_unit_conv_qty, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 54, $base_unit_qty_p);
	}
	
	public void base_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 54, $base_unit_qty_p, row);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 55, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 55, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 56, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 56, $base_unit_nm, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 57, $base_unit_dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 57, $base_unit_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 57, $base_unit_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 57, $base_unit_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 57, $base_unit_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 57, $base_unit_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public String base_unit_rnd_typ() {
		return getConstString(offset + 58, $base_unit_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public void base_unit_rnd_typ(String value) {
		setConstString(offset + 58, $base_unit_rnd_typ, value);
	}


	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public boolean cont_fctr_flg() {
		return getConstBoolean(offset + 59, $cont_fctr_flg);
	}

	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public void cont_fctr_flg(boolean value) {
		setConstBoolean(offset + 59, $cont_fctr_flg, value);
	}


	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public MCNumber cont_fctr_dec_place() {
		return getConstNumber(offset + 60, $cont_fctr_dec_place);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(MCNumber value) {
		setConstNumber(offset + 60, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(int value) {
		setConstNumber(offset + 60, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(long value) {
		setConstNumber(offset + 60, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(float value) {
		setConstNumber(offset + 60, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(double value) {
		setConstNumber(offset + 60, $cont_fctr_dec_place, value);
	}


	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public String cont_fctr_rnd_typ() {
		return getConstString(offset + 61, $cont_fctr_rnd_typ);
	}

	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public void cont_fctr_rnd_typ(String value) {
		setConstString(offset + 61, $cont_fctr_rnd_typ, value);
	}


	public mcframe.clientMAUB.MAUBP5260.ContQtyR cont_qty_p(){
		return (mcframe.clientMAUB.MAUBP5260.ContQtyR) getConstInnerRow(offset + 62, $cont_qty_p);
	}
	
	public void cont_qty_p(mcframe.clientMAUB.MAUBP5260.ContQtyR row){
		setConstInnerRow(offset + 62, $cont_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5270.ContFctrUnitR cont_fctr_unit_p(){
		return (mcframe.clientMAUB.MAUBP5270.ContFctrUnitR) getConstInnerRow(offset + 63, $cont_fctr_unit_p);
	}
	
	public void cont_fctr_unit_p(mcframe.clientMAUB.MAUBP5270.ContFctrUnitR row){
		setConstInnerRow(offset + 63, $cont_fctr_unit_p, row);
	}


	public mcframe.clientMAUB.MAUBP5280.StdContFctrR std_cont_fctr_p(){
		return (mcframe.clientMAUB.MAUBP5280.StdContFctrR) getConstInnerRow(offset + 64, $std_cont_fctr_p);
	}
	
	public void std_cont_fctr_p(mcframe.clientMAUB.MAUBP5280.StdContFctrR row){
		setConstInnerRow(offset + 64, $std_cont_fctr_p, row);
	}


	/**
	 * Delivery order date 納入指示日.<p>
	 *
	 */
	public MCDate dlv_inst_dt() {
		return getConstDate(offset + 65, $dlv_inst_dt);
	}

	/**
	 * Delivery order date 納入指示日.<p>
	 *
	 */
	public void dlv_inst_dt(MCDate value) {
		setConstDate(offset + 65, $dlv_inst_dt, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR dlv_inst_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 66, $dlv_inst_qty_p);
	}
	
	public void dlv_inst_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 66, $dlv_inst_qty_p, row);
	}


	/**
	 * Delivery order replied received date 納入指示回答受領日.<p>
	 *
	 */
	public MCDate dlv_inst_prms_rcpt_dt() {
		return getConstDate(offset + 67, $dlv_inst_prms_rcpt_dt);
	}

	/**
	 * Delivery order replied received date 納入指示回答受領日.<p>
	 *
	 */
	public void dlv_inst_prms_rcpt_dt(MCDate value) {
		setConstDate(offset + 67, $dlv_inst_prms_rcpt_dt, value);
	}


	/**
	 * Delivery order reply applied date 納入指示回答反映日.<p>
	 *
	 */
	public MCDate dlv_inst_prms_refl_dt() {
		return getConstDate(offset + 68, $dlv_inst_prms_refl_dt);
	}

	/**
	 * Delivery order reply applied date 納入指示回答反映日.<p>
	 *
	 */
	public void dlv_inst_prms_refl_dt(MCDate value) {
		setConstDate(offset + 68, $dlv_inst_prms_refl_dt, value);
	}


	/**
	 * Order promising result received date 納期回答受領日.<p>
	 *
	 */
	public MCDate prms_rcpt_dt() {
		return getConstDate(offset + 69, $prms_rcpt_dt);
	}

	/**
	 * Order promising result received date 納期回答受領日.<p>
	 *
	 */
	public void prms_rcpt_dt(MCDate value) {
		setConstDate(offset + 69, $prms_rcpt_dt, value);
	}


	/**
	 * Order promising applied date 納期回答反映日.<p>
	 *
	 */
	public MCDate prms_refl_dt() {
		return getConstDate(offset + 70, $prms_refl_dt);
	}

	/**
	 * Order promising applied date 納期回答反映日.<p>
	 *
	 */
	public void prms_refl_dt(MCDate value) {
		setConstDate(offset + 70, $prms_refl_dt, value);
	}


	/**
	 * Replied delivery date 回答納入日.<p>
	 *
	 */
	public MCDate prms_dlv_dt() {
		return getConstDate(offset + 71, $prms_dlv_dt);
	}

	/**
	 * Replied delivery date 回答納入日.<p>
	 *
	 */
	public void prms_dlv_dt(MCDate value) {
		setConstDate(offset + 71, $prms_dlv_dt, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR prms_rcpt_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 72, $prms_rcpt_qty_p);
	}
	
	public void prms_rcpt_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 72, $prms_rcpt_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR prms_refl_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 73, $prms_refl_qty_p);
	}
	
	public void prms_refl_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 73, $prms_refl_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR dlv_inst_prms_rcpt_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 74, $dlv_inst_prms_rcpt_qty_p);
	}
	
	public void dlv_inst_prms_rcpt_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 74, $dlv_inst_prms_rcpt_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR dlv_inst_prms_refl_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 75, $dlv_inst_prms_refl_qty_p);
	}
	
	public void dlv_inst_prms_refl_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 75, $dlv_inst_prms_refl_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR rcpt_iv_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 76, $rcpt_iv_qty_p);
	}
	
	public void rcpt_iv_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 76, $rcpt_iv_qty_p, row);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 77, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 77, $slo_no, value);
	}


	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public String slo_d_no() {
		return getConstString(offset + 78, $slo_d_no);
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public void slo_d_no(String value) {
		setConstString(offset + 78, $slo_d_no, value);
	}


	/**
	 * Details PO sheet remarks 明細注文書備考.<p>
	 *
	 */
	public String po_print_d_rmrks() {
		return getConstString(offset + 79, $po_print_d_rmrks);
	}

	/**
	 * Details PO sheet remarks 明細注文書備考.<p>
	 *
	 */
	public void po_print_d_rmrks(String value) {
		setConstString(offset + 79, $po_print_d_rmrks, value);
	}


	/**
	 * External PO details No. 外部発注明細ＮＯ.<p>
	 *
	 */
	public String ext_po_d_no() {
		return getConstString(offset + 80, $ext_po_d_no);
	}

	/**
	 * External PO details No. 外部発注明細ＮＯ.<p>
	 *
	 */
	public void ext_po_d_no(String value) {
		setConstString(offset + 80, $ext_po_d_no, value);
	}


	/**
	 * Current EDI delivery order 今回ＥＤＩ納入指示.<p>
	 *
	 */
	public boolean crnt_edi_dlv_inst_flg() {
		return getConstBoolean(offset + 81, $crnt_edi_dlv_inst_flg);
	}

	/**
	 * Current EDI delivery order 今回ＥＤＩ納入指示.<p>
	 *
	 */
	public void crnt_edi_dlv_inst_flg(boolean value) {
		setConstBoolean(offset + 81, $crnt_edi_dlv_inst_flg, value);
	}


	/**
	 * Last EDI delivery order 前回ＥＤＩ納入指示.<p>
	 *
	 */
	public boolean edi_dlv_inst_flg() {
		return getConstBoolean(offset + 82, $edi_dlv_inst_flg);
	}

	/**
	 * Last EDI delivery order 前回ＥＤＩ納入指示.<p>
	 *
	 */
	public void edi_dlv_inst_flg(boolean value) {
		setConstBoolean(offset + 82, $edi_dlv_inst_flg, value);
	}


	/**
	 * For EDI ＥＤＩ対象.<p>
	 *
	 */
	public boolean edi_tgt_flg() {
		return getConstBoolean(offset + 83, $edi_tgt_flg);
	}

	/**
	 * For EDI ＥＤＩ対象.<p>
	 *
	 */
	public void edi_tgt_flg(boolean value) {
		setConstBoolean(offset + 83, $edi_tgt_flg, value);
	}


	/**
	 * Delivery order external system type 納入指示外部システム区分.<p>
	 *
	 */
	public String dlv_inst_ext_sys_typ() {
		return getConstString(offset + 84, $dlv_inst_ext_sys_typ);
	}

	/**
	 * Delivery order external system type 納入指示外部システム区分.<p>
	 *
	 */
	public void dlv_inst_ext_sys_typ(String value) {
		setConstString(offset + 84, $dlv_inst_ext_sys_typ, value);
	}


	/**
	 * Receipt progress update counter 入荷進捗更新カウンタ.<p>
	 *
	 */
	public MCNumber arr_pr_upd_cntr() {
		return getConstNumber(offset + 85, $arr_pr_upd_cntr);
	}

	/**
	 * Receipt progress update counter 入荷進捗更新カウンタ.<p>
	 *
	 */
	public void arr_pr_upd_cntr(MCNumber value) {
		setConstNumber(offset + 85, $arr_pr_upd_cntr, value);
	}

	/**
	 * Receipt progress update counter 入荷進捗更新カウンタ.<p>
	 *
	 */
	public void arr_pr_upd_cntr(int value) {
		setConstNumber(offset + 85, $arr_pr_upd_cntr, value);
	}

	/**
	 * Receipt progress update counter 入荷進捗更新カウンタ.<p>
	 *
	 */
	public void arr_pr_upd_cntr(long value) {
		setConstNumber(offset + 85, $arr_pr_upd_cntr, value);
	}

	/**
	 * Receipt progress update counter 入荷進捗更新カウンタ.<p>
	 *
	 */
	public void arr_pr_upd_cntr(float value) {
		setConstNumber(offset + 85, $arr_pr_upd_cntr, value);
	}

	/**
	 * Receipt progress update counter 入荷進捗更新カウンタ.<p>
	 *
	 */
	public void arr_pr_upd_cntr(double value) {
		setConstNumber(offset + 85, $arr_pr_upd_cntr, value);
	}


	/**
	 * Sales order date 受注日.<p>
	 *
	 */
	public MCDate slo_dt() {
		return getConstDate(offset + 86, $slo_dt);
	}

	/**
	 * Sales order date 受注日.<p>
	 *
	 */
	public void slo_dt(MCDate value) {
		setConstDate(offset + 86, $slo_dt, value);
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 87, $cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 87, $cst_cd, value);
	}


	/**
	 * Assortment type 品揃区分.<p>
	 *
	 */
	public String assort_typ() {
		return getConstString(offset + 88, $assort_typ);
	}

	/**
	 * Assortment type 品揃区分.<p>
	 *
	 */
	public void assort_typ(String value) {
		setConstString(offset + 88, $assort_typ, value);
	}


	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public MCNumber set_itm_grp_no() {
		return getConstNumber(offset + 89, $set_itm_grp_no);
	}

	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public void set_itm_grp_no(MCNumber value) {
		setConstNumber(offset + 89, $set_itm_grp_no, value);
	}

	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public void set_itm_grp_no(int value) {
		setConstNumber(offset + 89, $set_itm_grp_no, value);
	}

	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public void set_itm_grp_no(long value) {
		setConstNumber(offset + 89, $set_itm_grp_no, value);
	}

	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public void set_itm_grp_no(float value) {
		setConstNumber(offset + 89, $set_itm_grp_no, value);
	}

	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public void set_itm_grp_no(double value) {
		setConstNumber(offset + 89, $set_itm_grp_no, value);
	}


	public String getString(String name) {
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			return arr_pr_no();
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			return iv_itm_nm();
		}
		if ($in_to_loc_cd.equalsIgnoreCase(name)) {
			return in_to_loc_cd();
		}
		if ($in_to_loc_nm.equalsIgnoreCase(name)) {
			return in_to_loc_nm();
		}
		if ($in_to_loc_wg_cd.equalsIgnoreCase(name)) {
			return in_to_loc_wg_cd();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($in_to_loc_lg_grp_cd.equalsIgnoreCase(name)) {
			return in_to_loc_lg_grp_cd();
		}
		if ($in_to_loc_cal_cd.equalsIgnoreCase(name)) {
			return in_to_loc_cal_cd();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			return str_ln_nm();
		}
		if ($outsrc_sppl_cd.equalsIgnoreCase(name)) {
			return outsrc_sppl_cd();
		}
		if ($drct_dlv_typ.equalsIgnoreCase(name)) {
			return drct_dlv_typ();
		}
		if ($drct_dlv_typ_nm.equalsIgnoreCase(name)) {
			return drct_dlv_typ_nm();
		}
		if ($dlv_cal_cd.equalsIgnoreCase(name)) {
			return dlv_cal_cd();
		}
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			return purc_id_typ();
		}
		if ($purc_id_typ_nm.equalsIgnoreCase(name)) {
			return purc_id_typ_nm();
		}
		if ($purc_sts_typ.equalsIgnoreCase(name)) {
			return purc_sts_typ();
		}
		if ($purc_sts_typ_nm.equalsIgnoreCase(name)) {
			return purc_sts_typ_nm();
		}
		if ($purc_basis_typ.equalsIgnoreCase(name)) {
			return purc_basis_typ();
		}
		if ($purc_basis_typ_nm.equalsIgnoreCase(name)) {
			return purc_basis_typ_nm();
		}
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			return sppl_itm_cd();
		}
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			return sppl_itm_nm();
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			return maker_nm();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_rnd_typ();
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			return cont_fctr_rnd_typ();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($po_print_d_rmrks.equalsIgnoreCase(name)) {
			return po_print_d_rmrks();
		}
		if ($ext_po_d_no.equalsIgnoreCase(name)) {
			return ext_po_d_no();
		}
		if ($dlv_inst_ext_sys_typ.equalsIgnoreCase(name)) {
			return dlv_inst_ext_sys_typ();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($assort_typ.equalsIgnoreCase(name)) {
			return assort_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_base_qty();
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			return arr_pr_upd_cntr();
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			return set_itm_grp_no();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($dlv_rqst_dt.equalsIgnoreCase(name)) {
			return dlv_rqst_dt();
		}
		if ($dlv_rqst_hm.equalsIgnoreCase(name)) {
			return dlv_rqst_hm();
		}
		if ($rqst_dlv_rqst_dt.equalsIgnoreCase(name)) {
			return rqst_dlv_rqst_dt();
		}
		if ($rqst_dlv_rqst_hm.equalsIgnoreCase(name)) {
			return rqst_dlv_rqst_hm();
		}
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			return purc_schd_dt();
		}
		if ($dlv_inst_dt.equalsIgnoreCase(name)) {
			return dlv_inst_dt();
		}
		if ($dlv_inst_prms_rcpt_dt.equalsIgnoreCase(name)) {
			return dlv_inst_prms_rcpt_dt();
		}
		if ($dlv_inst_prms_refl_dt.equalsIgnoreCase(name)) {
			return dlv_inst_prms_refl_dt();
		}
		if ($prms_rcpt_dt.equalsIgnoreCase(name)) {
			return prms_rcpt_dt();
		}
		if ($prms_refl_dt.equalsIgnoreCase(name)) {
			return prms_refl_dt();
		}
		if ($prms_dlv_dt.equalsIgnoreCase(name)) {
			return prms_dlv_dt();
		}
		if ($slo_dt.equalsIgnoreCase(name)) {
			return slo_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		if ($in_to_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return in_to_str_ln_tgt_flg();
		}
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return str_ln_cd_none_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($sync_flg.equalsIgnoreCase(name)) {
			return sync_flg();
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			return outsrc_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($crnt_edi_dlv_inst_flg.equalsIgnoreCase(name)) {
			return crnt_edi_dlv_inst_flg();
		}
		if ($edi_dlv_inst_flg.equalsIgnoreCase(name)) {
			return edi_dlv_inst_flg();
		}
		if ($edi_tgt_flg.equalsIgnoreCase(name)) {
			return edi_tgt_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			return arr_pr_no();
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			return iv_itm_nm();
		}
		if ($in_to_loc_cd.equalsIgnoreCase(name)) {
			return in_to_loc_cd();
		}
		if ($in_to_loc_nm.equalsIgnoreCase(name)) {
			return in_to_loc_nm();
		}
		if ($in_to_loc_wg_cd.equalsIgnoreCase(name)) {
			return in_to_loc_wg_cd();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($in_to_loc_lg_grp_cd.equalsIgnoreCase(name)) {
			return in_to_loc_lg_grp_cd();
		}
		if ($in_to_loc_cal_cd.equalsIgnoreCase(name)) {
			return in_to_loc_cal_cd();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			return str_ln_nm();
		}
		if ($outsrc_sppl_cd.equalsIgnoreCase(name)) {
			return outsrc_sppl_cd();
		}
		if ($drct_dlv_typ.equalsIgnoreCase(name)) {
			return drct_dlv_typ();
		}
		if ($drct_dlv_typ_nm.equalsIgnoreCase(name)) {
			return drct_dlv_typ_nm();
		}
		if ($dlv_cal_cd.equalsIgnoreCase(name)) {
			return dlv_cal_cd();
		}
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			return purc_id_typ();
		}
		if ($purc_id_typ_nm.equalsIgnoreCase(name)) {
			return purc_id_typ_nm();
		}
		if ($purc_sts_typ.equalsIgnoreCase(name)) {
			return purc_sts_typ();
		}
		if ($purc_sts_typ_nm.equalsIgnoreCase(name)) {
			return purc_sts_typ_nm();
		}
		if ($purc_basis_typ.equalsIgnoreCase(name)) {
			return purc_basis_typ();
		}
		if ($purc_basis_typ_nm.equalsIgnoreCase(name)) {
			return purc_basis_typ_nm();
		}
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			return sppl_itm_cd();
		}
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			return sppl_itm_nm();
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			return maker_nm();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_rnd_typ();
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			return cont_fctr_rnd_typ();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($po_print_d_rmrks.equalsIgnoreCase(name)) {
			return po_print_d_rmrks();
		}
		if ($ext_po_d_no.equalsIgnoreCase(name)) {
			return ext_po_d_no();
		}
		if ($dlv_inst_ext_sys_typ.equalsIgnoreCase(name)) {
			return dlv_inst_ext_sys_typ();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($assort_typ.equalsIgnoreCase(name)) {
			return assort_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_base_qty();
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			return arr_pr_upd_cntr();
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			return set_itm_grp_no();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($dlv_rqst_dt.equalsIgnoreCase(name)) {
			return dlv_rqst_dt();
		}
		if ($dlv_rqst_hm.equalsIgnoreCase(name)) {
			return dlv_rqst_hm();
		}
		if ($rqst_dlv_rqst_dt.equalsIgnoreCase(name)) {
			return rqst_dlv_rqst_dt();
		}
		if ($rqst_dlv_rqst_hm.equalsIgnoreCase(name)) {
			return rqst_dlv_rqst_hm();
		}
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			return purc_schd_dt();
		}
		if ($dlv_inst_dt.equalsIgnoreCase(name)) {
			return dlv_inst_dt();
		}
		if ($dlv_inst_prms_rcpt_dt.equalsIgnoreCase(name)) {
			return dlv_inst_prms_rcpt_dt();
		}
		if ($dlv_inst_prms_refl_dt.equalsIgnoreCase(name)) {
			return dlv_inst_prms_refl_dt();
		}
		if ($prms_rcpt_dt.equalsIgnoreCase(name)) {
			return prms_rcpt_dt();
		}
		if ($prms_refl_dt.equalsIgnoreCase(name)) {
			return prms_refl_dt();
		}
		if ($prms_dlv_dt.equalsIgnoreCase(name)) {
			return prms_dlv_dt();
		}
		if ($slo_dt.equalsIgnoreCase(name)) {
			return slo_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		if ($in_to_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return in_to_str_ln_tgt_flg();
		}
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return str_ln_cd_none_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($sync_flg.equalsIgnoreCase(name)) {
			return sync_flg();
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			return outsrc_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($crnt_edi_dlv_inst_flg.equalsIgnoreCase(name)) {
			return crnt_edi_dlv_inst_flg();
		}
		if ($edi_dlv_inst_flg.equalsIgnoreCase(name)) {
			return edi_dlv_inst_flg();
		}
		if ($edi_tgt_flg.equalsIgnoreCase(name)) {
			return edi_tgt_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			arr_pr_no(value);
			return;
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			iv_itm_nm(value);
			return;
		}
		if ($in_to_loc_cd.equalsIgnoreCase(name)) {
			in_to_loc_cd(value);
			return;
		}
		if ($in_to_loc_nm.equalsIgnoreCase(name)) {
			in_to_loc_nm(value);
			return;
		}
		if ($in_to_loc_wg_cd.equalsIgnoreCase(name)) {
			in_to_loc_wg_cd(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($in_to_loc_lg_grp_cd.equalsIgnoreCase(name)) {
			in_to_loc_lg_grp_cd(value);
			return;
		}
		if ($in_to_loc_cal_cd.equalsIgnoreCase(name)) {
			in_to_loc_cal_cd(value);
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
		if ($outsrc_sppl_cd.equalsIgnoreCase(name)) {
			outsrc_sppl_cd(value);
			return;
		}
		if ($drct_dlv_typ.equalsIgnoreCase(name)) {
			drct_dlv_typ(value);
			return;
		}
		if ($drct_dlv_typ_nm.equalsIgnoreCase(name)) {
			drct_dlv_typ_nm(value);
			return;
		}
		if ($dlv_cal_cd.equalsIgnoreCase(name)) {
			dlv_cal_cd(value);
			return;
		}
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			purc_id_typ(value);
			return;
		}
		if ($purc_id_typ_nm.equalsIgnoreCase(name)) {
			purc_id_typ_nm(value);
			return;
		}
		if ($purc_sts_typ.equalsIgnoreCase(name)) {
			purc_sts_typ(value);
			return;
		}
		if ($purc_sts_typ_nm.equalsIgnoreCase(name)) {
			purc_sts_typ_nm(value);
			return;
		}
		if ($purc_basis_typ.equalsIgnoreCase(name)) {
			purc_basis_typ(value);
			return;
		}
		if ($purc_basis_typ_nm.equalsIgnoreCase(name)) {
			purc_basis_typ_nm(value);
			return;
		}
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			sppl_itm_cd(value);
			return;
		}
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			sppl_itm_nm(value);
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
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			maker_nm(value);
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
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_rnd_typ(value);
			return;
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			cont_fctr_rnd_typ(value);
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
		if ($po_print_d_rmrks.equalsIgnoreCase(name)) {
			po_print_d_rmrks(value);
			return;
		}
		if ($ext_po_d_no.equalsIgnoreCase(name)) {
			ext_po_d_no(value);
			return;
		}
		if ($dlv_inst_ext_sys_typ.equalsIgnoreCase(name)) {
			dlv_inst_ext_sys_typ(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($assort_typ.equalsIgnoreCase(name)) {
			assort_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($dlv_rqst_dt.equalsIgnoreCase(name)) {
			dlv_rqst_dt(value);
			return;
		}
		if ($dlv_rqst_hm.equalsIgnoreCase(name)) {
			dlv_rqst_hm(value);
			return;
		}
		if ($rqst_dlv_rqst_dt.equalsIgnoreCase(name)) {
			rqst_dlv_rqst_dt(value);
			return;
		}
		if ($rqst_dlv_rqst_hm.equalsIgnoreCase(name)) {
			rqst_dlv_rqst_hm(value);
			return;
		}
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			purc_schd_dt(value);
			return;
		}
		if ($dlv_inst_dt.equalsIgnoreCase(name)) {
			dlv_inst_dt(value);
			return;
		}
		if ($dlv_inst_prms_rcpt_dt.equalsIgnoreCase(name)) {
			dlv_inst_prms_rcpt_dt(value);
			return;
		}
		if ($dlv_inst_prms_refl_dt.equalsIgnoreCase(name)) {
			dlv_inst_prms_refl_dt(value);
			return;
		}
		if ($prms_rcpt_dt.equalsIgnoreCase(name)) {
			prms_rcpt_dt(value);
			return;
		}
		if ($prms_refl_dt.equalsIgnoreCase(name)) {
			prms_refl_dt(value);
			return;
		}
		if ($prms_dlv_dt.equalsIgnoreCase(name)) {
			prms_dlv_dt(value);
			return;
		}
		if ($slo_dt.equalsIgnoreCase(name)) {
			slo_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		if ($in_to_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			in_to_str_ln_tgt_flg(value);
			return;
		}
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			str_ln_cd_none_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($sync_flg.equalsIgnoreCase(name)) {
			sync_flg(value);
			return;
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			outsrc_flg(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($crnt_edi_dlv_inst_flg.equalsIgnoreCase(name)) {
			crnt_edi_dlv_inst_flg(value);
			return;
		}
		if ($edi_dlv_inst_flg.equalsIgnoreCase(name)) {
			edi_dlv_inst_flg(value);
			return;
		}
		if ($edi_tgt_flg.equalsIgnoreCase(name)) {
			edi_tgt_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			arr_pr_no(value);
			return;
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			iv_itm_nm(value);
			return;
		}
		if ($in_to_loc_cd.equalsIgnoreCase(name)) {
			in_to_loc_cd(value);
			return;
		}
		if ($in_to_loc_nm.equalsIgnoreCase(name)) {
			in_to_loc_nm(value);
			return;
		}
		if ($in_to_loc_wg_cd.equalsIgnoreCase(name)) {
			in_to_loc_wg_cd(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($in_to_loc_lg_grp_cd.equalsIgnoreCase(name)) {
			in_to_loc_lg_grp_cd(value);
			return;
		}
		if ($in_to_loc_cal_cd.equalsIgnoreCase(name)) {
			in_to_loc_cal_cd(value);
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
		if ($outsrc_sppl_cd.equalsIgnoreCase(name)) {
			outsrc_sppl_cd(value);
			return;
		}
		if ($drct_dlv_typ.equalsIgnoreCase(name)) {
			drct_dlv_typ(value);
			return;
		}
		if ($drct_dlv_typ_nm.equalsIgnoreCase(name)) {
			drct_dlv_typ_nm(value);
			return;
		}
		if ($dlv_cal_cd.equalsIgnoreCase(name)) {
			dlv_cal_cd(value);
			return;
		}
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			purc_id_typ(value);
			return;
		}
		if ($purc_id_typ_nm.equalsIgnoreCase(name)) {
			purc_id_typ_nm(value);
			return;
		}
		if ($purc_sts_typ.equalsIgnoreCase(name)) {
			purc_sts_typ(value);
			return;
		}
		if ($purc_sts_typ_nm.equalsIgnoreCase(name)) {
			purc_sts_typ_nm(value);
			return;
		}
		if ($purc_basis_typ.equalsIgnoreCase(name)) {
			purc_basis_typ(value);
			return;
		}
		if ($purc_basis_typ_nm.equalsIgnoreCase(name)) {
			purc_basis_typ_nm(value);
			return;
		}
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			sppl_itm_cd(value);
			return;
		}
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			sppl_itm_nm(value);
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
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			maker_nm(value);
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
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_rnd_typ(value);
			return;
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			cont_fctr_rnd_typ(value);
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
		if ($po_print_d_rmrks.equalsIgnoreCase(name)) {
			po_print_d_rmrks(value);
			return;
		}
		if ($ext_po_d_no.equalsIgnoreCase(name)) {
			ext_po_d_no(value);
			return;
		}
		if ($dlv_inst_ext_sys_typ.equalsIgnoreCase(name)) {
			dlv_inst_ext_sys_typ(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($assort_typ.equalsIgnoreCase(name)) {
			assort_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($dlv_rqst_dt.equalsIgnoreCase(name)) {
			dlv_rqst_dt(value);
			return;
		}
		if ($dlv_rqst_hm.equalsIgnoreCase(name)) {
			dlv_rqst_hm(value);
			return;
		}
		if ($rqst_dlv_rqst_dt.equalsIgnoreCase(name)) {
			rqst_dlv_rqst_dt(value);
			return;
		}
		if ($rqst_dlv_rqst_hm.equalsIgnoreCase(name)) {
			rqst_dlv_rqst_hm(value);
			return;
		}
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			purc_schd_dt(value);
			return;
		}
		if ($dlv_inst_dt.equalsIgnoreCase(name)) {
			dlv_inst_dt(value);
			return;
		}
		if ($dlv_inst_prms_rcpt_dt.equalsIgnoreCase(name)) {
			dlv_inst_prms_rcpt_dt(value);
			return;
		}
		if ($dlv_inst_prms_refl_dt.equalsIgnoreCase(name)) {
			dlv_inst_prms_refl_dt(value);
			return;
		}
		if ($prms_rcpt_dt.equalsIgnoreCase(name)) {
			prms_rcpt_dt(value);
			return;
		}
		if ($prms_refl_dt.equalsIgnoreCase(name)) {
			prms_refl_dt(value);
			return;
		}
		if ($prms_dlv_dt.equalsIgnoreCase(name)) {
			prms_dlv_dt(value);
			return;
		}
		if ($slo_dt.equalsIgnoreCase(name)) {
			slo_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		if ($in_to_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			in_to_str_ln_tgt_flg(value);
			return;
		}
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			str_ln_cd_none_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($sync_flg.equalsIgnoreCase(name)) {
			sync_flg(value);
			return;
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			outsrc_flg(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($crnt_edi_dlv_inst_flg.equalsIgnoreCase(name)) {
			crnt_edi_dlv_inst_flg(value);
			return;
		}
		if ($edi_dlv_inst_flg.equalsIgnoreCase(name)) {
			edi_dlv_inst_flg(value);
			return;
		}
		if ($edi_tgt_flg.equalsIgnoreCase(name)) {
			edi_tgt_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($in_to_loc_addr_p.equalsIgnoreCase(name)) {
			return in_to_loc_addr_p();
		}
		if ($dlv_addr_p.equalsIgnoreCase(name)) {
			return dlv_addr_p();
		}
		if ($tdlv_addr_p.equalsIgnoreCase(name)) {
			return tdlv_addr_p();
		}
		if ($ver_no_p.equalsIgnoreCase(name)) {
			return ver_no_p();
		}
		if ($sno_p.equalsIgnoreCase(name)) {
			return sno_p();
		}
		if ($qty_p.equalsIgnoreCase(name)) {
			return qty_p();
		}
		if ($base_unit_qty_p.equalsIgnoreCase(name)) {
			return base_unit_qty_p();
		}
		if ($cont_qty_p.equalsIgnoreCase(name)) {
			return cont_qty_p();
		}
		if ($cont_fctr_unit_p.equalsIgnoreCase(name)) {
			return cont_fctr_unit_p();
		}
		if ($std_cont_fctr_p.equalsIgnoreCase(name)) {
			return std_cont_fctr_p();
		}
		if ($dlv_inst_qty_p.equalsIgnoreCase(name)) {
			return dlv_inst_qty_p();
		}
		if ($prms_rcpt_qty_p.equalsIgnoreCase(name)) {
			return prms_rcpt_qty_p();
		}
		if ($prms_refl_qty_p.equalsIgnoreCase(name)) {
			return prms_refl_qty_p();
		}
		if ($dlv_inst_prms_rcpt_qty_p.equalsIgnoreCase(name)) {
			return dlv_inst_prms_rcpt_qty_p();
		}
		if ($dlv_inst_prms_refl_qty_p.equalsIgnoreCase(name)) {
			return dlv_inst_prms_refl_qty_p();
		}
		if ($rcpt_iv_qty_p.equalsIgnoreCase(name)) {
			return rcpt_iv_qty_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($itm_p.equalsIgnoreCase(name)) {
			itm_p(
				((MCContainerMeta) itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5030.ItmR.class, value)
			);
			return;
		}
		if ($in_to_loc_addr_p.equalsIgnoreCase(name)) {
			in_to_loc_addr_p(
				((MCContainerMeta) in_to_loc_addr_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5360.AddrR.class, value)
			);
			return;
		}
		if ($dlv_addr_p.equalsIgnoreCase(name)) {
			dlv_addr_p(
				((MCContainerMeta) dlv_addr_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5150.DlvR.class, value)
			);
			return;
		}
		if ($tdlv_addr_p.equalsIgnoreCase(name)) {
			tdlv_addr_p(
				((MCContainerMeta) tdlv_addr_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5150.DlvR.class, value)
			);
			return;
		}
		if ($ver_no_p.equalsIgnoreCase(name)) {
			ver_no_p(
				((MCContainerMeta) ver_no_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5250.VerNoR.class, value)
			);
			return;
		}
		if ($sno_p.equalsIgnoreCase(name)) {
			sno_p(
				((MCContainerMeta) sno_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.class, value)
			);
			return;
		}
		if ($qty_p.equalsIgnoreCase(name)) {
			qty_p(
				((MCContainerMeta) qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($base_unit_qty_p.equalsIgnoreCase(name)) {
			base_unit_qty_p(
				((MCContainerMeta) base_unit_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($cont_qty_p.equalsIgnoreCase(name)) {
			cont_qty_p(
				((MCContainerMeta) cont_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5260.ContQtyR.class, value)
			);
			return;
		}
		if ($cont_fctr_unit_p.equalsIgnoreCase(name)) {
			cont_fctr_unit_p(
				((MCContainerMeta) cont_fctr_unit_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5270.ContFctrUnitR.class, value)
			);
			return;
		}
		if ($std_cont_fctr_p.equalsIgnoreCase(name)) {
			std_cont_fctr_p(
				((MCContainerMeta) std_cont_fctr_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5280.StdContFctrR.class, value)
			);
			return;
		}
		if ($dlv_inst_qty_p.equalsIgnoreCase(name)) {
			dlv_inst_qty_p(
				((MCContainerMeta) dlv_inst_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($prms_rcpt_qty_p.equalsIgnoreCase(name)) {
			prms_rcpt_qty_p(
				((MCContainerMeta) prms_rcpt_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($prms_refl_qty_p.equalsIgnoreCase(name)) {
			prms_refl_qty_p(
				((MCContainerMeta) prms_refl_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($dlv_inst_prms_rcpt_qty_p.equalsIgnoreCase(name)) {
			dlv_inst_prms_rcpt_qty_p(
				((MCContainerMeta) dlv_inst_prms_rcpt_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($dlv_inst_prms_refl_qty_p.equalsIgnoreCase(name)) {
			dlv_inst_prms_refl_qty_p(
				((MCContainerMeta) dlv_inst_prms_refl_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($rcpt_iv_qty_p.equalsIgnoreCase(name)) {
			rcpt_iv_qty_p(
				((MCContainerMeta) rcpt_iv_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
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

	public String cntry_cd() {
		return in_to_loc_addr_p().cntry_cd();
	}

	public void cntry_cd(String value) {
		in_to_loc_addr_p().cntry_cd(value);
	}

	public String cntry_nm() {
		return in_to_loc_addr_p().cntry_nm();
	}

	public void cntry_nm(String value) {
		in_to_loc_addr_p().cntry_nm(value);
	}

	/**
	 * Delivery location zip code 納入場所郵便番号.<p>
	 *
	 */
	public String in_to_loc_zip_cd() {
		return in_to_loc_addr_p().zip_cd();
	}

	/**
	 * Delivery location zip code 納入場所郵便番号.<p>
	 *
	 */
	public void in_to_loc_zip_cd(String value) {
		in_to_loc_addr_p().zip_cd(value);
	}

	/**
	 * Delivery location address 1 納入場所住所１.<p>
	 *
	 */
	public String in_to_loc_addr1() {
		return in_to_loc_addr_p().addr1();
	}

	/**
	 * Delivery location address 1 納入場所住所１.<p>
	 *
	 */
	public void in_to_loc_addr1(String value) {
		in_to_loc_addr_p().addr1(value);
	}

	/**
	 * Delivery location address 2 納入場所住所２.<p>
	 *
	 */
	public String in_to_loc_addr2() {
		return in_to_loc_addr_p().addr2();
	}

	/**
	 * Delivery location address 2 納入場所住所２.<p>
	 *
	 */
	public void in_to_loc_addr2(String value) {
		in_to_loc_addr_p().addr2(value);
	}

	/**
	 * Delivery location address 3 納入場所住所３.<p>
	 *
	 */
	public String in_to_loc_addr3() {
		return in_to_loc_addr_p().addr3();
	}

	/**
	 * Delivery location address 3 納入場所住所３.<p>
	 *
	 */
	public void in_to_loc_addr3(String value) {
		in_to_loc_addr_p().addr3(value);
	}

	/**
	 * Delivery location address 4 納入場所住所４.<p>
	 *
	 */
	public String in_to_loc_addr4() {
		return in_to_loc_addr_p().addr4();
	}

	/**
	 * Delivery location address 4 納入場所住所４.<p>
	 *
	 */
	public void in_to_loc_addr4(String value) {
		in_to_loc_addr_p().addr4(value);
	}

	/**
	 * Delivery location TEL 納入場所ＴＥＬ.<p>
	 *
	 */
	public String in_to_loc_tel() {
		return in_to_loc_addr_p().tel();
	}

	/**
	 * Delivery location TEL 納入場所ＴＥＬ.<p>
	 *
	 */
	public void in_to_loc_tel(String value) {
		in_to_loc_addr_p().tel(value);
	}

	/**
	 * Delivery location FAX 納入場所ＦＡＸ.<p>
	 *
	 */
	public String in_to_loc_fax() {
		return in_to_loc_addr_p().fax();
	}

	/**
	 * Delivery location FAX 納入場所ＦＡＸ.<p>
	 *
	 */
	public void in_to_loc_fax(String value) {
		in_to_loc_addr_p().fax(value);
	}

	public String cntct_dpt() {
		return in_to_loc_addr_p().cntct_dpt();
	}

	public void cntct_dpt(String value) {
		in_to_loc_addr_p().cntct_dpt(value);
	}

	public String cntct_psn() {
		return in_to_loc_addr_p().cntct_psn();
	}

	public void cntct_psn(String value) {
		in_to_loc_addr_p().cntct_psn(value);
	}

	public String dlv_cd() {
		return dlv_addr_p().bp_cd();
	}

	public void dlv_cd(String value) {
		dlv_addr_p().bp_cd(value);
	}

	public String dlv_nm() {
		return dlv_addr_p().bp_nm();
	}

	public void dlv_nm(String value) {
		dlv_addr_p().bp_nm(value);
	}

	public boolean dlv_sundry_flg() {
		return dlv_addr_p().dlv_sundry_flg();
	}

	public void dlv_sundry_flg(boolean value) {
		dlv_addr_p().dlv_sundry_flg(value);
	}

	public String lg_grp_cd() {
		return dlv_addr_p().lg_grp_cd();
	}

	public void lg_grp_cd(String value) {
		dlv_addr_p().lg_grp_cd(value);
	}

	public String lg_grp_nm() {
		return dlv_addr_p().lg_grp_nm();
	}

	public void lg_grp_nm(String value) {
		dlv_addr_p().lg_grp_nm(value);
	}

	public String dlv_cntry_cd() {
		return dlv_addr_p().cntry_cd();
	}

	public void dlv_cntry_cd(String value) {
		dlv_addr_p().cntry_cd(value);
	}

	public String dlv_cntry_nm() {
		return dlv_addr_p().cntry_nm();
	}

	public void dlv_cntry_nm(String value) {
		dlv_addr_p().cntry_nm(value);
	}

	public String dlv_zip_cd() {
		return dlv_addr_p().zip_cd();
	}

	public void dlv_zip_cd(String value) {
		dlv_addr_p().zip_cd(value);
	}

	public String dlv_addr1() {
		return dlv_addr_p().addr1();
	}

	public void dlv_addr1(String value) {
		dlv_addr_p().addr1(value);
	}

	public String dlv_addr2() {
		return dlv_addr_p().addr2();
	}

	public void dlv_addr2(String value) {
		dlv_addr_p().addr2(value);
	}

	public String dlv_addr3() {
		return dlv_addr_p().addr3();
	}

	public void dlv_addr3(String value) {
		dlv_addr_p().addr3(value);
	}

	public String dlv_addr4() {
		return dlv_addr_p().addr4();
	}

	public void dlv_addr4(String value) {
		dlv_addr_p().addr4(value);
	}

	public String dlv_tel() {
		return dlv_addr_p().tel();
	}

	public void dlv_tel(String value) {
		dlv_addr_p().tel(value);
	}

	public String dlv_fax() {
		return dlv_addr_p().fax();
	}

	public void dlv_fax(String value) {
		dlv_addr_p().fax(value);
	}

	public String dlv_cntct_dpt() {
		return dlv_addr_p().dlv_cntct_dpt();
	}

	public void dlv_cntct_dpt(String value) {
		dlv_addr_p().dlv_cntct_dpt(value);
	}

	public String dlv_cntct_psn() {
		return dlv_addr_p().dlv_cntct_psn();
	}

	public void dlv_cntct_psn(String value) {
		dlv_addr_p().dlv_cntct_psn(value);
	}

	public boolean pri_prnt_flg() {
		return dlv_addr_p().pri_prnt_flg();
	}

	public void pri_prnt_flg(boolean value) {
		dlv_addr_p().pri_prnt_flg(value);
	}

	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public String tdlv_cd() {
		return tdlv_addr_p().bp_cd();
	}

	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public void tdlv_cd(String value) {
		tdlv_addr_p().bp_cd(value);
	}

	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public String tdlv_nm() {
		return tdlv_addr_p().bp_nm();
	}

	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public void tdlv_nm(String value) {
		tdlv_addr_p().bp_nm(value);
	}

	/**
	 * Miscellaneous receiving point 配送先諸口.<p>
	 *
	 */
	public boolean tdlv_sundry_flg() {
		return tdlv_addr_p().dlv_sundry_flg();
	}

	/**
	 * Miscellaneous receiving point 配送先諸口.<p>
	 *
	 */
	public void tdlv_sundry_flg(boolean value) {
		tdlv_addr_p().dlv_sundry_flg(value);
	}

	/**
	 * Receiving point country cd. 配送先国ＣＤ.<p>
	 *
	 */
	public String tdlv_cntry_cd() {
		return tdlv_addr_p().cntry_cd();
	}

	/**
	 * Receiving point country cd. 配送先国ＣＤ.<p>
	 *
	 */
	public void tdlv_cntry_cd(String value) {
		tdlv_addr_p().cntry_cd(value);
	}

	/**
	 * Receiving point country name 配送先国名.<p>
	 *
	 */
	public String tdlv_cntry_nm() {
		return tdlv_addr_p().cntry_nm();
	}

	/**
	 * Receiving point country name 配送先国名.<p>
	 *
	 */
	public void tdlv_cntry_nm(String value) {
		tdlv_addr_p().cntry_nm(value);
	}

	/**
	 * Receiving point zip code 配送先郵便番号.<p>
	 *
	 */
	public String tdlv_zip_cd() {
		return tdlv_addr_p().zip_cd();
	}

	/**
	 * Receiving point zip code 配送先郵便番号.<p>
	 *
	 */
	public void tdlv_zip_cd(String value) {
		tdlv_addr_p().zip_cd(value);
	}

	/**
	 * Receiving point address 1 配送先住所１.<p>
	 *
	 */
	public String tdlv_addr1() {
		return tdlv_addr_p().addr1();
	}

	/**
	 * Receiving point address 1 配送先住所１.<p>
	 *
	 */
	public void tdlv_addr1(String value) {
		tdlv_addr_p().addr1(value);
	}

	/**
	 * Receiving point address 2 配送先住所２.<p>
	 *
	 */
	public String tdlv_addr2() {
		return tdlv_addr_p().addr2();
	}

	/**
	 * Receiving point address 2 配送先住所２.<p>
	 *
	 */
	public void tdlv_addr2(String value) {
		tdlv_addr_p().addr2(value);
	}

	/**
	 * Receiving point address 3 配送先住所３.<p>
	 *
	 */
	public String tdlv_addr3() {
		return tdlv_addr_p().addr3();
	}

	/**
	 * Receiving point address 3 配送先住所３.<p>
	 *
	 */
	public void tdlv_addr3(String value) {
		tdlv_addr_p().addr3(value);
	}

	/**
	 * Receiving point address 4 配送先住所４.<p>
	 *
	 */
	public String tdlv_addr4() {
		return tdlv_addr_p().addr4();
	}

	/**
	 * Receiving point address 4 配送先住所４.<p>
	 *
	 */
	public void tdlv_addr4(String value) {
		tdlv_addr_p().addr4(value);
	}

	/**
	 * Receiving point TEL 配送先ＴＥＬ.<p>
	 *
	 */
	public String tdlv_tel() {
		return tdlv_addr_p().tel();
	}

	/**
	 * Receiving point TEL 配送先ＴＥＬ.<p>
	 *
	 */
	public void tdlv_tel(String value) {
		tdlv_addr_p().tel(value);
	}

	/**
	 * Receiving point FAX 配送先ＦＡＸ.<p>
	 *
	 */
	public String tdlv_fax() {
		return tdlv_addr_p().fax();
	}

	/**
	 * Receiving point FAX 配送先ＦＡＸ.<p>
	 *
	 */
	public void tdlv_fax(String value) {
		tdlv_addr_p().fax(value);
	}

	/**
	 * Receiving point dept. 配送先部署.<p>
	 *
	 */
	public String tdlv_cntct_dpt() {
		return tdlv_addr_p().dlv_cntct_dpt();
	}

	/**
	 * Receiving point dept. 配送先部署.<p>
	 *
	 */
	public void tdlv_cntct_dpt(String value) {
		tdlv_addr_p().dlv_cntct_dpt(value);
	}

	/**
	 * Receiving point PIC 配送先担当者.<p>
	 *
	 */
	public String tdlv_cntct_psn() {
		return tdlv_addr_p().dlv_cntct_psn();
	}

	/**
	 * Receiving point PIC 配送先担当者.<p>
	 *
	 */
	public void tdlv_cntct_psn(String value) {
		tdlv_addr_p().dlv_cntct_psn(value);
	}

	public String ver_no() {
		return ver_no_p().ver_no();
	}

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
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return qty_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		qty_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		qty_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		qty_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		qty_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		qty_p().qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return base_unit_qty_p().qty();
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public MCNumber cont_qty() {
		return cont_qty_p().cont_qty();
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void cont_qty(MCNumber value) {
		cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void cont_qty(int value) {
		cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void cont_qty(long value) {
		cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void cont_qty(float value) {
		cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void cont_qty(double value) {
		cont_qty_p().cont_qty(value);
	}

	public String cont_fctr_unit_cd() {
		return cont_fctr_unit_p().cont_fctr_unit_cd();
	}

	public void cont_fctr_unit_cd(String value) {
		cont_fctr_unit_p().cont_fctr_unit_cd(value);
	}

	public String cont_fctr_unit_nm() {
		return cont_fctr_unit_p().cont_fctr_unit_nm();
	}

	public void cont_fctr_unit_nm(String value) {
		cont_fctr_unit_p().cont_fctr_unit_nm(value);
	}

	public MCNumber std_cont_fctr() {
		return std_cont_fctr_p().std_cont_fctr();
	}

	public void std_cont_fctr(MCNumber value) {
		std_cont_fctr_p().std_cont_fctr(value);
	}

	public void std_cont_fctr(int value) {
		std_cont_fctr_p().std_cont_fctr(value);
	}

	public void std_cont_fctr(long value) {
		std_cont_fctr_p().std_cont_fctr(value);
	}

	public void std_cont_fctr(float value) {
		std_cont_fctr_p().std_cont_fctr(value);
	}

	public void std_cont_fctr(double value) {
		std_cont_fctr_p().std_cont_fctr(value);
	}

	/**
	 * Delivery order qty. 納入指示数量.<p>
	 *
	 */
	public MCNumber dlv_inst_qty() {
		return dlv_inst_qty_p().qty();
	}

	/**
	 * Delivery order qty. 納入指示数量.<p>
	 *
	 */
	public void dlv_inst_qty(MCNumber value) {
		dlv_inst_qty_p().qty(value);
	}

	/**
	 * Delivery order qty. 納入指示数量.<p>
	 *
	 */
	public void dlv_inst_qty(int value) {
		dlv_inst_qty_p().qty(value);
	}

	/**
	 * Delivery order qty. 納入指示数量.<p>
	 *
	 */
	public void dlv_inst_qty(long value) {
		dlv_inst_qty_p().qty(value);
	}

	/**
	 * Delivery order qty. 納入指示数量.<p>
	 *
	 */
	public void dlv_inst_qty(float value) {
		dlv_inst_qty_p().qty(value);
	}

	/**
	 * Delivery order qty. 納入指示数量.<p>
	 *
	 */
	public void dlv_inst_qty(double value) {
		dlv_inst_qty_p().qty(value);
	}

	/**
	 * Order promising result received qty. 納期回答受領数量.<p>
	 *
	 */
	public MCNumber prms_rcpt_qty() {
		return prms_rcpt_qty_p().qty();
	}

	/**
	 * Order promising result received qty. 納期回答受領数量.<p>
	 *
	 */
	public void prms_rcpt_qty(MCNumber value) {
		prms_rcpt_qty_p().qty(value);
	}

	/**
	 * Order promising result received qty. 納期回答受領数量.<p>
	 *
	 */
	public void prms_rcpt_qty(int value) {
		prms_rcpt_qty_p().qty(value);
	}

	/**
	 * Order promising result received qty. 納期回答受領数量.<p>
	 *
	 */
	public void prms_rcpt_qty(long value) {
		prms_rcpt_qty_p().qty(value);
	}

	/**
	 * Order promising result received qty. 納期回答受領数量.<p>
	 *
	 */
	public void prms_rcpt_qty(float value) {
		prms_rcpt_qty_p().qty(value);
	}

	/**
	 * Order promising result received qty. 納期回答受領数量.<p>
	 *
	 */
	public void prms_rcpt_qty(double value) {
		prms_rcpt_qty_p().qty(value);
	}

	/**
	 * Order promising applied qty. 納期回答反映済数量.<p>
	 *
	 */
	public MCNumber prms_refl_qty() {
		return prms_refl_qty_p().qty();
	}

	/**
	 * Order promising applied qty. 納期回答反映済数量.<p>
	 *
	 */
	public void prms_refl_qty(MCNumber value) {
		prms_refl_qty_p().qty(value);
	}

	/**
	 * Order promising applied qty. 納期回答反映済数量.<p>
	 *
	 */
	public void prms_refl_qty(int value) {
		prms_refl_qty_p().qty(value);
	}

	/**
	 * Order promising applied qty. 納期回答反映済数量.<p>
	 *
	 */
	public void prms_refl_qty(long value) {
		prms_refl_qty_p().qty(value);
	}

	/**
	 * Order promising applied qty. 納期回答反映済数量.<p>
	 *
	 */
	public void prms_refl_qty(float value) {
		prms_refl_qty_p().qty(value);
	}

	/**
	 * Order promising applied qty. 納期回答反映済数量.<p>
	 *
	 */
	public void prms_refl_qty(double value) {
		prms_refl_qty_p().qty(value);
	}

	/**
	 * Delivery order replied received qty. 納入指示回答受領数量.<p>
	 *
	 */
	public MCNumber dlv_inst_prms_rcpt_qty() {
		return dlv_inst_prms_rcpt_qty_p().qty();
	}

	/**
	 * Delivery order replied received qty. 納入指示回答受領数量.<p>
	 *
	 */
	public void dlv_inst_prms_rcpt_qty(MCNumber value) {
		dlv_inst_prms_rcpt_qty_p().qty(value);
	}

	/**
	 * Delivery order replied received qty. 納入指示回答受領数量.<p>
	 *
	 */
	public void dlv_inst_prms_rcpt_qty(int value) {
		dlv_inst_prms_rcpt_qty_p().qty(value);
	}

	/**
	 * Delivery order replied received qty. 納入指示回答受領数量.<p>
	 *
	 */
	public void dlv_inst_prms_rcpt_qty(long value) {
		dlv_inst_prms_rcpt_qty_p().qty(value);
	}

	/**
	 * Delivery order replied received qty. 納入指示回答受領数量.<p>
	 *
	 */
	public void dlv_inst_prms_rcpt_qty(float value) {
		dlv_inst_prms_rcpt_qty_p().qty(value);
	}

	/**
	 * Delivery order replied received qty. 納入指示回答受領数量.<p>
	 *
	 */
	public void dlv_inst_prms_rcpt_qty(double value) {
		dlv_inst_prms_rcpt_qty_p().qty(value);
	}

	/**
	 * Delivery order reply applied qty. 納入指示回答反映済数量.<p>
	 *
	 */
	public MCNumber dlv_inst_prms_refl_qty() {
		return dlv_inst_prms_refl_qty_p().qty();
	}

	/**
	 * Delivery order reply applied qty. 納入指示回答反映済数量.<p>
	 *
	 */
	public void dlv_inst_prms_refl_qty(MCNumber value) {
		dlv_inst_prms_refl_qty_p().qty(value);
	}

	/**
	 * Delivery order reply applied qty. 納入指示回答反映済数量.<p>
	 *
	 */
	public void dlv_inst_prms_refl_qty(int value) {
		dlv_inst_prms_refl_qty_p().qty(value);
	}

	/**
	 * Delivery order reply applied qty. 納入指示回答反映済数量.<p>
	 *
	 */
	public void dlv_inst_prms_refl_qty(long value) {
		dlv_inst_prms_refl_qty_p().qty(value);
	}

	/**
	 * Delivery order reply applied qty. 納入指示回答反映済数量.<p>
	 *
	 */
	public void dlv_inst_prms_refl_qty(float value) {
		dlv_inst_prms_refl_qty_p().qty(value);
	}

	/**
	 * Delivery order reply applied qty. 納入指示回答反映済数量.<p>
	 *
	 */
	public void dlv_inst_prms_refl_qty(double value) {
		dlv_inst_prms_refl_qty_p().qty(value);
	}

	/**
	 * Purchase invoice qty. 受領インボイス数量.<p>
	 *
	 */
	public MCNumber rcpt_iv_qty() {
		return rcpt_iv_qty_p().qty();
	}

	/**
	 * Purchase invoice qty. 受領インボイス数量.<p>
	 *
	 */
	public void rcpt_iv_qty(MCNumber value) {
		rcpt_iv_qty_p().qty(value);
	}

	/**
	 * Purchase invoice qty. 受領インボイス数量.<p>
	 *
	 */
	public void rcpt_iv_qty(int value) {
		rcpt_iv_qty_p().qty(value);
	}

	/**
	 * Purchase invoice qty. 受領インボイス数量.<p>
	 *
	 */
	public void rcpt_iv_qty(long value) {
		rcpt_iv_qty_p().qty(value);
	}

	/**
	 * Purchase invoice qty. 受領インボイス数量.<p>
	 *
	 */
	public void rcpt_iv_qty(float value) {
		rcpt_iv_qty_p().qty(value);
	}

	/**
	 * Purchase invoice qty. 受領インボイス数量.<p>
	 *
	 */
	public void rcpt_iv_qty(double value) {
		rcpt_iv_qty_p().qty(value);
	}

}

