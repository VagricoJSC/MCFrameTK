package mcframe.serverMSLA.MSLAL9010;

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
 * ブロック"RcvRecvIf_Chk01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RcvRecvIf_Chk01_CndR_MC_A extends MCConstRow {

	public static final String $rcv = "rcv";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Payment received type 入金区分.<p>
	 *
	 */
	public static final String $rcv_typ = "rcv_typ";
	/**
	 * Payment received No. 入金ＮＯ.<p>
	 *
	 */
	public static final String $rcv_no = "rcv_no";
	/**
	 * Pegging No. 紐づけＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * For auto-reconciliation 入金自動消込対象.<p>
	 *
	 */
	public static final String $rcv_auto_appl_tgt_flg = "rcv_auto_appl_tgt_flg";
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public static final String $amt_dec_place = "amt_dec_place";
	/**
	 * Auto-reconciliation base date 自動消込基準日.<p>
	 *
	 */
	public static final String $auto_appl_basis_dt = "auto_appl_basis_dt";

	public static final String $rcst_cd = $rcv + ".rcst_cd";
	public static final String $bcst_cd = $rcv + ".bcst_cd";
	public static final String $bill_dpt_cd = $rcv + ".bill_dpt_cd";
	public static final String $rcv_dpt_cd = $rcv + ".rcv_dpt_cd";
	public static final String $rcv_usr_cd = $rcv + ".rcv_usr_cd";
	public static final String $rcv_dt = $rcv + ".rcv_dt";
	public static final String $rcv_mtd_cd = $rcv + ".rcv_mtd_cd";
	public static final String $bank_ac_cd = $rcv + ".bank_ac_cd";
	public static final String $xfr_psn = $rcv + ".xfr_psn";
	public static final String $trd_cur_cd = $rcv + ".trd_cur_cd";
	public static final String $ar_sttl_typ = $rcv + ".ar_sttl_typ";
	public static final String $bank_cd = $rcv + ".bank_cd";
	public static final String $xrate = $rcv + ".xrate";
	public static final String $rcv_amt = $rcv + ".rcv_amt";
	public static final String $com_paid = $rcv + ".com_paid";
	public static final String $rcv_rmrks = $rcv + ".rcv_rmrks";
	public static final String $note_no = $rcv + ".note_no";
	public static final String $note_typ = $rcv + ".note_typ";
	public static final String $draw_dt = $rcv + ".draw_dt";
	public static final String $due_dt = $rcv + ".due_dt";
	public static final String $drawer_nm = $rcv + ".drawer_nm";
	public static final String $endrsr = $rcv + ".endrsr";
	public static final String $accptr = $rcv + ".accptr";
	public static final String $note_rsn_cd = $rcv + ".note_rsn_cd";
	public static final String $draw_bank_cd = $rcv + ".draw_bank_cd";
	public static final String $draw_branch_cd = $rcv + ".draw_branch_cd";
	public static final String $batch_log_no = $rcv + ".batch_log_no";
	public static final String $log_sub_key1 = $rcv + ".log_sub_key1";
	public static final String $log_sub_key2 = $rcv + ".log_sub_key2";
	public static final String $data_lno = $rcv + ".data_lno";
	public static final String $data_no = $rcv + ".data_no";
	public static final String $data_crud_typ = $rcv + ".data_crud_typ";
	public static final String $ext_rcv_no = $rcv + ".ext_rcv_no";
	public static final String $exe_sts_typ = $rcv + ".exe_sts_typ";
	public static final String $ext_sys_cd = $rcv + ".ext_sys_cd";
	public static final String $ext_data_no = $rcv + ".ext_data_no";
	public static final String $ext_data_lno = $rcv + ".ext_data_lno";
	public static final String $data_make_dt = $rcv + ".data_make_dt";
	public static final String $imp_flg = $rcv + ".imp_flg";

	public static final MCMeta rcv_META = createInnerRowMeta($rcv, mcframe.serverMS.dbc.MST_RCV_RECV_IF_R.class);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcv_typ_META = createCommonMeta($rcv_typ, mcframe.commonMA.meta.MA_META.AR_STTL_TYP);
	public static final MCMeta rcv_no_META = createCommonMeta($rcv_no, mcframe.commonMA.meta.MA_META.RCV_NO);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta rcv_auto_appl_tgt_flg_META = createCommonMeta($rcv_auto_appl_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta amt_dec_place_META = createCommonMeta($amt_dec_place, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta auto_appl_basis_dt_META = createCommonMeta($auto_appl_basis_dt, mcframe.commonMA.meta.MA_META.DT);

	protected static final ConstMetaList<RcvRecvIf_Chk01_CndR> constMetas = new ConstMetaList<RcvRecvIf_Chk01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			rcv_META,
			wg_cd_META,
			err_flg_META,
			rcv_typ_META,
			rcv_no_META,
			peg_no_META,
			rcv_auto_appl_tgt_flg_META,
			amt_dec_place_META,
			auto_appl_basis_dt_META
		},
		new String[][]{
			{
				"rcst_cd",
				"bcst_cd",
				"bill_dpt_cd",
				"rcv_dpt_cd",
				"rcv_usr_cd",
				"rcv_dt",
				"rcv_mtd_cd",
				"bank_ac_cd",
				"xfr_psn",
				"trd_cur_cd",
				"ar_sttl_typ",
				"bank_cd",
				"xrate",
				"rcv_amt",
				"com_paid",
				"rcv_rmrks",
				"note_no",
				"note_typ",
				"draw_dt",
				"due_dt",
				"drawer_nm",
				"endrsr",
				"accptr",
				"note_rsn_cd",
				"draw_bank_cd",
				"draw_branch_cd",
				"batch_log_no",
				"log_sub_key1",
				"log_sub_key2",
				"data_lno",
				"data_no",
				"data_crud_typ",
				"ext_rcv_no",
				"exe_sts_typ",
				"ext_sys_cd",
				"ext_data_no",
				"ext_data_lno",
				"data_make_dt",
				"imp_flg"
			},
			{
				$rcst_cd,
				$bcst_cd,
				$bill_dpt_cd,
				$rcv_dpt_cd,
				$rcv_usr_cd,
				$rcv_dt,
				$rcv_mtd_cd,
				$bank_ac_cd,
				$xfr_psn,
				$trd_cur_cd,
				$ar_sttl_typ,
				$bank_cd,
				$xrate,
				$rcv_amt,
				$com_paid,
				$rcv_rmrks,
				$note_no,
				$note_typ,
				$draw_dt,
				$due_dt,
				$drawer_nm,
				$endrsr,
				$accptr,
				$note_rsn_cd,
				$draw_bank_cd,
				$draw_branch_cd,
				$batch_log_no,
				$log_sub_key1,
				$log_sub_key2,
				$data_lno,
				$data_no,
				$data_crud_typ,
				$ext_rcv_no,
				$exe_sts_typ,
				$ext_sys_cd,
				$ext_data_no,
				$ext_data_lno,
				$data_make_dt,
				$imp_flg
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
				{$rcv + ".rcv_dt", "draw_dt:AF"},	// rcv.rcv_dt
				{$rcv + ".draw_dt", "draw_dt:BF,due_dt:BF"},	// rcv.draw_dt
				{$rcv + ".due_dt", "due_dt:AF"}	// rcv.due_dt
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
				{$rcv + ".rcst_cd", "MA.MAUAL0010.Bp"},	// rcv.rcst_cd
				{$rcv + ".bcst_cd", "MA.MAUAL0010.Bp"},	// rcv.bcst_cd
				{$rcv + ".bill_dpt_cd", "MA.MAUAL0010.Dpt"},	// rcv.bill_dpt_cd
				{$rcv + ".rcv_dpt_cd", "MA.MAUAL0010.Dpt"},	// rcv.rcv_dpt_cd
				{$rcv + ".rcv_usr_cd", "MA.MAUAL0010.Usr"},	// rcv.rcv_usr_cd
				{$rcv + ".bank_ac_cd", "MA.MAUAL0010.IntBankAc"},	// rcv.bank_ac_cd
				{$rcv + ".trd_cur_cd", "MA.MAUAL0010.Cur"},	// rcv.trd_cur_cd
				{$rcv + ".note_rsn_cd", "MA.MAUAL0010.NoteRsn"},	// rcv.note_rsn_cd
				{$rcv + ".draw_bank_cd", "MA.MAUAL0010.Bank"},	// rcv.draw_bank_cd
				{$rcv + ".draw_branch_cd", "MA.MAUAL0010.BankBranch"},	// rcv.draw_branch_cd
				{$rcv + ".ext_sys_cd", "MA.MAUAL0010.ExtSys"}	// rcv.ext_sys_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$rcv + ".rcv_dpt_cd", "wg_cd"},	// rcv.rcv_dpt_cd
				{$rcv + ".trd_cur_cd", "amt_dec_place"}	// rcv.trd_cur_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$rcv + ".trd_cur_cd", "amt_dec_place"}	// rcv.trd_cur_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$rcv + ".rcst_cd", "MAC_BP_IS_SRCH_TYP.RCST"},	// rcv.rcst_cd
				{$rcv + ".bcst_cd", "MAC_BP_IS_SRCH_TYP.BCST_BY_RCST;rcst_cd"},	// rcv.bcst_cd
				{$rcv + ".bill_dpt_cd", "rcv_dt;bcst_cd;MAC_DPT_IS_SRCH_TYP.BCST"},	// rcv.bill_dpt_cd
				{$rcv + ".rcv_dpt_cd", "rcv_dt;MAC_DPT_IS_SRCH_TYP.AR;rcv_usr_cd"},	// rcv.rcv_dpt_cd
				{$rcv + ".draw_branch_cd", "draw_bank_cd"},	// rcv.draw_branch_cd
				{$rcv + ".ext_sys_cd", "ext_sys_cd"}	// rcv.ext_sys_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$rcv + ".rcst_cd", "bp_is_srch_typ"},	// rcv.rcst_cd
				{$rcv + ".bcst_cd", "bp_is_srch_typ;in_rcst_cd"},	// rcv.bcst_cd
				{$rcv + ".bill_dpt_cd", "dt;bcst_cd;dpt_is_srch_typ"},	// rcv.bill_dpt_cd
				{$rcv + ".rcv_dpt_cd", "dt;dpt_is_srch_typ;usr_cd"},	// rcv.rcv_dpt_cd
				{$rcv + ".draw_branch_cd", "bank_cd"}	// rcv.draw_branch_cd
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$rcv + ".note_typ", "MAC_NOTE_TYP"},	// rcv.note_typ
				{$rcv + ".data_crud_typ", "MAC_DATA_CRUD_TYP"}	// rcv.data_crud_typ
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
	protected RcvRecvIf_Chk01_CndR_MC_A(ConstMetaList<? extends RcvRecvIf_Chk01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RcvRecvIf_Chk01_CndR clone() {
		return (RcvRecvIf_Chk01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RcvRecvIf_Chk01_CndR createInstance() {
		return (RcvRecvIf_Chk01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RcvRecvIf_Chk01_CndR getValues(String... names) {
		return (RcvRecvIf_Chk01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	public mcframe.serverMS.dbc.MST_RCV_RECV_IF_R rcv(){
		return (mcframe.serverMS.dbc.MST_RCV_RECV_IF_R) getConstInnerRow(offset + 0, $rcv);
	}
	
	public void rcv(mcframe.serverMS.dbc.MST_RCV_RECV_IF_R row){
		setConstInnerRow(offset + 0, $rcv, row);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 1, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 1, $wg_cd, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 2, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 2, $err_flg, value);
	}


	/**
	 * Payment received type 入金区分.<p>
	 *
	 */
	public String rcv_typ() {
		return getConstString(offset + 3, $rcv_typ);
	}

	/**
	 * Payment received type 入金区分.<p>
	 *
	 */
	public void rcv_typ(String value) {
		setConstString(offset + 3, $rcv_typ, value);
	}


	/**
	 * Payment received No. 入金ＮＯ.<p>
	 *
	 */
	public String rcv_no() {
		return getConstString(offset + 4, $rcv_no);
	}

	/**
	 * Payment received No. 入金ＮＯ.<p>
	 *
	 */
	public void rcv_no(String value) {
		setConstString(offset + 4, $rcv_no, value);
	}


	/**
	 * Pegging No. 紐づけＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 5, $peg_no);
	}

	/**
	 * Pegging No. 紐づけＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 5, $peg_no, value);
	}

	/**
	 * Pegging No. 紐づけＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 5, $peg_no, value);
	}

	/**
	 * Pegging No. 紐づけＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 5, $peg_no, value);
	}

	/**
	 * Pegging No. 紐づけＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 5, $peg_no, value);
	}

	/**
	 * Pegging No. 紐づけＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 5, $peg_no, value);
	}


	/**
	 * For auto-reconciliation 入金自動消込対象.<p>
	 *
	 */
	public boolean rcv_auto_appl_tgt_flg() {
		return getConstBoolean(offset + 6, $rcv_auto_appl_tgt_flg);
	}

	/**
	 * For auto-reconciliation 入金自動消込対象.<p>
	 *
	 */
	public void rcv_auto_appl_tgt_flg(boolean value) {
		setConstBoolean(offset + 6, $rcv_auto_appl_tgt_flg, value);
	}


	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber amt_dec_place() {
		return getConstNumber(offset + 7, $amt_dec_place);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(MCNumber value) {
		setConstNumber(offset + 7, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(int value) {
		setConstNumber(offset + 7, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(long value) {
		setConstNumber(offset + 7, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(float value) {
		setConstNumber(offset + 7, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(double value) {
		setConstNumber(offset + 7, $amt_dec_place, value);
	}


	/**
	 * Auto-reconciliation base date 自動消込基準日.<p>
	 *
	 */
	public MCDate auto_appl_basis_dt() {
		return getConstDate(offset + 8, $auto_appl_basis_dt);
	}

	/**
	 * Auto-reconciliation base date 自動消込基準日.<p>
	 *
	 */
	public void auto_appl_basis_dt(MCDate value) {
		setConstDate(offset + 8, $auto_appl_basis_dt, value);
	}


	public String getString(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($rcv_typ.equalsIgnoreCase(name)) {
			return rcv_typ();
		}
		if ($rcv_no.equalsIgnoreCase(name)) {
			return rcv_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($auto_appl_basis_dt.equalsIgnoreCase(name)) {
			return auto_appl_basis_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($rcv_auto_appl_tgt_flg.equalsIgnoreCase(name)) {
			return rcv_auto_appl_tgt_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($rcv_typ.equalsIgnoreCase(name)) {
			return rcv_typ();
		}
		if ($rcv_no.equalsIgnoreCase(name)) {
			return rcv_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($auto_appl_basis_dt.equalsIgnoreCase(name)) {
			return auto_appl_basis_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($rcv_auto_appl_tgt_flg.equalsIgnoreCase(name)) {
			return rcv_auto_appl_tgt_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($rcv_typ.equalsIgnoreCase(name)) {
			rcv_typ(value);
			return;
		}
		if ($rcv_no.equalsIgnoreCase(name)) {
			rcv_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($auto_appl_basis_dt.equalsIgnoreCase(name)) {
			auto_appl_basis_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($rcv_auto_appl_tgt_flg.equalsIgnoreCase(name)) {
			rcv_auto_appl_tgt_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($rcv_typ.equalsIgnoreCase(name)) {
			rcv_typ(value);
			return;
		}
		if ($rcv_no.equalsIgnoreCase(name)) {
			rcv_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($auto_appl_basis_dt.equalsIgnoreCase(name)) {
			auto_appl_basis_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($rcv_auto_appl_tgt_flg.equalsIgnoreCase(name)) {
			rcv_auto_appl_tgt_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($rcv.equalsIgnoreCase(name)) {
			return rcv();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($rcv.equalsIgnoreCase(name)) {
			rcv(
				((MCContainerMeta) rcv_META).castInnerRow(mcframe.serverMS.dbc.MST_RCV_RECV_IF_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public String rcst_cd() {
		return rcv().rcst_cd();
	}

	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public void rcst_cd(String value) {
		rcv().rcst_cd(value);
	}

	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public String bcst_cd() {
		return rcv().bcst_cd();
	}

	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public void bcst_cd(String value) {
		rcv().bcst_cd(value);
	}

	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public String bill_dpt_cd() {
		return rcv().bill_dpt_cd();
	}

	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public void bill_dpt_cd(String value) {
		rcv().bill_dpt_cd(value);
	}

	/**
	 * Payment receiving dept. cd. 入金部門ＣＤ.<p>
	 *
	 */
	public String rcv_dpt_cd() {
		return rcv().rcv_dpt_cd();
	}

	/**
	 * Payment receiving dept. cd. 入金部門ＣＤ.<p>
	 *
	 */
	public void rcv_dpt_cd(String value) {
		rcv().rcv_dpt_cd(value);
	}

	/**
	 * Payment received PIC cd. 入金担当者ＣＤ.<p>
	 *
	 */
	public String rcv_usr_cd() {
		return rcv().rcv_usr_cd();
	}

	/**
	 * Payment received PIC cd. 入金担当者ＣＤ.<p>
	 *
	 */
	public void rcv_usr_cd(String value) {
		rcv().rcv_usr_cd(value);
	}

	/**
	 * Payment received date 入金日.<p>
	 *
	 */
	public MCDate rcv_dt() {
		return rcv().rcv_dt();
	}

	/**
	 * Payment received date 入金日.<p>
	 *
	 */
	public void rcv_dt(MCDate value) {
		rcv().rcv_dt(value);
	}

	/**
	 * Payment received method cd. 入金方法ＣＤ.<p>
	 *
	 */
	public String rcv_mtd_cd() {
		return rcv().rcv_mtd_cd();
	}

	/**
	 * Payment received method cd. 入金方法ＣＤ.<p>
	 *
	 */
	public void rcv_mtd_cd(String value) {
		rcv().rcv_mtd_cd(value);
	}

	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public String bank_ac_cd() {
		return rcv().bank_ac_cd();
	}

	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public void bank_ac_cd(String value) {
		rcv().bank_ac_cd(value);
	}

	/**
	 * Payment person name 振込人名.<p>
	 *
	 */
	public String xfr_psn() {
		return rcv().xfr_psn();
	}

	/**
	 * Payment person name 振込人名.<p>
	 *
	 */
	public void xfr_psn(String value) {
		rcv().xfr_psn(value);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return rcv().trd_cur_cd();
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		rcv().trd_cur_cd(value);
	}

	/**
	 * AR settlement type 債権決済区分.<p>
	 *
	 */
	public String ar_sttl_typ() {
		return rcv().ar_sttl_typ();
	}

	/**
	 * AR settlement type 債権決済区分.<p>
	 *
	 */
	public void ar_sttl_typ(String value) {
		rcv().ar_sttl_typ(value);
	}

	/**
	 * Bank cd. 銀行ＣＤ.<p>
	 *
	 */
	public String bank_cd() {
		return rcv().bank_cd();
	}

	/**
	 * Bank cd. 銀行ＣＤ.<p>
	 *
	 */
	public void bank_cd(String value) {
		rcv().bank_cd(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCNumber xrate() {
		return rcv().xrate();
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		rcv().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(int value) {
		rcv().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(long value) {
		rcv().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(float value) {
		rcv().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(double value) {
		rcv().xrate(value);
	}

	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public MCNumber rcv_amt() {
		return rcv().rcv_amt();
	}

	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public void rcv_amt(MCNumber value) {
		rcv().rcv_amt(value);
	}

	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public void rcv_amt(int value) {
		rcv().rcv_amt(value);
	}

	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public void rcv_amt(long value) {
		rcv().rcv_amt(value);
	}

	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public void rcv_amt(float value) {
		rcv().rcv_amt(value);
	}

	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public void rcv_amt(double value) {
		rcv().rcv_amt(value);
	}

	/**
	 * Transfer fee 振込手数料.<p>
	 *
	 */
	public MCNumber com_paid() {
		return rcv().com_paid();
	}

	/**
	 * Transfer fee 振込手数料.<p>
	 *
	 */
	public void com_paid(MCNumber value) {
		rcv().com_paid(value);
	}

	/**
	 * Transfer fee 振込手数料.<p>
	 *
	 */
	public void com_paid(int value) {
		rcv().com_paid(value);
	}

	/**
	 * Transfer fee 振込手数料.<p>
	 *
	 */
	public void com_paid(long value) {
		rcv().com_paid(value);
	}

	/**
	 * Transfer fee 振込手数料.<p>
	 *
	 */
	public void com_paid(float value) {
		rcv().com_paid(value);
	}

	/**
	 * Transfer fee 振込手数料.<p>
	 *
	 */
	public void com_paid(double value) {
		rcv().com_paid(value);
	}

	/**
	 * Payment received remarks 入金備考.<p>
	 *
	 */
	public String rcv_rmrks() {
		return rcv().rcv_rmrks();
	}

	/**
	 * Payment received remarks 入金備考.<p>
	 *
	 */
	public void rcv_rmrks(String value) {
		rcv().rcv_rmrks(value);
	}

	/**
	 * Note number 手形番号.<p>
	 *
	 */
	public String note_no() {
		return rcv().note_no();
	}

	/**
	 * Note number 手形番号.<p>
	 *
	 */
	public void note_no(String value) {
		rcv().note_no(value);
	}

	/**
	 * Note type 手形区分.<p>
	 *
	 */
	public String note_typ() {
		return rcv().note_typ();
	}

	/**
	 * Note type 手形区分.<p>
	 *
	 */
	public void note_typ(String value) {
		rcv().note_typ(value);
	}

	/**
	 * Drawing date 振出日.<p>
	 *
	 */
	public MCDate draw_dt() {
		return rcv().draw_dt();
	}

	/**
	 * Drawing date 振出日.<p>
	 *
	 */
	public void draw_dt(MCDate value) {
		rcv().draw_dt(value);
	}

	/**
	 * Payment due date 支払期日.<p>
	 *
	 */
	public MCDate due_dt() {
		return rcv().due_dt();
	}

	/**
	 * Payment due date 支払期日.<p>
	 *
	 */
	public void due_dt(MCDate value) {
		rcv().due_dt(value);
	}

	/**
	 * Drawer name 振出人名.<p>
	 *
	 */
	public String drawer_nm() {
		return rcv().drawer_nm();
	}

	/**
	 * Drawer name 振出人名.<p>
	 *
	 */
	public void drawer_nm(String value) {
		rcv().drawer_nm(value);
	}

	/**
	 * Endorser 裏書人.<p>
	 *
	 */
	public String endrsr() {
		return rcv().endrsr();
	}

	/**
	 * Endorser 裏書人.<p>
	 *
	 */
	public void endrsr(String value) {
		rcv().endrsr(value);
	}

	/**
	 * Accepted by 引受人.<p>
	 *
	 */
	public String accptr() {
		return rcv().accptr();
	}

	/**
	 * Accepted by 引受人.<p>
	 *
	 */
	public void accptr(String value) {
		rcv().accptr(value);
	}

	/**
	 * Note reason cd. 手形理由ＣＤ.<p>
	 *
	 */
	public String note_rsn_cd() {
		return rcv().note_rsn_cd();
	}

	/**
	 * Note reason cd. 手形理由ＣＤ.<p>
	 *
	 */
	public void note_rsn_cd(String value) {
		rcv().note_rsn_cd(value);
	}

	/**
	 * Drawing bank cd. 振出銀行ＣＤ.<p>
	 *
	 */
	public String draw_bank_cd() {
		return rcv().draw_bank_cd();
	}

	/**
	 * Drawing bank cd. 振出銀行ＣＤ.<p>
	 *
	 */
	public void draw_bank_cd(String value) {
		rcv().draw_bank_cd(value);
	}

	/**
	 * Drawing branch cd. 振出支店ＣＤ.<p>
	 *
	 */
	public String draw_branch_cd() {
		return rcv().draw_branch_cd();
	}

	/**
	 * Drawing branch cd. 振出支店ＣＤ.<p>
	 *
	 */
	public void draw_branch_cd(String value) {
		rcv().draw_branch_cd(value);
	}

	/**
	 * Log No. ログＮＯ.<p>
	 *
	 */
	public String batch_log_no() {
		return rcv().batch_log_no();
	}

	/**
	 * Log No. ログＮＯ.<p>
	 *
	 */
	public void batch_log_no(String value) {
		rcv().batch_log_no(value);
	}

	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public MCNumber log_sub_key1() {
		return rcv().log_sub_key1();
	}

	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public void log_sub_key1(MCNumber value) {
		rcv().log_sub_key1(value);
	}

	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public void log_sub_key1(int value) {
		rcv().log_sub_key1(value);
	}

	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public void log_sub_key1(long value) {
		rcv().log_sub_key1(value);
	}

	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public void log_sub_key1(float value) {
		rcv().log_sub_key1(value);
	}

	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public void log_sub_key1(double value) {
		rcv().log_sub_key1(value);
	}

	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public MCNumber log_sub_key2() {
		return rcv().log_sub_key2();
	}

	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public void log_sub_key2(MCNumber value) {
		rcv().log_sub_key2(value);
	}

	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public void log_sub_key2(int value) {
		rcv().log_sub_key2(value);
	}

	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public void log_sub_key2(long value) {
		rcv().log_sub_key2(value);
	}

	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public void log_sub_key2(float value) {
		rcv().log_sub_key2(value);
	}

	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public void log_sub_key2(double value) {
		rcv().log_sub_key2(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public MCNumber data_lno() {
		return rcv().data_lno();
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(MCNumber value) {
		rcv().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(int value) {
		rcv().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(long value) {
		rcv().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(float value) {
		rcv().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(double value) {
		rcv().data_lno(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public MCNumber data_no() {
		return rcv().data_no();
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(MCNumber value) {
		rcv().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(int value) {
		rcv().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(long value) {
		rcv().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(float value) {
		rcv().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(double value) {
		rcv().data_no(value);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return rcv().data_crud_typ();
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		rcv().data_crud_typ(value);
	}

	/**
	 * External payment received No. 外部入金ＮＯ.<p>
	 *
	 */
	public String ext_rcv_no() {
		return rcv().ext_rcv_no();
	}

	/**
	 * External payment received No. 外部入金ＮＯ.<p>
	 *
	 */
	public void ext_rcv_no(String value) {
		rcv().ext_rcv_no(value);
	}

	/**
	 * PG execution status type ＰＧ実行状況区分.<p>
	 *
	 */
	public String exe_sts_typ() {
		return rcv().exe_sts_typ();
	}

	/**
	 * PG execution status type ＰＧ実行状況区分.<p>
	 *
	 */
	public void exe_sts_typ(String value) {
		rcv().exe_sts_typ(value);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return rcv().ext_sys_cd();
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		rcv().ext_sys_cd(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public MCNumber ext_data_no() {
		return rcv().ext_data_no();
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(MCNumber value) {
		rcv().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(int value) {
		rcv().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(long value) {
		rcv().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(float value) {
		rcv().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(double value) {
		rcv().ext_data_no(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public MCNumber ext_data_lno() {
		return rcv().ext_data_lno();
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(MCNumber value) {
		rcv().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(int value) {
		rcv().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(long value) {
		rcv().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(float value) {
		rcv().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(double value) {
		rcv().ext_data_lno(value);
	}

	/**
	 * Creation date and time of source record 送信元レコード作成日時.<p>
	 *
	 */
	public MCDate data_make_dt() {
		return rcv().data_make_dt();
	}

	/**
	 * Creation date and time of source record 送信元レコード作成日時.<p>
	 *
	 */
	public void data_make_dt(MCDate value) {
		rcv().data_make_dt(value);
	}

	/**
	 * To import 取込対象.<p>
	 *
	 */
	public boolean imp_flg() {
		return rcv().imp_flg();
	}

	/**
	 * To import 取込対象.<p>
	 *
	 */
	public void imp_flg(boolean value) {
		rcv().imp_flg(value);
	}

}

