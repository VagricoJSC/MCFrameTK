package mcframe.serverMSBC.MSBCL6060;

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
 * ブロック"MfgActTblReg_Upd06_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MfgActTblReg_Upd06_DtlR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public static final String $can_ac_dt = "can_ac_dt";
	/**
	 * SKU 荷姿.<p>
	 *
	 */
	public static final String $pack_flg = "pack_flg";
	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public static final String $mfg_inst_no = "mfg_inst_no";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public static final String $trd_cd = "trd_cd";
	/**
	 * Result dept. cd. 実績部門ＣＤ.<p>
	 *
	 */
	public static final String $act_dpt_cd = "act_dpt_cd";
	/**
	 * Result management PIC cd. 実績責任者ＣＤ.<p>
	 *
	 */
	public static final String $act_usr_cd = "act_usr_cd";
	/**
	 * Item mfg. order qty. 品目製造指図数量.<p>
	 *
	 */
	public static final String $itm_mfg_inst_qty = "itm_mfg_inst_qty";
	/**
	 * Mfg. start qty. 製造着手数量.<p>
	 *
	 */
	public static final String $mfg_st_qty = "mfg_st_qty";
	/**
	 * Routing 工順.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public static final String $oper_cd = "oper_cd";
	/**
	 * Parent item cd. 親品目ＣＤ.<p>
	 *
	 */
	public static final String $par_itm_cd = "par_itm_cd";
	/**
	 * Parent branch No. 1 親枝番１.<p>
	 *
	 */
	public static final String $par_itm_sub1 = "par_itm_sub1";
	/**
	 * Parent branch No. 2 親枝番２.<p>
	 *
	 */
	public static final String $par_itm_sub2 = "par_itm_sub2";
	/**
	 * Parent branch No. 3 親枝番３.<p>
	 *
	 */
	public static final String $par_itm_sub3 = "par_itm_sub3";
	/**
	 * Parent item name 親品名.<p>
	 *
	 */
	public static final String $par_itm_nm = "par_itm_nm";
	/**
	 * Item mfg. order lot No. 品目製造指図ロットＮＯ.<p>
	 *
	 */
	public static final String $mfg_inst_lot_no = "mfg_inst_lot_no";
	/**
	 * Item mfg. order sublot No. 品目製造指図サブロットＮＯ.<p>
	 *
	 */
	public static final String $mfg_inst_sublot_no = "mfg_inst_sublot_no";
	/**
	 * Item mfg. order SEIBAN No. 1 品目製造指図手配ＮＯ１.<p>
	 *
	 */
	public static final String $mfg_inst_sno1 = "mfg_inst_sno1";
	/**
	 * Item mfg. order SEIBAN No. 2 品目製造指図手配ＮＯ２.<p>
	 *
	 */
	public static final String $mfg_inst_sno2 = "mfg_inst_sno2";
	/**
	 * Item mfg. order SEIBAN No. 3 品目製造指図手配ＮＯ３.<p>
	 *
	 */
	public static final String $mfg_inst_sno3 = "mfg_inst_sno3";
	/**
	 * Item mfg. order SEIBAN No. 4 品目製造指図手配ＮＯ４.<p>
	 *
	 */
	public static final String $mfg_inst_sno4 = "mfg_inst_sno4";
	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public static final String $mfg_inst_unit_typ = "mfg_inst_unit_typ";
	/**
	 * Item mfg. order SEIBAN No. 1 management type 品目製造指図手配ＮＯ１管理区分.<p>
	 *
	 */
	public static final String $mfg_inst_sno1_mng_typ = "mfg_inst_sno1_mng_typ";
	/**
	 * Item mfg. order SEIBAN No. 2 management type 品目製造指図手配ＮＯ２管理区分.<p>
	 *
	 */
	public static final String $mfg_inst_sno2_mng_typ = "mfg_inst_sno2_mng_typ";
	/**
	 * Item mfg. order SEIBAN No. 3 management type 品目製造指図手配ＮＯ３管理区分.<p>
	 *
	 */
	public static final String $mfg_inst_sno3_mng_typ = "mfg_inst_sno3_mng_typ";
	/**
	 * Item mfg. order SEIBAN No. 4 management type 品目製造指図手配ＮＯ４管理区分.<p>
	 *
	 */
	public static final String $mfg_inst_sno4_mng_typ = "mfg_inst_sno4_mng_typ";
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
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public static final String $pack_unit_qty = "pack_unit_qty";
	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public static final String $pack_unit_cd = "pack_unit_cd";
	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public static final String $abort_flg = "abort_flg";
	public static final String $by_prod = "by_prod";

	public static final String $yield_act_no = $by_prod + ".yield_act_no";
	public static final String $mfg_act_no = $by_prod + ".mfg_act_no";
	public static final String $itm_mfg_inst_no = $by_prod + ".itm_mfg_inst_no";
	public static final String $oper_act_no = $by_prod + ".oper_act_no";
	public static final String $yield_schd_no = $by_prod + ".yield_schd_no";
	public static final String $div_seq = $by_prod + ".div_seq";
	public static final String $mfg_mtd_typ = $by_prod + ".mfg_mtd_typ";
	public static final String $itm_cd = $by_prod + ".itm_cd";
	public static final String $itm_sub1 = $by_prod + ".itm_sub1";
	public static final String $itm_sub2 = $by_prod + ".itm_sub2";
	public static final String $itm_sub3 = $by_prod + ".itm_sub3";
	public static final String $trd_unit_qty = $by_prod + ".trd_unit_qty";
	public static final String $trd_unit_cd = $by_prod + ".trd_unit_cd";
	public static final String $base_unit_qty = $by_prod + ".base_unit_qty";
	public static final String $base_unit_cd = $by_prod + ".base_unit_cd";
	public static final String $yield_typ = $by_prod + ".yield_typ";
	public static final String $yield_rate = $by_prod + ".yield_rate";
	public static final String $lot_no = $by_prod + ".lot_no";
	public static final String $sublot_no = $by_prod + ".sublot_no";
	public static final String $sno1 = $by_prod + ".sno1";
	public static final String $sno2 = $by_prod + ".sno2";
	public static final String $sno3 = $by_prod + ".sno3";
	public static final String $sno4 = $by_prod + ".sno4";
	public static final String $quality_typ = $by_prod + ".quality_typ";
	public static final String $stk_insp_typ = $by_prod + ".stk_insp_typ";
	public static final String $gd_cd = $by_prod + ".gd_cd";
	public static final String $yield_rsn_cd = $by_prod + ".yield_rsn_cd";
	public static final String $yield_loc_cd = $by_prod + ".yield_loc_cd";
	public static final String $yield_str_ln_cd = $by_prod + ".yield_str_ln_cd";
	public static final String $strg_loc_cd = $by_prod + ".strg_loc_cd";
	public static final String $strg_str_ln_cd = $by_prod + ".strg_str_ln_cd";
	public static final String $act_tm = $by_prod + ".act_tm";
	public static final String $ac_dt = $by_prod + ".ac_dt";
	public static final String $bkf_ctl_flg = $by_prod + ".bkf_ctl_flg";
	public static final String $lot_ctl_flg = $by_prod + ".lot_ctl_flg";
	public static final String $sublot_ctl_flg = $by_prod + ".sublot_ctl_flg";
	public static final String $data_no = $by_prod + ".data_no";
	public static final String $mes_id = $by_prod + ".mes_id";
	public static final String $intr_rmrks = $by_prod + ".intr_rmrks";
	public static final String $trd_rmrks = $by_prod + ".trd_rmrks";
	public static final String $yield_act_sub_char1 = $by_prod + ".sub_char1";
	public static final String $yield_act_sub_char2 = $by_prod + ".sub_char2";
	public static final String $yield_act_sub_char3 = $by_prod + ".sub_char3";
	public static final String $mes_flg = $by_prod + ".mes_flg";
	public static final String $ext_sys_cd = $by_prod + ".ext_sys_cd";
	public static final String $ext_yield_act_no = $by_prod + ".ext_yield_act_no";

	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta can_ac_dt_META = createCommonMeta($can_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pack_flg_META = createCommonMeta($pack_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta act_dpt_cd_META = createCommonMeta($act_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta act_usr_cd_META = createCommonMeta($act_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta itm_mfg_inst_qty_META = createCommonMeta($itm_mfg_inst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta mfg_st_qty_META = createCommonMeta($mfg_st_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta par_itm_cd_META = createCommonMeta($par_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta par_itm_sub1_META = createCommonMeta($par_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta par_itm_sub2_META = createCommonMeta($par_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta par_itm_sub3_META = createCommonMeta($par_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta par_itm_nm_META = createCommonMeta($par_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta mfg_inst_lot_no_META = createCommonMeta($mfg_inst_lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta mfg_inst_sublot_no_META = createCommonMeta($mfg_inst_sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta mfg_inst_sno1_META = createCommonMeta($mfg_inst_sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta mfg_inst_sno2_META = createCommonMeta($mfg_inst_sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta mfg_inst_sno3_META = createCommonMeta($mfg_inst_sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta mfg_inst_sno4_META = createCommonMeta($mfg_inst_sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta mfg_inst_unit_typ_META = createCommonMeta($mfg_inst_unit_typ, mcframe.commonMA.meta.MA_META.MFG_INST_UNIT_TYP);
	public static final MCMeta mfg_inst_sno1_mng_typ_META = createCommonMeta($mfg_inst_sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta mfg_inst_sno2_mng_typ_META = createCommonMeta($mfg_inst_sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta mfg_inst_sno3_mng_typ_META = createCommonMeta($mfg_inst_sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta mfg_inst_sno4_mng_typ_META = createCommonMeta($mfg_inst_sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno1_mng_typ_META = createCommonMeta($sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno2_mng_typ_META = createCommonMeta($sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno3_mng_typ_META = createCommonMeta($sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno4_mng_typ_META = createCommonMeta($sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta pack_unit_qty_META = createCommonMeta($pack_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_unit_cd_META = createCommonMeta($pack_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta abort_flg_META = createCommonMeta($abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta by_prod_META = createInnerRowMeta($by_prod, mcframe.serverMS.dbc.MST_YIELD_ACT_R.class);

	protected static final ConstMetaList<MfgActTblReg_Upd06_DtlR> constMetas = new ConstMetaList<MfgActTblReg_Upd06_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			data_crud_typ_META,
			can_ac_dt_META,
			pack_flg_META,
			mfg_inst_no_META,
			wg_cd_META,
			trd_cd_META,
			act_dpt_cd_META,
			act_usr_cd_META,
			itm_mfg_inst_qty_META,
			mfg_st_qty_META,
			disp_seq_META,
			oper_cd_META,
			par_itm_cd_META,
			par_itm_sub1_META,
			par_itm_sub2_META,
			par_itm_sub3_META,
			par_itm_nm_META,
			mfg_inst_lot_no_META,
			mfg_inst_sublot_no_META,
			mfg_inst_sno1_META,
			mfg_inst_sno2_META,
			mfg_inst_sno3_META,
			mfg_inst_sno4_META,
			mfg_inst_unit_typ_META,
			mfg_inst_sno1_mng_typ_META,
			mfg_inst_sno2_mng_typ_META,
			mfg_inst_sno3_mng_typ_META,
			mfg_inst_sno4_mng_typ_META,
			sno1_mng_typ_META,
			sno2_mng_typ_META,
			sno3_mng_typ_META,
			sno4_mng_typ_META,
			pack_unit_qty_META,
			pack_unit_cd_META,
			abort_flg_META,
			by_prod_META
		},
		new String[][]{
			{
				"yield_act_no",
				"mfg_act_no",
				"itm_mfg_inst_no",
				"oper_act_no",
				"yield_schd_no",
				"div_seq",
				"mfg_mtd_typ",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"trd_unit_qty",
				"trd_unit_cd",
				"base_unit_qty",
				"base_unit_cd",
				"yield_typ",
				"yield_rate",
				"lot_no",
				"sublot_no",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"quality_typ",
				"stk_insp_typ",
				"gd_cd",
				"yield_rsn_cd",
				"yield_loc_cd",
				"yield_str_ln_cd",
				"strg_loc_cd",
				"strg_str_ln_cd",
				"act_tm",
				"ac_dt",
				"bkf_ctl_flg",
				"lot_ctl_flg",
				"sublot_ctl_flg",
				"data_no",
				"mes_id",
				"intr_rmrks",
				"trd_rmrks",
				"yield_act_sub_char1",
				"yield_act_sub_char2",
				"yield_act_sub_char3",
				"mes_flg",
				"ext_sys_cd",
				"ext_yield_act_no"
			},
			{
				$yield_act_no,
				$mfg_act_no,
				$itm_mfg_inst_no,
				$oper_act_no,
				$yield_schd_no,
				$div_seq,
				$mfg_mtd_typ,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$trd_unit_qty,
				$trd_unit_cd,
				$base_unit_qty,
				$base_unit_cd,
				$yield_typ,
				$yield_rate,
				$lot_no,
				$sublot_no,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$quality_typ,
				$stk_insp_typ,
				$gd_cd,
				$yield_rsn_cd,
				$yield_loc_cd,
				$yield_str_ln_cd,
				$strg_loc_cd,
				$strg_str_ln_cd,
				$act_tm,
				$ac_dt,
				$bkf_ctl_flg,
				$lot_ctl_flg,
				$sublot_ctl_flg,
				$data_no,
				$mes_id,
				$intr_rmrks,
				$trd_rmrks,
				$yield_act_sub_char1,
				$yield_act_sub_char2,
				$yield_act_sub_char3,
				$mes_flg,
				$ext_sys_cd,
				$ext_yield_act_no
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
	protected MfgActTblReg_Upd06_DtlR_MC_A(ConstMetaList<? extends MfgActTblReg_Upd06_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgActTblReg_Upd06_DtlR clone() {
		return (MfgActTblReg_Upd06_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgActTblReg_Upd06_DtlR createInstance() {
		return (MfgActTblReg_Upd06_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgActTblReg_Upd06_DtlR getValues(String... names) {
		return (MfgActTblReg_Upd06_DtlR) super.getValues(names);
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
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 1, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 1, $data_crud_typ, value);
	}


	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public MCDate can_ac_dt() {
		return getConstDate(offset + 2, $can_ac_dt);
	}

	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public void can_ac_dt(MCDate value) {
		setConstDate(offset + 2, $can_ac_dt, value);
	}


	/**
	 * SKU 荷姿.<p>
	 *
	 */
	public boolean pack_flg() {
		return getConstBoolean(offset + 3, $pack_flg);
	}

	/**
	 * SKU 荷姿.<p>
	 *
	 */
	public void pack_flg(boolean value) {
		setConstBoolean(offset + 3, $pack_flg, value);
	}


	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 4, $mfg_inst_no);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 4, $mfg_inst_no, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 5, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 5, $wg_cd, value);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 6, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 6, $trd_cd, value);
	}


	/**
	 * Result dept. cd. 実績部門ＣＤ.<p>
	 *
	 */
	public String act_dpt_cd() {
		return getConstString(offset + 7, $act_dpt_cd);
	}

	/**
	 * Result dept. cd. 実績部門ＣＤ.<p>
	 *
	 */
	public void act_dpt_cd(String value) {
		setConstString(offset + 7, $act_dpt_cd, value);
	}


	/**
	 * Result management PIC cd. 実績責任者ＣＤ.<p>
	 *
	 */
	public String act_usr_cd() {
		return getConstString(offset + 8, $act_usr_cd);
	}

	/**
	 * Result management PIC cd. 実績責任者ＣＤ.<p>
	 *
	 */
	public void act_usr_cd(String value) {
		setConstString(offset + 8, $act_usr_cd, value);
	}


	/**
	 * Item mfg. order qty. 品目製造指図数量.<p>
	 *
	 */
	public MCNumber itm_mfg_inst_qty() {
		return getConstNumber(offset + 9, $itm_mfg_inst_qty);
	}

	/**
	 * Item mfg. order qty. 品目製造指図数量.<p>
	 *
	 */
	public void itm_mfg_inst_qty(MCNumber value) {
		setConstNumber(offset + 9, $itm_mfg_inst_qty, value);
	}

	/**
	 * Item mfg. order qty. 品目製造指図数量.<p>
	 *
	 */
	public void itm_mfg_inst_qty(int value) {
		setConstNumber(offset + 9, $itm_mfg_inst_qty, value);
	}

	/**
	 * Item mfg. order qty. 品目製造指図数量.<p>
	 *
	 */
	public void itm_mfg_inst_qty(long value) {
		setConstNumber(offset + 9, $itm_mfg_inst_qty, value);
	}

	/**
	 * Item mfg. order qty. 品目製造指図数量.<p>
	 *
	 */
	public void itm_mfg_inst_qty(float value) {
		setConstNumber(offset + 9, $itm_mfg_inst_qty, value);
	}

	/**
	 * Item mfg. order qty. 品目製造指図数量.<p>
	 *
	 */
	public void itm_mfg_inst_qty(double value) {
		setConstNumber(offset + 9, $itm_mfg_inst_qty, value);
	}


	/**
	 * Mfg. start qty. 製造着手数量.<p>
	 *
	 */
	public MCNumber mfg_st_qty() {
		return getConstNumber(offset + 10, $mfg_st_qty);
	}

	/**
	 * Mfg. start qty. 製造着手数量.<p>
	 *
	 */
	public void mfg_st_qty(MCNumber value) {
		setConstNumber(offset + 10, $mfg_st_qty, value);
	}

	/**
	 * Mfg. start qty. 製造着手数量.<p>
	 *
	 */
	public void mfg_st_qty(int value) {
		setConstNumber(offset + 10, $mfg_st_qty, value);
	}

	/**
	 * Mfg. start qty. 製造着手数量.<p>
	 *
	 */
	public void mfg_st_qty(long value) {
		setConstNumber(offset + 10, $mfg_st_qty, value);
	}

	/**
	 * Mfg. start qty. 製造着手数量.<p>
	 *
	 */
	public void mfg_st_qty(float value) {
		setConstNumber(offset + 10, $mfg_st_qty, value);
	}

	/**
	 * Mfg. start qty. 製造着手数量.<p>
	 *
	 */
	public void mfg_st_qty(double value) {
		setConstNumber(offset + 10, $mfg_st_qty, value);
	}


	/**
	 * Routing 工順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 11, $disp_seq);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 11, $disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 11, $disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 11, $disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 11, $disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 11, $disp_seq, value);
	}


	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 12, $oper_cd);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 12, $oper_cd, value);
	}


	/**
	 * Parent item cd. 親品目ＣＤ.<p>
	 *
	 */
	public String par_itm_cd() {
		return getConstString(offset + 13, $par_itm_cd);
	}

	/**
	 * Parent item cd. 親品目ＣＤ.<p>
	 *
	 */
	public void par_itm_cd(String value) {
		setConstString(offset + 13, $par_itm_cd, value);
	}


	/**
	 * Parent branch No. 1 親枝番１.<p>
	 *
	 */
	public String par_itm_sub1() {
		return getConstString(offset + 14, $par_itm_sub1);
	}

	/**
	 * Parent branch No. 1 親枝番１.<p>
	 *
	 */
	public void par_itm_sub1(String value) {
		setConstString(offset + 14, $par_itm_sub1, value);
	}


	/**
	 * Parent branch No. 2 親枝番２.<p>
	 *
	 */
	public String par_itm_sub2() {
		return getConstString(offset + 15, $par_itm_sub2);
	}

	/**
	 * Parent branch No. 2 親枝番２.<p>
	 *
	 */
	public void par_itm_sub2(String value) {
		setConstString(offset + 15, $par_itm_sub2, value);
	}


	/**
	 * Parent branch No. 3 親枝番３.<p>
	 *
	 */
	public String par_itm_sub3() {
		return getConstString(offset + 16, $par_itm_sub3);
	}

	/**
	 * Parent branch No. 3 親枝番３.<p>
	 *
	 */
	public void par_itm_sub3(String value) {
		setConstString(offset + 16, $par_itm_sub3, value);
	}


	/**
	 * Parent item name 親品名.<p>
	 *
	 */
	public String par_itm_nm() {
		return getConstString(offset + 17, $par_itm_nm);
	}

	/**
	 * Parent item name 親品名.<p>
	 *
	 */
	public void par_itm_nm(String value) {
		setConstString(offset + 17, $par_itm_nm, value);
	}


	/**
	 * Item mfg. order lot No. 品目製造指図ロットＮＯ.<p>
	 *
	 */
	public String mfg_inst_lot_no() {
		return getConstString(offset + 18, $mfg_inst_lot_no);
	}

	/**
	 * Item mfg. order lot No. 品目製造指図ロットＮＯ.<p>
	 *
	 */
	public void mfg_inst_lot_no(String value) {
		setConstString(offset + 18, $mfg_inst_lot_no, value);
	}


	/**
	 * Item mfg. order sublot No. 品目製造指図サブロットＮＯ.<p>
	 *
	 */
	public String mfg_inst_sublot_no() {
		return getConstString(offset + 19, $mfg_inst_sublot_no);
	}

	/**
	 * Item mfg. order sublot No. 品目製造指図サブロットＮＯ.<p>
	 *
	 */
	public void mfg_inst_sublot_no(String value) {
		setConstString(offset + 19, $mfg_inst_sublot_no, value);
	}


	/**
	 * Item mfg. order SEIBAN No. 1 品目製造指図手配ＮＯ１.<p>
	 *
	 */
	public String mfg_inst_sno1() {
		return getConstString(offset + 20, $mfg_inst_sno1);
	}

	/**
	 * Item mfg. order SEIBAN No. 1 品目製造指図手配ＮＯ１.<p>
	 *
	 */
	public void mfg_inst_sno1(String value) {
		setConstString(offset + 20, $mfg_inst_sno1, value);
	}


	/**
	 * Item mfg. order SEIBAN No. 2 品目製造指図手配ＮＯ２.<p>
	 *
	 */
	public String mfg_inst_sno2() {
		return getConstString(offset + 21, $mfg_inst_sno2);
	}

	/**
	 * Item mfg. order SEIBAN No. 2 品目製造指図手配ＮＯ２.<p>
	 *
	 */
	public void mfg_inst_sno2(String value) {
		setConstString(offset + 21, $mfg_inst_sno2, value);
	}


	/**
	 * Item mfg. order SEIBAN No. 3 品目製造指図手配ＮＯ３.<p>
	 *
	 */
	public String mfg_inst_sno3() {
		return getConstString(offset + 22, $mfg_inst_sno3);
	}

	/**
	 * Item mfg. order SEIBAN No. 3 品目製造指図手配ＮＯ３.<p>
	 *
	 */
	public void mfg_inst_sno3(String value) {
		setConstString(offset + 22, $mfg_inst_sno3, value);
	}


	/**
	 * Item mfg. order SEIBAN No. 4 品目製造指図手配ＮＯ４.<p>
	 *
	 */
	public String mfg_inst_sno4() {
		return getConstString(offset + 23, $mfg_inst_sno4);
	}

	/**
	 * Item mfg. order SEIBAN No. 4 品目製造指図手配ＮＯ４.<p>
	 *
	 */
	public void mfg_inst_sno4(String value) {
		setConstString(offset + 23, $mfg_inst_sno4, value);
	}


	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public String mfg_inst_unit_typ() {
		return getConstString(offset + 24, $mfg_inst_unit_typ);
	}

	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public void mfg_inst_unit_typ(String value) {
		setConstString(offset + 24, $mfg_inst_unit_typ, value);
	}


	/**
	 * Item mfg. order SEIBAN No. 1 management type 品目製造指図手配ＮＯ１管理区分.<p>
	 *
	 */
	public String mfg_inst_sno1_mng_typ() {
		return getConstString(offset + 25, $mfg_inst_sno1_mng_typ);
	}

	/**
	 * Item mfg. order SEIBAN No. 1 management type 品目製造指図手配ＮＯ１管理区分.<p>
	 *
	 */
	public void mfg_inst_sno1_mng_typ(String value) {
		setConstString(offset + 25, $mfg_inst_sno1_mng_typ, value);
	}


	/**
	 * Item mfg. order SEIBAN No. 2 management type 品目製造指図手配ＮＯ２管理区分.<p>
	 *
	 */
	public String mfg_inst_sno2_mng_typ() {
		return getConstString(offset + 26, $mfg_inst_sno2_mng_typ);
	}

	/**
	 * Item mfg. order SEIBAN No. 2 management type 品目製造指図手配ＮＯ２管理区分.<p>
	 *
	 */
	public void mfg_inst_sno2_mng_typ(String value) {
		setConstString(offset + 26, $mfg_inst_sno2_mng_typ, value);
	}


	/**
	 * Item mfg. order SEIBAN No. 3 management type 品目製造指図手配ＮＯ３管理区分.<p>
	 *
	 */
	public String mfg_inst_sno3_mng_typ() {
		return getConstString(offset + 27, $mfg_inst_sno3_mng_typ);
	}

	/**
	 * Item mfg. order SEIBAN No. 3 management type 品目製造指図手配ＮＯ３管理区分.<p>
	 *
	 */
	public void mfg_inst_sno3_mng_typ(String value) {
		setConstString(offset + 27, $mfg_inst_sno3_mng_typ, value);
	}


	/**
	 * Item mfg. order SEIBAN No. 4 management type 品目製造指図手配ＮＯ４管理区分.<p>
	 *
	 */
	public String mfg_inst_sno4_mng_typ() {
		return getConstString(offset + 28, $mfg_inst_sno4_mng_typ);
	}

	/**
	 * Item mfg. order SEIBAN No. 4 management type 品目製造指図手配ＮＯ４管理区分.<p>
	 *
	 */
	public void mfg_inst_sno4_mng_typ(String value) {
		setConstString(offset + 28, $mfg_inst_sno4_mng_typ, value);
	}


	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return getConstString(offset + 29, $sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		setConstString(offset + 29, $sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return getConstString(offset + 30, $sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		setConstString(offset + 30, $sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return getConstString(offset + 31, $sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		setConstString(offset + 31, $sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return getConstString(offset + 32, $sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		setConstString(offset + 32, $sno4_mng_typ, value);
	}


	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public MCNumber pack_unit_qty() {
		return getConstNumber(offset + 33, $pack_unit_qty);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(MCNumber value) {
		setConstNumber(offset + 33, $pack_unit_qty, value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(int value) {
		setConstNumber(offset + 33, $pack_unit_qty, value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(long value) {
		setConstNumber(offset + 33, $pack_unit_qty, value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(float value) {
		setConstNumber(offset + 33, $pack_unit_qty, value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(double value) {
		setConstNumber(offset + 33, $pack_unit_qty, value);
	}


	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public String pack_unit_cd() {
		return getConstString(offset + 34, $pack_unit_cd);
	}

	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public void pack_unit_cd(String value) {
		setConstString(offset + 34, $pack_unit_cd, value);
	}


	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public boolean abort_flg() {
		return getConstBoolean(offset + 35, $abort_flg);
	}

	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		setConstBoolean(offset + 35, $abort_flg, value);
	}


	public mcframe.serverMS.dbc.MST_YIELD_ACT_R by_prod(){
		return (mcframe.serverMS.dbc.MST_YIELD_ACT_R) getConstInnerRow(offset + 36, $by_prod);
	}
	
	public void by_prod(mcframe.serverMS.dbc.MST_YIELD_ACT_R row){
		setConstInnerRow(offset + 36, $by_prod, row);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			return act_dpt_cd();
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			return act_usr_cd();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
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
		if ($mfg_inst_lot_no.equalsIgnoreCase(name)) {
			return mfg_inst_lot_no();
		}
		if ($mfg_inst_sublot_no.equalsIgnoreCase(name)) {
			return mfg_inst_sublot_no();
		}
		if ($mfg_inst_sno1.equalsIgnoreCase(name)) {
			return mfg_inst_sno1();
		}
		if ($mfg_inst_sno2.equalsIgnoreCase(name)) {
			return mfg_inst_sno2();
		}
		if ($mfg_inst_sno3.equalsIgnoreCase(name)) {
			return mfg_inst_sno3();
		}
		if ($mfg_inst_sno4.equalsIgnoreCase(name)) {
			return mfg_inst_sno4();
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ();
		}
		if ($mfg_inst_sno1_mng_typ.equalsIgnoreCase(name)) {
			return mfg_inst_sno1_mng_typ();
		}
		if ($mfg_inst_sno2_mng_typ.equalsIgnoreCase(name)) {
			return mfg_inst_sno2_mng_typ();
		}
		if ($mfg_inst_sno3_mng_typ.equalsIgnoreCase(name)) {
			return mfg_inst_sno3_mng_typ();
		}
		if ($mfg_inst_sno4_mng_typ.equalsIgnoreCase(name)) {
			return mfg_inst_sno4_mng_typ();
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
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			return pack_unit_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($itm_mfg_inst_qty.equalsIgnoreCase(name)) {
			return itm_mfg_inst_qty();
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			return mfg_st_qty();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			return pack_unit_qty();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($pack_flg.equalsIgnoreCase(name)) {
			return pack_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			return act_dpt_cd();
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			return act_usr_cd();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
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
		if ($mfg_inst_lot_no.equalsIgnoreCase(name)) {
			return mfg_inst_lot_no();
		}
		if ($mfg_inst_sublot_no.equalsIgnoreCase(name)) {
			return mfg_inst_sublot_no();
		}
		if ($mfg_inst_sno1.equalsIgnoreCase(name)) {
			return mfg_inst_sno1();
		}
		if ($mfg_inst_sno2.equalsIgnoreCase(name)) {
			return mfg_inst_sno2();
		}
		if ($mfg_inst_sno3.equalsIgnoreCase(name)) {
			return mfg_inst_sno3();
		}
		if ($mfg_inst_sno4.equalsIgnoreCase(name)) {
			return mfg_inst_sno4();
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ();
		}
		if ($mfg_inst_sno1_mng_typ.equalsIgnoreCase(name)) {
			return mfg_inst_sno1_mng_typ();
		}
		if ($mfg_inst_sno2_mng_typ.equalsIgnoreCase(name)) {
			return mfg_inst_sno2_mng_typ();
		}
		if ($mfg_inst_sno3_mng_typ.equalsIgnoreCase(name)) {
			return mfg_inst_sno3_mng_typ();
		}
		if ($mfg_inst_sno4_mng_typ.equalsIgnoreCase(name)) {
			return mfg_inst_sno4_mng_typ();
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
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			return pack_unit_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($itm_mfg_inst_qty.equalsIgnoreCase(name)) {
			return itm_mfg_inst_qty();
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			return mfg_st_qty();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			return pack_unit_qty();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($pack_flg.equalsIgnoreCase(name)) {
			return pack_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			act_dpt_cd(value);
			return;
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			act_usr_cd(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
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
		if ($mfg_inst_lot_no.equalsIgnoreCase(name)) {
			mfg_inst_lot_no(value);
			return;
		}
		if ($mfg_inst_sublot_no.equalsIgnoreCase(name)) {
			mfg_inst_sublot_no(value);
			return;
		}
		if ($mfg_inst_sno1.equalsIgnoreCase(name)) {
			mfg_inst_sno1(value);
			return;
		}
		if ($mfg_inst_sno2.equalsIgnoreCase(name)) {
			mfg_inst_sno2(value);
			return;
		}
		if ($mfg_inst_sno3.equalsIgnoreCase(name)) {
			mfg_inst_sno3(value);
			return;
		}
		if ($mfg_inst_sno4.equalsIgnoreCase(name)) {
			mfg_inst_sno4(value);
			return;
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ(value);
			return;
		}
		if ($mfg_inst_sno1_mng_typ.equalsIgnoreCase(name)) {
			mfg_inst_sno1_mng_typ(value);
			return;
		}
		if ($mfg_inst_sno2_mng_typ.equalsIgnoreCase(name)) {
			mfg_inst_sno2_mng_typ(value);
			return;
		}
		if ($mfg_inst_sno3_mng_typ.equalsIgnoreCase(name)) {
			mfg_inst_sno3_mng_typ(value);
			return;
		}
		if ($mfg_inst_sno4_mng_typ.equalsIgnoreCase(name)) {
			mfg_inst_sno4_mng_typ(value);
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
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			pack_unit_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($itm_mfg_inst_qty.equalsIgnoreCase(name)) {
			itm_mfg_inst_qty(value);
			return;
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			mfg_st_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($itm_mfg_inst_qty.equalsIgnoreCase(name)) {
			itm_mfg_inst_qty(value);
			return;
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			mfg_st_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($itm_mfg_inst_qty.equalsIgnoreCase(name)) {
			itm_mfg_inst_qty(value);
			return;
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			mfg_st_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($itm_mfg_inst_qty.equalsIgnoreCase(name)) {
			itm_mfg_inst_qty(value);
			return;
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			mfg_st_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($itm_mfg_inst_qty.equalsIgnoreCase(name)) {
			itm_mfg_inst_qty(value);
			return;
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			mfg_st_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			can_ac_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($pack_flg.equalsIgnoreCase(name)) {
			pack_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			act_dpt_cd(value);
			return;
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			act_usr_cd(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
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
		if ($mfg_inst_lot_no.equalsIgnoreCase(name)) {
			mfg_inst_lot_no(value);
			return;
		}
		if ($mfg_inst_sublot_no.equalsIgnoreCase(name)) {
			mfg_inst_sublot_no(value);
			return;
		}
		if ($mfg_inst_sno1.equalsIgnoreCase(name)) {
			mfg_inst_sno1(value);
			return;
		}
		if ($mfg_inst_sno2.equalsIgnoreCase(name)) {
			mfg_inst_sno2(value);
			return;
		}
		if ($mfg_inst_sno3.equalsIgnoreCase(name)) {
			mfg_inst_sno3(value);
			return;
		}
		if ($mfg_inst_sno4.equalsIgnoreCase(name)) {
			mfg_inst_sno4(value);
			return;
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ(value);
			return;
		}
		if ($mfg_inst_sno1_mng_typ.equalsIgnoreCase(name)) {
			mfg_inst_sno1_mng_typ(value);
			return;
		}
		if ($mfg_inst_sno2_mng_typ.equalsIgnoreCase(name)) {
			mfg_inst_sno2_mng_typ(value);
			return;
		}
		if ($mfg_inst_sno3_mng_typ.equalsIgnoreCase(name)) {
			mfg_inst_sno3_mng_typ(value);
			return;
		}
		if ($mfg_inst_sno4_mng_typ.equalsIgnoreCase(name)) {
			mfg_inst_sno4_mng_typ(value);
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
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			pack_unit_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($itm_mfg_inst_qty.equalsIgnoreCase(name)) {
			itm_mfg_inst_qty(value);
			return;
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			mfg_st_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($itm_mfg_inst_qty.equalsIgnoreCase(name)) {
			itm_mfg_inst_qty(value);
			return;
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			mfg_st_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($itm_mfg_inst_qty.equalsIgnoreCase(name)) {
			itm_mfg_inst_qty(value);
			return;
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			mfg_st_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($itm_mfg_inst_qty.equalsIgnoreCase(name)) {
			itm_mfg_inst_qty(value);
			return;
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			mfg_st_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($itm_mfg_inst_qty.equalsIgnoreCase(name)) {
			itm_mfg_inst_qty(value);
			return;
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			mfg_st_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			can_ac_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($pack_flg.equalsIgnoreCase(name)) {
			pack_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($by_prod.equalsIgnoreCase(name)) {
			return by_prod();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($by_prod.equalsIgnoreCase(name)) {
			by_prod(
				((MCContainerMeta) by_prod_META).castInnerRow(mcframe.serverMS.dbc.MST_YIELD_ACT_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Output result No. 出来高実績ＮＯ.<p>
	 *
	 */
	public String yield_act_no() {
		return by_prod().yield_act_no();
	}

	/**
	 * Output result No. 出来高実績ＮＯ.<p>
	 *
	 */
	public void yield_act_no(String value) {
		by_prod().yield_act_no(value);
	}

	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public String mfg_act_no() {
		return by_prod().mfg_act_no();
	}

	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public void mfg_act_no(String value) {
		by_prod().mfg_act_no(value);
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return by_prod().itm_mfg_inst_no();
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		by_prod().itm_mfg_inst_no(value);
	}

	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public String oper_act_no() {
		return by_prod().oper_act_no();
	}

	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public void oper_act_no(String value) {
		by_prod().oper_act_no(value);
	}

	/**
	 * Output schedule No. 出来高予定ＮＯ.<p>
	 *
	 */
	public String yield_schd_no() {
		return by_prod().yield_schd_no();
	}

	/**
	 * Output schedule No. 出来高予定ＮＯ.<p>
	 *
	 */
	public void yield_schd_no(String value) {
		by_prod().yield_schd_no(value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public MCNumber div_seq() {
		return by_prod().div_seq();
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(MCNumber value) {
		by_prod().div_seq(value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(int value) {
		by_prod().div_seq(value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(long value) {
		by_prod().div_seq(value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(float value) {
		by_prod().div_seq(value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(double value) {
		by_prod().div_seq(value);
	}

	/**
	 * Production method type 生産方法区分.<p>
	 *
	 */
	public String mfg_mtd_typ() {
		return by_prod().mfg_mtd_typ();
	}

	/**
	 * Production method type 生産方法区分.<p>
	 *
	 */
	public void mfg_mtd_typ(String value) {
		by_prod().mfg_mtd_typ(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return by_prod().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		by_prod().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return by_prod().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		by_prod().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return by_prod().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		by_prod().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return by_prod().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		by_prod().itm_sub3(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return by_prod().trd_unit_qty();
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		by_prod().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		by_prod().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		by_prod().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		by_prod().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		by_prod().trd_unit_qty(value);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return by_prod().trd_unit_cd();
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		by_prod().trd_unit_cd(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return by_prod().base_unit_qty();
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		by_prod().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		by_prod().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		by_prod().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		by_prod().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		by_prod().base_unit_qty(value);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return by_prod().base_unit_cd();
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		by_prod().base_unit_cd(value);
	}

	/**
	 * Output type 出来高区分.<p>
	 *
	 */
	public String yield_typ() {
		return by_prod().yield_typ();
	}

	/**
	 * Output type 出来高区分.<p>
	 *
	 */
	public void yield_typ(String value) {
		by_prod().yield_typ(value);
	}

	/**
	 * Output progress 出来高進捗度.<p>
	 *
	 */
	public MCNumber yield_rate() {
		return by_prod().yield_rate();
	}

	/**
	 * Output progress 出来高進捗度.<p>
	 *
	 */
	public void yield_rate(MCNumber value) {
		by_prod().yield_rate(value);
	}

	/**
	 * Output progress 出来高進捗度.<p>
	 *
	 */
	public void yield_rate(int value) {
		by_prod().yield_rate(value);
	}

	/**
	 * Output progress 出来高進捗度.<p>
	 *
	 */
	public void yield_rate(long value) {
		by_prod().yield_rate(value);
	}

	/**
	 * Output progress 出来高進捗度.<p>
	 *
	 */
	public void yield_rate(float value) {
		by_prod().yield_rate(value);
	}

	/**
	 * Output progress 出来高進捗度.<p>
	 *
	 */
	public void yield_rate(double value) {
		by_prod().yield_rate(value);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return by_prod().lot_no();
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		by_prod().lot_no(value);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return by_prod().sublot_no();
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		by_prod().sublot_no(value);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return by_prod().sno1();
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		by_prod().sno1(value);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return by_prod().sno2();
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		by_prod().sno2(value);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return by_prod().sno3();
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		by_prod().sno3(value);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return by_prod().sno4();
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		by_prod().sno4(value);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return by_prod().quality_typ();
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		by_prod().quality_typ(value);
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public String stk_insp_typ() {
		return by_prod().stk_insp_typ();
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public void stk_insp_typ(String value) {
		by_prod().stk_insp_typ(value);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return by_prod().gd_cd();
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		by_prod().gd_cd(value);
	}

	/**
	 * Output reason cd. 出来高理由ＣＤ.<p>
	 *
	 */
	public String yield_rsn_cd() {
		return by_prod().yield_rsn_cd();
	}

	/**
	 * Output reason cd. 出来高理由ＣＤ.<p>
	 *
	 */
	public void yield_rsn_cd(String value) {
		by_prod().yield_rsn_cd(value);
	}

	/**
	 * Output location cd. 出来高場所ＣＤ.<p>
	 *
	 */
	public String yield_loc_cd() {
		return by_prod().yield_loc_cd();
	}

	/**
	 * Output location cd. 出来高場所ＣＤ.<p>
	 *
	 */
	public void yield_loc_cd(String value) {
		by_prod().yield_loc_cd(value);
	}

	/**
	 * Output rack/line cd. 出来高棚・ラインＣＤ.<p>
	 *
	 */
	public String yield_str_ln_cd() {
		return by_prod().yield_str_ln_cd();
	}

	/**
	 * Output rack/line cd. 出来高棚・ラインＣＤ.<p>
	 *
	 */
	public void yield_str_ln_cd(String value) {
		by_prod().yield_str_ln_cd(value);
	}

	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public String strg_loc_cd() {
		return by_prod().strg_loc_cd();
	}

	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public void strg_loc_cd(String value) {
		by_prod().strg_loc_cd(value);
	}

	/**
	 * Storage rack/line cd. 格納棚・ラインＣＤ.<p>
	 *
	 */
	public String strg_str_ln_cd() {
		return by_prod().strg_str_ln_cd();
	}

	/**
	 * Storage rack/line cd. 格納棚・ラインＣＤ.<p>
	 *
	 */
	public void strg_str_ln_cd(String value) {
		by_prod().strg_str_ln_cd(value);
	}

	/**
	 * Actual date and time 実績日時.<p>
	 *
	 */
	public MCDate act_tm() {
		return by_prod().act_tm();
	}

	/**
	 * Actual date and time 実績日時.<p>
	 *
	 */
	public void act_tm(MCDate value) {
		by_prod().act_tm(value);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return by_prod().ac_dt();
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		by_prod().ac_dt(value);
	}

	/**
	 * Allow backflush update バックフラッシュ更新許可.<p>
	 *
	 */
	public boolean bkf_ctl_flg() {
		return by_prod().bkf_ctl_flg();
	}

	/**
	 * Allow backflush update バックフラッシュ更新許可.<p>
	 *
	 */
	public void bkf_ctl_flg(boolean value) {
		by_prod().bkf_ctl_flg(value);
	}

	/**
	 * Allow same lot numbering 同一ロット発番許可.<p>
	 *
	 */
	public boolean lot_ctl_flg() {
		return by_prod().lot_ctl_flg();
	}

	/**
	 * Allow same lot numbering 同一ロット発番許可.<p>
	 *
	 */
	public void lot_ctl_flg(boolean value) {
		by_prod().lot_ctl_flg(value);
	}

	/**
	 * Allow same sublot numbering 同一サブロット発番許可.<p>
	 *
	 */
	public boolean sublot_ctl_flg() {
		return by_prod().sublot_ctl_flg();
	}

	/**
	 * Allow same sublot numbering 同一サブロット発番許可.<p>
	 *
	 */
	public void sublot_ctl_flg(boolean value) {
		by_prod().sublot_ctl_flg(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public MCNumber data_no() {
		return by_prod().data_no();
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(MCNumber value) {
		by_prod().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(int value) {
		by_prod().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(long value) {
		by_prod().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(float value) {
		by_prod().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(double value) {
		by_prod().data_no(value);
	}

	/**
	 * MES ID ＭＥＳＩＤ.<p>
	 *
	 */
	public String mes_id() {
		return by_prod().mes_id();
	}

	/**
	 * MES ID ＭＥＳＩＤ.<p>
	 *
	 */
	public void mes_id(String value) {
		by_prod().mes_id(value);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return by_prod().intr_rmrks();
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		by_prod().intr_rmrks(value);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return by_prod().trd_rmrks();
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		by_prod().trd_rmrks(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String yield_act_sub_char1() {
		return by_prod().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void yield_act_sub_char1(String value) {
		by_prod().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String yield_act_sub_char2() {
		return by_prod().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void yield_act_sub_char2(String value) {
		by_prod().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String yield_act_sub_char3() {
		return by_prod().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void yield_act_sub_char3(String value) {
		by_prod().sub_char3(value);
	}

	/**
	 * MES ＭＥＳ.<p>
	 *
	 */
	public boolean mes_flg() {
		return by_prod().mes_flg();
	}

	/**
	 * MES ＭＥＳ.<p>
	 *
	 */
	public void mes_flg(boolean value) {
		by_prod().mes_flg(value);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return by_prod().ext_sys_cd();
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		by_prod().ext_sys_cd(value);
	}

	/**
	 * External output result No. 外部出来高実績ＮＯ.<p>
	 *
	 */
	public String ext_yield_act_no() {
		return by_prod().ext_yield_act_no();
	}

	/**
	 * External output result No. 外部出来高実績ＮＯ.<p>
	 *
	 */
	public void ext_yield_act_no(String value) {
		by_prod().ext_yield_act_no(value);
	}

}

