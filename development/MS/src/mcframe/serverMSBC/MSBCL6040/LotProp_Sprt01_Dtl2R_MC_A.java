package mcframe.serverMSBC.MSBCL6040;

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
 * ブロック"LotProp_Sprt01_Dtl2"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class LotProp_Sprt01_Dtl2R_MC_A extends MCConstRow {

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public static final String $oper_peg_no = "oper_peg_no";
	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Pegging No. for aggregation 集約用紐付けＮＯ.<p>
	 *
	 */
	public static final String $sum_peg_no = "sum_peg_no";
	/**
	 * Additional row 追加行.<p>
	 *
	 */
	public static final String $add_flg = "add_flg";
	/**
	 * With unallocated 未引当あり.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Input schedule No. 投入予定ＮＯ.<p>
	 *
	 */
	public static final String $inpt_schd_no = "inpt_schd_no";
	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public static final String $div_seq = "div_seq";
	/**
	 * Input date 投入日.<p>
	 *
	 */
	public static final String $inpt_dt = "inpt_dt";
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
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public static final String $ver_no = "ver_no";
	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public static final String $alt_grp_cd = "alt_grp_cd";
	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public static final String $alt_grp_seq = "alt_grp_seq";
	/**
	 * Specify alternative item 代替品目指定.<p>
	 *
	 */
	public static final String $alt_itm_fix_flg = "alt_itm_fix_flg";
	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public static final String $oper_inst_no = "oper_inst_no";
	/**
	 * Alternative item unallocated qty. 代替品目未引当数量.<p>
	 *
	 */
	public static final String $not_alloc_qty = "not_alloc_qty";
	/**
	 * Alternative item unallocated active ingredient 代替品目未引当有効成分.<p>
	 *
	 */
	public static final String $not_alloc_cont_qty = "not_alloc_cont_qty";
	/**
	 * Input location cd. 投入場所ＣＤ.<p>
	 *
	 */
	public static final String $inpt_loc_cd = "inpt_loc_cd";
	/**
	 * Input rack/line cd. 投入棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $inpt_str_ln_cd = "inpt_str_ln_cd";
	/**
	 * Input location supplier cd. 投入場所発注先ＣＤ.<p>
	 *
	 */
	public static final String $inpt_sppl_cd = "inpt_sppl_cd";
	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public static final String $quality_typ = "quality_typ";
	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public static final String $stk_insp_typ = "stk_insp_typ";
	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public static final String $gd_cd = "gd_cd";
	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public static final String $gd_nm = "gd_nm";
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
	public static final String $rqst_sno1 = "rqst_sno1";
	/**
	 * Allow without SEIBAN No. 1 手配ＮＯ１無し可.<p>
	 *
	 */
	public static final String $sno1_null_flg = "sno1_null_flg";
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public static final String $rqst_sno2 = "rqst_sno2";
	/**
	 * Allow without SEIBAN No. 2 手配ＮＯ２無し可.<p>
	 *
	 */
	public static final String $sno2_null_flg = "sno2_null_flg";
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public static final String $rqst_sno3 = "rqst_sno3";
	/**
	 * Allow without SEIBAN No. 3 手配ＮＯ３無し可.<p>
	 *
	 */
	public static final String $sno3_null_flg = "sno3_null_flg";
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public static final String $rqst_sno4 = "rqst_sno4";
	/**
	 * Allow without SEIBAN No. 4 手配ＮＯ４無し可.<p>
	 *
	 */
	public static final String $sno4_null_flg = "sno4_null_flg";
	/**
	 * Allocation SEIBAN No. 1 引当手配ＮＯ１.<p>
	 *
	 */
	public static final String $sno1 = "sno1";
	/**
	 * Allocation SEIBAN No. 2 引当手配ＮＯ２.<p>
	 *
	 */
	public static final String $sno2 = "sno2";
	/**
	 * Allocation SEIBAN No. 3 引当手配ＮＯ３.<p>
	 *
	 */
	public static final String $sno3 = "sno3";
	/**
	 * Allocation SEIBAN No. 4 引当手配ＮＯ４.<p>
	 *
	 */
	public static final String $sno4 = "sno4";
	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public static final String $base_unit_qty = "base_unit_qty";
	/**
	 * Active ingredient 有効成分.<p>
	 *
	 */
	public static final String $cont_qty = "cont_qty";
	/**
	 * Without lot ロット指定なし.<p>
	 *
	 */
	public static final String $not_lot_fix_flg = "not_lot_fix_flg";
	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public static final String $vld_dt = "vld_dt";
	/**
	 * Oldest GR date 最古入庫日.<p>
	 *
	 */
	public static final String $first_gr_dt = "first_gr_dt";
	/**
	 * Lot sequence ロットシーケンス.<p>
	 *
	 */
	public static final String $lot_seq = "lot_seq";
	/**
	 * Input qty. 投入数量.<p>
	 *
	 */
	public static final String $inpt_qty = "inpt_qty";
	/**
	 * Required qty. 必要数量.<p>
	 *
	 */
	public static final String $rqmt_qty = "rqmt_qty";
	/**
	 * Fixed required qty. 固定必要数量.<p>
	 *
	 */
	public static final String $fxd_rqmt_qty = "fxd_rqmt_qty";
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public static final String $cont_inpt_qty = "cont_inpt_qty";
	/**
	 * Active ingredient (Required qty.) 有効成分（必要数量）.<p>
	 *
	 */
	public static final String $cont_rqmt_qty = "cont_rqmt_qty";
	/**
	 * Active ingredient (Constant) 有効成分（固定）.<p>
	 *
	 */
	public static final String $cont_fxd_rqmt_qty = "cont_fxd_rqmt_qty";
	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public static final String $act_cont_fctr = "act_cont_fctr";
	/**
	 * Allocation 引当.<p>
	 *
	 */
	public static final String $alloc_flg = "alloc_flg";


	public static final MCMeta oper_peg_no_META = createCommonMeta($oper_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta sum_peg_no_META = createCommonMeta($sum_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta add_flg_META = createCommonMeta($add_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inpt_schd_no_META = createCommonMeta($inpt_schd_no, mcframe.commonMA.meta.MA_META.INPT_SCHD_NO);
	public static final MCMeta div_seq_META = createCommonMeta($div_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta inpt_dt_META = createCommonMeta($inpt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta alt_grp_cd_META = createCommonMeta($alt_grp_cd, mcframe.commonMA.meta.MA_META.ALT_GRP_CD);
	public static final MCMeta alt_grp_seq_META = createCommonMeta($alt_grp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta alt_itm_fix_flg_META = createCommonMeta($alt_itm_fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta oper_inst_no_META = createCommonMeta($oper_inst_no, mcframe.commonMA.meta.MA_META.OPER_INST_NO);
	public static final MCMeta not_alloc_qty_META = createCommonMeta($not_alloc_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta not_alloc_cont_qty_META = createCommonMeta($not_alloc_cont_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta inpt_loc_cd_META = createCommonMeta($inpt_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta inpt_str_ln_cd_META = createCommonMeta($inpt_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta inpt_sppl_cd_META = createCommonMeta($inpt_sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta quality_typ_META = createCommonMeta($quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta stk_insp_typ_META = createCommonMeta($stk_insp_typ, mcframe.commonMS.meta.MS_META.STK_INSP_TYP);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta gd_nm_META = createCommonMeta($gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta rqst_sno1_META = createCommonMeta($rqst_sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno1_null_flg_META = createCommonMeta($sno1_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rqst_sno2_META = createCommonMeta($rqst_sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno2_null_flg_META = createCommonMeta($sno2_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rqst_sno3_META = createCommonMeta($rqst_sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno3_null_flg_META = createCommonMeta($sno3_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rqst_sno4_META = createCommonMeta($rqst_sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta sno4_null_flg_META = createCommonMeta($sno4_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta cont_qty_META = createCommonMeta($cont_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta not_lot_fix_flg_META = createCommonMeta($not_lot_fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta vld_dt_META = createCommonMeta($vld_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta first_gr_dt_META = createCommonMeta($first_gr_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lot_seq_META = createCommonMeta($lot_seq, mcframe.commonMA.meta.MA_META.LOT_SEQ);
	public static final MCMeta inpt_qty_META = createCommonMeta($inpt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta rqmt_qty_META = createCommonMeta($rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta fxd_rqmt_qty_META = createCommonMeta($fxd_rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta cont_inpt_qty_META = createCommonMeta($cont_inpt_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta cont_rqmt_qty_META = createCommonMeta($cont_rqmt_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta cont_fxd_rqmt_qty_META = createCommonMeta($cont_fxd_rqmt_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta act_cont_fctr_META = createCommonMeta($act_cont_fctr, mcframe.commonMA.meta.MA_META.ACT_CONT_FCTR);
	public static final MCMeta alloc_flg_META = createCommonMeta($alloc_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<LotProp_Sprt01_Dtl2R> constMetas = new ConstMetaList<LotProp_Sprt01_Dtl2R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			oper_peg_no_META,
			peg_no_META,
			sum_peg_no_META,
			add_flg_META,
			err_flg_META,
			inpt_schd_no_META,
			div_seq_META,
			inpt_dt_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			ver_no_META,
			alt_grp_cd_META,
			alt_grp_seq_META,
			alt_itm_fix_flg_META,
			oper_inst_no_META,
			not_alloc_qty_META,
			not_alloc_cont_qty_META,
			inpt_loc_cd_META,
			inpt_str_ln_cd_META,
			inpt_sppl_cd_META,
			quality_typ_META,
			stk_insp_typ_META,
			gd_cd_META,
			gd_nm_META,
			lot_no_META,
			sublot_no_META,
			rqst_sno1_META,
			sno1_null_flg_META,
			rqst_sno2_META,
			sno2_null_flg_META,
			rqst_sno3_META,
			sno3_null_flg_META,
			rqst_sno4_META,
			sno4_null_flg_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			base_unit_qty_META,
			cont_qty_META,
			not_lot_fix_flg_META,
			vld_dt_META,
			first_gr_dt_META,
			lot_seq_META,
			inpt_qty_META,
			rqmt_qty_META,
			fxd_rqmt_qty_META,
			base_unit_cd_META,
			cont_inpt_qty_META,
			cont_rqmt_qty_META,
			cont_fxd_rqmt_qty_META,
			act_cont_fctr_META,
			alloc_flg_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);


	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null
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
	protected LotProp_Sprt01_Dtl2R_MC_A(ConstMetaList<? extends LotProp_Sprt01_Dtl2R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public LotProp_Sprt01_Dtl2R clone() {
		return (LotProp_Sprt01_Dtl2R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public LotProp_Sprt01_Dtl2R createInstance() {
		return (LotProp_Sprt01_Dtl2R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public LotProp_Sprt01_Dtl2R getValues(String... names) {
		return (LotProp_Sprt01_Dtl2R) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public MCNumber oper_peg_no() {
		return getConstNumber(offset + 0, $oper_peg_no);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(MCNumber value) {
		setConstNumber(offset + 0, $oper_peg_no, value);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(int value) {
		setConstNumber(offset + 0, $oper_peg_no, value);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(long value) {
		setConstNumber(offset + 0, $oper_peg_no, value);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(float value) {
		setConstNumber(offset + 0, $oper_peg_no, value);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(double value) {
		setConstNumber(offset + 0, $oper_peg_no, value);
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 1, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 1, $peg_no, value);
	}


	/**
	 * Pegging No. for aggregation 集約用紐付けＮＯ.<p>
	 *
	 */
	public MCNumber sum_peg_no() {
		return getConstNumber(offset + 2, $sum_peg_no);
	}

	/**
	 * Pegging No. for aggregation 集約用紐付けＮＯ.<p>
	 *
	 */
	public void sum_peg_no(MCNumber value) {
		setConstNumber(offset + 2, $sum_peg_no, value);
	}

	/**
	 * Pegging No. for aggregation 集約用紐付けＮＯ.<p>
	 *
	 */
	public void sum_peg_no(int value) {
		setConstNumber(offset + 2, $sum_peg_no, value);
	}

	/**
	 * Pegging No. for aggregation 集約用紐付けＮＯ.<p>
	 *
	 */
	public void sum_peg_no(long value) {
		setConstNumber(offset + 2, $sum_peg_no, value);
	}

	/**
	 * Pegging No. for aggregation 集約用紐付けＮＯ.<p>
	 *
	 */
	public void sum_peg_no(float value) {
		setConstNumber(offset + 2, $sum_peg_no, value);
	}

	/**
	 * Pegging No. for aggregation 集約用紐付けＮＯ.<p>
	 *
	 */
	public void sum_peg_no(double value) {
		setConstNumber(offset + 2, $sum_peg_no, value);
	}


	/**
	 * Additional row 追加行.<p>
	 *
	 */
	public boolean add_flg() {
		return getConstBoolean(offset + 3, $add_flg);
	}

	/**
	 * Additional row 追加行.<p>
	 *
	 */
	public void add_flg(boolean value) {
		setConstBoolean(offset + 3, $add_flg, value);
	}


	/**
	 * With unallocated 未引当あり.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 4, $err_flg);
	}

	/**
	 * With unallocated 未引当あり.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 4, $err_flg, value);
	}


	/**
	 * Input schedule No. 投入予定ＮＯ.<p>
	 *
	 */
	public String inpt_schd_no() {
		return getConstString(offset + 5, $inpt_schd_no);
	}

	/**
	 * Input schedule No. 投入予定ＮＯ.<p>
	 *
	 */
	public void inpt_schd_no(String value) {
		setConstString(offset + 5, $inpt_schd_no, value);
	}


	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public MCNumber div_seq() {
		return getConstNumber(offset + 6, $div_seq);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(MCNumber value) {
		setConstNumber(offset + 6, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(int value) {
		setConstNumber(offset + 6, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(long value) {
		setConstNumber(offset + 6, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(float value) {
		setConstNumber(offset + 6, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(double value) {
		setConstNumber(offset + 6, $div_seq, value);
	}


	/**
	 * Input date 投入日.<p>
	 *
	 */
	public MCDate inpt_dt() {
		return getConstDate(offset + 7, $inpt_dt);
	}

	/**
	 * Input date 投入日.<p>
	 *
	 */
	public void inpt_dt(MCDate value) {
		setConstDate(offset + 7, $inpt_dt, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 8, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 8, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 9, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 9, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 10, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 10, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 11, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 11, $itm_sub3, value);
	}


	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 12, $ver_no);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 12, $ver_no, value);
	}


	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public String alt_grp_cd() {
		return getConstString(offset + 13, $alt_grp_cd);
	}

	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public void alt_grp_cd(String value) {
		setConstString(offset + 13, $alt_grp_cd, value);
	}


	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public MCNumber alt_grp_seq() {
		return getConstNumber(offset + 14, $alt_grp_seq);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(MCNumber value) {
		setConstNumber(offset + 14, $alt_grp_seq, value);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(int value) {
		setConstNumber(offset + 14, $alt_grp_seq, value);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(long value) {
		setConstNumber(offset + 14, $alt_grp_seq, value);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(float value) {
		setConstNumber(offset + 14, $alt_grp_seq, value);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(double value) {
		setConstNumber(offset + 14, $alt_grp_seq, value);
	}


	/**
	 * Specify alternative item 代替品目指定.<p>
	 *
	 */
	public boolean alt_itm_fix_flg() {
		return getConstBoolean(offset + 15, $alt_itm_fix_flg);
	}

	/**
	 * Specify alternative item 代替品目指定.<p>
	 *
	 */
	public void alt_itm_fix_flg(boolean value) {
		setConstBoolean(offset + 15, $alt_itm_fix_flg, value);
	}


	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public String oper_inst_no() {
		return getConstString(offset + 16, $oper_inst_no);
	}

	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public void oper_inst_no(String value) {
		setConstString(offset + 16, $oper_inst_no, value);
	}


	/**
	 * Alternative item unallocated qty. 代替品目未引当数量.<p>
	 *
	 */
	public MCNumber not_alloc_qty() {
		return getConstNumber(offset + 17, $not_alloc_qty);
	}

	/**
	 * Alternative item unallocated qty. 代替品目未引当数量.<p>
	 *
	 */
	public void not_alloc_qty(MCNumber value) {
		setConstNumber(offset + 17, $not_alloc_qty, value);
	}

	/**
	 * Alternative item unallocated qty. 代替品目未引当数量.<p>
	 *
	 */
	public void not_alloc_qty(int value) {
		setConstNumber(offset + 17, $not_alloc_qty, value);
	}

	/**
	 * Alternative item unallocated qty. 代替品目未引当数量.<p>
	 *
	 */
	public void not_alloc_qty(long value) {
		setConstNumber(offset + 17, $not_alloc_qty, value);
	}

	/**
	 * Alternative item unallocated qty. 代替品目未引当数量.<p>
	 *
	 */
	public void not_alloc_qty(float value) {
		setConstNumber(offset + 17, $not_alloc_qty, value);
	}

	/**
	 * Alternative item unallocated qty. 代替品目未引当数量.<p>
	 *
	 */
	public void not_alloc_qty(double value) {
		setConstNumber(offset + 17, $not_alloc_qty, value);
	}


	/**
	 * Alternative item unallocated active ingredient 代替品目未引当有効成分.<p>
	 *
	 */
	public MCNumber not_alloc_cont_qty() {
		return getConstNumber(offset + 18, $not_alloc_cont_qty);
	}

	/**
	 * Alternative item unallocated active ingredient 代替品目未引当有効成分.<p>
	 *
	 */
	public void not_alloc_cont_qty(MCNumber value) {
		setConstNumber(offset + 18, $not_alloc_cont_qty, value);
	}

	/**
	 * Alternative item unallocated active ingredient 代替品目未引当有効成分.<p>
	 *
	 */
	public void not_alloc_cont_qty(int value) {
		setConstNumber(offset + 18, $not_alloc_cont_qty, value);
	}

	/**
	 * Alternative item unallocated active ingredient 代替品目未引当有効成分.<p>
	 *
	 */
	public void not_alloc_cont_qty(long value) {
		setConstNumber(offset + 18, $not_alloc_cont_qty, value);
	}

	/**
	 * Alternative item unallocated active ingredient 代替品目未引当有効成分.<p>
	 *
	 */
	public void not_alloc_cont_qty(float value) {
		setConstNumber(offset + 18, $not_alloc_cont_qty, value);
	}

	/**
	 * Alternative item unallocated active ingredient 代替品目未引当有効成分.<p>
	 *
	 */
	public void not_alloc_cont_qty(double value) {
		setConstNumber(offset + 18, $not_alloc_cont_qty, value);
	}


	/**
	 * Input location cd. 投入場所ＣＤ.<p>
	 *
	 */
	public String inpt_loc_cd() {
		return getConstString(offset + 19, $inpt_loc_cd);
	}

	/**
	 * Input location cd. 投入場所ＣＤ.<p>
	 *
	 */
	public void inpt_loc_cd(String value) {
		setConstString(offset + 19, $inpt_loc_cd, value);
	}


	/**
	 * Input rack/line cd. 投入棚・ラインＣＤ.<p>
	 *
	 */
	public String inpt_str_ln_cd() {
		return getConstString(offset + 20, $inpt_str_ln_cd);
	}

	/**
	 * Input rack/line cd. 投入棚・ラインＣＤ.<p>
	 *
	 */
	public void inpt_str_ln_cd(String value) {
		setConstString(offset + 20, $inpt_str_ln_cd, value);
	}


	/**
	 * Input location supplier cd. 投入場所発注先ＣＤ.<p>
	 *
	 */
	public String inpt_sppl_cd() {
		return getConstString(offset + 21, $inpt_sppl_cd);
	}

	/**
	 * Input location supplier cd. 投入場所発注先ＣＤ.<p>
	 *
	 */
	public void inpt_sppl_cd(String value) {
		setConstString(offset + 21, $inpt_sppl_cd, value);
	}


	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return getConstString(offset + 22, $quality_typ);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		setConstString(offset + 22, $quality_typ, value);
	}


	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public String stk_insp_typ() {
		return getConstString(offset + 23, $stk_insp_typ);
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public void stk_insp_typ(String value) {
		setConstString(offset + 23, $stk_insp_typ, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 24, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 24, $gd_cd, value);
	}


	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 25, $gd_nm);
	}

	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 25, $gd_nm, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 26, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 26, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 27, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 27, $sublot_no, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String rqst_sno1() {
		return getConstString(offset + 28, $rqst_sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void rqst_sno1(String value) {
		setConstString(offset + 28, $rqst_sno1, value);
	}


	/**
	 * Allow without SEIBAN No. 1 手配ＮＯ１無し可.<p>
	 *
	 */
	public boolean sno1_null_flg() {
		return getConstBoolean(offset + 29, $sno1_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 1 手配ＮＯ１無し可.<p>
	 *
	 */
	public void sno1_null_flg(boolean value) {
		setConstBoolean(offset + 29, $sno1_null_flg, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String rqst_sno2() {
		return getConstString(offset + 30, $rqst_sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void rqst_sno2(String value) {
		setConstString(offset + 30, $rqst_sno2, value);
	}


	/**
	 * Allow without SEIBAN No. 2 手配ＮＯ２無し可.<p>
	 *
	 */
	public boolean sno2_null_flg() {
		return getConstBoolean(offset + 31, $sno2_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 2 手配ＮＯ２無し可.<p>
	 *
	 */
	public void sno2_null_flg(boolean value) {
		setConstBoolean(offset + 31, $sno2_null_flg, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String rqst_sno3() {
		return getConstString(offset + 32, $rqst_sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void rqst_sno3(String value) {
		setConstString(offset + 32, $rqst_sno3, value);
	}


	/**
	 * Allow without SEIBAN No. 3 手配ＮＯ３無し可.<p>
	 *
	 */
	public boolean sno3_null_flg() {
		return getConstBoolean(offset + 33, $sno3_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 3 手配ＮＯ３無し可.<p>
	 *
	 */
	public void sno3_null_flg(boolean value) {
		setConstBoolean(offset + 33, $sno3_null_flg, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String rqst_sno4() {
		return getConstString(offset + 34, $rqst_sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void rqst_sno4(String value) {
		setConstString(offset + 34, $rqst_sno4, value);
	}


	/**
	 * Allow without SEIBAN No. 4 手配ＮＯ４無し可.<p>
	 *
	 */
	public boolean sno4_null_flg() {
		return getConstBoolean(offset + 35, $sno4_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 4 手配ＮＯ４無し可.<p>
	 *
	 */
	public void sno4_null_flg(boolean value) {
		setConstBoolean(offset + 35, $sno4_null_flg, value);
	}


	/**
	 * Allocation SEIBAN No. 1 引当手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 36, $sno1);
	}

	/**
	 * Allocation SEIBAN No. 1 引当手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 36, $sno1, value);
	}


	/**
	 * Allocation SEIBAN No. 2 引当手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 37, $sno2);
	}

	/**
	 * Allocation SEIBAN No. 2 引当手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 37, $sno2, value);
	}


	/**
	 * Allocation SEIBAN No. 3 引当手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 38, $sno3);
	}

	/**
	 * Allocation SEIBAN No. 3 引当手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 38, $sno3, value);
	}


	/**
	 * Allocation SEIBAN No. 4 引当手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 39, $sno4);
	}

	/**
	 * Allocation SEIBAN No. 4 引当手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 39, $sno4, value);
	}


	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 40, $base_unit_qty);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 40, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 40, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 40, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 40, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 40, $base_unit_qty, value);
	}


	/**
	 * Active ingredient 有効成分.<p>
	 *
	 */
	public MCNumber cont_qty() {
		return getConstNumber(offset + 41, $cont_qty);
	}

	/**
	 * Active ingredient 有効成分.<p>
	 *
	 */
	public void cont_qty(MCNumber value) {
		setConstNumber(offset + 41, $cont_qty, value);
	}

	/**
	 * Active ingredient 有効成分.<p>
	 *
	 */
	public void cont_qty(int value) {
		setConstNumber(offset + 41, $cont_qty, value);
	}

	/**
	 * Active ingredient 有効成分.<p>
	 *
	 */
	public void cont_qty(long value) {
		setConstNumber(offset + 41, $cont_qty, value);
	}

	/**
	 * Active ingredient 有効成分.<p>
	 *
	 */
	public void cont_qty(float value) {
		setConstNumber(offset + 41, $cont_qty, value);
	}

	/**
	 * Active ingredient 有効成分.<p>
	 *
	 */
	public void cont_qty(double value) {
		setConstNumber(offset + 41, $cont_qty, value);
	}


	/**
	 * Without lot ロット指定なし.<p>
	 *
	 */
	public boolean not_lot_fix_flg() {
		return getConstBoolean(offset + 42, $not_lot_fix_flg);
	}

	/**
	 * Without lot ロット指定なし.<p>
	 *
	 */
	public void not_lot_fix_flg(boolean value) {
		setConstBoolean(offset + 42, $not_lot_fix_flg, value);
	}


	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public MCDate vld_dt() {
		return getConstDate(offset + 43, $vld_dt);
	}

	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public void vld_dt(MCDate value) {
		setConstDate(offset + 43, $vld_dt, value);
	}


	/**
	 * Oldest GR date 最古入庫日.<p>
	 *
	 */
	public MCDate first_gr_dt() {
		return getConstDate(offset + 44, $first_gr_dt);
	}

	/**
	 * Oldest GR date 最古入庫日.<p>
	 *
	 */
	public void first_gr_dt(MCDate value) {
		setConstDate(offset + 44, $first_gr_dt, value);
	}


	/**
	 * Lot sequence ロットシーケンス.<p>
	 *
	 */
	public String lot_seq() {
		return getConstString(offset + 45, $lot_seq);
	}

	/**
	 * Lot sequence ロットシーケンス.<p>
	 *
	 */
	public void lot_seq(String value) {
		setConstString(offset + 45, $lot_seq, value);
	}


	/**
	 * Input qty. 投入数量.<p>
	 *
	 */
	public MCNumber inpt_qty() {
		return getConstNumber(offset + 46, $inpt_qty);
	}

	/**
	 * Input qty. 投入数量.<p>
	 *
	 */
	public void inpt_qty(MCNumber value) {
		setConstNumber(offset + 46, $inpt_qty, value);
	}

	/**
	 * Input qty. 投入数量.<p>
	 *
	 */
	public void inpt_qty(int value) {
		setConstNumber(offset + 46, $inpt_qty, value);
	}

	/**
	 * Input qty. 投入数量.<p>
	 *
	 */
	public void inpt_qty(long value) {
		setConstNumber(offset + 46, $inpt_qty, value);
	}

	/**
	 * Input qty. 投入数量.<p>
	 *
	 */
	public void inpt_qty(float value) {
		setConstNumber(offset + 46, $inpt_qty, value);
	}

	/**
	 * Input qty. 投入数量.<p>
	 *
	 */
	public void inpt_qty(double value) {
		setConstNumber(offset + 46, $inpt_qty, value);
	}


	/**
	 * Required qty. 必要数量.<p>
	 *
	 */
	public MCNumber rqmt_qty() {
		return getConstNumber(offset + 47, $rqmt_qty);
	}

	/**
	 * Required qty. 必要数量.<p>
	 *
	 */
	public void rqmt_qty(MCNumber value) {
		setConstNumber(offset + 47, $rqmt_qty, value);
	}

	/**
	 * Required qty. 必要数量.<p>
	 *
	 */
	public void rqmt_qty(int value) {
		setConstNumber(offset + 47, $rqmt_qty, value);
	}

	/**
	 * Required qty. 必要数量.<p>
	 *
	 */
	public void rqmt_qty(long value) {
		setConstNumber(offset + 47, $rqmt_qty, value);
	}

	/**
	 * Required qty. 必要数量.<p>
	 *
	 */
	public void rqmt_qty(float value) {
		setConstNumber(offset + 47, $rqmt_qty, value);
	}

	/**
	 * Required qty. 必要数量.<p>
	 *
	 */
	public void rqmt_qty(double value) {
		setConstNumber(offset + 47, $rqmt_qty, value);
	}


	/**
	 * Fixed required qty. 固定必要数量.<p>
	 *
	 */
	public MCNumber fxd_rqmt_qty() {
		return getConstNumber(offset + 48, $fxd_rqmt_qty);
	}

	/**
	 * Fixed required qty. 固定必要数量.<p>
	 *
	 */
	public void fxd_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 48, $fxd_rqmt_qty, value);
	}

	/**
	 * Fixed required qty. 固定必要数量.<p>
	 *
	 */
	public void fxd_rqmt_qty(int value) {
		setConstNumber(offset + 48, $fxd_rqmt_qty, value);
	}

	/**
	 * Fixed required qty. 固定必要数量.<p>
	 *
	 */
	public void fxd_rqmt_qty(long value) {
		setConstNumber(offset + 48, $fxd_rqmt_qty, value);
	}

	/**
	 * Fixed required qty. 固定必要数量.<p>
	 *
	 */
	public void fxd_rqmt_qty(float value) {
		setConstNumber(offset + 48, $fxd_rqmt_qty, value);
	}

	/**
	 * Fixed required qty. 固定必要数量.<p>
	 *
	 */
	public void fxd_rqmt_qty(double value) {
		setConstNumber(offset + 48, $fxd_rqmt_qty, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 49, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 49, $base_unit_cd, value);
	}


	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public MCNumber cont_inpt_qty() {
		return getConstNumber(offset + 50, $cont_inpt_qty);
	}

	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public void cont_inpt_qty(MCNumber value) {
		setConstNumber(offset + 50, $cont_inpt_qty, value);
	}

	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public void cont_inpt_qty(int value) {
		setConstNumber(offset + 50, $cont_inpt_qty, value);
	}

	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public void cont_inpt_qty(long value) {
		setConstNumber(offset + 50, $cont_inpt_qty, value);
	}

	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public void cont_inpt_qty(float value) {
		setConstNumber(offset + 50, $cont_inpt_qty, value);
	}

	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public void cont_inpt_qty(double value) {
		setConstNumber(offset + 50, $cont_inpt_qty, value);
	}


	/**
	 * Active ingredient (Required qty.) 有効成分（必要数量）.<p>
	 *
	 */
	public MCNumber cont_rqmt_qty() {
		return getConstNumber(offset + 51, $cont_rqmt_qty);
	}

	/**
	 * Active ingredient (Required qty.) 有効成分（必要数量）.<p>
	 *
	 */
	public void cont_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 51, $cont_rqmt_qty, value);
	}

	/**
	 * Active ingredient (Required qty.) 有効成分（必要数量）.<p>
	 *
	 */
	public void cont_rqmt_qty(int value) {
		setConstNumber(offset + 51, $cont_rqmt_qty, value);
	}

	/**
	 * Active ingredient (Required qty.) 有効成分（必要数量）.<p>
	 *
	 */
	public void cont_rqmt_qty(long value) {
		setConstNumber(offset + 51, $cont_rqmt_qty, value);
	}

	/**
	 * Active ingredient (Required qty.) 有効成分（必要数量）.<p>
	 *
	 */
	public void cont_rqmt_qty(float value) {
		setConstNumber(offset + 51, $cont_rqmt_qty, value);
	}

	/**
	 * Active ingredient (Required qty.) 有効成分（必要数量）.<p>
	 *
	 */
	public void cont_rqmt_qty(double value) {
		setConstNumber(offset + 51, $cont_rqmt_qty, value);
	}


	/**
	 * Active ingredient (Constant) 有効成分（固定）.<p>
	 *
	 */
	public MCNumber cont_fxd_rqmt_qty() {
		return getConstNumber(offset + 52, $cont_fxd_rqmt_qty);
	}

	/**
	 * Active ingredient (Constant) 有効成分（固定）.<p>
	 *
	 */
	public void cont_fxd_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 52, $cont_fxd_rqmt_qty, value);
	}

	/**
	 * Active ingredient (Constant) 有効成分（固定）.<p>
	 *
	 */
	public void cont_fxd_rqmt_qty(int value) {
		setConstNumber(offset + 52, $cont_fxd_rqmt_qty, value);
	}

	/**
	 * Active ingredient (Constant) 有効成分（固定）.<p>
	 *
	 */
	public void cont_fxd_rqmt_qty(long value) {
		setConstNumber(offset + 52, $cont_fxd_rqmt_qty, value);
	}

	/**
	 * Active ingredient (Constant) 有効成分（固定）.<p>
	 *
	 */
	public void cont_fxd_rqmt_qty(float value) {
		setConstNumber(offset + 52, $cont_fxd_rqmt_qty, value);
	}

	/**
	 * Active ingredient (Constant) 有効成分（固定）.<p>
	 *
	 */
	public void cont_fxd_rqmt_qty(double value) {
		setConstNumber(offset + 52, $cont_fxd_rqmt_qty, value);
	}


	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public MCNumber act_cont_fctr() {
		return getConstNumber(offset + 53, $act_cont_fctr);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(MCNumber value) {
		setConstNumber(offset + 53, $act_cont_fctr, value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(int value) {
		setConstNumber(offset + 53, $act_cont_fctr, value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(long value) {
		setConstNumber(offset + 53, $act_cont_fctr, value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(float value) {
		setConstNumber(offset + 53, $act_cont_fctr, value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(double value) {
		setConstNumber(offset + 53, $act_cont_fctr, value);
	}


	/**
	 * Allocation 引当.<p>
	 *
	 */
	public boolean alloc_flg() {
		return getConstBoolean(offset + 54, $alloc_flg);
	}

	/**
	 * Allocation 引当.<p>
	 *
	 */
	public void alloc_flg(boolean value) {
		setConstBoolean(offset + 54, $alloc_flg, value);
	}


	public String getString(String name) {
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			return inpt_schd_no();
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
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			return alt_grp_cd();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($inpt_loc_cd.equalsIgnoreCase(name)) {
			return inpt_loc_cd();
		}
		if ($inpt_str_ln_cd.equalsIgnoreCase(name)) {
			return inpt_str_ln_cd();
		}
		if ($inpt_sppl_cd.equalsIgnoreCase(name)) {
			return inpt_sppl_cd();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			return stk_insp_typ();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($rqst_sno1.equalsIgnoreCase(name)) {
			return rqst_sno1();
		}
		if ($rqst_sno2.equalsIgnoreCase(name)) {
			return rqst_sno2();
		}
		if ($rqst_sno3.equalsIgnoreCase(name)) {
			return rqst_sno3();
		}
		if ($rqst_sno4.equalsIgnoreCase(name)) {
			return rqst_sno4();
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
		if ($lot_seq.equalsIgnoreCase(name)) {
			return lot_seq();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			return oper_peg_no();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($sum_peg_no.equalsIgnoreCase(name)) {
			return sum_peg_no();
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			return div_seq();
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			return alt_grp_seq();
		}
		if ($not_alloc_qty.equalsIgnoreCase(name)) {
			return not_alloc_qty();
		}
		if ($not_alloc_cont_qty.equalsIgnoreCase(name)) {
			return not_alloc_cont_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			return cont_qty();
		}
		if ($inpt_qty.equalsIgnoreCase(name)) {
			return inpt_qty();
		}
		if ($rqmt_qty.equalsIgnoreCase(name)) {
			return rqmt_qty();
		}
		if ($fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return fxd_rqmt_qty();
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			return cont_inpt_qty();
		}
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			return cont_rqmt_qty();
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return cont_fxd_rqmt_qty();
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			return act_cont_fctr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($inpt_dt.equalsIgnoreCase(name)) {
			return inpt_dt();
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			return vld_dt();
		}
		if ($first_gr_dt.equalsIgnoreCase(name)) {
			return first_gr_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($add_flg.equalsIgnoreCase(name)) {
			return add_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($alt_itm_fix_flg.equalsIgnoreCase(name)) {
			return alt_itm_fix_flg();
		}
		if ($sno1_null_flg.equalsIgnoreCase(name)) {
			return sno1_null_flg();
		}
		if ($sno2_null_flg.equalsIgnoreCase(name)) {
			return sno2_null_flg();
		}
		if ($sno3_null_flg.equalsIgnoreCase(name)) {
			return sno3_null_flg();
		}
		if ($sno4_null_flg.equalsIgnoreCase(name)) {
			return sno4_null_flg();
		}
		if ($not_lot_fix_flg.equalsIgnoreCase(name)) {
			return not_lot_fix_flg();
		}
		if ($alloc_flg.equalsIgnoreCase(name)) {
			return alloc_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			return inpt_schd_no();
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
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			return alt_grp_cd();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($inpt_loc_cd.equalsIgnoreCase(name)) {
			return inpt_loc_cd();
		}
		if ($inpt_str_ln_cd.equalsIgnoreCase(name)) {
			return inpt_str_ln_cd();
		}
		if ($inpt_sppl_cd.equalsIgnoreCase(name)) {
			return inpt_sppl_cd();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			return stk_insp_typ();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($rqst_sno1.equalsIgnoreCase(name)) {
			return rqst_sno1();
		}
		if ($rqst_sno2.equalsIgnoreCase(name)) {
			return rqst_sno2();
		}
		if ($rqst_sno3.equalsIgnoreCase(name)) {
			return rqst_sno3();
		}
		if ($rqst_sno4.equalsIgnoreCase(name)) {
			return rqst_sno4();
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
		if ($lot_seq.equalsIgnoreCase(name)) {
			return lot_seq();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			return oper_peg_no();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($sum_peg_no.equalsIgnoreCase(name)) {
			return sum_peg_no();
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			return div_seq();
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			return alt_grp_seq();
		}
		if ($not_alloc_qty.equalsIgnoreCase(name)) {
			return not_alloc_qty();
		}
		if ($not_alloc_cont_qty.equalsIgnoreCase(name)) {
			return not_alloc_cont_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			return cont_qty();
		}
		if ($inpt_qty.equalsIgnoreCase(name)) {
			return inpt_qty();
		}
		if ($rqmt_qty.equalsIgnoreCase(name)) {
			return rqmt_qty();
		}
		if ($fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return fxd_rqmt_qty();
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			return cont_inpt_qty();
		}
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			return cont_rqmt_qty();
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return cont_fxd_rqmt_qty();
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			return act_cont_fctr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($inpt_dt.equalsIgnoreCase(name)) {
			return inpt_dt();
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			return vld_dt();
		}
		if ($first_gr_dt.equalsIgnoreCase(name)) {
			return first_gr_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($add_flg.equalsIgnoreCase(name)) {
			return add_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($alt_itm_fix_flg.equalsIgnoreCase(name)) {
			return alt_itm_fix_flg();
		}
		if ($sno1_null_flg.equalsIgnoreCase(name)) {
			return sno1_null_flg();
		}
		if ($sno2_null_flg.equalsIgnoreCase(name)) {
			return sno2_null_flg();
		}
		if ($sno3_null_flg.equalsIgnoreCase(name)) {
			return sno3_null_flg();
		}
		if ($sno4_null_flg.equalsIgnoreCase(name)) {
			return sno4_null_flg();
		}
		if ($not_lot_fix_flg.equalsIgnoreCase(name)) {
			return not_lot_fix_flg();
		}
		if ($alloc_flg.equalsIgnoreCase(name)) {
			return alloc_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			inpt_schd_no(value);
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
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			alt_grp_cd(value);
			return;
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($inpt_loc_cd.equalsIgnoreCase(name)) {
			inpt_loc_cd(value);
			return;
		}
		if ($inpt_str_ln_cd.equalsIgnoreCase(name)) {
			inpt_str_ln_cd(value);
			return;
		}
		if ($inpt_sppl_cd.equalsIgnoreCase(name)) {
			inpt_sppl_cd(value);
			return;
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			stk_insp_typ(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
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
		if ($rqst_sno1.equalsIgnoreCase(name)) {
			rqst_sno1(value);
			return;
		}
		if ($rqst_sno2.equalsIgnoreCase(name)) {
			rqst_sno2(value);
			return;
		}
		if ($rqst_sno3.equalsIgnoreCase(name)) {
			rqst_sno3(value);
			return;
		}
		if ($rqst_sno4.equalsIgnoreCase(name)) {
			rqst_sno4(value);
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
		if ($lot_seq.equalsIgnoreCase(name)) {
			lot_seq(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($sum_peg_no.equalsIgnoreCase(name)) {
			sum_peg_no(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($not_alloc_qty.equalsIgnoreCase(name)) {
			not_alloc_qty(value);
			return;
		}
		if ($not_alloc_cont_qty.equalsIgnoreCase(name)) {
			not_alloc_cont_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($inpt_qty.equalsIgnoreCase(name)) {
			inpt_qty(value);
			return;
		}
		if ($rqmt_qty.equalsIgnoreCase(name)) {
			rqmt_qty(value);
			return;
		}
		if ($fxd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_rqmt_qty(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			cont_rqmt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($sum_peg_no.equalsIgnoreCase(name)) {
			sum_peg_no(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($not_alloc_qty.equalsIgnoreCase(name)) {
			not_alloc_qty(value);
			return;
		}
		if ($not_alloc_cont_qty.equalsIgnoreCase(name)) {
			not_alloc_cont_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($inpt_qty.equalsIgnoreCase(name)) {
			inpt_qty(value);
			return;
		}
		if ($rqmt_qty.equalsIgnoreCase(name)) {
			rqmt_qty(value);
			return;
		}
		if ($fxd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_rqmt_qty(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			cont_rqmt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($sum_peg_no.equalsIgnoreCase(name)) {
			sum_peg_no(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($not_alloc_qty.equalsIgnoreCase(name)) {
			not_alloc_qty(value);
			return;
		}
		if ($not_alloc_cont_qty.equalsIgnoreCase(name)) {
			not_alloc_cont_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($inpt_qty.equalsIgnoreCase(name)) {
			inpt_qty(value);
			return;
		}
		if ($rqmt_qty.equalsIgnoreCase(name)) {
			rqmt_qty(value);
			return;
		}
		if ($fxd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_rqmt_qty(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			cont_rqmt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($sum_peg_no.equalsIgnoreCase(name)) {
			sum_peg_no(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($not_alloc_qty.equalsIgnoreCase(name)) {
			not_alloc_qty(value);
			return;
		}
		if ($not_alloc_cont_qty.equalsIgnoreCase(name)) {
			not_alloc_cont_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($inpt_qty.equalsIgnoreCase(name)) {
			inpt_qty(value);
			return;
		}
		if ($rqmt_qty.equalsIgnoreCase(name)) {
			rqmt_qty(value);
			return;
		}
		if ($fxd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_rqmt_qty(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			cont_rqmt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($sum_peg_no.equalsIgnoreCase(name)) {
			sum_peg_no(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($not_alloc_qty.equalsIgnoreCase(name)) {
			not_alloc_qty(value);
			return;
		}
		if ($not_alloc_cont_qty.equalsIgnoreCase(name)) {
			not_alloc_cont_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($inpt_qty.equalsIgnoreCase(name)) {
			inpt_qty(value);
			return;
		}
		if ($rqmt_qty.equalsIgnoreCase(name)) {
			rqmt_qty(value);
			return;
		}
		if ($fxd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_rqmt_qty(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			cont_rqmt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($inpt_dt.equalsIgnoreCase(name)) {
			inpt_dt(value);
			return;
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			vld_dt(value);
			return;
		}
		if ($first_gr_dt.equalsIgnoreCase(name)) {
			first_gr_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($add_flg.equalsIgnoreCase(name)) {
			add_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($alt_itm_fix_flg.equalsIgnoreCase(name)) {
			alt_itm_fix_flg(value);
			return;
		}
		if ($sno1_null_flg.equalsIgnoreCase(name)) {
			sno1_null_flg(value);
			return;
		}
		if ($sno2_null_flg.equalsIgnoreCase(name)) {
			sno2_null_flg(value);
			return;
		}
		if ($sno3_null_flg.equalsIgnoreCase(name)) {
			sno3_null_flg(value);
			return;
		}
		if ($sno4_null_flg.equalsIgnoreCase(name)) {
			sno4_null_flg(value);
			return;
		}
		if ($not_lot_fix_flg.equalsIgnoreCase(name)) {
			not_lot_fix_flg(value);
			return;
		}
		if ($alloc_flg.equalsIgnoreCase(name)) {
			alloc_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			inpt_schd_no(value);
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
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			alt_grp_cd(value);
			return;
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($inpt_loc_cd.equalsIgnoreCase(name)) {
			inpt_loc_cd(value);
			return;
		}
		if ($inpt_str_ln_cd.equalsIgnoreCase(name)) {
			inpt_str_ln_cd(value);
			return;
		}
		if ($inpt_sppl_cd.equalsIgnoreCase(name)) {
			inpt_sppl_cd(value);
			return;
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			stk_insp_typ(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
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
		if ($rqst_sno1.equalsIgnoreCase(name)) {
			rqst_sno1(value);
			return;
		}
		if ($rqst_sno2.equalsIgnoreCase(name)) {
			rqst_sno2(value);
			return;
		}
		if ($rqst_sno3.equalsIgnoreCase(name)) {
			rqst_sno3(value);
			return;
		}
		if ($rqst_sno4.equalsIgnoreCase(name)) {
			rqst_sno4(value);
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
		if ($lot_seq.equalsIgnoreCase(name)) {
			lot_seq(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($sum_peg_no.equalsIgnoreCase(name)) {
			sum_peg_no(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($not_alloc_qty.equalsIgnoreCase(name)) {
			not_alloc_qty(value);
			return;
		}
		if ($not_alloc_cont_qty.equalsIgnoreCase(name)) {
			not_alloc_cont_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($inpt_qty.equalsIgnoreCase(name)) {
			inpt_qty(value);
			return;
		}
		if ($rqmt_qty.equalsIgnoreCase(name)) {
			rqmt_qty(value);
			return;
		}
		if ($fxd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_rqmt_qty(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			cont_rqmt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($sum_peg_no.equalsIgnoreCase(name)) {
			sum_peg_no(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($not_alloc_qty.equalsIgnoreCase(name)) {
			not_alloc_qty(value);
			return;
		}
		if ($not_alloc_cont_qty.equalsIgnoreCase(name)) {
			not_alloc_cont_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($inpt_qty.equalsIgnoreCase(name)) {
			inpt_qty(value);
			return;
		}
		if ($rqmt_qty.equalsIgnoreCase(name)) {
			rqmt_qty(value);
			return;
		}
		if ($fxd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_rqmt_qty(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			cont_rqmt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($sum_peg_no.equalsIgnoreCase(name)) {
			sum_peg_no(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($not_alloc_qty.equalsIgnoreCase(name)) {
			not_alloc_qty(value);
			return;
		}
		if ($not_alloc_cont_qty.equalsIgnoreCase(name)) {
			not_alloc_cont_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($inpt_qty.equalsIgnoreCase(name)) {
			inpt_qty(value);
			return;
		}
		if ($rqmt_qty.equalsIgnoreCase(name)) {
			rqmt_qty(value);
			return;
		}
		if ($fxd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_rqmt_qty(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			cont_rqmt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($sum_peg_no.equalsIgnoreCase(name)) {
			sum_peg_no(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($not_alloc_qty.equalsIgnoreCase(name)) {
			not_alloc_qty(value);
			return;
		}
		if ($not_alloc_cont_qty.equalsIgnoreCase(name)) {
			not_alloc_cont_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($inpt_qty.equalsIgnoreCase(name)) {
			inpt_qty(value);
			return;
		}
		if ($rqmt_qty.equalsIgnoreCase(name)) {
			rqmt_qty(value);
			return;
		}
		if ($fxd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_rqmt_qty(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			cont_rqmt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($sum_peg_no.equalsIgnoreCase(name)) {
			sum_peg_no(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($not_alloc_qty.equalsIgnoreCase(name)) {
			not_alloc_qty(value);
			return;
		}
		if ($not_alloc_cont_qty.equalsIgnoreCase(name)) {
			not_alloc_cont_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($inpt_qty.equalsIgnoreCase(name)) {
			inpt_qty(value);
			return;
		}
		if ($rqmt_qty.equalsIgnoreCase(name)) {
			rqmt_qty(value);
			return;
		}
		if ($fxd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_rqmt_qty(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			cont_rqmt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($inpt_dt.equalsIgnoreCase(name)) {
			inpt_dt(value);
			return;
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			vld_dt(value);
			return;
		}
		if ($first_gr_dt.equalsIgnoreCase(name)) {
			first_gr_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($add_flg.equalsIgnoreCase(name)) {
			add_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($alt_itm_fix_flg.equalsIgnoreCase(name)) {
			alt_itm_fix_flg(value);
			return;
		}
		if ($sno1_null_flg.equalsIgnoreCase(name)) {
			sno1_null_flg(value);
			return;
		}
		if ($sno2_null_flg.equalsIgnoreCase(name)) {
			sno2_null_flg(value);
			return;
		}
		if ($sno3_null_flg.equalsIgnoreCase(name)) {
			sno3_null_flg(value);
			return;
		}
		if ($sno4_null_flg.equalsIgnoreCase(name)) {
			sno4_null_flg(value);
			return;
		}
		if ($not_lot_fix_flg.equalsIgnoreCase(name)) {
			not_lot_fix_flg(value);
			return;
		}
		if ($alloc_flg.equalsIgnoreCase(name)) {
			alloc_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

