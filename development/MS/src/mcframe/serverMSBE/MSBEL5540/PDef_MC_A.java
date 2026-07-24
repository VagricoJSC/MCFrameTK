package mcframe.serverMSBE.MSBEL5540;

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
 * [MSBEL_ShipActService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBEL5540.ShipAct_Upd01.UP.BLOCK0")){
			return MS_MSBEL5540_ShipAct_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5540.ShipAct_Upd01.UP.BLOCK1")){
			return MS_MSBEL5540_ShipAct_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5540.ShipAct_Upd01.UP.BLOCK2")){
			return MS_MSBEL5540_ShipAct_Upd01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBEL5540.ShipAct_Upd01.DOWN.BLOCK0")){
			return MS_MSBEL5540_ShipAct_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5540.ShipAct_Upd01.DOWN.BLOCK1")){
			return MS_MSBEL5540_ShipAct_Upd01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5540.ShipAct_Upd02.UP.BLOCK0")){
			return MS_MSBEL5540_ShipAct_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5540.ShipAct_Upd03.UP.BLOCK0")){
			return MS_MSBEL5540_ShipAct_Upd03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5540.ShipAct_Chk01.UP.BLOCK0")){
			return MS_MSBEL5540_ShipAct_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5540.ShipAct_Chk01.UP.BLOCK1")){
			return MS_MSBEL5540_ShipAct_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5540.ShipAct_Chk01.UP.BLOCK2")){
			return MS_MSBEL5540_ShipAct_Chk01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBEL5540.ShipAct_Chk01.DOWN.BLOCK0")){
			return MS_MSBEL5540_ShipAct_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5540.ShipAct_Chk01.DOWN.BLOCK1")){
			return MS_MSBEL5540_ShipAct_Chk01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5540.ShipAct_InptChk01.UP.BLOCK0")){
			return MS_MSBEL5540_ShipAct_InptChk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5540.ShipAct_InptChk01.UP.BLOCK1")){
			return MS_MSBEL5540_ShipAct_InptChk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5540.ShipAct_InptChk01.UP.BLOCK2")){
			return MS_MSBEL5540_ShipAct_InptChk01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBEL5540.ShipAct_InptChk01.UP.BLOCK3")){
			return MS_MSBEL5540_ShipAct_InptChk01_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBEL5540.ShipAct_InptChk01.DOWN.BLOCK0")){
			return MS_MSBEL5540_ShipAct_InptChk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5540.ShipAct_InptChk01.DOWN.BLOCK1")){
			return MS_MSBEL5540_ShipAct_InptChk01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5540.ShipAct_InptChk02.UP.BLOCK0")){
			return MS_MSBEL5540_ShipAct_InptChk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5540.ShipAct_InptChk02.UP.BLOCK1")){
			return MS_MSBEL5540_ShipAct_InptChk02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5540.ShipAct_InptChk02.DOWN.BLOCK0")){
			return MS_MSBEL5540_ShipAct_InptChk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5540.ShipAct_RevUpd01.UP.BLOCK0")){
			return MS_MSBEL5540_ShipAct_RevUpd01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
							
	
	static final MCOperationInfo MS_MSBEL5540_ShipAct_Upd01_INFO = new MCOperationInfo("MS", "MSBEL5540", "ShipAct_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5540_ShipAct_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5540", "ShipAct_Upd01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("sa" + ".ship_act_no", "ship_act_no"),
				MCItemDef.create("sa" + ".ship_inst_no", "ship_inst_no"),
				MCItemDef.create("sa" + ".ac_dt", "ac_dt"),
				MCItemDef.create("sa" + ".ship_tm", "ship_tm"),
				MCItemDef.create("sa" + ".dlv_tm", "dlv_tm"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("sa" + ".rqst_dpt_cd", "rqst_dpt_cd"),
				MCItemDef.create("sa" + ".rqst_usr_cd", "rqst_usr_cd"),
				MCItemDef.create("sa" + ".ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("sa" + ".wg_cd", "wg_cd"),
				MCItemDef.create("sa" + ".ship_term_cd", "ship_term_cd"),
				MCItemDef.create("sa" + ".ship_dpt_cd", "ship_dpt_cd"),
				MCItemDef.create("sa" + ".ship_usr_cd", "ship_usr_cd"),
				MCItemDef.create("sa" + ".ship_to_lg_grp_cd", "ship_to_lg_grp_cd"),
				MCItemDef.create("sa" + ".cst_cd", "cst_cd"),
				MCItemDef.create("sa" + ".ship_to_id_typ", "ship_to_id_typ"),
				MCItemDef.create("sa" + ".ship_to_id_cd", "ship_to_id_cd"),
				MCItemDef.create("sa" + ".ship_to_id_nm", "ship_to_id_nm"),
				MCItemDef.create("sa" + ".ship_to_zip_cd", "ship_to_zip_cd"),
				MCItemDef.create("sa" + ".ship_to_addr1", "ship_to_addr1"),
				MCItemDef.create("sa" + ".ship_to_addr2", "ship_to_addr2"),
				MCItemDef.create("sa" + ".ship_to_addr3", "ship_to_addr3"),
				MCItemDef.create("sa" + ".ship_to_addr4", "ship_to_addr4"),
				MCItemDef.create("sa" + ".ship_to_cntct_dpt", "ship_to_cntct_dpt"),
				MCItemDef.create("sa" + ".ship_to_cntct_psn", "ship_to_cntct_psn"),
				MCItemDef.create("sa" + ".ship_to_tel", "ship_to_tel"),
				MCItemDef.create("sa" + ".ship_to_fax", "ship_to_fax"),
				MCItemDef.create("sa" + ".ship_to_sundry_flg", "ship_to_sundry_flg"),
				MCItemDef.create("sa" + ".via_dlv_typ", "via_dlv_typ"),
				MCItemDef.create("sa" + ".iv_no", "iv_no"),
				MCItemDef.create("sa" + ".uplnd_flg", "uplnd_flg"),
				MCItemDef.create("sa" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sa" + ".sub_char1", "sub_char1"),
				MCItemDef.create("sa" + ".sub_char2", "sub_char2"),
				MCItemDef.create("sa" + ".sub_char3", "sub_char3"),
				MCItemDef.create("dlv_slip_prnt_flg", "dlv_slip_prnt_flg"),
				MCItemDef.create("ship_adv_prnt_flg", "ship_adv_prnt_flg"),
				MCItemDef.create("lot_chk_off_flg", "lot_chk_off_flg"),
				MCItemDef.create("dlv_slip_flg", "dlv_slip_flg"),
				MCItemDef.create("io_act_flg", "io_act_flg"),
				MCItemDef.create("sls_act_flg", "sls_act_flg"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("uplnd_iv_sls_flg", "uplnd_iv_sls_flg"),
				MCItemDef.create("sls_dtl_mod_flg", "sls_dtl_mod_flg"),
				MCItemDef.create("ref_ship_act_no", "ref_ship_act_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no")
			}
			,
			MCBlockDef.create("ShipAct_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL5540_ShipAct_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5540", "ShipAct_Upd01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("sad" + ".ship_act_d_no", "ship_act_d_no"),
				MCItemDef.create("sad" + ".disp_seq", "disp_seq"),
				MCItemDef.create("sad" + ".ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("sad" + ".trd_cd", "trd_cd"),
				MCItemDef.create("sad" + ".trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("sad" + ".ship_loc_cd", "ship_loc_cd"),
				MCItemDef.create("sad" + ".ship_str_ln_cd", "ship_str_ln_cd"),
				MCItemDef.create("sad" + ".dlv_id_typ", "dlv_id_typ"),
				MCItemDef.create("sad" + ".dlv_id_cd", "dlv_id_cd"),
				MCItemDef.create("sad" + ".dlv_id_nm", "dlv_id_nm"),
				MCItemDef.create("sad" + ".dlv_zip_cd", "dlv_zip_cd"),
				MCItemDef.create("sad" + ".dlv_addr1", "dlv_addr1"),
				MCItemDef.create("sad" + ".dlv_addr2", "dlv_addr2"),
				MCItemDef.create("sad" + ".dlv_addr3", "dlv_addr3"),
				MCItemDef.create("sad" + ".dlv_addr4", "dlv_addr4"),
				MCItemDef.create("sad" + ".dlv_cntct_dpt", "dlv_cntct_dpt"),
				MCItemDef.create("sad" + ".dlv_cntct_psn", "dlv_cntct_psn"),
				MCItemDef.create("sad" + ".dlv_tel", "dlv_tel"),
				MCItemDef.create("sad" + ".dlv_fax", "dlv_fax"),
				MCItemDef.create("sad" + ".dlv_sundry_flg", "dlv_sundry_flg"),
				MCItemDef.create("sad" + ".pri_prnt_flg", "pri_prnt_flg"),
				MCItemDef.create("sad" + ".dlv_str_ln_cd", "dlv_str_ln_cd"),
				MCItemDef.create("sad" + ".itm_cd", "itm_cd"),
				MCItemDef.create("sad" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("sad" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("sad" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("sad" + ".itm_nm", "itm_nm"),
				MCItemDef.create("sad" + ".iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("sad" + ".sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("sad" + ".stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("sad" + ".sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sad" + ".sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sad" + ".sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sad" + ".sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("sad" + ".sno1", "sno1"),
				MCItemDef.create("sad" + ".sno2", "sno2"),
				MCItemDef.create("sad" + ".sno3", "sno3"),
				MCItemDef.create("sad" + ".sno4", "sno4"),
				MCItemDef.create("sad" + ".lot_no", "lot_no"),
				MCItemDef.create("sad" + ".sublot_no", "sublot_no"),
				MCItemDef.create("sad" + ".ver_no", "ver_no"),
				MCItemDef.create("sad" + ".stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("sad" + ".gd_cd", "gd_cd"),
				MCItemDef.create("sad" + ".quality_typ", "quality_typ"),
				MCItemDef.create("sad" + ".stk_id_typ", "stk_id_typ"),
				MCItemDef.create("sad" + ".stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("sad" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("sad" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("sad" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("sad" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("sad" + ".skip_chk_ship_flg", "skip_chk_ship_flg"),
				MCItemDef.create("sad" + ".rsn_cd", "rsn_cd"),
				MCItemDef.create("sad" + ".bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_dpt_nm", "bd_dpt_nm"),
				MCItemDef.create("sad" + ".cst_po_no", "cst_po_no"),
				MCItemDef.create("sad" + ".cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("sad" + ".cst_dlv_inst_no", "cst_dlv_inst_no"),
				MCItemDef.create("sad" + ".cst_dlv_inst_d_no", "cst_dlv_inst_d_no"),
				MCItemDef.create("sad" + ".cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("sad" + ".cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("sad" + ".base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("sad" + ".base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("sad" + ".base_ac_dt", "base_ac_dt"),
				MCItemDef.create("sad" + ".arr_cnt_rmrks", "arr_cnt_rmrks"),
				MCItemDef.create("sad" + ".trd_rmrks", "trd_rmrks"),
				MCItemDef.create("sad" + ".trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("sad" + ".intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("sad" + ".io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("sad" + ".sub_char1", "sub_char1"),
				MCItemDef.create("sad" + ".sub_char2", "sub_char2"),
				MCItemDef.create("sad" + ".sub_char3", "sub_char3"),
				MCItemDef.create("sad" + ".dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("sad" + ".dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("sad" + ".dlv_slip_seq", "dlv_slip_seq"),
				MCItemDef.create("sad" + ".wms_flg", "wms_flg"),
				MCItemDef.create("sad" + ".ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("sad" + ".ext_ship_act_no", "ext_ship_act_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("non_upd_flg", "non_upd_flg"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("prov_basis_typ", "prov_basis_typ"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("ref_ship_act_d_no", "ref_ship_act_d_no"),
				MCItemDef.create("purc_sync_flg", "purc_sync_flg"),
				MCItemDef.create("not_lot_mix_flg", "not_lot_mix_flg"),
				MCItemDef.create("not_sublot_mix_flg", "not_sublot_mix_flg"),
				MCItemDef.create("org_peg_no", "org_peg_no")
			}
			,
			MCBlockDef.create("ShipAct_Dtl")
		);
	}

	public static MCContainerDef MS_MSBEL5540_ShipAct_Upd01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL5540", "ShipAct_Upd01",
			new MCItemDef[]{
				MCItemDef.create("bndl_prnt_flg", "bndl_prnt_flg")
			}
			,
			MCBlockDef.create("ShipAct_Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL5540_ShipAct_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5540", "ShipAct_Upd01",
			new MCItemDef[]{
				MCItemDef.create("sa" + ".ship_act_no", "ship_act_no"),
				MCItemDef.create("sa" + ".ship_act_rev", "ship_act_rev"),
				MCItemDef.create("dlv_slip_prnted_flg", "dlv_slip_prnted_flg"),
				MCItemDef.create("ship_adv_prnted_flg", "ship_adv_prnted_flg"),
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("ShipAct_Hdr")
		);
	}
	public static MCContainerDef MS_MSBEL5540_ShipAct_Upd01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5540", "ShipAct_Upd01",
			new MCItemDef[]{
				MCItemDef.create("sad" + ".ship_act_d_no", "ship_act_d_no"),
				MCItemDef.create("sad" + ".ship_act_no", "ship_act_no"),
				MCItemDef.create("sad" + ".bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_dpt_nm", "bd_dpt_nm"),
				MCItemDef.create("sad" + ".dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("sad" + ".dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("sad" + ".dlv_slip_seq", "dlv_slip_seq"),
				MCItemDef.create("pr_sts_typ", "pr_sts_typ"),
				MCItemDef.create("pr_sts_typ_nm", "pr_sts_typ_nm"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("ShipAct_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5540_ShipAct_Upd02_INFO = new MCOperationInfo("MS", "MSBEL5540", "ShipAct_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5540_ShipAct_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5540", "ShipAct_Upd02",
			new MCItemDef[]{
				MCItemDef.create("sad" + ".ship_ret_flg", "ship_ret_flg"),
				MCItemDef.create("sad" + ".dlv_slip_d_no", "dlv_slip_d_no")
			}
			,
			MCBlockDef.create("ShipAct_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5540_ShipAct_Upd03_INFO = new MCOperationInfo("MS", "MSBEL5540", "ShipAct_Upd03", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5540_ShipAct_Upd03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5540", "ShipAct_Upd03",
			new MCItemDef[]{
				MCItemDef.create("sad" + ".ship_act_d_no", "ship_act_d_no")
			}
			,
			MCBlockDef.create("ShipAct_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5540_ShipAct_Chk01_INFO = new MCOperationInfo("MS", "MSBEL5540", "ShipAct_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5540_ShipAct_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5540", "ShipAct_Chk01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("sa" + ".ship_act_no", "ship_act_no"),
				MCItemDef.create("sa" + ".ship_inst_no", "ship_inst_no"),
				MCItemDef.create("sa" + ".ac_dt", "ac_dt"),
				MCItemDef.create("sa" + ".ship_tm", "ship_tm"),
				MCItemDef.create("sa" + ".dlv_tm", "dlv_tm"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("sa" + ".ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("sa" + ".cst_cd", "cst_cd"),
				MCItemDef.create("sa" + ".ship_to_id_typ", "ship_to_id_typ"),
				MCItemDef.create("sa" + ".ship_to_id_cd", "ship_to_id_cd"),
				MCItemDef.create("sa" + ".via_dlv_typ", "via_dlv_typ"),
				MCItemDef.create("sa" + ".iv_no", "iv_no"),
				MCItemDef.create("sa" + ".uplnd_flg", "uplnd_flg"),
				MCItemDef.create("lot_chk_off_flg", "lot_chk_off_flg"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("ship_cmpl_no_chk_flg", "ship_cmpl_no_chk_flg"),
				MCItemDef.create("uplnd_iv_sls_flg", "uplnd_iv_sls_flg"),
				MCItemDef.create("sls_dtl_mod_flg", "sls_dtl_mod_flg"),
				MCItemDef.create("ref_ship_act_no", "ref_ship_act_no")
			}
			,
			MCBlockDef.create("ShipAct_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL5540_ShipAct_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5540", "ShipAct_Chk01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("sad" + ".ship_act_d_no", "ship_act_d_no"),
				MCItemDef.create("sad" + ".ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("sad" + ".trd_cd", "trd_cd"),
				MCItemDef.create("sad" + ".trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("sad" + ".ship_loc_cd", "ship_loc_cd"),
				MCItemDef.create("sad" + ".ship_str_ln_cd", "ship_str_ln_cd"),
				MCItemDef.create("sad" + ".dlv_id_typ", "dlv_id_typ"),
				MCItemDef.create("sad" + ".dlv_id_cd", "dlv_id_cd"),
				MCItemDef.create("sad" + ".itm_cd", "itm_cd"),
				MCItemDef.create("sad" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("sad" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("sad" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("sad" + ".itm_nm", "itm_nm"),
				MCItemDef.create("sad" + ".sno1", "sno1"),
				MCItemDef.create("sad" + ".sno2", "sno2"),
				MCItemDef.create("sad" + ".sno3", "sno3"),
				MCItemDef.create("sad" + ".sno4", "sno4"),
				MCItemDef.create("sad" + ".lot_no", "lot_no"),
				MCItemDef.create("sad" + ".sublot_no", "sublot_no"),
				MCItemDef.create("sad" + ".stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("sad" + ".gd_cd", "gd_cd"),
				MCItemDef.create("sad" + ".quality_typ", "quality_typ"),
				MCItemDef.create("sad" + ".stk_id_typ", "stk_id_typ"),
				MCItemDef.create("sad" + ".stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("sad" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("sad" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("sad" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("sad" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("sad" + ".skip_chk_ship_flg", "skip_chk_ship_flg"),
				MCItemDef.create("sad" + ".bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("sad" + ".base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("sad" + ".base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("sad" + ".base_ac_dt", "base_ac_dt"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("non_upd_flg", "non_upd_flg"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("ref_ship_act_d_no", "ref_ship_act_d_no"),
				MCItemDef.create("purc_sync_flg", "purc_sync_flg"),
				MCItemDef.create("not_lot_mix_flg", "not_lot_mix_flg"),
				MCItemDef.create("not_sublot_mix_flg", "not_sublot_mix_flg")
			}
			,
			MCBlockDef.create("SihpAct_Dtl")
		);
	}

	public static MCContainerDef MS_MSBEL5540_ShipAct_Chk01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL5540", "ShipAct_Chk01",
			new MCItemDef[]{
				MCItemDef.create("ship_act_d_no", "ship_act_d_no")
			}
			,
			MCBlockDef.create("ShipAct_Del_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL5540_ShipAct_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5540", "ShipAct_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("uplnd_iv_sls_flg", "uplnd_iv_sls_flg")
			}
			,
			MCBlockDef.create("ShipAct_Hdr")
		);
	}
	public static MCContainerDef MS_MSBEL5540_ShipAct_Chk01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5540", "ShipAct_Chk01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("SihpAct_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5540_ShipAct_InptChk01_INFO = new MCOperationInfo("MS", "MSBEL5540", "ShipAct_InptChk01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5540_ShipAct_InptChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5540", "ShipAct_InptChk01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("ship_act_no", "ship_act_no"),
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("ship_tm", "ship_tm"),
				MCItemDef.create("dlv_tm", "dlv_tm"),
				MCItemDef.create("rqst_usr_cd", "rqst_usr_cd"),
				MCItemDef.create("rqst_dpt_cd", "rqst_dpt_cd"),
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("ship_usr_cd", "ship_usr_cd"),
				MCItemDef.create("ship_dpt_cd", "ship_dpt_cd"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("ship_to_id_typ", "ship_to_id_typ"),
				MCItemDef.create("ship_to_id_cd", "ship_to_id_cd"),
				MCItemDef.create("ship_to_id_nm", "ship_to_id_nm"),
				MCItemDef.create("ship_to_zip_cd", "ship_to_zip_cd"),
				MCItemDef.create("ship_to_addr1", "ship_to_addr1"),
				MCItemDef.create("ship_to_addr2", "ship_to_addr2"),
				MCItemDef.create("ship_to_addr3", "ship_to_addr3"),
				MCItemDef.create("ship_to_addr4", "ship_to_addr4"),
				MCItemDef.create("ship_to_cntct_dpt", "ship_to_cntct_dpt"),
				MCItemDef.create("ship_to_cntct_psn", "ship_to_cntct_psn"),
				MCItemDef.create("ship_to_tel", "ship_to_tel"),
				MCItemDef.create("ship_to_fax", "ship_to_fax"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("uplnd_flg", "uplnd_flg"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("dlv_slip_prnt_flg", "dlv_slip_prnt_flg"),
				MCItemDef.create("ship_adv_prnt_flg", "ship_adv_prnt_flg"),
				MCItemDef.create("lot_chk_off_flg", "lot_chk_off_flg"),
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("ShipAct_InptChk01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL5540_ShipAct_InptChk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5540", "ShipAct_InptChk01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("ship_act_d_no", "ship_act_d_no"),
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("ship_loc_cd", "ship_loc_cd"),
				MCItemDef.create("ship_str_ln_cd", "ship_str_ln_cd"),
				MCItemDef.create("dlv_id_typ", "dlv_id_typ"),
				MCItemDef.create("dlv_id_cd", "dlv_id_cd"),
				MCItemDef.create("dlv_id_nm", "dlv_id_nm"),
				MCItemDef.create("dlv_zip_cd", "dlv_zip_cd"),
				MCItemDef.create("dlv_addr1", "dlv_addr1"),
				MCItemDef.create("dlv_addr2", "dlv_addr2"),
				MCItemDef.create("dlv_addr3", "dlv_addr3"),
				MCItemDef.create("dlv_addr4", "dlv_addr4"),
				MCItemDef.create("dlv_cntct_dpt", "dlv_cntct_dpt"),
				MCItemDef.create("dlv_cntct_psn", "dlv_cntct_psn"),
				MCItemDef.create("dlv_tel", "dlv_tel"),
				MCItemDef.create("dlv_fax", "dlv_fax"),
				MCItemDef.create("dlv_str_ln_cd", "dlv_str_ln_cd"),
				MCItemDef.create("pri_prnt_flg", "pri_prnt_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("not_lot_mix_flg", "not_lot_mix_flg"),
				MCItemDef.create("not_sublot_mix_flg", "not_sublot_mix_flg"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("cst_po_no", "cst_po_no"),
				MCItemDef.create("cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("cst_dlv_inst_no", "cst_dlv_inst_no"),
				MCItemDef.create("cst_dlv_inst_d_no", "cst_dlv_inst_d_no"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("base_ac_dt", "base_ac_dt"),
				MCItemDef.create("arr_cnt_rmrks", "arr_cnt_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_seq", "dlv_slip_seq"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("skip_chk_ship_flg", "skip_chk_ship_flg"),
				MCItemDef.create("wms_flg", "wms_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_ship_act_no", "ext_ship_act_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("ShipAct_InptChk01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBEL5540_ShipAct_InptChk01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL5540", "ShipAct_InptChk01",
			new MCItemDef[]{
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("ship_pr_no", "ship_pr_no")
			}
			,
			MCBlockDef.create("ShipAct_InptChk01_Cntr")
		);
	}

	public static MCContainerDef MS_MSBEL5540_ShipAct_InptChk01_UP_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBEL5540", "ShipAct_InptChk01",
			new MCItemDef[]{
				MCItemDef.create("ship_act_d_no", "ship_act_d_no")
			}
			,
			MCBlockDef.create("ShipAct_InptChk01_Del_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL5540_ShipAct_InptChk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5540", "ShipAct_InptChk01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("ship_act_no", "ship_act_no"),
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("ship_tm", "ship_tm"),
				MCItemDef.create("dlv_tm", "dlv_tm"),
				MCItemDef.create("rqst_usr_cd", "rqst_usr_cd"),
				MCItemDef.create("rqst_dpt_cd", "rqst_dpt_cd"),
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ship_term_cd", "ship_term_cd"),
				MCItemDef.create("ship_usr_cd", "ship_usr_cd"),
				MCItemDef.create("ship_dpt_cd", "ship_dpt_cd"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("ship_to_id_typ", "ship_to_id_typ"),
				MCItemDef.create("ship_to_id_cd", "ship_to_id_cd"),
				MCItemDef.create("ship_to_id_nm", "ship_to_id_nm"),
				MCItemDef.create("ship_to_zip_cd", "ship_to_zip_cd"),
				MCItemDef.create("ship_to_addr1", "ship_to_addr1"),
				MCItemDef.create("ship_to_addr2", "ship_to_addr2"),
				MCItemDef.create("ship_to_addr3", "ship_to_addr3"),
				MCItemDef.create("ship_to_addr4", "ship_to_addr4"),
				MCItemDef.create("ship_to_cntct_dpt", "ship_to_cntct_dpt"),
				MCItemDef.create("ship_to_cntct_psn", "ship_to_cntct_psn"),
				MCItemDef.create("ship_to_tel", "ship_to_tel"),
				MCItemDef.create("ship_to_fax", "ship_to_fax"),
				MCItemDef.create("ship_to_sundry_flg", "ship_to_sundry_flg"),
				MCItemDef.create("via_dlv_typ", "via_dlv_typ"),
				MCItemDef.create("ship_to_lg_grp_cd", "ship_to_lg_grp_cd"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("uplnd_flg", "uplnd_flg"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("dlv_slip_prnt_flg", "dlv_slip_prnt_flg"),
				MCItemDef.create("ship_adv_prnt_flg", "ship_adv_prnt_flg"),
				MCItemDef.create("lot_chk_off_flg", "lot_chk_off_flg"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("ShipAct_InptChk01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBEL5540_ShipAct_InptChk01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5540", "ShipAct_InptChk01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("ship_act_d_no", "ship_act_d_no"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("ship_loc_cd", "ship_loc_cd"),
				MCItemDef.create("ship_str_ln_cd", "ship_str_ln_cd"),
				MCItemDef.create("dlv_id_typ", "dlv_id_typ"),
				MCItemDef.create("dlv_id_cd", "dlv_id_cd"),
				MCItemDef.create("dlv_id_nm", "dlv_id_nm"),
				MCItemDef.create("dlv_zip_cd", "dlv_zip_cd"),
				MCItemDef.create("dlv_addr1", "dlv_addr1"),
				MCItemDef.create("dlv_addr2", "dlv_addr2"),
				MCItemDef.create("dlv_addr3", "dlv_addr3"),
				MCItemDef.create("dlv_addr4", "dlv_addr4"),
				MCItemDef.create("dlv_cntct_dpt", "dlv_cntct_dpt"),
				MCItemDef.create("dlv_cntct_psn", "dlv_cntct_psn"),
				MCItemDef.create("dlv_tel", "dlv_tel"),
				MCItemDef.create("dlv_fax", "dlv_fax"),
				MCItemDef.create("dlv_sundry_flg", "dlv_sundry_flg"),
				MCItemDef.create("dlv_str_ln_cd", "dlv_str_ln_cd"),
				MCItemDef.create("pri_prnt_flg", "pri_prnt_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_dpt_nm", "bd_dpt_nm"),
				MCItemDef.create("cst_po_no", "cst_po_no"),
				MCItemDef.create("cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("cst_dlv_inst_no", "cst_dlv_inst_no"),
				MCItemDef.create("cst_dlv_inst_d_no", "cst_dlv_inst_d_no"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("base_ac_dt", "base_ac_dt"),
				MCItemDef.create("arr_cnt_rmrks", "arr_cnt_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_seq", "dlv_slip_seq"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("skip_chk_ship_flg", "skip_chk_ship_flg"),
				MCItemDef.create("non_upd_flg", "non_upd_flg"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("prov_basis_typ", "prov_basis_typ"),
				MCItemDef.create("wms_flg", "wms_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_ship_act_no", "ext_ship_act_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("ShipAct_InptChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5540_ShipAct_InptChk02_INFO = new MCOperationInfo("MS", "MSBEL5540", "ShipAct_InptChk02", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5540_ShipAct_InptChk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5540", "ShipAct_InptChk02",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("ship_act_no", "ship_act_no"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("dlv_slip_prnt_flg", "dlv_slip_prnt_flg"),
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("ShipAct_InptChk02_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL5540_ShipAct_InptChk02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5540", "ShipAct_InptChk02",
			new MCItemDef[]{
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("ship_pr_no", "ship_pr_no")
			}
			,
			MCBlockDef.create("ShipAct_InptChk02_Cntr")
		);
	}


	public static MCContainerDef MS_MSBEL5540_ShipAct_InptChk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5540", "ShipAct_InptChk02",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("ship_act_no", "ship_act_no"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("dlv_slip_prnt_flg", "dlv_slip_prnt_flg"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("ShipAct_InptChk02_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5540_ShipAct_RevUpd01_INFO = new MCOperationInfo("MS", "MSBEL5540", "ShipAct_RevUpd01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5540_ShipAct_RevUpd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5540", "ShipAct_RevUpd01",
			new MCItemDef[]{
				MCItemDef.create("rev_data_src_no", "rev_data_src_no"),
				MCItemDef.create("rev_no", "rev_no")
			}
			,
			MCBlockDef.create("ShipAct_RevUpd01_Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

