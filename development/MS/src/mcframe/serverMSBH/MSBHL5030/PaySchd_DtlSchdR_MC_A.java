package mcframe.serverMSBH.MSBHL5030;

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
 * ブロック"PaySchd_DtlSchd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class PaySchd_DtlSchdR_MC_A extends MCConstRow {

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public static final String $hdr_peg_no = "hdr_peg_no";
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
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Row number after grouping グループ化後の行数.<p>
	 *
	 */
	public static final String $count = "count";
	public static final String $pay_schd = "pay_schd";
	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public static final String $can_ac_dt = "can_ac_dt";
	/**
	 * AP offset result recording 債務相殺実績計上.<p>
	 *
	 */
	public static final String $ap_setoff_act_flg = "ap_setoff_act_flg";
	/**
	 * Entry date 登録日.<p>
	 *
	 */
	public static final String $reg_dt = "reg_dt";

	public static final String $pay_schd_no = $pay_schd + ".pay_schd_no";
	public static final String $pay_chk_mng_no = $pay_schd + ".pay_chk_mng_no";
	public static final String $asppl_cd = $pay_schd + ".asppl_cd";
	public static final String $ap_dpt_cd = $pay_schd + ".ap_dpt_cd";
	public static final String $pay_dpt_cd = $pay_schd + ".pay_dpt_cd";
	public static final String $ap_typ = $pay_schd + ".ap_typ";
	public static final String $ap_sttl_cd = $pay_schd + ".ap_sttl_cd";
	public static final String $ap_sttl_typ = $pay_schd + ".ap_sttl_typ";
	public static final String $pay_schd_dt = $pay_schd + ".pay_schd_dt";
	public static final String $pay_bank_ac_cd = $pay_schd + ".pay_bank_ac_cd";
	public static final String $bank_ac_cd = $pay_schd + ".bank_ac_cd";
	public static final String $ap_setoff_typ = $pay_schd + ".ap_setoff_typ";
	public static final String $setoff_cd = $pay_schd + ".setoff_cd";
	public static final String $setoff_nm = $pay_schd + ".setoff_nm";
	public static final String $so_dpt_cd = $pay_schd + ".so_dpt_cd";
	public static final String $adv_pay_act_no = $pay_schd + ".adv_pay_act_no";
	public static final String $trd_cur_amt = $pay_schd + ".trd_cur_amt";
	public static final String $xrate = $pay_schd + ".xrate";
	public static final String $trd_cur_com_paid_tax_cd = $pay_schd + ".trd_cur_com_paid_tax_cd";
	public static final String $trd_cur_com_paid_tax_amt = $pay_schd + ".trd_cur_com_paid_tax_amt";
	public static final String $trd_cur_exc_com_paid = $pay_schd + ".trd_cur_exc_com_paid";
	public static final String $rcv_bill_no = $pay_schd + ".rcv_bill_no";
	public static final String $note_no = $pay_schd + ".note_no";
	public static final String $note_typ = $pay_schd + ".note_typ";
	public static final String $note_rsn_cd = $pay_schd + ".note_rsn_cd";
	public static final String $draw_dt = $pay_schd + ".draw_dt";
	public static final String $due_dt = $pay_schd + ".due_dt";
	public static final String $note_days = $pay_schd + ".note_days";
	public static final String $drawer_nm = $pay_schd + ".drawer_nm";
	public static final String $draw_bank_cd = $pay_schd + ".draw_bank_cd";
	public static final String $draw_branch_cd = $pay_schd + ".draw_branch_cd";
	public static final String $endrsr = $pay_schd + ".endrsr";
	public static final String $accptr = $pay_schd + ".accptr";
	public static final String $pay_ntc_d_print_rmrks = $pay_schd + ".pay_ntc_d_print_rmrks";
	public static final String $pay_schd_print_rmrks = $pay_schd + ".pay_schd_print_rmrks";
	public static final String $trd_d_rmrks = $pay_schd + ".trd_d_rmrks";
	public static final String $intr_rmrks = $pay_schd + ".intr_rmrks";
	public static final String $sub_char1 = $pay_schd + ".sub_char1";
	public static final String $sub_char2 = $pay_schd + ".sub_char2";
	public static final String $sub_char3 = $pay_schd + ".sub_char3";

	public static final MCMeta hdr_peg_no_META = createCommonMeta($hdr_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta count_META = createCommonMeta($count, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta pay_schd_META = createInnerRowMeta($pay_schd, mcframe.serverMS.dbc.MST_PAY_SCHD_R.class);
	public static final MCMeta can_ac_dt_META = createCommonMeta($can_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ap_setoff_act_flg_META = createCommonMeta($ap_setoff_act_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta reg_dt_META = createCommonMeta($reg_dt, mcframe.commonMA.meta.MA_META.DT);

	protected static final ConstMetaList<PaySchd_DtlSchdR> constMetas = new ConstMetaList<PaySchd_DtlSchdR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			hdr_peg_no_META,
			peg_no_META,
			data_crud_typ_META,
			err_flg_META,
			count_META,
			pay_schd_META,
			can_ac_dt_META,
			ap_setoff_act_flg_META,
			reg_dt_META
		},
		new String[][]{
			{
				"pay_schd_no",
				"pay_chk_mng_no",
				"asppl_cd",
				"ap_dpt_cd",
				"pay_dpt_cd",
				"ap_typ",
				"ap_sttl_cd",
				"ap_sttl_typ",
				"pay_schd_dt",
				"pay_bank_ac_cd",
				"bank_ac_cd",
				"ap_setoff_typ",
				"setoff_cd",
				"setoff_nm",
				"so_dpt_cd",
				"adv_pay_act_no",
				"trd_cur_amt",
				"xrate",
				"trd_cur_com_paid_tax_cd",
				"trd_cur_com_paid_tax_amt",
				"trd_cur_exc_com_paid",
				"rcv_bill_no",
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
				"pay_ntc_d_print_rmrks",
				"pay_schd_print_rmrks",
				"trd_d_rmrks",
				"intr_rmrks",
				"sub_char1",
				"sub_char2",
				"sub_char3"
			},
			{
				$pay_schd_no,
				$pay_chk_mng_no,
				$asppl_cd,
				$ap_dpt_cd,
				$pay_dpt_cd,
				$ap_typ,
				$ap_sttl_cd,
				$ap_sttl_typ,
				$pay_schd_dt,
				$pay_bank_ac_cd,
				$bank_ac_cd,
				$ap_setoff_typ,
				$setoff_cd,
				$setoff_nm,
				$so_dpt_cd,
				$adv_pay_act_no,
				$trd_cur_amt,
				$xrate,
				$trd_cur_com_paid_tax_cd,
				$trd_cur_com_paid_tax_amt,
				$trd_cur_exc_com_paid,
				$rcv_bill_no,
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
				$pay_ntc_d_print_rmrks,
				$pay_schd_print_rmrks,
				$trd_d_rmrks,
				$intr_rmrks,
				$sub_char1,
				$sub_char2,
				$sub_char3
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
				{$pay_schd + ".asppl_cd", "MA.MAUAL0010.Bp"},	// pay_schd.asppl_cd
				{$pay_schd + ".ap_dpt_cd", "MA.MAUAL0010.Dpt"},	// pay_schd.ap_dpt_cd
				{$pay_schd + ".pay_dpt_cd", "MA.MAUAL0010.Dpt"},	// pay_schd.pay_dpt_cd
				{$pay_schd + ".ap_sttl_cd", "MA.MAUAL0010.ApSttl"},	// pay_schd.ap_sttl_cd
				{$pay_schd + ".pay_bank_ac_cd", "MA.MAUAL0010.ExtBankAc"},	// pay_schd.pay_bank_ac_cd
				{$pay_schd + ".bank_ac_cd", "MA.MAUAL0010.IntBankAc"},	// pay_schd.bank_ac_cd
				{$pay_schd + ".setoff_cd", "MA.MAUAL0010.Bp"},	// pay_schd.setoff_cd
				{$pay_schd + ".so_dpt_cd", "MA.MAUAL0010.Dpt"},	// pay_schd.so_dpt_cd
				{$pay_schd + ".trd_cur_com_paid_tax_cd", "MA.MAUAL0010.Tax"},	// pay_schd.trd_cur_com_paid_tax_cd
				{$pay_schd + ".note_rsn_cd", "MA.MAUAL0010.NoteRsn"},	// pay_schd.note_rsn_cd
				{$pay_schd + ".draw_bank_cd", "MA.MAUAL0010.Bank"},	// pay_schd.draw_bank_cd
				{$pay_schd + ".draw_branch_cd", "MA.MAUAL0010.BankBranch"}	// pay_schd.draw_branch_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$pay_schd + ".ap_sttl_cd", "ap_setoff_act_flg"}	// pay_schd.ap_sttl_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$pay_schd + ".ap_sttl_cd", "ap_setoff_act_flg"}	// pay_schd.ap_sttl_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$pay_schd + ".asppl_cd", "MAC_BP_IS_SRCH_TYP.ASPPL"},	// pay_schd.asppl_cd
				{$pay_schd + ".ap_dpt_cd", "MAC_DPT_IS_SRCH_TYP.AP;reg_dt"},	// pay_schd.ap_dpt_cd
				{$pay_schd + ".pay_dpt_cd", "MAC_DPT_IS_SRCH_TYP.AP;pay_schd_dt"},	// pay_schd.pay_dpt_cd
				{$pay_schd + ".so_dpt_cd", "pay_schd_dt"},	// pay_schd.so_dpt_cd
				{$pay_schd + ".trd_cur_com_paid_tax_cd", "true;true"},	// pay_schd.trd_cur_com_paid_tax_cd
				{$pay_schd + ".draw_branch_cd", "draw_bank_cd"}	// pay_schd.draw_branch_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$pay_schd + ".asppl_cd", "bp_is_srch_typ"},	// pay_schd.asppl_cd
				{$pay_schd + ".ap_dpt_cd", "dpt_is_srch_typ;dt"},	// pay_schd.ap_dpt_cd
				{$pay_schd + ".pay_dpt_cd", "dpt_is_srch_typ;dt"},	// pay_schd.pay_dpt_cd
				{$pay_schd + ".so_dpt_cd", "dt"},	// pay_schd.so_dpt_cd
				{$pay_schd + ".trd_cur_com_paid_tax_cd", "inc_tax_flg;purc_flg"},	// pay_schd.trd_cur_com_paid_tax_cd
				{$pay_schd + ".draw_branch_cd", "bank_cd"}	// pay_schd.draw_branch_cd
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$pay_schd + ".ap_typ", "MAC_AP_TYP"},	// pay_schd.ap_typ
				{$pay_schd + ".ap_sttl_typ", "MAC_AP_STTL_TYP"},	// pay_schd.ap_sttl_typ
				{$pay_schd + ".ap_setoff_typ", "MAC_AP_SETOFF_TYP"},	// pay_schd.ap_setoff_typ
				{$pay_schd + ".note_typ", "MAC_NOTE_TYP"}	// pay_schd.note_typ
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
	protected PaySchd_DtlSchdR_MC_A(ConstMetaList<? extends PaySchd_DtlSchdR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PaySchd_DtlSchdR clone() {
		return (PaySchd_DtlSchdR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PaySchd_DtlSchdR createInstance() {
		return (PaySchd_DtlSchdR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PaySchd_DtlSchdR getValues(String... names) {
		return (PaySchd_DtlSchdR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public MCNumber hdr_peg_no() {
		return getConstNumber(offset + 0, $hdr_peg_no);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(MCNumber value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(int value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(long value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(float value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(double value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 1, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 1, $peg_no, value);
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


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 3, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 3, $err_flg, value);
	}


	/**
	 * Row number after grouping グループ化後の行数.<p>
	 *
	 */
	public MCNumber count() {
		return getConstNumber(offset + 4, $count);
	}

	/**
	 * Row number after grouping グループ化後の行数.<p>
	 *
	 */
	public void count(MCNumber value) {
		setConstNumber(offset + 4, $count, value);
	}

	/**
	 * Row number after grouping グループ化後の行数.<p>
	 *
	 */
	public void count(int value) {
		setConstNumber(offset + 4, $count, value);
	}

	/**
	 * Row number after grouping グループ化後の行数.<p>
	 *
	 */
	public void count(long value) {
		setConstNumber(offset + 4, $count, value);
	}

	/**
	 * Row number after grouping グループ化後の行数.<p>
	 *
	 */
	public void count(float value) {
		setConstNumber(offset + 4, $count, value);
	}

	/**
	 * Row number after grouping グループ化後の行数.<p>
	 *
	 */
	public void count(double value) {
		setConstNumber(offset + 4, $count, value);
	}


	public mcframe.serverMS.dbc.MST_PAY_SCHD_R pay_schd(){
		return (mcframe.serverMS.dbc.MST_PAY_SCHD_R) getConstInnerRow(offset + 5, $pay_schd);
	}
	
	public void pay_schd(mcframe.serverMS.dbc.MST_PAY_SCHD_R row){
		setConstInnerRow(offset + 5, $pay_schd, row);
	}


	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public MCDate can_ac_dt() {
		return getConstDate(offset + 6, $can_ac_dt);
	}

	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public void can_ac_dt(MCDate value) {
		setConstDate(offset + 6, $can_ac_dt, value);
	}


	/**
	 * AP offset result recording 債務相殺実績計上.<p>
	 *
	 */
	public boolean ap_setoff_act_flg() {
		return getConstBoolean(offset + 7, $ap_setoff_act_flg);
	}

	/**
	 * AP offset result recording 債務相殺実績計上.<p>
	 *
	 */
	public void ap_setoff_act_flg(boolean value) {
		setConstBoolean(offset + 7, $ap_setoff_act_flg, value);
	}


	/**
	 * Entry date 登録日.<p>
	 *
	 */
	public MCDate reg_dt() {
		return getConstDate(offset + 8, $reg_dt);
	}

	/**
	 * Entry date 登録日.<p>
	 *
	 */
	public void reg_dt(MCDate value) {
		setConstDate(offset + 8, $reg_dt, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($count.equalsIgnoreCase(name)) {
			return count();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
		}
		if ($reg_dt.equalsIgnoreCase(name)) {
			return reg_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($ap_setoff_act_flg.equalsIgnoreCase(name)) {
			return ap_setoff_act_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($count.equalsIgnoreCase(name)) {
			return count();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
		}
		if ($reg_dt.equalsIgnoreCase(name)) {
			return reg_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($ap_setoff_act_flg.equalsIgnoreCase(name)) {
			return ap_setoff_act_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($count.equalsIgnoreCase(name)) {
			count(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($count.equalsIgnoreCase(name)) {
			count(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($count.equalsIgnoreCase(name)) {
			count(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($count.equalsIgnoreCase(name)) {
			count(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($count.equalsIgnoreCase(name)) {
			count(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			can_ac_dt(value);
			return;
		}
		if ($reg_dt.equalsIgnoreCase(name)) {
			reg_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($ap_setoff_act_flg.equalsIgnoreCase(name)) {
			ap_setoff_act_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($count.equalsIgnoreCase(name)) {
			count(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($count.equalsIgnoreCase(name)) {
			count(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($count.equalsIgnoreCase(name)) {
			count(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($count.equalsIgnoreCase(name)) {
			count(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($count.equalsIgnoreCase(name)) {
			count(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			can_ac_dt(value);
			return;
		}
		if ($reg_dt.equalsIgnoreCase(name)) {
			reg_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($ap_setoff_act_flg.equalsIgnoreCase(name)) {
			ap_setoff_act_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($pay_schd.equalsIgnoreCase(name)) {
			return pay_schd();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($pay_schd.equalsIgnoreCase(name)) {
			pay_schd(
				((MCContainerMeta) pay_schd_META).castInnerRow(mcframe.serverMS.dbc.MST_PAY_SCHD_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Payment schedule No. 支払予定ＮＯ.<p>
	 *
	 */
	public String pay_schd_no() {
		return pay_schd().pay_schd_no();
	}

	/**
	 * Payment schedule No. 支払予定ＮＯ.<p>
	 *
	 */
	public void pay_schd_no(String value) {
		pay_schd().pay_schd_no(value);
	}

	/**
	 * Payment collation management No. 支払照合管理ＮＯ.<p>
	 *
	 */
	public String pay_chk_mng_no() {
		return pay_schd().pay_chk_mng_no();
	}

	/**
	 * Payment collation management No. 支払照合管理ＮＯ.<p>
	 *
	 */
	public void pay_chk_mng_no(String value) {
		pay_schd().pay_chk_mng_no(value);
	}

	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public String asppl_cd() {
		return pay_schd().asppl_cd();
	}

	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public void asppl_cd(String value) {
		pay_schd().asppl_cd(value);
	}

	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public String ap_dpt_cd() {
		return pay_schd().ap_dpt_cd();
	}

	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public void ap_dpt_cd(String value) {
		pay_schd().ap_dpt_cd(value);
	}

	/**
	 * Payment dept. cd. 支払部門ＣＤ.<p>
	 *
	 */
	public String pay_dpt_cd() {
		return pay_schd().pay_dpt_cd();
	}

	/**
	 * Payment dept. cd. 支払部門ＣＤ.<p>
	 *
	 */
	public void pay_dpt_cd(String value) {
		pay_schd().pay_dpt_cd(value);
	}

	/**
	 * AP type 債務区分.<p>
	 *
	 */
	public String ap_typ() {
		return pay_schd().ap_typ();
	}

	/**
	 * AP type 債務区分.<p>
	 *
	 */
	public void ap_typ(String value) {
		pay_schd().ap_typ(value);
	}

	/**
	 * AP settlement method cd. 債務決済方法ＣＤ.<p>
	 *
	 */
	public String ap_sttl_cd() {
		return pay_schd().ap_sttl_cd();
	}

	/**
	 * AP settlement method cd. 債務決済方法ＣＤ.<p>
	 *
	 */
	public void ap_sttl_cd(String value) {
		pay_schd().ap_sttl_cd(value);
	}

	/**
	 * AP settlement type 債務決済区分.<p>
	 *
	 */
	public String ap_sttl_typ() {
		return pay_schd().ap_sttl_typ();
	}

	/**
	 * AP settlement type 債務決済区分.<p>
	 *
	 */
	public void ap_sttl_typ(String value) {
		pay_schd().ap_sttl_typ(value);
	}

	/**
	 * Scheduled payment date 支払予定日.<p>
	 *
	 */
	public MCDate pay_schd_dt() {
		return pay_schd().pay_schd_dt();
	}

	/**
	 * Scheduled payment date 支払予定日.<p>
	 *
	 */
	public void pay_schd_dt(MCDate value) {
		pay_schd().pay_schd_dt(value);
	}

	/**
	 * Payee account cd. 支払先口座ＣＤ.<p>
	 *
	 */
	public String pay_bank_ac_cd() {
		return pay_schd().pay_bank_ac_cd();
	}

	/**
	 * Payee account cd. 支払先口座ＣＤ.<p>
	 *
	 */
	public void pay_bank_ac_cd(String value) {
		pay_schd().pay_bank_ac_cd(value);
	}

	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public String bank_ac_cd() {
		return pay_schd().bank_ac_cd();
	}

	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public void bank_ac_cd(String value) {
		pay_schd().bank_ac_cd(value);
	}

	/**
	 * Offset destination type 相殺先区分.<p>
	 *
	 */
	public String ap_setoff_typ() {
		return pay_schd().ap_setoff_typ();
	}

	/**
	 * Offset destination type 相殺先区分.<p>
	 *
	 */
	public void ap_setoff_typ(String value) {
		pay_schd().ap_setoff_typ(value);
	}

	/**
	 * Offset destination cd. 相殺先ＣＤ.<p>
	 *
	 */
	public String setoff_cd() {
		return pay_schd().setoff_cd();
	}

	/**
	 * Offset destination cd. 相殺先ＣＤ.<p>
	 *
	 */
	public void setoff_cd(String value) {
		pay_schd().setoff_cd(value);
	}

	/**
	 * Offset destination name 相殺先名.<p>
	 *
	 */
	public String setoff_nm() {
		return pay_schd().setoff_nm();
	}

	/**
	 * Offset destination name 相殺先名.<p>
	 *
	 */
	public void setoff_nm(String value) {
		pay_schd().setoff_nm(value);
	}

	/**
	 * Offset dept. cd. 相殺部門ＣＤ.<p>
	 *
	 */
	public String so_dpt_cd() {
		return pay_schd().so_dpt_cd();
	}

	/**
	 * Offset dept. cd. 相殺部門ＣＤ.<p>
	 *
	 */
	public void so_dpt_cd(String value) {
		pay_schd().so_dpt_cd(value);
	}

	/**
	 * Advance payment amount payment result No. 前渡金支払実績ＮＯ.<p>
	 *
	 */
	public String adv_pay_act_no() {
		return pay_schd().adv_pay_act_no();
	}

	/**
	 * Advance payment amount payment result No. 前渡金支払実績ＮＯ.<p>
	 *
	 */
	public void adv_pay_act_no(String value) {
		pay_schd().adv_pay_act_no(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return pay_schd().trd_cur_amt();
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		pay_schd().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		pay_schd().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		pay_schd().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		pay_schd().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		pay_schd().trd_cur_amt(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCNumber xrate() {
		return pay_schd().xrate();
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		pay_schd().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(int value) {
		pay_schd().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(long value) {
		pay_schd().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(float value) {
		pay_schd().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(double value) {
		pay_schd().xrate(value);
	}

	/**
	 * Fee tax cd. 手数料税ＣＤ.<p>
	 *
	 */
	public String trd_cur_com_paid_tax_cd() {
		return pay_schd().trd_cur_com_paid_tax_cd();
	}

	/**
	 * Fee tax cd. 手数料税ＣＤ.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_cd(String value) {
		pay_schd().trd_cur_com_paid_tax_cd(value);
	}

	/**
	 * Fee tax amount (Transaction currency) 取引通貨手数料税額.<p>
	 *
	 */
	public MCNumber trd_cur_com_paid_tax_amt() {
		return pay_schd().trd_cur_com_paid_tax_amt();
	}

	/**
	 * Fee tax amount (Transaction currency) 取引通貨手数料税額.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_amt(MCNumber value) {
		pay_schd().trd_cur_com_paid_tax_amt(value);
	}

	/**
	 * Fee tax amount (Transaction currency) 取引通貨手数料税額.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_amt(int value) {
		pay_schd().trd_cur_com_paid_tax_amt(value);
	}

	/**
	 * Fee tax amount (Transaction currency) 取引通貨手数料税額.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_amt(long value) {
		pay_schd().trd_cur_com_paid_tax_amt(value);
	}

	/**
	 * Fee tax amount (Transaction currency) 取引通貨手数料税額.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_amt(float value) {
		pay_schd().trd_cur_com_paid_tax_amt(value);
	}

	/**
	 * Fee tax amount (Transaction currency) 取引通貨手数料税額.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_amt(double value) {
		pay_schd().trd_cur_com_paid_tax_amt(value);
	}

	/**
	 * Fee amount without tax (Transaction currency) 取引通貨手数料税抜額.<p>
	 *
	 */
	public MCNumber trd_cur_exc_com_paid() {
		return pay_schd().trd_cur_exc_com_paid();
	}

	/**
	 * Fee amount without tax (Transaction currency) 取引通貨手数料税抜額.<p>
	 *
	 */
	public void trd_cur_exc_com_paid(MCNumber value) {
		pay_schd().trd_cur_exc_com_paid(value);
	}

	/**
	 * Fee amount without tax (Transaction currency) 取引通貨手数料税抜額.<p>
	 *
	 */
	public void trd_cur_exc_com_paid(int value) {
		pay_schd().trd_cur_exc_com_paid(value);
	}

	/**
	 * Fee amount without tax (Transaction currency) 取引通貨手数料税抜額.<p>
	 *
	 */
	public void trd_cur_exc_com_paid(long value) {
		pay_schd().trd_cur_exc_com_paid(value);
	}

	/**
	 * Fee amount without tax (Transaction currency) 取引通貨手数料税抜額.<p>
	 *
	 */
	public void trd_cur_exc_com_paid(float value) {
		pay_schd().trd_cur_exc_com_paid(value);
	}

	/**
	 * Fee amount without tax (Transaction currency) 取引通貨手数料税抜額.<p>
	 *
	 */
	public void trd_cur_exc_com_paid(double value) {
		pay_schd().trd_cur_exc_com_paid(value);
	}

	/**
	 * Counterpart invoice No. 相手先請求書ＮＯ.<p>
	 *
	 */
	public String rcv_bill_no() {
		return pay_schd().rcv_bill_no();
	}

	/**
	 * Counterpart invoice No. 相手先請求書ＮＯ.<p>
	 *
	 */
	public void rcv_bill_no(String value) {
		pay_schd().rcv_bill_no(value);
	}

	/**
	 * Note number 手形番号.<p>
	 *
	 */
	public String note_no() {
		return pay_schd().note_no();
	}

	/**
	 * Note number 手形番号.<p>
	 *
	 */
	public void note_no(String value) {
		pay_schd().note_no(value);
	}

	/**
	 * Note type 手形区分.<p>
	 *
	 */
	public String note_typ() {
		return pay_schd().note_typ();
	}

	/**
	 * Note type 手形区分.<p>
	 *
	 */
	public void note_typ(String value) {
		pay_schd().note_typ(value);
	}

	/**
	 * Note reason cd. 手形理由ＣＤ.<p>
	 *
	 */
	public String note_rsn_cd() {
		return pay_schd().note_rsn_cd();
	}

	/**
	 * Note reason cd. 手形理由ＣＤ.<p>
	 *
	 */
	public void note_rsn_cd(String value) {
		pay_schd().note_rsn_cd(value);
	}

	/**
	 * Drawing date 振出日.<p>
	 *
	 */
	public MCDate draw_dt() {
		return pay_schd().draw_dt();
	}

	/**
	 * Drawing date 振出日.<p>
	 *
	 */
	public void draw_dt(MCDate value) {
		pay_schd().draw_dt(value);
	}

	/**
	 * Payment due date 支払期日.<p>
	 *
	 */
	public MCDate due_dt() {
		return pay_schd().due_dt();
	}

	/**
	 * Payment due date 支払期日.<p>
	 *
	 */
	public void due_dt(MCDate value) {
		pay_schd().due_dt(value);
	}

	/**
	 * Note sight 手形サイト.<p>
	 *
	 */
	public MCNumber note_days() {
		return pay_schd().note_days();
	}

	/**
	 * Note sight 手形サイト.<p>
	 *
	 */
	public void note_days(MCNumber value) {
		pay_schd().note_days(value);
	}

	/**
	 * Note sight 手形サイト.<p>
	 *
	 */
	public void note_days(int value) {
		pay_schd().note_days(value);
	}

	/**
	 * Note sight 手形サイト.<p>
	 *
	 */
	public void note_days(long value) {
		pay_schd().note_days(value);
	}

	/**
	 * Note sight 手形サイト.<p>
	 *
	 */
	public void note_days(float value) {
		pay_schd().note_days(value);
	}

	/**
	 * Note sight 手形サイト.<p>
	 *
	 */
	public void note_days(double value) {
		pay_schd().note_days(value);
	}

	/**
	 * Drawer name 振出人名.<p>
	 *
	 */
	public String drawer_nm() {
		return pay_schd().drawer_nm();
	}

	/**
	 * Drawer name 振出人名.<p>
	 *
	 */
	public void drawer_nm(String value) {
		pay_schd().drawer_nm(value);
	}

	/**
	 * Drawing bank cd. 振出銀行ＣＤ.<p>
	 *
	 */
	public String draw_bank_cd() {
		return pay_schd().draw_bank_cd();
	}

	/**
	 * Drawing bank cd. 振出銀行ＣＤ.<p>
	 *
	 */
	public void draw_bank_cd(String value) {
		pay_schd().draw_bank_cd(value);
	}

	/**
	 * Drawing branch cd. 振出支店ＣＤ.<p>
	 *
	 */
	public String draw_branch_cd() {
		return pay_schd().draw_branch_cd();
	}

	/**
	 * Drawing branch cd. 振出支店ＣＤ.<p>
	 *
	 */
	public void draw_branch_cd(String value) {
		pay_schd().draw_branch_cd(value);
	}

	/**
	 * Endorser 裏書人.<p>
	 *
	 */
	public String endrsr() {
		return pay_schd().endrsr();
	}

	/**
	 * Endorser 裏書人.<p>
	 *
	 */
	public void endrsr(String value) {
		pay_schd().endrsr(value);
	}

	/**
	 * Accepted by 引受人.<p>
	 *
	 */
	public String accptr() {
		return pay_schd().accptr();
	}

	/**
	 * Accepted by 引受人.<p>
	 *
	 */
	public void accptr(String value) {
		pay_schd().accptr(value);
	}

	/**
	 * Payment notice details remarks 支払通知書明細備考.<p>
	 *
	 */
	public String pay_ntc_d_print_rmrks() {
		return pay_schd().pay_ntc_d_print_rmrks();
	}

	/**
	 * Payment notice details remarks 支払通知書明細備考.<p>
	 *
	 */
	public void pay_ntc_d_print_rmrks(String value) {
		pay_schd().pay_ntc_d_print_rmrks(value);
	}

	/**
	 * Payment schedule table details 支払予定表備考.<p>
	 *
	 */
	public String pay_schd_print_rmrks() {
		return pay_schd().pay_schd_print_rmrks();
	}

	/**
	 * Payment schedule table details 支払予定表備考.<p>
	 *
	 */
	public void pay_schd_print_rmrks(String value) {
		pay_schd().pay_schd_print_rmrks(value);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return pay_schd().trd_d_rmrks();
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		pay_schd().trd_d_rmrks(value);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return pay_schd().intr_rmrks();
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		pay_schd().intr_rmrks(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return pay_schd().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		pay_schd().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return pay_schd().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		pay_schd().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return pay_schd().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		pay_schd().sub_char3(value);
	}

}

