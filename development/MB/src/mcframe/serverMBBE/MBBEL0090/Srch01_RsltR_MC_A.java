package mcframe.serverMBBE.MBBEL0090;

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
 * ブロック"Srch01_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_RsltR_MC_A extends MCConstRow {

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
	 * Table category sequence テーブルカテゴリ順序.<p>
	 *
	 */
	public static final String $table_ctg_seq = "table_ctg_seq";
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
	/**
	 * Table sequence テーブル順序.<p>
	 *
	 */
	public static final String $table_seq = "table_seq";


	public static final MCMeta table_ctg_META = createCommonMeta($table_ctg, mcframe.commonMA.meta.MA_META.TABLE_CTG);
	public static final MCMeta table_ctg_nm_META = createCommonMeta($table_ctg_nm, mcframe.commonMA.meta.MA_META.TABLE_CTG_NM);
	public static final MCMeta table_ctg_seq_META = createCommonMeta($table_ctg_seq, mcframe.commonMA.meta.MA_META.INT3);
	public static final MCMeta table_id_META = createCommonMeta($table_id, mcframe.commonMA.meta.MA_META.TABLE_ID);
	public static final MCMeta table_nm_META = createCommonMeta($table_nm, mcframe.commonMA.meta.MA_META.TABLE_NM);
	public static final MCMeta table_seq_META = createCommonMeta($table_seq, mcframe.commonMA.meta.MA_META.INT3);

	protected static final ConstMetaList<Srch01_RsltR> constMetas = new ConstMetaList<Srch01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			table_ctg_META,
			table_ctg_nm_META,
			table_ctg_seq_META,
			table_id_META,
			table_nm_META,
			table_seq_META
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
	protected Srch01_RsltR_MC_A(ConstMetaList<? extends Srch01_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR clone() {
		return (Srch01_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR createInstance() {
		return (Srch01_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR getValues(String... names) {
		return (Srch01_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Table category テーブルカテゴリ.<p>
	 *
	 */
	public String table_ctg() {
		return getConstString(offset + 0, $table_ctg);
	}

	/**
	 * Table category テーブルカテゴリ.<p>
	 *
	 */
	public void table_ctg(String value) {
		setConstString(offset + 0, $table_ctg, value);
	}


	/**
	 * Table category name テーブルカテゴリ名.<p>
	 *
	 */
	public String table_ctg_nm() {
		return getConstString(offset + 1, $table_ctg_nm);
	}

	/**
	 * Table category name テーブルカテゴリ名.<p>
	 *
	 */
	public void table_ctg_nm(String value) {
		setConstString(offset + 1, $table_ctg_nm, value);
	}


	/**
	 * Table category sequence テーブルカテゴリ順序.<p>
	 *
	 */
	public MCNumber table_ctg_seq() {
		return getConstNumber(offset + 2, $table_ctg_seq);
	}

	/**
	 * Table category sequence テーブルカテゴリ順序.<p>
	 *
	 */
	public void table_ctg_seq(MCNumber value) {
		setConstNumber(offset + 2, $table_ctg_seq, value);
	}

	/**
	 * Table category sequence テーブルカテゴリ順序.<p>
	 *
	 */
	public void table_ctg_seq(int value) {
		setConstNumber(offset + 2, $table_ctg_seq, value);
	}

	/**
	 * Table category sequence テーブルカテゴリ順序.<p>
	 *
	 */
	public void table_ctg_seq(long value) {
		setConstNumber(offset + 2, $table_ctg_seq, value);
	}

	/**
	 * Table category sequence テーブルカテゴリ順序.<p>
	 *
	 */
	public void table_ctg_seq(float value) {
		setConstNumber(offset + 2, $table_ctg_seq, value);
	}

	/**
	 * Table category sequence テーブルカテゴリ順序.<p>
	 *
	 */
	public void table_ctg_seq(double value) {
		setConstNumber(offset + 2, $table_ctg_seq, value);
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


	/**
	 * Table sequence テーブル順序.<p>
	 *
	 */
	public MCNumber table_seq() {
		return getConstNumber(offset + 5, $table_seq);
	}

	/**
	 * Table sequence テーブル順序.<p>
	 *
	 */
	public void table_seq(MCNumber value) {
		setConstNumber(offset + 5, $table_seq, value);
	}

	/**
	 * Table sequence テーブル順序.<p>
	 *
	 */
	public void table_seq(int value) {
		setConstNumber(offset + 5, $table_seq, value);
	}

	/**
	 * Table sequence テーブル順序.<p>
	 *
	 */
	public void table_seq(long value) {
		setConstNumber(offset + 5, $table_seq, value);
	}

	/**
	 * Table sequence テーブル順序.<p>
	 *
	 */
	public void table_seq(float value) {
		setConstNumber(offset + 5, $table_seq, value);
	}

	/**
	 * Table sequence テーブル順序.<p>
	 *
	 */
	public void table_seq(double value) {
		setConstNumber(offset + 5, $table_seq, value);
	}


	public String getString(String name) {
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
	public MCNumber getNumber(String name) {
		if ($table_ctg_seq.equalsIgnoreCase(name)) {
			return table_ctg_seq();
		}
		if ($table_seq.equalsIgnoreCase(name)) {
			return table_seq();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
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
	public MCNumber getNumberNE(String name) {
		if ($table_ctg_seq.equalsIgnoreCase(name)) {
			return table_ctg_seq();
		}
		if ($table_seq.equalsIgnoreCase(name)) {
			return table_seq();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
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
	public void setNumber(String name, MCNumber value) {
		if ($table_ctg_seq.equalsIgnoreCase(name)) {
			table_ctg_seq(value);
			return;
		}
		if ($table_seq.equalsIgnoreCase(name)) {
			table_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($table_ctg_seq.equalsIgnoreCase(name)) {
			table_ctg_seq(value);
			return;
		}
		if ($table_seq.equalsIgnoreCase(name)) {
			table_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($table_ctg_seq.equalsIgnoreCase(name)) {
			table_ctg_seq(value);
			return;
		}
		if ($table_seq.equalsIgnoreCase(name)) {
			table_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($table_ctg_seq.equalsIgnoreCase(name)) {
			table_ctg_seq(value);
			return;
		}
		if ($table_seq.equalsIgnoreCase(name)) {
			table_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($table_ctg_seq.equalsIgnoreCase(name)) {
			table_ctg_seq(value);
			return;
		}
		if ($table_seq.equalsIgnoreCase(name)) {
			table_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
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
	public void setNumberNE(String name, MCNumber value) {
		if ($table_ctg_seq.equalsIgnoreCase(name)) {
			table_ctg_seq(value);
			return;
		}
		if ($table_seq.equalsIgnoreCase(name)) {
			table_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($table_ctg_seq.equalsIgnoreCase(name)) {
			table_ctg_seq(value);
			return;
		}
		if ($table_seq.equalsIgnoreCase(name)) {
			table_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($table_ctg_seq.equalsIgnoreCase(name)) {
			table_ctg_seq(value);
			return;
		}
		if ($table_seq.equalsIgnoreCase(name)) {
			table_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($table_ctg_seq.equalsIgnoreCase(name)) {
			table_ctg_seq(value);
			return;
		}
		if ($table_seq.equalsIgnoreCase(name)) {
			table_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($table_ctg_seq.equalsIgnoreCase(name)) {
			table_ctg_seq(value);
			return;
		}
		if ($table_seq.equalsIgnoreCase(name)) {
			table_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

