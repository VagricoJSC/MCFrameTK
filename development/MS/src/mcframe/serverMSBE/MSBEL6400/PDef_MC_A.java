package mcframe.serverMSBE.MSBEL6400;

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
 * [MSBEL_AcXfrActRegService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBEL6400.AcXfrAct_Chk01.UP.BLOCK0")){
			return MS_MSBEL6400_AcXfrAct_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL6400.AcXfrAct_Chk01.UP.BLOCK1")){
			return MS_MSBEL6400_AcXfrAct_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL6400.AcXfrAct_Chk01.DOWN.BLOCK0")){
			return MS_MSBEL6400_AcXfrAct_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL6400.AcXfrAct_Chk01.DOWN.BLOCK1")){
			return MS_MSBEL6400_AcXfrAct_Chk01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL6400.AcXfrAct_Chk02.UP.BLOCK0")){
			return MS_MSBEL6400_AcXfrAct_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL6400.AcXfrAct_Chk02.UP.BLOCK1")){
			return MS_MSBEL6400_AcXfrAct_Chk02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL6400.AcXfrAct_Chk02.DOWN.BLOCK0")){
			return MS_MSBEL6400_AcXfrAct_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL6400.AcXfrAct_Chk02.DOWN.BLOCK1")){
			return MS_MSBEL6400_AcXfrAct_Chk02_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL6400.AcXfrAct_Chk03.UP.BLOCK0")){
			return MS_MSBEL6400_AcXfrAct_Chk03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL6400.AcXfrAct_Chk03.UP.BLOCK1")){
			return MS_MSBEL6400_AcXfrAct_Chk03_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL6400.AcXfrAct_Chk03.DOWN.BLOCK0")){
			return MS_MSBEL6400_AcXfrAct_Chk03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL6400.AcXfrAct_Chk03.DOWN.BLOCK1")){
			return MS_MSBEL6400_AcXfrAct_Chk03_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL6400.AcXfrAct_Ins01.UP.BLOCK0")){
			return MS_MSBEL6400_AcXfrAct_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL6400.AcXfrAct_Ins01.UP.BLOCK1")){
			return MS_MSBEL6400_AcXfrAct_Ins01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL6400.AcXfrAct_Ins01.DOWN.BLOCK0")){
			return MS_MSBEL6400_AcXfrAct_Ins01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL6400.AcXfrAct_Ins01.DOWN.BLOCK1")){
			return MS_MSBEL6400_AcXfrAct_Ins01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL6400.AcXfrAct_Upd01.UP.BLOCK0")){
			return MS_MSBEL6400_AcXfrAct_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL6400.AcXfrAct_Upd01.UP.BLOCK1")){
			return MS_MSBEL6400_AcXfrAct_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL6400.AcXfrAct_Upd01.DOWN.BLOCK0")){
			return MS_MSBEL6400_AcXfrAct_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL6400.AcXfrAct_Upd01.DOWN.BLOCK1")){
			return MS_MSBEL6400_AcXfrAct_Upd01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL6400.AcXfrAct_Del01.UP.BLOCK0")){
			return MS_MSBEL6400_AcXfrAct_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL6400.AcXfrAct_Del01.UP.BLOCK1")){
			return MS_MSBEL6400_AcXfrAct_Del01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL6400.AcXfrAct_Del01.DOWN.BLOCK0")){
			return MS_MSBEL6400_AcXfrAct_Del01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL6400.AcXfrAct_RevUpd01.UP.BLOCK0")){
			return MS_MSBEL6400_AcXfrAct_RevUpd01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
							
	
	static final MCOperationInfo MS_MSBEL6400_AcXfrAct_Chk01_INFO = new MCOperationInfo("MS", "MSBEL6400", "AcXfrAct_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL6400_AcXfrAct_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL6400", "AcXfrAct_Chk01",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("acxfr_inst_no", "acxfr_inst_no"),
				MCItemDef.create("acxfr_act_tm", "acxfr_act_tm"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("prnt_flg", "prnt_flg"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("hdr_dtl_peg", "hdr_dtl_peg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("AcXfrAct_Chk01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL6400_AcXfrAct_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL6400", "AcXfrAct_Chk01",
			new MCItemDef[]{
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("pr_sts_typ", "pr_sts_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("crt_lot_flg", "crt_lot_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("pack_unit_qty", "pack_unit_qty"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("fix_no_typ", "fix_no_typ"),
				MCItemDef.create("fix_no", "fix_no"),
				MCItemDef.create("bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("bd_bp_cd", "bd_bp_cd"),
				MCItemDef.create("bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("bd_itm_sub3", "bd_itm_sub3"),
				MCItemDef.create("bd_lot_no", "bd_lot_no"),
				MCItemDef.create("bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("bd_sno1", "bd_sno1"),
				MCItemDef.create("bd_sno2", "bd_sno2"),
				MCItemDef.create("bd_sno3", "bd_sno3"),
				MCItemDef.create("bd_sno4", "bd_sno4"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("dspsl_no", "dspsl_no"),
				MCItemDef.create("acxfr_schd_no", "acxfr_schd_no"),
				MCItemDef.create("acxfr_inst_d_no", "acxfr_inst_d_no"),
				MCItemDef.create("aprv_flg", "aprv_flg"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_sts_typ", "aprv_sts_typ"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("in_xfr_typ", "in_xfr_typ"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("inst_base_unit_qty", "inst_base_unit_qty"),
				MCItemDef.create("schd_base_unit_qty", "schd_base_unit_qty"),
				MCItemDef.create("hdr_dtl_peg", "hdr_dtl_peg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("wms_flg", "wms_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_acxfr_act_no", "ext_acxfr_act_no")
			}
			,
			MCBlockDef.create("AcXfrAct_Chk01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL6400_AcXfrAct_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL6400", "AcXfrAct_Chk01",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("acxfr_inst_no", "acxfr_inst_no"),
				MCItemDef.create("acxfr_act_tm", "acxfr_act_tm"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("prnt_flg", "prnt_flg"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("hdr_dtl_peg", "hdr_dtl_peg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("AcXfrAct_Chk01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBEL6400_AcXfrAct_Chk01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL6400", "AcXfrAct_Chk01",
			new MCItemDef[]{
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("pr_sts_typ", "pr_sts_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("crt_lot_flg", "crt_lot_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("pack_unit_qty", "pack_unit_qty"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("fix_no_typ", "fix_no_typ"),
				MCItemDef.create("fix_no", "fix_no"),
				MCItemDef.create("bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("bd_bp_cd", "bd_bp_cd"),
				MCItemDef.create("bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("bd_itm_sub3", "bd_itm_sub3"),
				MCItemDef.create("bd_lot_no", "bd_lot_no"),
				MCItemDef.create("bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("bd_sno1", "bd_sno1"),
				MCItemDef.create("bd_sno2", "bd_sno2"),
				MCItemDef.create("bd_sno3", "bd_sno3"),
				MCItemDef.create("bd_sno4", "bd_sno4"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("dspsl_no", "dspsl_no"),
				MCItemDef.create("acxfr_schd_no", "acxfr_schd_no"),
				MCItemDef.create("acxfr_inst_d_no", "acxfr_inst_d_no"),
				MCItemDef.create("aprv_flg", "aprv_flg"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_sts_typ", "aprv_sts_typ"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("in_xfr_typ", "in_xfr_typ"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("inst_base_unit_qty", "inst_base_unit_qty"),
				MCItemDef.create("schd_base_unit_qty", "schd_base_unit_qty"),
				MCItemDef.create("hdr_dtl_peg", "hdr_dtl_peg"),
				MCItemDef.create("vmi_interim_flg", "vmi_interim_flg"),
				MCItemDef.create("vmi_upri", "vmi_upri"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("wms_flg", "wms_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_acxfr_act_no", "ext_acxfr_act_no")
			}
			,
			MCBlockDef.create("AcXfrAct_Chk01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL6400_AcXfrAct_Chk02_INFO = new MCOperationInfo("MS", "MSBEL6400", "AcXfrAct_Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBEL6400_AcXfrAct_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL6400", "AcXfrAct_Chk02",
			new MCItemDef[]{
				MCItemDef.create("acxfr_act_no", "acxfr_act_no"),
				MCItemDef.create("acxfr_act_rev", "acxfr_act_rev"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("acxfr_inst_no", "acxfr_inst_no"),
				MCItemDef.create("acxfr_act_tm", "acxfr_act_tm"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("prnt_flg", "prnt_flg"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("hdr_dtl_peg", "hdr_dtl_peg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("AcXfrAct_Chk02_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL6400_AcXfrAct_Chk02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL6400", "AcXfrAct_Chk02",
			new MCItemDef[]{
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("pr_sts_typ", "pr_sts_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("crt_lot_flg", "crt_lot_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("pack_unit_qty", "pack_unit_qty"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("fix_no_typ", "fix_no_typ"),
				MCItemDef.create("fix_no", "fix_no"),
				MCItemDef.create("bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("bd_bp_cd", "bd_bp_cd"),
				MCItemDef.create("bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("bd_itm_sub3", "bd_itm_sub3"),
				MCItemDef.create("bd_lot_no", "bd_lot_no"),
				MCItemDef.create("bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("bd_sno1", "bd_sno1"),
				MCItemDef.create("bd_sno2", "bd_sno2"),
				MCItemDef.create("bd_sno3", "bd_sno3"),
				MCItemDef.create("bd_sno4", "bd_sno4"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("dspsl_no", "dspsl_no"),
				MCItemDef.create("acxfr_schd_no", "acxfr_schd_no"),
				MCItemDef.create("acxfr_inst_d_no", "acxfr_inst_d_no"),
				MCItemDef.create("acxfr_act_d_no", "acxfr_act_d_no"),
				MCItemDef.create("aprv_flg", "aprv_flg"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_sts_typ", "aprv_sts_typ"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("acxfr_act_no", "acxfr_act_no"),
				MCItemDef.create("acxfr_act_rev", "acxfr_act_rev"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("in_xfr_typ", "in_xfr_typ"),
				MCItemDef.create("io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("inst_base_unit_qty", "inst_base_unit_qty"),
				MCItemDef.create("schd_base_unit_qty", "schd_base_unit_qty"),
				MCItemDef.create("hdr_dtl_peg", "hdr_dtl_peg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("AcXfrAct_Chk02_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL6400_AcXfrAct_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL6400", "AcXfrAct_Chk02",
			new MCItemDef[]{
				MCItemDef.create("acxfr_act_no", "acxfr_act_no"),
				MCItemDef.create("acxfr_act_rev", "acxfr_act_rev"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("acxfr_inst_no", "acxfr_inst_no"),
				MCItemDef.create("acxfr_act_tm", "acxfr_act_tm"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("prnt_flg", "prnt_flg"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("hdr_dtl_peg", "hdr_dtl_peg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("AcXfrAct_Chk02_Hdr")
		);
	}
	public static MCContainerDef MS_MSBEL6400_AcXfrAct_Chk02_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL6400", "AcXfrAct_Chk02",
			new MCItemDef[]{
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("pr_sts_typ", "pr_sts_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("crt_lot_flg", "crt_lot_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("pack_unit_qty", "pack_unit_qty"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("fix_no_typ", "fix_no_typ"),
				MCItemDef.create("fix_no", "fix_no"),
				MCItemDef.create("bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("bd_bp_cd", "bd_bp_cd"),
				MCItemDef.create("bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("bd_itm_sub3", "bd_itm_sub3"),
				MCItemDef.create("bd_lot_no", "bd_lot_no"),
				MCItemDef.create("bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("bd_sno1", "bd_sno1"),
				MCItemDef.create("bd_sno2", "bd_sno2"),
				MCItemDef.create("bd_sno3", "bd_sno3"),
				MCItemDef.create("bd_sno4", "bd_sno4"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("dspsl_no", "dspsl_no"),
				MCItemDef.create("acxfr_schd_no", "acxfr_schd_no"),
				MCItemDef.create("acxfr_inst_d_no", "acxfr_inst_d_no"),
				MCItemDef.create("acxfr_act_d_no", "acxfr_act_d_no"),
				MCItemDef.create("aprv_flg", "aprv_flg"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_sts_typ", "aprv_sts_typ"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("acxfr_act_no", "acxfr_act_no"),
				MCItemDef.create("acxfr_act_rev", "acxfr_act_rev"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("in_xfr_typ", "in_xfr_typ"),
				MCItemDef.create("io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("inst_base_unit_qty", "inst_base_unit_qty"),
				MCItemDef.create("schd_base_unit_qty", "schd_base_unit_qty"),
				MCItemDef.create("hdr_dtl_peg", "hdr_dtl_peg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("vmi_interim_flg", "vmi_interim_flg"),
				MCItemDef.create("vmi_upri", "vmi_upri"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("AcXfrAct_Chk02_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL6400_AcXfrAct_Chk03_INFO = new MCOperationInfo("MS", "MSBEL6400", "AcXfrAct_Chk03", "000000", new PDef());

	public static MCContainerDef MS_MSBEL6400_AcXfrAct_Chk03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL6400", "AcXfrAct_Chk03",
			new MCItemDef[]{
				MCItemDef.create("acxfr_act_no", "acxfr_act_no"),
				MCItemDef.create("acxfr_act_rev", "acxfr_act_rev"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("acxfr_inst_no", "acxfr_inst_no"),
				MCItemDef.create("acxfr_act_tm", "acxfr_act_tm"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("prnt_flg", "prnt_flg"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("hdr_dtl_peg", "hdr_dtl_peg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("AcXfrAct_Chk03_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL6400_AcXfrAct_Chk03_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL6400", "AcXfrAct_Chk03",
			new MCItemDef[]{
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("pr_sts_typ", "pr_sts_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("crt_lot_flg", "crt_lot_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("pack_unit_qty", "pack_unit_qty"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("fix_no_typ", "fix_no_typ"),
				MCItemDef.create("fix_no", "fix_no"),
				MCItemDef.create("bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("bd_bp_cd", "bd_bp_cd"),
				MCItemDef.create("bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("bd_itm_sub3", "bd_itm_sub3"),
				MCItemDef.create("bd_lot_no", "bd_lot_no"),
				MCItemDef.create("bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("bd_sno1", "bd_sno1"),
				MCItemDef.create("bd_sno2", "bd_sno2"),
				MCItemDef.create("bd_sno3", "bd_sno3"),
				MCItemDef.create("bd_sno4", "bd_sno4"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("dspsl_no", "dspsl_no"),
				MCItemDef.create("acxfr_schd_no", "acxfr_schd_no"),
				MCItemDef.create("acxfr_inst_d_no", "acxfr_inst_d_no"),
				MCItemDef.create("acxfr_act_d_no", "acxfr_act_d_no"),
				MCItemDef.create("aprv_flg", "aprv_flg"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_sts_typ", "aprv_sts_typ"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("acxfr_act_no", "acxfr_act_no"),
				MCItemDef.create("acxfr_act_rev", "acxfr_act_rev"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("in_xfr_typ", "in_xfr_typ"),
				MCItemDef.create("io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("inst_base_unit_qty", "inst_base_unit_qty"),
				MCItemDef.create("schd_base_unit_qty", "schd_base_unit_qty"),
				MCItemDef.create("hdr_dtl_peg", "hdr_dtl_peg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("AcXfrAct_Chk03_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL6400_AcXfrAct_Chk03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL6400", "AcXfrAct_Chk03",
			new MCItemDef[]{
				MCItemDef.create("acxfr_act_no", "acxfr_act_no"),
				MCItemDef.create("acxfr_act_rev", "acxfr_act_rev"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("acxfr_inst_no", "acxfr_inst_no"),
				MCItemDef.create("acxfr_act_tm", "acxfr_act_tm"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("prnt_flg", "prnt_flg"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("hdr_dtl_peg", "hdr_dtl_peg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ")
			}
			,
			MCBlockDef.create("AcXfrAct_Chk03_Hdr")
		);
	}
	public static MCContainerDef MS_MSBEL6400_AcXfrAct_Chk03_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL6400", "AcXfrAct_Chk03",
			new MCItemDef[]{
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("pr_sts_typ", "pr_sts_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("crt_lot_flg", "crt_lot_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("pack_unit_qty", "pack_unit_qty"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("fix_no_typ", "fix_no_typ"),
				MCItemDef.create("fix_no", "fix_no"),
				MCItemDef.create("bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("bd_bp_cd", "bd_bp_cd"),
				MCItemDef.create("bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("bd_itm_sub3", "bd_itm_sub3"),
				MCItemDef.create("bd_lot_no", "bd_lot_no"),
				MCItemDef.create("bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("bd_sno1", "bd_sno1"),
				MCItemDef.create("bd_sno2", "bd_sno2"),
				MCItemDef.create("bd_sno3", "bd_sno3"),
				MCItemDef.create("bd_sno4", "bd_sno4"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("dspsl_no", "dspsl_no"),
				MCItemDef.create("acxfr_schd_no", "acxfr_schd_no"),
				MCItemDef.create("acxfr_inst_d_no", "acxfr_inst_d_no"),
				MCItemDef.create("acxfr_act_d_no", "acxfr_act_d_no"),
				MCItemDef.create("aprv_flg", "aprv_flg"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_sts_typ", "aprv_sts_typ"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("acxfr_act_no", "acxfr_act_no"),
				MCItemDef.create("acxfr_act_rev", "acxfr_act_rev"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("in_xfr_typ", "in_xfr_typ"),
				MCItemDef.create("io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("inst_base_unit_qty", "inst_base_unit_qty"),
				MCItemDef.create("schd_base_unit_qty", "schd_base_unit_qty"),
				MCItemDef.create("hdr_dtl_peg", "hdr_dtl_peg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("AcXfrAct_Chk03_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL6400_AcXfrAct_Ins01_INFO = new MCOperationInfo("MS", "MSBEL6400", "AcXfrAct_Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL6400_AcXfrAct_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL6400", "AcXfrAct_Ins01",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("acxfr_inst_no", "acxfr_inst_no"),
				MCItemDef.create("acxfr_act_tm", "acxfr_act_tm"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("prnt_flg", "prnt_flg"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("hdr_dtl_peg", "hdr_dtl_peg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ")
			}
			,
			MCBlockDef.create("AcXfrAct_Ins01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL6400_AcXfrAct_Ins01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL6400", "AcXfrAct_Ins01",
			new MCItemDef[]{
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("crt_lot_flg", "crt_lot_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("pack_unit_qty", "pack_unit_qty"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("fix_no_typ", "fix_no_typ"),
				MCItemDef.create("fix_no", "fix_no"),
				MCItemDef.create("bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("bd_bp_cd", "bd_bp_cd"),
				MCItemDef.create("bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("bd_itm_sub3", "bd_itm_sub3"),
				MCItemDef.create("bd_lot_no", "bd_lot_no"),
				MCItemDef.create("bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("bd_sno1", "bd_sno1"),
				MCItemDef.create("bd_sno2", "bd_sno2"),
				MCItemDef.create("bd_sno3", "bd_sno3"),
				MCItemDef.create("bd_sno4", "bd_sno4"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("dspsl_no", "dspsl_no"),
				MCItemDef.create("acxfr_schd_no", "acxfr_schd_no"),
				MCItemDef.create("acxfr_inst_d_no", "acxfr_inst_d_no"),
				MCItemDef.create("aprv_flg", "aprv_flg"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_sts_typ", "aprv_sts_typ"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("in_xfr_typ", "in_xfr_typ"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("inst_base_unit_qty", "inst_base_unit_qty"),
				MCItemDef.create("schd_base_unit_qty", "schd_base_unit_qty"),
				MCItemDef.create("hdr_dtl_peg", "hdr_dtl_peg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("vmi_interim_flg", "vmi_interim_flg"),
				MCItemDef.create("vmi_upri", "vmi_upri"),
				MCItemDef.create("wms_flg", "wms_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_acxfr_act_no", "ext_acxfr_act_no")
			}
			,
			MCBlockDef.create("AcXfrAct_Ins01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL6400_AcXfrAct_Ins01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL6400", "AcXfrAct_Ins01",
			new MCItemDef[]{
				MCItemDef.create("acxfr_act_no", "acxfr_act_no"),
				MCItemDef.create("acxfr_act_rev", "acxfr_act_rev"),
				MCItemDef.create("hdr_dtl_peg", "hdr_dtl_peg")
			}
			,
			MCBlockDef.create("AcXfrAct_Ins01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBEL6400_AcXfrAct_Ins01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL6400", "AcXfrAct_Ins01",
			new MCItemDef[]{
				MCItemDef.create("pr_sts_typ", "pr_sts_typ"),
				MCItemDef.create("acxfr_act_d_no", "acxfr_act_d_no"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("acxfr_act_no", "acxfr_act_no"),
				MCItemDef.create("acxfr_act_rev", "acxfr_act_rev"),
				MCItemDef.create("hdr_dtl_peg", "hdr_dtl_peg"),
				MCItemDef.create("wms_flg", "wms_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_acxfr_act_no", "ext_acxfr_act_no")
			}
			,
			MCBlockDef.create("AcXfrAct_Ins01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL6400_AcXfrAct_Upd01_INFO = new MCOperationInfo("MS", "MSBEL6400", "AcXfrAct_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL6400_AcXfrAct_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL6400", "AcXfrAct_Upd01",
			new MCItemDef[]{
				MCItemDef.create("acxfr_act_no", "acxfr_act_no"),
				MCItemDef.create("acxfr_act_rev", "acxfr_act_rev"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("acxfr_inst_no", "acxfr_inst_no"),
				MCItemDef.create("acxfr_act_tm", "acxfr_act_tm"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("prnt_flg", "prnt_flg"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("hdr_dtl_peg", "hdr_dtl_peg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ")
			}
			,
			MCBlockDef.create("AcXfrAct_Upd01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL6400_AcXfrAct_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL6400", "AcXfrAct_Upd01",
			new MCItemDef[]{
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("crt_lot_flg", "crt_lot_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("pack_unit_qty", "pack_unit_qty"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("fix_no_typ", "fix_no_typ"),
				MCItemDef.create("fix_no", "fix_no"),
				MCItemDef.create("bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("bd_bp_cd", "bd_bp_cd"),
				MCItemDef.create("bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("bd_itm_sub3", "bd_itm_sub3"),
				MCItemDef.create("bd_lot_no", "bd_lot_no"),
				MCItemDef.create("bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("bd_sno1", "bd_sno1"),
				MCItemDef.create("bd_sno2", "bd_sno2"),
				MCItemDef.create("bd_sno3", "bd_sno3"),
				MCItemDef.create("bd_sno4", "bd_sno4"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("dspsl_no", "dspsl_no"),
				MCItemDef.create("acxfr_schd_no", "acxfr_schd_no"),
				MCItemDef.create("acxfr_inst_d_no", "acxfr_inst_d_no"),
				MCItemDef.create("acxfr_act_d_no", "acxfr_act_d_no"),
				MCItemDef.create("aprv_flg", "aprv_flg"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_sts_typ", "aprv_sts_typ"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("acxfr_act_no", "acxfr_act_no"),
				MCItemDef.create("acxfr_act_rev", "acxfr_act_rev"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("in_xfr_typ", "in_xfr_typ"),
				MCItemDef.create("io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("inst_base_unit_qty", "inst_base_unit_qty"),
				MCItemDef.create("schd_base_unit_qty", "schd_base_unit_qty"),
				MCItemDef.create("hdr_dtl_peg", "hdr_dtl_peg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("vmi_interim_flg", "vmi_interim_flg"),
				MCItemDef.create("vmi_upri", "vmi_upri")
			}
			,
			MCBlockDef.create("AcXfrAct_Upd01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL6400_AcXfrAct_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL6400", "AcXfrAct_Upd01",
			new MCItemDef[]{
				MCItemDef.create("acxfr_act_no", "acxfr_act_no"),
				MCItemDef.create("acxfr_act_rev", "acxfr_act_rev")
			}
			,
			MCBlockDef.create("AcXfrAct_Upd01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBEL6400_AcXfrAct_Upd01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL6400", "AcXfrAct_Upd01",
			new MCItemDef[]{
				MCItemDef.create("pr_sts_typ", "pr_sts_typ"),
				MCItemDef.create("acxfr_act_d_no", "acxfr_act_d_no"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("acxfr_act_no", "acxfr_act_no"),
				MCItemDef.create("acxfr_act_rev", "acxfr_act_rev")
			}
			,
			MCBlockDef.create("AcXfrAct_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL6400_AcXfrAct_Del01_INFO = new MCOperationInfo("MS", "MSBEL6400", "AcXfrAct_Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL6400_AcXfrAct_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL6400", "AcXfrAct_Del01",
			new MCItemDef[]{
				MCItemDef.create("acxfr_act_no", "acxfr_act_no"),
				MCItemDef.create("acxfr_act_rev", "acxfr_act_rev"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("acxfr_inst_no", "acxfr_inst_no"),
				MCItemDef.create("acxfr_act_tm", "acxfr_act_tm"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("prnt_flg", "prnt_flg"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("hdr_dtl_peg", "hdr_dtl_peg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("AcXfrAct_Del01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL6400_AcXfrAct_Del01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL6400", "AcXfrAct_Del01",
			new MCItemDef[]{
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("crt_lot_flg", "crt_lot_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("pack_unit_qty", "pack_unit_qty"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("fix_no_typ", "fix_no_typ"),
				MCItemDef.create("fix_no", "fix_no"),
				MCItemDef.create("bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("bd_bp_cd", "bd_bp_cd"),
				MCItemDef.create("bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("bd_itm_sub3", "bd_itm_sub3"),
				MCItemDef.create("bd_lot_no", "bd_lot_no"),
				MCItemDef.create("bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("bd_sno1", "bd_sno1"),
				MCItemDef.create("bd_sno2", "bd_sno2"),
				MCItemDef.create("bd_sno3", "bd_sno3"),
				MCItemDef.create("bd_sno4", "bd_sno4"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("dspsl_no", "dspsl_no"),
				MCItemDef.create("acxfr_schd_no", "acxfr_schd_no"),
				MCItemDef.create("acxfr_inst_d_no", "acxfr_inst_d_no"),
				MCItemDef.create("acxfr_act_d_no", "acxfr_act_d_no"),
				MCItemDef.create("aprv_flg", "aprv_flg"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_sts_typ", "aprv_sts_typ"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("acxfr_act_no", "acxfr_act_no"),
				MCItemDef.create("acxfr_act_rev", "acxfr_act_rev"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("in_xfr_typ", "in_xfr_typ"),
				MCItemDef.create("io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("inst_base_unit_qty", "inst_base_unit_qty"),
				MCItemDef.create("schd_base_unit_qty", "schd_base_unit_qty"),
				MCItemDef.create("hdr_dtl_peg", "hdr_dtl_peg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("AcXfrAct_Del01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL6400_AcXfrAct_Del01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL6400", "AcXfrAct_Del01",
			new MCItemDef[]{
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("AcXfrAct_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL6400_AcXfrAct_RevUpd01_INFO = new MCOperationInfo("MS", "MSBEL6400", "AcXfrAct_RevUpd01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL6400_AcXfrAct_RevUpd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL6400", "AcXfrAct_RevUpd01",
			new MCItemDef[]{
				MCItemDef.create("rev_data_src_no", "rev_data_src_no"),
				MCItemDef.create("rev_no", "rev_no")
			}
			,
			MCBlockDef.create("AcXfrAct_RevUpd01_Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

