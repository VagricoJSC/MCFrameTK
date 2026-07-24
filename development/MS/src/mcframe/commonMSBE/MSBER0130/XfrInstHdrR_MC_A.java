package mcframe.commonMSBE.MSBER0130;

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
 * ブロック"XfrInstHdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class XfrInstHdrR_MC_A extends MCConstRow {

	/**
	 *  移動指図ＮＯ.<p>
	 *
	 */
	public static final String $xfr_inst_no = "xfr_inst_no";
	/**
	 *  取引.<p>
	 *
	 */
	public static final String $trd_nm = "trd_nm";
	/**
	 *  取引ＣＤ（データ）.<p>
	 *
	 */
	public static final String $trd_cd = "trd_cd";
	/**
	 *  指図日.<p>
	 *
	 */
	public static final String $xfr_inst_dt = "xfr_inst_dt";
	/**
	 *  発行日時.<p>
	 *
	 */
	public static final String $prnt_tm = "prnt_tm";
	/**
	 *  入庫場所（データ）.<p>
	 *
	 */
	public static final String $gr_loc_cd = "gr_loc_cd";
	/**
	 *  入庫場所名.<p>
	 *
	 */
	public static final String $gr_loc_nm = "gr_loc_nm";
	/**
	 *  入庫場所郵便番号.<p>
	 *
	 */
	public static final String $zip_cd = "zip_cd";
	/**
	 *  入庫場所ＴＥＬ.<p>
	 *
	 */
	public static final String $tel = "tel";
	/**
	 *  入庫場所住所１.<p>
	 *
	 */
	public static final String $addr1 = "addr1";
	/**
	 *  入庫場所住所２.<p>
	 *
	 */
	public static final String $addr2 = "addr2";
	/**
	 *  入庫場所住所３.<p>
	 *
	 */
	public static final String $addr3 = "addr3";
	/**
	 *  入庫場所住所４.<p>
	 *
	 */
	public static final String $addr4 = "addr4";
	/**
	 *  入庫場所住所.<p>
	 *
	 */
	public static final String $addr = "addr";
	/**
	 *  入庫場所国名.<p>
	 *
	 */
	public static final String $cntry_nm = "cntry_nm";
	/**
	 *  指図部門（データ）.<p>
	 *
	 */
	public static final String $inst_dpt_cd = "inst_dpt_cd";
	/**
	 *  指図部門名.<p>
	 *
	 */
	public static final String $inst_dpt_nm = "inst_dpt_nm";
	/**
	 *  担当者（データ）.<p>
	 *
	 */
	public static final String $inst_usr_cd = "inst_usr_cd";
	/**
	 *  担当者名.<p>
	 *
	 */
	public static final String $inst_usr_nm = "inst_usr_nm";
	/**
	 *  指図部門ＴＥＬ.<p>
	 *
	 */
	public static final String $inst_tel = "inst_tel";
	/**
	 *  移動予定日.<p>
	 *
	 */
	public static final String $xfr_schd_dt = "xfr_schd_dt";
	/**
	 *  伝票備考.<p>
	 *
	 */
	public static final String $inst_rmrks = "inst_rmrks";


	public static final MCMeta xfr_inst_no_META = createCommonMeta($xfr_inst_no, mcframe.commonMA.meta.MA_META.XFR_INST_NO);
	public static final MCMeta trd_nm_META = createCommonMeta($trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta xfr_inst_dt_META = createCommonMeta($xfr_inst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta prnt_tm_META = createCommonMeta($prnt_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta gr_loc_cd_META = createCommonMeta($gr_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta gr_loc_nm_META = createCommonMeta($gr_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta zip_cd_META = createCommonMeta($zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta tel_META = createCommonMeta($tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta addr1_META = createCommonMeta($addr1, mcframe.commonMA.meta.MA_META.ADDR1);
	public static final MCMeta addr2_META = createCommonMeta($addr2, mcframe.commonMA.meta.MA_META.ADDR2);
	public static final MCMeta addr3_META = createCommonMeta($addr3, mcframe.commonMA.meta.MA_META.ADDR3);
	public static final MCMeta addr4_META = createCommonMeta($addr4, mcframe.commonMA.meta.MA_META.ADDR4);
	public static final MCMeta addr_META = createStringMeta($addr);
	public static final MCMeta cntry_nm_META = createCommonMeta($cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta inst_dpt_cd_META = createCommonMeta($inst_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta inst_dpt_nm_META = createCommonMeta($inst_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta inst_usr_cd_META = createCommonMeta($inst_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta inst_usr_nm_META = createCommonMeta($inst_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta inst_tel_META = createCommonMeta($inst_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta xfr_schd_dt_META = createCommonMeta($xfr_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta inst_rmrks_META = createCommonMeta($inst_rmrks, mcframe.commonMS.meta.MS_META.XFR_INST_RMRKS);

	protected static final ConstMetaList<XfrInstHdrR> constMetas = new ConstMetaList<XfrInstHdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			xfr_inst_no_META,
			trd_nm_META,
			trd_cd_META,
			xfr_inst_dt_META,
			prnt_tm_META,
			gr_loc_cd_META,
			gr_loc_nm_META,
			zip_cd_META,
			tel_META,
			addr1_META,
			addr2_META,
			addr3_META,
			addr4_META,
			addr_META,
			cntry_nm_META,
			inst_dpt_cd_META,
			inst_dpt_nm_META,
			inst_usr_cd_META,
			inst_usr_nm_META,
			inst_tel_META,
			xfr_schd_dt_META,
			inst_rmrks_META
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
	protected XfrInstHdrR_MC_A(ConstMetaList<? extends XfrInstHdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public XfrInstHdrR clone() {
		return (XfrInstHdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public XfrInstHdrR createInstance() {
		return (XfrInstHdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public XfrInstHdrR getValues(String... names) {
		return (XfrInstHdrR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  移動指図ＮＯ.<p>
	 *
	 */
	public String xfr_inst_no() {
		return getConstString(offset + 0, $xfr_inst_no);
	}

	/**
	 *  移動指図ＮＯ.<p>
	 *
	 */
	public void xfr_inst_no(String value) {
		setConstString(offset + 0, $xfr_inst_no, value);
	}


	/**
	 *  取引.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 1, $trd_nm);
	}

	/**
	 *  取引.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 1, $trd_nm, value);
	}


	/**
	 *  取引ＣＤ（データ）.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 2, $trd_cd);
	}

	/**
	 *  取引ＣＤ（データ）.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 2, $trd_cd, value);
	}


	/**
	 *  指図日.<p>
	 *
	 */
	public MCDate xfr_inst_dt() {
		return getConstDate(offset + 3, $xfr_inst_dt);
	}

	/**
	 *  指図日.<p>
	 *
	 */
	public void xfr_inst_dt(MCDate value) {
		setConstDate(offset + 3, $xfr_inst_dt, value);
	}


	/**
	 *  発行日時.<p>
	 *
	 */
	public MCDate prnt_tm() {
		return getConstDate(offset + 4, $prnt_tm);
	}

	/**
	 *  発行日時.<p>
	 *
	 */
	public void prnt_tm(MCDate value) {
		setConstDate(offset + 4, $prnt_tm, value);
	}


	/**
	 *  入庫場所（データ）.<p>
	 *
	 */
	public String gr_loc_cd() {
		return getConstString(offset + 5, $gr_loc_cd);
	}

	/**
	 *  入庫場所（データ）.<p>
	 *
	 */
	public void gr_loc_cd(String value) {
		setConstString(offset + 5, $gr_loc_cd, value);
	}


	/**
	 *  入庫場所名.<p>
	 *
	 */
	public String gr_loc_nm() {
		return getConstString(offset + 6, $gr_loc_nm);
	}

	/**
	 *  入庫場所名.<p>
	 *
	 */
	public void gr_loc_nm(String value) {
		setConstString(offset + 6, $gr_loc_nm, value);
	}


	/**
	 *  入庫場所郵便番号.<p>
	 *
	 */
	public String zip_cd() {
		return getConstString(offset + 7, $zip_cd);
	}

	/**
	 *  入庫場所郵便番号.<p>
	 *
	 */
	public void zip_cd(String value) {
		setConstString(offset + 7, $zip_cd, value);
	}


	/**
	 *  入庫場所ＴＥＬ.<p>
	 *
	 */
	public String tel() {
		return getConstString(offset + 8, $tel);
	}

	/**
	 *  入庫場所ＴＥＬ.<p>
	 *
	 */
	public void tel(String value) {
		setConstString(offset + 8, $tel, value);
	}


	/**
	 *  入庫場所住所１.<p>
	 *
	 */
	public String addr1() {
		return getConstString(offset + 9, $addr1);
	}

	/**
	 *  入庫場所住所１.<p>
	 *
	 */
	public void addr1(String value) {
		setConstString(offset + 9, $addr1, value);
	}


	/**
	 *  入庫場所住所２.<p>
	 *
	 */
	public String addr2() {
		return getConstString(offset + 10, $addr2);
	}

	/**
	 *  入庫場所住所２.<p>
	 *
	 */
	public void addr2(String value) {
		setConstString(offset + 10, $addr2, value);
	}


	/**
	 *  入庫場所住所３.<p>
	 *
	 */
	public String addr3() {
		return getConstString(offset + 11, $addr3);
	}

	/**
	 *  入庫場所住所３.<p>
	 *
	 */
	public void addr3(String value) {
		setConstString(offset + 11, $addr3, value);
	}


	/**
	 *  入庫場所住所４.<p>
	 *
	 */
	public String addr4() {
		return getConstString(offset + 12, $addr4);
	}

	/**
	 *  入庫場所住所４.<p>
	 *
	 */
	public void addr4(String value) {
		setConstString(offset + 12, $addr4, value);
	}


	/**
	 *  入庫場所住所.<p>
	 *
	 */
	public String addr() {
		return getConstString(offset + 13, $addr);
	}

	/**
	 *  入庫場所住所.<p>
	 *
	 */
	public void addr(String value) {
		setConstString(offset + 13, $addr, value);
	}


	/**
	 *  入庫場所国名.<p>
	 *
	 */
	public String cntry_nm() {
		return getConstString(offset + 14, $cntry_nm);
	}

	/**
	 *  入庫場所国名.<p>
	 *
	 */
	public void cntry_nm(String value) {
		setConstString(offset + 14, $cntry_nm, value);
	}


	/**
	 *  指図部門（データ）.<p>
	 *
	 */
	public String inst_dpt_cd() {
		return getConstString(offset + 15, $inst_dpt_cd);
	}

	/**
	 *  指図部門（データ）.<p>
	 *
	 */
	public void inst_dpt_cd(String value) {
		setConstString(offset + 15, $inst_dpt_cd, value);
	}


	/**
	 *  指図部門名.<p>
	 *
	 */
	public String inst_dpt_nm() {
		return getConstString(offset + 16, $inst_dpt_nm);
	}

	/**
	 *  指図部門名.<p>
	 *
	 */
	public void inst_dpt_nm(String value) {
		setConstString(offset + 16, $inst_dpt_nm, value);
	}


	/**
	 *  担当者（データ）.<p>
	 *
	 */
	public String inst_usr_cd() {
		return getConstString(offset + 17, $inst_usr_cd);
	}

	/**
	 *  担当者（データ）.<p>
	 *
	 */
	public void inst_usr_cd(String value) {
		setConstString(offset + 17, $inst_usr_cd, value);
	}


	/**
	 *  担当者名.<p>
	 *
	 */
	public String inst_usr_nm() {
		return getConstString(offset + 18, $inst_usr_nm);
	}

	/**
	 *  担当者名.<p>
	 *
	 */
	public void inst_usr_nm(String value) {
		setConstString(offset + 18, $inst_usr_nm, value);
	}


	/**
	 *  指図部門ＴＥＬ.<p>
	 *
	 */
	public String inst_tel() {
		return getConstString(offset + 19, $inst_tel);
	}

	/**
	 *  指図部門ＴＥＬ.<p>
	 *
	 */
	public void inst_tel(String value) {
		setConstString(offset + 19, $inst_tel, value);
	}


	/**
	 *  移動予定日.<p>
	 *
	 */
	public MCDate xfr_schd_dt() {
		return getConstDate(offset + 20, $xfr_schd_dt);
	}

	/**
	 *  移動予定日.<p>
	 *
	 */
	public void xfr_schd_dt(MCDate value) {
		setConstDate(offset + 20, $xfr_schd_dt, value);
	}


	/**
	 *  伝票備考.<p>
	 *
	 */
	public String inst_rmrks() {
		return getConstString(offset + 21, $inst_rmrks);
	}

	/**
	 *  伝票備考.<p>
	 *
	 */
	public void inst_rmrks(String value) {
		setConstString(offset + 21, $inst_rmrks, value);
	}


	public String getString(String name) {
		if ($xfr_inst_no.equalsIgnoreCase(name)) {
			return xfr_inst_no();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($gr_loc_cd.equalsIgnoreCase(name)) {
			return gr_loc_cd();
		}
		if ($gr_loc_nm.equalsIgnoreCase(name)) {
			return gr_loc_nm();
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			return zip_cd();
		}
		if ($tel.equalsIgnoreCase(name)) {
			return tel();
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
		if ($addr.equalsIgnoreCase(name)) {
			return addr();
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			return cntry_nm();
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			return inst_dpt_cd();
		}
		if ($inst_dpt_nm.equalsIgnoreCase(name)) {
			return inst_dpt_nm();
		}
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			return inst_usr_cd();
		}
		if ($inst_usr_nm.equalsIgnoreCase(name)) {
			return inst_usr_nm();
		}
		if ($inst_tel.equalsIgnoreCase(name)) {
			return inst_tel();
		}
		if ($inst_rmrks.equalsIgnoreCase(name)) {
			return inst_rmrks();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($xfr_inst_dt.equalsIgnoreCase(name)) {
			return xfr_inst_dt();
		}
		if ($prnt_tm.equalsIgnoreCase(name)) {
			return prnt_tm();
		}
		if ($xfr_schd_dt.equalsIgnoreCase(name)) {
			return xfr_schd_dt();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($xfr_inst_no.equalsIgnoreCase(name)) {
			return xfr_inst_no();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($gr_loc_cd.equalsIgnoreCase(name)) {
			return gr_loc_cd();
		}
		if ($gr_loc_nm.equalsIgnoreCase(name)) {
			return gr_loc_nm();
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			return zip_cd();
		}
		if ($tel.equalsIgnoreCase(name)) {
			return tel();
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
		if ($addr.equalsIgnoreCase(name)) {
			return addr();
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			return cntry_nm();
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			return inst_dpt_cd();
		}
		if ($inst_dpt_nm.equalsIgnoreCase(name)) {
			return inst_dpt_nm();
		}
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			return inst_usr_cd();
		}
		if ($inst_usr_nm.equalsIgnoreCase(name)) {
			return inst_usr_nm();
		}
		if ($inst_tel.equalsIgnoreCase(name)) {
			return inst_tel();
		}
		if ($inst_rmrks.equalsIgnoreCase(name)) {
			return inst_rmrks();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($xfr_inst_dt.equalsIgnoreCase(name)) {
			return xfr_inst_dt();
		}
		if ($prnt_tm.equalsIgnoreCase(name)) {
			return prnt_tm();
		}
		if ($xfr_schd_dt.equalsIgnoreCase(name)) {
			return xfr_schd_dt();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($xfr_inst_no.equalsIgnoreCase(name)) {
			xfr_inst_no(value);
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
		if ($gr_loc_cd.equalsIgnoreCase(name)) {
			gr_loc_cd(value);
			return;
		}
		if ($gr_loc_nm.equalsIgnoreCase(name)) {
			gr_loc_nm(value);
			return;
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			zip_cd(value);
			return;
		}
		if ($tel.equalsIgnoreCase(name)) {
			tel(value);
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
		if ($addr.equalsIgnoreCase(name)) {
			addr(value);
			return;
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			cntry_nm(value);
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
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			inst_usr_cd(value);
			return;
		}
		if ($inst_usr_nm.equalsIgnoreCase(name)) {
			inst_usr_nm(value);
			return;
		}
		if ($inst_tel.equalsIgnoreCase(name)) {
			inst_tel(value);
			return;
		}
		if ($inst_rmrks.equalsIgnoreCase(name)) {
			inst_rmrks(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($xfr_inst_dt.equalsIgnoreCase(name)) {
			xfr_inst_dt(value);
			return;
		}
		if ($prnt_tm.equalsIgnoreCase(name)) {
			prnt_tm(value);
			return;
		}
		if ($xfr_schd_dt.equalsIgnoreCase(name)) {
			xfr_schd_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($xfr_inst_no.equalsIgnoreCase(name)) {
			xfr_inst_no(value);
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
		if ($gr_loc_cd.equalsIgnoreCase(name)) {
			gr_loc_cd(value);
			return;
		}
		if ($gr_loc_nm.equalsIgnoreCase(name)) {
			gr_loc_nm(value);
			return;
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			zip_cd(value);
			return;
		}
		if ($tel.equalsIgnoreCase(name)) {
			tel(value);
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
		if ($addr.equalsIgnoreCase(name)) {
			addr(value);
			return;
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			cntry_nm(value);
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
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			inst_usr_cd(value);
			return;
		}
		if ($inst_usr_nm.equalsIgnoreCase(name)) {
			inst_usr_nm(value);
			return;
		}
		if ($inst_tel.equalsIgnoreCase(name)) {
			inst_tel(value);
			return;
		}
		if ($inst_rmrks.equalsIgnoreCase(name)) {
			inst_rmrks(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($xfr_inst_dt.equalsIgnoreCase(name)) {
			xfr_inst_dt(value);
			return;
		}
		if ($prnt_tm.equalsIgnoreCase(name)) {
			prnt_tm(value);
			return;
		}
		if ($xfr_schd_dt.equalsIgnoreCase(name)) {
			xfr_schd_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

