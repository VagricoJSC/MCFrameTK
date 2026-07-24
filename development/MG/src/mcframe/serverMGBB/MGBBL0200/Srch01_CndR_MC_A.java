package mcframe.serverMGBB.MGBBL0200;

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
 * ブロック"Srch01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_CndR_MC_A extends MCConstRow {

	/**
	 * Result ID 実績ＩＤ.<p>
	 *
	 */
	public static final String $act_id = "act_id";
	/**
	 * Result ID branch No. 実績ＩＤ枝番.<p>
	 *
	 */
	public static final String $act_id_sub = "act_id_sub";


	public static final MCMeta act_id_META = createCommonMeta($act_id, mcframe.commonMG.meta.MG_META.ACT_ID);
	public static final MCMeta act_id_sub_META = createCommonMeta($act_id_sub, mcframe.commonMG.meta.MG_META.ACT_ID_SUB);

	protected static final ConstMetaList<Srch01_CndR> constMetas = new ConstMetaList<Srch01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			act_id_META,
			act_id_sub_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
	/** 項目属性情報のグループ[FLG_COL]のキー定数 */
	public static final String $$FLG_COL = "FLG_COL";
	/** 項目属性情報のグループ[COL_SQL]のキー定数 */
	public static final String $$COL_SQL = "COL_SQL";
	/** 項目属性情報のグループ[SUM_SQL]のキー定数 */
	public static final String $$SUM_SQL = "SUM_SQL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$FLG_COL, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$COL_SQL, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SUM_SQL, new MCExtList(
			new String[][]{
			}
		))
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
	protected Srch01_CndR_MC_A(ConstMetaList<? extends Srch01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR clone() {
		return (Srch01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR createInstance() {
		return (Srch01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR getValues(String... names) {
		return (Srch01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Result ID 実績ＩＤ.<p>
	 *
	 */
	public String act_id() {
		return getConstString(offset + 0, $act_id);
	}

	/**
	 * Result ID 実績ＩＤ.<p>
	 *
	 */
	public void act_id(String value) {
		setConstString(offset + 0, $act_id, value);
	}


	/**
	 * Result ID branch No. 実績ＩＤ枝番.<p>
	 *
	 */
	public String act_id_sub() {
		return getConstString(offset + 1, $act_id_sub);
	}

	/**
	 * Result ID branch No. 実績ＩＤ枝番.<p>
	 *
	 */
	public void act_id_sub(String value) {
		setConstString(offset + 1, $act_id_sub, value);
	}


	public String getString(String name) {
		if ($act_id.equalsIgnoreCase(name)) {
			return act_id();
		}
		if ($act_id_sub.equalsIgnoreCase(name)) {
			return act_id_sub();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($act_id.equalsIgnoreCase(name)) {
			return act_id();
		}
		if ($act_id_sub.equalsIgnoreCase(name)) {
			return act_id_sub();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($act_id.equalsIgnoreCase(name)) {
			act_id(value);
			return;
		}
		if ($act_id_sub.equalsIgnoreCase(name)) {
			act_id_sub(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($act_id.equalsIgnoreCase(name)) {
			act_id(value);
			return;
		}
		if ($act_id_sub.equalsIgnoreCase(name)) {
			act_id_sub(value);
			return;
		}
		super.setStringNE(name, value);
	}



}

