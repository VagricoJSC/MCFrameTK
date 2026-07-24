package mcframe.clientMAUB.MAUBP5340;

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
 * ブロック"WkCostQty"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class WkCostQtyR_MC_A extends MCConstRow {

	/**
	 * Man-hour (Constant) 工数（固定）.<p>
	 *
	 */
	public static final String $wk_cost_qty = "wk_cost_qty";


	public static final MCMeta wk_cost_qty_META = createCommonMeta($wk_cost_qty, mcframe.commonMA.meta.MA_META.WK_COST_QTY);

	protected static final ConstMetaList<WkCostQtyR> constMetas = new ConstMetaList<WkCostQtyR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			wk_cost_qty_META
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


	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null
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
	protected WkCostQtyR_MC_A(ConstMetaList<? extends WkCostQtyR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public WkCostQtyR clone() {
		return (WkCostQtyR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public WkCostQtyR createInstance() {
		return (WkCostQtyR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public WkCostQtyR getValues(String... names) {
		return (WkCostQtyR) super.getValues(names);
	}



	/**
	 * Man-hour (Constant) 工数（固定）.<p>
	 *
	 */
	public MCNumber wk_cost_qty() {
		return getConstNumber(offset + 0, $wk_cost_qty);
	}

	/**
	 * Man-hour (Constant) 工数（固定）.<p>
	 *
	 */
	public void wk_cost_qty(MCNumber value) {
		setConstNumber(offset + 0, $wk_cost_qty, value);
	}

	/**
	 * Man-hour (Constant) 工数（固定）.<p>
	 *
	 */
	public void wk_cost_qty(int value) {
		setConstNumber(offset + 0, $wk_cost_qty, value);
	}

	/**
	 * Man-hour (Constant) 工数（固定）.<p>
	 *
	 */
	public void wk_cost_qty(long value) {
		setConstNumber(offset + 0, $wk_cost_qty, value);
	}

	/**
	 * Man-hour (Constant) 工数（固定）.<p>
	 *
	 */
	public void wk_cost_qty(float value) {
		setConstNumber(offset + 0, $wk_cost_qty, value);
	}

	/**
	 * Man-hour (Constant) 工数（固定）.<p>
	 *
	 */
	public void wk_cost_qty(double value) {
		setConstNumber(offset + 0, $wk_cost_qty, value);
	}


	public MCNumber getNumber(String name) {
		if ($wk_cost_qty.equalsIgnoreCase(name)) {
			return wk_cost_qty();
		}
		return super.getNumber(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($wk_cost_qty.equalsIgnoreCase(name)) {
			return wk_cost_qty();
		}
		return super.getNumberNE(name);
	}

	public void setNumber(String name, MCNumber value) {
		if ($wk_cost_qty.equalsIgnoreCase(name)) {
			wk_cost_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($wk_cost_qty.equalsIgnoreCase(name)) {
			wk_cost_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($wk_cost_qty.equalsIgnoreCase(name)) {
			wk_cost_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($wk_cost_qty.equalsIgnoreCase(name)) {
			wk_cost_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($wk_cost_qty.equalsIgnoreCase(name)) {
			wk_cost_qty(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($wk_cost_qty.equalsIgnoreCase(name)) {
			wk_cost_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($wk_cost_qty.equalsIgnoreCase(name)) {
			wk_cost_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($wk_cost_qty.equalsIgnoreCase(name)) {
			wk_cost_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($wk_cost_qty.equalsIgnoreCase(name)) {
			wk_cost_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($wk_cost_qty.equalsIgnoreCase(name)) {
			wk_cost_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

