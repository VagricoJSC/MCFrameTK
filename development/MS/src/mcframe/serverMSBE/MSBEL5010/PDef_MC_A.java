package mcframe.serverMSBE.MSBEL5010;

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
 * [MSBEL_IoActService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBEL5010.IoAct_Ins01.UP.BLOCK0")){
			return MS_MSBEL5010_IoAct_Ins01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo MS_MSBEL5010_IoAct_Ins01_INFO = new MCOperationInfo("MS", "MSBEL5010", "IoAct_Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5010_IoAct_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5010", "IoAct_Ins01",
			new MCItemDef[]{
				MCItemDef.create("wia" + ".data_crud_typ", "data_crud_typ"),
				MCItemDef.create("wia" + ".ac_dt", "ac_dt"),
				MCItemDef.create("wia" + ".can_ac_dt", "can_ac_dt"),
				MCItemDef.create("wia" + ".act_tm", "act_tm"),
				MCItemDef.create("wia" + ".act_no", "act_no"),
				MCItemDef.create("wia" + ".act_seq", "act_seq"),
				MCItemDef.create("wia" + ".act_rev_no", "act_rev_no"),
				MCItemDef.create("wia" + ".act_d_no", "act_d_no"),
				MCItemDef.create("wia" + ".act_d_seq", "act_d_seq"),
				MCItemDef.create("wia" + ".act_io_no", "act_io_no"),
				MCItemDef.create("wia" + ".act_io_seq", "act_io_seq"),
				MCItemDef.create("wia" + ".un_fix_flg", "un_fix_flg"),
				MCItemDef.create("wia" + ".temp_ap_flg", "temp_ap_flg"),
				MCItemDef.create("wia" + ".trd_cd", "trd_cd"),
				MCItemDef.create("wia" + ".trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("wia" + ".trn_typ", "trn_typ"),
				MCItemDef.create("wia" + ".rsn_cd", "rsn_cd"),
				MCItemDef.create("wia" + ".gi_wg_cd", "gi_wg_cd"),
				MCItemDef.create("wia" + ".gr_wg_cd", "gr_wg_cd"),
				MCItemDef.create("wia" + ".act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("wia" + ".purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("wia" + ".ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("wia" + ".sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("wia" + ".ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("wia" + ".bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("wia" + ".sub_dpt_cd1", "sub_dpt_cd1"),
				MCItemDef.create("wia" + ".sub_dpt_cd2", "sub_dpt_cd2"),
				MCItemDef.create("wia" + ".sub_dpt_cd3", "sub_dpt_cd3"),
				MCItemDef.create("wia" + ".act_usr_cd", "act_usr_cd"),
				MCItemDef.create("wia" + ".sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("wia" + ".mfg_usr_cd", "mfg_usr_cd"),
				MCItemDef.create("wia" + ".purc_usr_cd", "purc_usr_cd"),
				MCItemDef.create("wia" + ".itm_cd", "itm_cd"),
				MCItemDef.create("wia" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("wia" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("wia" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("wia" + ".itm_nm", "itm_nm"),
				MCItemDef.create("wia" + ".stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("wia" + ".sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("wia" + ".gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("wia" + ".gi_str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("wia" + ".gr_loc_cd", "gr_loc_cd"),
				MCItemDef.create("wia" + ".gr_str_ln_cd", "gr_str_ln_cd"),
				MCItemDef.create("wia" + ".stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("wia" + ".lot_no", "lot_no"),
				MCItemDef.create("wia" + ".sublot_no", "sublot_no"),
				MCItemDef.create("wia" + ".sno1", "sno1"),
				MCItemDef.create("wia" + ".sno2", "sno2"),
				MCItemDef.create("wia" + ".sno3", "sno3"),
				MCItemDef.create("wia" + ".sno4", "sno4"),
				MCItemDef.create("wia" + ".sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("wia" + ".sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("wia" + ".sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("wia" + ".sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("wia" + ".fix_no_typ", "fix_no_typ"),
				MCItemDef.create("wia" + ".fix_no", "fix_no"),
				MCItemDef.create("wia" + ".gi_gd_cd", "gi_gd_cd"),
				MCItemDef.create("wia" + ".gr_gd_cd", "gr_gd_cd"),
				MCItemDef.create("wia" + ".in_xfr_typ", "in_xfr_typ"),
				MCItemDef.create("wia" + ".quality_typ", "quality_typ"),
				MCItemDef.create("wia" + ".stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("wia" + ".stk_id_typ", "stk_id_typ"),
				MCItemDef.create("wia" + ".stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("wia" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("wia" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("wia" + ".pack_unit_qty", "pack_unit_qty"),
				MCItemDef.create("wia" + ".pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("wia" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("wia" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("wia" + ".trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("wia" + ".trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("wia" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("wia" + ".trd_cur_proc_amt", "trd_cur_proc_amt"),
				MCItemDef.create("wia" + ".trd_cur_onr_prov_amt", "trd_cur_onr_prov_amt"),
				MCItemDef.create("wia" + ".trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("wia" + ".base_cur_cd", "base_cur_cd"),
				MCItemDef.create("wia" + ".base_cur_upri", "base_cur_upri"),
				MCItemDef.create("wia" + ".base_cur_amt", "base_cur_amt"),
				MCItemDef.create("wia" + ".base_cur_proc_amt", "base_cur_proc_amt"),
				MCItemDef.create("wia" + ".base_cur_onr_prov_amt", "base_cur_onr_prov_amt"),
				MCItemDef.create("wia" + ".base_cur_tax_amt", "base_cur_tax_amt"),
				MCItemDef.create("wia" + ".ptax_cur_cd", "ptax_cur_cd"),
				MCItemDef.create("wia" + ".ptax_cur_upri", "ptax_cur_upri"),
				MCItemDef.create("wia" + ".ptax_cur_amt", "ptax_cur_amt"),
				MCItemDef.create("wia" + ".ptax_cur_proc_amt", "ptax_cur_proc_amt"),
				MCItemDef.create("wia" + ".ptax_cur_onr_prov_amt", "ptax_cur_onr_prov_amt"),
				MCItemDef.create("wia" + ".ptax_cur_tax_amt", "ptax_cur_tax_amt"),
				MCItemDef.create("wia" + ".wtax_rate", "wtax_rate"),
				MCItemDef.create("wia" + ".wtax_amt", "wtax_amt"),
				MCItemDef.create("wia" + ".tax_cd", "tax_cd"),
				MCItemDef.create("wia" + ".xrate_cd", "xrate_cd"),
				MCItemDef.create("wia" + ".xrate", "xrate"),
				MCItemDef.create("wia" + ".ptax_xrate_cd", "ptax_xrate_cd"),
				MCItemDef.create("wia" + ".ptax_xrate", "ptax_xrate"),
				MCItemDef.create("wia" + ".slo_no", "slo_no"),
				MCItemDef.create("wia" + ".po_no", "po_no"),
				MCItemDef.create("wia" + ".iv_no", "iv_no"),
				MCItemDef.create("wia" + ".rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("wia" + ".bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("wia" + ".bd_bp_cd", "bd_bp_cd"),
				MCItemDef.create("wia" + ".bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("wia" + ".bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("wia" + ".bd_slo_no", "bd_slo_no"),
				MCItemDef.create("wia" + ".bd_po_no", "bd_po_no"),
				MCItemDef.create("wia" + ".bd_iv_no", "bd_iv_no"),
				MCItemDef.create("wia" + ".bd_wg_cd", "bd_wg_cd"),
				MCItemDef.create("wia" + ".dlv_cd", "dlv_cd"),
				MCItemDef.create("wia" + ".tdlv_cd", "tdlv_cd"),
				MCItemDef.create("wia" + ".acst_cd", "acst_cd"),
				MCItemDef.create("wia" + ".cst_cd", "cst_cd"),
				MCItemDef.create("wia" + ".dest_cd1", "dest_cd1"),
				MCItemDef.create("wia" + ".dest_cd2", "dest_cd2"),
				MCItemDef.create("wia" + ".dest_cd3", "dest_cd3"),
				MCItemDef.create("wia" + ".asppl_cd", "asppl_cd"),
				MCItemDef.create("wia" + ".sppl_cd", "sppl_cd"),
				MCItemDef.create("wia" + ".spot_flg", "spot_flg"),
				MCItemDef.create("wia" + ".sttl_schd_dt", "sttl_schd_dt"),
				MCItemDef.create("wia" + ".sttl_cd", "sttl_cd"),
				MCItemDef.create("wia" + ".cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("wia" + ".cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("wia" + ".sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("wia" + ".sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("wia" + ".purc_typ", "purc_typ"),
				MCItemDef.create("wia" + ".itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("wia" + ".itm_inst_qty", "itm_inst_qty"),
				MCItemDef.create("wia" + ".mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("wia" + ".mfg_act_no", "mfg_act_no"),
				MCItemDef.create("wia" + ".mfg_st_qty", "mfg_st_qty"),
				MCItemDef.create("wia" + ".oper_act_no", "oper_act_no"),
				MCItemDef.create("wia" + ".yield_rate", "yield_rate"),
				MCItemDef.create("wia" + ".disp_seq", "disp_seq"),
				MCItemDef.create("wia" + ".oper_cd", "oper_cd"),
				MCItemDef.create("wia" + ".inpt_loc_cd", "inpt_loc_cd"),
				MCItemDef.create("wia" + ".inpt_str_ln_cd", "inpt_str_ln_cd"),
				MCItemDef.create("wia" + ".strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("wia" + ".strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("wia" + ".par_itm_cd", "par_itm_cd"),
				MCItemDef.create("wia" + ".par_itm_sub1", "par_itm_sub1"),
				MCItemDef.create("wia" + ".par_itm_sub2", "par_itm_sub2"),
				MCItemDef.create("wia" + ".par_itm_sub3", "par_itm_sub3"),
				MCItemDef.create("wia" + ".par_itm_nm", "par_itm_nm"),
				MCItemDef.create("wia" + ".par_lot_no", "par_lot_no"),
				MCItemDef.create("wia" + ".par_sublot_no", "par_sublot_no"),
				MCItemDef.create("wia" + ".par_sno1", "par_sno1"),
				MCItemDef.create("wia" + ".par_sno2", "par_sno2"),
				MCItemDef.create("wia" + ".par_sno3", "par_sno3"),
				MCItemDef.create("wia" + ".par_sno4", "par_sno4"),
				MCItemDef.create("wia" + ".stktk_diff_qty", "stktk_diff_qty"),
				MCItemDef.create("wia" + ".pack_xfr_unit_cd", "pack_xfr_unit_cd"),
				MCItemDef.create("wia" + ".pack_xfr_qty", "pack_xfr_qty"),
				MCItemDef.create("wia" + ".mfg_inst_unit_typ", "mfg_inst_unit_typ"),
				MCItemDef.create("wia" + ".via_dlv_typ", "via_dlv_typ"),
				MCItemDef.create("wia" + ".arr_ptn_typ", "arr_ptn_typ"),
				MCItemDef.create("wia" + ".yield_typ", "yield_typ"),
				MCItemDef.create("wia" + ".prov_typ", "prov_typ"),
				MCItemDef.create("wia" + ".purc_id_typ", "purc_id_typ"),
				MCItemDef.create("wia" + ".io_typ", "io_typ"),
				MCItemDef.create("wia" + ".accpt_dfct_flg", "accpt_dfct_flg"),
				MCItemDef.create("wia" + ".no_gi_alloc_flg", "no_gi_alloc_flg"),
				MCItemDef.create("wia" + ".acxfr_stk_id_typ", "acxfr_stk_id_typ"),
				MCItemDef.create("wia" + ".acxfr_stk_bp_cd", "acxfr_stk_bp_cd"),
				MCItemDef.create("wia" + ".acxfr_stk_arrv_bp_cd", "acxfr_stk_arrv_bp_cd"),
				MCItemDef.create("wia" + ".trd_rmrks", "trd_rmrks"),
				MCItemDef.create("wia" + ".trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("wia" + ".sub_char1", "sub_char1"),
				MCItemDef.create("wia" + ".sub_char2", "sub_char2"),
				MCItemDef.create("wia" + ".sub_char3", "sub_char3"),
				MCItemDef.create("wia" + ".sub_char4", "sub_char4"),
				MCItemDef.create("wia" + ".sub_char5", "sub_char5"),
				MCItemDef.create("wia" + ".sub_char6", "sub_char6"),
				MCItemDef.create("wia" + ".sub_char7", "sub_char7"),
				MCItemDef.create("wia" + ".sub_char8", "sub_char8"),
				MCItemDef.create("wia" + ".sub_char9", "sub_char9"),
				MCItemDef.create("wia" + ".sub_char10", "sub_char10"),
				MCItemDef.create("wia" + ".sub_num1", "sub_num1"),
				MCItemDef.create("wia" + ".sub_num2", "sub_num2"),
				MCItemDef.create("wia" + ".sub_num3", "sub_num3"),
				MCItemDef.create("wia" + ".sub_dt1", "sub_dt1"),
				MCItemDef.create("wia" + ".sub_dt2", "sub_dt2"),
				MCItemDef.create("wia" + ".sub_dt3", "sub_dt3"),
				MCItemDef.create("wia" + ".rsn_cd2", "rsn_cd2")
			}
			,
			MCBlockDef.create("IoAct_Ins01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5010_IoAct_Upd01_INFO = new MCOperationInfo("MS", "MSBEL5010", "IoAct_Upd01", "000000", new PDef());


	//FMCB DEF_CLASSES END
}

