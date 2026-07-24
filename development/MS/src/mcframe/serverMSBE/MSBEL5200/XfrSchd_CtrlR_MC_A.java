package mcframe.serverMSBE.MSBEL5200;

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
 * ブロック"XfrSchd_Ctrl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class XfrSchd_CtrlR_MC_A extends MCConstRow {

	/**
	 * Screen call flg. 画面呼出ＦＬＧ.<p>
	 *
	 */
	public static final String $screen_flg = "screen_flg";


	public static final MCMeta screen_flg_META = createCommonMeta($screen_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<XfrSchd_CtrlR> constMetas = new ConstMetaList<XfrSchd_CtrlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			screen_flg_META
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
	protected XfrSchd_CtrlR_MC_A(ConstMetaList<? extends XfrSchd_CtrlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public XfrSchd_CtrlR clone() {
		return (XfrSchd_CtrlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public XfrSchd_CtrlR createInstance() {
		return (XfrSchd_CtrlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public XfrSchd_CtrlR getValues(String... names) {
		return (XfrSchd_CtrlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Screen call flg. 画面呼出ＦＬＧ.<p>
	 *
	 */
	public boolean screen_flg() {
		return getConstBoolean(offset + 0, $screen_flg);
	}

	/**
	 * Screen call flg. 画面呼出ＦＬＧ.<p>
	 *
	 */
	public void screen_flg(boolean value) {
		setConstBoolean(offset + 0, $screen_flg, value);
	}


	public boolean getBoolean(String name) {
		if ($screen_flg.equalsIgnoreCase(name)) {
			return screen_flg();
		}
		return super.getBoolean(name);
	}

	public boolean getBooleanNE(String name) {
		if ($screen_flg.equalsIgnoreCase(name)) {
			return screen_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setBoolean(String name, boolean value) {
		if ($screen_flg.equalsIgnoreCase(name)) {
			screen_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($screen_flg.equalsIgnoreCase(name)) {
			screen_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

