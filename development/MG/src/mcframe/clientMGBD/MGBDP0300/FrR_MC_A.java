package mcframe.clientMGBD.MGBDP0300;

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
 * ブロック"Fr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class FrR_MC_A extends MCConstRow {

	/**
	 * Calculation category cd. (Copy from) コピー元計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_cd_fr = "calc_ctg_cd_fr";
	/**
	 * Calculation category name (Copy from) コピー元計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_nm_fr = "calc_ctg_nm_fr";
	/**
	 * Calculation category cd. (Copy to) コピー先計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_cd_to = "calc_ctg_cd_to";
	/**
	 * Calculation category name (Copy to) コピー先計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_nm_to = "calc_ctg_nm_to";
	public static final String $term_fr_p = "term_fr_p";
	public static final String $term_to_p = "term_to_p";
	/**
	 * Month (Copy from) コピー元年月.<p>
	 *
	 */
	public static final String $ym_fr = "ym_fr";
	/**
	 * Month (Copy to) コピー先年月.<p>
	 *
	 */
	public static final String $ym_to = "ym_to";

	public static final String $term_fr = $term_fr_p + ".term";
	public static final String $term_to = $term_to_p + ".term";

	public static final MCMeta calc_ctg_cd_fr_META = createCommonMeta($calc_ctg_cd_fr, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_nm_fr_META = createCommonMeta($calc_ctg_nm_fr, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta calc_ctg_cd_to_META = createCommonMeta($calc_ctg_cd_to, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_nm_to_META = createCommonMeta($calc_ctg_nm_to, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta term_fr_p_META = createInnerRowMeta($term_fr_p, mcframe.clientMAUB.MAUBP0230.TermR.class);
	public static final MCMeta term_to_p_META = createInnerRowMeta($term_to_p, mcframe.clientMAUB.MAUBP0230.TermR.class);
	public static final MCMeta ym_fr_META = createCommonMeta($ym_fr, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta ym_to_META = createCommonMeta($ym_to, mcframe.commonMA.meta.MA_META.YM);

	protected static final ConstMetaList<FrR> constMetas = new ConstMetaList<FrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			calc_ctg_cd_fr_META,
			calc_ctg_nm_fr_META,
			calc_ctg_cd_to_META,
			calc_ctg_nm_to_META,
			term_fr_p_META,
			term_to_p_META,
			ym_fr_META,
			ym_to_META
		},
		new String[][]{
			{
				"term_fr",
				"term_to"
			},
			{
				$term_fr,
				$term_to
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
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[SHOW]のキー定数 */
	public static final String $$SHOW = "SHOW";
	/** 項目属性情報のグループ[VIEW_SCALE]のキー定数 */
	public static final String $$VIEW_SCALE = "VIEW_SCALE";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$calc_ctg_cd_fr, "calc_ctg_nm"},	// calc_ctg_cd_fr
				{$calc_ctg_cd_to, "calc_ctg_nm"}	// calc_ctg_cd_to
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SHOW, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$VIEW_SCALE, new MCExtList(
			new String[][]{
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
	protected FrR_MC_A(ConstMetaList<? extends FrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public FrR clone() {
		return (FrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public FrR createInstance() {
		return (FrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public FrR getValues(String... names) {
		return (FrR) super.getValues(names);
	}



	/**
	 * Calculation category cd. (Copy from) コピー元計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_cd_fr() {
		return getConstString(offset + 0, $calc_ctg_cd_fr);
	}

	/**
	 * Calculation category cd. (Copy from) コピー元計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_cd_fr(String value) {
		setConstString(offset + 0, $calc_ctg_cd_fr, value);
	}


	/**
	 * Calculation category name (Copy from) コピー元計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_nm_fr() {
		return getConstString(offset + 1, $calc_ctg_nm_fr);
	}

	/**
	 * Calculation category name (Copy from) コピー元計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_nm_fr(String value) {
		setConstString(offset + 1, $calc_ctg_nm_fr, value);
	}


	/**
	 * Calculation category cd. (Copy to) コピー先計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_cd_to() {
		return getConstString(offset + 2, $calc_ctg_cd_to);
	}

	/**
	 * Calculation category cd. (Copy to) コピー先計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_cd_to(String value) {
		setConstString(offset + 2, $calc_ctg_cd_to, value);
	}


	/**
	 * Calculation category name (Copy to) コピー先計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_nm_to() {
		return getConstString(offset + 3, $calc_ctg_nm_to);
	}

	/**
	 * Calculation category name (Copy to) コピー先計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_nm_to(String value) {
		setConstString(offset + 3, $calc_ctg_nm_to, value);
	}


	public mcframe.clientMAUB.MAUBP0230.TermR term_fr_p(){
		return (mcframe.clientMAUB.MAUBP0230.TermR) getConstInnerRow(offset + 4, $term_fr_p);
	}
	
	public void term_fr_p(mcframe.clientMAUB.MAUBP0230.TermR row){
		setConstInnerRow(offset + 4, $term_fr_p, row);
	}


	public mcframe.clientMAUB.MAUBP0230.TermR term_to_p(){
		return (mcframe.clientMAUB.MAUBP0230.TermR) getConstInnerRow(offset + 5, $term_to_p);
	}
	
	public void term_to_p(mcframe.clientMAUB.MAUBP0230.TermR row){
		setConstInnerRow(offset + 5, $term_to_p, row);
	}


	/**
	 * Month (Copy from) コピー元年月.<p>
	 *
	 */
	public MCDate ym_fr() {
		return getConstDate(offset + 6, $ym_fr);
	}

	/**
	 * Month (Copy from) コピー元年月.<p>
	 *
	 */
	public void ym_fr(MCDate value) {
		setConstDate(offset + 6, $ym_fr, value);
	}


	/**
	 * Month (Copy to) コピー先年月.<p>
	 *
	 */
	public MCDate ym_to() {
		return getConstDate(offset + 7, $ym_to);
	}

	/**
	 * Month (Copy to) コピー先年月.<p>
	 *
	 */
	public void ym_to(MCDate value) {
		setConstDate(offset + 7, $ym_to, value);
	}


	public String getString(String name) {
		if ($calc_ctg_cd_fr.equalsIgnoreCase(name)) {
			return calc_ctg_cd_fr();
		}
		if ($calc_ctg_nm_fr.equalsIgnoreCase(name)) {
			return calc_ctg_nm_fr();
		}
		if ($calc_ctg_cd_to.equalsIgnoreCase(name)) {
			return calc_ctg_cd_to();
		}
		if ($calc_ctg_nm_to.equalsIgnoreCase(name)) {
			return calc_ctg_nm_to();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($ym_fr.equalsIgnoreCase(name)) {
			return ym_fr();
		}
		if ($ym_to.equalsIgnoreCase(name)) {
			return ym_to();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($calc_ctg_cd_fr.equalsIgnoreCase(name)) {
			return calc_ctg_cd_fr();
		}
		if ($calc_ctg_nm_fr.equalsIgnoreCase(name)) {
			return calc_ctg_nm_fr();
		}
		if ($calc_ctg_cd_to.equalsIgnoreCase(name)) {
			return calc_ctg_cd_to();
		}
		if ($calc_ctg_nm_to.equalsIgnoreCase(name)) {
			return calc_ctg_nm_to();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ym_fr.equalsIgnoreCase(name)) {
			return ym_fr();
		}
		if ($ym_to.equalsIgnoreCase(name)) {
			return ym_to();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($calc_ctg_cd_fr.equalsIgnoreCase(name)) {
			calc_ctg_cd_fr(value);
			return;
		}
		if ($calc_ctg_nm_fr.equalsIgnoreCase(name)) {
			calc_ctg_nm_fr(value);
			return;
		}
		if ($calc_ctg_cd_to.equalsIgnoreCase(name)) {
			calc_ctg_cd_to(value);
			return;
		}
		if ($calc_ctg_nm_to.equalsIgnoreCase(name)) {
			calc_ctg_nm_to(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ym_fr.equalsIgnoreCase(name)) {
			ym_fr(value);
			return;
		}
		if ($ym_to.equalsIgnoreCase(name)) {
			ym_to(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($calc_ctg_cd_fr.equalsIgnoreCase(name)) {
			calc_ctg_cd_fr(value);
			return;
		}
		if ($calc_ctg_nm_fr.equalsIgnoreCase(name)) {
			calc_ctg_nm_fr(value);
			return;
		}
		if ($calc_ctg_cd_to.equalsIgnoreCase(name)) {
			calc_ctg_cd_to(value);
			return;
		}
		if ($calc_ctg_nm_to.equalsIgnoreCase(name)) {
			calc_ctg_nm_to(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ym_fr.equalsIgnoreCase(name)) {
			ym_fr(value);
			return;
		}
		if ($ym_to.equalsIgnoreCase(name)) {
			ym_to(value);
			return;
		}
		super.setDateNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($term_fr_p.equalsIgnoreCase(name)) {
			return term_fr_p();
		}
		if ($term_to_p.equalsIgnoreCase(name)) {
			return term_to_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($term_fr_p.equalsIgnoreCase(name)) {
			term_fr_p(
				((MCContainerMeta) term_fr_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0230.TermR.class, value)
			);
			return;
		}
		if ($term_to_p.equalsIgnoreCase(name)) {
			term_to_p(
				((MCContainerMeta) term_to_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0230.TermR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Term (Copy from) コピー元期.<p>
	 *
	 */
	public MCDate term_fr() {
		return term_fr_p().term();
	}

	/**
	 * Term (Copy from) コピー元期.<p>
	 *
	 */
	public void term_fr(MCDate value) {
		term_fr_p().term(value);
	}

	/**
	 * Term (Copy to) コピー先期.<p>
	 *
	 */
	public MCDate term_to() {
		return term_to_p().term();
	}

	/**
	 * Term (Copy to) コピー先期.<p>
	 *
	 */
	public void term_to(MCDate value) {
		term_to_p().term(value);
	}

}

