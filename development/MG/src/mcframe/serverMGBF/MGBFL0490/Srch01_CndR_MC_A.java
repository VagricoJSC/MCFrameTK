package mcframe.serverMGBF.MGBFL0490;

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
 * ブロック"Srch01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_CndR_MC_A extends MCConstRow {

	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public static final String $calc_grp_cd = "calc_grp_cd";
	/**
	 * Month FROM 年月ＦＲＯＭ.<p>
	 *
	 */
	public static final String $ym_fr = "ym_fr";
	/**
	 * Month TO 年月ＴＯ.<p>
	 *
	 */
	public static final String $ym_to = "ym_to";
	/**
	 * Plan calculation group cd. 計画計算グループＣＤ.<p>
	 *
	 */
	public static final String $pln_calc_grp_cd = "pln_calc_grp_cd";
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
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public static final String $mng_dpt_cd = "mng_dpt_cd";
	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public static final String $mng_dpt_nm = "mng_dpt_nm";
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
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public static final String $lot_no = "lot_no";
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public static final String $sublot_no = "sublot_no";
	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public static final String $sno1 = "sno1";
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public static final String $sno2 = "sno2";
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public static final String $sno3 = "sno3";
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public static final String $sno4 = "sno4";
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public static final String $loc_nm = "loc_nm";
	/**
	 * Operation 工程.<p>
	 *
	 */
	public static final String $inpt_oper_flg = "inpt_oper_flg";
	/**
	 * Accounting reason 会計理由.<p>
	 *
	 */
	public static final String $inpt_rsn_flg = "inpt_rsn_flg";
	/**
	 * Operation 工程.<p>
	 *
	 */
	public static final String $wk_oper_flg = "wk_oper_flg";
	/**
	 * Man-hour reason 工数理由.<p>
	 *
	 */
	public static final String $wk_rsn_flg = "wk_rsn_flg";
	/**
	 * WG ワーキンググループ.<p>
	 *
	 */
	public static final String $wg_flg = "wg_flg";
	/**
	 * Dept. 部門.<p>
	 *
	 */
	public static final String $dpt_flg = "dpt_flg";
	/**
	 * Location 場所.<p>
	 *
	 */
	public static final String $loc_flg = "loc_flg";
	/**
	 * Operation 工程.<p>
	 *
	 */
	public static final String $oper_flg = "oper_flg";
	/**
	 * BP 取引先.<p>
	 *
	 */
	public static final String $bp_flg = "bp_flg";
	/**
	 * Item category 品群.<p>
	 *
	 */
	public static final String $ctg_flg = "ctg_flg";
	/**
	 * Item 品目.<p>
	 *
	 */
	public static final String $itm_flg = "itm_flg";
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public static final String $lot_flg = "lot_flg";
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public static final String $sublot_flg = "sublot_flg";
	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public static final String $sno1_flg = "sno1_flg";
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public static final String $sno2_flg = "sno2_flg";
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public static final String $sno3_flg = "sno3_flg";
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public static final String $sno4_flg = "sno4_flg";


	public static final MCMeta calc_grp_cd_META = createCommonMeta($calc_grp_cd, mcframe.commonMA.meta.MA_META.CALC_GRP_CD);
	public static final MCMeta ym_fr_META = createCommonMeta($ym_fr, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta ym_to_META = createCommonMeta($ym_to, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta pln_calc_grp_cd_META = createCommonMeta($pln_calc_grp_cd, mcframe.commonMA.meta.MA_META.CALC_GRP_CD);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta mng_dpt_cd_META = createCommonMeta($mng_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta mng_dpt_nm_META = createCommonMeta($mng_dpt_nm, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta site_nm_META = createCommonMeta($site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta inpt_oper_flg_META = createCommonMeta($inpt_oper_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inpt_rsn_flg_META = createCommonMeta($inpt_rsn_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wk_oper_flg_META = createCommonMeta($wk_oper_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wk_rsn_flg_META = createCommonMeta($wk_rsn_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wg_flg_META = createCommonMeta($wg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dpt_flg_META = createCommonMeta($dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta loc_flg_META = createCommonMeta($loc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta oper_flg_META = createCommonMeta($oper_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_flg_META = createCommonMeta($bp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ctg_flg_META = createCommonMeta($ctg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_flg_META = createCommonMeta($itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_flg_META = createCommonMeta($lot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sublot_flg_META = createCommonMeta($sublot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno1_flg_META = createCommonMeta($sno1_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno2_flg_META = createCommonMeta($sno2_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno3_flg_META = createCommonMeta($sno3_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno4_flg_META = createCommonMeta($sno4_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Srch01_CndR> constMetas = new ConstMetaList<Srch01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			calc_grp_cd_META,
			ym_fr_META,
			ym_to_META,
			pln_calc_grp_cd_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			wg_cd_META,
			wg_nm_META,
			mng_dpt_cd_META,
			mng_dpt_nm_META,
			site_cd_META,
			site_nm_META,
			loc_cd_META,
			lot_no_META,
			sublot_no_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			loc_nm_META,
			inpt_oper_flg_META,
			inpt_rsn_flg_META,
			wk_oper_flg_META,
			wk_rsn_flg_META,
			wg_flg_META,
			dpt_flg_META,
			loc_flg_META,
			oper_flg_META,
			bp_flg_META,
			ctg_flg_META,
			itm_flg_META,
			lot_flg_META,
			sublot_flg_META,
			sno1_flg_META,
			sno2_flg_META,
			sno3_flg_META,
			sno4_flg_META
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
	protected Srch01_CndR_MC_A(ConstMetaList<? extends Srch01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR clone() {
		return (Srch01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR createInstance() {
		return (Srch01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR getValues(String... names) {
		return (Srch01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public String calc_grp_cd() {
		return getConstString(offset + 0, $calc_grp_cd);
	}

	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public void calc_grp_cd(String value) {
		setConstString(offset + 0, $calc_grp_cd, value);
	}


	/**
	 * Month FROM 年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ym_fr() {
		return getConstDate(offset + 1, $ym_fr);
	}

	/**
	 * Month FROM 年月ＦＲＯＭ.<p>
	 *
	 */
	public void ym_fr(MCDate value) {
		setConstDate(offset + 1, $ym_fr, value);
	}


	/**
	 * Month TO 年月ＴＯ.<p>
	 *
	 */
	public MCDate ym_to() {
		return getConstDate(offset + 2, $ym_to);
	}

	/**
	 * Month TO 年月ＴＯ.<p>
	 *
	 */
	public void ym_to(MCDate value) {
		setConstDate(offset + 2, $ym_to, value);
	}


	/**
	 * Plan calculation group cd. 計画計算グループＣＤ.<p>
	 *
	 */
	public String pln_calc_grp_cd() {
		return getConstString(offset + 3, $pln_calc_grp_cd);
	}

	/**
	 * Plan calculation group cd. 計画計算グループＣＤ.<p>
	 *
	 */
	public void pln_calc_grp_cd(String value) {
		setConstString(offset + 3, $pln_calc_grp_cd, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 4, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 4, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 5, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 5, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 6, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 6, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 7, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 7, $itm_sub3, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 8, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 8, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 9, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 9, $wg_nm, value);
	}


	/**
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public String mng_dpt_cd() {
		return getConstString(offset + 10, $mng_dpt_cd);
	}

	/**
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public void mng_dpt_cd(String value) {
		setConstString(offset + 10, $mng_dpt_cd, value);
	}


	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public String mng_dpt_nm() {
		return getConstString(offset + 11, $mng_dpt_nm);
	}

	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public void mng_dpt_nm(String value) {
		setConstString(offset + 11, $mng_dpt_nm, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 12, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 12, $site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 13, $site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 13, $site_nm, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 14, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 14, $loc_cd, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 15, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 15, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 16, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 16, $sublot_no, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 17, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 17, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 18, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 18, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 19, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 19, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 20, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 20, $sno4, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 21, $loc_nm);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 21, $loc_nm, value);
	}


	/**
	 * Operation 工程.<p>
	 *
	 */
	public boolean inpt_oper_flg() {
		return getConstBoolean(offset + 22, $inpt_oper_flg);
	}

	/**
	 * Operation 工程.<p>
	 *
	 */
	public void inpt_oper_flg(boolean value) {
		setConstBoolean(offset + 22, $inpt_oper_flg, value);
	}


	/**
	 * Accounting reason 会計理由.<p>
	 *
	 */
	public boolean inpt_rsn_flg() {
		return getConstBoolean(offset + 23, $inpt_rsn_flg);
	}

	/**
	 * Accounting reason 会計理由.<p>
	 *
	 */
	public void inpt_rsn_flg(boolean value) {
		setConstBoolean(offset + 23, $inpt_rsn_flg, value);
	}


	/**
	 * Operation 工程.<p>
	 *
	 */
	public boolean wk_oper_flg() {
		return getConstBoolean(offset + 24, $wk_oper_flg);
	}

	/**
	 * Operation 工程.<p>
	 *
	 */
	public void wk_oper_flg(boolean value) {
		setConstBoolean(offset + 24, $wk_oper_flg, value);
	}


	/**
	 * Man-hour reason 工数理由.<p>
	 *
	 */
	public boolean wk_rsn_flg() {
		return getConstBoolean(offset + 25, $wk_rsn_flg);
	}

	/**
	 * Man-hour reason 工数理由.<p>
	 *
	 */
	public void wk_rsn_flg(boolean value) {
		setConstBoolean(offset + 25, $wk_rsn_flg, value);
	}


	/**
	 * WG ワーキンググループ.<p>
	 *
	 */
	public boolean wg_flg() {
		return getConstBoolean(offset + 26, $wg_flg);
	}

	/**
	 * WG ワーキンググループ.<p>
	 *
	 */
	public void wg_flg(boolean value) {
		setConstBoolean(offset + 26, $wg_flg, value);
	}


	/**
	 * Dept. 部門.<p>
	 *
	 */
	public boolean dpt_flg() {
		return getConstBoolean(offset + 27, $dpt_flg);
	}

	/**
	 * Dept. 部門.<p>
	 *
	 */
	public void dpt_flg(boolean value) {
		setConstBoolean(offset + 27, $dpt_flg, value);
	}


	/**
	 * Location 場所.<p>
	 *
	 */
	public boolean loc_flg() {
		return getConstBoolean(offset + 28, $loc_flg);
	}

	/**
	 * Location 場所.<p>
	 *
	 */
	public void loc_flg(boolean value) {
		setConstBoolean(offset + 28, $loc_flg, value);
	}


	/**
	 * Operation 工程.<p>
	 *
	 */
	public boolean oper_flg() {
		return getConstBoolean(offset + 29, $oper_flg);
	}

	/**
	 * Operation 工程.<p>
	 *
	 */
	public void oper_flg(boolean value) {
		setConstBoolean(offset + 29, $oper_flg, value);
	}


	/**
	 * BP 取引先.<p>
	 *
	 */
	public boolean bp_flg() {
		return getConstBoolean(offset + 30, $bp_flg);
	}

	/**
	 * BP 取引先.<p>
	 *
	 */
	public void bp_flg(boolean value) {
		setConstBoolean(offset + 30, $bp_flg, value);
	}


	/**
	 * Item category 品群.<p>
	 *
	 */
	public boolean ctg_flg() {
		return getConstBoolean(offset + 31, $ctg_flg);
	}

	/**
	 * Item category 品群.<p>
	 *
	 */
	public void ctg_flg(boolean value) {
		setConstBoolean(offset + 31, $ctg_flg, value);
	}


	/**
	 * Item 品目.<p>
	 *
	 */
	public boolean itm_flg() {
		return getConstBoolean(offset + 32, $itm_flg);
	}

	/**
	 * Item 品目.<p>
	 *
	 */
	public void itm_flg(boolean value) {
		setConstBoolean(offset + 32, $itm_flg, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public boolean lot_flg() {
		return getConstBoolean(offset + 33, $lot_flg);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_flg(boolean value) {
		setConstBoolean(offset + 33, $lot_flg, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public boolean sublot_flg() {
		return getConstBoolean(offset + 34, $sublot_flg);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_flg(boolean value) {
		setConstBoolean(offset + 34, $sublot_flg, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public boolean sno1_flg() {
		return getConstBoolean(offset + 35, $sno1_flg);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1_flg(boolean value) {
		setConstBoolean(offset + 35, $sno1_flg, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public boolean sno2_flg() {
		return getConstBoolean(offset + 36, $sno2_flg);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2_flg(boolean value) {
		setConstBoolean(offset + 36, $sno2_flg, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public boolean sno3_flg() {
		return getConstBoolean(offset + 37, $sno3_flg);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3_flg(boolean value) {
		setConstBoolean(offset + 37, $sno3_flg, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public boolean sno4_flg() {
		return getConstBoolean(offset + 38, $sno4_flg);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4_flg(boolean value) {
		setConstBoolean(offset + 38, $sno4_flg, value);
	}


	public String getString(String name) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($pln_calc_grp_cd.equalsIgnoreCase(name)) {
			return pln_calc_grp_cd();
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			return mng_dpt_cd();
		}
		if ($mng_dpt_nm.equalsIgnoreCase(name)) {
			return mng_dpt_nm();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($ym_fr.equalsIgnoreCase(name)) {
			return ym_fr();
		}
		if ($ym_to.equalsIgnoreCase(name)) {
			return ym_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($inpt_oper_flg.equalsIgnoreCase(name)) {
			return inpt_oper_flg();
		}
		if ($inpt_rsn_flg.equalsIgnoreCase(name)) {
			return inpt_rsn_flg();
		}
		if ($wk_oper_flg.equalsIgnoreCase(name)) {
			return wk_oper_flg();
		}
		if ($wk_rsn_flg.equalsIgnoreCase(name)) {
			return wk_rsn_flg();
		}
		if ($wg_flg.equalsIgnoreCase(name)) {
			return wg_flg();
		}
		if ($dpt_flg.equalsIgnoreCase(name)) {
			return dpt_flg();
		}
		if ($loc_flg.equalsIgnoreCase(name)) {
			return loc_flg();
		}
		if ($oper_flg.equalsIgnoreCase(name)) {
			return oper_flg();
		}
		if ($bp_flg.equalsIgnoreCase(name)) {
			return bp_flg();
		}
		if ($ctg_flg.equalsIgnoreCase(name)) {
			return ctg_flg();
		}
		if ($itm_flg.equalsIgnoreCase(name)) {
			return itm_flg();
		}
		if ($lot_flg.equalsIgnoreCase(name)) {
			return lot_flg();
		}
		if ($sublot_flg.equalsIgnoreCase(name)) {
			return sublot_flg();
		}
		if ($sno1_flg.equalsIgnoreCase(name)) {
			return sno1_flg();
		}
		if ($sno2_flg.equalsIgnoreCase(name)) {
			return sno2_flg();
		}
		if ($sno3_flg.equalsIgnoreCase(name)) {
			return sno3_flg();
		}
		if ($sno4_flg.equalsIgnoreCase(name)) {
			return sno4_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($pln_calc_grp_cd.equalsIgnoreCase(name)) {
			return pln_calc_grp_cd();
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			return mng_dpt_cd();
		}
		if ($mng_dpt_nm.equalsIgnoreCase(name)) {
			return mng_dpt_nm();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ym_fr.equalsIgnoreCase(name)) {
			return ym_fr();
		}
		if ($ym_to.equalsIgnoreCase(name)) {
			return ym_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($inpt_oper_flg.equalsIgnoreCase(name)) {
			return inpt_oper_flg();
		}
		if ($inpt_rsn_flg.equalsIgnoreCase(name)) {
			return inpt_rsn_flg();
		}
		if ($wk_oper_flg.equalsIgnoreCase(name)) {
			return wk_oper_flg();
		}
		if ($wk_rsn_flg.equalsIgnoreCase(name)) {
			return wk_rsn_flg();
		}
		if ($wg_flg.equalsIgnoreCase(name)) {
			return wg_flg();
		}
		if ($dpt_flg.equalsIgnoreCase(name)) {
			return dpt_flg();
		}
		if ($loc_flg.equalsIgnoreCase(name)) {
			return loc_flg();
		}
		if ($oper_flg.equalsIgnoreCase(name)) {
			return oper_flg();
		}
		if ($bp_flg.equalsIgnoreCase(name)) {
			return bp_flg();
		}
		if ($ctg_flg.equalsIgnoreCase(name)) {
			return ctg_flg();
		}
		if ($itm_flg.equalsIgnoreCase(name)) {
			return itm_flg();
		}
		if ($lot_flg.equalsIgnoreCase(name)) {
			return lot_flg();
		}
		if ($sublot_flg.equalsIgnoreCase(name)) {
			return sublot_flg();
		}
		if ($sno1_flg.equalsIgnoreCase(name)) {
			return sno1_flg();
		}
		if ($sno2_flg.equalsIgnoreCase(name)) {
			return sno2_flg();
		}
		if ($sno3_flg.equalsIgnoreCase(name)) {
			return sno3_flg();
		}
		if ($sno4_flg.equalsIgnoreCase(name)) {
			return sno4_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($pln_calc_grp_cd.equalsIgnoreCase(name)) {
			pln_calc_grp_cd(value);
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			mng_dpt_cd(value);
			return;
		}
		if ($mng_dpt_nm.equalsIgnoreCase(name)) {
			mng_dpt_nm(value);
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ym_fr.equalsIgnoreCase(name)) {
			ym_fr(value);
			return;
		}
		if ($ym_to.equalsIgnoreCase(name)) {
			ym_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($inpt_oper_flg.equalsIgnoreCase(name)) {
			inpt_oper_flg(value);
			return;
		}
		if ($inpt_rsn_flg.equalsIgnoreCase(name)) {
			inpt_rsn_flg(value);
			return;
		}
		if ($wk_oper_flg.equalsIgnoreCase(name)) {
			wk_oper_flg(value);
			return;
		}
		if ($wk_rsn_flg.equalsIgnoreCase(name)) {
			wk_rsn_flg(value);
			return;
		}
		if ($wg_flg.equalsIgnoreCase(name)) {
			wg_flg(value);
			return;
		}
		if ($dpt_flg.equalsIgnoreCase(name)) {
			dpt_flg(value);
			return;
		}
		if ($loc_flg.equalsIgnoreCase(name)) {
			loc_flg(value);
			return;
		}
		if ($oper_flg.equalsIgnoreCase(name)) {
			oper_flg(value);
			return;
		}
		if ($bp_flg.equalsIgnoreCase(name)) {
			bp_flg(value);
			return;
		}
		if ($ctg_flg.equalsIgnoreCase(name)) {
			ctg_flg(value);
			return;
		}
		if ($itm_flg.equalsIgnoreCase(name)) {
			itm_flg(value);
			return;
		}
		if ($lot_flg.equalsIgnoreCase(name)) {
			lot_flg(value);
			return;
		}
		if ($sublot_flg.equalsIgnoreCase(name)) {
			sublot_flg(value);
			return;
		}
		if ($sno1_flg.equalsIgnoreCase(name)) {
			sno1_flg(value);
			return;
		}
		if ($sno2_flg.equalsIgnoreCase(name)) {
			sno2_flg(value);
			return;
		}
		if ($sno3_flg.equalsIgnoreCase(name)) {
			sno3_flg(value);
			return;
		}
		if ($sno4_flg.equalsIgnoreCase(name)) {
			sno4_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($pln_calc_grp_cd.equalsIgnoreCase(name)) {
			pln_calc_grp_cd(value);
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			mng_dpt_cd(value);
			return;
		}
		if ($mng_dpt_nm.equalsIgnoreCase(name)) {
			mng_dpt_nm(value);
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ym_fr.equalsIgnoreCase(name)) {
			ym_fr(value);
			return;
		}
		if ($ym_to.equalsIgnoreCase(name)) {
			ym_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($inpt_oper_flg.equalsIgnoreCase(name)) {
			inpt_oper_flg(value);
			return;
		}
		if ($inpt_rsn_flg.equalsIgnoreCase(name)) {
			inpt_rsn_flg(value);
			return;
		}
		if ($wk_oper_flg.equalsIgnoreCase(name)) {
			wk_oper_flg(value);
			return;
		}
		if ($wk_rsn_flg.equalsIgnoreCase(name)) {
			wk_rsn_flg(value);
			return;
		}
		if ($wg_flg.equalsIgnoreCase(name)) {
			wg_flg(value);
			return;
		}
		if ($dpt_flg.equalsIgnoreCase(name)) {
			dpt_flg(value);
			return;
		}
		if ($loc_flg.equalsIgnoreCase(name)) {
			loc_flg(value);
			return;
		}
		if ($oper_flg.equalsIgnoreCase(name)) {
			oper_flg(value);
			return;
		}
		if ($bp_flg.equalsIgnoreCase(name)) {
			bp_flg(value);
			return;
		}
		if ($ctg_flg.equalsIgnoreCase(name)) {
			ctg_flg(value);
			return;
		}
		if ($itm_flg.equalsIgnoreCase(name)) {
			itm_flg(value);
			return;
		}
		if ($lot_flg.equalsIgnoreCase(name)) {
			lot_flg(value);
			return;
		}
		if ($sublot_flg.equalsIgnoreCase(name)) {
			sublot_flg(value);
			return;
		}
		if ($sno1_flg.equalsIgnoreCase(name)) {
			sno1_flg(value);
			return;
		}
		if ($sno2_flg.equalsIgnoreCase(name)) {
			sno2_flg(value);
			return;
		}
		if ($sno3_flg.equalsIgnoreCase(name)) {
			sno3_flg(value);
			return;
		}
		if ($sno4_flg.equalsIgnoreCase(name)) {
			sno4_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

