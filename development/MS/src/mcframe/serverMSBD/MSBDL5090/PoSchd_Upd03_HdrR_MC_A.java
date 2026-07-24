package mcframe.serverMSBD.MSBDL5090;

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
 * ブロック"PoSchd_Upd03_Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class PoSchd_Upd03_HdrR_MC_A extends MCConstRow {

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	public static final String $po_schd = "po_schd";

	public static final String $po_schd_no = $po_schd + ".po_schd_no";
	public static final String $po_schd_src_typ = $po_schd + ".po_schd_src_typ";
	public static final String $po_schd_src_no = $po_schd + ".po_schd_src_no";
	public static final String $base_unit_qty = $po_schd + ".base_unit_qty";
	public static final String $pln_itm_ord_no = $po_schd + ".pln_itm_ord_no";
	public static final String $split_src_schd_no = $po_schd + ".split_src_schd_no";
	public static final String $po_schd_chg_typ = $po_schd + ".po_schd_chg_typ";
	public static final String $can_flg = $po_schd + ".can_flg";
	public static final String $org_flg = $po_schd + ".org_flg";

	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta po_schd_META = createInnerRowMeta($po_schd, mcframe.serverMS.dbc.MST_PO_SCHD_R.class);

	protected static final ConstMetaList<PoSchd_Upd03_HdrR> constMetas = new ConstMetaList<PoSchd_Upd03_HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			data_crud_typ_META,
			po_schd_META
		},
		new String[][]{
			{
				"po_schd_no",
				"po_schd_src_typ",
				"po_schd_src_no",
				"base_unit_qty",
				"pln_itm_ord_no",
				"split_src_schd_no",
				"po_schd_chg_typ",
				"can_flg",
				"org_flg"
			},
			{
				$po_schd_no,
				$po_schd_src_typ,
				$po_schd_src_no,
				$base_unit_qty,
				$pln_itm_ord_no,
				$split_src_schd_no,
				$po_schd_chg_typ,
				$can_flg,
				$org_flg
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
	protected PoSchd_Upd03_HdrR_MC_A(ConstMetaList<? extends PoSchd_Upd03_HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PoSchd_Upd03_HdrR clone() {
		return (PoSchd_Upd03_HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PoSchd_Upd03_HdrR createInstance() {
		return (PoSchd_Upd03_HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PoSchd_Upd03_HdrR getValues(String... names) {
		return (PoSchd_Upd03_HdrR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 0, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 0, $data_crud_typ, value);
	}


	public mcframe.serverMS.dbc.MST_PO_SCHD_R po_schd(){
		return (mcframe.serverMS.dbc.MST_PO_SCHD_R) getConstInnerRow(offset + 1, $po_schd);
	}
	
	public void po_schd(mcframe.serverMS.dbc.MST_PO_SCHD_R row){
		setConstInnerRow(offset + 1, $po_schd, row);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($po_schd.equalsIgnoreCase(name)) {
			return po_schd();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($po_schd.equalsIgnoreCase(name)) {
			po_schd(
				((MCContainerMeta) po_schd_META).castInnerRow(mcframe.serverMS.dbc.MST_PO_SCHD_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * PO schedule No. 発注予定ＮＯ.<p>
	 *
	 */
	public String po_schd_no() {
		return po_schd().po_schd_no();
	}

	/**
	 * PO schedule No. 発注予定ＮＯ.<p>
	 *
	 */
	public void po_schd_no(String value) {
		po_schd().po_schd_no(value);
	}

	/**
	 * PO schedule creating source type 発注予定作成元区分.<p>
	 *
	 */
	public String po_schd_src_typ() {
		return po_schd().po_schd_src_typ();
	}

	/**
	 * PO schedule creating source type 発注予定作成元区分.<p>
	 *
	 */
	public void po_schd_src_typ(String value) {
		po_schd().po_schd_src_typ(value);
	}

	/**
	 * PO schedule creating source No. 発注予定作成元ＮＯ.<p>
	 *
	 */
	public String po_schd_src_no() {
		return po_schd().po_schd_src_no();
	}

	/**
	 * PO schedule creating source No. 発注予定作成元ＮＯ.<p>
	 *
	 */
	public void po_schd_src_no(String value) {
		po_schd().po_schd_src_no(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return po_schd().base_unit_qty();
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		po_schd().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		po_schd().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		po_schd().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		po_schd().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		po_schd().base_unit_qty(value);
	}

	/**
	 * Plan item order No. 計画品目オーダＮＯ.<p>
	 *
	 */
	public String pln_itm_ord_no() {
		return po_schd().pln_itm_ord_no();
	}

	/**
	 * Plan item order No. 計画品目オーダＮＯ.<p>
	 *
	 */
	public void pln_itm_ord_no(String value) {
		po_schd().pln_itm_ord_no(value);
	}

	/**
	 * Schedule split source No. 分割元予定ＮＯ.<p>
	 *
	 */
	public String split_src_schd_no() {
		return po_schd().split_src_schd_no();
	}

	/**
	 * Schedule split source No. 分割元予定ＮＯ.<p>
	 *
	 */
	public void split_src_schd_no(String value) {
		po_schd().split_src_schd_no(value);
	}

	/**
	 * PO schedule change type 発注予定変更区分.<p>
	 *
	 */
	public String po_schd_chg_typ() {
		return po_schd().po_schd_chg_typ();
	}

	/**
	 * PO schedule change type 発注予定変更区分.<p>
	 *
	 */
	public void po_schd_chg_typ(String value) {
		po_schd().po_schd_chg_typ(value);
	}

	/**
	 * Cancel 取消.<p>
	 *
	 */
	public boolean can_flg() {
		return po_schd().can_flg();
	}

	/**
	 * Cancel 取消.<p>
	 *
	 */
	public void can_flg(boolean value) {
		po_schd().can_flg(value);
	}

	/**
	 * Source schedule 元予定.<p>
	 *
	 */
	public boolean org_flg() {
		return po_schd().org_flg();
	}

	/**
	 * Source schedule 元予定.<p>
	 *
	 */
	public void org_flg(boolean value) {
		po_schd().org_flg(value);
	}

}

