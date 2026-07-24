package mcframe.serverMGBF.MGBFL0490;

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
 * ブロック"Srch01_Rslt4"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_Rslt4R_MC_A extends MCConstRow {

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
	 * Plan amount 計画金額.<p>
	 *
	 */
	public static final String $pln_cost = "pln_cost";


	public static final MCMeta bp_cd_META = createCommonMeta($bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bp_nm_META = createCommonMeta($bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta ym_META = createCommonMeta($ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta act_cost_META = createCommonMeta($act_cost, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pln_cost_META = createCommonMeta($pln_cost, mcframe.commonMA.meta.MA_META.MONEY);

	protected static final ConstMetaList<Srch01_Rslt4R> constMetas = new ConstMetaList<Srch01_Rslt4R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			bp_cd_META,
			bp_nm_META,
			ym_META,
			act_cost_META,
			pln_cost_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
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
	protected Srch01_Rslt4R_MC_A(ConstMetaList<? extends Srch01_Rslt4R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Rslt4R clone() {
		return (Srch01_Rslt4R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Rslt4R createInstance() {
		return (Srch01_Rslt4R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Rslt4R getValues(String... names) {
		return (Srch01_Rslt4R) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
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
	 * Plan amount 計画金額.<p>
	 *
	 */
	public MCNumber pln_cost() {
		return getConstNumber(offset + 4, $pln_cost);
	}

	/**
	 * Plan amount 計画金額.<p>
	 *
	 */
	public void pln_cost(MCNumber value) {
		setConstNumber(offset + 4, $pln_cost, value);
	}

	/**
	 * Plan amount 計画金額.<p>
	 *
	 */
	public void pln_cost(int value) {
		setConstNumber(offset + 4, $pln_cost, value);
	}

	/**
	 * Plan amount 計画金額.<p>
	 *
	 */
	public void pln_cost(long value) {
		setConstNumber(offset + 4, $pln_cost, value);
	}

	/**
	 * Plan amount 計画金額.<p>
	 *
	 */
	public void pln_cost(float value) {
		setConstNumber(offset + 4, $pln_cost, value);
	}

	/**
	 * Plan amount 計画金額.<p>
	 *
	 */
	public void pln_cost(double value) {
		setConstNumber(offset + 4, $pln_cost, value);
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

