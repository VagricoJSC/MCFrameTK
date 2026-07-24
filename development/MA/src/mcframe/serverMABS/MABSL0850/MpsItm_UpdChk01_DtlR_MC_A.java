package mcframe.serverMABS.MABSL0850;

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
 * ブロック"MpsItm_UpdChk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MpsItm_UpdChk01_DtlR_MC_A extends mcframe.serverMA.dbc.MAM_MPS_ITM__R {

	/**
	 * Storage location WG cd. 格納場所ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $strg_wg_cd = "strg_wg_cd";
	/**
	 * Requested location WG cd. 依頼先場所ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $rqst_wg_cd = "rqst_wg_cd";


	public static final MCMeta strg_wg_cd_META = createCommonMeta($strg_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta rqst_wg_cd_META = createCommonMeta($rqst_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);

	protected static final ConstMetaList<MpsItm_UpdChk01_DtlR> constMetas = new ConstMetaList<MpsItm_UpdChk01_DtlR>(
		mcframe.serverMA.dbc.MAM_MPS_ITM__R.constMetas,
		new MCMeta[]{
			strg_wg_cd_META,
			rqst_wg_cd_META,
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
	/** 項目属性情報のグループ[LIST_LOGIC]のキー定数 */
	public static final String $$LIST_LOGIC = "LIST_LOGIC";
	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";
	/** 項目属性情報のグループ[ONLY_ONE_INPUT]のキー定数 */
	public static final String $$ONLY_ONE_INPUT = "ONLY_ONE_INPUT";
	/** 項目属性情報のグループ[CHK_NUM]のキー定数 */
	public static final String $$CHK_NUM = "CHK_NUM";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[LIST_OUT]のキー定数 */
	public static final String $$LIST_OUT = "LIST_OUT";
	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[TOO_MANY_INPUTS]のキー定数 */
	public static final String $$TOO_MANY_INPUTS = "TOO_MANY_INPUTS";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$itm_cd, "E"},	// itm_cd
				{$mps_grp_cd, "E"},	// mps_grp_cd
				{$strg_loc_cd, "E"},	// strg_loc_cd
				{$prod_rate, "E"},	// prod_rate
				{$prod_begin_day, "E"}	// prod_begin_day
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$wg_cd, "MA.MAUAL0010.LgOrMfgWg"},	// wg_cd
				{$itm_sub3, "MA.MAUAL0010.ItmSub3"},	// itm_sub3
				{$strg_loc_cd, "MA.MAUAL0010.Loc"},	// strg_loc_cd
				{$mfg_loc_cd, "MA.MAUAL0010.Loc"},	// mfg_loc_cd
				{$sppl_cd, "MA.MAUAL0010.Bp"},	// sppl_cd
				{$maker_cd, "MA.MAUAL0010.Bp"},	// maker_cd
				{$rqst_loc_cd, "MA.MAUAL0010.Loc"}	// rqst_loc_cd
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
				{$wg_cd, "E"},	// wg_cd
				{$itm_sub1, "E"},	// itm_sub1
				{$itm_sub2, "E"},	// itm_sub2
				{$itm_sub3, "E"},	// itm_sub3
				{$mfg_loc_cd, "E"},	// mfg_loc_cd
				{$sppl_cd, "E"},	// sppl_cd
				{$maker_cd, "E"},	// maker_cd
				{$rqst_loc_cd, "E"}	// rqst_loc_cd
			}
		)),
		new MCExtMap.Entry($$ONLY_ONE_INPUT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
				{$prod_rate, "positive"}	// prod_rate
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$wg_cd, "true"},	// wg_cd
				{$itm_sub3, "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;itm_sub1;itm_sub2;true;true"},	// itm_sub3
				{$strg_loc_cd, "MAC_LOC_IS_SRCH_TYP.COMM"},	// strg_loc_cd
				{$mfg_loc_cd, "MAC_LOC_IS_SRCH_TYP.MFG_WG_ALL;strg_wg_cd;true"},	// mfg_loc_cd
				{$sppl_cd, "MAC_BP_IS_SRCH_TYP.SPPL;true"},	// sppl_cd
				{$maker_cd, "MAC_BP_IS_SRCH_TYP.MAKER;true"},	// maker_cd
				{$rqst_loc_cd, "MAC_LOC_IS_SRCH_TYP.HOUSE;true"}	// rqst_loc_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$wg_cd, "mode_nullval_flg"},	// wg_cd
				{$itm_sub3, "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2;release_flg_on;release_flg_off"},	// itm_sub3
				{$strg_loc_cd, "loc_is_srch_typ"},	// strg_loc_cd
				{$mfg_loc_cd, "loc_is_srch_typ;wg_cd;mode_nullval_flg"},	// mfg_loc_cd
				{$sppl_cd, "bp_is_srch_typ;mode_nullval_flg"},	// sppl_cd
				{$maker_cd, "bp_is_srch_typ;mode_nullval_flg"},	// maker_cd
				{$rqst_loc_cd, "loc_is_srch_typ;mode_nullval_flg"}	// rqst_loc_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$strg_loc_cd, "strg_wg_cd"},	// strg_loc_cd
				{$rqst_loc_cd, "rqst_wg_cd"}	// rqst_loc_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$strg_loc_cd, "wg_cd"},	// strg_loc_cd
				{$rqst_loc_cd, "wg_cd"}	// rqst_loc_cd
			}
		)),
		new MCExtMap.Entry($$TOO_MANY_INPUTS, new MCExtList(
			new String[][]{
				{$mfg_loc_cd, "E1"},	// mfg_loc_cd
				{$sppl_cd, "E1"},	// sppl_cd
				{$rqst_loc_cd, "E1"}	// rqst_loc_cd
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
	protected MpsItm_UpdChk01_DtlR_MC_A(ConstMetaList<? extends MpsItm_UpdChk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MpsItm_UpdChk01_DtlR clone() {
		return (MpsItm_UpdChk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MpsItm_UpdChk01_DtlR createInstance() {
		return (MpsItm_UpdChk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MpsItm_UpdChk01_DtlR getValues(String... names) {
		return (MpsItm_UpdChk01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Storage location WG cd. 格納場所ワーキンググループＣＤ.<p>
	 *
	 */
	public String strg_wg_cd() {
		return getConstString(offset + 0, $strg_wg_cd);
	}

	/**
	 * Storage location WG cd. 格納場所ワーキンググループＣＤ.<p>
	 *
	 */
	public void strg_wg_cd(String value) {
		setConstString(offset + 0, $strg_wg_cd, value);
	}


	/**
	 * Requested location WG cd. 依頼先場所ワーキンググループＣＤ.<p>
	 *
	 */
	public String rqst_wg_cd() {
		return getConstString(offset + 1, $rqst_wg_cd);
	}

	/**
	 * Requested location WG cd. 依頼先場所ワーキンググループＣＤ.<p>
	 *
	 */
	public void rqst_wg_cd(String value) {
		setConstString(offset + 1, $rqst_wg_cd, value);
	}


	public String getString(String name) {
		if ($strg_wg_cd.equalsIgnoreCase(name)) {
			return strg_wg_cd();
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			return rqst_wg_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($strg_wg_cd.equalsIgnoreCase(name)) {
			return strg_wg_cd();
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			return rqst_wg_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($strg_wg_cd.equalsIgnoreCase(name)) {
			strg_wg_cd(value);
			return;
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			rqst_wg_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($strg_wg_cd.equalsIgnoreCase(name)) {
			strg_wg_cd(value);
			return;
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			rqst_wg_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		super.setBooleanNE(name, value);
	}



}

