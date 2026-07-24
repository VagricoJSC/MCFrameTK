package mcframe.serverMSBG.MSBGL5020;

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
 * ブロック"RcvActD_Info"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RcvActD_InfoR_MC_A extends MCConstRow {

	/**
	 * Group sequence No. グループシーケンスＮＯ.<p>
	 *
	 */
	public static final String $grp_seq = "grp_seq";
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
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public static final String $acst_cd = "acst_cd";
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
	/**
	 * Billing invoice No. 請求インボイスＮＯ.<p>
	 *
	 */
	public static final String $bill_iv_no = "bill_iv_no";
	/**
	 * Payment received result pegging No. 入金実績紐付けＮＯ.<p>
	 *
	 */
	public static final String $rcv_act_peg = "rcv_act_peg";
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
	 * Payment received amount 入金額.<p>
	 *
	 */
	public static final String $amt1 = "amt1";
	/**
	 * Base payment received amount 基準入金額.<p>
	 *
	 */
	public static final String $base_cur_amt1 = "base_cur_amt1";
	/**
	 * Transfer fee 振込手数料.<p>
	 *
	 */
	public static final String $amt2 = "amt2";
	/**
	 * Base transfer fee 基準振込手数料.<p>
	 *
	 */
	public static final String $base_cur_amt2 = "base_cur_amt2";
	/**
	 * Amount 3 金額３.<p>
	 *
	 */
	public static final String $amt3 = "amt3";
	/**
	 * Base amount 3 基準金額３.<p>
	 *
	 */
	public static final String $base_cur_amt3 = "base_cur_amt3";
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
	 * Billing management No. for payment received 入金対象請求管理ＮＯ.<p>
	 *
	 */
	public static final String $tgt_rcv_bill_mng_no = "tgt_rcv_bill_mng_no";
	/**
	 * Tax amount 1 税額１.<p>
	 *
	 */
	public static final String $tax_amt1 = "tax_amt1";
	/**
	 * Tax amount 2 税額２.<p>
	 *
	 */
	public static final String $tax_amt2 = "tax_amt2";
	/**
	 * Tax amount 3 税額３.<p>
	 *
	 */
	public static final String $tax_amt3 = "tax_amt3";
	/**
	 * Tax amount 1 (Base currency) 基準通貨税額１.<p>
	 *
	 */
	public static final String $base_cur_tax_amt1 = "base_cur_tax_amt1";
	/**
	 * Tax amount 2 (Base currency) 基準通貨税額２.<p>
	 *
	 */
	public static final String $base_cur_tax_amt2 = "base_cur_tax_amt2";
	/**
	 * Tax amount 3 (Base currency) 基準通貨税額３.<p>
	 *
	 */
	public static final String $base_cur_tax_amt3 = "base_cur_tax_amt3";
	/**
	 * Exchange rate at trading 取引時為替レート.<p>
	 *
	 */
	public static final String $trd_xrate = "trd_xrate";
	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public static final String $exc_gain_loss = "exc_gain_loss";
	/**
	 * Cash 現金.<p>
	 *
	 */
	public static final String $cash = "cash";
	/**
	 * Notes 手形.<p>
	 *
	 */
	public static final String $note = "note";
	/**
	 * Payment 振込.<p>
	 *
	 */
	public static final String $xfr = "xfr";
	/**
	 * Offset 相殺.<p>
	 *
	 */
	public static final String $setoff = "setoff";
	/**
	 * Transfer 振替.<p>
	 *
	 */
	public static final String $sw = "sw";
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
	 * Payment received result details No. 入金実績明細ＮＯ.<p>
	 *
	 */
	public static final String $rcv_act_d_no = "rcv_act_d_no";
	/**
	 * Payment received result details sequence number 入金実績明細連番.<p>
	 *
	 */
	public static final String $rcv_act_d_seq = "rcv_act_d_seq";


	public static final MCMeta grp_seq_META = createCommonMeta($grp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta bcst_cd_META = createCommonMeta($bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bill_dpt_cd_META = createCommonMeta($bill_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta acst_cd_META = createCommonMeta($acst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta bill_iv_no_META = createCommonMeta($bill_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta rcv_act_peg_META = createCommonMeta($rcv_act_peg, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta ar_typ_META = createCommonMeta($ar_typ, mcframe.commonMA.meta.MA_META.AR_TYP);
	public static final MCMeta ar_sttl_cd1_META = createCommonMeta($ar_sttl_cd1, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta ar_sttl_typ1_META = createCommonMeta($ar_sttl_typ1, mcframe.commonMA.meta.MA_META.AR_STTL_TYP);
	public static final MCMeta amt1_META = createCommonMeta($amt1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_amt1_META = createCommonMeta($base_cur_amt1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta amt2_META = createCommonMeta($amt2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_amt2_META = createCommonMeta($base_cur_amt2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta amt3_META = createCommonMeta($amt3, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_amt3_META = createCommonMeta($base_cur_amt3, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ar_dpt_cd_META = createCommonMeta($ar_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta tgt_rcv_bill_mng_no_META = createCommonMeta($tgt_rcv_bill_mng_no, mcframe.commonMA.meta.MA_META.BILL_MNG_NO);
	public static final MCMeta tax_amt1_META = createCommonMeta($tax_amt1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_amt2_META = createCommonMeta($tax_amt2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_amt3_META = createCommonMeta($tax_amt3, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_tax_amt1_META = createCommonMeta($base_cur_tax_amt1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_tax_amt2_META = createCommonMeta($base_cur_tax_amt2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_tax_amt3_META = createCommonMeta($base_cur_tax_amt3, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_xrate_META = createCommonMeta($trd_xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta exc_gain_loss_META = createCommonMeta($exc_gain_loss, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta cash_META = createCommonMeta($cash, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta note_META = createCommonMeta($note, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta xfr_META = createCommonMeta($xfr, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta setoff_META = createCommonMeta($setoff, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sw_META = createCommonMeta($sw, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta bill_d_rmrks_META = createCommonMeta($bill_d_rmrks, mcframe.commonMS.meta.MS_META.BILL_D_RMRKS);
	public static final MCMeta ar_appl_schd_no_META = createCommonMeta($ar_appl_schd_no, mcframe.commonMA.meta.MA_META.AR_APPL_SCHD_NO);
	public static final MCMeta rcv_act_d_no_META = createCommonMeta($rcv_act_d_no, mcframe.commonMA.meta.MA_META.RCV_ACT_D_NO);
	public static final MCMeta rcv_act_d_seq_META = createCommonMeta($rcv_act_d_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);

	protected static final ConstMetaList<RcvActD_InfoR> constMetas = new ConstMetaList<RcvActD_InfoR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			grp_seq_META,
			bcst_cd_META,
			bill_dpt_cd_META,
			acst_cd_META,
			iv_no_META,
			bill_iv_no_META,
			rcv_act_peg_META,
			wrk_no_META,
			ar_typ_META,
			ar_sttl_cd1_META,
			ar_sttl_typ1_META,
			amt1_META,
			base_cur_amt1_META,
			amt2_META,
			base_cur_amt2_META,
			amt3_META,
			base_cur_amt3_META,
			ar_dpt_cd_META,
			wg_cd_META,
			tgt_rcv_bill_mng_no_META,
			tax_amt1_META,
			tax_amt2_META,
			tax_amt3_META,
			base_cur_tax_amt1_META,
			base_cur_tax_amt2_META,
			base_cur_tax_amt3_META,
			trd_xrate_META,
			exc_gain_loss_META,
			cash_META,
			note_META,
			xfr_META,
			setoff_META,
			sw_META,
			bill_d_rmrks_META,
			ar_appl_schd_no_META,
			rcv_act_d_no_META,
			rcv_act_d_seq_META
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
	protected RcvActD_InfoR_MC_A(ConstMetaList<? extends RcvActD_InfoR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RcvActD_InfoR clone() {
		return (RcvActD_InfoR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RcvActD_InfoR createInstance() {
		return (RcvActD_InfoR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RcvActD_InfoR getValues(String... names) {
		return (RcvActD_InfoR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Group sequence No. グループシーケンスＮＯ.<p>
	 *
	 */
	public MCNumber grp_seq() {
		return getConstNumber(offset + 0, $grp_seq);
	}

	/**
	 * Group sequence No. グループシーケンスＮＯ.<p>
	 *
	 */
	public void grp_seq(MCNumber value) {
		setConstNumber(offset + 0, $grp_seq, value);
	}

	/**
	 * Group sequence No. グループシーケンスＮＯ.<p>
	 *
	 */
	public void grp_seq(int value) {
		setConstNumber(offset + 0, $grp_seq, value);
	}

	/**
	 * Group sequence No. グループシーケンスＮＯ.<p>
	 *
	 */
	public void grp_seq(long value) {
		setConstNumber(offset + 0, $grp_seq, value);
	}

	/**
	 * Group sequence No. グループシーケンスＮＯ.<p>
	 *
	 */
	public void grp_seq(float value) {
		setConstNumber(offset + 0, $grp_seq, value);
	}

	/**
	 * Group sequence No. グループシーケンスＮＯ.<p>
	 *
	 */
	public void grp_seq(double value) {
		setConstNumber(offset + 0, $grp_seq, value);
	}


	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public String bcst_cd() {
		return getConstString(offset + 1, $bcst_cd);
	}

	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public void bcst_cd(String value) {
		setConstString(offset + 1, $bcst_cd, value);
	}


	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public String bill_dpt_cd() {
		return getConstString(offset + 2, $bill_dpt_cd);
	}

	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public void bill_dpt_cd(String value) {
		setConstString(offset + 2, $bill_dpt_cd, value);
	}


	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public String acst_cd() {
		return getConstString(offset + 3, $acst_cd);
	}

	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public void acst_cd(String value) {
		setConstString(offset + 3, $acst_cd, value);
	}


	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 4, $iv_no);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 4, $iv_no, value);
	}


	/**
	 * Billing invoice No. 請求インボイスＮＯ.<p>
	 *
	 */
	public String bill_iv_no() {
		return getConstString(offset + 5, $bill_iv_no);
	}

	/**
	 * Billing invoice No. 請求インボイスＮＯ.<p>
	 *
	 */
	public void bill_iv_no(String value) {
		setConstString(offset + 5, $bill_iv_no, value);
	}


	/**
	 * Payment received result pegging No. 入金実績紐付けＮＯ.<p>
	 *
	 */
	public MCNumber rcv_act_peg() {
		return getConstNumber(offset + 6, $rcv_act_peg);
	}

	/**
	 * Payment received result pegging No. 入金実績紐付けＮＯ.<p>
	 *
	 */
	public void rcv_act_peg(MCNumber value) {
		setConstNumber(offset + 6, $rcv_act_peg, value);
	}

	/**
	 * Payment received result pegging No. 入金実績紐付けＮＯ.<p>
	 *
	 */
	public void rcv_act_peg(int value) {
		setConstNumber(offset + 6, $rcv_act_peg, value);
	}

	/**
	 * Payment received result pegging No. 入金実績紐付けＮＯ.<p>
	 *
	 */
	public void rcv_act_peg(long value) {
		setConstNumber(offset + 6, $rcv_act_peg, value);
	}

	/**
	 * Payment received result pegging No. 入金実績紐付けＮＯ.<p>
	 *
	 */
	public void rcv_act_peg(float value) {
		setConstNumber(offset + 6, $rcv_act_peg, value);
	}

	/**
	 * Payment received result pegging No. 入金実績紐付けＮＯ.<p>
	 *
	 */
	public void rcv_act_peg(double value) {
		setConstNumber(offset + 6, $rcv_act_peg, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 7, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 7, $wrk_no, value);
	}


	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public String ar_typ() {
		return getConstString(offset + 8, $ar_typ);
	}

	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public void ar_typ(String value) {
		setConstString(offset + 8, $ar_typ, value);
	}


	/**
	 * AR settlement method 1 債権決済方法１.<p>
	 *
	 */
	public String ar_sttl_cd1() {
		return getConstString(offset + 9, $ar_sttl_cd1);
	}

	/**
	 * AR settlement method 1 債権決済方法１.<p>
	 *
	 */
	public void ar_sttl_cd1(String value) {
		setConstString(offset + 9, $ar_sttl_cd1, value);
	}


	/**
	 * AR settlement type 1 債権決済区分１.<p>
	 *
	 */
	public String ar_sttl_typ1() {
		return getConstString(offset + 10, $ar_sttl_typ1);
	}

	/**
	 * AR settlement type 1 債権決済区分１.<p>
	 *
	 */
	public void ar_sttl_typ1(String value) {
		setConstString(offset + 10, $ar_sttl_typ1, value);
	}


	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public MCNumber amt1() {
		return getConstNumber(offset + 11, $amt1);
	}

	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public void amt1(MCNumber value) {
		setConstNumber(offset + 11, $amt1, value);
	}

	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public void amt1(int value) {
		setConstNumber(offset + 11, $amt1, value);
	}

	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public void amt1(long value) {
		setConstNumber(offset + 11, $amt1, value);
	}

	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public void amt1(float value) {
		setConstNumber(offset + 11, $amt1, value);
	}

	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public void amt1(double value) {
		setConstNumber(offset + 11, $amt1, value);
	}


	/**
	 * Base payment received amount 基準入金額.<p>
	 *
	 */
	public MCNumber base_cur_amt1() {
		return getConstNumber(offset + 12, $base_cur_amt1);
	}

	/**
	 * Base payment received amount 基準入金額.<p>
	 *
	 */
	public void base_cur_amt1(MCNumber value) {
		setConstNumber(offset + 12, $base_cur_amt1, value);
	}

	/**
	 * Base payment received amount 基準入金額.<p>
	 *
	 */
	public void base_cur_amt1(int value) {
		setConstNumber(offset + 12, $base_cur_amt1, value);
	}

	/**
	 * Base payment received amount 基準入金額.<p>
	 *
	 */
	public void base_cur_amt1(long value) {
		setConstNumber(offset + 12, $base_cur_amt1, value);
	}

	/**
	 * Base payment received amount 基準入金額.<p>
	 *
	 */
	public void base_cur_amt1(float value) {
		setConstNumber(offset + 12, $base_cur_amt1, value);
	}

	/**
	 * Base payment received amount 基準入金額.<p>
	 *
	 */
	public void base_cur_amt1(double value) {
		setConstNumber(offset + 12, $base_cur_amt1, value);
	}


	/**
	 * Transfer fee 振込手数料.<p>
	 *
	 */
	public MCNumber amt2() {
		return getConstNumber(offset + 13, $amt2);
	}

	/**
	 * Transfer fee 振込手数料.<p>
	 *
	 */
	public void amt2(MCNumber value) {
		setConstNumber(offset + 13, $amt2, value);
	}

	/**
	 * Transfer fee 振込手数料.<p>
	 *
	 */
	public void amt2(int value) {
		setConstNumber(offset + 13, $amt2, value);
	}

	/**
	 * Transfer fee 振込手数料.<p>
	 *
	 */
	public void amt2(long value) {
		setConstNumber(offset + 13, $amt2, value);
	}

	/**
	 * Transfer fee 振込手数料.<p>
	 *
	 */
	public void amt2(float value) {
		setConstNumber(offset + 13, $amt2, value);
	}

	/**
	 * Transfer fee 振込手数料.<p>
	 *
	 */
	public void amt2(double value) {
		setConstNumber(offset + 13, $amt2, value);
	}


	/**
	 * Base transfer fee 基準振込手数料.<p>
	 *
	 */
	public MCNumber base_cur_amt2() {
		return getConstNumber(offset + 14, $base_cur_amt2);
	}

	/**
	 * Base transfer fee 基準振込手数料.<p>
	 *
	 */
	public void base_cur_amt2(MCNumber value) {
		setConstNumber(offset + 14, $base_cur_amt2, value);
	}

	/**
	 * Base transfer fee 基準振込手数料.<p>
	 *
	 */
	public void base_cur_amt2(int value) {
		setConstNumber(offset + 14, $base_cur_amt2, value);
	}

	/**
	 * Base transfer fee 基準振込手数料.<p>
	 *
	 */
	public void base_cur_amt2(long value) {
		setConstNumber(offset + 14, $base_cur_amt2, value);
	}

	/**
	 * Base transfer fee 基準振込手数料.<p>
	 *
	 */
	public void base_cur_amt2(float value) {
		setConstNumber(offset + 14, $base_cur_amt2, value);
	}

	/**
	 * Base transfer fee 基準振込手数料.<p>
	 *
	 */
	public void base_cur_amt2(double value) {
		setConstNumber(offset + 14, $base_cur_amt2, value);
	}


	/**
	 * Amount 3 金額３.<p>
	 *
	 */
	public MCNumber amt3() {
		return getConstNumber(offset + 15, $amt3);
	}

	/**
	 * Amount 3 金額３.<p>
	 *
	 */
	public void amt3(MCNumber value) {
		setConstNumber(offset + 15, $amt3, value);
	}

	/**
	 * Amount 3 金額３.<p>
	 *
	 */
	public void amt3(int value) {
		setConstNumber(offset + 15, $amt3, value);
	}

	/**
	 * Amount 3 金額３.<p>
	 *
	 */
	public void amt3(long value) {
		setConstNumber(offset + 15, $amt3, value);
	}

	/**
	 * Amount 3 金額３.<p>
	 *
	 */
	public void amt3(float value) {
		setConstNumber(offset + 15, $amt3, value);
	}

	/**
	 * Amount 3 金額３.<p>
	 *
	 */
	public void amt3(double value) {
		setConstNumber(offset + 15, $amt3, value);
	}


	/**
	 * Base amount 3 基準金額３.<p>
	 *
	 */
	public MCNumber base_cur_amt3() {
		return getConstNumber(offset + 16, $base_cur_amt3);
	}

	/**
	 * Base amount 3 基準金額３.<p>
	 *
	 */
	public void base_cur_amt3(MCNumber value) {
		setConstNumber(offset + 16, $base_cur_amt3, value);
	}

	/**
	 * Base amount 3 基準金額３.<p>
	 *
	 */
	public void base_cur_amt3(int value) {
		setConstNumber(offset + 16, $base_cur_amt3, value);
	}

	/**
	 * Base amount 3 基準金額３.<p>
	 *
	 */
	public void base_cur_amt3(long value) {
		setConstNumber(offset + 16, $base_cur_amt3, value);
	}

	/**
	 * Base amount 3 基準金額３.<p>
	 *
	 */
	public void base_cur_amt3(float value) {
		setConstNumber(offset + 16, $base_cur_amt3, value);
	}

	/**
	 * Base amount 3 基準金額３.<p>
	 *
	 */
	public void base_cur_amt3(double value) {
		setConstNumber(offset + 16, $base_cur_amt3, value);
	}


	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public String ar_dpt_cd() {
		return getConstString(offset + 17, $ar_dpt_cd);
	}

	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public void ar_dpt_cd(String value) {
		setConstString(offset + 17, $ar_dpt_cd, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 18, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 18, $wg_cd, value);
	}


	/**
	 * Billing management No. for payment received 入金対象請求管理ＮＯ.<p>
	 *
	 */
	public String tgt_rcv_bill_mng_no() {
		return getConstString(offset + 19, $tgt_rcv_bill_mng_no);
	}

	/**
	 * Billing management No. for payment received 入金対象請求管理ＮＯ.<p>
	 *
	 */
	public void tgt_rcv_bill_mng_no(String value) {
		setConstString(offset + 19, $tgt_rcv_bill_mng_no, value);
	}


	/**
	 * Tax amount 1 税額１.<p>
	 *
	 */
	public MCNumber tax_amt1() {
		return getConstNumber(offset + 20, $tax_amt1);
	}

	/**
	 * Tax amount 1 税額１.<p>
	 *
	 */
	public void tax_amt1(MCNumber value) {
		setConstNumber(offset + 20, $tax_amt1, value);
	}

	/**
	 * Tax amount 1 税額１.<p>
	 *
	 */
	public void tax_amt1(int value) {
		setConstNumber(offset + 20, $tax_amt1, value);
	}

	/**
	 * Tax amount 1 税額１.<p>
	 *
	 */
	public void tax_amt1(long value) {
		setConstNumber(offset + 20, $tax_amt1, value);
	}

	/**
	 * Tax amount 1 税額１.<p>
	 *
	 */
	public void tax_amt1(float value) {
		setConstNumber(offset + 20, $tax_amt1, value);
	}

	/**
	 * Tax amount 1 税額１.<p>
	 *
	 */
	public void tax_amt1(double value) {
		setConstNumber(offset + 20, $tax_amt1, value);
	}


	/**
	 * Tax amount 2 税額２.<p>
	 *
	 */
	public MCNumber tax_amt2() {
		return getConstNumber(offset + 21, $tax_amt2);
	}

	/**
	 * Tax amount 2 税額２.<p>
	 *
	 */
	public void tax_amt2(MCNumber value) {
		setConstNumber(offset + 21, $tax_amt2, value);
	}

	/**
	 * Tax amount 2 税額２.<p>
	 *
	 */
	public void tax_amt2(int value) {
		setConstNumber(offset + 21, $tax_amt2, value);
	}

	/**
	 * Tax amount 2 税額２.<p>
	 *
	 */
	public void tax_amt2(long value) {
		setConstNumber(offset + 21, $tax_amt2, value);
	}

	/**
	 * Tax amount 2 税額２.<p>
	 *
	 */
	public void tax_amt2(float value) {
		setConstNumber(offset + 21, $tax_amt2, value);
	}

	/**
	 * Tax amount 2 税額２.<p>
	 *
	 */
	public void tax_amt2(double value) {
		setConstNumber(offset + 21, $tax_amt2, value);
	}


	/**
	 * Tax amount 3 税額３.<p>
	 *
	 */
	public MCNumber tax_amt3() {
		return getConstNumber(offset + 22, $tax_amt3);
	}

	/**
	 * Tax amount 3 税額３.<p>
	 *
	 */
	public void tax_amt3(MCNumber value) {
		setConstNumber(offset + 22, $tax_amt3, value);
	}

	/**
	 * Tax amount 3 税額３.<p>
	 *
	 */
	public void tax_amt3(int value) {
		setConstNumber(offset + 22, $tax_amt3, value);
	}

	/**
	 * Tax amount 3 税額３.<p>
	 *
	 */
	public void tax_amt3(long value) {
		setConstNumber(offset + 22, $tax_amt3, value);
	}

	/**
	 * Tax amount 3 税額３.<p>
	 *
	 */
	public void tax_amt3(float value) {
		setConstNumber(offset + 22, $tax_amt3, value);
	}

	/**
	 * Tax amount 3 税額３.<p>
	 *
	 */
	public void tax_amt3(double value) {
		setConstNumber(offset + 22, $tax_amt3, value);
	}


	/**
	 * Tax amount 1 (Base currency) 基準通貨税額１.<p>
	 *
	 */
	public MCNumber base_cur_tax_amt1() {
		return getConstNumber(offset + 23, $base_cur_tax_amt1);
	}

	/**
	 * Tax amount 1 (Base currency) 基準通貨税額１.<p>
	 *
	 */
	public void base_cur_tax_amt1(MCNumber value) {
		setConstNumber(offset + 23, $base_cur_tax_amt1, value);
	}

	/**
	 * Tax amount 1 (Base currency) 基準通貨税額１.<p>
	 *
	 */
	public void base_cur_tax_amt1(int value) {
		setConstNumber(offset + 23, $base_cur_tax_amt1, value);
	}

	/**
	 * Tax amount 1 (Base currency) 基準通貨税額１.<p>
	 *
	 */
	public void base_cur_tax_amt1(long value) {
		setConstNumber(offset + 23, $base_cur_tax_amt1, value);
	}

	/**
	 * Tax amount 1 (Base currency) 基準通貨税額１.<p>
	 *
	 */
	public void base_cur_tax_amt1(float value) {
		setConstNumber(offset + 23, $base_cur_tax_amt1, value);
	}

	/**
	 * Tax amount 1 (Base currency) 基準通貨税額１.<p>
	 *
	 */
	public void base_cur_tax_amt1(double value) {
		setConstNumber(offset + 23, $base_cur_tax_amt1, value);
	}


	/**
	 * Tax amount 2 (Base currency) 基準通貨税額２.<p>
	 *
	 */
	public MCNumber base_cur_tax_amt2() {
		return getConstNumber(offset + 24, $base_cur_tax_amt2);
	}

	/**
	 * Tax amount 2 (Base currency) 基準通貨税額２.<p>
	 *
	 */
	public void base_cur_tax_amt2(MCNumber value) {
		setConstNumber(offset + 24, $base_cur_tax_amt2, value);
	}

	/**
	 * Tax amount 2 (Base currency) 基準通貨税額２.<p>
	 *
	 */
	public void base_cur_tax_amt2(int value) {
		setConstNumber(offset + 24, $base_cur_tax_amt2, value);
	}

	/**
	 * Tax amount 2 (Base currency) 基準通貨税額２.<p>
	 *
	 */
	public void base_cur_tax_amt2(long value) {
		setConstNumber(offset + 24, $base_cur_tax_amt2, value);
	}

	/**
	 * Tax amount 2 (Base currency) 基準通貨税額２.<p>
	 *
	 */
	public void base_cur_tax_amt2(float value) {
		setConstNumber(offset + 24, $base_cur_tax_amt2, value);
	}

	/**
	 * Tax amount 2 (Base currency) 基準通貨税額２.<p>
	 *
	 */
	public void base_cur_tax_amt2(double value) {
		setConstNumber(offset + 24, $base_cur_tax_amt2, value);
	}


	/**
	 * Tax amount 3 (Base currency) 基準通貨税額３.<p>
	 *
	 */
	public MCNumber base_cur_tax_amt3() {
		return getConstNumber(offset + 25, $base_cur_tax_amt3);
	}

	/**
	 * Tax amount 3 (Base currency) 基準通貨税額３.<p>
	 *
	 */
	public void base_cur_tax_amt3(MCNumber value) {
		setConstNumber(offset + 25, $base_cur_tax_amt3, value);
	}

	/**
	 * Tax amount 3 (Base currency) 基準通貨税額３.<p>
	 *
	 */
	public void base_cur_tax_amt3(int value) {
		setConstNumber(offset + 25, $base_cur_tax_amt3, value);
	}

	/**
	 * Tax amount 3 (Base currency) 基準通貨税額３.<p>
	 *
	 */
	public void base_cur_tax_amt3(long value) {
		setConstNumber(offset + 25, $base_cur_tax_amt3, value);
	}

	/**
	 * Tax amount 3 (Base currency) 基準通貨税額３.<p>
	 *
	 */
	public void base_cur_tax_amt3(float value) {
		setConstNumber(offset + 25, $base_cur_tax_amt3, value);
	}

	/**
	 * Tax amount 3 (Base currency) 基準通貨税額３.<p>
	 *
	 */
	public void base_cur_tax_amt3(double value) {
		setConstNumber(offset + 25, $base_cur_tax_amt3, value);
	}


	/**
	 * Exchange rate at trading 取引時為替レート.<p>
	 *
	 */
	public MCNumber trd_xrate() {
		return getConstNumber(offset + 26, $trd_xrate);
	}

	/**
	 * Exchange rate at trading 取引時為替レート.<p>
	 *
	 */
	public void trd_xrate(MCNumber value) {
		setConstNumber(offset + 26, $trd_xrate, value);
	}

	/**
	 * Exchange rate at trading 取引時為替レート.<p>
	 *
	 */
	public void trd_xrate(int value) {
		setConstNumber(offset + 26, $trd_xrate, value);
	}

	/**
	 * Exchange rate at trading 取引時為替レート.<p>
	 *
	 */
	public void trd_xrate(long value) {
		setConstNumber(offset + 26, $trd_xrate, value);
	}

	/**
	 * Exchange rate at trading 取引時為替レート.<p>
	 *
	 */
	public void trd_xrate(float value) {
		setConstNumber(offset + 26, $trd_xrate, value);
	}

	/**
	 * Exchange rate at trading 取引時為替レート.<p>
	 *
	 */
	public void trd_xrate(double value) {
		setConstNumber(offset + 26, $trd_xrate, value);
	}


	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public MCNumber exc_gain_loss() {
		return getConstNumber(offset + 27, $exc_gain_loss);
	}

	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public void exc_gain_loss(MCNumber value) {
		setConstNumber(offset + 27, $exc_gain_loss, value);
	}

	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public void exc_gain_loss(int value) {
		setConstNumber(offset + 27, $exc_gain_loss, value);
	}

	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public void exc_gain_loss(long value) {
		setConstNumber(offset + 27, $exc_gain_loss, value);
	}

	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public void exc_gain_loss(float value) {
		setConstNumber(offset + 27, $exc_gain_loss, value);
	}

	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public void exc_gain_loss(double value) {
		setConstNumber(offset + 27, $exc_gain_loss, value);
	}


	/**
	 * Cash 現金.<p>
	 *
	 */
	public MCNumber cash() {
		return getConstNumber(offset + 28, $cash);
	}

	/**
	 * Cash 現金.<p>
	 *
	 */
	public void cash(MCNumber value) {
		setConstNumber(offset + 28, $cash, value);
	}

	/**
	 * Cash 現金.<p>
	 *
	 */
	public void cash(int value) {
		setConstNumber(offset + 28, $cash, value);
	}

	/**
	 * Cash 現金.<p>
	 *
	 */
	public void cash(long value) {
		setConstNumber(offset + 28, $cash, value);
	}

	/**
	 * Cash 現金.<p>
	 *
	 */
	public void cash(float value) {
		setConstNumber(offset + 28, $cash, value);
	}

	/**
	 * Cash 現金.<p>
	 *
	 */
	public void cash(double value) {
		setConstNumber(offset + 28, $cash, value);
	}


	/**
	 * Notes 手形.<p>
	 *
	 */
	public MCNumber note() {
		return getConstNumber(offset + 29, $note);
	}

	/**
	 * Notes 手形.<p>
	 *
	 */
	public void note(MCNumber value) {
		setConstNumber(offset + 29, $note, value);
	}

	/**
	 * Notes 手形.<p>
	 *
	 */
	public void note(int value) {
		setConstNumber(offset + 29, $note, value);
	}

	/**
	 * Notes 手形.<p>
	 *
	 */
	public void note(long value) {
		setConstNumber(offset + 29, $note, value);
	}

	/**
	 * Notes 手形.<p>
	 *
	 */
	public void note(float value) {
		setConstNumber(offset + 29, $note, value);
	}

	/**
	 * Notes 手形.<p>
	 *
	 */
	public void note(double value) {
		setConstNumber(offset + 29, $note, value);
	}


	/**
	 * Payment 振込.<p>
	 *
	 */
	public MCNumber xfr() {
		return getConstNumber(offset + 30, $xfr);
	}

	/**
	 * Payment 振込.<p>
	 *
	 */
	public void xfr(MCNumber value) {
		setConstNumber(offset + 30, $xfr, value);
	}

	/**
	 * Payment 振込.<p>
	 *
	 */
	public void xfr(int value) {
		setConstNumber(offset + 30, $xfr, value);
	}

	/**
	 * Payment 振込.<p>
	 *
	 */
	public void xfr(long value) {
		setConstNumber(offset + 30, $xfr, value);
	}

	/**
	 * Payment 振込.<p>
	 *
	 */
	public void xfr(float value) {
		setConstNumber(offset + 30, $xfr, value);
	}

	/**
	 * Payment 振込.<p>
	 *
	 */
	public void xfr(double value) {
		setConstNumber(offset + 30, $xfr, value);
	}


	/**
	 * Offset 相殺.<p>
	 *
	 */
	public MCNumber setoff() {
		return getConstNumber(offset + 31, $setoff);
	}

	/**
	 * Offset 相殺.<p>
	 *
	 */
	public void setoff(MCNumber value) {
		setConstNumber(offset + 31, $setoff, value);
	}

	/**
	 * Offset 相殺.<p>
	 *
	 */
	public void setoff(int value) {
		setConstNumber(offset + 31, $setoff, value);
	}

	/**
	 * Offset 相殺.<p>
	 *
	 */
	public void setoff(long value) {
		setConstNumber(offset + 31, $setoff, value);
	}

	/**
	 * Offset 相殺.<p>
	 *
	 */
	public void setoff(float value) {
		setConstNumber(offset + 31, $setoff, value);
	}

	/**
	 * Offset 相殺.<p>
	 *
	 */
	public void setoff(double value) {
		setConstNumber(offset + 31, $setoff, value);
	}


	/**
	 * Transfer 振替.<p>
	 *
	 */
	public MCNumber sw() {
		return getConstNumber(offset + 32, $sw);
	}

	/**
	 * Transfer 振替.<p>
	 *
	 */
	public void sw(MCNumber value) {
		setConstNumber(offset + 32, $sw, value);
	}

	/**
	 * Transfer 振替.<p>
	 *
	 */
	public void sw(int value) {
		setConstNumber(offset + 32, $sw, value);
	}

	/**
	 * Transfer 振替.<p>
	 *
	 */
	public void sw(long value) {
		setConstNumber(offset + 32, $sw, value);
	}

	/**
	 * Transfer 振替.<p>
	 *
	 */
	public void sw(float value) {
		setConstNumber(offset + 32, $sw, value);
	}

	/**
	 * Transfer 振替.<p>
	 *
	 */
	public void sw(double value) {
		setConstNumber(offset + 32, $sw, value);
	}


	/**
	 * Invoice details remarks 請求書明細備考.<p>
	 *
	 */
	public String bill_d_rmrks() {
		return getConstString(offset + 33, $bill_d_rmrks);
	}

	/**
	 * Invoice details remarks 請求書明細備考.<p>
	 *
	 */
	public void bill_d_rmrks(String value) {
		setConstString(offset + 33, $bill_d_rmrks, value);
	}


	/**
	 * AR reconciliation schedule No. 売掛消込予定ＮＯ.<p>
	 *
	 */
	public String ar_appl_schd_no() {
		return getConstString(offset + 34, $ar_appl_schd_no);
	}

	/**
	 * AR reconciliation schedule No. 売掛消込予定ＮＯ.<p>
	 *
	 */
	public void ar_appl_schd_no(String value) {
		setConstString(offset + 34, $ar_appl_schd_no, value);
	}


	/**
	 * Payment received result details No. 入金実績明細ＮＯ.<p>
	 *
	 */
	public String rcv_act_d_no() {
		return getConstString(offset + 35, $rcv_act_d_no);
	}

	/**
	 * Payment received result details No. 入金実績明細ＮＯ.<p>
	 *
	 */
	public void rcv_act_d_no(String value) {
		setConstString(offset + 35, $rcv_act_d_no, value);
	}


	/**
	 * Payment received result details sequence number 入金実績明細連番.<p>
	 *
	 */
	public MCNumber rcv_act_d_seq() {
		return getConstNumber(offset + 36, $rcv_act_d_seq);
	}

	/**
	 * Payment received result details sequence number 入金実績明細連番.<p>
	 *
	 */
	public void rcv_act_d_seq(MCNumber value) {
		setConstNumber(offset + 36, $rcv_act_d_seq, value);
	}

	/**
	 * Payment received result details sequence number 入金実績明細連番.<p>
	 *
	 */
	public void rcv_act_d_seq(int value) {
		setConstNumber(offset + 36, $rcv_act_d_seq, value);
	}

	/**
	 * Payment received result details sequence number 入金実績明細連番.<p>
	 *
	 */
	public void rcv_act_d_seq(long value) {
		setConstNumber(offset + 36, $rcv_act_d_seq, value);
	}

	/**
	 * Payment received result details sequence number 入金実績明細連番.<p>
	 *
	 */
	public void rcv_act_d_seq(float value) {
		setConstNumber(offset + 36, $rcv_act_d_seq, value);
	}

	/**
	 * Payment received result details sequence number 入金実績明細連番.<p>
	 *
	 */
	public void rcv_act_d_seq(double value) {
		setConstNumber(offset + 36, $rcv_act_d_seq, value);
	}


	public String getString(String name) {
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($bill_iv_no.equalsIgnoreCase(name)) {
			return bill_iv_no();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			return ar_typ();
		}
		if ($ar_sttl_cd1.equalsIgnoreCase(name)) {
			return ar_sttl_cd1();
		}
		if ($ar_sttl_typ1.equalsIgnoreCase(name)) {
			return ar_sttl_typ1();
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($tgt_rcv_bill_mng_no.equalsIgnoreCase(name)) {
			return tgt_rcv_bill_mng_no();
		}
		if ($bill_d_rmrks.equalsIgnoreCase(name)) {
			return bill_d_rmrks();
		}
		if ($ar_appl_schd_no.equalsIgnoreCase(name)) {
			return ar_appl_schd_no();
		}
		if ($rcv_act_d_no.equalsIgnoreCase(name)) {
			return rcv_act_d_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($grp_seq.equalsIgnoreCase(name)) {
			return grp_seq();
		}
		if ($rcv_act_peg.equalsIgnoreCase(name)) {
			return rcv_act_peg();
		}
		if ($amt1.equalsIgnoreCase(name)) {
			return amt1();
		}
		if ($base_cur_amt1.equalsIgnoreCase(name)) {
			return base_cur_amt1();
		}
		if ($amt2.equalsIgnoreCase(name)) {
			return amt2();
		}
		if ($base_cur_amt2.equalsIgnoreCase(name)) {
			return base_cur_amt2();
		}
		if ($amt3.equalsIgnoreCase(name)) {
			return amt3();
		}
		if ($base_cur_amt3.equalsIgnoreCase(name)) {
			return base_cur_amt3();
		}
		if ($tax_amt1.equalsIgnoreCase(name)) {
			return tax_amt1();
		}
		if ($tax_amt2.equalsIgnoreCase(name)) {
			return tax_amt2();
		}
		if ($tax_amt3.equalsIgnoreCase(name)) {
			return tax_amt3();
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			return base_cur_tax_amt1();
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			return base_cur_tax_amt2();
		}
		if ($base_cur_tax_amt3.equalsIgnoreCase(name)) {
			return base_cur_tax_amt3();
		}
		if ($trd_xrate.equalsIgnoreCase(name)) {
			return trd_xrate();
		}
		if ($exc_gain_loss.equalsIgnoreCase(name)) {
			return exc_gain_loss();
		}
		if ($cash.equalsIgnoreCase(name)) {
			return cash();
		}
		if ($note.equalsIgnoreCase(name)) {
			return note();
		}
		if ($xfr.equalsIgnoreCase(name)) {
			return xfr();
		}
		if ($setoff.equalsIgnoreCase(name)) {
			return setoff();
		}
		if ($sw.equalsIgnoreCase(name)) {
			return sw();
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			return rcv_act_d_seq();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($bill_iv_no.equalsIgnoreCase(name)) {
			return bill_iv_no();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			return ar_typ();
		}
		if ($ar_sttl_cd1.equalsIgnoreCase(name)) {
			return ar_sttl_cd1();
		}
		if ($ar_sttl_typ1.equalsIgnoreCase(name)) {
			return ar_sttl_typ1();
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($tgt_rcv_bill_mng_no.equalsIgnoreCase(name)) {
			return tgt_rcv_bill_mng_no();
		}
		if ($bill_d_rmrks.equalsIgnoreCase(name)) {
			return bill_d_rmrks();
		}
		if ($ar_appl_schd_no.equalsIgnoreCase(name)) {
			return ar_appl_schd_no();
		}
		if ($rcv_act_d_no.equalsIgnoreCase(name)) {
			return rcv_act_d_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($grp_seq.equalsIgnoreCase(name)) {
			return grp_seq();
		}
		if ($rcv_act_peg.equalsIgnoreCase(name)) {
			return rcv_act_peg();
		}
		if ($amt1.equalsIgnoreCase(name)) {
			return amt1();
		}
		if ($base_cur_amt1.equalsIgnoreCase(name)) {
			return base_cur_amt1();
		}
		if ($amt2.equalsIgnoreCase(name)) {
			return amt2();
		}
		if ($base_cur_amt2.equalsIgnoreCase(name)) {
			return base_cur_amt2();
		}
		if ($amt3.equalsIgnoreCase(name)) {
			return amt3();
		}
		if ($base_cur_amt3.equalsIgnoreCase(name)) {
			return base_cur_amt3();
		}
		if ($tax_amt1.equalsIgnoreCase(name)) {
			return tax_amt1();
		}
		if ($tax_amt2.equalsIgnoreCase(name)) {
			return tax_amt2();
		}
		if ($tax_amt3.equalsIgnoreCase(name)) {
			return tax_amt3();
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			return base_cur_tax_amt1();
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			return base_cur_tax_amt2();
		}
		if ($base_cur_tax_amt3.equalsIgnoreCase(name)) {
			return base_cur_tax_amt3();
		}
		if ($trd_xrate.equalsIgnoreCase(name)) {
			return trd_xrate();
		}
		if ($exc_gain_loss.equalsIgnoreCase(name)) {
			return exc_gain_loss();
		}
		if ($cash.equalsIgnoreCase(name)) {
			return cash();
		}
		if ($note.equalsIgnoreCase(name)) {
			return note();
		}
		if ($xfr.equalsIgnoreCase(name)) {
			return xfr();
		}
		if ($setoff.equalsIgnoreCase(name)) {
			return setoff();
		}
		if ($sw.equalsIgnoreCase(name)) {
			return sw();
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			return rcv_act_d_seq();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($bill_iv_no.equalsIgnoreCase(name)) {
			bill_iv_no(value);
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
		if ($ar_sttl_cd1.equalsIgnoreCase(name)) {
			ar_sttl_cd1(value);
			return;
		}
		if ($ar_sttl_typ1.equalsIgnoreCase(name)) {
			ar_sttl_typ1(value);
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
		if ($tgt_rcv_bill_mng_no.equalsIgnoreCase(name)) {
			tgt_rcv_bill_mng_no(value);
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
		if ($rcv_act_d_no.equalsIgnoreCase(name)) {
			rcv_act_d_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($grp_seq.equalsIgnoreCase(name)) {
			grp_seq(value);
			return;
		}
		if ($rcv_act_peg.equalsIgnoreCase(name)) {
			rcv_act_peg(value);
			return;
		}
		if ($amt1.equalsIgnoreCase(name)) {
			amt1(value);
			return;
		}
		if ($base_cur_amt1.equalsIgnoreCase(name)) {
			base_cur_amt1(value);
			return;
		}
		if ($amt2.equalsIgnoreCase(name)) {
			amt2(value);
			return;
		}
		if ($base_cur_amt2.equalsIgnoreCase(name)) {
			base_cur_amt2(value);
			return;
		}
		if ($amt3.equalsIgnoreCase(name)) {
			amt3(value);
			return;
		}
		if ($base_cur_amt3.equalsIgnoreCase(name)) {
			base_cur_amt3(value);
			return;
		}
		if ($tax_amt1.equalsIgnoreCase(name)) {
			tax_amt1(value);
			return;
		}
		if ($tax_amt2.equalsIgnoreCase(name)) {
			tax_amt2(value);
			return;
		}
		if ($tax_amt3.equalsIgnoreCase(name)) {
			tax_amt3(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			base_cur_tax_amt2(value);
			return;
		}
		if ($base_cur_tax_amt3.equalsIgnoreCase(name)) {
			base_cur_tax_amt3(value);
			return;
		}
		if ($trd_xrate.equalsIgnoreCase(name)) {
			trd_xrate(value);
			return;
		}
		if ($exc_gain_loss.equalsIgnoreCase(name)) {
			exc_gain_loss(value);
			return;
		}
		if ($cash.equalsIgnoreCase(name)) {
			cash(value);
			return;
		}
		if ($note.equalsIgnoreCase(name)) {
			note(value);
			return;
		}
		if ($xfr.equalsIgnoreCase(name)) {
			xfr(value);
			return;
		}
		if ($setoff.equalsIgnoreCase(name)) {
			setoff(value);
			return;
		}
		if ($sw.equalsIgnoreCase(name)) {
			sw(value);
			return;
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($grp_seq.equalsIgnoreCase(name)) {
			grp_seq(value);
			return;
		}
		if ($rcv_act_peg.equalsIgnoreCase(name)) {
			rcv_act_peg(value);
			return;
		}
		if ($amt1.equalsIgnoreCase(name)) {
			amt1(value);
			return;
		}
		if ($base_cur_amt1.equalsIgnoreCase(name)) {
			base_cur_amt1(value);
			return;
		}
		if ($amt2.equalsIgnoreCase(name)) {
			amt2(value);
			return;
		}
		if ($base_cur_amt2.equalsIgnoreCase(name)) {
			base_cur_amt2(value);
			return;
		}
		if ($amt3.equalsIgnoreCase(name)) {
			amt3(value);
			return;
		}
		if ($base_cur_amt3.equalsIgnoreCase(name)) {
			base_cur_amt3(value);
			return;
		}
		if ($tax_amt1.equalsIgnoreCase(name)) {
			tax_amt1(value);
			return;
		}
		if ($tax_amt2.equalsIgnoreCase(name)) {
			tax_amt2(value);
			return;
		}
		if ($tax_amt3.equalsIgnoreCase(name)) {
			tax_amt3(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			base_cur_tax_amt2(value);
			return;
		}
		if ($base_cur_tax_amt3.equalsIgnoreCase(name)) {
			base_cur_tax_amt3(value);
			return;
		}
		if ($trd_xrate.equalsIgnoreCase(name)) {
			trd_xrate(value);
			return;
		}
		if ($exc_gain_loss.equalsIgnoreCase(name)) {
			exc_gain_loss(value);
			return;
		}
		if ($cash.equalsIgnoreCase(name)) {
			cash(value);
			return;
		}
		if ($note.equalsIgnoreCase(name)) {
			note(value);
			return;
		}
		if ($xfr.equalsIgnoreCase(name)) {
			xfr(value);
			return;
		}
		if ($setoff.equalsIgnoreCase(name)) {
			setoff(value);
			return;
		}
		if ($sw.equalsIgnoreCase(name)) {
			sw(value);
			return;
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($grp_seq.equalsIgnoreCase(name)) {
			grp_seq(value);
			return;
		}
		if ($rcv_act_peg.equalsIgnoreCase(name)) {
			rcv_act_peg(value);
			return;
		}
		if ($amt1.equalsIgnoreCase(name)) {
			amt1(value);
			return;
		}
		if ($base_cur_amt1.equalsIgnoreCase(name)) {
			base_cur_amt1(value);
			return;
		}
		if ($amt2.equalsIgnoreCase(name)) {
			amt2(value);
			return;
		}
		if ($base_cur_amt2.equalsIgnoreCase(name)) {
			base_cur_amt2(value);
			return;
		}
		if ($amt3.equalsIgnoreCase(name)) {
			amt3(value);
			return;
		}
		if ($base_cur_amt3.equalsIgnoreCase(name)) {
			base_cur_amt3(value);
			return;
		}
		if ($tax_amt1.equalsIgnoreCase(name)) {
			tax_amt1(value);
			return;
		}
		if ($tax_amt2.equalsIgnoreCase(name)) {
			tax_amt2(value);
			return;
		}
		if ($tax_amt3.equalsIgnoreCase(name)) {
			tax_amt3(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			base_cur_tax_amt2(value);
			return;
		}
		if ($base_cur_tax_amt3.equalsIgnoreCase(name)) {
			base_cur_tax_amt3(value);
			return;
		}
		if ($trd_xrate.equalsIgnoreCase(name)) {
			trd_xrate(value);
			return;
		}
		if ($exc_gain_loss.equalsIgnoreCase(name)) {
			exc_gain_loss(value);
			return;
		}
		if ($cash.equalsIgnoreCase(name)) {
			cash(value);
			return;
		}
		if ($note.equalsIgnoreCase(name)) {
			note(value);
			return;
		}
		if ($xfr.equalsIgnoreCase(name)) {
			xfr(value);
			return;
		}
		if ($setoff.equalsIgnoreCase(name)) {
			setoff(value);
			return;
		}
		if ($sw.equalsIgnoreCase(name)) {
			sw(value);
			return;
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($grp_seq.equalsIgnoreCase(name)) {
			grp_seq(value);
			return;
		}
		if ($rcv_act_peg.equalsIgnoreCase(name)) {
			rcv_act_peg(value);
			return;
		}
		if ($amt1.equalsIgnoreCase(name)) {
			amt1(value);
			return;
		}
		if ($base_cur_amt1.equalsIgnoreCase(name)) {
			base_cur_amt1(value);
			return;
		}
		if ($amt2.equalsIgnoreCase(name)) {
			amt2(value);
			return;
		}
		if ($base_cur_amt2.equalsIgnoreCase(name)) {
			base_cur_amt2(value);
			return;
		}
		if ($amt3.equalsIgnoreCase(name)) {
			amt3(value);
			return;
		}
		if ($base_cur_amt3.equalsIgnoreCase(name)) {
			base_cur_amt3(value);
			return;
		}
		if ($tax_amt1.equalsIgnoreCase(name)) {
			tax_amt1(value);
			return;
		}
		if ($tax_amt2.equalsIgnoreCase(name)) {
			tax_amt2(value);
			return;
		}
		if ($tax_amt3.equalsIgnoreCase(name)) {
			tax_amt3(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			base_cur_tax_amt2(value);
			return;
		}
		if ($base_cur_tax_amt3.equalsIgnoreCase(name)) {
			base_cur_tax_amt3(value);
			return;
		}
		if ($trd_xrate.equalsIgnoreCase(name)) {
			trd_xrate(value);
			return;
		}
		if ($exc_gain_loss.equalsIgnoreCase(name)) {
			exc_gain_loss(value);
			return;
		}
		if ($cash.equalsIgnoreCase(name)) {
			cash(value);
			return;
		}
		if ($note.equalsIgnoreCase(name)) {
			note(value);
			return;
		}
		if ($xfr.equalsIgnoreCase(name)) {
			xfr(value);
			return;
		}
		if ($setoff.equalsIgnoreCase(name)) {
			setoff(value);
			return;
		}
		if ($sw.equalsIgnoreCase(name)) {
			sw(value);
			return;
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($grp_seq.equalsIgnoreCase(name)) {
			grp_seq(value);
			return;
		}
		if ($rcv_act_peg.equalsIgnoreCase(name)) {
			rcv_act_peg(value);
			return;
		}
		if ($amt1.equalsIgnoreCase(name)) {
			amt1(value);
			return;
		}
		if ($base_cur_amt1.equalsIgnoreCase(name)) {
			base_cur_amt1(value);
			return;
		}
		if ($amt2.equalsIgnoreCase(name)) {
			amt2(value);
			return;
		}
		if ($base_cur_amt2.equalsIgnoreCase(name)) {
			base_cur_amt2(value);
			return;
		}
		if ($amt3.equalsIgnoreCase(name)) {
			amt3(value);
			return;
		}
		if ($base_cur_amt3.equalsIgnoreCase(name)) {
			base_cur_amt3(value);
			return;
		}
		if ($tax_amt1.equalsIgnoreCase(name)) {
			tax_amt1(value);
			return;
		}
		if ($tax_amt2.equalsIgnoreCase(name)) {
			tax_amt2(value);
			return;
		}
		if ($tax_amt3.equalsIgnoreCase(name)) {
			tax_amt3(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			base_cur_tax_amt2(value);
			return;
		}
		if ($base_cur_tax_amt3.equalsIgnoreCase(name)) {
			base_cur_tax_amt3(value);
			return;
		}
		if ($trd_xrate.equalsIgnoreCase(name)) {
			trd_xrate(value);
			return;
		}
		if ($exc_gain_loss.equalsIgnoreCase(name)) {
			exc_gain_loss(value);
			return;
		}
		if ($cash.equalsIgnoreCase(name)) {
			cash(value);
			return;
		}
		if ($note.equalsIgnoreCase(name)) {
			note(value);
			return;
		}
		if ($xfr.equalsIgnoreCase(name)) {
			xfr(value);
			return;
		}
		if ($setoff.equalsIgnoreCase(name)) {
			setoff(value);
			return;
		}
		if ($sw.equalsIgnoreCase(name)) {
			sw(value);
			return;
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($bill_iv_no.equalsIgnoreCase(name)) {
			bill_iv_no(value);
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
		if ($ar_sttl_cd1.equalsIgnoreCase(name)) {
			ar_sttl_cd1(value);
			return;
		}
		if ($ar_sttl_typ1.equalsIgnoreCase(name)) {
			ar_sttl_typ1(value);
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
		if ($tgt_rcv_bill_mng_no.equalsIgnoreCase(name)) {
			tgt_rcv_bill_mng_no(value);
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
		if ($rcv_act_d_no.equalsIgnoreCase(name)) {
			rcv_act_d_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($grp_seq.equalsIgnoreCase(name)) {
			grp_seq(value);
			return;
		}
		if ($rcv_act_peg.equalsIgnoreCase(name)) {
			rcv_act_peg(value);
			return;
		}
		if ($amt1.equalsIgnoreCase(name)) {
			amt1(value);
			return;
		}
		if ($base_cur_amt1.equalsIgnoreCase(name)) {
			base_cur_amt1(value);
			return;
		}
		if ($amt2.equalsIgnoreCase(name)) {
			amt2(value);
			return;
		}
		if ($base_cur_amt2.equalsIgnoreCase(name)) {
			base_cur_amt2(value);
			return;
		}
		if ($amt3.equalsIgnoreCase(name)) {
			amt3(value);
			return;
		}
		if ($base_cur_amt3.equalsIgnoreCase(name)) {
			base_cur_amt3(value);
			return;
		}
		if ($tax_amt1.equalsIgnoreCase(name)) {
			tax_amt1(value);
			return;
		}
		if ($tax_amt2.equalsIgnoreCase(name)) {
			tax_amt2(value);
			return;
		}
		if ($tax_amt3.equalsIgnoreCase(name)) {
			tax_amt3(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			base_cur_tax_amt2(value);
			return;
		}
		if ($base_cur_tax_amt3.equalsIgnoreCase(name)) {
			base_cur_tax_amt3(value);
			return;
		}
		if ($trd_xrate.equalsIgnoreCase(name)) {
			trd_xrate(value);
			return;
		}
		if ($exc_gain_loss.equalsIgnoreCase(name)) {
			exc_gain_loss(value);
			return;
		}
		if ($cash.equalsIgnoreCase(name)) {
			cash(value);
			return;
		}
		if ($note.equalsIgnoreCase(name)) {
			note(value);
			return;
		}
		if ($xfr.equalsIgnoreCase(name)) {
			xfr(value);
			return;
		}
		if ($setoff.equalsIgnoreCase(name)) {
			setoff(value);
			return;
		}
		if ($sw.equalsIgnoreCase(name)) {
			sw(value);
			return;
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($grp_seq.equalsIgnoreCase(name)) {
			grp_seq(value);
			return;
		}
		if ($rcv_act_peg.equalsIgnoreCase(name)) {
			rcv_act_peg(value);
			return;
		}
		if ($amt1.equalsIgnoreCase(name)) {
			amt1(value);
			return;
		}
		if ($base_cur_amt1.equalsIgnoreCase(name)) {
			base_cur_amt1(value);
			return;
		}
		if ($amt2.equalsIgnoreCase(name)) {
			amt2(value);
			return;
		}
		if ($base_cur_amt2.equalsIgnoreCase(name)) {
			base_cur_amt2(value);
			return;
		}
		if ($amt3.equalsIgnoreCase(name)) {
			amt3(value);
			return;
		}
		if ($base_cur_amt3.equalsIgnoreCase(name)) {
			base_cur_amt3(value);
			return;
		}
		if ($tax_amt1.equalsIgnoreCase(name)) {
			tax_amt1(value);
			return;
		}
		if ($tax_amt2.equalsIgnoreCase(name)) {
			tax_amt2(value);
			return;
		}
		if ($tax_amt3.equalsIgnoreCase(name)) {
			tax_amt3(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			base_cur_tax_amt2(value);
			return;
		}
		if ($base_cur_tax_amt3.equalsIgnoreCase(name)) {
			base_cur_tax_amt3(value);
			return;
		}
		if ($trd_xrate.equalsIgnoreCase(name)) {
			trd_xrate(value);
			return;
		}
		if ($exc_gain_loss.equalsIgnoreCase(name)) {
			exc_gain_loss(value);
			return;
		}
		if ($cash.equalsIgnoreCase(name)) {
			cash(value);
			return;
		}
		if ($note.equalsIgnoreCase(name)) {
			note(value);
			return;
		}
		if ($xfr.equalsIgnoreCase(name)) {
			xfr(value);
			return;
		}
		if ($setoff.equalsIgnoreCase(name)) {
			setoff(value);
			return;
		}
		if ($sw.equalsIgnoreCase(name)) {
			sw(value);
			return;
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($grp_seq.equalsIgnoreCase(name)) {
			grp_seq(value);
			return;
		}
		if ($rcv_act_peg.equalsIgnoreCase(name)) {
			rcv_act_peg(value);
			return;
		}
		if ($amt1.equalsIgnoreCase(name)) {
			amt1(value);
			return;
		}
		if ($base_cur_amt1.equalsIgnoreCase(name)) {
			base_cur_amt1(value);
			return;
		}
		if ($amt2.equalsIgnoreCase(name)) {
			amt2(value);
			return;
		}
		if ($base_cur_amt2.equalsIgnoreCase(name)) {
			base_cur_amt2(value);
			return;
		}
		if ($amt3.equalsIgnoreCase(name)) {
			amt3(value);
			return;
		}
		if ($base_cur_amt3.equalsIgnoreCase(name)) {
			base_cur_amt3(value);
			return;
		}
		if ($tax_amt1.equalsIgnoreCase(name)) {
			tax_amt1(value);
			return;
		}
		if ($tax_amt2.equalsIgnoreCase(name)) {
			tax_amt2(value);
			return;
		}
		if ($tax_amt3.equalsIgnoreCase(name)) {
			tax_amt3(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			base_cur_tax_amt2(value);
			return;
		}
		if ($base_cur_tax_amt3.equalsIgnoreCase(name)) {
			base_cur_tax_amt3(value);
			return;
		}
		if ($trd_xrate.equalsIgnoreCase(name)) {
			trd_xrate(value);
			return;
		}
		if ($exc_gain_loss.equalsIgnoreCase(name)) {
			exc_gain_loss(value);
			return;
		}
		if ($cash.equalsIgnoreCase(name)) {
			cash(value);
			return;
		}
		if ($note.equalsIgnoreCase(name)) {
			note(value);
			return;
		}
		if ($xfr.equalsIgnoreCase(name)) {
			xfr(value);
			return;
		}
		if ($setoff.equalsIgnoreCase(name)) {
			setoff(value);
			return;
		}
		if ($sw.equalsIgnoreCase(name)) {
			sw(value);
			return;
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($grp_seq.equalsIgnoreCase(name)) {
			grp_seq(value);
			return;
		}
		if ($rcv_act_peg.equalsIgnoreCase(name)) {
			rcv_act_peg(value);
			return;
		}
		if ($amt1.equalsIgnoreCase(name)) {
			amt1(value);
			return;
		}
		if ($base_cur_amt1.equalsIgnoreCase(name)) {
			base_cur_amt1(value);
			return;
		}
		if ($amt2.equalsIgnoreCase(name)) {
			amt2(value);
			return;
		}
		if ($base_cur_amt2.equalsIgnoreCase(name)) {
			base_cur_amt2(value);
			return;
		}
		if ($amt3.equalsIgnoreCase(name)) {
			amt3(value);
			return;
		}
		if ($base_cur_amt3.equalsIgnoreCase(name)) {
			base_cur_amt3(value);
			return;
		}
		if ($tax_amt1.equalsIgnoreCase(name)) {
			tax_amt1(value);
			return;
		}
		if ($tax_amt2.equalsIgnoreCase(name)) {
			tax_amt2(value);
			return;
		}
		if ($tax_amt3.equalsIgnoreCase(name)) {
			tax_amt3(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			base_cur_tax_amt2(value);
			return;
		}
		if ($base_cur_tax_amt3.equalsIgnoreCase(name)) {
			base_cur_tax_amt3(value);
			return;
		}
		if ($trd_xrate.equalsIgnoreCase(name)) {
			trd_xrate(value);
			return;
		}
		if ($exc_gain_loss.equalsIgnoreCase(name)) {
			exc_gain_loss(value);
			return;
		}
		if ($cash.equalsIgnoreCase(name)) {
			cash(value);
			return;
		}
		if ($note.equalsIgnoreCase(name)) {
			note(value);
			return;
		}
		if ($xfr.equalsIgnoreCase(name)) {
			xfr(value);
			return;
		}
		if ($setoff.equalsIgnoreCase(name)) {
			setoff(value);
			return;
		}
		if ($sw.equalsIgnoreCase(name)) {
			sw(value);
			return;
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($grp_seq.equalsIgnoreCase(name)) {
			grp_seq(value);
			return;
		}
		if ($rcv_act_peg.equalsIgnoreCase(name)) {
			rcv_act_peg(value);
			return;
		}
		if ($amt1.equalsIgnoreCase(name)) {
			amt1(value);
			return;
		}
		if ($base_cur_amt1.equalsIgnoreCase(name)) {
			base_cur_amt1(value);
			return;
		}
		if ($amt2.equalsIgnoreCase(name)) {
			amt2(value);
			return;
		}
		if ($base_cur_amt2.equalsIgnoreCase(name)) {
			base_cur_amt2(value);
			return;
		}
		if ($amt3.equalsIgnoreCase(name)) {
			amt3(value);
			return;
		}
		if ($base_cur_amt3.equalsIgnoreCase(name)) {
			base_cur_amt3(value);
			return;
		}
		if ($tax_amt1.equalsIgnoreCase(name)) {
			tax_amt1(value);
			return;
		}
		if ($tax_amt2.equalsIgnoreCase(name)) {
			tax_amt2(value);
			return;
		}
		if ($tax_amt3.equalsIgnoreCase(name)) {
			tax_amt3(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			base_cur_tax_amt2(value);
			return;
		}
		if ($base_cur_tax_amt3.equalsIgnoreCase(name)) {
			base_cur_tax_amt3(value);
			return;
		}
		if ($trd_xrate.equalsIgnoreCase(name)) {
			trd_xrate(value);
			return;
		}
		if ($exc_gain_loss.equalsIgnoreCase(name)) {
			exc_gain_loss(value);
			return;
		}
		if ($cash.equalsIgnoreCase(name)) {
			cash(value);
			return;
		}
		if ($note.equalsIgnoreCase(name)) {
			note(value);
			return;
		}
		if ($xfr.equalsIgnoreCase(name)) {
			xfr(value);
			return;
		}
		if ($setoff.equalsIgnoreCase(name)) {
			setoff(value);
			return;
		}
		if ($sw.equalsIgnoreCase(name)) {
			sw(value);
			return;
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

