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
 * ブロック"PoSchd_Upd04_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class PoSchd_Upd04_DtlR_MC_A extends MCConstRow {

	/**
	 * Update itself only 自身のみ更新.<p>
	 *
	 */
	public static final String $only_own_upd_flg = "only_own_upd_flg";
	public static final String $po_schd = "po_schd";

	public static final String $po_schd_no = $po_schd + ".po_schd_no";
	public static final String $po_schd_src_typ = $po_schd + ".po_schd_src_typ";
	public static final String $po_schd_src_no = $po_schd + ".po_schd_src_no";
	public static final String $rqst_crrct_flg = $po_schd + ".rqst_crrct_flg";
	public static final String $rqst_can_flg = $po_schd + ".rqst_can_flg";

	public static final MCMeta only_own_upd_flg_META = createCommonMeta($only_own_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta po_schd_META = createInnerRowMeta($po_schd, mcframe.serverMS.dbc.MST_PO_SCHD_R.class);

	protected static final ConstMetaList<PoSchd_Upd04_DtlR> constMetas = new ConstMetaList<PoSchd_Upd04_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			only_own_upd_flg_META,
			po_schd_META
		},
		new String[][]{
			{
				"po_schd_no",
				"po_schd_src_typ",
				"po_schd_src_no",
				"rqst_crrct_flg",
				"rqst_can_flg"
			},
			{
				$po_schd_no,
				$po_schd_src_typ,
				$po_schd_src_no,
				$rqst_crrct_flg,
				$rqst_can_flg
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
	protected PoSchd_Upd04_DtlR_MC_A(ConstMetaList<? extends PoSchd_Upd04_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PoSchd_Upd04_DtlR clone() {
		return (PoSchd_Upd04_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PoSchd_Upd04_DtlR createInstance() {
		return (PoSchd_Upd04_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PoSchd_Upd04_DtlR getValues(String... names) {
		return (PoSchd_Upd04_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Update itself only 自身のみ更新.<p>
	 *
	 */
	public boolean only_own_upd_flg() {
		return getConstBoolean(offset + 0, $only_own_upd_flg);
	}

	/**
	 * Update itself only 自身のみ更新.<p>
	 *
	 */
	public void only_own_upd_flg(boolean value) {
		setConstBoolean(offset + 0, $only_own_upd_flg, value);
	}


	public mcframe.serverMS.dbc.MST_PO_SCHD_R po_schd(){
		return (mcframe.serverMS.dbc.MST_PO_SCHD_R) getConstInnerRow(offset + 1, $po_schd);
	}
	
	public void po_schd(mcframe.serverMS.dbc.MST_PO_SCHD_R row){
		setConstInnerRow(offset + 1, $po_schd, row);
	}


	public boolean getBoolean(String name) {
		if ($only_own_upd_flg.equalsIgnoreCase(name)) {
			return only_own_upd_flg();
		}
		return super.getBoolean(name);
	}

	public boolean getBooleanNE(String name) {
		if ($only_own_upd_flg.equalsIgnoreCase(name)) {
			return only_own_upd_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setBoolean(String name, boolean value) {
		if ($only_own_upd_flg.equalsIgnoreCase(name)) {
			only_own_upd_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($only_own_upd_flg.equalsIgnoreCase(name)) {
			only_own_upd_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
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
	 * Edited by request source 依頼元訂正.<p>
	 *
	 */
	public boolean rqst_crrct_flg() {
		return po_schd().rqst_crrct_flg();
	}

	/**
	 * Edited by request source 依頼元訂正.<p>
	 *
	 */
	public void rqst_crrct_flg(boolean value) {
		po_schd().rqst_crrct_flg(value);
	}

	/**
	 * Unpegged 紐切れ.<p>
	 *
	 */
	public boolean rqst_can_flg() {
		return po_schd().rqst_can_flg();
	}

	/**
	 * Unpegged 紐切れ.<p>
	 *
	 */
	public void rqst_can_flg(boolean value) {
		po_schd().rqst_can_flg(value);
	}

}

