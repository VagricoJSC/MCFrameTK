package mcframe.clientMSBC.MSBCP0320;

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
 * ブロック"Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RsltR_MC_A extends MCConstRow {

	/**
	 * Location resource display order 場所資源表示順.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public static final String $mfg_loc_cd = "mfg_loc_cd";
	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public static final String $mfg_loc_nm = "mfg_loc_nm";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * Resource cd. 資源ＣＤ.<p>
	 *
	 */
	public static final String $rsrc_cd = "rsrc_cd";
	/**
	 * Resource name 資源名.<p>
	 *
	 */
	public static final String $rsrc_nm = "rsrc_nm";
	/**
	 * Resource unit name 資源単位名.<p>
	 *
	 */
	public static final String $rsrc_unit_nm = "rsrc_unit_nm";
	/**
	 * Resource number of decimal places 資源小数部有効桁数.<p>
	 *
	 */
	public static final String $rsrc_dec_place = "rsrc_dec_place";
	/**
	 * Start date 開始年月日.<p>
	 *
	 */
	public static final String $dt_fr = "dt_fr";
	/**
	 * End date 終了年月日.<p>
	 *
	 */
	public static final String $dt_to = "dt_to";
	/**
	 * Number of operating days 稼働日数.<p>
	 *
	 */
	public static final String $on_num = "on_num";
	/**
	 * Load ratio 負荷率.<p>
	 *
	 */
	public static final String $ld_rate = "ld_rate";
	/**
	 * Actual value 実際値.<p>
	 *
	 */
	public static final String $act_qty = "act_qty";
	/**
	 * Base value 基準値.<p>
	 *
	 */
	public static final String $base_qty = "base_qty";
	/**
	 * Alert threshold アラート閾値.<p>
	 *
	 */
	public static final String $alert_qty = "alert_qty";


	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta mfg_loc_nm_META = createCommonMeta($mfg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta rsrc_cd_META = createCommonMeta($rsrc_cd, mcframe.commonMA.meta.MA_META.RSRC_CD);
	public static final MCMeta rsrc_nm_META = createCommonMeta($rsrc_nm, mcframe.commonMA.meta.MA_META.RSRC_NM);
	public static final MCMeta rsrc_unit_nm_META = createCommonMeta($rsrc_unit_nm, mcframe.commonMA.meta.MA_META.RSRC_UNIT_NM);
	public static final MCMeta rsrc_dec_place_META = createCommonMeta($rsrc_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta dt_fr_META = createCommonMeta($dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dt_to_META = createCommonMeta($dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta on_num_META = createCommonMeta($on_num, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta ld_rate_META = createCommonMeta($ld_rate, mcframe.commonMA.meta.MA_META.PER);
	public static final MCMeta act_qty_META = createCommonMeta($act_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_qty_META = createCommonMeta($base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta alert_qty_META = createCommonMeta($alert_qty, mcframe.commonMA.meta.MA_META.QTY);

	protected static final ConstMetaList<RsltR> constMetas = new ConstMetaList<RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			disp_seq_META,
			mfg_loc_cd_META,
			mfg_loc_nm_META,
			wg_cd_META,
			rsrc_cd_META,
			rsrc_nm_META,
			rsrc_unit_nm_META,
			rsrc_dec_place_META,
			dt_fr_META,
			dt_to_META,
			on_num_META,
			ld_rate_META,
			act_qty_META,
			base_qty_META,
			alert_qty_META
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
	/** 項目属性情報のグループ[VH_KEY]のキー定数 */
	public static final String $$VH_KEY = "VH_KEY";
	/** 項目属性情報のグループ[VH_DISP_COL]のキー定数 */
	public static final String $$VH_DISP_COL = "VH_DISP_COL";
	/** 項目属性情報のグループ[VH_DISP_GRP]のキー定数 */
	public static final String $$VH_DISP_GRP = "VH_DISP_GRP";
	/** 項目属性情報のグループ[VH_DISP_IDX]のキー定数 */
	public static final String $$VH_DISP_IDX = "VH_DISP_IDX";
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
		new MCExtMap.Entry($$VH_KEY, new MCExtList(
			new String[][]{
				{$disp_seq, "HKEY"},	// disp_seq
				{$mfg_loc_cd, "HKEY"},	// mfg_loc_cd
				{$mfg_loc_nm, "HKEY"},	// mfg_loc_nm
				{$wg_cd, "HKEY"},	// wg_cd
				{$rsrc_cd, "HKEY"},	// rsrc_cd
				{$rsrc_nm, "HKEY"},	// rsrc_nm
				{$rsrc_unit_nm, "HKEY"},	// rsrc_unit_nm
				{$rsrc_dec_place, "HKEY"},	// rsrc_dec_place
				{$dt_fr, "ELM"},	// dt_fr
				{$ld_rate, "HVAL"},	// ld_rate
				{$act_qty, "HVAL"},	// act_qty
				{$base_qty, "HVAL"},	// base_qty
				{$alert_qty, "HVAL"}	// alert_qty
			}
		)),
		new MCExtMap.Entry($$VH_DISP_COL, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$VH_DISP_GRP, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$VH_DISP_IDX, new MCExtList(
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
	protected RsltR_MC_A(ConstMetaList<? extends RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR clone() {
		return (RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR createInstance() {
		return (RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR getValues(String... names) {
		return (RsltR) super.getValues(names);
	}



	/**
	 * Location resource display order 場所資源表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 0, $disp_seq);
	}

	/**
	 * Location resource display order 場所資源表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 0, $disp_seq, value);
	}

	/**
	 * Location resource display order 場所資源表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 0, $disp_seq, value);
	}

	/**
	 * Location resource display order 場所資源表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 0, $disp_seq, value);
	}

	/**
	 * Location resource display order 場所資源表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 0, $disp_seq, value);
	}

	/**
	 * Location resource display order 場所資源表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 0, $disp_seq, value);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 1, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 1, $mfg_loc_cd, value);
	}


	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public String mfg_loc_nm() {
		return getConstString(offset + 2, $mfg_loc_nm);
	}

	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public void mfg_loc_nm(String value) {
		setConstString(offset + 2, $mfg_loc_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 3, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 3, $wg_cd, value);
	}


	/**
	 * Resource cd. 資源ＣＤ.<p>
	 *
	 */
	public String rsrc_cd() {
		return getConstString(offset + 4, $rsrc_cd);
	}

	/**
	 * Resource cd. 資源ＣＤ.<p>
	 *
	 */
	public void rsrc_cd(String value) {
		setConstString(offset + 4, $rsrc_cd, value);
	}


	/**
	 * Resource name 資源名.<p>
	 *
	 */
	public String rsrc_nm() {
		return getConstString(offset + 5, $rsrc_nm);
	}

	/**
	 * Resource name 資源名.<p>
	 *
	 */
	public void rsrc_nm(String value) {
		setConstString(offset + 5, $rsrc_nm, value);
	}


	/**
	 * Resource unit name 資源単位名.<p>
	 *
	 */
	public String rsrc_unit_nm() {
		return getConstString(offset + 6, $rsrc_unit_nm);
	}

	/**
	 * Resource unit name 資源単位名.<p>
	 *
	 */
	public void rsrc_unit_nm(String value) {
		setConstString(offset + 6, $rsrc_unit_nm, value);
	}


	/**
	 * Resource number of decimal places 資源小数部有効桁数.<p>
	 *
	 */
	public MCNumber rsrc_dec_place() {
		return getConstNumber(offset + 7, $rsrc_dec_place);
	}

	/**
	 * Resource number of decimal places 資源小数部有効桁数.<p>
	 *
	 */
	public void rsrc_dec_place(MCNumber value) {
		setConstNumber(offset + 7, $rsrc_dec_place, value);
	}

	/**
	 * Resource number of decimal places 資源小数部有効桁数.<p>
	 *
	 */
	public void rsrc_dec_place(int value) {
		setConstNumber(offset + 7, $rsrc_dec_place, value);
	}

	/**
	 * Resource number of decimal places 資源小数部有効桁数.<p>
	 *
	 */
	public void rsrc_dec_place(long value) {
		setConstNumber(offset + 7, $rsrc_dec_place, value);
	}

	/**
	 * Resource number of decimal places 資源小数部有効桁数.<p>
	 *
	 */
	public void rsrc_dec_place(float value) {
		setConstNumber(offset + 7, $rsrc_dec_place, value);
	}

	/**
	 * Resource number of decimal places 資源小数部有効桁数.<p>
	 *
	 */
	public void rsrc_dec_place(double value) {
		setConstNumber(offset + 7, $rsrc_dec_place, value);
	}


	/**
	 * Start date 開始年月日.<p>
	 *
	 */
	public MCDate dt_fr() {
		return getConstDate(offset + 8, $dt_fr);
	}

	/**
	 * Start date 開始年月日.<p>
	 *
	 */
	public void dt_fr(MCDate value) {
		setConstDate(offset + 8, $dt_fr, value);
	}


	/**
	 * End date 終了年月日.<p>
	 *
	 */
	public MCDate dt_to() {
		return getConstDate(offset + 9, $dt_to);
	}

	/**
	 * End date 終了年月日.<p>
	 *
	 */
	public void dt_to(MCDate value) {
		setConstDate(offset + 9, $dt_to, value);
	}


	/**
	 * Number of operating days 稼働日数.<p>
	 *
	 */
	public MCNumber on_num() {
		return getConstNumber(offset + 10, $on_num);
	}

	/**
	 * Number of operating days 稼働日数.<p>
	 *
	 */
	public void on_num(MCNumber value) {
		setConstNumber(offset + 10, $on_num, value);
	}

	/**
	 * Number of operating days 稼働日数.<p>
	 *
	 */
	public void on_num(int value) {
		setConstNumber(offset + 10, $on_num, value);
	}

	/**
	 * Number of operating days 稼働日数.<p>
	 *
	 */
	public void on_num(long value) {
		setConstNumber(offset + 10, $on_num, value);
	}

	/**
	 * Number of operating days 稼働日数.<p>
	 *
	 */
	public void on_num(float value) {
		setConstNumber(offset + 10, $on_num, value);
	}

	/**
	 * Number of operating days 稼働日数.<p>
	 *
	 */
	public void on_num(double value) {
		setConstNumber(offset + 10, $on_num, value);
	}


	/**
	 * Load ratio 負荷率.<p>
	 *
	 */
	public MCNumber ld_rate() {
		return getConstNumber(offset + 11, $ld_rate);
	}

	/**
	 * Load ratio 負荷率.<p>
	 *
	 */
	public void ld_rate(MCNumber value) {
		setConstNumber(offset + 11, $ld_rate, value);
	}

	/**
	 * Load ratio 負荷率.<p>
	 *
	 */
	public void ld_rate(int value) {
		setConstNumber(offset + 11, $ld_rate, value);
	}

	/**
	 * Load ratio 負荷率.<p>
	 *
	 */
	public void ld_rate(long value) {
		setConstNumber(offset + 11, $ld_rate, value);
	}

	/**
	 * Load ratio 負荷率.<p>
	 *
	 */
	public void ld_rate(float value) {
		setConstNumber(offset + 11, $ld_rate, value);
	}

	/**
	 * Load ratio 負荷率.<p>
	 *
	 */
	public void ld_rate(double value) {
		setConstNumber(offset + 11, $ld_rate, value);
	}


	/**
	 * Actual value 実際値.<p>
	 *
	 */
	public MCNumber act_qty() {
		return getConstNumber(offset + 12, $act_qty);
	}

	/**
	 * Actual value 実際値.<p>
	 *
	 */
	public void act_qty(MCNumber value) {
		setConstNumber(offset + 12, $act_qty, value);
	}

	/**
	 * Actual value 実際値.<p>
	 *
	 */
	public void act_qty(int value) {
		setConstNumber(offset + 12, $act_qty, value);
	}

	/**
	 * Actual value 実際値.<p>
	 *
	 */
	public void act_qty(long value) {
		setConstNumber(offset + 12, $act_qty, value);
	}

	/**
	 * Actual value 実際値.<p>
	 *
	 */
	public void act_qty(float value) {
		setConstNumber(offset + 12, $act_qty, value);
	}

	/**
	 * Actual value 実際値.<p>
	 *
	 */
	public void act_qty(double value) {
		setConstNumber(offset + 12, $act_qty, value);
	}


	/**
	 * Base value 基準値.<p>
	 *
	 */
	public MCNumber base_qty() {
		return getConstNumber(offset + 13, $base_qty);
	}

	/**
	 * Base value 基準値.<p>
	 *
	 */
	public void base_qty(MCNumber value) {
		setConstNumber(offset + 13, $base_qty, value);
	}

	/**
	 * Base value 基準値.<p>
	 *
	 */
	public void base_qty(int value) {
		setConstNumber(offset + 13, $base_qty, value);
	}

	/**
	 * Base value 基準値.<p>
	 *
	 */
	public void base_qty(long value) {
		setConstNumber(offset + 13, $base_qty, value);
	}

	/**
	 * Base value 基準値.<p>
	 *
	 */
	public void base_qty(float value) {
		setConstNumber(offset + 13, $base_qty, value);
	}

	/**
	 * Base value 基準値.<p>
	 *
	 */
	public void base_qty(double value) {
		setConstNumber(offset + 13, $base_qty, value);
	}


	/**
	 * Alert threshold アラート閾値.<p>
	 *
	 */
	public MCNumber alert_qty() {
		return getConstNumber(offset + 14, $alert_qty);
	}

	/**
	 * Alert threshold アラート閾値.<p>
	 *
	 */
	public void alert_qty(MCNumber value) {
		setConstNumber(offset + 14, $alert_qty, value);
	}

	/**
	 * Alert threshold アラート閾値.<p>
	 *
	 */
	public void alert_qty(int value) {
		setConstNumber(offset + 14, $alert_qty, value);
	}

	/**
	 * Alert threshold アラート閾値.<p>
	 *
	 */
	public void alert_qty(long value) {
		setConstNumber(offset + 14, $alert_qty, value);
	}

	/**
	 * Alert threshold アラート閾値.<p>
	 *
	 */
	public void alert_qty(float value) {
		setConstNumber(offset + 14, $alert_qty, value);
	}

	/**
	 * Alert threshold アラート閾値.<p>
	 *
	 */
	public void alert_qty(double value) {
		setConstNumber(offset + 14, $alert_qty, value);
	}


	public String getString(String name) {
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($rsrc_cd.equalsIgnoreCase(name)) {
			return rsrc_cd();
		}
		if ($rsrc_nm.equalsIgnoreCase(name)) {
			return rsrc_nm();
		}
		if ($rsrc_unit_nm.equalsIgnoreCase(name)) {
			return rsrc_unit_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($rsrc_dec_place.equalsIgnoreCase(name)) {
			return rsrc_dec_place();
		}
		if ($on_num.equalsIgnoreCase(name)) {
			return on_num();
		}
		if ($ld_rate.equalsIgnoreCase(name)) {
			return ld_rate();
		}
		if ($act_qty.equalsIgnoreCase(name)) {
			return act_qty();
		}
		if ($base_qty.equalsIgnoreCase(name)) {
			return base_qty();
		}
		if ($alert_qty.equalsIgnoreCase(name)) {
			return alert_qty();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($dt_fr.equalsIgnoreCase(name)) {
			return dt_fr();
		}
		if ($dt_to.equalsIgnoreCase(name)) {
			return dt_to();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($rsrc_cd.equalsIgnoreCase(name)) {
			return rsrc_cd();
		}
		if ($rsrc_nm.equalsIgnoreCase(name)) {
			return rsrc_nm();
		}
		if ($rsrc_unit_nm.equalsIgnoreCase(name)) {
			return rsrc_unit_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($rsrc_dec_place.equalsIgnoreCase(name)) {
			return rsrc_dec_place();
		}
		if ($on_num.equalsIgnoreCase(name)) {
			return on_num();
		}
		if ($ld_rate.equalsIgnoreCase(name)) {
			return ld_rate();
		}
		if ($act_qty.equalsIgnoreCase(name)) {
			return act_qty();
		}
		if ($base_qty.equalsIgnoreCase(name)) {
			return base_qty();
		}
		if ($alert_qty.equalsIgnoreCase(name)) {
			return alert_qty();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($dt_fr.equalsIgnoreCase(name)) {
			return dt_fr();
		}
		if ($dt_to.equalsIgnoreCase(name)) {
			return dt_to();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			mfg_loc_nm(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($rsrc_cd.equalsIgnoreCase(name)) {
			rsrc_cd(value);
			return;
		}
		if ($rsrc_nm.equalsIgnoreCase(name)) {
			rsrc_nm(value);
			return;
		}
		if ($rsrc_unit_nm.equalsIgnoreCase(name)) {
			rsrc_unit_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($rsrc_dec_place.equalsIgnoreCase(name)) {
			rsrc_dec_place(value);
			return;
		}
		if ($on_num.equalsIgnoreCase(name)) {
			on_num(value);
			return;
		}
		if ($ld_rate.equalsIgnoreCase(name)) {
			ld_rate(value);
			return;
		}
		if ($act_qty.equalsIgnoreCase(name)) {
			act_qty(value);
			return;
		}
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($alert_qty.equalsIgnoreCase(name)) {
			alert_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($rsrc_dec_place.equalsIgnoreCase(name)) {
			rsrc_dec_place(value);
			return;
		}
		if ($on_num.equalsIgnoreCase(name)) {
			on_num(value);
			return;
		}
		if ($ld_rate.equalsIgnoreCase(name)) {
			ld_rate(value);
			return;
		}
		if ($act_qty.equalsIgnoreCase(name)) {
			act_qty(value);
			return;
		}
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($alert_qty.equalsIgnoreCase(name)) {
			alert_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($rsrc_dec_place.equalsIgnoreCase(name)) {
			rsrc_dec_place(value);
			return;
		}
		if ($on_num.equalsIgnoreCase(name)) {
			on_num(value);
			return;
		}
		if ($ld_rate.equalsIgnoreCase(name)) {
			ld_rate(value);
			return;
		}
		if ($act_qty.equalsIgnoreCase(name)) {
			act_qty(value);
			return;
		}
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($alert_qty.equalsIgnoreCase(name)) {
			alert_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($rsrc_dec_place.equalsIgnoreCase(name)) {
			rsrc_dec_place(value);
			return;
		}
		if ($on_num.equalsIgnoreCase(name)) {
			on_num(value);
			return;
		}
		if ($ld_rate.equalsIgnoreCase(name)) {
			ld_rate(value);
			return;
		}
		if ($act_qty.equalsIgnoreCase(name)) {
			act_qty(value);
			return;
		}
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($alert_qty.equalsIgnoreCase(name)) {
			alert_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($rsrc_dec_place.equalsIgnoreCase(name)) {
			rsrc_dec_place(value);
			return;
		}
		if ($on_num.equalsIgnoreCase(name)) {
			on_num(value);
			return;
		}
		if ($ld_rate.equalsIgnoreCase(name)) {
			ld_rate(value);
			return;
		}
		if ($act_qty.equalsIgnoreCase(name)) {
			act_qty(value);
			return;
		}
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($alert_qty.equalsIgnoreCase(name)) {
			alert_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($dt_fr.equalsIgnoreCase(name)) {
			dt_fr(value);
			return;
		}
		if ($dt_to.equalsIgnoreCase(name)) {
			dt_to(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			mfg_loc_nm(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($rsrc_cd.equalsIgnoreCase(name)) {
			rsrc_cd(value);
			return;
		}
		if ($rsrc_nm.equalsIgnoreCase(name)) {
			rsrc_nm(value);
			return;
		}
		if ($rsrc_unit_nm.equalsIgnoreCase(name)) {
			rsrc_unit_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($rsrc_dec_place.equalsIgnoreCase(name)) {
			rsrc_dec_place(value);
			return;
		}
		if ($on_num.equalsIgnoreCase(name)) {
			on_num(value);
			return;
		}
		if ($ld_rate.equalsIgnoreCase(name)) {
			ld_rate(value);
			return;
		}
		if ($act_qty.equalsIgnoreCase(name)) {
			act_qty(value);
			return;
		}
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($alert_qty.equalsIgnoreCase(name)) {
			alert_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($rsrc_dec_place.equalsIgnoreCase(name)) {
			rsrc_dec_place(value);
			return;
		}
		if ($on_num.equalsIgnoreCase(name)) {
			on_num(value);
			return;
		}
		if ($ld_rate.equalsIgnoreCase(name)) {
			ld_rate(value);
			return;
		}
		if ($act_qty.equalsIgnoreCase(name)) {
			act_qty(value);
			return;
		}
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($alert_qty.equalsIgnoreCase(name)) {
			alert_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($rsrc_dec_place.equalsIgnoreCase(name)) {
			rsrc_dec_place(value);
			return;
		}
		if ($on_num.equalsIgnoreCase(name)) {
			on_num(value);
			return;
		}
		if ($ld_rate.equalsIgnoreCase(name)) {
			ld_rate(value);
			return;
		}
		if ($act_qty.equalsIgnoreCase(name)) {
			act_qty(value);
			return;
		}
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($alert_qty.equalsIgnoreCase(name)) {
			alert_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($rsrc_dec_place.equalsIgnoreCase(name)) {
			rsrc_dec_place(value);
			return;
		}
		if ($on_num.equalsIgnoreCase(name)) {
			on_num(value);
			return;
		}
		if ($ld_rate.equalsIgnoreCase(name)) {
			ld_rate(value);
			return;
		}
		if ($act_qty.equalsIgnoreCase(name)) {
			act_qty(value);
			return;
		}
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($alert_qty.equalsIgnoreCase(name)) {
			alert_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($rsrc_dec_place.equalsIgnoreCase(name)) {
			rsrc_dec_place(value);
			return;
		}
		if ($on_num.equalsIgnoreCase(name)) {
			on_num(value);
			return;
		}
		if ($ld_rate.equalsIgnoreCase(name)) {
			ld_rate(value);
			return;
		}
		if ($act_qty.equalsIgnoreCase(name)) {
			act_qty(value);
			return;
		}
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($alert_qty.equalsIgnoreCase(name)) {
			alert_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($dt_fr.equalsIgnoreCase(name)) {
			dt_fr(value);
			return;
		}
		if ($dt_to.equalsIgnoreCase(name)) {
			dt_to(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

