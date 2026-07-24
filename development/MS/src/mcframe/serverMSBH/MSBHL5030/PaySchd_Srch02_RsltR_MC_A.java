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
 * ブロック"PaySchd_Srch02_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class PaySchd_Srch02_RsltR_MC_A extends MCConstRow {

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public static final String $hdr_peg_no = "hdr_peg_no";
	public static final String $pay_chk = "pay_chk";
	/**
	 * Payment per transaction 都度支払.<p>
	 *
	 */
	public static final String $pay_spot_flg = "pay_spot_flg";
	/**
	 * Not lock payment result 支払実績ロックしない.<p>
	 *
	 */
	public static final String $not_lock_flg = "not_lock_flg";
	/**
	 * Last closing date 前回締年月日.<p>
	 *
	 */
	public static final String $bfr_cl_dt = "bfr_cl_dt";
	/**
	 * Min. closing date 最小締年月日.<p>
	 *
	 */
	public static final String $min_cl_dt = "min_cl_dt";
	/**
	 * Max. closing date 最大締年月日.<p>
	 *
	 */
	public static final String $max_cl_dt = "max_cl_dt";

	public static final String $pay_chk_mng_no = $pay_chk + ".pay_chk_mng_no";
	public static final String $bsppl_cd = $pay_chk + ".bsppl_cd";
	public static final String $bsppl_dpt_cd = $pay_chk + ".bsppl_dpt_cd";
	public static final String $purc_act_no = $pay_chk + ".purc_act_no";
	public static final String $rcpt_iv_mng_no = $pay_chk + ".rcpt_iv_mng_no";
	public static final String $rcpt_iv_no = $pay_chk + ".rcpt_iv_no";
	public static final String $trd_cur_cd = $pay_chk + ".trd_cur_cd";
	public static final String $pay_xrate = $pay_chk + ".pay_xrate";
	public static final String $bsppl_cl_dt = $pay_chk + ".bsppl_cl_dt";
	public static final String $bsppl_cl_day = $pay_chk + ".bsppl_cl_day";
	public static final String $wrk_no = $pay_chk + ".wrk_no";
	public static final String $amt = $pay_chk + ".amt";
	public static final String $last_pay_schd_amt = $pay_chk + ".last_pay_schd_amt";
	public static final String $bfw_amt = $pay_chk + ".bfw_amt";
	public static final String $purc_amt = $pay_chk + ".purc_amt";
	public static final String $purc_ret_amt = $pay_chk + ".purc_ret_amt";
	public static final String $purc_dscnt_amt = $pay_chk + ".purc_dscnt_amt";
	public static final String $sw_to_amt = $pay_chk + ".sw_to_amt";
	public static final String $tax_amt = $pay_chk + ".tax_amt";
	public static final String $account_amt = $pay_chk + ".account_amt";
	public static final String $cash_amt = $pay_chk + ".cash_amt";
	public static final String $note_amt = $pay_chk + ".note_amt";
	public static final String $setoff_amt = $pay_chk + ".setoff_amt";
	public static final String $setoff_tax_amt = $pay_chk + ".setoff_tax_amt";
	public static final String $schd_pay_amt = $pay_chk + ".schd_pay_amt";
	public static final String $sw_amt = $pay_chk + ".sw_amt";
	public static final String $adv_pay_amt = $pay_chk + ".adv_pay_amt";
	public static final String $adv_pay_setoff_amt = $pay_chk + ".adv_pay_setoff_amt";
	public static final String $adv_pay_setoff_tax_amt = $pay_chk + ".adv_pay_setoff_tax_amt";
	public static final String $adv_pay_bal = $pay_chk + ".adv_pay_bal";

	public static final MCMeta hdr_peg_no_META = createCommonMeta($hdr_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta pay_chk_META = createInnerRowMeta($pay_chk, mcframe.serverMS.dbc.MST_PAY_CHK_R.class);
	public static final MCMeta pay_spot_flg_META = createCommonMeta($pay_spot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_lock_flg_META = createCommonMeta($not_lock_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bfr_cl_dt_META = createCommonMeta($bfr_cl_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta min_cl_dt_META = createCommonMeta($min_cl_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta max_cl_dt_META = createCommonMeta($max_cl_dt, mcframe.commonMA.meta.MA_META.DT);

	protected static final ConstMetaList<PaySchd_Srch02_RsltR> constMetas = new ConstMetaList<PaySchd_Srch02_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			hdr_peg_no_META,
			pay_chk_META,
			pay_spot_flg_META,
			not_lock_flg_META,
			bfr_cl_dt_META,
			min_cl_dt_META,
			max_cl_dt_META
		},
		new String[][]{
			{
				"pay_chk_mng_no",
				"bsppl_cd",
				"bsppl_dpt_cd",
				"purc_act_no",
				"rcpt_iv_mng_no",
				"rcpt_iv_no",
				"trd_cur_cd",
				"pay_xrate",
				"bsppl_cl_dt",
				"bsppl_cl_day",
				"wrk_no",
				"amt",
				"last_pay_schd_amt",
				"bfw_amt",
				"purc_amt",
				"purc_ret_amt",
				"purc_dscnt_amt",
				"sw_to_amt",
				"tax_amt",
				"account_amt",
				"cash_amt",
				"note_amt",
				"setoff_amt",
				"setoff_tax_amt",
				"schd_pay_amt",
				"sw_amt",
				"adv_pay_amt",
				"adv_pay_setoff_amt",
				"adv_pay_setoff_tax_amt",
				"adv_pay_bal"
			},
			{
				$pay_chk_mng_no,
				$bsppl_cd,
				$bsppl_dpt_cd,
				$purc_act_no,
				$rcpt_iv_mng_no,
				$rcpt_iv_no,
				$trd_cur_cd,
				$pay_xrate,
				$bsppl_cl_dt,
				$bsppl_cl_day,
				$wrk_no,
				$amt,
				$last_pay_schd_amt,
				$bfw_amt,
				$purc_amt,
				$purc_ret_amt,
				$purc_dscnt_amt,
				$sw_to_amt,
				$tax_amt,
				$account_amt,
				$cash_amt,
				$note_amt,
				$setoff_amt,
				$setoff_tax_amt,
				$schd_pay_amt,
				$sw_amt,
				$adv_pay_amt,
				$adv_pay_setoff_amt,
				$adv_pay_setoff_tax_amt,
				$adv_pay_bal
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
	protected PaySchd_Srch02_RsltR_MC_A(ConstMetaList<? extends PaySchd_Srch02_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PaySchd_Srch02_RsltR clone() {
		return (PaySchd_Srch02_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PaySchd_Srch02_RsltR createInstance() {
		return (PaySchd_Srch02_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PaySchd_Srch02_RsltR getValues(String... names) {
		return (PaySchd_Srch02_RsltR) super.getValues(names);
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


	public mcframe.serverMS.dbc.MST_PAY_CHK_R pay_chk(){
		return (mcframe.serverMS.dbc.MST_PAY_CHK_R) getConstInnerRow(offset + 1, $pay_chk);
	}
	
	public void pay_chk(mcframe.serverMS.dbc.MST_PAY_CHK_R row){
		setConstInnerRow(offset + 1, $pay_chk, row);
	}


	/**
	 * Payment per transaction 都度支払.<p>
	 *
	 */
	public boolean pay_spot_flg() {
		return getConstBoolean(offset + 2, $pay_spot_flg);
	}

	/**
	 * Payment per transaction 都度支払.<p>
	 *
	 */
	public void pay_spot_flg(boolean value) {
		setConstBoolean(offset + 2, $pay_spot_flg, value);
	}


	/**
	 * Not lock payment result 支払実績ロックしない.<p>
	 *
	 */
	public boolean not_lock_flg() {
		return getConstBoolean(offset + 3, $not_lock_flg);
	}

	/**
	 * Not lock payment result 支払実績ロックしない.<p>
	 *
	 */
	public void not_lock_flg(boolean value) {
		setConstBoolean(offset + 3, $not_lock_flg, value);
	}


	/**
	 * Last closing date 前回締年月日.<p>
	 *
	 */
	public MCDate bfr_cl_dt() {
		return getConstDate(offset + 4, $bfr_cl_dt);
	}

	/**
	 * Last closing date 前回締年月日.<p>
	 *
	 */
	public void bfr_cl_dt(MCDate value) {
		setConstDate(offset + 4, $bfr_cl_dt, value);
	}


	/**
	 * Min. closing date 最小締年月日.<p>
	 *
	 */
	public MCDate min_cl_dt() {
		return getConstDate(offset + 5, $min_cl_dt);
	}

	/**
	 * Min. closing date 最小締年月日.<p>
	 *
	 */
	public void min_cl_dt(MCDate value) {
		setConstDate(offset + 5, $min_cl_dt, value);
	}


	/**
	 * Max. closing date 最大締年月日.<p>
	 *
	 */
	public MCDate max_cl_dt() {
		return getConstDate(offset + 6, $max_cl_dt);
	}

	/**
	 * Max. closing date 最大締年月日.<p>
	 *
	 */
	public void max_cl_dt(MCDate value) {
		setConstDate(offset + 6, $max_cl_dt, value);
	}


	public MCNumber getNumber(String name) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($bfr_cl_dt.equalsIgnoreCase(name)) {
			return bfr_cl_dt();
		}
		if ($min_cl_dt.equalsIgnoreCase(name)) {
			return min_cl_dt();
		}
		if ($max_cl_dt.equalsIgnoreCase(name)) {
			return max_cl_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			return pay_spot_flg();
		}
		if ($not_lock_flg.equalsIgnoreCase(name)) {
			return not_lock_flg();
		}
		return super.getBoolean(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($bfr_cl_dt.equalsIgnoreCase(name)) {
			return bfr_cl_dt();
		}
		if ($min_cl_dt.equalsIgnoreCase(name)) {
			return min_cl_dt();
		}
		if ($max_cl_dt.equalsIgnoreCase(name)) {
			return max_cl_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			return pay_spot_flg();
		}
		if ($not_lock_flg.equalsIgnoreCase(name)) {
			return not_lock_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setNumber(String name, MCNumber value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($bfr_cl_dt.equalsIgnoreCase(name)) {
			bfr_cl_dt(value);
			return;
		}
		if ($min_cl_dt.equalsIgnoreCase(name)) {
			min_cl_dt(value);
			return;
		}
		if ($max_cl_dt.equalsIgnoreCase(name)) {
			max_cl_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			pay_spot_flg(value);
			return;
		}
		if ($not_lock_flg.equalsIgnoreCase(name)) {
			not_lock_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($bfr_cl_dt.equalsIgnoreCase(name)) {
			bfr_cl_dt(value);
			return;
		}
		if ($min_cl_dt.equalsIgnoreCase(name)) {
			min_cl_dt(value);
			return;
		}
		if ($max_cl_dt.equalsIgnoreCase(name)) {
			max_cl_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			pay_spot_flg(value);
			return;
		}
		if ($not_lock_flg.equalsIgnoreCase(name)) {
			not_lock_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($pay_chk.equalsIgnoreCase(name)) {
			return pay_chk();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($pay_chk.equalsIgnoreCase(name)) {
			pay_chk(
				((MCContainerMeta) pay_chk_META).castInnerRow(mcframe.serverMS.dbc.MST_PAY_CHK_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Payment collation management No. 支払照合管理ＮＯ.<p>
	 *
	 */
	public String pay_chk_mng_no() {
		return pay_chk().pay_chk_mng_no();
	}

	/**
	 * Payment collation management No. 支払照合管理ＮＯ.<p>
	 *
	 */
	public void pay_chk_mng_no(String value) {
		pay_chk().pay_chk_mng_no(value);
	}

	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public String bsppl_cd() {
		return pay_chk().bsppl_cd();
	}

	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public void bsppl_cd(String value) {
		pay_chk().bsppl_cd(value);
	}

	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public String bsppl_dpt_cd() {
		return pay_chk().bsppl_dpt_cd();
	}

	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public void bsppl_dpt_cd(String value) {
		pay_chk().bsppl_dpt_cd(value);
	}

	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public String purc_act_no() {
		return pay_chk().purc_act_no();
	}

	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public void purc_act_no(String value) {
		pay_chk().purc_act_no(value);
	}

	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public String rcpt_iv_mng_no() {
		return pay_chk().rcpt_iv_mng_no();
	}

	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public void rcpt_iv_mng_no(String value) {
		pay_chk().rcpt_iv_mng_no(value);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String rcpt_iv_no() {
		return pay_chk().rcpt_iv_no();
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void rcpt_iv_no(String value) {
		pay_chk().rcpt_iv_no(value);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return pay_chk().trd_cur_cd();
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		pay_chk().trd_cur_cd(value);
	}

	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public MCNumber pay_xrate() {
		return pay_chk().pay_xrate();
	}

	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public void pay_xrate(MCNumber value) {
		pay_chk().pay_xrate(value);
	}

	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public void pay_xrate(int value) {
		pay_chk().pay_xrate(value);
	}

	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public void pay_xrate(long value) {
		pay_chk().pay_xrate(value);
	}

	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public void pay_xrate(float value) {
		pay_chk().pay_xrate(value);
	}

	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public void pay_xrate(double value) {
		pay_chk().pay_xrate(value);
	}

	/**
	 * Scheduled payee closing year, month, and date 支払予定管理先締年月日.<p>
	 *
	 */
	public MCDate bsppl_cl_dt() {
		return pay_chk().bsppl_cl_dt();
	}

	/**
	 * Scheduled payee closing year, month, and date 支払予定管理先締年月日.<p>
	 *
	 */
	public void bsppl_cl_dt(MCDate value) {
		pay_chk().bsppl_cl_dt(value);
	}

	/**
	 * Scheduled payee closing date 支払予定管理先締日.<p>
	 *
	 */
	public MCNumber bsppl_cl_day() {
		return pay_chk().bsppl_cl_day();
	}

	/**
	 * Scheduled payee closing date 支払予定管理先締日.<p>
	 *
	 */
	public void bsppl_cl_day(MCNumber value) {
		pay_chk().bsppl_cl_day(value);
	}

	/**
	 * Scheduled payee closing date 支払予定管理先締日.<p>
	 *
	 */
	public void bsppl_cl_day(int value) {
		pay_chk().bsppl_cl_day(value);
	}

	/**
	 * Scheduled payee closing date 支払予定管理先締日.<p>
	 *
	 */
	public void bsppl_cl_day(long value) {
		pay_chk().bsppl_cl_day(value);
	}

	/**
	 * Scheduled payee closing date 支払予定管理先締日.<p>
	 *
	 */
	public void bsppl_cl_day(float value) {
		pay_chk().bsppl_cl_day(value);
	}

	/**
	 * Scheduled payee closing date 支払予定管理先締日.<p>
	 *
	 */
	public void bsppl_cl_day(double value) {
		pay_chk().bsppl_cl_day(value);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return pay_chk().wrk_no();
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		pay_chk().wrk_no(value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber amt() {
		return pay_chk().amt();
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt(MCNumber value) {
		pay_chk().amt(value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt(int value) {
		pay_chk().amt(value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt(long value) {
		pay_chk().amt(value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt(float value) {
		pay_chk().amt(value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt(double value) {
		pay_chk().amt(value);
	}

	/**
	 * Last payment schedule amount 前回支払予定額.<p>
	 *
	 */
	public MCNumber last_pay_schd_amt() {
		return pay_chk().last_pay_schd_amt();
	}

	/**
	 * Last payment schedule amount 前回支払予定額.<p>
	 *
	 */
	public void last_pay_schd_amt(MCNumber value) {
		pay_chk().last_pay_schd_amt(value);
	}

	/**
	 * Last payment schedule amount 前回支払予定額.<p>
	 *
	 */
	public void last_pay_schd_amt(int value) {
		pay_chk().last_pay_schd_amt(value);
	}

	/**
	 * Last payment schedule amount 前回支払予定額.<p>
	 *
	 */
	public void last_pay_schd_amt(long value) {
		pay_chk().last_pay_schd_amt(value);
	}

	/**
	 * Last payment schedule amount 前回支払予定額.<p>
	 *
	 */
	public void last_pay_schd_amt(float value) {
		pay_chk().last_pay_schd_amt(value);
	}

	/**
	 * Last payment schedule amount 前回支払予定額.<p>
	 *
	 */
	public void last_pay_schd_amt(double value) {
		pay_chk().last_pay_schd_amt(value);
	}

	/**
	 * Current carry-over amount 今回繰越額.<p>
	 *
	 */
	public MCNumber bfw_amt() {
		return pay_chk().bfw_amt();
	}

	/**
	 * Current carry-over amount 今回繰越額.<p>
	 *
	 */
	public void bfw_amt(MCNumber value) {
		pay_chk().bfw_amt(value);
	}

	/**
	 * Current carry-over amount 今回繰越額.<p>
	 *
	 */
	public void bfw_amt(int value) {
		pay_chk().bfw_amt(value);
	}

	/**
	 * Current carry-over amount 今回繰越額.<p>
	 *
	 */
	public void bfw_amt(long value) {
		pay_chk().bfw_amt(value);
	}

	/**
	 * Current carry-over amount 今回繰越額.<p>
	 *
	 */
	public void bfw_amt(float value) {
		pay_chk().bfw_amt(value);
	}

	/**
	 * Current carry-over amount 今回繰越額.<p>
	 *
	 */
	public void bfw_amt(double value) {
		pay_chk().bfw_amt(value);
	}

	/**
	 * Current purchase amount 今回仕入額.<p>
	 *
	 */
	public MCNumber purc_amt() {
		return pay_chk().purc_amt();
	}

	/**
	 * Current purchase amount 今回仕入額.<p>
	 *
	 */
	public void purc_amt(MCNumber value) {
		pay_chk().purc_amt(value);
	}

	/**
	 * Current purchase amount 今回仕入額.<p>
	 *
	 */
	public void purc_amt(int value) {
		pay_chk().purc_amt(value);
	}

	/**
	 * Current purchase amount 今回仕入額.<p>
	 *
	 */
	public void purc_amt(long value) {
		pay_chk().purc_amt(value);
	}

	/**
	 * Current purchase amount 今回仕入額.<p>
	 *
	 */
	public void purc_amt(float value) {
		pay_chk().purc_amt(value);
	}

	/**
	 * Current purchase amount 今回仕入額.<p>
	 *
	 */
	public void purc_amt(double value) {
		pay_chk().purc_amt(value);
	}

	/**
	 * Current purchase return amount 今回仕入返品額.<p>
	 *
	 */
	public MCNumber purc_ret_amt() {
		return pay_chk().purc_ret_amt();
	}

	/**
	 * Current purchase return amount 今回仕入返品額.<p>
	 *
	 */
	public void purc_ret_amt(MCNumber value) {
		pay_chk().purc_ret_amt(value);
	}

	/**
	 * Current purchase return amount 今回仕入返品額.<p>
	 *
	 */
	public void purc_ret_amt(int value) {
		pay_chk().purc_ret_amt(value);
	}

	/**
	 * Current purchase return amount 今回仕入返品額.<p>
	 *
	 */
	public void purc_ret_amt(long value) {
		pay_chk().purc_ret_amt(value);
	}

	/**
	 * Current purchase return amount 今回仕入返品額.<p>
	 *
	 */
	public void purc_ret_amt(float value) {
		pay_chk().purc_ret_amt(value);
	}

	/**
	 * Current purchase return amount 今回仕入返品額.<p>
	 *
	 */
	public void purc_ret_amt(double value) {
		pay_chk().purc_ret_amt(value);
	}

	/**
	 * Current purchase discount amount 今回仕入値引額.<p>
	 *
	 */
	public MCNumber purc_dscnt_amt() {
		return pay_chk().purc_dscnt_amt();
	}

	/**
	 * Current purchase discount amount 今回仕入値引額.<p>
	 *
	 */
	public void purc_dscnt_amt(MCNumber value) {
		pay_chk().purc_dscnt_amt(value);
	}

	/**
	 * Current purchase discount amount 今回仕入値引額.<p>
	 *
	 */
	public void purc_dscnt_amt(int value) {
		pay_chk().purc_dscnt_amt(value);
	}

	/**
	 * Current purchase discount amount 今回仕入値引額.<p>
	 *
	 */
	public void purc_dscnt_amt(long value) {
		pay_chk().purc_dscnt_amt(value);
	}

	/**
	 * Current purchase discount amount 今回仕入値引額.<p>
	 *
	 */
	public void purc_dscnt_amt(float value) {
		pay_chk().purc_dscnt_amt(value);
	}

	/**
	 * Current purchase discount amount 今回仕入値引額.<p>
	 *
	 */
	public void purc_dscnt_amt(double value) {
		pay_chk().purc_dscnt_amt(value);
	}

	/**
	 * Current transfer amount (Transfer destination) 今回振替額（振替先）.<p>
	 *
	 */
	public MCNumber sw_to_amt() {
		return pay_chk().sw_to_amt();
	}

	/**
	 * Current transfer amount (Transfer destination) 今回振替額（振替先）.<p>
	 *
	 */
	public void sw_to_amt(MCNumber value) {
		pay_chk().sw_to_amt(value);
	}

	/**
	 * Current transfer amount (Transfer destination) 今回振替額（振替先）.<p>
	 *
	 */
	public void sw_to_amt(int value) {
		pay_chk().sw_to_amt(value);
	}

	/**
	 * Current transfer amount (Transfer destination) 今回振替額（振替先）.<p>
	 *
	 */
	public void sw_to_amt(long value) {
		pay_chk().sw_to_amt(value);
	}

	/**
	 * Current transfer amount (Transfer destination) 今回振替額（振替先）.<p>
	 *
	 */
	public void sw_to_amt(float value) {
		pay_chk().sw_to_amt(value);
	}

	/**
	 * Current transfer amount (Transfer destination) 今回振替額（振替先）.<p>
	 *
	 */
	public void sw_to_amt(double value) {
		pay_chk().sw_to_amt(value);
	}

	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public MCNumber tax_amt() {
		return pay_chk().tax_amt();
	}

	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public void tax_amt(MCNumber value) {
		pay_chk().tax_amt(value);
	}

	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public void tax_amt(int value) {
		pay_chk().tax_amt(value);
	}

	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public void tax_amt(long value) {
		pay_chk().tax_amt(value);
	}

	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public void tax_amt(float value) {
		pay_chk().tax_amt(value);
	}

	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public void tax_amt(double value) {
		pay_chk().tax_amt(value);
	}

	/**
	 * Current payment amount from deposit 今回預金支払額.<p>
	 *
	 */
	public MCNumber account_amt() {
		return pay_chk().account_amt();
	}

	/**
	 * Current payment amount from deposit 今回預金支払額.<p>
	 *
	 */
	public void account_amt(MCNumber value) {
		pay_chk().account_amt(value);
	}

	/**
	 * Current payment amount from deposit 今回預金支払額.<p>
	 *
	 */
	public void account_amt(int value) {
		pay_chk().account_amt(value);
	}

	/**
	 * Current payment amount from deposit 今回預金支払額.<p>
	 *
	 */
	public void account_amt(long value) {
		pay_chk().account_amt(value);
	}

	/**
	 * Current payment amount from deposit 今回預金支払額.<p>
	 *
	 */
	public void account_amt(float value) {
		pay_chk().account_amt(value);
	}

	/**
	 * Current payment amount from deposit 今回預金支払額.<p>
	 *
	 */
	public void account_amt(double value) {
		pay_chk().account_amt(value);
	}

	/**
	 * Current cash payment amount 今回現金支払額.<p>
	 *
	 */
	public MCNumber cash_amt() {
		return pay_chk().cash_amt();
	}

	/**
	 * Current cash payment amount 今回現金支払額.<p>
	 *
	 */
	public void cash_amt(MCNumber value) {
		pay_chk().cash_amt(value);
	}

	/**
	 * Current cash payment amount 今回現金支払額.<p>
	 *
	 */
	public void cash_amt(int value) {
		pay_chk().cash_amt(value);
	}

	/**
	 * Current cash payment amount 今回現金支払額.<p>
	 *
	 */
	public void cash_amt(long value) {
		pay_chk().cash_amt(value);
	}

	/**
	 * Current cash payment amount 今回現金支払額.<p>
	 *
	 */
	public void cash_amt(float value) {
		pay_chk().cash_amt(value);
	}

	/**
	 * Current cash payment amount 今回現金支払額.<p>
	 *
	 */
	public void cash_amt(double value) {
		pay_chk().cash_amt(value);
	}

	/**
	 * Current notes payment amount 今回手形支払額.<p>
	 *
	 */
	public MCNumber note_amt() {
		return pay_chk().note_amt();
	}

	/**
	 * Current notes payment amount 今回手形支払額.<p>
	 *
	 */
	public void note_amt(MCNumber value) {
		pay_chk().note_amt(value);
	}

	/**
	 * Current notes payment amount 今回手形支払額.<p>
	 *
	 */
	public void note_amt(int value) {
		pay_chk().note_amt(value);
	}

	/**
	 * Current notes payment amount 今回手形支払額.<p>
	 *
	 */
	public void note_amt(long value) {
		pay_chk().note_amt(value);
	}

	/**
	 * Current notes payment amount 今回手形支払額.<p>
	 *
	 */
	public void note_amt(float value) {
		pay_chk().note_amt(value);
	}

	/**
	 * Current notes payment amount 今回手形支払額.<p>
	 *
	 */
	public void note_amt(double value) {
		pay_chk().note_amt(value);
	}

	/**
	 * Current offset payment amount 今回相殺支払額.<p>
	 *
	 */
	public MCNumber setoff_amt() {
		return pay_chk().setoff_amt();
	}

	/**
	 * Current offset payment amount 今回相殺支払額.<p>
	 *
	 */
	public void setoff_amt(MCNumber value) {
		pay_chk().setoff_amt(value);
	}

	/**
	 * Current offset payment amount 今回相殺支払額.<p>
	 *
	 */
	public void setoff_amt(int value) {
		pay_chk().setoff_amt(value);
	}

	/**
	 * Current offset payment amount 今回相殺支払額.<p>
	 *
	 */
	public void setoff_amt(long value) {
		pay_chk().setoff_amt(value);
	}

	/**
	 * Current offset payment amount 今回相殺支払額.<p>
	 *
	 */
	public void setoff_amt(float value) {
		pay_chk().setoff_amt(value);
	}

	/**
	 * Current offset payment amount 今回相殺支払額.<p>
	 *
	 */
	public void setoff_amt(double value) {
		pay_chk().setoff_amt(value);
	}

	/**
	 * Current offset payment tax amount 今回相殺支払税額.<p>
	 *
	 */
	public MCNumber setoff_tax_amt() {
		return pay_chk().setoff_tax_amt();
	}

	/**
	 * Current offset payment tax amount 今回相殺支払税額.<p>
	 *
	 */
	public void setoff_tax_amt(MCNumber value) {
		pay_chk().setoff_tax_amt(value);
	}

	/**
	 * Current offset payment tax amount 今回相殺支払税額.<p>
	 *
	 */
	public void setoff_tax_amt(int value) {
		pay_chk().setoff_tax_amt(value);
	}

	/**
	 * Current offset payment tax amount 今回相殺支払税額.<p>
	 *
	 */
	public void setoff_tax_amt(long value) {
		pay_chk().setoff_tax_amt(value);
	}

	/**
	 * Current offset payment tax amount 今回相殺支払税額.<p>
	 *
	 */
	public void setoff_tax_amt(float value) {
		pay_chk().setoff_tax_amt(value);
	}

	/**
	 * Current offset payment tax amount 今回相殺支払税額.<p>
	 *
	 */
	public void setoff_tax_amt(double value) {
		pay_chk().setoff_tax_amt(value);
	}

	/**
	 * Current scheduled payment amount 今回支払予定額.<p>
	 *
	 */
	public MCNumber schd_pay_amt() {
		return pay_chk().schd_pay_amt();
	}

	/**
	 * Current scheduled payment amount 今回支払予定額.<p>
	 *
	 */
	public void schd_pay_amt(MCNumber value) {
		pay_chk().schd_pay_amt(value);
	}

	/**
	 * Current scheduled payment amount 今回支払予定額.<p>
	 *
	 */
	public void schd_pay_amt(int value) {
		pay_chk().schd_pay_amt(value);
	}

	/**
	 * Current scheduled payment amount 今回支払予定額.<p>
	 *
	 */
	public void schd_pay_amt(long value) {
		pay_chk().schd_pay_amt(value);
	}

	/**
	 * Current scheduled payment amount 今回支払予定額.<p>
	 *
	 */
	public void schd_pay_amt(float value) {
		pay_chk().schd_pay_amt(value);
	}

	/**
	 * Current scheduled payment amount 今回支払予定額.<p>
	 *
	 */
	public void schd_pay_amt(double value) {
		pay_chk().schd_pay_amt(value);
	}

	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public MCNumber sw_amt() {
		return pay_chk().sw_amt();
	}

	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public void sw_amt(MCNumber value) {
		pay_chk().sw_amt(value);
	}

	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public void sw_amt(int value) {
		pay_chk().sw_amt(value);
	}

	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public void sw_amt(long value) {
		pay_chk().sw_amt(value);
	}

	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public void sw_amt(float value) {
		pay_chk().sw_amt(value);
	}

	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public void sw_amt(double value) {
		pay_chk().sw_amt(value);
	}

	/**
	 * Advance payment amount 前渡金支払額.<p>
	 *
	 */
	public MCNumber adv_pay_amt() {
		return pay_chk().adv_pay_amt();
	}

	/**
	 * Advance payment amount 前渡金支払額.<p>
	 *
	 */
	public void adv_pay_amt(MCNumber value) {
		pay_chk().adv_pay_amt(value);
	}

	/**
	 * Advance payment amount 前渡金支払額.<p>
	 *
	 */
	public void adv_pay_amt(int value) {
		pay_chk().adv_pay_amt(value);
	}

	/**
	 * Advance payment amount 前渡金支払額.<p>
	 *
	 */
	public void adv_pay_amt(long value) {
		pay_chk().adv_pay_amt(value);
	}

	/**
	 * Advance payment amount 前渡金支払額.<p>
	 *
	 */
	public void adv_pay_amt(float value) {
		pay_chk().adv_pay_amt(value);
	}

	/**
	 * Advance payment amount 前渡金支払額.<p>
	 *
	 */
	public void adv_pay_amt(double value) {
		pay_chk().adv_pay_amt(value);
	}

	/**
	 * Advance payment offset amount 前渡金相殺額.<p>
	 *
	 */
	public MCNumber adv_pay_setoff_amt() {
		return pay_chk().adv_pay_setoff_amt();
	}

	/**
	 * Advance payment offset amount 前渡金相殺額.<p>
	 *
	 */
	public void adv_pay_setoff_amt(MCNumber value) {
		pay_chk().adv_pay_setoff_amt(value);
	}

	/**
	 * Advance payment offset amount 前渡金相殺額.<p>
	 *
	 */
	public void adv_pay_setoff_amt(int value) {
		pay_chk().adv_pay_setoff_amt(value);
	}

	/**
	 * Advance payment offset amount 前渡金相殺額.<p>
	 *
	 */
	public void adv_pay_setoff_amt(long value) {
		pay_chk().adv_pay_setoff_amt(value);
	}

	/**
	 * Advance payment offset amount 前渡金相殺額.<p>
	 *
	 */
	public void adv_pay_setoff_amt(float value) {
		pay_chk().adv_pay_setoff_amt(value);
	}

	/**
	 * Advance payment offset amount 前渡金相殺額.<p>
	 *
	 */
	public void adv_pay_setoff_amt(double value) {
		pay_chk().adv_pay_setoff_amt(value);
	}

	/**
	 * Advance payment offset tax amount 前渡金相殺税額.<p>
	 *
	 */
	public MCNumber adv_pay_setoff_tax_amt() {
		return pay_chk().adv_pay_setoff_tax_amt();
	}

	/**
	 * Advance payment offset tax amount 前渡金相殺税額.<p>
	 *
	 */
	public void adv_pay_setoff_tax_amt(MCNumber value) {
		pay_chk().adv_pay_setoff_tax_amt(value);
	}

	/**
	 * Advance payment offset tax amount 前渡金相殺税額.<p>
	 *
	 */
	public void adv_pay_setoff_tax_amt(int value) {
		pay_chk().adv_pay_setoff_tax_amt(value);
	}

	/**
	 * Advance payment offset tax amount 前渡金相殺税額.<p>
	 *
	 */
	public void adv_pay_setoff_tax_amt(long value) {
		pay_chk().adv_pay_setoff_tax_amt(value);
	}

	/**
	 * Advance payment offset tax amount 前渡金相殺税額.<p>
	 *
	 */
	public void adv_pay_setoff_tax_amt(float value) {
		pay_chk().adv_pay_setoff_tax_amt(value);
	}

	/**
	 * Advance payment offset tax amount 前渡金相殺税額.<p>
	 *
	 */
	public void adv_pay_setoff_tax_amt(double value) {
		pay_chk().adv_pay_setoff_tax_amt(value);
	}

	/**
	 * Advance payment balance 前渡金残高.<p>
	 *
	 */
	public MCNumber adv_pay_bal() {
		return pay_chk().adv_pay_bal();
	}

	/**
	 * Advance payment balance 前渡金残高.<p>
	 *
	 */
	public void adv_pay_bal(MCNumber value) {
		pay_chk().adv_pay_bal(value);
	}

	/**
	 * Advance payment balance 前渡金残高.<p>
	 *
	 */
	public void adv_pay_bal(int value) {
		pay_chk().adv_pay_bal(value);
	}

	/**
	 * Advance payment balance 前渡金残高.<p>
	 *
	 */
	public void adv_pay_bal(long value) {
		pay_chk().adv_pay_bal(value);
	}

	/**
	 * Advance payment balance 前渡金残高.<p>
	 *
	 */
	public void adv_pay_bal(float value) {
		pay_chk().adv_pay_bal(value);
	}

	/**
	 * Advance payment balance 前渡金残高.<p>
	 *
	 */
	public void adv_pay_bal(double value) {
		pay_chk().adv_pay_bal(value);
	}

}

