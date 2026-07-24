package mcframe.clientMGBG.MGBGP0030;

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
 * ブロック"PlnCnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class PlnCndR_MC_A extends MCConstRow {

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_cd_fr = "calc_ctg_cd_fr";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_nm_fr = "calc_ctg_nm_fr";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
	/**
	 * Month FROM 年月ＦＲＯＭ.<p>
	 *
	 */
	public static final String $ym_fr = "ym_fr";
	/**
	 * Month TO 年月ＴＯ.<p>
	 *
	 */
	public static final String $ym_to = "ym_to";
	/**
	 * Applied calculation category cd. 反映先計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_cd_to = "calc_ctg_cd_to";
	/**
	 * Applied calculation category name 反映先計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_nm_to = "calc_ctg_nm_to";


	public static final MCMeta calc_ctg_cd_fr_META = createCommonMeta($calc_ctg_cd_fr, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_nm_fr_META = createCommonMeta($calc_ctg_nm_fr, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta ym_fr_META = createCommonMeta($ym_fr, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta ym_to_META = createCommonMeta($ym_to, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta calc_ctg_cd_to_META = createCommonMeta($calc_ctg_cd_to, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_nm_to_META = createCommonMeta($calc_ctg_nm_to, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);

	protected static final ConstMetaList<PlnCndR> constMetas = new ConstMetaList<PlnCndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			calc_ctg_cd_fr_META,
			calc_ctg_nm_fr_META,
			wg_cd_META,
			wg_nm_META,
			ym_fr_META,
			ym_to_META,
			calc_ctg_cd_to_META,
			calc_ctg_nm_to_META
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
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";

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
				{$wg_cd, "true"}	// wg_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$wg_cd, "wr_flg"}	// wg_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"}	// wg_nm
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
	protected PlnCndR_MC_A(ConstMetaList<? extends PlnCndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PlnCndR clone() {
		return (PlnCndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PlnCndR createInstance() {
		return (PlnCndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PlnCndR getValues(String... names) {
		return (PlnCndR) super.getValues(names);
	}



	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_cd_fr() {
		return getConstString(offset + 0, $calc_ctg_cd_fr);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_cd_fr(String value) {
		setConstString(offset + 0, $calc_ctg_cd_fr, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_nm_fr() {
		return getConstString(offset + 1, $calc_ctg_nm_fr);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_nm_fr(String value) {
		setConstString(offset + 1, $calc_ctg_nm_fr, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 2, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 2, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 3, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 3, $wg_nm, value);
	}


	/**
	 * Month FROM 年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ym_fr() {
		return getConstDate(offset + 4, $ym_fr);
	}

	/**
	 * Month FROM 年月ＦＲＯＭ.<p>
	 *
	 */
	public void ym_fr(MCDate value) {
		setConstDate(offset + 4, $ym_fr, value);
	}


	/**
	 * Month TO 年月ＴＯ.<p>
	 *
	 */
	public MCDate ym_to() {
		return getConstDate(offset + 5, $ym_to);
	}

	/**
	 * Month TO 年月ＴＯ.<p>
	 *
	 */
	public void ym_to(MCDate value) {
		setConstDate(offset + 5, $ym_to, value);
	}


	/**
	 * Applied calculation category cd. 反映先計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_cd_to() {
		return getConstString(offset + 6, $calc_ctg_cd_to);
	}

	/**
	 * Applied calculation category cd. 反映先計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_cd_to(String value) {
		setConstString(offset + 6, $calc_ctg_cd_to, value);
	}


	/**
	 * Applied calculation category name 反映先計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_nm_to() {
		return getConstString(offset + 7, $calc_ctg_nm_to);
	}

	/**
	 * Applied calculation category name 反映先計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_nm_to(String value) {
		setConstString(offset + 7, $calc_ctg_nm_to, value);
	}


	public String getString(String name) {
		if ($calc_ctg_cd_fr.equalsIgnoreCase(name)) {
			return calc_ctg_cd_fr();
		}
		if ($calc_ctg_nm_fr.equalsIgnoreCase(name)) {
			return calc_ctg_nm_fr();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
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



}

