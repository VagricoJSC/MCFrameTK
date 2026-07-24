package mcframe.serverMSBH.MSBHL5050;

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
 * ブロック"AdvPay_Chk01_Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class AdvPay_Chk01_HdrR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * Notes payable data update type 支払手形データ更新区分.<p>
	 *
	 */
	public static final String $note_data_crud_typ = "note_data_crud_typ";
	public static final String $apa = "apa";
	/**
	 * Fee tax rate 手数料税率.<p>
	 *
	 */
	public static final String $trd_cur_com_paid_tax_rate = "trd_cur_com_paid_tax_rate";
	public static final String $pn = "pn";
	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_cur_amt_dec_place = "trd_cur_amt_dec_place";
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $adv_pay_upd_cntr = "adv_pay_upd_cntr";
	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public static final String $can_ac_dt = "can_ac_dt";
	/**
	 * Note sight upper limit 手形サイト上限.<p>
	 *
	 */
	public static final String $note_days_lmt = "note_days_lmt";
	/**
	 * Original advance payment result sequence number 元前渡金支払実績連番.<p>
	 *
	 */
	public static final String $bef_adv_pay_act_seq = "bef_adv_pay_act_seq";
	/**
	 * Cancellation slip advance payment result sequence number 取消伝票前渡金支払実績連番.<p>
	 *
	 */
	public static final String $can_adv_pay_act_seq = "can_adv_pay_act_seq";
	/**
	 * Cd. of dept. in charge of scheduled payee after conversion 変換後支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public static final String $conv_bsppl_dpt_cd = "conv_bsppl_dpt_cd";
	/**
	 * Charged dept. cd. after conversion 変換後負担部門ＣＤ.<p>
	 *
	 */
	public static final String $conv_bd_dpt_cd = "conv_bd_dpt_cd";
	/**
	 * Payment dept. cd. After conversion 変換後支払部門ＣＤ.<p>
	 *
	 */
	public static final String $conv_pay_dpt_cd = "conv_pay_dpt_cd";
	/**
	 * WG cd. After conversion 変換後ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $conv_wg_cd = "conv_wg_cd";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";

	public static final String $adv_pay_act_no = $apa + ".adv_pay_act_no";
	public static final String $adv_pay_act_seq = $apa + ".adv_pay_act_seq";
	public static final String $adv_pay_act_rev = $apa + ".adv_pay_act_rev";
	public static final String $slip_sts_typ = $apa + ".slip_sts_typ";
	public static final String $psppl_cd = $apa + ".psppl_cd";
	public static final String $bsppl_cd = $apa + ".bsppl_cd";
	public static final String $bsppl_dpt_cd = $apa + ".bsppl_dpt_cd";
	public static final String $bd_dpt_cd = $apa + ".bd_dpt_cd";
	public static final String $pay_dpt_cd = $apa + ".pay_dpt_cd";
	public static final String $wg_cd = $apa + ".wg_cd";
	public static final String $pay_usr_cd = $apa + ".pay_usr_cd";
	public static final String $pay_act_dt = $apa + ".pay_act_dt";
	public static final String $ac_dt = $apa + ".ac_dt";
	public static final String $ac_ym = $apa + ".ac_ym";
	public static final String $trd_cur_cd = $apa + ".trd_cur_cd";
	public static final String $base_cur_cd = $apa + ".base_cur_cd";
	public static final String $xrate_cd = $apa + ".xrate_cd";
	public static final String $xrate = $apa + ".xrate";
	public static final String $ap_sttl_cd = $apa + ".ap_sttl_cd";
	public static final String $ap_sttl_typ = $apa + ".ap_sttl_typ";
	public static final String $ac_rsn_cd = $apa + ".ac_rsn_cd";
	public static final String $com_paid_ap_sttl_cd = $apa + ".com_paid_ap_sttl_cd";
	public static final String $com_paid_ap_sttl_typ = $apa + ".com_paid_ap_sttl_typ";
	public static final String $com_paid_ac_rsn_cd = $apa + ".com_paid_ac_rsn_cd";
	public static final String $trd_cur_com_paid_tax_cd = $apa + ".trd_cur_com_paid_tax_cd";
	public static final String $bank_ac_cd = $apa + ".bank_ac_cd";
	public static final String $pay_bank_ac_cd = $apa + ".pay_bank_ac_cd";
	public static final String $trd_cur_amt = $apa + ".trd_cur_amt";
	public static final String $trd_cur_com_paid = $apa + ".trd_cur_com_paid";
	public static final String $trd_cur_com_paid_tax_amt = $apa + ".trd_cur_com_paid_tax_amt";
	public static final String $trd_cur_exc_com_paid = $apa + ".trd_cur_exc_com_paid";
	public static final String $trd_cur_setoff_tgt_amt = $apa + ".trd_cur_setoff_tgt_amt";
	public static final String $trd_cur_setoff_schd_amt = $apa + ".trd_cur_setoff_schd_amt";
	public static final String $trd_cur_setoff_act_amt = $apa + ".trd_cur_setoff_act_amt";
	public static final String $trd_cur_not_proc_bal = $apa + ".trd_cur_not_proc_bal";
	public static final String $base_cur_amt = $apa + ".base_cur_amt";
	public static final String $base_cur_com_paid = $apa + ".base_cur_com_paid";
	public static final String $base_cur_com_paid_tax_amt = $apa + ".base_cur_com_paid_tax_amt";
	public static final String $base_cur_exc_com_paid = $apa + ".base_cur_exc_com_paid";
	public static final String $base_cur_setoff_tgt_amt = $apa + ".base_cur_setoff_tgt_amt";
	public static final String $pay_ntc_adv_pay_flg = $apa + ".pay_ntc_adv_pay_flg";
	public static final String $trd_rmrks = $apa + ".trd_rmrks";
	public static final String $intr_rmrks = $apa + ".intr_rmrks";
	public static final String $sub_char1 = $apa + ".sub_char1";
	public static final String $sub_char2 = $apa + ".sub_char2";
	public static final String $sub_char3 = $apa + ".sub_char3";
	public static final String $pay_note_mng_no = $pn + ".pay_note_mng_no";
	public static final String $pay_note_mng_seq = $pn + ".pay_note_mng_seq";
	public static final String $note_slip_sts_typ = $pn + ".slip_sts_typ";
	public static final String $note_no = $pn + ".note_no";
	public static final String $note_typ = $pn + ".note_typ";
	public static final String $note_rsn_cd = $pn + ".note_rsn_cd";
	public static final String $draw_dt = $pn + ".draw_dt";
	public static final String $due_dt = $pn + ".due_dt";
	public static final String $note_days = $pn + ".note_days";
	public static final String $drawer_nm = $pn + ".drawer_nm";
	public static final String $draw_bank_cd = $pn + ".draw_bank_cd";
	public static final String $draw_branch_cd = $pn + ".draw_branch_cd";
	public static final String $endrsr = $pn + ".endrsr";
	public static final String $accptr = $pn + ".accptr";
	public static final String $note_amt = $pn + ".note_amt";
	public static final String $cur_cd = $pn + ".cur_cd";
	public static final String $pay_act_no = $pn + ".pay_act_no";
	public static final String $pay_act_seq = $pn + ".pay_act_seq";
	public static final String $note_adv_pay_act_no = $pn + ".adv_pay_act_no";
	public static final String $note_adv_pay_act_seq = $pn + ".adv_pay_act_seq";
	public static final String $a_imp_flg = $pn + ".a_imp_flg";
	public static final String $note_sub_char1 = $pn + ".sub_char1";
	public static final String $note_sub_char2 = $pn + ".sub_char2";
	public static final String $note_sub_char3 = $pn + ".sub_char3";

	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta note_data_crud_typ_META = createCommonMeta($note_data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta apa_META = createInnerRowMeta($apa, mcframe.serverMS.dbc.MST_ADV_PAY_ACT_R.class);
	public static final MCMeta trd_cur_com_paid_tax_rate_META = createCommonMeta($trd_cur_com_paid_tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta pn_META = createInnerRowMeta($pn, mcframe.serverMS.dbc.MST_PAY_NOTE_R.class);
	public static final MCMeta trd_cur_amt_dec_place_META = createCommonMeta($trd_cur_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta adv_pay_upd_cntr_META = createCommonMeta($adv_pay_upd_cntr, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta can_ac_dt_META = createCommonMeta($can_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta note_days_lmt_META = createCommonMeta($note_days_lmt, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta bef_adv_pay_act_seq_META = createCommonMeta($bef_adv_pay_act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta can_adv_pay_act_seq_META = createCommonMeta($can_adv_pay_act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta conv_bsppl_dpt_cd_META = createCommonMeta($conv_bsppl_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta conv_bd_dpt_cd_META = createCommonMeta($conv_bd_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta conv_pay_dpt_cd_META = createCommonMeta($conv_pay_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta conv_wg_cd_META = createCommonMeta($conv_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<AdvPay_Chk01_HdrR> constMetas = new ConstMetaList<AdvPay_Chk01_HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			data_crud_typ_META,
			note_data_crud_typ_META,
			apa_META,
			trd_cur_com_paid_tax_rate_META,
			pn_META,
			trd_cur_amt_dec_place_META,
			adv_pay_upd_cntr_META,
			can_ac_dt_META,
			note_days_lmt_META,
			bef_adv_pay_act_seq_META,
			can_adv_pay_act_seq_META,
			conv_bsppl_dpt_cd_META,
			conv_bd_dpt_cd_META,
			conv_pay_dpt_cd_META,
			conv_wg_cd_META,
			err_flg_META
		},
		new String[][]{
			{
				"adv_pay_act_no",
				"adv_pay_act_seq",
				"adv_pay_act_rev",
				"slip_sts_typ",
				"psppl_cd",
				"bsppl_cd",
				"bsppl_dpt_cd",
				"bd_dpt_cd",
				"pay_dpt_cd",
				"wg_cd",
				"pay_usr_cd",
				"pay_act_dt",
				"ac_dt",
				"ac_ym",
				"trd_cur_cd",
				"base_cur_cd",
				"xrate_cd",
				"xrate",
				"ap_sttl_cd",
				"ap_sttl_typ",
				"ac_rsn_cd",
				"com_paid_ap_sttl_cd",
				"com_paid_ap_sttl_typ",
				"com_paid_ac_rsn_cd",
				"trd_cur_com_paid_tax_cd",
				"bank_ac_cd",
				"pay_bank_ac_cd",
				"trd_cur_amt",
				"trd_cur_com_paid",
				"trd_cur_com_paid_tax_amt",
				"trd_cur_exc_com_paid",
				"trd_cur_setoff_tgt_amt",
				"trd_cur_setoff_schd_amt",
				"trd_cur_setoff_act_amt",
				"trd_cur_not_proc_bal",
				"base_cur_amt",
				"base_cur_com_paid",
				"base_cur_com_paid_tax_amt",
				"base_cur_exc_com_paid",
				"base_cur_setoff_tgt_amt",
				"pay_ntc_adv_pay_flg",
				"trd_rmrks",
				"intr_rmrks",
				"sub_char1",
				"sub_char2",
				"sub_char3",
				"pay_note_mng_no",
				"pay_note_mng_seq",
				"note_slip_sts_typ",
				"note_no",
				"note_typ",
				"note_rsn_cd",
				"draw_dt",
				"due_dt",
				"note_days",
				"drawer_nm",
				"draw_bank_cd",
				"draw_branch_cd",
				"endrsr",
				"accptr",
				"note_amt",
				"cur_cd",
				"pay_act_no",
				"pay_act_seq",
				"note_adv_pay_act_no",
				"note_adv_pay_act_seq",
				"a_imp_flg",
				"note_sub_char1",
				"note_sub_char2",
				"note_sub_char3"
			},
			{
				$adv_pay_act_no,
				$adv_pay_act_seq,
				$adv_pay_act_rev,
				$slip_sts_typ,
				$psppl_cd,
				$bsppl_cd,
				$bsppl_dpt_cd,
				$bd_dpt_cd,
				$pay_dpt_cd,
				$wg_cd,
				$pay_usr_cd,
				$pay_act_dt,
				$ac_dt,
				$ac_ym,
				$trd_cur_cd,
				$base_cur_cd,
				$xrate_cd,
				$xrate,
				$ap_sttl_cd,
				$ap_sttl_typ,
				$ac_rsn_cd,
				$com_paid_ap_sttl_cd,
				$com_paid_ap_sttl_typ,
				$com_paid_ac_rsn_cd,
				$trd_cur_com_paid_tax_cd,
				$bank_ac_cd,
				$pay_bank_ac_cd,
				$trd_cur_amt,
				$trd_cur_com_paid,
				$trd_cur_com_paid_tax_amt,
				$trd_cur_exc_com_paid,
				$trd_cur_setoff_tgt_amt,
				$trd_cur_setoff_schd_amt,
				$trd_cur_setoff_act_amt,
				$trd_cur_not_proc_bal,
				$base_cur_amt,
				$base_cur_com_paid,
				$base_cur_com_paid_tax_amt,
				$base_cur_exc_com_paid,
				$base_cur_setoff_tgt_amt,
				$pay_ntc_adv_pay_flg,
				$trd_rmrks,
				$intr_rmrks,
				$sub_char1,
				$sub_char2,
				$sub_char3,
				$pay_note_mng_no,
				$pay_note_mng_seq,
				$note_slip_sts_typ,
				$note_no,
				$note_typ,
				$note_rsn_cd,
				$draw_dt,
				$due_dt,
				$note_days,
				$drawer_nm,
				$draw_bank_cd,
				$draw_branch_cd,
				$endrsr,
				$accptr,
				$note_amt,
				$cur_cd,
				$pay_act_no,
				$pay_act_seq,
				$note_adv_pay_act_no,
				$note_adv_pay_act_seq,
				$a_imp_flg,
				$note_sub_char1,
				$note_sub_char2,
				$note_sub_char3
			}
		}
	);

	/** 項目属性情報のグループ[REQ_UPD_CNT_CHK]のキー定数 */
	public static final String $$REQ_UPD_CNT_CHK = "REQ_UPD_CNT_CHK";
	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";
	/** 項目属性情報のグループ[CHK_NUM]のキー定数 */
	public static final String $$CHK_NUM = "CHK_NUM";
	/** 項目属性情報のグループ[SMALL_LARGE]のキー定数 */
	public static final String $$SMALL_LARGE = "SMALL_LARGE";
	/** 項目属性情報のグループ[CHK_DT]のキー定数 */
	public static final String $$CHK_DT = "CHK_DT";
	/** 項目属性情報のグループ[BEFORE_AFTER]のキー定数 */
	public static final String $$BEFORE_AFTER = "BEFORE_AFTER";
	/** 項目属性情報のグループ[CHK_PTN]のキー定数 */
	public static final String $$CHK_PTN = "CHK_PTN";
	/** 項目属性情報のグループ[DUPLICATE]のキー定数 */
	public static final String $$DUPLICATE = "DUPLICATE";
	/** 項目属性情報のグループ[TOO_MANY_INPUTS]のキー定数 */
	public static final String $$TOO_MANY_INPUTS = "TOO_MANY_INPUTS";
	/** 項目属性情報のグループ[AT_LEAST_ONE]のキー定数 */
	public static final String $$AT_LEAST_ONE = "AT_LEAST_ONE";
	/** 項目属性情報のグループ[ONLY_ONE_INPUT]のキー定数 */
	public static final String $$ONLY_ONE_INPUT = "ONLY_ONE_INPUT";
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
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$apa + ".base_cur_cd", "MS.MSUDL5010"}	// apa.base_cur_cd
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
				{$apa + ".xrate", "positive"},	// apa.xrate
				{$apa + ".trd_cur_amt", "positive"}	// apa.trd_cur_amt
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_DT, new MCExtList(
			new String[][]{
				{$apa + ".pay_act_dt", "bfToday"},	// apa.pay_act_dt
				{$apa + ".ac_dt", "bfToday"},	// apa.ac_dt
				{$can_ac_dt, "bfToday"}	// can_ac_dt
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
				{$pn + ".draw_dt", "a:BF"},	// pn.draw_dt
				{$pn + ".due_dt", "a:AF"}	// pn.due_dt
			}
		)),
		new MCExtMap.Entry($$CHK_PTN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DUPLICATE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$TOO_MANY_INPUTS, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$AT_LEAST_ONE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$ONLY_ONE_INPUT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$apa + ".psppl_cd", "MA.MAUAL0010.Bp"},	// apa.psppl_cd
				{$apa + ".bsppl_cd", "MA.MAUAL0010.Bp"},	// apa.bsppl_cd
				{$apa + ".bsppl_dpt_cd", "MA.MAUAL0010.Dpt"},	// apa.bsppl_dpt_cd
				{$apa + ".bd_dpt_cd", "MA.MAUAL0010.Dpt"},	// apa.bd_dpt_cd
				{$apa + ".pay_dpt_cd", "MA.MAUAL0010.Dpt"},	// apa.pay_dpt_cd
				{$apa + ".pay_usr_cd", "MA.MAUAL0010.Usr"},	// apa.pay_usr_cd
				{$apa + ".trd_cur_cd", "MA.MAUAL0010.Cur"},	// apa.trd_cur_cd
				{$apa + ".ap_sttl_cd", "MA.MAUAL0010.ApSttl"},	// apa.ap_sttl_cd
				{$apa + ".com_paid_ap_sttl_cd", "MA.MAUAL0010.ApSttl"},	// apa.com_paid_ap_sttl_cd
				{$apa + ".trd_cur_com_paid_tax_cd", "MA.MAUAL0010.Tax"},	// apa.trd_cur_com_paid_tax_cd
				{$apa + ".bank_ac_cd", "MA.MAUAL0010.IntBankAc"},	// apa.bank_ac_cd
				{$apa + ".pay_bank_ac_cd", "MA.MAUAL0010.ExtBankAc"},	// apa.pay_bank_ac_cd
				{$pn + ".note_rsn_cd", "MA.MAUAL0010.NoteRsn"},	// pn.note_rsn_cd
				{$pn + ".draw_bank_cd", "MA.MAUAL0010.Bank"},	// pn.draw_bank_cd
				{$pn + ".draw_branch_cd", "MA.MAUAL0010.BankBranch"}	// pn.draw_branch_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$apa + ".psppl_cd", "note_days_lmt"},	// apa.psppl_cd
				{$apa + ".bsppl_cd", "psppl_cd"},	// apa.bsppl_cd
				{$apa + ".pay_dpt_cd", "wg_cd"},	// apa.pay_dpt_cd
				{$apa + ".trd_cur_cd", "trd_cur_amt_dec_place"},	// apa.trd_cur_cd
				{$apa + ".ap_sttl_cd", "ap_sttl_typ;ac_rsn_cd"},	// apa.ap_sttl_cd
				{$apa + ".com_paid_ap_sttl_cd", "com_paid_ap_sttl_typ;com_paid_ac_rsn_cd"},	// apa.com_paid_ap_sttl_cd
				{$apa + ".trd_cur_com_paid_tax_cd", "trd_cur_com_paid_tax_rate"}	// apa.trd_cur_com_paid_tax_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$apa + ".psppl_cd", "note_days"},	// apa.psppl_cd
				{$apa + ".trd_cur_cd", "amt_dec_place"},	// apa.trd_cur_cd
				{$apa + ".ap_sttl_cd", "ap_sttl_typ;ac_rsn_cd"},	// apa.ap_sttl_cd
				{$apa + ".com_paid_ap_sttl_cd", "ap_sttl_typ;ac_rsn_cd"},	// apa.com_paid_ap_sttl_cd
				{$apa + ".trd_cur_com_paid_tax_cd", "tax_rate"}	// apa.trd_cur_com_paid_tax_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$apa + ".psppl_cd", "MAC_BP_IS_SRCH_TYP.PSPPL"},	// apa.psppl_cd
				{$apa + ".bsppl_cd", "MAC_BP_IS_SRCH_TYP.BSPPL"},	// apa.bsppl_cd
				{$apa + ".bsppl_dpt_cd", "ac_dt;MAC_DPT_IS_SRCH_TYP.AP"},	// apa.bsppl_dpt_cd
				{$apa + ".bd_dpt_cd", "ac_dt;MAC_DPT_IS_SRCH_TYP.ARAPBD"},	// apa.bd_dpt_cd
				{$apa + ".pay_dpt_cd", "ac_dt;MAC_DPT_IS_SRCH_TYP.AP;pay_usr_cd"},	// apa.pay_dpt_cd
				{$apa + ".trd_cur_com_paid_tax_cd", "true;true"},	// apa.trd_cur_com_paid_tax_cd
				{$pn + ".draw_branch_cd", "draw_bank_cd"}	// pn.draw_branch_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$apa + ".psppl_cd", "bp_is_srch_typ"},	// apa.psppl_cd
				{$apa + ".bsppl_cd", "bp_is_srch_typ"},	// apa.bsppl_cd
				{$apa + ".bsppl_dpt_cd", "dt;dpt_is_srch_typ"},	// apa.bsppl_dpt_cd
				{$apa + ".bd_dpt_cd", "dt;dpt_is_srch_typ"},	// apa.bd_dpt_cd
				{$apa + ".pay_dpt_cd", "dt;dpt_is_srch_typ;usr_cd"},	// apa.pay_dpt_cd
				{$apa + ".trd_cur_com_paid_tax_cd", "inc_tax_flg;purc_flg"},	// apa.trd_cur_com_paid_tax_cd
				{$pn + ".draw_branch_cd", "bank_cd"}	// pn.draw_branch_cd
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$pn + ".note_typ", "MAC_NOTE_TYP"}	// pn.note_typ
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
	protected AdvPay_Chk01_HdrR_MC_A(ConstMetaList<? extends AdvPay_Chk01_HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public AdvPay_Chk01_HdrR clone() {
		return (AdvPay_Chk01_HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public AdvPay_Chk01_HdrR createInstance() {
		return (AdvPay_Chk01_HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public AdvPay_Chk01_HdrR getValues(String... names) {
		return (AdvPay_Chk01_HdrR) super.getValues(names);
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
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 1, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 1, $data_crud_typ, value);
	}


	/**
	 * Notes payable data update type 支払手形データ更新区分.<p>
	 *
	 */
	public String note_data_crud_typ() {
		return getConstString(offset + 2, $note_data_crud_typ);
	}

	/**
	 * Notes payable data update type 支払手形データ更新区分.<p>
	 *
	 */
	public void note_data_crud_typ(String value) {
		setConstString(offset + 2, $note_data_crud_typ, value);
	}


	public mcframe.serverMS.dbc.MST_ADV_PAY_ACT_R apa(){
		return (mcframe.serverMS.dbc.MST_ADV_PAY_ACT_R) getConstInnerRow(offset + 3, $apa);
	}
	
	public void apa(mcframe.serverMS.dbc.MST_ADV_PAY_ACT_R row){
		setConstInnerRow(offset + 3, $apa, row);
	}


	/**
	 * Fee tax rate 手数料税率.<p>
	 *
	 */
	public MCNumber trd_cur_com_paid_tax_rate() {
		return getConstNumber(offset + 4, $trd_cur_com_paid_tax_rate);
	}

	/**
	 * Fee tax rate 手数料税率.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_rate(MCNumber value) {
		setConstNumber(offset + 4, $trd_cur_com_paid_tax_rate, value);
	}

	/**
	 * Fee tax rate 手数料税率.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_rate(int value) {
		setConstNumber(offset + 4, $trd_cur_com_paid_tax_rate, value);
	}

	/**
	 * Fee tax rate 手数料税率.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_rate(long value) {
		setConstNumber(offset + 4, $trd_cur_com_paid_tax_rate, value);
	}

	/**
	 * Fee tax rate 手数料税率.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_rate(float value) {
		setConstNumber(offset + 4, $trd_cur_com_paid_tax_rate, value);
	}

	/**
	 * Fee tax rate 手数料税率.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_rate(double value) {
		setConstNumber(offset + 4, $trd_cur_com_paid_tax_rate, value);
	}


	public mcframe.serverMS.dbc.MST_PAY_NOTE_R pn(){
		return (mcframe.serverMS.dbc.MST_PAY_NOTE_R) getConstInnerRow(offset + 5, $pn);
	}
	
	public void pn(mcframe.serverMS.dbc.MST_PAY_NOTE_R row){
		setConstInnerRow(offset + 5, $pn, row);
	}


	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_cur_amt_dec_place() {
		return getConstNumber(offset + 6, $trd_cur_amt_dec_place);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 6, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(int value) {
		setConstNumber(offset + 6, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(long value) {
		setConstNumber(offset + 6, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(float value) {
		setConstNumber(offset + 6, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(double value) {
		setConstNumber(offset + 6, $trd_cur_amt_dec_place, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber adv_pay_upd_cntr() {
		return getConstNumber(offset + 7, $adv_pay_upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void adv_pay_upd_cntr(MCNumber value) {
		setConstNumber(offset + 7, $adv_pay_upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void adv_pay_upd_cntr(int value) {
		setConstNumber(offset + 7, $adv_pay_upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void adv_pay_upd_cntr(long value) {
		setConstNumber(offset + 7, $adv_pay_upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void adv_pay_upd_cntr(float value) {
		setConstNumber(offset + 7, $adv_pay_upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void adv_pay_upd_cntr(double value) {
		setConstNumber(offset + 7, $adv_pay_upd_cntr, value);
	}


	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public MCDate can_ac_dt() {
		return getConstDate(offset + 8, $can_ac_dt);
	}

	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public void can_ac_dt(MCDate value) {
		setConstDate(offset + 8, $can_ac_dt, value);
	}


	/**
	 * Note sight upper limit 手形サイト上限.<p>
	 *
	 */
	public MCNumber note_days_lmt() {
		return getConstNumber(offset + 9, $note_days_lmt);
	}

	/**
	 * Note sight upper limit 手形サイト上限.<p>
	 *
	 */
	public void note_days_lmt(MCNumber value) {
		setConstNumber(offset + 9, $note_days_lmt, value);
	}

	/**
	 * Note sight upper limit 手形サイト上限.<p>
	 *
	 */
	public void note_days_lmt(int value) {
		setConstNumber(offset + 9, $note_days_lmt, value);
	}

	/**
	 * Note sight upper limit 手形サイト上限.<p>
	 *
	 */
	public void note_days_lmt(long value) {
		setConstNumber(offset + 9, $note_days_lmt, value);
	}

	/**
	 * Note sight upper limit 手形サイト上限.<p>
	 *
	 */
	public void note_days_lmt(float value) {
		setConstNumber(offset + 9, $note_days_lmt, value);
	}

	/**
	 * Note sight upper limit 手形サイト上限.<p>
	 *
	 */
	public void note_days_lmt(double value) {
		setConstNumber(offset + 9, $note_days_lmt, value);
	}


	/**
	 * Original advance payment result sequence number 元前渡金支払実績連番.<p>
	 *
	 */
	public MCNumber bef_adv_pay_act_seq() {
		return getConstNumber(offset + 10, $bef_adv_pay_act_seq);
	}

	/**
	 * Original advance payment result sequence number 元前渡金支払実績連番.<p>
	 *
	 */
	public void bef_adv_pay_act_seq(MCNumber value) {
		setConstNumber(offset + 10, $bef_adv_pay_act_seq, value);
	}

	/**
	 * Original advance payment result sequence number 元前渡金支払実績連番.<p>
	 *
	 */
	public void bef_adv_pay_act_seq(int value) {
		setConstNumber(offset + 10, $bef_adv_pay_act_seq, value);
	}

	/**
	 * Original advance payment result sequence number 元前渡金支払実績連番.<p>
	 *
	 */
	public void bef_adv_pay_act_seq(long value) {
		setConstNumber(offset + 10, $bef_adv_pay_act_seq, value);
	}

	/**
	 * Original advance payment result sequence number 元前渡金支払実績連番.<p>
	 *
	 */
	public void bef_adv_pay_act_seq(float value) {
		setConstNumber(offset + 10, $bef_adv_pay_act_seq, value);
	}

	/**
	 * Original advance payment result sequence number 元前渡金支払実績連番.<p>
	 *
	 */
	public void bef_adv_pay_act_seq(double value) {
		setConstNumber(offset + 10, $bef_adv_pay_act_seq, value);
	}


	/**
	 * Cancellation slip advance payment result sequence number 取消伝票前渡金支払実績連番.<p>
	 *
	 */
	public MCNumber can_adv_pay_act_seq() {
		return getConstNumber(offset + 11, $can_adv_pay_act_seq);
	}

	/**
	 * Cancellation slip advance payment result sequence number 取消伝票前渡金支払実績連番.<p>
	 *
	 */
	public void can_adv_pay_act_seq(MCNumber value) {
		setConstNumber(offset + 11, $can_adv_pay_act_seq, value);
	}

	/**
	 * Cancellation slip advance payment result sequence number 取消伝票前渡金支払実績連番.<p>
	 *
	 */
	public void can_adv_pay_act_seq(int value) {
		setConstNumber(offset + 11, $can_adv_pay_act_seq, value);
	}

	/**
	 * Cancellation slip advance payment result sequence number 取消伝票前渡金支払実績連番.<p>
	 *
	 */
	public void can_adv_pay_act_seq(long value) {
		setConstNumber(offset + 11, $can_adv_pay_act_seq, value);
	}

	/**
	 * Cancellation slip advance payment result sequence number 取消伝票前渡金支払実績連番.<p>
	 *
	 */
	public void can_adv_pay_act_seq(float value) {
		setConstNumber(offset + 11, $can_adv_pay_act_seq, value);
	}

	/**
	 * Cancellation slip advance payment result sequence number 取消伝票前渡金支払実績連番.<p>
	 *
	 */
	public void can_adv_pay_act_seq(double value) {
		setConstNumber(offset + 11, $can_adv_pay_act_seq, value);
	}


	/**
	 * Cd. of dept. in charge of scheduled payee after conversion 変換後支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public String conv_bsppl_dpt_cd() {
		return getConstString(offset + 12, $conv_bsppl_dpt_cd);
	}

	/**
	 * Cd. of dept. in charge of scheduled payee after conversion 変換後支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public void conv_bsppl_dpt_cd(String value) {
		setConstString(offset + 12, $conv_bsppl_dpt_cd, value);
	}


	/**
	 * Charged dept. cd. after conversion 変換後負担部門ＣＤ.<p>
	 *
	 */
	public String conv_bd_dpt_cd() {
		return getConstString(offset + 13, $conv_bd_dpt_cd);
	}

	/**
	 * Charged dept. cd. after conversion 変換後負担部門ＣＤ.<p>
	 *
	 */
	public void conv_bd_dpt_cd(String value) {
		setConstString(offset + 13, $conv_bd_dpt_cd, value);
	}


	/**
	 * Payment dept. cd. After conversion 変換後支払部門ＣＤ.<p>
	 *
	 */
	public String conv_pay_dpt_cd() {
		return getConstString(offset + 14, $conv_pay_dpt_cd);
	}

	/**
	 * Payment dept. cd. After conversion 変換後支払部門ＣＤ.<p>
	 *
	 */
	public void conv_pay_dpt_cd(String value) {
		setConstString(offset + 14, $conv_pay_dpt_cd, value);
	}


	/**
	 * WG cd. After conversion 変換後ワーキンググループＣＤ.<p>
	 *
	 */
	public String conv_wg_cd() {
		return getConstString(offset + 15, $conv_wg_cd);
	}

	/**
	 * WG cd. After conversion 変換後ワーキンググループＣＤ.<p>
	 *
	 */
	public void conv_wg_cd(String value) {
		setConstString(offset + 15, $conv_wg_cd, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 16, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 16, $err_flg, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($note_data_crud_typ.equalsIgnoreCase(name)) {
			return note_data_crud_typ();
		}
		if ($conv_bsppl_dpt_cd.equalsIgnoreCase(name)) {
			return conv_bsppl_dpt_cd();
		}
		if ($conv_bd_dpt_cd.equalsIgnoreCase(name)) {
			return conv_bd_dpt_cd();
		}
		if ($conv_pay_dpt_cd.equalsIgnoreCase(name)) {
			return conv_pay_dpt_cd();
		}
		if ($conv_wg_cd.equalsIgnoreCase(name)) {
			return conv_wg_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			return trd_cur_com_paid_tax_rate();
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_amt_dec_place();
		}
		if ($adv_pay_upd_cntr.equalsIgnoreCase(name)) {
			return adv_pay_upd_cntr();
		}
		if ($note_days_lmt.equalsIgnoreCase(name)) {
			return note_days_lmt();
		}
		if ($bef_adv_pay_act_seq.equalsIgnoreCase(name)) {
			return bef_adv_pay_act_seq();
		}
		if ($can_adv_pay_act_seq.equalsIgnoreCase(name)) {
			return can_adv_pay_act_seq();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
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
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($note_data_crud_typ.equalsIgnoreCase(name)) {
			return note_data_crud_typ();
		}
		if ($conv_bsppl_dpt_cd.equalsIgnoreCase(name)) {
			return conv_bsppl_dpt_cd();
		}
		if ($conv_bd_dpt_cd.equalsIgnoreCase(name)) {
			return conv_bd_dpt_cd();
		}
		if ($conv_pay_dpt_cd.equalsIgnoreCase(name)) {
			return conv_pay_dpt_cd();
		}
		if ($conv_wg_cd.equalsIgnoreCase(name)) {
			return conv_wg_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			return trd_cur_com_paid_tax_rate();
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_amt_dec_place();
		}
		if ($adv_pay_upd_cntr.equalsIgnoreCase(name)) {
			return adv_pay_upd_cntr();
		}
		if ($note_days_lmt.equalsIgnoreCase(name)) {
			return note_days_lmt();
		}
		if ($bef_adv_pay_act_seq.equalsIgnoreCase(name)) {
			return bef_adv_pay_act_seq();
		}
		if ($can_adv_pay_act_seq.equalsIgnoreCase(name)) {
			return can_adv_pay_act_seq();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
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
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($note_data_crud_typ.equalsIgnoreCase(name)) {
			note_data_crud_typ(value);
			return;
		}
		if ($conv_bsppl_dpt_cd.equalsIgnoreCase(name)) {
			conv_bsppl_dpt_cd(value);
			return;
		}
		if ($conv_bd_dpt_cd.equalsIgnoreCase(name)) {
			conv_bd_dpt_cd(value);
			return;
		}
		if ($conv_pay_dpt_cd.equalsIgnoreCase(name)) {
			conv_pay_dpt_cd(value);
			return;
		}
		if ($conv_wg_cd.equalsIgnoreCase(name)) {
			conv_wg_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($adv_pay_upd_cntr.equalsIgnoreCase(name)) {
			adv_pay_upd_cntr(value);
			return;
		}
		if ($note_days_lmt.equalsIgnoreCase(name)) {
			note_days_lmt(value);
			return;
		}
		if ($bef_adv_pay_act_seq.equalsIgnoreCase(name)) {
			bef_adv_pay_act_seq(value);
			return;
		}
		if ($can_adv_pay_act_seq.equalsIgnoreCase(name)) {
			can_adv_pay_act_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($adv_pay_upd_cntr.equalsIgnoreCase(name)) {
			adv_pay_upd_cntr(value);
			return;
		}
		if ($note_days_lmt.equalsIgnoreCase(name)) {
			note_days_lmt(value);
			return;
		}
		if ($bef_adv_pay_act_seq.equalsIgnoreCase(name)) {
			bef_adv_pay_act_seq(value);
			return;
		}
		if ($can_adv_pay_act_seq.equalsIgnoreCase(name)) {
			can_adv_pay_act_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($adv_pay_upd_cntr.equalsIgnoreCase(name)) {
			adv_pay_upd_cntr(value);
			return;
		}
		if ($note_days_lmt.equalsIgnoreCase(name)) {
			note_days_lmt(value);
			return;
		}
		if ($bef_adv_pay_act_seq.equalsIgnoreCase(name)) {
			bef_adv_pay_act_seq(value);
			return;
		}
		if ($can_adv_pay_act_seq.equalsIgnoreCase(name)) {
			can_adv_pay_act_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($adv_pay_upd_cntr.equalsIgnoreCase(name)) {
			adv_pay_upd_cntr(value);
			return;
		}
		if ($note_days_lmt.equalsIgnoreCase(name)) {
			note_days_lmt(value);
			return;
		}
		if ($bef_adv_pay_act_seq.equalsIgnoreCase(name)) {
			bef_adv_pay_act_seq(value);
			return;
		}
		if ($can_adv_pay_act_seq.equalsIgnoreCase(name)) {
			can_adv_pay_act_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($adv_pay_upd_cntr.equalsIgnoreCase(name)) {
			adv_pay_upd_cntr(value);
			return;
		}
		if ($note_days_lmt.equalsIgnoreCase(name)) {
			note_days_lmt(value);
			return;
		}
		if ($bef_adv_pay_act_seq.equalsIgnoreCase(name)) {
			bef_adv_pay_act_seq(value);
			return;
		}
		if ($can_adv_pay_act_seq.equalsIgnoreCase(name)) {
			can_adv_pay_act_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			can_ac_dt(value);
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
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($note_data_crud_typ.equalsIgnoreCase(name)) {
			note_data_crud_typ(value);
			return;
		}
		if ($conv_bsppl_dpt_cd.equalsIgnoreCase(name)) {
			conv_bsppl_dpt_cd(value);
			return;
		}
		if ($conv_bd_dpt_cd.equalsIgnoreCase(name)) {
			conv_bd_dpt_cd(value);
			return;
		}
		if ($conv_pay_dpt_cd.equalsIgnoreCase(name)) {
			conv_pay_dpt_cd(value);
			return;
		}
		if ($conv_wg_cd.equalsIgnoreCase(name)) {
			conv_wg_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($adv_pay_upd_cntr.equalsIgnoreCase(name)) {
			adv_pay_upd_cntr(value);
			return;
		}
		if ($note_days_lmt.equalsIgnoreCase(name)) {
			note_days_lmt(value);
			return;
		}
		if ($bef_adv_pay_act_seq.equalsIgnoreCase(name)) {
			bef_adv_pay_act_seq(value);
			return;
		}
		if ($can_adv_pay_act_seq.equalsIgnoreCase(name)) {
			can_adv_pay_act_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($adv_pay_upd_cntr.equalsIgnoreCase(name)) {
			adv_pay_upd_cntr(value);
			return;
		}
		if ($note_days_lmt.equalsIgnoreCase(name)) {
			note_days_lmt(value);
			return;
		}
		if ($bef_adv_pay_act_seq.equalsIgnoreCase(name)) {
			bef_adv_pay_act_seq(value);
			return;
		}
		if ($can_adv_pay_act_seq.equalsIgnoreCase(name)) {
			can_adv_pay_act_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($adv_pay_upd_cntr.equalsIgnoreCase(name)) {
			adv_pay_upd_cntr(value);
			return;
		}
		if ($note_days_lmt.equalsIgnoreCase(name)) {
			note_days_lmt(value);
			return;
		}
		if ($bef_adv_pay_act_seq.equalsIgnoreCase(name)) {
			bef_adv_pay_act_seq(value);
			return;
		}
		if ($can_adv_pay_act_seq.equalsIgnoreCase(name)) {
			can_adv_pay_act_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($adv_pay_upd_cntr.equalsIgnoreCase(name)) {
			adv_pay_upd_cntr(value);
			return;
		}
		if ($note_days_lmt.equalsIgnoreCase(name)) {
			note_days_lmt(value);
			return;
		}
		if ($bef_adv_pay_act_seq.equalsIgnoreCase(name)) {
			bef_adv_pay_act_seq(value);
			return;
		}
		if ($can_adv_pay_act_seq.equalsIgnoreCase(name)) {
			can_adv_pay_act_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($adv_pay_upd_cntr.equalsIgnoreCase(name)) {
			adv_pay_upd_cntr(value);
			return;
		}
		if ($note_days_lmt.equalsIgnoreCase(name)) {
			note_days_lmt(value);
			return;
		}
		if ($bef_adv_pay_act_seq.equalsIgnoreCase(name)) {
			bef_adv_pay_act_seq(value);
			return;
		}
		if ($can_adv_pay_act_seq.equalsIgnoreCase(name)) {
			can_adv_pay_act_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			can_ac_dt(value);
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

	public MCRow getInnerRow(String name) {
		if ($apa.equalsIgnoreCase(name)) {
			return apa();
		}
		if ($pn.equalsIgnoreCase(name)) {
			return pn();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($apa.equalsIgnoreCase(name)) {
			apa(
				((MCContainerMeta) apa_META).castInnerRow(mcframe.serverMS.dbc.MST_ADV_PAY_ACT_R.class, value)
			);
			return;
		}
		if ($pn.equalsIgnoreCase(name)) {
			pn(
				((MCContainerMeta) pn_META).castInnerRow(mcframe.serverMS.dbc.MST_PAY_NOTE_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Advance payment result No. 前渡金実績ＮＯ.<p>
	 *
	 */
	public String adv_pay_act_no() {
		return apa().adv_pay_act_no();
	}

	/**
	 * Advance payment result No. 前渡金実績ＮＯ.<p>
	 *
	 */
	public void adv_pay_act_no(String value) {
		apa().adv_pay_act_no(value);
	}

	/**
	 * Advance payment result sequence number 前渡金実績連番.<p>
	 *
	 */
	public MCNumber adv_pay_act_seq() {
		return apa().adv_pay_act_seq();
	}

	/**
	 * Advance payment result sequence number 前渡金実績連番.<p>
	 *
	 */
	public void adv_pay_act_seq(MCNumber value) {
		apa().adv_pay_act_seq(value);
	}

	/**
	 * Advance payment result sequence number 前渡金実績連番.<p>
	 *
	 */
	public void adv_pay_act_seq(int value) {
		apa().adv_pay_act_seq(value);
	}

	/**
	 * Advance payment result sequence number 前渡金実績連番.<p>
	 *
	 */
	public void adv_pay_act_seq(long value) {
		apa().adv_pay_act_seq(value);
	}

	/**
	 * Advance payment result sequence number 前渡金実績連番.<p>
	 *
	 */
	public void adv_pay_act_seq(float value) {
		apa().adv_pay_act_seq(value);
	}

	/**
	 * Advance payment result sequence number 前渡金実績連番.<p>
	 *
	 */
	public void adv_pay_act_seq(double value) {
		apa().adv_pay_act_seq(value);
	}

	/**
	 * Advance payment result revision number 前渡金実績改訂番号.<p>
	 *
	 */
	public MCNumber adv_pay_act_rev() {
		return apa().adv_pay_act_rev();
	}

	/**
	 * Advance payment result revision number 前渡金実績改訂番号.<p>
	 *
	 */
	public void adv_pay_act_rev(MCNumber value) {
		apa().adv_pay_act_rev(value);
	}

	/**
	 * Advance payment result revision number 前渡金実績改訂番号.<p>
	 *
	 */
	public void adv_pay_act_rev(int value) {
		apa().adv_pay_act_rev(value);
	}

	/**
	 * Advance payment result revision number 前渡金実績改訂番号.<p>
	 *
	 */
	public void adv_pay_act_rev(long value) {
		apa().adv_pay_act_rev(value);
	}

	/**
	 * Advance payment result revision number 前渡金実績改訂番号.<p>
	 *
	 */
	public void adv_pay_act_rev(float value) {
		apa().adv_pay_act_rev(value);
	}

	/**
	 * Advance payment result revision number 前渡金実績改訂番号.<p>
	 *
	 */
	public void adv_pay_act_rev(double value) {
		apa().adv_pay_act_rev(value);
	}

	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public String slip_sts_typ() {
		return apa().slip_sts_typ();
	}

	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public void slip_sts_typ(String value) {
		apa().slip_sts_typ(value);
	}

	/**
	 * Payee cd. 支払先ＣＤ.<p>
	 *
	 */
	public String psppl_cd() {
		return apa().psppl_cd();
	}

	/**
	 * Payee cd. 支払先ＣＤ.<p>
	 *
	 */
	public void psppl_cd(String value) {
		apa().psppl_cd(value);
	}

	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public String bsppl_cd() {
		return apa().bsppl_cd();
	}

	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public void bsppl_cd(String value) {
		apa().bsppl_cd(value);
	}

	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public String bsppl_dpt_cd() {
		return apa().bsppl_dpt_cd();
	}

	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public void bsppl_dpt_cd(String value) {
		apa().bsppl_dpt_cd(value);
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public String bd_dpt_cd() {
		return apa().bd_dpt_cd();
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		apa().bd_dpt_cd(value);
	}

	/**
	 * Payment dept. cd. 支払部門ＣＤ.<p>
	 *
	 */
	public String pay_dpt_cd() {
		return apa().pay_dpt_cd();
	}

	/**
	 * Payment dept. cd. 支払部門ＣＤ.<p>
	 *
	 */
	public void pay_dpt_cd(String value) {
		apa().pay_dpt_cd(value);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return apa().wg_cd();
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		apa().wg_cd(value);
	}

	/**
	 * Payment PIC cd. 支払担当者ＣＤ.<p>
	 *
	 */
	public String pay_usr_cd() {
		return apa().pay_usr_cd();
	}

	/**
	 * Payment PIC cd. 支払担当者ＣＤ.<p>
	 *
	 */
	public void pay_usr_cd(String value) {
		apa().pay_usr_cd(value);
	}

	/**
	 * Actual payment date 支払実績日.<p>
	 *
	 */
	public MCDate pay_act_dt() {
		return apa().pay_act_dt();
	}

	/**
	 * Actual payment date 支払実績日.<p>
	 *
	 */
	public void pay_act_dt(MCDate value) {
		apa().pay_act_dt(value);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return apa().ac_dt();
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		apa().ac_dt(value);
	}

	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public MCDate ac_ym() {
		return apa().ac_ym();
	}

	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public void ac_ym(MCDate value) {
		apa().ac_ym(value);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return apa().trd_cur_cd();
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		apa().trd_cur_cd(value);
	}

	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public String base_cur_cd() {
		return apa().base_cur_cd();
	}

	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public void base_cur_cd(String value) {
		apa().base_cur_cd(value);
	}

	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public String xrate_cd() {
		return apa().xrate_cd();
	}

	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public void xrate_cd(String value) {
		apa().xrate_cd(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCNumber xrate() {
		return apa().xrate();
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		apa().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(int value) {
		apa().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(long value) {
		apa().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(float value) {
		apa().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(double value) {
		apa().xrate(value);
	}

	/**
	 * AP settlement method cd. 債務決済方法ＣＤ.<p>
	 *
	 */
	public String ap_sttl_cd() {
		return apa().ap_sttl_cd();
	}

	/**
	 * AP settlement method cd. 債務決済方法ＣＤ.<p>
	 *
	 */
	public void ap_sttl_cd(String value) {
		apa().ap_sttl_cd(value);
	}

	/**
	 * AP settlement type 債務決済区分.<p>
	 *
	 */
	public String ap_sttl_typ() {
		return apa().ap_sttl_typ();
	}

	/**
	 * AP settlement type 債務決済区分.<p>
	 *
	 */
	public void ap_sttl_typ(String value) {
		apa().ap_sttl_typ(value);
	}

	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public String ac_rsn_cd() {
		return apa().ac_rsn_cd();
	}

	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public void ac_rsn_cd(String value) {
		apa().ac_rsn_cd(value);
	}

	/**
	 * Fee AP settlement method cd. 手数料債務決済方法ＣＤ.<p>
	 *
	 */
	public String com_paid_ap_sttl_cd() {
		return apa().com_paid_ap_sttl_cd();
	}

	/**
	 * Fee AP settlement method cd. 手数料債務決済方法ＣＤ.<p>
	 *
	 */
	public void com_paid_ap_sttl_cd(String value) {
		apa().com_paid_ap_sttl_cd(value);
	}

	/**
	 * Fee AP settlement type 手数料債務決済区分.<p>
	 *
	 */
	public String com_paid_ap_sttl_typ() {
		return apa().com_paid_ap_sttl_typ();
	}

	/**
	 * Fee AP settlement type 手数料債務決済区分.<p>
	 *
	 */
	public void com_paid_ap_sttl_typ(String value) {
		apa().com_paid_ap_sttl_typ(value);
	}

	/**
	 * Fee accounting reason cd. 手数料会計理由ＣＤ.<p>
	 *
	 */
	public String com_paid_ac_rsn_cd() {
		return apa().com_paid_ac_rsn_cd();
	}

	/**
	 * Fee accounting reason cd. 手数料会計理由ＣＤ.<p>
	 *
	 */
	public void com_paid_ac_rsn_cd(String value) {
		apa().com_paid_ac_rsn_cd(value);
	}

	/**
	 * Fee tax cd. 手数料税ＣＤ.<p>
	 *
	 */
	public String trd_cur_com_paid_tax_cd() {
		return apa().trd_cur_com_paid_tax_cd();
	}

	/**
	 * Fee tax cd. 手数料税ＣＤ.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_cd(String value) {
		apa().trd_cur_com_paid_tax_cd(value);
	}

	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public String bank_ac_cd() {
		return apa().bank_ac_cd();
	}

	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public void bank_ac_cd(String value) {
		apa().bank_ac_cd(value);
	}

	/**
	 * Payee account cd. 支払先口座ＣＤ.<p>
	 *
	 */
	public String pay_bank_ac_cd() {
		return apa().pay_bank_ac_cd();
	}

	/**
	 * Payee account cd. 支払先口座ＣＤ.<p>
	 *
	 */
	public void pay_bank_ac_cd(String value) {
		apa().pay_bank_ac_cd(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return apa().trd_cur_amt();
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		apa().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		apa().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		apa().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		apa().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		apa().trd_cur_amt(value);
	}

	/**
	 * Fee amount (Transaction currency) 取引通貨手数料金額.<p>
	 *
	 */
	public MCNumber trd_cur_com_paid() {
		return apa().trd_cur_com_paid();
	}

	/**
	 * Fee amount (Transaction currency) 取引通貨手数料金額.<p>
	 *
	 */
	public void trd_cur_com_paid(MCNumber value) {
		apa().trd_cur_com_paid(value);
	}

	/**
	 * Fee amount (Transaction currency) 取引通貨手数料金額.<p>
	 *
	 */
	public void trd_cur_com_paid(int value) {
		apa().trd_cur_com_paid(value);
	}

	/**
	 * Fee amount (Transaction currency) 取引通貨手数料金額.<p>
	 *
	 */
	public void trd_cur_com_paid(long value) {
		apa().trd_cur_com_paid(value);
	}

	/**
	 * Fee amount (Transaction currency) 取引通貨手数料金額.<p>
	 *
	 */
	public void trd_cur_com_paid(float value) {
		apa().trd_cur_com_paid(value);
	}

	/**
	 * Fee amount (Transaction currency) 取引通貨手数料金額.<p>
	 *
	 */
	public void trd_cur_com_paid(double value) {
		apa().trd_cur_com_paid(value);
	}

	/**
	 * Fee tax amount (Transaction currency) 取引通貨手数料税額.<p>
	 *
	 */
	public MCNumber trd_cur_com_paid_tax_amt() {
		return apa().trd_cur_com_paid_tax_amt();
	}

	/**
	 * Fee tax amount (Transaction currency) 取引通貨手数料税額.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_amt(MCNumber value) {
		apa().trd_cur_com_paid_tax_amt(value);
	}

	/**
	 * Fee tax amount (Transaction currency) 取引通貨手数料税額.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_amt(int value) {
		apa().trd_cur_com_paid_tax_amt(value);
	}

	/**
	 * Fee tax amount (Transaction currency) 取引通貨手数料税額.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_amt(long value) {
		apa().trd_cur_com_paid_tax_amt(value);
	}

	/**
	 * Fee tax amount (Transaction currency) 取引通貨手数料税額.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_amt(float value) {
		apa().trd_cur_com_paid_tax_amt(value);
	}

	/**
	 * Fee tax amount (Transaction currency) 取引通貨手数料税額.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_amt(double value) {
		apa().trd_cur_com_paid_tax_amt(value);
	}

	/**
	 * Fee amount without tax (Transaction currency) 取引通貨手数料税抜額.<p>
	 *
	 */
	public MCNumber trd_cur_exc_com_paid() {
		return apa().trd_cur_exc_com_paid();
	}

	/**
	 * Fee amount without tax (Transaction currency) 取引通貨手数料税抜額.<p>
	 *
	 */
	public void trd_cur_exc_com_paid(MCNumber value) {
		apa().trd_cur_exc_com_paid(value);
	}

	/**
	 * Fee amount without tax (Transaction currency) 取引通貨手数料税抜額.<p>
	 *
	 */
	public void trd_cur_exc_com_paid(int value) {
		apa().trd_cur_exc_com_paid(value);
	}

	/**
	 * Fee amount without tax (Transaction currency) 取引通貨手数料税抜額.<p>
	 *
	 */
	public void trd_cur_exc_com_paid(long value) {
		apa().trd_cur_exc_com_paid(value);
	}

	/**
	 * Fee amount without tax (Transaction currency) 取引通貨手数料税抜額.<p>
	 *
	 */
	public void trd_cur_exc_com_paid(float value) {
		apa().trd_cur_exc_com_paid(value);
	}

	/**
	 * Fee amount without tax (Transaction currency) 取引通貨手数料税抜額.<p>
	 *
	 */
	public void trd_cur_exc_com_paid(double value) {
		apa().trd_cur_exc_com_paid(value);
	}

	/**
	 * Offset target amount (Transaction currency) 取引通貨相殺対象額.<p>
	 *
	 */
	public MCNumber trd_cur_setoff_tgt_amt() {
		return apa().trd_cur_setoff_tgt_amt();
	}

	/**
	 * Offset target amount (Transaction currency) 取引通貨相殺対象額.<p>
	 *
	 */
	public void trd_cur_setoff_tgt_amt(MCNumber value) {
		apa().trd_cur_setoff_tgt_amt(value);
	}

	/**
	 * Offset target amount (Transaction currency) 取引通貨相殺対象額.<p>
	 *
	 */
	public void trd_cur_setoff_tgt_amt(int value) {
		apa().trd_cur_setoff_tgt_amt(value);
	}

	/**
	 * Offset target amount (Transaction currency) 取引通貨相殺対象額.<p>
	 *
	 */
	public void trd_cur_setoff_tgt_amt(long value) {
		apa().trd_cur_setoff_tgt_amt(value);
	}

	/**
	 * Offset target amount (Transaction currency) 取引通貨相殺対象額.<p>
	 *
	 */
	public void trd_cur_setoff_tgt_amt(float value) {
		apa().trd_cur_setoff_tgt_amt(value);
	}

	/**
	 * Offset target amount (Transaction currency) 取引通貨相殺対象額.<p>
	 *
	 */
	public void trd_cur_setoff_tgt_amt(double value) {
		apa().trd_cur_setoff_tgt_amt(value);
	}

	/**
	 * Offset schedule amount (Transaction currency) 取引通貨相殺予定額.<p>
	 *
	 */
	public MCNumber trd_cur_setoff_schd_amt() {
		return apa().trd_cur_setoff_schd_amt();
	}

	/**
	 * Offset schedule amount (Transaction currency) 取引通貨相殺予定額.<p>
	 *
	 */
	public void trd_cur_setoff_schd_amt(MCNumber value) {
		apa().trd_cur_setoff_schd_amt(value);
	}

	/**
	 * Offset schedule amount (Transaction currency) 取引通貨相殺予定額.<p>
	 *
	 */
	public void trd_cur_setoff_schd_amt(int value) {
		apa().trd_cur_setoff_schd_amt(value);
	}

	/**
	 * Offset schedule amount (Transaction currency) 取引通貨相殺予定額.<p>
	 *
	 */
	public void trd_cur_setoff_schd_amt(long value) {
		apa().trd_cur_setoff_schd_amt(value);
	}

	/**
	 * Offset schedule amount (Transaction currency) 取引通貨相殺予定額.<p>
	 *
	 */
	public void trd_cur_setoff_schd_amt(float value) {
		apa().trd_cur_setoff_schd_amt(value);
	}

	/**
	 * Offset schedule amount (Transaction currency) 取引通貨相殺予定額.<p>
	 *
	 */
	public void trd_cur_setoff_schd_amt(double value) {
		apa().trd_cur_setoff_schd_amt(value);
	}

	/**
	 * Offset result amount (Transaction currency) 取引通貨相殺実績額.<p>
	 *
	 */
	public MCNumber trd_cur_setoff_act_amt() {
		return apa().trd_cur_setoff_act_amt();
	}

	/**
	 * Offset result amount (Transaction currency) 取引通貨相殺実績額.<p>
	 *
	 */
	public void trd_cur_setoff_act_amt(MCNumber value) {
		apa().trd_cur_setoff_act_amt(value);
	}

	/**
	 * Offset result amount (Transaction currency) 取引通貨相殺実績額.<p>
	 *
	 */
	public void trd_cur_setoff_act_amt(int value) {
		apa().trd_cur_setoff_act_amt(value);
	}

	/**
	 * Offset result amount (Transaction currency) 取引通貨相殺実績額.<p>
	 *
	 */
	public void trd_cur_setoff_act_amt(long value) {
		apa().trd_cur_setoff_act_amt(value);
	}

	/**
	 * Offset result amount (Transaction currency) 取引通貨相殺実績額.<p>
	 *
	 */
	public void trd_cur_setoff_act_amt(float value) {
		apa().trd_cur_setoff_act_amt(value);
	}

	/**
	 * Offset result amount (Transaction currency) 取引通貨相殺実績額.<p>
	 *
	 */
	public void trd_cur_setoff_act_amt(double value) {
		apa().trd_cur_setoff_act_amt(value);
	}

	/**
	 * Unreconciled balance (Transaction currency) 取引通貨未処理残高.<p>
	 *
	 */
	public MCNumber trd_cur_not_proc_bal() {
		return apa().trd_cur_not_proc_bal();
	}

	/**
	 * Unreconciled balance (Transaction currency) 取引通貨未処理残高.<p>
	 *
	 */
	public void trd_cur_not_proc_bal(MCNumber value) {
		apa().trd_cur_not_proc_bal(value);
	}

	/**
	 * Unreconciled balance (Transaction currency) 取引通貨未処理残高.<p>
	 *
	 */
	public void trd_cur_not_proc_bal(int value) {
		apa().trd_cur_not_proc_bal(value);
	}

	/**
	 * Unreconciled balance (Transaction currency) 取引通貨未処理残高.<p>
	 *
	 */
	public void trd_cur_not_proc_bal(long value) {
		apa().trd_cur_not_proc_bal(value);
	}

	/**
	 * Unreconciled balance (Transaction currency) 取引通貨未処理残高.<p>
	 *
	 */
	public void trd_cur_not_proc_bal(float value) {
		apa().trd_cur_not_proc_bal(value);
	}

	/**
	 * Unreconciled balance (Transaction currency) 取引通貨未処理残高.<p>
	 *
	 */
	public void trd_cur_not_proc_bal(double value) {
		apa().trd_cur_not_proc_bal(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public MCNumber base_cur_amt() {
		return apa().base_cur_amt();
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(MCNumber value) {
		apa().base_cur_amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(int value) {
		apa().base_cur_amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(long value) {
		apa().base_cur_amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(float value) {
		apa().base_cur_amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(double value) {
		apa().base_cur_amt(value);
	}

	/**
	 * Fee (Base currency) 基準通貨手数料金額.<p>
	 *
	 */
	public MCNumber base_cur_com_paid() {
		return apa().base_cur_com_paid();
	}

	/**
	 * Fee (Base currency) 基準通貨手数料金額.<p>
	 *
	 */
	public void base_cur_com_paid(MCNumber value) {
		apa().base_cur_com_paid(value);
	}

	/**
	 * Fee (Base currency) 基準通貨手数料金額.<p>
	 *
	 */
	public void base_cur_com_paid(int value) {
		apa().base_cur_com_paid(value);
	}

	/**
	 * Fee (Base currency) 基準通貨手数料金額.<p>
	 *
	 */
	public void base_cur_com_paid(long value) {
		apa().base_cur_com_paid(value);
	}

	/**
	 * Fee (Base currency) 基準通貨手数料金額.<p>
	 *
	 */
	public void base_cur_com_paid(float value) {
		apa().base_cur_com_paid(value);
	}

	/**
	 * Fee (Base currency) 基準通貨手数料金額.<p>
	 *
	 */
	public void base_cur_com_paid(double value) {
		apa().base_cur_com_paid(value);
	}

	/**
	 * Fee tax amount (Base currency) 基準通貨手数料税額.<p>
	 *
	 */
	public MCNumber base_cur_com_paid_tax_amt() {
		return apa().base_cur_com_paid_tax_amt();
	}

	/**
	 * Fee tax amount (Base currency) 基準通貨手数料税額.<p>
	 *
	 */
	public void base_cur_com_paid_tax_amt(MCNumber value) {
		apa().base_cur_com_paid_tax_amt(value);
	}

	/**
	 * Fee tax amount (Base currency) 基準通貨手数料税額.<p>
	 *
	 */
	public void base_cur_com_paid_tax_amt(int value) {
		apa().base_cur_com_paid_tax_amt(value);
	}

	/**
	 * Fee tax amount (Base currency) 基準通貨手数料税額.<p>
	 *
	 */
	public void base_cur_com_paid_tax_amt(long value) {
		apa().base_cur_com_paid_tax_amt(value);
	}

	/**
	 * Fee tax amount (Base currency) 基準通貨手数料税額.<p>
	 *
	 */
	public void base_cur_com_paid_tax_amt(float value) {
		apa().base_cur_com_paid_tax_amt(value);
	}

	/**
	 * Fee tax amount (Base currency) 基準通貨手数料税額.<p>
	 *
	 */
	public void base_cur_com_paid_tax_amt(double value) {
		apa().base_cur_com_paid_tax_amt(value);
	}

	/**
	 * Fee without tax (Base currency) 基準通貨手数料税抜額.<p>
	 *
	 */
	public MCNumber base_cur_exc_com_paid() {
		return apa().base_cur_exc_com_paid();
	}

	/**
	 * Fee without tax (Base currency) 基準通貨手数料税抜額.<p>
	 *
	 */
	public void base_cur_exc_com_paid(MCNumber value) {
		apa().base_cur_exc_com_paid(value);
	}

	/**
	 * Fee without tax (Base currency) 基準通貨手数料税抜額.<p>
	 *
	 */
	public void base_cur_exc_com_paid(int value) {
		apa().base_cur_exc_com_paid(value);
	}

	/**
	 * Fee without tax (Base currency) 基準通貨手数料税抜額.<p>
	 *
	 */
	public void base_cur_exc_com_paid(long value) {
		apa().base_cur_exc_com_paid(value);
	}

	/**
	 * Fee without tax (Base currency) 基準通貨手数料税抜額.<p>
	 *
	 */
	public void base_cur_exc_com_paid(float value) {
		apa().base_cur_exc_com_paid(value);
	}

	/**
	 * Fee without tax (Base currency) 基準通貨手数料税抜額.<p>
	 *
	 */
	public void base_cur_exc_com_paid(double value) {
		apa().base_cur_exc_com_paid(value);
	}

	/**
	 * Offset amount (Base currency) 基準通貨相殺対象額.<p>
	 *
	 */
	public MCNumber base_cur_setoff_tgt_amt() {
		return apa().base_cur_setoff_tgt_amt();
	}

	/**
	 * Offset amount (Base currency) 基準通貨相殺対象額.<p>
	 *
	 */
	public void base_cur_setoff_tgt_amt(MCNumber value) {
		apa().base_cur_setoff_tgt_amt(value);
	}

	/**
	 * Offset amount (Base currency) 基準通貨相殺対象額.<p>
	 *
	 */
	public void base_cur_setoff_tgt_amt(int value) {
		apa().base_cur_setoff_tgt_amt(value);
	}

	/**
	 * Offset amount (Base currency) 基準通貨相殺対象額.<p>
	 *
	 */
	public void base_cur_setoff_tgt_amt(long value) {
		apa().base_cur_setoff_tgt_amt(value);
	}

	/**
	 * Offset amount (Base currency) 基準通貨相殺対象額.<p>
	 *
	 */
	public void base_cur_setoff_tgt_amt(float value) {
		apa().base_cur_setoff_tgt_amt(value);
	}

	/**
	 * Offset amount (Base currency) 基準通貨相殺対象額.<p>
	 *
	 */
	public void base_cur_setoff_tgt_amt(double value) {
		apa().base_cur_setoff_tgt_amt(value);
	}

	/**
	 * Display advance payment on payment notice 支払通知書前渡金表示.<p>
	 *
	 */
	public boolean pay_ntc_adv_pay_flg() {
		return apa().pay_ntc_adv_pay_flg();
	}

	/**
	 * Display advance payment on payment notice 支払通知書前渡金表示.<p>
	 *
	 */
	public void pay_ntc_adv_pay_flg(boolean value) {
		apa().pay_ntc_adv_pay_flg(value);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return apa().trd_rmrks();
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		apa().trd_rmrks(value);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return apa().intr_rmrks();
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		apa().intr_rmrks(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return apa().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		apa().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return apa().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		apa().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return apa().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		apa().sub_char3(value);
	}

	/**
	 * Notes payable management No. 支払手形管理ＮＯ.<p>
	 *
	 */
	public String pay_note_mng_no() {
		return pn().pay_note_mng_no();
	}

	/**
	 * Notes payable management No. 支払手形管理ＮＯ.<p>
	 *
	 */
	public void pay_note_mng_no(String value) {
		pn().pay_note_mng_no(value);
	}

	/**
	 * Notes payable management sequence number 支払手形管理連番.<p>
	 *
	 */
	public MCNumber pay_note_mng_seq() {
		return pn().pay_note_mng_seq();
	}

	/**
	 * Notes payable management sequence number 支払手形管理連番.<p>
	 *
	 */
	public void pay_note_mng_seq(MCNumber value) {
		pn().pay_note_mng_seq(value);
	}

	/**
	 * Notes payable management sequence number 支払手形管理連番.<p>
	 *
	 */
	public void pay_note_mng_seq(int value) {
		pn().pay_note_mng_seq(value);
	}

	/**
	 * Notes payable management sequence number 支払手形管理連番.<p>
	 *
	 */
	public void pay_note_mng_seq(long value) {
		pn().pay_note_mng_seq(value);
	}

	/**
	 * Notes payable management sequence number 支払手形管理連番.<p>
	 *
	 */
	public void pay_note_mng_seq(float value) {
		pn().pay_note_mng_seq(value);
	}

	/**
	 * Notes payable management sequence number 支払手形管理連番.<p>
	 *
	 */
	public void pay_note_mng_seq(double value) {
		pn().pay_note_mng_seq(value);
	}

	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public String note_slip_sts_typ() {
		return pn().slip_sts_typ();
	}

	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public void note_slip_sts_typ(String value) {
		pn().slip_sts_typ(value);
	}

	/**
	 * Note number 手形番号.<p>
	 *
	 */
	public String note_no() {
		return pn().note_no();
	}

	/**
	 * Note number 手形番号.<p>
	 *
	 */
	public void note_no(String value) {
		pn().note_no(value);
	}

	/**
	 * Note type 手形区分.<p>
	 *
	 */
	public String note_typ() {
		return pn().note_typ();
	}

	/**
	 * Note type 手形区分.<p>
	 *
	 */
	public void note_typ(String value) {
		pn().note_typ(value);
	}

	/**
	 * Note reason cd. 手形理由ＣＤ.<p>
	 *
	 */
	public String note_rsn_cd() {
		return pn().note_rsn_cd();
	}

	/**
	 * Note reason cd. 手形理由ＣＤ.<p>
	 *
	 */
	public void note_rsn_cd(String value) {
		pn().note_rsn_cd(value);
	}

	/**
	 * Drawing date 振出日.<p>
	 *
	 */
	public MCDate draw_dt() {
		return pn().draw_dt();
	}

	/**
	 * Drawing date 振出日.<p>
	 *
	 */
	public void draw_dt(MCDate value) {
		pn().draw_dt(value);
	}

	/**
	 * Payment due date 支払期日.<p>
	 *
	 */
	public MCDate due_dt() {
		return pn().due_dt();
	}

	/**
	 * Payment due date 支払期日.<p>
	 *
	 */
	public void due_dt(MCDate value) {
		pn().due_dt(value);
	}

	/**
	 * Note sight 手形サイト.<p>
	 *
	 */
	public MCNumber note_days() {
		return pn().note_days();
	}

	/**
	 * Note sight 手形サイト.<p>
	 *
	 */
	public void note_days(MCNumber value) {
		pn().note_days(value);
	}

	/**
	 * Note sight 手形サイト.<p>
	 *
	 */
	public void note_days(int value) {
		pn().note_days(value);
	}

	/**
	 * Note sight 手形サイト.<p>
	 *
	 */
	public void note_days(long value) {
		pn().note_days(value);
	}

	/**
	 * Note sight 手形サイト.<p>
	 *
	 */
	public void note_days(float value) {
		pn().note_days(value);
	}

	/**
	 * Note sight 手形サイト.<p>
	 *
	 */
	public void note_days(double value) {
		pn().note_days(value);
	}

	/**
	 * Drawer name 振出人名.<p>
	 *
	 */
	public String drawer_nm() {
		return pn().drawer_nm();
	}

	/**
	 * Drawer name 振出人名.<p>
	 *
	 */
	public void drawer_nm(String value) {
		pn().drawer_nm(value);
	}

	/**
	 * Drawing bank cd. 振出銀行ＣＤ.<p>
	 *
	 */
	public String draw_bank_cd() {
		return pn().draw_bank_cd();
	}

	/**
	 * Drawing bank cd. 振出銀行ＣＤ.<p>
	 *
	 */
	public void draw_bank_cd(String value) {
		pn().draw_bank_cd(value);
	}

	/**
	 * Drawing branch cd. 振出支店ＣＤ.<p>
	 *
	 */
	public String draw_branch_cd() {
		return pn().draw_branch_cd();
	}

	/**
	 * Drawing branch cd. 振出支店ＣＤ.<p>
	 *
	 */
	public void draw_branch_cd(String value) {
		pn().draw_branch_cd(value);
	}

	/**
	 * Endorser 裏書人.<p>
	 *
	 */
	public String endrsr() {
		return pn().endrsr();
	}

	/**
	 * Endorser 裏書人.<p>
	 *
	 */
	public void endrsr(String value) {
		pn().endrsr(value);
	}

	/**
	 * Accepted by 引受人.<p>
	 *
	 */
	public String accptr() {
		return pn().accptr();
	}

	/**
	 * Accepted by 引受人.<p>
	 *
	 */
	public void accptr(String value) {
		pn().accptr(value);
	}

	/**
	 * Note amount 手形額.<p>
	 *
	 */
	public MCNumber note_amt() {
		return pn().note_amt();
	}

	/**
	 * Note amount 手形額.<p>
	 *
	 */
	public void note_amt(MCNumber value) {
		pn().note_amt(value);
	}

	/**
	 * Note amount 手形額.<p>
	 *
	 */
	public void note_amt(int value) {
		pn().note_amt(value);
	}

	/**
	 * Note amount 手形額.<p>
	 *
	 */
	public void note_amt(long value) {
		pn().note_amt(value);
	}

	/**
	 * Note amount 手形額.<p>
	 *
	 */
	public void note_amt(float value) {
		pn().note_amt(value);
	}

	/**
	 * Note amount 手形額.<p>
	 *
	 */
	public void note_amt(double value) {
		pn().note_amt(value);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String cur_cd() {
		return pn().cur_cd();
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void cur_cd(String value) {
		pn().cur_cd(value);
	}

	/**
	 * Payment result No. 支払実績ＮＯ.<p>
	 *
	 */
	public String pay_act_no() {
		return pn().pay_act_no();
	}

	/**
	 * Payment result No. 支払実績ＮＯ.<p>
	 *
	 */
	public void pay_act_no(String value) {
		pn().pay_act_no(value);
	}

	/**
	 * Payment result sequence No. 支払実績連番.<p>
	 *
	 */
	public MCNumber pay_act_seq() {
		return pn().pay_act_seq();
	}

	/**
	 * Payment result sequence No. 支払実績連番.<p>
	 *
	 */
	public void pay_act_seq(MCNumber value) {
		pn().pay_act_seq(value);
	}

	/**
	 * Payment result sequence No. 支払実績連番.<p>
	 *
	 */
	public void pay_act_seq(int value) {
		pn().pay_act_seq(value);
	}

	/**
	 * Payment result sequence No. 支払実績連番.<p>
	 *
	 */
	public void pay_act_seq(long value) {
		pn().pay_act_seq(value);
	}

	/**
	 * Payment result sequence No. 支払実績連番.<p>
	 *
	 */
	public void pay_act_seq(float value) {
		pn().pay_act_seq(value);
	}

	/**
	 * Payment result sequence No. 支払実績連番.<p>
	 *
	 */
	public void pay_act_seq(double value) {
		pn().pay_act_seq(value);
	}

	/**
	 * Advance payment amount payment result No. 前渡金支払実績ＮＯ.<p>
	 *
	 */
	public String note_adv_pay_act_no() {
		return pn().adv_pay_act_no();
	}

	/**
	 * Advance payment amount payment result No. 前渡金支払実績ＮＯ.<p>
	 *
	 */
	public void note_adv_pay_act_no(String value) {
		pn().adv_pay_act_no(value);
	}

	/**
	 * Advance payment amount payment result sequence number 前渡金支払実績連番.<p>
	 *
	 */
	public MCNumber note_adv_pay_act_seq() {
		return pn().adv_pay_act_seq();
	}

	/**
	 * Advance payment amount payment result sequence number 前渡金支払実績連番.<p>
	 *
	 */
	public void note_adv_pay_act_seq(MCNumber value) {
		pn().adv_pay_act_seq(value);
	}

	/**
	 * Advance payment amount payment result sequence number 前渡金支払実績連番.<p>
	 *
	 */
	public void note_adv_pay_act_seq(int value) {
		pn().adv_pay_act_seq(value);
	}

	/**
	 * Advance payment amount payment result sequence number 前渡金支払実績連番.<p>
	 *
	 */
	public void note_adv_pay_act_seq(long value) {
		pn().adv_pay_act_seq(value);
	}

	/**
	 * Advance payment amount payment result sequence number 前渡金支払実績連番.<p>
	 *
	 */
	public void note_adv_pay_act_seq(float value) {
		pn().adv_pay_act_seq(value);
	}

	/**
	 * Advance payment amount payment result sequence number 前渡金支払実績連番.<p>
	 *
	 */
	public void note_adv_pay_act_seq(double value) {
		pn().adv_pay_act_seq(value);
	}

	/**
	 * Accounting IF imported flg. 会計ＩＦ取込済ＦＬＧ.<p>
	 *
	 */
	public boolean a_imp_flg() {
		return pn().a_imp_flg();
	}

	/**
	 * Accounting IF imported flg. 会計ＩＦ取込済ＦＬＧ.<p>
	 *
	 */
	public void a_imp_flg(boolean value) {
		pn().a_imp_flg(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String note_sub_char1() {
		return pn().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void note_sub_char1(String value) {
		pn().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String note_sub_char2() {
		return pn().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void note_sub_char2(String value) {
		pn().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String note_sub_char3() {
		return pn().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void note_sub_char3(String value) {
		pn().sub_char3(value);
	}

}

