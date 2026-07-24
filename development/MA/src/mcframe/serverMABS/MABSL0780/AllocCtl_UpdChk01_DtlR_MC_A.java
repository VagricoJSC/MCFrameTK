package mcframe.serverMABS.MABSL0780;

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
 * ブロック"AllocCtl_UpdChk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class AllocCtl_UpdChk01_DtlR_MC_A extends mcframe.serverMA.dbc.MAM_ALLOC_CTL_R {

	/**
	 * Destination WG cd. 移動先ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $to_wg_cd = "to_wg_cd";
	/**
	 * Destination location distribution group cd. 移動先物流グループＣＤ.<p>
	 *
	 */
	public static final String $to_lg_grp_cd = "to_lg_grp_cd";
	/**
	 * Source WG cd. 移動元ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $fr_wg_cd = "fr_wg_cd";
	/**
	 * Source distribution group cd. 移動元物流グループＣＤ.<p>
	 *
	 */
	public static final String $fr_lg_grp_cd = "fr_lg_grp_cd";
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public static final String $dec_place = "dec_place";


	public static final MCMeta to_wg_cd_META = createCommonMeta($to_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta to_lg_grp_cd_META = createCommonMeta($to_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta fr_wg_cd_META = createCommonMeta($fr_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta fr_lg_grp_cd_META = createCommonMeta($fr_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);

	protected static final ConstMetaList<AllocCtl_UpdChk01_DtlR> constMetas = new ConstMetaList<AllocCtl_UpdChk01_DtlR>(
		mcframe.serverMA.dbc.MAM_ALLOC_CTL_R.constMetas,
		new MCMeta[]{
			to_wg_cd_META,
			to_lg_grp_cd_META,
			fr_wg_cd_META,
			fr_lg_grp_cd_META,
			dec_place_META,
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
	/** 項目属性情報のグループ[LIST_OUT]のキー定数 */
	public static final String $$LIST_OUT = "LIST_OUT";
	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[CHK_NUM]のキー定数 */
	public static final String $$CHK_NUM = "CHK_NUM";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$to_loc_cd, "E"},	// to_loc_cd
				{$fr_loc_cd, "E"},	// fr_loc_cd
				{$prio, "E"}	// prio
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$to_loc_cd, "MA.MAUAL0010.Loc"},	// to_loc_cd
				{$fr_loc_cd, "MA.MAUAL0010.Loc"},	// fr_loc_cd
				{$itm_sub3, "MA.MAUAL0010.ItmSub3"}	// itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$to_loc_cd, "to_wg_cd;to_lg_grp_cd"},	// to_loc_cd
				{$fr_loc_cd, "fr_wg_cd;fr_lg_grp_cd"},	// fr_loc_cd
				{$itm_sub3, "dec_place"}	// itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$to_loc_cd, "wg_cd;lg_grp_cd"},	// to_loc_cd
				{$fr_loc_cd, "wg_cd;lg_grp_cd"},	// fr_loc_cd
				{$itm_sub3, "dec_place"}	// itm_sub3
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
				{$xfr_lot_unit_qty, "positive"}	// xfr_lot_unit_qty
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$to_loc_cd, "MAC_LOC_IS_SRCH_TYP.MFG_LG_WG"},	// to_loc_cd
				{$fr_loc_cd, "MAC_LOC_IS_SRCH_TYP.MFG_LG_WG"},	// fr_loc_cd
				{$itm_sub3, "MAC_ITM_IS_SRCH_TYP.STK1;itm_cd;itm_sub1;itm_sub2;true;true"}	// itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$to_loc_cd, "loc_is_srch_typ"},	// to_loc_cd
				{$fr_loc_cd, "loc_is_srch_typ"},	// fr_loc_cd
				{$itm_sub3, "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2;release_flg_on;release_flg_off"}	// itm_sub3
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
	protected AllocCtl_UpdChk01_DtlR_MC_A(ConstMetaList<? extends AllocCtl_UpdChk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public AllocCtl_UpdChk01_DtlR clone() {
		return (AllocCtl_UpdChk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public AllocCtl_UpdChk01_DtlR createInstance() {
		return (AllocCtl_UpdChk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public AllocCtl_UpdChk01_DtlR getValues(String... names) {
		return (AllocCtl_UpdChk01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Destination WG cd. 移動先ワーキンググループＣＤ.<p>
	 *
	 */
	public String to_wg_cd() {
		return getConstString(offset + 0, $to_wg_cd);
	}

	/**
	 * Destination WG cd. 移動先ワーキンググループＣＤ.<p>
	 *
	 */
	public void to_wg_cd(String value) {
		setConstString(offset + 0, $to_wg_cd, value);
	}


	/**
	 * Destination location distribution group cd. 移動先物流グループＣＤ.<p>
	 *
	 */
	public String to_lg_grp_cd() {
		return getConstString(offset + 1, $to_lg_grp_cd);
	}

	/**
	 * Destination location distribution group cd. 移動先物流グループＣＤ.<p>
	 *
	 */
	public void to_lg_grp_cd(String value) {
		setConstString(offset + 1, $to_lg_grp_cd, value);
	}


	/**
	 * Source WG cd. 移動元ワーキンググループＣＤ.<p>
	 *
	 */
	public String fr_wg_cd() {
		return getConstString(offset + 2, $fr_wg_cd);
	}

	/**
	 * Source WG cd. 移動元ワーキンググループＣＤ.<p>
	 *
	 */
	public void fr_wg_cd(String value) {
		setConstString(offset + 2, $fr_wg_cd, value);
	}


	/**
	 * Source distribution group cd. 移動元物流グループＣＤ.<p>
	 *
	 */
	public String fr_lg_grp_cd() {
		return getConstString(offset + 3, $fr_lg_grp_cd);
	}

	/**
	 * Source distribution group cd. 移動元物流グループＣＤ.<p>
	 *
	 */
	public void fr_lg_grp_cd(String value) {
		setConstString(offset + 3, $fr_lg_grp_cd, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 4, $dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 4, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 4, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 4, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 4, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 4, $dec_place, value);
	}


	public String getString(String name) {
		if ($to_wg_cd.equalsIgnoreCase(name)) {
			return to_wg_cd();
		}
		if ($to_lg_grp_cd.equalsIgnoreCase(name)) {
			return to_lg_grp_cd();
		}
		if ($fr_wg_cd.equalsIgnoreCase(name)) {
			return fr_wg_cd();
		}
		if ($fr_lg_grp_cd.equalsIgnoreCase(name)) {
			return fr_lg_grp_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($to_wg_cd.equalsIgnoreCase(name)) {
			return to_wg_cd();
		}
		if ($to_lg_grp_cd.equalsIgnoreCase(name)) {
			return to_lg_grp_cd();
		}
		if ($fr_wg_cd.equalsIgnoreCase(name)) {
			return fr_wg_cd();
		}
		if ($fr_lg_grp_cd.equalsIgnoreCase(name)) {
			return fr_lg_grp_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($to_wg_cd.equalsIgnoreCase(name)) {
			to_wg_cd(value);
			return;
		}
		if ($to_lg_grp_cd.equalsIgnoreCase(name)) {
			to_lg_grp_cd(value);
			return;
		}
		if ($fr_wg_cd.equalsIgnoreCase(name)) {
			fr_wg_cd(value);
			return;
		}
		if ($fr_lg_grp_cd.equalsIgnoreCase(name)) {
			fr_lg_grp_cd(value);
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
	public void setBoolean(String name, boolean value) {
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($to_wg_cd.equalsIgnoreCase(name)) {
			to_wg_cd(value);
			return;
		}
		if ($to_lg_grp_cd.equalsIgnoreCase(name)) {
			to_lg_grp_cd(value);
			return;
		}
		if ($fr_wg_cd.equalsIgnoreCase(name)) {
			fr_wg_cd(value);
			return;
		}
		if ($fr_lg_grp_cd.equalsIgnoreCase(name)) {
			fr_lg_grp_cd(value);
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
	public void setBooleanNE(String name, boolean value) {
		super.setBooleanNE(name, value);
	}



}

