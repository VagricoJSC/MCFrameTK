package mcframe.clientMAUB.MAUBP0230;

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
 * ブロック"Term"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class TermR_MC_A extends MCConstRow {

	/**
	 * Term 期.<p>
	 *
	 */
	public static final String $term = "term";
	/**
	 * Term name 期名称.<p>
	 *
	 */
	public static final String $term_nm = "term_nm";
	/**
	 * End month of term 期終了年月.<p>
	 *
	 */
	public static final String $term_end_ym = "term_end_ym";


	public static final MCMeta term_META = createCommonMeta($term, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta term_nm_META = createCommonMeta($term_nm, mcframe.commonMA.meta.MA_META.TERM_NM);
	public static final MCMeta term_end_ym_META = createCommonMeta($term_end_ym, mcframe.commonMA.meta.MA_META.YM);

	protected static final ConstMetaList<TermR> constMetas = new ConstMetaList<TermR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			term_META,
			term_nm_META,
			term_end_ym_META
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
	protected TermR_MC_A(ConstMetaList<? extends TermR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public TermR clone() {
		return (TermR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public TermR createInstance() {
		return (TermR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public TermR getValues(String... names) {
		return (TermR) super.getValues(names);
	}



	/**
	 * Term 期.<p>
	 *
	 */
	public MCDate term() {
		return getConstDate(offset + 0, $term);
	}

	/**
	 * Term 期.<p>
	 *
	 */
	public void term(MCDate value) {
		setConstDate(offset + 0, $term, value);
	}


	/**
	 * Term name 期名称.<p>
	 *
	 */
	public String term_nm() {
		return getConstString(offset + 1, $term_nm);
	}

	/**
	 * Term name 期名称.<p>
	 *
	 */
	public void term_nm(String value) {
		setConstString(offset + 1, $term_nm, value);
	}


	/**
	 * End month of term 期終了年月.<p>
	 *
	 */
	public MCDate term_end_ym() {
		return getConstDate(offset + 2, $term_end_ym);
	}

	/**
	 * End month of term 期終了年月.<p>
	 *
	 */
	public void term_end_ym(MCDate value) {
		setConstDate(offset + 2, $term_end_ym, value);
	}


	public String getString(String name) {
		if ($term_nm.equalsIgnoreCase(name)) {
			return term_nm();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($term.equalsIgnoreCase(name)) {
			return term();
		}
		if ($term_end_ym.equalsIgnoreCase(name)) {
			return term_end_ym();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($term_nm.equalsIgnoreCase(name)) {
			return term_nm();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($term.equalsIgnoreCase(name)) {
			return term();
		}
		if ($term_end_ym.equalsIgnoreCase(name)) {
			return term_end_ym();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($term_nm.equalsIgnoreCase(name)) {
			term_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($term.equalsIgnoreCase(name)) {
			term(value);
			return;
		}
		if ($term_end_ym.equalsIgnoreCase(name)) {
			term_end_ym(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($term_nm.equalsIgnoreCase(name)) {
			term_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($term.equalsIgnoreCase(name)) {
			term(value);
			return;
		}
		if ($term_end_ym.equalsIgnoreCase(name)) {
			term_end_ym(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

