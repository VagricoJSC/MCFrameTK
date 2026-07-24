package mcframe.serverMSBE.MSBEL5210;

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
 * [MSBEL_XfrInstService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBEL5210.XfrInst_Chk01.UP.BLOCK0")){
			return MS_MSBEL5210_XfrInst_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5210.XfrInst_Chk01.DOWN.BLOCK0")){
			return MS_MSBEL5210_XfrInst_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5210.XfrInst_Chk02.UP.BLOCK0")){
			return MS_MSBEL5210_XfrInst_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5210.XfrInst_Chk02.DOWN.BLOCK0")){
			return MS_MSBEL5210_XfrInst_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5210.XfrInst_Chk03.UP.BLOCK0")){
			return MS_MSBEL5210_XfrInst_Chk03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5210.XfrInst_Chk03.DOWN.BLOCK0")){
			return MS_MSBEL5210_XfrInst_Chk03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5210.XfrInst_Upd02.UP.BLOCK0")){
			return MS_MSBEL5210_XfrInst_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5210.XfrInst_Upd02.UP.BLOCK1")){
			return MS_MSBEL5210_XfrInst_Upd02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5210.XfrInst_Upd02.UP.BLOCK2")){
			return MS_MSBEL5210_XfrInst_Upd02_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBEL5210.XfrInst_Upd02.DOWN.BLOCK0")){
			return MS_MSBEL5210_XfrInst_Upd02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5210.XfrInst_Upd02.DOWN.BLOCK1")){
			return MS_MSBEL5210_XfrInst_Upd02_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5210.XfrInst_Ins02.UP.BLOCK0")){
			return MS_MSBEL5210_XfrInst_Ins02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5210.XfrInst_Ins02.UP.BLOCK1")){
			return MS_MSBEL5210_XfrInst_Ins02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5210.XfrInst_Ins02.UP.BLOCK2")){
			return MS_MSBEL5210_XfrInst_Ins02_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBEL5210.XfrInst_Ins02.DOWN.BLOCK0")){
			return MS_MSBEL5210_XfrInst_Ins02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5210.XfrInst_Ins02.DOWN.BLOCK1")){
			return MS_MSBEL5210_XfrInst_Ins02_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5210.XfrInst_Del02.UP.BLOCK0")){
			return MS_MSBEL5210_XfrInst_Del02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5210.XfrInst_Del02.UP.BLOCK1")){
			return MS_MSBEL5210_XfrInst_Del02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5210.XfrInst_Del02.UP.BLOCK2")){
			return MS_MSBEL5210_XfrInst_Del02_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBEL5210.XfrInst_Upd01.UP.BLOCK0")){
			return MS_MSBEL5210_XfrInst_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5210.XfrInst_Upd01.UP.BLOCK1")){
			return MS_MSBEL5210_XfrInst_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5210.XfrInst_Upd01.DOWN.BLOCK0")){
			return MS_MSBEL5210_XfrInst_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5210.XfrInst_Ins01.UP.BLOCK0")){
			return MS_MSBEL5210_XfrInst_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5210.XfrInst_Ins01.UP.BLOCK1")){
			return MS_MSBEL5210_XfrInst_Ins01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5210.XfrInst_Ins01.DOWN.BLOCK0")){
			return MS_MSBEL5210_XfrInst_Ins01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5210.XfrInst_Del01.UP.BLOCK0")){
			return MS_MSBEL5210_XfrInst_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5210.XfrInst_Del01.UP.BLOCK1")){
			return MS_MSBEL5210_XfrInst_Del01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5210.XfrInst_Del01.DOWN.BLOCK0")){
			return MS_MSBEL5210_XfrInst_Del01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
									
	
	static final MCOperationInfo MS_MSBEL5210_XfrInst_Chk01_INFO = new MCOperationInfo("MS", "MSBEL5210", "XfrInst_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5210_XfrInst_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5210", "XfrInst_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("xfr_alloc_sts_no", "xfr_alloc_sts_no"),
				MCItemDef.create("pr_sts_typ", "pr_sts_typ"),
				MCItemDef.create("xfr_schd_no", "xfr_schd_no"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("gi_str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("gi_stk_arrv_bp_cd", "gi_stk_arrv_bp_cd"),
				MCItemDef.create("gr_loc_cd", "gr_loc_cd"),
				MCItemDef.create("gr_str_ln_cd", "gr_str_ln_cd"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("alloc_sno1", "alloc_sno1"),
				MCItemDef.create("alloc_sno2", "alloc_sno2"),
				MCItemDef.create("alloc_sno3", "alloc_sno3"),
				MCItemDef.create("alloc_sno4", "alloc_sno4"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("xfr_schd_dt", "xfr_schd_dt"),
				MCItemDef.create("alloc_flg", "alloc_flg"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("not_lot_mix_flg", "not_lot_mix_flg"),
				MCItemDef.create("not_sublot_mix_flg", "not_sublot_mix_flg"),
				MCItemDef.create("vld_dt_fr", "vld_dt_fr"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("prov_basis_typ", "prov_basis_typ"),
				MCItemDef.create("ret_prov_typ", "ret_prov_typ"),
				MCItemDef.create("ret_prov_basis_typ", "ret_prov_basis_typ"),
				MCItemDef.create("base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("base_ac_dt", "base_ac_dt"),
				MCItemDef.create("immd_dlv_prnt_flg", "immd_dlv_prnt_flg"),
				MCItemDef.create("old_xfr_alloc_sts_no", "old_xfr_alloc_sts_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("inst_rem_abort_flg", "inst_rem_abort_flg"),
				MCItemDef.create("skip_chk_ship_flg", "skip_chk_ship_flg")
			}
			,
			MCBlockDef.create("XfrInstChk_HdrDtl")
		);
	}


	public static MCContainerDef MS_MSBEL5210_XfrInst_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5210", "XfrInst_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("XfrInstChk_HdrDtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5210_XfrInst_Chk02_INFO = new MCOperationInfo("MS", "MSBEL5210", "XfrInst_Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5210_XfrInst_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5210", "XfrInst_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("xfr_alloc_sts_no", "xfr_alloc_sts_no"),
				MCItemDef.create("pr_sts_typ", "pr_sts_typ"),
				MCItemDef.create("xfr_schd_no", "xfr_schd_no"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("gi_str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("gi_stk_arrv_bp_cd", "gi_stk_arrv_bp_cd"),
				MCItemDef.create("gr_loc_cd", "gr_loc_cd"),
				MCItemDef.create("gr_str_ln_cd", "gr_str_ln_cd"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("alloc_sno1", "alloc_sno1"),
				MCItemDef.create("alloc_sno2", "alloc_sno2"),
				MCItemDef.create("alloc_sno3", "alloc_sno3"),
				MCItemDef.create("alloc_sno4", "alloc_sno4"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("xfr_schd_dt", "xfr_schd_dt"),
				MCItemDef.create("alloc_flg", "alloc_flg"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("not_lot_mix_flg", "not_lot_mix_flg"),
				MCItemDef.create("not_sublot_mix_flg", "not_sublot_mix_flg"),
				MCItemDef.create("vld_dt_fr", "vld_dt_fr"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("prov_basis_typ", "prov_basis_typ"),
				MCItemDef.create("ret_prov_typ", "ret_prov_typ"),
				MCItemDef.create("ret_prov_basis_typ", "ret_prov_basis_typ"),
				MCItemDef.create("base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("base_ac_dt", "base_ac_dt"),
				MCItemDef.create("immd_dlv_prnt_flg", "immd_dlv_prnt_flg"),
				MCItemDef.create("old_xfr_alloc_sts_no", "old_xfr_alloc_sts_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("inst_rem_abort_flg", "inst_rem_abort_flg"),
				MCItemDef.create("skip_chk_ship_flg", "skip_chk_ship_flg"),
				MCItemDef.create("xfr_inst_d_no", "xfr_inst_d_no"),
				MCItemDef.create("wms_flg", "wms_flg")
			}
			,
			MCBlockDef.create("XfrInstChk_HdrDtl")
		);
	}


	public static MCContainerDef MS_MSBEL5210_XfrInst_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5210", "XfrInst_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("XfrInstChk_HdrDtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5210_XfrInst_Chk03_INFO = new MCOperationInfo("MS", "MSBEL5210", "XfrInst_Chk03", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5210_XfrInst_Chk03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5210", "XfrInst_Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("xfr_inst_no", "xfr_inst_no"),
				MCItemDef.create("wms_flg", "wms_flg")
			}
			,
			MCBlockDef.create("XfrInstChk_HdrDtl")
		);
	}


	public static MCContainerDef MS_MSBEL5210_XfrInst_Chk03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5210", "XfrInst_Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("XfrInstChk_HdrDtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5210_XfrInst_Upd02_INFO = new MCOperationInfo("MS", "MSBEL5210", "XfrInst_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5210_XfrInst_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5210", "XfrInst_Upd02",
			new MCItemDef[]{
				MCItemDef.create("xih" + ".xfr_inst_no", "xfr_inst_no"),
				MCItemDef.create("xih" + ".trd_cd", "trd_cd"),
				MCItemDef.create("xih" + ".trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("xih" + ".wg_cd", "wg_cd"),
				MCItemDef.create("xih" + ".lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("xih" + ".gr_loc_cd", "gr_loc_cd"),
				MCItemDef.create("xih" + ".gr_stk_arrv_bp_cd", "gr_stk_arrv_bp_cd"),
				MCItemDef.create("xih" + ".xfr_schd_dt", "xfr_schd_dt"),
				MCItemDef.create("xih" + ".xfr_inst_dt", "xfr_inst_dt"),
				MCItemDef.create("xih" + ".inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("xih" + ".inst_dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("xih" + ".trd_rmrks", "trd_rmrks"),
				MCItemDef.create("xih" + ".inst_rmrks", "inst_rmrks"),
				MCItemDef.create("xih" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("xih" + ".sub_char1", "sub_char1"),
				MCItemDef.create("xih" + ".sub_char2", "sub_char2"),
				MCItemDef.create("xih" + ".sub_char3", "sub_char3"),
				MCItemDef.create("immd_inst_prnt_flg", "immd_inst_prnt_flg"),
				MCItemDef.create("immd_pick_prnt_flg", "immd_pick_prnt_flg"),
				MCItemDef.create("immd_dlv_prnt_flg", "immd_dlv_prnt_flg"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("ret_sppl_cd", "ret_sppl_cd")
			}
			,
			MCBlockDef.create("XfrInst_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL5210_XfrInst_Upd02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5210", "XfrInst_Upd02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("xid" + ".xfr_inst_d_no", "xfr_inst_d_no"),
				MCItemDef.create("xid" + ".xfr_inst_no", "xfr_inst_no"),
				MCItemDef.create("xid" + ".itm_cd", "itm_cd"),
				MCItemDef.create("xid" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("xid" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("xid" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("xid" + ".base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("xid" + ".base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("xid" + ".base_ac_dt", "base_ac_dt"),
				MCItemDef.create("xas" + ".pr_sts_typ", "pr_sts_typ"),
				MCItemDef.create("xas" + ".gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("xas" + ".gi_str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("xas" + ".gi_stk_arrv_bp_cd", "gi_stk_arrv_bp_cd"),
				MCItemDef.create("xas" + ".gr_str_ln_cd", "gr_str_ln_cd"),
				MCItemDef.create("xas" + ".lot_no", "lot_no"),
				MCItemDef.create("xas" + ".sublot_no", "sublot_no"),
				MCItemDef.create("xas" + ".sno1", "sno1"),
				MCItemDef.create("xas" + ".sno2", "sno2"),
				MCItemDef.create("xas" + ".sno3", "sno3"),
				MCItemDef.create("xas" + ".sno4", "sno4"),
				MCItemDef.create("xas" + ".ver_no", "ver_no"),
				MCItemDef.create("xas" + ".gd_cd", "gd_cd"),
				MCItemDef.create("xas" + ".quality_typ", "quality_typ"),
				MCItemDef.create("xas" + ".stk_id_typ", "stk_id_typ"),
				MCItemDef.create("xas" + ".stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("xas" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("xas" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("xas" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("xas" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("xas" + ".rsn_cd", "rsn_cd"),
				MCItemDef.create("xas" + ".bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("xas" + ".abort_flg", "abort_flg"),
				MCItemDef.create("xas" + ".not_lot_mix_flg", "not_lot_mix_flg"),
				MCItemDef.create("xas" + ".not_sublot_mix_flg", "not_sublot_mix_flg"),
				MCItemDef.create("xas" + ".vld_dt_fr", "vld_dt_fr"),
				MCItemDef.create("xas" + ".vld_dt_to", "vld_dt_to"),
				MCItemDef.create("xas" + ".io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("xas" + ".sub_char1", "sub_char1"),
				MCItemDef.create("xas" + ".sub_char2", "sub_char2"),
				MCItemDef.create("xas" + ".sub_char3", "sub_char3"),
				MCItemDef.create("xas" + ".sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("xas" + ".sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("xas" + ".sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("xas" + ".sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("xas" + ".alloc_sno1", "alloc_sno1"),
				MCItemDef.create("xas" + ".alloc_sno2", "alloc_sno2"),
				MCItemDef.create("xas" + ".alloc_sno3", "alloc_sno3"),
				MCItemDef.create("xas" + ".alloc_sno4", "alloc_sno4"),
				MCItemDef.create("xas" + ".alloc_flg", "alloc_flg"),
				MCItemDef.create("xas" + ".ship_inst_typ", "ship_inst_typ"),
				MCItemDef.create("xas" + ".inst_bndl_flg", "inst_bndl_flg"),
				MCItemDef.create("xas" + ".dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("xas" + ".dlv_slip_seq", "dlv_slip_seq"),
				MCItemDef.create("xas" + ".dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("xas" + ".disp_seq", "disp_seq"),
				MCItemDef.create("xas" + ".xfr_schd_no", "xfr_schd_no"),
				MCItemDef.create("xas" + ".prov_typ", "prov_typ"),
				MCItemDef.create("xas" + ".ret_prov_typ", "ret_prov_typ"),
				MCItemDef.create("xas" + ".trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("xas" + ".inst_d_rmrks", "inst_d_rmrks"),
				MCItemDef.create("xas" + ".intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("xas" + ".wms_flg", "wms_flg"),
				MCItemDef.create("cont_qty", "cont_qty"),
				MCItemDef.create("inst_bndl_src_flg", "inst_bndl_src_flg"),
				MCItemDef.create("inst_bndl_peg_no", "inst_bndl_peg_no"),
				MCItemDef.create("inst_bndl_to_peg_no", "inst_bndl_to_peg_no"),
				MCItemDef.create("xfr_alloc_sts_no", "xfr_alloc_sts_no"),
				MCItemDef.create("old_xfr_alloc_sts_no", "old_xfr_alloc_sts_no"),
				MCItemDef.create("prov_schd_no", "prov_schd_no"),
				MCItemDef.create("ret_prov_schd_no", "ret_prov_schd_no")
			}
			,
			MCBlockDef.create("XfrInst_Dtl")
		);
	}

	public static MCContainerDef MS_MSBEL5210_XfrInst_Upd02_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL5210", "XfrInst_Upd02",
			new MCItemDef[]{
				MCItemDef.create("bndl_prnt_flg", "bndl_prnt_flg")
			}
			,
			MCBlockDef.create("XfrInst_Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL5210_XfrInst_Upd02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5210", "XfrInst_Upd02",
			new MCItemDef[]{
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("xih" + ".gr_stk_arrv_bp_cd", "gr_stk_arrv_bp_cd")
			}
			,
			MCBlockDef.create("XfrInst_Hdr")
		);
	}
	public static MCContainerDef MS_MSBEL5210_XfrInst_Upd02_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5210", "XfrInst_Upd02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("xid" + ".xfr_inst_d_no", "xfr_inst_d_no"),
				MCItemDef.create("xas" + ".io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("xas" + ".dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("xas" + ".dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("xas" + ".xfr_schd_no", "xfr_schd_no"),
				MCItemDef.create("xfr_alloc_sts_no", "xfr_alloc_sts_no"),
				MCItemDef.create("old_xfr_alloc_sts_no", "old_xfr_alloc_sts_no")
			}
			,
			MCBlockDef.create("XfrInst_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5210_XfrInst_Ins02_INFO = new MCOperationInfo("MS", "MSBEL5210", "XfrInst_Ins02", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5210_XfrInst_Ins02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5210", "XfrInst_Ins02",
			new MCItemDef[]{
				MCItemDef.create("xih" + ".trd_cd", "trd_cd"),
				MCItemDef.create("xih" + ".trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("xih" + ".wg_cd", "wg_cd"),
				MCItemDef.create("xih" + ".lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("xih" + ".gr_loc_cd", "gr_loc_cd"),
				MCItemDef.create("xih" + ".gr_stk_arrv_bp_cd", "gr_stk_arrv_bp_cd"),
				MCItemDef.create("xih" + ".xfr_schd_dt", "xfr_schd_dt"),
				MCItemDef.create("xih" + ".xfr_inst_dt", "xfr_inst_dt"),
				MCItemDef.create("xih" + ".inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("xih" + ".inst_dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("xih" + ".trd_rmrks", "trd_rmrks"),
				MCItemDef.create("xih" + ".inst_rmrks", "inst_rmrks"),
				MCItemDef.create("xih" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("xih" + ".sub_char1", "sub_char1"),
				MCItemDef.create("xih" + ".sub_char2", "sub_char2"),
				MCItemDef.create("xih" + ".sub_char3", "sub_char3"),
				MCItemDef.create("immd_inst_prnt_flg", "immd_inst_prnt_flg"),
				MCItemDef.create("immd_pick_prnt_flg", "immd_pick_prnt_flg"),
				MCItemDef.create("immd_dlv_prnt_flg", "immd_dlv_prnt_flg"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("ret_sppl_cd", "ret_sppl_cd")
			}
			,
			MCBlockDef.create("XfrInst_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL5210_XfrInst_Ins02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5210", "XfrInst_Ins02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("xid" + ".itm_cd", "itm_cd"),
				MCItemDef.create("xid" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("xid" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("xid" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("xid" + ".base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("xid" + ".base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("xid" + ".base_ac_dt", "base_ac_dt"),
				MCItemDef.create("xas" + ".pr_sts_typ", "pr_sts_typ"),
				MCItemDef.create("xas" + ".gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("xas" + ".gi_str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("xas" + ".gi_stk_arrv_bp_cd", "gi_stk_arrv_bp_cd"),
				MCItemDef.create("xas" + ".gr_str_ln_cd", "gr_str_ln_cd"),
				MCItemDef.create("xas" + ".lot_no", "lot_no"),
				MCItemDef.create("xas" + ".sublot_no", "sublot_no"),
				MCItemDef.create("xas" + ".sno1", "sno1"),
				MCItemDef.create("xas" + ".sno2", "sno2"),
				MCItemDef.create("xas" + ".sno3", "sno3"),
				MCItemDef.create("xas" + ".sno4", "sno4"),
				MCItemDef.create("xas" + ".ver_no", "ver_no"),
				MCItemDef.create("xas" + ".gd_cd", "gd_cd"),
				MCItemDef.create("xas" + ".quality_typ", "quality_typ"),
				MCItemDef.create("xas" + ".stk_id_typ", "stk_id_typ"),
				MCItemDef.create("xas" + ".stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("xas" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("xas" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("xas" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("xas" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("xas" + ".rsn_cd", "rsn_cd"),
				MCItemDef.create("xas" + ".bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("xas" + ".abort_flg", "abort_flg"),
				MCItemDef.create("xas" + ".not_lot_mix_flg", "not_lot_mix_flg"),
				MCItemDef.create("xas" + ".not_sublot_mix_flg", "not_sublot_mix_flg"),
				MCItemDef.create("xas" + ".vld_dt_fr", "vld_dt_fr"),
				MCItemDef.create("xas" + ".vld_dt_to", "vld_dt_to"),
				MCItemDef.create("xas" + ".io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("xas" + ".sub_char1", "sub_char1"),
				MCItemDef.create("xas" + ".sub_char2", "sub_char2"),
				MCItemDef.create("xas" + ".sub_char3", "sub_char3"),
				MCItemDef.create("xas" + ".sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("xas" + ".sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("xas" + ".sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("xas" + ".sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("xas" + ".alloc_sno1", "alloc_sno1"),
				MCItemDef.create("xas" + ".alloc_sno2", "alloc_sno2"),
				MCItemDef.create("xas" + ".alloc_sno3", "alloc_sno3"),
				MCItemDef.create("xas" + ".alloc_sno4", "alloc_sno4"),
				MCItemDef.create("xas" + ".alloc_flg", "alloc_flg"),
				MCItemDef.create("xas" + ".ship_inst_typ", "ship_inst_typ"),
				MCItemDef.create("xas" + ".inst_bndl_flg", "inst_bndl_flg"),
				MCItemDef.create("xas" + ".dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("xas" + ".dlv_slip_seq", "dlv_slip_seq"),
				MCItemDef.create("xas" + ".dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("xas" + ".disp_seq", "disp_seq"),
				MCItemDef.create("xas" + ".xfr_schd_no", "xfr_schd_no"),
				MCItemDef.create("xas" + ".prov_typ", "prov_typ"),
				MCItemDef.create("xas" + ".ret_prov_typ", "ret_prov_typ"),
				MCItemDef.create("xas" + ".trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("xas" + ".inst_d_rmrks", "inst_d_rmrks"),
				MCItemDef.create("xas" + ".intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("cont_qty", "cont_qty"),
				MCItemDef.create("inst_bndl_src_flg", "inst_bndl_src_flg"),
				MCItemDef.create("inst_bndl_peg_no", "inst_bndl_peg_no"),
				MCItemDef.create("inst_bndl_to_peg_no", "inst_bndl_to_peg_no"),
				MCItemDef.create("xfr_alloc_sts_no", "xfr_alloc_sts_no"),
				MCItemDef.create("old_xfr_alloc_sts_no", "old_xfr_alloc_sts_no"),
				MCItemDef.create("prov_schd_no", "prov_schd_no"),
				MCItemDef.create("ret_prov_schd_no", "ret_prov_schd_no")
			}
			,
			MCBlockDef.create("XfrInst_Dtl")
		);
	}

	public static MCContainerDef MS_MSBEL5210_XfrInst_Ins02_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL5210", "XfrInst_Ins02",
			new MCItemDef[]{
				MCItemDef.create("bndl_prnt_flg", "bndl_prnt_flg")
			}
			,
			MCBlockDef.create("XfrInst_Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL5210_XfrInst_Ins02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5210", "XfrInst_Ins02",
			new MCItemDef[]{
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("xih" + ".xfr_inst_no", "xfr_inst_no"),
				MCItemDef.create("xih" + ".gr_stk_arrv_bp_cd", "gr_stk_arrv_bp_cd")
			}
			,
			MCBlockDef.create("XfrInst_Hdr")
		);
	}
	public static MCContainerDef MS_MSBEL5210_XfrInst_Ins02_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5210", "XfrInst_Ins02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("xid" + ".xfr_inst_d_no", "xfr_inst_d_no"),
				MCItemDef.create("xid" + ".xfr_inst_no", "xfr_inst_no"),
				MCItemDef.create("xas" + ".pr_sts_typ", "pr_sts_typ"),
				MCItemDef.create("xas" + ".io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("xas" + ".dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("xas" + ".dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("xas" + ".xfr_schd_no", "xfr_schd_no"),
				MCItemDef.create("xas" + ".prov_typ", "prov_typ"),
				MCItemDef.create("xas" + ".ret_prov_typ", "ret_prov_typ"),
				MCItemDef.create("xfr_alloc_sts_no", "xfr_alloc_sts_no"),
				MCItemDef.create("old_xfr_alloc_sts_no", "old_xfr_alloc_sts_no"),
				MCItemDef.create("prov_schd_no", "prov_schd_no"),
				MCItemDef.create("ret_prov_schd_no", "ret_prov_schd_no")
			}
			,
			MCBlockDef.create("XfrInst_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5210_XfrInst_Del02_INFO = new MCOperationInfo("MS", "MSBEL5210", "XfrInst_Del02", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5210_XfrInst_Del02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5210", "XfrInst_Del02",
			new MCItemDef[]{
				MCItemDef.create("xih" + ".xfr_inst_no", "xfr_inst_no"),
				MCItemDef.create("immd_dlv_prnt_flg", "immd_dlv_prnt_flg")
			}
			,
			MCBlockDef.create("XfrInst_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL5210_XfrInst_Del02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5210", "XfrInst_Del02",
			new MCItemDef[]{
				MCItemDef.create("xas" + ".wms_flg", "wms_flg"),
				MCItemDef.create("xfr_alloc_sts_no", "xfr_alloc_sts_no")
			}
			,
			MCBlockDef.create("XfrInst_Dtl")
		);
	}

	public static MCContainerDef MS_MSBEL5210_XfrInst_Del02_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL5210", "XfrInst_Del02",
			new MCItemDef[]{
				MCItemDef.create("bndl_prnt_flg", "bndl_prnt_flg")
			}
			,
			MCBlockDef.create("XfrInst_Cnd")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5210_XfrInst_Upd01_INFO = new MCOperationInfo("MS", "MSBEL5210", "XfrInst_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5210_XfrInst_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5210", "XfrInst_Upd01",
			new MCItemDef[]{
				MCItemDef.create("hdr" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.$xfr_inst_no + "", "xfr_inst_no"),
				MCItemDef.create("hdr" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.$trd_cd + "", "trd_cd"),
				MCItemDef.create("hdr" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.$trd_ptn_typ + "", "trd_ptn_typ"),
				MCItemDef.create("hdr" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.$wg_cd + "", "wg_cd"),
				MCItemDef.create("hdr" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.$lg_grp_cd + "", "lg_grp_cd"),
				MCItemDef.create("hdr" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.$gr_loc_cd + "", "gr_loc_cd"),
				MCItemDef.create("hdr" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.$gr_stk_arrv_bp_cd + "", "gr_stk_arrv_bp_cd"),
				MCItemDef.create("hdr" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.$xfr_schd_dt + "", "xfr_schd_dt"),
				MCItemDef.create("hdr" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.$xfr_inst_dt + "", "xfr_inst_dt"),
				MCItemDef.create("hdr" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.$inst_usr_cd + "", "inst_usr_cd"),
				MCItemDef.create("hdr" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.$inst_dpt_cd + "", "inst_dpt_cd"),
				MCItemDef.create("hdr" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.$trd_rmrks + "", "trd_rmrks"),
				MCItemDef.create("hdr" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.$inst_rmrks + "", "inst_rmrks"),
				MCItemDef.create("hdr" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.$intr_rmrks + "", "intr_rmrks"),
				MCItemDef.create("hdr" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.$sub_char1 + "", "sub_char1"),
				MCItemDef.create("hdr" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.$sub_char2 + "", "sub_char2"),
				MCItemDef.create("hdr" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.$sub_char3 + "", "sub_char3"),
				MCItemDef.create("hdr" + ".immd_inst_prnt_flg", "immd_inst_prnt_flg"),
				MCItemDef.create("hdr" + ".immd_pick_prnt_flg", "immd_pick_prnt_flg"),
				MCItemDef.create("hdr" + ".immd_dlv_prnt_flg", "immd_dlv_prnt_flg"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("dtl" + ".peg_no", "peg_no"),
				MCItemDef.create("dtl" + ".hdr_peg_no", "dtl_hdr_peg_no"),
				MCItemDef.create("dtl" + ".data_crud_typ", "data_crud_typ"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$xfr_inst_d_no + "", "xfr_inst_d_no"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$xfr_inst_no + "", "dtl_xfr_inst_no"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$itm_cd + "", "itm_cd"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$itm_sub1 + "", "itm_sub1"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$itm_sub2 + "", "itm_sub2"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$itm_sub3 + "", "itm_sub3"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$base_dlv_slip_no + "", "base_dlv_slip_no"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$base_prov_act_no + "", "base_prov_act_no"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$base_ac_dt + "", "base_ac_dt"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$pr_sts_typ + "", "pr_sts_typ"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$gi_loc_cd + "", "gi_loc_cd"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$gi_str_ln_cd + "", "gi_str_ln_cd"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$gi_stk_arrv_bp_cd + "", "gi_stk_arrv_bp_cd"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$gr_str_ln_cd + "", "gr_str_ln_cd"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$lot_no + "", "lot_no"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$sublot_no + "", "sublot_no"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$sno1 + "", "sno1"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$sno2 + "", "sno2"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$sno3 + "", "sno3"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$sno4 + "", "sno4"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$ver_no + "", "ver_no"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$gd_cd + "", "gd_cd"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$quality_typ + "", "quality_typ"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$stk_id_typ + "", "stk_id_typ"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$stk_bp_cd + "", "stk_bp_cd"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$trd_unit_cd + "", "trd_unit_cd"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$trd_unit_qty + "", "trd_unit_qty"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$base_unit_cd + "", "base_unit_cd"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$base_unit_qty + "", "base_unit_qty"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$rsn_cd + "", "rsn_cd"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$bd_dpt_cd + "", "bd_dpt_cd"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$abort_flg + "", "abort_flg"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$not_lot_mix_flg + "", "not_lot_mix_flg"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$not_sublot_mix_flg + "", "not_sublot_mix_flg"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$vld_dt_fr + "", "vld_dt_fr"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$vld_dt_to + "", "vld_dt_to"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$io_schd_pr_no + "", "io_schd_pr_no"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$sub_char1 + "", "dtl_sub_char1"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$sub_char2 + "", "dtl_sub_char2"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$sub_char3 + "", "dtl_sub_char3"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$sno1_null_flg + "", "sno1_null_flg"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$sno2_null_flg + "", "sno2_null_flg"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$sno3_null_flg + "", "sno3_null_flg"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$sno4_null_flg + "", "sno4_null_flg"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$alloc_sno1 + "", "alloc_sno1"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$alloc_sno2 + "", "alloc_sno2"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$alloc_sno3 + "", "alloc_sno3"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$alloc_sno4 + "", "alloc_sno4"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$alloc_flg + "", "alloc_flg"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$ship_inst_typ + "", "ship_inst_typ"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$inst_bndl_flg + "", "inst_bndl_flg"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$dlv_slip_no + "", "dlv_slip_no"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$dlv_slip_seq + "", "dlv_slip_seq"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$dlv_slip_d_no + "", "dlv_slip_d_no"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$disp_seq + "", "disp_seq"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$xfr_schd_no + "", "xfr_schd_no"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$prov_typ + "", "prov_typ"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$ret_prov_typ + "", "ret_prov_typ"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$trd_d_rmrks + "", "trd_d_rmrks"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$inst_d_rmrks + "", "inst_d_rmrks"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$intr_d_rmrks + "", "intr_d_rmrks"),
				MCItemDef.create("dtl" + ".cont_qty", "cont_qty"),
				MCItemDef.create("dtl" + ".inst_bndl_src_flg", "inst_bndl_src_flg"),
				MCItemDef.create("dtl" + ".inst_bndl_peg_no", "inst_bndl_peg_no"),
				MCItemDef.create("dtl" + ".inst_bndl_to_peg_no", "inst_bndl_to_peg_no"),
				MCItemDef.create("dtl" + ".xfr_alloc_sts_no", "xfr_alloc_sts_no"),
				MCItemDef.create("dtl" + ".old_xfr_alloc_sts_no", "old_xfr_alloc_sts_no"),
				MCItemDef.create("dtl" + ".prov_schd_no", "prov_schd_no"),
				MCItemDef.create("dtl" + ".ret_prov_schd_no", "ret_prov_schd_no"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$wms_flg + "", "wms_flg")
			}
			,
			MCBlockDef.create("XfrInst_HdrDtl")
		);
	}

	public static MCContainerDef MS_MSBEL5210_XfrInst_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5210", "XfrInst_Upd01",
			new MCItemDef[]{
				MCItemDef.create("bndl_inst_prnt_flg", "bndl_inst_prnt_flg"),
				MCItemDef.create("bndl_prnt_flg", "bndl_prnt_flg")
			}
			,
			MCBlockDef.create("XfrInst_AggCnd")
		);
	}


	public static MCContainerDef MS_MSBEL5210_XfrInst_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5210", "XfrInst_Upd01",
			new MCItemDef[]{
				MCItemDef.create("hdr" + ".err_flg", "err_flg"),
				MCItemDef.create("dtl" + ".peg_no", "peg_no"),
				MCItemDef.create("dtl" + ".hdr_peg_no", "dtl_hdr_peg_no"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$xfr_inst_d_no + "", "xfr_inst_d_no"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$io_schd_pr_no + "", "io_schd_pr_no"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$dlv_slip_no + "", "dlv_slip_no"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$dlv_slip_d_no + "", "dlv_slip_d_no"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$xfr_schd_no + "", "xfr_schd_no"),
				MCItemDef.create("dtl" + ".xfr_alloc_sts_no", "xfr_alloc_sts_no"),
				MCItemDef.create("dtl" + ".old_xfr_alloc_sts_no", "old_xfr_alloc_sts_no"),
				MCItemDef.create("dtl" + ".prov_schd_no", "prov_schd_no"),
				MCItemDef.create("dtl" + ".ret_prov_schd_no", "ret_prov_schd_no")
			}
			,
			MCBlockDef.create("XfrInst_HdrDtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5210_XfrInst_Ins01_INFO = new MCOperationInfo("MS", "MSBEL5210", "XfrInst_Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5210_XfrInst_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5210", "XfrInst_Ins01",
			new MCItemDef[]{
				MCItemDef.create("hdr" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.$trd_cd + "", "trd_cd"),
				MCItemDef.create("hdr" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.$trd_ptn_typ + "", "trd_ptn_typ"),
				MCItemDef.create("hdr" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.$wg_cd + "", "wg_cd"),
				MCItemDef.create("hdr" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.$lg_grp_cd + "", "lg_grp_cd"),
				MCItemDef.create("hdr" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.$gr_loc_cd + "", "gr_loc_cd"),
				MCItemDef.create("hdr" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.$gr_stk_arrv_bp_cd + "", "gr_stk_arrv_bp_cd"),
				MCItemDef.create("hdr" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.$xfr_schd_dt + "", "xfr_schd_dt"),
				MCItemDef.create("hdr" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.$xfr_inst_dt + "", "xfr_inst_dt"),
				MCItemDef.create("hdr" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.$inst_usr_cd + "", "inst_usr_cd"),
				MCItemDef.create("hdr" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.$inst_dpt_cd + "", "inst_dpt_cd"),
				MCItemDef.create("hdr" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.$sub_char1 + "", "sub_char1"),
				MCItemDef.create("hdr" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.$sub_char2 + "", "sub_char2"),
				MCItemDef.create("hdr" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.$sub_char3 + "", "sub_char3"),
				MCItemDef.create("hdr" + ".immd_inst_prnt_flg", "immd_inst_prnt_flg"),
				MCItemDef.create("hdr" + ".immd_pick_prnt_flg", "immd_pick_prnt_flg"),
				MCItemDef.create("hdr" + ".immd_dlv_prnt_flg", "immd_dlv_prnt_flg"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("dtl" + ".peg_no", "peg_no"),
				MCItemDef.create("dtl" + ".data_crud_typ", "data_crud_typ"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$itm_cd + "", "itm_cd"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$itm_sub1 + "", "itm_sub1"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$itm_sub2 + "", "itm_sub2"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$itm_sub3 + "", "itm_sub3"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$base_dlv_slip_no + "", "base_dlv_slip_no"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$base_prov_act_no + "", "base_prov_act_no"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$base_ac_dt + "", "base_ac_dt"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$pr_sts_typ + "", "pr_sts_typ"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$gi_loc_cd + "", "gi_loc_cd"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$gi_str_ln_cd + "", "gi_str_ln_cd"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$gi_stk_arrv_bp_cd + "", "gi_stk_arrv_bp_cd"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$gr_str_ln_cd + "", "gr_str_ln_cd"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$lot_no + "", "lot_no"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$sublot_no + "", "sublot_no"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$sno1 + "", "sno1"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$sno2 + "", "sno2"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$sno3 + "", "sno3"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$sno4 + "", "sno4"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$ver_no + "", "ver_no"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$gd_cd + "", "gd_cd"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$quality_typ + "", "quality_typ"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$stk_id_typ + "", "stk_id_typ"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$stk_bp_cd + "", "stk_bp_cd"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$trd_unit_cd + "", "trd_unit_cd"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$trd_unit_qty + "", "trd_unit_qty"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$base_unit_cd + "", "base_unit_cd"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$base_unit_qty + "", "base_unit_qty"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$rsn_cd + "", "rsn_cd"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$bd_dpt_cd + "", "bd_dpt_cd"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$abort_flg + "", "abort_flg"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$not_lot_mix_flg + "", "not_lot_mix_flg"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$not_sublot_mix_flg + "", "not_sublot_mix_flg"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$vld_dt_fr + "", "vld_dt_fr"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$vld_dt_to + "", "vld_dt_to"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$io_schd_pr_no + "", "io_schd_pr_no"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$sub_char1 + "", "dtl_sub_char1"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$sub_char2 + "", "dtl_sub_char2"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$sub_char3 + "", "dtl_sub_char3"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$sno1_null_flg + "", "sno1_null_flg"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$sno2_null_flg + "", "sno2_null_flg"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$sno3_null_flg + "", "sno3_null_flg"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$sno4_null_flg + "", "sno4_null_flg"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$alloc_sno1 + "", "alloc_sno1"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$alloc_sno2 + "", "alloc_sno2"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$alloc_sno3 + "", "alloc_sno3"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$alloc_sno4 + "", "alloc_sno4"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$alloc_flg + "", "alloc_flg"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$ship_inst_typ + "", "ship_inst_typ"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$xfr_schd_no + "", "xfr_schd_no"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$prov_typ + "", "prov_typ"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$ret_prov_typ + "", "ret_prov_typ"),
				MCItemDef.create("dtl" + ".cont_qty", "cont_qty"),
				MCItemDef.create("dtl" + ".xfr_alloc_sts_no", "xfr_alloc_sts_no")
			}
			,
			MCBlockDef.create("XfrInst_HdrDtl")
		);
	}

	public static MCContainerDef MS_MSBEL5210_XfrInst_Ins01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5210", "XfrInst_Ins01",
			new MCItemDef[]{
				MCItemDef.create("agg_gi_loc_flg", "agg_gi_loc_flg"),
				MCItemDef.create("bndl_inst_prnt_flg", "bndl_inst_prnt_flg"),
				MCItemDef.create("bndl_prnt_flg", "bndl_prnt_flg")
			}
			,
			MCBlockDef.create("XfrInst_AggCnd")
		);
	}


	public static MCContainerDef MS_MSBEL5210_XfrInst_Ins01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5210", "XfrInst_Ins01",
			new MCItemDef[]{
				MCItemDef.create("hdr" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.$xfr_inst_no + "", "xfr_inst_no"),
				MCItemDef.create("dtl" + ".peg_no", "peg_no"),
				MCItemDef.create("dtl" + ".hdr_peg_no", "dtl_hdr_peg_no"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$xfr_inst_d_no + "", "xfr_inst_d_no"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$pr_sts_typ + "", "pr_sts_typ"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$io_schd_pr_no + "", "io_schd_pr_no"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$dlv_slip_no + "", "dlv_slip_no"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$dlv_slip_d_no + "", "dlv_slip_d_no"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$disp_seq + "", "disp_seq"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$xfr_schd_no + "", "xfr_schd_no"),
				MCItemDef.create("dtl" + ".xfr_alloc_sts_no", "xfr_alloc_sts_no")
			}
			,
			MCBlockDef.create("XfrInst_HdrDtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5210_XfrInst_Del01_INFO = new MCOperationInfo("MS", "MSBEL5210", "XfrInst_Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5210_XfrInst_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5210", "XfrInst_Del01",
			new MCItemDef[]{
				MCItemDef.create("hdr" + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.$xfr_inst_no + "", "xfr_inst_no"),
				MCItemDef.create("hdr" + ".immd_dlv_prnt_flg", "immd_dlv_prnt_flg"),
				MCItemDef.create("dtl" + ".peg_no", "peg_no"),
				MCItemDef.create("dtl" + ".hdr_peg_no", "dtl_hdr_peg_no")
			}
			,
			MCBlockDef.create("XfrInst_HdrDtl")
		);
	}

	public static MCContainerDef MS_MSBEL5210_XfrInst_Del01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5210", "XfrInst_Del01",
			new MCItemDef[]{
				MCItemDef.create("bndl_prnt_flg", "bndl_prnt_flg")
			}
			,
			MCBlockDef.create("XfrInst_Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL5210_XfrInst_Del01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5210", "XfrInst_Del01",
			new MCItemDef[]{
				MCItemDef.create("dtl" + ".peg_no", "peg_no"),
				MCItemDef.create("dtl" + ".hdr_peg_no", "dtl_hdr_peg_no")
			}
			,
			MCBlockDef.create("XfrInst_HdrDtl")
		);
	}
	//FMCB DEF_CLASSES END
}

