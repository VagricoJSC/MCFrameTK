package mcframe.clientMSBG.MSBGP0020;

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
 * ブロック"Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class HdrR_MC_A extends MCConstRow {

	public static final String $lastBillAmt_p = "lastBillAmt_p";
	public static final String $rcvAmt_p = "rcvAmt_p";
	public static final String $bfwAmt_p = "bfwAmt_p";
	public static final String $slsAmt_p = "slsAmt_p";
	public static final String $retAmt_p = "retAmt_p";
	public static final String $dscntAmt_p = "dscntAmt_p";
	public static final String $setoffAmt_p = "setoffAmt_p";
	public static final String $taxAmt_p = "taxAmt_p";
	public static final String $swToAmt_p = "swToAmt_p";
	public static final String $billAmt_p = "billAmt_p";
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public static final String $amt_dec_place = "amt_dec_place";

	public static final String $last_bill_amt = $lastBillAmt_p + ".amt";
	public static final String $rcv_amt = $rcvAmt_p + ".amt";
	public static final String $bfw_amt = $bfwAmt_p + ".amt";
	public static final String $sls_amt = $slsAmt_p + ".amt";
	public static final String $ret_amt = $retAmt_p + ".amt";
	public static final String $dscnt_amt = $dscntAmt_p + ".amt";
	public static final String $setoff_amt = $setoffAmt_p + ".amt";
	public static final String $tax_amt = $taxAmt_p + ".amt";
	public static final String $sw_to_amt = $swToAmt_p + ".amt";
	public static final String $bill_amt = $billAmt_p + ".amt";

	public static final MCMeta lastBillAmt_p_META = createInnerRowMeta($lastBillAmt_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta rcvAmt_p_META = createInnerRowMeta($rcvAmt_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta bfwAmt_p_META = createInnerRowMeta($bfwAmt_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta slsAmt_p_META = createInnerRowMeta($slsAmt_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta retAmt_p_META = createInnerRowMeta($retAmt_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta dscntAmt_p_META = createInnerRowMeta($dscntAmt_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta setoffAmt_p_META = createInnerRowMeta($setoffAmt_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta taxAmt_p_META = createInnerRowMeta($taxAmt_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta swToAmt_p_META = createInnerRowMeta($swToAmt_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta billAmt_p_META = createInnerRowMeta($billAmt_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta amt_dec_place_META = createCommonMeta($amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);

	protected static final ConstMetaList<HdrR> constMetas = new ConstMetaList<HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			lastBillAmt_p_META,
			rcvAmt_p_META,
			bfwAmt_p_META,
			slsAmt_p_META,
			retAmt_p_META,
			dscntAmt_p_META,
			setoffAmt_p_META,
			taxAmt_p_META,
			swToAmt_p_META,
			billAmt_p_META,
			amt_dec_place_META
		},
		new String[][]{
			{
				"last_bill_amt",
				"rcv_amt",
				"bfw_amt",
				"sls_amt",
				"ret_amt",
				"dscnt_amt",
				"setoff_amt",
				"tax_amt",
				"sw_to_amt",
				"bill_amt"
			},
			{
				$last_bill_amt,
				$rcv_amt,
				$bfw_amt,
				$sls_amt,
				$ret_amt,
				$dscnt_amt,
				$setoff_amt,
				$tax_amt,
				$sw_to_amt,
				$bill_amt
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
	protected HdrR_MC_A(ConstMetaList<? extends HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrR clone() {
		return (HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrR createInstance() {
		return (HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrR getValues(String... names) {
		return (HdrR) super.getValues(names);
	}



	public mcframe.clientMAUB.MAUBP0060.AmtR lastBillAmt_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 0, $lastBillAmt_p);
	}
	
	public void lastBillAmt_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 0, $lastBillAmt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR rcvAmt_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 1, $rcvAmt_p);
	}
	
	public void rcvAmt_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 1, $rcvAmt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR bfwAmt_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 2, $bfwAmt_p);
	}
	
	public void bfwAmt_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 2, $bfwAmt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR slsAmt_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 3, $slsAmt_p);
	}
	
	public void slsAmt_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 3, $slsAmt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR retAmt_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 4, $retAmt_p);
	}
	
	public void retAmt_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 4, $retAmt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR dscntAmt_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 5, $dscntAmt_p);
	}
	
	public void dscntAmt_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 5, $dscntAmt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR setoffAmt_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 6, $setoffAmt_p);
	}
	
	public void setoffAmt_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 6, $setoffAmt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR taxAmt_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 7, $taxAmt_p);
	}
	
	public void taxAmt_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 7, $taxAmt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR swToAmt_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 8, $swToAmt_p);
	}
	
	public void swToAmt_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 8, $swToAmt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR billAmt_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 9, $billAmt_p);
	}
	
	public void billAmt_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 9, $billAmt_p, row);
	}


	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber amt_dec_place() {
		return getConstNumber(offset + 10, $amt_dec_place);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(MCNumber value) {
		setConstNumber(offset + 10, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(int value) {
		setConstNumber(offset + 10, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(long value) {
		setConstNumber(offset + 10, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(float value) {
		setConstNumber(offset + 10, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(double value) {
		setConstNumber(offset + 10, $amt_dec_place, value);
	}


	public MCNumber getNumber(String name) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		return super.getNumber(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		return super.getNumberNE(name);
	}

	public void setNumber(String name, MCNumber value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($lastBillAmt_p.equalsIgnoreCase(name)) {
			return lastBillAmt_p();
		}
		if ($rcvAmt_p.equalsIgnoreCase(name)) {
			return rcvAmt_p();
		}
		if ($bfwAmt_p.equalsIgnoreCase(name)) {
			return bfwAmt_p();
		}
		if ($slsAmt_p.equalsIgnoreCase(name)) {
			return slsAmt_p();
		}
		if ($retAmt_p.equalsIgnoreCase(name)) {
			return retAmt_p();
		}
		if ($dscntAmt_p.equalsIgnoreCase(name)) {
			return dscntAmt_p();
		}
		if ($setoffAmt_p.equalsIgnoreCase(name)) {
			return setoffAmt_p();
		}
		if ($taxAmt_p.equalsIgnoreCase(name)) {
			return taxAmt_p();
		}
		if ($swToAmt_p.equalsIgnoreCase(name)) {
			return swToAmt_p();
		}
		if ($billAmt_p.equalsIgnoreCase(name)) {
			return billAmt_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($lastBillAmt_p.equalsIgnoreCase(name)) {
			lastBillAmt_p(
				((MCContainerMeta) lastBillAmt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($rcvAmt_p.equalsIgnoreCase(name)) {
			rcvAmt_p(
				((MCContainerMeta) rcvAmt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($bfwAmt_p.equalsIgnoreCase(name)) {
			bfwAmt_p(
				((MCContainerMeta) bfwAmt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($slsAmt_p.equalsIgnoreCase(name)) {
			slsAmt_p(
				((MCContainerMeta) slsAmt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($retAmt_p.equalsIgnoreCase(name)) {
			retAmt_p(
				((MCContainerMeta) retAmt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($dscntAmt_p.equalsIgnoreCase(name)) {
			dscntAmt_p(
				((MCContainerMeta) dscntAmt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($setoffAmt_p.equalsIgnoreCase(name)) {
			setoffAmt_p(
				((MCContainerMeta) setoffAmt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($taxAmt_p.equalsIgnoreCase(name)) {
			taxAmt_p(
				((MCContainerMeta) taxAmt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($swToAmt_p.equalsIgnoreCase(name)) {
			swToAmt_p(
				((MCContainerMeta) swToAmt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($billAmt_p.equalsIgnoreCase(name)) {
			billAmt_p(
				((MCContainerMeta) billAmt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Last billing amount 前回請求額.<p>
	 *
	 */
	public MCNumber last_bill_amt() {
		return lastBillAmt_p().amt();
	}

	/**
	 * Last billing amount 前回請求額.<p>
	 *
	 */
	public void last_bill_amt(MCNumber value) {
		lastBillAmt_p().amt(value);
	}

	/**
	 * Last billing amount 前回請求額.<p>
	 *
	 */
	public void last_bill_amt(int value) {
		lastBillAmt_p().amt(value);
	}

	/**
	 * Last billing amount 前回請求額.<p>
	 *
	 */
	public void last_bill_amt(long value) {
		lastBillAmt_p().amt(value);
	}

	/**
	 * Last billing amount 前回請求額.<p>
	 *
	 */
	public void last_bill_amt(float value) {
		lastBillAmt_p().amt(value);
	}

	/**
	 * Last billing amount 前回請求額.<p>
	 *
	 */
	public void last_bill_amt(double value) {
		lastBillAmt_p().amt(value);
	}

	/**
	 * Current payment received amount 今回入金額.<p>
	 *
	 */
	public MCNumber rcv_amt() {
		return rcvAmt_p().amt();
	}

	/**
	 * Current payment received amount 今回入金額.<p>
	 *
	 */
	public void rcv_amt(MCNumber value) {
		rcvAmt_p().amt(value);
	}

	/**
	 * Current payment received amount 今回入金額.<p>
	 *
	 */
	public void rcv_amt(int value) {
		rcvAmt_p().amt(value);
	}

	/**
	 * Current payment received amount 今回入金額.<p>
	 *
	 */
	public void rcv_amt(long value) {
		rcvAmt_p().amt(value);
	}

	/**
	 * Current payment received amount 今回入金額.<p>
	 *
	 */
	public void rcv_amt(float value) {
		rcvAmt_p().amt(value);
	}

	/**
	 * Current payment received amount 今回入金額.<p>
	 *
	 */
	public void rcv_amt(double value) {
		rcvAmt_p().amt(value);
	}

	/**
	 * Current carry-over amount 今回繰越額.<p>
	 *
	 */
	public MCNumber bfw_amt() {
		return bfwAmt_p().amt();
	}

	/**
	 * Current carry-over amount 今回繰越額.<p>
	 *
	 */
	public void bfw_amt(MCNumber value) {
		bfwAmt_p().amt(value);
	}

	/**
	 * Current carry-over amount 今回繰越額.<p>
	 *
	 */
	public void bfw_amt(int value) {
		bfwAmt_p().amt(value);
	}

	/**
	 * Current carry-over amount 今回繰越額.<p>
	 *
	 */
	public void bfw_amt(long value) {
		bfwAmt_p().amt(value);
	}

	/**
	 * Current carry-over amount 今回繰越額.<p>
	 *
	 */
	public void bfw_amt(float value) {
		bfwAmt_p().amt(value);
	}

	/**
	 * Current carry-over amount 今回繰越額.<p>
	 *
	 */
	public void bfw_amt(double value) {
		bfwAmt_p().amt(value);
	}

	/**
	 * Current sales amount 今回売上額.<p>
	 *
	 */
	public MCNumber sls_amt() {
		return slsAmt_p().amt();
	}

	/**
	 * Current sales amount 今回売上額.<p>
	 *
	 */
	public void sls_amt(MCNumber value) {
		slsAmt_p().amt(value);
	}

	/**
	 * Current sales amount 今回売上額.<p>
	 *
	 */
	public void sls_amt(int value) {
		slsAmt_p().amt(value);
	}

	/**
	 * Current sales amount 今回売上額.<p>
	 *
	 */
	public void sls_amt(long value) {
		slsAmt_p().amt(value);
	}

	/**
	 * Current sales amount 今回売上額.<p>
	 *
	 */
	public void sls_amt(float value) {
		slsAmt_p().amt(value);
	}

	/**
	 * Current sales amount 今回売上額.<p>
	 *
	 */
	public void sls_amt(double value) {
		slsAmt_p().amt(value);
	}

	/**
	 * Current return amount 今回返品額.<p>
	 *
	 */
	public MCNumber ret_amt() {
		return retAmt_p().amt();
	}

	/**
	 * Current return amount 今回返品額.<p>
	 *
	 */
	public void ret_amt(MCNumber value) {
		retAmt_p().amt(value);
	}

	/**
	 * Current return amount 今回返品額.<p>
	 *
	 */
	public void ret_amt(int value) {
		retAmt_p().amt(value);
	}

	/**
	 * Current return amount 今回返品額.<p>
	 *
	 */
	public void ret_amt(long value) {
		retAmt_p().amt(value);
	}

	/**
	 * Current return amount 今回返品額.<p>
	 *
	 */
	public void ret_amt(float value) {
		retAmt_p().amt(value);
	}

	/**
	 * Current return amount 今回返品額.<p>
	 *
	 */
	public void ret_amt(double value) {
		retAmt_p().amt(value);
	}

	/**
	 * Current discount amount 今回値引額.<p>
	 *
	 */
	public MCNumber dscnt_amt() {
		return dscntAmt_p().amt();
	}

	/**
	 * Current discount amount 今回値引額.<p>
	 *
	 */
	public void dscnt_amt(MCNumber value) {
		dscntAmt_p().amt(value);
	}

	/**
	 * Current discount amount 今回値引額.<p>
	 *
	 */
	public void dscnt_amt(int value) {
		dscntAmt_p().amt(value);
	}

	/**
	 * Current discount amount 今回値引額.<p>
	 *
	 */
	public void dscnt_amt(long value) {
		dscntAmt_p().amt(value);
	}

	/**
	 * Current discount amount 今回値引額.<p>
	 *
	 */
	public void dscnt_amt(float value) {
		dscntAmt_p().amt(value);
	}

	/**
	 * Current discount amount 今回値引額.<p>
	 *
	 */
	public void dscnt_amt(double value) {
		dscntAmt_p().amt(value);
	}

	/**
	 * Current offset amount 今回相殺額.<p>
	 *
	 */
	public MCNumber setoff_amt() {
		return setoffAmt_p().amt();
	}

	/**
	 * Current offset amount 今回相殺額.<p>
	 *
	 */
	public void setoff_amt(MCNumber value) {
		setoffAmt_p().amt(value);
	}

	/**
	 * Current offset amount 今回相殺額.<p>
	 *
	 */
	public void setoff_amt(int value) {
		setoffAmt_p().amt(value);
	}

	/**
	 * Current offset amount 今回相殺額.<p>
	 *
	 */
	public void setoff_amt(long value) {
		setoffAmt_p().amt(value);
	}

	/**
	 * Current offset amount 今回相殺額.<p>
	 *
	 */
	public void setoff_amt(float value) {
		setoffAmt_p().amt(value);
	}

	/**
	 * Current offset amount 今回相殺額.<p>
	 *
	 */
	public void setoff_amt(double value) {
		setoffAmt_p().amt(value);
	}

	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public MCNumber tax_amt() {
		return taxAmt_p().amt();
	}

	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public void tax_amt(MCNumber value) {
		taxAmt_p().amt(value);
	}

	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public void tax_amt(int value) {
		taxAmt_p().amt(value);
	}

	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public void tax_amt(long value) {
		taxAmt_p().amt(value);
	}

	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public void tax_amt(float value) {
		taxAmt_p().amt(value);
	}

	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public void tax_amt(double value) {
		taxAmt_p().amt(value);
	}

	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public MCNumber sw_to_amt() {
		return swToAmt_p().amt();
	}

	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public void sw_to_amt(MCNumber value) {
		swToAmt_p().amt(value);
	}

	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public void sw_to_amt(int value) {
		swToAmt_p().amt(value);
	}

	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public void sw_to_amt(long value) {
		swToAmt_p().amt(value);
	}

	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public void sw_to_amt(float value) {
		swToAmt_p().amt(value);
	}

	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public void sw_to_amt(double value) {
		swToAmt_p().amt(value);
	}

	/**
	 * Current billing amount 今回請求額.<p>
	 *
	 */
	public MCNumber bill_amt() {
		return billAmt_p().amt();
	}

	/**
	 * Current billing amount 今回請求額.<p>
	 *
	 */
	public void bill_amt(MCNumber value) {
		billAmt_p().amt(value);
	}

	/**
	 * Current billing amount 今回請求額.<p>
	 *
	 */
	public void bill_amt(int value) {
		billAmt_p().amt(value);
	}

	/**
	 * Current billing amount 今回請求額.<p>
	 *
	 */
	public void bill_amt(long value) {
		billAmt_p().amt(value);
	}

	/**
	 * Current billing amount 今回請求額.<p>
	 *
	 */
	public void bill_amt(float value) {
		billAmt_p().amt(value);
	}

	/**
	 * Current billing amount 今回請求額.<p>
	 *
	 */
	public void bill_amt(double value) {
		billAmt_p().amt(value);
	}

}

