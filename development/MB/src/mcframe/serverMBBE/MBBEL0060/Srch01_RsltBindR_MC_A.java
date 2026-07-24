package mcframe.serverMBBE.MBBEL0060;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
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
 * ブロック"Srch01_RsltBind"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_RsltBindR_MC_A extends MCConstRow {

	/**
	 * Variable name 変数名.<p>
	 *
	 */
	public static final String $cond_col = "cond_col";


	public static final MCMeta cond_col_META = createCommonMeta($cond_col, mcframe.commonMA.meta.MA_META.COND_COL);

	protected static final ConstMetaList<Srch01_RsltBindR> constMetas = new ConstMetaList<Srch01_RsltBindR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			cond_col_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);


	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null
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
	 * 指定グループの項目属性情報を返します。
	 */
	public Map<String, String> getExtMap(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.get(aGroup);
	}

	/**
	 * 指定グループの項目属性が登録された項目リストを返します。
	 */
	public List<String> getKeys(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.getKeyList(aGroup);
	}

	/**
	 * 項目属性のグループのSet情報を返します。
	 */
	public Set<String> getExtGroups(){
		Set<String> ret = EXTMAP.keySet();
		return ret;
	}

	/**
	 * コンストラクタです。
	 */
	protected Srch01_RsltBindR_MC_A(ConstMetaList<? extends Srch01_RsltBindR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltBindR clone() {
		return (Srch01_RsltBindR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltBindR createInstance() {
		return (Srch01_RsltBindR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltBindR getValues(String... names) {
		return (Srch01_RsltBindR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Variable name 変数名.<p>
	 *
	 */
	public String cond_col() {
		return getConstString(offset + 0, $cond_col);
	}

	/**
	 * Variable name 変数名.<p>
	 *
	 */
	public void cond_col(String value) {
		setConstString(offset + 0, $cond_col, value);
	}


	public String getString(String name) {
		if ($cond_col.equalsIgnoreCase(name)) {
			return cond_col();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($cond_col.equalsIgnoreCase(name)) {
			return cond_col();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($cond_col.equalsIgnoreCase(name)) {
			cond_col(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($cond_col.equalsIgnoreCase(name)) {
			cond_col(value);
			return;
		}
		super.setStringNE(name, value);
	}



}

