package mcframe.serverMSBG.MSBGL0210;

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
 * ブロック"Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DtlR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Reconcile 消込.<p>
	 *
	 */
	public static final String $check = "check";
	/**
	 * Header details pegged ヘッダ明細紐付.<p>
	 *
	 */
	public static final String $hdr_dtl_peg = "hdr_dtl_peg";
	/**
	 * Group sequence No. グループシーケンスＮＯ.<p>
	 *
	 */
	public static final String $grp_seq = "grp_seq";
	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public static final String $acst_cd = "acst_cd";
	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public static final String $ar_dpt_cd = "ar_dpt_cd";
	/**
	 * WG cd. ＷＧＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public static final String $bcst_cd = "bcst_cd";
	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public static final String $bill_dpt_cd = "bill_dpt_cd";
	/**
	 * AR settlement method 1 債権決済方法１.<p>
	 *
	 */
	public static final String $ar_sttl_cd1 = "ar_sttl_cd1";
	/**
	 * AR settlement type 1 債権決済区分１.<p>
	 *
	 */
	public static final String $ar_sttl_typ1 = "ar_sttl_typ1";
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public static final String $wrk_no = "wrk_no";
	/**
	 * Billing management No. 請求管理ＮＯ.<p>
	 *
	 */
	public static final String $bill_mng_no = "bill_mng_no";
	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public static final String $ar_typ = "ar_typ";
	/**
	 * Amount 1 金額１.<p>
	 *
	 */
	public static final String $amt1 = "amt1";
	/**
	 * Amount 2 金額２.<p>
	 *
	 */
	public static final String $amt2 = "amt2";
	/**
	 * Amount 3 金額３.<p>
	 *
	 */
	public static final String $amt3 = "amt3";
	/**
	 * Invoice details remarks 請求書明細備考.<p>
	 *
	 */
	public static final String $bill_d_rmrks = "bill_d_rmrks";
	/**
	 * Unreconciled balance 未消込残高.<p>
	 *
	 */
	public static final String $not_appl_bal = "not_appl_bal";
	/**
	 * Offset amount (Before update) 相殺額（更新前）.<p>
	 *
	 */
	public static final String $setoff_amt = "setoff_amt";
	/**
	 * Payment received result details No. 入金実績明細ＮＯ.<p>
	 *
	 */
	public static final String $rcv_act_d_no = "rcv_act_d_no";
	/**
	 * Payment received result details sequence number 入金実績明細連番.<p>
	 *
	 */
	public static final String $rcv_act_d_seq = "rcv_act_d_seq";
	/**
	 * AR reconciliation schedule No. 売掛消込予定ＮＯ.<p>
	 *
	 */
	public static final String $ar_appl_schd_no = "ar_appl_schd_no";
	/**
	 * AR reconciliation schedule update counter 売掛消込予定更新カウンタ.<p>
	 *
	 */
	public static final String $ar_appl_schd_upd_cntr = "ar_appl_schd_upd_cntr";


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta hdr_dtl_peg_META = createCommonMeta($hdr_dtl_peg, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta grp_seq_META = createCommonMeta($grp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta acst_cd_META = createCommonMeta($acst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta ar_dpt_cd_META = createCommonMeta($ar_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta bcst_cd_META = createCommonMeta($bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bill_dpt_cd_META = createCommonMeta($bill_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ar_sttl_cd1_META = createCommonMeta($ar_sttl_cd1, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta ar_sttl_typ1_META = createCommonMeta($ar_sttl_typ1, mcframe.commonMA.meta.MA_META.AR_STTL_TYP);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta bill_mng_no_META = createCommonMeta($bill_mng_no, mcframe.commonMA.meta.MA_META.BILL_MNG_NO);
	public static final MCMeta ar_typ_META = createCommonMeta($ar_typ, mcframe.commonMA.meta.MA_META.AR_TYP);
	public static final MCMeta amt1_META = createCommonMeta($amt1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta amt2_META = createCommonMeta($amt2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta amt3_META = createCommonMeta($amt3, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta bill_d_rmrks_META = createCommonMeta($bill_d_rmrks, mcframe.commonMS.meta.MS_META.BILL_D_RMRKS);
	public static final MCMeta not_appl_bal_META = createCommonMeta($not_appl_bal, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta setoff_amt_META = createCommonMeta($setoff_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta rcv_act_d_no_META = createCommonMeta($rcv_act_d_no, mcframe.commonMA.meta.MA_META.RCV_ACT_D_NO);
	public static final MCMeta rcv_act_d_seq_META = createCommonMeta($rcv_act_d_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta ar_appl_schd_no_META = createCommonMeta($ar_appl_schd_no, mcframe.commonMA.meta.MA_META.AR_APPL_SCHD_NO);
	public static final MCMeta ar_appl_schd_upd_cntr_META = createCommonMeta($ar_appl_schd_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			err_flg_META,
			check_META,
			hdr_dtl_peg_META,
			grp_seq_META,
			acst_cd_META,
			ar_dpt_cd_META,
			wg_cd_META,
			bcst_cd_META,
			bill_dpt_cd_META,
			ar_sttl_cd1_META,
			ar_sttl_typ1_META,
			iv_no_META,
			wrk_no_META,
			bill_mng_no_META,
			ar_typ_META,
			amt1_META,
			amt2_META,
			amt3_META,
			bill_d_rmrks_META,
			not_appl_bal_META,
			setoff_amt_META,
			rcv_act_d_no_META,
			rcv_act_d_seq_META,
			ar_appl_schd_no_META,
			ar_appl_schd_upd_cntr_META
		},
		new String[][]{
			{
			},
			{
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
				{$ar_appl_schd_no, "E"}	// ar_appl_schd_no
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
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$ar_dpt_cd, "MA.MAUAL0010.Dpt"},	// ar_dpt_cd
				{$bill_dpt_cd, "MA.MAUAL0010.Dpt"}	// bill_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$ar_dpt_cd, "wg_cd"}	// ar_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$ar_dpt_cd, "wg_cd"}	// ar_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$ar_dpt_cd, "MAC_DPT_IS_SRCH_TYP.AR"},	// ar_dpt_cd
				{$bill_dpt_cd, "bcst_cd;MAC_DPT_IS_SRCH_TYP.BCST"}	// bill_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$ar_dpt_cd, "dpt_is_srch_typ"},	// ar_dpt_cd
				{$bill_dpt_cd, "bcst_cd;dpt_is_srch_typ"}	// bill_dpt_cd
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
				{$iv_no, "E"}	// iv_no
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
	protected DtlR_MC_A(ConstMetaList<? extends DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR clone() {
		return (DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR createInstance() {
		return (DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR getValues(String... names) {
		return (DtlR) super.getValues(names);
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
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 1, $err_flg);
	}

	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 1, $err_flg, value);
	}


	/**
	 * Reconcile 消込.<p>
	 *
	 */
	public boolean check() {
		return getConstBoolean(offset + 2, $check);
	}

	/**
	 * Reconcile 消込.<p>
	 *
	 */
	public void check(boolean value) {
		setConstBoolean(offset + 2, $check, value);
	}


	/**
	 * Header details pegged ヘッダ明細紐付.<p>
	 *
	 */
	public MCNumber hdr_dtl_peg() {
		return getConstNumber(offset + 3, $hdr_dtl_peg);
	}

	/**
	 * Header details pegged ヘッダ明細紐付.<p>
	 *
	 */
	public void hdr_dtl_peg(MCNumber value) {
		setConstNumber(offset + 3, $hdr_dtl_peg, value);
	}

	/**
	 * Header details pegged ヘッダ明細紐付.<p>
	 *
	 */
	public void hdr_dtl_peg(int value) {
		setConstNumber(offset + 3, $hdr_dtl_peg, value);
	}

	/**
	 * Header details pegged ヘッダ明細紐付.<p>
	 *
	 */
	public void hdr_dtl_peg(long value) {
		setConstNumber(offset + 3, $hdr_dtl_peg, value);
	}

	/**
	 * Header details pegged ヘッダ明細紐付.<p>
	 *
	 */
	public void hdr_dtl_peg(float value) {
		setConstNumber(offset + 3, $hdr_dtl_peg, value);
	}

	/**
	 * Header details pegged ヘッダ明細紐付.<p>
	 *
	 */
	public void hdr_dtl_peg(double value) {
		setConstNumber(offset + 3, $hdr_dtl_peg, value);
	}


	/**
	 * Group sequence No. グループシーケンスＮＯ.<p>
	 *
	 */
	public MCNumber grp_seq() {
		return getConstNumber(offset + 4, $grp_seq);
	}

	/**
	 * Group sequence No. グループシーケンスＮＯ.<p>
	 *
	 */
	public void grp_seq(MCNumber value) {
		setConstNumber(offset + 4, $grp_seq, value);
	}

	/**
	 * Group sequence No. グループシーケンスＮＯ.<p>
	 *
	 */
	public void grp_seq(int value) {
		setConstNumber(offset + 4, $grp_seq, value);
	}

	/**
	 * Group sequence No. グループシーケンスＮＯ.<p>
	 *
	 */
	public void grp_seq(long value) {
		setConstNumber(offset + 4, $grp_seq, value);
	}

	/**
	 * Group sequence No. グループシーケンスＮＯ.<p>
	 *
	 */
	public void grp_seq(float value) {
		setConstNumber(offset + 4, $grp_seq, value);
	}

	/**
	 * Group sequence No. グループシーケンスＮＯ.<p>
	 *
	 */
	public void grp_seq(double value) {
		setConstNumber(offset + 4, $grp_seq, value);
	}


	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public String acst_cd() {
		return getConstString(offset + 5, $acst_cd);
	}

	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public void acst_cd(String value) {
		setConstString(offset + 5, $acst_cd, value);
	}


	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public String ar_dpt_cd() {
		return getConstString(offset + 6, $ar_dpt_cd);
	}

	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public void ar_dpt_cd(String value) {
		setConstString(offset + 6, $ar_dpt_cd, value);
	}


	/**
	 * WG cd. ＷＧＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 7, $wg_cd);
	}

	/**
	 * WG cd. ＷＧＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 7, $wg_cd, value);
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
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public String bill_dpt_cd() {
		return getConstString(offset + 9, $bill_dpt_cd);
	}

	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public void bill_dpt_cd(String value) {
		setConstString(offset + 9, $bill_dpt_cd, value);
	}


	/**
	 * AR settlement method 1 債権決済方法１.<p>
	 *
	 */
	public String ar_sttl_cd1() {
		return getConstString(offset + 10, $ar_sttl_cd1);
	}

	/**
	 * AR settlement method 1 債権決済方法１.<p>
	 *
	 */
	public void ar_sttl_cd1(String value) {
		setConstString(offset + 10, $ar_sttl_cd1, value);
	}


	/**
	 * AR settlement type 1 債権決済区分１.<p>
	 *
	 */
	public String ar_sttl_typ1() {
		return getConstString(offset + 11, $ar_sttl_typ1);
	}

	/**
	 * AR settlement type 1 債権決済区分１.<p>
	 *
	 */
	public void ar_sttl_typ1(String value) {
		setConstString(offset + 11, $ar_sttl_typ1, value);
	}


	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 12, $iv_no);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 12, $iv_no, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 13, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 13, $wrk_no, value);
	}


	/**
	 * Billing management No. 請求管理ＮＯ.<p>
	 *
	 */
	public String bill_mng_no() {
		return getConstString(offset + 14, $bill_mng_no);
	}

	/**
	 * Billing management No. 請求管理ＮＯ.<p>
	 *
	 */
	public void bill_mng_no(String value) {
		setConstString(offset + 14, $bill_mng_no, value);
	}


	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public String ar_typ() {
		return getConstString(offset + 15, $ar_typ);
	}

	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public void ar_typ(String value) {
		setConstString(offset + 15, $ar_typ, value);
	}


	/**
	 * Amount 1 金額１.<p>
	 *
	 */
	public MCNumber amt1() {
		return getConstNumber(offset + 16, $amt1);
	}

	/**
	 * Amount 1 金額１.<p>
	 *
	 */
	public void amt1(MCNumber value) {
		setConstNumber(offset + 16, $amt1, value);
	}

	/**
	 * Amount 1 金額１.<p>
	 *
	 */
	public void amt1(int value) {
		setConstNumber(offset + 16, $amt1, value);
	}

	/**
	 * Amount 1 金額１.<p>
	 *
	 */
	public void amt1(long value) {
		setConstNumber(offset + 16, $amt1, value);
	}

	/**
	 * Amount 1 金額１.<p>
	 *
	 */
	public void amt1(float value) {
		setConstNumber(offset + 16, $amt1, value);
	}

	/**
	 * Amount 1 金額１.<p>
	 *
	 */
	public void amt1(double value) {
		setConstNumber(offset + 16, $amt1, value);
	}


	/**
	 * Amount 2 金額２.<p>
	 *
	 */
	public MCNumber amt2() {
		return getConstNumber(offset + 17, $amt2);
	}

	/**
	 * Amount 2 金額２.<p>
	 *
	 */
	public void amt2(MCNumber value) {
		setConstNumber(offset + 17, $amt2, value);
	}

	/**
	 * Amount 2 金額２.<p>
	 *
	 */
	public void amt2(int value) {
		setConstNumber(offset + 17, $amt2, value);
	}

	/**
	 * Amount 2 金額２.<p>
	 *
	 */
	public void amt2(long value) {
		setConstNumber(offset + 17, $amt2, value);
	}

	/**
	 * Amount 2 金額２.<p>
	 *
	 */
	public void amt2(float value) {
		setConstNumber(offset + 17, $amt2, value);
	}

	/**
	 * Amount 2 金額２.<p>
	 *
	 */
	public void amt2(double value) {
		setConstNumber(offset + 17, $amt2, value);
	}


	/**
	 * Amount 3 金額３.<p>
	 *
	 */
	public MCNumber amt3() {
		return getConstNumber(offset + 18, $amt3);
	}

	/**
	 * Amount 3 金額３.<p>
	 *
	 */
	public void amt3(MCNumber value) {
		setConstNumber(offset + 18, $amt3, value);
	}

	/**
	 * Amount 3 金額３.<p>
	 *
	 */
	public void amt3(int value) {
		setConstNumber(offset + 18, $amt3, value);
	}

	/**
	 * Amount 3 金額３.<p>
	 *
	 */
	public void amt3(long value) {
		setConstNumber(offset + 18, $amt3, value);
	}

	/**
	 * Amount 3 金額３.<p>
	 *
	 */
	public void amt3(float value) {
		setConstNumber(offset + 18, $amt3, value);
	}

	/**
	 * Amount 3 金額３.<p>
	 *
	 */
	public void amt3(double value) {
		setConstNumber(offset + 18, $amt3, value);
	}


	/**
	 * Invoice details remarks 請求書明細備考.<p>
	 *
	 */
	public String bill_d_rmrks() {
		return getConstString(offset + 19, $bill_d_rmrks);
	}

	/**
	 * Invoice details remarks 請求書明細備考.<p>
	 *
	 */
	public void bill_d_rmrks(String value) {
		setConstString(offset + 19, $bill_d_rmrks, value);
	}


	/**
	 * Unreconciled balance 未消込残高.<p>
	 *
	 */
	public MCNumber not_appl_bal() {
		return getConstNumber(offset + 20, $not_appl_bal);
	}

	/**
	 * Unreconciled balance 未消込残高.<p>
	 *
	 */
	public void not_appl_bal(MCNumber value) {
		setConstNumber(offset + 20, $not_appl_bal, value);
	}

	/**
	 * Unreconciled balance 未消込残高.<p>
	 *
	 */
	public void not_appl_bal(int value) {
		setConstNumber(offset + 20, $not_appl_bal, value);
	}

	/**
	 * Unreconciled balance 未消込残高.<p>
	 *
	 */
	public void not_appl_bal(long value) {
		setConstNumber(offset + 20, $not_appl_bal, value);
	}

	/**
	 * Unreconciled balance 未消込残高.<p>
	 *
	 */
	public void not_appl_bal(float value) {
		setConstNumber(offset + 20, $not_appl_bal, value);
	}

	/**
	 * Unreconciled balance 未消込残高.<p>
	 *
	 */
	public void not_appl_bal(double value) {
		setConstNumber(offset + 20, $not_appl_bal, value);
	}


	/**
	 * Offset amount (Before update) 相殺額（更新前）.<p>
	 *
	 */
	public MCNumber setoff_amt() {
		return getConstNumber(offset + 21, $setoff_amt);
	}

	/**
	 * Offset amount (Before update) 相殺額（更新前）.<p>
	 *
	 */
	public void setoff_amt(MCNumber value) {
		setConstNumber(offset + 21, $setoff_amt, value);
	}

	/**
	 * Offset amount (Before update) 相殺額（更新前）.<p>
	 *
	 */
	public void setoff_amt(int value) {
		setConstNumber(offset + 21, $setoff_amt, value);
	}

	/**
	 * Offset amount (Before update) 相殺額（更新前）.<p>
	 *
	 */
	public void setoff_amt(long value) {
		setConstNumber(offset + 21, $setoff_amt, value);
	}

	/**
	 * Offset amount (Before update) 相殺額（更新前）.<p>
	 *
	 */
	public void setoff_amt(float value) {
		setConstNumber(offset + 21, $setoff_amt, value);
	}

	/**
	 * Offset amount (Before update) 相殺額（更新前）.<p>
	 *
	 */
	public void setoff_amt(double value) {
		setConstNumber(offset + 21, $setoff_amt, value);
	}


	/**
	 * Payment received result details No. 入金実績明細ＮＯ.<p>
	 *
	 */
	public String rcv_act_d_no() {
		return getConstString(offset + 22, $rcv_act_d_no);
	}

	/**
	 * Payment received result details No. 入金実績明細ＮＯ.<p>
	 *
	 */
	public void rcv_act_d_no(String value) {
		setConstString(offset + 22, $rcv_act_d_no, value);
	}


	/**
	 * Payment received result details sequence number 入金実績明細連番.<p>
	 *
	 */
	public MCNumber rcv_act_d_seq() {
		return getConstNumber(offset + 23, $rcv_act_d_seq);
	}

	/**
	 * Payment received result details sequence number 入金実績明細連番.<p>
	 *
	 */
	public void rcv_act_d_seq(MCNumber value) {
		setConstNumber(offset + 23, $rcv_act_d_seq, value);
	}

	/**
	 * Payment received result details sequence number 入金実績明細連番.<p>
	 *
	 */
	public void rcv_act_d_seq(int value) {
		setConstNumber(offset + 23, $rcv_act_d_seq, value);
	}

	/**
	 * Payment received result details sequence number 入金実績明細連番.<p>
	 *
	 */
	public void rcv_act_d_seq(long value) {
		setConstNumber(offset + 23, $rcv_act_d_seq, value);
	}

	/**
	 * Payment received result details sequence number 入金実績明細連番.<p>
	 *
	 */
	public void rcv_act_d_seq(float value) {
		setConstNumber(offset + 23, $rcv_act_d_seq, value);
	}

	/**
	 * Payment received result details sequence number 入金実績明細連番.<p>
	 *
	 */
	public void rcv_act_d_seq(double value) {
		setConstNumber(offset + 23, $rcv_act_d_seq, value);
	}


	/**
	 * AR reconciliation schedule No. 売掛消込予定ＮＯ.<p>
	 *
	 */
	public String ar_appl_schd_no() {
		return getConstString(offset + 24, $ar_appl_schd_no);
	}

	/**
	 * AR reconciliation schedule No. 売掛消込予定ＮＯ.<p>
	 *
	 */
	public void ar_appl_schd_no(String value) {
		setConstString(offset + 24, $ar_appl_schd_no, value);
	}


	/**
	 * AR reconciliation schedule update counter 売掛消込予定更新カウンタ.<p>
	 *
	 */
	public MCNumber ar_appl_schd_upd_cntr() {
		return getConstNumber(offset + 25, $ar_appl_schd_upd_cntr);
	}

	/**
	 * AR reconciliation schedule update counter 売掛消込予定更新カウンタ.<p>
	 *
	 */
	public void ar_appl_schd_upd_cntr(MCNumber value) {
		setConstNumber(offset + 25, $ar_appl_schd_upd_cntr, value);
	}

	/**
	 * AR reconciliation schedule update counter 売掛消込予定更新カウンタ.<p>
	 *
	 */
	public void ar_appl_schd_upd_cntr(int value) {
		setConstNumber(offset + 25, $ar_appl_schd_upd_cntr, value);
	}

	/**
	 * AR reconciliation schedule update counter 売掛消込予定更新カウンタ.<p>
	 *
	 */
	public void ar_appl_schd_upd_cntr(long value) {
		setConstNumber(offset + 25, $ar_appl_schd_upd_cntr, value);
	}

	/**
	 * AR reconciliation schedule update counter 売掛消込予定更新カウンタ.<p>
	 *
	 */
	public void ar_appl_schd_upd_cntr(float value) {
		setConstNumber(offset + 25, $ar_appl_schd_upd_cntr, value);
	}

	/**
	 * AR reconciliation schedule update counter 売掛消込予定更新カウンタ.<p>
	 *
	 */
	public void ar_appl_schd_upd_cntr(double value) {
		setConstNumber(offset + 25, $ar_appl_schd_upd_cntr, value);
	}


	public String getString(String name) {
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($ar_sttl_cd1.equalsIgnoreCase(name)) {
			return ar_sttl_cd1();
		}
		if ($ar_sttl_typ1.equalsIgnoreCase(name)) {
			return ar_sttl_typ1();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			return bill_mng_no();
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			return ar_typ();
		}
		if ($bill_d_rmrks.equalsIgnoreCase(name)) {
			return bill_d_rmrks();
		}
		if ($rcv_act_d_no.equalsIgnoreCase(name)) {
			return rcv_act_d_no();
		}
		if ($ar_appl_schd_no.equalsIgnoreCase(name)) {
			return ar_appl_schd_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($hdr_dtl_peg.equalsIgnoreCase(name)) {
			return hdr_dtl_peg();
		}
		if ($grp_seq.equalsIgnoreCase(name)) {
			return grp_seq();
		}
		if ($amt1.equalsIgnoreCase(name)) {
			return amt1();
		}
		if ($amt2.equalsIgnoreCase(name)) {
			return amt2();
		}
		if ($amt3.equalsIgnoreCase(name)) {
			return amt3();
		}
		if ($not_appl_bal.equalsIgnoreCase(name)) {
			return not_appl_bal();
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			return setoff_amt();
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			return rcv_act_d_seq();
		}
		if ($ar_appl_schd_upd_cntr.equalsIgnoreCase(name)) {
			return ar_appl_schd_upd_cntr();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($ar_sttl_cd1.equalsIgnoreCase(name)) {
			return ar_sttl_cd1();
		}
		if ($ar_sttl_typ1.equalsIgnoreCase(name)) {
			return ar_sttl_typ1();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			return bill_mng_no();
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			return ar_typ();
		}
		if ($bill_d_rmrks.equalsIgnoreCase(name)) {
			return bill_d_rmrks();
		}
		if ($rcv_act_d_no.equalsIgnoreCase(name)) {
			return rcv_act_d_no();
		}
		if ($ar_appl_schd_no.equalsIgnoreCase(name)) {
			return ar_appl_schd_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($hdr_dtl_peg.equalsIgnoreCase(name)) {
			return hdr_dtl_peg();
		}
		if ($grp_seq.equalsIgnoreCase(name)) {
			return grp_seq();
		}
		if ($amt1.equalsIgnoreCase(name)) {
			return amt1();
		}
		if ($amt2.equalsIgnoreCase(name)) {
			return amt2();
		}
		if ($amt3.equalsIgnoreCase(name)) {
			return amt3();
		}
		if ($not_appl_bal.equalsIgnoreCase(name)) {
			return not_appl_bal();
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			return setoff_amt();
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			return rcv_act_d_seq();
		}
		if ($ar_appl_schd_upd_cntr.equalsIgnoreCase(name)) {
			return ar_appl_schd_upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			ar_dpt_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		if ($ar_sttl_cd1.equalsIgnoreCase(name)) {
			ar_sttl_cd1(value);
			return;
		}
		if ($ar_sttl_typ1.equalsIgnoreCase(name)) {
			ar_sttl_typ1(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			bill_mng_no(value);
			return;
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			ar_typ(value);
			return;
		}
		if ($bill_d_rmrks.equalsIgnoreCase(name)) {
			bill_d_rmrks(value);
			return;
		}
		if ($rcv_act_d_no.equalsIgnoreCase(name)) {
			rcv_act_d_no(value);
			return;
		}
		if ($ar_appl_schd_no.equalsIgnoreCase(name)) {
			ar_appl_schd_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_dtl_peg.equalsIgnoreCase(name)) {
			hdr_dtl_peg(value);
			return;
		}
		if ($grp_seq.equalsIgnoreCase(name)) {
			grp_seq(value);
			return;
		}
		if ($amt1.equalsIgnoreCase(name)) {
			amt1(value);
			return;
		}
		if ($amt2.equalsIgnoreCase(name)) {
			amt2(value);
			return;
		}
		if ($amt3.equalsIgnoreCase(name)) {
			amt3(value);
			return;
		}
		if ($not_appl_bal.equalsIgnoreCase(name)) {
			not_appl_bal(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($ar_appl_schd_upd_cntr.equalsIgnoreCase(name)) {
			ar_appl_schd_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_dtl_peg.equalsIgnoreCase(name)) {
			hdr_dtl_peg(value);
			return;
		}
		if ($grp_seq.equalsIgnoreCase(name)) {
			grp_seq(value);
			return;
		}
		if ($amt1.equalsIgnoreCase(name)) {
			amt1(value);
			return;
		}
		if ($amt2.equalsIgnoreCase(name)) {
			amt2(value);
			return;
		}
		if ($amt3.equalsIgnoreCase(name)) {
			amt3(value);
			return;
		}
		if ($not_appl_bal.equalsIgnoreCase(name)) {
			not_appl_bal(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($ar_appl_schd_upd_cntr.equalsIgnoreCase(name)) {
			ar_appl_schd_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_dtl_peg.equalsIgnoreCase(name)) {
			hdr_dtl_peg(value);
			return;
		}
		if ($grp_seq.equalsIgnoreCase(name)) {
			grp_seq(value);
			return;
		}
		if ($amt1.equalsIgnoreCase(name)) {
			amt1(value);
			return;
		}
		if ($amt2.equalsIgnoreCase(name)) {
			amt2(value);
			return;
		}
		if ($amt3.equalsIgnoreCase(name)) {
			amt3(value);
			return;
		}
		if ($not_appl_bal.equalsIgnoreCase(name)) {
			not_appl_bal(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($ar_appl_schd_upd_cntr.equalsIgnoreCase(name)) {
			ar_appl_schd_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_dtl_peg.equalsIgnoreCase(name)) {
			hdr_dtl_peg(value);
			return;
		}
		if ($grp_seq.equalsIgnoreCase(name)) {
			grp_seq(value);
			return;
		}
		if ($amt1.equalsIgnoreCase(name)) {
			amt1(value);
			return;
		}
		if ($amt2.equalsIgnoreCase(name)) {
			amt2(value);
			return;
		}
		if ($amt3.equalsIgnoreCase(name)) {
			amt3(value);
			return;
		}
		if ($not_appl_bal.equalsIgnoreCase(name)) {
			not_appl_bal(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($ar_appl_schd_upd_cntr.equalsIgnoreCase(name)) {
			ar_appl_schd_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_dtl_peg.equalsIgnoreCase(name)) {
			hdr_dtl_peg(value);
			return;
		}
		if ($grp_seq.equalsIgnoreCase(name)) {
			grp_seq(value);
			return;
		}
		if ($amt1.equalsIgnoreCase(name)) {
			amt1(value);
			return;
		}
		if ($amt2.equalsIgnoreCase(name)) {
			amt2(value);
			return;
		}
		if ($amt3.equalsIgnoreCase(name)) {
			amt3(value);
			return;
		}
		if ($not_appl_bal.equalsIgnoreCase(name)) {
			not_appl_bal(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($ar_appl_schd_upd_cntr.equalsIgnoreCase(name)) {
			ar_appl_schd_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			ar_dpt_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		if ($ar_sttl_cd1.equalsIgnoreCase(name)) {
			ar_sttl_cd1(value);
			return;
		}
		if ($ar_sttl_typ1.equalsIgnoreCase(name)) {
			ar_sttl_typ1(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			bill_mng_no(value);
			return;
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			ar_typ(value);
			return;
		}
		if ($bill_d_rmrks.equalsIgnoreCase(name)) {
			bill_d_rmrks(value);
			return;
		}
		if ($rcv_act_d_no.equalsIgnoreCase(name)) {
			rcv_act_d_no(value);
			return;
		}
		if ($ar_appl_schd_no.equalsIgnoreCase(name)) {
			ar_appl_schd_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_dtl_peg.equalsIgnoreCase(name)) {
			hdr_dtl_peg(value);
			return;
		}
		if ($grp_seq.equalsIgnoreCase(name)) {
			grp_seq(value);
			return;
		}
		if ($amt1.equalsIgnoreCase(name)) {
			amt1(value);
			return;
		}
		if ($amt2.equalsIgnoreCase(name)) {
			amt2(value);
			return;
		}
		if ($amt3.equalsIgnoreCase(name)) {
			amt3(value);
			return;
		}
		if ($not_appl_bal.equalsIgnoreCase(name)) {
			not_appl_bal(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($ar_appl_schd_upd_cntr.equalsIgnoreCase(name)) {
			ar_appl_schd_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_dtl_peg.equalsIgnoreCase(name)) {
			hdr_dtl_peg(value);
			return;
		}
		if ($grp_seq.equalsIgnoreCase(name)) {
			grp_seq(value);
			return;
		}
		if ($amt1.equalsIgnoreCase(name)) {
			amt1(value);
			return;
		}
		if ($amt2.equalsIgnoreCase(name)) {
			amt2(value);
			return;
		}
		if ($amt3.equalsIgnoreCase(name)) {
			amt3(value);
			return;
		}
		if ($not_appl_bal.equalsIgnoreCase(name)) {
			not_appl_bal(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($ar_appl_schd_upd_cntr.equalsIgnoreCase(name)) {
			ar_appl_schd_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_dtl_peg.equalsIgnoreCase(name)) {
			hdr_dtl_peg(value);
			return;
		}
		if ($grp_seq.equalsIgnoreCase(name)) {
			grp_seq(value);
			return;
		}
		if ($amt1.equalsIgnoreCase(name)) {
			amt1(value);
			return;
		}
		if ($amt2.equalsIgnoreCase(name)) {
			amt2(value);
			return;
		}
		if ($amt3.equalsIgnoreCase(name)) {
			amt3(value);
			return;
		}
		if ($not_appl_bal.equalsIgnoreCase(name)) {
			not_appl_bal(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($ar_appl_schd_upd_cntr.equalsIgnoreCase(name)) {
			ar_appl_schd_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_dtl_peg.equalsIgnoreCase(name)) {
			hdr_dtl_peg(value);
			return;
		}
		if ($grp_seq.equalsIgnoreCase(name)) {
			grp_seq(value);
			return;
		}
		if ($amt1.equalsIgnoreCase(name)) {
			amt1(value);
			return;
		}
		if ($amt2.equalsIgnoreCase(name)) {
			amt2(value);
			return;
		}
		if ($amt3.equalsIgnoreCase(name)) {
			amt3(value);
			return;
		}
		if ($not_appl_bal.equalsIgnoreCase(name)) {
			not_appl_bal(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($ar_appl_schd_upd_cntr.equalsIgnoreCase(name)) {
			ar_appl_schd_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_dtl_peg.equalsIgnoreCase(name)) {
			hdr_dtl_peg(value);
			return;
		}
		if ($grp_seq.equalsIgnoreCase(name)) {
			grp_seq(value);
			return;
		}
		if ($amt1.equalsIgnoreCase(name)) {
			amt1(value);
			return;
		}
		if ($amt2.equalsIgnoreCase(name)) {
			amt2(value);
			return;
		}
		if ($amt3.equalsIgnoreCase(name)) {
			amt3(value);
			return;
		}
		if ($not_appl_bal.equalsIgnoreCase(name)) {
			not_appl_bal(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($ar_appl_schd_upd_cntr.equalsIgnoreCase(name)) {
			ar_appl_schd_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

