package mcframe.serverMSBG.MSBGL5100;

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
 * ブロック"ArDtlAppl_Chk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ArDtlAppl_Chk01_DtlR_MC_A extends MCConstRow {

	/**
	 * Payment received result details No. 入金実績明細ＮＯ.<p>
	 *
	 */
	public static final String $rcv_act_d_no = "rcv_act_d_no";
	/**
	 * Payment received result details sequence number 入金実績明細連番.<p>
	 *
	 */
	public static final String $rcv_act_d_seq = "rcv_act_d_seq";
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
	/**
	 * Reconciled amount 消込額.<p>
	 *
	 */
	public static final String $appl_amt = "appl_amt";
	/**
	 * Payment received result No. 入金実績ＮＯ.<p>
	 *
	 */
	public static final String $rcv_act_no = "rcv_act_no";
	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public static final String $rcv_act_seq = "rcv_act_seq";
	/**
	 * AR reconciliation 売掛消込.<p>
	 *
	 */
	public static final String $ar_appl_flg = "ar_appl_flg";
	/**
	 * Unnecessary details payment 不要明細消込.<p>
	 *
	 */
	public static final String $un_dtl_appl_flg = "un_dtl_appl_flg";
	public static final String $no_upd_ar_bal_flg = "no_upd_ar_bal_flg";
	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public static final String $rcv_act_ac_ym = "rcv_act_ac_ym";
	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public static final String $ac_ym = "ac_ym";
	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public static final String $acst_cd = "acst_cd";
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public static final String $wrk_no = "wrk_no";
	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public static final String $ar_typ = "ar_typ";
	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	/**
	 * Original reconcile amount 元消込額.<p>
	 *
	 */
	public static final String $org_appl_amt = "org_appl_amt";
	/**
	 * Reconciled balance 消込残高.<p>
	 *
	 */
	public static final String $not_appl_bal = "not_appl_bal";
	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public static final String $ar_dpt_cd = "ar_dpt_cd";
	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public static final String $xrate = "xrate";
	/**
	 * Rate at transaction 取引時レート.<p>
	 *
	 */
	public static final String $trd_xrate = "trd_xrate";
	/**
	 * Parent slip status type 親伝票状況区分.<p>
	 *
	 */
	public static final String $par_slip_sts_typ = "par_slip_sts_typ";
	/**
	 * Parent payment received result details No. 親入金実績明細ＮＯ.<p>
	 *
	 */
	public static final String $par_rcv_act_d_no = "par_rcv_act_d_no";
	/**
	 * Parent payment received result details sequence number 親入金実績明細連番.<p>
	 *
	 */
	public static final String $par_rcv_act_d_seq = "par_rcv_act_d_seq";
	/**
	 * Old parent payment received result details No. 旧親入金実績明細ＮＯ.<p>
	 *
	 */
	public static final String $par_pre_rcv_act_d_no = "par_pre_rcv_act_d_no";


	public static final MCMeta rcv_act_d_no_META = createCommonMeta($rcv_act_d_no, mcframe.commonMA.meta.MA_META.RCV_ACT_D_NO);
	public static final MCMeta rcv_act_d_seq_META = createCommonMeta($rcv_act_d_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta bill_d_no_META = createCommonMeta($bill_d_no, mcframe.commonMA.meta.MA_META.BILL_D_NO);
	public static final MCMeta parent_bill_d_no_META = createCommonMeta($parent_bill_d_no, mcframe.commonMA.meta.MA_META.BILL_D_NO);
	public static final MCMeta bill_mng_no_META = createCommonMeta($bill_mng_no, mcframe.commonMA.meta.MA_META.BILL_MNG_NO);
	public static final MCMeta appl_amt_META = createCommonMeta($appl_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta rcv_act_no_META = createCommonMeta($rcv_act_no, mcframe.commonMA.meta.MA_META.RCV_ACT_NO);
	public static final MCMeta rcv_act_seq_META = createCommonMeta($rcv_act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta ar_appl_flg_META = createCommonMeta($ar_appl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta un_dtl_appl_flg_META = createCommonMeta($un_dtl_appl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta no_upd_ar_bal_flg_META = createCommonMeta($no_upd_ar_bal_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcv_act_ac_ym_META = createCommonMeta($rcv_act_ac_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta ac_ym_META = createCommonMeta($ac_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta acst_cd_META = createCommonMeta($acst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta ar_typ_META = createCommonMeta($ar_typ, mcframe.commonMA.meta.MA_META.AR_TYP);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta org_appl_amt_META = createCommonMeta($org_appl_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta not_appl_bal_META = createCommonMeta($not_appl_bal, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ar_dpt_cd_META = createCommonMeta($ar_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta xrate_META = createCommonMeta($xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_xrate_META = createCommonMeta($trd_xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta par_slip_sts_typ_META = createCommonMeta($par_slip_sts_typ, mcframe.commonMA.meta.MA_META.SLIP_STS_TYP);
	public static final MCMeta par_rcv_act_d_no_META = createCommonMeta($par_rcv_act_d_no, mcframe.commonMA.meta.MA_META.RCV_ACT_D_NO);
	public static final MCMeta par_rcv_act_d_seq_META = createCommonMeta($par_rcv_act_d_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta par_pre_rcv_act_d_no_META = createCommonMeta($par_pre_rcv_act_d_no, mcframe.commonMA.meta.MA_META.RCV_ACT_D_NO);

	protected static final ConstMetaList<ArDtlAppl_Chk01_DtlR> constMetas = new ConstMetaList<ArDtlAppl_Chk01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			rcv_act_d_no_META,
			rcv_act_d_seq_META,
			bill_d_no_META,
			parent_bill_d_no_META,
			bill_mng_no_META,
			appl_amt_META,
			rcv_act_no_META,
			rcv_act_seq_META,
			ar_appl_flg_META,
			un_dtl_appl_flg_META,
			no_upd_ar_bal_flg_META,
			rcv_act_ac_ym_META,
			ac_ym_META,
			acst_cd_META,
			iv_no_META,
			wrk_no_META,
			ar_typ_META,
			trd_cur_cd_META,
			ac_dt_META,
			org_appl_amt_META,
			not_appl_bal_META,
			ar_dpt_cd_META,
			xrate_META,
			trd_xrate_META,
			par_slip_sts_typ_META,
			par_rcv_act_d_no_META,
			par_rcv_act_d_seq_META,
			par_pre_rcv_act_d_no_META
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
	protected ArDtlAppl_Chk01_DtlR_MC_A(ConstMetaList<? extends ArDtlAppl_Chk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ArDtlAppl_Chk01_DtlR clone() {
		return (ArDtlAppl_Chk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ArDtlAppl_Chk01_DtlR createInstance() {
		return (ArDtlAppl_Chk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ArDtlAppl_Chk01_DtlR getValues(String... names) {
		return (ArDtlAppl_Chk01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Payment received result details No. 入金実績明細ＮＯ.<p>
	 *
	 */
	public String rcv_act_d_no() {
		return getConstString(offset + 0, $rcv_act_d_no);
	}

	/**
	 * Payment received result details No. 入金実績明細ＮＯ.<p>
	 *
	 */
	public void rcv_act_d_no(String value) {
		setConstString(offset + 0, $rcv_act_d_no, value);
	}


	/**
	 * Payment received result details sequence number 入金実績明細連番.<p>
	 *
	 */
	public MCNumber rcv_act_d_seq() {
		return getConstNumber(offset + 1, $rcv_act_d_seq);
	}

	/**
	 * Payment received result details sequence number 入金実績明細連番.<p>
	 *
	 */
	public void rcv_act_d_seq(MCNumber value) {
		setConstNumber(offset + 1, $rcv_act_d_seq, value);
	}

	/**
	 * Payment received result details sequence number 入金実績明細連番.<p>
	 *
	 */
	public void rcv_act_d_seq(int value) {
		setConstNumber(offset + 1, $rcv_act_d_seq, value);
	}

	/**
	 * Payment received result details sequence number 入金実績明細連番.<p>
	 *
	 */
	public void rcv_act_d_seq(long value) {
		setConstNumber(offset + 1, $rcv_act_d_seq, value);
	}

	/**
	 * Payment received result details sequence number 入金実績明細連番.<p>
	 *
	 */
	public void rcv_act_d_seq(float value) {
		setConstNumber(offset + 1, $rcv_act_d_seq, value);
	}

	/**
	 * Payment received result details sequence number 入金実績明細連番.<p>
	 *
	 */
	public void rcv_act_d_seq(double value) {
		setConstNumber(offset + 1, $rcv_act_d_seq, value);
	}


	/**
	 * Billing details No. 請求明細ＮＯ.<p>
	 *
	 */
	public String bill_d_no() {
		return getConstString(offset + 2, $bill_d_no);
	}

	/**
	 * Billing details No. 請求明細ＮＯ.<p>
	 *
	 */
	public void bill_d_no(String value) {
		setConstString(offset + 2, $bill_d_no, value);
	}


	/**
	 * Parent billing details No. 親請求明細ＮＯ.<p>
	 *
	 */
	public String parent_bill_d_no() {
		return getConstString(offset + 3, $parent_bill_d_no);
	}

	/**
	 * Parent billing details No. 親請求明細ＮＯ.<p>
	 *
	 */
	public void parent_bill_d_no(String value) {
		setConstString(offset + 3, $parent_bill_d_no, value);
	}


	/**
	 * Billing management No. 請求管理ＮＯ.<p>
	 *
	 */
	public String bill_mng_no() {
		return getConstString(offset + 4, $bill_mng_no);
	}

	/**
	 * Billing management No. 請求管理ＮＯ.<p>
	 *
	 */
	public void bill_mng_no(String value) {
		setConstString(offset + 4, $bill_mng_no, value);
	}


	/**
	 * Reconciled amount 消込額.<p>
	 *
	 */
	public MCNumber appl_amt() {
		return getConstNumber(offset + 5, $appl_amt);
	}

	/**
	 * Reconciled amount 消込額.<p>
	 *
	 */
	public void appl_amt(MCNumber value) {
		setConstNumber(offset + 5, $appl_amt, value);
	}

	/**
	 * Reconciled amount 消込額.<p>
	 *
	 */
	public void appl_amt(int value) {
		setConstNumber(offset + 5, $appl_amt, value);
	}

	/**
	 * Reconciled amount 消込額.<p>
	 *
	 */
	public void appl_amt(long value) {
		setConstNumber(offset + 5, $appl_amt, value);
	}

	/**
	 * Reconciled amount 消込額.<p>
	 *
	 */
	public void appl_amt(float value) {
		setConstNumber(offset + 5, $appl_amt, value);
	}

	/**
	 * Reconciled amount 消込額.<p>
	 *
	 */
	public void appl_amt(double value) {
		setConstNumber(offset + 5, $appl_amt, value);
	}


	/**
	 * Payment received result No. 入金実績ＮＯ.<p>
	 *
	 */
	public String rcv_act_no() {
		return getConstString(offset + 6, $rcv_act_no);
	}

	/**
	 * Payment received result No. 入金実績ＮＯ.<p>
	 *
	 */
	public void rcv_act_no(String value) {
		setConstString(offset + 6, $rcv_act_no, value);
	}


	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public MCNumber rcv_act_seq() {
		return getConstNumber(offset + 7, $rcv_act_seq);
	}

	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public void rcv_act_seq(MCNumber value) {
		setConstNumber(offset + 7, $rcv_act_seq, value);
	}

	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public void rcv_act_seq(int value) {
		setConstNumber(offset + 7, $rcv_act_seq, value);
	}

	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public void rcv_act_seq(long value) {
		setConstNumber(offset + 7, $rcv_act_seq, value);
	}

	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public void rcv_act_seq(float value) {
		setConstNumber(offset + 7, $rcv_act_seq, value);
	}

	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public void rcv_act_seq(double value) {
		setConstNumber(offset + 7, $rcv_act_seq, value);
	}


	/**
	 * AR reconciliation 売掛消込.<p>
	 *
	 */
	public boolean ar_appl_flg() {
		return getConstBoolean(offset + 8, $ar_appl_flg);
	}

	/**
	 * AR reconciliation 売掛消込.<p>
	 *
	 */
	public void ar_appl_flg(boolean value) {
		setConstBoolean(offset + 8, $ar_appl_flg, value);
	}


	/**
	 * Unnecessary details payment 不要明細消込.<p>
	 *
	 */
	public boolean un_dtl_appl_flg() {
		return getConstBoolean(offset + 9, $un_dtl_appl_flg);
	}

	/**
	 * Unnecessary details payment 不要明細消込.<p>
	 *
	 */
	public void un_dtl_appl_flg(boolean value) {
		setConstBoolean(offset + 9, $un_dtl_appl_flg, value);
	}


	public boolean no_upd_ar_bal_flg() {
		return getConstBoolean(offset + 10, $no_upd_ar_bal_flg);
	}

	public void no_upd_ar_bal_flg(boolean value) {
		setConstBoolean(offset + 10, $no_upd_ar_bal_flg, value);
	}


	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public MCDate rcv_act_ac_ym() {
		return getConstDate(offset + 11, $rcv_act_ac_ym);
	}

	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public void rcv_act_ac_ym(MCDate value) {
		setConstDate(offset + 11, $rcv_act_ac_ym, value);
	}


	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public MCDate ac_ym() {
		return getConstDate(offset + 12, $ac_ym);
	}

	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public void ac_ym(MCDate value) {
		setConstDate(offset + 12, $ac_ym, value);
	}


	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public String acst_cd() {
		return getConstString(offset + 13, $acst_cd);
	}

	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public void acst_cd(String value) {
		setConstString(offset + 13, $acst_cd, value);
	}


	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 14, $iv_no);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 14, $iv_no, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 15, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 15, $wrk_no, value);
	}


	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public String ar_typ() {
		return getConstString(offset + 16, $ar_typ);
	}

	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public void ar_typ(String value) {
		setConstString(offset + 16, $ar_typ, value);
	}


	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 17, $trd_cur_cd);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 17, $trd_cur_cd, value);
	}


	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 18, $ac_dt);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 18, $ac_dt, value);
	}


	/**
	 * Original reconcile amount 元消込額.<p>
	 *
	 */
	public MCNumber org_appl_amt() {
		return getConstNumber(offset + 19, $org_appl_amt);
	}

	/**
	 * Original reconcile amount 元消込額.<p>
	 *
	 */
	public void org_appl_amt(MCNumber value) {
		setConstNumber(offset + 19, $org_appl_amt, value);
	}

	/**
	 * Original reconcile amount 元消込額.<p>
	 *
	 */
	public void org_appl_amt(int value) {
		setConstNumber(offset + 19, $org_appl_amt, value);
	}

	/**
	 * Original reconcile amount 元消込額.<p>
	 *
	 */
	public void org_appl_amt(long value) {
		setConstNumber(offset + 19, $org_appl_amt, value);
	}

	/**
	 * Original reconcile amount 元消込額.<p>
	 *
	 */
	public void org_appl_amt(float value) {
		setConstNumber(offset + 19, $org_appl_amt, value);
	}

	/**
	 * Original reconcile amount 元消込額.<p>
	 *
	 */
	public void org_appl_amt(double value) {
		setConstNumber(offset + 19, $org_appl_amt, value);
	}


	/**
	 * Reconciled balance 消込残高.<p>
	 *
	 */
	public MCNumber not_appl_bal() {
		return getConstNumber(offset + 20, $not_appl_bal);
	}

	/**
	 * Reconciled balance 消込残高.<p>
	 *
	 */
	public void not_appl_bal(MCNumber value) {
		setConstNumber(offset + 20, $not_appl_bal, value);
	}

	/**
	 * Reconciled balance 消込残高.<p>
	 *
	 */
	public void not_appl_bal(int value) {
		setConstNumber(offset + 20, $not_appl_bal, value);
	}

	/**
	 * Reconciled balance 消込残高.<p>
	 *
	 */
	public void not_appl_bal(long value) {
		setConstNumber(offset + 20, $not_appl_bal, value);
	}

	/**
	 * Reconciled balance 消込残高.<p>
	 *
	 */
	public void not_appl_bal(float value) {
		setConstNumber(offset + 20, $not_appl_bal, value);
	}

	/**
	 * Reconciled balance 消込残高.<p>
	 *
	 */
	public void not_appl_bal(double value) {
		setConstNumber(offset + 20, $not_appl_bal, value);
	}


	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public String ar_dpt_cd() {
		return getConstString(offset + 21, $ar_dpt_cd);
	}

	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public void ar_dpt_cd(String value) {
		setConstString(offset + 21, $ar_dpt_cd, value);
	}


	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCNumber xrate() {
		return getConstNumber(offset + 22, $xrate);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		setConstNumber(offset + 22, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(int value) {
		setConstNumber(offset + 22, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(long value) {
		setConstNumber(offset + 22, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(float value) {
		setConstNumber(offset + 22, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(double value) {
		setConstNumber(offset + 22, $xrate, value);
	}


	/**
	 * Rate at transaction 取引時レート.<p>
	 *
	 */
	public MCNumber trd_xrate() {
		return getConstNumber(offset + 23, $trd_xrate);
	}

	/**
	 * Rate at transaction 取引時レート.<p>
	 *
	 */
	public void trd_xrate(MCNumber value) {
		setConstNumber(offset + 23, $trd_xrate, value);
	}

	/**
	 * Rate at transaction 取引時レート.<p>
	 *
	 */
	public void trd_xrate(int value) {
		setConstNumber(offset + 23, $trd_xrate, value);
	}

	/**
	 * Rate at transaction 取引時レート.<p>
	 *
	 */
	public void trd_xrate(long value) {
		setConstNumber(offset + 23, $trd_xrate, value);
	}

	/**
	 * Rate at transaction 取引時レート.<p>
	 *
	 */
	public void trd_xrate(float value) {
		setConstNumber(offset + 23, $trd_xrate, value);
	}

	/**
	 * Rate at transaction 取引時レート.<p>
	 *
	 */
	public void trd_xrate(double value) {
		setConstNumber(offset + 23, $trd_xrate, value);
	}


	/**
	 * Parent slip status type 親伝票状況区分.<p>
	 *
	 */
	public String par_slip_sts_typ() {
		return getConstString(offset + 24, $par_slip_sts_typ);
	}

	/**
	 * Parent slip status type 親伝票状況区分.<p>
	 *
	 */
	public void par_slip_sts_typ(String value) {
		setConstString(offset + 24, $par_slip_sts_typ, value);
	}


	/**
	 * Parent payment received result details No. 親入金実績明細ＮＯ.<p>
	 *
	 */
	public String par_rcv_act_d_no() {
		return getConstString(offset + 25, $par_rcv_act_d_no);
	}

	/**
	 * Parent payment received result details No. 親入金実績明細ＮＯ.<p>
	 *
	 */
	public void par_rcv_act_d_no(String value) {
		setConstString(offset + 25, $par_rcv_act_d_no, value);
	}


	/**
	 * Parent payment received result details sequence number 親入金実績明細連番.<p>
	 *
	 */
	public MCNumber par_rcv_act_d_seq() {
		return getConstNumber(offset + 26, $par_rcv_act_d_seq);
	}

	/**
	 * Parent payment received result details sequence number 親入金実績明細連番.<p>
	 *
	 */
	public void par_rcv_act_d_seq(MCNumber value) {
		setConstNumber(offset + 26, $par_rcv_act_d_seq, value);
	}

	/**
	 * Parent payment received result details sequence number 親入金実績明細連番.<p>
	 *
	 */
	public void par_rcv_act_d_seq(int value) {
		setConstNumber(offset + 26, $par_rcv_act_d_seq, value);
	}

	/**
	 * Parent payment received result details sequence number 親入金実績明細連番.<p>
	 *
	 */
	public void par_rcv_act_d_seq(long value) {
		setConstNumber(offset + 26, $par_rcv_act_d_seq, value);
	}

	/**
	 * Parent payment received result details sequence number 親入金実績明細連番.<p>
	 *
	 */
	public void par_rcv_act_d_seq(float value) {
		setConstNumber(offset + 26, $par_rcv_act_d_seq, value);
	}

	/**
	 * Parent payment received result details sequence number 親入金実績明細連番.<p>
	 *
	 */
	public void par_rcv_act_d_seq(double value) {
		setConstNumber(offset + 26, $par_rcv_act_d_seq, value);
	}


	/**
	 * Old parent payment received result details No. 旧親入金実績明細ＮＯ.<p>
	 *
	 */
	public String par_pre_rcv_act_d_no() {
		return getConstString(offset + 27, $par_pre_rcv_act_d_no);
	}

	/**
	 * Old parent payment received result details No. 旧親入金実績明細ＮＯ.<p>
	 *
	 */
	public void par_pre_rcv_act_d_no(String value) {
		setConstString(offset + 27, $par_pre_rcv_act_d_no, value);
	}


	public String getString(String name) {
		if ($rcv_act_d_no.equalsIgnoreCase(name)) {
			return rcv_act_d_no();
		}
		if ($bill_d_no.equalsIgnoreCase(name)) {
			return bill_d_no();
		}
		if ($parent_bill_d_no.equalsIgnoreCase(name)) {
			return parent_bill_d_no();
		}
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			return bill_mng_no();
		}
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			return rcv_act_no();
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			return ar_typ();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($par_slip_sts_typ.equalsIgnoreCase(name)) {
			return par_slip_sts_typ();
		}
		if ($par_rcv_act_d_no.equalsIgnoreCase(name)) {
			return par_rcv_act_d_no();
		}
		if ($par_pre_rcv_act_d_no.equalsIgnoreCase(name)) {
			return par_pre_rcv_act_d_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			return rcv_act_d_seq();
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			return appl_amt();
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			return rcv_act_seq();
		}
		if ($org_appl_amt.equalsIgnoreCase(name)) {
			return org_appl_amt();
		}
		if ($not_appl_bal.equalsIgnoreCase(name)) {
			return not_appl_bal();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($trd_xrate.equalsIgnoreCase(name)) {
			return trd_xrate();
		}
		if ($par_rcv_act_d_seq.equalsIgnoreCase(name)) {
			return par_rcv_act_d_seq();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($rcv_act_ac_ym.equalsIgnoreCase(name)) {
			return rcv_act_ac_ym();
		}
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($ar_appl_flg.equalsIgnoreCase(name)) {
			return ar_appl_flg();
		}
		if ($un_dtl_appl_flg.equalsIgnoreCase(name)) {
			return un_dtl_appl_flg();
		}
		if ($no_upd_ar_bal_flg.equalsIgnoreCase(name)) {
			return no_upd_ar_bal_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($rcv_act_d_no.equalsIgnoreCase(name)) {
			return rcv_act_d_no();
		}
		if ($bill_d_no.equalsIgnoreCase(name)) {
			return bill_d_no();
		}
		if ($parent_bill_d_no.equalsIgnoreCase(name)) {
			return parent_bill_d_no();
		}
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			return bill_mng_no();
		}
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			return rcv_act_no();
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			return ar_typ();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($par_slip_sts_typ.equalsIgnoreCase(name)) {
			return par_slip_sts_typ();
		}
		if ($par_rcv_act_d_no.equalsIgnoreCase(name)) {
			return par_rcv_act_d_no();
		}
		if ($par_pre_rcv_act_d_no.equalsIgnoreCase(name)) {
			return par_pre_rcv_act_d_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			return rcv_act_d_seq();
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			return appl_amt();
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			return rcv_act_seq();
		}
		if ($org_appl_amt.equalsIgnoreCase(name)) {
			return org_appl_amt();
		}
		if ($not_appl_bal.equalsIgnoreCase(name)) {
			return not_appl_bal();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($trd_xrate.equalsIgnoreCase(name)) {
			return trd_xrate();
		}
		if ($par_rcv_act_d_seq.equalsIgnoreCase(name)) {
			return par_rcv_act_d_seq();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($rcv_act_ac_ym.equalsIgnoreCase(name)) {
			return rcv_act_ac_ym();
		}
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($ar_appl_flg.equalsIgnoreCase(name)) {
			return ar_appl_flg();
		}
		if ($un_dtl_appl_flg.equalsIgnoreCase(name)) {
			return un_dtl_appl_flg();
		}
		if ($no_upd_ar_bal_flg.equalsIgnoreCase(name)) {
			return no_upd_ar_bal_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($rcv_act_d_no.equalsIgnoreCase(name)) {
			rcv_act_d_no(value);
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
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			bill_mng_no(value);
			return;
		}
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			rcv_act_no(value);
			return;
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			ar_typ(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			ar_dpt_cd(value);
			return;
		}
		if ($par_slip_sts_typ.equalsIgnoreCase(name)) {
			par_slip_sts_typ(value);
			return;
		}
		if ($par_rcv_act_d_no.equalsIgnoreCase(name)) {
			par_rcv_act_d_no(value);
			return;
		}
		if ($par_pre_rcv_act_d_no.equalsIgnoreCase(name)) {
			par_pre_rcv_act_d_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			appl_amt(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($org_appl_amt.equalsIgnoreCase(name)) {
			org_appl_amt(value);
			return;
		}
		if ($not_appl_bal.equalsIgnoreCase(name)) {
			not_appl_bal(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($trd_xrate.equalsIgnoreCase(name)) {
			trd_xrate(value);
			return;
		}
		if ($par_rcv_act_d_seq.equalsIgnoreCase(name)) {
			par_rcv_act_d_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			appl_amt(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($org_appl_amt.equalsIgnoreCase(name)) {
			org_appl_amt(value);
			return;
		}
		if ($not_appl_bal.equalsIgnoreCase(name)) {
			not_appl_bal(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($trd_xrate.equalsIgnoreCase(name)) {
			trd_xrate(value);
			return;
		}
		if ($par_rcv_act_d_seq.equalsIgnoreCase(name)) {
			par_rcv_act_d_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			appl_amt(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($org_appl_amt.equalsIgnoreCase(name)) {
			org_appl_amt(value);
			return;
		}
		if ($not_appl_bal.equalsIgnoreCase(name)) {
			not_appl_bal(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($trd_xrate.equalsIgnoreCase(name)) {
			trd_xrate(value);
			return;
		}
		if ($par_rcv_act_d_seq.equalsIgnoreCase(name)) {
			par_rcv_act_d_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			appl_amt(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($org_appl_amt.equalsIgnoreCase(name)) {
			org_appl_amt(value);
			return;
		}
		if ($not_appl_bal.equalsIgnoreCase(name)) {
			not_appl_bal(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($trd_xrate.equalsIgnoreCase(name)) {
			trd_xrate(value);
			return;
		}
		if ($par_rcv_act_d_seq.equalsIgnoreCase(name)) {
			par_rcv_act_d_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			appl_amt(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($org_appl_amt.equalsIgnoreCase(name)) {
			org_appl_amt(value);
			return;
		}
		if ($not_appl_bal.equalsIgnoreCase(name)) {
			not_appl_bal(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($trd_xrate.equalsIgnoreCase(name)) {
			trd_xrate(value);
			return;
		}
		if ($par_rcv_act_d_seq.equalsIgnoreCase(name)) {
			par_rcv_act_d_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($rcv_act_ac_ym.equalsIgnoreCase(name)) {
			rcv_act_ac_ym(value);
			return;
		}
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
		if ($ar_appl_flg.equalsIgnoreCase(name)) {
			ar_appl_flg(value);
			return;
		}
		if ($un_dtl_appl_flg.equalsIgnoreCase(name)) {
			un_dtl_appl_flg(value);
			return;
		}
		if ($no_upd_ar_bal_flg.equalsIgnoreCase(name)) {
			no_upd_ar_bal_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($rcv_act_d_no.equalsIgnoreCase(name)) {
			rcv_act_d_no(value);
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
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			bill_mng_no(value);
			return;
		}
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			rcv_act_no(value);
			return;
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			ar_typ(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			ar_dpt_cd(value);
			return;
		}
		if ($par_slip_sts_typ.equalsIgnoreCase(name)) {
			par_slip_sts_typ(value);
			return;
		}
		if ($par_rcv_act_d_no.equalsIgnoreCase(name)) {
			par_rcv_act_d_no(value);
			return;
		}
		if ($par_pre_rcv_act_d_no.equalsIgnoreCase(name)) {
			par_pre_rcv_act_d_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			appl_amt(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($org_appl_amt.equalsIgnoreCase(name)) {
			org_appl_amt(value);
			return;
		}
		if ($not_appl_bal.equalsIgnoreCase(name)) {
			not_appl_bal(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($trd_xrate.equalsIgnoreCase(name)) {
			trd_xrate(value);
			return;
		}
		if ($par_rcv_act_d_seq.equalsIgnoreCase(name)) {
			par_rcv_act_d_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			appl_amt(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($org_appl_amt.equalsIgnoreCase(name)) {
			org_appl_amt(value);
			return;
		}
		if ($not_appl_bal.equalsIgnoreCase(name)) {
			not_appl_bal(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($trd_xrate.equalsIgnoreCase(name)) {
			trd_xrate(value);
			return;
		}
		if ($par_rcv_act_d_seq.equalsIgnoreCase(name)) {
			par_rcv_act_d_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			appl_amt(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($org_appl_amt.equalsIgnoreCase(name)) {
			org_appl_amt(value);
			return;
		}
		if ($not_appl_bal.equalsIgnoreCase(name)) {
			not_appl_bal(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($trd_xrate.equalsIgnoreCase(name)) {
			trd_xrate(value);
			return;
		}
		if ($par_rcv_act_d_seq.equalsIgnoreCase(name)) {
			par_rcv_act_d_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			appl_amt(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($org_appl_amt.equalsIgnoreCase(name)) {
			org_appl_amt(value);
			return;
		}
		if ($not_appl_bal.equalsIgnoreCase(name)) {
			not_appl_bal(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($trd_xrate.equalsIgnoreCase(name)) {
			trd_xrate(value);
			return;
		}
		if ($par_rcv_act_d_seq.equalsIgnoreCase(name)) {
			par_rcv_act_d_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			appl_amt(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($org_appl_amt.equalsIgnoreCase(name)) {
			org_appl_amt(value);
			return;
		}
		if ($not_appl_bal.equalsIgnoreCase(name)) {
			not_appl_bal(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($trd_xrate.equalsIgnoreCase(name)) {
			trd_xrate(value);
			return;
		}
		if ($par_rcv_act_d_seq.equalsIgnoreCase(name)) {
			par_rcv_act_d_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($rcv_act_ac_ym.equalsIgnoreCase(name)) {
			rcv_act_ac_ym(value);
			return;
		}
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
		if ($ar_appl_flg.equalsIgnoreCase(name)) {
			ar_appl_flg(value);
			return;
		}
		if ($un_dtl_appl_flg.equalsIgnoreCase(name)) {
			un_dtl_appl_flg(value);
			return;
		}
		if ($no_upd_ar_bal_flg.equalsIgnoreCase(name)) {
			no_upd_ar_bal_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

