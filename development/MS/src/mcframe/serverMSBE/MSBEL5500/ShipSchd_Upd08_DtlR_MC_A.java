package mcframe.serverMSBE.MSBEL5500;

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
 * ブロック"ShipSchd_Upd08_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ShipSchd_Upd08_DtlR_MC_A extends MCConstRow {

	/**
	 * Shipping schedule 出荷予定.<p>
	 *
	 */
	public static final String $ss = "ss";

	public static final String $ship_schd_no = $ss + ".ship_schd_no";
	public static final String $sls_act_d_no = $ss + ".sls_act_d_no";

	public static final MCMeta ss_META = createInnerRowMeta($ss, mcframe.serverMS.dbc.MST_SHIP_SCHD_R.class);

	protected static final ConstMetaList<ShipSchd_Upd08_DtlR> constMetas = new ConstMetaList<ShipSchd_Upd08_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ss_META
		},
		new String[][]{
			{
				"ship_schd_no",
				"sls_act_d_no"
			},
			{
				$ship_schd_no,
				$sls_act_d_no
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
	protected ShipSchd_Upd08_DtlR_MC_A(ConstMetaList<? extends ShipSchd_Upd08_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ShipSchd_Upd08_DtlR clone() {
		return (ShipSchd_Upd08_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ShipSchd_Upd08_DtlR createInstance() {
		return (ShipSchd_Upd08_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ShipSchd_Upd08_DtlR getValues(String... names) {
		return (ShipSchd_Upd08_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Shipping schedule 出荷予定.<p>
	 *
	 */
	public mcframe.serverMS.dbc.MST_SHIP_SCHD_R ss(){
		return (mcframe.serverMS.dbc.MST_SHIP_SCHD_R) getConstInnerRow(offset + 0, $ss);
	}
	
	/**
	 * Shipping schedule 出荷予定.<p>
	 *
	 */
	public void ss(mcframe.serverMS.dbc.MST_SHIP_SCHD_R row){
		setConstInnerRow(offset + 0, $ss, row);
	}






	public MCRow getInnerRow(String name) {
		if ($ss.equalsIgnoreCase(name)) {
			return ss();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($ss.equalsIgnoreCase(name)) {
			ss(
				((MCContainerMeta) ss_META).castInnerRow(mcframe.serverMS.dbc.MST_SHIP_SCHD_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public String ship_schd_no() {
		return ss().ship_schd_no();
	}

	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public void ship_schd_no(String value) {
		ss().ship_schd_no(value);
	}

	/**
	 * Sales result details No. 売上実績明細ＮＯ.<p>
	 *
	 */
	public String sls_act_d_no() {
		return ss().sls_act_d_no();
	}

	/**
	 * Sales result details No. 売上実績明細ＮＯ.<p>
	 *
	 */
	public void sls_act_d_no(String value) {
		ss().sls_act_d_no(value);
	}

}

