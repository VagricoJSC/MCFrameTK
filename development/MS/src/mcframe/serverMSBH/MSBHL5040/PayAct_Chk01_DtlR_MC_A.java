package mcframe.serverMSBH.MSBHL5040;

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
 * ブロック"PayAct_Chk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class PayAct_Chk01_DtlR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public static final String $hdr_peg_no = "hdr_peg_no";
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	public static final String $pad = "pad";
	/**
	 * Fee tax rate 手数料税率.<p>
	 *
	 */
	public static final String $trd_cur_com_paid_tax_rate = "trd_cur_com_paid_tax_rate";
	/**
	 * Payment collation update counter 支払照合更新カウンタ.<p>
	 *
	 */
	public static final String $pay_chk_upd_cntr = "pay_chk_upd_cntr";
	/**
	 * Not to calculate amount in base currency 基準通貨金額計算対象外.<p>
	 *
	 */
	public static final String $base_cur_amt_not_calc_flg = "base_cur_amt_not_calc_flg";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public static final String $can_ac_dt = "can_ac_dt";
	/**
	 * Offset destination name (Master) 相殺先名（マスタ）.<p>
	 *
	 */
	public static final String $setoff_nm_mst = "setoff_nm_mst";
	/**
	 * Payment result details sequence number before update 更新前支払実績明細連番.<p>
	 *
	 */
	public static final String $src_pay_act_d_seq = "src_pay_act_d_seq";

	public static final String $pay_act_d_no = $pad + ".pay_act_d_no";
	public static final String $pay_act_d_seq = $pad + ".pay_act_d_seq";
	public static final String $pay_act_no = $pad + ".pay_act_no";
	public static final String $pay_act_seq = $pad + ".pay_act_seq";
	public static final String $ap_appl_schd_no = $pad + ".ap_appl_schd_no";
	public static final String $pay_schd_no = $pad + ".pay_schd_no";
	public static final String $pay_chk_mng_no = $pad + ".pay_chk_mng_no";
	public static final String $pay_chk_no = $pad + ".pay_chk_no";
	public static final String $calc_tgt_pay_chk_mng_no = $pad + ".calc_tgt_pay_chk_mng_no";
	public static final String $ap_d_no = $pad + ".ap_d_no";
	public static final String $ap_sttl_cd = $pad + ".ap_sttl_cd";
	public static final String $ap_sttl_typ = $pad + ".ap_sttl_typ";
	public static final String $ac_rsn_cd = $pad + ".ac_rsn_cd";
	public static final String $bank_ac_cd = $pad + ".bank_ac_cd";
	public static final String $pay_bank_ac_cd = $pad + ".pay_bank_ac_cd";
	public static final String $trd_cur_com_paid_tax_cd = $pad + ".trd_cur_com_paid_tax_cd";
	public static final String $ap_setoff_typ = $pad + ".ap_setoff_typ";
	public static final String $setoff_cd = $pad + ".setoff_cd";
	public static final String $setoff_nm = $pad + ".setoff_nm";
	public static final String $so_dpt_cd = $pad + ".so_dpt_cd";
	public static final String $trd_cur_amt = $pad + ".trd_cur_amt";
	public static final String $trd_cur_com_paid_tax_amt = $pad + ".trd_cur_com_paid_tax_amt";
	public static final String $trd_cur_exc_com_paid = $pad + ".trd_cur_exc_com_paid";
	public static final String $base_cur_amt = $pad + ".base_cur_amt";
	public static final String $base_cur_com_paid_tax_amt = $pad + ".base_cur_com_paid_tax_amt";
	public static final String $base_cur_exc_com_paid = $pad + ".base_cur_exc_com_paid";
	public static final String $rcv_no = $pad + ".rcv_no";
	public static final String $adv_pay_act_no = $pad + ".adv_pay_act_no";
	public static final String $bsppl_cd = $pad + ".bsppl_cd";
	public static final String $bsppl_dpt_cd = $pad + ".bsppl_dpt_cd";
	public static final String $asppl_cd = $pad + ".asppl_cd";
	public static final String $ap_dpt_cd = $pad + ".ap_dpt_cd";
	public static final String $purc_act_no = $pad + ".purc_act_no";
	public static final String $rcpt_iv_mng_no = $pad + ".rcpt_iv_mng_no";
	public static final String $rcpt_iv_no = $pad + ".rcpt_iv_no";
	public static final String $wrk_no = $pad + ".wrk_no";
	public static final String $ap_typ = $pad + ".ap_typ";
	public static final String $pay_ntc_d_print_rmrks = $pad + ".pay_ntc_d_print_rmrks";
	public static final String $trd_d_rmrks = $pad + ".trd_d_rmrks";
	public static final String $intr_d_rmrks = $pad + ".intr_d_rmrks";
	public static final String $par_pay_act_d_no = $pad + ".par_pay_act_d_no";
	public static final String $par_pay_act_d_seq = $pad + ".par_pay_act_d_seq";
	public static final String $sub_char1 = $pad + ".sub_char1";
	public static final String $sub_char2 = $pad + ".sub_char2";
	public static final String $sub_char3 = $pad + ".sub_char3";
	public static final String $disp_seq = $pad + ".disp_seq";

	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta hdr_peg_no_META = createCommonMeta($hdr_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta pad_META = createInnerRowMeta($pad, mcframe.serverMS.dbc.MST_PAY_ACT_D_R.class);
	public static final MCMeta trd_cur_com_paid_tax_rate_META = createCommonMeta($trd_cur_com_paid_tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta pay_chk_upd_cntr_META = createCommonMeta($pay_chk_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta base_cur_amt_not_calc_flg_META = createCommonMeta($base_cur_amt_not_calc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta can_ac_dt_META = createCommonMeta($can_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta setoff_nm_mst_META = createCommonMeta($setoff_nm_mst, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta src_pay_act_d_seq_META = createCommonMeta($src_pay_act_d_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);

	protected static final ConstMetaList<PayAct_Chk01_DtlR> constMetas = new ConstMetaList<PayAct_Chk01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			hdr_peg_no_META,
			data_crud_typ_META,
			pad_META,
			trd_cur_com_paid_tax_rate_META,
			pay_chk_upd_cntr_META,
			base_cur_amt_not_calc_flg_META,
			err_flg_META,
			ac_dt_META,
			can_ac_dt_META,
			setoff_nm_mst_META,
			src_pay_act_d_seq_META
		},
		new String[][]{
			{
				"pay_act_d_no",
				"pay_act_d_seq",
				"pay_act_no",
				"pay_act_seq",
				"ap_appl_schd_no",
				"pay_schd_no",
				"pay_chk_mng_no",
				"pay_chk_no",
				"calc_tgt_pay_chk_mng_no",
				"ap_d_no",
				"ap_sttl_cd",
				"ap_sttl_typ",
				"ac_rsn_cd",
				"bank_ac_cd",
				"pay_bank_ac_cd",
				"trd_cur_com_paid_tax_cd",
				"ap_setoff_typ",
				"setoff_cd",
				"setoff_nm",
				"so_dpt_cd",
				"trd_cur_amt",
				"trd_cur_com_paid_tax_amt",
				"trd_cur_exc_com_paid",
				"base_cur_amt",
				"base_cur_com_paid_tax_amt",
				"base_cur_exc_com_paid",
				"rcv_no",
				"adv_pay_act_no",
				"bsppl_cd",
				"bsppl_dpt_cd",
				"asppl_cd",
				"ap_dpt_cd",
				"purc_act_no",
				"rcpt_iv_mng_no",
				"rcpt_iv_no",
				"wrk_no",
				"ap_typ",
				"pay_ntc_d_print_rmrks",
				"trd_d_rmrks",
				"intr_d_rmrks",
				"par_pay_act_d_no",
				"par_pay_act_d_seq",
				"sub_char1",
				"sub_char2",
				"sub_char3",
				"disp_seq"
			},
			{
				$pay_act_d_no,
				$pay_act_d_seq,
				$pay_act_no,
				$pay_act_seq,
				$ap_appl_schd_no,
				$pay_schd_no,
				$pay_chk_mng_no,
				$pay_chk_no,
				$calc_tgt_pay_chk_mng_no,
				$ap_d_no,
				$ap_sttl_cd,
				$ap_sttl_typ,
				$ac_rsn_cd,
				$bank_ac_cd,
				$pay_bank_ac_cd,
				$trd_cur_com_paid_tax_cd,
				$ap_setoff_typ,
				$setoff_cd,
				$setoff_nm,
				$so_dpt_cd,
				$trd_cur_amt,
				$trd_cur_com_paid_tax_amt,
				$trd_cur_exc_com_paid,
				$base_cur_amt,
				$base_cur_com_paid_tax_amt,
				$base_cur_exc_com_paid,
				$rcv_no,
				$adv_pay_act_no,
				$bsppl_cd,
				$bsppl_dpt_cd,
				$asppl_cd,
				$ap_dpt_cd,
				$purc_act_no,
				$rcpt_iv_mng_no,
				$rcpt_iv_no,
				$wrk_no,
				$ap_typ,
				$pay_ntc_d_print_rmrks,
				$trd_d_rmrks,
				$intr_d_rmrks,
				$par_pay_act_d_no,
				$par_pay_act_d_seq,
				$sub_char1,
				$sub_char2,
				$sub_char3,
				$disp_seq
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
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_DT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
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
				{$pad + ".ap_sttl_cd", "MA.MAUAL0010.ApSttl"},	// pad.ap_sttl_cd
				{$pad + ".bank_ac_cd", "MA.MAUAL0010.IntBankAc"},	// pad.bank_ac_cd
				{$pad + ".pay_bank_ac_cd", "MA.MAUAL0010.ExtBankAc"},	// pad.pay_bank_ac_cd
				{$pad + ".trd_cur_com_paid_tax_cd", "MA.MAUAL0010.Tax"},	// pad.trd_cur_com_paid_tax_cd
				{$pad + ".setoff_cd", "MA.MAUAL0010.Bp"},	// pad.setoff_cd
				{$pad + ".so_dpt_cd", "MA.MAUAL0010.Dpt"},	// pad.so_dpt_cd
				{$pad + ".bsppl_cd", "MA.MAUAL0010.Bp"},	// pad.bsppl_cd
				{$pad + ".bsppl_dpt_cd", "MA.MAUAL0010.Dpt"},	// pad.bsppl_dpt_cd
				{$pad + ".asppl_cd", "MA.MAUAL0010.Bp"},	// pad.asppl_cd
				{$pad + ".ap_dpt_cd", "MA.MAUAL0010.Dpt"}	// pad.ap_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$pad + ".ap_sttl_cd", "ap_sttl_typ;ac_rsn_cd"},	// pad.ap_sttl_cd
				{$pad + ".trd_cur_com_paid_tax_cd", "trd_cur_com_paid_tax_rate"},	// pad.trd_cur_com_paid_tax_cd
				{$pad + ".setoff_cd", "setoff_nm_mst"}	// pad.setoff_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$pad + ".trd_cur_com_paid_tax_cd", "tax_rate"},	// pad.trd_cur_com_paid_tax_cd
				{$pad + ".setoff_cd", "bp_nm"}	// pad.setoff_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$pad + ".trd_cur_com_paid_tax_cd", "true;true"},	// pad.trd_cur_com_paid_tax_cd
				{$pad + ".so_dpt_cd", "ac_dt"},	// pad.so_dpt_cd
				{$pad + ".bsppl_cd", "MAC_BP_IS_SRCH_TYP.BSPPL"},	// pad.bsppl_cd
				{$pad + ".bsppl_dpt_cd", "ac_dt;MAC_DPT_IS_SRCH_TYP.AP"},	// pad.bsppl_dpt_cd
				{$pad + ".asppl_cd", "MAC_BP_IS_SRCH_TYP.ASPPL"},	// pad.asppl_cd
				{$pad + ".ap_dpt_cd", "ac_dt;MAC_DPT_IS_SRCH_TYP.AP"}	// pad.ap_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$pad + ".trd_cur_com_paid_tax_cd", "inc_tax_flg;purc_flg"},	// pad.trd_cur_com_paid_tax_cd
				{$pad + ".so_dpt_cd", "dt"},	// pad.so_dpt_cd
				{$pad + ".bsppl_cd", "bp_is_srch_typ"},	// pad.bsppl_cd
				{$pad + ".bsppl_dpt_cd", "dt;dpt_is_srch_typ"},	// pad.bsppl_dpt_cd
				{$pad + ".asppl_cd", "bp_is_srch_typ"},	// pad.asppl_cd
				{$pad + ".ap_dpt_cd", "dt;dpt_is_srch_typ"}	// pad.ap_dpt_cd
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$pad + ".ap_setoff_typ", "MAC_AP_SETOFF_TYP"},	// pad.ap_setoff_typ
				{$pad + ".ap_typ", "MAC_AP_TYP"}	// pad.ap_typ
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
	protected PayAct_Chk01_DtlR_MC_A(ConstMetaList<? extends PayAct_Chk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PayAct_Chk01_DtlR clone() {
		return (PayAct_Chk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PayAct_Chk01_DtlR createInstance() {
		return (PayAct_Chk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PayAct_Chk01_DtlR getValues(String... names) {
		return (PayAct_Chk01_DtlR) super.getValues(names);
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
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public MCNumber hdr_peg_no() {
		return getConstNumber(offset + 1, $hdr_peg_no);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(MCNumber value) {
		setConstNumber(offset + 1, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(int value) {
		setConstNumber(offset + 1, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(long value) {
		setConstNumber(offset + 1, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(float value) {
		setConstNumber(offset + 1, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(double value) {
		setConstNumber(offset + 1, $hdr_peg_no, value);
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 2, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 2, $data_crud_typ, value);
	}


	public mcframe.serverMS.dbc.MST_PAY_ACT_D_R pad(){
		return (mcframe.serverMS.dbc.MST_PAY_ACT_D_R) getConstInnerRow(offset + 3, $pad);
	}
	
	public void pad(mcframe.serverMS.dbc.MST_PAY_ACT_D_R row){
		setConstInnerRow(offset + 3, $pad, row);
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


	/**
	 * Payment collation update counter 支払照合更新カウンタ.<p>
	 *
	 */
	public MCNumber pay_chk_upd_cntr() {
		return getConstNumber(offset + 5, $pay_chk_upd_cntr);
	}

	/**
	 * Payment collation update counter 支払照合更新カウンタ.<p>
	 *
	 */
	public void pay_chk_upd_cntr(MCNumber value) {
		setConstNumber(offset + 5, $pay_chk_upd_cntr, value);
	}

	/**
	 * Payment collation update counter 支払照合更新カウンタ.<p>
	 *
	 */
	public void pay_chk_upd_cntr(int value) {
		setConstNumber(offset + 5, $pay_chk_upd_cntr, value);
	}

	/**
	 * Payment collation update counter 支払照合更新カウンタ.<p>
	 *
	 */
	public void pay_chk_upd_cntr(long value) {
		setConstNumber(offset + 5, $pay_chk_upd_cntr, value);
	}

	/**
	 * Payment collation update counter 支払照合更新カウンタ.<p>
	 *
	 */
	public void pay_chk_upd_cntr(float value) {
		setConstNumber(offset + 5, $pay_chk_upd_cntr, value);
	}

	/**
	 * Payment collation update counter 支払照合更新カウンタ.<p>
	 *
	 */
	public void pay_chk_upd_cntr(double value) {
		setConstNumber(offset + 5, $pay_chk_upd_cntr, value);
	}


	/**
	 * Not to calculate amount in base currency 基準通貨金額計算対象外.<p>
	 *
	 */
	public boolean base_cur_amt_not_calc_flg() {
		return getConstBoolean(offset + 6, $base_cur_amt_not_calc_flg);
	}

	/**
	 * Not to calculate amount in base currency 基準通貨金額計算対象外.<p>
	 *
	 */
	public void base_cur_amt_not_calc_flg(boolean value) {
		setConstBoolean(offset + 6, $base_cur_amt_not_calc_flg, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 7, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 7, $err_flg, value);
	}


	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 8, $ac_dt);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 8, $ac_dt, value);
	}


	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public MCDate can_ac_dt() {
		return getConstDate(offset + 9, $can_ac_dt);
	}

	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public void can_ac_dt(MCDate value) {
		setConstDate(offset + 9, $can_ac_dt, value);
	}


	/**
	 * Offset destination name (Master) 相殺先名（マスタ）.<p>
	 *
	 */
	public String setoff_nm_mst() {
		return getConstString(offset + 10, $setoff_nm_mst);
	}

	/**
	 * Offset destination name (Master) 相殺先名（マスタ）.<p>
	 *
	 */
	public void setoff_nm_mst(String value) {
		setConstString(offset + 10, $setoff_nm_mst, value);
	}


	/**
	 * Payment result details sequence number before update 更新前支払実績明細連番.<p>
	 *
	 */
	public MCNumber src_pay_act_d_seq() {
		return getConstNumber(offset + 11, $src_pay_act_d_seq);
	}

	/**
	 * Payment result details sequence number before update 更新前支払実績明細連番.<p>
	 *
	 */
	public void src_pay_act_d_seq(MCNumber value) {
		setConstNumber(offset + 11, $src_pay_act_d_seq, value);
	}

	/**
	 * Payment result details sequence number before update 更新前支払実績明細連番.<p>
	 *
	 */
	public void src_pay_act_d_seq(int value) {
		setConstNumber(offset + 11, $src_pay_act_d_seq, value);
	}

	/**
	 * Payment result details sequence number before update 更新前支払実績明細連番.<p>
	 *
	 */
	public void src_pay_act_d_seq(long value) {
		setConstNumber(offset + 11, $src_pay_act_d_seq, value);
	}

	/**
	 * Payment result details sequence number before update 更新前支払実績明細連番.<p>
	 *
	 */
	public void src_pay_act_d_seq(float value) {
		setConstNumber(offset + 11, $src_pay_act_d_seq, value);
	}

	/**
	 * Payment result details sequence number before update 更新前支払実績明細連番.<p>
	 *
	 */
	public void src_pay_act_d_seq(double value) {
		setConstNumber(offset + 11, $src_pay_act_d_seq, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($setoff_nm_mst.equalsIgnoreCase(name)) {
			return setoff_nm_mst();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			return trd_cur_com_paid_tax_rate();
		}
		if ($pay_chk_upd_cntr.equalsIgnoreCase(name)) {
			return pay_chk_upd_cntr();
		}
		if ($src_pay_act_d_seq.equalsIgnoreCase(name)) {
			return src_pay_act_d_seq();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($base_cur_amt_not_calc_flg.equalsIgnoreCase(name)) {
			return base_cur_amt_not_calc_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($setoff_nm_mst.equalsIgnoreCase(name)) {
			return setoff_nm_mst();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			return trd_cur_com_paid_tax_rate();
		}
		if ($pay_chk_upd_cntr.equalsIgnoreCase(name)) {
			return pay_chk_upd_cntr();
		}
		if ($src_pay_act_d_seq.equalsIgnoreCase(name)) {
			return src_pay_act_d_seq();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($base_cur_amt_not_calc_flg.equalsIgnoreCase(name)) {
			return base_cur_amt_not_calc_flg();
		}
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
		if ($setoff_nm_mst.equalsIgnoreCase(name)) {
			setoff_nm_mst(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($pay_chk_upd_cntr.equalsIgnoreCase(name)) {
			pay_chk_upd_cntr(value);
			return;
		}
		if ($src_pay_act_d_seq.equalsIgnoreCase(name)) {
			src_pay_act_d_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($pay_chk_upd_cntr.equalsIgnoreCase(name)) {
			pay_chk_upd_cntr(value);
			return;
		}
		if ($src_pay_act_d_seq.equalsIgnoreCase(name)) {
			src_pay_act_d_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($pay_chk_upd_cntr.equalsIgnoreCase(name)) {
			pay_chk_upd_cntr(value);
			return;
		}
		if ($src_pay_act_d_seq.equalsIgnoreCase(name)) {
			src_pay_act_d_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($pay_chk_upd_cntr.equalsIgnoreCase(name)) {
			pay_chk_upd_cntr(value);
			return;
		}
		if ($src_pay_act_d_seq.equalsIgnoreCase(name)) {
			src_pay_act_d_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($pay_chk_upd_cntr.equalsIgnoreCase(name)) {
			pay_chk_upd_cntr(value);
			return;
		}
		if ($src_pay_act_d_seq.equalsIgnoreCase(name)) {
			src_pay_act_d_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			can_ac_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($base_cur_amt_not_calc_flg.equalsIgnoreCase(name)) {
			base_cur_amt_not_calc_flg(value);
			return;
		}
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
		if ($setoff_nm_mst.equalsIgnoreCase(name)) {
			setoff_nm_mst(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($pay_chk_upd_cntr.equalsIgnoreCase(name)) {
			pay_chk_upd_cntr(value);
			return;
		}
		if ($src_pay_act_d_seq.equalsIgnoreCase(name)) {
			src_pay_act_d_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($pay_chk_upd_cntr.equalsIgnoreCase(name)) {
			pay_chk_upd_cntr(value);
			return;
		}
		if ($src_pay_act_d_seq.equalsIgnoreCase(name)) {
			src_pay_act_d_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($pay_chk_upd_cntr.equalsIgnoreCase(name)) {
			pay_chk_upd_cntr(value);
			return;
		}
		if ($src_pay_act_d_seq.equalsIgnoreCase(name)) {
			src_pay_act_d_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($pay_chk_upd_cntr.equalsIgnoreCase(name)) {
			pay_chk_upd_cntr(value);
			return;
		}
		if ($src_pay_act_d_seq.equalsIgnoreCase(name)) {
			src_pay_act_d_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($pay_chk_upd_cntr.equalsIgnoreCase(name)) {
			pay_chk_upd_cntr(value);
			return;
		}
		if ($src_pay_act_d_seq.equalsIgnoreCase(name)) {
			src_pay_act_d_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			can_ac_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($base_cur_amt_not_calc_flg.equalsIgnoreCase(name)) {
			base_cur_amt_not_calc_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($pad.equalsIgnoreCase(name)) {
			return pad();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($pad.equalsIgnoreCase(name)) {
			pad(
				((MCContainerMeta) pad_META).castInnerRow(mcframe.serverMS.dbc.MST_PAY_ACT_D_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Payment result details No. 支払実績明細ＮＯ.<p>
	 *
	 */
	public String pay_act_d_no() {
		return pad().pay_act_d_no();
	}

	/**
	 * Payment result details No. 支払実績明細ＮＯ.<p>
	 *
	 */
	public void pay_act_d_no(String value) {
		pad().pay_act_d_no(value);
	}

	/**
	 * Payment result details sequence number 支払実績明細連番.<p>
	 *
	 */
	public MCNumber pay_act_d_seq() {
		return pad().pay_act_d_seq();
	}

	/**
	 * Payment result details sequence number 支払実績明細連番.<p>
	 *
	 */
	public void pay_act_d_seq(MCNumber value) {
		pad().pay_act_d_seq(value);
	}

	/**
	 * Payment result details sequence number 支払実績明細連番.<p>
	 *
	 */
	public void pay_act_d_seq(int value) {
		pad().pay_act_d_seq(value);
	}

	/**
	 * Payment result details sequence number 支払実績明細連番.<p>
	 *
	 */
	public void pay_act_d_seq(long value) {
		pad().pay_act_d_seq(value);
	}

	/**
	 * Payment result details sequence number 支払実績明細連番.<p>
	 *
	 */
	public void pay_act_d_seq(float value) {
		pad().pay_act_d_seq(value);
	}

	/**
	 * Payment result details sequence number 支払実績明細連番.<p>
	 *
	 */
	public void pay_act_d_seq(double value) {
		pad().pay_act_d_seq(value);
	}

	/**
	 * Payment result No. 支払実績ＮＯ.<p>
	 *
	 */
	public String pay_act_no() {
		return pad().pay_act_no();
	}

	/**
	 * Payment result No. 支払実績ＮＯ.<p>
	 *
	 */
	public void pay_act_no(String value) {
		pad().pay_act_no(value);
	}

	/**
	 * Payment result sequence No. 支払実績連番.<p>
	 *
	 */
	public MCNumber pay_act_seq() {
		return pad().pay_act_seq();
	}

	/**
	 * Payment result sequence No. 支払実績連番.<p>
	 *
	 */
	public void pay_act_seq(MCNumber value) {
		pad().pay_act_seq(value);
	}

	/**
	 * Payment result sequence No. 支払実績連番.<p>
	 *
	 */
	public void pay_act_seq(int value) {
		pad().pay_act_seq(value);
	}

	/**
	 * Payment result sequence No. 支払実績連番.<p>
	 *
	 */
	public void pay_act_seq(long value) {
		pad().pay_act_seq(value);
	}

	/**
	 * Payment result sequence No. 支払実績連番.<p>
	 *
	 */
	public void pay_act_seq(float value) {
		pad().pay_act_seq(value);
	}

	/**
	 * Payment result sequence No. 支払実績連番.<p>
	 *
	 */
	public void pay_act_seq(double value) {
		pad().pay_act_seq(value);
	}

	/**
	 * AP reconciliation schedule No. 買掛消込予定ＮＯ.<p>
	 *
	 */
	public String ap_appl_schd_no() {
		return pad().ap_appl_schd_no();
	}

	/**
	 * AP reconciliation schedule No. 買掛消込予定ＮＯ.<p>
	 *
	 */
	public void ap_appl_schd_no(String value) {
		pad().ap_appl_schd_no(value);
	}

	/**
	 * Payment schedule No. 支払予定ＮＯ.<p>
	 *
	 */
	public String pay_schd_no() {
		return pad().pay_schd_no();
	}

	/**
	 * Payment schedule No. 支払予定ＮＯ.<p>
	 *
	 */
	public void pay_schd_no(String value) {
		pad().pay_schd_no(value);
	}

	/**
	 * Payment collation management No. 支払照合管理ＮＯ.<p>
	 *
	 */
	public String pay_chk_mng_no() {
		return pad().pay_chk_mng_no();
	}

	/**
	 * Payment collation management No. 支払照合管理ＮＯ.<p>
	 *
	 */
	public void pay_chk_mng_no(String value) {
		pad().pay_chk_mng_no(value);
	}

	/**
	 * Payment collation No. 支払照合ＮＯ.<p>
	 *
	 */
	public String pay_chk_no() {
		return pad().pay_chk_no();
	}

	/**
	 * Payment collation No. 支払照合ＮＯ.<p>
	 *
	 */
	public void pay_chk_no(String value) {
		pad().pay_chk_no(value);
	}

	/**
	 * (Calculation) Payment collation management No. 計算対象支払照合管理ＮＯ.<p>
	 *
	 */
	public String calc_tgt_pay_chk_mng_no() {
		return pad().calc_tgt_pay_chk_mng_no();
	}

	/**
	 * (Calculation) Payment collation management No. 計算対象支払照合管理ＮＯ.<p>
	 *
	 */
	public void calc_tgt_pay_chk_mng_no(String value) {
		pad().calc_tgt_pay_chk_mng_no(value);
	}

	/**
	 * AP details No. 買掛明細ＮＯ.<p>
	 *
	 */
	public String ap_d_no() {
		return pad().ap_d_no();
	}

	/**
	 * AP details No. 買掛明細ＮＯ.<p>
	 *
	 */
	public void ap_d_no(String value) {
		pad().ap_d_no(value);
	}

	/**
	 * AP settlement method cd. 債務決済方法ＣＤ.<p>
	 *
	 */
	public String ap_sttl_cd() {
		return pad().ap_sttl_cd();
	}

	/**
	 * AP settlement method cd. 債務決済方法ＣＤ.<p>
	 *
	 */
	public void ap_sttl_cd(String value) {
		pad().ap_sttl_cd(value);
	}

	/**
	 * AP settlement type 債務決済区分.<p>
	 *
	 */
	public String ap_sttl_typ() {
		return pad().ap_sttl_typ();
	}

	/**
	 * AP settlement type 債務決済区分.<p>
	 *
	 */
	public void ap_sttl_typ(String value) {
		pad().ap_sttl_typ(value);
	}

	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public String ac_rsn_cd() {
		return pad().ac_rsn_cd();
	}

	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public void ac_rsn_cd(String value) {
		pad().ac_rsn_cd(value);
	}

	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public String bank_ac_cd() {
		return pad().bank_ac_cd();
	}

	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public void bank_ac_cd(String value) {
		pad().bank_ac_cd(value);
	}

	/**
	 * Payee account cd. 支払先口座ＣＤ.<p>
	 *
	 */
	public String pay_bank_ac_cd() {
		return pad().pay_bank_ac_cd();
	}

	/**
	 * Payee account cd. 支払先口座ＣＤ.<p>
	 *
	 */
	public void pay_bank_ac_cd(String value) {
		pad().pay_bank_ac_cd(value);
	}

	/**
	 * Fee tax cd. 手数料税ＣＤ.<p>
	 *
	 */
	public String trd_cur_com_paid_tax_cd() {
		return pad().trd_cur_com_paid_tax_cd();
	}

	/**
	 * Fee tax cd. 手数料税ＣＤ.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_cd(String value) {
		pad().trd_cur_com_paid_tax_cd(value);
	}

	/**
	 * Offset destination type 相殺先区分.<p>
	 *
	 */
	public String ap_setoff_typ() {
		return pad().ap_setoff_typ();
	}

	/**
	 * Offset destination type 相殺先区分.<p>
	 *
	 */
	public void ap_setoff_typ(String value) {
		pad().ap_setoff_typ(value);
	}

	/**
	 * Offset destination cd. 相殺先ＣＤ.<p>
	 *
	 */
	public String setoff_cd() {
		return pad().setoff_cd();
	}

	/**
	 * Offset destination cd. 相殺先ＣＤ.<p>
	 *
	 */
	public void setoff_cd(String value) {
		pad().setoff_cd(value);
	}

	/**
	 * Offset destination name 相殺先名.<p>
	 *
	 */
	public String setoff_nm() {
		return pad().setoff_nm();
	}

	/**
	 * Offset destination name 相殺先名.<p>
	 *
	 */
	public void setoff_nm(String value) {
		pad().setoff_nm(value);
	}

	/**
	 * Offset dept. cd. 相殺部門ＣＤ.<p>
	 *
	 */
	public String so_dpt_cd() {
		return pad().so_dpt_cd();
	}

	/**
	 * Offset dept. cd. 相殺部門ＣＤ.<p>
	 *
	 */
	public void so_dpt_cd(String value) {
		pad().so_dpt_cd(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return pad().trd_cur_amt();
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		pad().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		pad().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		pad().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		pad().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		pad().trd_cur_amt(value);
	}

	/**
	 * Fee tax amount (Transaction currency) 取引通貨手数料税額.<p>
	 *
	 */
	public MCNumber trd_cur_com_paid_tax_amt() {
		return pad().trd_cur_com_paid_tax_amt();
	}

	/**
	 * Fee tax amount (Transaction currency) 取引通貨手数料税額.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_amt(MCNumber value) {
		pad().trd_cur_com_paid_tax_amt(value);
	}

	/**
	 * Fee tax amount (Transaction currency) 取引通貨手数料税額.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_amt(int value) {
		pad().trd_cur_com_paid_tax_amt(value);
	}

	/**
	 * Fee tax amount (Transaction currency) 取引通貨手数料税額.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_amt(long value) {
		pad().trd_cur_com_paid_tax_amt(value);
	}

	/**
	 * Fee tax amount (Transaction currency) 取引通貨手数料税額.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_amt(float value) {
		pad().trd_cur_com_paid_tax_amt(value);
	}

	/**
	 * Fee tax amount (Transaction currency) 取引通貨手数料税額.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_amt(double value) {
		pad().trd_cur_com_paid_tax_amt(value);
	}

	/**
	 * Fee amount without tax (Transaction currency) 取引通貨手数料税抜額.<p>
	 *
	 */
	public MCNumber trd_cur_exc_com_paid() {
		return pad().trd_cur_exc_com_paid();
	}

	/**
	 * Fee amount without tax (Transaction currency) 取引通貨手数料税抜額.<p>
	 *
	 */
	public void trd_cur_exc_com_paid(MCNumber value) {
		pad().trd_cur_exc_com_paid(value);
	}

	/**
	 * Fee amount without tax (Transaction currency) 取引通貨手数料税抜額.<p>
	 *
	 */
	public void trd_cur_exc_com_paid(int value) {
		pad().trd_cur_exc_com_paid(value);
	}

	/**
	 * Fee amount without tax (Transaction currency) 取引通貨手数料税抜額.<p>
	 *
	 */
	public void trd_cur_exc_com_paid(long value) {
		pad().trd_cur_exc_com_paid(value);
	}

	/**
	 * Fee amount without tax (Transaction currency) 取引通貨手数料税抜額.<p>
	 *
	 */
	public void trd_cur_exc_com_paid(float value) {
		pad().trd_cur_exc_com_paid(value);
	}

	/**
	 * Fee amount without tax (Transaction currency) 取引通貨手数料税抜額.<p>
	 *
	 */
	public void trd_cur_exc_com_paid(double value) {
		pad().trd_cur_exc_com_paid(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public MCNumber base_cur_amt() {
		return pad().base_cur_amt();
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(MCNumber value) {
		pad().base_cur_amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(int value) {
		pad().base_cur_amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(long value) {
		pad().base_cur_amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(float value) {
		pad().base_cur_amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(double value) {
		pad().base_cur_amt(value);
	}

	/**
	 * Fee tax amount (Base currency) 基準通貨手数料税額.<p>
	 *
	 */
	public MCNumber base_cur_com_paid_tax_amt() {
		return pad().base_cur_com_paid_tax_amt();
	}

	/**
	 * Fee tax amount (Base currency) 基準通貨手数料税額.<p>
	 *
	 */
	public void base_cur_com_paid_tax_amt(MCNumber value) {
		pad().base_cur_com_paid_tax_amt(value);
	}

	/**
	 * Fee tax amount (Base currency) 基準通貨手数料税額.<p>
	 *
	 */
	public void base_cur_com_paid_tax_amt(int value) {
		pad().base_cur_com_paid_tax_amt(value);
	}

	/**
	 * Fee tax amount (Base currency) 基準通貨手数料税額.<p>
	 *
	 */
	public void base_cur_com_paid_tax_amt(long value) {
		pad().base_cur_com_paid_tax_amt(value);
	}

	/**
	 * Fee tax amount (Base currency) 基準通貨手数料税額.<p>
	 *
	 */
	public void base_cur_com_paid_tax_amt(float value) {
		pad().base_cur_com_paid_tax_amt(value);
	}

	/**
	 * Fee tax amount (Base currency) 基準通貨手数料税額.<p>
	 *
	 */
	public void base_cur_com_paid_tax_amt(double value) {
		pad().base_cur_com_paid_tax_amt(value);
	}

	/**
	 * Fee without tax (Base currency) 基準通貨手数料税抜額.<p>
	 *
	 */
	public MCNumber base_cur_exc_com_paid() {
		return pad().base_cur_exc_com_paid();
	}

	/**
	 * Fee without tax (Base currency) 基準通貨手数料税抜額.<p>
	 *
	 */
	public void base_cur_exc_com_paid(MCNumber value) {
		pad().base_cur_exc_com_paid(value);
	}

	/**
	 * Fee without tax (Base currency) 基準通貨手数料税抜額.<p>
	 *
	 */
	public void base_cur_exc_com_paid(int value) {
		pad().base_cur_exc_com_paid(value);
	}

	/**
	 * Fee without tax (Base currency) 基準通貨手数料税抜額.<p>
	 *
	 */
	public void base_cur_exc_com_paid(long value) {
		pad().base_cur_exc_com_paid(value);
	}

	/**
	 * Fee without tax (Base currency) 基準通貨手数料税抜額.<p>
	 *
	 */
	public void base_cur_exc_com_paid(float value) {
		pad().base_cur_exc_com_paid(value);
	}

	/**
	 * Fee without tax (Base currency) 基準通貨手数料税抜額.<p>
	 *
	 */
	public void base_cur_exc_com_paid(double value) {
		pad().base_cur_exc_com_paid(value);
	}

	/**
	 * Payment received No. 入金ＮＯ.<p>
	 *
	 */
	public String rcv_no() {
		return pad().rcv_no();
	}

	/**
	 * Payment received No. 入金ＮＯ.<p>
	 *
	 */
	public void rcv_no(String value) {
		pad().rcv_no(value);
	}

	/**
	 * Advance payment amount payment result No. 前渡金支払実績ＮＯ.<p>
	 *
	 */
	public String adv_pay_act_no() {
		return pad().adv_pay_act_no();
	}

	/**
	 * Advance payment amount payment result No. 前渡金支払実績ＮＯ.<p>
	 *
	 */
	public void adv_pay_act_no(String value) {
		pad().adv_pay_act_no(value);
	}

	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public String bsppl_cd() {
		return pad().bsppl_cd();
	}

	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public void bsppl_cd(String value) {
		pad().bsppl_cd(value);
	}

	/**
	 * Scheduled payee dept. cd. 支払予定管理先部門ＣＤ.<p>
	 *
	 */
	public String bsppl_dpt_cd() {
		return pad().bsppl_dpt_cd();
	}

	/**
	 * Scheduled payee dept. cd. 支払予定管理先部門ＣＤ.<p>
	 *
	 */
	public void bsppl_dpt_cd(String value) {
		pad().bsppl_dpt_cd(value);
	}

	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public String asppl_cd() {
		return pad().asppl_cd();
	}

	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public void asppl_cd(String value) {
		pad().asppl_cd(value);
	}

	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public String ap_dpt_cd() {
		return pad().ap_dpt_cd();
	}

	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public void ap_dpt_cd(String value) {
		pad().ap_dpt_cd(value);
	}

	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public String purc_act_no() {
		return pad().purc_act_no();
	}

	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public void purc_act_no(String value) {
		pad().purc_act_no(value);
	}

	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public String rcpt_iv_mng_no() {
		return pad().rcpt_iv_mng_no();
	}

	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public void rcpt_iv_mng_no(String value) {
		pad().rcpt_iv_mng_no(value);
	}

	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public String rcpt_iv_no() {
		return pad().rcpt_iv_no();
	}

	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public void rcpt_iv_no(String value) {
		pad().rcpt_iv_no(value);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return pad().wrk_no();
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		pad().wrk_no(value);
	}

	/**
	 * AP type 債務区分.<p>
	 *
	 */
	public String ap_typ() {
		return pad().ap_typ();
	}

	/**
	 * AP type 債務区分.<p>
	 *
	 */
	public void ap_typ(String value) {
		pad().ap_typ(value);
	}

	/**
	 * Payment notice details remarks 支払通知書明細備考.<p>
	 *
	 */
	public String pay_ntc_d_print_rmrks() {
		return pad().pay_ntc_d_print_rmrks();
	}

	/**
	 * Payment notice details remarks 支払通知書明細備考.<p>
	 *
	 */
	public void pay_ntc_d_print_rmrks(String value) {
		pad().pay_ntc_d_print_rmrks(value);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return pad().trd_d_rmrks();
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		pad().trd_d_rmrks(value);
	}

	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public String intr_d_rmrks() {
		return pad().intr_d_rmrks();
	}

	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public void intr_d_rmrks(String value) {
		pad().intr_d_rmrks(value);
	}

	/**
	 * Parent payment result details No. 親支払実績明細ＮＯ.<p>
	 *
	 */
	public String par_pay_act_d_no() {
		return pad().par_pay_act_d_no();
	}

	/**
	 * Parent payment result details No. 親支払実績明細ＮＯ.<p>
	 *
	 */
	public void par_pay_act_d_no(String value) {
		pad().par_pay_act_d_no(value);
	}

	/**
	 * Parent payment result details sequence number 親支払実績明細連番.<p>
	 *
	 */
	public MCNumber par_pay_act_d_seq() {
		return pad().par_pay_act_d_seq();
	}

	/**
	 * Parent payment result details sequence number 親支払実績明細連番.<p>
	 *
	 */
	public void par_pay_act_d_seq(MCNumber value) {
		pad().par_pay_act_d_seq(value);
	}

	/**
	 * Parent payment result details sequence number 親支払実績明細連番.<p>
	 *
	 */
	public void par_pay_act_d_seq(int value) {
		pad().par_pay_act_d_seq(value);
	}

	/**
	 * Parent payment result details sequence number 親支払実績明細連番.<p>
	 *
	 */
	public void par_pay_act_d_seq(long value) {
		pad().par_pay_act_d_seq(value);
	}

	/**
	 * Parent payment result details sequence number 親支払実績明細連番.<p>
	 *
	 */
	public void par_pay_act_d_seq(float value) {
		pad().par_pay_act_d_seq(value);
	}

	/**
	 * Parent payment result details sequence number 親支払実績明細連番.<p>
	 *
	 */
	public void par_pay_act_d_seq(double value) {
		pad().par_pay_act_d_seq(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return pad().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		pad().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return pad().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		pad().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return pad().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		pad().sub_char3(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return pad().disp_seq();
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		pad().disp_seq(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		pad().disp_seq(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		pad().disp_seq(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		pad().disp_seq(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		pad().disp_seq(value);
	}

}

