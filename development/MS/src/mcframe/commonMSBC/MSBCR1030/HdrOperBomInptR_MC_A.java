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
 * ブロック"HdrOperBomInpt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class HdrOperBomInptR_MC_A extends MCConstRow {

	/**
	 *  投入ヘッダ表示有無.<p>
	 *
	 */
	public static final String $print_inpt = "print_inpt";


	public static final MCMeta print_inpt_META = createStringMeta($print_inpt);

	protected static final ConstMetaList<HdrOperBomInptR> constMetas = new ConstMetaList<HdrOperBomInptR>(
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
	protected HdrOperBomInptR_MC_A(ConstMetaList<? extends HdrOperBomInptR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrOperBomInptR clone() {
		return (HdrOperBomInptR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrOperBomInptR createInstance() {
		return (HdrOperBomInptR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrOperBomInptR getValues(String... names) {
		return (HdrOperBomInptR) super.getValues(names);
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

