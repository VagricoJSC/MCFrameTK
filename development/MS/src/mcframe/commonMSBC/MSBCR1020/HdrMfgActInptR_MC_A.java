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
 * ブロック"HdrMfgActInpt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class HdrMfgActInptR_MC_A extends MCConstRow {

	/**
	 *  投入ヘッダ表示有無.<p>
	 *
	 */
	public static final String $print_inpt = "print_inpt";


	public static final MCMeta print_inpt_META = createStringMeta($print_inpt);

	protected static final ConstMetaList<HdrMfgActInptR> constMetas = new ConstMetaList<HdrMfgActInptR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			print_inpt_META
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
	protected HdrMfgActInptR_MC_A(ConstMetaList<? extends HdrMfgActInptR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrMfgActInptR clone() {
		return (HdrMfgActInptR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrMfgActInptR createInstance() {
		return (HdrMfgActInptR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrMfgActInptR getValues(String... names) {
		return (HdrMfgActInptR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  投入ヘッダ表示有無.<p>
	 *
	 */
	public String print_inpt() {
		return getConstString(offset + 0, $print_inpt);
	}

	/**
	 *  投入ヘッダ表示有無.<p>
	 *
	 */
	public void print_inpt(String value) {
		setConstString(offset + 0, $print_inpt, value);
	}


	public String getString(String name) {
		if ($print_inpt.equalsIgnoreCase(name)) {
			return print_inpt();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($print_inpt.equalsIgnoreCase(name)) {
			return print_inpt();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($print_inpt.equalsIgnoreCase(name)) {
			print_inpt(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($print_inpt.equalsIgnoreCase(name)) {
			print_inpt(value);
			return;
		}
		super.setStringNE(name, value);
	}



}

