package mcframe.commonPFBA.PFBAR5720;

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
	 *  データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 *  会社ＣＤ.<p>
	 *
	 */
	public static final String $co_cd = "co_cd";
	/**
	 *  取引先ＣＤ.<p>
	 *
	 */
	public static final String $bp_cd = "bp_cd";
	/**
	 *  取引先名.<p>
	 *
	 */
	public static final String $bp_nm = "bp_nm";
	/**
	 *  取引先別名１.<p>
	 *
	 */
	public static final String $bp_alt_nm1 = "bp_alt_nm1";
	/**
	 *  取引先別名２.<p>
	 *
	 */
	public static final String $bp_alt_nm2 = "bp_alt_nm2";
	/**
	 *  取引先別名３.<p>
	 *
	 */
	public static final String $bp_alt_nm3 = "bp_alt_nm3";
	/**
	 *  取引先別名４.<p>
	 *
	 */
	public static final String $bp_alt_nm4 = "bp_alt_nm4";
	/**
	 *  郵便番号.<p>
	 *
	 */
	public static final String $zip_cd = "zip_cd";
	/**
	 *  住所１.<p>
	 *
	 */
	public static final String $addr1 = "addr1";
	/**
	 *  住所２.<p>
	 *
	 */
	public static final String $addr2 = "addr2";
	/**
	 *  住所３.<p>
	 *
	 */
	public static final String $addr3 = "addr3";
	/**
	 *  住所４.<p>
	 *
	 */
	public static final String $addr4 = "addr4";
	/**
	 *  ＴＥＬ.<p>
	 *
	 */
	public static final String $tel = "tel";
	/**
	 *  ＦＡＸ.<p>
	 *
	 */
	public static final String $fax = "fax";
	/**
	 *  法人番号.<p>
	 *
	 */
	public static final String $ein = "ein";
	/**
	 *  標準企業コード.<p>
	 *
	 */
	public static final String $std_co_cd = "std_co_cd";
	/**
	 *  国ＣＤ.<p>
	 *
	 */
	public static final String $cntry_cd = "cntry_cd";
	/**
	 *  地域ＣＤ.<p>
	 *
	 */
	public static final String $area_cd = "area_cd";
	/**
	 *  通貨ＣＤ.<p>
	 *
	 */
	public static final String $cur_cd = "cur_cd";
	/**
	 *  帳票出力ロケールＣＤ.<p>
	 *
	 */
	public static final String $prnt_lcl_cd = "prnt_lcl_cd";
	/**
	 *  取引先分類ＣＤ１.<p>
	 *
	 */
	public static final String $bp_grp_cd1 = "bp_grp_cd1";
	/**
	 *  取引先分類ＣＤ２.<p>
	 *
	 */
	public static final String $bp_grp_cd2 = "bp_grp_cd2";
	/**
	 *  取引先分類ＣＤ３.<p>
	 *
	 */
	public static final String $bp_grp_cd3 = "bp_grp_cd3";
	/**
	 *  取引先分類ＣＤ４.<p>
	 *
	 */
	public static final String $bp_grp_cd4 = "bp_grp_cd4";
	/**
	 *  取引先分類ＣＤ５.<p>
	 *
	 */
	public static final String $bp_grp_cd5 = "bp_grp_cd5";
	/**
	 *  取引先分類ＣＤ６.<p>
	 *
	 */
	public static final String $bp_grp_cd6 = "bp_grp_cd6";
	/**
	 *  取引先分類ＣＤ７.<p>
	 *
	 */
	public static final String $bp_grp_cd7 = "bp_grp_cd7";
	/**
	 *  取引先分類ＣＤ８.<p>
	 *
	 */
	public static final String $bp_grp_cd8 = "bp_grp_cd8";
	/**
	 *  取引先分類ＣＤ９.<p>
	 *
	 */
	public static final String $bp_grp_cd9 = "bp_grp_cd9";
	/**
	 *  取引先分類ＣＤ１０.<p>
	 *
	 */
	public static final String $bp_grp_cd10 = "bp_grp_cd10";
	/**
	 *  取引先配賦グループ.<p>
	 *
	 */
	public static final String $bp_alc_grp = "bp_alc_grp";
	/**
	 *  得意先ＦＬＧ.<p>
	 *
	 */
	public static final String $cst_flg = "cst_flg";
	/**
	 *  売掛先ＦＬＧ.<p>
	 *
	 */
	public static final String $acst_flg = "acst_flg";
	/**
	 *  請求先ＦＬＧ.<p>
	 *
	 */
	public static final String $bcst_flg = "bcst_flg";
	/**
	 *  入金先ＦＬＧ.<p>
	 *
	 */
	public static final String $rcst_flg = "rcst_flg";
	/**
	 *  発注先ＦＬＧ.<p>
	 *
	 */
	public static final String $sppl_flg = "sppl_flg";
	/**
	 *  買掛先ＦＬＧ.<p>
	 *
	 */
	public static final String $asppl_flg = "asppl_flg";
	/**
	 *  支払予定管理先ＦＬＧ.<p>
	 *
	 */
	public static final String $bsppl_flg = "bsppl_flg";
	/**
	 *  支払先ＦＬＧ.<p>
	 *
	 */
	public static final String $psppl_flg = "psppl_flg";
	/**
	 *  与信管理先ＦＬＧ.<p>
	 *
	 */
	public static final String $cred_flg = "cred_flg";
	/**
	 *  納品先ＦＬＧ.<p>
	 *
	 */
	public static final String $dlv_flg = "dlv_flg";
	/**
	 *  メーカＦＬＧ.<p>
	 *
	 */
	public static final String $maker_flg = "maker_flg";
	/**
	 *  仕向先ＦＬＧ.<p>
	 *
	 */
	public static final String $dest_flg = "dest_flg";
	/**
	 *  買掛先ＣＤ.<p>
	 *
	 */
	public static final String $asppl_cd = "asppl_cd";
	/**
	 *  下請対象ＦＬＧ.<p>
	 *
	 */
	public static final String $subcon_flg = "subcon_flg";
	/**
	 *  注文書表示ＣＤ.<p>
	 *
	 */
	public static final String $po_print_cd = "po_print_cd";
	/**
	 *  発注先納品書ＣＤ.<p>
	 *
	 */
	public static final String $sppl_ship_form_cd = "sppl_ship_form_cd";
	/**
	 *  支払繰越回数.<p>
	 *
	 */
	public static final String $pay_crryovr_times = "pay_crryovr_times";
	/**
	 *  発注先部署.<p>
	 *
	 */
	public static final String $sppl_cntct_dpt = "sppl_cntct_dpt";
	/**
	 *  発注先担当者.<p>
	 *
	 */
	public static final String $sppl_cntct_psn = "sppl_cntct_psn";
	/**
	 *  発注先担当者敬称.<p>
	 *
	 */
	public static final String $sppl_cntct_psn_title = "sppl_cntct_psn_title";
	/**
	 *  購買単価取得区分.<p>
	 *
	 */
	public static final String $purc_upri_req_typ = "purc_upri_req_typ";
	/**
	 *  購買単価変更許可ＦＬＧ.<p>
	 *
	 */
	public static final String $purc_upri_cng_flg = "purc_upri_cng_flg";
	/**
	 *  仕入金額端数処理区分.<p>
	 *
	 */
	public static final String $purc_amt_rnd_typ = "purc_amt_rnd_typ";
	/**
	 *  仕入税額端数処理区分.<p>
	 *
	 */
	public static final String $purc_tax_rnd_typ = "purc_tax_rnd_typ";
	/**
	 *  仕入税計算区分.<p>
	 *
	 */
	public static final String $purc_tax_calc_typ = "purc_tax_calc_typ";
	/**
	 *  仕入税ＣＤ.<p>
	 *
	 */
	public static final String $purc_tax_cd = "purc_tax_cd";
	/**
	 *  仕入税優先ＦＬＧ.<p>
	 *
	 */
	public static final String $purc_tax_cd_prio_flg = "purc_tax_cd_prio_flg";
	/**
	 *  案件別注文書ＦＬＧ.<p>
	 *
	 */
	public static final String $wrk_po_flg = "wrk_po_flg";
	/**
	 *  案件別債務管理ＦＬＧ.<p>
	 *
	 */
	public static final String $wrk_ap_flg = "wrk_ap_flg";
	/**
	 *  仕入ロット明細分割区分.<p>
	 *
	 */
	public static final String $purc_slip_each_lot_typ = "purc_slip_each_lot_typ";
	/**
	 *  支給積送管理区分.<p>
	 *
	 */
	public static final String $prov_rcv_typ = "prov_rcv_typ";
	/**
	 *  有償支給先ＦＬＧ.<p>
	 *
	 */
	public static final String $onr_prsppl_flg = "onr_prsppl_flg";
	/**
	 *  買戻義務ＦＬＧ.<p>
	 *
	 */
	public static final String $repurc_obli_flg = "repurc_obli_flg";
	/**
	 *  支給計上区分.<p>
	 *
	 */
	public static final String $prov_basis_typ = "prov_basis_typ";
	/**
	 *  支給単価変更許可ＦＬＧ.<p>
	 *
	 */
	public static final String $prov_upri_cng_flg = "prov_upri_cng_flg";
	/**
	 *  支給金額端数処理区分.<p>
	 *
	 */
	public static final String $prov_amt_rnd_typ = "prov_amt_rnd_typ";
	/**
	 *  支給税額端数処理区分.<p>
	 *
	 */
	public static final String $prov_tax_rnd_typ = "prov_tax_rnd_typ";
	/**
	 *  支給税計算区分.<p>
	 *
	 */
	public static final String $prov_tax_calc_typ = "prov_tax_calc_typ";
	/**
	 *  支給税ＣＤ.<p>
	 *
	 */
	public static final String $prov_tax_cd = "prov_tax_cd";
	/**
	 *  支給税優先ＦＬＧ.<p>
	 *
	 */
	public static final String $prov_tax_cd_prio_flg = "prov_tax_cd_prio_flg";
	/**
	 *  発注先カレンダＣＤ.<p>
	 *
	 */
	public static final String $sppl_cal_cd = "sppl_cal_cd";
	/**
	 *  発注先インボイス取引ＦＬＧ.<p>
	 *
	 */
	public static final String $sppl_iv_flg = "sppl_iv_flg";
	/**
	 *  納期回答確認ＦＬＧ.<p>
	 *
	 */
	public static final String $prms_recv_flg = "prms_recv_flg";
	/**
	 *  発注先取引条件ＣＤ１.<p>
	 *
	 */
	public static final String $sppl_tterm_cd1 = "sppl_tterm_cd1";
	/**
	 *  発注先取引条件ＣＤ２.<p>
	 *
	 */
	public static final String $sppl_tterm_cd2 = "sppl_tterm_cd2";
	/**
	 *  発注先取引条件ＣＤ３.<p>
	 *
	 */
	public static final String $sppl_tterm_cd3 = "sppl_tterm_cd3";
	/**
	 *  支払予定管理先ＣＤ.<p>
	 *
	 */
	public static final String $bsppl_cd = "bsppl_cd";
	/**
	 *  メモ１.<p>
	 *
	 */
	public static final String $memo1 = "memo1";
	/**
	 *  メモ２.<p>
	 *
	 */
	public static final String $memo2 = "memo2";
	/**
	 *  メモ３.<p>
	 *
	 */
	public static final String $memo3 = "memo3";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public static final String $if_sub_char1 = "if_sub_char1";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public static final String $if_sub_char2 = "if_sub_char2";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public static final String $if_sub_char3 = "if_sub_char3";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public static final String $if_sub_char4 = "if_sub_char4";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public static final String $if_sub_char5 = "if_sub_char5";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目６.<p>
	 *
	 */
	public static final String $if_sub_char6 = "if_sub_char6";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目７.<p>
	 *
	 */
	public static final String $if_sub_char7 = "if_sub_char7";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目８.<p>
	 *
	 */
	public static final String $if_sub_char8 = "if_sub_char8";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目９.<p>
	 *
	 */
	public static final String $if_sub_char9 = "if_sub_char9";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目１０.<p>
	 *
	 */
	public static final String $if_sub_char10 = "if_sub_char10";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目１１.<p>
	 *
	 */
	public static final String $if_sub_char11 = "if_sub_char11";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目１２.<p>
	 *
	 */
	public static final String $if_sub_char12 = "if_sub_char12";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目１３.<p>
	 *
	 */
	public static final String $if_sub_char13 = "if_sub_char13";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目１４.<p>
	 *
	 */
	public static final String $if_sub_char14 = "if_sub_char14";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目１５.<p>
	 *
	 */
	public static final String $if_sub_char15 = "if_sub_char15";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目１６.<p>
	 *
	 */
	public static final String $if_sub_char16 = "if_sub_char16";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目１７.<p>
	 *
	 */
	public static final String $if_sub_char17 = "if_sub_char17";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目１８.<p>
	 *
	 */
	public static final String $if_sub_char18 = "if_sub_char18";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目１９.<p>
	 *
	 */
	public static final String $if_sub_char19 = "if_sub_char19";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目２０.<p>
	 *
	 */
	public static final String $if_sub_char20 = "if_sub_char20";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目２１.<p>
	 *
	 */
	public static final String $if_sub_char21 = "if_sub_char21";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目２２.<p>
	 *
	 */
	public static final String $if_sub_char22 = "if_sub_char22";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目２３.<p>
	 *
	 */
	public static final String $if_sub_char23 = "if_sub_char23";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目２４.<p>
	 *
	 */
	public static final String $if_sub_char24 = "if_sub_char24";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目２５.<p>
	 *
	 */
	public static final String $if_sub_char25 = "if_sub_char25";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目２６.<p>
	 *
	 */
	public static final String $if_sub_char26 = "if_sub_char26";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目２７.<p>
	 *
	 */
	public static final String $if_sub_char27 = "if_sub_char27";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目２８.<p>
	 *
	 */
	public static final String $if_sub_char28 = "if_sub_char28";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目２９.<p>
	 *
	 */
	public static final String $if_sub_char29 = "if_sub_char29";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目３０.<p>
	 *
	 */
	public static final String $if_sub_char30 = "if_sub_char30";
	/**
	 *  ＩＦ予備ＮＵＭ項目１.<p>
	 *
	 */
	public static final String $if_sub_num1 = "if_sub_num1";
	/**
	 *  ＩＦ予備ＮＵＭ項目２.<p>
	 *
	 */
	public static final String $if_sub_num2 = "if_sub_num2";
	/**
	 *  ＩＦ予備ＮＵＭ項目３.<p>
	 *
	 */
	public static final String $if_sub_num3 = "if_sub_num3";
	/**
	 *  ＩＦ予備ＮＵＭ項目４.<p>
	 *
	 */
	public static final String $if_sub_num4 = "if_sub_num4";
	/**
	 *  ＩＦ予備ＮＵＭ項目５.<p>
	 *
	 */
	public static final String $if_sub_num5 = "if_sub_num5";
	/**
	 *  ＩＦ予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public static final String $if_sub_dt1 = "if_sub_dt1";
	/**
	 *  ＩＦ予備ＤＡＴＥ項目２.<p>
	 *
	 */
	public static final String $if_sub_dt2 = "if_sub_dt2";
	/**
	 *  ＩＦ予備ＤＡＴＥ項目３.<p>
	 *
	 */
	public static final String $if_sub_dt3 = "if_sub_dt3";
	/**
	 *  ＩＦ予備ＤＡＴＥ項目４.<p>
	 *
	 */
	public static final String $if_sub_dt4 = "if_sub_dt4";
	/**
	 *  ＩＦ予備ＤＡＴＥ項目５.<p>
	 *
	 */
	public static final String $if_sub_dt5 = "if_sub_dt5";
	/**
	 *  メモ４.<p>
	 *
	 */
	public static final String $memo4 = "memo4";
	/**
	 *  メモ５.<p>
	 *
	 */
	public static final String $memo5 = "memo5";
	/**
	 *  メモ６.<p>
	 *
	 */
	public static final String $memo6 = "memo6";
	/**
	 *  メモ７.<p>
	 *
	 */
	public static final String $memo7 = "memo7";
	/**
	 *  メモ８.<p>
	 *
	 */
	public static final String $memo8 = "memo8";
	/**
	 *  メモ９.<p>
	 *
	 */
	public static final String $memo9 = "memo9";
	/**
	 *  メモ１０.<p>
	 *
	 */
	public static final String $memo10 = "memo10";
	/**
	 *  メモ１１.<p>
	 *
	 */
	public static final String $memo11 = "memo11";
	/**
	 *  メモ１２.<p>
	 *
	 */
	public static final String $memo12 = "memo12";
	/**
	 *  メモ１３.<p>
	 *
	 */
	public static final String $memo13 = "memo13";
	/**
	 *  メモ１４.<p>
	 *
	 */
	public static final String $memo14 = "memo14";
	/**
	 *  メモ１５.<p>
	 *
	 */
	public static final String $memo15 = "memo15";
	/**
	 *  メモ１６.<p>
	 *
	 */
	public static final String $memo16 = "memo16";
	/**
	 *  メモ１７.<p>
	 *
	 */
	public static final String $memo17 = "memo17";
	/**
	 *  メモ１８.<p>
	 *
	 */
	public static final String $memo18 = "memo18";
	/**
	 *  メモ１９.<p>
	 *
	 */
	public static final String $memo19 = "memo19";
	/**
	 *  メモ２０.<p>
	 *
	 */
	public static final String $memo20 = "memo20";
	/**
	 *  事業者ＮＯ.<p>
	 *
	 */
	public static final String $biz_co_no = "biz_co_no";


	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta co_cd_META = createCommonMeta($co_cd, mcframe.commonMA.meta.MA_META.CO_CD);
	public static final MCMeta bp_cd_META = createCommonMeta($bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bp_nm_META = createCommonMeta($bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bp_alt_nm1_META = createCommonMeta($bp_alt_nm1, mcframe.commonMA.meta.MA_META.BP_ALT_NM1);
	public static final MCMeta bp_alt_nm2_META = createCommonMeta($bp_alt_nm2, mcframe.commonMA.meta.MA_META.BP_ALT_NM2);
	public static final MCMeta bp_alt_nm3_META = createCommonMeta($bp_alt_nm3, mcframe.commonMA.meta.MA_META.BP_ALT_NM3);
	public static final MCMeta bp_alt_nm4_META = createCommonMeta($bp_alt_nm4, mcframe.commonMA.meta.MA_META.BP_ALT_NM4);
	public static final MCMeta zip_cd_META = createCommonMeta($zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta addr1_META = createCommonMeta($addr1, mcframe.commonMA.meta.MA_META.ADDR1);
	public static final MCMeta addr2_META = createCommonMeta($addr2, mcframe.commonMA.meta.MA_META.ADDR2);
	public static final MCMeta addr3_META = createCommonMeta($addr3, mcframe.commonMA.meta.MA_META.ADDR3);
	public static final MCMeta addr4_META = createCommonMeta($addr4, mcframe.commonMA.meta.MA_META.ADDR4);
	public static final MCMeta tel_META = createCommonMeta($tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta fax_META = createCommonMeta($fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta ein_META = createCommonMeta($ein, mcframe.commonMA.meta.MA_META.EIN);
	public static final MCMeta std_co_cd_META = createCommonMeta($std_co_cd, mcframe.commonMA.meta.MA_META.STD_CO_CD);
	public static final MCMeta cntry_cd_META = createCommonMeta($cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta area_cd_META = createCommonMeta($area_cd, mcframe.commonMA.meta.MA_META.AREA_CD);
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta prnt_lcl_cd_META = createCommonMeta($prnt_lcl_cd, mcframe.commonMA.meta.MA_META.LCL_CD);
	public static final MCMeta bp_grp_cd1_META = createCommonMeta($bp_grp_cd1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_cd2_META = createCommonMeta($bp_grp_cd2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_cd3_META = createCommonMeta($bp_grp_cd3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_cd4_META = createCommonMeta($bp_grp_cd4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_cd5_META = createCommonMeta($bp_grp_cd5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_cd6_META = createCommonMeta($bp_grp_cd6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_cd7_META = createCommonMeta($bp_grp_cd7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_cd8_META = createCommonMeta($bp_grp_cd8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_cd9_META = createCommonMeta($bp_grp_cd9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_cd10_META = createCommonMeta($bp_grp_cd10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_alc_grp_META = createCommonMeta($bp_alc_grp, mcframe.commonMA.meta.MA_META.BP_ALC_GRP);
	public static final MCMeta cst_flg_META = createCommonMeta($cst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta acst_flg_META = createCommonMeta($acst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bcst_flg_META = createCommonMeta($bcst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcst_flg_META = createCommonMeta($rcst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_flg_META = createCommonMeta($sppl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta asppl_flg_META = createCommonMeta($asppl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bsppl_flg_META = createCommonMeta($bsppl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta psppl_flg_META = createCommonMeta($psppl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cred_flg_META = createCommonMeta($cred_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_flg_META = createCommonMeta($dlv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta maker_flg_META = createCommonMeta($maker_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dest_flg_META = createCommonMeta($dest_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta asppl_cd_META = createCommonMeta($asppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta subcon_flg_META = createCommonMeta($subcon_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta po_print_cd_META = createCommonMeta($po_print_cd, mcframe.commonMA.meta.MA_META.PO_PRINT_CD);
	public static final MCMeta sppl_ship_form_cd_META = createCommonMeta($sppl_ship_form_cd, mcframe.commonMA.meta.MA_META.SLIP_FORM_CD);
	public static final MCMeta pay_crryovr_times_META = createCommonMeta($pay_crryovr_times, mcframe.commonMA.meta.MA_META.CRRYOVR_TIMES);
	public static final MCMeta sppl_cntct_dpt_META = createCommonMeta($sppl_cntct_dpt, mcframe.commonMA.meta.MA_META.CNTCT_DPT);
	public static final MCMeta sppl_cntct_psn_META = createCommonMeta($sppl_cntct_psn, mcframe.commonMA.meta.MA_META.CNTCT_PSN);
	public static final MCMeta sppl_cntct_psn_title_META = createCommonMeta($sppl_cntct_psn_title, mcframe.commonMA.meta.MA_META.BP_PSN_TITLE);
	public static final MCMeta purc_upri_req_typ_META = createCommonMeta($purc_upri_req_typ, mcframe.commonMA.meta.MA_META.PURC_UPRI_REQ_TYP);
	public static final MCMeta purc_upri_cng_flg_META = createCommonMeta($purc_upri_cng_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_amt_rnd_typ_META = createCommonMeta($purc_amt_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta purc_tax_rnd_typ_META = createCommonMeta($purc_tax_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta purc_tax_calc_typ_META = createCommonMeta($purc_tax_calc_typ, mcframe.commonMA.meta.MA_META.TAX_CALC_TYP);
	public static final MCMeta purc_tax_cd_META = createCommonMeta($purc_tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta purc_tax_cd_prio_flg_META = createCommonMeta($purc_tax_cd_prio_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wrk_po_flg_META = createCommonMeta($wrk_po_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wrk_ap_flg_META = createCommonMeta($wrk_ap_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_slip_each_lot_typ_META = createCommonMeta($purc_slip_each_lot_typ, mcframe.commonMA.meta.MA_META.SLIP_EACH_LOT_TYP);
	public static final MCMeta prov_rcv_typ_META = createCommonMeta($prov_rcv_typ, mcframe.commonMA.meta.MA_META.PROV_RCV_TYP);
	public static final MCMeta onr_prsppl_flg_META = createCommonMeta($onr_prsppl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta repurc_obli_flg_META = createCommonMeta($repurc_obli_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prov_basis_typ_META = createCommonMeta($prov_basis_typ, mcframe.commonMA.meta.MA_META.PROV_BASIS_TYP);
	public static final MCMeta prov_upri_cng_flg_META = createCommonMeta($prov_upri_cng_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prov_amt_rnd_typ_META = createCommonMeta($prov_amt_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta prov_tax_rnd_typ_META = createCommonMeta($prov_tax_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta prov_tax_calc_typ_META = createCommonMeta($prov_tax_calc_typ, mcframe.commonMA.meta.MA_META.TAX_CALC_TYP);
	public static final MCMeta prov_tax_cd_META = createCommonMeta($prov_tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta prov_tax_cd_prio_flg_META = createCommonMeta($prov_tax_cd_prio_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_cal_cd_META = createCommonMeta($sppl_cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta sppl_iv_flg_META = createCommonMeta($sppl_iv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prms_recv_flg_META = createCommonMeta($prms_recv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_tterm_cd1_META = createCommonMeta($sppl_tterm_cd1, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta sppl_tterm_cd2_META = createCommonMeta($sppl_tterm_cd2, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta sppl_tterm_cd3_META = createCommonMeta($sppl_tterm_cd3, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta bsppl_cd_META = createCommonMeta($bsppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
	public static final MCMeta if_sub_char1_META = createCommonMeta($if_sub_char1, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR1);
	public static final MCMeta if_sub_char2_META = createCommonMeta($if_sub_char2, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR2);
	public static final MCMeta if_sub_char3_META = createCommonMeta($if_sub_char3, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR3);
	public static final MCMeta if_sub_char4_META = createCommonMeta($if_sub_char4, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR4);
	public static final MCMeta if_sub_char5_META = createCommonMeta($if_sub_char5, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR5);
	public static final MCMeta if_sub_char6_META = createCommonMeta($if_sub_char6, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR6);
	public static final MCMeta if_sub_char7_META = createCommonMeta($if_sub_char7, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR7);
	public static final MCMeta if_sub_char8_META = createCommonMeta($if_sub_char8, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR8);
	public static final MCMeta if_sub_char9_META = createCommonMeta($if_sub_char9, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR9);
	public static final MCMeta if_sub_char10_META = createCommonMeta($if_sub_char10, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR10);
	public static final MCMeta if_sub_char11_META = createCommonMeta($if_sub_char11, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR11);
	public static final MCMeta if_sub_char12_META = createCommonMeta($if_sub_char12, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR12);
	public static final MCMeta if_sub_char13_META = createCommonMeta($if_sub_char13, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR13);
	public static final MCMeta if_sub_char14_META = createCommonMeta($if_sub_char14, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR14);
	public static final MCMeta if_sub_char15_META = createCommonMeta($if_sub_char15, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR15);
	public static final MCMeta if_sub_char16_META = createCommonMeta($if_sub_char16, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR16);
	public static final MCMeta if_sub_char17_META = createCommonMeta($if_sub_char17, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR17);
	public static final MCMeta if_sub_char18_META = createCommonMeta($if_sub_char18, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR18);
	public static final MCMeta if_sub_char19_META = createCommonMeta($if_sub_char19, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR19);
	public static final MCMeta if_sub_char20_META = createCommonMeta($if_sub_char20, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR20);
	public static final MCMeta if_sub_char21_META = createCommonMeta($if_sub_char21, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR21);
	public static final MCMeta if_sub_char22_META = createCommonMeta($if_sub_char22, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR22);
	public static final MCMeta if_sub_char23_META = createCommonMeta($if_sub_char23, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR23);
	public static final MCMeta if_sub_char24_META = createCommonMeta($if_sub_char24, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR24);
	public static final MCMeta if_sub_char25_META = createCommonMeta($if_sub_char25, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR25);
	public static final MCMeta if_sub_char26_META = createCommonMeta($if_sub_char26, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR26);
	public static final MCMeta if_sub_char27_META = createCommonMeta($if_sub_char27, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR27);
	public static final MCMeta if_sub_char28_META = createCommonMeta($if_sub_char28, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR28);
	public static final MCMeta if_sub_char29_META = createCommonMeta($if_sub_char29, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR29);
	public static final MCMeta if_sub_char30_META = createCommonMeta($if_sub_char30, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR30);
	public static final MCMeta if_sub_num1_META = createCommonMeta($if_sub_num1, mcframe.commonMA.meta.MA_META.IF_SUB_NUM1);
	public static final MCMeta if_sub_num2_META = createCommonMeta($if_sub_num2, mcframe.commonMA.meta.MA_META.IF_SUB_NUM2);
	public static final MCMeta if_sub_num3_META = createCommonMeta($if_sub_num3, mcframe.commonMA.meta.MA_META.IF_SUB_NUM3);
	public static final MCMeta if_sub_num4_META = createCommonMeta($if_sub_num4, mcframe.commonMA.meta.MA_META.IF_SUB_NUM4);
	public static final MCMeta if_sub_num5_META = createCommonMeta($if_sub_num5, mcframe.commonMA.meta.MA_META.IF_SUB_NUM5);
	public static final MCMeta if_sub_dt1_META = createCommonMeta($if_sub_dt1, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta if_sub_dt2_META = createCommonMeta($if_sub_dt2, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta if_sub_dt3_META = createCommonMeta($if_sub_dt3, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta if_sub_dt4_META = createCommonMeta($if_sub_dt4, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta if_sub_dt5_META = createCommonMeta($if_sub_dt5, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta memo4_META = createCommonMeta($memo4, mcframe.commonMA.meta.MA_META.MST_MEMO4);
	public static final MCMeta memo5_META = createCommonMeta($memo5, mcframe.commonMA.meta.MA_META.MST_MEMO5);
	public static final MCMeta memo6_META = createCommonMeta($memo6, mcframe.commonMA.meta.MA_META.MST_MEMO6);
	public static final MCMeta memo7_META = createCommonMeta($memo7, mcframe.commonMA.meta.MA_META.MST_MEMO7);
	public static final MCMeta memo8_META = createCommonMeta($memo8, mcframe.commonMA.meta.MA_META.MST_MEMO8);
	public static final MCMeta memo9_META = createCommonMeta($memo9, mcframe.commonMA.meta.MA_META.MST_MEMO9);
	public static final MCMeta memo10_META = createCommonMeta($memo10, mcframe.commonMA.meta.MA_META.MST_MEMO10);
	public static final MCMeta memo11_META = createCommonMeta($memo11, mcframe.commonMA.meta.MA_META.MST_MEMO11);
	public static final MCMeta memo12_META = createCommonMeta($memo12, mcframe.commonMA.meta.MA_META.MST_MEMO12);
	public static final MCMeta memo13_META = createCommonMeta($memo13, mcframe.commonMA.meta.MA_META.MST_MEMO13);
	public static final MCMeta memo14_META = createCommonMeta($memo14, mcframe.commonMA.meta.MA_META.MST_MEMO14);
	public static final MCMeta memo15_META = createCommonMeta($memo15, mcframe.commonMA.meta.MA_META.MST_MEMO15);
	public static final MCMeta memo16_META = createCommonMeta($memo16, mcframe.commonMA.meta.MA_META.MST_MEMO16);
	public static final MCMeta memo17_META = createCommonMeta($memo17, mcframe.commonMA.meta.MA_META.MST_MEMO17);
	public static final MCMeta memo18_META = createCommonMeta($memo18, mcframe.commonMA.meta.MA_META.MST_MEMO18);
	public static final MCMeta memo19_META = createCommonMeta($memo19, mcframe.commonMA.meta.MA_META.MST_MEMO19);
	public static final MCMeta memo20_META = createCommonMeta($memo20, mcframe.commonMA.meta.MA_META.MST_MEMO20);
	public static final MCMeta biz_co_no_META = createCommonMeta($biz_co_no, mcframe.commonMA.meta.MA_META.BIZ_CO_NO);

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			data_crud_typ_META,
			co_cd_META,
			bp_cd_META,
			bp_nm_META,
			bp_alt_nm1_META,
			bp_alt_nm2_META,
			bp_alt_nm3_META,
			bp_alt_nm4_META,
			zip_cd_META,
			addr1_META,
			addr2_META,
			addr3_META,
			addr4_META,
			tel_META,
			fax_META,
			ein_META,
			std_co_cd_META,
			cntry_cd_META,
			area_cd_META,
			cur_cd_META,
			prnt_lcl_cd_META,
			bp_grp_cd1_META,
			bp_grp_cd2_META,
			bp_grp_cd3_META,
			bp_grp_cd4_META,
			bp_grp_cd5_META,
			bp_grp_cd6_META,
			bp_grp_cd7_META,
			bp_grp_cd8_META,
			bp_grp_cd9_META,
			bp_grp_cd10_META,
			bp_alc_grp_META,
			cst_flg_META,
			acst_flg_META,
			bcst_flg_META,
			rcst_flg_META,
			sppl_flg_META,
			asppl_flg_META,
			bsppl_flg_META,
			psppl_flg_META,
			cred_flg_META,
			dlv_flg_META,
			maker_flg_META,
			dest_flg_META,
			asppl_cd_META,
			subcon_flg_META,
			po_print_cd_META,
			sppl_ship_form_cd_META,
			pay_crryovr_times_META,
			sppl_cntct_dpt_META,
			sppl_cntct_psn_META,
			sppl_cntct_psn_title_META,
			purc_upri_req_typ_META,
			purc_upri_cng_flg_META,
			purc_amt_rnd_typ_META,
			purc_tax_rnd_typ_META,
			purc_tax_calc_typ_META,
			purc_tax_cd_META,
			purc_tax_cd_prio_flg_META,
			wrk_po_flg_META,
			wrk_ap_flg_META,
			purc_slip_each_lot_typ_META,
			prov_rcv_typ_META,
			onr_prsppl_flg_META,
			repurc_obli_flg_META,
			prov_basis_typ_META,
			prov_upri_cng_flg_META,
			prov_amt_rnd_typ_META,
			prov_tax_rnd_typ_META,
			prov_tax_calc_typ_META,
			prov_tax_cd_META,
			prov_tax_cd_prio_flg_META,
			sppl_cal_cd_META,
			sppl_iv_flg_META,
			prms_recv_flg_META,
			sppl_tterm_cd1_META,
			sppl_tterm_cd2_META,
			sppl_tterm_cd3_META,
			bsppl_cd_META,
			memo1_META,
			memo2_META,
			memo3_META,
			if_sub_char1_META,
			if_sub_char2_META,
			if_sub_char3_META,
			if_sub_char4_META,
			if_sub_char5_META,
			if_sub_char6_META,
			if_sub_char7_META,
			if_sub_char8_META,
			if_sub_char9_META,
			if_sub_char10_META,
			if_sub_char11_META,
			if_sub_char12_META,
			if_sub_char13_META,
			if_sub_char14_META,
			if_sub_char15_META,
			if_sub_char16_META,
			if_sub_char17_META,
			if_sub_char18_META,
			if_sub_char19_META,
			if_sub_char20_META,
			if_sub_char21_META,
			if_sub_char22_META,
			if_sub_char23_META,
			if_sub_char24_META,
			if_sub_char25_META,
			if_sub_char26_META,
			if_sub_char27_META,
			if_sub_char28_META,
			if_sub_char29_META,
			if_sub_char30_META,
			if_sub_num1_META,
			if_sub_num2_META,
			if_sub_num3_META,
			if_sub_num4_META,
			if_sub_num5_META,
			if_sub_dt1_META,
			if_sub_dt2_META,
			if_sub_dt3_META,
			if_sub_dt4_META,
			if_sub_dt5_META,
			memo4_META,
			memo5_META,
			memo6_META,
			memo7_META,
			memo8_META,
			memo9_META,
			memo10_META,
			memo11_META,
			memo12_META,
			memo13_META,
			memo14_META,
			memo15_META,
			memo16_META,
			memo17_META,
			memo18_META,
			memo19_META,
			memo20_META,
			biz_co_no_META
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
	 *  データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 0, $data_crud_typ);
	}

	/**
	 *  データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 0, $data_crud_typ, value);
	}


	/**
	 *  会社ＣＤ.<p>
	 *
	 */
	public String co_cd() {
		return getConstString(offset + 1, $co_cd);
	}

	/**
	 *  会社ＣＤ.<p>
	 *
	 */
	public void co_cd(String value) {
		setConstString(offset + 1, $co_cd, value);
	}


	/**
	 *  取引先ＣＤ.<p>
	 *
	 */
	public String bp_cd() {
		return getConstString(offset + 2, $bp_cd);
	}

	/**
	 *  取引先ＣＤ.<p>
	 *
	 */
	public void bp_cd(String value) {
		setConstString(offset + 2, $bp_cd, value);
	}


	/**
	 *  取引先名.<p>
	 *
	 */
	public String bp_nm() {
		return getConstString(offset + 3, $bp_nm);
	}

	/**
	 *  取引先名.<p>
	 *
	 */
	public void bp_nm(String value) {
		setConstString(offset + 3, $bp_nm, value);
	}


	/**
	 *  取引先別名１.<p>
	 *
	 */
	public String bp_alt_nm1() {
		return getConstString(offset + 4, $bp_alt_nm1);
	}

	/**
	 *  取引先別名１.<p>
	 *
	 */
	public void bp_alt_nm1(String value) {
		setConstString(offset + 4, $bp_alt_nm1, value);
	}


	/**
	 *  取引先別名２.<p>
	 *
	 */
	public String bp_alt_nm2() {
		return getConstString(offset + 5, $bp_alt_nm2);
	}

	/**
	 *  取引先別名２.<p>
	 *
	 */
	public void bp_alt_nm2(String value) {
		setConstString(offset + 5, $bp_alt_nm2, value);
	}


	/**
	 *  取引先別名３.<p>
	 *
	 */
	public String bp_alt_nm3() {
		return getConstString(offset + 6, $bp_alt_nm3);
	}

	/**
	 *  取引先別名３.<p>
	 *
	 */
	public void bp_alt_nm3(String value) {
		setConstString(offset + 6, $bp_alt_nm3, value);
	}


	/**
	 *  取引先別名４.<p>
	 *
	 */
	public String bp_alt_nm4() {
		return getConstString(offset + 7, $bp_alt_nm4);
	}

	/**
	 *  取引先別名４.<p>
	 *
	 */
	public void bp_alt_nm4(String value) {
		setConstString(offset + 7, $bp_alt_nm4, value);
	}


	/**
	 *  郵便番号.<p>
	 *
	 */
	public String zip_cd() {
		return getConstString(offset + 8, $zip_cd);
	}

	/**
	 *  郵便番号.<p>
	 *
	 */
	public void zip_cd(String value) {
		setConstString(offset + 8, $zip_cd, value);
	}


	/**
	 *  住所１.<p>
	 *
	 */
	public String addr1() {
		return getConstString(offset + 9, $addr1);
	}

	/**
	 *  住所１.<p>
	 *
	 */
	public void addr1(String value) {
		setConstString(offset + 9, $addr1, value);
	}


	/**
	 *  住所２.<p>
	 *
	 */
	public String addr2() {
		return getConstString(offset + 10, $addr2);
	}

	/**
	 *  住所２.<p>
	 *
	 */
	public void addr2(String value) {
		setConstString(offset + 10, $addr2, value);
	}


	/**
	 *  住所３.<p>
	 *
	 */
	public String addr3() {
		return getConstString(offset + 11, $addr3);
	}

	/**
	 *  住所３.<p>
	 *
	 */
	public void addr3(String value) {
		setConstString(offset + 11, $addr3, value);
	}


	/**
	 *  住所４.<p>
	 *
	 */
	public String addr4() {
		return getConstString(offset + 12, $addr4);
	}

	/**
	 *  住所４.<p>
	 *
	 */
	public void addr4(String value) {
		setConstString(offset + 12, $addr4, value);
	}


	/**
	 *  ＴＥＬ.<p>
	 *
	 */
	public String tel() {
		return getConstString(offset + 13, $tel);
	}

	/**
	 *  ＴＥＬ.<p>
	 *
	 */
	public void tel(String value) {
		setConstString(offset + 13, $tel, value);
	}


	/**
	 *  ＦＡＸ.<p>
	 *
	 */
	public String fax() {
		return getConstString(offset + 14, $fax);
	}

	/**
	 *  ＦＡＸ.<p>
	 *
	 */
	public void fax(String value) {
		setConstString(offset + 14, $fax, value);
	}


	/**
	 *  法人番号.<p>
	 *
	 */
	public String ein() {
		return getConstString(offset + 15, $ein);
	}

	/**
	 *  法人番号.<p>
	 *
	 */
	public void ein(String value) {
		setConstString(offset + 15, $ein, value);
	}


	/**
	 *  標準企業コード.<p>
	 *
	 */
	public String std_co_cd() {
		return getConstString(offset + 16, $std_co_cd);
	}

	/**
	 *  標準企業コード.<p>
	 *
	 */
	public void std_co_cd(String value) {
		setConstString(offset + 16, $std_co_cd, value);
	}


	/**
	 *  国ＣＤ.<p>
	 *
	 */
	public String cntry_cd() {
		return getConstString(offset + 17, $cntry_cd);
	}

	/**
	 *  国ＣＤ.<p>
	 *
	 */
	public void cntry_cd(String value) {
		setConstString(offset + 17, $cntry_cd, value);
	}


	/**
	 *  地域ＣＤ.<p>
	 *
	 */
	public String area_cd() {
		return getConstString(offset + 18, $area_cd);
	}

	/**
	 *  地域ＣＤ.<p>
	 *
	 */
	public void area_cd(String value) {
		setConstString(offset + 18, $area_cd, value);
	}


	/**
	 *  通貨ＣＤ.<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 19, $cur_cd);
	}

	/**
	 *  通貨ＣＤ.<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 19, $cur_cd, value);
	}


	/**
	 *  帳票出力ロケールＣＤ.<p>
	 *
	 */
	public String prnt_lcl_cd() {
		return getConstString(offset + 20, $prnt_lcl_cd);
	}

	/**
	 *  帳票出力ロケールＣＤ.<p>
	 *
	 */
	public void prnt_lcl_cd(String value) {
		setConstString(offset + 20, $prnt_lcl_cd, value);
	}


	/**
	 *  取引先分類ＣＤ１.<p>
	 *
	 */
	public String bp_grp_cd1() {
		return getConstString(offset + 21, $bp_grp_cd1);
	}

	/**
	 *  取引先分類ＣＤ１.<p>
	 *
	 */
	public void bp_grp_cd1(String value) {
		setConstString(offset + 21, $bp_grp_cd1, value);
	}


	/**
	 *  取引先分類ＣＤ２.<p>
	 *
	 */
	public String bp_grp_cd2() {
		return getConstString(offset + 22, $bp_grp_cd2);
	}

	/**
	 *  取引先分類ＣＤ２.<p>
	 *
	 */
	public void bp_grp_cd2(String value) {
		setConstString(offset + 22, $bp_grp_cd2, value);
	}


	/**
	 *  取引先分類ＣＤ３.<p>
	 *
	 */
	public String bp_grp_cd3() {
		return getConstString(offset + 23, $bp_grp_cd3);
	}

	/**
	 *  取引先分類ＣＤ３.<p>
	 *
	 */
	public void bp_grp_cd3(String value) {
		setConstString(offset + 23, $bp_grp_cd3, value);
	}


	/**
	 *  取引先分類ＣＤ４.<p>
	 *
	 */
	public String bp_grp_cd4() {
		return getConstString(offset + 24, $bp_grp_cd4);
	}

	/**
	 *  取引先分類ＣＤ４.<p>
	 *
	 */
	public void bp_grp_cd4(String value) {
		setConstString(offset + 24, $bp_grp_cd4, value);
	}


	/**
	 *  取引先分類ＣＤ５.<p>
	 *
	 */
	public String bp_grp_cd5() {
		return getConstString(offset + 25, $bp_grp_cd5);
	}

	/**
	 *  取引先分類ＣＤ５.<p>
	 *
	 */
	public void bp_grp_cd5(String value) {
		setConstString(offset + 25, $bp_grp_cd5, value);
	}


	/**
	 *  取引先分類ＣＤ６.<p>
	 *
	 */
	public String bp_grp_cd6() {
		return getConstString(offset + 26, $bp_grp_cd6);
	}

	/**
	 *  取引先分類ＣＤ６.<p>
	 *
	 */
	public void bp_grp_cd6(String value) {
		setConstString(offset + 26, $bp_grp_cd6, value);
	}


	/**
	 *  取引先分類ＣＤ７.<p>
	 *
	 */
	public String bp_grp_cd7() {
		return getConstString(offset + 27, $bp_grp_cd7);
	}

	/**
	 *  取引先分類ＣＤ７.<p>
	 *
	 */
	public void bp_grp_cd7(String value) {
		setConstString(offset + 27, $bp_grp_cd7, value);
	}


	/**
	 *  取引先分類ＣＤ８.<p>
	 *
	 */
	public String bp_grp_cd8() {
		return getConstString(offset + 28, $bp_grp_cd8);
	}

	/**
	 *  取引先分類ＣＤ８.<p>
	 *
	 */
	public void bp_grp_cd8(String value) {
		setConstString(offset + 28, $bp_grp_cd8, value);
	}


	/**
	 *  取引先分類ＣＤ９.<p>
	 *
	 */
	public String bp_grp_cd9() {
		return getConstString(offset + 29, $bp_grp_cd9);
	}

	/**
	 *  取引先分類ＣＤ９.<p>
	 *
	 */
	public void bp_grp_cd9(String value) {
		setConstString(offset + 29, $bp_grp_cd9, value);
	}


	/**
	 *  取引先分類ＣＤ１０.<p>
	 *
	 */
	public String bp_grp_cd10() {
		return getConstString(offset + 30, $bp_grp_cd10);
	}

	/**
	 *  取引先分類ＣＤ１０.<p>
	 *
	 */
	public void bp_grp_cd10(String value) {
		setConstString(offset + 30, $bp_grp_cd10, value);
	}


	/**
	 *  取引先配賦グループ.<p>
	 *
	 */
	public String bp_alc_grp() {
		return getConstString(offset + 31, $bp_alc_grp);
	}

	/**
	 *  取引先配賦グループ.<p>
	 *
	 */
	public void bp_alc_grp(String value) {
		setConstString(offset + 31, $bp_alc_grp, value);
	}


	/**
	 *  得意先ＦＬＧ.<p>
	 *
	 */
	public boolean cst_flg() {
		return getConstBoolean(offset + 32, $cst_flg);
	}

	/**
	 *  得意先ＦＬＧ.<p>
	 *
	 */
	public void cst_flg(boolean value) {
		setConstBoolean(offset + 32, $cst_flg, value);
	}


	/**
	 *  売掛先ＦＬＧ.<p>
	 *
	 */
	public boolean acst_flg() {
		return getConstBoolean(offset + 33, $acst_flg);
	}

	/**
	 *  売掛先ＦＬＧ.<p>
	 *
	 */
	public void acst_flg(boolean value) {
		setConstBoolean(offset + 33, $acst_flg, value);
	}


	/**
	 *  請求先ＦＬＧ.<p>
	 *
	 */
	public boolean bcst_flg() {
		return getConstBoolean(offset + 34, $bcst_flg);
	}

	/**
	 *  請求先ＦＬＧ.<p>
	 *
	 */
	public void bcst_flg(boolean value) {
		setConstBoolean(offset + 34, $bcst_flg, value);
	}


	/**
	 *  入金先ＦＬＧ.<p>
	 *
	 */
	public boolean rcst_flg() {
		return getConstBoolean(offset + 35, $rcst_flg);
	}

	/**
	 *  入金先ＦＬＧ.<p>
	 *
	 */
	public void rcst_flg(boolean value) {
		setConstBoolean(offset + 35, $rcst_flg, value);
	}


	/**
	 *  発注先ＦＬＧ.<p>
	 *
	 */
	public boolean sppl_flg() {
		return getConstBoolean(offset + 36, $sppl_flg);
	}

	/**
	 *  発注先ＦＬＧ.<p>
	 *
	 */
	public void sppl_flg(boolean value) {
		setConstBoolean(offset + 36, $sppl_flg, value);
	}


	/**
	 *  買掛先ＦＬＧ.<p>
	 *
	 */
	public boolean asppl_flg() {
		return getConstBoolean(offset + 37, $asppl_flg);
	}

	/**
	 *  買掛先ＦＬＧ.<p>
	 *
	 */
	public void asppl_flg(boolean value) {
		setConstBoolean(offset + 37, $asppl_flg, value);
	}


	/**
	 *  支払予定管理先ＦＬＧ.<p>
	 *
	 */
	public boolean bsppl_flg() {
		return getConstBoolean(offset + 38, $bsppl_flg);
	}

	/**
	 *  支払予定管理先ＦＬＧ.<p>
	 *
	 */
	public void bsppl_flg(boolean value) {
		setConstBoolean(offset + 38, $bsppl_flg, value);
	}


	/**
	 *  支払先ＦＬＧ.<p>
	 *
	 */
	public boolean psppl_flg() {
		return getConstBoolean(offset + 39, $psppl_flg);
	}

	/**
	 *  支払先ＦＬＧ.<p>
	 *
	 */
	public void psppl_flg(boolean value) {
		setConstBoolean(offset + 39, $psppl_flg, value);
	}


	/**
	 *  与信管理先ＦＬＧ.<p>
	 *
	 */
	public boolean cred_flg() {
		return getConstBoolean(offset + 40, $cred_flg);
	}

	/**
	 *  与信管理先ＦＬＧ.<p>
	 *
	 */
	public void cred_flg(boolean value) {
		setConstBoolean(offset + 40, $cred_flg, value);
	}


	/**
	 *  納品先ＦＬＧ.<p>
	 *
	 */
	public boolean dlv_flg() {
		return getConstBoolean(offset + 41, $dlv_flg);
	}

	/**
	 *  納品先ＦＬＧ.<p>
	 *
	 */
	public void dlv_flg(boolean value) {
		setConstBoolean(offset + 41, $dlv_flg, value);
	}


	/**
	 *  メーカＦＬＧ.<p>
	 *
	 */
	public boolean maker_flg() {
		return getConstBoolean(offset + 42, $maker_flg);
	}

	/**
	 *  メーカＦＬＧ.<p>
	 *
	 */
	public void maker_flg(boolean value) {
		setConstBoolean(offset + 42, $maker_flg, value);
	}


	/**
	 *  仕向先ＦＬＧ.<p>
	 *
	 */
	public boolean dest_flg() {
		return getConstBoolean(offset + 43, $dest_flg);
	}

	/**
	 *  仕向先ＦＬＧ.<p>
	 *
	 */
	public void dest_flg(boolean value) {
		setConstBoolean(offset + 43, $dest_flg, value);
	}


	/**
	 *  買掛先ＣＤ.<p>
	 *
	 */
	public String asppl_cd() {
		return getConstString(offset + 44, $asppl_cd);
	}

	/**
	 *  買掛先ＣＤ.<p>
	 *
	 */
	public void asppl_cd(String value) {
		setConstString(offset + 44, $asppl_cd, value);
	}


	/**
	 *  下請対象ＦＬＧ.<p>
	 *
	 */
	public boolean subcon_flg() {
		return getConstBoolean(offset + 45, $subcon_flg);
	}

	/**
	 *  下請対象ＦＬＧ.<p>
	 *
	 */
	public void subcon_flg(boolean value) {
		setConstBoolean(offset + 45, $subcon_flg, value);
	}


	/**
	 *  注文書表示ＣＤ.<p>
	 *
	 */
	public String po_print_cd() {
		return getConstString(offset + 46, $po_print_cd);
	}

	/**
	 *  注文書表示ＣＤ.<p>
	 *
	 */
	public void po_print_cd(String value) {
		setConstString(offset + 46, $po_print_cd, value);
	}


	/**
	 *  発注先納品書ＣＤ.<p>
	 *
	 */
	public String sppl_ship_form_cd() {
		return getConstString(offset + 47, $sppl_ship_form_cd);
	}

	/**
	 *  発注先納品書ＣＤ.<p>
	 *
	 */
	public void sppl_ship_form_cd(String value) {
		setConstString(offset + 47, $sppl_ship_form_cd, value);
	}


	/**
	 *  支払繰越回数.<p>
	 *
	 */
	public MCNumber pay_crryovr_times() {
		return getConstNumber(offset + 48, $pay_crryovr_times);
	}

	/**
	 *  支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(MCNumber value) {
		setConstNumber(offset + 48, $pay_crryovr_times, value);
	}

	/**
	 *  支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(int value) {
		setConstNumber(offset + 48, $pay_crryovr_times, value);
	}

	/**
	 *  支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(long value) {
		setConstNumber(offset + 48, $pay_crryovr_times, value);
	}

	/**
	 *  支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(float value) {
		setConstNumber(offset + 48, $pay_crryovr_times, value);
	}

	/**
	 *  支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(double value) {
		setConstNumber(offset + 48, $pay_crryovr_times, value);
	}


	/**
	 *  発注先部署.<p>
	 *
	 */
	public String sppl_cntct_dpt() {
		return getConstString(offset + 49, $sppl_cntct_dpt);
	}

	/**
	 *  発注先部署.<p>
	 *
	 */
	public void sppl_cntct_dpt(String value) {
		setConstString(offset + 49, $sppl_cntct_dpt, value);
	}


	/**
	 *  発注先担当者.<p>
	 *
	 */
	public String sppl_cntct_psn() {
		return getConstString(offset + 50, $sppl_cntct_psn);
	}

	/**
	 *  発注先担当者.<p>
	 *
	 */
	public void sppl_cntct_psn(String value) {
		setConstString(offset + 50, $sppl_cntct_psn, value);
	}


	/**
	 *  発注先担当者敬称.<p>
	 *
	 */
	public String sppl_cntct_psn_title() {
		return getConstString(offset + 51, $sppl_cntct_psn_title);
	}

	/**
	 *  発注先担当者敬称.<p>
	 *
	 */
	public void sppl_cntct_psn_title(String value) {
		setConstString(offset + 51, $sppl_cntct_psn_title, value);
	}


	/**
	 *  購買単価取得区分.<p>
	 *
	 */
	public String purc_upri_req_typ() {
		return getConstString(offset + 52, $purc_upri_req_typ);
	}

	/**
	 *  購買単価取得区分.<p>
	 *
	 */
	public void purc_upri_req_typ(String value) {
		setConstString(offset + 52, $purc_upri_req_typ, value);
	}


	/**
	 *  購買単価変更許可ＦＬＧ.<p>
	 *
	 */
	public boolean purc_upri_cng_flg() {
		return getConstBoolean(offset + 53, $purc_upri_cng_flg);
	}

	/**
	 *  購買単価変更許可ＦＬＧ.<p>
	 *
	 */
	public void purc_upri_cng_flg(boolean value) {
		setConstBoolean(offset + 53, $purc_upri_cng_flg, value);
	}


	/**
	 *  仕入金額端数処理区分.<p>
	 *
	 */
	public String purc_amt_rnd_typ() {
		return getConstString(offset + 54, $purc_amt_rnd_typ);
	}

	/**
	 *  仕入金額端数処理区分.<p>
	 *
	 */
	public void purc_amt_rnd_typ(String value) {
		setConstString(offset + 54, $purc_amt_rnd_typ, value);
	}


	/**
	 *  仕入税額端数処理区分.<p>
	 *
	 */
	public String purc_tax_rnd_typ() {
		return getConstString(offset + 55, $purc_tax_rnd_typ);
	}

	/**
	 *  仕入税額端数処理区分.<p>
	 *
	 */
	public void purc_tax_rnd_typ(String value) {
		setConstString(offset + 55, $purc_tax_rnd_typ, value);
	}


	/**
	 *  仕入税計算区分.<p>
	 *
	 */
	public String purc_tax_calc_typ() {
		return getConstString(offset + 56, $purc_tax_calc_typ);
	}

	/**
	 *  仕入税計算区分.<p>
	 *
	 */
	public void purc_tax_calc_typ(String value) {
		setConstString(offset + 56, $purc_tax_calc_typ, value);
	}


	/**
	 *  仕入税ＣＤ.<p>
	 *
	 */
	public String purc_tax_cd() {
		return getConstString(offset + 57, $purc_tax_cd);
	}

	/**
	 *  仕入税ＣＤ.<p>
	 *
	 */
	public void purc_tax_cd(String value) {
		setConstString(offset + 57, $purc_tax_cd, value);
	}


	/**
	 *  仕入税優先ＦＬＧ.<p>
	 *
	 */
	public boolean purc_tax_cd_prio_flg() {
		return getConstBoolean(offset + 58, $purc_tax_cd_prio_flg);
	}

	/**
	 *  仕入税優先ＦＬＧ.<p>
	 *
	 */
	public void purc_tax_cd_prio_flg(boolean value) {
		setConstBoolean(offset + 58, $purc_tax_cd_prio_flg, value);
	}


	/**
	 *  案件別注文書ＦＬＧ.<p>
	 *
	 */
	public boolean wrk_po_flg() {
		return getConstBoolean(offset + 59, $wrk_po_flg);
	}

	/**
	 *  案件別注文書ＦＬＧ.<p>
	 *
	 */
	public void wrk_po_flg(boolean value) {
		setConstBoolean(offset + 59, $wrk_po_flg, value);
	}


	/**
	 *  案件別債務管理ＦＬＧ.<p>
	 *
	 */
	public boolean wrk_ap_flg() {
		return getConstBoolean(offset + 60, $wrk_ap_flg);
	}

	/**
	 *  案件別債務管理ＦＬＧ.<p>
	 *
	 */
	public void wrk_ap_flg(boolean value) {
		setConstBoolean(offset + 60, $wrk_ap_flg, value);
	}


	/**
	 *  仕入ロット明細分割区分.<p>
	 *
	 */
	public String purc_slip_each_lot_typ() {
		return getConstString(offset + 61, $purc_slip_each_lot_typ);
	}

	/**
	 *  仕入ロット明細分割区分.<p>
	 *
	 */
	public void purc_slip_each_lot_typ(String value) {
		setConstString(offset + 61, $purc_slip_each_lot_typ, value);
	}


	/**
	 *  支給積送管理区分.<p>
	 *
	 */
	public String prov_rcv_typ() {
		return getConstString(offset + 62, $prov_rcv_typ);
	}

	/**
	 *  支給積送管理区分.<p>
	 *
	 */
	public void prov_rcv_typ(String value) {
		setConstString(offset + 62, $prov_rcv_typ, value);
	}


	/**
	 *  有償支給先ＦＬＧ.<p>
	 *
	 */
	public boolean onr_prsppl_flg() {
		return getConstBoolean(offset + 63, $onr_prsppl_flg);
	}

	/**
	 *  有償支給先ＦＬＧ.<p>
	 *
	 */
	public void onr_prsppl_flg(boolean value) {
		setConstBoolean(offset + 63, $onr_prsppl_flg, value);
	}


	/**
	 *  買戻義務ＦＬＧ.<p>
	 *
	 */
	public boolean repurc_obli_flg() {
		return getConstBoolean(offset + 64, $repurc_obli_flg);
	}

	/**
	 *  買戻義務ＦＬＧ.<p>
	 *
	 */
	public void repurc_obli_flg(boolean value) {
		setConstBoolean(offset + 64, $repurc_obli_flg, value);
	}


	/**
	 *  支給計上区分.<p>
	 *
	 */
	public String prov_basis_typ() {
		return getConstString(offset + 65, $prov_basis_typ);
	}

	/**
	 *  支給計上区分.<p>
	 *
	 */
	public void prov_basis_typ(String value) {
		setConstString(offset + 65, $prov_basis_typ, value);
	}


	/**
	 *  支給単価変更許可ＦＬＧ.<p>
	 *
	 */
	public boolean prov_upri_cng_flg() {
		return getConstBoolean(offset + 66, $prov_upri_cng_flg);
	}

	/**
	 *  支給単価変更許可ＦＬＧ.<p>
	 *
	 */
	public void prov_upri_cng_flg(boolean value) {
		setConstBoolean(offset + 66, $prov_upri_cng_flg, value);
	}


	/**
	 *  支給金額端数処理区分.<p>
	 *
	 */
	public String prov_amt_rnd_typ() {
		return getConstString(offset + 67, $prov_amt_rnd_typ);
	}

	/**
	 *  支給金額端数処理区分.<p>
	 *
	 */
	public void prov_amt_rnd_typ(String value) {
		setConstString(offset + 67, $prov_amt_rnd_typ, value);
	}


	/**
	 *  支給税額端数処理区分.<p>
	 *
	 */
	public String prov_tax_rnd_typ() {
		return getConstString(offset + 68, $prov_tax_rnd_typ);
	}

	/**
	 *  支給税額端数処理区分.<p>
	 *
	 */
	public void prov_tax_rnd_typ(String value) {
		setConstString(offset + 68, $prov_tax_rnd_typ, value);
	}


	/**
	 *  支給税計算区分.<p>
	 *
	 */
	public String prov_tax_calc_typ() {
		return getConstString(offset + 69, $prov_tax_calc_typ);
	}

	/**
	 *  支給税計算区分.<p>
	 *
	 */
	public void prov_tax_calc_typ(String value) {
		setConstString(offset + 69, $prov_tax_calc_typ, value);
	}


	/**
	 *  支給税ＣＤ.<p>
	 *
	 */
	public String prov_tax_cd() {
		return getConstString(offset + 70, $prov_tax_cd);
	}

	/**
	 *  支給税ＣＤ.<p>
	 *
	 */
	public void prov_tax_cd(String value) {
		setConstString(offset + 70, $prov_tax_cd, value);
	}


	/**
	 *  支給税優先ＦＬＧ.<p>
	 *
	 */
	public boolean prov_tax_cd_prio_flg() {
		return getConstBoolean(offset + 71, $prov_tax_cd_prio_flg);
	}

	/**
	 *  支給税優先ＦＬＧ.<p>
	 *
	 */
	public void prov_tax_cd_prio_flg(boolean value) {
		setConstBoolean(offset + 71, $prov_tax_cd_prio_flg, value);
	}


	/**
	 *  発注先カレンダＣＤ.<p>
	 *
	 */
	public String sppl_cal_cd() {
		return getConstString(offset + 72, $sppl_cal_cd);
	}

	/**
	 *  発注先カレンダＣＤ.<p>
	 *
	 */
	public void sppl_cal_cd(String value) {
		setConstString(offset + 72, $sppl_cal_cd, value);
	}


	/**
	 *  発注先インボイス取引ＦＬＧ.<p>
	 *
	 */
	public boolean sppl_iv_flg() {
		return getConstBoolean(offset + 73, $sppl_iv_flg);
	}

	/**
	 *  発注先インボイス取引ＦＬＧ.<p>
	 *
	 */
	public void sppl_iv_flg(boolean value) {
		setConstBoolean(offset + 73, $sppl_iv_flg, value);
	}


	/**
	 *  納期回答確認ＦＬＧ.<p>
	 *
	 */
	public boolean prms_recv_flg() {
		return getConstBoolean(offset + 74, $prms_recv_flg);
	}

	/**
	 *  納期回答確認ＦＬＧ.<p>
	 *
	 */
	public void prms_recv_flg(boolean value) {
		setConstBoolean(offset + 74, $prms_recv_flg, value);
	}


	/**
	 *  発注先取引条件ＣＤ１.<p>
	 *
	 */
	public String sppl_tterm_cd1() {
		return getConstString(offset + 75, $sppl_tterm_cd1);
	}

	/**
	 *  発注先取引条件ＣＤ１.<p>
	 *
	 */
	public void sppl_tterm_cd1(String value) {
		setConstString(offset + 75, $sppl_tterm_cd1, value);
	}


	/**
	 *  発注先取引条件ＣＤ２.<p>
	 *
	 */
	public String sppl_tterm_cd2() {
		return getConstString(offset + 76, $sppl_tterm_cd2);
	}

	/**
	 *  発注先取引条件ＣＤ２.<p>
	 *
	 */
	public void sppl_tterm_cd2(String value) {
		setConstString(offset + 76, $sppl_tterm_cd2, value);
	}


	/**
	 *  発注先取引条件ＣＤ３.<p>
	 *
	 */
	public String sppl_tterm_cd3() {
		return getConstString(offset + 77, $sppl_tterm_cd3);
	}

	/**
	 *  発注先取引条件ＣＤ３.<p>
	 *
	 */
	public void sppl_tterm_cd3(String value) {
		setConstString(offset + 77, $sppl_tterm_cd3, value);
	}


	/**
	 *  支払予定管理先ＣＤ.<p>
	 *
	 */
	public String bsppl_cd() {
		return getConstString(offset + 78, $bsppl_cd);
	}

	/**
	 *  支払予定管理先ＣＤ.<p>
	 *
	 */
	public void bsppl_cd(String value) {
		setConstString(offset + 78, $bsppl_cd, value);
	}


	/**
	 *  メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 79, $memo1);
	}

	/**
	 *  メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 79, $memo1, value);
	}


	/**
	 *  メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 80, $memo2);
	}

	/**
	 *  メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 80, $memo2, value);
	}


	/**
	 *  メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 81, $memo3);
	}

	/**
	 *  メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 81, $memo3, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public String if_sub_char1() {
		return getConstString(offset + 82, $if_sub_char1);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public void if_sub_char1(String value) {
		setConstString(offset + 82, $if_sub_char1, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public String if_sub_char2() {
		return getConstString(offset + 83, $if_sub_char2);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public void if_sub_char2(String value) {
		setConstString(offset + 83, $if_sub_char2, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public String if_sub_char3() {
		return getConstString(offset + 84, $if_sub_char3);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public void if_sub_char3(String value) {
		setConstString(offset + 84, $if_sub_char3, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public String if_sub_char4() {
		return getConstString(offset + 85, $if_sub_char4);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public void if_sub_char4(String value) {
		setConstString(offset + 85, $if_sub_char4, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public String if_sub_char5() {
		return getConstString(offset + 86, $if_sub_char5);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public void if_sub_char5(String value) {
		setConstString(offset + 86, $if_sub_char5, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目６.<p>
	 *
	 */
	public String if_sub_char6() {
		return getConstString(offset + 87, $if_sub_char6);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目６.<p>
	 *
	 */
	public void if_sub_char6(String value) {
		setConstString(offset + 87, $if_sub_char6, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目７.<p>
	 *
	 */
	public String if_sub_char7() {
		return getConstString(offset + 88, $if_sub_char7);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目７.<p>
	 *
	 */
	public void if_sub_char7(String value) {
		setConstString(offset + 88, $if_sub_char7, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目８.<p>
	 *
	 */
	public String if_sub_char8() {
		return getConstString(offset + 89, $if_sub_char8);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目８.<p>
	 *
	 */
	public void if_sub_char8(String value) {
		setConstString(offset + 89, $if_sub_char8, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目９.<p>
	 *
	 */
	public String if_sub_char9() {
		return getConstString(offset + 90, $if_sub_char9);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目９.<p>
	 *
	 */
	public void if_sub_char9(String value) {
		setConstString(offset + 90, $if_sub_char9, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目１０.<p>
	 *
	 */
	public String if_sub_char10() {
		return getConstString(offset + 91, $if_sub_char10);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目１０.<p>
	 *
	 */
	public void if_sub_char10(String value) {
		setConstString(offset + 91, $if_sub_char10, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目１１.<p>
	 *
	 */
	public String if_sub_char11() {
		return getConstString(offset + 92, $if_sub_char11);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目１１.<p>
	 *
	 */
	public void if_sub_char11(String value) {
		setConstString(offset + 92, $if_sub_char11, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目１２.<p>
	 *
	 */
	public String if_sub_char12() {
		return getConstString(offset + 93, $if_sub_char12);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目１２.<p>
	 *
	 */
	public void if_sub_char12(String value) {
		setConstString(offset + 93, $if_sub_char12, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目１３.<p>
	 *
	 */
	public String if_sub_char13() {
		return getConstString(offset + 94, $if_sub_char13);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目１３.<p>
	 *
	 */
	public void if_sub_char13(String value) {
		setConstString(offset + 94, $if_sub_char13, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目１４.<p>
	 *
	 */
	public String if_sub_char14() {
		return getConstString(offset + 95, $if_sub_char14);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目１４.<p>
	 *
	 */
	public void if_sub_char14(String value) {
		setConstString(offset + 95, $if_sub_char14, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目１５.<p>
	 *
	 */
	public String if_sub_char15() {
		return getConstString(offset + 96, $if_sub_char15);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目１５.<p>
	 *
	 */
	public void if_sub_char15(String value) {
		setConstString(offset + 96, $if_sub_char15, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目１６.<p>
	 *
	 */
	public String if_sub_char16() {
		return getConstString(offset + 97, $if_sub_char16);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目１６.<p>
	 *
	 */
	public void if_sub_char16(String value) {
		setConstString(offset + 97, $if_sub_char16, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目１７.<p>
	 *
	 */
	public String if_sub_char17() {
		return getConstString(offset + 98, $if_sub_char17);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目１７.<p>
	 *
	 */
	public void if_sub_char17(String value) {
		setConstString(offset + 98, $if_sub_char17, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目１８.<p>
	 *
	 */
	public String if_sub_char18() {
		return getConstString(offset + 99, $if_sub_char18);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目１８.<p>
	 *
	 */
	public void if_sub_char18(String value) {
		setConstString(offset + 99, $if_sub_char18, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目１９.<p>
	 *
	 */
	public String if_sub_char19() {
		return getConstString(offset + 100, $if_sub_char19);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目１９.<p>
	 *
	 */
	public void if_sub_char19(String value) {
		setConstString(offset + 100, $if_sub_char19, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目２０.<p>
	 *
	 */
	public String if_sub_char20() {
		return getConstString(offset + 101, $if_sub_char20);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目２０.<p>
	 *
	 */
	public void if_sub_char20(String value) {
		setConstString(offset + 101, $if_sub_char20, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目２１.<p>
	 *
	 */
	public String if_sub_char21() {
		return getConstString(offset + 102, $if_sub_char21);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目２１.<p>
	 *
	 */
	public void if_sub_char21(String value) {
		setConstString(offset + 102, $if_sub_char21, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目２２.<p>
	 *
	 */
	public String if_sub_char22() {
		return getConstString(offset + 103, $if_sub_char22);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目２２.<p>
	 *
	 */
	public void if_sub_char22(String value) {
		setConstString(offset + 103, $if_sub_char22, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目２３.<p>
	 *
	 */
	public String if_sub_char23() {
		return getConstString(offset + 104, $if_sub_char23);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目２３.<p>
	 *
	 */
	public void if_sub_char23(String value) {
		setConstString(offset + 104, $if_sub_char23, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目２４.<p>
	 *
	 */
	public String if_sub_char24() {
		return getConstString(offset + 105, $if_sub_char24);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目２４.<p>
	 *
	 */
	public void if_sub_char24(String value) {
		setConstString(offset + 105, $if_sub_char24, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目２５.<p>
	 *
	 */
	public String if_sub_char25() {
		return getConstString(offset + 106, $if_sub_char25);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目２５.<p>
	 *
	 */
	public void if_sub_char25(String value) {
		setConstString(offset + 106, $if_sub_char25, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目２６.<p>
	 *
	 */
	public String if_sub_char26() {
		return getConstString(offset + 107, $if_sub_char26);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目２６.<p>
	 *
	 */
	public void if_sub_char26(String value) {
		setConstString(offset + 107, $if_sub_char26, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目２７.<p>
	 *
	 */
	public String if_sub_char27() {
		return getConstString(offset + 108, $if_sub_char27);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目２７.<p>
	 *
	 */
	public void if_sub_char27(String value) {
		setConstString(offset + 108, $if_sub_char27, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目２８.<p>
	 *
	 */
	public String if_sub_char28() {
		return getConstString(offset + 109, $if_sub_char28);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目２８.<p>
	 *
	 */
	public void if_sub_char28(String value) {
		setConstString(offset + 109, $if_sub_char28, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目２９.<p>
	 *
	 */
	public String if_sub_char29() {
		return getConstString(offset + 110, $if_sub_char29);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目２９.<p>
	 *
	 */
	public void if_sub_char29(String value) {
		setConstString(offset + 110, $if_sub_char29, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目３０.<p>
	 *
	 */
	public String if_sub_char30() {
		return getConstString(offset + 111, $if_sub_char30);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目３０.<p>
	 *
	 */
	public void if_sub_char30(String value) {
		setConstString(offset + 111, $if_sub_char30, value);
	}


	/**
	 *  ＩＦ予備ＮＵＭ項目１.<p>
	 *
	 */
	public MCNumber if_sub_num1() {
		return getConstNumber(offset + 112, $if_sub_num1);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目１.<p>
	 *
	 */
	public void if_sub_num1(MCNumber value) {
		setConstNumber(offset + 112, $if_sub_num1, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目１.<p>
	 *
	 */
	public void if_sub_num1(int value) {
		setConstNumber(offset + 112, $if_sub_num1, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目１.<p>
	 *
	 */
	public void if_sub_num1(long value) {
		setConstNumber(offset + 112, $if_sub_num1, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目１.<p>
	 *
	 */
	public void if_sub_num1(float value) {
		setConstNumber(offset + 112, $if_sub_num1, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目１.<p>
	 *
	 */
	public void if_sub_num1(double value) {
		setConstNumber(offset + 112, $if_sub_num1, value);
	}


	/**
	 *  ＩＦ予備ＮＵＭ項目２.<p>
	 *
	 */
	public MCNumber if_sub_num2() {
		return getConstNumber(offset + 113, $if_sub_num2);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目２.<p>
	 *
	 */
	public void if_sub_num2(MCNumber value) {
		setConstNumber(offset + 113, $if_sub_num2, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目２.<p>
	 *
	 */
	public void if_sub_num2(int value) {
		setConstNumber(offset + 113, $if_sub_num2, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目２.<p>
	 *
	 */
	public void if_sub_num2(long value) {
		setConstNumber(offset + 113, $if_sub_num2, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目２.<p>
	 *
	 */
	public void if_sub_num2(float value) {
		setConstNumber(offset + 113, $if_sub_num2, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目２.<p>
	 *
	 */
	public void if_sub_num2(double value) {
		setConstNumber(offset + 113, $if_sub_num2, value);
	}


	/**
	 *  ＩＦ予備ＮＵＭ項目３.<p>
	 *
	 */
	public MCNumber if_sub_num3() {
		return getConstNumber(offset + 114, $if_sub_num3);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目３.<p>
	 *
	 */
	public void if_sub_num3(MCNumber value) {
		setConstNumber(offset + 114, $if_sub_num3, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目３.<p>
	 *
	 */
	public void if_sub_num3(int value) {
		setConstNumber(offset + 114, $if_sub_num3, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目３.<p>
	 *
	 */
	public void if_sub_num3(long value) {
		setConstNumber(offset + 114, $if_sub_num3, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目３.<p>
	 *
	 */
	public void if_sub_num3(float value) {
		setConstNumber(offset + 114, $if_sub_num3, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目３.<p>
	 *
	 */
	public void if_sub_num3(double value) {
		setConstNumber(offset + 114, $if_sub_num3, value);
	}


	/**
	 *  ＩＦ予備ＮＵＭ項目４.<p>
	 *
	 */
	public MCNumber if_sub_num4() {
		return getConstNumber(offset + 115, $if_sub_num4);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目４.<p>
	 *
	 */
	public void if_sub_num4(MCNumber value) {
		setConstNumber(offset + 115, $if_sub_num4, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目４.<p>
	 *
	 */
	public void if_sub_num4(int value) {
		setConstNumber(offset + 115, $if_sub_num4, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目４.<p>
	 *
	 */
	public void if_sub_num4(long value) {
		setConstNumber(offset + 115, $if_sub_num4, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目４.<p>
	 *
	 */
	public void if_sub_num4(float value) {
		setConstNumber(offset + 115, $if_sub_num4, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目４.<p>
	 *
	 */
	public void if_sub_num4(double value) {
		setConstNumber(offset + 115, $if_sub_num4, value);
	}


	/**
	 *  ＩＦ予備ＮＵＭ項目５.<p>
	 *
	 */
	public MCNumber if_sub_num5() {
		return getConstNumber(offset + 116, $if_sub_num5);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目５.<p>
	 *
	 */
	public void if_sub_num5(MCNumber value) {
		setConstNumber(offset + 116, $if_sub_num5, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目５.<p>
	 *
	 */
	public void if_sub_num5(int value) {
		setConstNumber(offset + 116, $if_sub_num5, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目５.<p>
	 *
	 */
	public void if_sub_num5(long value) {
		setConstNumber(offset + 116, $if_sub_num5, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目５.<p>
	 *
	 */
	public void if_sub_num5(float value) {
		setConstNumber(offset + 116, $if_sub_num5, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目５.<p>
	 *
	 */
	public void if_sub_num5(double value) {
		setConstNumber(offset + 116, $if_sub_num5, value);
	}


	/**
	 *  ＩＦ予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public MCDate if_sub_dt1() {
		return getConstDate(offset + 117, $if_sub_dt1);
	}

	/**
	 *  ＩＦ予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public void if_sub_dt1(MCDate value) {
		setConstDate(offset + 117, $if_sub_dt1, value);
	}


	/**
	 *  ＩＦ予備ＤＡＴＥ項目２.<p>
	 *
	 */
	public MCDate if_sub_dt2() {
		return getConstDate(offset + 118, $if_sub_dt2);
	}

	/**
	 *  ＩＦ予備ＤＡＴＥ項目２.<p>
	 *
	 */
	public void if_sub_dt2(MCDate value) {
		setConstDate(offset + 118, $if_sub_dt2, value);
	}


	/**
	 *  ＩＦ予備ＤＡＴＥ項目３.<p>
	 *
	 */
	public MCDate if_sub_dt3() {
		return getConstDate(offset + 119, $if_sub_dt3);
	}

	/**
	 *  ＩＦ予備ＤＡＴＥ項目３.<p>
	 *
	 */
	public void if_sub_dt3(MCDate value) {
		setConstDate(offset + 119, $if_sub_dt3, value);
	}


	/**
	 *  ＩＦ予備ＤＡＴＥ項目４.<p>
	 *
	 */
	public MCDate if_sub_dt4() {
		return getConstDate(offset + 120, $if_sub_dt4);
	}

	/**
	 *  ＩＦ予備ＤＡＴＥ項目４.<p>
	 *
	 */
	public void if_sub_dt4(MCDate value) {
		setConstDate(offset + 120, $if_sub_dt4, value);
	}


	/**
	 *  ＩＦ予備ＤＡＴＥ項目５.<p>
	 *
	 */
	public MCDate if_sub_dt5() {
		return getConstDate(offset + 121, $if_sub_dt5);
	}

	/**
	 *  ＩＦ予備ＤＡＴＥ項目５.<p>
	 *
	 */
	public void if_sub_dt5(MCDate value) {
		setConstDate(offset + 121, $if_sub_dt5, value);
	}


	/**
	 *  メモ４.<p>
	 *
	 */
	public String memo4() {
		return getConstString(offset + 122, $memo4);
	}

	/**
	 *  メモ４.<p>
	 *
	 */
	public void memo4(String value) {
		setConstString(offset + 122, $memo4, value);
	}


	/**
	 *  メモ５.<p>
	 *
	 */
	public String memo5() {
		return getConstString(offset + 123, $memo5);
	}

	/**
	 *  メモ５.<p>
	 *
	 */
	public void memo5(String value) {
		setConstString(offset + 123, $memo5, value);
	}


	/**
	 *  メモ６.<p>
	 *
	 */
	public String memo6() {
		return getConstString(offset + 124, $memo6);
	}

	/**
	 *  メモ６.<p>
	 *
	 */
	public void memo6(String value) {
		setConstString(offset + 124, $memo6, value);
	}


	/**
	 *  メモ７.<p>
	 *
	 */
	public String memo7() {
		return getConstString(offset + 125, $memo7);
	}

	/**
	 *  メモ７.<p>
	 *
	 */
	public void memo7(String value) {
		setConstString(offset + 125, $memo7, value);
	}


	/**
	 *  メモ８.<p>
	 *
	 */
	public String memo8() {
		return getConstString(offset + 126, $memo8);
	}

	/**
	 *  メモ８.<p>
	 *
	 */
	public void memo8(String value) {
		setConstString(offset + 126, $memo8, value);
	}


	/**
	 *  メモ９.<p>
	 *
	 */
	public String memo9() {
		return getConstString(offset + 127, $memo9);
	}

	/**
	 *  メモ９.<p>
	 *
	 */
	public void memo9(String value) {
		setConstString(offset + 127, $memo9, value);
	}


	/**
	 *  メモ１０.<p>
	 *
	 */
	public String memo10() {
		return getConstString(offset + 128, $memo10);
	}

	/**
	 *  メモ１０.<p>
	 *
	 */
	public void memo10(String value) {
		setConstString(offset + 128, $memo10, value);
	}


	/**
	 *  メモ１１.<p>
	 *
	 */
	public String memo11() {
		return getConstString(offset + 129, $memo11);
	}

	/**
	 *  メモ１１.<p>
	 *
	 */
	public void memo11(String value) {
		setConstString(offset + 129, $memo11, value);
	}


	/**
	 *  メモ１２.<p>
	 *
	 */
	public String memo12() {
		return getConstString(offset + 130, $memo12);
	}

	/**
	 *  メモ１２.<p>
	 *
	 */
	public void memo12(String value) {
		setConstString(offset + 130, $memo12, value);
	}


	/**
	 *  メモ１３.<p>
	 *
	 */
	public String memo13() {
		return getConstString(offset + 131, $memo13);
	}

	/**
	 *  メモ１３.<p>
	 *
	 */
	public void memo13(String value) {
		setConstString(offset + 131, $memo13, value);
	}


	/**
	 *  メモ１４.<p>
	 *
	 */
	public String memo14() {
		return getConstString(offset + 132, $memo14);
	}

	/**
	 *  メモ１４.<p>
	 *
	 */
	public void memo14(String value) {
		setConstString(offset + 132, $memo14, value);
	}


	/**
	 *  メモ１５.<p>
	 *
	 */
	public String memo15() {
		return getConstString(offset + 133, $memo15);
	}

	/**
	 *  メモ１５.<p>
	 *
	 */
	public void memo15(String value) {
		setConstString(offset + 133, $memo15, value);
	}


	/**
	 *  メモ１６.<p>
	 *
	 */
	public String memo16() {
		return getConstString(offset + 134, $memo16);
	}

	/**
	 *  メモ１６.<p>
	 *
	 */
	public void memo16(String value) {
		setConstString(offset + 134, $memo16, value);
	}


	/**
	 *  メモ１７.<p>
	 *
	 */
	public String memo17() {
		return getConstString(offset + 135, $memo17);
	}

	/**
	 *  メモ１７.<p>
	 *
	 */
	public void memo17(String value) {
		setConstString(offset + 135, $memo17, value);
	}


	/**
	 *  メモ１８.<p>
	 *
	 */
	public String memo18() {
		return getConstString(offset + 136, $memo18);
	}

	/**
	 *  メモ１８.<p>
	 *
	 */
	public void memo18(String value) {
		setConstString(offset + 136, $memo18, value);
	}


	/**
	 *  メモ１９.<p>
	 *
	 */
	public String memo19() {
		return getConstString(offset + 137, $memo19);
	}

	/**
	 *  メモ１９.<p>
	 *
	 */
	public void memo19(String value) {
		setConstString(offset + 137, $memo19, value);
	}


	/**
	 *  メモ２０.<p>
	 *
	 */
	public String memo20() {
		return getConstString(offset + 138, $memo20);
	}

	/**
	 *  メモ２０.<p>
	 *
	 */
	public void memo20(String value) {
		setConstString(offset + 138, $memo20, value);
	}


	/**
	 *  事業者ＮＯ.<p>
	 *
	 */
	public String biz_co_no() {
		return getConstString(offset + 139, $biz_co_no);
	}

	/**
	 *  事業者ＮＯ.<p>
	 *
	 */
	public void biz_co_no(String value) {
		setConstString(offset + 139, $biz_co_no, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($bp_alt_nm1.equalsIgnoreCase(name)) {
			return bp_alt_nm1();
		}
		if ($bp_alt_nm2.equalsIgnoreCase(name)) {
			return bp_alt_nm2();
		}
		if ($bp_alt_nm3.equalsIgnoreCase(name)) {
			return bp_alt_nm3();
		}
		if ($bp_alt_nm4.equalsIgnoreCase(name)) {
			return bp_alt_nm4();
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			return zip_cd();
		}
		if ($addr1.equalsIgnoreCase(name)) {
			return addr1();
		}
		if ($addr2.equalsIgnoreCase(name)) {
			return addr2();
		}
		if ($addr3.equalsIgnoreCase(name)) {
			return addr3();
		}
		if ($addr4.equalsIgnoreCase(name)) {
			return addr4();
		}
		if ($tel.equalsIgnoreCase(name)) {
			return tel();
		}
		if ($fax.equalsIgnoreCase(name)) {
			return fax();
		}
		if ($ein.equalsIgnoreCase(name)) {
			return ein();
		}
		if ($std_co_cd.equalsIgnoreCase(name)) {
			return std_co_cd();
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			return cntry_cd();
		}
		if ($area_cd.equalsIgnoreCase(name)) {
			return area_cd();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			return prnt_lcl_cd();
		}
		if ($bp_grp_cd1.equalsIgnoreCase(name)) {
			return bp_grp_cd1();
		}
		if ($bp_grp_cd2.equalsIgnoreCase(name)) {
			return bp_grp_cd2();
		}
		if ($bp_grp_cd3.equalsIgnoreCase(name)) {
			return bp_grp_cd3();
		}
		if ($bp_grp_cd4.equalsIgnoreCase(name)) {
			return bp_grp_cd4();
		}
		if ($bp_grp_cd5.equalsIgnoreCase(name)) {
			return bp_grp_cd5();
		}
		if ($bp_grp_cd6.equalsIgnoreCase(name)) {
			return bp_grp_cd6();
		}
		if ($bp_grp_cd7.equalsIgnoreCase(name)) {
			return bp_grp_cd7();
		}
		if ($bp_grp_cd8.equalsIgnoreCase(name)) {
			return bp_grp_cd8();
		}
		if ($bp_grp_cd9.equalsIgnoreCase(name)) {
			return bp_grp_cd9();
		}
		if ($bp_grp_cd10.equalsIgnoreCase(name)) {
			return bp_grp_cd10();
		}
		if ($bp_alc_grp.equalsIgnoreCase(name)) {
			return bp_alc_grp();
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			return asppl_cd();
		}
		if ($po_print_cd.equalsIgnoreCase(name)) {
			return po_print_cd();
		}
		if ($sppl_ship_form_cd.equalsIgnoreCase(name)) {
			return sppl_ship_form_cd();
		}
		if ($sppl_cntct_dpt.equalsIgnoreCase(name)) {
			return sppl_cntct_dpt();
		}
		if ($sppl_cntct_psn.equalsIgnoreCase(name)) {
			return sppl_cntct_psn();
		}
		if ($sppl_cntct_psn_title.equalsIgnoreCase(name)) {
			return sppl_cntct_psn_title();
		}
		if ($purc_upri_req_typ.equalsIgnoreCase(name)) {
			return purc_upri_req_typ();
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			return purc_amt_rnd_typ();
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			return purc_tax_rnd_typ();
		}
		if ($purc_tax_calc_typ.equalsIgnoreCase(name)) {
			return purc_tax_calc_typ();
		}
		if ($purc_tax_cd.equalsIgnoreCase(name)) {
			return purc_tax_cd();
		}
		if ($purc_slip_each_lot_typ.equalsIgnoreCase(name)) {
			return purc_slip_each_lot_typ();
		}
		if ($prov_rcv_typ.equalsIgnoreCase(name)) {
			return prov_rcv_typ();
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			return prov_basis_typ();
		}
		if ($prov_amt_rnd_typ.equalsIgnoreCase(name)) {
			return prov_amt_rnd_typ();
		}
		if ($prov_tax_rnd_typ.equalsIgnoreCase(name)) {
			return prov_tax_rnd_typ();
		}
		if ($prov_tax_calc_typ.equalsIgnoreCase(name)) {
			return prov_tax_calc_typ();
		}
		if ($prov_tax_cd.equalsIgnoreCase(name)) {
			return prov_tax_cd();
		}
		if ($sppl_cal_cd.equalsIgnoreCase(name)) {
			return sppl_cal_cd();
		}
		if ($sppl_tterm_cd1.equalsIgnoreCase(name)) {
			return sppl_tterm_cd1();
		}
		if ($sppl_tterm_cd2.equalsIgnoreCase(name)) {
			return sppl_tterm_cd2();
		}
		if ($sppl_tterm_cd3.equalsIgnoreCase(name)) {
			return sppl_tterm_cd3();
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			return bsppl_cd();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
		}
		if ($if_sub_char1.equalsIgnoreCase(name)) {
			return if_sub_char1();
		}
		if ($if_sub_char2.equalsIgnoreCase(name)) {
			return if_sub_char2();
		}
		if ($if_sub_char3.equalsIgnoreCase(name)) {
			return if_sub_char3();
		}
		if ($if_sub_char4.equalsIgnoreCase(name)) {
			return if_sub_char4();
		}
		if ($if_sub_char5.equalsIgnoreCase(name)) {
			return if_sub_char5();
		}
		if ($if_sub_char6.equalsIgnoreCase(name)) {
			return if_sub_char6();
		}
		if ($if_sub_char7.equalsIgnoreCase(name)) {
			return if_sub_char7();
		}
		if ($if_sub_char8.equalsIgnoreCase(name)) {
			return if_sub_char8();
		}
		if ($if_sub_char9.equalsIgnoreCase(name)) {
			return if_sub_char9();
		}
		if ($if_sub_char10.equalsIgnoreCase(name)) {
			return if_sub_char10();
		}
		if ($if_sub_char11.equalsIgnoreCase(name)) {
			return if_sub_char11();
		}
		if ($if_sub_char12.equalsIgnoreCase(name)) {
			return if_sub_char12();
		}
		if ($if_sub_char13.equalsIgnoreCase(name)) {
			return if_sub_char13();
		}
		if ($if_sub_char14.equalsIgnoreCase(name)) {
			return if_sub_char14();
		}
		if ($if_sub_char15.equalsIgnoreCase(name)) {
			return if_sub_char15();
		}
		if ($if_sub_char16.equalsIgnoreCase(name)) {
			return if_sub_char16();
		}
		if ($if_sub_char17.equalsIgnoreCase(name)) {
			return if_sub_char17();
		}
		if ($if_sub_char18.equalsIgnoreCase(name)) {
			return if_sub_char18();
		}
		if ($if_sub_char19.equalsIgnoreCase(name)) {
			return if_sub_char19();
		}
		if ($if_sub_char20.equalsIgnoreCase(name)) {
			return if_sub_char20();
		}
		if ($if_sub_char21.equalsIgnoreCase(name)) {
			return if_sub_char21();
		}
		if ($if_sub_char22.equalsIgnoreCase(name)) {
			return if_sub_char22();
		}
		if ($if_sub_char23.equalsIgnoreCase(name)) {
			return if_sub_char23();
		}
		if ($if_sub_char24.equalsIgnoreCase(name)) {
			return if_sub_char24();
		}
		if ($if_sub_char25.equalsIgnoreCase(name)) {
			return if_sub_char25();
		}
		if ($if_sub_char26.equalsIgnoreCase(name)) {
			return if_sub_char26();
		}
		if ($if_sub_char27.equalsIgnoreCase(name)) {
			return if_sub_char27();
		}
		if ($if_sub_char28.equalsIgnoreCase(name)) {
			return if_sub_char28();
		}
		if ($if_sub_char29.equalsIgnoreCase(name)) {
			return if_sub_char29();
		}
		if ($if_sub_char30.equalsIgnoreCase(name)) {
			return if_sub_char30();
		}
		if ($memo4.equalsIgnoreCase(name)) {
			return memo4();
		}
		if ($memo5.equalsIgnoreCase(name)) {
			return memo5();
		}
		if ($memo6.equalsIgnoreCase(name)) {
			return memo6();
		}
		if ($memo7.equalsIgnoreCase(name)) {
			return memo7();
		}
		if ($memo8.equalsIgnoreCase(name)) {
			return memo8();
		}
		if ($memo9.equalsIgnoreCase(name)) {
			return memo9();
		}
		if ($memo10.equalsIgnoreCase(name)) {
			return memo10();
		}
		if ($memo11.equalsIgnoreCase(name)) {
			return memo11();
		}
		if ($memo12.equalsIgnoreCase(name)) {
			return memo12();
		}
		if ($memo13.equalsIgnoreCase(name)) {
			return memo13();
		}
		if ($memo14.equalsIgnoreCase(name)) {
			return memo14();
		}
		if ($memo15.equalsIgnoreCase(name)) {
			return memo15();
		}
		if ($memo16.equalsIgnoreCase(name)) {
			return memo16();
		}
		if ($memo17.equalsIgnoreCase(name)) {
			return memo17();
		}
		if ($memo18.equalsIgnoreCase(name)) {
			return memo18();
		}
		if ($memo19.equalsIgnoreCase(name)) {
			return memo19();
		}
		if ($memo20.equalsIgnoreCase(name)) {
			return memo20();
		}
		if ($biz_co_no.equalsIgnoreCase(name)) {
			return biz_co_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			return pay_crryovr_times();
		}
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			return if_sub_num1();
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			return if_sub_num2();
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			return if_sub_num3();
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			return if_sub_num4();
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			return if_sub_num5();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($if_sub_dt1.equalsIgnoreCase(name)) {
			return if_sub_dt1();
		}
		if ($if_sub_dt2.equalsIgnoreCase(name)) {
			return if_sub_dt2();
		}
		if ($if_sub_dt3.equalsIgnoreCase(name)) {
			return if_sub_dt3();
		}
		if ($if_sub_dt4.equalsIgnoreCase(name)) {
			return if_sub_dt4();
		}
		if ($if_sub_dt5.equalsIgnoreCase(name)) {
			return if_sub_dt5();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($cst_flg.equalsIgnoreCase(name)) {
			return cst_flg();
		}
		if ($acst_flg.equalsIgnoreCase(name)) {
			return acst_flg();
		}
		if ($bcst_flg.equalsIgnoreCase(name)) {
			return bcst_flg();
		}
		if ($rcst_flg.equalsIgnoreCase(name)) {
			return rcst_flg();
		}
		if ($sppl_flg.equalsIgnoreCase(name)) {
			return sppl_flg();
		}
		if ($asppl_flg.equalsIgnoreCase(name)) {
			return asppl_flg();
		}
		if ($bsppl_flg.equalsIgnoreCase(name)) {
			return bsppl_flg();
		}
		if ($psppl_flg.equalsIgnoreCase(name)) {
			return psppl_flg();
		}
		if ($cred_flg.equalsIgnoreCase(name)) {
			return cred_flg();
		}
		if ($dlv_flg.equalsIgnoreCase(name)) {
			return dlv_flg();
		}
		if ($maker_flg.equalsIgnoreCase(name)) {
			return maker_flg();
		}
		if ($dest_flg.equalsIgnoreCase(name)) {
			return dest_flg();
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			return subcon_flg();
		}
		if ($purc_upri_cng_flg.equalsIgnoreCase(name)) {
			return purc_upri_cng_flg();
		}
		if ($purc_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			return purc_tax_cd_prio_flg();
		}
		if ($wrk_po_flg.equalsIgnoreCase(name)) {
			return wrk_po_flg();
		}
		if ($wrk_ap_flg.equalsIgnoreCase(name)) {
			return wrk_ap_flg();
		}
		if ($onr_prsppl_flg.equalsIgnoreCase(name)) {
			return onr_prsppl_flg();
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			return repurc_obli_flg();
		}
		if ($prov_upri_cng_flg.equalsIgnoreCase(name)) {
			return prov_upri_cng_flg();
		}
		if ($prov_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			return prov_tax_cd_prio_flg();
		}
		if ($sppl_iv_flg.equalsIgnoreCase(name)) {
			return sppl_iv_flg();
		}
		if ($prms_recv_flg.equalsIgnoreCase(name)) {
			return prms_recv_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($bp_alt_nm1.equalsIgnoreCase(name)) {
			return bp_alt_nm1();
		}
		if ($bp_alt_nm2.equalsIgnoreCase(name)) {
			return bp_alt_nm2();
		}
		if ($bp_alt_nm3.equalsIgnoreCase(name)) {
			return bp_alt_nm3();
		}
		if ($bp_alt_nm4.equalsIgnoreCase(name)) {
			return bp_alt_nm4();
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			return zip_cd();
		}
		if ($addr1.equalsIgnoreCase(name)) {
			return addr1();
		}
		if ($addr2.equalsIgnoreCase(name)) {
			return addr2();
		}
		if ($addr3.equalsIgnoreCase(name)) {
			return addr3();
		}
		if ($addr4.equalsIgnoreCase(name)) {
			return addr4();
		}
		if ($tel.equalsIgnoreCase(name)) {
			return tel();
		}
		if ($fax.equalsIgnoreCase(name)) {
			return fax();
		}
		if ($ein.equalsIgnoreCase(name)) {
			return ein();
		}
		if ($std_co_cd.equalsIgnoreCase(name)) {
			return std_co_cd();
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			return cntry_cd();
		}
		if ($area_cd.equalsIgnoreCase(name)) {
			return area_cd();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			return prnt_lcl_cd();
		}
		if ($bp_grp_cd1.equalsIgnoreCase(name)) {
			return bp_grp_cd1();
		}
		if ($bp_grp_cd2.equalsIgnoreCase(name)) {
			return bp_grp_cd2();
		}
		if ($bp_grp_cd3.equalsIgnoreCase(name)) {
			return bp_grp_cd3();
		}
		if ($bp_grp_cd4.equalsIgnoreCase(name)) {
			return bp_grp_cd4();
		}
		if ($bp_grp_cd5.equalsIgnoreCase(name)) {
			return bp_grp_cd5();
		}
		if ($bp_grp_cd6.equalsIgnoreCase(name)) {
			return bp_grp_cd6();
		}
		if ($bp_grp_cd7.equalsIgnoreCase(name)) {
			return bp_grp_cd7();
		}
		if ($bp_grp_cd8.equalsIgnoreCase(name)) {
			return bp_grp_cd8();
		}
		if ($bp_grp_cd9.equalsIgnoreCase(name)) {
			return bp_grp_cd9();
		}
		if ($bp_grp_cd10.equalsIgnoreCase(name)) {
			return bp_grp_cd10();
		}
		if ($bp_alc_grp.equalsIgnoreCase(name)) {
			return bp_alc_grp();
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			return asppl_cd();
		}
		if ($po_print_cd.equalsIgnoreCase(name)) {
			return po_print_cd();
		}
		if ($sppl_ship_form_cd.equalsIgnoreCase(name)) {
			return sppl_ship_form_cd();
		}
		if ($sppl_cntct_dpt.equalsIgnoreCase(name)) {
			return sppl_cntct_dpt();
		}
		if ($sppl_cntct_psn.equalsIgnoreCase(name)) {
			return sppl_cntct_psn();
		}
		if ($sppl_cntct_psn_title.equalsIgnoreCase(name)) {
			return sppl_cntct_psn_title();
		}
		if ($purc_upri_req_typ.equalsIgnoreCase(name)) {
			return purc_upri_req_typ();
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			return purc_amt_rnd_typ();
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			return purc_tax_rnd_typ();
		}
		if ($purc_tax_calc_typ.equalsIgnoreCase(name)) {
			return purc_tax_calc_typ();
		}
		if ($purc_tax_cd.equalsIgnoreCase(name)) {
			return purc_tax_cd();
		}
		if ($purc_slip_each_lot_typ.equalsIgnoreCase(name)) {
			return purc_slip_each_lot_typ();
		}
		if ($prov_rcv_typ.equalsIgnoreCase(name)) {
			return prov_rcv_typ();
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			return prov_basis_typ();
		}
		if ($prov_amt_rnd_typ.equalsIgnoreCase(name)) {
			return prov_amt_rnd_typ();
		}
		if ($prov_tax_rnd_typ.equalsIgnoreCase(name)) {
			return prov_tax_rnd_typ();
		}
		if ($prov_tax_calc_typ.equalsIgnoreCase(name)) {
			return prov_tax_calc_typ();
		}
		if ($prov_tax_cd.equalsIgnoreCase(name)) {
			return prov_tax_cd();
		}
		if ($sppl_cal_cd.equalsIgnoreCase(name)) {
			return sppl_cal_cd();
		}
		if ($sppl_tterm_cd1.equalsIgnoreCase(name)) {
			return sppl_tterm_cd1();
		}
		if ($sppl_tterm_cd2.equalsIgnoreCase(name)) {
			return sppl_tterm_cd2();
		}
		if ($sppl_tterm_cd3.equalsIgnoreCase(name)) {
			return sppl_tterm_cd3();
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			return bsppl_cd();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
		}
		if ($if_sub_char1.equalsIgnoreCase(name)) {
			return if_sub_char1();
		}
		if ($if_sub_char2.equalsIgnoreCase(name)) {
			return if_sub_char2();
		}
		if ($if_sub_char3.equalsIgnoreCase(name)) {
			return if_sub_char3();
		}
		if ($if_sub_char4.equalsIgnoreCase(name)) {
			return if_sub_char4();
		}
		if ($if_sub_char5.equalsIgnoreCase(name)) {
			return if_sub_char5();
		}
		if ($if_sub_char6.equalsIgnoreCase(name)) {
			return if_sub_char6();
		}
		if ($if_sub_char7.equalsIgnoreCase(name)) {
			return if_sub_char7();
		}
		if ($if_sub_char8.equalsIgnoreCase(name)) {
			return if_sub_char8();
		}
		if ($if_sub_char9.equalsIgnoreCase(name)) {
			return if_sub_char9();
		}
		if ($if_sub_char10.equalsIgnoreCase(name)) {
			return if_sub_char10();
		}
		if ($if_sub_char11.equalsIgnoreCase(name)) {
			return if_sub_char11();
		}
		if ($if_sub_char12.equalsIgnoreCase(name)) {
			return if_sub_char12();
		}
		if ($if_sub_char13.equalsIgnoreCase(name)) {
			return if_sub_char13();
		}
		if ($if_sub_char14.equalsIgnoreCase(name)) {
			return if_sub_char14();
		}
		if ($if_sub_char15.equalsIgnoreCase(name)) {
			return if_sub_char15();
		}
		if ($if_sub_char16.equalsIgnoreCase(name)) {
			return if_sub_char16();
		}
		if ($if_sub_char17.equalsIgnoreCase(name)) {
			return if_sub_char17();
		}
		if ($if_sub_char18.equalsIgnoreCase(name)) {
			return if_sub_char18();
		}
		if ($if_sub_char19.equalsIgnoreCase(name)) {
			return if_sub_char19();
		}
		if ($if_sub_char20.equalsIgnoreCase(name)) {
			return if_sub_char20();
		}
		if ($if_sub_char21.equalsIgnoreCase(name)) {
			return if_sub_char21();
		}
		if ($if_sub_char22.equalsIgnoreCase(name)) {
			return if_sub_char22();
		}
		if ($if_sub_char23.equalsIgnoreCase(name)) {
			return if_sub_char23();
		}
		if ($if_sub_char24.equalsIgnoreCase(name)) {
			return if_sub_char24();
		}
		if ($if_sub_char25.equalsIgnoreCase(name)) {
			return if_sub_char25();
		}
		if ($if_sub_char26.equalsIgnoreCase(name)) {
			return if_sub_char26();
		}
		if ($if_sub_char27.equalsIgnoreCase(name)) {
			return if_sub_char27();
		}
		if ($if_sub_char28.equalsIgnoreCase(name)) {
			return if_sub_char28();
		}
		if ($if_sub_char29.equalsIgnoreCase(name)) {
			return if_sub_char29();
		}
		if ($if_sub_char30.equalsIgnoreCase(name)) {
			return if_sub_char30();
		}
		if ($memo4.equalsIgnoreCase(name)) {
			return memo4();
		}
		if ($memo5.equalsIgnoreCase(name)) {
			return memo5();
		}
		if ($memo6.equalsIgnoreCase(name)) {
			return memo6();
		}
		if ($memo7.equalsIgnoreCase(name)) {
			return memo7();
		}
		if ($memo8.equalsIgnoreCase(name)) {
			return memo8();
		}
		if ($memo9.equalsIgnoreCase(name)) {
			return memo9();
		}
		if ($memo10.equalsIgnoreCase(name)) {
			return memo10();
		}
		if ($memo11.equalsIgnoreCase(name)) {
			return memo11();
		}
		if ($memo12.equalsIgnoreCase(name)) {
			return memo12();
		}
		if ($memo13.equalsIgnoreCase(name)) {
			return memo13();
		}
		if ($memo14.equalsIgnoreCase(name)) {
			return memo14();
		}
		if ($memo15.equalsIgnoreCase(name)) {
			return memo15();
		}
		if ($memo16.equalsIgnoreCase(name)) {
			return memo16();
		}
		if ($memo17.equalsIgnoreCase(name)) {
			return memo17();
		}
		if ($memo18.equalsIgnoreCase(name)) {
			return memo18();
		}
		if ($memo19.equalsIgnoreCase(name)) {
			return memo19();
		}
		if ($memo20.equalsIgnoreCase(name)) {
			return memo20();
		}
		if ($biz_co_no.equalsIgnoreCase(name)) {
			return biz_co_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			return pay_crryovr_times();
		}
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			return if_sub_num1();
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			return if_sub_num2();
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			return if_sub_num3();
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			return if_sub_num4();
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			return if_sub_num5();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($if_sub_dt1.equalsIgnoreCase(name)) {
			return if_sub_dt1();
		}
		if ($if_sub_dt2.equalsIgnoreCase(name)) {
			return if_sub_dt2();
		}
		if ($if_sub_dt3.equalsIgnoreCase(name)) {
			return if_sub_dt3();
		}
		if ($if_sub_dt4.equalsIgnoreCase(name)) {
			return if_sub_dt4();
		}
		if ($if_sub_dt5.equalsIgnoreCase(name)) {
			return if_sub_dt5();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($cst_flg.equalsIgnoreCase(name)) {
			return cst_flg();
		}
		if ($acst_flg.equalsIgnoreCase(name)) {
			return acst_flg();
		}
		if ($bcst_flg.equalsIgnoreCase(name)) {
			return bcst_flg();
		}
		if ($rcst_flg.equalsIgnoreCase(name)) {
			return rcst_flg();
		}
		if ($sppl_flg.equalsIgnoreCase(name)) {
			return sppl_flg();
		}
		if ($asppl_flg.equalsIgnoreCase(name)) {
			return asppl_flg();
		}
		if ($bsppl_flg.equalsIgnoreCase(name)) {
			return bsppl_flg();
		}
		if ($psppl_flg.equalsIgnoreCase(name)) {
			return psppl_flg();
		}
		if ($cred_flg.equalsIgnoreCase(name)) {
			return cred_flg();
		}
		if ($dlv_flg.equalsIgnoreCase(name)) {
			return dlv_flg();
		}
		if ($maker_flg.equalsIgnoreCase(name)) {
			return maker_flg();
		}
		if ($dest_flg.equalsIgnoreCase(name)) {
			return dest_flg();
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			return subcon_flg();
		}
		if ($purc_upri_cng_flg.equalsIgnoreCase(name)) {
			return purc_upri_cng_flg();
		}
		if ($purc_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			return purc_tax_cd_prio_flg();
		}
		if ($wrk_po_flg.equalsIgnoreCase(name)) {
			return wrk_po_flg();
		}
		if ($wrk_ap_flg.equalsIgnoreCase(name)) {
			return wrk_ap_flg();
		}
		if ($onr_prsppl_flg.equalsIgnoreCase(name)) {
			return onr_prsppl_flg();
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			return repurc_obli_flg();
		}
		if ($prov_upri_cng_flg.equalsIgnoreCase(name)) {
			return prov_upri_cng_flg();
		}
		if ($prov_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			return prov_tax_cd_prio_flg();
		}
		if ($sppl_iv_flg.equalsIgnoreCase(name)) {
			return sppl_iv_flg();
		}
		if ($prms_recv_flg.equalsIgnoreCase(name)) {
			return prms_recv_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
			return;
		}
		if ($bp_alt_nm1.equalsIgnoreCase(name)) {
			bp_alt_nm1(value);
			return;
		}
		if ($bp_alt_nm2.equalsIgnoreCase(name)) {
			bp_alt_nm2(value);
			return;
		}
		if ($bp_alt_nm3.equalsIgnoreCase(name)) {
			bp_alt_nm3(value);
			return;
		}
		if ($bp_alt_nm4.equalsIgnoreCase(name)) {
			bp_alt_nm4(value);
			return;
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			zip_cd(value);
			return;
		}
		if ($addr1.equalsIgnoreCase(name)) {
			addr1(value);
			return;
		}
		if ($addr2.equalsIgnoreCase(name)) {
			addr2(value);
			return;
		}
		if ($addr3.equalsIgnoreCase(name)) {
			addr3(value);
			return;
		}
		if ($addr4.equalsIgnoreCase(name)) {
			addr4(value);
			return;
		}
		if ($tel.equalsIgnoreCase(name)) {
			tel(value);
			return;
		}
		if ($fax.equalsIgnoreCase(name)) {
			fax(value);
			return;
		}
		if ($ein.equalsIgnoreCase(name)) {
			ein(value);
			return;
		}
		if ($std_co_cd.equalsIgnoreCase(name)) {
			std_co_cd(value);
			return;
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			cntry_cd(value);
			return;
		}
		if ($area_cd.equalsIgnoreCase(name)) {
			area_cd(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			prnt_lcl_cd(value);
			return;
		}
		if ($bp_grp_cd1.equalsIgnoreCase(name)) {
			bp_grp_cd1(value);
			return;
		}
		if ($bp_grp_cd2.equalsIgnoreCase(name)) {
			bp_grp_cd2(value);
			return;
		}
		if ($bp_grp_cd3.equalsIgnoreCase(name)) {
			bp_grp_cd3(value);
			return;
		}
		if ($bp_grp_cd4.equalsIgnoreCase(name)) {
			bp_grp_cd4(value);
			return;
		}
		if ($bp_grp_cd5.equalsIgnoreCase(name)) {
			bp_grp_cd5(value);
			return;
		}
		if ($bp_grp_cd6.equalsIgnoreCase(name)) {
			bp_grp_cd6(value);
			return;
		}
		if ($bp_grp_cd7.equalsIgnoreCase(name)) {
			bp_grp_cd7(value);
			return;
		}
		if ($bp_grp_cd8.equalsIgnoreCase(name)) {
			bp_grp_cd8(value);
			return;
		}
		if ($bp_grp_cd9.equalsIgnoreCase(name)) {
			bp_grp_cd9(value);
			return;
		}
		if ($bp_grp_cd10.equalsIgnoreCase(name)) {
			bp_grp_cd10(value);
			return;
		}
		if ($bp_alc_grp.equalsIgnoreCase(name)) {
			bp_alc_grp(value);
			return;
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			asppl_cd(value);
			return;
		}
		if ($po_print_cd.equalsIgnoreCase(name)) {
			po_print_cd(value);
			return;
		}
		if ($sppl_ship_form_cd.equalsIgnoreCase(name)) {
			sppl_ship_form_cd(value);
			return;
		}
		if ($sppl_cntct_dpt.equalsIgnoreCase(name)) {
			sppl_cntct_dpt(value);
			return;
		}
		if ($sppl_cntct_psn.equalsIgnoreCase(name)) {
			sppl_cntct_psn(value);
			return;
		}
		if ($sppl_cntct_psn_title.equalsIgnoreCase(name)) {
			sppl_cntct_psn_title(value);
			return;
		}
		if ($purc_upri_req_typ.equalsIgnoreCase(name)) {
			purc_upri_req_typ(value);
			return;
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			purc_amt_rnd_typ(value);
			return;
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			purc_tax_rnd_typ(value);
			return;
		}
		if ($purc_tax_calc_typ.equalsIgnoreCase(name)) {
			purc_tax_calc_typ(value);
			return;
		}
		if ($purc_tax_cd.equalsIgnoreCase(name)) {
			purc_tax_cd(value);
			return;
		}
		if ($purc_slip_each_lot_typ.equalsIgnoreCase(name)) {
			purc_slip_each_lot_typ(value);
			return;
		}
		if ($prov_rcv_typ.equalsIgnoreCase(name)) {
			prov_rcv_typ(value);
			return;
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			prov_basis_typ(value);
			return;
		}
		if ($prov_amt_rnd_typ.equalsIgnoreCase(name)) {
			prov_amt_rnd_typ(value);
			return;
		}
		if ($prov_tax_rnd_typ.equalsIgnoreCase(name)) {
			prov_tax_rnd_typ(value);
			return;
		}
		if ($prov_tax_calc_typ.equalsIgnoreCase(name)) {
			prov_tax_calc_typ(value);
			return;
		}
		if ($prov_tax_cd.equalsIgnoreCase(name)) {
			prov_tax_cd(value);
			return;
		}
		if ($sppl_cal_cd.equalsIgnoreCase(name)) {
			sppl_cal_cd(value);
			return;
		}
		if ($sppl_tterm_cd1.equalsIgnoreCase(name)) {
			sppl_tterm_cd1(value);
			return;
		}
		if ($sppl_tterm_cd2.equalsIgnoreCase(name)) {
			sppl_tterm_cd2(value);
			return;
		}
		if ($sppl_tterm_cd3.equalsIgnoreCase(name)) {
			sppl_tterm_cd3(value);
			return;
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			bsppl_cd(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
			return;
		}
		if ($if_sub_char1.equalsIgnoreCase(name)) {
			if_sub_char1(value);
			return;
		}
		if ($if_sub_char2.equalsIgnoreCase(name)) {
			if_sub_char2(value);
			return;
		}
		if ($if_sub_char3.equalsIgnoreCase(name)) {
			if_sub_char3(value);
			return;
		}
		if ($if_sub_char4.equalsIgnoreCase(name)) {
			if_sub_char4(value);
			return;
		}
		if ($if_sub_char5.equalsIgnoreCase(name)) {
			if_sub_char5(value);
			return;
		}
		if ($if_sub_char6.equalsIgnoreCase(name)) {
			if_sub_char6(value);
			return;
		}
		if ($if_sub_char7.equalsIgnoreCase(name)) {
			if_sub_char7(value);
			return;
		}
		if ($if_sub_char8.equalsIgnoreCase(name)) {
			if_sub_char8(value);
			return;
		}
		if ($if_sub_char9.equalsIgnoreCase(name)) {
			if_sub_char9(value);
			return;
		}
		if ($if_sub_char10.equalsIgnoreCase(name)) {
			if_sub_char10(value);
			return;
		}
		if ($if_sub_char11.equalsIgnoreCase(name)) {
			if_sub_char11(value);
			return;
		}
		if ($if_sub_char12.equalsIgnoreCase(name)) {
			if_sub_char12(value);
			return;
		}
		if ($if_sub_char13.equalsIgnoreCase(name)) {
			if_sub_char13(value);
			return;
		}
		if ($if_sub_char14.equalsIgnoreCase(name)) {
			if_sub_char14(value);
			return;
		}
		if ($if_sub_char15.equalsIgnoreCase(name)) {
			if_sub_char15(value);
			return;
		}
		if ($if_sub_char16.equalsIgnoreCase(name)) {
			if_sub_char16(value);
			return;
		}
		if ($if_sub_char17.equalsIgnoreCase(name)) {
			if_sub_char17(value);
			return;
		}
		if ($if_sub_char18.equalsIgnoreCase(name)) {
			if_sub_char18(value);
			return;
		}
		if ($if_sub_char19.equalsIgnoreCase(name)) {
			if_sub_char19(value);
			return;
		}
		if ($if_sub_char20.equalsIgnoreCase(name)) {
			if_sub_char20(value);
			return;
		}
		if ($if_sub_char21.equalsIgnoreCase(name)) {
			if_sub_char21(value);
			return;
		}
		if ($if_sub_char22.equalsIgnoreCase(name)) {
			if_sub_char22(value);
			return;
		}
		if ($if_sub_char23.equalsIgnoreCase(name)) {
			if_sub_char23(value);
			return;
		}
		if ($if_sub_char24.equalsIgnoreCase(name)) {
			if_sub_char24(value);
			return;
		}
		if ($if_sub_char25.equalsIgnoreCase(name)) {
			if_sub_char25(value);
			return;
		}
		if ($if_sub_char26.equalsIgnoreCase(name)) {
			if_sub_char26(value);
			return;
		}
		if ($if_sub_char27.equalsIgnoreCase(name)) {
			if_sub_char27(value);
			return;
		}
		if ($if_sub_char28.equalsIgnoreCase(name)) {
			if_sub_char28(value);
			return;
		}
		if ($if_sub_char29.equalsIgnoreCase(name)) {
			if_sub_char29(value);
			return;
		}
		if ($if_sub_char30.equalsIgnoreCase(name)) {
			if_sub_char30(value);
			return;
		}
		if ($memo4.equalsIgnoreCase(name)) {
			memo4(value);
			return;
		}
		if ($memo5.equalsIgnoreCase(name)) {
			memo5(value);
			return;
		}
		if ($memo6.equalsIgnoreCase(name)) {
			memo6(value);
			return;
		}
		if ($memo7.equalsIgnoreCase(name)) {
			memo7(value);
			return;
		}
		if ($memo8.equalsIgnoreCase(name)) {
			memo8(value);
			return;
		}
		if ($memo9.equalsIgnoreCase(name)) {
			memo9(value);
			return;
		}
		if ($memo10.equalsIgnoreCase(name)) {
			memo10(value);
			return;
		}
		if ($memo11.equalsIgnoreCase(name)) {
			memo11(value);
			return;
		}
		if ($memo12.equalsIgnoreCase(name)) {
			memo12(value);
			return;
		}
		if ($memo13.equalsIgnoreCase(name)) {
			memo13(value);
			return;
		}
		if ($memo14.equalsIgnoreCase(name)) {
			memo14(value);
			return;
		}
		if ($memo15.equalsIgnoreCase(name)) {
			memo15(value);
			return;
		}
		if ($memo16.equalsIgnoreCase(name)) {
			memo16(value);
			return;
		}
		if ($memo17.equalsIgnoreCase(name)) {
			memo17(value);
			return;
		}
		if ($memo18.equalsIgnoreCase(name)) {
			memo18(value);
			return;
		}
		if ($memo19.equalsIgnoreCase(name)) {
			memo19(value);
			return;
		}
		if ($memo20.equalsIgnoreCase(name)) {
			memo20(value);
			return;
		}
		if ($biz_co_no.equalsIgnoreCase(name)) {
			biz_co_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($if_sub_dt1.equalsIgnoreCase(name)) {
			if_sub_dt1(value);
			return;
		}
		if ($if_sub_dt2.equalsIgnoreCase(name)) {
			if_sub_dt2(value);
			return;
		}
		if ($if_sub_dt3.equalsIgnoreCase(name)) {
			if_sub_dt3(value);
			return;
		}
		if ($if_sub_dt4.equalsIgnoreCase(name)) {
			if_sub_dt4(value);
			return;
		}
		if ($if_sub_dt5.equalsIgnoreCase(name)) {
			if_sub_dt5(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($cst_flg.equalsIgnoreCase(name)) {
			cst_flg(value);
			return;
		}
		if ($acst_flg.equalsIgnoreCase(name)) {
			acst_flg(value);
			return;
		}
		if ($bcst_flg.equalsIgnoreCase(name)) {
			bcst_flg(value);
			return;
		}
		if ($rcst_flg.equalsIgnoreCase(name)) {
			rcst_flg(value);
			return;
		}
		if ($sppl_flg.equalsIgnoreCase(name)) {
			sppl_flg(value);
			return;
		}
		if ($asppl_flg.equalsIgnoreCase(name)) {
			asppl_flg(value);
			return;
		}
		if ($bsppl_flg.equalsIgnoreCase(name)) {
			bsppl_flg(value);
			return;
		}
		if ($psppl_flg.equalsIgnoreCase(name)) {
			psppl_flg(value);
			return;
		}
		if ($cred_flg.equalsIgnoreCase(name)) {
			cred_flg(value);
			return;
		}
		if ($dlv_flg.equalsIgnoreCase(name)) {
			dlv_flg(value);
			return;
		}
		if ($maker_flg.equalsIgnoreCase(name)) {
			maker_flg(value);
			return;
		}
		if ($dest_flg.equalsIgnoreCase(name)) {
			dest_flg(value);
			return;
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			subcon_flg(value);
			return;
		}
		if ($purc_upri_cng_flg.equalsIgnoreCase(name)) {
			purc_upri_cng_flg(value);
			return;
		}
		if ($purc_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			purc_tax_cd_prio_flg(value);
			return;
		}
		if ($wrk_po_flg.equalsIgnoreCase(name)) {
			wrk_po_flg(value);
			return;
		}
		if ($wrk_ap_flg.equalsIgnoreCase(name)) {
			wrk_ap_flg(value);
			return;
		}
		if ($onr_prsppl_flg.equalsIgnoreCase(name)) {
			onr_prsppl_flg(value);
			return;
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			repurc_obli_flg(value);
			return;
		}
		if ($prov_upri_cng_flg.equalsIgnoreCase(name)) {
			prov_upri_cng_flg(value);
			return;
		}
		if ($prov_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			prov_tax_cd_prio_flg(value);
			return;
		}
		if ($sppl_iv_flg.equalsIgnoreCase(name)) {
			sppl_iv_flg(value);
			return;
		}
		if ($prms_recv_flg.equalsIgnoreCase(name)) {
			prms_recv_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
			return;
		}
		if ($bp_alt_nm1.equalsIgnoreCase(name)) {
			bp_alt_nm1(value);
			return;
		}
		if ($bp_alt_nm2.equalsIgnoreCase(name)) {
			bp_alt_nm2(value);
			return;
		}
		if ($bp_alt_nm3.equalsIgnoreCase(name)) {
			bp_alt_nm3(value);
			return;
		}
		if ($bp_alt_nm4.equalsIgnoreCase(name)) {
			bp_alt_nm4(value);
			return;
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			zip_cd(value);
			return;
		}
		if ($addr1.equalsIgnoreCase(name)) {
			addr1(value);
			return;
		}
		if ($addr2.equalsIgnoreCase(name)) {
			addr2(value);
			return;
		}
		if ($addr3.equalsIgnoreCase(name)) {
			addr3(value);
			return;
		}
		if ($addr4.equalsIgnoreCase(name)) {
			addr4(value);
			return;
		}
		if ($tel.equalsIgnoreCase(name)) {
			tel(value);
			return;
		}
		if ($fax.equalsIgnoreCase(name)) {
			fax(value);
			return;
		}
		if ($ein.equalsIgnoreCase(name)) {
			ein(value);
			return;
		}
		if ($std_co_cd.equalsIgnoreCase(name)) {
			std_co_cd(value);
			return;
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			cntry_cd(value);
			return;
		}
		if ($area_cd.equalsIgnoreCase(name)) {
			area_cd(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			prnt_lcl_cd(value);
			return;
		}
		if ($bp_grp_cd1.equalsIgnoreCase(name)) {
			bp_grp_cd1(value);
			return;
		}
		if ($bp_grp_cd2.equalsIgnoreCase(name)) {
			bp_grp_cd2(value);
			return;
		}
		if ($bp_grp_cd3.equalsIgnoreCase(name)) {
			bp_grp_cd3(value);
			return;
		}
		if ($bp_grp_cd4.equalsIgnoreCase(name)) {
			bp_grp_cd4(value);
			return;
		}
		if ($bp_grp_cd5.equalsIgnoreCase(name)) {
			bp_grp_cd5(value);
			return;
		}
		if ($bp_grp_cd6.equalsIgnoreCase(name)) {
			bp_grp_cd6(value);
			return;
		}
		if ($bp_grp_cd7.equalsIgnoreCase(name)) {
			bp_grp_cd7(value);
			return;
		}
		if ($bp_grp_cd8.equalsIgnoreCase(name)) {
			bp_grp_cd8(value);
			return;
		}
		if ($bp_grp_cd9.equalsIgnoreCase(name)) {
			bp_grp_cd9(value);
			return;
		}
		if ($bp_grp_cd10.equalsIgnoreCase(name)) {
			bp_grp_cd10(value);
			return;
		}
		if ($bp_alc_grp.equalsIgnoreCase(name)) {
			bp_alc_grp(value);
			return;
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			asppl_cd(value);
			return;
		}
		if ($po_print_cd.equalsIgnoreCase(name)) {
			po_print_cd(value);
			return;
		}
		if ($sppl_ship_form_cd.equalsIgnoreCase(name)) {
			sppl_ship_form_cd(value);
			return;
		}
		if ($sppl_cntct_dpt.equalsIgnoreCase(name)) {
			sppl_cntct_dpt(value);
			return;
		}
		if ($sppl_cntct_psn.equalsIgnoreCase(name)) {
			sppl_cntct_psn(value);
			return;
		}
		if ($sppl_cntct_psn_title.equalsIgnoreCase(name)) {
			sppl_cntct_psn_title(value);
			return;
		}
		if ($purc_upri_req_typ.equalsIgnoreCase(name)) {
			purc_upri_req_typ(value);
			return;
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			purc_amt_rnd_typ(value);
			return;
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			purc_tax_rnd_typ(value);
			return;
		}
		if ($purc_tax_calc_typ.equalsIgnoreCase(name)) {
			purc_tax_calc_typ(value);
			return;
		}
		if ($purc_tax_cd.equalsIgnoreCase(name)) {
			purc_tax_cd(value);
			return;
		}
		if ($purc_slip_each_lot_typ.equalsIgnoreCase(name)) {
			purc_slip_each_lot_typ(value);
			return;
		}
		if ($prov_rcv_typ.equalsIgnoreCase(name)) {
			prov_rcv_typ(value);
			return;
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			prov_basis_typ(value);
			return;
		}
		if ($prov_amt_rnd_typ.equalsIgnoreCase(name)) {
			prov_amt_rnd_typ(value);
			return;
		}
		if ($prov_tax_rnd_typ.equalsIgnoreCase(name)) {
			prov_tax_rnd_typ(value);
			return;
		}
		if ($prov_tax_calc_typ.equalsIgnoreCase(name)) {
			prov_tax_calc_typ(value);
			return;
		}
		if ($prov_tax_cd.equalsIgnoreCase(name)) {
			prov_tax_cd(value);
			return;
		}
		if ($sppl_cal_cd.equalsIgnoreCase(name)) {
			sppl_cal_cd(value);
			return;
		}
		if ($sppl_tterm_cd1.equalsIgnoreCase(name)) {
			sppl_tterm_cd1(value);
			return;
		}
		if ($sppl_tterm_cd2.equalsIgnoreCase(name)) {
			sppl_tterm_cd2(value);
			return;
		}
		if ($sppl_tterm_cd3.equalsIgnoreCase(name)) {
			sppl_tterm_cd3(value);
			return;
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			bsppl_cd(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
			return;
		}
		if ($if_sub_char1.equalsIgnoreCase(name)) {
			if_sub_char1(value);
			return;
		}
		if ($if_sub_char2.equalsIgnoreCase(name)) {
			if_sub_char2(value);
			return;
		}
		if ($if_sub_char3.equalsIgnoreCase(name)) {
			if_sub_char3(value);
			return;
		}
		if ($if_sub_char4.equalsIgnoreCase(name)) {
			if_sub_char4(value);
			return;
		}
		if ($if_sub_char5.equalsIgnoreCase(name)) {
			if_sub_char5(value);
			return;
		}
		if ($if_sub_char6.equalsIgnoreCase(name)) {
			if_sub_char6(value);
			return;
		}
		if ($if_sub_char7.equalsIgnoreCase(name)) {
			if_sub_char7(value);
			return;
		}
		if ($if_sub_char8.equalsIgnoreCase(name)) {
			if_sub_char8(value);
			return;
		}
		if ($if_sub_char9.equalsIgnoreCase(name)) {
			if_sub_char9(value);
			return;
		}
		if ($if_sub_char10.equalsIgnoreCase(name)) {
			if_sub_char10(value);
			return;
		}
		if ($if_sub_char11.equalsIgnoreCase(name)) {
			if_sub_char11(value);
			return;
		}
		if ($if_sub_char12.equalsIgnoreCase(name)) {
			if_sub_char12(value);
			return;
		}
		if ($if_sub_char13.equalsIgnoreCase(name)) {
			if_sub_char13(value);
			return;
		}
		if ($if_sub_char14.equalsIgnoreCase(name)) {
			if_sub_char14(value);
			return;
		}
		if ($if_sub_char15.equalsIgnoreCase(name)) {
			if_sub_char15(value);
			return;
		}
		if ($if_sub_char16.equalsIgnoreCase(name)) {
			if_sub_char16(value);
			return;
		}
		if ($if_sub_char17.equalsIgnoreCase(name)) {
			if_sub_char17(value);
			return;
		}
		if ($if_sub_char18.equalsIgnoreCase(name)) {
			if_sub_char18(value);
			return;
		}
		if ($if_sub_char19.equalsIgnoreCase(name)) {
			if_sub_char19(value);
			return;
		}
		if ($if_sub_char20.equalsIgnoreCase(name)) {
			if_sub_char20(value);
			return;
		}
		if ($if_sub_char21.equalsIgnoreCase(name)) {
			if_sub_char21(value);
			return;
		}
		if ($if_sub_char22.equalsIgnoreCase(name)) {
			if_sub_char22(value);
			return;
		}
		if ($if_sub_char23.equalsIgnoreCase(name)) {
			if_sub_char23(value);
			return;
		}
		if ($if_sub_char24.equalsIgnoreCase(name)) {
			if_sub_char24(value);
			return;
		}
		if ($if_sub_char25.equalsIgnoreCase(name)) {
			if_sub_char25(value);
			return;
		}
		if ($if_sub_char26.equalsIgnoreCase(name)) {
			if_sub_char26(value);
			return;
		}
		if ($if_sub_char27.equalsIgnoreCase(name)) {
			if_sub_char27(value);
			return;
		}
		if ($if_sub_char28.equalsIgnoreCase(name)) {
			if_sub_char28(value);
			return;
		}
		if ($if_sub_char29.equalsIgnoreCase(name)) {
			if_sub_char29(value);
			return;
		}
		if ($if_sub_char30.equalsIgnoreCase(name)) {
			if_sub_char30(value);
			return;
		}
		if ($memo4.equalsIgnoreCase(name)) {
			memo4(value);
			return;
		}
		if ($memo5.equalsIgnoreCase(name)) {
			memo5(value);
			return;
		}
		if ($memo6.equalsIgnoreCase(name)) {
			memo6(value);
			return;
		}
		if ($memo7.equalsIgnoreCase(name)) {
			memo7(value);
			return;
		}
		if ($memo8.equalsIgnoreCase(name)) {
			memo8(value);
			return;
		}
		if ($memo9.equalsIgnoreCase(name)) {
			memo9(value);
			return;
		}
		if ($memo10.equalsIgnoreCase(name)) {
			memo10(value);
			return;
		}
		if ($memo11.equalsIgnoreCase(name)) {
			memo11(value);
			return;
		}
		if ($memo12.equalsIgnoreCase(name)) {
			memo12(value);
			return;
		}
		if ($memo13.equalsIgnoreCase(name)) {
			memo13(value);
			return;
		}
		if ($memo14.equalsIgnoreCase(name)) {
			memo14(value);
			return;
		}
		if ($memo15.equalsIgnoreCase(name)) {
			memo15(value);
			return;
		}
		if ($memo16.equalsIgnoreCase(name)) {
			memo16(value);
			return;
		}
		if ($memo17.equalsIgnoreCase(name)) {
			memo17(value);
			return;
		}
		if ($memo18.equalsIgnoreCase(name)) {
			memo18(value);
			return;
		}
		if ($memo19.equalsIgnoreCase(name)) {
			memo19(value);
			return;
		}
		if ($memo20.equalsIgnoreCase(name)) {
			memo20(value);
			return;
		}
		if ($biz_co_no.equalsIgnoreCase(name)) {
			biz_co_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($if_sub_dt1.equalsIgnoreCase(name)) {
			if_sub_dt1(value);
			return;
		}
		if ($if_sub_dt2.equalsIgnoreCase(name)) {
			if_sub_dt2(value);
			return;
		}
		if ($if_sub_dt3.equalsIgnoreCase(name)) {
			if_sub_dt3(value);
			return;
		}
		if ($if_sub_dt4.equalsIgnoreCase(name)) {
			if_sub_dt4(value);
			return;
		}
		if ($if_sub_dt5.equalsIgnoreCase(name)) {
			if_sub_dt5(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($cst_flg.equalsIgnoreCase(name)) {
			cst_flg(value);
			return;
		}
		if ($acst_flg.equalsIgnoreCase(name)) {
			acst_flg(value);
			return;
		}
		if ($bcst_flg.equalsIgnoreCase(name)) {
			bcst_flg(value);
			return;
		}
		if ($rcst_flg.equalsIgnoreCase(name)) {
			rcst_flg(value);
			return;
		}
		if ($sppl_flg.equalsIgnoreCase(name)) {
			sppl_flg(value);
			return;
		}
		if ($asppl_flg.equalsIgnoreCase(name)) {
			asppl_flg(value);
			return;
		}
		if ($bsppl_flg.equalsIgnoreCase(name)) {
			bsppl_flg(value);
			return;
		}
		if ($psppl_flg.equalsIgnoreCase(name)) {
			psppl_flg(value);
			return;
		}
		if ($cred_flg.equalsIgnoreCase(name)) {
			cred_flg(value);
			return;
		}
		if ($dlv_flg.equalsIgnoreCase(name)) {
			dlv_flg(value);
			return;
		}
		if ($maker_flg.equalsIgnoreCase(name)) {
			maker_flg(value);
			return;
		}
		if ($dest_flg.equalsIgnoreCase(name)) {
			dest_flg(value);
			return;
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			subcon_flg(value);
			return;
		}
		if ($purc_upri_cng_flg.equalsIgnoreCase(name)) {
			purc_upri_cng_flg(value);
			return;
		}
		if ($purc_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			purc_tax_cd_prio_flg(value);
			return;
		}
		if ($wrk_po_flg.equalsIgnoreCase(name)) {
			wrk_po_flg(value);
			return;
		}
		if ($wrk_ap_flg.equalsIgnoreCase(name)) {
			wrk_ap_flg(value);
			return;
		}
		if ($onr_prsppl_flg.equalsIgnoreCase(name)) {
			onr_prsppl_flg(value);
			return;
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			repurc_obli_flg(value);
			return;
		}
		if ($prov_upri_cng_flg.equalsIgnoreCase(name)) {
			prov_upri_cng_flg(value);
			return;
		}
		if ($prov_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			prov_tax_cd_prio_flg(value);
			return;
		}
		if ($sppl_iv_flg.equalsIgnoreCase(name)) {
			sppl_iv_flg(value);
			return;
		}
		if ($prms_recv_flg.equalsIgnoreCase(name)) {
			prms_recv_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

