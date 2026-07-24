package mcframe.serverMAUC.MAUCL0020;

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
 * ブロック"Gd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class GdR_MC_A extends MCConstRow {

	/**
	 * Grading 格付.<p>
	 *
	 */
	public static final String $gd = "gd";

	public static final String $gd_cd = $gd + ".gd_cd";
	public static final String $gd_nm = $gd + ".gd_nm";

	public static final MCMeta gd_META = createInnerRowMeta($gd, mcframe.serverMA.dbc.MAM_STK_GD_R.class);

	protected static final ConstMetaList<GdR> constMetas = new ConstMetaList<GdR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			gd_META
		},
		new String[][]{
			{
				"gd_cd",
				"gd_nm"
			},
			{
				$gd_cd,
				$gd_nm
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
	protected GdR_MC_A(ConstMetaList<? extends GdR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public GdR clone() {
		return (GdR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public GdR createInstance() {
		return (GdR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public GdR getValues(String... names) {
		return (GdR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Grading 格付.<p>
	 *
	 */
	public mcframe.serverMA.dbc.MAM_STK_GD_R gd(){
		return (mcframe.serverMA.dbc.MAM_STK_GD_R) getConstInnerRow(offset + 0, $gd);
	}
	
	/**
	 * Grading 格付.<p>
	 *
	 */
	public void gd(mcframe.serverMA.dbc.MAM_STK_GD_R row){
		setConstInnerRow(offset + 0, $gd, row);
	}






	public MCRow getInnerRow(String name) {
		if ($gd.equalsIgnoreCase(name)) {
			return gd();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($gd.equalsIgnoreCase(name)) {
			gd(
				((MCContainerMeta) gd_META).castInnerRow(mcframe.serverMA.dbc.MAM_STK_GD_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return gd().gd_cd();
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		gd().gd_cd(value);
	}

	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public String gd_nm() {
		return gd().gd_nm();
	}

	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		gd().gd_nm(value);
	}

}

