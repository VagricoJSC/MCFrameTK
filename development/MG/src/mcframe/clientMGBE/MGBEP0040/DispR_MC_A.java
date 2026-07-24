package mcframe.clientMGBE.MGBEP0040;

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
 * ブロック"Disp"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DispR_MC_A extends MCConstRow {

	/**
	 * Display cost element G 費目Ｇ表示.<p>
	 *
	 */
	public static final String $expns_grp = "expns_grp";
	/**
	 * Display cost element 費目表示.<p>
	 *
	 */
	public static final String $expns = "expns";


	public static final MCMeta expns_grp_META = createCommonMeta($expns_grp, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta expns_META = createCommonMeta($expns, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<DispR> constMetas = new ConstMetaList<DispR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			expns_grp_META,
			expns_META
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
	/** 項目属性情報のグループ[SHOW]のキー定数 */
	public static final String $$SHOW = "SHOW";
	/** 項目属性情報のグループ[VIEW_SCALE]のキー定数 */
	public static final String $$VIEW_SCALE = "VIEW_SCALE";
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
		new MCExtMap.Entry($$SHOW, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$VIEW_SCALE, new MCExtList(
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
	protected DispR_MC_A(ConstMetaList<? extends DispR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DispR clone() {
		return (DispR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DispR createInstance() {
		return (DispR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DispR getValues(String... names) {
		return (DispR) super.getValues(names);
	}



	/**
	 * Display cost element G 費目Ｇ表示.<p>
	 *
	 */
	public boolean expns_grp() {
		return getConstBoolean(offset + 0, $expns_grp);
	}

	/**
	 * Display cost element G 費目Ｇ表示.<p>
	 *
	 */
	public void expns_grp(boolean value) {
		setConstBoolean(offset + 0, $expns_grp, value);
	}


	/**
	 * Display cost element 費目表示.<p>
	 *
	 */
	public boolean expns() {
		return getConstBoolean(offset + 1, $expns);
	}

	/**
	 * Display cost element 費目表示.<p>
	 *
	 */
	public void expns(boolean value) {
		setConstBoolean(offset + 1, $expns, value);
	}


	public boolean getBoolean(String name) {
		if ($expns_grp.equalsIgnoreCase(name)) {
			return expns_grp();
		}
		if ($expns.equalsIgnoreCase(name)) {
			return expns();
		}
		return super.getBoolean(name);
	}

	public boolean getBooleanNE(String name) {
		if ($expns_grp.equalsIgnoreCase(name)) {
			return expns_grp();
		}
		if ($expns.equalsIgnoreCase(name)) {
			return expns();
		}
		return super.getBooleanNE(name);
	}

	public void setBoolean(String name, boolean value) {
		if ($expns_grp.equalsIgnoreCase(name)) {
			expns_grp(value);
			return;
		}
		if ($expns.equalsIgnoreCase(name)) {
			expns(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($expns_grp.equalsIgnoreCase(name)) {
			expns_grp(value);
			return;
		}
		if ($expns.equalsIgnoreCase(name)) {
			expns(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

