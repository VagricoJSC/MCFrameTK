package mcframe.clientMSBC.MSBCP0350;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.clientCore.container.MCKeyList;
import mcframe.clientCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class CndR_MC_A extends MCConstRow {

	/**
	 * UPD,Create/Modify;REF,View UPD,登録・訂正する;REF,参照する.<p>
	 *
	 */
	public static final String $ope = "ope";
	/**
	 * Plan month 計画年月.<p>
	 *
	 */
	public static final String $ym = "ym";
	/**
	 * Production month FROM 生産年月ＦＲＯＭ.<p>
	 *
	 */
	public static final String $prod_ym_fr = "prod_ym_fr";
	/**
	 * Production month TO 生産年月ＴＯ.<p>
	 *
	 */
	public static final String $prod_ym_to = "prod_ym_to";
	/**
	 * MPS group cd. ＭＰＳグループＣＤ.<p>
	 *
	 */
	public static final String $mps_grp_cd = "mps_grp_cd";
	/**
	 * MPS group name ＭＰＳグループ名.<p>
	 *
	 */
	public static final String $mps_grp_nm = "mps_grp_nm";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $site_cd = "site_cd";
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public static final String $site_nm = "site_nm";
	/**
	 * Storage location group cd. 格納場所グループＣＤ.<p>
	 *
	 */
	public static final String $strg_loc_grp_cd = "strg_loc_grp_cd";
	/**
	 * Storage location group name 格納場所グループ名.<p>
	 *
	 */
	public static final String $strg_loc_grp_nm = "strg_loc_grp_nm";
	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public static final String $strg_loc_cd = "strg_loc_cd";
	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public static final String $strg_loc_nm = "strg_loc_nm";
	/**
	 * Display key column キー項目表示.<p>
	 *
	 */
	public static final String $disp_key_flg = "disp_key_flg";
	/**
	 * Last time 前回.<p>
	 *
	 */
	public static final String $disp_pre_flg = "disp_pre_flg";
	/**
	 * Daily production request 日次生産依頼.<p>
	 *
	 */
	public static final String $disp_rqmt_flg = "disp_rqmt_flg";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $disp_act_flg = "disp_act_flg";


	public static final MCMeta ope_META = createStringMeta($ope);
	public static final MCMeta ym_META = createCommonMeta($ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta prod_ym_fr_META = createCommonMeta($prod_ym_fr, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta prod_ym_to_META = createCommonMeta($prod_ym_to, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta mps_grp_cd_META = createCommonMeta($mps_grp_cd, mcframe.commonMA.meta.MA_META.MPS_GRP_CD);
	public static final MCMeta mps_grp_nm_META = createCommonMeta($mps_grp_nm, mcframe.commonMA.meta.MA_META.MPS_GRP_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta site_nm_META = createCommonMeta($site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta strg_loc_grp_cd_META = createCommonMeta($strg_loc_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta strg_loc_grp_nm_META = createCommonMeta($strg_loc_grp_nm, mcframe.commonMA.meta.MA_META.LOC_GRP_NM);
	public static final MCMeta strg_loc_cd_META = createCommonMeta($strg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta strg_loc_nm_META = createCommonMeta($strg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta disp_key_flg_META = createCommonMeta($disp_key_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta disp_pre_flg_META = createCommonMeta($disp_pre_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta disp_rqmt_flg_META = createCommonMeta($disp_rqmt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta disp_act_flg_META = createCommonMeta($disp_act_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			ym_META,
			prod_ym_fr_META,
			prod_ym_to_META,
			mps_grp_cd_META,
			mps_grp_nm_META,
			wg_cd_META,
			wg_nm_META,
			site_cd_META,
			site_nm_META,
			strg_loc_grp_cd_META,
			strg_loc_grp_nm_META,
			strg_loc_cd_META,
			strg_loc_nm_META,
			disp_key_flg_META,
			disp_pre_flg_META,
			disp_rqmt_flg_META,
			disp_act_flg_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
		}
	);

	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[VH_KEY]のキー定数 */
	public static final String $$VH_KEY = "VH_KEY";
	/** 項目属性情報のグループ[VH_SUM]のキー定数 */
	public static final String $$VH_SUM = "VH_SUM";
	/** 項目属性情報のグループ[VH_SUM_ORDER]のキー定数 */
	public static final String $$VH_SUM_ORDER = "VH_SUM_ORDER";
	/** 項目属性情報のグループ[VH_DISP_COL]のキー定数 */
	public static final String $$VH_DISP_COL = "VH_DISP_COL";
	/** 項目属性情報のグループ[VH_DISP_GRP]のキー定数 */
	public static final String $$VH_DISP_GRP = "VH_DISP_GRP";
	/** 項目属性情報のグループ[VH_DISP_IDX]のキー定数 */
	public static final String $$VH_DISP_IDX = "VH_DISP_IDX";
	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$strg_loc_grp_cd, "loc_grp_nm"},	// strg_loc_grp_cd
				{$strg_loc_cd, "loc_nm"}	// strg_loc_cd
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
		new MCExtMap.Entry($$VH_KEY, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$VH_SUM, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$VH_SUM_ORDER, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$VH_DISP_COL, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$VH_DISP_GRP, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$VH_DISP_IDX, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"},	// wg_nm
				{$site_cd, "SITE"},	// site_cd
				{$site_nm, "SITE"},	// site_nm
				{$strg_loc_grp_cd, "LOC_GRP"},	// strg_loc_grp_cd
				{$strg_loc_grp_nm, "LOC_GRP"}	// strg_loc_grp_nm
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
	 * "KEYS"グループのキー項目情報を返します。
	 */
	public MCKeyList getKeys(){
		return KEYS;
	}

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
	public MCKeyList getKeys(String aGroup){
		if(aGroup == null) return null;
		return new MCKeyList(EXTMAP.getKeyList(aGroup));
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
	protected CndR_MC_A(ConstMetaList<? extends CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR clone() {
		return (CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR createInstance() {
		return (CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR getValues(String... names) {
		return (CndR) super.getValues(names);
	}



	/**
	 * UPD,Create/Modify;REF,View UPD,登録・訂正する;REF,参照する.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * UPD,Create/Modify;REF,View UPD,登録・訂正する;REF,参照する.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	/**
	 * Plan month 計画年月.<p>
	 *
	 */
	public MCDate ym() {
		return getConstDate(offset + 1, $ym);
	}

	/**
	 * Plan month 計画年月.<p>
	 *
	 */
	public void ym(MCDate value) {
		setConstDate(offset + 1, $ym, value);
	}


	/**
	 * Production month FROM 生産年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDate prod_ym_fr() {
		return getConstDate(offset + 2, $prod_ym_fr);
	}

	/**
	 * Production month FROM 生産年月ＦＲＯＭ.<p>
	 *
	 */
	public void prod_ym_fr(MCDate value) {
		setConstDate(offset + 2, $prod_ym_fr, value);
	}


	/**
	 * Production month TO 生産年月ＴＯ.<p>
	 *
	 */
	public MCDate prod_ym_to() {
		return getConstDate(offset + 3, $prod_ym_to);
	}

	/**
	 * Production month TO 生産年月ＴＯ.<p>
	 *
	 */
	public void prod_ym_to(MCDate value) {
		setConstDate(offset + 3, $prod_ym_to, value);
	}


	/**
	 * MPS group cd. ＭＰＳグループＣＤ.<p>
	 *
	 */
	public String mps_grp_cd() {
		return getConstString(offset + 4, $mps_grp_cd);
	}

	/**
	 * MPS group cd. ＭＰＳグループＣＤ.<p>
	 *
	 */
	public void mps_grp_cd(String value) {
		setConstString(offset + 4, $mps_grp_cd, value);
	}


	/**
	 * MPS group name ＭＰＳグループ名.<p>
	 *
	 */
	public String mps_grp_nm() {
		return getConstString(offset + 5, $mps_grp_nm);
	}

	/**
	 * MPS group name ＭＰＳグループ名.<p>
	 *
	 */
	public void mps_grp_nm(String value) {
		setConstString(offset + 5, $mps_grp_nm, value);
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
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 7, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 7, $wg_nm, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 8, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 8, $site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 9, $site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 9, $site_nm, value);
	}


	/**
	 * Storage location group cd. 格納場所グループＣＤ.<p>
	 *
	 */
	public String strg_loc_grp_cd() {
		return getConstString(offset + 10, $strg_loc_grp_cd);
	}

	/**
	 * Storage location group cd. 格納場所グループＣＤ.<p>
	 *
	 */
	public void strg_loc_grp_cd(String value) {
		setConstString(offset + 10, $strg_loc_grp_cd, value);
	}


	/**
	 * Storage location group name 格納場所グループ名.<p>
	 *
	 */
	public String strg_loc_grp_nm() {
		return getConstString(offset + 11, $strg_loc_grp_nm);
	}

	/**
	 * Storage location group name 格納場所グループ名.<p>
	 *
	 */
	public void strg_loc_grp_nm(String value) {
		setConstString(offset + 11, $strg_loc_grp_nm, value);
	}


	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public String strg_loc_cd() {
		return getConstString(offset + 12, $strg_loc_cd);
	}

	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public void strg_loc_cd(String value) {
		setConstString(offset + 12, $strg_loc_cd, value);
	}


	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public String strg_loc_nm() {
		return getConstString(offset + 13, $strg_loc_nm);
	}

	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public void strg_loc_nm(String value) {
		setConstString(offset + 13, $strg_loc_nm, value);
	}


	/**
	 * Display key column キー項目表示.<p>
	 *
	 */
	public boolean disp_key_flg() {
		return getConstBoolean(offset + 14, $disp_key_flg);
	}

	/**
	 * Display key column キー項目表示.<p>
	 *
	 */
	public void disp_key_flg(boolean value) {
		setConstBoolean(offset + 14, $disp_key_flg, value);
	}


	/**
	 * Last time 前回.<p>
	 *
	 */
	public boolean disp_pre_flg() {
		return getConstBoolean(offset + 15, $disp_pre_flg);
	}

	/**
	 * Last time 前回.<p>
	 *
	 */
	public void disp_pre_flg(boolean value) {
		setConstBoolean(offset + 15, $disp_pre_flg, value);
	}


	/**
	 * Daily production request 日次生産依頼.<p>
	 *
	 */
	public boolean disp_rqmt_flg() {
		return getConstBoolean(offset + 16, $disp_rqmt_flg);
	}

	/**
	 * Daily production request 日次生産依頼.<p>
	 *
	 */
	public void disp_rqmt_flg(boolean value) {
		setConstBoolean(offset + 16, $disp_rqmt_flg, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public boolean disp_act_flg() {
		return getConstBoolean(offset + 17, $disp_act_flg);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void disp_act_flg(boolean value) {
		setConstBoolean(offset + 17, $disp_act_flg, value);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($mps_grp_cd.equalsIgnoreCase(name)) {
			return mps_grp_cd();
		}
		if ($mps_grp_nm.equalsIgnoreCase(name)) {
			return mps_grp_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($strg_loc_grp_cd.equalsIgnoreCase(name)) {
			return strg_loc_grp_cd();
		}
		if ($strg_loc_grp_nm.equalsIgnoreCase(name)) {
			return strg_loc_grp_nm();
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			return strg_loc_cd();
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			return strg_loc_nm();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		if ($prod_ym_fr.equalsIgnoreCase(name)) {
			return prod_ym_fr();
		}
		if ($prod_ym_to.equalsIgnoreCase(name)) {
			return prod_ym_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($disp_key_flg.equalsIgnoreCase(name)) {
			return disp_key_flg();
		}
		if ($disp_pre_flg.equalsIgnoreCase(name)) {
			return disp_pre_flg();
		}
		if ($disp_rqmt_flg.equalsIgnoreCase(name)) {
			return disp_rqmt_flg();
		}
		if ($disp_act_flg.equalsIgnoreCase(name)) {
			return disp_act_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($mps_grp_cd.equalsIgnoreCase(name)) {
			return mps_grp_cd();
		}
		if ($mps_grp_nm.equalsIgnoreCase(name)) {
			return mps_grp_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($strg_loc_grp_cd.equalsIgnoreCase(name)) {
			return strg_loc_grp_cd();
		}
		if ($strg_loc_grp_nm.equalsIgnoreCase(name)) {
			return strg_loc_grp_nm();
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			return strg_loc_cd();
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			return strg_loc_nm();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		if ($prod_ym_fr.equalsIgnoreCase(name)) {
			return prod_ym_fr();
		}
		if ($prod_ym_to.equalsIgnoreCase(name)) {
			return prod_ym_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($disp_key_flg.equalsIgnoreCase(name)) {
			return disp_key_flg();
		}
		if ($disp_pre_flg.equalsIgnoreCase(name)) {
			return disp_pre_flg();
		}
		if ($disp_rqmt_flg.equalsIgnoreCase(name)) {
			return disp_rqmt_flg();
		}
		if ($disp_act_flg.equalsIgnoreCase(name)) {
			return disp_act_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($mps_grp_cd.equalsIgnoreCase(name)) {
			mps_grp_cd(value);
			return;
		}
		if ($mps_grp_nm.equalsIgnoreCase(name)) {
			mps_grp_nm(value);
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
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
			return;
		}
		if ($strg_loc_grp_cd.equalsIgnoreCase(name)) {
			strg_loc_grp_cd(value);
			return;
		}
		if ($strg_loc_grp_nm.equalsIgnoreCase(name)) {
			strg_loc_grp_nm(value);
			return;
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			strg_loc_cd(value);
			return;
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			strg_loc_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		if ($prod_ym_fr.equalsIgnoreCase(name)) {
			prod_ym_fr(value);
			return;
		}
		if ($prod_ym_to.equalsIgnoreCase(name)) {
			prod_ym_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($disp_key_flg.equalsIgnoreCase(name)) {
			disp_key_flg(value);
			return;
		}
		if ($disp_pre_flg.equalsIgnoreCase(name)) {
			disp_pre_flg(value);
			return;
		}
		if ($disp_rqmt_flg.equalsIgnoreCase(name)) {
			disp_rqmt_flg(value);
			return;
		}
		if ($disp_act_flg.equalsIgnoreCase(name)) {
			disp_act_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($mps_grp_cd.equalsIgnoreCase(name)) {
			mps_grp_cd(value);
			return;
		}
		if ($mps_grp_nm.equalsIgnoreCase(name)) {
			mps_grp_nm(value);
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
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
			return;
		}
		if ($strg_loc_grp_cd.equalsIgnoreCase(name)) {
			strg_loc_grp_cd(value);
			return;
		}
		if ($strg_loc_grp_nm.equalsIgnoreCase(name)) {
			strg_loc_grp_nm(value);
			return;
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			strg_loc_cd(value);
			return;
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			strg_loc_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		if ($prod_ym_fr.equalsIgnoreCase(name)) {
			prod_ym_fr(value);
			return;
		}
		if ($prod_ym_to.equalsIgnoreCase(name)) {
			prod_ym_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($disp_key_flg.equalsIgnoreCase(name)) {
			disp_key_flg(value);
			return;
		}
		if ($disp_pre_flg.equalsIgnoreCase(name)) {
			disp_pre_flg(value);
			return;
		}
		if ($disp_rqmt_flg.equalsIgnoreCase(name)) {
			disp_rqmt_flg(value);
			return;
		}
		if ($disp_act_flg.equalsIgnoreCase(name)) {
			disp_act_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

