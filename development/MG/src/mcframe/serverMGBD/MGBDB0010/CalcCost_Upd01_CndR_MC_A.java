package mcframe.serverMGBD.MGBDB0010;

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
 * ブロック"CalcCost_Upd01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class CalcCost_Upd01_CndR_MC_A extends MCConstRow {

	/**
	 * Calculation run pattern cd. 計算実行パタンＣＤ.<p>
	 *
	 */
	public static final String $act_ptn_cd = "act_ptn_cd";


	public static final MCMeta act_ptn_cd_META = createCommonMeta($act_ptn_cd, mcframe.commonMA.meta.MA_META.ACT_PTN_CD);

	protected static final ConstMetaList<CalcCost_Upd01_CndR> constMetas = new ConstMetaList<CalcCost_Upd01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			act_ptn_cd_META
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
	protected CalcCost_Upd01_CndR_MC_A(ConstMetaList<? extends CalcCost_Upd01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CalcCost_Upd01_CndR clone() {
		return (CalcCost_Upd01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CalcCost_Upd01_CndR createInstance() {
		return (CalcCost_Upd01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CalcCost_Upd01_CndR getValues(String... names) {
		return (CalcCost_Upd01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Calculation run pattern cd. 計算実行パタンＣＤ.<p>
	 *
	 */
	public String act_ptn_cd() {
		return getConstString(offset + 0, $act_ptn_cd);
	}

	/**
	 * Calculation run pattern cd. 計算実行パタンＣＤ.<p>
	 *
	 */
	public void act_ptn_cd(String value) {
		setConstString(offset + 0, $act_ptn_cd, value);
	}


	public String getString(String name) {
		if ($act_ptn_cd.equalsIgnoreCase(name)) {
			return act_ptn_cd();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($act_ptn_cd.equalsIgnoreCase(name)) {
			return act_ptn_cd();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($act_ptn_cd.equalsIgnoreCase(name)) {
			act_ptn_cd(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($act_ptn_cd.equalsIgnoreCase(name)) {
			act_ptn_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}



}

