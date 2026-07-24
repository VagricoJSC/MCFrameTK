package mcframe.serverMSBG.MSBGL5010;

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
 * ブロック"ArCmn_Upd01_BillGrp"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ArCmn_Upd01_BillGrpR_MC_A extends MCConstRow {

	/**
	 * Billing management No. 請求管理ＮＯ.<p>
	 *
	 */
	public static final String $bill_mng_no = "bill_mng_no";
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
	 * Billing closing day 請求締年月日.<p>
	 *
	 */
	public static final String $bill_cl_dt = "bill_cl_dt";
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
	/**
	 * Billing invoice No. 請求インボイスＮＯ.<p>
	 *
	 */
	public static final String $bill_iv_no = "bill_iv_no";
	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public static final String $wrk_no = "wrk_no";
	/**
	 * Billing exchange rate 請求為替レート.<p>
	 *
	 */
	public static final String $bill_xrate = "bill_xrate";
	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public static final String $slip_sts_typ = "slip_sts_typ";
	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public static final String $rcv_schd_dt = "rcv_schd_dt";
	/**
	 * Billing base date 請求起算日.<p>
	 *
	 */
	public static final String $bill_basis_dt = "bill_basis_dt";
	/**
	 * Payment received method cd. 入金方法ＣＤ.<p>
	 *
	 */
	public static final String $rcv_mtd_cd = "rcv_mtd_cd";
	/**
	 * Sales amount 売上金額.<p>
	 *
	 */
	public static final String $sls_amt = "sls_amt";
	/**
	 * Return amount 返品金額.<p>
	 *
	 */
	public static final String $ret_amt = "ret_amt";
	/**
	 * Discount amount 値引金額.<p>
	 *
	 */
	public static final String $dscnt_amt = "dscnt_amt";
	/**
	 * Transfer amount (Transfer destination) 振替金額(振替先).<p>
	 *
	 */
	public static final String $sw_to_amt = "sw_to_amt";
	/**
	 * Cash amount 現金金額.<p>
	 *
	 */
	public static final String $cash_amt = "cash_amt";
	/**
	 * Note amount 手形金額.<p>
	 *
	 */
	public static final String $note_amt = "note_amt";
	/**
	 * Transfer payment amount 振込金額.<p>
	 *
	 */
	public static final String $xfr_amt = "xfr_amt";
	/**
	 * Offset amount 相殺金額.<p>
	 *
	 */
	public static final String $setoff_amt = "setoff_amt";
	/**
	 * Offset tax amount 相殺税金額.<p>
	 *
	 */
	public static final String $setoff_tax_amt = "setoff_tax_amt";
	/**
	 * Transfer amount 振替金額.<p>
	 *
	 */
	public static final String $sw_amt = "sw_amt";
	/**
	 * Tax amount 税金額.<p>
	 *
	 */
	public static final String $tax_amt = "tax_amt";
	/**
	 * Sales amount (Base currency) 基準通貨売上金額.<p>
	 *
	 */
	public static final String $base_cur_sls_amt = "base_cur_sls_amt";
	/**
	 * Return amount (Base currency) 基準通貨返品金額.<p>
	 *
	 */
	public static final String $base_cur_ret_amt = "base_cur_ret_amt";
	/**
	 * Discount amount (Base currency) 基準通貨値引金額.<p>
	 *
	 */
	public static final String $base_cur_dscnt_amt = "base_cur_dscnt_amt";
	/**
	 * Transfer amount (Transfer source) (Base currency) 基準通貨振替金額(振替先).<p>
	 *
	 */
	public static final String $base_cur_sw_to_amt = "base_cur_sw_to_amt";
	/**
	 * Cash amount (Base currency) 基準通貨現金金額.<p>
	 *
	 */
	public static final String $base_cur_cash_amt = "base_cur_cash_amt";
	/**
	 * Notes amount (Base currency) 基準通貨手形金額.<p>
	 *
	 */
	public static final String $base_cur_note_amt = "base_cur_note_amt";
	/**
	 * Transfer payment amount (Base currency) 基準通貨振込金額.<p>
	 *
	 */
	public static final String $base_cur_xfr_amt = "base_cur_xfr_amt";
	/**
	 * Offset amount (Base currency) 基準通貨相殺金額.<p>
	 *
	 */
	public static final String $base_cur_setoff_amt = "base_cur_setoff_amt";
	/**
	 * Offset tax amount (Base currency) 基準通貨相殺税金額.<p>
	 *
	 */
	public static final String $base_cur_setoff_tax_amt = "base_cur_setoff_tax_amt";
	/**
	 * Transfer amount (Base currency) 基準通貨振替金額.<p>
	 *
	 */
	public static final String $base_cur_sw_amt = "base_cur_sw_amt";
	/**
	 * Tax amount (Base currency) 基準通貨税金額.<p>
	 *
	 */
	public static final String $base_cur_tax_amt = "base_cur_tax_amt";
	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public static final String $wtax_amt = "wtax_amt";


	public static final MCMeta bill_mng_no_META = createCommonMeta($bill_mng_no, mcframe.commonMA.meta.MA_META.BILL_MNG_NO);
	public static final MCMeta bcst_cd_META = createCommonMeta($bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bill_dpt_cd_META = createCommonMeta($bill_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bill_cl_dt_META = createCommonMeta($bill_cl_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta bill_iv_no_META = createCommonMeta($bill_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta bill_xrate_META = createCommonMeta($bill_xrate, mcframe.commonMA.meta.MA_META.XRATE);
	public static final MCMeta slip_sts_typ_META = createCommonMeta($slip_sts_typ, mcframe.commonMA.meta.MA_META.SLIP_STS_TYP);
	public static final MCMeta rcv_schd_dt_META = createCommonMeta($rcv_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bill_basis_dt_META = createCommonMeta($bill_basis_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rcv_mtd_cd_META = createCommonMeta($rcv_mtd_cd, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta sls_amt_META = createCommonMeta($sls_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ret_amt_META = createCommonMeta($ret_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta dscnt_amt_META = createCommonMeta($dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sw_to_amt_META = createCommonMeta($sw_to_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta cash_amt_META = createCommonMeta($cash_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta note_amt_META = createCommonMeta($note_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta xfr_amt_META = createCommonMeta($xfr_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta setoff_amt_META = createCommonMeta($setoff_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta setoff_tax_amt_META = createCommonMeta($setoff_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sw_amt_META = createCommonMeta($sw_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_amt_META = createCommonMeta($tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_sls_amt_META = createCommonMeta($base_cur_sls_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_ret_amt_META = createCommonMeta($base_cur_ret_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_dscnt_amt_META = createCommonMeta($base_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_sw_to_amt_META = createCommonMeta($base_cur_sw_to_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_cash_amt_META = createCommonMeta($base_cur_cash_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_note_amt_META = createCommonMeta($base_cur_note_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_xfr_amt_META = createCommonMeta($base_cur_xfr_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_setoff_amt_META = createCommonMeta($base_cur_setoff_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_setoff_tax_amt_META = createCommonMeta($base_cur_setoff_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_sw_amt_META = createCommonMeta($base_cur_sw_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_tax_amt_META = createCommonMeta($base_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta wtax_amt_META = createCommonMeta($wtax_amt, mcframe.commonMA.meta.MA_META.MONEY);

	protected static final ConstMetaList<ArCmn_Upd01_BillGrpR> constMetas = new ConstMetaList<ArCmn_Upd01_BillGrpR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			bill_mng_no_META,
			bcst_cd_META,
			bill_dpt_cd_META,
			bill_cl_dt_META,
			iv_no_META,
			bill_iv_no_META,
			trd_cur_cd_META,
			wrk_no_META,
			bill_xrate_META,
			slip_sts_typ_META,
			rcv_schd_dt_META,
			bill_basis_dt_META,
			rcv_mtd_cd_META,
			sls_amt_META,
			ret_amt_META,
			dscnt_amt_META,
			sw_to_amt_META,
			cash_amt_META,
			note_amt_META,
			xfr_amt_META,
			setoff_amt_META,
			setoff_tax_amt_META,
			sw_amt_META,
			tax_amt_META,
			base_cur_sls_amt_META,
			base_cur_ret_amt_META,
			base_cur_dscnt_amt_META,
			base_cur_sw_to_amt_META,
			base_cur_cash_amt_META,
			base_cur_note_amt_META,
			base_cur_xfr_amt_META,
			base_cur_setoff_amt_META,
			base_cur_setoff_tax_amt_META,
			base_cur_sw_amt_META,
			base_cur_tax_amt_META,
			wtax_amt_META
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
	protected ArCmn_Upd01_BillGrpR_MC_A(ConstMetaList<? extends ArCmn_Upd01_BillGrpR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ArCmn_Upd01_BillGrpR clone() {
		return (ArCmn_Upd01_BillGrpR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ArCmn_Upd01_BillGrpR createInstance() {
		return (ArCmn_Upd01_BillGrpR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ArCmn_Upd01_BillGrpR getValues(String... names) {
		return (ArCmn_Upd01_BillGrpR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Billing management No. 請求管理ＮＯ.<p>
	 *
	 */
	public String bill_mng_no() {
		return getConstString(offset + 0, $bill_mng_no);
	}

	/**
	 * Billing management No. 請求管理ＮＯ.<p>
	 *
	 */
	public void bill_mng_no(String value) {
		setConstString(offset + 0, $bill_mng_no, value);
	}


	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public String bcst_cd() {
		return getConstString(offset + 1, $bcst_cd);
	}

	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public void bcst_cd(String value) {
		setConstString(offset + 1, $bcst_cd, value);
	}


	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public String bill_dpt_cd() {
		return getConstString(offset + 2, $bill_dpt_cd);
	}

	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public void bill_dpt_cd(String value) {
		setConstString(offset + 2, $bill_dpt_cd, value);
	}


	/**
	 * Billing closing day 請求締年月日.<p>
	 *
	 */
	public MCDate bill_cl_dt() {
		return getConstDate(offset + 3, $bill_cl_dt);
	}

	/**
	 * Billing closing day 請求締年月日.<p>
	 *
	 */
	public void bill_cl_dt(MCDate value) {
		setConstDate(offset + 3, $bill_cl_dt, value);
	}


	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 4, $iv_no);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 4, $iv_no, value);
	}


	/**
	 * Billing invoice No. 請求インボイスＮＯ.<p>
	 *
	 */
	public String bill_iv_no() {
		return getConstString(offset + 5, $bill_iv_no);
	}

	/**
	 * Billing invoice No. 請求インボイスＮＯ.<p>
	 *
	 */
	public void bill_iv_no(String value) {
		setConstString(offset + 5, $bill_iv_no, value);
	}


	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 6, $trd_cur_cd);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 6, $trd_cur_cd, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 7, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 7, $wrk_no, value);
	}


	/**
	 * Billing exchange rate 請求為替レート.<p>
	 *
	 */
	public MCNumber bill_xrate() {
		return getConstNumber(offset + 8, $bill_xrate);
	}

	/**
	 * Billing exchange rate 請求為替レート.<p>
	 *
	 */
	public void bill_xrate(MCNumber value) {
		setConstNumber(offset + 8, $bill_xrate, value);
	}

	/**
	 * Billing exchange rate 請求為替レート.<p>
	 *
	 */
	public void bill_xrate(int value) {
		setConstNumber(offset + 8, $bill_xrate, value);
	}

	/**
	 * Billing exchange rate 請求為替レート.<p>
	 *
	 */
	public void bill_xrate(long value) {
		setConstNumber(offset + 8, $bill_xrate, value);
	}

	/**
	 * Billing exchange rate 請求為替レート.<p>
	 *
	 */
	public void bill_xrate(float value) {
		setConstNumber(offset + 8, $bill_xrate, value);
	}

	/**
	 * Billing exchange rate 請求為替レート.<p>
	 *
	 */
	public void bill_xrate(double value) {
		setConstNumber(offset + 8, $bill_xrate, value);
	}


	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public String slip_sts_typ() {
		return getConstString(offset + 9, $slip_sts_typ);
	}

	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public void slip_sts_typ(String value) {
		setConstString(offset + 9, $slip_sts_typ, value);
	}


	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public MCDate rcv_schd_dt() {
		return getConstDate(offset + 10, $rcv_schd_dt);
	}

	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public void rcv_schd_dt(MCDate value) {
		setConstDate(offset + 10, $rcv_schd_dt, value);
	}


	/**
	 * Billing base date 請求起算日.<p>
	 *
	 */
	public MCDate bill_basis_dt() {
		return getConstDate(offset + 11, $bill_basis_dt);
	}

	/**
	 * Billing base date 請求起算日.<p>
	 *
	 */
	public void bill_basis_dt(MCDate value) {
		setConstDate(offset + 11, $bill_basis_dt, value);
	}


	/**
	 * Payment received method cd. 入金方法ＣＤ.<p>
	 *
	 */
	public String rcv_mtd_cd() {
		return getConstString(offset + 12, $rcv_mtd_cd);
	}

	/**
	 * Payment received method cd. 入金方法ＣＤ.<p>
	 *
	 */
	public void rcv_mtd_cd(String value) {
		setConstString(offset + 12, $rcv_mtd_cd, value);
	}


	/**
	 * Sales amount 売上金額.<p>
	 *
	 */
	public MCNumber sls_amt() {
		return getConstNumber(offset + 13, $sls_amt);
	}

	/**
	 * Sales amount 売上金額.<p>
	 *
	 */
	public void sls_amt(MCNumber value) {
		setConstNumber(offset + 13, $sls_amt, value);
	}

	/**
	 * Sales amount 売上金額.<p>
	 *
	 */
	public void sls_amt(int value) {
		setConstNumber(offset + 13, $sls_amt, value);
	}

	/**
	 * Sales amount 売上金額.<p>
	 *
	 */
	public void sls_amt(long value) {
		setConstNumber(offset + 13, $sls_amt, value);
	}

	/**
	 * Sales amount 売上金額.<p>
	 *
	 */
	public void sls_amt(float value) {
		setConstNumber(offset + 13, $sls_amt, value);
	}

	/**
	 * Sales amount 売上金額.<p>
	 *
	 */
	public void sls_amt(double value) {
		setConstNumber(offset + 13, $sls_amt, value);
	}


	/**
	 * Return amount 返品金額.<p>
	 *
	 */
	public MCNumber ret_amt() {
		return getConstNumber(offset + 14, $ret_amt);
	}

	/**
	 * Return amount 返品金額.<p>
	 *
	 */
	public void ret_amt(MCNumber value) {
		setConstNumber(offset + 14, $ret_amt, value);
	}

	/**
	 * Return amount 返品金額.<p>
	 *
	 */
	public void ret_amt(int value) {
		setConstNumber(offset + 14, $ret_amt, value);
	}

	/**
	 * Return amount 返品金額.<p>
	 *
	 */
	public void ret_amt(long value) {
		setConstNumber(offset + 14, $ret_amt, value);
	}

	/**
	 * Return amount 返品金額.<p>
	 *
	 */
	public void ret_amt(float value) {
		setConstNumber(offset + 14, $ret_amt, value);
	}

	/**
	 * Return amount 返品金額.<p>
	 *
	 */
	public void ret_amt(double value) {
		setConstNumber(offset + 14, $ret_amt, value);
	}


	/**
	 * Discount amount 値引金額.<p>
	 *
	 */
	public MCNumber dscnt_amt() {
		return getConstNumber(offset + 15, $dscnt_amt);
	}

	/**
	 * Discount amount 値引金額.<p>
	 *
	 */
	public void dscnt_amt(MCNumber value) {
		setConstNumber(offset + 15, $dscnt_amt, value);
	}

	/**
	 * Discount amount 値引金額.<p>
	 *
	 */
	public void dscnt_amt(int value) {
		setConstNumber(offset + 15, $dscnt_amt, value);
	}

	/**
	 * Discount amount 値引金額.<p>
	 *
	 */
	public void dscnt_amt(long value) {
		setConstNumber(offset + 15, $dscnt_amt, value);
	}

	/**
	 * Discount amount 値引金額.<p>
	 *
	 */
	public void dscnt_amt(float value) {
		setConstNumber(offset + 15, $dscnt_amt, value);
	}

	/**
	 * Discount amount 値引金額.<p>
	 *
	 */
	public void dscnt_amt(double value) {
		setConstNumber(offset + 15, $dscnt_amt, value);
	}


	/**
	 * Transfer amount (Transfer destination) 振替金額(振替先).<p>
	 *
	 */
	public MCNumber sw_to_amt() {
		return getConstNumber(offset + 16, $sw_to_amt);
	}

	/**
	 * Transfer amount (Transfer destination) 振替金額(振替先).<p>
	 *
	 */
	public void sw_to_amt(MCNumber value) {
		setConstNumber(offset + 16, $sw_to_amt, value);
	}

	/**
	 * Transfer amount (Transfer destination) 振替金額(振替先).<p>
	 *
	 */
	public void sw_to_amt(int value) {
		setConstNumber(offset + 16, $sw_to_amt, value);
	}

	/**
	 * Transfer amount (Transfer destination) 振替金額(振替先).<p>
	 *
	 */
	public void sw_to_amt(long value) {
		setConstNumber(offset + 16, $sw_to_amt, value);
	}

	/**
	 * Transfer amount (Transfer destination) 振替金額(振替先).<p>
	 *
	 */
	public void sw_to_amt(float value) {
		setConstNumber(offset + 16, $sw_to_amt, value);
	}

	/**
	 * Transfer amount (Transfer destination) 振替金額(振替先).<p>
	 *
	 */
	public void sw_to_amt(double value) {
		setConstNumber(offset + 16, $sw_to_amt, value);
	}


	/**
	 * Cash amount 現金金額.<p>
	 *
	 */
	public MCNumber cash_amt() {
		return getConstNumber(offset + 17, $cash_amt);
	}

	/**
	 * Cash amount 現金金額.<p>
	 *
	 */
	public void cash_amt(MCNumber value) {
		setConstNumber(offset + 17, $cash_amt, value);
	}

	/**
	 * Cash amount 現金金額.<p>
	 *
	 */
	public void cash_amt(int value) {
		setConstNumber(offset + 17, $cash_amt, value);
	}

	/**
	 * Cash amount 現金金額.<p>
	 *
	 */
	public void cash_amt(long value) {
		setConstNumber(offset + 17, $cash_amt, value);
	}

	/**
	 * Cash amount 現金金額.<p>
	 *
	 */
	public void cash_amt(float value) {
		setConstNumber(offset + 17, $cash_amt, value);
	}

	/**
	 * Cash amount 現金金額.<p>
	 *
	 */
	public void cash_amt(double value) {
		setConstNumber(offset + 17, $cash_amt, value);
	}


	/**
	 * Note amount 手形金額.<p>
	 *
	 */
	public MCNumber note_amt() {
		return getConstNumber(offset + 18, $note_amt);
	}

	/**
	 * Note amount 手形金額.<p>
	 *
	 */
	public void note_amt(MCNumber value) {
		setConstNumber(offset + 18, $note_amt, value);
	}

	/**
	 * Note amount 手形金額.<p>
	 *
	 */
	public void note_amt(int value) {
		setConstNumber(offset + 18, $note_amt, value);
	}

	/**
	 * Note amount 手形金額.<p>
	 *
	 */
	public void note_amt(long value) {
		setConstNumber(offset + 18, $note_amt, value);
	}

	/**
	 * Note amount 手形金額.<p>
	 *
	 */
	public void note_amt(float value) {
		setConstNumber(offset + 18, $note_amt, value);
	}

	/**
	 * Note amount 手形金額.<p>
	 *
	 */
	public void note_amt(double value) {
		setConstNumber(offset + 18, $note_amt, value);
	}


	/**
	 * Transfer payment amount 振込金額.<p>
	 *
	 */
	public MCNumber xfr_amt() {
		return getConstNumber(offset + 19, $xfr_amt);
	}

	/**
	 * Transfer payment amount 振込金額.<p>
	 *
	 */
	public void xfr_amt(MCNumber value) {
		setConstNumber(offset + 19, $xfr_amt, value);
	}

	/**
	 * Transfer payment amount 振込金額.<p>
	 *
	 */
	public void xfr_amt(int value) {
		setConstNumber(offset + 19, $xfr_amt, value);
	}

	/**
	 * Transfer payment amount 振込金額.<p>
	 *
	 */
	public void xfr_amt(long value) {
		setConstNumber(offset + 19, $xfr_amt, value);
	}

	/**
	 * Transfer payment amount 振込金額.<p>
	 *
	 */
	public void xfr_amt(float value) {
		setConstNumber(offset + 19, $xfr_amt, value);
	}

	/**
	 * Transfer payment amount 振込金額.<p>
	 *
	 */
	public void xfr_amt(double value) {
		setConstNumber(offset + 19, $xfr_amt, value);
	}


	/**
	 * Offset amount 相殺金額.<p>
	 *
	 */
	public MCNumber setoff_amt() {
		return getConstNumber(offset + 20, $setoff_amt);
	}

	/**
	 * Offset amount 相殺金額.<p>
	 *
	 */
	public void setoff_amt(MCNumber value) {
		setConstNumber(offset + 20, $setoff_amt, value);
	}

	/**
	 * Offset amount 相殺金額.<p>
	 *
	 */
	public void setoff_amt(int value) {
		setConstNumber(offset + 20, $setoff_amt, value);
	}

	/**
	 * Offset amount 相殺金額.<p>
	 *
	 */
	public void setoff_amt(long value) {
		setConstNumber(offset + 20, $setoff_amt, value);
	}

	/**
	 * Offset amount 相殺金額.<p>
	 *
	 */
	public void setoff_amt(float value) {
		setConstNumber(offset + 20, $setoff_amt, value);
	}

	/**
	 * Offset amount 相殺金額.<p>
	 *
	 */
	public void setoff_amt(double value) {
		setConstNumber(offset + 20, $setoff_amt, value);
	}


	/**
	 * Offset tax amount 相殺税金額.<p>
	 *
	 */
	public MCNumber setoff_tax_amt() {
		return getConstNumber(offset + 21, $setoff_tax_amt);
	}

	/**
	 * Offset tax amount 相殺税金額.<p>
	 *
	 */
	public void setoff_tax_amt(MCNumber value) {
		setConstNumber(offset + 21, $setoff_tax_amt, value);
	}

	/**
	 * Offset tax amount 相殺税金額.<p>
	 *
	 */
	public void setoff_tax_amt(int value) {
		setConstNumber(offset + 21, $setoff_tax_amt, value);
	}

	/**
	 * Offset tax amount 相殺税金額.<p>
	 *
	 */
	public void setoff_tax_amt(long value) {
		setConstNumber(offset + 21, $setoff_tax_amt, value);
	}

	/**
	 * Offset tax amount 相殺税金額.<p>
	 *
	 */
	public void setoff_tax_amt(float value) {
		setConstNumber(offset + 21, $setoff_tax_amt, value);
	}

	/**
	 * Offset tax amount 相殺税金額.<p>
	 *
	 */
	public void setoff_tax_amt(double value) {
		setConstNumber(offset + 21, $setoff_tax_amt, value);
	}


	/**
	 * Transfer amount 振替金額.<p>
	 *
	 */
	public MCNumber sw_amt() {
		return getConstNumber(offset + 22, $sw_amt);
	}

	/**
	 * Transfer amount 振替金額.<p>
	 *
	 */
	public void sw_amt(MCNumber value) {
		setConstNumber(offset + 22, $sw_amt, value);
	}

	/**
	 * Transfer amount 振替金額.<p>
	 *
	 */
	public void sw_amt(int value) {
		setConstNumber(offset + 22, $sw_amt, value);
	}

	/**
	 * Transfer amount 振替金額.<p>
	 *
	 */
	public void sw_amt(long value) {
		setConstNumber(offset + 22, $sw_amt, value);
	}

	/**
	 * Transfer amount 振替金額.<p>
	 *
	 */
	public void sw_amt(float value) {
		setConstNumber(offset + 22, $sw_amt, value);
	}

	/**
	 * Transfer amount 振替金額.<p>
	 *
	 */
	public void sw_amt(double value) {
		setConstNumber(offset + 22, $sw_amt, value);
	}


	/**
	 * Tax amount 税金額.<p>
	 *
	 */
	public MCNumber tax_amt() {
		return getConstNumber(offset + 23, $tax_amt);
	}

	/**
	 * Tax amount 税金額.<p>
	 *
	 */
	public void tax_amt(MCNumber value) {
		setConstNumber(offset + 23, $tax_amt, value);
	}

	/**
	 * Tax amount 税金額.<p>
	 *
	 */
	public void tax_amt(int value) {
		setConstNumber(offset + 23, $tax_amt, value);
	}

	/**
	 * Tax amount 税金額.<p>
	 *
	 */
	public void tax_amt(long value) {
		setConstNumber(offset + 23, $tax_amt, value);
	}

	/**
	 * Tax amount 税金額.<p>
	 *
	 */
	public void tax_amt(float value) {
		setConstNumber(offset + 23, $tax_amt, value);
	}

	/**
	 * Tax amount 税金額.<p>
	 *
	 */
	public void tax_amt(double value) {
		setConstNumber(offset + 23, $tax_amt, value);
	}


	/**
	 * Sales amount (Base currency) 基準通貨売上金額.<p>
	 *
	 */
	public MCNumber base_cur_sls_amt() {
		return getConstNumber(offset + 24, $base_cur_sls_amt);
	}

	/**
	 * Sales amount (Base currency) 基準通貨売上金額.<p>
	 *
	 */
	public void base_cur_sls_amt(MCNumber value) {
		setConstNumber(offset + 24, $base_cur_sls_amt, value);
	}

	/**
	 * Sales amount (Base currency) 基準通貨売上金額.<p>
	 *
	 */
	public void base_cur_sls_amt(int value) {
		setConstNumber(offset + 24, $base_cur_sls_amt, value);
	}

	/**
	 * Sales amount (Base currency) 基準通貨売上金額.<p>
	 *
	 */
	public void base_cur_sls_amt(long value) {
		setConstNumber(offset + 24, $base_cur_sls_amt, value);
	}

	/**
	 * Sales amount (Base currency) 基準通貨売上金額.<p>
	 *
	 */
	public void base_cur_sls_amt(float value) {
		setConstNumber(offset + 24, $base_cur_sls_amt, value);
	}

	/**
	 * Sales amount (Base currency) 基準通貨売上金額.<p>
	 *
	 */
	public void base_cur_sls_amt(double value) {
		setConstNumber(offset + 24, $base_cur_sls_amt, value);
	}


	/**
	 * Return amount (Base currency) 基準通貨返品金額.<p>
	 *
	 */
	public MCNumber base_cur_ret_amt() {
		return getConstNumber(offset + 25, $base_cur_ret_amt);
	}

	/**
	 * Return amount (Base currency) 基準通貨返品金額.<p>
	 *
	 */
	public void base_cur_ret_amt(MCNumber value) {
		setConstNumber(offset + 25, $base_cur_ret_amt, value);
	}

	/**
	 * Return amount (Base currency) 基準通貨返品金額.<p>
	 *
	 */
	public void base_cur_ret_amt(int value) {
		setConstNumber(offset + 25, $base_cur_ret_amt, value);
	}

	/**
	 * Return amount (Base currency) 基準通貨返品金額.<p>
	 *
	 */
	public void base_cur_ret_amt(long value) {
		setConstNumber(offset + 25, $base_cur_ret_amt, value);
	}

	/**
	 * Return amount (Base currency) 基準通貨返品金額.<p>
	 *
	 */
	public void base_cur_ret_amt(float value) {
		setConstNumber(offset + 25, $base_cur_ret_amt, value);
	}

	/**
	 * Return amount (Base currency) 基準通貨返品金額.<p>
	 *
	 */
	public void base_cur_ret_amt(double value) {
		setConstNumber(offset + 25, $base_cur_ret_amt, value);
	}


	/**
	 * Discount amount (Base currency) 基準通貨値引金額.<p>
	 *
	 */
	public MCNumber base_cur_dscnt_amt() {
		return getConstNumber(offset + 26, $base_cur_dscnt_amt);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引金額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 26, $base_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引金額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(int value) {
		setConstNumber(offset + 26, $base_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引金額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(long value) {
		setConstNumber(offset + 26, $base_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引金額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(float value) {
		setConstNumber(offset + 26, $base_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引金額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(double value) {
		setConstNumber(offset + 26, $base_cur_dscnt_amt, value);
	}


	/**
	 * Transfer amount (Transfer source) (Base currency) 基準通貨振替金額(振替先).<p>
	 *
	 */
	public MCNumber base_cur_sw_to_amt() {
		return getConstNumber(offset + 27, $base_cur_sw_to_amt);
	}

	/**
	 * Transfer amount (Transfer source) (Base currency) 基準通貨振替金額(振替先).<p>
	 *
	 */
	public void base_cur_sw_to_amt(MCNumber value) {
		setConstNumber(offset + 27, $base_cur_sw_to_amt, value);
	}

	/**
	 * Transfer amount (Transfer source) (Base currency) 基準通貨振替金額(振替先).<p>
	 *
	 */
	public void base_cur_sw_to_amt(int value) {
		setConstNumber(offset + 27, $base_cur_sw_to_amt, value);
	}

	/**
	 * Transfer amount (Transfer source) (Base currency) 基準通貨振替金額(振替先).<p>
	 *
	 */
	public void base_cur_sw_to_amt(long value) {
		setConstNumber(offset + 27, $base_cur_sw_to_amt, value);
	}

	/**
	 * Transfer amount (Transfer source) (Base currency) 基準通貨振替金額(振替先).<p>
	 *
	 */
	public void base_cur_sw_to_amt(float value) {
		setConstNumber(offset + 27, $base_cur_sw_to_amt, value);
	}

	/**
	 * Transfer amount (Transfer source) (Base currency) 基準通貨振替金額(振替先).<p>
	 *
	 */
	public void base_cur_sw_to_amt(double value) {
		setConstNumber(offset + 27, $base_cur_sw_to_amt, value);
	}


	/**
	 * Cash amount (Base currency) 基準通貨現金金額.<p>
	 *
	 */
	public MCNumber base_cur_cash_amt() {
		return getConstNumber(offset + 28, $base_cur_cash_amt);
	}

	/**
	 * Cash amount (Base currency) 基準通貨現金金額.<p>
	 *
	 */
	public void base_cur_cash_amt(MCNumber value) {
		setConstNumber(offset + 28, $base_cur_cash_amt, value);
	}

	/**
	 * Cash amount (Base currency) 基準通貨現金金額.<p>
	 *
	 */
	public void base_cur_cash_amt(int value) {
		setConstNumber(offset + 28, $base_cur_cash_amt, value);
	}

	/**
	 * Cash amount (Base currency) 基準通貨現金金額.<p>
	 *
	 */
	public void base_cur_cash_amt(long value) {
		setConstNumber(offset + 28, $base_cur_cash_amt, value);
	}

	/**
	 * Cash amount (Base currency) 基準通貨現金金額.<p>
	 *
	 */
	public void base_cur_cash_amt(float value) {
		setConstNumber(offset + 28, $base_cur_cash_amt, value);
	}

	/**
	 * Cash amount (Base currency) 基準通貨現金金額.<p>
	 *
	 */
	public void base_cur_cash_amt(double value) {
		setConstNumber(offset + 28, $base_cur_cash_amt, value);
	}


	/**
	 * Notes amount (Base currency) 基準通貨手形金額.<p>
	 *
	 */
	public MCNumber base_cur_note_amt() {
		return getConstNumber(offset + 29, $base_cur_note_amt);
	}

	/**
	 * Notes amount (Base currency) 基準通貨手形金額.<p>
	 *
	 */
	public void base_cur_note_amt(MCNumber value) {
		setConstNumber(offset + 29, $base_cur_note_amt, value);
	}

	/**
	 * Notes amount (Base currency) 基準通貨手形金額.<p>
	 *
	 */
	public void base_cur_note_amt(int value) {
		setConstNumber(offset + 29, $base_cur_note_amt, value);
	}

	/**
	 * Notes amount (Base currency) 基準通貨手形金額.<p>
	 *
	 */
	public void base_cur_note_amt(long value) {
		setConstNumber(offset + 29, $base_cur_note_amt, value);
	}

	/**
	 * Notes amount (Base currency) 基準通貨手形金額.<p>
	 *
	 */
	public void base_cur_note_amt(float value) {
		setConstNumber(offset + 29, $base_cur_note_amt, value);
	}

	/**
	 * Notes amount (Base currency) 基準通貨手形金額.<p>
	 *
	 */
	public void base_cur_note_amt(double value) {
		setConstNumber(offset + 29, $base_cur_note_amt, value);
	}


	/**
	 * Transfer payment amount (Base currency) 基準通貨振込金額.<p>
	 *
	 */
	public MCNumber base_cur_xfr_amt() {
		return getConstNumber(offset + 30, $base_cur_xfr_amt);
	}

	/**
	 * Transfer payment amount (Base currency) 基準通貨振込金額.<p>
	 *
	 */
	public void base_cur_xfr_amt(MCNumber value) {
		setConstNumber(offset + 30, $base_cur_xfr_amt, value);
	}

	/**
	 * Transfer payment amount (Base currency) 基準通貨振込金額.<p>
	 *
	 */
	public void base_cur_xfr_amt(int value) {
		setConstNumber(offset + 30, $base_cur_xfr_amt, value);
	}

	/**
	 * Transfer payment amount (Base currency) 基準通貨振込金額.<p>
	 *
	 */
	public void base_cur_xfr_amt(long value) {
		setConstNumber(offset + 30, $base_cur_xfr_amt, value);
	}

	/**
	 * Transfer payment amount (Base currency) 基準通貨振込金額.<p>
	 *
	 */
	public void base_cur_xfr_amt(float value) {
		setConstNumber(offset + 30, $base_cur_xfr_amt, value);
	}

	/**
	 * Transfer payment amount (Base currency) 基準通貨振込金額.<p>
	 *
	 */
	public void base_cur_xfr_amt(double value) {
		setConstNumber(offset + 30, $base_cur_xfr_amt, value);
	}


	/**
	 * Offset amount (Base currency) 基準通貨相殺金額.<p>
	 *
	 */
	public MCNumber base_cur_setoff_amt() {
		return getConstNumber(offset + 31, $base_cur_setoff_amt);
	}

	/**
	 * Offset amount (Base currency) 基準通貨相殺金額.<p>
	 *
	 */
	public void base_cur_setoff_amt(MCNumber value) {
		setConstNumber(offset + 31, $base_cur_setoff_amt, value);
	}

	/**
	 * Offset amount (Base currency) 基準通貨相殺金額.<p>
	 *
	 */
	public void base_cur_setoff_amt(int value) {
		setConstNumber(offset + 31, $base_cur_setoff_amt, value);
	}

	/**
	 * Offset amount (Base currency) 基準通貨相殺金額.<p>
	 *
	 */
	public void base_cur_setoff_amt(long value) {
		setConstNumber(offset + 31, $base_cur_setoff_amt, value);
	}

	/**
	 * Offset amount (Base currency) 基準通貨相殺金額.<p>
	 *
	 */
	public void base_cur_setoff_amt(float value) {
		setConstNumber(offset + 31, $base_cur_setoff_amt, value);
	}

	/**
	 * Offset amount (Base currency) 基準通貨相殺金額.<p>
	 *
	 */
	public void base_cur_setoff_amt(double value) {
		setConstNumber(offset + 31, $base_cur_setoff_amt, value);
	}


	/**
	 * Offset tax amount (Base currency) 基準通貨相殺税金額.<p>
	 *
	 */
	public MCNumber base_cur_setoff_tax_amt() {
		return getConstNumber(offset + 32, $base_cur_setoff_tax_amt);
	}

	/**
	 * Offset tax amount (Base currency) 基準通貨相殺税金額.<p>
	 *
	 */
	public void base_cur_setoff_tax_amt(MCNumber value) {
		setConstNumber(offset + 32, $base_cur_setoff_tax_amt, value);
	}

	/**
	 * Offset tax amount (Base currency) 基準通貨相殺税金額.<p>
	 *
	 */
	public void base_cur_setoff_tax_amt(int value) {
		setConstNumber(offset + 32, $base_cur_setoff_tax_amt, value);
	}

	/**
	 * Offset tax amount (Base currency) 基準通貨相殺税金額.<p>
	 *
	 */
	public void base_cur_setoff_tax_amt(long value) {
		setConstNumber(offset + 32, $base_cur_setoff_tax_amt, value);
	}

	/**
	 * Offset tax amount (Base currency) 基準通貨相殺税金額.<p>
	 *
	 */
	public void base_cur_setoff_tax_amt(float value) {
		setConstNumber(offset + 32, $base_cur_setoff_tax_amt, value);
	}

	/**
	 * Offset tax amount (Base currency) 基準通貨相殺税金額.<p>
	 *
	 */
	public void base_cur_setoff_tax_amt(double value) {
		setConstNumber(offset + 32, $base_cur_setoff_tax_amt, value);
	}


	/**
	 * Transfer amount (Base currency) 基準通貨振替金額.<p>
	 *
	 */
	public MCNumber base_cur_sw_amt() {
		return getConstNumber(offset + 33, $base_cur_sw_amt);
	}

	/**
	 * Transfer amount (Base currency) 基準通貨振替金額.<p>
	 *
	 */
	public void base_cur_sw_amt(MCNumber value) {
		setConstNumber(offset + 33, $base_cur_sw_amt, value);
	}

	/**
	 * Transfer amount (Base currency) 基準通貨振替金額.<p>
	 *
	 */
	public void base_cur_sw_amt(int value) {
		setConstNumber(offset + 33, $base_cur_sw_amt, value);
	}

	/**
	 * Transfer amount (Base currency) 基準通貨振替金額.<p>
	 *
	 */
	public void base_cur_sw_amt(long value) {
		setConstNumber(offset + 33, $base_cur_sw_amt, value);
	}

	/**
	 * Transfer amount (Base currency) 基準通貨振替金額.<p>
	 *
	 */
	public void base_cur_sw_amt(float value) {
		setConstNumber(offset + 33, $base_cur_sw_amt, value);
	}

	/**
	 * Transfer amount (Base currency) 基準通貨振替金額.<p>
	 *
	 */
	public void base_cur_sw_amt(double value) {
		setConstNumber(offset + 33, $base_cur_sw_amt, value);
	}


	/**
	 * Tax amount (Base currency) 基準通貨税金額.<p>
	 *
	 */
	public MCNumber base_cur_tax_amt() {
		return getConstNumber(offset + 34, $base_cur_tax_amt);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税金額.<p>
	 *
	 */
	public void base_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 34, $base_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税金額.<p>
	 *
	 */
	public void base_cur_tax_amt(int value) {
		setConstNumber(offset + 34, $base_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税金額.<p>
	 *
	 */
	public void base_cur_tax_amt(long value) {
		setConstNumber(offset + 34, $base_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税金額.<p>
	 *
	 */
	public void base_cur_tax_amt(float value) {
		setConstNumber(offset + 34, $base_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税金額.<p>
	 *
	 */
	public void base_cur_tax_amt(double value) {
		setConstNumber(offset + 34, $base_cur_tax_amt, value);
	}


	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public MCNumber wtax_amt() {
		return getConstNumber(offset + 35, $wtax_amt);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(MCNumber value) {
		setConstNumber(offset + 35, $wtax_amt, value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(int value) {
		setConstNumber(offset + 35, $wtax_amt, value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(long value) {
		setConstNumber(offset + 35, $wtax_amt, value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(float value) {
		setConstNumber(offset + 35, $wtax_amt, value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(double value) {
		setConstNumber(offset + 35, $wtax_amt, value);
	}


	public String getString(String name) {
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			return bill_mng_no();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($bill_iv_no.equalsIgnoreCase(name)) {
			return bill_iv_no();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			return slip_sts_typ();
		}
		if ($rcv_mtd_cd.equalsIgnoreCase(name)) {
			return rcv_mtd_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($bill_xrate.equalsIgnoreCase(name)) {
			return bill_xrate();
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			return sls_amt();
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			return ret_amt();
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			return dscnt_amt();
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			return sw_to_amt();
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			return cash_amt();
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			return note_amt();
		}
		if ($xfr_amt.equalsIgnoreCase(name)) {
			return xfr_amt();
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			return setoff_amt();
		}
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			return setoff_tax_amt();
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			return sw_amt();
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			return tax_amt();
		}
		if ($base_cur_sls_amt.equalsIgnoreCase(name)) {
			return base_cur_sls_amt();
		}
		if ($base_cur_ret_amt.equalsIgnoreCase(name)) {
			return base_cur_ret_amt();
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return base_cur_dscnt_amt();
		}
		if ($base_cur_sw_to_amt.equalsIgnoreCase(name)) {
			return base_cur_sw_to_amt();
		}
		if ($base_cur_cash_amt.equalsIgnoreCase(name)) {
			return base_cur_cash_amt();
		}
		if ($base_cur_note_amt.equalsIgnoreCase(name)) {
			return base_cur_note_amt();
		}
		if ($base_cur_xfr_amt.equalsIgnoreCase(name)) {
			return base_cur_xfr_amt();
		}
		if ($base_cur_setoff_amt.equalsIgnoreCase(name)) {
			return base_cur_setoff_amt();
		}
		if ($base_cur_setoff_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_setoff_tax_amt();
		}
		if ($base_cur_sw_amt.equalsIgnoreCase(name)) {
			return base_cur_sw_amt();
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_tax_amt();
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			return wtax_amt();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($bill_cl_dt.equalsIgnoreCase(name)) {
			return bill_cl_dt();
		}
		if ($rcv_schd_dt.equalsIgnoreCase(name)) {
			return rcv_schd_dt();
		}
		if ($bill_basis_dt.equalsIgnoreCase(name)) {
			return bill_basis_dt();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			return bill_mng_no();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($bill_iv_no.equalsIgnoreCase(name)) {
			return bill_iv_no();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			return slip_sts_typ();
		}
		if ($rcv_mtd_cd.equalsIgnoreCase(name)) {
			return rcv_mtd_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($bill_xrate.equalsIgnoreCase(name)) {
			return bill_xrate();
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			return sls_amt();
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			return ret_amt();
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			return dscnt_amt();
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			return sw_to_amt();
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			return cash_amt();
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			return note_amt();
		}
		if ($xfr_amt.equalsIgnoreCase(name)) {
			return xfr_amt();
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			return setoff_amt();
		}
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			return setoff_tax_amt();
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			return sw_amt();
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			return tax_amt();
		}
		if ($base_cur_sls_amt.equalsIgnoreCase(name)) {
			return base_cur_sls_amt();
		}
		if ($base_cur_ret_amt.equalsIgnoreCase(name)) {
			return base_cur_ret_amt();
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return base_cur_dscnt_amt();
		}
		if ($base_cur_sw_to_amt.equalsIgnoreCase(name)) {
			return base_cur_sw_to_amt();
		}
		if ($base_cur_cash_amt.equalsIgnoreCase(name)) {
			return base_cur_cash_amt();
		}
		if ($base_cur_note_amt.equalsIgnoreCase(name)) {
			return base_cur_note_amt();
		}
		if ($base_cur_xfr_amt.equalsIgnoreCase(name)) {
			return base_cur_xfr_amt();
		}
		if ($base_cur_setoff_amt.equalsIgnoreCase(name)) {
			return base_cur_setoff_amt();
		}
		if ($base_cur_setoff_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_setoff_tax_amt();
		}
		if ($base_cur_sw_amt.equalsIgnoreCase(name)) {
			return base_cur_sw_amt();
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_tax_amt();
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			return wtax_amt();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($bill_cl_dt.equalsIgnoreCase(name)) {
			return bill_cl_dt();
		}
		if ($rcv_schd_dt.equalsIgnoreCase(name)) {
			return rcv_schd_dt();
		}
		if ($bill_basis_dt.equalsIgnoreCase(name)) {
			return bill_basis_dt();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			bill_mng_no(value);
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
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($bill_iv_no.equalsIgnoreCase(name)) {
			bill_iv_no(value);
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
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			slip_sts_typ(value);
			return;
		}
		if ($rcv_mtd_cd.equalsIgnoreCase(name)) {
			rcv_mtd_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($xfr_amt.equalsIgnoreCase(name)) {
			xfr_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			setoff_tax_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($base_cur_sls_amt.equalsIgnoreCase(name)) {
			base_cur_sls_amt(value);
			return;
		}
		if ($base_cur_ret_amt.equalsIgnoreCase(name)) {
			base_cur_ret_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_sw_to_amt.equalsIgnoreCase(name)) {
			base_cur_sw_to_amt(value);
			return;
		}
		if ($base_cur_cash_amt.equalsIgnoreCase(name)) {
			base_cur_cash_amt(value);
			return;
		}
		if ($base_cur_note_amt.equalsIgnoreCase(name)) {
			base_cur_note_amt(value);
			return;
		}
		if ($base_cur_xfr_amt.equalsIgnoreCase(name)) {
			base_cur_xfr_amt(value);
			return;
		}
		if ($base_cur_setoff_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_amt(value);
			return;
		}
		if ($base_cur_setoff_tax_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_tax_amt(value);
			return;
		}
		if ($base_cur_sw_amt.equalsIgnoreCase(name)) {
			base_cur_sw_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($xfr_amt.equalsIgnoreCase(name)) {
			xfr_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			setoff_tax_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($base_cur_sls_amt.equalsIgnoreCase(name)) {
			base_cur_sls_amt(value);
			return;
		}
		if ($base_cur_ret_amt.equalsIgnoreCase(name)) {
			base_cur_ret_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_sw_to_amt.equalsIgnoreCase(name)) {
			base_cur_sw_to_amt(value);
			return;
		}
		if ($base_cur_cash_amt.equalsIgnoreCase(name)) {
			base_cur_cash_amt(value);
			return;
		}
		if ($base_cur_note_amt.equalsIgnoreCase(name)) {
			base_cur_note_amt(value);
			return;
		}
		if ($base_cur_xfr_amt.equalsIgnoreCase(name)) {
			base_cur_xfr_amt(value);
			return;
		}
		if ($base_cur_setoff_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_amt(value);
			return;
		}
		if ($base_cur_setoff_tax_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_tax_amt(value);
			return;
		}
		if ($base_cur_sw_amt.equalsIgnoreCase(name)) {
			base_cur_sw_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($xfr_amt.equalsIgnoreCase(name)) {
			xfr_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			setoff_tax_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($base_cur_sls_amt.equalsIgnoreCase(name)) {
			base_cur_sls_amt(value);
			return;
		}
		if ($base_cur_ret_amt.equalsIgnoreCase(name)) {
			base_cur_ret_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_sw_to_amt.equalsIgnoreCase(name)) {
			base_cur_sw_to_amt(value);
			return;
		}
		if ($base_cur_cash_amt.equalsIgnoreCase(name)) {
			base_cur_cash_amt(value);
			return;
		}
		if ($base_cur_note_amt.equalsIgnoreCase(name)) {
			base_cur_note_amt(value);
			return;
		}
		if ($base_cur_xfr_amt.equalsIgnoreCase(name)) {
			base_cur_xfr_amt(value);
			return;
		}
		if ($base_cur_setoff_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_amt(value);
			return;
		}
		if ($base_cur_setoff_tax_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_tax_amt(value);
			return;
		}
		if ($base_cur_sw_amt.equalsIgnoreCase(name)) {
			base_cur_sw_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($xfr_amt.equalsIgnoreCase(name)) {
			xfr_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			setoff_tax_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($base_cur_sls_amt.equalsIgnoreCase(name)) {
			base_cur_sls_amt(value);
			return;
		}
		if ($base_cur_ret_amt.equalsIgnoreCase(name)) {
			base_cur_ret_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_sw_to_amt.equalsIgnoreCase(name)) {
			base_cur_sw_to_amt(value);
			return;
		}
		if ($base_cur_cash_amt.equalsIgnoreCase(name)) {
			base_cur_cash_amt(value);
			return;
		}
		if ($base_cur_note_amt.equalsIgnoreCase(name)) {
			base_cur_note_amt(value);
			return;
		}
		if ($base_cur_xfr_amt.equalsIgnoreCase(name)) {
			base_cur_xfr_amt(value);
			return;
		}
		if ($base_cur_setoff_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_amt(value);
			return;
		}
		if ($base_cur_setoff_tax_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_tax_amt(value);
			return;
		}
		if ($base_cur_sw_amt.equalsIgnoreCase(name)) {
			base_cur_sw_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($xfr_amt.equalsIgnoreCase(name)) {
			xfr_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			setoff_tax_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($base_cur_sls_amt.equalsIgnoreCase(name)) {
			base_cur_sls_amt(value);
			return;
		}
		if ($base_cur_ret_amt.equalsIgnoreCase(name)) {
			base_cur_ret_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_sw_to_amt.equalsIgnoreCase(name)) {
			base_cur_sw_to_amt(value);
			return;
		}
		if ($base_cur_cash_amt.equalsIgnoreCase(name)) {
			base_cur_cash_amt(value);
			return;
		}
		if ($base_cur_note_amt.equalsIgnoreCase(name)) {
			base_cur_note_amt(value);
			return;
		}
		if ($base_cur_xfr_amt.equalsIgnoreCase(name)) {
			base_cur_xfr_amt(value);
			return;
		}
		if ($base_cur_setoff_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_amt(value);
			return;
		}
		if ($base_cur_setoff_tax_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_tax_amt(value);
			return;
		}
		if ($base_cur_sw_amt.equalsIgnoreCase(name)) {
			base_cur_sw_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($bill_cl_dt.equalsIgnoreCase(name)) {
			bill_cl_dt(value);
			return;
		}
		if ($rcv_schd_dt.equalsIgnoreCase(name)) {
			rcv_schd_dt(value);
			return;
		}
		if ($bill_basis_dt.equalsIgnoreCase(name)) {
			bill_basis_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			bill_mng_no(value);
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
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($bill_iv_no.equalsIgnoreCase(name)) {
			bill_iv_no(value);
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
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			slip_sts_typ(value);
			return;
		}
		if ($rcv_mtd_cd.equalsIgnoreCase(name)) {
			rcv_mtd_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($xfr_amt.equalsIgnoreCase(name)) {
			xfr_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			setoff_tax_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($base_cur_sls_amt.equalsIgnoreCase(name)) {
			base_cur_sls_amt(value);
			return;
		}
		if ($base_cur_ret_amt.equalsIgnoreCase(name)) {
			base_cur_ret_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_sw_to_amt.equalsIgnoreCase(name)) {
			base_cur_sw_to_amt(value);
			return;
		}
		if ($base_cur_cash_amt.equalsIgnoreCase(name)) {
			base_cur_cash_amt(value);
			return;
		}
		if ($base_cur_note_amt.equalsIgnoreCase(name)) {
			base_cur_note_amt(value);
			return;
		}
		if ($base_cur_xfr_amt.equalsIgnoreCase(name)) {
			base_cur_xfr_amt(value);
			return;
		}
		if ($base_cur_setoff_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_amt(value);
			return;
		}
		if ($base_cur_setoff_tax_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_tax_amt(value);
			return;
		}
		if ($base_cur_sw_amt.equalsIgnoreCase(name)) {
			base_cur_sw_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($xfr_amt.equalsIgnoreCase(name)) {
			xfr_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			setoff_tax_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($base_cur_sls_amt.equalsIgnoreCase(name)) {
			base_cur_sls_amt(value);
			return;
		}
		if ($base_cur_ret_amt.equalsIgnoreCase(name)) {
			base_cur_ret_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_sw_to_amt.equalsIgnoreCase(name)) {
			base_cur_sw_to_amt(value);
			return;
		}
		if ($base_cur_cash_amt.equalsIgnoreCase(name)) {
			base_cur_cash_amt(value);
			return;
		}
		if ($base_cur_note_amt.equalsIgnoreCase(name)) {
			base_cur_note_amt(value);
			return;
		}
		if ($base_cur_xfr_amt.equalsIgnoreCase(name)) {
			base_cur_xfr_amt(value);
			return;
		}
		if ($base_cur_setoff_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_amt(value);
			return;
		}
		if ($base_cur_setoff_tax_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_tax_amt(value);
			return;
		}
		if ($base_cur_sw_amt.equalsIgnoreCase(name)) {
			base_cur_sw_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($xfr_amt.equalsIgnoreCase(name)) {
			xfr_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			setoff_tax_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($base_cur_sls_amt.equalsIgnoreCase(name)) {
			base_cur_sls_amt(value);
			return;
		}
		if ($base_cur_ret_amt.equalsIgnoreCase(name)) {
			base_cur_ret_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_sw_to_amt.equalsIgnoreCase(name)) {
			base_cur_sw_to_amt(value);
			return;
		}
		if ($base_cur_cash_amt.equalsIgnoreCase(name)) {
			base_cur_cash_amt(value);
			return;
		}
		if ($base_cur_note_amt.equalsIgnoreCase(name)) {
			base_cur_note_amt(value);
			return;
		}
		if ($base_cur_xfr_amt.equalsIgnoreCase(name)) {
			base_cur_xfr_amt(value);
			return;
		}
		if ($base_cur_setoff_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_amt(value);
			return;
		}
		if ($base_cur_setoff_tax_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_tax_amt(value);
			return;
		}
		if ($base_cur_sw_amt.equalsIgnoreCase(name)) {
			base_cur_sw_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($xfr_amt.equalsIgnoreCase(name)) {
			xfr_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			setoff_tax_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($base_cur_sls_amt.equalsIgnoreCase(name)) {
			base_cur_sls_amt(value);
			return;
		}
		if ($base_cur_ret_amt.equalsIgnoreCase(name)) {
			base_cur_ret_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_sw_to_amt.equalsIgnoreCase(name)) {
			base_cur_sw_to_amt(value);
			return;
		}
		if ($base_cur_cash_amt.equalsIgnoreCase(name)) {
			base_cur_cash_amt(value);
			return;
		}
		if ($base_cur_note_amt.equalsIgnoreCase(name)) {
			base_cur_note_amt(value);
			return;
		}
		if ($base_cur_xfr_amt.equalsIgnoreCase(name)) {
			base_cur_xfr_amt(value);
			return;
		}
		if ($base_cur_setoff_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_amt(value);
			return;
		}
		if ($base_cur_setoff_tax_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_tax_amt(value);
			return;
		}
		if ($base_cur_sw_amt.equalsIgnoreCase(name)) {
			base_cur_sw_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($xfr_amt.equalsIgnoreCase(name)) {
			xfr_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			setoff_tax_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($base_cur_sls_amt.equalsIgnoreCase(name)) {
			base_cur_sls_amt(value);
			return;
		}
		if ($base_cur_ret_amt.equalsIgnoreCase(name)) {
			base_cur_ret_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_sw_to_amt.equalsIgnoreCase(name)) {
			base_cur_sw_to_amt(value);
			return;
		}
		if ($base_cur_cash_amt.equalsIgnoreCase(name)) {
			base_cur_cash_amt(value);
			return;
		}
		if ($base_cur_note_amt.equalsIgnoreCase(name)) {
			base_cur_note_amt(value);
			return;
		}
		if ($base_cur_xfr_amt.equalsIgnoreCase(name)) {
			base_cur_xfr_amt(value);
			return;
		}
		if ($base_cur_setoff_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_amt(value);
			return;
		}
		if ($base_cur_setoff_tax_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_tax_amt(value);
			return;
		}
		if ($base_cur_sw_amt.equalsIgnoreCase(name)) {
			base_cur_sw_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($bill_cl_dt.equalsIgnoreCase(name)) {
			bill_cl_dt(value);
			return;
		}
		if ($rcv_schd_dt.equalsIgnoreCase(name)) {
			rcv_schd_dt(value);
			return;
		}
		if ($bill_basis_dt.equalsIgnoreCase(name)) {
			bill_basis_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

