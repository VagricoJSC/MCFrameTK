package mcframe.serverMSBE.MSBEL5220;

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
 * [MSBEL_XfrActService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBEL5220.XfrAct_Chk01.UP.BLOCK0")){
			return MS_MSBEL5220_XfrAct_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5220.XfrAct_Chk01.UP.BLOCK1")){
			return MS_MSBEL5220_XfrAct_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5220.XfrAct_Chk01.DOWN.BLOCK0")){
			return MS_MSBEL5220_XfrAct_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5220.XfrAct_Chk02.UP.BLOCK0")){
			return MS_MSBEL5220_XfrAct_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5220.XfrAct_Chk02.DOWN.BLOCK0")){
			return MS_MSBEL5220_XfrAct_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5220.XfrAct_Upd02.UP.BLOCK0")){
			return MS_MSBEL5220_XfrAct_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5220.XfrAct_Upd02.UP.BLOCK1")){
			return MS_MSBEL5220_XfrAct_Upd02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5220.XfrAct_Upd02.UP.BLOCK2")){
			return MS_MSBEL5220_XfrAct_Upd02_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBEL5220.XfrAct_Upd02.DOWN.BLOCK0")){
			return MS_MSBEL5220_XfrAct_Upd02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5220.XfrAct_Upd02.DOWN.BLOCK1")){
			return MS_MSBEL5220_XfrAct_Upd02_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5220.XfrAct_Ins02.UP.BLOCK0")){
			return MS_MSBEL5220_XfrAct_Ins02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5220.XfrAct_Ins02.UP.BLOCK1")){
			return MS_MSBEL5220_XfrAct_Ins02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5220.XfrAct_Ins02.UP.BLOCK2")){
			return MS_MSBEL5220_XfrAct_Ins02_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBEL5220.XfrAct_Ins02.DOWN.BLOCK0")){
			return MS_MSBEL5220_XfrAct_Ins02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5220.XfrAct_Ins02.DOWN.BLOCK1")){
			return MS_MSBEL5220_XfrAct_Ins02_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5220.XfrAct_Del02.UP.BLOCK0")){
			return MS_MSBEL5220_XfrAct_Del02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5220.XfrAct_Del02.UP.BLOCK1")){
			return MS_MSBEL5220_XfrAct_Del02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5220.XfrAct_Del02.DOWN.BLOCK0")){
			return MS_MSBEL5220_XfrAct_Del02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5220.XfrAct_Upd01.UP.BLOCK0")){
			return MS_MSBEL5220_XfrAct_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5220.XfrAct_Upd01.UP.BLOCK1")){
			return MS_MSBEL5220_XfrAct_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5220.XfrAct_Upd01.DOWN.BLOCK0")){
			return MS_MSBEL5220_XfrAct_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5220.XfrAct_Ins01.UP.BLOCK0")){
			return MS_MSBEL5220_XfrAct_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5220.XfrAct_Ins01.UP.BLOCK1")){
			return MS_MSBEL5220_XfrAct_Ins01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5220.XfrAct_Ins01.DOWN.BLOCK0")){
			return MS_MSBEL5220_XfrAct_Ins01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5220.XfrAct_Del01.UP.BLOCK0")){
			return MS_MSBEL5220_XfrAct_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5220.XfrAct_Del01.UP.BLOCK1")){
			return MS_MSBEL5220_XfrAct_Del01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5220.XfrAct_Del01.DOWN.BLOCK0")){
			return MS_MSBEL5220_XfrAct_Del01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
								
	
	static final MCOperationInfo MS_MSBEL5220_XfrAct_Chk01_INFO = new MCOperationInfo("MS", "MSBEL5220", "XfrAct_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5220_XfrAct_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5220", "XfrAct_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("xfr_alloc_sts_no", "xfr_alloc_sts_no"),
				MCItemDef.create("xfr_act_d_no", "xfr_act_d_no"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("gr_loc_cd", "gr_loc_cd"),
				MCItemDef.create("xfr_dt", "xfr_dt"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("prov_schd_no", "prov_schd_no"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("ret_prov_schd_no", "ret_prov_schd_no"),
				MCItemDef.create("ret_prov_typ", "ret_prov_typ"),
				MCItemDef.create("base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("base_ac_dt", "base_ac_dt"),
				MCItemDef.create("immd_dlv_prnt_flg", "immd_dlv_prnt_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("skip_chk_ship_flg", "skip_chk_ship_flg"),
				MCItemDef.create("gi_str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("gr_str_ln_cd", "gr_str_ln_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty")
			}
			,
			MCBlockDef.create("XfrActChk_HdrDtl")
		);
	}

	public static MCContainerDef MS_MSBEL5220_XfrAct_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5220", "XfrAct_Chk01",
			new MCItemDef[]{
				MCItemDef.create("xfr_act_d_no", "xfr_act_d_no")
			}
			,
			MCBlockDef.create("XfrActChk_DelDtl")
		);
	}


	public static MCContainerDef MS_MSBEL5220_XfrAct_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5220", "XfrAct_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("XfrActChk_HdrDtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5220_XfrAct_Chk02_INFO = new MCOperationInfo("MS", "MSBEL5220", "XfrAct_Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5220_XfrAct_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5220", "XfrAct_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("xfr_act_no", "xfr_act_no"),
				MCItemDef.create("can_ac_dt", "can_ac_dt")
			}
			,
			MCBlockDef.create("XfrActChk_HdrDtl")
		);
	}


	public static MCContainerDef MS_MSBEL5220_XfrAct_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5220", "XfrAct_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("XfrActChk_HdrDtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5220_XfrAct_Upd02_INFO = new MCOperationInfo("MS", "MSBEL5220", "XfrAct_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5220_XfrAct_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5220", "XfrAct_Upd02",
			new MCItemDef[]{
				MCItemDef.create("xah" + ".xfr_act_no", "xfr_act_no"),
				MCItemDef.create("xah" + ".xfr_inst_no", "xfr_inst_no"),
				MCItemDef.create("xah" + ".trd_cd", "trd_cd"),
				MCItemDef.create("xah" + ".trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("xah" + ".wg_cd", "wg_cd"),
				MCItemDef.create("xah" + ".lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("xah" + ".gr_loc_cd", "gr_loc_cd"),
				MCItemDef.create("xah" + ".gr_stk_arrv_bp_cd", "gr_stk_arrv_bp_cd"),
				MCItemDef.create("xah" + ".xfr_dt", "xfr_dt"),
				MCItemDef.create("xah" + ".ac_dt", "ac_dt"),
				MCItemDef.create("xah" + ".act_usr_cd", "act_usr_cd"),
				MCItemDef.create("xah" + ".act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("xah" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("xah" + ".trd_rmrks", "trd_rmrks"),
				MCItemDef.create("xah" + ".sub_char1", "sub_char1"),
				MCItemDef.create("xah" + ".sub_char2", "sub_char2"),
				MCItemDef.create("xah" + ".sub_char3", "sub_char3"),
				MCItemDef.create("immd_dlv_prnt_flg", "immd_dlv_prnt_flg"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("slo_no", "slo_no")
			}
			,
			MCBlockDef.create("XfrAct_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL5220_XfrAct_Upd02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5220", "XfrAct_Upd02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("xad" + ".xfr_act_d_no", "xfr_act_d_no"),
				MCItemDef.create("xad" + ".xfr_act_no", "xfr_act_no_dtl"),
				MCItemDef.create("xad" + ".xfr_alloc_sts_no", "xfr_alloc_sts_no"),
				MCItemDef.create("xad" + ".xfr_inst_d_no", "xfr_inst_d_no"),
				MCItemDef.create("xad" + ".gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("xad" + ".gi_str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("xad" + ".gi_stk_arrv_bp_cd", "gi_stk_arrv_bp_cd"),
				MCItemDef.create("xad" + ".gr_str_ln_cd", "gr_str_ln_cd"),
				MCItemDef.create("xad" + ".itm_cd", "itm_cd"),
				MCItemDef.create("xad" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("xad" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("xad" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("xad" + ".lot_no", "lot_no"),
				MCItemDef.create("xad" + ".sublot_no", "sublot_no"),
				MCItemDef.create("xad" + ".sno1", "sno1"),
				MCItemDef.create("xad" + ".sno2", "sno2"),
				MCItemDef.create("xad" + ".sno3", "sno3"),
				MCItemDef.create("xad" + ".sno4", "sno4"),
				MCItemDef.create("xad" + ".gd_cd", "gd_cd"),
				MCItemDef.create("xad" + ".quality_typ", "quality_typ"),
				MCItemDef.create("xad" + ".stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("xad" + ".stk_id_typ", "stk_id_typ"),
				MCItemDef.create("xad" + ".stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("xad" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("xad" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("xad" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("xad" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("xad" + ".skip_chk_ship_flg", "skip_chk_ship_flg"),
				MCItemDef.create("xad" + ".rsn_cd", "rsn_cd"),
				MCItemDef.create("xad" + ".bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("xad" + ".io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("xad" + ".base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("xad" + ".base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("xad" + ".base_ac_dt", "base_ac_dt"),
				MCItemDef.create("xad" + ".disp_seq", "disp_seq"),
				MCItemDef.create("xad" + ".intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("xad" + ".trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("xad" + ".sub_char1", "sub_char1_dtl"),
				MCItemDef.create("xad" + ".sub_char2", "sub_char2_dtl"),
				MCItemDef.create("xad" + ".sub_char3", "sub_char3_dtl"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("prov_schd_no", "prov_schd_no"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("ret_prov_schd_no", "ret_prov_schd_no"),
				MCItemDef.create("ret_prov_typ", "ret_prov_typ")
			}
			,
			MCBlockDef.create("XfrAct_Dtl")
		);
	}

	public static MCContainerDef MS_MSBEL5220_XfrAct_Upd02_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL5220", "XfrAct_Upd02",
			new MCItemDef[]{
				MCItemDef.create("bndl_prnt_flg", "bndl_prnt_flg")
			}
			,
			MCBlockDef.create("XfrAct_Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL5220_XfrAct_Upd02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5220", "XfrAct_Upd02",
			new MCItemDef[]{
				MCItemDef.create("xah" + ".xfr_act_no", "xfr_act_no"),
				MCItemDef.create("xah" + ".dlv_prnt_flg", "dlv_prnt_flg")
			}
			,
			MCBlockDef.create("XfrAct_Hdr")
		);
	}
	public static MCContainerDef MS_MSBEL5220_XfrAct_Upd02_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5220", "XfrAct_Upd02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("xad" + ".xfr_act_d_no", "xfr_act_d_no"),
				MCItemDef.create("xad" + ".dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("xad" + ".dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("prov_act_no", "prov_act_no"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("ret_prov_act_no", "ret_prov_act_no"),
				MCItemDef.create("ret_prov_typ", "ret_prov_typ"),
				MCItemDef.create("pr_sts_typ", "pr_sts_typ")
			}
			,
			MCBlockDef.create("XfrAct_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5220_XfrAct_Ins02_INFO = new MCOperationInfo("MS", "MSBEL5220", "XfrAct_Ins02", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5220_XfrAct_Ins02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5220", "XfrAct_Ins02",
			new MCItemDef[]{
				MCItemDef.create("xah" + ".xfr_inst_no", "xfr_inst_no"),
				MCItemDef.create("xah" + ".trd_cd", "trd_cd"),
				MCItemDef.create("xah" + ".trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("xah" + ".wg_cd", "wg_cd"),
				MCItemDef.create("xah" + ".lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("xah" + ".gr_loc_cd", "gr_loc_cd"),
				MCItemDef.create("xah" + ".gr_stk_arrv_bp_cd", "gr_stk_arrv_bp_cd"),
				MCItemDef.create("xah" + ".xfr_dt", "xfr_dt"),
				MCItemDef.create("xah" + ".ac_dt", "ac_dt"),
				MCItemDef.create("xah" + ".act_usr_cd", "act_usr_cd"),
				MCItemDef.create("xah" + ".act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("xah" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("xah" + ".trd_rmrks", "trd_rmrks"),
				MCItemDef.create("xah" + ".sub_char1", "sub_char1"),
				MCItemDef.create("xah" + ".sub_char2", "sub_char2"),
				MCItemDef.create("xah" + ".sub_char3", "sub_char3"),
				MCItemDef.create("immd_dlv_prnt_flg", "immd_dlv_prnt_flg"),
				MCItemDef.create("slo_no", "slo_no")
			}
			,
			MCBlockDef.create("XfrAct_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL5220_XfrAct_Ins02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5220", "XfrAct_Ins02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("xad" + ".xfr_act_no", "xfr_act_no_dtl"),
				MCItemDef.create("xad" + ".xfr_alloc_sts_no", "xfr_alloc_sts_no"),
				MCItemDef.create("xad" + ".xfr_inst_d_no", "xfr_inst_d_no"),
				MCItemDef.create("xad" + ".gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("xad" + ".gi_str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("xad" + ".gi_stk_arrv_bp_cd", "gi_stk_arrv_bp_cd"),
				MCItemDef.create("xad" + ".gr_str_ln_cd", "gr_str_ln_cd"),
				MCItemDef.create("xad" + ".itm_cd", "itm_cd"),
				MCItemDef.create("xad" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("xad" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("xad" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("xad" + ".lot_no", "lot_no"),
				MCItemDef.create("xad" + ".sublot_no", "sublot_no"),
				MCItemDef.create("xad" + ".sno1", "sno1"),
				MCItemDef.create("xad" + ".sno2", "sno2"),
				MCItemDef.create("xad" + ".sno3", "sno3"),
				MCItemDef.create("xad" + ".sno4", "sno4"),
				MCItemDef.create("xad" + ".gd_cd", "gd_cd"),
				MCItemDef.create("xad" + ".quality_typ", "quality_typ"),
				MCItemDef.create("xad" + ".stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("xad" + ".stk_id_typ", "stk_id_typ"),
				MCItemDef.create("xad" + ".stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("xad" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("xad" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("xad" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("xad" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("xad" + ".skip_chk_ship_flg", "skip_chk_ship_flg"),
				MCItemDef.create("xad" + ".rsn_cd", "rsn_cd"),
				MCItemDef.create("xad" + ".bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("xad" + ".io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("xad" + ".base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("xad" + ".base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("xad" + ".base_ac_dt", "base_ac_dt"),
				MCItemDef.create("xad" + ".disp_seq", "disp_seq"),
				MCItemDef.create("xad" + ".intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("xad" + ".trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("xad" + ".sub_char1", "sub_char1_dtl"),
				MCItemDef.create("xad" + ".sub_char2", "sub_char2_dtl"),
				MCItemDef.create("xad" + ".sub_char3", "sub_char3_dtl"),
				MCItemDef.create("xad" + ".wms_flg", "wms_flg"),
				MCItemDef.create("xad" + ".ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("xad" + ".ext_xfr_act_no", "ext_xfr_act_no"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("prov_schd_no", "prov_schd_no"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("ret_prov_schd_no", "ret_prov_schd_no"),
				MCItemDef.create("ret_prov_typ", "ret_prov_typ")
			}
			,
			MCBlockDef.create("XfrAct_Dtl")
		);
	}

	public static MCContainerDef MS_MSBEL5220_XfrAct_Ins02_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL5220", "XfrAct_Ins02",
			new MCItemDef[]{
				MCItemDef.create("bndl_prnt_flg", "bndl_prnt_flg")
			}
			,
			MCBlockDef.create("XfrAct_Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL5220_XfrAct_Ins02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5220", "XfrAct_Ins02",
			new MCItemDef[]{
				MCItemDef.create("xah" + ".xfr_act_no", "xfr_act_no"),
				MCItemDef.create("xah" + ".dlv_prnt_flg", "dlv_prnt_flg")
			}
			,
			MCBlockDef.create("XfrAct_Hdr")
		);
	}
	public static MCContainerDef MS_MSBEL5220_XfrAct_Ins02_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5220", "XfrAct_Ins02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("xad" + ".xfr_act_d_no", "xfr_act_d_no"),
				MCItemDef.create("xad" + ".dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("xad" + ".dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("prov_act_no", "prov_act_no"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("ret_prov_act_no", "ret_prov_act_no"),
				MCItemDef.create("ret_prov_typ", "ret_prov_typ"),
				MCItemDef.create("pr_sts_typ", "pr_sts_typ")
			}
			,
			MCBlockDef.create("XfrAct_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5220_XfrAct_Del02_INFO = new MCOperationInfo("MS", "MSBEL5220", "XfrAct_Del02", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5220_XfrAct_Del02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5220", "XfrAct_Del02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("xah" + ".xfr_act_no", "xfr_act_no"),
				MCItemDef.create("immd_dlv_prnt_flg", "immd_dlv_prnt_flg"),
				MCItemDef.create("can_ac_dt", "can_ac_dt")
			}
			,
			MCBlockDef.create("XfrActDel02")
		);
	}

	public static MCContainerDef MS_MSBEL5220_XfrAct_Del02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5220", "XfrAct_Del02",
			new MCItemDef[]{
				MCItemDef.create("bndl_prnt_flg", "bndl_prnt_flg")
			}
			,
			MCBlockDef.create("XfrAct_Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL5220_XfrAct_Del02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5220", "XfrAct_Del02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("XfrActDel02")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5220_XfrAct_Upd01_INFO = new MCOperationInfo("MS", "MSBEL5220", "XfrAct_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5220_XfrAct_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5220", "XfrAct_Upd01",
			new MCItemDef[]{
				MCItemDef.create("xauh" + ".xah.xfr_act_no", "xfr_act_no"),
				MCItemDef.create("xauh" + "." + mcframe.serverMSBE.MSBEL5220.XfrAct_HdrR.$xfr_inst_no + "", "xfr_inst_no"),
				MCItemDef.create("xauh" + ".xah.trd_cd", "trd_cd"),
				MCItemDef.create("xauh" + ".xah.trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("xauh" + ".xah.wg_cd", "wg_cd"),
				MCItemDef.create("xauh" + ".xah.lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("xauh" + ".xah.gr_loc_cd", "gr_loc_cd"),
				MCItemDef.create("xauh" + ".xah.gr_stk_arrv_bp_cd", "gr_stk_arrv_bp_cd"),
				MCItemDef.create("xauh" + ".xah.xfr_dt", "xfr_dt"),
				MCItemDef.create("xauh" + ".xah.ac_dt", "ac_dt"),
				MCItemDef.create("xauh" + ".xah.act_usr_cd", "act_usr_cd"),
				MCItemDef.create("xauh" + ".xah.act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("xauh" + ".xah.intr_rmrks", "intr_rmrks"),
				MCItemDef.create("xauh" + ".xah.trd_rmrks", "trd_rmrks"),
				MCItemDef.create("xauh" + ".xah.sub_char1", "sub_char1"),
				MCItemDef.create("xauh" + ".xah.sub_char2", "sub_char2"),
				MCItemDef.create("xauh" + ".xah.sub_char3", "sub_char3"),
				MCItemDef.create("xauh" + ".immd_dlv_prnt_flg", "immd_dlv_prnt_flg"),
				MCItemDef.create("xauh" + ".can_ac_dt", "can_ac_dt"),
				MCItemDef.create("xaud" + ".peg_no", "peg_no"),
				MCItemDef.create("xaud" + ".data_crud_typ", "data_crud_typ"),
				MCItemDef.create("xaud" + ".xad.xfr_act_d_no", "xfr_act_d_no"),
				MCItemDef.create("xaud" + ".xad.xfr_act_no", "xfr_act_no_dtl"),
				MCItemDef.create("xaud" + ".xad.xfr_alloc_sts_no", "xfr_alloc_sts_no"),
				MCItemDef.create("xaud" + ".xad.xfr_inst_d_no", "xfr_inst_d_no"),
				MCItemDef.create("xaud" + ".xad.gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("xaud" + ".xad.gi_str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("xaud" + ".xad.gi_stk_arrv_bp_cd", "gi_stk_arrv_bp_cd"),
				MCItemDef.create("xaud" + ".xad.gr_str_ln_cd", "gr_str_ln_cd"),
				MCItemDef.create("xaud" + ".xad.itm_cd", "itm_cd"),
				MCItemDef.create("xaud" + ".xad.itm_sub1", "itm_sub1"),
				MCItemDef.create("xaud" + ".xad.itm_sub2", "itm_sub2"),
				MCItemDef.create("xaud" + ".xad.itm_sub3", "itm_sub3"),
				MCItemDef.create("xaud" + ".xad.lot_no", "lot_no"),
				MCItemDef.create("xaud" + ".xad.sublot_no", "sublot_no"),
				MCItemDef.create("xaud" + ".xad.sno1", "sno1"),
				MCItemDef.create("xaud" + ".xad.sno2", "sno2"),
				MCItemDef.create("xaud" + ".xad.sno3", "sno3"),
				MCItemDef.create("xaud" + ".xad.sno4", "sno4"),
				MCItemDef.create("xaud" + ".xad.gd_cd", "gd_cd"),
				MCItemDef.create("xaud" + ".xad.quality_typ", "quality_typ"),
				MCItemDef.create("xaud" + ".xad.stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("xaud" + ".xad.stk_id_typ", "stk_id_typ"),
				MCItemDef.create("xaud" + ".xad.stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("xaud" + ".xad.trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("xaud" + ".xad.trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("xaud" + ".xad.base_unit_cd", "base_unit_cd"),
				MCItemDef.create("xaud" + ".xad.base_unit_qty", "base_unit_qty"),
				MCItemDef.create("xaud" + "." + mcframe.serverMSBE.MSBEL5220.XfrAct_DtlR.$skip_chk_ship_flg + "", "skip_chk_ship_flg"),
				MCItemDef.create("xaud" + ".xad.rsn_cd", "rsn_cd"),
				MCItemDef.create("xaud" + ".xad.bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("xaud" + ".xad.io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("xaud" + ".xad.base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("xaud" + ".xad.base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("xaud" + ".xad.base_ac_dt", "base_ac_dt"),
				MCItemDef.create("xaud" + ".xad.intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("xaud" + ".xad.trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("xaud" + ".xad.sub_char1", "sub_char1_dtl"),
				MCItemDef.create("xaud" + ".xad.sub_char2", "sub_char2_dtl"),
				MCItemDef.create("xaud" + ".xad.sub_char3", "sub_char3_dtl"),
				MCItemDef.create("xaud" + ".abort_flg", "abort_flg"),
				MCItemDef.create("xaud" + ".prov_schd_no", "prov_schd_no"),
				MCItemDef.create("xaud" + ".prov_typ", "prov_typ"),
				MCItemDef.create("xaud" + ".ret_prov_schd_no", "ret_prov_schd_no"),
				MCItemDef.create("xaud" + ".ret_prov_typ", "ret_prov_typ")
			}
			,
			MCBlockDef.create("XfrAct_HdrDtl")
		);
	}

	public static MCContainerDef MS_MSBEL5220_XfrAct_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5220", "XfrAct_Upd01",
			new MCItemDef[]{
				MCItemDef.create("bndl_prnt_flg", "bndl_prnt_flg")
			}
			,
			MCBlockDef.create("XfrAct_AggCnd")
		);
	}


	public static MCContainerDef MS_MSBEL5220_XfrAct_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5220", "XfrAct_Upd01",
			new MCItemDef[]{
				MCItemDef.create("xauh" + ".xah.xfr_act_no", "xfr_act_no"),
				MCItemDef.create("xauh" + ".xah.dlv_prnt_flg", "dlv_prnt_flg"),
				MCItemDef.create("xaud" + ".peg_no", "peg_no"),
				MCItemDef.create("xaud" + ".xad.xfr_act_d_no", "xfr_act_d_no"),
				MCItemDef.create("xaud" + ".xad.dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("xaud" + ".xad.dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("xaud" + ".prov_act_no", "prov_act_no"),
				MCItemDef.create("xaud" + ".prov_typ", "prov_typ"),
				MCItemDef.create("xaud" + ".ret_prov_act_no", "ret_prov_act_no"),
				MCItemDef.create("xaud" + ".ret_prov_typ", "ret_prov_typ"),
				MCItemDef.create("xaud" + ".pr_sts_typ", "xaud" + ".pr_sts_typ")
			}
			,
			MCBlockDef.create("XfrAct_HdrDtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5220_XfrAct_Ins01_INFO = new MCOperationInfo("MS", "MSBEL5220", "XfrAct_Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5220_XfrAct_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5220", "XfrAct_Ins01",
			new MCItemDef[]{
				MCItemDef.create("xauh" + "." + mcframe.serverMSBE.MSBEL5220.XfrAct_HdrR.$xfr_inst_no + "", "xfr_inst_no"),
				MCItemDef.create("xauh" + ".xah.trd_cd", "trd_cd"),
				MCItemDef.create("xauh" + ".xah.trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("xauh" + ".xah.wg_cd", "wg_cd"),
				MCItemDef.create("xauh" + ".xah.lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("xauh" + ".xah.gr_loc_cd", "gr_loc_cd"),
				MCItemDef.create("xauh" + ".xah.gr_stk_arrv_bp_cd", "gr_stk_arrv_bp_cd"),
				MCItemDef.create("xauh" + ".xah.xfr_dt", "xfr_dt"),
				MCItemDef.create("xauh" + ".xah.ac_dt", "ac_dt"),
				MCItemDef.create("xauh" + ".xah.act_usr_cd", "act_usr_cd"),
				MCItemDef.create("xauh" + ".xah.act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("xauh" + ".xah.intr_rmrks", "intr_rmrks"),
				MCItemDef.create("xauh" + ".xah.trd_rmrks", "trd_rmrks"),
				MCItemDef.create("xauh" + ".xah.sub_char1", "sub_char1"),
				MCItemDef.create("xauh" + ".xah.sub_char2", "sub_char2"),
				MCItemDef.create("xauh" + ".xah.sub_char3", "sub_char3"),
				MCItemDef.create("xauh" + ".immd_dlv_prnt_flg", "immd_dlv_prnt_flg"),
				MCItemDef.create("xaud" + ".peg_no", "peg_no"),
				MCItemDef.create("xaud" + ".xad.xfr_alloc_sts_no", "xfr_alloc_sts_no"),
				MCItemDef.create("xaud" + ".xad.xfr_inst_d_no", "xfr_inst_d_no"),
				MCItemDef.create("xaud" + ".xad.gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("xaud" + ".xad.gi_str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("xaud" + ".xad.gi_stk_arrv_bp_cd", "gi_stk_arrv_bp_cd"),
				MCItemDef.create("xaud" + ".xad.gr_str_ln_cd", "gr_str_ln_cd"),
				MCItemDef.create("xaud" + ".xad.itm_cd", "itm_cd"),
				MCItemDef.create("xaud" + ".xad.itm_sub1", "itm_sub1"),
				MCItemDef.create("xaud" + ".xad.itm_sub2", "itm_sub2"),
				MCItemDef.create("xaud" + ".xad.itm_sub3", "itm_sub3"),
				MCItemDef.create("xaud" + ".xad.lot_no", "lot_no"),
				MCItemDef.create("xaud" + ".xad.sublot_no", "sublot_no"),
				MCItemDef.create("xaud" + ".xad.sno1", "sno1"),
				MCItemDef.create("xaud" + ".xad.sno2", "sno2"),
				MCItemDef.create("xaud" + ".xad.sno3", "sno3"),
				MCItemDef.create("xaud" + ".xad.sno4", "sno4"),
				MCItemDef.create("xaud" + ".xad.gd_cd", "gd_cd"),
				MCItemDef.create("xaud" + ".xad.quality_typ", "quality_typ"),
				MCItemDef.create("xaud" + ".xad.stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("xaud" + ".xad.stk_id_typ", "stk_id_typ"),
				MCItemDef.create("xaud" + ".xad.stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("xaud" + ".xad.trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("xaud" + ".xad.trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("xaud" + ".xad.base_unit_cd", "base_unit_cd"),
				MCItemDef.create("xaud" + ".xad.base_unit_qty", "base_unit_qty"),
				MCItemDef.create("xaud" + "." + mcframe.serverMSBE.MSBEL5220.XfrAct_DtlR.$skip_chk_ship_flg + "", "skip_chk_ship_flg"),
				MCItemDef.create("xaud" + ".xad.rsn_cd", "rsn_cd"),
				MCItemDef.create("xaud" + ".xad.bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("xaud" + ".xad.io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("xaud" + ".xad.base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("xaud" + ".xad.base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("xaud" + ".xad.base_ac_dt", "base_ac_dt"),
				MCItemDef.create("xaud" + ".xad.intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("xaud" + ".xad.trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("xaud" + ".xad.sub_char1", "sub_char1_dtl"),
				MCItemDef.create("xaud" + ".xad.sub_char2", "sub_char2_dtl"),
				MCItemDef.create("xaud" + ".xad.sub_char3", "sub_char3_dtl"),
				MCItemDef.create("xaud" + ".xad.wms_flg", "wms_flg"),
				MCItemDef.create("xaud" + "." + mcframe.serverMSBE.MSBEL5220.XfrAct_DtlR.$ext_sys_cd + "", "ext_sys_cd"),
				MCItemDef.create("xaud" + ".xad.ext_xfr_act_no", "ext_xfr_act_no"),
				MCItemDef.create("xaud" + ".abort_flg", "abort_flg"),
				MCItemDef.create("xaud" + ".prov_schd_no", "prov_schd_no"),
				MCItemDef.create("xaud" + ".prov_typ", "prov_typ"),
				MCItemDef.create("xaud" + ".ret_prov_schd_no", "ret_prov_schd_no"),
				MCItemDef.create("xaud" + ".ret_prov_typ", "ret_prov_typ")
			}
			,
			MCBlockDef.create("XfrAct_HdrDtl")
		);
	}

	public static MCContainerDef MS_MSBEL5220_XfrAct_Ins01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5220", "XfrAct_Ins01",
			new MCItemDef[]{
				MCItemDef.create("agg_gi_loc_flg", "agg_gi_loc_flg"),
				MCItemDef.create("bndl_prnt_flg", "bndl_prnt_flg")
			}
			,
			MCBlockDef.create("XfrAct_AggCnd")
		);
	}


	public static MCContainerDef MS_MSBEL5220_XfrAct_Ins01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5220", "XfrAct_Ins01",
			new MCItemDef[]{
				MCItemDef.create("xauh" + ".xah.xfr_act_no", "xfr_act_no"),
				MCItemDef.create("xauh" + ".xah.dlv_prnt_flg", "dlv_prnt_flg"),
				MCItemDef.create("xaud" + ".peg_no", "peg_no"),
				MCItemDef.create("xaud" + ".xad.xfr_act_d_no", "xfr_act_d_no"),
				MCItemDef.create("xaud" + ".xad.dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("xaud" + ".xad.dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("xaud" + ".prov_act_no", "prov_act_no"),
				MCItemDef.create("xaud" + ".prov_typ", "prov_typ"),
				MCItemDef.create("xaud" + ".ret_prov_act_no", "ret_prov_act_no"),
				MCItemDef.create("xaud" + ".ret_prov_typ", "ret_prov_typ"),
				MCItemDef.create("xaud" + ".pr_sts_typ", "xaud" + ".pr_sts_typ")
			}
			,
			MCBlockDef.create("XfrAct_HdrDtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5220_XfrAct_Del01_INFO = new MCOperationInfo("MS", "MSBEL5220", "XfrAct_Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5220_XfrAct_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5220", "XfrAct_Del01",
			new MCItemDef[]{
				MCItemDef.create("xauh" + ".xah.xfr_act_no", "xfr_act_no"),
				MCItemDef.create("xauh" + ".immd_dlv_prnt_flg", "immd_dlv_prnt_flg"),
				MCItemDef.create("xauh" + ".can_ac_dt", "can_ac_dt"),
				MCItemDef.create("xaud" + ".peg_no", "peg_no")
			}
			,
			MCBlockDef.create("XfrActDel01")
		);
	}

	public static MCContainerDef MS_MSBEL5220_XfrAct_Del01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5220", "XfrAct_Del01",
			new MCItemDef[]{
				MCItemDef.create("bndl_prnt_flg", "bndl_prnt_flg")
			}
			,
			MCBlockDef.create("XfrAct_AggCnd")
		);
	}


	public static MCContainerDef MS_MSBEL5220_XfrAct_Del01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5220", "XfrAct_Del01",
			new MCItemDef[]{
				MCItemDef.create("xaud" + ".peg_no", "peg_no")
			}
			,
			MCBlockDef.create("XfrActDel01")
		);
	}
	//FMCB DEF_CLASSES END
}

