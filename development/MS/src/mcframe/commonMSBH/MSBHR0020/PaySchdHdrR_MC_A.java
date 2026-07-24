package mcframe.commonMSBH.MSBHR0020;

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
 * ブロック"PaySchdHdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class PaySchdHdrR_MC_A extends MCConstRow {

	/**
	 *  発行日時.<p>
	 *
	 */
	public static final String $prnt_tm = "prnt_tm";
	/**
	 *  支払照合ＮＯ.<p>
	 *
	 */
	public static final String $pay_chk_no = "pay_chk_no";
	/**
	 *  支払先ＣＤ.<p>
	 *
	 */
	public static final String $psppl_cd = "psppl_cd";
	/**
	 *  支払先名.<p>
	 *
	 */
	public static final String $psppl_nm = "psppl_nm";
	/**
	 *  支払先別名１.<p>
	 *
	 */
	public static final String $psppl_alt_nm1 = "psppl_alt_nm1";
	/**
	 *  支払先別名２.<p>
	 *
	 */
	public static final String $psppl_alt_nm2 = "psppl_alt_nm2";
	/**
	 *  支払先別名３.<p>
	 *
	 */
	public static final String $psppl_alt_nm3 = "psppl_alt_nm3";
	/**
	 *  支払先別名４.<p>
	 *
	 */
	public static final String $psppl_alt_nm4 = "psppl_alt_nm4";
	/**
	 *  支払予定管理先ＣＤ.<p>
	 *
	 */
	public static final String $bsppl_cd = "bsppl_cd";
	/**
	 *  支払予定管理先名.<p>
	 *
	 */
	public static final String $bsppl_nm = "bsppl_nm";
	/**
	 *  支払予定管理先別名１.<p>
	 *
	 */
	public static final String $bsppl_alt_nm1 = "bsppl_alt_nm1";
	/**
	 *  支払予定管理先別名２.<p>
	 *
	 */
	public static final String $bsppl_alt_nm2 = "bsppl_alt_nm2";
	/**
	 *  支払予定管理先別名３.<p>
	 *
	 */
	public static final String $bsppl_alt_nm3 = "bsppl_alt_nm3";
	/**
	 *  支払予定管理先別名４.<p>
	 *
	 */
	public static final String $bsppl_alt_nm4 = "bsppl_alt_nm4";
	/**
	 *  支払先備考.<p>
	 *
	 */
	public static final String $psppl_rmrks = "psppl_rmrks";
	/**
	 *  支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public static final String $bsppl_dpt_cd = "bsppl_dpt_cd";
	/**
	 *  支払予定管理先担当部門名.<p>
	 *
	 */
	public static final String $bsppl_dpt_nm = "bsppl_dpt_nm";
	/**
	 *  支払予定管理先担当者ＣＤ.<p>
	 *
	 */
	public static final String $bsppl_usr_cd = "bsppl_usr_cd";
	/**
	 *  支払予定管理先担当者名.<p>
	 *
	 */
	public static final String $bsppl_usr_nm = "bsppl_usr_nm";
	/**
	 *  ヘッダ備考.<p>
	 *
	 */
	public static final String $pay_schd_d_print_hdr_rmrks = "pay_schd_d_print_hdr_rmrks";


	public static final MCMeta prnt_tm_META = createCommonMeta($prnt_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta pay_chk_no_META = createCommonMeta($pay_chk_no, mcframe.commonMA.meta.MA_META.PAY_CHK_NO);
	public static final MCMeta psppl_cd_META = createCommonMeta($psppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta psppl_nm_META = createCommonMeta($psppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta psppl_alt_nm1_META = createCommonMeta($psppl_alt_nm1, mcframe.commonMA.meta.MA_META.BP_ALT_NM1);
	public static final MCMeta psppl_alt_nm2_META = createCommonMeta($psppl_alt_nm2, mcframe.commonMA.meta.MA_META.BP_ALT_NM2);
	public static final MCMeta psppl_alt_nm3_META = createCommonMeta($psppl_alt_nm3, mcframe.commonMA.meta.MA_META.BP_ALT_NM3);
	public static final MCMeta psppl_alt_nm4_META = createCommonMeta($psppl_alt_nm4, mcframe.commonMA.meta.MA_META.BP_ALT_NM4);
	public static final MCMeta bsppl_cd_META = createCommonMeta($bsppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bsppl_nm_META = createCommonMeta($bsppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bsppl_alt_nm1_META = createCommonMeta($bsppl_alt_nm1, mcframe.commonMA.meta.MA_META.BP_ALT_NM1);
	public static final MCMeta bsppl_alt_nm2_META = createCommonMeta($bsppl_alt_nm2, mcframe.commonMA.meta.MA_META.BP_ALT_NM2);
	public static final MCMeta bsppl_alt_nm3_META = createCommonMeta($bsppl_alt_nm3, mcframe.commonMA.meta.MA_META.BP_ALT_NM3);
	public static final MCMeta bsppl_alt_nm4_META = createCommonMeta($bsppl_alt_nm4, mcframe.commonMA.meta.MA_META.BP_ALT_NM4);
	public static final MCMeta psppl_rmrks_META = createCommonMeta($psppl_rmrks, mcframe.commonMA.meta.MA_META.PSPPL_RMRKS);
	public static final MCMeta bsppl_dpt_cd_META = createCommonMeta($bsppl_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bsppl_dpt_nm_META = createCommonMeta($bsppl_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta bsppl_usr_cd_META = createCommonMeta($bsppl_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta bsppl_usr_nm_META = createCommonMeta($bsppl_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta pay_schd_d_print_hdr_rmrks_META = createCommonMeta($pay_schd_d_print_hdr_rmrks, mcframe.commonMS.meta.MS_META.PAY_SCHD_D_PRINT_HDR_RMRKS);

	protected static final ConstMetaList<PaySchdHdrR> constMetas = new ConstMetaList<PaySchdHdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			prnt_tm_META,
			pay_chk_no_META,
			psppl_cd_META,
			psppl_nm_META,
			psppl_alt_nm1_META,
			psppl_alt_nm2_META,
			psppl_alt_nm3_META,
			psppl_alt_nm4_META,
			bsppl_cd_META,
			bsppl_nm_META,
			bsppl_alt_nm1_META,
			bsppl_alt_nm2_META,
			bsppl_alt_nm3_META,
			bsppl_alt_nm4_META,
			psppl_rmrks_META,
			bsppl_dpt_cd_META,
			bsppl_dpt_nm_META,
			bsppl_usr_cd_META,
			bsppl_usr_nm_META,
			pay_schd_d_print_hdr_rmrks_META
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
	protected PaySchdHdrR_MC_A(ConstMetaList<? extends PaySchdHdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PaySchdHdrR clone() {
		return (PaySchdHdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PaySchdHdrR createInstance() {
		return (PaySchdHdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PaySchdHdrR getValues(String... names) {
		return (PaySchdHdrR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  発行日時.<p>
	 *
	 */
	public MCDate prnt_tm() {
		return getConstDate(offset + 0, $prnt_tm);
	}

	/**
	 *  発行日時.<p>
	 *
	 */
	public void prnt_tm(MCDate value) {
		setConstDate(offset + 0, $prnt_tm, value);
	}


	/**
	 *  支払照合ＮＯ.<p>
	 *
	 */
	public String pay_chk_no() {
		return getConstString(offset + 1, $pay_chk_no);
	}

	/**
	 *  支払照合ＮＯ.<p>
	 *
	 */
	public void pay_chk_no(String value) {
		setConstString(offset + 1, $pay_chk_no, value);
	}


	/**
	 *  支払先ＣＤ.<p>
	 *
	 */
	public String psppl_cd() {
		return getConstString(offset + 2, $psppl_cd);
	}

	/**
	 *  支払先ＣＤ.<p>
	 *
	 */
	public void psppl_cd(String value) {
		setConstString(offset + 2, $psppl_cd, value);
	}


	/**
	 *  支払先名.<p>
	 *
	 */
	public String psppl_nm() {
		return getConstString(offset + 3, $psppl_nm);
	}

	/**
	 *  支払先名.<p>
	 *
	 */
	public void psppl_nm(String value) {
		setConstString(offset + 3, $psppl_nm, value);
	}


	/**
	 *  支払先別名１.<p>
	 *
	 */
	public String psppl_alt_nm1() {
		return getConstString(offset + 4, $psppl_alt_nm1);
	}

	/**
	 *  支払先別名１.<p>
	 *
	 */
	public void psppl_alt_nm1(String value) {
		setConstString(offset + 4, $psppl_alt_nm1, value);
	}


	/**
	 *  支払先別名２.<p>
	 *
	 */
	public String psppl_alt_nm2() {
		return getConstString(offset + 5, $psppl_alt_nm2);
	}

	/**
	 *  支払先別名２.<p>
	 *
	 */
	public void psppl_alt_nm2(String value) {
		setConstString(offset + 5, $psppl_alt_nm2, value);
	}


	/**
	 *  支払先別名３.<p>
	 *
	 */
	public String psppl_alt_nm3() {
		return getConstString(offset + 6, $psppl_alt_nm3);
	}

	/**
	 *  支払先別名３.<p>
	 *
	 */
	public void psppl_alt_nm3(String value) {
		setConstString(offset + 6, $psppl_alt_nm3, value);
	}


	/**
	 *  支払先別名４.<p>
	 *
	 */
	public String psppl_alt_nm4() {
		return getConstString(offset + 7, $psppl_alt_nm4);
	}

	/**
	 *  支払先別名４.<p>
	 *
	 */
	public void psppl_alt_nm4(String value) {
		setConstString(offset + 7, $psppl_alt_nm4, value);
	}


	/**
	 *  支払予定管理先ＣＤ.<p>
	 *
	 */
	public String bsppl_cd() {
		return getConstString(offset + 8, $bsppl_cd);
	}

	/**
	 *  支払予定管理先ＣＤ.<p>
	 *
	 */
	public void bsppl_cd(String value) {
		setConstString(offset + 8, $bsppl_cd, value);
	}


	/**
	 *  支払予定管理先名.<p>
	 *
	 */
	public String bsppl_nm() {
		return getConstString(offset + 9, $bsppl_nm);
	}

	/**
	 *  支払予定管理先名.<p>
	 *
	 */
	public void bsppl_nm(String value) {
		setConstString(offset + 9, $bsppl_nm, value);
	}


	/**
	 *  支払予定管理先別名１.<p>
	 *
	 */
	public String bsppl_alt_nm1() {
		return getConstString(offset + 10, $bsppl_alt_nm1);
	}

	/**
	 *  支払予定管理先別名１.<p>
	 *
	 */
	public void bsppl_alt_nm1(String value) {
		setConstString(offset + 10, $bsppl_alt_nm1, value);
	}


	/**
	 *  支払予定管理先別名２.<p>
	 *
	 */
	public String bsppl_alt_nm2() {
		return getConstString(offset + 11, $bsppl_alt_nm2);
	}

	/**
	 *  支払予定管理先別名２.<p>
	 *
	 */
	public void bsppl_alt_nm2(String value) {
		setConstString(offset + 11, $bsppl_alt_nm2, value);
	}


	/**
	 *  支払予定管理先別名３.<p>
	 *
	 */
	public String bsppl_alt_nm3() {
		return getConstString(offset + 12, $bsppl_alt_nm3);
	}

	/**
	 *  支払予定管理先別名３.<p>
	 *
	 */
	public void bsppl_alt_nm3(String value) {
		setConstString(offset + 12, $bsppl_alt_nm3, value);
	}


	/**
	 *  支払予定管理先別名４.<p>
	 *
	 */
	public String bsppl_alt_nm4() {
		return getConstString(offset + 13, $bsppl_alt_nm4);
	}

	/**
	 *  支払予定管理先別名４.<p>
	 *
	 */
	public void bsppl_alt_nm4(String value) {
		setConstString(offset + 13, $bsppl_alt_nm4, value);
	}


	/**
	 *  支払先備考.<p>
	 *
	 */
	public String psppl_rmrks() {
		return getConstString(offset + 14, $psppl_rmrks);
	}

	/**
	 *  支払先備考.<p>
	 *
	 */
	public void psppl_rmrks(String value) {
		setConstString(offset + 14, $psppl_rmrks, value);
	}


	/**
	 *  支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public String bsppl_dpt_cd() {
		return getConstString(offset + 15, $bsppl_dpt_cd);
	}

	/**
	 *  支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public void bsppl_dpt_cd(String value) {
		setConstString(offset + 15, $bsppl_dpt_cd, value);
	}


	/**
	 *  支払予定管理先担当部門名.<p>
	 *
	 */
	public String bsppl_dpt_nm() {
		return getConstString(offset + 16, $bsppl_dpt_nm);
	}

	/**
	 *  支払予定管理先担当部門名.<p>
	 *
	 */
	public void bsppl_dpt_nm(String value) {
		setConstString(offset + 16, $bsppl_dpt_nm, value);
	}


	/**
	 *  支払予定管理先担当者ＣＤ.<p>
	 *
	 */
	public String bsppl_usr_cd() {
		return getConstString(offset + 17, $bsppl_usr_cd);
	}

	/**
	 *  支払予定管理先担当者ＣＤ.<p>
	 *
	 */
	public void bsppl_usr_cd(String value) {
		setConstString(offset + 17, $bsppl_usr_cd, value);
	}


	/**
	 *  支払予定管理先担当者名.<p>
	 *
	 */
	public String bsppl_usr_nm() {
		return getConstString(offset + 18, $bsppl_usr_nm);
	}

	/**
	 *  支払予定管理先担当者名.<p>
	 *
	 */
	public void bsppl_usr_nm(String value) {
		setConstString(offset + 18, $bsppl_usr_nm, value);
	}


	/**
	 *  ヘッダ備考.<p>
	 *
	 */
	public String pay_schd_d_print_hdr_rmrks() {
		return getConstString(offset + 19, $pay_schd_d_print_hdr_rmrks);
	}

	/**
	 *  ヘッダ備考.<p>
	 *
	 */
	public void pay_schd_d_print_hdr_rmrks(String value) {
		setConstString(offset + 19, $pay_schd_d_print_hdr_rmrks, value);
	}


	public String getString(String name) {
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			return pay_chk_no();
		}
		if ($psppl_cd.equalsIgnoreCase(name)) {
			return psppl_cd();
		}
		if ($psppl_nm.equalsIgnoreCase(name)) {
			return psppl_nm();
		}
		if ($psppl_alt_nm1.equalsIgnoreCase(name)) {
			return psppl_alt_nm1();
		}
		if ($psppl_alt_nm2.equalsIgnoreCase(name)) {
			return psppl_alt_nm2();
		}
		if ($psppl_alt_nm3.equalsIgnoreCase(name)) {
			return psppl_alt_nm3();
		}
		if ($psppl_alt_nm4.equalsIgnoreCase(name)) {
			return psppl_alt_nm4();
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			return bsppl_cd();
		}
		if ($bsppl_nm.equalsIgnoreCase(name)) {
			return bsppl_nm();
		}
		if ($bsppl_alt_nm1.equalsIgnoreCase(name)) {
			return bsppl_alt_nm1();
		}
		if ($bsppl_alt_nm2.equalsIgnoreCase(name)) {
			return bsppl_alt_nm2();
		}
		if ($bsppl_alt_nm3.equalsIgnoreCase(name)) {
			return bsppl_alt_nm3();
		}
		if ($bsppl_alt_nm4.equalsIgnoreCase(name)) {
			return bsppl_alt_nm4();
		}
		if ($psppl_rmrks.equalsIgnoreCase(name)) {
			return psppl_rmrks();
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			return bsppl_dpt_cd();
		}
		if ($bsppl_dpt_nm.equalsIgnoreCase(name)) {
			return bsppl_dpt_nm();
		}
		if ($bsppl_usr_cd.equalsIgnoreCase(name)) {
			return bsppl_usr_cd();
		}
		if ($bsppl_usr_nm.equalsIgnoreCase(name)) {
			return bsppl_usr_nm();
		}
		if ($pay_schd_d_print_hdr_rmrks.equalsIgnoreCase(name)) {
			return pay_schd_d_print_hdr_rmrks();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($prnt_tm.equalsIgnoreCase(name)) {
			return prnt_tm();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			return pay_chk_no();
		}
		if ($psppl_cd.equalsIgnoreCase(name)) {
			return psppl_cd();
		}
		if ($psppl_nm.equalsIgnoreCase(name)) {
			return psppl_nm();
		}
		if ($psppl_alt_nm1.equalsIgnoreCase(name)) {
			return psppl_alt_nm1();
		}
		if ($psppl_alt_nm2.equalsIgnoreCase(name)) {
			return psppl_alt_nm2();
		}
		if ($psppl_alt_nm3.equalsIgnoreCase(name)) {
			return psppl_alt_nm3();
		}
		if ($psppl_alt_nm4.equalsIgnoreCase(name)) {
			return psppl_alt_nm4();
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			return bsppl_cd();
		}
		if ($bsppl_nm.equalsIgnoreCase(name)) {
			return bsppl_nm();
		}
		if ($bsppl_alt_nm1.equalsIgnoreCase(name)) {
			return bsppl_alt_nm1();
		}
		if ($bsppl_alt_nm2.equalsIgnoreCase(name)) {
			return bsppl_alt_nm2();
		}
		if ($bsppl_alt_nm3.equalsIgnoreCase(name)) {
			return bsppl_alt_nm3();
		}
		if ($bsppl_alt_nm4.equalsIgnoreCase(name)) {
			return bsppl_alt_nm4();
		}
		if ($psppl_rmrks.equalsIgnoreCase(name)) {
			return psppl_rmrks();
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			return bsppl_dpt_cd();
		}
		if ($bsppl_dpt_nm.equalsIgnoreCase(name)) {
			return bsppl_dpt_nm();
		}
		if ($bsppl_usr_cd.equalsIgnoreCase(name)) {
			return bsppl_usr_cd();
		}
		if ($bsppl_usr_nm.equalsIgnoreCase(name)) {
			return bsppl_usr_nm();
		}
		if ($pay_schd_d_print_hdr_rmrks.equalsIgnoreCase(name)) {
			return pay_schd_d_print_hdr_rmrks();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($prnt_tm.equalsIgnoreCase(name)) {
			return prnt_tm();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			pay_chk_no(value);
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
		if ($psppl_alt_nm1.equalsIgnoreCase(name)) {
			psppl_alt_nm1(value);
			return;
		}
		if ($psppl_alt_nm2.equalsIgnoreCase(name)) {
			psppl_alt_nm2(value);
			return;
		}
		if ($psppl_alt_nm3.equalsIgnoreCase(name)) {
			psppl_alt_nm3(value);
			return;
		}
		if ($psppl_alt_nm4.equalsIgnoreCase(name)) {
			psppl_alt_nm4(value);
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
		if ($bsppl_alt_nm1.equalsIgnoreCase(name)) {
			bsppl_alt_nm1(value);
			return;
		}
		if ($bsppl_alt_nm2.equalsIgnoreCase(name)) {
			bsppl_alt_nm2(value);
			return;
		}
		if ($bsppl_alt_nm3.equalsIgnoreCase(name)) {
			bsppl_alt_nm3(value);
			return;
		}
		if ($bsppl_alt_nm4.equalsIgnoreCase(name)) {
			bsppl_alt_nm4(value);
			return;
		}
		if ($psppl_rmrks.equalsIgnoreCase(name)) {
			psppl_rmrks(value);
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
		if ($bsppl_usr_cd.equalsIgnoreCase(name)) {
			bsppl_usr_cd(value);
			return;
		}
		if ($bsppl_usr_nm.equalsIgnoreCase(name)) {
			bsppl_usr_nm(value);
			return;
		}
		if ($pay_schd_d_print_hdr_rmrks.equalsIgnoreCase(name)) {
			pay_schd_d_print_hdr_rmrks(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($prnt_tm.equalsIgnoreCase(name)) {
			prnt_tm(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			pay_chk_no(value);
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
		if ($psppl_alt_nm1.equalsIgnoreCase(name)) {
			psppl_alt_nm1(value);
			return;
		}
		if ($psppl_alt_nm2.equalsIgnoreCase(name)) {
			psppl_alt_nm2(value);
			return;
		}
		if ($psppl_alt_nm3.equalsIgnoreCase(name)) {
			psppl_alt_nm3(value);
			return;
		}
		if ($psppl_alt_nm4.equalsIgnoreCase(name)) {
			psppl_alt_nm4(value);
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
		if ($bsppl_alt_nm1.equalsIgnoreCase(name)) {
			bsppl_alt_nm1(value);
			return;
		}
		if ($bsppl_alt_nm2.equalsIgnoreCase(name)) {
			bsppl_alt_nm2(value);
			return;
		}
		if ($bsppl_alt_nm3.equalsIgnoreCase(name)) {
			bsppl_alt_nm3(value);
			return;
		}
		if ($bsppl_alt_nm4.equalsIgnoreCase(name)) {
			bsppl_alt_nm4(value);
			return;
		}
		if ($psppl_rmrks.equalsIgnoreCase(name)) {
			psppl_rmrks(value);
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
		if ($bsppl_usr_cd.equalsIgnoreCase(name)) {
			bsppl_usr_cd(value);
			return;
		}
		if ($bsppl_usr_nm.equalsIgnoreCase(name)) {
			bsppl_usr_nm(value);
			return;
		}
		if ($pay_schd_d_print_hdr_rmrks.equalsIgnoreCase(name)) {
			pay_schd_d_print_hdr_rmrks(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($prnt_tm.equalsIgnoreCase(name)) {
			prnt_tm(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

