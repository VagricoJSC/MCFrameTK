package mcframe.commonMSBG.MSBGR0040;

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
 * ブロック"RcvHdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RcvHdrR_MC_A extends MCConstRow {

	/**
	 *  入金ＮＯ.<p>
	 *
	 */
	public static final String $rcv_no = "rcv_no";
	/**
	 *  種別.<p>
	 *
	 */
	public static final String $rcv_prnt_typ_nm = "rcv_prnt_typ_nm";
	/**
	 *  入金部門ＣＤ.<p>
	 *
	 */
	public static final String $rcv_dpt_cd = "rcv_dpt_cd";
	/**
	 *  入金部門名.<p>
	 *
	 */
	public static final String $rcv_dpt_nm = "rcv_dpt_nm";
	/**
	 *  入金担当者ＣＤ.<p>
	 *
	 */
	public static final String $rcv_usr_cd = "rcv_usr_cd";
	/**
	 *  入金担当者名.<p>
	 *
	 */
	public static final String $rcv_usr_nm = "rcv_usr_nm";
	/**
	 *  入金方法ＣＤ.<p>
	 *
	 */
	public static final String $rcv_mtd_cd = "rcv_mtd_cd";
	/**
	 *  入金方法名.<p>
	 *
	 */
	public static final String $rcv_mtd_nm = "rcv_mtd_nm";
	/**
	 *  入金日.<p>
	 *
	 */
	public static final String $rcv_dt = "rcv_dt";
	/**
	 *  入金先ＣＤ.<p>
	 *
	 */
	public static final String $rcst_cd = "rcst_cd";
	/**
	 *  入金先名.<p>
	 *
	 */
	public static final String $rcst_nm = "rcst_nm";
	/**
	 *  入金先別名１.<p>
	 *
	 */
	public static final String $rcst_alt_nm1 = "rcst_alt_nm1";
	/**
	 *  入金先別名２.<p>
	 *
	 */
	public static final String $rcst_alt_nm2 = "rcst_alt_nm2";
	/**
	 *  入金先別名３.<p>
	 *
	 */
	public static final String $rcst_alt_nm3 = "rcst_alt_nm3";
	/**
	 *  入金先別名４.<p>
	 *
	 */
	public static final String $rcst_alt_nm4 = "rcst_alt_nm4";
	/**
	 *  請求先ＣＤ.<p>
	 *
	 */
	public static final String $bcst_cd = "bcst_cd";
	/**
	 *  請求先名.<p>
	 *
	 */
	public static final String $bcst_nm = "bcst_nm";
	/**
	 *  請求先別名１.<p>
	 *
	 */
	public static final String $bcst_alt_nm1 = "bcst_alt_nm1";
	/**
	 *  請求先別名２.<p>
	 *
	 */
	public static final String $bcst_alt_nm2 = "bcst_alt_nm2";
	/**
	 *  請求先別名３.<p>
	 *
	 */
	public static final String $bcst_alt_nm3 = "bcst_alt_nm3";
	/**
	 *  請求先別名４.<p>
	 *
	 */
	public static final String $bcst_alt_nm4 = "bcst_alt_nm4";
	/**
	 *  請求部門ＣＤ.<p>
	 *
	 */
	public static final String $bill_dpt_cd = "bill_dpt_cd";
	/**
	 *  請求部門名.<p>
	 *
	 */
	public static final String $bill_dpt_nm = "bill_dpt_nm";
	/**
	 *  口座ＣＤ.<p>
	 *
	 */
	public static final String $bank_ac_cd = "bank_ac_cd";
	/**
	 *  口座名.<p>
	 *
	 */
	public static final String $bank_ac_nm = "bank_ac_nm";
	/**
	 *  振込人名.<p>
	 *
	 */
	public static final String $xfr_psn = "xfr_psn";
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
	 *  口座番号.<p>
	 *
	 */
	public static final String $bank_ac_no = "bank_ac_no";
	/**
	 *  発行日時.<p>
	 *
	 */
	public static final String $prnt_tm = "prnt_tm";
	/**
	 *  手形番号.<p>
	 *
	 */
	public static final String $note_no = "note_no";
	/**
	 *  手形区分.<p>
	 *
	 */
	public static final String $note_typ = "note_typ";
	/**
	 *  手形区分名.<p>
	 *
	 */
	public static final String $note_typ_nm = "note_typ_nm";
	/**
	 *  決済日.<p>
	 *
	 */
	public static final String $due_dt = "due_dt";
	/**
	 *  振出人名.<p>
	 *
	 */
	public static final String $drawer_nm = "drawer_nm";
	/**
	 *  裏書人.<p>
	 *
	 */
	public static final String $endrsr = "endrsr";
	/**
	 *  引受人.<p>
	 *
	 */
	public static final String $accptr = "accptr";
	/**
	 *  振出銀行ＣＤ.<p>
	 *
	 */
	public static final String $draw_bank_cd = "draw_bank_cd";
	/**
	 *  振出銀行名.<p>
	 *
	 */
	public static final String $draw_bank_nm = "draw_bank_nm";
	/**
	 *  振出支店ＣＤ.<p>
	 *
	 */
	public static final String $draw_branch_cd = "draw_branch_cd";
	/**
	 *  振出支店名.<p>
	 *
	 */
	public static final String $draw_branch_nm = "draw_branch_nm";
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
	 *  為替レート.<p>
	 *
	 */
	public static final String $xrate = "xrate";
	/**
	 *  為替レート.<p>
	 *
	 */
	public static final String $s_xrate = "s_xrate";
	/**
	 *  入金額.<p>
	 *
	 */
	public static final String $rcv_amt = "rcv_amt";
	/**
	 *  入金額.<p>
	 *
	 */
	public static final String $s_rcv_amt = "s_rcv_amt";
	/**
	 *  入金備考.<p>
	 *
	 */
	public static final String $rcv_rmrks = "rcv_rmrks";
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


	public static final MCMeta rcv_no_META = createCommonMeta($rcv_no, mcframe.commonMA.meta.MA_META.RCV_NO);
	public static final MCMeta rcv_prnt_typ_nm_META = createStringMeta($rcv_prnt_typ_nm);
	public static final MCMeta rcv_dpt_cd_META = createCommonMeta($rcv_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta rcv_dpt_nm_META = createCommonMeta($rcv_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta rcv_usr_cd_META = createCommonMeta($rcv_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta rcv_usr_nm_META = createCommonMeta($rcv_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta rcv_mtd_cd_META = createCommonMeta($rcv_mtd_cd, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta rcv_mtd_nm_META = createCommonMeta($rcv_mtd_nm, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta rcv_dt_META = createCommonMeta($rcv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rcst_cd_META = createCommonMeta($rcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta rcst_nm_META = createCommonMeta($rcst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta rcst_alt_nm1_META = createCommonMeta($rcst_alt_nm1, mcframe.commonMA.meta.MA_META.BP_ALT_NM1);
	public static final MCMeta rcst_alt_nm2_META = createCommonMeta($rcst_alt_nm2, mcframe.commonMA.meta.MA_META.BP_ALT_NM2);
	public static final MCMeta rcst_alt_nm3_META = createCommonMeta($rcst_alt_nm3, mcframe.commonMA.meta.MA_META.BP_ALT_NM3);
	public static final MCMeta rcst_alt_nm4_META = createCommonMeta($rcst_alt_nm4, mcframe.commonMA.meta.MA_META.BP_ALT_NM4);
	public static final MCMeta bcst_cd_META = createCommonMeta($bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bcst_nm_META = createCommonMeta($bcst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bcst_alt_nm1_META = createCommonMeta($bcst_alt_nm1, mcframe.commonMA.meta.MA_META.BP_ALT_NM1);
	public static final MCMeta bcst_alt_nm2_META = createCommonMeta($bcst_alt_nm2, mcframe.commonMA.meta.MA_META.BP_ALT_NM2);
	public static final MCMeta bcst_alt_nm3_META = createCommonMeta($bcst_alt_nm3, mcframe.commonMA.meta.MA_META.BP_ALT_NM3);
	public static final MCMeta bcst_alt_nm4_META = createCommonMeta($bcst_alt_nm4, mcframe.commonMA.meta.MA_META.BP_ALT_NM4);
	public static final MCMeta bill_dpt_cd_META = createCommonMeta($bill_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bill_dpt_nm_META = createCommonMeta($bill_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta bank_ac_cd_META = createCommonMeta($bank_ac_cd, mcframe.commonMA.meta.MA_META.BANK_AC_CD);
	public static final MCMeta bank_ac_nm_META = createCommonMeta($bank_ac_nm, mcframe.commonMA.meta.MA_META.BANK_AC_NM);
	public static final MCMeta xfr_psn_META = createCommonMeta($xfr_psn, mcframe.commonMA.meta.MA_META.XFR_PSN);
	public static final MCMeta bank_cd_META = createCommonMeta($bank_cd, mcframe.commonMA.meta.MA_META.BANK_CD);
	public static final MCMeta bank_nm_META = createCommonMeta($bank_nm, mcframe.commonMA.meta.MA_META.BANK_NM);
	public static final MCMeta branch_cd_META = createCommonMeta($branch_cd, mcframe.commonMA.meta.MA_META.BANK_BRANCH_CD);
	public static final MCMeta branch_nm_META = createCommonMeta($branch_nm, mcframe.commonMA.meta.MA_META.BANK_BRANCH_NM);
	public static final MCMeta bank_ac_no_META = createCommonMeta($bank_ac_no, mcframe.commonMA.meta.MA_META.BANK_AC_NO);
	public static final MCMeta prnt_tm_META = createCommonMeta($prnt_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta note_no_META = createCommonMeta($note_no, mcframe.commonMA.meta.MA_META.NOTE_NO);
	public static final MCMeta note_typ_META = createCommonMeta($note_typ, mcframe.commonMA.meta.MA_META.NOTE_TYP);
	public static final MCMeta note_typ_nm_META = createCommonMeta($note_typ_nm, mcframe.commonMA.meta.MA_META.NOTE_TYP_NM);
	public static final MCMeta due_dt_META = createCommonMeta($due_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta drawer_nm_META = createCommonMeta($drawer_nm, mcframe.commonMA.meta.MA_META.DRAWER_NM);
	public static final MCMeta endrsr_META = createCommonMeta($endrsr, mcframe.commonMA.meta.MA_META.NOTE_ENDRSR);
	public static final MCMeta accptr_META = createCommonMeta($accptr, mcframe.commonMA.meta.MA_META.NOTE_ACCPTR);
	public static final MCMeta draw_bank_cd_META = createCommonMeta($draw_bank_cd, mcframe.commonMA.meta.MA_META.BANK_CD);
	public static final MCMeta draw_bank_nm_META = createCommonMeta($draw_bank_nm, mcframe.commonMA.meta.MA_META.BANK_NM);
	public static final MCMeta draw_branch_cd_META = createCommonMeta($draw_branch_cd, mcframe.commonMA.meta.MA_META.BANK_BRANCH_CD);
	public static final MCMeta draw_branch_nm_META = createCommonMeta($draw_branch_nm, mcframe.commonMA.meta.MA_META.BANK_BRANCH_NM);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta xrate_META = createCommonMeta($xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_xrate_META = createStringMeta($s_xrate);
	public static final MCMeta rcv_amt_META = createCommonMeta($rcv_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_rcv_amt_META = createStringMeta($s_rcv_amt);
	public static final MCMeta rcv_rmrks_META = createCommonMeta($rcv_rmrks, mcframe.commonMS.meta.MS_META.RCV_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.RCV_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.RCV_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.RCV_SUB_CHAR3);

	protected static final ConstMetaList<RcvHdrR> constMetas = new ConstMetaList<RcvHdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			rcv_no_META,
			rcv_prnt_typ_nm_META,
			rcv_dpt_cd_META,
			rcv_dpt_nm_META,
			rcv_usr_cd_META,
			rcv_usr_nm_META,
			rcv_mtd_cd_META,
			rcv_mtd_nm_META,
			rcv_dt_META,
			rcst_cd_META,
			rcst_nm_META,
			rcst_alt_nm1_META,
			rcst_alt_nm2_META,
			rcst_alt_nm3_META,
			rcst_alt_nm4_META,
			bcst_cd_META,
			bcst_nm_META,
			bcst_alt_nm1_META,
			bcst_alt_nm2_META,
			bcst_alt_nm3_META,
			bcst_alt_nm4_META,
			bill_dpt_cd_META,
			bill_dpt_nm_META,
			bank_ac_cd_META,
			bank_ac_nm_META,
			xfr_psn_META,
			bank_cd_META,
			bank_nm_META,
			branch_cd_META,
			branch_nm_META,
			bank_ac_no_META,
			prnt_tm_META,
			note_no_META,
			note_typ_META,
			note_typ_nm_META,
			due_dt_META,
			drawer_nm_META,
			endrsr_META,
			accptr_META,
			draw_bank_cd_META,
			draw_bank_nm_META,
			draw_branch_cd_META,
			draw_branch_nm_META,
			trd_cur_cd_META,
			trd_cur_nm_META,
			xrate_META,
			s_xrate_META,
			rcv_amt_META,
			s_rcv_amt_META,
			rcv_rmrks_META,
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
	protected RcvHdrR_MC_A(ConstMetaList<? extends RcvHdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RcvHdrR clone() {
		return (RcvHdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RcvHdrR createInstance() {
		return (RcvHdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RcvHdrR getValues(String... names) {
		return (RcvHdrR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  入金ＮＯ.<p>
	 *
	 */
	public String rcv_no() {
		return getConstString(offset + 0, $rcv_no);
	}

	/**
	 *  入金ＮＯ.<p>
	 *
	 */
	public void rcv_no(String value) {
		setConstString(offset + 0, $rcv_no, value);
	}


	/**
	 *  種別.<p>
	 *
	 */
	public String rcv_prnt_typ_nm() {
		return getConstString(offset + 1, $rcv_prnt_typ_nm);
	}

	/**
	 *  種別.<p>
	 *
	 */
	public void rcv_prnt_typ_nm(String value) {
		setConstString(offset + 1, $rcv_prnt_typ_nm, value);
	}


	/**
	 *  入金部門ＣＤ.<p>
	 *
	 */
	public String rcv_dpt_cd() {
		return getConstString(offset + 2, $rcv_dpt_cd);
	}

	/**
	 *  入金部門ＣＤ.<p>
	 *
	 */
	public void rcv_dpt_cd(String value) {
		setConstString(offset + 2, $rcv_dpt_cd, value);
	}


	/**
	 *  入金部門名.<p>
	 *
	 */
	public String rcv_dpt_nm() {
		return getConstString(offset + 3, $rcv_dpt_nm);
	}

	/**
	 *  入金部門名.<p>
	 *
	 */
	public void rcv_dpt_nm(String value) {
		setConstString(offset + 3, $rcv_dpt_nm, value);
	}


	/**
	 *  入金担当者ＣＤ.<p>
	 *
	 */
	public String rcv_usr_cd() {
		return getConstString(offset + 4, $rcv_usr_cd);
	}

	/**
	 *  入金担当者ＣＤ.<p>
	 *
	 */
	public void rcv_usr_cd(String value) {
		setConstString(offset + 4, $rcv_usr_cd, value);
	}


	/**
	 *  入金担当者名.<p>
	 *
	 */
	public String rcv_usr_nm() {
		return getConstString(offset + 5, $rcv_usr_nm);
	}

	/**
	 *  入金担当者名.<p>
	 *
	 */
	public void rcv_usr_nm(String value) {
		setConstString(offset + 5, $rcv_usr_nm, value);
	}


	/**
	 *  入金方法ＣＤ.<p>
	 *
	 */
	public String rcv_mtd_cd() {
		return getConstString(offset + 6, $rcv_mtd_cd);
	}

	/**
	 *  入金方法ＣＤ.<p>
	 *
	 */
	public void rcv_mtd_cd(String value) {
		setConstString(offset + 6, $rcv_mtd_cd, value);
	}


	/**
	 *  入金方法名.<p>
	 *
	 */
	public String rcv_mtd_nm() {
		return getConstString(offset + 7, $rcv_mtd_nm);
	}

	/**
	 *  入金方法名.<p>
	 *
	 */
	public void rcv_mtd_nm(String value) {
		setConstString(offset + 7, $rcv_mtd_nm, value);
	}


	/**
	 *  入金日.<p>
	 *
	 */
	public MCDate rcv_dt() {
		return getConstDate(offset + 8, $rcv_dt);
	}

	/**
	 *  入金日.<p>
	 *
	 */
	public void rcv_dt(MCDate value) {
		setConstDate(offset + 8, $rcv_dt, value);
	}


	/**
	 *  入金先ＣＤ.<p>
	 *
	 */
	public String rcst_cd() {
		return getConstString(offset + 9, $rcst_cd);
	}

	/**
	 *  入金先ＣＤ.<p>
	 *
	 */
	public void rcst_cd(String value) {
		setConstString(offset + 9, $rcst_cd, value);
	}


	/**
	 *  入金先名.<p>
	 *
	 */
	public String rcst_nm() {
		return getConstString(offset + 10, $rcst_nm);
	}

	/**
	 *  入金先名.<p>
	 *
	 */
	public void rcst_nm(String value) {
		setConstString(offset + 10, $rcst_nm, value);
	}


	/**
	 *  入金先別名１.<p>
	 *
	 */
	public String rcst_alt_nm1() {
		return getConstString(offset + 11, $rcst_alt_nm1);
	}

	/**
	 *  入金先別名１.<p>
	 *
	 */
	public void rcst_alt_nm1(String value) {
		setConstString(offset + 11, $rcst_alt_nm1, value);
	}


	/**
	 *  入金先別名２.<p>
	 *
	 */
	public String rcst_alt_nm2() {
		return getConstString(offset + 12, $rcst_alt_nm2);
	}

	/**
	 *  入金先別名２.<p>
	 *
	 */
	public void rcst_alt_nm2(String value) {
		setConstString(offset + 12, $rcst_alt_nm2, value);
	}


	/**
	 *  入金先別名３.<p>
	 *
	 */
	public String rcst_alt_nm3() {
		return getConstString(offset + 13, $rcst_alt_nm3);
	}

	/**
	 *  入金先別名３.<p>
	 *
	 */
	public void rcst_alt_nm3(String value) {
		setConstString(offset + 13, $rcst_alt_nm3, value);
	}


	/**
	 *  入金先別名４.<p>
	 *
	 */
	public String rcst_alt_nm4() {
		return getConstString(offset + 14, $rcst_alt_nm4);
	}

	/**
	 *  入金先別名４.<p>
	 *
	 */
	public void rcst_alt_nm4(String value) {
		setConstString(offset + 14, $rcst_alt_nm4, value);
	}


	/**
	 *  請求先ＣＤ.<p>
	 *
	 */
	public String bcst_cd() {
		return getConstString(offset + 15, $bcst_cd);
	}

	/**
	 *  請求先ＣＤ.<p>
	 *
	 */
	public void bcst_cd(String value) {
		setConstString(offset + 15, $bcst_cd, value);
	}


	/**
	 *  請求先名.<p>
	 *
	 */
	public String bcst_nm() {
		return getConstString(offset + 16, $bcst_nm);
	}

	/**
	 *  請求先名.<p>
	 *
	 */
	public void bcst_nm(String value) {
		setConstString(offset + 16, $bcst_nm, value);
	}


	/**
	 *  請求先別名１.<p>
	 *
	 */
	public String bcst_alt_nm1() {
		return getConstString(offset + 17, $bcst_alt_nm1);
	}

	/**
	 *  請求先別名１.<p>
	 *
	 */
	public void bcst_alt_nm1(String value) {
		setConstString(offset + 17, $bcst_alt_nm1, value);
	}


	/**
	 *  請求先別名２.<p>
	 *
	 */
	public String bcst_alt_nm2() {
		return getConstString(offset + 18, $bcst_alt_nm2);
	}

	/**
	 *  請求先別名２.<p>
	 *
	 */
	public void bcst_alt_nm2(String value) {
		setConstString(offset + 18, $bcst_alt_nm2, value);
	}


	/**
	 *  請求先別名３.<p>
	 *
	 */
	public String bcst_alt_nm3() {
		return getConstString(offset + 19, $bcst_alt_nm3);
	}

	/**
	 *  請求先別名３.<p>
	 *
	 */
	public void bcst_alt_nm3(String value) {
		setConstString(offset + 19, $bcst_alt_nm3, value);
	}


	/**
	 *  請求先別名４.<p>
	 *
	 */
	public String bcst_alt_nm4() {
		return getConstString(offset + 20, $bcst_alt_nm4);
	}

	/**
	 *  請求先別名４.<p>
	 *
	 */
	public void bcst_alt_nm4(String value) {
		setConstString(offset + 20, $bcst_alt_nm4, value);
	}


	/**
	 *  請求部門ＣＤ.<p>
	 *
	 */
	public String bill_dpt_cd() {
		return getConstString(offset + 21, $bill_dpt_cd);
	}

	/**
	 *  請求部門ＣＤ.<p>
	 *
	 */
	public void bill_dpt_cd(String value) {
		setConstString(offset + 21, $bill_dpt_cd, value);
	}


	/**
	 *  請求部門名.<p>
	 *
	 */
	public String bill_dpt_nm() {
		return getConstString(offset + 22, $bill_dpt_nm);
	}

	/**
	 *  請求部門名.<p>
	 *
	 */
	public void bill_dpt_nm(String value) {
		setConstString(offset + 22, $bill_dpt_nm, value);
	}


	/**
	 *  口座ＣＤ.<p>
	 *
	 */
	public String bank_ac_cd() {
		return getConstString(offset + 23, $bank_ac_cd);
	}

	/**
	 *  口座ＣＤ.<p>
	 *
	 */
	public void bank_ac_cd(String value) {
		setConstString(offset + 23, $bank_ac_cd, value);
	}


	/**
	 *  口座名.<p>
	 *
	 */
	public String bank_ac_nm() {
		return getConstString(offset + 24, $bank_ac_nm);
	}

	/**
	 *  口座名.<p>
	 *
	 */
	public void bank_ac_nm(String value) {
		setConstString(offset + 24, $bank_ac_nm, value);
	}


	/**
	 *  振込人名.<p>
	 *
	 */
	public String xfr_psn() {
		return getConstString(offset + 25, $xfr_psn);
	}

	/**
	 *  振込人名.<p>
	 *
	 */
	public void xfr_psn(String value) {
		setConstString(offset + 25, $xfr_psn, value);
	}


	/**
	 *  銀行ＣＤ.<p>
	 *
	 */
	public String bank_cd() {
		return getConstString(offset + 26, $bank_cd);
	}

	/**
	 *  銀行ＣＤ.<p>
	 *
	 */
	public void bank_cd(String value) {
		setConstString(offset + 26, $bank_cd, value);
	}


	/**
	 *  銀行名.<p>
	 *
	 */
	public String bank_nm() {
		return getConstString(offset + 27, $bank_nm);
	}

	/**
	 *  銀行名.<p>
	 *
	 */
	public void bank_nm(String value) {
		setConstString(offset + 27, $bank_nm, value);
	}


	/**
	 *  支店ＣＤ.<p>
	 *
	 */
	public String branch_cd() {
		return getConstString(offset + 28, $branch_cd);
	}

	/**
	 *  支店ＣＤ.<p>
	 *
	 */
	public void branch_cd(String value) {
		setConstString(offset + 28, $branch_cd, value);
	}


	/**
	 *  支店名.<p>
	 *
	 */
	public String branch_nm() {
		return getConstString(offset + 29, $branch_nm);
	}

	/**
	 *  支店名.<p>
	 *
	 */
	public void branch_nm(String value) {
		setConstString(offset + 29, $branch_nm, value);
	}


	/**
	 *  口座番号.<p>
	 *
	 */
	public String bank_ac_no() {
		return getConstString(offset + 30, $bank_ac_no);
	}

	/**
	 *  口座番号.<p>
	 *
	 */
	public void bank_ac_no(String value) {
		setConstString(offset + 30, $bank_ac_no, value);
	}


	/**
	 *  発行日時.<p>
	 *
	 */
	public MCDate prnt_tm() {
		return getConstDate(offset + 31, $prnt_tm);
	}

	/**
	 *  発行日時.<p>
	 *
	 */
	public void prnt_tm(MCDate value) {
		setConstDate(offset + 31, $prnt_tm, value);
	}


	/**
	 *  手形番号.<p>
	 *
	 */
	public String note_no() {
		return getConstString(offset + 32, $note_no);
	}

	/**
	 *  手形番号.<p>
	 *
	 */
	public void note_no(String value) {
		setConstString(offset + 32, $note_no, value);
	}


	/**
	 *  手形区分.<p>
	 *
	 */
	public String note_typ() {
		return getConstString(offset + 33, $note_typ);
	}

	/**
	 *  手形区分.<p>
	 *
	 */
	public void note_typ(String value) {
		setConstString(offset + 33, $note_typ, value);
	}


	/**
	 *  手形区分名.<p>
	 *
	 */
	public String note_typ_nm() {
		return getConstString(offset + 34, $note_typ_nm);
	}

	/**
	 *  手形区分名.<p>
	 *
	 */
	public void note_typ_nm(String value) {
		setConstString(offset + 34, $note_typ_nm, value);
	}


	/**
	 *  決済日.<p>
	 *
	 */
	public MCDate due_dt() {
		return getConstDate(offset + 35, $due_dt);
	}

	/**
	 *  決済日.<p>
	 *
	 */
	public void due_dt(MCDate value) {
		setConstDate(offset + 35, $due_dt, value);
	}


	/**
	 *  振出人名.<p>
	 *
	 */
	public String drawer_nm() {
		return getConstString(offset + 36, $drawer_nm);
	}

	/**
	 *  振出人名.<p>
	 *
	 */
	public void drawer_nm(String value) {
		setConstString(offset + 36, $drawer_nm, value);
	}


	/**
	 *  裏書人.<p>
	 *
	 */
	public String endrsr() {
		return getConstString(offset + 37, $endrsr);
	}

	/**
	 *  裏書人.<p>
	 *
	 */
	public void endrsr(String value) {
		setConstString(offset + 37, $endrsr, value);
	}


	/**
	 *  引受人.<p>
	 *
	 */
	public String accptr() {
		return getConstString(offset + 38, $accptr);
	}

	/**
	 *  引受人.<p>
	 *
	 */
	public void accptr(String value) {
		setConstString(offset + 38, $accptr, value);
	}


	/**
	 *  振出銀行ＣＤ.<p>
	 *
	 */
	public String draw_bank_cd() {
		return getConstString(offset + 39, $draw_bank_cd);
	}

	/**
	 *  振出銀行ＣＤ.<p>
	 *
	 */
	public void draw_bank_cd(String value) {
		setConstString(offset + 39, $draw_bank_cd, value);
	}


	/**
	 *  振出銀行名.<p>
	 *
	 */
	public String draw_bank_nm() {
		return getConstString(offset + 40, $draw_bank_nm);
	}

	/**
	 *  振出銀行名.<p>
	 *
	 */
	public void draw_bank_nm(String value) {
		setConstString(offset + 40, $draw_bank_nm, value);
	}


	/**
	 *  振出支店ＣＤ.<p>
	 *
	 */
	public String draw_branch_cd() {
		return getConstString(offset + 41, $draw_branch_cd);
	}

	/**
	 *  振出支店ＣＤ.<p>
	 *
	 */
	public void draw_branch_cd(String value) {
		setConstString(offset + 41, $draw_branch_cd, value);
	}


	/**
	 *  振出支店名.<p>
	 *
	 */
	public String draw_branch_nm() {
		return getConstString(offset + 42, $draw_branch_nm);
	}

	/**
	 *  振出支店名.<p>
	 *
	 */
	public void draw_branch_nm(String value) {
		setConstString(offset + 42, $draw_branch_nm, value);
	}


	/**
	 *  取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 43, $trd_cur_cd);
	}

	/**
	 *  取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 43, $trd_cur_cd, value);
	}


	/**
	 *  取引通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 44, $trd_cur_nm);
	}

	/**
	 *  取引通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 44, $trd_cur_nm, value);
	}


	/**
	 *  為替レート.<p>
	 *
	 */
	public MCNumber xrate() {
		return getConstNumber(offset + 45, $xrate);
	}

	/**
	 *  為替レート.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		setConstNumber(offset + 45, $xrate, value);
	}

	/**
	 *  為替レート.<p>
	 *
	 */
	public void xrate(int value) {
		setConstNumber(offset + 45, $xrate, value);
	}

	/**
	 *  為替レート.<p>
	 *
	 */
	public void xrate(long value) {
		setConstNumber(offset + 45, $xrate, value);
	}

	/**
	 *  為替レート.<p>
	 *
	 */
	public void xrate(float value) {
		setConstNumber(offset + 45, $xrate, value);
	}

	/**
	 *  為替レート.<p>
	 *
	 */
	public void xrate(double value) {
		setConstNumber(offset + 45, $xrate, value);
	}


	/**
	 *  為替レート.<p>
	 *
	 */
	public String s_xrate() {
		return getConstString(offset + 46, $s_xrate);
	}

	/**
	 *  為替レート.<p>
	 *
	 */
	public void s_xrate(String value) {
		setConstString(offset + 46, $s_xrate, value);
	}


	/**
	 *  入金額.<p>
	 *
	 */
	public MCNumber rcv_amt() {
		return getConstNumber(offset + 47, $rcv_amt);
	}

	/**
	 *  入金額.<p>
	 *
	 */
	public void rcv_amt(MCNumber value) {
		setConstNumber(offset + 47, $rcv_amt, value);
	}

	/**
	 *  入金額.<p>
	 *
	 */
	public void rcv_amt(int value) {
		setConstNumber(offset + 47, $rcv_amt, value);
	}

	/**
	 *  入金額.<p>
	 *
	 */
	public void rcv_amt(long value) {
		setConstNumber(offset + 47, $rcv_amt, value);
	}

	/**
	 *  入金額.<p>
	 *
	 */
	public void rcv_amt(float value) {
		setConstNumber(offset + 47, $rcv_amt, value);
	}

	/**
	 *  入金額.<p>
	 *
	 */
	public void rcv_amt(double value) {
		setConstNumber(offset + 47, $rcv_amt, value);
	}


	/**
	 *  入金額.<p>
	 *
	 */
	public String s_rcv_amt() {
		return getConstString(offset + 48, $s_rcv_amt);
	}

	/**
	 *  入金額.<p>
	 *
	 */
	public void s_rcv_amt(String value) {
		setConstString(offset + 48, $s_rcv_amt, value);
	}


	/**
	 *  入金備考.<p>
	 *
	 */
	public String rcv_rmrks() {
		return getConstString(offset + 49, $rcv_rmrks);
	}

	/**
	 *  入金備考.<p>
	 *
	 */
	public void rcv_rmrks(String value) {
		setConstString(offset + 49, $rcv_rmrks, value);
	}


	/**
	 *  予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 50, $sub_char1);
	}

	/**
	 *  予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 50, $sub_char1, value);
	}


	/**
	 *  予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 51, $sub_char2);
	}

	/**
	 *  予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 51, $sub_char2, value);
	}


	/**
	 *  予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 52, $sub_char3);
	}

	/**
	 *  予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 52, $sub_char3, value);
	}


	public String getString(String name) {
		if ($rcv_no.equalsIgnoreCase(name)) {
			return rcv_no();
		}
		if ($rcv_prnt_typ_nm.equalsIgnoreCase(name)) {
			return rcv_prnt_typ_nm();
		}
		if ($rcv_dpt_cd.equalsIgnoreCase(name)) {
			return rcv_dpt_cd();
		}
		if ($rcv_dpt_nm.equalsIgnoreCase(name)) {
			return rcv_dpt_nm();
		}
		if ($rcv_usr_cd.equalsIgnoreCase(name)) {
			return rcv_usr_cd();
		}
		if ($rcv_usr_nm.equalsIgnoreCase(name)) {
			return rcv_usr_nm();
		}
		if ($rcv_mtd_cd.equalsIgnoreCase(name)) {
			return rcv_mtd_cd();
		}
		if ($rcv_mtd_nm.equalsIgnoreCase(name)) {
			return rcv_mtd_nm();
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			return rcst_cd();
		}
		if ($rcst_nm.equalsIgnoreCase(name)) {
			return rcst_nm();
		}
		if ($rcst_alt_nm1.equalsIgnoreCase(name)) {
			return rcst_alt_nm1();
		}
		if ($rcst_alt_nm2.equalsIgnoreCase(name)) {
			return rcst_alt_nm2();
		}
		if ($rcst_alt_nm3.equalsIgnoreCase(name)) {
			return rcst_alt_nm3();
		}
		if ($rcst_alt_nm4.equalsIgnoreCase(name)) {
			return rcst_alt_nm4();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			return bcst_nm();
		}
		if ($bcst_alt_nm1.equalsIgnoreCase(name)) {
			return bcst_alt_nm1();
		}
		if ($bcst_alt_nm2.equalsIgnoreCase(name)) {
			return bcst_alt_nm2();
		}
		if ($bcst_alt_nm3.equalsIgnoreCase(name)) {
			return bcst_alt_nm3();
		}
		if ($bcst_alt_nm4.equalsIgnoreCase(name)) {
			return bcst_alt_nm4();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($bill_dpt_nm.equalsIgnoreCase(name)) {
			return bill_dpt_nm();
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			return bank_ac_cd();
		}
		if ($bank_ac_nm.equalsIgnoreCase(name)) {
			return bank_ac_nm();
		}
		if ($xfr_psn.equalsIgnoreCase(name)) {
			return xfr_psn();
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
		if ($bank_ac_no.equalsIgnoreCase(name)) {
			return bank_ac_no();
		}
		if ($note_no.equalsIgnoreCase(name)) {
			return note_no();
		}
		if ($note_typ.equalsIgnoreCase(name)) {
			return note_typ();
		}
		if ($note_typ_nm.equalsIgnoreCase(name)) {
			return note_typ_nm();
		}
		if ($drawer_nm.equalsIgnoreCase(name)) {
			return drawer_nm();
		}
		if ($endrsr.equalsIgnoreCase(name)) {
			return endrsr();
		}
		if ($accptr.equalsIgnoreCase(name)) {
			return accptr();
		}
		if ($draw_bank_cd.equalsIgnoreCase(name)) {
			return draw_bank_cd();
		}
		if ($draw_bank_nm.equalsIgnoreCase(name)) {
			return draw_bank_nm();
		}
		if ($draw_branch_cd.equalsIgnoreCase(name)) {
			return draw_branch_cd();
		}
		if ($draw_branch_nm.equalsIgnoreCase(name)) {
			return draw_branch_nm();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($s_xrate.equalsIgnoreCase(name)) {
			return s_xrate();
		}
		if ($s_rcv_amt.equalsIgnoreCase(name)) {
			return s_rcv_amt();
		}
		if ($rcv_rmrks.equalsIgnoreCase(name)) {
			return rcv_rmrks();
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
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			return rcv_amt();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($rcv_dt.equalsIgnoreCase(name)) {
			return rcv_dt();
		}
		if ($prnt_tm.equalsIgnoreCase(name)) {
			return prnt_tm();
		}
		if ($due_dt.equalsIgnoreCase(name)) {
			return due_dt();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($rcv_no.equalsIgnoreCase(name)) {
			return rcv_no();
		}
		if ($rcv_prnt_typ_nm.equalsIgnoreCase(name)) {
			return rcv_prnt_typ_nm();
		}
		if ($rcv_dpt_cd.equalsIgnoreCase(name)) {
			return rcv_dpt_cd();
		}
		if ($rcv_dpt_nm.equalsIgnoreCase(name)) {
			return rcv_dpt_nm();
		}
		if ($rcv_usr_cd.equalsIgnoreCase(name)) {
			return rcv_usr_cd();
		}
		if ($rcv_usr_nm.equalsIgnoreCase(name)) {
			return rcv_usr_nm();
		}
		if ($rcv_mtd_cd.equalsIgnoreCase(name)) {
			return rcv_mtd_cd();
		}
		if ($rcv_mtd_nm.equalsIgnoreCase(name)) {
			return rcv_mtd_nm();
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			return rcst_cd();
		}
		if ($rcst_nm.equalsIgnoreCase(name)) {
			return rcst_nm();
		}
		if ($rcst_alt_nm1.equalsIgnoreCase(name)) {
			return rcst_alt_nm1();
		}
		if ($rcst_alt_nm2.equalsIgnoreCase(name)) {
			return rcst_alt_nm2();
		}
		if ($rcst_alt_nm3.equalsIgnoreCase(name)) {
			return rcst_alt_nm3();
		}
		if ($rcst_alt_nm4.equalsIgnoreCase(name)) {
			return rcst_alt_nm4();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			return bcst_nm();
		}
		if ($bcst_alt_nm1.equalsIgnoreCase(name)) {
			return bcst_alt_nm1();
		}
		if ($bcst_alt_nm2.equalsIgnoreCase(name)) {
			return bcst_alt_nm2();
		}
		if ($bcst_alt_nm3.equalsIgnoreCase(name)) {
			return bcst_alt_nm3();
		}
		if ($bcst_alt_nm4.equalsIgnoreCase(name)) {
			return bcst_alt_nm4();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($bill_dpt_nm.equalsIgnoreCase(name)) {
			return bill_dpt_nm();
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			return bank_ac_cd();
		}
		if ($bank_ac_nm.equalsIgnoreCase(name)) {
			return bank_ac_nm();
		}
		if ($xfr_psn.equalsIgnoreCase(name)) {
			return xfr_psn();
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
		if ($bank_ac_no.equalsIgnoreCase(name)) {
			return bank_ac_no();
		}
		if ($note_no.equalsIgnoreCase(name)) {
			return note_no();
		}
		if ($note_typ.equalsIgnoreCase(name)) {
			return note_typ();
		}
		if ($note_typ_nm.equalsIgnoreCase(name)) {
			return note_typ_nm();
		}
		if ($drawer_nm.equalsIgnoreCase(name)) {
			return drawer_nm();
		}
		if ($endrsr.equalsIgnoreCase(name)) {
			return endrsr();
		}
		if ($accptr.equalsIgnoreCase(name)) {
			return accptr();
		}
		if ($draw_bank_cd.equalsIgnoreCase(name)) {
			return draw_bank_cd();
		}
		if ($draw_bank_nm.equalsIgnoreCase(name)) {
			return draw_bank_nm();
		}
		if ($draw_branch_cd.equalsIgnoreCase(name)) {
			return draw_branch_cd();
		}
		if ($draw_branch_nm.equalsIgnoreCase(name)) {
			return draw_branch_nm();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($s_xrate.equalsIgnoreCase(name)) {
			return s_xrate();
		}
		if ($s_rcv_amt.equalsIgnoreCase(name)) {
			return s_rcv_amt();
		}
		if ($rcv_rmrks.equalsIgnoreCase(name)) {
			return rcv_rmrks();
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
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			return rcv_amt();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($rcv_dt.equalsIgnoreCase(name)) {
			return rcv_dt();
		}
		if ($prnt_tm.equalsIgnoreCase(name)) {
			return prnt_tm();
		}
		if ($due_dt.equalsIgnoreCase(name)) {
			return due_dt();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($rcv_no.equalsIgnoreCase(name)) {
			rcv_no(value);
			return;
		}
		if ($rcv_prnt_typ_nm.equalsIgnoreCase(name)) {
			rcv_prnt_typ_nm(value);
			return;
		}
		if ($rcv_dpt_cd.equalsIgnoreCase(name)) {
			rcv_dpt_cd(value);
			return;
		}
		if ($rcv_dpt_nm.equalsIgnoreCase(name)) {
			rcv_dpt_nm(value);
			return;
		}
		if ($rcv_usr_cd.equalsIgnoreCase(name)) {
			rcv_usr_cd(value);
			return;
		}
		if ($rcv_usr_nm.equalsIgnoreCase(name)) {
			rcv_usr_nm(value);
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
		if ($rcst_cd.equalsIgnoreCase(name)) {
			rcst_cd(value);
			return;
		}
		if ($rcst_nm.equalsIgnoreCase(name)) {
			rcst_nm(value);
			return;
		}
		if ($rcst_alt_nm1.equalsIgnoreCase(name)) {
			rcst_alt_nm1(value);
			return;
		}
		if ($rcst_alt_nm2.equalsIgnoreCase(name)) {
			rcst_alt_nm2(value);
			return;
		}
		if ($rcst_alt_nm3.equalsIgnoreCase(name)) {
			rcst_alt_nm3(value);
			return;
		}
		if ($rcst_alt_nm4.equalsIgnoreCase(name)) {
			rcst_alt_nm4(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			bcst_nm(value);
			return;
		}
		if ($bcst_alt_nm1.equalsIgnoreCase(name)) {
			bcst_alt_nm1(value);
			return;
		}
		if ($bcst_alt_nm2.equalsIgnoreCase(name)) {
			bcst_alt_nm2(value);
			return;
		}
		if ($bcst_alt_nm3.equalsIgnoreCase(name)) {
			bcst_alt_nm3(value);
			return;
		}
		if ($bcst_alt_nm4.equalsIgnoreCase(name)) {
			bcst_alt_nm4(value);
			return;
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		if ($bill_dpt_nm.equalsIgnoreCase(name)) {
			bill_dpt_nm(value);
			return;
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			bank_ac_cd(value);
			return;
		}
		if ($bank_ac_nm.equalsIgnoreCase(name)) {
			bank_ac_nm(value);
			return;
		}
		if ($xfr_psn.equalsIgnoreCase(name)) {
			xfr_psn(value);
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
		if ($bank_ac_no.equalsIgnoreCase(name)) {
			bank_ac_no(value);
			return;
		}
		if ($note_no.equalsIgnoreCase(name)) {
			note_no(value);
			return;
		}
		if ($note_typ.equalsIgnoreCase(name)) {
			note_typ(value);
			return;
		}
		if ($note_typ_nm.equalsIgnoreCase(name)) {
			note_typ_nm(value);
			return;
		}
		if ($drawer_nm.equalsIgnoreCase(name)) {
			drawer_nm(value);
			return;
		}
		if ($endrsr.equalsIgnoreCase(name)) {
			endrsr(value);
			return;
		}
		if ($accptr.equalsIgnoreCase(name)) {
			accptr(value);
			return;
		}
		if ($draw_bank_cd.equalsIgnoreCase(name)) {
			draw_bank_cd(value);
			return;
		}
		if ($draw_bank_nm.equalsIgnoreCase(name)) {
			draw_bank_nm(value);
			return;
		}
		if ($draw_branch_cd.equalsIgnoreCase(name)) {
			draw_branch_cd(value);
			return;
		}
		if ($draw_branch_nm.equalsIgnoreCase(name)) {
			draw_branch_nm(value);
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
		if ($s_xrate.equalsIgnoreCase(name)) {
			s_xrate(value);
			return;
		}
		if ($s_rcv_amt.equalsIgnoreCase(name)) {
			s_rcv_amt(value);
			return;
		}
		if ($rcv_rmrks.equalsIgnoreCase(name)) {
			rcv_rmrks(value);
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
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($rcv_dt.equalsIgnoreCase(name)) {
			rcv_dt(value);
			return;
		}
		if ($prnt_tm.equalsIgnoreCase(name)) {
			prnt_tm(value);
			return;
		}
		if ($due_dt.equalsIgnoreCase(name)) {
			due_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($rcv_no.equalsIgnoreCase(name)) {
			rcv_no(value);
			return;
		}
		if ($rcv_prnt_typ_nm.equalsIgnoreCase(name)) {
			rcv_prnt_typ_nm(value);
			return;
		}
		if ($rcv_dpt_cd.equalsIgnoreCase(name)) {
			rcv_dpt_cd(value);
			return;
		}
		if ($rcv_dpt_nm.equalsIgnoreCase(name)) {
			rcv_dpt_nm(value);
			return;
		}
		if ($rcv_usr_cd.equalsIgnoreCase(name)) {
			rcv_usr_cd(value);
			return;
		}
		if ($rcv_usr_nm.equalsIgnoreCase(name)) {
			rcv_usr_nm(value);
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
		if ($rcst_cd.equalsIgnoreCase(name)) {
			rcst_cd(value);
			return;
		}
		if ($rcst_nm.equalsIgnoreCase(name)) {
			rcst_nm(value);
			return;
		}
		if ($rcst_alt_nm1.equalsIgnoreCase(name)) {
			rcst_alt_nm1(value);
			return;
		}
		if ($rcst_alt_nm2.equalsIgnoreCase(name)) {
			rcst_alt_nm2(value);
			return;
		}
		if ($rcst_alt_nm3.equalsIgnoreCase(name)) {
			rcst_alt_nm3(value);
			return;
		}
		if ($rcst_alt_nm4.equalsIgnoreCase(name)) {
			rcst_alt_nm4(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			bcst_nm(value);
			return;
		}
		if ($bcst_alt_nm1.equalsIgnoreCase(name)) {
			bcst_alt_nm1(value);
			return;
		}
		if ($bcst_alt_nm2.equalsIgnoreCase(name)) {
			bcst_alt_nm2(value);
			return;
		}
		if ($bcst_alt_nm3.equalsIgnoreCase(name)) {
			bcst_alt_nm3(value);
			return;
		}
		if ($bcst_alt_nm4.equalsIgnoreCase(name)) {
			bcst_alt_nm4(value);
			return;
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		if ($bill_dpt_nm.equalsIgnoreCase(name)) {
			bill_dpt_nm(value);
			return;
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			bank_ac_cd(value);
			return;
		}
		if ($bank_ac_nm.equalsIgnoreCase(name)) {
			bank_ac_nm(value);
			return;
		}
		if ($xfr_psn.equalsIgnoreCase(name)) {
			xfr_psn(value);
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
		if ($bank_ac_no.equalsIgnoreCase(name)) {
			bank_ac_no(value);
			return;
		}
		if ($note_no.equalsIgnoreCase(name)) {
			note_no(value);
			return;
		}
		if ($note_typ.equalsIgnoreCase(name)) {
			note_typ(value);
			return;
		}
		if ($note_typ_nm.equalsIgnoreCase(name)) {
			note_typ_nm(value);
			return;
		}
		if ($drawer_nm.equalsIgnoreCase(name)) {
			drawer_nm(value);
			return;
		}
		if ($endrsr.equalsIgnoreCase(name)) {
			endrsr(value);
			return;
		}
		if ($accptr.equalsIgnoreCase(name)) {
			accptr(value);
			return;
		}
		if ($draw_bank_cd.equalsIgnoreCase(name)) {
			draw_bank_cd(value);
			return;
		}
		if ($draw_bank_nm.equalsIgnoreCase(name)) {
			draw_bank_nm(value);
			return;
		}
		if ($draw_branch_cd.equalsIgnoreCase(name)) {
			draw_branch_cd(value);
			return;
		}
		if ($draw_branch_nm.equalsIgnoreCase(name)) {
			draw_branch_nm(value);
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
		if ($s_xrate.equalsIgnoreCase(name)) {
			s_xrate(value);
			return;
		}
		if ($s_rcv_amt.equalsIgnoreCase(name)) {
			s_rcv_amt(value);
			return;
		}
		if ($rcv_rmrks.equalsIgnoreCase(name)) {
			rcv_rmrks(value);
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
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($rcv_dt.equalsIgnoreCase(name)) {
			rcv_dt(value);
			return;
		}
		if ($prnt_tm.equalsIgnoreCase(name)) {
			prnt_tm(value);
			return;
		}
		if ($due_dt.equalsIgnoreCase(name)) {
			due_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

