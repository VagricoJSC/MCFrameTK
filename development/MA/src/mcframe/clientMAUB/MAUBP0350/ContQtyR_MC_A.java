package mcframe.clientMAUB.MAUBP0350;

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
 * ブロック"ContQty"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ContQtyR_MC_A extends MCConstRow {

	/**
	 * Active ingredient 有効成分.<p>
	 *
	 */
	public static final String $cont_qty = "cont_qty";


	public static final MCMeta cont_qty_META = createCommonMeta($cont_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);

	protected static final ConstMetaList<ContQtyR> constMetas = new ConstMetaList<ContQtyR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			cont_qty_META
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
	protected ContQtyR_MC_A(ConstMetaList<? extends ContQtyR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ContQtyR clone() {
		return (ContQtyR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ContQtyR createInstance() {
		return (ContQtyR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ContQtyR getValues(String... names) {
		return (ContQtyR) super.getValues(names);
	}



	/**
	 * Active ingredient 有効成分.<p>
	 *
	 */
	public MCNumber cont_qty() {
		return getConstNumber(offset + 0, $cont_qty);
	}

	/**
	 * Active ingredient 有効成分.<p>
	 *
	 */
	public void cont_qty(MCNumber value) {
		setConstNumber(offset + 0, $cont_qty, value);
	}

	/**
	 * Active ingredient 有効成分.<p>
	 *
	 */
	public void cont_qty(int value) {
		setConstNumber(offset + 0, $cont_qty, value);
	}

	/**
	 * Active ingredient 有効成分.<p>
	 *
	 */
	public void cont_qty(long value) {
		setConstNumber(offset + 0, $cont_qty, value);
	}

	/**
	 * Active ingredient 有効成分.<p>
	 *
	 */
	public void cont_qty(float value) {
		setConstNumber(offset + 0, $cont_qty, value);
	}

	/**
	 * Active ingredient 有効成分.<p>
	 *
	 */
	public void cont_qty(double value) {
		setConstNumber(offset + 0, $cont_qty, value);
	}


	public MCNumber getNumber(String name) {
		if ($cont_qty.equalsIgnoreCase(name)) {
			return cont_qty();
		}
		return super.getNumber(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($cont_qty.equalsIgnoreCase(name)) {
			return cont_qty();
		}
		return super.getNumberNE(name);
	}

	public void setNumber(String name, MCNumber value) {
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

