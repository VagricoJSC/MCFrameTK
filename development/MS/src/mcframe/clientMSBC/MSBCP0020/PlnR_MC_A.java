package mcframe.clientMSBC.MSBCP0020;

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
 * ブロック"Pln"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class PlnR_MC_A extends MCConstRow {

	/**
	 * MPS group cd. MPSグループＣＤ.<p>
	 *
	 */
	public static final String $mps_grp_cd = "mps_grp_cd";
	/**
	 * MPS group name MPSグループ名.<p>
	 *
	 */
	public static final String $mps_grp_nm = "mps_grp_nm";
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
	 * Requested cd. 依頼先ＣＤ.<p>
	 *
	 */
	public static final String $rqst_loc_cd = "rqst_loc_cd";
	/**
	 * Requested-to name 依頼先名.<p>
	 *
	 */
	public static final String $rqst_loc_nm = "rqst_loc_nm";
	/**
	 * Procurement provider cd. 調達先ＣＤ.<p>
	 *
	 */
	public static final String $proc_cd = "proc_cd";
	/**
	 * Procurement provider name 調達先名.<p>
	 *
	 */
	public static final String $proc_nm = "proc_nm";
	/**
	 * Due date 納期.<p>
	 *
	 */
	public static final String $due_dt = "due_dt";
	/**
	 * Quantity 数量.<p>
	 *
	 */
	public static final String $rqmt_qty = "rqmt_qty";
	/**
	 * Long LT qty. 先行手配数量.<p>
	 *
	 */
	public static final String $prcd_rqmt_qty = "prcd_rqmt_qty";
	/**
	 * Shipping scheduled qty. 出荷予定数量.<p>
	 *
	 */
	public static final String $ship_schd_qty = "ship_schd_qty";
	/**
	 * Possible production qty. 生産可能数量.<p>
	 *
	 */
	public static final String $mps_max_qty = "mps_max_qty";
	/**
	 * Total qty. 合計数量.<p>
	 *
	 */
	public static final String $mps_sum_qty = "mps_sum_qty";
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public static final String $unit_cd = "unit_cd";
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public static final String $unit_nm = "unit_nm";
	/**
	 * Unit number of decimal places 単位小数部有効桁数.<p>
	 *
	 */
	public static final String $dec_place = "dec_place";
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
	 * SEIBAN No. 1 numbering type 手配ＮＯ１発番区分.<p>
	 *
	 */
	public static final String $sno1_num_typ = "sno1_num_typ";
	/**
	 * SEIBAN No. 2 numbering type 手配ＮＯ２発番区分.<p>
	 *
	 */
	public static final String $sno2_num_typ = "sno2_num_typ";
	/**
	 * SEIBAN No. 3 numbering type 手配ＮＯ３発番区分.<p>
	 *
	 */
	public static final String $sno3_num_typ = "sno3_num_typ";
	/**
	 * SEIBAN No. 4 numbering type 手配ＮＯ４発番区分.<p>
	 *
	 */
	public static final String $sno4_num_typ = "sno4_num_typ";
	/**
	 * Requirements SEIBAN No. 1 required 所要手配ＮＯ１必須.<p>
	 *
	 */
	public static final String $rqmt_sno1_flg = "rqmt_sno1_flg";
	/**
	 * Requirements SEIBAN No. 2 required 所要手配ＮＯ２必須.<p>
	 *
	 */
	public static final String $rqmt_sno2_flg = "rqmt_sno2_flg";
	/**
	 * Requirements SEIBAN No. 3 required 所要手配ＮＯ３必須.<p>
	 *
	 */
	public static final String $rqmt_sno3_flg = "rqmt_sno3_flg";
	/**
	 * Requirements SEIBAN No. 4 required 所要手配ＮＯ４必須.<p>
	 *
	 */
	public static final String $rqmt_sno4_flg = "rqmt_sno4_flg";
	/**
	 * Pegging No. 紐づけＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";


	public static final MCMeta mps_grp_cd_META = createCommonMeta($mps_grp_cd, mcframe.commonMA.meta.MA_META.MPS_GRP_CD);
	public static final MCMeta mps_grp_nm_META = createCommonMeta($mps_grp_nm, mcframe.commonMA.meta.MA_META.MPS_GRP_NM);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta strg_loc_cd_META = createCommonMeta($strg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta strg_loc_nm_META = createCommonMeta($strg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta mfg_loc_nm_META = createCommonMeta($mfg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta rqst_loc_cd_META = createCommonMeta($rqst_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta rqst_loc_nm_META = createCommonMeta($rqst_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta proc_cd_META = createStringMeta($proc_cd, 20);
	public static final MCMeta proc_nm_META = createStringMeta($proc_nm, 100);
	public static final MCMeta due_dt_META = createCommonMeta($due_dt, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta rqmt_qty_META = createCommonMeta($rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta prcd_rqmt_qty_META = createCommonMeta($prcd_rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta ship_schd_qty_META = createCommonMeta($ship_schd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta mps_max_qty_META = createCommonMeta($mps_max_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta mps_sum_qty_META = createCommonMeta($mps_sum_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta unit_nm_META = createCommonMeta($unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta site_nm_META = createCommonMeta($site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta sno1_mng_typ_META = createCommonMeta($sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno2_mng_typ_META = createCommonMeta($sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno3_mng_typ_META = createCommonMeta($sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno4_mng_typ_META = createCommonMeta($sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno1_num_typ_META = createCommonMeta($sno1_num_typ, mcframe.commonMA.meta.MA_META.SNO_NUM_TYP);
	public static final MCMeta sno2_num_typ_META = createCommonMeta($sno2_num_typ, mcframe.commonMA.meta.MA_META.SNO_NUM_TYP);
	public static final MCMeta sno3_num_typ_META = createCommonMeta($sno3_num_typ, mcframe.commonMA.meta.MA_META.SNO_NUM_TYP);
	public static final MCMeta sno4_num_typ_META = createCommonMeta($sno4_num_typ, mcframe.commonMA.meta.MA_META.SNO_NUM_TYP);
	public static final MCMeta rqmt_sno1_flg_META = createCommonMeta($rqmt_sno1_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rqmt_sno2_flg_META = createCommonMeta($rqmt_sno2_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rqmt_sno3_flg_META = createCommonMeta($rqmt_sno3_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rqmt_sno4_flg_META = createCommonMeta($rqmt_sno4_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);

	protected static final ConstMetaList<PlnR> constMetas = new ConstMetaList<PlnR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			mps_grp_cd_META,
			mps_grp_nm_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			strg_loc_cd_META,
			strg_loc_nm_META,
			mfg_loc_cd_META,
			mfg_loc_nm_META,
			sppl_cd_META,
			sppl_nm_META,
			rqst_loc_cd_META,
			rqst_loc_nm_META,
			proc_cd_META,
			proc_nm_META,
			due_dt_META,
			rqmt_qty_META,
			prcd_rqmt_qty_META,
			ship_schd_qty_META,
			mps_max_qty_META,
			mps_sum_qty_META,
			unit_cd_META,
			unit_nm_META,
			dec_place_META,
			site_cd_META,
			site_nm_META,
			wg_cd_META,
			wg_nm_META,
			sno1_mng_typ_META,
			sno2_mng_typ_META,
			sno3_mng_typ_META,
			sno4_mng_typ_META,
			sno1_num_typ_META,
			sno2_num_typ_META,
			sno3_num_typ_META,
			sno4_num_typ_META,
			rqmt_sno1_flg_META,
			rqmt_sno2_flg_META,
			rqmt_sno3_flg_META,
			rqmt_sno4_flg_META,
			peg_no_META
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
				{$mps_grp_cd, "HKEY"},	// mps_grp_cd
				{$mps_grp_nm, "HKEY"},	// mps_grp_nm
				{$itm_cd, "HKEY"},	// itm_cd
				{$itm_sub1, "HKEY"},	// itm_sub1
				{$itm_sub2, "HKEY"},	// itm_sub2
				{$itm_sub3, "HKEY"},	// itm_sub3
				{$itm_nm, "HKEY"},	// itm_nm
				{$strg_loc_cd, "HKEY"},	// strg_loc_cd
				{$strg_loc_nm, "HKEY"},	// strg_loc_nm
				{$mfg_loc_cd, "HKEY"},	// mfg_loc_cd
				{$mfg_loc_nm, "HKEY"},	// mfg_loc_nm
				{$sppl_cd, "HKEY"},	// sppl_cd
				{$sppl_nm, "HKEY"},	// sppl_nm
				{$rqst_loc_cd, "HKEY"},	// rqst_loc_cd
				{$rqst_loc_nm, "HKEY"},	// rqst_loc_nm
				{$proc_cd, "HKEY"},	// proc_cd
				{$proc_nm, "HKEY"},	// proc_nm
				{$due_dt, "ELM"},	// due_dt
				{$rqmt_qty, "HVAL"},	// rqmt_qty
				{$prcd_rqmt_qty, "HVAL"},	// prcd_rqmt_qty
				{$ship_schd_qty, "HVAL"},	// ship_schd_qty
				{$mps_max_qty, "HVAL"},	// mps_max_qty
				{$mps_sum_qty, "HVAL"},	// mps_sum_qty
				{$unit_cd, "HKEY"},	// unit_cd
				{$unit_nm, "HKEY"},	// unit_nm
				{$dec_place, "HKEY"},	// dec_place
				{$site_cd, "HKEY"},	// site_cd
				{$site_nm, "HKEY"},	// site_nm
				{$wg_cd, "HKEY"},	// wg_cd
				{$wg_nm, "HKEY"},	// wg_nm
				{$sno1_mng_typ, "HKEY"},	// sno1_mng_typ
				{$sno2_mng_typ, "HKEY"},	// sno2_mng_typ
				{$sno3_mng_typ, "HKEY"},	// sno3_mng_typ
				{$sno4_mng_typ, "HKEY"},	// sno4_mng_typ
				{$sno1_num_typ, "HKEY"},	// sno1_num_typ
				{$sno2_num_typ, "HKEY"},	// sno2_num_typ
				{$sno3_num_typ, "HKEY"},	// sno3_num_typ
				{$sno4_num_typ, "HKEY"},	// sno4_num_typ
				{$rqmt_sno1_flg, "HKEY"},	// rqmt_sno1_flg
				{$rqmt_sno2_flg, "HKEY"},	// rqmt_sno2_flg
				{$rqmt_sno3_flg, "HKEY"},	// rqmt_sno3_flg
				{$rqmt_sno4_flg, "HKEY"},	// rqmt_sno4_flg
				{$peg_no, "HKEY"}	// peg_no
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
				{$wg_cd, "SITE"},	// wg_cd
				{$wg_nm, "SITE"}	// wg_nm
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
	protected PlnR_MC_A(ConstMetaList<? extends PlnR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PlnR clone() {
		return (PlnR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PlnR createInstance() {
		return (PlnR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PlnR getValues(String... names) {
		return (PlnR) super.getValues(names);
	}



	/**
	 * MPS group cd. MPSグループＣＤ.<p>
	 *
	 */
	public String mps_grp_cd() {
		return getConstString(offset + 0, $mps_grp_cd);
	}

	/**
	 * MPS group cd. MPSグループＣＤ.<p>
	 *
	 */
	public void mps_grp_cd(String value) {
		setConstString(offset + 0, $mps_grp_cd, value);
	}


	/**
	 * MPS group name MPSグループ名.<p>
	 *
	 */
	public String mps_grp_nm() {
		return getConstString(offset + 1, $mps_grp_nm);
	}

	/**
	 * MPS group name MPSグループ名.<p>
	 *
	 */
	public void mps_grp_nm(String value) {
		setConstString(offset + 1, $mps_grp_nm, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 2, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 2, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 3, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 3, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 4, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 4, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 5, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 5, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 6, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 6, $itm_nm, value);
	}


	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public String strg_loc_cd() {
		return getConstString(offset + 7, $strg_loc_cd);
	}

	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public void strg_loc_cd(String value) {
		setConstString(offset + 7, $strg_loc_cd, value);
	}


	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public String strg_loc_nm() {
		return getConstString(offset + 8, $strg_loc_nm);
	}

	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public void strg_loc_nm(String value) {
		setConstString(offset + 8, $strg_loc_nm, value);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 9, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 9, $mfg_loc_cd, value);
	}


	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public String mfg_loc_nm() {
		return getConstString(offset + 10, $mfg_loc_nm);
	}

	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public void mfg_loc_nm(String value) {
		setConstString(offset + 10, $mfg_loc_nm, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 11, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 11, $sppl_cd, value);
	}


	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 12, $sppl_nm);
	}

	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 12, $sppl_nm, value);
	}


	/**
	 * Requested cd. 依頼先ＣＤ.<p>
	 *
	 */
	public String rqst_loc_cd() {
		return getConstString(offset + 13, $rqst_loc_cd);
	}

	/**
	 * Requested cd. 依頼先ＣＤ.<p>
	 *
	 */
	public void rqst_loc_cd(String value) {
		setConstString(offset + 13, $rqst_loc_cd, value);
	}


	/**
	 * Requested-to name 依頼先名.<p>
	 *
	 */
	public String rqst_loc_nm() {
		return getConstString(offset + 14, $rqst_loc_nm);
	}

	/**
	 * Requested-to name 依頼先名.<p>
	 *
	 */
	public void rqst_loc_nm(String value) {
		setConstString(offset + 14, $rqst_loc_nm, value);
	}


	/**
	 * Procurement provider cd. 調達先ＣＤ.<p>
	 *
	 */
	public String proc_cd() {
		return getConstString(offset + 15, $proc_cd);
	}

	/**
	 * Procurement provider cd. 調達先ＣＤ.<p>
	 *
	 */
	public void proc_cd(String value) {
		setConstString(offset + 15, $proc_cd, value);
	}


	/**
	 * Procurement provider name 調達先名.<p>
	 *
	 */
	public String proc_nm() {
		return getConstString(offset + 16, $proc_nm);
	}

	/**
	 * Procurement provider name 調達先名.<p>
	 *
	 */
	public void proc_nm(String value) {
		setConstString(offset + 16, $proc_nm, value);
	}


	/**
	 * Due date 納期.<p>
	 *
	 */
	public MCDate due_dt() {
		return getConstDate(offset + 17, $due_dt);
	}

	/**
	 * Due date 納期.<p>
	 *
	 */
	public void due_dt(MCDate value) {
		setConstDate(offset + 17, $due_dt, value);
	}


	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber rqmt_qty() {
		return getConstNumber(offset + 18, $rqmt_qty);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void rqmt_qty(MCNumber value) {
		setConstNumber(offset + 18, $rqmt_qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void rqmt_qty(int value) {
		setConstNumber(offset + 18, $rqmt_qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void rqmt_qty(long value) {
		setConstNumber(offset + 18, $rqmt_qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void rqmt_qty(float value) {
		setConstNumber(offset + 18, $rqmt_qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void rqmt_qty(double value) {
		setConstNumber(offset + 18, $rqmt_qty, value);
	}


	/**
	 * Long LT qty. 先行手配数量.<p>
	 *
	 */
	public MCNumber prcd_rqmt_qty() {
		return getConstNumber(offset + 19, $prcd_rqmt_qty);
	}

	/**
	 * Long LT qty. 先行手配数量.<p>
	 *
	 */
	public void prcd_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 19, $prcd_rqmt_qty, value);
	}

	/**
	 * Long LT qty. 先行手配数量.<p>
	 *
	 */
	public void prcd_rqmt_qty(int value) {
		setConstNumber(offset + 19, $prcd_rqmt_qty, value);
	}

	/**
	 * Long LT qty. 先行手配数量.<p>
	 *
	 */
	public void prcd_rqmt_qty(long value) {
		setConstNumber(offset + 19, $prcd_rqmt_qty, value);
	}

	/**
	 * Long LT qty. 先行手配数量.<p>
	 *
	 */
	public void prcd_rqmt_qty(float value) {
		setConstNumber(offset + 19, $prcd_rqmt_qty, value);
	}

	/**
	 * Long LT qty. 先行手配数量.<p>
	 *
	 */
	public void prcd_rqmt_qty(double value) {
		setConstNumber(offset + 19, $prcd_rqmt_qty, value);
	}


	/**
	 * Shipping scheduled qty. 出荷予定数量.<p>
	 *
	 */
	public MCNumber ship_schd_qty() {
		return getConstNumber(offset + 20, $ship_schd_qty);
	}

	/**
	 * Shipping scheduled qty. 出荷予定数量.<p>
	 *
	 */
	public void ship_schd_qty(MCNumber value) {
		setConstNumber(offset + 20, $ship_schd_qty, value);
	}

	/**
	 * Shipping scheduled qty. 出荷予定数量.<p>
	 *
	 */
	public void ship_schd_qty(int value) {
		setConstNumber(offset + 20, $ship_schd_qty, value);
	}

	/**
	 * Shipping scheduled qty. 出荷予定数量.<p>
	 *
	 */
	public void ship_schd_qty(long value) {
		setConstNumber(offset + 20, $ship_schd_qty, value);
	}

	/**
	 * Shipping scheduled qty. 出荷予定数量.<p>
	 *
	 */
	public void ship_schd_qty(float value) {
		setConstNumber(offset + 20, $ship_schd_qty, value);
	}

	/**
	 * Shipping scheduled qty. 出荷予定数量.<p>
	 *
	 */
	public void ship_schd_qty(double value) {
		setConstNumber(offset + 20, $ship_schd_qty, value);
	}


	/**
	 * Possible production qty. 生産可能数量.<p>
	 *
	 */
	public MCNumber mps_max_qty() {
		return getConstNumber(offset + 21, $mps_max_qty);
	}

	/**
	 * Possible production qty. 生産可能数量.<p>
	 *
	 */
	public void mps_max_qty(MCNumber value) {
		setConstNumber(offset + 21, $mps_max_qty, value);
	}

	/**
	 * Possible production qty. 生産可能数量.<p>
	 *
	 */
	public void mps_max_qty(int value) {
		setConstNumber(offset + 21, $mps_max_qty, value);
	}

	/**
	 * Possible production qty. 生産可能数量.<p>
	 *
	 */
	public void mps_max_qty(long value) {
		setConstNumber(offset + 21, $mps_max_qty, value);
	}

	/**
	 * Possible production qty. 生産可能数量.<p>
	 *
	 */
	public void mps_max_qty(float value) {
		setConstNumber(offset + 21, $mps_max_qty, value);
	}

	/**
	 * Possible production qty. 生産可能数量.<p>
	 *
	 */
	public void mps_max_qty(double value) {
		setConstNumber(offset + 21, $mps_max_qty, value);
	}


	/**
	 * Total qty. 合計数量.<p>
	 *
	 */
	public MCNumber mps_sum_qty() {
		return getConstNumber(offset + 22, $mps_sum_qty);
	}

	/**
	 * Total qty. 合計数量.<p>
	 *
	 */
	public void mps_sum_qty(MCNumber value) {
		setConstNumber(offset + 22, $mps_sum_qty, value);
	}

	/**
	 * Total qty. 合計数量.<p>
	 *
	 */
	public void mps_sum_qty(int value) {
		setConstNumber(offset + 22, $mps_sum_qty, value);
	}

	/**
	 * Total qty. 合計数量.<p>
	 *
	 */
	public void mps_sum_qty(long value) {
		setConstNumber(offset + 22, $mps_sum_qty, value);
	}

	/**
	 * Total qty. 合計数量.<p>
	 *
	 */
	public void mps_sum_qty(float value) {
		setConstNumber(offset + 22, $mps_sum_qty, value);
	}

	/**
	 * Total qty. 合計数量.<p>
	 *
	 */
	public void mps_sum_qty(double value) {
		setConstNumber(offset + 22, $mps_sum_qty, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 23, $unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 23, $unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String unit_nm() {
		return getConstString(offset + 24, $unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void unit_nm(String value) {
		setConstString(offset + 24, $unit_nm, value);
	}


	/**
	 * Unit number of decimal places 単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 25, $dec_place);
	}

	/**
	 * Unit number of decimal places 単位小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 25, $dec_place, value);
	}

	/**
	 * Unit number of decimal places 単位小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 25, $dec_place, value);
	}

	/**
	 * Unit number of decimal places 単位小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 25, $dec_place, value);
	}

	/**
	 * Unit number of decimal places 単位小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 25, $dec_place, value);
	}

	/**
	 * Unit number of decimal places 単位小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 25, $dec_place, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 26, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 26, $site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 27, $site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 27, $site_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 28, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 28, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 29, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 29, $wg_nm, value);
	}


	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return getConstString(offset + 30, $sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		setConstString(offset + 30, $sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return getConstString(offset + 31, $sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		setConstString(offset + 31, $sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return getConstString(offset + 32, $sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		setConstString(offset + 32, $sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return getConstString(offset + 33, $sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		setConstString(offset + 33, $sno4_mng_typ, value);
	}


	/**
	 * SEIBAN No. 1 numbering type 手配ＮＯ１発番区分.<p>
	 *
	 */
	public String sno1_num_typ() {
		return getConstString(offset + 34, $sno1_num_typ);
	}

	/**
	 * SEIBAN No. 1 numbering type 手配ＮＯ１発番区分.<p>
	 *
	 */
	public void sno1_num_typ(String value) {
		setConstString(offset + 34, $sno1_num_typ, value);
	}


	/**
	 * SEIBAN No. 2 numbering type 手配ＮＯ２発番区分.<p>
	 *
	 */
	public String sno2_num_typ() {
		return getConstString(offset + 35, $sno2_num_typ);
	}

	/**
	 * SEIBAN No. 2 numbering type 手配ＮＯ２発番区分.<p>
	 *
	 */
	public void sno2_num_typ(String value) {
		setConstString(offset + 35, $sno2_num_typ, value);
	}


	/**
	 * SEIBAN No. 3 numbering type 手配ＮＯ３発番区分.<p>
	 *
	 */
	public String sno3_num_typ() {
		return getConstString(offset + 36, $sno3_num_typ);
	}

	/**
	 * SEIBAN No. 3 numbering type 手配ＮＯ３発番区分.<p>
	 *
	 */
	public void sno3_num_typ(String value) {
		setConstString(offset + 36, $sno3_num_typ, value);
	}


	/**
	 * SEIBAN No. 4 numbering type 手配ＮＯ４発番区分.<p>
	 *
	 */
	public String sno4_num_typ() {
		return getConstString(offset + 37, $sno4_num_typ);
	}

	/**
	 * SEIBAN No. 4 numbering type 手配ＮＯ４発番区分.<p>
	 *
	 */
	public void sno4_num_typ(String value) {
		setConstString(offset + 37, $sno4_num_typ, value);
	}


	/**
	 * Requirements SEIBAN No. 1 required 所要手配ＮＯ１必須.<p>
	 *
	 */
	public boolean rqmt_sno1_flg() {
		return getConstBoolean(offset + 38, $rqmt_sno1_flg);
	}

	/**
	 * Requirements SEIBAN No. 1 required 所要手配ＮＯ１必須.<p>
	 *
	 */
	public void rqmt_sno1_flg(boolean value) {
		setConstBoolean(offset + 38, $rqmt_sno1_flg, value);
	}


	/**
	 * Requirements SEIBAN No. 2 required 所要手配ＮＯ２必須.<p>
	 *
	 */
	public boolean rqmt_sno2_flg() {
		return getConstBoolean(offset + 39, $rqmt_sno2_flg);
	}

	/**
	 * Requirements SEIBAN No. 2 required 所要手配ＮＯ２必須.<p>
	 *
	 */
	public void rqmt_sno2_flg(boolean value) {
		setConstBoolean(offset + 39, $rqmt_sno2_flg, value);
	}


	/**
	 * Requirements SEIBAN No. 3 required 所要手配ＮＯ３必須.<p>
	 *
	 */
	public boolean rqmt_sno3_flg() {
		return getConstBoolean(offset + 40, $rqmt_sno3_flg);
	}

	/**
	 * Requirements SEIBAN No. 3 required 所要手配ＮＯ３必須.<p>
	 *
	 */
	public void rqmt_sno3_flg(boolean value) {
		setConstBoolean(offset + 40, $rqmt_sno3_flg, value);
	}


	/**
	 * Requirements SEIBAN No. 4 required 所要手配ＮＯ４必須.<p>
	 *
	 */
	public boolean rqmt_sno4_flg() {
		return getConstBoolean(offset + 41, $rqmt_sno4_flg);
	}

	/**
	 * Requirements SEIBAN No. 4 required 所要手配ＮＯ４必須.<p>
	 *
	 */
	public void rqmt_sno4_flg(boolean value) {
		setConstBoolean(offset + 41, $rqmt_sno4_flg, value);
	}


	/**
	 * Pegging No. 紐づけＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 42, $peg_no);
	}

	/**
	 * Pegging No. 紐づけＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 42, $peg_no, value);
	}

	/**
	 * Pegging No. 紐づけＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 42, $peg_no, value);
	}

	/**
	 * Pegging No. 紐づけＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 42, $peg_no, value);
	}

	/**
	 * Pegging No. 紐づけＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 42, $peg_no, value);
	}

	/**
	 * Pegging No. 紐づけＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 42, $peg_no, value);
	}


	public String getString(String name) {
		if ($mps_grp_cd.equalsIgnoreCase(name)) {
			return mps_grp_cd();
		}
		if ($mps_grp_nm.equalsIgnoreCase(name)) {
			return mps_grp_nm();
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
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			return strg_loc_cd();
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			return strg_loc_nm();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($rqst_loc_cd.equalsIgnoreCase(name)) {
			return rqst_loc_cd();
		}
		if ($rqst_loc_nm.equalsIgnoreCase(name)) {
			return rqst_loc_nm();
		}
		if ($proc_cd.equalsIgnoreCase(name)) {
			return proc_cd();
		}
		if ($proc_nm.equalsIgnoreCase(name)) {
			return proc_nm();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
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
		if ($sno1_num_typ.equalsIgnoreCase(name)) {
			return sno1_num_typ();
		}
		if ($sno2_num_typ.equalsIgnoreCase(name)) {
			return sno2_num_typ();
		}
		if ($sno3_num_typ.equalsIgnoreCase(name)) {
			return sno3_num_typ();
		}
		if ($sno4_num_typ.equalsIgnoreCase(name)) {
			return sno4_num_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($rqmt_qty.equalsIgnoreCase(name)) {
			return rqmt_qty();
		}
		if ($prcd_rqmt_qty.equalsIgnoreCase(name)) {
			return prcd_rqmt_qty();
		}
		if ($ship_schd_qty.equalsIgnoreCase(name)) {
			return ship_schd_qty();
		}
		if ($mps_max_qty.equalsIgnoreCase(name)) {
			return mps_max_qty();
		}
		if ($mps_sum_qty.equalsIgnoreCase(name)) {
			return mps_sum_qty();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($due_dt.equalsIgnoreCase(name)) {
			return due_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($rqmt_sno1_flg.equalsIgnoreCase(name)) {
			return rqmt_sno1_flg();
		}
		if ($rqmt_sno2_flg.equalsIgnoreCase(name)) {
			return rqmt_sno2_flg();
		}
		if ($rqmt_sno3_flg.equalsIgnoreCase(name)) {
			return rqmt_sno3_flg();
		}
		if ($rqmt_sno4_flg.equalsIgnoreCase(name)) {
			return rqmt_sno4_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($mps_grp_cd.equalsIgnoreCase(name)) {
			return mps_grp_cd();
		}
		if ($mps_grp_nm.equalsIgnoreCase(name)) {
			return mps_grp_nm();
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
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			return strg_loc_cd();
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			return strg_loc_nm();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($rqst_loc_cd.equalsIgnoreCase(name)) {
			return rqst_loc_cd();
		}
		if ($rqst_loc_nm.equalsIgnoreCase(name)) {
			return rqst_loc_nm();
		}
		if ($proc_cd.equalsIgnoreCase(name)) {
			return proc_cd();
		}
		if ($proc_nm.equalsIgnoreCase(name)) {
			return proc_nm();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
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
		if ($sno1_num_typ.equalsIgnoreCase(name)) {
			return sno1_num_typ();
		}
		if ($sno2_num_typ.equalsIgnoreCase(name)) {
			return sno2_num_typ();
		}
		if ($sno3_num_typ.equalsIgnoreCase(name)) {
			return sno3_num_typ();
		}
		if ($sno4_num_typ.equalsIgnoreCase(name)) {
			return sno4_num_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($rqmt_qty.equalsIgnoreCase(name)) {
			return rqmt_qty();
		}
		if ($prcd_rqmt_qty.equalsIgnoreCase(name)) {
			return prcd_rqmt_qty();
		}
		if ($ship_schd_qty.equalsIgnoreCase(name)) {
			return ship_schd_qty();
		}
		if ($mps_max_qty.equalsIgnoreCase(name)) {
			return mps_max_qty();
		}
		if ($mps_sum_qty.equalsIgnoreCase(name)) {
			return mps_sum_qty();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($due_dt.equalsIgnoreCase(name)) {
			return due_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($rqmt_sno1_flg.equalsIgnoreCase(name)) {
			return rqmt_sno1_flg();
		}
		if ($rqmt_sno2_flg.equalsIgnoreCase(name)) {
			return rqmt_sno2_flg();
		}
		if ($rqmt_sno3_flg.equalsIgnoreCase(name)) {
			return rqmt_sno3_flg();
		}
		if ($rqmt_sno4_flg.equalsIgnoreCase(name)) {
			return rqmt_sno4_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($mps_grp_cd.equalsIgnoreCase(name)) {
			mps_grp_cd(value);
			return;
		}
		if ($mps_grp_nm.equalsIgnoreCase(name)) {
			mps_grp_nm(value);
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
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			strg_loc_cd(value);
			return;
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			strg_loc_nm(value);
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
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
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
		if ($proc_cd.equalsIgnoreCase(name)) {
			proc_cd(value);
			return;
		}
		if ($proc_nm.equalsIgnoreCase(name)) {
			proc_nm(value);
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
		if ($sno1_num_typ.equalsIgnoreCase(name)) {
			sno1_num_typ(value);
			return;
		}
		if ($sno2_num_typ.equalsIgnoreCase(name)) {
			sno2_num_typ(value);
			return;
		}
		if ($sno3_num_typ.equalsIgnoreCase(name)) {
			sno3_num_typ(value);
			return;
		}
		if ($sno4_num_typ.equalsIgnoreCase(name)) {
			sno4_num_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($rqmt_qty.equalsIgnoreCase(name)) {
			rqmt_qty(value);
			return;
		}
		if ($prcd_rqmt_qty.equalsIgnoreCase(name)) {
			prcd_rqmt_qty(value);
			return;
		}
		if ($ship_schd_qty.equalsIgnoreCase(name)) {
			ship_schd_qty(value);
			return;
		}
		if ($mps_max_qty.equalsIgnoreCase(name)) {
			mps_max_qty(value);
			return;
		}
		if ($mps_sum_qty.equalsIgnoreCase(name)) {
			mps_sum_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($rqmt_qty.equalsIgnoreCase(name)) {
			rqmt_qty(value);
			return;
		}
		if ($prcd_rqmt_qty.equalsIgnoreCase(name)) {
			prcd_rqmt_qty(value);
			return;
		}
		if ($ship_schd_qty.equalsIgnoreCase(name)) {
			ship_schd_qty(value);
			return;
		}
		if ($mps_max_qty.equalsIgnoreCase(name)) {
			mps_max_qty(value);
			return;
		}
		if ($mps_sum_qty.equalsIgnoreCase(name)) {
			mps_sum_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($rqmt_qty.equalsIgnoreCase(name)) {
			rqmt_qty(value);
			return;
		}
		if ($prcd_rqmt_qty.equalsIgnoreCase(name)) {
			prcd_rqmt_qty(value);
			return;
		}
		if ($ship_schd_qty.equalsIgnoreCase(name)) {
			ship_schd_qty(value);
			return;
		}
		if ($mps_max_qty.equalsIgnoreCase(name)) {
			mps_max_qty(value);
			return;
		}
		if ($mps_sum_qty.equalsIgnoreCase(name)) {
			mps_sum_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($rqmt_qty.equalsIgnoreCase(name)) {
			rqmt_qty(value);
			return;
		}
		if ($prcd_rqmt_qty.equalsIgnoreCase(name)) {
			prcd_rqmt_qty(value);
			return;
		}
		if ($ship_schd_qty.equalsIgnoreCase(name)) {
			ship_schd_qty(value);
			return;
		}
		if ($mps_max_qty.equalsIgnoreCase(name)) {
			mps_max_qty(value);
			return;
		}
		if ($mps_sum_qty.equalsIgnoreCase(name)) {
			mps_sum_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($rqmt_qty.equalsIgnoreCase(name)) {
			rqmt_qty(value);
			return;
		}
		if ($prcd_rqmt_qty.equalsIgnoreCase(name)) {
			prcd_rqmt_qty(value);
			return;
		}
		if ($ship_schd_qty.equalsIgnoreCase(name)) {
			ship_schd_qty(value);
			return;
		}
		if ($mps_max_qty.equalsIgnoreCase(name)) {
			mps_max_qty(value);
			return;
		}
		if ($mps_sum_qty.equalsIgnoreCase(name)) {
			mps_sum_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($due_dt.equalsIgnoreCase(name)) {
			due_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($rqmt_sno1_flg.equalsIgnoreCase(name)) {
			rqmt_sno1_flg(value);
			return;
		}
		if ($rqmt_sno2_flg.equalsIgnoreCase(name)) {
			rqmt_sno2_flg(value);
			return;
		}
		if ($rqmt_sno3_flg.equalsIgnoreCase(name)) {
			rqmt_sno3_flg(value);
			return;
		}
		if ($rqmt_sno4_flg.equalsIgnoreCase(name)) {
			rqmt_sno4_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($mps_grp_cd.equalsIgnoreCase(name)) {
			mps_grp_cd(value);
			return;
		}
		if ($mps_grp_nm.equalsIgnoreCase(name)) {
			mps_grp_nm(value);
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
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			strg_loc_cd(value);
			return;
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			strg_loc_nm(value);
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
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
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
		if ($proc_cd.equalsIgnoreCase(name)) {
			proc_cd(value);
			return;
		}
		if ($proc_nm.equalsIgnoreCase(name)) {
			proc_nm(value);
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
		if ($sno1_num_typ.equalsIgnoreCase(name)) {
			sno1_num_typ(value);
			return;
		}
		if ($sno2_num_typ.equalsIgnoreCase(name)) {
			sno2_num_typ(value);
			return;
		}
		if ($sno3_num_typ.equalsIgnoreCase(name)) {
			sno3_num_typ(value);
			return;
		}
		if ($sno4_num_typ.equalsIgnoreCase(name)) {
			sno4_num_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($rqmt_qty.equalsIgnoreCase(name)) {
			rqmt_qty(value);
			return;
		}
		if ($prcd_rqmt_qty.equalsIgnoreCase(name)) {
			prcd_rqmt_qty(value);
			return;
		}
		if ($ship_schd_qty.equalsIgnoreCase(name)) {
			ship_schd_qty(value);
			return;
		}
		if ($mps_max_qty.equalsIgnoreCase(name)) {
			mps_max_qty(value);
			return;
		}
		if ($mps_sum_qty.equalsIgnoreCase(name)) {
			mps_sum_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($rqmt_qty.equalsIgnoreCase(name)) {
			rqmt_qty(value);
			return;
		}
		if ($prcd_rqmt_qty.equalsIgnoreCase(name)) {
			prcd_rqmt_qty(value);
			return;
		}
		if ($ship_schd_qty.equalsIgnoreCase(name)) {
			ship_schd_qty(value);
			return;
		}
		if ($mps_max_qty.equalsIgnoreCase(name)) {
			mps_max_qty(value);
			return;
		}
		if ($mps_sum_qty.equalsIgnoreCase(name)) {
			mps_sum_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($rqmt_qty.equalsIgnoreCase(name)) {
			rqmt_qty(value);
			return;
		}
		if ($prcd_rqmt_qty.equalsIgnoreCase(name)) {
			prcd_rqmt_qty(value);
			return;
		}
		if ($ship_schd_qty.equalsIgnoreCase(name)) {
			ship_schd_qty(value);
			return;
		}
		if ($mps_max_qty.equalsIgnoreCase(name)) {
			mps_max_qty(value);
			return;
		}
		if ($mps_sum_qty.equalsIgnoreCase(name)) {
			mps_sum_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($rqmt_qty.equalsIgnoreCase(name)) {
			rqmt_qty(value);
			return;
		}
		if ($prcd_rqmt_qty.equalsIgnoreCase(name)) {
			prcd_rqmt_qty(value);
			return;
		}
		if ($ship_schd_qty.equalsIgnoreCase(name)) {
			ship_schd_qty(value);
			return;
		}
		if ($mps_max_qty.equalsIgnoreCase(name)) {
			mps_max_qty(value);
			return;
		}
		if ($mps_sum_qty.equalsIgnoreCase(name)) {
			mps_sum_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($rqmt_qty.equalsIgnoreCase(name)) {
			rqmt_qty(value);
			return;
		}
		if ($prcd_rqmt_qty.equalsIgnoreCase(name)) {
			prcd_rqmt_qty(value);
			return;
		}
		if ($ship_schd_qty.equalsIgnoreCase(name)) {
			ship_schd_qty(value);
			return;
		}
		if ($mps_max_qty.equalsIgnoreCase(name)) {
			mps_max_qty(value);
			return;
		}
		if ($mps_sum_qty.equalsIgnoreCase(name)) {
			mps_sum_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($due_dt.equalsIgnoreCase(name)) {
			due_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($rqmt_sno1_flg.equalsIgnoreCase(name)) {
			rqmt_sno1_flg(value);
			return;
		}
		if ($rqmt_sno2_flg.equalsIgnoreCase(name)) {
			rqmt_sno2_flg(value);
			return;
		}
		if ($rqmt_sno3_flg.equalsIgnoreCase(name)) {
			rqmt_sno3_flg(value);
			return;
		}
		if ($rqmt_sno4_flg.equalsIgnoreCase(name)) {
			rqmt_sno4_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

