package mcframe.commonMSBG.MSBGR0030;

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
 * ブロック"ArSlipHdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ArSlipHdrR_MC_A extends MCConstRow {

	/**
	 *  入金実績ＮＯ.<p>
	 *
	 */
	public static final String $rcv_act_no = "rcv_act_no";
	/**
	 *  入金実績連番.<p>
	 *
	 */
	public static final String $rcv_act_seq = "rcv_act_seq";
	/**
	 *  入金実績改訂番号.<p>
	 *
	 */
	public static final String $rcv_act_rev = "rcv_act_rev";
	/**
	 *  伝票状況区分.<p>
	 *
	 */
	public static final String $slip_sts_typ = "slip_sts_typ";
	/**
	 *  伝票状況区分名.<p>
	 *
	 */
	public static final String $slip_sts_typ_nm = "slip_sts_typ_nm";
	/**
	 *  部門ＣＤ.<p>
	 *
	 */
	public static final String $dpt_cd = "dpt_cd";
	/**
	 *  部門名.<p>
	 *
	 */
	public static final String $dpt_nm = "dpt_nm";
	/**
	 *  担当者ＣＤ.<p>
	 *
	 */
	public static final String $usr_cd = "usr_cd";
	/**
	 *  担当者名.<p>
	 *
	 */
	public static final String $usr_nm = "usr_nm";
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
	 *  相殺方法ＣＤ.<p>
	 *
	 */
	public static final String $ar_setoff_cd = "ar_setoff_cd";
	/**
	 *  相殺方法名.<p>
	 *
	 */
	public static final String $ar_setoff_nm = "ar_setoff_nm";
	/**
	 *  税率.<p>
	 *
	 */
	public static final String $tax_rate = "tax_rate";
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
	 *  為替レート文字列.<p>
	 *
	 */
	public static final String $s_xrate = "s_xrate";
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
	 *  入金ＮＯ.<p>
	 *
	 */
	public static final String $rcv_no = "rcv_no";
	/**
	 *  前受対応入金ＮＯ.<p>
	 *
	 */
	public static final String $adv_gen_rcv_no = "adv_gen_rcv_no";
	/**
	 *  未処理残高.<p>
	 *
	 */
	public static final String $not_proc_bal = "not_proc_bal";
	/**
	 *  未処理残高文字列.<p>
	 *
	 */
	public static final String $s_not_proc_bal = "s_not_proc_bal";
	/**
	 *  取引ＣＤ.<p>
	 *
	 */
	public static final String $trd_cd = "trd_cd";
	/**
	 *  取引名.<p>
	 *
	 */
	public static final String $report_title = "report_title";
	/**
	 *  発行日時.<p>
	 *
	 */
	public static final String $prnt_tm = "prnt_tm";
	/**
	 *  計上日.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	/**
	 *  入金額合計.<p>
	 *
	 */
	public static final String $subttl1 = "subttl1";
	/**
	 *  入金額合計文字列.<p>
	 *
	 */
	public static final String $s_subttl1 = "s_subttl1";
	/**
	 *  相殺額合計.<p>
	 *
	 */
	public static final String $subttl2 = "subttl2";
	/**
	 *  相殺額合計文字列.<p>
	 *
	 */
	public static final String $s_subttl2 = "s_subttl2";
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
	 *  手形区分.<p>
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
	 *  取引備考.<p>
	 *
	 */
	public static final String $trd_rmrks = "trd_rmrks";
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


	public static final MCMeta rcv_act_no_META = createCommonMeta($rcv_act_no, mcframe.commonMA.meta.MA_META.RCV_ACT_NO);
	public static final MCMeta rcv_act_seq_META = createCommonMeta($rcv_act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta rcv_act_rev_META = createCommonMeta($rcv_act_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta slip_sts_typ_META = createCommonMeta($slip_sts_typ, mcframe.commonMA.meta.MA_META.SLIP_STS_TYP);
	public static final MCMeta slip_sts_typ_nm_META = createCommonMeta($slip_sts_typ_nm, mcframe.commonMA.meta.MA_META.SLIP_STS_TYP_NM);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta dpt_nm_META = createCommonMeta($dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta usr_cd_META = createCommonMeta($usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta usr_nm_META = createCommonMeta($usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta rcv_mtd_cd_META = createCommonMeta($rcv_mtd_cd, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta rcv_mtd_nm_META = createCommonMeta($rcv_mtd_nm, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta rcv_dt_META = createCommonMeta($rcv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ar_setoff_cd_META = createCommonMeta($ar_setoff_cd, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta ar_setoff_nm_META = createCommonMeta($ar_setoff_nm, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta tax_rate_META = createCommonMeta($tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta rcst_cd_META = createCommonMeta($rcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta rcst_nm_META = createCommonMeta($rcst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta rcst_alt_nm1_META = createCommonMeta($rcst_alt_nm1, mcframe.commonMA.meta.MA_META.BP_ALT_NM1);
	public static final MCMeta rcst_alt_nm2_META = createCommonMeta($rcst_alt_nm2, mcframe.commonMA.meta.MA_META.BP_ALT_NM2);
	public static final MCMeta rcst_alt_nm3_META = createCommonMeta($rcst_alt_nm3, mcframe.commonMA.meta.MA_META.BP_ALT_NM3);
	public static final MCMeta rcst_alt_nm4_META = createCommonMeta($rcst_alt_nm4, mcframe.commonMA.meta.MA_META.BP_ALT_NM4);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta xrate_META = createCommonMeta($xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_xrate_META = createStringMeta($s_xrate);
	public static final MCMeta bank_ac_cd_META = createCommonMeta($bank_ac_cd, mcframe.commonMA.meta.MA_META.BANK_AC_CD);
	public static final MCMeta bank_ac_nm_META = createCommonMeta($bank_ac_nm, mcframe.commonMA.meta.MA_META.BANK_AC_NM);
	public static final MCMeta xfr_psn_META = createCommonMeta($xfr_psn, mcframe.commonMA.meta.MA_META.XFR_PSN);
	public static final MCMeta bank_cd_META = createCommonMeta($bank_cd, mcframe.commonMA.meta.MA_META.BANK_CD);
	public static final MCMeta bank_nm_META = createCommonMeta($bank_nm, mcframe.commonMA.meta.MA_META.BANK_NM);
	public static final MCMeta branch_cd_META = createCommonMeta($branch_cd, mcframe.commonMA.meta.MA_META.BANK_BRANCH_CD);
	public static final MCMeta branch_nm_META = createCommonMeta($branch_nm, mcframe.commonMA.meta.MA_META.BANK_BRANCH_NM);
	public static final MCMeta bank_ac_no_META = createCommonMeta($bank_ac_no, mcframe.commonMA.meta.MA_META.BANK_AC_NO);
	public static final MCMeta rcv_no_META = createCommonMeta($rcv_no, mcframe.commonMA.meta.MA_META.RCV_NO);
	public static final MCMeta adv_gen_rcv_no_META = createCommonMeta($adv_gen_rcv_no, mcframe.commonMA.meta.MA_META.RCV_NO);
	public static final MCMeta not_proc_bal_META = createCommonMeta($not_proc_bal, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_not_proc_bal_META = createStringMeta($s_not_proc_bal);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta report_title_META = createStringMeta($report_title);
	public static final MCMeta prnt_tm_META = createCommonMeta($prnt_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta subttl1_META = createCommonMeta($subttl1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_subttl1_META = createStringMeta($s_subttl1);
	public static final MCMeta subttl2_META = createCommonMeta($subttl2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_subttl2_META = createStringMeta($s_subttl2);
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
	public static final MCMeta trd_rmrks_META = createCommonMeta($trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.RCV_ACT_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.RCV_ACT_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.RCV_ACT_SUB_CHAR3);

	protected static final ConstMetaList<ArSlipHdrR> constMetas = new ConstMetaList<ArSlipHdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			rcv_act_no_META,
			rcv_act_seq_META,
			rcv_act_rev_META,
			slip_sts_typ_META,
			slip_sts_typ_nm_META,
			dpt_cd_META,
			dpt_nm_META,
			usr_cd_META,
			usr_nm_META,
			rcv_mtd_cd_META,
			rcv_mtd_nm_META,
			rcv_dt_META,
			ar_setoff_cd_META,
			ar_setoff_nm_META,
			tax_rate_META,
			rcst_cd_META,
			rcst_nm_META,
			rcst_alt_nm1_META,
			rcst_alt_nm2_META,
			rcst_alt_nm3_META,
			rcst_alt_nm4_META,
			trd_cur_cd_META,
			trd_cur_nm_META,
			xrate_META,
			s_xrate_META,
			bank_ac_cd_META,
			bank_ac_nm_META,
			xfr_psn_META,
			bank_cd_META,
			bank_nm_META,
			branch_cd_META,
			branch_nm_META,
			bank_ac_no_META,
			rcv_no_META,
			adv_gen_rcv_no_META,
			not_proc_bal_META,
			s_not_proc_bal_META,
			trd_cd_META,
			report_title_META,
			prnt_tm_META,
			ac_dt_META,
			subttl1_META,
			s_subttl1_META,
			subttl2_META,
			s_subttl2_META,
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
			trd_rmrks_META,
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
	protected ArSlipHdrR_MC_A(ConstMetaList<? extends ArSlipHdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ArSlipHdrR clone() {
		return (ArSlipHdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ArSlipHdrR createInstance() {
		return (ArSlipHdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ArSlipHdrR getValues(String... names) {
		return (ArSlipHdrR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  入金実績ＮＯ.<p>
	 *
	 */
	public String rcv_act_no() {
		return getConstString(offset + 0, $rcv_act_no);
	}

	/**
	 *  入金実績ＮＯ.<p>
	 *
	 */
	public void rcv_act_no(String value) {
		setConstString(offset + 0, $rcv_act_no, value);
	}


	/**
	 *  入金実績連番.<p>
	 *
	 */
	public MCNumber rcv_act_seq() {
		return getConstNumber(offset + 1, $rcv_act_seq);
	}

	/**
	 *  入金実績連番.<p>
	 *
	 */
	public void rcv_act_seq(MCNumber value) {
		setConstNumber(offset + 1, $rcv_act_seq, value);
	}

	/**
	 *  入金実績連番.<p>
	 *
	 */
	public void rcv_act_seq(int value) {
		setConstNumber(offset + 1, $rcv_act_seq, value);
	}

	/**
	 *  入金実績連番.<p>
	 *
	 */
	public void rcv_act_seq(long value) {
		setConstNumber(offset + 1, $rcv_act_seq, value);
	}

	/**
	 *  入金実績連番.<p>
	 *
	 */
	public void rcv_act_seq(float value) {
		setConstNumber(offset + 1, $rcv_act_seq, value);
	}

	/**
	 *  入金実績連番.<p>
	 *
	 */
	public void rcv_act_seq(double value) {
		setConstNumber(offset + 1, $rcv_act_seq, value);
	}


	/**
	 *  入金実績改訂番号.<p>
	 *
	 */
	public MCNumber rcv_act_rev() {
		return getConstNumber(offset + 2, $rcv_act_rev);
	}

	/**
	 *  入金実績改訂番号.<p>
	 *
	 */
	public void rcv_act_rev(MCNumber value) {
		setConstNumber(offset + 2, $rcv_act_rev, value);
	}

	/**
	 *  入金実績改訂番号.<p>
	 *
	 */
	public void rcv_act_rev(int value) {
		setConstNumber(offset + 2, $rcv_act_rev, value);
	}

	/**
	 *  入金実績改訂番号.<p>
	 *
	 */
	public void rcv_act_rev(long value) {
		setConstNumber(offset + 2, $rcv_act_rev, value);
	}

	/**
	 *  入金実績改訂番号.<p>
	 *
	 */
	public void rcv_act_rev(float value) {
		setConstNumber(offset + 2, $rcv_act_rev, value);
	}

	/**
	 *  入金実績改訂番号.<p>
	 *
	 */
	public void rcv_act_rev(double value) {
		setConstNumber(offset + 2, $rcv_act_rev, value);
	}


	/**
	 *  伝票状況区分.<p>
	 *
	 */
	public String slip_sts_typ() {
		return getConstString(offset + 3, $slip_sts_typ);
	}

	/**
	 *  伝票状況区分.<p>
	 *
	 */
	public void slip_sts_typ(String value) {
		setConstString(offset + 3, $slip_sts_typ, value);
	}


	/**
	 *  伝票状況区分名.<p>
	 *
	 */
	public String slip_sts_typ_nm() {
		return getConstString(offset + 4, $slip_sts_typ_nm);
	}

	/**
	 *  伝票状況区分名.<p>
	 *
	 */
	public void slip_sts_typ_nm(String value) {
		setConstString(offset + 4, $slip_sts_typ_nm, value);
	}


	/**
	 *  部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 5, $dpt_cd);
	}

	/**
	 *  部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 5, $dpt_cd, value);
	}


	/**
	 *  部門名.<p>
	 *
	 */
	public String dpt_nm() {
		return getConstString(offset + 6, $dpt_nm);
	}

	/**
	 *  部門名.<p>
	 *
	 */
	public void dpt_nm(String value) {
		setConstString(offset + 6, $dpt_nm, value);
	}


	/**
	 *  担当者ＣＤ.<p>
	 *
	 */
	public String usr_cd() {
		return getConstString(offset + 7, $usr_cd);
	}

	/**
	 *  担当者ＣＤ.<p>
	 *
	 */
	public void usr_cd(String value) {
		setConstString(offset + 7, $usr_cd, value);
	}


	/**
	 *  担当者名.<p>
	 *
	 */
	public String usr_nm() {
		return getConstString(offset + 8, $usr_nm);
	}

	/**
	 *  担当者名.<p>
	 *
	 */
	public void usr_nm(String value) {
		setConstString(offset + 8, $usr_nm, value);
	}


	/**
	 *  入金方法ＣＤ.<p>
	 *
	 */
	public String rcv_mtd_cd() {
		return getConstString(offset + 9, $rcv_mtd_cd);
	}

	/**
	 *  入金方法ＣＤ.<p>
	 *
	 */
	public void rcv_mtd_cd(String value) {
		setConstString(offset + 9, $rcv_mtd_cd, value);
	}


	/**
	 *  入金方法名.<p>
	 *
	 */
	public String rcv_mtd_nm() {
		return getConstString(offset + 10, $rcv_mtd_nm);
	}

	/**
	 *  入金方法名.<p>
	 *
	 */
	public void rcv_mtd_nm(String value) {
		setConstString(offset + 10, $rcv_mtd_nm, value);
	}


	/**
	 *  入金日.<p>
	 *
	 */
	public MCDate rcv_dt() {
		return getConstDate(offset + 11, $rcv_dt);
	}

	/**
	 *  入金日.<p>
	 *
	 */
	public void rcv_dt(MCDate value) {
		setConstDate(offset + 11, $rcv_dt, value);
	}


	/**
	 *  相殺方法ＣＤ.<p>
	 *
	 */
	public String ar_setoff_cd() {
		return getConstString(offset + 12, $ar_setoff_cd);
	}

	/**
	 *  相殺方法ＣＤ.<p>
	 *
	 */
	public void ar_setoff_cd(String value) {
		setConstString(offset + 12, $ar_setoff_cd, value);
	}


	/**
	 *  相殺方法名.<p>
	 *
	 */
	public String ar_setoff_nm() {
		return getConstString(offset + 13, $ar_setoff_nm);
	}

	/**
	 *  相殺方法名.<p>
	 *
	 */
	public void ar_setoff_nm(String value) {
		setConstString(offset + 13, $ar_setoff_nm, value);
	}


	/**
	 *  税率.<p>
	 *
	 */
	public MCNumber tax_rate() {
		return getConstNumber(offset + 14, $tax_rate);
	}

	/**
	 *  税率.<p>
	 *
	 */
	public void tax_rate(MCNumber value) {
		setConstNumber(offset + 14, $tax_rate, value);
	}

	/**
	 *  税率.<p>
	 *
	 */
	public void tax_rate(int value) {
		setConstNumber(offset + 14, $tax_rate, value);
	}

	/**
	 *  税率.<p>
	 *
	 */
	public void tax_rate(long value) {
		setConstNumber(offset + 14, $tax_rate, value);
	}

	/**
	 *  税率.<p>
	 *
	 */
	public void tax_rate(float value) {
		setConstNumber(offset + 14, $tax_rate, value);
	}

	/**
	 *  税率.<p>
	 *
	 */
	public void tax_rate(double value) {
		setConstNumber(offset + 14, $tax_rate, value);
	}


	/**
	 *  入金先ＣＤ.<p>
	 *
	 */
	public String rcst_cd() {
		return getConstString(offset + 15, $rcst_cd);
	}

	/**
	 *  入金先ＣＤ.<p>
	 *
	 */
	public void rcst_cd(String value) {
		setConstString(offset + 15, $rcst_cd, value);
	}


	/**
	 *  入金先名.<p>
	 *
	 */
	public String rcst_nm() {
		return getConstString(offset + 16, $rcst_nm);
	}

	/**
	 *  入金先名.<p>
	 *
	 */
	public void rcst_nm(String value) {
		setConstString(offset + 16, $rcst_nm, value);
	}


	/**
	 *  入金先別名１.<p>
	 *
	 */
	public String rcst_alt_nm1() {
		return getConstString(offset + 17, $rcst_alt_nm1);
	}

	/**
	 *  入金先別名１.<p>
	 *
	 */
	public void rcst_alt_nm1(String value) {
		setConstString(offset + 17, $rcst_alt_nm1, value);
	}


	/**
	 *  入金先別名２.<p>
	 *
	 */
	public String rcst_alt_nm2() {
		return getConstString(offset + 18, $rcst_alt_nm2);
	}

	/**
	 *  入金先別名２.<p>
	 *
	 */
	public void rcst_alt_nm2(String value) {
		setConstString(offset + 18, $rcst_alt_nm2, value);
	}


	/**
	 *  入金先別名３.<p>
	 *
	 */
	public String rcst_alt_nm3() {
		return getConstString(offset + 19, $rcst_alt_nm3);
	}

	/**
	 *  入金先別名３.<p>
	 *
	 */
	public void rcst_alt_nm3(String value) {
		setConstString(offset + 19, $rcst_alt_nm3, value);
	}


	/**
	 *  入金先別名４.<p>
	 *
	 */
	public String rcst_alt_nm4() {
		return getConstString(offset + 20, $rcst_alt_nm4);
	}

	/**
	 *  入金先別名４.<p>
	 *
	 */
	public void rcst_alt_nm4(String value) {
		setConstString(offset + 20, $rcst_alt_nm4, value);
	}


	/**
	 *  取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 21, $trd_cur_cd);
	}

	/**
	 *  取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 21, $trd_cur_cd, value);
	}


	/**
	 *  取引通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 22, $trd_cur_nm);
	}

	/**
	 *  取引通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 22, $trd_cur_nm, value);
	}


	/**
	 *  為替レート.<p>
	 *
	 */
	public MCNumber xrate() {
		return getConstNumber(offset + 23, $xrate);
	}

	/**
	 *  為替レート.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		setConstNumber(offset + 23, $xrate, value);
	}

	/**
	 *  為替レート.<p>
	 *
	 */
	public void xrate(int value) {
		setConstNumber(offset + 23, $xrate, value);
	}

	/**
	 *  為替レート.<p>
	 *
	 */
	public void xrate(long value) {
		setConstNumber(offset + 23, $xrate, value);
	}

	/**
	 *  為替レート.<p>
	 *
	 */
	public void xrate(float value) {
		setConstNumber(offset + 23, $xrate, value);
	}

	/**
	 *  為替レート.<p>
	 *
	 */
	public void xrate(double value) {
		setConstNumber(offset + 23, $xrate, value);
	}


	/**
	 *  為替レート文字列.<p>
	 *
	 */
	public String s_xrate() {
		return getConstString(offset + 24, $s_xrate);
	}

	/**
	 *  為替レート文字列.<p>
	 *
	 */
	public void s_xrate(String value) {
		setConstString(offset + 24, $s_xrate, value);
	}


	/**
	 *  口座ＣＤ.<p>
	 *
	 */
	public String bank_ac_cd() {
		return getConstString(offset + 25, $bank_ac_cd);
	}

	/**
	 *  口座ＣＤ.<p>
	 *
	 */
	public void bank_ac_cd(String value) {
		setConstString(offset + 25, $bank_ac_cd, value);
	}


	/**
	 *  口座名.<p>
	 *
	 */
	public String bank_ac_nm() {
		return getConstString(offset + 26, $bank_ac_nm);
	}

	/**
	 *  口座名.<p>
	 *
	 */
	public void bank_ac_nm(String value) {
		setConstString(offset + 26, $bank_ac_nm, value);
	}


	/**
	 *  振込人名.<p>
	 *
	 */
	public String xfr_psn() {
		return getConstString(offset + 27, $xfr_psn);
	}

	/**
	 *  振込人名.<p>
	 *
	 */
	public void xfr_psn(String value) {
		setConstString(offset + 27, $xfr_psn, value);
	}


	/**
	 *  銀行ＣＤ.<p>
	 *
	 */
	public String bank_cd() {
		return getConstString(offset + 28, $bank_cd);
	}

	/**
	 *  銀行ＣＤ.<p>
	 *
	 */
	public void bank_cd(String value) {
		setConstString(offset + 28, $bank_cd, value);
	}


	/**
	 *  銀行名.<p>
	 *
	 */
	public String bank_nm() {
		return getConstString(offset + 29, $bank_nm);
	}

	/**
	 *  銀行名.<p>
	 *
	 */
	public void bank_nm(String value) {
		setConstString(offset + 29, $bank_nm, value);
	}


	/**
	 *  支店ＣＤ.<p>
	 *
	 */
	public String branch_cd() {
		return getConstString(offset + 30, $branch_cd);
	}

	/**
	 *  支店ＣＤ.<p>
	 *
	 */
	public void branch_cd(String value) {
		setConstString(offset + 30, $branch_cd, value);
	}


	/**
	 *  支店名.<p>
	 *
	 */
	public String branch_nm() {
		return getConstString(offset + 31, $branch_nm);
	}

	/**
	 *  支店名.<p>
	 *
	 */
	public void branch_nm(String value) {
		setConstString(offset + 31, $branch_nm, value);
	}


	/**
	 *  口座番号.<p>
	 *
	 */
	public String bank_ac_no() {
		return getConstString(offset + 32, $bank_ac_no);
	}

	/**
	 *  口座番号.<p>
	 *
	 */
	public void bank_ac_no(String value) {
		setConstString(offset + 32, $bank_ac_no, value);
	}


	/**
	 *  入金ＮＯ.<p>
	 *
	 */
	public String rcv_no() {
		return getConstString(offset + 33, $rcv_no);
	}

	/**
	 *  入金ＮＯ.<p>
	 *
	 */
	public void rcv_no(String value) {
		setConstString(offset + 33, $rcv_no, value);
	}


	/**
	 *  前受対応入金ＮＯ.<p>
	 *
	 */
	public String adv_gen_rcv_no() {
		return getConstString(offset + 34, $adv_gen_rcv_no);
	}

	/**
	 *  前受対応入金ＮＯ.<p>
	 *
	 */
	public void adv_gen_rcv_no(String value) {
		setConstString(offset + 34, $adv_gen_rcv_no, value);
	}


	/**
	 *  未処理残高.<p>
	 *
	 */
	public MCNumber not_proc_bal() {
		return getConstNumber(offset + 35, $not_proc_bal);
	}

	/**
	 *  未処理残高.<p>
	 *
	 */
	public void not_proc_bal(MCNumber value) {
		setConstNumber(offset + 35, $not_proc_bal, value);
	}

	/**
	 *  未処理残高.<p>
	 *
	 */
	public void not_proc_bal(int value) {
		setConstNumber(offset + 35, $not_proc_bal, value);
	}

	/**
	 *  未処理残高.<p>
	 *
	 */
	public void not_proc_bal(long value) {
		setConstNumber(offset + 35, $not_proc_bal, value);
	}

	/**
	 *  未処理残高.<p>
	 *
	 */
	public void not_proc_bal(float value) {
		setConstNumber(offset + 35, $not_proc_bal, value);
	}

	/**
	 *  未処理残高.<p>
	 *
	 */
	public void not_proc_bal(double value) {
		setConstNumber(offset + 35, $not_proc_bal, value);
	}


	/**
	 *  未処理残高文字列.<p>
	 *
	 */
	public String s_not_proc_bal() {
		return getConstString(offset + 36, $s_not_proc_bal);
	}

	/**
	 *  未処理残高文字列.<p>
	 *
	 */
	public void s_not_proc_bal(String value) {
		setConstString(offset + 36, $s_not_proc_bal, value);
	}


	/**
	 *  取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 37, $trd_cd);
	}

	/**
	 *  取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 37, $trd_cd, value);
	}


	/**
	 *  取引名.<p>
	 *
	 */
	public String report_title() {
		return getConstString(offset + 38, $report_title);
	}

	/**
	 *  取引名.<p>
	 *
	 */
	public void report_title(String value) {
		setConstString(offset + 38, $report_title, value);
	}


	/**
	 *  発行日時.<p>
	 *
	 */
	public MCDate prnt_tm() {
		return getConstDate(offset + 39, $prnt_tm);
	}

	/**
	 *  発行日時.<p>
	 *
	 */
	public void prnt_tm(MCDate value) {
		setConstDate(offset + 39, $prnt_tm, value);
	}


	/**
	 *  計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 40, $ac_dt);
	}

	/**
	 *  計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 40, $ac_dt, value);
	}


	/**
	 *  入金額合計.<p>
	 *
	 */
	public MCNumber subttl1() {
		return getConstNumber(offset + 41, $subttl1);
	}

	/**
	 *  入金額合計.<p>
	 *
	 */
	public void subttl1(MCNumber value) {
		setConstNumber(offset + 41, $subttl1, value);
	}

	/**
	 *  入金額合計.<p>
	 *
	 */
	public void subttl1(int value) {
		setConstNumber(offset + 41, $subttl1, value);
	}

	/**
	 *  入金額合計.<p>
	 *
	 */
	public void subttl1(long value) {
		setConstNumber(offset + 41, $subttl1, value);
	}

	/**
	 *  入金額合計.<p>
	 *
	 */
	public void subttl1(float value) {
		setConstNumber(offset + 41, $subttl1, value);
	}

	/**
	 *  入金額合計.<p>
	 *
	 */
	public void subttl1(double value) {
		setConstNumber(offset + 41, $subttl1, value);
	}


	/**
	 *  入金額合計文字列.<p>
	 *
	 */
	public String s_subttl1() {
		return getConstString(offset + 42, $s_subttl1);
	}

	/**
	 *  入金額合計文字列.<p>
	 *
	 */
	public void s_subttl1(String value) {
		setConstString(offset + 42, $s_subttl1, value);
	}


	/**
	 *  相殺額合計.<p>
	 *
	 */
	public MCNumber subttl2() {
		return getConstNumber(offset + 43, $subttl2);
	}

	/**
	 *  相殺額合計.<p>
	 *
	 */
	public void subttl2(MCNumber value) {
		setConstNumber(offset + 43, $subttl2, value);
	}

	/**
	 *  相殺額合計.<p>
	 *
	 */
	public void subttl2(int value) {
		setConstNumber(offset + 43, $subttl2, value);
	}

	/**
	 *  相殺額合計.<p>
	 *
	 */
	public void subttl2(long value) {
		setConstNumber(offset + 43, $subttl2, value);
	}

	/**
	 *  相殺額合計.<p>
	 *
	 */
	public void subttl2(float value) {
		setConstNumber(offset + 43, $subttl2, value);
	}

	/**
	 *  相殺額合計.<p>
	 *
	 */
	public void subttl2(double value) {
		setConstNumber(offset + 43, $subttl2, value);
	}


	/**
	 *  相殺額合計文字列.<p>
	 *
	 */
	public String s_subttl2() {
		return getConstString(offset + 44, $s_subttl2);
	}

	/**
	 *  相殺額合計文字列.<p>
	 *
	 */
	public void s_subttl2(String value) {
		setConstString(offset + 44, $s_subttl2, value);
	}


	/**
	 *  手形番号.<p>
	 *
	 */
	public String note_no() {
		return getConstString(offset + 45, $note_no);
	}

	/**
	 *  手形番号.<p>
	 *
	 */
	public void note_no(String value) {
		setConstString(offset + 45, $note_no, value);
	}


	/**
	 *  手形区分.<p>
	 *
	 */
	public String note_typ() {
		return getConstString(offset + 46, $note_typ);
	}

	/**
	 *  手形区分.<p>
	 *
	 */
	public void note_typ(String value) {
		setConstString(offset + 46, $note_typ, value);
	}


	/**
	 *  手形区分.<p>
	 *
	 */
	public String note_typ_nm() {
		return getConstString(offset + 47, $note_typ_nm);
	}

	/**
	 *  手形区分.<p>
	 *
	 */
	public void note_typ_nm(String value) {
		setConstString(offset + 47, $note_typ_nm, value);
	}


	/**
	 *  決済日.<p>
	 *
	 */
	public MCDate due_dt() {
		return getConstDate(offset + 48, $due_dt);
	}

	/**
	 *  決済日.<p>
	 *
	 */
	public void due_dt(MCDate value) {
		setConstDate(offset + 48, $due_dt, value);
	}


	/**
	 *  振出人名.<p>
	 *
	 */
	public String drawer_nm() {
		return getConstString(offset + 49, $drawer_nm);
	}

	/**
	 *  振出人名.<p>
	 *
	 */
	public void drawer_nm(String value) {
		setConstString(offset + 49, $drawer_nm, value);
	}


	/**
	 *  裏書人.<p>
	 *
	 */
	public String endrsr() {
		return getConstString(offset + 50, $endrsr);
	}

	/**
	 *  裏書人.<p>
	 *
	 */
	public void endrsr(String value) {
		setConstString(offset + 50, $endrsr, value);
	}


	/**
	 *  引受人.<p>
	 *
	 */
	public String accptr() {
		return getConstString(offset + 51, $accptr);
	}

	/**
	 *  引受人.<p>
	 *
	 */
	public void accptr(String value) {
		setConstString(offset + 51, $accptr, value);
	}


	/**
	 *  振出銀行ＣＤ.<p>
	 *
	 */
	public String draw_bank_cd() {
		return getConstString(offset + 52, $draw_bank_cd);
	}

	/**
	 *  振出銀行ＣＤ.<p>
	 *
	 */
	public void draw_bank_cd(String value) {
		setConstString(offset + 52, $draw_bank_cd, value);
	}


	/**
	 *  振出銀行名.<p>
	 *
	 */
	public String draw_bank_nm() {
		return getConstString(offset + 53, $draw_bank_nm);
	}

	/**
	 *  振出銀行名.<p>
	 *
	 */
	public void draw_bank_nm(String value) {
		setConstString(offset + 53, $draw_bank_nm, value);
	}


	/**
	 *  振出支店ＣＤ.<p>
	 *
	 */
	public String draw_branch_cd() {
		return getConstString(offset + 54, $draw_branch_cd);
	}

	/**
	 *  振出支店ＣＤ.<p>
	 *
	 */
	public void draw_branch_cd(String value) {
		setConstString(offset + 54, $draw_branch_cd, value);
	}


	/**
	 *  振出支店名.<p>
	 *
	 */
	public String draw_branch_nm() {
		return getConstString(offset + 55, $draw_branch_nm);
	}

	/**
	 *  振出支店名.<p>
	 *
	 */
	public void draw_branch_nm(String value) {
		setConstString(offset + 55, $draw_branch_nm, value);
	}


	/**
	 *  取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return getConstString(offset + 56, $trd_rmrks);
	}

	/**
	 *  取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		setConstString(offset + 56, $trd_rmrks, value);
	}


	/**
	 *  予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 57, $sub_char1);
	}

	/**
	 *  予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 57, $sub_char1, value);
	}


	/**
	 *  予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 58, $sub_char2);
	}

	/**
	 *  予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 58, $sub_char2, value);
	}


	/**
	 *  予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 59, $sub_char3);
	}

	/**
	 *  予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 59, $sub_char3, value);
	}


	public String getString(String name) {
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			return rcv_act_no();
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			return slip_sts_typ();
		}
		if ($slip_sts_typ_nm.equalsIgnoreCase(name)) {
			return slip_sts_typ_nm();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			return usr_nm();
		}
		if ($rcv_mtd_cd.equalsIgnoreCase(name)) {
			return rcv_mtd_cd();
		}
		if ($rcv_mtd_nm.equalsIgnoreCase(name)) {
			return rcv_mtd_nm();
		}
		if ($ar_setoff_cd.equalsIgnoreCase(name)) {
			return ar_setoff_cd();
		}
		if ($ar_setoff_nm.equalsIgnoreCase(name)) {
			return ar_setoff_nm();
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
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($s_xrate.equalsIgnoreCase(name)) {
			return s_xrate();
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
		if ($rcv_no.equalsIgnoreCase(name)) {
			return rcv_no();
		}
		if ($adv_gen_rcv_no.equalsIgnoreCase(name)) {
			return adv_gen_rcv_no();
		}
		if ($s_not_proc_bal.equalsIgnoreCase(name)) {
			return s_not_proc_bal();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($report_title.equalsIgnoreCase(name)) {
			return report_title();
		}
		if ($s_subttl1.equalsIgnoreCase(name)) {
			return s_subttl1();
		}
		if ($s_subttl2.equalsIgnoreCase(name)) {
			return s_subttl2();
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
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
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
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			return rcv_act_seq();
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			return rcv_act_rev();
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($not_proc_bal.equalsIgnoreCase(name)) {
			return not_proc_bal();
		}
		if ($subttl1.equalsIgnoreCase(name)) {
			return subttl1();
		}
		if ($subttl2.equalsIgnoreCase(name)) {
			return subttl2();
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
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($due_dt.equalsIgnoreCase(name)) {
			return due_dt();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			return rcv_act_no();
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			return slip_sts_typ();
		}
		if ($slip_sts_typ_nm.equalsIgnoreCase(name)) {
			return slip_sts_typ_nm();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			return usr_nm();
		}
		if ($rcv_mtd_cd.equalsIgnoreCase(name)) {
			return rcv_mtd_cd();
		}
		if ($rcv_mtd_nm.equalsIgnoreCase(name)) {
			return rcv_mtd_nm();
		}
		if ($ar_setoff_cd.equalsIgnoreCase(name)) {
			return ar_setoff_cd();
		}
		if ($ar_setoff_nm.equalsIgnoreCase(name)) {
			return ar_setoff_nm();
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
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($s_xrate.equalsIgnoreCase(name)) {
			return s_xrate();
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
		if ($rcv_no.equalsIgnoreCase(name)) {
			return rcv_no();
		}
		if ($adv_gen_rcv_no.equalsIgnoreCase(name)) {
			return adv_gen_rcv_no();
		}
		if ($s_not_proc_bal.equalsIgnoreCase(name)) {
			return s_not_proc_bal();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($report_title.equalsIgnoreCase(name)) {
			return report_title();
		}
		if ($s_subttl1.equalsIgnoreCase(name)) {
			return s_subttl1();
		}
		if ($s_subttl2.equalsIgnoreCase(name)) {
			return s_subttl2();
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
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
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
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			return rcv_act_seq();
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			return rcv_act_rev();
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($not_proc_bal.equalsIgnoreCase(name)) {
			return not_proc_bal();
		}
		if ($subttl1.equalsIgnoreCase(name)) {
			return subttl1();
		}
		if ($subttl2.equalsIgnoreCase(name)) {
			return subttl2();
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
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($due_dt.equalsIgnoreCase(name)) {
			return due_dt();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			rcv_act_no(value);
			return;
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			slip_sts_typ(value);
			return;
		}
		if ($slip_sts_typ_nm.equalsIgnoreCase(name)) {
			slip_sts_typ_nm(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			usr_nm(value);
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
		if ($ar_setoff_cd.equalsIgnoreCase(name)) {
			ar_setoff_cd(value);
			return;
		}
		if ($ar_setoff_nm.equalsIgnoreCase(name)) {
			ar_setoff_nm(value);
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
		if ($rcv_no.equalsIgnoreCase(name)) {
			rcv_no(value);
			return;
		}
		if ($adv_gen_rcv_no.equalsIgnoreCase(name)) {
			adv_gen_rcv_no(value);
			return;
		}
		if ($s_not_proc_bal.equalsIgnoreCase(name)) {
			s_not_proc_bal(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($report_title.equalsIgnoreCase(name)) {
			report_title(value);
			return;
		}
		if ($s_subttl1.equalsIgnoreCase(name)) {
			s_subttl1(value);
			return;
		}
		if ($s_subttl2.equalsIgnoreCase(name)) {
			s_subttl2(value);
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
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
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
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($not_proc_bal.equalsIgnoreCase(name)) {
			not_proc_bal(value);
			return;
		}
		if ($subttl1.equalsIgnoreCase(name)) {
			subttl1(value);
			return;
		}
		if ($subttl2.equalsIgnoreCase(name)) {
			subttl2(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($not_proc_bal.equalsIgnoreCase(name)) {
			not_proc_bal(value);
			return;
		}
		if ($subttl1.equalsIgnoreCase(name)) {
			subttl1(value);
			return;
		}
		if ($subttl2.equalsIgnoreCase(name)) {
			subttl2(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($not_proc_bal.equalsIgnoreCase(name)) {
			not_proc_bal(value);
			return;
		}
		if ($subttl1.equalsIgnoreCase(name)) {
			subttl1(value);
			return;
		}
		if ($subttl2.equalsIgnoreCase(name)) {
			subttl2(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($not_proc_bal.equalsIgnoreCase(name)) {
			not_proc_bal(value);
			return;
		}
		if ($subttl1.equalsIgnoreCase(name)) {
			subttl1(value);
			return;
		}
		if ($subttl2.equalsIgnoreCase(name)) {
			subttl2(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($not_proc_bal.equalsIgnoreCase(name)) {
			not_proc_bal(value);
			return;
		}
		if ($subttl1.equalsIgnoreCase(name)) {
			subttl1(value);
			return;
		}
		if ($subttl2.equalsIgnoreCase(name)) {
			subttl2(value);
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
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($due_dt.equalsIgnoreCase(name)) {
			due_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			rcv_act_no(value);
			return;
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			slip_sts_typ(value);
			return;
		}
		if ($slip_sts_typ_nm.equalsIgnoreCase(name)) {
			slip_sts_typ_nm(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			usr_nm(value);
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
		if ($ar_setoff_cd.equalsIgnoreCase(name)) {
			ar_setoff_cd(value);
			return;
		}
		if ($ar_setoff_nm.equalsIgnoreCase(name)) {
			ar_setoff_nm(value);
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
		if ($rcv_no.equalsIgnoreCase(name)) {
			rcv_no(value);
			return;
		}
		if ($adv_gen_rcv_no.equalsIgnoreCase(name)) {
			adv_gen_rcv_no(value);
			return;
		}
		if ($s_not_proc_bal.equalsIgnoreCase(name)) {
			s_not_proc_bal(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($report_title.equalsIgnoreCase(name)) {
			report_title(value);
			return;
		}
		if ($s_subttl1.equalsIgnoreCase(name)) {
			s_subttl1(value);
			return;
		}
		if ($s_subttl2.equalsIgnoreCase(name)) {
			s_subttl2(value);
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
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
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
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($not_proc_bal.equalsIgnoreCase(name)) {
			not_proc_bal(value);
			return;
		}
		if ($subttl1.equalsIgnoreCase(name)) {
			subttl1(value);
			return;
		}
		if ($subttl2.equalsIgnoreCase(name)) {
			subttl2(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($not_proc_bal.equalsIgnoreCase(name)) {
			not_proc_bal(value);
			return;
		}
		if ($subttl1.equalsIgnoreCase(name)) {
			subttl1(value);
			return;
		}
		if ($subttl2.equalsIgnoreCase(name)) {
			subttl2(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($not_proc_bal.equalsIgnoreCase(name)) {
			not_proc_bal(value);
			return;
		}
		if ($subttl1.equalsIgnoreCase(name)) {
			subttl1(value);
			return;
		}
		if ($subttl2.equalsIgnoreCase(name)) {
			subttl2(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($not_proc_bal.equalsIgnoreCase(name)) {
			not_proc_bal(value);
			return;
		}
		if ($subttl1.equalsIgnoreCase(name)) {
			subttl1(value);
			return;
		}
		if ($subttl2.equalsIgnoreCase(name)) {
			subttl2(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($not_proc_bal.equalsIgnoreCase(name)) {
			not_proc_bal(value);
			return;
		}
		if ($subttl1.equalsIgnoreCase(name)) {
			subttl1(value);
			return;
		}
		if ($subttl2.equalsIgnoreCase(name)) {
			subttl2(value);
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
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($due_dt.equalsIgnoreCase(name)) {
			due_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

