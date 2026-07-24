package mcframe.serverMSBE.MSBEL0060;

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
 * ブロック"Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RsltR_MC_A extends MCConstRow {

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
	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public static final String $ver_flg = "ver_flg";
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
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public static final String $ver_no = "ver_no";
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public static final String $loc_nm = "loc_nm";
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
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public static final String $lg_grp_cd = "lg_grp_cd";
	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public static final String $lg_grp_nm = "lg_grp_nm";
	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public static final String $alloc_grp_cd = "alloc_grp_cd";
	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public static final String $alloc_grp_nm = "alloc_grp_nm";
	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public static final String $loc_grp_cd = "loc_grp_cd";
	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public static final String $loc_grp_nm = "loc_grp_nm";
	/**
	 * GR/GI date 入出庫日.<p>
	 *
	 */
	public static final String $dt = "dt";
	/**
	 * GR scheduled qty. 入庫予定数量.<p>
	 *
	 */
	public static final String $gr_schd_qty = "gr_schd_qty";
	/**
	 * GI scheduled qty. 出庫予定数量.<p>
	 *
	 */
	public static final String $gi_schd_qty = "gi_schd_qty";
	/**
	 * GR result qty. 入庫実績数量.<p>
	 *
	 */
	public static final String $gr_act_qty = "gr_act_qty";
	/**
	 * GI result qty. 出庫実績数量.<p>
	 *
	 */
	public static final String $gi_act_qty = "gi_act_qty";
	/**
	 * Inventory qty. 在庫数量.<p>
	 *
	 */
	public static final String $stk_qty = "stk_qty";
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public static final String $base_unit_nm = "base_unit_nm";
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public static final String $base_unit_dec_place = "base_unit_dec_place";
	/**
	 * Inventory amount 在庫金額.<p>
	 *
	 */
	public static final String $stk_amt = "stk_amt";
	/**
	 * Long LT order 先行手配.<p>
	 *
	 */
	public static final String $prcd_flg = "prcd_flg";
	/**
	 * Simulation シミュレーション.<p>
	 *
	 */
	public static final String $sim_flg = "sim_flg";


	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta ver_flg_META = createCommonMeta($ver_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta site_nm_META = createCommonMeta($site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta lg_grp_cd_META = createCommonMeta($lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta lg_grp_nm_META = createCommonMeta($lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta alloc_grp_cd_META = createCommonMeta($alloc_grp_cd, mcframe.commonMA.meta.MA_META.ALLOC_GRP_CD);
	public static final MCMeta alloc_grp_nm_META = createCommonMeta($alloc_grp_nm, mcframe.commonMA.meta.MA_META.ALLOC_GRP_NM);
	public static final MCMeta loc_grp_cd_META = createCommonMeta($loc_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta loc_grp_nm_META = createCommonMeta($loc_grp_nm, mcframe.commonMA.meta.MA_META.LOC_GRP_NM);
	public static final MCMeta dt_META = createCommonMeta($dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta gr_schd_qty_META = createCommonMeta($gr_schd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta gi_schd_qty_META = createCommonMeta($gi_schd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta gr_act_qty_META = createCommonMeta($gr_act_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta gi_act_qty_META = createCommonMeta($gi_act_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta stk_qty_META = createCommonMeta($stk_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta stk_amt_META = createCommonMeta($stk_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta prcd_flg_META = createCommonMeta($prcd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sim_flg_META = createCommonMeta($sim_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<RsltR> constMetas = new ConstMetaList<RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			ver_flg_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			ver_no_META,
			loc_cd_META,
			loc_nm_META,
			site_cd_META,
			site_nm_META,
			wg_cd_META,
			wg_nm_META,
			lg_grp_cd_META,
			lg_grp_nm_META,
			alloc_grp_cd_META,
			alloc_grp_nm_META,
			loc_grp_cd_META,
			loc_grp_nm_META,
			dt_META,
			gr_schd_qty_META,
			gi_schd_qty_META,
			gr_act_qty_META,
			gi_act_qty_META,
			stk_qty_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_dec_place_META,
			stk_amt_META,
			prcd_flg_META,
			sim_flg_META
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
	protected RsltR_MC_A(ConstMetaList<? extends RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR clone() {
		return (RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR createInstance() {
		return (RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR getValues(String... names) {
		return (RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 0, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 0, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 1, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 1, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 2, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 2, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 3, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 3, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 4, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 4, $itm_nm, value);
	}


	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public boolean ver_flg() {
		return getConstBoolean(offset + 5, $ver_flg);
	}

	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public void ver_flg(boolean value) {
		setConstBoolean(offset + 5, $ver_flg, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 6, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 6, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 7, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 7, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 8, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 8, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 9, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 9, $sno4, value);
	}


	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 10, $ver_no);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 10, $ver_no, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 11, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 11, $loc_cd, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 12, $loc_nm);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 12, $loc_nm, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 13, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 13, $site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 14, $site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 14, $site_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 15, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 15, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 16, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 16, $wg_nm, value);
	}


	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public String lg_grp_cd() {
		return getConstString(offset + 17, $lg_grp_cd);
	}

	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public void lg_grp_cd(String value) {
		setConstString(offset + 17, $lg_grp_cd, value);
	}


	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public String lg_grp_nm() {
		return getConstString(offset + 18, $lg_grp_nm);
	}

	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public void lg_grp_nm(String value) {
		setConstString(offset + 18, $lg_grp_nm, value);
	}


	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public String alloc_grp_cd() {
		return getConstString(offset + 19, $alloc_grp_cd);
	}

	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public void alloc_grp_cd(String value) {
		setConstString(offset + 19, $alloc_grp_cd, value);
	}


	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public String alloc_grp_nm() {
		return getConstString(offset + 20, $alloc_grp_nm);
	}

	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public void alloc_grp_nm(String value) {
		setConstString(offset + 20, $alloc_grp_nm, value);
	}


	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public String loc_grp_cd() {
		return getConstString(offset + 21, $loc_grp_cd);
	}

	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public void loc_grp_cd(String value) {
		setConstString(offset + 21, $loc_grp_cd, value);
	}


	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public String loc_grp_nm() {
		return getConstString(offset + 22, $loc_grp_nm);
	}

	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public void loc_grp_nm(String value) {
		setConstString(offset + 22, $loc_grp_nm, value);
	}


	/**
	 * GR/GI date 入出庫日.<p>
	 *
	 */
	public MCDate dt() {
		return getConstDate(offset + 23, $dt);
	}

	/**
	 * GR/GI date 入出庫日.<p>
	 *
	 */
	public void dt(MCDate value) {
		setConstDate(offset + 23, $dt, value);
	}


	/**
	 * GR scheduled qty. 入庫予定数量.<p>
	 *
	 */
	public MCNumber gr_schd_qty() {
		return getConstNumber(offset + 24, $gr_schd_qty);
	}

	/**
	 * GR scheduled qty. 入庫予定数量.<p>
	 *
	 */
	public void gr_schd_qty(MCNumber value) {
		setConstNumber(offset + 24, $gr_schd_qty, value);
	}

	/**
	 * GR scheduled qty. 入庫予定数量.<p>
	 *
	 */
	public void gr_schd_qty(int value) {
		setConstNumber(offset + 24, $gr_schd_qty, value);
	}

	/**
	 * GR scheduled qty. 入庫予定数量.<p>
	 *
	 */
	public void gr_schd_qty(long value) {
		setConstNumber(offset + 24, $gr_schd_qty, value);
	}

	/**
	 * GR scheduled qty. 入庫予定数量.<p>
	 *
	 */
	public void gr_schd_qty(float value) {
		setConstNumber(offset + 24, $gr_schd_qty, value);
	}

	/**
	 * GR scheduled qty. 入庫予定数量.<p>
	 *
	 */
	public void gr_schd_qty(double value) {
		setConstNumber(offset + 24, $gr_schd_qty, value);
	}


	/**
	 * GI scheduled qty. 出庫予定数量.<p>
	 *
	 */
	public MCNumber gi_schd_qty() {
		return getConstNumber(offset + 25, $gi_schd_qty);
	}

	/**
	 * GI scheduled qty. 出庫予定数量.<p>
	 *
	 */
	public void gi_schd_qty(MCNumber value) {
		setConstNumber(offset + 25, $gi_schd_qty, value);
	}

	/**
	 * GI scheduled qty. 出庫予定数量.<p>
	 *
	 */
	public void gi_schd_qty(int value) {
		setConstNumber(offset + 25, $gi_schd_qty, value);
	}

	/**
	 * GI scheduled qty. 出庫予定数量.<p>
	 *
	 */
	public void gi_schd_qty(long value) {
		setConstNumber(offset + 25, $gi_schd_qty, value);
	}

	/**
	 * GI scheduled qty. 出庫予定数量.<p>
	 *
	 */
	public void gi_schd_qty(float value) {
		setConstNumber(offset + 25, $gi_schd_qty, value);
	}

	/**
	 * GI scheduled qty. 出庫予定数量.<p>
	 *
	 */
	public void gi_schd_qty(double value) {
		setConstNumber(offset + 25, $gi_schd_qty, value);
	}


	/**
	 * GR result qty. 入庫実績数量.<p>
	 *
	 */
	public MCNumber gr_act_qty() {
		return getConstNumber(offset + 26, $gr_act_qty);
	}

	/**
	 * GR result qty. 入庫実績数量.<p>
	 *
	 */
	public void gr_act_qty(MCNumber value) {
		setConstNumber(offset + 26, $gr_act_qty, value);
	}

	/**
	 * GR result qty. 入庫実績数量.<p>
	 *
	 */
	public void gr_act_qty(int value) {
		setConstNumber(offset + 26, $gr_act_qty, value);
	}

	/**
	 * GR result qty. 入庫実績数量.<p>
	 *
	 */
	public void gr_act_qty(long value) {
		setConstNumber(offset + 26, $gr_act_qty, value);
	}

	/**
	 * GR result qty. 入庫実績数量.<p>
	 *
	 */
	public void gr_act_qty(float value) {
		setConstNumber(offset + 26, $gr_act_qty, value);
	}

	/**
	 * GR result qty. 入庫実績数量.<p>
	 *
	 */
	public void gr_act_qty(double value) {
		setConstNumber(offset + 26, $gr_act_qty, value);
	}


	/**
	 * GI result qty. 出庫実績数量.<p>
	 *
	 */
	public MCNumber gi_act_qty() {
		return getConstNumber(offset + 27, $gi_act_qty);
	}

	/**
	 * GI result qty. 出庫実績数量.<p>
	 *
	 */
	public void gi_act_qty(MCNumber value) {
		setConstNumber(offset + 27, $gi_act_qty, value);
	}

	/**
	 * GI result qty. 出庫実績数量.<p>
	 *
	 */
	public void gi_act_qty(int value) {
		setConstNumber(offset + 27, $gi_act_qty, value);
	}

	/**
	 * GI result qty. 出庫実績数量.<p>
	 *
	 */
	public void gi_act_qty(long value) {
		setConstNumber(offset + 27, $gi_act_qty, value);
	}

	/**
	 * GI result qty. 出庫実績数量.<p>
	 *
	 */
	public void gi_act_qty(float value) {
		setConstNumber(offset + 27, $gi_act_qty, value);
	}

	/**
	 * GI result qty. 出庫実績数量.<p>
	 *
	 */
	public void gi_act_qty(double value) {
		setConstNumber(offset + 27, $gi_act_qty, value);
	}


	/**
	 * Inventory qty. 在庫数量.<p>
	 *
	 */
	public MCNumber stk_qty() {
		return getConstNumber(offset + 28, $stk_qty);
	}

	/**
	 * Inventory qty. 在庫数量.<p>
	 *
	 */
	public void stk_qty(MCNumber value) {
		setConstNumber(offset + 28, $stk_qty, value);
	}

	/**
	 * Inventory qty. 在庫数量.<p>
	 *
	 */
	public void stk_qty(int value) {
		setConstNumber(offset + 28, $stk_qty, value);
	}

	/**
	 * Inventory qty. 在庫数量.<p>
	 *
	 */
	public void stk_qty(long value) {
		setConstNumber(offset + 28, $stk_qty, value);
	}

	/**
	 * Inventory qty. 在庫数量.<p>
	 *
	 */
	public void stk_qty(float value) {
		setConstNumber(offset + 28, $stk_qty, value);
	}

	/**
	 * Inventory qty. 在庫数量.<p>
	 *
	 */
	public void stk_qty(double value) {
		setConstNumber(offset + 28, $stk_qty, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 29, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 29, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 30, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 30, $base_unit_nm, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 31, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 31, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 31, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 31, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 31, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 31, $base_unit_dec_place, value);
	}


	/**
	 * Inventory amount 在庫金額.<p>
	 *
	 */
	public MCNumber stk_amt() {
		return getConstNumber(offset + 32, $stk_amt);
	}

	/**
	 * Inventory amount 在庫金額.<p>
	 *
	 */
	public void stk_amt(MCNumber value) {
		setConstNumber(offset + 32, $stk_amt, value);
	}

	/**
	 * Inventory amount 在庫金額.<p>
	 *
	 */
	public void stk_amt(int value) {
		setConstNumber(offset + 32, $stk_amt, value);
	}

	/**
	 * Inventory amount 在庫金額.<p>
	 *
	 */
	public void stk_amt(long value) {
		setConstNumber(offset + 32, $stk_amt, value);
	}

	/**
	 * Inventory amount 在庫金額.<p>
	 *
	 */
	public void stk_amt(float value) {
		setConstNumber(offset + 32, $stk_amt, value);
	}

	/**
	 * Inventory amount 在庫金額.<p>
	 *
	 */
	public void stk_amt(double value) {
		setConstNumber(offset + 32, $stk_amt, value);
	}


	/**
	 * Long LT order 先行手配.<p>
	 *
	 */
	public boolean prcd_flg() {
		return getConstBoolean(offset + 33, $prcd_flg);
	}

	/**
	 * Long LT order 先行手配.<p>
	 *
	 */
	public void prcd_flg(boolean value) {
		setConstBoolean(offset + 33, $prcd_flg, value);
	}


	/**
	 * Simulation シミュレーション.<p>
	 *
	 */
	public boolean sim_flg() {
		return getConstBoolean(offset + 34, $sim_flg);
	}

	/**
	 * Simulation シミュレーション.<p>
	 *
	 */
	public void sim_flg(boolean value) {
		setConstBoolean(offset + 34, $sim_flg, value);
	}


	public String getString(String name) {
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
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			return lg_grp_nm();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			return alloc_grp_nm();
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			return loc_grp_cd();
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			return loc_grp_nm();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($gr_schd_qty.equalsIgnoreCase(name)) {
			return gr_schd_qty();
		}
		if ($gi_schd_qty.equalsIgnoreCase(name)) {
			return gi_schd_qty();
		}
		if ($gr_act_qty.equalsIgnoreCase(name)) {
			return gr_act_qty();
		}
		if ($gi_act_qty.equalsIgnoreCase(name)) {
			return gi_act_qty();
		}
		if ($stk_qty.equalsIgnoreCase(name)) {
			return stk_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($stk_amt.equalsIgnoreCase(name)) {
			return stk_amt();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($dt.equalsIgnoreCase(name)) {
			return dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		if ($prcd_flg.equalsIgnoreCase(name)) {
			return prcd_flg();
		}
		if ($sim_flg.equalsIgnoreCase(name)) {
			return sim_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
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
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			return lg_grp_nm();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			return alloc_grp_nm();
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			return loc_grp_cd();
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			return loc_grp_nm();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($gr_schd_qty.equalsIgnoreCase(name)) {
			return gr_schd_qty();
		}
		if ($gi_schd_qty.equalsIgnoreCase(name)) {
			return gi_schd_qty();
		}
		if ($gr_act_qty.equalsIgnoreCase(name)) {
			return gr_act_qty();
		}
		if ($gi_act_qty.equalsIgnoreCase(name)) {
			return gi_act_qty();
		}
		if ($stk_qty.equalsIgnoreCase(name)) {
			return stk_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($stk_amt.equalsIgnoreCase(name)) {
			return stk_amt();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($dt.equalsIgnoreCase(name)) {
			return dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		if ($prcd_flg.equalsIgnoreCase(name)) {
			return prcd_flg();
		}
		if ($sim_flg.equalsIgnoreCase(name)) {
			return sim_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
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
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
			return;
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			lg_grp_nm(value);
			return;
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			alloc_grp_cd(value);
			return;
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			alloc_grp_nm(value);
			return;
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			loc_grp_cd(value);
			return;
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			loc_grp_nm(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($gr_schd_qty.equalsIgnoreCase(name)) {
			gr_schd_qty(value);
			return;
		}
		if ($gi_schd_qty.equalsIgnoreCase(name)) {
			gi_schd_qty(value);
			return;
		}
		if ($gr_act_qty.equalsIgnoreCase(name)) {
			gr_act_qty(value);
			return;
		}
		if ($gi_act_qty.equalsIgnoreCase(name)) {
			gi_act_qty(value);
			return;
		}
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($stk_amt.equalsIgnoreCase(name)) {
			stk_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($gr_schd_qty.equalsIgnoreCase(name)) {
			gr_schd_qty(value);
			return;
		}
		if ($gi_schd_qty.equalsIgnoreCase(name)) {
			gi_schd_qty(value);
			return;
		}
		if ($gr_act_qty.equalsIgnoreCase(name)) {
			gr_act_qty(value);
			return;
		}
		if ($gi_act_qty.equalsIgnoreCase(name)) {
			gi_act_qty(value);
			return;
		}
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($stk_amt.equalsIgnoreCase(name)) {
			stk_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($gr_schd_qty.equalsIgnoreCase(name)) {
			gr_schd_qty(value);
			return;
		}
		if ($gi_schd_qty.equalsIgnoreCase(name)) {
			gi_schd_qty(value);
			return;
		}
		if ($gr_act_qty.equalsIgnoreCase(name)) {
			gr_act_qty(value);
			return;
		}
		if ($gi_act_qty.equalsIgnoreCase(name)) {
			gi_act_qty(value);
			return;
		}
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($stk_amt.equalsIgnoreCase(name)) {
			stk_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($gr_schd_qty.equalsIgnoreCase(name)) {
			gr_schd_qty(value);
			return;
		}
		if ($gi_schd_qty.equalsIgnoreCase(name)) {
			gi_schd_qty(value);
			return;
		}
		if ($gr_act_qty.equalsIgnoreCase(name)) {
			gr_act_qty(value);
			return;
		}
		if ($gi_act_qty.equalsIgnoreCase(name)) {
			gi_act_qty(value);
			return;
		}
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($stk_amt.equalsIgnoreCase(name)) {
			stk_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($gr_schd_qty.equalsIgnoreCase(name)) {
			gr_schd_qty(value);
			return;
		}
		if ($gi_schd_qty.equalsIgnoreCase(name)) {
			gi_schd_qty(value);
			return;
		}
		if ($gr_act_qty.equalsIgnoreCase(name)) {
			gr_act_qty(value);
			return;
		}
		if ($gi_act_qty.equalsIgnoreCase(name)) {
			gi_act_qty(value);
			return;
		}
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($stk_amt.equalsIgnoreCase(name)) {
			stk_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($dt.equalsIgnoreCase(name)) {
			dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		if ($prcd_flg.equalsIgnoreCase(name)) {
			prcd_flg(value);
			return;
		}
		if ($sim_flg.equalsIgnoreCase(name)) {
			sim_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
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
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
			return;
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			lg_grp_nm(value);
			return;
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			alloc_grp_cd(value);
			return;
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			alloc_grp_nm(value);
			return;
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			loc_grp_cd(value);
			return;
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			loc_grp_nm(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($gr_schd_qty.equalsIgnoreCase(name)) {
			gr_schd_qty(value);
			return;
		}
		if ($gi_schd_qty.equalsIgnoreCase(name)) {
			gi_schd_qty(value);
			return;
		}
		if ($gr_act_qty.equalsIgnoreCase(name)) {
			gr_act_qty(value);
			return;
		}
		if ($gi_act_qty.equalsIgnoreCase(name)) {
			gi_act_qty(value);
			return;
		}
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($stk_amt.equalsIgnoreCase(name)) {
			stk_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($gr_schd_qty.equalsIgnoreCase(name)) {
			gr_schd_qty(value);
			return;
		}
		if ($gi_schd_qty.equalsIgnoreCase(name)) {
			gi_schd_qty(value);
			return;
		}
		if ($gr_act_qty.equalsIgnoreCase(name)) {
			gr_act_qty(value);
			return;
		}
		if ($gi_act_qty.equalsIgnoreCase(name)) {
			gi_act_qty(value);
			return;
		}
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($stk_amt.equalsIgnoreCase(name)) {
			stk_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($gr_schd_qty.equalsIgnoreCase(name)) {
			gr_schd_qty(value);
			return;
		}
		if ($gi_schd_qty.equalsIgnoreCase(name)) {
			gi_schd_qty(value);
			return;
		}
		if ($gr_act_qty.equalsIgnoreCase(name)) {
			gr_act_qty(value);
			return;
		}
		if ($gi_act_qty.equalsIgnoreCase(name)) {
			gi_act_qty(value);
			return;
		}
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($stk_amt.equalsIgnoreCase(name)) {
			stk_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($gr_schd_qty.equalsIgnoreCase(name)) {
			gr_schd_qty(value);
			return;
		}
		if ($gi_schd_qty.equalsIgnoreCase(name)) {
			gi_schd_qty(value);
			return;
		}
		if ($gr_act_qty.equalsIgnoreCase(name)) {
			gr_act_qty(value);
			return;
		}
		if ($gi_act_qty.equalsIgnoreCase(name)) {
			gi_act_qty(value);
			return;
		}
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($stk_amt.equalsIgnoreCase(name)) {
			stk_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($gr_schd_qty.equalsIgnoreCase(name)) {
			gr_schd_qty(value);
			return;
		}
		if ($gi_schd_qty.equalsIgnoreCase(name)) {
			gi_schd_qty(value);
			return;
		}
		if ($gr_act_qty.equalsIgnoreCase(name)) {
			gr_act_qty(value);
			return;
		}
		if ($gi_act_qty.equalsIgnoreCase(name)) {
			gi_act_qty(value);
			return;
		}
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($stk_amt.equalsIgnoreCase(name)) {
			stk_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($dt.equalsIgnoreCase(name)) {
			dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		if ($prcd_flg.equalsIgnoreCase(name)) {
			prcd_flg(value);
			return;
		}
		if ($sim_flg.equalsIgnoreCase(name)) {
			sim_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

