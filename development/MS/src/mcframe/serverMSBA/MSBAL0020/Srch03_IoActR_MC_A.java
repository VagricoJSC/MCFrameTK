package mcframe.serverMSBA.MSBAL0020;

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
 * ブロック"Srch03_IoAct"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch03_IoActR_MC_A extends MCConstRow {

	public static final String $wg_rqst_no = "wg_rqst_no";
	public static final String $wg_rqst_prms_no = "wg_rqst_prms_no";
	public static final String $gi_act_qty = "gi_act_qty";
	public static final String $gr_act_qty = "gr_act_qty";


	public static final MCMeta wg_rqst_no_META = createCommonMeta($wg_rqst_no, mcframe.commonMA.meta.MA_META.WG_RQST_NO);
	public static final MCMeta wg_rqst_prms_no_META = createCommonMeta($wg_rqst_prms_no, mcframe.commonMA.meta.MA_META.WG_RQST_PRMS_NO);
	public static final MCMeta gi_act_qty_META = createCommonMeta($gi_act_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta gr_act_qty_META = createCommonMeta($gr_act_qty, mcframe.commonMA.meta.MA_META.QTY);

	protected static final ConstMetaList<Srch03_IoActR> constMetas = new ConstMetaList<Srch03_IoActR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			wg_rqst_no_META,
			wg_rqst_prms_no_META,
			gi_act_qty_META,
			gr_act_qty_META
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
	protected Srch03_IoActR_MC_A(ConstMetaList<? extends Srch03_IoActR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch03_IoActR clone() {
		return (Srch03_IoActR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch03_IoActR createInstance() {
		return (Srch03_IoActR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch03_IoActR getValues(String... names) {
		return (Srch03_IoActR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	public String wg_rqst_no() {
		return getConstString(offset + 0, $wg_rqst_no);
	}

	public void wg_rqst_no(String value) {
		setConstString(offset + 0, $wg_rqst_no, value);
	}


	public String wg_rqst_prms_no() {
		return getConstString(offset + 1, $wg_rqst_prms_no);
	}

	public void wg_rqst_prms_no(String value) {
		setConstString(offset + 1, $wg_rqst_prms_no, value);
	}


	public MCNumber gi_act_qty() {
		return getConstNumber(offset + 2, $gi_act_qty);
	}

	public void gi_act_qty(MCNumber value) {
		setConstNumber(offset + 2, $gi_act_qty, value);
	}

	public void gi_act_qty(int value) {
		setConstNumber(offset + 2, $gi_act_qty, value);
	}

	public void gi_act_qty(long value) {
		setConstNumber(offset + 2, $gi_act_qty, value);
	}

	public void gi_act_qty(float value) {
		setConstNumber(offset + 2, $gi_act_qty, value);
	}

	public void gi_act_qty(double value) {
		setConstNumber(offset + 2, $gi_act_qty, value);
	}


	public MCNumber gr_act_qty() {
		return getConstNumber(offset + 3, $gr_act_qty);
	}

	public void gr_act_qty(MCNumber value) {
		setConstNumber(offset + 3, $gr_act_qty, value);
	}

	public void gr_act_qty(int value) {
		setConstNumber(offset + 3, $gr_act_qty, value);
	}

	public void gr_act_qty(long value) {
		setConstNumber(offset + 3, $gr_act_qty, value);
	}

	public void gr_act_qty(float value) {
		setConstNumber(offset + 3, $gr_act_qty, value);
	}

	public void gr_act_qty(double value) {
		setConstNumber(offset + 3, $gr_act_qty, value);
	}


	public String getString(String name) {
		if ($wg_rqst_no.equalsIgnoreCase(name)) {
			return wg_rqst_no();
		}
		if ($wg_rqst_prms_no.equalsIgnoreCase(name)) {
			return wg_rqst_prms_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($gi_act_qty.equalsIgnoreCase(name)) {
			return gi_act_qty();
		}
		if ($gr_act_qty.equalsIgnoreCase(name)) {
			return gr_act_qty();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($wg_rqst_no.equalsIgnoreCase(name)) {
			return wg_rqst_no();
		}
		if ($wg_rqst_prms_no.equalsIgnoreCase(name)) {
			return wg_rqst_prms_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($gi_act_qty.equalsIgnoreCase(name)) {
			return gi_act_qty();
		}
		if ($gr_act_qty.equalsIgnoreCase(name)) {
			return gr_act_qty();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($wg_rqst_no.equalsIgnoreCase(name)) {
			wg_rqst_no(value);
			return;
		}
		if ($wg_rqst_prms_no.equalsIgnoreCase(name)) {
			wg_rqst_prms_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($gi_act_qty.equalsIgnoreCase(name)) {
			gi_act_qty(value);
			return;
		}
		if ($gr_act_qty.equalsIgnoreCase(name)) {
			gr_act_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($gi_act_qty.equalsIgnoreCase(name)) {
			gi_act_qty(value);
			return;
		}
		if ($gr_act_qty.equalsIgnoreCase(name)) {
			gr_act_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($gi_act_qty.equalsIgnoreCase(name)) {
			gi_act_qty(value);
			return;
		}
		if ($gr_act_qty.equalsIgnoreCase(name)) {
			gr_act_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($gi_act_qty.equalsIgnoreCase(name)) {
			gi_act_qty(value);
			return;
		}
		if ($gr_act_qty.equalsIgnoreCase(name)) {
			gr_act_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($gi_act_qty.equalsIgnoreCase(name)) {
			gi_act_qty(value);
			return;
		}
		if ($gr_act_qty.equalsIgnoreCase(name)) {
			gr_act_qty(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($wg_rqst_no.equalsIgnoreCase(name)) {
			wg_rqst_no(value);
			return;
		}
		if ($wg_rqst_prms_no.equalsIgnoreCase(name)) {
			wg_rqst_prms_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($gi_act_qty.equalsIgnoreCase(name)) {
			gi_act_qty(value);
			return;
		}
		if ($gr_act_qty.equalsIgnoreCase(name)) {
			gr_act_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($gi_act_qty.equalsIgnoreCase(name)) {
			gi_act_qty(value);
			return;
		}
		if ($gr_act_qty.equalsIgnoreCase(name)) {
			gr_act_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($gi_act_qty.equalsIgnoreCase(name)) {
			gi_act_qty(value);
			return;
		}
		if ($gr_act_qty.equalsIgnoreCase(name)) {
			gr_act_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($gi_act_qty.equalsIgnoreCase(name)) {
			gi_act_qty(value);
			return;
		}
		if ($gr_act_qty.equalsIgnoreCase(name)) {
			gr_act_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($gi_act_qty.equalsIgnoreCase(name)) {
			gi_act_qty(value);
			return;
		}
		if ($gr_act_qty.equalsIgnoreCase(name)) {
			gr_act_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

