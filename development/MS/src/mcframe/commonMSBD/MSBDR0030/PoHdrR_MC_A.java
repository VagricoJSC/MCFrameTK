package mcframe.commonMSBD.MSBDR0030;

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
 * ブロック"PoHdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class PoHdrR_MC_A extends MCConstRow {

	/**
	 *  帳票ステータス区分名.<p>
	 *
	 */
	public static final String $rpt_sts_typ_nm = "rpt_sts_typ_nm";
	/**
	 *  帳票ステータス区分.<p>
	 *
	 */
	public static final String $rpt_sts_typ = "rpt_sts_typ";
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
	 *  発行日時.<p>
	 *
	 */
	public static final String $print_hm = "print_hm";
	/**
	 *  注文依頼日.<p>
	 *
	 */
	public static final String $po_dt = "po_dt";
	/**
	 *  発注先.<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	/**
	 *  発注先郵便番号.<p>
	 *
	 */
	public static final String $sppl_zip_cd = "sppl_zip_cd";
	/**
	 *  発注先住所１.<p>
	 *
	 */
	public static final String $sppl_addr1 = "sppl_addr1";
	/**
	 *  発注先住所２.<p>
	 *
	 */
	public static final String $sppl_addr2 = "sppl_addr2";
	/**
	 *  発注先住所３.<p>
	 *
	 */
	public static final String $sppl_addr3 = "sppl_addr3";
	/**
	 *  発注先住所４.<p>
	 *
	 */
	public static final String $sppl_addr4 = "sppl_addr4";
	/**
	 *  発注先住所.<p>
	 *
	 */
	public static final String $sppl_addr = "sppl_addr";
	/**
	 *  発注先名.<p>
	 *
	 */
	public static final String $sppl_nm = "sppl_nm";
	/**
	 *  発注先別名１.<p>
	 *
	 */
	public static final String $sppl_alt_nm1 = "sppl_alt_nm1";
	/**
	 *  発注先別名２.<p>
	 *
	 */
	public static final String $sppl_alt_nm2 = "sppl_alt_nm2";
	/**
	 *  発注先別名３.<p>
	 *
	 */
	public static final String $sppl_alt_nm3 = "sppl_alt_nm3";
	/**
	 *  発注先別名４.<p>
	 *
	 */
	public static final String $sppl_alt_nm4 = "sppl_alt_nm4";
	/**
	 *  発注先部署名.<p>
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
	 *  ＴＥＬ（発注先）.<p>
	 *
	 */
	public static final String $sppl_tel = "sppl_tel";
	/**
	 *  ＦＡＸ（発注先）.<p>
	 *
	 */
	public static final String $sppl_fax = "sppl_fax";
	/**
	 *  発注先国名.<p>
	 *
	 */
	public static final String $sppl_cntry_nm = "sppl_cntry_nm";
	/**
	 *  会社.<p>
	 *
	 */
	public static final String $co_cd = "co_cd";
	/**
	 *  会社名.<p>
	 *
	 */
	public static final String $co_nm = "co_nm";
	/**
	 *  部門郵便番号.<p>
	 *
	 */
	public static final String $dpt_zip_cd = "dpt_zip_cd";
	/**
	 *  部門住所１.<p>
	 *
	 */
	public static final String $dpt_addr1 = "dpt_addr1";
	/**
	 *  部門住所２.<p>
	 *
	 */
	public static final String $dpt_addr2 = "dpt_addr2";
	/**
	 *  部門住所３.<p>
	 *
	 */
	public static final String $dpt_addr3 = "dpt_addr3";
	/**
	 *  部門住所４.<p>
	 *
	 */
	public static final String $dpt_addr4 = "dpt_addr4";
	/**
	 *  部門住所.<p>
	 *
	 */
	public static final String $dpt_addr = "dpt_addr";
	/**
	 *  部門ＴＥＬ.<p>
	 *
	 */
	public static final String $dpt_tel = "dpt_tel";
	/**
	 *  部門ＦＡＸ.<p>
	 *
	 */
	public static final String $dpt_fax = "dpt_fax";
	/**
	 *  部門.<p>
	 *
	 */
	public static final String $purc_dpt_cd = "purc_dpt_cd";
	/**
	 *  部門名.<p>
	 *
	 */
	public static final String $purc_dpt_nm = "purc_dpt_nm";
	/**
	 *  部門国名.<p>
	 *
	 */
	public static final String $dpt_cntry_nm = "dpt_cntry_nm";
	/**
	 *  担当者.<p>
	 *
	 */
	public static final String $purc_usr_cd = "purc_usr_cd";
	/**
	 *  担当者名.<p>
	 *
	 */
	public static final String $purc_usr_nm = "purc_usr_nm";
	/**
	 *  取引.<p>
	 *
	 */
	public static final String $trd_cd = "trd_cd";
	/**
	 *  予備１.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	/**
	 *  予備２.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	/**
	 *  予備３.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";
	/**
	 *  合計金額.<p>
	 *
	 */
	public static final String $ttl_amt = "ttl_amt";
	/**
	 *  合計金額文字列.<p>
	 *
	 */
	public static final String $s_ttl_amt = "s_ttl_amt";
	/**
	 *  通貨.<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	/**
	 *  通貨名.<p>
	 *
	 */
	public static final String $trd_cur_nm = "trd_cur_nm";
	/**
	 *  合計税額.<p>
	 *
	 */
	public static final String $ttl_tax_amt = "ttl_tax_amt";
	/**
	 *  合計税額文字列.<p>
	 *
	 */
	public static final String $s_ttl_tax_amt = "s_ttl_tax_amt";
	/**
	 *  注文書表示.<p>
	 *
	 */
	public static final String $po_print_cd = "po_print_cd";
	/**
	 *  表示テキスト.<p>
	 *
	 */
	public static final String $po_print_txt = "po_print_txt";
	/**
	 *  表示テキスト１.<p>
	 *
	 */
	public static final String $po_print_txt1 = "po_print_txt1";
	/**
	 *  表示テキスト２.<p>
	 *
	 */
	public static final String $po_print_txt2 = "po_print_txt2";
	/**
	 *  表示テキスト３.<p>
	 *
	 */
	public static final String $po_print_txt3 = "po_print_txt3";
	/**
	 *  表示テキスト４.<p>
	 *
	 */
	public static final String $po_print_txt4 = "po_print_txt4";
	/**
	 *  表示テキスト５.<p>
	 *
	 */
	public static final String $po_print_txt5 = "po_print_txt5";
	/**
	 *  表示テキスト６.<p>
	 *
	 */
	public static final String $po_print_txt6 = "po_print_txt6";
	/**
	 *  発注訂正理由.<p>
	 *
	 */
	public static final String $crct_rsn_cd = "crct_rsn_cd";
	/**
	 *  訂正理由.<p>
	 *
	 */
	public static final String $po_crct_rsn_nm = "po_crct_rsn_nm";
	/**
	 *  訂正理由備考.<p>
	 *
	 */
	public static final String $po_crct_rsn_rmrks = "po_crct_rsn_rmrks";
	/**
	 *  正式注文書発行予定日.<p>
	 *
	 */
	public static final String $upd_po_print_schd_dt = "upd_po_print_schd_dt";
	/**
	 *  案件.<p>
	 *
	 */
	public static final String $wrk_no = "wrk_no";
	/**
	 *  案件名.<p>
	 *
	 */
	public static final String $wrk_nm = "wrk_nm";
	/**
	 *  取引条件１.<p>
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
	 *  取引条件２.<p>
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
	 *  取引条件３.<p>
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
	 *  備考.<p>
	 *
	 */
	public static final String $po_print_rmrks = "po_print_rmrks";


	public static final MCMeta rpt_sts_typ_nm_META = createCommonMeta($rpt_sts_typ_nm, mcframe.commonMA.meta.MA_META.RPT_STS_TYP_NM);
	public static final MCMeta rpt_sts_typ_META = createCommonMeta($rpt_sts_typ, mcframe.commonMA.meta.MA_META.RPT_STS_TYP);
	public static final MCMeta po_no_META = createCommonMeta($po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta po_rev_META = createCommonMeta($po_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta print_hm_META = createCommonMeta($print_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta po_dt_META = createCommonMeta($po_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_zip_cd_META = createCommonMeta($sppl_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta sppl_addr1_META = createCommonMeta($sppl_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta sppl_addr2_META = createCommonMeta($sppl_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta sppl_addr3_META = createCommonMeta($sppl_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta sppl_addr4_META = createCommonMeta($sppl_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta sppl_addr_META = createStringMeta($sppl_addr);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta sppl_alt_nm1_META = createCommonMeta($sppl_alt_nm1, mcframe.commonMA.meta.MA_META.BP_ALT_NM1);
	public static final MCMeta sppl_alt_nm2_META = createCommonMeta($sppl_alt_nm2, mcframe.commonMA.meta.MA_META.BP_ALT_NM2);
	public static final MCMeta sppl_alt_nm3_META = createCommonMeta($sppl_alt_nm3, mcframe.commonMA.meta.MA_META.BP_ALT_NM3);
	public static final MCMeta sppl_alt_nm4_META = createCommonMeta($sppl_alt_nm4, mcframe.commonMA.meta.MA_META.BP_ALT_NM4);
	public static final MCMeta sppl_cntct_dpt_META = createCommonMeta($sppl_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta sppl_cntct_psn_META = createCommonMeta($sppl_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta sppl_cntct_psn_title_META = createCommonMeta($sppl_cntct_psn_title, mcframe.commonMA.meta.MA_META.BP_PSN_TITLE);
	public static final MCMeta sppl_tel_META = createCommonMeta($sppl_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta sppl_fax_META = createCommonMeta($sppl_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta sppl_cntry_nm_META = createCommonMeta($sppl_cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta co_cd_META = createCommonMeta($co_cd, mcframe.commonMA.meta.MA_META.CO_CD);
	public static final MCMeta co_nm_META = createCommonMeta($co_nm, mcframe.commonMA.meta.MA_META.CO_NM);
	public static final MCMeta dpt_zip_cd_META = createCommonMeta($dpt_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta dpt_addr1_META = createCommonMeta($dpt_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta dpt_addr2_META = createCommonMeta($dpt_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta dpt_addr3_META = createCommonMeta($dpt_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta dpt_addr4_META = createCommonMeta($dpt_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta dpt_addr_META = createStringMeta($dpt_addr);
	public static final MCMeta dpt_tel_META = createCommonMeta($dpt_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta dpt_fax_META = createCommonMeta($dpt_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta purc_dpt_cd_META = createCommonMeta($purc_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta purc_dpt_nm_META = createCommonMeta($purc_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta dpt_cntry_nm_META = createCommonMeta($dpt_cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta purc_usr_cd_META = createCommonMeta($purc_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta purc_usr_nm_META = createCommonMeta($purc_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.PO_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.PO_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.PO_SUB_CHAR3);
	public static final MCMeta ttl_amt_META = createCommonMeta($ttl_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_ttl_amt_META = createStringMeta($s_ttl_amt);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta ttl_tax_amt_META = createCommonMeta($ttl_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_ttl_tax_amt_META = createStringMeta($s_ttl_tax_amt);
	public static final MCMeta po_print_cd_META = createCommonMeta($po_print_cd, mcframe.commonMA.meta.MA_META.PO_PRINT_CD);
	public static final MCMeta po_print_txt_META = createCommonMeta($po_print_txt, mcframe.commonMA.meta.MA_META.PO_PRINT_NM);
	public static final MCMeta po_print_txt1_META = createCommonMeta($po_print_txt1, mcframe.commonMA.meta.MA_META.PO_PRINT_NM);
	public static final MCMeta po_print_txt2_META = createCommonMeta($po_print_txt2, mcframe.commonMA.meta.MA_META.PO_PRINT_NM);
	public static final MCMeta po_print_txt3_META = createCommonMeta($po_print_txt3, mcframe.commonMA.meta.MA_META.PO_PRINT_NM);
	public static final MCMeta po_print_txt4_META = createCommonMeta($po_print_txt4, mcframe.commonMA.meta.MA_META.PO_PRINT_NM);
	public static final MCMeta po_print_txt5_META = createCommonMeta($po_print_txt5, mcframe.commonMA.meta.MA_META.PO_PRINT_NM);
	public static final MCMeta po_print_txt6_META = createCommonMeta($po_print_txt6, mcframe.commonMA.meta.MA_META.PO_PRINT_NM);
	public static final MCMeta crct_rsn_cd_META = createCommonMeta($crct_rsn_cd, mcframe.commonMS.meta.MS_META.PO_CRCT_RSN_CD);
	public static final MCMeta po_crct_rsn_nm_META = createCommonMeta($po_crct_rsn_nm, mcframe.commonMS.meta.MS_META.PO_CRCT_RSN_NM);
	public static final MCMeta po_crct_rsn_rmrks_META = createCommonMeta($po_crct_rsn_rmrks, mcframe.commonMS.meta.MS_META.PO_CRCT_RSN_RMRKS);
	public static final MCMeta upd_po_print_schd_dt_META = createCommonMeta($upd_po_print_schd_dt, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta tterm_cd1_META = createCommonMeta($tterm_cd1, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_nm1_META = createCommonMeta($tterm_nm1, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta tterm_rmrks1_META = createCommonMeta($tterm_rmrks1, mcframe.commonMS.meta.MS_META.TTERM_RMRKS1);
	public static final MCMeta tterm_cd2_META = createCommonMeta($tterm_cd2, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_nm2_META = createCommonMeta($tterm_nm2, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta tterm_rmrks2_META = createCommonMeta($tterm_rmrks2, mcframe.commonMS.meta.MS_META.TTERM_RMRKS2);
	public static final MCMeta tterm_cd3_META = createCommonMeta($tterm_cd3, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_nm3_META = createCommonMeta($tterm_nm3, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta tterm_rmrks3_META = createCommonMeta($tterm_rmrks3, mcframe.commonMS.meta.MS_META.TTERM_RMRKS3);
	public static final MCMeta po_print_rmrks_META = createCommonMeta($po_print_rmrks, mcframe.commonMS.meta.MS_META.PO_PRINT_RMRKS);

	protected static final ConstMetaList<PoHdrR> constMetas = new ConstMetaList<PoHdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			rpt_sts_typ_nm_META,
			rpt_sts_typ_META,
			po_no_META,
			po_rev_META,
			print_hm_META,
			po_dt_META,
			sppl_cd_META,
			sppl_zip_cd_META,
			sppl_addr1_META,
			sppl_addr2_META,
			sppl_addr3_META,
			sppl_addr4_META,
			sppl_addr_META,
			sppl_nm_META,
			sppl_alt_nm1_META,
			sppl_alt_nm2_META,
			sppl_alt_nm3_META,
			sppl_alt_nm4_META,
			sppl_cntct_dpt_META,
			sppl_cntct_psn_META,
			sppl_cntct_psn_title_META,
			sppl_tel_META,
			sppl_fax_META,
			sppl_cntry_nm_META,
			co_cd_META,
			co_nm_META,
			dpt_zip_cd_META,
			dpt_addr1_META,
			dpt_addr2_META,
			dpt_addr3_META,
			dpt_addr4_META,
			dpt_addr_META,
			dpt_tel_META,
			dpt_fax_META,
			purc_dpt_cd_META,
			purc_dpt_nm_META,
			dpt_cntry_nm_META,
			purc_usr_cd_META,
			purc_usr_nm_META,
			trd_cd_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			ttl_amt_META,
			s_ttl_amt_META,
			trd_cur_cd_META,
			trd_cur_nm_META,
			ttl_tax_amt_META,
			s_ttl_tax_amt_META,
			po_print_cd_META,
			po_print_txt_META,
			po_print_txt1_META,
			po_print_txt2_META,
			po_print_txt3_META,
			po_print_txt4_META,
			po_print_txt5_META,
			po_print_txt6_META,
			crct_rsn_cd_META,
			po_crct_rsn_nm_META,
			po_crct_rsn_rmrks_META,
			upd_po_print_schd_dt_META,
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
			po_print_rmrks_META
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
	protected PoHdrR_MC_A(ConstMetaList<? extends PoHdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PoHdrR clone() {
		return (PoHdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PoHdrR createInstance() {
		return (PoHdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PoHdrR getValues(String... names) {
		return (PoHdrR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  帳票ステータス区分名.<p>
	 *
	 */
	public String rpt_sts_typ_nm() {
		return getConstString(offset + 0, $rpt_sts_typ_nm);
	}

	/**
	 *  帳票ステータス区分名.<p>
	 *
	 */
	public void rpt_sts_typ_nm(String value) {
		setConstString(offset + 0, $rpt_sts_typ_nm, value);
	}


	/**
	 *  帳票ステータス区分.<p>
	 *
	 */
	public String rpt_sts_typ() {
		return getConstString(offset + 1, $rpt_sts_typ);
	}

	/**
	 *  帳票ステータス区分.<p>
	 *
	 */
	public void rpt_sts_typ(String value) {
		setConstString(offset + 1, $rpt_sts_typ, value);
	}


	/**
	 *  発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 2, $po_no);
	}

	/**
	 *  発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 2, $po_no, value);
	}


	/**
	 *  発注改訂番号.<p>
	 *
	 */
	public MCNumber po_rev() {
		return getConstNumber(offset + 3, $po_rev);
	}

	/**
	 *  発注改訂番号.<p>
	 *
	 */
	public void po_rev(MCNumber value) {
		setConstNumber(offset + 3, $po_rev, value);
	}

	/**
	 *  発注改訂番号.<p>
	 *
	 */
	public void po_rev(int value) {
		setConstNumber(offset + 3, $po_rev, value);
	}

	/**
	 *  発注改訂番号.<p>
	 *
	 */
	public void po_rev(long value) {
		setConstNumber(offset + 3, $po_rev, value);
	}

	/**
	 *  発注改訂番号.<p>
	 *
	 */
	public void po_rev(float value) {
		setConstNumber(offset + 3, $po_rev, value);
	}

	/**
	 *  発注改訂番号.<p>
	 *
	 */
	public void po_rev(double value) {
		setConstNumber(offset + 3, $po_rev, value);
	}


	/**
	 *  発行日時.<p>
	 *
	 */
	public MCDate print_hm() {
		return getConstDate(offset + 4, $print_hm);
	}

	/**
	 *  発行日時.<p>
	 *
	 */
	public void print_hm(MCDate value) {
		setConstDate(offset + 4, $print_hm, value);
	}


	/**
	 *  注文依頼日.<p>
	 *
	 */
	public MCDate po_dt() {
		return getConstDate(offset + 5, $po_dt);
	}

	/**
	 *  注文依頼日.<p>
	 *
	 */
	public void po_dt(MCDate value) {
		setConstDate(offset + 5, $po_dt, value);
	}


	/**
	 *  発注先.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 6, $sppl_cd);
	}

	/**
	 *  発注先.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 6, $sppl_cd, value);
	}


	/**
	 *  発注先郵便番号.<p>
	 *
	 */
	public String sppl_zip_cd() {
		return getConstString(offset + 7, $sppl_zip_cd);
	}

	/**
	 *  発注先郵便番号.<p>
	 *
	 */
	public void sppl_zip_cd(String value) {
		setConstString(offset + 7, $sppl_zip_cd, value);
	}


	/**
	 *  発注先住所１.<p>
	 *
	 */
	public String sppl_addr1() {
		return getConstString(offset + 8, $sppl_addr1);
	}

	/**
	 *  発注先住所１.<p>
	 *
	 */
	public void sppl_addr1(String value) {
		setConstString(offset + 8, $sppl_addr1, value);
	}


	/**
	 *  発注先住所２.<p>
	 *
	 */
	public String sppl_addr2() {
		return getConstString(offset + 9, $sppl_addr2);
	}

	/**
	 *  発注先住所２.<p>
	 *
	 */
	public void sppl_addr2(String value) {
		setConstString(offset + 9, $sppl_addr2, value);
	}


	/**
	 *  発注先住所３.<p>
	 *
	 */
	public String sppl_addr3() {
		return getConstString(offset + 10, $sppl_addr3);
	}

	/**
	 *  発注先住所３.<p>
	 *
	 */
	public void sppl_addr3(String value) {
		setConstString(offset + 10, $sppl_addr3, value);
	}


	/**
	 *  発注先住所４.<p>
	 *
	 */
	public String sppl_addr4() {
		return getConstString(offset + 11, $sppl_addr4);
	}

	/**
	 *  発注先住所４.<p>
	 *
	 */
	public void sppl_addr4(String value) {
		setConstString(offset + 11, $sppl_addr4, value);
	}


	/**
	 *  発注先住所.<p>
	 *
	 */
	public String sppl_addr() {
		return getConstString(offset + 12, $sppl_addr);
	}

	/**
	 *  発注先住所.<p>
	 *
	 */
	public void sppl_addr(String value) {
		setConstString(offset + 12, $sppl_addr, value);
	}


	/**
	 *  発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 13, $sppl_nm);
	}

	/**
	 *  発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 13, $sppl_nm, value);
	}


	/**
	 *  発注先別名１.<p>
	 *
	 */
	public String sppl_alt_nm1() {
		return getConstString(offset + 14, $sppl_alt_nm1);
	}

	/**
	 *  発注先別名１.<p>
	 *
	 */
	public void sppl_alt_nm1(String value) {
		setConstString(offset + 14, $sppl_alt_nm1, value);
	}


	/**
	 *  発注先別名２.<p>
	 *
	 */
	public String sppl_alt_nm2() {
		return getConstString(offset + 15, $sppl_alt_nm2);
	}

	/**
	 *  発注先別名２.<p>
	 *
	 */
	public void sppl_alt_nm2(String value) {
		setConstString(offset + 15, $sppl_alt_nm2, value);
	}


	/**
	 *  発注先別名３.<p>
	 *
	 */
	public String sppl_alt_nm3() {
		return getConstString(offset + 16, $sppl_alt_nm3);
	}

	/**
	 *  発注先別名３.<p>
	 *
	 */
	public void sppl_alt_nm3(String value) {
		setConstString(offset + 16, $sppl_alt_nm3, value);
	}


	/**
	 *  発注先別名４.<p>
	 *
	 */
	public String sppl_alt_nm4() {
		return getConstString(offset + 17, $sppl_alt_nm4);
	}

	/**
	 *  発注先別名４.<p>
	 *
	 */
	public void sppl_alt_nm4(String value) {
		setConstString(offset + 17, $sppl_alt_nm4, value);
	}


	/**
	 *  発注先部署名.<p>
	 *
	 */
	public String sppl_cntct_dpt() {
		return getConstString(offset + 18, $sppl_cntct_dpt);
	}

	/**
	 *  発注先部署名.<p>
	 *
	 */
	public void sppl_cntct_dpt(String value) {
		setConstString(offset + 18, $sppl_cntct_dpt, value);
	}


	/**
	 *  発注先担当者.<p>
	 *
	 */
	public String sppl_cntct_psn() {
		return getConstString(offset + 19, $sppl_cntct_psn);
	}

	/**
	 *  発注先担当者.<p>
	 *
	 */
	public void sppl_cntct_psn(String value) {
		setConstString(offset + 19, $sppl_cntct_psn, value);
	}


	/**
	 *  発注先担当者敬称.<p>
	 *
	 */
	public String sppl_cntct_psn_title() {
		return getConstString(offset + 20, $sppl_cntct_psn_title);
	}

	/**
	 *  発注先担当者敬称.<p>
	 *
	 */
	public void sppl_cntct_psn_title(String value) {
		setConstString(offset + 20, $sppl_cntct_psn_title, value);
	}


	/**
	 *  ＴＥＬ（発注先）.<p>
	 *
	 */
	public String sppl_tel() {
		return getConstString(offset + 21, $sppl_tel);
	}

	/**
	 *  ＴＥＬ（発注先）.<p>
	 *
	 */
	public void sppl_tel(String value) {
		setConstString(offset + 21, $sppl_tel, value);
	}


	/**
	 *  ＦＡＸ（発注先）.<p>
	 *
	 */
	public String sppl_fax() {
		return getConstString(offset + 22, $sppl_fax);
	}

	/**
	 *  ＦＡＸ（発注先）.<p>
	 *
	 */
	public void sppl_fax(String value) {
		setConstString(offset + 22, $sppl_fax, value);
	}


	/**
	 *  発注先国名.<p>
	 *
	 */
	public String sppl_cntry_nm() {
		return getConstString(offset + 23, $sppl_cntry_nm);
	}

	/**
	 *  発注先国名.<p>
	 *
	 */
	public void sppl_cntry_nm(String value) {
		setConstString(offset + 23, $sppl_cntry_nm, value);
	}


	/**
	 *  会社.<p>
	 *
	 */
	public String co_cd() {
		return getConstString(offset + 24, $co_cd);
	}

	/**
	 *  会社.<p>
	 *
	 */
	public void co_cd(String value) {
		setConstString(offset + 24, $co_cd, value);
	}


	/**
	 *  会社名.<p>
	 *
	 */
	public String co_nm() {
		return getConstString(offset + 25, $co_nm);
	}

	/**
	 *  会社名.<p>
	 *
	 */
	public void co_nm(String value) {
		setConstString(offset + 25, $co_nm, value);
	}


	/**
	 *  部門郵便番号.<p>
	 *
	 */
	public String dpt_zip_cd() {
		return getConstString(offset + 26, $dpt_zip_cd);
	}

	/**
	 *  部門郵便番号.<p>
	 *
	 */
	public void dpt_zip_cd(String value) {
		setConstString(offset + 26, $dpt_zip_cd, value);
	}


	/**
	 *  部門住所１.<p>
	 *
	 */
	public String dpt_addr1() {
		return getConstString(offset + 27, $dpt_addr1);
	}

	/**
	 *  部門住所１.<p>
	 *
	 */
	public void dpt_addr1(String value) {
		setConstString(offset + 27, $dpt_addr1, value);
	}


	/**
	 *  部門住所２.<p>
	 *
	 */
	public String dpt_addr2() {
		return getConstString(offset + 28, $dpt_addr2);
	}

	/**
	 *  部門住所２.<p>
	 *
	 */
	public void dpt_addr2(String value) {
		setConstString(offset + 28, $dpt_addr2, value);
	}


	/**
	 *  部門住所３.<p>
	 *
	 */
	public String dpt_addr3() {
		return getConstString(offset + 29, $dpt_addr3);
	}

	/**
	 *  部門住所３.<p>
	 *
	 */
	public void dpt_addr3(String value) {
		setConstString(offset + 29, $dpt_addr3, value);
	}


	/**
	 *  部門住所４.<p>
	 *
	 */
	public String dpt_addr4() {
		return getConstString(offset + 30, $dpt_addr4);
	}

	/**
	 *  部門住所４.<p>
	 *
	 */
	public void dpt_addr4(String value) {
		setConstString(offset + 30, $dpt_addr4, value);
	}


	/**
	 *  部門住所.<p>
	 *
	 */
	public String dpt_addr() {
		return getConstString(offset + 31, $dpt_addr);
	}

	/**
	 *  部門住所.<p>
	 *
	 */
	public void dpt_addr(String value) {
		setConstString(offset + 31, $dpt_addr, value);
	}


	/**
	 *  部門ＴＥＬ.<p>
	 *
	 */
	public String dpt_tel() {
		return getConstString(offset + 32, $dpt_tel);
	}

	/**
	 *  部門ＴＥＬ.<p>
	 *
	 */
	public void dpt_tel(String value) {
		setConstString(offset + 32, $dpt_tel, value);
	}


	/**
	 *  部門ＦＡＸ.<p>
	 *
	 */
	public String dpt_fax() {
		return getConstString(offset + 33, $dpt_fax);
	}

	/**
	 *  部門ＦＡＸ.<p>
	 *
	 */
	public void dpt_fax(String value) {
		setConstString(offset + 33, $dpt_fax, value);
	}


	/**
	 *  部門.<p>
	 *
	 */
	public String purc_dpt_cd() {
		return getConstString(offset + 34, $purc_dpt_cd);
	}

	/**
	 *  部門.<p>
	 *
	 */
	public void purc_dpt_cd(String value) {
		setConstString(offset + 34, $purc_dpt_cd, value);
	}


	/**
	 *  部門名.<p>
	 *
	 */
	public String purc_dpt_nm() {
		return getConstString(offset + 35, $purc_dpt_nm);
	}

	/**
	 *  部門名.<p>
	 *
	 */
	public void purc_dpt_nm(String value) {
		setConstString(offset + 35, $purc_dpt_nm, value);
	}


	/**
	 *  部門国名.<p>
	 *
	 */
	public String dpt_cntry_nm() {
		return getConstString(offset + 36, $dpt_cntry_nm);
	}

	/**
	 *  部門国名.<p>
	 *
	 */
	public void dpt_cntry_nm(String value) {
		setConstString(offset + 36, $dpt_cntry_nm, value);
	}


	/**
	 *  担当者.<p>
	 *
	 */
	public String purc_usr_cd() {
		return getConstString(offset + 37, $purc_usr_cd);
	}

	/**
	 *  担当者.<p>
	 *
	 */
	public void purc_usr_cd(String value) {
		setConstString(offset + 37, $purc_usr_cd, value);
	}


	/**
	 *  担当者名.<p>
	 *
	 */
	public String purc_usr_nm() {
		return getConstString(offset + 38, $purc_usr_nm);
	}

	/**
	 *  担当者名.<p>
	 *
	 */
	public void purc_usr_nm(String value) {
		setConstString(offset + 38, $purc_usr_nm, value);
	}


	/**
	 *  取引.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 39, $trd_cd);
	}

	/**
	 *  取引.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 39, $trd_cd, value);
	}


	/**
	 *  予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 40, $sub_char1);
	}

	/**
	 *  予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 40, $sub_char1, value);
	}


	/**
	 *  予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 41, $sub_char2);
	}

	/**
	 *  予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 41, $sub_char2, value);
	}


	/**
	 *  予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 42, $sub_char3);
	}

	/**
	 *  予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 42, $sub_char3, value);
	}


	/**
	 *  合計金額.<p>
	 *
	 */
	public MCNumber ttl_amt() {
		return getConstNumber(offset + 43, $ttl_amt);
	}

	/**
	 *  合計金額.<p>
	 *
	 */
	public void ttl_amt(MCNumber value) {
		setConstNumber(offset + 43, $ttl_amt, value);
	}

	/**
	 *  合計金額.<p>
	 *
	 */
	public void ttl_amt(int value) {
		setConstNumber(offset + 43, $ttl_amt, value);
	}

	/**
	 *  合計金額.<p>
	 *
	 */
	public void ttl_amt(long value) {
		setConstNumber(offset + 43, $ttl_amt, value);
	}

	/**
	 *  合計金額.<p>
	 *
	 */
	public void ttl_amt(float value) {
		setConstNumber(offset + 43, $ttl_amt, value);
	}

	/**
	 *  合計金額.<p>
	 *
	 */
	public void ttl_amt(double value) {
		setConstNumber(offset + 43, $ttl_amt, value);
	}


	/**
	 *  合計金額文字列.<p>
	 *
	 */
	public String s_ttl_amt() {
		return getConstString(offset + 44, $s_ttl_amt);
	}

	/**
	 *  合計金額文字列.<p>
	 *
	 */
	public void s_ttl_amt(String value) {
		setConstString(offset + 44, $s_ttl_amt, value);
	}


	/**
	 *  通貨.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 45, $trd_cur_cd);
	}

	/**
	 *  通貨.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 45, $trd_cur_cd, value);
	}


	/**
	 *  通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 46, $trd_cur_nm);
	}

	/**
	 *  通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 46, $trd_cur_nm, value);
	}


	/**
	 *  合計税額.<p>
	 *
	 */
	public MCNumber ttl_tax_amt() {
		return getConstNumber(offset + 47, $ttl_tax_amt);
	}

	/**
	 *  合計税額.<p>
	 *
	 */
	public void ttl_tax_amt(MCNumber value) {
		setConstNumber(offset + 47, $ttl_tax_amt, value);
	}

	/**
	 *  合計税額.<p>
	 *
	 */
	public void ttl_tax_amt(int value) {
		setConstNumber(offset + 47, $ttl_tax_amt, value);
	}

	/**
	 *  合計税額.<p>
	 *
	 */
	public void ttl_tax_amt(long value) {
		setConstNumber(offset + 47, $ttl_tax_amt, value);
	}

	/**
	 *  合計税額.<p>
	 *
	 */
	public void ttl_tax_amt(float value) {
		setConstNumber(offset + 47, $ttl_tax_amt, value);
	}

	/**
	 *  合計税額.<p>
	 *
	 */
	public void ttl_tax_amt(double value) {
		setConstNumber(offset + 47, $ttl_tax_amt, value);
	}


	/**
	 *  合計税額文字列.<p>
	 *
	 */
	public String s_ttl_tax_amt() {
		return getConstString(offset + 48, $s_ttl_tax_amt);
	}

	/**
	 *  合計税額文字列.<p>
	 *
	 */
	public void s_ttl_tax_amt(String value) {
		setConstString(offset + 48, $s_ttl_tax_amt, value);
	}


	/**
	 *  注文書表示.<p>
	 *
	 */
	public String po_print_cd() {
		return getConstString(offset + 49, $po_print_cd);
	}

	/**
	 *  注文書表示.<p>
	 *
	 */
	public void po_print_cd(String value) {
		setConstString(offset + 49, $po_print_cd, value);
	}


	/**
	 *  表示テキスト.<p>
	 *
	 */
	public String po_print_txt() {
		return getConstString(offset + 50, $po_print_txt);
	}

	/**
	 *  表示テキスト.<p>
	 *
	 */
	public void po_print_txt(String value) {
		setConstString(offset + 50, $po_print_txt, value);
	}


	/**
	 *  表示テキスト１.<p>
	 *
	 */
	public String po_print_txt1() {
		return getConstString(offset + 51, $po_print_txt1);
	}

	/**
	 *  表示テキスト１.<p>
	 *
	 */
	public void po_print_txt1(String value) {
		setConstString(offset + 51, $po_print_txt1, value);
	}


	/**
	 *  表示テキスト２.<p>
	 *
	 */
	public String po_print_txt2() {
		return getConstString(offset + 52, $po_print_txt2);
	}

	/**
	 *  表示テキスト２.<p>
	 *
	 */
	public void po_print_txt2(String value) {
		setConstString(offset + 52, $po_print_txt2, value);
	}


	/**
	 *  表示テキスト３.<p>
	 *
	 */
	public String po_print_txt3() {
		return getConstString(offset + 53, $po_print_txt3);
	}

	/**
	 *  表示テキスト３.<p>
	 *
	 */
	public void po_print_txt3(String value) {
		setConstString(offset + 53, $po_print_txt3, value);
	}


	/**
	 *  表示テキスト４.<p>
	 *
	 */
	public String po_print_txt4() {
		return getConstString(offset + 54, $po_print_txt4);
	}

	/**
	 *  表示テキスト４.<p>
	 *
	 */
	public void po_print_txt4(String value) {
		setConstString(offset + 54, $po_print_txt4, value);
	}


	/**
	 *  表示テキスト５.<p>
	 *
	 */
	public String po_print_txt5() {
		return getConstString(offset + 55, $po_print_txt5);
	}

	/**
	 *  表示テキスト５.<p>
	 *
	 */
	public void po_print_txt5(String value) {
		setConstString(offset + 55, $po_print_txt5, value);
	}


	/**
	 *  表示テキスト６.<p>
	 *
	 */
	public String po_print_txt6() {
		return getConstString(offset + 56, $po_print_txt6);
	}

	/**
	 *  表示テキスト６.<p>
	 *
	 */
	public void po_print_txt6(String value) {
		setConstString(offset + 56, $po_print_txt6, value);
	}


	/**
	 *  発注訂正理由.<p>
	 *
	 */
	public String crct_rsn_cd() {
		return getConstString(offset + 57, $crct_rsn_cd);
	}

	/**
	 *  発注訂正理由.<p>
	 *
	 */
	public void crct_rsn_cd(String value) {
		setConstString(offset + 57, $crct_rsn_cd, value);
	}


	/**
	 *  訂正理由.<p>
	 *
	 */
	public String po_crct_rsn_nm() {
		return getConstString(offset + 58, $po_crct_rsn_nm);
	}

	/**
	 *  訂正理由.<p>
	 *
	 */
	public void po_crct_rsn_nm(String value) {
		setConstString(offset + 58, $po_crct_rsn_nm, value);
	}


	/**
	 *  訂正理由備考.<p>
	 *
	 */
	public String po_crct_rsn_rmrks() {
		return getConstString(offset + 59, $po_crct_rsn_rmrks);
	}

	/**
	 *  訂正理由備考.<p>
	 *
	 */
	public void po_crct_rsn_rmrks(String value) {
		setConstString(offset + 59, $po_crct_rsn_rmrks, value);
	}


	/**
	 *  正式注文書発行予定日.<p>
	 *
	 */
	public MCDate upd_po_print_schd_dt() {
		return getConstDate(offset + 60, $upd_po_print_schd_dt);
	}

	/**
	 *  正式注文書発行予定日.<p>
	 *
	 */
	public void upd_po_print_schd_dt(MCDate value) {
		setConstDate(offset + 60, $upd_po_print_schd_dt, value);
	}


	/**
	 *  案件.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 61, $wrk_no);
	}

	/**
	 *  案件.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 61, $wrk_no, value);
	}


	/**
	 *  案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 62, $wrk_nm);
	}

	/**
	 *  案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 62, $wrk_nm, value);
	}


	/**
	 *  取引条件１.<p>
	 *
	 */
	public String tterm_cd1() {
		return getConstString(offset + 63, $tterm_cd1);
	}

	/**
	 *  取引条件１.<p>
	 *
	 */
	public void tterm_cd1(String value) {
		setConstString(offset + 63, $tterm_cd1, value);
	}


	/**
	 *  取引条件名１.<p>
	 *
	 */
	public String tterm_nm1() {
		return getConstString(offset + 64, $tterm_nm1);
	}

	/**
	 *  取引条件名１.<p>
	 *
	 */
	public void tterm_nm1(String value) {
		setConstString(offset + 64, $tterm_nm1, value);
	}


	/**
	 *  取引条件備考１.<p>
	 *
	 */
	public String tterm_rmrks1() {
		return getConstString(offset + 65, $tterm_rmrks1);
	}

	/**
	 *  取引条件備考１.<p>
	 *
	 */
	public void tterm_rmrks1(String value) {
		setConstString(offset + 65, $tterm_rmrks1, value);
	}


	/**
	 *  取引条件２.<p>
	 *
	 */
	public String tterm_cd2() {
		return getConstString(offset + 66, $tterm_cd2);
	}

	/**
	 *  取引条件２.<p>
	 *
	 */
	public void tterm_cd2(String value) {
		setConstString(offset + 66, $tterm_cd2, value);
	}


	/**
	 *  取引条件名２.<p>
	 *
	 */
	public String tterm_nm2() {
		return getConstString(offset + 67, $tterm_nm2);
	}

	/**
	 *  取引条件名２.<p>
	 *
	 */
	public void tterm_nm2(String value) {
		setConstString(offset + 67, $tterm_nm2, value);
	}


	/**
	 *  取引条件備考２.<p>
	 *
	 */
	public String tterm_rmrks2() {
		return getConstString(offset + 68, $tterm_rmrks2);
	}

	/**
	 *  取引条件備考２.<p>
	 *
	 */
	public void tterm_rmrks2(String value) {
		setConstString(offset + 68, $tterm_rmrks2, value);
	}


	/**
	 *  取引条件３.<p>
	 *
	 */
	public String tterm_cd3() {
		return getConstString(offset + 69, $tterm_cd3);
	}

	/**
	 *  取引条件３.<p>
	 *
	 */
	public void tterm_cd3(String value) {
		setConstString(offset + 69, $tterm_cd3, value);
	}


	/**
	 *  取引条件名３.<p>
	 *
	 */
	public String tterm_nm3() {
		return getConstString(offset + 70, $tterm_nm3);
	}

	/**
	 *  取引条件名３.<p>
	 *
	 */
	public void tterm_nm3(String value) {
		setConstString(offset + 70, $tterm_nm3, value);
	}


	/**
	 *  取引条件備考３.<p>
	 *
	 */
	public String tterm_rmrks3() {
		return getConstString(offset + 71, $tterm_rmrks3);
	}

	/**
	 *  取引条件備考３.<p>
	 *
	 */
	public void tterm_rmrks3(String value) {
		setConstString(offset + 71, $tterm_rmrks3, value);
	}


	/**
	 *  備考.<p>
	 *
	 */
	public String po_print_rmrks() {
		return getConstString(offset + 72, $po_print_rmrks);
	}

	/**
	 *  備考.<p>
	 *
	 */
	public void po_print_rmrks(String value) {
		setConstString(offset + 72, $po_print_rmrks, value);
	}


	public String getString(String name) {
		if ($rpt_sts_typ_nm.equalsIgnoreCase(name)) {
			return rpt_sts_typ_nm();
		}
		if ($rpt_sts_typ.equalsIgnoreCase(name)) {
			return rpt_sts_typ();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_zip_cd.equalsIgnoreCase(name)) {
			return sppl_zip_cd();
		}
		if ($sppl_addr1.equalsIgnoreCase(name)) {
			return sppl_addr1();
		}
		if ($sppl_addr2.equalsIgnoreCase(name)) {
			return sppl_addr2();
		}
		if ($sppl_addr3.equalsIgnoreCase(name)) {
			return sppl_addr3();
		}
		if ($sppl_addr4.equalsIgnoreCase(name)) {
			return sppl_addr4();
		}
		if ($sppl_addr.equalsIgnoreCase(name)) {
			return sppl_addr();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($sppl_alt_nm1.equalsIgnoreCase(name)) {
			return sppl_alt_nm1();
		}
		if ($sppl_alt_nm2.equalsIgnoreCase(name)) {
			return sppl_alt_nm2();
		}
		if ($sppl_alt_nm3.equalsIgnoreCase(name)) {
			return sppl_alt_nm3();
		}
		if ($sppl_alt_nm4.equalsIgnoreCase(name)) {
			return sppl_alt_nm4();
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
		if ($sppl_tel.equalsIgnoreCase(name)) {
			return sppl_tel();
		}
		if ($sppl_fax.equalsIgnoreCase(name)) {
			return sppl_fax();
		}
		if ($sppl_cntry_nm.equalsIgnoreCase(name)) {
			return sppl_cntry_nm();
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			return co_nm();
		}
		if ($dpt_zip_cd.equalsIgnoreCase(name)) {
			return dpt_zip_cd();
		}
		if ($dpt_addr1.equalsIgnoreCase(name)) {
			return dpt_addr1();
		}
		if ($dpt_addr2.equalsIgnoreCase(name)) {
			return dpt_addr2();
		}
		if ($dpt_addr3.equalsIgnoreCase(name)) {
			return dpt_addr3();
		}
		if ($dpt_addr4.equalsIgnoreCase(name)) {
			return dpt_addr4();
		}
		if ($dpt_addr.equalsIgnoreCase(name)) {
			return dpt_addr();
		}
		if ($dpt_tel.equalsIgnoreCase(name)) {
			return dpt_tel();
		}
		if ($dpt_fax.equalsIgnoreCase(name)) {
			return dpt_fax();
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			return purc_dpt_cd();
		}
		if ($purc_dpt_nm.equalsIgnoreCase(name)) {
			return purc_dpt_nm();
		}
		if ($dpt_cntry_nm.equalsIgnoreCase(name)) {
			return dpt_cntry_nm();
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			return purc_usr_cd();
		}
		if ($purc_usr_nm.equalsIgnoreCase(name)) {
			return purc_usr_nm();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
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
		if ($s_ttl_amt.equalsIgnoreCase(name)) {
			return s_ttl_amt();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($s_ttl_tax_amt.equalsIgnoreCase(name)) {
			return s_ttl_tax_amt();
		}
		if ($po_print_cd.equalsIgnoreCase(name)) {
			return po_print_cd();
		}
		if ($po_print_txt.equalsIgnoreCase(name)) {
			return po_print_txt();
		}
		if ($po_print_txt1.equalsIgnoreCase(name)) {
			return po_print_txt1();
		}
		if ($po_print_txt2.equalsIgnoreCase(name)) {
			return po_print_txt2();
		}
		if ($po_print_txt3.equalsIgnoreCase(name)) {
			return po_print_txt3();
		}
		if ($po_print_txt4.equalsIgnoreCase(name)) {
			return po_print_txt4();
		}
		if ($po_print_txt5.equalsIgnoreCase(name)) {
			return po_print_txt5();
		}
		if ($po_print_txt6.equalsIgnoreCase(name)) {
			return po_print_txt6();
		}
		if ($crct_rsn_cd.equalsIgnoreCase(name)) {
			return crct_rsn_cd();
		}
		if ($po_crct_rsn_nm.equalsIgnoreCase(name)) {
			return po_crct_rsn_nm();
		}
		if ($po_crct_rsn_rmrks.equalsIgnoreCase(name)) {
			return po_crct_rsn_rmrks();
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
		if ($po_print_rmrks.equalsIgnoreCase(name)) {
			return po_print_rmrks();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($po_rev.equalsIgnoreCase(name)) {
			return po_rev();
		}
		if ($ttl_amt.equalsIgnoreCase(name)) {
			return ttl_amt();
		}
		if ($ttl_tax_amt.equalsIgnoreCase(name)) {
			return ttl_tax_amt();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($print_hm.equalsIgnoreCase(name)) {
			return print_hm();
		}
		if ($po_dt.equalsIgnoreCase(name)) {
			return po_dt();
		}
		if ($upd_po_print_schd_dt.equalsIgnoreCase(name)) {
			return upd_po_print_schd_dt();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($rpt_sts_typ_nm.equalsIgnoreCase(name)) {
			return rpt_sts_typ_nm();
		}
		if ($rpt_sts_typ.equalsIgnoreCase(name)) {
			return rpt_sts_typ();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_zip_cd.equalsIgnoreCase(name)) {
			return sppl_zip_cd();
		}
		if ($sppl_addr1.equalsIgnoreCase(name)) {
			return sppl_addr1();
		}
		if ($sppl_addr2.equalsIgnoreCase(name)) {
			return sppl_addr2();
		}
		if ($sppl_addr3.equalsIgnoreCase(name)) {
			return sppl_addr3();
		}
		if ($sppl_addr4.equalsIgnoreCase(name)) {
			return sppl_addr4();
		}
		if ($sppl_addr.equalsIgnoreCase(name)) {
			return sppl_addr();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($sppl_alt_nm1.equalsIgnoreCase(name)) {
			return sppl_alt_nm1();
		}
		if ($sppl_alt_nm2.equalsIgnoreCase(name)) {
			return sppl_alt_nm2();
		}
		if ($sppl_alt_nm3.equalsIgnoreCase(name)) {
			return sppl_alt_nm3();
		}
		if ($sppl_alt_nm4.equalsIgnoreCase(name)) {
			return sppl_alt_nm4();
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
		if ($sppl_tel.equalsIgnoreCase(name)) {
			return sppl_tel();
		}
		if ($sppl_fax.equalsIgnoreCase(name)) {
			return sppl_fax();
		}
		if ($sppl_cntry_nm.equalsIgnoreCase(name)) {
			return sppl_cntry_nm();
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			return co_nm();
		}
		if ($dpt_zip_cd.equalsIgnoreCase(name)) {
			return dpt_zip_cd();
		}
		if ($dpt_addr1.equalsIgnoreCase(name)) {
			return dpt_addr1();
		}
		if ($dpt_addr2.equalsIgnoreCase(name)) {
			return dpt_addr2();
		}
		if ($dpt_addr3.equalsIgnoreCase(name)) {
			return dpt_addr3();
		}
		if ($dpt_addr4.equalsIgnoreCase(name)) {
			return dpt_addr4();
		}
		if ($dpt_addr.equalsIgnoreCase(name)) {
			return dpt_addr();
		}
		if ($dpt_tel.equalsIgnoreCase(name)) {
			return dpt_tel();
		}
		if ($dpt_fax.equalsIgnoreCase(name)) {
			return dpt_fax();
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			return purc_dpt_cd();
		}
		if ($purc_dpt_nm.equalsIgnoreCase(name)) {
			return purc_dpt_nm();
		}
		if ($dpt_cntry_nm.equalsIgnoreCase(name)) {
			return dpt_cntry_nm();
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			return purc_usr_cd();
		}
		if ($purc_usr_nm.equalsIgnoreCase(name)) {
			return purc_usr_nm();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
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
		if ($s_ttl_amt.equalsIgnoreCase(name)) {
			return s_ttl_amt();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($s_ttl_tax_amt.equalsIgnoreCase(name)) {
			return s_ttl_tax_amt();
		}
		if ($po_print_cd.equalsIgnoreCase(name)) {
			return po_print_cd();
		}
		if ($po_print_txt.equalsIgnoreCase(name)) {
			return po_print_txt();
		}
		if ($po_print_txt1.equalsIgnoreCase(name)) {
			return po_print_txt1();
		}
		if ($po_print_txt2.equalsIgnoreCase(name)) {
			return po_print_txt2();
		}
		if ($po_print_txt3.equalsIgnoreCase(name)) {
			return po_print_txt3();
		}
		if ($po_print_txt4.equalsIgnoreCase(name)) {
			return po_print_txt4();
		}
		if ($po_print_txt5.equalsIgnoreCase(name)) {
			return po_print_txt5();
		}
		if ($po_print_txt6.equalsIgnoreCase(name)) {
			return po_print_txt6();
		}
		if ($crct_rsn_cd.equalsIgnoreCase(name)) {
			return crct_rsn_cd();
		}
		if ($po_crct_rsn_nm.equalsIgnoreCase(name)) {
			return po_crct_rsn_nm();
		}
		if ($po_crct_rsn_rmrks.equalsIgnoreCase(name)) {
			return po_crct_rsn_rmrks();
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
		if ($po_print_rmrks.equalsIgnoreCase(name)) {
			return po_print_rmrks();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($po_rev.equalsIgnoreCase(name)) {
			return po_rev();
		}
		if ($ttl_amt.equalsIgnoreCase(name)) {
			return ttl_amt();
		}
		if ($ttl_tax_amt.equalsIgnoreCase(name)) {
			return ttl_tax_amt();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($print_hm.equalsIgnoreCase(name)) {
			return print_hm();
		}
		if ($po_dt.equalsIgnoreCase(name)) {
			return po_dt();
		}
		if ($upd_po_print_schd_dt.equalsIgnoreCase(name)) {
			return upd_po_print_schd_dt();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($rpt_sts_typ_nm.equalsIgnoreCase(name)) {
			rpt_sts_typ_nm(value);
			return;
		}
		if ($rpt_sts_typ.equalsIgnoreCase(name)) {
			rpt_sts_typ(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_zip_cd.equalsIgnoreCase(name)) {
			sppl_zip_cd(value);
			return;
		}
		if ($sppl_addr1.equalsIgnoreCase(name)) {
			sppl_addr1(value);
			return;
		}
		if ($sppl_addr2.equalsIgnoreCase(name)) {
			sppl_addr2(value);
			return;
		}
		if ($sppl_addr3.equalsIgnoreCase(name)) {
			sppl_addr3(value);
			return;
		}
		if ($sppl_addr4.equalsIgnoreCase(name)) {
			sppl_addr4(value);
			return;
		}
		if ($sppl_addr.equalsIgnoreCase(name)) {
			sppl_addr(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($sppl_alt_nm1.equalsIgnoreCase(name)) {
			sppl_alt_nm1(value);
			return;
		}
		if ($sppl_alt_nm2.equalsIgnoreCase(name)) {
			sppl_alt_nm2(value);
			return;
		}
		if ($sppl_alt_nm3.equalsIgnoreCase(name)) {
			sppl_alt_nm3(value);
			return;
		}
		if ($sppl_alt_nm4.equalsIgnoreCase(name)) {
			sppl_alt_nm4(value);
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
		if ($sppl_tel.equalsIgnoreCase(name)) {
			sppl_tel(value);
			return;
		}
		if ($sppl_fax.equalsIgnoreCase(name)) {
			sppl_fax(value);
			return;
		}
		if ($sppl_cntry_nm.equalsIgnoreCase(name)) {
			sppl_cntry_nm(value);
			return;
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			co_nm(value);
			return;
		}
		if ($dpt_zip_cd.equalsIgnoreCase(name)) {
			dpt_zip_cd(value);
			return;
		}
		if ($dpt_addr1.equalsIgnoreCase(name)) {
			dpt_addr1(value);
			return;
		}
		if ($dpt_addr2.equalsIgnoreCase(name)) {
			dpt_addr2(value);
			return;
		}
		if ($dpt_addr3.equalsIgnoreCase(name)) {
			dpt_addr3(value);
			return;
		}
		if ($dpt_addr4.equalsIgnoreCase(name)) {
			dpt_addr4(value);
			return;
		}
		if ($dpt_addr.equalsIgnoreCase(name)) {
			dpt_addr(value);
			return;
		}
		if ($dpt_tel.equalsIgnoreCase(name)) {
			dpt_tel(value);
			return;
		}
		if ($dpt_fax.equalsIgnoreCase(name)) {
			dpt_fax(value);
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
		if ($dpt_cntry_nm.equalsIgnoreCase(name)) {
			dpt_cntry_nm(value);
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
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
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
		if ($s_ttl_amt.equalsIgnoreCase(name)) {
			s_ttl_amt(value);
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
		if ($s_ttl_tax_amt.equalsIgnoreCase(name)) {
			s_ttl_tax_amt(value);
			return;
		}
		if ($po_print_cd.equalsIgnoreCase(name)) {
			po_print_cd(value);
			return;
		}
		if ($po_print_txt.equalsIgnoreCase(name)) {
			po_print_txt(value);
			return;
		}
		if ($po_print_txt1.equalsIgnoreCase(name)) {
			po_print_txt1(value);
			return;
		}
		if ($po_print_txt2.equalsIgnoreCase(name)) {
			po_print_txt2(value);
			return;
		}
		if ($po_print_txt3.equalsIgnoreCase(name)) {
			po_print_txt3(value);
			return;
		}
		if ($po_print_txt4.equalsIgnoreCase(name)) {
			po_print_txt4(value);
			return;
		}
		if ($po_print_txt5.equalsIgnoreCase(name)) {
			po_print_txt5(value);
			return;
		}
		if ($po_print_txt6.equalsIgnoreCase(name)) {
			po_print_txt6(value);
			return;
		}
		if ($crct_rsn_cd.equalsIgnoreCase(name)) {
			crct_rsn_cd(value);
			return;
		}
		if ($po_crct_rsn_nm.equalsIgnoreCase(name)) {
			po_crct_rsn_nm(value);
			return;
		}
		if ($po_crct_rsn_rmrks.equalsIgnoreCase(name)) {
			po_crct_rsn_rmrks(value);
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
		if ($po_print_rmrks.equalsIgnoreCase(name)) {
			po_print_rmrks(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		if ($ttl_amt.equalsIgnoreCase(name)) {
			ttl_amt(value);
			return;
		}
		if ($ttl_tax_amt.equalsIgnoreCase(name)) {
			ttl_tax_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		if ($ttl_amt.equalsIgnoreCase(name)) {
			ttl_amt(value);
			return;
		}
		if ($ttl_tax_amt.equalsIgnoreCase(name)) {
			ttl_tax_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		if ($ttl_amt.equalsIgnoreCase(name)) {
			ttl_amt(value);
			return;
		}
		if ($ttl_tax_amt.equalsIgnoreCase(name)) {
			ttl_tax_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		if ($ttl_amt.equalsIgnoreCase(name)) {
			ttl_amt(value);
			return;
		}
		if ($ttl_tax_amt.equalsIgnoreCase(name)) {
			ttl_tax_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		if ($ttl_amt.equalsIgnoreCase(name)) {
			ttl_amt(value);
			return;
		}
		if ($ttl_tax_amt.equalsIgnoreCase(name)) {
			ttl_tax_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($print_hm.equalsIgnoreCase(name)) {
			print_hm(value);
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
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($rpt_sts_typ_nm.equalsIgnoreCase(name)) {
			rpt_sts_typ_nm(value);
			return;
		}
		if ($rpt_sts_typ.equalsIgnoreCase(name)) {
			rpt_sts_typ(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_zip_cd.equalsIgnoreCase(name)) {
			sppl_zip_cd(value);
			return;
		}
		if ($sppl_addr1.equalsIgnoreCase(name)) {
			sppl_addr1(value);
			return;
		}
		if ($sppl_addr2.equalsIgnoreCase(name)) {
			sppl_addr2(value);
			return;
		}
		if ($sppl_addr3.equalsIgnoreCase(name)) {
			sppl_addr3(value);
			return;
		}
		if ($sppl_addr4.equalsIgnoreCase(name)) {
			sppl_addr4(value);
			return;
		}
		if ($sppl_addr.equalsIgnoreCase(name)) {
			sppl_addr(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($sppl_alt_nm1.equalsIgnoreCase(name)) {
			sppl_alt_nm1(value);
			return;
		}
		if ($sppl_alt_nm2.equalsIgnoreCase(name)) {
			sppl_alt_nm2(value);
			return;
		}
		if ($sppl_alt_nm3.equalsIgnoreCase(name)) {
			sppl_alt_nm3(value);
			return;
		}
		if ($sppl_alt_nm4.equalsIgnoreCase(name)) {
			sppl_alt_nm4(value);
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
		if ($sppl_tel.equalsIgnoreCase(name)) {
			sppl_tel(value);
			return;
		}
		if ($sppl_fax.equalsIgnoreCase(name)) {
			sppl_fax(value);
			return;
		}
		if ($sppl_cntry_nm.equalsIgnoreCase(name)) {
			sppl_cntry_nm(value);
			return;
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			co_nm(value);
			return;
		}
		if ($dpt_zip_cd.equalsIgnoreCase(name)) {
			dpt_zip_cd(value);
			return;
		}
		if ($dpt_addr1.equalsIgnoreCase(name)) {
			dpt_addr1(value);
			return;
		}
		if ($dpt_addr2.equalsIgnoreCase(name)) {
			dpt_addr2(value);
			return;
		}
		if ($dpt_addr3.equalsIgnoreCase(name)) {
			dpt_addr3(value);
			return;
		}
		if ($dpt_addr4.equalsIgnoreCase(name)) {
			dpt_addr4(value);
			return;
		}
		if ($dpt_addr.equalsIgnoreCase(name)) {
			dpt_addr(value);
			return;
		}
		if ($dpt_tel.equalsIgnoreCase(name)) {
			dpt_tel(value);
			return;
		}
		if ($dpt_fax.equalsIgnoreCase(name)) {
			dpt_fax(value);
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
		if ($dpt_cntry_nm.equalsIgnoreCase(name)) {
			dpt_cntry_nm(value);
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
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
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
		if ($s_ttl_amt.equalsIgnoreCase(name)) {
			s_ttl_amt(value);
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
		if ($s_ttl_tax_amt.equalsIgnoreCase(name)) {
			s_ttl_tax_amt(value);
			return;
		}
		if ($po_print_cd.equalsIgnoreCase(name)) {
			po_print_cd(value);
			return;
		}
		if ($po_print_txt.equalsIgnoreCase(name)) {
			po_print_txt(value);
			return;
		}
		if ($po_print_txt1.equalsIgnoreCase(name)) {
			po_print_txt1(value);
			return;
		}
		if ($po_print_txt2.equalsIgnoreCase(name)) {
			po_print_txt2(value);
			return;
		}
		if ($po_print_txt3.equalsIgnoreCase(name)) {
			po_print_txt3(value);
			return;
		}
		if ($po_print_txt4.equalsIgnoreCase(name)) {
			po_print_txt4(value);
			return;
		}
		if ($po_print_txt5.equalsIgnoreCase(name)) {
			po_print_txt5(value);
			return;
		}
		if ($po_print_txt6.equalsIgnoreCase(name)) {
			po_print_txt6(value);
			return;
		}
		if ($crct_rsn_cd.equalsIgnoreCase(name)) {
			crct_rsn_cd(value);
			return;
		}
		if ($po_crct_rsn_nm.equalsIgnoreCase(name)) {
			po_crct_rsn_nm(value);
			return;
		}
		if ($po_crct_rsn_rmrks.equalsIgnoreCase(name)) {
			po_crct_rsn_rmrks(value);
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
		if ($po_print_rmrks.equalsIgnoreCase(name)) {
			po_print_rmrks(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		if ($ttl_amt.equalsIgnoreCase(name)) {
			ttl_amt(value);
			return;
		}
		if ($ttl_tax_amt.equalsIgnoreCase(name)) {
			ttl_tax_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		if ($ttl_amt.equalsIgnoreCase(name)) {
			ttl_amt(value);
			return;
		}
		if ($ttl_tax_amt.equalsIgnoreCase(name)) {
			ttl_tax_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		if ($ttl_amt.equalsIgnoreCase(name)) {
			ttl_amt(value);
			return;
		}
		if ($ttl_tax_amt.equalsIgnoreCase(name)) {
			ttl_tax_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		if ($ttl_amt.equalsIgnoreCase(name)) {
			ttl_amt(value);
			return;
		}
		if ($ttl_tax_amt.equalsIgnoreCase(name)) {
			ttl_tax_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		if ($ttl_amt.equalsIgnoreCase(name)) {
			ttl_amt(value);
			return;
		}
		if ($ttl_tax_amt.equalsIgnoreCase(name)) {
			ttl_tax_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($print_hm.equalsIgnoreCase(name)) {
			print_hm(value);
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
		super.setDateNE(name, value);
	}



}

