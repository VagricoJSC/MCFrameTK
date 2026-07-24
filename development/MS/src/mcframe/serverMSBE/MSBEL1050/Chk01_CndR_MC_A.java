package mcframe.serverMSBE.MSBEL1050;

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
 * ブロック"Chk01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Chk01_CndR_MC_A extends MCConstRow {

	/**
	 * Scheduled movement date 移動予定日.<p>
	 *
	 */
	public static final String $xfr_schd_dt = "xfr_schd_dt";
	/**
	 * Movement order date 移動指図日.<p>
	 *
	 */
	public static final String $xfr_inst_dt = "xfr_inst_dt";
	/**
	 * Actual movement date 移動実績日.<p>
	 *
	 */
	public static final String $xfr_act_dt = "xfr_act_dt";
	/**
	 * Movement recording date 移動計上日.<p>
	 *
	 */
	public static final String $xfr_ac_dt = "xfr_ac_dt";
	/**
	 * Order PIC cd. 指図担当者ＣＤ.<p>
	 *
	 */
	public static final String $inst_usr_cd = "inst_usr_cd";
	/**
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public static final String $inst_dpt_cd = "inst_dpt_cd";
	/**
	 * Implementation PIC cd. 実施担当者ＣＤ.<p>
	 *
	 */
	public static final String $act_usr_cd = "act_usr_cd";
	/**
	 * Implement dept. cd. 実施部門ＣＤ.<p>
	 *
	 */
	public static final String $act_dpt_cd = "act_dpt_cd";
	/**
	 * Picking list immediate issue ピッキングリスト即時発行.<p>
	 *
	 */
	public static final String $immd_pick_prnt_flg = "immd_pick_prnt_flg";
	/**
	 * Order sheet immediate issue 指図書即時発行.<p>
	 *
	 */
	public static final String $immd_inst_prnt_flg = "immd_inst_prnt_flg";
	/**
	 * Delivery note immediate issue 納品書即時発行.<p>
	 *
	 */
	public static final String $immd_dlv_prnt_flg = "immd_dlv_prnt_flg";
	/**
	 * Individual issue (Order sheet) 個別発行（指図書）.<p>
	 *
	 */
	public static final String $indiv_inst_prnt_flg = "indiv_inst_prnt_flg";
	/**
	 * Individual issue (Delivery note) 個別発行（納品書）.<p>
	 *
	 */
	public static final String $indiv_prnt_flg = "indiv_prnt_flg";
	/**
	 * GI location aggregation 出庫場所まとめ.<p>
	 *
	 */
	public static final String $agg_gi_loc_flg = "agg_gi_loc_flg";


	public static final MCMeta xfr_schd_dt_META = createCommonMeta($xfr_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta xfr_inst_dt_META = createCommonMeta($xfr_inst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta xfr_act_dt_META = createCommonMeta($xfr_act_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta xfr_ac_dt_META = createCommonMeta($xfr_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta inst_usr_cd_META = createCommonMeta($inst_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta inst_dpt_cd_META = createCommonMeta($inst_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta act_usr_cd_META = createCommonMeta($act_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta act_dpt_cd_META = createCommonMeta($act_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta immd_pick_prnt_flg_META = createCommonMeta($immd_pick_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta immd_inst_prnt_flg_META = createCommonMeta($immd_inst_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta immd_dlv_prnt_flg_META = createCommonMeta($immd_dlv_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta indiv_inst_prnt_flg_META = createCommonMeta($indiv_inst_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta indiv_prnt_flg_META = createCommonMeta($indiv_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta agg_gi_loc_flg_META = createCommonMeta($agg_gi_loc_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Chk01_CndR> constMetas = new ConstMetaList<Chk01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			xfr_schd_dt_META,
			xfr_inst_dt_META,
			xfr_act_dt_META,
			xfr_ac_dt_META,
			inst_usr_cd_META,
			inst_dpt_cd_META,
			act_usr_cd_META,
			act_dpt_cd_META,
			immd_pick_prnt_flg_META,
			immd_inst_prnt_flg_META,
			immd_dlv_prnt_flg_META,
			indiv_inst_prnt_flg_META,
			indiv_prnt_flg_META,
			agg_gi_loc_flg_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[REQ_UPD_CNT_CHK]のキー定数 */
	public static final String $$REQ_UPD_CNT_CHK = "REQ_UPD_CNT_CHK";
	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";
	/** 項目属性情報のグループ[CHK_NUM]のキー定数 */
	public static final String $$CHK_NUM = "CHK_NUM";
	/** 項目属性情報のグループ[SMALL_LARGE]のキー定数 */
	public static final String $$SMALL_LARGE = "SMALL_LARGE";
	/** 項目属性情報のグループ[CHK_DT]のキー定数 */
	public static final String $$CHK_DT = "CHK_DT";
	/** 項目属性情報のグループ[BEFORE_AFTER]のキー定数 */
	public static final String $$BEFORE_AFTER = "BEFORE_AFTER";
	/** 項目属性情報のグループ[CHK_PTN]のキー定数 */
	public static final String $$CHK_PTN = "CHK_PTN";
	/** 項目属性情報のグループ[DUPLICATE]のキー定数 */
	public static final String $$DUPLICATE = "DUPLICATE";
	/** 項目属性情報のグループ[TOO_MANY_INPUTS]のキー定数 */
	public static final String $$TOO_MANY_INPUTS = "TOO_MANY_INPUTS";
	/** 項目属性情報のグループ[AT_LEAST_ONE]のキー定数 */
	public static final String $$AT_LEAST_ONE = "AT_LEAST_ONE";
	/** 項目属性情報のグループ[ONLY_ONE_INPUT]のキー定数 */
	public static final String $$ONLY_ONE_INPUT = "ONLY_ONE_INPUT";
	/** 項目属性情報のグループ[LIST_LOGIC]のキー定数 */
	public static final String $$LIST_LOGIC = "LIST_LOGIC";
	/** 項目属性情報のグループ[LIST_OUT]のキー定数 */
	public static final String $$LIST_OUT = "LIST_OUT";
	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQ_UPD_CNT_CHK, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$xfr_inst_dt, "E"}	// xfr_inst_dt
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_DT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_PTN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DUPLICATE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$TOO_MANY_INPUTS, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$AT_LEAST_ONE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$ONLY_ONE_INPUT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$inst_usr_cd, "MA.MAUAL0010.Usr"},	// inst_usr_cd
				{$inst_dpt_cd, "MA.MAUAL0010.Dpt"},	// inst_dpt_cd
				{$act_usr_cd, "MA.MAUAL0010.Usr"},	// act_usr_cd
				{$act_dpt_cd, "MA.MAUAL0010.Dpt"}	// act_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$inst_dpt_cd, "xfr_inst_dt;inst_usr_cd;MAC_DPT_IS_SRCH_TYP.SCE"},	// inst_dpt_cd
				{$act_dpt_cd, "xfr_ac_dt;act_usr_cd;MAC_DPT_IS_SRCH_TYP.SCE"}	// act_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$inst_dpt_cd, "dt;usr_cd;dpt_is_srch_typ"},	// inst_dpt_cd
				{$act_dpt_cd, "dt;usr_cd;dpt_is_srch_typ"}	// act_dpt_cd
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
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
	protected Chk01_CndR_MC_A(ConstMetaList<? extends Chk01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_CndR clone() {
		return (Chk01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_CndR createInstance() {
		return (Chk01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_CndR getValues(String... names) {
		return (Chk01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Scheduled movement date 移動予定日.<p>
	 *
	 */
	public MCDate xfr_schd_dt() {
		return getConstDate(offset + 0, $xfr_schd_dt);
	}

	/**
	 * Scheduled movement date 移動予定日.<p>
	 *
	 */
	public void xfr_schd_dt(MCDate value) {
		setConstDate(offset + 0, $xfr_schd_dt, value);
	}


	/**
	 * Movement order date 移動指図日.<p>
	 *
	 */
	public MCDate xfr_inst_dt() {
		return getConstDate(offset + 1, $xfr_inst_dt);
	}

	/**
	 * Movement order date 移動指図日.<p>
	 *
	 */
	public void xfr_inst_dt(MCDate value) {
		setConstDate(offset + 1, $xfr_inst_dt, value);
	}


	/**
	 * Actual movement date 移動実績日.<p>
	 *
	 */
	public MCDate xfr_act_dt() {
		return getConstDate(offset + 2, $xfr_act_dt);
	}

	/**
	 * Actual movement date 移動実績日.<p>
	 *
	 */
	public void xfr_act_dt(MCDate value) {
		setConstDate(offset + 2, $xfr_act_dt, value);
	}


	/**
	 * Movement recording date 移動計上日.<p>
	 *
	 */
	public MCDate xfr_ac_dt() {
		return getConstDate(offset + 3, $xfr_ac_dt);
	}

	/**
	 * Movement recording date 移動計上日.<p>
	 *
	 */
	public void xfr_ac_dt(MCDate value) {
		setConstDate(offset + 3, $xfr_ac_dt, value);
	}


	/**
	 * Order PIC cd. 指図担当者ＣＤ.<p>
	 *
	 */
	public String inst_usr_cd() {
		return getConstString(offset + 4, $inst_usr_cd);
	}

	/**
	 * Order PIC cd. 指図担当者ＣＤ.<p>
	 *
	 */
	public void inst_usr_cd(String value) {
		setConstString(offset + 4, $inst_usr_cd, value);
	}


	/**
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public String inst_dpt_cd() {
		return getConstString(offset + 5, $inst_dpt_cd);
	}

	/**
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public void inst_dpt_cd(String value) {
		setConstString(offset + 5, $inst_dpt_cd, value);
	}


	/**
	 * Implementation PIC cd. 実施担当者ＣＤ.<p>
	 *
	 */
	public String act_usr_cd() {
		return getConstString(offset + 6, $act_usr_cd);
	}

	/**
	 * Implementation PIC cd. 実施担当者ＣＤ.<p>
	 *
	 */
	public void act_usr_cd(String value) {
		setConstString(offset + 6, $act_usr_cd, value);
	}


	/**
	 * Implement dept. cd. 実施部門ＣＤ.<p>
	 *
	 */
	public String act_dpt_cd() {
		return getConstString(offset + 7, $act_dpt_cd);
	}

	/**
	 * Implement dept. cd. 実施部門ＣＤ.<p>
	 *
	 */
	public void act_dpt_cd(String value) {
		setConstString(offset + 7, $act_dpt_cd, value);
	}


	/**
	 * Picking list immediate issue ピッキングリスト即時発行.<p>
	 *
	 */
	public boolean immd_pick_prnt_flg() {
		return getConstBoolean(offset + 8, $immd_pick_prnt_flg);
	}

	/**
	 * Picking list immediate issue ピッキングリスト即時発行.<p>
	 *
	 */
	public void immd_pick_prnt_flg(boolean value) {
		setConstBoolean(offset + 8, $immd_pick_prnt_flg, value);
	}


	/**
	 * Order sheet immediate issue 指図書即時発行.<p>
	 *
	 */
	public boolean immd_inst_prnt_flg() {
		return getConstBoolean(offset + 9, $immd_inst_prnt_flg);
	}

	/**
	 * Order sheet immediate issue 指図書即時発行.<p>
	 *
	 */
	public void immd_inst_prnt_flg(boolean value) {
		setConstBoolean(offset + 9, $immd_inst_prnt_flg, value);
	}


	/**
	 * Delivery note immediate issue 納品書即時発行.<p>
	 *
	 */
	public boolean immd_dlv_prnt_flg() {
		return getConstBoolean(offset + 10, $immd_dlv_prnt_flg);
	}

	/**
	 * Delivery note immediate issue 納品書即時発行.<p>
	 *
	 */
	public void immd_dlv_prnt_flg(boolean value) {
		setConstBoolean(offset + 10, $immd_dlv_prnt_flg, value);
	}


	/**
	 * Individual issue (Order sheet) 個別発行（指図書）.<p>
	 *
	 */
	public boolean indiv_inst_prnt_flg() {
		return getConstBoolean(offset + 11, $indiv_inst_prnt_flg);
	}

	/**
	 * Individual issue (Order sheet) 個別発行（指図書）.<p>
	 *
	 */
	public void indiv_inst_prnt_flg(boolean value) {
		setConstBoolean(offset + 11, $indiv_inst_prnt_flg, value);
	}


	/**
	 * Individual issue (Delivery note) 個別発行（納品書）.<p>
	 *
	 */
	public boolean indiv_prnt_flg() {
		return getConstBoolean(offset + 12, $indiv_prnt_flg);
	}

	/**
	 * Individual issue (Delivery note) 個別発行（納品書）.<p>
	 *
	 */
	public void indiv_prnt_flg(boolean value) {
		setConstBoolean(offset + 12, $indiv_prnt_flg, value);
	}


	/**
	 * GI location aggregation 出庫場所まとめ.<p>
	 *
	 */
	public boolean agg_gi_loc_flg() {
		return getConstBoolean(offset + 13, $agg_gi_loc_flg);
	}

	/**
	 * GI location aggregation 出庫場所まとめ.<p>
	 *
	 */
	public void agg_gi_loc_flg(boolean value) {
		setConstBoolean(offset + 13, $agg_gi_loc_flg, value);
	}


	public String getString(String name) {
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			return inst_usr_cd();
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			return inst_dpt_cd();
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			return act_usr_cd();
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			return act_dpt_cd();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($xfr_schd_dt.equalsIgnoreCase(name)) {
			return xfr_schd_dt();
		}
		if ($xfr_inst_dt.equalsIgnoreCase(name)) {
			return xfr_inst_dt();
		}
		if ($xfr_act_dt.equalsIgnoreCase(name)) {
			return xfr_act_dt();
		}
		if ($xfr_ac_dt.equalsIgnoreCase(name)) {
			return xfr_ac_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($immd_pick_prnt_flg.equalsIgnoreCase(name)) {
			return immd_pick_prnt_flg();
		}
		if ($immd_inst_prnt_flg.equalsIgnoreCase(name)) {
			return immd_inst_prnt_flg();
		}
		if ($immd_dlv_prnt_flg.equalsIgnoreCase(name)) {
			return immd_dlv_prnt_flg();
		}
		if ($indiv_inst_prnt_flg.equalsIgnoreCase(name)) {
			return indiv_inst_prnt_flg();
		}
		if ($indiv_prnt_flg.equalsIgnoreCase(name)) {
			return indiv_prnt_flg();
		}
		if ($agg_gi_loc_flg.equalsIgnoreCase(name)) {
			return agg_gi_loc_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			return inst_usr_cd();
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			return inst_dpt_cd();
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			return act_usr_cd();
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			return act_dpt_cd();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($xfr_schd_dt.equalsIgnoreCase(name)) {
			return xfr_schd_dt();
		}
		if ($xfr_inst_dt.equalsIgnoreCase(name)) {
			return xfr_inst_dt();
		}
		if ($xfr_act_dt.equalsIgnoreCase(name)) {
			return xfr_act_dt();
		}
		if ($xfr_ac_dt.equalsIgnoreCase(name)) {
			return xfr_ac_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($immd_pick_prnt_flg.equalsIgnoreCase(name)) {
			return immd_pick_prnt_flg();
		}
		if ($immd_inst_prnt_flg.equalsIgnoreCase(name)) {
			return immd_inst_prnt_flg();
		}
		if ($immd_dlv_prnt_flg.equalsIgnoreCase(name)) {
			return immd_dlv_prnt_flg();
		}
		if ($indiv_inst_prnt_flg.equalsIgnoreCase(name)) {
			return indiv_inst_prnt_flg();
		}
		if ($indiv_prnt_flg.equalsIgnoreCase(name)) {
			return indiv_prnt_flg();
		}
		if ($agg_gi_loc_flg.equalsIgnoreCase(name)) {
			return agg_gi_loc_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			inst_usr_cd(value);
			return;
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			inst_dpt_cd(value);
			return;
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			act_usr_cd(value);
			return;
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			act_dpt_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($xfr_schd_dt.equalsIgnoreCase(name)) {
			xfr_schd_dt(value);
			return;
		}
		if ($xfr_inst_dt.equalsIgnoreCase(name)) {
			xfr_inst_dt(value);
			return;
		}
		if ($xfr_act_dt.equalsIgnoreCase(name)) {
			xfr_act_dt(value);
			return;
		}
		if ($xfr_ac_dt.equalsIgnoreCase(name)) {
			xfr_ac_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($immd_pick_prnt_flg.equalsIgnoreCase(name)) {
			immd_pick_prnt_flg(value);
			return;
		}
		if ($immd_inst_prnt_flg.equalsIgnoreCase(name)) {
			immd_inst_prnt_flg(value);
			return;
		}
		if ($immd_dlv_prnt_flg.equalsIgnoreCase(name)) {
			immd_dlv_prnt_flg(value);
			return;
		}
		if ($indiv_inst_prnt_flg.equalsIgnoreCase(name)) {
			indiv_inst_prnt_flg(value);
			return;
		}
		if ($indiv_prnt_flg.equalsIgnoreCase(name)) {
			indiv_prnt_flg(value);
			return;
		}
		if ($agg_gi_loc_flg.equalsIgnoreCase(name)) {
			agg_gi_loc_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			inst_usr_cd(value);
			return;
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			inst_dpt_cd(value);
			return;
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			act_usr_cd(value);
			return;
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			act_dpt_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($xfr_schd_dt.equalsIgnoreCase(name)) {
			xfr_schd_dt(value);
			return;
		}
		if ($xfr_inst_dt.equalsIgnoreCase(name)) {
			xfr_inst_dt(value);
			return;
		}
		if ($xfr_act_dt.equalsIgnoreCase(name)) {
			xfr_act_dt(value);
			return;
		}
		if ($xfr_ac_dt.equalsIgnoreCase(name)) {
			xfr_ac_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($immd_pick_prnt_flg.equalsIgnoreCase(name)) {
			immd_pick_prnt_flg(value);
			return;
		}
		if ($immd_inst_prnt_flg.equalsIgnoreCase(name)) {
			immd_inst_prnt_flg(value);
			return;
		}
		if ($immd_dlv_prnt_flg.equalsIgnoreCase(name)) {
			immd_dlv_prnt_flg(value);
			return;
		}
		if ($indiv_inst_prnt_flg.equalsIgnoreCase(name)) {
			indiv_inst_prnt_flg(value);
			return;
		}
		if ($indiv_prnt_flg.equalsIgnoreCase(name)) {
			indiv_prnt_flg(value);
			return;
		}
		if ($agg_gi_loc_flg.equalsIgnoreCase(name)) {
			agg_gi_loc_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

