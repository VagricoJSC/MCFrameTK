package mcframe.clientMSBC.MSBCP0290;

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
 * ブロック"LPnl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class LPnlR_MC_A extends MCConstRow {

	/**
	 * Select period FROM 選択期間ＦＲＯＭ.<p>
	 *
	 */
	public static final String $select_dt_fr = "select_dt_fr";
	/**
	 * Select period TO 選択期間ＴＯ.<p>
	 *
	 */
	public static final String $select_dt_to = "select_dt_to";


	public static final MCMeta select_dt_fr_META = createCommonMeta($select_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta select_dt_to_META = createCommonMeta($select_dt_to, mcframe.commonMA.meta.MA_META.DT);

	protected static final ConstMetaList<LPnlR> constMetas = new ConstMetaList<LPnlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			select_dt_fr_META,
			select_dt_to_META
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
	protected LPnlR_MC_A(ConstMetaList<? extends LPnlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public LPnlR clone() {
		return (LPnlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public LPnlR createInstance() {
		return (LPnlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public LPnlR getValues(String... names) {
		return (LPnlR) super.getValues(names);
	}



	/**
	 * Select period FROM 選択期間ＦＲＯＭ.<p>
	 *
	 */
	public MCDate select_dt_fr() {
		return getConstDate(offset + 0, $select_dt_fr);
	}

	/**
	 * Select period FROM 選択期間ＦＲＯＭ.<p>
	 *
	 */
	public void select_dt_fr(MCDate value) {
		setConstDate(offset + 0, $select_dt_fr, value);
	}


	/**
	 * Select period TO 選択期間ＴＯ.<p>
	 *
	 */
	public MCDate select_dt_to() {
		return getConstDate(offset + 1, $select_dt_to);
	}

	/**
	 * Select period TO 選択期間ＴＯ.<p>
	 *
	 */
	public void select_dt_to(MCDate value) {
		setConstDate(offset + 1, $select_dt_to, value);
	}


	public MCDate getDate(String name) {
		if ($select_dt_fr.equalsIgnoreCase(name)) {
			return select_dt_fr();
		}
		if ($select_dt_to.equalsIgnoreCase(name)) {
			return select_dt_to();
		}
		return super.getDate(name);
	}

	public MCDate getDateNE(String name) {
		if ($select_dt_fr.equalsIgnoreCase(name)) {
			return select_dt_fr();
		}
		if ($select_dt_to.equalsIgnoreCase(name)) {
			return select_dt_to();
		}
		return super.getDateNE(name);
	}

	public void setDate(String name, MCDate value) {
		if ($select_dt_fr.equalsIgnoreCase(name)) {
			select_dt_fr(value);
			return;
		}
		if ($select_dt_to.equalsIgnoreCase(name)) {
			select_dt_to(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($select_dt_fr.equalsIgnoreCase(name)) {
			select_dt_fr(value);
			return;
		}
		if ($select_dt_to.equalsIgnoreCase(name)) {
			select_dt_to(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

