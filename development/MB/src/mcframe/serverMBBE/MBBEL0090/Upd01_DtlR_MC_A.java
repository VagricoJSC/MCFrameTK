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
 * ブロック"Upd01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Upd01_DtlR_MC_A extends MCConstRow {

	/**
	 * Table category テーブルカテゴリ.<p>
	 *
	 */
	public static final String $table_ctg = "table_ctg";
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
	 * Table sequence テーブル順序.<p>
	 *
	 */
	public static final String $table_seq = "table_seq";
	/**
	 * File name ファイル名.<p>
	 *
	 */
	public static final String $file_nm = "file_nm";
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
	 * DB container class path ＤＢコンテナクラスパス.<p>
	 *
	 */
	public static final String $db_class_path = "db_class_path";
	/**
	 * Check operation チェックオペレーション.<p>
	 *
	 */
	public static final String $chk_ope = "chk_ope";
	/**
	 * Entry operation 登録オペレーション.<p>
	 *
	 */
	public static final String $upd_ope = "upd_ope";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Completed 完了.<p>
	 *
	 */
	public static final String $fin_flg = "fin_flg";


	public static final MCMeta table_ctg_META = createCommonMeta($table_ctg, mcframe.commonMA.meta.MA_META.TABLE_CTG);
	public static final MCMeta table_ctg_seq_META = createCommonMeta($table_ctg_seq, mcframe.commonMA.meta.MA_META.INT3);
	public static final MCMeta table_id_META = createCommonMeta($table_id, mcframe.commonMA.meta.MA_META.TABLE_ID);
	public static final MCMeta table_seq_META = createCommonMeta($table_seq, mcframe.commonMA.meta.MA_META.INT3);
	public static final MCMeta file_nm_META = createCommonMeta($file_nm, mcframe.commonMA.meta.MA_META.FILE_NM);
	public static final MCMeta file_dat_META = createStringMeta($file_dat);
	public static final MCMeta file_path_META = createStringMeta($file_path);
	public static final MCMeta db_class_path_META = createCommonMeta($db_class_path, mcframe.commonMA.meta.MA_META.CLASS_PATH);
	public static final MCMeta chk_ope_META = createCommonMeta($chk_ope, mcframe.commonMA.meta.MA_META.OPERATION);
	public static final MCMeta upd_ope_META = createCommonMeta($upd_ope, mcframe.commonMA.meta.MA_META.OPERATION);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta fin_flg_META = createCommonMeta($fin_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Upd01_DtlR> constMetas = new ConstMetaList<Upd01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			table_ctg_META,
			table_ctg_seq_META,
			table_id_META,
			table_seq_META,
			file_nm_META,
			file_dat_META,
			file_path_META,
			db_class_path_META,
			chk_ope_META,
			upd_ope_META,
			err_flg_META,
			fin_flg_META
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
	protected Upd01_DtlR_MC_A(ConstMetaList<? extends Upd01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Upd01_DtlR clone() {
		return (Upd01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Upd01_DtlR createInstance() {
		return (Upd01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Upd01_DtlR getValues(String... names) {
		return (Upd01_DtlR) super.getValues(names);
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
	 * Table category sequence テーブルカテゴリ順序.<p>
	 *
	 */
	public MCNumber table_ctg_seq() {
		return getConstNumber(offset + 1, $table_ctg_seq);
	}

	/**
	 * Table category sequence テーブルカテゴリ順序.<p>
	 *
	 */
	public void table_ctg_seq(MCNumber value) {
		setConstNumber(offset + 1, $table_ctg_seq, value);
	}

	/**
	 * Table category sequence テーブルカテゴリ順序.<p>
	 *
	 */
	public void table_ctg_seq(int value) {
		setConstNumber(offset + 1, $table_ctg_seq, value);
	}

	/**
	 * Table category sequence テーブルカテゴリ順序.<p>
	 *
	 */
	public void table_ctg_seq(long value) {
		setConstNumber(offset + 1, $table_ctg_seq, value);
	}

	/**
	 * Table category sequence テーブルカテゴリ順序.<p>
	 *
	 */
	public void table_ctg_seq(float value) {
		setConstNumber(offset + 1, $table_ctg_seq, value);
	}

	/**
	 * Table category sequence テーブルカテゴリ順序.<p>
	 *
	 */
	public void table_ctg_seq(double value) {
		setConstNumber(offset + 1, $table_ctg_seq, value);
	}


	/**
	 * Table ID テーブルＩＤ.<p>
	 *
	 */
	public String table_id() {
		return getConstString(offset + 2, $table_id);
	}

	/**
	 * Table ID テーブルＩＤ.<p>
	 *
	 */
	public void table_id(String value) {
		setConstString(offset + 2, $table_id, value);
	}


	/**
	 * Table sequence テーブル順序.<p>
	 *
	 */
	public MCNumber table_seq() {
		return getConstNumber(offset + 3, $table_seq);
	}

	/**
	 * Table sequence テーブル順序.<p>
	 *
	 */
	public void table_seq(MCNumber value) {
		setConstNumber(offset + 3, $table_seq, value);
	}

	/**
	 * Table sequence テーブル順序.<p>
	 *
	 */
	public void table_seq(int value) {
		setConstNumber(offset + 3, $table_seq, value);
	}

	/**
	 * Table sequence テーブル順序.<p>
	 *
	 */
	public void table_seq(long value) {
		setConstNumber(offset + 3, $table_seq, value);
	}

	/**
	 * Table sequence テーブル順序.<p>
	 *
	 */
	public void table_seq(float value) {
		setConstNumber(offset + 3, $table_seq, value);
	}

	/**
	 * Table sequence テーブル順序.<p>
	 *
	 */
	public void table_seq(double value) {
		setConstNumber(offset + 3, $table_seq, value);
	}


	/**
	 * File name ファイル名.<p>
	 *
	 */
	public String file_nm() {
		return getConstString(offset + 4, $file_nm);
	}

	/**
	 * File name ファイル名.<p>
	 *
	 */
	public void file_nm(String value) {
		setConstString(offset + 4, $file_nm, value);
	}


	/**
	 * File data ファイルデータ.<p>
	 *
	 */
	public String file_dat() {
		return getConstString(offset + 5, $file_dat);
	}

	/**
	 * File data ファイルデータ.<p>
	 *
	 */
	public void file_dat(String value) {
		setConstString(offset + 5, $file_dat, value);
	}


	/**
	 * File path ファイルパス.<p>
	 *
	 */
	public String file_path() {
		return getConstString(offset + 6, $file_path);
	}

	/**
	 * File path ファイルパス.<p>
	 *
	 */
	public void file_path(String value) {
		setConstString(offset + 6, $file_path, value);
	}


	/**
	 * DB container class path ＤＢコンテナクラスパス.<p>
	 *
	 */
	public String db_class_path() {
		return getConstString(offset + 7, $db_class_path);
	}

	/**
	 * DB container class path ＤＢコンテナクラスパス.<p>
	 *
	 */
	public void db_class_path(String value) {
		setConstString(offset + 7, $db_class_path, value);
	}


	/**
	 * Check operation チェックオペレーション.<p>
	 *
	 */
	public String chk_ope() {
		return getConstString(offset + 8, $chk_ope);
	}

	/**
	 * Check operation チェックオペレーション.<p>
	 *
	 */
	public void chk_ope(String value) {
		setConstString(offset + 8, $chk_ope, value);
	}


	/**
	 * Entry operation 登録オペレーション.<p>
	 *
	 */
	public String upd_ope() {
		return getConstString(offset + 9, $upd_ope);
	}

	/**
	 * Entry operation 登録オペレーション.<p>
	 *
	 */
	public void upd_ope(String value) {
		setConstString(offset + 9, $upd_ope, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 10, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 10, $err_flg, value);
	}


	/**
	 * Completed 完了.<p>
	 *
	 */
	public boolean fin_flg() {
		return getConstBoolean(offset + 11, $fin_flg);
	}

	/**
	 * Completed 完了.<p>
	 *
	 */
	public void fin_flg(boolean value) {
		setConstBoolean(offset + 11, $fin_flg, value);
	}


	public String getString(String name) {
		if ($table_ctg.equalsIgnoreCase(name)) {
			return table_ctg();
		}
		if ($table_id.equalsIgnoreCase(name)) {
			return table_id();
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
		if ($db_class_path.equalsIgnoreCase(name)) {
			return db_class_path();
		}
		if ($chk_ope.equalsIgnoreCase(name)) {
			return chk_ope();
		}
		if ($upd_ope.equalsIgnoreCase(name)) {
			return upd_ope();
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
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($fin_flg.equalsIgnoreCase(name)) {
			return fin_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($table_ctg.equalsIgnoreCase(name)) {
			return table_ctg();
		}
		if ($table_id.equalsIgnoreCase(name)) {
			return table_id();
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
		if ($db_class_path.equalsIgnoreCase(name)) {
			return db_class_path();
		}
		if ($chk_ope.equalsIgnoreCase(name)) {
			return chk_ope();
		}
		if ($upd_ope.equalsIgnoreCase(name)) {
			return upd_ope();
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
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($fin_flg.equalsIgnoreCase(name)) {
			return fin_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($table_ctg.equalsIgnoreCase(name)) {
			table_ctg(value);
			return;
		}
		if ($table_id.equalsIgnoreCase(name)) {
			table_id(value);
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
		if ($db_class_path.equalsIgnoreCase(name)) {
			db_class_path(value);
			return;
		}
		if ($chk_ope.equalsIgnoreCase(name)) {
			chk_ope(value);
			return;
		}
		if ($upd_ope.equalsIgnoreCase(name)) {
			upd_ope(value);
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
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($fin_flg.equalsIgnoreCase(name)) {
			fin_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($table_ctg.equalsIgnoreCase(name)) {
			table_ctg(value);
			return;
		}
		if ($table_id.equalsIgnoreCase(name)) {
			table_id(value);
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
		if ($db_class_path.equalsIgnoreCase(name)) {
			db_class_path(value);
			return;
		}
		if ($chk_ope.equalsIgnoreCase(name)) {
			chk_ope(value);
			return;
		}
		if ($upd_ope.equalsIgnoreCase(name)) {
			upd_ope(value);
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
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($fin_flg.equalsIgnoreCase(name)) {
			fin_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

