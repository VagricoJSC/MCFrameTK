package mcframe.clientMSBC.MSBCP0030;

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
 * ブロック"BulkSet"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class BulkSetR_MC_A extends MCConstRow {

	/**
	 * Plan month 計画年月.<p>
	 *
	 */
	public static final String $ym = "ym";


	public static final MCMeta ym_META = createCommonMeta($ym, mcframe.commonMA.meta.MA_META.YM);

	protected static final ConstMetaList<BulkSetR> constMetas = new ConstMetaList<BulkSetR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ym_META
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
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
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
	protected BulkSetR_MC_A(ConstMetaList<? extends BulkSetR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BulkSetR clone() {
		return (BulkSetR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BulkSetR createInstance() {
		return (BulkSetR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BulkSetR getValues(String... names) {
		return (BulkSetR) super.getValues(names);
	}



	/**
	 * Plan month 計画年月.<p>
	 *
	 */
	public MCDate ym() {
		return getConstDate(offset + 0, $ym);
	}

	/**
	 * Plan month 計画年月.<p>
	 *
	 */
	public void ym(MCDate value) {
		setConstDate(offset + 0, $ym, value);
	}


	public MCDate getDate(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		return super.getDate(name);
	}

	public MCDate getDateNE(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		return super.getDateNE(name);
	}

	public void setDate(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

