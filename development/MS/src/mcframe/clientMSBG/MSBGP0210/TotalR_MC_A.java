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
 * ブロック"Total"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class TotalR_MC_A extends MCConstRow {

	public static final String $total_rcv_amt_p = "total_rcv_amt_p";
	public static final String $total_setoff_rcv_amt_p = "total_setoff_rcv_amt_p";
	public static final String $total_setoff_rcv_amt2_p = "total_setoff_rcv_amt2_p";
	public static final String $total_appl_amt_p = "total_appl_amt_p";

	public static final String $total_rcv_amt = $total_rcv_amt_p + ".amt";
	public static final String $total_setoff_rcv_amt = $total_setoff_rcv_amt_p + ".amt";
	public static final String $total_setoff_rcv_amt2 = $total_setoff_rcv_amt2_p + ".amt";
	public static final String $total_appl_amt = $total_appl_amt_p + ".amt";

	public static final MCMeta total_rcv_amt_p_META = createInnerRowMeta($total_rcv_amt_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta total_setoff_rcv_amt_p_META = createInnerRowMeta($total_setoff_rcv_amt_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta total_setoff_rcv_amt2_p_META = createInnerRowMeta($total_setoff_rcv_amt2_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta total_appl_amt_p_META = createInnerRowMeta($total_appl_amt_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);

	protected static final ConstMetaList<TotalR> constMetas = new ConstMetaList<TotalR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			total_rcv_amt_p_META,
			total_setoff_rcv_amt_p_META,
			total_setoff_rcv_amt2_p_META,
			total_appl_amt_p_META
		},
		new String[][]{
			{
				"total_rcv_amt",
				"total_setoff_rcv_amt",
				"total_setoff_rcv_amt2",
				"total_appl_amt"
			},
			{
				$total_rcv_amt,
				$total_setoff_rcv_amt,
				$total_setoff_rcv_amt2,
				$total_appl_amt
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



	public mcframe.clientMAUB.MAUBP0060.AmtR total_rcv_amt_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 0, $total_rcv_amt_p);
	}
	
	public void total_rcv_amt_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 0, $total_rcv_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR total_setoff_rcv_amt_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 1, $total_setoff_rcv_amt_p);
	}
	
	public void total_setoff_rcv_amt_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 1, $total_setoff_rcv_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR total_setoff_rcv_amt2_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 2, $total_setoff_rcv_amt2_p);
	}
	
	public void total_setoff_rcv_amt2_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 2, $total_setoff_rcv_amt2_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR total_appl_amt_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 3, $total_appl_amt_p);
	}
	
	public void total_appl_amt_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 3, $total_appl_amt_p, row);
	}






	public MCRow getInnerRow(String name) {
		if ($total_rcv_amt_p.equalsIgnoreCase(name)) {
			return total_rcv_amt_p();
		}
		if ($total_setoff_rcv_amt_p.equalsIgnoreCase(name)) {
			return total_setoff_rcv_amt_p();
		}
		if ($total_setoff_rcv_amt2_p.equalsIgnoreCase(name)) {
			return total_setoff_rcv_amt2_p();
		}
		if ($total_appl_amt_p.equalsIgnoreCase(name)) {
			return total_appl_amt_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($total_rcv_amt_p.equalsIgnoreCase(name)) {
			total_rcv_amt_p(
				((MCContainerMeta) total_rcv_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($total_setoff_rcv_amt_p.equalsIgnoreCase(name)) {
			total_setoff_rcv_amt_p(
				((MCContainerMeta) total_setoff_rcv_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($total_setoff_rcv_amt2_p.equalsIgnoreCase(name)) {
			total_setoff_rcv_amt2_p(
				((MCContainerMeta) total_setoff_rcv_amt2_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($total_appl_amt_p.equalsIgnoreCase(name)) {
			total_appl_amt_p(
				((MCContainerMeta) total_appl_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Total payment received amount 入金額計.<p>
	 *
	 */
	public MCNumber total_rcv_amt() {
		return total_rcv_amt_p().amt();
	}

	/**
	 * Total payment received amount 入金額計.<p>
	 *
	 */
	public void total_rcv_amt(MCNumber value) {
		total_rcv_amt_p().amt(value);
	}

	/**
	 * Total payment received amount 入金額計.<p>
	 *
	 */
	public void total_rcv_amt(int value) {
		total_rcv_amt_p().amt(value);
	}

	/**
	 * Total payment received amount 入金額計.<p>
	 *
	 */
	public void total_rcv_amt(long value) {
		total_rcv_amt_p().amt(value);
	}

	/**
	 * Total payment received amount 入金額計.<p>
	 *
	 */
	public void total_rcv_amt(float value) {
		total_rcv_amt_p().amt(value);
	}

	/**
	 * Total payment received amount 入金額計.<p>
	 *
	 */
	public void total_rcv_amt(double value) {
		total_rcv_amt_p().amt(value);
	}

	/**
	 * Offset amount total 相殺額計.<p>
	 *
	 */
	public MCNumber total_setoff_rcv_amt() {
		return total_setoff_rcv_amt_p().amt();
	}

	/**
	 * Offset amount total 相殺額計.<p>
	 *
	 */
	public void total_setoff_rcv_amt(MCNumber value) {
		total_setoff_rcv_amt_p().amt(value);
	}

	/**
	 * Offset amount total 相殺額計.<p>
	 *
	 */
	public void total_setoff_rcv_amt(int value) {
		total_setoff_rcv_amt_p().amt(value);
	}

	/**
	 * Offset amount total 相殺額計.<p>
	 *
	 */
	public void total_setoff_rcv_amt(long value) {
		total_setoff_rcv_amt_p().amt(value);
	}

	/**
	 * Offset amount total 相殺額計.<p>
	 *
	 */
	public void total_setoff_rcv_amt(float value) {
		total_setoff_rcv_amt_p().amt(value);
	}

	/**
	 * Offset amount total 相殺額計.<p>
	 *
	 */
	public void total_setoff_rcv_amt(double value) {
		total_setoff_rcv_amt_p().amt(value);
	}

	/**
	 * Offset amount total 相殺額計.<p>
	 *
	 */
	public MCNumber total_setoff_rcv_amt2() {
		return total_setoff_rcv_amt2_p().amt();
	}

	/**
	 * Offset amount total 相殺額計.<p>
	 *
	 */
	public void total_setoff_rcv_amt2(MCNumber value) {
		total_setoff_rcv_amt2_p().amt(value);
	}

	/**
	 * Offset amount total 相殺額計.<p>
	 *
	 */
	public void total_setoff_rcv_amt2(int value) {
		total_setoff_rcv_amt2_p().amt(value);
	}

	/**
	 * Offset amount total 相殺額計.<p>
	 *
	 */
	public void total_setoff_rcv_amt2(long value) {
		total_setoff_rcv_amt2_p().amt(value);
	}

	/**
	 * Offset amount total 相殺額計.<p>
	 *
	 */
	public void total_setoff_rcv_amt2(float value) {
		total_setoff_rcv_amt2_p().amt(value);
	}

	/**
	 * Offset amount total 相殺額計.<p>
	 *
	 */
	public void total_setoff_rcv_amt2(double value) {
		total_setoff_rcv_amt2_p().amt(value);
	}

	/**
	 * Total reconciled amount 消込額計.<p>
	 *
	 */
	public MCNumber total_appl_amt() {
		return total_appl_amt_p().amt();
	}

	/**
	 * Total reconciled amount 消込額計.<p>
	 *
	 */
	public void total_appl_amt(MCNumber value) {
		total_appl_amt_p().amt(value);
	}

	/**
	 * Total reconciled amount 消込額計.<p>
	 *
	 */
	public void total_appl_amt(int value) {
		total_appl_amt_p().amt(value);
	}

	/**
	 * Total reconciled amount 消込額計.<p>
	 *
	 */
	public void total_appl_amt(long value) {
		total_appl_amt_p().amt(value);
	}

	/**
	 * Total reconciled amount 消込額計.<p>
	 *
	 */
	public void total_appl_amt(float value) {
		total_appl_amt_p().amt(value);
	}

	/**
	 * Total reconciled amount 消込額計.<p>
	 *
	 */
	public void total_appl_amt(double value) {
		total_appl_amt_p().amt(value);
	}

}

