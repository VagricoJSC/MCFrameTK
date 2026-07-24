package mcframe.commonMSBE.MSBER0210;

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
 * ブロック"PckLstHdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class PckLstHdrR_MC_A extends MCConstRow {

	/**
	 *  インボイスＮＯ.<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
	/**
	 *  会社名.<p>
	 *
	 */
	public static final String $co_nm = "co_nm";
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
	 *  国名.<p>
	 *
	 */
	public static final String $co_cntry_nm = "co_cntry_nm";
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
	 *  出荷依頼先識別区分（不使用）.<p>
	 *
	 */
	public static final String $ship_rqst_id_typ = "ship_rqst_id_typ";
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
	public static final String $dlv_cd = "dlv_cd";
	/**
	 *  納品先名.<p>
	 *
	 */
	public static final String $dlv_nm = "dlv_nm";
	/**
	 *  納品先別名１.<p>
	 *
	 */
	public static final String $dlv_alt_nm1 = "dlv_alt_nm1";
	/**
	 *  納品先別名２.<p>
	 *
	 */
	public static final String $dlv_alt_nm2 = "dlv_alt_nm2";
	/**
	 *  納品先別名３.<p>
	 *
	 */
	public static final String $dlv_alt_nm3 = "dlv_alt_nm3";
	/**
	 *  納品先別名４.<p>
	 *
	 */
	public static final String $dlv_alt_nm4 = "dlv_alt_nm4";
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
	 *  納品先国名.<p>
	 *
	 */
	public static final String $dlv_cntry_nm = "dlv_cntry_nm";
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
	 *  入金条件ＣＤ.<p>
	 *
	 */
	public static final String $tterm_cd3 = "tterm_cd3";
	/**
	 *  入金条件名.<p>
	 *
	 */
	public static final String $tterm_nm3 = "tterm_nm3";
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
	 *  パッキングリスト備考.<p>
	 *
	 */
	public static final String $pl_rmrks = "pl_rmrks";
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
	 *  帳票出力ロケールＣＤ.<p>
	 *
	 */
	public static final String $prnt_lcl_cd = "prnt_lcl_cd";


	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta co_nm_META = createCommonMeta($co_nm, mcframe.commonMA.meta.MA_META.CO_NM);
	public static final MCMeta co_addr1_META = createCommonMeta($co_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta co_addr2_META = createCommonMeta($co_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta co_addr3_META = createCommonMeta($co_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta co_addr4_META = createCommonMeta($co_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta co_addr_META = createStringMeta($co_addr);
	public static final MCMeta co_tel_META = createCommonMeta($co_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta co_fax_META = createCommonMeta($co_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta co_cntry_nm_META = createCommonMeta($co_cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta prnt_dt_META = createCommonMeta($prnt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta iv_dt_META = createCommonMeta($iv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ship_rqst_id_typ_META = createCommonMeta($ship_rqst_id_typ, mcframe.commonMS.meta.MS_META.SHIP_RQST_ID_TYP);
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
	public static final MCMeta dlv_cd_META = createCommonMeta($dlv_cd, mcframe.commonMS.meta.MS_META.DLV_ID_CD);
	public static final MCMeta dlv_nm_META = createCommonMeta($dlv_nm, mcframe.commonMS.meta.MS_META.DLV_ID_NM);
	public static final MCMeta dlv_alt_nm1_META = createCommonMeta($dlv_alt_nm1, mcframe.commonMA.meta.MA_META.BP_ALT_NM1);
	public static final MCMeta dlv_alt_nm2_META = createCommonMeta($dlv_alt_nm2, mcframe.commonMA.meta.MA_META.BP_ALT_NM2);
	public static final MCMeta dlv_alt_nm3_META = createCommonMeta($dlv_alt_nm3, mcframe.commonMA.meta.MA_META.BP_ALT_NM3);
	public static final MCMeta dlv_alt_nm4_META = createCommonMeta($dlv_alt_nm4, mcframe.commonMA.meta.MA_META.BP_ALT_NM4);
	public static final MCMeta dlv_addr1_META = createCommonMeta($dlv_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta dlv_addr2_META = createCommonMeta($dlv_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta dlv_addr3_META = createCommonMeta($dlv_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta dlv_addr4_META = createCommonMeta($dlv_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta dlv_addr_META = createStringMeta($dlv_addr);
	public static final MCMeta dlv_cntry_nm_META = createCommonMeta($dlv_cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta trnspt_cd_META = createCommonMeta($trnspt_cd, mcframe.commonMA.meta.MA_META.TRNSPT_CD);
	public static final MCMeta trnspt_nm_META = createCommonMeta($trnspt_nm, mcframe.commonMA.meta.MA_META.TRNSPT_NM);
	public static final MCMeta vssl_flght_META = createCommonMeta($vssl_flght, mcframe.commonMA.meta.MA_META.VSSL_FLGHT);
	public static final MCMeta etd_dt_META = createCommonMeta($etd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta load_port_cd_META = createCommonMeta($load_port_cd, mcframe.commonMA.meta.MA_META.PORT_CD);
	public static final MCMeta load_port_nm_META = createCommonMeta($load_port_nm, mcframe.commonMA.meta.MA_META.PORT_NM);
	public static final MCMeta dschrg_port_cd_META = createCommonMeta($dschrg_port_cd, mcframe.commonMA.meta.MA_META.PORT_CD);
	public static final MCMeta dschrg_port_nm_META = createCommonMeta($dschrg_port_nm, mcframe.commonMA.meta.MA_META.PORT_NM);
	public static final MCMeta via_port_cd_META = createCommonMeta($via_port_cd, mcframe.commonMA.meta.MA_META.PORT_CD);
	public static final MCMeta via_port_nm_META = createCommonMeta($via_port_nm, mcframe.commonMA.meta.MA_META.PORT_NM);
	public static final MCMeta tterm_cd3_META = createCommonMeta($tterm_cd3, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_nm3_META = createCommonMeta($tterm_nm3, mcframe.commonMA.meta.MA_META.TTERM_NM);
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
	public static final MCMeta pl_rmrks_META = createCommonMeta($pl_rmrks, mcframe.commonMS.meta.MS_META.PL_RMRKS);
	public static final MCMeta iv_sub_char1_META = createCommonMeta($iv_sub_char1, mcframe.commonMS.meta.MS_META.IV_SUB_CHAR1);
	public static final MCMeta iv_sub_char2_META = createCommonMeta($iv_sub_char2, mcframe.commonMS.meta.MS_META.IV_SUB_CHAR2);
	public static final MCMeta iv_sub_char3_META = createCommonMeta($iv_sub_char3, mcframe.commonMS.meta.MS_META.IV_SUB_CHAR3);
	public static final MCMeta prnt_lcl_cd_META = createCommonMeta($prnt_lcl_cd, mcframe.commonMA.meta.MA_META.LCL_CD);

	protected static final ConstMetaList<PckLstHdrR> constMetas = new ConstMetaList<PckLstHdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			iv_no_META,
			co_nm_META,
			co_addr1_META,
			co_addr2_META,
			co_addr3_META,
			co_addr4_META,
			co_addr_META,
			co_tel_META,
			co_fax_META,
			co_cntry_nm_META,
			prnt_dt_META,
			iv_dt_META,
			ship_rqst_id_typ_META,
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
			dlv_cd_META,
			dlv_nm_META,
			dlv_alt_nm1_META,
			dlv_alt_nm2_META,
			dlv_alt_nm3_META,
			dlv_alt_nm4_META,
			dlv_addr1_META,
			dlv_addr2_META,
			dlv_addr3_META,
			dlv_addr4_META,
			dlv_addr_META,
			dlv_cntry_nm_META,
			trnspt_cd_META,
			trnspt_nm_META,
			vssl_flght_META,
			etd_dt_META,
			load_port_cd_META,
			load_port_nm_META,
			dschrg_port_cd_META,
			dschrg_port_nm_META,
			via_port_cd_META,
			via_port_nm_META,
			tterm_cd3_META,
			tterm_nm3_META,
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
			pl_rmrks_META,
			iv_sub_char1_META,
			iv_sub_char2_META,
			iv_sub_char3_META,
			prnt_lcl_cd_META
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
	protected PckLstHdrR_MC_A(ConstMetaList<? extends PckLstHdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PckLstHdrR clone() {
		return (PckLstHdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PckLstHdrR createInstance() {
		return (PckLstHdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PckLstHdrR getValues(String... names) {
		return (PckLstHdrR) super.getValues(names);
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
	 *  会社名.<p>
	 *
	 */
	public String co_nm() {
		return getConstString(offset + 1, $co_nm);
	}

	/**
	 *  会社名.<p>
	 *
	 */
	public void co_nm(String value) {
		setConstString(offset + 1, $co_nm, value);
	}


	/**
	 *  住所１.<p>
	 *
	 */
	public String co_addr1() {
		return getConstString(offset + 2, $co_addr1);
	}

	/**
	 *  住所１.<p>
	 *
	 */
	public void co_addr1(String value) {
		setConstString(offset + 2, $co_addr1, value);
	}


	/**
	 *  住所２.<p>
	 *
	 */
	public String co_addr2() {
		return getConstString(offset + 3, $co_addr2);
	}

	/**
	 *  住所２.<p>
	 *
	 */
	public void co_addr2(String value) {
		setConstString(offset + 3, $co_addr2, value);
	}


	/**
	 *  住所３.<p>
	 *
	 */
	public String co_addr3() {
		return getConstString(offset + 4, $co_addr3);
	}

	/**
	 *  住所３.<p>
	 *
	 */
	public void co_addr3(String value) {
		setConstString(offset + 4, $co_addr3, value);
	}


	/**
	 *  住所４.<p>
	 *
	 */
	public String co_addr4() {
		return getConstString(offset + 5, $co_addr4);
	}

	/**
	 *  住所４.<p>
	 *
	 */
	public void co_addr4(String value) {
		setConstString(offset + 5, $co_addr4, value);
	}


	/**
	 *  住所.<p>
	 *
	 */
	public String co_addr() {
		return getConstString(offset + 6, $co_addr);
	}

	/**
	 *  住所.<p>
	 *
	 */
	public void co_addr(String value) {
		setConstString(offset + 6, $co_addr, value);
	}


	/**
	 *  会社ＴＥＬ.<p>
	 *
	 */
	public String co_tel() {
		return getConstString(offset + 7, $co_tel);
	}

	/**
	 *  会社ＴＥＬ.<p>
	 *
	 */
	public void co_tel(String value) {
		setConstString(offset + 7, $co_tel, value);
	}


	/**
	 *  会社ＦＡＸ.<p>
	 *
	 */
	public String co_fax() {
		return getConstString(offset + 8, $co_fax);
	}

	/**
	 *  会社ＦＡＸ.<p>
	 *
	 */
	public void co_fax(String value) {
		setConstString(offset + 8, $co_fax, value);
	}


	/**
	 *  国名.<p>
	 *
	 */
	public String co_cntry_nm() {
		return getConstString(offset + 9, $co_cntry_nm);
	}

	/**
	 *  国名.<p>
	 *
	 */
	public void co_cntry_nm(String value) {
		setConstString(offset + 9, $co_cntry_nm, value);
	}


	/**
	 *  発行日.<p>
	 *
	 */
	public MCDate prnt_dt() {
		return getConstDate(offset + 10, $prnt_dt);
	}

	/**
	 *  発行日.<p>
	 *
	 */
	public void prnt_dt(MCDate value) {
		setConstDate(offset + 10, $prnt_dt, value);
	}


	/**
	 *  インボイス日付.<p>
	 *
	 */
	public MCDate iv_dt() {
		return getConstDate(offset + 11, $iv_dt);
	}

	/**
	 *  インボイス日付.<p>
	 *
	 */
	public void iv_dt(MCDate value) {
		setConstDate(offset + 11, $iv_dt, value);
	}


	/**
	 *  出荷依頼先識別区分（不使用）.<p>
	 *
	 */
	public String ship_rqst_id_typ() {
		return getConstString(offset + 12, $ship_rqst_id_typ);
	}

	/**
	 *  出荷依頼先識別区分（不使用）.<p>
	 *
	 */
	public void ship_rqst_id_typ(String value) {
		setConstString(offset + 12, $ship_rqst_id_typ, value);
	}


	/**
	 *  得意先ＣＤ.<p>
	 *
	 */
	public String ship_rqst_id_cd() {
		return getConstString(offset + 13, $ship_rqst_id_cd);
	}

	/**
	 *  得意先ＣＤ.<p>
	 *
	 */
	public void ship_rqst_id_cd(String value) {
		setConstString(offset + 13, $ship_rqst_id_cd, value);
	}


	/**
	 *  得意先名.<p>
	 *
	 */
	public String ship_rqst_id_nm() {
		return getConstString(offset + 14, $ship_rqst_id_nm);
	}

	/**
	 *  得意先名.<p>
	 *
	 */
	public void ship_rqst_id_nm(String value) {
		setConstString(offset + 14, $ship_rqst_id_nm, value);
	}


	/**
	 *  得意先別名１.<p>
	 *
	 */
	public String ship_rqst_id_alt_nm1() {
		return getConstString(offset + 15, $ship_rqst_id_alt_nm1);
	}

	/**
	 *  得意先別名１.<p>
	 *
	 */
	public void ship_rqst_id_alt_nm1(String value) {
		setConstString(offset + 15, $ship_rqst_id_alt_nm1, value);
	}


	/**
	 *  得意先別名２.<p>
	 *
	 */
	public String ship_rqst_id_alt_nm2() {
		return getConstString(offset + 16, $ship_rqst_id_alt_nm2);
	}

	/**
	 *  得意先別名２.<p>
	 *
	 */
	public void ship_rqst_id_alt_nm2(String value) {
		setConstString(offset + 16, $ship_rqst_id_alt_nm2, value);
	}


	/**
	 *  得意先別名３.<p>
	 *
	 */
	public String ship_rqst_id_alt_nm3() {
		return getConstString(offset + 17, $ship_rqst_id_alt_nm3);
	}

	/**
	 *  得意先別名３.<p>
	 *
	 */
	public void ship_rqst_id_alt_nm3(String value) {
		setConstString(offset + 17, $ship_rqst_id_alt_nm3, value);
	}


	/**
	 *  得意先別名４.<p>
	 *
	 */
	public String ship_rqst_id_alt_nm4() {
		return getConstString(offset + 18, $ship_rqst_id_alt_nm4);
	}

	/**
	 *  得意先別名４.<p>
	 *
	 */
	public void ship_rqst_id_alt_nm4(String value) {
		setConstString(offset + 18, $ship_rqst_id_alt_nm4, value);
	}


	/**
	 *  得意先住所１.<p>
	 *
	 */
	public String ship_rqst_addr1() {
		return getConstString(offset + 19, $ship_rqst_addr1);
	}

	/**
	 *  得意先住所１.<p>
	 *
	 */
	public void ship_rqst_addr1(String value) {
		setConstString(offset + 19, $ship_rqst_addr1, value);
	}


	/**
	 *  得意先住所２.<p>
	 *
	 */
	public String ship_rqst_addr2() {
		return getConstString(offset + 20, $ship_rqst_addr2);
	}

	/**
	 *  得意先住所２.<p>
	 *
	 */
	public void ship_rqst_addr2(String value) {
		setConstString(offset + 20, $ship_rqst_addr2, value);
	}


	/**
	 *  得意先住所３.<p>
	 *
	 */
	public String ship_rqst_addr3() {
		return getConstString(offset + 21, $ship_rqst_addr3);
	}

	/**
	 *  得意先住所３.<p>
	 *
	 */
	public void ship_rqst_addr3(String value) {
		setConstString(offset + 21, $ship_rqst_addr3, value);
	}


	/**
	 *  得意先住所４.<p>
	 *
	 */
	public String ship_rqst_addr4() {
		return getConstString(offset + 22, $ship_rqst_addr4);
	}

	/**
	 *  得意先住所４.<p>
	 *
	 */
	public void ship_rqst_addr4(String value) {
		setConstString(offset + 22, $ship_rqst_addr4, value);
	}


	/**
	 *  得意先住所.<p>
	 *
	 */
	public String ship_rqst_addr() {
		return getConstString(offset + 23, $ship_rqst_addr);
	}

	/**
	 *  得意先住所.<p>
	 *
	 */
	public void ship_rqst_addr(String value) {
		setConstString(offset + 23, $ship_rqst_addr, value);
	}


	/**
	 *  得意先国名.<p>
	 *
	 */
	public String ship_rqst_cntry_nm() {
		return getConstString(offset + 24, $ship_rqst_cntry_nm);
	}

	/**
	 *  得意先国名.<p>
	 *
	 */
	public void ship_rqst_cntry_nm(String value) {
		setConstString(offset + 24, $ship_rqst_cntry_nm, value);
	}


	/**
	 *  納品先識別区分（不使用）.<p>
	 *
	 */
	public String dlv_id_typ() {
		return getConstString(offset + 25, $dlv_id_typ);
	}

	/**
	 *  納品先識別区分（不使用）.<p>
	 *
	 */
	public void dlv_id_typ(String value) {
		setConstString(offset + 25, $dlv_id_typ, value);
	}


	/**
	 *  納品先ＣＤ.<p>
	 *
	 */
	public String dlv_cd() {
		return getConstString(offset + 26, $dlv_cd);
	}

	/**
	 *  納品先ＣＤ.<p>
	 *
	 */
	public void dlv_cd(String value) {
		setConstString(offset + 26, $dlv_cd, value);
	}


	/**
	 *  納品先名.<p>
	 *
	 */
	public String dlv_nm() {
		return getConstString(offset + 27, $dlv_nm);
	}

	/**
	 *  納品先名.<p>
	 *
	 */
	public void dlv_nm(String value) {
		setConstString(offset + 27, $dlv_nm, value);
	}


	/**
	 *  納品先別名１.<p>
	 *
	 */
	public String dlv_alt_nm1() {
		return getConstString(offset + 28, $dlv_alt_nm1);
	}

	/**
	 *  納品先別名１.<p>
	 *
	 */
	public void dlv_alt_nm1(String value) {
		setConstString(offset + 28, $dlv_alt_nm1, value);
	}


	/**
	 *  納品先別名２.<p>
	 *
	 */
	public String dlv_alt_nm2() {
		return getConstString(offset + 29, $dlv_alt_nm2);
	}

	/**
	 *  納品先別名２.<p>
	 *
	 */
	public void dlv_alt_nm2(String value) {
		setConstString(offset + 29, $dlv_alt_nm2, value);
	}


	/**
	 *  納品先別名３.<p>
	 *
	 */
	public String dlv_alt_nm3() {
		return getConstString(offset + 30, $dlv_alt_nm3);
	}

	/**
	 *  納品先別名３.<p>
	 *
	 */
	public void dlv_alt_nm3(String value) {
		setConstString(offset + 30, $dlv_alt_nm3, value);
	}


	/**
	 *  納品先別名４.<p>
	 *
	 */
	public String dlv_alt_nm4() {
		return getConstString(offset + 31, $dlv_alt_nm4);
	}

	/**
	 *  納品先別名４.<p>
	 *
	 */
	public void dlv_alt_nm4(String value) {
		setConstString(offset + 31, $dlv_alt_nm4, value);
	}


	/**
	 *  納品先住所１.<p>
	 *
	 */
	public String dlv_addr1() {
		return getConstString(offset + 32, $dlv_addr1);
	}

	/**
	 *  納品先住所１.<p>
	 *
	 */
	public void dlv_addr1(String value) {
		setConstString(offset + 32, $dlv_addr1, value);
	}


	/**
	 *  納品先住所２.<p>
	 *
	 */
	public String dlv_addr2() {
		return getConstString(offset + 33, $dlv_addr2);
	}

	/**
	 *  納品先住所２.<p>
	 *
	 */
	public void dlv_addr2(String value) {
		setConstString(offset + 33, $dlv_addr2, value);
	}


	/**
	 *  納品先住所３.<p>
	 *
	 */
	public String dlv_addr3() {
		return getConstString(offset + 34, $dlv_addr3);
	}

	/**
	 *  納品先住所３.<p>
	 *
	 */
	public void dlv_addr3(String value) {
		setConstString(offset + 34, $dlv_addr3, value);
	}


	/**
	 *  納品先住所４.<p>
	 *
	 */
	public String dlv_addr4() {
		return getConstString(offset + 35, $dlv_addr4);
	}

	/**
	 *  納品先住所４.<p>
	 *
	 */
	public void dlv_addr4(String value) {
		setConstString(offset + 35, $dlv_addr4, value);
	}


	/**
	 *  納品先住所.<p>
	 *
	 */
	public String dlv_addr() {
		return getConstString(offset + 36, $dlv_addr);
	}

	/**
	 *  納品先住所.<p>
	 *
	 */
	public void dlv_addr(String value) {
		setConstString(offset + 36, $dlv_addr, value);
	}


	/**
	 *  納品先国名.<p>
	 *
	 */
	public String dlv_cntry_nm() {
		return getConstString(offset + 37, $dlv_cntry_nm);
	}

	/**
	 *  納品先国名.<p>
	 *
	 */
	public void dlv_cntry_nm(String value) {
		setConstString(offset + 37, $dlv_cntry_nm, value);
	}


	/**
	 *  輸送方法ＣＤ.<p>
	 *
	 */
	public String trnspt_cd() {
		return getConstString(offset + 38, $trnspt_cd);
	}

	/**
	 *  輸送方法ＣＤ.<p>
	 *
	 */
	public void trnspt_cd(String value) {
		setConstString(offset + 38, $trnspt_cd, value);
	}


	/**
	 *  輸送方法名.<p>
	 *
	 */
	public String trnspt_nm() {
		return getConstString(offset + 39, $trnspt_nm);
	}

	/**
	 *  輸送方法名.<p>
	 *
	 */
	public void trnspt_nm(String value) {
		setConstString(offset + 39, $trnspt_nm, value);
	}


	/**
	 *  船名／便名.<p>
	 *
	 */
	public String vssl_flght() {
		return getConstString(offset + 40, $vssl_flght);
	}

	/**
	 *  船名／便名.<p>
	 *
	 */
	public void vssl_flght(String value) {
		setConstString(offset + 40, $vssl_flght, value);
	}


	/**
	 *  船積予定日.<p>
	 *
	 */
	public MCDate etd_dt() {
		return getConstDate(offset + 41, $etd_dt);
	}

	/**
	 *  船積予定日.<p>
	 *
	 */
	public void etd_dt(MCDate value) {
		setConstDate(offset + 41, $etd_dt, value);
	}


	/**
	 *  船積港ＣＤ.<p>
	 *
	 */
	public String load_port_cd() {
		return getConstString(offset + 42, $load_port_cd);
	}

	/**
	 *  船積港ＣＤ.<p>
	 *
	 */
	public void load_port_cd(String value) {
		setConstString(offset + 42, $load_port_cd, value);
	}


	/**
	 *  船積港名.<p>
	 *
	 */
	public String load_port_nm() {
		return getConstString(offset + 43, $load_port_nm);
	}

	/**
	 *  船積港名.<p>
	 *
	 */
	public void load_port_nm(String value) {
		setConstString(offset + 43, $load_port_nm, value);
	}


	/**
	 *  船卸港ＣＤ.<p>
	 *
	 */
	public String dschrg_port_cd() {
		return getConstString(offset + 44, $dschrg_port_cd);
	}

	/**
	 *  船卸港ＣＤ.<p>
	 *
	 */
	public void dschrg_port_cd(String value) {
		setConstString(offset + 44, $dschrg_port_cd, value);
	}


	/**
	 *  船卸港名.<p>
	 *
	 */
	public String dschrg_port_nm() {
		return getConstString(offset + 45, $dschrg_port_nm);
	}

	/**
	 *  船卸港名.<p>
	 *
	 */
	public void dschrg_port_nm(String value) {
		setConstString(offset + 45, $dschrg_port_nm, value);
	}


	/**
	 *  経由地ＣＤ.<p>
	 *
	 */
	public String via_port_cd() {
		return getConstString(offset + 46, $via_port_cd);
	}

	/**
	 *  経由地ＣＤ.<p>
	 *
	 */
	public void via_port_cd(String value) {
		setConstString(offset + 46, $via_port_cd, value);
	}


	/**
	 *  経由地名.<p>
	 *
	 */
	public String via_port_nm() {
		return getConstString(offset + 47, $via_port_nm);
	}

	/**
	 *  経由地名.<p>
	 *
	 */
	public void via_port_nm(String value) {
		setConstString(offset + 47, $via_port_nm, value);
	}


	/**
	 *  入金条件ＣＤ.<p>
	 *
	 */
	public String tterm_cd3() {
		return getConstString(offset + 48, $tterm_cd3);
	}

	/**
	 *  入金条件ＣＤ.<p>
	 *
	 */
	public void tterm_cd3(String value) {
		setConstString(offset + 48, $tterm_cd3, value);
	}


	/**
	 *  入金条件名.<p>
	 *
	 */
	public String tterm_nm3() {
		return getConstString(offset + 49, $tterm_nm3);
	}

	/**
	 *  入金条件名.<p>
	 *
	 */
	public void tterm_nm3(String value) {
		setConstString(offset + 49, $tterm_nm3, value);
	}


	/**
	 *  入金条件備考.<p>
	 *
	 */
	public String tterm_rmrks3() {
		return getConstString(offset + 50, $tterm_rmrks3);
	}

	/**
	 *  入金条件備考.<p>
	 *
	 */
	public void tterm_rmrks3(String value) {
		setConstString(offset + 50, $tterm_rmrks3, value);
	}


	/**
	 *  Ｌ／ＣＮＯ.<p>
	 *
	 */
	public String lc_no() {
		return getConstString(offset + 51, $lc_no);
	}

	/**
	 *  Ｌ／ＣＮＯ.<p>
	 *
	 */
	public void lc_no(String value) {
		setConstString(offset + 51, $lc_no, value);
	}


	/**
	 *  Ｌ／Ｃ日付.<p>
	 *
	 */
	public MCDate lc_dt() {
		return getConstDate(offset + 52, $lc_dt);
	}

	/**
	 *  Ｌ／Ｃ日付.<p>
	 *
	 */
	public void lc_dt(MCDate value) {
		setConstDate(offset + 52, $lc_dt, value);
	}


	/**
	 *  Ｌ／Ｃ備考.<p>
	 *
	 */
	public String lc_rmrks() {
		return getConstString(offset + 53, $lc_rmrks);
	}

	/**
	 *  Ｌ／Ｃ備考.<p>
	 *
	 */
	public void lc_rmrks(String value) {
		setConstString(offset + 53, $lc_rmrks, value);
	}


	/**
	 *  Ｂ／ＬＮＯ.<p>
	 *
	 */
	public String bl_no() {
		return getConstString(offset + 54, $bl_no);
	}

	/**
	 *  Ｂ／ＬＮＯ.<p>
	 *
	 */
	public void bl_no(String value) {
		setConstString(offset + 54, $bl_no, value);
	}


	/**
	 *  Ｂ／Ｌ日付.<p>
	 *
	 */
	public MCDate bl_dt() {
		return getConstDate(offset + 55, $bl_dt);
	}

	/**
	 *  Ｂ／Ｌ日付.<p>
	 *
	 */
	public void bl_dt(MCDate value) {
		setConstDate(offset + 55, $bl_dt, value);
	}


	/**
	 *  Ｂ／Ｌ備考.<p>
	 *
	 */
	public String bl_rmrks() {
		return getConstString(offset + 56, $bl_rmrks);
	}

	/**
	 *  Ｂ／Ｌ備考.<p>
	 *
	 */
	public void bl_rmrks(String value) {
		setConstString(offset + 56, $bl_rmrks, value);
	}


	/**
	 *  ケースマーク１.<p>
	 *
	 */
	public String case_mrk1() {
		return getConstString(offset + 57, $case_mrk1);
	}

	/**
	 *  ケースマーク１.<p>
	 *
	 */
	public void case_mrk1(String value) {
		setConstString(offset + 57, $case_mrk1, value);
	}


	/**
	 *  ケースマーク２.<p>
	 *
	 */
	public String case_mrk2() {
		return getConstString(offset + 58, $case_mrk2);
	}

	/**
	 *  ケースマーク２.<p>
	 *
	 */
	public void case_mrk2(String value) {
		setConstString(offset + 58, $case_mrk2, value);
	}


	/**
	 *  ケースマーク３.<p>
	 *
	 */
	public String case_mrk3() {
		return getConstString(offset + 59, $case_mrk3);
	}

	/**
	 *  ケースマーク３.<p>
	 *
	 */
	public void case_mrk3(String value) {
		setConstString(offset + 59, $case_mrk3, value);
	}


	/**
	 *  ケースマーク４.<p>
	 *
	 */
	public String case_mrk4() {
		return getConstString(offset + 60, $case_mrk4);
	}

	/**
	 *  ケースマーク４.<p>
	 *
	 */
	public void case_mrk4(String value) {
		setConstString(offset + 60, $case_mrk4, value);
	}


	/**
	 *  ケースマーク５.<p>
	 *
	 */
	public String case_mrk5() {
		return getConstString(offset + 61, $case_mrk5);
	}

	/**
	 *  ケースマーク５.<p>
	 *
	 */
	public void case_mrk5(String value) {
		setConstString(offset + 61, $case_mrk5, value);
	}


	/**
	 *  ケースマーク６.<p>
	 *
	 */
	public String case_mrk6() {
		return getConstString(offset + 62, $case_mrk6);
	}

	/**
	 *  ケースマーク６.<p>
	 *
	 */
	public void case_mrk6(String value) {
		setConstString(offset + 62, $case_mrk6, value);
	}


	/**
	 *  パッキングリスト備考.<p>
	 *
	 */
	public String pl_rmrks() {
		return getConstString(offset + 63, $pl_rmrks);
	}

	/**
	 *  パッキングリスト備考.<p>
	 *
	 */
	public void pl_rmrks(String value) {
		setConstString(offset + 63, $pl_rmrks, value);
	}


	/**
	 *  予備１.<p>
	 *
	 */
	public String iv_sub_char1() {
		return getConstString(offset + 64, $iv_sub_char1);
	}

	/**
	 *  予備１.<p>
	 *
	 */
	public void iv_sub_char1(String value) {
		setConstString(offset + 64, $iv_sub_char1, value);
	}


	/**
	 *  予備２.<p>
	 *
	 */
	public String iv_sub_char2() {
		return getConstString(offset + 65, $iv_sub_char2);
	}

	/**
	 *  予備２.<p>
	 *
	 */
	public void iv_sub_char2(String value) {
		setConstString(offset + 65, $iv_sub_char2, value);
	}


	/**
	 *  予備３.<p>
	 *
	 */
	public String iv_sub_char3() {
		return getConstString(offset + 66, $iv_sub_char3);
	}

	/**
	 *  予備３.<p>
	 *
	 */
	public void iv_sub_char3(String value) {
		setConstString(offset + 66, $iv_sub_char3, value);
	}


	/**
	 *  帳票出力ロケールＣＤ.<p>
	 *
	 */
	public String prnt_lcl_cd() {
		return getConstString(offset + 67, $prnt_lcl_cd);
	}

	/**
	 *  帳票出力ロケールＣＤ.<p>
	 *
	 */
	public void prnt_lcl_cd(String value) {
		setConstString(offset + 67, $prnt_lcl_cd, value);
	}


	public String getString(String name) {
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			return co_nm();
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
		if ($co_tel.equalsIgnoreCase(name)) {
			return co_tel();
		}
		if ($co_fax.equalsIgnoreCase(name)) {
			return co_fax();
		}
		if ($co_cntry_nm.equalsIgnoreCase(name)) {
			return co_cntry_nm();
		}
		if ($ship_rqst_id_typ.equalsIgnoreCase(name)) {
			return ship_rqst_id_typ();
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
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
		}
		if ($dlv_alt_nm1.equalsIgnoreCase(name)) {
			return dlv_alt_nm1();
		}
		if ($dlv_alt_nm2.equalsIgnoreCase(name)) {
			return dlv_alt_nm2();
		}
		if ($dlv_alt_nm3.equalsIgnoreCase(name)) {
			return dlv_alt_nm3();
		}
		if ($dlv_alt_nm4.equalsIgnoreCase(name)) {
			return dlv_alt_nm4();
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
		if ($dlv_cntry_nm.equalsIgnoreCase(name)) {
			return dlv_cntry_nm();
		}
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			return trnspt_cd();
		}
		if ($trnspt_nm.equalsIgnoreCase(name)) {
			return trnspt_nm();
		}
		if ($vssl_flght.equalsIgnoreCase(name)) {
			return vssl_flght();
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
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			return tterm_cd3();
		}
		if ($tterm_nm3.equalsIgnoreCase(name)) {
			return tterm_nm3();
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
		if ($pl_rmrks.equalsIgnoreCase(name)) {
			return pl_rmrks();
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
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			return prnt_lcl_cd();
		}
		return super.getString(name);
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

	public String getStringNE(String name) {
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			return co_nm();
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
		if ($co_tel.equalsIgnoreCase(name)) {
			return co_tel();
		}
		if ($co_fax.equalsIgnoreCase(name)) {
			return co_fax();
		}
		if ($co_cntry_nm.equalsIgnoreCase(name)) {
			return co_cntry_nm();
		}
		if ($ship_rqst_id_typ.equalsIgnoreCase(name)) {
			return ship_rqst_id_typ();
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
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
		}
		if ($dlv_alt_nm1.equalsIgnoreCase(name)) {
			return dlv_alt_nm1();
		}
		if ($dlv_alt_nm2.equalsIgnoreCase(name)) {
			return dlv_alt_nm2();
		}
		if ($dlv_alt_nm3.equalsIgnoreCase(name)) {
			return dlv_alt_nm3();
		}
		if ($dlv_alt_nm4.equalsIgnoreCase(name)) {
			return dlv_alt_nm4();
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
		if ($dlv_cntry_nm.equalsIgnoreCase(name)) {
			return dlv_cntry_nm();
		}
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			return trnspt_cd();
		}
		if ($trnspt_nm.equalsIgnoreCase(name)) {
			return trnspt_nm();
		}
		if ($vssl_flght.equalsIgnoreCase(name)) {
			return vssl_flght();
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
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			return tterm_cd3();
		}
		if ($tterm_nm3.equalsIgnoreCase(name)) {
			return tterm_nm3();
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
		if ($pl_rmrks.equalsIgnoreCase(name)) {
			return pl_rmrks();
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
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			return prnt_lcl_cd();
		}
		return super.getStringNE(name);
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

	public void setString(String name, String value) {
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			co_nm(value);
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
		if ($co_tel.equalsIgnoreCase(name)) {
			co_tel(value);
			return;
		}
		if ($co_fax.equalsIgnoreCase(name)) {
			co_fax(value);
			return;
		}
		if ($co_cntry_nm.equalsIgnoreCase(name)) {
			co_cntry_nm(value);
			return;
		}
		if ($ship_rqst_id_typ.equalsIgnoreCase(name)) {
			ship_rqst_id_typ(value);
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
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			dlv_nm(value);
			return;
		}
		if ($dlv_alt_nm1.equalsIgnoreCase(name)) {
			dlv_alt_nm1(value);
			return;
		}
		if ($dlv_alt_nm2.equalsIgnoreCase(name)) {
			dlv_alt_nm2(value);
			return;
		}
		if ($dlv_alt_nm3.equalsIgnoreCase(name)) {
			dlv_alt_nm3(value);
			return;
		}
		if ($dlv_alt_nm4.equalsIgnoreCase(name)) {
			dlv_alt_nm4(value);
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
		if ($dlv_cntry_nm.equalsIgnoreCase(name)) {
			dlv_cntry_nm(value);
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
		if ($vssl_flght.equalsIgnoreCase(name)) {
			vssl_flght(value);
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
		if ($pl_rmrks.equalsIgnoreCase(name)) {
			pl_rmrks(value);
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
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			prnt_lcl_cd(value);
			return;
		}
		super.setString(name, value);
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

	public void setStringNE(String name, String value) {
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			co_nm(value);
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
		if ($co_tel.equalsIgnoreCase(name)) {
			co_tel(value);
			return;
		}
		if ($co_fax.equalsIgnoreCase(name)) {
			co_fax(value);
			return;
		}
		if ($co_cntry_nm.equalsIgnoreCase(name)) {
			co_cntry_nm(value);
			return;
		}
		if ($ship_rqst_id_typ.equalsIgnoreCase(name)) {
			ship_rqst_id_typ(value);
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
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			dlv_nm(value);
			return;
		}
		if ($dlv_alt_nm1.equalsIgnoreCase(name)) {
			dlv_alt_nm1(value);
			return;
		}
		if ($dlv_alt_nm2.equalsIgnoreCase(name)) {
			dlv_alt_nm2(value);
			return;
		}
		if ($dlv_alt_nm3.equalsIgnoreCase(name)) {
			dlv_alt_nm3(value);
			return;
		}
		if ($dlv_alt_nm4.equalsIgnoreCase(name)) {
			dlv_alt_nm4(value);
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
		if ($dlv_cntry_nm.equalsIgnoreCase(name)) {
			dlv_cntry_nm(value);
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
		if ($vssl_flght.equalsIgnoreCase(name)) {
			vssl_flght(value);
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
		if ($pl_rmrks.equalsIgnoreCase(name)) {
			pl_rmrks(value);
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
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			prnt_lcl_cd(value);
			return;
		}
		super.setStringNE(name, value);
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



}

