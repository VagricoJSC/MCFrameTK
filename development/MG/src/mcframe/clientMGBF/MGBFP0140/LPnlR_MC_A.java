package mcframe.clientMGBF.MGBFP0140;

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
	 * Display cost element G 費目Ｇ表示.<p>
	 *
	 */
	public static final String $disp_expns_grp = "disp_expns_grp";
	/**
	 * Display cost element 費目表示.<p>
	 *
	 */
	public static final String $disp_expns = "disp_expns";
	/**
	 * Display standard 標準表示.<p>
	 *
	 */
	public static final String $disp_std = "disp_std";


	public static final MCMeta disp_expns_grp_META = createCommonMeta($disp_expns_grp, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta disp_expns_META = createCommonMeta($disp_expns, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta disp_std_META = createCommonMeta($disp_std, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<LPnlR> constMetas = new ConstMetaList<LPnlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			disp_expns_grp_META,
			disp_expns_META,
			disp_std_META
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
	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[CLEAR]のキー定数 */
	public static final String $$CLEAR = "CLEAR";
	/** 項目属性情報のグループ[SHOW]のキー定数 */
	public static final String $$SHOW = "SHOW";
	/** 項目属性情報のグループ[HKEY]のキー定数 */
	public static final String $$HKEY = "HKEY";
	/** 項目属性情報のグループ[OTHER]のキー定数 */
	public static final String $$OTHER = "OTHER";
	/** 項目属性情報のグループ[HVAL]のキー定数 */
	public static final String $$HVAL = "HVAL";
	/** 項目属性情報のグループ[ELM]のキー定数 */
	public static final String $$ELM = "ELM";
	/** 項目属性情報のグループ[VIEW_SCALE]のキー定数 */
	public static final String $$VIEW_SCALE = "VIEW_SCALE";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
			}
		)),
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
		new MCExtMap.Entry($$CLEAR, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SHOW, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$HKEY, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$OTHER, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$HVAL, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$ELM, new MCExtList(
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
	 * Display cost element G 費目Ｇ表示.<p>
	 *
	 */
	public boolean disp_expns_grp() {
		return getConstBoolean(offset + 0, $disp_expns_grp);
	}

	/**
	 * Display cost element G 費目Ｇ表示.<p>
	 *
	 */
	public void disp_expns_grp(boolean value) {
		setConstBoolean(offset + 0, $disp_expns_grp, value);
	}


	/**
	 * Display cost element 費目表示.<p>
	 *
	 */
	public boolean disp_expns() {
		return getConstBoolean(offset + 1, $disp_expns);
	}

	/**
	 * Display cost element 費目表示.<p>
	 *
	 */
	public void disp_expns(boolean value) {
		setConstBoolean(offset + 1, $disp_expns, value);
	}


	/**
	 * Display standard 標準表示.<p>
	 *
	 */
	public boolean disp_std() {
		return getConstBoolean(offset + 2, $disp_std);
	}

	/**
	 * Display standard 標準表示.<p>
	 *
	 */
	public void disp_std(boolean value) {
		setConstBoolean(offset + 2, $disp_std, value);
	}


	public boolean getBoolean(String name) {
		if ($disp_expns_grp.equalsIgnoreCase(name)) {
			return disp_expns_grp();
		}
		if ($disp_expns.equalsIgnoreCase(name)) {
			return disp_expns();
		}
		if ($disp_std.equalsIgnoreCase(name)) {
			return disp_std();
		}
		return super.getBoolean(name);
	}

	public boolean getBooleanNE(String name) {
		if ($disp_expns_grp.equalsIgnoreCase(name)) {
			return disp_expns_grp();
		}
		if ($disp_expns.equalsIgnoreCase(name)) {
			return disp_expns();
		}
		if ($disp_std.equalsIgnoreCase(name)) {
			return disp_std();
		}
		return super.getBooleanNE(name);
	}

	public void setBoolean(String name, boolean value) {
		if ($disp_expns_grp.equalsIgnoreCase(name)) {
			disp_expns_grp(value);
			return;
		}
		if ($disp_expns.equalsIgnoreCase(name)) {
			disp_expns(value);
			return;
		}
		if ($disp_std.equalsIgnoreCase(name)) {
			disp_std(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($disp_expns_grp.equalsIgnoreCase(name)) {
			disp_expns_grp(value);
			return;
		}
		if ($disp_expns.equalsIgnoreCase(name)) {
			disp_expns(value);
			return;
		}
		if ($disp_std.equalsIgnoreCase(name)) {
			disp_std(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

