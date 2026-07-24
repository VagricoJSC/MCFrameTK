package mcframe.commonPFBA.PFBAR5710;

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
	 *  売掛先ＣＤ.<p>
	 *
	 */
	public static final String $acst_cd = "acst_cd";
	/**
	 *  得意先部署.<p>
	 *
	 */
	public static final String $cst_cntct_dpt = "cst_cntct_dpt";
	/**
	 *  得意先担当者.<p>
	 *
	 */
	public static final String $cst_cntct_psn = "cst_cntct_psn";
	/**
	 *  得意先担当者敬称.<p>
	 *
	 */
	public static final String $cst_cntct_psn_title = "cst_cntct_psn_title";
	/**
	 *  得意先諸口ＦＬＧ.<p>
	 *
	 */
	public static final String $cst_sundry_flg = "cst_sundry_flg";
	/**
	 *  販売単価取得区分.<p>
	 *
	 */
	public static final String $sls_upri_req_typ = "sls_upri_req_typ";
	/**
	 *  販売単価変更許可ＦＬＧ.<p>
	 *
	 */
	public static final String $sls_upri_cng_flg = "sls_upri_cng_flg";
	/**
	 *  販売単価端数処理区分.<p>
	 *
	 */
	public static final String $sls_upri_rnd_typ = "sls_upri_rnd_typ";
	/**
	 *  売上金額端数処理区分.<p>
	 *
	 */
	public static final String $sls_amt_rnd_typ = "sls_amt_rnd_typ";
	/**
	 *  売上税計算区分.<p>
	 *
	 */
	public static final String $sls_tax_calc_typ = "sls_tax_calc_typ";
	/**
	 *  売上税額端数処理区分.<p>
	 *
	 */
	public static final String $sls_tax_rnd_typ = "sls_tax_rnd_typ";
	/**
	 *  売上計上区分.<p>
	 *
	 */
	public static final String $sls_basis_typ = "sls_basis_typ";
	/**
	 *  請求起算区分.<p>
	 *
	 */
	public static final String $bill_basis_typ = "bill_basis_typ";
	/**
	 *  出荷予定分割区分.<p>
	 *
	 */
	public static final String $ship_schd_split_typ = "ship_schd_split_typ";
	/**
	 *  請求繰越回数.<p>
	 *
	 */
	public static final String $bill_crryovr_times = "bill_crryovr_times";
	/**
	 *  ロット逆転禁止区分.<p>
	 *
	 */
	public static final String $lot_back_stop_typ = "lot_back_stop_typ";
	/**
	 *  ロット明細分割区分.<p>
	 *
	 */
	public static final String $slip_each_lot_typ = "slip_each_lot_typ";
	/**
	 *  得意先納品書ＣＤ.<p>
	 *
	 */
	public static final String $cst_ship_form_cd = "cst_ship_form_cd";
	/**
	 *  現品票発行ＦＬＧ.<p>
	 *
	 */
	public static final String $stk_lst_issue_flg = "stk_lst_issue_flg";
	/**
	 *  現品票ＣＤ.<p>
	 *
	 */
	public static final String $stk_lst_form_cd = "stk_lst_form_cd";
	/**
	 *  売上税ＣＤ.<p>
	 *
	 */
	public static final String $sls_tax_cd = "sls_tax_cd";
	/**
	 *  売上税優先ＦＬＧ.<p>
	 *
	 */
	public static final String $sls_tax_cd_prio_flg = "sls_tax_cd_prio_flg";
	/**
	 *  案件別債権管理ＦＬＧ.<p>
	 *
	 */
	public static final String $wrk_ar_flg = "wrk_ar_flg";
	/**
	 *  得意先インボイス取引ＦＬＧ.<p>
	 *
	 */
	public static final String $cst_iv_flg = "cst_iv_flg";
	/**
	 *  得意先取引条件ＣＤ１.<p>
	 *
	 */
	public static final String $cst_tterm_cd1 = "cst_tterm_cd1";
	/**
	 *  得意先取引条件ＣＤ２.<p>
	 *
	 */
	public static final String $cst_tterm_cd2 = "cst_tterm_cd2";
	/**
	 *  得意先取引条件ＣＤ３.<p>
	 *
	 */
	public static final String $cst_tterm_cd3 = "cst_tterm_cd3";
	/**
	 *  販売分析ＣＤ１.<p>
	 *
	 */
	public static final String $sls_anly_cd1 = "sls_anly_cd1";
	/**
	 *  販売分析ＣＤ２.<p>
	 *
	 */
	public static final String $sls_anly_cd2 = "sls_anly_cd2";
	/**
	 *  販売分析ＣＤ３.<p>
	 *
	 */
	public static final String $sls_anly_cd3 = "sls_anly_cd3";
	/**
	 *  請求先ＣＤ.<p>
	 *
	 */
	public static final String $bcst_cd = "bcst_cd";
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
	 *  物流グループ混在不可ＦＬＧ.<p>
	 *
	 */
	public static final String $not_lg_mix_flg = "not_lg_mix_flg";
	/**
	 *  ロット混在不可ＦＬＧ.<p>
	 *
	 */
	public static final String $not_lot_mix_flg = "not_lot_mix_flg";
	/**
	 *  サブロット混在不可ＦＬＧ.<p>
	 *
	 */
	public static final String $not_sublot_mix_flg = "not_sublot_mix_flg";
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
	public static final MCMeta acst_cd_META = createCommonMeta($acst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cst_cntct_dpt_META = createCommonMeta($cst_cntct_dpt, mcframe.commonMA.meta.MA_META.CNTCT_DPT);
	public static final MCMeta cst_cntct_psn_META = createCommonMeta($cst_cntct_psn, mcframe.commonMA.meta.MA_META.CNTCT_PSN);
	public static final MCMeta cst_cntct_psn_title_META = createCommonMeta($cst_cntct_psn_title, mcframe.commonMA.meta.MA_META.BP_PSN_TITLE);
	public static final MCMeta cst_sundry_flg_META = createCommonMeta($cst_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_upri_req_typ_META = createCommonMeta($sls_upri_req_typ, mcframe.commonMA.meta.MA_META.SLS_UPRI_REQ_TYP);
	public static final MCMeta sls_upri_cng_flg_META = createCommonMeta($sls_upri_cng_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_upri_rnd_typ_META = createCommonMeta($sls_upri_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta sls_amt_rnd_typ_META = createCommonMeta($sls_amt_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta sls_tax_calc_typ_META = createCommonMeta($sls_tax_calc_typ, mcframe.commonMA.meta.MA_META.TAX_CALC_TYP);
	public static final MCMeta sls_tax_rnd_typ_META = createCommonMeta($sls_tax_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta sls_basis_typ_META = createCommonMeta($sls_basis_typ, mcframe.commonMA.meta.MA_META.SLS_BASIS_TYP);
	public static final MCMeta bill_basis_typ_META = createCommonMeta($bill_basis_typ, mcframe.commonMA.meta.MA_META.BILL_BASIS_TYP);
	public static final MCMeta ship_schd_split_typ_META = createCommonMeta($ship_schd_split_typ, mcframe.commonMA.meta.MA_META.SHIP_SCHD_SPLIT_TYP);
	public static final MCMeta bill_crryovr_times_META = createCommonMeta($bill_crryovr_times, mcframe.commonMA.meta.MA_META.CRRYOVR_TIMES);
	public static final MCMeta lot_back_stop_typ_META = createCommonMeta($lot_back_stop_typ, mcframe.commonMA.meta.MA_META.LOT_BACK_STOP_TYP);
	public static final MCMeta slip_each_lot_typ_META = createCommonMeta($slip_each_lot_typ, mcframe.commonMA.meta.MA_META.SLIP_EACH_LOT_TYP);
	public static final MCMeta cst_ship_form_cd_META = createCommonMeta($cst_ship_form_cd, mcframe.commonMA.meta.MA_META.SLIP_FORM_CD);
	public static final MCMeta stk_lst_issue_flg_META = createCommonMeta($stk_lst_issue_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_lst_form_cd_META = createCommonMeta($stk_lst_form_cd, mcframe.commonMA.meta.MA_META.SLIP_FORM_CD);
	public static final MCMeta sls_tax_cd_META = createCommonMeta($sls_tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta sls_tax_cd_prio_flg_META = createCommonMeta($sls_tax_cd_prio_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wrk_ar_flg_META = createCommonMeta($wrk_ar_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_iv_flg_META = createCommonMeta($cst_iv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_tterm_cd1_META = createCommonMeta($cst_tterm_cd1, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta cst_tterm_cd2_META = createCommonMeta($cst_tterm_cd2, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta cst_tterm_cd3_META = createCommonMeta($cst_tterm_cd3, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta sls_anly_cd1_META = createCommonMeta($sls_anly_cd1, mcframe.commonMA.meta.MA_META.SLS_ANLY_CD);
	public static final MCMeta sls_anly_cd2_META = createCommonMeta($sls_anly_cd2, mcframe.commonMA.meta.MA_META.SLS_ANLY_CD);
	public static final MCMeta sls_anly_cd3_META = createCommonMeta($sls_anly_cd3, mcframe.commonMA.meta.MA_META.SLS_ANLY_CD);
	public static final MCMeta bcst_cd_META = createCommonMeta($bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
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
	public static final MCMeta not_lg_mix_flg_META = createCommonMeta($not_lg_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_lot_mix_flg_META = createCommonMeta($not_lot_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_sublot_mix_flg_META = createCommonMeta($not_sublot_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
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
			acst_cd_META,
			cst_cntct_dpt_META,
			cst_cntct_psn_META,
			cst_cntct_psn_title_META,
			cst_sundry_flg_META,
			sls_upri_req_typ_META,
			sls_upri_cng_flg_META,
			sls_upri_rnd_typ_META,
			sls_amt_rnd_typ_META,
			sls_tax_calc_typ_META,
			sls_tax_rnd_typ_META,
			sls_basis_typ_META,
			bill_basis_typ_META,
			ship_schd_split_typ_META,
			bill_crryovr_times_META,
			lot_back_stop_typ_META,
			slip_each_lot_typ_META,
			cst_ship_form_cd_META,
			stk_lst_issue_flg_META,
			stk_lst_form_cd_META,
			sls_tax_cd_META,
			sls_tax_cd_prio_flg_META,
			wrk_ar_flg_META,
			cst_iv_flg_META,
			cst_tterm_cd1_META,
			cst_tterm_cd2_META,
			cst_tterm_cd3_META,
			sls_anly_cd1_META,
			sls_anly_cd2_META,
			sls_anly_cd3_META,
			bcst_cd_META,
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
			not_lg_mix_flg_META,
			not_lot_mix_flg_META,
			not_sublot_mix_flg_META,
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
	 *  売掛先ＣＤ.<p>
	 *
	 */
	public String acst_cd() {
		return getConstString(offset + 44, $acst_cd);
	}

	/**
	 *  売掛先ＣＤ.<p>
	 *
	 */
	public void acst_cd(String value) {
		setConstString(offset + 44, $acst_cd, value);
	}


	/**
	 *  得意先部署.<p>
	 *
	 */
	public String cst_cntct_dpt() {
		return getConstString(offset + 45, $cst_cntct_dpt);
	}

	/**
	 *  得意先部署.<p>
	 *
	 */
	public void cst_cntct_dpt(String value) {
		setConstString(offset + 45, $cst_cntct_dpt, value);
	}


	/**
	 *  得意先担当者.<p>
	 *
	 */
	public String cst_cntct_psn() {
		return getConstString(offset + 46, $cst_cntct_psn);
	}

	/**
	 *  得意先担当者.<p>
	 *
	 */
	public void cst_cntct_psn(String value) {
		setConstString(offset + 46, $cst_cntct_psn, value);
	}


	/**
	 *  得意先担当者敬称.<p>
	 *
	 */
	public String cst_cntct_psn_title() {
		return getConstString(offset + 47, $cst_cntct_psn_title);
	}

	/**
	 *  得意先担当者敬称.<p>
	 *
	 */
	public void cst_cntct_psn_title(String value) {
		setConstString(offset + 47, $cst_cntct_psn_title, value);
	}


	/**
	 *  得意先諸口ＦＬＧ.<p>
	 *
	 */
	public boolean cst_sundry_flg() {
		return getConstBoolean(offset + 48, $cst_sundry_flg);
	}

	/**
	 *  得意先諸口ＦＬＧ.<p>
	 *
	 */
	public void cst_sundry_flg(boolean value) {
		setConstBoolean(offset + 48, $cst_sundry_flg, value);
	}


	/**
	 *  販売単価取得区分.<p>
	 *
	 */
	public String sls_upri_req_typ() {
		return getConstString(offset + 49, $sls_upri_req_typ);
	}

	/**
	 *  販売単価取得区分.<p>
	 *
	 */
	public void sls_upri_req_typ(String value) {
		setConstString(offset + 49, $sls_upri_req_typ, value);
	}


	/**
	 *  販売単価変更許可ＦＬＧ.<p>
	 *
	 */
	public boolean sls_upri_cng_flg() {
		return getConstBoolean(offset + 50, $sls_upri_cng_flg);
	}

	/**
	 *  販売単価変更許可ＦＬＧ.<p>
	 *
	 */
	public void sls_upri_cng_flg(boolean value) {
		setConstBoolean(offset + 50, $sls_upri_cng_flg, value);
	}


	/**
	 *  販売単価端数処理区分.<p>
	 *
	 */
	public String sls_upri_rnd_typ() {
		return getConstString(offset + 51, $sls_upri_rnd_typ);
	}

	/**
	 *  販売単価端数処理区分.<p>
	 *
	 */
	public void sls_upri_rnd_typ(String value) {
		setConstString(offset + 51, $sls_upri_rnd_typ, value);
	}


	/**
	 *  売上金額端数処理区分.<p>
	 *
	 */
	public String sls_amt_rnd_typ() {
		return getConstString(offset + 52, $sls_amt_rnd_typ);
	}

	/**
	 *  売上金額端数処理区分.<p>
	 *
	 */
	public void sls_amt_rnd_typ(String value) {
		setConstString(offset + 52, $sls_amt_rnd_typ, value);
	}


	/**
	 *  売上税計算区分.<p>
	 *
	 */
	public String sls_tax_calc_typ() {
		return getConstString(offset + 53, $sls_tax_calc_typ);
	}

	/**
	 *  売上税計算区分.<p>
	 *
	 */
	public void sls_tax_calc_typ(String value) {
		setConstString(offset + 53, $sls_tax_calc_typ, value);
	}


	/**
	 *  売上税額端数処理区分.<p>
	 *
	 */
	public String sls_tax_rnd_typ() {
		return getConstString(offset + 54, $sls_tax_rnd_typ);
	}

	/**
	 *  売上税額端数処理区分.<p>
	 *
	 */
	public void sls_tax_rnd_typ(String value) {
		setConstString(offset + 54, $sls_tax_rnd_typ, value);
	}


	/**
	 *  売上計上区分.<p>
	 *
	 */
	public String sls_basis_typ() {
		return getConstString(offset + 55, $sls_basis_typ);
	}

	/**
	 *  売上計上区分.<p>
	 *
	 */
	public void sls_basis_typ(String value) {
		setConstString(offset + 55, $sls_basis_typ, value);
	}


	/**
	 *  請求起算区分.<p>
	 *
	 */
	public String bill_basis_typ() {
		return getConstString(offset + 56, $bill_basis_typ);
	}

	/**
	 *  請求起算区分.<p>
	 *
	 */
	public void bill_basis_typ(String value) {
		setConstString(offset + 56, $bill_basis_typ, value);
	}


	/**
	 *  出荷予定分割区分.<p>
	 *
	 */
	public String ship_schd_split_typ() {
		return getConstString(offset + 57, $ship_schd_split_typ);
	}

	/**
	 *  出荷予定分割区分.<p>
	 *
	 */
	public void ship_schd_split_typ(String value) {
		setConstString(offset + 57, $ship_schd_split_typ, value);
	}


	/**
	 *  請求繰越回数.<p>
	 *
	 */
	public MCNumber bill_crryovr_times() {
		return getConstNumber(offset + 58, $bill_crryovr_times);
	}

	/**
	 *  請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(MCNumber value) {
		setConstNumber(offset + 58, $bill_crryovr_times, value);
	}

	/**
	 *  請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(int value) {
		setConstNumber(offset + 58, $bill_crryovr_times, value);
	}

	/**
	 *  請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(long value) {
		setConstNumber(offset + 58, $bill_crryovr_times, value);
	}

	/**
	 *  請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(float value) {
		setConstNumber(offset + 58, $bill_crryovr_times, value);
	}

	/**
	 *  請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(double value) {
		setConstNumber(offset + 58, $bill_crryovr_times, value);
	}


	/**
	 *  ロット逆転禁止区分.<p>
	 *
	 */
	public String lot_back_stop_typ() {
		return getConstString(offset + 59, $lot_back_stop_typ);
	}

	/**
	 *  ロット逆転禁止区分.<p>
	 *
	 */
	public void lot_back_stop_typ(String value) {
		setConstString(offset + 59, $lot_back_stop_typ, value);
	}


	/**
	 *  ロット明細分割区分.<p>
	 *
	 */
	public String slip_each_lot_typ() {
		return getConstString(offset + 60, $slip_each_lot_typ);
	}

	/**
	 *  ロット明細分割区分.<p>
	 *
	 */
	public void slip_each_lot_typ(String value) {
		setConstString(offset + 60, $slip_each_lot_typ, value);
	}


	/**
	 *  得意先納品書ＣＤ.<p>
	 *
	 */
	public String cst_ship_form_cd() {
		return getConstString(offset + 61, $cst_ship_form_cd);
	}

	/**
	 *  得意先納品書ＣＤ.<p>
	 *
	 */
	public void cst_ship_form_cd(String value) {
		setConstString(offset + 61, $cst_ship_form_cd, value);
	}


	/**
	 *  現品票発行ＦＬＧ.<p>
	 *
	 */
	public boolean stk_lst_issue_flg() {
		return getConstBoolean(offset + 62, $stk_lst_issue_flg);
	}

	/**
	 *  現品票発行ＦＬＧ.<p>
	 *
	 */
	public void stk_lst_issue_flg(boolean value) {
		setConstBoolean(offset + 62, $stk_lst_issue_flg, value);
	}


	/**
	 *  現品票ＣＤ.<p>
	 *
	 */
	public String stk_lst_form_cd() {
		return getConstString(offset + 63, $stk_lst_form_cd);
	}

	/**
	 *  現品票ＣＤ.<p>
	 *
	 */
	public void stk_lst_form_cd(String value) {
		setConstString(offset + 63, $stk_lst_form_cd, value);
	}


	/**
	 *  売上税ＣＤ.<p>
	 *
	 */
	public String sls_tax_cd() {
		return getConstString(offset + 64, $sls_tax_cd);
	}

	/**
	 *  売上税ＣＤ.<p>
	 *
	 */
	public void sls_tax_cd(String value) {
		setConstString(offset + 64, $sls_tax_cd, value);
	}


	/**
	 *  売上税優先ＦＬＧ.<p>
	 *
	 */
	public boolean sls_tax_cd_prio_flg() {
		return getConstBoolean(offset + 65, $sls_tax_cd_prio_flg);
	}

	/**
	 *  売上税優先ＦＬＧ.<p>
	 *
	 */
	public void sls_tax_cd_prio_flg(boolean value) {
		setConstBoolean(offset + 65, $sls_tax_cd_prio_flg, value);
	}


	/**
	 *  案件別債権管理ＦＬＧ.<p>
	 *
	 */
	public boolean wrk_ar_flg() {
		return getConstBoolean(offset + 66, $wrk_ar_flg);
	}

	/**
	 *  案件別債権管理ＦＬＧ.<p>
	 *
	 */
	public void wrk_ar_flg(boolean value) {
		setConstBoolean(offset + 66, $wrk_ar_flg, value);
	}


	/**
	 *  得意先インボイス取引ＦＬＧ.<p>
	 *
	 */
	public boolean cst_iv_flg() {
		return getConstBoolean(offset + 67, $cst_iv_flg);
	}

	/**
	 *  得意先インボイス取引ＦＬＧ.<p>
	 *
	 */
	public void cst_iv_flg(boolean value) {
		setConstBoolean(offset + 67, $cst_iv_flg, value);
	}


	/**
	 *  得意先取引条件ＣＤ１.<p>
	 *
	 */
	public String cst_tterm_cd1() {
		return getConstString(offset + 68, $cst_tterm_cd1);
	}

	/**
	 *  得意先取引条件ＣＤ１.<p>
	 *
	 */
	public void cst_tterm_cd1(String value) {
		setConstString(offset + 68, $cst_tterm_cd1, value);
	}


	/**
	 *  得意先取引条件ＣＤ２.<p>
	 *
	 */
	public String cst_tterm_cd2() {
		return getConstString(offset + 69, $cst_tterm_cd2);
	}

	/**
	 *  得意先取引条件ＣＤ２.<p>
	 *
	 */
	public void cst_tterm_cd2(String value) {
		setConstString(offset + 69, $cst_tterm_cd2, value);
	}


	/**
	 *  得意先取引条件ＣＤ３.<p>
	 *
	 */
	public String cst_tterm_cd3() {
		return getConstString(offset + 70, $cst_tterm_cd3);
	}

	/**
	 *  得意先取引条件ＣＤ３.<p>
	 *
	 */
	public void cst_tterm_cd3(String value) {
		setConstString(offset + 70, $cst_tterm_cd3, value);
	}


	/**
	 *  販売分析ＣＤ１.<p>
	 *
	 */
	public String sls_anly_cd1() {
		return getConstString(offset + 71, $sls_anly_cd1);
	}

	/**
	 *  販売分析ＣＤ１.<p>
	 *
	 */
	public void sls_anly_cd1(String value) {
		setConstString(offset + 71, $sls_anly_cd1, value);
	}


	/**
	 *  販売分析ＣＤ２.<p>
	 *
	 */
	public String sls_anly_cd2() {
		return getConstString(offset + 72, $sls_anly_cd2);
	}

	/**
	 *  販売分析ＣＤ２.<p>
	 *
	 */
	public void sls_anly_cd2(String value) {
		setConstString(offset + 72, $sls_anly_cd2, value);
	}


	/**
	 *  販売分析ＣＤ３.<p>
	 *
	 */
	public String sls_anly_cd3() {
		return getConstString(offset + 73, $sls_anly_cd3);
	}

	/**
	 *  販売分析ＣＤ３.<p>
	 *
	 */
	public void sls_anly_cd3(String value) {
		setConstString(offset + 73, $sls_anly_cd3, value);
	}


	/**
	 *  請求先ＣＤ.<p>
	 *
	 */
	public String bcst_cd() {
		return getConstString(offset + 74, $bcst_cd);
	}

	/**
	 *  請求先ＣＤ.<p>
	 *
	 */
	public void bcst_cd(String value) {
		setConstString(offset + 74, $bcst_cd, value);
	}


	/**
	 *  メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 75, $memo1);
	}

	/**
	 *  メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 75, $memo1, value);
	}


	/**
	 *  メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 76, $memo2);
	}

	/**
	 *  メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 76, $memo2, value);
	}


	/**
	 *  メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 77, $memo3);
	}

	/**
	 *  メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 77, $memo3, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public String if_sub_char1() {
		return getConstString(offset + 78, $if_sub_char1);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public void if_sub_char1(String value) {
		setConstString(offset + 78, $if_sub_char1, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public String if_sub_char2() {
		return getConstString(offset + 79, $if_sub_char2);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public void if_sub_char2(String value) {
		setConstString(offset + 79, $if_sub_char2, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public String if_sub_char3() {
		return getConstString(offset + 80, $if_sub_char3);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public void if_sub_char3(String value) {
		setConstString(offset + 80, $if_sub_char3, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public String if_sub_char4() {
		return getConstString(offset + 81, $if_sub_char4);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public void if_sub_char4(String value) {
		setConstString(offset + 81, $if_sub_char4, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public String if_sub_char5() {
		return getConstString(offset + 82, $if_sub_char5);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public void if_sub_char5(String value) {
		setConstString(offset + 82, $if_sub_char5, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目６.<p>
	 *
	 */
	public String if_sub_char6() {
		return getConstString(offset + 83, $if_sub_char6);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目６.<p>
	 *
	 */
	public void if_sub_char6(String value) {
		setConstString(offset + 83, $if_sub_char6, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目７.<p>
	 *
	 */
	public String if_sub_char7() {
		return getConstString(offset + 84, $if_sub_char7);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目７.<p>
	 *
	 */
	public void if_sub_char7(String value) {
		setConstString(offset + 84, $if_sub_char7, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目８.<p>
	 *
	 */
	public String if_sub_char8() {
		return getConstString(offset + 85, $if_sub_char8);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目８.<p>
	 *
	 */
	public void if_sub_char8(String value) {
		setConstString(offset + 85, $if_sub_char8, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目９.<p>
	 *
	 */
	public String if_sub_char9() {
		return getConstString(offset + 86, $if_sub_char9);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目９.<p>
	 *
	 */
	public void if_sub_char9(String value) {
		setConstString(offset + 86, $if_sub_char9, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目１０.<p>
	 *
	 */
	public String if_sub_char10() {
		return getConstString(offset + 87, $if_sub_char10);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目１０.<p>
	 *
	 */
	public void if_sub_char10(String value) {
		setConstString(offset + 87, $if_sub_char10, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目１１.<p>
	 *
	 */
	public String if_sub_char11() {
		return getConstString(offset + 88, $if_sub_char11);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目１１.<p>
	 *
	 */
	public void if_sub_char11(String value) {
		setConstString(offset + 88, $if_sub_char11, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目１２.<p>
	 *
	 */
	public String if_sub_char12() {
		return getConstString(offset + 89, $if_sub_char12);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目１２.<p>
	 *
	 */
	public void if_sub_char12(String value) {
		setConstString(offset + 89, $if_sub_char12, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目１３.<p>
	 *
	 */
	public String if_sub_char13() {
		return getConstString(offset + 90, $if_sub_char13);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目１３.<p>
	 *
	 */
	public void if_sub_char13(String value) {
		setConstString(offset + 90, $if_sub_char13, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目１４.<p>
	 *
	 */
	public String if_sub_char14() {
		return getConstString(offset + 91, $if_sub_char14);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目１４.<p>
	 *
	 */
	public void if_sub_char14(String value) {
		setConstString(offset + 91, $if_sub_char14, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目１５.<p>
	 *
	 */
	public String if_sub_char15() {
		return getConstString(offset + 92, $if_sub_char15);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目１５.<p>
	 *
	 */
	public void if_sub_char15(String value) {
		setConstString(offset + 92, $if_sub_char15, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目１６.<p>
	 *
	 */
	public String if_sub_char16() {
		return getConstString(offset + 93, $if_sub_char16);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目１６.<p>
	 *
	 */
	public void if_sub_char16(String value) {
		setConstString(offset + 93, $if_sub_char16, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目１７.<p>
	 *
	 */
	public String if_sub_char17() {
		return getConstString(offset + 94, $if_sub_char17);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目１７.<p>
	 *
	 */
	public void if_sub_char17(String value) {
		setConstString(offset + 94, $if_sub_char17, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目１８.<p>
	 *
	 */
	public String if_sub_char18() {
		return getConstString(offset + 95, $if_sub_char18);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目１８.<p>
	 *
	 */
	public void if_sub_char18(String value) {
		setConstString(offset + 95, $if_sub_char18, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目１９.<p>
	 *
	 */
	public String if_sub_char19() {
		return getConstString(offset + 96, $if_sub_char19);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目１９.<p>
	 *
	 */
	public void if_sub_char19(String value) {
		setConstString(offset + 96, $if_sub_char19, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目２０.<p>
	 *
	 */
	public String if_sub_char20() {
		return getConstString(offset + 97, $if_sub_char20);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目２０.<p>
	 *
	 */
	public void if_sub_char20(String value) {
		setConstString(offset + 97, $if_sub_char20, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目２１.<p>
	 *
	 */
	public String if_sub_char21() {
		return getConstString(offset + 98, $if_sub_char21);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目２１.<p>
	 *
	 */
	public void if_sub_char21(String value) {
		setConstString(offset + 98, $if_sub_char21, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目２２.<p>
	 *
	 */
	public String if_sub_char22() {
		return getConstString(offset + 99, $if_sub_char22);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目２２.<p>
	 *
	 */
	public void if_sub_char22(String value) {
		setConstString(offset + 99, $if_sub_char22, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目２３.<p>
	 *
	 */
	public String if_sub_char23() {
		return getConstString(offset + 100, $if_sub_char23);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目２３.<p>
	 *
	 */
	public void if_sub_char23(String value) {
		setConstString(offset + 100, $if_sub_char23, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目２４.<p>
	 *
	 */
	public String if_sub_char24() {
		return getConstString(offset + 101, $if_sub_char24);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目２４.<p>
	 *
	 */
	public void if_sub_char24(String value) {
		setConstString(offset + 101, $if_sub_char24, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目２５.<p>
	 *
	 */
	public String if_sub_char25() {
		return getConstString(offset + 102, $if_sub_char25);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目２５.<p>
	 *
	 */
	public void if_sub_char25(String value) {
		setConstString(offset + 102, $if_sub_char25, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目２６.<p>
	 *
	 */
	public String if_sub_char26() {
		return getConstString(offset + 103, $if_sub_char26);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目２６.<p>
	 *
	 */
	public void if_sub_char26(String value) {
		setConstString(offset + 103, $if_sub_char26, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目２７.<p>
	 *
	 */
	public String if_sub_char27() {
		return getConstString(offset + 104, $if_sub_char27);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目２７.<p>
	 *
	 */
	public void if_sub_char27(String value) {
		setConstString(offset + 104, $if_sub_char27, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目２８.<p>
	 *
	 */
	public String if_sub_char28() {
		return getConstString(offset + 105, $if_sub_char28);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目２８.<p>
	 *
	 */
	public void if_sub_char28(String value) {
		setConstString(offset + 105, $if_sub_char28, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目２９.<p>
	 *
	 */
	public String if_sub_char29() {
		return getConstString(offset + 106, $if_sub_char29);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目２９.<p>
	 *
	 */
	public void if_sub_char29(String value) {
		setConstString(offset + 106, $if_sub_char29, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目３０.<p>
	 *
	 */
	public String if_sub_char30() {
		return getConstString(offset + 107, $if_sub_char30);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目３０.<p>
	 *
	 */
	public void if_sub_char30(String value) {
		setConstString(offset + 107, $if_sub_char30, value);
	}


	/**
	 *  ＩＦ予備ＮＵＭ項目１.<p>
	 *
	 */
	public MCNumber if_sub_num1() {
		return getConstNumber(offset + 108, $if_sub_num1);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目１.<p>
	 *
	 */
	public void if_sub_num1(MCNumber value) {
		setConstNumber(offset + 108, $if_sub_num1, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目１.<p>
	 *
	 */
	public void if_sub_num1(int value) {
		setConstNumber(offset + 108, $if_sub_num1, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目１.<p>
	 *
	 */
	public void if_sub_num1(long value) {
		setConstNumber(offset + 108, $if_sub_num1, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目１.<p>
	 *
	 */
	public void if_sub_num1(float value) {
		setConstNumber(offset + 108, $if_sub_num1, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目１.<p>
	 *
	 */
	public void if_sub_num1(double value) {
		setConstNumber(offset + 108, $if_sub_num1, value);
	}


	/**
	 *  ＩＦ予備ＮＵＭ項目２.<p>
	 *
	 */
	public MCNumber if_sub_num2() {
		return getConstNumber(offset + 109, $if_sub_num2);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目２.<p>
	 *
	 */
	public void if_sub_num2(MCNumber value) {
		setConstNumber(offset + 109, $if_sub_num2, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目２.<p>
	 *
	 */
	public void if_sub_num2(int value) {
		setConstNumber(offset + 109, $if_sub_num2, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目２.<p>
	 *
	 */
	public void if_sub_num2(long value) {
		setConstNumber(offset + 109, $if_sub_num2, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目２.<p>
	 *
	 */
	public void if_sub_num2(float value) {
		setConstNumber(offset + 109, $if_sub_num2, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目２.<p>
	 *
	 */
	public void if_sub_num2(double value) {
		setConstNumber(offset + 109, $if_sub_num2, value);
	}


	/**
	 *  ＩＦ予備ＮＵＭ項目３.<p>
	 *
	 */
	public MCNumber if_sub_num3() {
		return getConstNumber(offset + 110, $if_sub_num3);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目３.<p>
	 *
	 */
	public void if_sub_num3(MCNumber value) {
		setConstNumber(offset + 110, $if_sub_num3, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目３.<p>
	 *
	 */
	public void if_sub_num3(int value) {
		setConstNumber(offset + 110, $if_sub_num3, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目３.<p>
	 *
	 */
	public void if_sub_num3(long value) {
		setConstNumber(offset + 110, $if_sub_num3, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目３.<p>
	 *
	 */
	public void if_sub_num3(float value) {
		setConstNumber(offset + 110, $if_sub_num3, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目３.<p>
	 *
	 */
	public void if_sub_num3(double value) {
		setConstNumber(offset + 110, $if_sub_num3, value);
	}


	/**
	 *  ＩＦ予備ＮＵＭ項目４.<p>
	 *
	 */
	public MCNumber if_sub_num4() {
		return getConstNumber(offset + 111, $if_sub_num4);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目４.<p>
	 *
	 */
	public void if_sub_num4(MCNumber value) {
		setConstNumber(offset + 111, $if_sub_num4, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目４.<p>
	 *
	 */
	public void if_sub_num4(int value) {
		setConstNumber(offset + 111, $if_sub_num4, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目４.<p>
	 *
	 */
	public void if_sub_num4(long value) {
		setConstNumber(offset + 111, $if_sub_num4, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目４.<p>
	 *
	 */
	public void if_sub_num4(float value) {
		setConstNumber(offset + 111, $if_sub_num4, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目４.<p>
	 *
	 */
	public void if_sub_num4(double value) {
		setConstNumber(offset + 111, $if_sub_num4, value);
	}


	/**
	 *  ＩＦ予備ＮＵＭ項目５.<p>
	 *
	 */
	public MCNumber if_sub_num5() {
		return getConstNumber(offset + 112, $if_sub_num5);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目５.<p>
	 *
	 */
	public void if_sub_num5(MCNumber value) {
		setConstNumber(offset + 112, $if_sub_num5, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目５.<p>
	 *
	 */
	public void if_sub_num5(int value) {
		setConstNumber(offset + 112, $if_sub_num5, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目５.<p>
	 *
	 */
	public void if_sub_num5(long value) {
		setConstNumber(offset + 112, $if_sub_num5, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目５.<p>
	 *
	 */
	public void if_sub_num5(float value) {
		setConstNumber(offset + 112, $if_sub_num5, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目５.<p>
	 *
	 */
	public void if_sub_num5(double value) {
		setConstNumber(offset + 112, $if_sub_num5, value);
	}


	/**
	 *  ＩＦ予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public MCDate if_sub_dt1() {
		return getConstDate(offset + 113, $if_sub_dt1);
	}

	/**
	 *  ＩＦ予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public void if_sub_dt1(MCDate value) {
		setConstDate(offset + 113, $if_sub_dt1, value);
	}


	/**
	 *  ＩＦ予備ＤＡＴＥ項目２.<p>
	 *
	 */
	public MCDate if_sub_dt2() {
		return getConstDate(offset + 114, $if_sub_dt2);
	}

	/**
	 *  ＩＦ予備ＤＡＴＥ項目２.<p>
	 *
	 */
	public void if_sub_dt2(MCDate value) {
		setConstDate(offset + 114, $if_sub_dt2, value);
	}


	/**
	 *  ＩＦ予備ＤＡＴＥ項目３.<p>
	 *
	 */
	public MCDate if_sub_dt3() {
		return getConstDate(offset + 115, $if_sub_dt3);
	}

	/**
	 *  ＩＦ予備ＤＡＴＥ項目３.<p>
	 *
	 */
	public void if_sub_dt3(MCDate value) {
		setConstDate(offset + 115, $if_sub_dt3, value);
	}


	/**
	 *  ＩＦ予備ＤＡＴＥ項目４.<p>
	 *
	 */
	public MCDate if_sub_dt4() {
		return getConstDate(offset + 116, $if_sub_dt4);
	}

	/**
	 *  ＩＦ予備ＤＡＴＥ項目４.<p>
	 *
	 */
	public void if_sub_dt4(MCDate value) {
		setConstDate(offset + 116, $if_sub_dt4, value);
	}


	/**
	 *  ＩＦ予備ＤＡＴＥ項目５.<p>
	 *
	 */
	public MCDate if_sub_dt5() {
		return getConstDate(offset + 117, $if_sub_dt5);
	}

	/**
	 *  ＩＦ予備ＤＡＴＥ項目５.<p>
	 *
	 */
	public void if_sub_dt5(MCDate value) {
		setConstDate(offset + 117, $if_sub_dt5, value);
	}


	/**
	 *  メモ４.<p>
	 *
	 */
	public String memo4() {
		return getConstString(offset + 118, $memo4);
	}

	/**
	 *  メモ４.<p>
	 *
	 */
	public void memo4(String value) {
		setConstString(offset + 118, $memo4, value);
	}


	/**
	 *  メモ５.<p>
	 *
	 */
	public String memo5() {
		return getConstString(offset + 119, $memo5);
	}

	/**
	 *  メモ５.<p>
	 *
	 */
	public void memo5(String value) {
		setConstString(offset + 119, $memo5, value);
	}


	/**
	 *  メモ６.<p>
	 *
	 */
	public String memo6() {
		return getConstString(offset + 120, $memo6);
	}

	/**
	 *  メモ６.<p>
	 *
	 */
	public void memo6(String value) {
		setConstString(offset + 120, $memo6, value);
	}


	/**
	 *  メモ７.<p>
	 *
	 */
	public String memo7() {
		return getConstString(offset + 121, $memo7);
	}

	/**
	 *  メモ７.<p>
	 *
	 */
	public void memo7(String value) {
		setConstString(offset + 121, $memo7, value);
	}


	/**
	 *  メモ８.<p>
	 *
	 */
	public String memo8() {
		return getConstString(offset + 122, $memo8);
	}

	/**
	 *  メモ８.<p>
	 *
	 */
	public void memo8(String value) {
		setConstString(offset + 122, $memo8, value);
	}


	/**
	 *  メモ９.<p>
	 *
	 */
	public String memo9() {
		return getConstString(offset + 123, $memo9);
	}

	/**
	 *  メモ９.<p>
	 *
	 */
	public void memo9(String value) {
		setConstString(offset + 123, $memo9, value);
	}


	/**
	 *  メモ１０.<p>
	 *
	 */
	public String memo10() {
		return getConstString(offset + 124, $memo10);
	}

	/**
	 *  メモ１０.<p>
	 *
	 */
	public void memo10(String value) {
		setConstString(offset + 124, $memo10, value);
	}


	/**
	 *  メモ１１.<p>
	 *
	 */
	public String memo11() {
		return getConstString(offset + 125, $memo11);
	}

	/**
	 *  メモ１１.<p>
	 *
	 */
	public void memo11(String value) {
		setConstString(offset + 125, $memo11, value);
	}


	/**
	 *  メモ１２.<p>
	 *
	 */
	public String memo12() {
		return getConstString(offset + 126, $memo12);
	}

	/**
	 *  メモ１２.<p>
	 *
	 */
	public void memo12(String value) {
		setConstString(offset + 126, $memo12, value);
	}


	/**
	 *  メモ１３.<p>
	 *
	 */
	public String memo13() {
		return getConstString(offset + 127, $memo13);
	}

	/**
	 *  メモ１３.<p>
	 *
	 */
	public void memo13(String value) {
		setConstString(offset + 127, $memo13, value);
	}


	/**
	 *  メモ１４.<p>
	 *
	 */
	public String memo14() {
		return getConstString(offset + 128, $memo14);
	}

	/**
	 *  メモ１４.<p>
	 *
	 */
	public void memo14(String value) {
		setConstString(offset + 128, $memo14, value);
	}


	/**
	 *  メモ１５.<p>
	 *
	 */
	public String memo15() {
		return getConstString(offset + 129, $memo15);
	}

	/**
	 *  メモ１５.<p>
	 *
	 */
	public void memo15(String value) {
		setConstString(offset + 129, $memo15, value);
	}


	/**
	 *  メモ１６.<p>
	 *
	 */
	public String memo16() {
		return getConstString(offset + 130, $memo16);
	}

	/**
	 *  メモ１６.<p>
	 *
	 */
	public void memo16(String value) {
		setConstString(offset + 130, $memo16, value);
	}


	/**
	 *  メモ１７.<p>
	 *
	 */
	public String memo17() {
		return getConstString(offset + 131, $memo17);
	}

	/**
	 *  メモ１７.<p>
	 *
	 */
	public void memo17(String value) {
		setConstString(offset + 131, $memo17, value);
	}


	/**
	 *  メモ１８.<p>
	 *
	 */
	public String memo18() {
		return getConstString(offset + 132, $memo18);
	}

	/**
	 *  メモ１８.<p>
	 *
	 */
	public void memo18(String value) {
		setConstString(offset + 132, $memo18, value);
	}


	/**
	 *  メモ１９.<p>
	 *
	 */
	public String memo19() {
		return getConstString(offset + 133, $memo19);
	}

	/**
	 *  メモ１９.<p>
	 *
	 */
	public void memo19(String value) {
		setConstString(offset + 133, $memo19, value);
	}


	/**
	 *  メモ２０.<p>
	 *
	 */
	public String memo20() {
		return getConstString(offset + 134, $memo20);
	}

	/**
	 *  メモ２０.<p>
	 *
	 */
	public void memo20(String value) {
		setConstString(offset + 134, $memo20, value);
	}


	/**
	 *  物流グループ混在不可ＦＬＧ.<p>
	 *
	 */
	public boolean not_lg_mix_flg() {
		return getConstBoolean(offset + 135, $not_lg_mix_flg);
	}

	/**
	 *  物流グループ混在不可ＦＬＧ.<p>
	 *
	 */
	public void not_lg_mix_flg(boolean value) {
		setConstBoolean(offset + 135, $not_lg_mix_flg, value);
	}


	/**
	 *  ロット混在不可ＦＬＧ.<p>
	 *
	 */
	public boolean not_lot_mix_flg() {
		return getConstBoolean(offset + 136, $not_lot_mix_flg);
	}

	/**
	 *  ロット混在不可ＦＬＧ.<p>
	 *
	 */
	public void not_lot_mix_flg(boolean value) {
		setConstBoolean(offset + 136, $not_lot_mix_flg, value);
	}


	/**
	 *  サブロット混在不可ＦＬＧ.<p>
	 *
	 */
	public boolean not_sublot_mix_flg() {
		return getConstBoolean(offset + 137, $not_sublot_mix_flg);
	}

	/**
	 *  サブロット混在不可ＦＬＧ.<p>
	 *
	 */
	public void not_sublot_mix_flg(boolean value) {
		setConstBoolean(offset + 137, $not_sublot_mix_flg, value);
	}


	/**
	 *  事業者ＮＯ.<p>
	 *
	 */
	public String biz_co_no() {
		return getConstString(offset + 138, $biz_co_no);
	}

	/**
	 *  事業者ＮＯ.<p>
	 *
	 */
	public void biz_co_no(String value) {
		setConstString(offset + 138, $biz_co_no, value);
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
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($cst_cntct_dpt.equalsIgnoreCase(name)) {
			return cst_cntct_dpt();
		}
		if ($cst_cntct_psn.equalsIgnoreCase(name)) {
			return cst_cntct_psn();
		}
		if ($cst_cntct_psn_title.equalsIgnoreCase(name)) {
			return cst_cntct_psn_title();
		}
		if ($sls_upri_req_typ.equalsIgnoreCase(name)) {
			return sls_upri_req_typ();
		}
		if ($sls_upri_rnd_typ.equalsIgnoreCase(name)) {
			return sls_upri_rnd_typ();
		}
		if ($sls_amt_rnd_typ.equalsIgnoreCase(name)) {
			return sls_amt_rnd_typ();
		}
		if ($sls_tax_calc_typ.equalsIgnoreCase(name)) {
			return sls_tax_calc_typ();
		}
		if ($sls_tax_rnd_typ.equalsIgnoreCase(name)) {
			return sls_tax_rnd_typ();
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			return sls_basis_typ();
		}
		if ($bill_basis_typ.equalsIgnoreCase(name)) {
			return bill_basis_typ();
		}
		if ($ship_schd_split_typ.equalsIgnoreCase(name)) {
			return ship_schd_split_typ();
		}
		if ($lot_back_stop_typ.equalsIgnoreCase(name)) {
			return lot_back_stop_typ();
		}
		if ($slip_each_lot_typ.equalsIgnoreCase(name)) {
			return slip_each_lot_typ();
		}
		if ($cst_ship_form_cd.equalsIgnoreCase(name)) {
			return cst_ship_form_cd();
		}
		if ($stk_lst_form_cd.equalsIgnoreCase(name)) {
			return stk_lst_form_cd();
		}
		if ($sls_tax_cd.equalsIgnoreCase(name)) {
			return sls_tax_cd();
		}
		if ($cst_tterm_cd1.equalsIgnoreCase(name)) {
			return cst_tterm_cd1();
		}
		if ($cst_tterm_cd2.equalsIgnoreCase(name)) {
			return cst_tterm_cd2();
		}
		if ($cst_tterm_cd3.equalsIgnoreCase(name)) {
			return cst_tterm_cd3();
		}
		if ($sls_anly_cd1.equalsIgnoreCase(name)) {
			return sls_anly_cd1();
		}
		if ($sls_anly_cd2.equalsIgnoreCase(name)) {
			return sls_anly_cd2();
		}
		if ($sls_anly_cd3.equalsIgnoreCase(name)) {
			return sls_anly_cd3();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
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
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			return bill_crryovr_times();
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
		if ($cst_sundry_flg.equalsIgnoreCase(name)) {
			return cst_sundry_flg();
		}
		if ($sls_upri_cng_flg.equalsIgnoreCase(name)) {
			return sls_upri_cng_flg();
		}
		if ($stk_lst_issue_flg.equalsIgnoreCase(name)) {
			return stk_lst_issue_flg();
		}
		if ($sls_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			return sls_tax_cd_prio_flg();
		}
		if ($wrk_ar_flg.equalsIgnoreCase(name)) {
			return wrk_ar_flg();
		}
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			return cst_iv_flg();
		}
		if ($not_lg_mix_flg.equalsIgnoreCase(name)) {
			return not_lg_mix_flg();
		}
		if ($not_lot_mix_flg.equalsIgnoreCase(name)) {
			return not_lot_mix_flg();
		}
		if ($not_sublot_mix_flg.equalsIgnoreCase(name)) {
			return not_sublot_mix_flg();
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
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($cst_cntct_dpt.equalsIgnoreCase(name)) {
			return cst_cntct_dpt();
		}
		if ($cst_cntct_psn.equalsIgnoreCase(name)) {
			return cst_cntct_psn();
		}
		if ($cst_cntct_psn_title.equalsIgnoreCase(name)) {
			return cst_cntct_psn_title();
		}
		if ($sls_upri_req_typ.equalsIgnoreCase(name)) {
			return sls_upri_req_typ();
		}
		if ($sls_upri_rnd_typ.equalsIgnoreCase(name)) {
			return sls_upri_rnd_typ();
		}
		if ($sls_amt_rnd_typ.equalsIgnoreCase(name)) {
			return sls_amt_rnd_typ();
		}
		if ($sls_tax_calc_typ.equalsIgnoreCase(name)) {
			return sls_tax_calc_typ();
		}
		if ($sls_tax_rnd_typ.equalsIgnoreCase(name)) {
			return sls_tax_rnd_typ();
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			return sls_basis_typ();
		}
		if ($bill_basis_typ.equalsIgnoreCase(name)) {
			return bill_basis_typ();
		}
		if ($ship_schd_split_typ.equalsIgnoreCase(name)) {
			return ship_schd_split_typ();
		}
		if ($lot_back_stop_typ.equalsIgnoreCase(name)) {
			return lot_back_stop_typ();
		}
		if ($slip_each_lot_typ.equalsIgnoreCase(name)) {
			return slip_each_lot_typ();
		}
		if ($cst_ship_form_cd.equalsIgnoreCase(name)) {
			return cst_ship_form_cd();
		}
		if ($stk_lst_form_cd.equalsIgnoreCase(name)) {
			return stk_lst_form_cd();
		}
		if ($sls_tax_cd.equalsIgnoreCase(name)) {
			return sls_tax_cd();
		}
		if ($cst_tterm_cd1.equalsIgnoreCase(name)) {
			return cst_tterm_cd1();
		}
		if ($cst_tterm_cd2.equalsIgnoreCase(name)) {
			return cst_tterm_cd2();
		}
		if ($cst_tterm_cd3.equalsIgnoreCase(name)) {
			return cst_tterm_cd3();
		}
		if ($sls_anly_cd1.equalsIgnoreCase(name)) {
			return sls_anly_cd1();
		}
		if ($sls_anly_cd2.equalsIgnoreCase(name)) {
			return sls_anly_cd2();
		}
		if ($sls_anly_cd3.equalsIgnoreCase(name)) {
			return sls_anly_cd3();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
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
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			return bill_crryovr_times();
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
		if ($cst_sundry_flg.equalsIgnoreCase(name)) {
			return cst_sundry_flg();
		}
		if ($sls_upri_cng_flg.equalsIgnoreCase(name)) {
			return sls_upri_cng_flg();
		}
		if ($stk_lst_issue_flg.equalsIgnoreCase(name)) {
			return stk_lst_issue_flg();
		}
		if ($sls_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			return sls_tax_cd_prio_flg();
		}
		if ($wrk_ar_flg.equalsIgnoreCase(name)) {
			return wrk_ar_flg();
		}
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			return cst_iv_flg();
		}
		if ($not_lg_mix_flg.equalsIgnoreCase(name)) {
			return not_lg_mix_flg();
		}
		if ($not_lot_mix_flg.equalsIgnoreCase(name)) {
			return not_lot_mix_flg();
		}
		if ($not_sublot_mix_flg.equalsIgnoreCase(name)) {
			return not_sublot_mix_flg();
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
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($cst_cntct_dpt.equalsIgnoreCase(name)) {
			cst_cntct_dpt(value);
			return;
		}
		if ($cst_cntct_psn.equalsIgnoreCase(name)) {
			cst_cntct_psn(value);
			return;
		}
		if ($cst_cntct_psn_title.equalsIgnoreCase(name)) {
			cst_cntct_psn_title(value);
			return;
		}
		if ($sls_upri_req_typ.equalsIgnoreCase(name)) {
			sls_upri_req_typ(value);
			return;
		}
		if ($sls_upri_rnd_typ.equalsIgnoreCase(name)) {
			sls_upri_rnd_typ(value);
			return;
		}
		if ($sls_amt_rnd_typ.equalsIgnoreCase(name)) {
			sls_amt_rnd_typ(value);
			return;
		}
		if ($sls_tax_calc_typ.equalsIgnoreCase(name)) {
			sls_tax_calc_typ(value);
			return;
		}
		if ($sls_tax_rnd_typ.equalsIgnoreCase(name)) {
			sls_tax_rnd_typ(value);
			return;
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			sls_basis_typ(value);
			return;
		}
		if ($bill_basis_typ.equalsIgnoreCase(name)) {
			bill_basis_typ(value);
			return;
		}
		if ($ship_schd_split_typ.equalsIgnoreCase(name)) {
			ship_schd_split_typ(value);
			return;
		}
		if ($lot_back_stop_typ.equalsIgnoreCase(name)) {
			lot_back_stop_typ(value);
			return;
		}
		if ($slip_each_lot_typ.equalsIgnoreCase(name)) {
			slip_each_lot_typ(value);
			return;
		}
		if ($cst_ship_form_cd.equalsIgnoreCase(name)) {
			cst_ship_form_cd(value);
			return;
		}
		if ($stk_lst_form_cd.equalsIgnoreCase(name)) {
			stk_lst_form_cd(value);
			return;
		}
		if ($sls_tax_cd.equalsIgnoreCase(name)) {
			sls_tax_cd(value);
			return;
		}
		if ($cst_tterm_cd1.equalsIgnoreCase(name)) {
			cst_tterm_cd1(value);
			return;
		}
		if ($cst_tterm_cd2.equalsIgnoreCase(name)) {
			cst_tterm_cd2(value);
			return;
		}
		if ($cst_tterm_cd3.equalsIgnoreCase(name)) {
			cst_tterm_cd3(value);
			return;
		}
		if ($sls_anly_cd1.equalsIgnoreCase(name)) {
			sls_anly_cd1(value);
			return;
		}
		if ($sls_anly_cd2.equalsIgnoreCase(name)) {
			sls_anly_cd2(value);
			return;
		}
		if ($sls_anly_cd3.equalsIgnoreCase(name)) {
			sls_anly_cd3(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
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
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
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
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
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
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
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
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
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
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
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
		if ($cst_sundry_flg.equalsIgnoreCase(name)) {
			cst_sundry_flg(value);
			return;
		}
		if ($sls_upri_cng_flg.equalsIgnoreCase(name)) {
			sls_upri_cng_flg(value);
			return;
		}
		if ($stk_lst_issue_flg.equalsIgnoreCase(name)) {
			stk_lst_issue_flg(value);
			return;
		}
		if ($sls_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			sls_tax_cd_prio_flg(value);
			return;
		}
		if ($wrk_ar_flg.equalsIgnoreCase(name)) {
			wrk_ar_flg(value);
			return;
		}
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			cst_iv_flg(value);
			return;
		}
		if ($not_lg_mix_flg.equalsIgnoreCase(name)) {
			not_lg_mix_flg(value);
			return;
		}
		if ($not_lot_mix_flg.equalsIgnoreCase(name)) {
			not_lot_mix_flg(value);
			return;
		}
		if ($not_sublot_mix_flg.equalsIgnoreCase(name)) {
			not_sublot_mix_flg(value);
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
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($cst_cntct_dpt.equalsIgnoreCase(name)) {
			cst_cntct_dpt(value);
			return;
		}
		if ($cst_cntct_psn.equalsIgnoreCase(name)) {
			cst_cntct_psn(value);
			return;
		}
		if ($cst_cntct_psn_title.equalsIgnoreCase(name)) {
			cst_cntct_psn_title(value);
			return;
		}
		if ($sls_upri_req_typ.equalsIgnoreCase(name)) {
			sls_upri_req_typ(value);
			return;
		}
		if ($sls_upri_rnd_typ.equalsIgnoreCase(name)) {
			sls_upri_rnd_typ(value);
			return;
		}
		if ($sls_amt_rnd_typ.equalsIgnoreCase(name)) {
			sls_amt_rnd_typ(value);
			return;
		}
		if ($sls_tax_calc_typ.equalsIgnoreCase(name)) {
			sls_tax_calc_typ(value);
			return;
		}
		if ($sls_tax_rnd_typ.equalsIgnoreCase(name)) {
			sls_tax_rnd_typ(value);
			return;
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			sls_basis_typ(value);
			return;
		}
		if ($bill_basis_typ.equalsIgnoreCase(name)) {
			bill_basis_typ(value);
			return;
		}
		if ($ship_schd_split_typ.equalsIgnoreCase(name)) {
			ship_schd_split_typ(value);
			return;
		}
		if ($lot_back_stop_typ.equalsIgnoreCase(name)) {
			lot_back_stop_typ(value);
			return;
		}
		if ($slip_each_lot_typ.equalsIgnoreCase(name)) {
			slip_each_lot_typ(value);
			return;
		}
		if ($cst_ship_form_cd.equalsIgnoreCase(name)) {
			cst_ship_form_cd(value);
			return;
		}
		if ($stk_lst_form_cd.equalsIgnoreCase(name)) {
			stk_lst_form_cd(value);
			return;
		}
		if ($sls_tax_cd.equalsIgnoreCase(name)) {
			sls_tax_cd(value);
			return;
		}
		if ($cst_tterm_cd1.equalsIgnoreCase(name)) {
			cst_tterm_cd1(value);
			return;
		}
		if ($cst_tterm_cd2.equalsIgnoreCase(name)) {
			cst_tterm_cd2(value);
			return;
		}
		if ($cst_tterm_cd3.equalsIgnoreCase(name)) {
			cst_tterm_cd3(value);
			return;
		}
		if ($sls_anly_cd1.equalsIgnoreCase(name)) {
			sls_anly_cd1(value);
			return;
		}
		if ($sls_anly_cd2.equalsIgnoreCase(name)) {
			sls_anly_cd2(value);
			return;
		}
		if ($sls_anly_cd3.equalsIgnoreCase(name)) {
			sls_anly_cd3(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
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
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
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
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
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
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
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
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
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
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
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
		if ($cst_sundry_flg.equalsIgnoreCase(name)) {
			cst_sundry_flg(value);
			return;
		}
		if ($sls_upri_cng_flg.equalsIgnoreCase(name)) {
			sls_upri_cng_flg(value);
			return;
		}
		if ($stk_lst_issue_flg.equalsIgnoreCase(name)) {
			stk_lst_issue_flg(value);
			return;
		}
		if ($sls_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			sls_tax_cd_prio_flg(value);
			return;
		}
		if ($wrk_ar_flg.equalsIgnoreCase(name)) {
			wrk_ar_flg(value);
			return;
		}
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			cst_iv_flg(value);
			return;
		}
		if ($not_lg_mix_flg.equalsIgnoreCase(name)) {
			not_lg_mix_flg(value);
			return;
		}
		if ($not_lot_mix_flg.equalsIgnoreCase(name)) {
			not_lot_mix_flg(value);
			return;
		}
		if ($not_sublot_mix_flg.equalsIgnoreCase(name)) {
			not_sublot_mix_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

