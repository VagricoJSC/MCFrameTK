package mcframe.serverMSBG.MSBGL0240;

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
 * ブロック"SwFr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class SwFrR_MC_A extends MCConstRow {

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
	 * Recording month 計上年月.<p>
	 *
	 */
	public static final String $ac_ym = "ac_ym";
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public static final String $trd_cd = "trd_cd";
	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public static final String $ar_dpt_cd = "ar_dpt_cd";
	/**
	 * Result No. 実績ＮＯ.<p>
	 *
	 */
	public static final String $act_no = "act_no";
	/**
	 * Result rev. number 実績改訂番号.<p>
	 *
	 */
	public static final String $act_rev = "act_rev";
	/**
	 * Result sequence number 実績連番.<p>
	 *
	 */
	public static final String $act_seq = "act_seq";
	/**
	 * Result details No. 実績明細ＮＯ.<p>
	 *
	 */
	public static final String $act_d_no = "act_d_no";
	/**
	 * Result details sequence number 実績明細連番.<p>
	 *
	 */
	public static final String $act_d_seq = "act_d_seq";
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
	 * Transfer amount 振替金額.<p>
	 *
	 */
	public static final String $tgt_sw_amt = "tgt_sw_amt";
	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public static final String $wtax_amt = "wtax_amt";
	/**
	 * Unreconciled withholding tax 未消込源泉税.<p>
	 *
	 */
	public static final String $not_appl_wtax_amt = "not_appl_wtax_amt";
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public static final String $wrk_no = "wrk_no";
	/**
	 * Billing details invoice No. 請求明細インボイスＮＯ.<p>
	 *
	 */
	public static final String $bill_d_iv_no = "bill_d_iv_no";
	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public static final String $ar_typ = "ar_typ";
	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public static final String $xrate = "xrate";
	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public static final String $xrate_cd = "xrate_cd";
	/**
	 * Billing details reconciled balance update counter 請求明細消込残高更新カウンタ.<p>
	 *
	 */
	public static final String $bill_d_appl_bal_upd_cntr = "bill_d_appl_bal_upd_cntr";
	/**
	 * Billing details update counter 請求明細更新カウンタ.<p>
	 *
	 */
	public static final String $bill_d_upd_cntr = "bill_d_upd_cntr";


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ac_ym_META = createCommonMeta($ac_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta ar_dpt_cd_META = createCommonMeta($ar_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta act_no_META = createCommonMeta($act_no, mcframe.commonMA.meta.MA_META.ACT_NO);
	public static final MCMeta act_rev_META = createCommonMeta($act_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta act_seq_META = createCommonMeta($act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta act_d_no_META = createCommonMeta($act_d_no, mcframe.commonMA.meta.MA_META.ACT_D_NO);
	public static final MCMeta act_d_seq_META = createCommonMeta($act_d_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta bill_d_no_META = createCommonMeta($bill_d_no, mcframe.commonMA.meta.MA_META.BILL_D_NO);
	public static final MCMeta parent_bill_d_no_META = createCommonMeta($parent_bill_d_no, mcframe.commonMA.meta.MA_META.BILL_D_NO);
	public static final MCMeta tgt_sw_amt_META = createCommonMeta($tgt_sw_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta wtax_amt_META = createCommonMeta($wtax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta not_appl_wtax_amt_META = createCommonMeta($not_appl_wtax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta bill_d_iv_no_META = createCommonMeta($bill_d_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta ar_typ_META = createCommonMeta($ar_typ, mcframe.commonMA.meta.MA_META.AR_TYP);
	public static final MCMeta xrate_META = createCommonMeta($xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta xrate_cd_META = createCommonMeta($xrate_cd, mcframe.commonMA.meta.MA_META.XRATE_CD);
	public static final MCMeta bill_d_appl_bal_upd_cntr_META = createCommonMeta($bill_d_appl_bal_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta bill_d_upd_cntr_META = createCommonMeta($bill_d_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);

	protected static final ConstMetaList<SwFrR> constMetas = new ConstMetaList<SwFrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			err_flg_META,
			ac_ym_META,
			trd_cd_META,
			ar_dpt_cd_META,
			act_no_META,
			act_rev_META,
			act_seq_META,
			act_d_no_META,
			act_d_seq_META,
			bill_d_no_META,
			parent_bill_d_no_META,
			tgt_sw_amt_META,
			wtax_amt_META,
			not_appl_wtax_amt_META,
			ac_dt_META,
			trd_cur_cd_META,
			wrk_no_META,
			bill_d_iv_no_META,
			ar_typ_META,
			xrate_META,
			xrate_cd_META,
			bill_d_appl_bal_upd_cntr_META,
			bill_d_upd_cntr_META
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
				{$bill_d_no, "E"}	// bill_d_no
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
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
	protected SwFrR_MC_A(ConstMetaList<? extends SwFrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SwFrR clone() {
		return (SwFrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SwFrR createInstance() {
		return (SwFrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SwFrR getValues(String... names) {
		return (SwFrR) super.getValues(names);
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
	 * Recording month 計上年月.<p>
	 *
	 */
	public MCDate ac_ym() {
		return getConstDate(offset + 2, $ac_ym);
	}

	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public void ac_ym(MCDate value) {
		setConstDate(offset + 2, $ac_ym, value);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 3, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 3, $trd_cd, value);
	}


	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public String ar_dpt_cd() {
		return getConstString(offset + 4, $ar_dpt_cd);
	}

	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public void ar_dpt_cd(String value) {
		setConstString(offset + 4, $ar_dpt_cd, value);
	}


	/**
	 * Result No. 実績ＮＯ.<p>
	 *
	 */
	public String act_no() {
		return getConstString(offset + 5, $act_no);
	}

	/**
	 * Result No. 実績ＮＯ.<p>
	 *
	 */
	public void act_no(String value) {
		setConstString(offset + 5, $act_no, value);
	}


	/**
	 * Result rev. number 実績改訂番号.<p>
	 *
	 */
	public MCNumber act_rev() {
		return getConstNumber(offset + 6, $act_rev);
	}

	/**
	 * Result rev. number 実績改訂番号.<p>
	 *
	 */
	public void act_rev(MCNumber value) {
		setConstNumber(offset + 6, $act_rev, value);
	}

	/**
	 * Result rev. number 実績改訂番号.<p>
	 *
	 */
	public void act_rev(int value) {
		setConstNumber(offset + 6, $act_rev, value);
	}

	/**
	 * Result rev. number 実績改訂番号.<p>
	 *
	 */
	public void act_rev(long value) {
		setConstNumber(offset + 6, $act_rev, value);
	}

	/**
	 * Result rev. number 実績改訂番号.<p>
	 *
	 */
	public void act_rev(float value) {
		setConstNumber(offset + 6, $act_rev, value);
	}

	/**
	 * Result rev. number 実績改訂番号.<p>
	 *
	 */
	public void act_rev(double value) {
		setConstNumber(offset + 6, $act_rev, value);
	}


	/**
	 * Result sequence number 実績連番.<p>
	 *
	 */
	public MCNumber act_seq() {
		return getConstNumber(offset + 7, $act_seq);
	}

	/**
	 * Result sequence number 実績連番.<p>
	 *
	 */
	public void act_seq(MCNumber value) {
		setConstNumber(offset + 7, $act_seq, value);
	}

	/**
	 * Result sequence number 実績連番.<p>
	 *
	 */
	public void act_seq(int value) {
		setConstNumber(offset + 7, $act_seq, value);
	}

	/**
	 * Result sequence number 実績連番.<p>
	 *
	 */
	public void act_seq(long value) {
		setConstNumber(offset + 7, $act_seq, value);
	}

	/**
	 * Result sequence number 実績連番.<p>
	 *
	 */
	public void act_seq(float value) {
		setConstNumber(offset + 7, $act_seq, value);
	}

	/**
	 * Result sequence number 実績連番.<p>
	 *
	 */
	public void act_seq(double value) {
		setConstNumber(offset + 7, $act_seq, value);
	}


	/**
	 * Result details No. 実績明細ＮＯ.<p>
	 *
	 */
	public String act_d_no() {
		return getConstString(offset + 8, $act_d_no);
	}

	/**
	 * Result details No. 実績明細ＮＯ.<p>
	 *
	 */
	public void act_d_no(String value) {
		setConstString(offset + 8, $act_d_no, value);
	}


	/**
	 * Result details sequence number 実績明細連番.<p>
	 *
	 */
	public MCNumber act_d_seq() {
		return getConstNumber(offset + 9, $act_d_seq);
	}

	/**
	 * Result details sequence number 実績明細連番.<p>
	 *
	 */
	public void act_d_seq(MCNumber value) {
		setConstNumber(offset + 9, $act_d_seq, value);
	}

	/**
	 * Result details sequence number 実績明細連番.<p>
	 *
	 */
	public void act_d_seq(int value) {
		setConstNumber(offset + 9, $act_d_seq, value);
	}

	/**
	 * Result details sequence number 実績明細連番.<p>
	 *
	 */
	public void act_d_seq(long value) {
		setConstNumber(offset + 9, $act_d_seq, value);
	}

	/**
	 * Result details sequence number 実績明細連番.<p>
	 *
	 */
	public void act_d_seq(float value) {
		setConstNumber(offset + 9, $act_d_seq, value);
	}

	/**
	 * Result details sequence number 実績明細連番.<p>
	 *
	 */
	public void act_d_seq(double value) {
		setConstNumber(offset + 9, $act_d_seq, value);
	}


	/**
	 * Billing details No. 請求明細ＮＯ.<p>
	 *
	 */
	public String bill_d_no() {
		return getConstString(offset + 10, $bill_d_no);
	}

	/**
	 * Billing details No. 請求明細ＮＯ.<p>
	 *
	 */
	public void bill_d_no(String value) {
		setConstString(offset + 10, $bill_d_no, value);
	}


	/**
	 * Parent billing details No. 親請求明細ＮＯ.<p>
	 *
	 */
	public String parent_bill_d_no() {
		return getConstString(offset + 11, $parent_bill_d_no);
	}

	/**
	 * Parent billing details No. 親請求明細ＮＯ.<p>
	 *
	 */
	public void parent_bill_d_no(String value) {
		setConstString(offset + 11, $parent_bill_d_no, value);
	}


	/**
	 * Transfer amount 振替金額.<p>
	 *
	 */
	public MCNumber tgt_sw_amt() {
		return getConstNumber(offset + 12, $tgt_sw_amt);
	}

	/**
	 * Transfer amount 振替金額.<p>
	 *
	 */
	public void tgt_sw_amt(MCNumber value) {
		setConstNumber(offset + 12, $tgt_sw_amt, value);
	}

	/**
	 * Transfer amount 振替金額.<p>
	 *
	 */
	public void tgt_sw_amt(int value) {
		setConstNumber(offset + 12, $tgt_sw_amt, value);
	}

	/**
	 * Transfer amount 振替金額.<p>
	 *
	 */
	public void tgt_sw_amt(long value) {
		setConstNumber(offset + 12, $tgt_sw_amt, value);
	}

	/**
	 * Transfer amount 振替金額.<p>
	 *
	 */
	public void tgt_sw_amt(float value) {
		setConstNumber(offset + 12, $tgt_sw_amt, value);
	}

	/**
	 * Transfer amount 振替金額.<p>
	 *
	 */
	public void tgt_sw_amt(double value) {
		setConstNumber(offset + 12, $tgt_sw_amt, value);
	}


	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public MCNumber wtax_amt() {
		return getConstNumber(offset + 13, $wtax_amt);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(MCNumber value) {
		setConstNumber(offset + 13, $wtax_amt, value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(int value) {
		setConstNumber(offset + 13, $wtax_amt, value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(long value) {
		setConstNumber(offset + 13, $wtax_amt, value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(float value) {
		setConstNumber(offset + 13, $wtax_amt, value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(double value) {
		setConstNumber(offset + 13, $wtax_amt, value);
	}


	/**
	 * Unreconciled withholding tax 未消込源泉税.<p>
	 *
	 */
	public MCNumber not_appl_wtax_amt() {
		return getConstNumber(offset + 14, $not_appl_wtax_amt);
	}

	/**
	 * Unreconciled withholding tax 未消込源泉税.<p>
	 *
	 */
	public void not_appl_wtax_amt(MCNumber value) {
		setConstNumber(offset + 14, $not_appl_wtax_amt, value);
	}

	/**
	 * Unreconciled withholding tax 未消込源泉税.<p>
	 *
	 */
	public void not_appl_wtax_amt(int value) {
		setConstNumber(offset + 14, $not_appl_wtax_amt, value);
	}

	/**
	 * Unreconciled withholding tax 未消込源泉税.<p>
	 *
	 */
	public void not_appl_wtax_amt(long value) {
		setConstNumber(offset + 14, $not_appl_wtax_amt, value);
	}

	/**
	 * Unreconciled withholding tax 未消込源泉税.<p>
	 *
	 */
	public void not_appl_wtax_amt(float value) {
		setConstNumber(offset + 14, $not_appl_wtax_amt, value);
	}

	/**
	 * Unreconciled withholding tax 未消込源泉税.<p>
	 *
	 */
	public void not_appl_wtax_amt(double value) {
		setConstNumber(offset + 14, $not_appl_wtax_amt, value);
	}


	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 15, $ac_dt);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 15, $ac_dt, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 16, $trd_cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 16, $trd_cur_cd, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 17, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 17, $wrk_no, value);
	}


	/**
	 * Billing details invoice No. 請求明細インボイスＮＯ.<p>
	 *
	 */
	public String bill_d_iv_no() {
		return getConstString(offset + 18, $bill_d_iv_no);
	}

	/**
	 * Billing details invoice No. 請求明細インボイスＮＯ.<p>
	 *
	 */
	public void bill_d_iv_no(String value) {
		setConstString(offset + 18, $bill_d_iv_no, value);
	}


	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public String ar_typ() {
		return getConstString(offset + 19, $ar_typ);
	}

	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public void ar_typ(String value) {
		setConstString(offset + 19, $ar_typ, value);
	}


	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCNumber xrate() {
		return getConstNumber(offset + 20, $xrate);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		setConstNumber(offset + 20, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(int value) {
		setConstNumber(offset + 20, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(long value) {
		setConstNumber(offset + 20, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(float value) {
		setConstNumber(offset + 20, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(double value) {
		setConstNumber(offset + 20, $xrate, value);
	}


	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public String xrate_cd() {
		return getConstString(offset + 21, $xrate_cd);
	}

	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public void xrate_cd(String value) {
		setConstString(offset + 21, $xrate_cd, value);
	}


	/**
	 * Billing details reconciled balance update counter 請求明細消込残高更新カウンタ.<p>
	 *
	 */
	public MCNumber bill_d_appl_bal_upd_cntr() {
		return getConstNumber(offset + 22, $bill_d_appl_bal_upd_cntr);
	}

	/**
	 * Billing details reconciled balance update counter 請求明細消込残高更新カウンタ.<p>
	 *
	 */
	public void bill_d_appl_bal_upd_cntr(MCNumber value) {
		setConstNumber(offset + 22, $bill_d_appl_bal_upd_cntr, value);
	}

	/**
	 * Billing details reconciled balance update counter 請求明細消込残高更新カウンタ.<p>
	 *
	 */
	public void bill_d_appl_bal_upd_cntr(int value) {
		setConstNumber(offset + 22, $bill_d_appl_bal_upd_cntr, value);
	}

	/**
	 * Billing details reconciled balance update counter 請求明細消込残高更新カウンタ.<p>
	 *
	 */
	public void bill_d_appl_bal_upd_cntr(long value) {
		setConstNumber(offset + 22, $bill_d_appl_bal_upd_cntr, value);
	}

	/**
	 * Billing details reconciled balance update counter 請求明細消込残高更新カウンタ.<p>
	 *
	 */
	public void bill_d_appl_bal_upd_cntr(float value) {
		setConstNumber(offset + 22, $bill_d_appl_bal_upd_cntr, value);
	}

	/**
	 * Billing details reconciled balance update counter 請求明細消込残高更新カウンタ.<p>
	 *
	 */
	public void bill_d_appl_bal_upd_cntr(double value) {
		setConstNumber(offset + 22, $bill_d_appl_bal_upd_cntr, value);
	}


	/**
	 * Billing details update counter 請求明細更新カウンタ.<p>
	 *
	 */
	public MCNumber bill_d_upd_cntr() {
		return getConstNumber(offset + 23, $bill_d_upd_cntr);
	}

	/**
	 * Billing details update counter 請求明細更新カウンタ.<p>
	 *
	 */
	public void bill_d_upd_cntr(MCNumber value) {
		setConstNumber(offset + 23, $bill_d_upd_cntr, value);
	}

	/**
	 * Billing details update counter 請求明細更新カウンタ.<p>
	 *
	 */
	public void bill_d_upd_cntr(int value) {
		setConstNumber(offset + 23, $bill_d_upd_cntr, value);
	}

	/**
	 * Billing details update counter 請求明細更新カウンタ.<p>
	 *
	 */
	public void bill_d_upd_cntr(long value) {
		setConstNumber(offset + 23, $bill_d_upd_cntr, value);
	}

	/**
	 * Billing details update counter 請求明細更新カウンタ.<p>
	 *
	 */
	public void bill_d_upd_cntr(float value) {
		setConstNumber(offset + 23, $bill_d_upd_cntr, value);
	}

	/**
	 * Billing details update counter 請求明細更新カウンタ.<p>
	 *
	 */
	public void bill_d_upd_cntr(double value) {
		setConstNumber(offset + 23, $bill_d_upd_cntr, value);
	}


	public String getString(String name) {
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($act_no.equalsIgnoreCase(name)) {
			return act_no();
		}
		if ($act_d_no.equalsIgnoreCase(name)) {
			return act_d_no();
		}
		if ($bill_d_no.equalsIgnoreCase(name)) {
			return bill_d_no();
		}
		if ($parent_bill_d_no.equalsIgnoreCase(name)) {
			return parent_bill_d_no();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($bill_d_iv_no.equalsIgnoreCase(name)) {
			return bill_d_iv_no();
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			return ar_typ();
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			return xrate_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			return act_rev();
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			return act_seq();
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			return act_d_seq();
		}
		if ($tgt_sw_amt.equalsIgnoreCase(name)) {
			return tgt_sw_amt();
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			return wtax_amt();
		}
		if ($not_appl_wtax_amt.equalsIgnoreCase(name)) {
			return not_appl_wtax_amt();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($bill_d_appl_bal_upd_cntr.equalsIgnoreCase(name)) {
			return bill_d_appl_bal_upd_cntr();
		}
		if ($bill_d_upd_cntr.equalsIgnoreCase(name)) {
			return bill_d_upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($act_no.equalsIgnoreCase(name)) {
			return act_no();
		}
		if ($act_d_no.equalsIgnoreCase(name)) {
			return act_d_no();
		}
		if ($bill_d_no.equalsIgnoreCase(name)) {
			return bill_d_no();
		}
		if ($parent_bill_d_no.equalsIgnoreCase(name)) {
			return parent_bill_d_no();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($bill_d_iv_no.equalsIgnoreCase(name)) {
			return bill_d_iv_no();
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			return ar_typ();
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			return xrate_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			return act_rev();
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			return act_seq();
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			return act_d_seq();
		}
		if ($tgt_sw_amt.equalsIgnoreCase(name)) {
			return tgt_sw_amt();
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			return wtax_amt();
		}
		if ($not_appl_wtax_amt.equalsIgnoreCase(name)) {
			return not_appl_wtax_amt();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($bill_d_appl_bal_upd_cntr.equalsIgnoreCase(name)) {
			return bill_d_appl_bal_upd_cntr();
		}
		if ($bill_d_upd_cntr.equalsIgnoreCase(name)) {
			return bill_d_upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			ar_dpt_cd(value);
			return;
		}
		if ($act_no.equalsIgnoreCase(name)) {
			act_no(value);
			return;
		}
		if ($act_d_no.equalsIgnoreCase(name)) {
			act_d_no(value);
			return;
		}
		if ($bill_d_no.equalsIgnoreCase(name)) {
			bill_d_no(value);
			return;
		}
		if ($parent_bill_d_no.equalsIgnoreCase(name)) {
			parent_bill_d_no(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($bill_d_iv_no.equalsIgnoreCase(name)) {
			bill_d_iv_no(value);
			return;
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			ar_typ(value);
			return;
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			xrate_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($tgt_sw_amt.equalsIgnoreCase(name)) {
			tgt_sw_amt(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($not_appl_wtax_amt.equalsIgnoreCase(name)) {
			not_appl_wtax_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($bill_d_appl_bal_upd_cntr.equalsIgnoreCase(name)) {
			bill_d_appl_bal_upd_cntr(value);
			return;
		}
		if ($bill_d_upd_cntr.equalsIgnoreCase(name)) {
			bill_d_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($tgt_sw_amt.equalsIgnoreCase(name)) {
			tgt_sw_amt(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($not_appl_wtax_amt.equalsIgnoreCase(name)) {
			not_appl_wtax_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($bill_d_appl_bal_upd_cntr.equalsIgnoreCase(name)) {
			bill_d_appl_bal_upd_cntr(value);
			return;
		}
		if ($bill_d_upd_cntr.equalsIgnoreCase(name)) {
			bill_d_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($tgt_sw_amt.equalsIgnoreCase(name)) {
			tgt_sw_amt(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($not_appl_wtax_amt.equalsIgnoreCase(name)) {
			not_appl_wtax_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($bill_d_appl_bal_upd_cntr.equalsIgnoreCase(name)) {
			bill_d_appl_bal_upd_cntr(value);
			return;
		}
		if ($bill_d_upd_cntr.equalsIgnoreCase(name)) {
			bill_d_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($tgt_sw_amt.equalsIgnoreCase(name)) {
			tgt_sw_amt(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($not_appl_wtax_amt.equalsIgnoreCase(name)) {
			not_appl_wtax_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($bill_d_appl_bal_upd_cntr.equalsIgnoreCase(name)) {
			bill_d_appl_bal_upd_cntr(value);
			return;
		}
		if ($bill_d_upd_cntr.equalsIgnoreCase(name)) {
			bill_d_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($tgt_sw_amt.equalsIgnoreCase(name)) {
			tgt_sw_amt(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($not_appl_wtax_amt.equalsIgnoreCase(name)) {
			not_appl_wtax_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($bill_d_appl_bal_upd_cntr.equalsIgnoreCase(name)) {
			bill_d_appl_bal_upd_cntr(value);
			return;
		}
		if ($bill_d_upd_cntr.equalsIgnoreCase(name)) {
			bill_d_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			ar_dpt_cd(value);
			return;
		}
		if ($act_no.equalsIgnoreCase(name)) {
			act_no(value);
			return;
		}
		if ($act_d_no.equalsIgnoreCase(name)) {
			act_d_no(value);
			return;
		}
		if ($bill_d_no.equalsIgnoreCase(name)) {
			bill_d_no(value);
			return;
		}
		if ($parent_bill_d_no.equalsIgnoreCase(name)) {
			parent_bill_d_no(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($bill_d_iv_no.equalsIgnoreCase(name)) {
			bill_d_iv_no(value);
			return;
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			ar_typ(value);
			return;
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			xrate_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($tgt_sw_amt.equalsIgnoreCase(name)) {
			tgt_sw_amt(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($not_appl_wtax_amt.equalsIgnoreCase(name)) {
			not_appl_wtax_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($bill_d_appl_bal_upd_cntr.equalsIgnoreCase(name)) {
			bill_d_appl_bal_upd_cntr(value);
			return;
		}
		if ($bill_d_upd_cntr.equalsIgnoreCase(name)) {
			bill_d_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($tgt_sw_amt.equalsIgnoreCase(name)) {
			tgt_sw_amt(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($not_appl_wtax_amt.equalsIgnoreCase(name)) {
			not_appl_wtax_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($bill_d_appl_bal_upd_cntr.equalsIgnoreCase(name)) {
			bill_d_appl_bal_upd_cntr(value);
			return;
		}
		if ($bill_d_upd_cntr.equalsIgnoreCase(name)) {
			bill_d_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($tgt_sw_amt.equalsIgnoreCase(name)) {
			tgt_sw_amt(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($not_appl_wtax_amt.equalsIgnoreCase(name)) {
			not_appl_wtax_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($bill_d_appl_bal_upd_cntr.equalsIgnoreCase(name)) {
			bill_d_appl_bal_upd_cntr(value);
			return;
		}
		if ($bill_d_upd_cntr.equalsIgnoreCase(name)) {
			bill_d_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($tgt_sw_amt.equalsIgnoreCase(name)) {
			tgt_sw_amt(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($not_appl_wtax_amt.equalsIgnoreCase(name)) {
			not_appl_wtax_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($bill_d_appl_bal_upd_cntr.equalsIgnoreCase(name)) {
			bill_d_appl_bal_upd_cntr(value);
			return;
		}
		if ($bill_d_upd_cntr.equalsIgnoreCase(name)) {
			bill_d_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($tgt_sw_amt.equalsIgnoreCase(name)) {
			tgt_sw_amt(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($not_appl_wtax_amt.equalsIgnoreCase(name)) {
			not_appl_wtax_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($bill_d_appl_bal_upd_cntr.equalsIgnoreCase(name)) {
			bill_d_appl_bal_upd_cntr(value);
			return;
		}
		if ($bill_d_upd_cntr.equalsIgnoreCase(name)) {
			bill_d_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

