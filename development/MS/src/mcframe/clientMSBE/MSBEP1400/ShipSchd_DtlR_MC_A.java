package mcframe.clientMSBE.MSBEP1400;

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
 * ブロック"ShipSchd_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ShipSchd_DtlR_MC_A extends MCConstRow {

	/**
	 * Temporary order details No. 仮指図明細ＮＯ.<p>
	 *
	 */
	public static final String $tmp_inst_d_no = "tmp_inst_d_no";
	/**
	 * Shipping order details No. 出荷指図明細ＮＯ.<p>
	 *
	 */
	public static final String $ship_inst_d_no = "ship_inst_d_no";
	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public static final String $ship_schd_no = "ship_schd_no";
	/**
	 * Shipping progress No. 出荷進捗ＮＯ.<p>
	 *
	 */
	public static final String $ship_pr_no = "ship_pr_no";
	/**
	 * Select 選択.<p>
	 *
	 */
	public static final String $check = "check";
	/**
	 * Shipping allocation status No. 出荷引当状況ＮＯ.<p>
	 *
	 */
	public static final String $ship_alloc_sts_no = "ship_alloc_sts_no";
	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public static final String $ship_pr_upd_cntr = "ship_pr_upd_cntr";
	/**
	 * Shipping schedule update counter 出荷予定更新カウンタ.<p>
	 *
	 */
	public static final String $ship_schd_upd_cntr = "ship_schd_upd_cntr";


	public static final MCMeta tmp_inst_d_no_META = createCommonMeta($tmp_inst_d_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta ship_inst_d_no_META = createCommonMeta($ship_inst_d_no, mcframe.commonMA.meta.MA_META.SHIP_INST_D_NO);
	public static final MCMeta ship_schd_no_META = createCommonMeta($ship_schd_no, mcframe.commonMA.meta.MA_META.SHIP_SCHD_NO);
	public static final MCMeta ship_pr_no_META = createCommonMeta($ship_pr_no, mcframe.commonMA.meta.MA_META.SHIP_PR_NO);
	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_alloc_sts_no_META = createCommonMeta($ship_alloc_sts_no, mcframe.commonMA.meta.MA_META.SHIP_ALLOC_STS_NO);
	public static final MCMeta ship_pr_upd_cntr_META = createCommonMeta($ship_pr_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta ship_schd_upd_cntr_META = createCommonMeta($ship_schd_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);

	protected static final ConstMetaList<ShipSchd_DtlR> constMetas = new ConstMetaList<ShipSchd_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			tmp_inst_d_no_META,
			ship_inst_d_no_META,
			ship_schd_no_META,
			ship_pr_no_META,
			check_META,
			ship_alloc_sts_no_META,
			ship_pr_upd_cntr_META,
			ship_schd_upd_cntr_META
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
	protected ShipSchd_DtlR_MC_A(ConstMetaList<? extends ShipSchd_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ShipSchd_DtlR clone() {
		return (ShipSchd_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ShipSchd_DtlR createInstance() {
		return (ShipSchd_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ShipSchd_DtlR getValues(String... names) {
		return (ShipSchd_DtlR) super.getValues(names);
	}



	/**
	 * Temporary order details No. 仮指図明細ＮＯ.<p>
	 *
	 */
	public MCNumber tmp_inst_d_no() {
		return getConstNumber(offset + 0, $tmp_inst_d_no);
	}

	/**
	 * Temporary order details No. 仮指図明細ＮＯ.<p>
	 *
	 */
	public void tmp_inst_d_no(MCNumber value) {
		setConstNumber(offset + 0, $tmp_inst_d_no, value);
	}

	/**
	 * Temporary order details No. 仮指図明細ＮＯ.<p>
	 *
	 */
	public void tmp_inst_d_no(int value) {
		setConstNumber(offset + 0, $tmp_inst_d_no, value);
	}

	/**
	 * Temporary order details No. 仮指図明細ＮＯ.<p>
	 *
	 */
	public void tmp_inst_d_no(long value) {
		setConstNumber(offset + 0, $tmp_inst_d_no, value);
	}

	/**
	 * Temporary order details No. 仮指図明細ＮＯ.<p>
	 *
	 */
	public void tmp_inst_d_no(float value) {
		setConstNumber(offset + 0, $tmp_inst_d_no, value);
	}

	/**
	 * Temporary order details No. 仮指図明細ＮＯ.<p>
	 *
	 */
	public void tmp_inst_d_no(double value) {
		setConstNumber(offset + 0, $tmp_inst_d_no, value);
	}


	/**
	 * Shipping order details No. 出荷指図明細ＮＯ.<p>
	 *
	 */
	public String ship_inst_d_no() {
		return getConstString(offset + 1, $ship_inst_d_no);
	}

	/**
	 * Shipping order details No. 出荷指図明細ＮＯ.<p>
	 *
	 */
	public void ship_inst_d_no(String value) {
		setConstString(offset + 1, $ship_inst_d_no, value);
	}


	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public String ship_schd_no() {
		return getConstString(offset + 2, $ship_schd_no);
	}

	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public void ship_schd_no(String value) {
		setConstString(offset + 2, $ship_schd_no, value);
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
	 * Select 選択.<p>
	 *
	 */
	public boolean check() {
		return getConstBoolean(offset + 4, $check);
	}

	/**
	 * Select 選択.<p>
	 *
	 */
	public void check(boolean value) {
		setConstBoolean(offset + 4, $check, value);
	}


	/**
	 * Shipping allocation status No. 出荷引当状況ＮＯ.<p>
	 *
	 */
	public String ship_alloc_sts_no() {
		return getConstString(offset + 5, $ship_alloc_sts_no);
	}

	/**
	 * Shipping allocation status No. 出荷引当状況ＮＯ.<p>
	 *
	 */
	public void ship_alloc_sts_no(String value) {
		setConstString(offset + 5, $ship_alloc_sts_no, value);
	}


	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public MCNumber ship_pr_upd_cntr() {
		return getConstNumber(offset + 6, $ship_pr_upd_cntr);
	}

	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public void ship_pr_upd_cntr(MCNumber value) {
		setConstNumber(offset + 6, $ship_pr_upd_cntr, value);
	}

	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public void ship_pr_upd_cntr(int value) {
		setConstNumber(offset + 6, $ship_pr_upd_cntr, value);
	}

	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public void ship_pr_upd_cntr(long value) {
		setConstNumber(offset + 6, $ship_pr_upd_cntr, value);
	}

	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public void ship_pr_upd_cntr(float value) {
		setConstNumber(offset + 6, $ship_pr_upd_cntr, value);
	}

	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public void ship_pr_upd_cntr(double value) {
		setConstNumber(offset + 6, $ship_pr_upd_cntr, value);
	}


	/**
	 * Shipping schedule update counter 出荷予定更新カウンタ.<p>
	 *
	 */
	public MCNumber ship_schd_upd_cntr() {
		return getConstNumber(offset + 7, $ship_schd_upd_cntr);
	}

	/**
	 * Shipping schedule update counter 出荷予定更新カウンタ.<p>
	 *
	 */
	public void ship_schd_upd_cntr(MCNumber value) {
		setConstNumber(offset + 7, $ship_schd_upd_cntr, value);
	}

	/**
	 * Shipping schedule update counter 出荷予定更新カウンタ.<p>
	 *
	 */
	public void ship_schd_upd_cntr(int value) {
		setConstNumber(offset + 7, $ship_schd_upd_cntr, value);
	}

	/**
	 * Shipping schedule update counter 出荷予定更新カウンタ.<p>
	 *
	 */
	public void ship_schd_upd_cntr(long value) {
		setConstNumber(offset + 7, $ship_schd_upd_cntr, value);
	}

	/**
	 * Shipping schedule update counter 出荷予定更新カウンタ.<p>
	 *
	 */
	public void ship_schd_upd_cntr(float value) {
		setConstNumber(offset + 7, $ship_schd_upd_cntr, value);
	}

	/**
	 * Shipping schedule update counter 出荷予定更新カウンタ.<p>
	 *
	 */
	public void ship_schd_upd_cntr(double value) {
		setConstNumber(offset + 7, $ship_schd_upd_cntr, value);
	}


	public String getString(String name) {
		if ($ship_inst_d_no.equalsIgnoreCase(name)) {
			return ship_inst_d_no();
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			return ship_schd_no();
		}
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			return ship_pr_no();
		}
		if ($ship_alloc_sts_no.equalsIgnoreCase(name)) {
			return ship_alloc_sts_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($tmp_inst_d_no.equalsIgnoreCase(name)) {
			return tmp_inst_d_no();
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			return ship_pr_upd_cntr();
		}
		if ($ship_schd_upd_cntr.equalsIgnoreCase(name)) {
			return ship_schd_upd_cntr();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ship_inst_d_no.equalsIgnoreCase(name)) {
			return ship_inst_d_no();
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			return ship_schd_no();
		}
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			return ship_pr_no();
		}
		if ($ship_alloc_sts_no.equalsIgnoreCase(name)) {
			return ship_alloc_sts_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($tmp_inst_d_no.equalsIgnoreCase(name)) {
			return tmp_inst_d_no();
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			return ship_pr_upd_cntr();
		}
		if ($ship_schd_upd_cntr.equalsIgnoreCase(name)) {
			return ship_schd_upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ship_inst_d_no.equalsIgnoreCase(name)) {
			ship_inst_d_no(value);
			return;
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			ship_schd_no(value);
			return;
		}
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			ship_pr_no(value);
			return;
		}
		if ($ship_alloc_sts_no.equalsIgnoreCase(name)) {
			ship_alloc_sts_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($tmp_inst_d_no.equalsIgnoreCase(name)) {
			tmp_inst_d_no(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($ship_schd_upd_cntr.equalsIgnoreCase(name)) {
			ship_schd_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($tmp_inst_d_no.equalsIgnoreCase(name)) {
			tmp_inst_d_no(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($ship_schd_upd_cntr.equalsIgnoreCase(name)) {
			ship_schd_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($tmp_inst_d_no.equalsIgnoreCase(name)) {
			tmp_inst_d_no(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($ship_schd_upd_cntr.equalsIgnoreCase(name)) {
			ship_schd_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($tmp_inst_d_no.equalsIgnoreCase(name)) {
			tmp_inst_d_no(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($ship_schd_upd_cntr.equalsIgnoreCase(name)) {
			ship_schd_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($tmp_inst_d_no.equalsIgnoreCase(name)) {
			tmp_inst_d_no(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($ship_schd_upd_cntr.equalsIgnoreCase(name)) {
			ship_schd_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ship_inst_d_no.equalsIgnoreCase(name)) {
			ship_inst_d_no(value);
			return;
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			ship_schd_no(value);
			return;
		}
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			ship_pr_no(value);
			return;
		}
		if ($ship_alloc_sts_no.equalsIgnoreCase(name)) {
			ship_alloc_sts_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($tmp_inst_d_no.equalsIgnoreCase(name)) {
			tmp_inst_d_no(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($ship_schd_upd_cntr.equalsIgnoreCase(name)) {
			ship_schd_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($tmp_inst_d_no.equalsIgnoreCase(name)) {
			tmp_inst_d_no(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($ship_schd_upd_cntr.equalsIgnoreCase(name)) {
			ship_schd_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($tmp_inst_d_no.equalsIgnoreCase(name)) {
			tmp_inst_d_no(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($ship_schd_upd_cntr.equalsIgnoreCase(name)) {
			ship_schd_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($tmp_inst_d_no.equalsIgnoreCase(name)) {
			tmp_inst_d_no(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($ship_schd_upd_cntr.equalsIgnoreCase(name)) {
			ship_schd_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($tmp_inst_d_no.equalsIgnoreCase(name)) {
			tmp_inst_d_no(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($ship_schd_upd_cntr.equalsIgnoreCase(name)) {
			ship_schd_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

