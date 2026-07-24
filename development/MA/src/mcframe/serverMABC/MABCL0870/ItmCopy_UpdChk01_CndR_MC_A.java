package mcframe.serverMABC.MABCL0870;

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
 * ブロック"ItmCopy_UpdChk01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ItmCopy_UpdChk01_CndR_MC_A extends MCConstRow {

	/**
	 * Exclude logically deleted data 論理削除がオンは除く.<p>
	 *
	 */
	public static final String $ex_on_del_flg = "ex_on_del_flg";
	/**
	 * Exclude data with past application end dates 過去の適用終了日は除く.<p>
	 *
	 */
	public static final String $ex_past_end_dt = "ex_past_end_dt";


	public static final MCMeta ex_on_del_flg_META = createCommonMeta($ex_on_del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ex_past_end_dt_META = createCommonMeta($ex_past_end_dt, mcframe.commonMA.meta.MA_META.DT);

	protected static final ConstMetaList<ItmCopy_UpdChk01_CndR> constMetas = new ConstMetaList<ItmCopy_UpdChk01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ex_on_del_flg_META,
			ex_past_end_dt_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[TNAME]のキー定数 */
	public static final String $$TNAME = "TNAME";
	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";
	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";
	/** 項目属性情報のグループ[DUPLICATE]のキー定数 */
	public static final String $$DUPLICATE = "DUPLICATE";
	/** 項目属性情報のグループ[LIST_LOGIC]のキー定数 */
	public static final String $$LIST_LOGIC = "LIST_LOGIC";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[LIST_OUT]のキー定数 */
	public static final String $$LIST_OUT = "LIST_OUT";
	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$TNAME, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DUPLICATE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
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
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
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
	protected ItmCopy_UpdChk01_CndR_MC_A(ConstMetaList<? extends ItmCopy_UpdChk01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ItmCopy_UpdChk01_CndR clone() {
		return (ItmCopy_UpdChk01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ItmCopy_UpdChk01_CndR createInstance() {
		return (ItmCopy_UpdChk01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ItmCopy_UpdChk01_CndR getValues(String... names) {
		return (ItmCopy_UpdChk01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Exclude logically deleted data 論理削除がオンは除く.<p>
	 *
	 */
	public boolean ex_on_del_flg() {
		return getConstBoolean(offset + 0, $ex_on_del_flg);
	}

	/**
	 * Exclude logically deleted data 論理削除がオンは除く.<p>
	 *
	 */
	public void ex_on_del_flg(boolean value) {
		setConstBoolean(offset + 0, $ex_on_del_flg, value);
	}


	/**
	 * Exclude data with past application end dates 過去の適用終了日は除く.<p>
	 *
	 */
	public MCDate ex_past_end_dt() {
		return getConstDate(offset + 1, $ex_past_end_dt);
	}

	/**
	 * Exclude data with past application end dates 過去の適用終了日は除く.<p>
	 *
	 */
	public void ex_past_end_dt(MCDate value) {
		setConstDate(offset + 1, $ex_past_end_dt, value);
	}


	public MCDate getDate(String name) {
		if ($ex_past_end_dt.equalsIgnoreCase(name)) {
			return ex_past_end_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($ex_on_del_flg.equalsIgnoreCase(name)) {
			return ex_on_del_flg();
		}
		return super.getBoolean(name);
	}

	public MCDate getDateNE(String name) {
		if ($ex_past_end_dt.equalsIgnoreCase(name)) {
			return ex_past_end_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($ex_on_del_flg.equalsIgnoreCase(name)) {
			return ex_on_del_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setDate(String name, MCDate value) {
		if ($ex_past_end_dt.equalsIgnoreCase(name)) {
			ex_past_end_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($ex_on_del_flg.equalsIgnoreCase(name)) {
			ex_on_del_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($ex_past_end_dt.equalsIgnoreCase(name)) {
			ex_past_end_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($ex_on_del_flg.equalsIgnoreCase(name)) {
			ex_on_del_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

