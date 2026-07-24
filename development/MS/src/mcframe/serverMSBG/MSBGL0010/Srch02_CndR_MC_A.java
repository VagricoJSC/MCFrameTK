package mcframe.serverMSBG.MSBGL0010;

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
 * ブロック"Srch02_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch02_CndR_MC_A extends MCConstRow {

	/**
	 * Billing month 請求年月.<p>
	 *
	 */
	public static final String $bill_ym = "bill_ym";
	/**
	 * Billing closing day 請求締日.<p>
	 *
	 */
	public static final String $bill_cl_day = "bill_cl_day";
	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public static final String $bcst_cd = "bcst_cd";
	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public static final String $bcst_nm = "bcst_nm";
	/**
	 * for EDI ＥＤＩ対象.対象.<p>
	 *
	 */
	public static final String $on_edi_flg = "on_edi_flg";
	/**
	 * Not for EDI ＥＤＩ対象.対象外.<p>
	 *
	 */
	public static final String $off_edi_flg = "off_edi_flg";
	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public static final String $bill_dpt_cd = "bill_dpt_cd";
	/**
	 * Billing dept. name 請求部門名.<p>
	 *
	 */
	public static final String $bill_dpt_nm = "bill_dpt_nm";
	/**
	 * WG cd. ワーキンググーループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * WG name ワーキンググーループ名.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public static final String $trd_cur_nm = "trd_cur_nm";
	/**
	 * Invoice No. 請求書ＮＯ.<p>
	 *
	 */
	public static final String $bill_no = "bill_no";
	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public static final String $wrk_no = "wrk_no";
	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public static final String $wrk_nm = "wrk_nm";
	/**
	 * Manual closing day マニュアル締日.<p>
	 *
	 */
	public static final String $manual_flg = "manual_flg";
	/**
	 * Select manual マニュアル選択.<p>
	 *
	 */
	public static final String $sel_flg = "sel_flg";
	/**
	 * Each time sales 売上都度.<p>
	 *
	 */
	public static final String $each_sls_flg = "each_sls_flg";
	/**
	 * Batch closing day バッチ締日.<p>
	 *
	 */
	public static final String $batch_flg = "batch_flg";
	/**
	 * Display latest only 最新のみ表示.<p>
	 *
	 */
	public static final String $new_flg = "new_flg";
	/**
	 * Operation date 運用日付.<p>
	 *
	 */
	public static final String $today = "today";


	public static final MCMeta bill_ym_META = createCommonMeta($bill_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta bill_cl_day_META = createCommonMeta($bill_cl_day, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta bcst_cd_META = createCommonMeta($bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bcst_nm_META = createCommonMeta($bcst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta on_edi_flg_META = createCommonMeta($on_edi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta off_edi_flg_META = createCommonMeta($off_edi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_dpt_cd_META = createCommonMeta($bill_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bill_dpt_nm_META = createCommonMeta($bill_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta bill_no_META = createCommonMeta($bill_no, mcframe.commonMA.meta.MA_META.BILL_NO);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta manual_flg_META = createCommonMeta($manual_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sel_flg_META = createCommonMeta($sel_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta each_sls_flg_META = createCommonMeta($each_sls_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta batch_flg_META = createCommonMeta($batch_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta new_flg_META = createCommonMeta($new_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta today_META = createCommonMeta($today, mcframe.commonMA.meta.MA_META.DT);

	protected static final ConstMetaList<Srch02_CndR> constMetas = new ConstMetaList<Srch02_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			bill_ym_META,
			bill_cl_day_META,
			bcst_cd_META,
			bcst_nm_META,
			on_edi_flg_META,
			off_edi_flg_META,
			bill_dpt_cd_META,
			bill_dpt_nm_META,
			wg_cd_META,
			wg_nm_META,
			trd_cur_cd_META,
			trd_cur_nm_META,
			bill_no_META,
			wrk_no_META,
			wrk_nm_META,
			manual_flg_META,
			sel_flg_META,
			each_sls_flg_META,
			batch_flg_META,
			new_flg_META,
			today_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
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
	protected Srch02_CndR_MC_A(ConstMetaList<? extends Srch02_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch02_CndR clone() {
		return (Srch02_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch02_CndR createInstance() {
		return (Srch02_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch02_CndR getValues(String... names) {
		return (Srch02_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Billing month 請求年月.<p>
	 *
	 */
	public MCDate bill_ym() {
		return getConstDate(offset + 0, $bill_ym);
	}

	/**
	 * Billing month 請求年月.<p>
	 *
	 */
	public void bill_ym(MCDate value) {
		setConstDate(offset + 0, $bill_ym, value);
	}


	/**
	 * Billing closing day 請求締日.<p>
	 *
	 */
	public MCNumber bill_cl_day() {
		return getConstNumber(offset + 1, $bill_cl_day);
	}

	/**
	 * Billing closing day 請求締日.<p>
	 *
	 */
	public void bill_cl_day(MCNumber value) {
		setConstNumber(offset + 1, $bill_cl_day, value);
	}

	/**
	 * Billing closing day 請求締日.<p>
	 *
	 */
	public void bill_cl_day(int value) {
		setConstNumber(offset + 1, $bill_cl_day, value);
	}

	/**
	 * Billing closing day 請求締日.<p>
	 *
	 */
	public void bill_cl_day(long value) {
		setConstNumber(offset + 1, $bill_cl_day, value);
	}

	/**
	 * Billing closing day 請求締日.<p>
	 *
	 */
	public void bill_cl_day(float value) {
		setConstNumber(offset + 1, $bill_cl_day, value);
	}

	/**
	 * Billing closing day 請求締日.<p>
	 *
	 */
	public void bill_cl_day(double value) {
		setConstNumber(offset + 1, $bill_cl_day, value);
	}


	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public String bcst_cd() {
		return getConstString(offset + 2, $bcst_cd);
	}

	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public void bcst_cd(String value) {
		setConstString(offset + 2, $bcst_cd, value);
	}


	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public String bcst_nm() {
		return getConstString(offset + 3, $bcst_nm);
	}

	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public void bcst_nm(String value) {
		setConstString(offset + 3, $bcst_nm, value);
	}


	/**
	 * for EDI ＥＤＩ対象.対象.<p>
	 *
	 */
	public boolean on_edi_flg() {
		return getConstBoolean(offset + 4, $on_edi_flg);
	}

	/**
	 * for EDI ＥＤＩ対象.対象.<p>
	 *
	 */
	public void on_edi_flg(boolean value) {
		setConstBoolean(offset + 4, $on_edi_flg, value);
	}


	/**
	 * Not for EDI ＥＤＩ対象.対象外.<p>
	 *
	 */
	public boolean off_edi_flg() {
		return getConstBoolean(offset + 5, $off_edi_flg);
	}

	/**
	 * Not for EDI ＥＤＩ対象.対象外.<p>
	 *
	 */
	public void off_edi_flg(boolean value) {
		setConstBoolean(offset + 5, $off_edi_flg, value);
	}


	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public String bill_dpt_cd() {
		return getConstString(offset + 6, $bill_dpt_cd);
	}

	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public void bill_dpt_cd(String value) {
		setConstString(offset + 6, $bill_dpt_cd, value);
	}


	/**
	 * Billing dept. name 請求部門名.<p>
	 *
	 */
	public String bill_dpt_nm() {
		return getConstString(offset + 7, $bill_dpt_nm);
	}

	/**
	 * Billing dept. name 請求部門名.<p>
	 *
	 */
	public void bill_dpt_nm(String value) {
		setConstString(offset + 7, $bill_dpt_nm, value);
	}


	/**
	 * WG cd. ワーキンググーループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 8, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググーループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 8, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググーループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 9, $wg_nm);
	}

	/**
	 * WG name ワーキンググーループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 9, $wg_nm, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 10, $trd_cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 10, $trd_cur_cd, value);
	}


	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 11, $trd_cur_nm);
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 11, $trd_cur_nm, value);
	}


	/**
	 * Invoice No. 請求書ＮＯ.<p>
	 *
	 */
	public String bill_no() {
		return getConstString(offset + 12, $bill_no);
	}

	/**
	 * Invoice No. 請求書ＮＯ.<p>
	 *
	 */
	public void bill_no(String value) {
		setConstString(offset + 12, $bill_no, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 13, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 13, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 14, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 14, $wrk_nm, value);
	}


	/**
	 * Manual closing day マニュアル締日.<p>
	 *
	 */
	public boolean manual_flg() {
		return getConstBoolean(offset + 15, $manual_flg);
	}

	/**
	 * Manual closing day マニュアル締日.<p>
	 *
	 */
	public void manual_flg(boolean value) {
		setConstBoolean(offset + 15, $manual_flg, value);
	}


	/**
	 * Select manual マニュアル選択.<p>
	 *
	 */
	public boolean sel_flg() {
		return getConstBoolean(offset + 16, $sel_flg);
	}

	/**
	 * Select manual マニュアル選択.<p>
	 *
	 */
	public void sel_flg(boolean value) {
		setConstBoolean(offset + 16, $sel_flg, value);
	}


	/**
	 * Each time sales 売上都度.<p>
	 *
	 */
	public boolean each_sls_flg() {
		return getConstBoolean(offset + 17, $each_sls_flg);
	}

	/**
	 * Each time sales 売上都度.<p>
	 *
	 */
	public void each_sls_flg(boolean value) {
		setConstBoolean(offset + 17, $each_sls_flg, value);
	}


	/**
	 * Batch closing day バッチ締日.<p>
	 *
	 */
	public boolean batch_flg() {
		return getConstBoolean(offset + 18, $batch_flg);
	}

	/**
	 * Batch closing day バッチ締日.<p>
	 *
	 */
	public void batch_flg(boolean value) {
		setConstBoolean(offset + 18, $batch_flg, value);
	}


	/**
	 * Display latest only 最新のみ表示.<p>
	 *
	 */
	public boolean new_flg() {
		return getConstBoolean(offset + 19, $new_flg);
	}

	/**
	 * Display latest only 最新のみ表示.<p>
	 *
	 */
	public void new_flg(boolean value) {
		setConstBoolean(offset + 19, $new_flg, value);
	}


	/**
	 * Operation date 運用日付.<p>
	 *
	 */
	public MCDate today() {
		return getConstDate(offset + 20, $today);
	}

	/**
	 * Operation date 運用日付.<p>
	 *
	 */
	public void today(MCDate value) {
		setConstDate(offset + 20, $today, value);
	}


	public String getString(String name) {
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			return bcst_nm();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($bill_dpt_nm.equalsIgnoreCase(name)) {
			return bill_dpt_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($bill_no.equalsIgnoreCase(name)) {
			return bill_no();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			return bill_cl_day();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($bill_ym.equalsIgnoreCase(name)) {
			return bill_ym();
		}
		if ($today.equalsIgnoreCase(name)) {
			return today();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($on_edi_flg.equalsIgnoreCase(name)) {
			return on_edi_flg();
		}
		if ($off_edi_flg.equalsIgnoreCase(name)) {
			return off_edi_flg();
		}
		if ($manual_flg.equalsIgnoreCase(name)) {
			return manual_flg();
		}
		if ($sel_flg.equalsIgnoreCase(name)) {
			return sel_flg();
		}
		if ($each_sls_flg.equalsIgnoreCase(name)) {
			return each_sls_flg();
		}
		if ($batch_flg.equalsIgnoreCase(name)) {
			return batch_flg();
		}
		if ($new_flg.equalsIgnoreCase(name)) {
			return new_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			return bcst_nm();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($bill_dpt_nm.equalsIgnoreCase(name)) {
			return bill_dpt_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($bill_no.equalsIgnoreCase(name)) {
			return bill_no();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			return bill_cl_day();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($bill_ym.equalsIgnoreCase(name)) {
			return bill_ym();
		}
		if ($today.equalsIgnoreCase(name)) {
			return today();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($on_edi_flg.equalsIgnoreCase(name)) {
			return on_edi_flg();
		}
		if ($off_edi_flg.equalsIgnoreCase(name)) {
			return off_edi_flg();
		}
		if ($manual_flg.equalsIgnoreCase(name)) {
			return manual_flg();
		}
		if ($sel_flg.equalsIgnoreCase(name)) {
			return sel_flg();
		}
		if ($each_sls_flg.equalsIgnoreCase(name)) {
			return each_sls_flg();
		}
		if ($batch_flg.equalsIgnoreCase(name)) {
			return batch_flg();
		}
		if ($new_flg.equalsIgnoreCase(name)) {
			return new_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			bcst_nm(value);
			return;
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		if ($bill_dpt_nm.equalsIgnoreCase(name)) {
			bill_dpt_nm(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		if ($bill_no.equalsIgnoreCase(name)) {
			bill_no(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($bill_ym.equalsIgnoreCase(name)) {
			bill_ym(value);
			return;
		}
		if ($today.equalsIgnoreCase(name)) {
			today(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($on_edi_flg.equalsIgnoreCase(name)) {
			on_edi_flg(value);
			return;
		}
		if ($off_edi_flg.equalsIgnoreCase(name)) {
			off_edi_flg(value);
			return;
		}
		if ($manual_flg.equalsIgnoreCase(name)) {
			manual_flg(value);
			return;
		}
		if ($sel_flg.equalsIgnoreCase(name)) {
			sel_flg(value);
			return;
		}
		if ($each_sls_flg.equalsIgnoreCase(name)) {
			each_sls_flg(value);
			return;
		}
		if ($batch_flg.equalsIgnoreCase(name)) {
			batch_flg(value);
			return;
		}
		if ($new_flg.equalsIgnoreCase(name)) {
			new_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			bcst_nm(value);
			return;
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		if ($bill_dpt_nm.equalsIgnoreCase(name)) {
			bill_dpt_nm(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		if ($bill_no.equalsIgnoreCase(name)) {
			bill_no(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($bill_ym.equalsIgnoreCase(name)) {
			bill_ym(value);
			return;
		}
		if ($today.equalsIgnoreCase(name)) {
			today(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($on_edi_flg.equalsIgnoreCase(name)) {
			on_edi_flg(value);
			return;
		}
		if ($off_edi_flg.equalsIgnoreCase(name)) {
			off_edi_flg(value);
			return;
		}
		if ($manual_flg.equalsIgnoreCase(name)) {
			manual_flg(value);
			return;
		}
		if ($sel_flg.equalsIgnoreCase(name)) {
			sel_flg(value);
			return;
		}
		if ($each_sls_flg.equalsIgnoreCase(name)) {
			each_sls_flg(value);
			return;
		}
		if ($batch_flg.equalsIgnoreCase(name)) {
			batch_flg(value);
			return;
		}
		if ($new_flg.equalsIgnoreCase(name)) {
			new_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

