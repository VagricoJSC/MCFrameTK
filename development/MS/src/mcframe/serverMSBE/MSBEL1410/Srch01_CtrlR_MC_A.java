package mcframe.serverMSBE.MSBEL1410;

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
 * ブロック"Srch01_Ctrl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_CtrlR_MC_A extends MCConstRow {

	/**
	 * List No. リストＮＯ.<p>
	 *
	 */
	public static final String $list_no = "list_no";
	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public static final String $ship_schd_no = "ship_schd_no";
	/**
	 * Shipping schedule update counter 出荷予定更新カウンタ.<p>
	 *
	 */
	public static final String $ship_schd_upd_cntr = "ship_schd_upd_cntr";
	/**
	 * Shipping progress No. 出荷進捗ＮＯ.<p>
	 *
	 */
	public static final String $ship_pr_no = "ship_pr_no";
	/**
	 * Shipping progress counter 出荷進捗カウンタ.<p>
	 *
	 */
	public static final String $ship_pr_upd_cntr = "ship_pr_upd_cntr";


	public static final MCMeta list_no_META = createCommonMeta($list_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta ship_schd_no_META = createCommonMeta($ship_schd_no, mcframe.commonMA.meta.MA_META.SHIP_SCHD_NO);
	public static final MCMeta ship_schd_upd_cntr_META = createCommonMeta($ship_schd_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta ship_pr_no_META = createCommonMeta($ship_pr_no, mcframe.commonMA.meta.MA_META.SHIP_PR_NO);
	public static final MCMeta ship_pr_upd_cntr_META = createCommonMeta($ship_pr_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);

	protected static final ConstMetaList<Srch01_CtrlR> constMetas = new ConstMetaList<Srch01_CtrlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			list_no_META,
			ship_schd_no_META,
			ship_schd_upd_cntr_META,
			ship_pr_no_META,
			ship_pr_upd_cntr_META
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
	protected Srch01_CtrlR_MC_A(ConstMetaList<? extends Srch01_CtrlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CtrlR clone() {
		return (Srch01_CtrlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CtrlR createInstance() {
		return (Srch01_CtrlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CtrlR getValues(String... names) {
		return (Srch01_CtrlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * List No. リストＮＯ.<p>
	 *
	 */
	public MCNumber list_no() {
		return getConstNumber(offset + 0, $list_no);
	}

	/**
	 * List No. リストＮＯ.<p>
	 *
	 */
	public void list_no(MCNumber value) {
		setConstNumber(offset + 0, $list_no, value);
	}

	/**
	 * List No. リストＮＯ.<p>
	 *
	 */
	public void list_no(int value) {
		setConstNumber(offset + 0, $list_no, value);
	}

	/**
	 * List No. リストＮＯ.<p>
	 *
	 */
	public void list_no(long value) {
		setConstNumber(offset + 0, $list_no, value);
	}

	/**
	 * List No. リストＮＯ.<p>
	 *
	 */
	public void list_no(float value) {
		setConstNumber(offset + 0, $list_no, value);
	}

	/**
	 * List No. リストＮＯ.<p>
	 *
	 */
	public void list_no(double value) {
		setConstNumber(offset + 0, $list_no, value);
	}


	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public String ship_schd_no() {
		return getConstString(offset + 1, $ship_schd_no);
	}

	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public void ship_schd_no(String value) {
		setConstString(offset + 1, $ship_schd_no, value);
	}


	/**
	 * Shipping schedule update counter 出荷予定更新カウンタ.<p>
	 *
	 */
	public MCNumber ship_schd_upd_cntr() {
		return getConstNumber(offset + 2, $ship_schd_upd_cntr);
	}

	/**
	 * Shipping schedule update counter 出荷予定更新カウンタ.<p>
	 *
	 */
	public void ship_schd_upd_cntr(MCNumber value) {
		setConstNumber(offset + 2, $ship_schd_upd_cntr, value);
	}

	/**
	 * Shipping schedule update counter 出荷予定更新カウンタ.<p>
	 *
	 */
	public void ship_schd_upd_cntr(int value) {
		setConstNumber(offset + 2, $ship_schd_upd_cntr, value);
	}

	/**
	 * Shipping schedule update counter 出荷予定更新カウンタ.<p>
	 *
	 */
	public void ship_schd_upd_cntr(long value) {
		setConstNumber(offset + 2, $ship_schd_upd_cntr, value);
	}

	/**
	 * Shipping schedule update counter 出荷予定更新カウンタ.<p>
	 *
	 */
	public void ship_schd_upd_cntr(float value) {
		setConstNumber(offset + 2, $ship_schd_upd_cntr, value);
	}

	/**
	 * Shipping schedule update counter 出荷予定更新カウンタ.<p>
	 *
	 */
	public void ship_schd_upd_cntr(double value) {
		setConstNumber(offset + 2, $ship_schd_upd_cntr, value);
	}


	/**
	 * Shipping progress No. 出荷進捗ＮＯ.<p>
	 *
	 */
	public String ship_pr_no() {
		return getConstString(offset + 3, $ship_pr_no);
	}

	/**
	 * Shipping progress No. 出荷進捗ＮＯ.<p>
	 *
	 */
	public void ship_pr_no(String value) {
		setConstString(offset + 3, $ship_pr_no, value);
	}


	/**
	 * Shipping progress counter 出荷進捗カウンタ.<p>
	 *
	 */
	public MCNumber ship_pr_upd_cntr() {
		return getConstNumber(offset + 4, $ship_pr_upd_cntr);
	}

	/**
	 * Shipping progress counter 出荷進捗カウンタ.<p>
	 *
	 */
	public void ship_pr_upd_cntr(MCNumber value) {
		setConstNumber(offset + 4, $ship_pr_upd_cntr, value);
	}

	/**
	 * Shipping progress counter 出荷進捗カウンタ.<p>
	 *
	 */
	public void ship_pr_upd_cntr(int value) {
		setConstNumber(offset + 4, $ship_pr_upd_cntr, value);
	}

	/**
	 * Shipping progress counter 出荷進捗カウンタ.<p>
	 *
	 */
	public void ship_pr_upd_cntr(long value) {
		setConstNumber(offset + 4, $ship_pr_upd_cntr, value);
	}

	/**
	 * Shipping progress counter 出荷進捗カウンタ.<p>
	 *
	 */
	public void ship_pr_upd_cntr(float value) {
		setConstNumber(offset + 4, $ship_pr_upd_cntr, value);
	}

	/**
	 * Shipping progress counter 出荷進捗カウンタ.<p>
	 *
	 */
	public void ship_pr_upd_cntr(double value) {
		setConstNumber(offset + 4, $ship_pr_upd_cntr, value);
	}


	public String getString(String name) {
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			return ship_schd_no();
		}
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			return ship_pr_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($list_no.equalsIgnoreCase(name)) {
			return list_no();
		}
		if ($ship_schd_upd_cntr.equalsIgnoreCase(name)) {
			return ship_schd_upd_cntr();
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			return ship_pr_upd_cntr();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			return ship_schd_no();
		}
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			return ship_pr_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($list_no.equalsIgnoreCase(name)) {
			return list_no();
		}
		if ($ship_schd_upd_cntr.equalsIgnoreCase(name)) {
			return ship_schd_upd_cntr();
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			return ship_pr_upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			ship_schd_no(value);
			return;
		}
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			ship_pr_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($list_no.equalsIgnoreCase(name)) {
			list_no(value);
			return;
		}
		if ($ship_schd_upd_cntr.equalsIgnoreCase(name)) {
			ship_schd_upd_cntr(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($list_no.equalsIgnoreCase(name)) {
			list_no(value);
			return;
		}
		if ($ship_schd_upd_cntr.equalsIgnoreCase(name)) {
			ship_schd_upd_cntr(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($list_no.equalsIgnoreCase(name)) {
			list_no(value);
			return;
		}
		if ($ship_schd_upd_cntr.equalsIgnoreCase(name)) {
			ship_schd_upd_cntr(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($list_no.equalsIgnoreCase(name)) {
			list_no(value);
			return;
		}
		if ($ship_schd_upd_cntr.equalsIgnoreCase(name)) {
			ship_schd_upd_cntr(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($list_no.equalsIgnoreCase(name)) {
			list_no(value);
			return;
		}
		if ($ship_schd_upd_cntr.equalsIgnoreCase(name)) {
			ship_schd_upd_cntr(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			ship_schd_no(value);
			return;
		}
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			ship_pr_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($list_no.equalsIgnoreCase(name)) {
			list_no(value);
			return;
		}
		if ($ship_schd_upd_cntr.equalsIgnoreCase(name)) {
			ship_schd_upd_cntr(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($list_no.equalsIgnoreCase(name)) {
			list_no(value);
			return;
		}
		if ($ship_schd_upd_cntr.equalsIgnoreCase(name)) {
			ship_schd_upd_cntr(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($list_no.equalsIgnoreCase(name)) {
			list_no(value);
			return;
		}
		if ($ship_schd_upd_cntr.equalsIgnoreCase(name)) {
			ship_schd_upd_cntr(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($list_no.equalsIgnoreCase(name)) {
			list_no(value);
			return;
		}
		if ($ship_schd_upd_cntr.equalsIgnoreCase(name)) {
			ship_schd_upd_cntr(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($list_no.equalsIgnoreCase(name)) {
			list_no(value);
			return;
		}
		if ($ship_schd_upd_cntr.equalsIgnoreCase(name)) {
			ship_schd_upd_cntr(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

