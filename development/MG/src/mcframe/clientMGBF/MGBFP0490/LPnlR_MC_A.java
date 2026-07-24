package mcframe.clientMGBF.MGBFP0490;

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
	 * Display qty. 数量表示.<p>
	 *
	 */
	public static final String $disp_qty = "disp_qty";
	/**
	 * Display unit price 単価表示.<p>
	 *
	 */
	public static final String $disp_unit = "disp_unit";
	/**
	 * Display amount 金額表示.<p>
	 *
	 */
	public static final String $disp_amt = "disp_amt";
	/**
	 * Display basic unit 原単位表示.<p>
	 *
	 */
	public static final String $disp_base = "disp_base";
	/**
	 * Display unit price per basic unit 原単位単価表示.<p>
	 *
	 */
	public static final String $disp_base_unit = "disp_base_unit";
	/**
	 * Basic unit additional display digits 原単位追加表示桁.<p>
	 *
	 */
	public static final String $add_disp_digit = "add_disp_digit";
	public static final String $pln_and_qty_flg = "pln_and_qty_flg";
	public static final String $pln_and_unit_flg = "pln_and_unit_flg";
	public static final String $pln_and_amt_flg = "pln_and_amt_flg";
	public static final String $pln_and_base_flg = "pln_and_base_flg";
	public static final String $pln_and_base_unit_flg = "pln_and_base_unit_flg";


	public static final MCMeta disp_qty_META = createCommonMeta($disp_qty, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta disp_unit_META = createCommonMeta($disp_unit, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta disp_amt_META = createCommonMeta($disp_amt, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta disp_base_META = createCommonMeta($disp_base, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta disp_base_unit_META = createCommonMeta($disp_base_unit, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta add_disp_digit_META = createCommonMeta($add_disp_digit, mcframe.commonMA.meta.MA_META.DISP_DIGIT);
	public static final MCMeta pln_and_qty_flg_META = createCommonMeta($pln_and_qty_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pln_and_unit_flg_META = createCommonMeta($pln_and_unit_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pln_and_amt_flg_META = createCommonMeta($pln_and_amt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pln_and_base_flg_META = createCommonMeta($pln_and_base_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pln_and_base_unit_flg_META = createCommonMeta($pln_and_base_unit_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<LPnlR> constMetas = new ConstMetaList<LPnlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			disp_qty_META,
			disp_unit_META,
			disp_amt_META,
			disp_base_META,
			disp_base_unit_META,
			add_disp_digit_META,
			pln_and_qty_flg_META,
			pln_and_unit_flg_META,
			pln_and_amt_flg_META,
			pln_and_base_flg_META,
			pln_and_base_unit_flg_META
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
	 * Display qty. 数量表示.<p>
	 *
	 */
	public boolean disp_qty() {
		return getConstBoolean(offset + 0, $disp_qty);
	}

	/**
	 * Display qty. 数量表示.<p>
	 *
	 */
	public void disp_qty(boolean value) {
		setConstBoolean(offset + 0, $disp_qty, value);
	}


	/**
	 * Display unit price 単価表示.<p>
	 *
	 */
	public boolean disp_unit() {
		return getConstBoolean(offset + 1, $disp_unit);
	}

	/**
	 * Display unit price 単価表示.<p>
	 *
	 */
	public void disp_unit(boolean value) {
		setConstBoolean(offset + 1, $disp_unit, value);
	}


	/**
	 * Display amount 金額表示.<p>
	 *
	 */
	public boolean disp_amt() {
		return getConstBoolean(offset + 2, $disp_amt);
	}

	/**
	 * Display amount 金額表示.<p>
	 *
	 */
	public void disp_amt(boolean value) {
		setConstBoolean(offset + 2, $disp_amt, value);
	}


	/**
	 * Display basic unit 原単位表示.<p>
	 *
	 */
	public boolean disp_base() {
		return getConstBoolean(offset + 3, $disp_base);
	}

	/**
	 * Display basic unit 原単位表示.<p>
	 *
	 */
	public void disp_base(boolean value) {
		setConstBoolean(offset + 3, $disp_base, value);
	}


	/**
	 * Display unit price per basic unit 原単位単価表示.<p>
	 *
	 */
	public boolean disp_base_unit() {
		return getConstBoolean(offset + 4, $disp_base_unit);
	}

	/**
	 * Display unit price per basic unit 原単位単価表示.<p>
	 *
	 */
	public void disp_base_unit(boolean value) {
		setConstBoolean(offset + 4, $disp_base_unit, value);
	}


	/**
	 * Basic unit additional display digits 原単位追加表示桁.<p>
	 *
	 */
	public MCNumber add_disp_digit() {
		return getConstNumber(offset + 5, $add_disp_digit);
	}

	/**
	 * Basic unit additional display digits 原単位追加表示桁.<p>
	 *
	 */
	public void add_disp_digit(MCNumber value) {
		setConstNumber(offset + 5, $add_disp_digit, value);
	}

	/**
	 * Basic unit additional display digits 原単位追加表示桁.<p>
	 *
	 */
	public void add_disp_digit(int value) {
		setConstNumber(offset + 5, $add_disp_digit, value);
	}

	/**
	 * Basic unit additional display digits 原単位追加表示桁.<p>
	 *
	 */
	public void add_disp_digit(long value) {
		setConstNumber(offset + 5, $add_disp_digit, value);
	}

	/**
	 * Basic unit additional display digits 原単位追加表示桁.<p>
	 *
	 */
	public void add_disp_digit(float value) {
		setConstNumber(offset + 5, $add_disp_digit, value);
	}

	/**
	 * Basic unit additional display digits 原単位追加表示桁.<p>
	 *
	 */
	public void add_disp_digit(double value) {
		setConstNumber(offset + 5, $add_disp_digit, value);
	}


	public boolean pln_and_qty_flg() {
		return getConstBoolean(offset + 6, $pln_and_qty_flg);
	}

	public void pln_and_qty_flg(boolean value) {
		setConstBoolean(offset + 6, $pln_and_qty_flg, value);
	}


	public boolean pln_and_unit_flg() {
		return getConstBoolean(offset + 7, $pln_and_unit_flg);
	}

	public void pln_and_unit_flg(boolean value) {
		setConstBoolean(offset + 7, $pln_and_unit_flg, value);
	}


	public boolean pln_and_amt_flg() {
		return getConstBoolean(offset + 8, $pln_and_amt_flg);
	}

	public void pln_and_amt_flg(boolean value) {
		setConstBoolean(offset + 8, $pln_and_amt_flg, value);
	}


	public boolean pln_and_base_flg() {
		return getConstBoolean(offset + 9, $pln_and_base_flg);
	}

	public void pln_and_base_flg(boolean value) {
		setConstBoolean(offset + 9, $pln_and_base_flg, value);
	}


	public boolean pln_and_base_unit_flg() {
		return getConstBoolean(offset + 10, $pln_and_base_unit_flg);
	}

	public void pln_and_base_unit_flg(boolean value) {
		setConstBoolean(offset + 10, $pln_and_base_unit_flg, value);
	}


	public MCNumber getNumber(String name) {
		if ($add_disp_digit.equalsIgnoreCase(name)) {
			return add_disp_digit();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($disp_qty.equalsIgnoreCase(name)) {
			return disp_qty();
		}
		if ($disp_unit.equalsIgnoreCase(name)) {
			return disp_unit();
		}
		if ($disp_amt.equalsIgnoreCase(name)) {
			return disp_amt();
		}
		if ($disp_base.equalsIgnoreCase(name)) {
			return disp_base();
		}
		if ($disp_base_unit.equalsIgnoreCase(name)) {
			return disp_base_unit();
		}
		if ($pln_and_qty_flg.equalsIgnoreCase(name)) {
			return pln_and_qty_flg();
		}
		if ($pln_and_unit_flg.equalsIgnoreCase(name)) {
			return pln_and_unit_flg();
		}
		if ($pln_and_amt_flg.equalsIgnoreCase(name)) {
			return pln_and_amt_flg();
		}
		if ($pln_and_base_flg.equalsIgnoreCase(name)) {
			return pln_and_base_flg();
		}
		if ($pln_and_base_unit_flg.equalsIgnoreCase(name)) {
			return pln_and_base_unit_flg();
		}
		return super.getBoolean(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($add_disp_digit.equalsIgnoreCase(name)) {
			return add_disp_digit();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($disp_qty.equalsIgnoreCase(name)) {
			return disp_qty();
		}
		if ($disp_unit.equalsIgnoreCase(name)) {
			return disp_unit();
		}
		if ($disp_amt.equalsIgnoreCase(name)) {
			return disp_amt();
		}
		if ($disp_base.equalsIgnoreCase(name)) {
			return disp_base();
		}
		if ($disp_base_unit.equalsIgnoreCase(name)) {
			return disp_base_unit();
		}
		if ($pln_and_qty_flg.equalsIgnoreCase(name)) {
			return pln_and_qty_flg();
		}
		if ($pln_and_unit_flg.equalsIgnoreCase(name)) {
			return pln_and_unit_flg();
		}
		if ($pln_and_amt_flg.equalsIgnoreCase(name)) {
			return pln_and_amt_flg();
		}
		if ($pln_and_base_flg.equalsIgnoreCase(name)) {
			return pln_and_base_flg();
		}
		if ($pln_and_base_unit_flg.equalsIgnoreCase(name)) {
			return pln_and_base_unit_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setNumber(String name, MCNumber value) {
		if ($add_disp_digit.equalsIgnoreCase(name)) {
			add_disp_digit(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($add_disp_digit.equalsIgnoreCase(name)) {
			add_disp_digit(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($add_disp_digit.equalsIgnoreCase(name)) {
			add_disp_digit(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($add_disp_digit.equalsIgnoreCase(name)) {
			add_disp_digit(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($add_disp_digit.equalsIgnoreCase(name)) {
			add_disp_digit(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($disp_qty.equalsIgnoreCase(name)) {
			disp_qty(value);
			return;
		}
		if ($disp_unit.equalsIgnoreCase(name)) {
			disp_unit(value);
			return;
		}
		if ($disp_amt.equalsIgnoreCase(name)) {
			disp_amt(value);
			return;
		}
		if ($disp_base.equalsIgnoreCase(name)) {
			disp_base(value);
			return;
		}
		if ($disp_base_unit.equalsIgnoreCase(name)) {
			disp_base_unit(value);
			return;
		}
		if ($pln_and_qty_flg.equalsIgnoreCase(name)) {
			pln_and_qty_flg(value);
			return;
		}
		if ($pln_and_unit_flg.equalsIgnoreCase(name)) {
			pln_and_unit_flg(value);
			return;
		}
		if ($pln_and_amt_flg.equalsIgnoreCase(name)) {
			pln_and_amt_flg(value);
			return;
		}
		if ($pln_and_base_flg.equalsIgnoreCase(name)) {
			pln_and_base_flg(value);
			return;
		}
		if ($pln_and_base_unit_flg.equalsIgnoreCase(name)) {
			pln_and_base_unit_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($add_disp_digit.equalsIgnoreCase(name)) {
			add_disp_digit(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($add_disp_digit.equalsIgnoreCase(name)) {
			add_disp_digit(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($add_disp_digit.equalsIgnoreCase(name)) {
			add_disp_digit(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($add_disp_digit.equalsIgnoreCase(name)) {
			add_disp_digit(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($add_disp_digit.equalsIgnoreCase(name)) {
			add_disp_digit(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($disp_qty.equalsIgnoreCase(name)) {
			disp_qty(value);
			return;
		}
		if ($disp_unit.equalsIgnoreCase(name)) {
			disp_unit(value);
			return;
		}
		if ($disp_amt.equalsIgnoreCase(name)) {
			disp_amt(value);
			return;
		}
		if ($disp_base.equalsIgnoreCase(name)) {
			disp_base(value);
			return;
		}
		if ($disp_base_unit.equalsIgnoreCase(name)) {
			disp_base_unit(value);
			return;
		}
		if ($pln_and_qty_flg.equalsIgnoreCase(name)) {
			pln_and_qty_flg(value);
			return;
		}
		if ($pln_and_unit_flg.equalsIgnoreCase(name)) {
			pln_and_unit_flg(value);
			return;
		}
		if ($pln_and_amt_flg.equalsIgnoreCase(name)) {
			pln_and_amt_flg(value);
			return;
		}
		if ($pln_and_base_flg.equalsIgnoreCase(name)) {
			pln_and_base_flg(value);
			return;
		}
		if ($pln_and_base_unit_flg.equalsIgnoreCase(name)) {
			pln_and_base_unit_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

