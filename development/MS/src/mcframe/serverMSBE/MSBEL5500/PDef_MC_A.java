package mcframe.serverMSBE.MSBEL5500;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cn;

/**
 * [MSBEL_ShipSchdService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBEL5500.ShipSchd_Upd01.UP.BLOCK0")){
			return MS_MSBEL5500_ShipSchd_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5500.ShipSchd_Upd01.UP.BLOCK1")){
			return MS_MSBEL5500_ShipSchd_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5500.ShipSchd_Upd01.DOWN.BLOCK0")){
			return MS_MSBEL5500_ShipSchd_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5500.ShipSchd_Upd02.UP.BLOCK0")){
			return MS_MSBEL5500_ShipSchd_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5500.ShipSchd_Upd02.UP.BLOCK1")){
			return MS_MSBEL5500_ShipSchd_Upd02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5500.ShipSchd_Upd02.UP.BLOCK2")){
			return MS_MSBEL5500_ShipSchd_Upd02_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBEL5500.ShipSchd_Upd02.UP.BLOCK3")){
			return MS_MSBEL5500_ShipSchd_Upd02_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBEL5500.ShipSchd_Upd02.DOWN.BLOCK0")){
			return MS_MSBEL5500_ShipSchd_Upd02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5500.ShipSchd_Upd03.UP.BLOCK0")){
			return MS_MSBEL5500_ShipSchd_Upd03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5500.ShipSchd_Upd03.UP.BLOCK1")){
			return MS_MSBEL5500_ShipSchd_Upd03_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5500.ShipSchd_Upd04.UP.BLOCK0")){
			return MS_MSBEL5500_ShipSchd_Upd04_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5500.ShipSchd_Upd04.UP.BLOCK1")){
			return MS_MSBEL5500_ShipSchd_Upd04_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5500.ShipSchd_Upd05.UP.BLOCK0")){
			return MS_MSBEL5500_ShipSchd_Upd05_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5500.ShipSchd_Upd06.UP.BLOCK0")){
			return MS_MSBEL5500_ShipSchd_Upd06_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5500.ShipSchd_Upd07.UP.BLOCK0")){
			return MS_MSBEL5500_ShipSchd_Upd07_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5500.ShipSchd_Upd08.UP.BLOCK0")){
			return MS_MSBEL5500_ShipSchd_Upd08_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5500.ShipSchd_Chk01.UP.BLOCK0")){
			return MS_MSBEL5500_ShipSchd_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5500.ShipSchd_Chk01.DOWN.BLOCK0")){
			return MS_MSBEL5500_ShipSchd_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5500.ShipSchd_Chk02.UP.BLOCK0")){
			return MS_MSBEL5500_ShipSchd_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5500.ShipSchd_Chk02.DOWN.BLOCK0")){
			return MS_MSBEL5500_ShipSchd_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5500.ShipSchd_Chk06.UP.BLOCK0")){
			return MS_MSBEL5500_ShipSchd_Chk06_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5500.ShipSchd_Chk06.DOWN.BLOCK0")){
			return MS_MSBEL5500_ShipSchd_Chk06_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
											
	
	static final MCOperationInfo MS_MSBEL5500_ShipSchd_Upd01_INFO = new MCOperationInfo("MS", "MSBEL5500", "ShipSchd_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5500_ShipSchd_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5500", "ShipSchd_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("sp" + ".ship_pr_no", "ship_pr_no"),
				MCItemDef.create("sp" + ".trd_cd", "trd_cd"),
				MCItemDef.create("sp" + ".trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("sp" + ".slo_d_no", "slo_d_no"),
				MCItemDef.create("sp" + ".xfr_schd_no", "xfr_schd_no"),
				MCItemDef.create("sp" + ".rqst_dpt_cd", "rqst_dpt_cd"),
				MCItemDef.create("sp" + ".rqst_usr_cd", "rqst_usr_cd"),
				MCItemDef.create("sp" + ".cst_cd", "cst_cd"),
				MCItemDef.create("sp" + ".ship_rqst_tm", "ship_rqst_tm"),
				MCItemDef.create("sp" + ".dlv_rqst_tm", "dlv_rqst_tm"),
				MCItemDef.create("sp" + ".prms_dt", "prms_dt"),
				MCItemDef.create("sp" + ".prms_dlv_dt", "prms_dlv_dt"),
				MCItemDef.create("sp" + ".dlv_inst_rcpt_dt", "dlv_inst_rcpt_dt"),
				MCItemDef.create("sp" + ".dlv_inst_prms_dt", "dlv_inst_prms_dt"),
				MCItemDef.create("sp" + ".ship_to_lg_grp_cd", "ship_to_lg_grp_cd"),
				MCItemDef.create("sp" + ".dlv_id_typ", "dlv_id_typ"),
				MCItemDef.create("sp" + ".dlv_id_cd", "dlv_id_cd"),
				MCItemDef.create("sp" + ".dlv_id_nm", "dlv_id_nm"),
				MCItemDef.create("sp" + ".dlv_zip_cd", "dlv_zip_cd"),
				MCItemDef.create("sp" + ".dlv_addr1", "dlv_addr1"),
				MCItemDef.create("sp" + ".dlv_addr2", "dlv_addr2"),
				MCItemDef.create("sp" + ".dlv_addr3", "dlv_addr3"),
				MCItemDef.create("sp" + ".dlv_addr4", "dlv_addr4"),
				MCItemDef.create("sp" + ".dlv_cntct_dpt", "dlv_cntct_dpt"),
				MCItemDef.create("sp" + ".dlv_cntct_psn", "dlv_cntct_psn"),
				MCItemDef.create("sp" + ".dlv_tel", "dlv_tel"),
				MCItemDef.create("sp" + ".dlv_fax", "dlv_fax"),
				MCItemDef.create("sp" + ".dlv_sundry_flg", "dlv_sundry_flg"),
				MCItemDef.create("sp" + ".dlv_str_ln_cd", "dlv_str_ln_cd"),
				MCItemDef.create("sp" + ".ship_to_id_typ", "ship_to_id_typ"),
				MCItemDef.create("sp" + ".ship_to_id_cd", "ship_to_id_cd"),
				MCItemDef.create("sp" + ".ship_to_id_nm", "ship_to_id_nm"),
				MCItemDef.create("sp" + ".ship_to_zip_cd", "ship_to_zip_cd"),
				MCItemDef.create("sp" + ".ship_to_addr1", "ship_to_addr1"),
				MCItemDef.create("sp" + ".ship_to_addr2", "ship_to_addr2"),
				MCItemDef.create("sp" + ".ship_to_addr3", "ship_to_addr3"),
				MCItemDef.create("sp" + ".ship_to_addr4", "ship_to_addr4"),
				MCItemDef.create("sp" + ".ship_to_cntct_dpt", "ship_to_cntct_dpt"),
				MCItemDef.create("sp" + ".ship_to_cntct_psn", "ship_to_cntct_psn"),
				MCItemDef.create("sp" + ".ship_to_tel", "ship_to_tel"),
				MCItemDef.create("sp" + ".ship_to_fax", "ship_to_fax"),
				MCItemDef.create("sp" + ".ship_to_sundry_flg", "ship_to_sundry_flg"),
				MCItemDef.create("sp" + ".via_dlv_typ", "via_dlv_typ"),
				MCItemDef.create("sp" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("sp" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("sp" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("sp" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("sp" + ".prms_qty", "prms_qty"),
				MCItemDef.create("sp" + ".dlv_inst_rcpt_qty", "dlv_inst_rcpt_qty"),
				MCItemDef.create("sp" + ".dlv_inst_prms_qty", "dlv_inst_prms_qty"),
				MCItemDef.create("sp" + ".abort_flg", "abort_flg"),
				MCItemDef.create("sp" + ".rsn_cd", "rsn_cd"),
				MCItemDef.create("sp" + ".bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("sp" + ".ship_term_cd", "ship_term_cd"),
				MCItemDef.create("sp" + ".ship_inst_typ", "ship_inst_typ"),
				MCItemDef.create("sp" + ".purc_ddlv_flg", "purc_ddlv_flg"),
				MCItemDef.create("sp" + ".ship_schd_split_typ", "ship_schd_split_typ"),
				MCItemDef.create("sp" + ".alloc_scope_typ", "alloc_scope_typ"),
				MCItemDef.create("sp" + ".not_lg_mix_flg", "not_lg_mix_flg"),
				MCItemDef.create("sp" + ".alloc_typ", "alloc_typ"),
				MCItemDef.create("sp" + ".alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("sp" + ".ship_lg_grp_cd", "ship_lg_grp_cd"),
				MCItemDef.create("sp" + ".def_loc_cd", "def_loc_cd"),
				MCItemDef.create("sp" + ".loc_cd", "loc_cd"),
				MCItemDef.create("sp" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("sp" + ".period_block_flg", "period_block_flg"),
				MCItemDef.create("sp" + ".ship_cnt_rmrks", "ship_cnt_rmrks"),
				MCItemDef.create("sp" + ".io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("sp" + ".sub_char1", "sub_char1"),
				MCItemDef.create("sp" + ".sub_char2", "sub_char2"),
				MCItemDef.create("sp" + ".sub_char3", "sub_char3"),
				MCItemDef.create("ss" + ".ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("ss" + ".wg_cd", "wg_cd"),
				MCItemDef.create("ss" + ".ship_schd_tm", "ship_schd_tm"),
				MCItemDef.create("ss" + ".dlv_schd_tm", "dlv_schd_tm"),
				MCItemDef.create("ss" + ".ship_wk_cd", "ship_wk_cd"),
				MCItemDef.create("ss" + ".itm_cd", "itm_cd"),
				MCItemDef.create("ss" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("ss" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("ss" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("ss" + ".itm_nm", "itm_nm"),
				MCItemDef.create("ss" + ".iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("ss" + ".sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("ss" + ".sno1", "sno1"),
				MCItemDef.create("ss" + ".sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("ss" + ".sno2", "sno2"),
				MCItemDef.create("ss" + ".sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("ss" + ".sno3", "sno3"),
				MCItemDef.create("ss" + ".sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("ss" + ".sno4", "sno4"),
				MCItemDef.create("ss" + ".sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("ss" + ".lot_no", "lot_no"),
				MCItemDef.create("ss" + ".sublot_no", "sublot_no"),
				MCItemDef.create("ss" + ".ver_no", "ver_no"),
				MCItemDef.create("ss" + ".stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("ss" + ".gd_cd", "gd_cd"),
				MCItemDef.create("ss" + ".quality_typ", "quality_typ"),
				MCItemDef.create("ss" + ".stk_id_typ", "stk_id_typ"),
				MCItemDef.create("ss" + ".stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("ss" + ".not_dt_calc_flg", "not_dt_calc_flg"),
				MCItemDef.create("ss" + ".ship_block_flg", "ship_block_flg"),
				MCItemDef.create("ss" + ".not_lot_mix_flg", "not_lot_mix_flg"),
				MCItemDef.create("ss" + ".not_sublot_mix_flg", "not_sublot_mix_flg"),
				MCItemDef.create("ss" + ".vld_dt_fr", "vld_dt_fr"),
				MCItemDef.create("ss" + ".vld_dt_to", "vld_dt_to"),
				MCItemDef.create("ss" + ".base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("ss" + ".base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("ss" + ".base_ac_dt", "base_ac_dt"),
				MCItemDef.create("ss" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("ss" + ".trd_rmrks", "trd_rmrks"),
				MCItemDef.create("ss" + ".trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("ss" + ".sub_char1", "ship_schd_sub_char1"),
				MCItemDef.create("ss" + ".sub_char2", "ship_schd_sub_char2"),
				MCItemDef.create("ss" + ".sub_char3", "ship_schd_sub_char3"),
				MCItemDef.create("vmi_flg", "vmi_flg"),
				MCItemDef.create("iv_schd_qty_upd_flg", "iv_schd_qty_upd_flg")
			}
			,
			MCBlockDef.create("ShipPr_Dtl")
		);
	}

	public static MCContainerDef MS_MSBEL5500_ShipSchd_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5500", "ShipSchd_Upd01",
			new MCItemDef[]{
				MCItemDef.create("alloc" + ".peg_no", "peg_no"),
				MCItemDef.create("alloc" + ".itm_cd", "itm_cd"),
				MCItemDef.create("alloc" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("alloc" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("alloc" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("alloc" + ".stk_loc_cd", "stk_loc_cd"),
				MCItemDef.create("alloc" + ".stk_str_ln_cd", "stk_str_ln_cd"),
				MCItemDef.create("alloc" + ".stk_lg_grp_cd", "stk_lg_grp_cd"),
				MCItemDef.create("alloc" + ".quality_typ", "quality_typ"),
				MCItemDef.create("alloc" + ".stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("alloc" + ".stk_id_typ", "stk_id_typ"),
				MCItemDef.create("alloc" + ".stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("alloc" + ".stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("alloc" + ".gd_cd", "gd_cd"),
				MCItemDef.create("alloc" + ".lot_no", "lot_no"),
				MCItemDef.create("alloc" + ".sublot_no", "sublot_no"),
				MCItemDef.create("alloc" + ".sno1", "sno1"),
				MCItemDef.create("alloc" + ".sno2", "sno2"),
				MCItemDef.create("alloc" + ".sno3", "sno3"),
				MCItemDef.create("alloc" + ".sno4", "sno4"),
				MCItemDef.create("alloc" + ".ver_no", "ver_no"),
				MCItemDef.create("alloc" + ".pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("alloc" + ".pack_unit_qty", "pack_unit_qty"),
				MCItemDef.create("alloc" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("alloc" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("alloc" + ".vld_dt_fr", "vld_dt_fr"),
				MCItemDef.create("alloc" + ".vld_dt_to", "vld_dt_to"),
				MCItemDef.create("alloc_flg", "alloc_flg"),
				MCItemDef.create("alloc_wait_flg", "alloc_wait_flg"),
				MCItemDef.create("alloc_scope_typ", "alloc_scope_typ"),
				MCItemDef.create("ent_unit_cd", "ent_unit_cd")
			}
			,
			MCBlockDef.create("Alloc_Rslt")
		);
	}


	public static MCContainerDef MS_MSBEL5500_ShipSchd_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5500", "ShipSchd_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("sp" + ".ship_pr_no", "ship_pr_no"),
				MCItemDef.create("ss" + ".ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ss" + ".ship_schd_tm", "ship_schd_tm"),
				MCItemDef.create("ss" + ".dlv_schd_tm", "dlv_schd_tm")
			}
			,
			MCBlockDef.create("ShipPr_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5500_ShipSchd_Upd02_INFO = new MCOperationInfo("MS", "MSBEL5500", "ShipSchd_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5500_ShipSchd_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5500", "ShipSchd_Upd02",
			new MCItemDef[]{
				MCItemDef.create("lot_chk_flg", "lot_chk_flg")
			}
			,
			MCBlockDef.create("ShipSchd_Ctrl")
		);
	}

	public static MCContainerDef MS_MSBEL5500_ShipSchd_Upd02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5500", "ShipSchd_Upd02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("ss" + ".ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ss" + ".ship_pr_no", "ship_pr_no"),
				MCItemDef.create("ss" + ".ship_inst_d_no", "ship_inst_d_no"),
				MCItemDef.create("ss" + ".dlv_inst_rcpt_no", "dlv_inst_rcpt_no"),
				MCItemDef.create("ss" + ".slo_prms_no", "slo_prms_no"),
				MCItemDef.create("ss" + ".sls_act_d_no", "sls_act_d_no"),
				MCItemDef.create("ss" + ".ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("ss" + ".wg_cd", "wg_cd"),
				MCItemDef.create("ss" + ".pd_inst_dlv_tm", "pd_inst_dlv_tm"),
				MCItemDef.create("ss" + ".ship_rqst_tm", "ship_rqst_tm"),
				MCItemDef.create("ss" + ".ship_schd_tm", "ship_schd_tm"),
				MCItemDef.create("ss" + ".dlv_schd_tm", "dlv_schd_tm"),
				MCItemDef.create("ss" + ".ship_term_cd", "ship_term_cd"),
				MCItemDef.create("ss" + ".ship_wk_cd", "ship_wk_cd"),
				MCItemDef.create("ss" + ".itm_cd", "itm_cd"),
				MCItemDef.create("ss" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("ss" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("ss" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("ss" + ".itm_nm", "itm_nm"),
				MCItemDef.create("ss" + ".iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("ss" + ".sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("ss" + ".sno1", "sno1"),
				MCItemDef.create("ss" + ".sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("ss" + ".sno2", "sno2"),
				MCItemDef.create("ss" + ".sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("ss" + ".sno3", "sno3"),
				MCItemDef.create("ss" + ".sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("ss" + ".sno4", "sno4"),
				MCItemDef.create("ss" + ".sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("ss" + ".lot_no", "lot_no"),
				MCItemDef.create("ss" + ".sublot_no", "sublot_no"),
				MCItemDef.create("ss" + ".ver_no", "ver_no"),
				MCItemDef.create("ss" + ".stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("ss" + ".gd_cd", "gd_cd"),
				MCItemDef.create("ss" + ".quality_typ", "quality_typ"),
				MCItemDef.create("ss" + ".stk_id_typ", "stk_id_typ"),
				MCItemDef.create("ss" + ".stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("ss" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("ss" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("ss" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("ss" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("ss" + ".iv_schd_qty", "iv_schd_qty"),
				MCItemDef.create("ss" + ".abort_flg", "abort_flg"),
				MCItemDef.create("ss" + ".not_dt_calc_flg", "not_dt_calc_flg"),
				MCItemDef.create("ss" + ".fix_flg", "fix_flg"),
				MCItemDef.create("ss" + ".ship_block_flg", "ship_block_flg"),
				MCItemDef.create("ss" + ".inst_bndl_flg", "inst_bndl_flg"),
				MCItemDef.create("ss" + ".not_lot_mix_flg", "not_lot_mix_flg"),
				MCItemDef.create("ss" + ".not_sublot_mix_flg", "not_sublot_mix_flg"),
				MCItemDef.create("ss" + ".vld_dt_fr", "vld_dt_fr"),
				MCItemDef.create("ss" + ".vld_dt_to", "vld_dt_to"),
				MCItemDef.create("ss" + ".re_ship_schd_flg", "re_ship_schd_flg"),
				MCItemDef.create("ss" + ".base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("ss" + ".base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("ss" + ".base_ac_dt", "base_ac_dt"),
				MCItemDef.create("ss" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("ss" + ".trd_rmrks", "trd_rmrks"),
				MCItemDef.create("ss" + ".trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("ss" + ".ship_cnt_rmrks", "ship_cnt_rmrks"),
				MCItemDef.create("dlv_upd_flg", "dlv_upd_flg"),
				MCItemDef.create("ss" + ".dlv_cd", "dlv_cd"),
				MCItemDef.create("ss" + ".dlv_sundry_flg", "dlv_sundry_flg"),
				MCItemDef.create("ss" + ".dlv_nm", "dlv_nm"),
				MCItemDef.create("ss" + ".dlv_cntct_dpt", "dlv_cntct_dpt"),
				MCItemDef.create("ss" + ".dlv_cntct_psn", "dlv_cntct_psn"),
				MCItemDef.create("ss" + ".dlv_zip_cd", "dlv_zip_cd"),
				MCItemDef.create("ss" + ".dlv_addr1", "dlv_addr1"),
				MCItemDef.create("ss" + ".dlv_addr2", "dlv_addr2"),
				MCItemDef.create("ss" + ".dlv_addr3", "dlv_addr3"),
				MCItemDef.create("ss" + ".dlv_addr4", "dlv_addr4"),
				MCItemDef.create("ss" + ".dlv_tel", "dlv_tel"),
				MCItemDef.create("ss" + ".dlv_fax", "dlv_fax"),
				MCItemDef.create("ss" + ".dlv_lg_grp_cd", "dlv_lg_grp_cd"),
				MCItemDef.create("ss" + ".pri_prnt_flg", "pri_prnt_flg"),
				MCItemDef.create("ss" + ".tdlv_cd", "tdlv_cd"),
				MCItemDef.create("ss" + ".tdlv_sundry_flg", "tdlv_sundry_flg"),
				MCItemDef.create("ss" + ".tdlv_nm", "tdlv_nm"),
				MCItemDef.create("ss" + ".via_dlv_typ", "via_dlv_typ"),
				MCItemDef.create("ss" + ".tdlv_cntct_dpt", "tdlv_cntct_dpt"),
				MCItemDef.create("ss" + ".tdlv_cntct_psn", "tdlv_cntct_psn"),
				MCItemDef.create("ss" + ".tdlv_zip_cd", "tdlv_zip_cd"),
				MCItemDef.create("ss" + ".tdlv_addr1", "tdlv_addr1"),
				MCItemDef.create("ss" + ".tdlv_addr2", "tdlv_addr2"),
				MCItemDef.create("ss" + ".tdlv_addr3", "tdlv_addr3"),
				MCItemDef.create("ss" + ".tdlv_addr4", "tdlv_addr4"),
				MCItemDef.create("ss" + ".tdlv_tel", "tdlv_tel"),
				MCItemDef.create("ss" + ".tdlv_fax", "tdlv_fax"),
				MCItemDef.create("ss" + ".tdlv_lg_grp_cd", "tdlv_lg_grp_cd"),
				MCItemDef.create("ss" + ".dlv_day_week_typ", "dlv_day_week_typ"),
				MCItemDef.create("ss" + ".sub_char1", "sub_char1"),
				MCItemDef.create("ss" + ".sub_char2", "sub_char2"),
				MCItemDef.create("ss" + ".sub_char3", "sub_char3"),
				MCItemDef.create("is_src_ship_inst_flg", "is_src_ship_inst_flg"),
				MCItemDef.create("is_src_ship_schd_flg", "is_src_ship_schd_flg"),
				MCItemDef.create("is_src_sls_dlv_dt_adjst_flg", "is_src_sls_dlv_dt_adjst_flg"),
				MCItemDef.create("iv_schd_qty_upd_flg", "iv_schd_qty_upd_flg"),
				MCItemDef.create("inst_qty", "inst_qty"),
				MCItemDef.create("inst_unit_cd", "inst_unit_cd"),
				MCItemDef.create("inst_ship_schd_tm", "inst_ship_schd_tm"),
				MCItemDef.create("inst_dlv_schd_tm", "inst_dlv_schd_tm"),
				MCItemDef.create("ship_schd_split_flg", "ship_schd_split_flg"),
				MCItemDef.create("ship_judge_flg", "ship_judge_flg"),
				MCItemDef.create("cred_no_up_flg", "cred_no_up_flg"),
				MCItemDef.create("wms_flg", "wms_flg"),
				MCItemDef.create("rem_abort_flg", "rem_abort_flg")
			}
			,
			MCBlockDef.create("ShipSchd_Dtl")
		);
	}

	public static MCContainerDef MS_MSBEL5500_ShipSchd_Upd02_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL5500", "ShipSchd_Upd02",
			new MCItemDef[]{
				MCItemDef.create("alloc" + ".peg_no", "peg_no"),
				MCItemDef.create("alloc" + ".itm_cd", "itm_cd"),
				MCItemDef.create("alloc" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("alloc" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("alloc" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("alloc" + ".stk_loc_cd", "stk_loc_cd"),
				MCItemDef.create("alloc" + ".stk_str_ln_cd", "stk_str_ln_cd"),
				MCItemDef.create("alloc" + ".stk_lg_grp_cd", "stk_lg_grp_cd"),
				MCItemDef.create("alloc" + ".quality_typ", "quality_typ"),
				MCItemDef.create("alloc" + ".stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("alloc" + ".stk_id_typ", "stk_id_typ"),
				MCItemDef.create("alloc" + ".stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("alloc" + ".stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("alloc" + ".gd_cd", "gd_cd"),
				MCItemDef.create("alloc" + ".lot_no", "lot_no"),
				MCItemDef.create("alloc" + ".sublot_no", "sublot_no"),
				MCItemDef.create("alloc" + ".sno1", "sno1"),
				MCItemDef.create("alloc" + ".sno2", "sno2"),
				MCItemDef.create("alloc" + ".sno3", "sno3"),
				MCItemDef.create("alloc" + ".sno4", "sno4"),
				MCItemDef.create("alloc" + ".ver_no", "ver_no"),
				MCItemDef.create("alloc" + ".pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("alloc" + ".pack_unit_qty", "pack_unit_qty"),
				MCItemDef.create("alloc" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("alloc" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("alloc" + ".vld_dt_fr", "vld_dt_fr"),
				MCItemDef.create("alloc" + ".vld_dt_to", "vld_dt_to"),
				MCItemDef.create("alloc_flg", "alloc_flg"),
				MCItemDef.create("alloc_wait_flg", "alloc_wait_flg"),
				MCItemDef.create("alloc_scope_typ", "alloc_scope_typ"),
				MCItemDef.create("ent_unit_cd", "ent_unit_cd"),
				MCItemDef.create("wms_flg", "wms_flg")
			}
			,
			MCBlockDef.create("Alloc_Rslt")
		);
	}

	public static MCContainerDef MS_MSBEL5500_ShipSchd_Upd02_UP_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBEL5500", "ShipSchd_Upd02",
			new MCItemDef[]{
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no")
			}
			,
			MCBlockDef.create("ShipSchd_Upd02_Rdel")
		);
	}


	public static MCContainerDef MS_MSBEL5500_ShipSchd_Upd02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5500", "ShipSchd_Upd02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("ss" + ".ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ss" + ".ship_schd_tm", "ship_schd_tm"),
				MCItemDef.create("ss" + ".dlv_schd_tm", "dlv_schd_tm")
			}
			,
			MCBlockDef.create("ShipSchd_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5500_ShipSchd_Upd03_INFO = new MCOperationInfo("MS", "MSBEL5500", "ShipSchd_Upd03", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5500_ShipSchd_Upd03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5500", "ShipSchd_Upd03",
			new MCItemDef[]{
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ship_inst_d_no", "ship_inst_d_no"),
				MCItemDef.create("abort_flg", "abort_flg")
			}
			,
			MCBlockDef.create("ShipSchd_Upd03_Dtl")
		);
	}

	public static MCContainerDef MS_MSBEL5500_ShipSchd_Upd03_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5500", "ShipSchd_Upd03",
			new MCItemDef[]{
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("ship_act_d_no", "ship_act_d_no")
			}
			,
			MCBlockDef.create("ShipSchd_Upd03_ActDtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5500_ShipSchd_Upd04_INFO = new MCOperationInfo("MS", "MSBEL5500", "ShipSchd_Upd04", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5500_ShipSchd_Upd04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5500", "ShipSchd_Upd04",
			new MCItemDef[]{
				MCItemDef.create("ship_pr_no", "ship_pr_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no")
			}
			,
			MCBlockDef.create("ShipSchd_Upd04_Dtl")
		);
	}

	public static MCContainerDef MS_MSBEL5500_ShipSchd_Upd04_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5500", "ShipSchd_Upd04",
			new MCItemDef[]{
				MCItemDef.create("iv_ship_act_d_no", "iv_ship_act_d_no"),
				MCItemDef.create("ship_act_d_no", "ship_act_d_no")
			}
			,
			MCBlockDef.create("ShipSchd_Upd04_ActDtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5500_ShipSchd_Upd05_INFO = new MCOperationInfo("MS", "MSBEL5500", "ShipSchd_Upd05", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5500_ShipSchd_Upd05_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5500", "ShipSchd_Upd05",
			new MCItemDef[]{
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("ship_ret_flg", "ship_ret_flg")
			}
			,
			MCBlockDef.create("ShipSchd_Upd05_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5500_ShipSchd_Upd06_INFO = new MCOperationInfo("MS", "MSBEL5500", "ShipSchd_Upd06", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5500_ShipSchd_Upd06_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5500", "ShipSchd_Upd06",
			new MCItemDef[]{
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("alloc_rel_qty", "alloc_rel_qty")
			}
			,
			MCBlockDef.create("ShipSchd_Upd06_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5500_ShipSchd_Upd07_INFO = new MCOperationInfo("MS", "MSBEL5500", "ShipSchd_Upd07", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5500_ShipSchd_Upd07_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5500", "ShipSchd_Upd07",
			new MCItemDef[]{
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no")
			}
			,
			MCBlockDef.create("ShipSchd_Upd07_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5500_ShipSchd_Upd08_INFO = new MCOperationInfo("MS", "MSBEL5500", "ShipSchd_Upd08", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5500_ShipSchd_Upd08_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5500", "ShipSchd_Upd08",
			new MCItemDef[]{
				MCItemDef.create("ss" + ".ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ss" + ".sls_act_d_no", "sls_act_d_no")
			}
			,
			MCBlockDef.create("ShipSchd_Upd08_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5500_ShipSchd_Chk01_INFO = new MCOperationInfo("MS", "MSBEL5500", "ShipSchd_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5500_ShipSchd_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5500", "ShipSchd_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("sp" + ".ship_pr_no", "ship_pr_no"),
				MCItemDef.create("sp" + ".trd_cd", "trd_cd"),
				MCItemDef.create("sp" + ".trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("sp" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("sp" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("sp" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("sp" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("ss" + ".itm_cd", "itm_cd"),
				MCItemDef.create("ss" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("ss" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("ss" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("ss" + ".itm_nm", "itm_nm"),
				MCItemDef.create("ss" + ".iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("ss" + ".sno1", "sno1"),
				MCItemDef.create("ss" + ".sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("ss" + ".sno2", "sno2"),
				MCItemDef.create("ss" + ".sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("ss" + ".sno3", "sno3"),
				MCItemDef.create("ss" + ".sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("ss" + ".sno4", "sno4"),
				MCItemDef.create("ss" + ".sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("ss" + ".lot_no", "lot_no"),
				MCItemDef.create("ss" + ".sublot_no", "sublot_no"),
				MCItemDef.create("ss" + ".ver_no", "ver_no"),
				MCItemDef.create("ss" + ".stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("ss" + ".gd_cd", "gd_cd"),
				MCItemDef.create("ss" + ".quality_typ", "quality_typ"),
				MCItemDef.create("ss" + ".stk_id_typ", "stk_id_typ"),
				MCItemDef.create("ss" + ".stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("vmi_flg", "vmi_flg")
			}
			,
			MCBlockDef.create("ShipPr_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL5500_ShipSchd_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5500", "ShipSchd_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("ship_inst_flg", "ship_inst_flg"),
				MCItemDef.create("ship_act_flg", "ship_act_flg"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("ShipPr_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5500_ShipSchd_Chk02_INFO = new MCOperationInfo("MS", "MSBEL5500", "ShipSchd_Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5500_ShipSchd_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5500", "ShipSchd_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("ss" + ".ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ss" + ".ship_pr_no", "ship_pr_no"),
				MCItemDef.create("ss" + ".ship_schd_tm", "ship_schd_tm"),
				MCItemDef.create("ss" + ".dlv_schd_tm", "dlv_schd_tm"),
				MCItemDef.create("ss" + ".abort_flg", "abort_flg"),
				MCItemDef.create("ss" + ".base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("ss" + ".base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("ss" + ".base_ac_dt", "base_ac_dt"),
				MCItemDef.create("is_src_ship_inst_flg", "is_src_ship_inst_flg"),
				MCItemDef.create("is_src_ship_schd_flg", "is_src_ship_schd_flg"),
				MCItemDef.create("is_src_sls_dlv_dt_adjst_flg", "is_src_sls_dlv_dt_adjst_flg"),
				MCItemDef.create("iv_chk_skip_flg", "iv_chk_skip_flg"),
				MCItemDef.create("inst_ship_schd_tm", "inst_ship_schd_tm"),
				MCItemDef.create("inst_dlv_schd_tm", "inst_dlv_schd_tm")
			}
			,
			MCBlockDef.create("ShipSchd_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL5500_ShipSchd_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5500", "ShipSchd_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("ship_inst_flg", "ship_inst_flg"),
				MCItemDef.create("ship_act_flg", "ship_act_flg"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("ShipSchd_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5500_ShipSchd_Chk06_INFO = new MCOperationInfo("MS", "MSBEL5500", "ShipSchd_Chk06", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5500_ShipSchd_Chk06_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5500", "ShipSchd_Chk06",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no")
			}
			,
			MCBlockDef.create("ShipSchd_Upd06_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL5500_ShipSchd_Chk06_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5500", "ShipSchd_Chk06",
			new MCItemDef[]{
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("ShipSchd_Upd06_Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

