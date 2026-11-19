package mcframe.serverMSBB.MSBBL1210;

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
 * ブロック"ExpByKey01_Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ExpByKey01_HdrR_MC_A extends MCConstRow {

	/**
	 *  照合キー.<p>
	 *
	 */
	public static final String $match_key = "match_key";
	/**
	 *  枝番.<p>
	 *
	 */
	public static final String $sub = "sub";
	/**
	 *  区分.<p>
	 *
	 */
	public static final String $typ = "typ";


	public static final MCMeta match_key_META = createCommonMeta($match_key, mcframe.commonMA.meta.MA_META.MATCH_KEY);
	public static final MCMeta sub_META = createCommonMeta($sub, mcframe.commonMA.meta.MA_META.SUB);
	public static final MCMeta typ_META = createCommonMeta($typ, mcframe.commonMA.meta.MA_META.TYP);

	protected static final ConstMetaList<ExpByKey01_HdrR> constMetas = new ConstMetaList<ExpByKey01_HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			match_key_META,
			sub_META,
			typ_META
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
	protected ExpByKey01_HdrR_MC_A(ConstMetaList<? extends ExpByKey01_HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ExpByKey01_HdrR clone() {
		return (ExpByKey01_HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ExpByKey01_HdrR createInstance() {
		return (ExpByKey01_HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ExpByKey01_HdrR getValues(String... names) {
		return (ExpByKey01_HdrR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  照合キー.<p>
	 *
	 */
	public String match_key() {
		return getConstString(offset + 0, $match_key);
	}

	/**
	 *  照合キー.<p>
	 *
	 */
	public void match_key(String value) {
		setConstString(offset + 0, $match_key, value);
	}


	/**
	 *  枝番.<p>
	 *
	 */
	public MCNumber sub() {
		return getConstNumber(offset + 1, $sub);
	}

	/**
	 *  枝番.<p>
	 *
	 */
	public void sub(MCNumber value) {
		setConstNumber(offset + 1, $sub, value);
	}

	/**
	 *  枝番.<p>
	 *
	 */
	public void sub(int value) {
		setConstNumber(offset + 1, $sub, value);
	}

	/**
	 *  枝番.<p>
	 *
	 */
	public void sub(long value) {
		setConstNumber(offset + 1, $sub, value);
	}

	/**
	 *  枝番.<p>
	 *
	 */
	public void sub(float value) {
		setConstNumber(offset + 1, $sub, value);
	}

	/**
	 *  枝番.<p>
	 *
	 */
	public void sub(double value) {
		setConstNumber(offset + 1, $sub, value);
	}


	/**
	 *  区分.<p>
	 *
	 */
	public MCNumber typ() {
		return getConstNumber(offset + 2, $typ);
	}

	/**
	 *  区分.<p>
	 *
	 */
	public void typ(MCNumber value) {
		setConstNumber(offset + 2, $typ, value);
	}

	/**
	 *  区分.<p>
	 *
	 */
	public void typ(int value) {
		setConstNumber(offset + 2, $typ, value);
	}

	/**
	 *  区分.<p>
	 *
	 */
	public void typ(long value) {
		setConstNumber(offset + 2, $typ, value);
	}

	/**
	 *  区分.<p>
	 *
	 */
	public void typ(float value) {
		setConstNumber(offset + 2, $typ, value);
	}

	/**
	 *  区分.<p>
	 *
	 */
	public void typ(double value) {
		setConstNumber(offset + 2, $typ, value);
	}


	public String getString(String name) {
		if ($match_key.equalsIgnoreCase(name)) {
			return match_key();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($sub.equalsIgnoreCase(name)) {
			return sub();
		}
		if ($typ.equalsIgnoreCase(name)) {
			return typ();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($match_key.equalsIgnoreCase(name)) {
			return match_key();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($sub.equalsIgnoreCase(name)) {
			return sub();
		}
		if ($typ.equalsIgnoreCase(name)) {
			return typ();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($match_key.equalsIgnoreCase(name)) {
			match_key(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($sub.equalsIgnoreCase(name)) {
			sub(value);
			return;
		}
		if ($typ.equalsIgnoreCase(name)) {
			typ(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($sub.equalsIgnoreCase(name)) {
			sub(value);
			return;
		}
		if ($typ.equalsIgnoreCase(name)) {
			typ(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($sub.equalsIgnoreCase(name)) {
			sub(value);
			return;
		}
		if ($typ.equalsIgnoreCase(name)) {
			typ(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($sub.equalsIgnoreCase(name)) {
			sub(value);
			return;
		}
		if ($typ.equalsIgnoreCase(name)) {
			typ(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($sub.equalsIgnoreCase(name)) {
			sub(value);
			return;
		}
		if ($typ.equalsIgnoreCase(name)) {
			typ(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($match_key.equalsIgnoreCase(name)) {
			match_key(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($sub.equalsIgnoreCase(name)) {
			sub(value);
			return;
		}
		if ($typ.equalsIgnoreCase(name)) {
			typ(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($sub.equalsIgnoreCase(name)) {
			sub(value);
			return;
		}
		if ($typ.equalsIgnoreCase(name)) {
			typ(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($sub.equalsIgnoreCase(name)) {
			sub(value);
			return;
		}
		if ($typ.equalsIgnoreCase(name)) {
			typ(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($sub.equalsIgnoreCase(name)) {
			sub(value);
			return;
		}
		if ($typ.equalsIgnoreCase(name)) {
			typ(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($sub.equalsIgnoreCase(name)) {
			sub(value);
			return;
		}
		if ($typ.equalsIgnoreCase(name)) {
			typ(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

