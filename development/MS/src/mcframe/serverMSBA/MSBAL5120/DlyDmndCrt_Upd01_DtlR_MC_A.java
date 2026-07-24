package mcframe.serverMSBA.MSBAL5120;

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
 * ブロック"DlyDmndCrt_Upd01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DlyDmndCrt_Upd01_DtlR_MC_A extends MCConstRow {

	/**
	 * Period start date 期間開始日.<p>
	 *
	 */
	public static final String $st_dt = "st_dt";
	/**
	 * Period end date 期間終了日.<p>
	 *
	 */
	public static final String $end_dt = "end_dt";
	/**
	 * Entry 登録.<p>
	 *
	 */
	public static final String $reg_flg = "reg_flg";
	/**
	 * Disaggregation by day 日ばらし.<p>
	 *
	 */
	public static final String $date_div_flg = "date_div_flg";
	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public static final String $itm_sub1 = "itm_sub1";
	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public static final String $itm_sub2 = "itm_sub2";
	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public static final String $itm_sub3 = "itm_sub3";
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public static final String $dpt_cd = "dpt_cd";
	/**
	 * Screen call 画面呼出.<p>
	 *
	 */
	public static final String $fr_screen_flg = "fr_screen_flg";


	public static final MCMeta st_dt_META = createCommonMeta($st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_dt_META = createCommonMeta($end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta reg_flg_META = createCommonMeta($reg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta date_div_flg_META = createCommonMeta($date_div_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta fr_screen_flg_META = createCommonMeta($fr_screen_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<DlyDmndCrt_Upd01_DtlR> constMetas = new ConstMetaList<DlyDmndCrt_Upd01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			st_dt_META,
			end_dt_META,
			reg_flg_META,
			date_div_flg_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			dpt_cd_META,
			fr_screen_flg_META
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
	protected DlyDmndCrt_Upd01_DtlR_MC_A(ConstMetaList<? extends DlyDmndCrt_Upd01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DlyDmndCrt_Upd01_DtlR clone() {
		return (DlyDmndCrt_Upd01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DlyDmndCrt_Upd01_DtlR createInstance() {
		return (DlyDmndCrt_Upd01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DlyDmndCrt_Upd01_DtlR getValues(String... names) {
		return (DlyDmndCrt_Upd01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Period start date 期間開始日.<p>
	 *
	 */
	public MCDate st_dt() {
		return getConstDate(offset + 0, $st_dt);
	}

	/**
	 * Period start date 期間開始日.<p>
	 *
	 */
	public void st_dt(MCDate value) {
		setConstDate(offset + 0, $st_dt, value);
	}


	/**
	 * Period end date 期間終了日.<p>
	 *
	 */
	public MCDate end_dt() {
		return getConstDate(offset + 1, $end_dt);
	}

	/**
	 * Period end date 期間終了日.<p>
	 *
	 */
	public void end_dt(MCDate value) {
		setConstDate(offset + 1, $end_dt, value);
	}


	/**
	 * Entry 登録.<p>
	 *
	 */
	public boolean reg_flg() {
		return getConstBoolean(offset + 2, $reg_flg);
	}

	/**
	 * Entry 登録.<p>
	 *
	 */
	public void reg_flg(boolean value) {
		setConstBoolean(offset + 2, $reg_flg, value);
	}


	/**
	 * Disaggregation by day 日ばらし.<p>
	 *
	 */
	public boolean date_div_flg() {
		return getConstBoolean(offset + 3, $date_div_flg);
	}

	/**
	 * Disaggregation by day 日ばらし.<p>
	 *
	 */
	public void date_div_flg(boolean value) {
		setConstBoolean(offset + 3, $date_div_flg, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 4, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 4, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 5, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 5, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 6, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 6, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 7, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 7, $itm_sub3, value);
	}


	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 8, $dpt_cd);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 8, $dpt_cd, value);
	}


	/**
	 * Screen call 画面呼出.<p>
	 *
	 */
	public boolean fr_screen_flg() {
		return getConstBoolean(offset + 9, $fr_screen_flg);
	}

	/**
	 * Screen call 画面呼出.<p>
	 *
	 */
	public void fr_screen_flg(boolean value) {
		setConstBoolean(offset + 9, $fr_screen_flg, value);
	}


	public String getString(String name) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
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
		if ($reg_flg.equalsIgnoreCase(name)) {
			return reg_flg();
		}
		if ($date_div_flg.equalsIgnoreCase(name)) {
			return date_div_flg();
		}
		if ($fr_screen_flg.equalsIgnoreCase(name)) {
			return fr_screen_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
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
		if ($reg_flg.equalsIgnoreCase(name)) {
			return reg_flg();
		}
		if ($date_div_flg.equalsIgnoreCase(name)) {
			return date_div_flg();
		}
		if ($fr_screen_flg.equalsIgnoreCase(name)) {
			return fr_screen_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
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
		if ($reg_flg.equalsIgnoreCase(name)) {
			reg_flg(value);
			return;
		}
		if ($date_div_flg.equalsIgnoreCase(name)) {
			date_div_flg(value);
			return;
		}
		if ($fr_screen_flg.equalsIgnoreCase(name)) {
			fr_screen_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
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
		if ($reg_flg.equalsIgnoreCase(name)) {
			reg_flg(value);
			return;
		}
		if ($date_div_flg.equalsIgnoreCase(name)) {
			date_div_flg(value);
			return;
		}
		if ($fr_screen_flg.equalsIgnoreCase(name)) {
			fr_screen_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

