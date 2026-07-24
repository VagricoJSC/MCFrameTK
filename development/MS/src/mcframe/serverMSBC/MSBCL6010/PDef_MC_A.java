package mcframe.serverMSBC.MSBCL6010;

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
 * [MSBCL_MfgInstTblRegService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBCL6010.MfgInstTblReg_Upd01.UP.BLOCK0")){
			return MS_MSBCL6010_MfgInstTblReg_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6010.MfgInstTblReg_Upd02.UP.BLOCK0")){
			return MS_MSBCL6010_MfgInstTblReg_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6010.MfgInstTblReg_Upd03.UP.BLOCK0")){
			return MS_MSBCL6010_MfgInstTblReg_Upd03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6010.MfgInstTblReg_Upd04.UP.BLOCK0")){
			return MS_MSBCL6010_MfgInstTblReg_Upd04_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6010.MfgInstTblReg_Upd04.DOWN.BLOCK0")){
			return MS_MSBCL6010_MfgInstTblReg_Upd04_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6010.MfgInstTblReg_Upd05.UP.BLOCK0")){
			return MS_MSBCL6010_MfgInstTblReg_Upd05_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6010.MfgInstTblReg_Upd05.DOWN.BLOCK0")){
			return MS_MSBCL6010_MfgInstTblReg_Upd05_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6010.MfgInstTblReg_Upd05.DOWN.BLOCK1")){
			return MS_MSBCL6010_MfgInstTblReg_Upd05_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBCL6010.MfgInstTblReg_Upd06.UP.BLOCK0")){
			return MS_MSBCL6010_MfgInstTblReg_Upd06_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6010.MfgInstTblReg_Upd06.DOWN.BLOCK0")){
			return MS_MSBCL6010_MfgInstTblReg_Upd06_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6010.MfgInstTblReg_Upd07.UP.BLOCK0")){
			return MS_MSBCL6010_MfgInstTblReg_Upd07_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6010.MfgInstTblReg_Upd07.DOWN.BLOCK0")){
			return MS_MSBCL6010_MfgInstTblReg_Upd07_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6010.MfgInstTblReg_Upd08.UP.BLOCK0")){
			return MS_MSBCL6010_MfgInstTblReg_Upd08_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6010.MfgInstTblReg_Upd08.UP.BLOCK1")){
			return MS_MSBCL6010_MfgInstTblReg_Upd08_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL6010.MfgInstTblReg_Upd08.DOWN.BLOCK0")){
			return MS_MSBCL6010_MfgInstTblReg_Upd08_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6010.MfgInstTblReg_Upd09.UP.BLOCK0")){
			return MS_MSBCL6010_MfgInstTblReg_Upd09_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6010.MfgInstTblReg_Upd10.UP.BLOCK0")){
			return MS_MSBCL6010_MfgInstTblReg_Upd10_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
										
	
	static final MCOperationInfo MS_MSBCL6010_MfgInstTblReg_Upd01_INFO = new MCOperationInfo("MS", "MSBCL6010", "MfgInstTblReg_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6010_MfgInstTblReg_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6010", "MfgInstTblReg_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("mfg_mtd_typ", "mfg_mtd_typ"),
				MCItemDef.create("old_inst_abort_flg", "old_inst_abort_flg"),
				MCItemDef.create("not_frst_inst_can_flg", "not_frst_inst_can_flg"),
				MCItemDef.create("rem_sub_char1", "rem_sub_char1"),
				MCItemDef.create("rem_sub_char2", "rem_sub_char2"),
				MCItemDef.create("rem_sub_char3", "rem_sub_char3"),
				MCItemDef.create("mfg_inst" + ".mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("mfg_inst" + ".mfg_inst_rev", "mfg_inst_rev"),
				MCItemDef.create("mfg_inst" + ".itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("mfg_inst" + ".po_d_no", "po_d_no"),
				MCItemDef.create("mfg_inst" + ".base_unit_yield_qty", "base_unit_yield_qty"),
				MCItemDef.create("mfg_inst" + ".base_unit_inst_qty", "base_unit_inst_qty"),
				MCItemDef.create("mfg_inst" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("mfg_inst" + ".st_schd_tm", "st_schd_tm"),
				MCItemDef.create("mfg_inst" + ".end_schd_tm", "end_schd_tm"),
				MCItemDef.create("mfg_inst" + ".rqst_dlv_rqst_tm", "rqst_dlv_rqst_tm"),
				MCItemDef.create("mfg_inst" + ".inst_dt", "inst_dt"),
				MCItemDef.create("mfg_inst" + ".inst_prnt_tm", "inst_prnt_tm"),
				MCItemDef.create("mfg_inst" + ".inst_prnt_flg", "inst_prnt_flg"),
				MCItemDef.create("mfg_inst" + ".aprv_flg", "aprv_flg"),
				MCItemDef.create("mfg_inst" + ".mfg_aprv_sts_typ", "mfg_aprv_sts_typ"),
				MCItemDef.create("mfg_inst" + ".aprv_dt", "aprv_dt"),
				MCItemDef.create("mfg_inst" + ".aprv_dpt_cd", "aprv_dpt_cd"),
				MCItemDef.create("mfg_inst" + ".aprv_usr_cd", "aprv_usr_cd"),
				MCItemDef.create("mfg_inst" + ".aprv_tm", "aprv_tm"),
				MCItemDef.create("mfg_inst" + ".aprv_rsn", "aprv_rsn"),
				MCItemDef.create("mfg_inst" + ".mfg_aprv_role_cd", "mfg_aprv_role_cd"),
				MCItemDef.create("mfg_inst" + ".disp_pd", "disp_pd"),
				MCItemDef.create("mfg_inst" + ".inst_dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("mfg_inst" + ".inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("mfg_inst" + ".abort_flg", "abort_flg"),
				MCItemDef.create("mfg_inst" + ".schd_chg_flg", "schd_chg_flg"),
				MCItemDef.create("mfg_inst" + ".po_locked_flg", "po_locked_flg"),
				MCItemDef.create("mfg_inst" + ".po_auto_reg_flg", "po_auto_reg_flg"),
				MCItemDef.create("mfg_inst" + ".mfg_inst_unit_typ", "mfg_inst_unit_typ"),
				MCItemDef.create("mfg_inst" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("mfg_inst" + ".inst_rpt_rmrks", "inst_rpt_rmrks"),
				MCItemDef.create("mfg_inst" + ".inst_po_cnt_rmrks", "inst_po_cnt_rmrks"),
				MCItemDef.create("mfg_inst" + ".sub_char1", "sub_char1"),
				MCItemDef.create("mfg_inst" + ".sub_char2", "sub_char2"),
				MCItemDef.create("mfg_inst" + ".sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("MfgInstTblReg_Upd01_DtlMfg")
		);
	}
	
	static final MCOperationInfo MS_MSBCL6010_MfgInstTblReg_Upd02_INFO = new MCOperationInfo("MS", "MSBCL6010", "MfgInstTblReg_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6010_MfgInstTblReg_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6010", "MfgInstTblReg_Upd02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("inst_abort_flg", "inst_abort_flg"),
				MCItemDef.create("old_inst_abort_flg", "old_inst_abort_flg"),
				MCItemDef.create("not_frst_inst_can_flg", "not_frst_inst_can_flg"),
				MCItemDef.create("itm_mfg_inst" + ".itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("itm_mfg_inst" + ".itm_ord_no", "itm_ord_no"),
				MCItemDef.create("itm_mfg_inst" + ".io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("itm_mfg_inst" + ".frst_mfg_inst_no", "frst_mfg_inst_no"),
				MCItemDef.create("itm_mfg_inst" + ".mfg_mtd_typ", "mfg_mtd_typ"),
				MCItemDef.create("itm_mfg_inst" + ".sppl_cd", "sppl_cd"),
				MCItemDef.create("itm_mfg_inst" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_mfg_inst" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_mfg_inst" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_mfg_inst" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_mfg_inst" + ".oper_ptn", "oper_ptn"),
				MCItemDef.create("itm_mfg_inst" + ".bom_ptn", "bom_ptn"),
				MCItemDef.create("itm_mfg_inst" + ".base_unit_yield_qty", "base_unit_yield_qty"),
				MCItemDef.create("itm_mfg_inst" + ".base_unit_inst_qty", "base_unit_inst_qty"),
				MCItemDef.create("itm_mfg_inst" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("itm_mfg_inst" + ".master_dt", "master_dt"),
				MCItemDef.create("itm_mfg_inst" + ".lot_no", "lot_no"),
				MCItemDef.create("itm_mfg_inst" + ".sublot_no", "sublot_no"),
				MCItemDef.create("itm_mfg_inst" + ".sno1", "sno1"),
				MCItemDef.create("itm_mfg_inst" + ".sno2", "sno2"),
				MCItemDef.create("itm_mfg_inst" + ".sno3", "sno3"),
				MCItemDef.create("itm_mfg_inst" + ".sno4", "sno4"),
				MCItemDef.create("itm_mfg_inst" + ".unschd_inst_flg", "unschd_inst_flg"),
				MCItemDef.create("itm_mfg_inst" + ".unschd_act_flg", "unschd_act_flg"),
				MCItemDef.create("itm_mfg_inst" + ".strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("itm_mfg_inst" + ".strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("itm_mfg_inst" + ".mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("itm_mfg_inst" + ".mfg_str_ln_cd", "mfg_str_ln_cd"),
				MCItemDef.create("itm_mfg_inst" + ".wg_cd", "wg_cd"),
				MCItemDef.create("itm_mfg_inst" + ".site_cd", "site_cd"),
				MCItemDef.create("itm_mfg_inst" + ".itm_lower_yield", "itm_lower_yield"),
				MCItemDef.create("itm_mfg_inst" + ".itm_std_yield", "itm_std_yield"),
				MCItemDef.create("itm_mfg_inst" + ".itm_upper_yield", "itm_upper_yield"),
				MCItemDef.create("itm_mfg_inst" + ".sub_char1", "sub_char1"),
				MCItemDef.create("itm_mfg_inst" + ".sub_char2", "sub_char2"),
				MCItemDef.create("itm_mfg_inst" + ".sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("MfgInstTblReg_Upd02_DtlItmMfg")
		);
	}
	
	static final MCOperationInfo MS_MSBCL6010_MfgInstTblReg_Upd03_INFO = new MCOperationInfo("MS", "MSBCL6010", "MfgInstTblReg_Upd03", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6010_MfgInstTblReg_Upd03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6010", "MfgInstTblReg_Upd03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("mfg_mtd_typ", "mfg_mtd_typ"),
				MCItemDef.create("hdr_mfg_sts_typ", "hdr_mfg_sts_typ"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("inst_abort_flg", "inst_abort_flg"),
				MCItemDef.create("old_inst_abort_flg", "old_inst_abort_flg"),
				MCItemDef.create("not_frst_inst_can_flg", "not_frst_inst_can_flg"),
				MCItemDef.create("mfg_inst_unit_typ", "mfg_inst_unit_typ"),
				MCItemDef.create("not_header_inst_abort_flg", "not_header_inst_abort_flg"),
				MCItemDef.create("rem_sub_char1", "rem_sub_char1"),
				MCItemDef.create("rem_sub_char2", "rem_sub_char2"),
				MCItemDef.create("rem_sub_char3", "rem_sub_char3"),
				MCItemDef.create("oper_inst" + ".oper_inst_no", "oper_inst_no"),
				MCItemDef.create("oper_inst" + ".mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst" + ".itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("oper_inst" + ".oper_ord_no", "oper_ord_no"),
				MCItemDef.create("oper_inst" + ".disp_seq", "disp_seq"),
				MCItemDef.create("oper_inst" + ".oper_cd", "oper_cd"),
				MCItemDef.create("oper_inst" + ".oper_seq", "oper_seq"),
				MCItemDef.create("oper_inst" + ".st_schd_tm", "st_schd_tm"),
				MCItemDef.create("oper_inst" + ".end_schd_tm", "end_schd_tm"),
				MCItemDef.create("oper_inst" + ".oper_loc_cd", "oper_loc_cd"),
				MCItemDef.create("oper_inst" + ".oper_str_ln_cd", "oper_str_ln_cd"),
				MCItemDef.create("oper_inst" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("oper_inst" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("oper_inst" + ".oper_std_qty", "oper_std_qty"),
				MCItemDef.create("oper_inst" + ".oper_conv_qty", "oper_conv_qty"),
				MCItemDef.create("oper_inst" + ".oper_unit_cd", "oper_unit_cd"),
				MCItemDef.create("oper_inst" + ".oper_unit_conv_rnd_typ", "oper_unit_conv_rnd_typ"),
				MCItemDef.create("oper_inst" + ".oper_unit_dec_place", "oper_unit_dec_place"),
				MCItemDef.create("oper_inst" + ".unschd_inst_flg", "unschd_inst_flg"),
				MCItemDef.create("oper_inst" + ".unschd_act_flg", "unschd_act_flg"),
				MCItemDef.create("oper_inst" + ".bkf_flg", "bkf_flg"),
				MCItemDef.create("oper_inst" + ".wk_cost_calc_flg", "wk_cost_calc_flg"),
				MCItemDef.create("oper_inst" + ".oper_inst_grp", "oper_inst_grp"),
				MCItemDef.create("oper_inst" + ".usr_cd", "usr_cd"),
				MCItemDef.create("oper_inst" + ".oper_lt", "oper_lt"),
				MCItemDef.create("oper_inst" + ".oper_lt_add_qty", "oper_lt_add_qty"),
				MCItemDef.create("oper_inst" + ".oper_offst_typ", "oper_offst_typ"),
				MCItemDef.create("oper_inst" + ".oper_offst", "oper_offst"),
				MCItemDef.create("oper_inst" + ".lmt_fr_dt_flg", "lmt_fr_dt_flg"),
				MCItemDef.create("oper_inst" + ".oper_offst_add_qty", "oper_offst_add_qty"),
				MCItemDef.create("oper_inst" + ".oper_lower_yield", "oper_lower_yield"),
				MCItemDef.create("oper_inst" + ".oper_std_yield", "oper_std_yield"),
				MCItemDef.create("oper_inst" + ".oper_upper_yield", "oper_upper_yield"),
				MCItemDef.create("oper_inst" + ".wip_rate", "wip_rate"),
				MCItemDef.create("oper_inst" + ".yield_oper_flg", "yield_oper_flg"),
				MCItemDef.create("oper_inst" + ".yield_oper_ratio", "yield_oper_ratio"),
				MCItemDef.create("oper_inst" + ".oper_abort_flg", "oper_abort_flg"),
				MCItemDef.create("oper_inst" + ".mes_flg", "mes_flg"),
				MCItemDef.create("oper_inst" + ".oper_rsrc", "oper_rsrc"),
				MCItemDef.create("oper_inst" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("oper_inst" + ".inst_rpt_rmrks", "inst_rpt_rmrks"),
				MCItemDef.create("oper_inst" + ".sub_char1", "sub_char1"),
				MCItemDef.create("oper_inst" + ".sub_char2", "sub_char2"),
				MCItemDef.create("oper_inst" + ".sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("MfgInstTblReg_Upd03_DtlOper")
		);
	}
	
	static final MCOperationInfo MS_MSBCL6010_MfgInstTblReg_Upd04_INFO = new MCOperationInfo("MS", "MSBCL6010", "MfgInstTblReg_Upd04", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6010_MfgInstTblReg_Upd04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6010", "MfgInstTblReg_Upd04",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("hdr_mfg_sts_typ", "hdr_mfg_sts_typ"),
				MCItemDef.create("mfg_mtd_typ", "mfg_mtd_typ"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("mfg_loc_site_cd", "mfg_loc_site_cd"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_aprv_sts_typ", "mfg_aprv_sts_typ"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("old_mfg_sts_typ", "old_mfg_sts_typ"),
				MCItemDef.create("mfg_inst_unit_typ", "mfg_inst_unit_typ"),
				MCItemDef.create("disp_seq_upd_flg", "disp_seq_upd_flg"),
				MCItemDef.create("stk_lst_prnt_flg", "stk_lst_prnt_flg"),
				MCItemDef.create("inst_abort_flg", "inst_abort_flg"),
				MCItemDef.create("old_inst_abort_flg", "old_inst_abort_flg"),
				MCItemDef.create("not_frst_inst_can_flg", "not_frst_inst_can_flg"),
				MCItemDef.create("not_header_inst_abort_flg", "not_header_inst_abort_flg"),
				MCItemDef.create("rem_sub_char1", "rem_sub_char1"),
				MCItemDef.create("rem_sub_char2", "rem_sub_char2"),
				MCItemDef.create("rem_sub_char3", "rem_sub_char3"),
				MCItemDef.create("yield_schd" + ".yield_schd_no", "yield_schd_no"),
				MCItemDef.create("yield_schd" + ".mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("yield_schd" + ".itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("yield_schd" + ".oper_inst_no", "oper_inst_no"),
				MCItemDef.create("yield_schd" + ".io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("yield_schd" + ".schd_tm", "schd_tm"),
				MCItemDef.create("yield_schd" + ".itm_cd", "itm_cd"),
				MCItemDef.create("yield_schd" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("yield_schd" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("yield_schd" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("yield_schd" + ".trd_unit_yield_qty", "trd_unit_yield_qty"),
				MCItemDef.create("yield_schd" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("yield_schd" + ".base_unit_yield_qty", "base_unit_yield_qty"),
				MCItemDef.create("yield_schd" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("yield_schd" + ".lot_no", "lot_no"),
				MCItemDef.create("yield_schd" + ".sublot_no", "sublot_no"),
				MCItemDef.create("yield_schd" + ".sno1", "sno1"),
				MCItemDef.create("yield_schd" + ".sno2", "sno2"),
				MCItemDef.create("yield_schd" + ".sno3", "sno3"),
				MCItemDef.create("yield_schd" + ".sno4", "sno4"),
				MCItemDef.create("yield_schd" + ".strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("yield_schd" + ".strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("yield_schd" + ".disp_seq", "disp_seq"),
				MCItemDef.create("yield_schd" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("yield_schd" + ".inst_rpt_rmrks", "inst_rpt_rmrks"),
				MCItemDef.create("yield_schd" + ".insp_cnt_rmrks", "insp_cnt_rmrks"),
				MCItemDef.create("yield_schd" + ".sub_char1", "sub_char1"),
				MCItemDef.create("yield_schd" + ".sub_char2", "sub_char2"),
				MCItemDef.create("yield_schd" + ".sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("MfgInstTblReg_Upd04_DtlYield")
		);
	}


	public static MCContainerDef MS_MSBCL6010_MfgInstTblReg_Upd04_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6010", "MfgInstTblReg_Upd04",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("yield_schd" + ".yield_schd_no", "yield_schd_no")
			}
			,
			MCBlockDef.create("MfgInstTblReg_Upd04_DtlYield")
		);
	}
	
	static final MCOperationInfo MS_MSBCL6010_MfgInstTblReg_Upd05_INFO = new MCOperationInfo("MS", "MSBCL6010", "MfgInstTblReg_Upd05", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6010_MfgInstTblReg_Upd05_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6010", "MfgInstTblReg_Upd05",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("mfg_mtd_typ", "mfg_mtd_typ"),
				MCItemDef.create("hdr_mfg_sts_typ", "hdr_mfg_sts_typ"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("old_mfg_sts_typ", "old_mfg_sts_typ"),
				MCItemDef.create("mfg_inst_unit_typ", "mfg_inst_unit_typ"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("vld_dt", "vld_dt"),
				MCItemDef.create("first_gr_dt", "first_gr_dt"),
				MCItemDef.create("lot_seq", "lot_seq"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("no_lot_fix_flg", "no_lot_fix_flg"),
				MCItemDef.create("disp_seq_upd_flg", "disp_seq_upd_flg"),
				MCItemDef.create("xfr_inst_err_flg", "xfr_inst_err_flg"),
				MCItemDef.create("inst_abort_flg", "inst_abort_flg"),
				MCItemDef.create("old_inst_abort_flg", "old_inst_abort_flg"),
				MCItemDef.create("is_src_outsrc_srv_flg", "is_src_outsrc_srv_flg"),
				MCItemDef.create("lst_reg_flg", "lst_reg_flg"),
				MCItemDef.create("not_frst_inst_can_flg", "not_frst_inst_can_flg"),
				MCItemDef.create("not_header_inst_abort_flg", "not_header_inst_abort_flg"),
				MCItemDef.create("rem_sub_char1", "rem_sub_char1"),
				MCItemDef.create("rem_sub_char2", "rem_sub_char2"),
				MCItemDef.create("rem_sub_char3", "rem_sub_char3"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("inst_dt", "inst_dt"),
				MCItemDef.create("inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("inst_dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("set_stk_str_ln_flg", "set_stk_str_ln_flg"),
				MCItemDef.create("is_src_batch_flg", "is_src_batch_flg"),
				MCItemDef.create("inpt_schd" + ".inpt_schd_no", "inpt_schd_no"),
				MCItemDef.create("inpt_schd" + ".mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("inpt_schd" + ".itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("inpt_schd" + ".oper_inst_no", "oper_inst_no"),
				MCItemDef.create("inpt_schd" + ".schd_tm", "schd_tm"),
				MCItemDef.create("inpt_schd" + ".alt_grp_cd", "alt_grp_cd"),
				MCItemDef.create("inpt_schd" + ".alt_grp_seq", "alt_grp_seq"),
				MCItemDef.create("inpt_schd" + ".itm_cd", "itm_cd"),
				MCItemDef.create("inpt_schd" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("inpt_schd" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("inpt_schd" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("inpt_schd" + ".ver_no", "ver_no"),
				MCItemDef.create("inpt_schd" + ".base_unit_inpt_qty", "base_unit_inpt_qty"),
				MCItemDef.create("inpt_schd" + ".base_unit_rqmt_qty", "base_unit_rqmt_qty"),
				MCItemDef.create("inpt_schd" + ".base_unit_fxd_rqmt_qty", "base_unit_fxd_rqmt_qty"),
				MCItemDef.create("inpt_schd" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("inpt_schd" + ".inpt_loc_cd", "inpt_loc_cd"),
				MCItemDef.create("inpt_schd" + ".inpt_str_ln_cd", "inpt_str_ln_cd"),
				MCItemDef.create("inpt_schd" + ".gd_cd", "gd_cd"),
				MCItemDef.create("inpt_schd" + ".inpt_rsn_cd", "inpt_rsn_cd"),
				MCItemDef.create("inpt_schd" + ".lot_no", "lot_no"),
				MCItemDef.create("inpt_schd" + ".sublot_no", "sublot_no"),
				MCItemDef.create("inpt_schd" + ".sno1", "sno1"),
				MCItemDef.create("inpt_schd" + ".sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("inpt_schd" + ".sno2", "sno2"),
				MCItemDef.create("inpt_schd" + ".sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("inpt_schd" + ".sno3", "sno3"),
				MCItemDef.create("inpt_schd" + ".sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("inpt_schd" + ".sno4", "sno4"),
				MCItemDef.create("inpt_schd" + ".sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("inpt_schd" + ".alloc_sno1", "alloc_sno1"),
				MCItemDef.create("inpt_schd" + ".alloc_sno2", "alloc_sno2"),
				MCItemDef.create("inpt_schd" + ".alloc_sno3", "alloc_sno3"),
				MCItemDef.create("inpt_schd" + ".alloc_sno4", "alloc_sno4"),
				MCItemDef.create("inpt_schd" + ".bkf_typ", "bkf_typ"),
				MCItemDef.create("inpt_schd" + ".cont_inpt_qty", "cont_inpt_qty"),
				MCItemDef.create("inpt_schd" + ".cont_rqmt_qty", "cont_rqmt_qty"),
				MCItemDef.create("inpt_schd" + ".cont_fxd_rqmt_qty", "cont_fxd_rqmt_qty"),
				MCItemDef.create("inpt_schd" + ".cont_fctr_unit_cd", "cont_fctr_unit_cd"),
				MCItemDef.create("inpt_schd" + ".std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("inpt_schd" + ".act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("inpt_schd" + ".prov_typ", "prov_typ"),
				MCItemDef.create("inpt_schd" + ".par_inst_qty", "par_inst_qty"),
				MCItemDef.create("inpt_schd" + ".chd_inpt_qty", "chd_inpt_qty"),
				MCItemDef.create("inpt_schd" + ".chd_rqmt_qty", "chd_rqmt_qty"),
				MCItemDef.create("inpt_schd" + ".fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty"),
				MCItemDef.create("inpt_schd" + ".main_itm_flg", "main_itm_flg"),
				MCItemDef.create("inpt_schd" + ".inst_lot_fix_flg", "inst_lot_fix_flg"),
				MCItemDef.create("inpt_schd" + ".disp_seq", "disp_seq"),
				MCItemDef.create("inpt_schd" + ".lot_mix_flg", "lot_mix_flg"),
				MCItemDef.create("inpt_schd" + ".sublot_mix_flg", "sublot_mix_flg"),
				MCItemDef.create("inpt_schd" + ".bom_memo1", "bom_memo1"),
				MCItemDef.create("inpt_schd" + ".bom_memo2", "bom_memo2"),
				MCItemDef.create("inpt_schd" + ".bom_memo3", "bom_memo3"),
				MCItemDef.create("inpt_schd" + ".yield_calc_flg", "yield_calc_flg"),
				MCItemDef.create("inpt_schd" + ".alloc_flg", "alloc_flg"),
				MCItemDef.create("inpt_schd" + ".base_unit_alt_qty", "base_unit_alt_qty"),
				MCItemDef.create("inpt_schd" + ".alt_itm_fix_flg", "alt_itm_fix_flg"),
				MCItemDef.create("inpt_schd" + ".alt_itm_typ", "alt_itm_typ"),
				MCItemDef.create("inpt_schd" + ".alt_alloc_prio", "alt_alloc_prio"),
				MCItemDef.create("inpt_schd" + ".alt_itm_ratio", "alt_itm_ratio"),
				MCItemDef.create("inpt_schd" + ".alloc_ctl_typ", "alloc_ctl_typ"),
				MCItemDef.create("inpt_schd" + ".inpt_ctl_typ", "inpt_ctl_typ"),
				MCItemDef.create("inpt_schd" + ".in_offst_typ", "in_offst_typ"),
				MCItemDef.create("inpt_schd" + ".in_offst", "in_offst"),
				MCItemDef.create("inpt_schd" + ".bom_id_no", "bom_id_no"),
				MCItemDef.create("inpt_schd" + ".chd_itm_seq", "chd_itm_seq"),
				MCItemDef.create("inpt_schd" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("inpt_schd" + ".inst_rpt_rmrks", "inst_rpt_rmrks"),
				MCItemDef.create("inpt_schd" + ".sub_char1", "sub_char1"),
				MCItemDef.create("inpt_schd" + ".sub_char2", "sub_char2"),
				MCItemDef.create("inpt_schd" + ".sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("MfgInstTblReg_Upd05_DtlInpt")
		);
	}


	public static MCContainerDef MS_MSBCL6010_MfgInstTblReg_Upd05_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6010", "MfgInstTblReg_Upd05",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("inpt_schd" + ".inpt_schd_no", "inpt_schd_no"),
				MCItemDef.create("inpt_schd" + ".ver_no", "ver_no")
			}
			,
			MCBlockDef.create("MfgInstTblReg_Upd05_DtlInpt")
		);
	}
	public static MCContainerDef MS_MSBCL6010_MfgInstTblReg_Upd05_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL6010", "MfgInstTblReg_Upd05",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("sts_sav_flg", "sts_sav_flg"),
				MCItemDef.create("alloc_tgt_cnt", "alloc_tgt_cnt"),
				MCItemDef.create("alloc_success_cnt", "alloc_success_cnt"),
				MCItemDef.create("alloc_failure_cnt", "alloc_failure_cnt")
			}
			,
			MCBlockDef.create("MfgInstTblReg_Upd05_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBCL6010_MfgInstTblReg_Upd06_INFO = new MCOperationInfo("MS", "MSBCL6010", "MfgInstTblReg_Upd06", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6010_MfgInstTblReg_Upd06_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6010", "MfgInstTblReg_Upd06",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("mfg_mtd_typ", "mfg_mtd_typ"),
				MCItemDef.create("hdr_mfg_sts_typ", "hdr_mfg_sts_typ"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("disp_seq_upd_flg", "disp_seq_upd_flg"),
				MCItemDef.create("inst_abort_flg", "inst_abort_flg"),
				MCItemDef.create("old_inst_abort_flg", "old_inst_abort_flg"),
				MCItemDef.create("not_frst_inst_can_flg", "not_frst_inst_can_flg"),
				MCItemDef.create("mfg_inst_unit_typ", "mfg_inst_unit_typ"),
				MCItemDef.create("not_header_inst_abort_flg", "not_header_inst_abort_flg"),
				MCItemDef.create("rem_sub_char1", "rem_sub_char1"),
				MCItemDef.create("rem_sub_char2", "rem_sub_char2"),
				MCItemDef.create("rem_sub_char3", "rem_sub_char3"),
				MCItemDef.create("wk_schd" + ".wk_schd_no", "wk_schd_no"),
				MCItemDef.create("wk_schd" + ".mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("wk_schd" + ".itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("wk_schd" + ".oper_inst_no", "oper_inst_no"),
				MCItemDef.create("wk_schd" + ".wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("wk_schd" + ".wk_cost_calc_flg", "wk_cost_calc_flg"),
				MCItemDef.create("wk_schd" + ".fxd_wk_cost", "fxd_wk_cost"),
				MCItemDef.create("wk_schd" + ".wk_cost", "wk_cost"),
				MCItemDef.create("wk_schd" + ".mst_fxd_wk_cost", "mst_fxd_wk_cost"),
				MCItemDef.create("wk_schd" + ".mst_wk_cost", "mst_wk_cost"),
				MCItemDef.create("wk_schd" + ".disp_seq", "disp_seq"),
				MCItemDef.create("wk_schd" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("wk_schd" + ".sub_char1", "sub_char1"),
				MCItemDef.create("wk_schd" + ".sub_char2", "sub_char2"),
				MCItemDef.create("wk_schd" + ".sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("MfgInstTblReg_Upd06_DtlWk")
		);
	}


	public static MCContainerDef MS_MSBCL6010_MfgInstTblReg_Upd06_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6010", "MfgInstTblReg_Upd06",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("wk_schd" + ".wk_schd_no", "wk_schd_no")
			}
			,
			MCBlockDef.create("MfgInstTblReg_Upd06_DtlWk")
		);
	}
	
	static final MCOperationInfo MS_MSBCL6010_MfgInstTblReg_Upd07_INFO = new MCOperationInfo("MS", "MSBCL6010", "MfgInstTblReg_Upd07", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6010_MfgInstTblReg_Upd07_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6010", "MfgInstTblReg_Upd07",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("mfg_mtd_typ", "mfg_mtd_typ"),
				MCItemDef.create("hdr_mfg_sts_typ", "hdr_mfg_sts_typ"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("old_mfg_sts_typ", "old_mfg_sts_typ"),
				MCItemDef.create("mfg_inst_unit_typ", "mfg_inst_unit_typ"),
				MCItemDef.create("disp_seq_upd_flg", "disp_seq_upd_flg"),
				MCItemDef.create("stk_lst_prnt_flg", "stk_lst_prnt_flg"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("inst_abort_flg", "inst_abort_flg"),
				MCItemDef.create("old_inst_abort_flg", "old_inst_abort_flg"),
				MCItemDef.create("not_frst_inst_can_flg", "not_frst_inst_can_flg"),
				MCItemDef.create("not_header_inst_abort_flg", "not_header_inst_abort_flg"),
				MCItemDef.create("rem_sub_char1", "rem_sub_char1"),
				MCItemDef.create("rem_sub_char2", "rem_sub_char2"),
				MCItemDef.create("rem_sub_char3", "rem_sub_char3"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("yield_schd" + ".yield_schd_no", "yield_schd_no"),
				MCItemDef.create("yield_schd" + ".mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("yield_schd" + ".itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("yield_schd" + ".oper_inst_no", "oper_inst_no"),
				MCItemDef.create("yield_schd" + ".schd_tm", "schd_tm"),
				MCItemDef.create("yield_schd" + ".itm_cd", "itm_cd"),
				MCItemDef.create("yield_schd" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("yield_schd" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("yield_schd" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("yield_schd" + ".trd_unit_yield_qty", "trd_unit_yield_qty"),
				MCItemDef.create("yield_schd" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("yield_schd" + ".base_unit_yield_qty", "base_unit_yield_qty"),
				MCItemDef.create("yield_schd" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("yield_schd" + ".lot_no", "lot_no"),
				MCItemDef.create("yield_schd" + ".sublot_no", "sublot_no"),
				MCItemDef.create("yield_schd" + ".sno1", "sno1"),
				MCItemDef.create("yield_schd" + ".sno2", "sno2"),
				MCItemDef.create("yield_schd" + ".sno3", "sno3"),
				MCItemDef.create("yield_schd" + ".sno4", "sno4"),
				MCItemDef.create("yield_schd" + ".strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("yield_schd" + ".strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("yield_schd" + ".bkf_typ", "bkf_typ"),
				MCItemDef.create("yield_schd" + ".par_inst_qty", "par_inst_qty"),
				MCItemDef.create("yield_schd" + ".chd_inpt_qty", "chd_inpt_qty"),
				MCItemDef.create("yield_schd" + ".chd_rqmt_qty", "chd_rqmt_qty"),
				MCItemDef.create("yield_schd" + ".fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty"),
				MCItemDef.create("yield_schd" + ".disp_seq", "disp_seq"),
				MCItemDef.create("yield_schd" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("yield_schd" + ".inst_rpt_rmrks", "inst_rpt_rmrks"),
				MCItemDef.create("yield_schd" + ".sub_char1", "sub_char1"),
				MCItemDef.create("yield_schd" + ".sub_char2", "sub_char2"),
				MCItemDef.create("yield_schd" + ".sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("MfgInstTblReg_Upd07_DtlByProd")
		);
	}


	public static MCContainerDef MS_MSBCL6010_MfgInstTblReg_Upd07_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6010", "MfgInstTblReg_Upd07",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("MfgInstTblReg_Upd07_DtlByProd")
		);
	}
	
	static final MCOperationInfo MS_MSBCL6010_MfgInstTblReg_Upd08_INFO = new MCOperationInfo("MS", "MSBCL6010", "MfgInstTblReg_Upd08", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6010_MfgInstTblReg_Upd08_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6010", "MfgInstTblReg_Upd08",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("itm_ord_data_crud_typ", "itm_ord_data_crud_typ"),
				MCItemDef.create("itm_mfg_inst_data_crud_typ", "itm_mfg_inst_data_crud_typ"),
				MCItemDef.create("mfg_mtd_typ", "mfg_mtd_typ"),
				MCItemDef.create("mfg_inst_unit_typ", "mfg_inst_unit_typ"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("inst_qty", "inst_qty"),
				MCItemDef.create("yield_schd_qty", "yield_schd_qty"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("mfg_st_schd_dt", "mfg_st_schd_dt"),
				MCItemDef.create("mfg_end_schd_dt", "mfg_end_schd_dt"),
				MCItemDef.create("master_dt", "master_dt"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("unschd_flg", "unschd_flg"),
				MCItemDef.create("not_inst_qty", "not_inst_qty")
			}
			,
			MCBlockDef.create("MfgInstTblReg_Upd08_Dtl1")
		);
	}

	public static MCContainerDef MS_MSBCL6010_MfgInstTblReg_Upd08_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL6010", "MfgInstTblReg_Upd08",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("oper_ord_no", "oper_ord_no"),
				MCItemDef.create("st_schd_tm", "st_schd_tm"),
				MCItemDef.create("end_schd_tm", "end_schd_tm"),
				MCItemDef.create("oper_lt", "oper_lt"),
				MCItemDef.create("oper_offst_typ", "oper_offst_typ"),
				MCItemDef.create("oper_offst", "oper_offst"),
				MCItemDef.create("oper_schd_qty", "oper_schd_qty"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("yield_oper_flg", "yield_oper_flg"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("not_inst_qty", "not_inst_qty")
			}
			,
			MCBlockDef.create("MfgInstTblReg_Upd08_Dtl2")
		);
	}


	public static MCContainerDef MS_MSBCL6010_MfgInstTblReg_Upd08_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6010", "MfgInstTblReg_Upd08",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("itm_ord_no", "itm_ord_no")
			}
			,
			MCBlockDef.create("MfgInstTblReg_Upd08_Dtl1")
		);
	}
	
	static final MCOperationInfo MS_MSBCL6010_MfgInstTblReg_Upd09_INFO = new MCOperationInfo("MS", "MSBCL6010", "MfgInstTblReg_Upd09", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6010_MfgInstTblReg_Upd09_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6010", "MfgInstTblReg_Upd09",
			new MCItemDef[]{
				MCItemDef.create("inpt_schd_no", "inpt_schd_no"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ")
			}
			,
			MCBlockDef.create("MfgInstTblReg_Upd09_DtlInpt")
		);
	}
	
	static final MCOperationInfo MS_MSBCL6010_MfgInstTblReg_Upd10_INFO = new MCOperationInfo("MS", "MSBCL6010", "MfgInstTblReg_Upd10", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6010_MfgInstTblReg_Upd10_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6010", "MfgInstTblReg_Upd10",
			new MCItemDef[]{
				MCItemDef.create("yield_schd_no", "yield_schd_no")
			}
			,
			MCBlockDef.create("MfgInstTblReg_Upd10_DtlYield")
		);
	}


	//FMCB DEF_CLASSES END
}

