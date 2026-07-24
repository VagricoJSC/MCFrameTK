package mcframe.clientMGBE.MGBEP0210;

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
	 * Display qty. by term 期別数量表示.<p>
	 *
	 */
	public static final String $disp_term_qty = "disp_term_qty";
	/**
	 * Display one unit base １単位基準表示.<p>
	 *
	 */
	public static final String $disp_unit = "disp_unit";
	/**
	 * Display difference 差表示.<p>
	 *
	 */
	public static final String $disp_diff = "disp_diff";
	public static final String $disp_base = "disp_base";
	public static final String $disp_base_not_diff = "disp_base_not_diff";
	public static final String $disp_unit_diff = "disp_unit_diff";
	public static final String $disp_base_diff = "disp_base_diff";


	public static final MCMeta disp_term_qty_META = createCommonMeta($disp_term_qty, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta disp_unit_META = createCommonMeta($disp_unit, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta disp_diff_META = createCommonMeta($disp_diff, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta disp_base_META = createCommonMeta($disp_base, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta disp_base_not_diff_META = createCommonMeta($disp_base_not_diff, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta disp_unit_diff_META = createCommonMeta($disp_unit_diff, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta disp_base_diff_META = createCommonMeta($disp_base_diff, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<LPnlR> constMetas = new ConstMetaList<LPnlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			disp_term_qty_META,
			disp_unit_META,
			disp_diff_META,
			disp_base_META,
			disp_base_not_diff_META,
			disp_unit_diff_META,
			disp_base_diff_META
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
	/** 項目属性情報のグループ[VIEW_SCALE]のキー定数 */
	public static final String $$VIEW_SCALE = "VIEW_SCALE";
	/** 項目属性情報のグループ[SHOW]のキー定数 */
	public static final String $$SHOW = "SHOW";
	/** 項目属性情報のグループ[FORMAT]のキー定数 */
	public static final String $$FORMAT = "FORMAT";
	/** 項目属性情報のグループ[HKEY]のキー定数 */
	public static final String $$HKEY = "HKEY";
	/** 項目属性情報のグループ[OTHER]のキー定数 */
	public static final String $$OTHER = "OTHER";
	/** 項目属性情報のグループ[HVAL]のキー定数 */
	public static final String $$HVAL = "HVAL";
	/** 項目属性情報のグループ[ELM]のキー定数 */
	public static final String $$ELM = "ELM";
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
		new MCExtMap.Entry($$VIEW_SCALE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SHOW, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$FORMAT, new MCExtList(
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
	 * Display qty. by term 期別数量表示.<p>
	 *
	 */
	public boolean disp_term_qty() {
		return getConstBoolean(offset + 0, $disp_term_qty);
	}

	/**
	 * Display qty. by term 期別数量表示.<p>
	 *
	 */
	public void disp_term_qty(boolean value) {
		setConstBoolean(offset + 0, $disp_term_qty, value);
	}


	/**
	 * Display one unit base １単位基準表示.<p>
	 *
	 */
	public boolean disp_unit() {
		return getConstBoolean(offset + 1, $disp_unit);
	}

	/**
	 * Display one unit base １単位基準表示.<p>
	 *
	 */
	public void disp_unit(boolean value) {
		setConstBoolean(offset + 1, $disp_unit, value);
	}


	/**
	 * Display difference 差表示.<p>
	 *
	 */
	public boolean disp_diff() {
		return getConstBoolean(offset + 2, $disp_diff);
	}

	/**
	 * Display difference 差表示.<p>
	 *
	 */
	public void disp_diff(boolean value) {
		setConstBoolean(offset + 2, $disp_diff, value);
	}


	public boolean disp_base() {
		return getConstBoolean(offset + 3, $disp_base);
	}

	public void disp_base(boolean value) {
		setConstBoolean(offset + 3, $disp_base, value);
	}


	public boolean disp_base_not_diff() {
		return getConstBoolean(offset + 4, $disp_base_not_diff);
	}

	public void disp_base_not_diff(boolean value) {
		setConstBoolean(offset + 4, $disp_base_not_diff, value);
	}


	public boolean disp_unit_diff() {
		return getConstBoolean(offset + 5, $disp_unit_diff);
	}

	public void disp_unit_diff(boolean value) {
		setConstBoolean(offset + 5, $disp_unit_diff, value);
	}


	public boolean disp_base_diff() {
		return getConstBoolean(offset + 6, $disp_base_diff);
	}

	public void disp_base_diff(boolean value) {
		setConstBoolean(offset + 6, $disp_base_diff, value);
	}


	public boolean getBoolean(String name) {
		if ($disp_term_qty.equalsIgnoreCase(name)) {
			return disp_term_qty();
		}
		if ($disp_unit.equalsIgnoreCase(name)) {
			return disp_unit();
		}
		if ($disp_diff.equalsIgnoreCase(name)) {
			return disp_diff();
		}
		if ($disp_base.equalsIgnoreCase(name)) {
			return disp_base();
		}
		if ($disp_base_not_diff.equalsIgnoreCase(name)) {
			return disp_base_not_diff();
		}
		if ($disp_unit_diff.equalsIgnoreCase(name)) {
			return disp_unit_diff();
		}
		if ($disp_base_diff.equalsIgnoreCase(name)) {
			return disp_base_diff();
		}
		return super.getBoolean(name);
	}

	public boolean getBooleanNE(String name) {
		if ($disp_term_qty.equalsIgnoreCase(name)) {
			return disp_term_qty();
		}
		if ($disp_unit.equalsIgnoreCase(name)) {
			return disp_unit();
		}
		if ($disp_diff.equalsIgnoreCase(name)) {
			return disp_diff();
		}
		if ($disp_base.equalsIgnoreCase(name)) {
			return disp_base();
		}
		if ($disp_base_not_diff.equalsIgnoreCase(name)) {
			return disp_base_not_diff();
		}
		if ($disp_unit_diff.equalsIgnoreCase(name)) {
			return disp_unit_diff();
		}
		if ($disp_base_diff.equalsIgnoreCase(name)) {
			return disp_base_diff();
		}
		return super.getBooleanNE(name);
	}

	public void setBoolean(String name, boolean value) {
		if ($disp_term_qty.equalsIgnoreCase(name)) {
			disp_term_qty(value);
			return;
		}
		if ($disp_unit.equalsIgnoreCase(name)) {
			disp_unit(value);
			return;
		}
		if ($disp_diff.equalsIgnoreCase(name)) {
			disp_diff(value);
			return;
		}
		if ($disp_base.equalsIgnoreCase(name)) {
			disp_base(value);
			return;
		}
		if ($disp_base_not_diff.equalsIgnoreCase(name)) {
			disp_base_not_diff(value);
			return;
		}
		if ($disp_unit_diff.equalsIgnoreCase(name)) {
			disp_unit_diff(value);
			return;
		}
		if ($disp_base_diff.equalsIgnoreCase(name)) {
			disp_base_diff(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($disp_term_qty.equalsIgnoreCase(name)) {
			disp_term_qty(value);
			return;
		}
		if ($disp_unit.equalsIgnoreCase(name)) {
			disp_unit(value);
			return;
		}
		if ($disp_diff.equalsIgnoreCase(name)) {
			disp_diff(value);
			return;
		}
		if ($disp_base.equalsIgnoreCase(name)) {
			disp_base(value);
			return;
		}
		if ($disp_base_not_diff.equalsIgnoreCase(name)) {
			disp_base_not_diff(value);
			return;
		}
		if ($disp_unit_diff.equalsIgnoreCase(name)) {
			disp_unit_diff(value);
			return;
		}
		if ($disp_base_diff.equalsIgnoreCase(name)) {
			disp_base_diff(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

