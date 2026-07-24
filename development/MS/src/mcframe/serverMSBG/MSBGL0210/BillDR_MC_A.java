package mcframe.serverMSBG.MSBGL0210;

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
 * ブロック"BillD"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class BillDR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Header details pegged ヘッダ明細紐付.<p>
	 *
	 */
	public static final String $hdr_dtl_peg = "hdr_dtl_peg";
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
	 * Billing details update counter 請求明細更新カウンタ.<p>
	 *
	 */
	public static final String $bill_d_upd_cntr = "bill_d_upd_cntr";
	/**
	 * Billing details reconciled balance update counter 請求明細消込残高更新カウンタ.<p>
	 *
	 */
	public static final String $bill_d_appl_bal_upd_cntr = "bill_d_appl_bal_upd_cntr";


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta hdr_dtl_peg_META = createCommonMeta($hdr_dtl_peg, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta grp_seq_META = createCommonMeta($grp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta bill_d_no_META = createCommonMeta($bill_d_no, mcframe.commonMA.meta.MA_META.BILL_D_NO);
	public static final MCMeta parent_bill_d_no_META = createCommonMeta($parent_bill_d_no, mcframe.commonMA.meta.MA_META.BILL_D_NO);
	public static final MCMeta bill_mng_no_META = createCommonMeta($bill_mng_no, mcframe.commonMA.meta.MA_META.BILL_MNG_NO);
	public static final MCMeta appl_tgt_amt_META = createCommonMeta($appl_tgt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ttl_appl_amt_META = createCommonMeta($ttl_appl_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta appl_amt_META = createCommonMeta($appl_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta bill_d_upd_cntr_META = createCommonMeta($bill_d_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta bill_d_appl_bal_upd_cntr_META = createCommonMeta($bill_d_appl_bal_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);

	protected static final ConstMetaList<BillDR> constMetas = new ConstMetaList<BillDR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			err_flg_META,
			hdr_dtl_peg_META,
			grp_seq_META,
			bill_d_no_META,
			parent_bill_d_no_META,
			bill_mng_no_META,
			appl_tgt_amt_META,
			ttl_appl_amt_META,
			appl_amt_META,
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

	/** 項目属性情報のグループ[REQ_UPD_CNT_CHK]のキー定数 */
	public static final String $$REQ_UPD_CNT_CHK = "REQ_UPD_CNT_CHK";
	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";
	/** 項目属性情報のグループ[CHK_NUM]のキー定数 */
	public static final String $$CHK_NUM = "CHK_NUM";
	/** 項目属性情報のグループ[SMALL_LARGE]のキー定数 */
	public static final String $$SMALL_LARGE = "SMALL_LARGE";
	/** 項目属性情報のグループ[CHK_DT]のキー定数 */
	public static final String $$CHK_DT = "CHK_DT";
	/** 項目属性情報のグループ[BEFORE_AFTER]のキー定数 */
	public static final String $$BEFORE_AFTER = "BEFORE_AFTER";
	/** 項目属性情報のグループ[LIST_LOGIC]のキー定数 */
	public static final String $$LIST_LOGIC = "LIST_LOGIC";
	/** 項目属性情報のグループ[LIST_OUT]のキー定数 */
	public static final String $$LIST_OUT = "LIST_OUT";
	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQ_UPD_CNT_CHK, new MCExtList(
			new String[][]{
				{$bill_d_no, "E"},	// bill_d_no
				{$parent_bill_d_no, "E"}	// parent_bill_d_no
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_DT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
			}
		)),
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
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
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

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 0, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 0, $peg_no, value);
	}


	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 1, $err_flg);
	}

	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 1, $err_flg, value);
	}


	/**
	 * Header details pegged ヘッダ明細紐付.<p>
	 *
	 */
	public MCNumber hdr_dtl_peg() {
		return getConstNumber(offset + 2, $hdr_dtl_peg);
	}

	/**
	 * Header details pegged ヘッダ明細紐付.<p>
	 *
	 */
	public void hdr_dtl_peg(MCNumber value) {
		setConstNumber(offset + 2, $hdr_dtl_peg, value);
	}

	/**
	 * Header details pegged ヘッダ明細紐付.<p>
	 *
	 */
	public void hdr_dtl_peg(int value) {
		setConstNumber(offset + 2, $hdr_dtl_peg, value);
	}

	/**
	 * Header details pegged ヘッダ明細紐付.<p>
	 *
	 */
	public void hdr_dtl_peg(long value) {
		setConstNumber(offset + 2, $hdr_dtl_peg, value);
	}

	/**
	 * Header details pegged ヘッダ明細紐付.<p>
	 *
	 */
	public void hdr_dtl_peg(float value) {
		setConstNumber(offset + 2, $hdr_dtl_peg, value);
	}

	/**
	 * Header details pegged ヘッダ明細紐付.<p>
	 *
	 */
	public void hdr_dtl_peg(double value) {
		setConstNumber(offset + 2, $hdr_dtl_peg, value);
	}


	/**
	 * Group sequence No. グループシーケンスＮＯ.<p>
	 *
	 */
	public MCNumber grp_seq() {
		return getConstNumber(offset + 3, $grp_seq);
	}

	/**
	 * Group sequence No. グループシーケンスＮＯ.<p>
	 *
	 */
	public void grp_seq(MCNumber value) {
		setConstNumber(offset + 3, $grp_seq, value);
	}

	/**
	 * Group sequence No. グループシーケンスＮＯ.<p>
	 *
	 */
	public void grp_seq(int value) {
		setConstNumber(offset + 3, $grp_seq, value);
	}

	/**
	 * Group sequence No. グループシーケンスＮＯ.<p>
	 *
	 */
	public void grp_seq(long value) {
		setConstNumber(offset + 3, $grp_seq, value);
	}

	/**
	 * Group sequence No. グループシーケンスＮＯ.<p>
	 *
	 */
	public void grp_seq(float value) {
		setConstNumber(offset + 3, $grp_seq, value);
	}

	/**
	 * Group sequence No. グループシーケンスＮＯ.<p>
	 *
	 */
	public void grp_seq(double value) {
		setConstNumber(offset + 3, $grp_seq, value);
	}


	/**
	 * Billing details No. 請求明細ＮＯ.<p>
	 *
	 */
	public String bill_d_no() {
		return getConstString(offset + 4, $bill_d_no);
	}

	/**
	 * Billing details No. 請求明細ＮＯ.<p>
	 *
	 */
	public void bill_d_no(String value) {
		setConstString(offset + 4, $bill_d_no, value);
	}


	/**
	 * Parent billing details No. 親請求明細ＮＯ.<p>
	 *
	 */
	public String parent_bill_d_no() {
		return getConstString(offset + 5, $parent_bill_d_no);
	}

	/**
	 * Parent billing details No. 親請求明細ＮＯ.<p>
	 *
	 */
	public void parent_bill_d_no(String value) {
		setConstString(offset + 5, $parent_bill_d_no, value);
	}


	/**
	 * Billing management No. 請求管理ＮＯ.<p>
	 *
	 */
	public String bill_mng_no() {
		return getConstString(offset + 6, $bill_mng_no);
	}

	/**
	 * Billing management No. 請求管理ＮＯ.<p>
	 *
	 */
	public void bill_mng_no(String value) {
		setConstString(offset + 6, $bill_mng_no, value);
	}


	public MCNumber appl_tgt_amt() {
		return getConstNumber(offset + 7, $appl_tgt_amt);
	}

	public void appl_tgt_amt(MCNumber value) {
		setConstNumber(offset + 7, $appl_tgt_amt, value);
	}

	public void appl_tgt_amt(int value) {
		setConstNumber(offset + 7, $appl_tgt_amt, value);
	}

	public void appl_tgt_amt(long value) {
		setConstNumber(offset + 7, $appl_tgt_amt, value);
	}

	public void appl_tgt_amt(float value) {
		setConstNumber(offset + 7, $appl_tgt_amt, value);
	}

	public void appl_tgt_amt(double value) {
		setConstNumber(offset + 7, $appl_tgt_amt, value);
	}


	public MCNumber ttl_appl_amt() {
		return getConstNumber(offset + 8, $ttl_appl_amt);
	}

	public void ttl_appl_amt(MCNumber value) {
		setConstNumber(offset + 8, $ttl_appl_amt, value);
	}

	public void ttl_appl_amt(int value) {
		setConstNumber(offset + 8, $ttl_appl_amt, value);
	}

	public void ttl_appl_amt(long value) {
		setConstNumber(offset + 8, $ttl_appl_amt, value);
	}

	public void ttl_appl_amt(float value) {
		setConstNumber(offset + 8, $ttl_appl_amt, value);
	}

	public void ttl_appl_amt(double value) {
		setConstNumber(offset + 8, $ttl_appl_amt, value);
	}


	/**
	 * Reconciled amount 消込額.<p>
	 *
	 */
	public MCNumber appl_amt() {
		return getConstNumber(offset + 9, $appl_amt);
	}

	/**
	 * Reconciled amount 消込額.<p>
	 *
	 */
	public void appl_amt(MCNumber value) {
		setConstNumber(offset + 9, $appl_amt, value);
	}

	/**
	 * Reconciled amount 消込額.<p>
	 *
	 */
	public void appl_amt(int value) {
		setConstNumber(offset + 9, $appl_amt, value);
	}

	/**
	 * Reconciled amount 消込額.<p>
	 *
	 */
	public void appl_amt(long value) {
		setConstNumber(offset + 9, $appl_amt, value);
	}

	/**
	 * Reconciled amount 消込額.<p>
	 *
	 */
	public void appl_amt(float value) {
		setConstNumber(offset + 9, $appl_amt, value);
	}

	/**
	 * Reconciled amount 消込額.<p>
	 *
	 */
	public void appl_amt(double value) {
		setConstNumber(offset + 9, $appl_amt, value);
	}


	/**
	 * Billing details update counter 請求明細更新カウンタ.<p>
	 *
	 */
	public MCNumber bill_d_upd_cntr() {
		return getConstNumber(offset + 10, $bill_d_upd_cntr);
	}

	/**
	 * Billing details update counter 請求明細更新カウンタ.<p>
	 *
	 */
	public void bill_d_upd_cntr(MCNumber value) {
		setConstNumber(offset + 10, $bill_d_upd_cntr, value);
	}

	/**
	 * Billing details update counter 請求明細更新カウンタ.<p>
	 *
	 */
	public void bill_d_upd_cntr(int value) {
		setConstNumber(offset + 10, $bill_d_upd_cntr, value);
	}

	/**
	 * Billing details update counter 請求明細更新カウンタ.<p>
	 *
	 */
	public void bill_d_upd_cntr(long value) {
		setConstNumber(offset + 10, $bill_d_upd_cntr, value);
	}

	/**
	 * Billing details update counter 請求明細更新カウンタ.<p>
	 *
	 */
	public void bill_d_upd_cntr(float value) {
		setConstNumber(offset + 10, $bill_d_upd_cntr, value);
	}

	/**
	 * Billing details update counter 請求明細更新カウンタ.<p>
	 *
	 */
	public void bill_d_upd_cntr(double value) {
		setConstNumber(offset + 10, $bill_d_upd_cntr, value);
	}


	/**
	 * Billing details reconciled balance update counter 請求明細消込残高更新カウンタ.<p>
	 *
	 */
	public MCNumber bill_d_appl_bal_upd_cntr() {
		return getConstNumber(offset + 11, $bill_d_appl_bal_upd_cntr);
	}

	/**
	 * Billing details reconciled balance update counter 請求明細消込残高更新カウンタ.<p>
	 *
	 */
	public void bill_d_appl_bal_upd_cntr(MCNumber value) {
		setConstNumber(offset + 11, $bill_d_appl_bal_upd_cntr, value);
	}

	/**
	 * Billing details reconciled balance update counter 請求明細消込残高更新カウンタ.<p>
	 *
	 */
	public void bill_d_appl_bal_upd_cntr(int value) {
		setConstNumber(offset + 11, $bill_d_appl_bal_upd_cntr, value);
	}

	/**
	 * Billing details reconciled balance update counter 請求明細消込残高更新カウンタ.<p>
	 *
	 */
	public void bill_d_appl_bal_upd_cntr(long value) {
		setConstNumber(offset + 11, $bill_d_appl_bal_upd_cntr, value);
	}

	/**
	 * Billing details reconciled balance update counter 請求明細消込残高更新カウンタ.<p>
	 *
	 */
	public void bill_d_appl_bal_upd_cntr(float value) {
		setConstNumber(offset + 11, $bill_d_appl_bal_upd_cntr, value);
	}

	/**
	 * Billing details reconciled balance update counter 請求明細消込残高更新カウンタ.<p>
	 *
	 */
	public void bill_d_appl_bal_upd_cntr(double value) {
		setConstNumber(offset + 11, $bill_d_appl_bal_upd_cntr, value);
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
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($hdr_dtl_peg.equalsIgnoreCase(name)) {
			return hdr_dtl_peg();
		}
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
		if ($bill_d_upd_cntr.equalsIgnoreCase(name)) {
			return bill_d_upd_cntr();
		}
		if ($bill_d_appl_bal_upd_cntr.equalsIgnoreCase(name)) {
			return bill_d_appl_bal_upd_cntr();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBoolean(name);
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
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($hdr_dtl_peg.equalsIgnoreCase(name)) {
			return hdr_dtl_peg();
		}
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
		if ($bill_d_upd_cntr.equalsIgnoreCase(name)) {
			return bill_d_upd_cntr();
		}
		if ($bill_d_appl_bal_upd_cntr.equalsIgnoreCase(name)) {
			return bill_d_appl_bal_upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBooleanNE(name);
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
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_dtl_peg.equalsIgnoreCase(name)) {
			hdr_dtl_peg(value);
			return;
		}
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
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_dtl_peg.equalsIgnoreCase(name)) {
			hdr_dtl_peg(value);
			return;
		}
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
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_dtl_peg.equalsIgnoreCase(name)) {
			hdr_dtl_peg(value);
			return;
		}
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
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_dtl_peg.equalsIgnoreCase(name)) {
			hdr_dtl_peg(value);
			return;
		}
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
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_dtl_peg.equalsIgnoreCase(name)) {
			hdr_dtl_peg(value);
			return;
		}
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
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBoolean(name, value);
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
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_dtl_peg.equalsIgnoreCase(name)) {
			hdr_dtl_peg(value);
			return;
		}
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
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_dtl_peg.equalsIgnoreCase(name)) {
			hdr_dtl_peg(value);
			return;
		}
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
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_dtl_peg.equalsIgnoreCase(name)) {
			hdr_dtl_peg(value);
			return;
		}
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
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_dtl_peg.equalsIgnoreCase(name)) {
			hdr_dtl_peg(value);
			return;
		}
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
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_dtl_peg.equalsIgnoreCase(name)) {
			hdr_dtl_peg(value);
			return;
		}
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
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

