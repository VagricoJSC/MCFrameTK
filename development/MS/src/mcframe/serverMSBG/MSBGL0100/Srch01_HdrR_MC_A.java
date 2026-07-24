package mcframe.serverMSBG.MSBGL0100;

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
	 * AR dept. name 債権部門名.<p>
	 *
	 */
	public static final String $ar_dpt_nm = "ar_dpt_nm";
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
	 * Transaction balance of previous month 取引前月末残高.<p>
	 *
	 */
	public static final String $init_bal = "init_bal";
	/**
	 * Transaction sales amount 取引売上額.<p>
	 *
	 */
	public static final String $sls_amt = "sls_amt";
	/**
	 * Transaction return amount 取引返品額.<p>
	 *
	 */
	public static final String $ret_amt = "ret_amt";
	/**
	 * Transaction discount markup amount 取引値引値増額.<p>
	 *
	 */
	public static final String $dscnt_amt = "dscnt_amt";
	/**
	 * Transaction tax 取引税額.<p>
	 *
	 */
	public static final String $tax_amt = "tax_amt";
	/**
	 * Transaction transfer amount 取引振替額.<p>
	 *
	 */
	public static final String $sw_to_amt = "sw_to_amt";
	/**
	 * Transaction payment received amount 取引入金額.<p>
	 *
	 */
	public static final String $rcv_amt = "rcv_amt";
	/**
	 * Transaction offset amount 取引相殺額.<p>
	 *
	 */
	public static final String $setoff_amt = "setoff_amt";
	/**
	 * Transaction balance of current month 取引当月末残高.<p>
	 *
	 */
	public static final String $end_bal = "end_bal";
	/**
	 * Transaction outstanding notes amount 取引未決済手形額.<p>
	 *
	 */
	public static final String $not_appl_note_amt = "not_appl_note_amt";
	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public static final String $exc_gain_loss = "exc_gain_loss";


	public static final MCMeta ar_dpt_nm_META = createCommonMeta($ar_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta amt_dec_place_META = createCommonMeta($amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta upri_dec_place_META = createCommonMeta($upri_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_cur_cd_META = createCommonMeta($base_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta base_cur_nm_META = createCommonMeta($base_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta init_bal_META = createCommonMeta($init_bal, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sls_amt_META = createCommonMeta($sls_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ret_amt_META = createCommonMeta($ret_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta dscnt_amt_META = createCommonMeta($dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_amt_META = createCommonMeta($tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sw_to_amt_META = createCommonMeta($sw_to_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta rcv_amt_META = createCommonMeta($rcv_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta setoff_amt_META = createCommonMeta($setoff_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta end_bal_META = createCommonMeta($end_bal, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta not_appl_note_amt_META = createCommonMeta($not_appl_note_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta exc_gain_loss_META = createCommonMeta($exc_gain_loss, mcframe.commonMA.meta.MA_META.MONEY);

	protected static final ConstMetaList<Srch01_HdrR> constMetas = new ConstMetaList<Srch01_HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ar_dpt_nm_META,
			cur_cd_META,
			amt_dec_place_META,
			upri_dec_place_META,
			base_cur_cd_META,
			base_cur_nm_META,
			init_bal_META,
			sls_amt_META,
			ret_amt_META,
			dscnt_amt_META,
			tax_amt_META,
			sw_to_amt_META,
			rcv_amt_META,
			setoff_amt_META,
			end_bal_META,
			not_appl_note_amt_META,
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
	 * AR dept. name 債権部門名.<p>
	 *
	 */
	public String ar_dpt_nm() {
		return getConstString(offset + 0, $ar_dpt_nm);
	}

	/**
	 * AR dept. name 債権部門名.<p>
	 *
	 */
	public void ar_dpt_nm(String value) {
		setConstString(offset + 0, $ar_dpt_nm, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 1, $cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 1, $cur_cd, value);
	}


	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber amt_dec_place() {
		return getConstNumber(offset + 2, $amt_dec_place);
	}

	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(MCNumber value) {
		setConstNumber(offset + 2, $amt_dec_place, value);
	}

	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(int value) {
		setConstNumber(offset + 2, $amt_dec_place, value);
	}

	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(long value) {
		setConstNumber(offset + 2, $amt_dec_place, value);
	}

	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(float value) {
		setConstNumber(offset + 2, $amt_dec_place, value);
	}

	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(double value) {
		setConstNumber(offset + 2, $amt_dec_place, value);
	}


	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public MCNumber upri_dec_place() {
		return getConstNumber(offset + 3, $upri_dec_place);
	}

	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(MCNumber value) {
		setConstNumber(offset + 3, $upri_dec_place, value);
	}

	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(int value) {
		setConstNumber(offset + 3, $upri_dec_place, value);
	}

	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(long value) {
		setConstNumber(offset + 3, $upri_dec_place, value);
	}

	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(float value) {
		setConstNumber(offset + 3, $upri_dec_place, value);
	}

	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(double value) {
		setConstNumber(offset + 3, $upri_dec_place, value);
	}


	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public String base_cur_cd() {
		return getConstString(offset + 4, $base_cur_cd);
	}

	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public void base_cur_cd(String value) {
		setConstString(offset + 4, $base_cur_cd, value);
	}


	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public String base_cur_nm() {
		return getConstString(offset + 5, $base_cur_nm);
	}

	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public void base_cur_nm(String value) {
		setConstString(offset + 5, $base_cur_nm, value);
	}


	/**
	 * Transaction balance of previous month 取引前月末残高.<p>
	 *
	 */
	public MCNumber init_bal() {
		return getConstNumber(offset + 6, $init_bal);
	}

	/**
	 * Transaction balance of previous month 取引前月末残高.<p>
	 *
	 */
	public void init_bal(MCNumber value) {
		setConstNumber(offset + 6, $init_bal, value);
	}

	/**
	 * Transaction balance of previous month 取引前月末残高.<p>
	 *
	 */
	public void init_bal(int value) {
		setConstNumber(offset + 6, $init_bal, value);
	}

	/**
	 * Transaction balance of previous month 取引前月末残高.<p>
	 *
	 */
	public void init_bal(long value) {
		setConstNumber(offset + 6, $init_bal, value);
	}

	/**
	 * Transaction balance of previous month 取引前月末残高.<p>
	 *
	 */
	public void init_bal(float value) {
		setConstNumber(offset + 6, $init_bal, value);
	}

	/**
	 * Transaction balance of previous month 取引前月末残高.<p>
	 *
	 */
	public void init_bal(double value) {
		setConstNumber(offset + 6, $init_bal, value);
	}


	/**
	 * Transaction sales amount 取引売上額.<p>
	 *
	 */
	public MCNumber sls_amt() {
		return getConstNumber(offset + 7, $sls_amt);
	}

	/**
	 * Transaction sales amount 取引売上額.<p>
	 *
	 */
	public void sls_amt(MCNumber value) {
		setConstNumber(offset + 7, $sls_amt, value);
	}

	/**
	 * Transaction sales amount 取引売上額.<p>
	 *
	 */
	public void sls_amt(int value) {
		setConstNumber(offset + 7, $sls_amt, value);
	}

	/**
	 * Transaction sales amount 取引売上額.<p>
	 *
	 */
	public void sls_amt(long value) {
		setConstNumber(offset + 7, $sls_amt, value);
	}

	/**
	 * Transaction sales amount 取引売上額.<p>
	 *
	 */
	public void sls_amt(float value) {
		setConstNumber(offset + 7, $sls_amt, value);
	}

	/**
	 * Transaction sales amount 取引売上額.<p>
	 *
	 */
	public void sls_amt(double value) {
		setConstNumber(offset + 7, $sls_amt, value);
	}


	/**
	 * Transaction return amount 取引返品額.<p>
	 *
	 */
	public MCNumber ret_amt() {
		return getConstNumber(offset + 8, $ret_amt);
	}

	/**
	 * Transaction return amount 取引返品額.<p>
	 *
	 */
	public void ret_amt(MCNumber value) {
		setConstNumber(offset + 8, $ret_amt, value);
	}

	/**
	 * Transaction return amount 取引返品額.<p>
	 *
	 */
	public void ret_amt(int value) {
		setConstNumber(offset + 8, $ret_amt, value);
	}

	/**
	 * Transaction return amount 取引返品額.<p>
	 *
	 */
	public void ret_amt(long value) {
		setConstNumber(offset + 8, $ret_amt, value);
	}

	/**
	 * Transaction return amount 取引返品額.<p>
	 *
	 */
	public void ret_amt(float value) {
		setConstNumber(offset + 8, $ret_amt, value);
	}

	/**
	 * Transaction return amount 取引返品額.<p>
	 *
	 */
	public void ret_amt(double value) {
		setConstNumber(offset + 8, $ret_amt, value);
	}


	/**
	 * Transaction discount markup amount 取引値引値増額.<p>
	 *
	 */
	public MCNumber dscnt_amt() {
		return getConstNumber(offset + 9, $dscnt_amt);
	}

	/**
	 * Transaction discount markup amount 取引値引値増額.<p>
	 *
	 */
	public void dscnt_amt(MCNumber value) {
		setConstNumber(offset + 9, $dscnt_amt, value);
	}

	/**
	 * Transaction discount markup amount 取引値引値増額.<p>
	 *
	 */
	public void dscnt_amt(int value) {
		setConstNumber(offset + 9, $dscnt_amt, value);
	}

	/**
	 * Transaction discount markup amount 取引値引値増額.<p>
	 *
	 */
	public void dscnt_amt(long value) {
		setConstNumber(offset + 9, $dscnt_amt, value);
	}

	/**
	 * Transaction discount markup amount 取引値引値増額.<p>
	 *
	 */
	public void dscnt_amt(float value) {
		setConstNumber(offset + 9, $dscnt_amt, value);
	}

	/**
	 * Transaction discount markup amount 取引値引値増額.<p>
	 *
	 */
	public void dscnt_amt(double value) {
		setConstNumber(offset + 9, $dscnt_amt, value);
	}


	/**
	 * Transaction tax 取引税額.<p>
	 *
	 */
	public MCNumber tax_amt() {
		return getConstNumber(offset + 10, $tax_amt);
	}

	/**
	 * Transaction tax 取引税額.<p>
	 *
	 */
	public void tax_amt(MCNumber value) {
		setConstNumber(offset + 10, $tax_amt, value);
	}

	/**
	 * Transaction tax 取引税額.<p>
	 *
	 */
	public void tax_amt(int value) {
		setConstNumber(offset + 10, $tax_amt, value);
	}

	/**
	 * Transaction tax 取引税額.<p>
	 *
	 */
	public void tax_amt(long value) {
		setConstNumber(offset + 10, $tax_amt, value);
	}

	/**
	 * Transaction tax 取引税額.<p>
	 *
	 */
	public void tax_amt(float value) {
		setConstNumber(offset + 10, $tax_amt, value);
	}

	/**
	 * Transaction tax 取引税額.<p>
	 *
	 */
	public void tax_amt(double value) {
		setConstNumber(offset + 10, $tax_amt, value);
	}


	/**
	 * Transaction transfer amount 取引振替額.<p>
	 *
	 */
	public MCNumber sw_to_amt() {
		return getConstNumber(offset + 11, $sw_to_amt);
	}

	/**
	 * Transaction transfer amount 取引振替額.<p>
	 *
	 */
	public void sw_to_amt(MCNumber value) {
		setConstNumber(offset + 11, $sw_to_amt, value);
	}

	/**
	 * Transaction transfer amount 取引振替額.<p>
	 *
	 */
	public void sw_to_amt(int value) {
		setConstNumber(offset + 11, $sw_to_amt, value);
	}

	/**
	 * Transaction transfer amount 取引振替額.<p>
	 *
	 */
	public void sw_to_amt(long value) {
		setConstNumber(offset + 11, $sw_to_amt, value);
	}

	/**
	 * Transaction transfer amount 取引振替額.<p>
	 *
	 */
	public void sw_to_amt(float value) {
		setConstNumber(offset + 11, $sw_to_amt, value);
	}

	/**
	 * Transaction transfer amount 取引振替額.<p>
	 *
	 */
	public void sw_to_amt(double value) {
		setConstNumber(offset + 11, $sw_to_amt, value);
	}


	/**
	 * Transaction payment received amount 取引入金額.<p>
	 *
	 */
	public MCNumber rcv_amt() {
		return getConstNumber(offset + 12, $rcv_amt);
	}

	/**
	 * Transaction payment received amount 取引入金額.<p>
	 *
	 */
	public void rcv_amt(MCNumber value) {
		setConstNumber(offset + 12, $rcv_amt, value);
	}

	/**
	 * Transaction payment received amount 取引入金額.<p>
	 *
	 */
	public void rcv_amt(int value) {
		setConstNumber(offset + 12, $rcv_amt, value);
	}

	/**
	 * Transaction payment received amount 取引入金額.<p>
	 *
	 */
	public void rcv_amt(long value) {
		setConstNumber(offset + 12, $rcv_amt, value);
	}

	/**
	 * Transaction payment received amount 取引入金額.<p>
	 *
	 */
	public void rcv_amt(float value) {
		setConstNumber(offset + 12, $rcv_amt, value);
	}

	/**
	 * Transaction payment received amount 取引入金額.<p>
	 *
	 */
	public void rcv_amt(double value) {
		setConstNumber(offset + 12, $rcv_amt, value);
	}


	/**
	 * Transaction offset amount 取引相殺額.<p>
	 *
	 */
	public MCNumber setoff_amt() {
		return getConstNumber(offset + 13, $setoff_amt);
	}

	/**
	 * Transaction offset amount 取引相殺額.<p>
	 *
	 */
	public void setoff_amt(MCNumber value) {
		setConstNumber(offset + 13, $setoff_amt, value);
	}

	/**
	 * Transaction offset amount 取引相殺額.<p>
	 *
	 */
	public void setoff_amt(int value) {
		setConstNumber(offset + 13, $setoff_amt, value);
	}

	/**
	 * Transaction offset amount 取引相殺額.<p>
	 *
	 */
	public void setoff_amt(long value) {
		setConstNumber(offset + 13, $setoff_amt, value);
	}

	/**
	 * Transaction offset amount 取引相殺額.<p>
	 *
	 */
	public void setoff_amt(float value) {
		setConstNumber(offset + 13, $setoff_amt, value);
	}

	/**
	 * Transaction offset amount 取引相殺額.<p>
	 *
	 */
	public void setoff_amt(double value) {
		setConstNumber(offset + 13, $setoff_amt, value);
	}


	/**
	 * Transaction balance of current month 取引当月末残高.<p>
	 *
	 */
	public MCNumber end_bal() {
		return getConstNumber(offset + 14, $end_bal);
	}

	/**
	 * Transaction balance of current month 取引当月末残高.<p>
	 *
	 */
	public void end_bal(MCNumber value) {
		setConstNumber(offset + 14, $end_bal, value);
	}

	/**
	 * Transaction balance of current month 取引当月末残高.<p>
	 *
	 */
	public void end_bal(int value) {
		setConstNumber(offset + 14, $end_bal, value);
	}

	/**
	 * Transaction balance of current month 取引当月末残高.<p>
	 *
	 */
	public void end_bal(long value) {
		setConstNumber(offset + 14, $end_bal, value);
	}

	/**
	 * Transaction balance of current month 取引当月末残高.<p>
	 *
	 */
	public void end_bal(float value) {
		setConstNumber(offset + 14, $end_bal, value);
	}

	/**
	 * Transaction balance of current month 取引当月末残高.<p>
	 *
	 */
	public void end_bal(double value) {
		setConstNumber(offset + 14, $end_bal, value);
	}


	/**
	 * Transaction outstanding notes amount 取引未決済手形額.<p>
	 *
	 */
	public MCNumber not_appl_note_amt() {
		return getConstNumber(offset + 15, $not_appl_note_amt);
	}

	/**
	 * Transaction outstanding notes amount 取引未決済手形額.<p>
	 *
	 */
	public void not_appl_note_amt(MCNumber value) {
		setConstNumber(offset + 15, $not_appl_note_amt, value);
	}

	/**
	 * Transaction outstanding notes amount 取引未決済手形額.<p>
	 *
	 */
	public void not_appl_note_amt(int value) {
		setConstNumber(offset + 15, $not_appl_note_amt, value);
	}

	/**
	 * Transaction outstanding notes amount 取引未決済手形額.<p>
	 *
	 */
	public void not_appl_note_amt(long value) {
		setConstNumber(offset + 15, $not_appl_note_amt, value);
	}

	/**
	 * Transaction outstanding notes amount 取引未決済手形額.<p>
	 *
	 */
	public void not_appl_note_amt(float value) {
		setConstNumber(offset + 15, $not_appl_note_amt, value);
	}

	/**
	 * Transaction outstanding notes amount 取引未決済手形額.<p>
	 *
	 */
	public void not_appl_note_amt(double value) {
		setConstNumber(offset + 15, $not_appl_note_amt, value);
	}


	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public MCNumber exc_gain_loss() {
		return getConstNumber(offset + 16, $exc_gain_loss);
	}

	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public void exc_gain_loss(MCNumber value) {
		setConstNumber(offset + 16, $exc_gain_loss, value);
	}

	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public void exc_gain_loss(int value) {
		setConstNumber(offset + 16, $exc_gain_loss, value);
	}

	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public void exc_gain_loss(long value) {
		setConstNumber(offset + 16, $exc_gain_loss, value);
	}

	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public void exc_gain_loss(float value) {
		setConstNumber(offset + 16, $exc_gain_loss, value);
	}

	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public void exc_gain_loss(double value) {
		setConstNumber(offset + 16, $exc_gain_loss, value);
	}


	public String getString(String name) {
		if ($ar_dpt_nm.equalsIgnoreCase(name)) {
			return ar_dpt_nm();
		}
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
		if ($sls_amt.equalsIgnoreCase(name)) {
			return sls_amt();
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			return ret_amt();
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			return dscnt_amt();
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			return tax_amt();
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			return sw_to_amt();
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			return rcv_amt();
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			return setoff_amt();
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			return end_bal();
		}
		if ($not_appl_note_amt.equalsIgnoreCase(name)) {
			return not_appl_note_amt();
		}
		if ($exc_gain_loss.equalsIgnoreCase(name)) {
			return exc_gain_loss();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($ar_dpt_nm.equalsIgnoreCase(name)) {
			return ar_dpt_nm();
		}
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
		if ($sls_amt.equalsIgnoreCase(name)) {
			return sls_amt();
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			return ret_amt();
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			return dscnt_amt();
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			return tax_amt();
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			return sw_to_amt();
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			return rcv_amt();
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			return setoff_amt();
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			return end_bal();
		}
		if ($not_appl_note_amt.equalsIgnoreCase(name)) {
			return not_appl_note_amt();
		}
		if ($exc_gain_loss.equalsIgnoreCase(name)) {
			return exc_gain_loss();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($ar_dpt_nm.equalsIgnoreCase(name)) {
			ar_dpt_nm(value);
			return;
		}
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
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
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
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($not_appl_note_amt.equalsIgnoreCase(name)) {
			not_appl_note_amt(value);
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
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
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
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($not_appl_note_amt.equalsIgnoreCase(name)) {
			not_appl_note_amt(value);
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
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
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
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($not_appl_note_amt.equalsIgnoreCase(name)) {
			not_appl_note_amt(value);
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
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
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
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($not_appl_note_amt.equalsIgnoreCase(name)) {
			not_appl_note_amt(value);
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
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
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
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($not_appl_note_amt.equalsIgnoreCase(name)) {
			not_appl_note_amt(value);
			return;
		}
		if ($exc_gain_loss.equalsIgnoreCase(name)) {
			exc_gain_loss(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ar_dpt_nm.equalsIgnoreCase(name)) {
			ar_dpt_nm(value);
			return;
		}
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
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
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
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($not_appl_note_amt.equalsIgnoreCase(name)) {
			not_appl_note_amt(value);
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
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
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
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($not_appl_note_amt.equalsIgnoreCase(name)) {
			not_appl_note_amt(value);
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
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
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
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($not_appl_note_amt.equalsIgnoreCase(name)) {
			not_appl_note_amt(value);
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
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
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
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($not_appl_note_amt.equalsIgnoreCase(name)) {
			not_appl_note_amt(value);
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
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
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
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($not_appl_note_amt.equalsIgnoreCase(name)) {
			not_appl_note_amt(value);
			return;
		}
		if ($exc_gain_loss.equalsIgnoreCase(name)) {
			exc_gain_loss(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

