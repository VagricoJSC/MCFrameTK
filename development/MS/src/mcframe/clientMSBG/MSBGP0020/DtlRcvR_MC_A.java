package mcframe.clientMSBG.MSBGP0020;

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
 * ブロック"DtlRcv"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DtlRcvR_MC_A extends MCConstRow {

	/**
	 * Select 選択.<p>
	 *
	 */
	public static final String $check = "check";
	/**
	 * Billing month 請求年月.<p>
	 *
	 */
	public static final String $bill_ym = "bill_ym";
	/**
	 * Closing date 締日.<p>
	 *
	 */
	public static final String $bill_cl_day = "bill_cl_day";
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	/**
	 * Status type 状況区分.<p>
	 *
	 */
	public static final String $slip_sts_typ = "slip_sts_typ";
	/**
	 * Status 状況.<p>
	 *
	 */
	public static final String $slip_sts_typ_nm = "slip_sts_typ_nm";
	/**
	 * AR transaction group type 債権取引グループ区分.<p>
	 *
	 */
	public static final String $ar_trd_grp_typ = "ar_trd_grp_typ";
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public static final String $trd_cd = "trd_cd";
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public static final String $trd_nm = "trd_nm";
	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public static final String $ar_typ = "ar_typ";
	/**
	 * AR type name 債権区分名.<p>
	 *
	 */
	public static final String $ar_typ_nm = "ar_typ_nm";
	/**
	 * Result No. 実績ＮＯ.<p>
	 *
	 */
	public static final String $act_no = "act_no";
	/**
	 * Result sequence number 実績連番.<p>
	 *
	 */
	public static final String $act_seq = "act_seq";
	/**
	 * Result rev. number 実績改訂番号.<p>
	 *
	 */
	public static final String $act_rev = "act_rev";
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
	 * Payment received method 入金方法.<p>
	 *
	 */
	public static final String $rcv_mtd_cd = "rcv_mtd_cd";
	/**
	 * Payment received method name 入金方法名.<p>
	 *
	 */
	public static final String $rcv_mtd_nm = "rcv_mtd_nm";
	public static final String $amt_p = "amt_p";
	public static final String $setoffAmt_p = "setoffAmt_p";
	public static final String $setoffTaxAmt_p = "setoffTaxAmt_p";
	/**
	 * Offset tax cd. 相殺税ＣＤ.<p>
	 *
	 */
	public static final String $setoff_tax_cd = "setoff_tax_cd";
	/**
	 * Offset tax name 相殺税名.<p>
	 *
	 */
	public static final String $setoff_tax_nm = "setoff_tax_nm";
	/**
	 * Offset tax rate 相殺税率.<p>
	 *
	 */
	public static final String $setoff_tax_rate = "setoff_tax_rate";
	/**
	 * Payment received date 入金日.<p>
	 *
	 */
	public static final String $rcv_dt = "rcv_dt";
	/**
	 * Billing base date 請求起算日.<p>
	 *
	 */
	public static final String $bill_basis_dt = "bill_basis_dt";
	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public static final String $bill_crryovr_times = "bill_crryovr_times";
	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public static final String $wrk_no = "wrk_no";
	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public static final String $wrk_nm = "wrk_nm";
	/**
	 * Invoice details remarks 請求書明細備考.<p>
	 *
	 */
	public static final String $bill_d_rmrks = "bill_d_rmrks";
	/**
	 * Billing details No. 請求明細ＮＯ.<p>
	 *
	 */
	public static final String $bill_d_no = "bill_d_no";
	/**
	 * Billing date 請求年月日.<p>
	 *
	 */
	public static final String $schd_bill_dt = "schd_bill_dt";
	/**
	 * Invoice cancel slip display type 請求書取消伝票表示区分.<p>
	 *
	 */
	public static final String $bill_can_slip_typ = "bill_can_slip_typ";
	/**
	 * Sales temporary unit price closing 売上仮単価締.<p>
	 *
	 */
	public static final String $sls_interim_cl_flg = "sls_interim_cl_flg";
	/**
	 * Display tax amount on invoice 請求書税額表示.<p>
	 *
	 */
	public static final String $bill_tax_disp_flg = "bill_tax_disp_flg";

	public static final String $trd_cur_amt = $amt_p + ".amt";
	public static final String $setoff_amt = $setoffAmt_p + ".amt";
	public static final String $setoff_tax_amt = $setoffTaxAmt_p + ".amt";

	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_ym_META = createCommonMeta($bill_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta bill_cl_day_META = createCommonMeta($bill_cl_day, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta slip_sts_typ_META = createCommonMeta($slip_sts_typ, mcframe.commonMA.meta.MA_META.SLIP_STS_TYP);
	public static final MCMeta slip_sts_typ_nm_META = createCommonMeta($slip_sts_typ_nm, mcframe.commonMA.meta.MA_META.SLIP_STS_TYP_NM);
	public static final MCMeta ar_trd_grp_typ_META = createCommonMeta($ar_trd_grp_typ, mcframe.commonMA.meta.MA_META.AR_TRD_GRP_TYP);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_nm_META = createCommonMeta($trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta ar_typ_META = createCommonMeta($ar_typ, mcframe.commonMA.meta.MA_META.AR_TYP);
	public static final MCMeta ar_typ_nm_META = createCommonMeta($ar_typ_nm, mcframe.commonMA.meta.MA_META.AR_TYP_NM);
	public static final MCMeta act_no_META = createCommonMeta($act_no, mcframe.commonMA.meta.MA_META.ACT_NO);
	public static final MCMeta act_seq_META = createCommonMeta($act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta act_rev_META = createCommonMeta($act_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta act_d_no_META = createCommonMeta($act_d_no, mcframe.commonMA.meta.MA_META.ACT_D_NO);
	public static final MCMeta act_d_seq_META = createCommonMeta($act_d_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta rcv_mtd_cd_META = createCommonMeta($rcv_mtd_cd, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta rcv_mtd_nm_META = createCommonMeta($rcv_mtd_nm, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta amt_p_META = createInnerRowMeta($amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta setoffAmt_p_META = createInnerRowMeta($setoffAmt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta setoffTaxAmt_p_META = createInnerRowMeta($setoffTaxAmt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta setoff_tax_cd_META = createCommonMeta($setoff_tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta setoff_tax_nm_META = createCommonMeta($setoff_tax_nm, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta setoff_tax_rate_META = createCommonMeta($setoff_tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta rcv_dt_META = createCommonMeta($rcv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bill_basis_dt_META = createCommonMeta($bill_basis_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bill_crryovr_times_META = createCommonMeta($bill_crryovr_times, mcframe.commonMA.meta.MA_META.CRRYOVR_TIMES);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta bill_d_rmrks_META = createCommonMeta($bill_d_rmrks, mcframe.commonMS.meta.MS_META.BILL_D_RMRKS);
	public static final MCMeta bill_d_no_META = createCommonMeta($bill_d_no, mcframe.commonMA.meta.MA_META.BILL_D_NO);
	public static final MCMeta schd_bill_dt_META = createCommonMeta($schd_bill_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bill_can_slip_typ_META = createCommonMeta($bill_can_slip_typ, mcframe.commonMA.meta.MA_META.BILL_CAN_SLIP_TYP);
	public static final MCMeta sls_interim_cl_flg_META = createCommonMeta($sls_interim_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_tax_disp_flg_META = createCommonMeta($bill_tax_disp_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<DtlRcvR> constMetas = new ConstMetaList<DtlRcvR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			bill_ym_META,
			bill_cl_day_META,
			ac_dt_META,
			slip_sts_typ_META,
			slip_sts_typ_nm_META,
			ar_trd_grp_typ_META,
			trd_cd_META,
			trd_nm_META,
			ar_typ_META,
			ar_typ_nm_META,
			act_no_META,
			act_seq_META,
			act_rev_META,
			act_d_no_META,
			act_d_seq_META,
			rcv_mtd_cd_META,
			rcv_mtd_nm_META,
			amt_p_META,
			setoffAmt_p_META,
			setoffTaxAmt_p_META,
			setoff_tax_cd_META,
			setoff_tax_nm_META,
			setoff_tax_rate_META,
			rcv_dt_META,
			bill_basis_dt_META,
			bill_crryovr_times_META,
			wrk_no_META,
			wrk_nm_META,
			bill_d_rmrks_META,
			bill_d_no_META,
			schd_bill_dt_META,
			bill_can_slip_typ_META,
			sls_interim_cl_flg_META,
			bill_tax_disp_flg_META
		},
		new String[][]{
			{
				"trd_cur_amt",
				"setoff_amt",
				"setoff_tax_amt"
			},
			{
				$trd_cur_amt,
				$setoff_amt,
				$setoff_tax_amt
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
				{$wrk_no, "WRK"},	// wrk_no
				{$wrk_nm, "WRK"}	// wrk_nm
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
	protected DtlRcvR_MC_A(ConstMetaList<? extends DtlRcvR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlRcvR clone() {
		return (DtlRcvR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlRcvR createInstance() {
		return (DtlRcvR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlRcvR getValues(String... names) {
		return (DtlRcvR) super.getValues(names);
	}



	/**
	 * Select 選択.<p>
	 *
	 */
	public boolean check() {
		return getConstBoolean(offset + 0, $check);
	}

	/**
	 * Select 選択.<p>
	 *
	 */
	public void check(boolean value) {
		setConstBoolean(offset + 0, $check, value);
	}


	/**
	 * Billing month 請求年月.<p>
	 *
	 */
	public MCDate bill_ym() {
		return getConstDate(offset + 1, $bill_ym);
	}

	/**
	 * Billing month 請求年月.<p>
	 *
	 */
	public void bill_ym(MCDate value) {
		setConstDate(offset + 1, $bill_ym, value);
	}


	/**
	 * Closing date 締日.<p>
	 *
	 */
	public MCNumber bill_cl_day() {
		return getConstNumber(offset + 2, $bill_cl_day);
	}

	/**
	 * Closing date 締日.<p>
	 *
	 */
	public void bill_cl_day(MCNumber value) {
		setConstNumber(offset + 2, $bill_cl_day, value);
	}

	/**
	 * Closing date 締日.<p>
	 *
	 */
	public void bill_cl_day(int value) {
		setConstNumber(offset + 2, $bill_cl_day, value);
	}

	/**
	 * Closing date 締日.<p>
	 *
	 */
	public void bill_cl_day(long value) {
		setConstNumber(offset + 2, $bill_cl_day, value);
	}

	/**
	 * Closing date 締日.<p>
	 *
	 */
	public void bill_cl_day(float value) {
		setConstNumber(offset + 2, $bill_cl_day, value);
	}

	/**
	 * Closing date 締日.<p>
	 *
	 */
	public void bill_cl_day(double value) {
		setConstNumber(offset + 2, $bill_cl_day, value);
	}


	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 3, $ac_dt);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 3, $ac_dt, value);
	}


	/**
	 * Status type 状況区分.<p>
	 *
	 */
	public String slip_sts_typ() {
		return getConstString(offset + 4, $slip_sts_typ);
	}

	/**
	 * Status type 状況区分.<p>
	 *
	 */
	public void slip_sts_typ(String value) {
		setConstString(offset + 4, $slip_sts_typ, value);
	}


	/**
	 * Status 状況.<p>
	 *
	 */
	public String slip_sts_typ_nm() {
		return getConstString(offset + 5, $slip_sts_typ_nm);
	}

	/**
	 * Status 状況.<p>
	 *
	 */
	public void slip_sts_typ_nm(String value) {
		setConstString(offset + 5, $slip_sts_typ_nm, value);
	}


	/**
	 * AR transaction group type 債権取引グループ区分.<p>
	 *
	 */
	public String ar_trd_grp_typ() {
		return getConstString(offset + 6, $ar_trd_grp_typ);
	}

	/**
	 * AR transaction group type 債権取引グループ区分.<p>
	 *
	 */
	public void ar_trd_grp_typ(String value) {
		setConstString(offset + 6, $ar_trd_grp_typ, value);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 7, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 7, $trd_cd, value);
	}


	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 8, $trd_nm);
	}

	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 8, $trd_nm, value);
	}


	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public String ar_typ() {
		return getConstString(offset + 9, $ar_typ);
	}

	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public void ar_typ(String value) {
		setConstString(offset + 9, $ar_typ, value);
	}


	/**
	 * AR type name 債権区分名.<p>
	 *
	 */
	public String ar_typ_nm() {
		return getConstString(offset + 10, $ar_typ_nm);
	}

	/**
	 * AR type name 債権区分名.<p>
	 *
	 */
	public void ar_typ_nm(String value) {
		setConstString(offset + 10, $ar_typ_nm, value);
	}


	/**
	 * Result No. 実績ＮＯ.<p>
	 *
	 */
	public String act_no() {
		return getConstString(offset + 11, $act_no);
	}

	/**
	 * Result No. 実績ＮＯ.<p>
	 *
	 */
	public void act_no(String value) {
		setConstString(offset + 11, $act_no, value);
	}


	/**
	 * Result sequence number 実績連番.<p>
	 *
	 */
	public MCNumber act_seq() {
		return getConstNumber(offset + 12, $act_seq);
	}

	/**
	 * Result sequence number 実績連番.<p>
	 *
	 */
	public void act_seq(MCNumber value) {
		setConstNumber(offset + 12, $act_seq, value);
	}

	/**
	 * Result sequence number 実績連番.<p>
	 *
	 */
	public void act_seq(int value) {
		setConstNumber(offset + 12, $act_seq, value);
	}

	/**
	 * Result sequence number 実績連番.<p>
	 *
	 */
	public void act_seq(long value) {
		setConstNumber(offset + 12, $act_seq, value);
	}

	/**
	 * Result sequence number 実績連番.<p>
	 *
	 */
	public void act_seq(float value) {
		setConstNumber(offset + 12, $act_seq, value);
	}

	/**
	 * Result sequence number 実績連番.<p>
	 *
	 */
	public void act_seq(double value) {
		setConstNumber(offset + 12, $act_seq, value);
	}


	/**
	 * Result rev. number 実績改訂番号.<p>
	 *
	 */
	public MCNumber act_rev() {
		return getConstNumber(offset + 13, $act_rev);
	}

	/**
	 * Result rev. number 実績改訂番号.<p>
	 *
	 */
	public void act_rev(MCNumber value) {
		setConstNumber(offset + 13, $act_rev, value);
	}

	/**
	 * Result rev. number 実績改訂番号.<p>
	 *
	 */
	public void act_rev(int value) {
		setConstNumber(offset + 13, $act_rev, value);
	}

	/**
	 * Result rev. number 実績改訂番号.<p>
	 *
	 */
	public void act_rev(long value) {
		setConstNumber(offset + 13, $act_rev, value);
	}

	/**
	 * Result rev. number 実績改訂番号.<p>
	 *
	 */
	public void act_rev(float value) {
		setConstNumber(offset + 13, $act_rev, value);
	}

	/**
	 * Result rev. number 実績改訂番号.<p>
	 *
	 */
	public void act_rev(double value) {
		setConstNumber(offset + 13, $act_rev, value);
	}


	/**
	 * Result details No. 実績明細ＮＯ.<p>
	 *
	 */
	public String act_d_no() {
		return getConstString(offset + 14, $act_d_no);
	}

	/**
	 * Result details No. 実績明細ＮＯ.<p>
	 *
	 */
	public void act_d_no(String value) {
		setConstString(offset + 14, $act_d_no, value);
	}


	/**
	 * Result details sequence number 実績明細連番.<p>
	 *
	 */
	public MCNumber act_d_seq() {
		return getConstNumber(offset + 15, $act_d_seq);
	}

	/**
	 * Result details sequence number 実績明細連番.<p>
	 *
	 */
	public void act_d_seq(MCNumber value) {
		setConstNumber(offset + 15, $act_d_seq, value);
	}

	/**
	 * Result details sequence number 実績明細連番.<p>
	 *
	 */
	public void act_d_seq(int value) {
		setConstNumber(offset + 15, $act_d_seq, value);
	}

	/**
	 * Result details sequence number 実績明細連番.<p>
	 *
	 */
	public void act_d_seq(long value) {
		setConstNumber(offset + 15, $act_d_seq, value);
	}

	/**
	 * Result details sequence number 実績明細連番.<p>
	 *
	 */
	public void act_d_seq(float value) {
		setConstNumber(offset + 15, $act_d_seq, value);
	}

	/**
	 * Result details sequence number 実績明細連番.<p>
	 *
	 */
	public void act_d_seq(double value) {
		setConstNumber(offset + 15, $act_d_seq, value);
	}


	/**
	 * Payment received method 入金方法.<p>
	 *
	 */
	public String rcv_mtd_cd() {
		return getConstString(offset + 16, $rcv_mtd_cd);
	}

	/**
	 * Payment received method 入金方法.<p>
	 *
	 */
	public void rcv_mtd_cd(String value) {
		setConstString(offset + 16, $rcv_mtd_cd, value);
	}


	/**
	 * Payment received method name 入金方法名.<p>
	 *
	 */
	public String rcv_mtd_nm() {
		return getConstString(offset + 17, $rcv_mtd_nm);
	}

	/**
	 * Payment received method name 入金方法名.<p>
	 *
	 */
	public void rcv_mtd_nm(String value) {
		setConstString(offset + 17, $rcv_mtd_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 18, $amt_p);
	}
	
	public void amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 18, $amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR setoffAmt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 19, $setoffAmt_p);
	}
	
	public void setoffAmt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 19, $setoffAmt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR setoffTaxAmt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 20, $setoffTaxAmt_p);
	}
	
	public void setoffTaxAmt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 20, $setoffTaxAmt_p, row);
	}


	/**
	 * Offset tax cd. 相殺税ＣＤ.<p>
	 *
	 */
	public String setoff_tax_cd() {
		return getConstString(offset + 21, $setoff_tax_cd);
	}

	/**
	 * Offset tax cd. 相殺税ＣＤ.<p>
	 *
	 */
	public void setoff_tax_cd(String value) {
		setConstString(offset + 21, $setoff_tax_cd, value);
	}


	/**
	 * Offset tax name 相殺税名.<p>
	 *
	 */
	public String setoff_tax_nm() {
		return getConstString(offset + 22, $setoff_tax_nm);
	}

	/**
	 * Offset tax name 相殺税名.<p>
	 *
	 */
	public void setoff_tax_nm(String value) {
		setConstString(offset + 22, $setoff_tax_nm, value);
	}


	/**
	 * Offset tax rate 相殺税率.<p>
	 *
	 */
	public MCNumber setoff_tax_rate() {
		return getConstNumber(offset + 23, $setoff_tax_rate);
	}

	/**
	 * Offset tax rate 相殺税率.<p>
	 *
	 */
	public void setoff_tax_rate(MCNumber value) {
		setConstNumber(offset + 23, $setoff_tax_rate, value);
	}

	/**
	 * Offset tax rate 相殺税率.<p>
	 *
	 */
	public void setoff_tax_rate(int value) {
		setConstNumber(offset + 23, $setoff_tax_rate, value);
	}

	/**
	 * Offset tax rate 相殺税率.<p>
	 *
	 */
	public void setoff_tax_rate(long value) {
		setConstNumber(offset + 23, $setoff_tax_rate, value);
	}

	/**
	 * Offset tax rate 相殺税率.<p>
	 *
	 */
	public void setoff_tax_rate(float value) {
		setConstNumber(offset + 23, $setoff_tax_rate, value);
	}

	/**
	 * Offset tax rate 相殺税率.<p>
	 *
	 */
	public void setoff_tax_rate(double value) {
		setConstNumber(offset + 23, $setoff_tax_rate, value);
	}


	/**
	 * Payment received date 入金日.<p>
	 *
	 */
	public MCDate rcv_dt() {
		return getConstDate(offset + 24, $rcv_dt);
	}

	/**
	 * Payment received date 入金日.<p>
	 *
	 */
	public void rcv_dt(MCDate value) {
		setConstDate(offset + 24, $rcv_dt, value);
	}


	/**
	 * Billing base date 請求起算日.<p>
	 *
	 */
	public MCDate bill_basis_dt() {
		return getConstDate(offset + 25, $bill_basis_dt);
	}

	/**
	 * Billing base date 請求起算日.<p>
	 *
	 */
	public void bill_basis_dt(MCDate value) {
		setConstDate(offset + 25, $bill_basis_dt, value);
	}


	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public MCNumber bill_crryovr_times() {
		return getConstNumber(offset + 26, $bill_crryovr_times);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(MCNumber value) {
		setConstNumber(offset + 26, $bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(int value) {
		setConstNumber(offset + 26, $bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(long value) {
		setConstNumber(offset + 26, $bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(float value) {
		setConstNumber(offset + 26, $bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(double value) {
		setConstNumber(offset + 26, $bill_crryovr_times, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 27, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 27, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 28, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 28, $wrk_nm, value);
	}


	/**
	 * Invoice details remarks 請求書明細備考.<p>
	 *
	 */
	public String bill_d_rmrks() {
		return getConstString(offset + 29, $bill_d_rmrks);
	}

	/**
	 * Invoice details remarks 請求書明細備考.<p>
	 *
	 */
	public void bill_d_rmrks(String value) {
		setConstString(offset + 29, $bill_d_rmrks, value);
	}


	/**
	 * Billing details No. 請求明細ＮＯ.<p>
	 *
	 */
	public String bill_d_no() {
		return getConstString(offset + 30, $bill_d_no);
	}

	/**
	 * Billing details No. 請求明細ＮＯ.<p>
	 *
	 */
	public void bill_d_no(String value) {
		setConstString(offset + 30, $bill_d_no, value);
	}


	/**
	 * Billing date 請求年月日.<p>
	 *
	 */
	public MCDate schd_bill_dt() {
		return getConstDate(offset + 31, $schd_bill_dt);
	}

	/**
	 * Billing date 請求年月日.<p>
	 *
	 */
	public void schd_bill_dt(MCDate value) {
		setConstDate(offset + 31, $schd_bill_dt, value);
	}


	/**
	 * Invoice cancel slip display type 請求書取消伝票表示区分.<p>
	 *
	 */
	public String bill_can_slip_typ() {
		return getConstString(offset + 32, $bill_can_slip_typ);
	}

	/**
	 * Invoice cancel slip display type 請求書取消伝票表示区分.<p>
	 *
	 */
	public void bill_can_slip_typ(String value) {
		setConstString(offset + 32, $bill_can_slip_typ, value);
	}


	/**
	 * Sales temporary unit price closing 売上仮単価締.<p>
	 *
	 */
	public boolean sls_interim_cl_flg() {
		return getConstBoolean(offset + 33, $sls_interim_cl_flg);
	}

	/**
	 * Sales temporary unit price closing 売上仮単価締.<p>
	 *
	 */
	public void sls_interim_cl_flg(boolean value) {
		setConstBoolean(offset + 33, $sls_interim_cl_flg, value);
	}


	/**
	 * Display tax amount on invoice 請求書税額表示.<p>
	 *
	 */
	public boolean bill_tax_disp_flg() {
		return getConstBoolean(offset + 34, $bill_tax_disp_flg);
	}

	/**
	 * Display tax amount on invoice 請求書税額表示.<p>
	 *
	 */
	public void bill_tax_disp_flg(boolean value) {
		setConstBoolean(offset + 34, $bill_tax_disp_flg, value);
	}


	public String getString(String name) {
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			return slip_sts_typ();
		}
		if ($slip_sts_typ_nm.equalsIgnoreCase(name)) {
			return slip_sts_typ_nm();
		}
		if ($ar_trd_grp_typ.equalsIgnoreCase(name)) {
			return ar_trd_grp_typ();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			return ar_typ();
		}
		if ($ar_typ_nm.equalsIgnoreCase(name)) {
			return ar_typ_nm();
		}
		if ($act_no.equalsIgnoreCase(name)) {
			return act_no();
		}
		if ($act_d_no.equalsIgnoreCase(name)) {
			return act_d_no();
		}
		if ($rcv_mtd_cd.equalsIgnoreCase(name)) {
			return rcv_mtd_cd();
		}
		if ($rcv_mtd_nm.equalsIgnoreCase(name)) {
			return rcv_mtd_nm();
		}
		if ($setoff_tax_cd.equalsIgnoreCase(name)) {
			return setoff_tax_cd();
		}
		if ($setoff_tax_nm.equalsIgnoreCase(name)) {
			return setoff_tax_nm();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($bill_d_rmrks.equalsIgnoreCase(name)) {
			return bill_d_rmrks();
		}
		if ($bill_d_no.equalsIgnoreCase(name)) {
			return bill_d_no();
		}
		if ($bill_can_slip_typ.equalsIgnoreCase(name)) {
			return bill_can_slip_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			return bill_cl_day();
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			return act_seq();
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			return act_rev();
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			return act_d_seq();
		}
		if ($setoff_tax_rate.equalsIgnoreCase(name)) {
			return setoff_tax_rate();
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			return bill_crryovr_times();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($bill_ym.equalsIgnoreCase(name)) {
			return bill_ym();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($rcv_dt.equalsIgnoreCase(name)) {
			return rcv_dt();
		}
		if ($bill_basis_dt.equalsIgnoreCase(name)) {
			return bill_basis_dt();
		}
		if ($schd_bill_dt.equalsIgnoreCase(name)) {
			return schd_bill_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($sls_interim_cl_flg.equalsIgnoreCase(name)) {
			return sls_interim_cl_flg();
		}
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
		if ($ar_trd_grp_typ.equalsIgnoreCase(name)) {
			return ar_trd_grp_typ();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			return ar_typ();
		}
		if ($ar_typ_nm.equalsIgnoreCase(name)) {
			return ar_typ_nm();
		}
		if ($act_no.equalsIgnoreCase(name)) {
			return act_no();
		}
		if ($act_d_no.equalsIgnoreCase(name)) {
			return act_d_no();
		}
		if ($rcv_mtd_cd.equalsIgnoreCase(name)) {
			return rcv_mtd_cd();
		}
		if ($rcv_mtd_nm.equalsIgnoreCase(name)) {
			return rcv_mtd_nm();
		}
		if ($setoff_tax_cd.equalsIgnoreCase(name)) {
			return setoff_tax_cd();
		}
		if ($setoff_tax_nm.equalsIgnoreCase(name)) {
			return setoff_tax_nm();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($bill_d_rmrks.equalsIgnoreCase(name)) {
			return bill_d_rmrks();
		}
		if ($bill_d_no.equalsIgnoreCase(name)) {
			return bill_d_no();
		}
		if ($bill_can_slip_typ.equalsIgnoreCase(name)) {
			return bill_can_slip_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			return bill_cl_day();
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			return act_seq();
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			return act_rev();
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			return act_d_seq();
		}
		if ($setoff_tax_rate.equalsIgnoreCase(name)) {
			return setoff_tax_rate();
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			return bill_crryovr_times();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($bill_ym.equalsIgnoreCase(name)) {
			return bill_ym();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($rcv_dt.equalsIgnoreCase(name)) {
			return rcv_dt();
		}
		if ($bill_basis_dt.equalsIgnoreCase(name)) {
			return bill_basis_dt();
		}
		if ($schd_bill_dt.equalsIgnoreCase(name)) {
			return schd_bill_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($sls_interim_cl_flg.equalsIgnoreCase(name)) {
			return sls_interim_cl_flg();
		}
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
		if ($ar_trd_grp_typ.equalsIgnoreCase(name)) {
			ar_trd_grp_typ(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			ar_typ(value);
			return;
		}
		if ($ar_typ_nm.equalsIgnoreCase(name)) {
			ar_typ_nm(value);
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
		if ($rcv_mtd_cd.equalsIgnoreCase(name)) {
			rcv_mtd_cd(value);
			return;
		}
		if ($rcv_mtd_nm.equalsIgnoreCase(name)) {
			rcv_mtd_nm(value);
			return;
		}
		if ($setoff_tax_cd.equalsIgnoreCase(name)) {
			setoff_tax_cd(value);
			return;
		}
		if ($setoff_tax_nm.equalsIgnoreCase(name)) {
			setoff_tax_nm(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
			return;
		}
		if ($bill_d_rmrks.equalsIgnoreCase(name)) {
			bill_d_rmrks(value);
			return;
		}
		if ($bill_d_no.equalsIgnoreCase(name)) {
			bill_d_no(value);
			return;
		}
		if ($bill_can_slip_typ.equalsIgnoreCase(name)) {
			bill_can_slip_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($setoff_tax_rate.equalsIgnoreCase(name)) {
			setoff_tax_rate(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($setoff_tax_rate.equalsIgnoreCase(name)) {
			setoff_tax_rate(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($setoff_tax_rate.equalsIgnoreCase(name)) {
			setoff_tax_rate(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($setoff_tax_rate.equalsIgnoreCase(name)) {
			setoff_tax_rate(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($setoff_tax_rate.equalsIgnoreCase(name)) {
			setoff_tax_rate(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($bill_ym.equalsIgnoreCase(name)) {
			bill_ym(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($rcv_dt.equalsIgnoreCase(name)) {
			rcv_dt(value);
			return;
		}
		if ($bill_basis_dt.equalsIgnoreCase(name)) {
			bill_basis_dt(value);
			return;
		}
		if ($schd_bill_dt.equalsIgnoreCase(name)) {
			schd_bill_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($sls_interim_cl_flg.equalsIgnoreCase(name)) {
			sls_interim_cl_flg(value);
			return;
		}
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
		if ($ar_trd_grp_typ.equalsIgnoreCase(name)) {
			ar_trd_grp_typ(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			ar_typ(value);
			return;
		}
		if ($ar_typ_nm.equalsIgnoreCase(name)) {
			ar_typ_nm(value);
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
		if ($rcv_mtd_cd.equalsIgnoreCase(name)) {
			rcv_mtd_cd(value);
			return;
		}
		if ($rcv_mtd_nm.equalsIgnoreCase(name)) {
			rcv_mtd_nm(value);
			return;
		}
		if ($setoff_tax_cd.equalsIgnoreCase(name)) {
			setoff_tax_cd(value);
			return;
		}
		if ($setoff_tax_nm.equalsIgnoreCase(name)) {
			setoff_tax_nm(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
			return;
		}
		if ($bill_d_rmrks.equalsIgnoreCase(name)) {
			bill_d_rmrks(value);
			return;
		}
		if ($bill_d_no.equalsIgnoreCase(name)) {
			bill_d_no(value);
			return;
		}
		if ($bill_can_slip_typ.equalsIgnoreCase(name)) {
			bill_can_slip_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($setoff_tax_rate.equalsIgnoreCase(name)) {
			setoff_tax_rate(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($setoff_tax_rate.equalsIgnoreCase(name)) {
			setoff_tax_rate(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($setoff_tax_rate.equalsIgnoreCase(name)) {
			setoff_tax_rate(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($setoff_tax_rate.equalsIgnoreCase(name)) {
			setoff_tax_rate(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($setoff_tax_rate.equalsIgnoreCase(name)) {
			setoff_tax_rate(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($bill_ym.equalsIgnoreCase(name)) {
			bill_ym(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($rcv_dt.equalsIgnoreCase(name)) {
			rcv_dt(value);
			return;
		}
		if ($bill_basis_dt.equalsIgnoreCase(name)) {
			bill_basis_dt(value);
			return;
		}
		if ($schd_bill_dt.equalsIgnoreCase(name)) {
			schd_bill_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($sls_interim_cl_flg.equalsIgnoreCase(name)) {
			sls_interim_cl_flg(value);
			return;
		}
		if ($bill_tax_disp_flg.equalsIgnoreCase(name)) {
			bill_tax_disp_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($amt_p.equalsIgnoreCase(name)) {
			return amt_p();
		}
		if ($setoffAmt_p.equalsIgnoreCase(name)) {
			return setoffAmt_p();
		}
		if ($setoffTaxAmt_p.equalsIgnoreCase(name)) {
			return setoffTaxAmt_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($amt_p.equalsIgnoreCase(name)) {
			amt_p(
				((MCContainerMeta) amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($setoffAmt_p.equalsIgnoreCase(name)) {
			setoffAmt_p(
				((MCContainerMeta) setoffAmt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($setoffTaxAmt_p.equalsIgnoreCase(name)) {
			setoffTaxAmt_p(
				((MCContainerMeta) setoffTaxAmt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return amt_p().amt();
	}

	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		amt_p().amt(value);
	}

	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		amt_p().amt(value);
	}

	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		amt_p().amt(value);
	}

	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		amt_p().amt(value);
	}

	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		amt_p().amt(value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public MCNumber setoff_amt() {
		return setoffAmt_p().amt();
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void setoff_amt(MCNumber value) {
		setoffAmt_p().amt(value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void setoff_amt(int value) {
		setoffAmt_p().amt(value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void setoff_amt(long value) {
		setoffAmt_p().amt(value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void setoff_amt(float value) {
		setoffAmt_p().amt(value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void setoff_amt(double value) {
		setoffAmt_p().amt(value);
	}

	/**
	 * Tax inclusive amount 内税額.<p>
	 *
	 */
	public MCNumber setoff_tax_amt() {
		return setoffTaxAmt_p().amt();
	}

	/**
	 * Tax inclusive amount 内税額.<p>
	 *
	 */
	public void setoff_tax_amt(MCNumber value) {
		setoffTaxAmt_p().amt(value);
	}

	/**
	 * Tax inclusive amount 内税額.<p>
	 *
	 */
	public void setoff_tax_amt(int value) {
		setoffTaxAmt_p().amt(value);
	}

	/**
	 * Tax inclusive amount 内税額.<p>
	 *
	 */
	public void setoff_tax_amt(long value) {
		setoffTaxAmt_p().amt(value);
	}

	/**
	 * Tax inclusive amount 内税額.<p>
	 *
	 */
	public void setoff_tax_amt(float value) {
		setoffTaxAmt_p().amt(value);
	}

	/**
	 * Tax inclusive amount 内税額.<p>
	 *
	 */
	public void setoff_tax_amt(double value) {
		setoffTaxAmt_p().amt(value);
	}

}

