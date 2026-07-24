package mcframe.clientMGBD.MGBDP0540;

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
 * ブロック"Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DtlR_MC_A extends MCConstRow {

	public static final String $hrrchy_p = "hrrchy_p";
	/**
	 * Bottom 最下位.<p>
	 *
	 */
	public static final String $bottom_flg = "bottom_flg";
	/**
	 * Non-entry 未登録.<p>
	 *
	 */
	public static final String $unreg_flg = "unreg_flg";
	public static final String $itm_p = "itm_p";
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
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public static final String $bom_ptn = "bom_ptn";
	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public static final String $oper_cd = "oper_cd";
	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public static final String $oper_nm = "oper_nm";
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	public static final String $par_rqmt_qty_p = "par_rqmt_qty_p";
	/**
	 * Parent unit cd. 親単位ＣＤ.<p>
	 *
	 */
	public static final String $par_unit_cd = "par_unit_cd";
	/**
	 * Parent unit name 親単位名.<p>
	 *
	 */
	public static final String $par_unit_nm = "par_unit_nm";
	/**
	 * Parent number of decimal places 親小数部有効桁数.<p>
	 *
	 */
	public static final String $par_dec_place = "par_dec_place";
	public static final String $chd_rqmt_qty_p = "chd_rqmt_qty_p";
	public static final String $chd_base_qty_p = "chd_base_qty_p";
	public static final String $fxd_chd_rqmt_qty_p = "fxd_chd_rqmt_qty_p";
	public static final String $chd_min_qty_p = "chd_min_qty_p";
	public static final String $chd_batch_qty_p = "chd_batch_qty_p";
	/**
	 * Child unit cd. 子単位ＣＤ.<p>
	 *
	 */
	public static final String $chd_unit_cd = "chd_unit_cd";
	/**
	 * Child unit name 子単位名.<p>
	 *
	 */
	public static final String $chd_unit_nm = "chd_unit_nm";
	/**
	 * Child number of decimal places 子小数部有効桁数.<p>
	 *
	 */
	public static final String $chd_dec_place = "chd_dec_place";
	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public static final String $alt_grp_cd = "alt_grp_cd";
	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public static final String $alt_itm_ratio = "alt_itm_ratio";
	/**
	 * Cost element cd. 費目ＣＤ.<p>
	 *
	 */
	public static final String $expns_cd = "expns_cd";
	/**
	 * Cost element name 費目名.<p>
	 *
	 */
	public static final String $expns_nm = "expns_nm";
	public static final String $upper_itm_p = "upper_itm_p";
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
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_cd = "calc_ctg_cd";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_nm = "calc_ctg_nm";
	/**
	 * Item calculation category cd. 品目計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $itm_calc_ctg_cd = "itm_calc_ctg_cd";
	/**
	 * Item calculation category name 品目計算カテゴリ名.<p>
	 *
	 */
	public static final String $itm_calc_ctg_nm = "itm_calc_ctg_nm";
	/**
	 * Details calculation category cd. 詳細計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $dtl_calc_ctg_cd = "dtl_calc_ctg_cd";
	/**
	 * Details calculation category name 詳細計算カテゴリ名.<p>
	 *
	 */
	public static final String $dtl_calc_ctg_nm = "dtl_calc_ctg_nm";
	/**
	 * Purchase calculation category cd. 購買計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $purc_calc_ctg_cd = "purc_calc_ctg_cd";
	/**
	 * Purchase calculation category name 購買計算カテゴリ名.<p>
	 *
	 */
	public static final String $purc_calc_ctg_nm = "purc_calc_ctg_nm";
	/**
	 * Subcontracting calculation category cd. 加工計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $proc_calc_ctg_cd = "proc_calc_ctg_cd";
	/**
	 * Subcontracting calculation category name 加工計算カテゴリ名.<p>
	 *
	 */
	public static final String $proc_calc_ctg_nm = "proc_calc_ctg_nm";
	/**
	 * Supply calculation category cd. 支給計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $prov_calc_ctg_cd = "prov_calc_ctg_cd";
	/**
	 * Supply calculation category name 支給計算カテゴリ名.<p>
	 *
	 */
	public static final String $prov_calc_ctg_nm = "prov_calc_ctg_nm";
	/**
	 * Sales calculation category cd. 販売計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $sls_calc_ctg_cd = "sls_calc_ctg_cd";
	/**
	 * Sales calculation category name 販売計算カテゴリ名.<p>
	 *
	 */
	public static final String $sls_calc_ctg_nm = "sls_calc_ctg_nm";
	/**
	 * Limit unit price calculation category cd. 指値計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $fix_calc_ctg_cd = "fix_calc_ctg_cd";
	/**
	 * Limit unit price calculation category name 指値計算カテゴリ名.<p>
	 *
	 */
	public static final String $fix_calc_ctg_nm = "fix_calc_ctg_nm";

	public static final String $ext = $hrrchy_p + ".ext";
	public static final String $hrrchy = $hrrchy_p + ".hrrchy";
	public static final String $hrrchy_str = $hrrchy_p + ".hrrchy_str";
	public static final String $extno = $hrrchy_p + ".extno";
	public static final String $par_extno = $hrrchy_p + ".par_extno";
	public static final String $loop_flg = $hrrchy_p + ".loop_flg";
	public static final String $leaf = $hrrchy_p + ".leaf";
	public static final String $leaf_str = $hrrchy_p + ".leaf_str";
	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $par_rqmt_qty = $par_rqmt_qty_p + ".qty";
	public static final String $chd_rqmt_qty = $chd_rqmt_qty_p + ".qty";
	public static final String $chd_base_qty = $chd_base_qty_p + ".qty";
	public static final String $fxd_chd_rqmt_qty = $fxd_chd_rqmt_qty_p + ".qty";
	public static final String $chd_min_qty = $chd_min_qty_p + ".qty";
	public static final String $chd_batch_qty = $chd_batch_qty_p + ".qty";
	public static final String $upper_itm_cd = $upper_itm_p + ".itm_cd";
	public static final String $upper_itm_sub1 = $upper_itm_p + ".itm_sub1";
	public static final String $upper_itm_sub2 = $upper_itm_p + ".itm_sub2";
	public static final String $upper_itm_sub3 = $upper_itm_p + ".itm_sub3";
	public static final String $upper_itm_nm = $upper_itm_p + ".itm_nm";

	public static final MCMeta hrrchy_p_META = createInnerRowMeta($hrrchy_p, mcframe.clientMAUB.MAUBP5210.HrrchyR.class);
	public static final MCMeta bottom_flg_META = createCommonMeta($bottom_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta unreg_flg_META = createCommonMeta($unreg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta itm_jnl_cd_META = createCommonMeta($itm_jnl_cd, mcframe.commonMA.meta.MA_META.ITM_JNL_CD);
	public static final MCMeta itm_jnl_nm_META = createCommonMeta($itm_jnl_nm, mcframe.commonMA.meta.MA_META.ITM_JNL_NM);
	public static final MCMeta bom_ptn_META = createCommonMeta($bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_nm_META = createCommonMeta($oper_nm, mcframe.commonMA.meta.MA_META.OPER_NM);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta par_rqmt_qty_p_META = createInnerRowMeta($par_rqmt_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta par_unit_cd_META = createCommonMeta($par_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta par_unit_nm_META = createCommonMeta($par_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta par_dec_place_META = createCommonMeta($par_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta chd_rqmt_qty_p_META = createInnerRowMeta($chd_rqmt_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta chd_base_qty_p_META = createInnerRowMeta($chd_base_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta fxd_chd_rqmt_qty_p_META = createInnerRowMeta($fxd_chd_rqmt_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta chd_min_qty_p_META = createInnerRowMeta($chd_min_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta chd_batch_qty_p_META = createInnerRowMeta($chd_batch_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta chd_unit_cd_META = createCommonMeta($chd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta chd_unit_nm_META = createCommonMeta($chd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta chd_dec_place_META = createCommonMeta($chd_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta alt_grp_cd_META = createCommonMeta($alt_grp_cd, mcframe.commonMA.meta.MA_META.ALT_GRP_CD);
	public static final MCMeta alt_itm_ratio_META = createCommonMeta($alt_itm_ratio, mcframe.commonMA.meta.MA_META.ALT_ITM_RATIO);
	public static final MCMeta expns_cd_META = createCommonMeta($expns_cd, mcframe.commonMA.meta.MA_META.EXPNS_CD);
	public static final MCMeta expns_nm_META = createCommonMeta($expns_nm, mcframe.commonMA.meta.MA_META.EXPNS_NM);
	public static final MCMeta upper_itm_p_META = createInnerRowMeta($upper_itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta calc_ctg_cd_META = createCommonMeta($calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_nm_META = createCommonMeta($calc_ctg_nm, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta itm_calc_ctg_cd_META = createCommonMeta($itm_calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta itm_calc_ctg_nm_META = createCommonMeta($itm_calc_ctg_nm, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta dtl_calc_ctg_cd_META = createCommonMeta($dtl_calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta dtl_calc_ctg_nm_META = createCommonMeta($dtl_calc_ctg_nm, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta purc_calc_ctg_cd_META = createCommonMeta($purc_calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta purc_calc_ctg_nm_META = createCommonMeta($purc_calc_ctg_nm, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta proc_calc_ctg_cd_META = createCommonMeta($proc_calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta proc_calc_ctg_nm_META = createCommonMeta($proc_calc_ctg_nm, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta prov_calc_ctg_cd_META = createCommonMeta($prov_calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta prov_calc_ctg_nm_META = createCommonMeta($prov_calc_ctg_nm, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta sls_calc_ctg_cd_META = createCommonMeta($sls_calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta sls_calc_ctg_nm_META = createCommonMeta($sls_calc_ctg_nm, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta fix_calc_ctg_cd_META = createCommonMeta($fix_calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta fix_calc_ctg_nm_META = createCommonMeta($fix_calc_ctg_nm, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			hrrchy_p_META,
			bottom_flg_META,
			unreg_flg_META,
			itm_p_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			itm_jnl_cd_META,
			itm_jnl_nm_META,
			bom_ptn_META,
			oper_cd_META,
			oper_nm_META,
			disp_seq_META,
			par_rqmt_qty_p_META,
			par_unit_cd_META,
			par_unit_nm_META,
			par_dec_place_META,
			chd_rqmt_qty_p_META,
			chd_base_qty_p_META,
			fxd_chd_rqmt_qty_p_META,
			chd_min_qty_p_META,
			chd_batch_qty_p_META,
			chd_unit_cd_META,
			chd_unit_nm_META,
			chd_dec_place_META,
			alt_grp_cd_META,
			alt_itm_ratio_META,
			expns_cd_META,
			expns_nm_META,
			upper_itm_p_META,
			wg_cd_META,
			wg_nm_META,
			calc_ctg_cd_META,
			calc_ctg_nm_META,
			itm_calc_ctg_cd_META,
			itm_calc_ctg_nm_META,
			dtl_calc_ctg_cd_META,
			dtl_calc_ctg_nm_META,
			purc_calc_ctg_cd_META,
			purc_calc_ctg_nm_META,
			proc_calc_ctg_cd_META,
			proc_calc_ctg_nm_META,
			prov_calc_ctg_cd_META,
			prov_calc_ctg_nm_META,
			sls_calc_ctg_cd_META,
			sls_calc_ctg_nm_META,
			fix_calc_ctg_cd_META,
			fix_calc_ctg_nm_META
		},
		new String[][]{
			{
				"ext",
				"hrrchy",
				"hrrchy_str",
				"extno",
				"par_extno",
				"loop_flg",
				"leaf",
				"leaf_str",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"par_rqmt_qty",
				"chd_rqmt_qty",
				"chd_base_qty",
				"fxd_chd_rqmt_qty",
				"chd_min_qty",
				"chd_batch_qty",
				"upper_itm_cd",
				"upper_itm_sub1",
				"upper_itm_sub2",
				"upper_itm_sub3",
				"upper_itm_nm"
			},
			{
				$ext,
				$hrrchy,
				$hrrchy_str,
				$extno,
				$par_extno,
				$loop_flg,
				$leaf,
				$leaf_str,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$par_rqmt_qty,
				$chd_rqmt_qty,
				$chd_base_qty,
				$fxd_chd_rqmt_qty,
				$chd_min_qty,
				$chd_batch_qty,
				$upper_itm_cd,
				$upper_itm_sub1,
				$upper_itm_sub2,
				$upper_itm_sub3,
				$upper_itm_nm
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
	/** 項目属性情報のグループ[SHOW]のキー定数 */
	public static final String $$SHOW = "SHOW";
	/** 項目属性情報のグループ[VIEW_SCALE]のキー定数 */
	public static final String $$VIEW_SCALE = "VIEW_SCALE";
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
		new MCExtMap.Entry($$SHOW, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$VIEW_SCALE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"}	// wg_nm
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
	protected DtlR_MC_A(ConstMetaList<? extends DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR clone() {
		return (DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR createInstance() {
		return (DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR getValues(String... names) {
		return (DtlR) super.getValues(names);
	}



	public mcframe.clientMAUB.MAUBP5210.HrrchyR hrrchy_p(){
		return (mcframe.clientMAUB.MAUBP5210.HrrchyR) getConstInnerRow(offset + 0, $hrrchy_p);
	}
	
	public void hrrchy_p(mcframe.clientMAUB.MAUBP5210.HrrchyR row){
		setConstInnerRow(offset + 0, $hrrchy_p, row);
	}


	/**
	 * Bottom 最下位.<p>
	 *
	 */
	public boolean bottom_flg() {
		return getConstBoolean(offset + 1, $bottom_flg);
	}

	/**
	 * Bottom 最下位.<p>
	 *
	 */
	public void bottom_flg(boolean value) {
		setConstBoolean(offset + 1, $bottom_flg, value);
	}


	/**
	 * Non-entry 未登録.<p>
	 *
	 */
	public boolean unreg_flg() {
		return getConstBoolean(offset + 2, $unreg_flg);
	}

	/**
	 * Non-entry 未登録.<p>
	 *
	 */
	public void unreg_flg(boolean value) {
		setConstBoolean(offset + 2, $unreg_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 3, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 3, $itm_p, row);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 4, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 4, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 5, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 5, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 6, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 6, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 7, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 7, $itm_typ_d_nm, value);
	}


	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public String itm_jnl_cd() {
		return getConstString(offset + 8, $itm_jnl_cd);
	}

	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public void itm_jnl_cd(String value) {
		setConstString(offset + 8, $itm_jnl_cd, value);
	}


	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public String itm_jnl_nm() {
		return getConstString(offset + 9, $itm_jnl_nm);
	}

	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public void itm_jnl_nm(String value) {
		setConstString(offset + 9, $itm_jnl_nm, value);
	}


	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return getConstString(offset + 10, $bom_ptn);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		setConstString(offset + 10, $bom_ptn, value);
	}


	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 11, $oper_cd);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 11, $oper_cd, value);
	}


	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public String oper_nm() {
		return getConstString(offset + 12, $oper_nm);
	}

	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public void oper_nm(String value) {
		setConstString(offset + 12, $oper_nm, value);
	}


	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 13, $disp_seq);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 13, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 13, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 13, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 13, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 13, $disp_seq, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR par_rqmt_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 14, $par_rqmt_qty_p);
	}
	
	public void par_rqmt_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 14, $par_rqmt_qty_p, row);
	}


	/**
	 * Parent unit cd. 親単位ＣＤ.<p>
	 *
	 */
	public String par_unit_cd() {
		return getConstString(offset + 15, $par_unit_cd);
	}

	/**
	 * Parent unit cd. 親単位ＣＤ.<p>
	 *
	 */
	public void par_unit_cd(String value) {
		setConstString(offset + 15, $par_unit_cd, value);
	}


	/**
	 * Parent unit name 親単位名.<p>
	 *
	 */
	public String par_unit_nm() {
		return getConstString(offset + 16, $par_unit_nm);
	}

	/**
	 * Parent unit name 親単位名.<p>
	 *
	 */
	public void par_unit_nm(String value) {
		setConstString(offset + 16, $par_unit_nm, value);
	}


	/**
	 * Parent number of decimal places 親小数部有効桁数.<p>
	 *
	 */
	public MCNumber par_dec_place() {
		return getConstNumber(offset + 17, $par_dec_place);
	}

	/**
	 * Parent number of decimal places 親小数部有効桁数.<p>
	 *
	 */
	public void par_dec_place(MCNumber value) {
		setConstNumber(offset + 17, $par_dec_place, value);
	}

	/**
	 * Parent number of decimal places 親小数部有効桁数.<p>
	 *
	 */
	public void par_dec_place(int value) {
		setConstNumber(offset + 17, $par_dec_place, value);
	}

	/**
	 * Parent number of decimal places 親小数部有効桁数.<p>
	 *
	 */
	public void par_dec_place(long value) {
		setConstNumber(offset + 17, $par_dec_place, value);
	}

	/**
	 * Parent number of decimal places 親小数部有効桁数.<p>
	 *
	 */
	public void par_dec_place(float value) {
		setConstNumber(offset + 17, $par_dec_place, value);
	}

	/**
	 * Parent number of decimal places 親小数部有効桁数.<p>
	 *
	 */
	public void par_dec_place(double value) {
		setConstNumber(offset + 17, $par_dec_place, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR chd_rqmt_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 18, $chd_rqmt_qty_p);
	}
	
	public void chd_rqmt_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 18, $chd_rqmt_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR chd_base_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 19, $chd_base_qty_p);
	}
	
	public void chd_base_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 19, $chd_base_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR fxd_chd_rqmt_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 20, $fxd_chd_rqmt_qty_p);
	}
	
	public void fxd_chd_rqmt_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 20, $fxd_chd_rqmt_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR chd_min_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 21, $chd_min_qty_p);
	}
	
	public void chd_min_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 21, $chd_min_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR chd_batch_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 22, $chd_batch_qty_p);
	}
	
	public void chd_batch_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 22, $chd_batch_qty_p, row);
	}


	/**
	 * Child unit cd. 子単位ＣＤ.<p>
	 *
	 */
	public String chd_unit_cd() {
		return getConstString(offset + 23, $chd_unit_cd);
	}

	/**
	 * Child unit cd. 子単位ＣＤ.<p>
	 *
	 */
	public void chd_unit_cd(String value) {
		setConstString(offset + 23, $chd_unit_cd, value);
	}


	/**
	 * Child unit name 子単位名.<p>
	 *
	 */
	public String chd_unit_nm() {
		return getConstString(offset + 24, $chd_unit_nm);
	}

	/**
	 * Child unit name 子単位名.<p>
	 *
	 */
	public void chd_unit_nm(String value) {
		setConstString(offset + 24, $chd_unit_nm, value);
	}


	/**
	 * Child number of decimal places 子小数部有効桁数.<p>
	 *
	 */
	public MCNumber chd_dec_place() {
		return getConstNumber(offset + 25, $chd_dec_place);
	}

	/**
	 * Child number of decimal places 子小数部有効桁数.<p>
	 *
	 */
	public void chd_dec_place(MCNumber value) {
		setConstNumber(offset + 25, $chd_dec_place, value);
	}

	/**
	 * Child number of decimal places 子小数部有効桁数.<p>
	 *
	 */
	public void chd_dec_place(int value) {
		setConstNumber(offset + 25, $chd_dec_place, value);
	}

	/**
	 * Child number of decimal places 子小数部有効桁数.<p>
	 *
	 */
	public void chd_dec_place(long value) {
		setConstNumber(offset + 25, $chd_dec_place, value);
	}

	/**
	 * Child number of decimal places 子小数部有効桁数.<p>
	 *
	 */
	public void chd_dec_place(float value) {
		setConstNumber(offset + 25, $chd_dec_place, value);
	}

	/**
	 * Child number of decimal places 子小数部有効桁数.<p>
	 *
	 */
	public void chd_dec_place(double value) {
		setConstNumber(offset + 25, $chd_dec_place, value);
	}


	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public String alt_grp_cd() {
		return getConstString(offset + 26, $alt_grp_cd);
	}

	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public void alt_grp_cd(String value) {
		setConstString(offset + 26, $alt_grp_cd, value);
	}


	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public MCNumber alt_itm_ratio() {
		return getConstNumber(offset + 27, $alt_itm_ratio);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(MCNumber value) {
		setConstNumber(offset + 27, $alt_itm_ratio, value);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(int value) {
		setConstNumber(offset + 27, $alt_itm_ratio, value);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(long value) {
		setConstNumber(offset + 27, $alt_itm_ratio, value);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(float value) {
		setConstNumber(offset + 27, $alt_itm_ratio, value);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(double value) {
		setConstNumber(offset + 27, $alt_itm_ratio, value);
	}


	/**
	 * Cost element cd. 費目ＣＤ.<p>
	 *
	 */
	public String expns_cd() {
		return getConstString(offset + 28, $expns_cd);
	}

	/**
	 * Cost element cd. 費目ＣＤ.<p>
	 *
	 */
	public void expns_cd(String value) {
		setConstString(offset + 28, $expns_cd, value);
	}


	/**
	 * Cost element name 費目名.<p>
	 *
	 */
	public String expns_nm() {
		return getConstString(offset + 29, $expns_nm);
	}

	/**
	 * Cost element name 費目名.<p>
	 *
	 */
	public void expns_nm(String value) {
		setConstString(offset + 29, $expns_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR upper_itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 30, $upper_itm_p);
	}
	
	public void upper_itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 30, $upper_itm_p, row);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 31, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 31, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 32, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 32, $wg_nm, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_cd() {
		return getConstString(offset + 33, $calc_ctg_cd);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_cd(String value) {
		setConstString(offset + 33, $calc_ctg_cd, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_nm() {
		return getConstString(offset + 34, $calc_ctg_nm);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_nm(String value) {
		setConstString(offset + 34, $calc_ctg_nm, value);
	}


	/**
	 * Item calculation category cd. 品目計算カテゴリＣＤ.<p>
	 *
	 */
	public String itm_calc_ctg_cd() {
		return getConstString(offset + 35, $itm_calc_ctg_cd);
	}

	/**
	 * Item calculation category cd. 品目計算カテゴリＣＤ.<p>
	 *
	 */
	public void itm_calc_ctg_cd(String value) {
		setConstString(offset + 35, $itm_calc_ctg_cd, value);
	}


	/**
	 * Item calculation category name 品目計算カテゴリ名.<p>
	 *
	 */
	public String itm_calc_ctg_nm() {
		return getConstString(offset + 36, $itm_calc_ctg_nm);
	}

	/**
	 * Item calculation category name 品目計算カテゴリ名.<p>
	 *
	 */
	public void itm_calc_ctg_nm(String value) {
		setConstString(offset + 36, $itm_calc_ctg_nm, value);
	}


	/**
	 * Details calculation category cd. 詳細計算カテゴリＣＤ.<p>
	 *
	 */
	public String dtl_calc_ctg_cd() {
		return getConstString(offset + 37, $dtl_calc_ctg_cd);
	}

	/**
	 * Details calculation category cd. 詳細計算カテゴリＣＤ.<p>
	 *
	 */
	public void dtl_calc_ctg_cd(String value) {
		setConstString(offset + 37, $dtl_calc_ctg_cd, value);
	}


	/**
	 * Details calculation category name 詳細計算カテゴリ名.<p>
	 *
	 */
	public String dtl_calc_ctg_nm() {
		return getConstString(offset + 38, $dtl_calc_ctg_nm);
	}

	/**
	 * Details calculation category name 詳細計算カテゴリ名.<p>
	 *
	 */
	public void dtl_calc_ctg_nm(String value) {
		setConstString(offset + 38, $dtl_calc_ctg_nm, value);
	}


	/**
	 * Purchase calculation category cd. 購買計算カテゴリＣＤ.<p>
	 *
	 */
	public String purc_calc_ctg_cd() {
		return getConstString(offset + 39, $purc_calc_ctg_cd);
	}

	/**
	 * Purchase calculation category cd. 購買計算カテゴリＣＤ.<p>
	 *
	 */
	public void purc_calc_ctg_cd(String value) {
		setConstString(offset + 39, $purc_calc_ctg_cd, value);
	}


	/**
	 * Purchase calculation category name 購買計算カテゴリ名.<p>
	 *
	 */
	public String purc_calc_ctg_nm() {
		return getConstString(offset + 40, $purc_calc_ctg_nm);
	}

	/**
	 * Purchase calculation category name 購買計算カテゴリ名.<p>
	 *
	 */
	public void purc_calc_ctg_nm(String value) {
		setConstString(offset + 40, $purc_calc_ctg_nm, value);
	}


	/**
	 * Subcontracting calculation category cd. 加工計算カテゴリＣＤ.<p>
	 *
	 */
	public String proc_calc_ctg_cd() {
		return getConstString(offset + 41, $proc_calc_ctg_cd);
	}

	/**
	 * Subcontracting calculation category cd. 加工計算カテゴリＣＤ.<p>
	 *
	 */
	public void proc_calc_ctg_cd(String value) {
		setConstString(offset + 41, $proc_calc_ctg_cd, value);
	}


	/**
	 * Subcontracting calculation category name 加工計算カテゴリ名.<p>
	 *
	 */
	public String proc_calc_ctg_nm() {
		return getConstString(offset + 42, $proc_calc_ctg_nm);
	}

	/**
	 * Subcontracting calculation category name 加工計算カテゴリ名.<p>
	 *
	 */
	public void proc_calc_ctg_nm(String value) {
		setConstString(offset + 42, $proc_calc_ctg_nm, value);
	}


	/**
	 * Supply calculation category cd. 支給計算カテゴリＣＤ.<p>
	 *
	 */
	public String prov_calc_ctg_cd() {
		return getConstString(offset + 43, $prov_calc_ctg_cd);
	}

	/**
	 * Supply calculation category cd. 支給計算カテゴリＣＤ.<p>
	 *
	 */
	public void prov_calc_ctg_cd(String value) {
		setConstString(offset + 43, $prov_calc_ctg_cd, value);
	}


	/**
	 * Supply calculation category name 支給計算カテゴリ名.<p>
	 *
	 */
	public String prov_calc_ctg_nm() {
		return getConstString(offset + 44, $prov_calc_ctg_nm);
	}

	/**
	 * Supply calculation category name 支給計算カテゴリ名.<p>
	 *
	 */
	public void prov_calc_ctg_nm(String value) {
		setConstString(offset + 44, $prov_calc_ctg_nm, value);
	}


	/**
	 * Sales calculation category cd. 販売計算カテゴリＣＤ.<p>
	 *
	 */
	public String sls_calc_ctg_cd() {
		return getConstString(offset + 45, $sls_calc_ctg_cd);
	}

	/**
	 * Sales calculation category cd. 販売計算カテゴリＣＤ.<p>
	 *
	 */
	public void sls_calc_ctg_cd(String value) {
		setConstString(offset + 45, $sls_calc_ctg_cd, value);
	}


	/**
	 * Sales calculation category name 販売計算カテゴリ名.<p>
	 *
	 */
	public String sls_calc_ctg_nm() {
		return getConstString(offset + 46, $sls_calc_ctg_nm);
	}

	/**
	 * Sales calculation category name 販売計算カテゴリ名.<p>
	 *
	 */
	public void sls_calc_ctg_nm(String value) {
		setConstString(offset + 46, $sls_calc_ctg_nm, value);
	}


	/**
	 * Limit unit price calculation category cd. 指値計算カテゴリＣＤ.<p>
	 *
	 */
	public String fix_calc_ctg_cd() {
		return getConstString(offset + 47, $fix_calc_ctg_cd);
	}

	/**
	 * Limit unit price calculation category cd. 指値計算カテゴリＣＤ.<p>
	 *
	 */
	public void fix_calc_ctg_cd(String value) {
		setConstString(offset + 47, $fix_calc_ctg_cd, value);
	}


	/**
	 * Limit unit price calculation category name 指値計算カテゴリ名.<p>
	 *
	 */
	public String fix_calc_ctg_nm() {
		return getConstString(offset + 48, $fix_calc_ctg_nm);
	}

	/**
	 * Limit unit price calculation category name 指値計算カテゴリ名.<p>
	 *
	 */
	public void fix_calc_ctg_nm(String value) {
		setConstString(offset + 48, $fix_calc_ctg_nm, value);
	}


	public String getString(String name) {
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
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($par_unit_cd.equalsIgnoreCase(name)) {
			return par_unit_cd();
		}
		if ($par_unit_nm.equalsIgnoreCase(name)) {
			return par_unit_nm();
		}
		if ($chd_unit_cd.equalsIgnoreCase(name)) {
			return chd_unit_cd();
		}
		if ($chd_unit_nm.equalsIgnoreCase(name)) {
			return chd_unit_nm();
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			return alt_grp_cd();
		}
		if ($expns_cd.equalsIgnoreCase(name)) {
			return expns_cd();
		}
		if ($expns_nm.equalsIgnoreCase(name)) {
			return expns_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			return calc_ctg_cd();
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			return calc_ctg_nm();
		}
		if ($itm_calc_ctg_cd.equalsIgnoreCase(name)) {
			return itm_calc_ctg_cd();
		}
		if ($itm_calc_ctg_nm.equalsIgnoreCase(name)) {
			return itm_calc_ctg_nm();
		}
		if ($dtl_calc_ctg_cd.equalsIgnoreCase(name)) {
			return dtl_calc_ctg_cd();
		}
		if ($dtl_calc_ctg_nm.equalsIgnoreCase(name)) {
			return dtl_calc_ctg_nm();
		}
		if ($purc_calc_ctg_cd.equalsIgnoreCase(name)) {
			return purc_calc_ctg_cd();
		}
		if ($purc_calc_ctg_nm.equalsIgnoreCase(name)) {
			return purc_calc_ctg_nm();
		}
		if ($proc_calc_ctg_cd.equalsIgnoreCase(name)) {
			return proc_calc_ctg_cd();
		}
		if ($proc_calc_ctg_nm.equalsIgnoreCase(name)) {
			return proc_calc_ctg_nm();
		}
		if ($prov_calc_ctg_cd.equalsIgnoreCase(name)) {
			return prov_calc_ctg_cd();
		}
		if ($prov_calc_ctg_nm.equalsIgnoreCase(name)) {
			return prov_calc_ctg_nm();
		}
		if ($sls_calc_ctg_cd.equalsIgnoreCase(name)) {
			return sls_calc_ctg_cd();
		}
		if ($sls_calc_ctg_nm.equalsIgnoreCase(name)) {
			return sls_calc_ctg_nm();
		}
		if ($fix_calc_ctg_cd.equalsIgnoreCase(name)) {
			return fix_calc_ctg_cd();
		}
		if ($fix_calc_ctg_nm.equalsIgnoreCase(name)) {
			return fix_calc_ctg_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			return par_dec_place();
		}
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			return chd_dec_place();
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			return alt_itm_ratio();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($bottom_flg.equalsIgnoreCase(name)) {
			return bottom_flg();
		}
		if ($unreg_flg.equalsIgnoreCase(name)) {
			return unreg_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
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
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($par_unit_cd.equalsIgnoreCase(name)) {
			return par_unit_cd();
		}
		if ($par_unit_nm.equalsIgnoreCase(name)) {
			return par_unit_nm();
		}
		if ($chd_unit_cd.equalsIgnoreCase(name)) {
			return chd_unit_cd();
		}
		if ($chd_unit_nm.equalsIgnoreCase(name)) {
			return chd_unit_nm();
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			return alt_grp_cd();
		}
		if ($expns_cd.equalsIgnoreCase(name)) {
			return expns_cd();
		}
		if ($expns_nm.equalsIgnoreCase(name)) {
			return expns_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			return calc_ctg_cd();
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			return calc_ctg_nm();
		}
		if ($itm_calc_ctg_cd.equalsIgnoreCase(name)) {
			return itm_calc_ctg_cd();
		}
		if ($itm_calc_ctg_nm.equalsIgnoreCase(name)) {
			return itm_calc_ctg_nm();
		}
		if ($dtl_calc_ctg_cd.equalsIgnoreCase(name)) {
			return dtl_calc_ctg_cd();
		}
		if ($dtl_calc_ctg_nm.equalsIgnoreCase(name)) {
			return dtl_calc_ctg_nm();
		}
		if ($purc_calc_ctg_cd.equalsIgnoreCase(name)) {
			return purc_calc_ctg_cd();
		}
		if ($purc_calc_ctg_nm.equalsIgnoreCase(name)) {
			return purc_calc_ctg_nm();
		}
		if ($proc_calc_ctg_cd.equalsIgnoreCase(name)) {
			return proc_calc_ctg_cd();
		}
		if ($proc_calc_ctg_nm.equalsIgnoreCase(name)) {
			return proc_calc_ctg_nm();
		}
		if ($prov_calc_ctg_cd.equalsIgnoreCase(name)) {
			return prov_calc_ctg_cd();
		}
		if ($prov_calc_ctg_nm.equalsIgnoreCase(name)) {
			return prov_calc_ctg_nm();
		}
		if ($sls_calc_ctg_cd.equalsIgnoreCase(name)) {
			return sls_calc_ctg_cd();
		}
		if ($sls_calc_ctg_nm.equalsIgnoreCase(name)) {
			return sls_calc_ctg_nm();
		}
		if ($fix_calc_ctg_cd.equalsIgnoreCase(name)) {
			return fix_calc_ctg_cd();
		}
		if ($fix_calc_ctg_nm.equalsIgnoreCase(name)) {
			return fix_calc_ctg_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			return par_dec_place();
		}
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			return chd_dec_place();
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			return alt_itm_ratio();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($bottom_flg.equalsIgnoreCase(name)) {
			return bottom_flg();
		}
		if ($unreg_flg.equalsIgnoreCase(name)) {
			return unreg_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
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
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
			return;
		}
		if ($par_unit_cd.equalsIgnoreCase(name)) {
			par_unit_cd(value);
			return;
		}
		if ($par_unit_nm.equalsIgnoreCase(name)) {
			par_unit_nm(value);
			return;
		}
		if ($chd_unit_cd.equalsIgnoreCase(name)) {
			chd_unit_cd(value);
			return;
		}
		if ($chd_unit_nm.equalsIgnoreCase(name)) {
			chd_unit_nm(value);
			return;
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			alt_grp_cd(value);
			return;
		}
		if ($expns_cd.equalsIgnoreCase(name)) {
			expns_cd(value);
			return;
		}
		if ($expns_nm.equalsIgnoreCase(name)) {
			expns_nm(value);
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
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			calc_ctg_cd(value);
			return;
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			calc_ctg_nm(value);
			return;
		}
		if ($itm_calc_ctg_cd.equalsIgnoreCase(name)) {
			itm_calc_ctg_cd(value);
			return;
		}
		if ($itm_calc_ctg_nm.equalsIgnoreCase(name)) {
			itm_calc_ctg_nm(value);
			return;
		}
		if ($dtl_calc_ctg_cd.equalsIgnoreCase(name)) {
			dtl_calc_ctg_cd(value);
			return;
		}
		if ($dtl_calc_ctg_nm.equalsIgnoreCase(name)) {
			dtl_calc_ctg_nm(value);
			return;
		}
		if ($purc_calc_ctg_cd.equalsIgnoreCase(name)) {
			purc_calc_ctg_cd(value);
			return;
		}
		if ($purc_calc_ctg_nm.equalsIgnoreCase(name)) {
			purc_calc_ctg_nm(value);
			return;
		}
		if ($proc_calc_ctg_cd.equalsIgnoreCase(name)) {
			proc_calc_ctg_cd(value);
			return;
		}
		if ($proc_calc_ctg_nm.equalsIgnoreCase(name)) {
			proc_calc_ctg_nm(value);
			return;
		}
		if ($prov_calc_ctg_cd.equalsIgnoreCase(name)) {
			prov_calc_ctg_cd(value);
			return;
		}
		if ($prov_calc_ctg_nm.equalsIgnoreCase(name)) {
			prov_calc_ctg_nm(value);
			return;
		}
		if ($sls_calc_ctg_cd.equalsIgnoreCase(name)) {
			sls_calc_ctg_cd(value);
			return;
		}
		if ($sls_calc_ctg_nm.equalsIgnoreCase(name)) {
			sls_calc_ctg_nm(value);
			return;
		}
		if ($fix_calc_ctg_cd.equalsIgnoreCase(name)) {
			fix_calc_ctg_cd(value);
			return;
		}
		if ($fix_calc_ctg_nm.equalsIgnoreCase(name)) {
			fix_calc_ctg_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			chd_dec_place(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			chd_dec_place(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			chd_dec_place(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			chd_dec_place(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			chd_dec_place(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($bottom_flg.equalsIgnoreCase(name)) {
			bottom_flg(value);
			return;
		}
		if ($unreg_flg.equalsIgnoreCase(name)) {
			unreg_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
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
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
			return;
		}
		if ($par_unit_cd.equalsIgnoreCase(name)) {
			par_unit_cd(value);
			return;
		}
		if ($par_unit_nm.equalsIgnoreCase(name)) {
			par_unit_nm(value);
			return;
		}
		if ($chd_unit_cd.equalsIgnoreCase(name)) {
			chd_unit_cd(value);
			return;
		}
		if ($chd_unit_nm.equalsIgnoreCase(name)) {
			chd_unit_nm(value);
			return;
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			alt_grp_cd(value);
			return;
		}
		if ($expns_cd.equalsIgnoreCase(name)) {
			expns_cd(value);
			return;
		}
		if ($expns_nm.equalsIgnoreCase(name)) {
			expns_nm(value);
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
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			calc_ctg_cd(value);
			return;
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			calc_ctg_nm(value);
			return;
		}
		if ($itm_calc_ctg_cd.equalsIgnoreCase(name)) {
			itm_calc_ctg_cd(value);
			return;
		}
		if ($itm_calc_ctg_nm.equalsIgnoreCase(name)) {
			itm_calc_ctg_nm(value);
			return;
		}
		if ($dtl_calc_ctg_cd.equalsIgnoreCase(name)) {
			dtl_calc_ctg_cd(value);
			return;
		}
		if ($dtl_calc_ctg_nm.equalsIgnoreCase(name)) {
			dtl_calc_ctg_nm(value);
			return;
		}
		if ($purc_calc_ctg_cd.equalsIgnoreCase(name)) {
			purc_calc_ctg_cd(value);
			return;
		}
		if ($purc_calc_ctg_nm.equalsIgnoreCase(name)) {
			purc_calc_ctg_nm(value);
			return;
		}
		if ($proc_calc_ctg_cd.equalsIgnoreCase(name)) {
			proc_calc_ctg_cd(value);
			return;
		}
		if ($proc_calc_ctg_nm.equalsIgnoreCase(name)) {
			proc_calc_ctg_nm(value);
			return;
		}
		if ($prov_calc_ctg_cd.equalsIgnoreCase(name)) {
			prov_calc_ctg_cd(value);
			return;
		}
		if ($prov_calc_ctg_nm.equalsIgnoreCase(name)) {
			prov_calc_ctg_nm(value);
			return;
		}
		if ($sls_calc_ctg_cd.equalsIgnoreCase(name)) {
			sls_calc_ctg_cd(value);
			return;
		}
		if ($sls_calc_ctg_nm.equalsIgnoreCase(name)) {
			sls_calc_ctg_nm(value);
			return;
		}
		if ($fix_calc_ctg_cd.equalsIgnoreCase(name)) {
			fix_calc_ctg_cd(value);
			return;
		}
		if ($fix_calc_ctg_nm.equalsIgnoreCase(name)) {
			fix_calc_ctg_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			chd_dec_place(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			chd_dec_place(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			chd_dec_place(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			chd_dec_place(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			chd_dec_place(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($bottom_flg.equalsIgnoreCase(name)) {
			bottom_flg(value);
			return;
		}
		if ($unreg_flg.equalsIgnoreCase(name)) {
			unreg_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($hrrchy_p.equalsIgnoreCase(name)) {
			return hrrchy_p();
		}
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($par_rqmt_qty_p.equalsIgnoreCase(name)) {
			return par_rqmt_qty_p();
		}
		if ($chd_rqmt_qty_p.equalsIgnoreCase(name)) {
			return chd_rqmt_qty_p();
		}
		if ($chd_base_qty_p.equalsIgnoreCase(name)) {
			return chd_base_qty_p();
		}
		if ($fxd_chd_rqmt_qty_p.equalsIgnoreCase(name)) {
			return fxd_chd_rqmt_qty_p();
		}
		if ($chd_min_qty_p.equalsIgnoreCase(name)) {
			return chd_min_qty_p();
		}
		if ($chd_batch_qty_p.equalsIgnoreCase(name)) {
			return chd_batch_qty_p();
		}
		if ($upper_itm_p.equalsIgnoreCase(name)) {
			return upper_itm_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($hrrchy_p.equalsIgnoreCase(name)) {
			hrrchy_p(
				((MCContainerMeta) hrrchy_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5210.HrrchyR.class, value)
			);
			return;
		}
		if ($itm_p.equalsIgnoreCase(name)) {
			itm_p(
				((MCContainerMeta) itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5030.ItmR.class, value)
			);
			return;
		}
		if ($par_rqmt_qty_p.equalsIgnoreCase(name)) {
			par_rqmt_qty_p(
				((MCContainerMeta) par_rqmt_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($chd_rqmt_qty_p.equalsIgnoreCase(name)) {
			chd_rqmt_qty_p(
				((MCContainerMeta) chd_rqmt_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($chd_base_qty_p.equalsIgnoreCase(name)) {
			chd_base_qty_p(
				((MCContainerMeta) chd_base_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($fxd_chd_rqmt_qty_p.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty_p(
				((MCContainerMeta) fxd_chd_rqmt_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($chd_min_qty_p.equalsIgnoreCase(name)) {
			chd_min_qty_p(
				((MCContainerMeta) chd_min_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($chd_batch_qty_p.equalsIgnoreCase(name)) {
			chd_batch_qty_p(
				((MCContainerMeta) chd_batch_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($upper_itm_p.equalsIgnoreCase(name)) {
			upper_itm_p(
				((MCContainerMeta) upper_itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5030.ItmR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public boolean ext() {
		return hrrchy_p().ext();
	}

	public void ext(boolean value) {
		hrrchy_p().ext(value);
	}

	public MCNumber hrrchy() {
		return hrrchy_p().hrrchy();
	}

	public void hrrchy(MCNumber value) {
		hrrchy_p().hrrchy(value);
	}

	public void hrrchy(int value) {
		hrrchy_p().hrrchy(value);
	}

	public void hrrchy(long value) {
		hrrchy_p().hrrchy(value);
	}

	public void hrrchy(float value) {
		hrrchy_p().hrrchy(value);
	}

	public void hrrchy(double value) {
		hrrchy_p().hrrchy(value);
	}

	public String hrrchy_str() {
		return hrrchy_p().hrrchy_str();
	}

	public void hrrchy_str(String value) {
		hrrchy_p().hrrchy_str(value);
	}

	public MCNumber extno() {
		return hrrchy_p().extno();
	}

	public void extno(MCNumber value) {
		hrrchy_p().extno(value);
	}

	public void extno(int value) {
		hrrchy_p().extno(value);
	}

	public void extno(long value) {
		hrrchy_p().extno(value);
	}

	public void extno(float value) {
		hrrchy_p().extno(value);
	}

	public void extno(double value) {
		hrrchy_p().extno(value);
	}

	public MCNumber par_extno() {
		return hrrchy_p().par_extno();
	}

	public void par_extno(MCNumber value) {
		hrrchy_p().par_extno(value);
	}

	public void par_extno(int value) {
		hrrchy_p().par_extno(value);
	}

	public void par_extno(long value) {
		hrrchy_p().par_extno(value);
	}

	public void par_extno(float value) {
		hrrchy_p().par_extno(value);
	}

	public void par_extno(double value) {
		hrrchy_p().par_extno(value);
	}

	public boolean loop_flg() {
		return hrrchy_p().loop_flg();
	}

	public void loop_flg(boolean value) {
		hrrchy_p().loop_flg(value);
	}

	public String leaf() {
		return hrrchy_p().leaf();
	}

	public void leaf(String value) {
		hrrchy_p().leaf(value);
	}

	/**
	 * Item 品目.<p>
	 *
	 */
	public String leaf_str() {
		return hrrchy_p().leaf_str();
	}

	/**
	 * Item 品目.<p>
	 *
	 */
	public void leaf_str(String value) {
		hrrchy_p().leaf_str(value);
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

	/**
	 * Parent required qty. 親必要数量.<p>
	 *
	 */
	public MCNumber par_rqmt_qty() {
		return par_rqmt_qty_p().qty();
	}

	/**
	 * Parent required qty. 親必要数量.<p>
	 *
	 */
	public void par_rqmt_qty(MCNumber value) {
		par_rqmt_qty_p().qty(value);
	}

	/**
	 * Parent required qty. 親必要数量.<p>
	 *
	 */
	public void par_rqmt_qty(int value) {
		par_rqmt_qty_p().qty(value);
	}

	/**
	 * Parent required qty. 親必要数量.<p>
	 *
	 */
	public void par_rqmt_qty(long value) {
		par_rqmt_qty_p().qty(value);
	}

	/**
	 * Parent required qty. 親必要数量.<p>
	 *
	 */
	public void par_rqmt_qty(float value) {
		par_rqmt_qty_p().qty(value);
	}

	/**
	 * Parent required qty. 親必要数量.<p>
	 *
	 */
	public void par_rqmt_qty(double value) {
		par_rqmt_qty_p().qty(value);
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public MCNumber chd_rqmt_qty() {
		return chd_rqmt_qty_p().qty();
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(MCNumber value) {
		chd_rqmt_qty_p().qty(value);
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(int value) {
		chd_rqmt_qty_p().qty(value);
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(long value) {
		chd_rqmt_qty_p().qty(value);
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(float value) {
		chd_rqmt_qty_p().qty(value);
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(double value) {
		chd_rqmt_qty_p().qty(value);
	}

	/**
	 * Child base qty. 子基準数量.<p>
	 *
	 */
	public MCNumber chd_base_qty() {
		return chd_base_qty_p().qty();
	}

	/**
	 * Child base qty. 子基準数量.<p>
	 *
	 */
	public void chd_base_qty(MCNumber value) {
		chd_base_qty_p().qty(value);
	}

	/**
	 * Child base qty. 子基準数量.<p>
	 *
	 */
	public void chd_base_qty(int value) {
		chd_base_qty_p().qty(value);
	}

	/**
	 * Child base qty. 子基準数量.<p>
	 *
	 */
	public void chd_base_qty(long value) {
		chd_base_qty_p().qty(value);
	}

	/**
	 * Child base qty. 子基準数量.<p>
	 *
	 */
	public void chd_base_qty(float value) {
		chd_base_qty_p().qty(value);
	}

	/**
	 * Child base qty. 子基準数量.<p>
	 *
	 */
	public void chd_base_qty(double value) {
		chd_base_qty_p().qty(value);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public MCNumber fxd_chd_rqmt_qty() {
		return fxd_chd_rqmt_qty_p().qty();
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(MCNumber value) {
		fxd_chd_rqmt_qty_p().qty(value);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(int value) {
		fxd_chd_rqmt_qty_p().qty(value);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(long value) {
		fxd_chd_rqmt_qty_p().qty(value);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(float value) {
		fxd_chd_rqmt_qty_p().qty(value);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(double value) {
		fxd_chd_rqmt_qty_p().qty(value);
	}

	/**
	 * Child min. required qty. 子最小必要数量.<p>
	 *
	 */
	public MCNumber chd_min_qty() {
		return chd_min_qty_p().qty();
	}

	/**
	 * Child min. required qty. 子最小必要数量.<p>
	 *
	 */
	public void chd_min_qty(MCNumber value) {
		chd_min_qty_p().qty(value);
	}

	/**
	 * Child min. required qty. 子最小必要数量.<p>
	 *
	 */
	public void chd_min_qty(int value) {
		chd_min_qty_p().qty(value);
	}

	/**
	 * Child min. required qty. 子最小必要数量.<p>
	 *
	 */
	public void chd_min_qty(long value) {
		chd_min_qty_p().qty(value);
	}

	/**
	 * Child min. required qty. 子最小必要数量.<p>
	 *
	 */
	public void chd_min_qty(float value) {
		chd_min_qty_p().qty(value);
	}

	/**
	 * Child min. required qty. 子最小必要数量.<p>
	 *
	 */
	public void chd_min_qty(double value) {
		chd_min_qty_p().qty(value);
	}

	/**
	 * Increments of child required qty. 子刻み必要数量.<p>
	 *
	 */
	public MCNumber chd_batch_qty() {
		return chd_batch_qty_p().qty();
	}

	/**
	 * Increments of child required qty. 子刻み必要数量.<p>
	 *
	 */
	public void chd_batch_qty(MCNumber value) {
		chd_batch_qty_p().qty(value);
	}

	/**
	 * Increments of child required qty. 子刻み必要数量.<p>
	 *
	 */
	public void chd_batch_qty(int value) {
		chd_batch_qty_p().qty(value);
	}

	/**
	 * Increments of child required qty. 子刻み必要数量.<p>
	 *
	 */
	public void chd_batch_qty(long value) {
		chd_batch_qty_p().qty(value);
	}

	/**
	 * Increments of child required qty. 子刻み必要数量.<p>
	 *
	 */
	public void chd_batch_qty(float value) {
		chd_batch_qty_p().qty(value);
	}

	/**
	 * Increments of child required qty. 子刻み必要数量.<p>
	 *
	 */
	public void chd_batch_qty(double value) {
		chd_batch_qty_p().qty(value);
	}

	/**
	 * Upper item cd. 上位品目ＣＤ.<p>
	 *
	 */
	public String upper_itm_cd() {
		return upper_itm_p().itm_cd();
	}

	/**
	 * Upper item cd. 上位品目ＣＤ.<p>
	 *
	 */
	public void upper_itm_cd(String value) {
		upper_itm_p().itm_cd(value);
	}

	/**
	 * Upper branch No. 1 上位枝番１.<p>
	 *
	 */
	public String upper_itm_sub1() {
		return upper_itm_p().itm_sub1();
	}

	/**
	 * Upper branch No. 1 上位枝番１.<p>
	 *
	 */
	public void upper_itm_sub1(String value) {
		upper_itm_p().itm_sub1(value);
	}

	/**
	 * Upper branch No. 2 上位枝番２.<p>
	 *
	 */
	public String upper_itm_sub2() {
		return upper_itm_p().itm_sub2();
	}

	/**
	 * Upper branch No. 2 上位枝番２.<p>
	 *
	 */
	public void upper_itm_sub2(String value) {
		upper_itm_p().itm_sub2(value);
	}

	/**
	 * Upper branch No. 3 上位枝番３.<p>
	 *
	 */
	public String upper_itm_sub3() {
		return upper_itm_p().itm_sub3();
	}

	/**
	 * Upper branch No. 3 上位枝番３.<p>
	 *
	 */
	public void upper_itm_sub3(String value) {
		upper_itm_p().itm_sub3(value);
	}

	/**
	 * Upper item name 上位品名.<p>
	 *
	 */
	public String upper_itm_nm() {
		return upper_itm_p().itm_nm();
	}

	/**
	 * Upper item name 上位品名.<p>
	 *
	 */
	public void upper_itm_nm(String value) {
		upper_itm_p().itm_nm(value);
	}

}

