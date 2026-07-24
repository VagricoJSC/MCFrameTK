package mcframe.clientMAUB.MAUBP0240;

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
	 * Term FROM 期ＦＲＯＭ.<p>
	 *
	 */
	public static final String $term_fr = "term_fr";
	/**
	 * Term FROM name 期ＦＲＯＭ名称.<p>
	 *
	 */
	public static final String $term_fr_nm = "term_fr_nm";
	/**
	 * Term TO 期ＴＯ.<p>
	 *
	 */
	public static final String $term_to = "term_to";
	/**
	 * Term TO name 期ＴＯ名称.<p>
	 *
	 */
	public static final String $term_to_nm = "term_to_nm";


	public static final MCMeta term_fr_META = createCommonMeta($term_fr, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta term_fr_nm_META = createCommonMeta($term_fr_nm, mcframe.commonMA.meta.MA_META.TERM_NM);
	public static final MCMeta term_to_META = createCommonMeta($term_to, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta term_to_nm_META = createCommonMeta($term_to_nm, mcframe.commonMA.meta.MA_META.TERM_NM);

	protected static final ConstMetaList<TermR> constMetas = new ConstMetaList<TermR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			term_fr_META,
			term_fr_nm_META,
			term_to_META,
			term_to_nm_META
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

	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$term_fr, "term_nm"},	// term_fr
				{$term_to, "term_nm"}	// term_to
			}
		))
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
	 * Term FROM 期ＦＲＯＭ.<p>
	 *
	 */
	public MCDate term_fr() {
		return getConstDate(offset + 0, $term_fr);
	}

	/**
	 * Term FROM 期ＦＲＯＭ.<p>
	 *
	 */
	public void term_fr(MCDate value) {
		setConstDate(offset + 0, $term_fr, value);
	}


	/**
	 * Term FROM name 期ＦＲＯＭ名称.<p>
	 *
	 */
	public String term_fr_nm() {
		return getConstString(offset + 1, $term_fr_nm);
	}

	/**
	 * Term FROM name 期ＦＲＯＭ名称.<p>
	 *
	 */
	public void term_fr_nm(String value) {
		setConstString(offset + 1, $term_fr_nm, value);
	}


	/**
	 * Term TO 期ＴＯ.<p>
	 *
	 */
	public MCDate term_to() {
		return getConstDate(offset + 2, $term_to);
	}

	/**
	 * Term TO 期ＴＯ.<p>
	 *
	 */
	public void term_to(MCDate value) {
		setConstDate(offset + 2, $term_to, value);
	}


	/**
	 * Term TO name 期ＴＯ名称.<p>
	 *
	 */
	public String term_to_nm() {
		return getConstString(offset + 3, $term_to_nm);
	}

	/**
	 * Term TO name 期ＴＯ名称.<p>
	 *
	 */
	public void term_to_nm(String value) {
		setConstString(offset + 3, $term_to_nm, value);
	}


	public String getString(String name) {
		if ($term_fr_nm.equalsIgnoreCase(name)) {
			return term_fr_nm();
		}
		if ($term_to_nm.equalsIgnoreCase(name)) {
			return term_to_nm();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($term_fr.equalsIgnoreCase(name)) {
			return term_fr();
		}
		if ($term_to.equalsIgnoreCase(name)) {
			return term_to();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($term_fr_nm.equalsIgnoreCase(name)) {
			return term_fr_nm();
		}
		if ($term_to_nm.equalsIgnoreCase(name)) {
			return term_to_nm();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($term_fr.equalsIgnoreCase(name)) {
			return term_fr();
		}
		if ($term_to.equalsIgnoreCase(name)) {
			return term_to();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($term_fr_nm.equalsIgnoreCase(name)) {
			term_fr_nm(value);
			return;
		}
		if ($term_to_nm.equalsIgnoreCase(name)) {
			term_to_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($term_fr.equalsIgnoreCase(name)) {
			term_fr(value);
			return;
		}
		if ($term_to.equalsIgnoreCase(name)) {
			term_to(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($term_fr_nm.equalsIgnoreCase(name)) {
			term_fr_nm(value);
			return;
		}
		if ($term_to_nm.equalsIgnoreCase(name)) {
			term_to_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($term_fr.equalsIgnoreCase(name)) {
			term_fr(value);
			return;
		}
		if ($term_to.equalsIgnoreCase(name)) {
			term_to(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

