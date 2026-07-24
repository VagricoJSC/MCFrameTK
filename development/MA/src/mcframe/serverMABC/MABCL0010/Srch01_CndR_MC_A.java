package mcframe.serverMABC.MABCL0010;

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
	 * Master マスタ.<p>
	 *
	 */
	public static final String $mst_nm = "mst_nm";
	/**
	 * Master name マスタ名.<p>
	 *
	 */
	public static final String $mst_nm_nm = "mst_nm_nm";
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public static final String $memo1 = "memo1";
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public static final String $memo2 = "memo2";
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public static final String $memo3 = "memo3";
	/**
	 * Partial match 部分一致.<p>
	 *
	 */
	public static final String $match_typ1 = "match_typ1";


	public static final MCMeta mst_nm_META = createCommonMeta($mst_nm, mcframe.commonMA.meta.MA_META.ORA_OBJ_NM);
	public static final MCMeta mst_nm_nm_META = createCommonMeta($mst_nm_nm, mcframe.commonMA.meta.MA_META.ORA_OBJ_NM);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
	public static final MCMeta match_typ1_META = createCommonMeta($match_typ1, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Srch01_CndR> constMetas = new ConstMetaList<Srch01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			mst_nm_META,
			mst_nm_nm_META,
			memo1_META,
			memo2_META,
			memo3_META,
			match_typ1_META
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

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
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
	 * Master マスタ.<p>
	 *
	 */
	public String mst_nm() {
		return getConstString(offset + 0, $mst_nm);
	}

	/**
	 * Master マスタ.<p>
	 *
	 */
	public void mst_nm(String value) {
		setConstString(offset + 0, $mst_nm, value);
	}


	/**
	 * Master name マスタ名.<p>
	 *
	 */
	public String mst_nm_nm() {
		return getConstString(offset + 1, $mst_nm_nm);
	}

	/**
	 * Master name マスタ名.<p>
	 *
	 */
	public void mst_nm_nm(String value) {
		setConstString(offset + 1, $mst_nm_nm, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 2, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 2, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 3, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 3, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 4, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 4, $memo3, value);
	}


	/**
	 * Partial match 部分一致.<p>
	 *
	 */
	public boolean match_typ1() {
		return getConstBoolean(offset + 5, $match_typ1);
	}

	/**
	 * Partial match 部分一致.<p>
	 *
	 */
	public void match_typ1(boolean value) {
		setConstBoolean(offset + 5, $match_typ1, value);
	}


	public String getString(String name) {
		if ($mst_nm.equalsIgnoreCase(name)) {
			return mst_nm();
		}
		if ($mst_nm_nm.equalsIgnoreCase(name)) {
			return mst_nm_nm();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
		}
		return super.getString(name);
	}
	public boolean getBoolean(String name) {
		if ($match_typ1.equalsIgnoreCase(name)) {
			return match_typ1();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($mst_nm.equalsIgnoreCase(name)) {
			return mst_nm();
		}
		if ($mst_nm_nm.equalsIgnoreCase(name)) {
			return mst_nm_nm();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
		}
		return super.getStringNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($match_typ1.equalsIgnoreCase(name)) {
			return match_typ1();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($mst_nm.equalsIgnoreCase(name)) {
			mst_nm(value);
			return;
		}
		if ($mst_nm_nm.equalsIgnoreCase(name)) {
			mst_nm_nm(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
			return;
		}
		super.setString(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($match_typ1.equalsIgnoreCase(name)) {
			match_typ1(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($mst_nm.equalsIgnoreCase(name)) {
			mst_nm(value);
			return;
		}
		if ($mst_nm_nm.equalsIgnoreCase(name)) {
			mst_nm_nm(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($match_typ1.equalsIgnoreCase(name)) {
			match_typ1(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

