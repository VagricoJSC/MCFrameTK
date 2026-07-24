package mcframe.commonMSBC.MSBCR1030;

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
 * ブロック"OperBomFtr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class OperBomFtrR_MC_A extends MCConstRow {

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


	public static final MCMeta oper_inst_rpt_rmrks_lbl_META = createStringMeta($oper_inst_rpt_rmrks_lbl);
	public static final MCMeta oper_inst_rpt_rmrks_META = createCommonMeta($oper_inst_rpt_rmrks, mcframe.commonMS.meta.MS_META.OPER_INST_RPT_RMRKS);
	public static final MCMeta mfg_inst_rpt_rmrks_lbl_META = createStringMeta($mfg_inst_rpt_rmrks_lbl);
	public static final MCMeta mfg_inst_rpt_rmrks_META = createCommonMeta($mfg_inst_rpt_rmrks, mcframe.commonMS.meta.MS_META.MFG_INST_RPT_RMRKS);

	protected static final ConstMetaList<OperBomFtrR> constMetas = new ConstMetaList<OperBomFtrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			oper_inst_rpt_rmrks_lbl_META,
			oper_inst_rpt_rmrks_META,
			mfg_inst_rpt_rmrks_lbl_META,
			mfg_inst_rpt_rmrks_META
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
	protected OperBomFtrR_MC_A(ConstMetaList<? extends OperBomFtrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public OperBomFtrR clone() {
		return (OperBomFtrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public OperBomFtrR createInstance() {
		return (OperBomFtrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public OperBomFtrR getValues(String... names) {
		return (OperBomFtrR) super.getValues(names);
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
		return super.getString(name);
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
		return super.getStringNE(name);
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
		super.setString(name, value);
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
		super.setStringNE(name, value);
	}



}

