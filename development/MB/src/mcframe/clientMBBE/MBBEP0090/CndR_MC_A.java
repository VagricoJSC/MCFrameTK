package mcframe.clientMBBE.MBBEP0090;

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
 * ブロック"Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class CndR_MC_A extends MCConstRow {

	/**
	 * REG,Create;CHK,Perform check only;PR_FMT,Output (Format);PR_DAT,Output (Data) REG,登録する;CHK,チェックのみを実行する;PR_FMT,出力する（フォーマット）;PR_DAT,出力する（データ）.<p>
	 *
	 */
	public static final String $ope = "ope";
	/**
	 * Table category テーブルカテゴリ.<p>
	 *
	 */
	public static final String $table_ctg = "table_ctg";
	/**
	 * Table category name テーブルカテゴリ名.<p>
	 *
	 */
	public static final String $table_ctg_nm = "table_ctg_nm";
	/**
	 * Table ID テーブルＩＤ.<p>
	 *
	 */
	public static final String $table_id = "table_id";
	/**
	 * Table name テーブル名称.<p>
	 *
	 */
	public static final String $table_nm = "table_nm";


	public static final MCMeta ope_META = createStringMeta($ope);
	public static final MCMeta table_ctg_META = createCommonMeta($table_ctg, mcframe.commonMA.meta.MA_META.TABLE_CTG);
	public static final MCMeta table_ctg_nm_META = createCommonMeta($table_ctg_nm, mcframe.commonMA.meta.MA_META.TABLE_CTG_NM);
	public static final MCMeta table_id_META = createCommonMeta($table_id, mcframe.commonMA.meta.MA_META.TABLE_ID);
	public static final MCMeta table_nm_META = createCommonMeta($table_nm, mcframe.commonMA.meta.MA_META.TABLE_NM);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			table_ctg_META,
			table_ctg_nm_META,
			table_id_META,
			table_nm_META
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
		null,
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
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$table_id, "table_ctg;table_ctg_nm"}	// table_id
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
	protected CndR_MC_A(ConstMetaList<? extends CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR clone() {
		return (CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR createInstance() {
		return (CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR getValues(String... names) {
		return (CndR) super.getValues(names);
	}



	/**
	 * REG,Create;CHK,Perform check only;PR_FMT,Output (Format);PR_DAT,Output (Data) REG,登録する;CHK,チェックのみを実行する;PR_FMT,出力する（フォーマット）;PR_DAT,出力する（データ）.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * REG,Create;CHK,Perform check only;PR_FMT,Output (Format);PR_DAT,Output (Data) REG,登録する;CHK,チェックのみを実行する;PR_FMT,出力する（フォーマット）;PR_DAT,出力する（データ）.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	/**
	 * Table category テーブルカテゴリ.<p>
	 *
	 */
	public String table_ctg() {
		return getConstString(offset + 1, $table_ctg);
	}

	/**
	 * Table category テーブルカテゴリ.<p>
	 *
	 */
	public void table_ctg(String value) {
		setConstString(offset + 1, $table_ctg, value);
	}


	/**
	 * Table category name テーブルカテゴリ名.<p>
	 *
	 */
	public String table_ctg_nm() {
		return getConstString(offset + 2, $table_ctg_nm);
	}

	/**
	 * Table category name テーブルカテゴリ名.<p>
	 *
	 */
	public void table_ctg_nm(String value) {
		setConstString(offset + 2, $table_ctg_nm, value);
	}


	/**
	 * Table ID テーブルＩＤ.<p>
	 *
	 */
	public String table_id() {
		return getConstString(offset + 3, $table_id);
	}

	/**
	 * Table ID テーブルＩＤ.<p>
	 *
	 */
	public void table_id(String value) {
		setConstString(offset + 3, $table_id, value);
	}


	/**
	 * Table name テーブル名称.<p>
	 *
	 */
	public String table_nm() {
		return getConstString(offset + 4, $table_nm);
	}

	/**
	 * Table name テーブル名称.<p>
	 *
	 */
	public void table_nm(String value) {
		setConstString(offset + 4, $table_nm, value);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($table_ctg.equalsIgnoreCase(name)) {
			return table_ctg();
		}
		if ($table_ctg_nm.equalsIgnoreCase(name)) {
			return table_ctg_nm();
		}
		if ($table_id.equalsIgnoreCase(name)) {
			return table_id();
		}
		if ($table_nm.equalsIgnoreCase(name)) {
			return table_nm();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($table_ctg.equalsIgnoreCase(name)) {
			return table_ctg();
		}
		if ($table_ctg_nm.equalsIgnoreCase(name)) {
			return table_ctg_nm();
		}
		if ($table_id.equalsIgnoreCase(name)) {
			return table_id();
		}
		if ($table_nm.equalsIgnoreCase(name)) {
			return table_nm();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($table_ctg.equalsIgnoreCase(name)) {
			table_ctg(value);
			return;
		}
		if ($table_ctg_nm.equalsIgnoreCase(name)) {
			table_ctg_nm(value);
			return;
		}
		if ($table_id.equalsIgnoreCase(name)) {
			table_id(value);
			return;
		}
		if ($table_nm.equalsIgnoreCase(name)) {
			table_nm(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($table_ctg.equalsIgnoreCase(name)) {
			table_ctg(value);
			return;
		}
		if ($table_ctg_nm.equalsIgnoreCase(name)) {
			table_ctg_nm(value);
			return;
		}
		if ($table_id.equalsIgnoreCase(name)) {
			table_id(value);
			return;
		}
		if ($table_nm.equalsIgnoreCase(name)) {
			table_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}



}

