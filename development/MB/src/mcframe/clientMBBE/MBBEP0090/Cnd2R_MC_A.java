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
 * ブロック"Cnd2"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Cnd2R_MC_A extends MCConstRow {

	/**
	 * XLSX,Excel,0;CSV,CSV,1 XLSX,Excel,0;CSV,CSV,1.<p>
	 *
	 */
	public static final String $file_ext_typ = "file_ext_typ";
	/**
	 * YMD,YMD,0;MDY,MDY,1;DMY,DMY,2 YMD,YMD,0;MDY,MDY,1;DMY,DMY,2.<p>
	 *
	 */
	public static final String $fmt_typ = "fmt_typ";
	/**
	 * Folder フォルダ.<p>
	 *
	 */
	public static final String $dir = "dir";
	/**
	 * INS,Add only,0;INSUPD,Add/Update,1;DELINS,Re-create after deletion,2;CRUD,Follow the data,3 INS,追加のみ,0;INSUPD,追加・更新,1;DELINS,削除後再作成,2;CRUD,データに従う,3.<p>
	 *
	 */
	public static final String $proc_typ = "proc_typ";
	/**
	 * STOP,Stop process;SKIP,Skip (Enter record except error row) STOP,処理中止;SKIP,スキップ（エラー行以外登録）.<p>
	 *
	 */
	public static final String $err_typ = "err_typ";
	/**
	 * Continue on error エラー時続行.<p>
	 *
	 */
	public static final String $err_continue_flg = "err_continue_flg";
	/**
	 * Add only 追加のみ.<p>
	 *
	 */
	public static final String $ins_only_flg = "ins_only_flg";
	/**
	 * Follow the data データに従う.<p>
	 *
	 */
	public static final String $crud_flg = "crud_flg";
	/**
	 * Recreate 再作成.<p>
	 *
	 */
	public static final String $remake_flg = "remake_flg";
	/**
	 * Data start row データ開始行.<p>
	 *
	 */
	public static final String $data_start_row = "data_start_row";


	public static final MCMeta file_ext_typ_META = createStringMeta($file_ext_typ);
	public static final MCMeta fmt_typ_META = createStringMeta($fmt_typ);
	public static final MCMeta dir_META = createStringMeta($dir);
	public static final MCMeta proc_typ_META = createStringMeta($proc_typ);
	public static final MCMeta err_typ_META = createStringMeta($err_typ);
	public static final MCMeta err_continue_flg_META = createCommonMeta($err_continue_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ins_only_flg_META = createCommonMeta($ins_only_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta crud_flg_META = createCommonMeta($crud_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta remake_flg_META = createCommonMeta($remake_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta data_start_row_META = createCommonMeta($data_start_row, mcframe.commonMA.meta.MA_META.INT2);

	protected static final ConstMetaList<Cnd2R> constMetas = new ConstMetaList<Cnd2R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			file_ext_typ_META,
			fmt_typ_META,
			dir_META,
			proc_typ_META,
			err_typ_META,
			err_continue_flg_META,
			ins_only_flg_META,
			crud_flg_META,
			remake_flg_META,
			data_start_row_META
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
	protected Cnd2R_MC_A(ConstMetaList<? extends Cnd2R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Cnd2R clone() {
		return (Cnd2R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Cnd2R createInstance() {
		return (Cnd2R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Cnd2R getValues(String... names) {
		return (Cnd2R) super.getValues(names);
	}



	/**
	 * XLSX,Excel,0;CSV,CSV,1 XLSX,Excel,0;CSV,CSV,1.<p>
	 *
	 */
	public String file_ext_typ() {
		return getConstString(offset + 0, $file_ext_typ);
	}

	/**
	 * XLSX,Excel,0;CSV,CSV,1 XLSX,Excel,0;CSV,CSV,1.<p>
	 *
	 */
	public void file_ext_typ(String value) {
		setConstString(offset + 0, $file_ext_typ, value);
	}


	/**
	 * YMD,YMD,0;MDY,MDY,1;DMY,DMY,2 YMD,YMD,0;MDY,MDY,1;DMY,DMY,2.<p>
	 *
	 */
	public String fmt_typ() {
		return getConstString(offset + 1, $fmt_typ);
	}

	/**
	 * YMD,YMD,0;MDY,MDY,1;DMY,DMY,2 YMD,YMD,0;MDY,MDY,1;DMY,DMY,2.<p>
	 *
	 */
	public void fmt_typ(String value) {
		setConstString(offset + 1, $fmt_typ, value);
	}


	/**
	 * Folder フォルダ.<p>
	 *
	 */
	public String dir() {
		return getConstString(offset + 2, $dir);
	}

	/**
	 * Folder フォルダ.<p>
	 *
	 */
	public void dir(String value) {
		setConstString(offset + 2, $dir, value);
	}


	/**
	 * INS,Add only,0;INSUPD,Add/Update,1;DELINS,Re-create after deletion,2;CRUD,Follow the data,3 INS,追加のみ,0;INSUPD,追加・更新,1;DELINS,削除後再作成,2;CRUD,データに従う,3.<p>
	 *
	 */
	public String proc_typ() {
		return getConstString(offset + 3, $proc_typ);
	}

	/**
	 * INS,Add only,0;INSUPD,Add/Update,1;DELINS,Re-create after deletion,2;CRUD,Follow the data,3 INS,追加のみ,0;INSUPD,追加・更新,1;DELINS,削除後再作成,2;CRUD,データに従う,3.<p>
	 *
	 */
	public void proc_typ(String value) {
		setConstString(offset + 3, $proc_typ, value);
	}


	/**
	 * STOP,Stop process;SKIP,Skip (Enter record except error row) STOP,処理中止;SKIP,スキップ（エラー行以外登録）.<p>
	 *
	 */
	public String err_typ() {
		return getConstString(offset + 4, $err_typ);
	}

	/**
	 * STOP,Stop process;SKIP,Skip (Enter record except error row) STOP,処理中止;SKIP,スキップ（エラー行以外登録）.<p>
	 *
	 */
	public void err_typ(String value) {
		setConstString(offset + 4, $err_typ, value);
	}


	/**
	 * Continue on error エラー時続行.<p>
	 *
	 */
	public boolean err_continue_flg() {
		return getConstBoolean(offset + 5, $err_continue_flg);
	}

	/**
	 * Continue on error エラー時続行.<p>
	 *
	 */
	public void err_continue_flg(boolean value) {
		setConstBoolean(offset + 5, $err_continue_flg, value);
	}


	/**
	 * Add only 追加のみ.<p>
	 *
	 */
	public boolean ins_only_flg() {
		return getConstBoolean(offset + 6, $ins_only_flg);
	}

	/**
	 * Add only 追加のみ.<p>
	 *
	 */
	public void ins_only_flg(boolean value) {
		setConstBoolean(offset + 6, $ins_only_flg, value);
	}


	/**
	 * Follow the data データに従う.<p>
	 *
	 */
	public boolean crud_flg() {
		return getConstBoolean(offset + 7, $crud_flg);
	}

	/**
	 * Follow the data データに従う.<p>
	 *
	 */
	public void crud_flg(boolean value) {
		setConstBoolean(offset + 7, $crud_flg, value);
	}


	/**
	 * Recreate 再作成.<p>
	 *
	 */
	public boolean remake_flg() {
		return getConstBoolean(offset + 8, $remake_flg);
	}

	/**
	 * Recreate 再作成.<p>
	 *
	 */
	public void remake_flg(boolean value) {
		setConstBoolean(offset + 8, $remake_flg, value);
	}


	/**
	 * Data start row データ開始行.<p>
	 *
	 */
	public MCNumber data_start_row() {
		return getConstNumber(offset + 9, $data_start_row);
	}

	/**
	 * Data start row データ開始行.<p>
	 *
	 */
	public void data_start_row(MCNumber value) {
		setConstNumber(offset + 9, $data_start_row, value);
	}

	/**
	 * Data start row データ開始行.<p>
	 *
	 */
	public void data_start_row(int value) {
		setConstNumber(offset + 9, $data_start_row, value);
	}

	/**
	 * Data start row データ開始行.<p>
	 *
	 */
	public void data_start_row(long value) {
		setConstNumber(offset + 9, $data_start_row, value);
	}

	/**
	 * Data start row データ開始行.<p>
	 *
	 */
	public void data_start_row(float value) {
		setConstNumber(offset + 9, $data_start_row, value);
	}

	/**
	 * Data start row データ開始行.<p>
	 *
	 */
	public void data_start_row(double value) {
		setConstNumber(offset + 9, $data_start_row, value);
	}


	public String getString(String name) {
		if ($file_ext_typ.equalsIgnoreCase(name)) {
			return file_ext_typ();
		}
		if ($fmt_typ.equalsIgnoreCase(name)) {
			return fmt_typ();
		}
		if ($dir.equalsIgnoreCase(name)) {
			return dir();
		}
		if ($proc_typ.equalsIgnoreCase(name)) {
			return proc_typ();
		}
		if ($err_typ.equalsIgnoreCase(name)) {
			return err_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($data_start_row.equalsIgnoreCase(name)) {
			return data_start_row();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($err_continue_flg.equalsIgnoreCase(name)) {
			return err_continue_flg();
		}
		if ($ins_only_flg.equalsIgnoreCase(name)) {
			return ins_only_flg();
		}
		if ($crud_flg.equalsIgnoreCase(name)) {
			return crud_flg();
		}
		if ($remake_flg.equalsIgnoreCase(name)) {
			return remake_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($file_ext_typ.equalsIgnoreCase(name)) {
			return file_ext_typ();
		}
		if ($fmt_typ.equalsIgnoreCase(name)) {
			return fmt_typ();
		}
		if ($dir.equalsIgnoreCase(name)) {
			return dir();
		}
		if ($proc_typ.equalsIgnoreCase(name)) {
			return proc_typ();
		}
		if ($err_typ.equalsIgnoreCase(name)) {
			return err_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($data_start_row.equalsIgnoreCase(name)) {
			return data_start_row();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_continue_flg.equalsIgnoreCase(name)) {
			return err_continue_flg();
		}
		if ($ins_only_flg.equalsIgnoreCase(name)) {
			return ins_only_flg();
		}
		if ($crud_flg.equalsIgnoreCase(name)) {
			return crud_flg();
		}
		if ($remake_flg.equalsIgnoreCase(name)) {
			return remake_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($file_ext_typ.equalsIgnoreCase(name)) {
			file_ext_typ(value);
			return;
		}
		if ($fmt_typ.equalsIgnoreCase(name)) {
			fmt_typ(value);
			return;
		}
		if ($dir.equalsIgnoreCase(name)) {
			dir(value);
			return;
		}
		if ($proc_typ.equalsIgnoreCase(name)) {
			proc_typ(value);
			return;
		}
		if ($err_typ.equalsIgnoreCase(name)) {
			err_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($data_start_row.equalsIgnoreCase(name)) {
			data_start_row(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($data_start_row.equalsIgnoreCase(name)) {
			data_start_row(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($data_start_row.equalsIgnoreCase(name)) {
			data_start_row(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($data_start_row.equalsIgnoreCase(name)) {
			data_start_row(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($data_start_row.equalsIgnoreCase(name)) {
			data_start_row(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_continue_flg.equalsIgnoreCase(name)) {
			err_continue_flg(value);
			return;
		}
		if ($ins_only_flg.equalsIgnoreCase(name)) {
			ins_only_flg(value);
			return;
		}
		if ($crud_flg.equalsIgnoreCase(name)) {
			crud_flg(value);
			return;
		}
		if ($remake_flg.equalsIgnoreCase(name)) {
			remake_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($file_ext_typ.equalsIgnoreCase(name)) {
			file_ext_typ(value);
			return;
		}
		if ($fmt_typ.equalsIgnoreCase(name)) {
			fmt_typ(value);
			return;
		}
		if ($dir.equalsIgnoreCase(name)) {
			dir(value);
			return;
		}
		if ($proc_typ.equalsIgnoreCase(name)) {
			proc_typ(value);
			return;
		}
		if ($err_typ.equalsIgnoreCase(name)) {
			err_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($data_start_row.equalsIgnoreCase(name)) {
			data_start_row(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($data_start_row.equalsIgnoreCase(name)) {
			data_start_row(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($data_start_row.equalsIgnoreCase(name)) {
			data_start_row(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($data_start_row.equalsIgnoreCase(name)) {
			data_start_row(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($data_start_row.equalsIgnoreCase(name)) {
			data_start_row(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_continue_flg.equalsIgnoreCase(name)) {
			err_continue_flg(value);
			return;
		}
		if ($ins_only_flg.equalsIgnoreCase(name)) {
			ins_only_flg(value);
			return;
		}
		if ($crud_flg.equalsIgnoreCase(name)) {
			crud_flg(value);
			return;
		}
		if ($remake_flg.equalsIgnoreCase(name)) {
			remake_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

