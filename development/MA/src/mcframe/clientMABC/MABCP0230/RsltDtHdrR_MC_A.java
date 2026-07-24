package mcframe.clientMABC.MABCP0230;

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
 * ブロック"RsltDtHdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RsltDtHdrR_MC_A extends MCConstRow {

	/**
	 * Calendar cd. カレンダＣＤ.<p>
	 *
	 */
	public static final String $cal_cd = "cal_cd";
	/**
	 * Calendar name カレンダ名.<p>
	 *
	 */
	public static final String $cal_nm = "cal_nm";
	/**
	 * Date 日付.<p>
	 *
	 */
	public static final String $dt = "dt";
	/**
	 * Day type 曜日区分.<p>
	 *
	 */
	public static final String $day_week_typ = "day_week_typ";
	/**
	 * Day of week 曜日.<p>
	 *
	 */
	public static final String $day_week_typ_nm = "day_week_typ_nm";
	/**
	 * Holiday 休日.<p>
	 *
	 */
	public static final String $off_flg_disp = "off_flg_disp";
	/**
	 * Holiday 休日.<p>
	 *
	 */
	public static final String $off_flg = "off_flg";
	/**
	 * Temporary calendar 臨時カレンダ.<p>
	 *
	 */
	public static final String $cal_ext_disp = "cal_ext_disp";
	/**
	 * Temporary calendar 臨時カレンダ.<p>
	 *
	 */
	public static final String $cal_ext = "cal_ext";
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


	public static final MCMeta cal_cd_META = createCommonMeta($cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta cal_nm_META = createCommonMeta($cal_nm, mcframe.commonMA.meta.MA_META.CAL_NM);
	public static final MCMeta dt_META = createCommonMeta($dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta day_week_typ_META = createCommonMeta($day_week_typ, mcframe.commonMA.meta.MA_META.DAY_WEEK_TYP);
	public static final MCMeta day_week_typ_nm_META = createCommonMeta($day_week_typ_nm, mcframe.commonMA.meta.MA_META.DAY_WEEK_TYP_NM);
	public static final MCMeta off_flg_disp_META = createCommonMeta($off_flg_disp, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta off_flg_META = createCommonMeta($off_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cal_ext_disp_META = createCommonMeta($cal_ext_disp, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cal_ext_META = createCommonMeta($cal_ext, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);

	protected static final ConstMetaList<RsltDtHdrR> constMetas = new ConstMetaList<RsltDtHdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			cal_cd_META,
			cal_nm_META,
			dt_META,
			day_week_typ_META,
			day_week_typ_nm_META,
			off_flg_disp_META,
			off_flg_META,
			cal_ext_disp_META,
			cal_ext_META,
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

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
		}
	);

	/** 項目属性情報のグループ[FLG_GRP]のキー定数 */
	public static final String $$FLG_GRP = "FLG_GRP";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$FLG_GRP, new MCExtList(
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
	protected RsltDtHdrR_MC_A(ConstMetaList<? extends RsltDtHdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltDtHdrR clone() {
		return (RsltDtHdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltDtHdrR createInstance() {
		return (RsltDtHdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltDtHdrR getValues(String... names) {
		return (RsltDtHdrR) super.getValues(names);
	}



	/**
	 * Calendar cd. カレンダＣＤ.<p>
	 *
	 */
	public String cal_cd() {
		return getConstString(offset + 0, $cal_cd);
	}

	/**
	 * Calendar cd. カレンダＣＤ.<p>
	 *
	 */
	public void cal_cd(String value) {
		setConstString(offset + 0, $cal_cd, value);
	}


	/**
	 * Calendar name カレンダ名.<p>
	 *
	 */
	public String cal_nm() {
		return getConstString(offset + 1, $cal_nm);
	}

	/**
	 * Calendar name カレンダ名.<p>
	 *
	 */
	public void cal_nm(String value) {
		setConstString(offset + 1, $cal_nm, value);
	}


	/**
	 * Date 日付.<p>
	 *
	 */
	public MCDate dt() {
		return getConstDate(offset + 2, $dt);
	}

	/**
	 * Date 日付.<p>
	 *
	 */
	public void dt(MCDate value) {
		setConstDate(offset + 2, $dt, value);
	}


	/**
	 * Day type 曜日区分.<p>
	 *
	 */
	public String day_week_typ() {
		return getConstString(offset + 3, $day_week_typ);
	}

	/**
	 * Day type 曜日区分.<p>
	 *
	 */
	public void day_week_typ(String value) {
		setConstString(offset + 3, $day_week_typ, value);
	}


	/**
	 * Day of week 曜日.<p>
	 *
	 */
	public String day_week_typ_nm() {
		return getConstString(offset + 4, $day_week_typ_nm);
	}

	/**
	 * Day of week 曜日.<p>
	 *
	 */
	public void day_week_typ_nm(String value) {
		setConstString(offset + 4, $day_week_typ_nm, value);
	}


	/**
	 * Holiday 休日.<p>
	 *
	 */
	public boolean off_flg_disp() {
		return getConstBoolean(offset + 5, $off_flg_disp);
	}

	/**
	 * Holiday 休日.<p>
	 *
	 */
	public void off_flg_disp(boolean value) {
		setConstBoolean(offset + 5, $off_flg_disp, value);
	}


	/**
	 * Holiday 休日.<p>
	 *
	 */
	public boolean off_flg() {
		return getConstBoolean(offset + 6, $off_flg);
	}

	/**
	 * Holiday 休日.<p>
	 *
	 */
	public void off_flg(boolean value) {
		setConstBoolean(offset + 6, $off_flg, value);
	}


	/**
	 * Temporary calendar 臨時カレンダ.<p>
	 *
	 */
	public boolean cal_ext_disp() {
		return getConstBoolean(offset + 7, $cal_ext_disp);
	}

	/**
	 * Temporary calendar 臨時カレンダ.<p>
	 *
	 */
	public void cal_ext_disp(boolean value) {
		setConstBoolean(offset + 7, $cal_ext_disp, value);
	}


	/**
	 * Temporary calendar 臨時カレンダ.<p>
	 *
	 */
	public boolean cal_ext() {
		return getConstBoolean(offset + 8, $cal_ext);
	}

	/**
	 * Temporary calendar 臨時カレンダ.<p>
	 *
	 */
	public void cal_ext(boolean value) {
		setConstBoolean(offset + 8, $cal_ext, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 9, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 9, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 10, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 10, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 11, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 11, $memo3, value);
	}


	public String getString(String name) {
		if ($cal_cd.equalsIgnoreCase(name)) {
			return cal_cd();
		}
		if ($cal_nm.equalsIgnoreCase(name)) {
			return cal_nm();
		}
		if ($day_week_typ.equalsIgnoreCase(name)) {
			return day_week_typ();
		}
		if ($day_week_typ_nm.equalsIgnoreCase(name)) {
			return day_week_typ_nm();
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
	public MCDate getDate(String name) {
		if ($dt.equalsIgnoreCase(name)) {
			return dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($off_flg_disp.equalsIgnoreCase(name)) {
			return off_flg_disp();
		}
		if ($off_flg.equalsIgnoreCase(name)) {
			return off_flg();
		}
		if ($cal_ext_disp.equalsIgnoreCase(name)) {
			return cal_ext_disp();
		}
		if ($cal_ext.equalsIgnoreCase(name)) {
			return cal_ext();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($cal_cd.equalsIgnoreCase(name)) {
			return cal_cd();
		}
		if ($cal_nm.equalsIgnoreCase(name)) {
			return cal_nm();
		}
		if ($day_week_typ.equalsIgnoreCase(name)) {
			return day_week_typ();
		}
		if ($day_week_typ_nm.equalsIgnoreCase(name)) {
			return day_week_typ_nm();
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
	public MCDate getDateNE(String name) {
		if ($dt.equalsIgnoreCase(name)) {
			return dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($off_flg_disp.equalsIgnoreCase(name)) {
			return off_flg_disp();
		}
		if ($off_flg.equalsIgnoreCase(name)) {
			return off_flg();
		}
		if ($cal_ext_disp.equalsIgnoreCase(name)) {
			return cal_ext_disp();
		}
		if ($cal_ext.equalsIgnoreCase(name)) {
			return cal_ext();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($cal_cd.equalsIgnoreCase(name)) {
			cal_cd(value);
			return;
		}
		if ($cal_nm.equalsIgnoreCase(name)) {
			cal_nm(value);
			return;
		}
		if ($day_week_typ.equalsIgnoreCase(name)) {
			day_week_typ(value);
			return;
		}
		if ($day_week_typ_nm.equalsIgnoreCase(name)) {
			day_week_typ_nm(value);
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
	public void setDate(String name, MCDate value) {
		if ($dt.equalsIgnoreCase(name)) {
			dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($off_flg_disp.equalsIgnoreCase(name)) {
			off_flg_disp(value);
			return;
		}
		if ($off_flg.equalsIgnoreCase(name)) {
			off_flg(value);
			return;
		}
		if ($cal_ext_disp.equalsIgnoreCase(name)) {
			cal_ext_disp(value);
			return;
		}
		if ($cal_ext.equalsIgnoreCase(name)) {
			cal_ext(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($cal_cd.equalsIgnoreCase(name)) {
			cal_cd(value);
			return;
		}
		if ($cal_nm.equalsIgnoreCase(name)) {
			cal_nm(value);
			return;
		}
		if ($day_week_typ.equalsIgnoreCase(name)) {
			day_week_typ(value);
			return;
		}
		if ($day_week_typ_nm.equalsIgnoreCase(name)) {
			day_week_typ_nm(value);
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
	public void setDateNE(String name, MCDate value) {
		if ($dt.equalsIgnoreCase(name)) {
			dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($off_flg_disp.equalsIgnoreCase(name)) {
			off_flg_disp(value);
			return;
		}
		if ($off_flg.equalsIgnoreCase(name)) {
			off_flg(value);
			return;
		}
		if ($cal_ext_disp.equalsIgnoreCase(name)) {
			cal_ext_disp(value);
			return;
		}
		if ($cal_ext.equalsIgnoreCase(name)) {
			cal_ext(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

