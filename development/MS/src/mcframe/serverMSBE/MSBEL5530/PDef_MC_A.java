package mcframe.serverMSBE.MSBEL5530;

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
 * [MSBEL_ShipInstService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBEL5530.ShipInst_Chk01.UP.BLOCK0")){
			return MS_MSBEL5530_ShipInst_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5530.ShipInst_Chk01.UP.BLOCK1")){
			return MS_MSBEL5530_ShipInst_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5530.ShipInst_Chk01.UP.BLOCK2")){
			return MS_MSBEL5530_ShipInst_Chk01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBEL5530.ShipInst_Chk01.DOWN.BLOCK0")){
			return MS_MSBEL5530_ShipInst_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5530.ShipInst_Chk01.DOWN.BLOCK1")){
			return MS_MSBEL5530_ShipInst_Chk01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5530.ShipInst_Chk01.DOWN.BLOCK2")){
			return MS_MSBEL5530_ShipInst_Chk01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBEL5530.ShipInst_Chk02.UP.BLOCK0")){
			return MS_MSBEL5530_ShipInst_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5530.ShipInst_Chk02.UP.BLOCK1")){
			return MS_MSBEL5530_ShipInst_Chk02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5530.ShipInst_Chk02.DOWN.BLOCK0")){
			return MS_MSBEL5530_ShipInst_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5530.ShipInst_Chk02.DOWN.BLOCK1")){
			return MS_MSBEL5530_ShipInst_Chk02_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5530.ShipInst_Chk03.UP.BLOCK0")){
			return MS_MSBEL5530_ShipInst_Chk03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5530.ShipInst_Chk03.UP.BLOCK1")){
			return MS_MSBEL5530_ShipInst_Chk03_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5530.ShipInst_Chk03.DOWN.BLOCK0")){
			return MS_MSBEL5530_ShipInst_Chk03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5530.ShipInst_Chk03.DOWN.BLOCK1")){
			return MS_MSBEL5530_ShipInst_Chk03_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5530.ShipInst_Ins01.UP.BLOCK0")){
			return MS_MSBEL5530_ShipInst_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5530.ShipInst_Ins01.UP.BLOCK1")){
			return MS_MSBEL5530_ShipInst_Ins01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5530.ShipInst_Ins01.UP.BLOCK2")){
			return MS_MSBEL5530_ShipInst_Ins01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBEL5530.ShipInst_Ins01.UP.BLOCK3")){
			return MS_MSBEL5530_ShipInst_Ins01_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBEL5530.ShipInst_Ins01.DOWN.BLOCK0")){
			return MS_MSBEL5530_ShipInst_Ins01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5530.ShipInst_Ins01.DOWN.BLOCK1")){
			return MS_MSBEL5530_ShipInst_Ins01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5530.ShipInst_Ins01.DOWN.BLOCK2")){
			return MS_MSBEL5530_ShipInst_Ins01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBEL5530.ShipInst_Upd01.UP.BLOCK0")){
			return MS_MSBEL5530_ShipInst_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5530.ShipInst_Upd01.UP.BLOCK1")){
			return MS_MSBEL5530_ShipInst_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5530.ShipInst_Upd01.UP.BLOCK2")){
			return MS_MSBEL5530_ShipInst_Upd01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBEL5530.ShipInst_Upd01.DOWN.BLOCK0")){
			return MS_MSBEL5530_ShipInst_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5530.ShipInst_Upd01.DOWN.BLOCK1")){
			return MS_MSBEL5530_ShipInst_Upd01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5530.ShipInst_Upd02.UP.BLOCK0")){
			return MS_MSBEL5530_ShipInst_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5530.ShipInst_Upd02.DOWN.BLOCK0")){
			return MS_MSBEL5530_ShipInst_Upd02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5530.ShipInst_Del01.UP.BLOCK0")){
			return MS_MSBEL5530_ShipInst_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5530.ShipInst_Del01.UP.BLOCK1")){
			return MS_MSBEL5530_ShipInst_Del01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5530.ShipInst_Del01.UP.BLOCK2")){
			return MS_MSBEL5530_ShipInst_Del01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBEL5530.ShipInst_Del01.DOWN.BLOCK0")){
			return MS_MSBEL5530_ShipInst_Del01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5530.ShipInst_RevUpd01.UP.BLOCK0")){
			return MS_MSBEL5530_ShipInst_RevUpd01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
								
	
	static final MCOperationInfo MS_MSBEL5530_ShipInst_Chk01_INFO = new MCOperationInfo("MS", "MSBEL5530", "ShipInst_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5530_ShipInst_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5530", "ShipInst_Chk01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ship_term_cd", "ship_term_cd"),
				MCItemDef.create("ship_wk_cd", "ship_wk_cd"),
				MCItemDef.create("ship_schd_tm", "ship_schd_tm"),
				MCItemDef.create("dlv_schd_tm", "dlv_schd_tm"),
				MCItemDef.create("inst_dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("ship_inst_tm", "ship_inst_tm"),
				MCItemDef.create("ship_to_lg_grp_cd", "ship_to_lg_grp_cd"),
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
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("inst_rmrks", "inst_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("pck_prnt_flg", "pck_prnt_flg"),
				MCItemDef.create("ship_prnt_flg", "ship_prnt_flg"),
				MCItemDef.create("dlv_prnt_flg", "dlv_prnt_flg"),
				MCItemDef.create("adv_prnt_flg", "adv_prnt_flg"),
				MCItemDef.create("hdr_dtl_peg", "hdr_dtl_peg"),
				MCItemDef.create("is_src_shipinst_list_flg", "is_src_shipinst_list_flg"),
				MCItemDef.create("lot_chk_off_flg", "lot_chk_off_flg")
			}
			,
			MCBlockDef.create("ShipInst_Chk01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL5530_ShipInst_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5530", "ShipInst_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("tmp_inst_d_no", "tmp_inst_d_no"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("ship_loc_cd", "ship_loc_cd"),
				MCItemDef.create("ship_str_ln_cd", "ship_str_ln_cd"),
				MCItemDef.create("ship_lg_grp_cd", "ship_lg_grp_cd"),
				MCItemDef.create("alloc_loc_cd", "alloc_loc_cd"),
				MCItemDef.create("alloc_str_ln_cd", "alloc_str_ln_cd"),
				MCItemDef.create("dlv_str_ln_cd", "dlv_str_ln_cd"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
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
				MCItemDef.create("lot_none_flg", "lot_none_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("alloc_lot_no", "alloc_lot_no"),
				MCItemDef.create("alloc_sublot_no", "alloc_sublot_no"),
				MCItemDef.create("alloc_ver_no", "alloc_ver_no"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("alloc_ent_unit_qty", "alloc_ent_unit_qty"),
				MCItemDef.create("alloc_ent_unit_cd", "alloc_ent_unit_cd"),
				MCItemDef.create("alloc_base_unit_qty", "alloc_base_unit_qty"),
				MCItemDef.create("alloc_base_unit_cd", "alloc_base_unit_cd"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("not_lot_mix_flg", "not_lot_mix_flg"),
				MCItemDef.create("not_sublot_mix_flg", "not_sublot_mix_flg"),
				MCItemDef.create("valid_dt_from", "valid_dt_from"),
				MCItemDef.create("valid_dt_to", "valid_dt_to"),
				MCItemDef.create("base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("base_ac_dt", "base_ac_dt"),
				MCItemDef.create("ship_cnt_rmrks", "ship_cnt_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("inst_d_rmrks", "inst_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("alloc_tgt_flg", "alloc_tgt_flg"),
				MCItemDef.create("inst_bndl_flg", "inst_bndl_flg"),
				MCItemDef.create("skip_chk_ship_flg", "skip_chk_ship_flg"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("alloc_scope_typ", "alloc_scope_typ"),
				MCItemDef.create("sas" + ".ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("hdr_dtl_peg", "hdr_dtl_peg"),
				MCItemDef.create("wms_flg", "wms_flg")
			}
			,
			MCBlockDef.create("ShipInst_Chk01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBEL5530_ShipInst_Chk01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL5530", "ShipInst_Chk01",
			new MCItemDef[]{
				MCItemDef.create("tmp_inst_d_no", "tmp_inst_d_no"),
				MCItemDef.create("sp" + ".ship_pr_no", "ship_pr_no"),
				MCItemDef.create("ss" + ".ship_schd_no", "ship_schd_no"),
				MCItemDef.create("hdr_dtl_peg", "hdr_dtl_peg")
			}
			,
			MCBlockDef.create("ShipSchd_Chk01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL5530_ShipInst_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5530", "ShipInst_Chk01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ship_term_cd", "ship_term_cd"),
				MCItemDef.create("ship_wk_cd", "ship_wk_cd"),
				MCItemDef.create("ship_schd_tm", "ship_schd_tm"),
				MCItemDef.create("dlv_schd_tm", "dlv_schd_tm"),
				MCItemDef.create("inst_dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("ship_inst_tm", "ship_inst_tm"),
				MCItemDef.create("ship_to_lg_grp_cd", "ship_to_lg_grp_cd"),
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
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("inst_rmrks", "inst_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("pck_prnt_flg", "pck_prnt_flg"),
				MCItemDef.create("ship_prnt_flg", "ship_prnt_flg"),
				MCItemDef.create("dlv_prnt_flg", "dlv_prnt_flg"),
				MCItemDef.create("adv_prnt_flg", "adv_prnt_flg"),
				MCItemDef.create("hdr_dtl_peg", "hdr_dtl_peg"),
				MCItemDef.create("is_src_shipinst_list_flg", "is_src_shipinst_list_flg")
			}
			,
			MCBlockDef.create("ShipInst_Chk01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBEL5530_ShipInst_Chk01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5530", "ShipInst_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("tmp_inst_d_no", "tmp_inst_d_no"),
				MCItemDef.create("ship_inst_d_no", "ship_inst_d_no"),
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("ship_loc_cd", "ship_loc_cd"),
				MCItemDef.create("ship_str_ln_cd", "ship_str_ln_cd"),
				MCItemDef.create("ship_lg_grp_cd", "ship_lg_grp_cd"),
				MCItemDef.create("alloc_loc_cd", "alloc_loc_cd"),
				MCItemDef.create("alloc_str_ln_cd", "alloc_str_ln_cd"),
				MCItemDef.create("dlv_str_ln_cd", "dlv_str_ln_cd"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
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
				MCItemDef.create("lot_none_flg", "lot_none_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("alloc_lot_no", "alloc_lot_no"),
				MCItemDef.create("alloc_sublot_no", "alloc_sublot_no"),
				MCItemDef.create("alloc_ver_no", "alloc_ver_no"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("alloc_ent_unit_qty", "alloc_ent_unit_qty"),
				MCItemDef.create("alloc_ent_unit_cd", "alloc_ent_unit_cd"),
				MCItemDef.create("alloc_base_unit_qty", "alloc_base_unit_qty"),
				MCItemDef.create("alloc_base_unit_cd", "alloc_base_unit_cd"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("not_lot_mix_flg", "not_lot_mix_flg"),
				MCItemDef.create("not_sublot_mix_flg", "not_sublot_mix_flg"),
				MCItemDef.create("valid_dt_from", "valid_dt_from"),
				MCItemDef.create("valid_dt_to", "valid_dt_to"),
				MCItemDef.create("base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("base_ac_dt", "base_ac_dt"),
				MCItemDef.create("ship_cnt_rmrks", "ship_cnt_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("inst_d_rmrks", "inst_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("alloc_tgt_flg", "alloc_tgt_flg"),
				MCItemDef.create("alloc_flg", "alloc_flg"),
				MCItemDef.create("inst_bndl_flg", "inst_bndl_flg"),
				MCItemDef.create("skip_chk_ship_flg", "skip_chk_ship_flg"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("alloc_scope_typ", "alloc_scope_typ"),
				MCItemDef.create("sas" + ".ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("sas" + ".alloc_flg", "sas_alloc_flg"),
				MCItemDef.create("hdr_dtl_peg", "hdr_dtl_peg"),
				MCItemDef.create("wms_flg", "wms_flg")
			}
			,
			MCBlockDef.create("ShipInst_Chk01_Dtl")
		);
	}
	public static MCContainerDef MS_MSBEL5530_ShipInst_Chk01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL5530", "ShipInst_Chk01",
			new MCItemDef[]{
				MCItemDef.create("tmp_inst_d_no", "tmp_inst_d_no"),
				MCItemDef.create("sp" + ".ship_pr_no", "ship_pr_no"),
				MCItemDef.create("ss" + ".ship_schd_no", "ship_schd_no"),
				MCItemDef.create("hdr_dtl_peg", "hdr_dtl_peg")
			}
			,
			MCBlockDef.create("ShipSchd_Chk01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5530_ShipInst_Chk02_INFO = new MCOperationInfo("MS", "MSBEL5530", "ShipInst_Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5530_ShipInst_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5530", "ShipInst_Chk02",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ship_term_cd", "ship_term_cd"),
				MCItemDef.create("ship_wk_cd", "ship_wk_cd"),
				MCItemDef.create("ship_schd_tm", "ship_schd_tm"),
				MCItemDef.create("dlv_schd_tm", "dlv_schd_tm"),
				MCItemDef.create("inst_dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("ship_inst_tm", "ship_inst_tm"),
				MCItemDef.create("ship_to_lg_grp_cd", "ship_to_lg_grp_cd"),
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
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("inst_rmrks", "inst_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("pck_prnt_flg", "pck_prnt_flg"),
				MCItemDef.create("ship_prnt_flg", "ship_prnt_flg"),
				MCItemDef.create("dlv_prnt_flg", "dlv_prnt_flg"),
				MCItemDef.create("adv_prnt_flg", "adv_prnt_flg"),
				MCItemDef.create("hdr_dtl_peg", "hdr_dtl_peg"),
				MCItemDef.create("is_src_shipinst_list_flg", "is_src_shipinst_list_flg"),
				MCItemDef.create("lot_chk_off_flg", "lot_chk_off_flg")
			}
			,
			MCBlockDef.create("ShipInst_Chk02_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL5530_ShipInst_Chk02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5530", "ShipInst_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("tmp_inst_d_no", "tmp_inst_d_no"),
				MCItemDef.create("ship_inst_d_no", "ship_inst_d_no"),
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("ship_loc_cd", "ship_loc_cd"),
				MCItemDef.create("ship_str_ln_cd", "ship_str_ln_cd"),
				MCItemDef.create("ship_lg_grp_cd", "ship_lg_grp_cd"),
				MCItemDef.create("alloc_loc_cd", "alloc_loc_cd"),
				MCItemDef.create("alloc_str_ln_cd", "alloc_str_ln_cd"),
				MCItemDef.create("dlv_str_ln_cd", "dlv_str_ln_cd"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
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
				MCItemDef.create("lot_none_flg", "lot_none_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("alloc_lot_no", "alloc_lot_no"),
				MCItemDef.create("alloc_sublot_no", "alloc_sublot_no"),
				MCItemDef.create("alloc_ver_no", "alloc_ver_no"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("alloc_ent_unit_qty", "alloc_ent_unit_qty"),
				MCItemDef.create("alloc_ent_unit_cd", "alloc_ent_unit_cd"),
				MCItemDef.create("alloc_base_unit_qty", "alloc_base_unit_qty"),
				MCItemDef.create("alloc_base_unit_cd", "alloc_base_unit_cd"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("not_lot_mix_flg", "not_lot_mix_flg"),
				MCItemDef.create("not_sublot_mix_flg", "not_sublot_mix_flg"),
				MCItemDef.create("valid_dt_from", "valid_dt_from"),
				MCItemDef.create("valid_dt_to", "valid_dt_to"),
				MCItemDef.create("ship_cnt_rmrks", "ship_cnt_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("inst_d_rmrks", "inst_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("alloc_tgt_flg", "alloc_tgt_flg"),
				MCItemDef.create("inst_bndl_flg", "inst_bndl_flg"),
				MCItemDef.create("skip_chk_ship_flg", "skip_chk_ship_flg"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("alloc_scope_typ", "alloc_scope_typ"),
				MCItemDef.create("sas" + ".ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("hdr_dtl_peg", "hdr_dtl_peg"),
				MCItemDef.create("wms_flg", "wms_flg")
			}
			,
			MCBlockDef.create("ShipInst_Chk02_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL5530_ShipInst_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5530", "ShipInst_Chk02",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ship_term_cd", "ship_term_cd"),
				MCItemDef.create("ship_wk_cd", "ship_wk_cd"),
				MCItemDef.create("ship_schd_tm", "ship_schd_tm"),
				MCItemDef.create("dlv_schd_tm", "dlv_schd_tm"),
				MCItemDef.create("inst_dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("ship_inst_tm", "ship_inst_tm"),
				MCItemDef.create("ship_to_lg_grp_cd", "ship_to_lg_grp_cd"),
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
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("inst_rmrks", "inst_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("pck_prnt_flg", "pck_prnt_flg"),
				MCItemDef.create("ship_prnt_flg", "ship_prnt_flg"),
				MCItemDef.create("dlv_prnt_flg", "dlv_prnt_flg"),
				MCItemDef.create("adv_prnt_flg", "adv_prnt_flg"),
				MCItemDef.create("hdr_dtl_peg", "hdr_dtl_peg"),
				MCItemDef.create("is_src_shipinst_list_flg", "is_src_shipinst_list_flg")
			}
			,
			MCBlockDef.create("ShipInst_Chk02_Hdr")
		);
	}
	public static MCContainerDef MS_MSBEL5530_ShipInst_Chk02_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5530", "ShipInst_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("tmp_inst_d_no", "tmp_inst_d_no"),
				MCItemDef.create("ship_inst_d_no", "ship_inst_d_no"),
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("ship_loc_cd", "ship_loc_cd"),
				MCItemDef.create("ship_str_ln_cd", "ship_str_ln_cd"),
				MCItemDef.create("ship_lg_grp_cd", "ship_lg_grp_cd"),
				MCItemDef.create("alloc_loc_cd", "alloc_loc_cd"),
				MCItemDef.create("alloc_str_ln_cd", "alloc_str_ln_cd"),
				MCItemDef.create("dlv_str_ln_cd", "dlv_str_ln_cd"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
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
				MCItemDef.create("lot_none_flg", "lot_none_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("alloc_lot_no", "alloc_lot_no"),
				MCItemDef.create("alloc_sublot_no", "alloc_sublot_no"),
				MCItemDef.create("alloc_ver_no", "alloc_ver_no"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("alloc_ent_unit_qty", "alloc_ent_unit_qty"),
				MCItemDef.create("alloc_ent_unit_cd", "alloc_ent_unit_cd"),
				MCItemDef.create("alloc_base_unit_qty", "alloc_base_unit_qty"),
				MCItemDef.create("alloc_base_unit_cd", "alloc_base_unit_cd"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("not_lot_mix_flg", "not_lot_mix_flg"),
				MCItemDef.create("not_sublot_mix_flg", "not_sublot_mix_flg"),
				MCItemDef.create("valid_dt_from", "valid_dt_from"),
				MCItemDef.create("valid_dt_to", "valid_dt_to"),
				MCItemDef.create("ship_cnt_rmrks", "ship_cnt_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("inst_d_rmrks", "inst_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("alloc_tgt_flg", "alloc_tgt_flg"),
				MCItemDef.create("alloc_flg", "alloc_flg"),
				MCItemDef.create("inst_bndl_flg", "inst_bndl_flg"),
				MCItemDef.create("skip_chk_ship_flg", "skip_chk_ship_flg"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("alloc_scope_typ", "alloc_scope_typ"),
				MCItemDef.create("sas" + ".ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("sas" + ".alloc_flg", "sas_alloc_flg"),
				MCItemDef.create("hdr_dtl_peg", "hdr_dtl_peg"),
				MCItemDef.create("wms_flg", "wms_flg")
			}
			,
			MCBlockDef.create("ShipInst_Chk02_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5530_ShipInst_Chk03_INFO = new MCOperationInfo("MS", "MSBEL5530", "ShipInst_Chk03", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5530_ShipInst_Chk03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5530", "ShipInst_Chk03",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("dlv_prnt_flg", "dlv_prnt_flg"),
				MCItemDef.create("is_src_shipinst_list_flg", "is_src_shipinst_list_flg")
			}
			,
			MCBlockDef.create("ShipInst_Chk03_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL5530_ShipInst_Chk03_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5530", "ShipInst_Chk03",
			new MCItemDef[]{
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("wms_flg", "wms_flg")
			}
			,
			MCBlockDef.create("ShipInst_Chk03_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL5530_ShipInst_Chk03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5530", "ShipInst_Chk03",
			new MCItemDef[]{
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("dlv_prnt_flg", "dlv_prnt_flg"),
				MCItemDef.create("is_src_shipinst_list_flg", "is_src_shipinst_list_flg")
			}
			,
			MCBlockDef.create("ShipInst_Chk03_Hdr")
		);
	}
	public static MCContainerDef MS_MSBEL5530_ShipInst_Chk03_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5530", "ShipInst_Chk03",
			new MCItemDef[]{
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("wms_flg", "wms_flg")
			}
			,
			MCBlockDef.create("ShipInst_Chk03_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5530_ShipInst_Ins01_INFO = new MCOperationInfo("MS", "MSBEL5530", "ShipInst_Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5530_ShipInst_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5530", "ShipInst_Ins01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ship_term_cd", "ship_term_cd"),
				MCItemDef.create("ship_wk_cd", "ship_wk_cd"),
				MCItemDef.create("ship_schd_tm", "ship_schd_tm"),
				MCItemDef.create("dlv_schd_tm", "dlv_schd_tm"),
				MCItemDef.create("inst_dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("ship_inst_tm", "ship_inst_tm"),
				MCItemDef.create("ship_to_lg_grp_cd", "ship_to_lg_grp_cd"),
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
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("inst_rmrks", "inst_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("pck_prnt_flg", "pck_prnt_flg"),
				MCItemDef.create("ship_prnt_flg", "ship_prnt_flg"),
				MCItemDef.create("dlv_prnt_flg", "dlv_prnt_flg"),
				MCItemDef.create("adv_prnt_flg", "adv_prnt_flg"),
				MCItemDef.create("hdr_dtl_peg", "hdr_dtl_peg"),
				MCItemDef.create("is_src_shipinst_list_flg", "is_src_shipinst_list_flg"),
				MCItemDef.create("lot_chk_off_flg", "lot_chk_off_flg")
			}
			,
			MCBlockDef.create("ShipInst_Ins01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL5530_ShipInst_Ins01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5530", "ShipInst_Ins01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("tmp_inst_d_no", "tmp_inst_d_no"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("ship_loc_cd", "ship_loc_cd"),
				MCItemDef.create("ship_str_ln_cd", "ship_str_ln_cd"),
				MCItemDef.create("ship_lg_grp_cd", "ship_lg_grp_cd"),
				MCItemDef.create("alloc_loc_cd", "alloc_loc_cd"),
				MCItemDef.create("alloc_str_ln_cd", "alloc_str_ln_cd"),
				MCItemDef.create("dlv_str_ln_cd", "dlv_str_ln_cd"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
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
				MCItemDef.create("lot_none_flg", "lot_none_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("alloc_lot_no", "alloc_lot_no"),
				MCItemDef.create("alloc_sublot_no", "alloc_sublot_no"),
				MCItemDef.create("alloc_ver_no", "alloc_ver_no"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("alloc_ent_unit_qty", "alloc_ent_unit_qty"),
				MCItemDef.create("alloc_ent_unit_cd", "alloc_ent_unit_cd"),
				MCItemDef.create("alloc_base_unit_qty", "alloc_base_unit_qty"),
				MCItemDef.create("alloc_base_unit_cd", "alloc_base_unit_cd"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("not_lot_mix_flg", "not_lot_mix_flg"),
				MCItemDef.create("not_sublot_mix_flg", "not_sublot_mix_flg"),
				MCItemDef.create("valid_dt_from", "valid_dt_from"),
				MCItemDef.create("valid_dt_to", "valid_dt_to"),
				MCItemDef.create("base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("base_ac_dt", "base_ac_dt"),
				MCItemDef.create("ship_cnt_rmrks", "ship_cnt_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("inst_d_rmrks", "inst_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("alloc_tgt_flg", "alloc_tgt_flg"),
				MCItemDef.create("inst_bndl_flg", "inst_bndl_flg"),
				MCItemDef.create("skip_chk_ship_flg", "skip_chk_ship_flg"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("alloc_scope_typ", "alloc_scope_typ"),
				MCItemDef.create("sas" + ".ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("hdr_dtl_peg", "hdr_dtl_peg"),
				MCItemDef.create("wms_flg", "wms_flg")
			}
			,
			MCBlockDef.create("ShipInst_Ins01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBEL5530_ShipInst_Ins01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL5530", "ShipInst_Ins01",
			new MCItemDef[]{
				MCItemDef.create("tmp_inst_d_no", "tmp_inst_d_no"),
				MCItemDef.create("sp" + ".ship_pr_no", "ship_pr_no"),
				MCItemDef.create("ss" + ".ship_schd_no", "ship_schd_no"),
				MCItemDef.create("hdr_dtl_peg", "hdr_dtl_peg")
			}
			,
			MCBlockDef.create("ShipSchd_Ins01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBEL5530_ShipInst_Ins01_UP_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBEL5530", "ShipInst_Ins01",
			new MCItemDef[]{
				MCItemDef.create("bndl_inst_prnt_flg", "bndl_inst_prnt_flg"),
				MCItemDef.create("bndl_prnt_flg", "bndl_prnt_flg")
			}
			,
			MCBlockDef.create("ShipInst_Ins01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL5530_ShipInst_Ins01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5530", "ShipInst_Ins01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ship_term_cd", "ship_term_cd"),
				MCItemDef.create("ship_wk_cd", "ship_wk_cd"),
				MCItemDef.create("ship_schd_tm", "ship_schd_tm"),
				MCItemDef.create("dlv_schd_tm", "dlv_schd_tm"),
				MCItemDef.create("inst_dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("ship_inst_tm", "ship_inst_tm"),
				MCItemDef.create("ship_to_lg_grp_cd", "ship_to_lg_grp_cd"),
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
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("inst_rmrks", "inst_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("pck_prnt_flg", "pck_prnt_flg"),
				MCItemDef.create("ship_prnt_flg", "ship_prnt_flg"),
				MCItemDef.create("dlv_prnt_flg", "dlv_prnt_flg"),
				MCItemDef.create("adv_prnt_flg", "adv_prnt_flg"),
				MCItemDef.create("hdr_dtl_peg", "hdr_dtl_peg")
			}
			,
			MCBlockDef.create("ShipInst_Ins01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBEL5530_ShipInst_Ins01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5530", "ShipInst_Ins01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("tmp_inst_d_no", "tmp_inst_d_no"),
				MCItemDef.create("ship_inst_d_no", "ship_inst_d_no"),
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("ship_loc_cd", "ship_loc_cd"),
				MCItemDef.create("ship_str_ln_cd", "ship_str_ln_cd"),
				MCItemDef.create("ship_lg_grp_cd", "ship_lg_grp_cd"),
				MCItemDef.create("alloc_loc_cd", "alloc_loc_cd"),
				MCItemDef.create("alloc_str_ln_cd", "alloc_str_ln_cd"),
				MCItemDef.create("dlv_str_ln_cd", "dlv_str_ln_cd"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
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
				MCItemDef.create("lot_none_flg", "lot_none_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("alloc_lot_no", "alloc_lot_no"),
				MCItemDef.create("alloc_sublot_no", "alloc_sublot_no"),
				MCItemDef.create("alloc_ver_no", "alloc_ver_no"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("alloc_ent_unit_qty", "alloc_ent_unit_qty"),
				MCItemDef.create("alloc_ent_unit_cd", "alloc_ent_unit_cd"),
				MCItemDef.create("alloc_base_unit_qty", "alloc_base_unit_qty"),
				MCItemDef.create("alloc_base_unit_cd", "alloc_base_unit_cd"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("not_lot_mix_flg", "not_lot_mix_flg"),
				MCItemDef.create("not_sublot_mix_flg", "not_sublot_mix_flg"),
				MCItemDef.create("valid_dt_from", "valid_dt_from"),
				MCItemDef.create("valid_dt_to", "valid_dt_to"),
				MCItemDef.create("base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("base_ac_dt", "base_ac_dt"),
				MCItemDef.create("ship_cnt_rmrks", "ship_cnt_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("inst_d_rmrks", "inst_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("alloc_tgt_flg", "alloc_tgt_flg"),
				MCItemDef.create("alloc_flg", "alloc_flg"),
				MCItemDef.create("inst_bndl_flg", "inst_bndl_flg"),
				MCItemDef.create("skip_chk_ship_flg", "skip_chk_ship_flg"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("alloc_scope_typ", "alloc_scope_typ"),
				MCItemDef.create("sas" + ".ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("sas" + ".alloc_flg", "sas_alloc_flg"),
				MCItemDef.create("hdr_dtl_peg", "hdr_dtl_peg")
			}
			,
			MCBlockDef.create("ShipInst_Ins01_Dtl")
		);
	}
	public static MCContainerDef MS_MSBEL5530_ShipInst_Ins01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL5530", "ShipInst_Ins01",
			new MCItemDef[]{
				MCItemDef.create("tmp_inst_d_no", "tmp_inst_d_no"),
				MCItemDef.create("sp" + ".ship_pr_no", "ship_pr_no"),
				MCItemDef.create("ss" + ".ship_schd_no", "ship_schd_no"),
				MCItemDef.create("hdr_dtl_peg", "hdr_dtl_peg")
			}
			,
			MCBlockDef.create("ShipSchd_Ins01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5530_ShipInst_Upd01_INFO = new MCOperationInfo("MS", "MSBEL5530", "ShipInst_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5530_ShipInst_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5530", "ShipInst_Upd01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ship_term_cd", "ship_term_cd"),
				MCItemDef.create("ship_wk_cd", "ship_wk_cd"),
				MCItemDef.create("ship_schd_tm", "ship_schd_tm"),
				MCItemDef.create("dlv_schd_tm", "dlv_schd_tm"),
				MCItemDef.create("inst_dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("ship_inst_tm", "ship_inst_tm"),
				MCItemDef.create("ship_to_lg_grp_cd", "ship_to_lg_grp_cd"),
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
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("inst_rmrks", "inst_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("pck_prnt_flg", "pck_prnt_flg"),
				MCItemDef.create("ship_prnt_flg", "ship_prnt_flg"),
				MCItemDef.create("dlv_prnt_flg", "dlv_prnt_flg"),
				MCItemDef.create("adv_prnt_flg", "adv_prnt_flg"),
				MCItemDef.create("hdr_dtl_peg", "hdr_dtl_peg"),
				MCItemDef.create("is_src_shipinst_list_flg", "is_src_shipinst_list_flg"),
				MCItemDef.create("lot_chk_off_flg", "lot_chk_off_flg")
			}
			,
			MCBlockDef.create("ShipInst_Upd01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL5530_ShipInst_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5530", "ShipInst_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("tmp_inst_d_no", "tmp_inst_d_no"),
				MCItemDef.create("ship_inst_d_no", "ship_inst_d_no"),
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("ship_loc_cd", "ship_loc_cd"),
				MCItemDef.create("ship_str_ln_cd", "ship_str_ln_cd"),
				MCItemDef.create("ship_lg_grp_cd", "ship_lg_grp_cd"),
				MCItemDef.create("alloc_loc_cd", "alloc_loc_cd"),
				MCItemDef.create("alloc_str_ln_cd", "alloc_str_ln_cd"),
				MCItemDef.create("dlv_str_ln_cd", "dlv_str_ln_cd"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
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
				MCItemDef.create("lot_none_flg", "lot_none_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("alloc_lot_no", "alloc_lot_no"),
				MCItemDef.create("alloc_sublot_no", "alloc_sublot_no"),
				MCItemDef.create("alloc_ver_no", "alloc_ver_no"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("alloc_ent_unit_qty", "alloc_ent_unit_qty"),
				MCItemDef.create("alloc_ent_unit_cd", "alloc_ent_unit_cd"),
				MCItemDef.create("alloc_base_unit_qty", "alloc_base_unit_qty"),
				MCItemDef.create("alloc_base_unit_cd", "alloc_base_unit_cd"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("not_lot_mix_flg", "not_lot_mix_flg"),
				MCItemDef.create("not_sublot_mix_flg", "not_sublot_mix_flg"),
				MCItemDef.create("valid_dt_from", "valid_dt_from"),
				MCItemDef.create("valid_dt_to", "valid_dt_to"),
				MCItemDef.create("base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("base_ac_dt", "base_ac_dt"),
				MCItemDef.create("ship_cnt_rmrks", "ship_cnt_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("inst_d_rmrks", "inst_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("alloc_tgt_flg", "alloc_tgt_flg"),
				MCItemDef.create("inst_bndl_flg", "inst_bndl_flg"),
				MCItemDef.create("skip_chk_ship_flg", "skip_chk_ship_flg"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("alloc_scope_typ", "alloc_scope_typ"),
				MCItemDef.create("sas" + ".ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("hdr_dtl_peg", "hdr_dtl_peg"),
				MCItemDef.create("wms_flg", "wms_flg")
			}
			,
			MCBlockDef.create("ShipInst_Upd01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBEL5530_ShipInst_Upd01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL5530", "ShipInst_Upd01",
			new MCItemDef[]{
				MCItemDef.create("bndl_inst_prnt_flg", "bndl_inst_prnt_flg"),
				MCItemDef.create("bndl_prnt_flg", "bndl_prnt_flg")
			}
			,
			MCBlockDef.create("ShipInst_Upd01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL5530_ShipInst_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5530", "ShipInst_Upd01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ship_term_cd", "ship_term_cd"),
				MCItemDef.create("ship_wk_cd", "ship_wk_cd"),
				MCItemDef.create("ship_schd_tm", "ship_schd_tm"),
				MCItemDef.create("dlv_schd_tm", "dlv_schd_tm"),
				MCItemDef.create("inst_dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("ship_inst_tm", "ship_inst_tm"),
				MCItemDef.create("ship_to_lg_grp_cd", "ship_to_lg_grp_cd"),
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
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("inst_rmrks", "inst_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("pck_prnt_flg", "pck_prnt_flg"),
				MCItemDef.create("ship_prnt_flg", "ship_prnt_flg"),
				MCItemDef.create("dlv_prnt_flg", "dlv_prnt_flg"),
				MCItemDef.create("adv_prnt_flg", "adv_prnt_flg"),
				MCItemDef.create("hdr_dtl_peg", "hdr_dtl_peg")
			}
			,
			MCBlockDef.create("ShipInst_Upd01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBEL5530_ShipInst_Upd01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5530", "ShipInst_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("tmp_inst_d_no", "tmp_inst_d_no"),
				MCItemDef.create("ship_inst_d_no", "ship_inst_d_no"),
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("ship_loc_cd", "ship_loc_cd"),
				MCItemDef.create("ship_str_ln_cd", "ship_str_ln_cd"),
				MCItemDef.create("ship_lg_grp_cd", "ship_lg_grp_cd"),
				MCItemDef.create("alloc_loc_cd", "alloc_loc_cd"),
				MCItemDef.create("alloc_str_ln_cd", "alloc_str_ln_cd"),
				MCItemDef.create("dlv_str_ln_cd", "dlv_str_ln_cd"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
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
				MCItemDef.create("lot_none_flg", "lot_none_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("alloc_lot_no", "alloc_lot_no"),
				MCItemDef.create("alloc_sublot_no", "alloc_sublot_no"),
				MCItemDef.create("alloc_ver_no", "alloc_ver_no"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("alloc_ent_unit_qty", "alloc_ent_unit_qty"),
				MCItemDef.create("alloc_ent_unit_cd", "alloc_ent_unit_cd"),
				MCItemDef.create("alloc_base_unit_qty", "alloc_base_unit_qty"),
				MCItemDef.create("alloc_base_unit_cd", "alloc_base_unit_cd"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("not_lot_mix_flg", "not_lot_mix_flg"),
				MCItemDef.create("not_sublot_mix_flg", "not_sublot_mix_flg"),
				MCItemDef.create("valid_dt_from", "valid_dt_from"),
				MCItemDef.create("valid_dt_to", "valid_dt_to"),
				MCItemDef.create("base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("base_ac_dt", "base_ac_dt"),
				MCItemDef.create("ship_cnt_rmrks", "ship_cnt_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("inst_d_rmrks", "inst_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("alloc_tgt_flg", "alloc_tgt_flg"),
				MCItemDef.create("alloc_flg", "alloc_flg"),
				MCItemDef.create("inst_bndl_flg", "inst_bndl_flg"),
				MCItemDef.create("skip_chk_ship_flg", "skip_chk_ship_flg"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("alloc_scope_typ", "alloc_scope_typ"),
				MCItemDef.create("sas" + ".ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("sas" + ".alloc_flg", "sas_alloc_flg"),
				MCItemDef.create("hdr_dtl_peg", "hdr_dtl_peg")
			}
			,
			MCBlockDef.create("ShipInst_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5530_ShipInst_Upd02_INFO = new MCOperationInfo("MS", "MSBEL5530", "ShipInst_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5530_ShipInst_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5530", "ShipInst_Upd02",
			new MCItemDef[]{
				MCItemDef.create("ship_inst_d_no", "ship_inst_d_no"),
				MCItemDef.create("abort_flg", "abort_flg")
			}
			,
			MCBlockDef.create("ShipInst_Upd02_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL5530_ShipInst_Upd02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5530", "ShipInst_Upd02",
			new MCItemDef[]{
				MCItemDef.create("ship_inst_d_no", "ship_inst_d_no"),
				MCItemDef.create("abort_flg", "abort_flg")
			}
			,
			MCBlockDef.create("ShipInst_Upd02_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5530_ShipInst_Del01_INFO = new MCOperationInfo("MS", "MSBEL5530", "ShipInst_Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5530_ShipInst_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5530", "ShipInst_Del01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("dlv_prnt_flg", "dlv_prnt_flg"),
				MCItemDef.create("is_src_shipinst_list_flg", "is_src_shipinst_list_flg")
			}
			,
			MCBlockDef.create("ShipInst_Del01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL5530_ShipInst_Del01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5530", "ShipInst_Del01",
			new MCItemDef[]{
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("wms_flg", "wms_flg")
			}
			,
			MCBlockDef.create("ShipInst_Del01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBEL5530_ShipInst_Del01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL5530", "ShipInst_Del01",
			new MCItemDef[]{
				MCItemDef.create("bndl_prnt_flg", "bndl_prnt_flg")
			}
			,
			MCBlockDef.create("ShipInst_Del01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL5530_ShipInst_Del01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5530", "ShipInst_Del01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("dlv_prnt_flg", "dlv_prnt_flg")
			}
			,
			MCBlockDef.create("ShipInst_Del01_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5530_ShipInst_RevUpd01_INFO = new MCOperationInfo("MS", "MSBEL5530", "ShipInst_RevUpd01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5530_ShipInst_RevUpd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5530", "ShipInst_RevUpd01",
			new MCItemDef[]{
				MCItemDef.create("rev_data_src_no", "rev_data_src_no"),
				MCItemDef.create("rev_no", "rev_no")
			}
			,
			MCBlockDef.create("ShipInst_RevUpd01_Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

