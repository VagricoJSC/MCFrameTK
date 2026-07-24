package mcframe.commonMSBC.MSBCR1010;

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
 * ブロック"MfgInstFtr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MfgInstFtrR_MC_A extends MCConstRow {

	/**
	 *  工程指図備考（ラベル）.<p>
	 *
	 */
	public static final String $oper_inst_rpt_rmrks_lbl = "oper_inst_rpt_rmrks_lbl";
	/**
	 *  工程指図備考.<p>
	 *
	 */
	public static final String $oper_inst_rpt_rmrks = "oper_inst_rpt_rmrks";
	/**
	 *  製造指図備考（ラベル）.<p>
	 *
	 */
	public static final String $mfg_inst_rpt_rmrks_lbl = "mfg_inst_rpt_rmrks_lbl";
	/**
	 *  製造指図備考.<p>
	 *
	 */
	public static final String $mfg_inst_rpt_rmrks = "mfg_inst_rpt_rmrks";
	/**
	 *  製造指図承認日（ラベル）.<p>
	 *
	 */
	public static final String $aprv_dt_lbl = "aprv_dt_lbl";
	/**
	 *  製造指図承認日.<p>
	 *
	 */
	public static final String $aprv_dt = "aprv_dt";
	/**
	 *  製造指図承認部門.<p>
	 *
	 */
	public static final String $aprv_dpt_cd = "aprv_dpt_cd";
	/**
	 *  製造指図承認部門名（ラベル）.<p>
	 *
	 */
	public static final String $aprv_dpt_nm_lbl = "aprv_dpt_nm_lbl";
	/**
	 *  製造指図承認部門名.<p>
	 *
	 */
	public static final String $aprv_dpt_nm = "aprv_dpt_nm";
	/**
	 *  製造指図承認者.<p>
	 *
	 */
	public static final String $aprv_usr_cd = "aprv_usr_cd";
	/**
	 *  製造指図承認者名（ラベル）.<p>
	 *
	 */
	public static final String $aprv_usr_nm_lbl = "aprv_usr_nm_lbl";
	/**
	 *  製造指図承認者名.<p>
	 *
	 */
	public static final String $aprv_usr_nm = "aprv_usr_nm";
	/**
	 *  理由（ラベル）.<p>
	 *
	 */
	public static final String $aprv_rsn_lbl = "aprv_rsn_lbl";
	/**
	 *  理由.<p>
	 *
	 */
	public static final String $aprv_rsn = "aprv_rsn";


	public static final MCMeta oper_inst_rpt_rmrks_lbl_META = createStringMeta($oper_inst_rpt_rmrks_lbl);
	public static final MCMeta oper_inst_rpt_rmrks_META = createCommonMeta($oper_inst_rpt_rmrks, mcframe.commonMS.meta.MS_META.OPER_INST_RPT_RMRKS);
	public static final MCMeta mfg_inst_rpt_rmrks_lbl_META = createStringMeta($mfg_inst_rpt_rmrks_lbl);
	public static final MCMeta mfg_inst_rpt_rmrks_META = createCommonMeta($mfg_inst_rpt_rmrks, mcframe.commonMS.meta.MS_META.MFG_INST_RPT_RMRKS);
	public static final MCMeta aprv_dt_lbl_META = createStringMeta($aprv_dt_lbl);
	public static final MCMeta aprv_dt_META = createCommonMeta($aprv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta aprv_dpt_cd_META = createCommonMeta($aprv_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta aprv_dpt_nm_lbl_META = createStringMeta($aprv_dpt_nm_lbl);
	public static final MCMeta aprv_dpt_nm_META = createCommonMeta($aprv_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta aprv_usr_cd_META = createCommonMeta($aprv_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta aprv_usr_nm_lbl_META = createStringMeta($aprv_usr_nm_lbl);
	public static final MCMeta aprv_usr_nm_META = createCommonMeta($aprv_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta aprv_rsn_lbl_META = createStringMeta($aprv_rsn_lbl);
	public static final MCMeta aprv_rsn_META = createCommonMeta($aprv_rsn, mcframe.commonMS.meta.MS_META.APRV_RSN);

	protected static final ConstMetaList<MfgInstFtrR> constMetas = new ConstMetaList<MfgInstFtrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			oper_inst_rpt_rmrks_lbl_META,
			oper_inst_rpt_rmrks_META,
			mfg_inst_rpt_rmrks_lbl_META,
			mfg_inst_rpt_rmrks_META,
			aprv_dt_lbl_META,
			aprv_dt_META,
			aprv_dpt_cd_META,
			aprv_dpt_nm_lbl_META,
			aprv_dpt_nm_META,
			aprv_usr_cd_META,
			aprv_usr_nm_lbl_META,
			aprv_usr_nm_META,
			aprv_rsn_lbl_META,
			aprv_rsn_META
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
	protected MfgInstFtrR_MC_A(ConstMetaList<? extends MfgInstFtrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstFtrR clone() {
		return (MfgInstFtrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstFtrR createInstance() {
		return (MfgInstFtrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstFtrR getValues(String... names) {
		return (MfgInstFtrR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  工程指図備考（ラベル）.<p>
	 *
	 */
	public String oper_inst_rpt_rmrks_lbl() {
		return getConstString(offset + 0, $oper_inst_rpt_rmrks_lbl);
	}

	/**
	 *  工程指図備考（ラベル）.<p>
	 *
	 */
	public void oper_inst_rpt_rmrks_lbl(String value) {
		setConstString(offset + 0, $oper_inst_rpt_rmrks_lbl, value);
	}


	/**
	 *  工程指図備考.<p>
	 *
	 */
	public String oper_inst_rpt_rmrks() {
		return getConstString(offset + 1, $oper_inst_rpt_rmrks);
	}

	/**
	 *  工程指図備考.<p>
	 *
	 */
	public void oper_inst_rpt_rmrks(String value) {
		setConstString(offset + 1, $oper_inst_rpt_rmrks, value);
	}


	/**
	 *  製造指図備考（ラベル）.<p>
	 *
	 */
	public String mfg_inst_rpt_rmrks_lbl() {
		return getConstString(offset + 2, $mfg_inst_rpt_rmrks_lbl);
	}

	/**
	 *  製造指図備考（ラベル）.<p>
	 *
	 */
	public void mfg_inst_rpt_rmrks_lbl(String value) {
		setConstString(offset + 2, $mfg_inst_rpt_rmrks_lbl, value);
	}


	/**
	 *  製造指図備考.<p>
	 *
	 */
	public String mfg_inst_rpt_rmrks() {
		return getConstString(offset + 3, $mfg_inst_rpt_rmrks);
	}

	/**
	 *  製造指図備考.<p>
	 *
	 */
	public void mfg_inst_rpt_rmrks(String value) {
		setConstString(offset + 3, $mfg_inst_rpt_rmrks, value);
	}


	/**
	 *  製造指図承認日（ラベル）.<p>
	 *
	 */
	public String aprv_dt_lbl() {
		return getConstString(offset + 4, $aprv_dt_lbl);
	}

	/**
	 *  製造指図承認日（ラベル）.<p>
	 *
	 */
	public void aprv_dt_lbl(String value) {
		setConstString(offset + 4, $aprv_dt_lbl, value);
	}


	/**
	 *  製造指図承認日.<p>
	 *
	 */
	public MCDate aprv_dt() {
		return getConstDate(offset + 5, $aprv_dt);
	}

	/**
	 *  製造指図承認日.<p>
	 *
	 */
	public void aprv_dt(MCDate value) {
		setConstDate(offset + 5, $aprv_dt, value);
	}


	/**
	 *  製造指図承認部門.<p>
	 *
	 */
	public String aprv_dpt_cd() {
		return getConstString(offset + 6, $aprv_dpt_cd);
	}

	/**
	 *  製造指図承認部門.<p>
	 *
	 */
	public void aprv_dpt_cd(String value) {
		setConstString(offset + 6, $aprv_dpt_cd, value);
	}


	/**
	 *  製造指図承認部門名（ラベル）.<p>
	 *
	 */
	public String aprv_dpt_nm_lbl() {
		return getConstString(offset + 7, $aprv_dpt_nm_lbl);
	}

	/**
	 *  製造指図承認部門名（ラベル）.<p>
	 *
	 */
	public void aprv_dpt_nm_lbl(String value) {
		setConstString(offset + 7, $aprv_dpt_nm_lbl, value);
	}


	/**
	 *  製造指図承認部門名.<p>
	 *
	 */
	public String aprv_dpt_nm() {
		return getConstString(offset + 8, $aprv_dpt_nm);
	}

	/**
	 *  製造指図承認部門名.<p>
	 *
	 */
	public void aprv_dpt_nm(String value) {
		setConstString(offset + 8, $aprv_dpt_nm, value);
	}


	/**
	 *  製造指図承認者.<p>
	 *
	 */
	public String aprv_usr_cd() {
		return getConstString(offset + 9, $aprv_usr_cd);
	}

	/**
	 *  製造指図承認者.<p>
	 *
	 */
	public void aprv_usr_cd(String value) {
		setConstString(offset + 9, $aprv_usr_cd, value);
	}


	/**
	 *  製造指図承認者名（ラベル）.<p>
	 *
	 */
	public String aprv_usr_nm_lbl() {
		return getConstString(offset + 10, $aprv_usr_nm_lbl);
	}

	/**
	 *  製造指図承認者名（ラベル）.<p>
	 *
	 */
	public void aprv_usr_nm_lbl(String value) {
		setConstString(offset + 10, $aprv_usr_nm_lbl, value);
	}


	/**
	 *  製造指図承認者名.<p>
	 *
	 */
	public String aprv_usr_nm() {
		return getConstString(offset + 11, $aprv_usr_nm);
	}

	/**
	 *  製造指図承認者名.<p>
	 *
	 */
	public void aprv_usr_nm(String value) {
		setConstString(offset + 11, $aprv_usr_nm, value);
	}


	/**
	 *  理由（ラベル）.<p>
	 *
	 */
	public String aprv_rsn_lbl() {
		return getConstString(offset + 12, $aprv_rsn_lbl);
	}

	/**
	 *  理由（ラベル）.<p>
	 *
	 */
	public void aprv_rsn_lbl(String value) {
		setConstString(offset + 12, $aprv_rsn_lbl, value);
	}


	/**
	 *  理由.<p>
	 *
	 */
	public String aprv_rsn() {
		return getConstString(offset + 13, $aprv_rsn);
	}

	/**
	 *  理由.<p>
	 *
	 */
	public void aprv_rsn(String value) {
		setConstString(offset + 13, $aprv_rsn, value);
	}


	public String getString(String name) {
		if ($oper_inst_rpt_rmrks_lbl.equalsIgnoreCase(name)) {
			return oper_inst_rpt_rmrks_lbl();
		}
		if ($oper_inst_rpt_rmrks.equalsIgnoreCase(name)) {
			return oper_inst_rpt_rmrks();
		}
		if ($mfg_inst_rpt_rmrks_lbl.equalsIgnoreCase(name)) {
			return mfg_inst_rpt_rmrks_lbl();
		}
		if ($mfg_inst_rpt_rmrks.equalsIgnoreCase(name)) {
			return mfg_inst_rpt_rmrks();
		}
		if ($aprv_dt_lbl.equalsIgnoreCase(name)) {
			return aprv_dt_lbl();
		}
		if ($aprv_dpt_cd.equalsIgnoreCase(name)) {
			return aprv_dpt_cd();
		}
		if ($aprv_dpt_nm_lbl.equalsIgnoreCase(name)) {
			return aprv_dpt_nm_lbl();
		}
		if ($aprv_dpt_nm.equalsIgnoreCase(name)) {
			return aprv_dpt_nm();
		}
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			return aprv_usr_cd();
		}
		if ($aprv_usr_nm_lbl.equalsIgnoreCase(name)) {
			return aprv_usr_nm_lbl();
		}
		if ($aprv_usr_nm.equalsIgnoreCase(name)) {
			return aprv_usr_nm();
		}
		if ($aprv_rsn_lbl.equalsIgnoreCase(name)) {
			return aprv_rsn_lbl();
		}
		if ($aprv_rsn.equalsIgnoreCase(name)) {
			return aprv_rsn();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($aprv_dt.equalsIgnoreCase(name)) {
			return aprv_dt();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($oper_inst_rpt_rmrks_lbl.equalsIgnoreCase(name)) {
			return oper_inst_rpt_rmrks_lbl();
		}
		if ($oper_inst_rpt_rmrks.equalsIgnoreCase(name)) {
			return oper_inst_rpt_rmrks();
		}
		if ($mfg_inst_rpt_rmrks_lbl.equalsIgnoreCase(name)) {
			return mfg_inst_rpt_rmrks_lbl();
		}
		if ($mfg_inst_rpt_rmrks.equalsIgnoreCase(name)) {
			return mfg_inst_rpt_rmrks();
		}
		if ($aprv_dt_lbl.equalsIgnoreCase(name)) {
			return aprv_dt_lbl();
		}
		if ($aprv_dpt_cd.equalsIgnoreCase(name)) {
			return aprv_dpt_cd();
		}
		if ($aprv_dpt_nm_lbl.equalsIgnoreCase(name)) {
			return aprv_dpt_nm_lbl();
		}
		if ($aprv_dpt_nm.equalsIgnoreCase(name)) {
			return aprv_dpt_nm();
		}
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			return aprv_usr_cd();
		}
		if ($aprv_usr_nm_lbl.equalsIgnoreCase(name)) {
			return aprv_usr_nm_lbl();
		}
		if ($aprv_usr_nm.equalsIgnoreCase(name)) {
			return aprv_usr_nm();
		}
		if ($aprv_rsn_lbl.equalsIgnoreCase(name)) {
			return aprv_rsn_lbl();
		}
		if ($aprv_rsn.equalsIgnoreCase(name)) {
			return aprv_rsn();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($aprv_dt.equalsIgnoreCase(name)) {
			return aprv_dt();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($oper_inst_rpt_rmrks_lbl.equalsIgnoreCase(name)) {
			oper_inst_rpt_rmrks_lbl(value);
			return;
		}
		if ($oper_inst_rpt_rmrks.equalsIgnoreCase(name)) {
			oper_inst_rpt_rmrks(value);
			return;
		}
		if ($mfg_inst_rpt_rmrks_lbl.equalsIgnoreCase(name)) {
			mfg_inst_rpt_rmrks_lbl(value);
			return;
		}
		if ($mfg_inst_rpt_rmrks.equalsIgnoreCase(name)) {
			mfg_inst_rpt_rmrks(value);
			return;
		}
		if ($aprv_dt_lbl.equalsIgnoreCase(name)) {
			aprv_dt_lbl(value);
			return;
		}
		if ($aprv_dpt_cd.equalsIgnoreCase(name)) {
			aprv_dpt_cd(value);
			return;
		}
		if ($aprv_dpt_nm_lbl.equalsIgnoreCase(name)) {
			aprv_dpt_nm_lbl(value);
			return;
		}
		if ($aprv_dpt_nm.equalsIgnoreCase(name)) {
			aprv_dpt_nm(value);
			return;
		}
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			aprv_usr_cd(value);
			return;
		}
		if ($aprv_usr_nm_lbl.equalsIgnoreCase(name)) {
			aprv_usr_nm_lbl(value);
			return;
		}
		if ($aprv_usr_nm.equalsIgnoreCase(name)) {
			aprv_usr_nm(value);
			return;
		}
		if ($aprv_rsn_lbl.equalsIgnoreCase(name)) {
			aprv_rsn_lbl(value);
			return;
		}
		if ($aprv_rsn.equalsIgnoreCase(name)) {
			aprv_rsn(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($aprv_dt.equalsIgnoreCase(name)) {
			aprv_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($oper_inst_rpt_rmrks_lbl.equalsIgnoreCase(name)) {
			oper_inst_rpt_rmrks_lbl(value);
			return;
		}
		if ($oper_inst_rpt_rmrks.equalsIgnoreCase(name)) {
			oper_inst_rpt_rmrks(value);
			return;
		}
		if ($mfg_inst_rpt_rmrks_lbl.equalsIgnoreCase(name)) {
			mfg_inst_rpt_rmrks_lbl(value);
			return;
		}
		if ($mfg_inst_rpt_rmrks.equalsIgnoreCase(name)) {
			mfg_inst_rpt_rmrks(value);
			return;
		}
		if ($aprv_dt_lbl.equalsIgnoreCase(name)) {
			aprv_dt_lbl(value);
			return;
		}
		if ($aprv_dpt_cd.equalsIgnoreCase(name)) {
			aprv_dpt_cd(value);
			return;
		}
		if ($aprv_dpt_nm_lbl.equalsIgnoreCase(name)) {
			aprv_dpt_nm_lbl(value);
			return;
		}
		if ($aprv_dpt_nm.equalsIgnoreCase(name)) {
			aprv_dpt_nm(value);
			return;
		}
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			aprv_usr_cd(value);
			return;
		}
		if ($aprv_usr_nm_lbl.equalsIgnoreCase(name)) {
			aprv_usr_nm_lbl(value);
			return;
		}
		if ($aprv_usr_nm.equalsIgnoreCase(name)) {
			aprv_usr_nm(value);
			return;
		}
		if ($aprv_rsn_lbl.equalsIgnoreCase(name)) {
			aprv_rsn_lbl(value);
			return;
		}
		if ($aprv_rsn.equalsIgnoreCase(name)) {
			aprv_rsn(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($aprv_dt.equalsIgnoreCase(name)) {
			aprv_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

