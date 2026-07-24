package mcframe.clientMABC.MABCP0280;

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
 * ブロック"Tree1"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Tree1R_MC_A extends mcframe.clientMABC.MABCP0280.DtlR {

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public static final String $tree_dpt_cd = "tree_dpt_cd";
	/**
	 * Tree row label ツリー行ラベル.<p>
	 *
	 */
	public static final String $tree_row_label = "tree_row_label";
	/**
	 * Upper dept. cd. 上位部門ＣＤ.<p>
	 *
	 */
	public static final String $tree_up_lv_dpt_cd = "tree_up_lv_dpt_cd";
	/**
	 * Drop flg. ドロップＦＬＧ.<p>
	 *
	 */
	public static final String $tree_drop_flg = "tree_drop_flg";


	public static final MCMeta tree_dpt_cd_META = createStringMeta($tree_dpt_cd);
	public static final MCMeta tree_row_label_META = createStringMeta($tree_row_label);
	public static final MCMeta tree_up_lv_dpt_cd_META = createStringMeta($tree_up_lv_dpt_cd);
	public static final MCMeta tree_drop_flg_META = createCommonMeta($tree_drop_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Tree1R> constMetas = new ConstMetaList<Tree1R>(
		mcframe.clientMABC.MABCP0280.DtlR.constMetas,
		new MCMeta[]{
			tree_dpt_cd_META,
			tree_row_label_META,
			tree_up_lv_dpt_cd_META,
			tree_drop_flg_META
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
		mcframe.clientMABC.MABCP0280.DtlR.KEYS,
		new String[]{
		}
	);

	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		mcframe.clientMABC.MABCP0280.DtlR.EXTMAP,
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
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
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
	protected Tree1R_MC_A(ConstMetaList<? extends Tree1R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Tree1R clone() {
		return (Tree1R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Tree1R createInstance() {
		return (Tree1R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Tree1R getValues(String... names) {
		return (Tree1R) super.getValues(names);
	}



	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String tree_dpt_cd() {
		return getConstString(offset + 0, $tree_dpt_cd);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void tree_dpt_cd(String value) {
		setConstString(offset + 0, $tree_dpt_cd, value);
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
	 * Upper dept. cd. 上位部門ＣＤ.<p>
	 *
	 */
	public String tree_up_lv_dpt_cd() {
		return getConstString(offset + 2, $tree_up_lv_dpt_cd);
	}

	/**
	 * Upper dept. cd. 上位部門ＣＤ.<p>
	 *
	 */
	public void tree_up_lv_dpt_cd(String value) {
		setConstString(offset + 2, $tree_up_lv_dpt_cd, value);
	}


	/**
	 * Drop flg. ドロップＦＬＧ.<p>
	 *
	 */
	public boolean tree_drop_flg() {
		return getConstBoolean(offset + 3, $tree_drop_flg);
	}

	/**
	 * Drop flg. ドロップＦＬＧ.<p>
	 *
	 */
	public void tree_drop_flg(boolean value) {
		setConstBoolean(offset + 3, $tree_drop_flg, value);
	}


	public String getString(String name) {
		if ($tree_dpt_cd.equalsIgnoreCase(name)) {
			return tree_dpt_cd();
		}
		if ($tree_row_label.equalsIgnoreCase(name)) {
			return tree_row_label();
		}
		if ($tree_up_lv_dpt_cd.equalsIgnoreCase(name)) {
			return tree_up_lv_dpt_cd();
		}
		return super.getString(name);
	}
	public boolean getBoolean(String name) {
		if ($tree_drop_flg.equalsIgnoreCase(name)) {
			return tree_drop_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($tree_dpt_cd.equalsIgnoreCase(name)) {
			return tree_dpt_cd();
		}
		if ($tree_row_label.equalsIgnoreCase(name)) {
			return tree_row_label();
		}
		if ($tree_up_lv_dpt_cd.equalsIgnoreCase(name)) {
			return tree_up_lv_dpt_cd();
		}
		return super.getStringNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($tree_drop_flg.equalsIgnoreCase(name)) {
			return tree_drop_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($tree_dpt_cd.equalsIgnoreCase(name)) {
			tree_dpt_cd(value);
			return;
		}
		if ($tree_row_label.equalsIgnoreCase(name)) {
			tree_row_label(value);
			return;
		}
		if ($tree_up_lv_dpt_cd.equalsIgnoreCase(name)) {
			tree_up_lv_dpt_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($tree_drop_flg.equalsIgnoreCase(name)) {
			tree_drop_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($tree_dpt_cd.equalsIgnoreCase(name)) {
			tree_dpt_cd(value);
			return;
		}
		if ($tree_row_label.equalsIgnoreCase(name)) {
			tree_row_label(value);
			return;
		}
		if ($tree_up_lv_dpt_cd.equalsIgnoreCase(name)) {
			tree_up_lv_dpt_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($tree_drop_flg.equalsIgnoreCase(name)) {
			tree_drop_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

