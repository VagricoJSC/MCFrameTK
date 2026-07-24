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
 * ブロック"Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DtlR_MC_A extends MCConstRow {

	/**
	 * Select 選択.<p>
	 *
	 */
	public static final String $check = "check";
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
	 * File name ファイル名.<p>
	 *
	 */
	public static final String $file_nm = "file_nm";
	/**
	 * Table sequence テーブル順序.<p>
	 *
	 */
	public static final String $table_seq = "table_seq";
	/**
	 * File data ファイルデータ.<p>
	 *
	 */
	public static final String $file_dat = "file_dat";
	/**
	 * File path ファイルパス.<p>
	 *
	 */
	public static final String $file_path = "file_path";
	/**
	 * Start time 開始時刻.<p>
	 *
	 */
	public static final String $start_dt = "start_dt";


	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta table_ctg_META = createCommonMeta($table_ctg, mcframe.commonMA.meta.MA_META.TABLE_CTG);
	public static final MCMeta table_ctg_nm_META = createCommonMeta($table_ctg_nm, mcframe.commonMA.meta.MA_META.TABLE_CTG_NM);
	public static final MCMeta table_ctg_seq_META = createCommonMeta($table_ctg_seq, mcframe.commonMA.meta.MA_META.INT3);
	public static final MCMeta table_id_META = createCommonMeta($table_id, mcframe.commonMA.meta.MA_META.TABLE_ID);
	public static final MCMeta table_nm_META = createCommonMeta($table_nm, mcframe.commonMA.meta.MA_META.TABLE_NM);
	public static final MCMeta file_nm_META = createCommonMeta($file_nm, mcframe.commonMA.meta.MA_META.FILE_NM);
	public static final MCMeta table_seq_META = createCommonMeta($table_seq, mcframe.commonMA.meta.MA_META.INT3);
	public static final MCMeta file_dat_META = createStringMeta($file_dat);
	public static final MCMeta file_path_META = createStringMeta($file_path);
	public static final MCMeta start_dt_META = createCommonMeta($start_dt, mcframe.commonMA.meta.MA_META.YMDHMS);

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			table_ctg_META,
			table_ctg_nm_META,
			table_ctg_seq_META,
			table_id_META,
			table_nm_META,
			file_nm_META,
			table_seq_META,
			file_dat_META,
			file_path_META,
			start_dt_META
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
	protected DtlR_MC_A(ConstMetaList<? extends DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR clone() {
		return (DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR createInstance() {
		return (DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR getValues(String... names) {
		return (DtlR) super.getValues(names);
	}



	/**
	 * Select 選択.<p>
	 *
	 */
	public boolean check() {
		return getConstBoolean(offset + 0, $check);
	}

	/**
	 * Select 選択.<p>
	 *
	 */
	public void check(boolean value) {
		setConstBoolean(offset + 0, $check, value);
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
	 * Table category sequence テーブルカテゴリ順序.<p>
	 *
	 */
	public MCNumber table_ctg_seq() {
		return getConstNumber(offset + 3, $table_ctg_seq);
	}

	/**
	 * Table category sequence テーブルカテゴリ順序.<p>
	 *
	 */
	public void table_ctg_seq(MCNumber value) {
		setConstNumber(offset + 3, $table_ctg_seq, value);
	}

	/**
	 * Table category sequence テーブルカテゴリ順序.<p>
	 *
	 */
	public void table_ctg_seq(int value) {
		setConstNumber(offset + 3, $table_ctg_seq, value);
	}

	/**
	 * Table category sequence テーブルカテゴリ順序.<p>
	 *
	 */
	public void table_ctg_seq(long value) {
		setConstNumber(offset + 3, $table_ctg_seq, value);
	}

	/**
	 * Table category sequence テーブルカテゴリ順序.<p>
	 *
	 */
	public void table_ctg_seq(float value) {
		setConstNumber(offset + 3, $table_ctg_seq, value);
	}

	/**
	 * Table category sequence テーブルカテゴリ順序.<p>
	 *
	 */
	public void table_ctg_seq(double value) {
		setConstNumber(offset + 3, $table_ctg_seq, value);
	}


	/**
	 * Table ID テーブルＩＤ.<p>
	 *
	 */
	public String table_id() {
		return getConstString(offset + 4, $table_id);
	}

	/**
	 * Table ID テーブルＩＤ.<p>
	 *
	 */
	public void table_id(String value) {
		setConstString(offset + 4, $table_id, value);
	}


	/**
	 * Table name テーブル名称.<p>
	 *
	 */
	public String table_nm() {
		return getConstString(offset + 5, $table_nm);
	}

	/**
	 * Table name テーブル名称.<p>
	 *
	 */
	public void table_nm(String value) {
		setConstString(offset + 5, $table_nm, value);
	}


	/**
	 * File name ファイル名.<p>
	 *
	 */
	public String file_nm() {
		return getConstString(offset + 6, $file_nm);
	}

	/**
	 * File name ファイル名.<p>
	 *
	 */
	public void file_nm(String value) {
		setConstString(offset + 6, $file_nm, value);
	}


	/**
	 * Table sequence テーブル順序.<p>
	 *
	 */
	public MCNumber table_seq() {
		return getConstNumber(offset + 7, $table_seq);
	}

	/**
	 * Table sequence テーブル順序.<p>
	 *
	 */
	public void table_seq(MCNumber value) {
		setConstNumber(offset + 7, $table_seq, value);
	}

	/**
	 * Table sequence テーブル順序.<p>
	 *
	 */
	public void table_seq(int value) {
		setConstNumber(offset + 7, $table_seq, value);
	}

	/**
	 * Table sequence テーブル順序.<p>
	 *
	 */
	public void table_seq(long value) {
		setConstNumber(offset + 7, $table_seq, value);
	}

	/**
	 * Table sequence テーブル順序.<p>
	 *
	 */
	public void table_seq(float value) {
		setConstNumber(offset + 7, $table_seq, value);
	}

	/**
	 * Table sequence テーブル順序.<p>
	 *
	 */
	public void table_seq(double value) {
		setConstNumber(offset + 7, $table_seq, value);
	}


	/**
	 * File data ファイルデータ.<p>
	 *
	 */
	public String file_dat() {
		return getConstString(offset + 8, $file_dat);
	}

	/**
	 * File data ファイルデータ.<p>
	 *
	 */
	public void file_dat(String value) {
		setConstString(offset + 8, $file_dat, value);
	}


	/**
	 * File path ファイルパス.<p>
	 *
	 */
	public String file_path() {
		return getConstString(offset + 9, $file_path);
	}

	/**
	 * File path ファイルパス.<p>
	 *
	 */
	public void file_path(String value) {
		setConstString(offset + 9, $file_path, value);
	}


	/**
	 * Start time 開始時刻.<p>
	 *
	 */
	public MCDate start_dt() {
		return getConstDate(offset + 10, $start_dt);
	}

	/**
	 * Start time 開始時刻.<p>
	 *
	 */
	public void start_dt(MCDate value) {
		setConstDate(offset + 10, $start_dt, value);
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
		if ($file_nm.equalsIgnoreCase(name)) {
			return file_nm();
		}
		if ($file_dat.equalsIgnoreCase(name)) {
			return file_dat();
		}
		if ($file_path.equalsIgnoreCase(name)) {
			return file_path();
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
	public MCDate getDate(String name) {
		if ($start_dt.equalsIgnoreCase(name)) {
			return start_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		return super.getBoolean(name);
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
		if ($file_nm.equalsIgnoreCase(name)) {
			return file_nm();
		}
		if ($file_dat.equalsIgnoreCase(name)) {
			return file_dat();
		}
		if ($file_path.equalsIgnoreCase(name)) {
			return file_path();
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
	public MCDate getDateNE(String name) {
		if ($start_dt.equalsIgnoreCase(name)) {
			return start_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		return super.getBooleanNE(name);
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
		if ($file_nm.equalsIgnoreCase(name)) {
			file_nm(value);
			return;
		}
		if ($file_dat.equalsIgnoreCase(name)) {
			file_dat(value);
			return;
		}
		if ($file_path.equalsIgnoreCase(name)) {
			file_path(value);
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
	public void setDate(String name, MCDate value) {
		if ($start_dt.equalsIgnoreCase(name)) {
			start_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		super.setBoolean(name, value);
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
		if ($file_nm.equalsIgnoreCase(name)) {
			file_nm(value);
			return;
		}
		if ($file_dat.equalsIgnoreCase(name)) {
			file_dat(value);
			return;
		}
		if ($file_path.equalsIgnoreCase(name)) {
			file_path(value);
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
	public void setDateNE(String name, MCDate value) {
		if ($start_dt.equalsIgnoreCase(name)) {
			start_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

