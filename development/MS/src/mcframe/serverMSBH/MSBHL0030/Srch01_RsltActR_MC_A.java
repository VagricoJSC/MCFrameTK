package mcframe.serverMSBH.MSBHL0030;

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
 * ブロック"Srch01_RsltAct"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_RsltActR_MC_A extends MCConstRow {

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public static final String $ac_ym = "ac_ym";
	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public static final String $slip_sts_typ = "slip_sts_typ";
	/**
	 * Slip status type name 伝票状況区分名.<p>
	 *
	 */
	public static final String $slip_sts_typ_nm = "slip_sts_typ_nm";
	/**
	 * AP settlement type 債務決済区分.<p>
	 *
	 */
	public static final String $ap_sttl_typ = "ap_sttl_typ";
	/**
	 * AP settlement type name 債務決済区分名.<p>
	 *
	 */
	public static final String $ap_sttl_typ_nm = "ap_sttl_typ_nm";
	/**
	 * Payment result No. 支払実績ＮＯ.<p>
	 *
	 */
	public static final String $pay_act_no = "pay_act_no";
	/**
	 * Payment result revision number 支払実績改訂番号.<p>
	 *
	 */
	public static final String $pay_act_rev = "pay_act_rev";
	/**
	 * Payment result details No. 支払実績明細ＮＯ.<p>
	 *
	 */
	public static final String $pay_act_d_no = "pay_act_d_no";
	/**
	 * Payment result details sequence number 支払実績明細連番.<p>
	 *
	 */
	public static final String $pay_act_d_seq = "pay_act_d_seq";
	/**
	 * (Calculation) Payment collation management No. 計算対象支払照合管理ＮＯ.<p>
	 *
	 */
	public static final String $calc_tgt_pay_chk_mng_no = "calc_tgt_pay_chk_mng_no";
	/**
	 * Actual payment date 支払実績日.<p>
	 *
	 */
	public static final String $pay_act_dt = "pay_act_dt";
	/**
	 * Payment base date 支払起算日.<p>
	 *
	 */
	public static final String $pay_basis_dt = "pay_basis_dt";
	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public static final String $trd_cur_amt = "trd_cur_amt";
	/**
	 * Fee amount (Transaction currency) 取引通貨手数料金額.<p>
	 *
	 */
	public static final String $trd_cur_com_paid = "trd_cur_com_paid";
	/**
	 * Fee tax amount (Transaction currency) 取引通貨手数料税額.<p>
	 *
	 */
	public static final String $trd_cur_com_paid_tax_amt = "trd_cur_com_paid_tax_amt";
	/**
	 * Fee cd. (Transaction currency) 取引通貨手数料税ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_com_paid_tax_cd = "trd_cur_com_paid_tax_cd";
	/**
	 * Fee tax name (Transaction currency) 取引通貨手数料税名.<p>
	 *
	 */
	public static final String $trd_cur_com_paid_tax_nm = "trd_cur_com_paid_tax_nm";
	/**
	 * Fee tax rate (Transaction currency) 取引通貨手数料税率.<p>
	 *
	 */
	public static final String $trd_cur_com_paid_tax_rate = "trd_cur_com_paid_tax_rate";
	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public static final String $xrate = "xrate";
	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public static final String $base_cur_amt = "base_cur_amt";
	/**
	 * Fee (Base currency) 基準通貨手数料金額.<p>
	 *
	 */
	public static final String $base_cur_com_paid = "base_cur_com_paid";
	/**
	 * Fee tax amount (Base currency) 基準通貨手数料税額.<p>
	 *
	 */
	public static final String $base_cur_com_paid_tax_amt = "base_cur_com_paid_tax_amt";
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public static final String $trd_d_rmrks = "trd_d_rmrks";
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public static final String $intr_d_rmrks = "intr_d_rmrks";
	/**
	 * Display tax amount on invoice 請求書税額表示.<p>
	 *
	 */
	public static final String $bill_tax_disp_flg = "bill_tax_disp_flg";
	/**
	 * Payment result update counter 支払実績更新カウンタ.<p>
	 *
	 */
	public static final String $pay_act_upd_cntr = "pay_act_upd_cntr";


	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ac_ym_META = createCommonMeta($ac_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta slip_sts_typ_META = createCommonMeta($slip_sts_typ, mcframe.commonMA.meta.MA_META.SLIP_STS_TYP);
	public static final MCMeta slip_sts_typ_nm_META = createCommonMeta($slip_sts_typ_nm, mcframe.commonMA.meta.MA_META.SLIP_STS_TYP_NM);
	public static final MCMeta ap_sttl_typ_META = createCommonMeta($ap_sttl_typ, mcframe.commonMA.meta.MA_META.AP_STTL_TYP);
	public static final MCMeta ap_sttl_typ_nm_META = createCommonMeta($ap_sttl_typ_nm, mcframe.commonMA.meta.MA_META.AP_STTL_TYP_NM);
	public static final MCMeta pay_act_no_META = createCommonMeta($pay_act_no, mcframe.commonMA.meta.MA_META.PAY_ACT_NO);
	public static final MCMeta pay_act_rev_META = createCommonMeta($pay_act_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta pay_act_d_no_META = createCommonMeta($pay_act_d_no, mcframe.commonMA.meta.MA_META.PAY_ACT_D_NO);
	public static final MCMeta pay_act_d_seq_META = createCommonMeta($pay_act_d_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta calc_tgt_pay_chk_mng_no_META = createCommonMeta($calc_tgt_pay_chk_mng_no, mcframe.commonMA.meta.MA_META.PAY_CHK_MNG_NO);
	public static final MCMeta pay_act_dt_META = createCommonMeta($pay_act_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_basis_dt_META = createCommonMeta($pay_basis_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta trd_cur_amt_META = createCommonMeta($trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_com_paid_META = createCommonMeta($trd_cur_com_paid, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_com_paid_tax_amt_META = createCommonMeta($trd_cur_com_paid_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_com_paid_tax_cd_META = createCommonMeta($trd_cur_com_paid_tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta trd_cur_com_paid_tax_nm_META = createCommonMeta($trd_cur_com_paid_tax_nm, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta trd_cur_com_paid_tax_rate_META = createCommonMeta($trd_cur_com_paid_tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta xrate_META = createCommonMeta($xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_amt_META = createCommonMeta($base_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_com_paid_META = createCommonMeta($base_cur_com_paid, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_com_paid_tax_amt_META = createCommonMeta($base_cur_com_paid_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_d_rmrks_META = createCommonMeta($trd_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta intr_d_rmrks_META = createCommonMeta($intr_d_rmrks, mcframe.commonMS.meta.MS_META.PAY_ACT_D_INTR_RMRKS);
	public static final MCMeta bill_tax_disp_flg_META = createCommonMeta($bill_tax_disp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_act_upd_cntr_META = createCommonMeta($pay_act_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);

	protected static final ConstMetaList<Srch01_RsltActR> constMetas = new ConstMetaList<Srch01_RsltActR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ac_dt_META,
			ac_ym_META,
			slip_sts_typ_META,
			slip_sts_typ_nm_META,
			ap_sttl_typ_META,
			ap_sttl_typ_nm_META,
			pay_act_no_META,
			pay_act_rev_META,
			pay_act_d_no_META,
			pay_act_d_seq_META,
			calc_tgt_pay_chk_mng_no_META,
			pay_act_dt_META,
			pay_basis_dt_META,
			trd_cur_amt_META,
			trd_cur_com_paid_META,
			trd_cur_com_paid_tax_amt_META,
			trd_cur_com_paid_tax_cd_META,
			trd_cur_com_paid_tax_nm_META,
			trd_cur_com_paid_tax_rate_META,
			xrate_META,
			base_cur_amt_META,
			base_cur_com_paid_META,
			base_cur_com_paid_tax_amt_META,
			trd_d_rmrks_META,
			intr_d_rmrks_META,
			bill_tax_disp_flg_META,
			pay_act_upd_cntr_META
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
	protected Srch01_RsltActR_MC_A(ConstMetaList<? extends Srch01_RsltActR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltActR clone() {
		return (Srch01_RsltActR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltActR createInstance() {
		return (Srch01_RsltActR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltActR getValues(String... names) {
		return (Srch01_RsltActR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 0, $ac_dt);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 0, $ac_dt, value);
	}


	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public MCDate ac_ym() {
		return getConstDate(offset + 1, $ac_ym);
	}

	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public void ac_ym(MCDate value) {
		setConstDate(offset + 1, $ac_ym, value);
	}


	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public String slip_sts_typ() {
		return getConstString(offset + 2, $slip_sts_typ);
	}

	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public void slip_sts_typ(String value) {
		setConstString(offset + 2, $slip_sts_typ, value);
	}


	/**
	 * Slip status type name 伝票状況区分名.<p>
	 *
	 */
	public String slip_sts_typ_nm() {
		return getConstString(offset + 3, $slip_sts_typ_nm);
	}

	/**
	 * Slip status type name 伝票状況区分名.<p>
	 *
	 */
	public void slip_sts_typ_nm(String value) {
		setConstString(offset + 3, $slip_sts_typ_nm, value);
	}


	/**
	 * AP settlement type 債務決済区分.<p>
	 *
	 */
	public String ap_sttl_typ() {
		return getConstString(offset + 4, $ap_sttl_typ);
	}

	/**
	 * AP settlement type 債務決済区分.<p>
	 *
	 */
	public void ap_sttl_typ(String value) {
		setConstString(offset + 4, $ap_sttl_typ, value);
	}


	/**
	 * AP settlement type name 債務決済区分名.<p>
	 *
	 */
	public String ap_sttl_typ_nm() {
		return getConstString(offset + 5, $ap_sttl_typ_nm);
	}

	/**
	 * AP settlement type name 債務決済区分名.<p>
	 *
	 */
	public void ap_sttl_typ_nm(String value) {
		setConstString(offset + 5, $ap_sttl_typ_nm, value);
	}


	/**
	 * Payment result No. 支払実績ＮＯ.<p>
	 *
	 */
	public String pay_act_no() {
		return getConstString(offset + 6, $pay_act_no);
	}

	/**
	 * Payment result No. 支払実績ＮＯ.<p>
	 *
	 */
	public void pay_act_no(String value) {
		setConstString(offset + 6, $pay_act_no, value);
	}


	/**
	 * Payment result revision number 支払実績改訂番号.<p>
	 *
	 */
	public MCNumber pay_act_rev() {
		return getConstNumber(offset + 7, $pay_act_rev);
	}

	/**
	 * Payment result revision number 支払実績改訂番号.<p>
	 *
	 */
	public void pay_act_rev(MCNumber value) {
		setConstNumber(offset + 7, $pay_act_rev, value);
	}

	/**
	 * Payment result revision number 支払実績改訂番号.<p>
	 *
	 */
	public void pay_act_rev(int value) {
		setConstNumber(offset + 7, $pay_act_rev, value);
	}

	/**
	 * Payment result revision number 支払実績改訂番号.<p>
	 *
	 */
	public void pay_act_rev(long value) {
		setConstNumber(offset + 7, $pay_act_rev, value);
	}

	/**
	 * Payment result revision number 支払実績改訂番号.<p>
	 *
	 */
	public void pay_act_rev(float value) {
		setConstNumber(offset + 7, $pay_act_rev, value);
	}

	/**
	 * Payment result revision number 支払実績改訂番号.<p>
	 *
	 */
	public void pay_act_rev(double value) {
		setConstNumber(offset + 7, $pay_act_rev, value);
	}


	/**
	 * Payment result details No. 支払実績明細ＮＯ.<p>
	 *
	 */
	public String pay_act_d_no() {
		return getConstString(offset + 8, $pay_act_d_no);
	}

	/**
	 * Payment result details No. 支払実績明細ＮＯ.<p>
	 *
	 */
	public void pay_act_d_no(String value) {
		setConstString(offset + 8, $pay_act_d_no, value);
	}


	/**
	 * Payment result details sequence number 支払実績明細連番.<p>
	 *
	 */
	public MCNumber pay_act_d_seq() {
		return getConstNumber(offset + 9, $pay_act_d_seq);
	}

	/**
	 * Payment result details sequence number 支払実績明細連番.<p>
	 *
	 */
	public void pay_act_d_seq(MCNumber value) {
		setConstNumber(offset + 9, $pay_act_d_seq, value);
	}

	/**
	 * Payment result details sequence number 支払実績明細連番.<p>
	 *
	 */
	public void pay_act_d_seq(int value) {
		setConstNumber(offset + 9, $pay_act_d_seq, value);
	}

	/**
	 * Payment result details sequence number 支払実績明細連番.<p>
	 *
	 */
	public void pay_act_d_seq(long value) {
		setConstNumber(offset + 9, $pay_act_d_seq, value);
	}

	/**
	 * Payment result details sequence number 支払実績明細連番.<p>
	 *
	 */
	public void pay_act_d_seq(float value) {
		setConstNumber(offset + 9, $pay_act_d_seq, value);
	}

	/**
	 * Payment result details sequence number 支払実績明細連番.<p>
	 *
	 */
	public void pay_act_d_seq(double value) {
		setConstNumber(offset + 9, $pay_act_d_seq, value);
	}


	/**
	 * (Calculation) Payment collation management No. 計算対象支払照合管理ＮＯ.<p>
	 *
	 */
	public String calc_tgt_pay_chk_mng_no() {
		return getConstString(offset + 10, $calc_tgt_pay_chk_mng_no);
	}

	/**
	 * (Calculation) Payment collation management No. 計算対象支払照合管理ＮＯ.<p>
	 *
	 */
	public void calc_tgt_pay_chk_mng_no(String value) {
		setConstString(offset + 10, $calc_tgt_pay_chk_mng_no, value);
	}


	/**
	 * Actual payment date 支払実績日.<p>
	 *
	 */
	public MCDate pay_act_dt() {
		return getConstDate(offset + 11, $pay_act_dt);
	}

	/**
	 * Actual payment date 支払実績日.<p>
	 *
	 */
	public void pay_act_dt(MCDate value) {
		setConstDate(offset + 11, $pay_act_dt, value);
	}


	/**
	 * Payment base date 支払起算日.<p>
	 *
	 */
	public MCDate pay_basis_dt() {
		return getConstDate(offset + 12, $pay_basis_dt);
	}

	/**
	 * Payment base date 支払起算日.<p>
	 *
	 */
	public void pay_basis_dt(MCDate value) {
		setConstDate(offset + 12, $pay_basis_dt, value);
	}


	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return getConstNumber(offset + 13, $trd_cur_amt);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 13, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		setConstNumber(offset + 13, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		setConstNumber(offset + 13, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		setConstNumber(offset + 13, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		setConstNumber(offset + 13, $trd_cur_amt, value);
	}


	/**
	 * Fee amount (Transaction currency) 取引通貨手数料金額.<p>
	 *
	 */
	public MCNumber trd_cur_com_paid() {
		return getConstNumber(offset + 14, $trd_cur_com_paid);
	}

	/**
	 * Fee amount (Transaction currency) 取引通貨手数料金額.<p>
	 *
	 */
	public void trd_cur_com_paid(MCNumber value) {
		setConstNumber(offset + 14, $trd_cur_com_paid, value);
	}

	/**
	 * Fee amount (Transaction currency) 取引通貨手数料金額.<p>
	 *
	 */
	public void trd_cur_com_paid(int value) {
		setConstNumber(offset + 14, $trd_cur_com_paid, value);
	}

	/**
	 * Fee amount (Transaction currency) 取引通貨手数料金額.<p>
	 *
	 */
	public void trd_cur_com_paid(long value) {
		setConstNumber(offset + 14, $trd_cur_com_paid, value);
	}

	/**
	 * Fee amount (Transaction currency) 取引通貨手数料金額.<p>
	 *
	 */
	public void trd_cur_com_paid(float value) {
		setConstNumber(offset + 14, $trd_cur_com_paid, value);
	}

	/**
	 * Fee amount (Transaction currency) 取引通貨手数料金額.<p>
	 *
	 */
	public void trd_cur_com_paid(double value) {
		setConstNumber(offset + 14, $trd_cur_com_paid, value);
	}


	/**
	 * Fee tax amount (Transaction currency) 取引通貨手数料税額.<p>
	 *
	 */
	public MCNumber trd_cur_com_paid_tax_amt() {
		return getConstNumber(offset + 15, $trd_cur_com_paid_tax_amt);
	}

	/**
	 * Fee tax amount (Transaction currency) 取引通貨手数料税額.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_amt(MCNumber value) {
		setConstNumber(offset + 15, $trd_cur_com_paid_tax_amt, value);
	}

	/**
	 * Fee tax amount (Transaction currency) 取引通貨手数料税額.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_amt(int value) {
		setConstNumber(offset + 15, $trd_cur_com_paid_tax_amt, value);
	}

	/**
	 * Fee tax amount (Transaction currency) 取引通貨手数料税額.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_amt(long value) {
		setConstNumber(offset + 15, $trd_cur_com_paid_tax_amt, value);
	}

	/**
	 * Fee tax amount (Transaction currency) 取引通貨手数料税額.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_amt(float value) {
		setConstNumber(offset + 15, $trd_cur_com_paid_tax_amt, value);
	}

	/**
	 * Fee tax amount (Transaction currency) 取引通貨手数料税額.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_amt(double value) {
		setConstNumber(offset + 15, $trd_cur_com_paid_tax_amt, value);
	}


	/**
	 * Fee cd. (Transaction currency) 取引通貨手数料税ＣＤ.<p>
	 *
	 */
	public String trd_cur_com_paid_tax_cd() {
		return getConstString(offset + 16, $trd_cur_com_paid_tax_cd);
	}

	/**
	 * Fee cd. (Transaction currency) 取引通貨手数料税ＣＤ.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_cd(String value) {
		setConstString(offset + 16, $trd_cur_com_paid_tax_cd, value);
	}


	/**
	 * Fee tax name (Transaction currency) 取引通貨手数料税名.<p>
	 *
	 */
	public String trd_cur_com_paid_tax_nm() {
		return getConstString(offset + 17, $trd_cur_com_paid_tax_nm);
	}

	/**
	 * Fee tax name (Transaction currency) 取引通貨手数料税名.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_nm(String value) {
		setConstString(offset + 17, $trd_cur_com_paid_tax_nm, value);
	}


	/**
	 * Fee tax rate (Transaction currency) 取引通貨手数料税率.<p>
	 *
	 */
	public MCNumber trd_cur_com_paid_tax_rate() {
		return getConstNumber(offset + 18, $trd_cur_com_paid_tax_rate);
	}

	/**
	 * Fee tax rate (Transaction currency) 取引通貨手数料税率.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_rate(MCNumber value) {
		setConstNumber(offset + 18, $trd_cur_com_paid_tax_rate, value);
	}

	/**
	 * Fee tax rate (Transaction currency) 取引通貨手数料税率.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_rate(int value) {
		setConstNumber(offset + 18, $trd_cur_com_paid_tax_rate, value);
	}

	/**
	 * Fee tax rate (Transaction currency) 取引通貨手数料税率.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_rate(long value) {
		setConstNumber(offset + 18, $trd_cur_com_paid_tax_rate, value);
	}

	/**
	 * Fee tax rate (Transaction currency) 取引通貨手数料税率.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_rate(float value) {
		setConstNumber(offset + 18, $trd_cur_com_paid_tax_rate, value);
	}

	/**
	 * Fee tax rate (Transaction currency) 取引通貨手数料税率.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_rate(double value) {
		setConstNumber(offset + 18, $trd_cur_com_paid_tax_rate, value);
	}


	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCNumber xrate() {
		return getConstNumber(offset + 19, $xrate);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		setConstNumber(offset + 19, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(int value) {
		setConstNumber(offset + 19, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(long value) {
		setConstNumber(offset + 19, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(float value) {
		setConstNumber(offset + 19, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(double value) {
		setConstNumber(offset + 19, $xrate, value);
	}


	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public MCNumber base_cur_amt() {
		return getConstNumber(offset + 20, $base_cur_amt);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(MCNumber value) {
		setConstNumber(offset + 20, $base_cur_amt, value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(int value) {
		setConstNumber(offset + 20, $base_cur_amt, value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(long value) {
		setConstNumber(offset + 20, $base_cur_amt, value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(float value) {
		setConstNumber(offset + 20, $base_cur_amt, value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(double value) {
		setConstNumber(offset + 20, $base_cur_amt, value);
	}


	/**
	 * Fee (Base currency) 基準通貨手数料金額.<p>
	 *
	 */
	public MCNumber base_cur_com_paid() {
		return getConstNumber(offset + 21, $base_cur_com_paid);
	}

	/**
	 * Fee (Base currency) 基準通貨手数料金額.<p>
	 *
	 */
	public void base_cur_com_paid(MCNumber value) {
		setConstNumber(offset + 21, $base_cur_com_paid, value);
	}

	/**
	 * Fee (Base currency) 基準通貨手数料金額.<p>
	 *
	 */
	public void base_cur_com_paid(int value) {
		setConstNumber(offset + 21, $base_cur_com_paid, value);
	}

	/**
	 * Fee (Base currency) 基準通貨手数料金額.<p>
	 *
	 */
	public void base_cur_com_paid(long value) {
		setConstNumber(offset + 21, $base_cur_com_paid, value);
	}

	/**
	 * Fee (Base currency) 基準通貨手数料金額.<p>
	 *
	 */
	public void base_cur_com_paid(float value) {
		setConstNumber(offset + 21, $base_cur_com_paid, value);
	}

	/**
	 * Fee (Base currency) 基準通貨手数料金額.<p>
	 *
	 */
	public void base_cur_com_paid(double value) {
		setConstNumber(offset + 21, $base_cur_com_paid, value);
	}


	/**
	 * Fee tax amount (Base currency) 基準通貨手数料税額.<p>
	 *
	 */
	public MCNumber base_cur_com_paid_tax_amt() {
		return getConstNumber(offset + 22, $base_cur_com_paid_tax_amt);
	}

	/**
	 * Fee tax amount (Base currency) 基準通貨手数料税額.<p>
	 *
	 */
	public void base_cur_com_paid_tax_amt(MCNumber value) {
		setConstNumber(offset + 22, $base_cur_com_paid_tax_amt, value);
	}

	/**
	 * Fee tax amount (Base currency) 基準通貨手数料税額.<p>
	 *
	 */
	public void base_cur_com_paid_tax_amt(int value) {
		setConstNumber(offset + 22, $base_cur_com_paid_tax_amt, value);
	}

	/**
	 * Fee tax amount (Base currency) 基準通貨手数料税額.<p>
	 *
	 */
	public void base_cur_com_paid_tax_amt(long value) {
		setConstNumber(offset + 22, $base_cur_com_paid_tax_amt, value);
	}

	/**
	 * Fee tax amount (Base currency) 基準通貨手数料税額.<p>
	 *
	 */
	public void base_cur_com_paid_tax_amt(float value) {
		setConstNumber(offset + 22, $base_cur_com_paid_tax_amt, value);
	}

	/**
	 * Fee tax amount (Base currency) 基準通貨手数料税額.<p>
	 *
	 */
	public void base_cur_com_paid_tax_amt(double value) {
		setConstNumber(offset + 22, $base_cur_com_paid_tax_amt, value);
	}


	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return getConstString(offset + 23, $trd_d_rmrks);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		setConstString(offset + 23, $trd_d_rmrks, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_d_rmrks() {
		return getConstString(offset + 24, $intr_d_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_d_rmrks(String value) {
		setConstString(offset + 24, $intr_d_rmrks, value);
	}


	/**
	 * Display tax amount on invoice 請求書税額表示.<p>
	 *
	 */
	public boolean bill_tax_disp_flg() {
		return getConstBoolean(offset + 25, $bill_tax_disp_flg);
	}

	/**
	 * Display tax amount on invoice 請求書税額表示.<p>
	 *
	 */
	public void bill_tax_disp_flg(boolean value) {
		setConstBoolean(offset + 25, $bill_tax_disp_flg, value);
	}


	/**
	 * Payment result update counter 支払実績更新カウンタ.<p>
	 *
	 */
	public MCNumber pay_act_upd_cntr() {
		return getConstNumber(offset + 26, $pay_act_upd_cntr);
	}

	/**
	 * Payment result update counter 支払実績更新カウンタ.<p>
	 *
	 */
	public void pay_act_upd_cntr(MCNumber value) {
		setConstNumber(offset + 26, $pay_act_upd_cntr, value);
	}

	/**
	 * Payment result update counter 支払実績更新カウンタ.<p>
	 *
	 */
	public void pay_act_upd_cntr(int value) {
		setConstNumber(offset + 26, $pay_act_upd_cntr, value);
	}

	/**
	 * Payment result update counter 支払実績更新カウンタ.<p>
	 *
	 */
	public void pay_act_upd_cntr(long value) {
		setConstNumber(offset + 26, $pay_act_upd_cntr, value);
	}

	/**
	 * Payment result update counter 支払実績更新カウンタ.<p>
	 *
	 */
	public void pay_act_upd_cntr(float value) {
		setConstNumber(offset + 26, $pay_act_upd_cntr, value);
	}

	/**
	 * Payment result update counter 支払実績更新カウンタ.<p>
	 *
	 */
	public void pay_act_upd_cntr(double value) {
		setConstNumber(offset + 26, $pay_act_upd_cntr, value);
	}


	public String getString(String name) {
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			return slip_sts_typ();
		}
		if ($slip_sts_typ_nm.equalsIgnoreCase(name)) {
			return slip_sts_typ_nm();
		}
		if ($ap_sttl_typ.equalsIgnoreCase(name)) {
			return ap_sttl_typ();
		}
		if ($ap_sttl_typ_nm.equalsIgnoreCase(name)) {
			return ap_sttl_typ_nm();
		}
		if ($pay_act_no.equalsIgnoreCase(name)) {
			return pay_act_no();
		}
		if ($pay_act_d_no.equalsIgnoreCase(name)) {
			return pay_act_d_no();
		}
		if ($calc_tgt_pay_chk_mng_no.equalsIgnoreCase(name)) {
			return calc_tgt_pay_chk_mng_no();
		}
		if ($trd_cur_com_paid_tax_cd.equalsIgnoreCase(name)) {
			return trd_cur_com_paid_tax_cd();
		}
		if ($trd_cur_com_paid_tax_nm.equalsIgnoreCase(name)) {
			return trd_cur_com_paid_tax_nm();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			return intr_d_rmrks();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($pay_act_rev.equalsIgnoreCase(name)) {
			return pay_act_rev();
		}
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			return pay_act_d_seq();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_com_paid.equalsIgnoreCase(name)) {
			return trd_cur_com_paid();
		}
		if ($trd_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_com_paid_tax_amt();
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			return trd_cur_com_paid_tax_rate();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			return base_cur_amt();
		}
		if ($base_cur_com_paid.equalsIgnoreCase(name)) {
			return base_cur_com_paid();
		}
		if ($base_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_com_paid_tax_amt();
		}
		if ($pay_act_upd_cntr.equalsIgnoreCase(name)) {
			return pay_act_upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
		}
		if ($pay_act_dt.equalsIgnoreCase(name)) {
			return pay_act_dt();
		}
		if ($pay_basis_dt.equalsIgnoreCase(name)) {
			return pay_basis_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($bill_tax_disp_flg.equalsIgnoreCase(name)) {
			return bill_tax_disp_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			return slip_sts_typ();
		}
		if ($slip_sts_typ_nm.equalsIgnoreCase(name)) {
			return slip_sts_typ_nm();
		}
		if ($ap_sttl_typ.equalsIgnoreCase(name)) {
			return ap_sttl_typ();
		}
		if ($ap_sttl_typ_nm.equalsIgnoreCase(name)) {
			return ap_sttl_typ_nm();
		}
		if ($pay_act_no.equalsIgnoreCase(name)) {
			return pay_act_no();
		}
		if ($pay_act_d_no.equalsIgnoreCase(name)) {
			return pay_act_d_no();
		}
		if ($calc_tgt_pay_chk_mng_no.equalsIgnoreCase(name)) {
			return calc_tgt_pay_chk_mng_no();
		}
		if ($trd_cur_com_paid_tax_cd.equalsIgnoreCase(name)) {
			return trd_cur_com_paid_tax_cd();
		}
		if ($trd_cur_com_paid_tax_nm.equalsIgnoreCase(name)) {
			return trd_cur_com_paid_tax_nm();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			return intr_d_rmrks();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($pay_act_rev.equalsIgnoreCase(name)) {
			return pay_act_rev();
		}
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			return pay_act_d_seq();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_com_paid.equalsIgnoreCase(name)) {
			return trd_cur_com_paid();
		}
		if ($trd_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_com_paid_tax_amt();
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			return trd_cur_com_paid_tax_rate();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			return base_cur_amt();
		}
		if ($base_cur_com_paid.equalsIgnoreCase(name)) {
			return base_cur_com_paid();
		}
		if ($base_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_com_paid_tax_amt();
		}
		if ($pay_act_upd_cntr.equalsIgnoreCase(name)) {
			return pay_act_upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
		}
		if ($pay_act_dt.equalsIgnoreCase(name)) {
			return pay_act_dt();
		}
		if ($pay_basis_dt.equalsIgnoreCase(name)) {
			return pay_basis_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($bill_tax_disp_flg.equalsIgnoreCase(name)) {
			return bill_tax_disp_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			slip_sts_typ(value);
			return;
		}
		if ($slip_sts_typ_nm.equalsIgnoreCase(name)) {
			slip_sts_typ_nm(value);
			return;
		}
		if ($ap_sttl_typ.equalsIgnoreCase(name)) {
			ap_sttl_typ(value);
			return;
		}
		if ($ap_sttl_typ_nm.equalsIgnoreCase(name)) {
			ap_sttl_typ_nm(value);
			return;
		}
		if ($pay_act_no.equalsIgnoreCase(name)) {
			pay_act_no(value);
			return;
		}
		if ($pay_act_d_no.equalsIgnoreCase(name)) {
			pay_act_d_no(value);
			return;
		}
		if ($calc_tgt_pay_chk_mng_no.equalsIgnoreCase(name)) {
			calc_tgt_pay_chk_mng_no(value);
			return;
		}
		if ($trd_cur_com_paid_tax_cd.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_cd(value);
			return;
		}
		if ($trd_cur_com_paid_tax_nm.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_nm(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			intr_d_rmrks(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($pay_act_rev.equalsIgnoreCase(name)) {
			pay_act_rev(value);
			return;
		}
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			pay_act_d_seq(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_com_paid.equalsIgnoreCase(name)) {
			trd_cur_com_paid(value);
			return;
		}
		if ($trd_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_amt(value);
			return;
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_com_paid.equalsIgnoreCase(name)) {
			base_cur_com_paid(value);
			return;
		}
		if ($base_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			base_cur_com_paid_tax_amt(value);
			return;
		}
		if ($pay_act_upd_cntr.equalsIgnoreCase(name)) {
			pay_act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($pay_act_rev.equalsIgnoreCase(name)) {
			pay_act_rev(value);
			return;
		}
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			pay_act_d_seq(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_com_paid.equalsIgnoreCase(name)) {
			trd_cur_com_paid(value);
			return;
		}
		if ($trd_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_amt(value);
			return;
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_com_paid.equalsIgnoreCase(name)) {
			base_cur_com_paid(value);
			return;
		}
		if ($base_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			base_cur_com_paid_tax_amt(value);
			return;
		}
		if ($pay_act_upd_cntr.equalsIgnoreCase(name)) {
			pay_act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($pay_act_rev.equalsIgnoreCase(name)) {
			pay_act_rev(value);
			return;
		}
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			pay_act_d_seq(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_com_paid.equalsIgnoreCase(name)) {
			trd_cur_com_paid(value);
			return;
		}
		if ($trd_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_amt(value);
			return;
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_com_paid.equalsIgnoreCase(name)) {
			base_cur_com_paid(value);
			return;
		}
		if ($base_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			base_cur_com_paid_tax_amt(value);
			return;
		}
		if ($pay_act_upd_cntr.equalsIgnoreCase(name)) {
			pay_act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($pay_act_rev.equalsIgnoreCase(name)) {
			pay_act_rev(value);
			return;
		}
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			pay_act_d_seq(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_com_paid.equalsIgnoreCase(name)) {
			trd_cur_com_paid(value);
			return;
		}
		if ($trd_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_amt(value);
			return;
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_com_paid.equalsIgnoreCase(name)) {
			base_cur_com_paid(value);
			return;
		}
		if ($base_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			base_cur_com_paid_tax_amt(value);
			return;
		}
		if ($pay_act_upd_cntr.equalsIgnoreCase(name)) {
			pay_act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($pay_act_rev.equalsIgnoreCase(name)) {
			pay_act_rev(value);
			return;
		}
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			pay_act_d_seq(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_com_paid.equalsIgnoreCase(name)) {
			trd_cur_com_paid(value);
			return;
		}
		if ($trd_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_amt(value);
			return;
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_com_paid.equalsIgnoreCase(name)) {
			base_cur_com_paid(value);
			return;
		}
		if ($base_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			base_cur_com_paid_tax_amt(value);
			return;
		}
		if ($pay_act_upd_cntr.equalsIgnoreCase(name)) {
			pay_act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
			return;
		}
		if ($pay_act_dt.equalsIgnoreCase(name)) {
			pay_act_dt(value);
			return;
		}
		if ($pay_basis_dt.equalsIgnoreCase(name)) {
			pay_basis_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($bill_tax_disp_flg.equalsIgnoreCase(name)) {
			bill_tax_disp_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			slip_sts_typ(value);
			return;
		}
		if ($slip_sts_typ_nm.equalsIgnoreCase(name)) {
			slip_sts_typ_nm(value);
			return;
		}
		if ($ap_sttl_typ.equalsIgnoreCase(name)) {
			ap_sttl_typ(value);
			return;
		}
		if ($ap_sttl_typ_nm.equalsIgnoreCase(name)) {
			ap_sttl_typ_nm(value);
			return;
		}
		if ($pay_act_no.equalsIgnoreCase(name)) {
			pay_act_no(value);
			return;
		}
		if ($pay_act_d_no.equalsIgnoreCase(name)) {
			pay_act_d_no(value);
			return;
		}
		if ($calc_tgt_pay_chk_mng_no.equalsIgnoreCase(name)) {
			calc_tgt_pay_chk_mng_no(value);
			return;
		}
		if ($trd_cur_com_paid_tax_cd.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_cd(value);
			return;
		}
		if ($trd_cur_com_paid_tax_nm.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_nm(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			intr_d_rmrks(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($pay_act_rev.equalsIgnoreCase(name)) {
			pay_act_rev(value);
			return;
		}
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			pay_act_d_seq(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_com_paid.equalsIgnoreCase(name)) {
			trd_cur_com_paid(value);
			return;
		}
		if ($trd_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_amt(value);
			return;
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_com_paid.equalsIgnoreCase(name)) {
			base_cur_com_paid(value);
			return;
		}
		if ($base_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			base_cur_com_paid_tax_amt(value);
			return;
		}
		if ($pay_act_upd_cntr.equalsIgnoreCase(name)) {
			pay_act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($pay_act_rev.equalsIgnoreCase(name)) {
			pay_act_rev(value);
			return;
		}
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			pay_act_d_seq(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_com_paid.equalsIgnoreCase(name)) {
			trd_cur_com_paid(value);
			return;
		}
		if ($trd_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_amt(value);
			return;
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_com_paid.equalsIgnoreCase(name)) {
			base_cur_com_paid(value);
			return;
		}
		if ($base_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			base_cur_com_paid_tax_amt(value);
			return;
		}
		if ($pay_act_upd_cntr.equalsIgnoreCase(name)) {
			pay_act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($pay_act_rev.equalsIgnoreCase(name)) {
			pay_act_rev(value);
			return;
		}
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			pay_act_d_seq(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_com_paid.equalsIgnoreCase(name)) {
			trd_cur_com_paid(value);
			return;
		}
		if ($trd_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_amt(value);
			return;
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_com_paid.equalsIgnoreCase(name)) {
			base_cur_com_paid(value);
			return;
		}
		if ($base_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			base_cur_com_paid_tax_amt(value);
			return;
		}
		if ($pay_act_upd_cntr.equalsIgnoreCase(name)) {
			pay_act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($pay_act_rev.equalsIgnoreCase(name)) {
			pay_act_rev(value);
			return;
		}
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			pay_act_d_seq(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_com_paid.equalsIgnoreCase(name)) {
			trd_cur_com_paid(value);
			return;
		}
		if ($trd_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_amt(value);
			return;
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_com_paid.equalsIgnoreCase(name)) {
			base_cur_com_paid(value);
			return;
		}
		if ($base_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			base_cur_com_paid_tax_amt(value);
			return;
		}
		if ($pay_act_upd_cntr.equalsIgnoreCase(name)) {
			pay_act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($pay_act_rev.equalsIgnoreCase(name)) {
			pay_act_rev(value);
			return;
		}
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			pay_act_d_seq(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_com_paid.equalsIgnoreCase(name)) {
			trd_cur_com_paid(value);
			return;
		}
		if ($trd_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_amt(value);
			return;
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_com_paid.equalsIgnoreCase(name)) {
			base_cur_com_paid(value);
			return;
		}
		if ($base_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			base_cur_com_paid_tax_amt(value);
			return;
		}
		if ($pay_act_upd_cntr.equalsIgnoreCase(name)) {
			pay_act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
			return;
		}
		if ($pay_act_dt.equalsIgnoreCase(name)) {
			pay_act_dt(value);
			return;
		}
		if ($pay_basis_dt.equalsIgnoreCase(name)) {
			pay_basis_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($bill_tax_disp_flg.equalsIgnoreCase(name)) {
			bill_tax_disp_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

