package mcframe.commonMSBG.MSBGR0080;

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
 * ブロック"SuspOthHdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class SuspOthHdrR_MC_A extends MCConstRow {

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
	 *  債権決済方法ＣＤ１.<p>
	 *
	 */
	public static final String $ar_sttl_cd1 = "ar_sttl_cd1";
	/**
	 *  債権決済方法名１.<p>
	 *
	 */
	public static final String $ar_sttl_nm1 = "ar_sttl_nm1";
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
	 *  債権決済方法ＣＤ３.<p>
	 *
	 */
	public static final String $ar_sttl_cd3 = "ar_sttl_cd3";
	/**
	 *  債権決済方法名３.<p>
	 *
	 */
	public static final String $ar_sttl_nm3 = "ar_sttl_nm3";
	/**
	 *  債権債務先識別ＣＤ.<p>
	 *
	 */
	public static final String $debt_cred_id_cd = "debt_cred_id_cd";
	/**
	 *  債権債務先識別名.<p>
	 *
	 */
	public static final String $debt_cred_nm = "debt_cred_nm";
	/**
	 *  貸方先別名１.<p>
	 *
	 */
	public static final String $debt_cred_alt_nm1 = "debt_cred_alt_nm1";
	/**
	 *  貸方先別名２.<p>
	 *
	 */
	public static final String $debt_cred_alt_nm2 = "debt_cred_alt_nm2";
	/**
	 *  貸方先別名３.<p>
	 *
	 */
	public static final String $debt_cred_alt_nm3 = "debt_cred_alt_nm3";
	/**
	 *  貸方先別名４.<p>
	 *
	 */
	public static final String $debt_cred_alt_nm4 = "debt_cred_alt_nm4";
	/**
	 *  負担部門ＣＤ.<p>
	 *
	 */
	public static final String $chrg_dpt_cd = "chrg_dpt_cd";
	/**
	 *  負担部門名.<p>
	 *
	 */
	public static final String $chrg_dpt_nm = "chrg_dpt_nm";
	/**
	 *  取引備考.<p>
	 *
	 */
	public static final String $trd_rmrks = "trd_rmrks";
	/**
	 *  取引ＣＤ.<p>
	 *
	 */
	public static final String $trd_cd = "trd_cd";
	/**
	 *  取引名.<p>
	 *
	 */
	public static final String $trd_nm = "trd_nm";
	/**
	 *  発行日時.<p>
	 *
	 */
	public static final String $prnt_tm = "prnt_tm";
	/**
	 *  帳票名.<p>
	 *
	 */
	public static final String $report_title = "report_title";
	/**
	 *  計上日.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	/**
	 *  金額小計１.<p>
	 *
	 */
	public static final String $subttl1 = "subttl1";
	/**
	 *  金額小計１文字列.<p>
	 *
	 */
	public static final String $s_subttl1 = "s_subttl1";
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
	 *  支払期日.<p>
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
	public static final MCMeta ar_sttl_cd1_META = createCommonMeta($ar_sttl_cd1, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta ar_sttl_nm1_META = createCommonMeta($ar_sttl_nm1, mcframe.commonMA.meta.MA_META.STTL_NM);
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
	public static final MCMeta not_proc_bal_META = createCommonMeta($not_proc_bal, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_not_proc_bal_META = createStringMeta($s_not_proc_bal);
	public static final MCMeta ar_sttl_cd3_META = createCommonMeta($ar_sttl_cd3, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta ar_sttl_nm3_META = createCommonMeta($ar_sttl_nm3, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta debt_cred_id_cd_META = createCommonMeta($debt_cred_id_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta debt_cred_nm_META = createCommonMeta($debt_cred_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta debt_cred_alt_nm1_META = createCommonMeta($debt_cred_alt_nm1, mcframe.commonMA.meta.MA_META.BP_ALT_NM1);
	public static final MCMeta debt_cred_alt_nm2_META = createCommonMeta($debt_cred_alt_nm2, mcframe.commonMA.meta.MA_META.BP_ALT_NM2);
	public static final MCMeta debt_cred_alt_nm3_META = createCommonMeta($debt_cred_alt_nm3, mcframe.commonMA.meta.MA_META.BP_ALT_NM3);
	public static final MCMeta debt_cred_alt_nm4_META = createCommonMeta($debt_cred_alt_nm4, mcframe.commonMA.meta.MA_META.BP_ALT_NM4);
	public static final MCMeta chrg_dpt_cd_META = createCommonMeta($chrg_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta chrg_dpt_nm_META = createCommonMeta($chrg_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta trd_rmrks_META = createCommonMeta($trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_nm_META = createCommonMeta($trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta prnt_tm_META = createCommonMeta($prnt_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta report_title_META = createStringMeta($report_title);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta subttl1_META = createCommonMeta($subttl1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_subttl1_META = createStringMeta($s_subttl1);
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
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.RCV_ACT_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.RCV_ACT_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.RCV_ACT_SUB_CHAR3);

	protected static final ConstMetaList<SuspOthHdrR> constMetas = new ConstMetaList<SuspOthHdrR>(
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
			ar_sttl_cd1_META,
			ar_sttl_nm1_META,
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
			not_proc_bal_META,
			s_not_proc_bal_META,
			ar_sttl_cd3_META,
			ar_sttl_nm3_META,
			debt_cred_id_cd_META,
			debt_cred_nm_META,
			debt_cred_alt_nm1_META,
			debt_cred_alt_nm2_META,
			debt_cred_alt_nm3_META,
			debt_cred_alt_nm4_META,
			chrg_dpt_cd_META,
			chrg_dpt_nm_META,
			trd_rmrks_META,
			trd_cd_META,
			trd_nm_META,
			prnt_tm_META,
			report_title_META,
			ac_dt_META,
			subttl1_META,
			s_subttl1_META,
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
	protected SuspOthHdrR_MC_A(ConstMetaList<? extends SuspOthHdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SuspOthHdrR clone() {
		return (SuspOthHdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SuspOthHdrR createInstance() {
		return (SuspOthHdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SuspOthHdrR getValues(String... names) {
		return (SuspOthHdrR) super.getValues(names);
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
	 *  債権決済方法ＣＤ１.<p>
	 *
	 */
	public String ar_sttl_cd1() {
		return getConstString(offset + 9, $ar_sttl_cd1);
	}

	/**
	 *  債権決済方法ＣＤ１.<p>
	 *
	 */
	public void ar_sttl_cd1(String value) {
		setConstString(offset + 9, $ar_sttl_cd1, value);
	}


	/**
	 *  債権決済方法名１.<p>
	 *
	 */
	public String ar_sttl_nm1() {
		return getConstString(offset + 10, $ar_sttl_nm1);
	}

	/**
	 *  債権決済方法名１.<p>
	 *
	 */
	public void ar_sttl_nm1(String value) {
		setConstString(offset + 10, $ar_sttl_nm1, value);
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
	 *  入金先ＣＤ.<p>
	 *
	 */
	public String rcst_cd() {
		return getConstString(offset + 12, $rcst_cd);
	}

	/**
	 *  入金先ＣＤ.<p>
	 *
	 */
	public void rcst_cd(String value) {
		setConstString(offset + 12, $rcst_cd, value);
	}


	/**
	 *  入金先名.<p>
	 *
	 */
	public String rcst_nm() {
		return getConstString(offset + 13, $rcst_nm);
	}

	/**
	 *  入金先名.<p>
	 *
	 */
	public void rcst_nm(String value) {
		setConstString(offset + 13, $rcst_nm, value);
	}


	/**
	 *  入金先別名１.<p>
	 *
	 */
	public String rcst_alt_nm1() {
		return getConstString(offset + 14, $rcst_alt_nm1);
	}

	/**
	 *  入金先別名１.<p>
	 *
	 */
	public void rcst_alt_nm1(String value) {
		setConstString(offset + 14, $rcst_alt_nm1, value);
	}


	/**
	 *  入金先別名２.<p>
	 *
	 */
	public String rcst_alt_nm2() {
		return getConstString(offset + 15, $rcst_alt_nm2);
	}

	/**
	 *  入金先別名２.<p>
	 *
	 */
	public void rcst_alt_nm2(String value) {
		setConstString(offset + 15, $rcst_alt_nm2, value);
	}


	/**
	 *  入金先別名３.<p>
	 *
	 */
	public String rcst_alt_nm3() {
		return getConstString(offset + 16, $rcst_alt_nm3);
	}

	/**
	 *  入金先別名３.<p>
	 *
	 */
	public void rcst_alt_nm3(String value) {
		setConstString(offset + 16, $rcst_alt_nm3, value);
	}


	/**
	 *  入金先別名４.<p>
	 *
	 */
	public String rcst_alt_nm4() {
		return getConstString(offset + 17, $rcst_alt_nm4);
	}

	/**
	 *  入金先別名４.<p>
	 *
	 */
	public void rcst_alt_nm4(String value) {
		setConstString(offset + 17, $rcst_alt_nm4, value);
	}


	/**
	 *  請求先ＣＤ.<p>
	 *
	 */
	public String bcst_cd() {
		return getConstString(offset + 18, $bcst_cd);
	}

	/**
	 *  請求先ＣＤ.<p>
	 *
	 */
	public void bcst_cd(String value) {
		setConstString(offset + 18, $bcst_cd, value);
	}


	/**
	 *  請求先名.<p>
	 *
	 */
	public String bcst_nm() {
		return getConstString(offset + 19, $bcst_nm);
	}

	/**
	 *  請求先名.<p>
	 *
	 */
	public void bcst_nm(String value) {
		setConstString(offset + 19, $bcst_nm, value);
	}


	/**
	 *  請求先別名１.<p>
	 *
	 */
	public String bcst_alt_nm1() {
		return getConstString(offset + 20, $bcst_alt_nm1);
	}

	/**
	 *  請求先別名１.<p>
	 *
	 */
	public void bcst_alt_nm1(String value) {
		setConstString(offset + 20, $bcst_alt_nm1, value);
	}


	/**
	 *  請求先別名２.<p>
	 *
	 */
	public String bcst_alt_nm2() {
		return getConstString(offset + 21, $bcst_alt_nm2);
	}

	/**
	 *  請求先別名２.<p>
	 *
	 */
	public void bcst_alt_nm2(String value) {
		setConstString(offset + 21, $bcst_alt_nm2, value);
	}


	/**
	 *  請求先別名３.<p>
	 *
	 */
	public String bcst_alt_nm3() {
		return getConstString(offset + 22, $bcst_alt_nm3);
	}

	/**
	 *  請求先別名３.<p>
	 *
	 */
	public void bcst_alt_nm3(String value) {
		setConstString(offset + 22, $bcst_alt_nm3, value);
	}


	/**
	 *  請求先別名４.<p>
	 *
	 */
	public String bcst_alt_nm4() {
		return getConstString(offset + 23, $bcst_alt_nm4);
	}

	/**
	 *  請求先別名４.<p>
	 *
	 */
	public void bcst_alt_nm4(String value) {
		setConstString(offset + 23, $bcst_alt_nm4, value);
	}


	/**
	 *  請求部門ＣＤ.<p>
	 *
	 */
	public String bill_dpt_cd() {
		return getConstString(offset + 24, $bill_dpt_cd);
	}

	/**
	 *  請求部門ＣＤ.<p>
	 *
	 */
	public void bill_dpt_cd(String value) {
		setConstString(offset + 24, $bill_dpt_cd, value);
	}


	/**
	 *  請求部門名.<p>
	 *
	 */
	public String bill_dpt_nm() {
		return getConstString(offset + 25, $bill_dpt_nm);
	}

	/**
	 *  請求部門名.<p>
	 *
	 */
	public void bill_dpt_nm(String value) {
		setConstString(offset + 25, $bill_dpt_nm, value);
	}


	/**
	 *  取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 26, $trd_cur_cd);
	}

	/**
	 *  取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 26, $trd_cur_cd, value);
	}


	/**
	 *  取引通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 27, $trd_cur_nm);
	}

	/**
	 *  取引通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 27, $trd_cur_nm, value);
	}


	/**
	 *  為替レート.<p>
	 *
	 */
	public MCNumber xrate() {
		return getConstNumber(offset + 28, $xrate);
	}

	/**
	 *  為替レート.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		setConstNumber(offset + 28, $xrate, value);
	}

	/**
	 *  為替レート.<p>
	 *
	 */
	public void xrate(int value) {
		setConstNumber(offset + 28, $xrate, value);
	}

	/**
	 *  為替レート.<p>
	 *
	 */
	public void xrate(long value) {
		setConstNumber(offset + 28, $xrate, value);
	}

	/**
	 *  為替レート.<p>
	 *
	 */
	public void xrate(float value) {
		setConstNumber(offset + 28, $xrate, value);
	}

	/**
	 *  為替レート.<p>
	 *
	 */
	public void xrate(double value) {
		setConstNumber(offset + 28, $xrate, value);
	}


	/**
	 *  為替レート文字列.<p>
	 *
	 */
	public String s_xrate() {
		return getConstString(offset + 29, $s_xrate);
	}

	/**
	 *  為替レート文字列.<p>
	 *
	 */
	public void s_xrate(String value) {
		setConstString(offset + 29, $s_xrate, value);
	}


	/**
	 *  口座ＣＤ.<p>
	 *
	 */
	public String bank_ac_cd() {
		return getConstString(offset + 30, $bank_ac_cd);
	}

	/**
	 *  口座ＣＤ.<p>
	 *
	 */
	public void bank_ac_cd(String value) {
		setConstString(offset + 30, $bank_ac_cd, value);
	}


	/**
	 *  口座名.<p>
	 *
	 */
	public String bank_ac_nm() {
		return getConstString(offset + 31, $bank_ac_nm);
	}

	/**
	 *  口座名.<p>
	 *
	 */
	public void bank_ac_nm(String value) {
		setConstString(offset + 31, $bank_ac_nm, value);
	}


	/**
	 *  振込人名.<p>
	 *
	 */
	public String xfr_psn() {
		return getConstString(offset + 32, $xfr_psn);
	}

	/**
	 *  振込人名.<p>
	 *
	 */
	public void xfr_psn(String value) {
		setConstString(offset + 32, $xfr_psn, value);
	}


	/**
	 *  銀行ＣＤ.<p>
	 *
	 */
	public String bank_cd() {
		return getConstString(offset + 33, $bank_cd);
	}

	/**
	 *  銀行ＣＤ.<p>
	 *
	 */
	public void bank_cd(String value) {
		setConstString(offset + 33, $bank_cd, value);
	}


	/**
	 *  銀行名.<p>
	 *
	 */
	public String bank_nm() {
		return getConstString(offset + 34, $bank_nm);
	}

	/**
	 *  銀行名.<p>
	 *
	 */
	public void bank_nm(String value) {
		setConstString(offset + 34, $bank_nm, value);
	}


	/**
	 *  支店ＣＤ.<p>
	 *
	 */
	public String branch_cd() {
		return getConstString(offset + 35, $branch_cd);
	}

	/**
	 *  支店ＣＤ.<p>
	 *
	 */
	public void branch_cd(String value) {
		setConstString(offset + 35, $branch_cd, value);
	}


	/**
	 *  支店名.<p>
	 *
	 */
	public String branch_nm() {
		return getConstString(offset + 36, $branch_nm);
	}

	/**
	 *  支店名.<p>
	 *
	 */
	public void branch_nm(String value) {
		setConstString(offset + 36, $branch_nm, value);
	}


	/**
	 *  口座番号.<p>
	 *
	 */
	public String bank_ac_no() {
		return getConstString(offset + 37, $bank_ac_no);
	}

	/**
	 *  口座番号.<p>
	 *
	 */
	public void bank_ac_no(String value) {
		setConstString(offset + 37, $bank_ac_no, value);
	}


	/**
	 *  入金ＮＯ.<p>
	 *
	 */
	public String rcv_no() {
		return getConstString(offset + 38, $rcv_no);
	}

	/**
	 *  入金ＮＯ.<p>
	 *
	 */
	public void rcv_no(String value) {
		setConstString(offset + 38, $rcv_no, value);
	}


	/**
	 *  未処理残高.<p>
	 *
	 */
	public MCNumber not_proc_bal() {
		return getConstNumber(offset + 39, $not_proc_bal);
	}

	/**
	 *  未処理残高.<p>
	 *
	 */
	public void not_proc_bal(MCNumber value) {
		setConstNumber(offset + 39, $not_proc_bal, value);
	}

	/**
	 *  未処理残高.<p>
	 *
	 */
	public void not_proc_bal(int value) {
		setConstNumber(offset + 39, $not_proc_bal, value);
	}

	/**
	 *  未処理残高.<p>
	 *
	 */
	public void not_proc_bal(long value) {
		setConstNumber(offset + 39, $not_proc_bal, value);
	}

	/**
	 *  未処理残高.<p>
	 *
	 */
	public void not_proc_bal(float value) {
		setConstNumber(offset + 39, $not_proc_bal, value);
	}

	/**
	 *  未処理残高.<p>
	 *
	 */
	public void not_proc_bal(double value) {
		setConstNumber(offset + 39, $not_proc_bal, value);
	}


	/**
	 *  未処理残高文字列.<p>
	 *
	 */
	public String s_not_proc_bal() {
		return getConstString(offset + 40, $s_not_proc_bal);
	}

	/**
	 *  未処理残高文字列.<p>
	 *
	 */
	public void s_not_proc_bal(String value) {
		setConstString(offset + 40, $s_not_proc_bal, value);
	}


	/**
	 *  債権決済方法ＣＤ３.<p>
	 *
	 */
	public String ar_sttl_cd3() {
		return getConstString(offset + 41, $ar_sttl_cd3);
	}

	/**
	 *  債権決済方法ＣＤ３.<p>
	 *
	 */
	public void ar_sttl_cd3(String value) {
		setConstString(offset + 41, $ar_sttl_cd3, value);
	}


	/**
	 *  債権決済方法名３.<p>
	 *
	 */
	public String ar_sttl_nm3() {
		return getConstString(offset + 42, $ar_sttl_nm3);
	}

	/**
	 *  債権決済方法名３.<p>
	 *
	 */
	public void ar_sttl_nm3(String value) {
		setConstString(offset + 42, $ar_sttl_nm3, value);
	}


	/**
	 *  債権債務先識別ＣＤ.<p>
	 *
	 */
	public String debt_cred_id_cd() {
		return getConstString(offset + 43, $debt_cred_id_cd);
	}

	/**
	 *  債権債務先識別ＣＤ.<p>
	 *
	 */
	public void debt_cred_id_cd(String value) {
		setConstString(offset + 43, $debt_cred_id_cd, value);
	}


	/**
	 *  債権債務先識別名.<p>
	 *
	 */
	public String debt_cred_nm() {
		return getConstString(offset + 44, $debt_cred_nm);
	}

	/**
	 *  債権債務先識別名.<p>
	 *
	 */
	public void debt_cred_nm(String value) {
		setConstString(offset + 44, $debt_cred_nm, value);
	}


	/**
	 *  貸方先別名１.<p>
	 *
	 */
	public String debt_cred_alt_nm1() {
		return getConstString(offset + 45, $debt_cred_alt_nm1);
	}

	/**
	 *  貸方先別名１.<p>
	 *
	 */
	public void debt_cred_alt_nm1(String value) {
		setConstString(offset + 45, $debt_cred_alt_nm1, value);
	}


	/**
	 *  貸方先別名２.<p>
	 *
	 */
	public String debt_cred_alt_nm2() {
		return getConstString(offset + 46, $debt_cred_alt_nm2);
	}

	/**
	 *  貸方先別名２.<p>
	 *
	 */
	public void debt_cred_alt_nm2(String value) {
		setConstString(offset + 46, $debt_cred_alt_nm2, value);
	}


	/**
	 *  貸方先別名３.<p>
	 *
	 */
	public String debt_cred_alt_nm3() {
		return getConstString(offset + 47, $debt_cred_alt_nm3);
	}

	/**
	 *  貸方先別名３.<p>
	 *
	 */
	public void debt_cred_alt_nm3(String value) {
		setConstString(offset + 47, $debt_cred_alt_nm3, value);
	}


	/**
	 *  貸方先別名４.<p>
	 *
	 */
	public String debt_cred_alt_nm4() {
		return getConstString(offset + 48, $debt_cred_alt_nm4);
	}

	/**
	 *  貸方先別名４.<p>
	 *
	 */
	public void debt_cred_alt_nm4(String value) {
		setConstString(offset + 48, $debt_cred_alt_nm4, value);
	}


	/**
	 *  負担部門ＣＤ.<p>
	 *
	 */
	public String chrg_dpt_cd() {
		return getConstString(offset + 49, $chrg_dpt_cd);
	}

	/**
	 *  負担部門ＣＤ.<p>
	 *
	 */
	public void chrg_dpt_cd(String value) {
		setConstString(offset + 49, $chrg_dpt_cd, value);
	}


	/**
	 *  負担部門名.<p>
	 *
	 */
	public String chrg_dpt_nm() {
		return getConstString(offset + 50, $chrg_dpt_nm);
	}

	/**
	 *  負担部門名.<p>
	 *
	 */
	public void chrg_dpt_nm(String value) {
		setConstString(offset + 50, $chrg_dpt_nm, value);
	}


	/**
	 *  取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return getConstString(offset + 51, $trd_rmrks);
	}

	/**
	 *  取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		setConstString(offset + 51, $trd_rmrks, value);
	}


	/**
	 *  取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 52, $trd_cd);
	}

	/**
	 *  取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 52, $trd_cd, value);
	}


	/**
	 *  取引名.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 53, $trd_nm);
	}

	/**
	 *  取引名.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 53, $trd_nm, value);
	}


	/**
	 *  発行日時.<p>
	 *
	 */
	public MCDate prnt_tm() {
		return getConstDate(offset + 54, $prnt_tm);
	}

	/**
	 *  発行日時.<p>
	 *
	 */
	public void prnt_tm(MCDate value) {
		setConstDate(offset + 54, $prnt_tm, value);
	}


	/**
	 *  帳票名.<p>
	 *
	 */
	public String report_title() {
		return getConstString(offset + 55, $report_title);
	}

	/**
	 *  帳票名.<p>
	 *
	 */
	public void report_title(String value) {
		setConstString(offset + 55, $report_title, value);
	}


	/**
	 *  計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 56, $ac_dt);
	}

	/**
	 *  計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 56, $ac_dt, value);
	}


	/**
	 *  金額小計１.<p>
	 *
	 */
	public MCNumber subttl1() {
		return getConstNumber(offset + 57, $subttl1);
	}

	/**
	 *  金額小計１.<p>
	 *
	 */
	public void subttl1(MCNumber value) {
		setConstNumber(offset + 57, $subttl1, value);
	}

	/**
	 *  金額小計１.<p>
	 *
	 */
	public void subttl1(int value) {
		setConstNumber(offset + 57, $subttl1, value);
	}

	/**
	 *  金額小計１.<p>
	 *
	 */
	public void subttl1(long value) {
		setConstNumber(offset + 57, $subttl1, value);
	}

	/**
	 *  金額小計１.<p>
	 *
	 */
	public void subttl1(float value) {
		setConstNumber(offset + 57, $subttl1, value);
	}

	/**
	 *  金額小計１.<p>
	 *
	 */
	public void subttl1(double value) {
		setConstNumber(offset + 57, $subttl1, value);
	}


	/**
	 *  金額小計１文字列.<p>
	 *
	 */
	public String s_subttl1() {
		return getConstString(offset + 58, $s_subttl1);
	}

	/**
	 *  金額小計１文字列.<p>
	 *
	 */
	public void s_subttl1(String value) {
		setConstString(offset + 58, $s_subttl1, value);
	}


	/**
	 *  手形番号.<p>
	 *
	 */
	public String note_no() {
		return getConstString(offset + 59, $note_no);
	}

	/**
	 *  手形番号.<p>
	 *
	 */
	public void note_no(String value) {
		setConstString(offset + 59, $note_no, value);
	}


	/**
	 *  手形区分.<p>
	 *
	 */
	public String note_typ() {
		return getConstString(offset + 60, $note_typ);
	}

	/**
	 *  手形区分.<p>
	 *
	 */
	public void note_typ(String value) {
		setConstString(offset + 60, $note_typ, value);
	}


	/**
	 *  手形区分名.<p>
	 *
	 */
	public String note_typ_nm() {
		return getConstString(offset + 61, $note_typ_nm);
	}

	/**
	 *  手形区分名.<p>
	 *
	 */
	public void note_typ_nm(String value) {
		setConstString(offset + 61, $note_typ_nm, value);
	}


	/**
	 *  支払期日.<p>
	 *
	 */
	public MCDate due_dt() {
		return getConstDate(offset + 62, $due_dt);
	}

	/**
	 *  支払期日.<p>
	 *
	 */
	public void due_dt(MCDate value) {
		setConstDate(offset + 62, $due_dt, value);
	}


	/**
	 *  振出人名.<p>
	 *
	 */
	public String drawer_nm() {
		return getConstString(offset + 63, $drawer_nm);
	}

	/**
	 *  振出人名.<p>
	 *
	 */
	public void drawer_nm(String value) {
		setConstString(offset + 63, $drawer_nm, value);
	}


	/**
	 *  裏書人.<p>
	 *
	 */
	public String endrsr() {
		return getConstString(offset + 64, $endrsr);
	}

	/**
	 *  裏書人.<p>
	 *
	 */
	public void endrsr(String value) {
		setConstString(offset + 64, $endrsr, value);
	}


	/**
	 *  引受人.<p>
	 *
	 */
	public String accptr() {
		return getConstString(offset + 65, $accptr);
	}

	/**
	 *  引受人.<p>
	 *
	 */
	public void accptr(String value) {
		setConstString(offset + 65, $accptr, value);
	}


	/**
	 *  振出銀行ＣＤ.<p>
	 *
	 */
	public String draw_bank_cd() {
		return getConstString(offset + 66, $draw_bank_cd);
	}

	/**
	 *  振出銀行ＣＤ.<p>
	 *
	 */
	public void draw_bank_cd(String value) {
		setConstString(offset + 66, $draw_bank_cd, value);
	}


	/**
	 *  振出銀行名.<p>
	 *
	 */
	public String draw_bank_nm() {
		return getConstString(offset + 67, $draw_bank_nm);
	}

	/**
	 *  振出銀行名.<p>
	 *
	 */
	public void draw_bank_nm(String value) {
		setConstString(offset + 67, $draw_bank_nm, value);
	}


	/**
	 *  振出支店ＣＤ.<p>
	 *
	 */
	public String draw_branch_cd() {
		return getConstString(offset + 68, $draw_branch_cd);
	}

	/**
	 *  振出支店ＣＤ.<p>
	 *
	 */
	public void draw_branch_cd(String value) {
		setConstString(offset + 68, $draw_branch_cd, value);
	}


	/**
	 *  振出支店名.<p>
	 *
	 */
	public String draw_branch_nm() {
		return getConstString(offset + 69, $draw_branch_nm);
	}

	/**
	 *  振出支店名.<p>
	 *
	 */
	public void draw_branch_nm(String value) {
		setConstString(offset + 69, $draw_branch_nm, value);
	}


	/**
	 *  予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 70, $sub_char1);
	}

	/**
	 *  予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 70, $sub_char1, value);
	}


	/**
	 *  予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 71, $sub_char2);
	}

	/**
	 *  予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 71, $sub_char2, value);
	}


	/**
	 *  予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 72, $sub_char3);
	}

	/**
	 *  予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 72, $sub_char3, value);
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
		if ($ar_sttl_cd1.equalsIgnoreCase(name)) {
			return ar_sttl_cd1();
		}
		if ($ar_sttl_nm1.equalsIgnoreCase(name)) {
			return ar_sttl_nm1();
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
		if ($s_not_proc_bal.equalsIgnoreCase(name)) {
			return s_not_proc_bal();
		}
		if ($ar_sttl_cd3.equalsIgnoreCase(name)) {
			return ar_sttl_cd3();
		}
		if ($ar_sttl_nm3.equalsIgnoreCase(name)) {
			return ar_sttl_nm3();
		}
		if ($debt_cred_id_cd.equalsIgnoreCase(name)) {
			return debt_cred_id_cd();
		}
		if ($debt_cred_nm.equalsIgnoreCase(name)) {
			return debt_cred_nm();
		}
		if ($debt_cred_alt_nm1.equalsIgnoreCase(name)) {
			return debt_cred_alt_nm1();
		}
		if ($debt_cred_alt_nm2.equalsIgnoreCase(name)) {
			return debt_cred_alt_nm2();
		}
		if ($debt_cred_alt_nm3.equalsIgnoreCase(name)) {
			return debt_cred_alt_nm3();
		}
		if ($debt_cred_alt_nm4.equalsIgnoreCase(name)) {
			return debt_cred_alt_nm4();
		}
		if ($chrg_dpt_cd.equalsIgnoreCase(name)) {
			return chrg_dpt_cd();
		}
		if ($chrg_dpt_nm.equalsIgnoreCase(name)) {
			return chrg_dpt_nm();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($report_title.equalsIgnoreCase(name)) {
			return report_title();
		}
		if ($s_subttl1.equalsIgnoreCase(name)) {
			return s_subttl1();
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
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($not_proc_bal.equalsIgnoreCase(name)) {
			return not_proc_bal();
		}
		if ($subttl1.equalsIgnoreCase(name)) {
			return subttl1();
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
		if ($ar_sttl_cd1.equalsIgnoreCase(name)) {
			return ar_sttl_cd1();
		}
		if ($ar_sttl_nm1.equalsIgnoreCase(name)) {
			return ar_sttl_nm1();
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
		if ($s_not_proc_bal.equalsIgnoreCase(name)) {
			return s_not_proc_bal();
		}
		if ($ar_sttl_cd3.equalsIgnoreCase(name)) {
			return ar_sttl_cd3();
		}
		if ($ar_sttl_nm3.equalsIgnoreCase(name)) {
			return ar_sttl_nm3();
		}
		if ($debt_cred_id_cd.equalsIgnoreCase(name)) {
			return debt_cred_id_cd();
		}
		if ($debt_cred_nm.equalsIgnoreCase(name)) {
			return debt_cred_nm();
		}
		if ($debt_cred_alt_nm1.equalsIgnoreCase(name)) {
			return debt_cred_alt_nm1();
		}
		if ($debt_cred_alt_nm2.equalsIgnoreCase(name)) {
			return debt_cred_alt_nm2();
		}
		if ($debt_cred_alt_nm3.equalsIgnoreCase(name)) {
			return debt_cred_alt_nm3();
		}
		if ($debt_cred_alt_nm4.equalsIgnoreCase(name)) {
			return debt_cred_alt_nm4();
		}
		if ($chrg_dpt_cd.equalsIgnoreCase(name)) {
			return chrg_dpt_cd();
		}
		if ($chrg_dpt_nm.equalsIgnoreCase(name)) {
			return chrg_dpt_nm();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($report_title.equalsIgnoreCase(name)) {
			return report_title();
		}
		if ($s_subttl1.equalsIgnoreCase(name)) {
			return s_subttl1();
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
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($not_proc_bal.equalsIgnoreCase(name)) {
			return not_proc_bal();
		}
		if ($subttl1.equalsIgnoreCase(name)) {
			return subttl1();
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
		if ($ar_sttl_cd1.equalsIgnoreCase(name)) {
			ar_sttl_cd1(value);
			return;
		}
		if ($ar_sttl_nm1.equalsIgnoreCase(name)) {
			ar_sttl_nm1(value);
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
		if ($s_not_proc_bal.equalsIgnoreCase(name)) {
			s_not_proc_bal(value);
			return;
		}
		if ($ar_sttl_cd3.equalsIgnoreCase(name)) {
			ar_sttl_cd3(value);
			return;
		}
		if ($ar_sttl_nm3.equalsIgnoreCase(name)) {
			ar_sttl_nm3(value);
			return;
		}
		if ($debt_cred_id_cd.equalsIgnoreCase(name)) {
			debt_cred_id_cd(value);
			return;
		}
		if ($debt_cred_nm.equalsIgnoreCase(name)) {
			debt_cred_nm(value);
			return;
		}
		if ($debt_cred_alt_nm1.equalsIgnoreCase(name)) {
			debt_cred_alt_nm1(value);
			return;
		}
		if ($debt_cred_alt_nm2.equalsIgnoreCase(name)) {
			debt_cred_alt_nm2(value);
			return;
		}
		if ($debt_cred_alt_nm3.equalsIgnoreCase(name)) {
			debt_cred_alt_nm3(value);
			return;
		}
		if ($debt_cred_alt_nm4.equalsIgnoreCase(name)) {
			debt_cred_alt_nm4(value);
			return;
		}
		if ($chrg_dpt_cd.equalsIgnoreCase(name)) {
			chrg_dpt_cd(value);
			return;
		}
		if ($chrg_dpt_nm.equalsIgnoreCase(name)) {
			chrg_dpt_nm(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
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
		if ($report_title.equalsIgnoreCase(name)) {
			report_title(value);
			return;
		}
		if ($s_subttl1.equalsIgnoreCase(name)) {
			s_subttl1(value);
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
		if ($ar_sttl_cd1.equalsIgnoreCase(name)) {
			ar_sttl_cd1(value);
			return;
		}
		if ($ar_sttl_nm1.equalsIgnoreCase(name)) {
			ar_sttl_nm1(value);
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
		if ($s_not_proc_bal.equalsIgnoreCase(name)) {
			s_not_proc_bal(value);
			return;
		}
		if ($ar_sttl_cd3.equalsIgnoreCase(name)) {
			ar_sttl_cd3(value);
			return;
		}
		if ($ar_sttl_nm3.equalsIgnoreCase(name)) {
			ar_sttl_nm3(value);
			return;
		}
		if ($debt_cred_id_cd.equalsIgnoreCase(name)) {
			debt_cred_id_cd(value);
			return;
		}
		if ($debt_cred_nm.equalsIgnoreCase(name)) {
			debt_cred_nm(value);
			return;
		}
		if ($debt_cred_alt_nm1.equalsIgnoreCase(name)) {
			debt_cred_alt_nm1(value);
			return;
		}
		if ($debt_cred_alt_nm2.equalsIgnoreCase(name)) {
			debt_cred_alt_nm2(value);
			return;
		}
		if ($debt_cred_alt_nm3.equalsIgnoreCase(name)) {
			debt_cred_alt_nm3(value);
			return;
		}
		if ($debt_cred_alt_nm4.equalsIgnoreCase(name)) {
			debt_cred_alt_nm4(value);
			return;
		}
		if ($chrg_dpt_cd.equalsIgnoreCase(name)) {
			chrg_dpt_cd(value);
			return;
		}
		if ($chrg_dpt_nm.equalsIgnoreCase(name)) {
			chrg_dpt_nm(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
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
		if ($report_title.equalsIgnoreCase(name)) {
			report_title(value);
			return;
		}
		if ($s_subttl1.equalsIgnoreCase(name)) {
			s_subttl1(value);
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

