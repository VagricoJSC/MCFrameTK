package mcframe.serverMSBH.MSBHL0120;

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
 * ブロック"Srch01_Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_HdrR_MC_A extends MCConstRow {

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public static final String $cur_cd = "cur_cd";
	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public static final String $amt_dec_place = "amt_dec_place";
	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public static final String $upri_dec_place = "upri_dec_place";
	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public static final String $base_cur_cd = "base_cur_cd";
	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public static final String $base_cur_nm = "base_cur_nm";
	/**
	 * Balance of previous month 前月末残高.<p>
	 *
	 */
	public static final String $init_bal = "init_bal";
	/**
	 * Purchase amount 仕入額.<p>
	 *
	 */
	public static final String $purc_amt = "purc_amt";
	/**
	 * Return amount 返品額.<p>
	 *
	 */
	public static final String $ret_amt = "ret_amt";
	/**
	 * Discount markup amount 値引値増額.<p>
	 *
	 */
	public static final String $dscnt_amt = "dscnt_amt";
	/**
	 * Transfer amount (Transfer destination) 振替額（振替先）.<p>
	 *
	 */
	public static final String $sw_to_amt = "sw_to_amt";
	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public static final String $tax_amt = "tax_amt";
	/**
	 * Cash payment amount 現金支払額.<p>
	 *
	 */
	public static final String $cash_amt = "cash_amt";
	/**
	 * Note payment amount 手形支払額.<p>
	 *
	 */
	public static final String $note_amt = "note_amt";
	/**
	 * Deposit payment amount 預金支払額.<p>
	 *
	 */
	public static final String $account_amt = "account_amt";
	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public static final String $setoff_amt = "setoff_amt";
	/**
	 * Transfer amount 振替額.<p>
	 *
	 */
	public static final String $sw_amt = "sw_amt";
	/**
	 * Balance of current month 当月末残高.<p>
	 *
	 */
	public static final String $end_bal = "end_bal";
	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public static final String $exc_gain_loss = "exc_gain_loss";


	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta amt_dec_place_META = createCommonMeta($amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta upri_dec_place_META = createCommonMeta($upri_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_cur_cd_META = createCommonMeta($base_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta base_cur_nm_META = createCommonMeta($base_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta init_bal_META = createCommonMeta($init_bal, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_amt_META = createCommonMeta($purc_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ret_amt_META = createCommonMeta($ret_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta dscnt_amt_META = createCommonMeta($dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sw_to_amt_META = createCommonMeta($sw_to_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_amt_META = createCommonMeta($tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta cash_amt_META = createCommonMeta($cash_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta note_amt_META = createCommonMeta($note_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta account_amt_META = createCommonMeta($account_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta setoff_amt_META = createCommonMeta($setoff_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sw_amt_META = createCommonMeta($sw_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta end_bal_META = createCommonMeta($end_bal, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta exc_gain_loss_META = createCommonMeta($exc_gain_loss, mcframe.commonMA.meta.MA_META.MONEY);

	protected static final ConstMetaList<Srch01_HdrR> constMetas = new ConstMetaList<Srch01_HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			cur_cd_META,
			amt_dec_place_META,
			upri_dec_place_META,
			base_cur_cd_META,
			base_cur_nm_META,
			init_bal_META,
			purc_amt_META,
			ret_amt_META,
			dscnt_amt_META,
			sw_to_amt_META,
			tax_amt_META,
			cash_amt_META,
			note_amt_META,
			account_amt_META,
			setoff_amt_META,
			sw_amt_META,
			end_bal_META,
			exc_gain_loss_META
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
	protected Srch01_HdrR_MC_A(ConstMetaList<? extends Srch01_HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_HdrR clone() {
		return (Srch01_HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_HdrR createInstance() {
		return (Srch01_HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_HdrR getValues(String... names) {
		return (Srch01_HdrR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 0, $cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 0, $cur_cd, value);
	}


	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber amt_dec_place() {
		return getConstNumber(offset + 1, $amt_dec_place);
	}

	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(MCNumber value) {
		setConstNumber(offset + 1, $amt_dec_place, value);
	}

	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(int value) {
		setConstNumber(offset + 1, $amt_dec_place, value);
	}

	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(long value) {
		setConstNumber(offset + 1, $amt_dec_place, value);
	}

	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(float value) {
		setConstNumber(offset + 1, $amt_dec_place, value);
	}

	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(double value) {
		setConstNumber(offset + 1, $amt_dec_place, value);
	}


	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public MCNumber upri_dec_place() {
		return getConstNumber(offset + 2, $upri_dec_place);
	}

	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(MCNumber value) {
		setConstNumber(offset + 2, $upri_dec_place, value);
	}

	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(int value) {
		setConstNumber(offset + 2, $upri_dec_place, value);
	}

	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(long value) {
		setConstNumber(offset + 2, $upri_dec_place, value);
	}

	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(float value) {
		setConstNumber(offset + 2, $upri_dec_place, value);
	}

	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(double value) {
		setConstNumber(offset + 2, $upri_dec_place, value);
	}


	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public String base_cur_cd() {
		return getConstString(offset + 3, $base_cur_cd);
	}

	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public void base_cur_cd(String value) {
		setConstString(offset + 3, $base_cur_cd, value);
	}


	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public String base_cur_nm() {
		return getConstString(offset + 4, $base_cur_nm);
	}

	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public void base_cur_nm(String value) {
		setConstString(offset + 4, $base_cur_nm, value);
	}


	/**
	 * Balance of previous month 前月末残高.<p>
	 *
	 */
	public MCNumber init_bal() {
		return getConstNumber(offset + 5, $init_bal);
	}

	/**
	 * Balance of previous month 前月末残高.<p>
	 *
	 */
	public void init_bal(MCNumber value) {
		setConstNumber(offset + 5, $init_bal, value);
	}

	/**
	 * Balance of previous month 前月末残高.<p>
	 *
	 */
	public void init_bal(int value) {
		setConstNumber(offset + 5, $init_bal, value);
	}

	/**
	 * Balance of previous month 前月末残高.<p>
	 *
	 */
	public void init_bal(long value) {
		setConstNumber(offset + 5, $init_bal, value);
	}

	/**
	 * Balance of previous month 前月末残高.<p>
	 *
	 */
	public void init_bal(float value) {
		setConstNumber(offset + 5, $init_bal, value);
	}

	/**
	 * Balance of previous month 前月末残高.<p>
	 *
	 */
	public void init_bal(double value) {
		setConstNumber(offset + 5, $init_bal, value);
	}


	/**
	 * Purchase amount 仕入額.<p>
	 *
	 */
	public MCNumber purc_amt() {
		return getConstNumber(offset + 6, $purc_amt);
	}

	/**
	 * Purchase amount 仕入額.<p>
	 *
	 */
	public void purc_amt(MCNumber value) {
		setConstNumber(offset + 6, $purc_amt, value);
	}

	/**
	 * Purchase amount 仕入額.<p>
	 *
	 */
	public void purc_amt(int value) {
		setConstNumber(offset + 6, $purc_amt, value);
	}

	/**
	 * Purchase amount 仕入額.<p>
	 *
	 */
	public void purc_amt(long value) {
		setConstNumber(offset + 6, $purc_amt, value);
	}

	/**
	 * Purchase amount 仕入額.<p>
	 *
	 */
	public void purc_amt(float value) {
		setConstNumber(offset + 6, $purc_amt, value);
	}

	/**
	 * Purchase amount 仕入額.<p>
	 *
	 */
	public void purc_amt(double value) {
		setConstNumber(offset + 6, $purc_amt, value);
	}


	/**
	 * Return amount 返品額.<p>
	 *
	 */
	public MCNumber ret_amt() {
		return getConstNumber(offset + 7, $ret_amt);
	}

	/**
	 * Return amount 返品額.<p>
	 *
	 */
	public void ret_amt(MCNumber value) {
		setConstNumber(offset + 7, $ret_amt, value);
	}

	/**
	 * Return amount 返品額.<p>
	 *
	 */
	public void ret_amt(int value) {
		setConstNumber(offset + 7, $ret_amt, value);
	}

	/**
	 * Return amount 返品額.<p>
	 *
	 */
	public void ret_amt(long value) {
		setConstNumber(offset + 7, $ret_amt, value);
	}

	/**
	 * Return amount 返品額.<p>
	 *
	 */
	public void ret_amt(float value) {
		setConstNumber(offset + 7, $ret_amt, value);
	}

	/**
	 * Return amount 返品額.<p>
	 *
	 */
	public void ret_amt(double value) {
		setConstNumber(offset + 7, $ret_amt, value);
	}


	/**
	 * Discount markup amount 値引値増額.<p>
	 *
	 */
	public MCNumber dscnt_amt() {
		return getConstNumber(offset + 8, $dscnt_amt);
	}

	/**
	 * Discount markup amount 値引値増額.<p>
	 *
	 */
	public void dscnt_amt(MCNumber value) {
		setConstNumber(offset + 8, $dscnt_amt, value);
	}

	/**
	 * Discount markup amount 値引値増額.<p>
	 *
	 */
	public void dscnt_amt(int value) {
		setConstNumber(offset + 8, $dscnt_amt, value);
	}

	/**
	 * Discount markup amount 値引値増額.<p>
	 *
	 */
	public void dscnt_amt(long value) {
		setConstNumber(offset + 8, $dscnt_amt, value);
	}

	/**
	 * Discount markup amount 値引値増額.<p>
	 *
	 */
	public void dscnt_amt(float value) {
		setConstNumber(offset + 8, $dscnt_amt, value);
	}

	/**
	 * Discount markup amount 値引値増額.<p>
	 *
	 */
	public void dscnt_amt(double value) {
		setConstNumber(offset + 8, $dscnt_amt, value);
	}


	/**
	 * Transfer amount (Transfer destination) 振替額（振替先）.<p>
	 *
	 */
	public MCNumber sw_to_amt() {
		return getConstNumber(offset + 9, $sw_to_amt);
	}

	/**
	 * Transfer amount (Transfer destination) 振替額（振替先）.<p>
	 *
	 */
	public void sw_to_amt(MCNumber value) {
		setConstNumber(offset + 9, $sw_to_amt, value);
	}

	/**
	 * Transfer amount (Transfer destination) 振替額（振替先）.<p>
	 *
	 */
	public void sw_to_amt(int value) {
		setConstNumber(offset + 9, $sw_to_amt, value);
	}

	/**
	 * Transfer amount (Transfer destination) 振替額（振替先）.<p>
	 *
	 */
	public void sw_to_amt(long value) {
		setConstNumber(offset + 9, $sw_to_amt, value);
	}

	/**
	 * Transfer amount (Transfer destination) 振替額（振替先）.<p>
	 *
	 */
	public void sw_to_amt(float value) {
		setConstNumber(offset + 9, $sw_to_amt, value);
	}

	/**
	 * Transfer amount (Transfer destination) 振替額（振替先）.<p>
	 *
	 */
	public void sw_to_amt(double value) {
		setConstNumber(offset + 9, $sw_to_amt, value);
	}


	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public MCNumber tax_amt() {
		return getConstNumber(offset + 10, $tax_amt);
	}

	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public void tax_amt(MCNumber value) {
		setConstNumber(offset + 10, $tax_amt, value);
	}

	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public void tax_amt(int value) {
		setConstNumber(offset + 10, $tax_amt, value);
	}

	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public void tax_amt(long value) {
		setConstNumber(offset + 10, $tax_amt, value);
	}

	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public void tax_amt(float value) {
		setConstNumber(offset + 10, $tax_amt, value);
	}

	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public void tax_amt(double value) {
		setConstNumber(offset + 10, $tax_amt, value);
	}


	/**
	 * Cash payment amount 現金支払額.<p>
	 *
	 */
	public MCNumber cash_amt() {
		return getConstNumber(offset + 11, $cash_amt);
	}

	/**
	 * Cash payment amount 現金支払額.<p>
	 *
	 */
	public void cash_amt(MCNumber value) {
		setConstNumber(offset + 11, $cash_amt, value);
	}

	/**
	 * Cash payment amount 現金支払額.<p>
	 *
	 */
	public void cash_amt(int value) {
		setConstNumber(offset + 11, $cash_amt, value);
	}

	/**
	 * Cash payment amount 現金支払額.<p>
	 *
	 */
	public void cash_amt(long value) {
		setConstNumber(offset + 11, $cash_amt, value);
	}

	/**
	 * Cash payment amount 現金支払額.<p>
	 *
	 */
	public void cash_amt(float value) {
		setConstNumber(offset + 11, $cash_amt, value);
	}

	/**
	 * Cash payment amount 現金支払額.<p>
	 *
	 */
	public void cash_amt(double value) {
		setConstNumber(offset + 11, $cash_amt, value);
	}


	/**
	 * Note payment amount 手形支払額.<p>
	 *
	 */
	public MCNumber note_amt() {
		return getConstNumber(offset + 12, $note_amt);
	}

	/**
	 * Note payment amount 手形支払額.<p>
	 *
	 */
	public void note_amt(MCNumber value) {
		setConstNumber(offset + 12, $note_amt, value);
	}

	/**
	 * Note payment amount 手形支払額.<p>
	 *
	 */
	public void note_amt(int value) {
		setConstNumber(offset + 12, $note_amt, value);
	}

	/**
	 * Note payment amount 手形支払額.<p>
	 *
	 */
	public void note_amt(long value) {
		setConstNumber(offset + 12, $note_amt, value);
	}

	/**
	 * Note payment amount 手形支払額.<p>
	 *
	 */
	public void note_amt(float value) {
		setConstNumber(offset + 12, $note_amt, value);
	}

	/**
	 * Note payment amount 手形支払額.<p>
	 *
	 */
	public void note_amt(double value) {
		setConstNumber(offset + 12, $note_amt, value);
	}


	/**
	 * Deposit payment amount 預金支払額.<p>
	 *
	 */
	public MCNumber account_amt() {
		return getConstNumber(offset + 13, $account_amt);
	}

	/**
	 * Deposit payment amount 預金支払額.<p>
	 *
	 */
	public void account_amt(MCNumber value) {
		setConstNumber(offset + 13, $account_amt, value);
	}

	/**
	 * Deposit payment amount 預金支払額.<p>
	 *
	 */
	public void account_amt(int value) {
		setConstNumber(offset + 13, $account_amt, value);
	}

	/**
	 * Deposit payment amount 預金支払額.<p>
	 *
	 */
	public void account_amt(long value) {
		setConstNumber(offset + 13, $account_amt, value);
	}

	/**
	 * Deposit payment amount 預金支払額.<p>
	 *
	 */
	public void account_amt(float value) {
		setConstNumber(offset + 13, $account_amt, value);
	}

	/**
	 * Deposit payment amount 預金支払額.<p>
	 *
	 */
	public void account_amt(double value) {
		setConstNumber(offset + 13, $account_amt, value);
	}


	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public MCNumber setoff_amt() {
		return getConstNumber(offset + 14, $setoff_amt);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void setoff_amt(MCNumber value) {
		setConstNumber(offset + 14, $setoff_amt, value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void setoff_amt(int value) {
		setConstNumber(offset + 14, $setoff_amt, value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void setoff_amt(long value) {
		setConstNumber(offset + 14, $setoff_amt, value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void setoff_amt(float value) {
		setConstNumber(offset + 14, $setoff_amt, value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void setoff_amt(double value) {
		setConstNumber(offset + 14, $setoff_amt, value);
	}


	/**
	 * Transfer amount 振替額.<p>
	 *
	 */
	public MCNumber sw_amt() {
		return getConstNumber(offset + 15, $sw_amt);
	}

	/**
	 * Transfer amount 振替額.<p>
	 *
	 */
	public void sw_amt(MCNumber value) {
		setConstNumber(offset + 15, $sw_amt, value);
	}

	/**
	 * Transfer amount 振替額.<p>
	 *
	 */
	public void sw_amt(int value) {
		setConstNumber(offset + 15, $sw_amt, value);
	}

	/**
	 * Transfer amount 振替額.<p>
	 *
	 */
	public void sw_amt(long value) {
		setConstNumber(offset + 15, $sw_amt, value);
	}

	/**
	 * Transfer amount 振替額.<p>
	 *
	 */
	public void sw_amt(float value) {
		setConstNumber(offset + 15, $sw_amt, value);
	}

	/**
	 * Transfer amount 振替額.<p>
	 *
	 */
	public void sw_amt(double value) {
		setConstNumber(offset + 15, $sw_amt, value);
	}


	/**
	 * Balance of current month 当月末残高.<p>
	 *
	 */
	public MCNumber end_bal() {
		return getConstNumber(offset + 16, $end_bal);
	}

	/**
	 * Balance of current month 当月末残高.<p>
	 *
	 */
	public void end_bal(MCNumber value) {
		setConstNumber(offset + 16, $end_bal, value);
	}

	/**
	 * Balance of current month 当月末残高.<p>
	 *
	 */
	public void end_bal(int value) {
		setConstNumber(offset + 16, $end_bal, value);
	}

	/**
	 * Balance of current month 当月末残高.<p>
	 *
	 */
	public void end_bal(long value) {
		setConstNumber(offset + 16, $end_bal, value);
	}

	/**
	 * Balance of current month 当月末残高.<p>
	 *
	 */
	public void end_bal(float value) {
		setConstNumber(offset + 16, $end_bal, value);
	}

	/**
	 * Balance of current month 当月末残高.<p>
	 *
	 */
	public void end_bal(double value) {
		setConstNumber(offset + 16, $end_bal, value);
	}


	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public MCNumber exc_gain_loss() {
		return getConstNumber(offset + 17, $exc_gain_loss);
	}

	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public void exc_gain_loss(MCNumber value) {
		setConstNumber(offset + 17, $exc_gain_loss, value);
	}

	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public void exc_gain_loss(int value) {
		setConstNumber(offset + 17, $exc_gain_loss, value);
	}

	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public void exc_gain_loss(long value) {
		setConstNumber(offset + 17, $exc_gain_loss, value);
	}

	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public void exc_gain_loss(float value) {
		setConstNumber(offset + 17, $exc_gain_loss, value);
	}

	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public void exc_gain_loss(double value) {
		setConstNumber(offset + 17, $exc_gain_loss, value);
	}


	public String getString(String name) {
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			return base_cur_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			return upri_dec_place();
		}
		if ($init_bal.equalsIgnoreCase(name)) {
			return init_bal();
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			return purc_amt();
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			return ret_amt();
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			return dscnt_amt();
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			return sw_to_amt();
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			return tax_amt();
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			return cash_amt();
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			return note_amt();
		}
		if ($account_amt.equalsIgnoreCase(name)) {
			return account_amt();
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			return setoff_amt();
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			return sw_amt();
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			return end_bal();
		}
		if ($exc_gain_loss.equalsIgnoreCase(name)) {
			return exc_gain_loss();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			return base_cur_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			return upri_dec_place();
		}
		if ($init_bal.equalsIgnoreCase(name)) {
			return init_bal();
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			return purc_amt();
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			return ret_amt();
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			return dscnt_amt();
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			return sw_to_amt();
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			return tax_amt();
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			return cash_amt();
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			return note_amt();
		}
		if ($account_amt.equalsIgnoreCase(name)) {
			return account_amt();
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			return setoff_amt();
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			return sw_amt();
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			return end_bal();
		}
		if ($exc_gain_loss.equalsIgnoreCase(name)) {
			return exc_gain_loss();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
			return;
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			base_cur_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($init_bal.equalsIgnoreCase(name)) {
			init_bal(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($account_amt.equalsIgnoreCase(name)) {
			account_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($exc_gain_loss.equalsIgnoreCase(name)) {
			exc_gain_loss(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($init_bal.equalsIgnoreCase(name)) {
			init_bal(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($account_amt.equalsIgnoreCase(name)) {
			account_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($exc_gain_loss.equalsIgnoreCase(name)) {
			exc_gain_loss(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($init_bal.equalsIgnoreCase(name)) {
			init_bal(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($account_amt.equalsIgnoreCase(name)) {
			account_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($exc_gain_loss.equalsIgnoreCase(name)) {
			exc_gain_loss(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($init_bal.equalsIgnoreCase(name)) {
			init_bal(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($account_amt.equalsIgnoreCase(name)) {
			account_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($exc_gain_loss.equalsIgnoreCase(name)) {
			exc_gain_loss(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($init_bal.equalsIgnoreCase(name)) {
			init_bal(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($account_amt.equalsIgnoreCase(name)) {
			account_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($exc_gain_loss.equalsIgnoreCase(name)) {
			exc_gain_loss(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
			return;
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			base_cur_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($init_bal.equalsIgnoreCase(name)) {
			init_bal(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($account_amt.equalsIgnoreCase(name)) {
			account_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($exc_gain_loss.equalsIgnoreCase(name)) {
			exc_gain_loss(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($init_bal.equalsIgnoreCase(name)) {
			init_bal(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($account_amt.equalsIgnoreCase(name)) {
			account_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($exc_gain_loss.equalsIgnoreCase(name)) {
			exc_gain_loss(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($init_bal.equalsIgnoreCase(name)) {
			init_bal(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($account_amt.equalsIgnoreCase(name)) {
			account_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($exc_gain_loss.equalsIgnoreCase(name)) {
			exc_gain_loss(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($init_bal.equalsIgnoreCase(name)) {
			init_bal(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($account_amt.equalsIgnoreCase(name)) {
			account_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($exc_gain_loss.equalsIgnoreCase(name)) {
			exc_gain_loss(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($init_bal.equalsIgnoreCase(name)) {
			init_bal(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($account_amt.equalsIgnoreCase(name)) {
			account_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($exc_gain_loss.equalsIgnoreCase(name)) {
			exc_gain_loss(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

