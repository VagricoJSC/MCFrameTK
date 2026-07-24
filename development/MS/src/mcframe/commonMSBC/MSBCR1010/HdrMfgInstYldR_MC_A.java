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
 * ブロック"HdrMfgInstYld"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class HdrMfgInstYldR_MC_A extends MCConstRow {

	/**
	 *  出来高ヘッダ表示有無.<p>
	 *
	 */
	public static final String $print_yld = "print_yld";


	public static final MCMeta print_yld_META = createStringMeta($print_yld);

	protected static final ConstMetaList<HdrMfgInstYldR> constMetas = new ConstMetaList<HdrMfgInstYldR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			print_yld_META
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
	protected HdrMfgInstYldR_MC_A(ConstMetaList<? extends HdrMfgInstYldR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrMfgInstYldR clone() {
		return (HdrMfgInstYldR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrMfgInstYldR createInstance() {
		return (HdrMfgInstYldR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrMfgInstYldR getValues(String... names) {
		return (HdrMfgInstYldR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  出来高ヘッダ表示有無.<p>
	 *
	 */
	public String print_yld() {
		return getConstString(offset + 0, $print_yld);
	}

	/**
	 *  出来高ヘッダ表示有無.<p>
	 *
	 */
	public void print_yld(String value) {
		setConstString(offset + 0, $print_yld, value);
	}


	public String getString(String name) {
		if ($print_yld.equalsIgnoreCase(name)) {
			return print_yld();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($print_yld.equalsIgnoreCase(name)) {
			return print_yld();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($print_yld.equalsIgnoreCase(name)) {
			print_yld(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($print_yld.equalsIgnoreCase(name)) {
			print_yld(value);
			return;
		}
		super.setStringNE(name, value);
	}



}

