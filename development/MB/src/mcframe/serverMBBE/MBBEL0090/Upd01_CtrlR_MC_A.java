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
 * ブロック"Upd01_Ctrl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Upd01_CtrlR_MC_A extends MCConstRow {

	/**
	 * Check only チェックのみ.<p>
	 *
	 */
	public static final String $chk_only_flg = "chk_only_flg";
	/**
	 * Add only 追加のみ.<p>
	 *
	 */
	public static final String $ins_only_flg = "ins_only_flg";
	/**
	 * Recreate after deletion 削除後再作成.<p>
	 *
	 */
	public static final String $remake_flg = "remake_flg";
	/**
	 * Follow the data データに従う.<p>
	 *
	 */
	public static final String $crud_flg = "crud_flg";
	/**
	 * Continue on error エラー時続行.<p>
	 *
	 */
	public static final String $err_continue_flg = "err_continue_flg";
	/**
	 * Date format 日付形式.<p>
	 *
	 */
	public static final String $fmt_typ = "fmt_typ";
	/**
	 * Date format 日付形式フォーマット.<p>
	 *
	 */
	public static final String $dt_fmt = "dt_fmt";
	/**
	 * Time stamp format タイムスタンプ形式フォーマット.<p>
	 *
	 */
	public static final String $ts_fmt = "ts_fmt";
	/**
	 * Date and time format 日時形式フォーマット.<p>
	 *
	 */
	public static final String $tm_fmt = "tm_fmt";
	/**
	 * Data start row データ開始行.<p>
	 *
	 */
	public static final String $data_start_row = "data_start_row";


	public static final MCMeta chk_only_flg_META = createCommonMeta($chk_only_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ins_only_flg_META = createCommonMeta($ins_only_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta remake_flg_META = createCommonMeta($remake_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta crud_flg_META = createCommonMeta($crud_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta err_continue_flg_META = createCommonMeta($err_continue_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta fmt_typ_META = createStringMeta($fmt_typ);
	public static final MCMeta dt_fmt_META = createStringMeta($dt_fmt);
	public static final MCMeta ts_fmt_META = createStringMeta($ts_fmt);
	public static final MCMeta tm_fmt_META = createStringMeta($tm_fmt);
	public static final MCMeta data_start_row_META = createCommonMeta($data_start_row, mcframe.commonMA.meta.MA_META.INT2);

	protected static final ConstMetaList<Upd01_CtrlR> constMetas = new ConstMetaList<Upd01_CtrlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			chk_only_flg_META,
			ins_only_flg_META,
			remake_flg_META,
			crud_flg_META,
			err_continue_flg_META,
			fmt_typ_META,
			dt_fmt_META,
			ts_fmt_META,
			tm_fmt_META,
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
	protected Upd01_CtrlR_MC_A(ConstMetaList<? extends Upd01_CtrlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Upd01_CtrlR clone() {
		return (Upd01_CtrlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Upd01_CtrlR createInstance() {
		return (Upd01_CtrlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Upd01_CtrlR getValues(String... names) {
		return (Upd01_CtrlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Check only チェックのみ.<p>
	 *
	 */
	public boolean chk_only_flg() {
		return getConstBoolean(offset + 0, $chk_only_flg);
	}

	/**
	 * Check only チェックのみ.<p>
	 *
	 */
	public void chk_only_flg(boolean value) {
		setConstBoolean(offset + 0, $chk_only_flg, value);
	}


	/**
	 * Add only 追加のみ.<p>
	 *
	 */
	public boolean ins_only_flg() {
		return getConstBoolean(offset + 1, $ins_only_flg);
	}

	/**
	 * Add only 追加のみ.<p>
	 *
	 */
	public void ins_only_flg(boolean value) {
		setConstBoolean(offset + 1, $ins_only_flg, value);
	}


	/**
	 * Recreate after deletion 削除後再作成.<p>
	 *
	 */
	public boolean remake_flg() {
		return getConstBoolean(offset + 2, $remake_flg);
	}

	/**
	 * Recreate after deletion 削除後再作成.<p>
	 *
	 */
	public void remake_flg(boolean value) {
		setConstBoolean(offset + 2, $remake_flg, value);
	}


	/**
	 * Follow the data データに従う.<p>
	 *
	 */
	public boolean crud_flg() {
		return getConstBoolean(offset + 3, $crud_flg);
	}

	/**
	 * Follow the data データに従う.<p>
	 *
	 */
	public void crud_flg(boolean value) {
		setConstBoolean(offset + 3, $crud_flg, value);
	}


	/**
	 * Continue on error エラー時続行.<p>
	 *
	 */
	public boolean err_continue_flg() {
		return getConstBoolean(offset + 4, $err_continue_flg);
	}

	/**
	 * Continue on error エラー時続行.<p>
	 *
	 */
	public void err_continue_flg(boolean value) {
		setConstBoolean(offset + 4, $err_continue_flg, value);
	}


	/**
	 * Date format 日付形式.<p>
	 *
	 */
	public String fmt_typ() {
		return getConstString(offset + 5, $fmt_typ);
	}

	/**
	 * Date format 日付形式.<p>
	 *
	 */
	public void fmt_typ(String value) {
		setConstString(offset + 5, $fmt_typ, value);
	}


	/**
	 * Date format 日付形式フォーマット.<p>
	 *
	 */
	public String dt_fmt() {
		return getConstString(offset + 6, $dt_fmt);
	}

	/**
	 * Date format 日付形式フォーマット.<p>
	 *
	 */
	public void dt_fmt(String value) {
		setConstString(offset + 6, $dt_fmt, value);
	}


	/**
	 * Time stamp format タイムスタンプ形式フォーマット.<p>
	 *
	 */
	public String ts_fmt() {
		return getConstString(offset + 7, $ts_fmt);
	}

	/**
	 * Time stamp format タイムスタンプ形式フォーマット.<p>
	 *
	 */
	public void ts_fmt(String value) {
		setConstString(offset + 7, $ts_fmt, value);
	}


	/**
	 * Date and time format 日時形式フォーマット.<p>
	 *
	 */
	public String tm_fmt() {
		return getConstString(offset + 8, $tm_fmt);
	}

	/**
	 * Date and time format 日時形式フォーマット.<p>
	 *
	 */
	public void tm_fmt(String value) {
		setConstString(offset + 8, $tm_fmt, value);
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
		if ($fmt_typ.equalsIgnoreCase(name)) {
			return fmt_typ();
		}
		if ($dt_fmt.equalsIgnoreCase(name)) {
			return dt_fmt();
		}
		if ($ts_fmt.equalsIgnoreCase(name)) {
			return ts_fmt();
		}
		if ($tm_fmt.equalsIgnoreCase(name)) {
			return tm_fmt();
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
		if ($chk_only_flg.equalsIgnoreCase(name)) {
			return chk_only_flg();
		}
		if ($ins_only_flg.equalsIgnoreCase(name)) {
			return ins_only_flg();
		}
		if ($remake_flg.equalsIgnoreCase(name)) {
			return remake_flg();
		}
		if ($crud_flg.equalsIgnoreCase(name)) {
			return crud_flg();
		}
		if ($err_continue_flg.equalsIgnoreCase(name)) {
			return err_continue_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($fmt_typ.equalsIgnoreCase(name)) {
			return fmt_typ();
		}
		if ($dt_fmt.equalsIgnoreCase(name)) {
			return dt_fmt();
		}
		if ($ts_fmt.equalsIgnoreCase(name)) {
			return ts_fmt();
		}
		if ($tm_fmt.equalsIgnoreCase(name)) {
			return tm_fmt();
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
		if ($chk_only_flg.equalsIgnoreCase(name)) {
			return chk_only_flg();
		}
		if ($ins_only_flg.equalsIgnoreCase(name)) {
			return ins_only_flg();
		}
		if ($remake_flg.equalsIgnoreCase(name)) {
			return remake_flg();
		}
		if ($crud_flg.equalsIgnoreCase(name)) {
			return crud_flg();
		}
		if ($err_continue_flg.equalsIgnoreCase(name)) {
			return err_continue_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($fmt_typ.equalsIgnoreCase(name)) {
			fmt_typ(value);
			return;
		}
		if ($dt_fmt.equalsIgnoreCase(name)) {
			dt_fmt(value);
			return;
		}
		if ($ts_fmt.equalsIgnoreCase(name)) {
			ts_fmt(value);
			return;
		}
		if ($tm_fmt.equalsIgnoreCase(name)) {
			tm_fmt(value);
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
		if ($chk_only_flg.equalsIgnoreCase(name)) {
			chk_only_flg(value);
			return;
		}
		if ($ins_only_flg.equalsIgnoreCase(name)) {
			ins_only_flg(value);
			return;
		}
		if ($remake_flg.equalsIgnoreCase(name)) {
			remake_flg(value);
			return;
		}
		if ($crud_flg.equalsIgnoreCase(name)) {
			crud_flg(value);
			return;
		}
		if ($err_continue_flg.equalsIgnoreCase(name)) {
			err_continue_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($fmt_typ.equalsIgnoreCase(name)) {
			fmt_typ(value);
			return;
		}
		if ($dt_fmt.equalsIgnoreCase(name)) {
			dt_fmt(value);
			return;
		}
		if ($ts_fmt.equalsIgnoreCase(name)) {
			ts_fmt(value);
			return;
		}
		if ($tm_fmt.equalsIgnoreCase(name)) {
			tm_fmt(value);
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
		if ($chk_only_flg.equalsIgnoreCase(name)) {
			chk_only_flg(value);
			return;
		}
		if ($ins_only_flg.equalsIgnoreCase(name)) {
			ins_only_flg(value);
			return;
		}
		if ($remake_flg.equalsIgnoreCase(name)) {
			remake_flg(value);
			return;
		}
		if ($crud_flg.equalsIgnoreCase(name)) {
			crud_flg(value);
			return;
		}
		if ($err_continue_flg.equalsIgnoreCase(name)) {
			err_continue_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

