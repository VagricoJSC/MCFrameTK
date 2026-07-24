package mcframe.clientMSBG.MSBGP0080;

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
 * ブロック"Dtl2Btn"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Dtl2BtnR_MC_A extends MCConstRow {

	public static final String $schd_amt_ttl_p = "schd_amt_ttl_p";
	public static final String $schd_amt_diff_p = "schd_amt_diff_p";

	public static final String $schd_amt_ttl = $schd_amt_ttl_p + ".amt";
	public static final String $schd_amt_diff = $schd_amt_diff_p + ".amt";

	public static final MCMeta schd_amt_ttl_p_META = createInnerRowMeta($schd_amt_ttl_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta schd_amt_diff_p_META = createInnerRowMeta($schd_amt_diff_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);

	protected static final ConstMetaList<Dtl2BtnR> constMetas = new ConstMetaList<Dtl2BtnR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			schd_amt_ttl_p_META,
			schd_amt_diff_p_META
		},
		new String[][]{
			{
				"schd_amt_ttl",
				"schd_amt_diff"
			},
			{
				$schd_amt_ttl,
				$schd_amt_diff
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
	protected Dtl2BtnR_MC_A(ConstMetaList<? extends Dtl2BtnR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Dtl2BtnR clone() {
		return (Dtl2BtnR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Dtl2BtnR createInstance() {
		return (Dtl2BtnR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Dtl2BtnR getValues(String... names) {
		return (Dtl2BtnR) super.getValues(names);
	}



	public mcframe.clientMAUB.MAUBP0060.AmtR schd_amt_ttl_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 0, $schd_amt_ttl_p);
	}
	
	public void schd_amt_ttl_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 0, $schd_amt_ttl_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR schd_amt_diff_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 1, $schd_amt_diff_p);
	}
	
	public void schd_amt_diff_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 1, $schd_amt_diff_p, row);
	}






	public MCRow getInnerRow(String name) {
		if ($schd_amt_ttl_p.equalsIgnoreCase(name)) {
			return schd_amt_ttl_p();
		}
		if ($schd_amt_diff_p.equalsIgnoreCase(name)) {
			return schd_amt_diff_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($schd_amt_ttl_p.equalsIgnoreCase(name)) {
			schd_amt_ttl_p(
				((MCContainerMeta) schd_amt_ttl_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($schd_amt_diff_p.equalsIgnoreCase(name)) {
			schd_amt_diff_p(
				((MCContainerMeta) schd_amt_diff_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Total of schedule 予定合計.<p>
	 *
	 */
	public MCNumber schd_amt_ttl() {
		return schd_amt_ttl_p().amt();
	}

	/**
	 * Total of schedule 予定合計.<p>
	 *
	 */
	public void schd_amt_ttl(MCNumber value) {
		schd_amt_ttl_p().amt(value);
	}

	/**
	 * Total of schedule 予定合計.<p>
	 *
	 */
	public void schd_amt_ttl(int value) {
		schd_amt_ttl_p().amt(value);
	}

	/**
	 * Total of schedule 予定合計.<p>
	 *
	 */
	public void schd_amt_ttl(long value) {
		schd_amt_ttl_p().amt(value);
	}

	/**
	 * Total of schedule 予定合計.<p>
	 *
	 */
	public void schd_amt_ttl(float value) {
		schd_amt_ttl_p().amt(value);
	}

	/**
	 * Total of schedule 予定合計.<p>
	 *
	 */
	public void schd_amt_ttl(double value) {
		schd_amt_ttl_p().amt(value);
	}

	/**
	 * Schedule variance 予定差額.<p>
	 *
	 */
	public MCNumber schd_amt_diff() {
		return schd_amt_diff_p().amt();
	}

	/**
	 * Schedule variance 予定差額.<p>
	 *
	 */
	public void schd_amt_diff(MCNumber value) {
		schd_amt_diff_p().amt(value);
	}

	/**
	 * Schedule variance 予定差額.<p>
	 *
	 */
	public void schd_amt_diff(int value) {
		schd_amt_diff_p().amt(value);
	}

	/**
	 * Schedule variance 予定差額.<p>
	 *
	 */
	public void schd_amt_diff(long value) {
		schd_amt_diff_p().amt(value);
	}

	/**
	 * Schedule variance 予定差額.<p>
	 *
	 */
	public void schd_amt_diff(float value) {
		schd_amt_diff_p().amt(value);
	}

	/**
	 * Schedule variance 予定差額.<p>
	 *
	 */
	public void schd_amt_diff(double value) {
		schd_amt_diff_p().amt(value);
	}

}

