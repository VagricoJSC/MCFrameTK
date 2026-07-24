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
 * ブロック"ShipSchd_Ctrl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ShipSchd_CtrlR_MC_A extends MCConstRow {

	/**
	 * Shipping lot check 出荷ロットチェック.<p>
	 *
	 */
	public static final String $lot_chk_flg = "lot_chk_flg";


	public static final MCMeta lot_chk_flg_META = createCommonMeta($lot_chk_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<ShipSchd_CtrlR> constMetas = new ConstMetaList<ShipSchd_CtrlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			lot_chk_flg_META
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
	protected ShipSchd_CtrlR_MC_A(ConstMetaList<? extends ShipSchd_CtrlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ShipSchd_CtrlR clone() {
		return (ShipSchd_CtrlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ShipSchd_CtrlR createInstance() {
		return (ShipSchd_CtrlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ShipSchd_CtrlR getValues(String... names) {
		return (ShipSchd_CtrlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Shipping lot check 出荷ロットチェック.<p>
	 *
	 */
	public boolean lot_chk_flg() {
		return getConstBoolean(offset + 0, $lot_chk_flg);
	}

	/**
	 * Shipping lot check 出荷ロットチェック.<p>
	 *
	 */
	public void lot_chk_flg(boolean value) {
		setConstBoolean(offset + 0, $lot_chk_flg, value);
	}


	public boolean getBoolean(String name) {
		if ($lot_chk_flg.equalsIgnoreCase(name)) {
			return lot_chk_flg();
		}
		return super.getBoolean(name);
	}

	public boolean getBooleanNE(String name) {
		if ($lot_chk_flg.equalsIgnoreCase(name)) {
			return lot_chk_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setBoolean(String name, boolean value) {
		if ($lot_chk_flg.equalsIgnoreCase(name)) {
			lot_chk_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($lot_chk_flg.equalsIgnoreCase(name)) {
			lot_chk_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

