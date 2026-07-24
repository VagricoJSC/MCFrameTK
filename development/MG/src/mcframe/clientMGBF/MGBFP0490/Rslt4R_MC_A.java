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
 * ブロック"Rslt4"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Rslt4R_MC_A extends MCConstRow {

	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public static final String $bp_cd = "bp_cd";
	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public static final String $bp_nm = "bp_nm";
	/**
	 * Year month 年月.<p>
	 *
	 */
	public static final String $ym = "ym";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $act_cost = "act_cost";
	/**
	 * Basic unit per unit 原単位単価.<p>
	 *
	 */
	public static final String $base_unit = "base_unit";
	/**
	 * Plan amount 計画金額.<p>
	 *
	 */
	public static final String $pln_cost = "pln_cost";


	public static final MCMeta bp_cd_META = createCommonMeta($bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bp_nm_META = createCommonMeta($bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta ym_META = createCommonMeta($ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta act_cost_META = createCommonMeta($act_cost, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_unit_META = createCommonMeta($base_unit, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pln_cost_META = createCommonMeta($pln_cost, mcframe.commonMA.meta.MA_META.MONEY);

	protected static final ConstMetaList<Rslt4R> constMetas = new ConstMetaList<Rslt4R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			bp_cd_META,
			bp_nm_META,
			ym_META,
			act_cost_META,
			base_unit_META,
			pln_cost_META
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
				{$bp_cd, "Key"}	// bp_cd
			}
		)),
		new MCExtMap.Entry($$OTHER, new MCExtList(
			new String[][]{
				{$bp_nm, "Key"}	// bp_nm
			}
		)),
		new MCExtMap.Entry($$HVAL, new MCExtList(
			new String[][]{
				{$act_cost, "Key"},	// act_cost
				{$base_unit, "Key"},	// base_unit
				{$pln_cost, "Key"}	// pln_cost
			}
		)),
		new MCExtMap.Entry($$ELM, new MCExtList(
			new String[][]{
				{$ym, "Key"}	// ym
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
	protected Rslt4R_MC_A(ConstMetaList<? extends Rslt4R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Rslt4R clone() {
		return (Rslt4R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Rslt4R createInstance() {
		return (Rslt4R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Rslt4R getValues(String... names) {
		return (Rslt4R) super.getValues(names);
	}



	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public String bp_cd() {
		return getConstString(offset + 0, $bp_cd);
	}

	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public void bp_cd(String value) {
		setConstString(offset + 0, $bp_cd, value);
	}


	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public String bp_nm() {
		return getConstString(offset + 1, $bp_nm);
	}

	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public void bp_nm(String value) {
		setConstString(offset + 1, $bp_nm, value);
	}


	/**
	 * Year month 年月.<p>
	 *
	 */
	public MCDate ym() {
		return getConstDate(offset + 2, $ym);
	}

	/**
	 * Year month 年月.<p>
	 *
	 */
	public void ym(MCDate value) {
		setConstDate(offset + 2, $ym, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber act_cost() {
		return getConstNumber(offset + 3, $act_cost);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void act_cost(MCNumber value) {
		setConstNumber(offset + 3, $act_cost, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void act_cost(int value) {
		setConstNumber(offset + 3, $act_cost, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void act_cost(long value) {
		setConstNumber(offset + 3, $act_cost, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void act_cost(float value) {
		setConstNumber(offset + 3, $act_cost, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void act_cost(double value) {
		setConstNumber(offset + 3, $act_cost, value);
	}


	/**
	 * Basic unit per unit 原単位単価.<p>
	 *
	 */
	public MCNumber base_unit() {
		return getConstNumber(offset + 4, $base_unit);
	}

	/**
	 * Basic unit per unit 原単位単価.<p>
	 *
	 */
	public void base_unit(MCNumber value) {
		setConstNumber(offset + 4, $base_unit, value);
	}

	/**
	 * Basic unit per unit 原単位単価.<p>
	 *
	 */
	public void base_unit(int value) {
		setConstNumber(offset + 4, $base_unit, value);
	}

	/**
	 * Basic unit per unit 原単位単価.<p>
	 *
	 */
	public void base_unit(long value) {
		setConstNumber(offset + 4, $base_unit, value);
	}

	/**
	 * Basic unit per unit 原単位単価.<p>
	 *
	 */
	public void base_unit(float value) {
		setConstNumber(offset + 4, $base_unit, value);
	}

	/**
	 * Basic unit per unit 原単位単価.<p>
	 *
	 */
	public void base_unit(double value) {
		setConstNumber(offset + 4, $base_unit, value);
	}


	/**
	 * Plan amount 計画金額.<p>
	 *
	 */
	public MCNumber pln_cost() {
		return getConstNumber(offset + 5, $pln_cost);
	}

	/**
	 * Plan amount 計画金額.<p>
	 *
	 */
	public void pln_cost(MCNumber value) {
		setConstNumber(offset + 5, $pln_cost, value);
	}

	/**
	 * Plan amount 計画金額.<p>
	 *
	 */
	public void pln_cost(int value) {
		setConstNumber(offset + 5, $pln_cost, value);
	}

	/**
	 * Plan amount 計画金額.<p>
	 *
	 */
	public void pln_cost(long value) {
		setConstNumber(offset + 5, $pln_cost, value);
	}

	/**
	 * Plan amount 計画金額.<p>
	 *
	 */
	public void pln_cost(float value) {
		setConstNumber(offset + 5, $pln_cost, value);
	}

	/**
	 * Plan amount 計画金額.<p>
	 *
	 */
	public void pln_cost(double value) {
		setConstNumber(offset + 5, $pln_cost, value);
	}


	public String getString(String name) {
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($act_cost.equalsIgnoreCase(name)) {
			return act_cost();
		}
		if ($base_unit.equalsIgnoreCase(name)) {
			return base_unit();
		}
		if ($pln_cost.equalsIgnoreCase(name)) {
			return pln_cost();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($act_cost.equalsIgnoreCase(name)) {
			return act_cost();
		}
		if ($base_unit.equalsIgnoreCase(name)) {
			return base_unit();
		}
		if ($pln_cost.equalsIgnoreCase(name)) {
			return pln_cost();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($base_unit.equalsIgnoreCase(name)) {
			base_unit(value);
			return;
		}
		if ($pln_cost.equalsIgnoreCase(name)) {
			pln_cost(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($base_unit.equalsIgnoreCase(name)) {
			base_unit(value);
			return;
		}
		if ($pln_cost.equalsIgnoreCase(name)) {
			pln_cost(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($base_unit.equalsIgnoreCase(name)) {
			base_unit(value);
			return;
		}
		if ($pln_cost.equalsIgnoreCase(name)) {
			pln_cost(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($base_unit.equalsIgnoreCase(name)) {
			base_unit(value);
			return;
		}
		if ($pln_cost.equalsIgnoreCase(name)) {
			pln_cost(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($base_unit.equalsIgnoreCase(name)) {
			base_unit(value);
			return;
		}
		if ($pln_cost.equalsIgnoreCase(name)) {
			pln_cost(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($base_unit.equalsIgnoreCase(name)) {
			base_unit(value);
			return;
		}
		if ($pln_cost.equalsIgnoreCase(name)) {
			pln_cost(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($base_unit.equalsIgnoreCase(name)) {
			base_unit(value);
			return;
		}
		if ($pln_cost.equalsIgnoreCase(name)) {
			pln_cost(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($base_unit.equalsIgnoreCase(name)) {
			base_unit(value);
			return;
		}
		if ($pln_cost.equalsIgnoreCase(name)) {
			pln_cost(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($base_unit.equalsIgnoreCase(name)) {
			base_unit(value);
			return;
		}
		if ($pln_cost.equalsIgnoreCase(name)) {
			pln_cost(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($base_unit.equalsIgnoreCase(name)) {
			base_unit(value);
			return;
		}
		if ($pln_cost.equalsIgnoreCase(name)) {
			pln_cost(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

