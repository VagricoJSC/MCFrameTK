package mcframe.serverMSBE.MSBEL6000;

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
 * [MSBEL_ArrActRcptIFService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBEL6000.Chk01.UP.BLOCK0")){
			return MS_MSBEL6000_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL6000.Chk01.UP.BLOCK1")){
			return MS_MSBEL6000_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL6000.Chk01.DOWN.BLOCK0")){
			return MS_MSBEL6000_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL6000.Chk01.DOWN.BLOCK1")){
			return MS_MSBEL6000_Chk01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL6000.ArrActIF_Upd01.UP.BLOCK0")){
			return MS_MSBEL6000_ArrActIF_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL6000.ArrActIF_Upd01.UP.BLOCK1")){
			return MS_MSBEL6000_ArrActIF_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL6000.ArrActIF_Upd01.DOWN.BLOCK0")){
			return MS_MSBEL6000_ArrActIF_Upd01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo MS_MSBEL6000_Chk01_INFO = new MCOperationInfo("MS", "MSBEL6000", "Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL6000_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL6000", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("if_upd_typ", "if_upd_typ"),
				MCItemDef.create("upd_cntr_chk_flg", "upd_cntr_chk_flg"),
				MCItemDef.create("is_src_batch_flg", "is_src_batch_flg")
			}
			,
			MCBlockDef.create("ArrActIF_Ctrl")
		);
	}

	public static MCContainerDef MS_MSBEL6000_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL6000", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("arr_act" + ".arr_act_no", "arr_act_no"),
				MCItemDef.create("arr_act" + ".arr_schd_no", "arr_schd_no"),
				MCItemDef.create("arr_act" + ".trd_cd", "trd_cd"),
				MCItemDef.create("arr_act" + ".trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("arr_act" + ".purc_act_io_no", "purc_act_io_no"),
				MCItemDef.create("arr_act" + ".arr_tm", "arr_tm"),
				MCItemDef.create("arr_act" + ".ac_dt", "ac_dt"),
				MCItemDef.create("arr_act" + ".arr_loc_cd", "arr_loc_cd"),
				MCItemDef.create("arr_act" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("arr_act" + ".arr_dpt_cd", "arr_dpt_cd"),
				MCItemDef.create("arr_act" + ".arr_usr_cd", "arr_usr_cd"),
				MCItemDef.create("arr_act" + ".itm_cd", "itm_cd"),
				MCItemDef.create("arr_act" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("arr_act" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("arr_act" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("arr_act" + ".itm_nm", "itm_nm"),
				MCItemDef.create("arr_act" + ".rcpt_iv_itm_nm", "rcpt_iv_itm_nm"),
				MCItemDef.create("arr_act" + ".sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("arr_act" + ".purc_id_typ", "purc_id_typ"),
				MCItemDef.create("arr_act" + ".stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("arr_act" + ".sno1", "sno1"),
				MCItemDef.create("arr_act" + ".sno2", "sno2"),
				MCItemDef.create("arr_act" + ".sno3", "sno3"),
				MCItemDef.create("arr_act" + ".sno4", "sno4"),
				MCItemDef.create("arr_act" + ".lot_no", "lot_no"),
				MCItemDef.create("arr_act" + ".sublot_no", "sublot_no"),
				MCItemDef.create("arr_act" + ".ver_no", "ver_no"),
				MCItemDef.create("arr_act" + ".stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("arr_act" + ".gd_cd", "gd_cd"),
				MCItemDef.create("arr_act" + ".quality_typ", "quality_typ"),
				MCItemDef.create("arr_act" + ".stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("arr_act" + ".stk_id_typ", "stk_id_typ"),
				MCItemDef.create("arr_act" + ".stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("arr_act" + ".sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("arr_act" + ".sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("arr_act" + ".cst_cd", "cst_cd"),
				MCItemDef.create("arr_act" + ".sppl_cd", "sppl_cd"),
				MCItemDef.create("arr_act" + ".maker_cd", "maker_cd"),
				MCItemDef.create("arr_act" + ".bp_lot_no", "bp_lot_no"),
				MCItemDef.create("arr_act" + ".bp_dlv_slip_no", "bp_dlv_slip_no"),
				MCItemDef.create("arr_act" + ".bp_dlv_slip_d_no", "bp_dlv_slip_d_no"),
				MCItemDef.create("arr_act" + ".ship_fr_valid_dt", "ship_fr_valid_dt"),
				MCItemDef.create("arr_act" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("arr_act" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("arr_act" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("arr_act" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("arr_act" + ".purc_cont_qty", "purc_cont_qty"),
				MCItemDef.create("arr_act" + ".rsn_cd", "rsn_cd"),
				MCItemDef.create("arr_act" + ".bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("arr_act" + ".sync_flg", "sync_flg"),
				MCItemDef.create("arr_act" + ".edi_flg", "edi_flg"),
				MCItemDef.create("arr_act" + ".insp_cnt_rmrks", "insp_cnt_rmrks"),
				MCItemDef.create("arr_act" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("arr_act" + ".trd_rmrks", "trd_rmrks"),
				MCItemDef.create("arr_act" + ".trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("arr_act" + ".sub_char1", "sub_char1"),
				MCItemDef.create("arr_act" + ".sub_char2", "sub_char2"),
				MCItemDef.create("arr_act" + ".sub_char3", "sub_char3"),
				MCItemDef.create("arr_act" + ".wms_flg", "wms_flg"),
				MCItemDef.create("arr_act" + ".ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("arr_act" + ".ext_arr_act_no", "ext_arr_act_no"),
				MCItemDef.create("arr_act" + ".lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("arr_act" + ".wg_cd", "wg_cd"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("arr_pr_no", "arr_pr_no"),
				MCItemDef.create("rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("arr_ptn_typ", "arr_ptn_typ"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("crt_lot_flg", "crt_lot_flg"),
				MCItemDef.create("same_lot_flg", "same_lot_flg"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("pre_outsrc_act_flg", "pre_outsrc_act_flg"),
				MCItemDef.create("prnt_flg", "prnt_flg"),
				MCItemDef.create("cststk_flg", "cststk_flg"),
				MCItemDef.create("arr_pr_upd_cntr", "arr_pr_upd_cntr"),
				MCItemDef.create("arr_act_upd_cntr", "arr_act_upd_cntr"),
				MCItemDef.create("rcpt_iv_upd_cntr", "rcpt_iv_upd_cntr"),
				MCItemDef.create("arr_dpt_cd_upd_flg", "arr_dpt_cd_upd_flg"),
				MCItemDef.create("arr_usr_cd_upd_flg", "arr_usr_cd_upd_flg"),
				MCItemDef.create("sno1_upd_flg", "sno1_upd_flg"),
				MCItemDef.create("sno2_upd_flg", "sno2_upd_flg"),
				MCItemDef.create("sno3_upd_flg", "sno3_upd_flg"),
				MCItemDef.create("sno4_upd_flg", "sno4_upd_flg"),
				MCItemDef.create("lot_no_upd_flg", "lot_no_upd_flg"),
				MCItemDef.create("sublot_no_upd_flg", "sublot_no_upd_flg"),
				MCItemDef.create("ver_no_upd_flg", "ver_no_upd_flg"),
				MCItemDef.create("stk_arrv_bp_cd_upd_flg", "stk_arrv_bp_cd_upd_flg"),
				MCItemDef.create("gd_cd_upd_flg", "gd_cd_upd_flg"),
				MCItemDef.create("quality_typ_upd_flg", "quality_typ_upd_flg"),
				MCItemDef.create("stk_insp_typ_upd_flg", "stk_insp_typ_upd_flg"),
				MCItemDef.create("stk_id_typ_upd_flg", "stk_id_typ_upd_flg"),
				MCItemDef.create("stk_bp_cd_upd_flg", "stk_bp_cd_upd_flg"),
				MCItemDef.create("sppl_itm_cd_upd_flg", "sppl_itm_cd_upd_flg"),
				MCItemDef.create("sppl_itm_nm_upd_flg", "sppl_itm_nm_upd_flg"),
				MCItemDef.create("maker_cd_upd_flg", "maker_cd_upd_flg"),
				MCItemDef.create("bp_lot_no_upd_flg", "bp_lot_no_upd_flg"),
				MCItemDef.create("bp_dlv_slip_no_upd_flg", "bp_dlv_slip_no_upd_flg"),
				MCItemDef.create("bp_dlv_slip_d_no_upd_flg", "bp_dlv_slip_d_no_upd_flg"),
				MCItemDef.create("ship_fr_valid_dt_upd_flg", "ship_fr_valid_dt_upd_flg"),
				MCItemDef.create("purc_cont_qty_upd_flg", "purc_cont_qty_upd_flg"),
				MCItemDef.create("insp_cnt_rmrks_upd_flg", "insp_cnt_rmrks_upd_flg"),
				MCItemDef.create("intr_rmrks_upd_flg", "intr_rmrks_upd_flg"),
				MCItemDef.create("trd_rmrks_upd_flg", "trd_rmrks_upd_flg"),
				MCItemDef.create("trd_d_rmrks_upd_flg", "trd_d_rmrks_upd_flg"),
				MCItemDef.create("sub_char1_upd_flg", "sub_char1_upd_flg"),
				MCItemDef.create("sub_char2_upd_flg", "sub_char2_upd_flg"),
				MCItemDef.create("sub_char3_upd_flg", "sub_char3_upd_flg"),
				MCItemDef.create("arr_pr_no_upd_flg", "arr_pr_no_upd_flg"),
				MCItemDef.create("iv_no_upd_flg", "iv_no_upd_flg")
			}
			,
			MCBlockDef.create("ArrActIF_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL6000_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL6000", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("ArrActIF_Ctrl")
		);
	}
	public static MCContainerDef MS_MSBEL6000_Chk01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL6000", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("arr_act" + ".arr_act_no", "arr_act_no"),
				MCItemDef.create("arr_act" + ".arr_schd_no", "arr_schd_no"),
				MCItemDef.create("arr_act" + ".trd_cd", "trd_cd"),
				MCItemDef.create("arr_act" + ".trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("arr_act" + ".arr_tm", "arr_tm"),
				MCItemDef.create("arr_act" + ".ac_dt", "ac_dt"),
				MCItemDef.create("arr_act" + ".arr_loc_cd", "arr_loc_cd"),
				MCItemDef.create("arr_act" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("arr_act" + ".arr_dpt_cd", "arr_dpt_cd"),
				MCItemDef.create("arr_act" + ".arr_usr_cd", "arr_usr_cd"),
				MCItemDef.create("arr_act" + ".itm_cd", "itm_cd"),
				MCItemDef.create("arr_act" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("arr_act" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("arr_act" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("arr_act" + ".itm_nm", "itm_nm"),
				MCItemDef.create("arr_act" + ".rcpt_iv_itm_nm", "rcpt_iv_itm_nm"),
				MCItemDef.create("arr_act" + ".sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("arr_act" + ".purc_id_typ", "purc_id_typ"),
				MCItemDef.create("arr_act" + ".sno1", "sno1"),
				MCItemDef.create("arr_act" + ".sno2", "sno2"),
				MCItemDef.create("arr_act" + ".sno3", "sno3"),
				MCItemDef.create("arr_act" + ".sno4", "sno4"),
				MCItemDef.create("arr_act" + ".lot_no", "lot_no"),
				MCItemDef.create("arr_act" + ".sublot_no", "sublot_no"),
				MCItemDef.create("arr_act" + ".ver_no", "ver_no"),
				MCItemDef.create("arr_act" + ".stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("arr_act" + ".gd_cd", "gd_cd"),
				MCItemDef.create("arr_act" + ".quality_typ", "quality_typ"),
				MCItemDef.create("arr_act" + ".stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("arr_act" + ".stk_id_typ", "stk_id_typ"),
				MCItemDef.create("arr_act" + ".stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("arr_act" + ".sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("arr_act" + ".sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("arr_act" + ".cst_cd", "cst_cd"),
				MCItemDef.create("arr_act" + ".sppl_cd", "sppl_cd"),
				MCItemDef.create("arr_act" + ".maker_cd", "maker_cd"),
				MCItemDef.create("arr_act" + ".bp_lot_no", "bp_lot_no"),
				MCItemDef.create("arr_act" + ".bp_dlv_slip_no", "bp_dlv_slip_no"),
				MCItemDef.create("arr_act" + ".bp_dlv_slip_d_no", "bp_dlv_slip_d_no"),
				MCItemDef.create("arr_act" + ".ship_fr_valid_dt", "ship_fr_valid_dt"),
				MCItemDef.create("arr_act" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("arr_act" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("arr_act" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("arr_act" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("arr_act" + ".purc_cont_qty", "purc_cont_qty"),
				MCItemDef.create("arr_act" + ".rsn_cd", "rsn_cd"),
				MCItemDef.create("arr_act" + ".bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("arr_act" + ".bd_wg_cd", "bd_wg_cd"),
				MCItemDef.create("arr_act" + ".sync_flg", "sync_flg"),
				MCItemDef.create("arr_act" + ".insp_cnt_rmrks", "insp_cnt_rmrks"),
				MCItemDef.create("arr_act" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("arr_act" + ".trd_rmrks", "trd_rmrks"),
				MCItemDef.create("arr_act" + ".trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("arr_act" + ".sub_char1", "sub_char1"),
				MCItemDef.create("arr_act" + ".sub_char2", "sub_char2"),
				MCItemDef.create("arr_act" + ".sub_char3", "sub_char3"),
				MCItemDef.create("arr_act" + ".wms_flg", "wms_flg"),
				MCItemDef.create("arr_act" + ".ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("arr_act" + ".ext_arr_act_no", "ext_arr_act_no"),
				MCItemDef.create("arr_act" + ".lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("arr_act" + ".wg_cd", "wg_cd"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("lot_no_typ", "lot_no_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("sublot_no_typ", "sublot_no_typ"),
				MCItemDef.create("bp_lot_flg", "bp_lot_flg"),
				MCItemDef.create("arr_str_ln_tgt_flg", "arr_str_ln_tgt_flg"),
				MCItemDef.create("ret_str_ln_tgt_flg", "ret_str_ln_tgt_flg"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("arr_pr_no", "arr_pr_no"),
				MCItemDef.create("rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("arr_ptn_typ", "arr_ptn_typ"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("crt_lot_flg", "crt_lot_flg"),
				MCItemDef.create("same_lot_flg", "same_lot_flg"),
				MCItemDef.create("arr_pr_upd_cntr", "arr_pr_upd_cntr"),
				MCItemDef.create("arr_act_upd_cntr", "arr_act_upd_cntr"),
				MCItemDef.create("rcpt_iv_upd_cntr", "rcpt_iv_upd_cntr"),
				MCItemDef.create("arr_dpt_cd_upd_flg", "arr_dpt_cd_upd_flg"),
				MCItemDef.create("arr_usr_cd_upd_flg", "arr_usr_cd_upd_flg"),
				MCItemDef.create("sno1_upd_flg", "sno1_upd_flg"),
				MCItemDef.create("sno2_upd_flg", "sno2_upd_flg"),
				MCItemDef.create("sno3_upd_flg", "sno3_upd_flg"),
				MCItemDef.create("sno4_upd_flg", "sno4_upd_flg"),
				MCItemDef.create("lot_no_upd_flg", "lot_no_upd_flg"),
				MCItemDef.create("sublot_no_upd_flg", "sublot_no_upd_flg"),
				MCItemDef.create("ver_no_upd_flg", "ver_no_upd_flg"),
				MCItemDef.create("stk_arrv_bp_cd_upd_flg", "stk_arrv_bp_cd_upd_flg"),
				MCItemDef.create("gd_cd_upd_flg", "gd_cd_upd_flg"),
				MCItemDef.create("quality_typ_upd_flg", "quality_typ_upd_flg"),
				MCItemDef.create("stk_insp_typ_upd_flg", "stk_insp_typ_upd_flg"),
				MCItemDef.create("stk_id_typ_upd_flg", "stk_id_typ_upd_flg"),
				MCItemDef.create("stk_bp_cd_upd_flg", "stk_bp_cd_upd_flg"),
				MCItemDef.create("sppl_itm_cd_upd_flg", "sppl_itm_cd_upd_flg"),
				MCItemDef.create("sppl_itm_nm_upd_flg", "sppl_itm_nm_upd_flg"),
				MCItemDef.create("maker_cd_upd_flg", "maker_cd_upd_flg"),
				MCItemDef.create("bp_lot_no_upd_flg", "bp_lot_no_upd_flg"),
				MCItemDef.create("bp_dlv_slip_no_upd_flg", "bp_dlv_slip_no_upd_flg"),
				MCItemDef.create("bp_dlv_slip_d_no_upd_flg", "bp_dlv_slip_d_no_upd_flg"),
				MCItemDef.create("ship_fr_valid_dt_upd_flg", "ship_fr_valid_dt_upd_flg"),
				MCItemDef.create("purc_cont_qty_upd_flg", "purc_cont_qty_upd_flg"),
				MCItemDef.create("insp_cnt_rmrks_upd_flg", "insp_cnt_rmrks_upd_flg"),
				MCItemDef.create("intr_rmrks_upd_flg", "intr_rmrks_upd_flg"),
				MCItemDef.create("trd_rmrks_upd_flg", "trd_rmrks_upd_flg"),
				MCItemDef.create("trd_d_rmrks_upd_flg", "trd_d_rmrks_upd_flg"),
				MCItemDef.create("sub_char1_upd_flg", "sub_char1_upd_flg"),
				MCItemDef.create("sub_char2_upd_flg", "sub_char2_upd_flg"),
				MCItemDef.create("sub_char3_upd_flg", "sub_char3_upd_flg"),
				MCItemDef.create("arr_pr_no_upd_flg", "arr_pr_no_upd_flg"),
				MCItemDef.create("iv_no_upd_flg", "iv_no_upd_flg")
			}
			,
			MCBlockDef.create("ArrActIF_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL6000_ArrActIF_Upd01_INFO = new MCOperationInfo("MS", "MSBEL6000", "ArrActIF_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL6000_ArrActIF_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL6000", "ArrActIF_Upd01",
			new MCItemDef[]{
				MCItemDef.create("if_upd_typ", "if_upd_typ"),
				MCItemDef.create("upd_cntr_chk_flg", "upd_cntr_chk_flg"),
				MCItemDef.create("is_src_batch_flg", "is_src_batch_flg")
			}
			,
			MCBlockDef.create("ArrActIF_Ctrl")
		);
	}

	public static MCContainerDef MS_MSBEL6000_ArrActIF_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL6000", "ArrActIF_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("arr_act" + ".arr_act_no", "arr_act_no"),
				MCItemDef.create("arr_act" + ".arr_schd_no", "arr_schd_no"),
				MCItemDef.create("arr_act" + ".trd_cd", "trd_cd"),
				MCItemDef.create("arr_act" + ".trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("arr_act" + ".purc_act_io_no", "purc_act_io_no"),
				MCItemDef.create("arr_act" + ".arr_tm", "arr_tm"),
				MCItemDef.create("arr_act" + ".ac_dt", "ac_dt"),
				MCItemDef.create("arr_act" + ".arr_loc_cd", "arr_loc_cd"),
				MCItemDef.create("arr_act" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("arr_act" + ".arr_dpt_cd", "arr_dpt_cd"),
				MCItemDef.create("arr_act" + ".arr_usr_cd", "arr_usr_cd"),
				MCItemDef.create("arr_act" + ".itm_cd", "itm_cd"),
				MCItemDef.create("arr_act" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("arr_act" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("arr_act" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("arr_act" + ".itm_nm", "itm_nm"),
				MCItemDef.create("arr_act" + ".rcpt_iv_itm_nm", "rcpt_iv_itm_nm"),
				MCItemDef.create("arr_act" + ".sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("arr_act" + ".purc_id_typ", "purc_id_typ"),
				MCItemDef.create("arr_act" + ".stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("arr_act" + ".sno1", "sno1"),
				MCItemDef.create("arr_act" + ".sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("arr_act" + ".sno2", "sno2"),
				MCItemDef.create("arr_act" + ".sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("arr_act" + ".sno3", "sno3"),
				MCItemDef.create("arr_act" + ".sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("arr_act" + ".sno4", "sno4"),
				MCItemDef.create("arr_act" + ".sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("arr_act" + ".lot_no", "lot_no"),
				MCItemDef.create("arr_act" + ".sublot_no", "sublot_no"),
				MCItemDef.create("arr_act" + ".ver_no", "ver_no"),
				MCItemDef.create("arr_act" + ".stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("arr_act" + ".gd_cd", "gd_cd"),
				MCItemDef.create("arr_act" + ".quality_typ", "quality_typ"),
				MCItemDef.create("arr_act" + ".stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("arr_act" + ".stk_id_typ", "stk_id_typ"),
				MCItemDef.create("arr_act" + ".stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("arr_act" + ".sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("arr_act" + ".sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("arr_act" + ".rqst_dpt_cd", "rqst_dpt_cd"),
				MCItemDef.create("arr_act" + ".rqst_usr_cd", "rqst_usr_cd"),
				MCItemDef.create("arr_act" + ".cst_cd", "cst_cd"),
				MCItemDef.create("arr_act" + ".sret_fr_cd", "sret_fr_cd"),
				MCItemDef.create("arr_act" + ".sppl_cd", "sppl_cd"),
				MCItemDef.create("arr_act" + ".ret_loc_cd", "ret_loc_cd"),
				MCItemDef.create("arr_act" + ".ret_str_ln_cd", "ret_str_ln_cd"),
				MCItemDef.create("arr_act" + ".ret_gd_cd", "ret_gd_cd"),
				MCItemDef.create("arr_act" + ".maker_cd", "maker_cd"),
				MCItemDef.create("arr_act" + ".bp_lot_no", "bp_lot_no"),
				MCItemDef.create("arr_act" + ".bp_dlv_slip_no", "bp_dlv_slip_no"),
				MCItemDef.create("arr_act" + ".bp_dlv_slip_d_no", "bp_dlv_slip_d_no"),
				MCItemDef.create("arr_act" + ".ship_fr_valid_dt", "ship_fr_valid_dt"),
				MCItemDef.create("arr_act" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("arr_act" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("arr_act" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("arr_act" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("arr_act" + ".purc_cont_qty", "purc_cont_qty"),
				MCItemDef.create("arr_act" + ".rsn_cd", "rsn_cd"),
				MCItemDef.create("arr_act" + ".bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("arr_act" + ".bd_wg_cd", "bd_wg_cd"),
				MCItemDef.create("arr_act" + ".sync_flg", "sync_flg"),
				MCItemDef.create("arr_act" + ".edi_flg", "edi_flg"),
				MCItemDef.create("arr_act" + ".edi_bp_dlv_slip_no", "edi_bp_dlv_slip_no"),
				MCItemDef.create("arr_act" + ".edi_bp_dlv_slip_d_no", "edi_bp_dlv_slip_d_no"),
				MCItemDef.create("arr_act" + ".insp_cnt_rmrks", "insp_cnt_rmrks"),
				MCItemDef.create("arr_act" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("arr_act" + ".trd_rmrks", "trd_rmrks"),
				MCItemDef.create("arr_act" + ".trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("arr_act" + ".sub_char1", "sub_char1"),
				MCItemDef.create("arr_act" + ".sub_char2", "sub_char2"),
				MCItemDef.create("arr_act" + ".sub_char3", "sub_char3"),
				MCItemDef.create("arr_act" + ".wms_flg", "wms_flg"),
				MCItemDef.create("arr_act" + ".ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("arr_act" + ".ext_arr_act_no", "ext_arr_act_no"),
				MCItemDef.create("arr_act" + ".lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("arr_act" + ".wg_cd", "wg_cd"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("arr_pr_no", "arr_pr_no"),
				MCItemDef.create("rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("arr_ptn_typ", "arr_ptn_typ"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("crt_lot_flg", "crt_lot_flg"),
				MCItemDef.create("same_lot_flg", "same_lot_flg"),
				MCItemDef.create("io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("pre_outsrc_act_flg", "pre_outsrc_act_flg"),
				MCItemDef.create("prnt_flg", "prnt_flg"),
				MCItemDef.create("cststk_flg", "cststk_flg"),
				MCItemDef.create("arr_pr_upd_cntr", "arr_pr_upd_cntr"),
				MCItemDef.create("arr_act_upd_cntr", "arr_act_upd_cntr"),
				MCItemDef.create("rcpt_iv_upd_cntr", "rcpt_iv_upd_cntr"),
				MCItemDef.create("arr_dpt_cd_upd_flg", "arr_dpt_cd_upd_flg"),
				MCItemDef.create("arr_usr_cd_upd_flg", "arr_usr_cd_upd_flg"),
				MCItemDef.create("sno1_upd_flg", "sno1_upd_flg"),
				MCItemDef.create("sno2_upd_flg", "sno2_upd_flg"),
				MCItemDef.create("sno3_upd_flg", "sno3_upd_flg"),
				MCItemDef.create("sno4_upd_flg", "sno4_upd_flg"),
				MCItemDef.create("lot_no_upd_flg", "lot_no_upd_flg"),
				MCItemDef.create("sublot_no_upd_flg", "sublot_no_upd_flg"),
				MCItemDef.create("ver_no_upd_flg", "ver_no_upd_flg"),
				MCItemDef.create("stk_arrv_bp_cd_upd_flg", "stk_arrv_bp_cd_upd_flg"),
				MCItemDef.create("gd_cd_upd_flg", "gd_cd_upd_flg"),
				MCItemDef.create("quality_typ_upd_flg", "quality_typ_upd_flg"),
				MCItemDef.create("stk_insp_typ_upd_flg", "stk_insp_typ_upd_flg"),
				MCItemDef.create("stk_id_typ_upd_flg", "stk_id_typ_upd_flg"),
				MCItemDef.create("stk_bp_cd_upd_flg", "stk_bp_cd_upd_flg"),
				MCItemDef.create("sppl_itm_cd_upd_flg", "sppl_itm_cd_upd_flg"),
				MCItemDef.create("sppl_itm_nm_upd_flg", "sppl_itm_nm_upd_flg"),
				MCItemDef.create("maker_cd_upd_flg", "maker_cd_upd_flg"),
				MCItemDef.create("bp_lot_no_upd_flg", "bp_lot_no_upd_flg"),
				MCItemDef.create("bp_dlv_slip_no_upd_flg", "bp_dlv_slip_no_upd_flg"),
				MCItemDef.create("bp_dlv_slip_d_no_upd_flg", "bp_dlv_slip_d_no_upd_flg"),
				MCItemDef.create("ship_fr_valid_dt_upd_flg", "ship_fr_valid_dt_upd_flg"),
				MCItemDef.create("purc_cont_qty_upd_flg", "purc_cont_qty_upd_flg"),
				MCItemDef.create("insp_cnt_rmrks_upd_flg", "insp_cnt_rmrks_upd_flg"),
				MCItemDef.create("intr_rmrks_upd_flg", "intr_rmrks_upd_flg"),
				MCItemDef.create("trd_rmrks_upd_flg", "trd_rmrks_upd_flg"),
				MCItemDef.create("trd_d_rmrks_upd_flg", "trd_d_rmrks_upd_flg"),
				MCItemDef.create("sub_char1_upd_flg", "sub_char1_upd_flg"),
				MCItemDef.create("sub_char2_upd_flg", "sub_char2_upd_flg"),
				MCItemDef.create("sub_char3_upd_flg", "sub_char3_upd_flg"),
				MCItemDef.create("arr_pr_no_upd_flg", "arr_pr_no_upd_flg"),
				MCItemDef.create("iv_no_upd_flg", "iv_no_upd_flg")
			}
			,
			MCBlockDef.create("ArrActIF_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL6000_ArrActIF_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL6000", "ArrActIF_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("arr_act" + ".dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("arr_act" + ".dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("pr_sts_typ", "pr_sts_typ"),
				MCItemDef.create("pr_sts_typ_nm", "pr_sts_typ_nm")
			}
			,
			MCBlockDef.create("ArrActIF_Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

