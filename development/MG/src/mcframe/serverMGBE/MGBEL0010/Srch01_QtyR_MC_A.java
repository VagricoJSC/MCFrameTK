package mcframe.serverMGBE.MGBEL0010;

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
 * ブロック"Srch01_Qty"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_QtyR_MC_A extends MCConstRow {

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
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
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	/**
	 * Quantity 数量.<p>
	 *
	 */
	public static final String $qty = "qty";
	/**
	 * Factory/Distribution warehouse master (Dummy for join) 工場・物流倉庫マスタ（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_site = "dummy_site";
	/**
	 * Country master (Supplier) (Dummy for join) 国マスタ（発注先）（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_sppl_cntry = "dummy_sppl_cntry";
	/**
	 * Region master (Supplier) (Dummy for join) 地域マスタ（発注先）（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_sppl_area = "dummy_sppl_area";
	/**
	 * Item classification master 1 (Dummy for join) 品目分類マスタ１（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp1 = "dummy_itm_grp1";
	/**
	 * Item classification master 2 (Dummy for join) 品目分類マスタ２（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp2 = "dummy_itm_grp2";
	/**
	 * Item classification master 3 (Dummy for join) 品目分類マスタ３（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp3 = "dummy_itm_grp3";
	/**
	 * Item classification master 4 (Dummy for join) 品目分類マスタ４（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp4 = "dummy_itm_grp4";
	/**
	 * Item classification master 5 (Dummy for join) 品目分類マスタ５（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp5 = "dummy_itm_grp5";
	/**
	 * Item classification master 6 (Dummy for join) 品目分類マスタ６（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp6 = "dummy_itm_grp6";
	/**
	 * Item classification master 7 (Dummy for join) 品目分類マスタ７（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp7 = "dummy_itm_grp7";
	/**
	 * Item classification master 8 (Dummy for join) 品目分類マスタ８（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp8 = "dummy_itm_grp8";
	/**
	 * Item classification master 9 (Dummy for join) 品目分類マスタ９（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp9 = "dummy_itm_grp9";
	/**
	 * Item classification master 10 (Dummy for join) 品目分類マスタ１０（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp10 = "dummy_itm_grp10";
	/**
	 * BP classification master 1 (Supplier) (Dummy for join) 取引先分類マスタ１（発注先）（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_sppl_grp1 = "dummy_sppl_grp1";
	/**
	 * BP classification master 2 (Supplier) (Dummy for join) 取引先分類マスタ２（発注先）（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_sppl_grp2 = "dummy_sppl_grp2";
	/**
	 * BP classification master 3 (Supplier) (Dummy for join) 取引先分類マスタ３（発注先）（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_sppl_grp3 = "dummy_sppl_grp3";
	/**
	 * BP classification master 4 (Supplier) (Dummy for join) 取引先分類マスタ４（発注先）（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_sppl_grp4 = "dummy_sppl_grp4";
	/**
	 * BP classification master 5 (Supplier) (Dummy for join) 取引先分類マスタ５（発注先）（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_sppl_grp5 = "dummy_sppl_grp5";
	/**
	 * BP classification master 6 (Supplier) (Dummy for join) 取引先分類マスタ６（発注先）（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_sppl_grp6 = "dummy_sppl_grp6";
	/**
	 * BP classification master 7 (Supplier) (Dummy for join) 取引先分類マスタ７（発注先）（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_sppl_grp7 = "dummy_sppl_grp7";
	/**
	 * BP classification master 8 (Supplier) (Dummy for join) 取引先分類マスタ８（発注先）（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_sppl_grp8 = "dummy_sppl_grp8";
	/**
	 * BP classification master 9 (Supplier) (Dummy for join) 取引先分類マスタ９（発注先）（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_sppl_grp9 = "dummy_sppl_grp9";
	/**
	 * BP classification master 10 (Supplier) (Dummy for join) 取引先分類マスタ１０（発注先）（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_sppl_grp10 = "dummy_sppl_grp10";
	/**
	 * Dummy for adding search criteria in parent item specification 親品目指定時検索条件追加用ダミー.<p>
	 *
	 */
	public static final String $dummy_parent_flg = "dummy_parent_flg";
	/**
	 * Dummy for adding search criteria in child item specification 子品目指定時検索条件追加用ダミー.<p>
	 *
	 */
	public static final String $dummy_child_flg = "dummy_child_flg";


	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta qty_META = createCommonMeta($qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta dummy_site_META = createCommonMeta($dummy_site, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta dummy_sppl_cntry_META = createCommonMeta($dummy_sppl_cntry, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta dummy_sppl_area_META = createCommonMeta($dummy_sppl_area, mcframe.commonMA.meta.MA_META.AREA_CD);
	public static final MCMeta dummy_itm_grp1_META = createCommonMeta($dummy_itm_grp1, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_itm_grp2_META = createCommonMeta($dummy_itm_grp2, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_itm_grp3_META = createCommonMeta($dummy_itm_grp3, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_itm_grp4_META = createCommonMeta($dummy_itm_grp4, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_itm_grp5_META = createCommonMeta($dummy_itm_grp5, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_itm_grp6_META = createCommonMeta($dummy_itm_grp6, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_itm_grp7_META = createCommonMeta($dummy_itm_grp7, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_itm_grp8_META = createCommonMeta($dummy_itm_grp8, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_itm_grp9_META = createCommonMeta($dummy_itm_grp9, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_itm_grp10_META = createCommonMeta($dummy_itm_grp10, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_sppl_grp1_META = createCommonMeta($dummy_sppl_grp1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dummy_sppl_grp2_META = createCommonMeta($dummy_sppl_grp2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dummy_sppl_grp3_META = createCommonMeta($dummy_sppl_grp3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dummy_sppl_grp4_META = createCommonMeta($dummy_sppl_grp4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dummy_sppl_grp5_META = createCommonMeta($dummy_sppl_grp5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dummy_sppl_grp6_META = createCommonMeta($dummy_sppl_grp6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dummy_sppl_grp7_META = createCommonMeta($dummy_sppl_grp7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dummy_sppl_grp8_META = createCommonMeta($dummy_sppl_grp8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dummy_sppl_grp9_META = createCommonMeta($dummy_sppl_grp9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dummy_sppl_grp10_META = createCommonMeta($dummy_sppl_grp10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dummy_parent_flg_META = createCommonMeta($dummy_parent_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dummy_child_flg_META = createCommonMeta($dummy_child_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Srch01_QtyR> constMetas = new ConstMetaList<Srch01_QtyR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			wg_cd_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			loc_cd_META,
			sppl_cd_META,
			qty_META,
			dummy_site_META,
			dummy_sppl_cntry_META,
			dummy_sppl_area_META,
			dummy_itm_grp1_META,
			dummy_itm_grp2_META,
			dummy_itm_grp3_META,
			dummy_itm_grp4_META,
			dummy_itm_grp5_META,
			dummy_itm_grp6_META,
			dummy_itm_grp7_META,
			dummy_itm_grp8_META,
			dummy_itm_grp9_META,
			dummy_itm_grp10_META,
			dummy_sppl_grp1_META,
			dummy_sppl_grp2_META,
			dummy_sppl_grp3_META,
			dummy_sppl_grp4_META,
			dummy_sppl_grp5_META,
			dummy_sppl_grp6_META,
			dummy_sppl_grp7_META,
			dummy_sppl_grp8_META,
			dummy_sppl_grp9_META,
			dummy_sppl_grp10_META,
			dummy_parent_flg_META,
			dummy_child_flg_META
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
	/** 項目属性情報のグループ[FLG_COL]のキー定数 */
	public static final String $$FLG_COL = "FLG_COL";
	/** 項目属性情報のグループ[COL_SQL]のキー定数 */
	public static final String $$COL_SQL = "COL_SQL";
	/** 項目属性情報のグループ[SUM_SQL]のキー定数 */
	public static final String $$SUM_SQL = "SUM_SQL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$FLG_COL, new MCExtList(
			new String[][]{
				{$loc_cd, "loc_flg"},	// loc_cd
				{$sppl_cd, "sppl_flg"}	// sppl_cd
			}
		)),
		new MCExtMap.Entry($$COL_SQL, new MCExtList(
			new String[][]{
				{$wg_cd, "T.WG_CD"},	// wg_cd
				{$itm_cd, "T.ITM_CD"},	// itm_cd
				{$itm_sub1, "T.ITM_SUB1"},	// itm_sub1
				{$itm_sub2, "T.ITM_SUB2"},	// itm_sub2
				{$itm_sub3, "T.ITM_SUB3"},	// itm_sub3
				{$loc_cd, "T.LOC_CD"},	// loc_cd
				{$sppl_cd, "T.SPPL_CD"}	// sppl_cd
			}
		)),
		new MCExtMap.Entry($$SUM_SQL, new MCExtList(
			new String[][]{
				{$qty, "SUM(T.qty)"}	// qty
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
	protected Srch01_QtyR_MC_A(ConstMetaList<? extends Srch01_QtyR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_QtyR clone() {
		return (Srch01_QtyR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_QtyR createInstance() {
		return (Srch01_QtyR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_QtyR getValues(String... names) {
		return (Srch01_QtyR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 0, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 0, $wg_cd, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 1, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 1, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 2, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 2, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 3, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 3, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 4, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 4, $itm_sub3, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 5, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 5, $loc_cd, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 6, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 6, $sppl_cd, value);
	}


	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber qty() {
		return getConstNumber(offset + 7, $qty);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(MCNumber value) {
		setConstNumber(offset + 7, $qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(int value) {
		setConstNumber(offset + 7, $qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(long value) {
		setConstNumber(offset + 7, $qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(float value) {
		setConstNumber(offset + 7, $qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(double value) {
		setConstNumber(offset + 7, $qty, value);
	}


	/**
	 * Factory/Distribution warehouse master (Dummy for join) 工場・物流倉庫マスタ（結合用ダミー）.<p>
	 *
	 */
	public String dummy_site() {
		return getConstString(offset + 8, $dummy_site);
	}

	/**
	 * Factory/Distribution warehouse master (Dummy for join) 工場・物流倉庫マスタ（結合用ダミー）.<p>
	 *
	 */
	public void dummy_site(String value) {
		setConstString(offset + 8, $dummy_site, value);
	}


	/**
	 * Country master (Supplier) (Dummy for join) 国マスタ（発注先）（結合用ダミー）.<p>
	 *
	 */
	public String dummy_sppl_cntry() {
		return getConstString(offset + 9, $dummy_sppl_cntry);
	}

	/**
	 * Country master (Supplier) (Dummy for join) 国マスタ（発注先）（結合用ダミー）.<p>
	 *
	 */
	public void dummy_sppl_cntry(String value) {
		setConstString(offset + 9, $dummy_sppl_cntry, value);
	}


	/**
	 * Region master (Supplier) (Dummy for join) 地域マスタ（発注先）（結合用ダミー）.<p>
	 *
	 */
	public String dummy_sppl_area() {
		return getConstString(offset + 10, $dummy_sppl_area);
	}

	/**
	 * Region master (Supplier) (Dummy for join) 地域マスタ（発注先）（結合用ダミー）.<p>
	 *
	 */
	public void dummy_sppl_area(String value) {
		setConstString(offset + 10, $dummy_sppl_area, value);
	}


	/**
	 * Item classification master 1 (Dummy for join) 品目分類マスタ１（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp1() {
		return getConstString(offset + 11, $dummy_itm_grp1);
	}

	/**
	 * Item classification master 1 (Dummy for join) 品目分類マスタ１（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp1(String value) {
		setConstString(offset + 11, $dummy_itm_grp1, value);
	}


	/**
	 * Item classification master 2 (Dummy for join) 品目分類マスタ２（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp2() {
		return getConstString(offset + 12, $dummy_itm_grp2);
	}

	/**
	 * Item classification master 2 (Dummy for join) 品目分類マスタ２（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp2(String value) {
		setConstString(offset + 12, $dummy_itm_grp2, value);
	}


	/**
	 * Item classification master 3 (Dummy for join) 品目分類マスタ３（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp3() {
		return getConstString(offset + 13, $dummy_itm_grp3);
	}

	/**
	 * Item classification master 3 (Dummy for join) 品目分類マスタ３（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp3(String value) {
		setConstString(offset + 13, $dummy_itm_grp3, value);
	}


	/**
	 * Item classification master 4 (Dummy for join) 品目分類マスタ４（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp4() {
		return getConstString(offset + 14, $dummy_itm_grp4);
	}

	/**
	 * Item classification master 4 (Dummy for join) 品目分類マスタ４（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp4(String value) {
		setConstString(offset + 14, $dummy_itm_grp4, value);
	}


	/**
	 * Item classification master 5 (Dummy for join) 品目分類マスタ５（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp5() {
		return getConstString(offset + 15, $dummy_itm_grp5);
	}

	/**
	 * Item classification master 5 (Dummy for join) 品目分類マスタ５（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp5(String value) {
		setConstString(offset + 15, $dummy_itm_grp5, value);
	}


	/**
	 * Item classification master 6 (Dummy for join) 品目分類マスタ６（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp6() {
		return getConstString(offset + 16, $dummy_itm_grp6);
	}

	/**
	 * Item classification master 6 (Dummy for join) 品目分類マスタ６（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp6(String value) {
		setConstString(offset + 16, $dummy_itm_grp6, value);
	}


	/**
	 * Item classification master 7 (Dummy for join) 品目分類マスタ７（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp7() {
		return getConstString(offset + 17, $dummy_itm_grp7);
	}

	/**
	 * Item classification master 7 (Dummy for join) 品目分類マスタ７（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp7(String value) {
		setConstString(offset + 17, $dummy_itm_grp7, value);
	}


	/**
	 * Item classification master 8 (Dummy for join) 品目分類マスタ８（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp8() {
		return getConstString(offset + 18, $dummy_itm_grp8);
	}

	/**
	 * Item classification master 8 (Dummy for join) 品目分類マスタ８（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp8(String value) {
		setConstString(offset + 18, $dummy_itm_grp8, value);
	}


	/**
	 * Item classification master 9 (Dummy for join) 品目分類マスタ９（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp9() {
		return getConstString(offset + 19, $dummy_itm_grp9);
	}

	/**
	 * Item classification master 9 (Dummy for join) 品目分類マスタ９（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp9(String value) {
		setConstString(offset + 19, $dummy_itm_grp9, value);
	}


	/**
	 * Item classification master 10 (Dummy for join) 品目分類マスタ１０（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp10() {
		return getConstString(offset + 20, $dummy_itm_grp10);
	}

	/**
	 * Item classification master 10 (Dummy for join) 品目分類マスタ１０（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp10(String value) {
		setConstString(offset + 20, $dummy_itm_grp10, value);
	}


	/**
	 * BP classification master 1 (Supplier) (Dummy for join) 取引先分類マスタ１（発注先）（結合用ダミー）.<p>
	 *
	 */
	public String dummy_sppl_grp1() {
		return getConstString(offset + 21, $dummy_sppl_grp1);
	}

	/**
	 * BP classification master 1 (Supplier) (Dummy for join) 取引先分類マスタ１（発注先）（結合用ダミー）.<p>
	 *
	 */
	public void dummy_sppl_grp1(String value) {
		setConstString(offset + 21, $dummy_sppl_grp1, value);
	}


	/**
	 * BP classification master 2 (Supplier) (Dummy for join) 取引先分類マスタ２（発注先）（結合用ダミー）.<p>
	 *
	 */
	public String dummy_sppl_grp2() {
		return getConstString(offset + 22, $dummy_sppl_grp2);
	}

	/**
	 * BP classification master 2 (Supplier) (Dummy for join) 取引先分類マスタ２（発注先）（結合用ダミー）.<p>
	 *
	 */
	public void dummy_sppl_grp2(String value) {
		setConstString(offset + 22, $dummy_sppl_grp2, value);
	}


	/**
	 * BP classification master 3 (Supplier) (Dummy for join) 取引先分類マスタ３（発注先）（結合用ダミー）.<p>
	 *
	 */
	public String dummy_sppl_grp3() {
		return getConstString(offset + 23, $dummy_sppl_grp3);
	}

	/**
	 * BP classification master 3 (Supplier) (Dummy for join) 取引先分類マスタ３（発注先）（結合用ダミー）.<p>
	 *
	 */
	public void dummy_sppl_grp3(String value) {
		setConstString(offset + 23, $dummy_sppl_grp3, value);
	}


	/**
	 * BP classification master 4 (Supplier) (Dummy for join) 取引先分類マスタ４（発注先）（結合用ダミー）.<p>
	 *
	 */
	public String dummy_sppl_grp4() {
		return getConstString(offset + 24, $dummy_sppl_grp4);
	}

	/**
	 * BP classification master 4 (Supplier) (Dummy for join) 取引先分類マスタ４（発注先）（結合用ダミー）.<p>
	 *
	 */
	public void dummy_sppl_grp4(String value) {
		setConstString(offset + 24, $dummy_sppl_grp4, value);
	}


	/**
	 * BP classification master 5 (Supplier) (Dummy for join) 取引先分類マスタ５（発注先）（結合用ダミー）.<p>
	 *
	 */
	public String dummy_sppl_grp5() {
		return getConstString(offset + 25, $dummy_sppl_grp5);
	}

	/**
	 * BP classification master 5 (Supplier) (Dummy for join) 取引先分類マスタ５（発注先）（結合用ダミー）.<p>
	 *
	 */
	public void dummy_sppl_grp5(String value) {
		setConstString(offset + 25, $dummy_sppl_grp5, value);
	}


	/**
	 * BP classification master 6 (Supplier) (Dummy for join) 取引先分類マスタ６（発注先）（結合用ダミー）.<p>
	 *
	 */
	public String dummy_sppl_grp6() {
		return getConstString(offset + 26, $dummy_sppl_grp6);
	}

	/**
	 * BP classification master 6 (Supplier) (Dummy for join) 取引先分類マスタ６（発注先）（結合用ダミー）.<p>
	 *
	 */
	public void dummy_sppl_grp6(String value) {
		setConstString(offset + 26, $dummy_sppl_grp6, value);
	}


	/**
	 * BP classification master 7 (Supplier) (Dummy for join) 取引先分類マスタ７（発注先）（結合用ダミー）.<p>
	 *
	 */
	public String dummy_sppl_grp7() {
		return getConstString(offset + 27, $dummy_sppl_grp7);
	}

	/**
	 * BP classification master 7 (Supplier) (Dummy for join) 取引先分類マスタ７（発注先）（結合用ダミー）.<p>
	 *
	 */
	public void dummy_sppl_grp7(String value) {
		setConstString(offset + 27, $dummy_sppl_grp7, value);
	}


	/**
	 * BP classification master 8 (Supplier) (Dummy for join) 取引先分類マスタ８（発注先）（結合用ダミー）.<p>
	 *
	 */
	public String dummy_sppl_grp8() {
		return getConstString(offset + 28, $dummy_sppl_grp8);
	}

	/**
	 * BP classification master 8 (Supplier) (Dummy for join) 取引先分類マスタ８（発注先）（結合用ダミー）.<p>
	 *
	 */
	public void dummy_sppl_grp8(String value) {
		setConstString(offset + 28, $dummy_sppl_grp8, value);
	}


	/**
	 * BP classification master 9 (Supplier) (Dummy for join) 取引先分類マスタ９（発注先）（結合用ダミー）.<p>
	 *
	 */
	public String dummy_sppl_grp9() {
		return getConstString(offset + 29, $dummy_sppl_grp9);
	}

	/**
	 * BP classification master 9 (Supplier) (Dummy for join) 取引先分類マスタ９（発注先）（結合用ダミー）.<p>
	 *
	 */
	public void dummy_sppl_grp9(String value) {
		setConstString(offset + 29, $dummy_sppl_grp9, value);
	}


	/**
	 * BP classification master 10 (Supplier) (Dummy for join) 取引先分類マスタ１０（発注先）（結合用ダミー）.<p>
	 *
	 */
	public String dummy_sppl_grp10() {
		return getConstString(offset + 30, $dummy_sppl_grp10);
	}

	/**
	 * BP classification master 10 (Supplier) (Dummy for join) 取引先分類マスタ１０（発注先）（結合用ダミー）.<p>
	 *
	 */
	public void dummy_sppl_grp10(String value) {
		setConstString(offset + 30, $dummy_sppl_grp10, value);
	}


	/**
	 * Dummy for adding search criteria in parent item specification 親品目指定時検索条件追加用ダミー.<p>
	 *
	 */
	public boolean dummy_parent_flg() {
		return getConstBoolean(offset + 31, $dummy_parent_flg);
	}

	/**
	 * Dummy for adding search criteria in parent item specification 親品目指定時検索条件追加用ダミー.<p>
	 *
	 */
	public void dummy_parent_flg(boolean value) {
		setConstBoolean(offset + 31, $dummy_parent_flg, value);
	}


	/**
	 * Dummy for adding search criteria in child item specification 子品目指定時検索条件追加用ダミー.<p>
	 *
	 */
	public boolean dummy_child_flg() {
		return getConstBoolean(offset + 32, $dummy_child_flg);
	}

	/**
	 * Dummy for adding search criteria in child item specification 子品目指定時検索条件追加用ダミー.<p>
	 *
	 */
	public void dummy_child_flg(boolean value) {
		setConstBoolean(offset + 32, $dummy_child_flg, value);
	}


	public String getString(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($dummy_site.equalsIgnoreCase(name)) {
			return dummy_site();
		}
		if ($dummy_sppl_cntry.equalsIgnoreCase(name)) {
			return dummy_sppl_cntry();
		}
		if ($dummy_sppl_area.equalsIgnoreCase(name)) {
			return dummy_sppl_area();
		}
		if ($dummy_itm_grp1.equalsIgnoreCase(name)) {
			return dummy_itm_grp1();
		}
		if ($dummy_itm_grp2.equalsIgnoreCase(name)) {
			return dummy_itm_grp2();
		}
		if ($dummy_itm_grp3.equalsIgnoreCase(name)) {
			return dummy_itm_grp3();
		}
		if ($dummy_itm_grp4.equalsIgnoreCase(name)) {
			return dummy_itm_grp4();
		}
		if ($dummy_itm_grp5.equalsIgnoreCase(name)) {
			return dummy_itm_grp5();
		}
		if ($dummy_itm_grp6.equalsIgnoreCase(name)) {
			return dummy_itm_grp6();
		}
		if ($dummy_itm_grp7.equalsIgnoreCase(name)) {
			return dummy_itm_grp7();
		}
		if ($dummy_itm_grp8.equalsIgnoreCase(name)) {
			return dummy_itm_grp8();
		}
		if ($dummy_itm_grp9.equalsIgnoreCase(name)) {
			return dummy_itm_grp9();
		}
		if ($dummy_itm_grp10.equalsIgnoreCase(name)) {
			return dummy_itm_grp10();
		}
		if ($dummy_sppl_grp1.equalsIgnoreCase(name)) {
			return dummy_sppl_grp1();
		}
		if ($dummy_sppl_grp2.equalsIgnoreCase(name)) {
			return dummy_sppl_grp2();
		}
		if ($dummy_sppl_grp3.equalsIgnoreCase(name)) {
			return dummy_sppl_grp3();
		}
		if ($dummy_sppl_grp4.equalsIgnoreCase(name)) {
			return dummy_sppl_grp4();
		}
		if ($dummy_sppl_grp5.equalsIgnoreCase(name)) {
			return dummy_sppl_grp5();
		}
		if ($dummy_sppl_grp6.equalsIgnoreCase(name)) {
			return dummy_sppl_grp6();
		}
		if ($dummy_sppl_grp7.equalsIgnoreCase(name)) {
			return dummy_sppl_grp7();
		}
		if ($dummy_sppl_grp8.equalsIgnoreCase(name)) {
			return dummy_sppl_grp8();
		}
		if ($dummy_sppl_grp9.equalsIgnoreCase(name)) {
			return dummy_sppl_grp9();
		}
		if ($dummy_sppl_grp10.equalsIgnoreCase(name)) {
			return dummy_sppl_grp10();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($qty.equalsIgnoreCase(name)) {
			return qty();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($dummy_parent_flg.equalsIgnoreCase(name)) {
			return dummy_parent_flg();
		}
		if ($dummy_child_flg.equalsIgnoreCase(name)) {
			return dummy_child_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($dummy_site.equalsIgnoreCase(name)) {
			return dummy_site();
		}
		if ($dummy_sppl_cntry.equalsIgnoreCase(name)) {
			return dummy_sppl_cntry();
		}
		if ($dummy_sppl_area.equalsIgnoreCase(name)) {
			return dummy_sppl_area();
		}
		if ($dummy_itm_grp1.equalsIgnoreCase(name)) {
			return dummy_itm_grp1();
		}
		if ($dummy_itm_grp2.equalsIgnoreCase(name)) {
			return dummy_itm_grp2();
		}
		if ($dummy_itm_grp3.equalsIgnoreCase(name)) {
			return dummy_itm_grp3();
		}
		if ($dummy_itm_grp4.equalsIgnoreCase(name)) {
			return dummy_itm_grp4();
		}
		if ($dummy_itm_grp5.equalsIgnoreCase(name)) {
			return dummy_itm_grp5();
		}
		if ($dummy_itm_grp6.equalsIgnoreCase(name)) {
			return dummy_itm_grp6();
		}
		if ($dummy_itm_grp7.equalsIgnoreCase(name)) {
			return dummy_itm_grp7();
		}
		if ($dummy_itm_grp8.equalsIgnoreCase(name)) {
			return dummy_itm_grp8();
		}
		if ($dummy_itm_grp9.equalsIgnoreCase(name)) {
			return dummy_itm_grp9();
		}
		if ($dummy_itm_grp10.equalsIgnoreCase(name)) {
			return dummy_itm_grp10();
		}
		if ($dummy_sppl_grp1.equalsIgnoreCase(name)) {
			return dummy_sppl_grp1();
		}
		if ($dummy_sppl_grp2.equalsIgnoreCase(name)) {
			return dummy_sppl_grp2();
		}
		if ($dummy_sppl_grp3.equalsIgnoreCase(name)) {
			return dummy_sppl_grp3();
		}
		if ($dummy_sppl_grp4.equalsIgnoreCase(name)) {
			return dummy_sppl_grp4();
		}
		if ($dummy_sppl_grp5.equalsIgnoreCase(name)) {
			return dummy_sppl_grp5();
		}
		if ($dummy_sppl_grp6.equalsIgnoreCase(name)) {
			return dummy_sppl_grp6();
		}
		if ($dummy_sppl_grp7.equalsIgnoreCase(name)) {
			return dummy_sppl_grp7();
		}
		if ($dummy_sppl_grp8.equalsIgnoreCase(name)) {
			return dummy_sppl_grp8();
		}
		if ($dummy_sppl_grp9.equalsIgnoreCase(name)) {
			return dummy_sppl_grp9();
		}
		if ($dummy_sppl_grp10.equalsIgnoreCase(name)) {
			return dummy_sppl_grp10();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($qty.equalsIgnoreCase(name)) {
			return qty();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($dummy_parent_flg.equalsIgnoreCase(name)) {
			return dummy_parent_flg();
		}
		if ($dummy_child_flg.equalsIgnoreCase(name)) {
			return dummy_child_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($dummy_site.equalsIgnoreCase(name)) {
			dummy_site(value);
			return;
		}
		if ($dummy_sppl_cntry.equalsIgnoreCase(name)) {
			dummy_sppl_cntry(value);
			return;
		}
		if ($dummy_sppl_area.equalsIgnoreCase(name)) {
			dummy_sppl_area(value);
			return;
		}
		if ($dummy_itm_grp1.equalsIgnoreCase(name)) {
			dummy_itm_grp1(value);
			return;
		}
		if ($dummy_itm_grp2.equalsIgnoreCase(name)) {
			dummy_itm_grp2(value);
			return;
		}
		if ($dummy_itm_grp3.equalsIgnoreCase(name)) {
			dummy_itm_grp3(value);
			return;
		}
		if ($dummy_itm_grp4.equalsIgnoreCase(name)) {
			dummy_itm_grp4(value);
			return;
		}
		if ($dummy_itm_grp5.equalsIgnoreCase(name)) {
			dummy_itm_grp5(value);
			return;
		}
		if ($dummy_itm_grp6.equalsIgnoreCase(name)) {
			dummy_itm_grp6(value);
			return;
		}
		if ($dummy_itm_grp7.equalsIgnoreCase(name)) {
			dummy_itm_grp7(value);
			return;
		}
		if ($dummy_itm_grp8.equalsIgnoreCase(name)) {
			dummy_itm_grp8(value);
			return;
		}
		if ($dummy_itm_grp9.equalsIgnoreCase(name)) {
			dummy_itm_grp9(value);
			return;
		}
		if ($dummy_itm_grp10.equalsIgnoreCase(name)) {
			dummy_itm_grp10(value);
			return;
		}
		if ($dummy_sppl_grp1.equalsIgnoreCase(name)) {
			dummy_sppl_grp1(value);
			return;
		}
		if ($dummy_sppl_grp2.equalsIgnoreCase(name)) {
			dummy_sppl_grp2(value);
			return;
		}
		if ($dummy_sppl_grp3.equalsIgnoreCase(name)) {
			dummy_sppl_grp3(value);
			return;
		}
		if ($dummy_sppl_grp4.equalsIgnoreCase(name)) {
			dummy_sppl_grp4(value);
			return;
		}
		if ($dummy_sppl_grp5.equalsIgnoreCase(name)) {
			dummy_sppl_grp5(value);
			return;
		}
		if ($dummy_sppl_grp6.equalsIgnoreCase(name)) {
			dummy_sppl_grp6(value);
			return;
		}
		if ($dummy_sppl_grp7.equalsIgnoreCase(name)) {
			dummy_sppl_grp7(value);
			return;
		}
		if ($dummy_sppl_grp8.equalsIgnoreCase(name)) {
			dummy_sppl_grp8(value);
			return;
		}
		if ($dummy_sppl_grp9.equalsIgnoreCase(name)) {
			dummy_sppl_grp9(value);
			return;
		}
		if ($dummy_sppl_grp10.equalsIgnoreCase(name)) {
			dummy_sppl_grp10(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($dummy_parent_flg.equalsIgnoreCase(name)) {
			dummy_parent_flg(value);
			return;
		}
		if ($dummy_child_flg.equalsIgnoreCase(name)) {
			dummy_child_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($dummy_site.equalsIgnoreCase(name)) {
			dummy_site(value);
			return;
		}
		if ($dummy_sppl_cntry.equalsIgnoreCase(name)) {
			dummy_sppl_cntry(value);
			return;
		}
		if ($dummy_sppl_area.equalsIgnoreCase(name)) {
			dummy_sppl_area(value);
			return;
		}
		if ($dummy_itm_grp1.equalsIgnoreCase(name)) {
			dummy_itm_grp1(value);
			return;
		}
		if ($dummy_itm_grp2.equalsIgnoreCase(name)) {
			dummy_itm_grp2(value);
			return;
		}
		if ($dummy_itm_grp3.equalsIgnoreCase(name)) {
			dummy_itm_grp3(value);
			return;
		}
		if ($dummy_itm_grp4.equalsIgnoreCase(name)) {
			dummy_itm_grp4(value);
			return;
		}
		if ($dummy_itm_grp5.equalsIgnoreCase(name)) {
			dummy_itm_grp5(value);
			return;
		}
		if ($dummy_itm_grp6.equalsIgnoreCase(name)) {
			dummy_itm_grp6(value);
			return;
		}
		if ($dummy_itm_grp7.equalsIgnoreCase(name)) {
			dummy_itm_grp7(value);
			return;
		}
		if ($dummy_itm_grp8.equalsIgnoreCase(name)) {
			dummy_itm_grp8(value);
			return;
		}
		if ($dummy_itm_grp9.equalsIgnoreCase(name)) {
			dummy_itm_grp9(value);
			return;
		}
		if ($dummy_itm_grp10.equalsIgnoreCase(name)) {
			dummy_itm_grp10(value);
			return;
		}
		if ($dummy_sppl_grp1.equalsIgnoreCase(name)) {
			dummy_sppl_grp1(value);
			return;
		}
		if ($dummy_sppl_grp2.equalsIgnoreCase(name)) {
			dummy_sppl_grp2(value);
			return;
		}
		if ($dummy_sppl_grp3.equalsIgnoreCase(name)) {
			dummy_sppl_grp3(value);
			return;
		}
		if ($dummy_sppl_grp4.equalsIgnoreCase(name)) {
			dummy_sppl_grp4(value);
			return;
		}
		if ($dummy_sppl_grp5.equalsIgnoreCase(name)) {
			dummy_sppl_grp5(value);
			return;
		}
		if ($dummy_sppl_grp6.equalsIgnoreCase(name)) {
			dummy_sppl_grp6(value);
			return;
		}
		if ($dummy_sppl_grp7.equalsIgnoreCase(name)) {
			dummy_sppl_grp7(value);
			return;
		}
		if ($dummy_sppl_grp8.equalsIgnoreCase(name)) {
			dummy_sppl_grp8(value);
			return;
		}
		if ($dummy_sppl_grp9.equalsIgnoreCase(name)) {
			dummy_sppl_grp9(value);
			return;
		}
		if ($dummy_sppl_grp10.equalsIgnoreCase(name)) {
			dummy_sppl_grp10(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($dummy_parent_flg.equalsIgnoreCase(name)) {
			dummy_parent_flg(value);
			return;
		}
		if ($dummy_child_flg.equalsIgnoreCase(name)) {
			dummy_child_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

