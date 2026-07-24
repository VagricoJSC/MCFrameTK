package mcframe.clientMSBG.MSBGP0210;

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
 * ブロック"BillD"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class BillDR_MC_A extends MCConstRow {

	/**
	 * Group sequence No. グループシーケンスＮＯ.<p>
	 *
	 */
	public static final String $grp_seq = "grp_seq";
	/**
	 * Billing details No. 請求明細ＮＯ.<p>
	 *
	 */
	public static final String $bill_d_no = "bill_d_no";
	/**
	 * Parent billing details No. 親請求明細ＮＯ.<p>
	 *
	 */
	public static final String $parent_bill_d_no = "parent_bill_d_no";
	/**
	 * Billing management No. 請求管理ＮＯ.<p>
	 *
	 */
	public static final String $bill_mng_no = "bill_mng_no";
	public static final String $appl_tgt_amt = "appl_tgt_amt";
	public static final String $ttl_appl_amt = "ttl_appl_amt";
	/**
	 * Reconciled amount 消込額.<p>
	 *
	 */
	public static final String $appl_amt = "appl_amt";
	/**
	 * Original reconcile amount 元消込額.<p>
	 *
	 */
	public static final String $org_appl_amt = "org_appl_amt";
	/**
	 * Billing details update counter 請求明細更新カウンタ.<p>
	 *
	 */
	public static final String $bill_d_upd_cntr = "bill_d_upd_cntr";
	/**
	 * Billing details reconciled balance update counter 請求明細消込残高更新カウンタ.<p>
	 *
	 */
	public static final String $bill_d_appl_bal_upd_cntr = "bill_d_appl_bal_upd_cntr";


	public static final MCMeta grp_seq_META = createCommonMeta($grp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta bill_d_no_META = createCommonMeta($bill_d_no, mcframe.commonMA.meta.MA_META.BILL_D_NO);
	public static final MCMeta parent_bill_d_no_META = createCommonMeta($parent_bill_d_no, mcframe.commonMA.meta.MA_META.BILL_D_NO);
	public static final MCMeta bill_mng_no_META = createCommonMeta($bill_mng_no, mcframe.commonMA.meta.MA_META.BILL_MNG_NO);
	public static final MCMeta appl_tgt_amt_META = createCommonMeta($appl_tgt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ttl_appl_amt_META = createCommonMeta($ttl_appl_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta appl_amt_META = createCommonMeta($appl_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta org_appl_amt_META = createCommonMeta($org_appl_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta bill_d_upd_cntr_META = createCommonMeta($bill_d_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta bill_d_appl_bal_upd_cntr_META = createCommonMeta($bill_d_appl_bal_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);

	protected static final ConstMetaList<BillDR> constMetas = new ConstMetaList<BillDR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			grp_seq_META,
			bill_d_no_META,
			parent_bill_d_no_META,
			bill_mng_no_META,
			appl_tgt_amt_META,
			ttl_appl_amt_META,
			appl_amt_META,
			org_appl_amt_META,
			bill_d_upd_cntr_META,
			bill_d_appl_bal_upd_cntr_META
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
	protected BillDR_MC_A(ConstMetaList<? extends BillDR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BillDR clone() {
		return (BillDR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BillDR createInstance() {
		return (BillDR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BillDR getValues(String... names) {
		return (BillDR) super.getValues(names);
	}



	/**
	 * Group sequence No. グループシーケンスＮＯ.<p>
	 *
	 */
	public MCNumber grp_seq() {
		return getConstNumber(offset + 0, $grp_seq);
	}

	/**
	 * Group sequence No. グループシーケンスＮＯ.<p>
	 *
	 */
	public void grp_seq(MCNumber value) {
		setConstNumber(offset + 0, $grp_seq, value);
	}

	/**
	 * Group sequence No. グループシーケンスＮＯ.<p>
	 *
	 */
	public void grp_seq(int value) {
		setConstNumber(offset + 0, $grp_seq, value);
	}

	/**
	 * Group sequence No. グループシーケンスＮＯ.<p>
	 *
	 */
	public void grp_seq(long value) {
		setConstNumber(offset + 0, $grp_seq, value);
	}

	/**
	 * Group sequence No. グループシーケンスＮＯ.<p>
	 *
	 */
	public void grp_seq(float value) {
		setConstNumber(offset + 0, $grp_seq, value);
	}

	/**
	 * Group sequence No. グループシーケンスＮＯ.<p>
	 *
	 */
	public void grp_seq(double value) {
		setConstNumber(offset + 0, $grp_seq, value);
	}


	/**
	 * Billing details No. 請求明細ＮＯ.<p>
	 *
	 */
	public String bill_d_no() {
		return getConstString(offset + 1, $bill_d_no);
	}

	/**
	 * Billing details No. 請求明細ＮＯ.<p>
	 *
	 */
	public void bill_d_no(String value) {
		setConstString(offset + 1, $bill_d_no, value);
	}


	/**
	 * Parent billing details No. 親請求明細ＮＯ.<p>
	 *
	 */
	public String parent_bill_d_no() {
		return getConstString(offset + 2, $parent_bill_d_no);
	}

	/**
	 * Parent billing details No. 親請求明細ＮＯ.<p>
	 *
	 */
	public void parent_bill_d_no(String value) {
		setConstString(offset + 2, $parent_bill_d_no, value);
	}


	/**
	 * Billing management No. 請求管理ＮＯ.<p>
	 *
	 */
	public String bill_mng_no() {
		return getConstString(offset + 3, $bill_mng_no);
	}

	/**
	 * Billing management No. 請求管理ＮＯ.<p>
	 *
	 */
	public void bill_mng_no(String value) {
		setConstString(offset + 3, $bill_mng_no, value);
	}


	public MCNumber appl_tgt_amt() {
		return getConstNumber(offset + 4, $appl_tgt_amt);
	}

	public void appl_tgt_amt(MCNumber value) {
		setConstNumber(offset + 4, $appl_tgt_amt, value);
	}

	public void appl_tgt_amt(int value) {
		setConstNumber(offset + 4, $appl_tgt_amt, value);
	}

	public void appl_tgt_amt(long value) {
		setConstNumber(offset + 4, $appl_tgt_amt, value);
	}

	public void appl_tgt_amt(float value) {
		setConstNumber(offset + 4, $appl_tgt_amt, value);
	}

	public void appl_tgt_amt(double value) {
		setConstNumber(offset + 4, $appl_tgt_amt, value);
	}


	public MCNumber ttl_appl_amt() {
		return getConstNumber(offset + 5, $ttl_appl_amt);
	}

	public void ttl_appl_amt(MCNumber value) {
		setConstNumber(offset + 5, $ttl_appl_amt, value);
	}

	public void ttl_appl_amt(int value) {
		setConstNumber(offset + 5, $ttl_appl_amt, value);
	}

	public void ttl_appl_amt(long value) {
		setConstNumber(offset + 5, $ttl_appl_amt, value);
	}

	public void ttl_appl_amt(float value) {
		setConstNumber(offset + 5, $ttl_appl_amt, value);
	}

	public void ttl_appl_amt(double value) {
		setConstNumber(offset + 5, $ttl_appl_amt, value);
	}


	/**
	 * Reconciled amount 消込額.<p>
	 *
	 */
	public MCNumber appl_amt() {
		return getConstNumber(offset + 6, $appl_amt);
	}

	/**
	 * Reconciled amount 消込額.<p>
	 *
	 */
	public void appl_amt(MCNumber value) {
		setConstNumber(offset + 6, $appl_amt, value);
	}

	/**
	 * Reconciled amount 消込額.<p>
	 *
	 */
	public void appl_amt(int value) {
		setConstNumber(offset + 6, $appl_amt, value);
	}

	/**
	 * Reconciled amount 消込額.<p>
	 *
	 */
	public void appl_amt(long value) {
		setConstNumber(offset + 6, $appl_amt, value);
	}

	/**
	 * Reconciled amount 消込額.<p>
	 *
	 */
	public void appl_amt(float value) {
		setConstNumber(offset + 6, $appl_amt, value);
	}

	/**
	 * Reconciled amount 消込額.<p>
	 *
	 */
	public void appl_amt(double value) {
		setConstNumber(offset + 6, $appl_amt, value);
	}


	/**
	 * Original reconcile amount 元消込額.<p>
	 *
	 */
	public MCNumber org_appl_amt() {
		return getConstNumber(offset + 7, $org_appl_amt);
	}

	/**
	 * Original reconcile amount 元消込額.<p>
	 *
	 */
	public void org_appl_amt(MCNumber value) {
		setConstNumber(offset + 7, $org_appl_amt, value);
	}

	/**
	 * Original reconcile amount 元消込額.<p>
	 *
	 */
	public void org_appl_amt(int value) {
		setConstNumber(offset + 7, $org_appl_amt, value);
	}

	/**
	 * Original reconcile amount 元消込額.<p>
	 *
	 */
	public void org_appl_amt(long value) {
		setConstNumber(offset + 7, $org_appl_amt, value);
	}

	/**
	 * Original reconcile amount 元消込額.<p>
	 *
	 */
	public void org_appl_amt(float value) {
		setConstNumber(offset + 7, $org_appl_amt, value);
	}

	/**
	 * Original reconcile amount 元消込額.<p>
	 *
	 */
	public void org_appl_amt(double value) {
		setConstNumber(offset + 7, $org_appl_amt, value);
	}


	/**
	 * Billing details update counter 請求明細更新カウンタ.<p>
	 *
	 */
	public MCNumber bill_d_upd_cntr() {
		return getConstNumber(offset + 8, $bill_d_upd_cntr);
	}

	/**
	 * Billing details update counter 請求明細更新カウンタ.<p>
	 *
	 */
	public void bill_d_upd_cntr(MCNumber value) {
		setConstNumber(offset + 8, $bill_d_upd_cntr, value);
	}

	/**
	 * Billing details update counter 請求明細更新カウンタ.<p>
	 *
	 */
	public void bill_d_upd_cntr(int value) {
		setConstNumber(offset + 8, $bill_d_upd_cntr, value);
	}

	/**
	 * Billing details update counter 請求明細更新カウンタ.<p>
	 *
	 */
	public void bill_d_upd_cntr(long value) {
		setConstNumber(offset + 8, $bill_d_upd_cntr, value);
	}

	/**
	 * Billing details update counter 請求明細更新カウンタ.<p>
	 *
	 */
	public void bill_d_upd_cntr(float value) {
		setConstNumber(offset + 8, $bill_d_upd_cntr, value);
	}

	/**
	 * Billing details update counter 請求明細更新カウンタ.<p>
	 *
	 */
	public void bill_d_upd_cntr(double value) {
		setConstNumber(offset + 8, $bill_d_upd_cntr, value);
	}


	/**
	 * Billing details reconciled balance update counter 請求明細消込残高更新カウンタ.<p>
	 *
	 */
	public MCNumber bill_d_appl_bal_upd_cntr() {
		return getConstNumber(offset + 9, $bill_d_appl_bal_upd_cntr);
	}

	/**
	 * Billing details reconciled balance update counter 請求明細消込残高更新カウンタ.<p>
	 *
	 */
	public void bill_d_appl_bal_upd_cntr(MCNumber value) {
		setConstNumber(offset + 9, $bill_d_appl_bal_upd_cntr, value);
	}

	/**
	 * Billing details reconciled balance update counter 請求明細消込残高更新カウンタ.<p>
	 *
	 */
	public void bill_d_appl_bal_upd_cntr(int value) {
		setConstNumber(offset + 9, $bill_d_appl_bal_upd_cntr, value);
	}

	/**
	 * Billing details reconciled balance update counter 請求明細消込残高更新カウンタ.<p>
	 *
	 */
	public void bill_d_appl_bal_upd_cntr(long value) {
		setConstNumber(offset + 9, $bill_d_appl_bal_upd_cntr, value);
	}

	/**
	 * Billing details reconciled balance update counter 請求明細消込残高更新カウンタ.<p>
	 *
	 */
	public void bill_d_appl_bal_upd_cntr(float value) {
		setConstNumber(offset + 9, $bill_d_appl_bal_upd_cntr, value);
	}

	/**
	 * Billing details reconciled balance update counter 請求明細消込残高更新カウンタ.<p>
	 *
	 */
	public void bill_d_appl_bal_upd_cntr(double value) {
		setConstNumber(offset + 9, $bill_d_appl_bal_upd_cntr, value);
	}


	public String getString(String name) {
		if ($bill_d_no.equalsIgnoreCase(name)) {
			return bill_d_no();
		}
		if ($parent_bill_d_no.equalsIgnoreCase(name)) {
			return parent_bill_d_no();
		}
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			return bill_mng_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($grp_seq.equalsIgnoreCase(name)) {
			return grp_seq();
		}
		if ($appl_tgt_amt.equalsIgnoreCase(name)) {
			return appl_tgt_amt();
		}
		if ($ttl_appl_amt.equalsIgnoreCase(name)) {
			return ttl_appl_amt();
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			return appl_amt();
		}
		if ($org_appl_amt.equalsIgnoreCase(name)) {
			return org_appl_amt();
		}
		if ($bill_d_upd_cntr.equalsIgnoreCase(name)) {
			return bill_d_upd_cntr();
		}
		if ($bill_d_appl_bal_upd_cntr.equalsIgnoreCase(name)) {
			return bill_d_appl_bal_upd_cntr();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($bill_d_no.equalsIgnoreCase(name)) {
			return bill_d_no();
		}
		if ($parent_bill_d_no.equalsIgnoreCase(name)) {
			return parent_bill_d_no();
		}
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			return bill_mng_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($grp_seq.equalsIgnoreCase(name)) {
			return grp_seq();
		}
		if ($appl_tgt_amt.equalsIgnoreCase(name)) {
			return appl_tgt_amt();
		}
		if ($ttl_appl_amt.equalsIgnoreCase(name)) {
			return ttl_appl_amt();
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			return appl_amt();
		}
		if ($org_appl_amt.equalsIgnoreCase(name)) {
			return org_appl_amt();
		}
		if ($bill_d_upd_cntr.equalsIgnoreCase(name)) {
			return bill_d_upd_cntr();
		}
		if ($bill_d_appl_bal_upd_cntr.equalsIgnoreCase(name)) {
			return bill_d_appl_bal_upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($bill_d_no.equalsIgnoreCase(name)) {
			bill_d_no(value);
			return;
		}
		if ($parent_bill_d_no.equalsIgnoreCase(name)) {
			parent_bill_d_no(value);
			return;
		}
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			bill_mng_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($grp_seq.equalsIgnoreCase(name)) {
			grp_seq(value);
			return;
		}
		if ($appl_tgt_amt.equalsIgnoreCase(name)) {
			appl_tgt_amt(value);
			return;
		}
		if ($ttl_appl_amt.equalsIgnoreCase(name)) {
			ttl_appl_amt(value);
			return;
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			appl_amt(value);
			return;
		}
		if ($org_appl_amt.equalsIgnoreCase(name)) {
			org_appl_amt(value);
			return;
		}
		if ($bill_d_upd_cntr.equalsIgnoreCase(name)) {
			bill_d_upd_cntr(value);
			return;
		}
		if ($bill_d_appl_bal_upd_cntr.equalsIgnoreCase(name)) {
			bill_d_appl_bal_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($grp_seq.equalsIgnoreCase(name)) {
			grp_seq(value);
			return;
		}
		if ($appl_tgt_amt.equalsIgnoreCase(name)) {
			appl_tgt_amt(value);
			return;
		}
		if ($ttl_appl_amt.equalsIgnoreCase(name)) {
			ttl_appl_amt(value);
			return;
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			appl_amt(value);
			return;
		}
		if ($org_appl_amt.equalsIgnoreCase(name)) {
			org_appl_amt(value);
			return;
		}
		if ($bill_d_upd_cntr.equalsIgnoreCase(name)) {
			bill_d_upd_cntr(value);
			return;
		}
		if ($bill_d_appl_bal_upd_cntr.equalsIgnoreCase(name)) {
			bill_d_appl_bal_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($grp_seq.equalsIgnoreCase(name)) {
			grp_seq(value);
			return;
		}
		if ($appl_tgt_amt.equalsIgnoreCase(name)) {
			appl_tgt_amt(value);
			return;
		}
		if ($ttl_appl_amt.equalsIgnoreCase(name)) {
			ttl_appl_amt(value);
			return;
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			appl_amt(value);
			return;
		}
		if ($org_appl_amt.equalsIgnoreCase(name)) {
			org_appl_amt(value);
			return;
		}
		if ($bill_d_upd_cntr.equalsIgnoreCase(name)) {
			bill_d_upd_cntr(value);
			return;
		}
		if ($bill_d_appl_bal_upd_cntr.equalsIgnoreCase(name)) {
			bill_d_appl_bal_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($grp_seq.equalsIgnoreCase(name)) {
			grp_seq(value);
			return;
		}
		if ($appl_tgt_amt.equalsIgnoreCase(name)) {
			appl_tgt_amt(value);
			return;
		}
		if ($ttl_appl_amt.equalsIgnoreCase(name)) {
			ttl_appl_amt(value);
			return;
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			appl_amt(value);
			return;
		}
		if ($org_appl_amt.equalsIgnoreCase(name)) {
			org_appl_amt(value);
			return;
		}
		if ($bill_d_upd_cntr.equalsIgnoreCase(name)) {
			bill_d_upd_cntr(value);
			return;
		}
		if ($bill_d_appl_bal_upd_cntr.equalsIgnoreCase(name)) {
			bill_d_appl_bal_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($grp_seq.equalsIgnoreCase(name)) {
			grp_seq(value);
			return;
		}
		if ($appl_tgt_amt.equalsIgnoreCase(name)) {
			appl_tgt_amt(value);
			return;
		}
		if ($ttl_appl_amt.equalsIgnoreCase(name)) {
			ttl_appl_amt(value);
			return;
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			appl_amt(value);
			return;
		}
		if ($org_appl_amt.equalsIgnoreCase(name)) {
			org_appl_amt(value);
			return;
		}
		if ($bill_d_upd_cntr.equalsIgnoreCase(name)) {
			bill_d_upd_cntr(value);
			return;
		}
		if ($bill_d_appl_bal_upd_cntr.equalsIgnoreCase(name)) {
			bill_d_appl_bal_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($bill_d_no.equalsIgnoreCase(name)) {
			bill_d_no(value);
			return;
		}
		if ($parent_bill_d_no.equalsIgnoreCase(name)) {
			parent_bill_d_no(value);
			return;
		}
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			bill_mng_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($grp_seq.equalsIgnoreCase(name)) {
			grp_seq(value);
			return;
		}
		if ($appl_tgt_amt.equalsIgnoreCase(name)) {
			appl_tgt_amt(value);
			return;
		}
		if ($ttl_appl_amt.equalsIgnoreCase(name)) {
			ttl_appl_amt(value);
			return;
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			appl_amt(value);
			return;
		}
		if ($org_appl_amt.equalsIgnoreCase(name)) {
			org_appl_amt(value);
			return;
		}
		if ($bill_d_upd_cntr.equalsIgnoreCase(name)) {
			bill_d_upd_cntr(value);
			return;
		}
		if ($bill_d_appl_bal_upd_cntr.equalsIgnoreCase(name)) {
			bill_d_appl_bal_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($grp_seq.equalsIgnoreCase(name)) {
			grp_seq(value);
			return;
		}
		if ($appl_tgt_amt.equalsIgnoreCase(name)) {
			appl_tgt_amt(value);
			return;
		}
		if ($ttl_appl_amt.equalsIgnoreCase(name)) {
			ttl_appl_amt(value);
			return;
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			appl_amt(value);
			return;
		}
		if ($org_appl_amt.equalsIgnoreCase(name)) {
			org_appl_amt(value);
			return;
		}
		if ($bill_d_upd_cntr.equalsIgnoreCase(name)) {
			bill_d_upd_cntr(value);
			return;
		}
		if ($bill_d_appl_bal_upd_cntr.equalsIgnoreCase(name)) {
			bill_d_appl_bal_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($grp_seq.equalsIgnoreCase(name)) {
			grp_seq(value);
			return;
		}
		if ($appl_tgt_amt.equalsIgnoreCase(name)) {
			appl_tgt_amt(value);
			return;
		}
		if ($ttl_appl_amt.equalsIgnoreCase(name)) {
			ttl_appl_amt(value);
			return;
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			appl_amt(value);
			return;
		}
		if ($org_appl_amt.equalsIgnoreCase(name)) {
			org_appl_amt(value);
			return;
		}
		if ($bill_d_upd_cntr.equalsIgnoreCase(name)) {
			bill_d_upd_cntr(value);
			return;
		}
		if ($bill_d_appl_bal_upd_cntr.equalsIgnoreCase(name)) {
			bill_d_appl_bal_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($grp_seq.equalsIgnoreCase(name)) {
			grp_seq(value);
			return;
		}
		if ($appl_tgt_amt.equalsIgnoreCase(name)) {
			appl_tgt_amt(value);
			return;
		}
		if ($ttl_appl_amt.equalsIgnoreCase(name)) {
			ttl_appl_amt(value);
			return;
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			appl_amt(value);
			return;
		}
		if ($org_appl_amt.equalsIgnoreCase(name)) {
			org_appl_amt(value);
			return;
		}
		if ($bill_d_upd_cntr.equalsIgnoreCase(name)) {
			bill_d_upd_cntr(value);
			return;
		}
		if ($bill_d_appl_bal_upd_cntr.equalsIgnoreCase(name)) {
			bill_d_appl_bal_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($grp_seq.equalsIgnoreCase(name)) {
			grp_seq(value);
			return;
		}
		if ($appl_tgt_amt.equalsIgnoreCase(name)) {
			appl_tgt_amt(value);
			return;
		}
		if ($ttl_appl_amt.equalsIgnoreCase(name)) {
			ttl_appl_amt(value);
			return;
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			appl_amt(value);
			return;
		}
		if ($org_appl_amt.equalsIgnoreCase(name)) {
			org_appl_amt(value);
			return;
		}
		if ($bill_d_upd_cntr.equalsIgnoreCase(name)) {
			bill_d_upd_cntr(value);
			return;
		}
		if ($bill_d_appl_bal_upd_cntr.equalsIgnoreCase(name)) {
			bill_d_appl_bal_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

