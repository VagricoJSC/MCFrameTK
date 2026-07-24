package mcframe.clientMSBC.MSBCP0290;

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
 * ブロック"RsrcLoc"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RsrcLocR_MC_A extends MCConstRow {

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public static final String $mfg_loc_cd = "mfg_loc_cd";
	/**
	 * Resource cd. 資源ＣＤ.<p>
	 *
	 */
	public static final String $rsrc_cd = "rsrc_cd";
	/**
	 * Day 日.<p>
	 *
	 */
	public static final String $dt = "dt";
	/**
	 * Base value 基準値.<p>
	 *
	 */
	public static final String $base_qty = "base_qty";
	/**
	 * Actual value (Not to search) 実際値（検索対象外分）.<p>
	 *
	 */
	public static final String $act_qty = "act_qty";
	/**
	 * Actual value (Total) 実際値（合計）.<p>
	 *
	 */
	public static final String $sum_act_qty = "sum_act_qty";
	/**
	 * Alert アラート.<p>
	 *
	 */
	public static final String $alert_flg = "alert_flg";
	/**
	 * Firm 確定.<p>
	 *
	 */
	public static final String $fix_flg = "fix_flg";


	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta rsrc_cd_META = createCommonMeta($rsrc_cd, mcframe.commonMA.meta.MA_META.RSRC_CD);
	public static final MCMeta dt_META = createCommonMeta($dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta base_qty_META = createCommonMeta($base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta act_qty_META = createCommonMeta($act_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta sum_act_qty_META = createCommonMeta($sum_act_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta alert_flg_META = createCommonMeta($alert_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta fix_flg_META = createCommonMeta($fix_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<RsrcLocR> constMetas = new ConstMetaList<RsrcLocR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			mfg_loc_cd_META,
			rsrc_cd_META,
			dt_META,
			base_qty_META,
			act_qty_META,
			sum_act_qty_META,
			alert_flg_META,
			fix_flg_META
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
	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";

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
	protected RsrcLocR_MC_A(ConstMetaList<? extends RsrcLocR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsrcLocR clone() {
		return (RsrcLocR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsrcLocR createInstance() {
		return (RsrcLocR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsrcLocR getValues(String... names) {
		return (RsrcLocR) super.getValues(names);
	}



	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 0, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 0, $mfg_loc_cd, value);
	}


	/**
	 * Resource cd. 資源ＣＤ.<p>
	 *
	 */
	public String rsrc_cd() {
		return getConstString(offset + 1, $rsrc_cd);
	}

	/**
	 * Resource cd. 資源ＣＤ.<p>
	 *
	 */
	public void rsrc_cd(String value) {
		setConstString(offset + 1, $rsrc_cd, value);
	}


	/**
	 * Day 日.<p>
	 *
	 */
	public MCDate dt() {
		return getConstDate(offset + 2, $dt);
	}

	/**
	 * Day 日.<p>
	 *
	 */
	public void dt(MCDate value) {
		setConstDate(offset + 2, $dt, value);
	}


	/**
	 * Base value 基準値.<p>
	 *
	 */
	public MCNumber base_qty() {
		return getConstNumber(offset + 3, $base_qty);
	}

	/**
	 * Base value 基準値.<p>
	 *
	 */
	public void base_qty(MCNumber value) {
		setConstNumber(offset + 3, $base_qty, value);
	}

	/**
	 * Base value 基準値.<p>
	 *
	 */
	public void base_qty(int value) {
		setConstNumber(offset + 3, $base_qty, value);
	}

	/**
	 * Base value 基準値.<p>
	 *
	 */
	public void base_qty(long value) {
		setConstNumber(offset + 3, $base_qty, value);
	}

	/**
	 * Base value 基準値.<p>
	 *
	 */
	public void base_qty(float value) {
		setConstNumber(offset + 3, $base_qty, value);
	}

	/**
	 * Base value 基準値.<p>
	 *
	 */
	public void base_qty(double value) {
		setConstNumber(offset + 3, $base_qty, value);
	}


	/**
	 * Actual value (Not to search) 実際値（検索対象外分）.<p>
	 *
	 */
	public MCNumber act_qty() {
		return getConstNumber(offset + 4, $act_qty);
	}

	/**
	 * Actual value (Not to search) 実際値（検索対象外分）.<p>
	 *
	 */
	public void act_qty(MCNumber value) {
		setConstNumber(offset + 4, $act_qty, value);
	}

	/**
	 * Actual value (Not to search) 実際値（検索対象外分）.<p>
	 *
	 */
	public void act_qty(int value) {
		setConstNumber(offset + 4, $act_qty, value);
	}

	/**
	 * Actual value (Not to search) 実際値（検索対象外分）.<p>
	 *
	 */
	public void act_qty(long value) {
		setConstNumber(offset + 4, $act_qty, value);
	}

	/**
	 * Actual value (Not to search) 実際値（検索対象外分）.<p>
	 *
	 */
	public void act_qty(float value) {
		setConstNumber(offset + 4, $act_qty, value);
	}

	/**
	 * Actual value (Not to search) 実際値（検索対象外分）.<p>
	 *
	 */
	public void act_qty(double value) {
		setConstNumber(offset + 4, $act_qty, value);
	}


	/**
	 * Actual value (Total) 実際値（合計）.<p>
	 *
	 */
	public MCNumber sum_act_qty() {
		return getConstNumber(offset + 5, $sum_act_qty);
	}

	/**
	 * Actual value (Total) 実際値（合計）.<p>
	 *
	 */
	public void sum_act_qty(MCNumber value) {
		setConstNumber(offset + 5, $sum_act_qty, value);
	}

	/**
	 * Actual value (Total) 実際値（合計）.<p>
	 *
	 */
	public void sum_act_qty(int value) {
		setConstNumber(offset + 5, $sum_act_qty, value);
	}

	/**
	 * Actual value (Total) 実際値（合計）.<p>
	 *
	 */
	public void sum_act_qty(long value) {
		setConstNumber(offset + 5, $sum_act_qty, value);
	}

	/**
	 * Actual value (Total) 実際値（合計）.<p>
	 *
	 */
	public void sum_act_qty(float value) {
		setConstNumber(offset + 5, $sum_act_qty, value);
	}

	/**
	 * Actual value (Total) 実際値（合計）.<p>
	 *
	 */
	public void sum_act_qty(double value) {
		setConstNumber(offset + 5, $sum_act_qty, value);
	}


	/**
	 * Alert アラート.<p>
	 *
	 */
	public boolean alert_flg() {
		return getConstBoolean(offset + 6, $alert_flg);
	}

	/**
	 * Alert アラート.<p>
	 *
	 */
	public void alert_flg(boolean value) {
		setConstBoolean(offset + 6, $alert_flg, value);
	}


	/**
	 * Firm 確定.<p>
	 *
	 */
	public boolean fix_flg() {
		return getConstBoolean(offset + 7, $fix_flg);
	}

	/**
	 * Firm 確定.<p>
	 *
	 */
	public void fix_flg(boolean value) {
		setConstBoolean(offset + 7, $fix_flg, value);
	}


	public String getString(String name) {
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($rsrc_cd.equalsIgnoreCase(name)) {
			return rsrc_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($base_qty.equalsIgnoreCase(name)) {
			return base_qty();
		}
		if ($act_qty.equalsIgnoreCase(name)) {
			return act_qty();
		}
		if ($sum_act_qty.equalsIgnoreCase(name)) {
			return sum_act_qty();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($dt.equalsIgnoreCase(name)) {
			return dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($alert_flg.equalsIgnoreCase(name)) {
			return alert_flg();
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			return fix_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($rsrc_cd.equalsIgnoreCase(name)) {
			return rsrc_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($base_qty.equalsIgnoreCase(name)) {
			return base_qty();
		}
		if ($act_qty.equalsIgnoreCase(name)) {
			return act_qty();
		}
		if ($sum_act_qty.equalsIgnoreCase(name)) {
			return sum_act_qty();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($dt.equalsIgnoreCase(name)) {
			return dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($alert_flg.equalsIgnoreCase(name)) {
			return alert_flg();
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			return fix_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($rsrc_cd.equalsIgnoreCase(name)) {
			rsrc_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($act_qty.equalsIgnoreCase(name)) {
			act_qty(value);
			return;
		}
		if ($sum_act_qty.equalsIgnoreCase(name)) {
			sum_act_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($act_qty.equalsIgnoreCase(name)) {
			act_qty(value);
			return;
		}
		if ($sum_act_qty.equalsIgnoreCase(name)) {
			sum_act_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($act_qty.equalsIgnoreCase(name)) {
			act_qty(value);
			return;
		}
		if ($sum_act_qty.equalsIgnoreCase(name)) {
			sum_act_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($act_qty.equalsIgnoreCase(name)) {
			act_qty(value);
			return;
		}
		if ($sum_act_qty.equalsIgnoreCase(name)) {
			sum_act_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($act_qty.equalsIgnoreCase(name)) {
			act_qty(value);
			return;
		}
		if ($sum_act_qty.equalsIgnoreCase(name)) {
			sum_act_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($dt.equalsIgnoreCase(name)) {
			dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($alert_flg.equalsIgnoreCase(name)) {
			alert_flg(value);
			return;
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			fix_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($rsrc_cd.equalsIgnoreCase(name)) {
			rsrc_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($act_qty.equalsIgnoreCase(name)) {
			act_qty(value);
			return;
		}
		if ($sum_act_qty.equalsIgnoreCase(name)) {
			sum_act_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($act_qty.equalsIgnoreCase(name)) {
			act_qty(value);
			return;
		}
		if ($sum_act_qty.equalsIgnoreCase(name)) {
			sum_act_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($act_qty.equalsIgnoreCase(name)) {
			act_qty(value);
			return;
		}
		if ($sum_act_qty.equalsIgnoreCase(name)) {
			sum_act_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($act_qty.equalsIgnoreCase(name)) {
			act_qty(value);
			return;
		}
		if ($sum_act_qty.equalsIgnoreCase(name)) {
			sum_act_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($act_qty.equalsIgnoreCase(name)) {
			act_qty(value);
			return;
		}
		if ($sum_act_qty.equalsIgnoreCase(name)) {
			sum_act_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($dt.equalsIgnoreCase(name)) {
			dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($alert_flg.equalsIgnoreCase(name)) {
			alert_flg(value);
			return;
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			fix_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

