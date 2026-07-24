package mcframe.clientMSBG.MSBGP0030;

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
 * ブロック"Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RsltR_MC_A extends MCConstRow {

	/**
	 * Select 選択.<p>
	 *
	 */
	public static final String $check = "check";
	/**
	 * Billing management No. 請求管理ＮＯ.<p>
	 *
	 */
	public static final String $bill_mng_no = "bill_mng_no";
	/**
	 * Issued 発行済.<p>
	 *
	 */
	public static final String $prnt_flg = "prnt_flg";
	/**
	 * Billing month 請求年月.<p>
	 *
	 */
	public static final String $bill_cl_ym = "bill_cl_ym";
	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public static final String $bill_dpt_cd = "bill_dpt_cd";
	/**
	 * Billing dept. name 請求部門名.<p>
	 *
	 */
	public static final String $bill_dpt_nm = "bill_dpt_nm";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public static final String $bcst_cd = "bcst_cd";
	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public static final String $bcst_nm = "bcst_nm";
	/**
	 * Foreign 国外.<p>
	 *
	 */
	public static final String $foreign_flg = "foreign_flg";
	/**
	 * Invoice No. 請求書ＮＯ.<p>
	 *
	 */
	public static final String $bill_no = "bill_no";
	/**
	 * Invoice rev. number 請求書改訂番号.<p>
	 *
	 */
	public static final String $bill_rev = "bill_rev";
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
	/**
	 * Advance invoice No. 先行請求書ＮＯ.<p>
	 *
	 */
	public static final String $pre_bill_no = "pre_bill_no";
	public static final String $wrkno_p = "wrkno_p";
	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public static final String $rcv_schd_dt = "rcv_schd_dt";
	/**
	 * Multiple 複数.<p>
	 *
	 */
	public static final String $multi_flg = "multi_flg";
	/**
	 * Closing date 締日.<p>
	 *
	 */
	public static final String $bill_cl_day = "bill_cl_day";
	/**
	 * Billing closing date 請求締処理日.<p>
	 *
	 */
	public static final String $bill_dt = "bill_dt";
	/**
	 * Advance billing date 先行請求日.<p>
	 *
	 */
	public static final String $pre_bill_dt = "pre_bill_dt";
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public static final String $trd_cur_nm = "trd_cur_nm";
	/**
	 * Billing exchange rate 請求為替レート.<p>
	 *
	 */
	public static final String $bill_xrate = "bill_xrate";
	/**
	 * With temporary unit price 仮単価あり.<p>
	 *
	 */
	public static final String $interim_flg = "interim_flg";
	public static final String $lastBillAmt_p = "lastBillAmt_p";
	public static final String $rcvAmt_p = "rcvAmt_p";
	public static final String $bfwAmt_p = "bfwAmt_p";
	public static final String $slsAmt_p = "slsAmt_p";
	public static final String $retAmt_p = "retAmt_p";
	public static final String $dscntAmt_p = "dscntAmt_p";
	public static final String $setoffAmt_p = "setoffAmt_p";
	public static final String $taxAmt_p = "taxAmt_p";
	public static final String $swToAmt_p = "swToAmt_p";
	public static final String $billAmt_p = "billAmt_p";
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public static final String $amt_dec_place = "amt_dec_place";
	/**
	 * Billing closing status type 請求締状況区分.<p>
	 *
	 */
	public static final String $bill_cl_sts_typ = "bill_cl_sts_typ";
	/**
	 * Billing closing status type name 請求締状況区分名.<p>
	 *
	 */
	public static final String $bill_cl_sts_typ_nm = "bill_cl_sts_typ_nm";
	/**
	 * EDI ＥＤＩ.<p>
	 *
	 */
	public static final String $edi_flg = "edi_flg";
	/**
	 * Processed 処理済.<p>
	 *
	 */
	public static final String $sort_ord_flg = "sort_ord_flg";
	/**
	 * For target of payment receipt schedule adjustment 入金予定調整対象.<p>
	 *
	 */
	public static final String $rcv_schd_adjst_flg = "rcv_schd_adjst_flg";
	/**
	 * Adjusted 調整済.<p>
	 *
	 */
	public static final String $adjst_flg = "adjst_flg";
	public static final String $rts_msg_p = "rts_msg_p";
	public static final String $billGrp_p = "billGrp_p";
	/**
	 * Sales temporary unit price closing 売上仮単価締.<p>
	 *
	 */
	public static final String $sls_interim_cl_flg = "sls_interim_cl_flg";
	/**
	 * Number of details 明細件数.<p>
	 *
	 */
	public static final String $d_cnt = "d_cnt";
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public static final String $ins_usr_id = "ins_usr_id";
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public static final String $ins_usr_nm = "ins_usr_nm";
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public static final String $ins_func_id = "ins_func_id";
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public static final String $ins_func_nm = "ins_func_nm";
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public static final String $ins_ts = "ins_ts";
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public static final String $upd_usr_id = "upd_usr_id";
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public static final String $upd_usr_nm = "upd_usr_nm";
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public static final String $upd_func_id = "upd_func_id";
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public static final String $upd_func_nm = "upd_func_nm";
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public static final String $upd_ts = "upd_ts";
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public static final String $upd_srv_req_no = "upd_srv_req_no";

	public static final String $wrk_no = $wrkno_p + ".wrk_no";
	public static final String $wrk_nm = $wrkno_p + ".wrk_nm";
	public static final String $last_bill_amt = $lastBillAmt_p + ".amt";
	public static final String $rcv_amt = $rcvAmt_p + ".amt";
	public static final String $bfw_amt = $bfwAmt_p + ".amt";
	public static final String $sls_amt = $slsAmt_p + ".amt";
	public static final String $ret_amt = $retAmt_p + ".amt";
	public static final String $dscnt_amt = $dscntAmt_p + ".amt";
	public static final String $setoff_amt = $setoffAmt_p + ".amt";
	public static final String $tax_amt = $taxAmt_p + ".amt";
	public static final String $sw_to_amt = $swToAmt_p + ".amt";
	public static final String $bill_amt = $billAmt_p + ".amt";
	public static final String $rtn_sts_typ = $rts_msg_p + ".rtn_sts_typ";
	public static final String $bp_grp_cd1 = $billGrp_p + ".bp_grp_cd1";
	public static final String $bp_grp_nm1 = $billGrp_p + ".bp_grp_nm1";
	public static final String $bp_grp_cd2 = $billGrp_p + ".bp_grp_cd2";
	public static final String $bp_grp_nm2 = $billGrp_p + ".bp_grp_nm2";
	public static final String $bp_grp_cd3 = $billGrp_p + ".bp_grp_cd3";
	public static final String $bp_grp_nm3 = $billGrp_p + ".bp_grp_nm3";
	public static final String $bp_grp_cd4 = $billGrp_p + ".bp_grp_cd4";
	public static final String $bp_grp_nm4 = $billGrp_p + ".bp_grp_nm4";
	public static final String $bp_grp_cd5 = $billGrp_p + ".bp_grp_cd5";
	public static final String $bp_grp_nm5 = $billGrp_p + ".bp_grp_nm5";
	public static final String $bp_grp_cd6 = $billGrp_p + ".bp_grp_cd6";
	public static final String $bp_grp_nm6 = $billGrp_p + ".bp_grp_nm6";
	public static final String $bp_grp_cd7 = $billGrp_p + ".bp_grp_cd7";
	public static final String $bp_grp_nm7 = $billGrp_p + ".bp_grp_nm7";
	public static final String $bp_grp_cd8 = $billGrp_p + ".bp_grp_cd8";
	public static final String $bp_grp_nm8 = $billGrp_p + ".bp_grp_nm8";
	public static final String $bp_grp_cd9 = $billGrp_p + ".bp_grp_cd9";
	public static final String $bp_grp_nm9 = $billGrp_p + ".bp_grp_nm9";
	public static final String $bp_grp_cd10 = $billGrp_p + ".bp_grp_cd10";
	public static final String $bp_grp_nm10 = $billGrp_p + ".bp_grp_nm10";

	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_mng_no_META = createCommonMeta($bill_mng_no, mcframe.commonMA.meta.MA_META.BILL_MNG_NO);
	public static final MCMeta prnt_flg_META = createCommonMeta($prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_cl_ym_META = createCommonMeta($bill_cl_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta bill_dpt_cd_META = createCommonMeta($bill_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bill_dpt_nm_META = createCommonMeta($bill_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta bcst_cd_META = createCommonMeta($bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bcst_nm_META = createCommonMeta($bcst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta foreign_flg_META = createCommonMeta($foreign_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_no_META = createCommonMeta($bill_no, mcframe.commonMA.meta.MA_META.BILL_NO);
	public static final MCMeta bill_rev_META = createCommonMeta($bill_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta pre_bill_no_META = createCommonMeta($pre_bill_no, mcframe.commonMA.meta.MA_META.BILL_NO);
	public static final MCMeta wrkno_p_META = createInnerRowMeta($wrkno_p, mcframe.clientMSUB.MSUBP5010.WrkNoR.class);
	public static final MCMeta rcv_schd_dt_META = createCommonMeta($rcv_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta multi_flg_META = createCommonMeta($multi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_cl_day_META = createCommonMeta($bill_cl_day, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta bill_dt_META = createCommonMeta($bill_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pre_bill_dt_META = createCommonMeta($pre_bill_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta bill_xrate_META = createCommonMeta($bill_xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta interim_flg_META = createCommonMeta($interim_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lastBillAmt_p_META = createInnerRowMeta($lastBillAmt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta rcvAmt_p_META = createInnerRowMeta($rcvAmt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta bfwAmt_p_META = createInnerRowMeta($bfwAmt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta slsAmt_p_META = createInnerRowMeta($slsAmt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta retAmt_p_META = createInnerRowMeta($retAmt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta dscntAmt_p_META = createInnerRowMeta($dscntAmt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta setoffAmt_p_META = createInnerRowMeta($setoffAmt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta taxAmt_p_META = createInnerRowMeta($taxAmt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta swToAmt_p_META = createInnerRowMeta($swToAmt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta billAmt_p_META = createInnerRowMeta($billAmt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt_dec_place_META = createCommonMeta($amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta bill_cl_sts_typ_META = createCommonMeta($bill_cl_sts_typ, mcframe.commonMS.meta.MS_META.BILL_CL_STS_TYP);
	public static final MCMeta bill_cl_sts_typ_nm_META = createCommonMeta($bill_cl_sts_typ_nm, mcframe.commonMS.meta.MS_META.BILL_CL_STS_TYP_NM);
	public static final MCMeta edi_flg_META = createCommonMeta($edi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sort_ord_flg_META = createCommonMeta($sort_ord_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcv_schd_adjst_flg_META = createCommonMeta($rcv_schd_adjst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta adjst_flg_META = createCommonMeta($adjst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rts_msg_p_META = createInnerRowMeta($rts_msg_p, mcframe.clientMAUB.MAUBP5310.RtnMsgR.class);
	public static final MCMeta billGrp_p_META = createInnerRowMeta($billGrp_p, mcframe.clientMAUB.MAUBP5190.BpGrpR.class);
	public static final MCMeta sls_interim_cl_flg_META = createCommonMeta($sls_interim_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta d_cnt_META = createCommonMeta($d_cnt, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);

	protected static final ConstMetaList<RsltR> constMetas = new ConstMetaList<RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			bill_mng_no_META,
			prnt_flg_META,
			bill_cl_ym_META,
			bill_dpt_cd_META,
			bill_dpt_nm_META,
			wg_cd_META,
			wg_nm_META,
			bcst_cd_META,
			bcst_nm_META,
			foreign_flg_META,
			bill_no_META,
			bill_rev_META,
			iv_no_META,
			pre_bill_no_META,
			wrkno_p_META,
			rcv_schd_dt_META,
			multi_flg_META,
			bill_cl_day_META,
			bill_dt_META,
			pre_bill_dt_META,
			trd_cur_cd_META,
			trd_cur_nm_META,
			bill_xrate_META,
			interim_flg_META,
			lastBillAmt_p_META,
			rcvAmt_p_META,
			bfwAmt_p_META,
			slsAmt_p_META,
			retAmt_p_META,
			dscntAmt_p_META,
			setoffAmt_p_META,
			taxAmt_p_META,
			swToAmt_p_META,
			billAmt_p_META,
			amt_dec_place_META,
			bill_cl_sts_typ_META,
			bill_cl_sts_typ_nm_META,
			edi_flg_META,
			sort_ord_flg_META,
			rcv_schd_adjst_flg_META,
			adjst_flg_META,
			rts_msg_p_META,
			billGrp_p_META,
			sls_interim_cl_flg_META,
			d_cnt_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_func_id_META,
			ins_func_nm_META,
			ins_ts_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_func_id_META,
			upd_func_nm_META,
			upd_ts_META,
			upd_srv_req_no_META
		},
		new String[][]{
			{
				"wrk_no",
				"wrk_nm",
				"last_bill_amt",
				"rcv_amt",
				"bfw_amt",
				"sls_amt",
				"ret_amt",
				"dscnt_amt",
				"setoff_amt",
				"tax_amt",
				"sw_to_amt",
				"bill_amt",
				"rtn_sts_typ",
				"bp_grp_cd1",
				"bp_grp_nm1",
				"bp_grp_cd2",
				"bp_grp_nm2",
				"bp_grp_cd3",
				"bp_grp_nm3",
				"bp_grp_cd4",
				"bp_grp_nm4",
				"bp_grp_cd5",
				"bp_grp_nm5",
				"bp_grp_cd6",
				"bp_grp_nm6",
				"bp_grp_cd7",
				"bp_grp_nm7",
				"bp_grp_cd8",
				"bp_grp_nm8",
				"bp_grp_cd9",
				"bp_grp_nm9",
				"bp_grp_cd10",
				"bp_grp_nm10"
			},
			{
				$wrk_no,
				$wrk_nm,
				$last_bill_amt,
				$rcv_amt,
				$bfw_amt,
				$sls_amt,
				$ret_amt,
				$dscnt_amt,
				$setoff_amt,
				$tax_amt,
				$sw_to_amt,
				$bill_amt,
				$rtn_sts_typ,
				$bp_grp_cd1,
				$bp_grp_nm1,
				$bp_grp_cd2,
				$bp_grp_nm2,
				$bp_grp_cd3,
				$bp_grp_nm3,
				$bp_grp_cd4,
				$bp_grp_nm4,
				$bp_grp_cd5,
				$bp_grp_nm5,
				$bp_grp_cd6,
				$bp_grp_nm6,
				$bp_grp_cd7,
				$bp_grp_nm7,
				$bp_grp_cd8,
				$bp_grp_nm8,
				$bp_grp_cd9,
				$bp_grp_nm9,
				$bp_grp_cd10,
				$bp_grp_nm10
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
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"},	// wg_nm
				{$bill_xrate, "BASE_CUR"}	// bill_xrate
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
	protected RsltR_MC_A(ConstMetaList<? extends RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR clone() {
		return (RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR createInstance() {
		return (RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR getValues(String... names) {
		return (RsltR) super.getValues(names);
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
	 * Billing management No. 請求管理ＮＯ.<p>
	 *
	 */
	public String bill_mng_no() {
		return getConstString(offset + 1, $bill_mng_no);
	}

	/**
	 * Billing management No. 請求管理ＮＯ.<p>
	 *
	 */
	public void bill_mng_no(String value) {
		setConstString(offset + 1, $bill_mng_no, value);
	}


	/**
	 * Issued 発行済.<p>
	 *
	 */
	public boolean prnt_flg() {
		return getConstBoolean(offset + 2, $prnt_flg);
	}

	/**
	 * Issued 発行済.<p>
	 *
	 */
	public void prnt_flg(boolean value) {
		setConstBoolean(offset + 2, $prnt_flg, value);
	}


	/**
	 * Billing month 請求年月.<p>
	 *
	 */
	public MCDate bill_cl_ym() {
		return getConstDate(offset + 3, $bill_cl_ym);
	}

	/**
	 * Billing month 請求年月.<p>
	 *
	 */
	public void bill_cl_ym(MCDate value) {
		setConstDate(offset + 3, $bill_cl_ym, value);
	}


	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public String bill_dpt_cd() {
		return getConstString(offset + 4, $bill_dpt_cd);
	}

	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public void bill_dpt_cd(String value) {
		setConstString(offset + 4, $bill_dpt_cd, value);
	}


	/**
	 * Billing dept. name 請求部門名.<p>
	 *
	 */
	public String bill_dpt_nm() {
		return getConstString(offset + 5, $bill_dpt_nm);
	}

	/**
	 * Billing dept. name 請求部門名.<p>
	 *
	 */
	public void bill_dpt_nm(String value) {
		setConstString(offset + 5, $bill_dpt_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 6, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 6, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 7, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 7, $wg_nm, value);
	}


	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public String bcst_cd() {
		return getConstString(offset + 8, $bcst_cd);
	}

	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public void bcst_cd(String value) {
		setConstString(offset + 8, $bcst_cd, value);
	}


	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public String bcst_nm() {
		return getConstString(offset + 9, $bcst_nm);
	}

	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public void bcst_nm(String value) {
		setConstString(offset + 9, $bcst_nm, value);
	}


	/**
	 * Foreign 国外.<p>
	 *
	 */
	public boolean foreign_flg() {
		return getConstBoolean(offset + 10, $foreign_flg);
	}

	/**
	 * Foreign 国外.<p>
	 *
	 */
	public void foreign_flg(boolean value) {
		setConstBoolean(offset + 10, $foreign_flg, value);
	}


	/**
	 * Invoice No. 請求書ＮＯ.<p>
	 *
	 */
	public String bill_no() {
		return getConstString(offset + 11, $bill_no);
	}

	/**
	 * Invoice No. 請求書ＮＯ.<p>
	 *
	 */
	public void bill_no(String value) {
		setConstString(offset + 11, $bill_no, value);
	}


	/**
	 * Invoice rev. number 請求書改訂番号.<p>
	 *
	 */
	public MCNumber bill_rev() {
		return getConstNumber(offset + 12, $bill_rev);
	}

	/**
	 * Invoice rev. number 請求書改訂番号.<p>
	 *
	 */
	public void bill_rev(MCNumber value) {
		setConstNumber(offset + 12, $bill_rev, value);
	}

	/**
	 * Invoice rev. number 請求書改訂番号.<p>
	 *
	 */
	public void bill_rev(int value) {
		setConstNumber(offset + 12, $bill_rev, value);
	}

	/**
	 * Invoice rev. number 請求書改訂番号.<p>
	 *
	 */
	public void bill_rev(long value) {
		setConstNumber(offset + 12, $bill_rev, value);
	}

	/**
	 * Invoice rev. number 請求書改訂番号.<p>
	 *
	 */
	public void bill_rev(float value) {
		setConstNumber(offset + 12, $bill_rev, value);
	}

	/**
	 * Invoice rev. number 請求書改訂番号.<p>
	 *
	 */
	public void bill_rev(double value) {
		setConstNumber(offset + 12, $bill_rev, value);
	}


	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 13, $iv_no);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 13, $iv_no, value);
	}


	/**
	 * Advance invoice No. 先行請求書ＮＯ.<p>
	 *
	 */
	public String pre_bill_no() {
		return getConstString(offset + 14, $pre_bill_no);
	}

	/**
	 * Advance invoice No. 先行請求書ＮＯ.<p>
	 *
	 */
	public void pre_bill_no(String value) {
		setConstString(offset + 14, $pre_bill_no, value);
	}


	public mcframe.clientMSUB.MSUBP5010.WrkNoR wrkno_p(){
		return (mcframe.clientMSUB.MSUBP5010.WrkNoR) getConstInnerRow(offset + 15, $wrkno_p);
	}
	
	public void wrkno_p(mcframe.clientMSUB.MSUBP5010.WrkNoR row){
		setConstInnerRow(offset + 15, $wrkno_p, row);
	}


	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public MCDate rcv_schd_dt() {
		return getConstDate(offset + 16, $rcv_schd_dt);
	}

	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public void rcv_schd_dt(MCDate value) {
		setConstDate(offset + 16, $rcv_schd_dt, value);
	}


	/**
	 * Multiple 複数.<p>
	 *
	 */
	public boolean multi_flg() {
		return getConstBoolean(offset + 17, $multi_flg);
	}

	/**
	 * Multiple 複数.<p>
	 *
	 */
	public void multi_flg(boolean value) {
		setConstBoolean(offset + 17, $multi_flg, value);
	}


	/**
	 * Closing date 締日.<p>
	 *
	 */
	public MCNumber bill_cl_day() {
		return getConstNumber(offset + 18, $bill_cl_day);
	}

	/**
	 * Closing date 締日.<p>
	 *
	 */
	public void bill_cl_day(MCNumber value) {
		setConstNumber(offset + 18, $bill_cl_day, value);
	}

	/**
	 * Closing date 締日.<p>
	 *
	 */
	public void bill_cl_day(int value) {
		setConstNumber(offset + 18, $bill_cl_day, value);
	}

	/**
	 * Closing date 締日.<p>
	 *
	 */
	public void bill_cl_day(long value) {
		setConstNumber(offset + 18, $bill_cl_day, value);
	}

	/**
	 * Closing date 締日.<p>
	 *
	 */
	public void bill_cl_day(float value) {
		setConstNumber(offset + 18, $bill_cl_day, value);
	}

	/**
	 * Closing date 締日.<p>
	 *
	 */
	public void bill_cl_day(double value) {
		setConstNumber(offset + 18, $bill_cl_day, value);
	}


	/**
	 * Billing closing date 請求締処理日.<p>
	 *
	 */
	public MCDate bill_dt() {
		return getConstDate(offset + 19, $bill_dt);
	}

	/**
	 * Billing closing date 請求締処理日.<p>
	 *
	 */
	public void bill_dt(MCDate value) {
		setConstDate(offset + 19, $bill_dt, value);
	}


	/**
	 * Advance billing date 先行請求日.<p>
	 *
	 */
	public MCDate pre_bill_dt() {
		return getConstDate(offset + 20, $pre_bill_dt);
	}

	/**
	 * Advance billing date 先行請求日.<p>
	 *
	 */
	public void pre_bill_dt(MCDate value) {
		setConstDate(offset + 20, $pre_bill_dt, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 21, $trd_cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 21, $trd_cur_cd, value);
	}


	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 22, $trd_cur_nm);
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 22, $trd_cur_nm, value);
	}


	/**
	 * Billing exchange rate 請求為替レート.<p>
	 *
	 */
	public MCNumber bill_xrate() {
		return getConstNumber(offset + 23, $bill_xrate);
	}

	/**
	 * Billing exchange rate 請求為替レート.<p>
	 *
	 */
	public void bill_xrate(MCNumber value) {
		setConstNumber(offset + 23, $bill_xrate, value);
	}

	/**
	 * Billing exchange rate 請求為替レート.<p>
	 *
	 */
	public void bill_xrate(int value) {
		setConstNumber(offset + 23, $bill_xrate, value);
	}

	/**
	 * Billing exchange rate 請求為替レート.<p>
	 *
	 */
	public void bill_xrate(long value) {
		setConstNumber(offset + 23, $bill_xrate, value);
	}

	/**
	 * Billing exchange rate 請求為替レート.<p>
	 *
	 */
	public void bill_xrate(float value) {
		setConstNumber(offset + 23, $bill_xrate, value);
	}

	/**
	 * Billing exchange rate 請求為替レート.<p>
	 *
	 */
	public void bill_xrate(double value) {
		setConstNumber(offset + 23, $bill_xrate, value);
	}


	/**
	 * With temporary unit price 仮単価あり.<p>
	 *
	 */
	public boolean interim_flg() {
		return getConstBoolean(offset + 24, $interim_flg);
	}

	/**
	 * With temporary unit price 仮単価あり.<p>
	 *
	 */
	public void interim_flg(boolean value) {
		setConstBoolean(offset + 24, $interim_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR lastBillAmt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 25, $lastBillAmt_p);
	}
	
	public void lastBillAmt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 25, $lastBillAmt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR rcvAmt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 26, $rcvAmt_p);
	}
	
	public void rcvAmt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 26, $rcvAmt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR bfwAmt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 27, $bfwAmt_p);
	}
	
	public void bfwAmt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 27, $bfwAmt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR slsAmt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 28, $slsAmt_p);
	}
	
	public void slsAmt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 28, $slsAmt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR retAmt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 29, $retAmt_p);
	}
	
	public void retAmt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 29, $retAmt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR dscntAmt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 30, $dscntAmt_p);
	}
	
	public void dscntAmt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 30, $dscntAmt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR setoffAmt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 31, $setoffAmt_p);
	}
	
	public void setoffAmt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 31, $setoffAmt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR taxAmt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 32, $taxAmt_p);
	}
	
	public void taxAmt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 32, $taxAmt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR swToAmt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 33, $swToAmt_p);
	}
	
	public void swToAmt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 33, $swToAmt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR billAmt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 34, $billAmt_p);
	}
	
	public void billAmt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 34, $billAmt_p, row);
	}


	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber amt_dec_place() {
		return getConstNumber(offset + 35, $amt_dec_place);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(MCNumber value) {
		setConstNumber(offset + 35, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(int value) {
		setConstNumber(offset + 35, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(long value) {
		setConstNumber(offset + 35, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(float value) {
		setConstNumber(offset + 35, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(double value) {
		setConstNumber(offset + 35, $amt_dec_place, value);
	}


	/**
	 * Billing closing status type 請求締状況区分.<p>
	 *
	 */
	public String bill_cl_sts_typ() {
		return getConstString(offset + 36, $bill_cl_sts_typ);
	}

	/**
	 * Billing closing status type 請求締状況区分.<p>
	 *
	 */
	public void bill_cl_sts_typ(String value) {
		setConstString(offset + 36, $bill_cl_sts_typ, value);
	}


	/**
	 * Billing closing status type name 請求締状況区分名.<p>
	 *
	 */
	public String bill_cl_sts_typ_nm() {
		return getConstString(offset + 37, $bill_cl_sts_typ_nm);
	}

	/**
	 * Billing closing status type name 請求締状況区分名.<p>
	 *
	 */
	public void bill_cl_sts_typ_nm(String value) {
		setConstString(offset + 37, $bill_cl_sts_typ_nm, value);
	}


	/**
	 * EDI ＥＤＩ.<p>
	 *
	 */
	public boolean edi_flg() {
		return getConstBoolean(offset + 38, $edi_flg);
	}

	/**
	 * EDI ＥＤＩ.<p>
	 *
	 */
	public void edi_flg(boolean value) {
		setConstBoolean(offset + 38, $edi_flg, value);
	}


	/**
	 * Processed 処理済.<p>
	 *
	 */
	public boolean sort_ord_flg() {
		return getConstBoolean(offset + 39, $sort_ord_flg);
	}

	/**
	 * Processed 処理済.<p>
	 *
	 */
	public void sort_ord_flg(boolean value) {
		setConstBoolean(offset + 39, $sort_ord_flg, value);
	}


	/**
	 * For target of payment receipt schedule adjustment 入金予定調整対象.<p>
	 *
	 */
	public boolean rcv_schd_adjst_flg() {
		return getConstBoolean(offset + 40, $rcv_schd_adjst_flg);
	}

	/**
	 * For target of payment receipt schedule adjustment 入金予定調整対象.<p>
	 *
	 */
	public void rcv_schd_adjst_flg(boolean value) {
		setConstBoolean(offset + 40, $rcv_schd_adjst_flg, value);
	}


	/**
	 * Adjusted 調整済.<p>
	 *
	 */
	public boolean adjst_flg() {
		return getConstBoolean(offset + 41, $adjst_flg);
	}

	/**
	 * Adjusted 調整済.<p>
	 *
	 */
	public void adjst_flg(boolean value) {
		setConstBoolean(offset + 41, $adjst_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5310.RtnMsgR rts_msg_p(){
		return (mcframe.clientMAUB.MAUBP5310.RtnMsgR) getConstInnerRow(offset + 42, $rts_msg_p);
	}
	
	public void rts_msg_p(mcframe.clientMAUB.MAUBP5310.RtnMsgR row){
		setConstInnerRow(offset + 42, $rts_msg_p, row);
	}


	public mcframe.clientMAUB.MAUBP5190.BpGrpR billGrp_p(){
		return (mcframe.clientMAUB.MAUBP5190.BpGrpR) getConstInnerRow(offset + 43, $billGrp_p);
	}
	
	public void billGrp_p(mcframe.clientMAUB.MAUBP5190.BpGrpR row){
		setConstInnerRow(offset + 43, $billGrp_p, row);
	}


	/**
	 * Sales temporary unit price closing 売上仮単価締.<p>
	 *
	 */
	public boolean sls_interim_cl_flg() {
		return getConstBoolean(offset + 44, $sls_interim_cl_flg);
	}

	/**
	 * Sales temporary unit price closing 売上仮単価締.<p>
	 *
	 */
	public void sls_interim_cl_flg(boolean value) {
		setConstBoolean(offset + 44, $sls_interim_cl_flg, value);
	}


	/**
	 * Number of details 明細件数.<p>
	 *
	 */
	public MCNumber d_cnt() {
		return getConstNumber(offset + 45, $d_cnt);
	}

	/**
	 * Number of details 明細件数.<p>
	 *
	 */
	public void d_cnt(MCNumber value) {
		setConstNumber(offset + 45, $d_cnt, value);
	}

	/**
	 * Number of details 明細件数.<p>
	 *
	 */
	public void d_cnt(int value) {
		setConstNumber(offset + 45, $d_cnt, value);
	}

	/**
	 * Number of details 明細件数.<p>
	 *
	 */
	public void d_cnt(long value) {
		setConstNumber(offset + 45, $d_cnt, value);
	}

	/**
	 * Number of details 明細件数.<p>
	 *
	 */
	public void d_cnt(float value) {
		setConstNumber(offset + 45, $d_cnt, value);
	}

	/**
	 * Number of details 明細件数.<p>
	 *
	 */
	public void d_cnt(double value) {
		setConstNumber(offset + 45, $d_cnt, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 46, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 46, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 47, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 47, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 48, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 48, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 49, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 49, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 50, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 50, $ins_ts, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 51, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 51, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 52, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 52, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 53, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 53, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 54, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 54, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 55, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 55, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 56, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 56, $upd_srv_req_no, value);
	}


	public String getString(String name) {
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			return bill_mng_no();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($bill_dpt_nm.equalsIgnoreCase(name)) {
			return bill_dpt_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			return bcst_nm();
		}
		if ($bill_no.equalsIgnoreCase(name)) {
			return bill_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($pre_bill_no.equalsIgnoreCase(name)) {
			return pre_bill_no();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($bill_cl_sts_typ.equalsIgnoreCase(name)) {
			return bill_cl_sts_typ();
		}
		if ($bill_cl_sts_typ_nm.equalsIgnoreCase(name)) {
			return bill_cl_sts_typ_nm();
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			return ins_usr_id();
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			return ins_usr_nm();
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			return ins_func_id();
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			return ins_func_nm();
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			return upd_usr_id();
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			return upd_usr_nm();
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			return upd_func_id();
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			return upd_func_nm();
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			return upd_srv_req_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($bill_rev.equalsIgnoreCase(name)) {
			return bill_rev();
		}
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			return bill_cl_day();
		}
		if ($bill_xrate.equalsIgnoreCase(name)) {
			return bill_xrate();
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($d_cnt.equalsIgnoreCase(name)) {
			return d_cnt();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($bill_cl_ym.equalsIgnoreCase(name)) {
			return bill_cl_ym();
		}
		if ($rcv_schd_dt.equalsIgnoreCase(name)) {
			return rcv_schd_dt();
		}
		if ($bill_dt.equalsIgnoreCase(name)) {
			return bill_dt();
		}
		if ($pre_bill_dt.equalsIgnoreCase(name)) {
			return pre_bill_dt();
		}
		return super.getDate(name);
	}
	public MCTimestamp getTimestamp(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestamp(name);
	}
	public boolean getBoolean(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			return prnt_flg();
		}
		if ($foreign_flg.equalsIgnoreCase(name)) {
			return foreign_flg();
		}
		if ($multi_flg.equalsIgnoreCase(name)) {
			return multi_flg();
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
		}
		if ($edi_flg.equalsIgnoreCase(name)) {
			return edi_flg();
		}
		if ($sort_ord_flg.equalsIgnoreCase(name)) {
			return sort_ord_flg();
		}
		if ($rcv_schd_adjst_flg.equalsIgnoreCase(name)) {
			return rcv_schd_adjst_flg();
		}
		if ($adjst_flg.equalsIgnoreCase(name)) {
			return adjst_flg();
		}
		if ($sls_interim_cl_flg.equalsIgnoreCase(name)) {
			return sls_interim_cl_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			return bill_mng_no();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($bill_dpt_nm.equalsIgnoreCase(name)) {
			return bill_dpt_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			return bcst_nm();
		}
		if ($bill_no.equalsIgnoreCase(name)) {
			return bill_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($pre_bill_no.equalsIgnoreCase(name)) {
			return pre_bill_no();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($bill_cl_sts_typ.equalsIgnoreCase(name)) {
			return bill_cl_sts_typ();
		}
		if ($bill_cl_sts_typ_nm.equalsIgnoreCase(name)) {
			return bill_cl_sts_typ_nm();
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			return ins_usr_id();
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			return ins_usr_nm();
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			return ins_func_id();
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			return ins_func_nm();
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			return upd_usr_id();
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			return upd_usr_nm();
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			return upd_func_id();
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			return upd_func_nm();
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			return upd_srv_req_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($bill_rev.equalsIgnoreCase(name)) {
			return bill_rev();
		}
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			return bill_cl_day();
		}
		if ($bill_xrate.equalsIgnoreCase(name)) {
			return bill_xrate();
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($d_cnt.equalsIgnoreCase(name)) {
			return d_cnt();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($bill_cl_ym.equalsIgnoreCase(name)) {
			return bill_cl_ym();
		}
		if ($rcv_schd_dt.equalsIgnoreCase(name)) {
			return rcv_schd_dt();
		}
		if ($bill_dt.equalsIgnoreCase(name)) {
			return bill_dt();
		}
		if ($pre_bill_dt.equalsIgnoreCase(name)) {
			return pre_bill_dt();
		}
		return super.getDateNE(name);
	}
	public MCTimestamp getTimestampNE(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestampNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			return prnt_flg();
		}
		if ($foreign_flg.equalsIgnoreCase(name)) {
			return foreign_flg();
		}
		if ($multi_flg.equalsIgnoreCase(name)) {
			return multi_flg();
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
		}
		if ($edi_flg.equalsIgnoreCase(name)) {
			return edi_flg();
		}
		if ($sort_ord_flg.equalsIgnoreCase(name)) {
			return sort_ord_flg();
		}
		if ($rcv_schd_adjst_flg.equalsIgnoreCase(name)) {
			return rcv_schd_adjst_flg();
		}
		if ($adjst_flg.equalsIgnoreCase(name)) {
			return adjst_flg();
		}
		if ($sls_interim_cl_flg.equalsIgnoreCase(name)) {
			return sls_interim_cl_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			bill_mng_no(value);
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
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
		if ($bill_no.equalsIgnoreCase(name)) {
			bill_no(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($pre_bill_no.equalsIgnoreCase(name)) {
			pre_bill_no(value);
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
		if ($bill_cl_sts_typ.equalsIgnoreCase(name)) {
			bill_cl_sts_typ(value);
			return;
		}
		if ($bill_cl_sts_typ_nm.equalsIgnoreCase(name)) {
			bill_cl_sts_typ_nm(value);
			return;
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			ins_usr_id(value);
			return;
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			ins_usr_nm(value);
			return;
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			ins_func_id(value);
			return;
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			ins_func_nm(value);
			return;
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			upd_usr_id(value);
			return;
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			upd_usr_nm(value);
			return;
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			upd_func_id(value);
			return;
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			upd_func_nm(value);
			return;
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			upd_srv_req_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($bill_rev.equalsIgnoreCase(name)) {
			bill_rev(value);
			return;
		}
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($d_cnt.equalsIgnoreCase(name)) {
			d_cnt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($bill_rev.equalsIgnoreCase(name)) {
			bill_rev(value);
			return;
		}
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($d_cnt.equalsIgnoreCase(name)) {
			d_cnt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($bill_rev.equalsIgnoreCase(name)) {
			bill_rev(value);
			return;
		}
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($d_cnt.equalsIgnoreCase(name)) {
			d_cnt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($bill_rev.equalsIgnoreCase(name)) {
			bill_rev(value);
			return;
		}
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($d_cnt.equalsIgnoreCase(name)) {
			d_cnt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($bill_rev.equalsIgnoreCase(name)) {
			bill_rev(value);
			return;
		}
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($d_cnt.equalsIgnoreCase(name)) {
			d_cnt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($bill_cl_ym.equalsIgnoreCase(name)) {
			bill_cl_ym(value);
			return;
		}
		if ($rcv_schd_dt.equalsIgnoreCase(name)) {
			rcv_schd_dt(value);
			return;
		}
		if ($bill_dt.equalsIgnoreCase(name)) {
			bill_dt(value);
			return;
		}
		if ($pre_bill_dt.equalsIgnoreCase(name)) {
			pre_bill_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setTimestamp(String name, MCTimestamp value) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		super.setTimestamp(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			prnt_flg(value);
			return;
		}
		if ($foreign_flg.equalsIgnoreCase(name)) {
			foreign_flg(value);
			return;
		}
		if ($multi_flg.equalsIgnoreCase(name)) {
			multi_flg(value);
			return;
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			interim_flg(value);
			return;
		}
		if ($edi_flg.equalsIgnoreCase(name)) {
			edi_flg(value);
			return;
		}
		if ($sort_ord_flg.equalsIgnoreCase(name)) {
			sort_ord_flg(value);
			return;
		}
		if ($rcv_schd_adjst_flg.equalsIgnoreCase(name)) {
			rcv_schd_adjst_flg(value);
			return;
		}
		if ($adjst_flg.equalsIgnoreCase(name)) {
			adjst_flg(value);
			return;
		}
		if ($sls_interim_cl_flg.equalsIgnoreCase(name)) {
			sls_interim_cl_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			bill_mng_no(value);
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
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
		if ($bill_no.equalsIgnoreCase(name)) {
			bill_no(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($pre_bill_no.equalsIgnoreCase(name)) {
			pre_bill_no(value);
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
		if ($bill_cl_sts_typ.equalsIgnoreCase(name)) {
			bill_cl_sts_typ(value);
			return;
		}
		if ($bill_cl_sts_typ_nm.equalsIgnoreCase(name)) {
			bill_cl_sts_typ_nm(value);
			return;
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			ins_usr_id(value);
			return;
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			ins_usr_nm(value);
			return;
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			ins_func_id(value);
			return;
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			ins_func_nm(value);
			return;
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			upd_usr_id(value);
			return;
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			upd_usr_nm(value);
			return;
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			upd_func_id(value);
			return;
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			upd_func_nm(value);
			return;
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			upd_srv_req_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($bill_rev.equalsIgnoreCase(name)) {
			bill_rev(value);
			return;
		}
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($d_cnt.equalsIgnoreCase(name)) {
			d_cnt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($bill_rev.equalsIgnoreCase(name)) {
			bill_rev(value);
			return;
		}
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($d_cnt.equalsIgnoreCase(name)) {
			d_cnt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($bill_rev.equalsIgnoreCase(name)) {
			bill_rev(value);
			return;
		}
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($d_cnt.equalsIgnoreCase(name)) {
			d_cnt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($bill_rev.equalsIgnoreCase(name)) {
			bill_rev(value);
			return;
		}
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($d_cnt.equalsIgnoreCase(name)) {
			d_cnt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($bill_rev.equalsIgnoreCase(name)) {
			bill_rev(value);
			return;
		}
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($d_cnt.equalsIgnoreCase(name)) {
			d_cnt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($bill_cl_ym.equalsIgnoreCase(name)) {
			bill_cl_ym(value);
			return;
		}
		if ($rcv_schd_dt.equalsIgnoreCase(name)) {
			rcv_schd_dt(value);
			return;
		}
		if ($bill_dt.equalsIgnoreCase(name)) {
			bill_dt(value);
			return;
		}
		if ($pre_bill_dt.equalsIgnoreCase(name)) {
			pre_bill_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setTimestampNE(String name, MCTimestamp value) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		super.setTimestampNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			prnt_flg(value);
			return;
		}
		if ($foreign_flg.equalsIgnoreCase(name)) {
			foreign_flg(value);
			return;
		}
		if ($multi_flg.equalsIgnoreCase(name)) {
			multi_flg(value);
			return;
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			interim_flg(value);
			return;
		}
		if ($edi_flg.equalsIgnoreCase(name)) {
			edi_flg(value);
			return;
		}
		if ($sort_ord_flg.equalsIgnoreCase(name)) {
			sort_ord_flg(value);
			return;
		}
		if ($rcv_schd_adjst_flg.equalsIgnoreCase(name)) {
			rcv_schd_adjst_flg(value);
			return;
		}
		if ($adjst_flg.equalsIgnoreCase(name)) {
			adjst_flg(value);
			return;
		}
		if ($sls_interim_cl_flg.equalsIgnoreCase(name)) {
			sls_interim_cl_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($wrkno_p.equalsIgnoreCase(name)) {
			return wrkno_p();
		}
		if ($lastBillAmt_p.equalsIgnoreCase(name)) {
			return lastBillAmt_p();
		}
		if ($rcvAmt_p.equalsIgnoreCase(name)) {
			return rcvAmt_p();
		}
		if ($bfwAmt_p.equalsIgnoreCase(name)) {
			return bfwAmt_p();
		}
		if ($slsAmt_p.equalsIgnoreCase(name)) {
			return slsAmt_p();
		}
		if ($retAmt_p.equalsIgnoreCase(name)) {
			return retAmt_p();
		}
		if ($dscntAmt_p.equalsIgnoreCase(name)) {
			return dscntAmt_p();
		}
		if ($setoffAmt_p.equalsIgnoreCase(name)) {
			return setoffAmt_p();
		}
		if ($taxAmt_p.equalsIgnoreCase(name)) {
			return taxAmt_p();
		}
		if ($swToAmt_p.equalsIgnoreCase(name)) {
			return swToAmt_p();
		}
		if ($billAmt_p.equalsIgnoreCase(name)) {
			return billAmt_p();
		}
		if ($rts_msg_p.equalsIgnoreCase(name)) {
			return rts_msg_p();
		}
		if ($billGrp_p.equalsIgnoreCase(name)) {
			return billGrp_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($wrkno_p.equalsIgnoreCase(name)) {
			wrkno_p(
				((MCContainerMeta) wrkno_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5010.WrkNoR.class, value)
			);
			return;
		}
		if ($lastBillAmt_p.equalsIgnoreCase(name)) {
			lastBillAmt_p(
				((MCContainerMeta) lastBillAmt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($rcvAmt_p.equalsIgnoreCase(name)) {
			rcvAmt_p(
				((MCContainerMeta) rcvAmt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($bfwAmt_p.equalsIgnoreCase(name)) {
			bfwAmt_p(
				((MCContainerMeta) bfwAmt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($slsAmt_p.equalsIgnoreCase(name)) {
			slsAmt_p(
				((MCContainerMeta) slsAmt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($retAmt_p.equalsIgnoreCase(name)) {
			retAmt_p(
				((MCContainerMeta) retAmt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($dscntAmt_p.equalsIgnoreCase(name)) {
			dscntAmt_p(
				((MCContainerMeta) dscntAmt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($setoffAmt_p.equalsIgnoreCase(name)) {
			setoffAmt_p(
				((MCContainerMeta) setoffAmt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($taxAmt_p.equalsIgnoreCase(name)) {
			taxAmt_p(
				((MCContainerMeta) taxAmt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($swToAmt_p.equalsIgnoreCase(name)) {
			swToAmt_p(
				((MCContainerMeta) swToAmt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($billAmt_p.equalsIgnoreCase(name)) {
			billAmt_p(
				((MCContainerMeta) billAmt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($rts_msg_p.equalsIgnoreCase(name)) {
			rts_msg_p(
				((MCContainerMeta) rts_msg_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5310.RtnMsgR.class, value)
			);
			return;
		}
		if ($billGrp_p.equalsIgnoreCase(name)) {
			billGrp_p(
				((MCContainerMeta) billGrp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5190.BpGrpR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public String wrk_no() {
		return wrkno_p().wrk_no();
	}

	public void wrk_no(String value) {
		wrkno_p().wrk_no(value);
	}

	public String wrk_nm() {
		return wrkno_p().wrk_nm();
	}

	public void wrk_nm(String value) {
		wrkno_p().wrk_nm(value);
	}

	/**
	 * Last billing amount 前回請求額.<p>
	 *
	 */
	public MCNumber last_bill_amt() {
		return lastBillAmt_p().amt();
	}

	/**
	 * Last billing amount 前回請求額.<p>
	 *
	 */
	public void last_bill_amt(MCNumber value) {
		lastBillAmt_p().amt(value);
	}

	/**
	 * Last billing amount 前回請求額.<p>
	 *
	 */
	public void last_bill_amt(int value) {
		lastBillAmt_p().amt(value);
	}

	/**
	 * Last billing amount 前回請求額.<p>
	 *
	 */
	public void last_bill_amt(long value) {
		lastBillAmt_p().amt(value);
	}

	/**
	 * Last billing amount 前回請求額.<p>
	 *
	 */
	public void last_bill_amt(float value) {
		lastBillAmt_p().amt(value);
	}

	/**
	 * Last billing amount 前回請求額.<p>
	 *
	 */
	public void last_bill_amt(double value) {
		lastBillAmt_p().amt(value);
	}

	/**
	 * Current payment received amount 今回入金額.<p>
	 *
	 */
	public MCNumber rcv_amt() {
		return rcvAmt_p().amt();
	}

	/**
	 * Current payment received amount 今回入金額.<p>
	 *
	 */
	public void rcv_amt(MCNumber value) {
		rcvAmt_p().amt(value);
	}

	/**
	 * Current payment received amount 今回入金額.<p>
	 *
	 */
	public void rcv_amt(int value) {
		rcvAmt_p().amt(value);
	}

	/**
	 * Current payment received amount 今回入金額.<p>
	 *
	 */
	public void rcv_amt(long value) {
		rcvAmt_p().amt(value);
	}

	/**
	 * Current payment received amount 今回入金額.<p>
	 *
	 */
	public void rcv_amt(float value) {
		rcvAmt_p().amt(value);
	}

	/**
	 * Current payment received amount 今回入金額.<p>
	 *
	 */
	public void rcv_amt(double value) {
		rcvAmt_p().amt(value);
	}

	/**
	 * Current carry-over amount 今回繰越額.<p>
	 *
	 */
	public MCNumber bfw_amt() {
		return bfwAmt_p().amt();
	}

	/**
	 * Current carry-over amount 今回繰越額.<p>
	 *
	 */
	public void bfw_amt(MCNumber value) {
		bfwAmt_p().amt(value);
	}

	/**
	 * Current carry-over amount 今回繰越額.<p>
	 *
	 */
	public void bfw_amt(int value) {
		bfwAmt_p().amt(value);
	}

	/**
	 * Current carry-over amount 今回繰越額.<p>
	 *
	 */
	public void bfw_amt(long value) {
		bfwAmt_p().amt(value);
	}

	/**
	 * Current carry-over amount 今回繰越額.<p>
	 *
	 */
	public void bfw_amt(float value) {
		bfwAmt_p().amt(value);
	}

	/**
	 * Current carry-over amount 今回繰越額.<p>
	 *
	 */
	public void bfw_amt(double value) {
		bfwAmt_p().amt(value);
	}

	/**
	 * Current sales amount 今回売上額.<p>
	 *
	 */
	public MCNumber sls_amt() {
		return slsAmt_p().amt();
	}

	/**
	 * Current sales amount 今回売上額.<p>
	 *
	 */
	public void sls_amt(MCNumber value) {
		slsAmt_p().amt(value);
	}

	/**
	 * Current sales amount 今回売上額.<p>
	 *
	 */
	public void sls_amt(int value) {
		slsAmt_p().amt(value);
	}

	/**
	 * Current sales amount 今回売上額.<p>
	 *
	 */
	public void sls_amt(long value) {
		slsAmt_p().amt(value);
	}

	/**
	 * Current sales amount 今回売上額.<p>
	 *
	 */
	public void sls_amt(float value) {
		slsAmt_p().amt(value);
	}

	/**
	 * Current sales amount 今回売上額.<p>
	 *
	 */
	public void sls_amt(double value) {
		slsAmt_p().amt(value);
	}

	/**
	 * Current return amount 今回返品額.<p>
	 *
	 */
	public MCNumber ret_amt() {
		return retAmt_p().amt();
	}

	/**
	 * Current return amount 今回返品額.<p>
	 *
	 */
	public void ret_amt(MCNumber value) {
		retAmt_p().amt(value);
	}

	/**
	 * Current return amount 今回返品額.<p>
	 *
	 */
	public void ret_amt(int value) {
		retAmt_p().amt(value);
	}

	/**
	 * Current return amount 今回返品額.<p>
	 *
	 */
	public void ret_amt(long value) {
		retAmt_p().amt(value);
	}

	/**
	 * Current return amount 今回返品額.<p>
	 *
	 */
	public void ret_amt(float value) {
		retAmt_p().amt(value);
	}

	/**
	 * Current return amount 今回返品額.<p>
	 *
	 */
	public void ret_amt(double value) {
		retAmt_p().amt(value);
	}

	/**
	 * Current discount amount 今回値引額.<p>
	 *
	 */
	public MCNumber dscnt_amt() {
		return dscntAmt_p().amt();
	}

	/**
	 * Current discount amount 今回値引額.<p>
	 *
	 */
	public void dscnt_amt(MCNumber value) {
		dscntAmt_p().amt(value);
	}

	/**
	 * Current discount amount 今回値引額.<p>
	 *
	 */
	public void dscnt_amt(int value) {
		dscntAmt_p().amt(value);
	}

	/**
	 * Current discount amount 今回値引額.<p>
	 *
	 */
	public void dscnt_amt(long value) {
		dscntAmt_p().amt(value);
	}

	/**
	 * Current discount amount 今回値引額.<p>
	 *
	 */
	public void dscnt_amt(float value) {
		dscntAmt_p().amt(value);
	}

	/**
	 * Current discount amount 今回値引額.<p>
	 *
	 */
	public void dscnt_amt(double value) {
		dscntAmt_p().amt(value);
	}

	/**
	 * Current offset amount 今回相殺額.<p>
	 *
	 */
	public MCNumber setoff_amt() {
		return setoffAmt_p().amt();
	}

	/**
	 * Current offset amount 今回相殺額.<p>
	 *
	 */
	public void setoff_amt(MCNumber value) {
		setoffAmt_p().amt(value);
	}

	/**
	 * Current offset amount 今回相殺額.<p>
	 *
	 */
	public void setoff_amt(int value) {
		setoffAmt_p().amt(value);
	}

	/**
	 * Current offset amount 今回相殺額.<p>
	 *
	 */
	public void setoff_amt(long value) {
		setoffAmt_p().amt(value);
	}

	/**
	 * Current offset amount 今回相殺額.<p>
	 *
	 */
	public void setoff_amt(float value) {
		setoffAmt_p().amt(value);
	}

	/**
	 * Current offset amount 今回相殺額.<p>
	 *
	 */
	public void setoff_amt(double value) {
		setoffAmt_p().amt(value);
	}

	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public MCNumber tax_amt() {
		return taxAmt_p().amt();
	}

	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public void tax_amt(MCNumber value) {
		taxAmt_p().amt(value);
	}

	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public void tax_amt(int value) {
		taxAmt_p().amt(value);
	}

	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public void tax_amt(long value) {
		taxAmt_p().amt(value);
	}

	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public void tax_amt(float value) {
		taxAmt_p().amt(value);
	}

	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public void tax_amt(double value) {
		taxAmt_p().amt(value);
	}

	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public MCNumber sw_to_amt() {
		return swToAmt_p().amt();
	}

	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public void sw_to_amt(MCNumber value) {
		swToAmt_p().amt(value);
	}

	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public void sw_to_amt(int value) {
		swToAmt_p().amt(value);
	}

	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public void sw_to_amt(long value) {
		swToAmt_p().amt(value);
	}

	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public void sw_to_amt(float value) {
		swToAmt_p().amt(value);
	}

	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public void sw_to_amt(double value) {
		swToAmt_p().amt(value);
	}

	/**
	 * Current billing amount 今回請求額.<p>
	 *
	 */
	public MCNumber bill_amt() {
		return billAmt_p().amt();
	}

	/**
	 * Current billing amount 今回請求額.<p>
	 *
	 */
	public void bill_amt(MCNumber value) {
		billAmt_p().amt(value);
	}

	/**
	 * Current billing amount 今回請求額.<p>
	 *
	 */
	public void bill_amt(int value) {
		billAmt_p().amt(value);
	}

	/**
	 * Current billing amount 今回請求額.<p>
	 *
	 */
	public void bill_amt(long value) {
		billAmt_p().amt(value);
	}

	/**
	 * Current billing amount 今回請求額.<p>
	 *
	 */
	public void bill_amt(float value) {
		billAmt_p().amt(value);
	}

	/**
	 * Current billing amount 今回請求額.<p>
	 *
	 */
	public void bill_amt(double value) {
		billAmt_p().amt(value);
	}

	public String rtn_sts_typ() {
		return rts_msg_p().rtn_sts_typ();
	}

	public void rtn_sts_typ(String value) {
		rts_msg_p().rtn_sts_typ(value);
	}

	/**
	 * Billing customer classification cd. 1 請求先分類ＣＤ１.<p>
	 *
	 */
	public String bp_grp_cd1() {
		return billGrp_p().bp_grp_cd1();
	}

	/**
	 * Billing customer classification cd. 1 請求先分類ＣＤ１.<p>
	 *
	 */
	public void bp_grp_cd1(String value) {
		billGrp_p().bp_grp_cd1(value);
	}

	/**
	 * Billing customer classification name 1 請求先分類名１.<p>
	 *
	 */
	public String bp_grp_nm1() {
		return billGrp_p().bp_grp_nm1();
	}

	/**
	 * Billing customer classification name 1 請求先分類名１.<p>
	 *
	 */
	public void bp_grp_nm1(String value) {
		billGrp_p().bp_grp_nm1(value);
	}

	/**
	 * Billing customer classification cd. 2 請求先分類ＣＤ２.<p>
	 *
	 */
	public String bp_grp_cd2() {
		return billGrp_p().bp_grp_cd2();
	}

	/**
	 * Billing customer classification cd. 2 請求先分類ＣＤ２.<p>
	 *
	 */
	public void bp_grp_cd2(String value) {
		billGrp_p().bp_grp_cd2(value);
	}

	/**
	 * Billing customer classification name 2 請求先分類名２.<p>
	 *
	 */
	public String bp_grp_nm2() {
		return billGrp_p().bp_grp_nm2();
	}

	/**
	 * Billing customer classification name 2 請求先分類名２.<p>
	 *
	 */
	public void bp_grp_nm2(String value) {
		billGrp_p().bp_grp_nm2(value);
	}

	/**
	 * Billing customer classification cd. 3 請求先分類ＣＤ３.<p>
	 *
	 */
	public String bp_grp_cd3() {
		return billGrp_p().bp_grp_cd3();
	}

	/**
	 * Billing customer classification cd. 3 請求先分類ＣＤ３.<p>
	 *
	 */
	public void bp_grp_cd3(String value) {
		billGrp_p().bp_grp_cd3(value);
	}

	/**
	 * Billing customer classification name 3 請求先分類名３.<p>
	 *
	 */
	public String bp_grp_nm3() {
		return billGrp_p().bp_grp_nm3();
	}

	/**
	 * Billing customer classification name 3 請求先分類名３.<p>
	 *
	 */
	public void bp_grp_nm3(String value) {
		billGrp_p().bp_grp_nm3(value);
	}

	/**
	 * Billing customer classification cd. 4 請求先分類ＣＤ４.<p>
	 *
	 */
	public String bp_grp_cd4() {
		return billGrp_p().bp_grp_cd4();
	}

	/**
	 * Billing customer classification cd. 4 請求先分類ＣＤ４.<p>
	 *
	 */
	public void bp_grp_cd4(String value) {
		billGrp_p().bp_grp_cd4(value);
	}

	/**
	 * Billing customer classification name 4 請求先分類名４.<p>
	 *
	 */
	public String bp_grp_nm4() {
		return billGrp_p().bp_grp_nm4();
	}

	/**
	 * Billing customer classification name 4 請求先分類名４.<p>
	 *
	 */
	public void bp_grp_nm4(String value) {
		billGrp_p().bp_grp_nm4(value);
	}

	/**
	 * Billing customer classification cd. 5 請求先分類ＣＤ５.<p>
	 *
	 */
	public String bp_grp_cd5() {
		return billGrp_p().bp_grp_cd5();
	}

	/**
	 * Billing customer classification cd. 5 請求先分類ＣＤ５.<p>
	 *
	 */
	public void bp_grp_cd5(String value) {
		billGrp_p().bp_grp_cd5(value);
	}

	/**
	 * Billing customer classification name 5 請求先分類名５.<p>
	 *
	 */
	public String bp_grp_nm5() {
		return billGrp_p().bp_grp_nm5();
	}

	/**
	 * Billing customer classification name 5 請求先分類名５.<p>
	 *
	 */
	public void bp_grp_nm5(String value) {
		billGrp_p().bp_grp_nm5(value);
	}

	/**
	 * Billing customer classification cd. 6 請求先分類ＣＤ６.<p>
	 *
	 */
	public String bp_grp_cd6() {
		return billGrp_p().bp_grp_cd6();
	}

	/**
	 * Billing customer classification cd. 6 請求先分類ＣＤ６.<p>
	 *
	 */
	public void bp_grp_cd6(String value) {
		billGrp_p().bp_grp_cd6(value);
	}

	/**
	 * Billing customer classification name 6 請求先分類名６.<p>
	 *
	 */
	public String bp_grp_nm6() {
		return billGrp_p().bp_grp_nm6();
	}

	/**
	 * Billing customer classification name 6 請求先分類名６.<p>
	 *
	 */
	public void bp_grp_nm6(String value) {
		billGrp_p().bp_grp_nm6(value);
	}

	/**
	 * Billing customer classification cd. 7 請求先分類ＣＤ７.<p>
	 *
	 */
	public String bp_grp_cd7() {
		return billGrp_p().bp_grp_cd7();
	}

	/**
	 * Billing customer classification cd. 7 請求先分類ＣＤ７.<p>
	 *
	 */
	public void bp_grp_cd7(String value) {
		billGrp_p().bp_grp_cd7(value);
	}

	/**
	 * Billing customer classification name 7 請求先分類名７.<p>
	 *
	 */
	public String bp_grp_nm7() {
		return billGrp_p().bp_grp_nm7();
	}

	/**
	 * Billing customer classification name 7 請求先分類名７.<p>
	 *
	 */
	public void bp_grp_nm7(String value) {
		billGrp_p().bp_grp_nm7(value);
	}

	/**
	 * Billing customer classification cd. 8 請求先分類ＣＤ８.<p>
	 *
	 */
	public String bp_grp_cd8() {
		return billGrp_p().bp_grp_cd8();
	}

	/**
	 * Billing customer classification cd. 8 請求先分類ＣＤ８.<p>
	 *
	 */
	public void bp_grp_cd8(String value) {
		billGrp_p().bp_grp_cd8(value);
	}

	/**
	 * Billing customer classification name 8 請求先分類名８.<p>
	 *
	 */
	public String bp_grp_nm8() {
		return billGrp_p().bp_grp_nm8();
	}

	/**
	 * Billing customer classification name 8 請求先分類名８.<p>
	 *
	 */
	public void bp_grp_nm8(String value) {
		billGrp_p().bp_grp_nm8(value);
	}

	/**
	 * Billing customer classification cd. 9 請求先分類ＣＤ９.<p>
	 *
	 */
	public String bp_grp_cd9() {
		return billGrp_p().bp_grp_cd9();
	}

	/**
	 * Billing customer classification cd. 9 請求先分類ＣＤ９.<p>
	 *
	 */
	public void bp_grp_cd9(String value) {
		billGrp_p().bp_grp_cd9(value);
	}

	/**
	 * Billing customer classification name 9 請求先分類名９.<p>
	 *
	 */
	public String bp_grp_nm9() {
		return billGrp_p().bp_grp_nm9();
	}

	/**
	 * Billing customer classification name 9 請求先分類名９.<p>
	 *
	 */
	public void bp_grp_nm9(String value) {
		billGrp_p().bp_grp_nm9(value);
	}

	/**
	 * Billing customer classification cd. 10 請求先分類ＣＤ１０.<p>
	 *
	 */
	public String bp_grp_cd10() {
		return billGrp_p().bp_grp_cd10();
	}

	/**
	 * Billing customer classification cd. 10 請求先分類ＣＤ１０.<p>
	 *
	 */
	public void bp_grp_cd10(String value) {
		billGrp_p().bp_grp_cd10(value);
	}

	/**
	 * Billing customer classification name 10 請求先分類名１０.<p>
	 *
	 */
	public String bp_grp_nm10() {
		return billGrp_p().bp_grp_nm10();
	}

	/**
	 * Billing customer classification name 10 請求先分類名１０.<p>
	 *
	 */
	public void bp_grp_nm10(String value) {
		billGrp_p().bp_grp_nm10(value);
	}

}

