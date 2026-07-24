package mcframe.serverMABS.MABSL0800;

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
 * ブロック"StkRpl_UpdChk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class StkRpl_UpdChk01_DtlR_MC_A extends mcframe.serverMA.dbc.MAM_STK_RPL_R {

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public static final String $dec_place = "dec_place";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public static final String $loc_grp_cd = "loc_grp_cd";
	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public static final String $alloc_grp_cd = "alloc_grp_cd";
	/**
	 * Application start date_[Before change] 適用開始日_[変更前].<p>
	 *
	 */
	public static final String $st_dt_key = "st_dt_key";
	/**
	 * Input item GI mfg. location group cd. 投入品出庫製造場所グループＣＤ.<p>
	 *
	 */
	public static final String $inpt_gi_loc_grp_cd = "inpt_gi_loc_grp_cd";
	/**
	 * Shipping item GI gross allocation location group cd. 出荷品出庫総量引当場所グループＣＤ.<p>
	 *
	 */
	public static final String $ship_gi_alloc_grp_cd = "ship_gi_alloc_grp_cd";


	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta loc_grp_cd_META = createCommonMeta($loc_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta alloc_grp_cd_META = createCommonMeta($alloc_grp_cd, mcframe.commonMA.meta.MA_META.ALLOC_GRP_CD);
	public static final MCMeta st_dt_key_META = createCommonMeta($st_dt_key, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta inpt_gi_loc_grp_cd_META = createCommonMeta($inpt_gi_loc_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta ship_gi_alloc_grp_cd_META = createCommonMeta($ship_gi_alloc_grp_cd, mcframe.commonMA.meta.MA_META.ALLOC_GRP_CD);

	protected static final ConstMetaList<StkRpl_UpdChk01_DtlR> constMetas = new ConstMetaList<StkRpl_UpdChk01_DtlR>(
		mcframe.serverMA.dbc.MAM_STK_RPL_R.constMetas,
		new MCMeta[]{
			dec_place_META,
			wg_cd_META,
			loc_grp_cd_META,
			alloc_grp_cd_META,
			st_dt_key_META,
			inpt_gi_loc_grp_cd_META,
			ship_gi_alloc_grp_cd_META,
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";
	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";
	/** 項目属性情報のグループ[LIST_LOGIC]のキー定数 */
	public static final String $$LIST_LOGIC = "LIST_LOGIC";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[LIST_OUT]のキー定数 */
	public static final String $$LIST_OUT = "LIST_OUT";
	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[BEFORE_AFTER]のキー定数 */
	public static final String $$BEFORE_AFTER = "BEFORE_AFTER";
	/** 項目属性情報のグループ[SMALL_LARGE]のキー定数 */
	public static final String $$SMALL_LARGE = "SMALL_LARGE";
	/** 項目属性情報のグループ[CHK_NUM]のキー定数 */
	public static final String $$CHK_NUM = "CHK_NUM";
	/** 項目属性情報のグループ[AT_LEAST_ONE]のキー定数 */
	public static final String $$AT_LEAST_ONE = "AT_LEAST_ONE";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$itm_cd, "E"},	// itm_cd
				{$loc_cd, "E"},	// loc_cd
				{$st_dt, "E"},	// st_dt
				{$end_dt, "E"}	// end_dt
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
				{$itm_sub1, "E"},	// itm_sub1
				{$itm_sub2, "E"},	// itm_sub2
				{$itm_sub3, "E"}	// itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$itm_sub3, "MA.MAUAL0010.ItmSub3"},	// itm_sub3
				{$loc_cd, "MA.MAUAL0010.Loc"},	// loc_cd
				{$gi_loc_cd, "MA.MAUAL0010.Loc"},	// gi_loc_cd
				{$gi_str_ln_cd, "MA.MAUAL0010.StrLn"},	// gi_str_ln_cd
				{$inpt_gi_loc_cd, "MA.MAUAL0010.Loc"},	// inpt_gi_loc_cd
				{$inpt_gi_str_ln_cd, "MA.MAUAL0010.StrLn"},	// inpt_gi_str_ln_cd
				{$ship_gi_loc_cd, "MA.MAUAL0010.Loc"},	// ship_gi_loc_cd
				{$ship_gi_str_ln_cd, "MA.MAUAL0010.StrLn"}	// ship_gi_str_ln_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$itm_sub3, "MAC_ITM_IS_SRCH_TYP.STK1_NOT_SUNDRY;itm_cd;itm_sub1;itm_sub2;true;true"},	// itm_sub3
				{$loc_cd, "MAC_LOC_IS_SRCH_TYP.COMM"},	// loc_cd
				{$gi_loc_cd, "MAC_LOC_IS_SRCH_TYP.HOUSE_EQ_WG;wg_cd"},	// gi_loc_cd
				{$gi_str_ln_cd, "gi_loc_cd"},	// gi_str_ln_cd
				{$inpt_gi_loc_cd, "MAC_LOC_IS_SRCH_TYP.HOUSE"},	// inpt_gi_loc_cd
				{$inpt_gi_str_ln_cd, "inpt_gi_loc_cd"},	// inpt_gi_str_ln_cd
				{$ship_gi_loc_cd, "MAC_LOC_IS_SRCH_TYP.HOUSE"},	// ship_gi_loc_cd
				{$ship_gi_str_ln_cd, "ship_gi_loc_cd"}	// ship_gi_str_ln_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$itm_sub3, "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2;release_flg_on;release_flg_off"},	// itm_sub3
				{$loc_cd, "loc_is_srch_typ"},	// loc_cd
				{$gi_loc_cd, "loc_is_srch_typ;wg_cd"},	// gi_loc_cd
				{$gi_str_ln_cd, "loc_cd"},	// gi_str_ln_cd
				{$inpt_gi_loc_cd, "loc_is_srch_typ"},	// inpt_gi_loc_cd
				{$inpt_gi_str_ln_cd, "loc_cd"},	// inpt_gi_str_ln_cd
				{$ship_gi_loc_cd, "loc_is_srch_typ"},	// ship_gi_loc_cd
				{$ship_gi_str_ln_cd, "loc_cd"}	// ship_gi_str_ln_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$itm_sub3, "dec_place"},	// itm_sub3
				{$loc_cd, "wg_cd;loc_grp_cd;alloc_grp_cd"},	// loc_cd
				{$inpt_gi_loc_cd, "inpt_gi_loc_grp_cd"},	// inpt_gi_loc_cd
				{$ship_gi_loc_cd, "ship_gi_alloc_grp_cd"}	// ship_gi_loc_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$itm_sub3, "dec_place"},	// itm_sub3
				{$loc_cd, "wg_cd;loc_grp_cd;alloc_grp_cd"},	// loc_cd
				{$inpt_gi_loc_cd, "loc_grp_cd"},	// inpt_gi_loc_cd
				{$ship_gi_loc_cd, "alloc_grp_cd"}	// ship_gi_loc_cd
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
				{$st_dt, "E1:BF"},	// st_dt
				{$end_dt, "E1:AF"}	// end_dt
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
				{$buf_qty, "0:"},	// buf_qty
				{$rord_stk_qty, "0:"}	// rord_stk_qty
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
				{$rord_rqst_qty, "positive"}	// rord_rqst_qty
			}
		)),
		new MCExtMap.Entry($$AT_LEAST_ONE, new MCExtList(
			new String[][]{
				{$buf_qty, "E1"},	// buf_qty
				{$rord_stk_qty, "E1"},	// rord_stk_qty
				{$inpt_gi_loc_cd, "E1"},	// inpt_gi_loc_cd
				{$ship_gi_loc_cd, "E1"}	// ship_gi_loc_cd
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
	protected StkRpl_UpdChk01_DtlR_MC_A(ConstMetaList<? extends StkRpl_UpdChk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public StkRpl_UpdChk01_DtlR clone() {
		return (StkRpl_UpdChk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public StkRpl_UpdChk01_DtlR createInstance() {
		return (StkRpl_UpdChk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public StkRpl_UpdChk01_DtlR getValues(String... names) {
		return (StkRpl_UpdChk01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 0, $dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 0, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 0, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 0, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 0, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 0, $dec_place, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 1, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 1, $wg_cd, value);
	}


	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public String loc_grp_cd() {
		return getConstString(offset + 2, $loc_grp_cd);
	}

	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public void loc_grp_cd(String value) {
		setConstString(offset + 2, $loc_grp_cd, value);
	}


	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public String alloc_grp_cd() {
		return getConstString(offset + 3, $alloc_grp_cd);
	}

	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public void alloc_grp_cd(String value) {
		setConstString(offset + 3, $alloc_grp_cd, value);
	}


	/**
	 * Application start date_[Before change] 適用開始日_[変更前].<p>
	 *
	 */
	public MCDate st_dt_key() {
		return getConstDate(offset + 4, $st_dt_key);
	}

	/**
	 * Application start date_[Before change] 適用開始日_[変更前].<p>
	 *
	 */
	public void st_dt_key(MCDate value) {
		setConstDate(offset + 4, $st_dt_key, value);
	}


	/**
	 * Input item GI mfg. location group cd. 投入品出庫製造場所グループＣＤ.<p>
	 *
	 */
	public String inpt_gi_loc_grp_cd() {
		return getConstString(offset + 5, $inpt_gi_loc_grp_cd);
	}

	/**
	 * Input item GI mfg. location group cd. 投入品出庫製造場所グループＣＤ.<p>
	 *
	 */
	public void inpt_gi_loc_grp_cd(String value) {
		setConstString(offset + 5, $inpt_gi_loc_grp_cd, value);
	}


	/**
	 * Shipping item GI gross allocation location group cd. 出荷品出庫総量引当場所グループＣＤ.<p>
	 *
	 */
	public String ship_gi_alloc_grp_cd() {
		return getConstString(offset + 6, $ship_gi_alloc_grp_cd);
	}

	/**
	 * Shipping item GI gross allocation location group cd. 出荷品出庫総量引当場所グループＣＤ.<p>
	 *
	 */
	public void ship_gi_alloc_grp_cd(String value) {
		setConstString(offset + 6, $ship_gi_alloc_grp_cd, value);
	}


	public String getString(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			return loc_grp_cd();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		if ($inpt_gi_loc_grp_cd.equalsIgnoreCase(name)) {
			return inpt_gi_loc_grp_cd();
		}
		if ($ship_gi_alloc_grp_cd.equalsIgnoreCase(name)) {
			return ship_gi_alloc_grp_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($st_dt_key.equalsIgnoreCase(name)) {
			return st_dt_key();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			return loc_grp_cd();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		if ($inpt_gi_loc_grp_cd.equalsIgnoreCase(name)) {
			return inpt_gi_loc_grp_cd();
		}
		if ($ship_gi_alloc_grp_cd.equalsIgnoreCase(name)) {
			return ship_gi_alloc_grp_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($st_dt_key.equalsIgnoreCase(name)) {
			return st_dt_key();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			loc_grp_cd(value);
			return;
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			alloc_grp_cd(value);
			return;
		}
		if ($inpt_gi_loc_grp_cd.equalsIgnoreCase(name)) {
			inpt_gi_loc_grp_cd(value);
			return;
		}
		if ($ship_gi_alloc_grp_cd.equalsIgnoreCase(name)) {
			ship_gi_alloc_grp_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($st_dt_key.equalsIgnoreCase(name)) {
			st_dt_key(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			loc_grp_cd(value);
			return;
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			alloc_grp_cd(value);
			return;
		}
		if ($inpt_gi_loc_grp_cd.equalsIgnoreCase(name)) {
			inpt_gi_loc_grp_cd(value);
			return;
		}
		if ($ship_gi_alloc_grp_cd.equalsIgnoreCase(name)) {
			ship_gi_alloc_grp_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($st_dt_key.equalsIgnoreCase(name)) {
			st_dt_key(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		super.setBooleanNE(name, value);
	}



}

