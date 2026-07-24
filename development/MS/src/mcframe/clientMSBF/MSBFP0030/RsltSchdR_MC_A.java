package mcframe.clientMSBF.MSBFP0030;

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
 * ブロック"RsltSchd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RsltSchdR_MC_A extends MCConstRow {

	/**
	 * Inspection schedule No. 検査予定ＮＯ.<p>
	 *
	 */
	public static final String $insp_schd_no = "insp_schd_no";
	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public static final String $insp_no = "insp_no";
	/**
	 * Inspection schedule update counter 検査予定更新カウンタ.<p>
	 *
	 */
	public static final String $schd_upd_cntr = "schd_upd_cntr";


	public static final MCMeta insp_schd_no_META = createCommonMeta($insp_schd_no, mcframe.commonMA.meta.MA_META.INSP_SCHD_NO);
	public static final MCMeta insp_no_META = createCommonMeta($insp_no, mcframe.commonMA.meta.MA_META.INSP_NO);
	public static final MCMeta schd_upd_cntr_META = createCommonMeta($schd_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);

	protected static final ConstMetaList<RsltSchdR> constMetas = new ConstMetaList<RsltSchdR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			insp_schd_no_META,
			insp_no_META,
			schd_upd_cntr_META
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
	protected RsltSchdR_MC_A(ConstMetaList<? extends RsltSchdR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltSchdR clone() {
		return (RsltSchdR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltSchdR createInstance() {
		return (RsltSchdR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltSchdR getValues(String... names) {
		return (RsltSchdR) super.getValues(names);
	}



	/**
	 * Inspection schedule No. 検査予定ＮＯ.<p>
	 *
	 */
	public String insp_schd_no() {
		return getConstString(offset + 0, $insp_schd_no);
	}

	/**
	 * Inspection schedule No. 検査予定ＮＯ.<p>
	 *
	 */
	public void insp_schd_no(String value) {
		setConstString(offset + 0, $insp_schd_no, value);
	}


	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public String insp_no() {
		return getConstString(offset + 1, $insp_no);
	}

	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public void insp_no(String value) {
		setConstString(offset + 1, $insp_no, value);
	}


	/**
	 * Inspection schedule update counter 検査予定更新カウンタ.<p>
	 *
	 */
	public MCNumber schd_upd_cntr() {
		return getConstNumber(offset + 2, $schd_upd_cntr);
	}

	/**
	 * Inspection schedule update counter 検査予定更新カウンタ.<p>
	 *
	 */
	public void schd_upd_cntr(MCNumber value) {
		setConstNumber(offset + 2, $schd_upd_cntr, value);
	}

	/**
	 * Inspection schedule update counter 検査予定更新カウンタ.<p>
	 *
	 */
	public void schd_upd_cntr(int value) {
		setConstNumber(offset + 2, $schd_upd_cntr, value);
	}

	/**
	 * Inspection schedule update counter 検査予定更新カウンタ.<p>
	 *
	 */
	public void schd_upd_cntr(long value) {
		setConstNumber(offset + 2, $schd_upd_cntr, value);
	}

	/**
	 * Inspection schedule update counter 検査予定更新カウンタ.<p>
	 *
	 */
	public void schd_upd_cntr(float value) {
		setConstNumber(offset + 2, $schd_upd_cntr, value);
	}

	/**
	 * Inspection schedule update counter 検査予定更新カウンタ.<p>
	 *
	 */
	public void schd_upd_cntr(double value) {
		setConstNumber(offset + 2, $schd_upd_cntr, value);
	}


	public String getString(String name) {
		if ($insp_schd_no.equalsIgnoreCase(name)) {
			return insp_schd_no();
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			return insp_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($schd_upd_cntr.equalsIgnoreCase(name)) {
			return schd_upd_cntr();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($insp_schd_no.equalsIgnoreCase(name)) {
			return insp_schd_no();
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			return insp_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($schd_upd_cntr.equalsIgnoreCase(name)) {
			return schd_upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($insp_schd_no.equalsIgnoreCase(name)) {
			insp_schd_no(value);
			return;
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			insp_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($schd_upd_cntr.equalsIgnoreCase(name)) {
			schd_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($schd_upd_cntr.equalsIgnoreCase(name)) {
			schd_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($schd_upd_cntr.equalsIgnoreCase(name)) {
			schd_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($schd_upd_cntr.equalsIgnoreCase(name)) {
			schd_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($schd_upd_cntr.equalsIgnoreCase(name)) {
			schd_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($insp_schd_no.equalsIgnoreCase(name)) {
			insp_schd_no(value);
			return;
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			insp_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($schd_upd_cntr.equalsIgnoreCase(name)) {
			schd_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($schd_upd_cntr.equalsIgnoreCase(name)) {
			schd_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($schd_upd_cntr.equalsIgnoreCase(name)) {
			schd_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($schd_upd_cntr.equalsIgnoreCase(name)) {
			schd_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($schd_upd_cntr.equalsIgnoreCase(name)) {
			schd_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

