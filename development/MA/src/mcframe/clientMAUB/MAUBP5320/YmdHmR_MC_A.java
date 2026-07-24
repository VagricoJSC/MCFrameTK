package mcframe.clientMAUB.MAUBP5320;

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
 * ブロック"YmdHm"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class YmdHmR_MC_A extends MCConstRow {

	/**
	 * Date 日付.<p>
	 *
	 */
	public static final String $ymd = "ymd";
	/**
	 * Time 時刻.<p>
	 *
	 */
	public static final String $hm = "hm";


	public static final MCMeta ymd_META = createCommonMeta($ymd, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta hm_META = createCommonMeta($hm, mcframe.commonMA.meta.MA_META.HM);

	protected static final ConstMetaList<YmdHmR> constMetas = new ConstMetaList<YmdHmR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ymd_META,
			hm_META
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
				{$hm, "TM"}	// hm
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
	protected YmdHmR_MC_A(ConstMetaList<? extends YmdHmR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public YmdHmR clone() {
		return (YmdHmR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public YmdHmR createInstance() {
		return (YmdHmR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public YmdHmR getValues(String... names) {
		return (YmdHmR) super.getValues(names);
	}



	/**
	 * Date 日付.<p>
	 *
	 */
	public MCDate ymd() {
		return getConstDate(offset + 0, $ymd);
	}

	/**
	 * Date 日付.<p>
	 *
	 */
	public void ymd(MCDate value) {
		setConstDate(offset + 0, $ymd, value);
	}


	/**
	 * Time 時刻.<p>
	 *
	 */
	public MCDate hm() {
		return getConstDate(offset + 1, $hm);
	}

	/**
	 * Time 時刻.<p>
	 *
	 */
	public void hm(MCDate value) {
		setConstDate(offset + 1, $hm, value);
	}


	public MCDate getDate(String name) {
		if ($ymd.equalsIgnoreCase(name)) {
			return ymd();
		}
		if ($hm.equalsIgnoreCase(name)) {
			return hm();
		}
		return super.getDate(name);
	}

	public MCDate getDateNE(String name) {
		if ($ymd.equalsIgnoreCase(name)) {
			return ymd();
		}
		if ($hm.equalsIgnoreCase(name)) {
			return hm();
		}
		return super.getDateNE(name);
	}

	public void setDate(String name, MCDate value) {
		if ($ymd.equalsIgnoreCase(name)) {
			ymd(value);
			return;
		}
		if ($hm.equalsIgnoreCase(name)) {
			hm(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($ymd.equalsIgnoreCase(name)) {
			ymd(value);
			return;
		}
		if ($hm.equalsIgnoreCase(name)) {
			hm(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

