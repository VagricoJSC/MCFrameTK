package mcframe.clientMSBD.MSBDP0080;

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
 * ブロック"BulkSet"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class BulkSetR_MC_A extends MCConstRow {

	public static final String $dlv_rqst_tm_p = "dlv_rqst_tm_p";
	/**
	 * Request source desired available date 依頼元使用可能希望日.<p>
	 *
	 */
	public static final String $rqst_avl_rqst_dt = "rqst_avl_rqst_dt";
	/**
	 * Total amount 金額合計.<p>
	 *
	 */
	public static final String $amt = "amt";
	/**
	 * Total tax included amount 税込金額合計.<p>
	 *
	 */
	public static final String $inc_tax_amt = "inc_tax_amt";

	public static final String $dlv_rqst_dt = $dlv_rqst_tm_p + ".ymd";
	public static final String $dlv_rqst_hm = $dlv_rqst_tm_p + ".hm";

	public static final MCMeta dlv_rqst_tm_p_META = createInnerRowMeta($dlv_rqst_tm_p, mcframe.clientMAUB.MAUBP0110.YmdHmR.class);
	public static final MCMeta rqst_avl_rqst_dt_META = createCommonMeta($rqst_avl_rqst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta amt_META = createCommonMeta($amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta inc_tax_amt_META = createCommonMeta($inc_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);

	protected static final ConstMetaList<BulkSetR> constMetas = new ConstMetaList<BulkSetR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			dlv_rqst_tm_p_META,
			rqst_avl_rqst_dt_META,
			amt_META,
			inc_tax_amt_META
		},
		new String[][]{
			{
				"dlv_rqst_dt",
				"dlv_rqst_hm"
			},
			{
				$dlv_rqst_dt,
				$dlv_rqst_hm
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
				{$dlv_rqst_tm_p + ".hm", "TM"}	// dlv_rqst_tm_p.hm
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
	protected BulkSetR_MC_A(ConstMetaList<? extends BulkSetR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BulkSetR clone() {
		return (BulkSetR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BulkSetR createInstance() {
		return (BulkSetR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BulkSetR getValues(String... names) {
		return (BulkSetR) super.getValues(names);
	}



	public mcframe.clientMAUB.MAUBP0110.YmdHmR dlv_rqst_tm_p(){
		return (mcframe.clientMAUB.MAUBP0110.YmdHmR) getConstInnerRow(offset + 0, $dlv_rqst_tm_p);
	}
	
	public void dlv_rqst_tm_p(mcframe.clientMAUB.MAUBP0110.YmdHmR row){
		setConstInnerRow(offset + 0, $dlv_rqst_tm_p, row);
	}


	/**
	 * Request source desired available date 依頼元使用可能希望日.<p>
	 *
	 */
	public MCDate rqst_avl_rqst_dt() {
		return getConstDate(offset + 1, $rqst_avl_rqst_dt);
	}

	/**
	 * Request source desired available date 依頼元使用可能希望日.<p>
	 *
	 */
	public void rqst_avl_rqst_dt(MCDate value) {
		setConstDate(offset + 1, $rqst_avl_rqst_dt, value);
	}


	/**
	 * Total amount 金額合計.<p>
	 *
	 */
	public MCNumber amt() {
		return getConstNumber(offset + 2, $amt);
	}

	/**
	 * Total amount 金額合計.<p>
	 *
	 */
	public void amt(MCNumber value) {
		setConstNumber(offset + 2, $amt, value);
	}

	/**
	 * Total amount 金額合計.<p>
	 *
	 */
	public void amt(int value) {
		setConstNumber(offset + 2, $amt, value);
	}

	/**
	 * Total amount 金額合計.<p>
	 *
	 */
	public void amt(long value) {
		setConstNumber(offset + 2, $amt, value);
	}

	/**
	 * Total amount 金額合計.<p>
	 *
	 */
	public void amt(float value) {
		setConstNumber(offset + 2, $amt, value);
	}

	/**
	 * Total amount 金額合計.<p>
	 *
	 */
	public void amt(double value) {
		setConstNumber(offset + 2, $amt, value);
	}


	/**
	 * Total tax included amount 税込金額合計.<p>
	 *
	 */
	public MCNumber inc_tax_amt() {
		return getConstNumber(offset + 3, $inc_tax_amt);
	}

	/**
	 * Total tax included amount 税込金額合計.<p>
	 *
	 */
	public void inc_tax_amt(MCNumber value) {
		setConstNumber(offset + 3, $inc_tax_amt, value);
	}

	/**
	 * Total tax included amount 税込金額合計.<p>
	 *
	 */
	public void inc_tax_amt(int value) {
		setConstNumber(offset + 3, $inc_tax_amt, value);
	}

	/**
	 * Total tax included amount 税込金額合計.<p>
	 *
	 */
	public void inc_tax_amt(long value) {
		setConstNumber(offset + 3, $inc_tax_amt, value);
	}

	/**
	 * Total tax included amount 税込金額合計.<p>
	 *
	 */
	public void inc_tax_amt(float value) {
		setConstNumber(offset + 3, $inc_tax_amt, value);
	}

	/**
	 * Total tax included amount 税込金額合計.<p>
	 *
	 */
	public void inc_tax_amt(double value) {
		setConstNumber(offset + 3, $inc_tax_amt, value);
	}


	public MCNumber getNumber(String name) {
		if ($amt.equalsIgnoreCase(name)) {
			return amt();
		}
		if ($inc_tax_amt.equalsIgnoreCase(name)) {
			return inc_tax_amt();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($rqst_avl_rqst_dt.equalsIgnoreCase(name)) {
			return rqst_avl_rqst_dt();
		}
		return super.getDate(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($amt.equalsIgnoreCase(name)) {
			return amt();
		}
		if ($inc_tax_amt.equalsIgnoreCase(name)) {
			return inc_tax_amt();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($rqst_avl_rqst_dt.equalsIgnoreCase(name)) {
			return rqst_avl_rqst_dt();
		}
		return super.getDateNE(name);
	}

	public void setNumber(String name, MCNumber value) {
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($inc_tax_amt.equalsIgnoreCase(name)) {
			inc_tax_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($inc_tax_amt.equalsIgnoreCase(name)) {
			inc_tax_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($inc_tax_amt.equalsIgnoreCase(name)) {
			inc_tax_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($inc_tax_amt.equalsIgnoreCase(name)) {
			inc_tax_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($inc_tax_amt.equalsIgnoreCase(name)) {
			inc_tax_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($rqst_avl_rqst_dt.equalsIgnoreCase(name)) {
			rqst_avl_rqst_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($inc_tax_amt.equalsIgnoreCase(name)) {
			inc_tax_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($inc_tax_amt.equalsIgnoreCase(name)) {
			inc_tax_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($inc_tax_amt.equalsIgnoreCase(name)) {
			inc_tax_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($inc_tax_amt.equalsIgnoreCase(name)) {
			inc_tax_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($inc_tax_amt.equalsIgnoreCase(name)) {
			inc_tax_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($rqst_avl_rqst_dt.equalsIgnoreCase(name)) {
			rqst_avl_rqst_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($dlv_rqst_tm_p.equalsIgnoreCase(name)) {
			return dlv_rqst_tm_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($dlv_rqst_tm_p.equalsIgnoreCase(name)) {
			dlv_rqst_tm_p(
				((MCContainerMeta) dlv_rqst_tm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0110.YmdHmR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Desired delivery date 納入希望日.<p>
	 *
	 */
	public MCDate dlv_rqst_dt() {
		return dlv_rqst_tm_p().ymd();
	}

	/**
	 * Desired delivery date 納入希望日.<p>
	 *
	 */
	public void dlv_rqst_dt(MCDate value) {
		dlv_rqst_tm_p().ymd(value);
	}

	/**
	 * Desired delivery time 納入希望時刻.<p>
	 *
	 */
	public MCDate dlv_rqst_hm() {
		return dlv_rqst_tm_p().hm();
	}

	/**
	 * Desired delivery time 納入希望時刻.<p>
	 *
	 */
	public void dlv_rqst_hm(MCDate value) {
		dlv_rqst_tm_p().hm(value);
	}

}

