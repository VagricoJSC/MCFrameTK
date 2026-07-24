package mcframe.clientMBBE.MBBEP0040;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.clientCore.container.MCKeyList;
import mcframe.clientCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"Bind"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class BindR_MC_A extends MCConstRow {

	/**
	 * Search criteria 検索条件.<p>
	 *
	 */
	public static final String $cond_col = "cond_col";
	/**
	 * Value 値.<p>
	 *
	 */
	public static final String $cond_val = "cond_val";


	public static final MCMeta cond_col_META = createCommonMeta($cond_col, mcframe.commonMA.meta.MA_META.COND_COL);
	public static final MCMeta cond_val_META = createStringMeta($cond_val);

	protected static final ConstMetaList<BindR> constMetas = new ConstMetaList<BindR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			cond_col_META,
			cond_val_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
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
	 * "KEYS"グループのキー項目情報を返します。
	 */
	public MCKeyList getKeys(){
		return KEYS;
	}

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
	public MCKeyList getKeys(String aGroup){
		if(aGroup == null) return null;
		return new MCKeyList(EXTMAP.getKeyList(aGroup));
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
	protected BindR_MC_A(ConstMetaList<? extends BindR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BindR clone() {
		return (BindR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BindR createInstance() {
		return (BindR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BindR getValues(String... names) {
		return (BindR) super.getValues(names);
	}



	/**
	 * Search criteria 検索条件.<p>
	 *
	 */
	public String cond_col() {
		return getConstString(offset + 0, $cond_col);
	}

	/**
	 * Search criteria 検索条件.<p>
	 *
	 */
	public void cond_col(String value) {
		setConstString(offset + 0, $cond_col, value);
	}


	/**
	 * Value 値.<p>
	 *
	 */
	public String cond_val() {
		return getConstString(offset + 1, $cond_val);
	}

	/**
	 * Value 値.<p>
	 *
	 */
	public void cond_val(String value) {
		setConstString(offset + 1, $cond_val, value);
	}


	public String getString(String name) {
		if ($cond_col.equalsIgnoreCase(name)) {
			return cond_col();
		}
		if ($cond_val.equalsIgnoreCase(name)) {
			return cond_val();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($cond_col.equalsIgnoreCase(name)) {
			return cond_col();
		}
		if ($cond_val.equalsIgnoreCase(name)) {
			return cond_val();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($cond_col.equalsIgnoreCase(name)) {
			cond_col(value);
			return;
		}
		if ($cond_val.equalsIgnoreCase(name)) {
			cond_val(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($cond_col.equalsIgnoreCase(name)) {
			cond_col(value);
			return;
		}
		if ($cond_val.equalsIgnoreCase(name)) {
			cond_val(value);
			return;
		}
		super.setStringNE(name, value);
	}



}

