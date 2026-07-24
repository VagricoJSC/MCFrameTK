package mcframe.serverMSBE.MSBEL0170;

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
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public static final String $asset_mng_typ = "asset_mng_typ";
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
	 * Replenishment method type 補充方法区分.<p>
	 *
	 */
	public static final String $op_rpl_mtd_typ = "op_rpl_mtd_typ";
	/**
	 * Replenishment method type name 補充方法区分名.<p>
	 *
	 */
	public static final String $op_rpl_mtd_typ_nm = "op_rpl_mtd_typ_nm";
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public static final String $mfg_loc_cd = "mfg_loc_cd";
	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public static final String $mfg_loc_nm = "mfg_loc_nm";
	/**
	 * Subcontractor cd. 外注先ＣＤ.<p>
	 *
	 */
	public static final String $mfg_loc_sppl_cd = "mfg_loc_sppl_cd";
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public static final String $bom_ptn = "bom_ptn";
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
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public static final String $maker_cd = "maker_cd";
	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public static final String $maker_nm = "maker_nm";
	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public static final String $rqst_loc_cd = "rqst_loc_cd";
	/**
	 * Location name (Requested) 依頼先場所名.<p>
	 *
	 */
	public static final String $rqst_loc_nm = "rqst_loc_nm";
	/**
	 * For requested rack/line 依頼先棚・ライン対象.<p>
	 *
	 */
	public static final String $rqst_str_ln_tgt_flg = "rqst_str_ln_tgt_flg";
	/**
	 * Rack/Line cd. (Requested) 依頼先棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $rqst_str_ln_cd = "rqst_str_ln_cd";
	/**
	 * Rack/Line name (Requested) 依頼先棚・ライン名.<p>
	 *
	 */
	public static final String $rqst_str_ln_nm = "rqst_str_ln_nm";
	/**
	 * Without rack/line (Requested) 依頼先棚・ライン無.<p>
	 *
	 */
	public static final String $rqst_str_ln_cd_none_flg = "rqst_str_ln_cd_none_flg";
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public static final String $dec_place = "dec_place";
	/**
	 * Request qty. 依頼数量.<p>
	 *
	 */
	public static final String $rqst_qty = "rqst_qty";
	/**
	 * GR qty. 入庫数量.<p>
	 *
	 */
	public static final String $gr_schd_qty = "gr_schd_qty";
	/**
	 * Inventory qty. 在庫数量.<p>
	 *
	 */
	public static final String $stk_qty = "stk_qty";
	/**
	 * GI qty. 出庫数量.<p>
	 *
	 */
	public static final String $gi_schd_qty = "gi_schd_qty";
	/**
	 * Include GI schedule 出庫予定含む.<p>
	 *
	 */
	public static final String $gi_schd_flg = "gi_schd_flg";
	/**
	 * Reorder point inventory qty. 発注点在庫数量.<p>
	 *
	 */
	public static final String $rord_stk_qty = "rord_stk_qty";
	/**
	 * Insufficient qty. 不足数量.<p>
	 *
	 */
	public static final String $shortage_qty = "shortage_qty";
	/**
	 * Reorder point request qty. 発注点依頼数量.<p>
	 *
	 */
	public static final String $rord_rqst_qty = "rord_rqst_qty";
	/**
	 * Base unit 基準単位.<p>
	 *
	 */
	public static final String $unit_cd = "unit_cd";
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public static final String $unit_nm = "unit_nm";
	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public static final String $ver_flg = "ver_flg";
	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public static final String $ver_no = "ver_no";
	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public static final String $sno1_mng_typ = "sno1_mng_typ";
	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public static final String $sno2_mng_typ = "sno2_mng_typ";
	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public static final String $sno3_mng_typ = "sno3_mng_typ";
	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public static final String $sno4_mng_typ = "sno4_mng_typ";
	/**
	 * GR active ingredient 入庫有効成分.<p>
	 *
	 */
	public static final String $gr_schd_cont_qty = "gr_schd_cont_qty";
	/**
	 * Inventory active ingredient 在庫有効成分.<p>
	 *
	 */
	public static final String $stk_cont_qty = "stk_cont_qty";
	/**
	 * GI active ingredient 出庫有効成分.<p>
	 *
	 */
	public static final String $gi_schd_cont_qty = "gi_schd_cont_qty";
	/**
	 * Shortage of active ingredient 不足有効成分.<p>
	 *
	 */
	public static final String $shortage_cont_qty = "shortage_cont_qty";
	/**
	 * Standard coefficient 標準係数.<p>
	 *
	 */
	public static final String $std_cont_fctr = "std_cont_fctr";
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public static final String $cont_fctr_flg = "cont_fctr_flg";
	/**
	 * Active ingredient unit cd. 有効成分単位ＣＤ.<p>
	 *
	 */
	public static final String $cont_fctr_unit_cd = "cont_fctr_unit_cd";
	/**
	 * Active ingredient unit name 有効成分単位名.<p>
	 *
	 */
	public static final String $cont_fctr_unit_nm = "cont_fctr_unit_nm";
	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public static final String $cont_fctr_dec_place = "cont_fctr_dec_place";
	/**
	 * Storage factory/distribution warehouse cd. 格納工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $strg_site_cd = "strg_site_cd";
	/**
	 * Storage factory/distribution warehouse name 格納工場・物流倉庫名.<p>
	 *
	 */
	public static final String $strg_site_nm = "strg_site_nm";
	/**
	 * Storage distribution group cd. 格納物流グループＣＤ.<p>
	 *
	 */
	public static final String $strg_lg_grp_cd = "strg_lg_grp_cd";
	/**
	 * Storage distribution group name 格納物流グループ名.<p>
	 *
	 */
	public static final String $strg_lg_grp_nm = "strg_lg_grp_nm";
	/**
	 * Storage WG cd. 格納ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $strg_wg_cd = "strg_wg_cd";
	/**
	 * Storage WG name 格納ワーキンググループ名.<p>
	 *
	 */
	public static final String $strg_wg_nm = "strg_wg_nm";
	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $rqst_wg_cd = "rqst_wg_cd";
	/**
	 * Requested WG name 依頼先ワーキンググループ名.<p>
	 *
	 */
	public static final String $rqst_wg_nm = "rqst_wg_nm";
	/**
	 * Shortage 不足.<p>
	 *
	 */
	public static final String $shortage_flg = "shortage_flg";
	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public static final String $gi_loc_cd = "gi_loc_cd";
	public static final String $strg_sppl_cd = "strg_sppl_cd";


	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta asset_mng_typ_META = createCommonMeta($asset_mng_typ, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP);
	public static final MCMeta strg_loc_cd_META = createCommonMeta($strg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta strg_loc_nm_META = createCommonMeta($strg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta op_rpl_mtd_typ_META = createCommonMeta($op_rpl_mtd_typ, mcframe.commonMS.meta.MS_META.OP_RPL_MTD_TYP);
	public static final MCMeta op_rpl_mtd_typ_nm_META = createCommonMeta($op_rpl_mtd_typ_nm, mcframe.commonMS.meta.MS_META.OP_RPL_MTD_TYP_NM);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta mfg_loc_nm_META = createCommonMeta($mfg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta mfg_loc_sppl_cd_META = createCommonMeta($mfg_loc_sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bom_ptn_META = createCommonMeta($bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta maker_cd_META = createCommonMeta($maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta maker_nm_META = createCommonMeta($maker_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta rqst_loc_cd_META = createCommonMeta($rqst_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta rqst_loc_nm_META = createCommonMeta($rqst_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta rqst_str_ln_tgt_flg_META = createCommonMeta($rqst_str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rqst_str_ln_cd_META = createCommonMeta($rqst_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta rqst_str_ln_nm_META = createCommonMeta($rqst_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta rqst_str_ln_cd_none_flg_META = createCommonMeta($rqst_str_ln_cd_none_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta rqst_qty_META = createCommonMeta($rqst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta gr_schd_qty_META = createCommonMeta($gr_schd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta stk_qty_META = createCommonMeta($stk_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta gi_schd_qty_META = createCommonMeta($gi_schd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta gi_schd_flg_META = createCommonMeta($gi_schd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rord_stk_qty_META = createCommonMeta($rord_stk_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta shortage_qty_META = createCommonMeta($shortage_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta rord_rqst_qty_META = createCommonMeta($rord_rqst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta unit_nm_META = createCommonMeta($unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta ver_flg_META = createCommonMeta($ver_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta sno1_mng_typ_META = createCommonMeta($sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno2_mng_typ_META = createCommonMeta($sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno3_mng_typ_META = createCommonMeta($sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno4_mng_typ_META = createCommonMeta($sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta gr_schd_cont_qty_META = createCommonMeta($gr_schd_cont_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta stk_cont_qty_META = createCommonMeta($stk_cont_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta gi_schd_cont_qty_META = createCommonMeta($gi_schd_cont_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta shortage_cont_qty_META = createCommonMeta($shortage_cont_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta std_cont_fctr_META = createCommonMeta($std_cont_fctr, mcframe.commonMA.meta.MA_META.STD_CONT_FCTR);
	public static final MCMeta cont_fctr_flg_META = createCommonMeta($cont_fctr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cont_fctr_unit_cd_META = createCommonMeta($cont_fctr_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta cont_fctr_unit_nm_META = createCommonMeta($cont_fctr_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta cont_fctr_dec_place_META = createCommonMeta($cont_fctr_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta strg_site_cd_META = createCommonMeta($strg_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta strg_site_nm_META = createCommonMeta($strg_site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta strg_lg_grp_cd_META = createCommonMeta($strg_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta strg_lg_grp_nm_META = createCommonMeta($strg_lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta strg_wg_cd_META = createCommonMeta($strg_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta strg_wg_nm_META = createCommonMeta($strg_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta rqst_wg_cd_META = createCommonMeta($rqst_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta rqst_wg_nm_META = createCommonMeta($rqst_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta shortage_flg_META = createCommonMeta($shortage_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gi_loc_cd_META = createCommonMeta($gi_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta strg_sppl_cd_META = createCommonMeta($strg_sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);

	protected static final ConstMetaList<Srch01_RsltR> constMetas = new ConstMetaList<Srch01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			asset_mng_typ_META,
			strg_loc_cd_META,
			strg_loc_nm_META,
			op_rpl_mtd_typ_META,
			op_rpl_mtd_typ_nm_META,
			mfg_loc_cd_META,
			mfg_loc_nm_META,
			mfg_loc_sppl_cd_META,
			bom_ptn_META,
			sppl_cd_META,
			sppl_nm_META,
			maker_cd_META,
			maker_nm_META,
			rqst_loc_cd_META,
			rqst_loc_nm_META,
			rqst_str_ln_tgt_flg_META,
			rqst_str_ln_cd_META,
			rqst_str_ln_nm_META,
			rqst_str_ln_cd_none_flg_META,
			dec_place_META,
			rqst_qty_META,
			gr_schd_qty_META,
			stk_qty_META,
			gi_schd_qty_META,
			gi_schd_flg_META,
			rord_stk_qty_META,
			shortage_qty_META,
			rord_rqst_qty_META,
			unit_cd_META,
			unit_nm_META,
			ver_flg_META,
			ver_no_META,
			sno1_mng_typ_META,
			sno2_mng_typ_META,
			sno3_mng_typ_META,
			sno4_mng_typ_META,
			gr_schd_cont_qty_META,
			stk_cont_qty_META,
			gi_schd_cont_qty_META,
			shortage_cont_qty_META,
			std_cont_fctr_META,
			cont_fctr_flg_META,
			cont_fctr_unit_cd_META,
			cont_fctr_unit_nm_META,
			cont_fctr_dec_place_META,
			strg_site_cd_META,
			strg_site_nm_META,
			strg_lg_grp_cd_META,
			strg_lg_grp_nm_META,
			strg_wg_cd_META,
			strg_wg_nm_META,
			rqst_wg_cd_META,
			rqst_wg_nm_META,
			shortage_flg_META,
			gi_loc_cd_META,
			strg_sppl_cd_META
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
				{$op_rpl_mtd_typ, "MSC_OP_RPL_MTD_TYP"}	// op_rpl_mtd_typ
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
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public String asset_mng_typ() {
		return getConstString(offset + 5, $asset_mng_typ);
	}

	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public void asset_mng_typ(String value) {
		setConstString(offset + 5, $asset_mng_typ, value);
	}


	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public String strg_loc_cd() {
		return getConstString(offset + 6, $strg_loc_cd);
	}

	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public void strg_loc_cd(String value) {
		setConstString(offset + 6, $strg_loc_cd, value);
	}


	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public String strg_loc_nm() {
		return getConstString(offset + 7, $strg_loc_nm);
	}

	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public void strg_loc_nm(String value) {
		setConstString(offset + 7, $strg_loc_nm, value);
	}


	/**
	 * Replenishment method type 補充方法区分.<p>
	 *
	 */
	public String op_rpl_mtd_typ() {
		return getConstString(offset + 8, $op_rpl_mtd_typ);
	}

	/**
	 * Replenishment method type 補充方法区分.<p>
	 *
	 */
	public void op_rpl_mtd_typ(String value) {
		setConstString(offset + 8, $op_rpl_mtd_typ, value);
	}


	/**
	 * Replenishment method type name 補充方法区分名.<p>
	 *
	 */
	public String op_rpl_mtd_typ_nm() {
		return getConstString(offset + 9, $op_rpl_mtd_typ_nm);
	}

	/**
	 * Replenishment method type name 補充方法区分名.<p>
	 *
	 */
	public void op_rpl_mtd_typ_nm(String value) {
		setConstString(offset + 9, $op_rpl_mtd_typ_nm, value);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 10, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 10, $mfg_loc_cd, value);
	}


	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public String mfg_loc_nm() {
		return getConstString(offset + 11, $mfg_loc_nm);
	}

	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public void mfg_loc_nm(String value) {
		setConstString(offset + 11, $mfg_loc_nm, value);
	}


	/**
	 * Subcontractor cd. 外注先ＣＤ.<p>
	 *
	 */
	public String mfg_loc_sppl_cd() {
		return getConstString(offset + 12, $mfg_loc_sppl_cd);
	}

	/**
	 * Subcontractor cd. 外注先ＣＤ.<p>
	 *
	 */
	public void mfg_loc_sppl_cd(String value) {
		setConstString(offset + 12, $mfg_loc_sppl_cd, value);
	}


	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return getConstString(offset + 13, $bom_ptn);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		setConstString(offset + 13, $bom_ptn, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 14, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 14, $sppl_cd, value);
	}


	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 15, $sppl_nm);
	}

	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 15, $sppl_nm, value);
	}


	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 16, $maker_cd);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 16, $maker_cd, value);
	}


	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public String maker_nm() {
		return getConstString(offset + 17, $maker_nm);
	}

	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public void maker_nm(String value) {
		setConstString(offset + 17, $maker_nm, value);
	}


	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public String rqst_loc_cd() {
		return getConstString(offset + 18, $rqst_loc_cd);
	}

	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public void rqst_loc_cd(String value) {
		setConstString(offset + 18, $rqst_loc_cd, value);
	}


	/**
	 * Location name (Requested) 依頼先場所名.<p>
	 *
	 */
	public String rqst_loc_nm() {
		return getConstString(offset + 19, $rqst_loc_nm);
	}

	/**
	 * Location name (Requested) 依頼先場所名.<p>
	 *
	 */
	public void rqst_loc_nm(String value) {
		setConstString(offset + 19, $rqst_loc_nm, value);
	}


	/**
	 * For requested rack/line 依頼先棚・ライン対象.<p>
	 *
	 */
	public boolean rqst_str_ln_tgt_flg() {
		return getConstBoolean(offset + 20, $rqst_str_ln_tgt_flg);
	}

	/**
	 * For requested rack/line 依頼先棚・ライン対象.<p>
	 *
	 */
	public void rqst_str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 20, $rqst_str_ln_tgt_flg, value);
	}


	/**
	 * Rack/Line cd. (Requested) 依頼先棚・ラインＣＤ.<p>
	 *
	 */
	public String rqst_str_ln_cd() {
		return getConstString(offset + 21, $rqst_str_ln_cd);
	}

	/**
	 * Rack/Line cd. (Requested) 依頼先棚・ラインＣＤ.<p>
	 *
	 */
	public void rqst_str_ln_cd(String value) {
		setConstString(offset + 21, $rqst_str_ln_cd, value);
	}


	/**
	 * Rack/Line name (Requested) 依頼先棚・ライン名.<p>
	 *
	 */
	public String rqst_str_ln_nm() {
		return getConstString(offset + 22, $rqst_str_ln_nm);
	}

	/**
	 * Rack/Line name (Requested) 依頼先棚・ライン名.<p>
	 *
	 */
	public void rqst_str_ln_nm(String value) {
		setConstString(offset + 22, $rqst_str_ln_nm, value);
	}


	/**
	 * Without rack/line (Requested) 依頼先棚・ライン無.<p>
	 *
	 */
	public boolean rqst_str_ln_cd_none_flg() {
		return getConstBoolean(offset + 23, $rqst_str_ln_cd_none_flg);
	}

	/**
	 * Without rack/line (Requested) 依頼先棚・ライン無.<p>
	 *
	 */
	public void rqst_str_ln_cd_none_flg(boolean value) {
		setConstBoolean(offset + 23, $rqst_str_ln_cd_none_flg, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 24, $dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 24, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 24, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 24, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 24, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 24, $dec_place, value);
	}


	/**
	 * Request qty. 依頼数量.<p>
	 *
	 */
	public MCNumber rqst_qty() {
		return getConstNumber(offset + 25, $rqst_qty);
	}

	/**
	 * Request qty. 依頼数量.<p>
	 *
	 */
	public void rqst_qty(MCNumber value) {
		setConstNumber(offset + 25, $rqst_qty, value);
	}

	/**
	 * Request qty. 依頼数量.<p>
	 *
	 */
	public void rqst_qty(int value) {
		setConstNumber(offset + 25, $rqst_qty, value);
	}

	/**
	 * Request qty. 依頼数量.<p>
	 *
	 */
	public void rqst_qty(long value) {
		setConstNumber(offset + 25, $rqst_qty, value);
	}

	/**
	 * Request qty. 依頼数量.<p>
	 *
	 */
	public void rqst_qty(float value) {
		setConstNumber(offset + 25, $rqst_qty, value);
	}

	/**
	 * Request qty. 依頼数量.<p>
	 *
	 */
	public void rqst_qty(double value) {
		setConstNumber(offset + 25, $rqst_qty, value);
	}


	/**
	 * GR qty. 入庫数量.<p>
	 *
	 */
	public MCNumber gr_schd_qty() {
		return getConstNumber(offset + 26, $gr_schd_qty);
	}

	/**
	 * GR qty. 入庫数量.<p>
	 *
	 */
	public void gr_schd_qty(MCNumber value) {
		setConstNumber(offset + 26, $gr_schd_qty, value);
	}

	/**
	 * GR qty. 入庫数量.<p>
	 *
	 */
	public void gr_schd_qty(int value) {
		setConstNumber(offset + 26, $gr_schd_qty, value);
	}

	/**
	 * GR qty. 入庫数量.<p>
	 *
	 */
	public void gr_schd_qty(long value) {
		setConstNumber(offset + 26, $gr_schd_qty, value);
	}

	/**
	 * GR qty. 入庫数量.<p>
	 *
	 */
	public void gr_schd_qty(float value) {
		setConstNumber(offset + 26, $gr_schd_qty, value);
	}

	/**
	 * GR qty. 入庫数量.<p>
	 *
	 */
	public void gr_schd_qty(double value) {
		setConstNumber(offset + 26, $gr_schd_qty, value);
	}


	/**
	 * Inventory qty. 在庫数量.<p>
	 *
	 */
	public MCNumber stk_qty() {
		return getConstNumber(offset + 27, $stk_qty);
	}

	/**
	 * Inventory qty. 在庫数量.<p>
	 *
	 */
	public void stk_qty(MCNumber value) {
		setConstNumber(offset + 27, $stk_qty, value);
	}

	/**
	 * Inventory qty. 在庫数量.<p>
	 *
	 */
	public void stk_qty(int value) {
		setConstNumber(offset + 27, $stk_qty, value);
	}

	/**
	 * Inventory qty. 在庫数量.<p>
	 *
	 */
	public void stk_qty(long value) {
		setConstNumber(offset + 27, $stk_qty, value);
	}

	/**
	 * Inventory qty. 在庫数量.<p>
	 *
	 */
	public void stk_qty(float value) {
		setConstNumber(offset + 27, $stk_qty, value);
	}

	/**
	 * Inventory qty. 在庫数量.<p>
	 *
	 */
	public void stk_qty(double value) {
		setConstNumber(offset + 27, $stk_qty, value);
	}


	/**
	 * GI qty. 出庫数量.<p>
	 *
	 */
	public MCNumber gi_schd_qty() {
		return getConstNumber(offset + 28, $gi_schd_qty);
	}

	/**
	 * GI qty. 出庫数量.<p>
	 *
	 */
	public void gi_schd_qty(MCNumber value) {
		setConstNumber(offset + 28, $gi_schd_qty, value);
	}

	/**
	 * GI qty. 出庫数量.<p>
	 *
	 */
	public void gi_schd_qty(int value) {
		setConstNumber(offset + 28, $gi_schd_qty, value);
	}

	/**
	 * GI qty. 出庫数量.<p>
	 *
	 */
	public void gi_schd_qty(long value) {
		setConstNumber(offset + 28, $gi_schd_qty, value);
	}

	/**
	 * GI qty. 出庫数量.<p>
	 *
	 */
	public void gi_schd_qty(float value) {
		setConstNumber(offset + 28, $gi_schd_qty, value);
	}

	/**
	 * GI qty. 出庫数量.<p>
	 *
	 */
	public void gi_schd_qty(double value) {
		setConstNumber(offset + 28, $gi_schd_qty, value);
	}


	/**
	 * Include GI schedule 出庫予定含む.<p>
	 *
	 */
	public boolean gi_schd_flg() {
		return getConstBoolean(offset + 29, $gi_schd_flg);
	}

	/**
	 * Include GI schedule 出庫予定含む.<p>
	 *
	 */
	public void gi_schd_flg(boolean value) {
		setConstBoolean(offset + 29, $gi_schd_flg, value);
	}


	/**
	 * Reorder point inventory qty. 発注点在庫数量.<p>
	 *
	 */
	public MCNumber rord_stk_qty() {
		return getConstNumber(offset + 30, $rord_stk_qty);
	}

	/**
	 * Reorder point inventory qty. 発注点在庫数量.<p>
	 *
	 */
	public void rord_stk_qty(MCNumber value) {
		setConstNumber(offset + 30, $rord_stk_qty, value);
	}

	/**
	 * Reorder point inventory qty. 発注点在庫数量.<p>
	 *
	 */
	public void rord_stk_qty(int value) {
		setConstNumber(offset + 30, $rord_stk_qty, value);
	}

	/**
	 * Reorder point inventory qty. 発注点在庫数量.<p>
	 *
	 */
	public void rord_stk_qty(long value) {
		setConstNumber(offset + 30, $rord_stk_qty, value);
	}

	/**
	 * Reorder point inventory qty. 発注点在庫数量.<p>
	 *
	 */
	public void rord_stk_qty(float value) {
		setConstNumber(offset + 30, $rord_stk_qty, value);
	}

	/**
	 * Reorder point inventory qty. 発注点在庫数量.<p>
	 *
	 */
	public void rord_stk_qty(double value) {
		setConstNumber(offset + 30, $rord_stk_qty, value);
	}


	/**
	 * Insufficient qty. 不足数量.<p>
	 *
	 */
	public MCNumber shortage_qty() {
		return getConstNumber(offset + 31, $shortage_qty);
	}

	/**
	 * Insufficient qty. 不足数量.<p>
	 *
	 */
	public void shortage_qty(MCNumber value) {
		setConstNumber(offset + 31, $shortage_qty, value);
	}

	/**
	 * Insufficient qty. 不足数量.<p>
	 *
	 */
	public void shortage_qty(int value) {
		setConstNumber(offset + 31, $shortage_qty, value);
	}

	/**
	 * Insufficient qty. 不足数量.<p>
	 *
	 */
	public void shortage_qty(long value) {
		setConstNumber(offset + 31, $shortage_qty, value);
	}

	/**
	 * Insufficient qty. 不足数量.<p>
	 *
	 */
	public void shortage_qty(float value) {
		setConstNumber(offset + 31, $shortage_qty, value);
	}

	/**
	 * Insufficient qty. 不足数量.<p>
	 *
	 */
	public void shortage_qty(double value) {
		setConstNumber(offset + 31, $shortage_qty, value);
	}


	/**
	 * Reorder point request qty. 発注点依頼数量.<p>
	 *
	 */
	public MCNumber rord_rqst_qty() {
		return getConstNumber(offset + 32, $rord_rqst_qty);
	}

	/**
	 * Reorder point request qty. 発注点依頼数量.<p>
	 *
	 */
	public void rord_rqst_qty(MCNumber value) {
		setConstNumber(offset + 32, $rord_rqst_qty, value);
	}

	/**
	 * Reorder point request qty. 発注点依頼数量.<p>
	 *
	 */
	public void rord_rqst_qty(int value) {
		setConstNumber(offset + 32, $rord_rqst_qty, value);
	}

	/**
	 * Reorder point request qty. 発注点依頼数量.<p>
	 *
	 */
	public void rord_rqst_qty(long value) {
		setConstNumber(offset + 32, $rord_rqst_qty, value);
	}

	/**
	 * Reorder point request qty. 発注点依頼数量.<p>
	 *
	 */
	public void rord_rqst_qty(float value) {
		setConstNumber(offset + 32, $rord_rqst_qty, value);
	}

	/**
	 * Reorder point request qty. 発注点依頼数量.<p>
	 *
	 */
	public void rord_rqst_qty(double value) {
		setConstNumber(offset + 32, $rord_rqst_qty, value);
	}


	/**
	 * Base unit 基準単位.<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 33, $unit_cd);
	}

	/**
	 * Base unit 基準単位.<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 33, $unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String unit_nm() {
		return getConstString(offset + 34, $unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void unit_nm(String value) {
		setConstString(offset + 34, $unit_nm, value);
	}


	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public boolean ver_flg() {
		return getConstBoolean(offset + 35, $ver_flg);
	}

	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public void ver_flg(boolean value) {
		setConstBoolean(offset + 35, $ver_flg, value);
	}


	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 36, $ver_no);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 36, $ver_no, value);
	}


	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return getConstString(offset + 37, $sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		setConstString(offset + 37, $sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return getConstString(offset + 38, $sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		setConstString(offset + 38, $sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return getConstString(offset + 39, $sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		setConstString(offset + 39, $sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return getConstString(offset + 40, $sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		setConstString(offset + 40, $sno4_mng_typ, value);
	}


	/**
	 * GR active ingredient 入庫有効成分.<p>
	 *
	 */
	public MCNumber gr_schd_cont_qty() {
		return getConstNumber(offset + 41, $gr_schd_cont_qty);
	}

	/**
	 * GR active ingredient 入庫有効成分.<p>
	 *
	 */
	public void gr_schd_cont_qty(MCNumber value) {
		setConstNumber(offset + 41, $gr_schd_cont_qty, value);
	}

	/**
	 * GR active ingredient 入庫有効成分.<p>
	 *
	 */
	public void gr_schd_cont_qty(int value) {
		setConstNumber(offset + 41, $gr_schd_cont_qty, value);
	}

	/**
	 * GR active ingredient 入庫有効成分.<p>
	 *
	 */
	public void gr_schd_cont_qty(long value) {
		setConstNumber(offset + 41, $gr_schd_cont_qty, value);
	}

	/**
	 * GR active ingredient 入庫有効成分.<p>
	 *
	 */
	public void gr_schd_cont_qty(float value) {
		setConstNumber(offset + 41, $gr_schd_cont_qty, value);
	}

	/**
	 * GR active ingredient 入庫有効成分.<p>
	 *
	 */
	public void gr_schd_cont_qty(double value) {
		setConstNumber(offset + 41, $gr_schd_cont_qty, value);
	}


	/**
	 * Inventory active ingredient 在庫有効成分.<p>
	 *
	 */
	public MCNumber stk_cont_qty() {
		return getConstNumber(offset + 42, $stk_cont_qty);
	}

	/**
	 * Inventory active ingredient 在庫有効成分.<p>
	 *
	 */
	public void stk_cont_qty(MCNumber value) {
		setConstNumber(offset + 42, $stk_cont_qty, value);
	}

	/**
	 * Inventory active ingredient 在庫有効成分.<p>
	 *
	 */
	public void stk_cont_qty(int value) {
		setConstNumber(offset + 42, $stk_cont_qty, value);
	}

	/**
	 * Inventory active ingredient 在庫有効成分.<p>
	 *
	 */
	public void stk_cont_qty(long value) {
		setConstNumber(offset + 42, $stk_cont_qty, value);
	}

	/**
	 * Inventory active ingredient 在庫有効成分.<p>
	 *
	 */
	public void stk_cont_qty(float value) {
		setConstNumber(offset + 42, $stk_cont_qty, value);
	}

	/**
	 * Inventory active ingredient 在庫有効成分.<p>
	 *
	 */
	public void stk_cont_qty(double value) {
		setConstNumber(offset + 42, $stk_cont_qty, value);
	}


	/**
	 * GI active ingredient 出庫有効成分.<p>
	 *
	 */
	public MCNumber gi_schd_cont_qty() {
		return getConstNumber(offset + 43, $gi_schd_cont_qty);
	}

	/**
	 * GI active ingredient 出庫有効成分.<p>
	 *
	 */
	public void gi_schd_cont_qty(MCNumber value) {
		setConstNumber(offset + 43, $gi_schd_cont_qty, value);
	}

	/**
	 * GI active ingredient 出庫有効成分.<p>
	 *
	 */
	public void gi_schd_cont_qty(int value) {
		setConstNumber(offset + 43, $gi_schd_cont_qty, value);
	}

	/**
	 * GI active ingredient 出庫有効成分.<p>
	 *
	 */
	public void gi_schd_cont_qty(long value) {
		setConstNumber(offset + 43, $gi_schd_cont_qty, value);
	}

	/**
	 * GI active ingredient 出庫有効成分.<p>
	 *
	 */
	public void gi_schd_cont_qty(float value) {
		setConstNumber(offset + 43, $gi_schd_cont_qty, value);
	}

	/**
	 * GI active ingredient 出庫有効成分.<p>
	 *
	 */
	public void gi_schd_cont_qty(double value) {
		setConstNumber(offset + 43, $gi_schd_cont_qty, value);
	}


	/**
	 * Shortage of active ingredient 不足有効成分.<p>
	 *
	 */
	public MCNumber shortage_cont_qty() {
		return getConstNumber(offset + 44, $shortage_cont_qty);
	}

	/**
	 * Shortage of active ingredient 不足有効成分.<p>
	 *
	 */
	public void shortage_cont_qty(MCNumber value) {
		setConstNumber(offset + 44, $shortage_cont_qty, value);
	}

	/**
	 * Shortage of active ingredient 不足有効成分.<p>
	 *
	 */
	public void shortage_cont_qty(int value) {
		setConstNumber(offset + 44, $shortage_cont_qty, value);
	}

	/**
	 * Shortage of active ingredient 不足有効成分.<p>
	 *
	 */
	public void shortage_cont_qty(long value) {
		setConstNumber(offset + 44, $shortage_cont_qty, value);
	}

	/**
	 * Shortage of active ingredient 不足有効成分.<p>
	 *
	 */
	public void shortage_cont_qty(float value) {
		setConstNumber(offset + 44, $shortage_cont_qty, value);
	}

	/**
	 * Shortage of active ingredient 不足有効成分.<p>
	 *
	 */
	public void shortage_cont_qty(double value) {
		setConstNumber(offset + 44, $shortage_cont_qty, value);
	}


	/**
	 * Standard coefficient 標準係数.<p>
	 *
	 */
	public MCNumber std_cont_fctr() {
		return getConstNumber(offset + 45, $std_cont_fctr);
	}

	/**
	 * Standard coefficient 標準係数.<p>
	 *
	 */
	public void std_cont_fctr(MCNumber value) {
		setConstNumber(offset + 45, $std_cont_fctr, value);
	}

	/**
	 * Standard coefficient 標準係数.<p>
	 *
	 */
	public void std_cont_fctr(int value) {
		setConstNumber(offset + 45, $std_cont_fctr, value);
	}

	/**
	 * Standard coefficient 標準係数.<p>
	 *
	 */
	public void std_cont_fctr(long value) {
		setConstNumber(offset + 45, $std_cont_fctr, value);
	}

	/**
	 * Standard coefficient 標準係数.<p>
	 *
	 */
	public void std_cont_fctr(float value) {
		setConstNumber(offset + 45, $std_cont_fctr, value);
	}

	/**
	 * Standard coefficient 標準係数.<p>
	 *
	 */
	public void std_cont_fctr(double value) {
		setConstNumber(offset + 45, $std_cont_fctr, value);
	}


	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public boolean cont_fctr_flg() {
		return getConstBoolean(offset + 46, $cont_fctr_flg);
	}

	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public void cont_fctr_flg(boolean value) {
		setConstBoolean(offset + 46, $cont_fctr_flg, value);
	}


	/**
	 * Active ingredient unit cd. 有効成分単位ＣＤ.<p>
	 *
	 */
	public String cont_fctr_unit_cd() {
		return getConstString(offset + 47, $cont_fctr_unit_cd);
	}

	/**
	 * Active ingredient unit cd. 有効成分単位ＣＤ.<p>
	 *
	 */
	public void cont_fctr_unit_cd(String value) {
		setConstString(offset + 47, $cont_fctr_unit_cd, value);
	}


	/**
	 * Active ingredient unit name 有効成分単位名.<p>
	 *
	 */
	public String cont_fctr_unit_nm() {
		return getConstString(offset + 48, $cont_fctr_unit_nm);
	}

	/**
	 * Active ingredient unit name 有効成分単位名.<p>
	 *
	 */
	public void cont_fctr_unit_nm(String value) {
		setConstString(offset + 48, $cont_fctr_unit_nm, value);
	}


	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public MCNumber cont_fctr_dec_place() {
		return getConstNumber(offset + 49, $cont_fctr_dec_place);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(MCNumber value) {
		setConstNumber(offset + 49, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(int value) {
		setConstNumber(offset + 49, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(long value) {
		setConstNumber(offset + 49, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(float value) {
		setConstNumber(offset + 49, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(double value) {
		setConstNumber(offset + 49, $cont_fctr_dec_place, value);
	}


	/**
	 * Storage factory/distribution warehouse cd. 格納工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String strg_site_cd() {
		return getConstString(offset + 50, $strg_site_cd);
	}

	/**
	 * Storage factory/distribution warehouse cd. 格納工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void strg_site_cd(String value) {
		setConstString(offset + 50, $strg_site_cd, value);
	}


	/**
	 * Storage factory/distribution warehouse name 格納工場・物流倉庫名.<p>
	 *
	 */
	public String strg_site_nm() {
		return getConstString(offset + 51, $strg_site_nm);
	}

	/**
	 * Storage factory/distribution warehouse name 格納工場・物流倉庫名.<p>
	 *
	 */
	public void strg_site_nm(String value) {
		setConstString(offset + 51, $strg_site_nm, value);
	}


	/**
	 * Storage distribution group cd. 格納物流グループＣＤ.<p>
	 *
	 */
	public String strg_lg_grp_cd() {
		return getConstString(offset + 52, $strg_lg_grp_cd);
	}

	/**
	 * Storage distribution group cd. 格納物流グループＣＤ.<p>
	 *
	 */
	public void strg_lg_grp_cd(String value) {
		setConstString(offset + 52, $strg_lg_grp_cd, value);
	}


	/**
	 * Storage distribution group name 格納物流グループ名.<p>
	 *
	 */
	public String strg_lg_grp_nm() {
		return getConstString(offset + 53, $strg_lg_grp_nm);
	}

	/**
	 * Storage distribution group name 格納物流グループ名.<p>
	 *
	 */
	public void strg_lg_grp_nm(String value) {
		setConstString(offset + 53, $strg_lg_grp_nm, value);
	}


	/**
	 * Storage WG cd. 格納ワーキンググループＣＤ.<p>
	 *
	 */
	public String strg_wg_cd() {
		return getConstString(offset + 54, $strg_wg_cd);
	}

	/**
	 * Storage WG cd. 格納ワーキンググループＣＤ.<p>
	 *
	 */
	public void strg_wg_cd(String value) {
		setConstString(offset + 54, $strg_wg_cd, value);
	}


	/**
	 * Storage WG name 格納ワーキンググループ名.<p>
	 *
	 */
	public String strg_wg_nm() {
		return getConstString(offset + 55, $strg_wg_nm);
	}

	/**
	 * Storage WG name 格納ワーキンググループ名.<p>
	 *
	 */
	public void strg_wg_nm(String value) {
		setConstString(offset + 55, $strg_wg_nm, value);
	}


	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public String rqst_wg_cd() {
		return getConstString(offset + 56, $rqst_wg_cd);
	}

	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public void rqst_wg_cd(String value) {
		setConstString(offset + 56, $rqst_wg_cd, value);
	}


	/**
	 * Requested WG name 依頼先ワーキンググループ名.<p>
	 *
	 */
	public String rqst_wg_nm() {
		return getConstString(offset + 57, $rqst_wg_nm);
	}

	/**
	 * Requested WG name 依頼先ワーキンググループ名.<p>
	 *
	 */
	public void rqst_wg_nm(String value) {
		setConstString(offset + 57, $rqst_wg_nm, value);
	}


	/**
	 * Shortage 不足.<p>
	 *
	 */
	public boolean shortage_flg() {
		return getConstBoolean(offset + 58, $shortage_flg);
	}

	/**
	 * Shortage 不足.<p>
	 *
	 */
	public void shortage_flg(boolean value) {
		setConstBoolean(offset + 58, $shortage_flg, value);
	}


	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public String gi_loc_cd() {
		return getConstString(offset + 59, $gi_loc_cd);
	}

	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public void gi_loc_cd(String value) {
		setConstString(offset + 59, $gi_loc_cd, value);
	}


	public String strg_sppl_cd() {
		return getConstString(offset + 60, $strg_sppl_cd);
	}

	public void strg_sppl_cd(String value) {
		setConstString(offset + 60, $strg_sppl_cd, value);
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
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			return strg_loc_cd();
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			return strg_loc_nm();
		}
		if ($op_rpl_mtd_typ.equalsIgnoreCase(name)) {
			return op_rpl_mtd_typ();
		}
		if ($op_rpl_mtd_typ_nm.equalsIgnoreCase(name)) {
			return op_rpl_mtd_typ_nm();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($mfg_loc_sppl_cd.equalsIgnoreCase(name)) {
			return mfg_loc_sppl_cd();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			return maker_nm();
		}
		if ($rqst_loc_cd.equalsIgnoreCase(name)) {
			return rqst_loc_cd();
		}
		if ($rqst_loc_nm.equalsIgnoreCase(name)) {
			return rqst_loc_nm();
		}
		if ($rqst_str_ln_cd.equalsIgnoreCase(name)) {
			return rqst_str_ln_cd();
		}
		if ($rqst_str_ln_nm.equalsIgnoreCase(name)) {
			return rqst_str_ln_nm();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			return sno1_mng_typ();
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			return sno2_mng_typ();
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			return sno3_mng_typ();
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			return sno4_mng_typ();
		}
		if ($cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			return cont_fctr_unit_cd();
		}
		if ($cont_fctr_unit_nm.equalsIgnoreCase(name)) {
			return cont_fctr_unit_nm();
		}
		if ($strg_site_cd.equalsIgnoreCase(name)) {
			return strg_site_cd();
		}
		if ($strg_site_nm.equalsIgnoreCase(name)) {
			return strg_site_nm();
		}
		if ($strg_lg_grp_cd.equalsIgnoreCase(name)) {
			return strg_lg_grp_cd();
		}
		if ($strg_lg_grp_nm.equalsIgnoreCase(name)) {
			return strg_lg_grp_nm();
		}
		if ($strg_wg_cd.equalsIgnoreCase(name)) {
			return strg_wg_cd();
		}
		if ($strg_wg_nm.equalsIgnoreCase(name)) {
			return strg_wg_nm();
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			return rqst_wg_cd();
		}
		if ($rqst_wg_nm.equalsIgnoreCase(name)) {
			return rqst_wg_nm();
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			return gi_loc_cd();
		}
		if ($strg_sppl_cd.equalsIgnoreCase(name)) {
			return strg_sppl_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($rqst_qty.equalsIgnoreCase(name)) {
			return rqst_qty();
		}
		if ($gr_schd_qty.equalsIgnoreCase(name)) {
			return gr_schd_qty();
		}
		if ($stk_qty.equalsIgnoreCase(name)) {
			return stk_qty();
		}
		if ($gi_schd_qty.equalsIgnoreCase(name)) {
			return gi_schd_qty();
		}
		if ($rord_stk_qty.equalsIgnoreCase(name)) {
			return rord_stk_qty();
		}
		if ($shortage_qty.equalsIgnoreCase(name)) {
			return shortage_qty();
		}
		if ($rord_rqst_qty.equalsIgnoreCase(name)) {
			return rord_rqst_qty();
		}
		if ($gr_schd_cont_qty.equalsIgnoreCase(name)) {
			return gr_schd_cont_qty();
		}
		if ($stk_cont_qty.equalsIgnoreCase(name)) {
			return stk_cont_qty();
		}
		if ($gi_schd_cont_qty.equalsIgnoreCase(name)) {
			return gi_schd_cont_qty();
		}
		if ($shortage_cont_qty.equalsIgnoreCase(name)) {
			return shortage_cont_qty();
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			return std_cont_fctr();
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($rqst_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return rqst_str_ln_tgt_flg();
		}
		if ($rqst_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return rqst_str_ln_cd_none_flg();
		}
		if ($gi_schd_flg.equalsIgnoreCase(name)) {
			return gi_schd_flg();
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($shortage_flg.equalsIgnoreCase(name)) {
			return shortage_flg();
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
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			return strg_loc_cd();
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			return strg_loc_nm();
		}
		if ($op_rpl_mtd_typ.equalsIgnoreCase(name)) {
			return op_rpl_mtd_typ();
		}
		if ($op_rpl_mtd_typ_nm.equalsIgnoreCase(name)) {
			return op_rpl_mtd_typ_nm();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($mfg_loc_sppl_cd.equalsIgnoreCase(name)) {
			return mfg_loc_sppl_cd();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			return maker_nm();
		}
		if ($rqst_loc_cd.equalsIgnoreCase(name)) {
			return rqst_loc_cd();
		}
		if ($rqst_loc_nm.equalsIgnoreCase(name)) {
			return rqst_loc_nm();
		}
		if ($rqst_str_ln_cd.equalsIgnoreCase(name)) {
			return rqst_str_ln_cd();
		}
		if ($rqst_str_ln_nm.equalsIgnoreCase(name)) {
			return rqst_str_ln_nm();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			return sno1_mng_typ();
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			return sno2_mng_typ();
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			return sno3_mng_typ();
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			return sno4_mng_typ();
		}
		if ($cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			return cont_fctr_unit_cd();
		}
		if ($cont_fctr_unit_nm.equalsIgnoreCase(name)) {
			return cont_fctr_unit_nm();
		}
		if ($strg_site_cd.equalsIgnoreCase(name)) {
			return strg_site_cd();
		}
		if ($strg_site_nm.equalsIgnoreCase(name)) {
			return strg_site_nm();
		}
		if ($strg_lg_grp_cd.equalsIgnoreCase(name)) {
			return strg_lg_grp_cd();
		}
		if ($strg_lg_grp_nm.equalsIgnoreCase(name)) {
			return strg_lg_grp_nm();
		}
		if ($strg_wg_cd.equalsIgnoreCase(name)) {
			return strg_wg_cd();
		}
		if ($strg_wg_nm.equalsIgnoreCase(name)) {
			return strg_wg_nm();
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			return rqst_wg_cd();
		}
		if ($rqst_wg_nm.equalsIgnoreCase(name)) {
			return rqst_wg_nm();
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			return gi_loc_cd();
		}
		if ($strg_sppl_cd.equalsIgnoreCase(name)) {
			return strg_sppl_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($rqst_qty.equalsIgnoreCase(name)) {
			return rqst_qty();
		}
		if ($gr_schd_qty.equalsIgnoreCase(name)) {
			return gr_schd_qty();
		}
		if ($stk_qty.equalsIgnoreCase(name)) {
			return stk_qty();
		}
		if ($gi_schd_qty.equalsIgnoreCase(name)) {
			return gi_schd_qty();
		}
		if ($rord_stk_qty.equalsIgnoreCase(name)) {
			return rord_stk_qty();
		}
		if ($shortage_qty.equalsIgnoreCase(name)) {
			return shortage_qty();
		}
		if ($rord_rqst_qty.equalsIgnoreCase(name)) {
			return rord_rqst_qty();
		}
		if ($gr_schd_cont_qty.equalsIgnoreCase(name)) {
			return gr_schd_cont_qty();
		}
		if ($stk_cont_qty.equalsIgnoreCase(name)) {
			return stk_cont_qty();
		}
		if ($gi_schd_cont_qty.equalsIgnoreCase(name)) {
			return gi_schd_cont_qty();
		}
		if ($shortage_cont_qty.equalsIgnoreCase(name)) {
			return shortage_cont_qty();
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			return std_cont_fctr();
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($rqst_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return rqst_str_ln_tgt_flg();
		}
		if ($rqst_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return rqst_str_ln_cd_none_flg();
		}
		if ($gi_schd_flg.equalsIgnoreCase(name)) {
			return gi_schd_flg();
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($shortage_flg.equalsIgnoreCase(name)) {
			return shortage_flg();
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
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
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
		if ($op_rpl_mtd_typ.equalsIgnoreCase(name)) {
			op_rpl_mtd_typ(value);
			return;
		}
		if ($op_rpl_mtd_typ_nm.equalsIgnoreCase(name)) {
			op_rpl_mtd_typ_nm(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			mfg_loc_nm(value);
			return;
		}
		if ($mfg_loc_sppl_cd.equalsIgnoreCase(name)) {
			mfg_loc_sppl_cd(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
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
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			maker_nm(value);
			return;
		}
		if ($rqst_loc_cd.equalsIgnoreCase(name)) {
			rqst_loc_cd(value);
			return;
		}
		if ($rqst_loc_nm.equalsIgnoreCase(name)) {
			rqst_loc_nm(value);
			return;
		}
		if ($rqst_str_ln_cd.equalsIgnoreCase(name)) {
			rqst_str_ln_cd(value);
			return;
		}
		if ($rqst_str_ln_nm.equalsIgnoreCase(name)) {
			rqst_str_ln_nm(value);
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
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			sno1_mng_typ(value);
			return;
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			sno2_mng_typ(value);
			return;
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			sno3_mng_typ(value);
			return;
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			sno4_mng_typ(value);
			return;
		}
		if ($cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			cont_fctr_unit_cd(value);
			return;
		}
		if ($cont_fctr_unit_nm.equalsIgnoreCase(name)) {
			cont_fctr_unit_nm(value);
			return;
		}
		if ($strg_site_cd.equalsIgnoreCase(name)) {
			strg_site_cd(value);
			return;
		}
		if ($strg_site_nm.equalsIgnoreCase(name)) {
			strg_site_nm(value);
			return;
		}
		if ($strg_lg_grp_cd.equalsIgnoreCase(name)) {
			strg_lg_grp_cd(value);
			return;
		}
		if ($strg_lg_grp_nm.equalsIgnoreCase(name)) {
			strg_lg_grp_nm(value);
			return;
		}
		if ($strg_wg_cd.equalsIgnoreCase(name)) {
			strg_wg_cd(value);
			return;
		}
		if ($strg_wg_nm.equalsIgnoreCase(name)) {
			strg_wg_nm(value);
			return;
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			rqst_wg_cd(value);
			return;
		}
		if ($rqst_wg_nm.equalsIgnoreCase(name)) {
			rqst_wg_nm(value);
			return;
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			gi_loc_cd(value);
			return;
		}
		if ($strg_sppl_cd.equalsIgnoreCase(name)) {
			strg_sppl_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
			return;
		}
		if ($gr_schd_qty.equalsIgnoreCase(name)) {
			gr_schd_qty(value);
			return;
		}
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($gi_schd_qty.equalsIgnoreCase(name)) {
			gi_schd_qty(value);
			return;
		}
		if ($rord_stk_qty.equalsIgnoreCase(name)) {
			rord_stk_qty(value);
			return;
		}
		if ($shortage_qty.equalsIgnoreCase(name)) {
			shortage_qty(value);
			return;
		}
		if ($rord_rqst_qty.equalsIgnoreCase(name)) {
			rord_rqst_qty(value);
			return;
		}
		if ($gr_schd_cont_qty.equalsIgnoreCase(name)) {
			gr_schd_cont_qty(value);
			return;
		}
		if ($stk_cont_qty.equalsIgnoreCase(name)) {
			stk_cont_qty(value);
			return;
		}
		if ($gi_schd_cont_qty.equalsIgnoreCase(name)) {
			gi_schd_cont_qty(value);
			return;
		}
		if ($shortage_cont_qty.equalsIgnoreCase(name)) {
			shortage_cont_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
			return;
		}
		if ($gr_schd_qty.equalsIgnoreCase(name)) {
			gr_schd_qty(value);
			return;
		}
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($gi_schd_qty.equalsIgnoreCase(name)) {
			gi_schd_qty(value);
			return;
		}
		if ($rord_stk_qty.equalsIgnoreCase(name)) {
			rord_stk_qty(value);
			return;
		}
		if ($shortage_qty.equalsIgnoreCase(name)) {
			shortage_qty(value);
			return;
		}
		if ($rord_rqst_qty.equalsIgnoreCase(name)) {
			rord_rqst_qty(value);
			return;
		}
		if ($gr_schd_cont_qty.equalsIgnoreCase(name)) {
			gr_schd_cont_qty(value);
			return;
		}
		if ($stk_cont_qty.equalsIgnoreCase(name)) {
			stk_cont_qty(value);
			return;
		}
		if ($gi_schd_cont_qty.equalsIgnoreCase(name)) {
			gi_schd_cont_qty(value);
			return;
		}
		if ($shortage_cont_qty.equalsIgnoreCase(name)) {
			shortage_cont_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
			return;
		}
		if ($gr_schd_qty.equalsIgnoreCase(name)) {
			gr_schd_qty(value);
			return;
		}
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($gi_schd_qty.equalsIgnoreCase(name)) {
			gi_schd_qty(value);
			return;
		}
		if ($rord_stk_qty.equalsIgnoreCase(name)) {
			rord_stk_qty(value);
			return;
		}
		if ($shortage_qty.equalsIgnoreCase(name)) {
			shortage_qty(value);
			return;
		}
		if ($rord_rqst_qty.equalsIgnoreCase(name)) {
			rord_rqst_qty(value);
			return;
		}
		if ($gr_schd_cont_qty.equalsIgnoreCase(name)) {
			gr_schd_cont_qty(value);
			return;
		}
		if ($stk_cont_qty.equalsIgnoreCase(name)) {
			stk_cont_qty(value);
			return;
		}
		if ($gi_schd_cont_qty.equalsIgnoreCase(name)) {
			gi_schd_cont_qty(value);
			return;
		}
		if ($shortage_cont_qty.equalsIgnoreCase(name)) {
			shortage_cont_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
			return;
		}
		if ($gr_schd_qty.equalsIgnoreCase(name)) {
			gr_schd_qty(value);
			return;
		}
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($gi_schd_qty.equalsIgnoreCase(name)) {
			gi_schd_qty(value);
			return;
		}
		if ($rord_stk_qty.equalsIgnoreCase(name)) {
			rord_stk_qty(value);
			return;
		}
		if ($shortage_qty.equalsIgnoreCase(name)) {
			shortage_qty(value);
			return;
		}
		if ($rord_rqst_qty.equalsIgnoreCase(name)) {
			rord_rqst_qty(value);
			return;
		}
		if ($gr_schd_cont_qty.equalsIgnoreCase(name)) {
			gr_schd_cont_qty(value);
			return;
		}
		if ($stk_cont_qty.equalsIgnoreCase(name)) {
			stk_cont_qty(value);
			return;
		}
		if ($gi_schd_cont_qty.equalsIgnoreCase(name)) {
			gi_schd_cont_qty(value);
			return;
		}
		if ($shortage_cont_qty.equalsIgnoreCase(name)) {
			shortage_cont_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
			return;
		}
		if ($gr_schd_qty.equalsIgnoreCase(name)) {
			gr_schd_qty(value);
			return;
		}
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($gi_schd_qty.equalsIgnoreCase(name)) {
			gi_schd_qty(value);
			return;
		}
		if ($rord_stk_qty.equalsIgnoreCase(name)) {
			rord_stk_qty(value);
			return;
		}
		if ($shortage_qty.equalsIgnoreCase(name)) {
			shortage_qty(value);
			return;
		}
		if ($rord_rqst_qty.equalsIgnoreCase(name)) {
			rord_rqst_qty(value);
			return;
		}
		if ($gr_schd_cont_qty.equalsIgnoreCase(name)) {
			gr_schd_cont_qty(value);
			return;
		}
		if ($stk_cont_qty.equalsIgnoreCase(name)) {
			stk_cont_qty(value);
			return;
		}
		if ($gi_schd_cont_qty.equalsIgnoreCase(name)) {
			gi_schd_cont_qty(value);
			return;
		}
		if ($shortage_cont_qty.equalsIgnoreCase(name)) {
			shortage_cont_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($rqst_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			rqst_str_ln_tgt_flg(value);
			return;
		}
		if ($rqst_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			rqst_str_ln_cd_none_flg(value);
			return;
		}
		if ($gi_schd_flg.equalsIgnoreCase(name)) {
			gi_schd_flg(value);
			return;
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($shortage_flg.equalsIgnoreCase(name)) {
			shortage_flg(value);
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
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
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
		if ($op_rpl_mtd_typ.equalsIgnoreCase(name)) {
			op_rpl_mtd_typ(value);
			return;
		}
		if ($op_rpl_mtd_typ_nm.equalsIgnoreCase(name)) {
			op_rpl_mtd_typ_nm(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			mfg_loc_nm(value);
			return;
		}
		if ($mfg_loc_sppl_cd.equalsIgnoreCase(name)) {
			mfg_loc_sppl_cd(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
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
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			maker_nm(value);
			return;
		}
		if ($rqst_loc_cd.equalsIgnoreCase(name)) {
			rqst_loc_cd(value);
			return;
		}
		if ($rqst_loc_nm.equalsIgnoreCase(name)) {
			rqst_loc_nm(value);
			return;
		}
		if ($rqst_str_ln_cd.equalsIgnoreCase(name)) {
			rqst_str_ln_cd(value);
			return;
		}
		if ($rqst_str_ln_nm.equalsIgnoreCase(name)) {
			rqst_str_ln_nm(value);
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
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			sno1_mng_typ(value);
			return;
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			sno2_mng_typ(value);
			return;
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			sno3_mng_typ(value);
			return;
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			sno4_mng_typ(value);
			return;
		}
		if ($cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			cont_fctr_unit_cd(value);
			return;
		}
		if ($cont_fctr_unit_nm.equalsIgnoreCase(name)) {
			cont_fctr_unit_nm(value);
			return;
		}
		if ($strg_site_cd.equalsIgnoreCase(name)) {
			strg_site_cd(value);
			return;
		}
		if ($strg_site_nm.equalsIgnoreCase(name)) {
			strg_site_nm(value);
			return;
		}
		if ($strg_lg_grp_cd.equalsIgnoreCase(name)) {
			strg_lg_grp_cd(value);
			return;
		}
		if ($strg_lg_grp_nm.equalsIgnoreCase(name)) {
			strg_lg_grp_nm(value);
			return;
		}
		if ($strg_wg_cd.equalsIgnoreCase(name)) {
			strg_wg_cd(value);
			return;
		}
		if ($strg_wg_nm.equalsIgnoreCase(name)) {
			strg_wg_nm(value);
			return;
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			rqst_wg_cd(value);
			return;
		}
		if ($rqst_wg_nm.equalsIgnoreCase(name)) {
			rqst_wg_nm(value);
			return;
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			gi_loc_cd(value);
			return;
		}
		if ($strg_sppl_cd.equalsIgnoreCase(name)) {
			strg_sppl_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
			return;
		}
		if ($gr_schd_qty.equalsIgnoreCase(name)) {
			gr_schd_qty(value);
			return;
		}
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($gi_schd_qty.equalsIgnoreCase(name)) {
			gi_schd_qty(value);
			return;
		}
		if ($rord_stk_qty.equalsIgnoreCase(name)) {
			rord_stk_qty(value);
			return;
		}
		if ($shortage_qty.equalsIgnoreCase(name)) {
			shortage_qty(value);
			return;
		}
		if ($rord_rqst_qty.equalsIgnoreCase(name)) {
			rord_rqst_qty(value);
			return;
		}
		if ($gr_schd_cont_qty.equalsIgnoreCase(name)) {
			gr_schd_cont_qty(value);
			return;
		}
		if ($stk_cont_qty.equalsIgnoreCase(name)) {
			stk_cont_qty(value);
			return;
		}
		if ($gi_schd_cont_qty.equalsIgnoreCase(name)) {
			gi_schd_cont_qty(value);
			return;
		}
		if ($shortage_cont_qty.equalsIgnoreCase(name)) {
			shortage_cont_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
			return;
		}
		if ($gr_schd_qty.equalsIgnoreCase(name)) {
			gr_schd_qty(value);
			return;
		}
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($gi_schd_qty.equalsIgnoreCase(name)) {
			gi_schd_qty(value);
			return;
		}
		if ($rord_stk_qty.equalsIgnoreCase(name)) {
			rord_stk_qty(value);
			return;
		}
		if ($shortage_qty.equalsIgnoreCase(name)) {
			shortage_qty(value);
			return;
		}
		if ($rord_rqst_qty.equalsIgnoreCase(name)) {
			rord_rqst_qty(value);
			return;
		}
		if ($gr_schd_cont_qty.equalsIgnoreCase(name)) {
			gr_schd_cont_qty(value);
			return;
		}
		if ($stk_cont_qty.equalsIgnoreCase(name)) {
			stk_cont_qty(value);
			return;
		}
		if ($gi_schd_cont_qty.equalsIgnoreCase(name)) {
			gi_schd_cont_qty(value);
			return;
		}
		if ($shortage_cont_qty.equalsIgnoreCase(name)) {
			shortage_cont_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
			return;
		}
		if ($gr_schd_qty.equalsIgnoreCase(name)) {
			gr_schd_qty(value);
			return;
		}
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($gi_schd_qty.equalsIgnoreCase(name)) {
			gi_schd_qty(value);
			return;
		}
		if ($rord_stk_qty.equalsIgnoreCase(name)) {
			rord_stk_qty(value);
			return;
		}
		if ($shortage_qty.equalsIgnoreCase(name)) {
			shortage_qty(value);
			return;
		}
		if ($rord_rqst_qty.equalsIgnoreCase(name)) {
			rord_rqst_qty(value);
			return;
		}
		if ($gr_schd_cont_qty.equalsIgnoreCase(name)) {
			gr_schd_cont_qty(value);
			return;
		}
		if ($stk_cont_qty.equalsIgnoreCase(name)) {
			stk_cont_qty(value);
			return;
		}
		if ($gi_schd_cont_qty.equalsIgnoreCase(name)) {
			gi_schd_cont_qty(value);
			return;
		}
		if ($shortage_cont_qty.equalsIgnoreCase(name)) {
			shortage_cont_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
			return;
		}
		if ($gr_schd_qty.equalsIgnoreCase(name)) {
			gr_schd_qty(value);
			return;
		}
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($gi_schd_qty.equalsIgnoreCase(name)) {
			gi_schd_qty(value);
			return;
		}
		if ($rord_stk_qty.equalsIgnoreCase(name)) {
			rord_stk_qty(value);
			return;
		}
		if ($shortage_qty.equalsIgnoreCase(name)) {
			shortage_qty(value);
			return;
		}
		if ($rord_rqst_qty.equalsIgnoreCase(name)) {
			rord_rqst_qty(value);
			return;
		}
		if ($gr_schd_cont_qty.equalsIgnoreCase(name)) {
			gr_schd_cont_qty(value);
			return;
		}
		if ($stk_cont_qty.equalsIgnoreCase(name)) {
			stk_cont_qty(value);
			return;
		}
		if ($gi_schd_cont_qty.equalsIgnoreCase(name)) {
			gi_schd_cont_qty(value);
			return;
		}
		if ($shortage_cont_qty.equalsIgnoreCase(name)) {
			shortage_cont_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
			return;
		}
		if ($gr_schd_qty.equalsIgnoreCase(name)) {
			gr_schd_qty(value);
			return;
		}
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($gi_schd_qty.equalsIgnoreCase(name)) {
			gi_schd_qty(value);
			return;
		}
		if ($rord_stk_qty.equalsIgnoreCase(name)) {
			rord_stk_qty(value);
			return;
		}
		if ($shortage_qty.equalsIgnoreCase(name)) {
			shortage_qty(value);
			return;
		}
		if ($rord_rqst_qty.equalsIgnoreCase(name)) {
			rord_rqst_qty(value);
			return;
		}
		if ($gr_schd_cont_qty.equalsIgnoreCase(name)) {
			gr_schd_cont_qty(value);
			return;
		}
		if ($stk_cont_qty.equalsIgnoreCase(name)) {
			stk_cont_qty(value);
			return;
		}
		if ($gi_schd_cont_qty.equalsIgnoreCase(name)) {
			gi_schd_cont_qty(value);
			return;
		}
		if ($shortage_cont_qty.equalsIgnoreCase(name)) {
			shortage_cont_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($rqst_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			rqst_str_ln_tgt_flg(value);
			return;
		}
		if ($rqst_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			rqst_str_ln_cd_none_flg(value);
			return;
		}
		if ($gi_schd_flg.equalsIgnoreCase(name)) {
			gi_schd_flg(value);
			return;
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($shortage_flg.equalsIgnoreCase(name)) {
			shortage_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

