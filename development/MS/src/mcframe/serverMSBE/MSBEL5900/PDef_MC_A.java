package mcframe.serverMSBE.MSBEL5900;

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
 * [MSBEL_ArrSchdService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBEL5900.ArrSchd_Upd01.UP.BLOCK0")){
			return MS_MSBEL5900_ArrSchd_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5900.ArrSchd_Upd01.UP.BLOCK1")){
			return MS_MSBEL5900_ArrSchd_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5900.ArrSchd_Upd01.DOWN.BLOCK0")){
			return MS_MSBEL5900_ArrSchd_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5900.ArrSchd_Upd02.UP.BLOCK0")){
			return MS_MSBEL5900_ArrSchd_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5900.ArrSchd_Upd02.DOWN.BLOCK0")){
			return MS_MSBEL5900_ArrSchd_Upd02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5900.ArrSchd_Upd03.UP.BLOCK0")){
			return MS_MSBEL5900_ArrSchd_Upd03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5900.ArrSchd_Upd04.UP.BLOCK0")){
			return MS_MSBEL5900_ArrSchd_Upd04_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5900.ArrSchd_Chk01.UP.BLOCK0")){
			return MS_MSBEL5900_ArrSchd_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5900.ArrSchd_Chk01.DOWN.BLOCK0")){
			return MS_MSBEL5900_ArrSchd_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5900.ArrSchd_Chk02.UP.BLOCK0")){
			return MS_MSBEL5900_ArrSchd_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5900.ArrSchd_Chk02.DOWN.BLOCK0")){
			return MS_MSBEL5900_ArrSchd_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5900.ChkUpd1.UP.BLOCK0")){
			return MS_MSBEL5900_ChkUpd1_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5900.ChkUpd1.UP.BLOCK1")){
			return MS_MSBEL5900_ChkUpd1_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5900.ChkUpd1.UP.BLOCK2")){
			return MS_MSBEL5900_ChkUpd1_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBEL5900.ChkUpd1.DOWN.BLOCK0")){
			return MS_MSBEL5900_ChkUpd1_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5900.ChkUpd1.DOWN.BLOCK1")){
			return MS_MSBEL5900_ChkUpd1_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5900.ChkUpd2.UP.BLOCK0")){
			return MS_MSBEL5900_ChkUpd2_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5900.ChkUpd2.UP.BLOCK1")){
			return MS_MSBEL5900_ChkUpd2_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5900.ChkUpd2.DOWN.BLOCK0")){
			return MS_MSBEL5900_ChkUpd2_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5900.ChkUpd2.DOWN.BLOCK1")){
			return MS_MSBEL5900_ChkUpd2_DOWN_BLOCK1();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
								
	
	static final MCOperationInfo MS_MSBEL5900_ArrSchd_Upd01_INFO = new MCOperationInfo("MS", "MSBEL5900", "ArrSchd_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5900_ArrSchd_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5900", "ArrSchd_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("arr_pr" + ".arr_pr_no", "arr_pr_no"),
				MCItemDef.create("arr_pr" + ".trd_cd", "trd_cd"),
				MCItemDef.create("arr_pr" + ".trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("arr_pr" + ".sls_ret_schd_d_no", "sls_ret_schd_d_no"),
				MCItemDef.create("arr_pr" + ".dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("arr_pr" + ".iv_d_no", "iv_d_no"),
				MCItemDef.create("arr_pr" + ".po_d_no", "po_d_no"),
				MCItemDef.create("arr_pr" + ".rqst_dpt_cd", "rqst_dpt_cd"),
				MCItemDef.create("arr_pr" + ".rqst_wg_cd", "rqst_wg_cd"),
				MCItemDef.create("arr_pr" + ".rqst_usr_cd", "rqst_usr_cd"),
				MCItemDef.create("arr_pr" + ".cst_cd", "cst_cd"),
				MCItemDef.create("arr_pr" + ".sret_fr_cd", "sret_fr_cd"),
				MCItemDef.create("arr_pr" + ".sppl_cd", "sppl_cd"),
				MCItemDef.create("arr_pr" + ".ret_dlv_slip_d_no", "ret_dlv_slip_d_no"),
				MCItemDef.create("arr_pr" + ".ret_stk_arrv_bp_cd", "ret_stk_arrv_bp_cd"),
				MCItemDef.create("arr_pr" + ".dlv_rqst_tm", "dlv_rqst_tm"),
				MCItemDef.create("arr_pr" + ".prms_rcpt_dt", "prms_rcpt_dt"),
				MCItemDef.create("arr_pr" + ".prms_dlv_dt", "prms_dlv_dt"),
				MCItemDef.create("arr_pr" + ".prms_refl_dt", "prms_refl_dt"),
				MCItemDef.create("arr_pr" + ".dlv_inst_dt", "dlv_inst_dt"),
				MCItemDef.create("arr_pr" + ".dlv_inst_prms_rcpt_dt", "dlv_inst_prms_rcpt_dt"),
				MCItemDef.create("arr_pr" + ".dlv_inst_prms_refl_dt", "dlv_inst_prms_refl_dt"),
				MCItemDef.create("arr_pr" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("arr_pr" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("arr_pr" + ".prms_rcpt_qty", "prms_rcpt_qty"),
				MCItemDef.create("arr_pr" + ".prms_refl_qty", "prms_refl_qty"),
				MCItemDef.create("arr_pr" + ".dlv_inst_qty", "dlv_inst_qty"),
				MCItemDef.create("arr_pr" + ".dlv_inst_prms_rcpt_qty", "dlv_inst_prms_rcpt_qty"),
				MCItemDef.create("arr_pr" + ".dlv_inst_prms_refl_qty", "dlv_inst_prms_refl_qty"),
				MCItemDef.create("arr_pr" + ".rcpt_iv_qty", "rcpt_iv_qty"),
				MCItemDef.create("arr_pr" + ".abort_flg", "abort_flg"),
				MCItemDef.create("arr_pr" + ".std_purc_lt", "std_purc_lt"),
				MCItemDef.create("arr_pr" + ".rsn_cd", "rsn_cd"),
				MCItemDef.create("arr_pr" + ".bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("arr_pr" + ".bd_wg_cd", "bd_wg_cd"),
				MCItemDef.create("arr_pr" + ".purc_ddlv_flg", "purc_ddlv_flg"),
				MCItemDef.create("arr_pr" + ".arr_schd_refl_flg", "arr_schd_refl_flg"),
				MCItemDef.create("arr_pr" + ".arr_cnt_rmrks", "arr_cnt_rmrks"),
				MCItemDef.create("arr_pr" + ".sub_char1", "sub_char1"),
				MCItemDef.create("arr_pr" + ".sub_char2", "sub_char2"),
				MCItemDef.create("arr_pr" + ".sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("ArrPr_Dtl")
		);
	}

	public static MCContainerDef MS_MSBEL5900_ArrSchd_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5900", "ArrSchd_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("peg_d_no", "peg_d_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("arr_schd" + ".arr_schd_no", "arr_schd_no"),
				MCItemDef.create("arr_schd" + ".arr_pr_no", "arr_pr_no"),
				MCItemDef.create("arr_schd" + ".prms_rcpt_d_no", "prms_rcpt_d_no"),
				MCItemDef.create("arr_schd" + ".dlv_inst_d_no", "dlv_inst_d_no"),
				MCItemDef.create("arr_schd" + ".purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("arr_schd" + ".rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("arr_schd" + ".rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("arr_schd" + ".wg_cd", "wg_cd"),
				MCItemDef.create("arr_schd" + ".dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("arr_schd" + ".dlv_slip_mng_no", "dlv_slip_mng_no"),
				MCItemDef.create("arr_schd" + ".dlv_slip_mng_seq", "dlv_slip_mng_seq"),
				MCItemDef.create("arr_schd" + ".dlv_slip_mng_d_no", "dlv_slip_mng_d_no"),
				MCItemDef.create("arr_schd" + ".dlv_slip_mng_d_seq", "dlv_slip_mng_d_seq"),
				MCItemDef.create("arr_schd" + ".iv_no", "iv_no"),
				MCItemDef.create("arr_schd" + ".arr_ptn_typ", "arr_ptn_typ"),
				MCItemDef.create("arr_schd" + ".arr_schd_tm", "arr_schd_tm"),
				MCItemDef.create("arr_schd" + ".itm_cd", "itm_cd"),
				MCItemDef.create("arr_schd" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("arr_schd" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("arr_schd" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("arr_schd" + ".itm_nm", "itm_nm"),
				MCItemDef.create("arr_schd" + ".rcpt_iv_itm_nm", "rcpt_iv_itm_nm"),
				MCItemDef.create("arr_schd" + ".sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("arr_schd" + ".purc_id_typ", "purc_id_typ"),
				MCItemDef.create("arr_schd" + ".sno1", "sno1"),
				MCItemDef.create("arr_schd" + ".sno2", "sno2"),
				MCItemDef.create("arr_schd" + ".sno3", "sno3"),
				MCItemDef.create("arr_schd" + ".sno4", "sno4"),
				MCItemDef.create("arr_schd" + ".lot_no", "lot_no"),
				MCItemDef.create("arr_schd" + ".sublot_no", "sublot_no"),
				MCItemDef.create("arr_schd" + ".ver_no", "ver_no"),
				MCItemDef.create("arr_schd" + ".stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("arr_schd" + ".gd_cd", "gd_cd"),
				MCItemDef.create("arr_schd" + ".quality_typ", "quality_typ"),
				MCItemDef.create("arr_schd" + ".stk_id_typ", "stk_id_typ"),
				MCItemDef.create("arr_schd" + ".stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("arr_schd" + ".ret_gd_cd", "ret_gd_cd"),
				MCItemDef.create("arr_schd" + ".ret_loc_cd", "ret_loc_cd"),
				MCItemDef.create("arr_schd" + ".ret_str_ln_cd", "ret_str_ln_cd"),
				MCItemDef.create("arr_schd" + ".sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("arr_schd" + ".sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("arr_schd" + ".maker_cd", "maker_cd"),
				MCItemDef.create("arr_schd" + ".bp_lot_no", "bp_lot_no"),
				MCItemDef.create("arr_schd" + ".arr_loc_cd", "arr_loc_cd"),
				MCItemDef.create("arr_schd" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("arr_schd" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("arr_schd" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("arr_schd" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("arr_schd" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("arr_schd" + ".abort_flg", "abort_flg"),
				MCItemDef.create("arr_schd" + ".sls_ret_schd_abort_flg", "sls_ret_schd_abort_flg"),
				MCItemDef.create("arr_schd" + ".sync_flg", "sync_flg"),
				MCItemDef.create("arr_schd" + ".re_arr_schd_flg", "re_arr_schd_flg"),
				MCItemDef.create("arr_schd" + ".outsrc_flg", "outsrc_flg"),
				MCItemDef.create("arr_schd" + ".mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("arr_schd" + ".pre_outsrc_act_flg", "pre_outsrc_act_flg"),
				MCItemDef.create("arr_schd" + ".pre_mfg_act_no", "pre_mfg_act_no"),
				MCItemDef.create("arr_schd" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("arr_schd" + ".trd_rmrks", "trd_rmrks"),
				MCItemDef.create("arr_schd" + ".trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("arr_schd" + ".dlv_slip_d_rmrks", "dlv_slip_d_rmrks"),
				MCItemDef.create("arr_schd" + ".arr_cnt_rmrks", "arr_cnt_rmrks"),
				MCItemDef.create("arr_schd" + ".io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("arr_schd" + ".sub_char1", "sub_char1"),
				MCItemDef.create("arr_schd" + ".sub_char2", "sub_char2"),
				MCItemDef.create("arr_schd" + ".sub_char3", "sub_char3"),
				MCItemDef.create("purc_schd_no", "purc_schd_no"),
				MCItemDef.create("accpt_schd_dt", "accpt_schd_dt"),
				MCItemDef.create("is_src_purcact_srv_flg", "is_src_purcact_srv_flg"),
				MCItemDef.create("no_cred_upd_flg", "no_cred_upd_flg")
			}
			,
			MCBlockDef.create("ArrSchd_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL5900_ArrSchd_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5900", "ArrSchd_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("peg_d_no", "peg_d_no"),
				MCItemDef.create("arr_schd" + ".arr_schd_no", "arr_schd_no"),
				MCItemDef.create("arr_schd" + ".arr_pr_no", "arr_pr_no")
			}
			,
			MCBlockDef.create("ArrSchd_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5900_ArrSchd_Upd02_INFO = new MCOperationInfo("MS", "MSBEL5900", "ArrSchd_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5900_ArrSchd_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5900", "ArrSchd_Upd02",
			new MCItemDef[]{
				MCItemDef.create("arr_schd" + ".arr_schd_no", "arr_schd_no"),
				MCItemDef.create("arr_schd" + ".arr_ptn_typ", "arr_ptn_typ"),
				MCItemDef.create("arr_schd" + ".lot_no", "lot_no"),
				MCItemDef.create("arr_schd" + ".sublot_no", "sublot_no"),
				MCItemDef.create("arr_schd" + ".abort_flg", "abort_flg"),
				MCItemDef.create("arr_schd" + ".mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("arr_schd" + ".pre_mfg_act_no", "pre_mfg_act_no"),
				MCItemDef.create("arr_schd" + ".bp_lot_no", "bp_lot_no"),
				MCItemDef.create("crt_lot_flg", "crt_lot_flg"),
				MCItemDef.create("is_src_outsrc_srv_flg", "is_src_outsrc_srv_flg"),
				MCItemDef.create("is_src_arract_srv_flg", "is_src_arract_srv_flg"),
				MCItemDef.create("is_src_purcact_srv_flg", "is_src_purcact_srv_flg"),
				MCItemDef.create("bp_lot_upd_flg", "bp_lot_upd_flg"),
				MCItemDef.create("rem_abort_flg", "rem_abort_flg")
			}
			,
			MCBlockDef.create("ArrSchd_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL5900_ArrSchd_Upd02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5900", "ArrSchd_Upd02",
			new MCItemDef[]{
				MCItemDef.create("arr_schd" + ".arr_schd_no", "arr_schd_no"),
				MCItemDef.create("arr_schd" + ".lot_no", "lot_no"),
				MCItemDef.create("arr_schd" + ".sublot_no", "sublot_no")
			}
			,
			MCBlockDef.create("ArrSchd_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5900_ArrSchd_Upd03_INFO = new MCOperationInfo("MS", "MSBEL5900", "ArrSchd_Upd03", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5900_ArrSchd_Upd03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5900", "ArrSchd_Upd03",
			new MCItemDef[]{
				MCItemDef.create("arr_schd" + ".arr_schd_no", "arr_schd_no"),
				MCItemDef.create("arr_schd" + ".arr_ptn_typ", "arr_ptn_typ"),
				MCItemDef.create("arr_schd" + ".sls_ret_schd_abort_flg", "sls_ret_schd_abort_flg"),
				MCItemDef.create("arr_schd" + ".wms_flg", "wms_flg"),
				MCItemDef.create("is_src_purcact_srv_flg", "is_src_purcact_srv_flg")
			}
			,
			MCBlockDef.create("ArrSchd_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5900_ArrSchd_Upd04_INFO = new MCOperationInfo("MS", "MSBEL5900", "ArrSchd_Upd04", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5900_ArrSchd_Upd04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5900", "ArrSchd_Upd04",
			new MCItemDef[]{
				MCItemDef.create("arr_schd" + ".arr_schd_no", "arr_schd_no"),
				MCItemDef.create("arr_schd" + ".dlv_slip_no", "dlv_slip_no")
			}
			,
			MCBlockDef.create("ArrSchd_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5900_ArrSchd_Chk01_INFO = new MCOperationInfo("MS", "MSBEL5900", "ArrSchd_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5900_ArrSchd_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5900", "ArrSchd_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("arr_schd" + ".arr_schd_no", "arr_schd_no"),
				MCItemDef.create("arr_schd" + ".wg_cd", "wg_cd"),
				MCItemDef.create("arr_schd" + ".arr_schd_tm", "arr_schd_tm"),
				MCItemDef.create("arr_schd" + ".itm_cd", "itm_cd"),
				MCItemDef.create("arr_schd" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("arr_schd" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("arr_schd" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("arr_schd" + ".arr_loc_cd", "arr_loc_cd"),
				MCItemDef.create("arr_schd" + ".abort_flg", "abort_flg"),
				MCItemDef.create("arr_schd" + ".purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("arr_schd" + ".mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("arr_schd" + ".re_arr_schd_flg", "re_arr_schd_flg"),
				MCItemDef.create("arr_schd" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("arr_schd" + ".outsrc_flg", "outsrc_flg"),
				MCItemDef.create("arr_schd" + ".stk_id_typ", "stk_id_typ"),
				MCItemDef.create("arr_schd" + ".stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("accpt_schd_dt", "accpt_schd_dt"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("is_src_purcact_srv_flg", "is_src_purcact_srv_flg"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("prov_basis_typ", "prov_basis_typ"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri")
			}
			,
			MCBlockDef.create("ArrSchd_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL5900_ArrSchd_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5900", "ArrSchd_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("ArrSchd_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5900_ArrSchd_Chk02_INFO = new MCOperationInfo("MS", "MSBEL5900", "ArrSchd_Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5900_ArrSchd_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5900", "ArrSchd_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("arr_schd" + ".arr_schd_no", "arr_schd_no"),
				MCItemDef.create("arr_schd" + ".abort_flg", "abort_flg"),
				MCItemDef.create("arr_schd" + ".abort_qty", "abort_qty"),
				MCItemDef.create("arr_schd" + ".mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("arr_schd" + ".lot_no", "lot_no"),
				MCItemDef.create("arr_schd" + ".sublot_no", "sublot_no"),
				MCItemDef.create("crt_lot_flg", "crt_lot_flg"),
				MCItemDef.create("is_src_outsrc_srv_flg", "is_src_outsrc_srv_flg"),
				MCItemDef.create("is_src_arract_srv_flg", "is_src_arract_srv_flg"),
				MCItemDef.create("is_src_purcact_srv_flg", "is_src_purcact_srv_flg"),
				MCItemDef.create("is_src_purcdlvadjst_flg", "is_src_purcdlvadjst_flg")
			}
			,
			MCBlockDef.create("ArrSchd_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL5900_ArrSchd_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5900", "ArrSchd_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("ArrSchd_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5900_ChkUpd1_INFO = new MCOperationInfo("MS", "MSBEL5900", "ChkUpd1", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5900_ChkUpd1_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5900", "ChkUpd1",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("arr_schd" + ".arr_schd_no", "arr_schd_no"),
				MCItemDef.create("arr_schd" + ".wg_cd", "wg_cd"),
				MCItemDef.create("arr_schd" + ".arr_schd_tm", "arr_schd_tm"),
				MCItemDef.create("arr_schd" + ".itm_cd", "itm_cd"),
				MCItemDef.create("arr_schd" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("arr_schd" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("arr_schd" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("arr_schd" + ".arr_loc_cd", "arr_loc_cd"),
				MCItemDef.create("arr_schd" + ".abort_flg", "abort_flg"),
				MCItemDef.create("arr_schd" + ".purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("arr_schd" + ".mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("prov_basis_typ", "prov_basis_typ"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri")
			}
			,
			MCBlockDef.create("ChkUpd1_Chk0")
		);
	}

	public static MCContainerDef MS_MSBEL5900_ChkUpd1_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5900", "ChkUpd1",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("arr_pr" + ".arr_pr_no", "arr_pr_no"),
				MCItemDef.create("arr_pr" + ".trd_cd", "trd_cd"),
				MCItemDef.create("arr_pr" + ".trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("arr_pr" + ".sls_ret_schd_d_no", "sls_ret_schd_d_no"),
				MCItemDef.create("arr_pr" + ".dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("arr_pr" + ".iv_d_no", "iv_d_no"),
				MCItemDef.create("arr_pr" + ".po_d_no", "po_d_no"),
				MCItemDef.create("arr_pr" + ".rqst_dpt_cd", "rqst_dpt_cd"),
				MCItemDef.create("arr_pr" + ".rqst_wg_cd", "rqst_wg_cd"),
				MCItemDef.create("arr_pr" + ".rqst_usr_cd", "rqst_usr_cd"),
				MCItemDef.create("arr_pr" + ".cst_cd", "cst_cd"),
				MCItemDef.create("arr_pr" + ".sppl_cd", "sppl_cd"),
				MCItemDef.create("arr_pr" + ".ret_dlv_slip_d_no", "ret_dlv_slip_d_no"),
				MCItemDef.create("arr_pr" + ".ret_stk_arrv_bp_cd", "ret_stk_arrv_bp_cd"),
				MCItemDef.create("arr_pr" + ".dlv_rqst_tm", "dlv_rqst_tm"),
				MCItemDef.create("arr_pr" + ".prms_rcpt_dt", "prms_rcpt_dt"),
				MCItemDef.create("arr_pr" + ".prms_dlv_dt", "prms_dlv_dt"),
				MCItemDef.create("arr_pr" + ".prms_refl_dt", "prms_refl_dt"),
				MCItemDef.create("arr_pr" + ".dlv_inst_dt", "dlv_inst_dt"),
				MCItemDef.create("arr_pr" + ".dlv_inst_prms_rcpt_dt", "dlv_inst_prms_rcpt_dt"),
				MCItemDef.create("arr_pr" + ".dlv_inst_prms_refl_dt", "dlv_inst_prms_refl_dt"),
				MCItemDef.create("arr_pr" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("arr_pr" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("arr_pr" + ".prms_rcpt_qty", "prms_rcpt_qty"),
				MCItemDef.create("arr_pr" + ".prms_refl_qty", "prms_refl_qty"),
				MCItemDef.create("arr_pr" + ".dlv_inst_qty", "dlv_inst_qty"),
				MCItemDef.create("arr_pr" + ".dlv_inst_prms_rcpt_qty", "dlv_inst_prms_rcpt_qty"),
				MCItemDef.create("arr_pr" + ".dlv_inst_prms_refl_qty", "dlv_inst_prms_refl_qty"),
				MCItemDef.create("arr_pr" + ".abort_flg", "abort_flg"),
				MCItemDef.create("arr_pr" + ".std_purc_lt", "std_purc_lt"),
				MCItemDef.create("arr_pr" + ".rsn_cd", "rsn_cd"),
				MCItemDef.create("arr_pr" + ".bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("arr_pr" + ".purc_ddlv_flg", "purc_ddlv_flg"),
				MCItemDef.create("arr_pr" + ".arr_schd_refl_flg", "arr_schd_refl_flg"),
				MCItemDef.create("arr_pr" + ".arr_cnt_rmrks", "arr_cnt_rmrks"),
				MCItemDef.create("arr_pr" + ".sub_char1", "sub_char1"),
				MCItemDef.create("arr_pr" + ".sub_char2", "sub_char2"),
				MCItemDef.create("arr_pr" + ".sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("ChkUpd1_Upd0")
		);
	}

	public static MCContainerDef MS_MSBEL5900_ChkUpd1_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL5900", "ChkUpd1",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("peg_d_no", "peg_d_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("arr_schd" + ".arr_schd_no", "arr_schd_no"),
				MCItemDef.create("arr_schd" + ".arr_pr_no", "arr_pr_no"),
				MCItemDef.create("arr_schd" + ".prms_rcpt_d_no", "prms_rcpt_d_no"),
				MCItemDef.create("arr_schd" + ".dlv_inst_d_no", "dlv_inst_d_no"),
				MCItemDef.create("arr_schd" + ".purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("arr_schd" + ".rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("arr_schd" + ".rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("arr_schd" + ".wg_cd", "wg_cd"),
				MCItemDef.create("arr_schd" + ".dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("arr_schd" + ".iv_no", "iv_no"),
				MCItemDef.create("arr_schd" + ".arr_ptn_typ", "arr_ptn_typ"),
				MCItemDef.create("arr_schd" + ".arr_schd_tm", "arr_schd_tm"),
				MCItemDef.create("arr_schd" + ".itm_cd", "itm_cd"),
				MCItemDef.create("arr_schd" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("arr_schd" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("arr_schd" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("arr_schd" + ".itm_nm", "itm_nm"),
				MCItemDef.create("arr_schd" + ".rcpt_iv_itm_nm", "rcpt_iv_itm_nm"),
				MCItemDef.create("arr_schd" + ".sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("arr_schd" + ".purc_id_typ", "purc_id_typ"),
				MCItemDef.create("arr_schd" + ".sno1", "sno1"),
				MCItemDef.create("arr_schd" + ".sno2", "sno2"),
				MCItemDef.create("arr_schd" + ".sno3", "sno3"),
				MCItemDef.create("arr_schd" + ".sno4", "sno4"),
				MCItemDef.create("arr_schd" + ".lot_no", "lot_no"),
				MCItemDef.create("arr_schd" + ".sublot_no", "sublot_no"),
				MCItemDef.create("arr_schd" + ".ver_no", "ver_no"),
				MCItemDef.create("arr_schd" + ".stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("arr_schd" + ".gd_cd", "gd_cd"),
				MCItemDef.create("arr_schd" + ".quality_typ", "quality_typ"),
				MCItemDef.create("arr_schd" + ".stk_id_typ", "stk_id_typ"),
				MCItemDef.create("arr_schd" + ".stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("arr_schd" + ".sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("arr_schd" + ".sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("arr_schd" + ".maker_cd", "maker_cd"),
				MCItemDef.create("arr_schd" + ".bp_lot_no", "bp_lot_no"),
				MCItemDef.create("arr_schd" + ".arr_loc_cd", "arr_loc_cd"),
				MCItemDef.create("arr_schd" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("arr_schd" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("arr_schd" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("arr_schd" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("arr_schd" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("arr_schd" + ".abort_flg", "abort_flg"),
				MCItemDef.create("arr_schd" + ".sls_ret_schd_abort_flg", "sls_ret_schd_abort_flg"),
				MCItemDef.create("arr_schd" + ".sync_flg", "sync_flg"),
				MCItemDef.create("arr_schd" + ".re_arr_schd_flg", "re_arr_schd_flg"),
				MCItemDef.create("arr_schd" + ".outsrc_flg", "outsrc_flg"),
				MCItemDef.create("arr_schd" + ".mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("arr_schd" + ".pre_outsrc_act_flg", "pre_outsrc_act_flg"),
				MCItemDef.create("arr_schd" + ".pre_mfg_act_no", "pre_mfg_act_no"),
				MCItemDef.create("arr_schd" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("arr_schd" + ".trd_rmrks", "trd_rmrks"),
				MCItemDef.create("arr_schd" + ".trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("arr_schd" + ".arr_cnt_rmrks", "arr_cnt_rmrks"),
				MCItemDef.create("arr_schd" + ".io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("arr_schd" + ".sub_char1", "sub_char1"),
				MCItemDef.create("arr_schd" + ".sub_char2", "sub_char2"),
				MCItemDef.create("arr_schd" + ".sub_char3", "sub_char3"),
				MCItemDef.create("purc_schd_no", "purc_schd_no"),
				MCItemDef.create("accpt_schd_dt", "accpt_schd_dt")
			}
			,
			MCBlockDef.create("ChkUpd1_Upd1")
		);
	}


	public static MCContainerDef MS_MSBEL5900_ChkUpd1_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5900", "ChkUpd1",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("ChkUpd1_Chk0")
		);
	}
	public static MCContainerDef MS_MSBEL5900_ChkUpd1_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5900", "ChkUpd1",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("peg_d_no", "peg_d_no"),
				MCItemDef.create("arr_schd" + ".arr_schd_no", "arr_schd_no"),
				MCItemDef.create("arr_schd" + ".arr_pr_no", "arr_pr_no")
			}
			,
			MCBlockDef.create("ChkUpd1_Upd1")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5900_ChkUpd2_INFO = new MCOperationInfo("MS", "MSBEL5900", "ChkUpd2", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5900_ChkUpd2_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5900", "ChkUpd2",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("arr_schd" + ".arr_schd_no", "arr_schd_no"),
				MCItemDef.create("arr_schd" + ".abort_flg", "abort_flg"),
				MCItemDef.create("arr_schd" + ".mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("arr_schd" + ".lot_no", "lot_no"),
				MCItemDef.create("arr_schd" + ".sublot_no", "sublot_no"),
				MCItemDef.create("crt_lot_flg", "crt_lot_flg")
			}
			,
			MCBlockDef.create("ChkUpd2_Chk0")
		);
	}

	public static MCContainerDef MS_MSBEL5900_ChkUpd2_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5900", "ChkUpd2",
			new MCItemDef[]{
				MCItemDef.create("arr_schd" + ".arr_schd_no", "arr_schd_no"),
				MCItemDef.create("arr_schd" + ".arr_ptn_typ", "arr_ptn_typ"),
				MCItemDef.create("arr_schd" + ".lot_no", "lot_no"),
				MCItemDef.create("arr_schd" + ".sublot_no", "sublot_no"),
				MCItemDef.create("arr_schd" + ".abort_flg", "abort_flg"),
				MCItemDef.create("arr_schd" + ".mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("arr_schd" + ".pre_mfg_act_no", "pre_mfg_act_no"),
				MCItemDef.create("crt_lot_flg", "crt_lot_flg")
			}
			,
			MCBlockDef.create("ChkUpd2_Upd0")
		);
	}


	public static MCContainerDef MS_MSBEL5900_ChkUpd2_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5900", "ChkUpd2",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("ChkUpd2_Chk0")
		);
	}
	public static MCContainerDef MS_MSBEL5900_ChkUpd2_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5900", "ChkUpd2",
			new MCItemDef[]{
				MCItemDef.create("arr_schd" + ".arr_schd_no", "arr_schd_no"),
				MCItemDef.create("arr_schd" + ".lot_no", "lot_no"),
				MCItemDef.create("arr_schd" + ".sublot_no", "sublot_no")
			}
			,
			MCBlockDef.create("ChkUpd2_Upd0")
		);
	}
	//FMCB DEF_CLASSES END
}

