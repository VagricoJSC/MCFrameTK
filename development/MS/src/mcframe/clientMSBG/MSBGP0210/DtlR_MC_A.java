package mcframe.clientMSBG.MSBGP0210;

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
 * ブロック"Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DtlR_MC_A extends MCConstRow {

	/**
	 * Reconcile 消込.<p>
	 *
	 */
	public static final String $check = "check";
	/**
	 * Original reconcile 元消込.<p>
	 *
	 */
	public static final String $org_check = "org_check";
	public static final String $appl_tgt_amt_p = "appl_tgt_amt_p";
	public static final String $appl_ttl_amt_p = "appl_ttl_amt_p";
	public static final String $appl_ttl_amt_w_p = "appl_ttl_amt_w_p";
	public static final String $amt1_p = "amt1_p";
	public static final String $amt1_w_p = "amt1_w_p";
	public static final String $amt2_p = "amt2_p";
	public static final String $amt2_w_p = "amt2_w_p";
	public static final String $amt3_p = "amt3_p";
	public static final String $amt3_w_p = "amt3_w_p";
	public static final String $amt4_p = "amt4_p";
	public static final String $not_appl_bal_p = "not_appl_bal_p";
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
	 * AR customer name 売掛先名.<p>
	 *
	 */
	public static final String $acst_nm = "acst_nm";
	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public static final String $ar_dpt_cd = "ar_dpt_cd";
	/**
	 * AR dept. name 債権部門名.<p>
	 *
	 */
	public static final String $ar_dpt_nm = "ar_dpt_nm";
	/**
	 * WG cd. ＷＧＣＤ.<p>
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
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public static final String $bcst_nm = "bcst_nm";
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
	 * Invoice details remarks 請求書明細備考.<p>
	 *
	 */
	public static final String $bill_d_rmrks = "bill_d_rmrks";
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
	 * AR reconciliation schedule No. 売掛消込予定ＮＯ.<p>
	 *
	 */
	public static final String $ar_appl_schd_no = "ar_appl_schd_no";
	/**
	 * AR reconciliation schedule update counter 売掛消込予定更新カウンタ.<p>
	 *
	 */
	public static final String $ar_appl_schd_upd_cntr = "ar_appl_schd_upd_cntr";
	/**
	 * Group sequence No. グループシーケンスＮＯ.<p>
	 *
	 */
	public static final String $grp_seq = "grp_seq";

	public static final String $appl_tgt_amt = $appl_tgt_amt_p + ".amt";
	public static final String $appl_ttl_amt = $appl_ttl_amt_p + ".amt";
	public static final String $appl_ttl_amt_w = $appl_ttl_amt_w_p + ".amt";
	public static final String $amt1 = $amt1_p + ".amt";
	public static final String $amt1_w = $amt1_w_p + ".amt";
	public static final String $amt2 = $amt2_p + ".amt";
	public static final String $amt2_w = $amt2_w_p + ".amt";
	public static final String $amt3 = $amt3_p + ".amt";
	public static final String $amt3_w = $amt3_w_p + ".amt";
	public static final String $amt4 = $amt4_p + ".amt";
	public static final String $not_appl_bal = $not_appl_bal_p + ".amt";

	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta org_check_META = createCommonMeta($org_check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta appl_tgt_amt_p_META = createInnerRowMeta($appl_tgt_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta appl_ttl_amt_p_META = createInnerRowMeta($appl_ttl_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta appl_ttl_amt_w_p_META = createInnerRowMeta($appl_ttl_amt_w_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt1_p_META = createInnerRowMeta($amt1_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt1_w_p_META = createInnerRowMeta($amt1_w_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt2_p_META = createInnerRowMeta($amt2_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt2_w_p_META = createInnerRowMeta($amt2_w_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt3_p_META = createInnerRowMeta($amt3_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt3_w_p_META = createInnerRowMeta($amt3_w_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt4_p_META = createInnerRowMeta($amt4_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta not_appl_bal_p_META = createInnerRowMeta($not_appl_bal_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
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
	public static final MCMeta bill_mng_no_META = createCommonMeta($bill_mng_no, mcframe.commonMA.meta.MA_META.BILL_MNG_NO);
	public static final MCMeta other_slo_flg_META = createCommonMeta($other_slo_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcv_act_d_no_META = createCommonMeta($rcv_act_d_no, mcframe.commonMA.meta.MA_META.RCV_ACT_D_NO);
	public static final MCMeta rcv_act_d_seq_META = createCommonMeta($rcv_act_d_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta ar_appl_schd_no_META = createCommonMeta($ar_appl_schd_no, mcframe.commonMA.meta.MA_META.AR_APPL_SCHD_NO);
	public static final MCMeta ar_appl_schd_upd_cntr_META = createCommonMeta($ar_appl_schd_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta grp_seq_META = createCommonMeta($grp_seq, mcframe.commonMA.meta.MA_META.INT);

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			org_check_META,
			appl_tgt_amt_p_META,
			appl_ttl_amt_p_META,
			appl_ttl_amt_w_p_META,
			amt1_p_META,
			amt1_w_p_META,
			amt2_p_META,
			amt2_w_p_META,
			amt3_p_META,
			amt3_w_p_META,
			amt4_p_META,
			not_appl_bal_p_META,
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
			bill_mng_no_META,
			other_slo_flg_META,
			rcv_act_d_no_META,
			rcv_act_d_seq_META,
			ar_appl_schd_no_META,
			ar_appl_schd_upd_cntr_META,
			grp_seq_META
		},
		new String[][]{
			{
				"appl_tgt_amt",
				"appl_ttl_amt",
				"appl_ttl_amt_w",
				"amt1",
				"amt1_w",
				"amt2",
				"amt2_w",
				"amt3",
				"amt3_w",
				"amt4",
				"not_appl_bal"
			},
			{
				$appl_tgt_amt,
				$appl_ttl_amt,
				$appl_ttl_amt_w,
				$amt1,
				$amt1_w,
				$amt2,
				$amt2_w,
				$amt3,
				$amt3_w,
				$amt4,
				$not_appl_bal
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
				{$wrk_no, "WRK"},	// wrk_no
				{$wrk_nm, "WRK"},	// wrk_nm
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"}	// wg_nm
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



	/**
	 * Reconcile 消込.<p>
	 *
	 */
	public boolean check() {
		return getConstBoolean(offset + 0, $check);
	}

	/**
	 * Reconcile 消込.<p>
	 *
	 */
	public void check(boolean value) {
		setConstBoolean(offset + 0, $check, value);
	}


	/**
	 * Original reconcile 元消込.<p>
	 *
	 */
	public boolean org_check() {
		return getConstBoolean(offset + 1, $org_check);
	}

	/**
	 * Original reconcile 元消込.<p>
	 *
	 */
	public void org_check(boolean value) {
		setConstBoolean(offset + 1, $org_check, value);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR appl_tgt_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 2, $appl_tgt_amt_p);
	}
	
	public void appl_tgt_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 2, $appl_tgt_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR appl_ttl_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 3, $appl_ttl_amt_p);
	}
	
	public void appl_ttl_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 3, $appl_ttl_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR appl_ttl_amt_w_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 4, $appl_ttl_amt_w_p);
	}
	
	public void appl_ttl_amt_w_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 4, $appl_ttl_amt_w_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt1_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 5, $amt1_p);
	}
	
	public void amt1_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 5, $amt1_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt1_w_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 6, $amt1_w_p);
	}
	
	public void amt1_w_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 6, $amt1_w_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt2_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 7, $amt2_p);
	}
	
	public void amt2_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 7, $amt2_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt2_w_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 8, $amt2_w_p);
	}
	
	public void amt2_w_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 8, $amt2_w_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt3_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 9, $amt3_p);
	}
	
	public void amt3_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 9, $amt3_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt3_w_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 10, $amt3_w_p);
	}
	
	public void amt3_w_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 10, $amt3_w_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt4_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 11, $amt4_p);
	}
	
	public void amt4_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 11, $amt4_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR not_appl_bal_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 12, $not_appl_bal_p);
	}
	
	public void not_appl_bal_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 12, $not_appl_bal_p, row);
	}


	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public MCDate rcv_schd_dt() {
		return getConstDate(offset + 13, $rcv_schd_dt);
	}

	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public void rcv_schd_dt(MCDate value) {
		setConstDate(offset + 13, $rcv_schd_dt, value);
	}


	/**
	 * Payment received method cd. 入金方法ＣＤ.<p>
	 *
	 */
	public String ar_sttl_cd1() {
		return getConstString(offset + 14, $ar_sttl_cd1);
	}

	/**
	 * Payment received method cd. 入金方法ＣＤ.<p>
	 *
	 */
	public void ar_sttl_cd1(String value) {
		setConstString(offset + 14, $ar_sttl_cd1, value);
	}


	/**
	 * Payment received method name 入金方法名.<p>
	 *
	 */
	public String ar_sttl_nm1() {
		return getConstString(offset + 15, $ar_sttl_nm1);
	}

	/**
	 * Payment received method name 入金方法名.<p>
	 *
	 */
	public void ar_sttl_nm1(String value) {
		setConstString(offset + 15, $ar_sttl_nm1, value);
	}


	/**
	 * AR settlement type 債権決済区分.<p>
	 *
	 */
	public String ar_sttl_typ1() {
		return getConstString(offset + 16, $ar_sttl_typ1);
	}

	/**
	 * AR settlement type 債権決済区分.<p>
	 *
	 */
	public void ar_sttl_typ1(String value) {
		setConstString(offset + 16, $ar_sttl_typ1, value);
	}


	/**
	 * I/V No. Ｉ／Ｖ ＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 17, $iv_no);
	}

	/**
	 * I/V No. Ｉ／Ｖ ＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 17, $iv_no, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 18, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 18, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 19, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 19, $wrk_nm, value);
	}


	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public String acst_cd() {
		return getConstString(offset + 20, $acst_cd);
	}

	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public void acst_cd(String value) {
		setConstString(offset + 20, $acst_cd, value);
	}


	/**
	 * AR customer name 売掛先名.<p>
	 *
	 */
	public String acst_nm() {
		return getConstString(offset + 21, $acst_nm);
	}

	/**
	 * AR customer name 売掛先名.<p>
	 *
	 */
	public void acst_nm(String value) {
		setConstString(offset + 21, $acst_nm, value);
	}


	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public String ar_dpt_cd() {
		return getConstString(offset + 22, $ar_dpt_cd);
	}

	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public void ar_dpt_cd(String value) {
		setConstString(offset + 22, $ar_dpt_cd, value);
	}


	/**
	 * AR dept. name 債権部門名.<p>
	 *
	 */
	public String ar_dpt_nm() {
		return getConstString(offset + 23, $ar_dpt_nm);
	}

	/**
	 * AR dept. name 債権部門名.<p>
	 *
	 */
	public void ar_dpt_nm(String value) {
		setConstString(offset + 23, $ar_dpt_nm, value);
	}


	/**
	 * WG cd. ＷＧＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 24, $wg_cd);
	}

	/**
	 * WG cd. ＷＧＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 24, $wg_cd, value);
	}


	/**
	 * WG name ＷＧ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 25, $wg_nm);
	}

	/**
	 * WG name ＷＧ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 25, $wg_nm, value);
	}


	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public String ar_typ() {
		return getConstString(offset + 26, $ar_typ);
	}

	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public void ar_typ(String value) {
		setConstString(offset + 26, $ar_typ, value);
	}


	/**
	 * AR type name 債権区分名.<p>
	 *
	 */
	public String ar_typ_nm() {
		return getConstString(offset + 27, $ar_typ_nm);
	}

	/**
	 * AR type name 債権区分名.<p>
	 *
	 */
	public void ar_typ_nm(String value) {
		setConstString(offset + 27, $ar_typ_nm, value);
	}


	/**
	 * Billing closing month 請求締年月.<p>
	 *
	 */
	public MCDate bill_ym() {
		return getConstDate(offset + 28, $bill_ym);
	}

	/**
	 * Billing closing month 請求締年月.<p>
	 *
	 */
	public void bill_ym(MCDate value) {
		setConstDate(offset + 28, $bill_ym, value);
	}


	/**
	 * Billing closing day 請求締日.<p>
	 *
	 */
	public MCNumber bill_cl_day() {
		return getConstNumber(offset + 29, $bill_cl_day);
	}

	/**
	 * Billing closing day 請求締日.<p>
	 *
	 */
	public void bill_cl_day(MCNumber value) {
		setConstNumber(offset + 29, $bill_cl_day, value);
	}

	/**
	 * Billing closing day 請求締日.<p>
	 *
	 */
	public void bill_cl_day(int value) {
		setConstNumber(offset + 29, $bill_cl_day, value);
	}

	/**
	 * Billing closing day 請求締日.<p>
	 *
	 */
	public void bill_cl_day(long value) {
		setConstNumber(offset + 29, $bill_cl_day, value);
	}

	/**
	 * Billing closing day 請求締日.<p>
	 *
	 */
	public void bill_cl_day(float value) {
		setConstNumber(offset + 29, $bill_cl_day, value);
	}

	/**
	 * Billing closing day 請求締日.<p>
	 *
	 */
	public void bill_cl_day(double value) {
		setConstNumber(offset + 29, $bill_cl_day, value);
	}


	/**
	 * Invoice No. 請求書ＮＯ.<p>
	 *
	 */
	public String bill_no() {
		return getConstString(offset + 30, $bill_no);
	}

	/**
	 * Invoice No. 請求書ＮＯ.<p>
	 *
	 */
	public void bill_no(String value) {
		setConstString(offset + 30, $bill_no, value);
	}


	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public String bcst_cd() {
		return getConstString(offset + 31, $bcst_cd);
	}

	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public void bcst_cd(String value) {
		setConstString(offset + 31, $bcst_cd, value);
	}


	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public String bcst_nm() {
		return getConstString(offset + 32, $bcst_nm);
	}

	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public void bcst_nm(String value) {
		setConstString(offset + 32, $bcst_nm, value);
	}


	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public String bill_dpt_cd() {
		return getConstString(offset + 33, $bill_dpt_cd);
	}

	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public void bill_dpt_cd(String value) {
		setConstString(offset + 33, $bill_dpt_cd, value);
	}


	/**
	 * Billing dept. name 請求部門名.<p>
	 *
	 */
	public String bill_dpt_nm() {
		return getConstString(offset + 34, $bill_dpt_nm);
	}

	/**
	 * Billing dept. name 請求部門名.<p>
	 *
	 */
	public void bill_dpt_nm(String value) {
		setConstString(offset + 34, $bill_dpt_nm, value);
	}


	/**
	 * Invoice details remarks 請求書明細備考.<p>
	 *
	 */
	public String bill_d_rmrks() {
		return getConstString(offset + 35, $bill_d_rmrks);
	}

	/**
	 * Invoice details remarks 請求書明細備考.<p>
	 *
	 */
	public void bill_d_rmrks(String value) {
		setConstString(offset + 35, $bill_d_rmrks, value);
	}


	/**
	 * Billing management No. 請求管理ＮＯ.<p>
	 *
	 */
	public String bill_mng_no() {
		return getConstString(offset + 36, $bill_mng_no);
	}

	/**
	 * Billing management No. 請求管理ＮＯ.<p>
	 *
	 */
	public void bill_mng_no(String value) {
		setConstString(offset + 36, $bill_mng_no, value);
	}


	/**
	 * Other sales orders 他受注.<p>
	 *
	 */
	public boolean other_slo_flg() {
		return getConstBoolean(offset + 37, $other_slo_flg);
	}

	/**
	 * Other sales orders 他受注.<p>
	 *
	 */
	public void other_slo_flg(boolean value) {
		setConstBoolean(offset + 37, $other_slo_flg, value);
	}


	/**
	 * Payment received result details No. 入金実績明細ＮＯ.<p>
	 *
	 */
	public String rcv_act_d_no() {
		return getConstString(offset + 38, $rcv_act_d_no);
	}

	/**
	 * Payment received result details No. 入金実績明細ＮＯ.<p>
	 *
	 */
	public void rcv_act_d_no(String value) {
		setConstString(offset + 38, $rcv_act_d_no, value);
	}


	/**
	 * Payment received result details sequence number 入金実績明細連番.<p>
	 *
	 */
	public MCNumber rcv_act_d_seq() {
		return getConstNumber(offset + 39, $rcv_act_d_seq);
	}

	/**
	 * Payment received result details sequence number 入金実績明細連番.<p>
	 *
	 */
	public void rcv_act_d_seq(MCNumber value) {
		setConstNumber(offset + 39, $rcv_act_d_seq, value);
	}

	/**
	 * Payment received result details sequence number 入金実績明細連番.<p>
	 *
	 */
	public void rcv_act_d_seq(int value) {
		setConstNumber(offset + 39, $rcv_act_d_seq, value);
	}

	/**
	 * Payment received result details sequence number 入金実績明細連番.<p>
	 *
	 */
	public void rcv_act_d_seq(long value) {
		setConstNumber(offset + 39, $rcv_act_d_seq, value);
	}

	/**
	 * Payment received result details sequence number 入金実績明細連番.<p>
	 *
	 */
	public void rcv_act_d_seq(float value) {
		setConstNumber(offset + 39, $rcv_act_d_seq, value);
	}

	/**
	 * Payment received result details sequence number 入金実績明細連番.<p>
	 *
	 */
	public void rcv_act_d_seq(double value) {
		setConstNumber(offset + 39, $rcv_act_d_seq, value);
	}


	/**
	 * AR reconciliation schedule No. 売掛消込予定ＮＯ.<p>
	 *
	 */
	public String ar_appl_schd_no() {
		return getConstString(offset + 40, $ar_appl_schd_no);
	}

	/**
	 * AR reconciliation schedule No. 売掛消込予定ＮＯ.<p>
	 *
	 */
	public void ar_appl_schd_no(String value) {
		setConstString(offset + 40, $ar_appl_schd_no, value);
	}


	/**
	 * AR reconciliation schedule update counter 売掛消込予定更新カウンタ.<p>
	 *
	 */
	public MCNumber ar_appl_schd_upd_cntr() {
		return getConstNumber(offset + 41, $ar_appl_schd_upd_cntr);
	}

	/**
	 * AR reconciliation schedule update counter 売掛消込予定更新カウンタ.<p>
	 *
	 */
	public void ar_appl_schd_upd_cntr(MCNumber value) {
		setConstNumber(offset + 41, $ar_appl_schd_upd_cntr, value);
	}

	/**
	 * AR reconciliation schedule update counter 売掛消込予定更新カウンタ.<p>
	 *
	 */
	public void ar_appl_schd_upd_cntr(int value) {
		setConstNumber(offset + 41, $ar_appl_schd_upd_cntr, value);
	}

	/**
	 * AR reconciliation schedule update counter 売掛消込予定更新カウンタ.<p>
	 *
	 */
	public void ar_appl_schd_upd_cntr(long value) {
		setConstNumber(offset + 41, $ar_appl_schd_upd_cntr, value);
	}

	/**
	 * AR reconciliation schedule update counter 売掛消込予定更新カウンタ.<p>
	 *
	 */
	public void ar_appl_schd_upd_cntr(float value) {
		setConstNumber(offset + 41, $ar_appl_schd_upd_cntr, value);
	}

	/**
	 * AR reconciliation schedule update counter 売掛消込予定更新カウンタ.<p>
	 *
	 */
	public void ar_appl_schd_upd_cntr(double value) {
		setConstNumber(offset + 41, $ar_appl_schd_upd_cntr, value);
	}


	/**
	 * Group sequence No. グループシーケンスＮＯ.<p>
	 *
	 */
	public MCNumber grp_seq() {
		return getConstNumber(offset + 42, $grp_seq);
	}

	/**
	 * Group sequence No. グループシーケンスＮＯ.<p>
	 *
	 */
	public void grp_seq(MCNumber value) {
		setConstNumber(offset + 42, $grp_seq, value);
	}

	/**
	 * Group sequence No. グループシーケンスＮＯ.<p>
	 *
	 */
	public void grp_seq(int value) {
		setConstNumber(offset + 42, $grp_seq, value);
	}

	/**
	 * Group sequence No. グループシーケンスＮＯ.<p>
	 *
	 */
	public void grp_seq(long value) {
		setConstNumber(offset + 42, $grp_seq, value);
	}

	/**
	 * Group sequence No. グループシーケンスＮＯ.<p>
	 *
	 */
	public void grp_seq(float value) {
		setConstNumber(offset + 42, $grp_seq, value);
	}

	/**
	 * Group sequence No. グループシーケンスＮＯ.<p>
	 *
	 */
	public void grp_seq(double value) {
		setConstNumber(offset + 42, $grp_seq, value);
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
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			return bill_mng_no();
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
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			return bill_cl_day();
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			return rcv_act_d_seq();
		}
		if ($ar_appl_schd_upd_cntr.equalsIgnoreCase(name)) {
			return ar_appl_schd_upd_cntr();
		}
		if ($grp_seq.equalsIgnoreCase(name)) {
			return grp_seq();
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
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($org_check.equalsIgnoreCase(name)) {
			return org_check();
		}
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
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			return bill_mng_no();
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
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			return bill_cl_day();
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			return rcv_act_d_seq();
		}
		if ($ar_appl_schd_upd_cntr.equalsIgnoreCase(name)) {
			return ar_appl_schd_upd_cntr();
		}
		if ($grp_seq.equalsIgnoreCase(name)) {
			return grp_seq();
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
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($org_check.equalsIgnoreCase(name)) {
			return org_check();
		}
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
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			bill_mng_no(value);
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
		if ($grp_seq.equalsIgnoreCase(name)) {
			grp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
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
		if ($grp_seq.equalsIgnoreCase(name)) {
			grp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
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
		if ($grp_seq.equalsIgnoreCase(name)) {
			grp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
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
		if ($grp_seq.equalsIgnoreCase(name)) {
			grp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
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
		if ($grp_seq.equalsIgnoreCase(name)) {
			grp_seq(value);
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
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($org_check.equalsIgnoreCase(name)) {
			org_check(value);
			return;
		}
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
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			bill_mng_no(value);
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
		if ($grp_seq.equalsIgnoreCase(name)) {
			grp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
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
		if ($grp_seq.equalsIgnoreCase(name)) {
			grp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
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
		if ($grp_seq.equalsIgnoreCase(name)) {
			grp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
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
		if ($grp_seq.equalsIgnoreCase(name)) {
			grp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
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
		if ($grp_seq.equalsIgnoreCase(name)) {
			grp_seq(value);
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
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($org_check.equalsIgnoreCase(name)) {
			org_check(value);
			return;
		}
		if ($other_slo_flg.equalsIgnoreCase(name)) {
			other_slo_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($appl_tgt_amt_p.equalsIgnoreCase(name)) {
			return appl_tgt_amt_p();
		}
		if ($appl_ttl_amt_p.equalsIgnoreCase(name)) {
			return appl_ttl_amt_p();
		}
		if ($appl_ttl_amt_w_p.equalsIgnoreCase(name)) {
			return appl_ttl_amt_w_p();
		}
		if ($amt1_p.equalsIgnoreCase(name)) {
			return amt1_p();
		}
		if ($amt1_w_p.equalsIgnoreCase(name)) {
			return amt1_w_p();
		}
		if ($amt2_p.equalsIgnoreCase(name)) {
			return amt2_p();
		}
		if ($amt2_w_p.equalsIgnoreCase(name)) {
			return amt2_w_p();
		}
		if ($amt3_p.equalsIgnoreCase(name)) {
			return amt3_p();
		}
		if ($amt3_w_p.equalsIgnoreCase(name)) {
			return amt3_w_p();
		}
		if ($amt4_p.equalsIgnoreCase(name)) {
			return amt4_p();
		}
		if ($not_appl_bal_p.equalsIgnoreCase(name)) {
			return not_appl_bal_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($appl_tgt_amt_p.equalsIgnoreCase(name)) {
			appl_tgt_amt_p(
				((MCContainerMeta) appl_tgt_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($appl_ttl_amt_p.equalsIgnoreCase(name)) {
			appl_ttl_amt_p(
				((MCContainerMeta) appl_ttl_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($appl_ttl_amt_w_p.equalsIgnoreCase(name)) {
			appl_ttl_amt_w_p(
				((MCContainerMeta) appl_ttl_amt_w_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt1_p.equalsIgnoreCase(name)) {
			amt1_p(
				((MCContainerMeta) amt1_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt1_w_p.equalsIgnoreCase(name)) {
			amt1_w_p(
				((MCContainerMeta) amt1_w_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt2_p.equalsIgnoreCase(name)) {
			amt2_p(
				((MCContainerMeta) amt2_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt2_w_p.equalsIgnoreCase(name)) {
			amt2_w_p(
				((MCContainerMeta) amt2_w_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt3_p.equalsIgnoreCase(name)) {
			amt3_p(
				((MCContainerMeta) amt3_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt3_w_p.equalsIgnoreCase(name)) {
			amt3_w_p(
				((MCContainerMeta) amt3_w_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt4_p.equalsIgnoreCase(name)) {
			amt4_p(
				((MCContainerMeta) amt4_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($not_appl_bal_p.equalsIgnoreCase(name)) {
			not_appl_bal_p(
				((MCContainerMeta) not_appl_bal_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Reconciled target amount 消込対象額.<p>
	 *
	 */
	public MCNumber appl_tgt_amt() {
		return appl_tgt_amt_p().amt();
	}

	/**
	 * Reconciled target amount 消込対象額.<p>
	 *
	 */
	public void appl_tgt_amt(MCNumber value) {
		appl_tgt_amt_p().amt(value);
	}

	/**
	 * Reconciled target amount 消込対象額.<p>
	 *
	 */
	public void appl_tgt_amt(int value) {
		appl_tgt_amt_p().amt(value);
	}

	/**
	 * Reconciled target amount 消込対象額.<p>
	 *
	 */
	public void appl_tgt_amt(long value) {
		appl_tgt_amt_p().amt(value);
	}

	/**
	 * Reconciled target amount 消込対象額.<p>
	 *
	 */
	public void appl_tgt_amt(float value) {
		appl_tgt_amt_p().amt(value);
	}

	/**
	 * Reconciled target amount 消込対象額.<p>
	 *
	 */
	public void appl_tgt_amt(double value) {
		appl_tgt_amt_p().amt(value);
	}

	/**
	 * Total reconciled amount 消込累計額.<p>
	 *
	 */
	public MCNumber appl_ttl_amt() {
		return appl_ttl_amt_p().amt();
	}

	/**
	 * Total reconciled amount 消込累計額.<p>
	 *
	 */
	public void appl_ttl_amt(MCNumber value) {
		appl_ttl_amt_p().amt(value);
	}

	/**
	 * Total reconciled amount 消込累計額.<p>
	 *
	 */
	public void appl_ttl_amt(int value) {
		appl_ttl_amt_p().amt(value);
	}

	/**
	 * Total reconciled amount 消込累計額.<p>
	 *
	 */
	public void appl_ttl_amt(long value) {
		appl_ttl_amt_p().amt(value);
	}

	/**
	 * Total reconciled amount 消込累計額.<p>
	 *
	 */
	public void appl_ttl_amt(float value) {
		appl_ttl_amt_p().amt(value);
	}

	/**
	 * Total reconciled amount 消込累計額.<p>
	 *
	 */
	public void appl_ttl_amt(double value) {
		appl_ttl_amt_p().amt(value);
	}

	/**
	 * Total reconciled amount work 消込累計額ワーク.<p>
	 *
	 */
	public MCNumber appl_ttl_amt_w() {
		return appl_ttl_amt_w_p().amt();
	}

	/**
	 * Total reconciled amount work 消込累計額ワーク.<p>
	 *
	 */
	public void appl_ttl_amt_w(MCNumber value) {
		appl_ttl_amt_w_p().amt(value);
	}

	/**
	 * Total reconciled amount work 消込累計額ワーク.<p>
	 *
	 */
	public void appl_ttl_amt_w(int value) {
		appl_ttl_amt_w_p().amt(value);
	}

	/**
	 * Total reconciled amount work 消込累計額ワーク.<p>
	 *
	 */
	public void appl_ttl_amt_w(long value) {
		appl_ttl_amt_w_p().amt(value);
	}

	/**
	 * Total reconciled amount work 消込累計額ワーク.<p>
	 *
	 */
	public void appl_ttl_amt_w(float value) {
		appl_ttl_amt_w_p().amt(value);
	}

	/**
	 * Total reconciled amount work 消込累計額ワーク.<p>
	 *
	 */
	public void appl_ttl_amt_w(double value) {
		appl_ttl_amt_w_p().amt(value);
	}

	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public MCNumber amt1() {
		return amt1_p().amt();
	}

	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public void amt1(MCNumber value) {
		amt1_p().amt(value);
	}

	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public void amt1(int value) {
		amt1_p().amt(value);
	}

	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public void amt1(long value) {
		amt1_p().amt(value);
	}

	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public void amt1(float value) {
		amt1_p().amt(value);
	}

	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public void amt1(double value) {
		amt1_p().amt(value);
	}

	/**
	 * Payment received amount work 入金額ワーク.<p>
	 *
	 */
	public MCNumber amt1_w() {
		return amt1_w_p().amt();
	}

	/**
	 * Payment received amount work 入金額ワーク.<p>
	 *
	 */
	public void amt1_w(MCNumber value) {
		amt1_w_p().amt(value);
	}

	/**
	 * Payment received amount work 入金額ワーク.<p>
	 *
	 */
	public void amt1_w(int value) {
		amt1_w_p().amt(value);
	}

	/**
	 * Payment received amount work 入金額ワーク.<p>
	 *
	 */
	public void amt1_w(long value) {
		amt1_w_p().amt(value);
	}

	/**
	 * Payment received amount work 入金額ワーク.<p>
	 *
	 */
	public void amt1_w(float value) {
		amt1_w_p().amt(value);
	}

	/**
	 * Payment received amount work 入金額ワーク.<p>
	 *
	 */
	public void amt1_w(double value) {
		amt1_w_p().amt(value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public MCNumber amt2() {
		return amt2_p().amt();
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void amt2(MCNumber value) {
		amt2_p().amt(value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void amt2(int value) {
		amt2_p().amt(value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void amt2(long value) {
		amt2_p().amt(value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void amt2(float value) {
		amt2_p().amt(value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void amt2(double value) {
		amt2_p().amt(value);
	}

	/**
	 * Offset amount work 相殺額ワーク.<p>
	 *
	 */
	public MCNumber amt2_w() {
		return amt2_w_p().amt();
	}

	/**
	 * Offset amount work 相殺額ワーク.<p>
	 *
	 */
	public void amt2_w(MCNumber value) {
		amt2_w_p().amt(value);
	}

	/**
	 * Offset amount work 相殺額ワーク.<p>
	 *
	 */
	public void amt2_w(int value) {
		amt2_w_p().amt(value);
	}

	/**
	 * Offset amount work 相殺額ワーク.<p>
	 *
	 */
	public void amt2_w(long value) {
		amt2_w_p().amt(value);
	}

	/**
	 * Offset amount work 相殺額ワーク.<p>
	 *
	 */
	public void amt2_w(float value) {
		amt2_w_p().amt(value);
	}

	/**
	 * Offset amount work 相殺額ワーク.<p>
	 *
	 */
	public void amt2_w(double value) {
		amt2_w_p().amt(value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public MCNumber amt3() {
		return amt3_p().amt();
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void amt3(MCNumber value) {
		amt3_p().amt(value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void amt3(int value) {
		amt3_p().amt(value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void amt3(long value) {
		amt3_p().amt(value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void amt3(float value) {
		amt3_p().amt(value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void amt3(double value) {
		amt3_p().amt(value);
	}

	/**
	 * Offset amount work 相殺額ワーク.<p>
	 *
	 */
	public MCNumber amt3_w() {
		return amt3_w_p().amt();
	}

	/**
	 * Offset amount work 相殺額ワーク.<p>
	 *
	 */
	public void amt3_w(MCNumber value) {
		amt3_w_p().amt(value);
	}

	/**
	 * Offset amount work 相殺額ワーク.<p>
	 *
	 */
	public void amt3_w(int value) {
		amt3_w_p().amt(value);
	}

	/**
	 * Offset amount work 相殺額ワーク.<p>
	 *
	 */
	public void amt3_w(long value) {
		amt3_w_p().amt(value);
	}

	/**
	 * Offset amount work 相殺額ワーク.<p>
	 *
	 */
	public void amt3_w(float value) {
		amt3_w_p().amt(value);
	}

	/**
	 * Offset amount work 相殺額ワーク.<p>
	 *
	 */
	public void amt3_w(double value) {
		amt3_w_p().amt(value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public MCNumber amt4() {
		return amt4_p().amt();
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void amt4(MCNumber value) {
		amt4_p().amt(value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void amt4(int value) {
		amt4_p().amt(value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void amt4(long value) {
		amt4_p().amt(value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void amt4(float value) {
		amt4_p().amt(value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void amt4(double value) {
		amt4_p().amt(value);
	}

	/**
	 * Unreconciled amount 未消込額.<p>
	 *
	 */
	public MCNumber not_appl_bal() {
		return not_appl_bal_p().amt();
	}

	/**
	 * Unreconciled amount 未消込額.<p>
	 *
	 */
	public void not_appl_bal(MCNumber value) {
		not_appl_bal_p().amt(value);
	}

	/**
	 * Unreconciled amount 未消込額.<p>
	 *
	 */
	public void not_appl_bal(int value) {
		not_appl_bal_p().amt(value);
	}

	/**
	 * Unreconciled amount 未消込額.<p>
	 *
	 */
	public void not_appl_bal(long value) {
		not_appl_bal_p().amt(value);
	}

	/**
	 * Unreconciled amount 未消込額.<p>
	 *
	 */
	public void not_appl_bal(float value) {
		not_appl_bal_p().amt(value);
	}

	/**
	 * Unreconciled amount 未消込額.<p>
	 *
	 */
	public void not_appl_bal(double value) {
		not_appl_bal_p().amt(value);
	}

}

