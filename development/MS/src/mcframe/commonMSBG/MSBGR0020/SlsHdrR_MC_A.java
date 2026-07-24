package mcframe.commonMSBG.MSBGR0020;

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
 * ブロック"SlsHdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class SlsHdrR_MC_A extends MCConstRow {

	/**
	 *  請求年.<p>
	 *
	 */
	public static final String $bill_ym = "bill_ym";
	/**
	 *  請求締日.<p>
	 *
	 */
	public static final String $bill_cl_day = "bill_cl_day";
	/**
	 *  請求日.<p>
	 *
	 */
	public static final String $bill_dt = "bill_dt";
	/**
	 *  再発行.<p>
	 *
	 */
	public static final String $re_issue = "re_issue";
	/**
	 *  発行日（発行年）.<p>
	 *
	 */
	public static final String $prnt_tm = "prnt_tm";
	/**
	 *  請求書ＮＯ.<p>
	 *
	 */
	public static final String $bill_no = "bill_no";
	/**
	 *  案件.<p>
	 *
	 */
	public static final String $wrk_no = "wrk_no";
	/**
	 *  貴社案件名.<p>
	 *
	 */
	public static final String $wrk_nm = "wrk_nm";
	/**
	 *  取引先ＣＤ.<p>
	 *
	 */
	public static final String $bp_cd = "bp_cd";
	/**
	 *  取引先郵便番号.<p>
	 *
	 */
	public static final String $bp_zip_cd = "bp_zip_cd";
	/**
	 *  取引先住所１.<p>
	 *
	 */
	public static final String $bp_addr1 = "bp_addr1";
	/**
	 *  取引先住所２.<p>
	 *
	 */
	public static final String $bp_addr2 = "bp_addr2";
	/**
	 *  取引先住所３.<p>
	 *
	 */
	public static final String $bp_addr3 = "bp_addr3";
	/**
	 *  取引先住所４.<p>
	 *
	 */
	public static final String $bp_addr4 = "bp_addr4";
	/**
	 *  取引先住所.<p>
	 *
	 */
	public static final String $bp_addr = "bp_addr";
	/**
	 *  宛先.<p>
	 *
	 */
	public static final String $bp_nm = "bp_nm";
	/**
	 *  宛先別名１.<p>
	 *
	 */
	public static final String $bp_alt_nm1 = "bp_alt_nm1";
	/**
	 *  宛先別名２.<p>
	 *
	 */
	public static final String $bp_alt_nm2 = "bp_alt_nm2";
	/**
	 *  宛先別名３.<p>
	 *
	 */
	public static final String $bp_alt_nm3 = "bp_alt_nm3";
	/**
	 *  宛先別名４.<p>
	 *
	 */
	public static final String $bp_alt_nm4 = "bp_alt_nm4";
	/**
	 *  ＴＥＬ.<p>
	 *
	 */
	public static final String $bp_tel = "bp_tel";
	/**
	 *  取引先国名.<p>
	 *
	 */
	public static final String $bp_cntry_nm = "bp_cntry_nm";
	/**
	 *  会社.<p>
	 *
	 */
	public static final String $co_cd = "co_cd";
	/**
	 *  自社郵便番号.<p>
	 *
	 */
	public static final String $zip_cd = "zip_cd";
	/**
	 *  住所１.<p>
	 *
	 */
	public static final String $addr1 = "addr1";
	/**
	 *  住所２.<p>
	 *
	 */
	public static final String $addr2 = "addr2";
	/**
	 *  住所３.<p>
	 *
	 */
	public static final String $addr3 = "addr3";
	/**
	 *  住所４.<p>
	 *
	 */
	public static final String $addr4 = "addr4";
	/**
	 *  住所.<p>
	 *
	 */
	public static final String $addr = "addr";
	/**
	 *  会社名.<p>
	 *
	 */
	public static final String $co_nm = "co_nm";
	/**
	 *  国名.<p>
	 *
	 */
	public static final String $cntry_nm = "cntry_nm";
	/**
	 *  部門.<p>
	 *
	 */
	public static final String $bill_dpt_cd = "bill_dpt_cd";
	/**
	 *  部門名.<p>
	 *
	 */
	public static final String $dpt_nm = "dpt_nm";
	/**
	 *  ＴＥＬ.<p>
	 *
	 */
	public static final String $dpt_tel = "dpt_tel";
	/**
	 *  事業者番号.<p>
	 *
	 */
	public static final String $biz_co_no = "biz_co_no";
	/**
	 *  お買い上げ額合計（金額）.<p>
	 *
	 */
	public static final String $bill_amt = "bill_amt";
	/**
	 *  お買い上げ額合計（金額）文字列.<p>
	 *
	 */
	public static final String $s_bill_amt = "s_bill_amt";
	/**
	 *  通貨ＣＤ.<p>
	 *
	 */
	public static final String $cur_cd = "cur_cd";
	/**
	 *  お買い上げ額合計（通貨名）.<p>
	 *
	 */
	public static final String $cur_nm = "cur_nm";
	/**
	 *  お買い上げ額.<p>
	 *
	 */
	public static final String $sls_amt = "sls_amt";
	/**
	 *  お買い上げ額文字列.<p>
	 *
	 */
	public static final String $s_sls_amt = "s_sls_amt";
	/**
	 *  値引額.<p>
	 *
	 */
	public static final String $dscnt_amt = "dscnt_amt";
	/**
	 *  値引額文字列.<p>
	 *
	 */
	public static final String $s_dscnt_amt = "s_dscnt_amt";
	/**
	 *  ご返品額.<p>
	 *
	 */
	public static final String $ret_amt = "ret_amt";
	/**
	 *  ご返品額文字列.<p>
	 *
	 */
	public static final String $s_ret_amt = "s_ret_amt";
	/**
	 *  税額.<p>
	 *
	 */
	public static final String $tax_amt = "tax_amt";
	/**
	 *  税額文字列.<p>
	 *
	 */
	public static final String $s_tax_amt = "s_tax_amt";
	/**
	 *  予備１.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	/**
	 *  予備２.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	/**
	 *  予備３.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";


	public static final MCMeta bill_ym_META = createCommonMeta($bill_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta bill_cl_day_META = createCommonMeta($bill_cl_day, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta bill_dt_META = createCommonMeta($bill_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta re_issue_META = createStringMeta($re_issue);
	public static final MCMeta prnt_tm_META = createCommonMeta($prnt_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta bill_no_META = createCommonMeta($bill_no, mcframe.commonMA.meta.MA_META.BILL_NO);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta bp_cd_META = createCommonMeta($bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bp_zip_cd_META = createCommonMeta($bp_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta bp_addr1_META = createCommonMeta($bp_addr1, mcframe.commonMA.meta.MA_META.ADDR1);
	public static final MCMeta bp_addr2_META = createCommonMeta($bp_addr2, mcframe.commonMA.meta.MA_META.ADDR2);
	public static final MCMeta bp_addr3_META = createCommonMeta($bp_addr3, mcframe.commonMA.meta.MA_META.ADDR3);
	public static final MCMeta bp_addr4_META = createCommonMeta($bp_addr4, mcframe.commonMA.meta.MA_META.ADDR4);
	public static final MCMeta bp_addr_META = createStringMeta($bp_addr);
	public static final MCMeta bp_nm_META = createCommonMeta($bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bp_alt_nm1_META = createCommonMeta($bp_alt_nm1, mcframe.commonMA.meta.MA_META.BP_ALT_NM1);
	public static final MCMeta bp_alt_nm2_META = createCommonMeta($bp_alt_nm2, mcframe.commonMA.meta.MA_META.BP_ALT_NM2);
	public static final MCMeta bp_alt_nm3_META = createCommonMeta($bp_alt_nm3, mcframe.commonMA.meta.MA_META.BP_ALT_NM3);
	public static final MCMeta bp_alt_nm4_META = createCommonMeta($bp_alt_nm4, mcframe.commonMA.meta.MA_META.BP_ALT_NM4);
	public static final MCMeta bp_tel_META = createCommonMeta($bp_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta bp_cntry_nm_META = createCommonMeta($bp_cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta co_cd_META = createCommonMeta($co_cd, mcframe.commonMA.meta.MA_META.CO_CD);
	public static final MCMeta zip_cd_META = createCommonMeta($zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta addr1_META = createCommonMeta($addr1, mcframe.commonMA.meta.MA_META.ADDR1);
	public static final MCMeta addr2_META = createCommonMeta($addr2, mcframe.commonMA.meta.MA_META.ADDR2);
	public static final MCMeta addr3_META = createCommonMeta($addr3, mcframe.commonMA.meta.MA_META.ADDR3);
	public static final MCMeta addr4_META = createCommonMeta($addr4, mcframe.commonMA.meta.MA_META.ADDR4);
	public static final MCMeta addr_META = createStringMeta($addr);
	public static final MCMeta co_nm_META = createCommonMeta($co_nm, mcframe.commonMA.meta.MA_META.CO_NM);
	public static final MCMeta cntry_nm_META = createCommonMeta($cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta bill_dpt_cd_META = createCommonMeta($bill_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta dpt_nm_META = createCommonMeta($dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta dpt_tel_META = createCommonMeta($dpt_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta biz_co_no_META = createStringMeta($biz_co_no);
	public static final MCMeta bill_amt_META = createCommonMeta($bill_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_bill_amt_META = createStringMeta($s_bill_amt);
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta cur_nm_META = createCommonMeta($cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta sls_amt_META = createCommonMeta($sls_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_sls_amt_META = createStringMeta($s_sls_amt);
	public static final MCMeta dscnt_amt_META = createCommonMeta($dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_dscnt_amt_META = createStringMeta($s_dscnt_amt);
	public static final MCMeta ret_amt_META = createCommonMeta($ret_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_ret_amt_META = createStringMeta($s_ret_amt);
	public static final MCMeta tax_amt_META = createCommonMeta($tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_tax_amt_META = createStringMeta($s_tax_amt);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.BILL_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.BILL_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.BILL_SUB_CHAR3);

	protected static final ConstMetaList<SlsHdrR> constMetas = new ConstMetaList<SlsHdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			bill_ym_META,
			bill_cl_day_META,
			bill_dt_META,
			re_issue_META,
			prnt_tm_META,
			bill_no_META,
			wrk_no_META,
			wrk_nm_META,
			bp_cd_META,
			bp_zip_cd_META,
			bp_addr1_META,
			bp_addr2_META,
			bp_addr3_META,
			bp_addr4_META,
			bp_addr_META,
			bp_nm_META,
			bp_alt_nm1_META,
			bp_alt_nm2_META,
			bp_alt_nm3_META,
			bp_alt_nm4_META,
			bp_tel_META,
			bp_cntry_nm_META,
			co_cd_META,
			zip_cd_META,
			addr1_META,
			addr2_META,
			addr3_META,
			addr4_META,
			addr_META,
			co_nm_META,
			cntry_nm_META,
			bill_dpt_cd_META,
			dpt_nm_META,
			dpt_tel_META,
			biz_co_no_META,
			bill_amt_META,
			s_bill_amt_META,
			cur_cd_META,
			cur_nm_META,
			sls_amt_META,
			s_sls_amt_META,
			dscnt_amt_META,
			s_dscnt_amt_META,
			ret_amt_META,
			s_ret_amt_META,
			tax_amt_META,
			s_tax_amt_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META
		},
		new String[][]{
			{
			},
			{
			}
		}
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
	 * コンストラクタです。
	 */
	protected SlsHdrR_MC_A(ConstMetaList<? extends SlsHdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SlsHdrR clone() {
		return (SlsHdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SlsHdrR createInstance() {
		return (SlsHdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SlsHdrR getValues(String... names) {
		return (SlsHdrR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  請求年.<p>
	 *
	 */
	public MCDate bill_ym() {
		return getConstDate(offset + 0, $bill_ym);
	}

	/**
	 *  請求年.<p>
	 *
	 */
	public void bill_ym(MCDate value) {
		setConstDate(offset + 0, $bill_ym, value);
	}


	/**
	 *  請求締日.<p>
	 *
	 */
	public MCNumber bill_cl_day() {
		return getConstNumber(offset + 1, $bill_cl_day);
	}

	/**
	 *  請求締日.<p>
	 *
	 */
	public void bill_cl_day(MCNumber value) {
		setConstNumber(offset + 1, $bill_cl_day, value);
	}

	/**
	 *  請求締日.<p>
	 *
	 */
	public void bill_cl_day(int value) {
		setConstNumber(offset + 1, $bill_cl_day, value);
	}

	/**
	 *  請求締日.<p>
	 *
	 */
	public void bill_cl_day(long value) {
		setConstNumber(offset + 1, $bill_cl_day, value);
	}

	/**
	 *  請求締日.<p>
	 *
	 */
	public void bill_cl_day(float value) {
		setConstNumber(offset + 1, $bill_cl_day, value);
	}

	/**
	 *  請求締日.<p>
	 *
	 */
	public void bill_cl_day(double value) {
		setConstNumber(offset + 1, $bill_cl_day, value);
	}


	/**
	 *  請求日.<p>
	 *
	 */
	public MCDate bill_dt() {
		return getConstDate(offset + 2, $bill_dt);
	}

	/**
	 *  請求日.<p>
	 *
	 */
	public void bill_dt(MCDate value) {
		setConstDate(offset + 2, $bill_dt, value);
	}


	/**
	 *  再発行.<p>
	 *
	 */
	public String re_issue() {
		return getConstString(offset + 3, $re_issue);
	}

	/**
	 *  再発行.<p>
	 *
	 */
	public void re_issue(String value) {
		setConstString(offset + 3, $re_issue, value);
	}


	/**
	 *  発行日（発行年）.<p>
	 *
	 */
	public MCDate prnt_tm() {
		return getConstDate(offset + 4, $prnt_tm);
	}

	/**
	 *  発行日（発行年）.<p>
	 *
	 */
	public void prnt_tm(MCDate value) {
		setConstDate(offset + 4, $prnt_tm, value);
	}


	/**
	 *  請求書ＮＯ.<p>
	 *
	 */
	public String bill_no() {
		return getConstString(offset + 5, $bill_no);
	}

	/**
	 *  請求書ＮＯ.<p>
	 *
	 */
	public void bill_no(String value) {
		setConstString(offset + 5, $bill_no, value);
	}


	/**
	 *  案件.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 6, $wrk_no);
	}

	/**
	 *  案件.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 6, $wrk_no, value);
	}


	/**
	 *  貴社案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 7, $wrk_nm);
	}

	/**
	 *  貴社案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 7, $wrk_nm, value);
	}


	/**
	 *  取引先ＣＤ.<p>
	 *
	 */
	public String bp_cd() {
		return getConstString(offset + 8, $bp_cd);
	}

	/**
	 *  取引先ＣＤ.<p>
	 *
	 */
	public void bp_cd(String value) {
		setConstString(offset + 8, $bp_cd, value);
	}


	/**
	 *  取引先郵便番号.<p>
	 *
	 */
	public String bp_zip_cd() {
		return getConstString(offset + 9, $bp_zip_cd);
	}

	/**
	 *  取引先郵便番号.<p>
	 *
	 */
	public void bp_zip_cd(String value) {
		setConstString(offset + 9, $bp_zip_cd, value);
	}


	/**
	 *  取引先住所１.<p>
	 *
	 */
	public String bp_addr1() {
		return getConstString(offset + 10, $bp_addr1);
	}

	/**
	 *  取引先住所１.<p>
	 *
	 */
	public void bp_addr1(String value) {
		setConstString(offset + 10, $bp_addr1, value);
	}


	/**
	 *  取引先住所２.<p>
	 *
	 */
	public String bp_addr2() {
		return getConstString(offset + 11, $bp_addr2);
	}

	/**
	 *  取引先住所２.<p>
	 *
	 */
	public void bp_addr2(String value) {
		setConstString(offset + 11, $bp_addr2, value);
	}


	/**
	 *  取引先住所３.<p>
	 *
	 */
	public String bp_addr3() {
		return getConstString(offset + 12, $bp_addr3);
	}

	/**
	 *  取引先住所３.<p>
	 *
	 */
	public void bp_addr3(String value) {
		setConstString(offset + 12, $bp_addr3, value);
	}


	/**
	 *  取引先住所４.<p>
	 *
	 */
	public String bp_addr4() {
		return getConstString(offset + 13, $bp_addr4);
	}

	/**
	 *  取引先住所４.<p>
	 *
	 */
	public void bp_addr4(String value) {
		setConstString(offset + 13, $bp_addr4, value);
	}


	/**
	 *  取引先住所.<p>
	 *
	 */
	public String bp_addr() {
		return getConstString(offset + 14, $bp_addr);
	}

	/**
	 *  取引先住所.<p>
	 *
	 */
	public void bp_addr(String value) {
		setConstString(offset + 14, $bp_addr, value);
	}


	/**
	 *  宛先.<p>
	 *
	 */
	public String bp_nm() {
		return getConstString(offset + 15, $bp_nm);
	}

	/**
	 *  宛先.<p>
	 *
	 */
	public void bp_nm(String value) {
		setConstString(offset + 15, $bp_nm, value);
	}


	/**
	 *  宛先別名１.<p>
	 *
	 */
	public String bp_alt_nm1() {
		return getConstString(offset + 16, $bp_alt_nm1);
	}

	/**
	 *  宛先別名１.<p>
	 *
	 */
	public void bp_alt_nm1(String value) {
		setConstString(offset + 16, $bp_alt_nm1, value);
	}


	/**
	 *  宛先別名２.<p>
	 *
	 */
	public String bp_alt_nm2() {
		return getConstString(offset + 17, $bp_alt_nm2);
	}

	/**
	 *  宛先別名２.<p>
	 *
	 */
	public void bp_alt_nm2(String value) {
		setConstString(offset + 17, $bp_alt_nm2, value);
	}


	/**
	 *  宛先別名３.<p>
	 *
	 */
	public String bp_alt_nm3() {
		return getConstString(offset + 18, $bp_alt_nm3);
	}

	/**
	 *  宛先別名３.<p>
	 *
	 */
	public void bp_alt_nm3(String value) {
		setConstString(offset + 18, $bp_alt_nm3, value);
	}


	/**
	 *  宛先別名４.<p>
	 *
	 */
	public String bp_alt_nm4() {
		return getConstString(offset + 19, $bp_alt_nm4);
	}

	/**
	 *  宛先別名４.<p>
	 *
	 */
	public void bp_alt_nm4(String value) {
		setConstString(offset + 19, $bp_alt_nm4, value);
	}


	/**
	 *  ＴＥＬ.<p>
	 *
	 */
	public String bp_tel() {
		return getConstString(offset + 20, $bp_tel);
	}

	/**
	 *  ＴＥＬ.<p>
	 *
	 */
	public void bp_tel(String value) {
		setConstString(offset + 20, $bp_tel, value);
	}


	/**
	 *  取引先国名.<p>
	 *
	 */
	public String bp_cntry_nm() {
		return getConstString(offset + 21, $bp_cntry_nm);
	}

	/**
	 *  取引先国名.<p>
	 *
	 */
	public void bp_cntry_nm(String value) {
		setConstString(offset + 21, $bp_cntry_nm, value);
	}


	/**
	 *  会社.<p>
	 *
	 */
	public String co_cd() {
		return getConstString(offset + 22, $co_cd);
	}

	/**
	 *  会社.<p>
	 *
	 */
	public void co_cd(String value) {
		setConstString(offset + 22, $co_cd, value);
	}


	/**
	 *  自社郵便番号.<p>
	 *
	 */
	public String zip_cd() {
		return getConstString(offset + 23, $zip_cd);
	}

	/**
	 *  自社郵便番号.<p>
	 *
	 */
	public void zip_cd(String value) {
		setConstString(offset + 23, $zip_cd, value);
	}


	/**
	 *  住所１.<p>
	 *
	 */
	public String addr1() {
		return getConstString(offset + 24, $addr1);
	}

	/**
	 *  住所１.<p>
	 *
	 */
	public void addr1(String value) {
		setConstString(offset + 24, $addr1, value);
	}


	/**
	 *  住所２.<p>
	 *
	 */
	public String addr2() {
		return getConstString(offset + 25, $addr2);
	}

	/**
	 *  住所２.<p>
	 *
	 */
	public void addr2(String value) {
		setConstString(offset + 25, $addr2, value);
	}


	/**
	 *  住所３.<p>
	 *
	 */
	public String addr3() {
		return getConstString(offset + 26, $addr3);
	}

	/**
	 *  住所３.<p>
	 *
	 */
	public void addr3(String value) {
		setConstString(offset + 26, $addr3, value);
	}


	/**
	 *  住所４.<p>
	 *
	 */
	public String addr4() {
		return getConstString(offset + 27, $addr4);
	}

	/**
	 *  住所４.<p>
	 *
	 */
	public void addr4(String value) {
		setConstString(offset + 27, $addr4, value);
	}


	/**
	 *  住所.<p>
	 *
	 */
	public String addr() {
		return getConstString(offset + 28, $addr);
	}

	/**
	 *  住所.<p>
	 *
	 */
	public void addr(String value) {
		setConstString(offset + 28, $addr, value);
	}


	/**
	 *  会社名.<p>
	 *
	 */
	public String co_nm() {
		return getConstString(offset + 29, $co_nm);
	}

	/**
	 *  会社名.<p>
	 *
	 */
	public void co_nm(String value) {
		setConstString(offset + 29, $co_nm, value);
	}


	/**
	 *  国名.<p>
	 *
	 */
	public String cntry_nm() {
		return getConstString(offset + 30, $cntry_nm);
	}

	/**
	 *  国名.<p>
	 *
	 */
	public void cntry_nm(String value) {
		setConstString(offset + 30, $cntry_nm, value);
	}


	/**
	 *  部門.<p>
	 *
	 */
	public String bill_dpt_cd() {
		return getConstString(offset + 31, $bill_dpt_cd);
	}

	/**
	 *  部門.<p>
	 *
	 */
	public void bill_dpt_cd(String value) {
		setConstString(offset + 31, $bill_dpt_cd, value);
	}


	/**
	 *  部門名.<p>
	 *
	 */
	public String dpt_nm() {
		return getConstString(offset + 32, $dpt_nm);
	}

	/**
	 *  部門名.<p>
	 *
	 */
	public void dpt_nm(String value) {
		setConstString(offset + 32, $dpt_nm, value);
	}


	/**
	 *  ＴＥＬ.<p>
	 *
	 */
	public String dpt_tel() {
		return getConstString(offset + 33, $dpt_tel);
	}

	/**
	 *  ＴＥＬ.<p>
	 *
	 */
	public void dpt_tel(String value) {
		setConstString(offset + 33, $dpt_tel, value);
	}


	/**
	 *  事業者番号.<p>
	 *
	 */
	public String biz_co_no() {
		return getConstString(offset + 34, $biz_co_no);
	}

	/**
	 *  事業者番号.<p>
	 *
	 */
	public void biz_co_no(String value) {
		setConstString(offset + 34, $biz_co_no, value);
	}


	/**
	 *  お買い上げ額合計（金額）.<p>
	 *
	 */
	public MCNumber bill_amt() {
		return getConstNumber(offset + 35, $bill_amt);
	}

	/**
	 *  お買い上げ額合計（金額）.<p>
	 *
	 */
	public void bill_amt(MCNumber value) {
		setConstNumber(offset + 35, $bill_amt, value);
	}

	/**
	 *  お買い上げ額合計（金額）.<p>
	 *
	 */
	public void bill_amt(int value) {
		setConstNumber(offset + 35, $bill_amt, value);
	}

	/**
	 *  お買い上げ額合計（金額）.<p>
	 *
	 */
	public void bill_amt(long value) {
		setConstNumber(offset + 35, $bill_amt, value);
	}

	/**
	 *  お買い上げ額合計（金額）.<p>
	 *
	 */
	public void bill_amt(float value) {
		setConstNumber(offset + 35, $bill_amt, value);
	}

	/**
	 *  お買い上げ額合計（金額）.<p>
	 *
	 */
	public void bill_amt(double value) {
		setConstNumber(offset + 35, $bill_amt, value);
	}


	/**
	 *  お買い上げ額合計（金額）文字列.<p>
	 *
	 */
	public String s_bill_amt() {
		return getConstString(offset + 36, $s_bill_amt);
	}

	/**
	 *  お買い上げ額合計（金額）文字列.<p>
	 *
	 */
	public void s_bill_amt(String value) {
		setConstString(offset + 36, $s_bill_amt, value);
	}


	/**
	 *  通貨ＣＤ.<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 37, $cur_cd);
	}

	/**
	 *  通貨ＣＤ.<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 37, $cur_cd, value);
	}


	/**
	 *  お買い上げ額合計（通貨名）.<p>
	 *
	 */
	public String cur_nm() {
		return getConstString(offset + 38, $cur_nm);
	}

	/**
	 *  お買い上げ額合計（通貨名）.<p>
	 *
	 */
	public void cur_nm(String value) {
		setConstString(offset + 38, $cur_nm, value);
	}


	/**
	 *  お買い上げ額.<p>
	 *
	 */
	public MCNumber sls_amt() {
		return getConstNumber(offset + 39, $sls_amt);
	}

	/**
	 *  お買い上げ額.<p>
	 *
	 */
	public void sls_amt(MCNumber value) {
		setConstNumber(offset + 39, $sls_amt, value);
	}

	/**
	 *  お買い上げ額.<p>
	 *
	 */
	public void sls_amt(int value) {
		setConstNumber(offset + 39, $sls_amt, value);
	}

	/**
	 *  お買い上げ額.<p>
	 *
	 */
	public void sls_amt(long value) {
		setConstNumber(offset + 39, $sls_amt, value);
	}

	/**
	 *  お買い上げ額.<p>
	 *
	 */
	public void sls_amt(float value) {
		setConstNumber(offset + 39, $sls_amt, value);
	}

	/**
	 *  お買い上げ額.<p>
	 *
	 */
	public void sls_amt(double value) {
		setConstNumber(offset + 39, $sls_amt, value);
	}


	/**
	 *  お買い上げ額文字列.<p>
	 *
	 */
	public String s_sls_amt() {
		return getConstString(offset + 40, $s_sls_amt);
	}

	/**
	 *  お買い上げ額文字列.<p>
	 *
	 */
	public void s_sls_amt(String value) {
		setConstString(offset + 40, $s_sls_amt, value);
	}


	/**
	 *  値引額.<p>
	 *
	 */
	public MCNumber dscnt_amt() {
		return getConstNumber(offset + 41, $dscnt_amt);
	}

	/**
	 *  値引額.<p>
	 *
	 */
	public void dscnt_amt(MCNumber value) {
		setConstNumber(offset + 41, $dscnt_amt, value);
	}

	/**
	 *  値引額.<p>
	 *
	 */
	public void dscnt_amt(int value) {
		setConstNumber(offset + 41, $dscnt_amt, value);
	}

	/**
	 *  値引額.<p>
	 *
	 */
	public void dscnt_amt(long value) {
		setConstNumber(offset + 41, $dscnt_amt, value);
	}

	/**
	 *  値引額.<p>
	 *
	 */
	public void dscnt_amt(float value) {
		setConstNumber(offset + 41, $dscnt_amt, value);
	}

	/**
	 *  値引額.<p>
	 *
	 */
	public void dscnt_amt(double value) {
		setConstNumber(offset + 41, $dscnt_amt, value);
	}


	/**
	 *  値引額文字列.<p>
	 *
	 */
	public String s_dscnt_amt() {
		return getConstString(offset + 42, $s_dscnt_amt);
	}

	/**
	 *  値引額文字列.<p>
	 *
	 */
	public void s_dscnt_amt(String value) {
		setConstString(offset + 42, $s_dscnt_amt, value);
	}


	/**
	 *  ご返品額.<p>
	 *
	 */
	public MCNumber ret_amt() {
		return getConstNumber(offset + 43, $ret_amt);
	}

	/**
	 *  ご返品額.<p>
	 *
	 */
	public void ret_amt(MCNumber value) {
		setConstNumber(offset + 43, $ret_amt, value);
	}

	/**
	 *  ご返品額.<p>
	 *
	 */
	public void ret_amt(int value) {
		setConstNumber(offset + 43, $ret_amt, value);
	}

	/**
	 *  ご返品額.<p>
	 *
	 */
	public void ret_amt(long value) {
		setConstNumber(offset + 43, $ret_amt, value);
	}

	/**
	 *  ご返品額.<p>
	 *
	 */
	public void ret_amt(float value) {
		setConstNumber(offset + 43, $ret_amt, value);
	}

	/**
	 *  ご返品額.<p>
	 *
	 */
	public void ret_amt(double value) {
		setConstNumber(offset + 43, $ret_amt, value);
	}


	/**
	 *  ご返品額文字列.<p>
	 *
	 */
	public String s_ret_amt() {
		return getConstString(offset + 44, $s_ret_amt);
	}

	/**
	 *  ご返品額文字列.<p>
	 *
	 */
	public void s_ret_amt(String value) {
		setConstString(offset + 44, $s_ret_amt, value);
	}


	/**
	 *  税額.<p>
	 *
	 */
	public MCNumber tax_amt() {
		return getConstNumber(offset + 45, $tax_amt);
	}

	/**
	 *  税額.<p>
	 *
	 */
	public void tax_amt(MCNumber value) {
		setConstNumber(offset + 45, $tax_amt, value);
	}

	/**
	 *  税額.<p>
	 *
	 */
	public void tax_amt(int value) {
		setConstNumber(offset + 45, $tax_amt, value);
	}

	/**
	 *  税額.<p>
	 *
	 */
	public void tax_amt(long value) {
		setConstNumber(offset + 45, $tax_amt, value);
	}

	/**
	 *  税額.<p>
	 *
	 */
	public void tax_amt(float value) {
		setConstNumber(offset + 45, $tax_amt, value);
	}

	/**
	 *  税額.<p>
	 *
	 */
	public void tax_amt(double value) {
		setConstNumber(offset + 45, $tax_amt, value);
	}


	/**
	 *  税額文字列.<p>
	 *
	 */
	public String s_tax_amt() {
		return getConstString(offset + 46, $s_tax_amt);
	}

	/**
	 *  税額文字列.<p>
	 *
	 */
	public void s_tax_amt(String value) {
		setConstString(offset + 46, $s_tax_amt, value);
	}


	/**
	 *  予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 47, $sub_char1);
	}

	/**
	 *  予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 47, $sub_char1, value);
	}


	/**
	 *  予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 48, $sub_char2);
	}

	/**
	 *  予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 48, $sub_char2, value);
	}


	/**
	 *  予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 49, $sub_char3);
	}

	/**
	 *  予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 49, $sub_char3, value);
	}


	public String getString(String name) {
		if ($re_issue.equalsIgnoreCase(name)) {
			return re_issue();
		}
		if ($bill_no.equalsIgnoreCase(name)) {
			return bill_no();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_zip_cd.equalsIgnoreCase(name)) {
			return bp_zip_cd();
		}
		if ($bp_addr1.equalsIgnoreCase(name)) {
			return bp_addr1();
		}
		if ($bp_addr2.equalsIgnoreCase(name)) {
			return bp_addr2();
		}
		if ($bp_addr3.equalsIgnoreCase(name)) {
			return bp_addr3();
		}
		if ($bp_addr4.equalsIgnoreCase(name)) {
			return bp_addr4();
		}
		if ($bp_addr.equalsIgnoreCase(name)) {
			return bp_addr();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($bp_alt_nm1.equalsIgnoreCase(name)) {
			return bp_alt_nm1();
		}
		if ($bp_alt_nm2.equalsIgnoreCase(name)) {
			return bp_alt_nm2();
		}
		if ($bp_alt_nm3.equalsIgnoreCase(name)) {
			return bp_alt_nm3();
		}
		if ($bp_alt_nm4.equalsIgnoreCase(name)) {
			return bp_alt_nm4();
		}
		if ($bp_tel.equalsIgnoreCase(name)) {
			return bp_tel();
		}
		if ($bp_cntry_nm.equalsIgnoreCase(name)) {
			return bp_cntry_nm();
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			return zip_cd();
		}
		if ($addr1.equalsIgnoreCase(name)) {
			return addr1();
		}
		if ($addr2.equalsIgnoreCase(name)) {
			return addr2();
		}
		if ($addr3.equalsIgnoreCase(name)) {
			return addr3();
		}
		if ($addr4.equalsIgnoreCase(name)) {
			return addr4();
		}
		if ($addr.equalsIgnoreCase(name)) {
			return addr();
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			return co_nm();
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			return cntry_nm();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($dpt_tel.equalsIgnoreCase(name)) {
			return dpt_tel();
		}
		if ($biz_co_no.equalsIgnoreCase(name)) {
			return biz_co_no();
		}
		if ($s_bill_amt.equalsIgnoreCase(name)) {
			return s_bill_amt();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		if ($s_sls_amt.equalsIgnoreCase(name)) {
			return s_sls_amt();
		}
		if ($s_dscnt_amt.equalsIgnoreCase(name)) {
			return s_dscnt_amt();
		}
		if ($s_ret_amt.equalsIgnoreCase(name)) {
			return s_ret_amt();
		}
		if ($s_tax_amt.equalsIgnoreCase(name)) {
			return s_tax_amt();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			return bill_cl_day();
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			return bill_amt();
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			return sls_amt();
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			return dscnt_amt();
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			return ret_amt();
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			return tax_amt();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($bill_ym.equalsIgnoreCase(name)) {
			return bill_ym();
		}
		if ($bill_dt.equalsIgnoreCase(name)) {
			return bill_dt();
		}
		if ($prnt_tm.equalsIgnoreCase(name)) {
			return prnt_tm();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($re_issue.equalsIgnoreCase(name)) {
			return re_issue();
		}
		if ($bill_no.equalsIgnoreCase(name)) {
			return bill_no();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_zip_cd.equalsIgnoreCase(name)) {
			return bp_zip_cd();
		}
		if ($bp_addr1.equalsIgnoreCase(name)) {
			return bp_addr1();
		}
		if ($bp_addr2.equalsIgnoreCase(name)) {
			return bp_addr2();
		}
		if ($bp_addr3.equalsIgnoreCase(name)) {
			return bp_addr3();
		}
		if ($bp_addr4.equalsIgnoreCase(name)) {
			return bp_addr4();
		}
		if ($bp_addr.equalsIgnoreCase(name)) {
			return bp_addr();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($bp_alt_nm1.equalsIgnoreCase(name)) {
			return bp_alt_nm1();
		}
		if ($bp_alt_nm2.equalsIgnoreCase(name)) {
			return bp_alt_nm2();
		}
		if ($bp_alt_nm3.equalsIgnoreCase(name)) {
			return bp_alt_nm3();
		}
		if ($bp_alt_nm4.equalsIgnoreCase(name)) {
			return bp_alt_nm4();
		}
		if ($bp_tel.equalsIgnoreCase(name)) {
			return bp_tel();
		}
		if ($bp_cntry_nm.equalsIgnoreCase(name)) {
			return bp_cntry_nm();
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			return zip_cd();
		}
		if ($addr1.equalsIgnoreCase(name)) {
			return addr1();
		}
		if ($addr2.equalsIgnoreCase(name)) {
			return addr2();
		}
		if ($addr3.equalsIgnoreCase(name)) {
			return addr3();
		}
		if ($addr4.equalsIgnoreCase(name)) {
			return addr4();
		}
		if ($addr.equalsIgnoreCase(name)) {
			return addr();
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			return co_nm();
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			return cntry_nm();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($dpt_tel.equalsIgnoreCase(name)) {
			return dpt_tel();
		}
		if ($biz_co_no.equalsIgnoreCase(name)) {
			return biz_co_no();
		}
		if ($s_bill_amt.equalsIgnoreCase(name)) {
			return s_bill_amt();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		if ($s_sls_amt.equalsIgnoreCase(name)) {
			return s_sls_amt();
		}
		if ($s_dscnt_amt.equalsIgnoreCase(name)) {
			return s_dscnt_amt();
		}
		if ($s_ret_amt.equalsIgnoreCase(name)) {
			return s_ret_amt();
		}
		if ($s_tax_amt.equalsIgnoreCase(name)) {
			return s_tax_amt();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			return bill_cl_day();
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			return bill_amt();
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			return sls_amt();
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			return dscnt_amt();
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			return ret_amt();
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			return tax_amt();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($bill_ym.equalsIgnoreCase(name)) {
			return bill_ym();
		}
		if ($bill_dt.equalsIgnoreCase(name)) {
			return bill_dt();
		}
		if ($prnt_tm.equalsIgnoreCase(name)) {
			return prnt_tm();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($re_issue.equalsIgnoreCase(name)) {
			re_issue(value);
			return;
		}
		if ($bill_no.equalsIgnoreCase(name)) {
			bill_no(value);
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
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($bp_zip_cd.equalsIgnoreCase(name)) {
			bp_zip_cd(value);
			return;
		}
		if ($bp_addr1.equalsIgnoreCase(name)) {
			bp_addr1(value);
			return;
		}
		if ($bp_addr2.equalsIgnoreCase(name)) {
			bp_addr2(value);
			return;
		}
		if ($bp_addr3.equalsIgnoreCase(name)) {
			bp_addr3(value);
			return;
		}
		if ($bp_addr4.equalsIgnoreCase(name)) {
			bp_addr4(value);
			return;
		}
		if ($bp_addr.equalsIgnoreCase(name)) {
			bp_addr(value);
			return;
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
			return;
		}
		if ($bp_alt_nm1.equalsIgnoreCase(name)) {
			bp_alt_nm1(value);
			return;
		}
		if ($bp_alt_nm2.equalsIgnoreCase(name)) {
			bp_alt_nm2(value);
			return;
		}
		if ($bp_alt_nm3.equalsIgnoreCase(name)) {
			bp_alt_nm3(value);
			return;
		}
		if ($bp_alt_nm4.equalsIgnoreCase(name)) {
			bp_alt_nm4(value);
			return;
		}
		if ($bp_tel.equalsIgnoreCase(name)) {
			bp_tel(value);
			return;
		}
		if ($bp_cntry_nm.equalsIgnoreCase(name)) {
			bp_cntry_nm(value);
			return;
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			zip_cd(value);
			return;
		}
		if ($addr1.equalsIgnoreCase(name)) {
			addr1(value);
			return;
		}
		if ($addr2.equalsIgnoreCase(name)) {
			addr2(value);
			return;
		}
		if ($addr3.equalsIgnoreCase(name)) {
			addr3(value);
			return;
		}
		if ($addr4.equalsIgnoreCase(name)) {
			addr4(value);
			return;
		}
		if ($addr.equalsIgnoreCase(name)) {
			addr(value);
			return;
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			co_nm(value);
			return;
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			cntry_nm(value);
			return;
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($dpt_tel.equalsIgnoreCase(name)) {
			dpt_tel(value);
			return;
		}
		if ($biz_co_no.equalsIgnoreCase(name)) {
			biz_co_no(value);
			return;
		}
		if ($s_bill_amt.equalsIgnoreCase(name)) {
			s_bill_amt(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			cur_nm(value);
			return;
		}
		if ($s_sls_amt.equalsIgnoreCase(name)) {
			s_sls_amt(value);
			return;
		}
		if ($s_dscnt_amt.equalsIgnoreCase(name)) {
			s_dscnt_amt(value);
			return;
		}
		if ($s_ret_amt.equalsIgnoreCase(name)) {
			s_ret_amt(value);
			return;
		}
		if ($s_tax_amt.equalsIgnoreCase(name)) {
			s_tax_amt(value);
			return;
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			bill_amt(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			bill_amt(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			bill_amt(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			bill_amt(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			bill_amt(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($bill_ym.equalsIgnoreCase(name)) {
			bill_ym(value);
			return;
		}
		if ($bill_dt.equalsIgnoreCase(name)) {
			bill_dt(value);
			return;
		}
		if ($prnt_tm.equalsIgnoreCase(name)) {
			prnt_tm(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($re_issue.equalsIgnoreCase(name)) {
			re_issue(value);
			return;
		}
		if ($bill_no.equalsIgnoreCase(name)) {
			bill_no(value);
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
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($bp_zip_cd.equalsIgnoreCase(name)) {
			bp_zip_cd(value);
			return;
		}
		if ($bp_addr1.equalsIgnoreCase(name)) {
			bp_addr1(value);
			return;
		}
		if ($bp_addr2.equalsIgnoreCase(name)) {
			bp_addr2(value);
			return;
		}
		if ($bp_addr3.equalsIgnoreCase(name)) {
			bp_addr3(value);
			return;
		}
		if ($bp_addr4.equalsIgnoreCase(name)) {
			bp_addr4(value);
			return;
		}
		if ($bp_addr.equalsIgnoreCase(name)) {
			bp_addr(value);
			return;
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
			return;
		}
		if ($bp_alt_nm1.equalsIgnoreCase(name)) {
			bp_alt_nm1(value);
			return;
		}
		if ($bp_alt_nm2.equalsIgnoreCase(name)) {
			bp_alt_nm2(value);
			return;
		}
		if ($bp_alt_nm3.equalsIgnoreCase(name)) {
			bp_alt_nm3(value);
			return;
		}
		if ($bp_alt_nm4.equalsIgnoreCase(name)) {
			bp_alt_nm4(value);
			return;
		}
		if ($bp_tel.equalsIgnoreCase(name)) {
			bp_tel(value);
			return;
		}
		if ($bp_cntry_nm.equalsIgnoreCase(name)) {
			bp_cntry_nm(value);
			return;
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			zip_cd(value);
			return;
		}
		if ($addr1.equalsIgnoreCase(name)) {
			addr1(value);
			return;
		}
		if ($addr2.equalsIgnoreCase(name)) {
			addr2(value);
			return;
		}
		if ($addr3.equalsIgnoreCase(name)) {
			addr3(value);
			return;
		}
		if ($addr4.equalsIgnoreCase(name)) {
			addr4(value);
			return;
		}
		if ($addr.equalsIgnoreCase(name)) {
			addr(value);
			return;
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			co_nm(value);
			return;
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			cntry_nm(value);
			return;
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($dpt_tel.equalsIgnoreCase(name)) {
			dpt_tel(value);
			return;
		}
		if ($biz_co_no.equalsIgnoreCase(name)) {
			biz_co_no(value);
			return;
		}
		if ($s_bill_amt.equalsIgnoreCase(name)) {
			s_bill_amt(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			cur_nm(value);
			return;
		}
		if ($s_sls_amt.equalsIgnoreCase(name)) {
			s_sls_amt(value);
			return;
		}
		if ($s_dscnt_amt.equalsIgnoreCase(name)) {
			s_dscnt_amt(value);
			return;
		}
		if ($s_ret_amt.equalsIgnoreCase(name)) {
			s_ret_amt(value);
			return;
		}
		if ($s_tax_amt.equalsIgnoreCase(name)) {
			s_tax_amt(value);
			return;
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			bill_amt(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			bill_amt(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			bill_amt(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			bill_amt(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			bill_amt(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($bill_ym.equalsIgnoreCase(name)) {
			bill_ym(value);
			return;
		}
		if ($bill_dt.equalsIgnoreCase(name)) {
			bill_dt(value);
			return;
		}
		if ($prnt_tm.equalsIgnoreCase(name)) {
			prnt_tm(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

