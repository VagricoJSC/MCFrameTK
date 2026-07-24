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
 * ブロック"ShipSchd_Upd05_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ShipSchd_Upd05_DtlR_MC_A extends MCConstRow {

	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public static final String $ship_schd_no = "ship_schd_no";
	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public static final String $dlv_slip_d_no = "dlv_slip_d_no";
	/**
	 * Shipping return 出荷返品.<p>
	 *
	 */
	public static final String $ship_ret_flg = "ship_ret_flg";


	public static final MCMeta ship_schd_no_META = createCommonMeta($ship_schd_no, mcframe.commonMA.meta.MA_META.SHIP_SCHD_NO);
	public static final MCMeta dlv_slip_d_no_META = createCommonMeta($dlv_slip_d_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_D_NO);
	public static final MCMeta ship_ret_flg_META = createCommonMeta($ship_ret_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<ShipSchd_Upd05_DtlR> constMetas = new ConstMetaList<ShipSchd_Upd05_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ship_schd_no_META,
			dlv_slip_d_no_META,
			ship_ret_flg_META
		},
		new String[][]{
			{
			},
			{
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
	protected ShipSchd_Upd05_DtlR_MC_A(ConstMetaList<? extends ShipSchd_Upd05_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ShipSchd_Upd05_DtlR clone() {
		return (ShipSchd_Upd05_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ShipSchd_Upd05_DtlR createInstance() {
		return (ShipSchd_Upd05_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ShipSchd_Upd05_DtlR getValues(String... names) {
		return (ShipSchd_Upd05_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public String ship_schd_no() {
		return getConstString(offset + 0, $ship_schd_no);
	}

	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public void ship_schd_no(String value) {
		setConstString(offset + 0, $ship_schd_no, value);
	}


	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public String dlv_slip_d_no() {
		return getConstString(offset + 1, $dlv_slip_d_no);
	}

	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public void dlv_slip_d_no(String value) {
		setConstString(offset + 1, $dlv_slip_d_no, value);
	}


	/**
	 * Shipping return 出荷返品.<p>
	 *
	 */
	public boolean ship_ret_flg() {
		return getConstBoolean(offset + 2, $ship_ret_flg);
	}

	/**
	 * Shipping return 出荷返品.<p>
	 *
	 */
	public void ship_ret_flg(boolean value) {
		setConstBoolean(offset + 2, $ship_ret_flg, value);
	}


	public String getString(String name) {
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			return ship_schd_no();
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_d_no();
		}
		return super.getString(name);
	}
	public boolean getBoolean(String name) {
		if ($ship_ret_flg.equalsIgnoreCase(name)) {
			return ship_ret_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			return ship_schd_no();
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_d_no();
		}
		return super.getStringNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($ship_ret_flg.equalsIgnoreCase(name)) {
			return ship_ret_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			ship_schd_no(value);
			return;
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			dlv_slip_d_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($ship_ret_flg.equalsIgnoreCase(name)) {
			ship_ret_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			ship_schd_no(value);
			return;
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			dlv_slip_d_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($ship_ret_flg.equalsIgnoreCase(name)) {
			ship_ret_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

