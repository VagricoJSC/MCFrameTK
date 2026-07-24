package mcframe.commonMSLA.MSLAR0020;

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
 * ブロック"Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DtlR_MC_A extends MCConstRow {

	/**
	 *  データ行ＮＯ.<p>
	 *
	 */
	public static final String $data_lno = "data_lno";
	/**
	 *  データＮＯ.<p>
	 *
	 */
	public static final String $data_no = "data_no";
	/**
	 *  取引種別ＣＤ.<p>
	 *
	 */
	public static final String $trd_typ_cd = "trd_typ_cd";
	/**
	 *  送信元レコード作成日時.<p>
	 *
	 */
	public static final String $data_make_dt = "data_make_dt";
	/**
	 *  データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 *  発注更新区分.<p>
	 *
	 */
	public static final String $po_crud_typ = "po_crud_typ";
	/**
	 *  発注ＮＯ.<p>
	 *
	 */
	public static final String $po_no = "po_no";
	/**
	 *  発注改訂番号.<p>
	 *
	 */
	public static final String $po_rev = "po_rev";
	/**
	 *  発注明細ＮＯ.<p>
	 *
	 */
	public static final String $po_d_no = "po_d_no";
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
	 *  発注者国ＣＤ.<p>
	 *
	 */
	public static final String $po_co_cntry_cd = "po_co_cntry_cd";
	/**
	 *  受注者ＣＤ.<p>
	 *
	 */
	public static final String $slo_co_cd = "slo_co_cd";
	/**
	 *  受注者名.<p>
	 *
	 */
	public static final String $slo_co_nm = "slo_co_nm";
	/**
	 *  受注者国ＣＤ.<p>
	 *
	 */
	public static final String $slo_co_cntry_cd = "slo_co_cntry_cd";
	/**
	 *  注文日.<p>
	 *
	 */
	public static final String $po_dt = "po_dt";
	/**
	 *  変更注文書発行予定日.<p>
	 *
	 */
	public static final String $upd_po_print_schd_dt = "upd_po_print_schd_dt";
	/**
	 *  訂正理由.<p>
	 *
	 */
	public static final String $crct_rsn_nm = "crct_rsn_nm";
	/**
	 *  訂正理由備考.<p>
	 *
	 */
	public static final String $crct_rsn_rmrks = "crct_rsn_rmrks";
	/**
	 *  注文書表示テキスト.<p>
	 *
	 */
	public static final String $po_print_txt = "po_print_txt";
	/**
	 *  注文書備考.<p>
	 *
	 */
	public static final String $po_print_rmrks = "po_print_rmrks";
	/**
	 *  注文明細備考.<p>
	 *
	 */
	public static final String $po_print_d_rmrks = "po_print_d_rmrks";
	/**
	 *  購買部門ＣＤ.<p>
	 *
	 */
	public static final String $purc_dpt_cd = "purc_dpt_cd";
	/**
	 *  購買部門名.<p>
	 *
	 */
	public static final String $purc_dpt_nm = "purc_dpt_nm";
	/**
	 *  購買担当者ＣＤ.<p>
	 *
	 */
	public static final String $purc_usr_cd = "purc_usr_cd";
	/**
	 *  購買担当者名.<p>
	 *
	 */
	public static final String $purc_usr_nm = "purc_usr_nm";
	/**
	 *  発注者品目ＣＤ.<p>
	 *
	 */
	public static final String $po_co_itm_cd = "po_co_itm_cd";
	/**
	 *  発注者枝番１.<p>
	 *
	 */
	public static final String $po_co_itm_sub1 = "po_co_itm_sub1";
	/**
	 *  発注者枝番２.<p>
	 *
	 */
	public static final String $po_co_itm_sub2 = "po_co_itm_sub2";
	/**
	 *  発注者枝番３.<p>
	 *
	 */
	public static final String $po_co_itm_sub3 = "po_co_itm_sub3";
	/**
	 *  発注者品名.<p>
	 *
	 */
	public static final String $po_co_itm_nm = "po_co_itm_nm";
	/**
	 *  発注者インボイス表記品名.<p>
	 *
	 */
	public static final String $po_co_iv_itm_nm = "po_co_iv_itm_nm";
	/**
	 *  発注者諸口品ＦＬＧ.<p>
	 *
	 */
	public static final String $po_co_sundry_itm_flg = "po_co_sundry_itm_flg";
	/**
	 *  仕向先ＣＤ１.<p>
	 *
	 */
	public static final String $dest_cd1 = "dest_cd1";
	/**
	 *  仕向先名１.<p>
	 *
	 */
	public static final String $dest_nm1 = "dest_nm1";
	/**
	 *  仕向先ＣＤ２.<p>
	 *
	 */
	public static final String $dest_cd2 = "dest_cd2";
	/**
	 *  仕向先名２.<p>
	 *
	 */
	public static final String $dest_nm2 = "dest_nm2";
	/**
	 *  仕向先ＣＤ３.<p>
	 *
	 */
	public static final String $dest_cd3 = "dest_cd3";
	/**
	 *  仕向先名３.<p>
	 *
	 */
	public static final String $dest_nm3 = "dest_nm3";
	/**
	 *  外注ＦＬＧ.<p>
	 *
	 */
	public static final String $outsrc_flg = "outsrc_flg";
	/**
	 *  直送ＦＬＧ.<p>
	 *
	 */
	public static final String $drct_dlv_flg = "drct_dlv_flg";
	/**
	 *  購買識別区分.<p>
	 *
	 */
	public static final String $purc_id_typ = "purc_id_typ";
	/**
	 *  預り売上ＦＬＧ.<p>
	 *
	 */
	public static final String $sls_cststk_flg = "sls_cststk_flg";
	/**
	 *  受注区分.<p>
	 *
	 */
	public static final String $slo_typ = "slo_typ";
	/**
	 *  売上部門ＣＤ.<p>
	 *
	 */
	public static final String $sls_dpt_cd = "sls_dpt_cd";
	/**
	 *  売上部門名.<p>
	 *
	 */
	public static final String $sls_dpt_nm = "sls_dpt_nm";
	/**
	 *  売上担当者ＣＤ.<p>
	 *
	 */
	public static final String $sls_usr_cd = "sls_usr_cd";
	/**
	 *  売上担当者名.<p>
	 *
	 */
	public static final String $sls_usr_nm = "sls_usr_nm";
	/**
	 *  納入先識別区分.<p>
	 *
	 */
	public static final String $in_to_id_typ = "in_to_id_typ";
	/**
	 *  納入先識別ＣＤ.<p>
	 *
	 */
	public static final String $in_to_id_cd = "in_to_id_cd";
	/**
	 *  納入先名.<p>
	 *
	 */
	public static final String $in_to_nm = "in_to_nm";
	/**
	 *  納入先郵便番号.<p>
	 *
	 */
	public static final String $in_to_zip_cd = "in_to_zip_cd";
	/**
	 *  納入先住所１.<p>
	 *
	 */
	public static final String $in_to_addr1 = "in_to_addr1";
	/**
	 *  納入先住所２.<p>
	 *
	 */
	public static final String $in_to_addr2 = "in_to_addr2";
	/**
	 *  納入先住所３.<p>
	 *
	 */
	public static final String $in_to_addr3 = "in_to_addr3";
	/**
	 *  納入先住所４.<p>
	 *
	 */
	public static final String $in_to_addr4 = "in_to_addr4";
	/**
	 *  納入先担当部署.<p>
	 *
	 */
	public static final String $in_to_cntct_dpt = "in_to_cntct_dpt";
	/**
	 *  納入先担当者.<p>
	 *
	 */
	public static final String $in_to_cntct_psn = "in_to_cntct_psn";
	/**
	 *  納入先ＴＥＬ.<p>
	 *
	 */
	public static final String $in_to_tel = "in_to_tel";
	/**
	 *  納入先ＦＡＸ.<p>
	 *
	 */
	public static final String $in_to_fax = "in_to_fax";
	/**
	 *  納入先諸口ＦＬＧ.<p>
	 *
	 */
	public static final String $in_to_sundry_flg = "in_to_sundry_flg";
	/**
	 *  納入先国ＣＤ.<p>
	 *
	 */
	public static final String $in_to_cntry_cd = "in_to_cntry_cd";
	/**
	 *  工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $site_cd = "site_cd";
	/**
	 *  工場・物流倉庫名.<p>
	 *
	 */
	public static final String $site_nm = "site_nm";
	/**
	 *  直送発注先ＣＤ.<p>
	 *
	 */
	public static final String $drct_dlv_bp_cd = "drct_dlv_bp_cd";
	/**
	 *  直送発注先名.<p>
	 *
	 */
	public static final String $drct_dlv_bp_nm = "drct_dlv_bp_nm";
	/**
	 *  直送発注先国ＣＤ.<p>
	 *
	 */
	public static final String $drct_dlv_cntry_cd = "drct_dlv_cntry_cd";
	/**
	 *  配送先ＣＤ.<p>
	 *
	 */
	public static final String $tdlv_cd = "tdlv_cd";
	/**
	 *  配送先名.<p>
	 *
	 */
	public static final String $tdlv_nm = "tdlv_nm";
	/**
	 *  配送先郵便番号.<p>
	 *
	 */
	public static final String $tdlv_zip_cd = "tdlv_zip_cd";
	/**
	 *  配送先住所１.<p>
	 *
	 */
	public static final String $tdlv_addr1 = "tdlv_addr1";
	/**
	 *  配送先住所２.<p>
	 *
	 */
	public static final String $tdlv_addr2 = "tdlv_addr2";
	/**
	 *  配送先住所３.<p>
	 *
	 */
	public static final String $tdlv_addr3 = "tdlv_addr3";
	/**
	 *  配送先住所４.<p>
	 *
	 */
	public static final String $tdlv_addr4 = "tdlv_addr4";
	/**
	 *  配送先担当部署.<p>
	 *
	 */
	public static final String $tdlv_cntct_dpt = "tdlv_cntct_dpt";
	/**
	 *  配送先担当者.<p>
	 *
	 */
	public static final String $tdlv_cntct_psn = "tdlv_cntct_psn";
	/**
	 *  配送先ＴＥＬ.<p>
	 *
	 */
	public static final String $tdlv_tel = "tdlv_tel";
	/**
	 *  配送先ＦＡＸ.<p>
	 *
	 */
	public static final String $tdlv_fax = "tdlv_fax";
	/**
	 *  配送先諸口ＦＬＧ.<p>
	 *
	 */
	public static final String $tdlv_sundry_flg = "tdlv_sundry_flg";
	/**
	 *  配送先国ＣＤ.<p>
	 *
	 */
	public static final String $tdlv_cntry_cd = "tdlv_cntry_cd";
	/**
	 *  納品書備考.<p>
	 *
	 */
	public static final String $dlv_slip_rmrks = "dlv_slip_rmrks";
	/**
	 *  納品書明細備考.<p>
	 *
	 */
	public static final String $dlv_slip_d_rmrks = "dlv_slip_d_rmrks";
	/**
	 *  着曜日.<p>
	 *
	 */
	public static final String $dlv_day_week_typ = "dlv_day_week_typ";
	/**
	 *  価格印字区分.<p>
	 *
	 */
	public static final String $pri_prnt_typ = "pri_prnt_typ";
	/**
	 *  案件ＮＯ.<p>
	 *
	 */
	public static final String $wrk_no = "wrk_no";
	/**
	 *  案件名.<p>
	 *
	 */
	public static final String $wrk_nm = "wrk_nm";
	/**
	 *  取引条件ＣＤ１.<p>
	 *
	 */
	public static final String $tterm_cd1 = "tterm_cd1";
	/**
	 *  取引条件名１.<p>
	 *
	 */
	public static final String $tterm_nm1 = "tterm_nm1";
	/**
	 *  取引条件備考１.<p>
	 *
	 */
	public static final String $tterm_rmrks1 = "tterm_rmrks1";
	/**
	 *  取引条件ＣＤ２.<p>
	 *
	 */
	public static final String $tterm_cd2 = "tterm_cd2";
	/**
	 *  取引条件名２.<p>
	 *
	 */
	public static final String $tterm_nm2 = "tterm_nm2";
	/**
	 *  取引条件備考２.<p>
	 *
	 */
	public static final String $tterm_rmrks2 = "tterm_rmrks2";
	/**
	 *  取引条件ＣＤ３.<p>
	 *
	 */
	public static final String $tterm_cd3 = "tterm_cd3";
	/**
	 *  取引条件名３.<p>
	 *
	 */
	public static final String $tterm_nm3 = "tterm_nm3";
	/**
	 *  取引条件備考３.<p>
	 *
	 */
	public static final String $tterm_rmrks3 = "tterm_rmrks3";
	/**
	 *  輸送方法ＣＤ.<p>
	 *
	 */
	public static final String $trnspt_cd = "trnspt_cd";
	/**
	 *  輸送方法名.<p>
	 *
	 */
	public static final String $trnspt_nm = "trnspt_nm";
	/**
	 *  船積港ＣＤ.<p>
	 *
	 */
	public static final String $load_port_cd = "load_port_cd";
	/**
	 *  船積港名.<p>
	 *
	 */
	public static final String $load_port_nm = "load_port_nm";
	/**
	 *  船卸港ＣＤ.<p>
	 *
	 */
	public static final String $dschrg_port_cd = "dschrg_port_cd";
	/**
	 *  船卸港名.<p>
	 *
	 */
	public static final String $dschrg_port_nm = "dschrg_port_nm";
	/**
	 *  経由地ＣＤ.<p>
	 *
	 */
	public static final String $via_port_cd = "via_port_cd";
	/**
	 *  経由地名.<p>
	 *
	 */
	public static final String $via_port_nm = "via_port_nm";
	/**
	 *  受注者品目ＣＤ.<p>
	 *
	 */
	public static final String $slo_co_itm_cd = "slo_co_itm_cd";
	/**
	 *  受注者枝番１.<p>
	 *
	 */
	public static final String $slo_co_itm_sub1 = "slo_co_itm_sub1";
	/**
	 *  受注者枝番２.<p>
	 *
	 */
	public static final String $slo_co_itm_sub2 = "slo_co_itm_sub2";
	/**
	 *  受注者枝番３.<p>
	 *
	 */
	public static final String $slo_co_itm_sub3 = "slo_co_itm_sub3";
	/**
	 *  受注者品名.<p>
	 *
	 */
	public static final String $slo_co_itm_nm = "slo_co_itm_nm";
	/**
	 *  原産地ＣＤ.<p>
	 *
	 */
	public static final String $cntry_org_cd = "cntry_org_cd";
	/**
	 *  手配ＮＯ１.<p>
	 *
	 */
	public static final String $sno1 = "sno1";
	/**
	 *  手配ＮＯ２.<p>
	 *
	 */
	public static final String $sno2 = "sno2";
	/**
	 *  手配ＮＯ３.<p>
	 *
	 */
	public static final String $sno3 = "sno3";
	/**
	 *  手配ＮＯ４.<p>
	 *
	 */
	public static final String $sno4 = "sno4";
	/**
	 *  格付ＣＤ.<p>
	 *
	 */
	public static final String $gd_cd = "gd_cd";
	/**
	 *  格付名.<p>
	 *
	 */
	public static final String $gd_nm = "gd_nm";
	/**
	 *  取引単位ＣＤ.<p>
	 *
	 */
	public static final String $trd_unit_cd = "trd_unit_cd";
	/**
	 *  取引単位名.<p>
	 *
	 */
	public static final String $trd_unit_nm = "trd_unit_nm";
	/**
	 *  取引単位数量.<p>
	 *
	 */
	public static final String $trd_unit_qty = "trd_unit_qty";
	/**
	 *  取引通貨ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	/**
	 *  内税ＦＬＧ.<p>
	 *
	 */
	public static final String $inc_tax_flg = "inc_tax_flg";
	/**
	 *  仮単価ＦＬＧ.<p>
	 *
	 */
	public static final String $interim_flg = "interim_flg";
	/**
	 *  取引通貨単価.<p>
	 *
	 */
	public static final String $trd_cur_upri = "trd_cur_upri";
	/**
	 *  取引通貨金額.<p>
	 *
	 */
	public static final String $trd_cur_amt = "trd_cur_amt";
	/**
	 *  取引通貨値引額.<p>
	 *
	 */
	public static final String $trd_cur_dscnt_amt = "trd_cur_dscnt_amt";
	/**
	 *  値引理由ＣＤ.<p>
	 *
	 */
	public static final String $dscnt_rsn_cd = "dscnt_rsn_cd";
	/**
	 *  値引理由名.<p>
	 *
	 */
	public static final String $dscnt_rsn_nm = "dscnt_rsn_nm";
	/**
	 *  税指定ＦＬＧ.<p>
	 *
	 */
	public static final String $tax_fix_flg = "tax_fix_flg";
	/**
	 *  税ＣＤ.<p>
	 *
	 */
	public static final String $tax_cd = "tax_cd";
	/**
	 *  税名.<p>
	 *
	 */
	public static final String $tax_nm = "tax_nm";
	/**
	 *  税率.<p>
	 *
	 */
	public static final String $tax_rate = "tax_rate";
	/**
	 *  税区分.<p>
	 *
	 */
	public static final String $tax_typ = "tax_typ";
	/**
	 *  取引通貨税額.<p>
	 *
	 */
	public static final String $trd_cur_tax_amt = "trd_cur_tax_amt";
	/**
	 *  出荷倉庫ＣＤ.<p>
	 *
	 */
	public static final String $ship_wh_cd = "ship_wh_cd";
	/**
	 *  出荷倉庫名.<p>
	 *
	 */
	public static final String $ship_wh_nm = "ship_wh_nm";
	/**
	 *  出荷留めＦＬＧ.<p>
	 *
	 */
	public static final String $ship_block_flg = "ship_block_flg";
	/**
	 *  打切ＦＬＧ.<p>
	 *
	 */
	public static final String $abort_flg = "abort_flg";
	/**
	 *  品揃グループＮＯ.<p>
	 *
	 */
	public static final String $set_itm_grp_no = "set_itm_grp_no";
	/**
	 *  納入希望日.<p>
	 *
	 */
	public static final String $dlv_rqst_dt = "dlv_rqst_dt";
	/**
	 *  納入希望時刻.<p>
	 *
	 */
	public static final String $dlv_rqst_hm = "dlv_rqst_hm";
	/**
	 *  仕入予定日.<p>
	 *
	 */
	public static final String $purc_schd_dt = "purc_schd_dt";
	/**
	 *  メーカＣＤ.<p>
	 *
	 */
	public static final String $maker_cd = "maker_cd";
	/**
	 *  メーカ名.<p>
	 *
	 */
	public static final String $maker_nm = "maker_nm";
	/**
	 *  版ＮＯ.<p>
	 *
	 */
	public static final String $ver_no = "ver_no";
	/**
	 *  ロットＮＯ.<p>
	 *
	 */
	public static final String $lot_no = "lot_no";
	/**
	 *  サブロットＮＯ.<p>
	 *
	 */
	public static final String $sublot_no = "sublot_no";
	/**
	 *  予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	/**
	 *  予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	/**
	 *  予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";
	/**
	 *  予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public static final String $sub_char4 = "sub_char4";
	/**
	 *  予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public static final String $sub_char5 = "sub_char5";
	/**
	 *  予備ＣＨＡＲ項目６.<p>
	 *
	 */
	public static final String $sub_char6 = "sub_char6";
	/**
	 *  予備ＣＨＡＲ項目７.<p>
	 *
	 */
	public static final String $sub_char7 = "sub_char7";
	/**
	 *  予備ＣＨＡＲ項目８.<p>
	 *
	 */
	public static final String $sub_char8 = "sub_char8";
	/**
	 *  予備ＣＨＡＲ項目９.<p>
	 *
	 */
	public static final String $sub_char9 = "sub_char9";
	/**
	 *  予備ＣＨＡＲ項目１０.<p>
	 *
	 */
	public static final String $sub_char10 = "sub_char10";
	/**
	 *  予備ＣＨＡＲ項目１１.<p>
	 *
	 */
	public static final String $sub_char11 = "sub_char11";
	/**
	 *  予備ＣＨＡＲ項目１２.<p>
	 *
	 */
	public static final String $sub_char12 = "sub_char12";
	/**
	 *  予備ＣＨＡＲ項目１３.<p>
	 *
	 */
	public static final String $sub_char13 = "sub_char13";
	/**
	 *  予備ＣＨＡＲ項目１４.<p>
	 *
	 */
	public static final String $sub_char14 = "sub_char14";
	/**
	 *  予備ＣＨＡＲ項目１５.<p>
	 *
	 */
	public static final String $sub_char15 = "sub_char15";
	/**
	 *  予備ＣＨＡＲ項目１６.<p>
	 *
	 */
	public static final String $sub_char16 = "sub_char16";
	/**
	 *  予備ＣＨＡＲ項目１７.<p>
	 *
	 */
	public static final String $sub_char17 = "sub_char17";
	/**
	 *  予備ＣＨＡＲ項目１８.<p>
	 *
	 */
	public static final String $sub_char18 = "sub_char18";
	/**
	 *  予備ＣＨＡＲ項目１９.<p>
	 *
	 */
	public static final String $sub_char19 = "sub_char19";
	/**
	 *  予備ＣＨＡＲ項目２０.<p>
	 *
	 */
	public static final String $sub_char20 = "sub_char20";
	/**
	 *  予備ＣＨＡＲ項目２１.<p>
	 *
	 */
	public static final String $sub_char21 = "sub_char21";
	/**
	 *  予備ＣＨＡＲ項目２２.<p>
	 *
	 */
	public static final String $sub_char22 = "sub_char22";
	/**
	 *  予備ＣＨＡＲ項目２３.<p>
	 *
	 */
	public static final String $sub_char23 = "sub_char23";
	/**
	 *  予備ＣＨＡＲ項目２４.<p>
	 *
	 */
	public static final String $sub_char24 = "sub_char24";
	/**
	 *  予備ＣＨＡＲ項目２５.<p>
	 *
	 */
	public static final String $sub_char25 = "sub_char25";
	/**
	 *  予備ＣＨＡＲ項目２６.<p>
	 *
	 */
	public static final String $sub_char26 = "sub_char26";
	/**
	 *  予備ＣＨＡＲ項目２７.<p>
	 *
	 */
	public static final String $sub_char27 = "sub_char27";
	/**
	 *  予備ＣＨＡＲ項目２８.<p>
	 *
	 */
	public static final String $sub_char28 = "sub_char28";
	/**
	 *  予備ＣＨＡＲ項目２９.<p>
	 *
	 */
	public static final String $sub_char29 = "sub_char29";
	/**
	 *  予備ＣＨＡＲ項目３０.<p>
	 *
	 */
	public static final String $sub_char30 = "sub_char30";
	/**
	 *  予備ＮＵＭ項目１.<p>
	 *
	 */
	public static final String $sub_num1 = "sub_num1";
	/**
	 *  予備ＮＵＭ項目２.<p>
	 *
	 */
	public static final String $sub_num2 = "sub_num2";
	/**
	 *  予備ＮＵＭ項目３.<p>
	 *
	 */
	public static final String $sub_num3 = "sub_num3";
	/**
	 *  予備ＮＵＭ項目４.<p>
	 *
	 */
	public static final String $sub_num4 = "sub_num4";
	/**
	 *  予備ＮＵＭ項目５.<p>
	 *
	 */
	public static final String $sub_num5 = "sub_num5";
	/**
	 *  予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public static final String $sub_dt1 = "sub_dt1";
	/**
	 *  予備ＤＡＴＥ項目２.<p>
	 *
	 */
	public static final String $sub_dt2 = "sub_dt2";
	/**
	 *  予備ＤＡＴＥ項目３.<p>
	 *
	 */
	public static final String $sub_dt3 = "sub_dt3";
	/**
	 *  予備ＤＡＴＥ項目４.<p>
	 *
	 */
	public static final String $sub_dt4 = "sub_dt4";
	/**
	 *  予備ＤＡＴＥ項目５.<p>
	 *
	 */
	public static final String $sub_dt5 = "sub_dt5";
	/**
	 *  ＥＤＩ予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public static final String $edi_sub_char1 = "edi_sub_char1";
	/**
	 *  ＥＤＩ予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public static final String $edi_sub_char2 = "edi_sub_char2";
	/**
	 *  ＥＤＩ予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public static final String $edi_sub_char3 = "edi_sub_char3";
	/**
	 *  ＥＤＩ予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public static final String $edi_sub_char4 = "edi_sub_char4";
	/**
	 *  ＥＤＩ予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public static final String $edi_sub_char5 = "edi_sub_char5";
	/**
	 *  ＥＤＩ予備ＮＵＭ項目１.<p>
	 *
	 */
	public static final String $edi_sub_num1 = "edi_sub_num1";
	/**
	 *  ＥＤＩ予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public static final String $edi_sub_dt1 = "edi_sub_dt1";
	/**
	 *  ＥＤＩ明細予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public static final String $edi_sub_d_char1 = "edi_sub_d_char1";
	/**
	 *  ＥＤＩ明細予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public static final String $edi_sub_d_char2 = "edi_sub_d_char2";
	/**
	 *  ＥＤＩ明細予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public static final String $edi_sub_d_char3 = "edi_sub_d_char3";
	/**
	 *  ＥＤＩ明細予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public static final String $edi_sub_d_char4 = "edi_sub_d_char4";
	/**
	 *  ＥＤＩ明細予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public static final String $edi_sub_d_char5 = "edi_sub_d_char5";
	/**
	 *  ＥＤＩ明細予備ＮＵＭ項目１.<p>
	 *
	 */
	public static final String $edi_sub_d_num1 = "edi_sub_d_num1";
	/**
	 *  ＥＤＩ明細予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public static final String $edi_sub_d_dt1 = "edi_sub_d_dt1";


	public static final MCMeta data_lno_META = createCommonMeta($data_lno, mcframe.commonMA.meta.MA_META.IF_DATA_LNO);
	public static final MCMeta data_no_META = createCommonMeta($data_no, mcframe.commonMA.meta.MA_META.IF_DATA_NO);
	public static final MCMeta trd_typ_cd_META = createCommonMeta($trd_typ_cd, mcframe.commonMA.meta.MA_META.IF_TRD_TYP_CD);
	public static final MCMeta data_make_dt_META = createCommonMeta($data_make_dt, mcframe.commonMA.meta.MA_META.YMDHMS);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta po_crud_typ_META = createCommonMeta($po_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta po_no_META = createCommonMeta($po_no, mcframe.commonMA.meta.MA_META.CST_PO_NO);
	public static final MCMeta po_rev_META = createCommonMeta($po_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta po_d_no_META = createCommonMeta($po_d_no, mcframe.commonMA.meta.MA_META.CST_PO_D_NO);
	public static final MCMeta po_co_cd_META = createCommonMeta($po_co_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta po_co_nm_META = createCommonMeta($po_co_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta po_co_cntry_cd_META = createCommonMeta($po_co_cntry_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta slo_co_cd_META = createCommonMeta($slo_co_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta slo_co_nm_META = createCommonMeta($slo_co_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta slo_co_cntry_cd_META = createCommonMeta($slo_co_cntry_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta po_dt_META = createCommonMeta($po_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta upd_po_print_schd_dt_META = createCommonMeta($upd_po_print_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta crct_rsn_nm_META = createCommonMeta($crct_rsn_nm, mcframe.commonMS.meta.MS_META.PO_CRCT_RSN_NM);
	public static final MCMeta crct_rsn_rmrks_META = createCommonMeta($crct_rsn_rmrks, mcframe.commonMS.meta.MS_META.PO_CRCT_RSN_RMRKS);
	public static final MCMeta po_print_txt_META = createCommonMeta($po_print_txt, mcframe.commonMA.meta.MA_META.PO_PRINT_TXT);
	public static final MCMeta po_print_rmrks_META = createCommonMeta($po_print_rmrks, mcframe.commonMS.meta.MS_META.PO_PRINT_RMRKS);
	public static final MCMeta po_print_d_rmrks_META = createCommonMeta($po_print_d_rmrks, mcframe.commonMS.meta.MS_META.PO_PRINT_D_RMRKS);
	public static final MCMeta purc_dpt_cd_META = createCommonMeta($purc_dpt_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta purc_dpt_nm_META = createCommonMeta($purc_dpt_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta purc_usr_cd_META = createCommonMeta($purc_usr_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta purc_usr_nm_META = createCommonMeta($purc_usr_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta po_co_itm_cd_META = createCommonMeta($po_co_itm_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta po_co_itm_sub1_META = createCommonMeta($po_co_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta po_co_itm_sub2_META = createCommonMeta($po_co_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta po_co_itm_sub3_META = createCommonMeta($po_co_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta po_co_itm_nm_META = createCommonMeta($po_co_itm_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta po_co_iv_itm_nm_META = createCommonMeta($po_co_iv_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta po_co_sundry_itm_flg_META = createCommonMeta($po_co_sundry_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dest_cd1_META = createCommonMeta($dest_cd1, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta dest_nm1_META = createCommonMeta($dest_nm1, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta dest_cd2_META = createCommonMeta($dest_cd2, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta dest_nm2_META = createCommonMeta($dest_nm2, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta dest_cd3_META = createCommonMeta($dest_cd3, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta dest_nm3_META = createCommonMeta($dest_nm3, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta outsrc_flg_META = createCommonMeta($outsrc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta drct_dlv_flg_META = createCommonMeta($drct_dlv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_id_typ_META = createCommonMeta($purc_id_typ, mcframe.commonMA.meta.MA_META.PURC_ID_TYP);
	public static final MCMeta sls_cststk_flg_META = createCommonMeta($sls_cststk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta slo_typ_META = createCommonMeta($slo_typ, mcframe.commonMS.meta.MS_META.SLO_TYP);
	public static final MCMeta sls_dpt_cd_META = createCommonMeta($sls_dpt_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta sls_dpt_nm_META = createCommonMeta($sls_dpt_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta sls_usr_cd_META = createCommonMeta($sls_usr_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta sls_usr_nm_META = createCommonMeta($sls_usr_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta in_to_id_typ_META = createCommonMeta($in_to_id_typ, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_TYP);
	public static final MCMeta in_to_id_cd_META = createCommonMeta($in_to_id_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta in_to_nm_META = createCommonMeta($in_to_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta in_to_zip_cd_META = createCommonMeta($in_to_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta in_to_addr1_META = createCommonMeta($in_to_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta in_to_addr2_META = createCommonMeta($in_to_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta in_to_addr3_META = createCommonMeta($in_to_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta in_to_addr4_META = createCommonMeta($in_to_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta in_to_cntct_dpt_META = createCommonMeta($in_to_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta in_to_cntct_psn_META = createCommonMeta($in_to_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta in_to_tel_META = createCommonMeta($in_to_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta in_to_fax_META = createCommonMeta($in_to_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta in_to_sundry_flg_META = createCommonMeta($in_to_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta in_to_cntry_cd_META = createCommonMeta($in_to_cntry_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta site_nm_META = createCommonMeta($site_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta drct_dlv_bp_cd_META = createCommonMeta($drct_dlv_bp_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta drct_dlv_bp_nm_META = createCommonMeta($drct_dlv_bp_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta drct_dlv_cntry_cd_META = createCommonMeta($drct_dlv_cntry_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta tdlv_cd_META = createCommonMeta($tdlv_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta tdlv_nm_META = createCommonMeta($tdlv_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta tdlv_zip_cd_META = createCommonMeta($tdlv_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta tdlv_addr1_META = createCommonMeta($tdlv_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta tdlv_addr2_META = createCommonMeta($tdlv_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta tdlv_addr3_META = createCommonMeta($tdlv_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta tdlv_addr4_META = createCommonMeta($tdlv_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta tdlv_cntct_dpt_META = createCommonMeta($tdlv_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta tdlv_cntct_psn_META = createCommonMeta($tdlv_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta tdlv_tel_META = createCommonMeta($tdlv_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta tdlv_fax_META = createCommonMeta($tdlv_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta tdlv_sundry_flg_META = createCommonMeta($tdlv_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tdlv_cntry_cd_META = createCommonMeta($tdlv_cntry_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta dlv_slip_rmrks_META = createCommonMeta($dlv_slip_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta dlv_slip_d_rmrks_META = createCommonMeta($dlv_slip_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta dlv_day_week_typ_META = createCommonMeta($dlv_day_week_typ, mcframe.commonMA.meta.MA_META.DAY_WEEK_TYP);
	public static final MCMeta pri_prnt_typ_META = createCommonMeta($pri_prnt_typ, mcframe.commonMA.meta.MA_META.PRI_PRNT_TYP);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta tterm_cd1_META = createCommonMeta($tterm_cd1, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta tterm_nm1_META = createCommonMeta($tterm_nm1, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta tterm_rmrks1_META = createCommonMeta($tterm_rmrks1, mcframe.commonMS.meta.MS_META.TTERM_RMRKS1);
	public static final MCMeta tterm_cd2_META = createCommonMeta($tterm_cd2, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta tterm_nm2_META = createCommonMeta($tterm_nm2, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta tterm_rmrks2_META = createCommonMeta($tterm_rmrks2, mcframe.commonMS.meta.MS_META.TTERM_RMRKS2);
	public static final MCMeta tterm_cd3_META = createCommonMeta($tterm_cd3, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta tterm_nm3_META = createCommonMeta($tterm_nm3, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta tterm_rmrks3_META = createCommonMeta($tterm_rmrks3, mcframe.commonMS.meta.MS_META.TTERM_RMRKS3);
	public static final MCMeta trnspt_cd_META = createCommonMeta($trnspt_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta trnspt_nm_META = createCommonMeta($trnspt_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta load_port_cd_META = createCommonMeta($load_port_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta load_port_nm_META = createCommonMeta($load_port_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta dschrg_port_cd_META = createCommonMeta($dschrg_port_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta dschrg_port_nm_META = createCommonMeta($dschrg_port_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta via_port_cd_META = createCommonMeta($via_port_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta via_port_nm_META = createCommonMeta($via_port_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta slo_co_itm_cd_META = createCommonMeta($slo_co_itm_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta slo_co_itm_sub1_META = createCommonMeta($slo_co_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta slo_co_itm_sub2_META = createCommonMeta($slo_co_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta slo_co_itm_sub3_META = createCommonMeta($slo_co_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta slo_co_itm_nm_META = createCommonMeta($slo_co_itm_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta cntry_org_cd_META = createCommonMeta($cntry_org_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta gd_nm_META = createCommonMeta($gd_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta trd_unit_nm_META = createCommonMeta($trd_unit_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta trd_unit_qty_META = createCommonMeta($trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta inc_tax_flg_META = createCommonMeta($inc_tax_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta interim_flg_META = createCommonMeta($interim_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_cur_upri_META = createCommonMeta($trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_amt_META = createCommonMeta($trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_dscnt_amt_META = createCommonMeta($trd_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta dscnt_rsn_cd_META = createCommonMeta($dscnt_rsn_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta dscnt_rsn_nm_META = createCommonMeta($dscnt_rsn_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta tax_fix_flg_META = createCommonMeta($tax_fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tax_cd_META = createCommonMeta($tax_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta tax_nm_META = createCommonMeta($tax_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta tax_rate_META = createCommonMeta($tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta tax_typ_META = createCommonMeta($tax_typ, mcframe.commonMA.meta.MA_META.TAX_TYP);
	public static final MCMeta trd_cur_tax_amt_META = createCommonMeta($trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ship_wh_cd_META = createCommonMeta($ship_wh_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta ship_wh_nm_META = createCommonMeta($ship_wh_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta ship_block_flg_META = createCommonMeta($ship_block_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta abort_flg_META = createCommonMeta($abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta set_itm_grp_no_META = createCommonMeta($set_itm_grp_no, mcframe.commonMA.meta.MA_META.SET_ITM_GRP_NO);
	public static final MCMeta dlv_rqst_dt_META = createCommonMeta($dlv_rqst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dlv_rqst_hm_META = createCommonMeta($dlv_rqst_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta purc_schd_dt_META = createCommonMeta($purc_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta maker_cd_META = createCommonMeta($maker_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta maker_nm_META = createCommonMeta($maker_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR3);
	public static final MCMeta sub_char4_META = createCommonMeta($sub_char4, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR4);
	public static final MCMeta sub_char5_META = createCommonMeta($sub_char5, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR5);
	public static final MCMeta sub_char6_META = createCommonMeta($sub_char6, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR6);
	public static final MCMeta sub_char7_META = createCommonMeta($sub_char7, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR7);
	public static final MCMeta sub_char8_META = createCommonMeta($sub_char8, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR8);
	public static final MCMeta sub_char9_META = createCommonMeta($sub_char9, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR9);
	public static final MCMeta sub_char10_META = createCommonMeta($sub_char10, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR10);
	public static final MCMeta sub_char11_META = createCommonMeta($sub_char11, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR11);
	public static final MCMeta sub_char12_META = createCommonMeta($sub_char12, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR12);
	public static final MCMeta sub_char13_META = createCommonMeta($sub_char13, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR13);
	public static final MCMeta sub_char14_META = createCommonMeta($sub_char14, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR14);
	public static final MCMeta sub_char15_META = createCommonMeta($sub_char15, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR15);
	public static final MCMeta sub_char16_META = createCommonMeta($sub_char16, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR16);
	public static final MCMeta sub_char17_META = createCommonMeta($sub_char17, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR17);
	public static final MCMeta sub_char18_META = createCommonMeta($sub_char18, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR18);
	public static final MCMeta sub_char19_META = createCommonMeta($sub_char19, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR19);
	public static final MCMeta sub_char20_META = createCommonMeta($sub_char20, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR20);
	public static final MCMeta sub_char21_META = createCommonMeta($sub_char21, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR21);
	public static final MCMeta sub_char22_META = createCommonMeta($sub_char22, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR22);
	public static final MCMeta sub_char23_META = createCommonMeta($sub_char23, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR23);
	public static final MCMeta sub_char24_META = createCommonMeta($sub_char24, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR24);
	public static final MCMeta sub_char25_META = createCommonMeta($sub_char25, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR25);
	public static final MCMeta sub_char26_META = createCommonMeta($sub_char26, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR26);
	public static final MCMeta sub_char27_META = createCommonMeta($sub_char27, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR27);
	public static final MCMeta sub_char28_META = createCommonMeta($sub_char28, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR28);
	public static final MCMeta sub_char29_META = createCommonMeta($sub_char29, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR29);
	public static final MCMeta sub_char30_META = createCommonMeta($sub_char30, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR30);
	public static final MCMeta sub_num1_META = createCommonMeta($sub_num1, mcframe.commonMA.meta.MA_META.IF_SUB_NUM1);
	public static final MCMeta sub_num2_META = createCommonMeta($sub_num2, mcframe.commonMA.meta.MA_META.IF_SUB_NUM2);
	public static final MCMeta sub_num3_META = createCommonMeta($sub_num3, mcframe.commonMA.meta.MA_META.IF_SUB_NUM3);
	public static final MCMeta sub_num4_META = createCommonMeta($sub_num4, mcframe.commonMA.meta.MA_META.IF_SUB_NUM4);
	public static final MCMeta sub_num5_META = createCommonMeta($sub_num5, mcframe.commonMA.meta.MA_META.IF_SUB_NUM5);
	public static final MCMeta sub_dt1_META = createCommonMeta($sub_dt1, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sub_dt2_META = createCommonMeta($sub_dt2, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sub_dt3_META = createCommonMeta($sub_dt3, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sub_dt4_META = createCommonMeta($sub_dt4, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sub_dt5_META = createCommonMeta($sub_dt5, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta edi_sub_char1_META = createCommonMeta($edi_sub_char1, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR1);
	public static final MCMeta edi_sub_char2_META = createCommonMeta($edi_sub_char2, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR2);
	public static final MCMeta edi_sub_char3_META = createCommonMeta($edi_sub_char3, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR3);
	public static final MCMeta edi_sub_char4_META = createCommonMeta($edi_sub_char4, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR4);
	public static final MCMeta edi_sub_char5_META = createCommonMeta($edi_sub_char5, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR5);
	public static final MCMeta edi_sub_num1_META = createCommonMeta($edi_sub_num1, mcframe.commonMA.meta.MA_META.IF_SUB_NUM1);
	public static final MCMeta edi_sub_dt1_META = createCommonMeta($edi_sub_dt1, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta edi_sub_d_char1_META = createCommonMeta($edi_sub_d_char1, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR1);
	public static final MCMeta edi_sub_d_char2_META = createCommonMeta($edi_sub_d_char2, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR2);
	public static final MCMeta edi_sub_d_char3_META = createCommonMeta($edi_sub_d_char3, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR3);
	public static final MCMeta edi_sub_d_char4_META = createCommonMeta($edi_sub_d_char4, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR4);
	public static final MCMeta edi_sub_d_char5_META = createCommonMeta($edi_sub_d_char5, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR5);
	public static final MCMeta edi_sub_d_num1_META = createCommonMeta($edi_sub_d_num1, mcframe.commonMA.meta.MA_META.IF_SUB_NUM1);
	public static final MCMeta edi_sub_d_dt1_META = createCommonMeta($edi_sub_d_dt1, mcframe.commonMA.meta.MA_META.DT);

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			data_lno_META,
			data_no_META,
			trd_typ_cd_META,
			data_make_dt_META,
			data_crud_typ_META,
			po_crud_typ_META,
			po_no_META,
			po_rev_META,
			po_d_no_META,
			po_co_cd_META,
			po_co_nm_META,
			po_co_cntry_cd_META,
			slo_co_cd_META,
			slo_co_nm_META,
			slo_co_cntry_cd_META,
			po_dt_META,
			upd_po_print_schd_dt_META,
			crct_rsn_nm_META,
			crct_rsn_rmrks_META,
			po_print_txt_META,
			po_print_rmrks_META,
			po_print_d_rmrks_META,
			purc_dpt_cd_META,
			purc_dpt_nm_META,
			purc_usr_cd_META,
			purc_usr_nm_META,
			po_co_itm_cd_META,
			po_co_itm_sub1_META,
			po_co_itm_sub2_META,
			po_co_itm_sub3_META,
			po_co_itm_nm_META,
			po_co_iv_itm_nm_META,
			po_co_sundry_itm_flg_META,
			dest_cd1_META,
			dest_nm1_META,
			dest_cd2_META,
			dest_nm2_META,
			dest_cd3_META,
			dest_nm3_META,
			outsrc_flg_META,
			drct_dlv_flg_META,
			purc_id_typ_META,
			sls_cststk_flg_META,
			slo_typ_META,
			sls_dpt_cd_META,
			sls_dpt_nm_META,
			sls_usr_cd_META,
			sls_usr_nm_META,
			in_to_id_typ_META,
			in_to_id_cd_META,
			in_to_nm_META,
			in_to_zip_cd_META,
			in_to_addr1_META,
			in_to_addr2_META,
			in_to_addr3_META,
			in_to_addr4_META,
			in_to_cntct_dpt_META,
			in_to_cntct_psn_META,
			in_to_tel_META,
			in_to_fax_META,
			in_to_sundry_flg_META,
			in_to_cntry_cd_META,
			site_cd_META,
			site_nm_META,
			drct_dlv_bp_cd_META,
			drct_dlv_bp_nm_META,
			drct_dlv_cntry_cd_META,
			tdlv_cd_META,
			tdlv_nm_META,
			tdlv_zip_cd_META,
			tdlv_addr1_META,
			tdlv_addr2_META,
			tdlv_addr3_META,
			tdlv_addr4_META,
			tdlv_cntct_dpt_META,
			tdlv_cntct_psn_META,
			tdlv_tel_META,
			tdlv_fax_META,
			tdlv_sundry_flg_META,
			tdlv_cntry_cd_META,
			dlv_slip_rmrks_META,
			dlv_slip_d_rmrks_META,
			dlv_day_week_typ_META,
			pri_prnt_typ_META,
			wrk_no_META,
			wrk_nm_META,
			tterm_cd1_META,
			tterm_nm1_META,
			tterm_rmrks1_META,
			tterm_cd2_META,
			tterm_nm2_META,
			tterm_rmrks2_META,
			tterm_cd3_META,
			tterm_nm3_META,
			tterm_rmrks3_META,
			trnspt_cd_META,
			trnspt_nm_META,
			load_port_cd_META,
			load_port_nm_META,
			dschrg_port_cd_META,
			dschrg_port_nm_META,
			via_port_cd_META,
			via_port_nm_META,
			slo_co_itm_cd_META,
			slo_co_itm_sub1_META,
			slo_co_itm_sub2_META,
			slo_co_itm_sub3_META,
			slo_co_itm_nm_META,
			cntry_org_cd_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			gd_cd_META,
			gd_nm_META,
			trd_unit_cd_META,
			trd_unit_nm_META,
			trd_unit_qty_META,
			trd_cur_cd_META,
			inc_tax_flg_META,
			interim_flg_META,
			trd_cur_upri_META,
			trd_cur_amt_META,
			trd_cur_dscnt_amt_META,
			dscnt_rsn_cd_META,
			dscnt_rsn_nm_META,
			tax_fix_flg_META,
			tax_cd_META,
			tax_nm_META,
			tax_rate_META,
			tax_typ_META,
			trd_cur_tax_amt_META,
			ship_wh_cd_META,
			ship_wh_nm_META,
			ship_block_flg_META,
			abort_flg_META,
			set_itm_grp_no_META,
			dlv_rqst_dt_META,
			dlv_rqst_hm_META,
			purc_schd_dt_META,
			maker_cd_META,
			maker_nm_META,
			ver_no_META,
			lot_no_META,
			sublot_no_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			sub_char4_META,
			sub_char5_META,
			sub_char6_META,
			sub_char7_META,
			sub_char8_META,
			sub_char9_META,
			sub_char10_META,
			sub_char11_META,
			sub_char12_META,
			sub_char13_META,
			sub_char14_META,
			sub_char15_META,
			sub_char16_META,
			sub_char17_META,
			sub_char18_META,
			sub_char19_META,
			sub_char20_META,
			sub_char21_META,
			sub_char22_META,
			sub_char23_META,
			sub_char24_META,
			sub_char25_META,
			sub_char26_META,
			sub_char27_META,
			sub_char28_META,
			sub_char29_META,
			sub_char30_META,
			sub_num1_META,
			sub_num2_META,
			sub_num3_META,
			sub_num4_META,
			sub_num5_META,
			sub_dt1_META,
			sub_dt2_META,
			sub_dt3_META,
			sub_dt4_META,
			sub_dt5_META,
			edi_sub_char1_META,
			edi_sub_char2_META,
			edi_sub_char3_META,
			edi_sub_char4_META,
			edi_sub_char5_META,
			edi_sub_num1_META,
			edi_sub_dt1_META,
			edi_sub_d_char1_META,
			edi_sub_d_char2_META,
			edi_sub_d_char3_META,
			edi_sub_d_char4_META,
			edi_sub_d_char5_META,
			edi_sub_d_num1_META,
			edi_sub_d_dt1_META
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
	protected DtlR_MC_A(ConstMetaList<? extends DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR clone() {
		return (DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR createInstance() {
		return (DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR getValues(String... names) {
		return (DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  データ行ＮＯ.<p>
	 *
	 */
	public MCNumber data_lno() {
		return getConstNumber(offset + 0, $data_lno);
	}

	/**
	 *  データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(MCNumber value) {
		setConstNumber(offset + 0, $data_lno, value);
	}

	/**
	 *  データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(int value) {
		setConstNumber(offset + 0, $data_lno, value);
	}

	/**
	 *  データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(long value) {
		setConstNumber(offset + 0, $data_lno, value);
	}

	/**
	 *  データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(float value) {
		setConstNumber(offset + 0, $data_lno, value);
	}

	/**
	 *  データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(double value) {
		setConstNumber(offset + 0, $data_lno, value);
	}


	/**
	 *  データＮＯ.<p>
	 *
	 */
	public MCNumber data_no() {
		return getConstNumber(offset + 1, $data_no);
	}

	/**
	 *  データＮＯ.<p>
	 *
	 */
	public void data_no(MCNumber value) {
		setConstNumber(offset + 1, $data_no, value);
	}

	/**
	 *  データＮＯ.<p>
	 *
	 */
	public void data_no(int value) {
		setConstNumber(offset + 1, $data_no, value);
	}

	/**
	 *  データＮＯ.<p>
	 *
	 */
	public void data_no(long value) {
		setConstNumber(offset + 1, $data_no, value);
	}

	/**
	 *  データＮＯ.<p>
	 *
	 */
	public void data_no(float value) {
		setConstNumber(offset + 1, $data_no, value);
	}

	/**
	 *  データＮＯ.<p>
	 *
	 */
	public void data_no(double value) {
		setConstNumber(offset + 1, $data_no, value);
	}


	/**
	 *  取引種別ＣＤ.<p>
	 *
	 */
	public String trd_typ_cd() {
		return getConstString(offset + 2, $trd_typ_cd);
	}

	/**
	 *  取引種別ＣＤ.<p>
	 *
	 */
	public void trd_typ_cd(String value) {
		setConstString(offset + 2, $trd_typ_cd, value);
	}


	/**
	 *  送信元レコード作成日時.<p>
	 *
	 */
	public MCDate data_make_dt() {
		return getConstDate(offset + 3, $data_make_dt);
	}

	/**
	 *  送信元レコード作成日時.<p>
	 *
	 */
	public void data_make_dt(MCDate value) {
		setConstDate(offset + 3, $data_make_dt, value);
	}


	/**
	 *  データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 4, $data_crud_typ);
	}

	/**
	 *  データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 4, $data_crud_typ, value);
	}


	/**
	 *  発注更新区分.<p>
	 *
	 */
	public String po_crud_typ() {
		return getConstString(offset + 5, $po_crud_typ);
	}

	/**
	 *  発注更新区分.<p>
	 *
	 */
	public void po_crud_typ(String value) {
		setConstString(offset + 5, $po_crud_typ, value);
	}


	/**
	 *  発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 6, $po_no);
	}

	/**
	 *  発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 6, $po_no, value);
	}


	/**
	 *  発注改訂番号.<p>
	 *
	 */
	public MCNumber po_rev() {
		return getConstNumber(offset + 7, $po_rev);
	}

	/**
	 *  発注改訂番号.<p>
	 *
	 */
	public void po_rev(MCNumber value) {
		setConstNumber(offset + 7, $po_rev, value);
	}

	/**
	 *  発注改訂番号.<p>
	 *
	 */
	public void po_rev(int value) {
		setConstNumber(offset + 7, $po_rev, value);
	}

	/**
	 *  発注改訂番号.<p>
	 *
	 */
	public void po_rev(long value) {
		setConstNumber(offset + 7, $po_rev, value);
	}

	/**
	 *  発注改訂番号.<p>
	 *
	 */
	public void po_rev(float value) {
		setConstNumber(offset + 7, $po_rev, value);
	}

	/**
	 *  発注改訂番号.<p>
	 *
	 */
	public void po_rev(double value) {
		setConstNumber(offset + 7, $po_rev, value);
	}


	/**
	 *  発注明細ＮＯ.<p>
	 *
	 */
	public String po_d_no() {
		return getConstString(offset + 8, $po_d_no);
	}

	/**
	 *  発注明細ＮＯ.<p>
	 *
	 */
	public void po_d_no(String value) {
		setConstString(offset + 8, $po_d_no, value);
	}


	/**
	 *  発注者ＣＤ.<p>
	 *
	 */
	public String po_co_cd() {
		return getConstString(offset + 9, $po_co_cd);
	}

	/**
	 *  発注者ＣＤ.<p>
	 *
	 */
	public void po_co_cd(String value) {
		setConstString(offset + 9, $po_co_cd, value);
	}


	/**
	 *  発注者名.<p>
	 *
	 */
	public String po_co_nm() {
		return getConstString(offset + 10, $po_co_nm);
	}

	/**
	 *  発注者名.<p>
	 *
	 */
	public void po_co_nm(String value) {
		setConstString(offset + 10, $po_co_nm, value);
	}


	/**
	 *  発注者国ＣＤ.<p>
	 *
	 */
	public String po_co_cntry_cd() {
		return getConstString(offset + 11, $po_co_cntry_cd);
	}

	/**
	 *  発注者国ＣＤ.<p>
	 *
	 */
	public void po_co_cntry_cd(String value) {
		setConstString(offset + 11, $po_co_cntry_cd, value);
	}


	/**
	 *  受注者ＣＤ.<p>
	 *
	 */
	public String slo_co_cd() {
		return getConstString(offset + 12, $slo_co_cd);
	}

	/**
	 *  受注者ＣＤ.<p>
	 *
	 */
	public void slo_co_cd(String value) {
		setConstString(offset + 12, $slo_co_cd, value);
	}


	/**
	 *  受注者名.<p>
	 *
	 */
	public String slo_co_nm() {
		return getConstString(offset + 13, $slo_co_nm);
	}

	/**
	 *  受注者名.<p>
	 *
	 */
	public void slo_co_nm(String value) {
		setConstString(offset + 13, $slo_co_nm, value);
	}


	/**
	 *  受注者国ＣＤ.<p>
	 *
	 */
	public String slo_co_cntry_cd() {
		return getConstString(offset + 14, $slo_co_cntry_cd);
	}

	/**
	 *  受注者国ＣＤ.<p>
	 *
	 */
	public void slo_co_cntry_cd(String value) {
		setConstString(offset + 14, $slo_co_cntry_cd, value);
	}


	/**
	 *  注文日.<p>
	 *
	 */
	public MCDate po_dt() {
		return getConstDate(offset + 15, $po_dt);
	}

	/**
	 *  注文日.<p>
	 *
	 */
	public void po_dt(MCDate value) {
		setConstDate(offset + 15, $po_dt, value);
	}


	/**
	 *  変更注文書発行予定日.<p>
	 *
	 */
	public MCDate upd_po_print_schd_dt() {
		return getConstDate(offset + 16, $upd_po_print_schd_dt);
	}

	/**
	 *  変更注文書発行予定日.<p>
	 *
	 */
	public void upd_po_print_schd_dt(MCDate value) {
		setConstDate(offset + 16, $upd_po_print_schd_dt, value);
	}


	/**
	 *  訂正理由.<p>
	 *
	 */
	public String crct_rsn_nm() {
		return getConstString(offset + 17, $crct_rsn_nm);
	}

	/**
	 *  訂正理由.<p>
	 *
	 */
	public void crct_rsn_nm(String value) {
		setConstString(offset + 17, $crct_rsn_nm, value);
	}


	/**
	 *  訂正理由備考.<p>
	 *
	 */
	public String crct_rsn_rmrks() {
		return getConstString(offset + 18, $crct_rsn_rmrks);
	}

	/**
	 *  訂正理由備考.<p>
	 *
	 */
	public void crct_rsn_rmrks(String value) {
		setConstString(offset + 18, $crct_rsn_rmrks, value);
	}


	/**
	 *  注文書表示テキスト.<p>
	 *
	 */
	public String po_print_txt() {
		return getConstString(offset + 19, $po_print_txt);
	}

	/**
	 *  注文書表示テキスト.<p>
	 *
	 */
	public void po_print_txt(String value) {
		setConstString(offset + 19, $po_print_txt, value);
	}


	/**
	 *  注文書備考.<p>
	 *
	 */
	public String po_print_rmrks() {
		return getConstString(offset + 20, $po_print_rmrks);
	}

	/**
	 *  注文書備考.<p>
	 *
	 */
	public void po_print_rmrks(String value) {
		setConstString(offset + 20, $po_print_rmrks, value);
	}


	/**
	 *  注文明細備考.<p>
	 *
	 */
	public String po_print_d_rmrks() {
		return getConstString(offset + 21, $po_print_d_rmrks);
	}

	/**
	 *  注文明細備考.<p>
	 *
	 */
	public void po_print_d_rmrks(String value) {
		setConstString(offset + 21, $po_print_d_rmrks, value);
	}


	/**
	 *  購買部門ＣＤ.<p>
	 *
	 */
	public String purc_dpt_cd() {
		return getConstString(offset + 22, $purc_dpt_cd);
	}

	/**
	 *  購買部門ＣＤ.<p>
	 *
	 */
	public void purc_dpt_cd(String value) {
		setConstString(offset + 22, $purc_dpt_cd, value);
	}


	/**
	 *  購買部門名.<p>
	 *
	 */
	public String purc_dpt_nm() {
		return getConstString(offset + 23, $purc_dpt_nm);
	}

	/**
	 *  購買部門名.<p>
	 *
	 */
	public void purc_dpt_nm(String value) {
		setConstString(offset + 23, $purc_dpt_nm, value);
	}


	/**
	 *  購買担当者ＣＤ.<p>
	 *
	 */
	public String purc_usr_cd() {
		return getConstString(offset + 24, $purc_usr_cd);
	}

	/**
	 *  購買担当者ＣＤ.<p>
	 *
	 */
	public void purc_usr_cd(String value) {
		setConstString(offset + 24, $purc_usr_cd, value);
	}


	/**
	 *  購買担当者名.<p>
	 *
	 */
	public String purc_usr_nm() {
		return getConstString(offset + 25, $purc_usr_nm);
	}

	/**
	 *  購買担当者名.<p>
	 *
	 */
	public void purc_usr_nm(String value) {
		setConstString(offset + 25, $purc_usr_nm, value);
	}


	/**
	 *  発注者品目ＣＤ.<p>
	 *
	 */
	public String po_co_itm_cd() {
		return getConstString(offset + 26, $po_co_itm_cd);
	}

	/**
	 *  発注者品目ＣＤ.<p>
	 *
	 */
	public void po_co_itm_cd(String value) {
		setConstString(offset + 26, $po_co_itm_cd, value);
	}


	/**
	 *  発注者枝番１.<p>
	 *
	 */
	public String po_co_itm_sub1() {
		return getConstString(offset + 27, $po_co_itm_sub1);
	}

	/**
	 *  発注者枝番１.<p>
	 *
	 */
	public void po_co_itm_sub1(String value) {
		setConstString(offset + 27, $po_co_itm_sub1, value);
	}


	/**
	 *  発注者枝番２.<p>
	 *
	 */
	public String po_co_itm_sub2() {
		return getConstString(offset + 28, $po_co_itm_sub2);
	}

	/**
	 *  発注者枝番２.<p>
	 *
	 */
	public void po_co_itm_sub2(String value) {
		setConstString(offset + 28, $po_co_itm_sub2, value);
	}


	/**
	 *  発注者枝番３.<p>
	 *
	 */
	public String po_co_itm_sub3() {
		return getConstString(offset + 29, $po_co_itm_sub3);
	}

	/**
	 *  発注者枝番３.<p>
	 *
	 */
	public void po_co_itm_sub3(String value) {
		setConstString(offset + 29, $po_co_itm_sub3, value);
	}


	/**
	 *  発注者品名.<p>
	 *
	 */
	public String po_co_itm_nm() {
		return getConstString(offset + 30, $po_co_itm_nm);
	}

	/**
	 *  発注者品名.<p>
	 *
	 */
	public void po_co_itm_nm(String value) {
		setConstString(offset + 30, $po_co_itm_nm, value);
	}


	/**
	 *  発注者インボイス表記品名.<p>
	 *
	 */
	public String po_co_iv_itm_nm() {
		return getConstString(offset + 31, $po_co_iv_itm_nm);
	}

	/**
	 *  発注者インボイス表記品名.<p>
	 *
	 */
	public void po_co_iv_itm_nm(String value) {
		setConstString(offset + 31, $po_co_iv_itm_nm, value);
	}


	/**
	 *  発注者諸口品ＦＬＧ.<p>
	 *
	 */
	public boolean po_co_sundry_itm_flg() {
		return getConstBoolean(offset + 32, $po_co_sundry_itm_flg);
	}

	/**
	 *  発注者諸口品ＦＬＧ.<p>
	 *
	 */
	public void po_co_sundry_itm_flg(boolean value) {
		setConstBoolean(offset + 32, $po_co_sundry_itm_flg, value);
	}


	/**
	 *  仕向先ＣＤ１.<p>
	 *
	 */
	public String dest_cd1() {
		return getConstString(offset + 33, $dest_cd1);
	}

	/**
	 *  仕向先ＣＤ１.<p>
	 *
	 */
	public void dest_cd1(String value) {
		setConstString(offset + 33, $dest_cd1, value);
	}


	/**
	 *  仕向先名１.<p>
	 *
	 */
	public String dest_nm1() {
		return getConstString(offset + 34, $dest_nm1);
	}

	/**
	 *  仕向先名１.<p>
	 *
	 */
	public void dest_nm1(String value) {
		setConstString(offset + 34, $dest_nm1, value);
	}


	/**
	 *  仕向先ＣＤ２.<p>
	 *
	 */
	public String dest_cd2() {
		return getConstString(offset + 35, $dest_cd2);
	}

	/**
	 *  仕向先ＣＤ２.<p>
	 *
	 */
	public void dest_cd2(String value) {
		setConstString(offset + 35, $dest_cd2, value);
	}


	/**
	 *  仕向先名２.<p>
	 *
	 */
	public String dest_nm2() {
		return getConstString(offset + 36, $dest_nm2);
	}

	/**
	 *  仕向先名２.<p>
	 *
	 */
	public void dest_nm2(String value) {
		setConstString(offset + 36, $dest_nm2, value);
	}


	/**
	 *  仕向先ＣＤ３.<p>
	 *
	 */
	public String dest_cd3() {
		return getConstString(offset + 37, $dest_cd3);
	}

	/**
	 *  仕向先ＣＤ３.<p>
	 *
	 */
	public void dest_cd3(String value) {
		setConstString(offset + 37, $dest_cd3, value);
	}


	/**
	 *  仕向先名３.<p>
	 *
	 */
	public String dest_nm3() {
		return getConstString(offset + 38, $dest_nm3);
	}

	/**
	 *  仕向先名３.<p>
	 *
	 */
	public void dest_nm3(String value) {
		setConstString(offset + 38, $dest_nm3, value);
	}


	/**
	 *  外注ＦＬＧ.<p>
	 *
	 */
	public boolean outsrc_flg() {
		return getConstBoolean(offset + 39, $outsrc_flg);
	}

	/**
	 *  外注ＦＬＧ.<p>
	 *
	 */
	public void outsrc_flg(boolean value) {
		setConstBoolean(offset + 39, $outsrc_flg, value);
	}


	/**
	 *  直送ＦＬＧ.<p>
	 *
	 */
	public boolean drct_dlv_flg() {
		return getConstBoolean(offset + 40, $drct_dlv_flg);
	}

	/**
	 *  直送ＦＬＧ.<p>
	 *
	 */
	public void drct_dlv_flg(boolean value) {
		setConstBoolean(offset + 40, $drct_dlv_flg, value);
	}


	/**
	 *  購買識別区分.<p>
	 *
	 */
	public String purc_id_typ() {
		return getConstString(offset + 41, $purc_id_typ);
	}

	/**
	 *  購買識別区分.<p>
	 *
	 */
	public void purc_id_typ(String value) {
		setConstString(offset + 41, $purc_id_typ, value);
	}


	/**
	 *  預り売上ＦＬＧ.<p>
	 *
	 */
	public boolean sls_cststk_flg() {
		return getConstBoolean(offset + 42, $sls_cststk_flg);
	}

	/**
	 *  預り売上ＦＬＧ.<p>
	 *
	 */
	public void sls_cststk_flg(boolean value) {
		setConstBoolean(offset + 42, $sls_cststk_flg, value);
	}


	/**
	 *  受注区分.<p>
	 *
	 */
	public String slo_typ() {
		return getConstString(offset + 43, $slo_typ);
	}

	/**
	 *  受注区分.<p>
	 *
	 */
	public void slo_typ(String value) {
		setConstString(offset + 43, $slo_typ, value);
	}


	/**
	 *  売上部門ＣＤ.<p>
	 *
	 */
	public String sls_dpt_cd() {
		return getConstString(offset + 44, $sls_dpt_cd);
	}

	/**
	 *  売上部門ＣＤ.<p>
	 *
	 */
	public void sls_dpt_cd(String value) {
		setConstString(offset + 44, $sls_dpt_cd, value);
	}


	/**
	 *  売上部門名.<p>
	 *
	 */
	public String sls_dpt_nm() {
		return getConstString(offset + 45, $sls_dpt_nm);
	}

	/**
	 *  売上部門名.<p>
	 *
	 */
	public void sls_dpt_nm(String value) {
		setConstString(offset + 45, $sls_dpt_nm, value);
	}


	/**
	 *  売上担当者ＣＤ.<p>
	 *
	 */
	public String sls_usr_cd() {
		return getConstString(offset + 46, $sls_usr_cd);
	}

	/**
	 *  売上担当者ＣＤ.<p>
	 *
	 */
	public void sls_usr_cd(String value) {
		setConstString(offset + 46, $sls_usr_cd, value);
	}


	/**
	 *  売上担当者名.<p>
	 *
	 */
	public String sls_usr_nm() {
		return getConstString(offset + 47, $sls_usr_nm);
	}

	/**
	 *  売上担当者名.<p>
	 *
	 */
	public void sls_usr_nm(String value) {
		setConstString(offset + 47, $sls_usr_nm, value);
	}


	/**
	 *  納入先識別区分.<p>
	 *
	 */
	public String in_to_id_typ() {
		return getConstString(offset + 48, $in_to_id_typ);
	}

	/**
	 *  納入先識別区分.<p>
	 *
	 */
	public void in_to_id_typ(String value) {
		setConstString(offset + 48, $in_to_id_typ, value);
	}


	/**
	 *  納入先識別ＣＤ.<p>
	 *
	 */
	public String in_to_id_cd() {
		return getConstString(offset + 49, $in_to_id_cd);
	}

	/**
	 *  納入先識別ＣＤ.<p>
	 *
	 */
	public void in_to_id_cd(String value) {
		setConstString(offset + 49, $in_to_id_cd, value);
	}


	/**
	 *  納入先名.<p>
	 *
	 */
	public String in_to_nm() {
		return getConstString(offset + 50, $in_to_nm);
	}

	/**
	 *  納入先名.<p>
	 *
	 */
	public void in_to_nm(String value) {
		setConstString(offset + 50, $in_to_nm, value);
	}


	/**
	 *  納入先郵便番号.<p>
	 *
	 */
	public String in_to_zip_cd() {
		return getConstString(offset + 51, $in_to_zip_cd);
	}

	/**
	 *  納入先郵便番号.<p>
	 *
	 */
	public void in_to_zip_cd(String value) {
		setConstString(offset + 51, $in_to_zip_cd, value);
	}


	/**
	 *  納入先住所１.<p>
	 *
	 */
	public String in_to_addr1() {
		return getConstString(offset + 52, $in_to_addr1);
	}

	/**
	 *  納入先住所１.<p>
	 *
	 */
	public void in_to_addr1(String value) {
		setConstString(offset + 52, $in_to_addr1, value);
	}


	/**
	 *  納入先住所２.<p>
	 *
	 */
	public String in_to_addr2() {
		return getConstString(offset + 53, $in_to_addr2);
	}

	/**
	 *  納入先住所２.<p>
	 *
	 */
	public void in_to_addr2(String value) {
		setConstString(offset + 53, $in_to_addr2, value);
	}


	/**
	 *  納入先住所３.<p>
	 *
	 */
	public String in_to_addr3() {
		return getConstString(offset + 54, $in_to_addr3);
	}

	/**
	 *  納入先住所３.<p>
	 *
	 */
	public void in_to_addr3(String value) {
		setConstString(offset + 54, $in_to_addr3, value);
	}


	/**
	 *  納入先住所４.<p>
	 *
	 */
	public String in_to_addr4() {
		return getConstString(offset + 55, $in_to_addr4);
	}

	/**
	 *  納入先住所４.<p>
	 *
	 */
	public void in_to_addr4(String value) {
		setConstString(offset + 55, $in_to_addr4, value);
	}


	/**
	 *  納入先担当部署.<p>
	 *
	 */
	public String in_to_cntct_dpt() {
		return getConstString(offset + 56, $in_to_cntct_dpt);
	}

	/**
	 *  納入先担当部署.<p>
	 *
	 */
	public void in_to_cntct_dpt(String value) {
		setConstString(offset + 56, $in_to_cntct_dpt, value);
	}


	/**
	 *  納入先担当者.<p>
	 *
	 */
	public String in_to_cntct_psn() {
		return getConstString(offset + 57, $in_to_cntct_psn);
	}

	/**
	 *  納入先担当者.<p>
	 *
	 */
	public void in_to_cntct_psn(String value) {
		setConstString(offset + 57, $in_to_cntct_psn, value);
	}


	/**
	 *  納入先ＴＥＬ.<p>
	 *
	 */
	public String in_to_tel() {
		return getConstString(offset + 58, $in_to_tel);
	}

	/**
	 *  納入先ＴＥＬ.<p>
	 *
	 */
	public void in_to_tel(String value) {
		setConstString(offset + 58, $in_to_tel, value);
	}


	/**
	 *  納入先ＦＡＸ.<p>
	 *
	 */
	public String in_to_fax() {
		return getConstString(offset + 59, $in_to_fax);
	}

	/**
	 *  納入先ＦＡＸ.<p>
	 *
	 */
	public void in_to_fax(String value) {
		setConstString(offset + 59, $in_to_fax, value);
	}


	/**
	 *  納入先諸口ＦＬＧ.<p>
	 *
	 */
	public boolean in_to_sundry_flg() {
		return getConstBoolean(offset + 60, $in_to_sundry_flg);
	}

	/**
	 *  納入先諸口ＦＬＧ.<p>
	 *
	 */
	public void in_to_sundry_flg(boolean value) {
		setConstBoolean(offset + 60, $in_to_sundry_flg, value);
	}


	/**
	 *  納入先国ＣＤ.<p>
	 *
	 */
	public String in_to_cntry_cd() {
		return getConstString(offset + 61, $in_to_cntry_cd);
	}

	/**
	 *  納入先国ＣＤ.<p>
	 *
	 */
	public void in_to_cntry_cd(String value) {
		setConstString(offset + 61, $in_to_cntry_cd, value);
	}


	/**
	 *  工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 62, $site_cd);
	}

	/**
	 *  工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 62, $site_cd, value);
	}


	/**
	 *  工場・物流倉庫名.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 63, $site_nm);
	}

	/**
	 *  工場・物流倉庫名.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 63, $site_nm, value);
	}


	/**
	 *  直送発注先ＣＤ.<p>
	 *
	 */
	public String drct_dlv_bp_cd() {
		return getConstString(offset + 64, $drct_dlv_bp_cd);
	}

	/**
	 *  直送発注先ＣＤ.<p>
	 *
	 */
	public void drct_dlv_bp_cd(String value) {
		setConstString(offset + 64, $drct_dlv_bp_cd, value);
	}


	/**
	 *  直送発注先名.<p>
	 *
	 */
	public String drct_dlv_bp_nm() {
		return getConstString(offset + 65, $drct_dlv_bp_nm);
	}

	/**
	 *  直送発注先名.<p>
	 *
	 */
	public void drct_dlv_bp_nm(String value) {
		setConstString(offset + 65, $drct_dlv_bp_nm, value);
	}


	/**
	 *  直送発注先国ＣＤ.<p>
	 *
	 */
	public String drct_dlv_cntry_cd() {
		return getConstString(offset + 66, $drct_dlv_cntry_cd);
	}

	/**
	 *  直送発注先国ＣＤ.<p>
	 *
	 */
	public void drct_dlv_cntry_cd(String value) {
		setConstString(offset + 66, $drct_dlv_cntry_cd, value);
	}


	/**
	 *  配送先ＣＤ.<p>
	 *
	 */
	public String tdlv_cd() {
		return getConstString(offset + 67, $tdlv_cd);
	}

	/**
	 *  配送先ＣＤ.<p>
	 *
	 */
	public void tdlv_cd(String value) {
		setConstString(offset + 67, $tdlv_cd, value);
	}


	/**
	 *  配送先名.<p>
	 *
	 */
	public String tdlv_nm() {
		return getConstString(offset + 68, $tdlv_nm);
	}

	/**
	 *  配送先名.<p>
	 *
	 */
	public void tdlv_nm(String value) {
		setConstString(offset + 68, $tdlv_nm, value);
	}


	/**
	 *  配送先郵便番号.<p>
	 *
	 */
	public String tdlv_zip_cd() {
		return getConstString(offset + 69, $tdlv_zip_cd);
	}

	/**
	 *  配送先郵便番号.<p>
	 *
	 */
	public void tdlv_zip_cd(String value) {
		setConstString(offset + 69, $tdlv_zip_cd, value);
	}


	/**
	 *  配送先住所１.<p>
	 *
	 */
	public String tdlv_addr1() {
		return getConstString(offset + 70, $tdlv_addr1);
	}

	/**
	 *  配送先住所１.<p>
	 *
	 */
	public void tdlv_addr1(String value) {
		setConstString(offset + 70, $tdlv_addr1, value);
	}


	/**
	 *  配送先住所２.<p>
	 *
	 */
	public String tdlv_addr2() {
		return getConstString(offset + 71, $tdlv_addr2);
	}

	/**
	 *  配送先住所２.<p>
	 *
	 */
	public void tdlv_addr2(String value) {
		setConstString(offset + 71, $tdlv_addr2, value);
	}


	/**
	 *  配送先住所３.<p>
	 *
	 */
	public String tdlv_addr3() {
		return getConstString(offset + 72, $tdlv_addr3);
	}

	/**
	 *  配送先住所３.<p>
	 *
	 */
	public void tdlv_addr3(String value) {
		setConstString(offset + 72, $tdlv_addr3, value);
	}


	/**
	 *  配送先住所４.<p>
	 *
	 */
	public String tdlv_addr4() {
		return getConstString(offset + 73, $tdlv_addr4);
	}

	/**
	 *  配送先住所４.<p>
	 *
	 */
	public void tdlv_addr4(String value) {
		setConstString(offset + 73, $tdlv_addr4, value);
	}


	/**
	 *  配送先担当部署.<p>
	 *
	 */
	public String tdlv_cntct_dpt() {
		return getConstString(offset + 74, $tdlv_cntct_dpt);
	}

	/**
	 *  配送先担当部署.<p>
	 *
	 */
	public void tdlv_cntct_dpt(String value) {
		setConstString(offset + 74, $tdlv_cntct_dpt, value);
	}


	/**
	 *  配送先担当者.<p>
	 *
	 */
	public String tdlv_cntct_psn() {
		return getConstString(offset + 75, $tdlv_cntct_psn);
	}

	/**
	 *  配送先担当者.<p>
	 *
	 */
	public void tdlv_cntct_psn(String value) {
		setConstString(offset + 75, $tdlv_cntct_psn, value);
	}


	/**
	 *  配送先ＴＥＬ.<p>
	 *
	 */
	public String tdlv_tel() {
		return getConstString(offset + 76, $tdlv_tel);
	}

	/**
	 *  配送先ＴＥＬ.<p>
	 *
	 */
	public void tdlv_tel(String value) {
		setConstString(offset + 76, $tdlv_tel, value);
	}


	/**
	 *  配送先ＦＡＸ.<p>
	 *
	 */
	public String tdlv_fax() {
		return getConstString(offset + 77, $tdlv_fax);
	}

	/**
	 *  配送先ＦＡＸ.<p>
	 *
	 */
	public void tdlv_fax(String value) {
		setConstString(offset + 77, $tdlv_fax, value);
	}


	/**
	 *  配送先諸口ＦＬＧ.<p>
	 *
	 */
	public boolean tdlv_sundry_flg() {
		return getConstBoolean(offset + 78, $tdlv_sundry_flg);
	}

	/**
	 *  配送先諸口ＦＬＧ.<p>
	 *
	 */
	public void tdlv_sundry_flg(boolean value) {
		setConstBoolean(offset + 78, $tdlv_sundry_flg, value);
	}


	/**
	 *  配送先国ＣＤ.<p>
	 *
	 */
	public String tdlv_cntry_cd() {
		return getConstString(offset + 79, $tdlv_cntry_cd);
	}

	/**
	 *  配送先国ＣＤ.<p>
	 *
	 */
	public void tdlv_cntry_cd(String value) {
		setConstString(offset + 79, $tdlv_cntry_cd, value);
	}


	/**
	 *  納品書備考.<p>
	 *
	 */
	public String dlv_slip_rmrks() {
		return getConstString(offset + 80, $dlv_slip_rmrks);
	}

	/**
	 *  納品書備考.<p>
	 *
	 */
	public void dlv_slip_rmrks(String value) {
		setConstString(offset + 80, $dlv_slip_rmrks, value);
	}


	/**
	 *  納品書明細備考.<p>
	 *
	 */
	public String dlv_slip_d_rmrks() {
		return getConstString(offset + 81, $dlv_slip_d_rmrks);
	}

	/**
	 *  納品書明細備考.<p>
	 *
	 */
	public void dlv_slip_d_rmrks(String value) {
		setConstString(offset + 81, $dlv_slip_d_rmrks, value);
	}


	/**
	 *  着曜日.<p>
	 *
	 */
	public String dlv_day_week_typ() {
		return getConstString(offset + 82, $dlv_day_week_typ);
	}

	/**
	 *  着曜日.<p>
	 *
	 */
	public void dlv_day_week_typ(String value) {
		setConstString(offset + 82, $dlv_day_week_typ, value);
	}


	/**
	 *  価格印字区分.<p>
	 *
	 */
	public String pri_prnt_typ() {
		return getConstString(offset + 83, $pri_prnt_typ);
	}

	/**
	 *  価格印字区分.<p>
	 *
	 */
	public void pri_prnt_typ(String value) {
		setConstString(offset + 83, $pri_prnt_typ, value);
	}


	/**
	 *  案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 84, $wrk_no);
	}

	/**
	 *  案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 84, $wrk_no, value);
	}


	/**
	 *  案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 85, $wrk_nm);
	}

	/**
	 *  案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 85, $wrk_nm, value);
	}


	/**
	 *  取引条件ＣＤ１.<p>
	 *
	 */
	public String tterm_cd1() {
		return getConstString(offset + 86, $tterm_cd1);
	}

	/**
	 *  取引条件ＣＤ１.<p>
	 *
	 */
	public void tterm_cd1(String value) {
		setConstString(offset + 86, $tterm_cd1, value);
	}


	/**
	 *  取引条件名１.<p>
	 *
	 */
	public String tterm_nm1() {
		return getConstString(offset + 87, $tterm_nm1);
	}

	/**
	 *  取引条件名１.<p>
	 *
	 */
	public void tterm_nm1(String value) {
		setConstString(offset + 87, $tterm_nm1, value);
	}


	/**
	 *  取引条件備考１.<p>
	 *
	 */
	public String tterm_rmrks1() {
		return getConstString(offset + 88, $tterm_rmrks1);
	}

	/**
	 *  取引条件備考１.<p>
	 *
	 */
	public void tterm_rmrks1(String value) {
		setConstString(offset + 88, $tterm_rmrks1, value);
	}


	/**
	 *  取引条件ＣＤ２.<p>
	 *
	 */
	public String tterm_cd2() {
		return getConstString(offset + 89, $tterm_cd2);
	}

	/**
	 *  取引条件ＣＤ２.<p>
	 *
	 */
	public void tterm_cd2(String value) {
		setConstString(offset + 89, $tterm_cd2, value);
	}


	/**
	 *  取引条件名２.<p>
	 *
	 */
	public String tterm_nm2() {
		return getConstString(offset + 90, $tterm_nm2);
	}

	/**
	 *  取引条件名２.<p>
	 *
	 */
	public void tterm_nm2(String value) {
		setConstString(offset + 90, $tterm_nm2, value);
	}


	/**
	 *  取引条件備考２.<p>
	 *
	 */
	public String tterm_rmrks2() {
		return getConstString(offset + 91, $tterm_rmrks2);
	}

	/**
	 *  取引条件備考２.<p>
	 *
	 */
	public void tterm_rmrks2(String value) {
		setConstString(offset + 91, $tterm_rmrks2, value);
	}


	/**
	 *  取引条件ＣＤ３.<p>
	 *
	 */
	public String tterm_cd3() {
		return getConstString(offset + 92, $tterm_cd3);
	}

	/**
	 *  取引条件ＣＤ３.<p>
	 *
	 */
	public void tterm_cd3(String value) {
		setConstString(offset + 92, $tterm_cd3, value);
	}


	/**
	 *  取引条件名３.<p>
	 *
	 */
	public String tterm_nm3() {
		return getConstString(offset + 93, $tterm_nm3);
	}

	/**
	 *  取引条件名３.<p>
	 *
	 */
	public void tterm_nm3(String value) {
		setConstString(offset + 93, $tterm_nm3, value);
	}


	/**
	 *  取引条件備考３.<p>
	 *
	 */
	public String tterm_rmrks3() {
		return getConstString(offset + 94, $tterm_rmrks3);
	}

	/**
	 *  取引条件備考３.<p>
	 *
	 */
	public void tterm_rmrks3(String value) {
		setConstString(offset + 94, $tterm_rmrks3, value);
	}


	/**
	 *  輸送方法ＣＤ.<p>
	 *
	 */
	public String trnspt_cd() {
		return getConstString(offset + 95, $trnspt_cd);
	}

	/**
	 *  輸送方法ＣＤ.<p>
	 *
	 */
	public void trnspt_cd(String value) {
		setConstString(offset + 95, $trnspt_cd, value);
	}


	/**
	 *  輸送方法名.<p>
	 *
	 */
	public String trnspt_nm() {
		return getConstString(offset + 96, $trnspt_nm);
	}

	/**
	 *  輸送方法名.<p>
	 *
	 */
	public void trnspt_nm(String value) {
		setConstString(offset + 96, $trnspt_nm, value);
	}


	/**
	 *  船積港ＣＤ.<p>
	 *
	 */
	public String load_port_cd() {
		return getConstString(offset + 97, $load_port_cd);
	}

	/**
	 *  船積港ＣＤ.<p>
	 *
	 */
	public void load_port_cd(String value) {
		setConstString(offset + 97, $load_port_cd, value);
	}


	/**
	 *  船積港名.<p>
	 *
	 */
	public String load_port_nm() {
		return getConstString(offset + 98, $load_port_nm);
	}

	/**
	 *  船積港名.<p>
	 *
	 */
	public void load_port_nm(String value) {
		setConstString(offset + 98, $load_port_nm, value);
	}


	/**
	 *  船卸港ＣＤ.<p>
	 *
	 */
	public String dschrg_port_cd() {
		return getConstString(offset + 99, $dschrg_port_cd);
	}

	/**
	 *  船卸港ＣＤ.<p>
	 *
	 */
	public void dschrg_port_cd(String value) {
		setConstString(offset + 99, $dschrg_port_cd, value);
	}


	/**
	 *  船卸港名.<p>
	 *
	 */
	public String dschrg_port_nm() {
		return getConstString(offset + 100, $dschrg_port_nm);
	}

	/**
	 *  船卸港名.<p>
	 *
	 */
	public void dschrg_port_nm(String value) {
		setConstString(offset + 100, $dschrg_port_nm, value);
	}


	/**
	 *  経由地ＣＤ.<p>
	 *
	 */
	public String via_port_cd() {
		return getConstString(offset + 101, $via_port_cd);
	}

	/**
	 *  経由地ＣＤ.<p>
	 *
	 */
	public void via_port_cd(String value) {
		setConstString(offset + 101, $via_port_cd, value);
	}


	/**
	 *  経由地名.<p>
	 *
	 */
	public String via_port_nm() {
		return getConstString(offset + 102, $via_port_nm);
	}

	/**
	 *  経由地名.<p>
	 *
	 */
	public void via_port_nm(String value) {
		setConstString(offset + 102, $via_port_nm, value);
	}


	/**
	 *  受注者品目ＣＤ.<p>
	 *
	 */
	public String slo_co_itm_cd() {
		return getConstString(offset + 103, $slo_co_itm_cd);
	}

	/**
	 *  受注者品目ＣＤ.<p>
	 *
	 */
	public void slo_co_itm_cd(String value) {
		setConstString(offset + 103, $slo_co_itm_cd, value);
	}


	/**
	 *  受注者枝番１.<p>
	 *
	 */
	public String slo_co_itm_sub1() {
		return getConstString(offset + 104, $slo_co_itm_sub1);
	}

	/**
	 *  受注者枝番１.<p>
	 *
	 */
	public void slo_co_itm_sub1(String value) {
		setConstString(offset + 104, $slo_co_itm_sub1, value);
	}


	/**
	 *  受注者枝番２.<p>
	 *
	 */
	public String slo_co_itm_sub2() {
		return getConstString(offset + 105, $slo_co_itm_sub2);
	}

	/**
	 *  受注者枝番２.<p>
	 *
	 */
	public void slo_co_itm_sub2(String value) {
		setConstString(offset + 105, $slo_co_itm_sub2, value);
	}


	/**
	 *  受注者枝番３.<p>
	 *
	 */
	public String slo_co_itm_sub3() {
		return getConstString(offset + 106, $slo_co_itm_sub3);
	}

	/**
	 *  受注者枝番３.<p>
	 *
	 */
	public void slo_co_itm_sub3(String value) {
		setConstString(offset + 106, $slo_co_itm_sub3, value);
	}


	/**
	 *  受注者品名.<p>
	 *
	 */
	public String slo_co_itm_nm() {
		return getConstString(offset + 107, $slo_co_itm_nm);
	}

	/**
	 *  受注者品名.<p>
	 *
	 */
	public void slo_co_itm_nm(String value) {
		setConstString(offset + 107, $slo_co_itm_nm, value);
	}


	/**
	 *  原産地ＣＤ.<p>
	 *
	 */
	public String cntry_org_cd() {
		return getConstString(offset + 108, $cntry_org_cd);
	}

	/**
	 *  原産地ＣＤ.<p>
	 *
	 */
	public void cntry_org_cd(String value) {
		setConstString(offset + 108, $cntry_org_cd, value);
	}


	/**
	 *  手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 109, $sno1);
	}

	/**
	 *  手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 109, $sno1, value);
	}


	/**
	 *  手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 110, $sno2);
	}

	/**
	 *  手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 110, $sno2, value);
	}


	/**
	 *  手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 111, $sno3);
	}

	/**
	 *  手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 111, $sno3, value);
	}


	/**
	 *  手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 112, $sno4);
	}

	/**
	 *  手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 112, $sno4, value);
	}


	/**
	 *  格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 113, $gd_cd);
	}

	/**
	 *  格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 113, $gd_cd, value);
	}


	/**
	 *  格付名.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 114, $gd_nm);
	}

	/**
	 *  格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 114, $gd_nm, value);
	}


	/**
	 *  取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 115, $trd_unit_cd);
	}

	/**
	 *  取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 115, $trd_unit_cd, value);
	}


	/**
	 *  取引単位名.<p>
	 *
	 */
	public String trd_unit_nm() {
		return getConstString(offset + 116, $trd_unit_nm);
	}

	/**
	 *  取引単位名.<p>
	 *
	 */
	public void trd_unit_nm(String value) {
		setConstString(offset + 116, $trd_unit_nm, value);
	}


	/**
	 *  取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return getConstNumber(offset + 117, $trd_unit_qty);
	}

	/**
	 *  取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 117, $trd_unit_qty, value);
	}

	/**
	 *  取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		setConstNumber(offset + 117, $trd_unit_qty, value);
	}

	/**
	 *  取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		setConstNumber(offset + 117, $trd_unit_qty, value);
	}

	/**
	 *  取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		setConstNumber(offset + 117, $trd_unit_qty, value);
	}

	/**
	 *  取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		setConstNumber(offset + 117, $trd_unit_qty, value);
	}


	/**
	 *  取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 118, $trd_cur_cd);
	}

	/**
	 *  取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 118, $trd_cur_cd, value);
	}


	/**
	 *  内税ＦＬＧ.<p>
	 *
	 */
	public boolean inc_tax_flg() {
		return getConstBoolean(offset + 119, $inc_tax_flg);
	}

	/**
	 *  内税ＦＬＧ.<p>
	 *
	 */
	public void inc_tax_flg(boolean value) {
		setConstBoolean(offset + 119, $inc_tax_flg, value);
	}


	/**
	 *  仮単価ＦＬＧ.<p>
	 *
	 */
	public boolean interim_flg() {
		return getConstBoolean(offset + 120, $interim_flg);
	}

	/**
	 *  仮単価ＦＬＧ.<p>
	 *
	 */
	public void interim_flg(boolean value) {
		setConstBoolean(offset + 120, $interim_flg, value);
	}


	/**
	 *  取引通貨単価.<p>
	 *
	 */
	public MCNumber trd_cur_upri() {
		return getConstNumber(offset + 121, $trd_cur_upri);
	}

	/**
	 *  取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 121, $trd_cur_upri, value);
	}

	/**
	 *  取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(int value) {
		setConstNumber(offset + 121, $trd_cur_upri, value);
	}

	/**
	 *  取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(long value) {
		setConstNumber(offset + 121, $trd_cur_upri, value);
	}

	/**
	 *  取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(float value) {
		setConstNumber(offset + 121, $trd_cur_upri, value);
	}

	/**
	 *  取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(double value) {
		setConstNumber(offset + 121, $trd_cur_upri, value);
	}


	/**
	 *  取引通貨金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return getConstNumber(offset + 122, $trd_cur_amt);
	}

	/**
	 *  取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 122, $trd_cur_amt, value);
	}

	/**
	 *  取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		setConstNumber(offset + 122, $trd_cur_amt, value);
	}

	/**
	 *  取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		setConstNumber(offset + 122, $trd_cur_amt, value);
	}

	/**
	 *  取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		setConstNumber(offset + 122, $trd_cur_amt, value);
	}

	/**
	 *  取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		setConstNumber(offset + 122, $trd_cur_amt, value);
	}


	/**
	 *  取引通貨値引額.<p>
	 *
	 */
	public MCNumber trd_cur_dscnt_amt() {
		return getConstNumber(offset + 123, $trd_cur_dscnt_amt);
	}

	/**
	 *  取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 123, $trd_cur_dscnt_amt, value);
	}

	/**
	 *  取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(int value) {
		setConstNumber(offset + 123, $trd_cur_dscnt_amt, value);
	}

	/**
	 *  取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(long value) {
		setConstNumber(offset + 123, $trd_cur_dscnt_amt, value);
	}

	/**
	 *  取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(float value) {
		setConstNumber(offset + 123, $trd_cur_dscnt_amt, value);
	}

	/**
	 *  取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(double value) {
		setConstNumber(offset + 123, $trd_cur_dscnt_amt, value);
	}


	/**
	 *  値引理由ＣＤ.<p>
	 *
	 */
	public String dscnt_rsn_cd() {
		return getConstString(offset + 124, $dscnt_rsn_cd);
	}

	/**
	 *  値引理由ＣＤ.<p>
	 *
	 */
	public void dscnt_rsn_cd(String value) {
		setConstString(offset + 124, $dscnt_rsn_cd, value);
	}


	/**
	 *  値引理由名.<p>
	 *
	 */
	public String dscnt_rsn_nm() {
		return getConstString(offset + 125, $dscnt_rsn_nm);
	}

	/**
	 *  値引理由名.<p>
	 *
	 */
	public void dscnt_rsn_nm(String value) {
		setConstString(offset + 125, $dscnt_rsn_nm, value);
	}


	/**
	 *  税指定ＦＬＧ.<p>
	 *
	 */
	public boolean tax_fix_flg() {
		return getConstBoolean(offset + 126, $tax_fix_flg);
	}

	/**
	 *  税指定ＦＬＧ.<p>
	 *
	 */
	public void tax_fix_flg(boolean value) {
		setConstBoolean(offset + 126, $tax_fix_flg, value);
	}


	/**
	 *  税ＣＤ.<p>
	 *
	 */
	public String tax_cd() {
		return getConstString(offset + 127, $tax_cd);
	}

	/**
	 *  税ＣＤ.<p>
	 *
	 */
	public void tax_cd(String value) {
		setConstString(offset + 127, $tax_cd, value);
	}


	/**
	 *  税名.<p>
	 *
	 */
	public String tax_nm() {
		return getConstString(offset + 128, $tax_nm);
	}

	/**
	 *  税名.<p>
	 *
	 */
	public void tax_nm(String value) {
		setConstString(offset + 128, $tax_nm, value);
	}


	/**
	 *  税率.<p>
	 *
	 */
	public MCNumber tax_rate() {
		return getConstNumber(offset + 129, $tax_rate);
	}

	/**
	 *  税率.<p>
	 *
	 */
	public void tax_rate(MCNumber value) {
		setConstNumber(offset + 129, $tax_rate, value);
	}

	/**
	 *  税率.<p>
	 *
	 */
	public void tax_rate(int value) {
		setConstNumber(offset + 129, $tax_rate, value);
	}

	/**
	 *  税率.<p>
	 *
	 */
	public void tax_rate(long value) {
		setConstNumber(offset + 129, $tax_rate, value);
	}

	/**
	 *  税率.<p>
	 *
	 */
	public void tax_rate(float value) {
		setConstNumber(offset + 129, $tax_rate, value);
	}

	/**
	 *  税率.<p>
	 *
	 */
	public void tax_rate(double value) {
		setConstNumber(offset + 129, $tax_rate, value);
	}


	/**
	 *  税区分.<p>
	 *
	 */
	public String tax_typ() {
		return getConstString(offset + 130, $tax_typ);
	}

	/**
	 *  税区分.<p>
	 *
	 */
	public void tax_typ(String value) {
		setConstString(offset + 130, $tax_typ, value);
	}


	/**
	 *  取引通貨税額.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt() {
		return getConstNumber(offset + 131, $trd_cur_tax_amt);
	}

	/**
	 *  取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 131, $trd_cur_tax_amt, value);
	}

	/**
	 *  取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(int value) {
		setConstNumber(offset + 131, $trd_cur_tax_amt, value);
	}

	/**
	 *  取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(long value) {
		setConstNumber(offset + 131, $trd_cur_tax_amt, value);
	}

	/**
	 *  取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(float value) {
		setConstNumber(offset + 131, $trd_cur_tax_amt, value);
	}

	/**
	 *  取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(double value) {
		setConstNumber(offset + 131, $trd_cur_tax_amt, value);
	}


	/**
	 *  出荷倉庫ＣＤ.<p>
	 *
	 */
	public String ship_wh_cd() {
		return getConstString(offset + 132, $ship_wh_cd);
	}

	/**
	 *  出荷倉庫ＣＤ.<p>
	 *
	 */
	public void ship_wh_cd(String value) {
		setConstString(offset + 132, $ship_wh_cd, value);
	}


	/**
	 *  出荷倉庫名.<p>
	 *
	 */
	public String ship_wh_nm() {
		return getConstString(offset + 133, $ship_wh_nm);
	}

	/**
	 *  出荷倉庫名.<p>
	 *
	 */
	public void ship_wh_nm(String value) {
		setConstString(offset + 133, $ship_wh_nm, value);
	}


	/**
	 *  出荷留めＦＬＧ.<p>
	 *
	 */
	public boolean ship_block_flg() {
		return getConstBoolean(offset + 134, $ship_block_flg);
	}

	/**
	 *  出荷留めＦＬＧ.<p>
	 *
	 */
	public void ship_block_flg(boolean value) {
		setConstBoolean(offset + 134, $ship_block_flg, value);
	}


	/**
	 *  打切ＦＬＧ.<p>
	 *
	 */
	public boolean abort_flg() {
		return getConstBoolean(offset + 135, $abort_flg);
	}

	/**
	 *  打切ＦＬＧ.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		setConstBoolean(offset + 135, $abort_flg, value);
	}


	/**
	 *  品揃グループＮＯ.<p>
	 *
	 */
	public MCNumber set_itm_grp_no() {
		return getConstNumber(offset + 136, $set_itm_grp_no);
	}

	/**
	 *  品揃グループＮＯ.<p>
	 *
	 */
	public void set_itm_grp_no(MCNumber value) {
		setConstNumber(offset + 136, $set_itm_grp_no, value);
	}

	/**
	 *  品揃グループＮＯ.<p>
	 *
	 */
	public void set_itm_grp_no(int value) {
		setConstNumber(offset + 136, $set_itm_grp_no, value);
	}

	/**
	 *  品揃グループＮＯ.<p>
	 *
	 */
	public void set_itm_grp_no(long value) {
		setConstNumber(offset + 136, $set_itm_grp_no, value);
	}

	/**
	 *  品揃グループＮＯ.<p>
	 *
	 */
	public void set_itm_grp_no(float value) {
		setConstNumber(offset + 136, $set_itm_grp_no, value);
	}

	/**
	 *  品揃グループＮＯ.<p>
	 *
	 */
	public void set_itm_grp_no(double value) {
		setConstNumber(offset + 136, $set_itm_grp_no, value);
	}


	/**
	 *  納入希望日.<p>
	 *
	 */
	public MCDate dlv_rqst_dt() {
		return getConstDate(offset + 137, $dlv_rqst_dt);
	}

	/**
	 *  納入希望日.<p>
	 *
	 */
	public void dlv_rqst_dt(MCDate value) {
		setConstDate(offset + 137, $dlv_rqst_dt, value);
	}


	/**
	 *  納入希望時刻.<p>
	 *
	 */
	public MCDate dlv_rqst_hm() {
		return getConstDate(offset + 138, $dlv_rqst_hm);
	}

	/**
	 *  納入希望時刻.<p>
	 *
	 */
	public void dlv_rqst_hm(MCDate value) {
		setConstDate(offset + 138, $dlv_rqst_hm, value);
	}


	/**
	 *  仕入予定日.<p>
	 *
	 */
	public MCDate purc_schd_dt() {
		return getConstDate(offset + 139, $purc_schd_dt);
	}

	/**
	 *  仕入予定日.<p>
	 *
	 */
	public void purc_schd_dt(MCDate value) {
		setConstDate(offset + 139, $purc_schd_dt, value);
	}


	/**
	 *  メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 140, $maker_cd);
	}

	/**
	 *  メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 140, $maker_cd, value);
	}


	/**
	 *  メーカ名.<p>
	 *
	 */
	public String maker_nm() {
		return getConstString(offset + 141, $maker_nm);
	}

	/**
	 *  メーカ名.<p>
	 *
	 */
	public void maker_nm(String value) {
		setConstString(offset + 141, $maker_nm, value);
	}


	/**
	 *  版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 142, $ver_no);
	}

	/**
	 *  版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 142, $ver_no, value);
	}


	/**
	 *  ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 143, $lot_no);
	}

	/**
	 *  ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 143, $lot_no, value);
	}


	/**
	 *  サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 144, $sublot_no);
	}

	/**
	 *  サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 144, $sublot_no, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 145, $sub_char1);
	}

	/**
	 *  予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 145, $sub_char1, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 146, $sub_char2);
	}

	/**
	 *  予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 146, $sub_char2, value);
	}


	/**
	 *  予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 147, $sub_char3);
	}

	/**
	 *  予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 147, $sub_char3, value);
	}


	/**
	 *  予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public String sub_char4() {
		return getConstString(offset + 148, $sub_char4);
	}

	/**
	 *  予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public void sub_char4(String value) {
		setConstString(offset + 148, $sub_char4, value);
	}


	/**
	 *  予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public String sub_char5() {
		return getConstString(offset + 149, $sub_char5);
	}

	/**
	 *  予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public void sub_char5(String value) {
		setConstString(offset + 149, $sub_char5, value);
	}


	/**
	 *  予備ＣＨＡＲ項目６.<p>
	 *
	 */
	public String sub_char6() {
		return getConstString(offset + 150, $sub_char6);
	}

	/**
	 *  予備ＣＨＡＲ項目６.<p>
	 *
	 */
	public void sub_char6(String value) {
		setConstString(offset + 150, $sub_char6, value);
	}


	/**
	 *  予備ＣＨＡＲ項目７.<p>
	 *
	 */
	public String sub_char7() {
		return getConstString(offset + 151, $sub_char7);
	}

	/**
	 *  予備ＣＨＡＲ項目７.<p>
	 *
	 */
	public void sub_char7(String value) {
		setConstString(offset + 151, $sub_char7, value);
	}


	/**
	 *  予備ＣＨＡＲ項目８.<p>
	 *
	 */
	public String sub_char8() {
		return getConstString(offset + 152, $sub_char8);
	}

	/**
	 *  予備ＣＨＡＲ項目８.<p>
	 *
	 */
	public void sub_char8(String value) {
		setConstString(offset + 152, $sub_char8, value);
	}


	/**
	 *  予備ＣＨＡＲ項目９.<p>
	 *
	 */
	public String sub_char9() {
		return getConstString(offset + 153, $sub_char9);
	}

	/**
	 *  予備ＣＨＡＲ項目９.<p>
	 *
	 */
	public void sub_char9(String value) {
		setConstString(offset + 153, $sub_char9, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１０.<p>
	 *
	 */
	public String sub_char10() {
		return getConstString(offset + 154, $sub_char10);
	}

	/**
	 *  予備ＣＨＡＲ項目１０.<p>
	 *
	 */
	public void sub_char10(String value) {
		setConstString(offset + 154, $sub_char10, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１１.<p>
	 *
	 */
	public String sub_char11() {
		return getConstString(offset + 155, $sub_char11);
	}

	/**
	 *  予備ＣＨＡＲ項目１１.<p>
	 *
	 */
	public void sub_char11(String value) {
		setConstString(offset + 155, $sub_char11, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１２.<p>
	 *
	 */
	public String sub_char12() {
		return getConstString(offset + 156, $sub_char12);
	}

	/**
	 *  予備ＣＨＡＲ項目１２.<p>
	 *
	 */
	public void sub_char12(String value) {
		setConstString(offset + 156, $sub_char12, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１３.<p>
	 *
	 */
	public String sub_char13() {
		return getConstString(offset + 157, $sub_char13);
	}

	/**
	 *  予備ＣＨＡＲ項目１３.<p>
	 *
	 */
	public void sub_char13(String value) {
		setConstString(offset + 157, $sub_char13, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１４.<p>
	 *
	 */
	public String sub_char14() {
		return getConstString(offset + 158, $sub_char14);
	}

	/**
	 *  予備ＣＨＡＲ項目１４.<p>
	 *
	 */
	public void sub_char14(String value) {
		setConstString(offset + 158, $sub_char14, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１５.<p>
	 *
	 */
	public String sub_char15() {
		return getConstString(offset + 159, $sub_char15);
	}

	/**
	 *  予備ＣＨＡＲ項目１５.<p>
	 *
	 */
	public void sub_char15(String value) {
		setConstString(offset + 159, $sub_char15, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１６.<p>
	 *
	 */
	public String sub_char16() {
		return getConstString(offset + 160, $sub_char16);
	}

	/**
	 *  予備ＣＨＡＲ項目１６.<p>
	 *
	 */
	public void sub_char16(String value) {
		setConstString(offset + 160, $sub_char16, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１７.<p>
	 *
	 */
	public String sub_char17() {
		return getConstString(offset + 161, $sub_char17);
	}

	/**
	 *  予備ＣＨＡＲ項目１７.<p>
	 *
	 */
	public void sub_char17(String value) {
		setConstString(offset + 161, $sub_char17, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１８.<p>
	 *
	 */
	public String sub_char18() {
		return getConstString(offset + 162, $sub_char18);
	}

	/**
	 *  予備ＣＨＡＲ項目１８.<p>
	 *
	 */
	public void sub_char18(String value) {
		setConstString(offset + 162, $sub_char18, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１９.<p>
	 *
	 */
	public String sub_char19() {
		return getConstString(offset + 163, $sub_char19);
	}

	/**
	 *  予備ＣＨＡＲ項目１９.<p>
	 *
	 */
	public void sub_char19(String value) {
		setConstString(offset + 163, $sub_char19, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２０.<p>
	 *
	 */
	public String sub_char20() {
		return getConstString(offset + 164, $sub_char20);
	}

	/**
	 *  予備ＣＨＡＲ項目２０.<p>
	 *
	 */
	public void sub_char20(String value) {
		setConstString(offset + 164, $sub_char20, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２１.<p>
	 *
	 */
	public String sub_char21() {
		return getConstString(offset + 165, $sub_char21);
	}

	/**
	 *  予備ＣＨＡＲ項目２１.<p>
	 *
	 */
	public void sub_char21(String value) {
		setConstString(offset + 165, $sub_char21, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２２.<p>
	 *
	 */
	public String sub_char22() {
		return getConstString(offset + 166, $sub_char22);
	}

	/**
	 *  予備ＣＨＡＲ項目２２.<p>
	 *
	 */
	public void sub_char22(String value) {
		setConstString(offset + 166, $sub_char22, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２３.<p>
	 *
	 */
	public String sub_char23() {
		return getConstString(offset + 167, $sub_char23);
	}

	/**
	 *  予備ＣＨＡＲ項目２３.<p>
	 *
	 */
	public void sub_char23(String value) {
		setConstString(offset + 167, $sub_char23, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２４.<p>
	 *
	 */
	public String sub_char24() {
		return getConstString(offset + 168, $sub_char24);
	}

	/**
	 *  予備ＣＨＡＲ項目２４.<p>
	 *
	 */
	public void sub_char24(String value) {
		setConstString(offset + 168, $sub_char24, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２５.<p>
	 *
	 */
	public String sub_char25() {
		return getConstString(offset + 169, $sub_char25);
	}

	/**
	 *  予備ＣＨＡＲ項目２５.<p>
	 *
	 */
	public void sub_char25(String value) {
		setConstString(offset + 169, $sub_char25, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２６.<p>
	 *
	 */
	public String sub_char26() {
		return getConstString(offset + 170, $sub_char26);
	}

	/**
	 *  予備ＣＨＡＲ項目２６.<p>
	 *
	 */
	public void sub_char26(String value) {
		setConstString(offset + 170, $sub_char26, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２７.<p>
	 *
	 */
	public String sub_char27() {
		return getConstString(offset + 171, $sub_char27);
	}

	/**
	 *  予備ＣＨＡＲ項目２７.<p>
	 *
	 */
	public void sub_char27(String value) {
		setConstString(offset + 171, $sub_char27, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２８.<p>
	 *
	 */
	public String sub_char28() {
		return getConstString(offset + 172, $sub_char28);
	}

	/**
	 *  予備ＣＨＡＲ項目２８.<p>
	 *
	 */
	public void sub_char28(String value) {
		setConstString(offset + 172, $sub_char28, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２９.<p>
	 *
	 */
	public String sub_char29() {
		return getConstString(offset + 173, $sub_char29);
	}

	/**
	 *  予備ＣＨＡＲ項目２９.<p>
	 *
	 */
	public void sub_char29(String value) {
		setConstString(offset + 173, $sub_char29, value);
	}


	/**
	 *  予備ＣＨＡＲ項目３０.<p>
	 *
	 */
	public String sub_char30() {
		return getConstString(offset + 174, $sub_char30);
	}

	/**
	 *  予備ＣＨＡＲ項目３０.<p>
	 *
	 */
	public void sub_char30(String value) {
		setConstString(offset + 174, $sub_char30, value);
	}


	/**
	 *  予備ＮＵＭ項目１.<p>
	 *
	 */
	public MCNumber sub_num1() {
		return getConstNumber(offset + 175, $sub_num1);
	}

	/**
	 *  予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(MCNumber value) {
		setConstNumber(offset + 175, $sub_num1, value);
	}

	/**
	 *  予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(int value) {
		setConstNumber(offset + 175, $sub_num1, value);
	}

	/**
	 *  予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(long value) {
		setConstNumber(offset + 175, $sub_num1, value);
	}

	/**
	 *  予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(float value) {
		setConstNumber(offset + 175, $sub_num1, value);
	}

	/**
	 *  予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(double value) {
		setConstNumber(offset + 175, $sub_num1, value);
	}


	/**
	 *  予備ＮＵＭ項目２.<p>
	 *
	 */
	public MCNumber sub_num2() {
		return getConstNumber(offset + 176, $sub_num2);
	}

	/**
	 *  予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(MCNumber value) {
		setConstNumber(offset + 176, $sub_num2, value);
	}

	/**
	 *  予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(int value) {
		setConstNumber(offset + 176, $sub_num2, value);
	}

	/**
	 *  予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(long value) {
		setConstNumber(offset + 176, $sub_num2, value);
	}

	/**
	 *  予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(float value) {
		setConstNumber(offset + 176, $sub_num2, value);
	}

	/**
	 *  予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(double value) {
		setConstNumber(offset + 176, $sub_num2, value);
	}


	/**
	 *  予備ＮＵＭ項目３.<p>
	 *
	 */
	public MCNumber sub_num3() {
		return getConstNumber(offset + 177, $sub_num3);
	}

	/**
	 *  予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(MCNumber value) {
		setConstNumber(offset + 177, $sub_num3, value);
	}

	/**
	 *  予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(int value) {
		setConstNumber(offset + 177, $sub_num3, value);
	}

	/**
	 *  予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(long value) {
		setConstNumber(offset + 177, $sub_num3, value);
	}

	/**
	 *  予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(float value) {
		setConstNumber(offset + 177, $sub_num3, value);
	}

	/**
	 *  予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(double value) {
		setConstNumber(offset + 177, $sub_num3, value);
	}


	/**
	 *  予備ＮＵＭ項目４.<p>
	 *
	 */
	public MCNumber sub_num4() {
		return getConstNumber(offset + 178, $sub_num4);
	}

	/**
	 *  予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(MCNumber value) {
		setConstNumber(offset + 178, $sub_num4, value);
	}

	/**
	 *  予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(int value) {
		setConstNumber(offset + 178, $sub_num4, value);
	}

	/**
	 *  予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(long value) {
		setConstNumber(offset + 178, $sub_num4, value);
	}

	/**
	 *  予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(float value) {
		setConstNumber(offset + 178, $sub_num4, value);
	}

	/**
	 *  予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(double value) {
		setConstNumber(offset + 178, $sub_num4, value);
	}


	/**
	 *  予備ＮＵＭ項目５.<p>
	 *
	 */
	public MCNumber sub_num5() {
		return getConstNumber(offset + 179, $sub_num5);
	}

	/**
	 *  予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(MCNumber value) {
		setConstNumber(offset + 179, $sub_num5, value);
	}

	/**
	 *  予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(int value) {
		setConstNumber(offset + 179, $sub_num5, value);
	}

	/**
	 *  予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(long value) {
		setConstNumber(offset + 179, $sub_num5, value);
	}

	/**
	 *  予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(float value) {
		setConstNumber(offset + 179, $sub_num5, value);
	}

	/**
	 *  予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(double value) {
		setConstNumber(offset + 179, $sub_num5, value);
	}


	/**
	 *  予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public MCDate sub_dt1() {
		return getConstDate(offset + 180, $sub_dt1);
	}

	/**
	 *  予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public void sub_dt1(MCDate value) {
		setConstDate(offset + 180, $sub_dt1, value);
	}


	/**
	 *  予備ＤＡＴＥ項目２.<p>
	 *
	 */
	public MCDate sub_dt2() {
		return getConstDate(offset + 181, $sub_dt2);
	}

	/**
	 *  予備ＤＡＴＥ項目２.<p>
	 *
	 */
	public void sub_dt2(MCDate value) {
		setConstDate(offset + 181, $sub_dt2, value);
	}


	/**
	 *  予備ＤＡＴＥ項目３.<p>
	 *
	 */
	public MCDate sub_dt3() {
		return getConstDate(offset + 182, $sub_dt3);
	}

	/**
	 *  予備ＤＡＴＥ項目３.<p>
	 *
	 */
	public void sub_dt3(MCDate value) {
		setConstDate(offset + 182, $sub_dt3, value);
	}


	/**
	 *  予備ＤＡＴＥ項目４.<p>
	 *
	 */
	public MCDate sub_dt4() {
		return getConstDate(offset + 183, $sub_dt4);
	}

	/**
	 *  予備ＤＡＴＥ項目４.<p>
	 *
	 */
	public void sub_dt4(MCDate value) {
		setConstDate(offset + 183, $sub_dt4, value);
	}


	/**
	 *  予備ＤＡＴＥ項目５.<p>
	 *
	 */
	public MCDate sub_dt5() {
		return getConstDate(offset + 184, $sub_dt5);
	}

	/**
	 *  予備ＤＡＴＥ項目５.<p>
	 *
	 */
	public void sub_dt5(MCDate value) {
		setConstDate(offset + 184, $sub_dt5, value);
	}


	/**
	 *  ＥＤＩ予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public String edi_sub_char1() {
		return getConstString(offset + 185, $edi_sub_char1);
	}

	/**
	 *  ＥＤＩ予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public void edi_sub_char1(String value) {
		setConstString(offset + 185, $edi_sub_char1, value);
	}


	/**
	 *  ＥＤＩ予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public String edi_sub_char2() {
		return getConstString(offset + 186, $edi_sub_char2);
	}

	/**
	 *  ＥＤＩ予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public void edi_sub_char2(String value) {
		setConstString(offset + 186, $edi_sub_char2, value);
	}


	/**
	 *  ＥＤＩ予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public String edi_sub_char3() {
		return getConstString(offset + 187, $edi_sub_char3);
	}

	/**
	 *  ＥＤＩ予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public void edi_sub_char3(String value) {
		setConstString(offset + 187, $edi_sub_char3, value);
	}


	/**
	 *  ＥＤＩ予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public String edi_sub_char4() {
		return getConstString(offset + 188, $edi_sub_char4);
	}

	/**
	 *  ＥＤＩ予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public void edi_sub_char4(String value) {
		setConstString(offset + 188, $edi_sub_char4, value);
	}


	/**
	 *  ＥＤＩ予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public String edi_sub_char5() {
		return getConstString(offset + 189, $edi_sub_char5);
	}

	/**
	 *  ＥＤＩ予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public void edi_sub_char5(String value) {
		setConstString(offset + 189, $edi_sub_char5, value);
	}


	/**
	 *  ＥＤＩ予備ＮＵＭ項目１.<p>
	 *
	 */
	public MCNumber edi_sub_num1() {
		return getConstNumber(offset + 190, $edi_sub_num1);
	}

	/**
	 *  ＥＤＩ予備ＮＵＭ項目１.<p>
	 *
	 */
	public void edi_sub_num1(MCNumber value) {
		setConstNumber(offset + 190, $edi_sub_num1, value);
	}

	/**
	 *  ＥＤＩ予備ＮＵＭ項目１.<p>
	 *
	 */
	public void edi_sub_num1(int value) {
		setConstNumber(offset + 190, $edi_sub_num1, value);
	}

	/**
	 *  ＥＤＩ予備ＮＵＭ項目１.<p>
	 *
	 */
	public void edi_sub_num1(long value) {
		setConstNumber(offset + 190, $edi_sub_num1, value);
	}

	/**
	 *  ＥＤＩ予備ＮＵＭ項目１.<p>
	 *
	 */
	public void edi_sub_num1(float value) {
		setConstNumber(offset + 190, $edi_sub_num1, value);
	}

	/**
	 *  ＥＤＩ予備ＮＵＭ項目１.<p>
	 *
	 */
	public void edi_sub_num1(double value) {
		setConstNumber(offset + 190, $edi_sub_num1, value);
	}


	/**
	 *  ＥＤＩ予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public MCDate edi_sub_dt1() {
		return getConstDate(offset + 191, $edi_sub_dt1);
	}

	/**
	 *  ＥＤＩ予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public void edi_sub_dt1(MCDate value) {
		setConstDate(offset + 191, $edi_sub_dt1, value);
	}


	/**
	 *  ＥＤＩ明細予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public String edi_sub_d_char1() {
		return getConstString(offset + 192, $edi_sub_d_char1);
	}

	/**
	 *  ＥＤＩ明細予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public void edi_sub_d_char1(String value) {
		setConstString(offset + 192, $edi_sub_d_char1, value);
	}


	/**
	 *  ＥＤＩ明細予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public String edi_sub_d_char2() {
		return getConstString(offset + 193, $edi_sub_d_char2);
	}

	/**
	 *  ＥＤＩ明細予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public void edi_sub_d_char2(String value) {
		setConstString(offset + 193, $edi_sub_d_char2, value);
	}


	/**
	 *  ＥＤＩ明細予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public String edi_sub_d_char3() {
		return getConstString(offset + 194, $edi_sub_d_char3);
	}

	/**
	 *  ＥＤＩ明細予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public void edi_sub_d_char3(String value) {
		setConstString(offset + 194, $edi_sub_d_char3, value);
	}


	/**
	 *  ＥＤＩ明細予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public String edi_sub_d_char4() {
		return getConstString(offset + 195, $edi_sub_d_char4);
	}

	/**
	 *  ＥＤＩ明細予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public void edi_sub_d_char4(String value) {
		setConstString(offset + 195, $edi_sub_d_char4, value);
	}


	/**
	 *  ＥＤＩ明細予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public String edi_sub_d_char5() {
		return getConstString(offset + 196, $edi_sub_d_char5);
	}

	/**
	 *  ＥＤＩ明細予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public void edi_sub_d_char5(String value) {
		setConstString(offset + 196, $edi_sub_d_char5, value);
	}


	/**
	 *  ＥＤＩ明細予備ＮＵＭ項目１.<p>
	 *
	 */
	public MCNumber edi_sub_d_num1() {
		return getConstNumber(offset + 197, $edi_sub_d_num1);
	}

	/**
	 *  ＥＤＩ明細予備ＮＵＭ項目１.<p>
	 *
	 */
	public void edi_sub_d_num1(MCNumber value) {
		setConstNumber(offset + 197, $edi_sub_d_num1, value);
	}

	/**
	 *  ＥＤＩ明細予備ＮＵＭ項目１.<p>
	 *
	 */
	public void edi_sub_d_num1(int value) {
		setConstNumber(offset + 197, $edi_sub_d_num1, value);
	}

	/**
	 *  ＥＤＩ明細予備ＮＵＭ項目１.<p>
	 *
	 */
	public void edi_sub_d_num1(long value) {
		setConstNumber(offset + 197, $edi_sub_d_num1, value);
	}

	/**
	 *  ＥＤＩ明細予備ＮＵＭ項目１.<p>
	 *
	 */
	public void edi_sub_d_num1(float value) {
		setConstNumber(offset + 197, $edi_sub_d_num1, value);
	}

	/**
	 *  ＥＤＩ明細予備ＮＵＭ項目１.<p>
	 *
	 */
	public void edi_sub_d_num1(double value) {
		setConstNumber(offset + 197, $edi_sub_d_num1, value);
	}


	/**
	 *  ＥＤＩ明細予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public MCDate edi_sub_d_dt1() {
		return getConstDate(offset + 198, $edi_sub_d_dt1);
	}

	/**
	 *  ＥＤＩ明細予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public void edi_sub_d_dt1(MCDate value) {
		setConstDate(offset + 198, $edi_sub_d_dt1, value);
	}


	public String getString(String name) {
		if ($trd_typ_cd.equalsIgnoreCase(name)) {
			return trd_typ_cd();
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($po_crud_typ.equalsIgnoreCase(name)) {
			return po_crud_typ();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($po_co_cd.equalsIgnoreCase(name)) {
			return po_co_cd();
		}
		if ($po_co_nm.equalsIgnoreCase(name)) {
			return po_co_nm();
		}
		if ($po_co_cntry_cd.equalsIgnoreCase(name)) {
			return po_co_cntry_cd();
		}
		if ($slo_co_cd.equalsIgnoreCase(name)) {
			return slo_co_cd();
		}
		if ($slo_co_nm.equalsIgnoreCase(name)) {
			return slo_co_nm();
		}
		if ($slo_co_cntry_cd.equalsIgnoreCase(name)) {
			return slo_co_cntry_cd();
		}
		if ($crct_rsn_nm.equalsIgnoreCase(name)) {
			return crct_rsn_nm();
		}
		if ($crct_rsn_rmrks.equalsIgnoreCase(name)) {
			return crct_rsn_rmrks();
		}
		if ($po_print_txt.equalsIgnoreCase(name)) {
			return po_print_txt();
		}
		if ($po_print_rmrks.equalsIgnoreCase(name)) {
			return po_print_rmrks();
		}
		if ($po_print_d_rmrks.equalsIgnoreCase(name)) {
			return po_print_d_rmrks();
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			return purc_dpt_cd();
		}
		if ($purc_dpt_nm.equalsIgnoreCase(name)) {
			return purc_dpt_nm();
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			return purc_usr_cd();
		}
		if ($purc_usr_nm.equalsIgnoreCase(name)) {
			return purc_usr_nm();
		}
		if ($po_co_itm_cd.equalsIgnoreCase(name)) {
			return po_co_itm_cd();
		}
		if ($po_co_itm_sub1.equalsIgnoreCase(name)) {
			return po_co_itm_sub1();
		}
		if ($po_co_itm_sub2.equalsIgnoreCase(name)) {
			return po_co_itm_sub2();
		}
		if ($po_co_itm_sub3.equalsIgnoreCase(name)) {
			return po_co_itm_sub3();
		}
		if ($po_co_itm_nm.equalsIgnoreCase(name)) {
			return po_co_itm_nm();
		}
		if ($po_co_iv_itm_nm.equalsIgnoreCase(name)) {
			return po_co_iv_itm_nm();
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			return dest_cd1();
		}
		if ($dest_nm1.equalsIgnoreCase(name)) {
			return dest_nm1();
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			return dest_cd2();
		}
		if ($dest_nm2.equalsIgnoreCase(name)) {
			return dest_nm2();
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			return dest_cd3();
		}
		if ($dest_nm3.equalsIgnoreCase(name)) {
			return dest_nm3();
		}
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			return purc_id_typ();
		}
		if ($slo_typ.equalsIgnoreCase(name)) {
			return slo_typ();
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			return sls_dpt_cd();
		}
		if ($sls_dpt_nm.equalsIgnoreCase(name)) {
			return sls_dpt_nm();
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			return sls_usr_cd();
		}
		if ($sls_usr_nm.equalsIgnoreCase(name)) {
			return sls_usr_nm();
		}
		if ($in_to_id_typ.equalsIgnoreCase(name)) {
			return in_to_id_typ();
		}
		if ($in_to_id_cd.equalsIgnoreCase(name)) {
			return in_to_id_cd();
		}
		if ($in_to_nm.equalsIgnoreCase(name)) {
			return in_to_nm();
		}
		if ($in_to_zip_cd.equalsIgnoreCase(name)) {
			return in_to_zip_cd();
		}
		if ($in_to_addr1.equalsIgnoreCase(name)) {
			return in_to_addr1();
		}
		if ($in_to_addr2.equalsIgnoreCase(name)) {
			return in_to_addr2();
		}
		if ($in_to_addr3.equalsIgnoreCase(name)) {
			return in_to_addr3();
		}
		if ($in_to_addr4.equalsIgnoreCase(name)) {
			return in_to_addr4();
		}
		if ($in_to_cntct_dpt.equalsIgnoreCase(name)) {
			return in_to_cntct_dpt();
		}
		if ($in_to_cntct_psn.equalsIgnoreCase(name)) {
			return in_to_cntct_psn();
		}
		if ($in_to_tel.equalsIgnoreCase(name)) {
			return in_to_tel();
		}
		if ($in_to_fax.equalsIgnoreCase(name)) {
			return in_to_fax();
		}
		if ($in_to_cntry_cd.equalsIgnoreCase(name)) {
			return in_to_cntry_cd();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($drct_dlv_bp_cd.equalsIgnoreCase(name)) {
			return drct_dlv_bp_cd();
		}
		if ($drct_dlv_bp_nm.equalsIgnoreCase(name)) {
			return drct_dlv_bp_nm();
		}
		if ($drct_dlv_cntry_cd.equalsIgnoreCase(name)) {
			return drct_dlv_cntry_cd();
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			return tdlv_cd();
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			return tdlv_nm();
		}
		if ($tdlv_zip_cd.equalsIgnoreCase(name)) {
			return tdlv_zip_cd();
		}
		if ($tdlv_addr1.equalsIgnoreCase(name)) {
			return tdlv_addr1();
		}
		if ($tdlv_addr2.equalsIgnoreCase(name)) {
			return tdlv_addr2();
		}
		if ($tdlv_addr3.equalsIgnoreCase(name)) {
			return tdlv_addr3();
		}
		if ($tdlv_addr4.equalsIgnoreCase(name)) {
			return tdlv_addr4();
		}
		if ($tdlv_cntct_dpt.equalsIgnoreCase(name)) {
			return tdlv_cntct_dpt();
		}
		if ($tdlv_cntct_psn.equalsIgnoreCase(name)) {
			return tdlv_cntct_psn();
		}
		if ($tdlv_tel.equalsIgnoreCase(name)) {
			return tdlv_tel();
		}
		if ($tdlv_fax.equalsIgnoreCase(name)) {
			return tdlv_fax();
		}
		if ($tdlv_cntry_cd.equalsIgnoreCase(name)) {
			return tdlv_cntry_cd();
		}
		if ($dlv_slip_rmrks.equalsIgnoreCase(name)) {
			return dlv_slip_rmrks();
		}
		if ($dlv_slip_d_rmrks.equalsIgnoreCase(name)) {
			return dlv_slip_d_rmrks();
		}
		if ($dlv_day_week_typ.equalsIgnoreCase(name)) {
			return dlv_day_week_typ();
		}
		if ($pri_prnt_typ.equalsIgnoreCase(name)) {
			return pri_prnt_typ();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			return tterm_cd1();
		}
		if ($tterm_nm1.equalsIgnoreCase(name)) {
			return tterm_nm1();
		}
		if ($tterm_rmrks1.equalsIgnoreCase(name)) {
			return tterm_rmrks1();
		}
		if ($tterm_cd2.equalsIgnoreCase(name)) {
			return tterm_cd2();
		}
		if ($tterm_nm2.equalsIgnoreCase(name)) {
			return tterm_nm2();
		}
		if ($tterm_rmrks2.equalsIgnoreCase(name)) {
			return tterm_rmrks2();
		}
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			return tterm_cd3();
		}
		if ($tterm_nm3.equalsIgnoreCase(name)) {
			return tterm_nm3();
		}
		if ($tterm_rmrks3.equalsIgnoreCase(name)) {
			return tterm_rmrks3();
		}
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			return trnspt_cd();
		}
		if ($trnspt_nm.equalsIgnoreCase(name)) {
			return trnspt_nm();
		}
		if ($load_port_cd.equalsIgnoreCase(name)) {
			return load_port_cd();
		}
		if ($load_port_nm.equalsIgnoreCase(name)) {
			return load_port_nm();
		}
		if ($dschrg_port_cd.equalsIgnoreCase(name)) {
			return dschrg_port_cd();
		}
		if ($dschrg_port_nm.equalsIgnoreCase(name)) {
			return dschrg_port_nm();
		}
		if ($via_port_cd.equalsIgnoreCase(name)) {
			return via_port_cd();
		}
		if ($via_port_nm.equalsIgnoreCase(name)) {
			return via_port_nm();
		}
		if ($slo_co_itm_cd.equalsIgnoreCase(name)) {
			return slo_co_itm_cd();
		}
		if ($slo_co_itm_sub1.equalsIgnoreCase(name)) {
			return slo_co_itm_sub1();
		}
		if ($slo_co_itm_sub2.equalsIgnoreCase(name)) {
			return slo_co_itm_sub2();
		}
		if ($slo_co_itm_sub3.equalsIgnoreCase(name)) {
			return slo_co_itm_sub3();
		}
		if ($slo_co_itm_nm.equalsIgnoreCase(name)) {
			return slo_co_itm_nm();
		}
		if ($cntry_org_cd.equalsIgnoreCase(name)) {
			return cntry_org_cd();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($dscnt_rsn_cd.equalsIgnoreCase(name)) {
			return dscnt_rsn_cd();
		}
		if ($dscnt_rsn_nm.equalsIgnoreCase(name)) {
			return dscnt_rsn_nm();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			return tax_nm();
		}
		if ($tax_typ.equalsIgnoreCase(name)) {
			return tax_typ();
		}
		if ($ship_wh_cd.equalsIgnoreCase(name)) {
			return ship_wh_cd();
		}
		if ($ship_wh_nm.equalsIgnoreCase(name)) {
			return ship_wh_nm();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			return maker_nm();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
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
		if ($sub_char4.equalsIgnoreCase(name)) {
			return sub_char4();
		}
		if ($sub_char5.equalsIgnoreCase(name)) {
			return sub_char5();
		}
		if ($sub_char6.equalsIgnoreCase(name)) {
			return sub_char6();
		}
		if ($sub_char7.equalsIgnoreCase(name)) {
			return sub_char7();
		}
		if ($sub_char8.equalsIgnoreCase(name)) {
			return sub_char8();
		}
		if ($sub_char9.equalsIgnoreCase(name)) {
			return sub_char9();
		}
		if ($sub_char10.equalsIgnoreCase(name)) {
			return sub_char10();
		}
		if ($sub_char11.equalsIgnoreCase(name)) {
			return sub_char11();
		}
		if ($sub_char12.equalsIgnoreCase(name)) {
			return sub_char12();
		}
		if ($sub_char13.equalsIgnoreCase(name)) {
			return sub_char13();
		}
		if ($sub_char14.equalsIgnoreCase(name)) {
			return sub_char14();
		}
		if ($sub_char15.equalsIgnoreCase(name)) {
			return sub_char15();
		}
		if ($sub_char16.equalsIgnoreCase(name)) {
			return sub_char16();
		}
		if ($sub_char17.equalsIgnoreCase(name)) {
			return sub_char17();
		}
		if ($sub_char18.equalsIgnoreCase(name)) {
			return sub_char18();
		}
		if ($sub_char19.equalsIgnoreCase(name)) {
			return sub_char19();
		}
		if ($sub_char20.equalsIgnoreCase(name)) {
			return sub_char20();
		}
		if ($sub_char21.equalsIgnoreCase(name)) {
			return sub_char21();
		}
		if ($sub_char22.equalsIgnoreCase(name)) {
			return sub_char22();
		}
		if ($sub_char23.equalsIgnoreCase(name)) {
			return sub_char23();
		}
		if ($sub_char24.equalsIgnoreCase(name)) {
			return sub_char24();
		}
		if ($sub_char25.equalsIgnoreCase(name)) {
			return sub_char25();
		}
		if ($sub_char26.equalsIgnoreCase(name)) {
			return sub_char26();
		}
		if ($sub_char27.equalsIgnoreCase(name)) {
			return sub_char27();
		}
		if ($sub_char28.equalsIgnoreCase(name)) {
			return sub_char28();
		}
		if ($sub_char29.equalsIgnoreCase(name)) {
			return sub_char29();
		}
		if ($sub_char30.equalsIgnoreCase(name)) {
			return sub_char30();
		}
		if ($edi_sub_char1.equalsIgnoreCase(name)) {
			return edi_sub_char1();
		}
		if ($edi_sub_char2.equalsIgnoreCase(name)) {
			return edi_sub_char2();
		}
		if ($edi_sub_char3.equalsIgnoreCase(name)) {
			return edi_sub_char3();
		}
		if ($edi_sub_char4.equalsIgnoreCase(name)) {
			return edi_sub_char4();
		}
		if ($edi_sub_char5.equalsIgnoreCase(name)) {
			return edi_sub_char5();
		}
		if ($edi_sub_d_char1.equalsIgnoreCase(name)) {
			return edi_sub_d_char1();
		}
		if ($edi_sub_d_char2.equalsIgnoreCase(name)) {
			return edi_sub_d_char2();
		}
		if ($edi_sub_d_char3.equalsIgnoreCase(name)) {
			return edi_sub_d_char3();
		}
		if ($edi_sub_d_char4.equalsIgnoreCase(name)) {
			return edi_sub_d_char4();
		}
		if ($edi_sub_d_char5.equalsIgnoreCase(name)) {
			return edi_sub_d_char5();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($data_lno.equalsIgnoreCase(name)) {
			return data_lno();
		}
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
		}
		if ($po_rev.equalsIgnoreCase(name)) {
			return po_rev();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			return trd_cur_upri();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return trd_cur_dscnt_amt();
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			return set_itm_grp_no();
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			return sub_num1();
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			return sub_num2();
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			return sub_num3();
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			return sub_num4();
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			return sub_num5();
		}
		if ($edi_sub_num1.equalsIgnoreCase(name)) {
			return edi_sub_num1();
		}
		if ($edi_sub_d_num1.equalsIgnoreCase(name)) {
			return edi_sub_d_num1();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($data_make_dt.equalsIgnoreCase(name)) {
			return data_make_dt();
		}
		if ($po_dt.equalsIgnoreCase(name)) {
			return po_dt();
		}
		if ($upd_po_print_schd_dt.equalsIgnoreCase(name)) {
			return upd_po_print_schd_dt();
		}
		if ($dlv_rqst_dt.equalsIgnoreCase(name)) {
			return dlv_rqst_dt();
		}
		if ($dlv_rqst_hm.equalsIgnoreCase(name)) {
			return dlv_rqst_hm();
		}
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			return purc_schd_dt();
		}
		if ($sub_dt1.equalsIgnoreCase(name)) {
			return sub_dt1();
		}
		if ($sub_dt2.equalsIgnoreCase(name)) {
			return sub_dt2();
		}
		if ($sub_dt3.equalsIgnoreCase(name)) {
			return sub_dt3();
		}
		if ($sub_dt4.equalsIgnoreCase(name)) {
			return sub_dt4();
		}
		if ($sub_dt5.equalsIgnoreCase(name)) {
			return sub_dt5();
		}
		if ($edi_sub_dt1.equalsIgnoreCase(name)) {
			return edi_sub_dt1();
		}
		if ($edi_sub_d_dt1.equalsIgnoreCase(name)) {
			return edi_sub_d_dt1();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($po_co_sundry_itm_flg.equalsIgnoreCase(name)) {
			return po_co_sundry_itm_flg();
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			return outsrc_flg();
		}
		if ($drct_dlv_flg.equalsIgnoreCase(name)) {
			return drct_dlv_flg();
		}
		if ($sls_cststk_flg.equalsIgnoreCase(name)) {
			return sls_cststk_flg();
		}
		if ($in_to_sundry_flg.equalsIgnoreCase(name)) {
			return in_to_sundry_flg();
		}
		if ($tdlv_sundry_flg.equalsIgnoreCase(name)) {
			return tdlv_sundry_flg();
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
		}
		if ($tax_fix_flg.equalsIgnoreCase(name)) {
			return tax_fix_flg();
		}
		if ($ship_block_flg.equalsIgnoreCase(name)) {
			return ship_block_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($trd_typ_cd.equalsIgnoreCase(name)) {
			return trd_typ_cd();
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($po_crud_typ.equalsIgnoreCase(name)) {
			return po_crud_typ();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($po_co_cd.equalsIgnoreCase(name)) {
			return po_co_cd();
		}
		if ($po_co_nm.equalsIgnoreCase(name)) {
			return po_co_nm();
		}
		if ($po_co_cntry_cd.equalsIgnoreCase(name)) {
			return po_co_cntry_cd();
		}
		if ($slo_co_cd.equalsIgnoreCase(name)) {
			return slo_co_cd();
		}
		if ($slo_co_nm.equalsIgnoreCase(name)) {
			return slo_co_nm();
		}
		if ($slo_co_cntry_cd.equalsIgnoreCase(name)) {
			return slo_co_cntry_cd();
		}
		if ($crct_rsn_nm.equalsIgnoreCase(name)) {
			return crct_rsn_nm();
		}
		if ($crct_rsn_rmrks.equalsIgnoreCase(name)) {
			return crct_rsn_rmrks();
		}
		if ($po_print_txt.equalsIgnoreCase(name)) {
			return po_print_txt();
		}
		if ($po_print_rmrks.equalsIgnoreCase(name)) {
			return po_print_rmrks();
		}
		if ($po_print_d_rmrks.equalsIgnoreCase(name)) {
			return po_print_d_rmrks();
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			return purc_dpt_cd();
		}
		if ($purc_dpt_nm.equalsIgnoreCase(name)) {
			return purc_dpt_nm();
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			return purc_usr_cd();
		}
		if ($purc_usr_nm.equalsIgnoreCase(name)) {
			return purc_usr_nm();
		}
		if ($po_co_itm_cd.equalsIgnoreCase(name)) {
			return po_co_itm_cd();
		}
		if ($po_co_itm_sub1.equalsIgnoreCase(name)) {
			return po_co_itm_sub1();
		}
		if ($po_co_itm_sub2.equalsIgnoreCase(name)) {
			return po_co_itm_sub2();
		}
		if ($po_co_itm_sub3.equalsIgnoreCase(name)) {
			return po_co_itm_sub3();
		}
		if ($po_co_itm_nm.equalsIgnoreCase(name)) {
			return po_co_itm_nm();
		}
		if ($po_co_iv_itm_nm.equalsIgnoreCase(name)) {
			return po_co_iv_itm_nm();
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			return dest_cd1();
		}
		if ($dest_nm1.equalsIgnoreCase(name)) {
			return dest_nm1();
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			return dest_cd2();
		}
		if ($dest_nm2.equalsIgnoreCase(name)) {
			return dest_nm2();
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			return dest_cd3();
		}
		if ($dest_nm3.equalsIgnoreCase(name)) {
			return dest_nm3();
		}
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			return purc_id_typ();
		}
		if ($slo_typ.equalsIgnoreCase(name)) {
			return slo_typ();
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			return sls_dpt_cd();
		}
		if ($sls_dpt_nm.equalsIgnoreCase(name)) {
			return sls_dpt_nm();
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			return sls_usr_cd();
		}
		if ($sls_usr_nm.equalsIgnoreCase(name)) {
			return sls_usr_nm();
		}
		if ($in_to_id_typ.equalsIgnoreCase(name)) {
			return in_to_id_typ();
		}
		if ($in_to_id_cd.equalsIgnoreCase(name)) {
			return in_to_id_cd();
		}
		if ($in_to_nm.equalsIgnoreCase(name)) {
			return in_to_nm();
		}
		if ($in_to_zip_cd.equalsIgnoreCase(name)) {
			return in_to_zip_cd();
		}
		if ($in_to_addr1.equalsIgnoreCase(name)) {
			return in_to_addr1();
		}
		if ($in_to_addr2.equalsIgnoreCase(name)) {
			return in_to_addr2();
		}
		if ($in_to_addr3.equalsIgnoreCase(name)) {
			return in_to_addr3();
		}
		if ($in_to_addr4.equalsIgnoreCase(name)) {
			return in_to_addr4();
		}
		if ($in_to_cntct_dpt.equalsIgnoreCase(name)) {
			return in_to_cntct_dpt();
		}
		if ($in_to_cntct_psn.equalsIgnoreCase(name)) {
			return in_to_cntct_psn();
		}
		if ($in_to_tel.equalsIgnoreCase(name)) {
			return in_to_tel();
		}
		if ($in_to_fax.equalsIgnoreCase(name)) {
			return in_to_fax();
		}
		if ($in_to_cntry_cd.equalsIgnoreCase(name)) {
			return in_to_cntry_cd();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($drct_dlv_bp_cd.equalsIgnoreCase(name)) {
			return drct_dlv_bp_cd();
		}
		if ($drct_dlv_bp_nm.equalsIgnoreCase(name)) {
			return drct_dlv_bp_nm();
		}
		if ($drct_dlv_cntry_cd.equalsIgnoreCase(name)) {
			return drct_dlv_cntry_cd();
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			return tdlv_cd();
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			return tdlv_nm();
		}
		if ($tdlv_zip_cd.equalsIgnoreCase(name)) {
			return tdlv_zip_cd();
		}
		if ($tdlv_addr1.equalsIgnoreCase(name)) {
			return tdlv_addr1();
		}
		if ($tdlv_addr2.equalsIgnoreCase(name)) {
			return tdlv_addr2();
		}
		if ($tdlv_addr3.equalsIgnoreCase(name)) {
			return tdlv_addr3();
		}
		if ($tdlv_addr4.equalsIgnoreCase(name)) {
			return tdlv_addr4();
		}
		if ($tdlv_cntct_dpt.equalsIgnoreCase(name)) {
			return tdlv_cntct_dpt();
		}
		if ($tdlv_cntct_psn.equalsIgnoreCase(name)) {
			return tdlv_cntct_psn();
		}
		if ($tdlv_tel.equalsIgnoreCase(name)) {
			return tdlv_tel();
		}
		if ($tdlv_fax.equalsIgnoreCase(name)) {
			return tdlv_fax();
		}
		if ($tdlv_cntry_cd.equalsIgnoreCase(name)) {
			return tdlv_cntry_cd();
		}
		if ($dlv_slip_rmrks.equalsIgnoreCase(name)) {
			return dlv_slip_rmrks();
		}
		if ($dlv_slip_d_rmrks.equalsIgnoreCase(name)) {
			return dlv_slip_d_rmrks();
		}
		if ($dlv_day_week_typ.equalsIgnoreCase(name)) {
			return dlv_day_week_typ();
		}
		if ($pri_prnt_typ.equalsIgnoreCase(name)) {
			return pri_prnt_typ();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			return tterm_cd1();
		}
		if ($tterm_nm1.equalsIgnoreCase(name)) {
			return tterm_nm1();
		}
		if ($tterm_rmrks1.equalsIgnoreCase(name)) {
			return tterm_rmrks1();
		}
		if ($tterm_cd2.equalsIgnoreCase(name)) {
			return tterm_cd2();
		}
		if ($tterm_nm2.equalsIgnoreCase(name)) {
			return tterm_nm2();
		}
		if ($tterm_rmrks2.equalsIgnoreCase(name)) {
			return tterm_rmrks2();
		}
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			return tterm_cd3();
		}
		if ($tterm_nm3.equalsIgnoreCase(name)) {
			return tterm_nm3();
		}
		if ($tterm_rmrks3.equalsIgnoreCase(name)) {
			return tterm_rmrks3();
		}
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			return trnspt_cd();
		}
		if ($trnspt_nm.equalsIgnoreCase(name)) {
			return trnspt_nm();
		}
		if ($load_port_cd.equalsIgnoreCase(name)) {
			return load_port_cd();
		}
		if ($load_port_nm.equalsIgnoreCase(name)) {
			return load_port_nm();
		}
		if ($dschrg_port_cd.equalsIgnoreCase(name)) {
			return dschrg_port_cd();
		}
		if ($dschrg_port_nm.equalsIgnoreCase(name)) {
			return dschrg_port_nm();
		}
		if ($via_port_cd.equalsIgnoreCase(name)) {
			return via_port_cd();
		}
		if ($via_port_nm.equalsIgnoreCase(name)) {
			return via_port_nm();
		}
		if ($slo_co_itm_cd.equalsIgnoreCase(name)) {
			return slo_co_itm_cd();
		}
		if ($slo_co_itm_sub1.equalsIgnoreCase(name)) {
			return slo_co_itm_sub1();
		}
		if ($slo_co_itm_sub2.equalsIgnoreCase(name)) {
			return slo_co_itm_sub2();
		}
		if ($slo_co_itm_sub3.equalsIgnoreCase(name)) {
			return slo_co_itm_sub3();
		}
		if ($slo_co_itm_nm.equalsIgnoreCase(name)) {
			return slo_co_itm_nm();
		}
		if ($cntry_org_cd.equalsIgnoreCase(name)) {
			return cntry_org_cd();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($dscnt_rsn_cd.equalsIgnoreCase(name)) {
			return dscnt_rsn_cd();
		}
		if ($dscnt_rsn_nm.equalsIgnoreCase(name)) {
			return dscnt_rsn_nm();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			return tax_nm();
		}
		if ($tax_typ.equalsIgnoreCase(name)) {
			return tax_typ();
		}
		if ($ship_wh_cd.equalsIgnoreCase(name)) {
			return ship_wh_cd();
		}
		if ($ship_wh_nm.equalsIgnoreCase(name)) {
			return ship_wh_nm();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			return maker_nm();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
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
		if ($sub_char4.equalsIgnoreCase(name)) {
			return sub_char4();
		}
		if ($sub_char5.equalsIgnoreCase(name)) {
			return sub_char5();
		}
		if ($sub_char6.equalsIgnoreCase(name)) {
			return sub_char6();
		}
		if ($sub_char7.equalsIgnoreCase(name)) {
			return sub_char7();
		}
		if ($sub_char8.equalsIgnoreCase(name)) {
			return sub_char8();
		}
		if ($sub_char9.equalsIgnoreCase(name)) {
			return sub_char9();
		}
		if ($sub_char10.equalsIgnoreCase(name)) {
			return sub_char10();
		}
		if ($sub_char11.equalsIgnoreCase(name)) {
			return sub_char11();
		}
		if ($sub_char12.equalsIgnoreCase(name)) {
			return sub_char12();
		}
		if ($sub_char13.equalsIgnoreCase(name)) {
			return sub_char13();
		}
		if ($sub_char14.equalsIgnoreCase(name)) {
			return sub_char14();
		}
		if ($sub_char15.equalsIgnoreCase(name)) {
			return sub_char15();
		}
		if ($sub_char16.equalsIgnoreCase(name)) {
			return sub_char16();
		}
		if ($sub_char17.equalsIgnoreCase(name)) {
			return sub_char17();
		}
		if ($sub_char18.equalsIgnoreCase(name)) {
			return sub_char18();
		}
		if ($sub_char19.equalsIgnoreCase(name)) {
			return sub_char19();
		}
		if ($sub_char20.equalsIgnoreCase(name)) {
			return sub_char20();
		}
		if ($sub_char21.equalsIgnoreCase(name)) {
			return sub_char21();
		}
		if ($sub_char22.equalsIgnoreCase(name)) {
			return sub_char22();
		}
		if ($sub_char23.equalsIgnoreCase(name)) {
			return sub_char23();
		}
		if ($sub_char24.equalsIgnoreCase(name)) {
			return sub_char24();
		}
		if ($sub_char25.equalsIgnoreCase(name)) {
			return sub_char25();
		}
		if ($sub_char26.equalsIgnoreCase(name)) {
			return sub_char26();
		}
		if ($sub_char27.equalsIgnoreCase(name)) {
			return sub_char27();
		}
		if ($sub_char28.equalsIgnoreCase(name)) {
			return sub_char28();
		}
		if ($sub_char29.equalsIgnoreCase(name)) {
			return sub_char29();
		}
		if ($sub_char30.equalsIgnoreCase(name)) {
			return sub_char30();
		}
		if ($edi_sub_char1.equalsIgnoreCase(name)) {
			return edi_sub_char1();
		}
		if ($edi_sub_char2.equalsIgnoreCase(name)) {
			return edi_sub_char2();
		}
		if ($edi_sub_char3.equalsIgnoreCase(name)) {
			return edi_sub_char3();
		}
		if ($edi_sub_char4.equalsIgnoreCase(name)) {
			return edi_sub_char4();
		}
		if ($edi_sub_char5.equalsIgnoreCase(name)) {
			return edi_sub_char5();
		}
		if ($edi_sub_d_char1.equalsIgnoreCase(name)) {
			return edi_sub_d_char1();
		}
		if ($edi_sub_d_char2.equalsIgnoreCase(name)) {
			return edi_sub_d_char2();
		}
		if ($edi_sub_d_char3.equalsIgnoreCase(name)) {
			return edi_sub_d_char3();
		}
		if ($edi_sub_d_char4.equalsIgnoreCase(name)) {
			return edi_sub_d_char4();
		}
		if ($edi_sub_d_char5.equalsIgnoreCase(name)) {
			return edi_sub_d_char5();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($data_lno.equalsIgnoreCase(name)) {
			return data_lno();
		}
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
		}
		if ($po_rev.equalsIgnoreCase(name)) {
			return po_rev();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			return trd_cur_upri();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return trd_cur_dscnt_amt();
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			return set_itm_grp_no();
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			return sub_num1();
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			return sub_num2();
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			return sub_num3();
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			return sub_num4();
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			return sub_num5();
		}
		if ($edi_sub_num1.equalsIgnoreCase(name)) {
			return edi_sub_num1();
		}
		if ($edi_sub_d_num1.equalsIgnoreCase(name)) {
			return edi_sub_d_num1();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($data_make_dt.equalsIgnoreCase(name)) {
			return data_make_dt();
		}
		if ($po_dt.equalsIgnoreCase(name)) {
			return po_dt();
		}
		if ($upd_po_print_schd_dt.equalsIgnoreCase(name)) {
			return upd_po_print_schd_dt();
		}
		if ($dlv_rqst_dt.equalsIgnoreCase(name)) {
			return dlv_rqst_dt();
		}
		if ($dlv_rqst_hm.equalsIgnoreCase(name)) {
			return dlv_rqst_hm();
		}
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			return purc_schd_dt();
		}
		if ($sub_dt1.equalsIgnoreCase(name)) {
			return sub_dt1();
		}
		if ($sub_dt2.equalsIgnoreCase(name)) {
			return sub_dt2();
		}
		if ($sub_dt3.equalsIgnoreCase(name)) {
			return sub_dt3();
		}
		if ($sub_dt4.equalsIgnoreCase(name)) {
			return sub_dt4();
		}
		if ($sub_dt5.equalsIgnoreCase(name)) {
			return sub_dt5();
		}
		if ($edi_sub_dt1.equalsIgnoreCase(name)) {
			return edi_sub_dt1();
		}
		if ($edi_sub_d_dt1.equalsIgnoreCase(name)) {
			return edi_sub_d_dt1();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($po_co_sundry_itm_flg.equalsIgnoreCase(name)) {
			return po_co_sundry_itm_flg();
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			return outsrc_flg();
		}
		if ($drct_dlv_flg.equalsIgnoreCase(name)) {
			return drct_dlv_flg();
		}
		if ($sls_cststk_flg.equalsIgnoreCase(name)) {
			return sls_cststk_flg();
		}
		if ($in_to_sundry_flg.equalsIgnoreCase(name)) {
			return in_to_sundry_flg();
		}
		if ($tdlv_sundry_flg.equalsIgnoreCase(name)) {
			return tdlv_sundry_flg();
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
		}
		if ($tax_fix_flg.equalsIgnoreCase(name)) {
			return tax_fix_flg();
		}
		if ($ship_block_flg.equalsIgnoreCase(name)) {
			return ship_block_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($trd_typ_cd.equalsIgnoreCase(name)) {
			trd_typ_cd(value);
			return;
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($po_crud_typ.equalsIgnoreCase(name)) {
			po_crud_typ(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
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
		if ($po_co_cntry_cd.equalsIgnoreCase(name)) {
			po_co_cntry_cd(value);
			return;
		}
		if ($slo_co_cd.equalsIgnoreCase(name)) {
			slo_co_cd(value);
			return;
		}
		if ($slo_co_nm.equalsIgnoreCase(name)) {
			slo_co_nm(value);
			return;
		}
		if ($slo_co_cntry_cd.equalsIgnoreCase(name)) {
			slo_co_cntry_cd(value);
			return;
		}
		if ($crct_rsn_nm.equalsIgnoreCase(name)) {
			crct_rsn_nm(value);
			return;
		}
		if ($crct_rsn_rmrks.equalsIgnoreCase(name)) {
			crct_rsn_rmrks(value);
			return;
		}
		if ($po_print_txt.equalsIgnoreCase(name)) {
			po_print_txt(value);
			return;
		}
		if ($po_print_rmrks.equalsIgnoreCase(name)) {
			po_print_rmrks(value);
			return;
		}
		if ($po_print_d_rmrks.equalsIgnoreCase(name)) {
			po_print_d_rmrks(value);
			return;
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			purc_dpt_cd(value);
			return;
		}
		if ($purc_dpt_nm.equalsIgnoreCase(name)) {
			purc_dpt_nm(value);
			return;
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			purc_usr_cd(value);
			return;
		}
		if ($purc_usr_nm.equalsIgnoreCase(name)) {
			purc_usr_nm(value);
			return;
		}
		if ($po_co_itm_cd.equalsIgnoreCase(name)) {
			po_co_itm_cd(value);
			return;
		}
		if ($po_co_itm_sub1.equalsIgnoreCase(name)) {
			po_co_itm_sub1(value);
			return;
		}
		if ($po_co_itm_sub2.equalsIgnoreCase(name)) {
			po_co_itm_sub2(value);
			return;
		}
		if ($po_co_itm_sub3.equalsIgnoreCase(name)) {
			po_co_itm_sub3(value);
			return;
		}
		if ($po_co_itm_nm.equalsIgnoreCase(name)) {
			po_co_itm_nm(value);
			return;
		}
		if ($po_co_iv_itm_nm.equalsIgnoreCase(name)) {
			po_co_iv_itm_nm(value);
			return;
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			dest_cd1(value);
			return;
		}
		if ($dest_nm1.equalsIgnoreCase(name)) {
			dest_nm1(value);
			return;
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			dest_cd2(value);
			return;
		}
		if ($dest_nm2.equalsIgnoreCase(name)) {
			dest_nm2(value);
			return;
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			dest_cd3(value);
			return;
		}
		if ($dest_nm3.equalsIgnoreCase(name)) {
			dest_nm3(value);
			return;
		}
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			purc_id_typ(value);
			return;
		}
		if ($slo_typ.equalsIgnoreCase(name)) {
			slo_typ(value);
			return;
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			sls_dpt_cd(value);
			return;
		}
		if ($sls_dpt_nm.equalsIgnoreCase(name)) {
			sls_dpt_nm(value);
			return;
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			sls_usr_cd(value);
			return;
		}
		if ($sls_usr_nm.equalsIgnoreCase(name)) {
			sls_usr_nm(value);
			return;
		}
		if ($in_to_id_typ.equalsIgnoreCase(name)) {
			in_to_id_typ(value);
			return;
		}
		if ($in_to_id_cd.equalsIgnoreCase(name)) {
			in_to_id_cd(value);
			return;
		}
		if ($in_to_nm.equalsIgnoreCase(name)) {
			in_to_nm(value);
			return;
		}
		if ($in_to_zip_cd.equalsIgnoreCase(name)) {
			in_to_zip_cd(value);
			return;
		}
		if ($in_to_addr1.equalsIgnoreCase(name)) {
			in_to_addr1(value);
			return;
		}
		if ($in_to_addr2.equalsIgnoreCase(name)) {
			in_to_addr2(value);
			return;
		}
		if ($in_to_addr3.equalsIgnoreCase(name)) {
			in_to_addr3(value);
			return;
		}
		if ($in_to_addr4.equalsIgnoreCase(name)) {
			in_to_addr4(value);
			return;
		}
		if ($in_to_cntct_dpt.equalsIgnoreCase(name)) {
			in_to_cntct_dpt(value);
			return;
		}
		if ($in_to_cntct_psn.equalsIgnoreCase(name)) {
			in_to_cntct_psn(value);
			return;
		}
		if ($in_to_tel.equalsIgnoreCase(name)) {
			in_to_tel(value);
			return;
		}
		if ($in_to_fax.equalsIgnoreCase(name)) {
			in_to_fax(value);
			return;
		}
		if ($in_to_cntry_cd.equalsIgnoreCase(name)) {
			in_to_cntry_cd(value);
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
		if ($drct_dlv_bp_cd.equalsIgnoreCase(name)) {
			drct_dlv_bp_cd(value);
			return;
		}
		if ($drct_dlv_bp_nm.equalsIgnoreCase(name)) {
			drct_dlv_bp_nm(value);
			return;
		}
		if ($drct_dlv_cntry_cd.equalsIgnoreCase(name)) {
			drct_dlv_cntry_cd(value);
			return;
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			tdlv_cd(value);
			return;
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			tdlv_nm(value);
			return;
		}
		if ($tdlv_zip_cd.equalsIgnoreCase(name)) {
			tdlv_zip_cd(value);
			return;
		}
		if ($tdlv_addr1.equalsIgnoreCase(name)) {
			tdlv_addr1(value);
			return;
		}
		if ($tdlv_addr2.equalsIgnoreCase(name)) {
			tdlv_addr2(value);
			return;
		}
		if ($tdlv_addr3.equalsIgnoreCase(name)) {
			tdlv_addr3(value);
			return;
		}
		if ($tdlv_addr4.equalsIgnoreCase(name)) {
			tdlv_addr4(value);
			return;
		}
		if ($tdlv_cntct_dpt.equalsIgnoreCase(name)) {
			tdlv_cntct_dpt(value);
			return;
		}
		if ($tdlv_cntct_psn.equalsIgnoreCase(name)) {
			tdlv_cntct_psn(value);
			return;
		}
		if ($tdlv_tel.equalsIgnoreCase(name)) {
			tdlv_tel(value);
			return;
		}
		if ($tdlv_fax.equalsIgnoreCase(name)) {
			tdlv_fax(value);
			return;
		}
		if ($tdlv_cntry_cd.equalsIgnoreCase(name)) {
			tdlv_cntry_cd(value);
			return;
		}
		if ($dlv_slip_rmrks.equalsIgnoreCase(name)) {
			dlv_slip_rmrks(value);
			return;
		}
		if ($dlv_slip_d_rmrks.equalsIgnoreCase(name)) {
			dlv_slip_d_rmrks(value);
			return;
		}
		if ($dlv_day_week_typ.equalsIgnoreCase(name)) {
			dlv_day_week_typ(value);
			return;
		}
		if ($pri_prnt_typ.equalsIgnoreCase(name)) {
			pri_prnt_typ(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
			return;
		}
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			tterm_cd1(value);
			return;
		}
		if ($tterm_nm1.equalsIgnoreCase(name)) {
			tterm_nm1(value);
			return;
		}
		if ($tterm_rmrks1.equalsIgnoreCase(name)) {
			tterm_rmrks1(value);
			return;
		}
		if ($tterm_cd2.equalsIgnoreCase(name)) {
			tterm_cd2(value);
			return;
		}
		if ($tterm_nm2.equalsIgnoreCase(name)) {
			tterm_nm2(value);
			return;
		}
		if ($tterm_rmrks2.equalsIgnoreCase(name)) {
			tterm_rmrks2(value);
			return;
		}
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			tterm_cd3(value);
			return;
		}
		if ($tterm_nm3.equalsIgnoreCase(name)) {
			tterm_nm3(value);
			return;
		}
		if ($tterm_rmrks3.equalsIgnoreCase(name)) {
			tterm_rmrks3(value);
			return;
		}
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			trnspt_cd(value);
			return;
		}
		if ($trnspt_nm.equalsIgnoreCase(name)) {
			trnspt_nm(value);
			return;
		}
		if ($load_port_cd.equalsIgnoreCase(name)) {
			load_port_cd(value);
			return;
		}
		if ($load_port_nm.equalsIgnoreCase(name)) {
			load_port_nm(value);
			return;
		}
		if ($dschrg_port_cd.equalsIgnoreCase(name)) {
			dschrg_port_cd(value);
			return;
		}
		if ($dschrg_port_nm.equalsIgnoreCase(name)) {
			dschrg_port_nm(value);
			return;
		}
		if ($via_port_cd.equalsIgnoreCase(name)) {
			via_port_cd(value);
			return;
		}
		if ($via_port_nm.equalsIgnoreCase(name)) {
			via_port_nm(value);
			return;
		}
		if ($slo_co_itm_cd.equalsIgnoreCase(name)) {
			slo_co_itm_cd(value);
			return;
		}
		if ($slo_co_itm_sub1.equalsIgnoreCase(name)) {
			slo_co_itm_sub1(value);
			return;
		}
		if ($slo_co_itm_sub2.equalsIgnoreCase(name)) {
			slo_co_itm_sub2(value);
			return;
		}
		if ($slo_co_itm_sub3.equalsIgnoreCase(name)) {
			slo_co_itm_sub3(value);
			return;
		}
		if ($slo_co_itm_nm.equalsIgnoreCase(name)) {
			slo_co_itm_nm(value);
			return;
		}
		if ($cntry_org_cd.equalsIgnoreCase(name)) {
			cntry_org_cd(value);
			return;
		}
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
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
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($dscnt_rsn_cd.equalsIgnoreCase(name)) {
			dscnt_rsn_cd(value);
			return;
		}
		if ($dscnt_rsn_nm.equalsIgnoreCase(name)) {
			dscnt_rsn_nm(value);
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
		if ($tax_typ.equalsIgnoreCase(name)) {
			tax_typ(value);
			return;
		}
		if ($ship_wh_cd.equalsIgnoreCase(name)) {
			ship_wh_cd(value);
			return;
		}
		if ($ship_wh_nm.equalsIgnoreCase(name)) {
			ship_wh_nm(value);
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
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
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
		if ($sub_char4.equalsIgnoreCase(name)) {
			sub_char4(value);
			return;
		}
		if ($sub_char5.equalsIgnoreCase(name)) {
			sub_char5(value);
			return;
		}
		if ($sub_char6.equalsIgnoreCase(name)) {
			sub_char6(value);
			return;
		}
		if ($sub_char7.equalsIgnoreCase(name)) {
			sub_char7(value);
			return;
		}
		if ($sub_char8.equalsIgnoreCase(name)) {
			sub_char8(value);
			return;
		}
		if ($sub_char9.equalsIgnoreCase(name)) {
			sub_char9(value);
			return;
		}
		if ($sub_char10.equalsIgnoreCase(name)) {
			sub_char10(value);
			return;
		}
		if ($sub_char11.equalsIgnoreCase(name)) {
			sub_char11(value);
			return;
		}
		if ($sub_char12.equalsIgnoreCase(name)) {
			sub_char12(value);
			return;
		}
		if ($sub_char13.equalsIgnoreCase(name)) {
			sub_char13(value);
			return;
		}
		if ($sub_char14.equalsIgnoreCase(name)) {
			sub_char14(value);
			return;
		}
		if ($sub_char15.equalsIgnoreCase(name)) {
			sub_char15(value);
			return;
		}
		if ($sub_char16.equalsIgnoreCase(name)) {
			sub_char16(value);
			return;
		}
		if ($sub_char17.equalsIgnoreCase(name)) {
			sub_char17(value);
			return;
		}
		if ($sub_char18.equalsIgnoreCase(name)) {
			sub_char18(value);
			return;
		}
		if ($sub_char19.equalsIgnoreCase(name)) {
			sub_char19(value);
			return;
		}
		if ($sub_char20.equalsIgnoreCase(name)) {
			sub_char20(value);
			return;
		}
		if ($sub_char21.equalsIgnoreCase(name)) {
			sub_char21(value);
			return;
		}
		if ($sub_char22.equalsIgnoreCase(name)) {
			sub_char22(value);
			return;
		}
		if ($sub_char23.equalsIgnoreCase(name)) {
			sub_char23(value);
			return;
		}
		if ($sub_char24.equalsIgnoreCase(name)) {
			sub_char24(value);
			return;
		}
		if ($sub_char25.equalsIgnoreCase(name)) {
			sub_char25(value);
			return;
		}
		if ($sub_char26.equalsIgnoreCase(name)) {
			sub_char26(value);
			return;
		}
		if ($sub_char27.equalsIgnoreCase(name)) {
			sub_char27(value);
			return;
		}
		if ($sub_char28.equalsIgnoreCase(name)) {
			sub_char28(value);
			return;
		}
		if ($sub_char29.equalsIgnoreCase(name)) {
			sub_char29(value);
			return;
		}
		if ($sub_char30.equalsIgnoreCase(name)) {
			sub_char30(value);
			return;
		}
		if ($edi_sub_char1.equalsIgnoreCase(name)) {
			edi_sub_char1(value);
			return;
		}
		if ($edi_sub_char2.equalsIgnoreCase(name)) {
			edi_sub_char2(value);
			return;
		}
		if ($edi_sub_char3.equalsIgnoreCase(name)) {
			edi_sub_char3(value);
			return;
		}
		if ($edi_sub_char4.equalsIgnoreCase(name)) {
			edi_sub_char4(value);
			return;
		}
		if ($edi_sub_char5.equalsIgnoreCase(name)) {
			edi_sub_char5(value);
			return;
		}
		if ($edi_sub_d_char1.equalsIgnoreCase(name)) {
			edi_sub_d_char1(value);
			return;
		}
		if ($edi_sub_d_char2.equalsIgnoreCase(name)) {
			edi_sub_d_char2(value);
			return;
		}
		if ($edi_sub_d_char3.equalsIgnoreCase(name)) {
			edi_sub_d_char3(value);
			return;
		}
		if ($edi_sub_d_char4.equalsIgnoreCase(name)) {
			edi_sub_d_char4(value);
			return;
		}
		if ($edi_sub_d_char5.equalsIgnoreCase(name)) {
			edi_sub_d_char5(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		if ($edi_sub_num1.equalsIgnoreCase(name)) {
			edi_sub_num1(value);
			return;
		}
		if ($edi_sub_d_num1.equalsIgnoreCase(name)) {
			edi_sub_d_num1(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		if ($edi_sub_num1.equalsIgnoreCase(name)) {
			edi_sub_num1(value);
			return;
		}
		if ($edi_sub_d_num1.equalsIgnoreCase(name)) {
			edi_sub_d_num1(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		if ($edi_sub_num1.equalsIgnoreCase(name)) {
			edi_sub_num1(value);
			return;
		}
		if ($edi_sub_d_num1.equalsIgnoreCase(name)) {
			edi_sub_d_num1(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		if ($edi_sub_num1.equalsIgnoreCase(name)) {
			edi_sub_num1(value);
			return;
		}
		if ($edi_sub_d_num1.equalsIgnoreCase(name)) {
			edi_sub_d_num1(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		if ($edi_sub_num1.equalsIgnoreCase(name)) {
			edi_sub_num1(value);
			return;
		}
		if ($edi_sub_d_num1.equalsIgnoreCase(name)) {
			edi_sub_d_num1(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($data_make_dt.equalsIgnoreCase(name)) {
			data_make_dt(value);
			return;
		}
		if ($po_dt.equalsIgnoreCase(name)) {
			po_dt(value);
			return;
		}
		if ($upd_po_print_schd_dt.equalsIgnoreCase(name)) {
			upd_po_print_schd_dt(value);
			return;
		}
		if ($dlv_rqst_dt.equalsIgnoreCase(name)) {
			dlv_rqst_dt(value);
			return;
		}
		if ($dlv_rqst_hm.equalsIgnoreCase(name)) {
			dlv_rqst_hm(value);
			return;
		}
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			purc_schd_dt(value);
			return;
		}
		if ($sub_dt1.equalsIgnoreCase(name)) {
			sub_dt1(value);
			return;
		}
		if ($sub_dt2.equalsIgnoreCase(name)) {
			sub_dt2(value);
			return;
		}
		if ($sub_dt3.equalsIgnoreCase(name)) {
			sub_dt3(value);
			return;
		}
		if ($sub_dt4.equalsIgnoreCase(name)) {
			sub_dt4(value);
			return;
		}
		if ($sub_dt5.equalsIgnoreCase(name)) {
			sub_dt5(value);
			return;
		}
		if ($edi_sub_dt1.equalsIgnoreCase(name)) {
			edi_sub_dt1(value);
			return;
		}
		if ($edi_sub_d_dt1.equalsIgnoreCase(name)) {
			edi_sub_d_dt1(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($po_co_sundry_itm_flg.equalsIgnoreCase(name)) {
			po_co_sundry_itm_flg(value);
			return;
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			outsrc_flg(value);
			return;
		}
		if ($drct_dlv_flg.equalsIgnoreCase(name)) {
			drct_dlv_flg(value);
			return;
		}
		if ($sls_cststk_flg.equalsIgnoreCase(name)) {
			sls_cststk_flg(value);
			return;
		}
		if ($in_to_sundry_flg.equalsIgnoreCase(name)) {
			in_to_sundry_flg(value);
			return;
		}
		if ($tdlv_sundry_flg.equalsIgnoreCase(name)) {
			tdlv_sundry_flg(value);
			return;
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			inc_tax_flg(value);
			return;
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			interim_flg(value);
			return;
		}
		if ($tax_fix_flg.equalsIgnoreCase(name)) {
			tax_fix_flg(value);
			return;
		}
		if ($ship_block_flg.equalsIgnoreCase(name)) {
			ship_block_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($trd_typ_cd.equalsIgnoreCase(name)) {
			trd_typ_cd(value);
			return;
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($po_crud_typ.equalsIgnoreCase(name)) {
			po_crud_typ(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
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
		if ($po_co_cntry_cd.equalsIgnoreCase(name)) {
			po_co_cntry_cd(value);
			return;
		}
		if ($slo_co_cd.equalsIgnoreCase(name)) {
			slo_co_cd(value);
			return;
		}
		if ($slo_co_nm.equalsIgnoreCase(name)) {
			slo_co_nm(value);
			return;
		}
		if ($slo_co_cntry_cd.equalsIgnoreCase(name)) {
			slo_co_cntry_cd(value);
			return;
		}
		if ($crct_rsn_nm.equalsIgnoreCase(name)) {
			crct_rsn_nm(value);
			return;
		}
		if ($crct_rsn_rmrks.equalsIgnoreCase(name)) {
			crct_rsn_rmrks(value);
			return;
		}
		if ($po_print_txt.equalsIgnoreCase(name)) {
			po_print_txt(value);
			return;
		}
		if ($po_print_rmrks.equalsIgnoreCase(name)) {
			po_print_rmrks(value);
			return;
		}
		if ($po_print_d_rmrks.equalsIgnoreCase(name)) {
			po_print_d_rmrks(value);
			return;
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			purc_dpt_cd(value);
			return;
		}
		if ($purc_dpt_nm.equalsIgnoreCase(name)) {
			purc_dpt_nm(value);
			return;
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			purc_usr_cd(value);
			return;
		}
		if ($purc_usr_nm.equalsIgnoreCase(name)) {
			purc_usr_nm(value);
			return;
		}
		if ($po_co_itm_cd.equalsIgnoreCase(name)) {
			po_co_itm_cd(value);
			return;
		}
		if ($po_co_itm_sub1.equalsIgnoreCase(name)) {
			po_co_itm_sub1(value);
			return;
		}
		if ($po_co_itm_sub2.equalsIgnoreCase(name)) {
			po_co_itm_sub2(value);
			return;
		}
		if ($po_co_itm_sub3.equalsIgnoreCase(name)) {
			po_co_itm_sub3(value);
			return;
		}
		if ($po_co_itm_nm.equalsIgnoreCase(name)) {
			po_co_itm_nm(value);
			return;
		}
		if ($po_co_iv_itm_nm.equalsIgnoreCase(name)) {
			po_co_iv_itm_nm(value);
			return;
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			dest_cd1(value);
			return;
		}
		if ($dest_nm1.equalsIgnoreCase(name)) {
			dest_nm1(value);
			return;
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			dest_cd2(value);
			return;
		}
		if ($dest_nm2.equalsIgnoreCase(name)) {
			dest_nm2(value);
			return;
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			dest_cd3(value);
			return;
		}
		if ($dest_nm3.equalsIgnoreCase(name)) {
			dest_nm3(value);
			return;
		}
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			purc_id_typ(value);
			return;
		}
		if ($slo_typ.equalsIgnoreCase(name)) {
			slo_typ(value);
			return;
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			sls_dpt_cd(value);
			return;
		}
		if ($sls_dpt_nm.equalsIgnoreCase(name)) {
			sls_dpt_nm(value);
			return;
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			sls_usr_cd(value);
			return;
		}
		if ($sls_usr_nm.equalsIgnoreCase(name)) {
			sls_usr_nm(value);
			return;
		}
		if ($in_to_id_typ.equalsIgnoreCase(name)) {
			in_to_id_typ(value);
			return;
		}
		if ($in_to_id_cd.equalsIgnoreCase(name)) {
			in_to_id_cd(value);
			return;
		}
		if ($in_to_nm.equalsIgnoreCase(name)) {
			in_to_nm(value);
			return;
		}
		if ($in_to_zip_cd.equalsIgnoreCase(name)) {
			in_to_zip_cd(value);
			return;
		}
		if ($in_to_addr1.equalsIgnoreCase(name)) {
			in_to_addr1(value);
			return;
		}
		if ($in_to_addr2.equalsIgnoreCase(name)) {
			in_to_addr2(value);
			return;
		}
		if ($in_to_addr3.equalsIgnoreCase(name)) {
			in_to_addr3(value);
			return;
		}
		if ($in_to_addr4.equalsIgnoreCase(name)) {
			in_to_addr4(value);
			return;
		}
		if ($in_to_cntct_dpt.equalsIgnoreCase(name)) {
			in_to_cntct_dpt(value);
			return;
		}
		if ($in_to_cntct_psn.equalsIgnoreCase(name)) {
			in_to_cntct_psn(value);
			return;
		}
		if ($in_to_tel.equalsIgnoreCase(name)) {
			in_to_tel(value);
			return;
		}
		if ($in_to_fax.equalsIgnoreCase(name)) {
			in_to_fax(value);
			return;
		}
		if ($in_to_cntry_cd.equalsIgnoreCase(name)) {
			in_to_cntry_cd(value);
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
		if ($drct_dlv_bp_cd.equalsIgnoreCase(name)) {
			drct_dlv_bp_cd(value);
			return;
		}
		if ($drct_dlv_bp_nm.equalsIgnoreCase(name)) {
			drct_dlv_bp_nm(value);
			return;
		}
		if ($drct_dlv_cntry_cd.equalsIgnoreCase(name)) {
			drct_dlv_cntry_cd(value);
			return;
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			tdlv_cd(value);
			return;
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			tdlv_nm(value);
			return;
		}
		if ($tdlv_zip_cd.equalsIgnoreCase(name)) {
			tdlv_zip_cd(value);
			return;
		}
		if ($tdlv_addr1.equalsIgnoreCase(name)) {
			tdlv_addr1(value);
			return;
		}
		if ($tdlv_addr2.equalsIgnoreCase(name)) {
			tdlv_addr2(value);
			return;
		}
		if ($tdlv_addr3.equalsIgnoreCase(name)) {
			tdlv_addr3(value);
			return;
		}
		if ($tdlv_addr4.equalsIgnoreCase(name)) {
			tdlv_addr4(value);
			return;
		}
		if ($tdlv_cntct_dpt.equalsIgnoreCase(name)) {
			tdlv_cntct_dpt(value);
			return;
		}
		if ($tdlv_cntct_psn.equalsIgnoreCase(name)) {
			tdlv_cntct_psn(value);
			return;
		}
		if ($tdlv_tel.equalsIgnoreCase(name)) {
			tdlv_tel(value);
			return;
		}
		if ($tdlv_fax.equalsIgnoreCase(name)) {
			tdlv_fax(value);
			return;
		}
		if ($tdlv_cntry_cd.equalsIgnoreCase(name)) {
			tdlv_cntry_cd(value);
			return;
		}
		if ($dlv_slip_rmrks.equalsIgnoreCase(name)) {
			dlv_slip_rmrks(value);
			return;
		}
		if ($dlv_slip_d_rmrks.equalsIgnoreCase(name)) {
			dlv_slip_d_rmrks(value);
			return;
		}
		if ($dlv_day_week_typ.equalsIgnoreCase(name)) {
			dlv_day_week_typ(value);
			return;
		}
		if ($pri_prnt_typ.equalsIgnoreCase(name)) {
			pri_prnt_typ(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
			return;
		}
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			tterm_cd1(value);
			return;
		}
		if ($tterm_nm1.equalsIgnoreCase(name)) {
			tterm_nm1(value);
			return;
		}
		if ($tterm_rmrks1.equalsIgnoreCase(name)) {
			tterm_rmrks1(value);
			return;
		}
		if ($tterm_cd2.equalsIgnoreCase(name)) {
			tterm_cd2(value);
			return;
		}
		if ($tterm_nm2.equalsIgnoreCase(name)) {
			tterm_nm2(value);
			return;
		}
		if ($tterm_rmrks2.equalsIgnoreCase(name)) {
			tterm_rmrks2(value);
			return;
		}
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			tterm_cd3(value);
			return;
		}
		if ($tterm_nm3.equalsIgnoreCase(name)) {
			tterm_nm3(value);
			return;
		}
		if ($tterm_rmrks3.equalsIgnoreCase(name)) {
			tterm_rmrks3(value);
			return;
		}
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			trnspt_cd(value);
			return;
		}
		if ($trnspt_nm.equalsIgnoreCase(name)) {
			trnspt_nm(value);
			return;
		}
		if ($load_port_cd.equalsIgnoreCase(name)) {
			load_port_cd(value);
			return;
		}
		if ($load_port_nm.equalsIgnoreCase(name)) {
			load_port_nm(value);
			return;
		}
		if ($dschrg_port_cd.equalsIgnoreCase(name)) {
			dschrg_port_cd(value);
			return;
		}
		if ($dschrg_port_nm.equalsIgnoreCase(name)) {
			dschrg_port_nm(value);
			return;
		}
		if ($via_port_cd.equalsIgnoreCase(name)) {
			via_port_cd(value);
			return;
		}
		if ($via_port_nm.equalsIgnoreCase(name)) {
			via_port_nm(value);
			return;
		}
		if ($slo_co_itm_cd.equalsIgnoreCase(name)) {
			slo_co_itm_cd(value);
			return;
		}
		if ($slo_co_itm_sub1.equalsIgnoreCase(name)) {
			slo_co_itm_sub1(value);
			return;
		}
		if ($slo_co_itm_sub2.equalsIgnoreCase(name)) {
			slo_co_itm_sub2(value);
			return;
		}
		if ($slo_co_itm_sub3.equalsIgnoreCase(name)) {
			slo_co_itm_sub3(value);
			return;
		}
		if ($slo_co_itm_nm.equalsIgnoreCase(name)) {
			slo_co_itm_nm(value);
			return;
		}
		if ($cntry_org_cd.equalsIgnoreCase(name)) {
			cntry_org_cd(value);
			return;
		}
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
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
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($dscnt_rsn_cd.equalsIgnoreCase(name)) {
			dscnt_rsn_cd(value);
			return;
		}
		if ($dscnt_rsn_nm.equalsIgnoreCase(name)) {
			dscnt_rsn_nm(value);
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
		if ($tax_typ.equalsIgnoreCase(name)) {
			tax_typ(value);
			return;
		}
		if ($ship_wh_cd.equalsIgnoreCase(name)) {
			ship_wh_cd(value);
			return;
		}
		if ($ship_wh_nm.equalsIgnoreCase(name)) {
			ship_wh_nm(value);
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
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
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
		if ($sub_char4.equalsIgnoreCase(name)) {
			sub_char4(value);
			return;
		}
		if ($sub_char5.equalsIgnoreCase(name)) {
			sub_char5(value);
			return;
		}
		if ($sub_char6.equalsIgnoreCase(name)) {
			sub_char6(value);
			return;
		}
		if ($sub_char7.equalsIgnoreCase(name)) {
			sub_char7(value);
			return;
		}
		if ($sub_char8.equalsIgnoreCase(name)) {
			sub_char8(value);
			return;
		}
		if ($sub_char9.equalsIgnoreCase(name)) {
			sub_char9(value);
			return;
		}
		if ($sub_char10.equalsIgnoreCase(name)) {
			sub_char10(value);
			return;
		}
		if ($sub_char11.equalsIgnoreCase(name)) {
			sub_char11(value);
			return;
		}
		if ($sub_char12.equalsIgnoreCase(name)) {
			sub_char12(value);
			return;
		}
		if ($sub_char13.equalsIgnoreCase(name)) {
			sub_char13(value);
			return;
		}
		if ($sub_char14.equalsIgnoreCase(name)) {
			sub_char14(value);
			return;
		}
		if ($sub_char15.equalsIgnoreCase(name)) {
			sub_char15(value);
			return;
		}
		if ($sub_char16.equalsIgnoreCase(name)) {
			sub_char16(value);
			return;
		}
		if ($sub_char17.equalsIgnoreCase(name)) {
			sub_char17(value);
			return;
		}
		if ($sub_char18.equalsIgnoreCase(name)) {
			sub_char18(value);
			return;
		}
		if ($sub_char19.equalsIgnoreCase(name)) {
			sub_char19(value);
			return;
		}
		if ($sub_char20.equalsIgnoreCase(name)) {
			sub_char20(value);
			return;
		}
		if ($sub_char21.equalsIgnoreCase(name)) {
			sub_char21(value);
			return;
		}
		if ($sub_char22.equalsIgnoreCase(name)) {
			sub_char22(value);
			return;
		}
		if ($sub_char23.equalsIgnoreCase(name)) {
			sub_char23(value);
			return;
		}
		if ($sub_char24.equalsIgnoreCase(name)) {
			sub_char24(value);
			return;
		}
		if ($sub_char25.equalsIgnoreCase(name)) {
			sub_char25(value);
			return;
		}
		if ($sub_char26.equalsIgnoreCase(name)) {
			sub_char26(value);
			return;
		}
		if ($sub_char27.equalsIgnoreCase(name)) {
			sub_char27(value);
			return;
		}
		if ($sub_char28.equalsIgnoreCase(name)) {
			sub_char28(value);
			return;
		}
		if ($sub_char29.equalsIgnoreCase(name)) {
			sub_char29(value);
			return;
		}
		if ($sub_char30.equalsIgnoreCase(name)) {
			sub_char30(value);
			return;
		}
		if ($edi_sub_char1.equalsIgnoreCase(name)) {
			edi_sub_char1(value);
			return;
		}
		if ($edi_sub_char2.equalsIgnoreCase(name)) {
			edi_sub_char2(value);
			return;
		}
		if ($edi_sub_char3.equalsIgnoreCase(name)) {
			edi_sub_char3(value);
			return;
		}
		if ($edi_sub_char4.equalsIgnoreCase(name)) {
			edi_sub_char4(value);
			return;
		}
		if ($edi_sub_char5.equalsIgnoreCase(name)) {
			edi_sub_char5(value);
			return;
		}
		if ($edi_sub_d_char1.equalsIgnoreCase(name)) {
			edi_sub_d_char1(value);
			return;
		}
		if ($edi_sub_d_char2.equalsIgnoreCase(name)) {
			edi_sub_d_char2(value);
			return;
		}
		if ($edi_sub_d_char3.equalsIgnoreCase(name)) {
			edi_sub_d_char3(value);
			return;
		}
		if ($edi_sub_d_char4.equalsIgnoreCase(name)) {
			edi_sub_d_char4(value);
			return;
		}
		if ($edi_sub_d_char5.equalsIgnoreCase(name)) {
			edi_sub_d_char5(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		if ($edi_sub_num1.equalsIgnoreCase(name)) {
			edi_sub_num1(value);
			return;
		}
		if ($edi_sub_d_num1.equalsIgnoreCase(name)) {
			edi_sub_d_num1(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		if ($edi_sub_num1.equalsIgnoreCase(name)) {
			edi_sub_num1(value);
			return;
		}
		if ($edi_sub_d_num1.equalsIgnoreCase(name)) {
			edi_sub_d_num1(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		if ($edi_sub_num1.equalsIgnoreCase(name)) {
			edi_sub_num1(value);
			return;
		}
		if ($edi_sub_d_num1.equalsIgnoreCase(name)) {
			edi_sub_d_num1(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		if ($edi_sub_num1.equalsIgnoreCase(name)) {
			edi_sub_num1(value);
			return;
		}
		if ($edi_sub_d_num1.equalsIgnoreCase(name)) {
			edi_sub_d_num1(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		if ($edi_sub_num1.equalsIgnoreCase(name)) {
			edi_sub_num1(value);
			return;
		}
		if ($edi_sub_d_num1.equalsIgnoreCase(name)) {
			edi_sub_d_num1(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($data_make_dt.equalsIgnoreCase(name)) {
			data_make_dt(value);
			return;
		}
		if ($po_dt.equalsIgnoreCase(name)) {
			po_dt(value);
			return;
		}
		if ($upd_po_print_schd_dt.equalsIgnoreCase(name)) {
			upd_po_print_schd_dt(value);
			return;
		}
		if ($dlv_rqst_dt.equalsIgnoreCase(name)) {
			dlv_rqst_dt(value);
			return;
		}
		if ($dlv_rqst_hm.equalsIgnoreCase(name)) {
			dlv_rqst_hm(value);
			return;
		}
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			purc_schd_dt(value);
			return;
		}
		if ($sub_dt1.equalsIgnoreCase(name)) {
			sub_dt1(value);
			return;
		}
		if ($sub_dt2.equalsIgnoreCase(name)) {
			sub_dt2(value);
			return;
		}
		if ($sub_dt3.equalsIgnoreCase(name)) {
			sub_dt3(value);
			return;
		}
		if ($sub_dt4.equalsIgnoreCase(name)) {
			sub_dt4(value);
			return;
		}
		if ($sub_dt5.equalsIgnoreCase(name)) {
			sub_dt5(value);
			return;
		}
		if ($edi_sub_dt1.equalsIgnoreCase(name)) {
			edi_sub_dt1(value);
			return;
		}
		if ($edi_sub_d_dt1.equalsIgnoreCase(name)) {
			edi_sub_d_dt1(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($po_co_sundry_itm_flg.equalsIgnoreCase(name)) {
			po_co_sundry_itm_flg(value);
			return;
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			outsrc_flg(value);
			return;
		}
		if ($drct_dlv_flg.equalsIgnoreCase(name)) {
			drct_dlv_flg(value);
			return;
		}
		if ($sls_cststk_flg.equalsIgnoreCase(name)) {
			sls_cststk_flg(value);
			return;
		}
		if ($in_to_sundry_flg.equalsIgnoreCase(name)) {
			in_to_sundry_flg(value);
			return;
		}
		if ($tdlv_sundry_flg.equalsIgnoreCase(name)) {
			tdlv_sundry_flg(value);
			return;
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			inc_tax_flg(value);
			return;
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			interim_flg(value);
			return;
		}
		if ($tax_fix_flg.equalsIgnoreCase(name)) {
			tax_fix_flg(value);
			return;
		}
		if ($ship_block_flg.equalsIgnoreCase(name)) {
			ship_block_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

