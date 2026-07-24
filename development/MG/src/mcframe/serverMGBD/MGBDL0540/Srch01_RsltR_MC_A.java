package mcframe.serverMGBD.MGBDL0540;

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
	 * Configuration level 構成レベル.<p>
	 *
	 */
	public static final String $hrrchy = "hrrchy";
	/**
	 * Explode number 展開番号.<p>
	 *
	 */
	public static final String $extno = "extno";
	/**
	 * Parent explosion number 親展開番号.<p>
	 *
	 */
	public static final String $par_extno = "par_extno";
	/**
	 * Loop flg. ループＦＬＧ.<p>
	 *
	 */
	public static final String $loop_flg = "loop_flg";
	/**
	 * Bottom flg. 最下位ＦＬＧ.<p>
	 *
	 */
	public static final String $bottom_flg = "bottom_flg";
	/**
	 * Upper item cd. 上位品目ＣＤ.<p>
	 *
	 */
	public static final String $par_itm_cd = "par_itm_cd";
	/**
	 * Upper branch No. 1 上位枝番１.<p>
	 *
	 */
	public static final String $par_itm_sub1 = "par_itm_sub1";
	/**
	 * Upper branch No. 2 上位枝番２.<p>
	 *
	 */
	public static final String $par_itm_sub2 = "par_itm_sub2";
	/**
	 * Upper branch No. 3 上位枝番３.<p>
	 *
	 */
	public static final String $par_itm_sub3 = "par_itm_sub3";
	/**
	 * Upper item name 上位品名.<p>
	 *
	 */
	public static final String $par_itm_nm = "par_itm_nm";
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
	/**
	 * Required number of parent 親必要数.<p>
	 *
	 */
	public static final String $par_rqmt_qty = "par_rqmt_qty";
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
	/**
	 * Required number of child 子必要数.<p>
	 *
	 */
	public static final String $chd_rqmt_qty = "chd_rqmt_qty";
	/**
	 * Base number of child 子基準数.<p>
	 *
	 */
	public static final String $chd_base_qty = "chd_base_qty";
	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public static final String $fxd_chd_rqmt_qty = "fxd_chd_rqmt_qty";
	/**
	 * Child min. required qty. 子最小必要数量.<p>
	 *
	 */
	public static final String $chd_min_qty = "chd_min_qty";
	/**
	 * Increments of child required qty. 子刻み必要数量.<p>
	 *
	 */
	public static final String $chd_batch_qty = "chd_batch_qty";
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


	public static final MCMeta hrrchy_META = createCommonMeta($hrrchy, mcframe.commonMA.meta.MA_META.BOM_LVL);
	public static final MCMeta extno_META = createNumberMeta($extno);
	public static final MCMeta par_extno_META = createNumberMeta($par_extno);
	public static final MCMeta loop_flg_META = createCommonMeta($loop_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bottom_flg_META = createCommonMeta($bottom_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta par_itm_cd_META = createCommonMeta($par_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta par_itm_sub1_META = createCommonMeta($par_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta par_itm_sub2_META = createCommonMeta($par_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta par_itm_sub3_META = createCommonMeta($par_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta par_itm_nm_META = createCommonMeta($par_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
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
	public static final MCMeta bom_ptn_META = createCommonMeta($bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_nm_META = createCommonMeta($oper_nm, mcframe.commonMA.meta.MA_META.OPER_NM);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta par_rqmt_qty_META = createCommonMeta($par_rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta par_unit_cd_META = createCommonMeta($par_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta par_unit_nm_META = createCommonMeta($par_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta par_dec_place_META = createCommonMeta($par_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta chd_rqmt_qty_META = createCommonMeta($chd_rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta chd_base_qty_META = createCommonMeta($chd_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta fxd_chd_rqmt_qty_META = createCommonMeta($fxd_chd_rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta chd_min_qty_META = createCommonMeta($chd_min_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta chd_batch_qty_META = createCommonMeta($chd_batch_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta chd_unit_cd_META = createCommonMeta($chd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta chd_unit_nm_META = createCommonMeta($chd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta chd_dec_place_META = createCommonMeta($chd_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta alt_grp_cd_META = createCommonMeta($alt_grp_cd, mcframe.commonMA.meta.MA_META.ALT_GRP_CD);
	public static final MCMeta alt_itm_ratio_META = createCommonMeta($alt_itm_ratio, mcframe.commonMA.meta.MA_META.ALT_ITM_RATIO);
	public static final MCMeta expns_cd_META = createCommonMeta($expns_cd, mcframe.commonMA.meta.MA_META.EXPNS_CD);
	public static final MCMeta expns_nm_META = createCommonMeta($expns_nm, mcframe.commonMA.meta.MA_META.EXPNS_NM);
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

	protected static final ConstMetaList<Srch01_RsltR> constMetas = new ConstMetaList<Srch01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			hrrchy_META,
			extno_META,
			par_extno_META,
			loop_flg_META,
			bottom_flg_META,
			par_itm_cd_META,
			par_itm_sub1_META,
			par_itm_sub2_META,
			par_itm_sub3_META,
			par_itm_nm_META,
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
			bom_ptn_META,
			oper_cd_META,
			oper_nm_META,
			disp_seq_META,
			par_rqmt_qty_META,
			par_unit_cd_META,
			par_unit_nm_META,
			par_dec_place_META,
			chd_rqmt_qty_META,
			chd_base_qty_META,
			fxd_chd_rqmt_qty_META,
			chd_min_qty_META,
			chd_batch_qty_META,
			chd_unit_cd_META,
			chd_unit_nm_META,
			chd_dec_place_META,
			alt_grp_cd_META,
			alt_itm_ratio_META,
			expns_cd_META,
			expns_nm_META,
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
				{$itm_typ, "MAC_ITM_TYP"}	// itm_typ
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
	 * Configuration level 構成レベル.<p>
	 *
	 */
	public MCNumber hrrchy() {
		return getConstNumber(offset + 0, $hrrchy);
	}

	/**
	 * Configuration level 構成レベル.<p>
	 *
	 */
	public void hrrchy(MCNumber value) {
		setConstNumber(offset + 0, $hrrchy, value);
	}

	/**
	 * Configuration level 構成レベル.<p>
	 *
	 */
	public void hrrchy(int value) {
		setConstNumber(offset + 0, $hrrchy, value);
	}

	/**
	 * Configuration level 構成レベル.<p>
	 *
	 */
	public void hrrchy(long value) {
		setConstNumber(offset + 0, $hrrchy, value);
	}

	/**
	 * Configuration level 構成レベル.<p>
	 *
	 */
	public void hrrchy(float value) {
		setConstNumber(offset + 0, $hrrchy, value);
	}

	/**
	 * Configuration level 構成レベル.<p>
	 *
	 */
	public void hrrchy(double value) {
		setConstNumber(offset + 0, $hrrchy, value);
	}


	/**
	 * Explode number 展開番号.<p>
	 *
	 */
	public MCNumber extno() {
		return getConstNumber(offset + 1, $extno);
	}

	/**
	 * Explode number 展開番号.<p>
	 *
	 */
	public void extno(MCNumber value) {
		setConstNumber(offset + 1, $extno, value);
	}

	/**
	 * Explode number 展開番号.<p>
	 *
	 */
	public void extno(int value) {
		setConstNumber(offset + 1, $extno, value);
	}

	/**
	 * Explode number 展開番号.<p>
	 *
	 */
	public void extno(long value) {
		setConstNumber(offset + 1, $extno, value);
	}

	/**
	 * Explode number 展開番号.<p>
	 *
	 */
	public void extno(float value) {
		setConstNumber(offset + 1, $extno, value);
	}

	/**
	 * Explode number 展開番号.<p>
	 *
	 */
	public void extno(double value) {
		setConstNumber(offset + 1, $extno, value);
	}


	/**
	 * Parent explosion number 親展開番号.<p>
	 *
	 */
	public MCNumber par_extno() {
		return getConstNumber(offset + 2, $par_extno);
	}

	/**
	 * Parent explosion number 親展開番号.<p>
	 *
	 */
	public void par_extno(MCNumber value) {
		setConstNumber(offset + 2, $par_extno, value);
	}

	/**
	 * Parent explosion number 親展開番号.<p>
	 *
	 */
	public void par_extno(int value) {
		setConstNumber(offset + 2, $par_extno, value);
	}

	/**
	 * Parent explosion number 親展開番号.<p>
	 *
	 */
	public void par_extno(long value) {
		setConstNumber(offset + 2, $par_extno, value);
	}

	/**
	 * Parent explosion number 親展開番号.<p>
	 *
	 */
	public void par_extno(float value) {
		setConstNumber(offset + 2, $par_extno, value);
	}

	/**
	 * Parent explosion number 親展開番号.<p>
	 *
	 */
	public void par_extno(double value) {
		setConstNumber(offset + 2, $par_extno, value);
	}


	/**
	 * Loop flg. ループＦＬＧ.<p>
	 *
	 */
	public boolean loop_flg() {
		return getConstBoolean(offset + 3, $loop_flg);
	}

	/**
	 * Loop flg. ループＦＬＧ.<p>
	 *
	 */
	public void loop_flg(boolean value) {
		setConstBoolean(offset + 3, $loop_flg, value);
	}


	/**
	 * Bottom flg. 最下位ＦＬＧ.<p>
	 *
	 */
	public boolean bottom_flg() {
		return getConstBoolean(offset + 4, $bottom_flg);
	}

	/**
	 * Bottom flg. 最下位ＦＬＧ.<p>
	 *
	 */
	public void bottom_flg(boolean value) {
		setConstBoolean(offset + 4, $bottom_flg, value);
	}


	/**
	 * Upper item cd. 上位品目ＣＤ.<p>
	 *
	 */
	public String par_itm_cd() {
		return getConstString(offset + 5, $par_itm_cd);
	}

	/**
	 * Upper item cd. 上位品目ＣＤ.<p>
	 *
	 */
	public void par_itm_cd(String value) {
		setConstString(offset + 5, $par_itm_cd, value);
	}


	/**
	 * Upper branch No. 1 上位枝番１.<p>
	 *
	 */
	public String par_itm_sub1() {
		return getConstString(offset + 6, $par_itm_sub1);
	}

	/**
	 * Upper branch No. 1 上位枝番１.<p>
	 *
	 */
	public void par_itm_sub1(String value) {
		setConstString(offset + 6, $par_itm_sub1, value);
	}


	/**
	 * Upper branch No. 2 上位枝番２.<p>
	 *
	 */
	public String par_itm_sub2() {
		return getConstString(offset + 7, $par_itm_sub2);
	}

	/**
	 * Upper branch No. 2 上位枝番２.<p>
	 *
	 */
	public void par_itm_sub2(String value) {
		setConstString(offset + 7, $par_itm_sub2, value);
	}


	/**
	 * Upper branch No. 3 上位枝番３.<p>
	 *
	 */
	public String par_itm_sub3() {
		return getConstString(offset + 8, $par_itm_sub3);
	}

	/**
	 * Upper branch No. 3 上位枝番３.<p>
	 *
	 */
	public void par_itm_sub3(String value) {
		setConstString(offset + 8, $par_itm_sub3, value);
	}


	/**
	 * Upper item name 上位品名.<p>
	 *
	 */
	public String par_itm_nm() {
		return getConstString(offset + 9, $par_itm_nm);
	}

	/**
	 * Upper item name 上位品名.<p>
	 *
	 */
	public void par_itm_nm(String value) {
		setConstString(offset + 9, $par_itm_nm, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 10, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 10, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 11, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 11, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 12, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 12, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 13, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 13, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 14, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 14, $itm_nm, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 15, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 15, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 16, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 16, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 17, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 17, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 18, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 18, $itm_typ_d_nm, value);
	}


	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public String itm_jnl_cd() {
		return getConstString(offset + 19, $itm_jnl_cd);
	}

	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public void itm_jnl_cd(String value) {
		setConstString(offset + 19, $itm_jnl_cd, value);
	}


	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public String itm_jnl_nm() {
		return getConstString(offset + 20, $itm_jnl_nm);
	}

	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public void itm_jnl_nm(String value) {
		setConstString(offset + 20, $itm_jnl_nm, value);
	}


	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return getConstString(offset + 21, $bom_ptn);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		setConstString(offset + 21, $bom_ptn, value);
	}


	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 22, $oper_cd);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 22, $oper_cd, value);
	}


	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public String oper_nm() {
		return getConstString(offset + 23, $oper_nm);
	}

	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public void oper_nm(String value) {
		setConstString(offset + 23, $oper_nm, value);
	}


	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 24, $disp_seq);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 24, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 24, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 24, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 24, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 24, $disp_seq, value);
	}


	/**
	 * Required number of parent 親必要数.<p>
	 *
	 */
	public MCNumber par_rqmt_qty() {
		return getConstNumber(offset + 25, $par_rqmt_qty);
	}

	/**
	 * Required number of parent 親必要数.<p>
	 *
	 */
	public void par_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 25, $par_rqmt_qty, value);
	}

	/**
	 * Required number of parent 親必要数.<p>
	 *
	 */
	public void par_rqmt_qty(int value) {
		setConstNumber(offset + 25, $par_rqmt_qty, value);
	}

	/**
	 * Required number of parent 親必要数.<p>
	 *
	 */
	public void par_rqmt_qty(long value) {
		setConstNumber(offset + 25, $par_rqmt_qty, value);
	}

	/**
	 * Required number of parent 親必要数.<p>
	 *
	 */
	public void par_rqmt_qty(float value) {
		setConstNumber(offset + 25, $par_rqmt_qty, value);
	}

	/**
	 * Required number of parent 親必要数.<p>
	 *
	 */
	public void par_rqmt_qty(double value) {
		setConstNumber(offset + 25, $par_rqmt_qty, value);
	}


	/**
	 * Parent unit cd. 親単位ＣＤ.<p>
	 *
	 */
	public String par_unit_cd() {
		return getConstString(offset + 26, $par_unit_cd);
	}

	/**
	 * Parent unit cd. 親単位ＣＤ.<p>
	 *
	 */
	public void par_unit_cd(String value) {
		setConstString(offset + 26, $par_unit_cd, value);
	}


	/**
	 * Parent unit name 親単位名.<p>
	 *
	 */
	public String par_unit_nm() {
		return getConstString(offset + 27, $par_unit_nm);
	}

	/**
	 * Parent unit name 親単位名.<p>
	 *
	 */
	public void par_unit_nm(String value) {
		setConstString(offset + 27, $par_unit_nm, value);
	}


	/**
	 * Parent number of decimal places 親小数部有効桁数.<p>
	 *
	 */
	public MCNumber par_dec_place() {
		return getConstNumber(offset + 28, $par_dec_place);
	}

	/**
	 * Parent number of decimal places 親小数部有効桁数.<p>
	 *
	 */
	public void par_dec_place(MCNumber value) {
		setConstNumber(offset + 28, $par_dec_place, value);
	}

	/**
	 * Parent number of decimal places 親小数部有効桁数.<p>
	 *
	 */
	public void par_dec_place(int value) {
		setConstNumber(offset + 28, $par_dec_place, value);
	}

	/**
	 * Parent number of decimal places 親小数部有効桁数.<p>
	 *
	 */
	public void par_dec_place(long value) {
		setConstNumber(offset + 28, $par_dec_place, value);
	}

	/**
	 * Parent number of decimal places 親小数部有効桁数.<p>
	 *
	 */
	public void par_dec_place(float value) {
		setConstNumber(offset + 28, $par_dec_place, value);
	}

	/**
	 * Parent number of decimal places 親小数部有効桁数.<p>
	 *
	 */
	public void par_dec_place(double value) {
		setConstNumber(offset + 28, $par_dec_place, value);
	}


	/**
	 * Required number of child 子必要数.<p>
	 *
	 */
	public MCNumber chd_rqmt_qty() {
		return getConstNumber(offset + 29, $chd_rqmt_qty);
	}

	/**
	 * Required number of child 子必要数.<p>
	 *
	 */
	public void chd_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 29, $chd_rqmt_qty, value);
	}

	/**
	 * Required number of child 子必要数.<p>
	 *
	 */
	public void chd_rqmt_qty(int value) {
		setConstNumber(offset + 29, $chd_rqmt_qty, value);
	}

	/**
	 * Required number of child 子必要数.<p>
	 *
	 */
	public void chd_rqmt_qty(long value) {
		setConstNumber(offset + 29, $chd_rqmt_qty, value);
	}

	/**
	 * Required number of child 子必要数.<p>
	 *
	 */
	public void chd_rqmt_qty(float value) {
		setConstNumber(offset + 29, $chd_rqmt_qty, value);
	}

	/**
	 * Required number of child 子必要数.<p>
	 *
	 */
	public void chd_rqmt_qty(double value) {
		setConstNumber(offset + 29, $chd_rqmt_qty, value);
	}


	/**
	 * Base number of child 子基準数.<p>
	 *
	 */
	public MCNumber chd_base_qty() {
		return getConstNumber(offset + 30, $chd_base_qty);
	}

	/**
	 * Base number of child 子基準数.<p>
	 *
	 */
	public void chd_base_qty(MCNumber value) {
		setConstNumber(offset + 30, $chd_base_qty, value);
	}

	/**
	 * Base number of child 子基準数.<p>
	 *
	 */
	public void chd_base_qty(int value) {
		setConstNumber(offset + 30, $chd_base_qty, value);
	}

	/**
	 * Base number of child 子基準数.<p>
	 *
	 */
	public void chd_base_qty(long value) {
		setConstNumber(offset + 30, $chd_base_qty, value);
	}

	/**
	 * Base number of child 子基準数.<p>
	 *
	 */
	public void chd_base_qty(float value) {
		setConstNumber(offset + 30, $chd_base_qty, value);
	}

	/**
	 * Base number of child 子基準数.<p>
	 *
	 */
	public void chd_base_qty(double value) {
		setConstNumber(offset + 30, $chd_base_qty, value);
	}


	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public MCNumber fxd_chd_rqmt_qty() {
		return getConstNumber(offset + 31, $fxd_chd_rqmt_qty);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 31, $fxd_chd_rqmt_qty, value);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(int value) {
		setConstNumber(offset + 31, $fxd_chd_rqmt_qty, value);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(long value) {
		setConstNumber(offset + 31, $fxd_chd_rqmt_qty, value);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(float value) {
		setConstNumber(offset + 31, $fxd_chd_rqmt_qty, value);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(double value) {
		setConstNumber(offset + 31, $fxd_chd_rqmt_qty, value);
	}


	/**
	 * Child min. required qty. 子最小必要数量.<p>
	 *
	 */
	public MCNumber chd_min_qty() {
		return getConstNumber(offset + 32, $chd_min_qty);
	}

	/**
	 * Child min. required qty. 子最小必要数量.<p>
	 *
	 */
	public void chd_min_qty(MCNumber value) {
		setConstNumber(offset + 32, $chd_min_qty, value);
	}

	/**
	 * Child min. required qty. 子最小必要数量.<p>
	 *
	 */
	public void chd_min_qty(int value) {
		setConstNumber(offset + 32, $chd_min_qty, value);
	}

	/**
	 * Child min. required qty. 子最小必要数量.<p>
	 *
	 */
	public void chd_min_qty(long value) {
		setConstNumber(offset + 32, $chd_min_qty, value);
	}

	/**
	 * Child min. required qty. 子最小必要数量.<p>
	 *
	 */
	public void chd_min_qty(float value) {
		setConstNumber(offset + 32, $chd_min_qty, value);
	}

	/**
	 * Child min. required qty. 子最小必要数量.<p>
	 *
	 */
	public void chd_min_qty(double value) {
		setConstNumber(offset + 32, $chd_min_qty, value);
	}


	/**
	 * Increments of child required qty. 子刻み必要数量.<p>
	 *
	 */
	public MCNumber chd_batch_qty() {
		return getConstNumber(offset + 33, $chd_batch_qty);
	}

	/**
	 * Increments of child required qty. 子刻み必要数量.<p>
	 *
	 */
	public void chd_batch_qty(MCNumber value) {
		setConstNumber(offset + 33, $chd_batch_qty, value);
	}

	/**
	 * Increments of child required qty. 子刻み必要数量.<p>
	 *
	 */
	public void chd_batch_qty(int value) {
		setConstNumber(offset + 33, $chd_batch_qty, value);
	}

	/**
	 * Increments of child required qty. 子刻み必要数量.<p>
	 *
	 */
	public void chd_batch_qty(long value) {
		setConstNumber(offset + 33, $chd_batch_qty, value);
	}

	/**
	 * Increments of child required qty. 子刻み必要数量.<p>
	 *
	 */
	public void chd_batch_qty(float value) {
		setConstNumber(offset + 33, $chd_batch_qty, value);
	}

	/**
	 * Increments of child required qty. 子刻み必要数量.<p>
	 *
	 */
	public void chd_batch_qty(double value) {
		setConstNumber(offset + 33, $chd_batch_qty, value);
	}


	/**
	 * Child unit cd. 子単位ＣＤ.<p>
	 *
	 */
	public String chd_unit_cd() {
		return getConstString(offset + 34, $chd_unit_cd);
	}

	/**
	 * Child unit cd. 子単位ＣＤ.<p>
	 *
	 */
	public void chd_unit_cd(String value) {
		setConstString(offset + 34, $chd_unit_cd, value);
	}


	/**
	 * Child unit name 子単位名.<p>
	 *
	 */
	public String chd_unit_nm() {
		return getConstString(offset + 35, $chd_unit_nm);
	}

	/**
	 * Child unit name 子単位名.<p>
	 *
	 */
	public void chd_unit_nm(String value) {
		setConstString(offset + 35, $chd_unit_nm, value);
	}


	/**
	 * Child number of decimal places 子小数部有効桁数.<p>
	 *
	 */
	public MCNumber chd_dec_place() {
		return getConstNumber(offset + 36, $chd_dec_place);
	}

	/**
	 * Child number of decimal places 子小数部有効桁数.<p>
	 *
	 */
	public void chd_dec_place(MCNumber value) {
		setConstNumber(offset + 36, $chd_dec_place, value);
	}

	/**
	 * Child number of decimal places 子小数部有効桁数.<p>
	 *
	 */
	public void chd_dec_place(int value) {
		setConstNumber(offset + 36, $chd_dec_place, value);
	}

	/**
	 * Child number of decimal places 子小数部有効桁数.<p>
	 *
	 */
	public void chd_dec_place(long value) {
		setConstNumber(offset + 36, $chd_dec_place, value);
	}

	/**
	 * Child number of decimal places 子小数部有効桁数.<p>
	 *
	 */
	public void chd_dec_place(float value) {
		setConstNumber(offset + 36, $chd_dec_place, value);
	}

	/**
	 * Child number of decimal places 子小数部有効桁数.<p>
	 *
	 */
	public void chd_dec_place(double value) {
		setConstNumber(offset + 36, $chd_dec_place, value);
	}


	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public String alt_grp_cd() {
		return getConstString(offset + 37, $alt_grp_cd);
	}

	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public void alt_grp_cd(String value) {
		setConstString(offset + 37, $alt_grp_cd, value);
	}


	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public MCNumber alt_itm_ratio() {
		return getConstNumber(offset + 38, $alt_itm_ratio);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(MCNumber value) {
		setConstNumber(offset + 38, $alt_itm_ratio, value);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(int value) {
		setConstNumber(offset + 38, $alt_itm_ratio, value);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(long value) {
		setConstNumber(offset + 38, $alt_itm_ratio, value);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(float value) {
		setConstNumber(offset + 38, $alt_itm_ratio, value);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(double value) {
		setConstNumber(offset + 38, $alt_itm_ratio, value);
	}


	/**
	 * Cost element cd. 費目ＣＤ.<p>
	 *
	 */
	public String expns_cd() {
		return getConstString(offset + 39, $expns_cd);
	}

	/**
	 * Cost element cd. 費目ＣＤ.<p>
	 *
	 */
	public void expns_cd(String value) {
		setConstString(offset + 39, $expns_cd, value);
	}


	/**
	 * Cost element name 費目名.<p>
	 *
	 */
	public String expns_nm() {
		return getConstString(offset + 40, $expns_nm);
	}

	/**
	 * Cost element name 費目名.<p>
	 *
	 */
	public void expns_nm(String value) {
		setConstString(offset + 40, $expns_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 41, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 41, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 42, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 42, $wg_nm, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_cd() {
		return getConstString(offset + 43, $calc_ctg_cd);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_cd(String value) {
		setConstString(offset + 43, $calc_ctg_cd, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_nm() {
		return getConstString(offset + 44, $calc_ctg_nm);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_nm(String value) {
		setConstString(offset + 44, $calc_ctg_nm, value);
	}


	/**
	 * Item calculation category cd. 品目計算カテゴリＣＤ.<p>
	 *
	 */
	public String itm_calc_ctg_cd() {
		return getConstString(offset + 45, $itm_calc_ctg_cd);
	}

	/**
	 * Item calculation category cd. 品目計算カテゴリＣＤ.<p>
	 *
	 */
	public void itm_calc_ctg_cd(String value) {
		setConstString(offset + 45, $itm_calc_ctg_cd, value);
	}


	/**
	 * Item calculation category name 品目計算カテゴリ名.<p>
	 *
	 */
	public String itm_calc_ctg_nm() {
		return getConstString(offset + 46, $itm_calc_ctg_nm);
	}

	/**
	 * Item calculation category name 品目計算カテゴリ名.<p>
	 *
	 */
	public void itm_calc_ctg_nm(String value) {
		setConstString(offset + 46, $itm_calc_ctg_nm, value);
	}


	/**
	 * Details calculation category cd. 詳細計算カテゴリＣＤ.<p>
	 *
	 */
	public String dtl_calc_ctg_cd() {
		return getConstString(offset + 47, $dtl_calc_ctg_cd);
	}

	/**
	 * Details calculation category cd. 詳細計算カテゴリＣＤ.<p>
	 *
	 */
	public void dtl_calc_ctg_cd(String value) {
		setConstString(offset + 47, $dtl_calc_ctg_cd, value);
	}


	/**
	 * Details calculation category name 詳細計算カテゴリ名.<p>
	 *
	 */
	public String dtl_calc_ctg_nm() {
		return getConstString(offset + 48, $dtl_calc_ctg_nm);
	}

	/**
	 * Details calculation category name 詳細計算カテゴリ名.<p>
	 *
	 */
	public void dtl_calc_ctg_nm(String value) {
		setConstString(offset + 48, $dtl_calc_ctg_nm, value);
	}


	/**
	 * Purchase calculation category cd. 購買計算カテゴリＣＤ.<p>
	 *
	 */
	public String purc_calc_ctg_cd() {
		return getConstString(offset + 49, $purc_calc_ctg_cd);
	}

	/**
	 * Purchase calculation category cd. 購買計算カテゴリＣＤ.<p>
	 *
	 */
	public void purc_calc_ctg_cd(String value) {
		setConstString(offset + 49, $purc_calc_ctg_cd, value);
	}


	/**
	 * Purchase calculation category name 購買計算カテゴリ名.<p>
	 *
	 */
	public String purc_calc_ctg_nm() {
		return getConstString(offset + 50, $purc_calc_ctg_nm);
	}

	/**
	 * Purchase calculation category name 購買計算カテゴリ名.<p>
	 *
	 */
	public void purc_calc_ctg_nm(String value) {
		setConstString(offset + 50, $purc_calc_ctg_nm, value);
	}


	/**
	 * Subcontracting calculation category cd. 加工計算カテゴリＣＤ.<p>
	 *
	 */
	public String proc_calc_ctg_cd() {
		return getConstString(offset + 51, $proc_calc_ctg_cd);
	}

	/**
	 * Subcontracting calculation category cd. 加工計算カテゴリＣＤ.<p>
	 *
	 */
	public void proc_calc_ctg_cd(String value) {
		setConstString(offset + 51, $proc_calc_ctg_cd, value);
	}


	/**
	 * Subcontracting calculation category name 加工計算カテゴリ名.<p>
	 *
	 */
	public String proc_calc_ctg_nm() {
		return getConstString(offset + 52, $proc_calc_ctg_nm);
	}

	/**
	 * Subcontracting calculation category name 加工計算カテゴリ名.<p>
	 *
	 */
	public void proc_calc_ctg_nm(String value) {
		setConstString(offset + 52, $proc_calc_ctg_nm, value);
	}


	/**
	 * Supply calculation category cd. 支給計算カテゴリＣＤ.<p>
	 *
	 */
	public String prov_calc_ctg_cd() {
		return getConstString(offset + 53, $prov_calc_ctg_cd);
	}

	/**
	 * Supply calculation category cd. 支給計算カテゴリＣＤ.<p>
	 *
	 */
	public void prov_calc_ctg_cd(String value) {
		setConstString(offset + 53, $prov_calc_ctg_cd, value);
	}


	/**
	 * Supply calculation category name 支給計算カテゴリ名.<p>
	 *
	 */
	public String prov_calc_ctg_nm() {
		return getConstString(offset + 54, $prov_calc_ctg_nm);
	}

	/**
	 * Supply calculation category name 支給計算カテゴリ名.<p>
	 *
	 */
	public void prov_calc_ctg_nm(String value) {
		setConstString(offset + 54, $prov_calc_ctg_nm, value);
	}


	/**
	 * Sales calculation category cd. 販売計算カテゴリＣＤ.<p>
	 *
	 */
	public String sls_calc_ctg_cd() {
		return getConstString(offset + 55, $sls_calc_ctg_cd);
	}

	/**
	 * Sales calculation category cd. 販売計算カテゴリＣＤ.<p>
	 *
	 */
	public void sls_calc_ctg_cd(String value) {
		setConstString(offset + 55, $sls_calc_ctg_cd, value);
	}


	/**
	 * Sales calculation category name 販売計算カテゴリ名.<p>
	 *
	 */
	public String sls_calc_ctg_nm() {
		return getConstString(offset + 56, $sls_calc_ctg_nm);
	}

	/**
	 * Sales calculation category name 販売計算カテゴリ名.<p>
	 *
	 */
	public void sls_calc_ctg_nm(String value) {
		setConstString(offset + 56, $sls_calc_ctg_nm, value);
	}


	/**
	 * Limit unit price calculation category cd. 指値計算カテゴリＣＤ.<p>
	 *
	 */
	public String fix_calc_ctg_cd() {
		return getConstString(offset + 57, $fix_calc_ctg_cd);
	}

	/**
	 * Limit unit price calculation category cd. 指値計算カテゴリＣＤ.<p>
	 *
	 */
	public void fix_calc_ctg_cd(String value) {
		setConstString(offset + 57, $fix_calc_ctg_cd, value);
	}


	/**
	 * Limit unit price calculation category name 指値計算カテゴリ名.<p>
	 *
	 */
	public String fix_calc_ctg_nm() {
		return getConstString(offset + 58, $fix_calc_ctg_nm);
	}

	/**
	 * Limit unit price calculation category name 指値計算カテゴリ名.<p>
	 *
	 */
	public void fix_calc_ctg_nm(String value) {
		setConstString(offset + 58, $fix_calc_ctg_nm, value);
	}


	public String getString(String name) {
		if ($par_itm_cd.equalsIgnoreCase(name)) {
			return par_itm_cd();
		}
		if ($par_itm_sub1.equalsIgnoreCase(name)) {
			return par_itm_sub1();
		}
		if ($par_itm_sub2.equalsIgnoreCase(name)) {
			return par_itm_sub2();
		}
		if ($par_itm_sub3.equalsIgnoreCase(name)) {
			return par_itm_sub3();
		}
		if ($par_itm_nm.equalsIgnoreCase(name)) {
			return par_itm_nm();
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
		if ($hrrchy.equalsIgnoreCase(name)) {
			return hrrchy();
		}
		if ($extno.equalsIgnoreCase(name)) {
			return extno();
		}
		if ($par_extno.equalsIgnoreCase(name)) {
			return par_extno();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($par_rqmt_qty.equalsIgnoreCase(name)) {
			return par_rqmt_qty();
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			return par_dec_place();
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			return chd_rqmt_qty();
		}
		if ($chd_base_qty.equalsIgnoreCase(name)) {
			return chd_base_qty();
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			return fxd_chd_rqmt_qty();
		}
		if ($chd_min_qty.equalsIgnoreCase(name)) {
			return chd_min_qty();
		}
		if ($chd_batch_qty.equalsIgnoreCase(name)) {
			return chd_batch_qty();
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
		if ($loop_flg.equalsIgnoreCase(name)) {
			return loop_flg();
		}
		if ($bottom_flg.equalsIgnoreCase(name)) {
			return bottom_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($par_itm_cd.equalsIgnoreCase(name)) {
			return par_itm_cd();
		}
		if ($par_itm_sub1.equalsIgnoreCase(name)) {
			return par_itm_sub1();
		}
		if ($par_itm_sub2.equalsIgnoreCase(name)) {
			return par_itm_sub2();
		}
		if ($par_itm_sub3.equalsIgnoreCase(name)) {
			return par_itm_sub3();
		}
		if ($par_itm_nm.equalsIgnoreCase(name)) {
			return par_itm_nm();
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
		if ($hrrchy.equalsIgnoreCase(name)) {
			return hrrchy();
		}
		if ($extno.equalsIgnoreCase(name)) {
			return extno();
		}
		if ($par_extno.equalsIgnoreCase(name)) {
			return par_extno();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($par_rqmt_qty.equalsIgnoreCase(name)) {
			return par_rqmt_qty();
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			return par_dec_place();
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			return chd_rqmt_qty();
		}
		if ($chd_base_qty.equalsIgnoreCase(name)) {
			return chd_base_qty();
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			return fxd_chd_rqmt_qty();
		}
		if ($chd_min_qty.equalsIgnoreCase(name)) {
			return chd_min_qty();
		}
		if ($chd_batch_qty.equalsIgnoreCase(name)) {
			return chd_batch_qty();
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
		if ($loop_flg.equalsIgnoreCase(name)) {
			return loop_flg();
		}
		if ($bottom_flg.equalsIgnoreCase(name)) {
			return bottom_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($par_itm_cd.equalsIgnoreCase(name)) {
			par_itm_cd(value);
			return;
		}
		if ($par_itm_sub1.equalsIgnoreCase(name)) {
			par_itm_sub1(value);
			return;
		}
		if ($par_itm_sub2.equalsIgnoreCase(name)) {
			par_itm_sub2(value);
			return;
		}
		if ($par_itm_sub3.equalsIgnoreCase(name)) {
			par_itm_sub3(value);
			return;
		}
		if ($par_itm_nm.equalsIgnoreCase(name)) {
			par_itm_nm(value);
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
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		if ($extno.equalsIgnoreCase(name)) {
			extno(value);
			return;
		}
		if ($par_extno.equalsIgnoreCase(name)) {
			par_extno(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($par_rqmt_qty.equalsIgnoreCase(name)) {
			par_rqmt_qty(value);
			return;
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($chd_base_qty.equalsIgnoreCase(name)) {
			chd_base_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($chd_min_qty.equalsIgnoreCase(name)) {
			chd_min_qty(value);
			return;
		}
		if ($chd_batch_qty.equalsIgnoreCase(name)) {
			chd_batch_qty(value);
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
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		if ($extno.equalsIgnoreCase(name)) {
			extno(value);
			return;
		}
		if ($par_extno.equalsIgnoreCase(name)) {
			par_extno(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($par_rqmt_qty.equalsIgnoreCase(name)) {
			par_rqmt_qty(value);
			return;
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($chd_base_qty.equalsIgnoreCase(name)) {
			chd_base_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($chd_min_qty.equalsIgnoreCase(name)) {
			chd_min_qty(value);
			return;
		}
		if ($chd_batch_qty.equalsIgnoreCase(name)) {
			chd_batch_qty(value);
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
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		if ($extno.equalsIgnoreCase(name)) {
			extno(value);
			return;
		}
		if ($par_extno.equalsIgnoreCase(name)) {
			par_extno(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($par_rqmt_qty.equalsIgnoreCase(name)) {
			par_rqmt_qty(value);
			return;
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($chd_base_qty.equalsIgnoreCase(name)) {
			chd_base_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($chd_min_qty.equalsIgnoreCase(name)) {
			chd_min_qty(value);
			return;
		}
		if ($chd_batch_qty.equalsIgnoreCase(name)) {
			chd_batch_qty(value);
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
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		if ($extno.equalsIgnoreCase(name)) {
			extno(value);
			return;
		}
		if ($par_extno.equalsIgnoreCase(name)) {
			par_extno(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($par_rqmt_qty.equalsIgnoreCase(name)) {
			par_rqmt_qty(value);
			return;
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($chd_base_qty.equalsIgnoreCase(name)) {
			chd_base_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($chd_min_qty.equalsIgnoreCase(name)) {
			chd_min_qty(value);
			return;
		}
		if ($chd_batch_qty.equalsIgnoreCase(name)) {
			chd_batch_qty(value);
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
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		if ($extno.equalsIgnoreCase(name)) {
			extno(value);
			return;
		}
		if ($par_extno.equalsIgnoreCase(name)) {
			par_extno(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($par_rqmt_qty.equalsIgnoreCase(name)) {
			par_rqmt_qty(value);
			return;
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($chd_base_qty.equalsIgnoreCase(name)) {
			chd_base_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($chd_min_qty.equalsIgnoreCase(name)) {
			chd_min_qty(value);
			return;
		}
		if ($chd_batch_qty.equalsIgnoreCase(name)) {
			chd_batch_qty(value);
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
		if ($loop_flg.equalsIgnoreCase(name)) {
			loop_flg(value);
			return;
		}
		if ($bottom_flg.equalsIgnoreCase(name)) {
			bottom_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($par_itm_cd.equalsIgnoreCase(name)) {
			par_itm_cd(value);
			return;
		}
		if ($par_itm_sub1.equalsIgnoreCase(name)) {
			par_itm_sub1(value);
			return;
		}
		if ($par_itm_sub2.equalsIgnoreCase(name)) {
			par_itm_sub2(value);
			return;
		}
		if ($par_itm_sub3.equalsIgnoreCase(name)) {
			par_itm_sub3(value);
			return;
		}
		if ($par_itm_nm.equalsIgnoreCase(name)) {
			par_itm_nm(value);
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
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		if ($extno.equalsIgnoreCase(name)) {
			extno(value);
			return;
		}
		if ($par_extno.equalsIgnoreCase(name)) {
			par_extno(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($par_rqmt_qty.equalsIgnoreCase(name)) {
			par_rqmt_qty(value);
			return;
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($chd_base_qty.equalsIgnoreCase(name)) {
			chd_base_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($chd_min_qty.equalsIgnoreCase(name)) {
			chd_min_qty(value);
			return;
		}
		if ($chd_batch_qty.equalsIgnoreCase(name)) {
			chd_batch_qty(value);
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
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		if ($extno.equalsIgnoreCase(name)) {
			extno(value);
			return;
		}
		if ($par_extno.equalsIgnoreCase(name)) {
			par_extno(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($par_rqmt_qty.equalsIgnoreCase(name)) {
			par_rqmt_qty(value);
			return;
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($chd_base_qty.equalsIgnoreCase(name)) {
			chd_base_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($chd_min_qty.equalsIgnoreCase(name)) {
			chd_min_qty(value);
			return;
		}
		if ($chd_batch_qty.equalsIgnoreCase(name)) {
			chd_batch_qty(value);
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
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		if ($extno.equalsIgnoreCase(name)) {
			extno(value);
			return;
		}
		if ($par_extno.equalsIgnoreCase(name)) {
			par_extno(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($par_rqmt_qty.equalsIgnoreCase(name)) {
			par_rqmt_qty(value);
			return;
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($chd_base_qty.equalsIgnoreCase(name)) {
			chd_base_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($chd_min_qty.equalsIgnoreCase(name)) {
			chd_min_qty(value);
			return;
		}
		if ($chd_batch_qty.equalsIgnoreCase(name)) {
			chd_batch_qty(value);
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
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		if ($extno.equalsIgnoreCase(name)) {
			extno(value);
			return;
		}
		if ($par_extno.equalsIgnoreCase(name)) {
			par_extno(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($par_rqmt_qty.equalsIgnoreCase(name)) {
			par_rqmt_qty(value);
			return;
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($chd_base_qty.equalsIgnoreCase(name)) {
			chd_base_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($chd_min_qty.equalsIgnoreCase(name)) {
			chd_min_qty(value);
			return;
		}
		if ($chd_batch_qty.equalsIgnoreCase(name)) {
			chd_batch_qty(value);
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
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		if ($extno.equalsIgnoreCase(name)) {
			extno(value);
			return;
		}
		if ($par_extno.equalsIgnoreCase(name)) {
			par_extno(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($par_rqmt_qty.equalsIgnoreCase(name)) {
			par_rqmt_qty(value);
			return;
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($chd_base_qty.equalsIgnoreCase(name)) {
			chd_base_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($chd_min_qty.equalsIgnoreCase(name)) {
			chd_min_qty(value);
			return;
		}
		if ($chd_batch_qty.equalsIgnoreCase(name)) {
			chd_batch_qty(value);
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
		if ($loop_flg.equalsIgnoreCase(name)) {
			loop_flg(value);
			return;
		}
		if ($bottom_flg.equalsIgnoreCase(name)) {
			bottom_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

