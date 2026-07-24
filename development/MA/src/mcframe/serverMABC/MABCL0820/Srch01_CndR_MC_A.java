package mcframe.serverMABC.MABCL0820;

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
	 * Parameter key パラメータキー.<p>
	 *
	 */
	public static final String $parm_key = "parm_key";
	/**
	 * Business classification 業務分類.<p>
	 *
	 */
	public static final String $parm_biz_grp = "parm_biz_grp";
	/**
	 * Parameter overview パラメータ概要.<p>
	 *
	 */
	public static final String $parm_remark = "parm_remark";
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


	public static final MCMeta parm_key_META = createCommonMeta($parm_key, mcframe.commonMA.meta.MA_META.PARM_KEY);
	public static final MCMeta parm_biz_grp_META = createCommonMeta($parm_biz_grp, mcframe.commonMA.meta.MA_META.PARM_BIZ_GRP);
	public static final MCMeta parm_remark_META = createCommonMeta($parm_remark, mcframe.commonMA.meta.MA_META.PARM_REMARK);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);

	protected static final ConstMetaList<Srch01_CndR> constMetas = new ConstMetaList<Srch01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			parm_key_META,
			parm_biz_grp_META,
			parm_remark_META,
			memo1_META,
			memo2_META,
			memo3_META
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
	 * Parameter key パラメータキー.<p>
	 *
	 */
	public String parm_key() {
		return getConstString(offset + 0, $parm_key);
	}

	/**
	 * Parameter key パラメータキー.<p>
	 *
	 */
	public void parm_key(String value) {
		setConstString(offset + 0, $parm_key, value);
	}


	/**
	 * Business classification 業務分類.<p>
	 *
	 */
	public String parm_biz_grp() {
		return getConstString(offset + 1, $parm_biz_grp);
	}

	/**
	 * Business classification 業務分類.<p>
	 *
	 */
	public void parm_biz_grp(String value) {
		setConstString(offset + 1, $parm_biz_grp, value);
	}


	/**
	 * Parameter overview パラメータ概要.<p>
	 *
	 */
	public String parm_remark() {
		return getConstString(offset + 2, $parm_remark);
	}

	/**
	 * Parameter overview パラメータ概要.<p>
	 *
	 */
	public void parm_remark(String value) {
		setConstString(offset + 2, $parm_remark, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 3, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 3, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 4, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 4, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 5, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 5, $memo3, value);
	}


	public String getString(String name) {
		if ($parm_key.equalsIgnoreCase(name)) {
			return parm_key();
		}
		if ($parm_biz_grp.equalsIgnoreCase(name)) {
			return parm_biz_grp();
		}
		if ($parm_remark.equalsIgnoreCase(name)) {
			return parm_remark();
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

	public String getStringNE(String name) {
		if ($parm_key.equalsIgnoreCase(name)) {
			return parm_key();
		}
		if ($parm_biz_grp.equalsIgnoreCase(name)) {
			return parm_biz_grp();
		}
		if ($parm_remark.equalsIgnoreCase(name)) {
			return parm_remark();
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

	public void setString(String name, String value) {
		if ($parm_key.equalsIgnoreCase(name)) {
			parm_key(value);
			return;
		}
		if ($parm_biz_grp.equalsIgnoreCase(name)) {
			parm_biz_grp(value);
			return;
		}
		if ($parm_remark.equalsIgnoreCase(name)) {
			parm_remark(value);
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

	public void setStringNE(String name, String value) {
		if ($parm_key.equalsIgnoreCase(name)) {
			parm_key(value);
			return;
		}
		if ($parm_biz_grp.equalsIgnoreCase(name)) {
			parm_biz_grp(value);
			return;
		}
		if ($parm_remark.equalsIgnoreCase(name)) {
			parm_remark(value);
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



}

