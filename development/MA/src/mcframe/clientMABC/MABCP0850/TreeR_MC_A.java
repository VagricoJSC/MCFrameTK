package mcframe.clientMABC.MABCP0850;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.clientCore.container.MCKeyList;
import mcframe.clientCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"Tree"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class TreeR_MC_A extends mcframe.clientMABC.MABCP0850.DtlR {

	/**
	 * Sales item system cd. 販売品目体系ＣＤ.<p>
	 *
	 */
	public static final String $tree_sls_itm_grp_cd = "tree_sls_itm_grp_cd";
	/**
	 * Tree row label ツリー行ラベル.<p>
	 *
	 */
	public static final String $tree_row_label = "tree_row_label";
	/**
	 * Upper sales item system cd. 上位販売品目体系ＣＤ.<p>
	 *
	 */
	public static final String $tree_up_sls_itm_grp_cd = "tree_up_sls_itm_grp_cd";


	public static final MCMeta tree_sls_itm_grp_cd_META = createStringMeta($tree_sls_itm_grp_cd);
	public static final MCMeta tree_row_label_META = createStringMeta($tree_row_label);
	public static final MCMeta tree_up_sls_itm_grp_cd_META = createStringMeta($tree_up_sls_itm_grp_cd);

	protected static final ConstMetaList<TreeR> constMetas = new ConstMetaList<TreeR>(
		mcframe.clientMABC.MABCP0850.DtlR.constMetas,
		new MCMeta[]{
			tree_sls_itm_grp_cd_META,
			tree_row_label_META,
			tree_up_sls_itm_grp_cd_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		mcframe.clientMABC.MABCP0850.DtlR.KEYS,
		new String[]{
		}
	);

	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		mcframe.clientMABC.MABCP0850.DtlR.EXTMAP,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
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
	 * "KEYS"グループのキー項目情報を返します。
	 */
	public MCKeyList getKeys(){
		return KEYS;
	}

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
	public MCKeyList getKeys(String aGroup){
		if(aGroup == null) return null;
		return new MCKeyList(EXTMAP.getKeyList(aGroup));
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
	protected TreeR_MC_A(ConstMetaList<? extends TreeR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public TreeR clone() {
		return (TreeR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public TreeR createInstance() {
		return (TreeR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public TreeR getValues(String... names) {
		return (TreeR) super.getValues(names);
	}



	/**
	 * Sales item system cd. 販売品目体系ＣＤ.<p>
	 *
	 */
	public String tree_sls_itm_grp_cd() {
		return getConstString(offset + 0, $tree_sls_itm_grp_cd);
	}

	/**
	 * Sales item system cd. 販売品目体系ＣＤ.<p>
	 *
	 */
	public void tree_sls_itm_grp_cd(String value) {
		setConstString(offset + 0, $tree_sls_itm_grp_cd, value);
	}


	/**
	 * Tree row label ツリー行ラベル.<p>
	 *
	 */
	public String tree_row_label() {
		return getConstString(offset + 1, $tree_row_label);
	}

	/**
	 * Tree row label ツリー行ラベル.<p>
	 *
	 */
	public void tree_row_label(String value) {
		setConstString(offset + 1, $tree_row_label, value);
	}


	/**
	 * Upper sales item system cd. 上位販売品目体系ＣＤ.<p>
	 *
	 */
	public String tree_up_sls_itm_grp_cd() {
		return getConstString(offset + 2, $tree_up_sls_itm_grp_cd);
	}

	/**
	 * Upper sales item system cd. 上位販売品目体系ＣＤ.<p>
	 *
	 */
	public void tree_up_sls_itm_grp_cd(String value) {
		setConstString(offset + 2, $tree_up_sls_itm_grp_cd, value);
	}


	public String getString(String name) {
		if ($tree_sls_itm_grp_cd.equalsIgnoreCase(name)) {
			return tree_sls_itm_grp_cd();
		}
		if ($tree_row_label.equalsIgnoreCase(name)) {
			return tree_row_label();
		}
		if ($tree_up_sls_itm_grp_cd.equalsIgnoreCase(name)) {
			return tree_up_sls_itm_grp_cd();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($tree_sls_itm_grp_cd.equalsIgnoreCase(name)) {
			return tree_sls_itm_grp_cd();
		}
		if ($tree_row_label.equalsIgnoreCase(name)) {
			return tree_row_label();
		}
		if ($tree_up_sls_itm_grp_cd.equalsIgnoreCase(name)) {
			return tree_up_sls_itm_grp_cd();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($tree_sls_itm_grp_cd.equalsIgnoreCase(name)) {
			tree_sls_itm_grp_cd(value);
			return;
		}
		if ($tree_row_label.equalsIgnoreCase(name)) {
			tree_row_label(value);
			return;
		}
		if ($tree_up_sls_itm_grp_cd.equalsIgnoreCase(name)) {
			tree_up_sls_itm_grp_cd(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($tree_sls_itm_grp_cd.equalsIgnoreCase(name)) {
			tree_sls_itm_grp_cd(value);
			return;
		}
		if ($tree_row_label.equalsIgnoreCase(name)) {
			tree_row_label(value);
			return;
		}
		if ($tree_up_sls_itm_grp_cd.equalsIgnoreCase(name)) {
			tree_up_sls_itm_grp_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}



}

