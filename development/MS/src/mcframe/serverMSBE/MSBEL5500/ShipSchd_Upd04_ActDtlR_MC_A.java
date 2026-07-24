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
 * ブロック"ShipSchd_Upd04_ActDtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ShipSchd_Upd04_ActDtlR_MC_A extends MCConstRow {

	/**
	 * Shipping invoice result details No. インボイス出荷実績明細ＮＯ.<p>
	 *
	 */
	public static final String $iv_ship_act_d_no = "iv_ship_act_d_no";
	/**
	 * Shipping result details No. 出荷実績明細ＮＯ.<p>
	 *
	 */
	public static final String $ship_act_d_no = "ship_act_d_no";


	public static final MCMeta iv_ship_act_d_no_META = createCommonMeta($iv_ship_act_d_no, mcframe.commonMA.meta.MA_META.IV_SHIP_ACT_D_NO);
	public static final MCMeta ship_act_d_no_META = createCommonMeta($ship_act_d_no, mcframe.commonMA.meta.MA_META.SHIP_ACT_D_NO);

	protected static final ConstMetaList<ShipSchd_Upd04_ActDtlR> constMetas = new ConstMetaList<ShipSchd_Upd04_ActDtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			iv_ship_act_d_no_META,
			ship_act_d_no_META
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
	protected ShipSchd_Upd04_ActDtlR_MC_A(ConstMetaList<? extends ShipSchd_Upd04_ActDtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ShipSchd_Upd04_ActDtlR clone() {
		return (ShipSchd_Upd04_ActDtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ShipSchd_Upd04_ActDtlR createInstance() {
		return (ShipSchd_Upd04_ActDtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ShipSchd_Upd04_ActDtlR getValues(String... names) {
		return (ShipSchd_Upd04_ActDtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Shipping invoice result details No. インボイス出荷実績明細ＮＯ.<p>
	 *
	 */
	public String iv_ship_act_d_no() {
		return getConstString(offset + 0, $iv_ship_act_d_no);
	}

	/**
	 * Shipping invoice result details No. インボイス出荷実績明細ＮＯ.<p>
	 *
	 */
	public void iv_ship_act_d_no(String value) {
		setConstString(offset + 0, $iv_ship_act_d_no, value);
	}


	/**
	 * Shipping result details No. 出荷実績明細ＮＯ.<p>
	 *
	 */
	public String ship_act_d_no() {
		return getConstString(offset + 1, $ship_act_d_no);
	}

	/**
	 * Shipping result details No. 出荷実績明細ＮＯ.<p>
	 *
	 */
	public void ship_act_d_no(String value) {
		setConstString(offset + 1, $ship_act_d_no, value);
	}


	public String getString(String name) {
		if ($iv_ship_act_d_no.equalsIgnoreCase(name)) {
			return iv_ship_act_d_no();
		}
		if ($ship_act_d_no.equalsIgnoreCase(name)) {
			return ship_act_d_no();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($iv_ship_act_d_no.equalsIgnoreCase(name)) {
			return iv_ship_act_d_no();
		}
		if ($ship_act_d_no.equalsIgnoreCase(name)) {
			return ship_act_d_no();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($iv_ship_act_d_no.equalsIgnoreCase(name)) {
			iv_ship_act_d_no(value);
			return;
		}
		if ($ship_act_d_no.equalsIgnoreCase(name)) {
			ship_act_d_no(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($iv_ship_act_d_no.equalsIgnoreCase(name)) {
			iv_ship_act_d_no(value);
			return;
		}
		if ($ship_act_d_no.equalsIgnoreCase(name)) {
			ship_act_d_no(value);
			return;
		}
		super.setStringNE(name, value);
	}



}

