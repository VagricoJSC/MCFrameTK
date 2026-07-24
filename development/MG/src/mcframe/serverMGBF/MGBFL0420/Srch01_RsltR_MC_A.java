package mcframe.serverMGBF.MGBFL0420;

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
 * ブロック"Srch01_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_RsltR_MC_A extends MCConstRow {

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
	 * Supplier classification master 1 (Dummy for join) 発注先分類マスタ１（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_sppl_grp1 = "dummy_sppl_grp1";
	/**
	 * Sold-party classification master 2 (coupling dummy) 発注先分類マスタ２（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_sppl_grp2 = "dummy_sppl_grp2";
	/**
	 * Sold-party classification master 3 (coupling dummy) 発注先分類マスタ３（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_sppl_grp3 = "dummy_sppl_grp3";
	/**
	 * Sold-party classification master 4 (coupling dummy) 発注先分類マスタ４（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_sppl_grp4 = "dummy_sppl_grp4";
	/**
	 * Sold-party classification master 5 (coupling dummy) 発注先分類マスタ５（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_sppl_grp5 = "dummy_sppl_grp5";
	/**
	 * Sold-party classification master 6 (coupling dummy) 発注先分類マスタ６（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_sppl_grp6 = "dummy_sppl_grp6";
	/**
	 * Sold-party classification master 7 (coupling dummy) 発注先分類マスタ７（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_sppl_grp7 = "dummy_sppl_grp7";
	/**
	 * Sold-party classification master 8 (coupling dummy) 発注先分類マスタ８（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_sppl_grp8 = "dummy_sppl_grp8";
	/**
	 * Sold-party classification master 9 (coupling dummy) 発注先分類マスタ９（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_sppl_grp9 = "dummy_sppl_grp9";
	/**
	 * Sold-party classification master 10 (coupling dummy) 発注先分類マスタ１０（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_sppl_grp10 = "dummy_sppl_grp10";
	/**
	 * Country master (Dummy for join) 国マスタ（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_cntry = "dummy_cntry";
	/**
	 * Region master (Dummy for join) 地域マスタ（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_area = "dummy_area";
	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public static final String $calc_grp_cd = "calc_grp_cd";
	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public static final String $calc_grp_nm = "calc_grp_nm";
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
	 * Item type 品目区分.<p>
	 *
	 */
	public static final String $itm_typ = "itm_typ";
	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public static final String $itm_typ_nm = "itm_typ_nm";
	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public static final String $itm_typ_d_cd = "itm_typ_d_cd";
	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public static final String $itm_typ_d_nm = "itm_typ_d_nm";
	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public static final String $itm_jnl_cd = "itm_jnl_cd";
	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public static final String $itm_jnl_nm = "itm_jnl_nm";
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
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public static final String $sppl_nm = "sppl_nm";
	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public static final String $asst_typ = "asst_typ";
	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public static final String $asst_typ_nm = "asst_typ_nm";
	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public static final String $repurc_obli_flg = "repurc_obli_flg";
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public static final String $unit_cd = "unit_cd";
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public static final String $unit_nm = "unit_nm";
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public static final String $dec_place = "dec_place";
	/**
	 * Year month 年月.<p>
	 *
	 */
	public static final String $ym = "ym";
	/**
	 * Quantity 数量.<p>
	 *
	 */
	public static final String $std_qty = "std_qty";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $ave_upri = "ave_upri";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $std_upri = "std_upri";
	/**
	 * Amount (1 unit) 金額（１単位）.<p>
	 *
	 */
	public static final String $ave_upri_unit = "ave_upri_unit";
	/**
	 * Standard (1 unit) 標準（１単位）.<p>
	 *
	 */
	public static final String $std_upri_unit = "std_upri_unit";


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
	public static final MCMeta dummy_cntry_META = createCommonMeta($dummy_cntry, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta dummy_area_META = createCommonMeta($dummy_area, mcframe.commonMA.meta.MA_META.AREA_CD);
	public static final MCMeta calc_grp_cd_META = createCommonMeta($calc_grp_cd, mcframe.commonMA.meta.MA_META.CALC_GRP_CD);
	public static final MCMeta calc_grp_nm_META = createCommonMeta($calc_grp_nm, mcframe.commonMA.meta.MA_META.CALC_GRP_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta mng_dpt_cd_META = createCommonMeta($mng_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta mng_dpt_nm_META = createCommonMeta($mng_dpt_nm, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta itm_jnl_cd_META = createCommonMeta($itm_jnl_cd, mcframe.commonMA.meta.MA_META.ITM_JNL_CD);
	public static final MCMeta itm_jnl_nm_META = createCommonMeta($itm_jnl_nm, mcframe.commonMA.meta.MA_META.ITM_JNL_NM);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta asst_typ_META = createCommonMeta($asst_typ, mcframe.commonMA.meta.MA_META.ASST_TYP);
	public static final MCMeta asst_typ_nm_META = createCommonMeta($asst_typ_nm, mcframe.commonMA.meta.MA_META.ASST_TYP_NM);
	public static final MCMeta repurc_obli_flg_META = createCommonMeta($repurc_obli_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta unit_nm_META = createCommonMeta($unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta ym_META = createCommonMeta($ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta std_qty_META = createCommonMeta($std_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta ave_upri_META = createCommonMeta($ave_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_upri_META = createCommonMeta($std_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ave_upri_unit_META = createCommonMeta($ave_upri_unit, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_upri_unit_META = createCommonMeta($std_upri_unit, mcframe.commonMA.meta.MA_META.MONEY);

	protected static final ConstMetaList<Srch01_RsltR> constMetas = new ConstMetaList<Srch01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
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
			dummy_cntry_META,
			dummy_area_META,
			calc_grp_cd_META,
			calc_grp_nm_META,
			wg_cd_META,
			wg_nm_META,
			mng_dpt_cd_META,
			mng_dpt_nm_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			itm_jnl_cd_META,
			itm_jnl_nm_META,
			lot_no_META,
			sublot_no_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			sppl_cd_META,
			sppl_nm_META,
			asst_typ_META,
			asst_typ_nm_META,
			repurc_obli_flg_META,
			unit_cd_META,
			unit_nm_META,
			dec_place_META,
			ym_META,
			std_qty_META,
			ave_upri_META,
			std_upri_META,
			ave_upri_unit_META,
			std_upri_unit_META
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
				{$itm_typ, "MAC_ITM_TYP"},	// itm_typ
				{$asst_typ, "MAC_ASST_TYP"}	// asst_typ
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
	protected Srch01_RsltR_MC_A(ConstMetaList<? extends Srch01_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR clone() {
		return (Srch01_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR createInstance() {
		return (Srch01_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR getValues(String... names) {
		return (Srch01_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Item classification master 1 (Dummy for join) 品目分類マスタ１（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp1() {
		return getConstString(offset + 0, $dummy_itm_grp1);
	}

	/**
	 * Item classification master 1 (Dummy for join) 品目分類マスタ１（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp1(String value) {
		setConstString(offset + 0, $dummy_itm_grp1, value);
	}


	/**
	 * Item classification master 2 (Dummy for join) 品目分類マスタ２（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp2() {
		return getConstString(offset + 1, $dummy_itm_grp2);
	}

	/**
	 * Item classification master 2 (Dummy for join) 品目分類マスタ２（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp2(String value) {
		setConstString(offset + 1, $dummy_itm_grp2, value);
	}


	/**
	 * Item classification master 3 (Dummy for join) 品目分類マスタ３（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp3() {
		return getConstString(offset + 2, $dummy_itm_grp3);
	}

	/**
	 * Item classification master 3 (Dummy for join) 品目分類マスタ３（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp3(String value) {
		setConstString(offset + 2, $dummy_itm_grp3, value);
	}


	/**
	 * Item classification master 4 (Dummy for join) 品目分類マスタ４（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp4() {
		return getConstString(offset + 3, $dummy_itm_grp4);
	}

	/**
	 * Item classification master 4 (Dummy for join) 品目分類マスタ４（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp4(String value) {
		setConstString(offset + 3, $dummy_itm_grp4, value);
	}


	/**
	 * Item classification master 5 (Dummy for join) 品目分類マスタ５（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp5() {
		return getConstString(offset + 4, $dummy_itm_grp5);
	}

	/**
	 * Item classification master 5 (Dummy for join) 品目分類マスタ５（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp5(String value) {
		setConstString(offset + 4, $dummy_itm_grp5, value);
	}


	/**
	 * Item classification master 6 (Dummy for join) 品目分類マスタ６（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp6() {
		return getConstString(offset + 5, $dummy_itm_grp6);
	}

	/**
	 * Item classification master 6 (Dummy for join) 品目分類マスタ６（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp6(String value) {
		setConstString(offset + 5, $dummy_itm_grp6, value);
	}


	/**
	 * Item classification master 7 (Dummy for join) 品目分類マスタ７（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp7() {
		return getConstString(offset + 6, $dummy_itm_grp7);
	}

	/**
	 * Item classification master 7 (Dummy for join) 品目分類マスタ７（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp7(String value) {
		setConstString(offset + 6, $dummy_itm_grp7, value);
	}


	/**
	 * Item classification master 8 (Dummy for join) 品目分類マスタ８（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp8() {
		return getConstString(offset + 7, $dummy_itm_grp8);
	}

	/**
	 * Item classification master 8 (Dummy for join) 品目分類マスタ８（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp8(String value) {
		setConstString(offset + 7, $dummy_itm_grp8, value);
	}


	/**
	 * Item classification master 9 (Dummy for join) 品目分類マスタ９（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp9() {
		return getConstString(offset + 8, $dummy_itm_grp9);
	}

	/**
	 * Item classification master 9 (Dummy for join) 品目分類マスタ９（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp9(String value) {
		setConstString(offset + 8, $dummy_itm_grp9, value);
	}


	/**
	 * Item classification master 10 (Dummy for join) 品目分類マスタ１０（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp10() {
		return getConstString(offset + 9, $dummy_itm_grp10);
	}

	/**
	 * Item classification master 10 (Dummy for join) 品目分類マスタ１０（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp10(String value) {
		setConstString(offset + 9, $dummy_itm_grp10, value);
	}


	/**
	 * Supplier classification master 1 (Dummy for join) 発注先分類マスタ１（結合用ダミー）.<p>
	 *
	 */
	public String dummy_sppl_grp1() {
		return getConstString(offset + 10, $dummy_sppl_grp1);
	}

	/**
	 * Supplier classification master 1 (Dummy for join) 発注先分類マスタ１（結合用ダミー）.<p>
	 *
	 */
	public void dummy_sppl_grp1(String value) {
		setConstString(offset + 10, $dummy_sppl_grp1, value);
	}


	/**
	 * Sold-party classification master 2 (coupling dummy) 発注先分類マスタ２（結合用ダミー）.<p>
	 *
	 */
	public String dummy_sppl_grp2() {
		return getConstString(offset + 11, $dummy_sppl_grp2);
	}

	/**
	 * Sold-party classification master 2 (coupling dummy) 発注先分類マスタ２（結合用ダミー）.<p>
	 *
	 */
	public void dummy_sppl_grp2(String value) {
		setConstString(offset + 11, $dummy_sppl_grp2, value);
	}


	/**
	 * Sold-party classification master 3 (coupling dummy) 発注先分類マスタ３（結合用ダミー）.<p>
	 *
	 */
	public String dummy_sppl_grp3() {
		return getConstString(offset + 12, $dummy_sppl_grp3);
	}

	/**
	 * Sold-party classification master 3 (coupling dummy) 発注先分類マスタ３（結合用ダミー）.<p>
	 *
	 */
	public void dummy_sppl_grp3(String value) {
		setConstString(offset + 12, $dummy_sppl_grp3, value);
	}


	/**
	 * Sold-party classification master 4 (coupling dummy) 発注先分類マスタ４（結合用ダミー）.<p>
	 *
	 */
	public String dummy_sppl_grp4() {
		return getConstString(offset + 13, $dummy_sppl_grp4);
	}

	/**
	 * Sold-party classification master 4 (coupling dummy) 発注先分類マスタ４（結合用ダミー）.<p>
	 *
	 */
	public void dummy_sppl_grp4(String value) {
		setConstString(offset + 13, $dummy_sppl_grp4, value);
	}


	/**
	 * Sold-party classification master 5 (coupling dummy) 発注先分類マスタ５（結合用ダミー）.<p>
	 *
	 */
	public String dummy_sppl_grp5() {
		return getConstString(offset + 14, $dummy_sppl_grp5);
	}

	/**
	 * Sold-party classification master 5 (coupling dummy) 発注先分類マスタ５（結合用ダミー）.<p>
	 *
	 */
	public void dummy_sppl_grp5(String value) {
		setConstString(offset + 14, $dummy_sppl_grp5, value);
	}


	/**
	 * Sold-party classification master 6 (coupling dummy) 発注先分類マスタ６（結合用ダミー）.<p>
	 *
	 */
	public String dummy_sppl_grp6() {
		return getConstString(offset + 15, $dummy_sppl_grp6);
	}

	/**
	 * Sold-party classification master 6 (coupling dummy) 発注先分類マスタ６（結合用ダミー）.<p>
	 *
	 */
	public void dummy_sppl_grp6(String value) {
		setConstString(offset + 15, $dummy_sppl_grp6, value);
	}


	/**
	 * Sold-party classification master 7 (coupling dummy) 発注先分類マスタ７（結合用ダミー）.<p>
	 *
	 */
	public String dummy_sppl_grp7() {
		return getConstString(offset + 16, $dummy_sppl_grp7);
	}

	/**
	 * Sold-party classification master 7 (coupling dummy) 発注先分類マスタ７（結合用ダミー）.<p>
	 *
	 */
	public void dummy_sppl_grp7(String value) {
		setConstString(offset + 16, $dummy_sppl_grp7, value);
	}


	/**
	 * Sold-party classification master 8 (coupling dummy) 発注先分類マスタ８（結合用ダミー）.<p>
	 *
	 */
	public String dummy_sppl_grp8() {
		return getConstString(offset + 17, $dummy_sppl_grp8);
	}

	/**
	 * Sold-party classification master 8 (coupling dummy) 発注先分類マスタ８（結合用ダミー）.<p>
	 *
	 */
	public void dummy_sppl_grp8(String value) {
		setConstString(offset + 17, $dummy_sppl_grp8, value);
	}


	/**
	 * Sold-party classification master 9 (coupling dummy) 発注先分類マスタ９（結合用ダミー）.<p>
	 *
	 */
	public String dummy_sppl_grp9() {
		return getConstString(offset + 18, $dummy_sppl_grp9);
	}

	/**
	 * Sold-party classification master 9 (coupling dummy) 発注先分類マスタ９（結合用ダミー）.<p>
	 *
	 */
	public void dummy_sppl_grp9(String value) {
		setConstString(offset + 18, $dummy_sppl_grp9, value);
	}


	/**
	 * Sold-party classification master 10 (coupling dummy) 発注先分類マスタ１０（結合用ダミー）.<p>
	 *
	 */
	public String dummy_sppl_grp10() {
		return getConstString(offset + 19, $dummy_sppl_grp10);
	}

	/**
	 * Sold-party classification master 10 (coupling dummy) 発注先分類マスタ１０（結合用ダミー）.<p>
	 *
	 */
	public void dummy_sppl_grp10(String value) {
		setConstString(offset + 19, $dummy_sppl_grp10, value);
	}


	/**
	 * Country master (Dummy for join) 国マスタ（結合用ダミー）.<p>
	 *
	 */
	public String dummy_cntry() {
		return getConstString(offset + 20, $dummy_cntry);
	}

	/**
	 * Country master (Dummy for join) 国マスタ（結合用ダミー）.<p>
	 *
	 */
	public void dummy_cntry(String value) {
		setConstString(offset + 20, $dummy_cntry, value);
	}


	/**
	 * Region master (Dummy for join) 地域マスタ（結合用ダミー）.<p>
	 *
	 */
	public String dummy_area() {
		return getConstString(offset + 21, $dummy_area);
	}

	/**
	 * Region master (Dummy for join) 地域マスタ（結合用ダミー）.<p>
	 *
	 */
	public void dummy_area(String value) {
		setConstString(offset + 21, $dummy_area, value);
	}


	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public String calc_grp_cd() {
		return getConstString(offset + 22, $calc_grp_cd);
	}

	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public void calc_grp_cd(String value) {
		setConstString(offset + 22, $calc_grp_cd, value);
	}


	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public String calc_grp_nm() {
		return getConstString(offset + 23, $calc_grp_nm);
	}

	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public void calc_grp_nm(String value) {
		setConstString(offset + 23, $calc_grp_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 24, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 24, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 25, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 25, $wg_nm, value);
	}


	/**
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public String mng_dpt_cd() {
		return getConstString(offset + 26, $mng_dpt_cd);
	}

	/**
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public void mng_dpt_cd(String value) {
		setConstString(offset + 26, $mng_dpt_cd, value);
	}


	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public String mng_dpt_nm() {
		return getConstString(offset + 27, $mng_dpt_nm);
	}

	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public void mng_dpt_nm(String value) {
		setConstString(offset + 27, $mng_dpt_nm, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 28, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 28, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 29, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 29, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 30, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 30, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 31, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 31, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 32, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 32, $itm_nm, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 33, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 33, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 34, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 34, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 35, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 35, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 36, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 36, $itm_typ_d_nm, value);
	}


	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public String itm_jnl_cd() {
		return getConstString(offset + 37, $itm_jnl_cd);
	}

	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public void itm_jnl_cd(String value) {
		setConstString(offset + 37, $itm_jnl_cd, value);
	}


	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public String itm_jnl_nm() {
		return getConstString(offset + 38, $itm_jnl_nm);
	}

	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public void itm_jnl_nm(String value) {
		setConstString(offset + 38, $itm_jnl_nm, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 39, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 39, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 40, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 40, $sublot_no, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 41, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 41, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 42, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 42, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 43, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 43, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 44, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 44, $sno4, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 45, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 45, $sppl_cd, value);
	}


	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 46, $sppl_nm);
	}

	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 46, $sppl_nm, value);
	}


	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public String asst_typ() {
		return getConstString(offset + 47, $asst_typ);
	}

	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public void asst_typ(String value) {
		setConstString(offset + 47, $asst_typ, value);
	}


	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public String asst_typ_nm() {
		return getConstString(offset + 48, $asst_typ_nm);
	}

	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public void asst_typ_nm(String value) {
		setConstString(offset + 48, $asst_typ_nm, value);
	}


	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public boolean repurc_obli_flg() {
		return getConstBoolean(offset + 49, $repurc_obli_flg);
	}

	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public void repurc_obli_flg(boolean value) {
		setConstBoolean(offset + 49, $repurc_obli_flg, value);
	}


	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 50, $unit_cd);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 50, $unit_cd, value);
	}


	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public String unit_nm() {
		return getConstString(offset + 51, $unit_nm);
	}

	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public void unit_nm(String value) {
		setConstString(offset + 51, $unit_nm, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 52, $dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 52, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 52, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 52, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 52, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 52, $dec_place, value);
	}


	/**
	 * Year month 年月.<p>
	 *
	 */
	public MCDate ym() {
		return getConstDate(offset + 53, $ym);
	}

	/**
	 * Year month 年月.<p>
	 *
	 */
	public void ym(MCDate value) {
		setConstDate(offset + 53, $ym, value);
	}


	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber std_qty() {
		return getConstNumber(offset + 54, $std_qty);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void std_qty(MCNumber value) {
		setConstNumber(offset + 54, $std_qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void std_qty(int value) {
		setConstNumber(offset + 54, $std_qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void std_qty(long value) {
		setConstNumber(offset + 54, $std_qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void std_qty(float value) {
		setConstNumber(offset + 54, $std_qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void std_qty(double value) {
		setConstNumber(offset + 54, $std_qty, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber ave_upri() {
		return getConstNumber(offset + 55, $ave_upri);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void ave_upri(MCNumber value) {
		setConstNumber(offset + 55, $ave_upri, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void ave_upri(int value) {
		setConstNumber(offset + 55, $ave_upri, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void ave_upri(long value) {
		setConstNumber(offset + 55, $ave_upri, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void ave_upri(float value) {
		setConstNumber(offset + 55, $ave_upri, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void ave_upri(double value) {
		setConstNumber(offset + 55, $ave_upri, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber std_upri() {
		return getConstNumber(offset + 56, $std_upri);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std_upri(MCNumber value) {
		setConstNumber(offset + 56, $std_upri, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std_upri(int value) {
		setConstNumber(offset + 56, $std_upri, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std_upri(long value) {
		setConstNumber(offset + 56, $std_upri, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std_upri(float value) {
		setConstNumber(offset + 56, $std_upri, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std_upri(double value) {
		setConstNumber(offset + 56, $std_upri, value);
	}


	/**
	 * Amount (1 unit) 金額（１単位）.<p>
	 *
	 */
	public MCNumber ave_upri_unit() {
		return getConstNumber(offset + 57, $ave_upri_unit);
	}

	/**
	 * Amount (1 unit) 金額（１単位）.<p>
	 *
	 */
	public void ave_upri_unit(MCNumber value) {
		setConstNumber(offset + 57, $ave_upri_unit, value);
	}

	/**
	 * Amount (1 unit) 金額（１単位）.<p>
	 *
	 */
	public void ave_upri_unit(int value) {
		setConstNumber(offset + 57, $ave_upri_unit, value);
	}

	/**
	 * Amount (1 unit) 金額（１単位）.<p>
	 *
	 */
	public void ave_upri_unit(long value) {
		setConstNumber(offset + 57, $ave_upri_unit, value);
	}

	/**
	 * Amount (1 unit) 金額（１単位）.<p>
	 *
	 */
	public void ave_upri_unit(float value) {
		setConstNumber(offset + 57, $ave_upri_unit, value);
	}

	/**
	 * Amount (1 unit) 金額（１単位）.<p>
	 *
	 */
	public void ave_upri_unit(double value) {
		setConstNumber(offset + 57, $ave_upri_unit, value);
	}


	/**
	 * Standard (1 unit) 標準（１単位）.<p>
	 *
	 */
	public MCNumber std_upri_unit() {
		return getConstNumber(offset + 58, $std_upri_unit);
	}

	/**
	 * Standard (1 unit) 標準（１単位）.<p>
	 *
	 */
	public void std_upri_unit(MCNumber value) {
		setConstNumber(offset + 58, $std_upri_unit, value);
	}

	/**
	 * Standard (1 unit) 標準（１単位）.<p>
	 *
	 */
	public void std_upri_unit(int value) {
		setConstNumber(offset + 58, $std_upri_unit, value);
	}

	/**
	 * Standard (1 unit) 標準（１単位）.<p>
	 *
	 */
	public void std_upri_unit(long value) {
		setConstNumber(offset + 58, $std_upri_unit, value);
	}

	/**
	 * Standard (1 unit) 標準（１単位）.<p>
	 *
	 */
	public void std_upri_unit(float value) {
		setConstNumber(offset + 58, $std_upri_unit, value);
	}

	/**
	 * Standard (1 unit) 標準（１単位）.<p>
	 *
	 */
	public void std_upri_unit(double value) {
		setConstNumber(offset + 58, $std_upri_unit, value);
	}


	public String getString(String name) {
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
		if ($dummy_cntry.equalsIgnoreCase(name)) {
			return dummy_cntry();
		}
		if ($dummy_area.equalsIgnoreCase(name)) {
			return dummy_area();
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			return calc_grp_nm();
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
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			return itm_typ_nm();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			return itm_jnl_cd();
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			return itm_jnl_nm();
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
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			return asst_typ_nm();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			return std_qty();
		}
		if ($ave_upri.equalsIgnoreCase(name)) {
			return ave_upri();
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			return std_upri();
		}
		if ($ave_upri_unit.equalsIgnoreCase(name)) {
			return ave_upri_unit();
		}
		if ($std_upri_unit.equalsIgnoreCase(name)) {
			return std_upri_unit();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			return repurc_obli_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
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
		if ($dummy_cntry.equalsIgnoreCase(name)) {
			return dummy_cntry();
		}
		if ($dummy_area.equalsIgnoreCase(name)) {
			return dummy_area();
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			return calc_grp_nm();
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
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			return itm_typ_nm();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			return itm_jnl_cd();
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			return itm_jnl_nm();
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
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			return asst_typ_nm();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			return std_qty();
		}
		if ($ave_upri.equalsIgnoreCase(name)) {
			return ave_upri();
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			return std_upri();
		}
		if ($ave_upri_unit.equalsIgnoreCase(name)) {
			return ave_upri_unit();
		}
		if ($std_upri_unit.equalsIgnoreCase(name)) {
			return std_upri_unit();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			return repurc_obli_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
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
		if ($dummy_cntry.equalsIgnoreCase(name)) {
			dummy_cntry(value);
			return;
		}
		if ($dummy_area.equalsIgnoreCase(name)) {
			dummy_area(value);
			return;
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			calc_grp_nm(value);
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
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
			return;
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			itm_typ_nm(value);
			return;
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			itm_typ_d_cd(value);
			return;
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			itm_typ_d_nm(value);
			return;
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			itm_jnl_cd(value);
			return;
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			itm_jnl_nm(value);
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
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			asst_typ(value);
			return;
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			asst_typ_nm(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($ave_upri.equalsIgnoreCase(name)) {
			ave_upri(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($ave_upri_unit.equalsIgnoreCase(name)) {
			ave_upri_unit(value);
			return;
		}
		if ($std_upri_unit.equalsIgnoreCase(name)) {
			std_upri_unit(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($ave_upri.equalsIgnoreCase(name)) {
			ave_upri(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($ave_upri_unit.equalsIgnoreCase(name)) {
			ave_upri_unit(value);
			return;
		}
		if ($std_upri_unit.equalsIgnoreCase(name)) {
			std_upri_unit(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($ave_upri.equalsIgnoreCase(name)) {
			ave_upri(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($ave_upri_unit.equalsIgnoreCase(name)) {
			ave_upri_unit(value);
			return;
		}
		if ($std_upri_unit.equalsIgnoreCase(name)) {
			std_upri_unit(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($ave_upri.equalsIgnoreCase(name)) {
			ave_upri(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($ave_upri_unit.equalsIgnoreCase(name)) {
			ave_upri_unit(value);
			return;
		}
		if ($std_upri_unit.equalsIgnoreCase(name)) {
			std_upri_unit(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($ave_upri.equalsIgnoreCase(name)) {
			ave_upri(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($ave_upri_unit.equalsIgnoreCase(name)) {
			ave_upri_unit(value);
			return;
		}
		if ($std_upri_unit.equalsIgnoreCase(name)) {
			std_upri_unit(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			repurc_obli_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
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
		if ($dummy_cntry.equalsIgnoreCase(name)) {
			dummy_cntry(value);
			return;
		}
		if ($dummy_area.equalsIgnoreCase(name)) {
			dummy_area(value);
			return;
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			calc_grp_nm(value);
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
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
			return;
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			itm_typ_nm(value);
			return;
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			itm_typ_d_cd(value);
			return;
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			itm_typ_d_nm(value);
			return;
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			itm_jnl_cd(value);
			return;
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			itm_jnl_nm(value);
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
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			asst_typ(value);
			return;
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			asst_typ_nm(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($ave_upri.equalsIgnoreCase(name)) {
			ave_upri(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($ave_upri_unit.equalsIgnoreCase(name)) {
			ave_upri_unit(value);
			return;
		}
		if ($std_upri_unit.equalsIgnoreCase(name)) {
			std_upri_unit(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($ave_upri.equalsIgnoreCase(name)) {
			ave_upri(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($ave_upri_unit.equalsIgnoreCase(name)) {
			ave_upri_unit(value);
			return;
		}
		if ($std_upri_unit.equalsIgnoreCase(name)) {
			std_upri_unit(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($ave_upri.equalsIgnoreCase(name)) {
			ave_upri(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($ave_upri_unit.equalsIgnoreCase(name)) {
			ave_upri_unit(value);
			return;
		}
		if ($std_upri_unit.equalsIgnoreCase(name)) {
			std_upri_unit(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($ave_upri.equalsIgnoreCase(name)) {
			ave_upri(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($ave_upri_unit.equalsIgnoreCase(name)) {
			ave_upri_unit(value);
			return;
		}
		if ($std_upri_unit.equalsIgnoreCase(name)) {
			std_upri_unit(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($ave_upri.equalsIgnoreCase(name)) {
			ave_upri(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($ave_upri_unit.equalsIgnoreCase(name)) {
			ave_upri_unit(value);
			return;
		}
		if ($std_upri_unit.equalsIgnoreCase(name)) {
			std_upri_unit(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			repurc_obli_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

