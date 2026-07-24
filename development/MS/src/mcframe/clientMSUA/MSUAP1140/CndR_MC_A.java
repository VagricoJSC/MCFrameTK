package mcframe.clientMSUA.MSUAP1140;

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
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public static final String $bp_cd = "bp_cd";
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public static final String $bp_nm = "bp_nm";
	/**
	 * Customer item cd. (Input value) 得意先品目ＣＤ（入力値）.<p>
	 *
	 */
	public static final String $bp_itm_cd_input = "bp_itm_cd_input";
	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public static final String $bp_itm_cd = "bp_itm_cd";
	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public static final String $bp_itm_nm = "bp_itm_nm";
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
	 * Item name 品名.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	public static final String $itm_typ_p = "itm_typ_p";
	/**
	 * Miscellaneous item. On 諸口品.オン.<p>
	 *
	 */
	public static final String $sundry_itm_flg_on = "sundry_itm_flg_on";
	/**
	 * Miscellaneous item. Off 諸口品.オフ.<p>
	 *
	 */
	public static final String $sundry_itm_flg_off = "sundry_itm_flg_off";
	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public static final String $stk_mng_typ = "stk_mng_typ";
	/**
	 * Inventory management type name 在庫管理区分名.<p>
	 *
	 */
	public static final String $stk_mng_typ_nm = "stk_mng_typ_nm";
	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public static final String $asset_mng_typ = "asset_mng_typ";
	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public static final String $asset_mng_typ_nm = "asset_mng_typ_nm";
	/**
	 * Application date 適用日.<p>
	 *
	 */
	public static final String $dt = "dt";
	public static final String $cst_itm_is_srch_typ = "cst_itm_is_srch_typ";
	/**
	 * Search type 検索区分.<p>
	 *
	 */
	public static final String $cst_itm_is_srch_typ_nm = "cst_itm_is_srch_typ_nm";
	/**
	 * 0,Forward match;1,Partial match;2,Backward match;3,Perfect match 0,前方一致;1,部分一致;2,後方一致;3,完全一致.<p>
	 *
	 */
	public static final String $match_typ = "match_typ";

	public static final String $itm_typ = $itm_typ_p + ".itm_typ";
	public static final String $itm_typ_nm = $itm_typ_p + ".itm_typ_nm";
	public static final String $itm_typ_d_cd = $itm_typ_p + ".itm_typ_d_cd";
	public static final String $itm_typ_d_nm = $itm_typ_p + ".itm_typ_d_nm";

	public static final MCMeta bp_cd_META = createCommonMeta($bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bp_nm_META = createCommonMeta($bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bp_itm_cd_input_META = createCommonMeta($bp_itm_cd_input, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta bp_itm_cd_META = createCommonMeta($bp_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta bp_itm_nm_META = createCommonMeta($bp_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta itm_typ_p_META = createInnerRowMeta($itm_typ_p, mcframe.clientMAUB.MAUBP0100.ItmTypR.class);
	public static final MCMeta sundry_itm_flg_on_META = createCommonMeta($sundry_itm_flg_on, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sundry_itm_flg_off_META = createCommonMeta($sundry_itm_flg_off, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_mng_typ_META = createCommonMeta($stk_mng_typ, mcframe.commonMA.meta.MA_META.STK_MNG_TYP);
	public static final MCMeta stk_mng_typ_nm_META = createCommonMeta($stk_mng_typ_nm, mcframe.commonMA.meta.MA_META.STK_MNG_TYP_NM);
	public static final MCMeta asset_mng_typ_META = createCommonMeta($asset_mng_typ, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP);
	public static final MCMeta asset_mng_typ_nm_META = createCommonMeta($asset_mng_typ_nm, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP_NM);
	public static final MCMeta dt_META = createCommonMeta($dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta cst_itm_is_srch_typ_META = createCommonMeta($cst_itm_is_srch_typ, mcframe.commonMA.meta.MA_META.ITM_IS_SRCH_TYP);
	public static final MCMeta cst_itm_is_srch_typ_nm_META = createCommonMeta($cst_itm_is_srch_typ_nm, mcframe.commonMA.meta.MA_META.ITM_IS_SRCH_TYP_NM);
	public static final MCMeta match_typ_META = createStringMeta($match_typ);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			bp_cd_META,
			bp_nm_META,
			bp_itm_cd_input_META,
			bp_itm_cd_META,
			bp_itm_nm_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			itm_typ_p_META,
			sundry_itm_flg_on_META,
			sundry_itm_flg_off_META,
			stk_mng_typ_META,
			stk_mng_typ_nm_META,
			asset_mng_typ_META,
			asset_mng_typ_nm_META,
			dt_META,
			cst_itm_is_srch_typ_META,
			cst_itm_is_srch_typ_nm_META,
			match_typ_META
		},
		new String[][]{
			{
				"itm_typ",
				"itm_typ_nm",
				"itm_typ_d_cd",
				"itm_typ_d_nm"
			},
			{
				$itm_typ,
				$itm_typ_nm,
				$itm_typ_d_cd,
				$itm_typ_d_nm
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
	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
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
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$itm_sub1, "ITM_SUB1"},	// itm_sub1
				{$itm_sub2, "ITM_SUB2"},	// itm_sub2
				{$itm_sub3, "ITM_SUB3"}	// itm_sub3
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
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String bp_cd() {
		return getConstString(offset + 0, $bp_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void bp_cd(String value) {
		setConstString(offset + 0, $bp_cd, value);
	}


	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public String bp_nm() {
		return getConstString(offset + 1, $bp_nm);
	}

	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public void bp_nm(String value) {
		setConstString(offset + 1, $bp_nm, value);
	}


	/**
	 * Customer item cd. (Input value) 得意先品目ＣＤ（入力値）.<p>
	 *
	 */
	public String bp_itm_cd_input() {
		return getConstString(offset + 2, $bp_itm_cd_input);
	}

	/**
	 * Customer item cd. (Input value) 得意先品目ＣＤ（入力値）.<p>
	 *
	 */
	public void bp_itm_cd_input(String value) {
		setConstString(offset + 2, $bp_itm_cd_input, value);
	}


	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public String bp_itm_cd() {
		return getConstString(offset + 3, $bp_itm_cd);
	}

	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public void bp_itm_cd(String value) {
		setConstString(offset + 3, $bp_itm_cd, value);
	}


	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public String bp_itm_nm() {
		return getConstString(offset + 4, $bp_itm_nm);
	}

	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public void bp_itm_nm(String value) {
		setConstString(offset + 4, $bp_itm_nm, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 5, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 5, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 6, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 6, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 7, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 7, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 8, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 8, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 9, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 9, $itm_nm, value);
	}


	public mcframe.clientMAUB.MAUBP0100.ItmTypR itm_typ_p(){
		return (mcframe.clientMAUB.MAUBP0100.ItmTypR) getConstInnerRow(offset + 10, $itm_typ_p);
	}
	
	public void itm_typ_p(mcframe.clientMAUB.MAUBP0100.ItmTypR row){
		setConstInnerRow(offset + 10, $itm_typ_p, row);
	}


	/**
	 * Miscellaneous item. On 諸口品.オン.<p>
	 *
	 */
	public boolean sundry_itm_flg_on() {
		return getConstBoolean(offset + 11, $sundry_itm_flg_on);
	}

	/**
	 * Miscellaneous item. On 諸口品.オン.<p>
	 *
	 */
	public void sundry_itm_flg_on(boolean value) {
		setConstBoolean(offset + 11, $sundry_itm_flg_on, value);
	}


	/**
	 * Miscellaneous item. Off 諸口品.オフ.<p>
	 *
	 */
	public boolean sundry_itm_flg_off() {
		return getConstBoolean(offset + 12, $sundry_itm_flg_off);
	}

	/**
	 * Miscellaneous item. Off 諸口品.オフ.<p>
	 *
	 */
	public void sundry_itm_flg_off(boolean value) {
		setConstBoolean(offset + 12, $sundry_itm_flg_off, value);
	}


	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public String stk_mng_typ() {
		return getConstString(offset + 13, $stk_mng_typ);
	}

	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public void stk_mng_typ(String value) {
		setConstString(offset + 13, $stk_mng_typ, value);
	}


	/**
	 * Inventory management type name 在庫管理区分名.<p>
	 *
	 */
	public String stk_mng_typ_nm() {
		return getConstString(offset + 14, $stk_mng_typ_nm);
	}

	/**
	 * Inventory management type name 在庫管理区分名.<p>
	 *
	 */
	public void stk_mng_typ_nm(String value) {
		setConstString(offset + 14, $stk_mng_typ_nm, value);
	}


	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public String asset_mng_typ() {
		return getConstString(offset + 15, $asset_mng_typ);
	}

	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public void asset_mng_typ(String value) {
		setConstString(offset + 15, $asset_mng_typ, value);
	}


	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public String asset_mng_typ_nm() {
		return getConstString(offset + 16, $asset_mng_typ_nm);
	}

	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public void asset_mng_typ_nm(String value) {
		setConstString(offset + 16, $asset_mng_typ_nm, value);
	}


	/**
	 * Application date 適用日.<p>
	 *
	 */
	public MCDate dt() {
		return getConstDate(offset + 17, $dt);
	}

	/**
	 * Application date 適用日.<p>
	 *
	 */
	public void dt(MCDate value) {
		setConstDate(offset + 17, $dt, value);
	}


	public String cst_itm_is_srch_typ() {
		return getConstString(offset + 18, $cst_itm_is_srch_typ);
	}

	public void cst_itm_is_srch_typ(String value) {
		setConstString(offset + 18, $cst_itm_is_srch_typ, value);
	}


	/**
	 * Search type 検索区分.<p>
	 *
	 */
	public String cst_itm_is_srch_typ_nm() {
		return getConstString(offset + 19, $cst_itm_is_srch_typ_nm);
	}

	/**
	 * Search type 検索区分.<p>
	 *
	 */
	public void cst_itm_is_srch_typ_nm(String value) {
		setConstString(offset + 19, $cst_itm_is_srch_typ_nm, value);
	}


	/**
	 * 0,Forward match;1,Partial match;2,Backward match;3,Perfect match 0,前方一致;1,部分一致;2,後方一致;3,完全一致.<p>
	 *
	 */
	public String match_typ() {
		return getConstString(offset + 20, $match_typ);
	}

	/**
	 * 0,Forward match;1,Partial match;2,Backward match;3,Perfect match 0,前方一致;1,部分一致;2,後方一致;3,完全一致.<p>
	 *
	 */
	public void match_typ(String value) {
		setConstString(offset + 20, $match_typ, value);
	}


	public String getString(String name) {
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($bp_itm_cd_input.equalsIgnoreCase(name)) {
			return bp_itm_cd_input();
		}
		if ($bp_itm_cd.equalsIgnoreCase(name)) {
			return bp_itm_cd();
		}
		if ($bp_itm_nm.equalsIgnoreCase(name)) {
			return bp_itm_nm();
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
		}
		if ($stk_mng_typ_nm.equalsIgnoreCase(name)) {
			return stk_mng_typ_nm();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		if ($asset_mng_typ_nm.equalsIgnoreCase(name)) {
			return asset_mng_typ_nm();
		}
		if ($cst_itm_is_srch_typ.equalsIgnoreCase(name)) {
			return cst_itm_is_srch_typ();
		}
		if ($cst_itm_is_srch_typ_nm.equalsIgnoreCase(name)) {
			return cst_itm_is_srch_typ_nm();
		}
		if ($match_typ.equalsIgnoreCase(name)) {
			return match_typ();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($dt.equalsIgnoreCase(name)) {
			return dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($sundry_itm_flg_on.equalsIgnoreCase(name)) {
			return sundry_itm_flg_on();
		}
		if ($sundry_itm_flg_off.equalsIgnoreCase(name)) {
			return sundry_itm_flg_off();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($bp_itm_cd_input.equalsIgnoreCase(name)) {
			return bp_itm_cd_input();
		}
		if ($bp_itm_cd.equalsIgnoreCase(name)) {
			return bp_itm_cd();
		}
		if ($bp_itm_nm.equalsIgnoreCase(name)) {
			return bp_itm_nm();
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
		}
		if ($stk_mng_typ_nm.equalsIgnoreCase(name)) {
			return stk_mng_typ_nm();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		if ($asset_mng_typ_nm.equalsIgnoreCase(name)) {
			return asset_mng_typ_nm();
		}
		if ($cst_itm_is_srch_typ.equalsIgnoreCase(name)) {
			return cst_itm_is_srch_typ();
		}
		if ($cst_itm_is_srch_typ_nm.equalsIgnoreCase(name)) {
			return cst_itm_is_srch_typ_nm();
		}
		if ($match_typ.equalsIgnoreCase(name)) {
			return match_typ();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($dt.equalsIgnoreCase(name)) {
			return dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($sundry_itm_flg_on.equalsIgnoreCase(name)) {
			return sundry_itm_flg_on();
		}
		if ($sundry_itm_flg_off.equalsIgnoreCase(name)) {
			return sundry_itm_flg_off();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
			return;
		}
		if ($bp_itm_cd_input.equalsIgnoreCase(name)) {
			bp_itm_cd_input(value);
			return;
		}
		if ($bp_itm_cd.equalsIgnoreCase(name)) {
			bp_itm_cd(value);
			return;
		}
		if ($bp_itm_nm.equalsIgnoreCase(name)) {
			bp_itm_nm(value);
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			stk_mng_typ(value);
			return;
		}
		if ($stk_mng_typ_nm.equalsIgnoreCase(name)) {
			stk_mng_typ_nm(value);
			return;
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
			return;
		}
		if ($asset_mng_typ_nm.equalsIgnoreCase(name)) {
			asset_mng_typ_nm(value);
			return;
		}
		if ($cst_itm_is_srch_typ.equalsIgnoreCase(name)) {
			cst_itm_is_srch_typ(value);
			return;
		}
		if ($cst_itm_is_srch_typ_nm.equalsIgnoreCase(name)) {
			cst_itm_is_srch_typ_nm(value);
			return;
		}
		if ($match_typ.equalsIgnoreCase(name)) {
			match_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($dt.equalsIgnoreCase(name)) {
			dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($sundry_itm_flg_on.equalsIgnoreCase(name)) {
			sundry_itm_flg_on(value);
			return;
		}
		if ($sundry_itm_flg_off.equalsIgnoreCase(name)) {
			sundry_itm_flg_off(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
			return;
		}
		if ($bp_itm_cd_input.equalsIgnoreCase(name)) {
			bp_itm_cd_input(value);
			return;
		}
		if ($bp_itm_cd.equalsIgnoreCase(name)) {
			bp_itm_cd(value);
			return;
		}
		if ($bp_itm_nm.equalsIgnoreCase(name)) {
			bp_itm_nm(value);
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			stk_mng_typ(value);
			return;
		}
		if ($stk_mng_typ_nm.equalsIgnoreCase(name)) {
			stk_mng_typ_nm(value);
			return;
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
			return;
		}
		if ($asset_mng_typ_nm.equalsIgnoreCase(name)) {
			asset_mng_typ_nm(value);
			return;
		}
		if ($cst_itm_is_srch_typ.equalsIgnoreCase(name)) {
			cst_itm_is_srch_typ(value);
			return;
		}
		if ($cst_itm_is_srch_typ_nm.equalsIgnoreCase(name)) {
			cst_itm_is_srch_typ_nm(value);
			return;
		}
		if ($match_typ.equalsIgnoreCase(name)) {
			match_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($dt.equalsIgnoreCase(name)) {
			dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($sundry_itm_flg_on.equalsIgnoreCase(name)) {
			sundry_itm_flg_on(value);
			return;
		}
		if ($sundry_itm_flg_off.equalsIgnoreCase(name)) {
			sundry_itm_flg_off(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itm_typ_p.equalsIgnoreCase(name)) {
			return itm_typ_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($itm_typ_p.equalsIgnoreCase(name)) {
			itm_typ_p(
				((MCContainerMeta) itm_typ_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0100.ItmTypR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public String itm_typ() {
		return itm_typ_p().itm_typ();
	}

	public void itm_typ(String value) {
		itm_typ_p().itm_typ(value);
	}

	public String itm_typ_nm() {
		return itm_typ_p().itm_typ_nm();
	}

	public void itm_typ_nm(String value) {
		itm_typ_p().itm_typ_nm(value);
	}

	public String itm_typ_d_cd() {
		return itm_typ_p().itm_typ_d_cd();
	}

	public void itm_typ_d_cd(String value) {
		itm_typ_p().itm_typ_d_cd(value);
	}

	public String itm_typ_d_nm() {
		return itm_typ_p().itm_typ_d_nm();
	}

	public void itm_typ_d_nm(String value) {
		itm_typ_p().itm_typ_d_nm(value);
	}

}

