package mcframe.serverMSBG.MSBGL5090;

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
 * ブロック"RcvActIfCrt_Ins01_RcvAct"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RcvActIfCrt_Ins01_RcvActR_MC_A extends MCConstRow {

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public static final String $trd_cd = "trd_cd";
	/**
	 * Payment received result No. 入金実績ＮＯ.<p>
	 *
	 */
	public static final String $rcv_act_no = "rcv_act_no";
	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public static final String $rcv_act_seq = "rcv_act_seq";
	/**
	 * Payment received result rev. number 入金実績改訂番号.<p>
	 *
	 */
	public static final String $rcv_act_rev = "rcv_act_rev";
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
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public static final String $trd_ptn_typ = "trd_ptn_typ";
	/**
	 * Payment received No. 入金ＮＯ.<p>
	 *
	 */
	public static final String $rcv_no = "rcv_no";
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public static final String $dpt_cd = "dpt_cd";
	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public static final String $usr_cd = "usr_cd";
	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public static final String $rcst_cd = "rcst_cd";
	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public static final String $bcst_cd = "bcst_cd";
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public static final String $ac_ym = "ac_ym";
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public static final String $base_cur_cd = "base_cur_cd";
	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public static final String $xrate_cd = "xrate_cd";
	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public static final String $xrate = "xrate";
	/**
	 * Transaction accounting reason cd. 取引会計理由ＣＤ.<p>
	 *
	 */
	public static final String $trd_ac_rsn_cd = "trd_ac_rsn_cd";
	/**
	 * AR settlement accounting reason cd. 1 債権決済会計理由ＣＤ１.<p>
	 *
	 */
	public static final String $ar_sttl_ac_rsn_cd1 = "ar_sttl_ac_rsn_cd1";
	/**
	 * Tax cd. 1 消費税ＣＤ１.<p>
	 *
	 */
	public static final String $tax_cd1 = "tax_cd1";
	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public static final String $bank_ac_cd = "bank_ac_cd";
	/**
	 * Payment person name 振込人名.<p>
	 *
	 */
	public static final String $xfr_psn = "xfr_psn";
	/**
	 * Note No. 手形ＮＯ.<p>
	 *
	 */
	public static final String $note_no = "note_no";
	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public static final String $bd_dpt_cd = "bd_dpt_cd";
	/**
	 * AR/AP BP identification type 債権債務先識別区分.<p>
	 *
	 */
	public static final String $debt_cred_id_typ = "debt_cred_id_typ";
	/**
	 * AR/AP identification cd. 債権債務先識別ＣＤ.<p>
	 *
	 */
	public static final String $debt_cred_id_cd = "debt_cred_id_cd";
	/**
	 * AR/AP remarks 債権債務先備考.<p>
	 *
	 */
	public static final String $debt_cred_nm = "debt_cred_nm";
	/**
	 * AR settlement method cd. 2 債権決済方法ＣＤ２.<p>
	 *
	 */
	public static final String $ar_sttl_cd2 = "ar_sttl_cd2";
	/**
	 * AR settlement accounting reason cd. 2 債権決済会計理由ＣＤ２.<p>
	 *
	 */
	public static final String $ar_sttl_ac_rsn_cd2 = "ar_sttl_ac_rsn_cd2";
	/**
	 * AR settlement accounting reason cd. 3 債権決済会計理由ＣＤ３.<p>
	 *
	 */
	public static final String $ar_sttl_ac_rsn_cd3 = "ar_sttl_ac_rsn_cd3";
	/**
	 * Tax cd. 2 消費税ＣＤ２.<p>
	 *
	 */
	public static final String $tax_cd2 = "tax_cd2";
	/**
	 * Slip remarks 伝票備考.<p>
	 *
	 */
	public static final String $trd_rmrks = "trd_rmrks";
	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public static final String $slip_sts_typ = "slip_sts_typ";
	/**
	 * Parent incoming payment result No. 親入金実績ＮＯ.<p>
	 *
	 */
	public static final String $par_rcv_act_no = "par_rcv_act_no";
	/**
	 * Parent incoming payment result sequence number 親入金実績連番.<p>
	 *
	 */
	public static final String $par_rcv_act_seq = "par_rcv_act_seq";
	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public static final String $acst_cd = "acst_cd";
	/**
	 * AR dept. cd. 売掛部門ＣＤ.<p>
	 *
	 */
	public static final String $ar_dpt_cd = "ar_dpt_cd";
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
	/**
	 * Sales project cd. 案件ＣＤ.<p>
	 *
	 */
	public static final String $wrk_no = "wrk_no";
	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public static final String $ar_typ = "ar_typ";
	/**
	 * Amount 1 金額１.<p>
	 *
	 */
	public static final String $trd_cur_amt1 = "trd_cur_amt1";
	/**
	 * Tax inclusive amount 1 内消費税額１.<p>
	 *
	 */
	public static final String $trd_cur_tax_amt1 = "trd_cur_tax_amt1";
	/**
	 * Amount 2 金額２.<p>
	 *
	 */
	public static final String $trd_cur_amt2 = "trd_cur_amt2";
	/**
	 * Tax inclusive amount 2 内消費税額２.<p>
	 *
	 */
	public static final String $trd_cur_tax_amt2 = "trd_cur_tax_amt2";
	/**
	 * Amount 3 金額３.<p>
	 *
	 */
	public static final String $trd_cur_amt3 = "trd_cur_amt3";
	/**
	 * Tax inclusive amount 3 内消費税額３.<p>
	 *
	 */
	public static final String $trd_cur_tax_amt3 = "trd_cur_tax_amt3";
	/**
	 * Base amount 1 基準金額１.<p>
	 *
	 */
	public static final String $base_cur_amt1 = "base_cur_amt1";
	/**
	 * Base tax amount 1 基準内消費税額１.<p>
	 *
	 */
	public static final String $base_cur_tax_amt1 = "base_cur_tax_amt1";
	/**
	 * Base amount 2 基準金額２.<p>
	 *
	 */
	public static final String $base_cur_amt2 = "base_cur_amt2";
	/**
	 * Base tax amount 2 基準内消費税額２.<p>
	 *
	 */
	public static final String $base_cur_tax_amt2 = "base_cur_tax_amt2";
	/**
	 * Base amount 3 基準金額３.<p>
	 *
	 */
	public static final String $base_cur_amt3 = "base_cur_amt3";
	/**
	 * Base tax amount 3 基準内消費税額３.<p>
	 *
	 */
	public static final String $base_cur_tax_amt3 = "base_cur_tax_amt3";
	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public static final String $dtl_exc_gain_loss = "dtl_exc_gain_loss";


	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta rcv_act_no_META = createCommonMeta($rcv_act_no, mcframe.commonMA.meta.MA_META.RCV_ACT_NO);
	public static final MCMeta rcv_act_seq_META = createCommonMeta($rcv_act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta rcv_act_rev_META = createCommonMeta($rcv_act_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta rcv_act_d_no_META = createCommonMeta($rcv_act_d_no, mcframe.commonMA.meta.MA_META.RCV_ACT_D_NO);
	public static final MCMeta rcv_act_d_seq_META = createCommonMeta($rcv_act_d_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta rcv_no_META = createCommonMeta($rcv_no, mcframe.commonMA.meta.MA_META.RCV_NO);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta usr_cd_META = createCommonMeta($usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta rcst_cd_META = createCommonMeta($rcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bcst_cd_META = createCommonMeta($bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ac_ym_META = createCommonMeta($ac_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta base_cur_cd_META = createCommonMeta($base_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta xrate_cd_META = createCommonMeta($xrate_cd, mcframe.commonMA.meta.MA_META.XRATE_CD);
	public static final MCMeta xrate_META = createCommonMeta($xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_ac_rsn_cd_META = createCommonMeta($trd_ac_rsn_cd, mcframe.commonMA.meta.MA_META.AC_RSN_CD);
	public static final MCMeta ar_sttl_ac_rsn_cd1_META = createCommonMeta($ar_sttl_ac_rsn_cd1, mcframe.commonMA.meta.MA_META.AC_RSN_CD);
	public static final MCMeta tax_cd1_META = createCommonMeta($tax_cd1, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta bank_ac_cd_META = createCommonMeta($bank_ac_cd, mcframe.commonMA.meta.MA_META.BANK_AC_CD);
	public static final MCMeta xfr_psn_META = createCommonMeta($xfr_psn, mcframe.commonMA.meta.MA_META.XFR_PSN);
	public static final MCMeta note_no_META = createCommonMeta($note_no, mcframe.commonMA.meta.MA_META.NOTE_NO);
	public static final MCMeta bd_dpt_cd_META = createCommonMeta($bd_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta debt_cred_id_typ_META = createCommonMeta($debt_cred_id_typ, mcframe.commonMA.meta.MA_META.DEBT_CRED_ID_TYP);
	public static final MCMeta debt_cred_id_cd_META = createCommonMeta($debt_cred_id_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta debt_cred_nm_META = createCommonMeta($debt_cred_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta ar_sttl_cd2_META = createCommonMeta($ar_sttl_cd2, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta ar_sttl_ac_rsn_cd2_META = createCommonMeta($ar_sttl_ac_rsn_cd2, mcframe.commonMA.meta.MA_META.AC_RSN_CD);
	public static final MCMeta ar_sttl_ac_rsn_cd3_META = createCommonMeta($ar_sttl_ac_rsn_cd3, mcframe.commonMA.meta.MA_META.AC_RSN_CD);
	public static final MCMeta tax_cd2_META = createCommonMeta($tax_cd2, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta trd_rmrks_META = createCommonMeta($trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta slip_sts_typ_META = createCommonMeta($slip_sts_typ, mcframe.commonMA.meta.MA_META.SLIP_STS_TYP);
	public static final MCMeta par_rcv_act_no_META = createCommonMeta($par_rcv_act_no, mcframe.commonMA.meta.MA_META.RCV_ACT_NO);
	public static final MCMeta par_rcv_act_seq_META = createCommonMeta($par_rcv_act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta acst_cd_META = createCommonMeta($acst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta ar_dpt_cd_META = createCommonMeta($ar_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta ar_typ_META = createCommonMeta($ar_typ, mcframe.commonMA.meta.MA_META.AR_TYP);
	public static final MCMeta trd_cur_amt1_META = createCommonMeta($trd_cur_amt1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_tax_amt1_META = createCommonMeta($trd_cur_tax_amt1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_amt2_META = createCommonMeta($trd_cur_amt2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_tax_amt2_META = createCommonMeta($trd_cur_tax_amt2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_amt3_META = createCommonMeta($trd_cur_amt3, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_tax_amt3_META = createCommonMeta($trd_cur_tax_amt3, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_amt1_META = createCommonMeta($base_cur_amt1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_tax_amt1_META = createCommonMeta($base_cur_tax_amt1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_amt2_META = createCommonMeta($base_cur_amt2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_tax_amt2_META = createCommonMeta($base_cur_tax_amt2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_amt3_META = createCommonMeta($base_cur_amt3, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_tax_amt3_META = createCommonMeta($base_cur_tax_amt3, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta dtl_exc_gain_loss_META = createCommonMeta($dtl_exc_gain_loss, mcframe.commonMA.meta.MA_META.MONEY);

	protected static final ConstMetaList<RcvActIfCrt_Ins01_RcvActR> constMetas = new ConstMetaList<RcvActIfCrt_Ins01_RcvActR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			trd_cd_META,
			rcv_act_no_META,
			rcv_act_seq_META,
			rcv_act_rev_META,
			rcv_act_d_no_META,
			rcv_act_d_seq_META,
			trd_ptn_typ_META,
			rcv_no_META,
			dpt_cd_META,
			usr_cd_META,
			rcst_cd_META,
			bcst_cd_META,
			ac_dt_META,
			ac_ym_META,
			trd_cur_cd_META,
			base_cur_cd_META,
			xrate_cd_META,
			xrate_META,
			trd_ac_rsn_cd_META,
			ar_sttl_ac_rsn_cd1_META,
			tax_cd1_META,
			bank_ac_cd_META,
			xfr_psn_META,
			note_no_META,
			bd_dpt_cd_META,
			debt_cred_id_typ_META,
			debt_cred_id_cd_META,
			debt_cred_nm_META,
			ar_sttl_cd2_META,
			ar_sttl_ac_rsn_cd2_META,
			ar_sttl_ac_rsn_cd3_META,
			tax_cd2_META,
			trd_rmrks_META,
			slip_sts_typ_META,
			par_rcv_act_no_META,
			par_rcv_act_seq_META,
			acst_cd_META,
			ar_dpt_cd_META,
			iv_no_META,
			wrk_no_META,
			ar_typ_META,
			trd_cur_amt1_META,
			trd_cur_tax_amt1_META,
			trd_cur_amt2_META,
			trd_cur_tax_amt2_META,
			trd_cur_amt3_META,
			trd_cur_tax_amt3_META,
			base_cur_amt1_META,
			base_cur_tax_amt1_META,
			base_cur_amt2_META,
			base_cur_tax_amt2_META,
			base_cur_amt3_META,
			base_cur_tax_amt3_META,
			dtl_exc_gain_loss_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);


	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null
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
	protected RcvActIfCrt_Ins01_RcvActR_MC_A(ConstMetaList<? extends RcvActIfCrt_Ins01_RcvActR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RcvActIfCrt_Ins01_RcvActR clone() {
		return (RcvActIfCrt_Ins01_RcvActR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RcvActIfCrt_Ins01_RcvActR createInstance() {
		return (RcvActIfCrt_Ins01_RcvActR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RcvActIfCrt_Ins01_RcvActR getValues(String... names) {
		return (RcvActIfCrt_Ins01_RcvActR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 0, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 0, $trd_cd, value);
	}


	/**
	 * Payment received result No. 入金実績ＮＯ.<p>
	 *
	 */
	public String rcv_act_no() {
		return getConstString(offset + 1, $rcv_act_no);
	}

	/**
	 * Payment received result No. 入金実績ＮＯ.<p>
	 *
	 */
	public void rcv_act_no(String value) {
		setConstString(offset + 1, $rcv_act_no, value);
	}


	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public MCNumber rcv_act_seq() {
		return getConstNumber(offset + 2, $rcv_act_seq);
	}

	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public void rcv_act_seq(MCNumber value) {
		setConstNumber(offset + 2, $rcv_act_seq, value);
	}

	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public void rcv_act_seq(int value) {
		setConstNumber(offset + 2, $rcv_act_seq, value);
	}

	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public void rcv_act_seq(long value) {
		setConstNumber(offset + 2, $rcv_act_seq, value);
	}

	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public void rcv_act_seq(float value) {
		setConstNumber(offset + 2, $rcv_act_seq, value);
	}

	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public void rcv_act_seq(double value) {
		setConstNumber(offset + 2, $rcv_act_seq, value);
	}


	/**
	 * Payment received result rev. number 入金実績改訂番号.<p>
	 *
	 */
	public MCNumber rcv_act_rev() {
		return getConstNumber(offset + 3, $rcv_act_rev);
	}

	/**
	 * Payment received result rev. number 入金実績改訂番号.<p>
	 *
	 */
	public void rcv_act_rev(MCNumber value) {
		setConstNumber(offset + 3, $rcv_act_rev, value);
	}

	/**
	 * Payment received result rev. number 入金実績改訂番号.<p>
	 *
	 */
	public void rcv_act_rev(int value) {
		setConstNumber(offset + 3, $rcv_act_rev, value);
	}

	/**
	 * Payment received result rev. number 入金実績改訂番号.<p>
	 *
	 */
	public void rcv_act_rev(long value) {
		setConstNumber(offset + 3, $rcv_act_rev, value);
	}

	/**
	 * Payment received result rev. number 入金実績改訂番号.<p>
	 *
	 */
	public void rcv_act_rev(float value) {
		setConstNumber(offset + 3, $rcv_act_rev, value);
	}

	/**
	 * Payment received result rev. number 入金実績改訂番号.<p>
	 *
	 */
	public void rcv_act_rev(double value) {
		setConstNumber(offset + 3, $rcv_act_rev, value);
	}


	/**
	 * Payment received result details No. 入金実績明細ＮＯ.<p>
	 *
	 */
	public String rcv_act_d_no() {
		return getConstString(offset + 4, $rcv_act_d_no);
	}

	/**
	 * Payment received result details No. 入金実績明細ＮＯ.<p>
	 *
	 */
	public void rcv_act_d_no(String value) {
		setConstString(offset + 4, $rcv_act_d_no, value);
	}


	/**
	 * Payment received result details sequence number 入金実績明細連番.<p>
	 *
	 */
	public MCNumber rcv_act_d_seq() {
		return getConstNumber(offset + 5, $rcv_act_d_seq);
	}

	/**
	 * Payment received result details sequence number 入金実績明細連番.<p>
	 *
	 */
	public void rcv_act_d_seq(MCNumber value) {
		setConstNumber(offset + 5, $rcv_act_d_seq, value);
	}

	/**
	 * Payment received result details sequence number 入金実績明細連番.<p>
	 *
	 */
	public void rcv_act_d_seq(int value) {
		setConstNumber(offset + 5, $rcv_act_d_seq, value);
	}

	/**
	 * Payment received result details sequence number 入金実績明細連番.<p>
	 *
	 */
	public void rcv_act_d_seq(long value) {
		setConstNumber(offset + 5, $rcv_act_d_seq, value);
	}

	/**
	 * Payment received result details sequence number 入金実績明細連番.<p>
	 *
	 */
	public void rcv_act_d_seq(float value) {
		setConstNumber(offset + 5, $rcv_act_d_seq, value);
	}

	/**
	 * Payment received result details sequence number 入金実績明細連番.<p>
	 *
	 */
	public void rcv_act_d_seq(double value) {
		setConstNumber(offset + 5, $rcv_act_d_seq, value);
	}


	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 6, $trd_ptn_typ);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 6, $trd_ptn_typ, value);
	}


	/**
	 * Payment received No. 入金ＮＯ.<p>
	 *
	 */
	public String rcv_no() {
		return getConstString(offset + 7, $rcv_no);
	}

	/**
	 * Payment received No. 入金ＮＯ.<p>
	 *
	 */
	public void rcv_no(String value) {
		setConstString(offset + 7, $rcv_no, value);
	}


	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 8, $dpt_cd);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 8, $dpt_cd, value);
	}


	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public String usr_cd() {
		return getConstString(offset + 9, $usr_cd);
	}

	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public void usr_cd(String value) {
		setConstString(offset + 9, $usr_cd, value);
	}


	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public String rcst_cd() {
		return getConstString(offset + 10, $rcst_cd);
	}

	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public void rcst_cd(String value) {
		setConstString(offset + 10, $rcst_cd, value);
	}


	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public String bcst_cd() {
		return getConstString(offset + 11, $bcst_cd);
	}

	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public void bcst_cd(String value) {
		setConstString(offset + 11, $bcst_cd, value);
	}


	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 12, $ac_dt);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 12, $ac_dt, value);
	}


	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public MCDate ac_ym() {
		return getConstDate(offset + 13, $ac_ym);
	}

	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public void ac_ym(MCDate value) {
		setConstDate(offset + 13, $ac_ym, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 14, $trd_cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 14, $trd_cur_cd, value);
	}


	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public String base_cur_cd() {
		return getConstString(offset + 15, $base_cur_cd);
	}

	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public void base_cur_cd(String value) {
		setConstString(offset + 15, $base_cur_cd, value);
	}


	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public String xrate_cd() {
		return getConstString(offset + 16, $xrate_cd);
	}

	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public void xrate_cd(String value) {
		setConstString(offset + 16, $xrate_cd, value);
	}


	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCNumber xrate() {
		return getConstNumber(offset + 17, $xrate);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		setConstNumber(offset + 17, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(int value) {
		setConstNumber(offset + 17, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(long value) {
		setConstNumber(offset + 17, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(float value) {
		setConstNumber(offset + 17, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(double value) {
		setConstNumber(offset + 17, $xrate, value);
	}


	/**
	 * Transaction accounting reason cd. 取引会計理由ＣＤ.<p>
	 *
	 */
	public String trd_ac_rsn_cd() {
		return getConstString(offset + 18, $trd_ac_rsn_cd);
	}

	/**
	 * Transaction accounting reason cd. 取引会計理由ＣＤ.<p>
	 *
	 */
	public void trd_ac_rsn_cd(String value) {
		setConstString(offset + 18, $trd_ac_rsn_cd, value);
	}


	/**
	 * AR settlement accounting reason cd. 1 債権決済会計理由ＣＤ１.<p>
	 *
	 */
	public String ar_sttl_ac_rsn_cd1() {
		return getConstString(offset + 19, $ar_sttl_ac_rsn_cd1);
	}

	/**
	 * AR settlement accounting reason cd. 1 債権決済会計理由ＣＤ１.<p>
	 *
	 */
	public void ar_sttl_ac_rsn_cd1(String value) {
		setConstString(offset + 19, $ar_sttl_ac_rsn_cd1, value);
	}


	/**
	 * Tax cd. 1 消費税ＣＤ１.<p>
	 *
	 */
	public String tax_cd1() {
		return getConstString(offset + 20, $tax_cd1);
	}

	/**
	 * Tax cd. 1 消費税ＣＤ１.<p>
	 *
	 */
	public void tax_cd1(String value) {
		setConstString(offset + 20, $tax_cd1, value);
	}


	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public String bank_ac_cd() {
		return getConstString(offset + 21, $bank_ac_cd);
	}

	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public void bank_ac_cd(String value) {
		setConstString(offset + 21, $bank_ac_cd, value);
	}


	/**
	 * Payment person name 振込人名.<p>
	 *
	 */
	public String xfr_psn() {
		return getConstString(offset + 22, $xfr_psn);
	}

	/**
	 * Payment person name 振込人名.<p>
	 *
	 */
	public void xfr_psn(String value) {
		setConstString(offset + 22, $xfr_psn, value);
	}


	/**
	 * Note No. 手形ＮＯ.<p>
	 *
	 */
	public String note_no() {
		return getConstString(offset + 23, $note_no);
	}

	/**
	 * Note No. 手形ＮＯ.<p>
	 *
	 */
	public void note_no(String value) {
		setConstString(offset + 23, $note_no, value);
	}


	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public String bd_dpt_cd() {
		return getConstString(offset + 24, $bd_dpt_cd);
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		setConstString(offset + 24, $bd_dpt_cd, value);
	}


	/**
	 * AR/AP BP identification type 債権債務先識別区分.<p>
	 *
	 */
	public String debt_cred_id_typ() {
		return getConstString(offset + 25, $debt_cred_id_typ);
	}

	/**
	 * AR/AP BP identification type 債権債務先識別区分.<p>
	 *
	 */
	public void debt_cred_id_typ(String value) {
		setConstString(offset + 25, $debt_cred_id_typ, value);
	}


	/**
	 * AR/AP identification cd. 債権債務先識別ＣＤ.<p>
	 *
	 */
	public String debt_cred_id_cd() {
		return getConstString(offset + 26, $debt_cred_id_cd);
	}

	/**
	 * AR/AP identification cd. 債権債務先識別ＣＤ.<p>
	 *
	 */
	public void debt_cred_id_cd(String value) {
		setConstString(offset + 26, $debt_cred_id_cd, value);
	}


	/**
	 * AR/AP remarks 債権債務先備考.<p>
	 *
	 */
	public String debt_cred_nm() {
		return getConstString(offset + 27, $debt_cred_nm);
	}

	/**
	 * AR/AP remarks 債権債務先備考.<p>
	 *
	 */
	public void debt_cred_nm(String value) {
		setConstString(offset + 27, $debt_cred_nm, value);
	}


	/**
	 * AR settlement method cd. 2 債権決済方法ＣＤ２.<p>
	 *
	 */
	public String ar_sttl_cd2() {
		return getConstString(offset + 28, $ar_sttl_cd2);
	}

	/**
	 * AR settlement method cd. 2 債権決済方法ＣＤ２.<p>
	 *
	 */
	public void ar_sttl_cd2(String value) {
		setConstString(offset + 28, $ar_sttl_cd2, value);
	}


	/**
	 * AR settlement accounting reason cd. 2 債権決済会計理由ＣＤ２.<p>
	 *
	 */
	public String ar_sttl_ac_rsn_cd2() {
		return getConstString(offset + 29, $ar_sttl_ac_rsn_cd2);
	}

	/**
	 * AR settlement accounting reason cd. 2 債権決済会計理由ＣＤ２.<p>
	 *
	 */
	public void ar_sttl_ac_rsn_cd2(String value) {
		setConstString(offset + 29, $ar_sttl_ac_rsn_cd2, value);
	}


	/**
	 * AR settlement accounting reason cd. 3 債権決済会計理由ＣＤ３.<p>
	 *
	 */
	public String ar_sttl_ac_rsn_cd3() {
		return getConstString(offset + 30, $ar_sttl_ac_rsn_cd3);
	}

	/**
	 * AR settlement accounting reason cd. 3 債権決済会計理由ＣＤ３.<p>
	 *
	 */
	public void ar_sttl_ac_rsn_cd3(String value) {
		setConstString(offset + 30, $ar_sttl_ac_rsn_cd3, value);
	}


	/**
	 * Tax cd. 2 消費税ＣＤ２.<p>
	 *
	 */
	public String tax_cd2() {
		return getConstString(offset + 31, $tax_cd2);
	}

	/**
	 * Tax cd. 2 消費税ＣＤ２.<p>
	 *
	 */
	public void tax_cd2(String value) {
		setConstString(offset + 31, $tax_cd2, value);
	}


	/**
	 * Slip remarks 伝票備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return getConstString(offset + 32, $trd_rmrks);
	}

	/**
	 * Slip remarks 伝票備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		setConstString(offset + 32, $trd_rmrks, value);
	}


	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public String slip_sts_typ() {
		return getConstString(offset + 33, $slip_sts_typ);
	}

	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public void slip_sts_typ(String value) {
		setConstString(offset + 33, $slip_sts_typ, value);
	}


	/**
	 * Parent incoming payment result No. 親入金実績ＮＯ.<p>
	 *
	 */
	public String par_rcv_act_no() {
		return getConstString(offset + 34, $par_rcv_act_no);
	}

	/**
	 * Parent incoming payment result No. 親入金実績ＮＯ.<p>
	 *
	 */
	public void par_rcv_act_no(String value) {
		setConstString(offset + 34, $par_rcv_act_no, value);
	}


	/**
	 * Parent incoming payment result sequence number 親入金実績連番.<p>
	 *
	 */
	public MCNumber par_rcv_act_seq() {
		return getConstNumber(offset + 35, $par_rcv_act_seq);
	}

	/**
	 * Parent incoming payment result sequence number 親入金実績連番.<p>
	 *
	 */
	public void par_rcv_act_seq(MCNumber value) {
		setConstNumber(offset + 35, $par_rcv_act_seq, value);
	}

	/**
	 * Parent incoming payment result sequence number 親入金実績連番.<p>
	 *
	 */
	public void par_rcv_act_seq(int value) {
		setConstNumber(offset + 35, $par_rcv_act_seq, value);
	}

	/**
	 * Parent incoming payment result sequence number 親入金実績連番.<p>
	 *
	 */
	public void par_rcv_act_seq(long value) {
		setConstNumber(offset + 35, $par_rcv_act_seq, value);
	}

	/**
	 * Parent incoming payment result sequence number 親入金実績連番.<p>
	 *
	 */
	public void par_rcv_act_seq(float value) {
		setConstNumber(offset + 35, $par_rcv_act_seq, value);
	}

	/**
	 * Parent incoming payment result sequence number 親入金実績連番.<p>
	 *
	 */
	public void par_rcv_act_seq(double value) {
		setConstNumber(offset + 35, $par_rcv_act_seq, value);
	}


	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public String acst_cd() {
		return getConstString(offset + 36, $acst_cd);
	}

	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public void acst_cd(String value) {
		setConstString(offset + 36, $acst_cd, value);
	}


	/**
	 * AR dept. cd. 売掛部門ＣＤ.<p>
	 *
	 */
	public String ar_dpt_cd() {
		return getConstString(offset + 37, $ar_dpt_cd);
	}

	/**
	 * AR dept. cd. 売掛部門ＣＤ.<p>
	 *
	 */
	public void ar_dpt_cd(String value) {
		setConstString(offset + 37, $ar_dpt_cd, value);
	}


	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 38, $iv_no);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 38, $iv_no, value);
	}


	/**
	 * Sales project cd. 案件ＣＤ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 39, $wrk_no);
	}

	/**
	 * Sales project cd. 案件ＣＤ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 39, $wrk_no, value);
	}


	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public String ar_typ() {
		return getConstString(offset + 40, $ar_typ);
	}

	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public void ar_typ(String value) {
		setConstString(offset + 40, $ar_typ, value);
	}


	/**
	 * Amount 1 金額１.<p>
	 *
	 */
	public MCNumber trd_cur_amt1() {
		return getConstNumber(offset + 41, $trd_cur_amt1);
	}

	/**
	 * Amount 1 金額１.<p>
	 *
	 */
	public void trd_cur_amt1(MCNumber value) {
		setConstNumber(offset + 41, $trd_cur_amt1, value);
	}

	/**
	 * Amount 1 金額１.<p>
	 *
	 */
	public void trd_cur_amt1(int value) {
		setConstNumber(offset + 41, $trd_cur_amt1, value);
	}

	/**
	 * Amount 1 金額１.<p>
	 *
	 */
	public void trd_cur_amt1(long value) {
		setConstNumber(offset + 41, $trd_cur_amt1, value);
	}

	/**
	 * Amount 1 金額１.<p>
	 *
	 */
	public void trd_cur_amt1(float value) {
		setConstNumber(offset + 41, $trd_cur_amt1, value);
	}

	/**
	 * Amount 1 金額１.<p>
	 *
	 */
	public void trd_cur_amt1(double value) {
		setConstNumber(offset + 41, $trd_cur_amt1, value);
	}


	/**
	 * Tax inclusive amount 1 内消費税額１.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt1() {
		return getConstNumber(offset + 42, $trd_cur_tax_amt1);
	}

	/**
	 * Tax inclusive amount 1 内消費税額１.<p>
	 *
	 */
	public void trd_cur_tax_amt1(MCNumber value) {
		setConstNumber(offset + 42, $trd_cur_tax_amt1, value);
	}

	/**
	 * Tax inclusive amount 1 内消費税額１.<p>
	 *
	 */
	public void trd_cur_tax_amt1(int value) {
		setConstNumber(offset + 42, $trd_cur_tax_amt1, value);
	}

	/**
	 * Tax inclusive amount 1 内消費税額１.<p>
	 *
	 */
	public void trd_cur_tax_amt1(long value) {
		setConstNumber(offset + 42, $trd_cur_tax_amt1, value);
	}

	/**
	 * Tax inclusive amount 1 内消費税額１.<p>
	 *
	 */
	public void trd_cur_tax_amt1(float value) {
		setConstNumber(offset + 42, $trd_cur_tax_amt1, value);
	}

	/**
	 * Tax inclusive amount 1 内消費税額１.<p>
	 *
	 */
	public void trd_cur_tax_amt1(double value) {
		setConstNumber(offset + 42, $trd_cur_tax_amt1, value);
	}


	/**
	 * Amount 2 金額２.<p>
	 *
	 */
	public MCNumber trd_cur_amt2() {
		return getConstNumber(offset + 43, $trd_cur_amt2);
	}

	/**
	 * Amount 2 金額２.<p>
	 *
	 */
	public void trd_cur_amt2(MCNumber value) {
		setConstNumber(offset + 43, $trd_cur_amt2, value);
	}

	/**
	 * Amount 2 金額２.<p>
	 *
	 */
	public void trd_cur_amt2(int value) {
		setConstNumber(offset + 43, $trd_cur_amt2, value);
	}

	/**
	 * Amount 2 金額２.<p>
	 *
	 */
	public void trd_cur_amt2(long value) {
		setConstNumber(offset + 43, $trd_cur_amt2, value);
	}

	/**
	 * Amount 2 金額２.<p>
	 *
	 */
	public void trd_cur_amt2(float value) {
		setConstNumber(offset + 43, $trd_cur_amt2, value);
	}

	/**
	 * Amount 2 金額２.<p>
	 *
	 */
	public void trd_cur_amt2(double value) {
		setConstNumber(offset + 43, $trd_cur_amt2, value);
	}


	/**
	 * Tax inclusive amount 2 内消費税額２.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt2() {
		return getConstNumber(offset + 44, $trd_cur_tax_amt2);
	}

	/**
	 * Tax inclusive amount 2 内消費税額２.<p>
	 *
	 */
	public void trd_cur_tax_amt2(MCNumber value) {
		setConstNumber(offset + 44, $trd_cur_tax_amt2, value);
	}

	/**
	 * Tax inclusive amount 2 内消費税額２.<p>
	 *
	 */
	public void trd_cur_tax_amt2(int value) {
		setConstNumber(offset + 44, $trd_cur_tax_amt2, value);
	}

	/**
	 * Tax inclusive amount 2 内消費税額２.<p>
	 *
	 */
	public void trd_cur_tax_amt2(long value) {
		setConstNumber(offset + 44, $trd_cur_tax_amt2, value);
	}

	/**
	 * Tax inclusive amount 2 内消費税額２.<p>
	 *
	 */
	public void trd_cur_tax_amt2(float value) {
		setConstNumber(offset + 44, $trd_cur_tax_amt2, value);
	}

	/**
	 * Tax inclusive amount 2 内消費税額２.<p>
	 *
	 */
	public void trd_cur_tax_amt2(double value) {
		setConstNumber(offset + 44, $trd_cur_tax_amt2, value);
	}


	/**
	 * Amount 3 金額３.<p>
	 *
	 */
	public MCNumber trd_cur_amt3() {
		return getConstNumber(offset + 45, $trd_cur_amt3);
	}

	/**
	 * Amount 3 金額３.<p>
	 *
	 */
	public void trd_cur_amt3(MCNumber value) {
		setConstNumber(offset + 45, $trd_cur_amt3, value);
	}

	/**
	 * Amount 3 金額３.<p>
	 *
	 */
	public void trd_cur_amt3(int value) {
		setConstNumber(offset + 45, $trd_cur_amt3, value);
	}

	/**
	 * Amount 3 金額３.<p>
	 *
	 */
	public void trd_cur_amt3(long value) {
		setConstNumber(offset + 45, $trd_cur_amt3, value);
	}

	/**
	 * Amount 3 金額３.<p>
	 *
	 */
	public void trd_cur_amt3(float value) {
		setConstNumber(offset + 45, $trd_cur_amt3, value);
	}

	/**
	 * Amount 3 金額３.<p>
	 *
	 */
	public void trd_cur_amt3(double value) {
		setConstNumber(offset + 45, $trd_cur_amt3, value);
	}


	/**
	 * Tax inclusive amount 3 内消費税額３.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt3() {
		return getConstNumber(offset + 46, $trd_cur_tax_amt3);
	}

	/**
	 * Tax inclusive amount 3 内消費税額３.<p>
	 *
	 */
	public void trd_cur_tax_amt3(MCNumber value) {
		setConstNumber(offset + 46, $trd_cur_tax_amt3, value);
	}

	/**
	 * Tax inclusive amount 3 内消費税額３.<p>
	 *
	 */
	public void trd_cur_tax_amt3(int value) {
		setConstNumber(offset + 46, $trd_cur_tax_amt3, value);
	}

	/**
	 * Tax inclusive amount 3 内消費税額３.<p>
	 *
	 */
	public void trd_cur_tax_amt3(long value) {
		setConstNumber(offset + 46, $trd_cur_tax_amt3, value);
	}

	/**
	 * Tax inclusive amount 3 内消費税額３.<p>
	 *
	 */
	public void trd_cur_tax_amt3(float value) {
		setConstNumber(offset + 46, $trd_cur_tax_amt3, value);
	}

	/**
	 * Tax inclusive amount 3 内消費税額３.<p>
	 *
	 */
	public void trd_cur_tax_amt3(double value) {
		setConstNumber(offset + 46, $trd_cur_tax_amt3, value);
	}


	/**
	 * Base amount 1 基準金額１.<p>
	 *
	 */
	public MCNumber base_cur_amt1() {
		return getConstNumber(offset + 47, $base_cur_amt1);
	}

	/**
	 * Base amount 1 基準金額１.<p>
	 *
	 */
	public void base_cur_amt1(MCNumber value) {
		setConstNumber(offset + 47, $base_cur_amt1, value);
	}

	/**
	 * Base amount 1 基準金額１.<p>
	 *
	 */
	public void base_cur_amt1(int value) {
		setConstNumber(offset + 47, $base_cur_amt1, value);
	}

	/**
	 * Base amount 1 基準金額１.<p>
	 *
	 */
	public void base_cur_amt1(long value) {
		setConstNumber(offset + 47, $base_cur_amt1, value);
	}

	/**
	 * Base amount 1 基準金額１.<p>
	 *
	 */
	public void base_cur_amt1(float value) {
		setConstNumber(offset + 47, $base_cur_amt1, value);
	}

	/**
	 * Base amount 1 基準金額１.<p>
	 *
	 */
	public void base_cur_amt1(double value) {
		setConstNumber(offset + 47, $base_cur_amt1, value);
	}


	/**
	 * Base tax amount 1 基準内消費税額１.<p>
	 *
	 */
	public MCNumber base_cur_tax_amt1() {
		return getConstNumber(offset + 48, $base_cur_tax_amt1);
	}

	/**
	 * Base tax amount 1 基準内消費税額１.<p>
	 *
	 */
	public void base_cur_tax_amt1(MCNumber value) {
		setConstNumber(offset + 48, $base_cur_tax_amt1, value);
	}

	/**
	 * Base tax amount 1 基準内消費税額１.<p>
	 *
	 */
	public void base_cur_tax_amt1(int value) {
		setConstNumber(offset + 48, $base_cur_tax_amt1, value);
	}

	/**
	 * Base tax amount 1 基準内消費税額１.<p>
	 *
	 */
	public void base_cur_tax_amt1(long value) {
		setConstNumber(offset + 48, $base_cur_tax_amt1, value);
	}

	/**
	 * Base tax amount 1 基準内消費税額１.<p>
	 *
	 */
	public void base_cur_tax_amt1(float value) {
		setConstNumber(offset + 48, $base_cur_tax_amt1, value);
	}

	/**
	 * Base tax amount 1 基準内消費税額１.<p>
	 *
	 */
	public void base_cur_tax_amt1(double value) {
		setConstNumber(offset + 48, $base_cur_tax_amt1, value);
	}


	/**
	 * Base amount 2 基準金額２.<p>
	 *
	 */
	public MCNumber base_cur_amt2() {
		return getConstNumber(offset + 49, $base_cur_amt2);
	}

	/**
	 * Base amount 2 基準金額２.<p>
	 *
	 */
	public void base_cur_amt2(MCNumber value) {
		setConstNumber(offset + 49, $base_cur_amt2, value);
	}

	/**
	 * Base amount 2 基準金額２.<p>
	 *
	 */
	public void base_cur_amt2(int value) {
		setConstNumber(offset + 49, $base_cur_amt2, value);
	}

	/**
	 * Base amount 2 基準金額２.<p>
	 *
	 */
	public void base_cur_amt2(long value) {
		setConstNumber(offset + 49, $base_cur_amt2, value);
	}

	/**
	 * Base amount 2 基準金額２.<p>
	 *
	 */
	public void base_cur_amt2(float value) {
		setConstNumber(offset + 49, $base_cur_amt2, value);
	}

	/**
	 * Base amount 2 基準金額２.<p>
	 *
	 */
	public void base_cur_amt2(double value) {
		setConstNumber(offset + 49, $base_cur_amt2, value);
	}


	/**
	 * Base tax amount 2 基準内消費税額２.<p>
	 *
	 */
	public MCNumber base_cur_tax_amt2() {
		return getConstNumber(offset + 50, $base_cur_tax_amt2);
	}

	/**
	 * Base tax amount 2 基準内消費税額２.<p>
	 *
	 */
	public void base_cur_tax_amt2(MCNumber value) {
		setConstNumber(offset + 50, $base_cur_tax_amt2, value);
	}

	/**
	 * Base tax amount 2 基準内消費税額２.<p>
	 *
	 */
	public void base_cur_tax_amt2(int value) {
		setConstNumber(offset + 50, $base_cur_tax_amt2, value);
	}

	/**
	 * Base tax amount 2 基準内消費税額２.<p>
	 *
	 */
	public void base_cur_tax_amt2(long value) {
		setConstNumber(offset + 50, $base_cur_tax_amt2, value);
	}

	/**
	 * Base tax amount 2 基準内消費税額２.<p>
	 *
	 */
	public void base_cur_tax_amt2(float value) {
		setConstNumber(offset + 50, $base_cur_tax_amt2, value);
	}

	/**
	 * Base tax amount 2 基準内消費税額２.<p>
	 *
	 */
	public void base_cur_tax_amt2(double value) {
		setConstNumber(offset + 50, $base_cur_tax_amt2, value);
	}


	/**
	 * Base amount 3 基準金額３.<p>
	 *
	 */
	public MCNumber base_cur_amt3() {
		return getConstNumber(offset + 51, $base_cur_amt3);
	}

	/**
	 * Base amount 3 基準金額３.<p>
	 *
	 */
	public void base_cur_amt3(MCNumber value) {
		setConstNumber(offset + 51, $base_cur_amt3, value);
	}

	/**
	 * Base amount 3 基準金額３.<p>
	 *
	 */
	public void base_cur_amt3(int value) {
		setConstNumber(offset + 51, $base_cur_amt3, value);
	}

	/**
	 * Base amount 3 基準金額３.<p>
	 *
	 */
	public void base_cur_amt3(long value) {
		setConstNumber(offset + 51, $base_cur_amt3, value);
	}

	/**
	 * Base amount 3 基準金額３.<p>
	 *
	 */
	public void base_cur_amt3(float value) {
		setConstNumber(offset + 51, $base_cur_amt3, value);
	}

	/**
	 * Base amount 3 基準金額３.<p>
	 *
	 */
	public void base_cur_amt3(double value) {
		setConstNumber(offset + 51, $base_cur_amt3, value);
	}


	/**
	 * Base tax amount 3 基準内消費税額３.<p>
	 *
	 */
	public MCNumber base_cur_tax_amt3() {
		return getConstNumber(offset + 52, $base_cur_tax_amt3);
	}

	/**
	 * Base tax amount 3 基準内消費税額３.<p>
	 *
	 */
	public void base_cur_tax_amt3(MCNumber value) {
		setConstNumber(offset + 52, $base_cur_tax_amt3, value);
	}

	/**
	 * Base tax amount 3 基準内消費税額３.<p>
	 *
	 */
	public void base_cur_tax_amt3(int value) {
		setConstNumber(offset + 52, $base_cur_tax_amt3, value);
	}

	/**
	 * Base tax amount 3 基準内消費税額３.<p>
	 *
	 */
	public void base_cur_tax_amt3(long value) {
		setConstNumber(offset + 52, $base_cur_tax_amt3, value);
	}

	/**
	 * Base tax amount 3 基準内消費税額３.<p>
	 *
	 */
	public void base_cur_tax_amt3(float value) {
		setConstNumber(offset + 52, $base_cur_tax_amt3, value);
	}

	/**
	 * Base tax amount 3 基準内消費税額３.<p>
	 *
	 */
	public void base_cur_tax_amt3(double value) {
		setConstNumber(offset + 52, $base_cur_tax_amt3, value);
	}


	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public MCNumber dtl_exc_gain_loss() {
		return getConstNumber(offset + 53, $dtl_exc_gain_loss);
	}

	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public void dtl_exc_gain_loss(MCNumber value) {
		setConstNumber(offset + 53, $dtl_exc_gain_loss, value);
	}

	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public void dtl_exc_gain_loss(int value) {
		setConstNumber(offset + 53, $dtl_exc_gain_loss, value);
	}

	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public void dtl_exc_gain_loss(long value) {
		setConstNumber(offset + 53, $dtl_exc_gain_loss, value);
	}

	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public void dtl_exc_gain_loss(float value) {
		setConstNumber(offset + 53, $dtl_exc_gain_loss, value);
	}

	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public void dtl_exc_gain_loss(double value) {
		setConstNumber(offset + 53, $dtl_exc_gain_loss, value);
	}


	public String getString(String name) {
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			return rcv_act_no();
		}
		if ($rcv_act_d_no.equalsIgnoreCase(name)) {
			return rcv_act_d_no();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($rcv_no.equalsIgnoreCase(name)) {
			return rcv_no();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			return rcst_cd();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			return xrate_cd();
		}
		if ($trd_ac_rsn_cd.equalsIgnoreCase(name)) {
			return trd_ac_rsn_cd();
		}
		if ($ar_sttl_ac_rsn_cd1.equalsIgnoreCase(name)) {
			return ar_sttl_ac_rsn_cd1();
		}
		if ($tax_cd1.equalsIgnoreCase(name)) {
			return tax_cd1();
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			return bank_ac_cd();
		}
		if ($xfr_psn.equalsIgnoreCase(name)) {
			return xfr_psn();
		}
		if ($note_no.equalsIgnoreCase(name)) {
			return note_no();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($debt_cred_id_typ.equalsIgnoreCase(name)) {
			return debt_cred_id_typ();
		}
		if ($debt_cred_id_cd.equalsIgnoreCase(name)) {
			return debt_cred_id_cd();
		}
		if ($debt_cred_nm.equalsIgnoreCase(name)) {
			return debt_cred_nm();
		}
		if ($ar_sttl_cd2.equalsIgnoreCase(name)) {
			return ar_sttl_cd2();
		}
		if ($ar_sttl_ac_rsn_cd2.equalsIgnoreCase(name)) {
			return ar_sttl_ac_rsn_cd2();
		}
		if ($ar_sttl_ac_rsn_cd3.equalsIgnoreCase(name)) {
			return ar_sttl_ac_rsn_cd3();
		}
		if ($tax_cd2.equalsIgnoreCase(name)) {
			return tax_cd2();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			return slip_sts_typ();
		}
		if ($par_rcv_act_no.equalsIgnoreCase(name)) {
			return par_rcv_act_no();
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			return ar_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			return rcv_act_seq();
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			return rcv_act_rev();
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			return rcv_act_d_seq();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($par_rcv_act_seq.equalsIgnoreCase(name)) {
			return par_rcv_act_seq();
		}
		if ($trd_cur_amt1.equalsIgnoreCase(name)) {
			return trd_cur_amt1();
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt1();
		}
		if ($trd_cur_amt2.equalsIgnoreCase(name)) {
			return trd_cur_amt2();
		}
		if ($trd_cur_tax_amt2.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt2();
		}
		if ($trd_cur_amt3.equalsIgnoreCase(name)) {
			return trd_cur_amt3();
		}
		if ($trd_cur_tax_amt3.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt3();
		}
		if ($base_cur_amt1.equalsIgnoreCase(name)) {
			return base_cur_amt1();
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			return base_cur_tax_amt1();
		}
		if ($base_cur_amt2.equalsIgnoreCase(name)) {
			return base_cur_amt2();
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			return base_cur_tax_amt2();
		}
		if ($base_cur_amt3.equalsIgnoreCase(name)) {
			return base_cur_amt3();
		}
		if ($base_cur_tax_amt3.equalsIgnoreCase(name)) {
			return base_cur_tax_amt3();
		}
		if ($dtl_exc_gain_loss.equalsIgnoreCase(name)) {
			return dtl_exc_gain_loss();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			return rcv_act_no();
		}
		if ($rcv_act_d_no.equalsIgnoreCase(name)) {
			return rcv_act_d_no();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($rcv_no.equalsIgnoreCase(name)) {
			return rcv_no();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			return rcst_cd();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			return xrate_cd();
		}
		if ($trd_ac_rsn_cd.equalsIgnoreCase(name)) {
			return trd_ac_rsn_cd();
		}
		if ($ar_sttl_ac_rsn_cd1.equalsIgnoreCase(name)) {
			return ar_sttl_ac_rsn_cd1();
		}
		if ($tax_cd1.equalsIgnoreCase(name)) {
			return tax_cd1();
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			return bank_ac_cd();
		}
		if ($xfr_psn.equalsIgnoreCase(name)) {
			return xfr_psn();
		}
		if ($note_no.equalsIgnoreCase(name)) {
			return note_no();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($debt_cred_id_typ.equalsIgnoreCase(name)) {
			return debt_cred_id_typ();
		}
		if ($debt_cred_id_cd.equalsIgnoreCase(name)) {
			return debt_cred_id_cd();
		}
		if ($debt_cred_nm.equalsIgnoreCase(name)) {
			return debt_cred_nm();
		}
		if ($ar_sttl_cd2.equalsIgnoreCase(name)) {
			return ar_sttl_cd2();
		}
		if ($ar_sttl_ac_rsn_cd2.equalsIgnoreCase(name)) {
			return ar_sttl_ac_rsn_cd2();
		}
		if ($ar_sttl_ac_rsn_cd3.equalsIgnoreCase(name)) {
			return ar_sttl_ac_rsn_cd3();
		}
		if ($tax_cd2.equalsIgnoreCase(name)) {
			return tax_cd2();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			return slip_sts_typ();
		}
		if ($par_rcv_act_no.equalsIgnoreCase(name)) {
			return par_rcv_act_no();
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			return ar_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			return rcv_act_seq();
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			return rcv_act_rev();
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			return rcv_act_d_seq();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($par_rcv_act_seq.equalsIgnoreCase(name)) {
			return par_rcv_act_seq();
		}
		if ($trd_cur_amt1.equalsIgnoreCase(name)) {
			return trd_cur_amt1();
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt1();
		}
		if ($trd_cur_amt2.equalsIgnoreCase(name)) {
			return trd_cur_amt2();
		}
		if ($trd_cur_tax_amt2.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt2();
		}
		if ($trd_cur_amt3.equalsIgnoreCase(name)) {
			return trd_cur_amt3();
		}
		if ($trd_cur_tax_amt3.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt3();
		}
		if ($base_cur_amt1.equalsIgnoreCase(name)) {
			return base_cur_amt1();
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			return base_cur_tax_amt1();
		}
		if ($base_cur_amt2.equalsIgnoreCase(name)) {
			return base_cur_amt2();
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			return base_cur_tax_amt2();
		}
		if ($base_cur_amt3.equalsIgnoreCase(name)) {
			return base_cur_amt3();
		}
		if ($base_cur_tax_amt3.equalsIgnoreCase(name)) {
			return base_cur_tax_amt3();
		}
		if ($dtl_exc_gain_loss.equalsIgnoreCase(name)) {
			return dtl_exc_gain_loss();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			rcv_act_no(value);
			return;
		}
		if ($rcv_act_d_no.equalsIgnoreCase(name)) {
			rcv_act_d_no(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($rcv_no.equalsIgnoreCase(name)) {
			rcv_no(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			rcst_cd(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
			return;
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			xrate_cd(value);
			return;
		}
		if ($trd_ac_rsn_cd.equalsIgnoreCase(name)) {
			trd_ac_rsn_cd(value);
			return;
		}
		if ($ar_sttl_ac_rsn_cd1.equalsIgnoreCase(name)) {
			ar_sttl_ac_rsn_cd1(value);
			return;
		}
		if ($tax_cd1.equalsIgnoreCase(name)) {
			tax_cd1(value);
			return;
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			bank_ac_cd(value);
			return;
		}
		if ($xfr_psn.equalsIgnoreCase(name)) {
			xfr_psn(value);
			return;
		}
		if ($note_no.equalsIgnoreCase(name)) {
			note_no(value);
			return;
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			bd_dpt_cd(value);
			return;
		}
		if ($debt_cred_id_typ.equalsIgnoreCase(name)) {
			debt_cred_id_typ(value);
			return;
		}
		if ($debt_cred_id_cd.equalsIgnoreCase(name)) {
			debt_cred_id_cd(value);
			return;
		}
		if ($debt_cred_nm.equalsIgnoreCase(name)) {
			debt_cred_nm(value);
			return;
		}
		if ($ar_sttl_cd2.equalsIgnoreCase(name)) {
			ar_sttl_cd2(value);
			return;
		}
		if ($ar_sttl_ac_rsn_cd2.equalsIgnoreCase(name)) {
			ar_sttl_ac_rsn_cd2(value);
			return;
		}
		if ($ar_sttl_ac_rsn_cd3.equalsIgnoreCase(name)) {
			ar_sttl_ac_rsn_cd3(value);
			return;
		}
		if ($tax_cd2.equalsIgnoreCase(name)) {
			tax_cd2(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			slip_sts_typ(value);
			return;
		}
		if ($par_rcv_act_no.equalsIgnoreCase(name)) {
			par_rcv_act_no(value);
			return;
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			ar_dpt_cd(value);
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
		if ($ar_typ.equalsIgnoreCase(name)) {
			ar_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($par_rcv_act_seq.equalsIgnoreCase(name)) {
			par_rcv_act_seq(value);
			return;
		}
		if ($trd_cur_amt1.equalsIgnoreCase(name)) {
			trd_cur_amt1(value);
			return;
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			trd_cur_tax_amt1(value);
			return;
		}
		if ($trd_cur_amt2.equalsIgnoreCase(name)) {
			trd_cur_amt2(value);
			return;
		}
		if ($trd_cur_tax_amt2.equalsIgnoreCase(name)) {
			trd_cur_tax_amt2(value);
			return;
		}
		if ($trd_cur_amt3.equalsIgnoreCase(name)) {
			trd_cur_amt3(value);
			return;
		}
		if ($trd_cur_tax_amt3.equalsIgnoreCase(name)) {
			trd_cur_tax_amt3(value);
			return;
		}
		if ($base_cur_amt1.equalsIgnoreCase(name)) {
			base_cur_amt1(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_amt2.equalsIgnoreCase(name)) {
			base_cur_amt2(value);
			return;
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			base_cur_tax_amt2(value);
			return;
		}
		if ($base_cur_amt3.equalsIgnoreCase(name)) {
			base_cur_amt3(value);
			return;
		}
		if ($base_cur_tax_amt3.equalsIgnoreCase(name)) {
			base_cur_tax_amt3(value);
			return;
		}
		if ($dtl_exc_gain_loss.equalsIgnoreCase(name)) {
			dtl_exc_gain_loss(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($par_rcv_act_seq.equalsIgnoreCase(name)) {
			par_rcv_act_seq(value);
			return;
		}
		if ($trd_cur_amt1.equalsIgnoreCase(name)) {
			trd_cur_amt1(value);
			return;
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			trd_cur_tax_amt1(value);
			return;
		}
		if ($trd_cur_amt2.equalsIgnoreCase(name)) {
			trd_cur_amt2(value);
			return;
		}
		if ($trd_cur_tax_amt2.equalsIgnoreCase(name)) {
			trd_cur_tax_amt2(value);
			return;
		}
		if ($trd_cur_amt3.equalsIgnoreCase(name)) {
			trd_cur_amt3(value);
			return;
		}
		if ($trd_cur_tax_amt3.equalsIgnoreCase(name)) {
			trd_cur_tax_amt3(value);
			return;
		}
		if ($base_cur_amt1.equalsIgnoreCase(name)) {
			base_cur_amt1(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_amt2.equalsIgnoreCase(name)) {
			base_cur_amt2(value);
			return;
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			base_cur_tax_amt2(value);
			return;
		}
		if ($base_cur_amt3.equalsIgnoreCase(name)) {
			base_cur_amt3(value);
			return;
		}
		if ($base_cur_tax_amt3.equalsIgnoreCase(name)) {
			base_cur_tax_amt3(value);
			return;
		}
		if ($dtl_exc_gain_loss.equalsIgnoreCase(name)) {
			dtl_exc_gain_loss(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($par_rcv_act_seq.equalsIgnoreCase(name)) {
			par_rcv_act_seq(value);
			return;
		}
		if ($trd_cur_amt1.equalsIgnoreCase(name)) {
			trd_cur_amt1(value);
			return;
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			trd_cur_tax_amt1(value);
			return;
		}
		if ($trd_cur_amt2.equalsIgnoreCase(name)) {
			trd_cur_amt2(value);
			return;
		}
		if ($trd_cur_tax_amt2.equalsIgnoreCase(name)) {
			trd_cur_tax_amt2(value);
			return;
		}
		if ($trd_cur_amt3.equalsIgnoreCase(name)) {
			trd_cur_amt3(value);
			return;
		}
		if ($trd_cur_tax_amt3.equalsIgnoreCase(name)) {
			trd_cur_tax_amt3(value);
			return;
		}
		if ($base_cur_amt1.equalsIgnoreCase(name)) {
			base_cur_amt1(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_amt2.equalsIgnoreCase(name)) {
			base_cur_amt2(value);
			return;
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			base_cur_tax_amt2(value);
			return;
		}
		if ($base_cur_amt3.equalsIgnoreCase(name)) {
			base_cur_amt3(value);
			return;
		}
		if ($base_cur_tax_amt3.equalsIgnoreCase(name)) {
			base_cur_tax_amt3(value);
			return;
		}
		if ($dtl_exc_gain_loss.equalsIgnoreCase(name)) {
			dtl_exc_gain_loss(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($par_rcv_act_seq.equalsIgnoreCase(name)) {
			par_rcv_act_seq(value);
			return;
		}
		if ($trd_cur_amt1.equalsIgnoreCase(name)) {
			trd_cur_amt1(value);
			return;
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			trd_cur_tax_amt1(value);
			return;
		}
		if ($trd_cur_amt2.equalsIgnoreCase(name)) {
			trd_cur_amt2(value);
			return;
		}
		if ($trd_cur_tax_amt2.equalsIgnoreCase(name)) {
			trd_cur_tax_amt2(value);
			return;
		}
		if ($trd_cur_amt3.equalsIgnoreCase(name)) {
			trd_cur_amt3(value);
			return;
		}
		if ($trd_cur_tax_amt3.equalsIgnoreCase(name)) {
			trd_cur_tax_amt3(value);
			return;
		}
		if ($base_cur_amt1.equalsIgnoreCase(name)) {
			base_cur_amt1(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_amt2.equalsIgnoreCase(name)) {
			base_cur_amt2(value);
			return;
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			base_cur_tax_amt2(value);
			return;
		}
		if ($base_cur_amt3.equalsIgnoreCase(name)) {
			base_cur_amt3(value);
			return;
		}
		if ($base_cur_tax_amt3.equalsIgnoreCase(name)) {
			base_cur_tax_amt3(value);
			return;
		}
		if ($dtl_exc_gain_loss.equalsIgnoreCase(name)) {
			dtl_exc_gain_loss(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($par_rcv_act_seq.equalsIgnoreCase(name)) {
			par_rcv_act_seq(value);
			return;
		}
		if ($trd_cur_amt1.equalsIgnoreCase(name)) {
			trd_cur_amt1(value);
			return;
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			trd_cur_tax_amt1(value);
			return;
		}
		if ($trd_cur_amt2.equalsIgnoreCase(name)) {
			trd_cur_amt2(value);
			return;
		}
		if ($trd_cur_tax_amt2.equalsIgnoreCase(name)) {
			trd_cur_tax_amt2(value);
			return;
		}
		if ($trd_cur_amt3.equalsIgnoreCase(name)) {
			trd_cur_amt3(value);
			return;
		}
		if ($trd_cur_tax_amt3.equalsIgnoreCase(name)) {
			trd_cur_tax_amt3(value);
			return;
		}
		if ($base_cur_amt1.equalsIgnoreCase(name)) {
			base_cur_amt1(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_amt2.equalsIgnoreCase(name)) {
			base_cur_amt2(value);
			return;
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			base_cur_tax_amt2(value);
			return;
		}
		if ($base_cur_amt3.equalsIgnoreCase(name)) {
			base_cur_amt3(value);
			return;
		}
		if ($base_cur_tax_amt3.equalsIgnoreCase(name)) {
			base_cur_tax_amt3(value);
			return;
		}
		if ($dtl_exc_gain_loss.equalsIgnoreCase(name)) {
			dtl_exc_gain_loss(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			rcv_act_no(value);
			return;
		}
		if ($rcv_act_d_no.equalsIgnoreCase(name)) {
			rcv_act_d_no(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($rcv_no.equalsIgnoreCase(name)) {
			rcv_no(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			rcst_cd(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
			return;
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			xrate_cd(value);
			return;
		}
		if ($trd_ac_rsn_cd.equalsIgnoreCase(name)) {
			trd_ac_rsn_cd(value);
			return;
		}
		if ($ar_sttl_ac_rsn_cd1.equalsIgnoreCase(name)) {
			ar_sttl_ac_rsn_cd1(value);
			return;
		}
		if ($tax_cd1.equalsIgnoreCase(name)) {
			tax_cd1(value);
			return;
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			bank_ac_cd(value);
			return;
		}
		if ($xfr_psn.equalsIgnoreCase(name)) {
			xfr_psn(value);
			return;
		}
		if ($note_no.equalsIgnoreCase(name)) {
			note_no(value);
			return;
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			bd_dpt_cd(value);
			return;
		}
		if ($debt_cred_id_typ.equalsIgnoreCase(name)) {
			debt_cred_id_typ(value);
			return;
		}
		if ($debt_cred_id_cd.equalsIgnoreCase(name)) {
			debt_cred_id_cd(value);
			return;
		}
		if ($debt_cred_nm.equalsIgnoreCase(name)) {
			debt_cred_nm(value);
			return;
		}
		if ($ar_sttl_cd2.equalsIgnoreCase(name)) {
			ar_sttl_cd2(value);
			return;
		}
		if ($ar_sttl_ac_rsn_cd2.equalsIgnoreCase(name)) {
			ar_sttl_ac_rsn_cd2(value);
			return;
		}
		if ($ar_sttl_ac_rsn_cd3.equalsIgnoreCase(name)) {
			ar_sttl_ac_rsn_cd3(value);
			return;
		}
		if ($tax_cd2.equalsIgnoreCase(name)) {
			tax_cd2(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			slip_sts_typ(value);
			return;
		}
		if ($par_rcv_act_no.equalsIgnoreCase(name)) {
			par_rcv_act_no(value);
			return;
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			ar_dpt_cd(value);
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
		if ($ar_typ.equalsIgnoreCase(name)) {
			ar_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($par_rcv_act_seq.equalsIgnoreCase(name)) {
			par_rcv_act_seq(value);
			return;
		}
		if ($trd_cur_amt1.equalsIgnoreCase(name)) {
			trd_cur_amt1(value);
			return;
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			trd_cur_tax_amt1(value);
			return;
		}
		if ($trd_cur_amt2.equalsIgnoreCase(name)) {
			trd_cur_amt2(value);
			return;
		}
		if ($trd_cur_tax_amt2.equalsIgnoreCase(name)) {
			trd_cur_tax_amt2(value);
			return;
		}
		if ($trd_cur_amt3.equalsIgnoreCase(name)) {
			trd_cur_amt3(value);
			return;
		}
		if ($trd_cur_tax_amt3.equalsIgnoreCase(name)) {
			trd_cur_tax_amt3(value);
			return;
		}
		if ($base_cur_amt1.equalsIgnoreCase(name)) {
			base_cur_amt1(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_amt2.equalsIgnoreCase(name)) {
			base_cur_amt2(value);
			return;
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			base_cur_tax_amt2(value);
			return;
		}
		if ($base_cur_amt3.equalsIgnoreCase(name)) {
			base_cur_amt3(value);
			return;
		}
		if ($base_cur_tax_amt3.equalsIgnoreCase(name)) {
			base_cur_tax_amt3(value);
			return;
		}
		if ($dtl_exc_gain_loss.equalsIgnoreCase(name)) {
			dtl_exc_gain_loss(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($par_rcv_act_seq.equalsIgnoreCase(name)) {
			par_rcv_act_seq(value);
			return;
		}
		if ($trd_cur_amt1.equalsIgnoreCase(name)) {
			trd_cur_amt1(value);
			return;
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			trd_cur_tax_amt1(value);
			return;
		}
		if ($trd_cur_amt2.equalsIgnoreCase(name)) {
			trd_cur_amt2(value);
			return;
		}
		if ($trd_cur_tax_amt2.equalsIgnoreCase(name)) {
			trd_cur_tax_amt2(value);
			return;
		}
		if ($trd_cur_amt3.equalsIgnoreCase(name)) {
			trd_cur_amt3(value);
			return;
		}
		if ($trd_cur_tax_amt3.equalsIgnoreCase(name)) {
			trd_cur_tax_amt3(value);
			return;
		}
		if ($base_cur_amt1.equalsIgnoreCase(name)) {
			base_cur_amt1(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_amt2.equalsIgnoreCase(name)) {
			base_cur_amt2(value);
			return;
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			base_cur_tax_amt2(value);
			return;
		}
		if ($base_cur_amt3.equalsIgnoreCase(name)) {
			base_cur_amt3(value);
			return;
		}
		if ($base_cur_tax_amt3.equalsIgnoreCase(name)) {
			base_cur_tax_amt3(value);
			return;
		}
		if ($dtl_exc_gain_loss.equalsIgnoreCase(name)) {
			dtl_exc_gain_loss(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($par_rcv_act_seq.equalsIgnoreCase(name)) {
			par_rcv_act_seq(value);
			return;
		}
		if ($trd_cur_amt1.equalsIgnoreCase(name)) {
			trd_cur_amt1(value);
			return;
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			trd_cur_tax_amt1(value);
			return;
		}
		if ($trd_cur_amt2.equalsIgnoreCase(name)) {
			trd_cur_amt2(value);
			return;
		}
		if ($trd_cur_tax_amt2.equalsIgnoreCase(name)) {
			trd_cur_tax_amt2(value);
			return;
		}
		if ($trd_cur_amt3.equalsIgnoreCase(name)) {
			trd_cur_amt3(value);
			return;
		}
		if ($trd_cur_tax_amt3.equalsIgnoreCase(name)) {
			trd_cur_tax_amt3(value);
			return;
		}
		if ($base_cur_amt1.equalsIgnoreCase(name)) {
			base_cur_amt1(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_amt2.equalsIgnoreCase(name)) {
			base_cur_amt2(value);
			return;
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			base_cur_tax_amt2(value);
			return;
		}
		if ($base_cur_amt3.equalsIgnoreCase(name)) {
			base_cur_amt3(value);
			return;
		}
		if ($base_cur_tax_amt3.equalsIgnoreCase(name)) {
			base_cur_tax_amt3(value);
			return;
		}
		if ($dtl_exc_gain_loss.equalsIgnoreCase(name)) {
			dtl_exc_gain_loss(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($par_rcv_act_seq.equalsIgnoreCase(name)) {
			par_rcv_act_seq(value);
			return;
		}
		if ($trd_cur_amt1.equalsIgnoreCase(name)) {
			trd_cur_amt1(value);
			return;
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			trd_cur_tax_amt1(value);
			return;
		}
		if ($trd_cur_amt2.equalsIgnoreCase(name)) {
			trd_cur_amt2(value);
			return;
		}
		if ($trd_cur_tax_amt2.equalsIgnoreCase(name)) {
			trd_cur_tax_amt2(value);
			return;
		}
		if ($trd_cur_amt3.equalsIgnoreCase(name)) {
			trd_cur_amt3(value);
			return;
		}
		if ($trd_cur_tax_amt3.equalsIgnoreCase(name)) {
			trd_cur_tax_amt3(value);
			return;
		}
		if ($base_cur_amt1.equalsIgnoreCase(name)) {
			base_cur_amt1(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_amt2.equalsIgnoreCase(name)) {
			base_cur_amt2(value);
			return;
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			base_cur_tax_amt2(value);
			return;
		}
		if ($base_cur_amt3.equalsIgnoreCase(name)) {
			base_cur_amt3(value);
			return;
		}
		if ($base_cur_tax_amt3.equalsIgnoreCase(name)) {
			base_cur_tax_amt3(value);
			return;
		}
		if ($dtl_exc_gain_loss.equalsIgnoreCase(name)) {
			dtl_exc_gain_loss(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($par_rcv_act_seq.equalsIgnoreCase(name)) {
			par_rcv_act_seq(value);
			return;
		}
		if ($trd_cur_amt1.equalsIgnoreCase(name)) {
			trd_cur_amt1(value);
			return;
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			trd_cur_tax_amt1(value);
			return;
		}
		if ($trd_cur_amt2.equalsIgnoreCase(name)) {
			trd_cur_amt2(value);
			return;
		}
		if ($trd_cur_tax_amt2.equalsIgnoreCase(name)) {
			trd_cur_tax_amt2(value);
			return;
		}
		if ($trd_cur_amt3.equalsIgnoreCase(name)) {
			trd_cur_amt3(value);
			return;
		}
		if ($trd_cur_tax_amt3.equalsIgnoreCase(name)) {
			trd_cur_tax_amt3(value);
			return;
		}
		if ($base_cur_amt1.equalsIgnoreCase(name)) {
			base_cur_amt1(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_amt2.equalsIgnoreCase(name)) {
			base_cur_amt2(value);
			return;
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			base_cur_tax_amt2(value);
			return;
		}
		if ($base_cur_amt3.equalsIgnoreCase(name)) {
			base_cur_amt3(value);
			return;
		}
		if ($base_cur_tax_amt3.equalsIgnoreCase(name)) {
			base_cur_tax_amt3(value);
			return;
		}
		if ($dtl_exc_gain_loss.equalsIgnoreCase(name)) {
			dtl_exc_gain_loss(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

