package mcframe.serverMSBE.MSBEL2610;

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
 * ブロック"Del02_Ctrl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Del02_CtrlR_MC_A extends MCConstRow {

	/**
	 * Keep counted qty. flg. 実棚数量保持ＦＬＧ.<p>
	 *
	 */
	public static final String $act_qty_keep_flg = "act_qty_keep_flg";


	public static final MCMeta act_qty_keep_flg_META = createCommonMeta($act_qty_keep_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Del02_CtrlR> constMetas = new ConstMetaList<Del02_CtrlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			act_qty_keep_flg_META
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
	protected Del02_CtrlR_MC_A(ConstMetaList<? extends Del02_CtrlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Del02_CtrlR clone() {
		return (Del02_CtrlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Del02_CtrlR createInstance() {
		return (Del02_CtrlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Del02_CtrlR getValues(String... names) {
		return (Del02_CtrlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Keep counted qty. flg. 実棚数量保持ＦＬＧ.<p>
	 *
	 */
	public boolean act_qty_keep_flg() {
		return getConstBoolean(offset + 0, $act_qty_keep_flg);
	}

	/**
	 * Keep counted qty. flg. 実棚数量保持ＦＬＧ.<p>
	 *
	 */
	public void act_qty_keep_flg(boolean value) {
		setConstBoolean(offset + 0, $act_qty_keep_flg, value);
	}


	public boolean getBoolean(String name) {
		if ($act_qty_keep_flg.equalsIgnoreCase(name)) {
			return act_qty_keep_flg();
		}
		return super.getBoolean(name);
	}

	public boolean getBooleanNE(String name) {
		if ($act_qty_keep_flg.equalsIgnoreCase(name)) {
			return act_qty_keep_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setBoolean(String name, boolean value) {
		if ($act_qty_keep_flg.equalsIgnoreCase(name)) {
			act_qty_keep_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($act_qty_keep_flg.equalsIgnoreCase(name)) {
			act_qty_keep_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

