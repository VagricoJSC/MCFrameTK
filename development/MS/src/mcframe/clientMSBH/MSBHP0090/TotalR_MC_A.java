package mcframe.clientMSBH.MSBHP0090;

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
 * ブロック"Total"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class TotalR_MC_A extends MCConstRow {

	public static final String $pay_amt_p = "pay_amt_p";
	public static final String $not_appl_bal_p = "not_appl_bal_p";
	public static final String $ttl_s_amt_p = "ttl_s_amt_p";
	public static final String $ttl_s_com_paid_amt_p = "ttl_s_com_paid_amt_p";
	public static final String $ttl_s_com_paid_tax_amt_p = "ttl_s_com_paid_tax_amt_p";
	public static final String $ttl_a_amt_p = "ttl_a_amt_p";
	public static final String $ttl_a_com_paid_amt_p = "ttl_a_com_paid_amt_p";
	public static final String $ttl_a_com_paid_tax_amt_p = "ttl_a_com_paid_tax_amt_p";

	public static final String $pay_amt = $pay_amt_p + ".amt";
	public static final String $not_appl_bal = $not_appl_bal_p + ".amt";
	public static final String $ttl_s_amt = $ttl_s_amt_p + ".amt";
	public static final String $ttl_s_com_paid_amt = $ttl_s_com_paid_amt_p + ".amt";
	public static final String $ttl_s_com_paid_tax_amt = $ttl_s_com_paid_tax_amt_p + ".amt";
	public static final String $ttl_a_amt = $ttl_a_amt_p + ".amt";
	public static final String $ttl_a_com_paid_amt = $ttl_a_com_paid_amt_p + ".amt";
	public static final String $ttl_a_com_paid_tax_amt = $ttl_a_com_paid_tax_amt_p + ".amt";

	public static final MCMeta pay_amt_p_META = createInnerRowMeta($pay_amt_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta not_appl_bal_p_META = createInnerRowMeta($not_appl_bal_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta ttl_s_amt_p_META = createInnerRowMeta($ttl_s_amt_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta ttl_s_com_paid_amt_p_META = createInnerRowMeta($ttl_s_com_paid_amt_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta ttl_s_com_paid_tax_amt_p_META = createInnerRowMeta($ttl_s_com_paid_tax_amt_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta ttl_a_amt_p_META = createInnerRowMeta($ttl_a_amt_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta ttl_a_com_paid_amt_p_META = createInnerRowMeta($ttl_a_com_paid_amt_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta ttl_a_com_paid_tax_amt_p_META = createInnerRowMeta($ttl_a_com_paid_tax_amt_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);

	protected static final ConstMetaList<TotalR> constMetas = new ConstMetaList<TotalR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			pay_amt_p_META,
			not_appl_bal_p_META,
			ttl_s_amt_p_META,
			ttl_s_com_paid_amt_p_META,
			ttl_s_com_paid_tax_amt_p_META,
			ttl_a_amt_p_META,
			ttl_a_com_paid_amt_p_META,
			ttl_a_com_paid_tax_amt_p_META
		},
		new String[][]{
			{
				"pay_amt",
				"not_appl_bal",
				"ttl_s_amt",
				"ttl_s_com_paid_amt",
				"ttl_s_com_paid_tax_amt",
				"ttl_a_amt",
				"ttl_a_com_paid_amt",
				"ttl_a_com_paid_tax_amt"
			},
			{
				$pay_amt,
				$not_appl_bal,
				$ttl_s_amt,
				$ttl_s_com_paid_amt,
				$ttl_s_com_paid_tax_amt,
				$ttl_a_amt,
				$ttl_a_com_paid_amt,
				$ttl_a_com_paid_tax_amt
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
	protected TotalR_MC_A(ConstMetaList<? extends TotalR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public TotalR clone() {
		return (TotalR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public TotalR createInstance() {
		return (TotalR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public TotalR getValues(String... names) {
		return (TotalR) super.getValues(names);
	}



	public mcframe.clientMAUB.MAUBP0060.AmtR pay_amt_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 0, $pay_amt_p);
	}
	
	public void pay_amt_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 0, $pay_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR not_appl_bal_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 1, $not_appl_bal_p);
	}
	
	public void not_appl_bal_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 1, $not_appl_bal_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR ttl_s_amt_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 2, $ttl_s_amt_p);
	}
	
	public void ttl_s_amt_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 2, $ttl_s_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR ttl_s_com_paid_amt_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 3, $ttl_s_com_paid_amt_p);
	}
	
	public void ttl_s_com_paid_amt_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 3, $ttl_s_com_paid_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR ttl_s_com_paid_tax_amt_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 4, $ttl_s_com_paid_tax_amt_p);
	}
	
	public void ttl_s_com_paid_tax_amt_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 4, $ttl_s_com_paid_tax_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR ttl_a_amt_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 5, $ttl_a_amt_p);
	}
	
	public void ttl_a_amt_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 5, $ttl_a_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR ttl_a_com_paid_amt_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 6, $ttl_a_com_paid_amt_p);
	}
	
	public void ttl_a_com_paid_amt_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 6, $ttl_a_com_paid_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR ttl_a_com_paid_tax_amt_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 7, $ttl_a_com_paid_tax_amt_p);
	}
	
	public void ttl_a_com_paid_tax_amt_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 7, $ttl_a_com_paid_tax_amt_p, row);
	}






	public MCRow getInnerRow(String name) {
		if ($pay_amt_p.equalsIgnoreCase(name)) {
			return pay_amt_p();
		}
		if ($not_appl_bal_p.equalsIgnoreCase(name)) {
			return not_appl_bal_p();
		}
		if ($ttl_s_amt_p.equalsIgnoreCase(name)) {
			return ttl_s_amt_p();
		}
		if ($ttl_s_com_paid_amt_p.equalsIgnoreCase(name)) {
			return ttl_s_com_paid_amt_p();
		}
		if ($ttl_s_com_paid_tax_amt_p.equalsIgnoreCase(name)) {
			return ttl_s_com_paid_tax_amt_p();
		}
		if ($ttl_a_amt_p.equalsIgnoreCase(name)) {
			return ttl_a_amt_p();
		}
		if ($ttl_a_com_paid_amt_p.equalsIgnoreCase(name)) {
			return ttl_a_com_paid_amt_p();
		}
		if ($ttl_a_com_paid_tax_amt_p.equalsIgnoreCase(name)) {
			return ttl_a_com_paid_tax_amt_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($pay_amt_p.equalsIgnoreCase(name)) {
			pay_amt_p(
				((MCContainerMeta) pay_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($not_appl_bal_p.equalsIgnoreCase(name)) {
			not_appl_bal_p(
				((MCContainerMeta) not_appl_bal_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($ttl_s_amt_p.equalsIgnoreCase(name)) {
			ttl_s_amt_p(
				((MCContainerMeta) ttl_s_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($ttl_s_com_paid_amt_p.equalsIgnoreCase(name)) {
			ttl_s_com_paid_amt_p(
				((MCContainerMeta) ttl_s_com_paid_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($ttl_s_com_paid_tax_amt_p.equalsIgnoreCase(name)) {
			ttl_s_com_paid_tax_amt_p(
				((MCContainerMeta) ttl_s_com_paid_tax_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($ttl_a_amt_p.equalsIgnoreCase(name)) {
			ttl_a_amt_p(
				((MCContainerMeta) ttl_a_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($ttl_a_com_paid_amt_p.equalsIgnoreCase(name)) {
			ttl_a_com_paid_amt_p(
				((MCContainerMeta) ttl_a_com_paid_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($ttl_a_com_paid_tax_amt_p.equalsIgnoreCase(name)) {
			ttl_a_com_paid_tax_amt_p(
				((MCContainerMeta) ttl_a_com_paid_tax_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Payment amount 支払額.<p>
	 *
	 */
	public MCNumber pay_amt() {
		return pay_amt_p().amt();
	}

	/**
	 * Payment amount 支払額.<p>
	 *
	 */
	public void pay_amt(MCNumber value) {
		pay_amt_p().amt(value);
	}

	/**
	 * Payment amount 支払額.<p>
	 *
	 */
	public void pay_amt(int value) {
		pay_amt_p().amt(value);
	}

	/**
	 * Payment amount 支払額.<p>
	 *
	 */
	public void pay_amt(long value) {
		pay_amt_p().amt(value);
	}

	/**
	 * Payment amount 支払額.<p>
	 *
	 */
	public void pay_amt(float value) {
		pay_amt_p().amt(value);
	}

	/**
	 * Payment amount 支払額.<p>
	 *
	 */
	public void pay_amt(double value) {
		pay_amt_p().amt(value);
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

	/**
	 * Total schedule amount 予定額計.<p>
	 *
	 */
	public MCNumber ttl_s_amt() {
		return ttl_s_amt_p().amt();
	}

	/**
	 * Total schedule amount 予定額計.<p>
	 *
	 */
	public void ttl_s_amt(MCNumber value) {
		ttl_s_amt_p().amt(value);
	}

	/**
	 * Total schedule amount 予定額計.<p>
	 *
	 */
	public void ttl_s_amt(int value) {
		ttl_s_amt_p().amt(value);
	}

	/**
	 * Total schedule amount 予定額計.<p>
	 *
	 */
	public void ttl_s_amt(long value) {
		ttl_s_amt_p().amt(value);
	}

	/**
	 * Total schedule amount 予定額計.<p>
	 *
	 */
	public void ttl_s_amt(float value) {
		ttl_s_amt_p().amt(value);
	}

	/**
	 * Total schedule amount 予定額計.<p>
	 *
	 */
	public void ttl_s_amt(double value) {
		ttl_s_amt_p().amt(value);
	}

	/**
	 * Total fee amount 手数料額計.<p>
	 *
	 */
	public MCNumber ttl_s_com_paid_amt() {
		return ttl_s_com_paid_amt_p().amt();
	}

	/**
	 * Total fee amount 手数料額計.<p>
	 *
	 */
	public void ttl_s_com_paid_amt(MCNumber value) {
		ttl_s_com_paid_amt_p().amt(value);
	}

	/**
	 * Total fee amount 手数料額計.<p>
	 *
	 */
	public void ttl_s_com_paid_amt(int value) {
		ttl_s_com_paid_amt_p().amt(value);
	}

	/**
	 * Total fee amount 手数料額計.<p>
	 *
	 */
	public void ttl_s_com_paid_amt(long value) {
		ttl_s_com_paid_amt_p().amt(value);
	}

	/**
	 * Total fee amount 手数料額計.<p>
	 *
	 */
	public void ttl_s_com_paid_amt(float value) {
		ttl_s_com_paid_amt_p().amt(value);
	}

	/**
	 * Total fee amount 手数料額計.<p>
	 *
	 */
	public void ttl_s_com_paid_amt(double value) {
		ttl_s_com_paid_amt_p().amt(value);
	}

	/**
	 * Total fee tax amount 手数料税額計.<p>
	 *
	 */
	public MCNumber ttl_s_com_paid_tax_amt() {
		return ttl_s_com_paid_tax_amt_p().amt();
	}

	/**
	 * Total fee tax amount 手数料税額計.<p>
	 *
	 */
	public void ttl_s_com_paid_tax_amt(MCNumber value) {
		ttl_s_com_paid_tax_amt_p().amt(value);
	}

	/**
	 * Total fee tax amount 手数料税額計.<p>
	 *
	 */
	public void ttl_s_com_paid_tax_amt(int value) {
		ttl_s_com_paid_tax_amt_p().amt(value);
	}

	/**
	 * Total fee tax amount 手数料税額計.<p>
	 *
	 */
	public void ttl_s_com_paid_tax_amt(long value) {
		ttl_s_com_paid_tax_amt_p().amt(value);
	}

	/**
	 * Total fee tax amount 手数料税額計.<p>
	 *
	 */
	public void ttl_s_com_paid_tax_amt(float value) {
		ttl_s_com_paid_tax_amt_p().amt(value);
	}

	/**
	 * Total fee tax amount 手数料税額計.<p>
	 *
	 */
	public void ttl_s_com_paid_tax_amt(double value) {
		ttl_s_com_paid_tax_amt_p().amt(value);
	}

	/**
	 * Total result amount 実績額計.<p>
	 *
	 */
	public MCNumber ttl_a_amt() {
		return ttl_a_amt_p().amt();
	}

	/**
	 * Total result amount 実績額計.<p>
	 *
	 */
	public void ttl_a_amt(MCNumber value) {
		ttl_a_amt_p().amt(value);
	}

	/**
	 * Total result amount 実績額計.<p>
	 *
	 */
	public void ttl_a_amt(int value) {
		ttl_a_amt_p().amt(value);
	}

	/**
	 * Total result amount 実績額計.<p>
	 *
	 */
	public void ttl_a_amt(long value) {
		ttl_a_amt_p().amt(value);
	}

	/**
	 * Total result amount 実績額計.<p>
	 *
	 */
	public void ttl_a_amt(float value) {
		ttl_a_amt_p().amt(value);
	}

	/**
	 * Total result amount 実績額計.<p>
	 *
	 */
	public void ttl_a_amt(double value) {
		ttl_a_amt_p().amt(value);
	}

	/**
	 * Total result fee amount 実績手数料額計.<p>
	 *
	 */
	public MCNumber ttl_a_com_paid_amt() {
		return ttl_a_com_paid_amt_p().amt();
	}

	/**
	 * Total result fee amount 実績手数料額計.<p>
	 *
	 */
	public void ttl_a_com_paid_amt(MCNumber value) {
		ttl_a_com_paid_amt_p().amt(value);
	}

	/**
	 * Total result fee amount 実績手数料額計.<p>
	 *
	 */
	public void ttl_a_com_paid_amt(int value) {
		ttl_a_com_paid_amt_p().amt(value);
	}

	/**
	 * Total result fee amount 実績手数料額計.<p>
	 *
	 */
	public void ttl_a_com_paid_amt(long value) {
		ttl_a_com_paid_amt_p().amt(value);
	}

	/**
	 * Total result fee amount 実績手数料額計.<p>
	 *
	 */
	public void ttl_a_com_paid_amt(float value) {
		ttl_a_com_paid_amt_p().amt(value);
	}

	/**
	 * Total result fee amount 実績手数料額計.<p>
	 *
	 */
	public void ttl_a_com_paid_amt(double value) {
		ttl_a_com_paid_amt_p().amt(value);
	}

	/**
	 * Total result fee tax amount 実績手数料税額計.<p>
	 *
	 */
	public MCNumber ttl_a_com_paid_tax_amt() {
		return ttl_a_com_paid_tax_amt_p().amt();
	}

	/**
	 * Total result fee tax amount 実績手数料税額計.<p>
	 *
	 */
	public void ttl_a_com_paid_tax_amt(MCNumber value) {
		ttl_a_com_paid_tax_amt_p().amt(value);
	}

	/**
	 * Total result fee tax amount 実績手数料税額計.<p>
	 *
	 */
	public void ttl_a_com_paid_tax_amt(int value) {
		ttl_a_com_paid_tax_amt_p().amt(value);
	}

	/**
	 * Total result fee tax amount 実績手数料税額計.<p>
	 *
	 */
	public void ttl_a_com_paid_tax_amt(long value) {
		ttl_a_com_paid_tax_amt_p().amt(value);
	}

	/**
	 * Total result fee tax amount 実績手数料税額計.<p>
	 *
	 */
	public void ttl_a_com_paid_tax_amt(float value) {
		ttl_a_com_paid_tax_amt_p().amt(value);
	}

	/**
	 * Total result fee tax amount 実績手数料税額計.<p>
	 *
	 */
	public void ttl_a_com_paid_tax_amt(double value) {
		ttl_a_com_paid_tax_amt_p().amt(value);
	}

}

