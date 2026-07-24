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
 * ブロック"PayAct_Chk01_Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class PayAct_Chk01_HdrR_MC_A extends MCConstRow {

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
	public static final String $pa = "pa";
	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public static final String $can_ac_dt = "can_ac_dt";
	public static final String $pn = "pn";
	/**
	 * Not for update counter check 更新カウンタチェック対象外.<p>
	 *
	 */
	public static final String $upd_cntr_not_chk_flg = "upd_cntr_not_chk_flg";
	/**
	 * Not for DAC check ＤＡＣチェック対象外.<p>
	 *
	 */
	public static final String $dac_not_chk_flg = "dac_not_chk_flg";
	/**
	 * Payment dept. conversion 支払部門変換.<p>
	 *
	 */
	public static final String $pay_dpt_chng_flg = "pay_dpt_chng_flg";
	/**
	 * Note sight upper limit 手形サイト上限.<p>
	 *
	 */
	public static final String $note_days_lmt = "note_days_lmt";
	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_cur_amt_dec_place = "trd_cur_amt_dec_place";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";

	public static final String $pay_act_no = $pa + ".pay_act_no";
	public static final String $pay_act_seq = $pa + ".pay_act_seq";
	public static final String $pay_act_rev = $pa + ".pay_act_rev";
	public static final String $slip_sts_typ = $pa + ".slip_sts_typ";
	public static final String $psppl_cd = $pa + ".psppl_cd";
	public static final String $pay_dpt_cd = $pa + ".pay_dpt_cd";
	public static final String $wg_cd = $pa + ".wg_cd";
	public static final String $pay_usr_cd = $pa + ".pay_usr_cd";
	public static final String $pay_act_dt = $pa + ".pay_act_dt";
	public static final String $ac_dt = $pa + ".ac_dt";
	public static final String $ac_ym = $pa + ".ac_ym";
	public static final String $trd_cur_cd = $pa + ".trd_cur_cd";
	public static final String $pay_basis_dt = $pa + ".pay_basis_dt";
	public static final String $base_cur_cd = $pa + ".base_cur_cd";
	public static final String $xrate_cd = $pa + ".xrate_cd";
	public static final String $xrate = $pa + ".xrate";
	public static final String $ap_sttl_cd = $pa + ".ap_sttl_cd";
	public static final String $ap_sttl_typ = $pa + ".ap_sttl_typ";
	public static final String $bank_ac_cd = $pa + ".bank_ac_cd";
	public static final String $pay_bank_ac_cd = $pa + ".pay_bank_ac_cd";
	public static final String $ap_setoff_typ = $pa + ".ap_setoff_typ";
	public static final String $setoff_cd = $pa + ".setoff_cd";
	public static final String $setoff_nm = $pa + ".setoff_nm";
	public static final String $so_dpt_cd = $pa + ".so_dpt_cd";
	public static final String $schd_act_flg = $pa + ".schd_act_flg";
	public static final String $trd_rmrks = $pa + ".trd_rmrks";
	public static final String $intr_rmrks = $pa + ".intr_rmrks";
	public static final String $par_pay_act_no = $pa + ".par_pay_act_no";
	public static final String $par_pay_act_seq = $pa + ".par_pay_act_seq";
	public static final String $sub_char1 = $pa + ".sub_char1";
	public static final String $sub_char2 = $pa + ".sub_char2";
	public static final String $sub_char3 = $pa + ".sub_char3";
	public static final String $pay_note_mng_no = $pn + ".pay_note_mng_no";
	public static final String $pay_note_mng_seq = $pn + ".pay_note_mng_seq";
	public static final String $pn_slip_sts_typ = $pn + ".slip_sts_typ";
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
	public static final String $pn_pay_act_no = $pn + ".pay_act_no";
	public static final String $pn_pay_act_seq = $pn + ".pay_act_seq";
	public static final String $adv_pay_act_no = $pn + ".adv_pay_act_no";
	public static final String $adv_pay_act_seq = $pn + ".adv_pay_act_seq";
	public static final String $a_imp_flg = $pn + ".a_imp_flg";
	public static final String $note_sub_char1 = $pn + ".sub_char1";
	public static final String $note_sub_char2 = $pn + ".sub_char2";
	public static final String $note_sub_char3 = $pn + ".sub_char3";

	public static final MCMeta hdr_peg_no_META = createCommonMeta($hdr_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta pa_META = createInnerRowMeta($pa, mcframe.serverMS.dbc.MST_PAY_ACT_R.class);
	public static final MCMeta can_ac_dt_META = createCommonMeta($can_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pn_META = createInnerRowMeta($pn, mcframe.serverMS.dbc.MST_PAY_NOTE_R.class);
	public static final MCMeta upd_cntr_not_chk_flg_META = createCommonMeta($upd_cntr_not_chk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dac_not_chk_flg_META = createCommonMeta($dac_not_chk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_dpt_chng_flg_META = createCommonMeta($pay_dpt_chng_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta note_days_lmt_META = createCommonMeta($note_days_lmt, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta trd_cur_amt_dec_place_META = createCommonMeta($trd_cur_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<PayAct_Chk01_HdrR> constMetas = new ConstMetaList<PayAct_Chk01_HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			hdr_peg_no_META,
			data_crud_typ_META,
			pa_META,
			can_ac_dt_META,
			pn_META,
			upd_cntr_not_chk_flg_META,
			dac_not_chk_flg_META,
			pay_dpt_chng_flg_META,
			note_days_lmt_META,
			trd_cur_amt_dec_place_META,
			err_flg_META
		},
		new String[][]{
			{
				"pay_act_no",
				"pay_act_seq",
				"pay_act_rev",
				"slip_sts_typ",
				"psppl_cd",
				"pay_dpt_cd",
				"wg_cd",
				"pay_usr_cd",
				"pay_act_dt",
				"ac_dt",
				"ac_ym",
				"trd_cur_cd",
				"pay_basis_dt",
				"base_cur_cd",
				"xrate_cd",
				"xrate",
				"ap_sttl_cd",
				"ap_sttl_typ",
				"bank_ac_cd",
				"pay_bank_ac_cd",
				"ap_setoff_typ",
				"setoff_cd",
				"setoff_nm",
				"so_dpt_cd",
				"schd_act_flg",
				"trd_rmrks",
				"intr_rmrks",
				"par_pay_act_no",
				"par_pay_act_seq",
				"sub_char1",
				"sub_char2",
				"sub_char3",
				"pay_note_mng_no",
				"pay_note_mng_seq",
				"pn_slip_sts_typ",
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
				"pn_pay_act_no",
				"pn_pay_act_seq",
				"adv_pay_act_no",
				"adv_pay_act_seq",
				"a_imp_flg",
				"note_sub_char1",
				"note_sub_char2",
				"note_sub_char3"
			},
			{
				$pay_act_no,
				$pay_act_seq,
				$pay_act_rev,
				$slip_sts_typ,
				$psppl_cd,
				$pay_dpt_cd,
				$wg_cd,
				$pay_usr_cd,
				$pay_act_dt,
				$ac_dt,
				$ac_ym,
				$trd_cur_cd,
				$pay_basis_dt,
				$base_cur_cd,
				$xrate_cd,
				$xrate,
				$ap_sttl_cd,
				$ap_sttl_typ,
				$bank_ac_cd,
				$pay_bank_ac_cd,
				$ap_setoff_typ,
				$setoff_cd,
				$setoff_nm,
				$so_dpt_cd,
				$schd_act_flg,
				$trd_rmrks,
				$intr_rmrks,
				$par_pay_act_no,
				$par_pay_act_seq,
				$sub_char1,
				$sub_char2,
				$sub_char3,
				$pay_note_mng_no,
				$pay_note_mng_seq,
				$pn_slip_sts_typ,
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
				$pn_pay_act_no,
				$pn_pay_act_seq,
				$adv_pay_act_no,
				$adv_pay_act_seq,
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
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
				{$pa + ".xrate", "positive"}	// pa.xrate
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
				{$pn + ".note_days", "0:"}	// pn.note_days
			}
		)),
		new MCExtMap.Entry($$CHK_DT, new MCExtList(
			new String[][]{
				{$pa + ".pay_basis_dt", "bfToday"}	// pa.pay_basis_dt
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
				{$pa + ".psppl_cd", "MA.MAUAL0010.Bp"},	// pa.psppl_cd
				{$pa + ".pay_dpt_cd", "MA.MAUAL0010.Dpt"},	// pa.pay_dpt_cd
				{$pa + ".pay_usr_cd", "MA.MAUAL0010.Usr"},	// pa.pay_usr_cd
				{$pa + ".trd_cur_cd", "MA.MAUAL0010.Cur"},	// pa.trd_cur_cd
				{$pa + ".ap_sttl_cd", "MA.MAUAL0010.ApSttl"},	// pa.ap_sttl_cd
				{$pa + ".bank_ac_cd", "MA.MAUAL0010.IntBankAc"},	// pa.bank_ac_cd
				{$pa + ".pay_bank_ac_cd", "MA.MAUAL0010.ExtBankAc"},	// pa.pay_bank_ac_cd
				{$pa + ".setoff_cd", "MA.MAUAL0010.Bp"},	// pa.setoff_cd
				{$pa + ".so_dpt_cd", "MA.MAUAL0010.Dpt"},	// pa.so_dpt_cd
				{$pn + ".note_rsn_cd", "MA.MAUAL0010.NoteRsn"},	// pn.note_rsn_cd
				{$pn + ".draw_bank_cd", "MA.MAUAL0010.Bank"},	// pn.draw_bank_cd
				{$pn + ".draw_branch_cd", "MA.MAUAL0010.BankBranch"}	// pn.draw_branch_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$pa + ".psppl_cd", "note_days_lmt"},	// pa.psppl_cd
				{$pa + ".pay_dpt_cd", "wg_cd"},	// pa.pay_dpt_cd
				{$pa + ".trd_cur_cd", "trd_cur_amt_dec_place"},	// pa.trd_cur_cd
				{$pa + ".ap_sttl_cd", "ap_sttl_typ"}	// pa.ap_sttl_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$pa + ".psppl_cd", "note_days"},	// pa.psppl_cd
				{$pa + ".pay_dpt_cd", "wg_cd"},	// pa.pay_dpt_cd
				{$pa + ".trd_cur_cd", "amt_dec_place"}	// pa.trd_cur_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$pa + ".psppl_cd", "MAC_BP_IS_SRCH_TYP.PSPPL"},	// pa.psppl_cd
				{$pa + ".pay_dpt_cd", "ac_dt;MAC_DPT_IS_SRCH_TYP.AP;pay_usr_cd"},	// pa.pay_dpt_cd
				{$pa + ".so_dpt_cd", "ac_dt"},	// pa.so_dpt_cd
				{$pn + ".draw_branch_cd", "draw_bank_cd"}	// pn.draw_branch_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$pa + ".psppl_cd", "bp_is_srch_typ"},	// pa.psppl_cd
				{$pa + ".pay_dpt_cd", "dt;dpt_is_srch_typ;usr_cd"},	// pa.pay_dpt_cd
				{$pa + ".so_dpt_cd", "dt"},	// pa.so_dpt_cd
				{$pn + ".draw_branch_cd", "bank_cd"}	// pn.draw_branch_cd
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$pa + ".ap_setoff_typ", "MAC_AP_SETOFF_TYP"},	// pa.ap_setoff_typ
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
	protected PayAct_Chk01_HdrR_MC_A(ConstMetaList<? extends PayAct_Chk01_HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PayAct_Chk01_HdrR clone() {
		return (PayAct_Chk01_HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PayAct_Chk01_HdrR createInstance() {
		return (PayAct_Chk01_HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PayAct_Chk01_HdrR getValues(String... names) {
		return (PayAct_Chk01_HdrR) super.getValues(names);
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


	public mcframe.serverMS.dbc.MST_PAY_ACT_R pa(){
		return (mcframe.serverMS.dbc.MST_PAY_ACT_R) getConstInnerRow(offset + 2, $pa);
	}
	
	public void pa(mcframe.serverMS.dbc.MST_PAY_ACT_R row){
		setConstInnerRow(offset + 2, $pa, row);
	}


	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public MCDate can_ac_dt() {
		return getConstDate(offset + 3, $can_ac_dt);
	}

	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public void can_ac_dt(MCDate value) {
		setConstDate(offset + 3, $can_ac_dt, value);
	}


	public mcframe.serverMS.dbc.MST_PAY_NOTE_R pn(){
		return (mcframe.serverMS.dbc.MST_PAY_NOTE_R) getConstInnerRow(offset + 4, $pn);
	}
	
	public void pn(mcframe.serverMS.dbc.MST_PAY_NOTE_R row){
		setConstInnerRow(offset + 4, $pn, row);
	}


	/**
	 * Not for update counter check 更新カウンタチェック対象外.<p>
	 *
	 */
	public boolean upd_cntr_not_chk_flg() {
		return getConstBoolean(offset + 5, $upd_cntr_not_chk_flg);
	}

	/**
	 * Not for update counter check 更新カウンタチェック対象外.<p>
	 *
	 */
	public void upd_cntr_not_chk_flg(boolean value) {
		setConstBoolean(offset + 5, $upd_cntr_not_chk_flg, value);
	}


	/**
	 * Not for DAC check ＤＡＣチェック対象外.<p>
	 *
	 */
	public boolean dac_not_chk_flg() {
		return getConstBoolean(offset + 6, $dac_not_chk_flg);
	}

	/**
	 * Not for DAC check ＤＡＣチェック対象外.<p>
	 *
	 */
	public void dac_not_chk_flg(boolean value) {
		setConstBoolean(offset + 6, $dac_not_chk_flg, value);
	}


	/**
	 * Payment dept. conversion 支払部門変換.<p>
	 *
	 */
	public boolean pay_dpt_chng_flg() {
		return getConstBoolean(offset + 7, $pay_dpt_chng_flg);
	}

	/**
	 * Payment dept. conversion 支払部門変換.<p>
	 *
	 */
	public void pay_dpt_chng_flg(boolean value) {
		setConstBoolean(offset + 7, $pay_dpt_chng_flg, value);
	}


	/**
	 * Note sight upper limit 手形サイト上限.<p>
	 *
	 */
	public MCNumber note_days_lmt() {
		return getConstNumber(offset + 8, $note_days_lmt);
	}

	/**
	 * Note sight upper limit 手形サイト上限.<p>
	 *
	 */
	public void note_days_lmt(MCNumber value) {
		setConstNumber(offset + 8, $note_days_lmt, value);
	}

	/**
	 * Note sight upper limit 手形サイト上限.<p>
	 *
	 */
	public void note_days_lmt(int value) {
		setConstNumber(offset + 8, $note_days_lmt, value);
	}

	/**
	 * Note sight upper limit 手形サイト上限.<p>
	 *
	 */
	public void note_days_lmt(long value) {
		setConstNumber(offset + 8, $note_days_lmt, value);
	}

	/**
	 * Note sight upper limit 手形サイト上限.<p>
	 *
	 */
	public void note_days_lmt(float value) {
		setConstNumber(offset + 8, $note_days_lmt, value);
	}

	/**
	 * Note sight upper limit 手形サイト上限.<p>
	 *
	 */
	public void note_days_lmt(double value) {
		setConstNumber(offset + 8, $note_days_lmt, value);
	}


	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_cur_amt_dec_place() {
		return getConstNumber(offset + 9, $trd_cur_amt_dec_place);
	}

	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 9, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(int value) {
		setConstNumber(offset + 9, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(long value) {
		setConstNumber(offset + 9, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(float value) {
		setConstNumber(offset + 9, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(double value) {
		setConstNumber(offset + 9, $trd_cur_amt_dec_place, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 10, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 10, $err_flg, value);
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
		if ($note_days_lmt.equalsIgnoreCase(name)) {
			return note_days_lmt();
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_amt_dec_place();
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
		if ($upd_cntr_not_chk_flg.equalsIgnoreCase(name)) {
			return upd_cntr_not_chk_flg();
		}
		if ($dac_not_chk_flg.equalsIgnoreCase(name)) {
			return dac_not_chk_flg();
		}
		if ($pay_dpt_chng_flg.equalsIgnoreCase(name)) {
			return pay_dpt_chng_flg();
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
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($note_days_lmt.equalsIgnoreCase(name)) {
			return note_days_lmt();
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_amt_dec_place();
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
		if ($upd_cntr_not_chk_flg.equalsIgnoreCase(name)) {
			return upd_cntr_not_chk_flg();
		}
		if ($dac_not_chk_flg.equalsIgnoreCase(name)) {
			return dac_not_chk_flg();
		}
		if ($pay_dpt_chng_flg.equalsIgnoreCase(name)) {
			return pay_dpt_chng_flg();
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
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($note_days_lmt.equalsIgnoreCase(name)) {
			note_days_lmt(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($note_days_lmt.equalsIgnoreCase(name)) {
			note_days_lmt(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($note_days_lmt.equalsIgnoreCase(name)) {
			note_days_lmt(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($note_days_lmt.equalsIgnoreCase(name)) {
			note_days_lmt(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($note_days_lmt.equalsIgnoreCase(name)) {
			note_days_lmt(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
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
		if ($upd_cntr_not_chk_flg.equalsIgnoreCase(name)) {
			upd_cntr_not_chk_flg(value);
			return;
		}
		if ($dac_not_chk_flg.equalsIgnoreCase(name)) {
			dac_not_chk_flg(value);
			return;
		}
		if ($pay_dpt_chng_flg.equalsIgnoreCase(name)) {
			pay_dpt_chng_flg(value);
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
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($note_days_lmt.equalsIgnoreCase(name)) {
			note_days_lmt(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($note_days_lmt.equalsIgnoreCase(name)) {
			note_days_lmt(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($note_days_lmt.equalsIgnoreCase(name)) {
			note_days_lmt(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($note_days_lmt.equalsIgnoreCase(name)) {
			note_days_lmt(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($note_days_lmt.equalsIgnoreCase(name)) {
			note_days_lmt(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
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
		if ($upd_cntr_not_chk_flg.equalsIgnoreCase(name)) {
			upd_cntr_not_chk_flg(value);
			return;
		}
		if ($dac_not_chk_flg.equalsIgnoreCase(name)) {
			dac_not_chk_flg(value);
			return;
		}
		if ($pay_dpt_chng_flg.equalsIgnoreCase(name)) {
			pay_dpt_chng_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($pa.equalsIgnoreCase(name)) {
			return pa();
		}
		if ($pn.equalsIgnoreCase(name)) {
			return pn();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($pa.equalsIgnoreCase(name)) {
			pa(
				((MCContainerMeta) pa_META).castInnerRow(mcframe.serverMS.dbc.MST_PAY_ACT_R.class, value)
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
	 * Payment result No. 支払実績ＮＯ.<p>
	 *
	 */
	public String pay_act_no() {
		return pa().pay_act_no();
	}

	/**
	 * Payment result No. 支払実績ＮＯ.<p>
	 *
	 */
	public void pay_act_no(String value) {
		pa().pay_act_no(value);
	}

	/**
	 * Payment result sequence No. 支払実績連番.<p>
	 *
	 */
	public MCNumber pay_act_seq() {
		return pa().pay_act_seq();
	}

	/**
	 * Payment result sequence No. 支払実績連番.<p>
	 *
	 */
	public void pay_act_seq(MCNumber value) {
		pa().pay_act_seq(value);
	}

	/**
	 * Payment result sequence No. 支払実績連番.<p>
	 *
	 */
	public void pay_act_seq(int value) {
		pa().pay_act_seq(value);
	}

	/**
	 * Payment result sequence No. 支払実績連番.<p>
	 *
	 */
	public void pay_act_seq(long value) {
		pa().pay_act_seq(value);
	}

	/**
	 * Payment result sequence No. 支払実績連番.<p>
	 *
	 */
	public void pay_act_seq(float value) {
		pa().pay_act_seq(value);
	}

	/**
	 * Payment result sequence No. 支払実績連番.<p>
	 *
	 */
	public void pay_act_seq(double value) {
		pa().pay_act_seq(value);
	}

	/**
	 * Payment result revision number 支払実績改訂番号.<p>
	 *
	 */
	public MCNumber pay_act_rev() {
		return pa().pay_act_rev();
	}

	/**
	 * Payment result revision number 支払実績改訂番号.<p>
	 *
	 */
	public void pay_act_rev(MCNumber value) {
		pa().pay_act_rev(value);
	}

	/**
	 * Payment result revision number 支払実績改訂番号.<p>
	 *
	 */
	public void pay_act_rev(int value) {
		pa().pay_act_rev(value);
	}

	/**
	 * Payment result revision number 支払実績改訂番号.<p>
	 *
	 */
	public void pay_act_rev(long value) {
		pa().pay_act_rev(value);
	}

	/**
	 * Payment result revision number 支払実績改訂番号.<p>
	 *
	 */
	public void pay_act_rev(float value) {
		pa().pay_act_rev(value);
	}

	/**
	 * Payment result revision number 支払実績改訂番号.<p>
	 *
	 */
	public void pay_act_rev(double value) {
		pa().pay_act_rev(value);
	}

	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public String slip_sts_typ() {
		return pa().slip_sts_typ();
	}

	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public void slip_sts_typ(String value) {
		pa().slip_sts_typ(value);
	}

	/**
	 * Payee cd. 支払先ＣＤ.<p>
	 *
	 */
	public String psppl_cd() {
		return pa().psppl_cd();
	}

	/**
	 * Payee cd. 支払先ＣＤ.<p>
	 *
	 */
	public void psppl_cd(String value) {
		pa().psppl_cd(value);
	}

	/**
	 * Payment dept. cd. 支払部門ＣＤ.<p>
	 *
	 */
	public String pay_dpt_cd() {
		return pa().pay_dpt_cd();
	}

	/**
	 * Payment dept. cd. 支払部門ＣＤ.<p>
	 *
	 */
	public void pay_dpt_cd(String value) {
		pa().pay_dpt_cd(value);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return pa().wg_cd();
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		pa().wg_cd(value);
	}

	/**
	 * Payment PIC cd. 支払担当者ＣＤ.<p>
	 *
	 */
	public String pay_usr_cd() {
		return pa().pay_usr_cd();
	}

	/**
	 * Payment PIC cd. 支払担当者ＣＤ.<p>
	 *
	 */
	public void pay_usr_cd(String value) {
		pa().pay_usr_cd(value);
	}

	/**
	 * Actual payment date 支払実績日.<p>
	 *
	 */
	public MCDate pay_act_dt() {
		return pa().pay_act_dt();
	}

	/**
	 * Actual payment date 支払実績日.<p>
	 *
	 */
	public void pay_act_dt(MCDate value) {
		pa().pay_act_dt(value);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return pa().ac_dt();
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		pa().ac_dt(value);
	}

	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public MCDate ac_ym() {
		return pa().ac_ym();
	}

	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public void ac_ym(MCDate value) {
		pa().ac_ym(value);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return pa().trd_cur_cd();
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		pa().trd_cur_cd(value);
	}

	/**
	 * Payment base date 支払起算日.<p>
	 *
	 */
	public MCDate pay_basis_dt() {
		return pa().pay_basis_dt();
	}

	/**
	 * Payment base date 支払起算日.<p>
	 *
	 */
	public void pay_basis_dt(MCDate value) {
		pa().pay_basis_dt(value);
	}

	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public String base_cur_cd() {
		return pa().base_cur_cd();
	}

	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public void base_cur_cd(String value) {
		pa().base_cur_cd(value);
	}

	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public String xrate_cd() {
		return pa().xrate_cd();
	}

	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public void xrate_cd(String value) {
		pa().xrate_cd(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCNumber xrate() {
		return pa().xrate();
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		pa().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(int value) {
		pa().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(long value) {
		pa().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(float value) {
		pa().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(double value) {
		pa().xrate(value);
	}

	/**
	 * AP settlement method cd. 債務決済方法ＣＤ.<p>
	 *
	 */
	public String ap_sttl_cd() {
		return pa().ap_sttl_cd();
	}

	/**
	 * AP settlement method cd. 債務決済方法ＣＤ.<p>
	 *
	 */
	public void ap_sttl_cd(String value) {
		pa().ap_sttl_cd(value);
	}

	/**
	 * AP settlement type 債務決済区分.<p>
	 *
	 */
	public String ap_sttl_typ() {
		return pa().ap_sttl_typ();
	}

	/**
	 * AP settlement type 債務決済区分.<p>
	 *
	 */
	public void ap_sttl_typ(String value) {
		pa().ap_sttl_typ(value);
	}

	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public String bank_ac_cd() {
		return pa().bank_ac_cd();
	}

	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public void bank_ac_cd(String value) {
		pa().bank_ac_cd(value);
	}

	/**
	 * Payee account cd. 支払先口座ＣＤ.<p>
	 *
	 */
	public String pay_bank_ac_cd() {
		return pa().pay_bank_ac_cd();
	}

	/**
	 * Payee account cd. 支払先口座ＣＤ.<p>
	 *
	 */
	public void pay_bank_ac_cd(String value) {
		pa().pay_bank_ac_cd(value);
	}

	/**
	 * Offset destination type 相殺先区分.<p>
	 *
	 */
	public String ap_setoff_typ() {
		return pa().ap_setoff_typ();
	}

	/**
	 * Offset destination type 相殺先区分.<p>
	 *
	 */
	public void ap_setoff_typ(String value) {
		pa().ap_setoff_typ(value);
	}

	/**
	 * Offset destination cd. 相殺先ＣＤ.<p>
	 *
	 */
	public String setoff_cd() {
		return pa().setoff_cd();
	}

	/**
	 * Offset destination cd. 相殺先ＣＤ.<p>
	 *
	 */
	public void setoff_cd(String value) {
		pa().setoff_cd(value);
	}

	/**
	 * Offset destination name 相殺先名.<p>
	 *
	 */
	public String setoff_nm() {
		return pa().setoff_nm();
	}

	/**
	 * Offset destination name 相殺先名.<p>
	 *
	 */
	public void setoff_nm(String value) {
		pa().setoff_nm(value);
	}

	/**
	 * Offset dept. cd. 相殺部門ＣＤ.<p>
	 *
	 */
	public String so_dpt_cd() {
		return pa().so_dpt_cd();
	}

	/**
	 * Offset dept. cd. 相殺部門ＣＤ.<p>
	 *
	 */
	public void so_dpt_cd(String value) {
		pa().so_dpt_cd(value);
	}

	/**
	 * Result at schedule 予定時実績.<p>
	 *
	 */
	public boolean schd_act_flg() {
		return pa().schd_act_flg();
	}

	/**
	 * Result at schedule 予定時実績.<p>
	 *
	 */
	public void schd_act_flg(boolean value) {
		pa().schd_act_flg(value);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return pa().trd_rmrks();
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		pa().trd_rmrks(value);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return pa().intr_rmrks();
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		pa().intr_rmrks(value);
	}

	/**
	 * Parent payment result No. 親支払実績ＮＯ.<p>
	 *
	 */
	public String par_pay_act_no() {
		return pa().par_pay_act_no();
	}

	/**
	 * Parent payment result No. 親支払実績ＮＯ.<p>
	 *
	 */
	public void par_pay_act_no(String value) {
		pa().par_pay_act_no(value);
	}

	/**
	 * Parent payment result sequence No. 親支払実績連番.<p>
	 *
	 */
	public MCNumber par_pay_act_seq() {
		return pa().par_pay_act_seq();
	}

	/**
	 * Parent payment result sequence No. 親支払実績連番.<p>
	 *
	 */
	public void par_pay_act_seq(MCNumber value) {
		pa().par_pay_act_seq(value);
	}

	/**
	 * Parent payment result sequence No. 親支払実績連番.<p>
	 *
	 */
	public void par_pay_act_seq(int value) {
		pa().par_pay_act_seq(value);
	}

	/**
	 * Parent payment result sequence No. 親支払実績連番.<p>
	 *
	 */
	public void par_pay_act_seq(long value) {
		pa().par_pay_act_seq(value);
	}

	/**
	 * Parent payment result sequence No. 親支払実績連番.<p>
	 *
	 */
	public void par_pay_act_seq(float value) {
		pa().par_pay_act_seq(value);
	}

	/**
	 * Parent payment result sequence No. 親支払実績連番.<p>
	 *
	 */
	public void par_pay_act_seq(double value) {
		pa().par_pay_act_seq(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return pa().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		pa().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return pa().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		pa().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return pa().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		pa().sub_char3(value);
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
	public String pn_slip_sts_typ() {
		return pn().slip_sts_typ();
	}

	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public void pn_slip_sts_typ(String value) {
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
	public String pn_pay_act_no() {
		return pn().pay_act_no();
	}

	/**
	 * Payment result No. 支払実績ＮＯ.<p>
	 *
	 */
	public void pn_pay_act_no(String value) {
		pn().pay_act_no(value);
	}

	/**
	 * Payment result sequence No. 支払実績連番.<p>
	 *
	 */
	public MCNumber pn_pay_act_seq() {
		return pn().pay_act_seq();
	}

	/**
	 * Payment result sequence No. 支払実績連番.<p>
	 *
	 */
	public void pn_pay_act_seq(MCNumber value) {
		pn().pay_act_seq(value);
	}

	/**
	 * Payment result sequence No. 支払実績連番.<p>
	 *
	 */
	public void pn_pay_act_seq(int value) {
		pn().pay_act_seq(value);
	}

	/**
	 * Payment result sequence No. 支払実績連番.<p>
	 *
	 */
	public void pn_pay_act_seq(long value) {
		pn().pay_act_seq(value);
	}

	/**
	 * Payment result sequence No. 支払実績連番.<p>
	 *
	 */
	public void pn_pay_act_seq(float value) {
		pn().pay_act_seq(value);
	}

	/**
	 * Payment result sequence No. 支払実績連番.<p>
	 *
	 */
	public void pn_pay_act_seq(double value) {
		pn().pay_act_seq(value);
	}

	/**
	 * Advance payment amount payment result No. 前渡金支払実績ＮＯ.<p>
	 *
	 */
	public String adv_pay_act_no() {
		return pn().adv_pay_act_no();
	}

	/**
	 * Advance payment amount payment result No. 前渡金支払実績ＮＯ.<p>
	 *
	 */
	public void adv_pay_act_no(String value) {
		pn().adv_pay_act_no(value);
	}

	/**
	 * Advance payment amount payment result sequence number 前渡金支払実績連番.<p>
	 *
	 */
	public MCNumber adv_pay_act_seq() {
		return pn().adv_pay_act_seq();
	}

	/**
	 * Advance payment amount payment result sequence number 前渡金支払実績連番.<p>
	 *
	 */
	public void adv_pay_act_seq(MCNumber value) {
		pn().adv_pay_act_seq(value);
	}

	/**
	 * Advance payment amount payment result sequence number 前渡金支払実績連番.<p>
	 *
	 */
	public void adv_pay_act_seq(int value) {
		pn().adv_pay_act_seq(value);
	}

	/**
	 * Advance payment amount payment result sequence number 前渡金支払実績連番.<p>
	 *
	 */
	public void adv_pay_act_seq(long value) {
		pn().adv_pay_act_seq(value);
	}

	/**
	 * Advance payment amount payment result sequence number 前渡金支払実績連番.<p>
	 *
	 */
	public void adv_pay_act_seq(float value) {
		pn().adv_pay_act_seq(value);
	}

	/**
	 * Advance payment amount payment result sequence number 前渡金支払実績連番.<p>
	 *
	 */
	public void adv_pay_act_seq(double value) {
		pn().adv_pay_act_seq(value);
	}

	/**
	 * Accounting IF Imported 会計ＩＦ取込済.<p>
	 *
	 */
	public boolean a_imp_flg() {
		return pn().a_imp_flg();
	}

	/**
	 * Accounting IF Imported 会計ＩＦ取込済.<p>
	 *
	 */
	public void a_imp_flg(boolean value) {
		pn().a_imp_flg(value);
	}

	/**
	 * Note spare 1 手形予備１.<p>
	 *
	 */
	public String note_sub_char1() {
		return pn().sub_char1();
	}

	/**
	 * Note spare 1 手形予備１.<p>
	 *
	 */
	public void note_sub_char1(String value) {
		pn().sub_char1(value);
	}

	/**
	 * Note spare 2 手形予備２.<p>
	 *
	 */
	public String note_sub_char2() {
		return pn().sub_char2();
	}

	/**
	 * Note spare 2 手形予備２.<p>
	 *
	 */
	public void note_sub_char2(String value) {
		pn().sub_char2(value);
	}

	/**
	 * Note spare 3 手形予備３.<p>
	 *
	 */
	public String note_sub_char3() {
		return pn().sub_char3();
	}

	/**
	 * Note spare 3 手形予備３.<p>
	 *
	 */
	public void note_sub_char3(String value) {
		pn().sub_char3(value);
	}

}

