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
 * ブロック"HdrOperBomYld"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class HdrOperBomYldR_MC_A extends MCConstRow {

	/**
	 *  工程ヘッダ表示有無.<p>
	 *
	 */
	public static final String $print_oper = "print_oper";


	public static final MCMeta print_oper_META = createStringMeta($print_oper);

	protected static final ConstMetaList<HdrOperBomYldR> constMetas = new ConstMetaList<HdrOperBomYldR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			print_oper_META
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
	protected HdrOperBomYldR_MC_A(ConstMetaList<? extends HdrOperBomYldR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrOperBomYldR clone() {
		return (HdrOperBomYldR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrOperBomYldR createInstance() {
		return (HdrOperBomYldR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrOperBomYldR getValues(String... names) {
		return (HdrOperBomYldR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  工程ヘッダ表示有無.<p>
	 *
	 */
	public String print_oper() {
		return getConstString(offset + 0, $print_oper);
	}

	/**
	 *  工程ヘッダ表示有無.<p>
	 *
	 */
	public void print_oper(String value) {
		setConstString(offset + 0, $print_oper, value);
	}


	public String getString(String name) {
		if ($print_oper.equalsIgnoreCase(name)) {
			return print_oper();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($print_oper.equalsIgnoreCase(name)) {
			return print_oper();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($print_oper.equalsIgnoreCase(name)) {
			print_oper(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($print_oper.equalsIgnoreCase(name)) {
			print_oper(value);
			return;
		}
		super.setStringNE(name, value);
	}



}

