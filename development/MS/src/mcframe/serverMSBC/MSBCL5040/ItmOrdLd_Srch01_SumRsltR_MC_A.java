package mcframe.serverMSBC.MSBCL5040;

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
 * ブロック"ItmOrdLd_Srch01_SumRslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ItmOrdLd_Srch01_SumRsltR_MC_A extends MCConstRow {

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
	 * Resource number of decimal places name 資源小数部有効桁数名.<p>
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
	/**
	 * Load ratio 負荷率.<p>
	 *
	 */
	public static final String $ld_rate = "ld_rate";


	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta mfg_loc_nm_META = createCommonMeta($mfg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta rsrc_cd_META = createCommonMeta($rsrc_cd, mcframe.commonMA.meta.MA_META.RSRC_CD);
	public static final MCMeta rsrc_nm_META = createCommonMeta($rsrc_nm, mcframe.commonMA.meta.MA_META.RSRC_NM);
	public static final MCMeta rsrc_unit_nm_META = createCommonMeta($rsrc_unit_nm, mcframe.commonMA.meta.MA_META.RSRC_UNIT_NM);
	public static final MCMeta rsrc_dec_place_META = createCommonMeta($rsrc_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta dt_fr_META = createCommonMeta($dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dt_to_META = createCommonMeta($dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta on_num_META = createCommonMeta($on_num, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta act_qty_META = createCommonMeta($act_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_qty_META = createCommonMeta($base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta alert_qty_META = createCommonMeta($alert_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta ld_rate_META = createCommonMeta($ld_rate, mcframe.commonMA.meta.MA_META.PER);

	protected static final ConstMetaList<ItmOrdLd_Srch01_SumRsltR> constMetas = new ConstMetaList<ItmOrdLd_Srch01_SumRsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			mfg_loc_cd_META,
			mfg_loc_nm_META,
			rsrc_cd_META,
			rsrc_nm_META,
			rsrc_unit_nm_META,
			rsrc_dec_place_META,
			dt_fr_META,
			dt_to_META,
			on_num_META,
			act_qty_META,
			base_qty_META,
			alert_qty_META,
			ld_rate_META
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
	protected ItmOrdLd_Srch01_SumRsltR_MC_A(ConstMetaList<? extends ItmOrdLd_Srch01_SumRsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ItmOrdLd_Srch01_SumRsltR clone() {
		return (ItmOrdLd_Srch01_SumRsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ItmOrdLd_Srch01_SumRsltR createInstance() {
		return (ItmOrdLd_Srch01_SumRsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ItmOrdLd_Srch01_SumRsltR getValues(String... names) {
		return (ItmOrdLd_Srch01_SumRsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
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
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public String mfg_loc_nm() {
		return getConstString(offset + 1, $mfg_loc_nm);
	}

	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public void mfg_loc_nm(String value) {
		setConstString(offset + 1, $mfg_loc_nm, value);
	}


	/**
	 * Resource cd. 資源ＣＤ.<p>
	 *
	 */
	public String rsrc_cd() {
		return getConstString(offset + 2, $rsrc_cd);
	}

	/**
	 * Resource cd. 資源ＣＤ.<p>
	 *
	 */
	public void rsrc_cd(String value) {
		setConstString(offset + 2, $rsrc_cd, value);
	}


	/**
	 * Resource name 資源名.<p>
	 *
	 */
	public String rsrc_nm() {
		return getConstString(offset + 3, $rsrc_nm);
	}

	/**
	 * Resource name 資源名.<p>
	 *
	 */
	public void rsrc_nm(String value) {
		setConstString(offset + 3, $rsrc_nm, value);
	}


	/**
	 * Resource unit name 資源単位名.<p>
	 *
	 */
	public String rsrc_unit_nm() {
		return getConstString(offset + 4, $rsrc_unit_nm);
	}

	/**
	 * Resource unit name 資源単位名.<p>
	 *
	 */
	public void rsrc_unit_nm(String value) {
		setConstString(offset + 4, $rsrc_unit_nm, value);
	}


	/**
	 * Resource number of decimal places name 資源小数部有効桁数名.<p>
	 *
	 */
	public MCNumber rsrc_dec_place() {
		return getConstNumber(offset + 5, $rsrc_dec_place);
	}

	/**
	 * Resource number of decimal places name 資源小数部有効桁数名.<p>
	 *
	 */
	public void rsrc_dec_place(MCNumber value) {
		setConstNumber(offset + 5, $rsrc_dec_place, value);
	}

	/**
	 * Resource number of decimal places name 資源小数部有効桁数名.<p>
	 *
	 */
	public void rsrc_dec_place(int value) {
		setConstNumber(offset + 5, $rsrc_dec_place, value);
	}

	/**
	 * Resource number of decimal places name 資源小数部有効桁数名.<p>
	 *
	 */
	public void rsrc_dec_place(long value) {
		setConstNumber(offset + 5, $rsrc_dec_place, value);
	}

	/**
	 * Resource number of decimal places name 資源小数部有効桁数名.<p>
	 *
	 */
	public void rsrc_dec_place(float value) {
		setConstNumber(offset + 5, $rsrc_dec_place, value);
	}

	/**
	 * Resource number of decimal places name 資源小数部有効桁数名.<p>
	 *
	 */
	public void rsrc_dec_place(double value) {
		setConstNumber(offset + 5, $rsrc_dec_place, value);
	}


	/**
	 * Start date 開始年月日.<p>
	 *
	 */
	public MCDate dt_fr() {
		return getConstDate(offset + 6, $dt_fr);
	}

	/**
	 * Start date 開始年月日.<p>
	 *
	 */
	public void dt_fr(MCDate value) {
		setConstDate(offset + 6, $dt_fr, value);
	}


	/**
	 * End date 終了年月日.<p>
	 *
	 */
	public MCDate dt_to() {
		return getConstDate(offset + 7, $dt_to);
	}

	/**
	 * End date 終了年月日.<p>
	 *
	 */
	public void dt_to(MCDate value) {
		setConstDate(offset + 7, $dt_to, value);
	}


	/**
	 * Number of operating days 稼働日数.<p>
	 *
	 */
	public MCNumber on_num() {
		return getConstNumber(offset + 8, $on_num);
	}

	/**
	 * Number of operating days 稼働日数.<p>
	 *
	 */
	public void on_num(MCNumber value) {
		setConstNumber(offset + 8, $on_num, value);
	}

	/**
	 * Number of operating days 稼働日数.<p>
	 *
	 */
	public void on_num(int value) {
		setConstNumber(offset + 8, $on_num, value);
	}

	/**
	 * Number of operating days 稼働日数.<p>
	 *
	 */
	public void on_num(long value) {
		setConstNumber(offset + 8, $on_num, value);
	}

	/**
	 * Number of operating days 稼働日数.<p>
	 *
	 */
	public void on_num(float value) {
		setConstNumber(offset + 8, $on_num, value);
	}

	/**
	 * Number of operating days 稼働日数.<p>
	 *
	 */
	public void on_num(double value) {
		setConstNumber(offset + 8, $on_num, value);
	}


	/**
	 * Actual value 実際値.<p>
	 *
	 */
	public MCNumber act_qty() {
		return getConstNumber(offset + 9, $act_qty);
	}

	/**
	 * Actual value 実際値.<p>
	 *
	 */
	public void act_qty(MCNumber value) {
		setConstNumber(offset + 9, $act_qty, value);
	}

	/**
	 * Actual value 実際値.<p>
	 *
	 */
	public void act_qty(int value) {
		setConstNumber(offset + 9, $act_qty, value);
	}

	/**
	 * Actual value 実際値.<p>
	 *
	 */
	public void act_qty(long value) {
		setConstNumber(offset + 9, $act_qty, value);
	}

	/**
	 * Actual value 実際値.<p>
	 *
	 */
	public void act_qty(float value) {
		setConstNumber(offset + 9, $act_qty, value);
	}

	/**
	 * Actual value 実際値.<p>
	 *
	 */
	public void act_qty(double value) {
		setConstNumber(offset + 9, $act_qty, value);
	}


	/**
	 * Base value 基準値.<p>
	 *
	 */
	public MCNumber base_qty() {
		return getConstNumber(offset + 10, $base_qty);
	}

	/**
	 * Base value 基準値.<p>
	 *
	 */
	public void base_qty(MCNumber value) {
		setConstNumber(offset + 10, $base_qty, value);
	}

	/**
	 * Base value 基準値.<p>
	 *
	 */
	public void base_qty(int value) {
		setConstNumber(offset + 10, $base_qty, value);
	}

	/**
	 * Base value 基準値.<p>
	 *
	 */
	public void base_qty(long value) {
		setConstNumber(offset + 10, $base_qty, value);
	}

	/**
	 * Base value 基準値.<p>
	 *
	 */
	public void base_qty(float value) {
		setConstNumber(offset + 10, $base_qty, value);
	}

	/**
	 * Base value 基準値.<p>
	 *
	 */
	public void base_qty(double value) {
		setConstNumber(offset + 10, $base_qty, value);
	}


	/**
	 * Alert threshold アラート閾値.<p>
	 *
	 */
	public MCNumber alert_qty() {
		return getConstNumber(offset + 11, $alert_qty);
	}

	/**
	 * Alert threshold アラート閾値.<p>
	 *
	 */
	public void alert_qty(MCNumber value) {
		setConstNumber(offset + 11, $alert_qty, value);
	}

	/**
	 * Alert threshold アラート閾値.<p>
	 *
	 */
	public void alert_qty(int value) {
		setConstNumber(offset + 11, $alert_qty, value);
	}

	/**
	 * Alert threshold アラート閾値.<p>
	 *
	 */
	public void alert_qty(long value) {
		setConstNumber(offset + 11, $alert_qty, value);
	}

	/**
	 * Alert threshold アラート閾値.<p>
	 *
	 */
	public void alert_qty(float value) {
		setConstNumber(offset + 11, $alert_qty, value);
	}

	/**
	 * Alert threshold アラート閾値.<p>
	 *
	 */
	public void alert_qty(double value) {
		setConstNumber(offset + 11, $alert_qty, value);
	}


	/**
	 * Load ratio 負荷率.<p>
	 *
	 */
	public MCNumber ld_rate() {
		return getConstNumber(offset + 12, $ld_rate);
	}

	/**
	 * Load ratio 負荷率.<p>
	 *
	 */
	public void ld_rate(MCNumber value) {
		setConstNumber(offset + 12, $ld_rate, value);
	}

	/**
	 * Load ratio 負荷率.<p>
	 *
	 */
	public void ld_rate(int value) {
		setConstNumber(offset + 12, $ld_rate, value);
	}

	/**
	 * Load ratio 負荷率.<p>
	 *
	 */
	public void ld_rate(long value) {
		setConstNumber(offset + 12, $ld_rate, value);
	}

	/**
	 * Load ratio 負荷率.<p>
	 *
	 */
	public void ld_rate(float value) {
		setConstNumber(offset + 12, $ld_rate, value);
	}

	/**
	 * Load ratio 負荷率.<p>
	 *
	 */
	public void ld_rate(double value) {
		setConstNumber(offset + 12, $ld_rate, value);
	}


	public String getString(String name) {
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
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
		if ($rsrc_dec_place.equalsIgnoreCase(name)) {
			return rsrc_dec_place();
		}
		if ($on_num.equalsIgnoreCase(name)) {
			return on_num();
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
		if ($ld_rate.equalsIgnoreCase(name)) {
			return ld_rate();
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
		if ($rsrc_dec_place.equalsIgnoreCase(name)) {
			return rsrc_dec_place();
		}
		if ($on_num.equalsIgnoreCase(name)) {
			return on_num();
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
		if ($ld_rate.equalsIgnoreCase(name)) {
			return ld_rate();
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
		if ($rsrc_dec_place.equalsIgnoreCase(name)) {
			rsrc_dec_place(value);
			return;
		}
		if ($on_num.equalsIgnoreCase(name)) {
			on_num(value);
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
		if ($ld_rate.equalsIgnoreCase(name)) {
			ld_rate(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($rsrc_dec_place.equalsIgnoreCase(name)) {
			rsrc_dec_place(value);
			return;
		}
		if ($on_num.equalsIgnoreCase(name)) {
			on_num(value);
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
		if ($ld_rate.equalsIgnoreCase(name)) {
			ld_rate(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($rsrc_dec_place.equalsIgnoreCase(name)) {
			rsrc_dec_place(value);
			return;
		}
		if ($on_num.equalsIgnoreCase(name)) {
			on_num(value);
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
		if ($ld_rate.equalsIgnoreCase(name)) {
			ld_rate(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($rsrc_dec_place.equalsIgnoreCase(name)) {
			rsrc_dec_place(value);
			return;
		}
		if ($on_num.equalsIgnoreCase(name)) {
			on_num(value);
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
		if ($ld_rate.equalsIgnoreCase(name)) {
			ld_rate(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($rsrc_dec_place.equalsIgnoreCase(name)) {
			rsrc_dec_place(value);
			return;
		}
		if ($on_num.equalsIgnoreCase(name)) {
			on_num(value);
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
		if ($ld_rate.equalsIgnoreCase(name)) {
			ld_rate(value);
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
		if ($rsrc_dec_place.equalsIgnoreCase(name)) {
			rsrc_dec_place(value);
			return;
		}
		if ($on_num.equalsIgnoreCase(name)) {
			on_num(value);
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
		if ($ld_rate.equalsIgnoreCase(name)) {
			ld_rate(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($rsrc_dec_place.equalsIgnoreCase(name)) {
			rsrc_dec_place(value);
			return;
		}
		if ($on_num.equalsIgnoreCase(name)) {
			on_num(value);
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
		if ($ld_rate.equalsIgnoreCase(name)) {
			ld_rate(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($rsrc_dec_place.equalsIgnoreCase(name)) {
			rsrc_dec_place(value);
			return;
		}
		if ($on_num.equalsIgnoreCase(name)) {
			on_num(value);
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
		if ($ld_rate.equalsIgnoreCase(name)) {
			ld_rate(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($rsrc_dec_place.equalsIgnoreCase(name)) {
			rsrc_dec_place(value);
			return;
		}
		if ($on_num.equalsIgnoreCase(name)) {
			on_num(value);
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
		if ($ld_rate.equalsIgnoreCase(name)) {
			ld_rate(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($rsrc_dec_place.equalsIgnoreCase(name)) {
			rsrc_dec_place(value);
			return;
		}
		if ($on_num.equalsIgnoreCase(name)) {
			on_num(value);
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
		if ($ld_rate.equalsIgnoreCase(name)) {
			ld_rate(value);
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

