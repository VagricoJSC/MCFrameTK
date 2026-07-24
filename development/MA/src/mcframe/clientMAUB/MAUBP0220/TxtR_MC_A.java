package mcframe.clientMAUB.MAUBP0220;

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
 * ブロック"Txt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class TxtR_MC_A extends MCConstRow {

	/**
	 * Dummy name ダミー名称.<p>
	 *
	 */
	public static final String $txt = "txt";


	public static final MCMeta txt_META = createCommonMeta($txt, mcframe.commonMA.meta.MA_META.TXT);

	protected static final ConstMetaList<TxtR> constMetas = new ConstMetaList<TxtR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			txt_META
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
	protected TxtR_MC_A(ConstMetaList<? extends TxtR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public TxtR clone() {
		return (TxtR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public TxtR createInstance() {
		return (TxtR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public TxtR getValues(String... names) {
		return (TxtR) super.getValues(names);
	}



	/**
	 * Dummy name ダミー名称.<p>
	 *
	 */
	public String txt() {
		return getConstString(offset + 0, $txt);
	}

	/**
	 * Dummy name ダミー名称.<p>
	 *
	 */
	public void txt(String value) {
		setConstString(offset + 0, $txt, value);
	}


	public String getString(String name) {
		if ($txt.equalsIgnoreCase(name)) {
			return txt();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($txt.equalsIgnoreCase(name)) {
			return txt();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($txt.equalsIgnoreCase(name)) {
			txt(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($txt.equalsIgnoreCase(name)) {
			txt(value);
			return;
		}
		super.setStringNE(name, value);
	}



}

