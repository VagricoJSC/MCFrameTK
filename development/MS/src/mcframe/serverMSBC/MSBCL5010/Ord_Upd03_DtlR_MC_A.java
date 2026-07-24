package mcframe.serverMSBC.MSBCL5010;

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
 * ブロック"Ord_Upd03_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Ord_Upd03_DtlR_MC_A extends MCConstRow {

	public static final String $wk = "wk";

	public static final String $itm_ord_no = $wk + ".itm_ord_no";
	public static final String $oper_cd = $wk + ".oper_cd";
	public static final String $oper_seq = $wk + ".oper_seq";
	public static final String $st_schd_tm = $wk + ".st_schd_tm";
	public static final String $end_schd_tm = $wk + ".end_schd_tm";
	public static final String $oper_ord_sts_typ = $wk + ".oper_ord_sts_typ";
	public static final String $oper_schd_qty = $wk + ".oper_schd_qty";

	public static final MCMeta wk_META = createInnerRowMeta($wk, mcframe.serverMS.dbc.MSW_OPER_ORDER_R.class);

	protected static final ConstMetaList<Ord_Upd03_DtlR> constMetas = new ConstMetaList<Ord_Upd03_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			wk_META
		},
		new String[][]{
			{
				"itm_ord_no",
				"oper_cd",
				"oper_seq",
				"st_schd_tm",
				"end_schd_tm",
				"oper_ord_sts_typ",
				"oper_schd_qty"
			},
			{
				$itm_ord_no,
				$oper_cd,
				$oper_seq,
				$st_schd_tm,
				$end_schd_tm,
				$oper_ord_sts_typ,
				$oper_schd_qty
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
	protected Ord_Upd03_DtlR_MC_A(ConstMetaList<? extends Ord_Upd03_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Ord_Upd03_DtlR clone() {
		return (Ord_Upd03_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Ord_Upd03_DtlR createInstance() {
		return (Ord_Upd03_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Ord_Upd03_DtlR getValues(String... names) {
		return (Ord_Upd03_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	public mcframe.serverMS.dbc.MSW_OPER_ORDER_R wk(){
		return (mcframe.serverMS.dbc.MSW_OPER_ORDER_R) getConstInnerRow(offset + 0, $wk);
	}
	
	public void wk(mcframe.serverMS.dbc.MSW_OPER_ORDER_R row){
		setConstInnerRow(offset + 0, $wk, row);
	}






	public MCRow getInnerRow(String name) {
		if ($wk.equalsIgnoreCase(name)) {
			return wk();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($wk.equalsIgnoreCase(name)) {
			wk(
				((MCContainerMeta) wk_META).castInnerRow(mcframe.serverMS.dbc.MSW_OPER_ORDER_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public String itm_ord_no() {
		return wk().itm_ord_no();
	}

	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public void itm_ord_no(String value) {
		wk().itm_ord_no(value);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return wk().oper_cd();
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		wk().oper_cd(value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public MCNumber oper_seq() {
		return wk().oper_seq();
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(MCNumber value) {
		wk().oper_seq(value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(int value) {
		wk().oper_seq(value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(long value) {
		wk().oper_seq(value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(float value) {
		wk().oper_seq(value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(double value) {
		wk().oper_seq(value);
	}

	/**
	 * Scheduled operation start date and time 工程着手予定日時.<p>
	 *
	 */
	public MCDate st_schd_tm() {
		return wk().st_schd_tm();
	}

	/**
	 * Scheduled operation start date and time 工程着手予定日時.<p>
	 *
	 */
	public void st_schd_tm(MCDate value) {
		wk().st_schd_tm(value);
	}

	/**
	 * Scheduled operation end date and time 工程終了予定日時.<p>
	 *
	 */
	public MCDate end_schd_tm() {
		return wk().end_schd_tm();
	}

	/**
	 * Scheduled operation end date and time 工程終了予定日時.<p>
	 *
	 */
	public void end_schd_tm(MCDate value) {
		wk().end_schd_tm(value);
	}

	/**
	 * Operation order status type 工程オーダ状況区分.<p>
	 *
	 */
	public String oper_ord_sts_typ() {
		return wk().oper_ord_sts_typ();
	}

	/**
	 * Operation order status type 工程オーダ状況区分.<p>
	 *
	 */
	public void oper_ord_sts_typ(String value) {
		wk().oper_ord_sts_typ(value);
	}

	/**
	 * Operation order qty. 工程指図数量.<p>
	 *
	 */
	public MCNumber oper_schd_qty() {
		return wk().oper_schd_qty();
	}

	/**
	 * Operation order qty. 工程指図数量.<p>
	 *
	 */
	public void oper_schd_qty(MCNumber value) {
		wk().oper_schd_qty(value);
	}

	/**
	 * Operation order qty. 工程指図数量.<p>
	 *
	 */
	public void oper_schd_qty(int value) {
		wk().oper_schd_qty(value);
	}

	/**
	 * Operation order qty. 工程指図数量.<p>
	 *
	 */
	public void oper_schd_qty(long value) {
		wk().oper_schd_qty(value);
	}

	/**
	 * Operation order qty. 工程指図数量.<p>
	 *
	 */
	public void oper_schd_qty(float value) {
		wk().oper_schd_qty(value);
	}

	/**
	 * Operation order qty. 工程指図数量.<p>
	 *
	 */
	public void oper_schd_qty(double value) {
		wk().oper_schd_qty(value);
	}

}

