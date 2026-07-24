package mcframe.commonMSBE.MSBER0200;

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
 * ブロック"IvHdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class IvHdrR_MC_A extends MCConstRow {

	/**
	 *  インボイスＮＯ.<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
	/**
	 *  インボイス改訂番号.<p>
	 *
	 */
	public static final String $iv_rev = "iv_rev";
	/**
	 *  インボイス管理ＮＯ.<p>
	 *
	 */
	public static final String $iv_mng_no = "iv_mng_no";
	/**
	 *  会社名.<p>
	 *
	 */
	public static final String $co_nm = "co_nm";
	/**
	 *  会社名（不使用）.<p>
	 *
	 */
	public static final String $co_str = "co_str";
	/**
	 *  会社ＴＥＬ.<p>
	 *
	 */
	public static final String $co_tel = "co_tel";
	/**
	 *  会社ＦＡＸ.<p>
	 *
	 */
	public static final String $co_fax = "co_fax";
	/**
	 *  発行日.<p>
	 *
	 */
	public static final String $prnt_dt = "prnt_dt";
	/**
	 *  インボイス日付.<p>
	 *
	 */
	public static final String $iv_dt = "iv_dt";
	/**
	 *  得意先ＣＤ.<p>
	 *
	 */
	public static final String $ship_rqst_id_cd = "ship_rqst_id_cd";
	/**
	 *  得意先名.<p>
	 *
	 */
	public static final String $ship_rqst_id_nm = "ship_rqst_id_nm";
	/**
	 *  得意先別名１.<p>
	 *
	 */
	public static final String $ship_rqst_id_alt_nm1 = "ship_rqst_id_alt_nm1";
	/**
	 *  得意先別名２.<p>
	 *
	 */
	public static final String $ship_rqst_id_alt_nm2 = "ship_rqst_id_alt_nm2";
	/**
	 *  得意先別名３.<p>
	 *
	 */
	public static final String $ship_rqst_id_alt_nm3 = "ship_rqst_id_alt_nm3";
	/**
	 *  得意先別名４.<p>
	 *
	 */
	public static final String $ship_rqst_id_alt_nm4 = "ship_rqst_id_alt_nm4";
	/**
	 *  得意先住所１.<p>
	 *
	 */
	public static final String $ship_rqst_addr1 = "ship_rqst_addr1";
	/**
	 *  得意先住所２.<p>
	 *
	 */
	public static final String $ship_rqst_addr2 = "ship_rqst_addr2";
	/**
	 *  得意先住所３.<p>
	 *
	 */
	public static final String $ship_rqst_addr3 = "ship_rqst_addr3";
	/**
	 *  得意先住所４.<p>
	 *
	 */
	public static final String $ship_rqst_addr4 = "ship_rqst_addr4";
	/**
	 *  得意先住所.<p>
	 *
	 */
	public static final String $ship_rqst_addr = "ship_rqst_addr";
	/**
	 *  得意先国名.<p>
	 *
	 */
	public static final String $ship_rqst_cntry_nm = "ship_rqst_cntry_nm";
	/**
	 *  納品先識別区分（不使用）.<p>
	 *
	 */
	public static final String $dlv_id_typ = "dlv_id_typ";
	/**
	 *  納品先ＣＤ.<p>
	 *
	 */
	public static final String $dlv_id_cd = "dlv_id_cd";
	/**
	 *  納品先名.<p>
	 *
	 */
	public static final String $dlv_id_nm = "dlv_id_nm";
	/**
	 *  納品先別名１.<p>
	 *
	 */
	public static final String $dlv_id_alt_nm1 = "dlv_id_alt_nm1";
	/**
	 *  納品先別名２.<p>
	 *
	 */
	public static final String $dlv_id_alt_nm2 = "dlv_id_alt_nm2";
	/**
	 *  納品先別名３.<p>
	 *
	 */
	public static final String $dlv_id_alt_nm3 = "dlv_id_alt_nm3";
	/**
	 *  納品先別名４.<p>
	 *
	 */
	public static final String $dlv_id_alt_nm4 = "dlv_id_alt_nm4";
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
	 *  納品先住所.<p>
	 *
	 */
	public static final String $dlv_addr = "dlv_addr";
	/**
	 *  納品先国ＣＤ.<p>
	 *
	 */
	public static final String $dlv_cntry_cd = "dlv_cntry_cd";
	/**
	 *  納品先国名.<p>
	 *
	 */
	public static final String $dlv_cntry_nm = "dlv_cntry_nm";
	/**
	 *  輸送方法名.<p>
	 *
	 */
	public static final String $trnspt_nm = "trnspt_nm";
	/**
	 *  輸送方法ＣＤ.<p>
	 *
	 */
	public static final String $trnspt_cd = "trnspt_cd";
	/**
	 *  船名／便名.<p>
	 *
	 */
	public static final String $vssl_flght = "vssl_flght";
	/**
	 *  船積予定日.<p>
	 *
	 */
	public static final String $etd_dt = "etd_dt";
	/**
	 *  船積港名.<p>
	 *
	 */
	public static final String $load_port_nm = "load_port_nm";
	/**
	 *  船積港ＣＤ.<p>
	 *
	 */
	public static final String $load_port_cd = "load_port_cd";
	/**
	 *  船卸港名.<p>
	 *
	 */
	public static final String $dschrg_port_nm = "dschrg_port_nm";
	/**
	 *  船卸港ＣＤ.<p>
	 *
	 */
	public static final String $dschrg_port_cd = "dschrg_port_cd";
	/**
	 *  経由地名.<p>
	 *
	 */
	public static final String $via_port_nm = "via_port_nm";
	/**
	 *  経由地ＣＤ.<p>
	 *
	 */
	public static final String $via_port_cd = "via_port_cd";
	/**
	 *  入金条件名.<p>
	 *
	 */
	public static final String $tterm_nm3 = "tterm_nm3";
	/**
	 *  入金条件ＣＤ.<p>
	 *
	 */
	public static final String $tterm_cd3 = "tterm_cd3";
	/**
	 *  入金条件備考.<p>
	 *
	 */
	public static final String $tterm_rmrks3 = "tterm_rmrks3";
	/**
	 *  Ｌ／ＣＮＯ.<p>
	 *
	 */
	public static final String $lc_no = "lc_no";
	/**
	 *  Ｌ／Ｃ日付.<p>
	 *
	 */
	public static final String $lc_dt = "lc_dt";
	/**
	 *  Ｌ／Ｃ備考.<p>
	 *
	 */
	public static final String $lc_rmrks = "lc_rmrks";
	/**
	 *  Ｂ／ＬＮＯ.<p>
	 *
	 */
	public static final String $bl_no = "bl_no";
	/**
	 *  Ｂ／Ｌ日付.<p>
	 *
	 */
	public static final String $bl_dt = "bl_dt";
	/**
	 *  Ｂ／Ｌ備考.<p>
	 *
	 */
	public static final String $bl_rmrks = "bl_rmrks";
	/**
	 *  ケースマーク１.<p>
	 *
	 */
	public static final String $case_mrk1 = "case_mrk1";
	/**
	 *  ケースマーク２.<p>
	 *
	 */
	public static final String $case_mrk2 = "case_mrk2";
	/**
	 *  ケースマーク３.<p>
	 *
	 */
	public static final String $case_mrk3 = "case_mrk3";
	/**
	 *  ケースマーク４.<p>
	 *
	 */
	public static final String $case_mrk4 = "case_mrk4";
	/**
	 *  ケースマーク５.<p>
	 *
	 */
	public static final String $case_mrk5 = "case_mrk5";
	/**
	 *  ケースマーク６.<p>
	 *
	 */
	public static final String $case_mrk6 = "case_mrk6";
	/**
	 *  インボイス備考.<p>
	 *
	 */
	public static final String $iv_rmrks = "iv_rmrks";
	/**
	 *  住所１.<p>
	 *
	 */
	public static final String $co_addr1 = "co_addr1";
	/**
	 *  住所２.<p>
	 *
	 */
	public static final String $co_addr2 = "co_addr2";
	/**
	 *  住所３.<p>
	 *
	 */
	public static final String $co_addr3 = "co_addr3";
	/**
	 *  住所４.<p>
	 *
	 */
	public static final String $co_addr4 = "co_addr4";
	/**
	 *  住所.<p>
	 *
	 */
	public static final String $co_addr = "co_addr";
	/**
	 *  国名.<p>
	 *
	 */
	public static final String $co_cntry_nm = "co_cntry_nm";
	/**
	 *  予備１.<p>
	 *
	 */
	public static final String $iv_sub_char1 = "iv_sub_char1";
	/**
	 *  予備２.<p>
	 *
	 */
	public static final String $iv_sub_char2 = "iv_sub_char2";
	/**
	 *  予備３.<p>
	 *
	 */
	public static final String $iv_sub_char3 = "iv_sub_char3";
	/**
	 *  通貨名.<p>
	 *
	 */
	public static final String $cur_nm = "cur_nm";
	/**
	 *  通貨ＣＤ.<p>
	 *
	 */
	public static final String $cur_cd = "cur_cd";
	/**
	 *  金額合計.<p>
	 *
	 */
	public static final String $amt = "amt";
	/**
	 *  小計２.<p>
	 *
	 */
	public static final String $subttl2 = "subttl2";
	/**
	 *  小計３.<p>
	 *
	 */
	public static final String $subttl3 = "subttl3";
	/**
	 *  税額合計.<p>
	 *
	 */
	public static final String $tax_amt = "tax_amt";
	/**
	 *  税小計２.<p>
	 *
	 */
	public static final String $tax_subttl2 = "tax_subttl2";
	/**
	 *  税小計３.<p>
	 *
	 */
	public static final String $tax_subttl3 = "tax_subttl3";
	/**
	 *  受渡条件名.<p>
	 *
	 */
	public static final String $tterm_nm1 = "tterm_nm1";
	/**
	 *  受渡条件ＣＤ.<p>
	 *
	 */
	public static final String $tterm_cd1 = "tterm_cd1";
	/**
	 *  受渡場所名.<p>
	 *
	 */
	public static final String $tterm_nm2 = "tterm_nm2";
	/**
	 *  受渡場所ＣＤ.<p>
	 *
	 */
	public static final String $tterm_cd2 = "tterm_cd2";
	/**
	 *  無償金額合計.<p>
	 *
	 */
	public static final String $ncv_amt = "ncv_amt";
	/**
	 *  無償金額合計文字列.<p>
	 *
	 */
	public static final String $s_ncv_amt = "s_ncv_amt";
	/**
	 *  基準単位表示.<p>
	 *
	 */
	public static final String $base_unit_disp_flg = "base_unit_disp_flg";


	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta iv_rev_META = createCommonMeta($iv_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta iv_mng_no_META = createCommonMeta($iv_mng_no, mcframe.commonMA.meta.MA_META.IV_MNG_NO);
	public static final MCMeta co_nm_META = createCommonMeta($co_nm, mcframe.commonMA.meta.MA_META.CO_NM);
	public static final MCMeta co_str_META = createStringMeta($co_str);
	public static final MCMeta co_tel_META = createCommonMeta($co_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta co_fax_META = createCommonMeta($co_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta prnt_dt_META = createCommonMeta($prnt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta iv_dt_META = createCommonMeta($iv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ship_rqst_id_cd_META = createCommonMeta($ship_rqst_id_cd, mcframe.commonMS.meta.MS_META.SHIP_RQST_ID_CD);
	public static final MCMeta ship_rqst_id_nm_META = createCommonMeta($ship_rqst_id_nm, mcframe.commonMS.meta.MS_META.SHIP_RQST_ID_NM);
	public static final MCMeta ship_rqst_id_alt_nm1_META = createCommonMeta($ship_rqst_id_alt_nm1, mcframe.commonMA.meta.MA_META.BP_ALT_NM1);
	public static final MCMeta ship_rqst_id_alt_nm2_META = createCommonMeta($ship_rqst_id_alt_nm2, mcframe.commonMA.meta.MA_META.BP_ALT_NM2);
	public static final MCMeta ship_rqst_id_alt_nm3_META = createCommonMeta($ship_rqst_id_alt_nm3, mcframe.commonMA.meta.MA_META.BP_ALT_NM3);
	public static final MCMeta ship_rqst_id_alt_nm4_META = createCommonMeta($ship_rqst_id_alt_nm4, mcframe.commonMA.meta.MA_META.BP_ALT_NM4);
	public static final MCMeta ship_rqst_addr1_META = createCommonMeta($ship_rqst_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta ship_rqst_addr2_META = createCommonMeta($ship_rqst_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta ship_rqst_addr3_META = createCommonMeta($ship_rqst_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta ship_rqst_addr4_META = createCommonMeta($ship_rqst_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta ship_rqst_addr_META = createStringMeta($ship_rqst_addr);
	public static final MCMeta ship_rqst_cntry_nm_META = createCommonMeta($ship_rqst_cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta dlv_id_typ_META = createCommonMeta($dlv_id_typ, mcframe.commonMS.meta.MS_META.DLV_ID_TYP);
	public static final MCMeta dlv_id_cd_META = createCommonMeta($dlv_id_cd, mcframe.commonMS.meta.MS_META.DLV_ID_CD);
	public static final MCMeta dlv_id_nm_META = createCommonMeta($dlv_id_nm, mcframe.commonMS.meta.MS_META.DLV_ID_NM);
	public static final MCMeta dlv_id_alt_nm1_META = createCommonMeta($dlv_id_alt_nm1, mcframe.commonMA.meta.MA_META.BP_ALT_NM1);
	public static final MCMeta dlv_id_alt_nm2_META = createCommonMeta($dlv_id_alt_nm2, mcframe.commonMA.meta.MA_META.BP_ALT_NM2);
	public static final MCMeta dlv_id_alt_nm3_META = createCommonMeta($dlv_id_alt_nm3, mcframe.commonMA.meta.MA_META.BP_ALT_NM3);
	public static final MCMeta dlv_id_alt_nm4_META = createCommonMeta($dlv_id_alt_nm4, mcframe.commonMA.meta.MA_META.BP_ALT_NM4);
	public static final MCMeta dlv_addr1_META = createCommonMeta($dlv_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta dlv_addr2_META = createCommonMeta($dlv_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta dlv_addr3_META = createCommonMeta($dlv_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta dlv_addr4_META = createCommonMeta($dlv_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta dlv_addr_META = createStringMeta($dlv_addr);
	public static final MCMeta dlv_cntry_cd_META = createCommonMeta($dlv_cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta dlv_cntry_nm_META = createCommonMeta($dlv_cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta trnspt_nm_META = createCommonMeta($trnspt_nm, mcframe.commonMA.meta.MA_META.TRNSPT_NM);
	public static final MCMeta trnspt_cd_META = createCommonMeta($trnspt_cd, mcframe.commonMA.meta.MA_META.TRNSPT_CD);
	public static final MCMeta vssl_flght_META = createCommonMeta($vssl_flght, mcframe.commonMA.meta.MA_META.VSSL_FLGHT);
	public static final MCMeta etd_dt_META = createCommonMeta($etd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta load_port_nm_META = createCommonMeta($load_port_nm, mcframe.commonMA.meta.MA_META.PORT_NM);
	public static final MCMeta load_port_cd_META = createCommonMeta($load_port_cd, mcframe.commonMA.meta.MA_META.PORT_CD);
	public static final MCMeta dschrg_port_nm_META = createCommonMeta($dschrg_port_nm, mcframe.commonMA.meta.MA_META.PORT_NM);
	public static final MCMeta dschrg_port_cd_META = createCommonMeta($dschrg_port_cd, mcframe.commonMA.meta.MA_META.PORT_CD);
	public static final MCMeta via_port_nm_META = createCommonMeta($via_port_nm, mcframe.commonMA.meta.MA_META.PORT_NM);
	public static final MCMeta via_port_cd_META = createCommonMeta($via_port_cd, mcframe.commonMA.meta.MA_META.PORT_CD);
	public static final MCMeta tterm_nm3_META = createCommonMeta($tterm_nm3, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta tterm_cd3_META = createCommonMeta($tterm_cd3, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_rmrks3_META = createCommonMeta($tterm_rmrks3, mcframe.commonMS.meta.MS_META.TTERM_RMRKS3);
	public static final MCMeta lc_no_META = createCommonMeta($lc_no, mcframe.commonMA.meta.MA_META.LC_NO);
	public static final MCMeta lc_dt_META = createCommonMeta($lc_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lc_rmrks_META = createCommonMeta($lc_rmrks, mcframe.commonMS.meta.MS_META.LC_RMRKS);
	public static final MCMeta bl_no_META = createCommonMeta($bl_no, mcframe.commonMA.meta.MA_META.BL_NO);
	public static final MCMeta bl_dt_META = createCommonMeta($bl_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bl_rmrks_META = createCommonMeta($bl_rmrks, mcframe.commonMS.meta.MS_META.BL_RMRKS);
	public static final MCMeta case_mrk1_META = createCommonMeta($case_mrk1, mcframe.commonMS.meta.MS_META.CASE_MRK);
	public static final MCMeta case_mrk2_META = createCommonMeta($case_mrk2, mcframe.commonMS.meta.MS_META.CASE_MRK);
	public static final MCMeta case_mrk3_META = createCommonMeta($case_mrk3, mcframe.commonMS.meta.MS_META.CASE_MRK);
	public static final MCMeta case_mrk4_META = createCommonMeta($case_mrk4, mcframe.commonMS.meta.MS_META.CASE_MRK);
	public static final MCMeta case_mrk5_META = createCommonMeta($case_mrk5, mcframe.commonMS.meta.MS_META.CASE_MRK);
	public static final MCMeta case_mrk6_META = createCommonMeta($case_mrk6, mcframe.commonMS.meta.MS_META.CASE_MRK);
	public static final MCMeta iv_rmrks_META = createCommonMeta($iv_rmrks, mcframe.commonMS.meta.MS_META.IV_RMRKS);
	public static final MCMeta co_addr1_META = createCommonMeta($co_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta co_addr2_META = createCommonMeta($co_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta co_addr3_META = createCommonMeta($co_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta co_addr4_META = createCommonMeta($co_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta co_addr_META = createStringMeta($co_addr);
	public static final MCMeta co_cntry_nm_META = createCommonMeta($co_cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta iv_sub_char1_META = createCommonMeta($iv_sub_char1, mcframe.commonMS.meta.MS_META.IV_SUB_CHAR1);
	public static final MCMeta iv_sub_char2_META = createCommonMeta($iv_sub_char2, mcframe.commonMS.meta.MS_META.IV_SUB_CHAR2);
	public static final MCMeta iv_sub_char3_META = createCommonMeta($iv_sub_char3, mcframe.commonMS.meta.MS_META.IV_SUB_CHAR3);
	public static final MCMeta cur_nm_META = createCommonMeta($cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta amt_META = createCommonMeta($amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta subttl2_META = createCommonMeta($subttl2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta subttl3_META = createCommonMeta($subttl3, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_amt_META = createCommonMeta($tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_subttl2_META = createCommonMeta($tax_subttl2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_subttl3_META = createCommonMeta($tax_subttl3, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tterm_nm1_META = createCommonMeta($tterm_nm1, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta tterm_cd1_META = createCommonMeta($tterm_cd1, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_nm2_META = createCommonMeta($tterm_nm2, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta tterm_cd2_META = createCommonMeta($tterm_cd2, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta ncv_amt_META = createCommonMeta($ncv_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_ncv_amt_META = createStringMeta($s_ncv_amt);
	public static final MCMeta base_unit_disp_flg_META = createCommonMeta($base_unit_disp_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<IvHdrR> constMetas = new ConstMetaList<IvHdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			iv_no_META,
			iv_rev_META,
			iv_mng_no_META,
			co_nm_META,
			co_str_META,
			co_tel_META,
			co_fax_META,
			prnt_dt_META,
			iv_dt_META,
			ship_rqst_id_cd_META,
			ship_rqst_id_nm_META,
			ship_rqst_id_alt_nm1_META,
			ship_rqst_id_alt_nm2_META,
			ship_rqst_id_alt_nm3_META,
			ship_rqst_id_alt_nm4_META,
			ship_rqst_addr1_META,
			ship_rqst_addr2_META,
			ship_rqst_addr3_META,
			ship_rqst_addr4_META,
			ship_rqst_addr_META,
			ship_rqst_cntry_nm_META,
			dlv_id_typ_META,
			dlv_id_cd_META,
			dlv_id_nm_META,
			dlv_id_alt_nm1_META,
			dlv_id_alt_nm2_META,
			dlv_id_alt_nm3_META,
			dlv_id_alt_nm4_META,
			dlv_addr1_META,
			dlv_addr2_META,
			dlv_addr3_META,
			dlv_addr4_META,
			dlv_addr_META,
			dlv_cntry_cd_META,
			dlv_cntry_nm_META,
			trnspt_nm_META,
			trnspt_cd_META,
			vssl_flght_META,
			etd_dt_META,
			load_port_nm_META,
			load_port_cd_META,
			dschrg_port_nm_META,
			dschrg_port_cd_META,
			via_port_nm_META,
			via_port_cd_META,
			tterm_nm3_META,
			tterm_cd3_META,
			tterm_rmrks3_META,
			lc_no_META,
			lc_dt_META,
			lc_rmrks_META,
			bl_no_META,
			bl_dt_META,
			bl_rmrks_META,
			case_mrk1_META,
			case_mrk2_META,
			case_mrk3_META,
			case_mrk4_META,
			case_mrk5_META,
			case_mrk6_META,
			iv_rmrks_META,
			co_addr1_META,
			co_addr2_META,
			co_addr3_META,
			co_addr4_META,
			co_addr_META,
			co_cntry_nm_META,
			iv_sub_char1_META,
			iv_sub_char2_META,
			iv_sub_char3_META,
			cur_nm_META,
			cur_cd_META,
			amt_META,
			subttl2_META,
			subttl3_META,
			tax_amt_META,
			tax_subttl2_META,
			tax_subttl3_META,
			tterm_nm1_META,
			tterm_cd1_META,
			tterm_nm2_META,
			tterm_cd2_META,
			ncv_amt_META,
			s_ncv_amt_META,
			base_unit_disp_flg_META
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
	protected IvHdrR_MC_A(ConstMetaList<? extends IvHdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public IvHdrR clone() {
		return (IvHdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public IvHdrR createInstance() {
		return (IvHdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public IvHdrR getValues(String... names) {
		return (IvHdrR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 0, $iv_no);
	}

	/**
	 *  インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 0, $iv_no, value);
	}


	/**
	 *  インボイス改訂番号.<p>
	 *
	 */
	public MCNumber iv_rev() {
		return getConstNumber(offset + 1, $iv_rev);
	}

	/**
	 *  インボイス改訂番号.<p>
	 *
	 */
	public void iv_rev(MCNumber value) {
		setConstNumber(offset + 1, $iv_rev, value);
	}

	/**
	 *  インボイス改訂番号.<p>
	 *
	 */
	public void iv_rev(int value) {
		setConstNumber(offset + 1, $iv_rev, value);
	}

	/**
	 *  インボイス改訂番号.<p>
	 *
	 */
	public void iv_rev(long value) {
		setConstNumber(offset + 1, $iv_rev, value);
	}

	/**
	 *  インボイス改訂番号.<p>
	 *
	 */
	public void iv_rev(float value) {
		setConstNumber(offset + 1, $iv_rev, value);
	}

	/**
	 *  インボイス改訂番号.<p>
	 *
	 */
	public void iv_rev(double value) {
		setConstNumber(offset + 1, $iv_rev, value);
	}


	/**
	 *  インボイス管理ＮＯ.<p>
	 *
	 */
	public String iv_mng_no() {
		return getConstString(offset + 2, $iv_mng_no);
	}

	/**
	 *  インボイス管理ＮＯ.<p>
	 *
	 */
	public void iv_mng_no(String value) {
		setConstString(offset + 2, $iv_mng_no, value);
	}


	/**
	 *  会社名.<p>
	 *
	 */
	public String co_nm() {
		return getConstString(offset + 3, $co_nm);
	}

	/**
	 *  会社名.<p>
	 *
	 */
	public void co_nm(String value) {
		setConstString(offset + 3, $co_nm, value);
	}


	/**
	 *  会社名（不使用）.<p>
	 *
	 */
	public String co_str() {
		return getConstString(offset + 4, $co_str);
	}

	/**
	 *  会社名（不使用）.<p>
	 *
	 */
	public void co_str(String value) {
		setConstString(offset + 4, $co_str, value);
	}


	/**
	 *  会社ＴＥＬ.<p>
	 *
	 */
	public String co_tel() {
		return getConstString(offset + 5, $co_tel);
	}

	/**
	 *  会社ＴＥＬ.<p>
	 *
	 */
	public void co_tel(String value) {
		setConstString(offset + 5, $co_tel, value);
	}


	/**
	 *  会社ＦＡＸ.<p>
	 *
	 */
	public String co_fax() {
		return getConstString(offset + 6, $co_fax);
	}

	/**
	 *  会社ＦＡＸ.<p>
	 *
	 */
	public void co_fax(String value) {
		setConstString(offset + 6, $co_fax, value);
	}


	/**
	 *  発行日.<p>
	 *
	 */
	public MCDate prnt_dt() {
		return getConstDate(offset + 7, $prnt_dt);
	}

	/**
	 *  発行日.<p>
	 *
	 */
	public void prnt_dt(MCDate value) {
		setConstDate(offset + 7, $prnt_dt, value);
	}


	/**
	 *  インボイス日付.<p>
	 *
	 */
	public MCDate iv_dt() {
		return getConstDate(offset + 8, $iv_dt);
	}

	/**
	 *  インボイス日付.<p>
	 *
	 */
	public void iv_dt(MCDate value) {
		setConstDate(offset + 8, $iv_dt, value);
	}


	/**
	 *  得意先ＣＤ.<p>
	 *
	 */
	public String ship_rqst_id_cd() {
		return getConstString(offset + 9, $ship_rqst_id_cd);
	}

	/**
	 *  得意先ＣＤ.<p>
	 *
	 */
	public void ship_rqst_id_cd(String value) {
		setConstString(offset + 9, $ship_rqst_id_cd, value);
	}


	/**
	 *  得意先名.<p>
	 *
	 */
	public String ship_rqst_id_nm() {
		return getConstString(offset + 10, $ship_rqst_id_nm);
	}

	/**
	 *  得意先名.<p>
	 *
	 */
	public void ship_rqst_id_nm(String value) {
		setConstString(offset + 10, $ship_rqst_id_nm, value);
	}


	/**
	 *  得意先別名１.<p>
	 *
	 */
	public String ship_rqst_id_alt_nm1() {
		return getConstString(offset + 11, $ship_rqst_id_alt_nm1);
	}

	/**
	 *  得意先別名１.<p>
	 *
	 */
	public void ship_rqst_id_alt_nm1(String value) {
		setConstString(offset + 11, $ship_rqst_id_alt_nm1, value);
	}


	/**
	 *  得意先別名２.<p>
	 *
	 */
	public String ship_rqst_id_alt_nm2() {
		return getConstString(offset + 12, $ship_rqst_id_alt_nm2);
	}

	/**
	 *  得意先別名２.<p>
	 *
	 */
	public void ship_rqst_id_alt_nm2(String value) {
		setConstString(offset + 12, $ship_rqst_id_alt_nm2, value);
	}


	/**
	 *  得意先別名３.<p>
	 *
	 */
	public String ship_rqst_id_alt_nm3() {
		return getConstString(offset + 13, $ship_rqst_id_alt_nm3);
	}

	/**
	 *  得意先別名３.<p>
	 *
	 */
	public void ship_rqst_id_alt_nm3(String value) {
		setConstString(offset + 13, $ship_rqst_id_alt_nm3, value);
	}


	/**
	 *  得意先別名４.<p>
	 *
	 */
	public String ship_rqst_id_alt_nm4() {
		return getConstString(offset + 14, $ship_rqst_id_alt_nm4);
	}

	/**
	 *  得意先別名４.<p>
	 *
	 */
	public void ship_rqst_id_alt_nm4(String value) {
		setConstString(offset + 14, $ship_rqst_id_alt_nm4, value);
	}


	/**
	 *  得意先住所１.<p>
	 *
	 */
	public String ship_rqst_addr1() {
		return getConstString(offset + 15, $ship_rqst_addr1);
	}

	/**
	 *  得意先住所１.<p>
	 *
	 */
	public void ship_rqst_addr1(String value) {
		setConstString(offset + 15, $ship_rqst_addr1, value);
	}


	/**
	 *  得意先住所２.<p>
	 *
	 */
	public String ship_rqst_addr2() {
		return getConstString(offset + 16, $ship_rqst_addr2);
	}

	/**
	 *  得意先住所２.<p>
	 *
	 */
	public void ship_rqst_addr2(String value) {
		setConstString(offset + 16, $ship_rqst_addr2, value);
	}


	/**
	 *  得意先住所３.<p>
	 *
	 */
	public String ship_rqst_addr3() {
		return getConstString(offset + 17, $ship_rqst_addr3);
	}

	/**
	 *  得意先住所３.<p>
	 *
	 */
	public void ship_rqst_addr3(String value) {
		setConstString(offset + 17, $ship_rqst_addr3, value);
	}


	/**
	 *  得意先住所４.<p>
	 *
	 */
	public String ship_rqst_addr4() {
		return getConstString(offset + 18, $ship_rqst_addr4);
	}

	/**
	 *  得意先住所４.<p>
	 *
	 */
	public void ship_rqst_addr4(String value) {
		setConstString(offset + 18, $ship_rqst_addr4, value);
	}


	/**
	 *  得意先住所.<p>
	 *
	 */
	public String ship_rqst_addr() {
		return getConstString(offset + 19, $ship_rqst_addr);
	}

	/**
	 *  得意先住所.<p>
	 *
	 */
	public void ship_rqst_addr(String value) {
		setConstString(offset + 19, $ship_rqst_addr, value);
	}


	/**
	 *  得意先国名.<p>
	 *
	 */
	public String ship_rqst_cntry_nm() {
		return getConstString(offset + 20, $ship_rqst_cntry_nm);
	}

	/**
	 *  得意先国名.<p>
	 *
	 */
	public void ship_rqst_cntry_nm(String value) {
		setConstString(offset + 20, $ship_rqst_cntry_nm, value);
	}


	/**
	 *  納品先識別区分（不使用）.<p>
	 *
	 */
	public String dlv_id_typ() {
		return getConstString(offset + 21, $dlv_id_typ);
	}

	/**
	 *  納品先識別区分（不使用）.<p>
	 *
	 */
	public void dlv_id_typ(String value) {
		setConstString(offset + 21, $dlv_id_typ, value);
	}


	/**
	 *  納品先ＣＤ.<p>
	 *
	 */
	public String dlv_id_cd() {
		return getConstString(offset + 22, $dlv_id_cd);
	}

	/**
	 *  納品先ＣＤ.<p>
	 *
	 */
	public void dlv_id_cd(String value) {
		setConstString(offset + 22, $dlv_id_cd, value);
	}


	/**
	 *  納品先名.<p>
	 *
	 */
	public String dlv_id_nm() {
		return getConstString(offset + 23, $dlv_id_nm);
	}

	/**
	 *  納品先名.<p>
	 *
	 */
	public void dlv_id_nm(String value) {
		setConstString(offset + 23, $dlv_id_nm, value);
	}


	/**
	 *  納品先別名１.<p>
	 *
	 */
	public String dlv_id_alt_nm1() {
		return getConstString(offset + 24, $dlv_id_alt_nm1);
	}

	/**
	 *  納品先別名１.<p>
	 *
	 */
	public void dlv_id_alt_nm1(String value) {
		setConstString(offset + 24, $dlv_id_alt_nm1, value);
	}


	/**
	 *  納品先別名２.<p>
	 *
	 */
	public String dlv_id_alt_nm2() {
		return getConstString(offset + 25, $dlv_id_alt_nm2);
	}

	/**
	 *  納品先別名２.<p>
	 *
	 */
	public void dlv_id_alt_nm2(String value) {
		setConstString(offset + 25, $dlv_id_alt_nm2, value);
	}


	/**
	 *  納品先別名３.<p>
	 *
	 */
	public String dlv_id_alt_nm3() {
		return getConstString(offset + 26, $dlv_id_alt_nm3);
	}

	/**
	 *  納品先別名３.<p>
	 *
	 */
	public void dlv_id_alt_nm3(String value) {
		setConstString(offset + 26, $dlv_id_alt_nm3, value);
	}


	/**
	 *  納品先別名４.<p>
	 *
	 */
	public String dlv_id_alt_nm4() {
		return getConstString(offset + 27, $dlv_id_alt_nm4);
	}

	/**
	 *  納品先別名４.<p>
	 *
	 */
	public void dlv_id_alt_nm4(String value) {
		setConstString(offset + 27, $dlv_id_alt_nm4, value);
	}


	/**
	 *  納品先住所１.<p>
	 *
	 */
	public String dlv_addr1() {
		return getConstString(offset + 28, $dlv_addr1);
	}

	/**
	 *  納品先住所１.<p>
	 *
	 */
	public void dlv_addr1(String value) {
		setConstString(offset + 28, $dlv_addr1, value);
	}


	/**
	 *  納品先住所２.<p>
	 *
	 */
	public String dlv_addr2() {
		return getConstString(offset + 29, $dlv_addr2);
	}

	/**
	 *  納品先住所２.<p>
	 *
	 */
	public void dlv_addr2(String value) {
		setConstString(offset + 29, $dlv_addr2, value);
	}


	/**
	 *  納品先住所３.<p>
	 *
	 */
	public String dlv_addr3() {
		return getConstString(offset + 30, $dlv_addr3);
	}

	/**
	 *  納品先住所３.<p>
	 *
	 */
	public void dlv_addr3(String value) {
		setConstString(offset + 30, $dlv_addr3, value);
	}


	/**
	 *  納品先住所４.<p>
	 *
	 */
	public String dlv_addr4() {
		return getConstString(offset + 31, $dlv_addr4);
	}

	/**
	 *  納品先住所４.<p>
	 *
	 */
	public void dlv_addr4(String value) {
		setConstString(offset + 31, $dlv_addr4, value);
	}


	/**
	 *  納品先住所.<p>
	 *
	 */
	public String dlv_addr() {
		return getConstString(offset + 32, $dlv_addr);
	}

	/**
	 *  納品先住所.<p>
	 *
	 */
	public void dlv_addr(String value) {
		setConstString(offset + 32, $dlv_addr, value);
	}


	/**
	 *  納品先国ＣＤ.<p>
	 *
	 */
	public String dlv_cntry_cd() {
		return getConstString(offset + 33, $dlv_cntry_cd);
	}

	/**
	 *  納品先国ＣＤ.<p>
	 *
	 */
	public void dlv_cntry_cd(String value) {
		setConstString(offset + 33, $dlv_cntry_cd, value);
	}


	/**
	 *  納品先国名.<p>
	 *
	 */
	public String dlv_cntry_nm() {
		return getConstString(offset + 34, $dlv_cntry_nm);
	}

	/**
	 *  納品先国名.<p>
	 *
	 */
	public void dlv_cntry_nm(String value) {
		setConstString(offset + 34, $dlv_cntry_nm, value);
	}


	/**
	 *  輸送方法名.<p>
	 *
	 */
	public String trnspt_nm() {
		return getConstString(offset + 35, $trnspt_nm);
	}

	/**
	 *  輸送方法名.<p>
	 *
	 */
	public void trnspt_nm(String value) {
		setConstString(offset + 35, $trnspt_nm, value);
	}


	/**
	 *  輸送方法ＣＤ.<p>
	 *
	 */
	public String trnspt_cd() {
		return getConstString(offset + 36, $trnspt_cd);
	}

	/**
	 *  輸送方法ＣＤ.<p>
	 *
	 */
	public void trnspt_cd(String value) {
		setConstString(offset + 36, $trnspt_cd, value);
	}


	/**
	 *  船名／便名.<p>
	 *
	 */
	public String vssl_flght() {
		return getConstString(offset + 37, $vssl_flght);
	}

	/**
	 *  船名／便名.<p>
	 *
	 */
	public void vssl_flght(String value) {
		setConstString(offset + 37, $vssl_flght, value);
	}


	/**
	 *  船積予定日.<p>
	 *
	 */
	public MCDate etd_dt() {
		return getConstDate(offset + 38, $etd_dt);
	}

	/**
	 *  船積予定日.<p>
	 *
	 */
	public void etd_dt(MCDate value) {
		setConstDate(offset + 38, $etd_dt, value);
	}


	/**
	 *  船積港名.<p>
	 *
	 */
	public String load_port_nm() {
		return getConstString(offset + 39, $load_port_nm);
	}

	/**
	 *  船積港名.<p>
	 *
	 */
	public void load_port_nm(String value) {
		setConstString(offset + 39, $load_port_nm, value);
	}


	/**
	 *  船積港ＣＤ.<p>
	 *
	 */
	public String load_port_cd() {
		return getConstString(offset + 40, $load_port_cd);
	}

	/**
	 *  船積港ＣＤ.<p>
	 *
	 */
	public void load_port_cd(String value) {
		setConstString(offset + 40, $load_port_cd, value);
	}


	/**
	 *  船卸港名.<p>
	 *
	 */
	public String dschrg_port_nm() {
		return getConstString(offset + 41, $dschrg_port_nm);
	}

	/**
	 *  船卸港名.<p>
	 *
	 */
	public void dschrg_port_nm(String value) {
		setConstString(offset + 41, $dschrg_port_nm, value);
	}


	/**
	 *  船卸港ＣＤ.<p>
	 *
	 */
	public String dschrg_port_cd() {
		return getConstString(offset + 42, $dschrg_port_cd);
	}

	/**
	 *  船卸港ＣＤ.<p>
	 *
	 */
	public void dschrg_port_cd(String value) {
		setConstString(offset + 42, $dschrg_port_cd, value);
	}


	/**
	 *  経由地名.<p>
	 *
	 */
	public String via_port_nm() {
		return getConstString(offset + 43, $via_port_nm);
	}

	/**
	 *  経由地名.<p>
	 *
	 */
	public void via_port_nm(String value) {
		setConstString(offset + 43, $via_port_nm, value);
	}


	/**
	 *  経由地ＣＤ.<p>
	 *
	 */
	public String via_port_cd() {
		return getConstString(offset + 44, $via_port_cd);
	}

	/**
	 *  経由地ＣＤ.<p>
	 *
	 */
	public void via_port_cd(String value) {
		setConstString(offset + 44, $via_port_cd, value);
	}


	/**
	 *  入金条件名.<p>
	 *
	 */
	public String tterm_nm3() {
		return getConstString(offset + 45, $tterm_nm3);
	}

	/**
	 *  入金条件名.<p>
	 *
	 */
	public void tterm_nm3(String value) {
		setConstString(offset + 45, $tterm_nm3, value);
	}


	/**
	 *  入金条件ＣＤ.<p>
	 *
	 */
	public String tterm_cd3() {
		return getConstString(offset + 46, $tterm_cd3);
	}

	/**
	 *  入金条件ＣＤ.<p>
	 *
	 */
	public void tterm_cd3(String value) {
		setConstString(offset + 46, $tterm_cd3, value);
	}


	/**
	 *  入金条件備考.<p>
	 *
	 */
	public String tterm_rmrks3() {
		return getConstString(offset + 47, $tterm_rmrks3);
	}

	/**
	 *  入金条件備考.<p>
	 *
	 */
	public void tterm_rmrks3(String value) {
		setConstString(offset + 47, $tterm_rmrks3, value);
	}


	/**
	 *  Ｌ／ＣＮＯ.<p>
	 *
	 */
	public String lc_no() {
		return getConstString(offset + 48, $lc_no);
	}

	/**
	 *  Ｌ／ＣＮＯ.<p>
	 *
	 */
	public void lc_no(String value) {
		setConstString(offset + 48, $lc_no, value);
	}


	/**
	 *  Ｌ／Ｃ日付.<p>
	 *
	 */
	public MCDate lc_dt() {
		return getConstDate(offset + 49, $lc_dt);
	}

	/**
	 *  Ｌ／Ｃ日付.<p>
	 *
	 */
	public void lc_dt(MCDate value) {
		setConstDate(offset + 49, $lc_dt, value);
	}


	/**
	 *  Ｌ／Ｃ備考.<p>
	 *
	 */
	public String lc_rmrks() {
		return getConstString(offset + 50, $lc_rmrks);
	}

	/**
	 *  Ｌ／Ｃ備考.<p>
	 *
	 */
	public void lc_rmrks(String value) {
		setConstString(offset + 50, $lc_rmrks, value);
	}


	/**
	 *  Ｂ／ＬＮＯ.<p>
	 *
	 */
	public String bl_no() {
		return getConstString(offset + 51, $bl_no);
	}

	/**
	 *  Ｂ／ＬＮＯ.<p>
	 *
	 */
	public void bl_no(String value) {
		setConstString(offset + 51, $bl_no, value);
	}


	/**
	 *  Ｂ／Ｌ日付.<p>
	 *
	 */
	public MCDate bl_dt() {
		return getConstDate(offset + 52, $bl_dt);
	}

	/**
	 *  Ｂ／Ｌ日付.<p>
	 *
	 */
	public void bl_dt(MCDate value) {
		setConstDate(offset + 52, $bl_dt, value);
	}


	/**
	 *  Ｂ／Ｌ備考.<p>
	 *
	 */
	public String bl_rmrks() {
		return getConstString(offset + 53, $bl_rmrks);
	}

	/**
	 *  Ｂ／Ｌ備考.<p>
	 *
	 */
	public void bl_rmrks(String value) {
		setConstString(offset + 53, $bl_rmrks, value);
	}


	/**
	 *  ケースマーク１.<p>
	 *
	 */
	public String case_mrk1() {
		return getConstString(offset + 54, $case_mrk1);
	}

	/**
	 *  ケースマーク１.<p>
	 *
	 */
	public void case_mrk1(String value) {
		setConstString(offset + 54, $case_mrk1, value);
	}


	/**
	 *  ケースマーク２.<p>
	 *
	 */
	public String case_mrk2() {
		return getConstString(offset + 55, $case_mrk2);
	}

	/**
	 *  ケースマーク２.<p>
	 *
	 */
	public void case_mrk2(String value) {
		setConstString(offset + 55, $case_mrk2, value);
	}


	/**
	 *  ケースマーク３.<p>
	 *
	 */
	public String case_mrk3() {
		return getConstString(offset + 56, $case_mrk3);
	}

	/**
	 *  ケースマーク３.<p>
	 *
	 */
	public void case_mrk3(String value) {
		setConstString(offset + 56, $case_mrk3, value);
	}


	/**
	 *  ケースマーク４.<p>
	 *
	 */
	public String case_mrk4() {
		return getConstString(offset + 57, $case_mrk4);
	}

	/**
	 *  ケースマーク４.<p>
	 *
	 */
	public void case_mrk4(String value) {
		setConstString(offset + 57, $case_mrk4, value);
	}


	/**
	 *  ケースマーク５.<p>
	 *
	 */
	public String case_mrk5() {
		return getConstString(offset + 58, $case_mrk5);
	}

	/**
	 *  ケースマーク５.<p>
	 *
	 */
	public void case_mrk5(String value) {
		setConstString(offset + 58, $case_mrk5, value);
	}


	/**
	 *  ケースマーク６.<p>
	 *
	 */
	public String case_mrk6() {
		return getConstString(offset + 59, $case_mrk6);
	}

	/**
	 *  ケースマーク６.<p>
	 *
	 */
	public void case_mrk6(String value) {
		setConstString(offset + 59, $case_mrk6, value);
	}


	/**
	 *  インボイス備考.<p>
	 *
	 */
	public String iv_rmrks() {
		return getConstString(offset + 60, $iv_rmrks);
	}

	/**
	 *  インボイス備考.<p>
	 *
	 */
	public void iv_rmrks(String value) {
		setConstString(offset + 60, $iv_rmrks, value);
	}


	/**
	 *  住所１.<p>
	 *
	 */
	public String co_addr1() {
		return getConstString(offset + 61, $co_addr1);
	}

	/**
	 *  住所１.<p>
	 *
	 */
	public void co_addr1(String value) {
		setConstString(offset + 61, $co_addr1, value);
	}


	/**
	 *  住所２.<p>
	 *
	 */
	public String co_addr2() {
		return getConstString(offset + 62, $co_addr2);
	}

	/**
	 *  住所２.<p>
	 *
	 */
	public void co_addr2(String value) {
		setConstString(offset + 62, $co_addr2, value);
	}


	/**
	 *  住所３.<p>
	 *
	 */
	public String co_addr3() {
		return getConstString(offset + 63, $co_addr3);
	}

	/**
	 *  住所３.<p>
	 *
	 */
	public void co_addr3(String value) {
		setConstString(offset + 63, $co_addr3, value);
	}


	/**
	 *  住所４.<p>
	 *
	 */
	public String co_addr4() {
		return getConstString(offset + 64, $co_addr4);
	}

	/**
	 *  住所４.<p>
	 *
	 */
	public void co_addr4(String value) {
		setConstString(offset + 64, $co_addr4, value);
	}


	/**
	 *  住所.<p>
	 *
	 */
	public String co_addr() {
		return getConstString(offset + 65, $co_addr);
	}

	/**
	 *  住所.<p>
	 *
	 */
	public void co_addr(String value) {
		setConstString(offset + 65, $co_addr, value);
	}


	/**
	 *  国名.<p>
	 *
	 */
	public String co_cntry_nm() {
		return getConstString(offset + 66, $co_cntry_nm);
	}

	/**
	 *  国名.<p>
	 *
	 */
	public void co_cntry_nm(String value) {
		setConstString(offset + 66, $co_cntry_nm, value);
	}


	/**
	 *  予備１.<p>
	 *
	 */
	public String iv_sub_char1() {
		return getConstString(offset + 67, $iv_sub_char1);
	}

	/**
	 *  予備１.<p>
	 *
	 */
	public void iv_sub_char1(String value) {
		setConstString(offset + 67, $iv_sub_char1, value);
	}


	/**
	 *  予備２.<p>
	 *
	 */
	public String iv_sub_char2() {
		return getConstString(offset + 68, $iv_sub_char2);
	}

	/**
	 *  予備２.<p>
	 *
	 */
	public void iv_sub_char2(String value) {
		setConstString(offset + 68, $iv_sub_char2, value);
	}


	/**
	 *  予備３.<p>
	 *
	 */
	public String iv_sub_char3() {
		return getConstString(offset + 69, $iv_sub_char3);
	}

	/**
	 *  予備３.<p>
	 *
	 */
	public void iv_sub_char3(String value) {
		setConstString(offset + 69, $iv_sub_char3, value);
	}


	/**
	 *  通貨名.<p>
	 *
	 */
	public String cur_nm() {
		return getConstString(offset + 70, $cur_nm);
	}

	/**
	 *  通貨名.<p>
	 *
	 */
	public void cur_nm(String value) {
		setConstString(offset + 70, $cur_nm, value);
	}


	/**
	 *  通貨ＣＤ.<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 71, $cur_cd);
	}

	/**
	 *  通貨ＣＤ.<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 71, $cur_cd, value);
	}


	/**
	 *  金額合計.<p>
	 *
	 */
	public MCNumber amt() {
		return getConstNumber(offset + 72, $amt);
	}

	/**
	 *  金額合計.<p>
	 *
	 */
	public void amt(MCNumber value) {
		setConstNumber(offset + 72, $amt, value);
	}

	/**
	 *  金額合計.<p>
	 *
	 */
	public void amt(int value) {
		setConstNumber(offset + 72, $amt, value);
	}

	/**
	 *  金額合計.<p>
	 *
	 */
	public void amt(long value) {
		setConstNumber(offset + 72, $amt, value);
	}

	/**
	 *  金額合計.<p>
	 *
	 */
	public void amt(float value) {
		setConstNumber(offset + 72, $amt, value);
	}

	/**
	 *  金額合計.<p>
	 *
	 */
	public void amt(double value) {
		setConstNumber(offset + 72, $amt, value);
	}


	/**
	 *  小計２.<p>
	 *
	 */
	public MCNumber subttl2() {
		return getConstNumber(offset + 73, $subttl2);
	}

	/**
	 *  小計２.<p>
	 *
	 */
	public void subttl2(MCNumber value) {
		setConstNumber(offset + 73, $subttl2, value);
	}

	/**
	 *  小計２.<p>
	 *
	 */
	public void subttl2(int value) {
		setConstNumber(offset + 73, $subttl2, value);
	}

	/**
	 *  小計２.<p>
	 *
	 */
	public void subttl2(long value) {
		setConstNumber(offset + 73, $subttl2, value);
	}

	/**
	 *  小計２.<p>
	 *
	 */
	public void subttl2(float value) {
		setConstNumber(offset + 73, $subttl2, value);
	}

	/**
	 *  小計２.<p>
	 *
	 */
	public void subttl2(double value) {
		setConstNumber(offset + 73, $subttl2, value);
	}


	/**
	 *  小計３.<p>
	 *
	 */
	public MCNumber subttl3() {
		return getConstNumber(offset + 74, $subttl3);
	}

	/**
	 *  小計３.<p>
	 *
	 */
	public void subttl3(MCNumber value) {
		setConstNumber(offset + 74, $subttl3, value);
	}

	/**
	 *  小計３.<p>
	 *
	 */
	public void subttl3(int value) {
		setConstNumber(offset + 74, $subttl3, value);
	}

	/**
	 *  小計３.<p>
	 *
	 */
	public void subttl3(long value) {
		setConstNumber(offset + 74, $subttl3, value);
	}

	/**
	 *  小計３.<p>
	 *
	 */
	public void subttl3(float value) {
		setConstNumber(offset + 74, $subttl3, value);
	}

	/**
	 *  小計３.<p>
	 *
	 */
	public void subttl3(double value) {
		setConstNumber(offset + 74, $subttl3, value);
	}


	/**
	 *  税額合計.<p>
	 *
	 */
	public MCNumber tax_amt() {
		return getConstNumber(offset + 75, $tax_amt);
	}

	/**
	 *  税額合計.<p>
	 *
	 */
	public void tax_amt(MCNumber value) {
		setConstNumber(offset + 75, $tax_amt, value);
	}

	/**
	 *  税額合計.<p>
	 *
	 */
	public void tax_amt(int value) {
		setConstNumber(offset + 75, $tax_amt, value);
	}

	/**
	 *  税額合計.<p>
	 *
	 */
	public void tax_amt(long value) {
		setConstNumber(offset + 75, $tax_amt, value);
	}

	/**
	 *  税額合計.<p>
	 *
	 */
	public void tax_amt(float value) {
		setConstNumber(offset + 75, $tax_amt, value);
	}

	/**
	 *  税額合計.<p>
	 *
	 */
	public void tax_amt(double value) {
		setConstNumber(offset + 75, $tax_amt, value);
	}


	/**
	 *  税小計２.<p>
	 *
	 */
	public MCNumber tax_subttl2() {
		return getConstNumber(offset + 76, $tax_subttl2);
	}

	/**
	 *  税小計２.<p>
	 *
	 */
	public void tax_subttl2(MCNumber value) {
		setConstNumber(offset + 76, $tax_subttl2, value);
	}

	/**
	 *  税小計２.<p>
	 *
	 */
	public void tax_subttl2(int value) {
		setConstNumber(offset + 76, $tax_subttl2, value);
	}

	/**
	 *  税小計２.<p>
	 *
	 */
	public void tax_subttl2(long value) {
		setConstNumber(offset + 76, $tax_subttl2, value);
	}

	/**
	 *  税小計２.<p>
	 *
	 */
	public void tax_subttl2(float value) {
		setConstNumber(offset + 76, $tax_subttl2, value);
	}

	/**
	 *  税小計２.<p>
	 *
	 */
	public void tax_subttl2(double value) {
		setConstNumber(offset + 76, $tax_subttl2, value);
	}


	/**
	 *  税小計３.<p>
	 *
	 */
	public MCNumber tax_subttl3() {
		return getConstNumber(offset + 77, $tax_subttl3);
	}

	/**
	 *  税小計３.<p>
	 *
	 */
	public void tax_subttl3(MCNumber value) {
		setConstNumber(offset + 77, $tax_subttl3, value);
	}

	/**
	 *  税小計３.<p>
	 *
	 */
	public void tax_subttl3(int value) {
		setConstNumber(offset + 77, $tax_subttl3, value);
	}

	/**
	 *  税小計３.<p>
	 *
	 */
	public void tax_subttl3(long value) {
		setConstNumber(offset + 77, $tax_subttl3, value);
	}

	/**
	 *  税小計３.<p>
	 *
	 */
	public void tax_subttl3(float value) {
		setConstNumber(offset + 77, $tax_subttl3, value);
	}

	/**
	 *  税小計３.<p>
	 *
	 */
	public void tax_subttl3(double value) {
		setConstNumber(offset + 77, $tax_subttl3, value);
	}


	/**
	 *  受渡条件名.<p>
	 *
	 */
	public String tterm_nm1() {
		return getConstString(offset + 78, $tterm_nm1);
	}

	/**
	 *  受渡条件名.<p>
	 *
	 */
	public void tterm_nm1(String value) {
		setConstString(offset + 78, $tterm_nm1, value);
	}


	/**
	 *  受渡条件ＣＤ.<p>
	 *
	 */
	public String tterm_cd1() {
		return getConstString(offset + 79, $tterm_cd1);
	}

	/**
	 *  受渡条件ＣＤ.<p>
	 *
	 */
	public void tterm_cd1(String value) {
		setConstString(offset + 79, $tterm_cd1, value);
	}


	/**
	 *  受渡場所名.<p>
	 *
	 */
	public String tterm_nm2() {
		return getConstString(offset + 80, $tterm_nm2);
	}

	/**
	 *  受渡場所名.<p>
	 *
	 */
	public void tterm_nm2(String value) {
		setConstString(offset + 80, $tterm_nm2, value);
	}


	/**
	 *  受渡場所ＣＤ.<p>
	 *
	 */
	public String tterm_cd2() {
		return getConstString(offset + 81, $tterm_cd2);
	}

	/**
	 *  受渡場所ＣＤ.<p>
	 *
	 */
	public void tterm_cd2(String value) {
		setConstString(offset + 81, $tterm_cd2, value);
	}


	/**
	 *  無償金額合計.<p>
	 *
	 */
	public MCNumber ncv_amt() {
		return getConstNumber(offset + 82, $ncv_amt);
	}

	/**
	 *  無償金額合計.<p>
	 *
	 */
	public void ncv_amt(MCNumber value) {
		setConstNumber(offset + 82, $ncv_amt, value);
	}

	/**
	 *  無償金額合計.<p>
	 *
	 */
	public void ncv_amt(int value) {
		setConstNumber(offset + 82, $ncv_amt, value);
	}

	/**
	 *  無償金額合計.<p>
	 *
	 */
	public void ncv_amt(long value) {
		setConstNumber(offset + 82, $ncv_amt, value);
	}

	/**
	 *  無償金額合計.<p>
	 *
	 */
	public void ncv_amt(float value) {
		setConstNumber(offset + 82, $ncv_amt, value);
	}

	/**
	 *  無償金額合計.<p>
	 *
	 */
	public void ncv_amt(double value) {
		setConstNumber(offset + 82, $ncv_amt, value);
	}


	/**
	 *  無償金額合計文字列.<p>
	 *
	 */
	public String s_ncv_amt() {
		return getConstString(offset + 83, $s_ncv_amt);
	}

	/**
	 *  無償金額合計文字列.<p>
	 *
	 */
	public void s_ncv_amt(String value) {
		setConstString(offset + 83, $s_ncv_amt, value);
	}


	/**
	 *  基準単位表示.<p>
	 *
	 */
	public boolean base_unit_disp_flg() {
		return getConstBoolean(offset + 84, $base_unit_disp_flg);
	}

	/**
	 *  基準単位表示.<p>
	 *
	 */
	public void base_unit_disp_flg(boolean value) {
		setConstBoolean(offset + 84, $base_unit_disp_flg, value);
	}


	public String getString(String name) {
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($iv_mng_no.equalsIgnoreCase(name)) {
			return iv_mng_no();
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			return co_nm();
		}
		if ($co_str.equalsIgnoreCase(name)) {
			return co_str();
		}
		if ($co_tel.equalsIgnoreCase(name)) {
			return co_tel();
		}
		if ($co_fax.equalsIgnoreCase(name)) {
			return co_fax();
		}
		if ($ship_rqst_id_cd.equalsIgnoreCase(name)) {
			return ship_rqst_id_cd();
		}
		if ($ship_rqst_id_nm.equalsIgnoreCase(name)) {
			return ship_rqst_id_nm();
		}
		if ($ship_rqst_id_alt_nm1.equalsIgnoreCase(name)) {
			return ship_rqst_id_alt_nm1();
		}
		if ($ship_rqst_id_alt_nm2.equalsIgnoreCase(name)) {
			return ship_rqst_id_alt_nm2();
		}
		if ($ship_rqst_id_alt_nm3.equalsIgnoreCase(name)) {
			return ship_rqst_id_alt_nm3();
		}
		if ($ship_rqst_id_alt_nm4.equalsIgnoreCase(name)) {
			return ship_rqst_id_alt_nm4();
		}
		if ($ship_rqst_addr1.equalsIgnoreCase(name)) {
			return ship_rqst_addr1();
		}
		if ($ship_rqst_addr2.equalsIgnoreCase(name)) {
			return ship_rqst_addr2();
		}
		if ($ship_rqst_addr3.equalsIgnoreCase(name)) {
			return ship_rqst_addr3();
		}
		if ($ship_rqst_addr4.equalsIgnoreCase(name)) {
			return ship_rqst_addr4();
		}
		if ($ship_rqst_addr.equalsIgnoreCase(name)) {
			return ship_rqst_addr();
		}
		if ($ship_rqst_cntry_nm.equalsIgnoreCase(name)) {
			return ship_rqst_cntry_nm();
		}
		if ($dlv_id_typ.equalsIgnoreCase(name)) {
			return dlv_id_typ();
		}
		if ($dlv_id_cd.equalsIgnoreCase(name)) {
			return dlv_id_cd();
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
		if ($dlv_cntry_cd.equalsIgnoreCase(name)) {
			return dlv_cntry_cd();
		}
		if ($dlv_cntry_nm.equalsIgnoreCase(name)) {
			return dlv_cntry_nm();
		}
		if ($trnspt_nm.equalsIgnoreCase(name)) {
			return trnspt_nm();
		}
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			return trnspt_cd();
		}
		if ($vssl_flght.equalsIgnoreCase(name)) {
			return vssl_flght();
		}
		if ($load_port_nm.equalsIgnoreCase(name)) {
			return load_port_nm();
		}
		if ($load_port_cd.equalsIgnoreCase(name)) {
			return load_port_cd();
		}
		if ($dschrg_port_nm.equalsIgnoreCase(name)) {
			return dschrg_port_nm();
		}
		if ($dschrg_port_cd.equalsIgnoreCase(name)) {
			return dschrg_port_cd();
		}
		if ($via_port_nm.equalsIgnoreCase(name)) {
			return via_port_nm();
		}
		if ($via_port_cd.equalsIgnoreCase(name)) {
			return via_port_cd();
		}
		if ($tterm_nm3.equalsIgnoreCase(name)) {
			return tterm_nm3();
		}
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			return tterm_cd3();
		}
		if ($tterm_rmrks3.equalsIgnoreCase(name)) {
			return tterm_rmrks3();
		}
		if ($lc_no.equalsIgnoreCase(name)) {
			return lc_no();
		}
		if ($lc_rmrks.equalsIgnoreCase(name)) {
			return lc_rmrks();
		}
		if ($bl_no.equalsIgnoreCase(name)) {
			return bl_no();
		}
		if ($bl_rmrks.equalsIgnoreCase(name)) {
			return bl_rmrks();
		}
		if ($case_mrk1.equalsIgnoreCase(name)) {
			return case_mrk1();
		}
		if ($case_mrk2.equalsIgnoreCase(name)) {
			return case_mrk2();
		}
		if ($case_mrk3.equalsIgnoreCase(name)) {
			return case_mrk3();
		}
		if ($case_mrk4.equalsIgnoreCase(name)) {
			return case_mrk4();
		}
		if ($case_mrk5.equalsIgnoreCase(name)) {
			return case_mrk5();
		}
		if ($case_mrk6.equalsIgnoreCase(name)) {
			return case_mrk6();
		}
		if ($iv_rmrks.equalsIgnoreCase(name)) {
			return iv_rmrks();
		}
		if ($co_addr1.equalsIgnoreCase(name)) {
			return co_addr1();
		}
		if ($co_addr2.equalsIgnoreCase(name)) {
			return co_addr2();
		}
		if ($co_addr3.equalsIgnoreCase(name)) {
			return co_addr3();
		}
		if ($co_addr4.equalsIgnoreCase(name)) {
			return co_addr4();
		}
		if ($co_addr.equalsIgnoreCase(name)) {
			return co_addr();
		}
		if ($co_cntry_nm.equalsIgnoreCase(name)) {
			return co_cntry_nm();
		}
		if ($iv_sub_char1.equalsIgnoreCase(name)) {
			return iv_sub_char1();
		}
		if ($iv_sub_char2.equalsIgnoreCase(name)) {
			return iv_sub_char2();
		}
		if ($iv_sub_char3.equalsIgnoreCase(name)) {
			return iv_sub_char3();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($tterm_nm1.equalsIgnoreCase(name)) {
			return tterm_nm1();
		}
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			return tterm_cd1();
		}
		if ($tterm_nm2.equalsIgnoreCase(name)) {
			return tterm_nm2();
		}
		if ($tterm_cd2.equalsIgnoreCase(name)) {
			return tterm_cd2();
		}
		if ($s_ncv_amt.equalsIgnoreCase(name)) {
			return s_ncv_amt();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($iv_rev.equalsIgnoreCase(name)) {
			return iv_rev();
		}
		if ($amt.equalsIgnoreCase(name)) {
			return amt();
		}
		if ($subttl2.equalsIgnoreCase(name)) {
			return subttl2();
		}
		if ($subttl3.equalsIgnoreCase(name)) {
			return subttl3();
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			return tax_amt();
		}
		if ($tax_subttl2.equalsIgnoreCase(name)) {
			return tax_subttl2();
		}
		if ($tax_subttl3.equalsIgnoreCase(name)) {
			return tax_subttl3();
		}
		if ($ncv_amt.equalsIgnoreCase(name)) {
			return ncv_amt();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($prnt_dt.equalsIgnoreCase(name)) {
			return prnt_dt();
		}
		if ($iv_dt.equalsIgnoreCase(name)) {
			return iv_dt();
		}
		if ($etd_dt.equalsIgnoreCase(name)) {
			return etd_dt();
		}
		if ($lc_dt.equalsIgnoreCase(name)) {
			return lc_dt();
		}
		if ($bl_dt.equalsIgnoreCase(name)) {
			return bl_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($base_unit_disp_flg.equalsIgnoreCase(name)) {
			return base_unit_disp_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($iv_mng_no.equalsIgnoreCase(name)) {
			return iv_mng_no();
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			return co_nm();
		}
		if ($co_str.equalsIgnoreCase(name)) {
			return co_str();
		}
		if ($co_tel.equalsIgnoreCase(name)) {
			return co_tel();
		}
		if ($co_fax.equalsIgnoreCase(name)) {
			return co_fax();
		}
		if ($ship_rqst_id_cd.equalsIgnoreCase(name)) {
			return ship_rqst_id_cd();
		}
		if ($ship_rqst_id_nm.equalsIgnoreCase(name)) {
			return ship_rqst_id_nm();
		}
		if ($ship_rqst_id_alt_nm1.equalsIgnoreCase(name)) {
			return ship_rqst_id_alt_nm1();
		}
		if ($ship_rqst_id_alt_nm2.equalsIgnoreCase(name)) {
			return ship_rqst_id_alt_nm2();
		}
		if ($ship_rqst_id_alt_nm3.equalsIgnoreCase(name)) {
			return ship_rqst_id_alt_nm3();
		}
		if ($ship_rqst_id_alt_nm4.equalsIgnoreCase(name)) {
			return ship_rqst_id_alt_nm4();
		}
		if ($ship_rqst_addr1.equalsIgnoreCase(name)) {
			return ship_rqst_addr1();
		}
		if ($ship_rqst_addr2.equalsIgnoreCase(name)) {
			return ship_rqst_addr2();
		}
		if ($ship_rqst_addr3.equalsIgnoreCase(name)) {
			return ship_rqst_addr3();
		}
		if ($ship_rqst_addr4.equalsIgnoreCase(name)) {
			return ship_rqst_addr4();
		}
		if ($ship_rqst_addr.equalsIgnoreCase(name)) {
			return ship_rqst_addr();
		}
		if ($ship_rqst_cntry_nm.equalsIgnoreCase(name)) {
			return ship_rqst_cntry_nm();
		}
		if ($dlv_id_typ.equalsIgnoreCase(name)) {
			return dlv_id_typ();
		}
		if ($dlv_id_cd.equalsIgnoreCase(name)) {
			return dlv_id_cd();
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
		if ($dlv_cntry_cd.equalsIgnoreCase(name)) {
			return dlv_cntry_cd();
		}
		if ($dlv_cntry_nm.equalsIgnoreCase(name)) {
			return dlv_cntry_nm();
		}
		if ($trnspt_nm.equalsIgnoreCase(name)) {
			return trnspt_nm();
		}
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			return trnspt_cd();
		}
		if ($vssl_flght.equalsIgnoreCase(name)) {
			return vssl_flght();
		}
		if ($load_port_nm.equalsIgnoreCase(name)) {
			return load_port_nm();
		}
		if ($load_port_cd.equalsIgnoreCase(name)) {
			return load_port_cd();
		}
		if ($dschrg_port_nm.equalsIgnoreCase(name)) {
			return dschrg_port_nm();
		}
		if ($dschrg_port_cd.equalsIgnoreCase(name)) {
			return dschrg_port_cd();
		}
		if ($via_port_nm.equalsIgnoreCase(name)) {
			return via_port_nm();
		}
		if ($via_port_cd.equalsIgnoreCase(name)) {
			return via_port_cd();
		}
		if ($tterm_nm3.equalsIgnoreCase(name)) {
			return tterm_nm3();
		}
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			return tterm_cd3();
		}
		if ($tterm_rmrks3.equalsIgnoreCase(name)) {
			return tterm_rmrks3();
		}
		if ($lc_no.equalsIgnoreCase(name)) {
			return lc_no();
		}
		if ($lc_rmrks.equalsIgnoreCase(name)) {
			return lc_rmrks();
		}
		if ($bl_no.equalsIgnoreCase(name)) {
			return bl_no();
		}
		if ($bl_rmrks.equalsIgnoreCase(name)) {
			return bl_rmrks();
		}
		if ($case_mrk1.equalsIgnoreCase(name)) {
			return case_mrk1();
		}
		if ($case_mrk2.equalsIgnoreCase(name)) {
			return case_mrk2();
		}
		if ($case_mrk3.equalsIgnoreCase(name)) {
			return case_mrk3();
		}
		if ($case_mrk4.equalsIgnoreCase(name)) {
			return case_mrk4();
		}
		if ($case_mrk5.equalsIgnoreCase(name)) {
			return case_mrk5();
		}
		if ($case_mrk6.equalsIgnoreCase(name)) {
			return case_mrk6();
		}
		if ($iv_rmrks.equalsIgnoreCase(name)) {
			return iv_rmrks();
		}
		if ($co_addr1.equalsIgnoreCase(name)) {
			return co_addr1();
		}
		if ($co_addr2.equalsIgnoreCase(name)) {
			return co_addr2();
		}
		if ($co_addr3.equalsIgnoreCase(name)) {
			return co_addr3();
		}
		if ($co_addr4.equalsIgnoreCase(name)) {
			return co_addr4();
		}
		if ($co_addr.equalsIgnoreCase(name)) {
			return co_addr();
		}
		if ($co_cntry_nm.equalsIgnoreCase(name)) {
			return co_cntry_nm();
		}
		if ($iv_sub_char1.equalsIgnoreCase(name)) {
			return iv_sub_char1();
		}
		if ($iv_sub_char2.equalsIgnoreCase(name)) {
			return iv_sub_char2();
		}
		if ($iv_sub_char3.equalsIgnoreCase(name)) {
			return iv_sub_char3();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($tterm_nm1.equalsIgnoreCase(name)) {
			return tterm_nm1();
		}
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			return tterm_cd1();
		}
		if ($tterm_nm2.equalsIgnoreCase(name)) {
			return tterm_nm2();
		}
		if ($tterm_cd2.equalsIgnoreCase(name)) {
			return tterm_cd2();
		}
		if ($s_ncv_amt.equalsIgnoreCase(name)) {
			return s_ncv_amt();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($iv_rev.equalsIgnoreCase(name)) {
			return iv_rev();
		}
		if ($amt.equalsIgnoreCase(name)) {
			return amt();
		}
		if ($subttl2.equalsIgnoreCase(name)) {
			return subttl2();
		}
		if ($subttl3.equalsIgnoreCase(name)) {
			return subttl3();
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			return tax_amt();
		}
		if ($tax_subttl2.equalsIgnoreCase(name)) {
			return tax_subttl2();
		}
		if ($tax_subttl3.equalsIgnoreCase(name)) {
			return tax_subttl3();
		}
		if ($ncv_amt.equalsIgnoreCase(name)) {
			return ncv_amt();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($prnt_dt.equalsIgnoreCase(name)) {
			return prnt_dt();
		}
		if ($iv_dt.equalsIgnoreCase(name)) {
			return iv_dt();
		}
		if ($etd_dt.equalsIgnoreCase(name)) {
			return etd_dt();
		}
		if ($lc_dt.equalsIgnoreCase(name)) {
			return lc_dt();
		}
		if ($bl_dt.equalsIgnoreCase(name)) {
			return bl_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($base_unit_disp_flg.equalsIgnoreCase(name)) {
			return base_unit_disp_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($iv_mng_no.equalsIgnoreCase(name)) {
			iv_mng_no(value);
			return;
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			co_nm(value);
			return;
		}
		if ($co_str.equalsIgnoreCase(name)) {
			co_str(value);
			return;
		}
		if ($co_tel.equalsIgnoreCase(name)) {
			co_tel(value);
			return;
		}
		if ($co_fax.equalsIgnoreCase(name)) {
			co_fax(value);
			return;
		}
		if ($ship_rqst_id_cd.equalsIgnoreCase(name)) {
			ship_rqst_id_cd(value);
			return;
		}
		if ($ship_rqst_id_nm.equalsIgnoreCase(name)) {
			ship_rqst_id_nm(value);
			return;
		}
		if ($ship_rqst_id_alt_nm1.equalsIgnoreCase(name)) {
			ship_rqst_id_alt_nm1(value);
			return;
		}
		if ($ship_rqst_id_alt_nm2.equalsIgnoreCase(name)) {
			ship_rqst_id_alt_nm2(value);
			return;
		}
		if ($ship_rqst_id_alt_nm3.equalsIgnoreCase(name)) {
			ship_rqst_id_alt_nm3(value);
			return;
		}
		if ($ship_rqst_id_alt_nm4.equalsIgnoreCase(name)) {
			ship_rqst_id_alt_nm4(value);
			return;
		}
		if ($ship_rqst_addr1.equalsIgnoreCase(name)) {
			ship_rqst_addr1(value);
			return;
		}
		if ($ship_rqst_addr2.equalsIgnoreCase(name)) {
			ship_rqst_addr2(value);
			return;
		}
		if ($ship_rqst_addr3.equalsIgnoreCase(name)) {
			ship_rqst_addr3(value);
			return;
		}
		if ($ship_rqst_addr4.equalsIgnoreCase(name)) {
			ship_rqst_addr4(value);
			return;
		}
		if ($ship_rqst_addr.equalsIgnoreCase(name)) {
			ship_rqst_addr(value);
			return;
		}
		if ($ship_rqst_cntry_nm.equalsIgnoreCase(name)) {
			ship_rqst_cntry_nm(value);
			return;
		}
		if ($dlv_id_typ.equalsIgnoreCase(name)) {
			dlv_id_typ(value);
			return;
		}
		if ($dlv_id_cd.equalsIgnoreCase(name)) {
			dlv_id_cd(value);
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
		if ($dlv_cntry_cd.equalsIgnoreCase(name)) {
			dlv_cntry_cd(value);
			return;
		}
		if ($dlv_cntry_nm.equalsIgnoreCase(name)) {
			dlv_cntry_nm(value);
			return;
		}
		if ($trnspt_nm.equalsIgnoreCase(name)) {
			trnspt_nm(value);
			return;
		}
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			trnspt_cd(value);
			return;
		}
		if ($vssl_flght.equalsIgnoreCase(name)) {
			vssl_flght(value);
			return;
		}
		if ($load_port_nm.equalsIgnoreCase(name)) {
			load_port_nm(value);
			return;
		}
		if ($load_port_cd.equalsIgnoreCase(name)) {
			load_port_cd(value);
			return;
		}
		if ($dschrg_port_nm.equalsIgnoreCase(name)) {
			dschrg_port_nm(value);
			return;
		}
		if ($dschrg_port_cd.equalsIgnoreCase(name)) {
			dschrg_port_cd(value);
			return;
		}
		if ($via_port_nm.equalsIgnoreCase(name)) {
			via_port_nm(value);
			return;
		}
		if ($via_port_cd.equalsIgnoreCase(name)) {
			via_port_cd(value);
			return;
		}
		if ($tterm_nm3.equalsIgnoreCase(name)) {
			tterm_nm3(value);
			return;
		}
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			tterm_cd3(value);
			return;
		}
		if ($tterm_rmrks3.equalsIgnoreCase(name)) {
			tterm_rmrks3(value);
			return;
		}
		if ($lc_no.equalsIgnoreCase(name)) {
			lc_no(value);
			return;
		}
		if ($lc_rmrks.equalsIgnoreCase(name)) {
			lc_rmrks(value);
			return;
		}
		if ($bl_no.equalsIgnoreCase(name)) {
			bl_no(value);
			return;
		}
		if ($bl_rmrks.equalsIgnoreCase(name)) {
			bl_rmrks(value);
			return;
		}
		if ($case_mrk1.equalsIgnoreCase(name)) {
			case_mrk1(value);
			return;
		}
		if ($case_mrk2.equalsIgnoreCase(name)) {
			case_mrk2(value);
			return;
		}
		if ($case_mrk3.equalsIgnoreCase(name)) {
			case_mrk3(value);
			return;
		}
		if ($case_mrk4.equalsIgnoreCase(name)) {
			case_mrk4(value);
			return;
		}
		if ($case_mrk5.equalsIgnoreCase(name)) {
			case_mrk5(value);
			return;
		}
		if ($case_mrk6.equalsIgnoreCase(name)) {
			case_mrk6(value);
			return;
		}
		if ($iv_rmrks.equalsIgnoreCase(name)) {
			iv_rmrks(value);
			return;
		}
		if ($co_addr1.equalsIgnoreCase(name)) {
			co_addr1(value);
			return;
		}
		if ($co_addr2.equalsIgnoreCase(name)) {
			co_addr2(value);
			return;
		}
		if ($co_addr3.equalsIgnoreCase(name)) {
			co_addr3(value);
			return;
		}
		if ($co_addr4.equalsIgnoreCase(name)) {
			co_addr4(value);
			return;
		}
		if ($co_addr.equalsIgnoreCase(name)) {
			co_addr(value);
			return;
		}
		if ($co_cntry_nm.equalsIgnoreCase(name)) {
			co_cntry_nm(value);
			return;
		}
		if ($iv_sub_char1.equalsIgnoreCase(name)) {
			iv_sub_char1(value);
			return;
		}
		if ($iv_sub_char2.equalsIgnoreCase(name)) {
			iv_sub_char2(value);
			return;
		}
		if ($iv_sub_char3.equalsIgnoreCase(name)) {
			iv_sub_char3(value);
			return;
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			cur_nm(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($tterm_nm1.equalsIgnoreCase(name)) {
			tterm_nm1(value);
			return;
		}
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			tterm_cd1(value);
			return;
		}
		if ($tterm_nm2.equalsIgnoreCase(name)) {
			tterm_nm2(value);
			return;
		}
		if ($tterm_cd2.equalsIgnoreCase(name)) {
			tterm_cd2(value);
			return;
		}
		if ($s_ncv_amt.equalsIgnoreCase(name)) {
			s_ncv_amt(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($iv_rev.equalsIgnoreCase(name)) {
			iv_rev(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($subttl2.equalsIgnoreCase(name)) {
			subttl2(value);
			return;
		}
		if ($subttl3.equalsIgnoreCase(name)) {
			subttl3(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($tax_subttl2.equalsIgnoreCase(name)) {
			tax_subttl2(value);
			return;
		}
		if ($tax_subttl3.equalsIgnoreCase(name)) {
			tax_subttl3(value);
			return;
		}
		if ($ncv_amt.equalsIgnoreCase(name)) {
			ncv_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($iv_rev.equalsIgnoreCase(name)) {
			iv_rev(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($subttl2.equalsIgnoreCase(name)) {
			subttl2(value);
			return;
		}
		if ($subttl3.equalsIgnoreCase(name)) {
			subttl3(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($tax_subttl2.equalsIgnoreCase(name)) {
			tax_subttl2(value);
			return;
		}
		if ($tax_subttl3.equalsIgnoreCase(name)) {
			tax_subttl3(value);
			return;
		}
		if ($ncv_amt.equalsIgnoreCase(name)) {
			ncv_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($iv_rev.equalsIgnoreCase(name)) {
			iv_rev(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($subttl2.equalsIgnoreCase(name)) {
			subttl2(value);
			return;
		}
		if ($subttl3.equalsIgnoreCase(name)) {
			subttl3(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($tax_subttl2.equalsIgnoreCase(name)) {
			tax_subttl2(value);
			return;
		}
		if ($tax_subttl3.equalsIgnoreCase(name)) {
			tax_subttl3(value);
			return;
		}
		if ($ncv_amt.equalsIgnoreCase(name)) {
			ncv_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($iv_rev.equalsIgnoreCase(name)) {
			iv_rev(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($subttl2.equalsIgnoreCase(name)) {
			subttl2(value);
			return;
		}
		if ($subttl3.equalsIgnoreCase(name)) {
			subttl3(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($tax_subttl2.equalsIgnoreCase(name)) {
			tax_subttl2(value);
			return;
		}
		if ($tax_subttl3.equalsIgnoreCase(name)) {
			tax_subttl3(value);
			return;
		}
		if ($ncv_amt.equalsIgnoreCase(name)) {
			ncv_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($iv_rev.equalsIgnoreCase(name)) {
			iv_rev(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($subttl2.equalsIgnoreCase(name)) {
			subttl2(value);
			return;
		}
		if ($subttl3.equalsIgnoreCase(name)) {
			subttl3(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($tax_subttl2.equalsIgnoreCase(name)) {
			tax_subttl2(value);
			return;
		}
		if ($tax_subttl3.equalsIgnoreCase(name)) {
			tax_subttl3(value);
			return;
		}
		if ($ncv_amt.equalsIgnoreCase(name)) {
			ncv_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($prnt_dt.equalsIgnoreCase(name)) {
			prnt_dt(value);
			return;
		}
		if ($iv_dt.equalsIgnoreCase(name)) {
			iv_dt(value);
			return;
		}
		if ($etd_dt.equalsIgnoreCase(name)) {
			etd_dt(value);
			return;
		}
		if ($lc_dt.equalsIgnoreCase(name)) {
			lc_dt(value);
			return;
		}
		if ($bl_dt.equalsIgnoreCase(name)) {
			bl_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($base_unit_disp_flg.equalsIgnoreCase(name)) {
			base_unit_disp_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($iv_mng_no.equalsIgnoreCase(name)) {
			iv_mng_no(value);
			return;
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			co_nm(value);
			return;
		}
		if ($co_str.equalsIgnoreCase(name)) {
			co_str(value);
			return;
		}
		if ($co_tel.equalsIgnoreCase(name)) {
			co_tel(value);
			return;
		}
		if ($co_fax.equalsIgnoreCase(name)) {
			co_fax(value);
			return;
		}
		if ($ship_rqst_id_cd.equalsIgnoreCase(name)) {
			ship_rqst_id_cd(value);
			return;
		}
		if ($ship_rqst_id_nm.equalsIgnoreCase(name)) {
			ship_rqst_id_nm(value);
			return;
		}
		if ($ship_rqst_id_alt_nm1.equalsIgnoreCase(name)) {
			ship_rqst_id_alt_nm1(value);
			return;
		}
		if ($ship_rqst_id_alt_nm2.equalsIgnoreCase(name)) {
			ship_rqst_id_alt_nm2(value);
			return;
		}
		if ($ship_rqst_id_alt_nm3.equalsIgnoreCase(name)) {
			ship_rqst_id_alt_nm3(value);
			return;
		}
		if ($ship_rqst_id_alt_nm4.equalsIgnoreCase(name)) {
			ship_rqst_id_alt_nm4(value);
			return;
		}
		if ($ship_rqst_addr1.equalsIgnoreCase(name)) {
			ship_rqst_addr1(value);
			return;
		}
		if ($ship_rqst_addr2.equalsIgnoreCase(name)) {
			ship_rqst_addr2(value);
			return;
		}
		if ($ship_rqst_addr3.equalsIgnoreCase(name)) {
			ship_rqst_addr3(value);
			return;
		}
		if ($ship_rqst_addr4.equalsIgnoreCase(name)) {
			ship_rqst_addr4(value);
			return;
		}
		if ($ship_rqst_addr.equalsIgnoreCase(name)) {
			ship_rqst_addr(value);
			return;
		}
		if ($ship_rqst_cntry_nm.equalsIgnoreCase(name)) {
			ship_rqst_cntry_nm(value);
			return;
		}
		if ($dlv_id_typ.equalsIgnoreCase(name)) {
			dlv_id_typ(value);
			return;
		}
		if ($dlv_id_cd.equalsIgnoreCase(name)) {
			dlv_id_cd(value);
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
		if ($dlv_cntry_cd.equalsIgnoreCase(name)) {
			dlv_cntry_cd(value);
			return;
		}
		if ($dlv_cntry_nm.equalsIgnoreCase(name)) {
			dlv_cntry_nm(value);
			return;
		}
		if ($trnspt_nm.equalsIgnoreCase(name)) {
			trnspt_nm(value);
			return;
		}
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			trnspt_cd(value);
			return;
		}
		if ($vssl_flght.equalsIgnoreCase(name)) {
			vssl_flght(value);
			return;
		}
		if ($load_port_nm.equalsIgnoreCase(name)) {
			load_port_nm(value);
			return;
		}
		if ($load_port_cd.equalsIgnoreCase(name)) {
			load_port_cd(value);
			return;
		}
		if ($dschrg_port_nm.equalsIgnoreCase(name)) {
			dschrg_port_nm(value);
			return;
		}
		if ($dschrg_port_cd.equalsIgnoreCase(name)) {
			dschrg_port_cd(value);
			return;
		}
		if ($via_port_nm.equalsIgnoreCase(name)) {
			via_port_nm(value);
			return;
		}
		if ($via_port_cd.equalsIgnoreCase(name)) {
			via_port_cd(value);
			return;
		}
		if ($tterm_nm3.equalsIgnoreCase(name)) {
			tterm_nm3(value);
			return;
		}
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			tterm_cd3(value);
			return;
		}
		if ($tterm_rmrks3.equalsIgnoreCase(name)) {
			tterm_rmrks3(value);
			return;
		}
		if ($lc_no.equalsIgnoreCase(name)) {
			lc_no(value);
			return;
		}
		if ($lc_rmrks.equalsIgnoreCase(name)) {
			lc_rmrks(value);
			return;
		}
		if ($bl_no.equalsIgnoreCase(name)) {
			bl_no(value);
			return;
		}
		if ($bl_rmrks.equalsIgnoreCase(name)) {
			bl_rmrks(value);
			return;
		}
		if ($case_mrk1.equalsIgnoreCase(name)) {
			case_mrk1(value);
			return;
		}
		if ($case_mrk2.equalsIgnoreCase(name)) {
			case_mrk2(value);
			return;
		}
		if ($case_mrk3.equalsIgnoreCase(name)) {
			case_mrk3(value);
			return;
		}
		if ($case_mrk4.equalsIgnoreCase(name)) {
			case_mrk4(value);
			return;
		}
		if ($case_mrk5.equalsIgnoreCase(name)) {
			case_mrk5(value);
			return;
		}
		if ($case_mrk6.equalsIgnoreCase(name)) {
			case_mrk6(value);
			return;
		}
		if ($iv_rmrks.equalsIgnoreCase(name)) {
			iv_rmrks(value);
			return;
		}
		if ($co_addr1.equalsIgnoreCase(name)) {
			co_addr1(value);
			return;
		}
		if ($co_addr2.equalsIgnoreCase(name)) {
			co_addr2(value);
			return;
		}
		if ($co_addr3.equalsIgnoreCase(name)) {
			co_addr3(value);
			return;
		}
		if ($co_addr4.equalsIgnoreCase(name)) {
			co_addr4(value);
			return;
		}
		if ($co_addr.equalsIgnoreCase(name)) {
			co_addr(value);
			return;
		}
		if ($co_cntry_nm.equalsIgnoreCase(name)) {
			co_cntry_nm(value);
			return;
		}
		if ($iv_sub_char1.equalsIgnoreCase(name)) {
			iv_sub_char1(value);
			return;
		}
		if ($iv_sub_char2.equalsIgnoreCase(name)) {
			iv_sub_char2(value);
			return;
		}
		if ($iv_sub_char3.equalsIgnoreCase(name)) {
			iv_sub_char3(value);
			return;
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			cur_nm(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($tterm_nm1.equalsIgnoreCase(name)) {
			tterm_nm1(value);
			return;
		}
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			tterm_cd1(value);
			return;
		}
		if ($tterm_nm2.equalsIgnoreCase(name)) {
			tterm_nm2(value);
			return;
		}
		if ($tterm_cd2.equalsIgnoreCase(name)) {
			tterm_cd2(value);
			return;
		}
		if ($s_ncv_amt.equalsIgnoreCase(name)) {
			s_ncv_amt(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($iv_rev.equalsIgnoreCase(name)) {
			iv_rev(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($subttl2.equalsIgnoreCase(name)) {
			subttl2(value);
			return;
		}
		if ($subttl3.equalsIgnoreCase(name)) {
			subttl3(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($tax_subttl2.equalsIgnoreCase(name)) {
			tax_subttl2(value);
			return;
		}
		if ($tax_subttl3.equalsIgnoreCase(name)) {
			tax_subttl3(value);
			return;
		}
		if ($ncv_amt.equalsIgnoreCase(name)) {
			ncv_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($iv_rev.equalsIgnoreCase(name)) {
			iv_rev(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($subttl2.equalsIgnoreCase(name)) {
			subttl2(value);
			return;
		}
		if ($subttl3.equalsIgnoreCase(name)) {
			subttl3(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($tax_subttl2.equalsIgnoreCase(name)) {
			tax_subttl2(value);
			return;
		}
		if ($tax_subttl3.equalsIgnoreCase(name)) {
			tax_subttl3(value);
			return;
		}
		if ($ncv_amt.equalsIgnoreCase(name)) {
			ncv_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($iv_rev.equalsIgnoreCase(name)) {
			iv_rev(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($subttl2.equalsIgnoreCase(name)) {
			subttl2(value);
			return;
		}
		if ($subttl3.equalsIgnoreCase(name)) {
			subttl3(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($tax_subttl2.equalsIgnoreCase(name)) {
			tax_subttl2(value);
			return;
		}
		if ($tax_subttl3.equalsIgnoreCase(name)) {
			tax_subttl3(value);
			return;
		}
		if ($ncv_amt.equalsIgnoreCase(name)) {
			ncv_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($iv_rev.equalsIgnoreCase(name)) {
			iv_rev(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($subttl2.equalsIgnoreCase(name)) {
			subttl2(value);
			return;
		}
		if ($subttl3.equalsIgnoreCase(name)) {
			subttl3(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($tax_subttl2.equalsIgnoreCase(name)) {
			tax_subttl2(value);
			return;
		}
		if ($tax_subttl3.equalsIgnoreCase(name)) {
			tax_subttl3(value);
			return;
		}
		if ($ncv_amt.equalsIgnoreCase(name)) {
			ncv_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($iv_rev.equalsIgnoreCase(name)) {
			iv_rev(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($subttl2.equalsIgnoreCase(name)) {
			subttl2(value);
			return;
		}
		if ($subttl3.equalsIgnoreCase(name)) {
			subttl3(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($tax_subttl2.equalsIgnoreCase(name)) {
			tax_subttl2(value);
			return;
		}
		if ($tax_subttl3.equalsIgnoreCase(name)) {
			tax_subttl3(value);
			return;
		}
		if ($ncv_amt.equalsIgnoreCase(name)) {
			ncv_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($prnt_dt.equalsIgnoreCase(name)) {
			prnt_dt(value);
			return;
		}
		if ($iv_dt.equalsIgnoreCase(name)) {
			iv_dt(value);
			return;
		}
		if ($etd_dt.equalsIgnoreCase(name)) {
			etd_dt(value);
			return;
		}
		if ($lc_dt.equalsIgnoreCase(name)) {
			lc_dt(value);
			return;
		}
		if ($bl_dt.equalsIgnoreCase(name)) {
			bl_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($base_unit_disp_flg.equalsIgnoreCase(name)) {
			base_unit_disp_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

