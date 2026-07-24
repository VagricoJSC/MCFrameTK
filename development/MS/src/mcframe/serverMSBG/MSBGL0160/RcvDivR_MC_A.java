package mcframe.serverMSBG.MSBGL0160;

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
 * ブロック"RcvDiv"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RcvDivR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Split destination payment received No. 分割先入金ＮＯ.<p>
	 *
	 */
	public static final String $rcv_no = "rcv_no";
	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public static final String $bcst_cd = "bcst_cd";
	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public static final String $bill_dpt_cd = "bill_dpt_cd";
	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public static final String $rcv_amt = "rcv_amt";
	/**
	 * Unreconciled balance 未処理残高.<p>
	 *
	 */
	public static final String $not_proc_bal = "not_proc_bal";
	/**
	 * Transfer fee 振込手数料.<p>
	 *
	 */
	public static final String $com_paid = "com_paid";
	/**
	 * Payment received remarks 入金備考.<p>
	 *
	 */
	public static final String $rcv_rmrks = "rcv_rmrks";
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public static final String $rcv_sub_char1 = "rcv_sub_char1";
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public static final String $rcv_sub_char2 = "rcv_sub_char2";
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public static final String $rcv_sub_char3 = "rcv_sub_char3";
	/**
	 * Split destination payment received update counter 分割先入金更新カウンタ.<p>
	 *
	 */
	public static final String $div_src_rcv_upd_cntr = "div_src_rcv_upd_cntr";
	/**
	 * Payment receiving dept. cd. 入金部門ＣＤ.<p>
	 *
	 */
	public static final String $rcv_dpt_cd = "rcv_dpt_cd";


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcv_no_META = createCommonMeta($rcv_no, mcframe.commonMA.meta.MA_META.RCV_NO);
	public static final MCMeta bcst_cd_META = createCommonMeta($bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bill_dpt_cd_META = createCommonMeta($bill_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta rcv_amt_META = createCommonMeta($rcv_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta not_proc_bal_META = createCommonMeta($not_proc_bal, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta com_paid_META = createCommonMeta($com_paid, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta rcv_rmrks_META = createCommonMeta($rcv_rmrks, mcframe.commonMS.meta.MS_META.RCV_RMRKS);
	public static final MCMeta rcv_sub_char1_META = createCommonMeta($rcv_sub_char1, mcframe.commonMS.meta.MS_META.RCV_SUB_CHAR1);
	public static final MCMeta rcv_sub_char2_META = createCommonMeta($rcv_sub_char2, mcframe.commonMS.meta.MS_META.RCV_SUB_CHAR2);
	public static final MCMeta rcv_sub_char3_META = createCommonMeta($rcv_sub_char3, mcframe.commonMS.meta.MS_META.RCV_SUB_CHAR3);
	public static final MCMeta div_src_rcv_upd_cntr_META = createCommonMeta($div_src_rcv_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta rcv_dpt_cd_META = createCommonMeta($rcv_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);

	protected static final ConstMetaList<RcvDivR> constMetas = new ConstMetaList<RcvDivR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			err_flg_META,
			rcv_no_META,
			bcst_cd_META,
			bill_dpt_cd_META,
			rcv_amt_META,
			not_proc_bal_META,
			com_paid_META,
			rcv_rmrks_META,
			rcv_sub_char1_META,
			rcv_sub_char2_META,
			rcv_sub_char3_META,
			div_src_rcv_upd_cntr_META,
			rcv_dpt_cd_META
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
	/** 項目属性情報のグループ[CHK_PTN]のキー定数 */
	public static final String $$CHK_PTN = "CHK_PTN";
	/** 項目属性情報のグループ[DUPLICATE]のキー定数 */
	public static final String $$DUPLICATE = "DUPLICATE";
	/** 項目属性情報のグループ[TOO_MANY_INPUTS]のキー定数 */
	public static final String $$TOO_MANY_INPUTS = "TOO_MANY_INPUTS";
	/** 項目属性情報のグループ[AT_LEAST_ONE]のキー定数 */
	public static final String $$AT_LEAST_ONE = "AT_LEAST_ONE";
	/** 項目属性情報のグループ[ONLY_ONE_INPUT]のキー定数 */
	public static final String $$ONLY_ONE_INPUT = "ONLY_ONE_INPUT";
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
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$bcst_cd, "E"},	// bcst_cd
				{$rcv_amt, "E"}	// rcv_amt
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
				{$rcv_amt, "positive"}	// rcv_amt
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
		new MCExtMap.Entry($$CHK_PTN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DUPLICATE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$TOO_MANY_INPUTS, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$AT_LEAST_ONE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$ONLY_ONE_INPUT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$bcst_cd, "MA.MAUAL0010.Bp"},	// bcst_cd
				{$bill_dpt_cd, "MA.MAUAL0010.Dpt"},	// bill_dpt_cd
				{$rcv_dpt_cd, "MA.MAUAL0010.Dpt"}	// rcv_dpt_cd
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
				{$bcst_cd, "MAC_BP_IS_SRCH_TYP.BCST_BY_RCST"},	// bcst_cd
				{$bill_dpt_cd, "bcst_cd;MAC_DPT_IS_SRCH_TYP.BCST"},	// bill_dpt_cd
				{$rcv_dpt_cd, "bcst_cd;MAC_DPT_IS_SRCH_TYP.BCST"}	// rcv_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$bcst_cd, "bp_is_srch_typ"},	// bcst_cd
				{$bill_dpt_cd, "bcst_cd;dpt_is_srch_typ"},	// bill_dpt_cd
				{$rcv_dpt_cd, "bcst_cd;dpt_is_srch_typ"}	// rcv_dpt_cd
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
	protected RcvDivR_MC_A(ConstMetaList<? extends RcvDivR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RcvDivR clone() {
		return (RcvDivR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RcvDivR createInstance() {
		return (RcvDivR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RcvDivR getValues(String... names) {
		return (RcvDivR) super.getValues(names);
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
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 1, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 1, $err_flg, value);
	}


	/**
	 * Split destination payment received No. 分割先入金ＮＯ.<p>
	 *
	 */
	public String rcv_no() {
		return getConstString(offset + 2, $rcv_no);
	}

	/**
	 * Split destination payment received No. 分割先入金ＮＯ.<p>
	 *
	 */
	public void rcv_no(String value) {
		setConstString(offset + 2, $rcv_no, value);
	}


	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public String bcst_cd() {
		return getConstString(offset + 3, $bcst_cd);
	}

	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public void bcst_cd(String value) {
		setConstString(offset + 3, $bcst_cd, value);
	}


	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public String bill_dpt_cd() {
		return getConstString(offset + 4, $bill_dpt_cd);
	}

	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public void bill_dpt_cd(String value) {
		setConstString(offset + 4, $bill_dpt_cd, value);
	}


	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public MCNumber rcv_amt() {
		return getConstNumber(offset + 5, $rcv_amt);
	}

	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public void rcv_amt(MCNumber value) {
		setConstNumber(offset + 5, $rcv_amt, value);
	}

	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public void rcv_amt(int value) {
		setConstNumber(offset + 5, $rcv_amt, value);
	}

	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public void rcv_amt(long value) {
		setConstNumber(offset + 5, $rcv_amt, value);
	}

	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public void rcv_amt(float value) {
		setConstNumber(offset + 5, $rcv_amt, value);
	}

	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public void rcv_amt(double value) {
		setConstNumber(offset + 5, $rcv_amt, value);
	}


	/**
	 * Unreconciled balance 未処理残高.<p>
	 *
	 */
	public MCNumber not_proc_bal() {
		return getConstNumber(offset + 6, $not_proc_bal);
	}

	/**
	 * Unreconciled balance 未処理残高.<p>
	 *
	 */
	public void not_proc_bal(MCNumber value) {
		setConstNumber(offset + 6, $not_proc_bal, value);
	}

	/**
	 * Unreconciled balance 未処理残高.<p>
	 *
	 */
	public void not_proc_bal(int value) {
		setConstNumber(offset + 6, $not_proc_bal, value);
	}

	/**
	 * Unreconciled balance 未処理残高.<p>
	 *
	 */
	public void not_proc_bal(long value) {
		setConstNumber(offset + 6, $not_proc_bal, value);
	}

	/**
	 * Unreconciled balance 未処理残高.<p>
	 *
	 */
	public void not_proc_bal(float value) {
		setConstNumber(offset + 6, $not_proc_bal, value);
	}

	/**
	 * Unreconciled balance 未処理残高.<p>
	 *
	 */
	public void not_proc_bal(double value) {
		setConstNumber(offset + 6, $not_proc_bal, value);
	}


	/**
	 * Transfer fee 振込手数料.<p>
	 *
	 */
	public MCNumber com_paid() {
		return getConstNumber(offset + 7, $com_paid);
	}

	/**
	 * Transfer fee 振込手数料.<p>
	 *
	 */
	public void com_paid(MCNumber value) {
		setConstNumber(offset + 7, $com_paid, value);
	}

	/**
	 * Transfer fee 振込手数料.<p>
	 *
	 */
	public void com_paid(int value) {
		setConstNumber(offset + 7, $com_paid, value);
	}

	/**
	 * Transfer fee 振込手数料.<p>
	 *
	 */
	public void com_paid(long value) {
		setConstNumber(offset + 7, $com_paid, value);
	}

	/**
	 * Transfer fee 振込手数料.<p>
	 *
	 */
	public void com_paid(float value) {
		setConstNumber(offset + 7, $com_paid, value);
	}

	/**
	 * Transfer fee 振込手数料.<p>
	 *
	 */
	public void com_paid(double value) {
		setConstNumber(offset + 7, $com_paid, value);
	}


	/**
	 * Payment received remarks 入金備考.<p>
	 *
	 */
	public String rcv_rmrks() {
		return getConstString(offset + 8, $rcv_rmrks);
	}

	/**
	 * Payment received remarks 入金備考.<p>
	 *
	 */
	public void rcv_rmrks(String value) {
		setConstString(offset + 8, $rcv_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String rcv_sub_char1() {
		return getConstString(offset + 9, $rcv_sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void rcv_sub_char1(String value) {
		setConstString(offset + 9, $rcv_sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String rcv_sub_char2() {
		return getConstString(offset + 10, $rcv_sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void rcv_sub_char2(String value) {
		setConstString(offset + 10, $rcv_sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String rcv_sub_char3() {
		return getConstString(offset + 11, $rcv_sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void rcv_sub_char3(String value) {
		setConstString(offset + 11, $rcv_sub_char3, value);
	}


	/**
	 * Split destination payment received update counter 分割先入金更新カウンタ.<p>
	 *
	 */
	public MCNumber div_src_rcv_upd_cntr() {
		return getConstNumber(offset + 12, $div_src_rcv_upd_cntr);
	}

	/**
	 * Split destination payment received update counter 分割先入金更新カウンタ.<p>
	 *
	 */
	public void div_src_rcv_upd_cntr(MCNumber value) {
		setConstNumber(offset + 12, $div_src_rcv_upd_cntr, value);
	}

	/**
	 * Split destination payment received update counter 分割先入金更新カウンタ.<p>
	 *
	 */
	public void div_src_rcv_upd_cntr(int value) {
		setConstNumber(offset + 12, $div_src_rcv_upd_cntr, value);
	}

	/**
	 * Split destination payment received update counter 分割先入金更新カウンタ.<p>
	 *
	 */
	public void div_src_rcv_upd_cntr(long value) {
		setConstNumber(offset + 12, $div_src_rcv_upd_cntr, value);
	}

	/**
	 * Split destination payment received update counter 分割先入金更新カウンタ.<p>
	 *
	 */
	public void div_src_rcv_upd_cntr(float value) {
		setConstNumber(offset + 12, $div_src_rcv_upd_cntr, value);
	}

	/**
	 * Split destination payment received update counter 分割先入金更新カウンタ.<p>
	 *
	 */
	public void div_src_rcv_upd_cntr(double value) {
		setConstNumber(offset + 12, $div_src_rcv_upd_cntr, value);
	}


	/**
	 * Payment receiving dept. cd. 入金部門ＣＤ.<p>
	 *
	 */
	public String rcv_dpt_cd() {
		return getConstString(offset + 13, $rcv_dpt_cd);
	}

	/**
	 * Payment receiving dept. cd. 入金部門ＣＤ.<p>
	 *
	 */
	public void rcv_dpt_cd(String value) {
		setConstString(offset + 13, $rcv_dpt_cd, value);
	}


	public String getString(String name) {
		if ($rcv_no.equalsIgnoreCase(name)) {
			return rcv_no();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($rcv_rmrks.equalsIgnoreCase(name)) {
			return rcv_rmrks();
		}
		if ($rcv_sub_char1.equalsIgnoreCase(name)) {
			return rcv_sub_char1();
		}
		if ($rcv_sub_char2.equalsIgnoreCase(name)) {
			return rcv_sub_char2();
		}
		if ($rcv_sub_char3.equalsIgnoreCase(name)) {
			return rcv_sub_char3();
		}
		if ($rcv_dpt_cd.equalsIgnoreCase(name)) {
			return rcv_dpt_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			return rcv_amt();
		}
		if ($not_proc_bal.equalsIgnoreCase(name)) {
			return not_proc_bal();
		}
		if ($com_paid.equalsIgnoreCase(name)) {
			return com_paid();
		}
		if ($div_src_rcv_upd_cntr.equalsIgnoreCase(name)) {
			return div_src_rcv_upd_cntr();
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
		if ($rcv_no.equalsIgnoreCase(name)) {
			return rcv_no();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($rcv_rmrks.equalsIgnoreCase(name)) {
			return rcv_rmrks();
		}
		if ($rcv_sub_char1.equalsIgnoreCase(name)) {
			return rcv_sub_char1();
		}
		if ($rcv_sub_char2.equalsIgnoreCase(name)) {
			return rcv_sub_char2();
		}
		if ($rcv_sub_char3.equalsIgnoreCase(name)) {
			return rcv_sub_char3();
		}
		if ($rcv_dpt_cd.equalsIgnoreCase(name)) {
			return rcv_dpt_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			return rcv_amt();
		}
		if ($not_proc_bal.equalsIgnoreCase(name)) {
			return not_proc_bal();
		}
		if ($com_paid.equalsIgnoreCase(name)) {
			return com_paid();
		}
		if ($div_src_rcv_upd_cntr.equalsIgnoreCase(name)) {
			return div_src_rcv_upd_cntr();
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
		if ($rcv_no.equalsIgnoreCase(name)) {
			rcv_no(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		if ($rcv_rmrks.equalsIgnoreCase(name)) {
			rcv_rmrks(value);
			return;
		}
		if ($rcv_sub_char1.equalsIgnoreCase(name)) {
			rcv_sub_char1(value);
			return;
		}
		if ($rcv_sub_char2.equalsIgnoreCase(name)) {
			rcv_sub_char2(value);
			return;
		}
		if ($rcv_sub_char3.equalsIgnoreCase(name)) {
			rcv_sub_char3(value);
			return;
		}
		if ($rcv_dpt_cd.equalsIgnoreCase(name)) {
			rcv_dpt_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($not_proc_bal.equalsIgnoreCase(name)) {
			not_proc_bal(value);
			return;
		}
		if ($com_paid.equalsIgnoreCase(name)) {
			com_paid(value);
			return;
		}
		if ($div_src_rcv_upd_cntr.equalsIgnoreCase(name)) {
			div_src_rcv_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($not_proc_bal.equalsIgnoreCase(name)) {
			not_proc_bal(value);
			return;
		}
		if ($com_paid.equalsIgnoreCase(name)) {
			com_paid(value);
			return;
		}
		if ($div_src_rcv_upd_cntr.equalsIgnoreCase(name)) {
			div_src_rcv_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($not_proc_bal.equalsIgnoreCase(name)) {
			not_proc_bal(value);
			return;
		}
		if ($com_paid.equalsIgnoreCase(name)) {
			com_paid(value);
			return;
		}
		if ($div_src_rcv_upd_cntr.equalsIgnoreCase(name)) {
			div_src_rcv_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($not_proc_bal.equalsIgnoreCase(name)) {
			not_proc_bal(value);
			return;
		}
		if ($com_paid.equalsIgnoreCase(name)) {
			com_paid(value);
			return;
		}
		if ($div_src_rcv_upd_cntr.equalsIgnoreCase(name)) {
			div_src_rcv_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($not_proc_bal.equalsIgnoreCase(name)) {
			not_proc_bal(value);
			return;
		}
		if ($com_paid.equalsIgnoreCase(name)) {
			com_paid(value);
			return;
		}
		if ($div_src_rcv_upd_cntr.equalsIgnoreCase(name)) {
			div_src_rcv_upd_cntr(value);
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
		if ($rcv_no.equalsIgnoreCase(name)) {
			rcv_no(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		if ($rcv_rmrks.equalsIgnoreCase(name)) {
			rcv_rmrks(value);
			return;
		}
		if ($rcv_sub_char1.equalsIgnoreCase(name)) {
			rcv_sub_char1(value);
			return;
		}
		if ($rcv_sub_char2.equalsIgnoreCase(name)) {
			rcv_sub_char2(value);
			return;
		}
		if ($rcv_sub_char3.equalsIgnoreCase(name)) {
			rcv_sub_char3(value);
			return;
		}
		if ($rcv_dpt_cd.equalsIgnoreCase(name)) {
			rcv_dpt_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($not_proc_bal.equalsIgnoreCase(name)) {
			not_proc_bal(value);
			return;
		}
		if ($com_paid.equalsIgnoreCase(name)) {
			com_paid(value);
			return;
		}
		if ($div_src_rcv_upd_cntr.equalsIgnoreCase(name)) {
			div_src_rcv_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($not_proc_bal.equalsIgnoreCase(name)) {
			not_proc_bal(value);
			return;
		}
		if ($com_paid.equalsIgnoreCase(name)) {
			com_paid(value);
			return;
		}
		if ($div_src_rcv_upd_cntr.equalsIgnoreCase(name)) {
			div_src_rcv_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($not_proc_bal.equalsIgnoreCase(name)) {
			not_proc_bal(value);
			return;
		}
		if ($com_paid.equalsIgnoreCase(name)) {
			com_paid(value);
			return;
		}
		if ($div_src_rcv_upd_cntr.equalsIgnoreCase(name)) {
			div_src_rcv_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($not_proc_bal.equalsIgnoreCase(name)) {
			not_proc_bal(value);
			return;
		}
		if ($com_paid.equalsIgnoreCase(name)) {
			com_paid(value);
			return;
		}
		if ($div_src_rcv_upd_cntr.equalsIgnoreCase(name)) {
			div_src_rcv_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($not_proc_bal.equalsIgnoreCase(name)) {
			not_proc_bal(value);
			return;
		}
		if ($com_paid.equalsIgnoreCase(name)) {
			com_paid(value);
			return;
		}
		if ($div_src_rcv_upd_cntr.equalsIgnoreCase(name)) {
			div_src_rcv_upd_cntr(value);
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

