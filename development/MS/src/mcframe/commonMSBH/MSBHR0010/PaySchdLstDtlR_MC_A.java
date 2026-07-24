package mcframe.commonMSBH.MSBHR0010;

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
 * ブロック"PaySchdLstDtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class PaySchdLstDtlR_MC_A extends MCConstRow {

	/**
	 *  支払先ＣＤ.<p>
	 *
	 */
	public static final String $psppl_cd = "psppl_cd";
	/**
	 *  支払先名.<p>
	 *
	 */
	public static final String $psppl_nm = "psppl_nm";
	/**
	 *  支払先別名１.<p>
	 *
	 */
	public static final String $psppl_alt_nm1 = "psppl_alt_nm1";
	/**
	 *  支払先別名２.<p>
	 *
	 */
	public static final String $psppl_alt_nm2 = "psppl_alt_nm2";
	/**
	 *  支払先別名３.<p>
	 *
	 */
	public static final String $psppl_alt_nm3 = "psppl_alt_nm3";
	/**
	 *  支払先別名４.<p>
	 *
	 */
	public static final String $psppl_alt_nm4 = "psppl_alt_nm4";
	/**
	 *  支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public static final String $bsppl_dpt_cd = "bsppl_dpt_cd";
	/**
	 *  支払予定管理先担当部門名.<p>
	 *
	 */
	public static final String $bsppl_dpt_nm = "bsppl_dpt_nm";
	/**
	 *  支払照合ＮＯ.<p>
	 *
	 */
	public static final String $pay_chk_no = "pay_chk_no";
	/**
	 *  支払予定ＮＯ.<p>
	 *
	 */
	public static final String $pay_schd_no = "pay_schd_no";
	/**
	 *  支払予定管理ＣＤ.<p>
	 *
	 */
	public static final String $bsppl_cd = "bsppl_cd";
	/**
	 *  支払予定管理先名.<p>
	 *
	 */
	public static final String $bsppl_nm = "bsppl_nm";
	/**
	 *  支払予定管理先別名１.<p>
	 *
	 */
	public static final String $bsppl_alt_nm1 = "bsppl_alt_nm1";
	/**
	 *  支払予定管理先別名２.<p>
	 *
	 */
	public static final String $bsppl_alt_nm2 = "bsppl_alt_nm2";
	/**
	 *  支払予定管理先別名３.<p>
	 *
	 */
	public static final String $bsppl_alt_nm3 = "bsppl_alt_nm3";
	/**
	 *  支払予定管理先別名４.<p>
	 *
	 */
	public static final String $bsppl_alt_nm4 = "bsppl_alt_nm4";
	/**
	 *  支払予定日.<p>
	 *
	 */
	public static final String $pay_schd_dt = "pay_schd_dt";
	/**
	 *  債務決済方法ＣＤ.<p>
	 *
	 */
	public static final String $ap_sttl_cd = "ap_sttl_cd";
	/**
	 *  債務決済方法名.<p>
	 *
	 */
	public static final String $ap_sttl_nm = "ap_sttl_nm";
	/**
	 *  銀行ＣＤ.<p>
	 *
	 */
	public static final String $bank_cd = "bank_cd";
	/**
	 *  銀行名.<p>
	 *
	 */
	public static final String $bank_nm = "bank_nm";
	/**
	 *  支店ＣＤ.<p>
	 *
	 */
	public static final String $branch_cd = "branch_cd";
	/**
	 *  支店名.<p>
	 *
	 */
	public static final String $branch_nm = "branch_nm";
	/**
	 *  支払先口座ＣＤ.<p>
	 *
	 */
	public static final String $pay_bank_ac_cd = "pay_bank_ac_cd";
	/**
	 *  口座番号.<p>
	 *
	 */
	public static final String $bank_ac_no = "bank_ac_no";
	/**
	 *  金額.<p>
	 *
	 */
	public static final String $trd_cur_amt = "trd_cur_amt";
	/**
	 *  金額文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_amt = "s_int_amt";
	/**
	 *  金額文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_amt = "s_dec_amt";
	/**
	 *  取引通貨ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	/**
	 *  取引通貨名.<p>
	 *
	 */
	public static final String $trd_cur_nm = "trd_cur_nm";
	/**
	 *  備考.<p>
	 *
	 */
	public static final String $pay_schd_print_rmrks = "pay_schd_print_rmrks";
	/**
	 *  金額小数部有効桁数.<p>
	 *
	 */
	public static final String $amt_dec_place = "amt_dec_place";
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


	public static final MCMeta psppl_cd_META = createCommonMeta($psppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta psppl_nm_META = createCommonMeta($psppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta psppl_alt_nm1_META = createCommonMeta($psppl_alt_nm1, mcframe.commonMA.meta.MA_META.BP_ALT_NM1);
	public static final MCMeta psppl_alt_nm2_META = createCommonMeta($psppl_alt_nm2, mcframe.commonMA.meta.MA_META.BP_ALT_NM2);
	public static final MCMeta psppl_alt_nm3_META = createCommonMeta($psppl_alt_nm3, mcframe.commonMA.meta.MA_META.BP_ALT_NM3);
	public static final MCMeta psppl_alt_nm4_META = createCommonMeta($psppl_alt_nm4, mcframe.commonMA.meta.MA_META.BP_ALT_NM4);
	public static final MCMeta bsppl_dpt_cd_META = createCommonMeta($bsppl_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bsppl_dpt_nm_META = createCommonMeta($bsppl_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta pay_chk_no_META = createCommonMeta($pay_chk_no, mcframe.commonMA.meta.MA_META.PAY_CHK_NO);
	public static final MCMeta pay_schd_no_META = createCommonMeta($pay_schd_no, mcframe.commonMA.meta.MA_META.PAY_SCHD_NO);
	public static final MCMeta bsppl_cd_META = createCommonMeta($bsppl_cd, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bsppl_nm_META = createCommonMeta($bsppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bsppl_alt_nm1_META = createCommonMeta($bsppl_alt_nm1, mcframe.commonMA.meta.MA_META.BP_ALT_NM1);
	public static final MCMeta bsppl_alt_nm2_META = createCommonMeta($bsppl_alt_nm2, mcframe.commonMA.meta.MA_META.BP_ALT_NM2);
	public static final MCMeta bsppl_alt_nm3_META = createCommonMeta($bsppl_alt_nm3, mcframe.commonMA.meta.MA_META.BP_ALT_NM3);
	public static final MCMeta bsppl_alt_nm4_META = createCommonMeta($bsppl_alt_nm4, mcframe.commonMA.meta.MA_META.BP_ALT_NM4);
	public static final MCMeta pay_schd_dt_META = createCommonMeta($pay_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ap_sttl_cd_META = createCommonMeta($ap_sttl_cd, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta ap_sttl_nm_META = createCommonMeta($ap_sttl_nm, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta bank_cd_META = createCommonMeta($bank_cd, mcframe.commonMA.meta.MA_META.BANK_CD);
	public static final MCMeta bank_nm_META = createCommonMeta($bank_nm, mcframe.commonMA.meta.MA_META.BANK_NM);
	public static final MCMeta branch_cd_META = createCommonMeta($branch_cd, mcframe.commonMA.meta.MA_META.BANK_BRANCH_CD);
	public static final MCMeta branch_nm_META = createCommonMeta($branch_nm, mcframe.commonMA.meta.MA_META.BANK_BRANCH_NM);
	public static final MCMeta pay_bank_ac_cd_META = createCommonMeta($pay_bank_ac_cd, mcframe.commonMA.meta.MA_META.BANK_AC_CD);
	public static final MCMeta bank_ac_no_META = createCommonMeta($bank_ac_no, mcframe.commonMA.meta.MA_META.BANK_AC_NO);
	public static final MCMeta trd_cur_amt_META = createCommonMeta($trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_int_amt_META = createStringMeta($s_int_amt);
	public static final MCMeta s_dec_amt_META = createStringMeta($s_dec_amt);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta pay_schd_print_rmrks_META = createCommonMeta($pay_schd_print_rmrks, mcframe.commonMS.meta.MS_META.PAY_SCHD_PRINT_RMRKS);
	public static final MCMeta amt_dec_place_META = createCommonMeta($amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.PAY_SCHD_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.PAY_SCHD_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.PAY_SCHD_SUB_CHAR3);

	protected static final ConstMetaList<PaySchdLstDtlR> constMetas = new ConstMetaList<PaySchdLstDtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			psppl_cd_META,
			psppl_nm_META,
			psppl_alt_nm1_META,
			psppl_alt_nm2_META,
			psppl_alt_nm3_META,
			psppl_alt_nm4_META,
			bsppl_dpt_cd_META,
			bsppl_dpt_nm_META,
			pay_chk_no_META,
			pay_schd_no_META,
			bsppl_cd_META,
			bsppl_nm_META,
			bsppl_alt_nm1_META,
			bsppl_alt_nm2_META,
			bsppl_alt_nm3_META,
			bsppl_alt_nm4_META,
			pay_schd_dt_META,
			ap_sttl_cd_META,
			ap_sttl_nm_META,
			bank_cd_META,
			bank_nm_META,
			branch_cd_META,
			branch_nm_META,
			pay_bank_ac_cd_META,
			bank_ac_no_META,
			trd_cur_amt_META,
			s_int_amt_META,
			s_dec_amt_META,
			trd_cur_cd_META,
			trd_cur_nm_META,
			pay_schd_print_rmrks_META,
			amt_dec_place_META,
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
	protected PaySchdLstDtlR_MC_A(ConstMetaList<? extends PaySchdLstDtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PaySchdLstDtlR clone() {
		return (PaySchdLstDtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PaySchdLstDtlR createInstance() {
		return (PaySchdLstDtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PaySchdLstDtlR getValues(String... names) {
		return (PaySchdLstDtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  支払先ＣＤ.<p>
	 *
	 */
	public String psppl_cd() {
		return getConstString(offset + 0, $psppl_cd);
	}

	/**
	 *  支払先ＣＤ.<p>
	 *
	 */
	public void psppl_cd(String value) {
		setConstString(offset + 0, $psppl_cd, value);
	}


	/**
	 *  支払先名.<p>
	 *
	 */
	public String psppl_nm() {
		return getConstString(offset + 1, $psppl_nm);
	}

	/**
	 *  支払先名.<p>
	 *
	 */
	public void psppl_nm(String value) {
		setConstString(offset + 1, $psppl_nm, value);
	}


	/**
	 *  支払先別名１.<p>
	 *
	 */
	public String psppl_alt_nm1() {
		return getConstString(offset + 2, $psppl_alt_nm1);
	}

	/**
	 *  支払先別名１.<p>
	 *
	 */
	public void psppl_alt_nm1(String value) {
		setConstString(offset + 2, $psppl_alt_nm1, value);
	}


	/**
	 *  支払先別名２.<p>
	 *
	 */
	public String psppl_alt_nm2() {
		return getConstString(offset + 3, $psppl_alt_nm2);
	}

	/**
	 *  支払先別名２.<p>
	 *
	 */
	public void psppl_alt_nm2(String value) {
		setConstString(offset + 3, $psppl_alt_nm2, value);
	}


	/**
	 *  支払先別名３.<p>
	 *
	 */
	public String psppl_alt_nm3() {
		return getConstString(offset + 4, $psppl_alt_nm3);
	}

	/**
	 *  支払先別名３.<p>
	 *
	 */
	public void psppl_alt_nm3(String value) {
		setConstString(offset + 4, $psppl_alt_nm3, value);
	}


	/**
	 *  支払先別名４.<p>
	 *
	 */
	public String psppl_alt_nm4() {
		return getConstString(offset + 5, $psppl_alt_nm4);
	}

	/**
	 *  支払先別名４.<p>
	 *
	 */
	public void psppl_alt_nm4(String value) {
		setConstString(offset + 5, $psppl_alt_nm4, value);
	}


	/**
	 *  支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public String bsppl_dpt_cd() {
		return getConstString(offset + 6, $bsppl_dpt_cd);
	}

	/**
	 *  支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public void bsppl_dpt_cd(String value) {
		setConstString(offset + 6, $bsppl_dpt_cd, value);
	}


	/**
	 *  支払予定管理先担当部門名.<p>
	 *
	 */
	public String bsppl_dpt_nm() {
		return getConstString(offset + 7, $bsppl_dpt_nm);
	}

	/**
	 *  支払予定管理先担当部門名.<p>
	 *
	 */
	public void bsppl_dpt_nm(String value) {
		setConstString(offset + 7, $bsppl_dpt_nm, value);
	}


	/**
	 *  支払照合ＮＯ.<p>
	 *
	 */
	public String pay_chk_no() {
		return getConstString(offset + 8, $pay_chk_no);
	}

	/**
	 *  支払照合ＮＯ.<p>
	 *
	 */
	public void pay_chk_no(String value) {
		setConstString(offset + 8, $pay_chk_no, value);
	}


	/**
	 *  支払予定ＮＯ.<p>
	 *
	 */
	public String pay_schd_no() {
		return getConstString(offset + 9, $pay_schd_no);
	}

	/**
	 *  支払予定ＮＯ.<p>
	 *
	 */
	public void pay_schd_no(String value) {
		setConstString(offset + 9, $pay_schd_no, value);
	}


	/**
	 *  支払予定管理ＣＤ.<p>
	 *
	 */
	public String bsppl_cd() {
		return getConstString(offset + 10, $bsppl_cd);
	}

	/**
	 *  支払予定管理ＣＤ.<p>
	 *
	 */
	public void bsppl_cd(String value) {
		setConstString(offset + 10, $bsppl_cd, value);
	}


	/**
	 *  支払予定管理先名.<p>
	 *
	 */
	public String bsppl_nm() {
		return getConstString(offset + 11, $bsppl_nm);
	}

	/**
	 *  支払予定管理先名.<p>
	 *
	 */
	public void bsppl_nm(String value) {
		setConstString(offset + 11, $bsppl_nm, value);
	}


	/**
	 *  支払予定管理先別名１.<p>
	 *
	 */
	public String bsppl_alt_nm1() {
		return getConstString(offset + 12, $bsppl_alt_nm1);
	}

	/**
	 *  支払予定管理先別名１.<p>
	 *
	 */
	public void bsppl_alt_nm1(String value) {
		setConstString(offset + 12, $bsppl_alt_nm1, value);
	}


	/**
	 *  支払予定管理先別名２.<p>
	 *
	 */
	public String bsppl_alt_nm2() {
		return getConstString(offset + 13, $bsppl_alt_nm2);
	}

	/**
	 *  支払予定管理先別名２.<p>
	 *
	 */
	public void bsppl_alt_nm2(String value) {
		setConstString(offset + 13, $bsppl_alt_nm2, value);
	}


	/**
	 *  支払予定管理先別名３.<p>
	 *
	 */
	public String bsppl_alt_nm3() {
		return getConstString(offset + 14, $bsppl_alt_nm3);
	}

	/**
	 *  支払予定管理先別名３.<p>
	 *
	 */
	public void bsppl_alt_nm3(String value) {
		setConstString(offset + 14, $bsppl_alt_nm3, value);
	}


	/**
	 *  支払予定管理先別名４.<p>
	 *
	 */
	public String bsppl_alt_nm4() {
		return getConstString(offset + 15, $bsppl_alt_nm4);
	}

	/**
	 *  支払予定管理先別名４.<p>
	 *
	 */
	public void bsppl_alt_nm4(String value) {
		setConstString(offset + 15, $bsppl_alt_nm4, value);
	}


	/**
	 *  支払予定日.<p>
	 *
	 */
	public MCDate pay_schd_dt() {
		return getConstDate(offset + 16, $pay_schd_dt);
	}

	/**
	 *  支払予定日.<p>
	 *
	 */
	public void pay_schd_dt(MCDate value) {
		setConstDate(offset + 16, $pay_schd_dt, value);
	}


	/**
	 *  債務決済方法ＣＤ.<p>
	 *
	 */
	public String ap_sttl_cd() {
		return getConstString(offset + 17, $ap_sttl_cd);
	}

	/**
	 *  債務決済方法ＣＤ.<p>
	 *
	 */
	public void ap_sttl_cd(String value) {
		setConstString(offset + 17, $ap_sttl_cd, value);
	}


	/**
	 *  債務決済方法名.<p>
	 *
	 */
	public String ap_sttl_nm() {
		return getConstString(offset + 18, $ap_sttl_nm);
	}

	/**
	 *  債務決済方法名.<p>
	 *
	 */
	public void ap_sttl_nm(String value) {
		setConstString(offset + 18, $ap_sttl_nm, value);
	}


	/**
	 *  銀行ＣＤ.<p>
	 *
	 */
	public String bank_cd() {
		return getConstString(offset + 19, $bank_cd);
	}

	/**
	 *  銀行ＣＤ.<p>
	 *
	 */
	public void bank_cd(String value) {
		setConstString(offset + 19, $bank_cd, value);
	}


	/**
	 *  銀行名.<p>
	 *
	 */
	public String bank_nm() {
		return getConstString(offset + 20, $bank_nm);
	}

	/**
	 *  銀行名.<p>
	 *
	 */
	public void bank_nm(String value) {
		setConstString(offset + 20, $bank_nm, value);
	}


	/**
	 *  支店ＣＤ.<p>
	 *
	 */
	public String branch_cd() {
		return getConstString(offset + 21, $branch_cd);
	}

	/**
	 *  支店ＣＤ.<p>
	 *
	 */
	public void branch_cd(String value) {
		setConstString(offset + 21, $branch_cd, value);
	}


	/**
	 *  支店名.<p>
	 *
	 */
	public String branch_nm() {
		return getConstString(offset + 22, $branch_nm);
	}

	/**
	 *  支店名.<p>
	 *
	 */
	public void branch_nm(String value) {
		setConstString(offset + 22, $branch_nm, value);
	}


	/**
	 *  支払先口座ＣＤ.<p>
	 *
	 */
	public String pay_bank_ac_cd() {
		return getConstString(offset + 23, $pay_bank_ac_cd);
	}

	/**
	 *  支払先口座ＣＤ.<p>
	 *
	 */
	public void pay_bank_ac_cd(String value) {
		setConstString(offset + 23, $pay_bank_ac_cd, value);
	}


	/**
	 *  口座番号.<p>
	 *
	 */
	public String bank_ac_no() {
		return getConstString(offset + 24, $bank_ac_no);
	}

	/**
	 *  口座番号.<p>
	 *
	 */
	public void bank_ac_no(String value) {
		setConstString(offset + 24, $bank_ac_no, value);
	}


	/**
	 *  金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return getConstNumber(offset + 25, $trd_cur_amt);
	}

	/**
	 *  金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 25, $trd_cur_amt, value);
	}

	/**
	 *  金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		setConstNumber(offset + 25, $trd_cur_amt, value);
	}

	/**
	 *  金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		setConstNumber(offset + 25, $trd_cur_amt, value);
	}

	/**
	 *  金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		setConstNumber(offset + 25, $trd_cur_amt, value);
	}

	/**
	 *  金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		setConstNumber(offset + 25, $trd_cur_amt, value);
	}


	/**
	 *  金額文字列（整数部）.<p>
	 *
	 */
	public String s_int_amt() {
		return getConstString(offset + 26, $s_int_amt);
	}

	/**
	 *  金額文字列（整数部）.<p>
	 *
	 */
	public void s_int_amt(String value) {
		setConstString(offset + 26, $s_int_amt, value);
	}


	/**
	 *  金額文字列（小数部）.<p>
	 *
	 */
	public String s_dec_amt() {
		return getConstString(offset + 27, $s_dec_amt);
	}

	/**
	 *  金額文字列（小数部）.<p>
	 *
	 */
	public void s_dec_amt(String value) {
		setConstString(offset + 27, $s_dec_amt, value);
	}


	/**
	 *  取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 28, $trd_cur_cd);
	}

	/**
	 *  取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 28, $trd_cur_cd, value);
	}


	/**
	 *  取引通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 29, $trd_cur_nm);
	}

	/**
	 *  取引通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 29, $trd_cur_nm, value);
	}


	/**
	 *  備考.<p>
	 *
	 */
	public String pay_schd_print_rmrks() {
		return getConstString(offset + 30, $pay_schd_print_rmrks);
	}

	/**
	 *  備考.<p>
	 *
	 */
	public void pay_schd_print_rmrks(String value) {
		setConstString(offset + 30, $pay_schd_print_rmrks, value);
	}


	/**
	 *  金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber amt_dec_place() {
		return getConstNumber(offset + 31, $amt_dec_place);
	}

	/**
	 *  金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(MCNumber value) {
		setConstNumber(offset + 31, $amt_dec_place, value);
	}

	/**
	 *  金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(int value) {
		setConstNumber(offset + 31, $amt_dec_place, value);
	}

	/**
	 *  金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(long value) {
		setConstNumber(offset + 31, $amt_dec_place, value);
	}

	/**
	 *  金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(float value) {
		setConstNumber(offset + 31, $amt_dec_place, value);
	}

	/**
	 *  金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(double value) {
		setConstNumber(offset + 31, $amt_dec_place, value);
	}


	/**
	 *  予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 32, $sub_char1);
	}

	/**
	 *  予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 32, $sub_char1, value);
	}


	/**
	 *  予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 33, $sub_char2);
	}

	/**
	 *  予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 33, $sub_char2, value);
	}


	/**
	 *  予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 34, $sub_char3);
	}

	/**
	 *  予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 34, $sub_char3, value);
	}


	public String getString(String name) {
		if ($psppl_cd.equalsIgnoreCase(name)) {
			return psppl_cd();
		}
		if ($psppl_nm.equalsIgnoreCase(name)) {
			return psppl_nm();
		}
		if ($psppl_alt_nm1.equalsIgnoreCase(name)) {
			return psppl_alt_nm1();
		}
		if ($psppl_alt_nm2.equalsIgnoreCase(name)) {
			return psppl_alt_nm2();
		}
		if ($psppl_alt_nm3.equalsIgnoreCase(name)) {
			return psppl_alt_nm3();
		}
		if ($psppl_alt_nm4.equalsIgnoreCase(name)) {
			return psppl_alt_nm4();
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			return bsppl_dpt_cd();
		}
		if ($bsppl_dpt_nm.equalsIgnoreCase(name)) {
			return bsppl_dpt_nm();
		}
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			return pay_chk_no();
		}
		if ($pay_schd_no.equalsIgnoreCase(name)) {
			return pay_schd_no();
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			return bsppl_cd();
		}
		if ($bsppl_nm.equalsIgnoreCase(name)) {
			return bsppl_nm();
		}
		if ($bsppl_alt_nm1.equalsIgnoreCase(name)) {
			return bsppl_alt_nm1();
		}
		if ($bsppl_alt_nm2.equalsIgnoreCase(name)) {
			return bsppl_alt_nm2();
		}
		if ($bsppl_alt_nm3.equalsIgnoreCase(name)) {
			return bsppl_alt_nm3();
		}
		if ($bsppl_alt_nm4.equalsIgnoreCase(name)) {
			return bsppl_alt_nm4();
		}
		if ($ap_sttl_cd.equalsIgnoreCase(name)) {
			return ap_sttl_cd();
		}
		if ($ap_sttl_nm.equalsIgnoreCase(name)) {
			return ap_sttl_nm();
		}
		if ($bank_cd.equalsIgnoreCase(name)) {
			return bank_cd();
		}
		if ($bank_nm.equalsIgnoreCase(name)) {
			return bank_nm();
		}
		if ($branch_cd.equalsIgnoreCase(name)) {
			return branch_cd();
		}
		if ($branch_nm.equalsIgnoreCase(name)) {
			return branch_nm();
		}
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			return pay_bank_ac_cd();
		}
		if ($bank_ac_no.equalsIgnoreCase(name)) {
			return bank_ac_no();
		}
		if ($s_int_amt.equalsIgnoreCase(name)) {
			return s_int_amt();
		}
		if ($s_dec_amt.equalsIgnoreCase(name)) {
			return s_dec_amt();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($pay_schd_print_rmrks.equalsIgnoreCase(name)) {
			return pay_schd_print_rmrks();
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
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($pay_schd_dt.equalsIgnoreCase(name)) {
			return pay_schd_dt();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($psppl_cd.equalsIgnoreCase(name)) {
			return psppl_cd();
		}
		if ($psppl_nm.equalsIgnoreCase(name)) {
			return psppl_nm();
		}
		if ($psppl_alt_nm1.equalsIgnoreCase(name)) {
			return psppl_alt_nm1();
		}
		if ($psppl_alt_nm2.equalsIgnoreCase(name)) {
			return psppl_alt_nm2();
		}
		if ($psppl_alt_nm3.equalsIgnoreCase(name)) {
			return psppl_alt_nm3();
		}
		if ($psppl_alt_nm4.equalsIgnoreCase(name)) {
			return psppl_alt_nm4();
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			return bsppl_dpt_cd();
		}
		if ($bsppl_dpt_nm.equalsIgnoreCase(name)) {
			return bsppl_dpt_nm();
		}
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			return pay_chk_no();
		}
		if ($pay_schd_no.equalsIgnoreCase(name)) {
			return pay_schd_no();
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			return bsppl_cd();
		}
		if ($bsppl_nm.equalsIgnoreCase(name)) {
			return bsppl_nm();
		}
		if ($bsppl_alt_nm1.equalsIgnoreCase(name)) {
			return bsppl_alt_nm1();
		}
		if ($bsppl_alt_nm2.equalsIgnoreCase(name)) {
			return bsppl_alt_nm2();
		}
		if ($bsppl_alt_nm3.equalsIgnoreCase(name)) {
			return bsppl_alt_nm3();
		}
		if ($bsppl_alt_nm4.equalsIgnoreCase(name)) {
			return bsppl_alt_nm4();
		}
		if ($ap_sttl_cd.equalsIgnoreCase(name)) {
			return ap_sttl_cd();
		}
		if ($ap_sttl_nm.equalsIgnoreCase(name)) {
			return ap_sttl_nm();
		}
		if ($bank_cd.equalsIgnoreCase(name)) {
			return bank_cd();
		}
		if ($bank_nm.equalsIgnoreCase(name)) {
			return bank_nm();
		}
		if ($branch_cd.equalsIgnoreCase(name)) {
			return branch_cd();
		}
		if ($branch_nm.equalsIgnoreCase(name)) {
			return branch_nm();
		}
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			return pay_bank_ac_cd();
		}
		if ($bank_ac_no.equalsIgnoreCase(name)) {
			return bank_ac_no();
		}
		if ($s_int_amt.equalsIgnoreCase(name)) {
			return s_int_amt();
		}
		if ($s_dec_amt.equalsIgnoreCase(name)) {
			return s_dec_amt();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($pay_schd_print_rmrks.equalsIgnoreCase(name)) {
			return pay_schd_print_rmrks();
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
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($pay_schd_dt.equalsIgnoreCase(name)) {
			return pay_schd_dt();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($psppl_cd.equalsIgnoreCase(name)) {
			psppl_cd(value);
			return;
		}
		if ($psppl_nm.equalsIgnoreCase(name)) {
			psppl_nm(value);
			return;
		}
		if ($psppl_alt_nm1.equalsIgnoreCase(name)) {
			psppl_alt_nm1(value);
			return;
		}
		if ($psppl_alt_nm2.equalsIgnoreCase(name)) {
			psppl_alt_nm2(value);
			return;
		}
		if ($psppl_alt_nm3.equalsIgnoreCase(name)) {
			psppl_alt_nm3(value);
			return;
		}
		if ($psppl_alt_nm4.equalsIgnoreCase(name)) {
			psppl_alt_nm4(value);
			return;
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			bsppl_dpt_cd(value);
			return;
		}
		if ($bsppl_dpt_nm.equalsIgnoreCase(name)) {
			bsppl_dpt_nm(value);
			return;
		}
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			pay_chk_no(value);
			return;
		}
		if ($pay_schd_no.equalsIgnoreCase(name)) {
			pay_schd_no(value);
			return;
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			bsppl_cd(value);
			return;
		}
		if ($bsppl_nm.equalsIgnoreCase(name)) {
			bsppl_nm(value);
			return;
		}
		if ($bsppl_alt_nm1.equalsIgnoreCase(name)) {
			bsppl_alt_nm1(value);
			return;
		}
		if ($bsppl_alt_nm2.equalsIgnoreCase(name)) {
			bsppl_alt_nm2(value);
			return;
		}
		if ($bsppl_alt_nm3.equalsIgnoreCase(name)) {
			bsppl_alt_nm3(value);
			return;
		}
		if ($bsppl_alt_nm4.equalsIgnoreCase(name)) {
			bsppl_alt_nm4(value);
			return;
		}
		if ($ap_sttl_cd.equalsIgnoreCase(name)) {
			ap_sttl_cd(value);
			return;
		}
		if ($ap_sttl_nm.equalsIgnoreCase(name)) {
			ap_sttl_nm(value);
			return;
		}
		if ($bank_cd.equalsIgnoreCase(name)) {
			bank_cd(value);
			return;
		}
		if ($bank_nm.equalsIgnoreCase(name)) {
			bank_nm(value);
			return;
		}
		if ($branch_cd.equalsIgnoreCase(name)) {
			branch_cd(value);
			return;
		}
		if ($branch_nm.equalsIgnoreCase(name)) {
			branch_nm(value);
			return;
		}
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			pay_bank_ac_cd(value);
			return;
		}
		if ($bank_ac_no.equalsIgnoreCase(name)) {
			bank_ac_no(value);
			return;
		}
		if ($s_int_amt.equalsIgnoreCase(name)) {
			s_int_amt(value);
			return;
		}
		if ($s_dec_amt.equalsIgnoreCase(name)) {
			s_dec_amt(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		if ($pay_schd_print_rmrks.equalsIgnoreCase(name)) {
			pay_schd_print_rmrks(value);
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
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($pay_schd_dt.equalsIgnoreCase(name)) {
			pay_schd_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($psppl_cd.equalsIgnoreCase(name)) {
			psppl_cd(value);
			return;
		}
		if ($psppl_nm.equalsIgnoreCase(name)) {
			psppl_nm(value);
			return;
		}
		if ($psppl_alt_nm1.equalsIgnoreCase(name)) {
			psppl_alt_nm1(value);
			return;
		}
		if ($psppl_alt_nm2.equalsIgnoreCase(name)) {
			psppl_alt_nm2(value);
			return;
		}
		if ($psppl_alt_nm3.equalsIgnoreCase(name)) {
			psppl_alt_nm3(value);
			return;
		}
		if ($psppl_alt_nm4.equalsIgnoreCase(name)) {
			psppl_alt_nm4(value);
			return;
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			bsppl_dpt_cd(value);
			return;
		}
		if ($bsppl_dpt_nm.equalsIgnoreCase(name)) {
			bsppl_dpt_nm(value);
			return;
		}
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			pay_chk_no(value);
			return;
		}
		if ($pay_schd_no.equalsIgnoreCase(name)) {
			pay_schd_no(value);
			return;
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			bsppl_cd(value);
			return;
		}
		if ($bsppl_nm.equalsIgnoreCase(name)) {
			bsppl_nm(value);
			return;
		}
		if ($bsppl_alt_nm1.equalsIgnoreCase(name)) {
			bsppl_alt_nm1(value);
			return;
		}
		if ($bsppl_alt_nm2.equalsIgnoreCase(name)) {
			bsppl_alt_nm2(value);
			return;
		}
		if ($bsppl_alt_nm3.equalsIgnoreCase(name)) {
			bsppl_alt_nm3(value);
			return;
		}
		if ($bsppl_alt_nm4.equalsIgnoreCase(name)) {
			bsppl_alt_nm4(value);
			return;
		}
		if ($ap_sttl_cd.equalsIgnoreCase(name)) {
			ap_sttl_cd(value);
			return;
		}
		if ($ap_sttl_nm.equalsIgnoreCase(name)) {
			ap_sttl_nm(value);
			return;
		}
		if ($bank_cd.equalsIgnoreCase(name)) {
			bank_cd(value);
			return;
		}
		if ($bank_nm.equalsIgnoreCase(name)) {
			bank_nm(value);
			return;
		}
		if ($branch_cd.equalsIgnoreCase(name)) {
			branch_cd(value);
			return;
		}
		if ($branch_nm.equalsIgnoreCase(name)) {
			branch_nm(value);
			return;
		}
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			pay_bank_ac_cd(value);
			return;
		}
		if ($bank_ac_no.equalsIgnoreCase(name)) {
			bank_ac_no(value);
			return;
		}
		if ($s_int_amt.equalsIgnoreCase(name)) {
			s_int_amt(value);
			return;
		}
		if ($s_dec_amt.equalsIgnoreCase(name)) {
			s_dec_amt(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		if ($pay_schd_print_rmrks.equalsIgnoreCase(name)) {
			pay_schd_print_rmrks(value);
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
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($pay_schd_dt.equalsIgnoreCase(name)) {
			pay_schd_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

