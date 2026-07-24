package mcframe.clientMABS.MABSP0020;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MABSP_BomReg]の入出力情報となる電文（上り・下り電文）と
 * 画面コンテナの間のデータ変換の定義を行うクラスです。
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズはできません。
 */
@SuppressWarnings({"all"})
abstract public class PDef_MC_A extends MCDef {
	public MCContainerDef getCustomDef(String id){
		if (id == null) {
			return null;
		} 
//FMCB GET_DEF START
		else if (id.equals("MA.MABSL0020.Srch01.UP.BLOCK0")){
			return MA_MABSL0020_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0020.Srch01.DOWN.BLOCK0")){
			return MA_MABSL0020_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABSL0020.Upd01.UP.BLOCK0")){
			return MA_MABSL0020_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0020.Upd01.UP.BLOCK1")){
			return MA_MABSL0020_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MA.MABSL0020.Del01.UP.BLOCK0")){
			return MA_MABSL0020_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
			
	
	static final MCOperationInfo MA_MABSL0020_Srch01_INFO = new MCOperationInfo("MA", "MABSL0020", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0020_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL0020", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("cmn_flg", "cmn_flg"),
				MCItemDef.create("wg_flg", "wg_flg"),
				MCItemDef.create("dt" + ".st_dt_fr", "st_dt_fr"),
				MCItemDef.create("dt" + ".st_dt_to", "st_dt_to"),
				MCItemDef.create("dt" + ".end_dt_fr", "end_dt_fr"),
				MCItemDef.create("dt" + ".end_dt_to", "end_dt_to"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("par_itm_p" + ".itm_cd", "par_itm_cd"),
				MCItemDef.create("par_itm_p" + ".itm_sub1", "par_itm_sub1"),
				MCItemDef.create("par_itm_p" + ".itm_sub2", "par_itm_sub2"),
				MCItemDef.create("par_itm_p" + ".itm_sub3", "par_itm_sub3"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("off_del_flg", "off_del_flg"),
				MCItemDef.create("on_del_flg", "on_del_flg")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MA_MABSL0020_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL0020", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("bom_key", "bom_key"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("par_itm_p" + ".itm_cd", "par_itm_cd"),
				MCItemDef.create("par_itm_p" + ".itm_sub1", "par_itm_sub1"),
				MCItemDef.create("par_itm_p" + ".itm_sub2", "par_itm_sub2"),
				MCItemDef.create("par_itm_p" + ".itm_sub3", "par_itm_sub3"),
				MCItemDef.create("par_itm_p" + ".itm_nm", "par_itm_nm"),
				MCItemDef.create("par_itm_typ", "par_itm_typ"),
				MCItemDef.create("par_itm_typ_nm", "par_itm_typ_nm"),
				MCItemDef.create("par_itm_typ_d_cd", "par_itm_typ_d_cd"),
				MCItemDef.create("par_itm_typ_d_nm", "par_itm_typ_d_nm"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("chd_itm_p" + ".itm_cd", "chd_itm_cd"),
				MCItemDef.create("chd_itm_p" + ".itm_sub1", "chd_itm_sub1"),
				MCItemDef.create("chd_itm_p" + ".itm_sub2", "chd_itm_sub2"),
				MCItemDef.create("chd_itm_p" + ".itm_sub3", "chd_itm_sub3"),
				MCItemDef.create("chd_itm_p" + ".itm_nm", "chd_itm_nm"),
				MCItemDef.create("par_base_unit_cd", "par_base_unit_cd"),
				MCItemDef.create("par_base_unit_nm", "par_base_unit_nm"),
				MCItemDef.create("chd_base_unit_cd", "chd_base_unit_cd"),
				MCItemDef.create("chd_base_unit_nm", "chd_base_unit_nm"),
				MCItemDef.create("chd_itm_typ", "chd_itm_typ"),
				MCItemDef.create("chd_itm_typ_nm", "chd_itm_typ_nm"),
				MCItemDef.create("chd_itm_typ_d_cd", "chd_itm_typ_d_cd"),
				MCItemDef.create("chd_itm_typ_d_nm", "chd_itm_typ_d_nm"),
				MCItemDef.create("chd_stk_mng_typ", "chd_stk_mng_typ"),
				MCItemDef.create("chd_asset_mng_typ", "chd_asset_mng_typ"),
				MCItemDef.create("par_dec_place", "par_dec_place"),
				MCItemDef.create("chd_dec_place", "chd_dec_place"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("par_sno1_mng_typ", "par_sno1_mng_typ"),
				MCItemDef.create("par_sno2_mng_typ", "par_sno2_mng_typ"),
				MCItemDef.create("par_sno3_mng_typ", "par_sno3_mng_typ"),
				MCItemDef.create("par_sno4_mng_typ", "par_sno4_mng_typ"),
				MCItemDef.create("par_def_bom_ptn", "par_def_bom_ptn"),
				MCItemDef.create("chd_sno1_mng_typ", "chd_sno1_mng_typ"),
				MCItemDef.create("chd_sno2_mng_typ", "chd_sno2_mng_typ"),
				MCItemDef.create("chd_sno3_mng_typ", "chd_sno3_mng_typ"),
				MCItemDef.create("chd_sno4_mng_typ", "chd_sno4_mng_typ"),
				MCItemDef.create("chd_def_bom_ptn", "chd_def_bom_ptn"),
				MCItemDef.create("ver_flg", "ver_flg"),
				MCItemDef.create("ver_no_p" + ".ver_no", "ver_no"),
				MCItemDef.create("ph_flg", "ph_flg"),
				MCItemDef.create("ph_bom_ptn", "ph_bom_ptn"),
				MCItemDef.create("alt_itm_flg", "alt_itm_flg"),
				MCItemDef.create("alt_grp_cd", "alt_grp_cd"),
				MCItemDef.create("alt_grp_nm", "alt_grp_nm"),
				MCItemDef.create("alt_itm_typ", "alt_itm_typ"),
				MCItemDef.create("alt_itm_typ_nm", "alt_itm_typ_nm"),
				MCItemDef.create("alt_itm_ratio", "alt_itm_ratio"),
				MCItemDef.create("alt_alloc_prio", "alt_alloc_prio"),
				MCItemDef.create("sno_typ1", "sno_typ1"),
				MCItemDef.create("sno_typ_nm1", "sno_typ_nm1"),
				MCItemDef.create("sno_typ2", "sno_typ2"),
				MCItemDef.create("sno_typ_nm2", "sno_typ_nm2"),
				MCItemDef.create("sno_typ3", "sno_typ3"),
				MCItemDef.create("sno_typ_nm3", "sno_typ_nm3"),
				MCItemDef.create("sno_typ4", "sno_typ4"),
				MCItemDef.create("sno_typ_nm4", "sno_typ_nm4"),
				MCItemDef.create("min_sno_p" + ".sno1", "min_sno1"),
				MCItemDef.create("max_sno_p" + ".sno1", "max_sno1"),
				MCItemDef.create("min_sno_p" + ".sno2", "min_sno2"),
				MCItemDef.create("max_sno_p" + ".sno2", "max_sno2"),
				MCItemDef.create("min_sno_p" + ".sno3", "min_sno3"),
				MCItemDef.create("max_sno_p" + ".sno3", "max_sno3"),
				MCItemDef.create("min_sno_p" + ".sno4", "min_sno4"),
				MCItemDef.create("max_sno_p" + ".sno4", "max_sno4"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
				MCItemDef.create("qty1_p" + ".qty", "par_inst_qty"),
				MCItemDef.create("qty2_p" + ".qty", "chd_rqmt_qty"),
				MCItemDef.create("qty3_p" + ".qty", "chd_inpt_qty"),
				MCItemDef.create("qty4_p" + ".qty", "fxd_chd_rqmt_qty"),
				MCItemDef.create("byprod_flg", "byprod_flg"),
				MCItemDef.create("in_offst_typ", "in_offst_typ"),
				MCItemDef.create("in_offst_typ_nm", "in_offst_typ_nm"),
				MCItemDef.create("in_offst", "in_offst"),
				MCItemDef.create("bkf_typ", "bkf_typ"),
				MCItemDef.create("bkf_typ_nm", "bkf_typ_nm"),
				MCItemDef.create("inst_lot_fix_flg", "inst_lot_fix_flg"),
				MCItemDef.create("lot_mix_flg", "lot_mix_flg"),
				MCItemDef.create("sublot_mix_flg", "sublot_mix_flg"),
				MCItemDef.create("alloc_ctl_typ", "alloc_ctl_typ"),
				MCItemDef.create("alloc_ctl_typ_nm", "alloc_ctl_typ_nm"),
				MCItemDef.create("main_itm_flg", "main_itm_flg"),
				MCItemDef.create("yield_calc_flg", "yield_calc_flg"),
				MCItemDef.create("inpt_ctl_typ", "inpt_ctl_typ"),
				MCItemDef.create("inpt_ctl_typ_nm", "inpt_ctl_typ_nm"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("chng_no", "chng_no"),
				MCItemDef.create("ext_sys_no_bom", "ext_sys_no_bom"),
				MCItemDef.create("not_cost_flg", "not_cost_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("del_usr_id", "del_usr_id"),
				MCItemDef.create("del_usr_nm", "del_usr_nm"),
				MCItemDef.create("del_ts", "del_ts")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL0020_Upd01_INFO = new MCOperationInfo("MA", "MABSL0020", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0020_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL0020", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("bom_key", "bom_key"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("par_itm_p" + ".itm_cd", "par_itm_cd"),
				MCItemDef.create("par_itm_p" + ".itm_sub1", "par_itm_sub1"),
				MCItemDef.create("par_itm_p" + ".itm_sub2", "par_itm_sub2"),
				MCItemDef.create("par_itm_p" + ".itm_sub3", "par_itm_sub3"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("chd_itm_p" + ".itm_cd", "chd_itm_cd"),
				MCItemDef.create("chd_itm_p" + ".itm_sub1", "chd_itm_sub1"),
				MCItemDef.create("chd_itm_p" + ".itm_sub2", "chd_itm_sub2"),
				MCItemDef.create("chd_itm_p" + ".itm_sub3", "chd_itm_sub3"),
				MCItemDef.create("ver_no_p" + ".ver_no", "ver_no"),
				MCItemDef.create("ph_flg", "ph_flg"),
				MCItemDef.create("ph_bom_ptn", "ph_bom_ptn"),
				MCItemDef.create("alt_itm_flg", "alt_itm_flg"),
				MCItemDef.create("alt_grp_cd", "alt_grp_cd"),
				MCItemDef.create("alt_itm_typ", "alt_itm_typ"),
				MCItemDef.create("alt_itm_ratio", "alt_itm_ratio"),
				MCItemDef.create("alt_alloc_prio", "alt_alloc_prio"),
				MCItemDef.create("sno_typ1", "sno_typ1"),
				MCItemDef.create("sno_typ2", "sno_typ2"),
				MCItemDef.create("sno_typ3", "sno_typ3"),
				MCItemDef.create("sno_typ4", "sno_typ4"),
				MCItemDef.create("min_sno_p" + ".sno1", "min_sno1"),
				MCItemDef.create("max_sno_p" + ".sno1", "max_sno1"),
				MCItemDef.create("min_sno_p" + ".sno2", "min_sno2"),
				MCItemDef.create("max_sno_p" + ".sno2", "max_sno2"),
				MCItemDef.create("min_sno_p" + ".sno3", "min_sno3"),
				MCItemDef.create("max_sno_p" + ".sno3", "max_sno3"),
				MCItemDef.create("min_sno_p" + ".sno4", "min_sno4"),
				MCItemDef.create("max_sno_p" + ".sno4", "max_sno4"),
				MCItemDef.create("qty1_p" + ".qty", "par_inst_qty"),
				MCItemDef.create("qty2_p" + ".qty", "chd_rqmt_qty"),
				MCItemDef.create("qty3_p" + ".qty", "chd_inpt_qty"),
				MCItemDef.create("qty4_p" + ".qty", "fxd_chd_rqmt_qty"),
				MCItemDef.create("byprod_flg", "byprod_flg"),
				MCItemDef.create("in_offst_typ", "in_offst_typ"),
				MCItemDef.create("in_offst", "in_offst"),
				MCItemDef.create("bkf_typ", "bkf_typ"),
				MCItemDef.create("inst_lot_fix_flg", "inst_lot_fix_flg"),
				MCItemDef.create("lot_mix_flg", "lot_mix_flg"),
				MCItemDef.create("sublot_mix_flg", "sublot_mix_flg"),
				MCItemDef.create("alloc_ctl_typ", "alloc_ctl_typ"),
				MCItemDef.create("main_itm_flg", "main_itm_flg"),
				MCItemDef.create("yield_calc_flg", "yield_calc_flg"),
				MCItemDef.create("inpt_ctl_typ", "inpt_ctl_typ"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("chng_no", "chng_no"),
				MCItemDef.create("ext_sys_no_bom", "ext_sys_no_bom"),
				MCItemDef.create("not_cost_flg", "not_cost_flg"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}

	public static MCContainerDef MA_MABSL0020_Upd01_UP_BLOCK1() {
		/** Ope.のBlock [Upd01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL0020", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("ope", "ope")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}
	
	static final MCOperationInfo MA_MABSL0020_Del01_INFO = new MCOperationInfo("MA", "MABSL0020", "Del01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0020_Del01_UP_BLOCK0() {
		/** Ope.のBlock [Del01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL0020", "Del01",
			new MCItemDef[]{
				MCItemDef.create("bom_key", "bom_key"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

