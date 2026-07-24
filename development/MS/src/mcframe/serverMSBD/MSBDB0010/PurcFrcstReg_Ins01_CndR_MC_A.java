package mcframe.serverMSBD.MSBDB0010;

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
 * ブロック"PurcFrcstReg_Ins01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class PurcFrcstReg_Ins01_CndR_MC_A extends MCConstRow {

	/**
	 * Forecast date 内示日.<p>
	 *
	 */
	public static final String $pf_dt = "pf_dt";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
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
	 * Exclude Long LT order 先行手配オーダ除く.<p>
	 *
	 */
	public static final String $except_prcd_ord_flg = "except_prcd_ord_flg";
	/**
	 * Except unfirm orders 未確定オーダ除く.<p>
	 *
	 */
	public static final String $except_opn_ord_flg = "except_opn_ord_flg";
	/**
	 * Exclude saved order 保存オーダ除く.<p>
	 *
	 */
	public static final String $except_sav_ord_flg = "except_sav_ord_flg";


	public static final MCMeta pf_dt_META = createCommonMeta($pf_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta except_prcd_ord_flg_META = createCommonMeta($except_prcd_ord_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta except_opn_ord_flg_META = createCommonMeta($except_opn_ord_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta except_sav_ord_flg_META = createCommonMeta($except_sav_ord_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<PurcFrcstReg_Ins01_CndR> constMetas = new ConstMetaList<PurcFrcstReg_Ins01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			pf_dt_META,
			wg_cd_META,
			sppl_cd_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			except_prcd_ord_flg_META,
			except_opn_ord_flg_META,
			except_sav_ord_flg_META
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
	protected PurcFrcstReg_Ins01_CndR_MC_A(ConstMetaList<? extends PurcFrcstReg_Ins01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PurcFrcstReg_Ins01_CndR clone() {
		return (PurcFrcstReg_Ins01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PurcFrcstReg_Ins01_CndR createInstance() {
		return (PurcFrcstReg_Ins01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PurcFrcstReg_Ins01_CndR getValues(String... names) {
		return (PurcFrcstReg_Ins01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Forecast date 内示日.<p>
	 *
	 */
	public MCDate pf_dt() {
		return getConstDate(offset + 0, $pf_dt);
	}

	/**
	 * Forecast date 内示日.<p>
	 *
	 */
	public void pf_dt(MCDate value) {
		setConstDate(offset + 0, $pf_dt, value);
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
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 2, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 2, $sppl_cd, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 3, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 3, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 4, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 4, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 5, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 5, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 6, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 6, $itm_sub3, value);
	}


	/**
	 * Exclude Long LT order 先行手配オーダ除く.<p>
	 *
	 */
	public boolean except_prcd_ord_flg() {
		return getConstBoolean(offset + 7, $except_prcd_ord_flg);
	}

	/**
	 * Exclude Long LT order 先行手配オーダ除く.<p>
	 *
	 */
	public void except_prcd_ord_flg(boolean value) {
		setConstBoolean(offset + 7, $except_prcd_ord_flg, value);
	}


	/**
	 * Except unfirm orders 未確定オーダ除く.<p>
	 *
	 */
	public boolean except_opn_ord_flg() {
		return getConstBoolean(offset + 8, $except_opn_ord_flg);
	}

	/**
	 * Except unfirm orders 未確定オーダ除く.<p>
	 *
	 */
	public void except_opn_ord_flg(boolean value) {
		setConstBoolean(offset + 8, $except_opn_ord_flg, value);
	}


	/**
	 * Exclude saved order 保存オーダ除く.<p>
	 *
	 */
	public boolean except_sav_ord_flg() {
		return getConstBoolean(offset + 9, $except_sav_ord_flg);
	}

	/**
	 * Exclude saved order 保存オーダ除く.<p>
	 *
	 */
	public void except_sav_ord_flg(boolean value) {
		setConstBoolean(offset + 9, $except_sav_ord_flg, value);
	}


	public String getString(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
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
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($pf_dt.equalsIgnoreCase(name)) {
			return pf_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($except_prcd_ord_flg.equalsIgnoreCase(name)) {
			return except_prcd_ord_flg();
		}
		if ($except_opn_ord_flg.equalsIgnoreCase(name)) {
			return except_opn_ord_flg();
		}
		if ($except_sav_ord_flg.equalsIgnoreCase(name)) {
			return except_sav_ord_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
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
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($pf_dt.equalsIgnoreCase(name)) {
			return pf_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($except_prcd_ord_flg.equalsIgnoreCase(name)) {
			return except_prcd_ord_flg();
		}
		if ($except_opn_ord_flg.equalsIgnoreCase(name)) {
			return except_opn_ord_flg();
		}
		if ($except_sav_ord_flg.equalsIgnoreCase(name)) {
			return except_sav_ord_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
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
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($pf_dt.equalsIgnoreCase(name)) {
			pf_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($except_prcd_ord_flg.equalsIgnoreCase(name)) {
			except_prcd_ord_flg(value);
			return;
		}
		if ($except_opn_ord_flg.equalsIgnoreCase(name)) {
			except_opn_ord_flg(value);
			return;
		}
		if ($except_sav_ord_flg.equalsIgnoreCase(name)) {
			except_sav_ord_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
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
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($pf_dt.equalsIgnoreCase(name)) {
			pf_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($except_prcd_ord_flg.equalsIgnoreCase(name)) {
			except_prcd_ord_flg(value);
			return;
		}
		if ($except_opn_ord_flg.equalsIgnoreCase(name)) {
			except_opn_ord_flg(value);
			return;
		}
		if ($except_sav_ord_flg.equalsIgnoreCase(name)) {
			except_sav_ord_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

