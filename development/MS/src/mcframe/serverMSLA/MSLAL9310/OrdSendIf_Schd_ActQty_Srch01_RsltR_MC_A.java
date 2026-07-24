package mcframe.serverMSLA.MSLAL9310;

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
 * ブロック"OrdSendIf_Schd_ActQty_Srch01_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class OrdSendIf_Schd_ActQty_Srch01_RsltR_MC_A extends MCConstRow {

	public static final String $schd_act_qty = "schd_act_qty";

	public static final String $ext_itm_ord_no = $schd_act_qty + ".ext_itm_ord_no";
	public static final String $ext_oper_ord_no = $schd_act_qty + ".ext_oper_ord_no";
	public static final String $wg_cd = $schd_act_qty + ".wg_cd";
	public static final String $itm_ord_no = $schd_act_qty + ".itm_ord_no";
	public static final String $oper_ord_no = $schd_act_qty + ".oper_ord_no";
	public static final String $itm_ord_sts_typ = $schd_act_qty + ".itm_ord_sts_typ";
	public static final String $oper_ord_sts_typ = $schd_act_qty + ".oper_ord_sts_typ";
	public static final String $itm_cd = $schd_act_qty + ".itm_cd";
	public static final String $itm_sub1 = $schd_act_qty + ".itm_sub1";
	public static final String $itm_sub2 = $schd_act_qty + ".itm_sub2";
	public static final String $itm_sub3 = $schd_act_qty + ".itm_sub3";
	public static final String $act_qty = $schd_act_qty + ".act_qty";
	public static final String $base_unit_cd = $schd_act_qty + ".base_unit_cd";
	public static final String $base_unit_nm = $schd_act_qty + ".base_unit_nm";

	public static final MCMeta schd_act_qty_META = createInnerRowMeta($schd_act_qty, mcframe.serverMS.dbc.MST_ORDSND_ACT_QTY_IF_R.class);

	protected static final ConstMetaList<OrdSendIf_Schd_ActQty_Srch01_RsltR> constMetas = new ConstMetaList<OrdSendIf_Schd_ActQty_Srch01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			schd_act_qty_META
		},
		new String[][]{
			{
				"ext_itm_ord_no",
				"ext_oper_ord_no",
				"wg_cd",
				"itm_ord_no",
				"oper_ord_no",
				"itm_ord_sts_typ",
				"oper_ord_sts_typ",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"act_qty",
				"base_unit_cd",
				"base_unit_nm"
			},
			{
				$ext_itm_ord_no,
				$ext_oper_ord_no,
				$wg_cd,
				$itm_ord_no,
				$oper_ord_no,
				$itm_ord_sts_typ,
				$oper_ord_sts_typ,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$act_qty,
				$base_unit_cd,
				$base_unit_nm
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
	protected OrdSendIf_Schd_ActQty_Srch01_RsltR_MC_A(ConstMetaList<? extends OrdSendIf_Schd_ActQty_Srch01_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public OrdSendIf_Schd_ActQty_Srch01_RsltR clone() {
		return (OrdSendIf_Schd_ActQty_Srch01_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public OrdSendIf_Schd_ActQty_Srch01_RsltR createInstance() {
		return (OrdSendIf_Schd_ActQty_Srch01_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public OrdSendIf_Schd_ActQty_Srch01_RsltR getValues(String... names) {
		return (OrdSendIf_Schd_ActQty_Srch01_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	public mcframe.serverMS.dbc.MST_ORDSND_ACT_QTY_IF_R schd_act_qty(){
		return (mcframe.serverMS.dbc.MST_ORDSND_ACT_QTY_IF_R) getConstInnerRow(offset + 0, $schd_act_qty);
	}
	
	public void schd_act_qty(mcframe.serverMS.dbc.MST_ORDSND_ACT_QTY_IF_R row){
		setConstInnerRow(offset + 0, $schd_act_qty, row);
	}






	public MCRow getInnerRow(String name) {
		if ($schd_act_qty.equalsIgnoreCase(name)) {
			return schd_act_qty();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($schd_act_qty.equalsIgnoreCase(name)) {
			schd_act_qty(
				((MCContainerMeta) schd_act_qty_META).castInnerRow(mcframe.serverMS.dbc.MST_ORDSND_ACT_QTY_IF_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * External item order No. 外部品目オーダＮＯ.<p>
	 *
	 */
	public String ext_itm_ord_no() {
		return schd_act_qty().ext_itm_ord_no();
	}

	/**
	 * External item order No. 外部品目オーダＮＯ.<p>
	 *
	 */
	public void ext_itm_ord_no(String value) {
		schd_act_qty().ext_itm_ord_no(value);
	}

	/**
	 * External operation order No. 外部工程オーダＮＯ.<p>
	 *
	 */
	public String ext_oper_ord_no() {
		return schd_act_qty().ext_oper_ord_no();
	}

	/**
	 * External operation order No. 外部工程オーダＮＯ.<p>
	 *
	 */
	public void ext_oper_ord_no(String value) {
		schd_act_qty().ext_oper_ord_no(value);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return schd_act_qty().wg_cd();
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		schd_act_qty().wg_cd(value);
	}

	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public String itm_ord_no() {
		return schd_act_qty().itm_ord_no();
	}

	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public void itm_ord_no(String value) {
		schd_act_qty().itm_ord_no(value);
	}

	/**
	 * Operation order No. 工程オーダＮＯ.<p>
	 *
	 */
	public String oper_ord_no() {
		return schd_act_qty().oper_ord_no();
	}

	/**
	 * Operation order No. 工程オーダＮＯ.<p>
	 *
	 */
	public void oper_ord_no(String value) {
		schd_act_qty().oper_ord_no(value);
	}

	/**
	 * Item order status type 品目オーダ状況区分.<p>
	 *
	 */
	public String itm_ord_sts_typ() {
		return schd_act_qty().itm_ord_sts_typ();
	}

	/**
	 * Item order status type 品目オーダ状況区分.<p>
	 *
	 */
	public void itm_ord_sts_typ(String value) {
		schd_act_qty().itm_ord_sts_typ(value);
	}

	/**
	 * Operation order status type 工程オーダ状況区分.<p>
	 *
	 */
	public String oper_ord_sts_typ() {
		return schd_act_qty().oper_ord_sts_typ();
	}

	/**
	 * Operation order status type 工程オーダ状況区分.<p>
	 *
	 */
	public void oper_ord_sts_typ(String value) {
		schd_act_qty().oper_ord_sts_typ(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return schd_act_qty().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		schd_act_qty().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return schd_act_qty().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		schd_act_qty().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return schd_act_qty().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		schd_act_qty().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return schd_act_qty().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		schd_act_qty().itm_sub3(value);
	}

	/**
	 * Result qty. 実績数量.<p>
	 *
	 */
	public MCNumber act_qty() {
		return schd_act_qty().act_qty();
	}

	/**
	 * Result qty. 実績数量.<p>
	 *
	 */
	public void act_qty(MCNumber value) {
		schd_act_qty().act_qty(value);
	}

	/**
	 * Result qty. 実績数量.<p>
	 *
	 */
	public void act_qty(int value) {
		schd_act_qty().act_qty(value);
	}

	/**
	 * Result qty. 実績数量.<p>
	 *
	 */
	public void act_qty(long value) {
		schd_act_qty().act_qty(value);
	}

	/**
	 * Result qty. 実績数量.<p>
	 *
	 */
	public void act_qty(float value) {
		schd_act_qty().act_qty(value);
	}

	/**
	 * Result qty. 実績数量.<p>
	 *
	 */
	public void act_qty(double value) {
		schd_act_qty().act_qty(value);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return schd_act_qty().base_unit_cd();
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		schd_act_qty().base_unit_cd(value);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return schd_act_qty().base_unit_nm();
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		schd_act_qty().base_unit_nm(value);
	}

}

