package mcframe.clientMABC.MABCP0870;

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
 * ブロック"Btn"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class BtnR_MC_A extends MCConstRow {

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

	protected static final ConstMetaList<BtnR> constMetas = new ConstMetaList<BtnR>(
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
	protected BtnR_MC_A(ConstMetaList<? extends BtnR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BtnR clone() {
		return (BtnR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BtnR createInstance() {
		return (BtnR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BtnR getValues(String... names) {
		return (BtnR) super.getValues(names);
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

