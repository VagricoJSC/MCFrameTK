package mcframe.serverMSBC.MSBCL6010;

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
 * ブロック"MfgInstTblReg_Upd05_DtlInptAllocSts"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MfgInstTblReg_Upd05_DtlInptAllocStsR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Input pegging No. 投入紐付けＮＯ.<p>
	 *
	 */
	public static final String $inpt_peg_no = "inpt_peg_no";
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public static final String $mfg_sts_typ = "mfg_sts_typ";
	/**
	 * Scheduled date and time 予定日時.<p>
	 *
	 */
	public static final String $schd_tm = "schd_tm";
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
	 * Base unit alternative sources qty. 基準単位代替元数量.<p>
	 *
	 */
	public static final String $base_unit_alt_qty = "base_unit_alt_qty";
	/**
	 * Alternative item selection type 代替品目選択区分.<p>
	 *
	 */
	public static final String $alt_itm_typ = "alt_itm_typ";
	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public static final String $alt_alloc_prio = "alt_alloc_prio";
	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public static final String $alt_itm_ratio = "alt_itm_ratio";
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
	 * Input control type 投入制御区分.<p>
	 *
	 */
	public static final String $inpt_ctl_typ = "inpt_ctl_typ";
	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public static final String $mfg_inst_unit_typ = "mfg_inst_unit_typ";
	/**
	 * With movement/transport schedule before update 更新前移動・移送予定あり.<p>
	 *
	 */
	public static final String $has_xfr_inst_flg = "has_xfr_inst_flg";
	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public static final String $gi_loc_cd = "gi_loc_cd";
	/**
	 * GI rack/line cd. 出庫棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $gi_str_ln_cd = "gi_str_ln_cd";
	/**
	 * GI inventory arriving point cd. 出庫在庫着荷先ＣＤ.<p>
	 *
	 */
	public static final String $gi_stk_arrv_bp_cd = "gi_stk_arrv_bp_cd";
	/**
	 * GI inventory identification type 出庫在庫識別区分.<p>
	 *
	 */
	public static final String $gi_stk_id_typ = "gi_stk_id_typ";
	/**
	 * GI inventory BP cd. 出庫在庫取引先ＣＤ.<p>
	 *
	 */
	public static final String $gi_stk_bp_cd = "gi_stk_bp_cd";
	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public static final String $gr_loc_cd = "gr_loc_cd";
	/**
	 * GR rack/line cd. 入庫棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $gr_str_ln_cd = "gr_str_ln_cd";
	/**
	 * Scheduled GR date 入庫予定日.<p>
	 *
	 */
	public static final String $gr_schd_dt = "gr_schd_dt";
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
	 * Allow without SEIBAN No. 1 flg. 手配ＮＯ１無し可ＦＬＧ.<p>
	 *
	 */
	public static final String $sno1_null_flg = "sno1_null_flg";
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public static final String $sno2 = "sno2";
	/**
	 * Allow without SEIBAN No. 2 flg. 手配ＮＯ２無し可ＦＬＧ.<p>
	 *
	 */
	public static final String $sno2_null_flg = "sno2_null_flg";
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public static final String $sno3 = "sno3";
	/**
	 * Allow without SEIBAN No. 3 flg. 手配ＮＯ３無し可ＦＬＧ.<p>
	 *
	 */
	public static final String $sno3_null_flg = "sno3_null_flg";
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public static final String $sno4 = "sno4";
	/**
	 * Allow without SEIBAN No. 4 flg. 手配ＮＯ４無し可ＦＬＧ.<p>
	 *
	 */
	public static final String $sno4_null_flg = "sno4_null_flg";
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public static final String $gd_cd = "gd_cd";
	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public static final String $ver_no = "ver_no";
	/**
	 * Lot mixed flg. ロット混在ＦＬＧ.<p>
	 *
	 */
	public static final String $lot_mix_flg = "lot_mix_flg";
	/**
	 * Sublot mixed flg. サブロット混在ＦＬＧ.<p>
	 *
	 */
	public static final String $sublot_mix_flg = "sublot_mix_flg";
	/**
	 * Active ingredient 有効成分.<p>
	 *
	 */
	public static final String $cont_qty = "cont_qty";
	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public static final String $itm_ord_no = "itm_ord_no";
	/**
	 * Order date 指図日.<p>
	 *
	 */
	public static final String $inst_dt = "inst_dt";
	/**
	 * Order PIC cd. 指図担当者ＣＤ.<p>
	 *
	 */
	public static final String $inst_usr_cd = "inst_usr_cd";
	/**
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public static final String $inst_dpt_cd = "inst_dpt_cd";
	public static final String $inpt_alloc = "inpt_alloc";

	public static final String $inpt_alloc_sts_no = $inpt_alloc + ".inpt_alloc_sts_no";
	public static final String $inpt_schd_no = $inpt_alloc + ".inpt_schd_no";
	public static final String $mfg_inst_no = $inpt_alloc + ".mfg_inst_no";
	public static final String $itm_mfg_inst_no = $inpt_alloc + ".itm_mfg_inst_no";
	public static final String $oper_inst_no = $inpt_alloc + ".oper_inst_no";
	public static final String $base_unit_qty = $inpt_alloc + ".base_unit_qty";
	public static final String $stk_id_typ = $inpt_alloc + ".stk_id_typ";
	public static final String $stk_bp_cd = $inpt_alloc + ".stk_bp_cd";
	public static final String $stk_arrv_bp_cd = $inpt_alloc + ".stk_arrv_bp_cd";
	public static final String $to_stk_id_typ = $inpt_alloc + ".to_stk_id_typ";
	public static final String $to_stk_bp_cd = $inpt_alloc + ".to_stk_bp_cd";
	public static final String $to_stk_arrv_bp_cd = $inpt_alloc + ".to_stk_arrv_bp_cd";
	public static final String $sub_char1 = $inpt_alloc + ".sub_char1";
	public static final String $sub_char2 = $inpt_alloc + ".sub_char2";
	public static final String $sub_char3 = $inpt_alloc + ".sub_char3";

	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta inpt_peg_no_META = createCommonMeta($inpt_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta mfg_sts_typ_META = createCommonMeta($mfg_sts_typ, mcframe.commonMS.meta.MS_META.MFG_STS_TYP);
	public static final MCMeta schd_tm_META = createCommonMeta($schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta alt_grp_cd_META = createCommonMeta($alt_grp_cd, mcframe.commonMA.meta.MA_META.ALT_GRP_CD);
	public static final MCMeta alt_grp_seq_META = createCommonMeta($alt_grp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta base_unit_alt_qty_META = createCommonMeta($base_unit_alt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta alt_itm_typ_META = createCommonMeta($alt_itm_typ, mcframe.commonMA.meta.MA_META.ALT_ITM_TYP);
	public static final MCMeta alt_alloc_prio_META = createCommonMeta($alt_alloc_prio, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta alt_itm_ratio_META = createCommonMeta($alt_itm_ratio, mcframe.commonMA.meta.MA_META.ALT_ITM_RATIO);
	public static final MCMeta inpt_loc_cd_META = createCommonMeta($inpt_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta inpt_str_ln_cd_META = createCommonMeta($inpt_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta inpt_ctl_typ_META = createCommonMeta($inpt_ctl_typ, mcframe.commonMA.meta.MA_META.INPT_CTL_TYP);
	public static final MCMeta mfg_inst_unit_typ_META = createCommonMeta($mfg_inst_unit_typ, mcframe.commonMA.meta.MA_META.MFG_INST_UNIT_TYP);
	public static final MCMeta has_xfr_inst_flg_META = createCommonMeta($has_xfr_inst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gi_loc_cd_META = createCommonMeta($gi_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta gi_str_ln_cd_META = createCommonMeta($gi_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta gi_stk_arrv_bp_cd_META = createCommonMeta($gi_stk_arrv_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta gi_stk_id_typ_META = createCommonMeta($gi_stk_id_typ, mcframe.commonMS.meta.MS_META.STK_ID_TYP);
	public static final MCMeta gi_stk_bp_cd_META = createCommonMeta($gi_stk_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta gr_loc_cd_META = createCommonMeta($gr_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta gr_str_ln_cd_META = createCommonMeta($gr_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta gr_schd_dt_META = createCommonMeta($gr_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno1_null_flg_META = createCommonMeta($sno1_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_null_flg_META = createCommonMeta($sno2_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno3_null_flg_META = createCommonMeta($sno3_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno4_null_flg_META = createCommonMeta($sno4_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta lot_mix_flg_META = createCommonMeta($lot_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sublot_mix_flg_META = createCommonMeta($sublot_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cont_qty_META = createCommonMeta($cont_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta itm_ord_no_META = createCommonMeta($itm_ord_no, mcframe.commonMA.meta.MA_META.ITM_ORD_NO);
	public static final MCMeta inst_dt_META = createCommonMeta($inst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta inst_usr_cd_META = createCommonMeta($inst_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta inst_dpt_cd_META = createCommonMeta($inst_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta inpt_alloc_META = createInnerRowMeta($inpt_alloc, mcframe.serverMS.dbc.MST_INPT_ALLOC_STS_R.class);

	protected static final ConstMetaList<MfgInstTblReg_Upd05_DtlInptAllocStsR> constMetas = new ConstMetaList<MfgInstTblReg_Upd05_DtlInptAllocStsR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			inpt_peg_no_META,
			data_crud_typ_META,
			mfg_sts_typ_META,
			schd_tm_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			alt_grp_cd_META,
			alt_grp_seq_META,
			base_unit_alt_qty_META,
			alt_itm_typ_META,
			alt_alloc_prio_META,
			alt_itm_ratio_META,
			inpt_loc_cd_META,
			inpt_str_ln_cd_META,
			inpt_ctl_typ_META,
			mfg_inst_unit_typ_META,
			has_xfr_inst_flg_META,
			gi_loc_cd_META,
			gi_str_ln_cd_META,
			gi_stk_arrv_bp_cd_META,
			gi_stk_id_typ_META,
			gi_stk_bp_cd_META,
			gr_loc_cd_META,
			gr_str_ln_cd_META,
			gr_schd_dt_META,
			lot_no_META,
			sublot_no_META,
			sno1_META,
			sno1_null_flg_META,
			sno2_META,
			sno2_null_flg_META,
			sno3_META,
			sno3_null_flg_META,
			sno4_META,
			sno4_null_flg_META,
			base_unit_cd_META,
			gd_cd_META,
			ver_no_META,
			lot_mix_flg_META,
			sublot_mix_flg_META,
			cont_qty_META,
			itm_ord_no_META,
			inst_dt_META,
			inst_usr_cd_META,
			inst_dpt_cd_META,
			inpt_alloc_META
		},
		new String[][]{
			{
				"inpt_alloc_sts_no",
				"inpt_schd_no",
				"mfg_inst_no",
				"itm_mfg_inst_no",
				"oper_inst_no",
				"base_unit_qty",
				"stk_id_typ",
				"stk_bp_cd",
				"stk_arrv_bp_cd",
				"to_stk_id_typ",
				"to_stk_bp_cd",
				"to_stk_arrv_bp_cd",
				"sub_char1",
				"sub_char2",
				"sub_char3"
			},
			{
				$inpt_alloc_sts_no,
				$inpt_schd_no,
				$mfg_inst_no,
				$itm_mfg_inst_no,
				$oper_inst_no,
				$base_unit_qty,
				$stk_id_typ,
				$stk_bp_cd,
				$stk_arrv_bp_cd,
				$to_stk_id_typ,
				$to_stk_bp_cd,
				$to_stk_arrv_bp_cd,
				$sub_char1,
				$sub_char2,
				$sub_char3
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
	protected MfgInstTblReg_Upd05_DtlInptAllocStsR_MC_A(ConstMetaList<? extends MfgInstTblReg_Upd05_DtlInptAllocStsR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstTblReg_Upd05_DtlInptAllocStsR clone() {
		return (MfgInstTblReg_Upd05_DtlInptAllocStsR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstTblReg_Upd05_DtlInptAllocStsR createInstance() {
		return (MfgInstTblReg_Upd05_DtlInptAllocStsR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstTblReg_Upd05_DtlInptAllocStsR getValues(String... names) {
		return (MfgInstTblReg_Upd05_DtlInptAllocStsR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 0, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 0, $peg_no, value);
	}


	/**
	 * Input pegging No. 投入紐付けＮＯ.<p>
	 *
	 */
	public MCNumber inpt_peg_no() {
		return getConstNumber(offset + 1, $inpt_peg_no);
	}

	/**
	 * Input pegging No. 投入紐付けＮＯ.<p>
	 *
	 */
	public void inpt_peg_no(MCNumber value) {
		setConstNumber(offset + 1, $inpt_peg_no, value);
	}

	/**
	 * Input pegging No. 投入紐付けＮＯ.<p>
	 *
	 */
	public void inpt_peg_no(int value) {
		setConstNumber(offset + 1, $inpt_peg_no, value);
	}

	/**
	 * Input pegging No. 投入紐付けＮＯ.<p>
	 *
	 */
	public void inpt_peg_no(long value) {
		setConstNumber(offset + 1, $inpt_peg_no, value);
	}

	/**
	 * Input pegging No. 投入紐付けＮＯ.<p>
	 *
	 */
	public void inpt_peg_no(float value) {
		setConstNumber(offset + 1, $inpt_peg_no, value);
	}

	/**
	 * Input pegging No. 投入紐付けＮＯ.<p>
	 *
	 */
	public void inpt_peg_no(double value) {
		setConstNumber(offset + 1, $inpt_peg_no, value);
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 2, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 2, $data_crud_typ, value);
	}


	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public String mfg_sts_typ() {
		return getConstString(offset + 3, $mfg_sts_typ);
	}

	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public void mfg_sts_typ(String value) {
		setConstString(offset + 3, $mfg_sts_typ, value);
	}


	/**
	 * Scheduled date and time 予定日時.<p>
	 *
	 */
	public MCDate schd_tm() {
		return getConstDate(offset + 4, $schd_tm);
	}

	/**
	 * Scheduled date and time 予定日時.<p>
	 *
	 */
	public void schd_tm(MCDate value) {
		setConstDate(offset + 4, $schd_tm, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 5, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 5, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 6, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 6, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 7, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 7, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 8, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 8, $itm_sub3, value);
	}


	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public String alt_grp_cd() {
		return getConstString(offset + 9, $alt_grp_cd);
	}

	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public void alt_grp_cd(String value) {
		setConstString(offset + 9, $alt_grp_cd, value);
	}


	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public MCNumber alt_grp_seq() {
		return getConstNumber(offset + 10, $alt_grp_seq);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(MCNumber value) {
		setConstNumber(offset + 10, $alt_grp_seq, value);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(int value) {
		setConstNumber(offset + 10, $alt_grp_seq, value);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(long value) {
		setConstNumber(offset + 10, $alt_grp_seq, value);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(float value) {
		setConstNumber(offset + 10, $alt_grp_seq, value);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(double value) {
		setConstNumber(offset + 10, $alt_grp_seq, value);
	}


	/**
	 * Base unit alternative sources qty. 基準単位代替元数量.<p>
	 *
	 */
	public MCNumber base_unit_alt_qty() {
		return getConstNumber(offset + 11, $base_unit_alt_qty);
	}

	/**
	 * Base unit alternative sources qty. 基準単位代替元数量.<p>
	 *
	 */
	public void base_unit_alt_qty(MCNumber value) {
		setConstNumber(offset + 11, $base_unit_alt_qty, value);
	}

	/**
	 * Base unit alternative sources qty. 基準単位代替元数量.<p>
	 *
	 */
	public void base_unit_alt_qty(int value) {
		setConstNumber(offset + 11, $base_unit_alt_qty, value);
	}

	/**
	 * Base unit alternative sources qty. 基準単位代替元数量.<p>
	 *
	 */
	public void base_unit_alt_qty(long value) {
		setConstNumber(offset + 11, $base_unit_alt_qty, value);
	}

	/**
	 * Base unit alternative sources qty. 基準単位代替元数量.<p>
	 *
	 */
	public void base_unit_alt_qty(float value) {
		setConstNumber(offset + 11, $base_unit_alt_qty, value);
	}

	/**
	 * Base unit alternative sources qty. 基準単位代替元数量.<p>
	 *
	 */
	public void base_unit_alt_qty(double value) {
		setConstNumber(offset + 11, $base_unit_alt_qty, value);
	}


	/**
	 * Alternative item selection type 代替品目選択区分.<p>
	 *
	 */
	public String alt_itm_typ() {
		return getConstString(offset + 12, $alt_itm_typ);
	}

	/**
	 * Alternative item selection type 代替品目選択区分.<p>
	 *
	 */
	public void alt_itm_typ(String value) {
		setConstString(offset + 12, $alt_itm_typ, value);
	}


	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public MCNumber alt_alloc_prio() {
		return getConstNumber(offset + 13, $alt_alloc_prio);
	}

	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public void alt_alloc_prio(MCNumber value) {
		setConstNumber(offset + 13, $alt_alloc_prio, value);
	}

	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public void alt_alloc_prio(int value) {
		setConstNumber(offset + 13, $alt_alloc_prio, value);
	}

	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public void alt_alloc_prio(long value) {
		setConstNumber(offset + 13, $alt_alloc_prio, value);
	}

	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public void alt_alloc_prio(float value) {
		setConstNumber(offset + 13, $alt_alloc_prio, value);
	}

	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public void alt_alloc_prio(double value) {
		setConstNumber(offset + 13, $alt_alloc_prio, value);
	}


	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public MCNumber alt_itm_ratio() {
		return getConstNumber(offset + 14, $alt_itm_ratio);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(MCNumber value) {
		setConstNumber(offset + 14, $alt_itm_ratio, value);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(int value) {
		setConstNumber(offset + 14, $alt_itm_ratio, value);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(long value) {
		setConstNumber(offset + 14, $alt_itm_ratio, value);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(float value) {
		setConstNumber(offset + 14, $alt_itm_ratio, value);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(double value) {
		setConstNumber(offset + 14, $alt_itm_ratio, value);
	}


	/**
	 * Input location cd. 投入場所ＣＤ.<p>
	 *
	 */
	public String inpt_loc_cd() {
		return getConstString(offset + 15, $inpt_loc_cd);
	}

	/**
	 * Input location cd. 投入場所ＣＤ.<p>
	 *
	 */
	public void inpt_loc_cd(String value) {
		setConstString(offset + 15, $inpt_loc_cd, value);
	}


	/**
	 * Input rack/line cd. 投入棚・ラインＣＤ.<p>
	 *
	 */
	public String inpt_str_ln_cd() {
		return getConstString(offset + 16, $inpt_str_ln_cd);
	}

	/**
	 * Input rack/line cd. 投入棚・ラインＣＤ.<p>
	 *
	 */
	public void inpt_str_ln_cd(String value) {
		setConstString(offset + 16, $inpt_str_ln_cd, value);
	}


	/**
	 * Input control type 投入制御区分.<p>
	 *
	 */
	public String inpt_ctl_typ() {
		return getConstString(offset + 17, $inpt_ctl_typ);
	}

	/**
	 * Input control type 投入制御区分.<p>
	 *
	 */
	public void inpt_ctl_typ(String value) {
		setConstString(offset + 17, $inpt_ctl_typ, value);
	}


	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public String mfg_inst_unit_typ() {
		return getConstString(offset + 18, $mfg_inst_unit_typ);
	}

	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public void mfg_inst_unit_typ(String value) {
		setConstString(offset + 18, $mfg_inst_unit_typ, value);
	}


	/**
	 * With movement/transport schedule before update 更新前移動・移送予定あり.<p>
	 *
	 */
	public boolean has_xfr_inst_flg() {
		return getConstBoolean(offset + 19, $has_xfr_inst_flg);
	}

	/**
	 * With movement/transport schedule before update 更新前移動・移送予定あり.<p>
	 *
	 */
	public void has_xfr_inst_flg(boolean value) {
		setConstBoolean(offset + 19, $has_xfr_inst_flg, value);
	}


	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public String gi_loc_cd() {
		return getConstString(offset + 20, $gi_loc_cd);
	}

	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public void gi_loc_cd(String value) {
		setConstString(offset + 20, $gi_loc_cd, value);
	}


	/**
	 * GI rack/line cd. 出庫棚・ラインＣＤ.<p>
	 *
	 */
	public String gi_str_ln_cd() {
		return getConstString(offset + 21, $gi_str_ln_cd);
	}

	/**
	 * GI rack/line cd. 出庫棚・ラインＣＤ.<p>
	 *
	 */
	public void gi_str_ln_cd(String value) {
		setConstString(offset + 21, $gi_str_ln_cd, value);
	}


	/**
	 * GI inventory arriving point cd. 出庫在庫着荷先ＣＤ.<p>
	 *
	 */
	public String gi_stk_arrv_bp_cd() {
		return getConstString(offset + 22, $gi_stk_arrv_bp_cd);
	}

	/**
	 * GI inventory arriving point cd. 出庫在庫着荷先ＣＤ.<p>
	 *
	 */
	public void gi_stk_arrv_bp_cd(String value) {
		setConstString(offset + 22, $gi_stk_arrv_bp_cd, value);
	}


	/**
	 * GI inventory identification type 出庫在庫識別区分.<p>
	 *
	 */
	public String gi_stk_id_typ() {
		return getConstString(offset + 23, $gi_stk_id_typ);
	}

	/**
	 * GI inventory identification type 出庫在庫識別区分.<p>
	 *
	 */
	public void gi_stk_id_typ(String value) {
		setConstString(offset + 23, $gi_stk_id_typ, value);
	}


	/**
	 * GI inventory BP cd. 出庫在庫取引先ＣＤ.<p>
	 *
	 */
	public String gi_stk_bp_cd() {
		return getConstString(offset + 24, $gi_stk_bp_cd);
	}

	/**
	 * GI inventory BP cd. 出庫在庫取引先ＣＤ.<p>
	 *
	 */
	public void gi_stk_bp_cd(String value) {
		setConstString(offset + 24, $gi_stk_bp_cd, value);
	}


	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public String gr_loc_cd() {
		return getConstString(offset + 25, $gr_loc_cd);
	}

	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public void gr_loc_cd(String value) {
		setConstString(offset + 25, $gr_loc_cd, value);
	}


	/**
	 * GR rack/line cd. 入庫棚・ラインＣＤ.<p>
	 *
	 */
	public String gr_str_ln_cd() {
		return getConstString(offset + 26, $gr_str_ln_cd);
	}

	/**
	 * GR rack/line cd. 入庫棚・ラインＣＤ.<p>
	 *
	 */
	public void gr_str_ln_cd(String value) {
		setConstString(offset + 26, $gr_str_ln_cd, value);
	}


	/**
	 * Scheduled GR date 入庫予定日.<p>
	 *
	 */
	public MCDate gr_schd_dt() {
		return getConstDate(offset + 27, $gr_schd_dt);
	}

	/**
	 * Scheduled GR date 入庫予定日.<p>
	 *
	 */
	public void gr_schd_dt(MCDate value) {
		setConstDate(offset + 27, $gr_schd_dt, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 28, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 28, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 29, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 29, $sublot_no, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 30, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 30, $sno1, value);
	}


	/**
	 * Allow without SEIBAN No. 1 flg. 手配ＮＯ１無し可ＦＬＧ.<p>
	 *
	 */
	public boolean sno1_null_flg() {
		return getConstBoolean(offset + 31, $sno1_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 1 flg. 手配ＮＯ１無し可ＦＬＧ.<p>
	 *
	 */
	public void sno1_null_flg(boolean value) {
		setConstBoolean(offset + 31, $sno1_null_flg, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 32, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 32, $sno2, value);
	}


	/**
	 * Allow without SEIBAN No. 2 flg. 手配ＮＯ２無し可ＦＬＧ.<p>
	 *
	 */
	public boolean sno2_null_flg() {
		return getConstBoolean(offset + 33, $sno2_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 2 flg. 手配ＮＯ２無し可ＦＬＧ.<p>
	 *
	 */
	public void sno2_null_flg(boolean value) {
		setConstBoolean(offset + 33, $sno2_null_flg, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 34, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 34, $sno3, value);
	}


	/**
	 * Allow without SEIBAN No. 3 flg. 手配ＮＯ３無し可ＦＬＧ.<p>
	 *
	 */
	public boolean sno3_null_flg() {
		return getConstBoolean(offset + 35, $sno3_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 3 flg. 手配ＮＯ３無し可ＦＬＧ.<p>
	 *
	 */
	public void sno3_null_flg(boolean value) {
		setConstBoolean(offset + 35, $sno3_null_flg, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 36, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 36, $sno4, value);
	}


	/**
	 * Allow without SEIBAN No. 4 flg. 手配ＮＯ４無し可ＦＬＧ.<p>
	 *
	 */
	public boolean sno4_null_flg() {
		return getConstBoolean(offset + 37, $sno4_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 4 flg. 手配ＮＯ４無し可ＦＬＧ.<p>
	 *
	 */
	public void sno4_null_flg(boolean value) {
		setConstBoolean(offset + 37, $sno4_null_flg, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 38, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 38, $base_unit_cd, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 39, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 39, $gd_cd, value);
	}


	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 40, $ver_no);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 40, $ver_no, value);
	}


	/**
	 * Lot mixed flg. ロット混在ＦＬＧ.<p>
	 *
	 */
	public boolean lot_mix_flg() {
		return getConstBoolean(offset + 41, $lot_mix_flg);
	}

	/**
	 * Lot mixed flg. ロット混在ＦＬＧ.<p>
	 *
	 */
	public void lot_mix_flg(boolean value) {
		setConstBoolean(offset + 41, $lot_mix_flg, value);
	}


	/**
	 * Sublot mixed flg. サブロット混在ＦＬＧ.<p>
	 *
	 */
	public boolean sublot_mix_flg() {
		return getConstBoolean(offset + 42, $sublot_mix_flg);
	}

	/**
	 * Sublot mixed flg. サブロット混在ＦＬＧ.<p>
	 *
	 */
	public void sublot_mix_flg(boolean value) {
		setConstBoolean(offset + 42, $sublot_mix_flg, value);
	}


	/**
	 * Active ingredient 有効成分.<p>
	 *
	 */
	public MCNumber cont_qty() {
		return getConstNumber(offset + 43, $cont_qty);
	}

	/**
	 * Active ingredient 有効成分.<p>
	 *
	 */
	public void cont_qty(MCNumber value) {
		setConstNumber(offset + 43, $cont_qty, value);
	}

	/**
	 * Active ingredient 有効成分.<p>
	 *
	 */
	public void cont_qty(int value) {
		setConstNumber(offset + 43, $cont_qty, value);
	}

	/**
	 * Active ingredient 有効成分.<p>
	 *
	 */
	public void cont_qty(long value) {
		setConstNumber(offset + 43, $cont_qty, value);
	}

	/**
	 * Active ingredient 有効成分.<p>
	 *
	 */
	public void cont_qty(float value) {
		setConstNumber(offset + 43, $cont_qty, value);
	}

	/**
	 * Active ingredient 有効成分.<p>
	 *
	 */
	public void cont_qty(double value) {
		setConstNumber(offset + 43, $cont_qty, value);
	}


	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public String itm_ord_no() {
		return getConstString(offset + 44, $itm_ord_no);
	}

	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public void itm_ord_no(String value) {
		setConstString(offset + 44, $itm_ord_no, value);
	}


	/**
	 * Order date 指図日.<p>
	 *
	 */
	public MCDate inst_dt() {
		return getConstDate(offset + 45, $inst_dt);
	}

	/**
	 * Order date 指図日.<p>
	 *
	 */
	public void inst_dt(MCDate value) {
		setConstDate(offset + 45, $inst_dt, value);
	}


	/**
	 * Order PIC cd. 指図担当者ＣＤ.<p>
	 *
	 */
	public String inst_usr_cd() {
		return getConstString(offset + 46, $inst_usr_cd);
	}

	/**
	 * Order PIC cd. 指図担当者ＣＤ.<p>
	 *
	 */
	public void inst_usr_cd(String value) {
		setConstString(offset + 46, $inst_usr_cd, value);
	}


	/**
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public String inst_dpt_cd() {
		return getConstString(offset + 47, $inst_dpt_cd);
	}

	/**
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public void inst_dpt_cd(String value) {
		setConstString(offset + 47, $inst_dpt_cd, value);
	}


	public mcframe.serverMS.dbc.MST_INPT_ALLOC_STS_R inpt_alloc(){
		return (mcframe.serverMS.dbc.MST_INPT_ALLOC_STS_R) getConstInnerRow(offset + 48, $inpt_alloc);
	}
	
	public void inpt_alloc(mcframe.serverMS.dbc.MST_INPT_ALLOC_STS_R row){
		setConstInnerRow(offset + 48, $inpt_alloc, row);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			return mfg_sts_typ();
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
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			return alt_grp_cd();
		}
		if ($alt_itm_typ.equalsIgnoreCase(name)) {
			return alt_itm_typ();
		}
		if ($inpt_loc_cd.equalsIgnoreCase(name)) {
			return inpt_loc_cd();
		}
		if ($inpt_str_ln_cd.equalsIgnoreCase(name)) {
			return inpt_str_ln_cd();
		}
		if ($inpt_ctl_typ.equalsIgnoreCase(name)) {
			return inpt_ctl_typ();
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ();
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			return gi_loc_cd();
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			return gi_str_ln_cd();
		}
		if ($gi_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return gi_stk_arrv_bp_cd();
		}
		if ($gi_stk_id_typ.equalsIgnoreCase(name)) {
			return gi_stk_id_typ();
		}
		if ($gi_stk_bp_cd.equalsIgnoreCase(name)) {
			return gi_stk_bp_cd();
		}
		if ($gr_loc_cd.equalsIgnoreCase(name)) {
			return gr_loc_cd();
		}
		if ($gr_str_ln_cd.equalsIgnoreCase(name)) {
			return gr_str_ln_cd();
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			return inst_usr_cd();
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			return inst_dpt_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($inpt_peg_no.equalsIgnoreCase(name)) {
			return inpt_peg_no();
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			return alt_grp_seq();
		}
		if ($base_unit_alt_qty.equalsIgnoreCase(name)) {
			return base_unit_alt_qty();
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			return alt_alloc_prio();
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			return alt_itm_ratio();
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			return cont_qty();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($schd_tm.equalsIgnoreCase(name)) {
			return schd_tm();
		}
		if ($gr_schd_dt.equalsIgnoreCase(name)) {
			return gr_schd_dt();
		}
		if ($inst_dt.equalsIgnoreCase(name)) {
			return inst_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($has_xfr_inst_flg.equalsIgnoreCase(name)) {
			return has_xfr_inst_flg();
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
		if ($lot_mix_flg.equalsIgnoreCase(name)) {
			return lot_mix_flg();
		}
		if ($sublot_mix_flg.equalsIgnoreCase(name)) {
			return sublot_mix_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			return mfg_sts_typ();
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
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			return alt_grp_cd();
		}
		if ($alt_itm_typ.equalsIgnoreCase(name)) {
			return alt_itm_typ();
		}
		if ($inpt_loc_cd.equalsIgnoreCase(name)) {
			return inpt_loc_cd();
		}
		if ($inpt_str_ln_cd.equalsIgnoreCase(name)) {
			return inpt_str_ln_cd();
		}
		if ($inpt_ctl_typ.equalsIgnoreCase(name)) {
			return inpt_ctl_typ();
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ();
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			return gi_loc_cd();
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			return gi_str_ln_cd();
		}
		if ($gi_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return gi_stk_arrv_bp_cd();
		}
		if ($gi_stk_id_typ.equalsIgnoreCase(name)) {
			return gi_stk_id_typ();
		}
		if ($gi_stk_bp_cd.equalsIgnoreCase(name)) {
			return gi_stk_bp_cd();
		}
		if ($gr_loc_cd.equalsIgnoreCase(name)) {
			return gr_loc_cd();
		}
		if ($gr_str_ln_cd.equalsIgnoreCase(name)) {
			return gr_str_ln_cd();
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			return inst_usr_cd();
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			return inst_dpt_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($inpt_peg_no.equalsIgnoreCase(name)) {
			return inpt_peg_no();
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			return alt_grp_seq();
		}
		if ($base_unit_alt_qty.equalsIgnoreCase(name)) {
			return base_unit_alt_qty();
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			return alt_alloc_prio();
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			return alt_itm_ratio();
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			return cont_qty();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($schd_tm.equalsIgnoreCase(name)) {
			return schd_tm();
		}
		if ($gr_schd_dt.equalsIgnoreCase(name)) {
			return gr_schd_dt();
		}
		if ($inst_dt.equalsIgnoreCase(name)) {
			return inst_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($has_xfr_inst_flg.equalsIgnoreCase(name)) {
			return has_xfr_inst_flg();
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
		if ($lot_mix_flg.equalsIgnoreCase(name)) {
			return lot_mix_flg();
		}
		if ($sublot_mix_flg.equalsIgnoreCase(name)) {
			return sublot_mix_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			mfg_sts_typ(value);
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
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			alt_grp_cd(value);
			return;
		}
		if ($alt_itm_typ.equalsIgnoreCase(name)) {
			alt_itm_typ(value);
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
		if ($inpt_ctl_typ.equalsIgnoreCase(name)) {
			inpt_ctl_typ(value);
			return;
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ(value);
			return;
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			gi_loc_cd(value);
			return;
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			gi_str_ln_cd(value);
			return;
		}
		if ($gi_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			gi_stk_arrv_bp_cd(value);
			return;
		}
		if ($gi_stk_id_typ.equalsIgnoreCase(name)) {
			gi_stk_id_typ(value);
			return;
		}
		if ($gi_stk_bp_cd.equalsIgnoreCase(name)) {
			gi_stk_bp_cd(value);
			return;
		}
		if ($gr_loc_cd.equalsIgnoreCase(name)) {
			gr_loc_cd(value);
			return;
		}
		if ($gr_str_ln_cd.equalsIgnoreCase(name)) {
			gr_str_ln_cd(value);
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
			return;
		}
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			inst_usr_cd(value);
			return;
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			inst_dpt_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($inpt_peg_no.equalsIgnoreCase(name)) {
			inpt_peg_no(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($base_unit_alt_qty.equalsIgnoreCase(name)) {
			base_unit_alt_qty(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($inpt_peg_no.equalsIgnoreCase(name)) {
			inpt_peg_no(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($base_unit_alt_qty.equalsIgnoreCase(name)) {
			base_unit_alt_qty(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($inpt_peg_no.equalsIgnoreCase(name)) {
			inpt_peg_no(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($base_unit_alt_qty.equalsIgnoreCase(name)) {
			base_unit_alt_qty(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($inpt_peg_no.equalsIgnoreCase(name)) {
			inpt_peg_no(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($base_unit_alt_qty.equalsIgnoreCase(name)) {
			base_unit_alt_qty(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($inpt_peg_no.equalsIgnoreCase(name)) {
			inpt_peg_no(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($base_unit_alt_qty.equalsIgnoreCase(name)) {
			base_unit_alt_qty(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($schd_tm.equalsIgnoreCase(name)) {
			schd_tm(value);
			return;
		}
		if ($gr_schd_dt.equalsIgnoreCase(name)) {
			gr_schd_dt(value);
			return;
		}
		if ($inst_dt.equalsIgnoreCase(name)) {
			inst_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($has_xfr_inst_flg.equalsIgnoreCase(name)) {
			has_xfr_inst_flg(value);
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
		if ($lot_mix_flg.equalsIgnoreCase(name)) {
			lot_mix_flg(value);
			return;
		}
		if ($sublot_mix_flg.equalsIgnoreCase(name)) {
			sublot_mix_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			mfg_sts_typ(value);
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
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			alt_grp_cd(value);
			return;
		}
		if ($alt_itm_typ.equalsIgnoreCase(name)) {
			alt_itm_typ(value);
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
		if ($inpt_ctl_typ.equalsIgnoreCase(name)) {
			inpt_ctl_typ(value);
			return;
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ(value);
			return;
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			gi_loc_cd(value);
			return;
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			gi_str_ln_cd(value);
			return;
		}
		if ($gi_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			gi_stk_arrv_bp_cd(value);
			return;
		}
		if ($gi_stk_id_typ.equalsIgnoreCase(name)) {
			gi_stk_id_typ(value);
			return;
		}
		if ($gi_stk_bp_cd.equalsIgnoreCase(name)) {
			gi_stk_bp_cd(value);
			return;
		}
		if ($gr_loc_cd.equalsIgnoreCase(name)) {
			gr_loc_cd(value);
			return;
		}
		if ($gr_str_ln_cd.equalsIgnoreCase(name)) {
			gr_str_ln_cd(value);
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
			return;
		}
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			inst_usr_cd(value);
			return;
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			inst_dpt_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($inpt_peg_no.equalsIgnoreCase(name)) {
			inpt_peg_no(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($base_unit_alt_qty.equalsIgnoreCase(name)) {
			base_unit_alt_qty(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($inpt_peg_no.equalsIgnoreCase(name)) {
			inpt_peg_no(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($base_unit_alt_qty.equalsIgnoreCase(name)) {
			base_unit_alt_qty(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($inpt_peg_no.equalsIgnoreCase(name)) {
			inpt_peg_no(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($base_unit_alt_qty.equalsIgnoreCase(name)) {
			base_unit_alt_qty(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($inpt_peg_no.equalsIgnoreCase(name)) {
			inpt_peg_no(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($base_unit_alt_qty.equalsIgnoreCase(name)) {
			base_unit_alt_qty(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($inpt_peg_no.equalsIgnoreCase(name)) {
			inpt_peg_no(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($base_unit_alt_qty.equalsIgnoreCase(name)) {
			base_unit_alt_qty(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($schd_tm.equalsIgnoreCase(name)) {
			schd_tm(value);
			return;
		}
		if ($gr_schd_dt.equalsIgnoreCase(name)) {
			gr_schd_dt(value);
			return;
		}
		if ($inst_dt.equalsIgnoreCase(name)) {
			inst_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($has_xfr_inst_flg.equalsIgnoreCase(name)) {
			has_xfr_inst_flg(value);
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
		if ($lot_mix_flg.equalsIgnoreCase(name)) {
			lot_mix_flg(value);
			return;
		}
		if ($sublot_mix_flg.equalsIgnoreCase(name)) {
			sublot_mix_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($inpt_alloc.equalsIgnoreCase(name)) {
			return inpt_alloc();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($inpt_alloc.equalsIgnoreCase(name)) {
			inpt_alloc(
				((MCContainerMeta) inpt_alloc_META).castInnerRow(mcframe.serverMS.dbc.MST_INPT_ALLOC_STS_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Input allocation status No. 投入引当状況ＮＯ.<p>
	 *
	 */
	public String inpt_alloc_sts_no() {
		return inpt_alloc().inpt_alloc_sts_no();
	}

	/**
	 * Input allocation status No. 投入引当状況ＮＯ.<p>
	 *
	 */
	public void inpt_alloc_sts_no(String value) {
		inpt_alloc().inpt_alloc_sts_no(value);
	}

	/**
	 * Input schedule No. 投入予定ＮＯ.<p>
	 *
	 */
	public String inpt_schd_no() {
		return inpt_alloc().inpt_schd_no();
	}

	/**
	 * Input schedule No. 投入予定ＮＯ.<p>
	 *
	 */
	public void inpt_schd_no(String value) {
		inpt_alloc().inpt_schd_no(value);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return inpt_alloc().mfg_inst_no();
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		inpt_alloc().mfg_inst_no(value);
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return inpt_alloc().itm_mfg_inst_no();
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		inpt_alloc().itm_mfg_inst_no(value);
	}

	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public String oper_inst_no() {
		return inpt_alloc().oper_inst_no();
	}

	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public void oper_inst_no(String value) {
		inpt_alloc().oper_inst_no(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return inpt_alloc().base_unit_qty();
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		inpt_alloc().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		inpt_alloc().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		inpt_alloc().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		inpt_alloc().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		inpt_alloc().base_unit_qty(value);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return inpt_alloc().stk_id_typ();
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		inpt_alloc().stk_id_typ(value);
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public String stk_bp_cd() {
		return inpt_alloc().stk_bp_cd();
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		inpt_alloc().stk_bp_cd(value);
	}

	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public String stk_arrv_bp_cd() {
		return inpt_alloc().stk_arrv_bp_cd();
	}

	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public void stk_arrv_bp_cd(String value) {
		inpt_alloc().stk_arrv_bp_cd(value);
	}

	/**
	 * Inventory identification type (Destination) 移動先在庫識別区分.<p>
	 *
	 */
	public String to_stk_id_typ() {
		return inpt_alloc().to_stk_id_typ();
	}

	/**
	 * Inventory identification type (Destination) 移動先在庫識別区分.<p>
	 *
	 */
	public void to_stk_id_typ(String value) {
		inpt_alloc().to_stk_id_typ(value);
	}

	/**
	 * Inventory destination cd. (Destination) 移動先在庫取引ＣＤ.<p>
	 *
	 */
	public String to_stk_bp_cd() {
		return inpt_alloc().to_stk_bp_cd();
	}

	/**
	 * Inventory destination cd. (Destination) 移動先在庫取引ＣＤ.<p>
	 *
	 */
	public void to_stk_bp_cd(String value) {
		inpt_alloc().to_stk_bp_cd(value);
	}

	/**
	 * Inventory arriving point cd. (Destination) 移動先在庫着荷先ＣＤ.<p>
	 *
	 */
	public String to_stk_arrv_bp_cd() {
		return inpt_alloc().to_stk_arrv_bp_cd();
	}

	/**
	 * Inventory arriving point cd. (Destination) 移動先在庫着荷先ＣＤ.<p>
	 *
	 */
	public void to_stk_arrv_bp_cd(String value) {
		inpt_alloc().to_stk_arrv_bp_cd(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return inpt_alloc().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		inpt_alloc().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return inpt_alloc().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		inpt_alloc().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return inpt_alloc().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		inpt_alloc().sub_char3(value);
	}

}

