package mcframe.clientMSBA.MSBAP0050;

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
	 * UPD,Create/Modify;REF,Display supply plan list;MON,Display monthly aggregation UPD,登録・訂正する;REF,供給計画を一覧表示する;MON,月次集計を表示する.<p>
	 *
	 */
	public static final String $ope = "ope";
	/**
	 * Display breakdown of demand info. 需要情報の内訳を表示.<p>
	 *
	 */
	public static final String $dmndDtl = "dmndDtl";
	/**
	 * Display inventory forecasting for simulation シミュレーション在庫推移を表示.<p>
	 *
	 */
	public static final String $sim = "sim";
	/**
	 * Display last supply plan 前回供給計画を表示.<p>
	 *
	 */
	public static final String $oldSpply = "oldSpply";
	/**
	 * Display target date only 対象日のみ表示.<p>
	 *
	 */
	public static final String $selectDlyDisp = "selectDlyDisp";
	/**
	 * Term FROM 対象期間ＦＲＯＭ.<p>
	 *
	 */
	public static final String $dmnd_dt_fr = "dmnd_dt_fr";
	/**
	 * Term TO 対象期間ＴＯ.<p>
	 *
	 */
	public static final String $dmnd_dt_to = "dmnd_dt_to";
	/**
	 * To adjust 調整対象.<p>
	 *
	 */
	public static final String $adjst_tgt_flg = "adjst_tgt_flg";
	/**
	 * Not to adjust 調整対象外.<p>
	 *
	 */
	public static final String $adjst_not_tgt_flg = "adjst_not_tgt_flg";
	/**
	 * Demand location cd. 需要場所ＣＤ.<p>
	 *
	 */
	public static final String $dmnd_loc_cd = "dmnd_loc_cd";
	/**
	 * Demand location name 需要場所名.<p>
	 *
	 */
	public static final String $dmnd_loc_nm = "dmnd_loc_nm";
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
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public static final String $loc_grp_cd = "loc_grp_cd";
	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public static final String $loc_grp_nm = "loc_grp_nm";
	public static final String $itm_typ_p = "itm_typ_p";
	public static final String $itm_p = "itm_p";
	/**
	 * Simulation No. シミュレーションＮＯ.<p>
	 *
	 */
	public static final String $sim_mrp_no = "sim_mrp_no";
	/**
	 * Auto apply simulation result シミュレーション結果を自動反映.<p>
	 *
	 */
	public static final String $sim_auto_ref_flg = "sim_auto_ref_flg";
	/**
	 * Apply mfg. location, supplier/request destination location 製造場所・発注先・依頼先場所も反映.<p>
	 *
	 */
	public static final String $rqst_inc_flg = "rqst_inc_flg";
	/**
	 * Negative inventory only マイナス在庫のみ.<p>
	 *
	 */
	public static final String $minus_stk_flg = "minus_stk_flg";
	/**
	 * Supply on non-working days is non-enterable 非稼働日の供給入力不可.<p>
	 *
	 */
	public static final String $non_spply_ent_flg = "non_spply_ent_flg";
	/**
	 * Consider fluctuation inventory 安全在庫を考慮.<p>
	 *
	 */
	public static final String $buf_qty_flg = "buf_qty_flg";
	/**
	 * Conforming item only 良品のみ.<p>
	 *
	 */
	public static final String $quality_typ_good_flg = "quality_typ_good_flg";
	public static final String $itm_grp_p = "itm_grp_p";

	public static final String $itm_typ = $itm_typ_p + ".itm_typ";
	public static final String $itm_typ_d_cd = $itm_typ_p + ".itm_typ_d_cd";
	public static final String $itm_typ_d_nm = $itm_typ_p + ".itm_typ_d_nm";
	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $itm_grp_flg1 = $itm_grp_p + ".itm_grp_flg1";
	public static final String $itm_grp_cd1 = $itm_grp_p + ".itm_grp_cd1";
	public static final String $itm_grp_nm1 = $itm_grp_p + ".itm_grp_nm1";
	public static final String $itm_grp_flg2 = $itm_grp_p + ".itm_grp_flg2";
	public static final String $itm_grp_cd2 = $itm_grp_p + ".itm_grp_cd2";
	public static final String $itm_grp_nm2 = $itm_grp_p + ".itm_grp_nm2";
	public static final String $itm_grp_flg3 = $itm_grp_p + ".itm_grp_flg3";
	public static final String $itm_grp_cd3 = $itm_grp_p + ".itm_grp_cd3";
	public static final String $itm_grp_nm3 = $itm_grp_p + ".itm_grp_nm3";
	public static final String $itm_grp_flg4 = $itm_grp_p + ".itm_grp_flg4";
	public static final String $itm_grp_cd4 = $itm_grp_p + ".itm_grp_cd4";
	public static final String $itm_grp_nm4 = $itm_grp_p + ".itm_grp_nm4";
	public static final String $itm_grp_flg5 = $itm_grp_p + ".itm_grp_flg5";
	public static final String $itm_grp_cd5 = $itm_grp_p + ".itm_grp_cd5";
	public static final String $itm_grp_nm5 = $itm_grp_p + ".itm_grp_nm5";
	public static final String $itm_grp_flg6 = $itm_grp_p + ".itm_grp_flg6";
	public static final String $itm_grp_cd6 = $itm_grp_p + ".itm_grp_cd6";
	public static final String $itm_grp_nm6 = $itm_grp_p + ".itm_grp_nm6";
	public static final String $itm_grp_flg7 = $itm_grp_p + ".itm_grp_flg7";
	public static final String $itm_grp_cd7 = $itm_grp_p + ".itm_grp_cd7";
	public static final String $itm_grp_nm7 = $itm_grp_p + ".itm_grp_nm7";
	public static final String $itm_grp_flg8 = $itm_grp_p + ".itm_grp_flg8";
	public static final String $itm_grp_cd8 = $itm_grp_p + ".itm_grp_cd8";
	public static final String $itm_grp_nm8 = $itm_grp_p + ".itm_grp_nm8";
	public static final String $itm_grp_flg9 = $itm_grp_p + ".itm_grp_flg9";
	public static final String $itm_grp_cd9 = $itm_grp_p + ".itm_grp_cd9";
	public static final String $itm_grp_nm9 = $itm_grp_p + ".itm_grp_nm9";
	public static final String $itm_grp_flg10 = $itm_grp_p + ".itm_grp_flg10";
	public static final String $itm_grp_cd10 = $itm_grp_p + ".itm_grp_cd10";
	public static final String $itm_grp_nm10 = $itm_grp_p + ".itm_grp_nm10";

	public static final MCMeta ope_META = createStringMeta($ope);
	public static final MCMeta dmndDtl_META = createCommonMeta($dmndDtl, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sim_META = createCommonMeta($sim, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta oldSpply_META = createCommonMeta($oldSpply, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta selectDlyDisp_META = createCommonMeta($selectDlyDisp, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dmnd_dt_fr_META = createCommonMeta($dmnd_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dmnd_dt_to_META = createCommonMeta($dmnd_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta adjst_tgt_flg_META = createCommonMeta($adjst_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta adjst_not_tgt_flg_META = createCommonMeta($adjst_not_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dmnd_loc_cd_META = createCommonMeta($dmnd_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta dmnd_loc_nm_META = createCommonMeta($dmnd_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta site_nm_META = createCommonMeta($site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta lg_grp_cd_META = createCommonMeta($lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta lg_grp_nm_META = createCommonMeta($lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta loc_grp_cd_META = createCommonMeta($loc_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta loc_grp_nm_META = createCommonMeta($loc_grp_nm, mcframe.commonMA.meta.MA_META.LOC_GRP_NM);
	public static final MCMeta itm_typ_p_META = createInnerRowMeta($itm_typ_p, mcframe.clientMAUB.MAUBP0100.ItmTypR.class);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta sim_mrp_no_META = createCommonMeta($sim_mrp_no, mcframe.commonMA.meta.MA_META.SIM_MRP_NO);
	public static final MCMeta sim_auto_ref_flg_META = createCommonMeta($sim_auto_ref_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rqst_inc_flg_META = createCommonMeta($rqst_inc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta minus_stk_flg_META = createCommonMeta($minus_stk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta non_spply_ent_flg_META = createCommonMeta($non_spply_ent_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta buf_qty_flg_META = createCommonMeta($buf_qty_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta quality_typ_good_flg_META = createCommonMeta($quality_typ_good_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_p_META = createInnerRowMeta($itm_grp_p, mcframe.clientMAUB.MAUBP0250.ItmGrpR.class);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			dmndDtl_META,
			sim_META,
			oldSpply_META,
			selectDlyDisp_META,
			dmnd_dt_fr_META,
			dmnd_dt_to_META,
			adjst_tgt_flg_META,
			adjst_not_tgt_flg_META,
			dmnd_loc_cd_META,
			dmnd_loc_nm_META,
			site_cd_META,
			site_nm_META,
			wg_cd_META,
			wg_nm_META,
			lg_grp_cd_META,
			lg_grp_nm_META,
			loc_grp_cd_META,
			loc_grp_nm_META,
			itm_typ_p_META,
			itm_p_META,
			sim_mrp_no_META,
			sim_auto_ref_flg_META,
			rqst_inc_flg_META,
			minus_stk_flg_META,
			non_spply_ent_flg_META,
			buf_qty_flg_META,
			quality_typ_good_flg_META,
			itm_grp_p_META
		},
		new String[][]{
			{
				"itm_typ",
				"itm_typ_d_cd",
				"itm_typ_d_nm",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"itm_grp_flg1",
				"itm_grp_cd1",
				"itm_grp_nm1",
				"itm_grp_flg2",
				"itm_grp_cd2",
				"itm_grp_nm2",
				"itm_grp_flg3",
				"itm_grp_cd3",
				"itm_grp_nm3",
				"itm_grp_flg4",
				"itm_grp_cd4",
				"itm_grp_nm4",
				"itm_grp_flg5",
				"itm_grp_cd5",
				"itm_grp_nm5",
				"itm_grp_flg6",
				"itm_grp_cd6",
				"itm_grp_nm6",
				"itm_grp_flg7",
				"itm_grp_cd7",
				"itm_grp_nm7",
				"itm_grp_flg8",
				"itm_grp_cd8",
				"itm_grp_nm8",
				"itm_grp_flg9",
				"itm_grp_cd9",
				"itm_grp_nm9",
				"itm_grp_flg10",
				"itm_grp_cd10",
				"itm_grp_nm10"
			},
			{
				$itm_typ,
				$itm_typ_d_cd,
				$itm_typ_d_nm,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$itm_grp_flg1,
				$itm_grp_cd1,
				$itm_grp_nm1,
				$itm_grp_flg2,
				$itm_grp_cd2,
				$itm_grp_nm2,
				$itm_grp_flg3,
				$itm_grp_cd3,
				$itm_grp_nm3,
				$itm_grp_flg4,
				$itm_grp_cd4,
				$itm_grp_nm4,
				$itm_grp_flg5,
				$itm_grp_cd5,
				$itm_grp_nm5,
				$itm_grp_flg6,
				$itm_grp_cd6,
				$itm_grp_nm6,
				$itm_grp_flg7,
				$itm_grp_cd7,
				$itm_grp_nm7,
				$itm_grp_flg8,
				$itm_grp_cd8,
				$itm_grp_nm8,
				$itm_grp_flg9,
				$itm_grp_cd9,
				$itm_grp_nm9,
				$itm_grp_flg10,
				$itm_grp_cd10,
				$itm_grp_nm10
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
				{$dmnd_loc_cd, "loc_nm"},	// dmnd_loc_cd
				{$site_cd, "site_nm"},	// site_cd
				{$wg_cd, "wg_nm"},	// wg_cd
				{$lg_grp_cd, "lg_grp_nm"},	// lg_grp_cd
				{$loc_grp_cd, "loc_grp_nm"}	// loc_grp_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;itm_sub1"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;itm_sub1;itm_sub2"}	// itm_p.itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$itm_p + ".itm_cd", "itm_is_srch_typ"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "itm_is_srch_typ;itm_cd"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "itm_is_srch_typ;itm_cd;itm_sub1"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"}	// itm_p.itm_sub3
			}
		)),
		new MCExtMap.Entry($$VH_KEY, new MCExtList(
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
				{$site_cd, "SITE"},	// site_cd
				{$site_nm, "SITE"},	// site_nm
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"},	// wg_nm
				{$lg_grp_cd, "LG_GRP"},	// lg_grp_cd
				{$lg_grp_nm, "LG_GRP"},	// lg_grp_nm
				{$loc_grp_cd, "LOC_GRP"},	// loc_grp_cd
				{$loc_grp_nm, "LOC_GRP"}	// loc_grp_nm
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
	 * UPD,Create/Modify;REF,Display supply plan list;MON,Display monthly aggregation UPD,登録・訂正する;REF,供給計画を一覧表示する;MON,月次集計を表示する.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * UPD,Create/Modify;REF,Display supply plan list;MON,Display monthly aggregation UPD,登録・訂正する;REF,供給計画を一覧表示する;MON,月次集計を表示する.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	/**
	 * Display breakdown of demand info. 需要情報の内訳を表示.<p>
	 *
	 */
	public boolean dmndDtl() {
		return getConstBoolean(offset + 1, $dmndDtl);
	}

	/**
	 * Display breakdown of demand info. 需要情報の内訳を表示.<p>
	 *
	 */
	public void dmndDtl(boolean value) {
		setConstBoolean(offset + 1, $dmndDtl, value);
	}


	/**
	 * Display inventory forecasting for simulation シミュレーション在庫推移を表示.<p>
	 *
	 */
	public boolean sim() {
		return getConstBoolean(offset + 2, $sim);
	}

	/**
	 * Display inventory forecasting for simulation シミュレーション在庫推移を表示.<p>
	 *
	 */
	public void sim(boolean value) {
		setConstBoolean(offset + 2, $sim, value);
	}


	/**
	 * Display last supply plan 前回供給計画を表示.<p>
	 *
	 */
	public boolean oldSpply() {
		return getConstBoolean(offset + 3, $oldSpply);
	}

	/**
	 * Display last supply plan 前回供給計画を表示.<p>
	 *
	 */
	public void oldSpply(boolean value) {
		setConstBoolean(offset + 3, $oldSpply, value);
	}


	/**
	 * Display target date only 対象日のみ表示.<p>
	 *
	 */
	public boolean selectDlyDisp() {
		return getConstBoolean(offset + 4, $selectDlyDisp);
	}

	/**
	 * Display target date only 対象日のみ表示.<p>
	 *
	 */
	public void selectDlyDisp(boolean value) {
		setConstBoolean(offset + 4, $selectDlyDisp, value);
	}


	/**
	 * Term FROM 対象期間ＦＲＯＭ.<p>
	 *
	 */
	public MCDate dmnd_dt_fr() {
		return getConstDate(offset + 5, $dmnd_dt_fr);
	}

	/**
	 * Term FROM 対象期間ＦＲＯＭ.<p>
	 *
	 */
	public void dmnd_dt_fr(MCDate value) {
		setConstDate(offset + 5, $dmnd_dt_fr, value);
	}


	/**
	 * Term TO 対象期間ＴＯ.<p>
	 *
	 */
	public MCDate dmnd_dt_to() {
		return getConstDate(offset + 6, $dmnd_dt_to);
	}

	/**
	 * Term TO 対象期間ＴＯ.<p>
	 *
	 */
	public void dmnd_dt_to(MCDate value) {
		setConstDate(offset + 6, $dmnd_dt_to, value);
	}


	/**
	 * To adjust 調整対象.<p>
	 *
	 */
	public boolean adjst_tgt_flg() {
		return getConstBoolean(offset + 7, $adjst_tgt_flg);
	}

	/**
	 * To adjust 調整対象.<p>
	 *
	 */
	public void adjst_tgt_flg(boolean value) {
		setConstBoolean(offset + 7, $adjst_tgt_flg, value);
	}


	/**
	 * Not to adjust 調整対象外.<p>
	 *
	 */
	public boolean adjst_not_tgt_flg() {
		return getConstBoolean(offset + 8, $adjst_not_tgt_flg);
	}

	/**
	 * Not to adjust 調整対象外.<p>
	 *
	 */
	public void adjst_not_tgt_flg(boolean value) {
		setConstBoolean(offset + 8, $adjst_not_tgt_flg, value);
	}


	/**
	 * Demand location cd. 需要場所ＣＤ.<p>
	 *
	 */
	public String dmnd_loc_cd() {
		return getConstString(offset + 9, $dmnd_loc_cd);
	}

	/**
	 * Demand location cd. 需要場所ＣＤ.<p>
	 *
	 */
	public void dmnd_loc_cd(String value) {
		setConstString(offset + 9, $dmnd_loc_cd, value);
	}


	/**
	 * Demand location name 需要場所名.<p>
	 *
	 */
	public String dmnd_loc_nm() {
		return getConstString(offset + 10, $dmnd_loc_nm);
	}

	/**
	 * Demand location name 需要場所名.<p>
	 *
	 */
	public void dmnd_loc_nm(String value) {
		setConstString(offset + 10, $dmnd_loc_nm, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 11, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 11, $site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 12, $site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 12, $site_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 13, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 13, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 14, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 14, $wg_nm, value);
	}


	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public String lg_grp_cd() {
		return getConstString(offset + 15, $lg_grp_cd);
	}

	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public void lg_grp_cd(String value) {
		setConstString(offset + 15, $lg_grp_cd, value);
	}


	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public String lg_grp_nm() {
		return getConstString(offset + 16, $lg_grp_nm);
	}

	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public void lg_grp_nm(String value) {
		setConstString(offset + 16, $lg_grp_nm, value);
	}


	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public String loc_grp_cd() {
		return getConstString(offset + 17, $loc_grp_cd);
	}

	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public void loc_grp_cd(String value) {
		setConstString(offset + 17, $loc_grp_cd, value);
	}


	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public String loc_grp_nm() {
		return getConstString(offset + 18, $loc_grp_nm);
	}

	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public void loc_grp_nm(String value) {
		setConstString(offset + 18, $loc_grp_nm, value);
	}


	public mcframe.clientMAUB.MAUBP0100.ItmTypR itm_typ_p(){
		return (mcframe.clientMAUB.MAUBP0100.ItmTypR) getConstInnerRow(offset + 19, $itm_typ_p);
	}
	
	public void itm_typ_p(mcframe.clientMAUB.MAUBP0100.ItmTypR row){
		setConstInnerRow(offset + 19, $itm_typ_p, row);
	}


	public mcframe.clientMAUB.MAUBP0030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 20, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 20, $itm_p, row);
	}


	/**
	 * Simulation No. シミュレーションＮＯ.<p>
	 *
	 */
	public String sim_mrp_no() {
		return getConstString(offset + 21, $sim_mrp_no);
	}

	/**
	 * Simulation No. シミュレーションＮＯ.<p>
	 *
	 */
	public void sim_mrp_no(String value) {
		setConstString(offset + 21, $sim_mrp_no, value);
	}


	/**
	 * Auto apply simulation result シミュレーション結果を自動反映.<p>
	 *
	 */
	public boolean sim_auto_ref_flg() {
		return getConstBoolean(offset + 22, $sim_auto_ref_flg);
	}

	/**
	 * Auto apply simulation result シミュレーション結果を自動反映.<p>
	 *
	 */
	public void sim_auto_ref_flg(boolean value) {
		setConstBoolean(offset + 22, $sim_auto_ref_flg, value);
	}


	/**
	 * Apply mfg. location, supplier/request destination location 製造場所・発注先・依頼先場所も反映.<p>
	 *
	 */
	public boolean rqst_inc_flg() {
		return getConstBoolean(offset + 23, $rqst_inc_flg);
	}

	/**
	 * Apply mfg. location, supplier/request destination location 製造場所・発注先・依頼先場所も反映.<p>
	 *
	 */
	public void rqst_inc_flg(boolean value) {
		setConstBoolean(offset + 23, $rqst_inc_flg, value);
	}


	/**
	 * Negative inventory only マイナス在庫のみ.<p>
	 *
	 */
	public boolean minus_stk_flg() {
		return getConstBoolean(offset + 24, $minus_stk_flg);
	}

	/**
	 * Negative inventory only マイナス在庫のみ.<p>
	 *
	 */
	public void minus_stk_flg(boolean value) {
		setConstBoolean(offset + 24, $minus_stk_flg, value);
	}


	/**
	 * Supply on non-working days is non-enterable 非稼働日の供給入力不可.<p>
	 *
	 */
	public boolean non_spply_ent_flg() {
		return getConstBoolean(offset + 25, $non_spply_ent_flg);
	}

	/**
	 * Supply on non-working days is non-enterable 非稼働日の供給入力不可.<p>
	 *
	 */
	public void non_spply_ent_flg(boolean value) {
		setConstBoolean(offset + 25, $non_spply_ent_flg, value);
	}


	/**
	 * Consider fluctuation inventory 安全在庫を考慮.<p>
	 *
	 */
	public boolean buf_qty_flg() {
		return getConstBoolean(offset + 26, $buf_qty_flg);
	}

	/**
	 * Consider fluctuation inventory 安全在庫を考慮.<p>
	 *
	 */
	public void buf_qty_flg(boolean value) {
		setConstBoolean(offset + 26, $buf_qty_flg, value);
	}


	/**
	 * Conforming item only 良品のみ.<p>
	 *
	 */
	public boolean quality_typ_good_flg() {
		return getConstBoolean(offset + 27, $quality_typ_good_flg);
	}

	/**
	 * Conforming item only 良品のみ.<p>
	 *
	 */
	public void quality_typ_good_flg(boolean value) {
		setConstBoolean(offset + 27, $quality_typ_good_flg, value);
	}


	public mcframe.clientMAUB.MAUBP0250.ItmGrpR itm_grp_p(){
		return (mcframe.clientMAUB.MAUBP0250.ItmGrpR) getConstInnerRow(offset + 28, $itm_grp_p);
	}
	
	public void itm_grp_p(mcframe.clientMAUB.MAUBP0250.ItmGrpR row){
		setConstInnerRow(offset + 28, $itm_grp_p, row);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($dmnd_loc_cd.equalsIgnoreCase(name)) {
			return dmnd_loc_cd();
		}
		if ($dmnd_loc_nm.equalsIgnoreCase(name)) {
			return dmnd_loc_nm();
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
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			return loc_grp_cd();
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			return loc_grp_nm();
		}
		if ($sim_mrp_no.equalsIgnoreCase(name)) {
			return sim_mrp_no();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($dmnd_dt_fr.equalsIgnoreCase(name)) {
			return dmnd_dt_fr();
		}
		if ($dmnd_dt_to.equalsIgnoreCase(name)) {
			return dmnd_dt_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($dmndDtl.equalsIgnoreCase(name)) {
			return dmndDtl();
		}
		if ($sim.equalsIgnoreCase(name)) {
			return sim();
		}
		if ($oldSpply.equalsIgnoreCase(name)) {
			return oldSpply();
		}
		if ($selectDlyDisp.equalsIgnoreCase(name)) {
			return selectDlyDisp();
		}
		if ($adjst_tgt_flg.equalsIgnoreCase(name)) {
			return adjst_tgt_flg();
		}
		if ($adjst_not_tgt_flg.equalsIgnoreCase(name)) {
			return adjst_not_tgt_flg();
		}
		if ($sim_auto_ref_flg.equalsIgnoreCase(name)) {
			return sim_auto_ref_flg();
		}
		if ($rqst_inc_flg.equalsIgnoreCase(name)) {
			return rqst_inc_flg();
		}
		if ($minus_stk_flg.equalsIgnoreCase(name)) {
			return minus_stk_flg();
		}
		if ($non_spply_ent_flg.equalsIgnoreCase(name)) {
			return non_spply_ent_flg();
		}
		if ($buf_qty_flg.equalsIgnoreCase(name)) {
			return buf_qty_flg();
		}
		if ($quality_typ_good_flg.equalsIgnoreCase(name)) {
			return quality_typ_good_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($dmnd_loc_cd.equalsIgnoreCase(name)) {
			return dmnd_loc_cd();
		}
		if ($dmnd_loc_nm.equalsIgnoreCase(name)) {
			return dmnd_loc_nm();
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
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			return loc_grp_cd();
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			return loc_grp_nm();
		}
		if ($sim_mrp_no.equalsIgnoreCase(name)) {
			return sim_mrp_no();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($dmnd_dt_fr.equalsIgnoreCase(name)) {
			return dmnd_dt_fr();
		}
		if ($dmnd_dt_to.equalsIgnoreCase(name)) {
			return dmnd_dt_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($dmndDtl.equalsIgnoreCase(name)) {
			return dmndDtl();
		}
		if ($sim.equalsIgnoreCase(name)) {
			return sim();
		}
		if ($oldSpply.equalsIgnoreCase(name)) {
			return oldSpply();
		}
		if ($selectDlyDisp.equalsIgnoreCase(name)) {
			return selectDlyDisp();
		}
		if ($adjst_tgt_flg.equalsIgnoreCase(name)) {
			return adjst_tgt_flg();
		}
		if ($adjst_not_tgt_flg.equalsIgnoreCase(name)) {
			return adjst_not_tgt_flg();
		}
		if ($sim_auto_ref_flg.equalsIgnoreCase(name)) {
			return sim_auto_ref_flg();
		}
		if ($rqst_inc_flg.equalsIgnoreCase(name)) {
			return rqst_inc_flg();
		}
		if ($minus_stk_flg.equalsIgnoreCase(name)) {
			return minus_stk_flg();
		}
		if ($non_spply_ent_flg.equalsIgnoreCase(name)) {
			return non_spply_ent_flg();
		}
		if ($buf_qty_flg.equalsIgnoreCase(name)) {
			return buf_qty_flg();
		}
		if ($quality_typ_good_flg.equalsIgnoreCase(name)) {
			return quality_typ_good_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($dmnd_loc_cd.equalsIgnoreCase(name)) {
			dmnd_loc_cd(value);
			return;
		}
		if ($dmnd_loc_nm.equalsIgnoreCase(name)) {
			dmnd_loc_nm(value);
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
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			loc_grp_cd(value);
			return;
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			loc_grp_nm(value);
			return;
		}
		if ($sim_mrp_no.equalsIgnoreCase(name)) {
			sim_mrp_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($dmnd_dt_fr.equalsIgnoreCase(name)) {
			dmnd_dt_fr(value);
			return;
		}
		if ($dmnd_dt_to.equalsIgnoreCase(name)) {
			dmnd_dt_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($dmndDtl.equalsIgnoreCase(name)) {
			dmndDtl(value);
			return;
		}
		if ($sim.equalsIgnoreCase(name)) {
			sim(value);
			return;
		}
		if ($oldSpply.equalsIgnoreCase(name)) {
			oldSpply(value);
			return;
		}
		if ($selectDlyDisp.equalsIgnoreCase(name)) {
			selectDlyDisp(value);
			return;
		}
		if ($adjst_tgt_flg.equalsIgnoreCase(name)) {
			adjst_tgt_flg(value);
			return;
		}
		if ($adjst_not_tgt_flg.equalsIgnoreCase(name)) {
			adjst_not_tgt_flg(value);
			return;
		}
		if ($sim_auto_ref_flg.equalsIgnoreCase(name)) {
			sim_auto_ref_flg(value);
			return;
		}
		if ($rqst_inc_flg.equalsIgnoreCase(name)) {
			rqst_inc_flg(value);
			return;
		}
		if ($minus_stk_flg.equalsIgnoreCase(name)) {
			minus_stk_flg(value);
			return;
		}
		if ($non_spply_ent_flg.equalsIgnoreCase(name)) {
			non_spply_ent_flg(value);
			return;
		}
		if ($buf_qty_flg.equalsIgnoreCase(name)) {
			buf_qty_flg(value);
			return;
		}
		if ($quality_typ_good_flg.equalsIgnoreCase(name)) {
			quality_typ_good_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($dmnd_loc_cd.equalsIgnoreCase(name)) {
			dmnd_loc_cd(value);
			return;
		}
		if ($dmnd_loc_nm.equalsIgnoreCase(name)) {
			dmnd_loc_nm(value);
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
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			loc_grp_cd(value);
			return;
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			loc_grp_nm(value);
			return;
		}
		if ($sim_mrp_no.equalsIgnoreCase(name)) {
			sim_mrp_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($dmnd_dt_fr.equalsIgnoreCase(name)) {
			dmnd_dt_fr(value);
			return;
		}
		if ($dmnd_dt_to.equalsIgnoreCase(name)) {
			dmnd_dt_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($dmndDtl.equalsIgnoreCase(name)) {
			dmndDtl(value);
			return;
		}
		if ($sim.equalsIgnoreCase(name)) {
			sim(value);
			return;
		}
		if ($oldSpply.equalsIgnoreCase(name)) {
			oldSpply(value);
			return;
		}
		if ($selectDlyDisp.equalsIgnoreCase(name)) {
			selectDlyDisp(value);
			return;
		}
		if ($adjst_tgt_flg.equalsIgnoreCase(name)) {
			adjst_tgt_flg(value);
			return;
		}
		if ($adjst_not_tgt_flg.equalsIgnoreCase(name)) {
			adjst_not_tgt_flg(value);
			return;
		}
		if ($sim_auto_ref_flg.equalsIgnoreCase(name)) {
			sim_auto_ref_flg(value);
			return;
		}
		if ($rqst_inc_flg.equalsIgnoreCase(name)) {
			rqst_inc_flg(value);
			return;
		}
		if ($minus_stk_flg.equalsIgnoreCase(name)) {
			minus_stk_flg(value);
			return;
		}
		if ($non_spply_ent_flg.equalsIgnoreCase(name)) {
			non_spply_ent_flg(value);
			return;
		}
		if ($buf_qty_flg.equalsIgnoreCase(name)) {
			buf_qty_flg(value);
			return;
		}
		if ($quality_typ_good_flg.equalsIgnoreCase(name)) {
			quality_typ_good_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itm_typ_p.equalsIgnoreCase(name)) {
			return itm_typ_p();
		}
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($itm_grp_p.equalsIgnoreCase(name)) {
			return itm_grp_p();
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
		if ($itm_p.equalsIgnoreCase(name)) {
			itm_p(
				((MCContainerMeta) itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0030.ItmR.class, value)
			);
			return;
		}
		if ($itm_grp_p.equalsIgnoreCase(name)) {
			itm_grp_p(
				((MCContainerMeta) itm_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0250.ItmGrpR.class, value)
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

	public String itm_cd() {
		return itm_p().itm_cd();
	}

	public void itm_cd(String value) {
		itm_p().itm_cd(value);
	}

	public String itm_sub1() {
		return itm_p().itm_sub1();
	}

	public void itm_sub1(String value) {
		itm_p().itm_sub1(value);
	}

	public String itm_sub2() {
		return itm_p().itm_sub2();
	}

	public void itm_sub2(String value) {
		itm_p().itm_sub2(value);
	}

	public String itm_sub3() {
		return itm_p().itm_sub3();
	}

	public void itm_sub3(String value) {
		itm_p().itm_sub3(value);
	}

	public String itm_nm() {
		return itm_p().itm_nm();
	}

	public void itm_nm(String value) {
		itm_p().itm_nm(value);
	}

	public boolean itm_grp_flg1() {
		return itm_grp_p().itm_grp_flg1();
	}

	public void itm_grp_flg1(boolean value) {
		itm_grp_p().itm_grp_flg1(value);
	}

	public String itm_grp_cd1() {
		return itm_grp_p().itm_grp_cd1();
	}

	public void itm_grp_cd1(String value) {
		itm_grp_p().itm_grp_cd1(value);
	}

	public String itm_grp_nm1() {
		return itm_grp_p().itm_grp_nm1();
	}

	public void itm_grp_nm1(String value) {
		itm_grp_p().itm_grp_nm1(value);
	}

	public boolean itm_grp_flg2() {
		return itm_grp_p().itm_grp_flg2();
	}

	public void itm_grp_flg2(boolean value) {
		itm_grp_p().itm_grp_flg2(value);
	}

	public String itm_grp_cd2() {
		return itm_grp_p().itm_grp_cd2();
	}

	public void itm_grp_cd2(String value) {
		itm_grp_p().itm_grp_cd2(value);
	}

	public String itm_grp_nm2() {
		return itm_grp_p().itm_grp_nm2();
	}

	public void itm_grp_nm2(String value) {
		itm_grp_p().itm_grp_nm2(value);
	}

	public boolean itm_grp_flg3() {
		return itm_grp_p().itm_grp_flg3();
	}

	public void itm_grp_flg3(boolean value) {
		itm_grp_p().itm_grp_flg3(value);
	}

	public String itm_grp_cd3() {
		return itm_grp_p().itm_grp_cd3();
	}

	public void itm_grp_cd3(String value) {
		itm_grp_p().itm_grp_cd3(value);
	}

	public String itm_grp_nm3() {
		return itm_grp_p().itm_grp_nm3();
	}

	public void itm_grp_nm3(String value) {
		itm_grp_p().itm_grp_nm3(value);
	}

	public boolean itm_grp_flg4() {
		return itm_grp_p().itm_grp_flg4();
	}

	public void itm_grp_flg4(boolean value) {
		itm_grp_p().itm_grp_flg4(value);
	}

	public String itm_grp_cd4() {
		return itm_grp_p().itm_grp_cd4();
	}

	public void itm_grp_cd4(String value) {
		itm_grp_p().itm_grp_cd4(value);
	}

	public String itm_grp_nm4() {
		return itm_grp_p().itm_grp_nm4();
	}

	public void itm_grp_nm4(String value) {
		itm_grp_p().itm_grp_nm4(value);
	}

	public boolean itm_grp_flg5() {
		return itm_grp_p().itm_grp_flg5();
	}

	public void itm_grp_flg5(boolean value) {
		itm_grp_p().itm_grp_flg5(value);
	}

	public String itm_grp_cd5() {
		return itm_grp_p().itm_grp_cd5();
	}

	public void itm_grp_cd5(String value) {
		itm_grp_p().itm_grp_cd5(value);
	}

	public String itm_grp_nm5() {
		return itm_grp_p().itm_grp_nm5();
	}

	public void itm_grp_nm5(String value) {
		itm_grp_p().itm_grp_nm5(value);
	}

	public boolean itm_grp_flg6() {
		return itm_grp_p().itm_grp_flg6();
	}

	public void itm_grp_flg6(boolean value) {
		itm_grp_p().itm_grp_flg6(value);
	}

	public String itm_grp_cd6() {
		return itm_grp_p().itm_grp_cd6();
	}

	public void itm_grp_cd6(String value) {
		itm_grp_p().itm_grp_cd6(value);
	}

	public String itm_grp_nm6() {
		return itm_grp_p().itm_grp_nm6();
	}

	public void itm_grp_nm6(String value) {
		itm_grp_p().itm_grp_nm6(value);
	}

	public boolean itm_grp_flg7() {
		return itm_grp_p().itm_grp_flg7();
	}

	public void itm_grp_flg7(boolean value) {
		itm_grp_p().itm_grp_flg7(value);
	}

	public String itm_grp_cd7() {
		return itm_grp_p().itm_grp_cd7();
	}

	public void itm_grp_cd7(String value) {
		itm_grp_p().itm_grp_cd7(value);
	}

	public String itm_grp_nm7() {
		return itm_grp_p().itm_grp_nm7();
	}

	public void itm_grp_nm7(String value) {
		itm_grp_p().itm_grp_nm7(value);
	}

	public boolean itm_grp_flg8() {
		return itm_grp_p().itm_grp_flg8();
	}

	public void itm_grp_flg8(boolean value) {
		itm_grp_p().itm_grp_flg8(value);
	}

	public String itm_grp_cd8() {
		return itm_grp_p().itm_grp_cd8();
	}

	public void itm_grp_cd8(String value) {
		itm_grp_p().itm_grp_cd8(value);
	}

	public String itm_grp_nm8() {
		return itm_grp_p().itm_grp_nm8();
	}

	public void itm_grp_nm8(String value) {
		itm_grp_p().itm_grp_nm8(value);
	}

	public boolean itm_grp_flg9() {
		return itm_grp_p().itm_grp_flg9();
	}

	public void itm_grp_flg9(boolean value) {
		itm_grp_p().itm_grp_flg9(value);
	}

	public String itm_grp_cd9() {
		return itm_grp_p().itm_grp_cd9();
	}

	public void itm_grp_cd9(String value) {
		itm_grp_p().itm_grp_cd9(value);
	}

	public String itm_grp_nm9() {
		return itm_grp_p().itm_grp_nm9();
	}

	public void itm_grp_nm9(String value) {
		itm_grp_p().itm_grp_nm9(value);
	}

	public boolean itm_grp_flg10() {
		return itm_grp_p().itm_grp_flg10();
	}

	public void itm_grp_flg10(boolean value) {
		itm_grp_p().itm_grp_flg10(value);
	}

	public String itm_grp_cd10() {
		return itm_grp_p().itm_grp_cd10();
	}

	public void itm_grp_cd10(String value) {
		itm_grp_p().itm_grp_cd10(value);
	}

	public String itm_grp_nm10() {
		return itm_grp_p().itm_grp_nm10();
	}

	public void itm_grp_nm10(String value) {
		itm_grp_p().itm_grp_nm10(value);
	}

}

