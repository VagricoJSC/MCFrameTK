package mcframe.serverMSBE.MSBEL2620;

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
 * ブロック"Imp01_Ctrl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Imp01_CtrlR_MC_A extends MCConstRow {

	/**
	 * Input method 入力方法.<p>
	 *
	 */
	public static final String $input_mtd = "input_mtd";


	public static final MCMeta input_mtd_META = createCommonMeta($input_mtd, mcframe.commonMA.meta.MA_META.FLG_STR);

	protected static final ConstMetaList<Imp01_CtrlR> constMetas = new ConstMetaList<Imp01_CtrlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			input_mtd_META
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
	protected Imp01_CtrlR_MC_A(ConstMetaList<? extends Imp01_CtrlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Imp01_CtrlR clone() {
		return (Imp01_CtrlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Imp01_CtrlR createInstance() {
		return (Imp01_CtrlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Imp01_CtrlR getValues(String... names) {
		return (Imp01_CtrlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Input method 入力方法.<p>
	 *
	 */
	public String input_mtd() {
		return getConstString(offset + 0, $input_mtd);
	}

	/**
	 * Input method 入力方法.<p>
	 *
	 */
	public void input_mtd(String value) {
		setConstString(offset + 0, $input_mtd, value);
	}


	public String getString(String name) {
		if ($input_mtd.equalsIgnoreCase(name)) {
			return input_mtd();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($input_mtd.equalsIgnoreCase(name)) {
			return input_mtd();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($input_mtd.equalsIgnoreCase(name)) {
			input_mtd(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($input_mtd.equalsIgnoreCase(name)) {
			input_mtd(value);
			return;
		}
		super.setStringNE(name, value);
	}



}

