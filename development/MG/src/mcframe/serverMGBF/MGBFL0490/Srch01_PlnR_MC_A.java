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
 * ブロック"Srch01_Pln"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_PlnR_MC_A extends MCConstRow {

	/**
	 * Plan 計画.<p>
	 *
	 */
	public static final String $pln_cost = "pln_cost";
	/**
	 * Planned qty. 計画数.<p>
	 *
	 */
	public static final String $pln_qty = "pln_qty";
	/**
	 * Planned volume 計画容積.<p>
	 *
	 */
	public static final String $pln_dim = "pln_dim";
	/**
	 * Plan weight 計画重量.<p>
	 *
	 */
	public static final String $pln_wt = "pln_wt";
	/**
	 * Plan conversion 計画入り目.<p>
	 *
	 */
	public static final String $pln_conts = "pln_conts";


	public static final MCMeta pln_cost_META = createCommonMeta($pln_cost, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pln_qty_META = createCommonMeta($pln_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pln_dim_META = createCommonMeta($pln_dim, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pln_wt_META = createCommonMeta($pln_wt, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pln_conts_META = createCommonMeta($pln_conts, mcframe.commonMA.meta.MA_META.QTY);

	protected static final ConstMetaList<Srch01_PlnR> constMetas = new ConstMetaList<Srch01_PlnR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			pln_cost_META,
			pln_qty_META,
			pln_dim_META,
			pln_wt_META,
			pln_conts_META
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
	protected Srch01_PlnR_MC_A(ConstMetaList<? extends Srch01_PlnR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_PlnR clone() {
		return (Srch01_PlnR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_PlnR createInstance() {
		return (Srch01_PlnR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_PlnR getValues(String... names) {
		return (Srch01_PlnR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCNumber pln_cost() {
		return getConstNumber(offset + 0, $pln_cost);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln_cost(MCNumber value) {
		setConstNumber(offset + 0, $pln_cost, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln_cost(int value) {
		setConstNumber(offset + 0, $pln_cost, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln_cost(long value) {
		setConstNumber(offset + 0, $pln_cost, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln_cost(float value) {
		setConstNumber(offset + 0, $pln_cost, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln_cost(double value) {
		setConstNumber(offset + 0, $pln_cost, value);
	}


	/**
	 * Planned qty. 計画数.<p>
	 *
	 */
	public MCNumber pln_qty() {
		return getConstNumber(offset + 1, $pln_qty);
	}

	/**
	 * Planned qty. 計画数.<p>
	 *
	 */
	public void pln_qty(MCNumber value) {
		setConstNumber(offset + 1, $pln_qty, value);
	}

	/**
	 * Planned qty. 計画数.<p>
	 *
	 */
	public void pln_qty(int value) {
		setConstNumber(offset + 1, $pln_qty, value);
	}

	/**
	 * Planned qty. 計画数.<p>
	 *
	 */
	public void pln_qty(long value) {
		setConstNumber(offset + 1, $pln_qty, value);
	}

	/**
	 * Planned qty. 計画数.<p>
	 *
	 */
	public void pln_qty(float value) {
		setConstNumber(offset + 1, $pln_qty, value);
	}

	/**
	 * Planned qty. 計画数.<p>
	 *
	 */
	public void pln_qty(double value) {
		setConstNumber(offset + 1, $pln_qty, value);
	}


	/**
	 * Planned volume 計画容積.<p>
	 *
	 */
	public MCNumber pln_dim() {
		return getConstNumber(offset + 2, $pln_dim);
	}

	/**
	 * Planned volume 計画容積.<p>
	 *
	 */
	public void pln_dim(MCNumber value) {
		setConstNumber(offset + 2, $pln_dim, value);
	}

	/**
	 * Planned volume 計画容積.<p>
	 *
	 */
	public void pln_dim(int value) {
		setConstNumber(offset + 2, $pln_dim, value);
	}

	/**
	 * Planned volume 計画容積.<p>
	 *
	 */
	public void pln_dim(long value) {
		setConstNumber(offset + 2, $pln_dim, value);
	}

	/**
	 * Planned volume 計画容積.<p>
	 *
	 */
	public void pln_dim(float value) {
		setConstNumber(offset + 2, $pln_dim, value);
	}

	/**
	 * Planned volume 計画容積.<p>
	 *
	 */
	public void pln_dim(double value) {
		setConstNumber(offset + 2, $pln_dim, value);
	}


	/**
	 * Plan weight 計画重量.<p>
	 *
	 */
	public MCNumber pln_wt() {
		return getConstNumber(offset + 3, $pln_wt);
	}

	/**
	 * Plan weight 計画重量.<p>
	 *
	 */
	public void pln_wt(MCNumber value) {
		setConstNumber(offset + 3, $pln_wt, value);
	}

	/**
	 * Plan weight 計画重量.<p>
	 *
	 */
	public void pln_wt(int value) {
		setConstNumber(offset + 3, $pln_wt, value);
	}

	/**
	 * Plan weight 計画重量.<p>
	 *
	 */
	public void pln_wt(long value) {
		setConstNumber(offset + 3, $pln_wt, value);
	}

	/**
	 * Plan weight 計画重量.<p>
	 *
	 */
	public void pln_wt(float value) {
		setConstNumber(offset + 3, $pln_wt, value);
	}

	/**
	 * Plan weight 計画重量.<p>
	 *
	 */
	public void pln_wt(double value) {
		setConstNumber(offset + 3, $pln_wt, value);
	}


	/**
	 * Plan conversion 計画入り目.<p>
	 *
	 */
	public MCNumber pln_conts() {
		return getConstNumber(offset + 4, $pln_conts);
	}

	/**
	 * Plan conversion 計画入り目.<p>
	 *
	 */
	public void pln_conts(MCNumber value) {
		setConstNumber(offset + 4, $pln_conts, value);
	}

	/**
	 * Plan conversion 計画入り目.<p>
	 *
	 */
	public void pln_conts(int value) {
		setConstNumber(offset + 4, $pln_conts, value);
	}

	/**
	 * Plan conversion 計画入り目.<p>
	 *
	 */
	public void pln_conts(long value) {
		setConstNumber(offset + 4, $pln_conts, value);
	}

	/**
	 * Plan conversion 計画入り目.<p>
	 *
	 */
	public void pln_conts(float value) {
		setConstNumber(offset + 4, $pln_conts, value);
	}

	/**
	 * Plan conversion 計画入り目.<p>
	 *
	 */
	public void pln_conts(double value) {
		setConstNumber(offset + 4, $pln_conts, value);
	}


	public MCNumber getNumber(String name) {
		if ($pln_cost.equalsIgnoreCase(name)) {
			return pln_cost();
		}
		if ($pln_qty.equalsIgnoreCase(name)) {
			return pln_qty();
		}
		if ($pln_dim.equalsIgnoreCase(name)) {
			return pln_dim();
		}
		if ($pln_wt.equalsIgnoreCase(name)) {
			return pln_wt();
		}
		if ($pln_conts.equalsIgnoreCase(name)) {
			return pln_conts();
		}
		return super.getNumber(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($pln_cost.equalsIgnoreCase(name)) {
			return pln_cost();
		}
		if ($pln_qty.equalsIgnoreCase(name)) {
			return pln_qty();
		}
		if ($pln_dim.equalsIgnoreCase(name)) {
			return pln_dim();
		}
		if ($pln_wt.equalsIgnoreCase(name)) {
			return pln_wt();
		}
		if ($pln_conts.equalsIgnoreCase(name)) {
			return pln_conts();
		}
		return super.getNumberNE(name);
	}

	public void setNumber(String name, MCNumber value) {
		if ($pln_cost.equalsIgnoreCase(name)) {
			pln_cost(value);
			return;
		}
		if ($pln_qty.equalsIgnoreCase(name)) {
			pln_qty(value);
			return;
		}
		if ($pln_dim.equalsIgnoreCase(name)) {
			pln_dim(value);
			return;
		}
		if ($pln_wt.equalsIgnoreCase(name)) {
			pln_wt(value);
			return;
		}
		if ($pln_conts.equalsIgnoreCase(name)) {
			pln_conts(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($pln_cost.equalsIgnoreCase(name)) {
			pln_cost(value);
			return;
		}
		if ($pln_qty.equalsIgnoreCase(name)) {
			pln_qty(value);
			return;
		}
		if ($pln_dim.equalsIgnoreCase(name)) {
			pln_dim(value);
			return;
		}
		if ($pln_wt.equalsIgnoreCase(name)) {
			pln_wt(value);
			return;
		}
		if ($pln_conts.equalsIgnoreCase(name)) {
			pln_conts(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($pln_cost.equalsIgnoreCase(name)) {
			pln_cost(value);
			return;
		}
		if ($pln_qty.equalsIgnoreCase(name)) {
			pln_qty(value);
			return;
		}
		if ($pln_dim.equalsIgnoreCase(name)) {
			pln_dim(value);
			return;
		}
		if ($pln_wt.equalsIgnoreCase(name)) {
			pln_wt(value);
			return;
		}
		if ($pln_conts.equalsIgnoreCase(name)) {
			pln_conts(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($pln_cost.equalsIgnoreCase(name)) {
			pln_cost(value);
			return;
		}
		if ($pln_qty.equalsIgnoreCase(name)) {
			pln_qty(value);
			return;
		}
		if ($pln_dim.equalsIgnoreCase(name)) {
			pln_dim(value);
			return;
		}
		if ($pln_wt.equalsIgnoreCase(name)) {
			pln_wt(value);
			return;
		}
		if ($pln_conts.equalsIgnoreCase(name)) {
			pln_conts(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($pln_cost.equalsIgnoreCase(name)) {
			pln_cost(value);
			return;
		}
		if ($pln_qty.equalsIgnoreCase(name)) {
			pln_qty(value);
			return;
		}
		if ($pln_dim.equalsIgnoreCase(name)) {
			pln_dim(value);
			return;
		}
		if ($pln_wt.equalsIgnoreCase(name)) {
			pln_wt(value);
			return;
		}
		if ($pln_conts.equalsIgnoreCase(name)) {
			pln_conts(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($pln_cost.equalsIgnoreCase(name)) {
			pln_cost(value);
			return;
		}
		if ($pln_qty.equalsIgnoreCase(name)) {
			pln_qty(value);
			return;
		}
		if ($pln_dim.equalsIgnoreCase(name)) {
			pln_dim(value);
			return;
		}
		if ($pln_wt.equalsIgnoreCase(name)) {
			pln_wt(value);
			return;
		}
		if ($pln_conts.equalsIgnoreCase(name)) {
			pln_conts(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($pln_cost.equalsIgnoreCase(name)) {
			pln_cost(value);
			return;
		}
		if ($pln_qty.equalsIgnoreCase(name)) {
			pln_qty(value);
			return;
		}
		if ($pln_dim.equalsIgnoreCase(name)) {
			pln_dim(value);
			return;
		}
		if ($pln_wt.equalsIgnoreCase(name)) {
			pln_wt(value);
			return;
		}
		if ($pln_conts.equalsIgnoreCase(name)) {
			pln_conts(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($pln_cost.equalsIgnoreCase(name)) {
			pln_cost(value);
			return;
		}
		if ($pln_qty.equalsIgnoreCase(name)) {
			pln_qty(value);
			return;
		}
		if ($pln_dim.equalsIgnoreCase(name)) {
			pln_dim(value);
			return;
		}
		if ($pln_wt.equalsIgnoreCase(name)) {
			pln_wt(value);
			return;
		}
		if ($pln_conts.equalsIgnoreCase(name)) {
			pln_conts(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($pln_cost.equalsIgnoreCase(name)) {
			pln_cost(value);
			return;
		}
		if ($pln_qty.equalsIgnoreCase(name)) {
			pln_qty(value);
			return;
		}
		if ($pln_dim.equalsIgnoreCase(name)) {
			pln_dim(value);
			return;
		}
		if ($pln_wt.equalsIgnoreCase(name)) {
			pln_wt(value);
			return;
		}
		if ($pln_conts.equalsIgnoreCase(name)) {
			pln_conts(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($pln_cost.equalsIgnoreCase(name)) {
			pln_cost(value);
			return;
		}
		if ($pln_qty.equalsIgnoreCase(name)) {
			pln_qty(value);
			return;
		}
		if ($pln_dim.equalsIgnoreCase(name)) {
			pln_dim(value);
			return;
		}
		if ($pln_wt.equalsIgnoreCase(name)) {
			pln_wt(value);
			return;
		}
		if ($pln_conts.equalsIgnoreCase(name)) {
			pln_conts(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

