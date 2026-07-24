package mcframe.serverMSBC.MSBCL6070;

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
 * ブロック"MfgReCalc_Sprt02_DtlYield"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MfgReCalc_Sprt02_DtlYieldR_MC_A extends MCConstRow {

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public static final String $hdr_peg_no = "hdr_peg_no";
	public static final String $oper_peg_no = "oper_peg_no";
	/**
	 * Output schedule No. 出来高予定ＮＯ.<p>
	 *
	 */
	public static final String $yield_schd_no = "yield_schd_no";
	/**
	 * Base unit output start qty. 基準単位出来高着手数量.<p>
	 *
	 */
	public static final String $base_unit_yield_st_qty = "base_unit_yield_st_qty";
	/**
	 * Base unit output result qty. 基準単位出来高実績数量.<p>
	 *
	 */
	public static final String $base_unit_yield_act_qty = "base_unit_yield_act_qty";


	public static final MCMeta hdr_peg_no_META = createCommonMeta($hdr_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta oper_peg_no_META = createCommonMeta($oper_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta yield_schd_no_META = createCommonMeta($yield_schd_no, mcframe.commonMA.meta.MA_META.YIELD_SCHD_NO);
	public static final MCMeta base_unit_yield_st_qty_META = createCommonMeta($base_unit_yield_st_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_yield_act_qty_META = createCommonMeta($base_unit_yield_act_qty, mcframe.commonMA.meta.MA_META.QTY);

	protected static final ConstMetaList<MfgReCalc_Sprt02_DtlYieldR> constMetas = new ConstMetaList<MfgReCalc_Sprt02_DtlYieldR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			hdr_peg_no_META,
			oper_peg_no_META,
			yield_schd_no_META,
			base_unit_yield_st_qty_META,
			base_unit_yield_act_qty_META
		},
		new String[][]{
			{
			},
			{
			}
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
	protected MfgReCalc_Sprt02_DtlYieldR_MC_A(ConstMetaList<? extends MfgReCalc_Sprt02_DtlYieldR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgReCalc_Sprt02_DtlYieldR clone() {
		return (MfgReCalc_Sprt02_DtlYieldR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgReCalc_Sprt02_DtlYieldR createInstance() {
		return (MfgReCalc_Sprt02_DtlYieldR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgReCalc_Sprt02_DtlYieldR getValues(String... names) {
		return (MfgReCalc_Sprt02_DtlYieldR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public MCNumber hdr_peg_no() {
		return getConstNumber(offset + 0, $hdr_peg_no);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(MCNumber value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(int value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(long value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(float value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(double value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}


	public MCNumber oper_peg_no() {
		return getConstNumber(offset + 1, $oper_peg_no);
	}

	public void oper_peg_no(MCNumber value) {
		setConstNumber(offset + 1, $oper_peg_no, value);
	}

	public void oper_peg_no(int value) {
		setConstNumber(offset + 1, $oper_peg_no, value);
	}

	public void oper_peg_no(long value) {
		setConstNumber(offset + 1, $oper_peg_no, value);
	}

	public void oper_peg_no(float value) {
		setConstNumber(offset + 1, $oper_peg_no, value);
	}

	public void oper_peg_no(double value) {
		setConstNumber(offset + 1, $oper_peg_no, value);
	}


	/**
	 * Output schedule No. 出来高予定ＮＯ.<p>
	 *
	 */
	public String yield_schd_no() {
		return getConstString(offset + 2, $yield_schd_no);
	}

	/**
	 * Output schedule No. 出来高予定ＮＯ.<p>
	 *
	 */
	public void yield_schd_no(String value) {
		setConstString(offset + 2, $yield_schd_no, value);
	}


	/**
	 * Base unit output start qty. 基準単位出来高着手数量.<p>
	 *
	 */
	public MCNumber base_unit_yield_st_qty() {
		return getConstNumber(offset + 3, $base_unit_yield_st_qty);
	}

	/**
	 * Base unit output start qty. 基準単位出来高着手数量.<p>
	 *
	 */
	public void base_unit_yield_st_qty(MCNumber value) {
		setConstNumber(offset + 3, $base_unit_yield_st_qty, value);
	}

	/**
	 * Base unit output start qty. 基準単位出来高着手数量.<p>
	 *
	 */
	public void base_unit_yield_st_qty(int value) {
		setConstNumber(offset + 3, $base_unit_yield_st_qty, value);
	}

	/**
	 * Base unit output start qty. 基準単位出来高着手数量.<p>
	 *
	 */
	public void base_unit_yield_st_qty(long value) {
		setConstNumber(offset + 3, $base_unit_yield_st_qty, value);
	}

	/**
	 * Base unit output start qty. 基準単位出来高着手数量.<p>
	 *
	 */
	public void base_unit_yield_st_qty(float value) {
		setConstNumber(offset + 3, $base_unit_yield_st_qty, value);
	}

	/**
	 * Base unit output start qty. 基準単位出来高着手数量.<p>
	 *
	 */
	public void base_unit_yield_st_qty(double value) {
		setConstNumber(offset + 3, $base_unit_yield_st_qty, value);
	}


	/**
	 * Base unit output result qty. 基準単位出来高実績数量.<p>
	 *
	 */
	public MCNumber base_unit_yield_act_qty() {
		return getConstNumber(offset + 4, $base_unit_yield_act_qty);
	}

	/**
	 * Base unit output result qty. 基準単位出来高実績数量.<p>
	 *
	 */
	public void base_unit_yield_act_qty(MCNumber value) {
		setConstNumber(offset + 4, $base_unit_yield_act_qty, value);
	}

	/**
	 * Base unit output result qty. 基準単位出来高実績数量.<p>
	 *
	 */
	public void base_unit_yield_act_qty(int value) {
		setConstNumber(offset + 4, $base_unit_yield_act_qty, value);
	}

	/**
	 * Base unit output result qty. 基準単位出来高実績数量.<p>
	 *
	 */
	public void base_unit_yield_act_qty(long value) {
		setConstNumber(offset + 4, $base_unit_yield_act_qty, value);
	}

	/**
	 * Base unit output result qty. 基準単位出来高実績数量.<p>
	 *
	 */
	public void base_unit_yield_act_qty(float value) {
		setConstNumber(offset + 4, $base_unit_yield_act_qty, value);
	}

	/**
	 * Base unit output result qty. 基準単位出来高実績数量.<p>
	 *
	 */
	public void base_unit_yield_act_qty(double value) {
		setConstNumber(offset + 4, $base_unit_yield_act_qty, value);
	}


	public String getString(String name) {
		if ($yield_schd_no.equalsIgnoreCase(name)) {
			return yield_schd_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			return oper_peg_no();
		}
		if ($base_unit_yield_st_qty.equalsIgnoreCase(name)) {
			return base_unit_yield_st_qty();
		}
		if ($base_unit_yield_act_qty.equalsIgnoreCase(name)) {
			return base_unit_yield_act_qty();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($yield_schd_no.equalsIgnoreCase(name)) {
			return yield_schd_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			return oper_peg_no();
		}
		if ($base_unit_yield_st_qty.equalsIgnoreCase(name)) {
			return base_unit_yield_st_qty();
		}
		if ($base_unit_yield_act_qty.equalsIgnoreCase(name)) {
			return base_unit_yield_act_qty();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($yield_schd_no.equalsIgnoreCase(name)) {
			yield_schd_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($base_unit_yield_st_qty.equalsIgnoreCase(name)) {
			base_unit_yield_st_qty(value);
			return;
		}
		if ($base_unit_yield_act_qty.equalsIgnoreCase(name)) {
			base_unit_yield_act_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($base_unit_yield_st_qty.equalsIgnoreCase(name)) {
			base_unit_yield_st_qty(value);
			return;
		}
		if ($base_unit_yield_act_qty.equalsIgnoreCase(name)) {
			base_unit_yield_act_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($base_unit_yield_st_qty.equalsIgnoreCase(name)) {
			base_unit_yield_st_qty(value);
			return;
		}
		if ($base_unit_yield_act_qty.equalsIgnoreCase(name)) {
			base_unit_yield_act_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($base_unit_yield_st_qty.equalsIgnoreCase(name)) {
			base_unit_yield_st_qty(value);
			return;
		}
		if ($base_unit_yield_act_qty.equalsIgnoreCase(name)) {
			base_unit_yield_act_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($base_unit_yield_st_qty.equalsIgnoreCase(name)) {
			base_unit_yield_st_qty(value);
			return;
		}
		if ($base_unit_yield_act_qty.equalsIgnoreCase(name)) {
			base_unit_yield_act_qty(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($yield_schd_no.equalsIgnoreCase(name)) {
			yield_schd_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($base_unit_yield_st_qty.equalsIgnoreCase(name)) {
			base_unit_yield_st_qty(value);
			return;
		}
		if ($base_unit_yield_act_qty.equalsIgnoreCase(name)) {
			base_unit_yield_act_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($base_unit_yield_st_qty.equalsIgnoreCase(name)) {
			base_unit_yield_st_qty(value);
			return;
		}
		if ($base_unit_yield_act_qty.equalsIgnoreCase(name)) {
			base_unit_yield_act_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($base_unit_yield_st_qty.equalsIgnoreCase(name)) {
			base_unit_yield_st_qty(value);
			return;
		}
		if ($base_unit_yield_act_qty.equalsIgnoreCase(name)) {
			base_unit_yield_act_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($base_unit_yield_st_qty.equalsIgnoreCase(name)) {
			base_unit_yield_st_qty(value);
			return;
		}
		if ($base_unit_yield_act_qty.equalsIgnoreCase(name)) {
			base_unit_yield_act_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($base_unit_yield_st_qty.equalsIgnoreCase(name)) {
			base_unit_yield_st_qty(value);
			return;
		}
		if ($base_unit_yield_act_qty.equalsIgnoreCase(name)) {
			base_unit_yield_act_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

