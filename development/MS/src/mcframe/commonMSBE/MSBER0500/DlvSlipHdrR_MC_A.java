package mcframe.commonMSBE.MSBER0500;

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
 * ブロック"DlvSlipHdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DlvSlipHdrR_MC_A extends MCConstRow {

	/**
	 *  発行.<p>
	 *
	 */
	public static final String $print_hm = "print_hm";
	/**
	 *  帳票タイトル名.<p>
	 *
	 */
	public static final String $formtitle = "formtitle";
	/**
	 *  帳票タイトル名２.<p>
	 *
	 */
	public static final String $formtitle2 = "formtitle2";
	/**
	 *  取引.<p>
	 *
	 */
	public static final String $trd_nm = "trd_nm";
	/**
	 *  取引ＣＤ.<p>
	 *
	 */
	public static final String $trd_cd = "trd_cd";
	/**
	 *  取引パタン区分.<p>
	 *
	 */
	public static final String $trd_ptn_typ = "trd_ptn_typ";
	/**
	 *  伝票状況区分.<p>
	 *
	 */
	public static final String $slip_sts_typ_nm = "slip_sts_typ_nm";
	/**
	 *  伝票状況区分名.<p>
	 *
	 */
	public static final String $slip_sts_typ = "slip_sts_typ";
	/**
	 *  調整伝票ＦＬＧ.<p>
	 *
	 */
	public static final String $adjst_slip_flg = "adjst_slip_flg";
	/**
	 *  予定文字列.<p>
	 *
	 */
	public static final String $s_schd = "s_schd";
	/**
	 *  納品書Ｎｏ.<p>
	 *
	 */
	public static final String $dlv_slip_no = "dlv_slip_no";
	/**
	 *  納品書リビジョン.<p>
	 *
	 */
	public static final String $dlv_slip_rev = "dlv_slip_rev";
	/**
	 *  納品書連番（データ用）.<p>
	 *
	 */
	public static final String $dlv_slip_seq = "dlv_slip_seq";
	/**
	 *  納品書連番（表示用）.<p>
	 *
	 */
	public static final String $dlv_slip_seq_view = "dlv_slip_seq_view";
	/**
	 *  出荷時納品書ＮＯ.<p>
	 *
	 */
	public static final String $ship_dlv_slip_no = "ship_dlv_slip_no";
	/**
	 *  出荷元物流グループ名.<p>
	 *
	 */
	public static final String $lg_grp_nm = "lg_grp_nm";
	/**
	 *  出荷日.<p>
	 *
	 */
	public static final String $ship_dt = "ship_dt";
	/**
	 *  出荷時刻.<p>
	 *
	 */
	public static final String $ship_tm = "ship_tm";
	/**
	 *  得意先名.<p>
	 *
	 */
	public static final String $cst_nm = "cst_nm";
	/**
	 *  納品日.<p>
	 *
	 */
	public static final String $dlv_dt = "dlv_dt";
	/**
	 *  納品時刻.<p>
	 *
	 */
	public static final String $dlv_tm = "dlv_tm";
	/**
	 *  納入希望日.<p>
	 *
	 */
	public static final String $dlv_rqst_dt = "dlv_rqst_dt";
	/**
	 *  納入希望時刻.<p>
	 *
	 */
	public static final String $dlv_rqst_tm = "dlv_rqst_tm";
	/**
	 *  計上日.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	/**
	 *  取引通貨ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	/**
	 *  取引通貨名.<p>
	 *
	 */
	public static final String $trd_cur_nm = "trd_cur_nm";
	/**
	 *  受注者ＣＤ.<p>
	 *
	 */
	public static final String $slo_co_cd = "slo_co_cd";
	/**
	 *  受注者標準企業ＣＤ.<p>
	 *
	 */
	public static final String $slo_std_co_cd = "slo_std_co_cd";
	/**
	 *  受注者名.<p>
	 *
	 */
	public static final String $slo_co_nm = "slo_co_nm";
	/**
	 *  事業者番号.<p>
	 *
	 */
	public static final String $biz_co_no = "biz_co_no";
	/**
	 *  受注者別名１.<p>
	 *
	 */
	public static final String $slo_co_alt_nm1 = "slo_co_alt_nm1";
	/**
	 *  受注者別名２.<p>
	 *
	 */
	public static final String $slo_co_alt_nm2 = "slo_co_alt_nm2";
	/**
	 *  受注者別名３.<p>
	 *
	 */
	public static final String $slo_co_alt_nm3 = "slo_co_alt_nm3";
	/**
	 *  受注者別名４.<p>
	 *
	 */
	public static final String $slo_co_alt_nm4 = "slo_co_alt_nm4";
	/**
	 *  受注者郵便番号.<p>
	 *
	 */
	public static final String $slo_co_zip_cd = "slo_co_zip_cd";
	/**
	 *  受注者住所１.<p>
	 *
	 */
	public static final String $slo_co_addr1 = "slo_co_addr1";
	/**
	 *  受注者住所２.<p>
	 *
	 */
	public static final String $slo_co_addr2 = "slo_co_addr2";
	/**
	 *  受注者住所３.<p>
	 *
	 */
	public static final String $slo_co_addr3 = "slo_co_addr3";
	/**
	 *  受注者住所４.<p>
	 *
	 */
	public static final String $slo_co_addr4 = "slo_co_addr4";
	/**
	 *  受注者住所１－４.<p>
	 *
	 */
	public static final String $slo_co_addr = "slo_co_addr";
	/**
	 *  受注者ＴＥＬ.<p>
	 *
	 */
	public static final String $slo_co_tel = "slo_co_tel";
	/**
	 *  受注者ＦＡＸ.<p>
	 *
	 */
	public static final String $slo_co_fax = "slo_co_fax";
	/**
	 *  受注者国名.<p>
	 *
	 */
	public static final String $slo_co_cntry_nm = "slo_co_cntry_nm";
	/**
	 *  部門.<p>
	 *
	 */
	public static final String $dpt_nm = "dpt_nm";
	/**
	 *  部門ＣＤ.<p>
	 *
	 */
	public static final String $dpt_cd = "dpt_cd";
	/**
	 *  担当者.<p>
	 *
	 */
	public static final String $usr_nm = "usr_nm";
	/**
	 *  担当者ＣＤ.<p>
	 *
	 */
	public static final String $usr_cd = "usr_cd";
	/**
	 *  発注者ＣＤ.<p>
	 *
	 */
	public static final String $po_co_cd = "po_co_cd";
	/**
	 *  発注者名.<p>
	 *
	 */
	public static final String $po_co_nm = "po_co_nm";
	/**
	 *  発注者別名１.<p>
	 *
	 */
	public static final String $po_co_alt_nm1 = "po_co_alt_nm1";
	/**
	 *  発注者別名２.<p>
	 *
	 */
	public static final String $po_co_alt_nm2 = "po_co_alt_nm2";
	/**
	 *  発注者別名３.<p>
	 *
	 */
	public static final String $po_co_alt_nm3 = "po_co_alt_nm3";
	/**
	 *  発注者別名４.<p>
	 *
	 */
	public static final String $po_co_alt_nm4 = "po_co_alt_nm4";
	/**
	 *  発注者郵便番号.<p>
	 *
	 */
	public static final String $po_co_zip_cd = "po_co_zip_cd";
	/**
	 *  発注者住所１.<p>
	 *
	 */
	public static final String $po_co_addr1 = "po_co_addr1";
	/**
	 *  発注者住所２.<p>
	 *
	 */
	public static final String $po_co_addr2 = "po_co_addr2";
	/**
	 *  発注者住所３.<p>
	 *
	 */
	public static final String $po_co_addr3 = "po_co_addr3";
	/**
	 *  発注者住所４.<p>
	 *
	 */
	public static final String $po_co_addr4 = "po_co_addr4";
	/**
	 *  発注者住所１－４.<p>
	 *
	 */
	public static final String $po_co_addr = "po_co_addr";
	/**
	 *  発注者ＴＥＬ.<p>
	 *
	 */
	public static final String $po_co_tel = "po_co_tel";
	/**
	 *  発注者ＦＡＸ.<p>
	 *
	 */
	public static final String $po_co_fax = "po_co_fax";
	/**
	 *  発注者担当部署.<p>
	 *
	 */
	public static final String $po_co_cntct_dpt = "po_co_cntct_dpt";
	/**
	 *  発注者担当者.<p>
	 *
	 */
	public static final String $po_co_cntct_psn = "po_co_cntct_psn";
	/**
	 *  発注者担当者敬称.<p>
	 *
	 */
	public static final String $po_co_cntct_psn_title = "po_co_cntct_psn_title";
	/**
	 *  発注者国名.<p>
	 *
	 */
	public static final String $po_co_cntry_nm = "po_co_cntry_nm";
	/**
	 *  納品先識別区分.<p>
	 *
	 */
	public static final String $dlv_id_typ = "dlv_id_typ";
	/**
	 *  納品先識別名.<p>
	 *
	 */
	public static final String $dlv_id_nm = "dlv_id_nm";
	/**
	 *  納品先識別別名１.<p>
	 *
	 */
	public static final String $dlv_id_alt_nm1 = "dlv_id_alt_nm1";
	/**
	 *  納品先識別別名２.<p>
	 *
	 */
	public static final String $dlv_id_alt_nm2 = "dlv_id_alt_nm2";
	/**
	 *  納品先識別別名３.<p>
	 *
	 */
	public static final String $dlv_id_alt_nm3 = "dlv_id_alt_nm3";
	/**
	 *  納品先識別別名４.<p>
	 *
	 */
	public static final String $dlv_id_alt_nm4 = "dlv_id_alt_nm4";
	/**
	 *  納品先識別ＣＤ.<p>
	 *
	 */
	public static final String $dlv_id_cd = "dlv_id_cd";
	/**
	 *  納品先郵便番号.<p>
	 *
	 */
	public static final String $dlv_zip_cd = "dlv_zip_cd";
	/**
	 *  納品先住所１.<p>
	 *
	 */
	public static final String $dlv_addr1 = "dlv_addr1";
	/**
	 *  納品先住所２.<p>
	 *
	 */
	public static final String $dlv_addr2 = "dlv_addr2";
	/**
	 *  納品先住所３.<p>
	 *
	 */
	public static final String $dlv_addr3 = "dlv_addr3";
	/**
	 *  納品先住所４.<p>
	 *
	 */
	public static final String $dlv_addr4 = "dlv_addr4";
	/**
	 *  納品先住所１－４（データ用）.<p>
	 *
	 */
	public static final String $dlv_addr = "dlv_addr";
	/**
	 *  納品先ＴＥＬ.<p>
	 *
	 */
	public static final String $dlv_tel = "dlv_tel";
	/**
	 *  納品先ＦＡＸ.<p>
	 *
	 */
	public static final String $dlv_fax = "dlv_fax";
	/**
	 *  納品先部署.<p>
	 *
	 */
	public static final String $dlv_cntct_dpt = "dlv_cntct_dpt";
	/**
	 *  納品先担当者.<p>
	 *
	 */
	public static final String $dlv_cntct_psn = "dlv_cntct_psn";
	/**
	 *  納品先担当者敬称.<p>
	 *
	 */
	public static final String $dlv_cntct_psn_title = "dlv_cntct_psn_title";
	/**
	 *  納品先国名.<p>
	 *
	 */
	public static final String $dlv_cntry_nm = "dlv_cntry_nm";
	/**
	 *  納品書注文ＮＯ(ラベル).<p>
	 *
	 */
	public static final String $dlv_slip_po_no_lbl = "dlv_slip_po_no_lbl";
	/**
	 *  納品書注文ＮＯ.<p>
	 *
	 */
	public static final String $dlv_slip_po_no = "dlv_slip_po_no";
	public static final String $eiaj_dlv_slip_po_no = "eiaj_dlv_slip_po_no";
	/**
	 *  取引通貨税額.<p>
	 *
	 */
	public static final String $ttl_trd_cur_tax_amt = "ttl_trd_cur_tax_amt";
	/**
	 *  取引通貨税額文字列.<p>
	 *
	 */
	public static final String $s_ttl_trd_cur_tax_amt = "s_ttl_trd_cur_tax_amt";
	/**
	 *  取引通貨金額.<p>
	 *
	 */
	public static final String $ttl_trd_cur_amt = "ttl_trd_cur_amt";
	/**
	 *  取引通貨金額文字列.<p>
	 *
	 */
	public static final String $s_ttl_trd_cur_amt = "s_ttl_trd_cur_amt";
	/**
	 *  取引通貨税込金額.<p>
	 *
	 */
	public static final String $ttl_trd_cur_tax_in_amt = "ttl_trd_cur_tax_in_amt";
	/**
	 *  取引通貨税込金額文字列.<p>
	 *
	 */
	public static final String $s_ttl_trd_cur_tax_in_amt = "s_ttl_trd_cur_tax_in_amt";
	/**
	 *  取引通貨値引金額.<p>
	 *
	 */
	public static final String $ttl_trd_cur_dscnt_amt = "ttl_trd_cur_dscnt_amt";
	/**
	 *  取引通貨値引金額文字列.<p>
	 *
	 */
	public static final String $s_ttl_trd_cur_dscnt_amt = "s_ttl_trd_cur_dscnt_amt";
	/**
	 *  実績Ｎｏ.<p>
	 *
	 */
	public static final String $dlv_slip_act_no = "dlv_slip_act_no";
	/**
	 *  取引備考.<p>
	 *
	 */
	public static final String $trd_rmrks = "trd_rmrks";
	/**
	 *  発注者取引備考.<p>
	 *
	 */
	public static final String $po_trd_rmrks = "po_trd_rmrks";
	/**
	 *  発注予備１.<p>
	 *
	 */
	public static final String $po_sub_char1 = "po_sub_char1";
	/**
	 *  発注予備２.<p>
	 *
	 */
	public static final String $po_sub_char2 = "po_sub_char2";
	/**
	 *  発注予備３.<p>
	 *
	 */
	public static final String $po_sub_char3 = "po_sub_char3";
	/**
	 *  納品書予備１.<p>
	 *
	 */
	public static final String $dlv_slip_sub_char1 = "dlv_slip_sub_char1";
	/**
	 *  納品書予備２.<p>
	 *
	 */
	public static final String $dlv_slip_sub_char2 = "dlv_slip_sub_char2";
	/**
	 *  納品書予備３.<p>
	 *
	 */
	public static final String $dlv_slip_sub_char3 = "dlv_slip_sub_char3";
	/**
	 *  ＥＩＡＪ納品書用バーコード１.<p>
	 *
	 */
	public static final String $b_eiaj1 = "b_eiaj1";
	/**
	 *  ＥＩＡＪ納品書用バーコード２.<p>
	 *
	 */
	public static final String $b_eiaj2 = "b_eiaj2";
	/**
	 *  ＥＩＡＪ納品書用バーコード３.<p>
	 *
	 */
	public static final String $b_eiaj3 = "b_eiaj3";
	/**
	 *  ＥＩＡＪ納品書用バーコード４.<p>
	 *
	 */
	public static final String $b_eiaj4 = "b_eiaj4";
	/**
	 *  ＥＩＡＪ納品書バーコード用数量.<p>
	 *
	 */
	public static final String $eiaj_b_slo_po_qty = "eiaj_b_slo_po_qty";
	/**
	 *  ＥＩＡＪ納品書バーコード用数量文字列.<p>
	 *
	 */
	public static final String $s_eiaj_b_slo_po_qty = "s_eiaj_b_slo_po_qty";
	/**
	 *  納品先（ラベル）.<p>
	 *
	 */
	public static final String $dlv_lbl = "dlv_lbl";
	/**
	 *  出荷日（ラベル）.<p>
	 *
	 */
	public static final String $ship_dt_lbl = "ship_dt_lbl";
	/**
	 *  納品日（ラベル）.<p>
	 *
	 */
	public static final String $dlv_dt_lbl = "dlv_dt_lbl";
	/**
	 *  出荷元（ラベル）.<p>
	 *
	 */
	public static final String $lg_grp_lbl = "lg_grp_lbl";
	/**
	 *  得意先（ラベル）.<p>
	 *
	 */
	public static final String $cst_lbl = "cst_lbl";
	/**
	 *  出荷時納品書ＮＯ（ラベル）.<p>
	 *
	 */
	public static final String $ship_dlv_slip_no_lbl = "ship_dlv_slip_no_lbl";
	/**
	 *  支給ＦＬＧ.<p>
	 *
	 */
	public static final String $prov_flg = "prov_flg";
	/**
	 *  販売ＦＬＧ.<p>
	 *
	 */
	public static final String $sls_flg = "sls_flg";
	/**
	 *  為替レート（ラベル）.<p>
	 *
	 */
	public static final String $xrate_lbl = "xrate_lbl";
	/**
	 *  為替レート.<p>
	 *
	 */
	public static final String $xrate = "xrate";
	/**
	 *  税率（ラベル）.<p>
	 *
	 */
	public static final String $tax_rate_lbl = "tax_rate_lbl";
	/**
	 *  取引通貨値引金額文字列.<p>
	 *
	 */
	public static final String $s_ttl_trd_cur_dscnt_amt2 = "s_ttl_trd_cur_dscnt_amt2";
	/**
	 *  取引通貨金額文字列.<p>
	 *
	 */
	public static final String $s_ttl_trd_cur_amt2 = "s_ttl_trd_cur_amt2";
	/**
	 *  取引通貨税額文字列.<p>
	 *
	 */
	public static final String $s_ttl_trd_cur_tax_amt2 = "s_ttl_trd_cur_tax_amt2";
	/**
	 *  為替計算取引通貨税額.<p>
	 *
	 */
	public static final String $ttl_ex_trd_cur_tax_amt = "ttl_ex_trd_cur_tax_amt";
	/**
	 *  為替計算取引通貨税額文字列.<p>
	 *
	 */
	public static final String $s_ttl_ex_trd_cur_tax_amt = "s_ttl_ex_trd_cur_tax_amt";
	/**
	 *  取引通貨名.<p>
	 *
	 */
	public static final String $trd_cur_nm2 = "trd_cur_nm2";
	/**
	 *  基準通貨名.<p>
	 *
	 */
	public static final String $base_cur_nm = "base_cur_nm";


	public static final MCMeta print_hm_META = createCommonMeta($print_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta formtitle_META = createStringMeta($formtitle);
	public static final MCMeta formtitle2_META = createStringMeta($formtitle2);
	public static final MCMeta trd_nm_META = createCommonMeta($trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta slip_sts_typ_nm_META = createCommonMeta($slip_sts_typ_nm, mcframe.commonMA.meta.MA_META.SLIP_STS_TYP_NM);
	public static final MCMeta slip_sts_typ_META = createCommonMeta($slip_sts_typ, mcframe.commonMA.meta.MA_META.SLIP_STS_TYP);
	public static final MCMeta adjst_slip_flg_META = createCommonMeta($adjst_slip_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta s_schd_META = createStringMeta($s_schd);
	public static final MCMeta dlv_slip_no_META = createCommonMeta($dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta dlv_slip_rev_META = createCommonMeta($dlv_slip_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta dlv_slip_seq_META = createCommonMeta($dlv_slip_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta dlv_slip_seq_view_META = createCommonMeta($dlv_slip_seq_view, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta ship_dlv_slip_no_META = createCommonMeta($ship_dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta lg_grp_nm_META = createCommonMeta($lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta ship_dt_META = createCommonMeta($ship_dt, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta ship_tm_META = createCommonMeta($ship_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta cst_nm_META = createCommonMeta($cst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dlv_dt_META = createCommonMeta($dlv_dt, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta dlv_tm_META = createCommonMeta($dlv_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta dlv_rqst_dt_META = createCommonMeta($dlv_rqst_dt, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta dlv_rqst_tm_META = createCommonMeta($dlv_rqst_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta slo_co_cd_META = createCommonMeta($slo_co_cd, mcframe.commonMS.meta.MS_META.DLV_BP_CD);
	public static final MCMeta slo_std_co_cd_META = createCommonMeta($slo_std_co_cd, mcframe.commonMA.meta.MA_META.STD_CO_CD);
	public static final MCMeta slo_co_nm_META = createCommonMeta($slo_co_nm, mcframe.commonMS.meta.MS_META.DLV_BP_NM);
	public static final MCMeta biz_co_no_META = createCommonMeta($biz_co_no, mcframe.commonMA.meta.MA_META.BIZ_CO_NO);
	public static final MCMeta slo_co_alt_nm1_META = createCommonMeta($slo_co_alt_nm1, mcframe.commonMA.meta.MA_META.BP_ALT_NM1);
	public static final MCMeta slo_co_alt_nm2_META = createCommonMeta($slo_co_alt_nm2, mcframe.commonMA.meta.MA_META.BP_ALT_NM2);
	public static final MCMeta slo_co_alt_nm3_META = createCommonMeta($slo_co_alt_nm3, mcframe.commonMA.meta.MA_META.BP_ALT_NM3);
	public static final MCMeta slo_co_alt_nm4_META = createCommonMeta($slo_co_alt_nm4, mcframe.commonMA.meta.MA_META.BP_ALT_NM4);
	public static final MCMeta slo_co_zip_cd_META = createCommonMeta($slo_co_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta slo_co_addr1_META = createCommonMeta($slo_co_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta slo_co_addr2_META = createCommonMeta($slo_co_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta slo_co_addr3_META = createCommonMeta($slo_co_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta slo_co_addr4_META = createCommonMeta($slo_co_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta slo_co_addr_META = createStringMeta($slo_co_addr);
	public static final MCMeta slo_co_tel_META = createCommonMeta($slo_co_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta slo_co_fax_META = createCommonMeta($slo_co_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta slo_co_cntry_nm_META = createCommonMeta($slo_co_cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta dpt_nm_META = createCommonMeta($dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta usr_nm_META = createCommonMeta($usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta usr_cd_META = createCommonMeta($usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta po_co_cd_META = createCommonMeta($po_co_cd, mcframe.commonMS.meta.MS_META.DLV_BP_CD);
	public static final MCMeta po_co_nm_META = createCommonMeta($po_co_nm, mcframe.commonMS.meta.MS_META.DLV_BP_NM);
	public static final MCMeta po_co_alt_nm1_META = createCommonMeta($po_co_alt_nm1, mcframe.commonMA.meta.MA_META.BP_ALT_NM1);
	public static final MCMeta po_co_alt_nm2_META = createCommonMeta($po_co_alt_nm2, mcframe.commonMA.meta.MA_META.BP_ALT_NM2);
	public static final MCMeta po_co_alt_nm3_META = createCommonMeta($po_co_alt_nm3, mcframe.commonMA.meta.MA_META.BP_ALT_NM3);
	public static final MCMeta po_co_alt_nm4_META = createCommonMeta($po_co_alt_nm4, mcframe.commonMA.meta.MA_META.BP_ALT_NM4);
	public static final MCMeta po_co_zip_cd_META = createCommonMeta($po_co_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta po_co_addr1_META = createCommonMeta($po_co_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta po_co_addr2_META = createCommonMeta($po_co_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta po_co_addr3_META = createCommonMeta($po_co_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta po_co_addr4_META = createCommonMeta($po_co_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta po_co_addr_META = createStringMeta($po_co_addr);
	public static final MCMeta po_co_tel_META = createCommonMeta($po_co_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta po_co_fax_META = createCommonMeta($po_co_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta po_co_cntct_dpt_META = createCommonMeta($po_co_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta po_co_cntct_psn_META = createCommonMeta($po_co_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta po_co_cntct_psn_title_META = createCommonMeta($po_co_cntct_psn_title, mcframe.commonMA.meta.MA_META.BP_PSN_TITLE);
	public static final MCMeta po_co_cntry_nm_META = createCommonMeta($po_co_cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta dlv_id_typ_META = createCommonMeta($dlv_id_typ, mcframe.commonMS.meta.MS_META.DLV_ID_TYP);
	public static final MCMeta dlv_id_nm_META = createCommonMeta($dlv_id_nm, mcframe.commonMS.meta.MS_META.DLV_ID_NM);
	public static final MCMeta dlv_id_alt_nm1_META = createCommonMeta($dlv_id_alt_nm1, mcframe.commonMA.meta.MA_META.BP_ALT_NM1);
	public static final MCMeta dlv_id_alt_nm2_META = createCommonMeta($dlv_id_alt_nm2, mcframe.commonMA.meta.MA_META.BP_ALT_NM2);
	public static final MCMeta dlv_id_alt_nm3_META = createCommonMeta($dlv_id_alt_nm3, mcframe.commonMA.meta.MA_META.BP_ALT_NM3);
	public static final MCMeta dlv_id_alt_nm4_META = createCommonMeta($dlv_id_alt_nm4, mcframe.commonMA.meta.MA_META.BP_ALT_NM4);
	public static final MCMeta dlv_id_cd_META = createCommonMeta($dlv_id_cd, mcframe.commonMS.meta.MS_META.DLV_ID_CD);
	public static final MCMeta dlv_zip_cd_META = createCommonMeta($dlv_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta dlv_addr1_META = createCommonMeta($dlv_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta dlv_addr2_META = createCommonMeta($dlv_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta dlv_addr3_META = createCommonMeta($dlv_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta dlv_addr4_META = createCommonMeta($dlv_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta dlv_addr_META = createStringMeta($dlv_addr);
	public static final MCMeta dlv_tel_META = createCommonMeta($dlv_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta dlv_fax_META = createCommonMeta($dlv_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta dlv_cntct_dpt_META = createCommonMeta($dlv_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta dlv_cntct_psn_META = createCommonMeta($dlv_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta dlv_cntct_psn_title_META = createCommonMeta($dlv_cntct_psn_title, mcframe.commonMA.meta.MA_META.BP_PSN_TITLE);
	public static final MCMeta dlv_cntry_nm_META = createCommonMeta($dlv_cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta dlv_slip_po_no_lbl_META = createStringMeta($dlv_slip_po_no_lbl);
	public static final MCMeta dlv_slip_po_no_META = createCommonMeta($dlv_slip_po_no, mcframe.commonMS.meta.MS_META.DLV_SLIP_PO_NO);
	public static final MCMeta eiaj_dlv_slip_po_no_META = createCommonMeta($eiaj_dlv_slip_po_no, mcframe.commonMS.meta.MS_META.DLV_SLIP_PO_NO);
	public static final MCMeta ttl_trd_cur_tax_amt_META = createCommonMeta($ttl_trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_ttl_trd_cur_tax_amt_META = createStringMeta($s_ttl_trd_cur_tax_amt);
	public static final MCMeta ttl_trd_cur_amt_META = createCommonMeta($ttl_trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_ttl_trd_cur_amt_META = createStringMeta($s_ttl_trd_cur_amt);
	public static final MCMeta ttl_trd_cur_tax_in_amt_META = createCommonMeta($ttl_trd_cur_tax_in_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_ttl_trd_cur_tax_in_amt_META = createStringMeta($s_ttl_trd_cur_tax_in_amt);
	public static final MCMeta ttl_trd_cur_dscnt_amt_META = createCommonMeta($ttl_trd_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_ttl_trd_cur_dscnt_amt_META = createStringMeta($s_ttl_trd_cur_dscnt_amt);
	public static final MCMeta dlv_slip_act_no_META = createCommonMeta($dlv_slip_act_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_ACT_NO);
	public static final MCMeta trd_rmrks_META = createCommonMeta($trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta po_trd_rmrks_META = createCommonMeta($po_trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta po_sub_char1_META = createCommonMeta($po_sub_char1, mcframe.commonMS.meta.MS_META.PO_SUB_CHAR1);
	public static final MCMeta po_sub_char2_META = createCommonMeta($po_sub_char2, mcframe.commonMS.meta.MS_META.PO_SUB_CHAR2);
	public static final MCMeta po_sub_char3_META = createCommonMeta($po_sub_char3, mcframe.commonMS.meta.MS_META.PO_SUB_CHAR3);
	public static final MCMeta dlv_slip_sub_char1_META = createCommonMeta($dlv_slip_sub_char1, mcframe.commonMS.meta.MS_META.DLV_SLIP_SUB_CHAR1);
	public static final MCMeta dlv_slip_sub_char2_META = createCommonMeta($dlv_slip_sub_char2, mcframe.commonMS.meta.MS_META.DLV_SLIP_SUB_CHAR2);
	public static final MCMeta dlv_slip_sub_char3_META = createCommonMeta($dlv_slip_sub_char3, mcframe.commonMS.meta.MS_META.DLV_SLIP_SUB_CHAR3);
	public static final MCMeta b_eiaj1_META = createCommonMeta($b_eiaj1, mcframe.commonMS.meta.MS_META.B_EIAJ1);
	public static final MCMeta b_eiaj2_META = createCommonMeta($b_eiaj2, mcframe.commonMS.meta.MS_META.B_EIAJ2);
	public static final MCMeta b_eiaj3_META = createCommonMeta($b_eiaj3, mcframe.commonMS.meta.MS_META.B_EIAJ3);
	public static final MCMeta b_eiaj4_META = createCommonMeta($b_eiaj4, mcframe.commonMS.meta.MS_META.B_EIAJ4);
	public static final MCMeta eiaj_b_slo_po_qty_META = createCommonMeta($eiaj_b_slo_po_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_eiaj_b_slo_po_qty_META = createStringMeta($s_eiaj_b_slo_po_qty);
	public static final MCMeta dlv_lbl_META = createStringMeta($dlv_lbl);
	public static final MCMeta ship_dt_lbl_META = createStringMeta($ship_dt_lbl);
	public static final MCMeta dlv_dt_lbl_META = createStringMeta($dlv_dt_lbl);
	public static final MCMeta lg_grp_lbl_META = createStringMeta($lg_grp_lbl);
	public static final MCMeta cst_lbl_META = createStringMeta($cst_lbl);
	public static final MCMeta ship_dlv_slip_no_lbl_META = createStringMeta($ship_dlv_slip_no_lbl);
	public static final MCMeta prov_flg_META = createCommonMeta($prov_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_flg_META = createCommonMeta($sls_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta xrate_lbl_META = createStringMeta($xrate_lbl);
	public static final MCMeta xrate_META = createCommonMeta($xrate, mcframe.commonMA.meta.MA_META.XRATE);
	public static final MCMeta tax_rate_lbl_META = createStringMeta($tax_rate_lbl);
	public static final MCMeta s_ttl_trd_cur_dscnt_amt2_META = createStringMeta($s_ttl_trd_cur_dscnt_amt2);
	public static final MCMeta s_ttl_trd_cur_amt2_META = createStringMeta($s_ttl_trd_cur_amt2);
	public static final MCMeta s_ttl_trd_cur_tax_amt2_META = createStringMeta($s_ttl_trd_cur_tax_amt2);
	public static final MCMeta ttl_ex_trd_cur_tax_amt_META = createCommonMeta($ttl_ex_trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_ttl_ex_trd_cur_tax_amt_META = createStringMeta($s_ttl_ex_trd_cur_tax_amt);
	public static final MCMeta trd_cur_nm2_META = createCommonMeta($trd_cur_nm2, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta base_cur_nm_META = createCommonMeta($base_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);

	protected static final ConstMetaList<DlvSlipHdrR> constMetas = new ConstMetaList<DlvSlipHdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			print_hm_META,
			formtitle_META,
			formtitle2_META,
			trd_nm_META,
			trd_cd_META,
			trd_ptn_typ_META,
			slip_sts_typ_nm_META,
			slip_sts_typ_META,
			adjst_slip_flg_META,
			s_schd_META,
			dlv_slip_no_META,
			dlv_slip_rev_META,
			dlv_slip_seq_META,
			dlv_slip_seq_view_META,
			ship_dlv_slip_no_META,
			lg_grp_nm_META,
			ship_dt_META,
			ship_tm_META,
			cst_nm_META,
			dlv_dt_META,
			dlv_tm_META,
			dlv_rqst_dt_META,
			dlv_rqst_tm_META,
			ac_dt_META,
			trd_cur_cd_META,
			trd_cur_nm_META,
			slo_co_cd_META,
			slo_std_co_cd_META,
			slo_co_nm_META,
			biz_co_no_META,
			slo_co_alt_nm1_META,
			slo_co_alt_nm2_META,
			slo_co_alt_nm3_META,
			slo_co_alt_nm4_META,
			slo_co_zip_cd_META,
			slo_co_addr1_META,
			slo_co_addr2_META,
			slo_co_addr3_META,
			slo_co_addr4_META,
			slo_co_addr_META,
			slo_co_tel_META,
			slo_co_fax_META,
			slo_co_cntry_nm_META,
			dpt_nm_META,
			dpt_cd_META,
			usr_nm_META,
			usr_cd_META,
			po_co_cd_META,
			po_co_nm_META,
			po_co_alt_nm1_META,
			po_co_alt_nm2_META,
			po_co_alt_nm3_META,
			po_co_alt_nm4_META,
			po_co_zip_cd_META,
			po_co_addr1_META,
			po_co_addr2_META,
			po_co_addr3_META,
			po_co_addr4_META,
			po_co_addr_META,
			po_co_tel_META,
			po_co_fax_META,
			po_co_cntct_dpt_META,
			po_co_cntct_psn_META,
			po_co_cntct_psn_title_META,
			po_co_cntry_nm_META,
			dlv_id_typ_META,
			dlv_id_nm_META,
			dlv_id_alt_nm1_META,
			dlv_id_alt_nm2_META,
			dlv_id_alt_nm3_META,
			dlv_id_alt_nm4_META,
			dlv_id_cd_META,
			dlv_zip_cd_META,
			dlv_addr1_META,
			dlv_addr2_META,
			dlv_addr3_META,
			dlv_addr4_META,
			dlv_addr_META,
			dlv_tel_META,
			dlv_fax_META,
			dlv_cntct_dpt_META,
			dlv_cntct_psn_META,
			dlv_cntct_psn_title_META,
			dlv_cntry_nm_META,
			dlv_slip_po_no_lbl_META,
			dlv_slip_po_no_META,
			eiaj_dlv_slip_po_no_META,
			ttl_trd_cur_tax_amt_META,
			s_ttl_trd_cur_tax_amt_META,
			ttl_trd_cur_amt_META,
			s_ttl_trd_cur_amt_META,
			ttl_trd_cur_tax_in_amt_META,
			s_ttl_trd_cur_tax_in_amt_META,
			ttl_trd_cur_dscnt_amt_META,
			s_ttl_trd_cur_dscnt_amt_META,
			dlv_slip_act_no_META,
			trd_rmrks_META,
			po_trd_rmrks_META,
			po_sub_char1_META,
			po_sub_char2_META,
			po_sub_char3_META,
			dlv_slip_sub_char1_META,
			dlv_slip_sub_char2_META,
			dlv_slip_sub_char3_META,
			b_eiaj1_META,
			b_eiaj2_META,
			b_eiaj3_META,
			b_eiaj4_META,
			eiaj_b_slo_po_qty_META,
			s_eiaj_b_slo_po_qty_META,
			dlv_lbl_META,
			ship_dt_lbl_META,
			dlv_dt_lbl_META,
			lg_grp_lbl_META,
			cst_lbl_META,
			ship_dlv_slip_no_lbl_META,
			prov_flg_META,
			sls_flg_META,
			xrate_lbl_META,
			xrate_META,
			tax_rate_lbl_META,
			s_ttl_trd_cur_dscnt_amt2_META,
			s_ttl_trd_cur_amt2_META,
			s_ttl_trd_cur_tax_amt2_META,
			ttl_ex_trd_cur_tax_amt_META,
			s_ttl_ex_trd_cur_tax_amt_META,
			trd_cur_nm2_META,
			base_cur_nm_META
		},
		new String[][]{
			{
			},
			{
			}
		}
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
	 * コンストラクタです。
	 */
	protected DlvSlipHdrR_MC_A(ConstMetaList<? extends DlvSlipHdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DlvSlipHdrR clone() {
		return (DlvSlipHdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DlvSlipHdrR createInstance() {
		return (DlvSlipHdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DlvSlipHdrR getValues(String... names) {
		return (DlvSlipHdrR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  発行.<p>
	 *
	 */
	public MCDate print_hm() {
		return getConstDate(offset + 0, $print_hm);
	}

	/**
	 *  発行.<p>
	 *
	 */
	public void print_hm(MCDate value) {
		setConstDate(offset + 0, $print_hm, value);
	}


	/**
	 *  帳票タイトル名.<p>
	 *
	 */
	public String formtitle() {
		return getConstString(offset + 1, $formtitle);
	}

	/**
	 *  帳票タイトル名.<p>
	 *
	 */
	public void formtitle(String value) {
		setConstString(offset + 1, $formtitle, value);
	}


	/**
	 *  帳票タイトル名２.<p>
	 *
	 */
	public String formtitle2() {
		return getConstString(offset + 2, $formtitle2);
	}

	/**
	 *  帳票タイトル名２.<p>
	 *
	 */
	public void formtitle2(String value) {
		setConstString(offset + 2, $formtitle2, value);
	}


	/**
	 *  取引.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 3, $trd_nm);
	}

	/**
	 *  取引.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 3, $trd_nm, value);
	}


	/**
	 *  取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 4, $trd_cd);
	}

	/**
	 *  取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 4, $trd_cd, value);
	}


	/**
	 *  取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 5, $trd_ptn_typ);
	}

	/**
	 *  取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 5, $trd_ptn_typ, value);
	}


	/**
	 *  伝票状況区分.<p>
	 *
	 */
	public String slip_sts_typ_nm() {
		return getConstString(offset + 6, $slip_sts_typ_nm);
	}

	/**
	 *  伝票状況区分.<p>
	 *
	 */
	public void slip_sts_typ_nm(String value) {
		setConstString(offset + 6, $slip_sts_typ_nm, value);
	}


	/**
	 *  伝票状況区分名.<p>
	 *
	 */
	public String slip_sts_typ() {
		return getConstString(offset + 7, $slip_sts_typ);
	}

	/**
	 *  伝票状況区分名.<p>
	 *
	 */
	public void slip_sts_typ(String value) {
		setConstString(offset + 7, $slip_sts_typ, value);
	}


	/**
	 *  調整伝票ＦＬＧ.<p>
	 *
	 */
	public boolean adjst_slip_flg() {
		return getConstBoolean(offset + 8, $adjst_slip_flg);
	}

	/**
	 *  調整伝票ＦＬＧ.<p>
	 *
	 */
	public void adjst_slip_flg(boolean value) {
		setConstBoolean(offset + 8, $adjst_slip_flg, value);
	}


	/**
	 *  予定文字列.<p>
	 *
	 */
	public String s_schd() {
		return getConstString(offset + 9, $s_schd);
	}

	/**
	 *  予定文字列.<p>
	 *
	 */
	public void s_schd(String value) {
		setConstString(offset + 9, $s_schd, value);
	}


	/**
	 *  納品書Ｎｏ.<p>
	 *
	 */
	public String dlv_slip_no() {
		return getConstString(offset + 10, $dlv_slip_no);
	}

	/**
	 *  納品書Ｎｏ.<p>
	 *
	 */
	public void dlv_slip_no(String value) {
		setConstString(offset + 10, $dlv_slip_no, value);
	}


	/**
	 *  納品書リビジョン.<p>
	 *
	 */
	public MCNumber dlv_slip_rev() {
		return getConstNumber(offset + 11, $dlv_slip_rev);
	}

	/**
	 *  納品書リビジョン.<p>
	 *
	 */
	public void dlv_slip_rev(MCNumber value) {
		setConstNumber(offset + 11, $dlv_slip_rev, value);
	}

	/**
	 *  納品書リビジョン.<p>
	 *
	 */
	public void dlv_slip_rev(int value) {
		setConstNumber(offset + 11, $dlv_slip_rev, value);
	}

	/**
	 *  納品書リビジョン.<p>
	 *
	 */
	public void dlv_slip_rev(long value) {
		setConstNumber(offset + 11, $dlv_slip_rev, value);
	}

	/**
	 *  納品書リビジョン.<p>
	 *
	 */
	public void dlv_slip_rev(float value) {
		setConstNumber(offset + 11, $dlv_slip_rev, value);
	}

	/**
	 *  納品書リビジョン.<p>
	 *
	 */
	public void dlv_slip_rev(double value) {
		setConstNumber(offset + 11, $dlv_slip_rev, value);
	}


	/**
	 *  納品書連番（データ用）.<p>
	 *
	 */
	public MCNumber dlv_slip_seq() {
		return getConstNumber(offset + 12, $dlv_slip_seq);
	}

	/**
	 *  納品書連番（データ用）.<p>
	 *
	 */
	public void dlv_slip_seq(MCNumber value) {
		setConstNumber(offset + 12, $dlv_slip_seq, value);
	}

	/**
	 *  納品書連番（データ用）.<p>
	 *
	 */
	public void dlv_slip_seq(int value) {
		setConstNumber(offset + 12, $dlv_slip_seq, value);
	}

	/**
	 *  納品書連番（データ用）.<p>
	 *
	 */
	public void dlv_slip_seq(long value) {
		setConstNumber(offset + 12, $dlv_slip_seq, value);
	}

	/**
	 *  納品書連番（データ用）.<p>
	 *
	 */
	public void dlv_slip_seq(float value) {
		setConstNumber(offset + 12, $dlv_slip_seq, value);
	}

	/**
	 *  納品書連番（データ用）.<p>
	 *
	 */
	public void dlv_slip_seq(double value) {
		setConstNumber(offset + 12, $dlv_slip_seq, value);
	}


	/**
	 *  納品書連番（表示用）.<p>
	 *
	 */
	public MCNumber dlv_slip_seq_view() {
		return getConstNumber(offset + 13, $dlv_slip_seq_view);
	}

	/**
	 *  納品書連番（表示用）.<p>
	 *
	 */
	public void dlv_slip_seq_view(MCNumber value) {
		setConstNumber(offset + 13, $dlv_slip_seq_view, value);
	}

	/**
	 *  納品書連番（表示用）.<p>
	 *
	 */
	public void dlv_slip_seq_view(int value) {
		setConstNumber(offset + 13, $dlv_slip_seq_view, value);
	}

	/**
	 *  納品書連番（表示用）.<p>
	 *
	 */
	public void dlv_slip_seq_view(long value) {
		setConstNumber(offset + 13, $dlv_slip_seq_view, value);
	}

	/**
	 *  納品書連番（表示用）.<p>
	 *
	 */
	public void dlv_slip_seq_view(float value) {
		setConstNumber(offset + 13, $dlv_slip_seq_view, value);
	}

	/**
	 *  納品書連番（表示用）.<p>
	 *
	 */
	public void dlv_slip_seq_view(double value) {
		setConstNumber(offset + 13, $dlv_slip_seq_view, value);
	}


	/**
	 *  出荷時納品書ＮＯ.<p>
	 *
	 */
	public String ship_dlv_slip_no() {
		return getConstString(offset + 14, $ship_dlv_slip_no);
	}

	/**
	 *  出荷時納品書ＮＯ.<p>
	 *
	 */
	public void ship_dlv_slip_no(String value) {
		setConstString(offset + 14, $ship_dlv_slip_no, value);
	}


	/**
	 *  出荷元物流グループ名.<p>
	 *
	 */
	public String lg_grp_nm() {
		return getConstString(offset + 15, $lg_grp_nm);
	}

	/**
	 *  出荷元物流グループ名.<p>
	 *
	 */
	public void lg_grp_nm(String value) {
		setConstString(offset + 15, $lg_grp_nm, value);
	}


	/**
	 *  出荷日.<p>
	 *
	 */
	public MCDate ship_dt() {
		return getConstDate(offset + 16, $ship_dt);
	}

	/**
	 *  出荷日.<p>
	 *
	 */
	public void ship_dt(MCDate value) {
		setConstDate(offset + 16, $ship_dt, value);
	}


	/**
	 *  出荷時刻.<p>
	 *
	 */
	public MCDate ship_tm() {
		return getConstDate(offset + 17, $ship_tm);
	}

	/**
	 *  出荷時刻.<p>
	 *
	 */
	public void ship_tm(MCDate value) {
		setConstDate(offset + 17, $ship_tm, value);
	}


	/**
	 *  得意先名.<p>
	 *
	 */
	public String cst_nm() {
		return getConstString(offset + 18, $cst_nm);
	}

	/**
	 *  得意先名.<p>
	 *
	 */
	public void cst_nm(String value) {
		setConstString(offset + 18, $cst_nm, value);
	}


	/**
	 *  納品日.<p>
	 *
	 */
	public MCDate dlv_dt() {
		return getConstDate(offset + 19, $dlv_dt);
	}

	/**
	 *  納品日.<p>
	 *
	 */
	public void dlv_dt(MCDate value) {
		setConstDate(offset + 19, $dlv_dt, value);
	}


	/**
	 *  納品時刻.<p>
	 *
	 */
	public MCDate dlv_tm() {
		return getConstDate(offset + 20, $dlv_tm);
	}

	/**
	 *  納品時刻.<p>
	 *
	 */
	public void dlv_tm(MCDate value) {
		setConstDate(offset + 20, $dlv_tm, value);
	}


	/**
	 *  納入希望日.<p>
	 *
	 */
	public MCDate dlv_rqst_dt() {
		return getConstDate(offset + 21, $dlv_rqst_dt);
	}

	/**
	 *  納入希望日.<p>
	 *
	 */
	public void dlv_rqst_dt(MCDate value) {
		setConstDate(offset + 21, $dlv_rqst_dt, value);
	}


	/**
	 *  納入希望時刻.<p>
	 *
	 */
	public MCDate dlv_rqst_tm() {
		return getConstDate(offset + 22, $dlv_rqst_tm);
	}

	/**
	 *  納入希望時刻.<p>
	 *
	 */
	public void dlv_rqst_tm(MCDate value) {
		setConstDate(offset + 22, $dlv_rqst_tm, value);
	}


	/**
	 *  計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 23, $ac_dt);
	}

	/**
	 *  計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 23, $ac_dt, value);
	}


	/**
	 *  取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 24, $trd_cur_cd);
	}

	/**
	 *  取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 24, $trd_cur_cd, value);
	}


	/**
	 *  取引通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 25, $trd_cur_nm);
	}

	/**
	 *  取引通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 25, $trd_cur_nm, value);
	}


	/**
	 *  受注者ＣＤ.<p>
	 *
	 */
	public String slo_co_cd() {
		return getConstString(offset + 26, $slo_co_cd);
	}

	/**
	 *  受注者ＣＤ.<p>
	 *
	 */
	public void slo_co_cd(String value) {
		setConstString(offset + 26, $slo_co_cd, value);
	}


	/**
	 *  受注者標準企業ＣＤ.<p>
	 *
	 */
	public String slo_std_co_cd() {
		return getConstString(offset + 27, $slo_std_co_cd);
	}

	/**
	 *  受注者標準企業ＣＤ.<p>
	 *
	 */
	public void slo_std_co_cd(String value) {
		setConstString(offset + 27, $slo_std_co_cd, value);
	}


	/**
	 *  受注者名.<p>
	 *
	 */
	public String slo_co_nm() {
		return getConstString(offset + 28, $slo_co_nm);
	}

	/**
	 *  受注者名.<p>
	 *
	 */
	public void slo_co_nm(String value) {
		setConstString(offset + 28, $slo_co_nm, value);
	}


	/**
	 *  事業者番号.<p>
	 *
	 */
	public String biz_co_no() {
		return getConstString(offset + 29, $biz_co_no);
	}

	/**
	 *  事業者番号.<p>
	 *
	 */
	public void biz_co_no(String value) {
		setConstString(offset + 29, $biz_co_no, value);
	}


	/**
	 *  受注者別名１.<p>
	 *
	 */
	public String slo_co_alt_nm1() {
		return getConstString(offset + 30, $slo_co_alt_nm1);
	}

	/**
	 *  受注者別名１.<p>
	 *
	 */
	public void slo_co_alt_nm1(String value) {
		setConstString(offset + 30, $slo_co_alt_nm1, value);
	}


	/**
	 *  受注者別名２.<p>
	 *
	 */
	public String slo_co_alt_nm2() {
		return getConstString(offset + 31, $slo_co_alt_nm2);
	}

	/**
	 *  受注者別名２.<p>
	 *
	 */
	public void slo_co_alt_nm2(String value) {
		setConstString(offset + 31, $slo_co_alt_nm2, value);
	}


	/**
	 *  受注者別名３.<p>
	 *
	 */
	public String slo_co_alt_nm3() {
		return getConstString(offset + 32, $slo_co_alt_nm3);
	}

	/**
	 *  受注者別名３.<p>
	 *
	 */
	public void slo_co_alt_nm3(String value) {
		setConstString(offset + 32, $slo_co_alt_nm3, value);
	}


	/**
	 *  受注者別名４.<p>
	 *
	 */
	public String slo_co_alt_nm4() {
		return getConstString(offset + 33, $slo_co_alt_nm4);
	}

	/**
	 *  受注者別名４.<p>
	 *
	 */
	public void slo_co_alt_nm4(String value) {
		setConstString(offset + 33, $slo_co_alt_nm4, value);
	}


	/**
	 *  受注者郵便番号.<p>
	 *
	 */
	public String slo_co_zip_cd() {
		return getConstString(offset + 34, $slo_co_zip_cd);
	}

	/**
	 *  受注者郵便番号.<p>
	 *
	 */
	public void slo_co_zip_cd(String value) {
		setConstString(offset + 34, $slo_co_zip_cd, value);
	}


	/**
	 *  受注者住所１.<p>
	 *
	 */
	public String slo_co_addr1() {
		return getConstString(offset + 35, $slo_co_addr1);
	}

	/**
	 *  受注者住所１.<p>
	 *
	 */
	public void slo_co_addr1(String value) {
		setConstString(offset + 35, $slo_co_addr1, value);
	}


	/**
	 *  受注者住所２.<p>
	 *
	 */
	public String slo_co_addr2() {
		return getConstString(offset + 36, $slo_co_addr2);
	}

	/**
	 *  受注者住所２.<p>
	 *
	 */
	public void slo_co_addr2(String value) {
		setConstString(offset + 36, $slo_co_addr2, value);
	}


	/**
	 *  受注者住所３.<p>
	 *
	 */
	public String slo_co_addr3() {
		return getConstString(offset + 37, $slo_co_addr3);
	}

	/**
	 *  受注者住所３.<p>
	 *
	 */
	public void slo_co_addr3(String value) {
		setConstString(offset + 37, $slo_co_addr3, value);
	}


	/**
	 *  受注者住所４.<p>
	 *
	 */
	public String slo_co_addr4() {
		return getConstString(offset + 38, $slo_co_addr4);
	}

	/**
	 *  受注者住所４.<p>
	 *
	 */
	public void slo_co_addr4(String value) {
		setConstString(offset + 38, $slo_co_addr4, value);
	}


	/**
	 *  受注者住所１－４.<p>
	 *
	 */
	public String slo_co_addr() {
		return getConstString(offset + 39, $slo_co_addr);
	}

	/**
	 *  受注者住所１－４.<p>
	 *
	 */
	public void slo_co_addr(String value) {
		setConstString(offset + 39, $slo_co_addr, value);
	}


	/**
	 *  受注者ＴＥＬ.<p>
	 *
	 */
	public String slo_co_tel() {
		return getConstString(offset + 40, $slo_co_tel);
	}

	/**
	 *  受注者ＴＥＬ.<p>
	 *
	 */
	public void slo_co_tel(String value) {
		setConstString(offset + 40, $slo_co_tel, value);
	}


	/**
	 *  受注者ＦＡＸ.<p>
	 *
	 */
	public String slo_co_fax() {
		return getConstString(offset + 41, $slo_co_fax);
	}

	/**
	 *  受注者ＦＡＸ.<p>
	 *
	 */
	public void slo_co_fax(String value) {
		setConstString(offset + 41, $slo_co_fax, value);
	}


	/**
	 *  受注者国名.<p>
	 *
	 */
	public String slo_co_cntry_nm() {
		return getConstString(offset + 42, $slo_co_cntry_nm);
	}

	/**
	 *  受注者国名.<p>
	 *
	 */
	public void slo_co_cntry_nm(String value) {
		setConstString(offset + 42, $slo_co_cntry_nm, value);
	}


	/**
	 *  部門.<p>
	 *
	 */
	public String dpt_nm() {
		return getConstString(offset + 43, $dpt_nm);
	}

	/**
	 *  部門.<p>
	 *
	 */
	public void dpt_nm(String value) {
		setConstString(offset + 43, $dpt_nm, value);
	}


	/**
	 *  部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 44, $dpt_cd);
	}

	/**
	 *  部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 44, $dpt_cd, value);
	}


	/**
	 *  担当者.<p>
	 *
	 */
	public String usr_nm() {
		return getConstString(offset + 45, $usr_nm);
	}

	/**
	 *  担当者.<p>
	 *
	 */
	public void usr_nm(String value) {
		setConstString(offset + 45, $usr_nm, value);
	}


	/**
	 *  担当者ＣＤ.<p>
	 *
	 */
	public String usr_cd() {
		return getConstString(offset + 46, $usr_cd);
	}

	/**
	 *  担当者ＣＤ.<p>
	 *
	 */
	public void usr_cd(String value) {
		setConstString(offset + 46, $usr_cd, value);
	}


	/**
	 *  発注者ＣＤ.<p>
	 *
	 */
	public String po_co_cd() {
		return getConstString(offset + 47, $po_co_cd);
	}

	/**
	 *  発注者ＣＤ.<p>
	 *
	 */
	public void po_co_cd(String value) {
		setConstString(offset + 47, $po_co_cd, value);
	}


	/**
	 *  発注者名.<p>
	 *
	 */
	public String po_co_nm() {
		return getConstString(offset + 48, $po_co_nm);
	}

	/**
	 *  発注者名.<p>
	 *
	 */
	public void po_co_nm(String value) {
		setConstString(offset + 48, $po_co_nm, value);
	}


	/**
	 *  発注者別名１.<p>
	 *
	 */
	public String po_co_alt_nm1() {
		return getConstString(offset + 49, $po_co_alt_nm1);
	}

	/**
	 *  発注者別名１.<p>
	 *
	 */
	public void po_co_alt_nm1(String value) {
		setConstString(offset + 49, $po_co_alt_nm1, value);
	}


	/**
	 *  発注者別名２.<p>
	 *
	 */
	public String po_co_alt_nm2() {
		return getConstString(offset + 50, $po_co_alt_nm2);
	}

	/**
	 *  発注者別名２.<p>
	 *
	 */
	public void po_co_alt_nm2(String value) {
		setConstString(offset + 50, $po_co_alt_nm2, value);
	}


	/**
	 *  発注者別名３.<p>
	 *
	 */
	public String po_co_alt_nm3() {
		return getConstString(offset + 51, $po_co_alt_nm3);
	}

	/**
	 *  発注者別名３.<p>
	 *
	 */
	public void po_co_alt_nm3(String value) {
		setConstString(offset + 51, $po_co_alt_nm3, value);
	}


	/**
	 *  発注者別名４.<p>
	 *
	 */
	public String po_co_alt_nm4() {
		return getConstString(offset + 52, $po_co_alt_nm4);
	}

	/**
	 *  発注者別名４.<p>
	 *
	 */
	public void po_co_alt_nm4(String value) {
		setConstString(offset + 52, $po_co_alt_nm4, value);
	}


	/**
	 *  発注者郵便番号.<p>
	 *
	 */
	public String po_co_zip_cd() {
		return getConstString(offset + 53, $po_co_zip_cd);
	}

	/**
	 *  発注者郵便番号.<p>
	 *
	 */
	public void po_co_zip_cd(String value) {
		setConstString(offset + 53, $po_co_zip_cd, value);
	}


	/**
	 *  発注者住所１.<p>
	 *
	 */
	public String po_co_addr1() {
		return getConstString(offset + 54, $po_co_addr1);
	}

	/**
	 *  発注者住所１.<p>
	 *
	 */
	public void po_co_addr1(String value) {
		setConstString(offset + 54, $po_co_addr1, value);
	}


	/**
	 *  発注者住所２.<p>
	 *
	 */
	public String po_co_addr2() {
		return getConstString(offset + 55, $po_co_addr2);
	}

	/**
	 *  発注者住所２.<p>
	 *
	 */
	public void po_co_addr2(String value) {
		setConstString(offset + 55, $po_co_addr2, value);
	}


	/**
	 *  発注者住所３.<p>
	 *
	 */
	public String po_co_addr3() {
		return getConstString(offset + 56, $po_co_addr3);
	}

	/**
	 *  発注者住所３.<p>
	 *
	 */
	public void po_co_addr3(String value) {
		setConstString(offset + 56, $po_co_addr3, value);
	}


	/**
	 *  発注者住所４.<p>
	 *
	 */
	public String po_co_addr4() {
		return getConstString(offset + 57, $po_co_addr4);
	}

	/**
	 *  発注者住所４.<p>
	 *
	 */
	public void po_co_addr4(String value) {
		setConstString(offset + 57, $po_co_addr4, value);
	}


	/**
	 *  発注者住所１－４.<p>
	 *
	 */
	public String po_co_addr() {
		return getConstString(offset + 58, $po_co_addr);
	}

	/**
	 *  発注者住所１－４.<p>
	 *
	 */
	public void po_co_addr(String value) {
		setConstString(offset + 58, $po_co_addr, value);
	}


	/**
	 *  発注者ＴＥＬ.<p>
	 *
	 */
	public String po_co_tel() {
		return getConstString(offset + 59, $po_co_tel);
	}

	/**
	 *  発注者ＴＥＬ.<p>
	 *
	 */
	public void po_co_tel(String value) {
		setConstString(offset + 59, $po_co_tel, value);
	}


	/**
	 *  発注者ＦＡＸ.<p>
	 *
	 */
	public String po_co_fax() {
		return getConstString(offset + 60, $po_co_fax);
	}

	/**
	 *  発注者ＦＡＸ.<p>
	 *
	 */
	public void po_co_fax(String value) {
		setConstString(offset + 60, $po_co_fax, value);
	}


	/**
	 *  発注者担当部署.<p>
	 *
	 */
	public String po_co_cntct_dpt() {
		return getConstString(offset + 61, $po_co_cntct_dpt);
	}

	/**
	 *  発注者担当部署.<p>
	 *
	 */
	public void po_co_cntct_dpt(String value) {
		setConstString(offset + 61, $po_co_cntct_dpt, value);
	}


	/**
	 *  発注者担当者.<p>
	 *
	 */
	public String po_co_cntct_psn() {
		return getConstString(offset + 62, $po_co_cntct_psn);
	}

	/**
	 *  発注者担当者.<p>
	 *
	 */
	public void po_co_cntct_psn(String value) {
		setConstString(offset + 62, $po_co_cntct_psn, value);
	}


	/**
	 *  発注者担当者敬称.<p>
	 *
	 */
	public String po_co_cntct_psn_title() {
		return getConstString(offset + 63, $po_co_cntct_psn_title);
	}

	/**
	 *  発注者担当者敬称.<p>
	 *
	 */
	public void po_co_cntct_psn_title(String value) {
		setConstString(offset + 63, $po_co_cntct_psn_title, value);
	}


	/**
	 *  発注者国名.<p>
	 *
	 */
	public String po_co_cntry_nm() {
		return getConstString(offset + 64, $po_co_cntry_nm);
	}

	/**
	 *  発注者国名.<p>
	 *
	 */
	public void po_co_cntry_nm(String value) {
		setConstString(offset + 64, $po_co_cntry_nm, value);
	}


	/**
	 *  納品先識別区分.<p>
	 *
	 */
	public String dlv_id_typ() {
		return getConstString(offset + 65, $dlv_id_typ);
	}

	/**
	 *  納品先識別区分.<p>
	 *
	 */
	public void dlv_id_typ(String value) {
		setConstString(offset + 65, $dlv_id_typ, value);
	}


	/**
	 *  納品先識別名.<p>
	 *
	 */
	public String dlv_id_nm() {
		return getConstString(offset + 66, $dlv_id_nm);
	}

	/**
	 *  納品先識別名.<p>
	 *
	 */
	public void dlv_id_nm(String value) {
		setConstString(offset + 66, $dlv_id_nm, value);
	}


	/**
	 *  納品先識別別名１.<p>
	 *
	 */
	public String dlv_id_alt_nm1() {
		return getConstString(offset + 67, $dlv_id_alt_nm1);
	}

	/**
	 *  納品先識別別名１.<p>
	 *
	 */
	public void dlv_id_alt_nm1(String value) {
		setConstString(offset + 67, $dlv_id_alt_nm1, value);
	}


	/**
	 *  納品先識別別名２.<p>
	 *
	 */
	public String dlv_id_alt_nm2() {
		return getConstString(offset + 68, $dlv_id_alt_nm2);
	}

	/**
	 *  納品先識別別名２.<p>
	 *
	 */
	public void dlv_id_alt_nm2(String value) {
		setConstString(offset + 68, $dlv_id_alt_nm2, value);
	}


	/**
	 *  納品先識別別名３.<p>
	 *
	 */
	public String dlv_id_alt_nm3() {
		return getConstString(offset + 69, $dlv_id_alt_nm3);
	}

	/**
	 *  納品先識別別名３.<p>
	 *
	 */
	public void dlv_id_alt_nm3(String value) {
		setConstString(offset + 69, $dlv_id_alt_nm3, value);
	}


	/**
	 *  納品先識別別名４.<p>
	 *
	 */
	public String dlv_id_alt_nm4() {
		return getConstString(offset + 70, $dlv_id_alt_nm4);
	}

	/**
	 *  納品先識別別名４.<p>
	 *
	 */
	public void dlv_id_alt_nm4(String value) {
		setConstString(offset + 70, $dlv_id_alt_nm4, value);
	}


	/**
	 *  納品先識別ＣＤ.<p>
	 *
	 */
	public String dlv_id_cd() {
		return getConstString(offset + 71, $dlv_id_cd);
	}

	/**
	 *  納品先識別ＣＤ.<p>
	 *
	 */
	public void dlv_id_cd(String value) {
		setConstString(offset + 71, $dlv_id_cd, value);
	}


	/**
	 *  納品先郵便番号.<p>
	 *
	 */
	public String dlv_zip_cd() {
		return getConstString(offset + 72, $dlv_zip_cd);
	}

	/**
	 *  納品先郵便番号.<p>
	 *
	 */
	public void dlv_zip_cd(String value) {
		setConstString(offset + 72, $dlv_zip_cd, value);
	}


	/**
	 *  納品先住所１.<p>
	 *
	 */
	public String dlv_addr1() {
		return getConstString(offset + 73, $dlv_addr1);
	}

	/**
	 *  納品先住所１.<p>
	 *
	 */
	public void dlv_addr1(String value) {
		setConstString(offset + 73, $dlv_addr1, value);
	}


	/**
	 *  納品先住所２.<p>
	 *
	 */
	public String dlv_addr2() {
		return getConstString(offset + 74, $dlv_addr2);
	}

	/**
	 *  納品先住所２.<p>
	 *
	 */
	public void dlv_addr2(String value) {
		setConstString(offset + 74, $dlv_addr2, value);
	}


	/**
	 *  納品先住所３.<p>
	 *
	 */
	public String dlv_addr3() {
		return getConstString(offset + 75, $dlv_addr3);
	}

	/**
	 *  納品先住所３.<p>
	 *
	 */
	public void dlv_addr3(String value) {
		setConstString(offset + 75, $dlv_addr3, value);
	}


	/**
	 *  納品先住所４.<p>
	 *
	 */
	public String dlv_addr4() {
		return getConstString(offset + 76, $dlv_addr4);
	}

	/**
	 *  納品先住所４.<p>
	 *
	 */
	public void dlv_addr4(String value) {
		setConstString(offset + 76, $dlv_addr4, value);
	}


	/**
	 *  納品先住所１－４（データ用）.<p>
	 *
	 */
	public String dlv_addr() {
		return getConstString(offset + 77, $dlv_addr);
	}

	/**
	 *  納品先住所１－４（データ用）.<p>
	 *
	 */
	public void dlv_addr(String value) {
		setConstString(offset + 77, $dlv_addr, value);
	}


	/**
	 *  納品先ＴＥＬ.<p>
	 *
	 */
	public String dlv_tel() {
		return getConstString(offset + 78, $dlv_tel);
	}

	/**
	 *  納品先ＴＥＬ.<p>
	 *
	 */
	public void dlv_tel(String value) {
		setConstString(offset + 78, $dlv_tel, value);
	}


	/**
	 *  納品先ＦＡＸ.<p>
	 *
	 */
	public String dlv_fax() {
		return getConstString(offset + 79, $dlv_fax);
	}

	/**
	 *  納品先ＦＡＸ.<p>
	 *
	 */
	public void dlv_fax(String value) {
		setConstString(offset + 79, $dlv_fax, value);
	}


	/**
	 *  納品先部署.<p>
	 *
	 */
	public String dlv_cntct_dpt() {
		return getConstString(offset + 80, $dlv_cntct_dpt);
	}

	/**
	 *  納品先部署.<p>
	 *
	 */
	public void dlv_cntct_dpt(String value) {
		setConstString(offset + 80, $dlv_cntct_dpt, value);
	}


	/**
	 *  納品先担当者.<p>
	 *
	 */
	public String dlv_cntct_psn() {
		return getConstString(offset + 81, $dlv_cntct_psn);
	}

	/**
	 *  納品先担当者.<p>
	 *
	 */
	public void dlv_cntct_psn(String value) {
		setConstString(offset + 81, $dlv_cntct_psn, value);
	}


	/**
	 *  納品先担当者敬称.<p>
	 *
	 */
	public String dlv_cntct_psn_title() {
		return getConstString(offset + 82, $dlv_cntct_psn_title);
	}

	/**
	 *  納品先担当者敬称.<p>
	 *
	 */
	public void dlv_cntct_psn_title(String value) {
		setConstString(offset + 82, $dlv_cntct_psn_title, value);
	}


	/**
	 *  納品先国名.<p>
	 *
	 */
	public String dlv_cntry_nm() {
		return getConstString(offset + 83, $dlv_cntry_nm);
	}

	/**
	 *  納品先国名.<p>
	 *
	 */
	public void dlv_cntry_nm(String value) {
		setConstString(offset + 83, $dlv_cntry_nm, value);
	}


	/**
	 *  納品書注文ＮＯ(ラベル).<p>
	 *
	 */
	public String dlv_slip_po_no_lbl() {
		return getConstString(offset + 84, $dlv_slip_po_no_lbl);
	}

	/**
	 *  納品書注文ＮＯ(ラベル).<p>
	 *
	 */
	public void dlv_slip_po_no_lbl(String value) {
		setConstString(offset + 84, $dlv_slip_po_no_lbl, value);
	}


	/**
	 *  納品書注文ＮＯ.<p>
	 *
	 */
	public String dlv_slip_po_no() {
		return getConstString(offset + 85, $dlv_slip_po_no);
	}

	/**
	 *  納品書注文ＮＯ.<p>
	 *
	 */
	public void dlv_slip_po_no(String value) {
		setConstString(offset + 85, $dlv_slip_po_no, value);
	}


	public String eiaj_dlv_slip_po_no() {
		return getConstString(offset + 86, $eiaj_dlv_slip_po_no);
	}

	public void eiaj_dlv_slip_po_no(String value) {
		setConstString(offset + 86, $eiaj_dlv_slip_po_no, value);
	}


	/**
	 *  取引通貨税額.<p>
	 *
	 */
	public MCNumber ttl_trd_cur_tax_amt() {
		return getConstNumber(offset + 87, $ttl_trd_cur_tax_amt);
	}

	/**
	 *  取引通貨税額.<p>
	 *
	 */
	public void ttl_trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 87, $ttl_trd_cur_tax_amt, value);
	}

	/**
	 *  取引通貨税額.<p>
	 *
	 */
	public void ttl_trd_cur_tax_amt(int value) {
		setConstNumber(offset + 87, $ttl_trd_cur_tax_amt, value);
	}

	/**
	 *  取引通貨税額.<p>
	 *
	 */
	public void ttl_trd_cur_tax_amt(long value) {
		setConstNumber(offset + 87, $ttl_trd_cur_tax_amt, value);
	}

	/**
	 *  取引通貨税額.<p>
	 *
	 */
	public void ttl_trd_cur_tax_amt(float value) {
		setConstNumber(offset + 87, $ttl_trd_cur_tax_amt, value);
	}

	/**
	 *  取引通貨税額.<p>
	 *
	 */
	public void ttl_trd_cur_tax_amt(double value) {
		setConstNumber(offset + 87, $ttl_trd_cur_tax_amt, value);
	}


	/**
	 *  取引通貨税額文字列.<p>
	 *
	 */
	public String s_ttl_trd_cur_tax_amt() {
		return getConstString(offset + 88, $s_ttl_trd_cur_tax_amt);
	}

	/**
	 *  取引通貨税額文字列.<p>
	 *
	 */
	public void s_ttl_trd_cur_tax_amt(String value) {
		setConstString(offset + 88, $s_ttl_trd_cur_tax_amt, value);
	}


	/**
	 *  取引通貨金額.<p>
	 *
	 */
	public MCNumber ttl_trd_cur_amt() {
		return getConstNumber(offset + 89, $ttl_trd_cur_amt);
	}

	/**
	 *  取引通貨金額.<p>
	 *
	 */
	public void ttl_trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 89, $ttl_trd_cur_amt, value);
	}

	/**
	 *  取引通貨金額.<p>
	 *
	 */
	public void ttl_trd_cur_amt(int value) {
		setConstNumber(offset + 89, $ttl_trd_cur_amt, value);
	}

	/**
	 *  取引通貨金額.<p>
	 *
	 */
	public void ttl_trd_cur_amt(long value) {
		setConstNumber(offset + 89, $ttl_trd_cur_amt, value);
	}

	/**
	 *  取引通貨金額.<p>
	 *
	 */
	public void ttl_trd_cur_amt(float value) {
		setConstNumber(offset + 89, $ttl_trd_cur_amt, value);
	}

	/**
	 *  取引通貨金額.<p>
	 *
	 */
	public void ttl_trd_cur_amt(double value) {
		setConstNumber(offset + 89, $ttl_trd_cur_amt, value);
	}


	/**
	 *  取引通貨金額文字列.<p>
	 *
	 */
	public String s_ttl_trd_cur_amt() {
		return getConstString(offset + 90, $s_ttl_trd_cur_amt);
	}

	/**
	 *  取引通貨金額文字列.<p>
	 *
	 */
	public void s_ttl_trd_cur_amt(String value) {
		setConstString(offset + 90, $s_ttl_trd_cur_amt, value);
	}


	/**
	 *  取引通貨税込金額.<p>
	 *
	 */
	public MCNumber ttl_trd_cur_tax_in_amt() {
		return getConstNumber(offset + 91, $ttl_trd_cur_tax_in_amt);
	}

	/**
	 *  取引通貨税込金額.<p>
	 *
	 */
	public void ttl_trd_cur_tax_in_amt(MCNumber value) {
		setConstNumber(offset + 91, $ttl_trd_cur_tax_in_amt, value);
	}

	/**
	 *  取引通貨税込金額.<p>
	 *
	 */
	public void ttl_trd_cur_tax_in_amt(int value) {
		setConstNumber(offset + 91, $ttl_trd_cur_tax_in_amt, value);
	}

	/**
	 *  取引通貨税込金額.<p>
	 *
	 */
	public void ttl_trd_cur_tax_in_amt(long value) {
		setConstNumber(offset + 91, $ttl_trd_cur_tax_in_amt, value);
	}

	/**
	 *  取引通貨税込金額.<p>
	 *
	 */
	public void ttl_trd_cur_tax_in_amt(float value) {
		setConstNumber(offset + 91, $ttl_trd_cur_tax_in_amt, value);
	}

	/**
	 *  取引通貨税込金額.<p>
	 *
	 */
	public void ttl_trd_cur_tax_in_amt(double value) {
		setConstNumber(offset + 91, $ttl_trd_cur_tax_in_amt, value);
	}


	/**
	 *  取引通貨税込金額文字列.<p>
	 *
	 */
	public String s_ttl_trd_cur_tax_in_amt() {
		return getConstString(offset + 92, $s_ttl_trd_cur_tax_in_amt);
	}

	/**
	 *  取引通貨税込金額文字列.<p>
	 *
	 */
	public void s_ttl_trd_cur_tax_in_amt(String value) {
		setConstString(offset + 92, $s_ttl_trd_cur_tax_in_amt, value);
	}


	/**
	 *  取引通貨値引金額.<p>
	 *
	 */
	public MCNumber ttl_trd_cur_dscnt_amt() {
		return getConstNumber(offset + 93, $ttl_trd_cur_dscnt_amt);
	}

	/**
	 *  取引通貨値引金額.<p>
	 *
	 */
	public void ttl_trd_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 93, $ttl_trd_cur_dscnt_amt, value);
	}

	/**
	 *  取引通貨値引金額.<p>
	 *
	 */
	public void ttl_trd_cur_dscnt_amt(int value) {
		setConstNumber(offset + 93, $ttl_trd_cur_dscnt_amt, value);
	}

	/**
	 *  取引通貨値引金額.<p>
	 *
	 */
	public void ttl_trd_cur_dscnt_amt(long value) {
		setConstNumber(offset + 93, $ttl_trd_cur_dscnt_amt, value);
	}

	/**
	 *  取引通貨値引金額.<p>
	 *
	 */
	public void ttl_trd_cur_dscnt_amt(float value) {
		setConstNumber(offset + 93, $ttl_trd_cur_dscnt_amt, value);
	}

	/**
	 *  取引通貨値引金額.<p>
	 *
	 */
	public void ttl_trd_cur_dscnt_amt(double value) {
		setConstNumber(offset + 93, $ttl_trd_cur_dscnt_amt, value);
	}


	/**
	 *  取引通貨値引金額文字列.<p>
	 *
	 */
	public String s_ttl_trd_cur_dscnt_amt() {
		return getConstString(offset + 94, $s_ttl_trd_cur_dscnt_amt);
	}

	/**
	 *  取引通貨値引金額文字列.<p>
	 *
	 */
	public void s_ttl_trd_cur_dscnt_amt(String value) {
		setConstString(offset + 94, $s_ttl_trd_cur_dscnt_amt, value);
	}


	/**
	 *  実績Ｎｏ.<p>
	 *
	 */
	public String dlv_slip_act_no() {
		return getConstString(offset + 95, $dlv_slip_act_no);
	}

	/**
	 *  実績Ｎｏ.<p>
	 *
	 */
	public void dlv_slip_act_no(String value) {
		setConstString(offset + 95, $dlv_slip_act_no, value);
	}


	/**
	 *  取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return getConstString(offset + 96, $trd_rmrks);
	}

	/**
	 *  取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		setConstString(offset + 96, $trd_rmrks, value);
	}


	/**
	 *  発注者取引備考.<p>
	 *
	 */
	public String po_trd_rmrks() {
		return getConstString(offset + 97, $po_trd_rmrks);
	}

	/**
	 *  発注者取引備考.<p>
	 *
	 */
	public void po_trd_rmrks(String value) {
		setConstString(offset + 97, $po_trd_rmrks, value);
	}


	/**
	 *  発注予備１.<p>
	 *
	 */
	public String po_sub_char1() {
		return getConstString(offset + 98, $po_sub_char1);
	}

	/**
	 *  発注予備１.<p>
	 *
	 */
	public void po_sub_char1(String value) {
		setConstString(offset + 98, $po_sub_char1, value);
	}


	/**
	 *  発注予備２.<p>
	 *
	 */
	public String po_sub_char2() {
		return getConstString(offset + 99, $po_sub_char2);
	}

	/**
	 *  発注予備２.<p>
	 *
	 */
	public void po_sub_char2(String value) {
		setConstString(offset + 99, $po_sub_char2, value);
	}


	/**
	 *  発注予備３.<p>
	 *
	 */
	public String po_sub_char3() {
		return getConstString(offset + 100, $po_sub_char3);
	}

	/**
	 *  発注予備３.<p>
	 *
	 */
	public void po_sub_char3(String value) {
		setConstString(offset + 100, $po_sub_char3, value);
	}


	/**
	 *  納品書予備１.<p>
	 *
	 */
	public String dlv_slip_sub_char1() {
		return getConstString(offset + 101, $dlv_slip_sub_char1);
	}

	/**
	 *  納品書予備１.<p>
	 *
	 */
	public void dlv_slip_sub_char1(String value) {
		setConstString(offset + 101, $dlv_slip_sub_char1, value);
	}


	/**
	 *  納品書予備２.<p>
	 *
	 */
	public String dlv_slip_sub_char2() {
		return getConstString(offset + 102, $dlv_slip_sub_char2);
	}

	/**
	 *  納品書予備２.<p>
	 *
	 */
	public void dlv_slip_sub_char2(String value) {
		setConstString(offset + 102, $dlv_slip_sub_char2, value);
	}


	/**
	 *  納品書予備３.<p>
	 *
	 */
	public String dlv_slip_sub_char3() {
		return getConstString(offset + 103, $dlv_slip_sub_char3);
	}

	/**
	 *  納品書予備３.<p>
	 *
	 */
	public void dlv_slip_sub_char3(String value) {
		setConstString(offset + 103, $dlv_slip_sub_char3, value);
	}


	/**
	 *  ＥＩＡＪ納品書用バーコード１.<p>
	 *
	 */
	public String b_eiaj1() {
		return getConstString(offset + 104, $b_eiaj1);
	}

	/**
	 *  ＥＩＡＪ納品書用バーコード１.<p>
	 *
	 */
	public void b_eiaj1(String value) {
		setConstString(offset + 104, $b_eiaj1, value);
	}


	/**
	 *  ＥＩＡＪ納品書用バーコード２.<p>
	 *
	 */
	public String b_eiaj2() {
		return getConstString(offset + 105, $b_eiaj2);
	}

	/**
	 *  ＥＩＡＪ納品書用バーコード２.<p>
	 *
	 */
	public void b_eiaj2(String value) {
		setConstString(offset + 105, $b_eiaj2, value);
	}


	/**
	 *  ＥＩＡＪ納品書用バーコード３.<p>
	 *
	 */
	public String b_eiaj3() {
		return getConstString(offset + 106, $b_eiaj3);
	}

	/**
	 *  ＥＩＡＪ納品書用バーコード３.<p>
	 *
	 */
	public void b_eiaj3(String value) {
		setConstString(offset + 106, $b_eiaj3, value);
	}


	/**
	 *  ＥＩＡＪ納品書用バーコード４.<p>
	 *
	 */
	public String b_eiaj4() {
		return getConstString(offset + 107, $b_eiaj4);
	}

	/**
	 *  ＥＩＡＪ納品書用バーコード４.<p>
	 *
	 */
	public void b_eiaj4(String value) {
		setConstString(offset + 107, $b_eiaj4, value);
	}


	/**
	 *  ＥＩＡＪ納品書バーコード用数量.<p>
	 *
	 */
	public MCNumber eiaj_b_slo_po_qty() {
		return getConstNumber(offset + 108, $eiaj_b_slo_po_qty);
	}

	/**
	 *  ＥＩＡＪ納品書バーコード用数量.<p>
	 *
	 */
	public void eiaj_b_slo_po_qty(MCNumber value) {
		setConstNumber(offset + 108, $eiaj_b_slo_po_qty, value);
	}

	/**
	 *  ＥＩＡＪ納品書バーコード用数量.<p>
	 *
	 */
	public void eiaj_b_slo_po_qty(int value) {
		setConstNumber(offset + 108, $eiaj_b_slo_po_qty, value);
	}

	/**
	 *  ＥＩＡＪ納品書バーコード用数量.<p>
	 *
	 */
	public void eiaj_b_slo_po_qty(long value) {
		setConstNumber(offset + 108, $eiaj_b_slo_po_qty, value);
	}

	/**
	 *  ＥＩＡＪ納品書バーコード用数量.<p>
	 *
	 */
	public void eiaj_b_slo_po_qty(float value) {
		setConstNumber(offset + 108, $eiaj_b_slo_po_qty, value);
	}

	/**
	 *  ＥＩＡＪ納品書バーコード用数量.<p>
	 *
	 */
	public void eiaj_b_slo_po_qty(double value) {
		setConstNumber(offset + 108, $eiaj_b_slo_po_qty, value);
	}


	/**
	 *  ＥＩＡＪ納品書バーコード用数量文字列.<p>
	 *
	 */
	public String s_eiaj_b_slo_po_qty() {
		return getConstString(offset + 109, $s_eiaj_b_slo_po_qty);
	}

	/**
	 *  ＥＩＡＪ納品書バーコード用数量文字列.<p>
	 *
	 */
	public void s_eiaj_b_slo_po_qty(String value) {
		setConstString(offset + 109, $s_eiaj_b_slo_po_qty, value);
	}


	/**
	 *  納品先（ラベル）.<p>
	 *
	 */
	public String dlv_lbl() {
		return getConstString(offset + 110, $dlv_lbl);
	}

	/**
	 *  納品先（ラベル）.<p>
	 *
	 */
	public void dlv_lbl(String value) {
		setConstString(offset + 110, $dlv_lbl, value);
	}


	/**
	 *  出荷日（ラベル）.<p>
	 *
	 */
	public String ship_dt_lbl() {
		return getConstString(offset + 111, $ship_dt_lbl);
	}

	/**
	 *  出荷日（ラベル）.<p>
	 *
	 */
	public void ship_dt_lbl(String value) {
		setConstString(offset + 111, $ship_dt_lbl, value);
	}


	/**
	 *  納品日（ラベル）.<p>
	 *
	 */
	public String dlv_dt_lbl() {
		return getConstString(offset + 112, $dlv_dt_lbl);
	}

	/**
	 *  納品日（ラベル）.<p>
	 *
	 */
	public void dlv_dt_lbl(String value) {
		setConstString(offset + 112, $dlv_dt_lbl, value);
	}


	/**
	 *  出荷元（ラベル）.<p>
	 *
	 */
	public String lg_grp_lbl() {
		return getConstString(offset + 113, $lg_grp_lbl);
	}

	/**
	 *  出荷元（ラベル）.<p>
	 *
	 */
	public void lg_grp_lbl(String value) {
		setConstString(offset + 113, $lg_grp_lbl, value);
	}


	/**
	 *  得意先（ラベル）.<p>
	 *
	 */
	public String cst_lbl() {
		return getConstString(offset + 114, $cst_lbl);
	}

	/**
	 *  得意先（ラベル）.<p>
	 *
	 */
	public void cst_lbl(String value) {
		setConstString(offset + 114, $cst_lbl, value);
	}


	/**
	 *  出荷時納品書ＮＯ（ラベル）.<p>
	 *
	 */
	public String ship_dlv_slip_no_lbl() {
		return getConstString(offset + 115, $ship_dlv_slip_no_lbl);
	}

	/**
	 *  出荷時納品書ＮＯ（ラベル）.<p>
	 *
	 */
	public void ship_dlv_slip_no_lbl(String value) {
		setConstString(offset + 115, $ship_dlv_slip_no_lbl, value);
	}


	/**
	 *  支給ＦＬＧ.<p>
	 *
	 */
	public boolean prov_flg() {
		return getConstBoolean(offset + 116, $prov_flg);
	}

	/**
	 *  支給ＦＬＧ.<p>
	 *
	 */
	public void prov_flg(boolean value) {
		setConstBoolean(offset + 116, $prov_flg, value);
	}


	/**
	 *  販売ＦＬＧ.<p>
	 *
	 */
	public boolean sls_flg() {
		return getConstBoolean(offset + 117, $sls_flg);
	}

	/**
	 *  販売ＦＬＧ.<p>
	 *
	 */
	public void sls_flg(boolean value) {
		setConstBoolean(offset + 117, $sls_flg, value);
	}


	/**
	 *  為替レート（ラベル）.<p>
	 *
	 */
	public String xrate_lbl() {
		return getConstString(offset + 118, $xrate_lbl);
	}

	/**
	 *  為替レート（ラベル）.<p>
	 *
	 */
	public void xrate_lbl(String value) {
		setConstString(offset + 118, $xrate_lbl, value);
	}


	/**
	 *  為替レート.<p>
	 *
	 */
	public MCNumber xrate() {
		return getConstNumber(offset + 119, $xrate);
	}

	/**
	 *  為替レート.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		setConstNumber(offset + 119, $xrate, value);
	}

	/**
	 *  為替レート.<p>
	 *
	 */
	public void xrate(int value) {
		setConstNumber(offset + 119, $xrate, value);
	}

	/**
	 *  為替レート.<p>
	 *
	 */
	public void xrate(long value) {
		setConstNumber(offset + 119, $xrate, value);
	}

	/**
	 *  為替レート.<p>
	 *
	 */
	public void xrate(float value) {
		setConstNumber(offset + 119, $xrate, value);
	}

	/**
	 *  為替レート.<p>
	 *
	 */
	public void xrate(double value) {
		setConstNumber(offset + 119, $xrate, value);
	}


	/**
	 *  税率（ラベル）.<p>
	 *
	 */
	public String tax_rate_lbl() {
		return getConstString(offset + 120, $tax_rate_lbl);
	}

	/**
	 *  税率（ラベル）.<p>
	 *
	 */
	public void tax_rate_lbl(String value) {
		setConstString(offset + 120, $tax_rate_lbl, value);
	}


	/**
	 *  取引通貨値引金額文字列.<p>
	 *
	 */
	public String s_ttl_trd_cur_dscnt_amt2() {
		return getConstString(offset + 121, $s_ttl_trd_cur_dscnt_amt2);
	}

	/**
	 *  取引通貨値引金額文字列.<p>
	 *
	 */
	public void s_ttl_trd_cur_dscnt_amt2(String value) {
		setConstString(offset + 121, $s_ttl_trd_cur_dscnt_amt2, value);
	}


	/**
	 *  取引通貨金額文字列.<p>
	 *
	 */
	public String s_ttl_trd_cur_amt2() {
		return getConstString(offset + 122, $s_ttl_trd_cur_amt2);
	}

	/**
	 *  取引通貨金額文字列.<p>
	 *
	 */
	public void s_ttl_trd_cur_amt2(String value) {
		setConstString(offset + 122, $s_ttl_trd_cur_amt2, value);
	}


	/**
	 *  取引通貨税額文字列.<p>
	 *
	 */
	public String s_ttl_trd_cur_tax_amt2() {
		return getConstString(offset + 123, $s_ttl_trd_cur_tax_amt2);
	}

	/**
	 *  取引通貨税額文字列.<p>
	 *
	 */
	public void s_ttl_trd_cur_tax_amt2(String value) {
		setConstString(offset + 123, $s_ttl_trd_cur_tax_amt2, value);
	}


	/**
	 *  為替計算取引通貨税額.<p>
	 *
	 */
	public MCNumber ttl_ex_trd_cur_tax_amt() {
		return getConstNumber(offset + 124, $ttl_ex_trd_cur_tax_amt);
	}

	/**
	 *  為替計算取引通貨税額.<p>
	 *
	 */
	public void ttl_ex_trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 124, $ttl_ex_trd_cur_tax_amt, value);
	}

	/**
	 *  為替計算取引通貨税額.<p>
	 *
	 */
	public void ttl_ex_trd_cur_tax_amt(int value) {
		setConstNumber(offset + 124, $ttl_ex_trd_cur_tax_amt, value);
	}

	/**
	 *  為替計算取引通貨税額.<p>
	 *
	 */
	public void ttl_ex_trd_cur_tax_amt(long value) {
		setConstNumber(offset + 124, $ttl_ex_trd_cur_tax_amt, value);
	}

	/**
	 *  為替計算取引通貨税額.<p>
	 *
	 */
	public void ttl_ex_trd_cur_tax_amt(float value) {
		setConstNumber(offset + 124, $ttl_ex_trd_cur_tax_amt, value);
	}

	/**
	 *  為替計算取引通貨税額.<p>
	 *
	 */
	public void ttl_ex_trd_cur_tax_amt(double value) {
		setConstNumber(offset + 124, $ttl_ex_trd_cur_tax_amt, value);
	}


	/**
	 *  為替計算取引通貨税額文字列.<p>
	 *
	 */
	public String s_ttl_ex_trd_cur_tax_amt() {
		return getConstString(offset + 125, $s_ttl_ex_trd_cur_tax_amt);
	}

	/**
	 *  為替計算取引通貨税額文字列.<p>
	 *
	 */
	public void s_ttl_ex_trd_cur_tax_amt(String value) {
		setConstString(offset + 125, $s_ttl_ex_trd_cur_tax_amt, value);
	}


	/**
	 *  取引通貨名.<p>
	 *
	 */
	public String trd_cur_nm2() {
		return getConstString(offset + 126, $trd_cur_nm2);
	}

	/**
	 *  取引通貨名.<p>
	 *
	 */
	public void trd_cur_nm2(String value) {
		setConstString(offset + 126, $trd_cur_nm2, value);
	}


	/**
	 *  基準通貨名.<p>
	 *
	 */
	public String base_cur_nm() {
		return getConstString(offset + 127, $base_cur_nm);
	}

	/**
	 *  基準通貨名.<p>
	 *
	 */
	public void base_cur_nm(String value) {
		setConstString(offset + 127, $base_cur_nm, value);
	}


	public String getString(String name) {
		if ($formtitle.equalsIgnoreCase(name)) {
			return formtitle();
		}
		if ($formtitle2.equalsIgnoreCase(name)) {
			return formtitle2();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($slip_sts_typ_nm.equalsIgnoreCase(name)) {
			return slip_sts_typ_nm();
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			return slip_sts_typ();
		}
		if ($s_schd.equalsIgnoreCase(name)) {
			return s_schd();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($ship_dlv_slip_no.equalsIgnoreCase(name)) {
			return ship_dlv_slip_no();
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			return lg_grp_nm();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($slo_co_cd.equalsIgnoreCase(name)) {
			return slo_co_cd();
		}
		if ($slo_std_co_cd.equalsIgnoreCase(name)) {
			return slo_std_co_cd();
		}
		if ($slo_co_nm.equalsIgnoreCase(name)) {
			return slo_co_nm();
		}
		if ($biz_co_no.equalsIgnoreCase(name)) {
			return biz_co_no();
		}
		if ($slo_co_alt_nm1.equalsIgnoreCase(name)) {
			return slo_co_alt_nm1();
		}
		if ($slo_co_alt_nm2.equalsIgnoreCase(name)) {
			return slo_co_alt_nm2();
		}
		if ($slo_co_alt_nm3.equalsIgnoreCase(name)) {
			return slo_co_alt_nm3();
		}
		if ($slo_co_alt_nm4.equalsIgnoreCase(name)) {
			return slo_co_alt_nm4();
		}
		if ($slo_co_zip_cd.equalsIgnoreCase(name)) {
			return slo_co_zip_cd();
		}
		if ($slo_co_addr1.equalsIgnoreCase(name)) {
			return slo_co_addr1();
		}
		if ($slo_co_addr2.equalsIgnoreCase(name)) {
			return slo_co_addr2();
		}
		if ($slo_co_addr3.equalsIgnoreCase(name)) {
			return slo_co_addr3();
		}
		if ($slo_co_addr4.equalsIgnoreCase(name)) {
			return slo_co_addr4();
		}
		if ($slo_co_addr.equalsIgnoreCase(name)) {
			return slo_co_addr();
		}
		if ($slo_co_tel.equalsIgnoreCase(name)) {
			return slo_co_tel();
		}
		if ($slo_co_fax.equalsIgnoreCase(name)) {
			return slo_co_fax();
		}
		if ($slo_co_cntry_nm.equalsIgnoreCase(name)) {
			return slo_co_cntry_nm();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			return usr_nm();
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($po_co_cd.equalsIgnoreCase(name)) {
			return po_co_cd();
		}
		if ($po_co_nm.equalsIgnoreCase(name)) {
			return po_co_nm();
		}
		if ($po_co_alt_nm1.equalsIgnoreCase(name)) {
			return po_co_alt_nm1();
		}
		if ($po_co_alt_nm2.equalsIgnoreCase(name)) {
			return po_co_alt_nm2();
		}
		if ($po_co_alt_nm3.equalsIgnoreCase(name)) {
			return po_co_alt_nm3();
		}
		if ($po_co_alt_nm4.equalsIgnoreCase(name)) {
			return po_co_alt_nm4();
		}
		if ($po_co_zip_cd.equalsIgnoreCase(name)) {
			return po_co_zip_cd();
		}
		if ($po_co_addr1.equalsIgnoreCase(name)) {
			return po_co_addr1();
		}
		if ($po_co_addr2.equalsIgnoreCase(name)) {
			return po_co_addr2();
		}
		if ($po_co_addr3.equalsIgnoreCase(name)) {
			return po_co_addr3();
		}
		if ($po_co_addr4.equalsIgnoreCase(name)) {
			return po_co_addr4();
		}
		if ($po_co_addr.equalsIgnoreCase(name)) {
			return po_co_addr();
		}
		if ($po_co_tel.equalsIgnoreCase(name)) {
			return po_co_tel();
		}
		if ($po_co_fax.equalsIgnoreCase(name)) {
			return po_co_fax();
		}
		if ($po_co_cntct_dpt.equalsIgnoreCase(name)) {
			return po_co_cntct_dpt();
		}
		if ($po_co_cntct_psn.equalsIgnoreCase(name)) {
			return po_co_cntct_psn();
		}
		if ($po_co_cntct_psn_title.equalsIgnoreCase(name)) {
			return po_co_cntct_psn_title();
		}
		if ($po_co_cntry_nm.equalsIgnoreCase(name)) {
			return po_co_cntry_nm();
		}
		if ($dlv_id_typ.equalsIgnoreCase(name)) {
			return dlv_id_typ();
		}
		if ($dlv_id_nm.equalsIgnoreCase(name)) {
			return dlv_id_nm();
		}
		if ($dlv_id_alt_nm1.equalsIgnoreCase(name)) {
			return dlv_id_alt_nm1();
		}
		if ($dlv_id_alt_nm2.equalsIgnoreCase(name)) {
			return dlv_id_alt_nm2();
		}
		if ($dlv_id_alt_nm3.equalsIgnoreCase(name)) {
			return dlv_id_alt_nm3();
		}
		if ($dlv_id_alt_nm4.equalsIgnoreCase(name)) {
			return dlv_id_alt_nm4();
		}
		if ($dlv_id_cd.equalsIgnoreCase(name)) {
			return dlv_id_cd();
		}
		if ($dlv_zip_cd.equalsIgnoreCase(name)) {
			return dlv_zip_cd();
		}
		if ($dlv_addr1.equalsIgnoreCase(name)) {
			return dlv_addr1();
		}
		if ($dlv_addr2.equalsIgnoreCase(name)) {
			return dlv_addr2();
		}
		if ($dlv_addr3.equalsIgnoreCase(name)) {
			return dlv_addr3();
		}
		if ($dlv_addr4.equalsIgnoreCase(name)) {
			return dlv_addr4();
		}
		if ($dlv_addr.equalsIgnoreCase(name)) {
			return dlv_addr();
		}
		if ($dlv_tel.equalsIgnoreCase(name)) {
			return dlv_tel();
		}
		if ($dlv_fax.equalsIgnoreCase(name)) {
			return dlv_fax();
		}
		if ($dlv_cntct_dpt.equalsIgnoreCase(name)) {
			return dlv_cntct_dpt();
		}
		if ($dlv_cntct_psn.equalsIgnoreCase(name)) {
			return dlv_cntct_psn();
		}
		if ($dlv_cntct_psn_title.equalsIgnoreCase(name)) {
			return dlv_cntct_psn_title();
		}
		if ($dlv_cntry_nm.equalsIgnoreCase(name)) {
			return dlv_cntry_nm();
		}
		if ($dlv_slip_po_no_lbl.equalsIgnoreCase(name)) {
			return dlv_slip_po_no_lbl();
		}
		if ($dlv_slip_po_no.equalsIgnoreCase(name)) {
			return dlv_slip_po_no();
		}
		if ($eiaj_dlv_slip_po_no.equalsIgnoreCase(name)) {
			return eiaj_dlv_slip_po_no();
		}
		if ($s_ttl_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return s_ttl_trd_cur_tax_amt();
		}
		if ($s_ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			return s_ttl_trd_cur_amt();
		}
		if ($s_ttl_trd_cur_tax_in_amt.equalsIgnoreCase(name)) {
			return s_ttl_trd_cur_tax_in_amt();
		}
		if ($s_ttl_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return s_ttl_trd_cur_dscnt_amt();
		}
		if ($dlv_slip_act_no.equalsIgnoreCase(name)) {
			return dlv_slip_act_no();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($po_trd_rmrks.equalsIgnoreCase(name)) {
			return po_trd_rmrks();
		}
		if ($po_sub_char1.equalsIgnoreCase(name)) {
			return po_sub_char1();
		}
		if ($po_sub_char2.equalsIgnoreCase(name)) {
			return po_sub_char2();
		}
		if ($po_sub_char3.equalsIgnoreCase(name)) {
			return po_sub_char3();
		}
		if ($dlv_slip_sub_char1.equalsIgnoreCase(name)) {
			return dlv_slip_sub_char1();
		}
		if ($dlv_slip_sub_char2.equalsIgnoreCase(name)) {
			return dlv_slip_sub_char2();
		}
		if ($dlv_slip_sub_char3.equalsIgnoreCase(name)) {
			return dlv_slip_sub_char3();
		}
		if ($b_eiaj1.equalsIgnoreCase(name)) {
			return b_eiaj1();
		}
		if ($b_eiaj2.equalsIgnoreCase(name)) {
			return b_eiaj2();
		}
		if ($b_eiaj3.equalsIgnoreCase(name)) {
			return b_eiaj3();
		}
		if ($b_eiaj4.equalsIgnoreCase(name)) {
			return b_eiaj4();
		}
		if ($s_eiaj_b_slo_po_qty.equalsIgnoreCase(name)) {
			return s_eiaj_b_slo_po_qty();
		}
		if ($dlv_lbl.equalsIgnoreCase(name)) {
			return dlv_lbl();
		}
		if ($ship_dt_lbl.equalsIgnoreCase(name)) {
			return ship_dt_lbl();
		}
		if ($dlv_dt_lbl.equalsIgnoreCase(name)) {
			return dlv_dt_lbl();
		}
		if ($lg_grp_lbl.equalsIgnoreCase(name)) {
			return lg_grp_lbl();
		}
		if ($cst_lbl.equalsIgnoreCase(name)) {
			return cst_lbl();
		}
		if ($ship_dlv_slip_no_lbl.equalsIgnoreCase(name)) {
			return ship_dlv_slip_no_lbl();
		}
		if ($xrate_lbl.equalsIgnoreCase(name)) {
			return xrate_lbl();
		}
		if ($tax_rate_lbl.equalsIgnoreCase(name)) {
			return tax_rate_lbl();
		}
		if ($s_ttl_trd_cur_dscnt_amt2.equalsIgnoreCase(name)) {
			return s_ttl_trd_cur_dscnt_amt2();
		}
		if ($s_ttl_trd_cur_amt2.equalsIgnoreCase(name)) {
			return s_ttl_trd_cur_amt2();
		}
		if ($s_ttl_trd_cur_tax_amt2.equalsIgnoreCase(name)) {
			return s_ttl_trd_cur_tax_amt2();
		}
		if ($s_ttl_ex_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return s_ttl_ex_trd_cur_tax_amt();
		}
		if ($trd_cur_nm2.equalsIgnoreCase(name)) {
			return trd_cur_nm2();
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			return base_cur_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			return dlv_slip_rev();
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			return dlv_slip_seq();
		}
		if ($dlv_slip_seq_view.equalsIgnoreCase(name)) {
			return dlv_slip_seq_view();
		}
		if ($ttl_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return ttl_trd_cur_tax_amt();
		}
		if ($ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			return ttl_trd_cur_amt();
		}
		if ($ttl_trd_cur_tax_in_amt.equalsIgnoreCase(name)) {
			return ttl_trd_cur_tax_in_amt();
		}
		if ($ttl_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return ttl_trd_cur_dscnt_amt();
		}
		if ($eiaj_b_slo_po_qty.equalsIgnoreCase(name)) {
			return eiaj_b_slo_po_qty();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($ttl_ex_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return ttl_ex_trd_cur_tax_amt();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($print_hm.equalsIgnoreCase(name)) {
			return print_hm();
		}
		if ($ship_dt.equalsIgnoreCase(name)) {
			return ship_dt();
		}
		if ($ship_tm.equalsIgnoreCase(name)) {
			return ship_tm();
		}
		if ($dlv_dt.equalsIgnoreCase(name)) {
			return dlv_dt();
		}
		if ($dlv_tm.equalsIgnoreCase(name)) {
			return dlv_tm();
		}
		if ($dlv_rqst_dt.equalsIgnoreCase(name)) {
			return dlv_rqst_dt();
		}
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			return dlv_rqst_tm();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($adjst_slip_flg.equalsIgnoreCase(name)) {
			return adjst_slip_flg();
		}
		if ($prov_flg.equalsIgnoreCase(name)) {
			return prov_flg();
		}
		if ($sls_flg.equalsIgnoreCase(name)) {
			return sls_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($formtitle.equalsIgnoreCase(name)) {
			return formtitle();
		}
		if ($formtitle2.equalsIgnoreCase(name)) {
			return formtitle2();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($slip_sts_typ_nm.equalsIgnoreCase(name)) {
			return slip_sts_typ_nm();
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			return slip_sts_typ();
		}
		if ($s_schd.equalsIgnoreCase(name)) {
			return s_schd();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($ship_dlv_slip_no.equalsIgnoreCase(name)) {
			return ship_dlv_slip_no();
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			return lg_grp_nm();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($slo_co_cd.equalsIgnoreCase(name)) {
			return slo_co_cd();
		}
		if ($slo_std_co_cd.equalsIgnoreCase(name)) {
			return slo_std_co_cd();
		}
		if ($slo_co_nm.equalsIgnoreCase(name)) {
			return slo_co_nm();
		}
		if ($biz_co_no.equalsIgnoreCase(name)) {
			return biz_co_no();
		}
		if ($slo_co_alt_nm1.equalsIgnoreCase(name)) {
			return slo_co_alt_nm1();
		}
		if ($slo_co_alt_nm2.equalsIgnoreCase(name)) {
			return slo_co_alt_nm2();
		}
		if ($slo_co_alt_nm3.equalsIgnoreCase(name)) {
			return slo_co_alt_nm3();
		}
		if ($slo_co_alt_nm4.equalsIgnoreCase(name)) {
			return slo_co_alt_nm4();
		}
		if ($slo_co_zip_cd.equalsIgnoreCase(name)) {
			return slo_co_zip_cd();
		}
		if ($slo_co_addr1.equalsIgnoreCase(name)) {
			return slo_co_addr1();
		}
		if ($slo_co_addr2.equalsIgnoreCase(name)) {
			return slo_co_addr2();
		}
		if ($slo_co_addr3.equalsIgnoreCase(name)) {
			return slo_co_addr3();
		}
		if ($slo_co_addr4.equalsIgnoreCase(name)) {
			return slo_co_addr4();
		}
		if ($slo_co_addr.equalsIgnoreCase(name)) {
			return slo_co_addr();
		}
		if ($slo_co_tel.equalsIgnoreCase(name)) {
			return slo_co_tel();
		}
		if ($slo_co_fax.equalsIgnoreCase(name)) {
			return slo_co_fax();
		}
		if ($slo_co_cntry_nm.equalsIgnoreCase(name)) {
			return slo_co_cntry_nm();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			return usr_nm();
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($po_co_cd.equalsIgnoreCase(name)) {
			return po_co_cd();
		}
		if ($po_co_nm.equalsIgnoreCase(name)) {
			return po_co_nm();
		}
		if ($po_co_alt_nm1.equalsIgnoreCase(name)) {
			return po_co_alt_nm1();
		}
		if ($po_co_alt_nm2.equalsIgnoreCase(name)) {
			return po_co_alt_nm2();
		}
		if ($po_co_alt_nm3.equalsIgnoreCase(name)) {
			return po_co_alt_nm3();
		}
		if ($po_co_alt_nm4.equalsIgnoreCase(name)) {
			return po_co_alt_nm4();
		}
		if ($po_co_zip_cd.equalsIgnoreCase(name)) {
			return po_co_zip_cd();
		}
		if ($po_co_addr1.equalsIgnoreCase(name)) {
			return po_co_addr1();
		}
		if ($po_co_addr2.equalsIgnoreCase(name)) {
			return po_co_addr2();
		}
		if ($po_co_addr3.equalsIgnoreCase(name)) {
			return po_co_addr3();
		}
		if ($po_co_addr4.equalsIgnoreCase(name)) {
			return po_co_addr4();
		}
		if ($po_co_addr.equalsIgnoreCase(name)) {
			return po_co_addr();
		}
		if ($po_co_tel.equalsIgnoreCase(name)) {
			return po_co_tel();
		}
		if ($po_co_fax.equalsIgnoreCase(name)) {
			return po_co_fax();
		}
		if ($po_co_cntct_dpt.equalsIgnoreCase(name)) {
			return po_co_cntct_dpt();
		}
		if ($po_co_cntct_psn.equalsIgnoreCase(name)) {
			return po_co_cntct_psn();
		}
		if ($po_co_cntct_psn_title.equalsIgnoreCase(name)) {
			return po_co_cntct_psn_title();
		}
		if ($po_co_cntry_nm.equalsIgnoreCase(name)) {
			return po_co_cntry_nm();
		}
		if ($dlv_id_typ.equalsIgnoreCase(name)) {
			return dlv_id_typ();
		}
		if ($dlv_id_nm.equalsIgnoreCase(name)) {
			return dlv_id_nm();
		}
		if ($dlv_id_alt_nm1.equalsIgnoreCase(name)) {
			return dlv_id_alt_nm1();
		}
		if ($dlv_id_alt_nm2.equalsIgnoreCase(name)) {
			return dlv_id_alt_nm2();
		}
		if ($dlv_id_alt_nm3.equalsIgnoreCase(name)) {
			return dlv_id_alt_nm3();
		}
		if ($dlv_id_alt_nm4.equalsIgnoreCase(name)) {
			return dlv_id_alt_nm4();
		}
		if ($dlv_id_cd.equalsIgnoreCase(name)) {
			return dlv_id_cd();
		}
		if ($dlv_zip_cd.equalsIgnoreCase(name)) {
			return dlv_zip_cd();
		}
		if ($dlv_addr1.equalsIgnoreCase(name)) {
			return dlv_addr1();
		}
		if ($dlv_addr2.equalsIgnoreCase(name)) {
			return dlv_addr2();
		}
		if ($dlv_addr3.equalsIgnoreCase(name)) {
			return dlv_addr3();
		}
		if ($dlv_addr4.equalsIgnoreCase(name)) {
			return dlv_addr4();
		}
		if ($dlv_addr.equalsIgnoreCase(name)) {
			return dlv_addr();
		}
		if ($dlv_tel.equalsIgnoreCase(name)) {
			return dlv_tel();
		}
		if ($dlv_fax.equalsIgnoreCase(name)) {
			return dlv_fax();
		}
		if ($dlv_cntct_dpt.equalsIgnoreCase(name)) {
			return dlv_cntct_dpt();
		}
		if ($dlv_cntct_psn.equalsIgnoreCase(name)) {
			return dlv_cntct_psn();
		}
		if ($dlv_cntct_psn_title.equalsIgnoreCase(name)) {
			return dlv_cntct_psn_title();
		}
		if ($dlv_cntry_nm.equalsIgnoreCase(name)) {
			return dlv_cntry_nm();
		}
		if ($dlv_slip_po_no_lbl.equalsIgnoreCase(name)) {
			return dlv_slip_po_no_lbl();
		}
		if ($dlv_slip_po_no.equalsIgnoreCase(name)) {
			return dlv_slip_po_no();
		}
		if ($eiaj_dlv_slip_po_no.equalsIgnoreCase(name)) {
			return eiaj_dlv_slip_po_no();
		}
		if ($s_ttl_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return s_ttl_trd_cur_tax_amt();
		}
		if ($s_ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			return s_ttl_trd_cur_amt();
		}
		if ($s_ttl_trd_cur_tax_in_amt.equalsIgnoreCase(name)) {
			return s_ttl_trd_cur_tax_in_amt();
		}
		if ($s_ttl_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return s_ttl_trd_cur_dscnt_amt();
		}
		if ($dlv_slip_act_no.equalsIgnoreCase(name)) {
			return dlv_slip_act_no();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($po_trd_rmrks.equalsIgnoreCase(name)) {
			return po_trd_rmrks();
		}
		if ($po_sub_char1.equalsIgnoreCase(name)) {
			return po_sub_char1();
		}
		if ($po_sub_char2.equalsIgnoreCase(name)) {
			return po_sub_char2();
		}
		if ($po_sub_char3.equalsIgnoreCase(name)) {
			return po_sub_char3();
		}
		if ($dlv_slip_sub_char1.equalsIgnoreCase(name)) {
			return dlv_slip_sub_char1();
		}
		if ($dlv_slip_sub_char2.equalsIgnoreCase(name)) {
			return dlv_slip_sub_char2();
		}
		if ($dlv_slip_sub_char3.equalsIgnoreCase(name)) {
			return dlv_slip_sub_char3();
		}
		if ($b_eiaj1.equalsIgnoreCase(name)) {
			return b_eiaj1();
		}
		if ($b_eiaj2.equalsIgnoreCase(name)) {
			return b_eiaj2();
		}
		if ($b_eiaj3.equalsIgnoreCase(name)) {
			return b_eiaj3();
		}
		if ($b_eiaj4.equalsIgnoreCase(name)) {
			return b_eiaj4();
		}
		if ($s_eiaj_b_slo_po_qty.equalsIgnoreCase(name)) {
			return s_eiaj_b_slo_po_qty();
		}
		if ($dlv_lbl.equalsIgnoreCase(name)) {
			return dlv_lbl();
		}
		if ($ship_dt_lbl.equalsIgnoreCase(name)) {
			return ship_dt_lbl();
		}
		if ($dlv_dt_lbl.equalsIgnoreCase(name)) {
			return dlv_dt_lbl();
		}
		if ($lg_grp_lbl.equalsIgnoreCase(name)) {
			return lg_grp_lbl();
		}
		if ($cst_lbl.equalsIgnoreCase(name)) {
			return cst_lbl();
		}
		if ($ship_dlv_slip_no_lbl.equalsIgnoreCase(name)) {
			return ship_dlv_slip_no_lbl();
		}
		if ($xrate_lbl.equalsIgnoreCase(name)) {
			return xrate_lbl();
		}
		if ($tax_rate_lbl.equalsIgnoreCase(name)) {
			return tax_rate_lbl();
		}
		if ($s_ttl_trd_cur_dscnt_amt2.equalsIgnoreCase(name)) {
			return s_ttl_trd_cur_dscnt_amt2();
		}
		if ($s_ttl_trd_cur_amt2.equalsIgnoreCase(name)) {
			return s_ttl_trd_cur_amt2();
		}
		if ($s_ttl_trd_cur_tax_amt2.equalsIgnoreCase(name)) {
			return s_ttl_trd_cur_tax_amt2();
		}
		if ($s_ttl_ex_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return s_ttl_ex_trd_cur_tax_amt();
		}
		if ($trd_cur_nm2.equalsIgnoreCase(name)) {
			return trd_cur_nm2();
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			return base_cur_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			return dlv_slip_rev();
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			return dlv_slip_seq();
		}
		if ($dlv_slip_seq_view.equalsIgnoreCase(name)) {
			return dlv_slip_seq_view();
		}
		if ($ttl_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return ttl_trd_cur_tax_amt();
		}
		if ($ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			return ttl_trd_cur_amt();
		}
		if ($ttl_trd_cur_tax_in_amt.equalsIgnoreCase(name)) {
			return ttl_trd_cur_tax_in_amt();
		}
		if ($ttl_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return ttl_trd_cur_dscnt_amt();
		}
		if ($eiaj_b_slo_po_qty.equalsIgnoreCase(name)) {
			return eiaj_b_slo_po_qty();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($ttl_ex_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return ttl_ex_trd_cur_tax_amt();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($print_hm.equalsIgnoreCase(name)) {
			return print_hm();
		}
		if ($ship_dt.equalsIgnoreCase(name)) {
			return ship_dt();
		}
		if ($ship_tm.equalsIgnoreCase(name)) {
			return ship_tm();
		}
		if ($dlv_dt.equalsIgnoreCase(name)) {
			return dlv_dt();
		}
		if ($dlv_tm.equalsIgnoreCase(name)) {
			return dlv_tm();
		}
		if ($dlv_rqst_dt.equalsIgnoreCase(name)) {
			return dlv_rqst_dt();
		}
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			return dlv_rqst_tm();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($adjst_slip_flg.equalsIgnoreCase(name)) {
			return adjst_slip_flg();
		}
		if ($prov_flg.equalsIgnoreCase(name)) {
			return prov_flg();
		}
		if ($sls_flg.equalsIgnoreCase(name)) {
			return sls_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($formtitle.equalsIgnoreCase(name)) {
			formtitle(value);
			return;
		}
		if ($formtitle2.equalsIgnoreCase(name)) {
			formtitle2(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($slip_sts_typ_nm.equalsIgnoreCase(name)) {
			slip_sts_typ_nm(value);
			return;
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			slip_sts_typ(value);
			return;
		}
		if ($s_schd.equalsIgnoreCase(name)) {
			s_schd(value);
			return;
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($ship_dlv_slip_no.equalsIgnoreCase(name)) {
			ship_dlv_slip_no(value);
			return;
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			lg_grp_nm(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
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
		if ($slo_co_cd.equalsIgnoreCase(name)) {
			slo_co_cd(value);
			return;
		}
		if ($slo_std_co_cd.equalsIgnoreCase(name)) {
			slo_std_co_cd(value);
			return;
		}
		if ($slo_co_nm.equalsIgnoreCase(name)) {
			slo_co_nm(value);
			return;
		}
		if ($biz_co_no.equalsIgnoreCase(name)) {
			biz_co_no(value);
			return;
		}
		if ($slo_co_alt_nm1.equalsIgnoreCase(name)) {
			slo_co_alt_nm1(value);
			return;
		}
		if ($slo_co_alt_nm2.equalsIgnoreCase(name)) {
			slo_co_alt_nm2(value);
			return;
		}
		if ($slo_co_alt_nm3.equalsIgnoreCase(name)) {
			slo_co_alt_nm3(value);
			return;
		}
		if ($slo_co_alt_nm4.equalsIgnoreCase(name)) {
			slo_co_alt_nm4(value);
			return;
		}
		if ($slo_co_zip_cd.equalsIgnoreCase(name)) {
			slo_co_zip_cd(value);
			return;
		}
		if ($slo_co_addr1.equalsIgnoreCase(name)) {
			slo_co_addr1(value);
			return;
		}
		if ($slo_co_addr2.equalsIgnoreCase(name)) {
			slo_co_addr2(value);
			return;
		}
		if ($slo_co_addr3.equalsIgnoreCase(name)) {
			slo_co_addr3(value);
			return;
		}
		if ($slo_co_addr4.equalsIgnoreCase(name)) {
			slo_co_addr4(value);
			return;
		}
		if ($slo_co_addr.equalsIgnoreCase(name)) {
			slo_co_addr(value);
			return;
		}
		if ($slo_co_tel.equalsIgnoreCase(name)) {
			slo_co_tel(value);
			return;
		}
		if ($slo_co_fax.equalsIgnoreCase(name)) {
			slo_co_fax(value);
			return;
		}
		if ($slo_co_cntry_nm.equalsIgnoreCase(name)) {
			slo_co_cntry_nm(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			usr_nm(value);
			return;
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($po_co_cd.equalsIgnoreCase(name)) {
			po_co_cd(value);
			return;
		}
		if ($po_co_nm.equalsIgnoreCase(name)) {
			po_co_nm(value);
			return;
		}
		if ($po_co_alt_nm1.equalsIgnoreCase(name)) {
			po_co_alt_nm1(value);
			return;
		}
		if ($po_co_alt_nm2.equalsIgnoreCase(name)) {
			po_co_alt_nm2(value);
			return;
		}
		if ($po_co_alt_nm3.equalsIgnoreCase(name)) {
			po_co_alt_nm3(value);
			return;
		}
		if ($po_co_alt_nm4.equalsIgnoreCase(name)) {
			po_co_alt_nm4(value);
			return;
		}
		if ($po_co_zip_cd.equalsIgnoreCase(name)) {
			po_co_zip_cd(value);
			return;
		}
		if ($po_co_addr1.equalsIgnoreCase(name)) {
			po_co_addr1(value);
			return;
		}
		if ($po_co_addr2.equalsIgnoreCase(name)) {
			po_co_addr2(value);
			return;
		}
		if ($po_co_addr3.equalsIgnoreCase(name)) {
			po_co_addr3(value);
			return;
		}
		if ($po_co_addr4.equalsIgnoreCase(name)) {
			po_co_addr4(value);
			return;
		}
		if ($po_co_addr.equalsIgnoreCase(name)) {
			po_co_addr(value);
			return;
		}
		if ($po_co_tel.equalsIgnoreCase(name)) {
			po_co_tel(value);
			return;
		}
		if ($po_co_fax.equalsIgnoreCase(name)) {
			po_co_fax(value);
			return;
		}
		if ($po_co_cntct_dpt.equalsIgnoreCase(name)) {
			po_co_cntct_dpt(value);
			return;
		}
		if ($po_co_cntct_psn.equalsIgnoreCase(name)) {
			po_co_cntct_psn(value);
			return;
		}
		if ($po_co_cntct_psn_title.equalsIgnoreCase(name)) {
			po_co_cntct_psn_title(value);
			return;
		}
		if ($po_co_cntry_nm.equalsIgnoreCase(name)) {
			po_co_cntry_nm(value);
			return;
		}
		if ($dlv_id_typ.equalsIgnoreCase(name)) {
			dlv_id_typ(value);
			return;
		}
		if ($dlv_id_nm.equalsIgnoreCase(name)) {
			dlv_id_nm(value);
			return;
		}
		if ($dlv_id_alt_nm1.equalsIgnoreCase(name)) {
			dlv_id_alt_nm1(value);
			return;
		}
		if ($dlv_id_alt_nm2.equalsIgnoreCase(name)) {
			dlv_id_alt_nm2(value);
			return;
		}
		if ($dlv_id_alt_nm3.equalsIgnoreCase(name)) {
			dlv_id_alt_nm3(value);
			return;
		}
		if ($dlv_id_alt_nm4.equalsIgnoreCase(name)) {
			dlv_id_alt_nm4(value);
			return;
		}
		if ($dlv_id_cd.equalsIgnoreCase(name)) {
			dlv_id_cd(value);
			return;
		}
		if ($dlv_zip_cd.equalsIgnoreCase(name)) {
			dlv_zip_cd(value);
			return;
		}
		if ($dlv_addr1.equalsIgnoreCase(name)) {
			dlv_addr1(value);
			return;
		}
		if ($dlv_addr2.equalsIgnoreCase(name)) {
			dlv_addr2(value);
			return;
		}
		if ($dlv_addr3.equalsIgnoreCase(name)) {
			dlv_addr3(value);
			return;
		}
		if ($dlv_addr4.equalsIgnoreCase(name)) {
			dlv_addr4(value);
			return;
		}
		if ($dlv_addr.equalsIgnoreCase(name)) {
			dlv_addr(value);
			return;
		}
		if ($dlv_tel.equalsIgnoreCase(name)) {
			dlv_tel(value);
			return;
		}
		if ($dlv_fax.equalsIgnoreCase(name)) {
			dlv_fax(value);
			return;
		}
		if ($dlv_cntct_dpt.equalsIgnoreCase(name)) {
			dlv_cntct_dpt(value);
			return;
		}
		if ($dlv_cntct_psn.equalsIgnoreCase(name)) {
			dlv_cntct_psn(value);
			return;
		}
		if ($dlv_cntct_psn_title.equalsIgnoreCase(name)) {
			dlv_cntct_psn_title(value);
			return;
		}
		if ($dlv_cntry_nm.equalsIgnoreCase(name)) {
			dlv_cntry_nm(value);
			return;
		}
		if ($dlv_slip_po_no_lbl.equalsIgnoreCase(name)) {
			dlv_slip_po_no_lbl(value);
			return;
		}
		if ($dlv_slip_po_no.equalsIgnoreCase(name)) {
			dlv_slip_po_no(value);
			return;
		}
		if ($eiaj_dlv_slip_po_no.equalsIgnoreCase(name)) {
			eiaj_dlv_slip_po_no(value);
			return;
		}
		if ($s_ttl_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			s_ttl_trd_cur_tax_amt(value);
			return;
		}
		if ($s_ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			s_ttl_trd_cur_amt(value);
			return;
		}
		if ($s_ttl_trd_cur_tax_in_amt.equalsIgnoreCase(name)) {
			s_ttl_trd_cur_tax_in_amt(value);
			return;
		}
		if ($s_ttl_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			s_ttl_trd_cur_dscnt_amt(value);
			return;
		}
		if ($dlv_slip_act_no.equalsIgnoreCase(name)) {
			dlv_slip_act_no(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($po_trd_rmrks.equalsIgnoreCase(name)) {
			po_trd_rmrks(value);
			return;
		}
		if ($po_sub_char1.equalsIgnoreCase(name)) {
			po_sub_char1(value);
			return;
		}
		if ($po_sub_char2.equalsIgnoreCase(name)) {
			po_sub_char2(value);
			return;
		}
		if ($po_sub_char3.equalsIgnoreCase(name)) {
			po_sub_char3(value);
			return;
		}
		if ($dlv_slip_sub_char1.equalsIgnoreCase(name)) {
			dlv_slip_sub_char1(value);
			return;
		}
		if ($dlv_slip_sub_char2.equalsIgnoreCase(name)) {
			dlv_slip_sub_char2(value);
			return;
		}
		if ($dlv_slip_sub_char3.equalsIgnoreCase(name)) {
			dlv_slip_sub_char3(value);
			return;
		}
		if ($b_eiaj1.equalsIgnoreCase(name)) {
			b_eiaj1(value);
			return;
		}
		if ($b_eiaj2.equalsIgnoreCase(name)) {
			b_eiaj2(value);
			return;
		}
		if ($b_eiaj3.equalsIgnoreCase(name)) {
			b_eiaj3(value);
			return;
		}
		if ($b_eiaj4.equalsIgnoreCase(name)) {
			b_eiaj4(value);
			return;
		}
		if ($s_eiaj_b_slo_po_qty.equalsIgnoreCase(name)) {
			s_eiaj_b_slo_po_qty(value);
			return;
		}
		if ($dlv_lbl.equalsIgnoreCase(name)) {
			dlv_lbl(value);
			return;
		}
		if ($ship_dt_lbl.equalsIgnoreCase(name)) {
			ship_dt_lbl(value);
			return;
		}
		if ($dlv_dt_lbl.equalsIgnoreCase(name)) {
			dlv_dt_lbl(value);
			return;
		}
		if ($lg_grp_lbl.equalsIgnoreCase(name)) {
			lg_grp_lbl(value);
			return;
		}
		if ($cst_lbl.equalsIgnoreCase(name)) {
			cst_lbl(value);
			return;
		}
		if ($ship_dlv_slip_no_lbl.equalsIgnoreCase(name)) {
			ship_dlv_slip_no_lbl(value);
			return;
		}
		if ($xrate_lbl.equalsIgnoreCase(name)) {
			xrate_lbl(value);
			return;
		}
		if ($tax_rate_lbl.equalsIgnoreCase(name)) {
			tax_rate_lbl(value);
			return;
		}
		if ($s_ttl_trd_cur_dscnt_amt2.equalsIgnoreCase(name)) {
			s_ttl_trd_cur_dscnt_amt2(value);
			return;
		}
		if ($s_ttl_trd_cur_amt2.equalsIgnoreCase(name)) {
			s_ttl_trd_cur_amt2(value);
			return;
		}
		if ($s_ttl_trd_cur_tax_amt2.equalsIgnoreCase(name)) {
			s_ttl_trd_cur_tax_amt2(value);
			return;
		}
		if ($s_ttl_ex_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			s_ttl_ex_trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_nm2.equalsIgnoreCase(name)) {
			trd_cur_nm2(value);
			return;
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			base_cur_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_seq_view.equalsIgnoreCase(name)) {
			dlv_slip_seq_view(value);
			return;
		}
		if ($ttl_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_tax_amt(value);
			return;
		}
		if ($ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_amt(value);
			return;
		}
		if ($ttl_trd_cur_tax_in_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_tax_in_amt(value);
			return;
		}
		if ($ttl_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_dscnt_amt(value);
			return;
		}
		if ($eiaj_b_slo_po_qty.equalsIgnoreCase(name)) {
			eiaj_b_slo_po_qty(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ttl_ex_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			ttl_ex_trd_cur_tax_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_seq_view.equalsIgnoreCase(name)) {
			dlv_slip_seq_view(value);
			return;
		}
		if ($ttl_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_tax_amt(value);
			return;
		}
		if ($ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_amt(value);
			return;
		}
		if ($ttl_trd_cur_tax_in_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_tax_in_amt(value);
			return;
		}
		if ($ttl_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_dscnt_amt(value);
			return;
		}
		if ($eiaj_b_slo_po_qty.equalsIgnoreCase(name)) {
			eiaj_b_slo_po_qty(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ttl_ex_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			ttl_ex_trd_cur_tax_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_seq_view.equalsIgnoreCase(name)) {
			dlv_slip_seq_view(value);
			return;
		}
		if ($ttl_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_tax_amt(value);
			return;
		}
		if ($ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_amt(value);
			return;
		}
		if ($ttl_trd_cur_tax_in_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_tax_in_amt(value);
			return;
		}
		if ($ttl_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_dscnt_amt(value);
			return;
		}
		if ($eiaj_b_slo_po_qty.equalsIgnoreCase(name)) {
			eiaj_b_slo_po_qty(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ttl_ex_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			ttl_ex_trd_cur_tax_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_seq_view.equalsIgnoreCase(name)) {
			dlv_slip_seq_view(value);
			return;
		}
		if ($ttl_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_tax_amt(value);
			return;
		}
		if ($ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_amt(value);
			return;
		}
		if ($ttl_trd_cur_tax_in_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_tax_in_amt(value);
			return;
		}
		if ($ttl_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_dscnt_amt(value);
			return;
		}
		if ($eiaj_b_slo_po_qty.equalsIgnoreCase(name)) {
			eiaj_b_slo_po_qty(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ttl_ex_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			ttl_ex_trd_cur_tax_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_seq_view.equalsIgnoreCase(name)) {
			dlv_slip_seq_view(value);
			return;
		}
		if ($ttl_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_tax_amt(value);
			return;
		}
		if ($ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_amt(value);
			return;
		}
		if ($ttl_trd_cur_tax_in_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_tax_in_amt(value);
			return;
		}
		if ($ttl_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_dscnt_amt(value);
			return;
		}
		if ($eiaj_b_slo_po_qty.equalsIgnoreCase(name)) {
			eiaj_b_slo_po_qty(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ttl_ex_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			ttl_ex_trd_cur_tax_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($print_hm.equalsIgnoreCase(name)) {
			print_hm(value);
			return;
		}
		if ($ship_dt.equalsIgnoreCase(name)) {
			ship_dt(value);
			return;
		}
		if ($ship_tm.equalsIgnoreCase(name)) {
			ship_tm(value);
			return;
		}
		if ($dlv_dt.equalsIgnoreCase(name)) {
			dlv_dt(value);
			return;
		}
		if ($dlv_tm.equalsIgnoreCase(name)) {
			dlv_tm(value);
			return;
		}
		if ($dlv_rqst_dt.equalsIgnoreCase(name)) {
			dlv_rqst_dt(value);
			return;
		}
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			dlv_rqst_tm(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($adjst_slip_flg.equalsIgnoreCase(name)) {
			adjst_slip_flg(value);
			return;
		}
		if ($prov_flg.equalsIgnoreCase(name)) {
			prov_flg(value);
			return;
		}
		if ($sls_flg.equalsIgnoreCase(name)) {
			sls_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($formtitle.equalsIgnoreCase(name)) {
			formtitle(value);
			return;
		}
		if ($formtitle2.equalsIgnoreCase(name)) {
			formtitle2(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($slip_sts_typ_nm.equalsIgnoreCase(name)) {
			slip_sts_typ_nm(value);
			return;
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			slip_sts_typ(value);
			return;
		}
		if ($s_schd.equalsIgnoreCase(name)) {
			s_schd(value);
			return;
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($ship_dlv_slip_no.equalsIgnoreCase(name)) {
			ship_dlv_slip_no(value);
			return;
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			lg_grp_nm(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
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
		if ($slo_co_cd.equalsIgnoreCase(name)) {
			slo_co_cd(value);
			return;
		}
		if ($slo_std_co_cd.equalsIgnoreCase(name)) {
			slo_std_co_cd(value);
			return;
		}
		if ($slo_co_nm.equalsIgnoreCase(name)) {
			slo_co_nm(value);
			return;
		}
		if ($biz_co_no.equalsIgnoreCase(name)) {
			biz_co_no(value);
			return;
		}
		if ($slo_co_alt_nm1.equalsIgnoreCase(name)) {
			slo_co_alt_nm1(value);
			return;
		}
		if ($slo_co_alt_nm2.equalsIgnoreCase(name)) {
			slo_co_alt_nm2(value);
			return;
		}
		if ($slo_co_alt_nm3.equalsIgnoreCase(name)) {
			slo_co_alt_nm3(value);
			return;
		}
		if ($slo_co_alt_nm4.equalsIgnoreCase(name)) {
			slo_co_alt_nm4(value);
			return;
		}
		if ($slo_co_zip_cd.equalsIgnoreCase(name)) {
			slo_co_zip_cd(value);
			return;
		}
		if ($slo_co_addr1.equalsIgnoreCase(name)) {
			slo_co_addr1(value);
			return;
		}
		if ($slo_co_addr2.equalsIgnoreCase(name)) {
			slo_co_addr2(value);
			return;
		}
		if ($slo_co_addr3.equalsIgnoreCase(name)) {
			slo_co_addr3(value);
			return;
		}
		if ($slo_co_addr4.equalsIgnoreCase(name)) {
			slo_co_addr4(value);
			return;
		}
		if ($slo_co_addr.equalsIgnoreCase(name)) {
			slo_co_addr(value);
			return;
		}
		if ($slo_co_tel.equalsIgnoreCase(name)) {
			slo_co_tel(value);
			return;
		}
		if ($slo_co_fax.equalsIgnoreCase(name)) {
			slo_co_fax(value);
			return;
		}
		if ($slo_co_cntry_nm.equalsIgnoreCase(name)) {
			slo_co_cntry_nm(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			usr_nm(value);
			return;
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($po_co_cd.equalsIgnoreCase(name)) {
			po_co_cd(value);
			return;
		}
		if ($po_co_nm.equalsIgnoreCase(name)) {
			po_co_nm(value);
			return;
		}
		if ($po_co_alt_nm1.equalsIgnoreCase(name)) {
			po_co_alt_nm1(value);
			return;
		}
		if ($po_co_alt_nm2.equalsIgnoreCase(name)) {
			po_co_alt_nm2(value);
			return;
		}
		if ($po_co_alt_nm3.equalsIgnoreCase(name)) {
			po_co_alt_nm3(value);
			return;
		}
		if ($po_co_alt_nm4.equalsIgnoreCase(name)) {
			po_co_alt_nm4(value);
			return;
		}
		if ($po_co_zip_cd.equalsIgnoreCase(name)) {
			po_co_zip_cd(value);
			return;
		}
		if ($po_co_addr1.equalsIgnoreCase(name)) {
			po_co_addr1(value);
			return;
		}
		if ($po_co_addr2.equalsIgnoreCase(name)) {
			po_co_addr2(value);
			return;
		}
		if ($po_co_addr3.equalsIgnoreCase(name)) {
			po_co_addr3(value);
			return;
		}
		if ($po_co_addr4.equalsIgnoreCase(name)) {
			po_co_addr4(value);
			return;
		}
		if ($po_co_addr.equalsIgnoreCase(name)) {
			po_co_addr(value);
			return;
		}
		if ($po_co_tel.equalsIgnoreCase(name)) {
			po_co_tel(value);
			return;
		}
		if ($po_co_fax.equalsIgnoreCase(name)) {
			po_co_fax(value);
			return;
		}
		if ($po_co_cntct_dpt.equalsIgnoreCase(name)) {
			po_co_cntct_dpt(value);
			return;
		}
		if ($po_co_cntct_psn.equalsIgnoreCase(name)) {
			po_co_cntct_psn(value);
			return;
		}
		if ($po_co_cntct_psn_title.equalsIgnoreCase(name)) {
			po_co_cntct_psn_title(value);
			return;
		}
		if ($po_co_cntry_nm.equalsIgnoreCase(name)) {
			po_co_cntry_nm(value);
			return;
		}
		if ($dlv_id_typ.equalsIgnoreCase(name)) {
			dlv_id_typ(value);
			return;
		}
		if ($dlv_id_nm.equalsIgnoreCase(name)) {
			dlv_id_nm(value);
			return;
		}
		if ($dlv_id_alt_nm1.equalsIgnoreCase(name)) {
			dlv_id_alt_nm1(value);
			return;
		}
		if ($dlv_id_alt_nm2.equalsIgnoreCase(name)) {
			dlv_id_alt_nm2(value);
			return;
		}
		if ($dlv_id_alt_nm3.equalsIgnoreCase(name)) {
			dlv_id_alt_nm3(value);
			return;
		}
		if ($dlv_id_alt_nm4.equalsIgnoreCase(name)) {
			dlv_id_alt_nm4(value);
			return;
		}
		if ($dlv_id_cd.equalsIgnoreCase(name)) {
			dlv_id_cd(value);
			return;
		}
		if ($dlv_zip_cd.equalsIgnoreCase(name)) {
			dlv_zip_cd(value);
			return;
		}
		if ($dlv_addr1.equalsIgnoreCase(name)) {
			dlv_addr1(value);
			return;
		}
		if ($dlv_addr2.equalsIgnoreCase(name)) {
			dlv_addr2(value);
			return;
		}
		if ($dlv_addr3.equalsIgnoreCase(name)) {
			dlv_addr3(value);
			return;
		}
		if ($dlv_addr4.equalsIgnoreCase(name)) {
			dlv_addr4(value);
			return;
		}
		if ($dlv_addr.equalsIgnoreCase(name)) {
			dlv_addr(value);
			return;
		}
		if ($dlv_tel.equalsIgnoreCase(name)) {
			dlv_tel(value);
			return;
		}
		if ($dlv_fax.equalsIgnoreCase(name)) {
			dlv_fax(value);
			return;
		}
		if ($dlv_cntct_dpt.equalsIgnoreCase(name)) {
			dlv_cntct_dpt(value);
			return;
		}
		if ($dlv_cntct_psn.equalsIgnoreCase(name)) {
			dlv_cntct_psn(value);
			return;
		}
		if ($dlv_cntct_psn_title.equalsIgnoreCase(name)) {
			dlv_cntct_psn_title(value);
			return;
		}
		if ($dlv_cntry_nm.equalsIgnoreCase(name)) {
			dlv_cntry_nm(value);
			return;
		}
		if ($dlv_slip_po_no_lbl.equalsIgnoreCase(name)) {
			dlv_slip_po_no_lbl(value);
			return;
		}
		if ($dlv_slip_po_no.equalsIgnoreCase(name)) {
			dlv_slip_po_no(value);
			return;
		}
		if ($eiaj_dlv_slip_po_no.equalsIgnoreCase(name)) {
			eiaj_dlv_slip_po_no(value);
			return;
		}
		if ($s_ttl_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			s_ttl_trd_cur_tax_amt(value);
			return;
		}
		if ($s_ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			s_ttl_trd_cur_amt(value);
			return;
		}
		if ($s_ttl_trd_cur_tax_in_amt.equalsIgnoreCase(name)) {
			s_ttl_trd_cur_tax_in_amt(value);
			return;
		}
		if ($s_ttl_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			s_ttl_trd_cur_dscnt_amt(value);
			return;
		}
		if ($dlv_slip_act_no.equalsIgnoreCase(name)) {
			dlv_slip_act_no(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($po_trd_rmrks.equalsIgnoreCase(name)) {
			po_trd_rmrks(value);
			return;
		}
		if ($po_sub_char1.equalsIgnoreCase(name)) {
			po_sub_char1(value);
			return;
		}
		if ($po_sub_char2.equalsIgnoreCase(name)) {
			po_sub_char2(value);
			return;
		}
		if ($po_sub_char3.equalsIgnoreCase(name)) {
			po_sub_char3(value);
			return;
		}
		if ($dlv_slip_sub_char1.equalsIgnoreCase(name)) {
			dlv_slip_sub_char1(value);
			return;
		}
		if ($dlv_slip_sub_char2.equalsIgnoreCase(name)) {
			dlv_slip_sub_char2(value);
			return;
		}
		if ($dlv_slip_sub_char3.equalsIgnoreCase(name)) {
			dlv_slip_sub_char3(value);
			return;
		}
		if ($b_eiaj1.equalsIgnoreCase(name)) {
			b_eiaj1(value);
			return;
		}
		if ($b_eiaj2.equalsIgnoreCase(name)) {
			b_eiaj2(value);
			return;
		}
		if ($b_eiaj3.equalsIgnoreCase(name)) {
			b_eiaj3(value);
			return;
		}
		if ($b_eiaj4.equalsIgnoreCase(name)) {
			b_eiaj4(value);
			return;
		}
		if ($s_eiaj_b_slo_po_qty.equalsIgnoreCase(name)) {
			s_eiaj_b_slo_po_qty(value);
			return;
		}
		if ($dlv_lbl.equalsIgnoreCase(name)) {
			dlv_lbl(value);
			return;
		}
		if ($ship_dt_lbl.equalsIgnoreCase(name)) {
			ship_dt_lbl(value);
			return;
		}
		if ($dlv_dt_lbl.equalsIgnoreCase(name)) {
			dlv_dt_lbl(value);
			return;
		}
		if ($lg_grp_lbl.equalsIgnoreCase(name)) {
			lg_grp_lbl(value);
			return;
		}
		if ($cst_lbl.equalsIgnoreCase(name)) {
			cst_lbl(value);
			return;
		}
		if ($ship_dlv_slip_no_lbl.equalsIgnoreCase(name)) {
			ship_dlv_slip_no_lbl(value);
			return;
		}
		if ($xrate_lbl.equalsIgnoreCase(name)) {
			xrate_lbl(value);
			return;
		}
		if ($tax_rate_lbl.equalsIgnoreCase(name)) {
			tax_rate_lbl(value);
			return;
		}
		if ($s_ttl_trd_cur_dscnt_amt2.equalsIgnoreCase(name)) {
			s_ttl_trd_cur_dscnt_amt2(value);
			return;
		}
		if ($s_ttl_trd_cur_amt2.equalsIgnoreCase(name)) {
			s_ttl_trd_cur_amt2(value);
			return;
		}
		if ($s_ttl_trd_cur_tax_amt2.equalsIgnoreCase(name)) {
			s_ttl_trd_cur_tax_amt2(value);
			return;
		}
		if ($s_ttl_ex_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			s_ttl_ex_trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_nm2.equalsIgnoreCase(name)) {
			trd_cur_nm2(value);
			return;
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			base_cur_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_seq_view.equalsIgnoreCase(name)) {
			dlv_slip_seq_view(value);
			return;
		}
		if ($ttl_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_tax_amt(value);
			return;
		}
		if ($ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_amt(value);
			return;
		}
		if ($ttl_trd_cur_tax_in_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_tax_in_amt(value);
			return;
		}
		if ($ttl_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_dscnt_amt(value);
			return;
		}
		if ($eiaj_b_slo_po_qty.equalsIgnoreCase(name)) {
			eiaj_b_slo_po_qty(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ttl_ex_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			ttl_ex_trd_cur_tax_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_seq_view.equalsIgnoreCase(name)) {
			dlv_slip_seq_view(value);
			return;
		}
		if ($ttl_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_tax_amt(value);
			return;
		}
		if ($ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_amt(value);
			return;
		}
		if ($ttl_trd_cur_tax_in_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_tax_in_amt(value);
			return;
		}
		if ($ttl_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_dscnt_amt(value);
			return;
		}
		if ($eiaj_b_slo_po_qty.equalsIgnoreCase(name)) {
			eiaj_b_slo_po_qty(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ttl_ex_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			ttl_ex_trd_cur_tax_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_seq_view.equalsIgnoreCase(name)) {
			dlv_slip_seq_view(value);
			return;
		}
		if ($ttl_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_tax_amt(value);
			return;
		}
		if ($ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_amt(value);
			return;
		}
		if ($ttl_trd_cur_tax_in_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_tax_in_amt(value);
			return;
		}
		if ($ttl_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_dscnt_amt(value);
			return;
		}
		if ($eiaj_b_slo_po_qty.equalsIgnoreCase(name)) {
			eiaj_b_slo_po_qty(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ttl_ex_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			ttl_ex_trd_cur_tax_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_seq_view.equalsIgnoreCase(name)) {
			dlv_slip_seq_view(value);
			return;
		}
		if ($ttl_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_tax_amt(value);
			return;
		}
		if ($ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_amt(value);
			return;
		}
		if ($ttl_trd_cur_tax_in_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_tax_in_amt(value);
			return;
		}
		if ($ttl_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_dscnt_amt(value);
			return;
		}
		if ($eiaj_b_slo_po_qty.equalsIgnoreCase(name)) {
			eiaj_b_slo_po_qty(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ttl_ex_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			ttl_ex_trd_cur_tax_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_seq_view.equalsIgnoreCase(name)) {
			dlv_slip_seq_view(value);
			return;
		}
		if ($ttl_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_tax_amt(value);
			return;
		}
		if ($ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_amt(value);
			return;
		}
		if ($ttl_trd_cur_tax_in_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_tax_in_amt(value);
			return;
		}
		if ($ttl_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_dscnt_amt(value);
			return;
		}
		if ($eiaj_b_slo_po_qty.equalsIgnoreCase(name)) {
			eiaj_b_slo_po_qty(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ttl_ex_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			ttl_ex_trd_cur_tax_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($print_hm.equalsIgnoreCase(name)) {
			print_hm(value);
			return;
		}
		if ($ship_dt.equalsIgnoreCase(name)) {
			ship_dt(value);
			return;
		}
		if ($ship_tm.equalsIgnoreCase(name)) {
			ship_tm(value);
			return;
		}
		if ($dlv_dt.equalsIgnoreCase(name)) {
			dlv_dt(value);
			return;
		}
		if ($dlv_tm.equalsIgnoreCase(name)) {
			dlv_tm(value);
			return;
		}
		if ($dlv_rqst_dt.equalsIgnoreCase(name)) {
			dlv_rqst_dt(value);
			return;
		}
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			dlv_rqst_tm(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($adjst_slip_flg.equalsIgnoreCase(name)) {
			adjst_slip_flg(value);
			return;
		}
		if ($prov_flg.equalsIgnoreCase(name)) {
			prov_flg(value);
			return;
		}
		if ($sls_flg.equalsIgnoreCase(name)) {
			sls_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

