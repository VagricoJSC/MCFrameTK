package mcframe.serverMSBG.MSBGL0240;

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
 * ブロック"BillD"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class BillDR_MC_A extends MCConstRow {

	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public static final String $ac_ym = "ac_ym";
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public static final String $trd_cd = "trd_cd";
	/**
	 * Result No. 実績ＮＯ.<p>
	 *
	 */
	public static final String $act_no = "act_no";
	/**
	 * Result rev. number 実績改訂番号.<p>
	 *
	 */
	public static final String $act_rev = "act_rev";
	/**
	 * Result sequence number 実績連番.<p>
	 *
	 */
	public static final String $act_seq = "act_seq";
	/**
	 * Result details No. 実績明細ＮＯ.<p>
	 *
	 */
	public static final String $act_d_no = "act_d_no";
	/**
	 * Result details sequence number 実績明細連番.<p>
	 *
	 */
	public static final String $act_d_seq = "act_d_seq";
	/**
	 * Billing details No. 請求明細ＮＯ.<p>
	 *
	 */
	public static final String $bill_d_no = "bill_d_no";
	/**
	 * AR transaction group type 債権取引グループ区分.<p>
	 *
	 */
	public static final String $ar_trd_grp_typ = "ar_trd_grp_typ";
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public static final String $trd_ptn_typ = "trd_ptn_typ";
	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public static final String $slip_sts_typ = "slip_sts_typ";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $trd_cur_amt = "trd_cur_amt";
	/**
	 * Tax amount 消費税額.<p>
	 *
	 */
	public static final String $trd_cur_tax_amt = "trd_cur_tax_amt";
	/**
	 * Base amount 基準金額.<p>
	 *
	 */
	public static final String $base_cur_amt = "base_cur_amt";
	/**
	 * Base tax amount 基準消費税額.<p>
	 *
	 */
	public static final String $base_cur_tax_amt = "base_cur_tax_amt";
	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public static final String $ar_dpt_cd = "ar_dpt_cd";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * Billing management No. 請求管理ＮＯ.<p>
	 *
	 */
	public static final String $bill_mng_no = "bill_mng_no";
	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public static final String $acst_cd = "acst_cd";
	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public static final String $bcst_cd = "bcst_cd";
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
	/**
	 * Billing details invoice No. 請求明細インボイスＮＯ.<p>
	 *
	 */
	public static final String $bill_d_iv_no = "bill_d_iv_no";
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public static final String $xrate = "xrate";
	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public static final String $wrk_no = "wrk_no";
	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public static final String $ar_typ = "ar_typ";
	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public static final String $bill_dpt_cd = "bill_dpt_cd";
	/**
	 * Transfer destination billing No. 振替先請求ＮＯ.<p>
	 *
	 */
	public static final String $sw_to_bill_mng_no = "sw_to_bill_mng_no";
	/**
	 * Transfer destination AR customer cd. 振替先売掛先ＣＤ.<p>
	 *
	 */
	public static final String $sw_to_acst_cd = "sw_to_acst_cd";
	/**
	 * Transfer destination billing closing date 振替先請求締年月日.<p>
	 *
	 */
	public static final String $sw_to_bill_ymd = "sw_to_bill_ymd";
	/**
	 * Scheduled billing date of transfer destination 振替先請求予定日.<p>
	 *
	 */
	public static final String $sw_to_schd_bill_dt = "sw_to_schd_bill_dt";
	/**
	 * Transfer destination billing carry-over count 振替先請求繰越回数.<p>
	 *
	 */
	public static final String $sw_to_bill_crryovr_times = "sw_to_bill_crryovr_times";
	/**
	 * Transfer destination recording date 振替先計上日.<p>
	 *
	 */
	public static final String $sw_to_ac_dt = "sw_to_ac_dt";
	/**
	 * Transfer source recording date 振替元計上日.<p>
	 *
	 */
	public static final String $sw_fr_ac_dt = "sw_fr_ac_dt";
	/**
	 * Transfer source payment recording month 振替元収納計上年月.<p>
	 *
	 */
	public static final String $sw_fr_ar_ac_ym = "sw_fr_ar_ac_ym";
	/**
	 * Transfer source payment transaction cd. 振替元収納取引ＣＤ.<p>
	 *
	 */
	public static final String $sw_fr_ar_trd_cd = "sw_fr_ar_trd_cd";
	/**
	 * Transfer source payment result No. 振替元収納入金実績ＮＯ.<p>
	 *
	 */
	public static final String $sw_fr_rcv_act_no = "sw_fr_rcv_act_no";
	/**
	 * Transfer source payment result sequence number 振替元収納入金実績連番.<p>
	 *
	 */
	public static final String $sw_fr_rcv_act_seq = "sw_fr_rcv_act_seq";
	/**
	 * Transfer source payment result details No. 振替元収納入金実績明細ＮＯ.<p>
	 *
	 */
	public static final String $sw_fr_rcv_act_d_no = "sw_fr_rcv_act_d_no";
	/**
	 * Transfer source payment result details sequence number 振替元収納入金実績明細連番.<p>
	 *
	 */
	public static final String $sw_fr_rcv_act_d_seq = "sw_fr_rcv_act_d_seq";
	/**
	 * Transfer destination payment recording month 振替先収納計上年月.<p>
	 *
	 */
	public static final String $sw_to_ar_ac_ym = "sw_to_ar_ac_ym";
	/**
	 * Transfer destination payment transaction cd. 振替先収納取引ＣＤ.<p>
	 *
	 */
	public static final String $sw_to_ar_trd_cd = "sw_to_ar_trd_cd";
	/**
	 * Transfer destination payment result No. 振替先収納入金実績ＮＯ.<p>
	 *
	 */
	public static final String $sw_to_rcv_act_no = "sw_to_rcv_act_no";
	/**
	 * Transfer destination payment result sequence number 振替先収納入金実績連番.<p>
	 *
	 */
	public static final String $sw_to_rcv_act_seq = "sw_to_rcv_act_seq";
	/**
	 * Transfer destination payment result details No. 振替先収納入金実績明細ＮＯ.<p>
	 *
	 */
	public static final String $sw_to_rcv_act_d_no = "sw_to_rcv_act_d_no";
	/**
	 * Transfer destination payment result details sequence number 振替先収納入金実績明細連番.<p>
	 *
	 */
	public static final String $sw_to_rcv_act_d_seq = "sw_to_rcv_act_d_seq";
	/**
	 * Reconciled amount 消込額.<p>
	 *
	 */
	public static final String $appl_amt = "appl_amt";


	public static final MCMeta ac_ym_META = createCommonMeta($ac_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta act_no_META = createCommonMeta($act_no, mcframe.commonMA.meta.MA_META.ACT_NO);
	public static final MCMeta act_rev_META = createCommonMeta($act_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta act_seq_META = createCommonMeta($act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta act_d_no_META = createCommonMeta($act_d_no, mcframe.commonMA.meta.MA_META.ACT_D_NO);
	public static final MCMeta act_d_seq_META = createCommonMeta($act_d_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta bill_d_no_META = createCommonMeta($bill_d_no, mcframe.commonMA.meta.MA_META.BILL_D_NO);
	public static final MCMeta ar_trd_grp_typ_META = createCommonMeta($ar_trd_grp_typ, mcframe.commonMA.meta.MA_META.AR_TRD_GRP_TYP);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta slip_sts_typ_META = createCommonMeta($slip_sts_typ, mcframe.commonMA.meta.MA_META.SLIP_STS_TYP);
	public static final MCMeta trd_cur_amt_META = createCommonMeta($trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_tax_amt_META = createCommonMeta($trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_amt_META = createCommonMeta($base_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_tax_amt_META = createCommonMeta($base_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ar_dpt_cd_META = createCommonMeta($ar_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta bill_mng_no_META = createCommonMeta($bill_mng_no, mcframe.commonMA.meta.MA_META.BILL_MNG_NO);
	public static final MCMeta acst_cd_META = createCommonMeta($acst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bcst_cd_META = createCommonMeta($bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta bill_d_iv_no_META = createCommonMeta($bill_d_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta xrate_META = createCommonMeta($xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta ar_typ_META = createCommonMeta($ar_typ, mcframe.commonMA.meta.MA_META.AR_TYP);
	public static final MCMeta bill_dpt_cd_META = createCommonMeta($bill_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta sw_to_bill_mng_no_META = createCommonMeta($sw_to_bill_mng_no, mcframe.commonMA.meta.MA_META.BILL_MNG_NO);
	public static final MCMeta sw_to_acst_cd_META = createCommonMeta($sw_to_acst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sw_to_bill_ymd_META = createCommonMeta($sw_to_bill_ymd, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sw_to_schd_bill_dt_META = createCommonMeta($sw_to_schd_bill_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sw_to_bill_crryovr_times_META = createCommonMeta($sw_to_bill_crryovr_times, mcframe.commonMA.meta.MA_META.CRRYOVR_TIMES);
	public static final MCMeta sw_to_ac_dt_META = createCommonMeta($sw_to_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sw_fr_ac_dt_META = createCommonMeta($sw_fr_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sw_fr_ar_ac_ym_META = createCommonMeta($sw_fr_ar_ac_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta sw_fr_ar_trd_cd_META = createCommonMeta($sw_fr_ar_trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta sw_fr_rcv_act_no_META = createCommonMeta($sw_fr_rcv_act_no, mcframe.commonMA.meta.MA_META.RCV_ACT_NO);
	public static final MCMeta sw_fr_rcv_act_seq_META = createCommonMeta($sw_fr_rcv_act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta sw_fr_rcv_act_d_no_META = createCommonMeta($sw_fr_rcv_act_d_no, mcframe.commonMA.meta.MA_META.RCV_ACT_D_NO);
	public static final MCMeta sw_fr_rcv_act_d_seq_META = createCommonMeta($sw_fr_rcv_act_d_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta sw_to_ar_ac_ym_META = createCommonMeta($sw_to_ar_ac_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta sw_to_ar_trd_cd_META = createCommonMeta($sw_to_ar_trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta sw_to_rcv_act_no_META = createCommonMeta($sw_to_rcv_act_no, mcframe.commonMA.meta.MA_META.RCV_ACT_NO);
	public static final MCMeta sw_to_rcv_act_seq_META = createCommonMeta($sw_to_rcv_act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta sw_to_rcv_act_d_no_META = createCommonMeta($sw_to_rcv_act_d_no, mcframe.commonMA.meta.MA_META.RCV_ACT_D_NO);
	public static final MCMeta sw_to_rcv_act_d_seq_META = createCommonMeta($sw_to_rcv_act_d_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta appl_amt_META = createCommonMeta($appl_amt, mcframe.commonMA.meta.MA_META.MONEY);

	protected static final ConstMetaList<BillDR> constMetas = new ConstMetaList<BillDR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ac_ym_META,
			trd_cd_META,
			act_no_META,
			act_rev_META,
			act_seq_META,
			act_d_no_META,
			act_d_seq_META,
			bill_d_no_META,
			ar_trd_grp_typ_META,
			trd_ptn_typ_META,
			slip_sts_typ_META,
			trd_cur_amt_META,
			trd_cur_tax_amt_META,
			base_cur_amt_META,
			base_cur_tax_amt_META,
			ar_dpt_cd_META,
			wg_cd_META,
			bill_mng_no_META,
			acst_cd_META,
			bcst_cd_META,
			iv_no_META,
			bill_d_iv_no_META,
			trd_cur_cd_META,
			xrate_META,
			wrk_no_META,
			ar_typ_META,
			bill_dpt_cd_META,
			sw_to_bill_mng_no_META,
			sw_to_acst_cd_META,
			sw_to_bill_ymd_META,
			sw_to_schd_bill_dt_META,
			sw_to_bill_crryovr_times_META,
			sw_to_ac_dt_META,
			sw_fr_ac_dt_META,
			sw_fr_ar_ac_ym_META,
			sw_fr_ar_trd_cd_META,
			sw_fr_rcv_act_no_META,
			sw_fr_rcv_act_seq_META,
			sw_fr_rcv_act_d_no_META,
			sw_fr_rcv_act_d_seq_META,
			sw_to_ar_ac_ym_META,
			sw_to_ar_trd_cd_META,
			sw_to_rcv_act_no_META,
			sw_to_rcv_act_seq_META,
			sw_to_rcv_act_d_no_META,
			sw_to_rcv_act_d_seq_META,
			appl_amt_META
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
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
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
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
			}
		)),
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
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
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
	protected BillDR_MC_A(ConstMetaList<? extends BillDR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BillDR clone() {
		return (BillDR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BillDR createInstance() {
		return (BillDR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BillDR getValues(String... names) {
		return (BillDR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public MCDate ac_ym() {
		return getConstDate(offset + 0, $ac_ym);
	}

	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public void ac_ym(MCDate value) {
		setConstDate(offset + 0, $ac_ym, value);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 1, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 1, $trd_cd, value);
	}


	/**
	 * Result No. 実績ＮＯ.<p>
	 *
	 */
	public String act_no() {
		return getConstString(offset + 2, $act_no);
	}

	/**
	 * Result No. 実績ＮＯ.<p>
	 *
	 */
	public void act_no(String value) {
		setConstString(offset + 2, $act_no, value);
	}


	/**
	 * Result rev. number 実績改訂番号.<p>
	 *
	 */
	public MCNumber act_rev() {
		return getConstNumber(offset + 3, $act_rev);
	}

	/**
	 * Result rev. number 実績改訂番号.<p>
	 *
	 */
	public void act_rev(MCNumber value) {
		setConstNumber(offset + 3, $act_rev, value);
	}

	/**
	 * Result rev. number 実績改訂番号.<p>
	 *
	 */
	public void act_rev(int value) {
		setConstNumber(offset + 3, $act_rev, value);
	}

	/**
	 * Result rev. number 実績改訂番号.<p>
	 *
	 */
	public void act_rev(long value) {
		setConstNumber(offset + 3, $act_rev, value);
	}

	/**
	 * Result rev. number 実績改訂番号.<p>
	 *
	 */
	public void act_rev(float value) {
		setConstNumber(offset + 3, $act_rev, value);
	}

	/**
	 * Result rev. number 実績改訂番号.<p>
	 *
	 */
	public void act_rev(double value) {
		setConstNumber(offset + 3, $act_rev, value);
	}


	/**
	 * Result sequence number 実績連番.<p>
	 *
	 */
	public MCNumber act_seq() {
		return getConstNumber(offset + 4, $act_seq);
	}

	/**
	 * Result sequence number 実績連番.<p>
	 *
	 */
	public void act_seq(MCNumber value) {
		setConstNumber(offset + 4, $act_seq, value);
	}

	/**
	 * Result sequence number 実績連番.<p>
	 *
	 */
	public void act_seq(int value) {
		setConstNumber(offset + 4, $act_seq, value);
	}

	/**
	 * Result sequence number 実績連番.<p>
	 *
	 */
	public void act_seq(long value) {
		setConstNumber(offset + 4, $act_seq, value);
	}

	/**
	 * Result sequence number 実績連番.<p>
	 *
	 */
	public void act_seq(float value) {
		setConstNumber(offset + 4, $act_seq, value);
	}

	/**
	 * Result sequence number 実績連番.<p>
	 *
	 */
	public void act_seq(double value) {
		setConstNumber(offset + 4, $act_seq, value);
	}


	/**
	 * Result details No. 実績明細ＮＯ.<p>
	 *
	 */
	public String act_d_no() {
		return getConstString(offset + 5, $act_d_no);
	}

	/**
	 * Result details No. 実績明細ＮＯ.<p>
	 *
	 */
	public void act_d_no(String value) {
		setConstString(offset + 5, $act_d_no, value);
	}


	/**
	 * Result details sequence number 実績明細連番.<p>
	 *
	 */
	public MCNumber act_d_seq() {
		return getConstNumber(offset + 6, $act_d_seq);
	}

	/**
	 * Result details sequence number 実績明細連番.<p>
	 *
	 */
	public void act_d_seq(MCNumber value) {
		setConstNumber(offset + 6, $act_d_seq, value);
	}

	/**
	 * Result details sequence number 実績明細連番.<p>
	 *
	 */
	public void act_d_seq(int value) {
		setConstNumber(offset + 6, $act_d_seq, value);
	}

	/**
	 * Result details sequence number 実績明細連番.<p>
	 *
	 */
	public void act_d_seq(long value) {
		setConstNumber(offset + 6, $act_d_seq, value);
	}

	/**
	 * Result details sequence number 実績明細連番.<p>
	 *
	 */
	public void act_d_seq(float value) {
		setConstNumber(offset + 6, $act_d_seq, value);
	}

	/**
	 * Result details sequence number 実績明細連番.<p>
	 *
	 */
	public void act_d_seq(double value) {
		setConstNumber(offset + 6, $act_d_seq, value);
	}


	/**
	 * Billing details No. 請求明細ＮＯ.<p>
	 *
	 */
	public String bill_d_no() {
		return getConstString(offset + 7, $bill_d_no);
	}

	/**
	 * Billing details No. 請求明細ＮＯ.<p>
	 *
	 */
	public void bill_d_no(String value) {
		setConstString(offset + 7, $bill_d_no, value);
	}


	/**
	 * AR transaction group type 債権取引グループ区分.<p>
	 *
	 */
	public String ar_trd_grp_typ() {
		return getConstString(offset + 8, $ar_trd_grp_typ);
	}

	/**
	 * AR transaction group type 債権取引グループ区分.<p>
	 *
	 */
	public void ar_trd_grp_typ(String value) {
		setConstString(offset + 8, $ar_trd_grp_typ, value);
	}


	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 9, $trd_ptn_typ);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 9, $trd_ptn_typ, value);
	}


	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public String slip_sts_typ() {
		return getConstString(offset + 10, $slip_sts_typ);
	}

	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public void slip_sts_typ(String value) {
		setConstString(offset + 10, $slip_sts_typ, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return getConstNumber(offset + 11, $trd_cur_amt);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 11, $trd_cur_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		setConstNumber(offset + 11, $trd_cur_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		setConstNumber(offset + 11, $trd_cur_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		setConstNumber(offset + 11, $trd_cur_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		setConstNumber(offset + 11, $trd_cur_amt, value);
	}


	/**
	 * Tax amount 消費税額.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt() {
		return getConstNumber(offset + 12, $trd_cur_tax_amt);
	}

	/**
	 * Tax amount 消費税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 12, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount 消費税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(int value) {
		setConstNumber(offset + 12, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount 消費税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(long value) {
		setConstNumber(offset + 12, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount 消費税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(float value) {
		setConstNumber(offset + 12, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount 消費税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(double value) {
		setConstNumber(offset + 12, $trd_cur_tax_amt, value);
	}


	/**
	 * Base amount 基準金額.<p>
	 *
	 */
	public MCNumber base_cur_amt() {
		return getConstNumber(offset + 13, $base_cur_amt);
	}

	/**
	 * Base amount 基準金額.<p>
	 *
	 */
	public void base_cur_amt(MCNumber value) {
		setConstNumber(offset + 13, $base_cur_amt, value);
	}

	/**
	 * Base amount 基準金額.<p>
	 *
	 */
	public void base_cur_amt(int value) {
		setConstNumber(offset + 13, $base_cur_amt, value);
	}

	/**
	 * Base amount 基準金額.<p>
	 *
	 */
	public void base_cur_amt(long value) {
		setConstNumber(offset + 13, $base_cur_amt, value);
	}

	/**
	 * Base amount 基準金額.<p>
	 *
	 */
	public void base_cur_amt(float value) {
		setConstNumber(offset + 13, $base_cur_amt, value);
	}

	/**
	 * Base amount 基準金額.<p>
	 *
	 */
	public void base_cur_amt(double value) {
		setConstNumber(offset + 13, $base_cur_amt, value);
	}


	/**
	 * Base tax amount 基準消費税額.<p>
	 *
	 */
	public MCNumber base_cur_tax_amt() {
		return getConstNumber(offset + 14, $base_cur_tax_amt);
	}

	/**
	 * Base tax amount 基準消費税額.<p>
	 *
	 */
	public void base_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 14, $base_cur_tax_amt, value);
	}

	/**
	 * Base tax amount 基準消費税額.<p>
	 *
	 */
	public void base_cur_tax_amt(int value) {
		setConstNumber(offset + 14, $base_cur_tax_amt, value);
	}

	/**
	 * Base tax amount 基準消費税額.<p>
	 *
	 */
	public void base_cur_tax_amt(long value) {
		setConstNumber(offset + 14, $base_cur_tax_amt, value);
	}

	/**
	 * Base tax amount 基準消費税額.<p>
	 *
	 */
	public void base_cur_tax_amt(float value) {
		setConstNumber(offset + 14, $base_cur_tax_amt, value);
	}

	/**
	 * Base tax amount 基準消費税額.<p>
	 *
	 */
	public void base_cur_tax_amt(double value) {
		setConstNumber(offset + 14, $base_cur_tax_amt, value);
	}


	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public String ar_dpt_cd() {
		return getConstString(offset + 15, $ar_dpt_cd);
	}

	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public void ar_dpt_cd(String value) {
		setConstString(offset + 15, $ar_dpt_cd, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 16, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 16, $wg_cd, value);
	}


	/**
	 * Billing management No. 請求管理ＮＯ.<p>
	 *
	 */
	public String bill_mng_no() {
		return getConstString(offset + 17, $bill_mng_no);
	}

	/**
	 * Billing management No. 請求管理ＮＯ.<p>
	 *
	 */
	public void bill_mng_no(String value) {
		setConstString(offset + 17, $bill_mng_no, value);
	}


	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public String acst_cd() {
		return getConstString(offset + 18, $acst_cd);
	}

	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public void acst_cd(String value) {
		setConstString(offset + 18, $acst_cd, value);
	}


	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public String bcst_cd() {
		return getConstString(offset + 19, $bcst_cd);
	}

	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public void bcst_cd(String value) {
		setConstString(offset + 19, $bcst_cd, value);
	}


	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 20, $iv_no);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 20, $iv_no, value);
	}


	/**
	 * Billing details invoice No. 請求明細インボイスＮＯ.<p>
	 *
	 */
	public String bill_d_iv_no() {
		return getConstString(offset + 21, $bill_d_iv_no);
	}

	/**
	 * Billing details invoice No. 請求明細インボイスＮＯ.<p>
	 *
	 */
	public void bill_d_iv_no(String value) {
		setConstString(offset + 21, $bill_d_iv_no, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 22, $trd_cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 22, $trd_cur_cd, value);
	}


	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCNumber xrate() {
		return getConstNumber(offset + 23, $xrate);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		setConstNumber(offset + 23, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(int value) {
		setConstNumber(offset + 23, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(long value) {
		setConstNumber(offset + 23, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(float value) {
		setConstNumber(offset + 23, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(double value) {
		setConstNumber(offset + 23, $xrate, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 24, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 24, $wrk_no, value);
	}


	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public String ar_typ() {
		return getConstString(offset + 25, $ar_typ);
	}

	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public void ar_typ(String value) {
		setConstString(offset + 25, $ar_typ, value);
	}


	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public String bill_dpt_cd() {
		return getConstString(offset + 26, $bill_dpt_cd);
	}

	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public void bill_dpt_cd(String value) {
		setConstString(offset + 26, $bill_dpt_cd, value);
	}


	/**
	 * Transfer destination billing No. 振替先請求ＮＯ.<p>
	 *
	 */
	public String sw_to_bill_mng_no() {
		return getConstString(offset + 27, $sw_to_bill_mng_no);
	}

	/**
	 * Transfer destination billing No. 振替先請求ＮＯ.<p>
	 *
	 */
	public void sw_to_bill_mng_no(String value) {
		setConstString(offset + 27, $sw_to_bill_mng_no, value);
	}


	/**
	 * Transfer destination AR customer cd. 振替先売掛先ＣＤ.<p>
	 *
	 */
	public String sw_to_acst_cd() {
		return getConstString(offset + 28, $sw_to_acst_cd);
	}

	/**
	 * Transfer destination AR customer cd. 振替先売掛先ＣＤ.<p>
	 *
	 */
	public void sw_to_acst_cd(String value) {
		setConstString(offset + 28, $sw_to_acst_cd, value);
	}


	/**
	 * Transfer destination billing closing date 振替先請求締年月日.<p>
	 *
	 */
	public MCDate sw_to_bill_ymd() {
		return getConstDate(offset + 29, $sw_to_bill_ymd);
	}

	/**
	 * Transfer destination billing closing date 振替先請求締年月日.<p>
	 *
	 */
	public void sw_to_bill_ymd(MCDate value) {
		setConstDate(offset + 29, $sw_to_bill_ymd, value);
	}


	/**
	 * Scheduled billing date of transfer destination 振替先請求予定日.<p>
	 *
	 */
	public MCDate sw_to_schd_bill_dt() {
		return getConstDate(offset + 30, $sw_to_schd_bill_dt);
	}

	/**
	 * Scheduled billing date of transfer destination 振替先請求予定日.<p>
	 *
	 */
	public void sw_to_schd_bill_dt(MCDate value) {
		setConstDate(offset + 30, $sw_to_schd_bill_dt, value);
	}


	/**
	 * Transfer destination billing carry-over count 振替先請求繰越回数.<p>
	 *
	 */
	public MCNumber sw_to_bill_crryovr_times() {
		return getConstNumber(offset + 31, $sw_to_bill_crryovr_times);
	}

	/**
	 * Transfer destination billing carry-over count 振替先請求繰越回数.<p>
	 *
	 */
	public void sw_to_bill_crryovr_times(MCNumber value) {
		setConstNumber(offset + 31, $sw_to_bill_crryovr_times, value);
	}

	/**
	 * Transfer destination billing carry-over count 振替先請求繰越回数.<p>
	 *
	 */
	public void sw_to_bill_crryovr_times(int value) {
		setConstNumber(offset + 31, $sw_to_bill_crryovr_times, value);
	}

	/**
	 * Transfer destination billing carry-over count 振替先請求繰越回数.<p>
	 *
	 */
	public void sw_to_bill_crryovr_times(long value) {
		setConstNumber(offset + 31, $sw_to_bill_crryovr_times, value);
	}

	/**
	 * Transfer destination billing carry-over count 振替先請求繰越回数.<p>
	 *
	 */
	public void sw_to_bill_crryovr_times(float value) {
		setConstNumber(offset + 31, $sw_to_bill_crryovr_times, value);
	}

	/**
	 * Transfer destination billing carry-over count 振替先請求繰越回数.<p>
	 *
	 */
	public void sw_to_bill_crryovr_times(double value) {
		setConstNumber(offset + 31, $sw_to_bill_crryovr_times, value);
	}


	/**
	 * Transfer destination recording date 振替先計上日.<p>
	 *
	 */
	public MCDate sw_to_ac_dt() {
		return getConstDate(offset + 32, $sw_to_ac_dt);
	}

	/**
	 * Transfer destination recording date 振替先計上日.<p>
	 *
	 */
	public void sw_to_ac_dt(MCDate value) {
		setConstDate(offset + 32, $sw_to_ac_dt, value);
	}


	/**
	 * Transfer source recording date 振替元計上日.<p>
	 *
	 */
	public MCDate sw_fr_ac_dt() {
		return getConstDate(offset + 33, $sw_fr_ac_dt);
	}

	/**
	 * Transfer source recording date 振替元計上日.<p>
	 *
	 */
	public void sw_fr_ac_dt(MCDate value) {
		setConstDate(offset + 33, $sw_fr_ac_dt, value);
	}


	/**
	 * Transfer source payment recording month 振替元収納計上年月.<p>
	 *
	 */
	public MCDate sw_fr_ar_ac_ym() {
		return getConstDate(offset + 34, $sw_fr_ar_ac_ym);
	}

	/**
	 * Transfer source payment recording month 振替元収納計上年月.<p>
	 *
	 */
	public void sw_fr_ar_ac_ym(MCDate value) {
		setConstDate(offset + 34, $sw_fr_ar_ac_ym, value);
	}


	/**
	 * Transfer source payment transaction cd. 振替元収納取引ＣＤ.<p>
	 *
	 */
	public String sw_fr_ar_trd_cd() {
		return getConstString(offset + 35, $sw_fr_ar_trd_cd);
	}

	/**
	 * Transfer source payment transaction cd. 振替元収納取引ＣＤ.<p>
	 *
	 */
	public void sw_fr_ar_trd_cd(String value) {
		setConstString(offset + 35, $sw_fr_ar_trd_cd, value);
	}


	/**
	 * Transfer source payment result No. 振替元収納入金実績ＮＯ.<p>
	 *
	 */
	public String sw_fr_rcv_act_no() {
		return getConstString(offset + 36, $sw_fr_rcv_act_no);
	}

	/**
	 * Transfer source payment result No. 振替元収納入金実績ＮＯ.<p>
	 *
	 */
	public void sw_fr_rcv_act_no(String value) {
		setConstString(offset + 36, $sw_fr_rcv_act_no, value);
	}


	/**
	 * Transfer source payment result sequence number 振替元収納入金実績連番.<p>
	 *
	 */
	public MCNumber sw_fr_rcv_act_seq() {
		return getConstNumber(offset + 37, $sw_fr_rcv_act_seq);
	}

	/**
	 * Transfer source payment result sequence number 振替元収納入金実績連番.<p>
	 *
	 */
	public void sw_fr_rcv_act_seq(MCNumber value) {
		setConstNumber(offset + 37, $sw_fr_rcv_act_seq, value);
	}

	/**
	 * Transfer source payment result sequence number 振替元収納入金実績連番.<p>
	 *
	 */
	public void sw_fr_rcv_act_seq(int value) {
		setConstNumber(offset + 37, $sw_fr_rcv_act_seq, value);
	}

	/**
	 * Transfer source payment result sequence number 振替元収納入金実績連番.<p>
	 *
	 */
	public void sw_fr_rcv_act_seq(long value) {
		setConstNumber(offset + 37, $sw_fr_rcv_act_seq, value);
	}

	/**
	 * Transfer source payment result sequence number 振替元収納入金実績連番.<p>
	 *
	 */
	public void sw_fr_rcv_act_seq(float value) {
		setConstNumber(offset + 37, $sw_fr_rcv_act_seq, value);
	}

	/**
	 * Transfer source payment result sequence number 振替元収納入金実績連番.<p>
	 *
	 */
	public void sw_fr_rcv_act_seq(double value) {
		setConstNumber(offset + 37, $sw_fr_rcv_act_seq, value);
	}


	/**
	 * Transfer source payment result details No. 振替元収納入金実績明細ＮＯ.<p>
	 *
	 */
	public String sw_fr_rcv_act_d_no() {
		return getConstString(offset + 38, $sw_fr_rcv_act_d_no);
	}

	/**
	 * Transfer source payment result details No. 振替元収納入金実績明細ＮＯ.<p>
	 *
	 */
	public void sw_fr_rcv_act_d_no(String value) {
		setConstString(offset + 38, $sw_fr_rcv_act_d_no, value);
	}


	/**
	 * Transfer source payment result details sequence number 振替元収納入金実績明細連番.<p>
	 *
	 */
	public MCNumber sw_fr_rcv_act_d_seq() {
		return getConstNumber(offset + 39, $sw_fr_rcv_act_d_seq);
	}

	/**
	 * Transfer source payment result details sequence number 振替元収納入金実績明細連番.<p>
	 *
	 */
	public void sw_fr_rcv_act_d_seq(MCNumber value) {
		setConstNumber(offset + 39, $sw_fr_rcv_act_d_seq, value);
	}

	/**
	 * Transfer source payment result details sequence number 振替元収納入金実績明細連番.<p>
	 *
	 */
	public void sw_fr_rcv_act_d_seq(int value) {
		setConstNumber(offset + 39, $sw_fr_rcv_act_d_seq, value);
	}

	/**
	 * Transfer source payment result details sequence number 振替元収納入金実績明細連番.<p>
	 *
	 */
	public void sw_fr_rcv_act_d_seq(long value) {
		setConstNumber(offset + 39, $sw_fr_rcv_act_d_seq, value);
	}

	/**
	 * Transfer source payment result details sequence number 振替元収納入金実績明細連番.<p>
	 *
	 */
	public void sw_fr_rcv_act_d_seq(float value) {
		setConstNumber(offset + 39, $sw_fr_rcv_act_d_seq, value);
	}

	/**
	 * Transfer source payment result details sequence number 振替元収納入金実績明細連番.<p>
	 *
	 */
	public void sw_fr_rcv_act_d_seq(double value) {
		setConstNumber(offset + 39, $sw_fr_rcv_act_d_seq, value);
	}


	/**
	 * Transfer destination payment recording month 振替先収納計上年月.<p>
	 *
	 */
	public MCDate sw_to_ar_ac_ym() {
		return getConstDate(offset + 40, $sw_to_ar_ac_ym);
	}

	/**
	 * Transfer destination payment recording month 振替先収納計上年月.<p>
	 *
	 */
	public void sw_to_ar_ac_ym(MCDate value) {
		setConstDate(offset + 40, $sw_to_ar_ac_ym, value);
	}


	/**
	 * Transfer destination payment transaction cd. 振替先収納取引ＣＤ.<p>
	 *
	 */
	public String sw_to_ar_trd_cd() {
		return getConstString(offset + 41, $sw_to_ar_trd_cd);
	}

	/**
	 * Transfer destination payment transaction cd. 振替先収納取引ＣＤ.<p>
	 *
	 */
	public void sw_to_ar_trd_cd(String value) {
		setConstString(offset + 41, $sw_to_ar_trd_cd, value);
	}


	/**
	 * Transfer destination payment result No. 振替先収納入金実績ＮＯ.<p>
	 *
	 */
	public String sw_to_rcv_act_no() {
		return getConstString(offset + 42, $sw_to_rcv_act_no);
	}

	/**
	 * Transfer destination payment result No. 振替先収納入金実績ＮＯ.<p>
	 *
	 */
	public void sw_to_rcv_act_no(String value) {
		setConstString(offset + 42, $sw_to_rcv_act_no, value);
	}


	/**
	 * Transfer destination payment result sequence number 振替先収納入金実績連番.<p>
	 *
	 */
	public MCNumber sw_to_rcv_act_seq() {
		return getConstNumber(offset + 43, $sw_to_rcv_act_seq);
	}

	/**
	 * Transfer destination payment result sequence number 振替先収納入金実績連番.<p>
	 *
	 */
	public void sw_to_rcv_act_seq(MCNumber value) {
		setConstNumber(offset + 43, $sw_to_rcv_act_seq, value);
	}

	/**
	 * Transfer destination payment result sequence number 振替先収納入金実績連番.<p>
	 *
	 */
	public void sw_to_rcv_act_seq(int value) {
		setConstNumber(offset + 43, $sw_to_rcv_act_seq, value);
	}

	/**
	 * Transfer destination payment result sequence number 振替先収納入金実績連番.<p>
	 *
	 */
	public void sw_to_rcv_act_seq(long value) {
		setConstNumber(offset + 43, $sw_to_rcv_act_seq, value);
	}

	/**
	 * Transfer destination payment result sequence number 振替先収納入金実績連番.<p>
	 *
	 */
	public void sw_to_rcv_act_seq(float value) {
		setConstNumber(offset + 43, $sw_to_rcv_act_seq, value);
	}

	/**
	 * Transfer destination payment result sequence number 振替先収納入金実績連番.<p>
	 *
	 */
	public void sw_to_rcv_act_seq(double value) {
		setConstNumber(offset + 43, $sw_to_rcv_act_seq, value);
	}


	/**
	 * Transfer destination payment result details No. 振替先収納入金実績明細ＮＯ.<p>
	 *
	 */
	public String sw_to_rcv_act_d_no() {
		return getConstString(offset + 44, $sw_to_rcv_act_d_no);
	}

	/**
	 * Transfer destination payment result details No. 振替先収納入金実績明細ＮＯ.<p>
	 *
	 */
	public void sw_to_rcv_act_d_no(String value) {
		setConstString(offset + 44, $sw_to_rcv_act_d_no, value);
	}


	/**
	 * Transfer destination payment result details sequence number 振替先収納入金実績明細連番.<p>
	 *
	 */
	public MCNumber sw_to_rcv_act_d_seq() {
		return getConstNumber(offset + 45, $sw_to_rcv_act_d_seq);
	}

	/**
	 * Transfer destination payment result details sequence number 振替先収納入金実績明細連番.<p>
	 *
	 */
	public void sw_to_rcv_act_d_seq(MCNumber value) {
		setConstNumber(offset + 45, $sw_to_rcv_act_d_seq, value);
	}

	/**
	 * Transfer destination payment result details sequence number 振替先収納入金実績明細連番.<p>
	 *
	 */
	public void sw_to_rcv_act_d_seq(int value) {
		setConstNumber(offset + 45, $sw_to_rcv_act_d_seq, value);
	}

	/**
	 * Transfer destination payment result details sequence number 振替先収納入金実績明細連番.<p>
	 *
	 */
	public void sw_to_rcv_act_d_seq(long value) {
		setConstNumber(offset + 45, $sw_to_rcv_act_d_seq, value);
	}

	/**
	 * Transfer destination payment result details sequence number 振替先収納入金実績明細連番.<p>
	 *
	 */
	public void sw_to_rcv_act_d_seq(float value) {
		setConstNumber(offset + 45, $sw_to_rcv_act_d_seq, value);
	}

	/**
	 * Transfer destination payment result details sequence number 振替先収納入金実績明細連番.<p>
	 *
	 */
	public void sw_to_rcv_act_d_seq(double value) {
		setConstNumber(offset + 45, $sw_to_rcv_act_d_seq, value);
	}


	/**
	 * Reconciled amount 消込額.<p>
	 *
	 */
	public MCNumber appl_amt() {
		return getConstNumber(offset + 46, $appl_amt);
	}

	/**
	 * Reconciled amount 消込額.<p>
	 *
	 */
	public void appl_amt(MCNumber value) {
		setConstNumber(offset + 46, $appl_amt, value);
	}

	/**
	 * Reconciled amount 消込額.<p>
	 *
	 */
	public void appl_amt(int value) {
		setConstNumber(offset + 46, $appl_amt, value);
	}

	/**
	 * Reconciled amount 消込額.<p>
	 *
	 */
	public void appl_amt(long value) {
		setConstNumber(offset + 46, $appl_amt, value);
	}

	/**
	 * Reconciled amount 消込額.<p>
	 *
	 */
	public void appl_amt(float value) {
		setConstNumber(offset + 46, $appl_amt, value);
	}

	/**
	 * Reconciled amount 消込額.<p>
	 *
	 */
	public void appl_amt(double value) {
		setConstNumber(offset + 46, $appl_amt, value);
	}


	public String getString(String name) {
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($act_no.equalsIgnoreCase(name)) {
			return act_no();
		}
		if ($act_d_no.equalsIgnoreCase(name)) {
			return act_d_no();
		}
		if ($bill_d_no.equalsIgnoreCase(name)) {
			return bill_d_no();
		}
		if ($ar_trd_grp_typ.equalsIgnoreCase(name)) {
			return ar_trd_grp_typ();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			return slip_sts_typ();
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			return bill_mng_no();
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($bill_d_iv_no.equalsIgnoreCase(name)) {
			return bill_d_iv_no();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			return ar_typ();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($sw_to_bill_mng_no.equalsIgnoreCase(name)) {
			return sw_to_bill_mng_no();
		}
		if ($sw_to_acst_cd.equalsIgnoreCase(name)) {
			return sw_to_acst_cd();
		}
		if ($sw_fr_ar_trd_cd.equalsIgnoreCase(name)) {
			return sw_fr_ar_trd_cd();
		}
		if ($sw_fr_rcv_act_no.equalsIgnoreCase(name)) {
			return sw_fr_rcv_act_no();
		}
		if ($sw_fr_rcv_act_d_no.equalsIgnoreCase(name)) {
			return sw_fr_rcv_act_d_no();
		}
		if ($sw_to_ar_trd_cd.equalsIgnoreCase(name)) {
			return sw_to_ar_trd_cd();
		}
		if ($sw_to_rcv_act_no.equalsIgnoreCase(name)) {
			return sw_to_rcv_act_no();
		}
		if ($sw_to_rcv_act_d_no.equalsIgnoreCase(name)) {
			return sw_to_rcv_act_d_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($act_rev.equalsIgnoreCase(name)) {
			return act_rev();
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			return act_seq();
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			return act_d_seq();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			return base_cur_amt();
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_tax_amt();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($sw_to_bill_crryovr_times.equalsIgnoreCase(name)) {
			return sw_to_bill_crryovr_times();
		}
		if ($sw_fr_rcv_act_seq.equalsIgnoreCase(name)) {
			return sw_fr_rcv_act_seq();
		}
		if ($sw_fr_rcv_act_d_seq.equalsIgnoreCase(name)) {
			return sw_fr_rcv_act_d_seq();
		}
		if ($sw_to_rcv_act_seq.equalsIgnoreCase(name)) {
			return sw_to_rcv_act_seq();
		}
		if ($sw_to_rcv_act_d_seq.equalsIgnoreCase(name)) {
			return sw_to_rcv_act_d_seq();
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			return appl_amt();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
		}
		if ($sw_to_bill_ymd.equalsIgnoreCase(name)) {
			return sw_to_bill_ymd();
		}
		if ($sw_to_schd_bill_dt.equalsIgnoreCase(name)) {
			return sw_to_schd_bill_dt();
		}
		if ($sw_to_ac_dt.equalsIgnoreCase(name)) {
			return sw_to_ac_dt();
		}
		if ($sw_fr_ac_dt.equalsIgnoreCase(name)) {
			return sw_fr_ac_dt();
		}
		if ($sw_fr_ar_ac_ym.equalsIgnoreCase(name)) {
			return sw_fr_ar_ac_ym();
		}
		if ($sw_to_ar_ac_ym.equalsIgnoreCase(name)) {
			return sw_to_ar_ac_ym();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($act_no.equalsIgnoreCase(name)) {
			return act_no();
		}
		if ($act_d_no.equalsIgnoreCase(name)) {
			return act_d_no();
		}
		if ($bill_d_no.equalsIgnoreCase(name)) {
			return bill_d_no();
		}
		if ($ar_trd_grp_typ.equalsIgnoreCase(name)) {
			return ar_trd_grp_typ();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			return slip_sts_typ();
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			return bill_mng_no();
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($bill_d_iv_no.equalsIgnoreCase(name)) {
			return bill_d_iv_no();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			return ar_typ();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($sw_to_bill_mng_no.equalsIgnoreCase(name)) {
			return sw_to_bill_mng_no();
		}
		if ($sw_to_acst_cd.equalsIgnoreCase(name)) {
			return sw_to_acst_cd();
		}
		if ($sw_fr_ar_trd_cd.equalsIgnoreCase(name)) {
			return sw_fr_ar_trd_cd();
		}
		if ($sw_fr_rcv_act_no.equalsIgnoreCase(name)) {
			return sw_fr_rcv_act_no();
		}
		if ($sw_fr_rcv_act_d_no.equalsIgnoreCase(name)) {
			return sw_fr_rcv_act_d_no();
		}
		if ($sw_to_ar_trd_cd.equalsIgnoreCase(name)) {
			return sw_to_ar_trd_cd();
		}
		if ($sw_to_rcv_act_no.equalsIgnoreCase(name)) {
			return sw_to_rcv_act_no();
		}
		if ($sw_to_rcv_act_d_no.equalsIgnoreCase(name)) {
			return sw_to_rcv_act_d_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($act_rev.equalsIgnoreCase(name)) {
			return act_rev();
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			return act_seq();
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			return act_d_seq();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			return base_cur_amt();
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_tax_amt();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($sw_to_bill_crryovr_times.equalsIgnoreCase(name)) {
			return sw_to_bill_crryovr_times();
		}
		if ($sw_fr_rcv_act_seq.equalsIgnoreCase(name)) {
			return sw_fr_rcv_act_seq();
		}
		if ($sw_fr_rcv_act_d_seq.equalsIgnoreCase(name)) {
			return sw_fr_rcv_act_d_seq();
		}
		if ($sw_to_rcv_act_seq.equalsIgnoreCase(name)) {
			return sw_to_rcv_act_seq();
		}
		if ($sw_to_rcv_act_d_seq.equalsIgnoreCase(name)) {
			return sw_to_rcv_act_d_seq();
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			return appl_amt();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
		}
		if ($sw_to_bill_ymd.equalsIgnoreCase(name)) {
			return sw_to_bill_ymd();
		}
		if ($sw_to_schd_bill_dt.equalsIgnoreCase(name)) {
			return sw_to_schd_bill_dt();
		}
		if ($sw_to_ac_dt.equalsIgnoreCase(name)) {
			return sw_to_ac_dt();
		}
		if ($sw_fr_ac_dt.equalsIgnoreCase(name)) {
			return sw_fr_ac_dt();
		}
		if ($sw_fr_ar_ac_ym.equalsIgnoreCase(name)) {
			return sw_fr_ar_ac_ym();
		}
		if ($sw_to_ar_ac_ym.equalsIgnoreCase(name)) {
			return sw_to_ar_ac_ym();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($act_no.equalsIgnoreCase(name)) {
			act_no(value);
			return;
		}
		if ($act_d_no.equalsIgnoreCase(name)) {
			act_d_no(value);
			return;
		}
		if ($bill_d_no.equalsIgnoreCase(name)) {
			bill_d_no(value);
			return;
		}
		if ($ar_trd_grp_typ.equalsIgnoreCase(name)) {
			ar_trd_grp_typ(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			slip_sts_typ(value);
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
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			bill_mng_no(value);
			return;
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($bill_d_iv_no.equalsIgnoreCase(name)) {
			bill_d_iv_no(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			ar_typ(value);
			return;
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		if ($sw_to_bill_mng_no.equalsIgnoreCase(name)) {
			sw_to_bill_mng_no(value);
			return;
		}
		if ($sw_to_acst_cd.equalsIgnoreCase(name)) {
			sw_to_acst_cd(value);
			return;
		}
		if ($sw_fr_ar_trd_cd.equalsIgnoreCase(name)) {
			sw_fr_ar_trd_cd(value);
			return;
		}
		if ($sw_fr_rcv_act_no.equalsIgnoreCase(name)) {
			sw_fr_rcv_act_no(value);
			return;
		}
		if ($sw_fr_rcv_act_d_no.equalsIgnoreCase(name)) {
			sw_fr_rcv_act_d_no(value);
			return;
		}
		if ($sw_to_ar_trd_cd.equalsIgnoreCase(name)) {
			sw_to_ar_trd_cd(value);
			return;
		}
		if ($sw_to_rcv_act_no.equalsIgnoreCase(name)) {
			sw_to_rcv_act_no(value);
			return;
		}
		if ($sw_to_rcv_act_d_no.equalsIgnoreCase(name)) {
			sw_to_rcv_act_d_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($sw_to_bill_crryovr_times.equalsIgnoreCase(name)) {
			sw_to_bill_crryovr_times(value);
			return;
		}
		if ($sw_fr_rcv_act_seq.equalsIgnoreCase(name)) {
			sw_fr_rcv_act_seq(value);
			return;
		}
		if ($sw_fr_rcv_act_d_seq.equalsIgnoreCase(name)) {
			sw_fr_rcv_act_d_seq(value);
			return;
		}
		if ($sw_to_rcv_act_seq.equalsIgnoreCase(name)) {
			sw_to_rcv_act_seq(value);
			return;
		}
		if ($sw_to_rcv_act_d_seq.equalsIgnoreCase(name)) {
			sw_to_rcv_act_d_seq(value);
			return;
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			appl_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($sw_to_bill_crryovr_times.equalsIgnoreCase(name)) {
			sw_to_bill_crryovr_times(value);
			return;
		}
		if ($sw_fr_rcv_act_seq.equalsIgnoreCase(name)) {
			sw_fr_rcv_act_seq(value);
			return;
		}
		if ($sw_fr_rcv_act_d_seq.equalsIgnoreCase(name)) {
			sw_fr_rcv_act_d_seq(value);
			return;
		}
		if ($sw_to_rcv_act_seq.equalsIgnoreCase(name)) {
			sw_to_rcv_act_seq(value);
			return;
		}
		if ($sw_to_rcv_act_d_seq.equalsIgnoreCase(name)) {
			sw_to_rcv_act_d_seq(value);
			return;
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			appl_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($sw_to_bill_crryovr_times.equalsIgnoreCase(name)) {
			sw_to_bill_crryovr_times(value);
			return;
		}
		if ($sw_fr_rcv_act_seq.equalsIgnoreCase(name)) {
			sw_fr_rcv_act_seq(value);
			return;
		}
		if ($sw_fr_rcv_act_d_seq.equalsIgnoreCase(name)) {
			sw_fr_rcv_act_d_seq(value);
			return;
		}
		if ($sw_to_rcv_act_seq.equalsIgnoreCase(name)) {
			sw_to_rcv_act_seq(value);
			return;
		}
		if ($sw_to_rcv_act_d_seq.equalsIgnoreCase(name)) {
			sw_to_rcv_act_d_seq(value);
			return;
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			appl_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($sw_to_bill_crryovr_times.equalsIgnoreCase(name)) {
			sw_to_bill_crryovr_times(value);
			return;
		}
		if ($sw_fr_rcv_act_seq.equalsIgnoreCase(name)) {
			sw_fr_rcv_act_seq(value);
			return;
		}
		if ($sw_fr_rcv_act_d_seq.equalsIgnoreCase(name)) {
			sw_fr_rcv_act_d_seq(value);
			return;
		}
		if ($sw_to_rcv_act_seq.equalsIgnoreCase(name)) {
			sw_to_rcv_act_seq(value);
			return;
		}
		if ($sw_to_rcv_act_d_seq.equalsIgnoreCase(name)) {
			sw_to_rcv_act_d_seq(value);
			return;
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			appl_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($sw_to_bill_crryovr_times.equalsIgnoreCase(name)) {
			sw_to_bill_crryovr_times(value);
			return;
		}
		if ($sw_fr_rcv_act_seq.equalsIgnoreCase(name)) {
			sw_fr_rcv_act_seq(value);
			return;
		}
		if ($sw_fr_rcv_act_d_seq.equalsIgnoreCase(name)) {
			sw_fr_rcv_act_d_seq(value);
			return;
		}
		if ($sw_to_rcv_act_seq.equalsIgnoreCase(name)) {
			sw_to_rcv_act_seq(value);
			return;
		}
		if ($sw_to_rcv_act_d_seq.equalsIgnoreCase(name)) {
			sw_to_rcv_act_d_seq(value);
			return;
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			appl_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
			return;
		}
		if ($sw_to_bill_ymd.equalsIgnoreCase(name)) {
			sw_to_bill_ymd(value);
			return;
		}
		if ($sw_to_schd_bill_dt.equalsIgnoreCase(name)) {
			sw_to_schd_bill_dt(value);
			return;
		}
		if ($sw_to_ac_dt.equalsIgnoreCase(name)) {
			sw_to_ac_dt(value);
			return;
		}
		if ($sw_fr_ac_dt.equalsIgnoreCase(name)) {
			sw_fr_ac_dt(value);
			return;
		}
		if ($sw_fr_ar_ac_ym.equalsIgnoreCase(name)) {
			sw_fr_ar_ac_ym(value);
			return;
		}
		if ($sw_to_ar_ac_ym.equalsIgnoreCase(name)) {
			sw_to_ar_ac_ym(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($act_no.equalsIgnoreCase(name)) {
			act_no(value);
			return;
		}
		if ($act_d_no.equalsIgnoreCase(name)) {
			act_d_no(value);
			return;
		}
		if ($bill_d_no.equalsIgnoreCase(name)) {
			bill_d_no(value);
			return;
		}
		if ($ar_trd_grp_typ.equalsIgnoreCase(name)) {
			ar_trd_grp_typ(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			slip_sts_typ(value);
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
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			bill_mng_no(value);
			return;
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($bill_d_iv_no.equalsIgnoreCase(name)) {
			bill_d_iv_no(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			ar_typ(value);
			return;
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		if ($sw_to_bill_mng_no.equalsIgnoreCase(name)) {
			sw_to_bill_mng_no(value);
			return;
		}
		if ($sw_to_acst_cd.equalsIgnoreCase(name)) {
			sw_to_acst_cd(value);
			return;
		}
		if ($sw_fr_ar_trd_cd.equalsIgnoreCase(name)) {
			sw_fr_ar_trd_cd(value);
			return;
		}
		if ($sw_fr_rcv_act_no.equalsIgnoreCase(name)) {
			sw_fr_rcv_act_no(value);
			return;
		}
		if ($sw_fr_rcv_act_d_no.equalsIgnoreCase(name)) {
			sw_fr_rcv_act_d_no(value);
			return;
		}
		if ($sw_to_ar_trd_cd.equalsIgnoreCase(name)) {
			sw_to_ar_trd_cd(value);
			return;
		}
		if ($sw_to_rcv_act_no.equalsIgnoreCase(name)) {
			sw_to_rcv_act_no(value);
			return;
		}
		if ($sw_to_rcv_act_d_no.equalsIgnoreCase(name)) {
			sw_to_rcv_act_d_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($sw_to_bill_crryovr_times.equalsIgnoreCase(name)) {
			sw_to_bill_crryovr_times(value);
			return;
		}
		if ($sw_fr_rcv_act_seq.equalsIgnoreCase(name)) {
			sw_fr_rcv_act_seq(value);
			return;
		}
		if ($sw_fr_rcv_act_d_seq.equalsIgnoreCase(name)) {
			sw_fr_rcv_act_d_seq(value);
			return;
		}
		if ($sw_to_rcv_act_seq.equalsIgnoreCase(name)) {
			sw_to_rcv_act_seq(value);
			return;
		}
		if ($sw_to_rcv_act_d_seq.equalsIgnoreCase(name)) {
			sw_to_rcv_act_d_seq(value);
			return;
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			appl_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($sw_to_bill_crryovr_times.equalsIgnoreCase(name)) {
			sw_to_bill_crryovr_times(value);
			return;
		}
		if ($sw_fr_rcv_act_seq.equalsIgnoreCase(name)) {
			sw_fr_rcv_act_seq(value);
			return;
		}
		if ($sw_fr_rcv_act_d_seq.equalsIgnoreCase(name)) {
			sw_fr_rcv_act_d_seq(value);
			return;
		}
		if ($sw_to_rcv_act_seq.equalsIgnoreCase(name)) {
			sw_to_rcv_act_seq(value);
			return;
		}
		if ($sw_to_rcv_act_d_seq.equalsIgnoreCase(name)) {
			sw_to_rcv_act_d_seq(value);
			return;
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			appl_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($sw_to_bill_crryovr_times.equalsIgnoreCase(name)) {
			sw_to_bill_crryovr_times(value);
			return;
		}
		if ($sw_fr_rcv_act_seq.equalsIgnoreCase(name)) {
			sw_fr_rcv_act_seq(value);
			return;
		}
		if ($sw_fr_rcv_act_d_seq.equalsIgnoreCase(name)) {
			sw_fr_rcv_act_d_seq(value);
			return;
		}
		if ($sw_to_rcv_act_seq.equalsIgnoreCase(name)) {
			sw_to_rcv_act_seq(value);
			return;
		}
		if ($sw_to_rcv_act_d_seq.equalsIgnoreCase(name)) {
			sw_to_rcv_act_d_seq(value);
			return;
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			appl_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($sw_to_bill_crryovr_times.equalsIgnoreCase(name)) {
			sw_to_bill_crryovr_times(value);
			return;
		}
		if ($sw_fr_rcv_act_seq.equalsIgnoreCase(name)) {
			sw_fr_rcv_act_seq(value);
			return;
		}
		if ($sw_fr_rcv_act_d_seq.equalsIgnoreCase(name)) {
			sw_fr_rcv_act_d_seq(value);
			return;
		}
		if ($sw_to_rcv_act_seq.equalsIgnoreCase(name)) {
			sw_to_rcv_act_seq(value);
			return;
		}
		if ($sw_to_rcv_act_d_seq.equalsIgnoreCase(name)) {
			sw_to_rcv_act_d_seq(value);
			return;
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			appl_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($sw_to_bill_crryovr_times.equalsIgnoreCase(name)) {
			sw_to_bill_crryovr_times(value);
			return;
		}
		if ($sw_fr_rcv_act_seq.equalsIgnoreCase(name)) {
			sw_fr_rcv_act_seq(value);
			return;
		}
		if ($sw_fr_rcv_act_d_seq.equalsIgnoreCase(name)) {
			sw_fr_rcv_act_d_seq(value);
			return;
		}
		if ($sw_to_rcv_act_seq.equalsIgnoreCase(name)) {
			sw_to_rcv_act_seq(value);
			return;
		}
		if ($sw_to_rcv_act_d_seq.equalsIgnoreCase(name)) {
			sw_to_rcv_act_d_seq(value);
			return;
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			appl_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
			return;
		}
		if ($sw_to_bill_ymd.equalsIgnoreCase(name)) {
			sw_to_bill_ymd(value);
			return;
		}
		if ($sw_to_schd_bill_dt.equalsIgnoreCase(name)) {
			sw_to_schd_bill_dt(value);
			return;
		}
		if ($sw_to_ac_dt.equalsIgnoreCase(name)) {
			sw_to_ac_dt(value);
			return;
		}
		if ($sw_fr_ac_dt.equalsIgnoreCase(name)) {
			sw_fr_ac_dt(value);
			return;
		}
		if ($sw_fr_ar_ac_ym.equalsIgnoreCase(name)) {
			sw_fr_ar_ac_ym(value);
			return;
		}
		if ($sw_to_ar_ac_ym.equalsIgnoreCase(name)) {
			sw_to_ar_ac_ym(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

