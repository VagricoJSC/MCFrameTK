package mcframe.serverMABS.MABSL0090;

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
 * ブロック"ItmOper_UpdChk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ItmOper_UpdChk01_DtlR_MC_A extends mcframe.serverMA.dbc.MAM_ITM_OPER_R {

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public static final String $itm_unit_cd = "itm_unit_cd";
	/**
	 * Item number of decimal places 品目小数部有効桁数.<p>
	 *
	 */
	public static final String $itm_dec_place = "itm_dec_place";
	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public static final String $sno1_mng_typ = "sno1_mng_typ";
	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public static final String $sno2_mng_typ = "sno2_mng_typ";
	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public static final String $sno3_mng_typ = "sno3_mng_typ";
	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public static final String $sno4_mng_typ = "sno4_mng_typ";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * Application start date_[Before change] 適用開始日_[変更前].<p>
	 *
	 */
	public static final String $st_dt_key = "st_dt_key";
	/**
	 * Operation location WG cd. 工程場所ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $oper_loc_wg_cd = "oper_loc_wg_cd";


	public static final MCMeta itm_unit_cd_META = createCommonMeta($itm_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta itm_dec_place_META = createCommonMeta($itm_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta sno1_mng_typ_META = createCommonMeta($sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno2_mng_typ_META = createCommonMeta($sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno3_mng_typ_META = createCommonMeta($sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno4_mng_typ_META = createCommonMeta($sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta st_dt_key_META = createCommonMeta($st_dt_key, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta oper_loc_wg_cd_META = createCommonMeta($oper_loc_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);

	protected static final ConstMetaList<ItmOper_UpdChk01_DtlR> constMetas = new ConstMetaList<ItmOper_UpdChk01_DtlR>(
		mcframe.serverMA.dbc.MAM_ITM_OPER_R.constMetas,
		new MCMeta[]{
			itm_unit_cd_META,
			itm_dec_place_META,
			sno1_mng_typ_META,
			sno2_mng_typ_META,
			sno3_mng_typ_META,
			sno4_mng_typ_META,
			wg_cd_META,
			st_dt_key_META,
			oper_loc_wg_cd_META,
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";
	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";
	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
	/** 項目属性情報のグループ[SMALL_LARGE]のキー定数 */
	public static final String $$SMALL_LARGE = "SMALL_LARGE";
	/** 項目属性情報のグループ[CHK_NUM]のキー定数 */
	public static final String $$CHK_NUM = "CHK_NUM";
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

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
				{$itm_sub1, "E"},	// itm_sub1
				{$itm_sub2, "E"},	// itm_sub2
				{$itm_sub3, "E"},	// itm_sub3
				{$loc_cd, "E"}	// loc_cd
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$itm_cd, "E"},	// itm_cd
				{$itm_sub1, "E"},	// itm_sub1
				{$itm_sub2, "E"},	// itm_sub2
				{$itm_sub3, "E"},	// itm_sub3
				{$loc_cd, "E"},	// loc_cd
				{$oper_ptn, "E"},	// oper_ptn
				{$oper_cd, "E"},	// oper_cd
				{$oper_seq, "E"},	// oper_seq
				{$st_dt, "E"},	// st_dt
				{$end_dt, "E"},	// end_dt
				{$disp_seq, "E"},	// disp_seq
				{$oper_lt, "E"},	// oper_lt
				{$oper_offst_typ, "E"},	// oper_offst_typ
				{$oper_offst, "E"}	// oper_offst
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$oper_offst_typ, "MAC_OFFST_TYP"},	// oper_offst_typ
				{$unit_conv_rnd_typ, "MAC_RND_TYP"}	// unit_conv_rnd_typ
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
				{$oper_seq, "0:"},	// oper_seq
				{$yield_oper_ratio, "0:"},	// yield_oper_ratio
				{$oper_lower_yield, "E1:S"},	// oper_lower_yield
				{$oper_std_yield, "E1:L,E2:S"},	// oper_std_yield
				{$oper_upper_yield, "E2:L"},	// oper_upper_yield
				{$wip_rate, "1:100"}	// wip_rate
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
				{$oper_lt_add_qty, "positive"},	// oper_lt_add_qty
				{$oper_offst_add_qty, "positive"}	// oper_offst_add_qty
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$itm_sub3, "MA.MAUAL0010.ItmSub3"},	// itm_sub3
				{$loc_cd, "MA.MAUAL0010.Loc"},	// loc_cd
				{$oper_cd, "MA.MAUAL0010.Oper"},	// oper_cd
				{$oper_unit_cd, "MA.MAUAL0010.Unit"},	// oper_unit_cd
				{$oper_loc_cd, "MA.MAUAL0010.Loc"}	// oper_loc_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$itm_sub3, "MAC_ITM_IS_SRCH_TYP.ASSET1;itm_cd;itm_sub1;itm_sub2;true;true"},	// itm_sub3
				{$loc_cd, "MAC_LOC_IS_SRCH_TYP.MFG_WG_HOUSE;true"},	// loc_cd
				{$oper_loc_cd, "MAC_LOC_IS_SRCH_TYP.MFG_WG_HOUSE"}	// oper_loc_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$itm_sub3, "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2;release_flg_on;release_flg_off"},	// itm_sub3
				{$loc_cd, "loc_is_srch_typ;mode_nullval_flg"},	// loc_cd
				{$oper_loc_cd, "loc_is_srch_typ"}	// oper_loc_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$itm_sub3, "itm_unit_cd;itm_dec_place;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ"},	// itm_sub3
				{$loc_cd, "wg_cd"},	// loc_cd
				{$oper_loc_cd, "oper_loc_wg_cd"}	// oper_loc_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$itm_sub3, "unit_cd;dec_place;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ"},	// itm_sub3
				{$loc_cd, "wg_cd"},	// loc_cd
				{$oper_loc_cd, "wg_cd"}	// oper_loc_cd
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
				{$st_dt, "E1:BF"},	// st_dt
				{$end_dt, "E1:AF"}	// end_dt
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
	protected ItmOper_UpdChk01_DtlR_MC_A(ConstMetaList<? extends ItmOper_UpdChk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ItmOper_UpdChk01_DtlR clone() {
		return (ItmOper_UpdChk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ItmOper_UpdChk01_DtlR createInstance() {
		return (ItmOper_UpdChk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ItmOper_UpdChk01_DtlR getValues(String... names) {
		return (ItmOper_UpdChk01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String itm_unit_cd() {
		return getConstString(offset + 0, $itm_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void itm_unit_cd(String value) {
		setConstString(offset + 0, $itm_unit_cd, value);
	}


	/**
	 * Item number of decimal places 品目小数部有効桁数.<p>
	 *
	 */
	public MCNumber itm_dec_place() {
		return getConstNumber(offset + 1, $itm_dec_place);
	}

	/**
	 * Item number of decimal places 品目小数部有効桁数.<p>
	 *
	 */
	public void itm_dec_place(MCNumber value) {
		setConstNumber(offset + 1, $itm_dec_place, value);
	}

	/**
	 * Item number of decimal places 品目小数部有効桁数.<p>
	 *
	 */
	public void itm_dec_place(int value) {
		setConstNumber(offset + 1, $itm_dec_place, value);
	}

	/**
	 * Item number of decimal places 品目小数部有効桁数.<p>
	 *
	 */
	public void itm_dec_place(long value) {
		setConstNumber(offset + 1, $itm_dec_place, value);
	}

	/**
	 * Item number of decimal places 品目小数部有効桁数.<p>
	 *
	 */
	public void itm_dec_place(float value) {
		setConstNumber(offset + 1, $itm_dec_place, value);
	}

	/**
	 * Item number of decimal places 品目小数部有効桁数.<p>
	 *
	 */
	public void itm_dec_place(double value) {
		setConstNumber(offset + 1, $itm_dec_place, value);
	}


	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return getConstString(offset + 2, $sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		setConstString(offset + 2, $sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return getConstString(offset + 3, $sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		setConstString(offset + 3, $sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return getConstString(offset + 4, $sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		setConstString(offset + 4, $sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return getConstString(offset + 5, $sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		setConstString(offset + 5, $sno4_mng_typ, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 6, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 6, $wg_cd, value);
	}


	/**
	 * Application start date_[Before change] 適用開始日_[変更前].<p>
	 *
	 */
	public MCDate st_dt_key() {
		return getConstDate(offset + 7, $st_dt_key);
	}

	/**
	 * Application start date_[Before change] 適用開始日_[変更前].<p>
	 *
	 */
	public void st_dt_key(MCDate value) {
		setConstDate(offset + 7, $st_dt_key, value);
	}


	/**
	 * Operation location WG cd. 工程場所ワーキンググループＣＤ.<p>
	 *
	 */
	public String oper_loc_wg_cd() {
		return getConstString(offset + 8, $oper_loc_wg_cd);
	}

	/**
	 * Operation location WG cd. 工程場所ワーキンググループＣＤ.<p>
	 *
	 */
	public void oper_loc_wg_cd(String value) {
		setConstString(offset + 8, $oper_loc_wg_cd, value);
	}


	public String getString(String name) {
		if ($itm_unit_cd.equalsIgnoreCase(name)) {
			return itm_unit_cd();
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			return sno1_mng_typ();
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			return sno2_mng_typ();
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			return sno3_mng_typ();
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			return sno4_mng_typ();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($oper_loc_wg_cd.equalsIgnoreCase(name)) {
			return oper_loc_wg_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($itm_dec_place.equalsIgnoreCase(name)) {
			return itm_dec_place();
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
		if ($itm_unit_cd.equalsIgnoreCase(name)) {
			return itm_unit_cd();
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			return sno1_mng_typ();
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			return sno2_mng_typ();
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			return sno3_mng_typ();
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			return sno4_mng_typ();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($oper_loc_wg_cd.equalsIgnoreCase(name)) {
			return oper_loc_wg_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($itm_dec_place.equalsIgnoreCase(name)) {
			return itm_dec_place();
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
		if ($itm_unit_cd.equalsIgnoreCase(name)) {
			itm_unit_cd(value);
			return;
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			sno1_mng_typ(value);
			return;
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			sno2_mng_typ(value);
			return;
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			sno3_mng_typ(value);
			return;
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			sno4_mng_typ(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($oper_loc_wg_cd.equalsIgnoreCase(name)) {
			oper_loc_wg_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($itm_dec_place.equalsIgnoreCase(name)) {
			itm_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($itm_dec_place.equalsIgnoreCase(name)) {
			itm_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($itm_dec_place.equalsIgnoreCase(name)) {
			itm_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($itm_dec_place.equalsIgnoreCase(name)) {
			itm_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($itm_dec_place.equalsIgnoreCase(name)) {
			itm_dec_place(value);
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
		if ($itm_unit_cd.equalsIgnoreCase(name)) {
			itm_unit_cd(value);
			return;
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			sno1_mng_typ(value);
			return;
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			sno2_mng_typ(value);
			return;
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			sno3_mng_typ(value);
			return;
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			sno4_mng_typ(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($oper_loc_wg_cd.equalsIgnoreCase(name)) {
			oper_loc_wg_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($itm_dec_place.equalsIgnoreCase(name)) {
			itm_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($itm_dec_place.equalsIgnoreCase(name)) {
			itm_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($itm_dec_place.equalsIgnoreCase(name)) {
			itm_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($itm_dec_place.equalsIgnoreCase(name)) {
			itm_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($itm_dec_place.equalsIgnoreCase(name)) {
			itm_dec_place(value);
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

