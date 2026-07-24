package mcframe.serverMABC.MABCL0390;

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
 * ブロック"ItmLst_UpdChk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ItmLst_UpdChk01_DtlR_MC_A extends mcframe.serverMA.dbc.MAM_ITM_CMN_UPD_R {

	/**
	 * Search image 画像検索.<p>
	 *
	 */
	public static final String $th_image_flg = "th_image_flg";
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public static final String $check_dec_place = "check_dec_place";


	public static final MCMeta th_image_flg_META = createCommonMeta($th_image_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta check_dec_place_META = createCommonMeta($check_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);

	protected static final ConstMetaList<ItmLst_UpdChk01_DtlR> constMetas = new ConstMetaList<ItmLst_UpdChk01_DtlR>(
		mcframe.serverMA.dbc.MAM_ITM_CMN_UPD_R.constMetas,
		new MCMeta[]{
			th_image_flg_META,
			check_dec_place_META,
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
	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
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
	/** 項目属性情報のグループ[CHK_PTN]のキー定数 */
	public static final String $$CHK_PTN = "CHK_PTN";
	/** 項目属性情報のグループ[SMALL_LARGE]のキー定数 */
	public static final String $$SMALL_LARGE = "SMALL_LARGE";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$itm_cd, "E"},	// itm_cd
				{$itm_nm, "E"},	// itm_nm
				{$stk_mng_typ, "E"},	// stk_mng_typ
				{$asset_mng_typ, "E"},	// asset_mng_typ
				{$unit_cd, "E"},	// unit_cd
				{$dec_place, "E"},	// dec_place
				{$rnd_typ, "E"}	// rnd_typ
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
				{$itm_sub1, "E"},	// itm_sub1
				{$itm_sub2, "E"},	// itm_sub2
				{$itm_sub3, "E"}	// itm_sub3
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$stk_mng_typ, "MAC_STK_MNG_TYP"},	// stk_mng_typ
				{$asset_mng_typ, "MAC_ASSET_MNG_TYP"},	// asset_mng_typ
				{$rnd_typ, "MAC_RND_TYP"},	// rnd_typ
				{$jan_typ, "MAC_JAN_TYP"}	// jan_typ
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$unit_cd, "MA.MAUAL0010.Unit"},	// unit_cd
				{$dim_unit_cd, "MA.MAUAL0010.Unit"},	// dim_unit_cd
				{$wt_unit_cd, "MA.MAUAL0010.Unit"},	// wt_unit_cd
				{$conts_unit_cd, "MA.MAUAL0010.Unit"},	// conts_unit_cd
				{$sls_itm_grp_cd, "MA.MAUAL0010.SlsItmGrpBtm"},	// sls_itm_grp_cd
				{$itm_grp_cd1, "MA.MAUAL0010.ItmGrp1"},	// itm_grp_cd1
				{$itm_grp_cd2, "MA.MAUAL0010.ItmGrp2"},	// itm_grp_cd2
				{$itm_grp_cd3, "MA.MAUAL0010.ItmGrp3"},	// itm_grp_cd3
				{$itm_grp_cd4, "MA.MAUAL0010.ItmGrp4"},	// itm_grp_cd4
				{$itm_grp_cd5, "MA.MAUAL0010.ItmGrp5"},	// itm_grp_cd5
				{$itm_grp_cd6, "MA.MAUAL0010.ItmGrp6"},	// itm_grp_cd6
				{$itm_grp_cd7, "MA.MAUAL0010.ItmGrp7"},	// itm_grp_cd7
				{$itm_grp_cd8, "MA.MAUAL0010.ItmGrp8"},	// itm_grp_cd8
				{$itm_grp_cd9, "MA.MAUAL0010.ItmGrp9"},	// itm_grp_cd9
				{$itm_grp_cd10, "MA.MAUAL0010.ItmGrp10"},	// itm_grp_cd10
				{$hs_cd, "MA.MAUAL0010.Hs"}	// hs_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$unit_cd, "check_dec_place"}	// unit_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$unit_cd, "dec_place"}	// unit_cd
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
		new MCExtMap.Entry($$CHK_PTN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
				{$dec_place, "0:8"},	// dec_place
				{$dim, "0:"},	// dim
				{$wt, "0:"},	// wt
				{$conts_qty, "0:"},	// conts_qty
				{$unit_dim, "0:"},	// unit_dim
				{$unit_wt, "0:"}	// unit_wt
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
	protected ItmLst_UpdChk01_DtlR_MC_A(ConstMetaList<? extends ItmLst_UpdChk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ItmLst_UpdChk01_DtlR clone() {
		return (ItmLst_UpdChk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ItmLst_UpdChk01_DtlR createInstance() {
		return (ItmLst_UpdChk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ItmLst_UpdChk01_DtlR getValues(String... names) {
		return (ItmLst_UpdChk01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Search image 画像検索.<p>
	 *
	 */
	public boolean th_image_flg() {
		return getConstBoolean(offset + 0, $th_image_flg);
	}

	/**
	 * Search image 画像検索.<p>
	 *
	 */
	public void th_image_flg(boolean value) {
		setConstBoolean(offset + 0, $th_image_flg, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber check_dec_place() {
		return getConstNumber(offset + 1, $check_dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void check_dec_place(MCNumber value) {
		setConstNumber(offset + 1, $check_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void check_dec_place(int value) {
		setConstNumber(offset + 1, $check_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void check_dec_place(long value) {
		setConstNumber(offset + 1, $check_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void check_dec_place(float value) {
		setConstNumber(offset + 1, $check_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void check_dec_place(double value) {
		setConstNumber(offset + 1, $check_dec_place, value);
	}


	public String getString(String name) {
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($check_dec_place.equalsIgnoreCase(name)) {
			return check_dec_place();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($th_image_flg.equalsIgnoreCase(name)) {
			return th_image_flg();
		}
		return super.getBoolean(name);
	}
	public MCBinary getBinary(String name) {
		return super.getBinary(name);
	}

	public String getStringNE(String name) {
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($check_dec_place.equalsIgnoreCase(name)) {
			return check_dec_place();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($th_image_flg.equalsIgnoreCase(name)) {
			return th_image_flg();
		}
		return super.getBooleanNE(name);
	}
	public MCBinary getBinaryNE(String name) {
		return super.getBinaryNE(name);
	}

	public void setString(String name, String value) {
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($check_dec_place.equalsIgnoreCase(name)) {
			check_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($check_dec_place.equalsIgnoreCase(name)) {
			check_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($check_dec_place.equalsIgnoreCase(name)) {
			check_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($check_dec_place.equalsIgnoreCase(name)) {
			check_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($check_dec_place.equalsIgnoreCase(name)) {
			check_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($th_image_flg.equalsIgnoreCase(name)) {
			th_image_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}
	public void setBinary(String name, MCBinary value) {
		super.setBinary(name, value);
	}

	public void setStringNE(String name, String value) {
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($check_dec_place.equalsIgnoreCase(name)) {
			check_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($check_dec_place.equalsIgnoreCase(name)) {
			check_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($check_dec_place.equalsIgnoreCase(name)) {
			check_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($check_dec_place.equalsIgnoreCase(name)) {
			check_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($check_dec_place.equalsIgnoreCase(name)) {
			check_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($th_image_flg.equalsIgnoreCase(name)) {
			th_image_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}
	public void setBinaryNE(String name, MCBinary value) {
		super.setBinaryNE(name, value);
	}



}

