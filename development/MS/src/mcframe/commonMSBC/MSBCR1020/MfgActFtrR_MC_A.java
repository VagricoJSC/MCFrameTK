package mcframe.commonMSBC.MSBCR1020;

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
 * ブロック"MfgActFtr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MfgActFtrR_MC_A extends MCConstRow {

	/**
	 *  工程実績備考（ラベル）.<p>
	 *
	 */
	public static final String $oper_act_rpt_rmrks_lbl = "oper_act_rpt_rmrks_lbl";
	/**
	 *  工程実績備考.<p>
	 *
	 */
	public static final String $oper_act_rpt_rmrks = "oper_act_rpt_rmrks";
	/**
	 *  製造実績備考（ラベル）.<p>
	 *
	 */
	public static final String $mfg_act_rpt_rmrks_lbl = "mfg_act_rpt_rmrks_lbl";
	/**
	 *  製造実績備考.<p>
	 *
	 */
	public static final String $mfg_act_rpt_rmrks = "mfg_act_rpt_rmrks";
	/**
	 *  製造記録承認日（ラベル）.<p>
	 *
	 */
	public static final String $mfg_act_aprv_dt_lbl = "mfg_act_aprv_dt_lbl";
	/**
	 *  製造記録承認日.<p>
	 *
	 */
	public static final String $mfg_act_aprv_dt = "mfg_act_aprv_dt";
	/**
	 *  製造記録承認部門名（ラベル）.<p>
	 *
	 */
	public static final String $mfg_act_dpt_nm_lbl = "mfg_act_dpt_nm_lbl";
	/**
	 *  製造記録承認部門名.<p>
	 *
	 */
	public static final String $mfg_act_dpt_nm = "mfg_act_dpt_nm";
	/**
	 *  製造記録承認者名（ラベル）.<p>
	 *
	 */
	public static final String $mfg_act_usr_nm_lbl = "mfg_act_usr_nm_lbl";
	/**
	 *  製造記録承認者名.<p>
	 *
	 */
	public static final String $mfg_act_usr_nm = "mfg_act_usr_nm";
	/**
	 *  理由（ラベル）.<p>
	 *
	 */
	public static final String $mfg_aprv_rsn_lbl = "mfg_aprv_rsn_lbl";
	/**
	 *  理由.<p>
	 *
	 */
	public static final String $mfg_aprv_rsn = "mfg_aprv_rsn";


	public static final MCMeta oper_act_rpt_rmrks_lbl_META = createStringMeta($oper_act_rpt_rmrks_lbl);
	public static final MCMeta oper_act_rpt_rmrks_META = createCommonMeta($oper_act_rpt_rmrks, mcframe.commonMS.meta.MS_META.OPER_ACT_RPT_RMRKS);
	public static final MCMeta mfg_act_rpt_rmrks_lbl_META = createStringMeta($mfg_act_rpt_rmrks_lbl);
	public static final MCMeta mfg_act_rpt_rmrks_META = createCommonMeta($mfg_act_rpt_rmrks, mcframe.commonMS.meta.MS_META.MFG_ACT_RPT_RMRKS);
	public static final MCMeta mfg_act_aprv_dt_lbl_META = createStringMeta($mfg_act_aprv_dt_lbl);
	public static final MCMeta mfg_act_aprv_dt_META = createCommonMeta($mfg_act_aprv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mfg_act_dpt_nm_lbl_META = createStringMeta($mfg_act_dpt_nm_lbl);
	public static final MCMeta mfg_act_dpt_nm_META = createCommonMeta($mfg_act_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta mfg_act_usr_nm_lbl_META = createStringMeta($mfg_act_usr_nm_lbl);
	public static final MCMeta mfg_act_usr_nm_META = createCommonMeta($mfg_act_usr_nm, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta mfg_aprv_rsn_lbl_META = createStringMeta($mfg_aprv_rsn_lbl);
	public static final MCMeta mfg_aprv_rsn_META = createCommonMeta($mfg_aprv_rsn, mcframe.commonMS.meta.MS_META.APRV_RSN);

	protected static final ConstMetaList<MfgActFtrR> constMetas = new ConstMetaList<MfgActFtrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			oper_act_rpt_rmrks_lbl_META,
			oper_act_rpt_rmrks_META,
			mfg_act_rpt_rmrks_lbl_META,
			mfg_act_rpt_rmrks_META,
			mfg_act_aprv_dt_lbl_META,
			mfg_act_aprv_dt_META,
			mfg_act_dpt_nm_lbl_META,
			mfg_act_dpt_nm_META,
			mfg_act_usr_nm_lbl_META,
			mfg_act_usr_nm_META,
			mfg_aprv_rsn_lbl_META,
			mfg_aprv_rsn_META
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
	protected MfgActFtrR_MC_A(ConstMetaList<? extends MfgActFtrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgActFtrR clone() {
		return (MfgActFtrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgActFtrR createInstance() {
		return (MfgActFtrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgActFtrR getValues(String... names) {
		return (MfgActFtrR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  工程実績備考（ラベル）.<p>
	 *
	 */
	public String oper_act_rpt_rmrks_lbl() {
		return getConstString(offset + 0, $oper_act_rpt_rmrks_lbl);
	}

	/**
	 *  工程実績備考（ラベル）.<p>
	 *
	 */
	public void oper_act_rpt_rmrks_lbl(String value) {
		setConstString(offset + 0, $oper_act_rpt_rmrks_lbl, value);
	}


	/**
	 *  工程実績備考.<p>
	 *
	 */
	public String oper_act_rpt_rmrks() {
		return getConstString(offset + 1, $oper_act_rpt_rmrks);
	}

	/**
	 *  工程実績備考.<p>
	 *
	 */
	public void oper_act_rpt_rmrks(String value) {
		setConstString(offset + 1, $oper_act_rpt_rmrks, value);
	}


	/**
	 *  製造実績備考（ラベル）.<p>
	 *
	 */
	public String mfg_act_rpt_rmrks_lbl() {
		return getConstString(offset + 2, $mfg_act_rpt_rmrks_lbl);
	}

	/**
	 *  製造実績備考（ラベル）.<p>
	 *
	 */
	public void mfg_act_rpt_rmrks_lbl(String value) {
		setConstString(offset + 2, $mfg_act_rpt_rmrks_lbl, value);
	}


	/**
	 *  製造実績備考.<p>
	 *
	 */
	public String mfg_act_rpt_rmrks() {
		return getConstString(offset + 3, $mfg_act_rpt_rmrks);
	}

	/**
	 *  製造実績備考.<p>
	 *
	 */
	public void mfg_act_rpt_rmrks(String value) {
		setConstString(offset + 3, $mfg_act_rpt_rmrks, value);
	}


	/**
	 *  製造記録承認日（ラベル）.<p>
	 *
	 */
	public String mfg_act_aprv_dt_lbl() {
		return getConstString(offset + 4, $mfg_act_aprv_dt_lbl);
	}

	/**
	 *  製造記録承認日（ラベル）.<p>
	 *
	 */
	public void mfg_act_aprv_dt_lbl(String value) {
		setConstString(offset + 4, $mfg_act_aprv_dt_lbl, value);
	}


	/**
	 *  製造記録承認日.<p>
	 *
	 */
	public MCDate mfg_act_aprv_dt() {
		return getConstDate(offset + 5, $mfg_act_aprv_dt);
	}

	/**
	 *  製造記録承認日.<p>
	 *
	 */
	public void mfg_act_aprv_dt(MCDate value) {
		setConstDate(offset + 5, $mfg_act_aprv_dt, value);
	}


	/**
	 *  製造記録承認部門名（ラベル）.<p>
	 *
	 */
	public String mfg_act_dpt_nm_lbl() {
		return getConstString(offset + 6, $mfg_act_dpt_nm_lbl);
	}

	/**
	 *  製造記録承認部門名（ラベル）.<p>
	 *
	 */
	public void mfg_act_dpt_nm_lbl(String value) {
		setConstString(offset + 6, $mfg_act_dpt_nm_lbl, value);
	}


	/**
	 *  製造記録承認部門名.<p>
	 *
	 */
	public String mfg_act_dpt_nm() {
		return getConstString(offset + 7, $mfg_act_dpt_nm);
	}

	/**
	 *  製造記録承認部門名.<p>
	 *
	 */
	public void mfg_act_dpt_nm(String value) {
		setConstString(offset + 7, $mfg_act_dpt_nm, value);
	}


	/**
	 *  製造記録承認者名（ラベル）.<p>
	 *
	 */
	public String mfg_act_usr_nm_lbl() {
		return getConstString(offset + 8, $mfg_act_usr_nm_lbl);
	}

	/**
	 *  製造記録承認者名（ラベル）.<p>
	 *
	 */
	public void mfg_act_usr_nm_lbl(String value) {
		setConstString(offset + 8, $mfg_act_usr_nm_lbl, value);
	}


	/**
	 *  製造記録承認者名.<p>
	 *
	 */
	public String mfg_act_usr_nm() {
		return getConstString(offset + 9, $mfg_act_usr_nm);
	}

	/**
	 *  製造記録承認者名.<p>
	 *
	 */
	public void mfg_act_usr_nm(String value) {
		setConstString(offset + 9, $mfg_act_usr_nm, value);
	}


	/**
	 *  理由（ラベル）.<p>
	 *
	 */
	public String mfg_aprv_rsn_lbl() {
		return getConstString(offset + 10, $mfg_aprv_rsn_lbl);
	}

	/**
	 *  理由（ラベル）.<p>
	 *
	 */
	public void mfg_aprv_rsn_lbl(String value) {
		setConstString(offset + 10, $mfg_aprv_rsn_lbl, value);
	}


	/**
	 *  理由.<p>
	 *
	 */
	public String mfg_aprv_rsn() {
		return getConstString(offset + 11, $mfg_aprv_rsn);
	}

	/**
	 *  理由.<p>
	 *
	 */
	public void mfg_aprv_rsn(String value) {
		setConstString(offset + 11, $mfg_aprv_rsn, value);
	}


	public String getString(String name) {
		if ($oper_act_rpt_rmrks_lbl.equalsIgnoreCase(name)) {
			return oper_act_rpt_rmrks_lbl();
		}
		if ($oper_act_rpt_rmrks.equalsIgnoreCase(name)) {
			return oper_act_rpt_rmrks();
		}
		if ($mfg_act_rpt_rmrks_lbl.equalsIgnoreCase(name)) {
			return mfg_act_rpt_rmrks_lbl();
		}
		if ($mfg_act_rpt_rmrks.equalsIgnoreCase(name)) {
			return mfg_act_rpt_rmrks();
		}
		if ($mfg_act_aprv_dt_lbl.equalsIgnoreCase(name)) {
			return mfg_act_aprv_dt_lbl();
		}
		if ($mfg_act_dpt_nm_lbl.equalsIgnoreCase(name)) {
			return mfg_act_dpt_nm_lbl();
		}
		if ($mfg_act_dpt_nm.equalsIgnoreCase(name)) {
			return mfg_act_dpt_nm();
		}
		if ($mfg_act_usr_nm_lbl.equalsIgnoreCase(name)) {
			return mfg_act_usr_nm_lbl();
		}
		if ($mfg_act_usr_nm.equalsIgnoreCase(name)) {
			return mfg_act_usr_nm();
		}
		if ($mfg_aprv_rsn_lbl.equalsIgnoreCase(name)) {
			return mfg_aprv_rsn_lbl();
		}
		if ($mfg_aprv_rsn.equalsIgnoreCase(name)) {
			return mfg_aprv_rsn();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($mfg_act_aprv_dt.equalsIgnoreCase(name)) {
			return mfg_act_aprv_dt();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($oper_act_rpt_rmrks_lbl.equalsIgnoreCase(name)) {
			return oper_act_rpt_rmrks_lbl();
		}
		if ($oper_act_rpt_rmrks.equalsIgnoreCase(name)) {
			return oper_act_rpt_rmrks();
		}
		if ($mfg_act_rpt_rmrks_lbl.equalsIgnoreCase(name)) {
			return mfg_act_rpt_rmrks_lbl();
		}
		if ($mfg_act_rpt_rmrks.equalsIgnoreCase(name)) {
			return mfg_act_rpt_rmrks();
		}
		if ($mfg_act_aprv_dt_lbl.equalsIgnoreCase(name)) {
			return mfg_act_aprv_dt_lbl();
		}
		if ($mfg_act_dpt_nm_lbl.equalsIgnoreCase(name)) {
			return mfg_act_dpt_nm_lbl();
		}
		if ($mfg_act_dpt_nm.equalsIgnoreCase(name)) {
			return mfg_act_dpt_nm();
		}
		if ($mfg_act_usr_nm_lbl.equalsIgnoreCase(name)) {
			return mfg_act_usr_nm_lbl();
		}
		if ($mfg_act_usr_nm.equalsIgnoreCase(name)) {
			return mfg_act_usr_nm();
		}
		if ($mfg_aprv_rsn_lbl.equalsIgnoreCase(name)) {
			return mfg_aprv_rsn_lbl();
		}
		if ($mfg_aprv_rsn.equalsIgnoreCase(name)) {
			return mfg_aprv_rsn();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($mfg_act_aprv_dt.equalsIgnoreCase(name)) {
			return mfg_act_aprv_dt();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($oper_act_rpt_rmrks_lbl.equalsIgnoreCase(name)) {
			oper_act_rpt_rmrks_lbl(value);
			return;
		}
		if ($oper_act_rpt_rmrks.equalsIgnoreCase(name)) {
			oper_act_rpt_rmrks(value);
			return;
		}
		if ($mfg_act_rpt_rmrks_lbl.equalsIgnoreCase(name)) {
			mfg_act_rpt_rmrks_lbl(value);
			return;
		}
		if ($mfg_act_rpt_rmrks.equalsIgnoreCase(name)) {
			mfg_act_rpt_rmrks(value);
			return;
		}
		if ($mfg_act_aprv_dt_lbl.equalsIgnoreCase(name)) {
			mfg_act_aprv_dt_lbl(value);
			return;
		}
		if ($mfg_act_dpt_nm_lbl.equalsIgnoreCase(name)) {
			mfg_act_dpt_nm_lbl(value);
			return;
		}
		if ($mfg_act_dpt_nm.equalsIgnoreCase(name)) {
			mfg_act_dpt_nm(value);
			return;
		}
		if ($mfg_act_usr_nm_lbl.equalsIgnoreCase(name)) {
			mfg_act_usr_nm_lbl(value);
			return;
		}
		if ($mfg_act_usr_nm.equalsIgnoreCase(name)) {
			mfg_act_usr_nm(value);
			return;
		}
		if ($mfg_aprv_rsn_lbl.equalsIgnoreCase(name)) {
			mfg_aprv_rsn_lbl(value);
			return;
		}
		if ($mfg_aprv_rsn.equalsIgnoreCase(name)) {
			mfg_aprv_rsn(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($mfg_act_aprv_dt.equalsIgnoreCase(name)) {
			mfg_act_aprv_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($oper_act_rpt_rmrks_lbl.equalsIgnoreCase(name)) {
			oper_act_rpt_rmrks_lbl(value);
			return;
		}
		if ($oper_act_rpt_rmrks.equalsIgnoreCase(name)) {
			oper_act_rpt_rmrks(value);
			return;
		}
		if ($mfg_act_rpt_rmrks_lbl.equalsIgnoreCase(name)) {
			mfg_act_rpt_rmrks_lbl(value);
			return;
		}
		if ($mfg_act_rpt_rmrks.equalsIgnoreCase(name)) {
			mfg_act_rpt_rmrks(value);
			return;
		}
		if ($mfg_act_aprv_dt_lbl.equalsIgnoreCase(name)) {
			mfg_act_aprv_dt_lbl(value);
			return;
		}
		if ($mfg_act_dpt_nm_lbl.equalsIgnoreCase(name)) {
			mfg_act_dpt_nm_lbl(value);
			return;
		}
		if ($mfg_act_dpt_nm.equalsIgnoreCase(name)) {
			mfg_act_dpt_nm(value);
			return;
		}
		if ($mfg_act_usr_nm_lbl.equalsIgnoreCase(name)) {
			mfg_act_usr_nm_lbl(value);
			return;
		}
		if ($mfg_act_usr_nm.equalsIgnoreCase(name)) {
			mfg_act_usr_nm(value);
			return;
		}
		if ($mfg_aprv_rsn_lbl.equalsIgnoreCase(name)) {
			mfg_aprv_rsn_lbl(value);
			return;
		}
		if ($mfg_aprv_rsn.equalsIgnoreCase(name)) {
			mfg_aprv_rsn(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($mfg_act_aprv_dt.equalsIgnoreCase(name)) {
			mfg_act_aprv_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

