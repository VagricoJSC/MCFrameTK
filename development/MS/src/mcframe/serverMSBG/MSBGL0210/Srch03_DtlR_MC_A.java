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
 * ブロック"Srch03_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch03_DtlR_MC_A extends MCConstRow {

	/**
	 * Reconciled target amount 消込対象額.<p>
	 *
	 */
	public static final String $appl_tgt_amt = "appl_tgt_amt";
	/**
	 * Reconciled amount 消込額.<p>
	 *
	 */
	public static final String $appl_ttl_amt = "appl_ttl_amt";
	/**
	 * Reconciled amount work 消込額ワーク.<p>
	 *
	 */
	public static final String $appl_ttl_amt_w = "appl_ttl_amt_w";
	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public static final String $amt1 = "amt1";
	/**
	 * Payment received amount work 入金額ワーク.<p>
	 *
	 */
	public static final String $amt1_w = "amt1_w";
	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public static final String $amt2 = "amt2";
	/**
	 * Offset amount work 相殺額ワーク.<p>
	 *
	 */
	public static final String $amt2_w = "amt2_w";
	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public static final String $amt3 = "amt3";
	/**
	 * Offset amount work 相殺額ワーク.<p>
	 *
	 */
	public static final String $amt3_w = "amt3_w";
	/**
	 * Unreconciled balance 未消込残高.<p>
	 *
	 */
	public static final String $not_appl_bal = "not_appl_bal";
	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public static final String $rcv_schd_dt = "rcv_schd_dt";
	/**
	 * Payment received method cd. 入金方法ＣＤ.<p>
	 *
	 */
	public static final String $ar_sttl_cd1 = "ar_sttl_cd1";
	/**
	 * Payment received method name 入金方法名.<p>
	 *
	 */
	public static final String $ar_sttl_nm1 = "ar_sttl_nm1";
	/**
	 * AR settlement type 債権決済区分.<p>
	 *
	 */
	public static final String $ar_sttl_typ1 = "ar_sttl_typ1";
	/**
	 * I/V No. Ｉ／Ｖ ＮＯ.<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public static final String $wrk_no = "wrk_no";
	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public static final String $wrk_nm = "wrk_nm";
	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public static final String $acst_cd = "acst_cd";
	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public static final String $acst_nm = "acst_nm";
	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public static final String $ar_dpt_cd = "ar_dpt_cd";
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public static final String $ar_dpt_nm = "ar_dpt_nm";
	/**
	 * WG cd. ＷＧ ＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * WG name ＷＧ名.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public static final String $ar_typ = "ar_typ";
	/**
	 * AR type name 債権区分名.<p>
	 *
	 */
	public static final String $ar_typ_nm = "ar_typ_nm";
	/**
	 * Billing closing month 請求締年月.<p>
	 *
	 */
	public static final String $bill_ym = "bill_ym";
	/**
	 * Billing closing day 請求締日.<p>
	 *
	 */
	public static final String $bill_cl_day = "bill_cl_day";
	/**
	 * Invoice No. 請求書ＮＯ.<p>
	 *
	 */
	public static final String $bill_no = "bill_no";
	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public static final String $bcst_cd = "bcst_cd";
	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public static final String $bcst_nm = "bcst_nm";
	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public static final String $bill_dpt_cd = "bill_dpt_cd";
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public static final String $bill_dpt_nm = "bill_dpt_nm";
	/**
	 * Invoice details remarks 請求書明細備考.<p>
	 *
	 */
	public static final String $bill_d_rmrks = "bill_d_rmrks";
	/**
	 * AR reconciliation schedule No. 売掛消込予定ＮＯ.<p>
	 *
	 */
	public static final String $ar_appl_schd_no = "ar_appl_schd_no";
	/**
	 * Billing management No. 請求管理ＮＯ.<p>
	 *
	 */
	public static final String $bill_mng_no = "bill_mng_no";
	/**
	 * Other sales orders 他受注.<p>
	 *
	 */
	public static final String $other_slo_flg = "other_slo_flg";
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
	 * AR reconciliation schedule update counter 売掛消込予定更新カウンタ.<p>
	 *
	 */
	public static final String $ar_appl_schd_upd_cntr = "ar_appl_schd_upd_cntr";


	public static final MCMeta appl_tgt_amt_META = createCommonMeta($appl_tgt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta appl_ttl_amt_META = createCommonMeta($appl_ttl_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta appl_ttl_amt_w_META = createCommonMeta($appl_ttl_amt_w, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta amt1_META = createCommonMeta($amt1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta amt1_w_META = createCommonMeta($amt1_w, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta amt2_META = createCommonMeta($amt2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta amt2_w_META = createCommonMeta($amt2_w, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta amt3_META = createCommonMeta($amt3, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta amt3_w_META = createCommonMeta($amt3_w, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta not_appl_bal_META = createCommonMeta($not_appl_bal, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta rcv_schd_dt_META = createCommonMeta($rcv_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ar_sttl_cd1_META = createCommonMeta($ar_sttl_cd1, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta ar_sttl_nm1_META = createCommonMeta($ar_sttl_nm1, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta ar_sttl_typ1_META = createCommonMeta($ar_sttl_typ1, mcframe.commonMA.meta.MA_META.AR_STTL_TYP);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta acst_cd_META = createCommonMeta($acst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta acst_nm_META = createCommonMeta($acst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta ar_dpt_cd_META = createCommonMeta($ar_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ar_dpt_nm_META = createCommonMeta($ar_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta ar_typ_META = createCommonMeta($ar_typ, mcframe.commonMA.meta.MA_META.AR_TYP);
	public static final MCMeta ar_typ_nm_META = createCommonMeta($ar_typ_nm, mcframe.commonMA.meta.MA_META.AR_TYP_NM);
	public static final MCMeta bill_ym_META = createCommonMeta($bill_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta bill_cl_day_META = createCommonMeta($bill_cl_day, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta bill_no_META = createCommonMeta($bill_no, mcframe.commonMA.meta.MA_META.BILL_NO);
	public static final MCMeta bcst_cd_META = createCommonMeta($bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bcst_nm_META = createCommonMeta($bcst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bill_dpt_cd_META = createCommonMeta($bill_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bill_dpt_nm_META = createCommonMeta($bill_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta bill_d_rmrks_META = createCommonMeta($bill_d_rmrks, mcframe.commonMS.meta.MS_META.BILL_D_RMRKS);
	public static final MCMeta ar_appl_schd_no_META = createCommonMeta($ar_appl_schd_no, mcframe.commonMA.meta.MA_META.AR_APPL_SCHD_NO);
	public static final MCMeta bill_mng_no_META = createCommonMeta($bill_mng_no, mcframe.commonMA.meta.MA_META.BILL_MNG_NO);
	public static final MCMeta other_slo_flg_META = createCommonMeta($other_slo_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcv_act_d_no_META = createCommonMeta($rcv_act_d_no, mcframe.commonMA.meta.MA_META.RCV_ACT_D_NO);
	public static final MCMeta rcv_act_d_seq_META = createCommonMeta($rcv_act_d_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta ar_appl_schd_upd_cntr_META = createCommonMeta($ar_appl_schd_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);

	protected static final ConstMetaList<Srch03_DtlR> constMetas = new ConstMetaList<Srch03_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			appl_tgt_amt_META,
			appl_ttl_amt_META,
			appl_ttl_amt_w_META,
			amt1_META,
			amt1_w_META,
			amt2_META,
			amt2_w_META,
			amt3_META,
			amt3_w_META,
			not_appl_bal_META,
			rcv_schd_dt_META,
			ar_sttl_cd1_META,
			ar_sttl_nm1_META,
			ar_sttl_typ1_META,
			iv_no_META,
			wrk_no_META,
			wrk_nm_META,
			acst_cd_META,
			acst_nm_META,
			ar_dpt_cd_META,
			ar_dpt_nm_META,
			wg_cd_META,
			wg_nm_META,
			ar_typ_META,
			ar_typ_nm_META,
			bill_ym_META,
			bill_cl_day_META,
			bill_no_META,
			bcst_cd_META,
			bcst_nm_META,
			bill_dpt_cd_META,
			bill_dpt_nm_META,
			bill_d_rmrks_META,
			ar_appl_schd_no_META,
			bill_mng_no_META,
			other_slo_flg_META,
			rcv_act_d_no_META,
			rcv_act_d_seq_META,
			ar_appl_schd_upd_cntr_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$ar_typ, "MAC_AR_TYP"}	// ar_typ
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
	protected Srch03_DtlR_MC_A(ConstMetaList<? extends Srch03_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch03_DtlR clone() {
		return (Srch03_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch03_DtlR createInstance() {
		return (Srch03_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch03_DtlR getValues(String... names) {
		return (Srch03_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Reconciled target amount 消込対象額.<p>
	 *
	 */
	public MCNumber appl_tgt_amt() {
		return getConstNumber(offset + 0, $appl_tgt_amt);
	}

	/**
	 * Reconciled target amount 消込対象額.<p>
	 *
	 */
	public void appl_tgt_amt(MCNumber value) {
		setConstNumber(offset + 0, $appl_tgt_amt, value);
	}

	/**
	 * Reconciled target amount 消込対象額.<p>
	 *
	 */
	public void appl_tgt_amt(int value) {
		setConstNumber(offset + 0, $appl_tgt_amt, value);
	}

	/**
	 * Reconciled target amount 消込対象額.<p>
	 *
	 */
	public void appl_tgt_amt(long value) {
		setConstNumber(offset + 0, $appl_tgt_amt, value);
	}

	/**
	 * Reconciled target amount 消込対象額.<p>
	 *
	 */
	public void appl_tgt_amt(float value) {
		setConstNumber(offset + 0, $appl_tgt_amt, value);
	}

	/**
	 * Reconciled target amount 消込対象額.<p>
	 *
	 */
	public void appl_tgt_amt(double value) {
		setConstNumber(offset + 0, $appl_tgt_amt, value);
	}


	/**
	 * Reconciled amount 消込額.<p>
	 *
	 */
	public MCNumber appl_ttl_amt() {
		return getConstNumber(offset + 1, $appl_ttl_amt);
	}

	/**
	 * Reconciled amount 消込額.<p>
	 *
	 */
	public void appl_ttl_amt(MCNumber value) {
		setConstNumber(offset + 1, $appl_ttl_amt, value);
	}

	/**
	 * Reconciled amount 消込額.<p>
	 *
	 */
	public void appl_ttl_amt(int value) {
		setConstNumber(offset + 1, $appl_ttl_amt, value);
	}

	/**
	 * Reconciled amount 消込額.<p>
	 *
	 */
	public void appl_ttl_amt(long value) {
		setConstNumber(offset + 1, $appl_ttl_amt, value);
	}

	/**
	 * Reconciled amount 消込額.<p>
	 *
	 */
	public void appl_ttl_amt(float value) {
		setConstNumber(offset + 1, $appl_ttl_amt, value);
	}

	/**
	 * Reconciled amount 消込額.<p>
	 *
	 */
	public void appl_ttl_amt(double value) {
		setConstNumber(offset + 1, $appl_ttl_amt, value);
	}


	/**
	 * Reconciled amount work 消込額ワーク.<p>
	 *
	 */
	public MCNumber appl_ttl_amt_w() {
		return getConstNumber(offset + 2, $appl_ttl_amt_w);
	}

	/**
	 * Reconciled amount work 消込額ワーク.<p>
	 *
	 */
	public void appl_ttl_amt_w(MCNumber value) {
		setConstNumber(offset + 2, $appl_ttl_amt_w, value);
	}

	/**
	 * Reconciled amount work 消込額ワーク.<p>
	 *
	 */
	public void appl_ttl_amt_w(int value) {
		setConstNumber(offset + 2, $appl_ttl_amt_w, value);
	}

	/**
	 * Reconciled amount work 消込額ワーク.<p>
	 *
	 */
	public void appl_ttl_amt_w(long value) {
		setConstNumber(offset + 2, $appl_ttl_amt_w, value);
	}

	/**
	 * Reconciled amount work 消込額ワーク.<p>
	 *
	 */
	public void appl_ttl_amt_w(float value) {
		setConstNumber(offset + 2, $appl_ttl_amt_w, value);
	}

	/**
	 * Reconciled amount work 消込額ワーク.<p>
	 *
	 */
	public void appl_ttl_amt_w(double value) {
		setConstNumber(offset + 2, $appl_ttl_amt_w, value);
	}


	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public MCNumber amt1() {
		return getConstNumber(offset + 3, $amt1);
	}

	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public void amt1(MCNumber value) {
		setConstNumber(offset + 3, $amt1, value);
	}

	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public void amt1(int value) {
		setConstNumber(offset + 3, $amt1, value);
	}

	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public void amt1(long value) {
		setConstNumber(offset + 3, $amt1, value);
	}

	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public void amt1(float value) {
		setConstNumber(offset + 3, $amt1, value);
	}

	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public void amt1(double value) {
		setConstNumber(offset + 3, $amt1, value);
	}


	/**
	 * Payment received amount work 入金額ワーク.<p>
	 *
	 */
	public MCNumber amt1_w() {
		return getConstNumber(offset + 4, $amt1_w);
	}

	/**
	 * Payment received amount work 入金額ワーク.<p>
	 *
	 */
	public void amt1_w(MCNumber value) {
		setConstNumber(offset + 4, $amt1_w, value);
	}

	/**
	 * Payment received amount work 入金額ワーク.<p>
	 *
	 */
	public void amt1_w(int value) {
		setConstNumber(offset + 4, $amt1_w, value);
	}

	/**
	 * Payment received amount work 入金額ワーク.<p>
	 *
	 */
	public void amt1_w(long value) {
		setConstNumber(offset + 4, $amt1_w, value);
	}

	/**
	 * Payment received amount work 入金額ワーク.<p>
	 *
	 */
	public void amt1_w(float value) {
		setConstNumber(offset + 4, $amt1_w, value);
	}

	/**
	 * Payment received amount work 入金額ワーク.<p>
	 *
	 */
	public void amt1_w(double value) {
		setConstNumber(offset + 4, $amt1_w, value);
	}


	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public MCNumber amt2() {
		return getConstNumber(offset + 5, $amt2);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void amt2(MCNumber value) {
		setConstNumber(offset + 5, $amt2, value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void amt2(int value) {
		setConstNumber(offset + 5, $amt2, value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void amt2(long value) {
		setConstNumber(offset + 5, $amt2, value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void amt2(float value) {
		setConstNumber(offset + 5, $amt2, value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void amt2(double value) {
		setConstNumber(offset + 5, $amt2, value);
	}


	/**
	 * Offset amount work 相殺額ワーク.<p>
	 *
	 */
	public MCNumber amt2_w() {
		return getConstNumber(offset + 6, $amt2_w);
	}

	/**
	 * Offset amount work 相殺額ワーク.<p>
	 *
	 */
	public void amt2_w(MCNumber value) {
		setConstNumber(offset + 6, $amt2_w, value);
	}

	/**
	 * Offset amount work 相殺額ワーク.<p>
	 *
	 */
	public void amt2_w(int value) {
		setConstNumber(offset + 6, $amt2_w, value);
	}

	/**
	 * Offset amount work 相殺額ワーク.<p>
	 *
	 */
	public void amt2_w(long value) {
		setConstNumber(offset + 6, $amt2_w, value);
	}

	/**
	 * Offset amount work 相殺額ワーク.<p>
	 *
	 */
	public void amt2_w(float value) {
		setConstNumber(offset + 6, $amt2_w, value);
	}

	/**
	 * Offset amount work 相殺額ワーク.<p>
	 *
	 */
	public void amt2_w(double value) {
		setConstNumber(offset + 6, $amt2_w, value);
	}


	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public MCNumber amt3() {
		return getConstNumber(offset + 7, $amt3);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void amt3(MCNumber value) {
		setConstNumber(offset + 7, $amt3, value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void amt3(int value) {
		setConstNumber(offset + 7, $amt3, value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void amt3(long value) {
		setConstNumber(offset + 7, $amt3, value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void amt3(float value) {
		setConstNumber(offset + 7, $amt3, value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void amt3(double value) {
		setConstNumber(offset + 7, $amt3, value);
	}


	/**
	 * Offset amount work 相殺額ワーク.<p>
	 *
	 */
	public MCNumber amt3_w() {
		return getConstNumber(offset + 8, $amt3_w);
	}

	/**
	 * Offset amount work 相殺額ワーク.<p>
	 *
	 */
	public void amt3_w(MCNumber value) {
		setConstNumber(offset + 8, $amt3_w, value);
	}

	/**
	 * Offset amount work 相殺額ワーク.<p>
	 *
	 */
	public void amt3_w(int value) {
		setConstNumber(offset + 8, $amt3_w, value);
	}

	/**
	 * Offset amount work 相殺額ワーク.<p>
	 *
	 */
	public void amt3_w(long value) {
		setConstNumber(offset + 8, $amt3_w, value);
	}

	/**
	 * Offset amount work 相殺額ワーク.<p>
	 *
	 */
	public void amt3_w(float value) {
		setConstNumber(offset + 8, $amt3_w, value);
	}

	/**
	 * Offset amount work 相殺額ワーク.<p>
	 *
	 */
	public void amt3_w(double value) {
		setConstNumber(offset + 8, $amt3_w, value);
	}


	/**
	 * Unreconciled balance 未消込残高.<p>
	 *
	 */
	public MCNumber not_appl_bal() {
		return getConstNumber(offset + 9, $not_appl_bal);
	}

	/**
	 * Unreconciled balance 未消込残高.<p>
	 *
	 */
	public void not_appl_bal(MCNumber value) {
		setConstNumber(offset + 9, $not_appl_bal, value);
	}

	/**
	 * Unreconciled balance 未消込残高.<p>
	 *
	 */
	public void not_appl_bal(int value) {
		setConstNumber(offset + 9, $not_appl_bal, value);
	}

	/**
	 * Unreconciled balance 未消込残高.<p>
	 *
	 */
	public void not_appl_bal(long value) {
		setConstNumber(offset + 9, $not_appl_bal, value);
	}

	/**
	 * Unreconciled balance 未消込残高.<p>
	 *
	 */
	public void not_appl_bal(float value) {
		setConstNumber(offset + 9, $not_appl_bal, value);
	}

	/**
	 * Unreconciled balance 未消込残高.<p>
	 *
	 */
	public void not_appl_bal(double value) {
		setConstNumber(offset + 9, $not_appl_bal, value);
	}


	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public MCDate rcv_schd_dt() {
		return getConstDate(offset + 10, $rcv_schd_dt);
	}

	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public void rcv_schd_dt(MCDate value) {
		setConstDate(offset + 10, $rcv_schd_dt, value);
	}


	/**
	 * Payment received method cd. 入金方法ＣＤ.<p>
	 *
	 */
	public String ar_sttl_cd1() {
		return getConstString(offset + 11, $ar_sttl_cd1);
	}

	/**
	 * Payment received method cd. 入金方法ＣＤ.<p>
	 *
	 */
	public void ar_sttl_cd1(String value) {
		setConstString(offset + 11, $ar_sttl_cd1, value);
	}


	/**
	 * Payment received method name 入金方法名.<p>
	 *
	 */
	public String ar_sttl_nm1() {
		return getConstString(offset + 12, $ar_sttl_nm1);
	}

	/**
	 * Payment received method name 入金方法名.<p>
	 *
	 */
	public void ar_sttl_nm1(String value) {
		setConstString(offset + 12, $ar_sttl_nm1, value);
	}


	/**
	 * AR settlement type 債権決済区分.<p>
	 *
	 */
	public String ar_sttl_typ1() {
		return getConstString(offset + 13, $ar_sttl_typ1);
	}

	/**
	 * AR settlement type 債権決済区分.<p>
	 *
	 */
	public void ar_sttl_typ1(String value) {
		setConstString(offset + 13, $ar_sttl_typ1, value);
	}


	/**
	 * I/V No. Ｉ／Ｖ ＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 14, $iv_no);
	}

	/**
	 * I/V No. Ｉ／Ｖ ＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 14, $iv_no, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 15, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 15, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 16, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 16, $wrk_nm, value);
	}


	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public String acst_cd() {
		return getConstString(offset + 17, $acst_cd);
	}

	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public void acst_cd(String value) {
		setConstString(offset + 17, $acst_cd, value);
	}


	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public String acst_nm() {
		return getConstString(offset + 18, $acst_nm);
	}

	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public void acst_nm(String value) {
		setConstString(offset + 18, $acst_nm, value);
	}


	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public String ar_dpt_cd() {
		return getConstString(offset + 19, $ar_dpt_cd);
	}

	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public void ar_dpt_cd(String value) {
		setConstString(offset + 19, $ar_dpt_cd, value);
	}


	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public String ar_dpt_nm() {
		return getConstString(offset + 20, $ar_dpt_nm);
	}

	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public void ar_dpt_nm(String value) {
		setConstString(offset + 20, $ar_dpt_nm, value);
	}


	/**
	 * WG cd. ＷＧ ＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 21, $wg_cd);
	}

	/**
	 * WG cd. ＷＧ ＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 21, $wg_cd, value);
	}


	/**
	 * WG name ＷＧ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 22, $wg_nm);
	}

	/**
	 * WG name ＷＧ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 22, $wg_nm, value);
	}


	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public String ar_typ() {
		return getConstString(offset + 23, $ar_typ);
	}

	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public void ar_typ(String value) {
		setConstString(offset + 23, $ar_typ, value);
	}


	/**
	 * AR type name 債権区分名.<p>
	 *
	 */
	public String ar_typ_nm() {
		return getConstString(offset + 24, $ar_typ_nm);
	}

	/**
	 * AR type name 債権区分名.<p>
	 *
	 */
	public void ar_typ_nm(String value) {
		setConstString(offset + 24, $ar_typ_nm, value);
	}


	/**
	 * Billing closing month 請求締年月.<p>
	 *
	 */
	public MCDate bill_ym() {
		return getConstDate(offset + 25, $bill_ym);
	}

	/**
	 * Billing closing month 請求締年月.<p>
	 *
	 */
	public void bill_ym(MCDate value) {
		setConstDate(offset + 25, $bill_ym, value);
	}


	/**
	 * Billing closing day 請求締日.<p>
	 *
	 */
	public MCNumber bill_cl_day() {
		return getConstNumber(offset + 26, $bill_cl_day);
	}

	/**
	 * Billing closing day 請求締日.<p>
	 *
	 */
	public void bill_cl_day(MCNumber value) {
		setConstNumber(offset + 26, $bill_cl_day, value);
	}

	/**
	 * Billing closing day 請求締日.<p>
	 *
	 */
	public void bill_cl_day(int value) {
		setConstNumber(offset + 26, $bill_cl_day, value);
	}

	/**
	 * Billing closing day 請求締日.<p>
	 *
	 */
	public void bill_cl_day(long value) {
		setConstNumber(offset + 26, $bill_cl_day, value);
	}

	/**
	 * Billing closing day 請求締日.<p>
	 *
	 */
	public void bill_cl_day(float value) {
		setConstNumber(offset + 26, $bill_cl_day, value);
	}

	/**
	 * Billing closing day 請求締日.<p>
	 *
	 */
	public void bill_cl_day(double value) {
		setConstNumber(offset + 26, $bill_cl_day, value);
	}


	/**
	 * Invoice No. 請求書ＮＯ.<p>
	 *
	 */
	public String bill_no() {
		return getConstString(offset + 27, $bill_no);
	}

	/**
	 * Invoice No. 請求書ＮＯ.<p>
	 *
	 */
	public void bill_no(String value) {
		setConstString(offset + 27, $bill_no, value);
	}


	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public String bcst_cd() {
		return getConstString(offset + 28, $bcst_cd);
	}

	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public void bcst_cd(String value) {
		setConstString(offset + 28, $bcst_cd, value);
	}


	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public String bcst_nm() {
		return getConstString(offset + 29, $bcst_nm);
	}

	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public void bcst_nm(String value) {
		setConstString(offset + 29, $bcst_nm, value);
	}


	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public String bill_dpt_cd() {
		return getConstString(offset + 30, $bill_dpt_cd);
	}

	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public void bill_dpt_cd(String value) {
		setConstString(offset + 30, $bill_dpt_cd, value);
	}


	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public String bill_dpt_nm() {
		return getConstString(offset + 31, $bill_dpt_nm);
	}

	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public void bill_dpt_nm(String value) {
		setConstString(offset + 31, $bill_dpt_nm, value);
	}


	/**
	 * Invoice details remarks 請求書明細備考.<p>
	 *
	 */
	public String bill_d_rmrks() {
		return getConstString(offset + 32, $bill_d_rmrks);
	}

	/**
	 * Invoice details remarks 請求書明細備考.<p>
	 *
	 */
	public void bill_d_rmrks(String value) {
		setConstString(offset + 32, $bill_d_rmrks, value);
	}


	/**
	 * AR reconciliation schedule No. 売掛消込予定ＮＯ.<p>
	 *
	 */
	public String ar_appl_schd_no() {
		return getConstString(offset + 33, $ar_appl_schd_no);
	}

	/**
	 * AR reconciliation schedule No. 売掛消込予定ＮＯ.<p>
	 *
	 */
	public void ar_appl_schd_no(String value) {
		setConstString(offset + 33, $ar_appl_schd_no, value);
	}


	/**
	 * Billing management No. 請求管理ＮＯ.<p>
	 *
	 */
	public String bill_mng_no() {
		return getConstString(offset + 34, $bill_mng_no);
	}

	/**
	 * Billing management No. 請求管理ＮＯ.<p>
	 *
	 */
	public void bill_mng_no(String value) {
		setConstString(offset + 34, $bill_mng_no, value);
	}


	/**
	 * Other sales orders 他受注.<p>
	 *
	 */
	public boolean other_slo_flg() {
		return getConstBoolean(offset + 35, $other_slo_flg);
	}

	/**
	 * Other sales orders 他受注.<p>
	 *
	 */
	public void other_slo_flg(boolean value) {
		setConstBoolean(offset + 35, $other_slo_flg, value);
	}


	/**
	 * Payment received result details No. 入金実績明細ＮＯ.<p>
	 *
	 */
	public String rcv_act_d_no() {
		return getConstString(offset + 36, $rcv_act_d_no);
	}

	/**
	 * Payment received result details No. 入金実績明細ＮＯ.<p>
	 *
	 */
	public void rcv_act_d_no(String value) {
		setConstString(offset + 36, $rcv_act_d_no, value);
	}


	/**
	 * Payment received result details sequence number 入金実績明細連番.<p>
	 *
	 */
	public MCNumber rcv_act_d_seq() {
		return getConstNumber(offset + 37, $rcv_act_d_seq);
	}

	/**
	 * Payment received result details sequence number 入金実績明細連番.<p>
	 *
	 */
	public void rcv_act_d_seq(MCNumber value) {
		setConstNumber(offset + 37, $rcv_act_d_seq, value);
	}

	/**
	 * Payment received result details sequence number 入金実績明細連番.<p>
	 *
	 */
	public void rcv_act_d_seq(int value) {
		setConstNumber(offset + 37, $rcv_act_d_seq, value);
	}

	/**
	 * Payment received result details sequence number 入金実績明細連番.<p>
	 *
	 */
	public void rcv_act_d_seq(long value) {
		setConstNumber(offset + 37, $rcv_act_d_seq, value);
	}

	/**
	 * Payment received result details sequence number 入金実績明細連番.<p>
	 *
	 */
	public void rcv_act_d_seq(float value) {
		setConstNumber(offset + 37, $rcv_act_d_seq, value);
	}

	/**
	 * Payment received result details sequence number 入金実績明細連番.<p>
	 *
	 */
	public void rcv_act_d_seq(double value) {
		setConstNumber(offset + 37, $rcv_act_d_seq, value);
	}


	/**
	 * AR reconciliation schedule update counter 売掛消込予定更新カウンタ.<p>
	 *
	 */
	public MCNumber ar_appl_schd_upd_cntr() {
		return getConstNumber(offset + 38, $ar_appl_schd_upd_cntr);
	}

	/**
	 * AR reconciliation schedule update counter 売掛消込予定更新カウンタ.<p>
	 *
	 */
	public void ar_appl_schd_upd_cntr(MCNumber value) {
		setConstNumber(offset + 38, $ar_appl_schd_upd_cntr, value);
	}

	/**
	 * AR reconciliation schedule update counter 売掛消込予定更新カウンタ.<p>
	 *
	 */
	public void ar_appl_schd_upd_cntr(int value) {
		setConstNumber(offset + 38, $ar_appl_schd_upd_cntr, value);
	}

	/**
	 * AR reconciliation schedule update counter 売掛消込予定更新カウンタ.<p>
	 *
	 */
	public void ar_appl_schd_upd_cntr(long value) {
		setConstNumber(offset + 38, $ar_appl_schd_upd_cntr, value);
	}

	/**
	 * AR reconciliation schedule update counter 売掛消込予定更新カウンタ.<p>
	 *
	 */
	public void ar_appl_schd_upd_cntr(float value) {
		setConstNumber(offset + 38, $ar_appl_schd_upd_cntr, value);
	}

	/**
	 * AR reconciliation schedule update counter 売掛消込予定更新カウンタ.<p>
	 *
	 */
	public void ar_appl_schd_upd_cntr(double value) {
		setConstNumber(offset + 38, $ar_appl_schd_upd_cntr, value);
	}


	public String getString(String name) {
		if ($ar_sttl_cd1.equalsIgnoreCase(name)) {
			return ar_sttl_cd1();
		}
		if ($ar_sttl_nm1.equalsIgnoreCase(name)) {
			return ar_sttl_nm1();
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
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($acst_nm.equalsIgnoreCase(name)) {
			return acst_nm();
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($ar_dpt_nm.equalsIgnoreCase(name)) {
			return ar_dpt_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			return ar_typ();
		}
		if ($ar_typ_nm.equalsIgnoreCase(name)) {
			return ar_typ_nm();
		}
		if ($bill_no.equalsIgnoreCase(name)) {
			return bill_no();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			return bcst_nm();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($bill_dpt_nm.equalsIgnoreCase(name)) {
			return bill_dpt_nm();
		}
		if ($bill_d_rmrks.equalsIgnoreCase(name)) {
			return bill_d_rmrks();
		}
		if ($ar_appl_schd_no.equalsIgnoreCase(name)) {
			return ar_appl_schd_no();
		}
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			return bill_mng_no();
		}
		if ($rcv_act_d_no.equalsIgnoreCase(name)) {
			return rcv_act_d_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($appl_tgt_amt.equalsIgnoreCase(name)) {
			return appl_tgt_amt();
		}
		if ($appl_ttl_amt.equalsIgnoreCase(name)) {
			return appl_ttl_amt();
		}
		if ($appl_ttl_amt_w.equalsIgnoreCase(name)) {
			return appl_ttl_amt_w();
		}
		if ($amt1.equalsIgnoreCase(name)) {
			return amt1();
		}
		if ($amt1_w.equalsIgnoreCase(name)) {
			return amt1_w();
		}
		if ($amt2.equalsIgnoreCase(name)) {
			return amt2();
		}
		if ($amt2_w.equalsIgnoreCase(name)) {
			return amt2_w();
		}
		if ($amt3.equalsIgnoreCase(name)) {
			return amt3();
		}
		if ($amt3_w.equalsIgnoreCase(name)) {
			return amt3_w();
		}
		if ($not_appl_bal.equalsIgnoreCase(name)) {
			return not_appl_bal();
		}
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			return bill_cl_day();
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			return rcv_act_d_seq();
		}
		if ($ar_appl_schd_upd_cntr.equalsIgnoreCase(name)) {
			return ar_appl_schd_upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($rcv_schd_dt.equalsIgnoreCase(name)) {
			return rcv_schd_dt();
		}
		if ($bill_ym.equalsIgnoreCase(name)) {
			return bill_ym();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($other_slo_flg.equalsIgnoreCase(name)) {
			return other_slo_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ar_sttl_cd1.equalsIgnoreCase(name)) {
			return ar_sttl_cd1();
		}
		if ($ar_sttl_nm1.equalsIgnoreCase(name)) {
			return ar_sttl_nm1();
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
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($acst_nm.equalsIgnoreCase(name)) {
			return acst_nm();
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($ar_dpt_nm.equalsIgnoreCase(name)) {
			return ar_dpt_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			return ar_typ();
		}
		if ($ar_typ_nm.equalsIgnoreCase(name)) {
			return ar_typ_nm();
		}
		if ($bill_no.equalsIgnoreCase(name)) {
			return bill_no();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			return bcst_nm();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($bill_dpt_nm.equalsIgnoreCase(name)) {
			return bill_dpt_nm();
		}
		if ($bill_d_rmrks.equalsIgnoreCase(name)) {
			return bill_d_rmrks();
		}
		if ($ar_appl_schd_no.equalsIgnoreCase(name)) {
			return ar_appl_schd_no();
		}
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			return bill_mng_no();
		}
		if ($rcv_act_d_no.equalsIgnoreCase(name)) {
			return rcv_act_d_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($appl_tgt_amt.equalsIgnoreCase(name)) {
			return appl_tgt_amt();
		}
		if ($appl_ttl_amt.equalsIgnoreCase(name)) {
			return appl_ttl_amt();
		}
		if ($appl_ttl_amt_w.equalsIgnoreCase(name)) {
			return appl_ttl_amt_w();
		}
		if ($amt1.equalsIgnoreCase(name)) {
			return amt1();
		}
		if ($amt1_w.equalsIgnoreCase(name)) {
			return amt1_w();
		}
		if ($amt2.equalsIgnoreCase(name)) {
			return amt2();
		}
		if ($amt2_w.equalsIgnoreCase(name)) {
			return amt2_w();
		}
		if ($amt3.equalsIgnoreCase(name)) {
			return amt3();
		}
		if ($amt3_w.equalsIgnoreCase(name)) {
			return amt3_w();
		}
		if ($not_appl_bal.equalsIgnoreCase(name)) {
			return not_appl_bal();
		}
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			return bill_cl_day();
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			return rcv_act_d_seq();
		}
		if ($ar_appl_schd_upd_cntr.equalsIgnoreCase(name)) {
			return ar_appl_schd_upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($rcv_schd_dt.equalsIgnoreCase(name)) {
			return rcv_schd_dt();
		}
		if ($bill_ym.equalsIgnoreCase(name)) {
			return bill_ym();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($other_slo_flg.equalsIgnoreCase(name)) {
			return other_slo_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ar_sttl_cd1.equalsIgnoreCase(name)) {
			ar_sttl_cd1(value);
			return;
		}
		if ($ar_sttl_nm1.equalsIgnoreCase(name)) {
			ar_sttl_nm1(value);
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
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
			return;
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($acst_nm.equalsIgnoreCase(name)) {
			acst_nm(value);
			return;
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			ar_dpt_cd(value);
			return;
		}
		if ($ar_dpt_nm.equalsIgnoreCase(name)) {
			ar_dpt_nm(value);
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
		if ($ar_typ.equalsIgnoreCase(name)) {
			ar_typ(value);
			return;
		}
		if ($ar_typ_nm.equalsIgnoreCase(name)) {
			ar_typ_nm(value);
			return;
		}
		if ($bill_no.equalsIgnoreCase(name)) {
			bill_no(value);
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
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		if ($bill_dpt_nm.equalsIgnoreCase(name)) {
			bill_dpt_nm(value);
			return;
		}
		if ($bill_d_rmrks.equalsIgnoreCase(name)) {
			bill_d_rmrks(value);
			return;
		}
		if ($ar_appl_schd_no.equalsIgnoreCase(name)) {
			ar_appl_schd_no(value);
			return;
		}
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			bill_mng_no(value);
			return;
		}
		if ($rcv_act_d_no.equalsIgnoreCase(name)) {
			rcv_act_d_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($appl_tgt_amt.equalsIgnoreCase(name)) {
			appl_tgt_amt(value);
			return;
		}
		if ($appl_ttl_amt.equalsIgnoreCase(name)) {
			appl_ttl_amt(value);
			return;
		}
		if ($appl_ttl_amt_w.equalsIgnoreCase(name)) {
			appl_ttl_amt_w(value);
			return;
		}
		if ($amt1.equalsIgnoreCase(name)) {
			amt1(value);
			return;
		}
		if ($amt1_w.equalsIgnoreCase(name)) {
			amt1_w(value);
			return;
		}
		if ($amt2.equalsIgnoreCase(name)) {
			amt2(value);
			return;
		}
		if ($amt2_w.equalsIgnoreCase(name)) {
			amt2_w(value);
			return;
		}
		if ($amt3.equalsIgnoreCase(name)) {
			amt3(value);
			return;
		}
		if ($amt3_w.equalsIgnoreCase(name)) {
			amt3_w(value);
			return;
		}
		if ($not_appl_bal.equalsIgnoreCase(name)) {
			not_appl_bal(value);
			return;
		}
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
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
		if ($appl_tgt_amt.equalsIgnoreCase(name)) {
			appl_tgt_amt(value);
			return;
		}
		if ($appl_ttl_amt.equalsIgnoreCase(name)) {
			appl_ttl_amt(value);
			return;
		}
		if ($appl_ttl_amt_w.equalsIgnoreCase(name)) {
			appl_ttl_amt_w(value);
			return;
		}
		if ($amt1.equalsIgnoreCase(name)) {
			amt1(value);
			return;
		}
		if ($amt1_w.equalsIgnoreCase(name)) {
			amt1_w(value);
			return;
		}
		if ($amt2.equalsIgnoreCase(name)) {
			amt2(value);
			return;
		}
		if ($amt2_w.equalsIgnoreCase(name)) {
			amt2_w(value);
			return;
		}
		if ($amt3.equalsIgnoreCase(name)) {
			amt3(value);
			return;
		}
		if ($amt3_w.equalsIgnoreCase(name)) {
			amt3_w(value);
			return;
		}
		if ($not_appl_bal.equalsIgnoreCase(name)) {
			not_appl_bal(value);
			return;
		}
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
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
		if ($appl_tgt_amt.equalsIgnoreCase(name)) {
			appl_tgt_amt(value);
			return;
		}
		if ($appl_ttl_amt.equalsIgnoreCase(name)) {
			appl_ttl_amt(value);
			return;
		}
		if ($appl_ttl_amt_w.equalsIgnoreCase(name)) {
			appl_ttl_amt_w(value);
			return;
		}
		if ($amt1.equalsIgnoreCase(name)) {
			amt1(value);
			return;
		}
		if ($amt1_w.equalsIgnoreCase(name)) {
			amt1_w(value);
			return;
		}
		if ($amt2.equalsIgnoreCase(name)) {
			amt2(value);
			return;
		}
		if ($amt2_w.equalsIgnoreCase(name)) {
			amt2_w(value);
			return;
		}
		if ($amt3.equalsIgnoreCase(name)) {
			amt3(value);
			return;
		}
		if ($amt3_w.equalsIgnoreCase(name)) {
			amt3_w(value);
			return;
		}
		if ($not_appl_bal.equalsIgnoreCase(name)) {
			not_appl_bal(value);
			return;
		}
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
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
		if ($appl_tgt_amt.equalsIgnoreCase(name)) {
			appl_tgt_amt(value);
			return;
		}
		if ($appl_ttl_amt.equalsIgnoreCase(name)) {
			appl_ttl_amt(value);
			return;
		}
		if ($appl_ttl_amt_w.equalsIgnoreCase(name)) {
			appl_ttl_amt_w(value);
			return;
		}
		if ($amt1.equalsIgnoreCase(name)) {
			amt1(value);
			return;
		}
		if ($amt1_w.equalsIgnoreCase(name)) {
			amt1_w(value);
			return;
		}
		if ($amt2.equalsIgnoreCase(name)) {
			amt2(value);
			return;
		}
		if ($amt2_w.equalsIgnoreCase(name)) {
			amt2_w(value);
			return;
		}
		if ($amt3.equalsIgnoreCase(name)) {
			amt3(value);
			return;
		}
		if ($amt3_w.equalsIgnoreCase(name)) {
			amt3_w(value);
			return;
		}
		if ($not_appl_bal.equalsIgnoreCase(name)) {
			not_appl_bal(value);
			return;
		}
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
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
		if ($appl_tgt_amt.equalsIgnoreCase(name)) {
			appl_tgt_amt(value);
			return;
		}
		if ($appl_ttl_amt.equalsIgnoreCase(name)) {
			appl_ttl_amt(value);
			return;
		}
		if ($appl_ttl_amt_w.equalsIgnoreCase(name)) {
			appl_ttl_amt_w(value);
			return;
		}
		if ($amt1.equalsIgnoreCase(name)) {
			amt1(value);
			return;
		}
		if ($amt1_w.equalsIgnoreCase(name)) {
			amt1_w(value);
			return;
		}
		if ($amt2.equalsIgnoreCase(name)) {
			amt2(value);
			return;
		}
		if ($amt2_w.equalsIgnoreCase(name)) {
			amt2_w(value);
			return;
		}
		if ($amt3.equalsIgnoreCase(name)) {
			amt3(value);
			return;
		}
		if ($amt3_w.equalsIgnoreCase(name)) {
			amt3_w(value);
			return;
		}
		if ($not_appl_bal.equalsIgnoreCase(name)) {
			not_appl_bal(value);
			return;
		}
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
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
	public void setDate(String name, MCDate value) {
		if ($rcv_schd_dt.equalsIgnoreCase(name)) {
			rcv_schd_dt(value);
			return;
		}
		if ($bill_ym.equalsIgnoreCase(name)) {
			bill_ym(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($other_slo_flg.equalsIgnoreCase(name)) {
			other_slo_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ar_sttl_cd1.equalsIgnoreCase(name)) {
			ar_sttl_cd1(value);
			return;
		}
		if ($ar_sttl_nm1.equalsIgnoreCase(name)) {
			ar_sttl_nm1(value);
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
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
			return;
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($acst_nm.equalsIgnoreCase(name)) {
			acst_nm(value);
			return;
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			ar_dpt_cd(value);
			return;
		}
		if ($ar_dpt_nm.equalsIgnoreCase(name)) {
			ar_dpt_nm(value);
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
		if ($ar_typ.equalsIgnoreCase(name)) {
			ar_typ(value);
			return;
		}
		if ($ar_typ_nm.equalsIgnoreCase(name)) {
			ar_typ_nm(value);
			return;
		}
		if ($bill_no.equalsIgnoreCase(name)) {
			bill_no(value);
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
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		if ($bill_dpt_nm.equalsIgnoreCase(name)) {
			bill_dpt_nm(value);
			return;
		}
		if ($bill_d_rmrks.equalsIgnoreCase(name)) {
			bill_d_rmrks(value);
			return;
		}
		if ($ar_appl_schd_no.equalsIgnoreCase(name)) {
			ar_appl_schd_no(value);
			return;
		}
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			bill_mng_no(value);
			return;
		}
		if ($rcv_act_d_no.equalsIgnoreCase(name)) {
			rcv_act_d_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($appl_tgt_amt.equalsIgnoreCase(name)) {
			appl_tgt_amt(value);
			return;
		}
		if ($appl_ttl_amt.equalsIgnoreCase(name)) {
			appl_ttl_amt(value);
			return;
		}
		if ($appl_ttl_amt_w.equalsIgnoreCase(name)) {
			appl_ttl_amt_w(value);
			return;
		}
		if ($amt1.equalsIgnoreCase(name)) {
			amt1(value);
			return;
		}
		if ($amt1_w.equalsIgnoreCase(name)) {
			amt1_w(value);
			return;
		}
		if ($amt2.equalsIgnoreCase(name)) {
			amt2(value);
			return;
		}
		if ($amt2_w.equalsIgnoreCase(name)) {
			amt2_w(value);
			return;
		}
		if ($amt3.equalsIgnoreCase(name)) {
			amt3(value);
			return;
		}
		if ($amt3_w.equalsIgnoreCase(name)) {
			amt3_w(value);
			return;
		}
		if ($not_appl_bal.equalsIgnoreCase(name)) {
			not_appl_bal(value);
			return;
		}
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
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
		if ($appl_tgt_amt.equalsIgnoreCase(name)) {
			appl_tgt_amt(value);
			return;
		}
		if ($appl_ttl_amt.equalsIgnoreCase(name)) {
			appl_ttl_amt(value);
			return;
		}
		if ($appl_ttl_amt_w.equalsIgnoreCase(name)) {
			appl_ttl_amt_w(value);
			return;
		}
		if ($amt1.equalsIgnoreCase(name)) {
			amt1(value);
			return;
		}
		if ($amt1_w.equalsIgnoreCase(name)) {
			amt1_w(value);
			return;
		}
		if ($amt2.equalsIgnoreCase(name)) {
			amt2(value);
			return;
		}
		if ($amt2_w.equalsIgnoreCase(name)) {
			amt2_w(value);
			return;
		}
		if ($amt3.equalsIgnoreCase(name)) {
			amt3(value);
			return;
		}
		if ($amt3_w.equalsIgnoreCase(name)) {
			amt3_w(value);
			return;
		}
		if ($not_appl_bal.equalsIgnoreCase(name)) {
			not_appl_bal(value);
			return;
		}
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
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
		if ($appl_tgt_amt.equalsIgnoreCase(name)) {
			appl_tgt_amt(value);
			return;
		}
		if ($appl_ttl_amt.equalsIgnoreCase(name)) {
			appl_ttl_amt(value);
			return;
		}
		if ($appl_ttl_amt_w.equalsIgnoreCase(name)) {
			appl_ttl_amt_w(value);
			return;
		}
		if ($amt1.equalsIgnoreCase(name)) {
			amt1(value);
			return;
		}
		if ($amt1_w.equalsIgnoreCase(name)) {
			amt1_w(value);
			return;
		}
		if ($amt2.equalsIgnoreCase(name)) {
			amt2(value);
			return;
		}
		if ($amt2_w.equalsIgnoreCase(name)) {
			amt2_w(value);
			return;
		}
		if ($amt3.equalsIgnoreCase(name)) {
			amt3(value);
			return;
		}
		if ($amt3_w.equalsIgnoreCase(name)) {
			amt3_w(value);
			return;
		}
		if ($not_appl_bal.equalsIgnoreCase(name)) {
			not_appl_bal(value);
			return;
		}
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
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
		if ($appl_tgt_amt.equalsIgnoreCase(name)) {
			appl_tgt_amt(value);
			return;
		}
		if ($appl_ttl_amt.equalsIgnoreCase(name)) {
			appl_ttl_amt(value);
			return;
		}
		if ($appl_ttl_amt_w.equalsIgnoreCase(name)) {
			appl_ttl_amt_w(value);
			return;
		}
		if ($amt1.equalsIgnoreCase(name)) {
			amt1(value);
			return;
		}
		if ($amt1_w.equalsIgnoreCase(name)) {
			amt1_w(value);
			return;
		}
		if ($amt2.equalsIgnoreCase(name)) {
			amt2(value);
			return;
		}
		if ($amt2_w.equalsIgnoreCase(name)) {
			amt2_w(value);
			return;
		}
		if ($amt3.equalsIgnoreCase(name)) {
			amt3(value);
			return;
		}
		if ($amt3_w.equalsIgnoreCase(name)) {
			amt3_w(value);
			return;
		}
		if ($not_appl_bal.equalsIgnoreCase(name)) {
			not_appl_bal(value);
			return;
		}
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
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
		if ($appl_tgt_amt.equalsIgnoreCase(name)) {
			appl_tgt_amt(value);
			return;
		}
		if ($appl_ttl_amt.equalsIgnoreCase(name)) {
			appl_ttl_amt(value);
			return;
		}
		if ($appl_ttl_amt_w.equalsIgnoreCase(name)) {
			appl_ttl_amt_w(value);
			return;
		}
		if ($amt1.equalsIgnoreCase(name)) {
			amt1(value);
			return;
		}
		if ($amt1_w.equalsIgnoreCase(name)) {
			amt1_w(value);
			return;
		}
		if ($amt2.equalsIgnoreCase(name)) {
			amt2(value);
			return;
		}
		if ($amt2_w.equalsIgnoreCase(name)) {
			amt2_w(value);
			return;
		}
		if ($amt3.equalsIgnoreCase(name)) {
			amt3(value);
			return;
		}
		if ($amt3_w.equalsIgnoreCase(name)) {
			amt3_w(value);
			return;
		}
		if ($not_appl_bal.equalsIgnoreCase(name)) {
			not_appl_bal(value);
			return;
		}
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
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
	public void setDateNE(String name, MCDate value) {
		if ($rcv_schd_dt.equalsIgnoreCase(name)) {
			rcv_schd_dt(value);
			return;
		}
		if ($bill_ym.equalsIgnoreCase(name)) {
			bill_ym(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($other_slo_flg.equalsIgnoreCase(name)) {
			other_slo_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

