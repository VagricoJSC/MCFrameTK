package mcframe.clientMABC.MABCP0510;

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
 * ブロック"Cmn"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class CmnR_MC_A extends MCConstRow {

	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public static final String $bp_cd = "bp_cd";
	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public static final String $bp_nm_lcl = "bp_nm_lcl";
	/**
	 * Standard BP name 標準取引先名.<p>
	 *
	 */
	public static final String $bp_nm = "bp_nm";
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public static final String $del_flg = "del_flg";
	/**
	 * Whole company 全社.<p>
	 *
	 */
	public static final String $all_com_flg = "all_com_flg";
	/**
	 * Whole company 全社.<p>
	 *
	 */
	public static final String $org_all_com_flg = "org_all_com_flg";
	/**
	 * Own company use 自社使用.<p>
	 *
	 */
	public static final String $com_use_flg = "com_use_flg";
	/**
	 * Not own company use 自社不使用.<p>
	 *
	 */
	public static final String $com_ex_flg = "com_ex_flg";
	/**
	 * BP alias name 1 取引先別名１.<p>
	 *
	 */
	public static final String $bp_alt_nm1 = "bp_alt_nm1";
	/**
	 * BP alias name 2 取引先別名２.<p>
	 *
	 */
	public static final String $bp_alt_nm2 = "bp_alt_nm2";
	/**
	 * BP alias name 3 取引先別名３.<p>
	 *
	 */
	public static final String $bp_alt_nm3 = "bp_alt_nm3";
	/**
	 * BP alias name 4 取引先別名４.<p>
	 *
	 */
	public static final String $bp_alt_nm4 = "bp_alt_nm4";
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public static final String $cur_cd = "cur_cd";
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public static final String $cur_nm = "cur_nm";
	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public static final String $cntry_cd = "cntry_cd";
	/**
	 * Country name 国名.<p>
	 *
	 */
	public static final String $cntry_nm = "cntry_nm";
	/**
	 * Region cd. 地域ＣＤ.<p>
	 *
	 */
	public static final String $area_cd = "area_cd";
	/**
	 * Region name 地域名.<p>
	 *
	 */
	public static final String $area_nm = "area_nm";
	/**
	 * Customer 得意先.<p>
	 *
	 */
	public static final String $cst_flg = "cst_flg";
	/**
	 * Customer 得意先.<p>
	 *
	 */
	public static final String $org_cst_flg = "org_cst_flg";
	/**
	 * AR customer 売掛先.<p>
	 *
	 */
	public static final String $acst_flg = "acst_flg";
	/**
	 * Billing customer 請求先.<p>
	 *
	 */
	public static final String $bcst_flg = "bcst_flg";
	/**
	 * Payer 入金先.<p>
	 *
	 */
	public static final String $rcst_flg = "rcst_flg";
	/**
	 * Delivery destination 納品先.<p>
	 *
	 */
	public static final String $dlv_flg = "dlv_flg";
	/**
	 * Distribution channel 仕向先.<p>
	 *
	 */
	public static final String $dest_flg = "dest_flg";
	/**
	 * Credit managed BP 与信管理先.<p>
	 *
	 */
	public static final String $cred_flg = "cred_flg";
	/**
	 * Supplier 発注先.<p>
	 *
	 */
	public static final String $sppl_flg = "sppl_flg";
	/**
	 * Supplier 発注先.<p>
	 *
	 */
	public static final String $org_sppl_flg = "org_sppl_flg";
	/**
	 * AP supplier 買掛先.<p>
	 *
	 */
	public static final String $asppl_flg = "asppl_flg";
	/**
	 * Scheduled payee 支払予定管理先.<p>
	 *
	 */
	public static final String $bsppl_flg = "bsppl_flg";
	/**
	 * Payee 支払先.<p>
	 *
	 */
	public static final String $psppl_flg = "psppl_flg";
	/**
	 * Maker メーカ.<p>
	 *
	 */
	public static final String $maker_flg = "maker_flg";
	/**
	 * Business No. 事業者ＮＯ.<p>
	 *
	 */
	public static final String $biz_co_no = "biz_co_no";
	/**
	 * Corporation number 法人番号.<p>
	 *
	 */
	public static final String $ein = "ein";
	/**
	 * Standard company code 標準企業コード.<p>
	 *
	 */
	public static final String $std_co_cd = "std_co_cd";
	/**
	 * TEL ＴＥＬ.<p>
	 *
	 */
	public static final String $tel = "tel";
	/**
	 * FAX ＦＡＸ.<p>
	 *
	 */
	public static final String $fax = "fax";
	/**
	 * Zip code 郵便番号.<p>
	 *
	 */
	public static final String $zip_cd = "zip_cd";
	/**
	 * Address 1 住所１.<p>
	 *
	 */
	public static final String $addr1 = "addr1";
	/**
	 * Address 2 住所２.<p>
	 *
	 */
	public static final String $addr2 = "addr2";
	/**
	 * Address 3 住所３.<p>
	 *
	 */
	public static final String $addr3 = "addr3";
	/**
	 * Address 4 住所４.<p>
	 *
	 */
	public static final String $addr4 = "addr4";
	/**
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public static final String $prnt_lcl_cd = "prnt_lcl_cd";
	/**
	 * Report output locale name 帳票出力ロケール名.<p>
	 *
	 */
	public static final String $prnt_lcl_nm = "prnt_lcl_nm";
	/**
	 * BP allocation group 取引先配賦グループ.<p>
	 *
	 */
	public static final String $bp_alc_grp = "bp_alc_grp";
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public static final String $memo1 = "memo1";
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public static final String $memo2 = "memo2";
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public static final String $memo3 = "memo3";
	/**
	 * Memo 4 メモ４.<p>
	 *
	 */
	public static final String $memo4 = "memo4";
	/**
	 * Memo 5 メモ５.<p>
	 *
	 */
	public static final String $memo5 = "memo5";
	/**
	 * Memo 6 メモ６.<p>
	 *
	 */
	public static final String $memo6 = "memo6";
	/**
	 * Memo 7 メモ７.<p>
	 *
	 */
	public static final String $memo7 = "memo7";
	/**
	 * Memo 8 メモ８.<p>
	 *
	 */
	public static final String $memo8 = "memo8";
	/**
	 * Memo 9 メモ９.<p>
	 *
	 */
	public static final String $memo9 = "memo9";
	/**
	 * Memo 10 メモ１０.<p>
	 *
	 */
	public static final String $memo10 = "memo10";
	/**
	 * Memo 11 メモ１１.<p>
	 *
	 */
	public static final String $memo11 = "memo11";
	/**
	 * Memo 12 メモ１２.<p>
	 *
	 */
	public static final String $memo12 = "memo12";
	/**
	 * Memo 13 メモ１３.<p>
	 *
	 */
	public static final String $memo13 = "memo13";
	/**
	 * Memo 14 メモ１４.<p>
	 *
	 */
	public static final String $memo14 = "memo14";
	/**
	 * Memo 15 メモ１５.<p>
	 *
	 */
	public static final String $memo15 = "memo15";
	/**
	 * Memo 16 メモ１６.<p>
	 *
	 */
	public static final String $memo16 = "memo16";
	/**
	 * Memo 17 メモ１７.<p>
	 *
	 */
	public static final String $memo17 = "memo17";
	/**
	 * Memo 18 メモ１８.<p>
	 *
	 */
	public static final String $memo18 = "memo18";
	/**
	 * Memo 19 メモ１９.<p>
	 *
	 */
	public static final String $memo19 = "memo19";
	/**
	 * Memo 20 メモ２０.<p>
	 *
	 */
	public static final String $memo20 = "memo20";
	/**
	 * BP classification cd. 1 取引先分類ＣＤ１.<p>
	 *
	 */
	public static final String $bp_grp_cd1 = "bp_grp_cd1";
	/**
	 * BP classification name 1 取引先分類名１.<p>
	 *
	 */
	public static final String $bp_grp_nm1 = "bp_grp_nm1";
	/**
	 * BP classification cd. 2 取引先分類ＣＤ２.<p>
	 *
	 */
	public static final String $bp_grp_cd2 = "bp_grp_cd2";
	/**
	 * BP classification name 2 取引先分類名２.<p>
	 *
	 */
	public static final String $bp_grp_nm2 = "bp_grp_nm2";
	/**
	 * BP classification cd. 3 取引先分類ＣＤ３.<p>
	 *
	 */
	public static final String $bp_grp_cd3 = "bp_grp_cd3";
	/**
	 * BP classification name 3 取引先分類名３.<p>
	 *
	 */
	public static final String $bp_grp_nm3 = "bp_grp_nm3";
	/**
	 * BP classification cd. 4 取引先分類ＣＤ４.<p>
	 *
	 */
	public static final String $bp_grp_cd4 = "bp_grp_cd4";
	/**
	 * BP classification name 4 取引先分類名４.<p>
	 *
	 */
	public static final String $bp_grp_nm4 = "bp_grp_nm4";
	/**
	 * BP classification cd. 5 取引先分類ＣＤ５.<p>
	 *
	 */
	public static final String $bp_grp_cd5 = "bp_grp_cd5";
	/**
	 * BP classification name 5 取引先分類名５.<p>
	 *
	 */
	public static final String $bp_grp_nm5 = "bp_grp_nm5";
	/**
	 * BP classification cd. 6 取引先分類ＣＤ６.<p>
	 *
	 */
	public static final String $bp_grp_cd6 = "bp_grp_cd6";
	/**
	 * BP classification name 6 取引先分類名６.<p>
	 *
	 */
	public static final String $bp_grp_nm6 = "bp_grp_nm6";
	/**
	 * BP classification cd. 7 取引先分類ＣＤ７.<p>
	 *
	 */
	public static final String $bp_grp_cd7 = "bp_grp_cd7";
	/**
	 * BP classification name 7 取引先分類名７.<p>
	 *
	 */
	public static final String $bp_grp_nm7 = "bp_grp_nm7";
	/**
	 * BP classification cd. 8 取引先分類ＣＤ８.<p>
	 *
	 */
	public static final String $bp_grp_cd8 = "bp_grp_cd8";
	/**
	 * BP classification name 8 取引先分類名８.<p>
	 *
	 */
	public static final String $bp_grp_nm8 = "bp_grp_nm8";
	/**
	 * BP classification cd. 9 取引先分類ＣＤ９.<p>
	 *
	 */
	public static final String $bp_grp_cd9 = "bp_grp_cd9";
	/**
	 * BP classification name 9 取引先分類名９.<p>
	 *
	 */
	public static final String $bp_grp_nm9 = "bp_grp_nm9";
	/**
	 * BP classification cd. 10 取引先分類ＣＤ１０.<p>
	 *
	 */
	public static final String $bp_grp_cd10 = "bp_grp_cd10";
	/**
	 * BP classification name 10 取引先分類名１０.<p>
	 *
	 */
	public static final String $bp_grp_nm10 = "bp_grp_nm10";
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public static final String $ins_usr_id_c = "ins_usr_id_c";
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public static final String $ins_usr_nm_c = "ins_usr_nm_c";
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public static final String $ins_func_id_c = "ins_func_id_c";
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public static final String $ins_func_nm_c = "ins_func_nm_c";
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public static final String $upd_usr_id_c = "upd_usr_id_c";
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public static final String $upd_usr_nm_c = "upd_usr_nm_c";
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public static final String $upd_func_id_c = "upd_func_id_c";
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public static final String $upd_func_nm_c = "upd_func_nm_c";
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public static final String $ins_ts_c = "ins_ts_c";
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public static final String $upd_ts_c = "upd_ts_c";
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public static final String $upd_srv_req_no_c = "upd_srv_req_no_c";
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr_c = "upd_cntr_c";
	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public static final String $del_usr_id_c = "del_usr_id_c";
	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public static final String $del_usr_nm_c = "del_usr_nm_c";
	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public static final String $del_ts_c = "del_ts_c";
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public static final String $ins_usr_id = "ins_usr_id";
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public static final String $ins_usr_nm = "ins_usr_nm";
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public static final String $ins_func_id = "ins_func_id";
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public static final String $ins_func_nm = "ins_func_nm";
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public static final String $upd_usr_id = "upd_usr_id";
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public static final String $upd_usr_nm = "upd_usr_nm";
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public static final String $upd_func_id = "upd_func_id";
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public static final String $upd_func_nm = "upd_func_nm";
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public static final String $ins_ts = "ins_ts";
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public static final String $upd_ts = "upd_ts";
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public static final String $upd_srv_req_no = "upd_srv_req_no";
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";
	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public static final String $del_usr_id = "del_usr_id";
	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public static final String $del_usr_nm = "del_usr_nm";
	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public static final String $del_ts = "del_ts";
	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public static final String $acst_cd = "acst_cd";
	/**
	 * AR customer name 売掛先名.<p>
	 *
	 */
	public static final String $acst_nm = "acst_nm";
	/**
	 * Customer dept. 得意先部署.<p>
	 *
	 */
	public static final String $cst_cntct_dpt = "cst_cntct_dpt";
	/**
	 * Customer PIC 得意先担当者.<p>
	 *
	 */
	public static final String $cst_cntct_psn = "cst_cntct_psn";
	/**
	 * Form of address for Customer PIC 得意先担当者敬称.<p>
	 *
	 */
	public static final String $cst_cntct_psn_title = "cst_cntct_psn_title";
	/**
	 * Miscellaneous customer 得意先諸口.<p>
	 *
	 */
	public static final String $cst_sundry_flg = "cst_sundry_flg";
	/**
	 * AR dept. type 債権部門区分.<p>
	 *
	 */
	public static final String $ar_dpt_typ = "ar_dpt_typ";
	/**
	 * AR dept. type name 債権部門区分名.<p>
	 *
	 */
	public static final String $ar_dpt_typ_nm = "ar_dpt_typ_nm";
	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public static final String $ar_dpt_cd = "ar_dpt_cd";
	/**
	 * AR dept. name 債権部門名.<p>
	 *
	 */
	public static final String $ar_dpt_nm = "ar_dpt_nm";
	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public static final String $check_ar_dpt_cd = "check_ar_dpt_cd";
	/**
	 * Sales unit price rounding type 販売単価端数処理区分.<p>
	 *
	 */
	public static final String $sls_upri_rnd_typ = "sls_upri_rnd_typ";
	/**
	 * Sales unit rounding type name 販売単価端数処理区分名.<p>
	 *
	 */
	public static final String $sls_upri_rnd_typ_nm = "sls_upri_rnd_typ_nm";
	/**
	 * Sales unit price acquisition type 販売単価取得区分.<p>
	 *
	 */
	public static final String $sls_upri_req_typ = "sls_upri_req_typ";
	/**
	 * Sales unit price acquisition type name 販売単価取得区分名.<p>
	 *
	 */
	public static final String $sls_upri_req_typ_nm = "sls_upri_req_typ_nm";
	/**
	 * Allow sales unit price change 販売単価変更許可.<p>
	 *
	 */
	public static final String $sls_upri_cng_flg = "sls_upri_cng_flg";
	/**
	 * Rounding type (Sales amount) 売上金額端数処理区分.<p>
	 *
	 */
	public static final String $sls_amt_rnd_typ = "sls_amt_rnd_typ";
	/**
	 * Rounding type name (Sales amount) 売上金額端数処理区分名.<p>
	 *
	 */
	public static final String $sls_amt_rnd_typ_nm = "sls_amt_rnd_typ_nm";
	/**
	 * Sales tax calculation type 売上税計算区分.<p>
	 *
	 */
	public static final String $sls_tax_calc_typ = "sls_tax_calc_typ";
	/**
	 * Sales tax calculation type name 売上税計算区分名.<p>
	 *
	 */
	public static final String $sls_tax_calc_typ_nm = "sls_tax_calc_typ_nm";
	/**
	 * Sales tax rounding type 売上税額端数処理区分.<p>
	 *
	 */
	public static final String $sls_tax_rnd_typ = "sls_tax_rnd_typ";
	/**
	 * Rounding type 売上税額端数処理区分名.<p>
	 *
	 */
	public static final String $sls_tax_rnd_typ_nm = "sls_tax_rnd_typ_nm";
	/**
	 * Sales tax cd. 売上税ＣＤ.<p>
	 *
	 */
	public static final String $sls_tax_cd = "sls_tax_cd";
	/**
	 * Sales tax name 売上税名.<p>
	 *
	 */
	public static final String $sls_tax_nm = "sls_tax_nm";
	/**
	 * Sales tax priority 売上税優先.<p>
	 *
	 */
	public static final String $sls_tax_cd_prio_flg = "sls_tax_cd_prio_flg";
	/**
	 * Lot reverse prohibit type ロット逆転禁止区分.<p>
	 *
	 */
	public static final String $lot_back_stop_typ = "lot_back_stop_typ";
	/**
	 * Lot reverse prohibit type name ロット逆転禁止区分名.<p>
	 *
	 */
	public static final String $lot_back_stop_typ_nm = "lot_back_stop_typ_nm";
	/**
	 * Revenue recording type 売上計上区分.<p>
	 *
	 */
	public static final String $sls_basis_typ = "sls_basis_typ";
	/**
	 * Revenue recording type name 売上計上区分名.<p>
	 *
	 */
	public static final String $sls_basis_typ_nm = "sls_basis_typ_nm";
	/**
	 * Billing initial base type 請求起算区分.<p>
	 *
	 */
	public static final String $bill_basis_typ = "bill_basis_typ";
	/**
	 * Billing calculation base type name 請求起算区分名.<p>
	 *
	 */
	public static final String $bill_basis_typ_nm = "bill_basis_typ_nm";
	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public static final String $bill_crryovr_times = "bill_crryovr_times";
	/**
	 * Lot details split type ロット明細分割区分.<p>
	 *
	 */
	public static final String $slip_each_lot_typ = "slip_each_lot_typ";
	/**
	 * Lot details split type name ロット明細分割区分名.<p>
	 *
	 */
	public static final String $slip_each_lot_typ_nm = "slip_each_lot_typ_nm";
	/**
	 * Shipping schedule split type 出荷予定分割区分.<p>
	 *
	 */
	public static final String $ship_schd_split_typ = "ship_schd_split_typ";
	/**
	 * Shipping schedule split type name 出荷予定分割区分名.<p>
	 *
	 */
	public static final String $ship_schd_split_typ_nm = "ship_schd_split_typ_nm";
	/**
	 * Issue identification tag 現品票発行.<p>
	 *
	 */
	public static final String $stk_lst_issue_flg = "stk_lst_issue_flg";
	/**
	 * Identification tag cd. 現品票ＣＤ.<p>
	 *
	 */
	public static final String $stk_lst_form_cd = "stk_lst_form_cd";
	/**
	 * Identification tag name 現品票名.<p>
	 *
	 */
	public static final String $stk_lst_form_nm = "stk_lst_form_nm";
	/**
	 * Customer delivery note cd. 得意先納品書ＣＤ.<p>
	 *
	 */
	public static final String $cst_ship_form_cd = "cst_ship_form_cd";
	/**
	 * Customer delivery note name 得意先納品書名.<p>
	 *
	 */
	public static final String $cst_ship_form_nm = "cst_ship_form_nm";
	/**
	 * AR management by sales project 案件別債権管理.<p>
	 *
	 */
	public static final String $wrk_ar_flg = "wrk_ar_flg";
	/**
	 * Customer invoice transaction 得意先インボイス取引.<p>
	 *
	 */
	public static final String $cst_iv_flg = "cst_iv_flg";
	/**
	 * Shipping LT (For demand) 出荷ＬＴ（需要情報用）.<p>
	 *
	 */
	public static final String $ship_lt = "ship_lt";
	/**
	 * Customer transaction terms cd. 1 得意先取引条件ＣＤ１.<p>
	 *
	 */
	public static final String $cst_tterm_cd1 = "cst_tterm_cd1";
	/**
	 * Customer transaction terms name 1 得意先取引条件名１.<p>
	 *
	 */
	public static final String $cst_tterm_nm1 = "cst_tterm_nm1";
	/**
	 * Customer transaction terms cd. 2 得意先取引条件ＣＤ２.<p>
	 *
	 */
	public static final String $cst_tterm_cd2 = "cst_tterm_cd2";
	/**
	 * Customer transaction terms name 2 得意先取引条件名２.<p>
	 *
	 */
	public static final String $cst_tterm_nm2 = "cst_tterm_nm2";
	/**
	 * Customer transaction terms cd. 3 得意先取引条件ＣＤ３.<p>
	 *
	 */
	public static final String $cst_tterm_cd3 = "cst_tterm_cd3";
	/**
	 * Customer transaction terms name 3 得意先取引条件名３.<p>
	 *
	 */
	public static final String $cst_tterm_nm3 = "cst_tterm_nm3";
	/**
	 * Sales analysis cd. 1 販売分析ＣＤ１.<p>
	 *
	 */
	public static final String $sls_anly_cd1 = "sls_anly_cd1";
	/**
	 * Sales analysis name 1 販売分析名１.<p>
	 *
	 */
	public static final String $sls_anly_nm1 = "sls_anly_nm1";
	/**
	 * Sales analysis cd. 2 販売分析ＣＤ２.<p>
	 *
	 */
	public static final String $sls_anly_cd2 = "sls_anly_cd2";
	/**
	 * Sales analysis name 2 販売分析名２.<p>
	 *
	 */
	public static final String $sls_anly_nm2 = "sls_anly_nm2";
	/**
	 * Sales analysis cd. 3 販売分析ＣＤ３.<p>
	 *
	 */
	public static final String $sls_anly_cd3 = "sls_anly_cd3";
	/**
	 * Sales analysis name 3 販売分析名３.<p>
	 *
	 */
	public static final String $sls_anly_nm3 = "sls_anly_nm3";
	/**
	 * Report issue type (Customer) 帳票発行区分（得意先）.<p>
	 *
	 */
	public static final String $cst_prnt_typ = "cst_prnt_typ";
	/**
	 * Report issue type name (Customer) 帳票発行区分名（得意先）.<p>
	 *
	 */
	public static final String $cst_prnt_typ_nm = "cst_prnt_typ_nm";
	/**
	 * Prohibit mixed distribution group 物流グループ混在不可.<p>
	 *
	 */
	public static final String $not_lg_mix_flg = "not_lg_mix_flg";
	/**
	 * Prohibit mixed lots ロット混在不可.<p>
	 *
	 */
	public static final String $not_lot_mix_flg = "not_lot_mix_flg";
	/**
	 * Prohibit mixed sublots サブロット混在不可.<p>
	 *
	 */
	public static final String $not_sublot_mix_flg = "not_sublot_mix_flg";
	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public static final String $bcst_cd = "bcst_cd";
	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public static final String $bcst_nm = "bcst_nm";
	/**
	 * Report issue type (AR customer) 帳票発行区分（売掛先）.<p>
	 *
	 */
	public static final String $acst_prnt_typ = "acst_prnt_typ";
	/**
	 * Report issue type name (AR customer) 帳票発行区分名（売掛先）.<p>
	 *
	 */
	public static final String $acst_prnt_typ_nm = "acst_prnt_typ_nm";
	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public static final String $rcst_cd = "rcst_cd";
	/**
	 * Payer name 入金先名.<p>
	 *
	 */
	public static final String $rcst_nm = "rcst_nm";
	/**
	 * AR credit managed BP cd. 債権与信管理先ＣＤ.<p>
	 *
	 */
	public static final String $ar_cred_cd = "ar_cred_cd";
	/**
	 * AR credit managed BP name 債権与信管理先名.<p>
	 *
	 */
	public static final String $ar_cred_nm = "ar_cred_nm";
	/**
	 * Billing dept. type 請求部門区分.<p>
	 *
	 */
	public static final String $bill_dpt_typ = "bill_dpt_typ";
	/**
	 * Billing dept. type name 請求部門区分名.<p>
	 *
	 */
	public static final String $bill_dpt_typ_nm = "bill_dpt_typ_nm";
	/**
	 * Billing customer dept. in charge cd. 請求先担当部門ＣＤ.<p>
	 *
	 */
	public static final String $bcst_dpt_cd = "bcst_dpt_cd";
	/**
	 * Billing customer dept. in charge name 請求先担当部門名.<p>
	 *
	 */
	public static final String $bcst_dpt_nm = "bcst_dpt_nm";
	/**
	 * Billing customer dept. in charge cd. 請求先担当部門ＣＤ.<p>
	 *
	 */
	public static final String $check_bcst_dpt_cd = "check_bcst_dpt_cd";
	/**
	 * Billing closing type 請求締処理区分.<p>
	 *
	 */
	public static final String $bill_cl_typ = "bill_cl_typ";
	/**
	 * Billing closing type name 請求締処理区分名.<p>
	 *
	 */
	public static final String $bill_cl_typ_nm = "bill_cl_typ_nm";
	/**
	 * Billing closing day 1 請求締日１.<p>
	 *
	 */
	public static final String $bill_cl_day1 = "bill_cl_day1";
	/**
	 * Billing closing day 2 請求締日２.<p>
	 *
	 */
	public static final String $bill_cl_day2 = "bill_cl_day2";
	/**
	 * Billing closing day 3 請求締日３.<p>
	 *
	 */
	public static final String $bill_cl_day3 = "bill_cl_day3";
	/**
	 * Billing closing day 4 請求締日４.<p>
	 *
	 */
	public static final String $bill_cl_day4 = "bill_cl_day4";
	/**
	 * Billing closing day 5 請求締日５.<p>
	 *
	 */
	public static final String $bill_cl_day5 = "bill_cl_day5";
	/**
	 * Billing tax calculation 請求税計算.<p>
	 *
	 */
	public static final String $tax_on_bill_flg = "tax_on_bill_flg";
	/**
	 * Billing tax rounding type 請求税額端数処理区分.<p>
	 *
	 */
	public static final String $bill_tax_rnd_typ = "bill_tax_rnd_typ";
	/**
	 * Billing tax rounding type 請求税額端数処理区分名.<p>
	 *
	 */
	public static final String $bill_tax_rnd_typ_nm = "bill_tax_rnd_typ_nm";
	/**
	 * Delayed days (Billing closing day) 請求締遅延日数.<p>
	 *
	 */
	public static final String $bill_cl_delay_days = "bill_cl_delay_days";
	/**
	 * Billing closing before/after type 請求締前後区分.<p>
	 *
	 */
	public static final String $bill_cl_ba_typ = "bill_cl_ba_typ";
	/**
	 * Before/after billing closing type name 請求締前後区分名.<p>
	 *
	 */
	public static final String $bill_cl_ba_typ_nm = "bill_cl_ba_typ_nm";
	/**
	 * Billing customer calendar cd. 請求先カレンダＣＤ.<p>
	 *
	 */
	public static final String $bill_cal_cd = "bill_cal_cd";
	/**
	 * Billing customer calendar name 請求先カレンダ名.<p>
	 *
	 */
	public static final String $bill_cal_nm = "bill_cal_nm";
	/**
	 * Payment receipt schedule before/after type 入金予定前後区分.<p>
	 *
	 */
	public static final String $rcv_ba_typ = "rcv_ba_typ";
	/**
	 * Payment receipt schedule before/after type name 入金予定前後区分名.<p>
	 *
	 */
	public static final String $rcv_ba_typ_nm = "rcv_ba_typ_nm";
	/**
	 * Details auto-reconciliation 自動明細消込.<p>
	 *
	 */
	public static final String $auto_line_appl_flg = "auto_line_appl_flg";
	/**
	 * Sales temporary unit price closing 売上仮単価締.<p>
	 *
	 */
	public static final String $sls_interim_cl_flg = "sls_interim_cl_flg";
	/**
	 * AR offset group cd. 債権相殺グループＣＤ.<p>
	 *
	 */
	public static final String $ar_setoff_grp_cd = "ar_setoff_grp_cd";
	/**
	 * AR offset group name 債権相殺グループ名.<p>
	 *
	 */
	public static final String $ar_setoff_grp_nm = "ar_setoff_grp_nm";
	/**
	 * Report issue type (Billing customer) 帳票発行区分（請求先）.<p>
	 *
	 */
	public static final String $bcst_prnt_typ = "bcst_prnt_typ";
	/**
	 * Report issue type name (Billing customer) 帳票発行区分名（請求先）.<p>
	 *
	 */
	public static final String $bcst_prnt_typ_nm = "bcst_prnt_typ_nm";
	/**
	 * Invoice send-to zip code 請求書送付郵便番号.<p>
	 *
	 */
	public static final String $bill_zip_cd = "bill_zip_cd";
	/**
	 * Invoice send-to address 1 請求書送付住所１.<p>
	 *
	 */
	public static final String $bill_addr1 = "bill_addr1";
	/**
	 * Invoice send-to address 2 請求書送付住所２.<p>
	 *
	 */
	public static final String $bill_addr2 = "bill_addr2";
	/**
	 * Invoice send-to address 3 請求書送付住所３.<p>
	 *
	 */
	public static final String $bill_addr3 = "bill_addr3";
	/**
	 * Invoice send-to address 4 請求書送付住所４.<p>
	 *
	 */
	public static final String $bill_addr4 = "bill_addr4";
	/**
	 * Invoice send-to TEL 請求書送付ＴＥＬ.<p>
	 *
	 */
	public static final String $bill_tel = "bill_tel";
	/**
	 * Invoice destination 請求書宛先.<p>
	 *
	 */
	public static final String $bill_bcst_nm = "bill_bcst_nm";
	/**
	 * Invoice send-to dept. 請求書送付部署.<p>
	 *
	 */
	public static final String $bill_bcst_dpt = "bill_bcst_dpt";
	/**
	 * Invoice send-to PIC 請求書送付担当者.<p>
	 *
	 */
	public static final String $bill_bcst_psn = "bill_bcst_psn";
	/**
	 * Invoice send-to PIC honorific 請求書送付担当者敬称.<p>
	 *
	 */
	public static final String $bill_bcst_psn_title = "bill_bcst_psn_title";
	/**
	 * Invoice issue type 請求書発行区分.<p>
	 *
	 */
	public static final String $bill_prnt_typ = "bill_prnt_typ";
	/**
	 * Invoice issue type name 請求書発行区分名.<p>
	 *
	 */
	public static final String $bill_prnt_typ_nm = "bill_prnt_typ_nm";
	/**
	 * Sales details output type 売上明細書出力区分.<p>
	 *
	 */
	public static final String $sls_dtl_outp_typ = "sls_dtl_outp_typ";
	/**
	 * Sales details output type name 売上明細書出力区分名.<p>
	 *
	 */
	public static final String $sls_dtl_outp_typ_nm = "sls_dtl_outp_typ_nm";
	/**
	 * Output invoice details 請求書明細出力.<p>
	 *
	 */
	public static final String $bill_dtl_outp_flg = "bill_dtl_outp_flg";
	/**
	 * Display balance of previous month on invoice 請求書前月残高表示.<p>
	 *
	 */
	public static final String $bfw_bal_disp_flg = "bfw_bal_disp_flg";
	/**
	 * Display advance received on invoice 請求書前受金表示.<p>
	 *
	 */
	public static final String $bill_dtl_adv_flg = "bill_dtl_adv_flg";
	/**
	 * Display payment receipt schedule in invoice 請求書入金予定表示.<p>
	 *
	 */
	public static final String $bill_dtl_rcv_flg = "bill_dtl_rcv_flg";
	/**
	 * Invoice details subtotal type 請求書明細小計区分.<p>
	 *
	 */
	public static final String $bill_dtl_subttl_typ = "bill_dtl_subttl_typ";
	/**
	 * Invoice details subtotal type name 請求書明細小計区分名.<p>
	 *
	 */
	public static final String $bill_dtl_subttl_typ_nm = "bill_dtl_subttl_typ_nm";
	/**
	 * Invoice details page break type 請求書明細改頁区分.<p>
	 *
	 */
	public static final String $bill_dtl_brk_typ = "bill_dtl_brk_typ";
	/**
	 * Invoice details page break type name 請求書明細改頁区分名.<p>
	 *
	 */
	public static final String $bill_dtl_brk_typ_nm = "bill_dtl_brk_typ_nm";
	/**
	 * Invoice details sorting order type 請求書明細並順区分.<p>
	 *
	 */
	public static final String $bill_dtl_sort_typ = "bill_dtl_sort_typ";
	/**
	 * Invoice details sort order type name 請求書明細並順区分名.<p>
	 *
	 */
	public static final String $bill_dtl_sort_typ_nm = "bill_dtl_sort_typ_nm";
	/**
	 * Invoice cancel slip display type 請求書取消伝票表示区分.<p>
	 *
	 */
	public static final String $bill_can_slip_typ = "bill_can_slip_typ";
	/**
	 * Invoice cancel slip display type name 請求書取消伝票表示区分名.<p>
	 *
	 */
	public static final String $bill_can_slip_typ_nm = "bill_can_slip_typ_nm";
	/**
	 * Payment person name 振込人名.<p>
	 *
	 */
	public static final String $xfr_psn = "xfr_psn";
	/**
	 * For auto-reconciliation 入金自動消込対象.<p>
	 *
	 */
	public static final String $rcv_auto_appl_tgt_flg = "rcv_auto_appl_tgt_flg";
	/**
	 * Match amount 金額考慮.<p>
	 *
	 */
	public static final String $rcv_amt_match_flg = "rcv_amt_match_flg";
	/**
	 * Include payment option 金種考慮.<p>
	 *
	 */
	public static final String $ar_sttl_typ_match_flg = "ar_sttl_typ_match_flg";
	/**
	 * Fee calculation 手数料計算.<p>
	 *
	 */
	public static final String $calc_com_paid_flg = "calc_com_paid_flg";
	/**
	 * Delayed days (Auto-reconciliation base date) 自動消込基準日遅延日数.<p>
	 *
	 */
	public static final String $auto_appl_delay_days = "auto_appl_delay_days";
	/**
	 * Report issue type (Payer) 帳票発行区分（入金先）.<p>
	 *
	 */
	public static final String $rcst_prnt_typ = "rcst_prnt_typ";
	/**
	 * Report issue type name (Payer) 帳票発行区分名（入金先）.<p>
	 *
	 */
	public static final String $rcst_prnt_typ_nm = "rcst_prnt_typ_nm";
	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public static final String $lg_grp_cd = "lg_grp_cd";
	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public static final String $lg_grp_nm = "lg_grp_nm";
	/**
	 * Miscellaneous delivery destination 納品先諸口.<p>
	 *
	 */
	public static final String $dlv_sundry_flg = "dlv_sundry_flg";
	/**
	 * Receiving point 配送先.<p>
	 *
	 */
	public static final String $tdlv_flg = "tdlv_flg";
	/**
	 * Receiving point 配送先.<p>
	 *
	 */
	public static final String $org_tdlv_flg = "org_tdlv_flg";
	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public static final String $via_dlv_typ = "via_dlv_typ";
	/**
	 * Receiving point stopover name 配送先経由区分名.<p>
	 *
	 */
	public static final String $via_dlv_typ_nm = "via_dlv_typ_nm";
	/**
	 * Receiving point required 配送先必須.<p>
	 *
	 */
	public static final String $tdlv_req_flg = "tdlv_req_flg";
	/**
	 * Delivery destination calendar cd. 納品先カレンダＣＤ.<p>
	 *
	 */
	public static final String $dlv_cal_cd = "dlv_cal_cd";
	/**
	 * Delivery destination calendar name 納品先カレンダ名.<p>
	 *
	 */
	public static final String $dlv_cal_nm = "dlv_cal_nm";
	/**
	 * Delivery destination dept. 納品先部署.<p>
	 *
	 */
	public static final String $dlv_cntct_dpt = "dlv_cntct_dpt";
	/**
	 * Delivery destination PIC 納品先担当者.<p>
	 *
	 */
	public static final String $dlv_cntct_psn = "dlv_cntct_psn";
	/**
	 * Delivery destination PIC honorific 納品先担当者敬称.<p>
	 *
	 */
	public static final String $dlv_cntct_psn_title = "dlv_cntct_psn_title";
	/**
	 * Print price 価格印字.<p>
	 *
	 */
	public static final String $pri_prnt_flg = "pri_prnt_flg";
	/**
	 * For consignment inventory count 貸出在庫棚卸対象.<p>
	 *
	 */
	public static final String $cnsgn_stktk_flg = "cnsgn_stktk_flg";
	/**
	 * Delivery destination channel 1 納品先チャネル１.<p>
	 *
	 */
	public static final String $dlv_chnnl1 = "dlv_chnnl1";
	/**
	 * Delivery destination channel 2 納品先チャネル２.<p>
	 *
	 */
	public static final String $dlv_chnnl2 = "dlv_chnnl2";
	/**
	 * Delivery destination channel 3 納品先チャネル３.<p>
	 *
	 */
	public static final String $dlv_chnnl3 = "dlv_chnnl3";
	/**
	 * Report issue type (Delivery destination) 帳票発行区分（納品先）.<p>
	 *
	 */
	public static final String $dlv_prnt_typ = "dlv_prnt_typ";
	/**
	 * Report issue type name (Delivery destination) 帳票発行区分名（納品先）.<p>
	 *
	 */
	public static final String $dlv_prnt_typ_nm = "dlv_prnt_typ_nm";
	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public static final String $asppl_cd = "asppl_cd";
	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public static final String $asppl_nm = "asppl_nm";
	/**
	 * Supplier dept. 発注先部署.<p>
	 *
	 */
	public static final String $sppl_cntct_dpt = "sppl_cntct_dpt";
	/**
	 * Supplier PIC 発注先担当者.<p>
	 *
	 */
	public static final String $sppl_cntct_psn = "sppl_cntct_psn";
	/**
	 * Supplier PIC form of address 発注先担当者敬称.<p>
	 *
	 */
	public static final String $sppl_cntct_psn_title = "sppl_cntct_psn_title";
	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public static final String $subcon_flg = "subcon_flg";
	/**
	 * Chargeable supplier 有償支給先.<p>
	 *
	 */
	public static final String $onr_prsppl_flg = "onr_prsppl_flg";
	public static final String $org_onr_prsppl_flg = "org_onr_prsppl_flg";
	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public static final String $repurc_obli_flg = "repurc_obli_flg";
	/**
	 * VMI purchasing dept. cd. ＶＭＩ購買部門ＣＤ.<p>
	 *
	 */
	public static final String $vmi_purc_dpt_cd = "vmi_purc_dpt_cd";
	/**
	 * VMI purchasing dept. name ＶＭＩ購買部門名.<p>
	 *
	 */
	public static final String $vmi_purc_dpt_nm = "vmi_purc_dpt_nm";
	/**
	 * VMI purchasing dept. cd. ＶＭＩ購買部門ＣＤ.<p>
	 *
	 */
	public static final String $check_vmi_purc_dpt_cd = "check_vmi_purc_dpt_cd";
	/**
	 * Purchase unit price acquisition type 購買単価取得区分.<p>
	 *
	 */
	public static final String $purc_upri_req_typ = "purc_upri_req_typ";
	/**
	 * Purchase unit price acquisition type name 購買単価取得区分名.<p>
	 *
	 */
	public static final String $purc_upri_req_typ_nm = "purc_upri_req_typ_nm";
	/**
	 * Allow purchasing unit price change 購買単価変更許可.<p>
	 *
	 */
	public static final String $purc_upri_cng_flg = "purc_upri_cng_flg";
	/**
	 * Check order promising 納期回答確認.<p>
	 *
	 */
	public static final String $prms_recv_flg = "prms_recv_flg";
	/**
	 * Rounding type (Purchase amount) 仕入金額端数処理区分.<p>
	 *
	 */
	public static final String $purc_amt_rnd_typ = "purc_amt_rnd_typ";
	/**
	 * Rounding type name (Purchase amount) 仕入金額端数処理区分名.<p>
	 *
	 */
	public static final String $purc_amt_rnd_typ_nm = "purc_amt_rnd_typ_nm";
	/**
	 * Purchase tax calculation type 仕入税計算区分.<p>
	 *
	 */
	public static final String $purc_tax_calc_typ = "purc_tax_calc_typ";
	/**
	 * Purchase tax calculation type name 仕入税計算区分名.<p>
	 *
	 */
	public static final String $purc_tax_calc_typ_nm = "purc_tax_calc_typ_nm";
	/**
	 * Rounding type (Purchase tax) 仕入税額端数処理区分.<p>
	 *
	 */
	public static final String $purc_tax_rnd_typ = "purc_tax_rnd_typ";
	/**
	 * Purchase tax amount rounding type 仕入税額端数処理区分名.<p>
	 *
	 */
	public static final String $purc_tax_rnd_typ_nm = "purc_tax_rnd_typ_nm";
	/**
	 * Purchase tax cd. 仕入税ＣＤ.<p>
	 *
	 */
	public static final String $purc_tax_cd = "purc_tax_cd";
	/**
	 * Purchase tax type name 仕入税名.<p>
	 *
	 */
	public static final String $purc_tax_nm = "purc_tax_nm";
	/**
	 * Purchase tax priority 仕入税優先.<p>
	 *
	 */
	public static final String $purc_tax_cd_prio_flg = "purc_tax_cd_prio_flg";
	/**
	 * Supplier calendar cd. 発注先カレンダＣＤ.<p>
	 *
	 */
	public static final String $sppl_cal_cd = "sppl_cal_cd";
	/**
	 * Supplier calendar name 発注先カレンダ名.<p>
	 *
	 */
	public static final String $sppl_cal_nm = "sppl_cal_nm";
	/**
	 * Display PO sheet cd. 注文書表示ＣＤ.<p>
	 *
	 */
	public static final String $po_print_cd = "po_print_cd";
	/**
	 * Display PO sheet name 注文書表示名.<p>
	 *
	 */
	public static final String $po_print_nm = "po_print_nm";
	/**
	 * Supplier delivery note cd. 発注先納品書ＣＤ.<p>
	 *
	 */
	public static final String $sppl_ship_form_cd = "sppl_ship_form_cd";
	/**
	 * Supplier delivery note name 発注先納品書名.<p>
	 *
	 */
	public static final String $sppl_ship_form_nm = "sppl_ship_form_nm";
	/**
	 * Delivery note at PO 発注時納品書.<p>
	 *
	 */
	public static final String $po_dlv_slip_flg = "po_dlv_slip_flg";
	/**
	 * Delivery note at delivery order 納入指示時納品書.<p>
	 *
	 */
	public static final String $dlv_inst_dlv_slip_flg = "dlv_inst_dlv_slip_flg";
	/**
	 * Delivery note at order promising result receipt 納期回答受領時納品書.<p>
	 *
	 */
	public static final String $prms_rcpt_dlv_slip_flg = "prms_rcpt_dlv_slip_flg";
	/**
	 * In-transit supply management type 支給積送管理区分.<p>
	 *
	 */
	public static final String $prov_rcv_typ = "prov_rcv_typ";
	/**
	 * Supply in-transit management type 支給積送管理区分名.<p>
	 *
	 */
	public static final String $prov_rcv_typ_nm = "prov_rcv_typ_nm";
	/**
	 * Purchase lot details split type 仕入ロット明細分割区分.<p>
	 *
	 */
	public static final String $purc_slip_each_lot_typ = "purc_slip_each_lot_typ";
	/**
	 * Purchase lot details split type name 仕入ロット明細分割区分名.<p>
	 *
	 */
	public static final String $purc_slip_each_lot_typ_nm = "purc_slip_each_lot_typ_nm";
	/**
	 * Supplier transaction terms cd. 1 発注先取引条件ＣＤ１.<p>
	 *
	 */
	public static final String $sppl_tterm_cd1 = "sppl_tterm_cd1";
	/**
	 * Supplier transaction terms name 1 発注先取引条件名１.<p>
	 *
	 */
	public static final String $sppl_tterm_nm1 = "sppl_tterm_nm1";
	/**
	 * Supplier transaction terms cd. 2 発注先取引条件ＣＤ２.<p>
	 *
	 */
	public static final String $sppl_tterm_cd2 = "sppl_tterm_cd2";
	/**
	 * Supplier transaction terms name 2 発注先取引条件名２.<p>
	 *
	 */
	public static final String $sppl_tterm_nm2 = "sppl_tterm_nm2";
	/**
	 * Supplier transaction terms cd. 3 発注先取引条件ＣＤ３.<p>
	 *
	 */
	public static final String $sppl_tterm_cd3 = "sppl_tterm_cd3";
	/**
	 * Supplier transaction terms name 3 発注先取引条件名３.<p>
	 *
	 */
	public static final String $sppl_tterm_nm3 = "sppl_tterm_nm3";
	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public static final String $pay_crryovr_times = "pay_crryovr_times";
	/**
	 * PO sheet by sales project 案件別注文書.<p>
	 *
	 */
	public static final String $wrk_po_flg = "wrk_po_flg";
	/**
	 * AP management by sales project 案件別債務管理.<p>
	 *
	 */
	public static final String $wrk_ap_flg = "wrk_ap_flg";
	/**
	 * Supplier invoice transaction 発注先インボイス取引.<p>
	 *
	 */
	public static final String $sppl_iv_flg = "sppl_iv_flg";
	/**
	 * Allow purchase invoice duplication 受領インボイス重複許可.<p>
	 *
	 */
	public static final String $rcpt_iv_dup_flg = "rcpt_iv_dup_flg";
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
	 * Subcontracting unit price type 外注単価区分.<p>
	 *
	 */
	public static final String $outsrc_upri_typ = "outsrc_upri_typ";
	/**
	 * Subcontracting unit price type name 外注単価区分名.<p>
	 *
	 */
	public static final String $outsrc_upri_typ_nm = "outsrc_upri_typ_nm";
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
	 * Allow supply unit price change 支給単価変更許可.<p>
	 *
	 */
	public static final String $prov_upri_cng_flg = "prov_upri_cng_flg";
	/**
	 * Supply tax cd. 支給税ＣＤ.<p>
	 *
	 */
	public static final String $prov_tax_cd = "prov_tax_cd";
	/**
	 * Supply tax name 支給税名.<p>
	 *
	 */
	public static final String $prov_tax_nm = "prov_tax_nm";
	/**
	 * Supply tax first 支給税優先.<p>
	 *
	 */
	public static final String $prov_tax_cd_prio_flg = "prov_tax_cd_prio_flg";
	/**
	 * Supply amount rounding type 支給金額端数処理区分.<p>
	 *
	 */
	public static final String $prov_amt_rnd_typ = "prov_amt_rnd_typ";
	/**
	 * Supply amount rounding type 支給金額端数処理区分名.<p>
	 *
	 */
	public static final String $prov_amt_rnd_typ_nm = "prov_amt_rnd_typ_nm";
	/**
	 * Supply tax calculation type 支給税計算区分.<p>
	 *
	 */
	public static final String $prov_tax_calc_typ = "prov_tax_calc_typ";
	/**
	 * Supply tax calculation type name 支給税計算区分名.<p>
	 *
	 */
	public static final String $prov_tax_calc_typ_nm = "prov_tax_calc_typ_nm";
	/**
	 * Supply tax rounding type 支給税額端数処理区分.<p>
	 *
	 */
	public static final String $prov_tax_rnd_typ = "prov_tax_rnd_typ";
	/**
	 * Supply tax amount rounding type 支給税額端数処理区分名.<p>
	 *
	 */
	public static final String $prov_tax_rnd_typ_nm = "prov_tax_rnd_typ_nm";
	/**
	 * Report issue type (Supplier) 帳票発行区分（発注先）.<p>
	 *
	 */
	public static final String $sppl_prnt_typ = "sppl_prnt_typ";
	/**
	 * Report issue type name (Supplier) 帳票発行区分名（発注先）.<p>
	 *
	 */
	public static final String $sppl_prnt_typ_nm = "sppl_prnt_typ_nm";
	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public static final String $bsppl_cd = "bsppl_cd";
	/**
	 * Scheduled payee name 支払予定管理先名.<p>
	 *
	 */
	public static final String $bsppl_nm = "bsppl_nm";
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
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public static final String $check_ap_dpt_cd = "check_ap_dpt_cd";
	/**
	 * Report issue type (AP supplier) 帳票発行区分（買掛先）.<p>
	 *
	 */
	public static final String $asppl_prnt_typ = "asppl_prnt_typ";
	/**
	 * Report issue type name (AP supplier) 帳票発行区分名（買掛先）.<p>
	 *
	 */
	public static final String $asppl_prnt_typ_nm = "asppl_prnt_typ_nm";
	/**
	 * Payee cd. 支払先ＣＤ.<p>
	 *
	 */
	public static final String $psppl_cd = "psppl_cd";
	/**
	 * Payee name 支払先名.<p>
	 *
	 */
	public static final String $psppl_nm = "psppl_nm";
	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public static final String $bsppl_dpt_cd = "bsppl_dpt_cd";
	/**
	 * Name of dept. in charge of scheduled payee 支払予定管理先担当部門名.<p>
	 *
	 */
	public static final String $bsppl_dpt_nm = "bsppl_dpt_nm";
	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public static final String $check_bsppl_dpt_cd = "check_bsppl_dpt_cd";
	/**
	 * AP credit managed BP cd. 債務与信管理先ＣＤ.<p>
	 *
	 */
	public static final String $ap_cred_cd = "ap_cred_cd";
	/**
	 * AP credit managed BP name 債務与信管理先名.<p>
	 *
	 */
	public static final String $ap_cred_nm = "ap_cred_nm";
	/**
	 * Purchase temporary unit price closing 仕入仮単価締.<p>
	 *
	 */
	public static final String $purc_interim_cl_flg = "purc_interim_cl_flg";
	/**
	 * Payee account cd. 支払先口座ＣＤ.<p>
	 *
	 */
	public static final String $pay_bank_ac_cd = "pay_bank_ac_cd";
	/**
	 * Payee account name 支払先口座名.<p>
	 *
	 */
	public static final String $pay_bank_ac_nm = "pay_bank_ac_nm";
	/**
	 * Payment per transaction 都度支払.<p>
	 *
	 */
	public static final String $pay_spot_flg = "pay_spot_flg";
	/**
	 * Payment closing date 1 支払締日１.<p>
	 *
	 */
	public static final String $psppl_cl_day1 = "psppl_cl_day1";
	/**
	 * Payment closing date 2 支払締日２.<p>
	 *
	 */
	public static final String $psppl_cl_day2 = "psppl_cl_day2";
	/**
	 * Payment closing date 3 支払締日３.<p>
	 *
	 */
	public static final String $psppl_cl_day3 = "psppl_cl_day3";
	/**
	 * Payment closing date 4 支払締日４.<p>
	 *
	 */
	public static final String $psppl_cl_day4 = "psppl_cl_day4";
	/**
	 * Payment closing date 5 支払締日５.<p>
	 *
	 */
	public static final String $psppl_cl_day5 = "psppl_cl_day5";
	/**
	 * AP offset group cd. 債務相殺グループＣＤ.<p>
	 *
	 */
	public static final String $ap_setoff_grp_cd = "ap_setoff_grp_cd";
	/**
	 * AP offset group name 債務相殺グループ名.<p>
	 *
	 */
	public static final String $ap_setoff_grp_nm = "ap_setoff_grp_nm";
	/**
	 * Payment tax calculation 支払税計算.<p>
	 *
	 */
	public static final String $tax_on_pay_flg = "tax_on_pay_flg";
	/**
	 * Payment tax amount rounding type 支払税額端数処理区分.<p>
	 *
	 */
	public static final String $pay_tax_rnd_typ = "pay_tax_rnd_typ";
	/**
	 * Payment tax amount rounding type name 支払税額端数処理区分名.<p>
	 *
	 */
	public static final String $pay_tax_rnd_typ_nm = "pay_tax_rnd_typ_nm";
	/**
	 * Payment schedule before/after type 支払予定前後区分.<p>
	 *
	 */
	public static final String $pay_schd_ba_typ = "pay_schd_ba_typ";
	/**
	 * Payment schedule before/after type name 支払予定前後区分名.<p>
	 *
	 */
	public static final String $pay_schd_ba_typ_nm = "pay_schd_ba_typ_nm";
	/**
	 * Batch payment schedule closing バッチ支払予定締.<p>
	 *
	 */
	public static final String $batch_pay_schd_cl_flg = "batch_pay_schd_cl_flg";
	/**
	 * Payment schedule closing delay days 支払予定締遅延日数.<p>
	 *
	 */
	public static final String $pay_schd_cl_delay_days = "pay_schd_cl_delay_days";
	/**
	 * Payment schedule closing before/after type 支払予定締前後区分.<p>
	 *
	 */
	public static final String $pay_schd_cl_ba_typ = "pay_schd_cl_ba_typ";
	/**
	 * Payment schedule closing before/after type name 支払予定締前後区分名.<p>
	 *
	 */
	public static final String $pay_schd_cl_ba_typ_nm = "pay_schd_cl_ba_typ_nm";
	/**
	 * Report issue type (Scheduled payee) 帳票発行区分（支払予定管理先）.<p>
	 *
	 */
	public static final String $bsppl_prnt_typ = "bsppl_prnt_typ";
	/**
	 * Report issue type name (Scheduled payee) 帳票発行区分名（支払予定管理先）.<p>
	 *
	 */
	public static final String $bsppl_prnt_typ_nm = "bsppl_prnt_typ_nm";
	/**
	 * Payment notice to be issued 支払通知書発行対象.<p>
	 *
	 */
	public static final String $pay_ntc_prnt_flg = "pay_ntc_prnt_flg";
	/**
	 * Payment notice send-to zip code 支払通知書送付郵便番号.<p>
	 *
	 */
	public static final String $pay_ntc_zip_cd = "pay_ntc_zip_cd";
	/**
	 * Payment notice send-to address 1 支払通知書送付住所１.<p>
	 *
	 */
	public static final String $pay_ntc_addr1 = "pay_ntc_addr1";
	/**
	 * Payment notice send-to address 2 支払通知書送付住所２.<p>
	 *
	 */
	public static final String $pay_ntc_addr2 = "pay_ntc_addr2";
	/**
	 * Payment notice send-to address 3 支払通知書送付住所３.<p>
	 *
	 */
	public static final String $pay_ntc_addr3 = "pay_ntc_addr3";
	/**
	 * Payment notice send-to address 4 支払通知書送付住所４.<p>
	 *
	 */
	public static final String $pay_ntc_addr4 = "pay_ntc_addr4";
	/**
	 * Payment notice send-to TEL 支払通知書送付ＴＥＬ.<p>
	 *
	 */
	public static final String $pay_ntc_tel = "pay_ntc_tel";
	/**
	 * Payment notice destination 支払通知書宛先.<p>
	 *
	 */
	public static final String $pay_ntc_bsppl_nm = "pay_ntc_bsppl_nm";
	/**
	 * Payment notice send-to dept. 支払通知書送付部署.<p>
	 *
	 */
	public static final String $pay_ntc_bsppl_dpt = "pay_ntc_bsppl_dpt";
	/**
	 * Payment notice send-to PIC 支払通知書送付担当者.<p>
	 *
	 */
	public static final String $pay_ntc_bsppl_psn = "pay_ntc_bsppl_psn";
	/**
	 * Payment notice send-to PIC honorific title 支払通知書送付担当者敬称.<p>
	 *
	 */
	public static final String $pay_ntc_bsppl_psn_title = "pay_ntc_bsppl_psn_title";
	/**
	 * Output payment notice details 支払通知書明細出力.<p>
	 *
	 */
	public static final String $pay_ntc_dtl_outp_flg = "pay_ntc_dtl_outp_flg";
	/**
	 * Display balance of previous month on payment notice 支払通知書前月残高表示.<p>
	 *
	 */
	public static final String $pay_ntc_bfw_bal_disp_flg = "pay_ntc_bfw_bal_disp_flg";
	/**
	 * Display advance payment on payment notice 支払通知書前渡金表示.<p>
	 *
	 */
	public static final String $pay_ntc_adv_pay_flg = "pay_ntc_adv_pay_flg";
	/**
	 * Display payment schedule on payment notice 支払通知書支払予定表示.<p>
	 *
	 */
	public static final String $pay_ntc_dtl_pay_flg = "pay_ntc_dtl_pay_flg";
	/**
	 * Payment notice details subtotal type 支払通知書明細小計区分.<p>
	 *
	 */
	public static final String $pay_ntc_dtl_subttl_typ = "pay_ntc_dtl_subttl_typ";
	/**
	 * Payment notice details subtotal type name 支払通知書明細小計区分名.<p>
	 *
	 */
	public static final String $pay_ntc_dtl_subttl_typ_nm = "pay_ntc_dtl_subttl_typ_nm";
	/**
	 * Payment notice details page break type 支払通知書明細改頁区分.<p>
	 *
	 */
	public static final String $pay_ntc_dtl_brk_typ = "pay_ntc_dtl_brk_typ";
	/**
	 * Payment notice details page break type name 支払通知書明細改頁区分名.<p>
	 *
	 */
	public static final String $pay_ntc_dtl_brk_typ_nm = "pay_ntc_dtl_brk_typ_nm";
	/**
	 * Payment notice details sorting order type 支払通知書明細並順区分.<p>
	 *
	 */
	public static final String $pay_ntc_dtl_sort_typ = "pay_ntc_dtl_sort_typ";
	/**
	 * Payment notice details sorting order type name 支払通知書明細並順区分名.<p>
	 *
	 */
	public static final String $pay_ntc_dtl_sort_typ_nm = "pay_ntc_dtl_sort_typ_nm";
	/**
	 * Payment notice cancel slip display type 支払通知書取消伝票表示区分.<p>
	 *
	 */
	public static final String $pay_ntc_can_slip_typ = "pay_ntc_can_slip_typ";
	/**
	 * Payment notice cancel slip display type name 支払通知書取消伝票表示区分名.<p>
	 *
	 */
	public static final String $pay_ntc_can_slip_typ_nm = "pay_ntc_can_slip_typ_nm";
	/**
	 * Payee remarks 支払先備考.<p>
	 *
	 */
	public static final String $psppl_rmrks = "psppl_rmrks";
	/**
	 * Note sight upper limit 手形サイト上限.<p>
	 *
	 */
	public static final String $note_days = "note_days";
	/**
	 * Payment dept. cd. 支払部門ＣＤ.<p>
	 *
	 */
	public static final String $pay_dpt_cd = "pay_dpt_cd";
	/**
	 * Payment dept. name 支払部門名.<p>
	 *
	 */
	public static final String $pay_dpt_nm = "pay_dpt_nm";
	/**
	 * Payment dept. cd. 支払部門ＣＤ.<p>
	 *
	 */
	public static final String $check_pay_dpt_cd = "check_pay_dpt_cd";
	/**
	 * Report issue type (Payee) 帳票発行区分（支払先）.<p>
	 *
	 */
	public static final String $psppl_prnt_typ = "psppl_prnt_typ";
	/**
	 * Report issue type name (Payee) 帳票発行区分名（支払先）.<p>
	 *
	 */
	public static final String $psppl_prnt_typ_nm = "psppl_prnt_typ_nm";
	/**
	 * Update counter (BP company master) 更新カウンタ（取引先会社マスタ）.<p>
	 *
	 */
	public static final String $bp_com_upd_cntr = "bp_com_upd_cntr";
	/**
	 * Select 選択.<p>
	 *
	 */
	public static final String $check = "check";


	public static final MCMeta bp_cd_META = createCommonMeta($bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bp_nm_lcl_META = createCommonMeta($bp_nm_lcl, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bp_nm_META = createCommonMeta($bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta del_flg_META = createCommonMeta($del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta all_com_flg_META = createCommonMeta($all_com_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta org_all_com_flg_META = createCommonMeta($org_all_com_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta com_use_flg_META = createCommonMeta($com_use_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta com_ex_flg_META = createCommonMeta($com_ex_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_alt_nm1_META = createCommonMeta($bp_alt_nm1, mcframe.commonMA.meta.MA_META.BP_ALT_NM1);
	public static final MCMeta bp_alt_nm2_META = createCommonMeta($bp_alt_nm2, mcframe.commonMA.meta.MA_META.BP_ALT_NM2);
	public static final MCMeta bp_alt_nm3_META = createCommonMeta($bp_alt_nm3, mcframe.commonMA.meta.MA_META.BP_ALT_NM3);
	public static final MCMeta bp_alt_nm4_META = createCommonMeta($bp_alt_nm4, mcframe.commonMA.meta.MA_META.BP_ALT_NM4);
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta cur_nm_META = createCommonMeta($cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta cntry_cd_META = createCommonMeta($cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta cntry_nm_META = createCommonMeta($cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta area_cd_META = createCommonMeta($area_cd, mcframe.commonMA.meta.MA_META.AREA_CD);
	public static final MCMeta area_nm_META = createCommonMeta($area_nm, mcframe.commonMA.meta.MA_META.AREA_NM);
	public static final MCMeta cst_flg_META = createCommonMeta($cst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta org_cst_flg_META = createCommonMeta($org_cst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta acst_flg_META = createCommonMeta($acst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bcst_flg_META = createCommonMeta($bcst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcst_flg_META = createCommonMeta($rcst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_flg_META = createCommonMeta($dlv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dest_flg_META = createCommonMeta($dest_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cred_flg_META = createCommonMeta($cred_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_flg_META = createCommonMeta($sppl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta org_sppl_flg_META = createCommonMeta($org_sppl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta asppl_flg_META = createCommonMeta($asppl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bsppl_flg_META = createCommonMeta($bsppl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta psppl_flg_META = createCommonMeta($psppl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta maker_flg_META = createCommonMeta($maker_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta biz_co_no_META = createCommonMeta($biz_co_no, mcframe.commonMA.meta.MA_META.BIZ_CO_NO);
	public static final MCMeta ein_META = createCommonMeta($ein, mcframe.commonMA.meta.MA_META.EIN);
	public static final MCMeta std_co_cd_META = createCommonMeta($std_co_cd, mcframe.commonMA.meta.MA_META.STD_CO_CD);
	public static final MCMeta tel_META = createCommonMeta($tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta fax_META = createCommonMeta($fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta zip_cd_META = createCommonMeta($zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta addr1_META = createCommonMeta($addr1, mcframe.commonMA.meta.MA_META.ADDR1);
	public static final MCMeta addr2_META = createCommonMeta($addr2, mcframe.commonMA.meta.MA_META.ADDR2);
	public static final MCMeta addr3_META = createCommonMeta($addr3, mcframe.commonMA.meta.MA_META.ADDR3);
	public static final MCMeta addr4_META = createCommonMeta($addr4, mcframe.commonMA.meta.MA_META.ADDR4);
	public static final MCMeta prnt_lcl_cd_META = createCommonMeta($prnt_lcl_cd, mcframe.commonMA.meta.MA_META.LCL_CD);
	public static final MCMeta prnt_lcl_nm_META = createCommonMeta($prnt_lcl_nm, mcframe.commonMA.meta.MA_META.LCL_NM);
	public static final MCMeta bp_alc_grp_META = createCommonMeta($bp_alc_grp, mcframe.commonMA.meta.MA_META.BP_ALC_GRP);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
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
	public static final MCMeta bp_grp_cd1_META = createCommonMeta($bp_grp_cd1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_nm1_META = createCommonMeta($bp_grp_nm1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_cd2_META = createCommonMeta($bp_grp_cd2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_nm2_META = createCommonMeta($bp_grp_nm2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_cd3_META = createCommonMeta($bp_grp_cd3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_nm3_META = createCommonMeta($bp_grp_nm3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_cd4_META = createCommonMeta($bp_grp_cd4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_nm4_META = createCommonMeta($bp_grp_nm4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_cd5_META = createCommonMeta($bp_grp_cd5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_nm5_META = createCommonMeta($bp_grp_nm5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_cd6_META = createCommonMeta($bp_grp_cd6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_nm6_META = createCommonMeta($bp_grp_nm6, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_cd7_META = createCommonMeta($bp_grp_cd7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_nm7_META = createCommonMeta($bp_grp_nm7, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_cd8_META = createCommonMeta($bp_grp_cd8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_nm8_META = createCommonMeta($bp_grp_nm8, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_cd9_META = createCommonMeta($bp_grp_cd9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_nm9_META = createCommonMeta($bp_grp_nm9, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_cd10_META = createCommonMeta($bp_grp_cd10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_nm10_META = createCommonMeta($bp_grp_nm10, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta ins_usr_id_c_META = createCommonMeta($ins_usr_id_c, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_c_META = createCommonMeta($ins_usr_nm_c, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_func_id_c_META = createCommonMeta($ins_func_id_c, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_c_META = createCommonMeta($ins_func_nm_c, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_usr_id_c_META = createCommonMeta($upd_usr_id_c, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_c_META = createCommonMeta($upd_usr_nm_c, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_func_id_c_META = createCommonMeta($upd_func_id_c, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_c_META = createCommonMeta($upd_func_nm_c, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta ins_ts_c_META = createCommonMeta($ins_ts_c, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_ts_c_META = createCommonMeta($upd_ts_c, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_srv_req_no_c_META = createCommonMeta($upd_srv_req_no_c, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);
	public static final MCMeta upd_cntr_c_META = createCommonMeta($upd_cntr_c, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta del_usr_id_c_META = createCommonMeta($del_usr_id_c, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta del_usr_nm_c_META = createCommonMeta($del_usr_nm_c, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta del_ts_c_META = createCommonMeta($del_ts_c, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta del_usr_id_META = createCommonMeta($del_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta del_usr_nm_META = createCommonMeta($del_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta del_ts_META = createCommonMeta($del_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta acst_cd_META = createCommonMeta($acst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta acst_nm_META = createCommonMeta($acst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta cst_cntct_dpt_META = createCommonMeta($cst_cntct_dpt, mcframe.commonMA.meta.MA_META.CNTCT_DPT);
	public static final MCMeta cst_cntct_psn_META = createCommonMeta($cst_cntct_psn, mcframe.commonMA.meta.MA_META.CNTCT_PSN);
	public static final MCMeta cst_cntct_psn_title_META = createCommonMeta($cst_cntct_psn_title, mcframe.commonMA.meta.MA_META.BP_PSN_TITLE);
	public static final MCMeta cst_sundry_flg_META = createCommonMeta($cst_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ar_dpt_typ_META = createCommonMeta($ar_dpt_typ, mcframe.commonMA.meta.MA_META.AR_DPT_TYP);
	public static final MCMeta ar_dpt_typ_nm_META = createCommonMeta($ar_dpt_typ_nm, mcframe.commonMA.meta.MA_META.AR_DPT_TYP_NM);
	public static final MCMeta ar_dpt_cd_META = createCommonMeta($ar_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ar_dpt_nm_META = createCommonMeta($ar_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta check_ar_dpt_cd_META = createCommonMeta($check_ar_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta sls_upri_rnd_typ_META = createCommonMeta($sls_upri_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta sls_upri_rnd_typ_nm_META = createCommonMeta($sls_upri_rnd_typ_nm, mcframe.commonMA.meta.MA_META.RND_TYP_NM);
	public static final MCMeta sls_upri_req_typ_META = createCommonMeta($sls_upri_req_typ, mcframe.commonMA.meta.MA_META.SLS_UPRI_REQ_TYP);
	public static final MCMeta sls_upri_req_typ_nm_META = createCommonMeta($sls_upri_req_typ_nm, mcframe.commonMA.meta.MA_META.SLS_UPRI_REQ_TYP_NM);
	public static final MCMeta sls_upri_cng_flg_META = createCommonMeta($sls_upri_cng_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_amt_rnd_typ_META = createCommonMeta($sls_amt_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta sls_amt_rnd_typ_nm_META = createCommonMeta($sls_amt_rnd_typ_nm, mcframe.commonMA.meta.MA_META.RND_TYP_NM);
	public static final MCMeta sls_tax_calc_typ_META = createCommonMeta($sls_tax_calc_typ, mcframe.commonMA.meta.MA_META.TAX_CALC_TYP);
	public static final MCMeta sls_tax_calc_typ_nm_META = createCommonMeta($sls_tax_calc_typ_nm, mcframe.commonMA.meta.MA_META.TAX_CALC_TYP_NM);
	public static final MCMeta sls_tax_rnd_typ_META = createCommonMeta($sls_tax_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta sls_tax_rnd_typ_nm_META = createCommonMeta($sls_tax_rnd_typ_nm, mcframe.commonMA.meta.MA_META.RND_TYP_NM);
	public static final MCMeta sls_tax_cd_META = createCommonMeta($sls_tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta sls_tax_nm_META = createCommonMeta($sls_tax_nm, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta sls_tax_cd_prio_flg_META = createCommonMeta($sls_tax_cd_prio_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_back_stop_typ_META = createCommonMeta($lot_back_stop_typ, mcframe.commonMA.meta.MA_META.LOT_BACK_STOP_TYP);
	public static final MCMeta lot_back_stop_typ_nm_META = createCommonMeta($lot_back_stop_typ_nm, mcframe.commonMA.meta.MA_META.LOT_BACK_STOP_TYP_NM);
	public static final MCMeta sls_basis_typ_META = createCommonMeta($sls_basis_typ, mcframe.commonMA.meta.MA_META.SLS_BASIS_TYP);
	public static final MCMeta sls_basis_typ_nm_META = createCommonMeta($sls_basis_typ_nm, mcframe.commonMA.meta.MA_META.SLS_BASIS_TYP_NM);
	public static final MCMeta bill_basis_typ_META = createCommonMeta($bill_basis_typ, mcframe.commonMA.meta.MA_META.BILL_BASIS_TYP);
	public static final MCMeta bill_basis_typ_nm_META = createCommonMeta($bill_basis_typ_nm, mcframe.commonMA.meta.MA_META.BILL_BASIS_TYP_NM);
	public static final MCMeta bill_crryovr_times_META = createCommonMeta($bill_crryovr_times, mcframe.commonMA.meta.MA_META.CRRYOVR_TIMES);
	public static final MCMeta slip_each_lot_typ_META = createCommonMeta($slip_each_lot_typ, mcframe.commonMA.meta.MA_META.SLIP_EACH_LOT_TYP);
	public static final MCMeta slip_each_lot_typ_nm_META = createCommonMeta($slip_each_lot_typ_nm, mcframe.commonMA.meta.MA_META.SLIP_EACH_LOT_TYP_NM);
	public static final MCMeta ship_schd_split_typ_META = createCommonMeta($ship_schd_split_typ, mcframe.commonMA.meta.MA_META.SHIP_SCHD_SPLIT_TYP);
	public static final MCMeta ship_schd_split_typ_nm_META = createCommonMeta($ship_schd_split_typ_nm, mcframe.commonMA.meta.MA_META.SHIP_SCHD_SPLIT_TYP_NM);
	public static final MCMeta stk_lst_issue_flg_META = createCommonMeta($stk_lst_issue_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_lst_form_cd_META = createCommonMeta($stk_lst_form_cd, mcframe.commonMA.meta.MA_META.SLIP_FORM_CD);
	public static final MCMeta stk_lst_form_nm_META = createCommonMeta($stk_lst_form_nm, mcframe.commonMA.meta.MA_META.SLIP_FORM_NM);
	public static final MCMeta cst_ship_form_cd_META = createCommonMeta($cst_ship_form_cd, mcframe.commonMA.meta.MA_META.SLIP_FORM_CD);
	public static final MCMeta cst_ship_form_nm_META = createCommonMeta($cst_ship_form_nm, mcframe.commonMA.meta.MA_META.SLIP_FORM_NM);
	public static final MCMeta wrk_ar_flg_META = createCommonMeta($wrk_ar_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_iv_flg_META = createCommonMeta($cst_iv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_lt_META = createCommonMeta($ship_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta cst_tterm_cd1_META = createCommonMeta($cst_tterm_cd1, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta cst_tterm_nm1_META = createCommonMeta($cst_tterm_nm1, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta cst_tterm_cd2_META = createCommonMeta($cst_tterm_cd2, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta cst_tterm_nm2_META = createCommonMeta($cst_tterm_nm2, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta cst_tterm_cd3_META = createCommonMeta($cst_tterm_cd3, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta cst_tterm_nm3_META = createCommonMeta($cst_tterm_nm3, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta sls_anly_cd1_META = createCommonMeta($sls_anly_cd1, mcframe.commonMA.meta.MA_META.SLS_ANLY_CD);
	public static final MCMeta sls_anly_nm1_META = createCommonMeta($sls_anly_nm1, mcframe.commonMA.meta.MA_META.SLS_ANLY_NM);
	public static final MCMeta sls_anly_cd2_META = createCommonMeta($sls_anly_cd2, mcframe.commonMA.meta.MA_META.SLS_ANLY_CD);
	public static final MCMeta sls_anly_nm2_META = createCommonMeta($sls_anly_nm2, mcframe.commonMA.meta.MA_META.SLS_ANLY_NM);
	public static final MCMeta sls_anly_cd3_META = createCommonMeta($sls_anly_cd3, mcframe.commonMA.meta.MA_META.SLS_ANLY_CD);
	public static final MCMeta sls_anly_nm3_META = createCommonMeta($sls_anly_nm3, mcframe.commonMA.meta.MA_META.SLS_ANLY_NM);
	public static final MCMeta cst_prnt_typ_META = createCommonMeta($cst_prnt_typ, mcframe.commonMA.meta.MA_META.PRNT_TYP);
	public static final MCMeta cst_prnt_typ_nm_META = createCommonMeta($cst_prnt_typ_nm, mcframe.commonMA.meta.MA_META.PRNT_TYP_NM);
	public static final MCMeta not_lg_mix_flg_META = createCommonMeta($not_lg_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_lot_mix_flg_META = createCommonMeta($not_lot_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_sublot_mix_flg_META = createCommonMeta($not_sublot_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bcst_cd_META = createCommonMeta($bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bcst_nm_META = createCommonMeta($bcst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta acst_prnt_typ_META = createCommonMeta($acst_prnt_typ, mcframe.commonMA.meta.MA_META.PRNT_TYP);
	public static final MCMeta acst_prnt_typ_nm_META = createCommonMeta($acst_prnt_typ_nm, mcframe.commonMA.meta.MA_META.PRNT_TYP_NM);
	public static final MCMeta rcst_cd_META = createCommonMeta($rcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta rcst_nm_META = createCommonMeta($rcst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta ar_cred_cd_META = createCommonMeta($ar_cred_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta ar_cred_nm_META = createCommonMeta($ar_cred_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bill_dpt_typ_META = createCommonMeta($bill_dpt_typ, mcframe.commonMA.meta.MA_META.BILL_DPT_TYP);
	public static final MCMeta bill_dpt_typ_nm_META = createCommonMeta($bill_dpt_typ_nm, mcframe.commonMA.meta.MA_META.BILL_DPT_TYP_NM);
	public static final MCMeta bcst_dpt_cd_META = createCommonMeta($bcst_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bcst_dpt_nm_META = createCommonMeta($bcst_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta check_bcst_dpt_cd_META = createCommonMeta($check_bcst_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bill_cl_typ_META = createCommonMeta($bill_cl_typ, mcframe.commonMA.meta.MA_META.BILL_CL_TYP);
	public static final MCMeta bill_cl_typ_nm_META = createCommonMeta($bill_cl_typ_nm, mcframe.commonMA.meta.MA_META.BILL_CL_TYP_NM);
	public static final MCMeta bill_cl_day1_META = createCommonMeta($bill_cl_day1, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta bill_cl_day2_META = createCommonMeta($bill_cl_day2, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta bill_cl_day3_META = createCommonMeta($bill_cl_day3, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta bill_cl_day4_META = createCommonMeta($bill_cl_day4, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta bill_cl_day5_META = createCommonMeta($bill_cl_day5, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta tax_on_bill_flg_META = createCommonMeta($tax_on_bill_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_tax_rnd_typ_META = createCommonMeta($bill_tax_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta bill_tax_rnd_typ_nm_META = createCommonMeta($bill_tax_rnd_typ_nm, mcframe.commonMA.meta.MA_META.RND_TYP_NM);
	public static final MCMeta bill_cl_delay_days_META = createCommonMeta($bill_cl_delay_days, mcframe.commonMA.meta.MA_META.DELAY_DAYS);
	public static final MCMeta bill_cl_ba_typ_META = createCommonMeta($bill_cl_ba_typ, mcframe.commonMA.meta.MA_META.BA_TYP);
	public static final MCMeta bill_cl_ba_typ_nm_META = createCommonMeta($bill_cl_ba_typ_nm, mcframe.commonMA.meta.MA_META.BA_TYP_NM);
	public static final MCMeta bill_cal_cd_META = createCommonMeta($bill_cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta bill_cal_nm_META = createCommonMeta($bill_cal_nm, mcframe.commonMA.meta.MA_META.CAL_NM);
	public static final MCMeta rcv_ba_typ_META = createCommonMeta($rcv_ba_typ, mcframe.commonMA.meta.MA_META.BA_TYP);
	public static final MCMeta rcv_ba_typ_nm_META = createCommonMeta($rcv_ba_typ_nm, mcframe.commonMA.meta.MA_META.BA_TYP_NM);
	public static final MCMeta auto_line_appl_flg_META = createCommonMeta($auto_line_appl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_interim_cl_flg_META = createCommonMeta($sls_interim_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ar_setoff_grp_cd_META = createCommonMeta($ar_setoff_grp_cd, mcframe.commonMA.meta.MA_META.SETOFF_GRP_CD);
	public static final MCMeta ar_setoff_grp_nm_META = createCommonMeta($ar_setoff_grp_nm, mcframe.commonMA.meta.MA_META.SETOFF_GRP_NM);
	public static final MCMeta bcst_prnt_typ_META = createCommonMeta($bcst_prnt_typ, mcframe.commonMA.meta.MA_META.PRNT_TYP);
	public static final MCMeta bcst_prnt_typ_nm_META = createCommonMeta($bcst_prnt_typ_nm, mcframe.commonMA.meta.MA_META.PRNT_TYP_NM);
	public static final MCMeta bill_zip_cd_META = createCommonMeta($bill_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta bill_addr1_META = createCommonMeta($bill_addr1, mcframe.commonMA.meta.MA_META.ADDR1);
	public static final MCMeta bill_addr2_META = createCommonMeta($bill_addr2, mcframe.commonMA.meta.MA_META.ADDR2);
	public static final MCMeta bill_addr3_META = createCommonMeta($bill_addr3, mcframe.commonMA.meta.MA_META.ADDR3);
	public static final MCMeta bill_addr4_META = createCommonMeta($bill_addr4, mcframe.commonMA.meta.MA_META.ADDR4);
	public static final MCMeta bill_tel_META = createCommonMeta($bill_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta bill_bcst_nm_META = createCommonMeta($bill_bcst_nm, mcframe.commonMA.meta.MA_META.BILL_BCST_NM);
	public static final MCMeta bill_bcst_dpt_META = createCommonMeta($bill_bcst_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta bill_bcst_psn_META = createCommonMeta($bill_bcst_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta bill_bcst_psn_title_META = createCommonMeta($bill_bcst_psn_title, mcframe.commonMA.meta.MA_META.BP_PSN_TITLE);
	public static final MCMeta bill_prnt_typ_META = createCommonMeta($bill_prnt_typ, mcframe.commonMA.meta.MA_META.BILL_PRNT_TYP);
	public static final MCMeta bill_prnt_typ_nm_META = createCommonMeta($bill_prnt_typ_nm, mcframe.commonMA.meta.MA_META.BILL_PRNT_TYP_NM);
	public static final MCMeta sls_dtl_outp_typ_META = createCommonMeta($sls_dtl_outp_typ, mcframe.commonMA.meta.MA_META.SLS_DTL_OUTP_TYP);
	public static final MCMeta sls_dtl_outp_typ_nm_META = createCommonMeta($sls_dtl_outp_typ_nm, mcframe.commonMA.meta.MA_META.SLS_DTL_OUTP_TYP_NM);
	public static final MCMeta bill_dtl_outp_flg_META = createCommonMeta($bill_dtl_outp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bfw_bal_disp_flg_META = createCommonMeta($bfw_bal_disp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_dtl_adv_flg_META = createCommonMeta($bill_dtl_adv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_dtl_rcv_flg_META = createCommonMeta($bill_dtl_rcv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_dtl_subttl_typ_META = createCommonMeta($bill_dtl_subttl_typ, mcframe.commonMA.meta.MA_META.BILL_DTL_SUBTTL_TYP);
	public static final MCMeta bill_dtl_subttl_typ_nm_META = createCommonMeta($bill_dtl_subttl_typ_nm, mcframe.commonMA.meta.MA_META.BILL_DTL_SUBTTL_TYP_NM);
	public static final MCMeta bill_dtl_brk_typ_META = createCommonMeta($bill_dtl_brk_typ, mcframe.commonMA.meta.MA_META.BILL_DTL_BRK_TYP);
	public static final MCMeta bill_dtl_brk_typ_nm_META = createCommonMeta($bill_dtl_brk_typ_nm, mcframe.commonMA.meta.MA_META.BILL_DTL_BRK_TYP_NM);
	public static final MCMeta bill_dtl_sort_typ_META = createCommonMeta($bill_dtl_sort_typ, mcframe.commonMA.meta.MA_META.BILL_DTL_SORT_TYP);
	public static final MCMeta bill_dtl_sort_typ_nm_META = createCommonMeta($bill_dtl_sort_typ_nm, mcframe.commonMA.meta.MA_META.BILL_DTL_SORT_TYP_NM);
	public static final MCMeta bill_can_slip_typ_META = createCommonMeta($bill_can_slip_typ, mcframe.commonMA.meta.MA_META.BILL_CAN_SLIP_TYP);
	public static final MCMeta bill_can_slip_typ_nm_META = createCommonMeta($bill_can_slip_typ_nm, mcframe.commonMA.meta.MA_META.BILL_CAN_SLIP_TYP_NM);
	public static final MCMeta xfr_psn_META = createCommonMeta($xfr_psn, mcframe.commonMA.meta.MA_META.XFR_PSN);
	public static final MCMeta rcv_auto_appl_tgt_flg_META = createCommonMeta($rcv_auto_appl_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcv_amt_match_flg_META = createCommonMeta($rcv_amt_match_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ar_sttl_typ_match_flg_META = createCommonMeta($ar_sttl_typ_match_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta calc_com_paid_flg_META = createCommonMeta($calc_com_paid_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta auto_appl_delay_days_META = createCommonMeta($auto_appl_delay_days, mcframe.commonMA.meta.MA_META.DELAY_DAYS);
	public static final MCMeta rcst_prnt_typ_META = createCommonMeta($rcst_prnt_typ, mcframe.commonMA.meta.MA_META.PRNT_TYP);
	public static final MCMeta rcst_prnt_typ_nm_META = createCommonMeta($rcst_prnt_typ_nm, mcframe.commonMA.meta.MA_META.PRNT_TYP_NM);
	public static final MCMeta lg_grp_cd_META = createCommonMeta($lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta lg_grp_nm_META = createCommonMeta($lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta dlv_sundry_flg_META = createCommonMeta($dlv_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tdlv_flg_META = createCommonMeta($tdlv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta org_tdlv_flg_META = createCommonMeta($org_tdlv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta via_dlv_typ_META = createCommonMeta($via_dlv_typ, mcframe.commonMA.meta.MA_META.VIA_DLV_TYP);
	public static final MCMeta via_dlv_typ_nm_META = createCommonMeta($via_dlv_typ_nm, mcframe.commonMA.meta.MA_META.VIA_DLV_TYP_NM);
	public static final MCMeta tdlv_req_flg_META = createCommonMeta($tdlv_req_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_cal_cd_META = createCommonMeta($dlv_cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta dlv_cal_nm_META = createCommonMeta($dlv_cal_nm, mcframe.commonMA.meta.MA_META.CAL_NM);
	public static final MCMeta dlv_cntct_dpt_META = createCommonMeta($dlv_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta dlv_cntct_psn_META = createCommonMeta($dlv_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta dlv_cntct_psn_title_META = createCommonMeta($dlv_cntct_psn_title, mcframe.commonMA.meta.MA_META.BP_PSN_TITLE);
	public static final MCMeta pri_prnt_flg_META = createCommonMeta($pri_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cnsgn_stktk_flg_META = createCommonMeta($cnsgn_stktk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_chnnl1_META = createCommonMeta($dlv_chnnl1, mcframe.commonMA.meta.MA_META.DLV_CHNNL1);
	public static final MCMeta dlv_chnnl2_META = createCommonMeta($dlv_chnnl2, mcframe.commonMA.meta.MA_META.DLV_CHNNL2);
	public static final MCMeta dlv_chnnl3_META = createCommonMeta($dlv_chnnl3, mcframe.commonMA.meta.MA_META.DLV_CHNNL3);
	public static final MCMeta dlv_prnt_typ_META = createCommonMeta($dlv_prnt_typ, mcframe.commonMA.meta.MA_META.PRNT_TYP);
	public static final MCMeta dlv_prnt_typ_nm_META = createCommonMeta($dlv_prnt_typ_nm, mcframe.commonMA.meta.MA_META.PRNT_TYP_NM);
	public static final MCMeta asppl_cd_META = createCommonMeta($asppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta asppl_nm_META = createCommonMeta($asppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta sppl_cntct_dpt_META = createCommonMeta($sppl_cntct_dpt, mcframe.commonMA.meta.MA_META.CNTCT_DPT);
	public static final MCMeta sppl_cntct_psn_META = createCommonMeta($sppl_cntct_psn, mcframe.commonMA.meta.MA_META.CNTCT_PSN);
	public static final MCMeta sppl_cntct_psn_title_META = createCommonMeta($sppl_cntct_psn_title, mcframe.commonMA.meta.MA_META.BP_PSN_TITLE);
	public static final MCMeta subcon_flg_META = createCommonMeta($subcon_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta onr_prsppl_flg_META = createCommonMeta($onr_prsppl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta org_onr_prsppl_flg_META = createCommonMeta($org_onr_prsppl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta repurc_obli_flg_META = createCommonMeta($repurc_obli_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta vmi_purc_dpt_cd_META = createCommonMeta($vmi_purc_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta vmi_purc_dpt_nm_META = createCommonMeta($vmi_purc_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta check_vmi_purc_dpt_cd_META = createCommonMeta($check_vmi_purc_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta purc_upri_req_typ_META = createCommonMeta($purc_upri_req_typ, mcframe.commonMA.meta.MA_META.PURC_UPRI_REQ_TYP);
	public static final MCMeta purc_upri_req_typ_nm_META = createCommonMeta($purc_upri_req_typ_nm, mcframe.commonMA.meta.MA_META.PURC_UPRI_REQ_TYP_NM);
	public static final MCMeta purc_upri_cng_flg_META = createCommonMeta($purc_upri_cng_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prms_recv_flg_META = createCommonMeta($prms_recv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_amt_rnd_typ_META = createCommonMeta($purc_amt_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta purc_amt_rnd_typ_nm_META = createCommonMeta($purc_amt_rnd_typ_nm, mcframe.commonMA.meta.MA_META.RND_TYP_NM);
	public static final MCMeta purc_tax_calc_typ_META = createCommonMeta($purc_tax_calc_typ, mcframe.commonMA.meta.MA_META.TAX_CALC_TYP);
	public static final MCMeta purc_tax_calc_typ_nm_META = createCommonMeta($purc_tax_calc_typ_nm, mcframe.commonMA.meta.MA_META.TAX_CALC_TYP_NM);
	public static final MCMeta purc_tax_rnd_typ_META = createCommonMeta($purc_tax_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta purc_tax_rnd_typ_nm_META = createCommonMeta($purc_tax_rnd_typ_nm, mcframe.commonMA.meta.MA_META.RND_TYP_NM);
	public static final MCMeta purc_tax_cd_META = createCommonMeta($purc_tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta purc_tax_nm_META = createCommonMeta($purc_tax_nm, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta purc_tax_cd_prio_flg_META = createCommonMeta($purc_tax_cd_prio_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_cal_cd_META = createCommonMeta($sppl_cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta sppl_cal_nm_META = createCommonMeta($sppl_cal_nm, mcframe.commonMA.meta.MA_META.CAL_NM);
	public static final MCMeta po_print_cd_META = createCommonMeta($po_print_cd, mcframe.commonMA.meta.MA_META.PO_PRINT_CD);
	public static final MCMeta po_print_nm_META = createCommonMeta($po_print_nm, mcframe.commonMA.meta.MA_META.PO_PRINT_NM);
	public static final MCMeta sppl_ship_form_cd_META = createCommonMeta($sppl_ship_form_cd, mcframe.commonMA.meta.MA_META.SLIP_FORM_CD);
	public static final MCMeta sppl_ship_form_nm_META = createCommonMeta($sppl_ship_form_nm, mcframe.commonMA.meta.MA_META.SLIP_FORM_NM);
	public static final MCMeta po_dlv_slip_flg_META = createCommonMeta($po_dlv_slip_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_inst_dlv_slip_flg_META = createCommonMeta($dlv_inst_dlv_slip_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prms_rcpt_dlv_slip_flg_META = createCommonMeta($prms_rcpt_dlv_slip_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prov_rcv_typ_META = createCommonMeta($prov_rcv_typ, mcframe.commonMA.meta.MA_META.PROV_RCV_TYP);
	public static final MCMeta prov_rcv_typ_nm_META = createCommonMeta($prov_rcv_typ_nm, mcframe.commonMA.meta.MA_META.PROV_RCV_TYP_NM);
	public static final MCMeta purc_slip_each_lot_typ_META = createCommonMeta($purc_slip_each_lot_typ, mcframe.commonMA.meta.MA_META.SLIP_EACH_LOT_TYP);
	public static final MCMeta purc_slip_each_lot_typ_nm_META = createCommonMeta($purc_slip_each_lot_typ_nm, mcframe.commonMA.meta.MA_META.SLIP_EACH_LOT_TYP_NM);
	public static final MCMeta sppl_tterm_cd1_META = createCommonMeta($sppl_tterm_cd1, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta sppl_tterm_nm1_META = createCommonMeta($sppl_tterm_nm1, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta sppl_tterm_cd2_META = createCommonMeta($sppl_tterm_cd2, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta sppl_tterm_nm2_META = createCommonMeta($sppl_tterm_nm2, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta sppl_tterm_cd3_META = createCommonMeta($sppl_tterm_cd3, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta sppl_tterm_nm3_META = createCommonMeta($sppl_tterm_nm3, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta pay_crryovr_times_META = createCommonMeta($pay_crryovr_times, mcframe.commonMA.meta.MA_META.CRRYOVR_TIMES);
	public static final MCMeta wrk_po_flg_META = createCommonMeta($wrk_po_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wrk_ap_flg_META = createCommonMeta($wrk_ap_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_iv_flg_META = createCommonMeta($sppl_iv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcpt_iv_dup_flg_META = createCommonMeta($rcpt_iv_dup_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_basis_typ_META = createCommonMeta($purc_basis_typ, mcframe.commonMA.meta.MA_META.PURC_BASIS_TYP);
	public static final MCMeta purc_basis_typ_nm_META = createCommonMeta($purc_basis_typ_nm, mcframe.commonMA.meta.MA_META.PURC_BASIS_TYP_NM);
	public static final MCMeta outsrc_upri_typ_META = createCommonMeta($outsrc_upri_typ, mcframe.commonMA.meta.MA_META.OUTSRC_UPRI_TYP);
	public static final MCMeta outsrc_upri_typ_nm_META = createCommonMeta($outsrc_upri_typ_nm, mcframe.commonMA.meta.MA_META.OUTSRC_UPRI_TYP_NM);
	public static final MCMeta prov_basis_typ_META = createCommonMeta($prov_basis_typ, mcframe.commonMA.meta.MA_META.PROV_BASIS_TYP);
	public static final MCMeta prov_basis_typ_nm_META = createCommonMeta($prov_basis_typ_nm, mcframe.commonMA.meta.MA_META.PROV_BASIS_TYP_NM);
	public static final MCMeta prov_upri_cng_flg_META = createCommonMeta($prov_upri_cng_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prov_tax_cd_META = createCommonMeta($prov_tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta prov_tax_nm_META = createCommonMeta($prov_tax_nm, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta prov_tax_cd_prio_flg_META = createCommonMeta($prov_tax_cd_prio_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prov_amt_rnd_typ_META = createCommonMeta($prov_amt_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta prov_amt_rnd_typ_nm_META = createCommonMeta($prov_amt_rnd_typ_nm, mcframe.commonMA.meta.MA_META.RND_TYP_NM);
	public static final MCMeta prov_tax_calc_typ_META = createCommonMeta($prov_tax_calc_typ, mcframe.commonMA.meta.MA_META.TAX_CALC_TYP);
	public static final MCMeta prov_tax_calc_typ_nm_META = createCommonMeta($prov_tax_calc_typ_nm, mcframe.commonMA.meta.MA_META.TAX_CALC_TYP_NM);
	public static final MCMeta prov_tax_rnd_typ_META = createCommonMeta($prov_tax_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta prov_tax_rnd_typ_nm_META = createCommonMeta($prov_tax_rnd_typ_nm, mcframe.commonMA.meta.MA_META.RND_TYP_NM);
	public static final MCMeta sppl_prnt_typ_META = createCommonMeta($sppl_prnt_typ, mcframe.commonMA.meta.MA_META.PRNT_TYP);
	public static final MCMeta sppl_prnt_typ_nm_META = createCommonMeta($sppl_prnt_typ_nm, mcframe.commonMA.meta.MA_META.PRNT_TYP_NM);
	public static final MCMeta bsppl_cd_META = createCommonMeta($bsppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bsppl_nm_META = createCommonMeta($bsppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta ap_dpt_cd_META = createCommonMeta($ap_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ap_dpt_nm_META = createCommonMeta($ap_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta check_ap_dpt_cd_META = createCommonMeta($check_ap_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta asppl_prnt_typ_META = createCommonMeta($asppl_prnt_typ, mcframe.commonMA.meta.MA_META.PRNT_TYP);
	public static final MCMeta asppl_prnt_typ_nm_META = createCommonMeta($asppl_prnt_typ_nm, mcframe.commonMA.meta.MA_META.PRNT_TYP_NM);
	public static final MCMeta psppl_cd_META = createCommonMeta($psppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta psppl_nm_META = createCommonMeta($psppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bsppl_dpt_cd_META = createCommonMeta($bsppl_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bsppl_dpt_nm_META = createCommonMeta($bsppl_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta check_bsppl_dpt_cd_META = createCommonMeta($check_bsppl_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ap_cred_cd_META = createCommonMeta($ap_cred_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta ap_cred_nm_META = createCommonMeta($ap_cred_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta purc_interim_cl_flg_META = createCommonMeta($purc_interim_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_bank_ac_cd_META = createCommonMeta($pay_bank_ac_cd, mcframe.commonMA.meta.MA_META.BANK_AC_CD);
	public static final MCMeta pay_bank_ac_nm_META = createCommonMeta($pay_bank_ac_nm, mcframe.commonMA.meta.MA_META.BANK_AC_NM);
	public static final MCMeta pay_spot_flg_META = createCommonMeta($pay_spot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta psppl_cl_day1_META = createCommonMeta($psppl_cl_day1, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta psppl_cl_day2_META = createCommonMeta($psppl_cl_day2, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta psppl_cl_day3_META = createCommonMeta($psppl_cl_day3, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta psppl_cl_day4_META = createCommonMeta($psppl_cl_day4, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta psppl_cl_day5_META = createCommonMeta($psppl_cl_day5, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta ap_setoff_grp_cd_META = createCommonMeta($ap_setoff_grp_cd, mcframe.commonMA.meta.MA_META.SETOFF_GRP_CD);
	public static final MCMeta ap_setoff_grp_nm_META = createCommonMeta($ap_setoff_grp_nm, mcframe.commonMA.meta.MA_META.SETOFF_GRP_NM);
	public static final MCMeta tax_on_pay_flg_META = createCommonMeta($tax_on_pay_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_tax_rnd_typ_META = createCommonMeta($pay_tax_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta pay_tax_rnd_typ_nm_META = createCommonMeta($pay_tax_rnd_typ_nm, mcframe.commonMA.meta.MA_META.RND_TYP_NM);
	public static final MCMeta pay_schd_ba_typ_META = createCommonMeta($pay_schd_ba_typ, mcframe.commonMA.meta.MA_META.BA_TYP);
	public static final MCMeta pay_schd_ba_typ_nm_META = createCommonMeta($pay_schd_ba_typ_nm, mcframe.commonMA.meta.MA_META.BA_TYP_NM);
	public static final MCMeta batch_pay_schd_cl_flg_META = createCommonMeta($batch_pay_schd_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_schd_cl_delay_days_META = createCommonMeta($pay_schd_cl_delay_days, mcframe.commonMA.meta.MA_META.DELAY_DAYS);
	public static final MCMeta pay_schd_cl_ba_typ_META = createCommonMeta($pay_schd_cl_ba_typ, mcframe.commonMA.meta.MA_META.BA_TYP);
	public static final MCMeta pay_schd_cl_ba_typ_nm_META = createCommonMeta($pay_schd_cl_ba_typ_nm, mcframe.commonMA.meta.MA_META.BA_TYP_NM);
	public static final MCMeta bsppl_prnt_typ_META = createCommonMeta($bsppl_prnt_typ, mcframe.commonMA.meta.MA_META.PRNT_TYP);
	public static final MCMeta bsppl_prnt_typ_nm_META = createCommonMeta($bsppl_prnt_typ_nm, mcframe.commonMA.meta.MA_META.PRNT_TYP_NM);
	public static final MCMeta pay_ntc_prnt_flg_META = createCommonMeta($pay_ntc_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_ntc_zip_cd_META = createCommonMeta($pay_ntc_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta pay_ntc_addr1_META = createCommonMeta($pay_ntc_addr1, mcframe.commonMA.meta.MA_META.ADDR1);
	public static final MCMeta pay_ntc_addr2_META = createCommonMeta($pay_ntc_addr2, mcframe.commonMA.meta.MA_META.ADDR2);
	public static final MCMeta pay_ntc_addr3_META = createCommonMeta($pay_ntc_addr3, mcframe.commonMA.meta.MA_META.ADDR3);
	public static final MCMeta pay_ntc_addr4_META = createCommonMeta($pay_ntc_addr4, mcframe.commonMA.meta.MA_META.ADDR4);
	public static final MCMeta pay_ntc_tel_META = createCommonMeta($pay_ntc_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta pay_ntc_bsppl_nm_META = createCommonMeta($pay_ntc_bsppl_nm, mcframe.commonMA.meta.MA_META.PAY_NTC_BSPPL_NM);
	public static final MCMeta pay_ntc_bsppl_dpt_META = createCommonMeta($pay_ntc_bsppl_dpt, mcframe.commonMA.meta.MA_META.PAY_NTC_BSPPL_DPT);
	public static final MCMeta pay_ntc_bsppl_psn_META = createCommonMeta($pay_ntc_bsppl_psn, mcframe.commonMA.meta.MA_META.PAY_NTC_BSPPL_PSN);
	public static final MCMeta pay_ntc_bsppl_psn_title_META = createCommonMeta($pay_ntc_bsppl_psn_title, mcframe.commonMA.meta.MA_META.BP_PSN_TITLE);
	public static final MCMeta pay_ntc_dtl_outp_flg_META = createCommonMeta($pay_ntc_dtl_outp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_ntc_bfw_bal_disp_flg_META = createCommonMeta($pay_ntc_bfw_bal_disp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_ntc_adv_pay_flg_META = createCommonMeta($pay_ntc_adv_pay_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_ntc_dtl_pay_flg_META = createCommonMeta($pay_ntc_dtl_pay_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_ntc_dtl_subttl_typ_META = createCommonMeta($pay_ntc_dtl_subttl_typ, mcframe.commonMA.meta.MA_META.PAY_NTC_DTL_SUBTTL_TYP);
	public static final MCMeta pay_ntc_dtl_subttl_typ_nm_META = createCommonMeta($pay_ntc_dtl_subttl_typ_nm, mcframe.commonMA.meta.MA_META.PAY_NTC_DTL_SUBTTL_TYP_NM);
	public static final MCMeta pay_ntc_dtl_brk_typ_META = createCommonMeta($pay_ntc_dtl_brk_typ, mcframe.commonMA.meta.MA_META.PAY_NTC_DTL_BRK_TYP);
	public static final MCMeta pay_ntc_dtl_brk_typ_nm_META = createCommonMeta($pay_ntc_dtl_brk_typ_nm, mcframe.commonMA.meta.MA_META.PAY_NTC_DTL_BRK_TYP_NM);
	public static final MCMeta pay_ntc_dtl_sort_typ_META = createCommonMeta($pay_ntc_dtl_sort_typ, mcframe.commonMA.meta.MA_META.PAY_NTC_DTL_SORT_TYP);
	public static final MCMeta pay_ntc_dtl_sort_typ_nm_META = createCommonMeta($pay_ntc_dtl_sort_typ_nm, mcframe.commonMA.meta.MA_META.PAY_NTC_DTL_SORT_TYP_NM);
	public static final MCMeta pay_ntc_can_slip_typ_META = createCommonMeta($pay_ntc_can_slip_typ, mcframe.commonMA.meta.MA_META.PAY_NTC_CAN_SLIP_TYP);
	public static final MCMeta pay_ntc_can_slip_typ_nm_META = createCommonMeta($pay_ntc_can_slip_typ_nm, mcframe.commonMA.meta.MA_META.PAY_NTC_CAN_SLIP_TYP_NM);
	public static final MCMeta psppl_rmrks_META = createCommonMeta($psppl_rmrks, mcframe.commonMA.meta.MA_META.PSPPL_RMRKS);
	public static final MCMeta note_days_META = createCommonMeta($note_days, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta pay_dpt_cd_META = createCommonMeta($pay_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta pay_dpt_nm_META = createCommonMeta($pay_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta check_pay_dpt_cd_META = createCommonMeta($check_pay_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta psppl_prnt_typ_META = createCommonMeta($psppl_prnt_typ, mcframe.commonMA.meta.MA_META.PRNT_TYP);
	public static final MCMeta psppl_prnt_typ_nm_META = createCommonMeta($psppl_prnt_typ_nm, mcframe.commonMA.meta.MA_META.PRNT_TYP_NM);
	public static final MCMeta bp_com_upd_cntr_META = createCommonMeta($bp_com_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<CmnR> constMetas = new ConstMetaList<CmnR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			bp_cd_META,
			bp_nm_lcl_META,
			bp_nm_META,
			del_flg_META,
			all_com_flg_META,
			org_all_com_flg_META,
			com_use_flg_META,
			com_ex_flg_META,
			bp_alt_nm1_META,
			bp_alt_nm2_META,
			bp_alt_nm3_META,
			bp_alt_nm4_META,
			cur_cd_META,
			cur_nm_META,
			cntry_cd_META,
			cntry_nm_META,
			area_cd_META,
			area_nm_META,
			cst_flg_META,
			org_cst_flg_META,
			acst_flg_META,
			bcst_flg_META,
			rcst_flg_META,
			dlv_flg_META,
			dest_flg_META,
			cred_flg_META,
			sppl_flg_META,
			org_sppl_flg_META,
			asppl_flg_META,
			bsppl_flg_META,
			psppl_flg_META,
			maker_flg_META,
			biz_co_no_META,
			ein_META,
			std_co_cd_META,
			tel_META,
			fax_META,
			zip_cd_META,
			addr1_META,
			addr2_META,
			addr3_META,
			addr4_META,
			prnt_lcl_cd_META,
			prnt_lcl_nm_META,
			bp_alc_grp_META,
			memo1_META,
			memo2_META,
			memo3_META,
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
			bp_grp_cd1_META,
			bp_grp_nm1_META,
			bp_grp_cd2_META,
			bp_grp_nm2_META,
			bp_grp_cd3_META,
			bp_grp_nm3_META,
			bp_grp_cd4_META,
			bp_grp_nm4_META,
			bp_grp_cd5_META,
			bp_grp_nm5_META,
			bp_grp_cd6_META,
			bp_grp_nm6_META,
			bp_grp_cd7_META,
			bp_grp_nm7_META,
			bp_grp_cd8_META,
			bp_grp_nm8_META,
			bp_grp_cd9_META,
			bp_grp_nm9_META,
			bp_grp_cd10_META,
			bp_grp_nm10_META,
			ins_usr_id_c_META,
			ins_usr_nm_c_META,
			ins_func_id_c_META,
			ins_func_nm_c_META,
			upd_usr_id_c_META,
			upd_usr_nm_c_META,
			upd_func_id_c_META,
			upd_func_nm_c_META,
			ins_ts_c_META,
			upd_ts_c_META,
			upd_srv_req_no_c_META,
			upd_cntr_c_META,
			del_usr_id_c_META,
			del_usr_nm_c_META,
			del_ts_c_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_func_id_META,
			ins_func_nm_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_func_id_META,
			upd_func_nm_META,
			ins_ts_META,
			upd_ts_META,
			upd_srv_req_no_META,
			upd_cntr_META,
			del_usr_id_META,
			del_usr_nm_META,
			del_ts_META,
			acst_cd_META,
			acst_nm_META,
			cst_cntct_dpt_META,
			cst_cntct_psn_META,
			cst_cntct_psn_title_META,
			cst_sundry_flg_META,
			ar_dpt_typ_META,
			ar_dpt_typ_nm_META,
			ar_dpt_cd_META,
			ar_dpt_nm_META,
			check_ar_dpt_cd_META,
			sls_upri_rnd_typ_META,
			sls_upri_rnd_typ_nm_META,
			sls_upri_req_typ_META,
			sls_upri_req_typ_nm_META,
			sls_upri_cng_flg_META,
			sls_amt_rnd_typ_META,
			sls_amt_rnd_typ_nm_META,
			sls_tax_calc_typ_META,
			sls_tax_calc_typ_nm_META,
			sls_tax_rnd_typ_META,
			sls_tax_rnd_typ_nm_META,
			sls_tax_cd_META,
			sls_tax_nm_META,
			sls_tax_cd_prio_flg_META,
			lot_back_stop_typ_META,
			lot_back_stop_typ_nm_META,
			sls_basis_typ_META,
			sls_basis_typ_nm_META,
			bill_basis_typ_META,
			bill_basis_typ_nm_META,
			bill_crryovr_times_META,
			slip_each_lot_typ_META,
			slip_each_lot_typ_nm_META,
			ship_schd_split_typ_META,
			ship_schd_split_typ_nm_META,
			stk_lst_issue_flg_META,
			stk_lst_form_cd_META,
			stk_lst_form_nm_META,
			cst_ship_form_cd_META,
			cst_ship_form_nm_META,
			wrk_ar_flg_META,
			cst_iv_flg_META,
			ship_lt_META,
			cst_tterm_cd1_META,
			cst_tterm_nm1_META,
			cst_tterm_cd2_META,
			cst_tterm_nm2_META,
			cst_tterm_cd3_META,
			cst_tterm_nm3_META,
			sls_anly_cd1_META,
			sls_anly_nm1_META,
			sls_anly_cd2_META,
			sls_anly_nm2_META,
			sls_anly_cd3_META,
			sls_anly_nm3_META,
			cst_prnt_typ_META,
			cst_prnt_typ_nm_META,
			not_lg_mix_flg_META,
			not_lot_mix_flg_META,
			not_sublot_mix_flg_META,
			bcst_cd_META,
			bcst_nm_META,
			acst_prnt_typ_META,
			acst_prnt_typ_nm_META,
			rcst_cd_META,
			rcst_nm_META,
			ar_cred_cd_META,
			ar_cred_nm_META,
			bill_dpt_typ_META,
			bill_dpt_typ_nm_META,
			bcst_dpt_cd_META,
			bcst_dpt_nm_META,
			check_bcst_dpt_cd_META,
			bill_cl_typ_META,
			bill_cl_typ_nm_META,
			bill_cl_day1_META,
			bill_cl_day2_META,
			bill_cl_day3_META,
			bill_cl_day4_META,
			bill_cl_day5_META,
			tax_on_bill_flg_META,
			bill_tax_rnd_typ_META,
			bill_tax_rnd_typ_nm_META,
			bill_cl_delay_days_META,
			bill_cl_ba_typ_META,
			bill_cl_ba_typ_nm_META,
			bill_cal_cd_META,
			bill_cal_nm_META,
			rcv_ba_typ_META,
			rcv_ba_typ_nm_META,
			auto_line_appl_flg_META,
			sls_interim_cl_flg_META,
			ar_setoff_grp_cd_META,
			ar_setoff_grp_nm_META,
			bcst_prnt_typ_META,
			bcst_prnt_typ_nm_META,
			bill_zip_cd_META,
			bill_addr1_META,
			bill_addr2_META,
			bill_addr3_META,
			bill_addr4_META,
			bill_tel_META,
			bill_bcst_nm_META,
			bill_bcst_dpt_META,
			bill_bcst_psn_META,
			bill_bcst_psn_title_META,
			bill_prnt_typ_META,
			bill_prnt_typ_nm_META,
			sls_dtl_outp_typ_META,
			sls_dtl_outp_typ_nm_META,
			bill_dtl_outp_flg_META,
			bfw_bal_disp_flg_META,
			bill_dtl_adv_flg_META,
			bill_dtl_rcv_flg_META,
			bill_dtl_subttl_typ_META,
			bill_dtl_subttl_typ_nm_META,
			bill_dtl_brk_typ_META,
			bill_dtl_brk_typ_nm_META,
			bill_dtl_sort_typ_META,
			bill_dtl_sort_typ_nm_META,
			bill_can_slip_typ_META,
			bill_can_slip_typ_nm_META,
			xfr_psn_META,
			rcv_auto_appl_tgt_flg_META,
			rcv_amt_match_flg_META,
			ar_sttl_typ_match_flg_META,
			calc_com_paid_flg_META,
			auto_appl_delay_days_META,
			rcst_prnt_typ_META,
			rcst_prnt_typ_nm_META,
			lg_grp_cd_META,
			lg_grp_nm_META,
			dlv_sundry_flg_META,
			tdlv_flg_META,
			org_tdlv_flg_META,
			via_dlv_typ_META,
			via_dlv_typ_nm_META,
			tdlv_req_flg_META,
			dlv_cal_cd_META,
			dlv_cal_nm_META,
			dlv_cntct_dpt_META,
			dlv_cntct_psn_META,
			dlv_cntct_psn_title_META,
			pri_prnt_flg_META,
			cnsgn_stktk_flg_META,
			dlv_chnnl1_META,
			dlv_chnnl2_META,
			dlv_chnnl3_META,
			dlv_prnt_typ_META,
			dlv_prnt_typ_nm_META,
			asppl_cd_META,
			asppl_nm_META,
			sppl_cntct_dpt_META,
			sppl_cntct_psn_META,
			sppl_cntct_psn_title_META,
			subcon_flg_META,
			onr_prsppl_flg_META,
			org_onr_prsppl_flg_META,
			repurc_obli_flg_META,
			vmi_purc_dpt_cd_META,
			vmi_purc_dpt_nm_META,
			check_vmi_purc_dpt_cd_META,
			purc_upri_req_typ_META,
			purc_upri_req_typ_nm_META,
			purc_upri_cng_flg_META,
			prms_recv_flg_META,
			purc_amt_rnd_typ_META,
			purc_amt_rnd_typ_nm_META,
			purc_tax_calc_typ_META,
			purc_tax_calc_typ_nm_META,
			purc_tax_rnd_typ_META,
			purc_tax_rnd_typ_nm_META,
			purc_tax_cd_META,
			purc_tax_nm_META,
			purc_tax_cd_prio_flg_META,
			sppl_cal_cd_META,
			sppl_cal_nm_META,
			po_print_cd_META,
			po_print_nm_META,
			sppl_ship_form_cd_META,
			sppl_ship_form_nm_META,
			po_dlv_slip_flg_META,
			dlv_inst_dlv_slip_flg_META,
			prms_rcpt_dlv_slip_flg_META,
			prov_rcv_typ_META,
			prov_rcv_typ_nm_META,
			purc_slip_each_lot_typ_META,
			purc_slip_each_lot_typ_nm_META,
			sppl_tterm_cd1_META,
			sppl_tterm_nm1_META,
			sppl_tterm_cd2_META,
			sppl_tterm_nm2_META,
			sppl_tterm_cd3_META,
			sppl_tterm_nm3_META,
			pay_crryovr_times_META,
			wrk_po_flg_META,
			wrk_ap_flg_META,
			sppl_iv_flg_META,
			rcpt_iv_dup_flg_META,
			purc_basis_typ_META,
			purc_basis_typ_nm_META,
			outsrc_upri_typ_META,
			outsrc_upri_typ_nm_META,
			prov_basis_typ_META,
			prov_basis_typ_nm_META,
			prov_upri_cng_flg_META,
			prov_tax_cd_META,
			prov_tax_nm_META,
			prov_tax_cd_prio_flg_META,
			prov_amt_rnd_typ_META,
			prov_amt_rnd_typ_nm_META,
			prov_tax_calc_typ_META,
			prov_tax_calc_typ_nm_META,
			prov_tax_rnd_typ_META,
			prov_tax_rnd_typ_nm_META,
			sppl_prnt_typ_META,
			sppl_prnt_typ_nm_META,
			bsppl_cd_META,
			bsppl_nm_META,
			ap_dpt_cd_META,
			ap_dpt_nm_META,
			check_ap_dpt_cd_META,
			asppl_prnt_typ_META,
			asppl_prnt_typ_nm_META,
			psppl_cd_META,
			psppl_nm_META,
			bsppl_dpt_cd_META,
			bsppl_dpt_nm_META,
			check_bsppl_dpt_cd_META,
			ap_cred_cd_META,
			ap_cred_nm_META,
			purc_interim_cl_flg_META,
			pay_bank_ac_cd_META,
			pay_bank_ac_nm_META,
			pay_spot_flg_META,
			psppl_cl_day1_META,
			psppl_cl_day2_META,
			psppl_cl_day3_META,
			psppl_cl_day4_META,
			psppl_cl_day5_META,
			ap_setoff_grp_cd_META,
			ap_setoff_grp_nm_META,
			tax_on_pay_flg_META,
			pay_tax_rnd_typ_META,
			pay_tax_rnd_typ_nm_META,
			pay_schd_ba_typ_META,
			pay_schd_ba_typ_nm_META,
			batch_pay_schd_cl_flg_META,
			pay_schd_cl_delay_days_META,
			pay_schd_cl_ba_typ_META,
			pay_schd_cl_ba_typ_nm_META,
			bsppl_prnt_typ_META,
			bsppl_prnt_typ_nm_META,
			pay_ntc_prnt_flg_META,
			pay_ntc_zip_cd_META,
			pay_ntc_addr1_META,
			pay_ntc_addr2_META,
			pay_ntc_addr3_META,
			pay_ntc_addr4_META,
			pay_ntc_tel_META,
			pay_ntc_bsppl_nm_META,
			pay_ntc_bsppl_dpt_META,
			pay_ntc_bsppl_psn_META,
			pay_ntc_bsppl_psn_title_META,
			pay_ntc_dtl_outp_flg_META,
			pay_ntc_bfw_bal_disp_flg_META,
			pay_ntc_adv_pay_flg_META,
			pay_ntc_dtl_pay_flg_META,
			pay_ntc_dtl_subttl_typ_META,
			pay_ntc_dtl_subttl_typ_nm_META,
			pay_ntc_dtl_brk_typ_META,
			pay_ntc_dtl_brk_typ_nm_META,
			pay_ntc_dtl_sort_typ_META,
			pay_ntc_dtl_sort_typ_nm_META,
			pay_ntc_can_slip_typ_META,
			pay_ntc_can_slip_typ_nm_META,
			psppl_rmrks_META,
			note_days_META,
			pay_dpt_cd_META,
			pay_dpt_nm_META,
			check_pay_dpt_cd_META,
			psppl_prnt_typ_META,
			psppl_prnt_typ_nm_META,
			bp_com_upd_cntr_META,
			check_META
		},
		new String[][]{
			{
			},
			{
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
	/** 項目属性情報のグループ[INPT_CTL]のキー定数 */
	public static final String $$INPT_CTL = "INPT_CTL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$prnt_lcl_cd, "lcl_nm"},	// prnt_lcl_cd
				{$bp_grp_cd1, "bp_grp_nm"},	// bp_grp_cd1
				{$bp_grp_cd2, "bp_grp_nm"},	// bp_grp_cd2
				{$bp_grp_cd3, "bp_grp_nm"},	// bp_grp_cd3
				{$bp_grp_cd4, "bp_grp_nm"},	// bp_grp_cd4
				{$bp_grp_cd5, "bp_grp_nm"},	// bp_grp_cd5
				{$bp_grp_cd6, "bp_grp_nm"},	// bp_grp_cd6
				{$bp_grp_cd7, "bp_grp_nm"},	// bp_grp_cd7
				{$bp_grp_cd8, "bp_grp_nm"},	// bp_grp_cd8
				{$bp_grp_cd9, "bp_grp_nm"},	// bp_grp_cd9
				{$bp_grp_cd10, "bp_grp_nm"},	// bp_grp_cd10
				{$acst_cd, "bp_nm"},	// acst_cd
				{$ar_dpt_cd, "dpt_nm"},	// ar_dpt_cd
				{$sls_upri_rnd_typ, "rnd_typ_nm"},	// sls_upri_rnd_typ
				{$sls_amt_rnd_typ, "rnd_typ_nm"},	// sls_amt_rnd_typ
				{$sls_tax_calc_typ, "tax_calc_typ_nm"},	// sls_tax_calc_typ
				{$sls_tax_rnd_typ, "rnd_typ_nm"},	// sls_tax_rnd_typ
				{$sls_tax_cd, "tax_nm"},	// sls_tax_cd
				{$stk_lst_form_cd, "slip_form_nm"},	// stk_lst_form_cd
				{$cst_ship_form_cd, "slip_form_nm"},	// cst_ship_form_cd
				{$cst_tterm_cd1, "tterm_nm"},	// cst_tterm_cd1
				{$cst_tterm_cd2, "tterm_nm"},	// cst_tterm_cd2
				{$cst_tterm_cd3, "tterm_nm"},	// cst_tterm_cd3
				{$sls_anly_cd1, "sls_anly_nm"},	// sls_anly_cd1
				{$sls_anly_cd2, "sls_anly_nm"},	// sls_anly_cd2
				{$sls_anly_cd3, "sls_anly_nm"},	// sls_anly_cd3
				{$cst_prnt_typ, "prnt_typ_nm"},	// cst_prnt_typ
				{$bcst_cd, "bp_nm"},	// bcst_cd
				{$acst_prnt_typ, "prnt_typ_nm"},	// acst_prnt_typ
				{$rcst_cd, "bp_nm"},	// rcst_cd
				{$ar_cred_cd, "bp_nm"},	// ar_cred_cd
				{$bcst_dpt_cd, "dpt_nm"},	// bcst_dpt_cd
				{$bill_tax_rnd_typ, "rnd_typ_nm"},	// bill_tax_rnd_typ
				{$bill_cl_ba_typ, "ba_typ_nm"},	// bill_cl_ba_typ
				{$bill_cal_cd, "cal_nm"},	// bill_cal_cd
				{$rcv_ba_typ, "ba_typ_nm"},	// rcv_ba_typ
				{$ar_setoff_grp_cd, "setoff_grp_nm"},	// ar_setoff_grp_cd
				{$bcst_prnt_typ, "prnt_typ_nm"},	// bcst_prnt_typ
				{$rcst_prnt_typ, "prnt_typ_nm"},	// rcst_prnt_typ
				{$dlv_cal_cd, "cal_nm"},	// dlv_cal_cd
				{$dlv_prnt_typ, "prnt_typ_nm"},	// dlv_prnt_typ
				{$asppl_cd, "bp_nm"},	// asppl_cd
				{$vmi_purc_dpt_cd, "dpt_nm"},	// vmi_purc_dpt_cd
				{$purc_amt_rnd_typ, "rnd_typ_nm"},	// purc_amt_rnd_typ
				{$purc_tax_calc_typ, "tax_calc_typ_nm"},	// purc_tax_calc_typ
				{$purc_tax_rnd_typ, "rnd_typ_nm"},	// purc_tax_rnd_typ
				{$purc_tax_cd, "tax_nm"},	// purc_tax_cd
				{$sppl_cal_cd, "cal_nm"},	// sppl_cal_cd
				{$sppl_ship_form_cd, "slip_form_nm"},	// sppl_ship_form_cd
				{$purc_slip_each_lot_typ, "slip_each_lot_typ_nm"},	// purc_slip_each_lot_typ
				{$sppl_tterm_cd1, "tterm_nm"},	// sppl_tterm_cd1
				{$sppl_tterm_cd2, "tterm_nm"},	// sppl_tterm_cd2
				{$sppl_tterm_cd3, "tterm_nm"},	// sppl_tterm_cd3
				{$prov_tax_cd, "tax_nm"},	// prov_tax_cd
				{$prov_amt_rnd_typ, "rnd_typ_nm"},	// prov_amt_rnd_typ
				{$prov_tax_calc_typ, "tax_calc_typ_nm"},	// prov_tax_calc_typ
				{$prov_tax_rnd_typ, "rnd_typ_nm"},	// prov_tax_rnd_typ
				{$sppl_prnt_typ, "prnt_typ_nm"},	// sppl_prnt_typ
				{$bsppl_cd, "bp_nm"},	// bsppl_cd
				{$ap_dpt_cd, "dpt_nm"},	// ap_dpt_cd
				{$asppl_prnt_typ, "prnt_typ_nm"},	// asppl_prnt_typ
				{$psppl_cd, "bp_nm"},	// psppl_cd
				{$bsppl_dpt_cd, "dpt_nm"},	// bsppl_dpt_cd
				{$ap_cred_cd, "bp_nm"},	// ap_cred_cd
				{$pay_bank_ac_cd, "bank_ac_nm"},	// pay_bank_ac_cd
				{$ap_setoff_grp_cd, "setoff_grp_nm"},	// ap_setoff_grp_cd
				{$pay_tax_rnd_typ, "rnd_typ_nm"},	// pay_tax_rnd_typ
				{$pay_schd_ba_typ, "ba_typ_nm"},	// pay_schd_ba_typ
				{$pay_schd_cl_ba_typ, "ba_typ_nm"},	// pay_schd_cl_ba_typ
				{$bsppl_prnt_typ, "prnt_typ_nm"},	// bsppl_prnt_typ
				{$pay_dpt_cd, "dpt_nm"},	// pay_dpt_cd
				{$psppl_prnt_typ, "prnt_typ_nm"}	// psppl_prnt_typ
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$acst_cd, "MAC_BP_IS_SRCH_TYP.ACST;acst_flg;bp_cd"},	// acst_cd
				{$ar_dpt_cd, "MAC_DPT_IS_SRCH_TYP.AR;true"},	// ar_dpt_cd
				{$bcst_cd, "MAC_BP_IS_SRCH_TYP.BCST;bcst_flg;bp_cd"},	// bcst_cd
				{$rcst_cd, "MAC_BP_IS_SRCH_TYP.RCST;rcst_flg;bp_cd"},	// rcst_cd
				{$ar_cred_cd, "MAC_BP_IS_SRCH_TYP.CRED;cred_flg;bp_cd"},	// ar_cred_cd
				{$bcst_dpt_cd, "MAC_DPT_IS_SRCH_TYP.AR;true"},	// bcst_dpt_cd
				{$asppl_cd, "MAC_BP_IS_SRCH_TYP.ASPPL;asppl_flg;bp_cd"},	// asppl_cd
				{$vmi_purc_dpt_cd, "MAC_DPT_IS_SRCH_TYP.PURC;true"},	// vmi_purc_dpt_cd
				{$prov_tax_cd, "repurc_obli_flg"},	// prov_tax_cd
				{$bsppl_cd, "MAC_BP_IS_SRCH_TYP.BSPPL;bsppl_flg;bp_cd"},	// bsppl_cd
				{$ap_dpt_cd, "MAC_DPT_IS_SRCH_TYP.AP;true"},	// ap_dpt_cd
				{$psppl_cd, "MAC_BP_IS_SRCH_TYP.PSPPL;psppl_flg;bp_cd"},	// psppl_cd
				{$bsppl_dpt_cd, "MAC_DPT_IS_SRCH_TYP.AP;true"},	// bsppl_dpt_cd
				{$ap_cred_cd, "MAC_BP_IS_SRCH_TYP.CRED;cred_flg;bp_cd"},	// ap_cred_cd
				{$pay_dpt_cd, "MAC_DPT_IS_SRCH_TYP.AP;true"}	// pay_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$acst_cd, "bp_is_srch_typ;check_rem_flg;ref_bp_cd"},	// acst_cd
				{$ar_dpt_cd, "dpt_is_srch_typ;mode_today_flg"},	// ar_dpt_cd
				{$bcst_cd, "bp_is_srch_typ;check_rem_flg;ref_bp_cd"},	// bcst_cd
				{$rcst_cd, "bp_is_srch_typ;check_rem_flg;ref_bp_cd"},	// rcst_cd
				{$ar_cred_cd, "bp_is_srch_typ;check_rem_flg;ref_bp_cd"},	// ar_cred_cd
				{$bcst_dpt_cd, "dpt_is_srch_typ;mode_today_flg"},	// bcst_dpt_cd
				{$asppl_cd, "bp_is_srch_typ;check_rem_flg;ref_bp_cd"},	// asppl_cd
				{$vmi_purc_dpt_cd, "dpt_is_srch_typ;mode_today_flg"},	// vmi_purc_dpt_cd
				{$prov_tax_cd, "repurc_obli_flg"},	// prov_tax_cd
				{$bsppl_cd, "bp_is_srch_typ;check_rem_flg;ref_bp_cd"},	// bsppl_cd
				{$ap_dpt_cd, "dpt_is_srch_typ;mode_today_flg"},	// ap_dpt_cd
				{$psppl_cd, "bp_is_srch_typ;check_rem_flg;ref_bp_cd"},	// psppl_cd
				{$bsppl_dpt_cd, "dpt_is_srch_typ;mode_today_flg"},	// bsppl_dpt_cd
				{$ap_cred_cd, "bp_is_srch_typ;check_rem_flg;ref_bp_cd"},	// ap_cred_cd
				{$pay_dpt_cd, "dpt_is_srch_typ;mode_today_flg"}	// pay_dpt_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$cur_cd, "BASE_CUR"},	// cur_cd
				{$cur_nm, "BASE_CUR"},	// cur_nm
				{$cred_flg, "CRED"},	// cred_flg
				{$maker_flg, "MAKER"},	// maker_flg
				{$addr1, "ADDR1"},	// addr1
				{$addr2, "ADDR2"},	// addr2
				{$addr3, "ADDR3"},	// addr3
				{$addr4, "ADDR4"},	// addr4
				{$wrk_ar_flg, "WRK"},	// wrk_ar_flg
				{$not_lg_mix_flg, "LG_GRP"},	// not_lg_mix_flg
				{$ar_cred_cd, "CRED"},	// ar_cred_cd
				{$ar_cred_nm, "CRED"},	// ar_cred_nm
				{$bill_addr1, "ADDR1"},	// bill_addr1
				{$bill_addr2, "ADDR2"},	// bill_addr2
				{$bill_addr3, "ADDR3"},	// bill_addr3
				{$bill_addr4, "ADDR4"},	// bill_addr4
				{$wrk_po_flg, "WRK"},	// wrk_po_flg
				{$wrk_ap_flg, "WRK"},	// wrk_ap_flg
				{$ap_cred_cd, "CRED"},	// ap_cred_cd
				{$ap_cred_nm, "CRED"},	// ap_cred_nm
				{$pay_ntc_addr1, "ADDR1"},	// pay_ntc_addr1
				{$pay_ntc_addr2, "ADDR2"},	// pay_ntc_addr2
				{$pay_ntc_addr3, "ADDR3"},	// pay_ntc_addr3
				{$pay_ntc_addr4, "ADDR4"}	// pay_ntc_addr4
			}
		)),
		new MCExtMap.Entry($$INPT_CTL, new MCExtList(
			new String[][]{
				{$acst_cd, "cst_flg"},	// acst_cd
				{$cst_cntct_dpt, "cst_flg"},	// cst_cntct_dpt
				{$cst_cntct_psn, "cst_flg"},	// cst_cntct_psn
				{$cst_cntct_psn_title, "cst_flg"},	// cst_cntct_psn_title
				{$cst_sundry_flg, "cst_flg"},	// cst_sundry_flg
				{$ar_dpt_typ, "cst_flg"},	// ar_dpt_typ
				{$ar_dpt_cd, "cst_flg"},	// ar_dpt_cd
				{$sls_upri_rnd_typ, "cst_flg"},	// sls_upri_rnd_typ
				{$sls_upri_req_typ, "cst_flg"},	// sls_upri_req_typ
				{$sls_upri_cng_flg, "cst_flg"},	// sls_upri_cng_flg
				{$sls_amt_rnd_typ, "cst_flg"},	// sls_amt_rnd_typ
				{$sls_tax_calc_typ, "cst_flg"},	// sls_tax_calc_typ
				{$sls_tax_rnd_typ, "cst_flg"},	// sls_tax_rnd_typ
				{$sls_tax_cd, "cst_flg"},	// sls_tax_cd
				{$sls_tax_cd_prio_flg, "cst_flg"},	// sls_tax_cd_prio_flg
				{$lot_back_stop_typ, "cst_flg"},	// lot_back_stop_typ
				{$sls_basis_typ, "cst_flg"},	// sls_basis_typ
				{$bill_basis_typ, "cst_flg"},	// bill_basis_typ
				{$bill_crryovr_times, "cst_flg"},	// bill_crryovr_times
				{$slip_each_lot_typ, "cst_flg"},	// slip_each_lot_typ
				{$ship_schd_split_typ, "cst_flg"},	// ship_schd_split_typ
				{$stk_lst_issue_flg, "cst_flg"},	// stk_lst_issue_flg
				{$stk_lst_form_cd, "cst_flg"},	// stk_lst_form_cd
				{$cst_ship_form_cd, "cst_flg"},	// cst_ship_form_cd
				{$wrk_ar_flg, "cst_flg"},	// wrk_ar_flg
				{$cst_iv_flg, "cst_flg"},	// cst_iv_flg
				{$ship_lt, "cst_flg"},	// ship_lt
				{$cst_tterm_cd1, "cst_flg"},	// cst_tterm_cd1
				{$cst_tterm_cd2, "cst_flg"},	// cst_tterm_cd2
				{$cst_tterm_cd3, "cst_flg"},	// cst_tterm_cd3
				{$sls_anly_cd1, "cst_flg"},	// sls_anly_cd1
				{$sls_anly_cd2, "cst_flg"},	// sls_anly_cd2
				{$sls_anly_cd3, "cst_flg"},	// sls_anly_cd3
				{$cst_prnt_typ, "cst_flg"},	// cst_prnt_typ
				{$not_lg_mix_flg, "cst_flg"},	// not_lg_mix_flg
				{$not_lot_mix_flg, "cst_flg"},	// not_lot_mix_flg
				{$not_sublot_mix_flg, "cst_flg"},	// not_sublot_mix_flg
				{$bcst_cd, "acst_flg"},	// bcst_cd
				{$acst_prnt_typ, "acst_flg"},	// acst_prnt_typ
				{$rcst_cd, "bcst_flg"},	// rcst_cd
				{$ar_cred_cd, "bcst_flg"},	// ar_cred_cd
				{$bill_dpt_typ, "bcst_flg"},	// bill_dpt_typ
				{$bcst_dpt_cd, "bcst_flg"},	// bcst_dpt_cd
				{$bill_cl_typ, "bcst_flg"},	// bill_cl_typ
				{$bill_cl_day1, "bcst_flg"},	// bill_cl_day1
				{$bill_cl_day2, "bcst_flg"},	// bill_cl_day2
				{$bill_cl_day3, "bcst_flg"},	// bill_cl_day3
				{$bill_cl_day4, "bcst_flg"},	// bill_cl_day4
				{$bill_cl_day5, "bcst_flg"},	// bill_cl_day5
				{$tax_on_bill_flg, "bcst_flg"},	// tax_on_bill_flg
				{$bill_tax_rnd_typ, "bcst_flg"},	// bill_tax_rnd_typ
				{$bill_cl_delay_days, "bcst_flg"},	// bill_cl_delay_days
				{$bill_cl_ba_typ, "bcst_flg"},	// bill_cl_ba_typ
				{$bill_cal_cd, "bcst_flg"},	// bill_cal_cd
				{$rcv_ba_typ, "bcst_flg"},	// rcv_ba_typ
				{$auto_line_appl_flg, "bcst_flg"},	// auto_line_appl_flg
				{$sls_interim_cl_flg, "bcst_flg"},	// sls_interim_cl_flg
				{$ar_setoff_grp_cd, "bcst_flg"},	// ar_setoff_grp_cd
				{$bcst_prnt_typ, "bcst_flg"},	// bcst_prnt_typ
				{$bill_zip_cd, "bcst_flg"},	// bill_zip_cd
				{$bill_addr1, "bcst_flg"},	// bill_addr1
				{$bill_addr2, "bcst_flg"},	// bill_addr2
				{$bill_addr3, "bcst_flg"},	// bill_addr3
				{$bill_addr4, "bcst_flg"},	// bill_addr4
				{$bill_tel, "bcst_flg"},	// bill_tel
				{$bill_bcst_nm, "bcst_flg"},	// bill_bcst_nm
				{$bill_bcst_dpt, "bcst_flg"},	// bill_bcst_dpt
				{$bill_bcst_psn, "bcst_flg"},	// bill_bcst_psn
				{$bill_bcst_psn_title, "bcst_flg"},	// bill_bcst_psn_title
				{$bill_prnt_typ, "bcst_flg"},	// bill_prnt_typ
				{$sls_dtl_outp_typ, "bcst_flg"},	// sls_dtl_outp_typ
				{$bill_dtl_outp_flg, "bcst_flg"},	// bill_dtl_outp_flg
				{$bfw_bal_disp_flg, "bcst_flg"},	// bfw_bal_disp_flg
				{$bill_dtl_adv_flg, "bcst_flg"},	// bill_dtl_adv_flg
				{$bill_dtl_rcv_flg, "bcst_flg"},	// bill_dtl_rcv_flg
				{$bill_dtl_subttl_typ, "bcst_flg"},	// bill_dtl_subttl_typ
				{$bill_dtl_brk_typ, "bcst_flg"},	// bill_dtl_brk_typ
				{$bill_dtl_sort_typ, "bcst_flg"},	// bill_dtl_sort_typ
				{$bill_can_slip_typ, "bcst_flg"},	// bill_can_slip_typ
				{$xfr_psn, "rcst_flg"},	// xfr_psn
				{$rcv_auto_appl_tgt_flg, "rcst_flg"},	// rcv_auto_appl_tgt_flg
				{$rcv_amt_match_flg, "rcst_flg"},	// rcv_amt_match_flg
				{$ar_sttl_typ_match_flg, "rcst_flg"},	// ar_sttl_typ_match_flg
				{$calc_com_paid_flg, "rcst_flg"},	// calc_com_paid_flg
				{$auto_appl_delay_days, "rcst_flg"},	// auto_appl_delay_days
				{$rcst_prnt_typ, "rcst_flg"},	// rcst_prnt_typ
				{$lg_grp_cd, "dlv_flg"},	// lg_grp_cd
				{$dlv_sundry_flg, "dlv_flg"},	// dlv_sundry_flg
				{$tdlv_flg, "dlv_flg"},	// tdlv_flg
				{$via_dlv_typ, "dlv_flg"},	// via_dlv_typ
				{$tdlv_req_flg, "dlv_flg"},	// tdlv_req_flg
				{$dlv_cal_cd, "dlv_flg"},	// dlv_cal_cd
				{$dlv_cntct_dpt, "dlv_flg"},	// dlv_cntct_dpt
				{$dlv_cntct_psn, "dlv_flg"},	// dlv_cntct_psn
				{$dlv_cntct_psn_title, "dlv_flg"},	// dlv_cntct_psn_title
				{$pri_prnt_flg, "dlv_flg"},	// pri_prnt_flg
				{$cnsgn_stktk_flg, "dlv_flg"},	// cnsgn_stktk_flg
				{$dlv_chnnl1, "dlv_flg"},	// dlv_chnnl1
				{$dlv_chnnl2, "dlv_flg"},	// dlv_chnnl2
				{$dlv_chnnl3, "dlv_flg"},	// dlv_chnnl3
				{$dlv_prnt_typ, "dlv_flg"},	// dlv_prnt_typ
				{$asppl_cd, "sppl_flg"},	// asppl_cd
				{$sppl_cntct_dpt, "sppl_flg"},	// sppl_cntct_dpt
				{$sppl_cntct_psn, "sppl_flg"},	// sppl_cntct_psn
				{$sppl_cntct_psn_title, "sppl_flg"},	// sppl_cntct_psn_title
				{$subcon_flg, "sppl_flg"},	// subcon_flg
				{$onr_prsppl_flg, "sppl_flg"},	// onr_prsppl_flg
				{$repurc_obli_flg, "sppl_flg"},	// repurc_obli_flg
				{$vmi_purc_dpt_cd, "sppl_flg"},	// vmi_purc_dpt_cd
				{$purc_upri_req_typ, "sppl_flg"},	// purc_upri_req_typ
				{$purc_upri_cng_flg, "sppl_flg"},	// purc_upri_cng_flg
				{$prms_recv_flg, "sppl_flg"},	// prms_recv_flg
				{$purc_amt_rnd_typ, "sppl_flg"},	// purc_amt_rnd_typ
				{$purc_tax_calc_typ, "sppl_flg"},	// purc_tax_calc_typ
				{$purc_tax_rnd_typ, "sppl_flg"},	// purc_tax_rnd_typ
				{$purc_tax_cd, "sppl_flg"},	// purc_tax_cd
				{$purc_tax_cd_prio_flg, "sppl_flg"},	// purc_tax_cd_prio_flg
				{$sppl_cal_cd, "sppl_flg"},	// sppl_cal_cd
				{$po_print_cd, "sppl_flg"},	// po_print_cd
				{$sppl_ship_form_cd, "sppl_flg"},	// sppl_ship_form_cd
				{$po_dlv_slip_flg, "sppl_flg"},	// po_dlv_slip_flg
				{$dlv_inst_dlv_slip_flg, "sppl_flg"},	// dlv_inst_dlv_slip_flg
				{$prms_rcpt_dlv_slip_flg, "sppl_flg"},	// prms_rcpt_dlv_slip_flg
				{$prov_rcv_typ, "sppl_flg"},	// prov_rcv_typ
				{$purc_slip_each_lot_typ, "sppl_flg"},	// purc_slip_each_lot_typ
				{$sppl_tterm_cd1, "sppl_flg"},	// sppl_tterm_cd1
				{$sppl_tterm_cd2, "sppl_flg"},	// sppl_tterm_cd2
				{$sppl_tterm_cd3, "sppl_flg"},	// sppl_tterm_cd3
				{$pay_crryovr_times, "sppl_flg"},	// pay_crryovr_times
				{$wrk_po_flg, "sppl_flg"},	// wrk_po_flg
				{$wrk_ap_flg, "sppl_flg"},	// wrk_ap_flg
				{$sppl_iv_flg, "sppl_flg"},	// sppl_iv_flg
				{$rcpt_iv_dup_flg, "sppl_flg"},	// rcpt_iv_dup_flg
				{$purc_basis_typ, "sppl_flg"},	// purc_basis_typ
				{$outsrc_upri_typ, "sppl_flg"},	// outsrc_upri_typ
				{$prov_basis_typ, "sppl_flg"},	// prov_basis_typ
				{$prov_upri_cng_flg, "sppl_flg"},	// prov_upri_cng_flg
				{$prov_tax_cd, "sppl_flg"},	// prov_tax_cd
				{$prov_tax_cd_prio_flg, "sppl_flg"},	// prov_tax_cd_prio_flg
				{$prov_amt_rnd_typ, "sppl_flg"},	// prov_amt_rnd_typ
				{$prov_tax_calc_typ, "sppl_flg"},	// prov_tax_calc_typ
				{$prov_tax_rnd_typ, "sppl_flg"},	// prov_tax_rnd_typ
				{$sppl_prnt_typ, "sppl_flg"},	// sppl_prnt_typ
				{$bsppl_cd, "asppl_flg"},	// bsppl_cd
				{$ap_dpt_cd, "asppl_flg"},	// ap_dpt_cd
				{$asppl_prnt_typ, "asppl_flg"},	// asppl_prnt_typ
				{$psppl_cd, "bsppl_flg"},	// psppl_cd
				{$bsppl_dpt_cd, "bsppl_flg"},	// bsppl_dpt_cd
				{$ap_cred_cd, "bsppl_flg"},	// ap_cred_cd
				{$purc_interim_cl_flg, "bsppl_flg"},	// purc_interim_cl_flg
				{$pay_bank_ac_cd, "bsppl_flg"},	// pay_bank_ac_cd
				{$pay_spot_flg, "bsppl_flg"},	// pay_spot_flg
				{$psppl_cl_day1, "bsppl_flg"},	// psppl_cl_day1
				{$psppl_cl_day2, "bsppl_flg"},	// psppl_cl_day2
				{$psppl_cl_day3, "bsppl_flg"},	// psppl_cl_day3
				{$psppl_cl_day4, "bsppl_flg"},	// psppl_cl_day4
				{$psppl_cl_day5, "bsppl_flg"},	// psppl_cl_day5
				{$ap_setoff_grp_cd, "bsppl_flg"},	// ap_setoff_grp_cd
				{$tax_on_pay_flg, "bsppl_flg"},	// tax_on_pay_flg
				{$pay_tax_rnd_typ, "bsppl_flg"},	// pay_tax_rnd_typ
				{$pay_schd_ba_typ, "bsppl_flg"},	// pay_schd_ba_typ
				{$batch_pay_schd_cl_flg, "bsppl_flg"},	// batch_pay_schd_cl_flg
				{$pay_schd_cl_delay_days, "bsppl_flg"},	// pay_schd_cl_delay_days
				{$pay_schd_cl_ba_typ, "bsppl_flg"},	// pay_schd_cl_ba_typ
				{$bsppl_prnt_typ, "bsppl_flg"},	// bsppl_prnt_typ
				{$pay_ntc_prnt_flg, "bsppl_flg"},	// pay_ntc_prnt_flg
				{$pay_ntc_zip_cd, "bsppl_flg"},	// pay_ntc_zip_cd
				{$pay_ntc_addr1, "bsppl_flg"},	// pay_ntc_addr1
				{$pay_ntc_addr2, "bsppl_flg"},	// pay_ntc_addr2
				{$pay_ntc_addr3, "bsppl_flg"},	// pay_ntc_addr3
				{$pay_ntc_addr4, "bsppl_flg"},	// pay_ntc_addr4
				{$pay_ntc_tel, "bsppl_flg"},	// pay_ntc_tel
				{$pay_ntc_bsppl_nm, "bsppl_flg"},	// pay_ntc_bsppl_nm
				{$pay_ntc_bsppl_dpt, "bsppl_flg"},	// pay_ntc_bsppl_dpt
				{$pay_ntc_bsppl_psn, "bsppl_flg"},	// pay_ntc_bsppl_psn
				{$pay_ntc_bsppl_psn_title, "bsppl_flg"},	// pay_ntc_bsppl_psn_title
				{$pay_ntc_dtl_outp_flg, "bsppl_flg"},	// pay_ntc_dtl_outp_flg
				{$pay_ntc_bfw_bal_disp_flg, "bsppl_flg"},	// pay_ntc_bfw_bal_disp_flg
				{$pay_ntc_adv_pay_flg, "bsppl_flg"},	// pay_ntc_adv_pay_flg
				{$pay_ntc_dtl_pay_flg, "bsppl_flg"},	// pay_ntc_dtl_pay_flg
				{$pay_ntc_dtl_subttl_typ, "bsppl_flg"},	// pay_ntc_dtl_subttl_typ
				{$pay_ntc_dtl_brk_typ, "bsppl_flg"},	// pay_ntc_dtl_brk_typ
				{$pay_ntc_dtl_sort_typ, "bsppl_flg"},	// pay_ntc_dtl_sort_typ
				{$pay_ntc_can_slip_typ, "bsppl_flg"},	// pay_ntc_can_slip_typ
				{$psppl_rmrks, "psppl_flg"},	// psppl_rmrks
				{$note_days, "psppl_flg"},	// note_days
				{$pay_dpt_cd, "psppl_flg"},	// pay_dpt_cd
				{$psppl_prnt_typ, "psppl_flg"}	// psppl_prnt_typ
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
	protected CmnR_MC_A(ConstMetaList<? extends CmnR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CmnR clone() {
		return (CmnR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CmnR createInstance() {
		return (CmnR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CmnR getValues(String... names) {
		return (CmnR) super.getValues(names);
	}



	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public String bp_cd() {
		return getConstString(offset + 0, $bp_cd);
	}

	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public void bp_cd(String value) {
		setConstString(offset + 0, $bp_cd, value);
	}


	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public String bp_nm_lcl() {
		return getConstString(offset + 1, $bp_nm_lcl);
	}

	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public void bp_nm_lcl(String value) {
		setConstString(offset + 1, $bp_nm_lcl, value);
	}


	/**
	 * Standard BP name 標準取引先名.<p>
	 *
	 */
	public String bp_nm() {
		return getConstString(offset + 2, $bp_nm);
	}

	/**
	 * Standard BP name 標準取引先名.<p>
	 *
	 */
	public void bp_nm(String value) {
		setConstString(offset + 2, $bp_nm, value);
	}


	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 3, $del_flg);
	}

	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 3, $del_flg, value);
	}


	/**
	 * Whole company 全社.<p>
	 *
	 */
	public boolean all_com_flg() {
		return getConstBoolean(offset + 4, $all_com_flg);
	}

	/**
	 * Whole company 全社.<p>
	 *
	 */
	public void all_com_flg(boolean value) {
		setConstBoolean(offset + 4, $all_com_flg, value);
	}


	/**
	 * Whole company 全社.<p>
	 *
	 */
	public boolean org_all_com_flg() {
		return getConstBoolean(offset + 5, $org_all_com_flg);
	}

	/**
	 * Whole company 全社.<p>
	 *
	 */
	public void org_all_com_flg(boolean value) {
		setConstBoolean(offset + 5, $org_all_com_flg, value);
	}


	/**
	 * Own company use 自社使用.<p>
	 *
	 */
	public boolean com_use_flg() {
		return getConstBoolean(offset + 6, $com_use_flg);
	}

	/**
	 * Own company use 自社使用.<p>
	 *
	 */
	public void com_use_flg(boolean value) {
		setConstBoolean(offset + 6, $com_use_flg, value);
	}


	/**
	 * Not own company use 自社不使用.<p>
	 *
	 */
	public boolean com_ex_flg() {
		return getConstBoolean(offset + 7, $com_ex_flg);
	}

	/**
	 * Not own company use 自社不使用.<p>
	 *
	 */
	public void com_ex_flg(boolean value) {
		setConstBoolean(offset + 7, $com_ex_flg, value);
	}


	/**
	 * BP alias name 1 取引先別名１.<p>
	 *
	 */
	public String bp_alt_nm1() {
		return getConstString(offset + 8, $bp_alt_nm1);
	}

	/**
	 * BP alias name 1 取引先別名１.<p>
	 *
	 */
	public void bp_alt_nm1(String value) {
		setConstString(offset + 8, $bp_alt_nm1, value);
	}


	/**
	 * BP alias name 2 取引先別名２.<p>
	 *
	 */
	public String bp_alt_nm2() {
		return getConstString(offset + 9, $bp_alt_nm2);
	}

	/**
	 * BP alias name 2 取引先別名２.<p>
	 *
	 */
	public void bp_alt_nm2(String value) {
		setConstString(offset + 9, $bp_alt_nm2, value);
	}


	/**
	 * BP alias name 3 取引先別名３.<p>
	 *
	 */
	public String bp_alt_nm3() {
		return getConstString(offset + 10, $bp_alt_nm3);
	}

	/**
	 * BP alias name 3 取引先別名３.<p>
	 *
	 */
	public void bp_alt_nm3(String value) {
		setConstString(offset + 10, $bp_alt_nm3, value);
	}


	/**
	 * BP alias name 4 取引先別名４.<p>
	 *
	 */
	public String bp_alt_nm4() {
		return getConstString(offset + 11, $bp_alt_nm4);
	}

	/**
	 * BP alias name 4 取引先別名４.<p>
	 *
	 */
	public void bp_alt_nm4(String value) {
		setConstString(offset + 11, $bp_alt_nm4, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 12, $cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 12, $cur_cd, value);
	}


	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public String cur_nm() {
		return getConstString(offset + 13, $cur_nm);
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public void cur_nm(String value) {
		setConstString(offset + 13, $cur_nm, value);
	}


	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public String cntry_cd() {
		return getConstString(offset + 14, $cntry_cd);
	}

	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public void cntry_cd(String value) {
		setConstString(offset + 14, $cntry_cd, value);
	}


	/**
	 * Country name 国名.<p>
	 *
	 */
	public String cntry_nm() {
		return getConstString(offset + 15, $cntry_nm);
	}

	/**
	 * Country name 国名.<p>
	 *
	 */
	public void cntry_nm(String value) {
		setConstString(offset + 15, $cntry_nm, value);
	}


	/**
	 * Region cd. 地域ＣＤ.<p>
	 *
	 */
	public String area_cd() {
		return getConstString(offset + 16, $area_cd);
	}

	/**
	 * Region cd. 地域ＣＤ.<p>
	 *
	 */
	public void area_cd(String value) {
		setConstString(offset + 16, $area_cd, value);
	}


	/**
	 * Region name 地域名.<p>
	 *
	 */
	public String area_nm() {
		return getConstString(offset + 17, $area_nm);
	}

	/**
	 * Region name 地域名.<p>
	 *
	 */
	public void area_nm(String value) {
		setConstString(offset + 17, $area_nm, value);
	}


	/**
	 * Customer 得意先.<p>
	 *
	 */
	public boolean cst_flg() {
		return getConstBoolean(offset + 18, $cst_flg);
	}

	/**
	 * Customer 得意先.<p>
	 *
	 */
	public void cst_flg(boolean value) {
		setConstBoolean(offset + 18, $cst_flg, value);
	}


	/**
	 * Customer 得意先.<p>
	 *
	 */
	public boolean org_cst_flg() {
		return getConstBoolean(offset + 19, $org_cst_flg);
	}

	/**
	 * Customer 得意先.<p>
	 *
	 */
	public void org_cst_flg(boolean value) {
		setConstBoolean(offset + 19, $org_cst_flg, value);
	}


	/**
	 * AR customer 売掛先.<p>
	 *
	 */
	public boolean acst_flg() {
		return getConstBoolean(offset + 20, $acst_flg);
	}

	/**
	 * AR customer 売掛先.<p>
	 *
	 */
	public void acst_flg(boolean value) {
		setConstBoolean(offset + 20, $acst_flg, value);
	}


	/**
	 * Billing customer 請求先.<p>
	 *
	 */
	public boolean bcst_flg() {
		return getConstBoolean(offset + 21, $bcst_flg);
	}

	/**
	 * Billing customer 請求先.<p>
	 *
	 */
	public void bcst_flg(boolean value) {
		setConstBoolean(offset + 21, $bcst_flg, value);
	}


	/**
	 * Payer 入金先.<p>
	 *
	 */
	public boolean rcst_flg() {
		return getConstBoolean(offset + 22, $rcst_flg);
	}

	/**
	 * Payer 入金先.<p>
	 *
	 */
	public void rcst_flg(boolean value) {
		setConstBoolean(offset + 22, $rcst_flg, value);
	}


	/**
	 * Delivery destination 納品先.<p>
	 *
	 */
	public boolean dlv_flg() {
		return getConstBoolean(offset + 23, $dlv_flg);
	}

	/**
	 * Delivery destination 納品先.<p>
	 *
	 */
	public void dlv_flg(boolean value) {
		setConstBoolean(offset + 23, $dlv_flg, value);
	}


	/**
	 * Distribution channel 仕向先.<p>
	 *
	 */
	public boolean dest_flg() {
		return getConstBoolean(offset + 24, $dest_flg);
	}

	/**
	 * Distribution channel 仕向先.<p>
	 *
	 */
	public void dest_flg(boolean value) {
		setConstBoolean(offset + 24, $dest_flg, value);
	}


	/**
	 * Credit managed BP 与信管理先.<p>
	 *
	 */
	public boolean cred_flg() {
		return getConstBoolean(offset + 25, $cred_flg);
	}

	/**
	 * Credit managed BP 与信管理先.<p>
	 *
	 */
	public void cred_flg(boolean value) {
		setConstBoolean(offset + 25, $cred_flg, value);
	}


	/**
	 * Supplier 発注先.<p>
	 *
	 */
	public boolean sppl_flg() {
		return getConstBoolean(offset + 26, $sppl_flg);
	}

	/**
	 * Supplier 発注先.<p>
	 *
	 */
	public void sppl_flg(boolean value) {
		setConstBoolean(offset + 26, $sppl_flg, value);
	}


	/**
	 * Supplier 発注先.<p>
	 *
	 */
	public boolean org_sppl_flg() {
		return getConstBoolean(offset + 27, $org_sppl_flg);
	}

	/**
	 * Supplier 発注先.<p>
	 *
	 */
	public void org_sppl_flg(boolean value) {
		setConstBoolean(offset + 27, $org_sppl_flg, value);
	}


	/**
	 * AP supplier 買掛先.<p>
	 *
	 */
	public boolean asppl_flg() {
		return getConstBoolean(offset + 28, $asppl_flg);
	}

	/**
	 * AP supplier 買掛先.<p>
	 *
	 */
	public void asppl_flg(boolean value) {
		setConstBoolean(offset + 28, $asppl_flg, value);
	}


	/**
	 * Scheduled payee 支払予定管理先.<p>
	 *
	 */
	public boolean bsppl_flg() {
		return getConstBoolean(offset + 29, $bsppl_flg);
	}

	/**
	 * Scheduled payee 支払予定管理先.<p>
	 *
	 */
	public void bsppl_flg(boolean value) {
		setConstBoolean(offset + 29, $bsppl_flg, value);
	}


	/**
	 * Payee 支払先.<p>
	 *
	 */
	public boolean psppl_flg() {
		return getConstBoolean(offset + 30, $psppl_flg);
	}

	/**
	 * Payee 支払先.<p>
	 *
	 */
	public void psppl_flg(boolean value) {
		setConstBoolean(offset + 30, $psppl_flg, value);
	}


	/**
	 * Maker メーカ.<p>
	 *
	 */
	public boolean maker_flg() {
		return getConstBoolean(offset + 31, $maker_flg);
	}

	/**
	 * Maker メーカ.<p>
	 *
	 */
	public void maker_flg(boolean value) {
		setConstBoolean(offset + 31, $maker_flg, value);
	}


	/**
	 * Business No. 事業者ＮＯ.<p>
	 *
	 */
	public String biz_co_no() {
		return getConstString(offset + 32, $biz_co_no);
	}

	/**
	 * Business No. 事業者ＮＯ.<p>
	 *
	 */
	public void biz_co_no(String value) {
		setConstString(offset + 32, $biz_co_no, value);
	}


	/**
	 * Corporation number 法人番号.<p>
	 *
	 */
	public String ein() {
		return getConstString(offset + 33, $ein);
	}

	/**
	 * Corporation number 法人番号.<p>
	 *
	 */
	public void ein(String value) {
		setConstString(offset + 33, $ein, value);
	}


	/**
	 * Standard company code 標準企業コード.<p>
	 *
	 */
	public String std_co_cd() {
		return getConstString(offset + 34, $std_co_cd);
	}

	/**
	 * Standard company code 標準企業コード.<p>
	 *
	 */
	public void std_co_cd(String value) {
		setConstString(offset + 34, $std_co_cd, value);
	}


	/**
	 * TEL ＴＥＬ.<p>
	 *
	 */
	public String tel() {
		return getConstString(offset + 35, $tel);
	}

	/**
	 * TEL ＴＥＬ.<p>
	 *
	 */
	public void tel(String value) {
		setConstString(offset + 35, $tel, value);
	}


	/**
	 * FAX ＦＡＸ.<p>
	 *
	 */
	public String fax() {
		return getConstString(offset + 36, $fax);
	}

	/**
	 * FAX ＦＡＸ.<p>
	 *
	 */
	public void fax(String value) {
		setConstString(offset + 36, $fax, value);
	}


	/**
	 * Zip code 郵便番号.<p>
	 *
	 */
	public String zip_cd() {
		return getConstString(offset + 37, $zip_cd);
	}

	/**
	 * Zip code 郵便番号.<p>
	 *
	 */
	public void zip_cd(String value) {
		setConstString(offset + 37, $zip_cd, value);
	}


	/**
	 * Address 1 住所１.<p>
	 *
	 */
	public String addr1() {
		return getConstString(offset + 38, $addr1);
	}

	/**
	 * Address 1 住所１.<p>
	 *
	 */
	public void addr1(String value) {
		setConstString(offset + 38, $addr1, value);
	}


	/**
	 * Address 2 住所２.<p>
	 *
	 */
	public String addr2() {
		return getConstString(offset + 39, $addr2);
	}

	/**
	 * Address 2 住所２.<p>
	 *
	 */
	public void addr2(String value) {
		setConstString(offset + 39, $addr2, value);
	}


	/**
	 * Address 3 住所３.<p>
	 *
	 */
	public String addr3() {
		return getConstString(offset + 40, $addr3);
	}

	/**
	 * Address 3 住所３.<p>
	 *
	 */
	public void addr3(String value) {
		setConstString(offset + 40, $addr3, value);
	}


	/**
	 * Address 4 住所４.<p>
	 *
	 */
	public String addr4() {
		return getConstString(offset + 41, $addr4);
	}

	/**
	 * Address 4 住所４.<p>
	 *
	 */
	public void addr4(String value) {
		setConstString(offset + 41, $addr4, value);
	}


	/**
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public String prnt_lcl_cd() {
		return getConstString(offset + 42, $prnt_lcl_cd);
	}

	/**
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public void prnt_lcl_cd(String value) {
		setConstString(offset + 42, $prnt_lcl_cd, value);
	}


	/**
	 * Report output locale name 帳票出力ロケール名.<p>
	 *
	 */
	public String prnt_lcl_nm() {
		return getConstString(offset + 43, $prnt_lcl_nm);
	}

	/**
	 * Report output locale name 帳票出力ロケール名.<p>
	 *
	 */
	public void prnt_lcl_nm(String value) {
		setConstString(offset + 43, $prnt_lcl_nm, value);
	}


	/**
	 * BP allocation group 取引先配賦グループ.<p>
	 *
	 */
	public String bp_alc_grp() {
		return getConstString(offset + 44, $bp_alc_grp);
	}

	/**
	 * BP allocation group 取引先配賦グループ.<p>
	 *
	 */
	public void bp_alc_grp(String value) {
		setConstString(offset + 44, $bp_alc_grp, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 45, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 45, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 46, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 46, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 47, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 47, $memo3, value);
	}


	/**
	 * Memo 4 メモ４.<p>
	 *
	 */
	public String memo4() {
		return getConstString(offset + 48, $memo4);
	}

	/**
	 * Memo 4 メモ４.<p>
	 *
	 */
	public void memo4(String value) {
		setConstString(offset + 48, $memo4, value);
	}


	/**
	 * Memo 5 メモ５.<p>
	 *
	 */
	public String memo5() {
		return getConstString(offset + 49, $memo5);
	}

	/**
	 * Memo 5 メモ５.<p>
	 *
	 */
	public void memo5(String value) {
		setConstString(offset + 49, $memo5, value);
	}


	/**
	 * Memo 6 メモ６.<p>
	 *
	 */
	public String memo6() {
		return getConstString(offset + 50, $memo6);
	}

	/**
	 * Memo 6 メモ６.<p>
	 *
	 */
	public void memo6(String value) {
		setConstString(offset + 50, $memo6, value);
	}


	/**
	 * Memo 7 メモ７.<p>
	 *
	 */
	public String memo7() {
		return getConstString(offset + 51, $memo7);
	}

	/**
	 * Memo 7 メモ７.<p>
	 *
	 */
	public void memo7(String value) {
		setConstString(offset + 51, $memo7, value);
	}


	/**
	 * Memo 8 メモ８.<p>
	 *
	 */
	public String memo8() {
		return getConstString(offset + 52, $memo8);
	}

	/**
	 * Memo 8 メモ８.<p>
	 *
	 */
	public void memo8(String value) {
		setConstString(offset + 52, $memo8, value);
	}


	/**
	 * Memo 9 メモ９.<p>
	 *
	 */
	public String memo9() {
		return getConstString(offset + 53, $memo9);
	}

	/**
	 * Memo 9 メモ９.<p>
	 *
	 */
	public void memo9(String value) {
		setConstString(offset + 53, $memo9, value);
	}


	/**
	 * Memo 10 メモ１０.<p>
	 *
	 */
	public String memo10() {
		return getConstString(offset + 54, $memo10);
	}

	/**
	 * Memo 10 メモ１０.<p>
	 *
	 */
	public void memo10(String value) {
		setConstString(offset + 54, $memo10, value);
	}


	/**
	 * Memo 11 メモ１１.<p>
	 *
	 */
	public String memo11() {
		return getConstString(offset + 55, $memo11);
	}

	/**
	 * Memo 11 メモ１１.<p>
	 *
	 */
	public void memo11(String value) {
		setConstString(offset + 55, $memo11, value);
	}


	/**
	 * Memo 12 メモ１２.<p>
	 *
	 */
	public String memo12() {
		return getConstString(offset + 56, $memo12);
	}

	/**
	 * Memo 12 メモ１２.<p>
	 *
	 */
	public void memo12(String value) {
		setConstString(offset + 56, $memo12, value);
	}


	/**
	 * Memo 13 メモ１３.<p>
	 *
	 */
	public String memo13() {
		return getConstString(offset + 57, $memo13);
	}

	/**
	 * Memo 13 メモ１３.<p>
	 *
	 */
	public void memo13(String value) {
		setConstString(offset + 57, $memo13, value);
	}


	/**
	 * Memo 14 メモ１４.<p>
	 *
	 */
	public String memo14() {
		return getConstString(offset + 58, $memo14);
	}

	/**
	 * Memo 14 メモ１４.<p>
	 *
	 */
	public void memo14(String value) {
		setConstString(offset + 58, $memo14, value);
	}


	/**
	 * Memo 15 メモ１５.<p>
	 *
	 */
	public String memo15() {
		return getConstString(offset + 59, $memo15);
	}

	/**
	 * Memo 15 メモ１５.<p>
	 *
	 */
	public void memo15(String value) {
		setConstString(offset + 59, $memo15, value);
	}


	/**
	 * Memo 16 メモ１６.<p>
	 *
	 */
	public String memo16() {
		return getConstString(offset + 60, $memo16);
	}

	/**
	 * Memo 16 メモ１６.<p>
	 *
	 */
	public void memo16(String value) {
		setConstString(offset + 60, $memo16, value);
	}


	/**
	 * Memo 17 メモ１７.<p>
	 *
	 */
	public String memo17() {
		return getConstString(offset + 61, $memo17);
	}

	/**
	 * Memo 17 メモ１７.<p>
	 *
	 */
	public void memo17(String value) {
		setConstString(offset + 61, $memo17, value);
	}


	/**
	 * Memo 18 メモ１８.<p>
	 *
	 */
	public String memo18() {
		return getConstString(offset + 62, $memo18);
	}

	/**
	 * Memo 18 メモ１８.<p>
	 *
	 */
	public void memo18(String value) {
		setConstString(offset + 62, $memo18, value);
	}


	/**
	 * Memo 19 メモ１９.<p>
	 *
	 */
	public String memo19() {
		return getConstString(offset + 63, $memo19);
	}

	/**
	 * Memo 19 メモ１９.<p>
	 *
	 */
	public void memo19(String value) {
		setConstString(offset + 63, $memo19, value);
	}


	/**
	 * Memo 20 メモ２０.<p>
	 *
	 */
	public String memo20() {
		return getConstString(offset + 64, $memo20);
	}

	/**
	 * Memo 20 メモ２０.<p>
	 *
	 */
	public void memo20(String value) {
		setConstString(offset + 64, $memo20, value);
	}


	/**
	 * BP classification cd. 1 取引先分類ＣＤ１.<p>
	 *
	 */
	public String bp_grp_cd1() {
		return getConstString(offset + 65, $bp_grp_cd1);
	}

	/**
	 * BP classification cd. 1 取引先分類ＣＤ１.<p>
	 *
	 */
	public void bp_grp_cd1(String value) {
		setConstString(offset + 65, $bp_grp_cd1, value);
	}


	/**
	 * BP classification name 1 取引先分類名１.<p>
	 *
	 */
	public String bp_grp_nm1() {
		return getConstString(offset + 66, $bp_grp_nm1);
	}

	/**
	 * BP classification name 1 取引先分類名１.<p>
	 *
	 */
	public void bp_grp_nm1(String value) {
		setConstString(offset + 66, $bp_grp_nm1, value);
	}


	/**
	 * BP classification cd. 2 取引先分類ＣＤ２.<p>
	 *
	 */
	public String bp_grp_cd2() {
		return getConstString(offset + 67, $bp_grp_cd2);
	}

	/**
	 * BP classification cd. 2 取引先分類ＣＤ２.<p>
	 *
	 */
	public void bp_grp_cd2(String value) {
		setConstString(offset + 67, $bp_grp_cd2, value);
	}


	/**
	 * BP classification name 2 取引先分類名２.<p>
	 *
	 */
	public String bp_grp_nm2() {
		return getConstString(offset + 68, $bp_grp_nm2);
	}

	/**
	 * BP classification name 2 取引先分類名２.<p>
	 *
	 */
	public void bp_grp_nm2(String value) {
		setConstString(offset + 68, $bp_grp_nm2, value);
	}


	/**
	 * BP classification cd. 3 取引先分類ＣＤ３.<p>
	 *
	 */
	public String bp_grp_cd3() {
		return getConstString(offset + 69, $bp_grp_cd3);
	}

	/**
	 * BP classification cd. 3 取引先分類ＣＤ３.<p>
	 *
	 */
	public void bp_grp_cd3(String value) {
		setConstString(offset + 69, $bp_grp_cd3, value);
	}


	/**
	 * BP classification name 3 取引先分類名３.<p>
	 *
	 */
	public String bp_grp_nm3() {
		return getConstString(offset + 70, $bp_grp_nm3);
	}

	/**
	 * BP classification name 3 取引先分類名３.<p>
	 *
	 */
	public void bp_grp_nm3(String value) {
		setConstString(offset + 70, $bp_grp_nm3, value);
	}


	/**
	 * BP classification cd. 4 取引先分類ＣＤ４.<p>
	 *
	 */
	public String bp_grp_cd4() {
		return getConstString(offset + 71, $bp_grp_cd4);
	}

	/**
	 * BP classification cd. 4 取引先分類ＣＤ４.<p>
	 *
	 */
	public void bp_grp_cd4(String value) {
		setConstString(offset + 71, $bp_grp_cd4, value);
	}


	/**
	 * BP classification name 4 取引先分類名４.<p>
	 *
	 */
	public String bp_grp_nm4() {
		return getConstString(offset + 72, $bp_grp_nm4);
	}

	/**
	 * BP classification name 4 取引先分類名４.<p>
	 *
	 */
	public void bp_grp_nm4(String value) {
		setConstString(offset + 72, $bp_grp_nm4, value);
	}


	/**
	 * BP classification cd. 5 取引先分類ＣＤ５.<p>
	 *
	 */
	public String bp_grp_cd5() {
		return getConstString(offset + 73, $bp_grp_cd5);
	}

	/**
	 * BP classification cd. 5 取引先分類ＣＤ５.<p>
	 *
	 */
	public void bp_grp_cd5(String value) {
		setConstString(offset + 73, $bp_grp_cd5, value);
	}


	/**
	 * BP classification name 5 取引先分類名５.<p>
	 *
	 */
	public String bp_grp_nm5() {
		return getConstString(offset + 74, $bp_grp_nm5);
	}

	/**
	 * BP classification name 5 取引先分類名５.<p>
	 *
	 */
	public void bp_grp_nm5(String value) {
		setConstString(offset + 74, $bp_grp_nm5, value);
	}


	/**
	 * BP classification cd. 6 取引先分類ＣＤ６.<p>
	 *
	 */
	public String bp_grp_cd6() {
		return getConstString(offset + 75, $bp_grp_cd6);
	}

	/**
	 * BP classification cd. 6 取引先分類ＣＤ６.<p>
	 *
	 */
	public void bp_grp_cd6(String value) {
		setConstString(offset + 75, $bp_grp_cd6, value);
	}


	/**
	 * BP classification name 6 取引先分類名６.<p>
	 *
	 */
	public String bp_grp_nm6() {
		return getConstString(offset + 76, $bp_grp_nm6);
	}

	/**
	 * BP classification name 6 取引先分類名６.<p>
	 *
	 */
	public void bp_grp_nm6(String value) {
		setConstString(offset + 76, $bp_grp_nm6, value);
	}


	/**
	 * BP classification cd. 7 取引先分類ＣＤ７.<p>
	 *
	 */
	public String bp_grp_cd7() {
		return getConstString(offset + 77, $bp_grp_cd7);
	}

	/**
	 * BP classification cd. 7 取引先分類ＣＤ７.<p>
	 *
	 */
	public void bp_grp_cd7(String value) {
		setConstString(offset + 77, $bp_grp_cd7, value);
	}


	/**
	 * BP classification name 7 取引先分類名７.<p>
	 *
	 */
	public String bp_grp_nm7() {
		return getConstString(offset + 78, $bp_grp_nm7);
	}

	/**
	 * BP classification name 7 取引先分類名７.<p>
	 *
	 */
	public void bp_grp_nm7(String value) {
		setConstString(offset + 78, $bp_grp_nm7, value);
	}


	/**
	 * BP classification cd. 8 取引先分類ＣＤ８.<p>
	 *
	 */
	public String bp_grp_cd8() {
		return getConstString(offset + 79, $bp_grp_cd8);
	}

	/**
	 * BP classification cd. 8 取引先分類ＣＤ８.<p>
	 *
	 */
	public void bp_grp_cd8(String value) {
		setConstString(offset + 79, $bp_grp_cd8, value);
	}


	/**
	 * BP classification name 8 取引先分類名８.<p>
	 *
	 */
	public String bp_grp_nm8() {
		return getConstString(offset + 80, $bp_grp_nm8);
	}

	/**
	 * BP classification name 8 取引先分類名８.<p>
	 *
	 */
	public void bp_grp_nm8(String value) {
		setConstString(offset + 80, $bp_grp_nm8, value);
	}


	/**
	 * BP classification cd. 9 取引先分類ＣＤ９.<p>
	 *
	 */
	public String bp_grp_cd9() {
		return getConstString(offset + 81, $bp_grp_cd9);
	}

	/**
	 * BP classification cd. 9 取引先分類ＣＤ９.<p>
	 *
	 */
	public void bp_grp_cd9(String value) {
		setConstString(offset + 81, $bp_grp_cd9, value);
	}


	/**
	 * BP classification name 9 取引先分類名９.<p>
	 *
	 */
	public String bp_grp_nm9() {
		return getConstString(offset + 82, $bp_grp_nm9);
	}

	/**
	 * BP classification name 9 取引先分類名９.<p>
	 *
	 */
	public void bp_grp_nm9(String value) {
		setConstString(offset + 82, $bp_grp_nm9, value);
	}


	/**
	 * BP classification cd. 10 取引先分類ＣＤ１０.<p>
	 *
	 */
	public String bp_grp_cd10() {
		return getConstString(offset + 83, $bp_grp_cd10);
	}

	/**
	 * BP classification cd. 10 取引先分類ＣＤ１０.<p>
	 *
	 */
	public void bp_grp_cd10(String value) {
		setConstString(offset + 83, $bp_grp_cd10, value);
	}


	/**
	 * BP classification name 10 取引先分類名１０.<p>
	 *
	 */
	public String bp_grp_nm10() {
		return getConstString(offset + 84, $bp_grp_nm10);
	}

	/**
	 * BP classification name 10 取引先分類名１０.<p>
	 *
	 */
	public void bp_grp_nm10(String value) {
		setConstString(offset + 84, $bp_grp_nm10, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id_c() {
		return getConstString(offset + 85, $ins_usr_id_c);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id_c(String value) {
		setConstString(offset + 85, $ins_usr_id_c, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm_c() {
		return getConstString(offset + 86, $ins_usr_nm_c);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm_c(String value) {
		setConstString(offset + 86, $ins_usr_nm_c, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id_c() {
		return getConstString(offset + 87, $ins_func_id_c);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id_c(String value) {
		setConstString(offset + 87, $ins_func_id_c, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm_c() {
		return getConstString(offset + 88, $ins_func_nm_c);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm_c(String value) {
		setConstString(offset + 88, $ins_func_nm_c, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id_c() {
		return getConstString(offset + 89, $upd_usr_id_c);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id_c(String value) {
		setConstString(offset + 89, $upd_usr_id_c, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm_c() {
		return getConstString(offset + 90, $upd_usr_nm_c);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm_c(String value) {
		setConstString(offset + 90, $upd_usr_nm_c, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id_c() {
		return getConstString(offset + 91, $upd_func_id_c);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id_c(String value) {
		setConstString(offset + 91, $upd_func_id_c, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm_c() {
		return getConstString(offset + 92, $upd_func_nm_c);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm_c(String value) {
		setConstString(offset + 92, $upd_func_nm_c, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts_c() {
		return getConstTimestamp(offset + 93, $ins_ts_c);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts_c(MCTimestamp value) {
		setConstTimestamp(offset + 93, $ins_ts_c, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts_c() {
		return getConstTimestamp(offset + 94, $upd_ts_c);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts_c(MCTimestamp value) {
		setConstTimestamp(offset + 94, $upd_ts_c, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no_c() {
		return getConstString(offset + 95, $upd_srv_req_no_c);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no_c(String value) {
		setConstString(offset + 95, $upd_srv_req_no_c, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr_c() {
		return getConstNumber(offset + 96, $upd_cntr_c);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr_c(MCNumber value) {
		setConstNumber(offset + 96, $upd_cntr_c, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr_c(int value) {
		setConstNumber(offset + 96, $upd_cntr_c, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr_c(long value) {
		setConstNumber(offset + 96, $upd_cntr_c, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr_c(float value) {
		setConstNumber(offset + 96, $upd_cntr_c, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr_c(double value) {
		setConstNumber(offset + 96, $upd_cntr_c, value);
	}


	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public String del_usr_id_c() {
		return getConstString(offset + 97, $del_usr_id_c);
	}

	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public void del_usr_id_c(String value) {
		setConstString(offset + 97, $del_usr_id_c, value);
	}


	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public String del_usr_nm_c() {
		return getConstString(offset + 98, $del_usr_nm_c);
	}

	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public void del_usr_nm_c(String value) {
		setConstString(offset + 98, $del_usr_nm_c, value);
	}


	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCTimestamp del_ts_c() {
		return getConstTimestamp(offset + 99, $del_ts_c);
	}

	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public void del_ts_c(MCTimestamp value) {
		setConstTimestamp(offset + 99, $del_ts_c, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 100, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 100, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 101, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 101, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 102, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 102, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 103, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 103, $ins_func_nm, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 104, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 104, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 105, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 105, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 106, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 106, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 107, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 107, $upd_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 108, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 108, $ins_ts, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 109, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 109, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 110, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 110, $upd_srv_req_no, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 111, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 111, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 111, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 111, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 111, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 111, $upd_cntr, value);
	}


	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 112, $del_usr_id);
	}

	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 112, $del_usr_id, value);
	}


	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 113, $del_usr_nm);
	}

	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 113, $del_usr_nm, value);
	}


	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 114, $del_ts);
	}

	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 114, $del_ts, value);
	}


	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public String acst_cd() {
		return getConstString(offset + 115, $acst_cd);
	}

	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public void acst_cd(String value) {
		setConstString(offset + 115, $acst_cd, value);
	}


	/**
	 * AR customer name 売掛先名.<p>
	 *
	 */
	public String acst_nm() {
		return getConstString(offset + 116, $acst_nm);
	}

	/**
	 * AR customer name 売掛先名.<p>
	 *
	 */
	public void acst_nm(String value) {
		setConstString(offset + 116, $acst_nm, value);
	}


	/**
	 * Customer dept. 得意先部署.<p>
	 *
	 */
	public String cst_cntct_dpt() {
		return getConstString(offset + 117, $cst_cntct_dpt);
	}

	/**
	 * Customer dept. 得意先部署.<p>
	 *
	 */
	public void cst_cntct_dpt(String value) {
		setConstString(offset + 117, $cst_cntct_dpt, value);
	}


	/**
	 * Customer PIC 得意先担当者.<p>
	 *
	 */
	public String cst_cntct_psn() {
		return getConstString(offset + 118, $cst_cntct_psn);
	}

	/**
	 * Customer PIC 得意先担当者.<p>
	 *
	 */
	public void cst_cntct_psn(String value) {
		setConstString(offset + 118, $cst_cntct_psn, value);
	}


	/**
	 * Form of address for Customer PIC 得意先担当者敬称.<p>
	 *
	 */
	public String cst_cntct_psn_title() {
		return getConstString(offset + 119, $cst_cntct_psn_title);
	}

	/**
	 * Form of address for Customer PIC 得意先担当者敬称.<p>
	 *
	 */
	public void cst_cntct_psn_title(String value) {
		setConstString(offset + 119, $cst_cntct_psn_title, value);
	}


	/**
	 * Miscellaneous customer 得意先諸口.<p>
	 *
	 */
	public boolean cst_sundry_flg() {
		return getConstBoolean(offset + 120, $cst_sundry_flg);
	}

	/**
	 * Miscellaneous customer 得意先諸口.<p>
	 *
	 */
	public void cst_sundry_flg(boolean value) {
		setConstBoolean(offset + 120, $cst_sundry_flg, value);
	}


	/**
	 * AR dept. type 債権部門区分.<p>
	 *
	 */
	public String ar_dpt_typ() {
		return getConstString(offset + 121, $ar_dpt_typ);
	}

	/**
	 * AR dept. type 債権部門区分.<p>
	 *
	 */
	public void ar_dpt_typ(String value) {
		setConstString(offset + 121, $ar_dpt_typ, value);
	}


	/**
	 * AR dept. type name 債権部門区分名.<p>
	 *
	 */
	public String ar_dpt_typ_nm() {
		return getConstString(offset + 122, $ar_dpt_typ_nm);
	}

	/**
	 * AR dept. type name 債権部門区分名.<p>
	 *
	 */
	public void ar_dpt_typ_nm(String value) {
		setConstString(offset + 122, $ar_dpt_typ_nm, value);
	}


	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public String ar_dpt_cd() {
		return getConstString(offset + 123, $ar_dpt_cd);
	}

	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public void ar_dpt_cd(String value) {
		setConstString(offset + 123, $ar_dpt_cd, value);
	}


	/**
	 * AR dept. name 債権部門名.<p>
	 *
	 */
	public String ar_dpt_nm() {
		return getConstString(offset + 124, $ar_dpt_nm);
	}

	/**
	 * AR dept. name 債権部門名.<p>
	 *
	 */
	public void ar_dpt_nm(String value) {
		setConstString(offset + 124, $ar_dpt_nm, value);
	}


	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public String check_ar_dpt_cd() {
		return getConstString(offset + 125, $check_ar_dpt_cd);
	}

	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public void check_ar_dpt_cd(String value) {
		setConstString(offset + 125, $check_ar_dpt_cd, value);
	}


	/**
	 * Sales unit price rounding type 販売単価端数処理区分.<p>
	 *
	 */
	public String sls_upri_rnd_typ() {
		return getConstString(offset + 126, $sls_upri_rnd_typ);
	}

	/**
	 * Sales unit price rounding type 販売単価端数処理区分.<p>
	 *
	 */
	public void sls_upri_rnd_typ(String value) {
		setConstString(offset + 126, $sls_upri_rnd_typ, value);
	}


	/**
	 * Sales unit rounding type name 販売単価端数処理区分名.<p>
	 *
	 */
	public String sls_upri_rnd_typ_nm() {
		return getConstString(offset + 127, $sls_upri_rnd_typ_nm);
	}

	/**
	 * Sales unit rounding type name 販売単価端数処理区分名.<p>
	 *
	 */
	public void sls_upri_rnd_typ_nm(String value) {
		setConstString(offset + 127, $sls_upri_rnd_typ_nm, value);
	}


	/**
	 * Sales unit price acquisition type 販売単価取得区分.<p>
	 *
	 */
	public String sls_upri_req_typ() {
		return getConstString(offset + 128, $sls_upri_req_typ);
	}

	/**
	 * Sales unit price acquisition type 販売単価取得区分.<p>
	 *
	 */
	public void sls_upri_req_typ(String value) {
		setConstString(offset + 128, $sls_upri_req_typ, value);
	}


	/**
	 * Sales unit price acquisition type name 販売単価取得区分名.<p>
	 *
	 */
	public String sls_upri_req_typ_nm() {
		return getConstString(offset + 129, $sls_upri_req_typ_nm);
	}

	/**
	 * Sales unit price acquisition type name 販売単価取得区分名.<p>
	 *
	 */
	public void sls_upri_req_typ_nm(String value) {
		setConstString(offset + 129, $sls_upri_req_typ_nm, value);
	}


	/**
	 * Allow sales unit price change 販売単価変更許可.<p>
	 *
	 */
	public boolean sls_upri_cng_flg() {
		return getConstBoolean(offset + 130, $sls_upri_cng_flg);
	}

	/**
	 * Allow sales unit price change 販売単価変更許可.<p>
	 *
	 */
	public void sls_upri_cng_flg(boolean value) {
		setConstBoolean(offset + 130, $sls_upri_cng_flg, value);
	}


	/**
	 * Rounding type (Sales amount) 売上金額端数処理区分.<p>
	 *
	 */
	public String sls_amt_rnd_typ() {
		return getConstString(offset + 131, $sls_amt_rnd_typ);
	}

	/**
	 * Rounding type (Sales amount) 売上金額端数処理区分.<p>
	 *
	 */
	public void sls_amt_rnd_typ(String value) {
		setConstString(offset + 131, $sls_amt_rnd_typ, value);
	}


	/**
	 * Rounding type name (Sales amount) 売上金額端数処理区分名.<p>
	 *
	 */
	public String sls_amt_rnd_typ_nm() {
		return getConstString(offset + 132, $sls_amt_rnd_typ_nm);
	}

	/**
	 * Rounding type name (Sales amount) 売上金額端数処理区分名.<p>
	 *
	 */
	public void sls_amt_rnd_typ_nm(String value) {
		setConstString(offset + 132, $sls_amt_rnd_typ_nm, value);
	}


	/**
	 * Sales tax calculation type 売上税計算区分.<p>
	 *
	 */
	public String sls_tax_calc_typ() {
		return getConstString(offset + 133, $sls_tax_calc_typ);
	}

	/**
	 * Sales tax calculation type 売上税計算区分.<p>
	 *
	 */
	public void sls_tax_calc_typ(String value) {
		setConstString(offset + 133, $sls_tax_calc_typ, value);
	}


	/**
	 * Sales tax calculation type name 売上税計算区分名.<p>
	 *
	 */
	public String sls_tax_calc_typ_nm() {
		return getConstString(offset + 134, $sls_tax_calc_typ_nm);
	}

	/**
	 * Sales tax calculation type name 売上税計算区分名.<p>
	 *
	 */
	public void sls_tax_calc_typ_nm(String value) {
		setConstString(offset + 134, $sls_tax_calc_typ_nm, value);
	}


	/**
	 * Sales tax rounding type 売上税額端数処理区分.<p>
	 *
	 */
	public String sls_tax_rnd_typ() {
		return getConstString(offset + 135, $sls_tax_rnd_typ);
	}

	/**
	 * Sales tax rounding type 売上税額端数処理区分.<p>
	 *
	 */
	public void sls_tax_rnd_typ(String value) {
		setConstString(offset + 135, $sls_tax_rnd_typ, value);
	}


	/**
	 * Rounding type 売上税額端数処理区分名.<p>
	 *
	 */
	public String sls_tax_rnd_typ_nm() {
		return getConstString(offset + 136, $sls_tax_rnd_typ_nm);
	}

	/**
	 * Rounding type 売上税額端数処理区分名.<p>
	 *
	 */
	public void sls_tax_rnd_typ_nm(String value) {
		setConstString(offset + 136, $sls_tax_rnd_typ_nm, value);
	}


	/**
	 * Sales tax cd. 売上税ＣＤ.<p>
	 *
	 */
	public String sls_tax_cd() {
		return getConstString(offset + 137, $sls_tax_cd);
	}

	/**
	 * Sales tax cd. 売上税ＣＤ.<p>
	 *
	 */
	public void sls_tax_cd(String value) {
		setConstString(offset + 137, $sls_tax_cd, value);
	}


	/**
	 * Sales tax name 売上税名.<p>
	 *
	 */
	public String sls_tax_nm() {
		return getConstString(offset + 138, $sls_tax_nm);
	}

	/**
	 * Sales tax name 売上税名.<p>
	 *
	 */
	public void sls_tax_nm(String value) {
		setConstString(offset + 138, $sls_tax_nm, value);
	}


	/**
	 * Sales tax priority 売上税優先.<p>
	 *
	 */
	public boolean sls_tax_cd_prio_flg() {
		return getConstBoolean(offset + 139, $sls_tax_cd_prio_flg);
	}

	/**
	 * Sales tax priority 売上税優先.<p>
	 *
	 */
	public void sls_tax_cd_prio_flg(boolean value) {
		setConstBoolean(offset + 139, $sls_tax_cd_prio_flg, value);
	}


	/**
	 * Lot reverse prohibit type ロット逆転禁止区分.<p>
	 *
	 */
	public String lot_back_stop_typ() {
		return getConstString(offset + 140, $lot_back_stop_typ);
	}

	/**
	 * Lot reverse prohibit type ロット逆転禁止区分.<p>
	 *
	 */
	public void lot_back_stop_typ(String value) {
		setConstString(offset + 140, $lot_back_stop_typ, value);
	}


	/**
	 * Lot reverse prohibit type name ロット逆転禁止区分名.<p>
	 *
	 */
	public String lot_back_stop_typ_nm() {
		return getConstString(offset + 141, $lot_back_stop_typ_nm);
	}

	/**
	 * Lot reverse prohibit type name ロット逆転禁止区分名.<p>
	 *
	 */
	public void lot_back_stop_typ_nm(String value) {
		setConstString(offset + 141, $lot_back_stop_typ_nm, value);
	}


	/**
	 * Revenue recording type 売上計上区分.<p>
	 *
	 */
	public String sls_basis_typ() {
		return getConstString(offset + 142, $sls_basis_typ);
	}

	/**
	 * Revenue recording type 売上計上区分.<p>
	 *
	 */
	public void sls_basis_typ(String value) {
		setConstString(offset + 142, $sls_basis_typ, value);
	}


	/**
	 * Revenue recording type name 売上計上区分名.<p>
	 *
	 */
	public String sls_basis_typ_nm() {
		return getConstString(offset + 143, $sls_basis_typ_nm);
	}

	/**
	 * Revenue recording type name 売上計上区分名.<p>
	 *
	 */
	public void sls_basis_typ_nm(String value) {
		setConstString(offset + 143, $sls_basis_typ_nm, value);
	}


	/**
	 * Billing initial base type 請求起算区分.<p>
	 *
	 */
	public String bill_basis_typ() {
		return getConstString(offset + 144, $bill_basis_typ);
	}

	/**
	 * Billing initial base type 請求起算区分.<p>
	 *
	 */
	public void bill_basis_typ(String value) {
		setConstString(offset + 144, $bill_basis_typ, value);
	}


	/**
	 * Billing calculation base type name 請求起算区分名.<p>
	 *
	 */
	public String bill_basis_typ_nm() {
		return getConstString(offset + 145, $bill_basis_typ_nm);
	}

	/**
	 * Billing calculation base type name 請求起算区分名.<p>
	 *
	 */
	public void bill_basis_typ_nm(String value) {
		setConstString(offset + 145, $bill_basis_typ_nm, value);
	}


	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public MCNumber bill_crryovr_times() {
		return getConstNumber(offset + 146, $bill_crryovr_times);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(MCNumber value) {
		setConstNumber(offset + 146, $bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(int value) {
		setConstNumber(offset + 146, $bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(long value) {
		setConstNumber(offset + 146, $bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(float value) {
		setConstNumber(offset + 146, $bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(double value) {
		setConstNumber(offset + 146, $bill_crryovr_times, value);
	}


	/**
	 * Lot details split type ロット明細分割区分.<p>
	 *
	 */
	public String slip_each_lot_typ() {
		return getConstString(offset + 147, $slip_each_lot_typ);
	}

	/**
	 * Lot details split type ロット明細分割区分.<p>
	 *
	 */
	public void slip_each_lot_typ(String value) {
		setConstString(offset + 147, $slip_each_lot_typ, value);
	}


	/**
	 * Lot details split type name ロット明細分割区分名.<p>
	 *
	 */
	public String slip_each_lot_typ_nm() {
		return getConstString(offset + 148, $slip_each_lot_typ_nm);
	}

	/**
	 * Lot details split type name ロット明細分割区分名.<p>
	 *
	 */
	public void slip_each_lot_typ_nm(String value) {
		setConstString(offset + 148, $slip_each_lot_typ_nm, value);
	}


	/**
	 * Shipping schedule split type 出荷予定分割区分.<p>
	 *
	 */
	public String ship_schd_split_typ() {
		return getConstString(offset + 149, $ship_schd_split_typ);
	}

	/**
	 * Shipping schedule split type 出荷予定分割区分.<p>
	 *
	 */
	public void ship_schd_split_typ(String value) {
		setConstString(offset + 149, $ship_schd_split_typ, value);
	}


	/**
	 * Shipping schedule split type name 出荷予定分割区分名.<p>
	 *
	 */
	public String ship_schd_split_typ_nm() {
		return getConstString(offset + 150, $ship_schd_split_typ_nm);
	}

	/**
	 * Shipping schedule split type name 出荷予定分割区分名.<p>
	 *
	 */
	public void ship_schd_split_typ_nm(String value) {
		setConstString(offset + 150, $ship_schd_split_typ_nm, value);
	}


	/**
	 * Issue identification tag 現品票発行.<p>
	 *
	 */
	public boolean stk_lst_issue_flg() {
		return getConstBoolean(offset + 151, $stk_lst_issue_flg);
	}

	/**
	 * Issue identification tag 現品票発行.<p>
	 *
	 */
	public void stk_lst_issue_flg(boolean value) {
		setConstBoolean(offset + 151, $stk_lst_issue_flg, value);
	}


	/**
	 * Identification tag cd. 現品票ＣＤ.<p>
	 *
	 */
	public String stk_lst_form_cd() {
		return getConstString(offset + 152, $stk_lst_form_cd);
	}

	/**
	 * Identification tag cd. 現品票ＣＤ.<p>
	 *
	 */
	public void stk_lst_form_cd(String value) {
		setConstString(offset + 152, $stk_lst_form_cd, value);
	}


	/**
	 * Identification tag name 現品票名.<p>
	 *
	 */
	public String stk_lst_form_nm() {
		return getConstString(offset + 153, $stk_lst_form_nm);
	}

	/**
	 * Identification tag name 現品票名.<p>
	 *
	 */
	public void stk_lst_form_nm(String value) {
		setConstString(offset + 153, $stk_lst_form_nm, value);
	}


	/**
	 * Customer delivery note cd. 得意先納品書ＣＤ.<p>
	 *
	 */
	public String cst_ship_form_cd() {
		return getConstString(offset + 154, $cst_ship_form_cd);
	}

	/**
	 * Customer delivery note cd. 得意先納品書ＣＤ.<p>
	 *
	 */
	public void cst_ship_form_cd(String value) {
		setConstString(offset + 154, $cst_ship_form_cd, value);
	}


	/**
	 * Customer delivery note name 得意先納品書名.<p>
	 *
	 */
	public String cst_ship_form_nm() {
		return getConstString(offset + 155, $cst_ship_form_nm);
	}

	/**
	 * Customer delivery note name 得意先納品書名.<p>
	 *
	 */
	public void cst_ship_form_nm(String value) {
		setConstString(offset + 155, $cst_ship_form_nm, value);
	}


	/**
	 * AR management by sales project 案件別債権管理.<p>
	 *
	 */
	public boolean wrk_ar_flg() {
		return getConstBoolean(offset + 156, $wrk_ar_flg);
	}

	/**
	 * AR management by sales project 案件別債権管理.<p>
	 *
	 */
	public void wrk_ar_flg(boolean value) {
		setConstBoolean(offset + 156, $wrk_ar_flg, value);
	}


	/**
	 * Customer invoice transaction 得意先インボイス取引.<p>
	 *
	 */
	public boolean cst_iv_flg() {
		return getConstBoolean(offset + 157, $cst_iv_flg);
	}

	/**
	 * Customer invoice transaction 得意先インボイス取引.<p>
	 *
	 */
	public void cst_iv_flg(boolean value) {
		setConstBoolean(offset + 157, $cst_iv_flg, value);
	}


	/**
	 * Shipping LT (For demand) 出荷ＬＴ（需要情報用）.<p>
	 *
	 */
	public MCNumber ship_lt() {
		return getConstNumber(offset + 158, $ship_lt);
	}

	/**
	 * Shipping LT (For demand) 出荷ＬＴ（需要情報用）.<p>
	 *
	 */
	public void ship_lt(MCNumber value) {
		setConstNumber(offset + 158, $ship_lt, value);
	}

	/**
	 * Shipping LT (For demand) 出荷ＬＴ（需要情報用）.<p>
	 *
	 */
	public void ship_lt(int value) {
		setConstNumber(offset + 158, $ship_lt, value);
	}

	/**
	 * Shipping LT (For demand) 出荷ＬＴ（需要情報用）.<p>
	 *
	 */
	public void ship_lt(long value) {
		setConstNumber(offset + 158, $ship_lt, value);
	}

	/**
	 * Shipping LT (For demand) 出荷ＬＴ（需要情報用）.<p>
	 *
	 */
	public void ship_lt(float value) {
		setConstNumber(offset + 158, $ship_lt, value);
	}

	/**
	 * Shipping LT (For demand) 出荷ＬＴ（需要情報用）.<p>
	 *
	 */
	public void ship_lt(double value) {
		setConstNumber(offset + 158, $ship_lt, value);
	}


	/**
	 * Customer transaction terms cd. 1 得意先取引条件ＣＤ１.<p>
	 *
	 */
	public String cst_tterm_cd1() {
		return getConstString(offset + 159, $cst_tterm_cd1);
	}

	/**
	 * Customer transaction terms cd. 1 得意先取引条件ＣＤ１.<p>
	 *
	 */
	public void cst_tterm_cd1(String value) {
		setConstString(offset + 159, $cst_tterm_cd1, value);
	}


	/**
	 * Customer transaction terms name 1 得意先取引条件名１.<p>
	 *
	 */
	public String cst_tterm_nm1() {
		return getConstString(offset + 160, $cst_tterm_nm1);
	}

	/**
	 * Customer transaction terms name 1 得意先取引条件名１.<p>
	 *
	 */
	public void cst_tterm_nm1(String value) {
		setConstString(offset + 160, $cst_tterm_nm1, value);
	}


	/**
	 * Customer transaction terms cd. 2 得意先取引条件ＣＤ２.<p>
	 *
	 */
	public String cst_tterm_cd2() {
		return getConstString(offset + 161, $cst_tterm_cd2);
	}

	/**
	 * Customer transaction terms cd. 2 得意先取引条件ＣＤ２.<p>
	 *
	 */
	public void cst_tterm_cd2(String value) {
		setConstString(offset + 161, $cst_tterm_cd2, value);
	}


	/**
	 * Customer transaction terms name 2 得意先取引条件名２.<p>
	 *
	 */
	public String cst_tterm_nm2() {
		return getConstString(offset + 162, $cst_tterm_nm2);
	}

	/**
	 * Customer transaction terms name 2 得意先取引条件名２.<p>
	 *
	 */
	public void cst_tterm_nm2(String value) {
		setConstString(offset + 162, $cst_tterm_nm2, value);
	}


	/**
	 * Customer transaction terms cd. 3 得意先取引条件ＣＤ３.<p>
	 *
	 */
	public String cst_tterm_cd3() {
		return getConstString(offset + 163, $cst_tterm_cd3);
	}

	/**
	 * Customer transaction terms cd. 3 得意先取引条件ＣＤ３.<p>
	 *
	 */
	public void cst_tterm_cd3(String value) {
		setConstString(offset + 163, $cst_tterm_cd3, value);
	}


	/**
	 * Customer transaction terms name 3 得意先取引条件名３.<p>
	 *
	 */
	public String cst_tterm_nm3() {
		return getConstString(offset + 164, $cst_tterm_nm3);
	}

	/**
	 * Customer transaction terms name 3 得意先取引条件名３.<p>
	 *
	 */
	public void cst_tterm_nm3(String value) {
		setConstString(offset + 164, $cst_tterm_nm3, value);
	}


	/**
	 * Sales analysis cd. 1 販売分析ＣＤ１.<p>
	 *
	 */
	public String sls_anly_cd1() {
		return getConstString(offset + 165, $sls_anly_cd1);
	}

	/**
	 * Sales analysis cd. 1 販売分析ＣＤ１.<p>
	 *
	 */
	public void sls_anly_cd1(String value) {
		setConstString(offset + 165, $sls_anly_cd1, value);
	}


	/**
	 * Sales analysis name 1 販売分析名１.<p>
	 *
	 */
	public String sls_anly_nm1() {
		return getConstString(offset + 166, $sls_anly_nm1);
	}

	/**
	 * Sales analysis name 1 販売分析名１.<p>
	 *
	 */
	public void sls_anly_nm1(String value) {
		setConstString(offset + 166, $sls_anly_nm1, value);
	}


	/**
	 * Sales analysis cd. 2 販売分析ＣＤ２.<p>
	 *
	 */
	public String sls_anly_cd2() {
		return getConstString(offset + 167, $sls_anly_cd2);
	}

	/**
	 * Sales analysis cd. 2 販売分析ＣＤ２.<p>
	 *
	 */
	public void sls_anly_cd2(String value) {
		setConstString(offset + 167, $sls_anly_cd2, value);
	}


	/**
	 * Sales analysis name 2 販売分析名２.<p>
	 *
	 */
	public String sls_anly_nm2() {
		return getConstString(offset + 168, $sls_anly_nm2);
	}

	/**
	 * Sales analysis name 2 販売分析名２.<p>
	 *
	 */
	public void sls_anly_nm2(String value) {
		setConstString(offset + 168, $sls_anly_nm2, value);
	}


	/**
	 * Sales analysis cd. 3 販売分析ＣＤ３.<p>
	 *
	 */
	public String sls_anly_cd3() {
		return getConstString(offset + 169, $sls_anly_cd3);
	}

	/**
	 * Sales analysis cd. 3 販売分析ＣＤ３.<p>
	 *
	 */
	public void sls_anly_cd3(String value) {
		setConstString(offset + 169, $sls_anly_cd3, value);
	}


	/**
	 * Sales analysis name 3 販売分析名３.<p>
	 *
	 */
	public String sls_anly_nm3() {
		return getConstString(offset + 170, $sls_anly_nm3);
	}

	/**
	 * Sales analysis name 3 販売分析名３.<p>
	 *
	 */
	public void sls_anly_nm3(String value) {
		setConstString(offset + 170, $sls_anly_nm3, value);
	}


	/**
	 * Report issue type (Customer) 帳票発行区分（得意先）.<p>
	 *
	 */
	public String cst_prnt_typ() {
		return getConstString(offset + 171, $cst_prnt_typ);
	}

	/**
	 * Report issue type (Customer) 帳票発行区分（得意先）.<p>
	 *
	 */
	public void cst_prnt_typ(String value) {
		setConstString(offset + 171, $cst_prnt_typ, value);
	}


	/**
	 * Report issue type name (Customer) 帳票発行区分名（得意先）.<p>
	 *
	 */
	public String cst_prnt_typ_nm() {
		return getConstString(offset + 172, $cst_prnt_typ_nm);
	}

	/**
	 * Report issue type name (Customer) 帳票発行区分名（得意先）.<p>
	 *
	 */
	public void cst_prnt_typ_nm(String value) {
		setConstString(offset + 172, $cst_prnt_typ_nm, value);
	}


	/**
	 * Prohibit mixed distribution group 物流グループ混在不可.<p>
	 *
	 */
	public boolean not_lg_mix_flg() {
		return getConstBoolean(offset + 173, $not_lg_mix_flg);
	}

	/**
	 * Prohibit mixed distribution group 物流グループ混在不可.<p>
	 *
	 */
	public void not_lg_mix_flg(boolean value) {
		setConstBoolean(offset + 173, $not_lg_mix_flg, value);
	}


	/**
	 * Prohibit mixed lots ロット混在不可.<p>
	 *
	 */
	public boolean not_lot_mix_flg() {
		return getConstBoolean(offset + 174, $not_lot_mix_flg);
	}

	/**
	 * Prohibit mixed lots ロット混在不可.<p>
	 *
	 */
	public void not_lot_mix_flg(boolean value) {
		setConstBoolean(offset + 174, $not_lot_mix_flg, value);
	}


	/**
	 * Prohibit mixed sublots サブロット混在不可.<p>
	 *
	 */
	public boolean not_sublot_mix_flg() {
		return getConstBoolean(offset + 175, $not_sublot_mix_flg);
	}

	/**
	 * Prohibit mixed sublots サブロット混在不可.<p>
	 *
	 */
	public void not_sublot_mix_flg(boolean value) {
		setConstBoolean(offset + 175, $not_sublot_mix_flg, value);
	}


	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public String bcst_cd() {
		return getConstString(offset + 176, $bcst_cd);
	}

	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public void bcst_cd(String value) {
		setConstString(offset + 176, $bcst_cd, value);
	}


	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public String bcst_nm() {
		return getConstString(offset + 177, $bcst_nm);
	}

	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public void bcst_nm(String value) {
		setConstString(offset + 177, $bcst_nm, value);
	}


	/**
	 * Report issue type (AR customer) 帳票発行区分（売掛先）.<p>
	 *
	 */
	public String acst_prnt_typ() {
		return getConstString(offset + 178, $acst_prnt_typ);
	}

	/**
	 * Report issue type (AR customer) 帳票発行区分（売掛先）.<p>
	 *
	 */
	public void acst_prnt_typ(String value) {
		setConstString(offset + 178, $acst_prnt_typ, value);
	}


	/**
	 * Report issue type name (AR customer) 帳票発行区分名（売掛先）.<p>
	 *
	 */
	public String acst_prnt_typ_nm() {
		return getConstString(offset + 179, $acst_prnt_typ_nm);
	}

	/**
	 * Report issue type name (AR customer) 帳票発行区分名（売掛先）.<p>
	 *
	 */
	public void acst_prnt_typ_nm(String value) {
		setConstString(offset + 179, $acst_prnt_typ_nm, value);
	}


	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public String rcst_cd() {
		return getConstString(offset + 180, $rcst_cd);
	}

	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public void rcst_cd(String value) {
		setConstString(offset + 180, $rcst_cd, value);
	}


	/**
	 * Payer name 入金先名.<p>
	 *
	 */
	public String rcst_nm() {
		return getConstString(offset + 181, $rcst_nm);
	}

	/**
	 * Payer name 入金先名.<p>
	 *
	 */
	public void rcst_nm(String value) {
		setConstString(offset + 181, $rcst_nm, value);
	}


	/**
	 * AR credit managed BP cd. 債権与信管理先ＣＤ.<p>
	 *
	 */
	public String ar_cred_cd() {
		return getConstString(offset + 182, $ar_cred_cd);
	}

	/**
	 * AR credit managed BP cd. 債権与信管理先ＣＤ.<p>
	 *
	 */
	public void ar_cred_cd(String value) {
		setConstString(offset + 182, $ar_cred_cd, value);
	}


	/**
	 * AR credit managed BP name 債権与信管理先名.<p>
	 *
	 */
	public String ar_cred_nm() {
		return getConstString(offset + 183, $ar_cred_nm);
	}

	/**
	 * AR credit managed BP name 債権与信管理先名.<p>
	 *
	 */
	public void ar_cred_nm(String value) {
		setConstString(offset + 183, $ar_cred_nm, value);
	}


	/**
	 * Billing dept. type 請求部門区分.<p>
	 *
	 */
	public String bill_dpt_typ() {
		return getConstString(offset + 184, $bill_dpt_typ);
	}

	/**
	 * Billing dept. type 請求部門区分.<p>
	 *
	 */
	public void bill_dpt_typ(String value) {
		setConstString(offset + 184, $bill_dpt_typ, value);
	}


	/**
	 * Billing dept. type name 請求部門区分名.<p>
	 *
	 */
	public String bill_dpt_typ_nm() {
		return getConstString(offset + 185, $bill_dpt_typ_nm);
	}

	/**
	 * Billing dept. type name 請求部門区分名.<p>
	 *
	 */
	public void bill_dpt_typ_nm(String value) {
		setConstString(offset + 185, $bill_dpt_typ_nm, value);
	}


	/**
	 * Billing customer dept. in charge cd. 請求先担当部門ＣＤ.<p>
	 *
	 */
	public String bcst_dpt_cd() {
		return getConstString(offset + 186, $bcst_dpt_cd);
	}

	/**
	 * Billing customer dept. in charge cd. 請求先担当部門ＣＤ.<p>
	 *
	 */
	public void bcst_dpt_cd(String value) {
		setConstString(offset + 186, $bcst_dpt_cd, value);
	}


	/**
	 * Billing customer dept. in charge name 請求先担当部門名.<p>
	 *
	 */
	public String bcst_dpt_nm() {
		return getConstString(offset + 187, $bcst_dpt_nm);
	}

	/**
	 * Billing customer dept. in charge name 請求先担当部門名.<p>
	 *
	 */
	public void bcst_dpt_nm(String value) {
		setConstString(offset + 187, $bcst_dpt_nm, value);
	}


	/**
	 * Billing customer dept. in charge cd. 請求先担当部門ＣＤ.<p>
	 *
	 */
	public String check_bcst_dpt_cd() {
		return getConstString(offset + 188, $check_bcst_dpt_cd);
	}

	/**
	 * Billing customer dept. in charge cd. 請求先担当部門ＣＤ.<p>
	 *
	 */
	public void check_bcst_dpt_cd(String value) {
		setConstString(offset + 188, $check_bcst_dpt_cd, value);
	}


	/**
	 * Billing closing type 請求締処理区分.<p>
	 *
	 */
	public String bill_cl_typ() {
		return getConstString(offset + 189, $bill_cl_typ);
	}

	/**
	 * Billing closing type 請求締処理区分.<p>
	 *
	 */
	public void bill_cl_typ(String value) {
		setConstString(offset + 189, $bill_cl_typ, value);
	}


	/**
	 * Billing closing type name 請求締処理区分名.<p>
	 *
	 */
	public String bill_cl_typ_nm() {
		return getConstString(offset + 190, $bill_cl_typ_nm);
	}

	/**
	 * Billing closing type name 請求締処理区分名.<p>
	 *
	 */
	public void bill_cl_typ_nm(String value) {
		setConstString(offset + 190, $bill_cl_typ_nm, value);
	}


	/**
	 * Billing closing day 1 請求締日１.<p>
	 *
	 */
	public MCNumber bill_cl_day1() {
		return getConstNumber(offset + 191, $bill_cl_day1);
	}

	/**
	 * Billing closing day 1 請求締日１.<p>
	 *
	 */
	public void bill_cl_day1(MCNumber value) {
		setConstNumber(offset + 191, $bill_cl_day1, value);
	}

	/**
	 * Billing closing day 1 請求締日１.<p>
	 *
	 */
	public void bill_cl_day1(int value) {
		setConstNumber(offset + 191, $bill_cl_day1, value);
	}

	/**
	 * Billing closing day 1 請求締日１.<p>
	 *
	 */
	public void bill_cl_day1(long value) {
		setConstNumber(offset + 191, $bill_cl_day1, value);
	}

	/**
	 * Billing closing day 1 請求締日１.<p>
	 *
	 */
	public void bill_cl_day1(float value) {
		setConstNumber(offset + 191, $bill_cl_day1, value);
	}

	/**
	 * Billing closing day 1 請求締日１.<p>
	 *
	 */
	public void bill_cl_day1(double value) {
		setConstNumber(offset + 191, $bill_cl_day1, value);
	}


	/**
	 * Billing closing day 2 請求締日２.<p>
	 *
	 */
	public MCNumber bill_cl_day2() {
		return getConstNumber(offset + 192, $bill_cl_day2);
	}

	/**
	 * Billing closing day 2 請求締日２.<p>
	 *
	 */
	public void bill_cl_day2(MCNumber value) {
		setConstNumber(offset + 192, $bill_cl_day2, value);
	}

	/**
	 * Billing closing day 2 請求締日２.<p>
	 *
	 */
	public void bill_cl_day2(int value) {
		setConstNumber(offset + 192, $bill_cl_day2, value);
	}

	/**
	 * Billing closing day 2 請求締日２.<p>
	 *
	 */
	public void bill_cl_day2(long value) {
		setConstNumber(offset + 192, $bill_cl_day2, value);
	}

	/**
	 * Billing closing day 2 請求締日２.<p>
	 *
	 */
	public void bill_cl_day2(float value) {
		setConstNumber(offset + 192, $bill_cl_day2, value);
	}

	/**
	 * Billing closing day 2 請求締日２.<p>
	 *
	 */
	public void bill_cl_day2(double value) {
		setConstNumber(offset + 192, $bill_cl_day2, value);
	}


	/**
	 * Billing closing day 3 請求締日３.<p>
	 *
	 */
	public MCNumber bill_cl_day3() {
		return getConstNumber(offset + 193, $bill_cl_day3);
	}

	/**
	 * Billing closing day 3 請求締日３.<p>
	 *
	 */
	public void bill_cl_day3(MCNumber value) {
		setConstNumber(offset + 193, $bill_cl_day3, value);
	}

	/**
	 * Billing closing day 3 請求締日３.<p>
	 *
	 */
	public void bill_cl_day3(int value) {
		setConstNumber(offset + 193, $bill_cl_day3, value);
	}

	/**
	 * Billing closing day 3 請求締日３.<p>
	 *
	 */
	public void bill_cl_day3(long value) {
		setConstNumber(offset + 193, $bill_cl_day3, value);
	}

	/**
	 * Billing closing day 3 請求締日３.<p>
	 *
	 */
	public void bill_cl_day3(float value) {
		setConstNumber(offset + 193, $bill_cl_day3, value);
	}

	/**
	 * Billing closing day 3 請求締日３.<p>
	 *
	 */
	public void bill_cl_day3(double value) {
		setConstNumber(offset + 193, $bill_cl_day3, value);
	}


	/**
	 * Billing closing day 4 請求締日４.<p>
	 *
	 */
	public MCNumber bill_cl_day4() {
		return getConstNumber(offset + 194, $bill_cl_day4);
	}

	/**
	 * Billing closing day 4 請求締日４.<p>
	 *
	 */
	public void bill_cl_day4(MCNumber value) {
		setConstNumber(offset + 194, $bill_cl_day4, value);
	}

	/**
	 * Billing closing day 4 請求締日４.<p>
	 *
	 */
	public void bill_cl_day4(int value) {
		setConstNumber(offset + 194, $bill_cl_day4, value);
	}

	/**
	 * Billing closing day 4 請求締日４.<p>
	 *
	 */
	public void bill_cl_day4(long value) {
		setConstNumber(offset + 194, $bill_cl_day4, value);
	}

	/**
	 * Billing closing day 4 請求締日４.<p>
	 *
	 */
	public void bill_cl_day4(float value) {
		setConstNumber(offset + 194, $bill_cl_day4, value);
	}

	/**
	 * Billing closing day 4 請求締日４.<p>
	 *
	 */
	public void bill_cl_day4(double value) {
		setConstNumber(offset + 194, $bill_cl_day4, value);
	}


	/**
	 * Billing closing day 5 請求締日５.<p>
	 *
	 */
	public MCNumber bill_cl_day5() {
		return getConstNumber(offset + 195, $bill_cl_day5);
	}

	/**
	 * Billing closing day 5 請求締日５.<p>
	 *
	 */
	public void bill_cl_day5(MCNumber value) {
		setConstNumber(offset + 195, $bill_cl_day5, value);
	}

	/**
	 * Billing closing day 5 請求締日５.<p>
	 *
	 */
	public void bill_cl_day5(int value) {
		setConstNumber(offset + 195, $bill_cl_day5, value);
	}

	/**
	 * Billing closing day 5 請求締日５.<p>
	 *
	 */
	public void bill_cl_day5(long value) {
		setConstNumber(offset + 195, $bill_cl_day5, value);
	}

	/**
	 * Billing closing day 5 請求締日５.<p>
	 *
	 */
	public void bill_cl_day5(float value) {
		setConstNumber(offset + 195, $bill_cl_day5, value);
	}

	/**
	 * Billing closing day 5 請求締日５.<p>
	 *
	 */
	public void bill_cl_day5(double value) {
		setConstNumber(offset + 195, $bill_cl_day5, value);
	}


	/**
	 * Billing tax calculation 請求税計算.<p>
	 *
	 */
	public boolean tax_on_bill_flg() {
		return getConstBoolean(offset + 196, $tax_on_bill_flg);
	}

	/**
	 * Billing tax calculation 請求税計算.<p>
	 *
	 */
	public void tax_on_bill_flg(boolean value) {
		setConstBoolean(offset + 196, $tax_on_bill_flg, value);
	}


	/**
	 * Billing tax rounding type 請求税額端数処理区分.<p>
	 *
	 */
	public String bill_tax_rnd_typ() {
		return getConstString(offset + 197, $bill_tax_rnd_typ);
	}

	/**
	 * Billing tax rounding type 請求税額端数処理区分.<p>
	 *
	 */
	public void bill_tax_rnd_typ(String value) {
		setConstString(offset + 197, $bill_tax_rnd_typ, value);
	}


	/**
	 * Billing tax rounding type 請求税額端数処理区分名.<p>
	 *
	 */
	public String bill_tax_rnd_typ_nm() {
		return getConstString(offset + 198, $bill_tax_rnd_typ_nm);
	}

	/**
	 * Billing tax rounding type 請求税額端数処理区分名.<p>
	 *
	 */
	public void bill_tax_rnd_typ_nm(String value) {
		setConstString(offset + 198, $bill_tax_rnd_typ_nm, value);
	}


	/**
	 * Delayed days (Billing closing day) 請求締遅延日数.<p>
	 *
	 */
	public MCNumber bill_cl_delay_days() {
		return getConstNumber(offset + 199, $bill_cl_delay_days);
	}

	/**
	 * Delayed days (Billing closing day) 請求締遅延日数.<p>
	 *
	 */
	public void bill_cl_delay_days(MCNumber value) {
		setConstNumber(offset + 199, $bill_cl_delay_days, value);
	}

	/**
	 * Delayed days (Billing closing day) 請求締遅延日数.<p>
	 *
	 */
	public void bill_cl_delay_days(int value) {
		setConstNumber(offset + 199, $bill_cl_delay_days, value);
	}

	/**
	 * Delayed days (Billing closing day) 請求締遅延日数.<p>
	 *
	 */
	public void bill_cl_delay_days(long value) {
		setConstNumber(offset + 199, $bill_cl_delay_days, value);
	}

	/**
	 * Delayed days (Billing closing day) 請求締遅延日数.<p>
	 *
	 */
	public void bill_cl_delay_days(float value) {
		setConstNumber(offset + 199, $bill_cl_delay_days, value);
	}

	/**
	 * Delayed days (Billing closing day) 請求締遅延日数.<p>
	 *
	 */
	public void bill_cl_delay_days(double value) {
		setConstNumber(offset + 199, $bill_cl_delay_days, value);
	}


	/**
	 * Billing closing before/after type 請求締前後区分.<p>
	 *
	 */
	public String bill_cl_ba_typ() {
		return getConstString(offset + 200, $bill_cl_ba_typ);
	}

	/**
	 * Billing closing before/after type 請求締前後区分.<p>
	 *
	 */
	public void bill_cl_ba_typ(String value) {
		setConstString(offset + 200, $bill_cl_ba_typ, value);
	}


	/**
	 * Before/after billing closing type name 請求締前後区分名.<p>
	 *
	 */
	public String bill_cl_ba_typ_nm() {
		return getConstString(offset + 201, $bill_cl_ba_typ_nm);
	}

	/**
	 * Before/after billing closing type name 請求締前後区分名.<p>
	 *
	 */
	public void bill_cl_ba_typ_nm(String value) {
		setConstString(offset + 201, $bill_cl_ba_typ_nm, value);
	}


	/**
	 * Billing customer calendar cd. 請求先カレンダＣＤ.<p>
	 *
	 */
	public String bill_cal_cd() {
		return getConstString(offset + 202, $bill_cal_cd);
	}

	/**
	 * Billing customer calendar cd. 請求先カレンダＣＤ.<p>
	 *
	 */
	public void bill_cal_cd(String value) {
		setConstString(offset + 202, $bill_cal_cd, value);
	}


	/**
	 * Billing customer calendar name 請求先カレンダ名.<p>
	 *
	 */
	public String bill_cal_nm() {
		return getConstString(offset + 203, $bill_cal_nm);
	}

	/**
	 * Billing customer calendar name 請求先カレンダ名.<p>
	 *
	 */
	public void bill_cal_nm(String value) {
		setConstString(offset + 203, $bill_cal_nm, value);
	}


	/**
	 * Payment receipt schedule before/after type 入金予定前後区分.<p>
	 *
	 */
	public String rcv_ba_typ() {
		return getConstString(offset + 204, $rcv_ba_typ);
	}

	/**
	 * Payment receipt schedule before/after type 入金予定前後区分.<p>
	 *
	 */
	public void rcv_ba_typ(String value) {
		setConstString(offset + 204, $rcv_ba_typ, value);
	}


	/**
	 * Payment receipt schedule before/after type name 入金予定前後区分名.<p>
	 *
	 */
	public String rcv_ba_typ_nm() {
		return getConstString(offset + 205, $rcv_ba_typ_nm);
	}

	/**
	 * Payment receipt schedule before/after type name 入金予定前後区分名.<p>
	 *
	 */
	public void rcv_ba_typ_nm(String value) {
		setConstString(offset + 205, $rcv_ba_typ_nm, value);
	}


	/**
	 * Details auto-reconciliation 自動明細消込.<p>
	 *
	 */
	public boolean auto_line_appl_flg() {
		return getConstBoolean(offset + 206, $auto_line_appl_flg);
	}

	/**
	 * Details auto-reconciliation 自動明細消込.<p>
	 *
	 */
	public void auto_line_appl_flg(boolean value) {
		setConstBoolean(offset + 206, $auto_line_appl_flg, value);
	}


	/**
	 * Sales temporary unit price closing 売上仮単価締.<p>
	 *
	 */
	public boolean sls_interim_cl_flg() {
		return getConstBoolean(offset + 207, $sls_interim_cl_flg);
	}

	/**
	 * Sales temporary unit price closing 売上仮単価締.<p>
	 *
	 */
	public void sls_interim_cl_flg(boolean value) {
		setConstBoolean(offset + 207, $sls_interim_cl_flg, value);
	}


	/**
	 * AR offset group cd. 債権相殺グループＣＤ.<p>
	 *
	 */
	public String ar_setoff_grp_cd() {
		return getConstString(offset + 208, $ar_setoff_grp_cd);
	}

	/**
	 * AR offset group cd. 債権相殺グループＣＤ.<p>
	 *
	 */
	public void ar_setoff_grp_cd(String value) {
		setConstString(offset + 208, $ar_setoff_grp_cd, value);
	}


	/**
	 * AR offset group name 債権相殺グループ名.<p>
	 *
	 */
	public String ar_setoff_grp_nm() {
		return getConstString(offset + 209, $ar_setoff_grp_nm);
	}

	/**
	 * AR offset group name 債権相殺グループ名.<p>
	 *
	 */
	public void ar_setoff_grp_nm(String value) {
		setConstString(offset + 209, $ar_setoff_grp_nm, value);
	}


	/**
	 * Report issue type (Billing customer) 帳票発行区分（請求先）.<p>
	 *
	 */
	public String bcst_prnt_typ() {
		return getConstString(offset + 210, $bcst_prnt_typ);
	}

	/**
	 * Report issue type (Billing customer) 帳票発行区分（請求先）.<p>
	 *
	 */
	public void bcst_prnt_typ(String value) {
		setConstString(offset + 210, $bcst_prnt_typ, value);
	}


	/**
	 * Report issue type name (Billing customer) 帳票発行区分名（請求先）.<p>
	 *
	 */
	public String bcst_prnt_typ_nm() {
		return getConstString(offset + 211, $bcst_prnt_typ_nm);
	}

	/**
	 * Report issue type name (Billing customer) 帳票発行区分名（請求先）.<p>
	 *
	 */
	public void bcst_prnt_typ_nm(String value) {
		setConstString(offset + 211, $bcst_prnt_typ_nm, value);
	}


	/**
	 * Invoice send-to zip code 請求書送付郵便番号.<p>
	 *
	 */
	public String bill_zip_cd() {
		return getConstString(offset + 212, $bill_zip_cd);
	}

	/**
	 * Invoice send-to zip code 請求書送付郵便番号.<p>
	 *
	 */
	public void bill_zip_cd(String value) {
		setConstString(offset + 212, $bill_zip_cd, value);
	}


	/**
	 * Invoice send-to address 1 請求書送付住所１.<p>
	 *
	 */
	public String bill_addr1() {
		return getConstString(offset + 213, $bill_addr1);
	}

	/**
	 * Invoice send-to address 1 請求書送付住所１.<p>
	 *
	 */
	public void bill_addr1(String value) {
		setConstString(offset + 213, $bill_addr1, value);
	}


	/**
	 * Invoice send-to address 2 請求書送付住所２.<p>
	 *
	 */
	public String bill_addr2() {
		return getConstString(offset + 214, $bill_addr2);
	}

	/**
	 * Invoice send-to address 2 請求書送付住所２.<p>
	 *
	 */
	public void bill_addr2(String value) {
		setConstString(offset + 214, $bill_addr2, value);
	}


	/**
	 * Invoice send-to address 3 請求書送付住所３.<p>
	 *
	 */
	public String bill_addr3() {
		return getConstString(offset + 215, $bill_addr3);
	}

	/**
	 * Invoice send-to address 3 請求書送付住所３.<p>
	 *
	 */
	public void bill_addr3(String value) {
		setConstString(offset + 215, $bill_addr3, value);
	}


	/**
	 * Invoice send-to address 4 請求書送付住所４.<p>
	 *
	 */
	public String bill_addr4() {
		return getConstString(offset + 216, $bill_addr4);
	}

	/**
	 * Invoice send-to address 4 請求書送付住所４.<p>
	 *
	 */
	public void bill_addr4(String value) {
		setConstString(offset + 216, $bill_addr4, value);
	}


	/**
	 * Invoice send-to TEL 請求書送付ＴＥＬ.<p>
	 *
	 */
	public String bill_tel() {
		return getConstString(offset + 217, $bill_tel);
	}

	/**
	 * Invoice send-to TEL 請求書送付ＴＥＬ.<p>
	 *
	 */
	public void bill_tel(String value) {
		setConstString(offset + 217, $bill_tel, value);
	}


	/**
	 * Invoice destination 請求書宛先.<p>
	 *
	 */
	public String bill_bcst_nm() {
		return getConstString(offset + 218, $bill_bcst_nm);
	}

	/**
	 * Invoice destination 請求書宛先.<p>
	 *
	 */
	public void bill_bcst_nm(String value) {
		setConstString(offset + 218, $bill_bcst_nm, value);
	}


	/**
	 * Invoice send-to dept. 請求書送付部署.<p>
	 *
	 */
	public String bill_bcst_dpt() {
		return getConstString(offset + 219, $bill_bcst_dpt);
	}

	/**
	 * Invoice send-to dept. 請求書送付部署.<p>
	 *
	 */
	public void bill_bcst_dpt(String value) {
		setConstString(offset + 219, $bill_bcst_dpt, value);
	}


	/**
	 * Invoice send-to PIC 請求書送付担当者.<p>
	 *
	 */
	public String bill_bcst_psn() {
		return getConstString(offset + 220, $bill_bcst_psn);
	}

	/**
	 * Invoice send-to PIC 請求書送付担当者.<p>
	 *
	 */
	public void bill_bcst_psn(String value) {
		setConstString(offset + 220, $bill_bcst_psn, value);
	}


	/**
	 * Invoice send-to PIC honorific 請求書送付担当者敬称.<p>
	 *
	 */
	public String bill_bcst_psn_title() {
		return getConstString(offset + 221, $bill_bcst_psn_title);
	}

	/**
	 * Invoice send-to PIC honorific 請求書送付担当者敬称.<p>
	 *
	 */
	public void bill_bcst_psn_title(String value) {
		setConstString(offset + 221, $bill_bcst_psn_title, value);
	}


	/**
	 * Invoice issue type 請求書発行区分.<p>
	 *
	 */
	public String bill_prnt_typ() {
		return getConstString(offset + 222, $bill_prnt_typ);
	}

	/**
	 * Invoice issue type 請求書発行区分.<p>
	 *
	 */
	public void bill_prnt_typ(String value) {
		setConstString(offset + 222, $bill_prnt_typ, value);
	}


	/**
	 * Invoice issue type name 請求書発行区分名.<p>
	 *
	 */
	public String bill_prnt_typ_nm() {
		return getConstString(offset + 223, $bill_prnt_typ_nm);
	}

	/**
	 * Invoice issue type name 請求書発行区分名.<p>
	 *
	 */
	public void bill_prnt_typ_nm(String value) {
		setConstString(offset + 223, $bill_prnt_typ_nm, value);
	}


	/**
	 * Sales details output type 売上明細書出力区分.<p>
	 *
	 */
	public String sls_dtl_outp_typ() {
		return getConstString(offset + 224, $sls_dtl_outp_typ);
	}

	/**
	 * Sales details output type 売上明細書出力区分.<p>
	 *
	 */
	public void sls_dtl_outp_typ(String value) {
		setConstString(offset + 224, $sls_dtl_outp_typ, value);
	}


	/**
	 * Sales details output type name 売上明細書出力区分名.<p>
	 *
	 */
	public String sls_dtl_outp_typ_nm() {
		return getConstString(offset + 225, $sls_dtl_outp_typ_nm);
	}

	/**
	 * Sales details output type name 売上明細書出力区分名.<p>
	 *
	 */
	public void sls_dtl_outp_typ_nm(String value) {
		setConstString(offset + 225, $sls_dtl_outp_typ_nm, value);
	}


	/**
	 * Output invoice details 請求書明細出力.<p>
	 *
	 */
	public boolean bill_dtl_outp_flg() {
		return getConstBoolean(offset + 226, $bill_dtl_outp_flg);
	}

	/**
	 * Output invoice details 請求書明細出力.<p>
	 *
	 */
	public void bill_dtl_outp_flg(boolean value) {
		setConstBoolean(offset + 226, $bill_dtl_outp_flg, value);
	}


	/**
	 * Display balance of previous month on invoice 請求書前月残高表示.<p>
	 *
	 */
	public boolean bfw_bal_disp_flg() {
		return getConstBoolean(offset + 227, $bfw_bal_disp_flg);
	}

	/**
	 * Display balance of previous month on invoice 請求書前月残高表示.<p>
	 *
	 */
	public void bfw_bal_disp_flg(boolean value) {
		setConstBoolean(offset + 227, $bfw_bal_disp_flg, value);
	}


	/**
	 * Display advance received on invoice 請求書前受金表示.<p>
	 *
	 */
	public boolean bill_dtl_adv_flg() {
		return getConstBoolean(offset + 228, $bill_dtl_adv_flg);
	}

	/**
	 * Display advance received on invoice 請求書前受金表示.<p>
	 *
	 */
	public void bill_dtl_adv_flg(boolean value) {
		setConstBoolean(offset + 228, $bill_dtl_adv_flg, value);
	}


	/**
	 * Display payment receipt schedule in invoice 請求書入金予定表示.<p>
	 *
	 */
	public boolean bill_dtl_rcv_flg() {
		return getConstBoolean(offset + 229, $bill_dtl_rcv_flg);
	}

	/**
	 * Display payment receipt schedule in invoice 請求書入金予定表示.<p>
	 *
	 */
	public void bill_dtl_rcv_flg(boolean value) {
		setConstBoolean(offset + 229, $bill_dtl_rcv_flg, value);
	}


	/**
	 * Invoice details subtotal type 請求書明細小計区分.<p>
	 *
	 */
	public String bill_dtl_subttl_typ() {
		return getConstString(offset + 230, $bill_dtl_subttl_typ);
	}

	/**
	 * Invoice details subtotal type 請求書明細小計区分.<p>
	 *
	 */
	public void bill_dtl_subttl_typ(String value) {
		setConstString(offset + 230, $bill_dtl_subttl_typ, value);
	}


	/**
	 * Invoice details subtotal type name 請求書明細小計区分名.<p>
	 *
	 */
	public String bill_dtl_subttl_typ_nm() {
		return getConstString(offset + 231, $bill_dtl_subttl_typ_nm);
	}

	/**
	 * Invoice details subtotal type name 請求書明細小計区分名.<p>
	 *
	 */
	public void bill_dtl_subttl_typ_nm(String value) {
		setConstString(offset + 231, $bill_dtl_subttl_typ_nm, value);
	}


	/**
	 * Invoice details page break type 請求書明細改頁区分.<p>
	 *
	 */
	public String bill_dtl_brk_typ() {
		return getConstString(offset + 232, $bill_dtl_brk_typ);
	}

	/**
	 * Invoice details page break type 請求書明細改頁区分.<p>
	 *
	 */
	public void bill_dtl_brk_typ(String value) {
		setConstString(offset + 232, $bill_dtl_brk_typ, value);
	}


	/**
	 * Invoice details page break type name 請求書明細改頁区分名.<p>
	 *
	 */
	public String bill_dtl_brk_typ_nm() {
		return getConstString(offset + 233, $bill_dtl_brk_typ_nm);
	}

	/**
	 * Invoice details page break type name 請求書明細改頁区分名.<p>
	 *
	 */
	public void bill_dtl_brk_typ_nm(String value) {
		setConstString(offset + 233, $bill_dtl_brk_typ_nm, value);
	}


	/**
	 * Invoice details sorting order type 請求書明細並順区分.<p>
	 *
	 */
	public String bill_dtl_sort_typ() {
		return getConstString(offset + 234, $bill_dtl_sort_typ);
	}

	/**
	 * Invoice details sorting order type 請求書明細並順区分.<p>
	 *
	 */
	public void bill_dtl_sort_typ(String value) {
		setConstString(offset + 234, $bill_dtl_sort_typ, value);
	}


	/**
	 * Invoice details sort order type name 請求書明細並順区分名.<p>
	 *
	 */
	public String bill_dtl_sort_typ_nm() {
		return getConstString(offset + 235, $bill_dtl_sort_typ_nm);
	}

	/**
	 * Invoice details sort order type name 請求書明細並順区分名.<p>
	 *
	 */
	public void bill_dtl_sort_typ_nm(String value) {
		setConstString(offset + 235, $bill_dtl_sort_typ_nm, value);
	}


	/**
	 * Invoice cancel slip display type 請求書取消伝票表示区分.<p>
	 *
	 */
	public String bill_can_slip_typ() {
		return getConstString(offset + 236, $bill_can_slip_typ);
	}

	/**
	 * Invoice cancel slip display type 請求書取消伝票表示区分.<p>
	 *
	 */
	public void bill_can_slip_typ(String value) {
		setConstString(offset + 236, $bill_can_slip_typ, value);
	}


	/**
	 * Invoice cancel slip display type name 請求書取消伝票表示区分名.<p>
	 *
	 */
	public String bill_can_slip_typ_nm() {
		return getConstString(offset + 237, $bill_can_slip_typ_nm);
	}

	/**
	 * Invoice cancel slip display type name 請求書取消伝票表示区分名.<p>
	 *
	 */
	public void bill_can_slip_typ_nm(String value) {
		setConstString(offset + 237, $bill_can_slip_typ_nm, value);
	}


	/**
	 * Payment person name 振込人名.<p>
	 *
	 */
	public String xfr_psn() {
		return getConstString(offset + 238, $xfr_psn);
	}

	/**
	 * Payment person name 振込人名.<p>
	 *
	 */
	public void xfr_psn(String value) {
		setConstString(offset + 238, $xfr_psn, value);
	}


	/**
	 * For auto-reconciliation 入金自動消込対象.<p>
	 *
	 */
	public boolean rcv_auto_appl_tgt_flg() {
		return getConstBoolean(offset + 239, $rcv_auto_appl_tgt_flg);
	}

	/**
	 * For auto-reconciliation 入金自動消込対象.<p>
	 *
	 */
	public void rcv_auto_appl_tgt_flg(boolean value) {
		setConstBoolean(offset + 239, $rcv_auto_appl_tgt_flg, value);
	}


	/**
	 * Match amount 金額考慮.<p>
	 *
	 */
	public boolean rcv_amt_match_flg() {
		return getConstBoolean(offset + 240, $rcv_amt_match_flg);
	}

	/**
	 * Match amount 金額考慮.<p>
	 *
	 */
	public void rcv_amt_match_flg(boolean value) {
		setConstBoolean(offset + 240, $rcv_amt_match_flg, value);
	}


	/**
	 * Include payment option 金種考慮.<p>
	 *
	 */
	public boolean ar_sttl_typ_match_flg() {
		return getConstBoolean(offset + 241, $ar_sttl_typ_match_flg);
	}

	/**
	 * Include payment option 金種考慮.<p>
	 *
	 */
	public void ar_sttl_typ_match_flg(boolean value) {
		setConstBoolean(offset + 241, $ar_sttl_typ_match_flg, value);
	}


	/**
	 * Fee calculation 手数料計算.<p>
	 *
	 */
	public boolean calc_com_paid_flg() {
		return getConstBoolean(offset + 242, $calc_com_paid_flg);
	}

	/**
	 * Fee calculation 手数料計算.<p>
	 *
	 */
	public void calc_com_paid_flg(boolean value) {
		setConstBoolean(offset + 242, $calc_com_paid_flg, value);
	}


	/**
	 * Delayed days (Auto-reconciliation base date) 自動消込基準日遅延日数.<p>
	 *
	 */
	public MCNumber auto_appl_delay_days() {
		return getConstNumber(offset + 243, $auto_appl_delay_days);
	}

	/**
	 * Delayed days (Auto-reconciliation base date) 自動消込基準日遅延日数.<p>
	 *
	 */
	public void auto_appl_delay_days(MCNumber value) {
		setConstNumber(offset + 243, $auto_appl_delay_days, value);
	}

	/**
	 * Delayed days (Auto-reconciliation base date) 自動消込基準日遅延日数.<p>
	 *
	 */
	public void auto_appl_delay_days(int value) {
		setConstNumber(offset + 243, $auto_appl_delay_days, value);
	}

	/**
	 * Delayed days (Auto-reconciliation base date) 自動消込基準日遅延日数.<p>
	 *
	 */
	public void auto_appl_delay_days(long value) {
		setConstNumber(offset + 243, $auto_appl_delay_days, value);
	}

	/**
	 * Delayed days (Auto-reconciliation base date) 自動消込基準日遅延日数.<p>
	 *
	 */
	public void auto_appl_delay_days(float value) {
		setConstNumber(offset + 243, $auto_appl_delay_days, value);
	}

	/**
	 * Delayed days (Auto-reconciliation base date) 自動消込基準日遅延日数.<p>
	 *
	 */
	public void auto_appl_delay_days(double value) {
		setConstNumber(offset + 243, $auto_appl_delay_days, value);
	}


	/**
	 * Report issue type (Payer) 帳票発行区分（入金先）.<p>
	 *
	 */
	public String rcst_prnt_typ() {
		return getConstString(offset + 244, $rcst_prnt_typ);
	}

	/**
	 * Report issue type (Payer) 帳票発行区分（入金先）.<p>
	 *
	 */
	public void rcst_prnt_typ(String value) {
		setConstString(offset + 244, $rcst_prnt_typ, value);
	}


	/**
	 * Report issue type name (Payer) 帳票発行区分名（入金先）.<p>
	 *
	 */
	public String rcst_prnt_typ_nm() {
		return getConstString(offset + 245, $rcst_prnt_typ_nm);
	}

	/**
	 * Report issue type name (Payer) 帳票発行区分名（入金先）.<p>
	 *
	 */
	public void rcst_prnt_typ_nm(String value) {
		setConstString(offset + 245, $rcst_prnt_typ_nm, value);
	}


	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public String lg_grp_cd() {
		return getConstString(offset + 246, $lg_grp_cd);
	}

	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public void lg_grp_cd(String value) {
		setConstString(offset + 246, $lg_grp_cd, value);
	}


	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public String lg_grp_nm() {
		return getConstString(offset + 247, $lg_grp_nm);
	}

	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public void lg_grp_nm(String value) {
		setConstString(offset + 247, $lg_grp_nm, value);
	}


	/**
	 * Miscellaneous delivery destination 納品先諸口.<p>
	 *
	 */
	public boolean dlv_sundry_flg() {
		return getConstBoolean(offset + 248, $dlv_sundry_flg);
	}

	/**
	 * Miscellaneous delivery destination 納品先諸口.<p>
	 *
	 */
	public void dlv_sundry_flg(boolean value) {
		setConstBoolean(offset + 248, $dlv_sundry_flg, value);
	}


	/**
	 * Receiving point 配送先.<p>
	 *
	 */
	public boolean tdlv_flg() {
		return getConstBoolean(offset + 249, $tdlv_flg);
	}

	/**
	 * Receiving point 配送先.<p>
	 *
	 */
	public void tdlv_flg(boolean value) {
		setConstBoolean(offset + 249, $tdlv_flg, value);
	}


	/**
	 * Receiving point 配送先.<p>
	 *
	 */
	public boolean org_tdlv_flg() {
		return getConstBoolean(offset + 250, $org_tdlv_flg);
	}

	/**
	 * Receiving point 配送先.<p>
	 *
	 */
	public void org_tdlv_flg(boolean value) {
		setConstBoolean(offset + 250, $org_tdlv_flg, value);
	}


	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public String via_dlv_typ() {
		return getConstString(offset + 251, $via_dlv_typ);
	}

	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public void via_dlv_typ(String value) {
		setConstString(offset + 251, $via_dlv_typ, value);
	}


	/**
	 * Receiving point stopover name 配送先経由区分名.<p>
	 *
	 */
	public String via_dlv_typ_nm() {
		return getConstString(offset + 252, $via_dlv_typ_nm);
	}

	/**
	 * Receiving point stopover name 配送先経由区分名.<p>
	 *
	 */
	public void via_dlv_typ_nm(String value) {
		setConstString(offset + 252, $via_dlv_typ_nm, value);
	}


	/**
	 * Receiving point required 配送先必須.<p>
	 *
	 */
	public boolean tdlv_req_flg() {
		return getConstBoolean(offset + 253, $tdlv_req_flg);
	}

	/**
	 * Receiving point required 配送先必須.<p>
	 *
	 */
	public void tdlv_req_flg(boolean value) {
		setConstBoolean(offset + 253, $tdlv_req_flg, value);
	}


	/**
	 * Delivery destination calendar cd. 納品先カレンダＣＤ.<p>
	 *
	 */
	public String dlv_cal_cd() {
		return getConstString(offset + 254, $dlv_cal_cd);
	}

	/**
	 * Delivery destination calendar cd. 納品先カレンダＣＤ.<p>
	 *
	 */
	public void dlv_cal_cd(String value) {
		setConstString(offset + 254, $dlv_cal_cd, value);
	}


	/**
	 * Delivery destination calendar name 納品先カレンダ名.<p>
	 *
	 */
	public String dlv_cal_nm() {
		return getConstString(offset + 255, $dlv_cal_nm);
	}

	/**
	 * Delivery destination calendar name 納品先カレンダ名.<p>
	 *
	 */
	public void dlv_cal_nm(String value) {
		setConstString(offset + 255, $dlv_cal_nm, value);
	}


	/**
	 * Delivery destination dept. 納品先部署.<p>
	 *
	 */
	public String dlv_cntct_dpt() {
		return getConstString(offset + 256, $dlv_cntct_dpt);
	}

	/**
	 * Delivery destination dept. 納品先部署.<p>
	 *
	 */
	public void dlv_cntct_dpt(String value) {
		setConstString(offset + 256, $dlv_cntct_dpt, value);
	}


	/**
	 * Delivery destination PIC 納品先担当者.<p>
	 *
	 */
	public String dlv_cntct_psn() {
		return getConstString(offset + 257, $dlv_cntct_psn);
	}

	/**
	 * Delivery destination PIC 納品先担当者.<p>
	 *
	 */
	public void dlv_cntct_psn(String value) {
		setConstString(offset + 257, $dlv_cntct_psn, value);
	}


	/**
	 * Delivery destination PIC honorific 納品先担当者敬称.<p>
	 *
	 */
	public String dlv_cntct_psn_title() {
		return getConstString(offset + 258, $dlv_cntct_psn_title);
	}

	/**
	 * Delivery destination PIC honorific 納品先担当者敬称.<p>
	 *
	 */
	public void dlv_cntct_psn_title(String value) {
		setConstString(offset + 258, $dlv_cntct_psn_title, value);
	}


	/**
	 * Print price 価格印字.<p>
	 *
	 */
	public boolean pri_prnt_flg() {
		return getConstBoolean(offset + 259, $pri_prnt_flg);
	}

	/**
	 * Print price 価格印字.<p>
	 *
	 */
	public void pri_prnt_flg(boolean value) {
		setConstBoolean(offset + 259, $pri_prnt_flg, value);
	}


	/**
	 * For consignment inventory count 貸出在庫棚卸対象.<p>
	 *
	 */
	public boolean cnsgn_stktk_flg() {
		return getConstBoolean(offset + 260, $cnsgn_stktk_flg);
	}

	/**
	 * For consignment inventory count 貸出在庫棚卸対象.<p>
	 *
	 */
	public void cnsgn_stktk_flg(boolean value) {
		setConstBoolean(offset + 260, $cnsgn_stktk_flg, value);
	}


	/**
	 * Delivery destination channel 1 納品先チャネル１.<p>
	 *
	 */
	public String dlv_chnnl1() {
		return getConstString(offset + 261, $dlv_chnnl1);
	}

	/**
	 * Delivery destination channel 1 納品先チャネル１.<p>
	 *
	 */
	public void dlv_chnnl1(String value) {
		setConstString(offset + 261, $dlv_chnnl1, value);
	}


	/**
	 * Delivery destination channel 2 納品先チャネル２.<p>
	 *
	 */
	public String dlv_chnnl2() {
		return getConstString(offset + 262, $dlv_chnnl2);
	}

	/**
	 * Delivery destination channel 2 納品先チャネル２.<p>
	 *
	 */
	public void dlv_chnnl2(String value) {
		setConstString(offset + 262, $dlv_chnnl2, value);
	}


	/**
	 * Delivery destination channel 3 納品先チャネル３.<p>
	 *
	 */
	public String dlv_chnnl3() {
		return getConstString(offset + 263, $dlv_chnnl3);
	}

	/**
	 * Delivery destination channel 3 納品先チャネル３.<p>
	 *
	 */
	public void dlv_chnnl3(String value) {
		setConstString(offset + 263, $dlv_chnnl3, value);
	}


	/**
	 * Report issue type (Delivery destination) 帳票発行区分（納品先）.<p>
	 *
	 */
	public String dlv_prnt_typ() {
		return getConstString(offset + 264, $dlv_prnt_typ);
	}

	/**
	 * Report issue type (Delivery destination) 帳票発行区分（納品先）.<p>
	 *
	 */
	public void dlv_prnt_typ(String value) {
		setConstString(offset + 264, $dlv_prnt_typ, value);
	}


	/**
	 * Report issue type name (Delivery destination) 帳票発行区分名（納品先）.<p>
	 *
	 */
	public String dlv_prnt_typ_nm() {
		return getConstString(offset + 265, $dlv_prnt_typ_nm);
	}

	/**
	 * Report issue type name (Delivery destination) 帳票発行区分名（納品先）.<p>
	 *
	 */
	public void dlv_prnt_typ_nm(String value) {
		setConstString(offset + 265, $dlv_prnt_typ_nm, value);
	}


	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public String asppl_cd() {
		return getConstString(offset + 266, $asppl_cd);
	}

	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public void asppl_cd(String value) {
		setConstString(offset + 266, $asppl_cd, value);
	}


	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public String asppl_nm() {
		return getConstString(offset + 267, $asppl_nm);
	}

	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public void asppl_nm(String value) {
		setConstString(offset + 267, $asppl_nm, value);
	}


	/**
	 * Supplier dept. 発注先部署.<p>
	 *
	 */
	public String sppl_cntct_dpt() {
		return getConstString(offset + 268, $sppl_cntct_dpt);
	}

	/**
	 * Supplier dept. 発注先部署.<p>
	 *
	 */
	public void sppl_cntct_dpt(String value) {
		setConstString(offset + 268, $sppl_cntct_dpt, value);
	}


	/**
	 * Supplier PIC 発注先担当者.<p>
	 *
	 */
	public String sppl_cntct_psn() {
		return getConstString(offset + 269, $sppl_cntct_psn);
	}

	/**
	 * Supplier PIC 発注先担当者.<p>
	 *
	 */
	public void sppl_cntct_psn(String value) {
		setConstString(offset + 269, $sppl_cntct_psn, value);
	}


	/**
	 * Supplier PIC form of address 発注先担当者敬称.<p>
	 *
	 */
	public String sppl_cntct_psn_title() {
		return getConstString(offset + 270, $sppl_cntct_psn_title);
	}

	/**
	 * Supplier PIC form of address 発注先担当者敬称.<p>
	 *
	 */
	public void sppl_cntct_psn_title(String value) {
		setConstString(offset + 270, $sppl_cntct_psn_title, value);
	}


	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public boolean subcon_flg() {
		return getConstBoolean(offset + 271, $subcon_flg);
	}

	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public void subcon_flg(boolean value) {
		setConstBoolean(offset + 271, $subcon_flg, value);
	}


	/**
	 * Chargeable supplier 有償支給先.<p>
	 *
	 */
	public boolean onr_prsppl_flg() {
		return getConstBoolean(offset + 272, $onr_prsppl_flg);
	}

	/**
	 * Chargeable supplier 有償支給先.<p>
	 *
	 */
	public void onr_prsppl_flg(boolean value) {
		setConstBoolean(offset + 272, $onr_prsppl_flg, value);
	}


	public boolean org_onr_prsppl_flg() {
		return getConstBoolean(offset + 273, $org_onr_prsppl_flg);
	}

	public void org_onr_prsppl_flg(boolean value) {
		setConstBoolean(offset + 273, $org_onr_prsppl_flg, value);
	}


	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public boolean repurc_obli_flg() {
		return getConstBoolean(offset + 274, $repurc_obli_flg);
	}

	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public void repurc_obli_flg(boolean value) {
		setConstBoolean(offset + 274, $repurc_obli_flg, value);
	}


	/**
	 * VMI purchasing dept. cd. ＶＭＩ購買部門ＣＤ.<p>
	 *
	 */
	public String vmi_purc_dpt_cd() {
		return getConstString(offset + 275, $vmi_purc_dpt_cd);
	}

	/**
	 * VMI purchasing dept. cd. ＶＭＩ購買部門ＣＤ.<p>
	 *
	 */
	public void vmi_purc_dpt_cd(String value) {
		setConstString(offset + 275, $vmi_purc_dpt_cd, value);
	}


	/**
	 * VMI purchasing dept. name ＶＭＩ購買部門名.<p>
	 *
	 */
	public String vmi_purc_dpt_nm() {
		return getConstString(offset + 276, $vmi_purc_dpt_nm);
	}

	/**
	 * VMI purchasing dept. name ＶＭＩ購買部門名.<p>
	 *
	 */
	public void vmi_purc_dpt_nm(String value) {
		setConstString(offset + 276, $vmi_purc_dpt_nm, value);
	}


	/**
	 * VMI purchasing dept. cd. ＶＭＩ購買部門ＣＤ.<p>
	 *
	 */
	public String check_vmi_purc_dpt_cd() {
		return getConstString(offset + 277, $check_vmi_purc_dpt_cd);
	}

	/**
	 * VMI purchasing dept. cd. ＶＭＩ購買部門ＣＤ.<p>
	 *
	 */
	public void check_vmi_purc_dpt_cd(String value) {
		setConstString(offset + 277, $check_vmi_purc_dpt_cd, value);
	}


	/**
	 * Purchase unit price acquisition type 購買単価取得区分.<p>
	 *
	 */
	public String purc_upri_req_typ() {
		return getConstString(offset + 278, $purc_upri_req_typ);
	}

	/**
	 * Purchase unit price acquisition type 購買単価取得区分.<p>
	 *
	 */
	public void purc_upri_req_typ(String value) {
		setConstString(offset + 278, $purc_upri_req_typ, value);
	}


	/**
	 * Purchase unit price acquisition type name 購買単価取得区分名.<p>
	 *
	 */
	public String purc_upri_req_typ_nm() {
		return getConstString(offset + 279, $purc_upri_req_typ_nm);
	}

	/**
	 * Purchase unit price acquisition type name 購買単価取得区分名.<p>
	 *
	 */
	public void purc_upri_req_typ_nm(String value) {
		setConstString(offset + 279, $purc_upri_req_typ_nm, value);
	}


	/**
	 * Allow purchasing unit price change 購買単価変更許可.<p>
	 *
	 */
	public boolean purc_upri_cng_flg() {
		return getConstBoolean(offset + 280, $purc_upri_cng_flg);
	}

	/**
	 * Allow purchasing unit price change 購買単価変更許可.<p>
	 *
	 */
	public void purc_upri_cng_flg(boolean value) {
		setConstBoolean(offset + 280, $purc_upri_cng_flg, value);
	}


	/**
	 * Check order promising 納期回答確認.<p>
	 *
	 */
	public boolean prms_recv_flg() {
		return getConstBoolean(offset + 281, $prms_recv_flg);
	}

	/**
	 * Check order promising 納期回答確認.<p>
	 *
	 */
	public void prms_recv_flg(boolean value) {
		setConstBoolean(offset + 281, $prms_recv_flg, value);
	}


	/**
	 * Rounding type (Purchase amount) 仕入金額端数処理区分.<p>
	 *
	 */
	public String purc_amt_rnd_typ() {
		return getConstString(offset + 282, $purc_amt_rnd_typ);
	}

	/**
	 * Rounding type (Purchase amount) 仕入金額端数処理区分.<p>
	 *
	 */
	public void purc_amt_rnd_typ(String value) {
		setConstString(offset + 282, $purc_amt_rnd_typ, value);
	}


	/**
	 * Rounding type name (Purchase amount) 仕入金額端数処理区分名.<p>
	 *
	 */
	public String purc_amt_rnd_typ_nm() {
		return getConstString(offset + 283, $purc_amt_rnd_typ_nm);
	}

	/**
	 * Rounding type name (Purchase amount) 仕入金額端数処理区分名.<p>
	 *
	 */
	public void purc_amt_rnd_typ_nm(String value) {
		setConstString(offset + 283, $purc_amt_rnd_typ_nm, value);
	}


	/**
	 * Purchase tax calculation type 仕入税計算区分.<p>
	 *
	 */
	public String purc_tax_calc_typ() {
		return getConstString(offset + 284, $purc_tax_calc_typ);
	}

	/**
	 * Purchase tax calculation type 仕入税計算区分.<p>
	 *
	 */
	public void purc_tax_calc_typ(String value) {
		setConstString(offset + 284, $purc_tax_calc_typ, value);
	}


	/**
	 * Purchase tax calculation type name 仕入税計算区分名.<p>
	 *
	 */
	public String purc_tax_calc_typ_nm() {
		return getConstString(offset + 285, $purc_tax_calc_typ_nm);
	}

	/**
	 * Purchase tax calculation type name 仕入税計算区分名.<p>
	 *
	 */
	public void purc_tax_calc_typ_nm(String value) {
		setConstString(offset + 285, $purc_tax_calc_typ_nm, value);
	}


	/**
	 * Rounding type (Purchase tax) 仕入税額端数処理区分.<p>
	 *
	 */
	public String purc_tax_rnd_typ() {
		return getConstString(offset + 286, $purc_tax_rnd_typ);
	}

	/**
	 * Rounding type (Purchase tax) 仕入税額端数処理区分.<p>
	 *
	 */
	public void purc_tax_rnd_typ(String value) {
		setConstString(offset + 286, $purc_tax_rnd_typ, value);
	}


	/**
	 * Purchase tax amount rounding type 仕入税額端数処理区分名.<p>
	 *
	 */
	public String purc_tax_rnd_typ_nm() {
		return getConstString(offset + 287, $purc_tax_rnd_typ_nm);
	}

	/**
	 * Purchase tax amount rounding type 仕入税額端数処理区分名.<p>
	 *
	 */
	public void purc_tax_rnd_typ_nm(String value) {
		setConstString(offset + 287, $purc_tax_rnd_typ_nm, value);
	}


	/**
	 * Purchase tax cd. 仕入税ＣＤ.<p>
	 *
	 */
	public String purc_tax_cd() {
		return getConstString(offset + 288, $purc_tax_cd);
	}

	/**
	 * Purchase tax cd. 仕入税ＣＤ.<p>
	 *
	 */
	public void purc_tax_cd(String value) {
		setConstString(offset + 288, $purc_tax_cd, value);
	}


	/**
	 * Purchase tax type name 仕入税名.<p>
	 *
	 */
	public String purc_tax_nm() {
		return getConstString(offset + 289, $purc_tax_nm);
	}

	/**
	 * Purchase tax type name 仕入税名.<p>
	 *
	 */
	public void purc_tax_nm(String value) {
		setConstString(offset + 289, $purc_tax_nm, value);
	}


	/**
	 * Purchase tax priority 仕入税優先.<p>
	 *
	 */
	public boolean purc_tax_cd_prio_flg() {
		return getConstBoolean(offset + 290, $purc_tax_cd_prio_flg);
	}

	/**
	 * Purchase tax priority 仕入税優先.<p>
	 *
	 */
	public void purc_tax_cd_prio_flg(boolean value) {
		setConstBoolean(offset + 290, $purc_tax_cd_prio_flg, value);
	}


	/**
	 * Supplier calendar cd. 発注先カレンダＣＤ.<p>
	 *
	 */
	public String sppl_cal_cd() {
		return getConstString(offset + 291, $sppl_cal_cd);
	}

	/**
	 * Supplier calendar cd. 発注先カレンダＣＤ.<p>
	 *
	 */
	public void sppl_cal_cd(String value) {
		setConstString(offset + 291, $sppl_cal_cd, value);
	}


	/**
	 * Supplier calendar name 発注先カレンダ名.<p>
	 *
	 */
	public String sppl_cal_nm() {
		return getConstString(offset + 292, $sppl_cal_nm);
	}

	/**
	 * Supplier calendar name 発注先カレンダ名.<p>
	 *
	 */
	public void sppl_cal_nm(String value) {
		setConstString(offset + 292, $sppl_cal_nm, value);
	}


	/**
	 * Display PO sheet cd. 注文書表示ＣＤ.<p>
	 *
	 */
	public String po_print_cd() {
		return getConstString(offset + 293, $po_print_cd);
	}

	/**
	 * Display PO sheet cd. 注文書表示ＣＤ.<p>
	 *
	 */
	public void po_print_cd(String value) {
		setConstString(offset + 293, $po_print_cd, value);
	}


	/**
	 * Display PO sheet name 注文書表示名.<p>
	 *
	 */
	public String po_print_nm() {
		return getConstString(offset + 294, $po_print_nm);
	}

	/**
	 * Display PO sheet name 注文書表示名.<p>
	 *
	 */
	public void po_print_nm(String value) {
		setConstString(offset + 294, $po_print_nm, value);
	}


	/**
	 * Supplier delivery note cd. 発注先納品書ＣＤ.<p>
	 *
	 */
	public String sppl_ship_form_cd() {
		return getConstString(offset + 295, $sppl_ship_form_cd);
	}

	/**
	 * Supplier delivery note cd. 発注先納品書ＣＤ.<p>
	 *
	 */
	public void sppl_ship_form_cd(String value) {
		setConstString(offset + 295, $sppl_ship_form_cd, value);
	}


	/**
	 * Supplier delivery note name 発注先納品書名.<p>
	 *
	 */
	public String sppl_ship_form_nm() {
		return getConstString(offset + 296, $sppl_ship_form_nm);
	}

	/**
	 * Supplier delivery note name 発注先納品書名.<p>
	 *
	 */
	public void sppl_ship_form_nm(String value) {
		setConstString(offset + 296, $sppl_ship_form_nm, value);
	}


	/**
	 * Delivery note at PO 発注時納品書.<p>
	 *
	 */
	public boolean po_dlv_slip_flg() {
		return getConstBoolean(offset + 297, $po_dlv_slip_flg);
	}

	/**
	 * Delivery note at PO 発注時納品書.<p>
	 *
	 */
	public void po_dlv_slip_flg(boolean value) {
		setConstBoolean(offset + 297, $po_dlv_slip_flg, value);
	}


	/**
	 * Delivery note at delivery order 納入指示時納品書.<p>
	 *
	 */
	public boolean dlv_inst_dlv_slip_flg() {
		return getConstBoolean(offset + 298, $dlv_inst_dlv_slip_flg);
	}

	/**
	 * Delivery note at delivery order 納入指示時納品書.<p>
	 *
	 */
	public void dlv_inst_dlv_slip_flg(boolean value) {
		setConstBoolean(offset + 298, $dlv_inst_dlv_slip_flg, value);
	}


	/**
	 * Delivery note at order promising result receipt 納期回答受領時納品書.<p>
	 *
	 */
	public boolean prms_rcpt_dlv_slip_flg() {
		return getConstBoolean(offset + 299, $prms_rcpt_dlv_slip_flg);
	}

	/**
	 * Delivery note at order promising result receipt 納期回答受領時納品書.<p>
	 *
	 */
	public void prms_rcpt_dlv_slip_flg(boolean value) {
		setConstBoolean(offset + 299, $prms_rcpt_dlv_slip_flg, value);
	}


	/**
	 * In-transit supply management type 支給積送管理区分.<p>
	 *
	 */
	public String prov_rcv_typ() {
		return getConstString(offset + 300, $prov_rcv_typ);
	}

	/**
	 * In-transit supply management type 支給積送管理区分.<p>
	 *
	 */
	public void prov_rcv_typ(String value) {
		setConstString(offset + 300, $prov_rcv_typ, value);
	}


	/**
	 * Supply in-transit management type 支給積送管理区分名.<p>
	 *
	 */
	public String prov_rcv_typ_nm() {
		return getConstString(offset + 301, $prov_rcv_typ_nm);
	}

	/**
	 * Supply in-transit management type 支給積送管理区分名.<p>
	 *
	 */
	public void prov_rcv_typ_nm(String value) {
		setConstString(offset + 301, $prov_rcv_typ_nm, value);
	}


	/**
	 * Purchase lot details split type 仕入ロット明細分割区分.<p>
	 *
	 */
	public String purc_slip_each_lot_typ() {
		return getConstString(offset + 302, $purc_slip_each_lot_typ);
	}

	/**
	 * Purchase lot details split type 仕入ロット明細分割区分.<p>
	 *
	 */
	public void purc_slip_each_lot_typ(String value) {
		setConstString(offset + 302, $purc_slip_each_lot_typ, value);
	}


	/**
	 * Purchase lot details split type name 仕入ロット明細分割区分名.<p>
	 *
	 */
	public String purc_slip_each_lot_typ_nm() {
		return getConstString(offset + 303, $purc_slip_each_lot_typ_nm);
	}

	/**
	 * Purchase lot details split type name 仕入ロット明細分割区分名.<p>
	 *
	 */
	public void purc_slip_each_lot_typ_nm(String value) {
		setConstString(offset + 303, $purc_slip_each_lot_typ_nm, value);
	}


	/**
	 * Supplier transaction terms cd. 1 発注先取引条件ＣＤ１.<p>
	 *
	 */
	public String sppl_tterm_cd1() {
		return getConstString(offset + 304, $sppl_tterm_cd1);
	}

	/**
	 * Supplier transaction terms cd. 1 発注先取引条件ＣＤ１.<p>
	 *
	 */
	public void sppl_tterm_cd1(String value) {
		setConstString(offset + 304, $sppl_tterm_cd1, value);
	}


	/**
	 * Supplier transaction terms name 1 発注先取引条件名１.<p>
	 *
	 */
	public String sppl_tterm_nm1() {
		return getConstString(offset + 305, $sppl_tterm_nm1);
	}

	/**
	 * Supplier transaction terms name 1 発注先取引条件名１.<p>
	 *
	 */
	public void sppl_tterm_nm1(String value) {
		setConstString(offset + 305, $sppl_tterm_nm1, value);
	}


	/**
	 * Supplier transaction terms cd. 2 発注先取引条件ＣＤ２.<p>
	 *
	 */
	public String sppl_tterm_cd2() {
		return getConstString(offset + 306, $sppl_tterm_cd2);
	}

	/**
	 * Supplier transaction terms cd. 2 発注先取引条件ＣＤ２.<p>
	 *
	 */
	public void sppl_tterm_cd2(String value) {
		setConstString(offset + 306, $sppl_tterm_cd2, value);
	}


	/**
	 * Supplier transaction terms name 2 発注先取引条件名２.<p>
	 *
	 */
	public String sppl_tterm_nm2() {
		return getConstString(offset + 307, $sppl_tterm_nm2);
	}

	/**
	 * Supplier transaction terms name 2 発注先取引条件名２.<p>
	 *
	 */
	public void sppl_tterm_nm2(String value) {
		setConstString(offset + 307, $sppl_tterm_nm2, value);
	}


	/**
	 * Supplier transaction terms cd. 3 発注先取引条件ＣＤ３.<p>
	 *
	 */
	public String sppl_tterm_cd3() {
		return getConstString(offset + 308, $sppl_tterm_cd3);
	}

	/**
	 * Supplier transaction terms cd. 3 発注先取引条件ＣＤ３.<p>
	 *
	 */
	public void sppl_tterm_cd3(String value) {
		setConstString(offset + 308, $sppl_tterm_cd3, value);
	}


	/**
	 * Supplier transaction terms name 3 発注先取引条件名３.<p>
	 *
	 */
	public String sppl_tterm_nm3() {
		return getConstString(offset + 309, $sppl_tterm_nm3);
	}

	/**
	 * Supplier transaction terms name 3 発注先取引条件名３.<p>
	 *
	 */
	public void sppl_tterm_nm3(String value) {
		setConstString(offset + 309, $sppl_tterm_nm3, value);
	}


	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public MCNumber pay_crryovr_times() {
		return getConstNumber(offset + 310, $pay_crryovr_times);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(MCNumber value) {
		setConstNumber(offset + 310, $pay_crryovr_times, value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(int value) {
		setConstNumber(offset + 310, $pay_crryovr_times, value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(long value) {
		setConstNumber(offset + 310, $pay_crryovr_times, value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(float value) {
		setConstNumber(offset + 310, $pay_crryovr_times, value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(double value) {
		setConstNumber(offset + 310, $pay_crryovr_times, value);
	}


	/**
	 * PO sheet by sales project 案件別注文書.<p>
	 *
	 */
	public boolean wrk_po_flg() {
		return getConstBoolean(offset + 311, $wrk_po_flg);
	}

	/**
	 * PO sheet by sales project 案件別注文書.<p>
	 *
	 */
	public void wrk_po_flg(boolean value) {
		setConstBoolean(offset + 311, $wrk_po_flg, value);
	}


	/**
	 * AP management by sales project 案件別債務管理.<p>
	 *
	 */
	public boolean wrk_ap_flg() {
		return getConstBoolean(offset + 312, $wrk_ap_flg);
	}

	/**
	 * AP management by sales project 案件別債務管理.<p>
	 *
	 */
	public void wrk_ap_flg(boolean value) {
		setConstBoolean(offset + 312, $wrk_ap_flg, value);
	}


	/**
	 * Supplier invoice transaction 発注先インボイス取引.<p>
	 *
	 */
	public boolean sppl_iv_flg() {
		return getConstBoolean(offset + 313, $sppl_iv_flg);
	}

	/**
	 * Supplier invoice transaction 発注先インボイス取引.<p>
	 *
	 */
	public void sppl_iv_flg(boolean value) {
		setConstBoolean(offset + 313, $sppl_iv_flg, value);
	}


	/**
	 * Allow purchase invoice duplication 受領インボイス重複許可.<p>
	 *
	 */
	public boolean rcpt_iv_dup_flg() {
		return getConstBoolean(offset + 314, $rcpt_iv_dup_flg);
	}

	/**
	 * Allow purchase invoice duplication 受領インボイス重複許可.<p>
	 *
	 */
	public void rcpt_iv_dup_flg(boolean value) {
		setConstBoolean(offset + 314, $rcpt_iv_dup_flg, value);
	}


	/**
	 * Purchase recording type 仕入計上区分.<p>
	 *
	 */
	public String purc_basis_typ() {
		return getConstString(offset + 315, $purc_basis_typ);
	}

	/**
	 * Purchase recording type 仕入計上区分.<p>
	 *
	 */
	public void purc_basis_typ(String value) {
		setConstString(offset + 315, $purc_basis_typ, value);
	}


	/**
	 * Purchase recording type name 仕入計上区分名.<p>
	 *
	 */
	public String purc_basis_typ_nm() {
		return getConstString(offset + 316, $purc_basis_typ_nm);
	}

	/**
	 * Purchase recording type name 仕入計上区分名.<p>
	 *
	 */
	public void purc_basis_typ_nm(String value) {
		setConstString(offset + 316, $purc_basis_typ_nm, value);
	}


	/**
	 * Subcontracting unit price type 外注単価区分.<p>
	 *
	 */
	public String outsrc_upri_typ() {
		return getConstString(offset + 317, $outsrc_upri_typ);
	}

	/**
	 * Subcontracting unit price type 外注単価区分.<p>
	 *
	 */
	public void outsrc_upri_typ(String value) {
		setConstString(offset + 317, $outsrc_upri_typ, value);
	}


	/**
	 * Subcontracting unit price type name 外注単価区分名.<p>
	 *
	 */
	public String outsrc_upri_typ_nm() {
		return getConstString(offset + 318, $outsrc_upri_typ_nm);
	}

	/**
	 * Subcontracting unit price type name 外注単価区分名.<p>
	 *
	 */
	public void outsrc_upri_typ_nm(String value) {
		setConstString(offset + 318, $outsrc_upri_typ_nm, value);
	}


	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public String prov_basis_typ() {
		return getConstString(offset + 319, $prov_basis_typ);
	}

	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public void prov_basis_typ(String value) {
		setConstString(offset + 319, $prov_basis_typ, value);
	}


	/**
	 * Supply recording type name 支給計上区分名.<p>
	 *
	 */
	public String prov_basis_typ_nm() {
		return getConstString(offset + 320, $prov_basis_typ_nm);
	}

	/**
	 * Supply recording type name 支給計上区分名.<p>
	 *
	 */
	public void prov_basis_typ_nm(String value) {
		setConstString(offset + 320, $prov_basis_typ_nm, value);
	}


	/**
	 * Allow supply unit price change 支給単価変更許可.<p>
	 *
	 */
	public boolean prov_upri_cng_flg() {
		return getConstBoolean(offset + 321, $prov_upri_cng_flg);
	}

	/**
	 * Allow supply unit price change 支給単価変更許可.<p>
	 *
	 */
	public void prov_upri_cng_flg(boolean value) {
		setConstBoolean(offset + 321, $prov_upri_cng_flg, value);
	}


	/**
	 * Supply tax cd. 支給税ＣＤ.<p>
	 *
	 */
	public String prov_tax_cd() {
		return getConstString(offset + 322, $prov_tax_cd);
	}

	/**
	 * Supply tax cd. 支給税ＣＤ.<p>
	 *
	 */
	public void prov_tax_cd(String value) {
		setConstString(offset + 322, $prov_tax_cd, value);
	}


	/**
	 * Supply tax name 支給税名.<p>
	 *
	 */
	public String prov_tax_nm() {
		return getConstString(offset + 323, $prov_tax_nm);
	}

	/**
	 * Supply tax name 支給税名.<p>
	 *
	 */
	public void prov_tax_nm(String value) {
		setConstString(offset + 323, $prov_tax_nm, value);
	}


	/**
	 * Supply tax first 支給税優先.<p>
	 *
	 */
	public boolean prov_tax_cd_prio_flg() {
		return getConstBoolean(offset + 324, $prov_tax_cd_prio_flg);
	}

	/**
	 * Supply tax first 支給税優先.<p>
	 *
	 */
	public void prov_tax_cd_prio_flg(boolean value) {
		setConstBoolean(offset + 324, $prov_tax_cd_prio_flg, value);
	}


	/**
	 * Supply amount rounding type 支給金額端数処理区分.<p>
	 *
	 */
	public String prov_amt_rnd_typ() {
		return getConstString(offset + 325, $prov_amt_rnd_typ);
	}

	/**
	 * Supply amount rounding type 支給金額端数処理区分.<p>
	 *
	 */
	public void prov_amt_rnd_typ(String value) {
		setConstString(offset + 325, $prov_amt_rnd_typ, value);
	}


	/**
	 * Supply amount rounding type 支給金額端数処理区分名.<p>
	 *
	 */
	public String prov_amt_rnd_typ_nm() {
		return getConstString(offset + 326, $prov_amt_rnd_typ_nm);
	}

	/**
	 * Supply amount rounding type 支給金額端数処理区分名.<p>
	 *
	 */
	public void prov_amt_rnd_typ_nm(String value) {
		setConstString(offset + 326, $prov_amt_rnd_typ_nm, value);
	}


	/**
	 * Supply tax calculation type 支給税計算区分.<p>
	 *
	 */
	public String prov_tax_calc_typ() {
		return getConstString(offset + 327, $prov_tax_calc_typ);
	}

	/**
	 * Supply tax calculation type 支給税計算区分.<p>
	 *
	 */
	public void prov_tax_calc_typ(String value) {
		setConstString(offset + 327, $prov_tax_calc_typ, value);
	}


	/**
	 * Supply tax calculation type name 支給税計算区分名.<p>
	 *
	 */
	public String prov_tax_calc_typ_nm() {
		return getConstString(offset + 328, $prov_tax_calc_typ_nm);
	}

	/**
	 * Supply tax calculation type name 支給税計算区分名.<p>
	 *
	 */
	public void prov_tax_calc_typ_nm(String value) {
		setConstString(offset + 328, $prov_tax_calc_typ_nm, value);
	}


	/**
	 * Supply tax rounding type 支給税額端数処理区分.<p>
	 *
	 */
	public String prov_tax_rnd_typ() {
		return getConstString(offset + 329, $prov_tax_rnd_typ);
	}

	/**
	 * Supply tax rounding type 支給税額端数処理区分.<p>
	 *
	 */
	public void prov_tax_rnd_typ(String value) {
		setConstString(offset + 329, $prov_tax_rnd_typ, value);
	}


	/**
	 * Supply tax amount rounding type 支給税額端数処理区分名.<p>
	 *
	 */
	public String prov_tax_rnd_typ_nm() {
		return getConstString(offset + 330, $prov_tax_rnd_typ_nm);
	}

	/**
	 * Supply tax amount rounding type 支給税額端数処理区分名.<p>
	 *
	 */
	public void prov_tax_rnd_typ_nm(String value) {
		setConstString(offset + 330, $prov_tax_rnd_typ_nm, value);
	}


	/**
	 * Report issue type (Supplier) 帳票発行区分（発注先）.<p>
	 *
	 */
	public String sppl_prnt_typ() {
		return getConstString(offset + 331, $sppl_prnt_typ);
	}

	/**
	 * Report issue type (Supplier) 帳票発行区分（発注先）.<p>
	 *
	 */
	public void sppl_prnt_typ(String value) {
		setConstString(offset + 331, $sppl_prnt_typ, value);
	}


	/**
	 * Report issue type name (Supplier) 帳票発行区分名（発注先）.<p>
	 *
	 */
	public String sppl_prnt_typ_nm() {
		return getConstString(offset + 332, $sppl_prnt_typ_nm);
	}

	/**
	 * Report issue type name (Supplier) 帳票発行区分名（発注先）.<p>
	 *
	 */
	public void sppl_prnt_typ_nm(String value) {
		setConstString(offset + 332, $sppl_prnt_typ_nm, value);
	}


	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public String bsppl_cd() {
		return getConstString(offset + 333, $bsppl_cd);
	}

	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public void bsppl_cd(String value) {
		setConstString(offset + 333, $bsppl_cd, value);
	}


	/**
	 * Scheduled payee name 支払予定管理先名.<p>
	 *
	 */
	public String bsppl_nm() {
		return getConstString(offset + 334, $bsppl_nm);
	}

	/**
	 * Scheduled payee name 支払予定管理先名.<p>
	 *
	 */
	public void bsppl_nm(String value) {
		setConstString(offset + 334, $bsppl_nm, value);
	}


	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public String ap_dpt_cd() {
		return getConstString(offset + 335, $ap_dpt_cd);
	}

	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public void ap_dpt_cd(String value) {
		setConstString(offset + 335, $ap_dpt_cd, value);
	}


	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public String ap_dpt_nm() {
		return getConstString(offset + 336, $ap_dpt_nm);
	}

	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public void ap_dpt_nm(String value) {
		setConstString(offset + 336, $ap_dpt_nm, value);
	}


	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public String check_ap_dpt_cd() {
		return getConstString(offset + 337, $check_ap_dpt_cd);
	}

	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public void check_ap_dpt_cd(String value) {
		setConstString(offset + 337, $check_ap_dpt_cd, value);
	}


	/**
	 * Report issue type (AP supplier) 帳票発行区分（買掛先）.<p>
	 *
	 */
	public String asppl_prnt_typ() {
		return getConstString(offset + 338, $asppl_prnt_typ);
	}

	/**
	 * Report issue type (AP supplier) 帳票発行区分（買掛先）.<p>
	 *
	 */
	public void asppl_prnt_typ(String value) {
		setConstString(offset + 338, $asppl_prnt_typ, value);
	}


	/**
	 * Report issue type name (AP supplier) 帳票発行区分名（買掛先）.<p>
	 *
	 */
	public String asppl_prnt_typ_nm() {
		return getConstString(offset + 339, $asppl_prnt_typ_nm);
	}

	/**
	 * Report issue type name (AP supplier) 帳票発行区分名（買掛先）.<p>
	 *
	 */
	public void asppl_prnt_typ_nm(String value) {
		setConstString(offset + 339, $asppl_prnt_typ_nm, value);
	}


	/**
	 * Payee cd. 支払先ＣＤ.<p>
	 *
	 */
	public String psppl_cd() {
		return getConstString(offset + 340, $psppl_cd);
	}

	/**
	 * Payee cd. 支払先ＣＤ.<p>
	 *
	 */
	public void psppl_cd(String value) {
		setConstString(offset + 340, $psppl_cd, value);
	}


	/**
	 * Payee name 支払先名.<p>
	 *
	 */
	public String psppl_nm() {
		return getConstString(offset + 341, $psppl_nm);
	}

	/**
	 * Payee name 支払先名.<p>
	 *
	 */
	public void psppl_nm(String value) {
		setConstString(offset + 341, $psppl_nm, value);
	}


	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public String bsppl_dpt_cd() {
		return getConstString(offset + 342, $bsppl_dpt_cd);
	}

	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public void bsppl_dpt_cd(String value) {
		setConstString(offset + 342, $bsppl_dpt_cd, value);
	}


	/**
	 * Name of dept. in charge of scheduled payee 支払予定管理先担当部門名.<p>
	 *
	 */
	public String bsppl_dpt_nm() {
		return getConstString(offset + 343, $bsppl_dpt_nm);
	}

	/**
	 * Name of dept. in charge of scheduled payee 支払予定管理先担当部門名.<p>
	 *
	 */
	public void bsppl_dpt_nm(String value) {
		setConstString(offset + 343, $bsppl_dpt_nm, value);
	}


	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public String check_bsppl_dpt_cd() {
		return getConstString(offset + 344, $check_bsppl_dpt_cd);
	}

	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public void check_bsppl_dpt_cd(String value) {
		setConstString(offset + 344, $check_bsppl_dpt_cd, value);
	}


	/**
	 * AP credit managed BP cd. 債務与信管理先ＣＤ.<p>
	 *
	 */
	public String ap_cred_cd() {
		return getConstString(offset + 345, $ap_cred_cd);
	}

	/**
	 * AP credit managed BP cd. 債務与信管理先ＣＤ.<p>
	 *
	 */
	public void ap_cred_cd(String value) {
		setConstString(offset + 345, $ap_cred_cd, value);
	}


	/**
	 * AP credit managed BP name 債務与信管理先名.<p>
	 *
	 */
	public String ap_cred_nm() {
		return getConstString(offset + 346, $ap_cred_nm);
	}

	/**
	 * AP credit managed BP name 債務与信管理先名.<p>
	 *
	 */
	public void ap_cred_nm(String value) {
		setConstString(offset + 346, $ap_cred_nm, value);
	}


	/**
	 * Purchase temporary unit price closing 仕入仮単価締.<p>
	 *
	 */
	public boolean purc_interim_cl_flg() {
		return getConstBoolean(offset + 347, $purc_interim_cl_flg);
	}

	/**
	 * Purchase temporary unit price closing 仕入仮単価締.<p>
	 *
	 */
	public void purc_interim_cl_flg(boolean value) {
		setConstBoolean(offset + 347, $purc_interim_cl_flg, value);
	}


	/**
	 * Payee account cd. 支払先口座ＣＤ.<p>
	 *
	 */
	public String pay_bank_ac_cd() {
		return getConstString(offset + 348, $pay_bank_ac_cd);
	}

	/**
	 * Payee account cd. 支払先口座ＣＤ.<p>
	 *
	 */
	public void pay_bank_ac_cd(String value) {
		setConstString(offset + 348, $pay_bank_ac_cd, value);
	}


	/**
	 * Payee account name 支払先口座名.<p>
	 *
	 */
	public String pay_bank_ac_nm() {
		return getConstString(offset + 349, $pay_bank_ac_nm);
	}

	/**
	 * Payee account name 支払先口座名.<p>
	 *
	 */
	public void pay_bank_ac_nm(String value) {
		setConstString(offset + 349, $pay_bank_ac_nm, value);
	}


	/**
	 * Payment per transaction 都度支払.<p>
	 *
	 */
	public boolean pay_spot_flg() {
		return getConstBoolean(offset + 350, $pay_spot_flg);
	}

	/**
	 * Payment per transaction 都度支払.<p>
	 *
	 */
	public void pay_spot_flg(boolean value) {
		setConstBoolean(offset + 350, $pay_spot_flg, value);
	}


	/**
	 * Payment closing date 1 支払締日１.<p>
	 *
	 */
	public MCNumber psppl_cl_day1() {
		return getConstNumber(offset + 351, $psppl_cl_day1);
	}

	/**
	 * Payment closing date 1 支払締日１.<p>
	 *
	 */
	public void psppl_cl_day1(MCNumber value) {
		setConstNumber(offset + 351, $psppl_cl_day1, value);
	}

	/**
	 * Payment closing date 1 支払締日１.<p>
	 *
	 */
	public void psppl_cl_day1(int value) {
		setConstNumber(offset + 351, $psppl_cl_day1, value);
	}

	/**
	 * Payment closing date 1 支払締日１.<p>
	 *
	 */
	public void psppl_cl_day1(long value) {
		setConstNumber(offset + 351, $psppl_cl_day1, value);
	}

	/**
	 * Payment closing date 1 支払締日１.<p>
	 *
	 */
	public void psppl_cl_day1(float value) {
		setConstNumber(offset + 351, $psppl_cl_day1, value);
	}

	/**
	 * Payment closing date 1 支払締日１.<p>
	 *
	 */
	public void psppl_cl_day1(double value) {
		setConstNumber(offset + 351, $psppl_cl_day1, value);
	}


	/**
	 * Payment closing date 2 支払締日２.<p>
	 *
	 */
	public MCNumber psppl_cl_day2() {
		return getConstNumber(offset + 352, $psppl_cl_day2);
	}

	/**
	 * Payment closing date 2 支払締日２.<p>
	 *
	 */
	public void psppl_cl_day2(MCNumber value) {
		setConstNumber(offset + 352, $psppl_cl_day2, value);
	}

	/**
	 * Payment closing date 2 支払締日２.<p>
	 *
	 */
	public void psppl_cl_day2(int value) {
		setConstNumber(offset + 352, $psppl_cl_day2, value);
	}

	/**
	 * Payment closing date 2 支払締日２.<p>
	 *
	 */
	public void psppl_cl_day2(long value) {
		setConstNumber(offset + 352, $psppl_cl_day2, value);
	}

	/**
	 * Payment closing date 2 支払締日２.<p>
	 *
	 */
	public void psppl_cl_day2(float value) {
		setConstNumber(offset + 352, $psppl_cl_day2, value);
	}

	/**
	 * Payment closing date 2 支払締日２.<p>
	 *
	 */
	public void psppl_cl_day2(double value) {
		setConstNumber(offset + 352, $psppl_cl_day2, value);
	}


	/**
	 * Payment closing date 3 支払締日３.<p>
	 *
	 */
	public MCNumber psppl_cl_day3() {
		return getConstNumber(offset + 353, $psppl_cl_day3);
	}

	/**
	 * Payment closing date 3 支払締日３.<p>
	 *
	 */
	public void psppl_cl_day3(MCNumber value) {
		setConstNumber(offset + 353, $psppl_cl_day3, value);
	}

	/**
	 * Payment closing date 3 支払締日３.<p>
	 *
	 */
	public void psppl_cl_day3(int value) {
		setConstNumber(offset + 353, $psppl_cl_day3, value);
	}

	/**
	 * Payment closing date 3 支払締日３.<p>
	 *
	 */
	public void psppl_cl_day3(long value) {
		setConstNumber(offset + 353, $psppl_cl_day3, value);
	}

	/**
	 * Payment closing date 3 支払締日３.<p>
	 *
	 */
	public void psppl_cl_day3(float value) {
		setConstNumber(offset + 353, $psppl_cl_day3, value);
	}

	/**
	 * Payment closing date 3 支払締日３.<p>
	 *
	 */
	public void psppl_cl_day3(double value) {
		setConstNumber(offset + 353, $psppl_cl_day3, value);
	}


	/**
	 * Payment closing date 4 支払締日４.<p>
	 *
	 */
	public MCNumber psppl_cl_day4() {
		return getConstNumber(offset + 354, $psppl_cl_day4);
	}

	/**
	 * Payment closing date 4 支払締日４.<p>
	 *
	 */
	public void psppl_cl_day4(MCNumber value) {
		setConstNumber(offset + 354, $psppl_cl_day4, value);
	}

	/**
	 * Payment closing date 4 支払締日４.<p>
	 *
	 */
	public void psppl_cl_day4(int value) {
		setConstNumber(offset + 354, $psppl_cl_day4, value);
	}

	/**
	 * Payment closing date 4 支払締日４.<p>
	 *
	 */
	public void psppl_cl_day4(long value) {
		setConstNumber(offset + 354, $psppl_cl_day4, value);
	}

	/**
	 * Payment closing date 4 支払締日４.<p>
	 *
	 */
	public void psppl_cl_day4(float value) {
		setConstNumber(offset + 354, $psppl_cl_day4, value);
	}

	/**
	 * Payment closing date 4 支払締日４.<p>
	 *
	 */
	public void psppl_cl_day4(double value) {
		setConstNumber(offset + 354, $psppl_cl_day4, value);
	}


	/**
	 * Payment closing date 5 支払締日５.<p>
	 *
	 */
	public MCNumber psppl_cl_day5() {
		return getConstNumber(offset + 355, $psppl_cl_day5);
	}

	/**
	 * Payment closing date 5 支払締日５.<p>
	 *
	 */
	public void psppl_cl_day5(MCNumber value) {
		setConstNumber(offset + 355, $psppl_cl_day5, value);
	}

	/**
	 * Payment closing date 5 支払締日５.<p>
	 *
	 */
	public void psppl_cl_day5(int value) {
		setConstNumber(offset + 355, $psppl_cl_day5, value);
	}

	/**
	 * Payment closing date 5 支払締日５.<p>
	 *
	 */
	public void psppl_cl_day5(long value) {
		setConstNumber(offset + 355, $psppl_cl_day5, value);
	}

	/**
	 * Payment closing date 5 支払締日５.<p>
	 *
	 */
	public void psppl_cl_day5(float value) {
		setConstNumber(offset + 355, $psppl_cl_day5, value);
	}

	/**
	 * Payment closing date 5 支払締日５.<p>
	 *
	 */
	public void psppl_cl_day5(double value) {
		setConstNumber(offset + 355, $psppl_cl_day5, value);
	}


	/**
	 * AP offset group cd. 債務相殺グループＣＤ.<p>
	 *
	 */
	public String ap_setoff_grp_cd() {
		return getConstString(offset + 356, $ap_setoff_grp_cd);
	}

	/**
	 * AP offset group cd. 債務相殺グループＣＤ.<p>
	 *
	 */
	public void ap_setoff_grp_cd(String value) {
		setConstString(offset + 356, $ap_setoff_grp_cd, value);
	}


	/**
	 * AP offset group name 債務相殺グループ名.<p>
	 *
	 */
	public String ap_setoff_grp_nm() {
		return getConstString(offset + 357, $ap_setoff_grp_nm);
	}

	/**
	 * AP offset group name 債務相殺グループ名.<p>
	 *
	 */
	public void ap_setoff_grp_nm(String value) {
		setConstString(offset + 357, $ap_setoff_grp_nm, value);
	}


	/**
	 * Payment tax calculation 支払税計算.<p>
	 *
	 */
	public boolean tax_on_pay_flg() {
		return getConstBoolean(offset + 358, $tax_on_pay_flg);
	}

	/**
	 * Payment tax calculation 支払税計算.<p>
	 *
	 */
	public void tax_on_pay_flg(boolean value) {
		setConstBoolean(offset + 358, $tax_on_pay_flg, value);
	}


	/**
	 * Payment tax amount rounding type 支払税額端数処理区分.<p>
	 *
	 */
	public String pay_tax_rnd_typ() {
		return getConstString(offset + 359, $pay_tax_rnd_typ);
	}

	/**
	 * Payment tax amount rounding type 支払税額端数処理区分.<p>
	 *
	 */
	public void pay_tax_rnd_typ(String value) {
		setConstString(offset + 359, $pay_tax_rnd_typ, value);
	}


	/**
	 * Payment tax amount rounding type name 支払税額端数処理区分名.<p>
	 *
	 */
	public String pay_tax_rnd_typ_nm() {
		return getConstString(offset + 360, $pay_tax_rnd_typ_nm);
	}

	/**
	 * Payment tax amount rounding type name 支払税額端数処理区分名.<p>
	 *
	 */
	public void pay_tax_rnd_typ_nm(String value) {
		setConstString(offset + 360, $pay_tax_rnd_typ_nm, value);
	}


	/**
	 * Payment schedule before/after type 支払予定前後区分.<p>
	 *
	 */
	public String pay_schd_ba_typ() {
		return getConstString(offset + 361, $pay_schd_ba_typ);
	}

	/**
	 * Payment schedule before/after type 支払予定前後区分.<p>
	 *
	 */
	public void pay_schd_ba_typ(String value) {
		setConstString(offset + 361, $pay_schd_ba_typ, value);
	}


	/**
	 * Payment schedule before/after type name 支払予定前後区分名.<p>
	 *
	 */
	public String pay_schd_ba_typ_nm() {
		return getConstString(offset + 362, $pay_schd_ba_typ_nm);
	}

	/**
	 * Payment schedule before/after type name 支払予定前後区分名.<p>
	 *
	 */
	public void pay_schd_ba_typ_nm(String value) {
		setConstString(offset + 362, $pay_schd_ba_typ_nm, value);
	}


	/**
	 * Batch payment schedule closing バッチ支払予定締.<p>
	 *
	 */
	public boolean batch_pay_schd_cl_flg() {
		return getConstBoolean(offset + 363, $batch_pay_schd_cl_flg);
	}

	/**
	 * Batch payment schedule closing バッチ支払予定締.<p>
	 *
	 */
	public void batch_pay_schd_cl_flg(boolean value) {
		setConstBoolean(offset + 363, $batch_pay_schd_cl_flg, value);
	}


	/**
	 * Payment schedule closing delay days 支払予定締遅延日数.<p>
	 *
	 */
	public MCNumber pay_schd_cl_delay_days() {
		return getConstNumber(offset + 364, $pay_schd_cl_delay_days);
	}

	/**
	 * Payment schedule closing delay days 支払予定締遅延日数.<p>
	 *
	 */
	public void pay_schd_cl_delay_days(MCNumber value) {
		setConstNumber(offset + 364, $pay_schd_cl_delay_days, value);
	}

	/**
	 * Payment schedule closing delay days 支払予定締遅延日数.<p>
	 *
	 */
	public void pay_schd_cl_delay_days(int value) {
		setConstNumber(offset + 364, $pay_schd_cl_delay_days, value);
	}

	/**
	 * Payment schedule closing delay days 支払予定締遅延日数.<p>
	 *
	 */
	public void pay_schd_cl_delay_days(long value) {
		setConstNumber(offset + 364, $pay_schd_cl_delay_days, value);
	}

	/**
	 * Payment schedule closing delay days 支払予定締遅延日数.<p>
	 *
	 */
	public void pay_schd_cl_delay_days(float value) {
		setConstNumber(offset + 364, $pay_schd_cl_delay_days, value);
	}

	/**
	 * Payment schedule closing delay days 支払予定締遅延日数.<p>
	 *
	 */
	public void pay_schd_cl_delay_days(double value) {
		setConstNumber(offset + 364, $pay_schd_cl_delay_days, value);
	}


	/**
	 * Payment schedule closing before/after type 支払予定締前後区分.<p>
	 *
	 */
	public String pay_schd_cl_ba_typ() {
		return getConstString(offset + 365, $pay_schd_cl_ba_typ);
	}

	/**
	 * Payment schedule closing before/after type 支払予定締前後区分.<p>
	 *
	 */
	public void pay_schd_cl_ba_typ(String value) {
		setConstString(offset + 365, $pay_schd_cl_ba_typ, value);
	}


	/**
	 * Payment schedule closing before/after type name 支払予定締前後区分名.<p>
	 *
	 */
	public String pay_schd_cl_ba_typ_nm() {
		return getConstString(offset + 366, $pay_schd_cl_ba_typ_nm);
	}

	/**
	 * Payment schedule closing before/after type name 支払予定締前後区分名.<p>
	 *
	 */
	public void pay_schd_cl_ba_typ_nm(String value) {
		setConstString(offset + 366, $pay_schd_cl_ba_typ_nm, value);
	}


	/**
	 * Report issue type (Scheduled payee) 帳票発行区分（支払予定管理先）.<p>
	 *
	 */
	public String bsppl_prnt_typ() {
		return getConstString(offset + 367, $bsppl_prnt_typ);
	}

	/**
	 * Report issue type (Scheduled payee) 帳票発行区分（支払予定管理先）.<p>
	 *
	 */
	public void bsppl_prnt_typ(String value) {
		setConstString(offset + 367, $bsppl_prnt_typ, value);
	}


	/**
	 * Report issue type name (Scheduled payee) 帳票発行区分名（支払予定管理先）.<p>
	 *
	 */
	public String bsppl_prnt_typ_nm() {
		return getConstString(offset + 368, $bsppl_prnt_typ_nm);
	}

	/**
	 * Report issue type name (Scheduled payee) 帳票発行区分名（支払予定管理先）.<p>
	 *
	 */
	public void bsppl_prnt_typ_nm(String value) {
		setConstString(offset + 368, $bsppl_prnt_typ_nm, value);
	}


	/**
	 * Payment notice to be issued 支払通知書発行対象.<p>
	 *
	 */
	public boolean pay_ntc_prnt_flg() {
		return getConstBoolean(offset + 369, $pay_ntc_prnt_flg);
	}

	/**
	 * Payment notice to be issued 支払通知書発行対象.<p>
	 *
	 */
	public void pay_ntc_prnt_flg(boolean value) {
		setConstBoolean(offset + 369, $pay_ntc_prnt_flg, value);
	}


	/**
	 * Payment notice send-to zip code 支払通知書送付郵便番号.<p>
	 *
	 */
	public String pay_ntc_zip_cd() {
		return getConstString(offset + 370, $pay_ntc_zip_cd);
	}

	/**
	 * Payment notice send-to zip code 支払通知書送付郵便番号.<p>
	 *
	 */
	public void pay_ntc_zip_cd(String value) {
		setConstString(offset + 370, $pay_ntc_zip_cd, value);
	}


	/**
	 * Payment notice send-to address 1 支払通知書送付住所１.<p>
	 *
	 */
	public String pay_ntc_addr1() {
		return getConstString(offset + 371, $pay_ntc_addr1);
	}

	/**
	 * Payment notice send-to address 1 支払通知書送付住所１.<p>
	 *
	 */
	public void pay_ntc_addr1(String value) {
		setConstString(offset + 371, $pay_ntc_addr1, value);
	}


	/**
	 * Payment notice send-to address 2 支払通知書送付住所２.<p>
	 *
	 */
	public String pay_ntc_addr2() {
		return getConstString(offset + 372, $pay_ntc_addr2);
	}

	/**
	 * Payment notice send-to address 2 支払通知書送付住所２.<p>
	 *
	 */
	public void pay_ntc_addr2(String value) {
		setConstString(offset + 372, $pay_ntc_addr2, value);
	}


	/**
	 * Payment notice send-to address 3 支払通知書送付住所３.<p>
	 *
	 */
	public String pay_ntc_addr3() {
		return getConstString(offset + 373, $pay_ntc_addr3);
	}

	/**
	 * Payment notice send-to address 3 支払通知書送付住所３.<p>
	 *
	 */
	public void pay_ntc_addr3(String value) {
		setConstString(offset + 373, $pay_ntc_addr3, value);
	}


	/**
	 * Payment notice send-to address 4 支払通知書送付住所４.<p>
	 *
	 */
	public String pay_ntc_addr4() {
		return getConstString(offset + 374, $pay_ntc_addr4);
	}

	/**
	 * Payment notice send-to address 4 支払通知書送付住所４.<p>
	 *
	 */
	public void pay_ntc_addr4(String value) {
		setConstString(offset + 374, $pay_ntc_addr4, value);
	}


	/**
	 * Payment notice send-to TEL 支払通知書送付ＴＥＬ.<p>
	 *
	 */
	public String pay_ntc_tel() {
		return getConstString(offset + 375, $pay_ntc_tel);
	}

	/**
	 * Payment notice send-to TEL 支払通知書送付ＴＥＬ.<p>
	 *
	 */
	public void pay_ntc_tel(String value) {
		setConstString(offset + 375, $pay_ntc_tel, value);
	}


	/**
	 * Payment notice destination 支払通知書宛先.<p>
	 *
	 */
	public String pay_ntc_bsppl_nm() {
		return getConstString(offset + 376, $pay_ntc_bsppl_nm);
	}

	/**
	 * Payment notice destination 支払通知書宛先.<p>
	 *
	 */
	public void pay_ntc_bsppl_nm(String value) {
		setConstString(offset + 376, $pay_ntc_bsppl_nm, value);
	}


	/**
	 * Payment notice send-to dept. 支払通知書送付部署.<p>
	 *
	 */
	public String pay_ntc_bsppl_dpt() {
		return getConstString(offset + 377, $pay_ntc_bsppl_dpt);
	}

	/**
	 * Payment notice send-to dept. 支払通知書送付部署.<p>
	 *
	 */
	public void pay_ntc_bsppl_dpt(String value) {
		setConstString(offset + 377, $pay_ntc_bsppl_dpt, value);
	}


	/**
	 * Payment notice send-to PIC 支払通知書送付担当者.<p>
	 *
	 */
	public String pay_ntc_bsppl_psn() {
		return getConstString(offset + 378, $pay_ntc_bsppl_psn);
	}

	/**
	 * Payment notice send-to PIC 支払通知書送付担当者.<p>
	 *
	 */
	public void pay_ntc_bsppl_psn(String value) {
		setConstString(offset + 378, $pay_ntc_bsppl_psn, value);
	}


	/**
	 * Payment notice send-to PIC honorific title 支払通知書送付担当者敬称.<p>
	 *
	 */
	public String pay_ntc_bsppl_psn_title() {
		return getConstString(offset + 379, $pay_ntc_bsppl_psn_title);
	}

	/**
	 * Payment notice send-to PIC honorific title 支払通知書送付担当者敬称.<p>
	 *
	 */
	public void pay_ntc_bsppl_psn_title(String value) {
		setConstString(offset + 379, $pay_ntc_bsppl_psn_title, value);
	}


	/**
	 * Output payment notice details 支払通知書明細出力.<p>
	 *
	 */
	public boolean pay_ntc_dtl_outp_flg() {
		return getConstBoolean(offset + 380, $pay_ntc_dtl_outp_flg);
	}

	/**
	 * Output payment notice details 支払通知書明細出力.<p>
	 *
	 */
	public void pay_ntc_dtl_outp_flg(boolean value) {
		setConstBoolean(offset + 380, $pay_ntc_dtl_outp_flg, value);
	}


	/**
	 * Display balance of previous month on payment notice 支払通知書前月残高表示.<p>
	 *
	 */
	public boolean pay_ntc_bfw_bal_disp_flg() {
		return getConstBoolean(offset + 381, $pay_ntc_bfw_bal_disp_flg);
	}

	/**
	 * Display balance of previous month on payment notice 支払通知書前月残高表示.<p>
	 *
	 */
	public void pay_ntc_bfw_bal_disp_flg(boolean value) {
		setConstBoolean(offset + 381, $pay_ntc_bfw_bal_disp_flg, value);
	}


	/**
	 * Display advance payment on payment notice 支払通知書前渡金表示.<p>
	 *
	 */
	public boolean pay_ntc_adv_pay_flg() {
		return getConstBoolean(offset + 382, $pay_ntc_adv_pay_flg);
	}

	/**
	 * Display advance payment on payment notice 支払通知書前渡金表示.<p>
	 *
	 */
	public void pay_ntc_adv_pay_flg(boolean value) {
		setConstBoolean(offset + 382, $pay_ntc_adv_pay_flg, value);
	}


	/**
	 * Display payment schedule on payment notice 支払通知書支払予定表示.<p>
	 *
	 */
	public boolean pay_ntc_dtl_pay_flg() {
		return getConstBoolean(offset + 383, $pay_ntc_dtl_pay_flg);
	}

	/**
	 * Display payment schedule on payment notice 支払通知書支払予定表示.<p>
	 *
	 */
	public void pay_ntc_dtl_pay_flg(boolean value) {
		setConstBoolean(offset + 383, $pay_ntc_dtl_pay_flg, value);
	}


	/**
	 * Payment notice details subtotal type 支払通知書明細小計区分.<p>
	 *
	 */
	public String pay_ntc_dtl_subttl_typ() {
		return getConstString(offset + 384, $pay_ntc_dtl_subttl_typ);
	}

	/**
	 * Payment notice details subtotal type 支払通知書明細小計区分.<p>
	 *
	 */
	public void pay_ntc_dtl_subttl_typ(String value) {
		setConstString(offset + 384, $pay_ntc_dtl_subttl_typ, value);
	}


	/**
	 * Payment notice details subtotal type name 支払通知書明細小計区分名.<p>
	 *
	 */
	public String pay_ntc_dtl_subttl_typ_nm() {
		return getConstString(offset + 385, $pay_ntc_dtl_subttl_typ_nm);
	}

	/**
	 * Payment notice details subtotal type name 支払通知書明細小計区分名.<p>
	 *
	 */
	public void pay_ntc_dtl_subttl_typ_nm(String value) {
		setConstString(offset + 385, $pay_ntc_dtl_subttl_typ_nm, value);
	}


	/**
	 * Payment notice details page break type 支払通知書明細改頁区分.<p>
	 *
	 */
	public String pay_ntc_dtl_brk_typ() {
		return getConstString(offset + 386, $pay_ntc_dtl_brk_typ);
	}

	/**
	 * Payment notice details page break type 支払通知書明細改頁区分.<p>
	 *
	 */
	public void pay_ntc_dtl_brk_typ(String value) {
		setConstString(offset + 386, $pay_ntc_dtl_brk_typ, value);
	}


	/**
	 * Payment notice details page break type name 支払通知書明細改頁区分名.<p>
	 *
	 */
	public String pay_ntc_dtl_brk_typ_nm() {
		return getConstString(offset + 387, $pay_ntc_dtl_brk_typ_nm);
	}

	/**
	 * Payment notice details page break type name 支払通知書明細改頁区分名.<p>
	 *
	 */
	public void pay_ntc_dtl_brk_typ_nm(String value) {
		setConstString(offset + 387, $pay_ntc_dtl_brk_typ_nm, value);
	}


	/**
	 * Payment notice details sorting order type 支払通知書明細並順区分.<p>
	 *
	 */
	public String pay_ntc_dtl_sort_typ() {
		return getConstString(offset + 388, $pay_ntc_dtl_sort_typ);
	}

	/**
	 * Payment notice details sorting order type 支払通知書明細並順区分.<p>
	 *
	 */
	public void pay_ntc_dtl_sort_typ(String value) {
		setConstString(offset + 388, $pay_ntc_dtl_sort_typ, value);
	}


	/**
	 * Payment notice details sorting order type name 支払通知書明細並順区分名.<p>
	 *
	 */
	public String pay_ntc_dtl_sort_typ_nm() {
		return getConstString(offset + 389, $pay_ntc_dtl_sort_typ_nm);
	}

	/**
	 * Payment notice details sorting order type name 支払通知書明細並順区分名.<p>
	 *
	 */
	public void pay_ntc_dtl_sort_typ_nm(String value) {
		setConstString(offset + 389, $pay_ntc_dtl_sort_typ_nm, value);
	}


	/**
	 * Payment notice cancel slip display type 支払通知書取消伝票表示区分.<p>
	 *
	 */
	public String pay_ntc_can_slip_typ() {
		return getConstString(offset + 390, $pay_ntc_can_slip_typ);
	}

	/**
	 * Payment notice cancel slip display type 支払通知書取消伝票表示区分.<p>
	 *
	 */
	public void pay_ntc_can_slip_typ(String value) {
		setConstString(offset + 390, $pay_ntc_can_slip_typ, value);
	}


	/**
	 * Payment notice cancel slip display type name 支払通知書取消伝票表示区分名.<p>
	 *
	 */
	public String pay_ntc_can_slip_typ_nm() {
		return getConstString(offset + 391, $pay_ntc_can_slip_typ_nm);
	}

	/**
	 * Payment notice cancel slip display type name 支払通知書取消伝票表示区分名.<p>
	 *
	 */
	public void pay_ntc_can_slip_typ_nm(String value) {
		setConstString(offset + 391, $pay_ntc_can_slip_typ_nm, value);
	}


	/**
	 * Payee remarks 支払先備考.<p>
	 *
	 */
	public String psppl_rmrks() {
		return getConstString(offset + 392, $psppl_rmrks);
	}

	/**
	 * Payee remarks 支払先備考.<p>
	 *
	 */
	public void psppl_rmrks(String value) {
		setConstString(offset + 392, $psppl_rmrks, value);
	}


	/**
	 * Note sight upper limit 手形サイト上限.<p>
	 *
	 */
	public MCNumber note_days() {
		return getConstNumber(offset + 393, $note_days);
	}

	/**
	 * Note sight upper limit 手形サイト上限.<p>
	 *
	 */
	public void note_days(MCNumber value) {
		setConstNumber(offset + 393, $note_days, value);
	}

	/**
	 * Note sight upper limit 手形サイト上限.<p>
	 *
	 */
	public void note_days(int value) {
		setConstNumber(offset + 393, $note_days, value);
	}

	/**
	 * Note sight upper limit 手形サイト上限.<p>
	 *
	 */
	public void note_days(long value) {
		setConstNumber(offset + 393, $note_days, value);
	}

	/**
	 * Note sight upper limit 手形サイト上限.<p>
	 *
	 */
	public void note_days(float value) {
		setConstNumber(offset + 393, $note_days, value);
	}

	/**
	 * Note sight upper limit 手形サイト上限.<p>
	 *
	 */
	public void note_days(double value) {
		setConstNumber(offset + 393, $note_days, value);
	}


	/**
	 * Payment dept. cd. 支払部門ＣＤ.<p>
	 *
	 */
	public String pay_dpt_cd() {
		return getConstString(offset + 394, $pay_dpt_cd);
	}

	/**
	 * Payment dept. cd. 支払部門ＣＤ.<p>
	 *
	 */
	public void pay_dpt_cd(String value) {
		setConstString(offset + 394, $pay_dpt_cd, value);
	}


	/**
	 * Payment dept. name 支払部門名.<p>
	 *
	 */
	public String pay_dpt_nm() {
		return getConstString(offset + 395, $pay_dpt_nm);
	}

	/**
	 * Payment dept. name 支払部門名.<p>
	 *
	 */
	public void pay_dpt_nm(String value) {
		setConstString(offset + 395, $pay_dpt_nm, value);
	}


	/**
	 * Payment dept. cd. 支払部門ＣＤ.<p>
	 *
	 */
	public String check_pay_dpt_cd() {
		return getConstString(offset + 396, $check_pay_dpt_cd);
	}

	/**
	 * Payment dept. cd. 支払部門ＣＤ.<p>
	 *
	 */
	public void check_pay_dpt_cd(String value) {
		setConstString(offset + 396, $check_pay_dpt_cd, value);
	}


	/**
	 * Report issue type (Payee) 帳票発行区分（支払先）.<p>
	 *
	 */
	public String psppl_prnt_typ() {
		return getConstString(offset + 397, $psppl_prnt_typ);
	}

	/**
	 * Report issue type (Payee) 帳票発行区分（支払先）.<p>
	 *
	 */
	public void psppl_prnt_typ(String value) {
		setConstString(offset + 397, $psppl_prnt_typ, value);
	}


	/**
	 * Report issue type name (Payee) 帳票発行区分名（支払先）.<p>
	 *
	 */
	public String psppl_prnt_typ_nm() {
		return getConstString(offset + 398, $psppl_prnt_typ_nm);
	}

	/**
	 * Report issue type name (Payee) 帳票発行区分名（支払先）.<p>
	 *
	 */
	public void psppl_prnt_typ_nm(String value) {
		setConstString(offset + 398, $psppl_prnt_typ_nm, value);
	}


	/**
	 * Update counter (BP company master) 更新カウンタ（取引先会社マスタ）.<p>
	 *
	 */
	public MCNumber bp_com_upd_cntr() {
		return getConstNumber(offset + 399, $bp_com_upd_cntr);
	}

	/**
	 * Update counter (BP company master) 更新カウンタ（取引先会社マスタ）.<p>
	 *
	 */
	public void bp_com_upd_cntr(MCNumber value) {
		setConstNumber(offset + 399, $bp_com_upd_cntr, value);
	}

	/**
	 * Update counter (BP company master) 更新カウンタ（取引先会社マスタ）.<p>
	 *
	 */
	public void bp_com_upd_cntr(int value) {
		setConstNumber(offset + 399, $bp_com_upd_cntr, value);
	}

	/**
	 * Update counter (BP company master) 更新カウンタ（取引先会社マスタ）.<p>
	 *
	 */
	public void bp_com_upd_cntr(long value) {
		setConstNumber(offset + 399, $bp_com_upd_cntr, value);
	}

	/**
	 * Update counter (BP company master) 更新カウンタ（取引先会社マスタ）.<p>
	 *
	 */
	public void bp_com_upd_cntr(float value) {
		setConstNumber(offset + 399, $bp_com_upd_cntr, value);
	}

	/**
	 * Update counter (BP company master) 更新カウンタ（取引先会社マスタ）.<p>
	 *
	 */
	public void bp_com_upd_cntr(double value) {
		setConstNumber(offset + 399, $bp_com_upd_cntr, value);
	}


	/**
	 * Select 選択.<p>
	 *
	 */
	public boolean check() {
		return getConstBoolean(offset + 400, $check);
	}

	/**
	 * Select 選択.<p>
	 *
	 */
	public void check(boolean value) {
		setConstBoolean(offset + 400, $check, value);
	}


	public String getString(String name) {
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm_lcl.equalsIgnoreCase(name)) {
			return bp_nm_lcl();
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
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			return cntry_cd();
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			return cntry_nm();
		}
		if ($area_cd.equalsIgnoreCase(name)) {
			return area_cd();
		}
		if ($area_nm.equalsIgnoreCase(name)) {
			return area_nm();
		}
		if ($biz_co_no.equalsIgnoreCase(name)) {
			return biz_co_no();
		}
		if ($ein.equalsIgnoreCase(name)) {
			return ein();
		}
		if ($std_co_cd.equalsIgnoreCase(name)) {
			return std_co_cd();
		}
		if ($tel.equalsIgnoreCase(name)) {
			return tel();
		}
		if ($fax.equalsIgnoreCase(name)) {
			return fax();
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
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			return prnt_lcl_cd();
		}
		if ($prnt_lcl_nm.equalsIgnoreCase(name)) {
			return prnt_lcl_nm();
		}
		if ($bp_alc_grp.equalsIgnoreCase(name)) {
			return bp_alc_grp();
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
		if ($bp_grp_cd1.equalsIgnoreCase(name)) {
			return bp_grp_cd1();
		}
		if ($bp_grp_nm1.equalsIgnoreCase(name)) {
			return bp_grp_nm1();
		}
		if ($bp_grp_cd2.equalsIgnoreCase(name)) {
			return bp_grp_cd2();
		}
		if ($bp_grp_nm2.equalsIgnoreCase(name)) {
			return bp_grp_nm2();
		}
		if ($bp_grp_cd3.equalsIgnoreCase(name)) {
			return bp_grp_cd3();
		}
		if ($bp_grp_nm3.equalsIgnoreCase(name)) {
			return bp_grp_nm3();
		}
		if ($bp_grp_cd4.equalsIgnoreCase(name)) {
			return bp_grp_cd4();
		}
		if ($bp_grp_nm4.equalsIgnoreCase(name)) {
			return bp_grp_nm4();
		}
		if ($bp_grp_cd5.equalsIgnoreCase(name)) {
			return bp_grp_cd5();
		}
		if ($bp_grp_nm5.equalsIgnoreCase(name)) {
			return bp_grp_nm5();
		}
		if ($bp_grp_cd6.equalsIgnoreCase(name)) {
			return bp_grp_cd6();
		}
		if ($bp_grp_nm6.equalsIgnoreCase(name)) {
			return bp_grp_nm6();
		}
		if ($bp_grp_cd7.equalsIgnoreCase(name)) {
			return bp_grp_cd7();
		}
		if ($bp_grp_nm7.equalsIgnoreCase(name)) {
			return bp_grp_nm7();
		}
		if ($bp_grp_cd8.equalsIgnoreCase(name)) {
			return bp_grp_cd8();
		}
		if ($bp_grp_nm8.equalsIgnoreCase(name)) {
			return bp_grp_nm8();
		}
		if ($bp_grp_cd9.equalsIgnoreCase(name)) {
			return bp_grp_cd9();
		}
		if ($bp_grp_nm9.equalsIgnoreCase(name)) {
			return bp_grp_nm9();
		}
		if ($bp_grp_cd10.equalsIgnoreCase(name)) {
			return bp_grp_cd10();
		}
		if ($bp_grp_nm10.equalsIgnoreCase(name)) {
			return bp_grp_nm10();
		}
		if ($ins_usr_id_c.equalsIgnoreCase(name)) {
			return ins_usr_id_c();
		}
		if ($ins_usr_nm_c.equalsIgnoreCase(name)) {
			return ins_usr_nm_c();
		}
		if ($ins_func_id_c.equalsIgnoreCase(name)) {
			return ins_func_id_c();
		}
		if ($ins_func_nm_c.equalsIgnoreCase(name)) {
			return ins_func_nm_c();
		}
		if ($upd_usr_id_c.equalsIgnoreCase(name)) {
			return upd_usr_id_c();
		}
		if ($upd_usr_nm_c.equalsIgnoreCase(name)) {
			return upd_usr_nm_c();
		}
		if ($upd_func_id_c.equalsIgnoreCase(name)) {
			return upd_func_id_c();
		}
		if ($upd_func_nm_c.equalsIgnoreCase(name)) {
			return upd_func_nm_c();
		}
		if ($upd_srv_req_no_c.equalsIgnoreCase(name)) {
			return upd_srv_req_no_c();
		}
		if ($del_usr_id_c.equalsIgnoreCase(name)) {
			return del_usr_id_c();
		}
		if ($del_usr_nm_c.equalsIgnoreCase(name)) {
			return del_usr_nm_c();
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			return ins_usr_id();
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			return ins_usr_nm();
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			return ins_func_id();
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			return ins_func_nm();
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			return upd_usr_id();
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			return upd_usr_nm();
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			return upd_func_id();
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			return upd_func_nm();
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			return upd_srv_req_no();
		}
		if ($del_usr_id.equalsIgnoreCase(name)) {
			return del_usr_id();
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			return del_usr_nm();
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($acst_nm.equalsIgnoreCase(name)) {
			return acst_nm();
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
		if ($ar_dpt_typ.equalsIgnoreCase(name)) {
			return ar_dpt_typ();
		}
		if ($ar_dpt_typ_nm.equalsIgnoreCase(name)) {
			return ar_dpt_typ_nm();
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($ar_dpt_nm.equalsIgnoreCase(name)) {
			return ar_dpt_nm();
		}
		if ($check_ar_dpt_cd.equalsIgnoreCase(name)) {
			return check_ar_dpt_cd();
		}
		if ($sls_upri_rnd_typ.equalsIgnoreCase(name)) {
			return sls_upri_rnd_typ();
		}
		if ($sls_upri_rnd_typ_nm.equalsIgnoreCase(name)) {
			return sls_upri_rnd_typ_nm();
		}
		if ($sls_upri_req_typ.equalsIgnoreCase(name)) {
			return sls_upri_req_typ();
		}
		if ($sls_upri_req_typ_nm.equalsIgnoreCase(name)) {
			return sls_upri_req_typ_nm();
		}
		if ($sls_amt_rnd_typ.equalsIgnoreCase(name)) {
			return sls_amt_rnd_typ();
		}
		if ($sls_amt_rnd_typ_nm.equalsIgnoreCase(name)) {
			return sls_amt_rnd_typ_nm();
		}
		if ($sls_tax_calc_typ.equalsIgnoreCase(name)) {
			return sls_tax_calc_typ();
		}
		if ($sls_tax_calc_typ_nm.equalsIgnoreCase(name)) {
			return sls_tax_calc_typ_nm();
		}
		if ($sls_tax_rnd_typ.equalsIgnoreCase(name)) {
			return sls_tax_rnd_typ();
		}
		if ($sls_tax_rnd_typ_nm.equalsIgnoreCase(name)) {
			return sls_tax_rnd_typ_nm();
		}
		if ($sls_tax_cd.equalsIgnoreCase(name)) {
			return sls_tax_cd();
		}
		if ($sls_tax_nm.equalsIgnoreCase(name)) {
			return sls_tax_nm();
		}
		if ($lot_back_stop_typ.equalsIgnoreCase(name)) {
			return lot_back_stop_typ();
		}
		if ($lot_back_stop_typ_nm.equalsIgnoreCase(name)) {
			return lot_back_stop_typ_nm();
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			return sls_basis_typ();
		}
		if ($sls_basis_typ_nm.equalsIgnoreCase(name)) {
			return sls_basis_typ_nm();
		}
		if ($bill_basis_typ.equalsIgnoreCase(name)) {
			return bill_basis_typ();
		}
		if ($bill_basis_typ_nm.equalsIgnoreCase(name)) {
			return bill_basis_typ_nm();
		}
		if ($slip_each_lot_typ.equalsIgnoreCase(name)) {
			return slip_each_lot_typ();
		}
		if ($slip_each_lot_typ_nm.equalsIgnoreCase(name)) {
			return slip_each_lot_typ_nm();
		}
		if ($ship_schd_split_typ.equalsIgnoreCase(name)) {
			return ship_schd_split_typ();
		}
		if ($ship_schd_split_typ_nm.equalsIgnoreCase(name)) {
			return ship_schd_split_typ_nm();
		}
		if ($stk_lst_form_cd.equalsIgnoreCase(name)) {
			return stk_lst_form_cd();
		}
		if ($stk_lst_form_nm.equalsIgnoreCase(name)) {
			return stk_lst_form_nm();
		}
		if ($cst_ship_form_cd.equalsIgnoreCase(name)) {
			return cst_ship_form_cd();
		}
		if ($cst_ship_form_nm.equalsIgnoreCase(name)) {
			return cst_ship_form_nm();
		}
		if ($cst_tterm_cd1.equalsIgnoreCase(name)) {
			return cst_tterm_cd1();
		}
		if ($cst_tterm_nm1.equalsIgnoreCase(name)) {
			return cst_tterm_nm1();
		}
		if ($cst_tterm_cd2.equalsIgnoreCase(name)) {
			return cst_tterm_cd2();
		}
		if ($cst_tterm_nm2.equalsIgnoreCase(name)) {
			return cst_tterm_nm2();
		}
		if ($cst_tterm_cd3.equalsIgnoreCase(name)) {
			return cst_tterm_cd3();
		}
		if ($cst_tterm_nm3.equalsIgnoreCase(name)) {
			return cst_tterm_nm3();
		}
		if ($sls_anly_cd1.equalsIgnoreCase(name)) {
			return sls_anly_cd1();
		}
		if ($sls_anly_nm1.equalsIgnoreCase(name)) {
			return sls_anly_nm1();
		}
		if ($sls_anly_cd2.equalsIgnoreCase(name)) {
			return sls_anly_cd2();
		}
		if ($sls_anly_nm2.equalsIgnoreCase(name)) {
			return sls_anly_nm2();
		}
		if ($sls_anly_cd3.equalsIgnoreCase(name)) {
			return sls_anly_cd3();
		}
		if ($sls_anly_nm3.equalsIgnoreCase(name)) {
			return sls_anly_nm3();
		}
		if ($cst_prnt_typ.equalsIgnoreCase(name)) {
			return cst_prnt_typ();
		}
		if ($cst_prnt_typ_nm.equalsIgnoreCase(name)) {
			return cst_prnt_typ_nm();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			return bcst_nm();
		}
		if ($acst_prnt_typ.equalsIgnoreCase(name)) {
			return acst_prnt_typ();
		}
		if ($acst_prnt_typ_nm.equalsIgnoreCase(name)) {
			return acst_prnt_typ_nm();
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			return rcst_cd();
		}
		if ($rcst_nm.equalsIgnoreCase(name)) {
			return rcst_nm();
		}
		if ($ar_cred_cd.equalsIgnoreCase(name)) {
			return ar_cred_cd();
		}
		if ($ar_cred_nm.equalsIgnoreCase(name)) {
			return ar_cred_nm();
		}
		if ($bill_dpt_typ.equalsIgnoreCase(name)) {
			return bill_dpt_typ();
		}
		if ($bill_dpt_typ_nm.equalsIgnoreCase(name)) {
			return bill_dpt_typ_nm();
		}
		if ($bcst_dpt_cd.equalsIgnoreCase(name)) {
			return bcst_dpt_cd();
		}
		if ($bcst_dpt_nm.equalsIgnoreCase(name)) {
			return bcst_dpt_nm();
		}
		if ($check_bcst_dpt_cd.equalsIgnoreCase(name)) {
			return check_bcst_dpt_cd();
		}
		if ($bill_cl_typ.equalsIgnoreCase(name)) {
			return bill_cl_typ();
		}
		if ($bill_cl_typ_nm.equalsIgnoreCase(name)) {
			return bill_cl_typ_nm();
		}
		if ($bill_tax_rnd_typ.equalsIgnoreCase(name)) {
			return bill_tax_rnd_typ();
		}
		if ($bill_tax_rnd_typ_nm.equalsIgnoreCase(name)) {
			return bill_tax_rnd_typ_nm();
		}
		if ($bill_cl_ba_typ.equalsIgnoreCase(name)) {
			return bill_cl_ba_typ();
		}
		if ($bill_cl_ba_typ_nm.equalsIgnoreCase(name)) {
			return bill_cl_ba_typ_nm();
		}
		if ($bill_cal_cd.equalsIgnoreCase(name)) {
			return bill_cal_cd();
		}
		if ($bill_cal_nm.equalsIgnoreCase(name)) {
			return bill_cal_nm();
		}
		if ($rcv_ba_typ.equalsIgnoreCase(name)) {
			return rcv_ba_typ();
		}
		if ($rcv_ba_typ_nm.equalsIgnoreCase(name)) {
			return rcv_ba_typ_nm();
		}
		if ($ar_setoff_grp_cd.equalsIgnoreCase(name)) {
			return ar_setoff_grp_cd();
		}
		if ($ar_setoff_grp_nm.equalsIgnoreCase(name)) {
			return ar_setoff_grp_nm();
		}
		if ($bcst_prnt_typ.equalsIgnoreCase(name)) {
			return bcst_prnt_typ();
		}
		if ($bcst_prnt_typ_nm.equalsIgnoreCase(name)) {
			return bcst_prnt_typ_nm();
		}
		if ($bill_zip_cd.equalsIgnoreCase(name)) {
			return bill_zip_cd();
		}
		if ($bill_addr1.equalsIgnoreCase(name)) {
			return bill_addr1();
		}
		if ($bill_addr2.equalsIgnoreCase(name)) {
			return bill_addr2();
		}
		if ($bill_addr3.equalsIgnoreCase(name)) {
			return bill_addr3();
		}
		if ($bill_addr4.equalsIgnoreCase(name)) {
			return bill_addr4();
		}
		if ($bill_tel.equalsIgnoreCase(name)) {
			return bill_tel();
		}
		if ($bill_bcst_nm.equalsIgnoreCase(name)) {
			return bill_bcst_nm();
		}
		if ($bill_bcst_dpt.equalsIgnoreCase(name)) {
			return bill_bcst_dpt();
		}
		if ($bill_bcst_psn.equalsIgnoreCase(name)) {
			return bill_bcst_psn();
		}
		if ($bill_bcst_psn_title.equalsIgnoreCase(name)) {
			return bill_bcst_psn_title();
		}
		if ($bill_prnt_typ.equalsIgnoreCase(name)) {
			return bill_prnt_typ();
		}
		if ($bill_prnt_typ_nm.equalsIgnoreCase(name)) {
			return bill_prnt_typ_nm();
		}
		if ($sls_dtl_outp_typ.equalsIgnoreCase(name)) {
			return sls_dtl_outp_typ();
		}
		if ($sls_dtl_outp_typ_nm.equalsIgnoreCase(name)) {
			return sls_dtl_outp_typ_nm();
		}
		if ($bill_dtl_subttl_typ.equalsIgnoreCase(name)) {
			return bill_dtl_subttl_typ();
		}
		if ($bill_dtl_subttl_typ_nm.equalsIgnoreCase(name)) {
			return bill_dtl_subttl_typ_nm();
		}
		if ($bill_dtl_brk_typ.equalsIgnoreCase(name)) {
			return bill_dtl_brk_typ();
		}
		if ($bill_dtl_brk_typ_nm.equalsIgnoreCase(name)) {
			return bill_dtl_brk_typ_nm();
		}
		if ($bill_dtl_sort_typ.equalsIgnoreCase(name)) {
			return bill_dtl_sort_typ();
		}
		if ($bill_dtl_sort_typ_nm.equalsIgnoreCase(name)) {
			return bill_dtl_sort_typ_nm();
		}
		if ($bill_can_slip_typ.equalsIgnoreCase(name)) {
			return bill_can_slip_typ();
		}
		if ($bill_can_slip_typ_nm.equalsIgnoreCase(name)) {
			return bill_can_slip_typ_nm();
		}
		if ($xfr_psn.equalsIgnoreCase(name)) {
			return xfr_psn();
		}
		if ($rcst_prnt_typ.equalsIgnoreCase(name)) {
			return rcst_prnt_typ();
		}
		if ($rcst_prnt_typ_nm.equalsIgnoreCase(name)) {
			return rcst_prnt_typ_nm();
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			return lg_grp_nm();
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			return via_dlv_typ();
		}
		if ($via_dlv_typ_nm.equalsIgnoreCase(name)) {
			return via_dlv_typ_nm();
		}
		if ($dlv_cal_cd.equalsIgnoreCase(name)) {
			return dlv_cal_cd();
		}
		if ($dlv_cal_nm.equalsIgnoreCase(name)) {
			return dlv_cal_nm();
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
		if ($dlv_chnnl1.equalsIgnoreCase(name)) {
			return dlv_chnnl1();
		}
		if ($dlv_chnnl2.equalsIgnoreCase(name)) {
			return dlv_chnnl2();
		}
		if ($dlv_chnnl3.equalsIgnoreCase(name)) {
			return dlv_chnnl3();
		}
		if ($dlv_prnt_typ.equalsIgnoreCase(name)) {
			return dlv_prnt_typ();
		}
		if ($dlv_prnt_typ_nm.equalsIgnoreCase(name)) {
			return dlv_prnt_typ_nm();
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			return asppl_cd();
		}
		if ($asppl_nm.equalsIgnoreCase(name)) {
			return asppl_nm();
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
		if ($vmi_purc_dpt_cd.equalsIgnoreCase(name)) {
			return vmi_purc_dpt_cd();
		}
		if ($vmi_purc_dpt_nm.equalsIgnoreCase(name)) {
			return vmi_purc_dpt_nm();
		}
		if ($check_vmi_purc_dpt_cd.equalsIgnoreCase(name)) {
			return check_vmi_purc_dpt_cd();
		}
		if ($purc_upri_req_typ.equalsIgnoreCase(name)) {
			return purc_upri_req_typ();
		}
		if ($purc_upri_req_typ_nm.equalsIgnoreCase(name)) {
			return purc_upri_req_typ_nm();
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			return purc_amt_rnd_typ();
		}
		if ($purc_amt_rnd_typ_nm.equalsIgnoreCase(name)) {
			return purc_amt_rnd_typ_nm();
		}
		if ($purc_tax_calc_typ.equalsIgnoreCase(name)) {
			return purc_tax_calc_typ();
		}
		if ($purc_tax_calc_typ_nm.equalsIgnoreCase(name)) {
			return purc_tax_calc_typ_nm();
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			return purc_tax_rnd_typ();
		}
		if ($purc_tax_rnd_typ_nm.equalsIgnoreCase(name)) {
			return purc_tax_rnd_typ_nm();
		}
		if ($purc_tax_cd.equalsIgnoreCase(name)) {
			return purc_tax_cd();
		}
		if ($purc_tax_nm.equalsIgnoreCase(name)) {
			return purc_tax_nm();
		}
		if ($sppl_cal_cd.equalsIgnoreCase(name)) {
			return sppl_cal_cd();
		}
		if ($sppl_cal_nm.equalsIgnoreCase(name)) {
			return sppl_cal_nm();
		}
		if ($po_print_cd.equalsIgnoreCase(name)) {
			return po_print_cd();
		}
		if ($po_print_nm.equalsIgnoreCase(name)) {
			return po_print_nm();
		}
		if ($sppl_ship_form_cd.equalsIgnoreCase(name)) {
			return sppl_ship_form_cd();
		}
		if ($sppl_ship_form_nm.equalsIgnoreCase(name)) {
			return sppl_ship_form_nm();
		}
		if ($prov_rcv_typ.equalsIgnoreCase(name)) {
			return prov_rcv_typ();
		}
		if ($prov_rcv_typ_nm.equalsIgnoreCase(name)) {
			return prov_rcv_typ_nm();
		}
		if ($purc_slip_each_lot_typ.equalsIgnoreCase(name)) {
			return purc_slip_each_lot_typ();
		}
		if ($purc_slip_each_lot_typ_nm.equalsIgnoreCase(name)) {
			return purc_slip_each_lot_typ_nm();
		}
		if ($sppl_tterm_cd1.equalsIgnoreCase(name)) {
			return sppl_tterm_cd1();
		}
		if ($sppl_tterm_nm1.equalsIgnoreCase(name)) {
			return sppl_tterm_nm1();
		}
		if ($sppl_tterm_cd2.equalsIgnoreCase(name)) {
			return sppl_tterm_cd2();
		}
		if ($sppl_tterm_nm2.equalsIgnoreCase(name)) {
			return sppl_tterm_nm2();
		}
		if ($sppl_tterm_cd3.equalsIgnoreCase(name)) {
			return sppl_tterm_cd3();
		}
		if ($sppl_tterm_nm3.equalsIgnoreCase(name)) {
			return sppl_tterm_nm3();
		}
		if ($purc_basis_typ.equalsIgnoreCase(name)) {
			return purc_basis_typ();
		}
		if ($purc_basis_typ_nm.equalsIgnoreCase(name)) {
			return purc_basis_typ_nm();
		}
		if ($outsrc_upri_typ.equalsIgnoreCase(name)) {
			return outsrc_upri_typ();
		}
		if ($outsrc_upri_typ_nm.equalsIgnoreCase(name)) {
			return outsrc_upri_typ_nm();
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			return prov_basis_typ();
		}
		if ($prov_basis_typ_nm.equalsIgnoreCase(name)) {
			return prov_basis_typ_nm();
		}
		if ($prov_tax_cd.equalsIgnoreCase(name)) {
			return prov_tax_cd();
		}
		if ($prov_tax_nm.equalsIgnoreCase(name)) {
			return prov_tax_nm();
		}
		if ($prov_amt_rnd_typ.equalsIgnoreCase(name)) {
			return prov_amt_rnd_typ();
		}
		if ($prov_amt_rnd_typ_nm.equalsIgnoreCase(name)) {
			return prov_amt_rnd_typ_nm();
		}
		if ($prov_tax_calc_typ.equalsIgnoreCase(name)) {
			return prov_tax_calc_typ();
		}
		if ($prov_tax_calc_typ_nm.equalsIgnoreCase(name)) {
			return prov_tax_calc_typ_nm();
		}
		if ($prov_tax_rnd_typ.equalsIgnoreCase(name)) {
			return prov_tax_rnd_typ();
		}
		if ($prov_tax_rnd_typ_nm.equalsIgnoreCase(name)) {
			return prov_tax_rnd_typ_nm();
		}
		if ($sppl_prnt_typ.equalsIgnoreCase(name)) {
			return sppl_prnt_typ();
		}
		if ($sppl_prnt_typ_nm.equalsIgnoreCase(name)) {
			return sppl_prnt_typ_nm();
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			return bsppl_cd();
		}
		if ($bsppl_nm.equalsIgnoreCase(name)) {
			return bsppl_nm();
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			return ap_dpt_nm();
		}
		if ($check_ap_dpt_cd.equalsIgnoreCase(name)) {
			return check_ap_dpt_cd();
		}
		if ($asppl_prnt_typ.equalsIgnoreCase(name)) {
			return asppl_prnt_typ();
		}
		if ($asppl_prnt_typ_nm.equalsIgnoreCase(name)) {
			return asppl_prnt_typ_nm();
		}
		if ($psppl_cd.equalsIgnoreCase(name)) {
			return psppl_cd();
		}
		if ($psppl_nm.equalsIgnoreCase(name)) {
			return psppl_nm();
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			return bsppl_dpt_cd();
		}
		if ($bsppl_dpt_nm.equalsIgnoreCase(name)) {
			return bsppl_dpt_nm();
		}
		if ($check_bsppl_dpt_cd.equalsIgnoreCase(name)) {
			return check_bsppl_dpt_cd();
		}
		if ($ap_cred_cd.equalsIgnoreCase(name)) {
			return ap_cred_cd();
		}
		if ($ap_cred_nm.equalsIgnoreCase(name)) {
			return ap_cred_nm();
		}
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			return pay_bank_ac_cd();
		}
		if ($pay_bank_ac_nm.equalsIgnoreCase(name)) {
			return pay_bank_ac_nm();
		}
		if ($ap_setoff_grp_cd.equalsIgnoreCase(name)) {
			return ap_setoff_grp_cd();
		}
		if ($ap_setoff_grp_nm.equalsIgnoreCase(name)) {
			return ap_setoff_grp_nm();
		}
		if ($pay_tax_rnd_typ.equalsIgnoreCase(name)) {
			return pay_tax_rnd_typ();
		}
		if ($pay_tax_rnd_typ_nm.equalsIgnoreCase(name)) {
			return pay_tax_rnd_typ_nm();
		}
		if ($pay_schd_ba_typ.equalsIgnoreCase(name)) {
			return pay_schd_ba_typ();
		}
		if ($pay_schd_ba_typ_nm.equalsIgnoreCase(name)) {
			return pay_schd_ba_typ_nm();
		}
		if ($pay_schd_cl_ba_typ.equalsIgnoreCase(name)) {
			return pay_schd_cl_ba_typ();
		}
		if ($pay_schd_cl_ba_typ_nm.equalsIgnoreCase(name)) {
			return pay_schd_cl_ba_typ_nm();
		}
		if ($bsppl_prnt_typ.equalsIgnoreCase(name)) {
			return bsppl_prnt_typ();
		}
		if ($bsppl_prnt_typ_nm.equalsIgnoreCase(name)) {
			return bsppl_prnt_typ_nm();
		}
		if ($pay_ntc_zip_cd.equalsIgnoreCase(name)) {
			return pay_ntc_zip_cd();
		}
		if ($pay_ntc_addr1.equalsIgnoreCase(name)) {
			return pay_ntc_addr1();
		}
		if ($pay_ntc_addr2.equalsIgnoreCase(name)) {
			return pay_ntc_addr2();
		}
		if ($pay_ntc_addr3.equalsIgnoreCase(name)) {
			return pay_ntc_addr3();
		}
		if ($pay_ntc_addr4.equalsIgnoreCase(name)) {
			return pay_ntc_addr4();
		}
		if ($pay_ntc_tel.equalsIgnoreCase(name)) {
			return pay_ntc_tel();
		}
		if ($pay_ntc_bsppl_nm.equalsIgnoreCase(name)) {
			return pay_ntc_bsppl_nm();
		}
		if ($pay_ntc_bsppl_dpt.equalsIgnoreCase(name)) {
			return pay_ntc_bsppl_dpt();
		}
		if ($pay_ntc_bsppl_psn.equalsIgnoreCase(name)) {
			return pay_ntc_bsppl_psn();
		}
		if ($pay_ntc_bsppl_psn_title.equalsIgnoreCase(name)) {
			return pay_ntc_bsppl_psn_title();
		}
		if ($pay_ntc_dtl_subttl_typ.equalsIgnoreCase(name)) {
			return pay_ntc_dtl_subttl_typ();
		}
		if ($pay_ntc_dtl_subttl_typ_nm.equalsIgnoreCase(name)) {
			return pay_ntc_dtl_subttl_typ_nm();
		}
		if ($pay_ntc_dtl_brk_typ.equalsIgnoreCase(name)) {
			return pay_ntc_dtl_brk_typ();
		}
		if ($pay_ntc_dtl_brk_typ_nm.equalsIgnoreCase(name)) {
			return pay_ntc_dtl_brk_typ_nm();
		}
		if ($pay_ntc_dtl_sort_typ.equalsIgnoreCase(name)) {
			return pay_ntc_dtl_sort_typ();
		}
		if ($pay_ntc_dtl_sort_typ_nm.equalsIgnoreCase(name)) {
			return pay_ntc_dtl_sort_typ_nm();
		}
		if ($pay_ntc_can_slip_typ.equalsIgnoreCase(name)) {
			return pay_ntc_can_slip_typ();
		}
		if ($pay_ntc_can_slip_typ_nm.equalsIgnoreCase(name)) {
			return pay_ntc_can_slip_typ_nm();
		}
		if ($psppl_rmrks.equalsIgnoreCase(name)) {
			return psppl_rmrks();
		}
		if ($pay_dpt_cd.equalsIgnoreCase(name)) {
			return pay_dpt_cd();
		}
		if ($pay_dpt_nm.equalsIgnoreCase(name)) {
			return pay_dpt_nm();
		}
		if ($check_pay_dpt_cd.equalsIgnoreCase(name)) {
			return check_pay_dpt_cd();
		}
		if ($psppl_prnt_typ.equalsIgnoreCase(name)) {
			return psppl_prnt_typ();
		}
		if ($psppl_prnt_typ_nm.equalsIgnoreCase(name)) {
			return psppl_prnt_typ_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($upd_cntr_c.equalsIgnoreCase(name)) {
			return upd_cntr_c();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			return bill_crryovr_times();
		}
		if ($ship_lt.equalsIgnoreCase(name)) {
			return ship_lt();
		}
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			return bill_cl_day1();
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			return bill_cl_day2();
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			return bill_cl_day3();
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			return bill_cl_day4();
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			return bill_cl_day5();
		}
		if ($bill_cl_delay_days.equalsIgnoreCase(name)) {
			return bill_cl_delay_days();
		}
		if ($auto_appl_delay_days.equalsIgnoreCase(name)) {
			return auto_appl_delay_days();
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			return pay_crryovr_times();
		}
		if ($psppl_cl_day1.equalsIgnoreCase(name)) {
			return psppl_cl_day1();
		}
		if ($psppl_cl_day2.equalsIgnoreCase(name)) {
			return psppl_cl_day2();
		}
		if ($psppl_cl_day3.equalsIgnoreCase(name)) {
			return psppl_cl_day3();
		}
		if ($psppl_cl_day4.equalsIgnoreCase(name)) {
			return psppl_cl_day4();
		}
		if ($psppl_cl_day5.equalsIgnoreCase(name)) {
			return psppl_cl_day5();
		}
		if ($pay_schd_cl_delay_days.equalsIgnoreCase(name)) {
			return pay_schd_cl_delay_days();
		}
		if ($note_days.equalsIgnoreCase(name)) {
			return note_days();
		}
		if ($bp_com_upd_cntr.equalsIgnoreCase(name)) {
			return bp_com_upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCTimestamp getTimestamp(String name) {
		if ($ins_ts_c.equalsIgnoreCase(name)) {
			return ins_ts_c();
		}
		if ($upd_ts_c.equalsIgnoreCase(name)) {
			return upd_ts_c();
		}
		if ($del_ts_c.equalsIgnoreCase(name)) {
			return del_ts_c();
		}
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		if ($del_ts.equalsIgnoreCase(name)) {
			return del_ts();
		}
		return super.getTimestamp(name);
	}
	public boolean getBoolean(String name) {
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		if ($all_com_flg.equalsIgnoreCase(name)) {
			return all_com_flg();
		}
		if ($org_all_com_flg.equalsIgnoreCase(name)) {
			return org_all_com_flg();
		}
		if ($com_use_flg.equalsIgnoreCase(name)) {
			return com_use_flg();
		}
		if ($com_ex_flg.equalsIgnoreCase(name)) {
			return com_ex_flg();
		}
		if ($cst_flg.equalsIgnoreCase(name)) {
			return cst_flg();
		}
		if ($org_cst_flg.equalsIgnoreCase(name)) {
			return org_cst_flg();
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
		if ($dlv_flg.equalsIgnoreCase(name)) {
			return dlv_flg();
		}
		if ($dest_flg.equalsIgnoreCase(name)) {
			return dest_flg();
		}
		if ($cred_flg.equalsIgnoreCase(name)) {
			return cred_flg();
		}
		if ($sppl_flg.equalsIgnoreCase(name)) {
			return sppl_flg();
		}
		if ($org_sppl_flg.equalsIgnoreCase(name)) {
			return org_sppl_flg();
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
		if ($maker_flg.equalsIgnoreCase(name)) {
			return maker_flg();
		}
		if ($cst_sundry_flg.equalsIgnoreCase(name)) {
			return cst_sundry_flg();
		}
		if ($sls_upri_cng_flg.equalsIgnoreCase(name)) {
			return sls_upri_cng_flg();
		}
		if ($sls_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			return sls_tax_cd_prio_flg();
		}
		if ($stk_lst_issue_flg.equalsIgnoreCase(name)) {
			return stk_lst_issue_flg();
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
		if ($tax_on_bill_flg.equalsIgnoreCase(name)) {
			return tax_on_bill_flg();
		}
		if ($auto_line_appl_flg.equalsIgnoreCase(name)) {
			return auto_line_appl_flg();
		}
		if ($sls_interim_cl_flg.equalsIgnoreCase(name)) {
			return sls_interim_cl_flg();
		}
		if ($bill_dtl_outp_flg.equalsIgnoreCase(name)) {
			return bill_dtl_outp_flg();
		}
		if ($bfw_bal_disp_flg.equalsIgnoreCase(name)) {
			return bfw_bal_disp_flg();
		}
		if ($bill_dtl_adv_flg.equalsIgnoreCase(name)) {
			return bill_dtl_adv_flg();
		}
		if ($bill_dtl_rcv_flg.equalsIgnoreCase(name)) {
			return bill_dtl_rcv_flg();
		}
		if ($rcv_auto_appl_tgt_flg.equalsIgnoreCase(name)) {
			return rcv_auto_appl_tgt_flg();
		}
		if ($rcv_amt_match_flg.equalsIgnoreCase(name)) {
			return rcv_amt_match_flg();
		}
		if ($ar_sttl_typ_match_flg.equalsIgnoreCase(name)) {
			return ar_sttl_typ_match_flg();
		}
		if ($calc_com_paid_flg.equalsIgnoreCase(name)) {
			return calc_com_paid_flg();
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			return dlv_sundry_flg();
		}
		if ($tdlv_flg.equalsIgnoreCase(name)) {
			return tdlv_flg();
		}
		if ($org_tdlv_flg.equalsIgnoreCase(name)) {
			return org_tdlv_flg();
		}
		if ($tdlv_req_flg.equalsIgnoreCase(name)) {
			return tdlv_req_flg();
		}
		if ($pri_prnt_flg.equalsIgnoreCase(name)) {
			return pri_prnt_flg();
		}
		if ($cnsgn_stktk_flg.equalsIgnoreCase(name)) {
			return cnsgn_stktk_flg();
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			return subcon_flg();
		}
		if ($onr_prsppl_flg.equalsIgnoreCase(name)) {
			return onr_prsppl_flg();
		}
		if ($org_onr_prsppl_flg.equalsIgnoreCase(name)) {
			return org_onr_prsppl_flg();
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			return repurc_obli_flg();
		}
		if ($purc_upri_cng_flg.equalsIgnoreCase(name)) {
			return purc_upri_cng_flg();
		}
		if ($prms_recv_flg.equalsIgnoreCase(name)) {
			return prms_recv_flg();
		}
		if ($purc_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			return purc_tax_cd_prio_flg();
		}
		if ($po_dlv_slip_flg.equalsIgnoreCase(name)) {
			return po_dlv_slip_flg();
		}
		if ($dlv_inst_dlv_slip_flg.equalsIgnoreCase(name)) {
			return dlv_inst_dlv_slip_flg();
		}
		if ($prms_rcpt_dlv_slip_flg.equalsIgnoreCase(name)) {
			return prms_rcpt_dlv_slip_flg();
		}
		if ($wrk_po_flg.equalsIgnoreCase(name)) {
			return wrk_po_flg();
		}
		if ($wrk_ap_flg.equalsIgnoreCase(name)) {
			return wrk_ap_flg();
		}
		if ($sppl_iv_flg.equalsIgnoreCase(name)) {
			return sppl_iv_flg();
		}
		if ($rcpt_iv_dup_flg.equalsIgnoreCase(name)) {
			return rcpt_iv_dup_flg();
		}
		if ($prov_upri_cng_flg.equalsIgnoreCase(name)) {
			return prov_upri_cng_flg();
		}
		if ($prov_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			return prov_tax_cd_prio_flg();
		}
		if ($purc_interim_cl_flg.equalsIgnoreCase(name)) {
			return purc_interim_cl_flg();
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			return pay_spot_flg();
		}
		if ($tax_on_pay_flg.equalsIgnoreCase(name)) {
			return tax_on_pay_flg();
		}
		if ($batch_pay_schd_cl_flg.equalsIgnoreCase(name)) {
			return batch_pay_schd_cl_flg();
		}
		if ($pay_ntc_prnt_flg.equalsIgnoreCase(name)) {
			return pay_ntc_prnt_flg();
		}
		if ($pay_ntc_dtl_outp_flg.equalsIgnoreCase(name)) {
			return pay_ntc_dtl_outp_flg();
		}
		if ($pay_ntc_bfw_bal_disp_flg.equalsIgnoreCase(name)) {
			return pay_ntc_bfw_bal_disp_flg();
		}
		if ($pay_ntc_adv_pay_flg.equalsIgnoreCase(name)) {
			return pay_ntc_adv_pay_flg();
		}
		if ($pay_ntc_dtl_pay_flg.equalsIgnoreCase(name)) {
			return pay_ntc_dtl_pay_flg();
		}
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm_lcl.equalsIgnoreCase(name)) {
			return bp_nm_lcl();
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
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			return cntry_cd();
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			return cntry_nm();
		}
		if ($area_cd.equalsIgnoreCase(name)) {
			return area_cd();
		}
		if ($area_nm.equalsIgnoreCase(name)) {
			return area_nm();
		}
		if ($biz_co_no.equalsIgnoreCase(name)) {
			return biz_co_no();
		}
		if ($ein.equalsIgnoreCase(name)) {
			return ein();
		}
		if ($std_co_cd.equalsIgnoreCase(name)) {
			return std_co_cd();
		}
		if ($tel.equalsIgnoreCase(name)) {
			return tel();
		}
		if ($fax.equalsIgnoreCase(name)) {
			return fax();
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
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			return prnt_lcl_cd();
		}
		if ($prnt_lcl_nm.equalsIgnoreCase(name)) {
			return prnt_lcl_nm();
		}
		if ($bp_alc_grp.equalsIgnoreCase(name)) {
			return bp_alc_grp();
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
		if ($bp_grp_cd1.equalsIgnoreCase(name)) {
			return bp_grp_cd1();
		}
		if ($bp_grp_nm1.equalsIgnoreCase(name)) {
			return bp_grp_nm1();
		}
		if ($bp_grp_cd2.equalsIgnoreCase(name)) {
			return bp_grp_cd2();
		}
		if ($bp_grp_nm2.equalsIgnoreCase(name)) {
			return bp_grp_nm2();
		}
		if ($bp_grp_cd3.equalsIgnoreCase(name)) {
			return bp_grp_cd3();
		}
		if ($bp_grp_nm3.equalsIgnoreCase(name)) {
			return bp_grp_nm3();
		}
		if ($bp_grp_cd4.equalsIgnoreCase(name)) {
			return bp_grp_cd4();
		}
		if ($bp_grp_nm4.equalsIgnoreCase(name)) {
			return bp_grp_nm4();
		}
		if ($bp_grp_cd5.equalsIgnoreCase(name)) {
			return bp_grp_cd5();
		}
		if ($bp_grp_nm5.equalsIgnoreCase(name)) {
			return bp_grp_nm5();
		}
		if ($bp_grp_cd6.equalsIgnoreCase(name)) {
			return bp_grp_cd6();
		}
		if ($bp_grp_nm6.equalsIgnoreCase(name)) {
			return bp_grp_nm6();
		}
		if ($bp_grp_cd7.equalsIgnoreCase(name)) {
			return bp_grp_cd7();
		}
		if ($bp_grp_nm7.equalsIgnoreCase(name)) {
			return bp_grp_nm7();
		}
		if ($bp_grp_cd8.equalsIgnoreCase(name)) {
			return bp_grp_cd8();
		}
		if ($bp_grp_nm8.equalsIgnoreCase(name)) {
			return bp_grp_nm8();
		}
		if ($bp_grp_cd9.equalsIgnoreCase(name)) {
			return bp_grp_cd9();
		}
		if ($bp_grp_nm9.equalsIgnoreCase(name)) {
			return bp_grp_nm9();
		}
		if ($bp_grp_cd10.equalsIgnoreCase(name)) {
			return bp_grp_cd10();
		}
		if ($bp_grp_nm10.equalsIgnoreCase(name)) {
			return bp_grp_nm10();
		}
		if ($ins_usr_id_c.equalsIgnoreCase(name)) {
			return ins_usr_id_c();
		}
		if ($ins_usr_nm_c.equalsIgnoreCase(name)) {
			return ins_usr_nm_c();
		}
		if ($ins_func_id_c.equalsIgnoreCase(name)) {
			return ins_func_id_c();
		}
		if ($ins_func_nm_c.equalsIgnoreCase(name)) {
			return ins_func_nm_c();
		}
		if ($upd_usr_id_c.equalsIgnoreCase(name)) {
			return upd_usr_id_c();
		}
		if ($upd_usr_nm_c.equalsIgnoreCase(name)) {
			return upd_usr_nm_c();
		}
		if ($upd_func_id_c.equalsIgnoreCase(name)) {
			return upd_func_id_c();
		}
		if ($upd_func_nm_c.equalsIgnoreCase(name)) {
			return upd_func_nm_c();
		}
		if ($upd_srv_req_no_c.equalsIgnoreCase(name)) {
			return upd_srv_req_no_c();
		}
		if ($del_usr_id_c.equalsIgnoreCase(name)) {
			return del_usr_id_c();
		}
		if ($del_usr_nm_c.equalsIgnoreCase(name)) {
			return del_usr_nm_c();
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			return ins_usr_id();
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			return ins_usr_nm();
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			return ins_func_id();
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			return ins_func_nm();
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			return upd_usr_id();
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			return upd_usr_nm();
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			return upd_func_id();
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			return upd_func_nm();
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			return upd_srv_req_no();
		}
		if ($del_usr_id.equalsIgnoreCase(name)) {
			return del_usr_id();
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			return del_usr_nm();
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($acst_nm.equalsIgnoreCase(name)) {
			return acst_nm();
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
		if ($ar_dpt_typ.equalsIgnoreCase(name)) {
			return ar_dpt_typ();
		}
		if ($ar_dpt_typ_nm.equalsIgnoreCase(name)) {
			return ar_dpt_typ_nm();
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($ar_dpt_nm.equalsIgnoreCase(name)) {
			return ar_dpt_nm();
		}
		if ($check_ar_dpt_cd.equalsIgnoreCase(name)) {
			return check_ar_dpt_cd();
		}
		if ($sls_upri_rnd_typ.equalsIgnoreCase(name)) {
			return sls_upri_rnd_typ();
		}
		if ($sls_upri_rnd_typ_nm.equalsIgnoreCase(name)) {
			return sls_upri_rnd_typ_nm();
		}
		if ($sls_upri_req_typ.equalsIgnoreCase(name)) {
			return sls_upri_req_typ();
		}
		if ($sls_upri_req_typ_nm.equalsIgnoreCase(name)) {
			return sls_upri_req_typ_nm();
		}
		if ($sls_amt_rnd_typ.equalsIgnoreCase(name)) {
			return sls_amt_rnd_typ();
		}
		if ($sls_amt_rnd_typ_nm.equalsIgnoreCase(name)) {
			return sls_amt_rnd_typ_nm();
		}
		if ($sls_tax_calc_typ.equalsIgnoreCase(name)) {
			return sls_tax_calc_typ();
		}
		if ($sls_tax_calc_typ_nm.equalsIgnoreCase(name)) {
			return sls_tax_calc_typ_nm();
		}
		if ($sls_tax_rnd_typ.equalsIgnoreCase(name)) {
			return sls_tax_rnd_typ();
		}
		if ($sls_tax_rnd_typ_nm.equalsIgnoreCase(name)) {
			return sls_tax_rnd_typ_nm();
		}
		if ($sls_tax_cd.equalsIgnoreCase(name)) {
			return sls_tax_cd();
		}
		if ($sls_tax_nm.equalsIgnoreCase(name)) {
			return sls_tax_nm();
		}
		if ($lot_back_stop_typ.equalsIgnoreCase(name)) {
			return lot_back_stop_typ();
		}
		if ($lot_back_stop_typ_nm.equalsIgnoreCase(name)) {
			return lot_back_stop_typ_nm();
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			return sls_basis_typ();
		}
		if ($sls_basis_typ_nm.equalsIgnoreCase(name)) {
			return sls_basis_typ_nm();
		}
		if ($bill_basis_typ.equalsIgnoreCase(name)) {
			return bill_basis_typ();
		}
		if ($bill_basis_typ_nm.equalsIgnoreCase(name)) {
			return bill_basis_typ_nm();
		}
		if ($slip_each_lot_typ.equalsIgnoreCase(name)) {
			return slip_each_lot_typ();
		}
		if ($slip_each_lot_typ_nm.equalsIgnoreCase(name)) {
			return slip_each_lot_typ_nm();
		}
		if ($ship_schd_split_typ.equalsIgnoreCase(name)) {
			return ship_schd_split_typ();
		}
		if ($ship_schd_split_typ_nm.equalsIgnoreCase(name)) {
			return ship_schd_split_typ_nm();
		}
		if ($stk_lst_form_cd.equalsIgnoreCase(name)) {
			return stk_lst_form_cd();
		}
		if ($stk_lst_form_nm.equalsIgnoreCase(name)) {
			return stk_lst_form_nm();
		}
		if ($cst_ship_form_cd.equalsIgnoreCase(name)) {
			return cst_ship_form_cd();
		}
		if ($cst_ship_form_nm.equalsIgnoreCase(name)) {
			return cst_ship_form_nm();
		}
		if ($cst_tterm_cd1.equalsIgnoreCase(name)) {
			return cst_tterm_cd1();
		}
		if ($cst_tterm_nm1.equalsIgnoreCase(name)) {
			return cst_tterm_nm1();
		}
		if ($cst_tterm_cd2.equalsIgnoreCase(name)) {
			return cst_tterm_cd2();
		}
		if ($cst_tterm_nm2.equalsIgnoreCase(name)) {
			return cst_tterm_nm2();
		}
		if ($cst_tterm_cd3.equalsIgnoreCase(name)) {
			return cst_tterm_cd3();
		}
		if ($cst_tterm_nm3.equalsIgnoreCase(name)) {
			return cst_tterm_nm3();
		}
		if ($sls_anly_cd1.equalsIgnoreCase(name)) {
			return sls_anly_cd1();
		}
		if ($sls_anly_nm1.equalsIgnoreCase(name)) {
			return sls_anly_nm1();
		}
		if ($sls_anly_cd2.equalsIgnoreCase(name)) {
			return sls_anly_cd2();
		}
		if ($sls_anly_nm2.equalsIgnoreCase(name)) {
			return sls_anly_nm2();
		}
		if ($sls_anly_cd3.equalsIgnoreCase(name)) {
			return sls_anly_cd3();
		}
		if ($sls_anly_nm3.equalsIgnoreCase(name)) {
			return sls_anly_nm3();
		}
		if ($cst_prnt_typ.equalsIgnoreCase(name)) {
			return cst_prnt_typ();
		}
		if ($cst_prnt_typ_nm.equalsIgnoreCase(name)) {
			return cst_prnt_typ_nm();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			return bcst_nm();
		}
		if ($acst_prnt_typ.equalsIgnoreCase(name)) {
			return acst_prnt_typ();
		}
		if ($acst_prnt_typ_nm.equalsIgnoreCase(name)) {
			return acst_prnt_typ_nm();
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			return rcst_cd();
		}
		if ($rcst_nm.equalsIgnoreCase(name)) {
			return rcst_nm();
		}
		if ($ar_cred_cd.equalsIgnoreCase(name)) {
			return ar_cred_cd();
		}
		if ($ar_cred_nm.equalsIgnoreCase(name)) {
			return ar_cred_nm();
		}
		if ($bill_dpt_typ.equalsIgnoreCase(name)) {
			return bill_dpt_typ();
		}
		if ($bill_dpt_typ_nm.equalsIgnoreCase(name)) {
			return bill_dpt_typ_nm();
		}
		if ($bcst_dpt_cd.equalsIgnoreCase(name)) {
			return bcst_dpt_cd();
		}
		if ($bcst_dpt_nm.equalsIgnoreCase(name)) {
			return bcst_dpt_nm();
		}
		if ($check_bcst_dpt_cd.equalsIgnoreCase(name)) {
			return check_bcst_dpt_cd();
		}
		if ($bill_cl_typ.equalsIgnoreCase(name)) {
			return bill_cl_typ();
		}
		if ($bill_cl_typ_nm.equalsIgnoreCase(name)) {
			return bill_cl_typ_nm();
		}
		if ($bill_tax_rnd_typ.equalsIgnoreCase(name)) {
			return bill_tax_rnd_typ();
		}
		if ($bill_tax_rnd_typ_nm.equalsIgnoreCase(name)) {
			return bill_tax_rnd_typ_nm();
		}
		if ($bill_cl_ba_typ.equalsIgnoreCase(name)) {
			return bill_cl_ba_typ();
		}
		if ($bill_cl_ba_typ_nm.equalsIgnoreCase(name)) {
			return bill_cl_ba_typ_nm();
		}
		if ($bill_cal_cd.equalsIgnoreCase(name)) {
			return bill_cal_cd();
		}
		if ($bill_cal_nm.equalsIgnoreCase(name)) {
			return bill_cal_nm();
		}
		if ($rcv_ba_typ.equalsIgnoreCase(name)) {
			return rcv_ba_typ();
		}
		if ($rcv_ba_typ_nm.equalsIgnoreCase(name)) {
			return rcv_ba_typ_nm();
		}
		if ($ar_setoff_grp_cd.equalsIgnoreCase(name)) {
			return ar_setoff_grp_cd();
		}
		if ($ar_setoff_grp_nm.equalsIgnoreCase(name)) {
			return ar_setoff_grp_nm();
		}
		if ($bcst_prnt_typ.equalsIgnoreCase(name)) {
			return bcst_prnt_typ();
		}
		if ($bcst_prnt_typ_nm.equalsIgnoreCase(name)) {
			return bcst_prnt_typ_nm();
		}
		if ($bill_zip_cd.equalsIgnoreCase(name)) {
			return bill_zip_cd();
		}
		if ($bill_addr1.equalsIgnoreCase(name)) {
			return bill_addr1();
		}
		if ($bill_addr2.equalsIgnoreCase(name)) {
			return bill_addr2();
		}
		if ($bill_addr3.equalsIgnoreCase(name)) {
			return bill_addr3();
		}
		if ($bill_addr4.equalsIgnoreCase(name)) {
			return bill_addr4();
		}
		if ($bill_tel.equalsIgnoreCase(name)) {
			return bill_tel();
		}
		if ($bill_bcst_nm.equalsIgnoreCase(name)) {
			return bill_bcst_nm();
		}
		if ($bill_bcst_dpt.equalsIgnoreCase(name)) {
			return bill_bcst_dpt();
		}
		if ($bill_bcst_psn.equalsIgnoreCase(name)) {
			return bill_bcst_psn();
		}
		if ($bill_bcst_psn_title.equalsIgnoreCase(name)) {
			return bill_bcst_psn_title();
		}
		if ($bill_prnt_typ.equalsIgnoreCase(name)) {
			return bill_prnt_typ();
		}
		if ($bill_prnt_typ_nm.equalsIgnoreCase(name)) {
			return bill_prnt_typ_nm();
		}
		if ($sls_dtl_outp_typ.equalsIgnoreCase(name)) {
			return sls_dtl_outp_typ();
		}
		if ($sls_dtl_outp_typ_nm.equalsIgnoreCase(name)) {
			return sls_dtl_outp_typ_nm();
		}
		if ($bill_dtl_subttl_typ.equalsIgnoreCase(name)) {
			return bill_dtl_subttl_typ();
		}
		if ($bill_dtl_subttl_typ_nm.equalsIgnoreCase(name)) {
			return bill_dtl_subttl_typ_nm();
		}
		if ($bill_dtl_brk_typ.equalsIgnoreCase(name)) {
			return bill_dtl_brk_typ();
		}
		if ($bill_dtl_brk_typ_nm.equalsIgnoreCase(name)) {
			return bill_dtl_brk_typ_nm();
		}
		if ($bill_dtl_sort_typ.equalsIgnoreCase(name)) {
			return bill_dtl_sort_typ();
		}
		if ($bill_dtl_sort_typ_nm.equalsIgnoreCase(name)) {
			return bill_dtl_sort_typ_nm();
		}
		if ($bill_can_slip_typ.equalsIgnoreCase(name)) {
			return bill_can_slip_typ();
		}
		if ($bill_can_slip_typ_nm.equalsIgnoreCase(name)) {
			return bill_can_slip_typ_nm();
		}
		if ($xfr_psn.equalsIgnoreCase(name)) {
			return xfr_psn();
		}
		if ($rcst_prnt_typ.equalsIgnoreCase(name)) {
			return rcst_prnt_typ();
		}
		if ($rcst_prnt_typ_nm.equalsIgnoreCase(name)) {
			return rcst_prnt_typ_nm();
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			return lg_grp_nm();
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			return via_dlv_typ();
		}
		if ($via_dlv_typ_nm.equalsIgnoreCase(name)) {
			return via_dlv_typ_nm();
		}
		if ($dlv_cal_cd.equalsIgnoreCase(name)) {
			return dlv_cal_cd();
		}
		if ($dlv_cal_nm.equalsIgnoreCase(name)) {
			return dlv_cal_nm();
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
		if ($dlv_chnnl1.equalsIgnoreCase(name)) {
			return dlv_chnnl1();
		}
		if ($dlv_chnnl2.equalsIgnoreCase(name)) {
			return dlv_chnnl2();
		}
		if ($dlv_chnnl3.equalsIgnoreCase(name)) {
			return dlv_chnnl3();
		}
		if ($dlv_prnt_typ.equalsIgnoreCase(name)) {
			return dlv_prnt_typ();
		}
		if ($dlv_prnt_typ_nm.equalsIgnoreCase(name)) {
			return dlv_prnt_typ_nm();
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			return asppl_cd();
		}
		if ($asppl_nm.equalsIgnoreCase(name)) {
			return asppl_nm();
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
		if ($vmi_purc_dpt_cd.equalsIgnoreCase(name)) {
			return vmi_purc_dpt_cd();
		}
		if ($vmi_purc_dpt_nm.equalsIgnoreCase(name)) {
			return vmi_purc_dpt_nm();
		}
		if ($check_vmi_purc_dpt_cd.equalsIgnoreCase(name)) {
			return check_vmi_purc_dpt_cd();
		}
		if ($purc_upri_req_typ.equalsIgnoreCase(name)) {
			return purc_upri_req_typ();
		}
		if ($purc_upri_req_typ_nm.equalsIgnoreCase(name)) {
			return purc_upri_req_typ_nm();
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			return purc_amt_rnd_typ();
		}
		if ($purc_amt_rnd_typ_nm.equalsIgnoreCase(name)) {
			return purc_amt_rnd_typ_nm();
		}
		if ($purc_tax_calc_typ.equalsIgnoreCase(name)) {
			return purc_tax_calc_typ();
		}
		if ($purc_tax_calc_typ_nm.equalsIgnoreCase(name)) {
			return purc_tax_calc_typ_nm();
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			return purc_tax_rnd_typ();
		}
		if ($purc_tax_rnd_typ_nm.equalsIgnoreCase(name)) {
			return purc_tax_rnd_typ_nm();
		}
		if ($purc_tax_cd.equalsIgnoreCase(name)) {
			return purc_tax_cd();
		}
		if ($purc_tax_nm.equalsIgnoreCase(name)) {
			return purc_tax_nm();
		}
		if ($sppl_cal_cd.equalsIgnoreCase(name)) {
			return sppl_cal_cd();
		}
		if ($sppl_cal_nm.equalsIgnoreCase(name)) {
			return sppl_cal_nm();
		}
		if ($po_print_cd.equalsIgnoreCase(name)) {
			return po_print_cd();
		}
		if ($po_print_nm.equalsIgnoreCase(name)) {
			return po_print_nm();
		}
		if ($sppl_ship_form_cd.equalsIgnoreCase(name)) {
			return sppl_ship_form_cd();
		}
		if ($sppl_ship_form_nm.equalsIgnoreCase(name)) {
			return sppl_ship_form_nm();
		}
		if ($prov_rcv_typ.equalsIgnoreCase(name)) {
			return prov_rcv_typ();
		}
		if ($prov_rcv_typ_nm.equalsIgnoreCase(name)) {
			return prov_rcv_typ_nm();
		}
		if ($purc_slip_each_lot_typ.equalsIgnoreCase(name)) {
			return purc_slip_each_lot_typ();
		}
		if ($purc_slip_each_lot_typ_nm.equalsIgnoreCase(name)) {
			return purc_slip_each_lot_typ_nm();
		}
		if ($sppl_tterm_cd1.equalsIgnoreCase(name)) {
			return sppl_tterm_cd1();
		}
		if ($sppl_tterm_nm1.equalsIgnoreCase(name)) {
			return sppl_tterm_nm1();
		}
		if ($sppl_tterm_cd2.equalsIgnoreCase(name)) {
			return sppl_tterm_cd2();
		}
		if ($sppl_tterm_nm2.equalsIgnoreCase(name)) {
			return sppl_tterm_nm2();
		}
		if ($sppl_tterm_cd3.equalsIgnoreCase(name)) {
			return sppl_tterm_cd3();
		}
		if ($sppl_tterm_nm3.equalsIgnoreCase(name)) {
			return sppl_tterm_nm3();
		}
		if ($purc_basis_typ.equalsIgnoreCase(name)) {
			return purc_basis_typ();
		}
		if ($purc_basis_typ_nm.equalsIgnoreCase(name)) {
			return purc_basis_typ_nm();
		}
		if ($outsrc_upri_typ.equalsIgnoreCase(name)) {
			return outsrc_upri_typ();
		}
		if ($outsrc_upri_typ_nm.equalsIgnoreCase(name)) {
			return outsrc_upri_typ_nm();
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			return prov_basis_typ();
		}
		if ($prov_basis_typ_nm.equalsIgnoreCase(name)) {
			return prov_basis_typ_nm();
		}
		if ($prov_tax_cd.equalsIgnoreCase(name)) {
			return prov_tax_cd();
		}
		if ($prov_tax_nm.equalsIgnoreCase(name)) {
			return prov_tax_nm();
		}
		if ($prov_amt_rnd_typ.equalsIgnoreCase(name)) {
			return prov_amt_rnd_typ();
		}
		if ($prov_amt_rnd_typ_nm.equalsIgnoreCase(name)) {
			return prov_amt_rnd_typ_nm();
		}
		if ($prov_tax_calc_typ.equalsIgnoreCase(name)) {
			return prov_tax_calc_typ();
		}
		if ($prov_tax_calc_typ_nm.equalsIgnoreCase(name)) {
			return prov_tax_calc_typ_nm();
		}
		if ($prov_tax_rnd_typ.equalsIgnoreCase(name)) {
			return prov_tax_rnd_typ();
		}
		if ($prov_tax_rnd_typ_nm.equalsIgnoreCase(name)) {
			return prov_tax_rnd_typ_nm();
		}
		if ($sppl_prnt_typ.equalsIgnoreCase(name)) {
			return sppl_prnt_typ();
		}
		if ($sppl_prnt_typ_nm.equalsIgnoreCase(name)) {
			return sppl_prnt_typ_nm();
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			return bsppl_cd();
		}
		if ($bsppl_nm.equalsIgnoreCase(name)) {
			return bsppl_nm();
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			return ap_dpt_nm();
		}
		if ($check_ap_dpt_cd.equalsIgnoreCase(name)) {
			return check_ap_dpt_cd();
		}
		if ($asppl_prnt_typ.equalsIgnoreCase(name)) {
			return asppl_prnt_typ();
		}
		if ($asppl_prnt_typ_nm.equalsIgnoreCase(name)) {
			return asppl_prnt_typ_nm();
		}
		if ($psppl_cd.equalsIgnoreCase(name)) {
			return psppl_cd();
		}
		if ($psppl_nm.equalsIgnoreCase(name)) {
			return psppl_nm();
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			return bsppl_dpt_cd();
		}
		if ($bsppl_dpt_nm.equalsIgnoreCase(name)) {
			return bsppl_dpt_nm();
		}
		if ($check_bsppl_dpt_cd.equalsIgnoreCase(name)) {
			return check_bsppl_dpt_cd();
		}
		if ($ap_cred_cd.equalsIgnoreCase(name)) {
			return ap_cred_cd();
		}
		if ($ap_cred_nm.equalsIgnoreCase(name)) {
			return ap_cred_nm();
		}
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			return pay_bank_ac_cd();
		}
		if ($pay_bank_ac_nm.equalsIgnoreCase(name)) {
			return pay_bank_ac_nm();
		}
		if ($ap_setoff_grp_cd.equalsIgnoreCase(name)) {
			return ap_setoff_grp_cd();
		}
		if ($ap_setoff_grp_nm.equalsIgnoreCase(name)) {
			return ap_setoff_grp_nm();
		}
		if ($pay_tax_rnd_typ.equalsIgnoreCase(name)) {
			return pay_tax_rnd_typ();
		}
		if ($pay_tax_rnd_typ_nm.equalsIgnoreCase(name)) {
			return pay_tax_rnd_typ_nm();
		}
		if ($pay_schd_ba_typ.equalsIgnoreCase(name)) {
			return pay_schd_ba_typ();
		}
		if ($pay_schd_ba_typ_nm.equalsIgnoreCase(name)) {
			return pay_schd_ba_typ_nm();
		}
		if ($pay_schd_cl_ba_typ.equalsIgnoreCase(name)) {
			return pay_schd_cl_ba_typ();
		}
		if ($pay_schd_cl_ba_typ_nm.equalsIgnoreCase(name)) {
			return pay_schd_cl_ba_typ_nm();
		}
		if ($bsppl_prnt_typ.equalsIgnoreCase(name)) {
			return bsppl_prnt_typ();
		}
		if ($bsppl_prnt_typ_nm.equalsIgnoreCase(name)) {
			return bsppl_prnt_typ_nm();
		}
		if ($pay_ntc_zip_cd.equalsIgnoreCase(name)) {
			return pay_ntc_zip_cd();
		}
		if ($pay_ntc_addr1.equalsIgnoreCase(name)) {
			return pay_ntc_addr1();
		}
		if ($pay_ntc_addr2.equalsIgnoreCase(name)) {
			return pay_ntc_addr2();
		}
		if ($pay_ntc_addr3.equalsIgnoreCase(name)) {
			return pay_ntc_addr3();
		}
		if ($pay_ntc_addr4.equalsIgnoreCase(name)) {
			return pay_ntc_addr4();
		}
		if ($pay_ntc_tel.equalsIgnoreCase(name)) {
			return pay_ntc_tel();
		}
		if ($pay_ntc_bsppl_nm.equalsIgnoreCase(name)) {
			return pay_ntc_bsppl_nm();
		}
		if ($pay_ntc_bsppl_dpt.equalsIgnoreCase(name)) {
			return pay_ntc_bsppl_dpt();
		}
		if ($pay_ntc_bsppl_psn.equalsIgnoreCase(name)) {
			return pay_ntc_bsppl_psn();
		}
		if ($pay_ntc_bsppl_psn_title.equalsIgnoreCase(name)) {
			return pay_ntc_bsppl_psn_title();
		}
		if ($pay_ntc_dtl_subttl_typ.equalsIgnoreCase(name)) {
			return pay_ntc_dtl_subttl_typ();
		}
		if ($pay_ntc_dtl_subttl_typ_nm.equalsIgnoreCase(name)) {
			return pay_ntc_dtl_subttl_typ_nm();
		}
		if ($pay_ntc_dtl_brk_typ.equalsIgnoreCase(name)) {
			return pay_ntc_dtl_brk_typ();
		}
		if ($pay_ntc_dtl_brk_typ_nm.equalsIgnoreCase(name)) {
			return pay_ntc_dtl_brk_typ_nm();
		}
		if ($pay_ntc_dtl_sort_typ.equalsIgnoreCase(name)) {
			return pay_ntc_dtl_sort_typ();
		}
		if ($pay_ntc_dtl_sort_typ_nm.equalsIgnoreCase(name)) {
			return pay_ntc_dtl_sort_typ_nm();
		}
		if ($pay_ntc_can_slip_typ.equalsIgnoreCase(name)) {
			return pay_ntc_can_slip_typ();
		}
		if ($pay_ntc_can_slip_typ_nm.equalsIgnoreCase(name)) {
			return pay_ntc_can_slip_typ_nm();
		}
		if ($psppl_rmrks.equalsIgnoreCase(name)) {
			return psppl_rmrks();
		}
		if ($pay_dpt_cd.equalsIgnoreCase(name)) {
			return pay_dpt_cd();
		}
		if ($pay_dpt_nm.equalsIgnoreCase(name)) {
			return pay_dpt_nm();
		}
		if ($check_pay_dpt_cd.equalsIgnoreCase(name)) {
			return check_pay_dpt_cd();
		}
		if ($psppl_prnt_typ.equalsIgnoreCase(name)) {
			return psppl_prnt_typ();
		}
		if ($psppl_prnt_typ_nm.equalsIgnoreCase(name)) {
			return psppl_prnt_typ_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($upd_cntr_c.equalsIgnoreCase(name)) {
			return upd_cntr_c();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			return bill_crryovr_times();
		}
		if ($ship_lt.equalsIgnoreCase(name)) {
			return ship_lt();
		}
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			return bill_cl_day1();
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			return bill_cl_day2();
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			return bill_cl_day3();
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			return bill_cl_day4();
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			return bill_cl_day5();
		}
		if ($bill_cl_delay_days.equalsIgnoreCase(name)) {
			return bill_cl_delay_days();
		}
		if ($auto_appl_delay_days.equalsIgnoreCase(name)) {
			return auto_appl_delay_days();
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			return pay_crryovr_times();
		}
		if ($psppl_cl_day1.equalsIgnoreCase(name)) {
			return psppl_cl_day1();
		}
		if ($psppl_cl_day2.equalsIgnoreCase(name)) {
			return psppl_cl_day2();
		}
		if ($psppl_cl_day3.equalsIgnoreCase(name)) {
			return psppl_cl_day3();
		}
		if ($psppl_cl_day4.equalsIgnoreCase(name)) {
			return psppl_cl_day4();
		}
		if ($psppl_cl_day5.equalsIgnoreCase(name)) {
			return psppl_cl_day5();
		}
		if ($pay_schd_cl_delay_days.equalsIgnoreCase(name)) {
			return pay_schd_cl_delay_days();
		}
		if ($note_days.equalsIgnoreCase(name)) {
			return note_days();
		}
		if ($bp_com_upd_cntr.equalsIgnoreCase(name)) {
			return bp_com_upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCTimestamp getTimestampNE(String name) {
		if ($ins_ts_c.equalsIgnoreCase(name)) {
			return ins_ts_c();
		}
		if ($upd_ts_c.equalsIgnoreCase(name)) {
			return upd_ts_c();
		}
		if ($del_ts_c.equalsIgnoreCase(name)) {
			return del_ts_c();
		}
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		if ($del_ts.equalsIgnoreCase(name)) {
			return del_ts();
		}
		return super.getTimestampNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		if ($all_com_flg.equalsIgnoreCase(name)) {
			return all_com_flg();
		}
		if ($org_all_com_flg.equalsIgnoreCase(name)) {
			return org_all_com_flg();
		}
		if ($com_use_flg.equalsIgnoreCase(name)) {
			return com_use_flg();
		}
		if ($com_ex_flg.equalsIgnoreCase(name)) {
			return com_ex_flg();
		}
		if ($cst_flg.equalsIgnoreCase(name)) {
			return cst_flg();
		}
		if ($org_cst_flg.equalsIgnoreCase(name)) {
			return org_cst_flg();
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
		if ($dlv_flg.equalsIgnoreCase(name)) {
			return dlv_flg();
		}
		if ($dest_flg.equalsIgnoreCase(name)) {
			return dest_flg();
		}
		if ($cred_flg.equalsIgnoreCase(name)) {
			return cred_flg();
		}
		if ($sppl_flg.equalsIgnoreCase(name)) {
			return sppl_flg();
		}
		if ($org_sppl_flg.equalsIgnoreCase(name)) {
			return org_sppl_flg();
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
		if ($maker_flg.equalsIgnoreCase(name)) {
			return maker_flg();
		}
		if ($cst_sundry_flg.equalsIgnoreCase(name)) {
			return cst_sundry_flg();
		}
		if ($sls_upri_cng_flg.equalsIgnoreCase(name)) {
			return sls_upri_cng_flg();
		}
		if ($sls_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			return sls_tax_cd_prio_flg();
		}
		if ($stk_lst_issue_flg.equalsIgnoreCase(name)) {
			return stk_lst_issue_flg();
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
		if ($tax_on_bill_flg.equalsIgnoreCase(name)) {
			return tax_on_bill_flg();
		}
		if ($auto_line_appl_flg.equalsIgnoreCase(name)) {
			return auto_line_appl_flg();
		}
		if ($sls_interim_cl_flg.equalsIgnoreCase(name)) {
			return sls_interim_cl_flg();
		}
		if ($bill_dtl_outp_flg.equalsIgnoreCase(name)) {
			return bill_dtl_outp_flg();
		}
		if ($bfw_bal_disp_flg.equalsIgnoreCase(name)) {
			return bfw_bal_disp_flg();
		}
		if ($bill_dtl_adv_flg.equalsIgnoreCase(name)) {
			return bill_dtl_adv_flg();
		}
		if ($bill_dtl_rcv_flg.equalsIgnoreCase(name)) {
			return bill_dtl_rcv_flg();
		}
		if ($rcv_auto_appl_tgt_flg.equalsIgnoreCase(name)) {
			return rcv_auto_appl_tgt_flg();
		}
		if ($rcv_amt_match_flg.equalsIgnoreCase(name)) {
			return rcv_amt_match_flg();
		}
		if ($ar_sttl_typ_match_flg.equalsIgnoreCase(name)) {
			return ar_sttl_typ_match_flg();
		}
		if ($calc_com_paid_flg.equalsIgnoreCase(name)) {
			return calc_com_paid_flg();
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			return dlv_sundry_flg();
		}
		if ($tdlv_flg.equalsIgnoreCase(name)) {
			return tdlv_flg();
		}
		if ($org_tdlv_flg.equalsIgnoreCase(name)) {
			return org_tdlv_flg();
		}
		if ($tdlv_req_flg.equalsIgnoreCase(name)) {
			return tdlv_req_flg();
		}
		if ($pri_prnt_flg.equalsIgnoreCase(name)) {
			return pri_prnt_flg();
		}
		if ($cnsgn_stktk_flg.equalsIgnoreCase(name)) {
			return cnsgn_stktk_flg();
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			return subcon_flg();
		}
		if ($onr_prsppl_flg.equalsIgnoreCase(name)) {
			return onr_prsppl_flg();
		}
		if ($org_onr_prsppl_flg.equalsIgnoreCase(name)) {
			return org_onr_prsppl_flg();
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			return repurc_obli_flg();
		}
		if ($purc_upri_cng_flg.equalsIgnoreCase(name)) {
			return purc_upri_cng_flg();
		}
		if ($prms_recv_flg.equalsIgnoreCase(name)) {
			return prms_recv_flg();
		}
		if ($purc_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			return purc_tax_cd_prio_flg();
		}
		if ($po_dlv_slip_flg.equalsIgnoreCase(name)) {
			return po_dlv_slip_flg();
		}
		if ($dlv_inst_dlv_slip_flg.equalsIgnoreCase(name)) {
			return dlv_inst_dlv_slip_flg();
		}
		if ($prms_rcpt_dlv_slip_flg.equalsIgnoreCase(name)) {
			return prms_rcpt_dlv_slip_flg();
		}
		if ($wrk_po_flg.equalsIgnoreCase(name)) {
			return wrk_po_flg();
		}
		if ($wrk_ap_flg.equalsIgnoreCase(name)) {
			return wrk_ap_flg();
		}
		if ($sppl_iv_flg.equalsIgnoreCase(name)) {
			return sppl_iv_flg();
		}
		if ($rcpt_iv_dup_flg.equalsIgnoreCase(name)) {
			return rcpt_iv_dup_flg();
		}
		if ($prov_upri_cng_flg.equalsIgnoreCase(name)) {
			return prov_upri_cng_flg();
		}
		if ($prov_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			return prov_tax_cd_prio_flg();
		}
		if ($purc_interim_cl_flg.equalsIgnoreCase(name)) {
			return purc_interim_cl_flg();
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			return pay_spot_flg();
		}
		if ($tax_on_pay_flg.equalsIgnoreCase(name)) {
			return tax_on_pay_flg();
		}
		if ($batch_pay_schd_cl_flg.equalsIgnoreCase(name)) {
			return batch_pay_schd_cl_flg();
		}
		if ($pay_ntc_prnt_flg.equalsIgnoreCase(name)) {
			return pay_ntc_prnt_flg();
		}
		if ($pay_ntc_dtl_outp_flg.equalsIgnoreCase(name)) {
			return pay_ntc_dtl_outp_flg();
		}
		if ($pay_ntc_bfw_bal_disp_flg.equalsIgnoreCase(name)) {
			return pay_ntc_bfw_bal_disp_flg();
		}
		if ($pay_ntc_adv_pay_flg.equalsIgnoreCase(name)) {
			return pay_ntc_adv_pay_flg();
		}
		if ($pay_ntc_dtl_pay_flg.equalsIgnoreCase(name)) {
			return pay_ntc_dtl_pay_flg();
		}
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($bp_nm_lcl.equalsIgnoreCase(name)) {
			bp_nm_lcl(value);
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
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			cur_nm(value);
			return;
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			cntry_cd(value);
			return;
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			cntry_nm(value);
			return;
		}
		if ($area_cd.equalsIgnoreCase(name)) {
			area_cd(value);
			return;
		}
		if ($area_nm.equalsIgnoreCase(name)) {
			area_nm(value);
			return;
		}
		if ($biz_co_no.equalsIgnoreCase(name)) {
			biz_co_no(value);
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
		if ($tel.equalsIgnoreCase(name)) {
			tel(value);
			return;
		}
		if ($fax.equalsIgnoreCase(name)) {
			fax(value);
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
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			prnt_lcl_cd(value);
			return;
		}
		if ($prnt_lcl_nm.equalsIgnoreCase(name)) {
			prnt_lcl_nm(value);
			return;
		}
		if ($bp_alc_grp.equalsIgnoreCase(name)) {
			bp_alc_grp(value);
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
		if ($bp_grp_cd1.equalsIgnoreCase(name)) {
			bp_grp_cd1(value);
			return;
		}
		if ($bp_grp_nm1.equalsIgnoreCase(name)) {
			bp_grp_nm1(value);
			return;
		}
		if ($bp_grp_cd2.equalsIgnoreCase(name)) {
			bp_grp_cd2(value);
			return;
		}
		if ($bp_grp_nm2.equalsIgnoreCase(name)) {
			bp_grp_nm2(value);
			return;
		}
		if ($bp_grp_cd3.equalsIgnoreCase(name)) {
			bp_grp_cd3(value);
			return;
		}
		if ($bp_grp_nm3.equalsIgnoreCase(name)) {
			bp_grp_nm3(value);
			return;
		}
		if ($bp_grp_cd4.equalsIgnoreCase(name)) {
			bp_grp_cd4(value);
			return;
		}
		if ($bp_grp_nm4.equalsIgnoreCase(name)) {
			bp_grp_nm4(value);
			return;
		}
		if ($bp_grp_cd5.equalsIgnoreCase(name)) {
			bp_grp_cd5(value);
			return;
		}
		if ($bp_grp_nm5.equalsIgnoreCase(name)) {
			bp_grp_nm5(value);
			return;
		}
		if ($bp_grp_cd6.equalsIgnoreCase(name)) {
			bp_grp_cd6(value);
			return;
		}
		if ($bp_grp_nm6.equalsIgnoreCase(name)) {
			bp_grp_nm6(value);
			return;
		}
		if ($bp_grp_cd7.equalsIgnoreCase(name)) {
			bp_grp_cd7(value);
			return;
		}
		if ($bp_grp_nm7.equalsIgnoreCase(name)) {
			bp_grp_nm7(value);
			return;
		}
		if ($bp_grp_cd8.equalsIgnoreCase(name)) {
			bp_grp_cd8(value);
			return;
		}
		if ($bp_grp_nm8.equalsIgnoreCase(name)) {
			bp_grp_nm8(value);
			return;
		}
		if ($bp_grp_cd9.equalsIgnoreCase(name)) {
			bp_grp_cd9(value);
			return;
		}
		if ($bp_grp_nm9.equalsIgnoreCase(name)) {
			bp_grp_nm9(value);
			return;
		}
		if ($bp_grp_cd10.equalsIgnoreCase(name)) {
			bp_grp_cd10(value);
			return;
		}
		if ($bp_grp_nm10.equalsIgnoreCase(name)) {
			bp_grp_nm10(value);
			return;
		}
		if ($ins_usr_id_c.equalsIgnoreCase(name)) {
			ins_usr_id_c(value);
			return;
		}
		if ($ins_usr_nm_c.equalsIgnoreCase(name)) {
			ins_usr_nm_c(value);
			return;
		}
		if ($ins_func_id_c.equalsIgnoreCase(name)) {
			ins_func_id_c(value);
			return;
		}
		if ($ins_func_nm_c.equalsIgnoreCase(name)) {
			ins_func_nm_c(value);
			return;
		}
		if ($upd_usr_id_c.equalsIgnoreCase(name)) {
			upd_usr_id_c(value);
			return;
		}
		if ($upd_usr_nm_c.equalsIgnoreCase(name)) {
			upd_usr_nm_c(value);
			return;
		}
		if ($upd_func_id_c.equalsIgnoreCase(name)) {
			upd_func_id_c(value);
			return;
		}
		if ($upd_func_nm_c.equalsIgnoreCase(name)) {
			upd_func_nm_c(value);
			return;
		}
		if ($upd_srv_req_no_c.equalsIgnoreCase(name)) {
			upd_srv_req_no_c(value);
			return;
		}
		if ($del_usr_id_c.equalsIgnoreCase(name)) {
			del_usr_id_c(value);
			return;
		}
		if ($del_usr_nm_c.equalsIgnoreCase(name)) {
			del_usr_nm_c(value);
			return;
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			ins_usr_id(value);
			return;
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			ins_usr_nm(value);
			return;
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			ins_func_id(value);
			return;
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			ins_func_nm(value);
			return;
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			upd_usr_id(value);
			return;
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			upd_usr_nm(value);
			return;
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			upd_func_id(value);
			return;
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			upd_func_nm(value);
			return;
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			upd_srv_req_no(value);
			return;
		}
		if ($del_usr_id.equalsIgnoreCase(name)) {
			del_usr_id(value);
			return;
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			del_usr_nm(value);
			return;
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($acst_nm.equalsIgnoreCase(name)) {
			acst_nm(value);
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
		if ($ar_dpt_typ.equalsIgnoreCase(name)) {
			ar_dpt_typ(value);
			return;
		}
		if ($ar_dpt_typ_nm.equalsIgnoreCase(name)) {
			ar_dpt_typ_nm(value);
			return;
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			ar_dpt_cd(value);
			return;
		}
		if ($ar_dpt_nm.equalsIgnoreCase(name)) {
			ar_dpt_nm(value);
			return;
		}
		if ($check_ar_dpt_cd.equalsIgnoreCase(name)) {
			check_ar_dpt_cd(value);
			return;
		}
		if ($sls_upri_rnd_typ.equalsIgnoreCase(name)) {
			sls_upri_rnd_typ(value);
			return;
		}
		if ($sls_upri_rnd_typ_nm.equalsIgnoreCase(name)) {
			sls_upri_rnd_typ_nm(value);
			return;
		}
		if ($sls_upri_req_typ.equalsIgnoreCase(name)) {
			sls_upri_req_typ(value);
			return;
		}
		if ($sls_upri_req_typ_nm.equalsIgnoreCase(name)) {
			sls_upri_req_typ_nm(value);
			return;
		}
		if ($sls_amt_rnd_typ.equalsIgnoreCase(name)) {
			sls_amt_rnd_typ(value);
			return;
		}
		if ($sls_amt_rnd_typ_nm.equalsIgnoreCase(name)) {
			sls_amt_rnd_typ_nm(value);
			return;
		}
		if ($sls_tax_calc_typ.equalsIgnoreCase(name)) {
			sls_tax_calc_typ(value);
			return;
		}
		if ($sls_tax_calc_typ_nm.equalsIgnoreCase(name)) {
			sls_tax_calc_typ_nm(value);
			return;
		}
		if ($sls_tax_rnd_typ.equalsIgnoreCase(name)) {
			sls_tax_rnd_typ(value);
			return;
		}
		if ($sls_tax_rnd_typ_nm.equalsIgnoreCase(name)) {
			sls_tax_rnd_typ_nm(value);
			return;
		}
		if ($sls_tax_cd.equalsIgnoreCase(name)) {
			sls_tax_cd(value);
			return;
		}
		if ($sls_tax_nm.equalsIgnoreCase(name)) {
			sls_tax_nm(value);
			return;
		}
		if ($lot_back_stop_typ.equalsIgnoreCase(name)) {
			lot_back_stop_typ(value);
			return;
		}
		if ($lot_back_stop_typ_nm.equalsIgnoreCase(name)) {
			lot_back_stop_typ_nm(value);
			return;
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			sls_basis_typ(value);
			return;
		}
		if ($sls_basis_typ_nm.equalsIgnoreCase(name)) {
			sls_basis_typ_nm(value);
			return;
		}
		if ($bill_basis_typ.equalsIgnoreCase(name)) {
			bill_basis_typ(value);
			return;
		}
		if ($bill_basis_typ_nm.equalsIgnoreCase(name)) {
			bill_basis_typ_nm(value);
			return;
		}
		if ($slip_each_lot_typ.equalsIgnoreCase(name)) {
			slip_each_lot_typ(value);
			return;
		}
		if ($slip_each_lot_typ_nm.equalsIgnoreCase(name)) {
			slip_each_lot_typ_nm(value);
			return;
		}
		if ($ship_schd_split_typ.equalsIgnoreCase(name)) {
			ship_schd_split_typ(value);
			return;
		}
		if ($ship_schd_split_typ_nm.equalsIgnoreCase(name)) {
			ship_schd_split_typ_nm(value);
			return;
		}
		if ($stk_lst_form_cd.equalsIgnoreCase(name)) {
			stk_lst_form_cd(value);
			return;
		}
		if ($stk_lst_form_nm.equalsIgnoreCase(name)) {
			stk_lst_form_nm(value);
			return;
		}
		if ($cst_ship_form_cd.equalsIgnoreCase(name)) {
			cst_ship_form_cd(value);
			return;
		}
		if ($cst_ship_form_nm.equalsIgnoreCase(name)) {
			cst_ship_form_nm(value);
			return;
		}
		if ($cst_tterm_cd1.equalsIgnoreCase(name)) {
			cst_tterm_cd1(value);
			return;
		}
		if ($cst_tterm_nm1.equalsIgnoreCase(name)) {
			cst_tterm_nm1(value);
			return;
		}
		if ($cst_tterm_cd2.equalsIgnoreCase(name)) {
			cst_tterm_cd2(value);
			return;
		}
		if ($cst_tterm_nm2.equalsIgnoreCase(name)) {
			cst_tterm_nm2(value);
			return;
		}
		if ($cst_tterm_cd3.equalsIgnoreCase(name)) {
			cst_tterm_cd3(value);
			return;
		}
		if ($cst_tterm_nm3.equalsIgnoreCase(name)) {
			cst_tterm_nm3(value);
			return;
		}
		if ($sls_anly_cd1.equalsIgnoreCase(name)) {
			sls_anly_cd1(value);
			return;
		}
		if ($sls_anly_nm1.equalsIgnoreCase(name)) {
			sls_anly_nm1(value);
			return;
		}
		if ($sls_anly_cd2.equalsIgnoreCase(name)) {
			sls_anly_cd2(value);
			return;
		}
		if ($sls_anly_nm2.equalsIgnoreCase(name)) {
			sls_anly_nm2(value);
			return;
		}
		if ($sls_anly_cd3.equalsIgnoreCase(name)) {
			sls_anly_cd3(value);
			return;
		}
		if ($sls_anly_nm3.equalsIgnoreCase(name)) {
			sls_anly_nm3(value);
			return;
		}
		if ($cst_prnt_typ.equalsIgnoreCase(name)) {
			cst_prnt_typ(value);
			return;
		}
		if ($cst_prnt_typ_nm.equalsIgnoreCase(name)) {
			cst_prnt_typ_nm(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			bcst_nm(value);
			return;
		}
		if ($acst_prnt_typ.equalsIgnoreCase(name)) {
			acst_prnt_typ(value);
			return;
		}
		if ($acst_prnt_typ_nm.equalsIgnoreCase(name)) {
			acst_prnt_typ_nm(value);
			return;
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			rcst_cd(value);
			return;
		}
		if ($rcst_nm.equalsIgnoreCase(name)) {
			rcst_nm(value);
			return;
		}
		if ($ar_cred_cd.equalsIgnoreCase(name)) {
			ar_cred_cd(value);
			return;
		}
		if ($ar_cred_nm.equalsIgnoreCase(name)) {
			ar_cred_nm(value);
			return;
		}
		if ($bill_dpt_typ.equalsIgnoreCase(name)) {
			bill_dpt_typ(value);
			return;
		}
		if ($bill_dpt_typ_nm.equalsIgnoreCase(name)) {
			bill_dpt_typ_nm(value);
			return;
		}
		if ($bcst_dpt_cd.equalsIgnoreCase(name)) {
			bcst_dpt_cd(value);
			return;
		}
		if ($bcst_dpt_nm.equalsIgnoreCase(name)) {
			bcst_dpt_nm(value);
			return;
		}
		if ($check_bcst_dpt_cd.equalsIgnoreCase(name)) {
			check_bcst_dpt_cd(value);
			return;
		}
		if ($bill_cl_typ.equalsIgnoreCase(name)) {
			bill_cl_typ(value);
			return;
		}
		if ($bill_cl_typ_nm.equalsIgnoreCase(name)) {
			bill_cl_typ_nm(value);
			return;
		}
		if ($bill_tax_rnd_typ.equalsIgnoreCase(name)) {
			bill_tax_rnd_typ(value);
			return;
		}
		if ($bill_tax_rnd_typ_nm.equalsIgnoreCase(name)) {
			bill_tax_rnd_typ_nm(value);
			return;
		}
		if ($bill_cl_ba_typ.equalsIgnoreCase(name)) {
			bill_cl_ba_typ(value);
			return;
		}
		if ($bill_cl_ba_typ_nm.equalsIgnoreCase(name)) {
			bill_cl_ba_typ_nm(value);
			return;
		}
		if ($bill_cal_cd.equalsIgnoreCase(name)) {
			bill_cal_cd(value);
			return;
		}
		if ($bill_cal_nm.equalsIgnoreCase(name)) {
			bill_cal_nm(value);
			return;
		}
		if ($rcv_ba_typ.equalsIgnoreCase(name)) {
			rcv_ba_typ(value);
			return;
		}
		if ($rcv_ba_typ_nm.equalsIgnoreCase(name)) {
			rcv_ba_typ_nm(value);
			return;
		}
		if ($ar_setoff_grp_cd.equalsIgnoreCase(name)) {
			ar_setoff_grp_cd(value);
			return;
		}
		if ($ar_setoff_grp_nm.equalsIgnoreCase(name)) {
			ar_setoff_grp_nm(value);
			return;
		}
		if ($bcst_prnt_typ.equalsIgnoreCase(name)) {
			bcst_prnt_typ(value);
			return;
		}
		if ($bcst_prnt_typ_nm.equalsIgnoreCase(name)) {
			bcst_prnt_typ_nm(value);
			return;
		}
		if ($bill_zip_cd.equalsIgnoreCase(name)) {
			bill_zip_cd(value);
			return;
		}
		if ($bill_addr1.equalsIgnoreCase(name)) {
			bill_addr1(value);
			return;
		}
		if ($bill_addr2.equalsIgnoreCase(name)) {
			bill_addr2(value);
			return;
		}
		if ($bill_addr3.equalsIgnoreCase(name)) {
			bill_addr3(value);
			return;
		}
		if ($bill_addr4.equalsIgnoreCase(name)) {
			bill_addr4(value);
			return;
		}
		if ($bill_tel.equalsIgnoreCase(name)) {
			bill_tel(value);
			return;
		}
		if ($bill_bcst_nm.equalsIgnoreCase(name)) {
			bill_bcst_nm(value);
			return;
		}
		if ($bill_bcst_dpt.equalsIgnoreCase(name)) {
			bill_bcst_dpt(value);
			return;
		}
		if ($bill_bcst_psn.equalsIgnoreCase(name)) {
			bill_bcst_psn(value);
			return;
		}
		if ($bill_bcst_psn_title.equalsIgnoreCase(name)) {
			bill_bcst_psn_title(value);
			return;
		}
		if ($bill_prnt_typ.equalsIgnoreCase(name)) {
			bill_prnt_typ(value);
			return;
		}
		if ($bill_prnt_typ_nm.equalsIgnoreCase(name)) {
			bill_prnt_typ_nm(value);
			return;
		}
		if ($sls_dtl_outp_typ.equalsIgnoreCase(name)) {
			sls_dtl_outp_typ(value);
			return;
		}
		if ($sls_dtl_outp_typ_nm.equalsIgnoreCase(name)) {
			sls_dtl_outp_typ_nm(value);
			return;
		}
		if ($bill_dtl_subttl_typ.equalsIgnoreCase(name)) {
			bill_dtl_subttl_typ(value);
			return;
		}
		if ($bill_dtl_subttl_typ_nm.equalsIgnoreCase(name)) {
			bill_dtl_subttl_typ_nm(value);
			return;
		}
		if ($bill_dtl_brk_typ.equalsIgnoreCase(name)) {
			bill_dtl_brk_typ(value);
			return;
		}
		if ($bill_dtl_brk_typ_nm.equalsIgnoreCase(name)) {
			bill_dtl_brk_typ_nm(value);
			return;
		}
		if ($bill_dtl_sort_typ.equalsIgnoreCase(name)) {
			bill_dtl_sort_typ(value);
			return;
		}
		if ($bill_dtl_sort_typ_nm.equalsIgnoreCase(name)) {
			bill_dtl_sort_typ_nm(value);
			return;
		}
		if ($bill_can_slip_typ.equalsIgnoreCase(name)) {
			bill_can_slip_typ(value);
			return;
		}
		if ($bill_can_slip_typ_nm.equalsIgnoreCase(name)) {
			bill_can_slip_typ_nm(value);
			return;
		}
		if ($xfr_psn.equalsIgnoreCase(name)) {
			xfr_psn(value);
			return;
		}
		if ($rcst_prnt_typ.equalsIgnoreCase(name)) {
			rcst_prnt_typ(value);
			return;
		}
		if ($rcst_prnt_typ_nm.equalsIgnoreCase(name)) {
			rcst_prnt_typ_nm(value);
			return;
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
			return;
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			lg_grp_nm(value);
			return;
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			via_dlv_typ(value);
			return;
		}
		if ($via_dlv_typ_nm.equalsIgnoreCase(name)) {
			via_dlv_typ_nm(value);
			return;
		}
		if ($dlv_cal_cd.equalsIgnoreCase(name)) {
			dlv_cal_cd(value);
			return;
		}
		if ($dlv_cal_nm.equalsIgnoreCase(name)) {
			dlv_cal_nm(value);
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
		if ($dlv_chnnl1.equalsIgnoreCase(name)) {
			dlv_chnnl1(value);
			return;
		}
		if ($dlv_chnnl2.equalsIgnoreCase(name)) {
			dlv_chnnl2(value);
			return;
		}
		if ($dlv_chnnl3.equalsIgnoreCase(name)) {
			dlv_chnnl3(value);
			return;
		}
		if ($dlv_prnt_typ.equalsIgnoreCase(name)) {
			dlv_prnt_typ(value);
			return;
		}
		if ($dlv_prnt_typ_nm.equalsIgnoreCase(name)) {
			dlv_prnt_typ_nm(value);
			return;
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			asppl_cd(value);
			return;
		}
		if ($asppl_nm.equalsIgnoreCase(name)) {
			asppl_nm(value);
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
		if ($vmi_purc_dpt_cd.equalsIgnoreCase(name)) {
			vmi_purc_dpt_cd(value);
			return;
		}
		if ($vmi_purc_dpt_nm.equalsIgnoreCase(name)) {
			vmi_purc_dpt_nm(value);
			return;
		}
		if ($check_vmi_purc_dpt_cd.equalsIgnoreCase(name)) {
			check_vmi_purc_dpt_cd(value);
			return;
		}
		if ($purc_upri_req_typ.equalsIgnoreCase(name)) {
			purc_upri_req_typ(value);
			return;
		}
		if ($purc_upri_req_typ_nm.equalsIgnoreCase(name)) {
			purc_upri_req_typ_nm(value);
			return;
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			purc_amt_rnd_typ(value);
			return;
		}
		if ($purc_amt_rnd_typ_nm.equalsIgnoreCase(name)) {
			purc_amt_rnd_typ_nm(value);
			return;
		}
		if ($purc_tax_calc_typ.equalsIgnoreCase(name)) {
			purc_tax_calc_typ(value);
			return;
		}
		if ($purc_tax_calc_typ_nm.equalsIgnoreCase(name)) {
			purc_tax_calc_typ_nm(value);
			return;
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			purc_tax_rnd_typ(value);
			return;
		}
		if ($purc_tax_rnd_typ_nm.equalsIgnoreCase(name)) {
			purc_tax_rnd_typ_nm(value);
			return;
		}
		if ($purc_tax_cd.equalsIgnoreCase(name)) {
			purc_tax_cd(value);
			return;
		}
		if ($purc_tax_nm.equalsIgnoreCase(name)) {
			purc_tax_nm(value);
			return;
		}
		if ($sppl_cal_cd.equalsIgnoreCase(name)) {
			sppl_cal_cd(value);
			return;
		}
		if ($sppl_cal_nm.equalsIgnoreCase(name)) {
			sppl_cal_nm(value);
			return;
		}
		if ($po_print_cd.equalsIgnoreCase(name)) {
			po_print_cd(value);
			return;
		}
		if ($po_print_nm.equalsIgnoreCase(name)) {
			po_print_nm(value);
			return;
		}
		if ($sppl_ship_form_cd.equalsIgnoreCase(name)) {
			sppl_ship_form_cd(value);
			return;
		}
		if ($sppl_ship_form_nm.equalsIgnoreCase(name)) {
			sppl_ship_form_nm(value);
			return;
		}
		if ($prov_rcv_typ.equalsIgnoreCase(name)) {
			prov_rcv_typ(value);
			return;
		}
		if ($prov_rcv_typ_nm.equalsIgnoreCase(name)) {
			prov_rcv_typ_nm(value);
			return;
		}
		if ($purc_slip_each_lot_typ.equalsIgnoreCase(name)) {
			purc_slip_each_lot_typ(value);
			return;
		}
		if ($purc_slip_each_lot_typ_nm.equalsIgnoreCase(name)) {
			purc_slip_each_lot_typ_nm(value);
			return;
		}
		if ($sppl_tterm_cd1.equalsIgnoreCase(name)) {
			sppl_tterm_cd1(value);
			return;
		}
		if ($sppl_tterm_nm1.equalsIgnoreCase(name)) {
			sppl_tterm_nm1(value);
			return;
		}
		if ($sppl_tterm_cd2.equalsIgnoreCase(name)) {
			sppl_tterm_cd2(value);
			return;
		}
		if ($sppl_tterm_nm2.equalsIgnoreCase(name)) {
			sppl_tterm_nm2(value);
			return;
		}
		if ($sppl_tterm_cd3.equalsIgnoreCase(name)) {
			sppl_tterm_cd3(value);
			return;
		}
		if ($sppl_tterm_nm3.equalsIgnoreCase(name)) {
			sppl_tterm_nm3(value);
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
		if ($outsrc_upri_typ.equalsIgnoreCase(name)) {
			outsrc_upri_typ(value);
			return;
		}
		if ($outsrc_upri_typ_nm.equalsIgnoreCase(name)) {
			outsrc_upri_typ_nm(value);
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
		if ($prov_tax_cd.equalsIgnoreCase(name)) {
			prov_tax_cd(value);
			return;
		}
		if ($prov_tax_nm.equalsIgnoreCase(name)) {
			prov_tax_nm(value);
			return;
		}
		if ($prov_amt_rnd_typ.equalsIgnoreCase(name)) {
			prov_amt_rnd_typ(value);
			return;
		}
		if ($prov_amt_rnd_typ_nm.equalsIgnoreCase(name)) {
			prov_amt_rnd_typ_nm(value);
			return;
		}
		if ($prov_tax_calc_typ.equalsIgnoreCase(name)) {
			prov_tax_calc_typ(value);
			return;
		}
		if ($prov_tax_calc_typ_nm.equalsIgnoreCase(name)) {
			prov_tax_calc_typ_nm(value);
			return;
		}
		if ($prov_tax_rnd_typ.equalsIgnoreCase(name)) {
			prov_tax_rnd_typ(value);
			return;
		}
		if ($prov_tax_rnd_typ_nm.equalsIgnoreCase(name)) {
			prov_tax_rnd_typ_nm(value);
			return;
		}
		if ($sppl_prnt_typ.equalsIgnoreCase(name)) {
			sppl_prnt_typ(value);
			return;
		}
		if ($sppl_prnt_typ_nm.equalsIgnoreCase(name)) {
			sppl_prnt_typ_nm(value);
			return;
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			bsppl_cd(value);
			return;
		}
		if ($bsppl_nm.equalsIgnoreCase(name)) {
			bsppl_nm(value);
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
		if ($check_ap_dpt_cd.equalsIgnoreCase(name)) {
			check_ap_dpt_cd(value);
			return;
		}
		if ($asppl_prnt_typ.equalsIgnoreCase(name)) {
			asppl_prnt_typ(value);
			return;
		}
		if ($asppl_prnt_typ_nm.equalsIgnoreCase(name)) {
			asppl_prnt_typ_nm(value);
			return;
		}
		if ($psppl_cd.equalsIgnoreCase(name)) {
			psppl_cd(value);
			return;
		}
		if ($psppl_nm.equalsIgnoreCase(name)) {
			psppl_nm(value);
			return;
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			bsppl_dpt_cd(value);
			return;
		}
		if ($bsppl_dpt_nm.equalsIgnoreCase(name)) {
			bsppl_dpt_nm(value);
			return;
		}
		if ($check_bsppl_dpt_cd.equalsIgnoreCase(name)) {
			check_bsppl_dpt_cd(value);
			return;
		}
		if ($ap_cred_cd.equalsIgnoreCase(name)) {
			ap_cred_cd(value);
			return;
		}
		if ($ap_cred_nm.equalsIgnoreCase(name)) {
			ap_cred_nm(value);
			return;
		}
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			pay_bank_ac_cd(value);
			return;
		}
		if ($pay_bank_ac_nm.equalsIgnoreCase(name)) {
			pay_bank_ac_nm(value);
			return;
		}
		if ($ap_setoff_grp_cd.equalsIgnoreCase(name)) {
			ap_setoff_grp_cd(value);
			return;
		}
		if ($ap_setoff_grp_nm.equalsIgnoreCase(name)) {
			ap_setoff_grp_nm(value);
			return;
		}
		if ($pay_tax_rnd_typ.equalsIgnoreCase(name)) {
			pay_tax_rnd_typ(value);
			return;
		}
		if ($pay_tax_rnd_typ_nm.equalsIgnoreCase(name)) {
			pay_tax_rnd_typ_nm(value);
			return;
		}
		if ($pay_schd_ba_typ.equalsIgnoreCase(name)) {
			pay_schd_ba_typ(value);
			return;
		}
		if ($pay_schd_ba_typ_nm.equalsIgnoreCase(name)) {
			pay_schd_ba_typ_nm(value);
			return;
		}
		if ($pay_schd_cl_ba_typ.equalsIgnoreCase(name)) {
			pay_schd_cl_ba_typ(value);
			return;
		}
		if ($pay_schd_cl_ba_typ_nm.equalsIgnoreCase(name)) {
			pay_schd_cl_ba_typ_nm(value);
			return;
		}
		if ($bsppl_prnt_typ.equalsIgnoreCase(name)) {
			bsppl_prnt_typ(value);
			return;
		}
		if ($bsppl_prnt_typ_nm.equalsIgnoreCase(name)) {
			bsppl_prnt_typ_nm(value);
			return;
		}
		if ($pay_ntc_zip_cd.equalsIgnoreCase(name)) {
			pay_ntc_zip_cd(value);
			return;
		}
		if ($pay_ntc_addr1.equalsIgnoreCase(name)) {
			pay_ntc_addr1(value);
			return;
		}
		if ($pay_ntc_addr2.equalsIgnoreCase(name)) {
			pay_ntc_addr2(value);
			return;
		}
		if ($pay_ntc_addr3.equalsIgnoreCase(name)) {
			pay_ntc_addr3(value);
			return;
		}
		if ($pay_ntc_addr4.equalsIgnoreCase(name)) {
			pay_ntc_addr4(value);
			return;
		}
		if ($pay_ntc_tel.equalsIgnoreCase(name)) {
			pay_ntc_tel(value);
			return;
		}
		if ($pay_ntc_bsppl_nm.equalsIgnoreCase(name)) {
			pay_ntc_bsppl_nm(value);
			return;
		}
		if ($pay_ntc_bsppl_dpt.equalsIgnoreCase(name)) {
			pay_ntc_bsppl_dpt(value);
			return;
		}
		if ($pay_ntc_bsppl_psn.equalsIgnoreCase(name)) {
			pay_ntc_bsppl_psn(value);
			return;
		}
		if ($pay_ntc_bsppl_psn_title.equalsIgnoreCase(name)) {
			pay_ntc_bsppl_psn_title(value);
			return;
		}
		if ($pay_ntc_dtl_subttl_typ.equalsIgnoreCase(name)) {
			pay_ntc_dtl_subttl_typ(value);
			return;
		}
		if ($pay_ntc_dtl_subttl_typ_nm.equalsIgnoreCase(name)) {
			pay_ntc_dtl_subttl_typ_nm(value);
			return;
		}
		if ($pay_ntc_dtl_brk_typ.equalsIgnoreCase(name)) {
			pay_ntc_dtl_brk_typ(value);
			return;
		}
		if ($pay_ntc_dtl_brk_typ_nm.equalsIgnoreCase(name)) {
			pay_ntc_dtl_brk_typ_nm(value);
			return;
		}
		if ($pay_ntc_dtl_sort_typ.equalsIgnoreCase(name)) {
			pay_ntc_dtl_sort_typ(value);
			return;
		}
		if ($pay_ntc_dtl_sort_typ_nm.equalsIgnoreCase(name)) {
			pay_ntc_dtl_sort_typ_nm(value);
			return;
		}
		if ($pay_ntc_can_slip_typ.equalsIgnoreCase(name)) {
			pay_ntc_can_slip_typ(value);
			return;
		}
		if ($pay_ntc_can_slip_typ_nm.equalsIgnoreCase(name)) {
			pay_ntc_can_slip_typ_nm(value);
			return;
		}
		if ($psppl_rmrks.equalsIgnoreCase(name)) {
			psppl_rmrks(value);
			return;
		}
		if ($pay_dpt_cd.equalsIgnoreCase(name)) {
			pay_dpt_cd(value);
			return;
		}
		if ($pay_dpt_nm.equalsIgnoreCase(name)) {
			pay_dpt_nm(value);
			return;
		}
		if ($check_pay_dpt_cd.equalsIgnoreCase(name)) {
			check_pay_dpt_cd(value);
			return;
		}
		if ($psppl_prnt_typ.equalsIgnoreCase(name)) {
			psppl_prnt_typ(value);
			return;
		}
		if ($psppl_prnt_typ_nm.equalsIgnoreCase(name)) {
			psppl_prnt_typ_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($upd_cntr_c.equalsIgnoreCase(name)) {
			upd_cntr_c(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($ship_lt.equalsIgnoreCase(name)) {
			ship_lt(value);
			return;
		}
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		if ($bill_cl_delay_days.equalsIgnoreCase(name)) {
			bill_cl_delay_days(value);
			return;
		}
		if ($auto_appl_delay_days.equalsIgnoreCase(name)) {
			auto_appl_delay_days(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($psppl_cl_day1.equalsIgnoreCase(name)) {
			psppl_cl_day1(value);
			return;
		}
		if ($psppl_cl_day2.equalsIgnoreCase(name)) {
			psppl_cl_day2(value);
			return;
		}
		if ($psppl_cl_day3.equalsIgnoreCase(name)) {
			psppl_cl_day3(value);
			return;
		}
		if ($psppl_cl_day4.equalsIgnoreCase(name)) {
			psppl_cl_day4(value);
			return;
		}
		if ($psppl_cl_day5.equalsIgnoreCase(name)) {
			psppl_cl_day5(value);
			return;
		}
		if ($pay_schd_cl_delay_days.equalsIgnoreCase(name)) {
			pay_schd_cl_delay_days(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($bp_com_upd_cntr.equalsIgnoreCase(name)) {
			bp_com_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($upd_cntr_c.equalsIgnoreCase(name)) {
			upd_cntr_c(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($ship_lt.equalsIgnoreCase(name)) {
			ship_lt(value);
			return;
		}
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		if ($bill_cl_delay_days.equalsIgnoreCase(name)) {
			bill_cl_delay_days(value);
			return;
		}
		if ($auto_appl_delay_days.equalsIgnoreCase(name)) {
			auto_appl_delay_days(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($psppl_cl_day1.equalsIgnoreCase(name)) {
			psppl_cl_day1(value);
			return;
		}
		if ($psppl_cl_day2.equalsIgnoreCase(name)) {
			psppl_cl_day2(value);
			return;
		}
		if ($psppl_cl_day3.equalsIgnoreCase(name)) {
			psppl_cl_day3(value);
			return;
		}
		if ($psppl_cl_day4.equalsIgnoreCase(name)) {
			psppl_cl_day4(value);
			return;
		}
		if ($psppl_cl_day5.equalsIgnoreCase(name)) {
			psppl_cl_day5(value);
			return;
		}
		if ($pay_schd_cl_delay_days.equalsIgnoreCase(name)) {
			pay_schd_cl_delay_days(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($bp_com_upd_cntr.equalsIgnoreCase(name)) {
			bp_com_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($upd_cntr_c.equalsIgnoreCase(name)) {
			upd_cntr_c(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($ship_lt.equalsIgnoreCase(name)) {
			ship_lt(value);
			return;
		}
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		if ($bill_cl_delay_days.equalsIgnoreCase(name)) {
			bill_cl_delay_days(value);
			return;
		}
		if ($auto_appl_delay_days.equalsIgnoreCase(name)) {
			auto_appl_delay_days(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($psppl_cl_day1.equalsIgnoreCase(name)) {
			psppl_cl_day1(value);
			return;
		}
		if ($psppl_cl_day2.equalsIgnoreCase(name)) {
			psppl_cl_day2(value);
			return;
		}
		if ($psppl_cl_day3.equalsIgnoreCase(name)) {
			psppl_cl_day3(value);
			return;
		}
		if ($psppl_cl_day4.equalsIgnoreCase(name)) {
			psppl_cl_day4(value);
			return;
		}
		if ($psppl_cl_day5.equalsIgnoreCase(name)) {
			psppl_cl_day5(value);
			return;
		}
		if ($pay_schd_cl_delay_days.equalsIgnoreCase(name)) {
			pay_schd_cl_delay_days(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($bp_com_upd_cntr.equalsIgnoreCase(name)) {
			bp_com_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($upd_cntr_c.equalsIgnoreCase(name)) {
			upd_cntr_c(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($ship_lt.equalsIgnoreCase(name)) {
			ship_lt(value);
			return;
		}
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		if ($bill_cl_delay_days.equalsIgnoreCase(name)) {
			bill_cl_delay_days(value);
			return;
		}
		if ($auto_appl_delay_days.equalsIgnoreCase(name)) {
			auto_appl_delay_days(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($psppl_cl_day1.equalsIgnoreCase(name)) {
			psppl_cl_day1(value);
			return;
		}
		if ($psppl_cl_day2.equalsIgnoreCase(name)) {
			psppl_cl_day2(value);
			return;
		}
		if ($psppl_cl_day3.equalsIgnoreCase(name)) {
			psppl_cl_day3(value);
			return;
		}
		if ($psppl_cl_day4.equalsIgnoreCase(name)) {
			psppl_cl_day4(value);
			return;
		}
		if ($psppl_cl_day5.equalsIgnoreCase(name)) {
			psppl_cl_day5(value);
			return;
		}
		if ($pay_schd_cl_delay_days.equalsIgnoreCase(name)) {
			pay_schd_cl_delay_days(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($bp_com_upd_cntr.equalsIgnoreCase(name)) {
			bp_com_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($upd_cntr_c.equalsIgnoreCase(name)) {
			upd_cntr_c(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($ship_lt.equalsIgnoreCase(name)) {
			ship_lt(value);
			return;
		}
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		if ($bill_cl_delay_days.equalsIgnoreCase(name)) {
			bill_cl_delay_days(value);
			return;
		}
		if ($auto_appl_delay_days.equalsIgnoreCase(name)) {
			auto_appl_delay_days(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($psppl_cl_day1.equalsIgnoreCase(name)) {
			psppl_cl_day1(value);
			return;
		}
		if ($psppl_cl_day2.equalsIgnoreCase(name)) {
			psppl_cl_day2(value);
			return;
		}
		if ($psppl_cl_day3.equalsIgnoreCase(name)) {
			psppl_cl_day3(value);
			return;
		}
		if ($psppl_cl_day4.equalsIgnoreCase(name)) {
			psppl_cl_day4(value);
			return;
		}
		if ($psppl_cl_day5.equalsIgnoreCase(name)) {
			psppl_cl_day5(value);
			return;
		}
		if ($pay_schd_cl_delay_days.equalsIgnoreCase(name)) {
			pay_schd_cl_delay_days(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($bp_com_upd_cntr.equalsIgnoreCase(name)) {
			bp_com_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setTimestamp(String name, MCTimestamp value) {
		if ($ins_ts_c.equalsIgnoreCase(name)) {
			ins_ts_c(value);
			return;
		}
		if ($upd_ts_c.equalsIgnoreCase(name)) {
			upd_ts_c(value);
			return;
		}
		if ($del_ts_c.equalsIgnoreCase(name)) {
			del_ts_c(value);
			return;
		}
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		if ($del_ts.equalsIgnoreCase(name)) {
			del_ts(value);
			return;
		}
		super.setTimestamp(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		if ($all_com_flg.equalsIgnoreCase(name)) {
			all_com_flg(value);
			return;
		}
		if ($org_all_com_flg.equalsIgnoreCase(name)) {
			org_all_com_flg(value);
			return;
		}
		if ($com_use_flg.equalsIgnoreCase(name)) {
			com_use_flg(value);
			return;
		}
		if ($com_ex_flg.equalsIgnoreCase(name)) {
			com_ex_flg(value);
			return;
		}
		if ($cst_flg.equalsIgnoreCase(name)) {
			cst_flg(value);
			return;
		}
		if ($org_cst_flg.equalsIgnoreCase(name)) {
			org_cst_flg(value);
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
		if ($dlv_flg.equalsIgnoreCase(name)) {
			dlv_flg(value);
			return;
		}
		if ($dest_flg.equalsIgnoreCase(name)) {
			dest_flg(value);
			return;
		}
		if ($cred_flg.equalsIgnoreCase(name)) {
			cred_flg(value);
			return;
		}
		if ($sppl_flg.equalsIgnoreCase(name)) {
			sppl_flg(value);
			return;
		}
		if ($org_sppl_flg.equalsIgnoreCase(name)) {
			org_sppl_flg(value);
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
		if ($maker_flg.equalsIgnoreCase(name)) {
			maker_flg(value);
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
		if ($sls_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			sls_tax_cd_prio_flg(value);
			return;
		}
		if ($stk_lst_issue_flg.equalsIgnoreCase(name)) {
			stk_lst_issue_flg(value);
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
		if ($tax_on_bill_flg.equalsIgnoreCase(name)) {
			tax_on_bill_flg(value);
			return;
		}
		if ($auto_line_appl_flg.equalsIgnoreCase(name)) {
			auto_line_appl_flg(value);
			return;
		}
		if ($sls_interim_cl_flg.equalsIgnoreCase(name)) {
			sls_interim_cl_flg(value);
			return;
		}
		if ($bill_dtl_outp_flg.equalsIgnoreCase(name)) {
			bill_dtl_outp_flg(value);
			return;
		}
		if ($bfw_bal_disp_flg.equalsIgnoreCase(name)) {
			bfw_bal_disp_flg(value);
			return;
		}
		if ($bill_dtl_adv_flg.equalsIgnoreCase(name)) {
			bill_dtl_adv_flg(value);
			return;
		}
		if ($bill_dtl_rcv_flg.equalsIgnoreCase(name)) {
			bill_dtl_rcv_flg(value);
			return;
		}
		if ($rcv_auto_appl_tgt_flg.equalsIgnoreCase(name)) {
			rcv_auto_appl_tgt_flg(value);
			return;
		}
		if ($rcv_amt_match_flg.equalsIgnoreCase(name)) {
			rcv_amt_match_flg(value);
			return;
		}
		if ($ar_sttl_typ_match_flg.equalsIgnoreCase(name)) {
			ar_sttl_typ_match_flg(value);
			return;
		}
		if ($calc_com_paid_flg.equalsIgnoreCase(name)) {
			calc_com_paid_flg(value);
			return;
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			dlv_sundry_flg(value);
			return;
		}
		if ($tdlv_flg.equalsIgnoreCase(name)) {
			tdlv_flg(value);
			return;
		}
		if ($org_tdlv_flg.equalsIgnoreCase(name)) {
			org_tdlv_flg(value);
			return;
		}
		if ($tdlv_req_flg.equalsIgnoreCase(name)) {
			tdlv_req_flg(value);
			return;
		}
		if ($pri_prnt_flg.equalsIgnoreCase(name)) {
			pri_prnt_flg(value);
			return;
		}
		if ($cnsgn_stktk_flg.equalsIgnoreCase(name)) {
			cnsgn_stktk_flg(value);
			return;
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			subcon_flg(value);
			return;
		}
		if ($onr_prsppl_flg.equalsIgnoreCase(name)) {
			onr_prsppl_flg(value);
			return;
		}
		if ($org_onr_prsppl_flg.equalsIgnoreCase(name)) {
			org_onr_prsppl_flg(value);
			return;
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			repurc_obli_flg(value);
			return;
		}
		if ($purc_upri_cng_flg.equalsIgnoreCase(name)) {
			purc_upri_cng_flg(value);
			return;
		}
		if ($prms_recv_flg.equalsIgnoreCase(name)) {
			prms_recv_flg(value);
			return;
		}
		if ($purc_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			purc_tax_cd_prio_flg(value);
			return;
		}
		if ($po_dlv_slip_flg.equalsIgnoreCase(name)) {
			po_dlv_slip_flg(value);
			return;
		}
		if ($dlv_inst_dlv_slip_flg.equalsIgnoreCase(name)) {
			dlv_inst_dlv_slip_flg(value);
			return;
		}
		if ($prms_rcpt_dlv_slip_flg.equalsIgnoreCase(name)) {
			prms_rcpt_dlv_slip_flg(value);
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
		if ($sppl_iv_flg.equalsIgnoreCase(name)) {
			sppl_iv_flg(value);
			return;
		}
		if ($rcpt_iv_dup_flg.equalsIgnoreCase(name)) {
			rcpt_iv_dup_flg(value);
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
		if ($purc_interim_cl_flg.equalsIgnoreCase(name)) {
			purc_interim_cl_flg(value);
			return;
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			pay_spot_flg(value);
			return;
		}
		if ($tax_on_pay_flg.equalsIgnoreCase(name)) {
			tax_on_pay_flg(value);
			return;
		}
		if ($batch_pay_schd_cl_flg.equalsIgnoreCase(name)) {
			batch_pay_schd_cl_flg(value);
			return;
		}
		if ($pay_ntc_prnt_flg.equalsIgnoreCase(name)) {
			pay_ntc_prnt_flg(value);
			return;
		}
		if ($pay_ntc_dtl_outp_flg.equalsIgnoreCase(name)) {
			pay_ntc_dtl_outp_flg(value);
			return;
		}
		if ($pay_ntc_bfw_bal_disp_flg.equalsIgnoreCase(name)) {
			pay_ntc_bfw_bal_disp_flg(value);
			return;
		}
		if ($pay_ntc_adv_pay_flg.equalsIgnoreCase(name)) {
			pay_ntc_adv_pay_flg(value);
			return;
		}
		if ($pay_ntc_dtl_pay_flg.equalsIgnoreCase(name)) {
			pay_ntc_dtl_pay_flg(value);
			return;
		}
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($bp_nm_lcl.equalsIgnoreCase(name)) {
			bp_nm_lcl(value);
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
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			cur_nm(value);
			return;
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			cntry_cd(value);
			return;
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			cntry_nm(value);
			return;
		}
		if ($area_cd.equalsIgnoreCase(name)) {
			area_cd(value);
			return;
		}
		if ($area_nm.equalsIgnoreCase(name)) {
			area_nm(value);
			return;
		}
		if ($biz_co_no.equalsIgnoreCase(name)) {
			biz_co_no(value);
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
		if ($tel.equalsIgnoreCase(name)) {
			tel(value);
			return;
		}
		if ($fax.equalsIgnoreCase(name)) {
			fax(value);
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
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			prnt_lcl_cd(value);
			return;
		}
		if ($prnt_lcl_nm.equalsIgnoreCase(name)) {
			prnt_lcl_nm(value);
			return;
		}
		if ($bp_alc_grp.equalsIgnoreCase(name)) {
			bp_alc_grp(value);
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
		if ($bp_grp_cd1.equalsIgnoreCase(name)) {
			bp_grp_cd1(value);
			return;
		}
		if ($bp_grp_nm1.equalsIgnoreCase(name)) {
			bp_grp_nm1(value);
			return;
		}
		if ($bp_grp_cd2.equalsIgnoreCase(name)) {
			bp_grp_cd2(value);
			return;
		}
		if ($bp_grp_nm2.equalsIgnoreCase(name)) {
			bp_grp_nm2(value);
			return;
		}
		if ($bp_grp_cd3.equalsIgnoreCase(name)) {
			bp_grp_cd3(value);
			return;
		}
		if ($bp_grp_nm3.equalsIgnoreCase(name)) {
			bp_grp_nm3(value);
			return;
		}
		if ($bp_grp_cd4.equalsIgnoreCase(name)) {
			bp_grp_cd4(value);
			return;
		}
		if ($bp_grp_nm4.equalsIgnoreCase(name)) {
			bp_grp_nm4(value);
			return;
		}
		if ($bp_grp_cd5.equalsIgnoreCase(name)) {
			bp_grp_cd5(value);
			return;
		}
		if ($bp_grp_nm5.equalsIgnoreCase(name)) {
			bp_grp_nm5(value);
			return;
		}
		if ($bp_grp_cd6.equalsIgnoreCase(name)) {
			bp_grp_cd6(value);
			return;
		}
		if ($bp_grp_nm6.equalsIgnoreCase(name)) {
			bp_grp_nm6(value);
			return;
		}
		if ($bp_grp_cd7.equalsIgnoreCase(name)) {
			bp_grp_cd7(value);
			return;
		}
		if ($bp_grp_nm7.equalsIgnoreCase(name)) {
			bp_grp_nm7(value);
			return;
		}
		if ($bp_grp_cd8.equalsIgnoreCase(name)) {
			bp_grp_cd8(value);
			return;
		}
		if ($bp_grp_nm8.equalsIgnoreCase(name)) {
			bp_grp_nm8(value);
			return;
		}
		if ($bp_grp_cd9.equalsIgnoreCase(name)) {
			bp_grp_cd9(value);
			return;
		}
		if ($bp_grp_nm9.equalsIgnoreCase(name)) {
			bp_grp_nm9(value);
			return;
		}
		if ($bp_grp_cd10.equalsIgnoreCase(name)) {
			bp_grp_cd10(value);
			return;
		}
		if ($bp_grp_nm10.equalsIgnoreCase(name)) {
			bp_grp_nm10(value);
			return;
		}
		if ($ins_usr_id_c.equalsIgnoreCase(name)) {
			ins_usr_id_c(value);
			return;
		}
		if ($ins_usr_nm_c.equalsIgnoreCase(name)) {
			ins_usr_nm_c(value);
			return;
		}
		if ($ins_func_id_c.equalsIgnoreCase(name)) {
			ins_func_id_c(value);
			return;
		}
		if ($ins_func_nm_c.equalsIgnoreCase(name)) {
			ins_func_nm_c(value);
			return;
		}
		if ($upd_usr_id_c.equalsIgnoreCase(name)) {
			upd_usr_id_c(value);
			return;
		}
		if ($upd_usr_nm_c.equalsIgnoreCase(name)) {
			upd_usr_nm_c(value);
			return;
		}
		if ($upd_func_id_c.equalsIgnoreCase(name)) {
			upd_func_id_c(value);
			return;
		}
		if ($upd_func_nm_c.equalsIgnoreCase(name)) {
			upd_func_nm_c(value);
			return;
		}
		if ($upd_srv_req_no_c.equalsIgnoreCase(name)) {
			upd_srv_req_no_c(value);
			return;
		}
		if ($del_usr_id_c.equalsIgnoreCase(name)) {
			del_usr_id_c(value);
			return;
		}
		if ($del_usr_nm_c.equalsIgnoreCase(name)) {
			del_usr_nm_c(value);
			return;
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			ins_usr_id(value);
			return;
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			ins_usr_nm(value);
			return;
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			ins_func_id(value);
			return;
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			ins_func_nm(value);
			return;
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			upd_usr_id(value);
			return;
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			upd_usr_nm(value);
			return;
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			upd_func_id(value);
			return;
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			upd_func_nm(value);
			return;
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			upd_srv_req_no(value);
			return;
		}
		if ($del_usr_id.equalsIgnoreCase(name)) {
			del_usr_id(value);
			return;
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			del_usr_nm(value);
			return;
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($acst_nm.equalsIgnoreCase(name)) {
			acst_nm(value);
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
		if ($ar_dpt_typ.equalsIgnoreCase(name)) {
			ar_dpt_typ(value);
			return;
		}
		if ($ar_dpt_typ_nm.equalsIgnoreCase(name)) {
			ar_dpt_typ_nm(value);
			return;
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			ar_dpt_cd(value);
			return;
		}
		if ($ar_dpt_nm.equalsIgnoreCase(name)) {
			ar_dpt_nm(value);
			return;
		}
		if ($check_ar_dpt_cd.equalsIgnoreCase(name)) {
			check_ar_dpt_cd(value);
			return;
		}
		if ($sls_upri_rnd_typ.equalsIgnoreCase(name)) {
			sls_upri_rnd_typ(value);
			return;
		}
		if ($sls_upri_rnd_typ_nm.equalsIgnoreCase(name)) {
			sls_upri_rnd_typ_nm(value);
			return;
		}
		if ($sls_upri_req_typ.equalsIgnoreCase(name)) {
			sls_upri_req_typ(value);
			return;
		}
		if ($sls_upri_req_typ_nm.equalsIgnoreCase(name)) {
			sls_upri_req_typ_nm(value);
			return;
		}
		if ($sls_amt_rnd_typ.equalsIgnoreCase(name)) {
			sls_amt_rnd_typ(value);
			return;
		}
		if ($sls_amt_rnd_typ_nm.equalsIgnoreCase(name)) {
			sls_amt_rnd_typ_nm(value);
			return;
		}
		if ($sls_tax_calc_typ.equalsIgnoreCase(name)) {
			sls_tax_calc_typ(value);
			return;
		}
		if ($sls_tax_calc_typ_nm.equalsIgnoreCase(name)) {
			sls_tax_calc_typ_nm(value);
			return;
		}
		if ($sls_tax_rnd_typ.equalsIgnoreCase(name)) {
			sls_tax_rnd_typ(value);
			return;
		}
		if ($sls_tax_rnd_typ_nm.equalsIgnoreCase(name)) {
			sls_tax_rnd_typ_nm(value);
			return;
		}
		if ($sls_tax_cd.equalsIgnoreCase(name)) {
			sls_tax_cd(value);
			return;
		}
		if ($sls_tax_nm.equalsIgnoreCase(name)) {
			sls_tax_nm(value);
			return;
		}
		if ($lot_back_stop_typ.equalsIgnoreCase(name)) {
			lot_back_stop_typ(value);
			return;
		}
		if ($lot_back_stop_typ_nm.equalsIgnoreCase(name)) {
			lot_back_stop_typ_nm(value);
			return;
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			sls_basis_typ(value);
			return;
		}
		if ($sls_basis_typ_nm.equalsIgnoreCase(name)) {
			sls_basis_typ_nm(value);
			return;
		}
		if ($bill_basis_typ.equalsIgnoreCase(name)) {
			bill_basis_typ(value);
			return;
		}
		if ($bill_basis_typ_nm.equalsIgnoreCase(name)) {
			bill_basis_typ_nm(value);
			return;
		}
		if ($slip_each_lot_typ.equalsIgnoreCase(name)) {
			slip_each_lot_typ(value);
			return;
		}
		if ($slip_each_lot_typ_nm.equalsIgnoreCase(name)) {
			slip_each_lot_typ_nm(value);
			return;
		}
		if ($ship_schd_split_typ.equalsIgnoreCase(name)) {
			ship_schd_split_typ(value);
			return;
		}
		if ($ship_schd_split_typ_nm.equalsIgnoreCase(name)) {
			ship_schd_split_typ_nm(value);
			return;
		}
		if ($stk_lst_form_cd.equalsIgnoreCase(name)) {
			stk_lst_form_cd(value);
			return;
		}
		if ($stk_lst_form_nm.equalsIgnoreCase(name)) {
			stk_lst_form_nm(value);
			return;
		}
		if ($cst_ship_form_cd.equalsIgnoreCase(name)) {
			cst_ship_form_cd(value);
			return;
		}
		if ($cst_ship_form_nm.equalsIgnoreCase(name)) {
			cst_ship_form_nm(value);
			return;
		}
		if ($cst_tterm_cd1.equalsIgnoreCase(name)) {
			cst_tterm_cd1(value);
			return;
		}
		if ($cst_tterm_nm1.equalsIgnoreCase(name)) {
			cst_tterm_nm1(value);
			return;
		}
		if ($cst_tterm_cd2.equalsIgnoreCase(name)) {
			cst_tterm_cd2(value);
			return;
		}
		if ($cst_tterm_nm2.equalsIgnoreCase(name)) {
			cst_tterm_nm2(value);
			return;
		}
		if ($cst_tterm_cd3.equalsIgnoreCase(name)) {
			cst_tterm_cd3(value);
			return;
		}
		if ($cst_tterm_nm3.equalsIgnoreCase(name)) {
			cst_tterm_nm3(value);
			return;
		}
		if ($sls_anly_cd1.equalsIgnoreCase(name)) {
			sls_anly_cd1(value);
			return;
		}
		if ($sls_anly_nm1.equalsIgnoreCase(name)) {
			sls_anly_nm1(value);
			return;
		}
		if ($sls_anly_cd2.equalsIgnoreCase(name)) {
			sls_anly_cd2(value);
			return;
		}
		if ($sls_anly_nm2.equalsIgnoreCase(name)) {
			sls_anly_nm2(value);
			return;
		}
		if ($sls_anly_cd3.equalsIgnoreCase(name)) {
			sls_anly_cd3(value);
			return;
		}
		if ($sls_anly_nm3.equalsIgnoreCase(name)) {
			sls_anly_nm3(value);
			return;
		}
		if ($cst_prnt_typ.equalsIgnoreCase(name)) {
			cst_prnt_typ(value);
			return;
		}
		if ($cst_prnt_typ_nm.equalsIgnoreCase(name)) {
			cst_prnt_typ_nm(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			bcst_nm(value);
			return;
		}
		if ($acst_prnt_typ.equalsIgnoreCase(name)) {
			acst_prnt_typ(value);
			return;
		}
		if ($acst_prnt_typ_nm.equalsIgnoreCase(name)) {
			acst_prnt_typ_nm(value);
			return;
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			rcst_cd(value);
			return;
		}
		if ($rcst_nm.equalsIgnoreCase(name)) {
			rcst_nm(value);
			return;
		}
		if ($ar_cred_cd.equalsIgnoreCase(name)) {
			ar_cred_cd(value);
			return;
		}
		if ($ar_cred_nm.equalsIgnoreCase(name)) {
			ar_cred_nm(value);
			return;
		}
		if ($bill_dpt_typ.equalsIgnoreCase(name)) {
			bill_dpt_typ(value);
			return;
		}
		if ($bill_dpt_typ_nm.equalsIgnoreCase(name)) {
			bill_dpt_typ_nm(value);
			return;
		}
		if ($bcst_dpt_cd.equalsIgnoreCase(name)) {
			bcst_dpt_cd(value);
			return;
		}
		if ($bcst_dpt_nm.equalsIgnoreCase(name)) {
			bcst_dpt_nm(value);
			return;
		}
		if ($check_bcst_dpt_cd.equalsIgnoreCase(name)) {
			check_bcst_dpt_cd(value);
			return;
		}
		if ($bill_cl_typ.equalsIgnoreCase(name)) {
			bill_cl_typ(value);
			return;
		}
		if ($bill_cl_typ_nm.equalsIgnoreCase(name)) {
			bill_cl_typ_nm(value);
			return;
		}
		if ($bill_tax_rnd_typ.equalsIgnoreCase(name)) {
			bill_tax_rnd_typ(value);
			return;
		}
		if ($bill_tax_rnd_typ_nm.equalsIgnoreCase(name)) {
			bill_tax_rnd_typ_nm(value);
			return;
		}
		if ($bill_cl_ba_typ.equalsIgnoreCase(name)) {
			bill_cl_ba_typ(value);
			return;
		}
		if ($bill_cl_ba_typ_nm.equalsIgnoreCase(name)) {
			bill_cl_ba_typ_nm(value);
			return;
		}
		if ($bill_cal_cd.equalsIgnoreCase(name)) {
			bill_cal_cd(value);
			return;
		}
		if ($bill_cal_nm.equalsIgnoreCase(name)) {
			bill_cal_nm(value);
			return;
		}
		if ($rcv_ba_typ.equalsIgnoreCase(name)) {
			rcv_ba_typ(value);
			return;
		}
		if ($rcv_ba_typ_nm.equalsIgnoreCase(name)) {
			rcv_ba_typ_nm(value);
			return;
		}
		if ($ar_setoff_grp_cd.equalsIgnoreCase(name)) {
			ar_setoff_grp_cd(value);
			return;
		}
		if ($ar_setoff_grp_nm.equalsIgnoreCase(name)) {
			ar_setoff_grp_nm(value);
			return;
		}
		if ($bcst_prnt_typ.equalsIgnoreCase(name)) {
			bcst_prnt_typ(value);
			return;
		}
		if ($bcst_prnt_typ_nm.equalsIgnoreCase(name)) {
			bcst_prnt_typ_nm(value);
			return;
		}
		if ($bill_zip_cd.equalsIgnoreCase(name)) {
			bill_zip_cd(value);
			return;
		}
		if ($bill_addr1.equalsIgnoreCase(name)) {
			bill_addr1(value);
			return;
		}
		if ($bill_addr2.equalsIgnoreCase(name)) {
			bill_addr2(value);
			return;
		}
		if ($bill_addr3.equalsIgnoreCase(name)) {
			bill_addr3(value);
			return;
		}
		if ($bill_addr4.equalsIgnoreCase(name)) {
			bill_addr4(value);
			return;
		}
		if ($bill_tel.equalsIgnoreCase(name)) {
			bill_tel(value);
			return;
		}
		if ($bill_bcst_nm.equalsIgnoreCase(name)) {
			bill_bcst_nm(value);
			return;
		}
		if ($bill_bcst_dpt.equalsIgnoreCase(name)) {
			bill_bcst_dpt(value);
			return;
		}
		if ($bill_bcst_psn.equalsIgnoreCase(name)) {
			bill_bcst_psn(value);
			return;
		}
		if ($bill_bcst_psn_title.equalsIgnoreCase(name)) {
			bill_bcst_psn_title(value);
			return;
		}
		if ($bill_prnt_typ.equalsIgnoreCase(name)) {
			bill_prnt_typ(value);
			return;
		}
		if ($bill_prnt_typ_nm.equalsIgnoreCase(name)) {
			bill_prnt_typ_nm(value);
			return;
		}
		if ($sls_dtl_outp_typ.equalsIgnoreCase(name)) {
			sls_dtl_outp_typ(value);
			return;
		}
		if ($sls_dtl_outp_typ_nm.equalsIgnoreCase(name)) {
			sls_dtl_outp_typ_nm(value);
			return;
		}
		if ($bill_dtl_subttl_typ.equalsIgnoreCase(name)) {
			bill_dtl_subttl_typ(value);
			return;
		}
		if ($bill_dtl_subttl_typ_nm.equalsIgnoreCase(name)) {
			bill_dtl_subttl_typ_nm(value);
			return;
		}
		if ($bill_dtl_brk_typ.equalsIgnoreCase(name)) {
			bill_dtl_brk_typ(value);
			return;
		}
		if ($bill_dtl_brk_typ_nm.equalsIgnoreCase(name)) {
			bill_dtl_brk_typ_nm(value);
			return;
		}
		if ($bill_dtl_sort_typ.equalsIgnoreCase(name)) {
			bill_dtl_sort_typ(value);
			return;
		}
		if ($bill_dtl_sort_typ_nm.equalsIgnoreCase(name)) {
			bill_dtl_sort_typ_nm(value);
			return;
		}
		if ($bill_can_slip_typ.equalsIgnoreCase(name)) {
			bill_can_slip_typ(value);
			return;
		}
		if ($bill_can_slip_typ_nm.equalsIgnoreCase(name)) {
			bill_can_slip_typ_nm(value);
			return;
		}
		if ($xfr_psn.equalsIgnoreCase(name)) {
			xfr_psn(value);
			return;
		}
		if ($rcst_prnt_typ.equalsIgnoreCase(name)) {
			rcst_prnt_typ(value);
			return;
		}
		if ($rcst_prnt_typ_nm.equalsIgnoreCase(name)) {
			rcst_prnt_typ_nm(value);
			return;
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
			return;
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			lg_grp_nm(value);
			return;
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			via_dlv_typ(value);
			return;
		}
		if ($via_dlv_typ_nm.equalsIgnoreCase(name)) {
			via_dlv_typ_nm(value);
			return;
		}
		if ($dlv_cal_cd.equalsIgnoreCase(name)) {
			dlv_cal_cd(value);
			return;
		}
		if ($dlv_cal_nm.equalsIgnoreCase(name)) {
			dlv_cal_nm(value);
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
		if ($dlv_chnnl1.equalsIgnoreCase(name)) {
			dlv_chnnl1(value);
			return;
		}
		if ($dlv_chnnl2.equalsIgnoreCase(name)) {
			dlv_chnnl2(value);
			return;
		}
		if ($dlv_chnnl3.equalsIgnoreCase(name)) {
			dlv_chnnl3(value);
			return;
		}
		if ($dlv_prnt_typ.equalsIgnoreCase(name)) {
			dlv_prnt_typ(value);
			return;
		}
		if ($dlv_prnt_typ_nm.equalsIgnoreCase(name)) {
			dlv_prnt_typ_nm(value);
			return;
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			asppl_cd(value);
			return;
		}
		if ($asppl_nm.equalsIgnoreCase(name)) {
			asppl_nm(value);
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
		if ($vmi_purc_dpt_cd.equalsIgnoreCase(name)) {
			vmi_purc_dpt_cd(value);
			return;
		}
		if ($vmi_purc_dpt_nm.equalsIgnoreCase(name)) {
			vmi_purc_dpt_nm(value);
			return;
		}
		if ($check_vmi_purc_dpt_cd.equalsIgnoreCase(name)) {
			check_vmi_purc_dpt_cd(value);
			return;
		}
		if ($purc_upri_req_typ.equalsIgnoreCase(name)) {
			purc_upri_req_typ(value);
			return;
		}
		if ($purc_upri_req_typ_nm.equalsIgnoreCase(name)) {
			purc_upri_req_typ_nm(value);
			return;
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			purc_amt_rnd_typ(value);
			return;
		}
		if ($purc_amt_rnd_typ_nm.equalsIgnoreCase(name)) {
			purc_amt_rnd_typ_nm(value);
			return;
		}
		if ($purc_tax_calc_typ.equalsIgnoreCase(name)) {
			purc_tax_calc_typ(value);
			return;
		}
		if ($purc_tax_calc_typ_nm.equalsIgnoreCase(name)) {
			purc_tax_calc_typ_nm(value);
			return;
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			purc_tax_rnd_typ(value);
			return;
		}
		if ($purc_tax_rnd_typ_nm.equalsIgnoreCase(name)) {
			purc_tax_rnd_typ_nm(value);
			return;
		}
		if ($purc_tax_cd.equalsIgnoreCase(name)) {
			purc_tax_cd(value);
			return;
		}
		if ($purc_tax_nm.equalsIgnoreCase(name)) {
			purc_tax_nm(value);
			return;
		}
		if ($sppl_cal_cd.equalsIgnoreCase(name)) {
			sppl_cal_cd(value);
			return;
		}
		if ($sppl_cal_nm.equalsIgnoreCase(name)) {
			sppl_cal_nm(value);
			return;
		}
		if ($po_print_cd.equalsIgnoreCase(name)) {
			po_print_cd(value);
			return;
		}
		if ($po_print_nm.equalsIgnoreCase(name)) {
			po_print_nm(value);
			return;
		}
		if ($sppl_ship_form_cd.equalsIgnoreCase(name)) {
			sppl_ship_form_cd(value);
			return;
		}
		if ($sppl_ship_form_nm.equalsIgnoreCase(name)) {
			sppl_ship_form_nm(value);
			return;
		}
		if ($prov_rcv_typ.equalsIgnoreCase(name)) {
			prov_rcv_typ(value);
			return;
		}
		if ($prov_rcv_typ_nm.equalsIgnoreCase(name)) {
			prov_rcv_typ_nm(value);
			return;
		}
		if ($purc_slip_each_lot_typ.equalsIgnoreCase(name)) {
			purc_slip_each_lot_typ(value);
			return;
		}
		if ($purc_slip_each_lot_typ_nm.equalsIgnoreCase(name)) {
			purc_slip_each_lot_typ_nm(value);
			return;
		}
		if ($sppl_tterm_cd1.equalsIgnoreCase(name)) {
			sppl_tterm_cd1(value);
			return;
		}
		if ($sppl_tterm_nm1.equalsIgnoreCase(name)) {
			sppl_tterm_nm1(value);
			return;
		}
		if ($sppl_tterm_cd2.equalsIgnoreCase(name)) {
			sppl_tterm_cd2(value);
			return;
		}
		if ($sppl_tterm_nm2.equalsIgnoreCase(name)) {
			sppl_tterm_nm2(value);
			return;
		}
		if ($sppl_tterm_cd3.equalsIgnoreCase(name)) {
			sppl_tterm_cd3(value);
			return;
		}
		if ($sppl_tterm_nm3.equalsIgnoreCase(name)) {
			sppl_tterm_nm3(value);
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
		if ($outsrc_upri_typ.equalsIgnoreCase(name)) {
			outsrc_upri_typ(value);
			return;
		}
		if ($outsrc_upri_typ_nm.equalsIgnoreCase(name)) {
			outsrc_upri_typ_nm(value);
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
		if ($prov_tax_cd.equalsIgnoreCase(name)) {
			prov_tax_cd(value);
			return;
		}
		if ($prov_tax_nm.equalsIgnoreCase(name)) {
			prov_tax_nm(value);
			return;
		}
		if ($prov_amt_rnd_typ.equalsIgnoreCase(name)) {
			prov_amt_rnd_typ(value);
			return;
		}
		if ($prov_amt_rnd_typ_nm.equalsIgnoreCase(name)) {
			prov_amt_rnd_typ_nm(value);
			return;
		}
		if ($prov_tax_calc_typ.equalsIgnoreCase(name)) {
			prov_tax_calc_typ(value);
			return;
		}
		if ($prov_tax_calc_typ_nm.equalsIgnoreCase(name)) {
			prov_tax_calc_typ_nm(value);
			return;
		}
		if ($prov_tax_rnd_typ.equalsIgnoreCase(name)) {
			prov_tax_rnd_typ(value);
			return;
		}
		if ($prov_tax_rnd_typ_nm.equalsIgnoreCase(name)) {
			prov_tax_rnd_typ_nm(value);
			return;
		}
		if ($sppl_prnt_typ.equalsIgnoreCase(name)) {
			sppl_prnt_typ(value);
			return;
		}
		if ($sppl_prnt_typ_nm.equalsIgnoreCase(name)) {
			sppl_prnt_typ_nm(value);
			return;
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			bsppl_cd(value);
			return;
		}
		if ($bsppl_nm.equalsIgnoreCase(name)) {
			bsppl_nm(value);
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
		if ($check_ap_dpt_cd.equalsIgnoreCase(name)) {
			check_ap_dpt_cd(value);
			return;
		}
		if ($asppl_prnt_typ.equalsIgnoreCase(name)) {
			asppl_prnt_typ(value);
			return;
		}
		if ($asppl_prnt_typ_nm.equalsIgnoreCase(name)) {
			asppl_prnt_typ_nm(value);
			return;
		}
		if ($psppl_cd.equalsIgnoreCase(name)) {
			psppl_cd(value);
			return;
		}
		if ($psppl_nm.equalsIgnoreCase(name)) {
			psppl_nm(value);
			return;
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			bsppl_dpt_cd(value);
			return;
		}
		if ($bsppl_dpt_nm.equalsIgnoreCase(name)) {
			bsppl_dpt_nm(value);
			return;
		}
		if ($check_bsppl_dpt_cd.equalsIgnoreCase(name)) {
			check_bsppl_dpt_cd(value);
			return;
		}
		if ($ap_cred_cd.equalsIgnoreCase(name)) {
			ap_cred_cd(value);
			return;
		}
		if ($ap_cred_nm.equalsIgnoreCase(name)) {
			ap_cred_nm(value);
			return;
		}
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			pay_bank_ac_cd(value);
			return;
		}
		if ($pay_bank_ac_nm.equalsIgnoreCase(name)) {
			pay_bank_ac_nm(value);
			return;
		}
		if ($ap_setoff_grp_cd.equalsIgnoreCase(name)) {
			ap_setoff_grp_cd(value);
			return;
		}
		if ($ap_setoff_grp_nm.equalsIgnoreCase(name)) {
			ap_setoff_grp_nm(value);
			return;
		}
		if ($pay_tax_rnd_typ.equalsIgnoreCase(name)) {
			pay_tax_rnd_typ(value);
			return;
		}
		if ($pay_tax_rnd_typ_nm.equalsIgnoreCase(name)) {
			pay_tax_rnd_typ_nm(value);
			return;
		}
		if ($pay_schd_ba_typ.equalsIgnoreCase(name)) {
			pay_schd_ba_typ(value);
			return;
		}
		if ($pay_schd_ba_typ_nm.equalsIgnoreCase(name)) {
			pay_schd_ba_typ_nm(value);
			return;
		}
		if ($pay_schd_cl_ba_typ.equalsIgnoreCase(name)) {
			pay_schd_cl_ba_typ(value);
			return;
		}
		if ($pay_schd_cl_ba_typ_nm.equalsIgnoreCase(name)) {
			pay_schd_cl_ba_typ_nm(value);
			return;
		}
		if ($bsppl_prnt_typ.equalsIgnoreCase(name)) {
			bsppl_prnt_typ(value);
			return;
		}
		if ($bsppl_prnt_typ_nm.equalsIgnoreCase(name)) {
			bsppl_prnt_typ_nm(value);
			return;
		}
		if ($pay_ntc_zip_cd.equalsIgnoreCase(name)) {
			pay_ntc_zip_cd(value);
			return;
		}
		if ($pay_ntc_addr1.equalsIgnoreCase(name)) {
			pay_ntc_addr1(value);
			return;
		}
		if ($pay_ntc_addr2.equalsIgnoreCase(name)) {
			pay_ntc_addr2(value);
			return;
		}
		if ($pay_ntc_addr3.equalsIgnoreCase(name)) {
			pay_ntc_addr3(value);
			return;
		}
		if ($pay_ntc_addr4.equalsIgnoreCase(name)) {
			pay_ntc_addr4(value);
			return;
		}
		if ($pay_ntc_tel.equalsIgnoreCase(name)) {
			pay_ntc_tel(value);
			return;
		}
		if ($pay_ntc_bsppl_nm.equalsIgnoreCase(name)) {
			pay_ntc_bsppl_nm(value);
			return;
		}
		if ($pay_ntc_bsppl_dpt.equalsIgnoreCase(name)) {
			pay_ntc_bsppl_dpt(value);
			return;
		}
		if ($pay_ntc_bsppl_psn.equalsIgnoreCase(name)) {
			pay_ntc_bsppl_psn(value);
			return;
		}
		if ($pay_ntc_bsppl_psn_title.equalsIgnoreCase(name)) {
			pay_ntc_bsppl_psn_title(value);
			return;
		}
		if ($pay_ntc_dtl_subttl_typ.equalsIgnoreCase(name)) {
			pay_ntc_dtl_subttl_typ(value);
			return;
		}
		if ($pay_ntc_dtl_subttl_typ_nm.equalsIgnoreCase(name)) {
			pay_ntc_dtl_subttl_typ_nm(value);
			return;
		}
		if ($pay_ntc_dtl_brk_typ.equalsIgnoreCase(name)) {
			pay_ntc_dtl_brk_typ(value);
			return;
		}
		if ($pay_ntc_dtl_brk_typ_nm.equalsIgnoreCase(name)) {
			pay_ntc_dtl_brk_typ_nm(value);
			return;
		}
		if ($pay_ntc_dtl_sort_typ.equalsIgnoreCase(name)) {
			pay_ntc_dtl_sort_typ(value);
			return;
		}
		if ($pay_ntc_dtl_sort_typ_nm.equalsIgnoreCase(name)) {
			pay_ntc_dtl_sort_typ_nm(value);
			return;
		}
		if ($pay_ntc_can_slip_typ.equalsIgnoreCase(name)) {
			pay_ntc_can_slip_typ(value);
			return;
		}
		if ($pay_ntc_can_slip_typ_nm.equalsIgnoreCase(name)) {
			pay_ntc_can_slip_typ_nm(value);
			return;
		}
		if ($psppl_rmrks.equalsIgnoreCase(name)) {
			psppl_rmrks(value);
			return;
		}
		if ($pay_dpt_cd.equalsIgnoreCase(name)) {
			pay_dpt_cd(value);
			return;
		}
		if ($pay_dpt_nm.equalsIgnoreCase(name)) {
			pay_dpt_nm(value);
			return;
		}
		if ($check_pay_dpt_cd.equalsIgnoreCase(name)) {
			check_pay_dpt_cd(value);
			return;
		}
		if ($psppl_prnt_typ.equalsIgnoreCase(name)) {
			psppl_prnt_typ(value);
			return;
		}
		if ($psppl_prnt_typ_nm.equalsIgnoreCase(name)) {
			psppl_prnt_typ_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($upd_cntr_c.equalsIgnoreCase(name)) {
			upd_cntr_c(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($ship_lt.equalsIgnoreCase(name)) {
			ship_lt(value);
			return;
		}
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		if ($bill_cl_delay_days.equalsIgnoreCase(name)) {
			bill_cl_delay_days(value);
			return;
		}
		if ($auto_appl_delay_days.equalsIgnoreCase(name)) {
			auto_appl_delay_days(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($psppl_cl_day1.equalsIgnoreCase(name)) {
			psppl_cl_day1(value);
			return;
		}
		if ($psppl_cl_day2.equalsIgnoreCase(name)) {
			psppl_cl_day2(value);
			return;
		}
		if ($psppl_cl_day3.equalsIgnoreCase(name)) {
			psppl_cl_day3(value);
			return;
		}
		if ($psppl_cl_day4.equalsIgnoreCase(name)) {
			psppl_cl_day4(value);
			return;
		}
		if ($psppl_cl_day5.equalsIgnoreCase(name)) {
			psppl_cl_day5(value);
			return;
		}
		if ($pay_schd_cl_delay_days.equalsIgnoreCase(name)) {
			pay_schd_cl_delay_days(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($bp_com_upd_cntr.equalsIgnoreCase(name)) {
			bp_com_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($upd_cntr_c.equalsIgnoreCase(name)) {
			upd_cntr_c(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($ship_lt.equalsIgnoreCase(name)) {
			ship_lt(value);
			return;
		}
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		if ($bill_cl_delay_days.equalsIgnoreCase(name)) {
			bill_cl_delay_days(value);
			return;
		}
		if ($auto_appl_delay_days.equalsIgnoreCase(name)) {
			auto_appl_delay_days(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($psppl_cl_day1.equalsIgnoreCase(name)) {
			psppl_cl_day1(value);
			return;
		}
		if ($psppl_cl_day2.equalsIgnoreCase(name)) {
			psppl_cl_day2(value);
			return;
		}
		if ($psppl_cl_day3.equalsIgnoreCase(name)) {
			psppl_cl_day3(value);
			return;
		}
		if ($psppl_cl_day4.equalsIgnoreCase(name)) {
			psppl_cl_day4(value);
			return;
		}
		if ($psppl_cl_day5.equalsIgnoreCase(name)) {
			psppl_cl_day5(value);
			return;
		}
		if ($pay_schd_cl_delay_days.equalsIgnoreCase(name)) {
			pay_schd_cl_delay_days(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($bp_com_upd_cntr.equalsIgnoreCase(name)) {
			bp_com_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($upd_cntr_c.equalsIgnoreCase(name)) {
			upd_cntr_c(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($ship_lt.equalsIgnoreCase(name)) {
			ship_lt(value);
			return;
		}
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		if ($bill_cl_delay_days.equalsIgnoreCase(name)) {
			bill_cl_delay_days(value);
			return;
		}
		if ($auto_appl_delay_days.equalsIgnoreCase(name)) {
			auto_appl_delay_days(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($psppl_cl_day1.equalsIgnoreCase(name)) {
			psppl_cl_day1(value);
			return;
		}
		if ($psppl_cl_day2.equalsIgnoreCase(name)) {
			psppl_cl_day2(value);
			return;
		}
		if ($psppl_cl_day3.equalsIgnoreCase(name)) {
			psppl_cl_day3(value);
			return;
		}
		if ($psppl_cl_day4.equalsIgnoreCase(name)) {
			psppl_cl_day4(value);
			return;
		}
		if ($psppl_cl_day5.equalsIgnoreCase(name)) {
			psppl_cl_day5(value);
			return;
		}
		if ($pay_schd_cl_delay_days.equalsIgnoreCase(name)) {
			pay_schd_cl_delay_days(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($bp_com_upd_cntr.equalsIgnoreCase(name)) {
			bp_com_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($upd_cntr_c.equalsIgnoreCase(name)) {
			upd_cntr_c(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($ship_lt.equalsIgnoreCase(name)) {
			ship_lt(value);
			return;
		}
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		if ($bill_cl_delay_days.equalsIgnoreCase(name)) {
			bill_cl_delay_days(value);
			return;
		}
		if ($auto_appl_delay_days.equalsIgnoreCase(name)) {
			auto_appl_delay_days(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($psppl_cl_day1.equalsIgnoreCase(name)) {
			psppl_cl_day1(value);
			return;
		}
		if ($psppl_cl_day2.equalsIgnoreCase(name)) {
			psppl_cl_day2(value);
			return;
		}
		if ($psppl_cl_day3.equalsIgnoreCase(name)) {
			psppl_cl_day3(value);
			return;
		}
		if ($psppl_cl_day4.equalsIgnoreCase(name)) {
			psppl_cl_day4(value);
			return;
		}
		if ($psppl_cl_day5.equalsIgnoreCase(name)) {
			psppl_cl_day5(value);
			return;
		}
		if ($pay_schd_cl_delay_days.equalsIgnoreCase(name)) {
			pay_schd_cl_delay_days(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($bp_com_upd_cntr.equalsIgnoreCase(name)) {
			bp_com_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($upd_cntr_c.equalsIgnoreCase(name)) {
			upd_cntr_c(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($ship_lt.equalsIgnoreCase(name)) {
			ship_lt(value);
			return;
		}
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		if ($bill_cl_delay_days.equalsIgnoreCase(name)) {
			bill_cl_delay_days(value);
			return;
		}
		if ($auto_appl_delay_days.equalsIgnoreCase(name)) {
			auto_appl_delay_days(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($psppl_cl_day1.equalsIgnoreCase(name)) {
			psppl_cl_day1(value);
			return;
		}
		if ($psppl_cl_day2.equalsIgnoreCase(name)) {
			psppl_cl_day2(value);
			return;
		}
		if ($psppl_cl_day3.equalsIgnoreCase(name)) {
			psppl_cl_day3(value);
			return;
		}
		if ($psppl_cl_day4.equalsIgnoreCase(name)) {
			psppl_cl_day4(value);
			return;
		}
		if ($psppl_cl_day5.equalsIgnoreCase(name)) {
			psppl_cl_day5(value);
			return;
		}
		if ($pay_schd_cl_delay_days.equalsIgnoreCase(name)) {
			pay_schd_cl_delay_days(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($bp_com_upd_cntr.equalsIgnoreCase(name)) {
			bp_com_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setTimestampNE(String name, MCTimestamp value) {
		if ($ins_ts_c.equalsIgnoreCase(name)) {
			ins_ts_c(value);
			return;
		}
		if ($upd_ts_c.equalsIgnoreCase(name)) {
			upd_ts_c(value);
			return;
		}
		if ($del_ts_c.equalsIgnoreCase(name)) {
			del_ts_c(value);
			return;
		}
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		if ($del_ts.equalsIgnoreCase(name)) {
			del_ts(value);
			return;
		}
		super.setTimestampNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		if ($all_com_flg.equalsIgnoreCase(name)) {
			all_com_flg(value);
			return;
		}
		if ($org_all_com_flg.equalsIgnoreCase(name)) {
			org_all_com_flg(value);
			return;
		}
		if ($com_use_flg.equalsIgnoreCase(name)) {
			com_use_flg(value);
			return;
		}
		if ($com_ex_flg.equalsIgnoreCase(name)) {
			com_ex_flg(value);
			return;
		}
		if ($cst_flg.equalsIgnoreCase(name)) {
			cst_flg(value);
			return;
		}
		if ($org_cst_flg.equalsIgnoreCase(name)) {
			org_cst_flg(value);
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
		if ($dlv_flg.equalsIgnoreCase(name)) {
			dlv_flg(value);
			return;
		}
		if ($dest_flg.equalsIgnoreCase(name)) {
			dest_flg(value);
			return;
		}
		if ($cred_flg.equalsIgnoreCase(name)) {
			cred_flg(value);
			return;
		}
		if ($sppl_flg.equalsIgnoreCase(name)) {
			sppl_flg(value);
			return;
		}
		if ($org_sppl_flg.equalsIgnoreCase(name)) {
			org_sppl_flg(value);
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
		if ($maker_flg.equalsIgnoreCase(name)) {
			maker_flg(value);
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
		if ($sls_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			sls_tax_cd_prio_flg(value);
			return;
		}
		if ($stk_lst_issue_flg.equalsIgnoreCase(name)) {
			stk_lst_issue_flg(value);
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
		if ($tax_on_bill_flg.equalsIgnoreCase(name)) {
			tax_on_bill_flg(value);
			return;
		}
		if ($auto_line_appl_flg.equalsIgnoreCase(name)) {
			auto_line_appl_flg(value);
			return;
		}
		if ($sls_interim_cl_flg.equalsIgnoreCase(name)) {
			sls_interim_cl_flg(value);
			return;
		}
		if ($bill_dtl_outp_flg.equalsIgnoreCase(name)) {
			bill_dtl_outp_flg(value);
			return;
		}
		if ($bfw_bal_disp_flg.equalsIgnoreCase(name)) {
			bfw_bal_disp_flg(value);
			return;
		}
		if ($bill_dtl_adv_flg.equalsIgnoreCase(name)) {
			bill_dtl_adv_flg(value);
			return;
		}
		if ($bill_dtl_rcv_flg.equalsIgnoreCase(name)) {
			bill_dtl_rcv_flg(value);
			return;
		}
		if ($rcv_auto_appl_tgt_flg.equalsIgnoreCase(name)) {
			rcv_auto_appl_tgt_flg(value);
			return;
		}
		if ($rcv_amt_match_flg.equalsIgnoreCase(name)) {
			rcv_amt_match_flg(value);
			return;
		}
		if ($ar_sttl_typ_match_flg.equalsIgnoreCase(name)) {
			ar_sttl_typ_match_flg(value);
			return;
		}
		if ($calc_com_paid_flg.equalsIgnoreCase(name)) {
			calc_com_paid_flg(value);
			return;
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			dlv_sundry_flg(value);
			return;
		}
		if ($tdlv_flg.equalsIgnoreCase(name)) {
			tdlv_flg(value);
			return;
		}
		if ($org_tdlv_flg.equalsIgnoreCase(name)) {
			org_tdlv_flg(value);
			return;
		}
		if ($tdlv_req_flg.equalsIgnoreCase(name)) {
			tdlv_req_flg(value);
			return;
		}
		if ($pri_prnt_flg.equalsIgnoreCase(name)) {
			pri_prnt_flg(value);
			return;
		}
		if ($cnsgn_stktk_flg.equalsIgnoreCase(name)) {
			cnsgn_stktk_flg(value);
			return;
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			subcon_flg(value);
			return;
		}
		if ($onr_prsppl_flg.equalsIgnoreCase(name)) {
			onr_prsppl_flg(value);
			return;
		}
		if ($org_onr_prsppl_flg.equalsIgnoreCase(name)) {
			org_onr_prsppl_flg(value);
			return;
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			repurc_obli_flg(value);
			return;
		}
		if ($purc_upri_cng_flg.equalsIgnoreCase(name)) {
			purc_upri_cng_flg(value);
			return;
		}
		if ($prms_recv_flg.equalsIgnoreCase(name)) {
			prms_recv_flg(value);
			return;
		}
		if ($purc_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			purc_tax_cd_prio_flg(value);
			return;
		}
		if ($po_dlv_slip_flg.equalsIgnoreCase(name)) {
			po_dlv_slip_flg(value);
			return;
		}
		if ($dlv_inst_dlv_slip_flg.equalsIgnoreCase(name)) {
			dlv_inst_dlv_slip_flg(value);
			return;
		}
		if ($prms_rcpt_dlv_slip_flg.equalsIgnoreCase(name)) {
			prms_rcpt_dlv_slip_flg(value);
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
		if ($sppl_iv_flg.equalsIgnoreCase(name)) {
			sppl_iv_flg(value);
			return;
		}
		if ($rcpt_iv_dup_flg.equalsIgnoreCase(name)) {
			rcpt_iv_dup_flg(value);
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
		if ($purc_interim_cl_flg.equalsIgnoreCase(name)) {
			purc_interim_cl_flg(value);
			return;
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			pay_spot_flg(value);
			return;
		}
		if ($tax_on_pay_flg.equalsIgnoreCase(name)) {
			tax_on_pay_flg(value);
			return;
		}
		if ($batch_pay_schd_cl_flg.equalsIgnoreCase(name)) {
			batch_pay_schd_cl_flg(value);
			return;
		}
		if ($pay_ntc_prnt_flg.equalsIgnoreCase(name)) {
			pay_ntc_prnt_flg(value);
			return;
		}
		if ($pay_ntc_dtl_outp_flg.equalsIgnoreCase(name)) {
			pay_ntc_dtl_outp_flg(value);
			return;
		}
		if ($pay_ntc_bfw_bal_disp_flg.equalsIgnoreCase(name)) {
			pay_ntc_bfw_bal_disp_flg(value);
			return;
		}
		if ($pay_ntc_adv_pay_flg.equalsIgnoreCase(name)) {
			pay_ntc_adv_pay_flg(value);
			return;
		}
		if ($pay_ntc_dtl_pay_flg.equalsIgnoreCase(name)) {
			pay_ntc_dtl_pay_flg(value);
			return;
		}
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

