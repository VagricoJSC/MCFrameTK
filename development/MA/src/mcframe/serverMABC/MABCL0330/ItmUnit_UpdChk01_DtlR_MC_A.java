package mcframe.serverMABC.MABCL0330;

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
 * ブロック"ItmUnit_UpdChk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ItmUnit_UpdChk01_DtlR_MC_A extends mcframe.serverMA.dbc.MAM_ITM_UNIT__R {

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	/**
	 * Shipping unit cd. 出荷単位ＣＤ.<p>
	 *
	 */
	public static final String $ship_unit_cd = "ship_unit_cd";
	/**
	 * Mfg. unit cd. 製造単位ＣＤ.<p>
	 *
	 */
	public static final String $mfg_unit_cd = "mfg_unit_cd";
	/**
	 * PO unit cd. 発注単位ＣＤ.<p>
	 *
	 */
	public static final String $purc_unit_cd = "purc_unit_cd";
	/**
	 * Packing unit cd. 梱包単位ＣＤ.<p>
	 *
	 */
	public static final String $pckg_unit_cd = "pckg_unit_cd";
	/**
	 * Number of decimal places (Unit master) 小数部有効桁数（単位マスタ）.<p>
	 *
	 */
	public static final String $unit_dec_place = "unit_dec_place";
	/**
	 * Number of decimal places (Base unit) 小数部有効桁数（基準単位）.<p>
	 *
	 */
	public static final String $itm_base_unit_dec_place = "itm_base_unit_dec_place";
	/**
	 * Rounding type (Base unit) 端数処理区分（基準単位）.<p>
	 *
	 */
	public static final String $itm_base_unit_rnd_typ = "itm_base_unit_rnd_typ";


	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta ship_unit_cd_META = createCommonMeta($ship_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta mfg_unit_cd_META = createCommonMeta($mfg_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta purc_unit_cd_META = createCommonMeta($purc_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta pckg_unit_cd_META = createCommonMeta($pckg_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta unit_dec_place_META = createCommonMeta($unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta itm_base_unit_dec_place_META = createCommonMeta($itm_base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta itm_base_unit_rnd_typ_META = createCommonMeta($itm_base_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);

	protected static final ConstMetaList<ItmUnit_UpdChk01_DtlR> constMetas = new ConstMetaList<ItmUnit_UpdChk01_DtlR>(
		mcframe.serverMA.dbc.MAM_ITM_UNIT__R.constMetas,
		new MCMeta[]{
			base_unit_cd_META,
			ship_unit_cd_META,
			mfg_unit_cd_META,
			purc_unit_cd_META,
			pckg_unit_cd_META,
			unit_dec_place_META,
			itm_base_unit_dec_place_META,
			itm_base_unit_rnd_typ_META,
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
	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
	/** 項目属性情報のグループ[LIST_LOGIC]のキー定数 */
	public static final String $$LIST_LOGIC = "LIST_LOGIC";
	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";
	/** 項目属性情報のグループ[CHK_NUM]のキー定数 */
	public static final String $$CHK_NUM = "CHK_NUM";
	/** 項目属性情報のグループ[SMALL_LARGE]のキー定数 */
	public static final String $$SMALL_LARGE = "SMALL_LARGE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[LIST_OUT]のキー定数 */
	public static final String $$LIST_OUT = "LIST_OUT";
	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$itm_cd, "E"},	// itm_cd
				{$itm_sub1, "E"},	// itm_sub1
				{$itm_sub2, "E"},	// itm_sub2
				{$itm_sub3, "E"},	// itm_sub3
				{$unit_cd, "E"},	// unit_cd
				{$dec_place, "E"},	// dec_place
				{$conv_base_qty, "E"},	// conv_base_qty
				{$conv_qty, "E"},	// conv_qty
				{$rnd_typ, "E"},	// rnd_typ
				{$pack_flg, "E"},	// pack_flg
				{$pckg_flg, "E"}	// pckg_flg
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$rnd_typ, "MAC_RND_TYP"}	// rnd_typ
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$itm_sub3, "MA.MAUAL0010.ItmSub3"},	// itm_sub3
				{$unit_cd, "MA.MAUAL0010.Unit"}	// unit_cd
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
				{$itm_sub1, "E"},	// itm_sub1
				{$itm_sub2, "E"},	// itm_sub2
				{$itm_sub3, "E"}	// itm_sub3
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
				{$conv_base_qty, "positive"},	// conv_base_qty
				{$conv_qty, "positive"}	// conv_qty
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
				{$unit_dec_place, "E1:L"},	// unit_dec_place
				{$dec_place, "E1:S,0:"},	// dec_place
				{$unit_dim, "0:"},	// unit_dim
				{$unit_wt, "0:"}	// unit_wt
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$itm_sub3, "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;itm_sub1;itm_sub2;true;true"}	// itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$itm_sub3, "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2;release_flg_on;release_flg_off"}	// itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$itm_sub3, "base_unit_cd;itm_base_unit_dec_place;itm_base_unit_rnd_typ"},	// itm_sub3
				{$unit_cd, "unit_dec_place"}	// unit_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$itm_sub3, "unit_cd;dec_place;rnd_typ"},	// itm_sub3
				{$unit_cd, "dec_place"}	// unit_cd
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
	protected ItmUnit_UpdChk01_DtlR_MC_A(ConstMetaList<? extends ItmUnit_UpdChk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ItmUnit_UpdChk01_DtlR clone() {
		return (ItmUnit_UpdChk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ItmUnit_UpdChk01_DtlR createInstance() {
		return (ItmUnit_UpdChk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ItmUnit_UpdChk01_DtlR getValues(String... names) {
		return (ItmUnit_UpdChk01_DtlR) super.getValues(names);
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
	public String base_unit_cd() {
		return getConstString(offset + 0, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 0, $base_unit_cd, value);
	}


	/**
	 * Shipping unit cd. 出荷単位ＣＤ.<p>
	 *
	 */
	public String ship_unit_cd() {
		return getConstString(offset + 1, $ship_unit_cd);
	}

	/**
	 * Shipping unit cd. 出荷単位ＣＤ.<p>
	 *
	 */
	public void ship_unit_cd(String value) {
		setConstString(offset + 1, $ship_unit_cd, value);
	}


	/**
	 * Mfg. unit cd. 製造単位ＣＤ.<p>
	 *
	 */
	public String mfg_unit_cd() {
		return getConstString(offset + 2, $mfg_unit_cd);
	}

	/**
	 * Mfg. unit cd. 製造単位ＣＤ.<p>
	 *
	 */
	public void mfg_unit_cd(String value) {
		setConstString(offset + 2, $mfg_unit_cd, value);
	}


	/**
	 * PO unit cd. 発注単位ＣＤ.<p>
	 *
	 */
	public String purc_unit_cd() {
		return getConstString(offset + 3, $purc_unit_cd);
	}

	/**
	 * PO unit cd. 発注単位ＣＤ.<p>
	 *
	 */
	public void purc_unit_cd(String value) {
		setConstString(offset + 3, $purc_unit_cd, value);
	}


	/**
	 * Packing unit cd. 梱包単位ＣＤ.<p>
	 *
	 */
	public String pckg_unit_cd() {
		return getConstString(offset + 4, $pckg_unit_cd);
	}

	/**
	 * Packing unit cd. 梱包単位ＣＤ.<p>
	 *
	 */
	public void pckg_unit_cd(String value) {
		setConstString(offset + 4, $pckg_unit_cd, value);
	}


	/**
	 * Number of decimal places (Unit master) 小数部有効桁数（単位マスタ）.<p>
	 *
	 */
	public MCNumber unit_dec_place() {
		return getConstNumber(offset + 5, $unit_dec_place);
	}

	/**
	 * Number of decimal places (Unit master) 小数部有効桁数（単位マスタ）.<p>
	 *
	 */
	public void unit_dec_place(MCNumber value) {
		setConstNumber(offset + 5, $unit_dec_place, value);
	}

	/**
	 * Number of decimal places (Unit master) 小数部有効桁数（単位マスタ）.<p>
	 *
	 */
	public void unit_dec_place(int value) {
		setConstNumber(offset + 5, $unit_dec_place, value);
	}

	/**
	 * Number of decimal places (Unit master) 小数部有効桁数（単位マスタ）.<p>
	 *
	 */
	public void unit_dec_place(long value) {
		setConstNumber(offset + 5, $unit_dec_place, value);
	}

	/**
	 * Number of decimal places (Unit master) 小数部有効桁数（単位マスタ）.<p>
	 *
	 */
	public void unit_dec_place(float value) {
		setConstNumber(offset + 5, $unit_dec_place, value);
	}

	/**
	 * Number of decimal places (Unit master) 小数部有効桁数（単位マスタ）.<p>
	 *
	 */
	public void unit_dec_place(double value) {
		setConstNumber(offset + 5, $unit_dec_place, value);
	}


	/**
	 * Number of decimal places (Base unit) 小数部有効桁数（基準単位）.<p>
	 *
	 */
	public MCNumber itm_base_unit_dec_place() {
		return getConstNumber(offset + 6, $itm_base_unit_dec_place);
	}

	/**
	 * Number of decimal places (Base unit) 小数部有効桁数（基準単位）.<p>
	 *
	 */
	public void itm_base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 6, $itm_base_unit_dec_place, value);
	}

	/**
	 * Number of decimal places (Base unit) 小数部有効桁数（基準単位）.<p>
	 *
	 */
	public void itm_base_unit_dec_place(int value) {
		setConstNumber(offset + 6, $itm_base_unit_dec_place, value);
	}

	/**
	 * Number of decimal places (Base unit) 小数部有効桁数（基準単位）.<p>
	 *
	 */
	public void itm_base_unit_dec_place(long value) {
		setConstNumber(offset + 6, $itm_base_unit_dec_place, value);
	}

	/**
	 * Number of decimal places (Base unit) 小数部有効桁数（基準単位）.<p>
	 *
	 */
	public void itm_base_unit_dec_place(float value) {
		setConstNumber(offset + 6, $itm_base_unit_dec_place, value);
	}

	/**
	 * Number of decimal places (Base unit) 小数部有効桁数（基準単位）.<p>
	 *
	 */
	public void itm_base_unit_dec_place(double value) {
		setConstNumber(offset + 6, $itm_base_unit_dec_place, value);
	}


	/**
	 * Rounding type (Base unit) 端数処理区分（基準単位）.<p>
	 *
	 */
	public String itm_base_unit_rnd_typ() {
		return getConstString(offset + 7, $itm_base_unit_rnd_typ);
	}

	/**
	 * Rounding type (Base unit) 端数処理区分（基準単位）.<p>
	 *
	 */
	public void itm_base_unit_rnd_typ(String value) {
		setConstString(offset + 7, $itm_base_unit_rnd_typ, value);
	}


	public String getString(String name) {
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($ship_unit_cd.equalsIgnoreCase(name)) {
			return ship_unit_cd();
		}
		if ($mfg_unit_cd.equalsIgnoreCase(name)) {
			return mfg_unit_cd();
		}
		if ($purc_unit_cd.equalsIgnoreCase(name)) {
			return purc_unit_cd();
		}
		if ($pckg_unit_cd.equalsIgnoreCase(name)) {
			return pckg_unit_cd();
		}
		if ($itm_base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return itm_base_unit_rnd_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($unit_dec_place.equalsIgnoreCase(name)) {
			return unit_dec_place();
		}
		if ($itm_base_unit_dec_place.equalsIgnoreCase(name)) {
			return itm_base_unit_dec_place();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($ship_unit_cd.equalsIgnoreCase(name)) {
			return ship_unit_cd();
		}
		if ($mfg_unit_cd.equalsIgnoreCase(name)) {
			return mfg_unit_cd();
		}
		if ($purc_unit_cd.equalsIgnoreCase(name)) {
			return purc_unit_cd();
		}
		if ($pckg_unit_cd.equalsIgnoreCase(name)) {
			return pckg_unit_cd();
		}
		if ($itm_base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return itm_base_unit_rnd_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($unit_dec_place.equalsIgnoreCase(name)) {
			return unit_dec_place();
		}
		if ($itm_base_unit_dec_place.equalsIgnoreCase(name)) {
			return itm_base_unit_dec_place();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($ship_unit_cd.equalsIgnoreCase(name)) {
			ship_unit_cd(value);
			return;
		}
		if ($mfg_unit_cd.equalsIgnoreCase(name)) {
			mfg_unit_cd(value);
			return;
		}
		if ($purc_unit_cd.equalsIgnoreCase(name)) {
			purc_unit_cd(value);
			return;
		}
		if ($pckg_unit_cd.equalsIgnoreCase(name)) {
			pckg_unit_cd(value);
			return;
		}
		if ($itm_base_unit_rnd_typ.equalsIgnoreCase(name)) {
			itm_base_unit_rnd_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($unit_dec_place.equalsIgnoreCase(name)) {
			unit_dec_place(value);
			return;
		}
		if ($itm_base_unit_dec_place.equalsIgnoreCase(name)) {
			itm_base_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($unit_dec_place.equalsIgnoreCase(name)) {
			unit_dec_place(value);
			return;
		}
		if ($itm_base_unit_dec_place.equalsIgnoreCase(name)) {
			itm_base_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($unit_dec_place.equalsIgnoreCase(name)) {
			unit_dec_place(value);
			return;
		}
		if ($itm_base_unit_dec_place.equalsIgnoreCase(name)) {
			itm_base_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($unit_dec_place.equalsIgnoreCase(name)) {
			unit_dec_place(value);
			return;
		}
		if ($itm_base_unit_dec_place.equalsIgnoreCase(name)) {
			itm_base_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($unit_dec_place.equalsIgnoreCase(name)) {
			unit_dec_place(value);
			return;
		}
		if ($itm_base_unit_dec_place.equalsIgnoreCase(name)) {
			itm_base_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($ship_unit_cd.equalsIgnoreCase(name)) {
			ship_unit_cd(value);
			return;
		}
		if ($mfg_unit_cd.equalsIgnoreCase(name)) {
			mfg_unit_cd(value);
			return;
		}
		if ($purc_unit_cd.equalsIgnoreCase(name)) {
			purc_unit_cd(value);
			return;
		}
		if ($pckg_unit_cd.equalsIgnoreCase(name)) {
			pckg_unit_cd(value);
			return;
		}
		if ($itm_base_unit_rnd_typ.equalsIgnoreCase(name)) {
			itm_base_unit_rnd_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($unit_dec_place.equalsIgnoreCase(name)) {
			unit_dec_place(value);
			return;
		}
		if ($itm_base_unit_dec_place.equalsIgnoreCase(name)) {
			itm_base_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($unit_dec_place.equalsIgnoreCase(name)) {
			unit_dec_place(value);
			return;
		}
		if ($itm_base_unit_dec_place.equalsIgnoreCase(name)) {
			itm_base_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($unit_dec_place.equalsIgnoreCase(name)) {
			unit_dec_place(value);
			return;
		}
		if ($itm_base_unit_dec_place.equalsIgnoreCase(name)) {
			itm_base_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($unit_dec_place.equalsIgnoreCase(name)) {
			unit_dec_place(value);
			return;
		}
		if ($itm_base_unit_dec_place.equalsIgnoreCase(name)) {
			itm_base_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($unit_dec_place.equalsIgnoreCase(name)) {
			unit_dec_place(value);
			return;
		}
		if ($itm_base_unit_dec_place.equalsIgnoreCase(name)) {
			itm_base_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		super.setBooleanNE(name, value);
	}



}

