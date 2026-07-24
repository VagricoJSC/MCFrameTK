package mcframe.serverMSBD.MSBDL0080;

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
 * ブロック"Srch02_Dtl2"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch02_Dtl2R_MC_A extends MCConstRow {

	/**
	 * Details pegged No. 明細紐付ＮＯ.<p>
	 *
	 */
	public static final String $dtl_peg_no = "dtl_peg_no";
	/**
	 * PO schedule No. 発注予定ＮＯ.<p>
	 *
	 */
	public static final String $po_schd_no = "po_schd_no";
	/**
	 * Update counter (PO schedule) 更新カウンタ(発注予定).<p>
	 *
	 */
	public static final String $po_schd_upd_cntr = "po_schd_upd_cntr";


	public static final MCMeta dtl_peg_no_META = createCommonMeta($dtl_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta po_schd_no_META = createCommonMeta($po_schd_no, mcframe.commonMA.meta.MA_META.PO_SCHD_NO);
	public static final MCMeta po_schd_upd_cntr_META = createCommonMeta($po_schd_upd_cntr, mcframe.commonMA.meta.MA_META.INT);

	protected static final ConstMetaList<Srch02_Dtl2R> constMetas = new ConstMetaList<Srch02_Dtl2R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			dtl_peg_no_META,
			po_schd_no_META,
			po_schd_upd_cntr_META
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
	protected Srch02_Dtl2R_MC_A(ConstMetaList<? extends Srch02_Dtl2R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch02_Dtl2R clone() {
		return (Srch02_Dtl2R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch02_Dtl2R createInstance() {
		return (Srch02_Dtl2R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch02_Dtl2R getValues(String... names) {
		return (Srch02_Dtl2R) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Details pegged No. 明細紐付ＮＯ.<p>
	 *
	 */
	public MCNumber dtl_peg_no() {
		return getConstNumber(offset + 0, $dtl_peg_no);
	}

	/**
	 * Details pegged No. 明細紐付ＮＯ.<p>
	 *
	 */
	public void dtl_peg_no(MCNumber value) {
		setConstNumber(offset + 0, $dtl_peg_no, value);
	}

	/**
	 * Details pegged No. 明細紐付ＮＯ.<p>
	 *
	 */
	public void dtl_peg_no(int value) {
		setConstNumber(offset + 0, $dtl_peg_no, value);
	}

	/**
	 * Details pegged No. 明細紐付ＮＯ.<p>
	 *
	 */
	public void dtl_peg_no(long value) {
		setConstNumber(offset + 0, $dtl_peg_no, value);
	}

	/**
	 * Details pegged No. 明細紐付ＮＯ.<p>
	 *
	 */
	public void dtl_peg_no(float value) {
		setConstNumber(offset + 0, $dtl_peg_no, value);
	}

	/**
	 * Details pegged No. 明細紐付ＮＯ.<p>
	 *
	 */
	public void dtl_peg_no(double value) {
		setConstNumber(offset + 0, $dtl_peg_no, value);
	}


	/**
	 * PO schedule No. 発注予定ＮＯ.<p>
	 *
	 */
	public String po_schd_no() {
		return getConstString(offset + 1, $po_schd_no);
	}

	/**
	 * PO schedule No. 発注予定ＮＯ.<p>
	 *
	 */
	public void po_schd_no(String value) {
		setConstString(offset + 1, $po_schd_no, value);
	}


	/**
	 * Update counter (PO schedule) 更新カウンタ(発注予定).<p>
	 *
	 */
	public MCNumber po_schd_upd_cntr() {
		return getConstNumber(offset + 2, $po_schd_upd_cntr);
	}

	/**
	 * Update counter (PO schedule) 更新カウンタ(発注予定).<p>
	 *
	 */
	public void po_schd_upd_cntr(MCNumber value) {
		setConstNumber(offset + 2, $po_schd_upd_cntr, value);
	}

	/**
	 * Update counter (PO schedule) 更新カウンタ(発注予定).<p>
	 *
	 */
	public void po_schd_upd_cntr(int value) {
		setConstNumber(offset + 2, $po_schd_upd_cntr, value);
	}

	/**
	 * Update counter (PO schedule) 更新カウンタ(発注予定).<p>
	 *
	 */
	public void po_schd_upd_cntr(long value) {
		setConstNumber(offset + 2, $po_schd_upd_cntr, value);
	}

	/**
	 * Update counter (PO schedule) 更新カウンタ(発注予定).<p>
	 *
	 */
	public void po_schd_upd_cntr(float value) {
		setConstNumber(offset + 2, $po_schd_upd_cntr, value);
	}

	/**
	 * Update counter (PO schedule) 更新カウンタ(発注予定).<p>
	 *
	 */
	public void po_schd_upd_cntr(double value) {
		setConstNumber(offset + 2, $po_schd_upd_cntr, value);
	}


	public String getString(String name) {
		if ($po_schd_no.equalsIgnoreCase(name)) {
			return po_schd_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			return dtl_peg_no();
		}
		if ($po_schd_upd_cntr.equalsIgnoreCase(name)) {
			return po_schd_upd_cntr();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($po_schd_no.equalsIgnoreCase(name)) {
			return po_schd_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			return dtl_peg_no();
		}
		if ($po_schd_upd_cntr.equalsIgnoreCase(name)) {
			return po_schd_upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($po_schd_no.equalsIgnoreCase(name)) {
			po_schd_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		if ($po_schd_upd_cntr.equalsIgnoreCase(name)) {
			po_schd_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		if ($po_schd_upd_cntr.equalsIgnoreCase(name)) {
			po_schd_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		if ($po_schd_upd_cntr.equalsIgnoreCase(name)) {
			po_schd_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		if ($po_schd_upd_cntr.equalsIgnoreCase(name)) {
			po_schd_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		if ($po_schd_upd_cntr.equalsIgnoreCase(name)) {
			po_schd_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($po_schd_no.equalsIgnoreCase(name)) {
			po_schd_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		if ($po_schd_upd_cntr.equalsIgnoreCase(name)) {
			po_schd_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		if ($po_schd_upd_cntr.equalsIgnoreCase(name)) {
			po_schd_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		if ($po_schd_upd_cntr.equalsIgnoreCase(name)) {
			po_schd_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		if ($po_schd_upd_cntr.equalsIgnoreCase(name)) {
			po_schd_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		if ($po_schd_upd_cntr.equalsIgnoreCase(name)) {
			po_schd_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

