package mcframe.clientMAUB.MAUBP0400;

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
 * ブロック"YmdHmFrTo"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class YmdHmFrToR_MC_A extends MCConstRow {

	/**
	 * Date FROM 日付ＦＲＯＭ.<p>
	 *
	 */
	public static final String $ymd_fr = "ymd_fr";
	/**
	 * Time FROM 時刻ＦＲＯＭ.<p>
	 *
	 */
	public static final String $hm_fr = "hm_fr";
	/**
	 * Date TO 日付ＴＯ.<p>
	 *
	 */
	public static final String $ymd_to = "ymd_to";
	/**
	 * Time TO 時刻ＴＯ.<p>
	 *
	 */
	public static final String $hm_to = "hm_to";
	public static final String $ymdhm_fr = "ymdhm_fr";
	public static final String $ymdhm_to = "ymdhm_to";


	public static final MCMeta ymd_fr_META = createCommonMeta($ymd_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta hm_fr_META = createCommonMeta($hm_fr, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta ymd_to_META = createCommonMeta($ymd_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta hm_to_META = createCommonMeta($hm_to, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta ymdhm_fr_META = createCommonMeta($ymdhm_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ymdhm_to_META = createCommonMeta($ymdhm_to, mcframe.commonMA.meta.MA_META.DT);

	protected static final ConstMetaList<YmdHmFrToR> constMetas = new ConstMetaList<YmdHmFrToR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ymd_fr_META,
			hm_fr_META,
			ymd_to_META,
			hm_to_META,
			ymdhm_fr_META,
			ymdhm_to_META
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

	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$hm_fr, "TM"},	// hm_fr
				{$hm_to, "TM"},	// hm_to
				{$ymdhm_fr, "TM"},	// ymdhm_fr
				{$ymdhm_to, "TM"}	// ymdhm_to
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
	protected YmdHmFrToR_MC_A(ConstMetaList<? extends YmdHmFrToR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public YmdHmFrToR clone() {
		return (YmdHmFrToR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public YmdHmFrToR createInstance() {
		return (YmdHmFrToR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public YmdHmFrToR getValues(String... names) {
		return (YmdHmFrToR) super.getValues(names);
	}



	/**
	 * Date FROM 日付ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ymd_fr() {
		return getConstDate(offset + 0, $ymd_fr);
	}

	/**
	 * Date FROM 日付ＦＲＯＭ.<p>
	 *
	 */
	public void ymd_fr(MCDate value) {
		setConstDate(offset + 0, $ymd_fr, value);
	}


	/**
	 * Time FROM 時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate hm_fr() {
		return getConstDate(offset + 1, $hm_fr);
	}

	/**
	 * Time FROM 時刻ＦＲＯＭ.<p>
	 *
	 */
	public void hm_fr(MCDate value) {
		setConstDate(offset + 1, $hm_fr, value);
	}


	/**
	 * Date TO 日付ＴＯ.<p>
	 *
	 */
	public MCDate ymd_to() {
		return getConstDate(offset + 2, $ymd_to);
	}

	/**
	 * Date TO 日付ＴＯ.<p>
	 *
	 */
	public void ymd_to(MCDate value) {
		setConstDate(offset + 2, $ymd_to, value);
	}


	/**
	 * Time TO 時刻ＴＯ.<p>
	 *
	 */
	public MCDate hm_to() {
		return getConstDate(offset + 3, $hm_to);
	}

	/**
	 * Time TO 時刻ＴＯ.<p>
	 *
	 */
	public void hm_to(MCDate value) {
		setConstDate(offset + 3, $hm_to, value);
	}


	public MCDate ymdhm_fr() {
		return getConstDate(offset + 4, $ymdhm_fr);
	}

	public void ymdhm_fr(MCDate value) {
		setConstDate(offset + 4, $ymdhm_fr, value);
	}


	public MCDate ymdhm_to() {
		return getConstDate(offset + 5, $ymdhm_to);
	}

	public void ymdhm_to(MCDate value) {
		setConstDate(offset + 5, $ymdhm_to, value);
	}


	public MCDate getDate(String name) {
		if ($ymd_fr.equalsIgnoreCase(name)) {
			return ymd_fr();
		}
		if ($hm_fr.equalsIgnoreCase(name)) {
			return hm_fr();
		}
		if ($ymd_to.equalsIgnoreCase(name)) {
			return ymd_to();
		}
		if ($hm_to.equalsIgnoreCase(name)) {
			return hm_to();
		}
		if ($ymdhm_fr.equalsIgnoreCase(name)) {
			return ymdhm_fr();
		}
		if ($ymdhm_to.equalsIgnoreCase(name)) {
			return ymdhm_to();
		}
		return super.getDate(name);
	}

	public MCDate getDateNE(String name) {
		if ($ymd_fr.equalsIgnoreCase(name)) {
			return ymd_fr();
		}
		if ($hm_fr.equalsIgnoreCase(name)) {
			return hm_fr();
		}
		if ($ymd_to.equalsIgnoreCase(name)) {
			return ymd_to();
		}
		if ($hm_to.equalsIgnoreCase(name)) {
			return hm_to();
		}
		if ($ymdhm_fr.equalsIgnoreCase(name)) {
			return ymdhm_fr();
		}
		if ($ymdhm_to.equalsIgnoreCase(name)) {
			return ymdhm_to();
		}
		return super.getDateNE(name);
	}

	public void setDate(String name, MCDate value) {
		if ($ymd_fr.equalsIgnoreCase(name)) {
			ymd_fr(value);
			return;
		}
		if ($hm_fr.equalsIgnoreCase(name)) {
			hm_fr(value);
			return;
		}
		if ($ymd_to.equalsIgnoreCase(name)) {
			ymd_to(value);
			return;
		}
		if ($hm_to.equalsIgnoreCase(name)) {
			hm_to(value);
			return;
		}
		if ($ymdhm_fr.equalsIgnoreCase(name)) {
			ymdhm_fr(value);
			return;
		}
		if ($ymdhm_to.equalsIgnoreCase(name)) {
			ymdhm_to(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($ymd_fr.equalsIgnoreCase(name)) {
			ymd_fr(value);
			return;
		}
		if ($hm_fr.equalsIgnoreCase(name)) {
			hm_fr(value);
			return;
		}
		if ($ymd_to.equalsIgnoreCase(name)) {
			ymd_to(value);
			return;
		}
		if ($hm_to.equalsIgnoreCase(name)) {
			hm_to(value);
			return;
		}
		if ($ymdhm_fr.equalsIgnoreCase(name)) {
			ymdhm_fr(value);
			return;
		}
		if ($ymdhm_to.equalsIgnoreCase(name)) {
			ymdhm_to(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

