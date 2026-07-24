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
 * ブロック"WkCal"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class WkCalR_MC_A extends MCConstRow {

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
	 * Application start date 適用開始日.<p>
	 *
	 */
	public static final String $st_dt = "st_dt";
	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public static final String $end_dt = "end_dt";
	/**
	 * Sunday holiday 日曜休日.<p>
	 *
	 */
	public static final String $sun_off_flg = "sun_off_flg";
	/**
	 * Monday holiday 月曜休日.<p>
	 *
	 */
	public static final String $mon_off_flg = "mon_off_flg";
	/**
	 * Tuesday holiday 火曜休日.<p>
	 *
	 */
	public static final String $tue_off_flg = "tue_off_flg";
	/**
	 * Wednesday holiday 水曜休日.<p>
	 *
	 */
	public static final String $wed_off_flg = "wed_off_flg";
	/**
	 * Thursday holiday 木曜休日.<p>
	 *
	 */
	public static final String $thu_off_flg = "thu_off_flg";
	/**
	 * Friday holiday 金曜休日.<p>
	 *
	 */
	public static final String $fri_off_flg = "fri_off_flg";
	/**
	 * Saturday holiday 土曜休日.<p>
	 *
	 */
	public static final String $sat_off_flg = "sat_off_flg";


	public static final MCMeta cal_cd_META = createCommonMeta($cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta cal_nm_META = createCommonMeta($cal_nm, mcframe.commonMA.meta.MA_META.CAL_NM);
	public static final MCMeta st_dt_META = createCommonMeta($st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_dt_META = createCommonMeta($end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sun_off_flg_META = createCommonMeta($sun_off_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mon_off_flg_META = createCommonMeta($mon_off_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tue_off_flg_META = createCommonMeta($tue_off_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wed_off_flg_META = createCommonMeta($wed_off_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta thu_off_flg_META = createCommonMeta($thu_off_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta fri_off_flg_META = createCommonMeta($fri_off_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sat_off_flg_META = createCommonMeta($sat_off_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<WkCalR> constMetas = new ConstMetaList<WkCalR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			cal_cd_META,
			cal_nm_META,
			st_dt_META,
			end_dt_META,
			sun_off_flg_META,
			mon_off_flg_META,
			tue_off_flg_META,
			wed_off_flg_META,
			thu_off_flg_META,
			fri_off_flg_META,
			sat_off_flg_META
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
	protected WkCalR_MC_A(ConstMetaList<? extends WkCalR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public WkCalR clone() {
		return (WkCalR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public WkCalR createInstance() {
		return (WkCalR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public WkCalR getValues(String... names) {
		return (WkCalR) super.getValues(names);
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
	 * Application start date 適用開始日.<p>
	 *
	 */
	public MCDate st_dt() {
		return getConstDate(offset + 2, $st_dt);
	}

	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public void st_dt(MCDate value) {
		setConstDate(offset + 2, $st_dt, value);
	}


	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public MCDate end_dt() {
		return getConstDate(offset + 3, $end_dt);
	}

	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public void end_dt(MCDate value) {
		setConstDate(offset + 3, $end_dt, value);
	}


	/**
	 * Sunday holiday 日曜休日.<p>
	 *
	 */
	public boolean sun_off_flg() {
		return getConstBoolean(offset + 4, $sun_off_flg);
	}

	/**
	 * Sunday holiday 日曜休日.<p>
	 *
	 */
	public void sun_off_flg(boolean value) {
		setConstBoolean(offset + 4, $sun_off_flg, value);
	}


	/**
	 * Monday holiday 月曜休日.<p>
	 *
	 */
	public boolean mon_off_flg() {
		return getConstBoolean(offset + 5, $mon_off_flg);
	}

	/**
	 * Monday holiday 月曜休日.<p>
	 *
	 */
	public void mon_off_flg(boolean value) {
		setConstBoolean(offset + 5, $mon_off_flg, value);
	}


	/**
	 * Tuesday holiday 火曜休日.<p>
	 *
	 */
	public boolean tue_off_flg() {
		return getConstBoolean(offset + 6, $tue_off_flg);
	}

	/**
	 * Tuesday holiday 火曜休日.<p>
	 *
	 */
	public void tue_off_flg(boolean value) {
		setConstBoolean(offset + 6, $tue_off_flg, value);
	}


	/**
	 * Wednesday holiday 水曜休日.<p>
	 *
	 */
	public boolean wed_off_flg() {
		return getConstBoolean(offset + 7, $wed_off_flg);
	}

	/**
	 * Wednesday holiday 水曜休日.<p>
	 *
	 */
	public void wed_off_flg(boolean value) {
		setConstBoolean(offset + 7, $wed_off_flg, value);
	}


	/**
	 * Thursday holiday 木曜休日.<p>
	 *
	 */
	public boolean thu_off_flg() {
		return getConstBoolean(offset + 8, $thu_off_flg);
	}

	/**
	 * Thursday holiday 木曜休日.<p>
	 *
	 */
	public void thu_off_flg(boolean value) {
		setConstBoolean(offset + 8, $thu_off_flg, value);
	}


	/**
	 * Friday holiday 金曜休日.<p>
	 *
	 */
	public boolean fri_off_flg() {
		return getConstBoolean(offset + 9, $fri_off_flg);
	}

	/**
	 * Friday holiday 金曜休日.<p>
	 *
	 */
	public void fri_off_flg(boolean value) {
		setConstBoolean(offset + 9, $fri_off_flg, value);
	}


	/**
	 * Saturday holiday 土曜休日.<p>
	 *
	 */
	public boolean sat_off_flg() {
		return getConstBoolean(offset + 10, $sat_off_flg);
	}

	/**
	 * Saturday holiday 土曜休日.<p>
	 *
	 */
	public void sat_off_flg(boolean value) {
		setConstBoolean(offset + 10, $sat_off_flg, value);
	}


	public String getString(String name) {
		if ($cal_cd.equalsIgnoreCase(name)) {
			return cal_cd();
		}
		if ($cal_nm.equalsIgnoreCase(name)) {
			return cal_nm();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($st_dt.equalsIgnoreCase(name)) {
			return st_dt();
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			return end_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($sun_off_flg.equalsIgnoreCase(name)) {
			return sun_off_flg();
		}
		if ($mon_off_flg.equalsIgnoreCase(name)) {
			return mon_off_flg();
		}
		if ($tue_off_flg.equalsIgnoreCase(name)) {
			return tue_off_flg();
		}
		if ($wed_off_flg.equalsIgnoreCase(name)) {
			return wed_off_flg();
		}
		if ($thu_off_flg.equalsIgnoreCase(name)) {
			return thu_off_flg();
		}
		if ($fri_off_flg.equalsIgnoreCase(name)) {
			return fri_off_flg();
		}
		if ($sat_off_flg.equalsIgnoreCase(name)) {
			return sat_off_flg();
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
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($st_dt.equalsIgnoreCase(name)) {
			return st_dt();
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			return end_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($sun_off_flg.equalsIgnoreCase(name)) {
			return sun_off_flg();
		}
		if ($mon_off_flg.equalsIgnoreCase(name)) {
			return mon_off_flg();
		}
		if ($tue_off_flg.equalsIgnoreCase(name)) {
			return tue_off_flg();
		}
		if ($wed_off_flg.equalsIgnoreCase(name)) {
			return wed_off_flg();
		}
		if ($thu_off_flg.equalsIgnoreCase(name)) {
			return thu_off_flg();
		}
		if ($fri_off_flg.equalsIgnoreCase(name)) {
			return fri_off_flg();
		}
		if ($sat_off_flg.equalsIgnoreCase(name)) {
			return sat_off_flg();
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
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($st_dt.equalsIgnoreCase(name)) {
			st_dt(value);
			return;
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			end_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($sun_off_flg.equalsIgnoreCase(name)) {
			sun_off_flg(value);
			return;
		}
		if ($mon_off_flg.equalsIgnoreCase(name)) {
			mon_off_flg(value);
			return;
		}
		if ($tue_off_flg.equalsIgnoreCase(name)) {
			tue_off_flg(value);
			return;
		}
		if ($wed_off_flg.equalsIgnoreCase(name)) {
			wed_off_flg(value);
			return;
		}
		if ($thu_off_flg.equalsIgnoreCase(name)) {
			thu_off_flg(value);
			return;
		}
		if ($fri_off_flg.equalsIgnoreCase(name)) {
			fri_off_flg(value);
			return;
		}
		if ($sat_off_flg.equalsIgnoreCase(name)) {
			sat_off_flg(value);
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
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($st_dt.equalsIgnoreCase(name)) {
			st_dt(value);
			return;
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			end_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($sun_off_flg.equalsIgnoreCase(name)) {
			sun_off_flg(value);
			return;
		}
		if ($mon_off_flg.equalsIgnoreCase(name)) {
			mon_off_flg(value);
			return;
		}
		if ($tue_off_flg.equalsIgnoreCase(name)) {
			tue_off_flg(value);
			return;
		}
		if ($wed_off_flg.equalsIgnoreCase(name)) {
			wed_off_flg(value);
			return;
		}
		if ($thu_off_flg.equalsIgnoreCase(name)) {
			thu_off_flg(value);
			return;
		}
		if ($fri_off_flg.equalsIgnoreCase(name)) {
			fri_off_flg(value);
			return;
		}
		if ($sat_off_flg.equalsIgnoreCase(name)) {
			sat_off_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

