package mcframe.serverMSBC.MSBCL6060;

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
 * [MSBCL_MfgActTblRegService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBCL6060.MfgActTblReg_Chk05.UP.BLOCK0")){
			return MS_MSBCL6060_MfgActTblReg_Chk05_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6060.MfgActTblReg_Chk05.DOWN.BLOCK0")){
			return MS_MSBCL6060_MfgActTblReg_Chk05_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6060.MfgActTblReg_Upd01.UP.BLOCK0")){
			return MS_MSBCL6060_MfgActTblReg_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6060.MfgActTblReg_Upd02.UP.BLOCK0")){
			return MS_MSBCL6060_MfgActTblReg_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6060.MfgActTblReg_Upd03.UP.BLOCK0")){
			return MS_MSBCL6060_MfgActTblReg_Upd03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6060.MfgActTblReg_Upd04.UP.BLOCK0")){
			return MS_MSBCL6060_MfgActTblReg_Upd04_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6060.MfgActTblReg_Upd04.UP.BLOCK1")){
			return MS_MSBCL6060_MfgActTblReg_Upd04_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL6060.MfgActTblReg_Upd04.UP.BLOCK2")){
			return MS_MSBCL6060_MfgActTblReg_Upd04_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBCL6060.MfgActTblReg_Upd04.UP.BLOCK3")){
			return MS_MSBCL6060_MfgActTblReg_Upd04_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBCL6060.MfgActTblReg_Upd04.UP.BLOCK4")){
			return MS_MSBCL6060_MfgActTblReg_Upd04_UP_BLOCK4();
		}
		else if (id.equals("MS.MSBCL6060.MfgActTblReg_Upd04.UP.BLOCK5")){
			return MS_MSBCL6060_MfgActTblReg_Upd04_UP_BLOCK5();
		}
		else if (id.equals("MS.MSBCL6060.MfgActTblReg_Upd04.DOWN.BLOCK0")){
			return MS_MSBCL6060_MfgActTblReg_Upd04_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6060.MfgActTblReg_Upd04.DOWN.BLOCK1")){
			return MS_MSBCL6060_MfgActTblReg_Upd04_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBCL6060.MfgActTblReg_Upd04.DOWN.BLOCK2")){
			return MS_MSBCL6060_MfgActTblReg_Upd04_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBCL6060.MfgActTblReg_Upd05.UP.BLOCK0")){
			return MS_MSBCL6060_MfgActTblReg_Upd05_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6060.MfgActTblReg_Upd05.DOWN.BLOCK0")){
			return MS_MSBCL6060_MfgActTblReg_Upd05_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6060.MfgActTblReg_Upd06.UP.BLOCK0")){
			return MS_MSBCL6060_MfgActTblReg_Upd06_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
							
	
	static final MCOperationInfo MS_MSBCL6060_MfgActTblReg_Chk05_INFO = new MCOperationInfo("MS", "MSBCL6060", "MfgActTblReg_Chk05", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6060_MfgActTblReg_Chk05_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6060", "MfgActTblReg_Chk05",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("old_ac_dt", "old_ac_dt"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("st_tm", "st_tm"),
				MCItemDef.create("end_tm", "end_tm"),
				MCItemDef.create("brk_pd", "brk_pd"),
				MCItemDef.create("act_wk_cost", "act_wk_cost"),
				MCItemDef.create("wk_cost_calc_ctl_flg", "wk_cost_calc_ctl_flg"),
				MCItemDef.create("wk_cost_dec_place", "wk_cost_dec_place")
			}
			,
			MCBlockDef.create("MfgActTblReg_Chk05_Dtl")
		);
	}


	public static MCContainerDef MS_MSBCL6060_MfgActTblReg_Chk05_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6060", "MfgActTblReg_Chk05",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("MfgActTblReg_Chk05_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBCL6060_MfgActTblReg_Upd01_INFO = new MCOperationInfo("MS", "MSBCL6060", "MfgActTblReg_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6060_MfgActTblReg_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6060", "MfgActTblReg_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("mfg_act" + ".mfg_act_no", "mfg_act_no"),
				MCItemDef.create("mfg_act" + ".mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("mfg_act" + ".div_seq", "div_seq"),
				MCItemDef.create("mfg_act" + ".itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("mfg_act" + ".trd_cd", "trd_cd"),
				MCItemDef.create("mfg_act" + ".st_act_tm", "st_act_tm"),
				MCItemDef.create("mfg_act" + ".end_act_tm", "end_act_tm"),
				MCItemDef.create("mfg_act" + ".base_unit_yield_qty", "base_unit_yield_qty"),
				MCItemDef.create("mfg_act" + ".base_unit_dfct_qty", "base_unit_dfct_qty"),
				MCItemDef.create("mfg_act" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("mfg_act" + ".st_ac_dt", "st_ac_dt"),
				MCItemDef.create("mfg_act" + ".end_ac_dt", "end_ac_dt"),
				MCItemDef.create("mfg_act" + ".itm_yield", "itm_yield"),
				MCItemDef.create("mfg_act" + ".mfg_aprv_sts_typ", "mfg_aprv_sts_typ"),
				MCItemDef.create("mfg_act" + ".aprv_dt", "aprv_dt"),
				MCItemDef.create("mfg_act" + ".aprv_dpt_cd", "aprv_dpt_cd"),
				MCItemDef.create("mfg_act" + ".aprv_usr_cd", "aprv_usr_cd"),
				MCItemDef.create("mfg_act" + ".aprv_tm", "aprv_tm"),
				MCItemDef.create("mfg_act" + ".aprv_rsn", "aprv_rsn"),
				MCItemDef.create("mfg_act" + ".act_prnt_flg", "act_prnt_flg"),
				MCItemDef.create("mfg_act" + ".act_prnt_tm", "act_prnt_tm"),
				MCItemDef.create("mfg_act" + ".seq", "prnt_seq"),
				MCItemDef.create("mfg_act" + ".act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("mfg_act" + ".act_usr_cd", "act_usr_cd"),
				MCItemDef.create("mfg_act" + ".arr_purc_auto_reg_flg", "arr_purc_auto_reg_flg"),
				MCItemDef.create("mfg_act" + ".intr_rmrks", "mfg_act_intr_rmrks"),
				MCItemDef.create("mfg_act" + ".act_rpt_rmrks", "mfg_act_rpt_rmrks"),
				MCItemDef.create("mfg_act" + ".sub_char1", "mfg_act_sub_char1"),
				MCItemDef.create("mfg_act" + ".sub_char2", "mfg_act_sub_char2"),
				MCItemDef.create("mfg_act" + ".sub_char3", "mfg_act_sub_char3")
			}
			,
			MCBlockDef.create("MfgActTblReg_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBCL6060_MfgActTblReg_Upd02_INFO = new MCOperationInfo("MS", "MSBCL6060", "MfgActTblReg_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6060_MfgActTblReg_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6060", "MfgActTblReg_Upd02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("oper_std_qty", "oper_std_qty"),
				MCItemDef.create("oper_conv_qty", "oper_conv_qty"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_conv_rnd_typ", "base_unit_conv_rnd_typ"),
				MCItemDef.create("not_cmpl_flg", "not_cmpl_flg"),
				MCItemDef.create("oper_act" + ".oper_act_no", "oper_act_no"),
				MCItemDef.create("oper_act" + ".mfg_act_no", "mfg_act_no"),
				MCItemDef.create("oper_act" + ".itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("oper_act" + ".oper_inst_no", "oper_inst_no"),
				MCItemDef.create("oper_act" + ".div_seq", "div_seq"),
				MCItemDef.create("oper_act" + ".arr_act_no", "arr_act_no"),
				MCItemDef.create("oper_act" + ".purc_act_io_no", "purc_act_io_no"),
				MCItemDef.create("oper_act" + ".disp_seq", "disp_seq"),
				MCItemDef.create("oper_act" + ".st_act_tm", "st_act_tm"),
				MCItemDef.create("oper_act" + ".end_act_tm", "end_act_tm"),
				MCItemDef.create("oper_act" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("oper_act" + ".oper_unit_qty", "oper_unit_qty"),
				MCItemDef.create("oper_act" + ".oper_unit_cd", "oper_unit_cd"),
				MCItemDef.create("oper_act" + ".bkf_ctl_flg", "bkf_ctl_flg"),
				MCItemDef.create("oper_act" + ".wk_cost_calc_ctl_flg", "wk_cost_calc_ctl_flg"),
				MCItemDef.create("oper_act" + ".oper_yield", "oper_yield"),
				MCItemDef.create("oper_act" + ".bkf_not_ref_flg", "bkf_not_ref_flg"),
				MCItemDef.create("oper_act" + ".data_no", "data_no"),
				MCItemDef.create("oper_act" + ".mes_id", "mes_id"),
				MCItemDef.create("oper_act" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("oper_act" + ".act_rpt_rmrks", "act_rpt_rmrks"),
				MCItemDef.create("oper_act" + ".sub_char1", "oper_act_sub_char1"),
				MCItemDef.create("oper_act" + ".sub_char2", "oper_act_sub_char2"),
				MCItemDef.create("oper_act" + ".sub_char3", "oper_act_sub_char3"),
				MCItemDef.create("oper_act" + ".mes_flg", "mes_flg"),
				MCItemDef.create("oper_act" + ".ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("oper_act" + ".ext_oper_act_no", "ext_oper_act_no"),
				MCItemDef.create("oper_act" + ".if_auto_reg_flg", "if_auto_reg_flg")
			}
			,
			MCBlockDef.create("MfgActTblReg_Upd02_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBCL6060_MfgActTblReg_Upd03_INFO = new MCOperationInfo("MS", "MSBCL6060", "MfgActTblReg_Upd03", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6060_MfgActTblReg_Upd03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6060", "MfgActTblReg_Upd03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("pack_flg", "pack_flg"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("itm_mfg_inst_qty", "itm_mfg_inst_qty"),
				MCItemDef.create("mfg_st_qty", "mfg_st_qty"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("mfg_inst_lot_no", "mfg_inst_lot_no"),
				MCItemDef.create("mfg_inst_sublot_no", "mfg_inst_sublot_no"),
				MCItemDef.create("mfg_inst_unit_typ", "mfg_inst_unit_typ"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("yield_act" + ".yield_act_no", "yield_act_no"),
				MCItemDef.create("yield_act" + ".mfg_act_no", "mfg_act_no"),
				MCItemDef.create("yield_act" + ".itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("yield_act" + ".oper_act_no", "oper_act_no"),
				MCItemDef.create("yield_act" + ".yield_schd_no", "yield_schd_no"),
				MCItemDef.create("yield_act" + ".div_seq", "div_seq"),
				MCItemDef.create("yield_act" + ".mfg_mtd_typ", "mfg_mtd_typ"),
				MCItemDef.create("yield_act" + ".itm_cd", "itm_cd"),
				MCItemDef.create("yield_act" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("yield_act" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("yield_act" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("yield_act" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("yield_act" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("yield_act" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("yield_act" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("yield_act" + ".yield_typ", "yield_typ"),
				MCItemDef.create("yield_act" + ".yield_rate", "yield_rate"),
				MCItemDef.create("yield_act" + ".lot_no", "lot_no"),
				MCItemDef.create("yield_act" + ".sublot_no", "sublot_no"),
				MCItemDef.create("yield_act" + ".sno1", "sno1"),
				MCItemDef.create("yield_act" + ".sno2", "sno2"),
				MCItemDef.create("yield_act" + ".sno3", "sno3"),
				MCItemDef.create("yield_act" + ".sno4", "sno4"),
				MCItemDef.create("yield_act" + ".quality_typ", "quality_typ"),
				MCItemDef.create("yield_act" + ".gd_cd", "gd_cd"),
				MCItemDef.create("yield_act" + ".yield_rsn_cd", "yield_rsn_cd"),
				MCItemDef.create("yield_act" + ".yield_loc_cd", "yield_loc_cd"),
				MCItemDef.create("yield_act" + ".yield_str_ln_cd", "yield_str_ln_cd"),
				MCItemDef.create("yield_act" + ".strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("yield_act" + ".strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("yield_act" + ".act_tm", "act_tm"),
				MCItemDef.create("yield_act" + ".ac_dt", "ac_dt"),
				MCItemDef.create("yield_act" + ".bkf_ctl_flg", "bkf_ctl_flg"),
				MCItemDef.create("yield_act" + ".lot_ctl_flg", "lot_ctl_flg"),
				MCItemDef.create("yield_act" + ".sublot_ctl_flg", "sublot_ctl_flg"),
				MCItemDef.create("yield_act" + ".not_stk_flg", "not_stk_flg"),
				MCItemDef.create("yield_act" + ".data_no", "data_no"),
				MCItemDef.create("yield_act" + ".mes_id", "mes_id"),
				MCItemDef.create("yield_act" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("yield_act" + ".act_rpt_rmrks", "act_rpt_rmrks"),
				MCItemDef.create("yield_act" + ".insp_cnt_rmrks", "insp_cnt_rmrks"),
				MCItemDef.create("yield_act" + ".trd_rmrks", "trd_rmrks"),
				MCItemDef.create("yield_act" + ".sub_char1", "yield_act_sub_char1"),
				MCItemDef.create("yield_act" + ".sub_char2", "yield_act_sub_char2"),
				MCItemDef.create("yield_act" + ".sub_char3", "yield_act_sub_char3"),
				MCItemDef.create("yield_act" + ".mes_flg", "mes_flg"),
				MCItemDef.create("yield_act" + ".ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("yield_act" + ".ext_yield_act_no", "ext_yield_act_no")
			}
			,
			MCBlockDef.create("MfgActTblReg_Upd03_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBCL6060_MfgActTblReg_Upd04_INFO = new MCOperationInfo("MS", "MSBCL6060", "MfgActTblReg_Upd04", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6060_MfgActTblReg_Upd04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6060", "MfgActTblReg_Upd04",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("mfg_mtd_typ", "mfg_mtd_typ"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_str_ln_cd", "mfg_str_ln_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("inpt_loc_sppl_cd", "inpt_loc_sppl_cd"),
				MCItemDef.create("itm_mfg_inst_qty", "itm_mfg_inst_qty"),
				MCItemDef.create("mfg_st_qty", "mfg_st_qty"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("par_itm_cd", "par_itm_cd"),
				MCItemDef.create("par_itm_sub1", "par_itm_sub1"),
				MCItemDef.create("par_itm_sub2", "par_itm_sub2"),
				MCItemDef.create("par_itm_sub3", "par_itm_sub3"),
				MCItemDef.create("par_itm_nm", "par_itm_nm"),
				MCItemDef.create("mfg_inst_lot_no", "mfg_inst_lot_no"),
				MCItemDef.create("mfg_inst_sublot_no", "mfg_inst_sublot_no"),
				MCItemDef.create("mfg_inst_sno1", "mfg_inst_sno1"),
				MCItemDef.create("mfg_inst_sno2", "mfg_inst_sno2"),
				MCItemDef.create("mfg_inst_sno3", "mfg_inst_sno3"),
				MCItemDef.create("mfg_inst_sno4", "mfg_inst_sno4"),
				MCItemDef.create("mfg_inst_sno1_mng_typ", "mfg_inst_sno1_mng_typ"),
				MCItemDef.create("mfg_inst_sno2_mng_typ", "mfg_inst_sno2_mng_typ"),
				MCItemDef.create("mfg_inst_sno3_mng_typ", "mfg_inst_sno3_mng_typ"),
				MCItemDef.create("mfg_inst_sno4_mng_typ", "mfg_inst_sno4_mng_typ"),
				MCItemDef.create("mfg_inst_unit_typ", "mfg_inst_unit_typ"),
				MCItemDef.create("slf_support_cur_cd", "slf_support_cur_cd"),
				MCItemDef.create("slf_support_upri", "slf_support_upri"),
				MCItemDef.create("slf_support_tax_cd", "slf_support_tax_cd"),
				MCItemDef.create("slf_support_xrate_cd", "slf_support_xrate_cd"),
				MCItemDef.create("slf_support_xrate", "slf_support_xrate"),
				MCItemDef.create("vmi_interim_flg", "vmi_interim_flg"),
				MCItemDef.create("vmi_upri", "vmi_upri"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("cont_fctr_dec_place", "cont_fctr_dec_place"),
				MCItemDef.create("cont_fctr_rnd_typ", "cont_fctr_rnd_typ"),
				MCItemDef.create("std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_conv_rnd_typ", "base_unit_conv_rnd_typ"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("lot_mix_flg", "lot_mix_flg"),
				MCItemDef.create("sublot_mix_flg", "sublot_mix_flg"),
				MCItemDef.create("alloc_flg", "alloc_flg"),
				MCItemDef.create("alloc_ctl_typ", "alloc_ctl_typ"),
				MCItemDef.create("lst_reg_flg", "lst_reg_flg"),
				MCItemDef.create("is_src_batch_flg", "is_src_batch_flg"),
				MCItemDef.create("is_src_md_mfg_srv_flg", "is_src_md_mfg_srv_flg"),
				MCItemDef.create("alt_grp_cd", "alt_grp_cd"),
				MCItemDef.create("alt_grp_seq", "alt_grp_seq"),
				MCItemDef.create("alt_itm_fix_flg", "alt_itm_fix_flg"),
				MCItemDef.create("alt_itm_typ", "alt_itm_typ"),
				MCItemDef.create("alt_alloc_prio", "alt_alloc_prio"),
				MCItemDef.create("vld_dt", "vld_dt"),
				MCItemDef.create("first_gr_dt", "first_gr_dt"),
				MCItemDef.create("lot_seq", "lot_seq"),
				MCItemDef.create("not_pd_chk_flg", "not_pd_chk_flg"),
				MCItemDef.create("is_only_abort_flg", "is_only_abort_flg"),
				MCItemDef.create("inpt_act" + ".inpt_act_no", "inpt_act_no"),
				MCItemDef.create("inpt_act" + ".mfg_act_no", "mfg_act_no"),
				MCItemDef.create("inpt_act" + ".itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("inpt_act" + ".oper_act_no", "oper_act_no"),
				MCItemDef.create("inpt_act" + ".inpt_schd_no", "inpt_schd_no"),
				MCItemDef.create("inpt_act" + ".div_seq", "div_seq"),
				MCItemDef.create("inpt_act" + ".itm_cd", "itm_cd"),
				MCItemDef.create("inpt_act" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("inpt_act" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("inpt_act" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("inpt_act" + ".ver_no", "ver_no"),
				MCItemDef.create("inpt_act" + ".inpt_loc_cd", "inpt_loc_cd"),
				MCItemDef.create("inpt_act" + ".inpt_str_ln_cd", "inpt_str_ln_cd"),
				MCItemDef.create("inpt_act" + ".quality_typ", "quality_typ"),
				MCItemDef.create("inpt_act" + ".stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("inpt_act" + ".stk_id_typ", "stk_id_typ"),
				MCItemDef.create("inpt_act" + ".stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("inpt_act" + ".stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("inpt_act" + ".gd_cd", "gd_cd"),
				MCItemDef.create("inpt_act" + ".inpt_rsn_cd", "inpt_rsn_cd"),
				MCItemDef.create("inpt_act" + ".lot_no", "lot_no"),
				MCItemDef.create("inpt_act" + ".sublot_no", "sublot_no"),
				MCItemDef.create("inpt_act" + ".sno1", "sno1"),
				MCItemDef.create("inpt_act" + ".sno2", "sno2"),
				MCItemDef.create("inpt_act" + ".sno3", "sno3"),
				MCItemDef.create("inpt_act" + ".sno4", "sno4"),
				MCItemDef.create("inpt_act" + ".base_unit_inpt_qty", "base_unit_inpt_qty"),
				MCItemDef.create("inpt_act" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("inpt_act" + ".act_tm", "act_tm"),
				MCItemDef.create("inpt_act" + ".ac_dt", "ac_dt"),
				MCItemDef.create("inpt_act" + ".bkf_ctl_flg", "bkf_ctl_flg"),
				MCItemDef.create("inpt_act" + ".base_unit_std_qty", "base_unit_std_qty"),
				MCItemDef.create("inpt_act" + ".cont_qty", "cont_qty"),
				MCItemDef.create("inpt_act" + ".cont_loss_qty", "cont_loss_qty"),
				MCItemDef.create("inpt_act" + ".cont_fxd_loss_qty", "cont_fxd_loss_qty"),
				MCItemDef.create("inpt_act" + ".cont_fctr_unit_cd", "cont_fctr_unit_cd"),
				MCItemDef.create("inpt_act" + ".act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("inpt_act" + ".acxfr_qty", "acxfr_qty"),
				MCItemDef.create("inpt_act" + ".acxfr_rsn_cd", "acxfr_rsn_cd"),
				MCItemDef.create("inpt_act" + ".acxfr_bd_dpt_cd", "acxfr_bd_dpt_cd"),
				MCItemDef.create("inpt_act" + ".data_no", "data_no"),
				MCItemDef.create("inpt_act" + ".mes_id", "mes_id"),
				MCItemDef.create("inpt_act" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("inpt_act" + ".act_rpt_rmrks", "act_rpt_rmrks"),
				MCItemDef.create("inpt_act" + ".trd_rmrks", "trd_rmrks"),
				MCItemDef.create("inpt_act" + ".sub_char1", "inpt_act_sub_char1"),
				MCItemDef.create("inpt_act" + ".sub_char2", "inpt_act_sub_char2"),
				MCItemDef.create("inpt_act" + ".sub_char3", "inpt_act_sub_char3"),
				MCItemDef.create("inpt_act" + ".add_flg", "add_flg"),
				MCItemDef.create("inpt_act" + ".mes_flg", "mes_flg"),
				MCItemDef.create("inpt_act" + ".ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("inpt_act" + ".ext_inpt_act_no", "ext_inpt_act_no"),
				MCItemDef.create("inpt_act" + ".if_auto_reg_flg", "if_auto_reg_flg")
			}
			,
			MCBlockDef.create("MfgActTblReg_Upd04_DtlInpt")
		);
	}

	public static MCContainerDef MS_MSBCL6060_MfgActTblReg_Upd04_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL6060", "MfgActTblReg_Upd04",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("inpt_peg_no", "inpt_peg_no"),
				MCItemDef.create("loss_act" + ".loss_act_no", "loss_act_no"),
				MCItemDef.create("loss_act" + ".inpt_act_no", "inpt_act_no"),
				MCItemDef.create("loss_act" + ".loss_rsn_cd", "loss_rsn_cd"),
				MCItemDef.create("loss_act" + ".fxd_loss_flg", "fxd_loss_flg"),
				MCItemDef.create("loss_act" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("loss_act" + ".cont_qty", "cont_qty"),
				MCItemDef.create("loss_act" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("loss_act" + ".trd_rmrks", "trd_rmrks"),
				MCItemDef.create("loss_act" + ".sub_char1", "loss_act_sub_char1"),
				MCItemDef.create("loss_act" + ".sub_char2", "loss_act_sub_char2"),
				MCItemDef.create("loss_act" + ".sub_char3", "loss_act_sub_char3")
			}
			,
			MCBlockDef.create("MfgActTblReg_Upd04_DtlLoss")
		);
	}

	public static MCContainerDef MS_MSBCL6060_MfgActTblReg_Upd04_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBCL6060", "MfgActTblReg_Upd04",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("mfg_mtd_typ", "mfg_mtd_typ"),
				MCItemDef.create("yield_act_no", "yield_act_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("pack_flg", "pack_flg"),
				MCItemDef.create("not_stk_flg", "not_stk_flg")
			}
			,
			MCBlockDef.create("MfgActTblReg_Upd04_DtlYield")
		);
	}

	public static MCContainerDef MS_MSBCL6060_MfgActTblReg_Upd04_UP_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBCL6060", "MfgActTblReg_Upd04",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("mfg_mtd_typ", "mfg_mtd_typ"),
				MCItemDef.create("yield_act_no", "yield_act_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("pack_flg", "pack_flg")
			}
			,
			MCBlockDef.create("MfgActTblReg_Upd04_DtlByProd")
		);
	}

	public static MCContainerDef MS_MSBCL6060_MfgActTblReg_Upd04_UP_BLOCK4() {

		return new MCGeneralContainerDef("MS", "MSBCL6060", "MfgActTblReg_Upd04",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("bkf_tgt_cnt", "bkf_tgt_cnt"),
				MCItemDef.create("bkf_success_cnt", "bkf_success_cnt"),
				MCItemDef.create("bkf_failure_cnt", "bkf_failure_cnt")
			}
			,
			MCBlockDef.create("MfgActTblReg_Upd04_Hdr")
		);
	}

	public static MCContainerDef MS_MSBCL6060_MfgActTblReg_Upd04_UP_BLOCK5() {

		return new MCGeneralContainerDef("MS", "MSBCL6060", "MfgActTblReg_Upd04",
			new MCItemDef[]{
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("bkf_tgt_cnt", "bkf_tgt_cnt"),
				MCItemDef.create("bkf_success_cnt", "bkf_success_cnt"),
				MCItemDef.create("bkf_failure_cnt", "bkf_failure_cnt")
			}
			,
			MCBlockDef.create("MfgActTblReg_Upd04_DtlOper")
		);
	}


	public static MCContainerDef MS_MSBCL6060_MfgActTblReg_Upd04_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6060", "MfgActTblReg_Upd04",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("inpt_act_reg_skip_flg", "inpt_act_reg_skip_flg"),
				MCItemDef.create("inpt_act" + ".ver_no", "ver_no"),
				MCItemDef.create("inpt_act" + ".base_unit_fxd_loss_qty", "base_unit_fxd_loss_qty")
			}
			,
			MCBlockDef.create("MfgActTblReg_Upd04_DtlInpt")
		);
	}
	public static MCContainerDef MS_MSBCL6060_MfgActTblReg_Upd04_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL6060", "MfgActTblReg_Upd04",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("bkf_tgt_cnt", "bkf_tgt_cnt"),
				MCItemDef.create("bkf_success_cnt", "bkf_success_cnt"),
				MCItemDef.create("bkf_failure_cnt", "bkf_failure_cnt")
			}
			,
			MCBlockDef.create("MfgActTblReg_Upd04_Hdr")
		);
	}
	public static MCContainerDef MS_MSBCL6060_MfgActTblReg_Upd04_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBCL6060", "MfgActTblReg_Upd04",
			new MCItemDef[]{
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("bkf_tgt_cnt", "bkf_tgt_cnt"),
				MCItemDef.create("bkf_success_cnt", "bkf_success_cnt"),
				MCItemDef.create("bkf_failure_cnt", "bkf_failure_cnt")
			}
			,
			MCBlockDef.create("MfgActTblReg_Upd04_DtlOper")
		);
	}
	
	static final MCOperationInfo MS_MSBCL6060_MfgActTblReg_Upd05_INFO = new MCOperationInfo("MS", "MSBCL6060", "MfgActTblReg_Upd05", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6060_MfgActTblReg_Upd05_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6060", "MfgActTblReg_Upd05",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("wk_act" + ".wk_act_no", "wk_act_no"),
				MCItemDef.create("wk_act" + ".mfg_act_no", "mfg_act_no"),
				MCItemDef.create("wk_act" + ".itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("wk_act" + ".oper_act_no", "oper_act_no"),
				MCItemDef.create("wk_act" + ".wk_schd_no", "wk_schd_no"),
				MCItemDef.create("wk_act" + ".div_seq", "div_seq"),
				MCItemDef.create("wk_act" + ".wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("wk_act" + ".wk_cost", "wk_cost"),
				MCItemDef.create("wk_act" + ".st_tm", "st_tm"),
				MCItemDef.create("wk_act" + ".end_tm", "end_tm"),
				MCItemDef.create("wk_act" + ".brk_pd", "brk_pd"),
				MCItemDef.create("wk_act" + ".ac_dt", "ac_dt"),
				MCItemDef.create("wk_act" + ".wk_rsn_cd", "wk_rsn_cd"),
				MCItemDef.create("wk_act" + ".wk_cost_calc_ctl_flg", "wk_cost_calc_ctl_flg"),
				MCItemDef.create("wk_act" + ".wk_day_cd", "wk_day_cd"),
				MCItemDef.create("wk_act" + ".loc_cd", "loc_cd"),
				MCItemDef.create("wk_act" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("wk_act" + ".wk_usr_dpt_cd", "wk_usr_dpt_cd"),
				MCItemDef.create("wk_act" + ".wk_usr_cd", "wk_usr_cd"),
				MCItemDef.create("wk_act" + ".fclty", "fclty"),
				MCItemDef.create("wk_act" + ".oper_cd", "oper_cd"),
				MCItemDef.create("wk_act" + ".sno1", "sno1"),
				MCItemDef.create("wk_act" + ".sno2", "sno2"),
				MCItemDef.create("wk_act" + ".sno3", "sno3"),
				MCItemDef.create("wk_act" + ".sno4", "sno4"),
				MCItemDef.create("wk_act" + ".itm_cd", "itm_cd"),
				MCItemDef.create("wk_act" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("wk_act" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("wk_act" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("wk_act" + ".lot_no", "lot_no"),
				MCItemDef.create("wk_act" + ".sublot_no", "sublot_no"),
				MCItemDef.create("wk_act" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("wk_act" + ".sub_char1", "sub_char1"),
				MCItemDef.create("wk_act" + ".sub_char2", "sub_char2"),
				MCItemDef.create("wk_act" + ".sub_char3", "sub_char3"),
				MCItemDef.create("wk_act" + ".mes_flg", "mes_flg"),
				MCItemDef.create("wk_act" + ".ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("wk_act" + ".ext_wk_act_no", "ext_wk_act_no")
			}
			,
			MCBlockDef.create("MfgActTblReg_Upd05_Dtl")
		);
	}


	public static MCContainerDef MS_MSBCL6060_MfgActTblReg_Upd05_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6060", "MfgActTblReg_Upd05",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("wk_act" + ".wk_act_no", "wk_act_no"),
				MCItemDef.create("wk_act" + ".wk_cost", "wk_cost")
			}
			,
			MCBlockDef.create("MfgActTblReg_Upd05_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBCL6060_MfgActTblReg_Upd06_INFO = new MCOperationInfo("MS", "MSBCL6060", "MfgActTblReg_Upd06", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6060_MfgActTblReg_Upd06_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6060", "MfgActTblReg_Upd06",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("pack_flg", "pack_flg"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("itm_mfg_inst_qty", "itm_mfg_inst_qty"),
				MCItemDef.create("mfg_st_qty", "mfg_st_qty"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("par_itm_cd", "par_itm_cd"),
				MCItemDef.create("par_itm_sub1", "par_itm_sub1"),
				MCItemDef.create("par_itm_sub2", "par_itm_sub2"),
				MCItemDef.create("par_itm_sub3", "par_itm_sub3"),
				MCItemDef.create("par_itm_nm", "par_itm_nm"),
				MCItemDef.create("mfg_inst_lot_no", "mfg_inst_lot_no"),
				MCItemDef.create("mfg_inst_sublot_no", "mfg_inst_sublot_no"),
				MCItemDef.create("mfg_inst_sno1", "mfg_inst_sno1"),
				MCItemDef.create("mfg_inst_sno2", "mfg_inst_sno2"),
				MCItemDef.create("mfg_inst_sno3", "mfg_inst_sno3"),
				MCItemDef.create("mfg_inst_sno4", "mfg_inst_sno4"),
				MCItemDef.create("mfg_inst_unit_typ", "mfg_inst_unit_typ"),
				MCItemDef.create("mfg_inst_sno1_mng_typ", "mfg_inst_sno1_mng_typ"),
				MCItemDef.create("mfg_inst_sno2_mng_typ", "mfg_inst_sno2_mng_typ"),
				MCItemDef.create("mfg_inst_sno3_mng_typ", "mfg_inst_sno3_mng_typ"),
				MCItemDef.create("mfg_inst_sno4_mng_typ", "mfg_inst_sno4_mng_typ"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("by_prod" + ".yield_act_no", "yield_act_no"),
				MCItemDef.create("by_prod" + ".mfg_act_no", "mfg_act_no"),
				MCItemDef.create("by_prod" + ".itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("by_prod" + ".oper_act_no", "oper_act_no"),
				MCItemDef.create("by_prod" + ".yield_schd_no", "yield_schd_no"),
				MCItemDef.create("by_prod" + ".div_seq", "div_seq"),
				MCItemDef.create("by_prod" + ".mfg_mtd_typ", "mfg_mtd_typ"),
				MCItemDef.create("by_prod" + ".itm_cd", "itm_cd"),
				MCItemDef.create("by_prod" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("by_prod" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("by_prod" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("by_prod" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("by_prod" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("by_prod" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("by_prod" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("by_prod" + ".yield_typ", "yield_typ"),
				MCItemDef.create("by_prod" + ".yield_rate", "yield_rate"),
				MCItemDef.create("by_prod" + ".lot_no", "lot_no"),
				MCItemDef.create("by_prod" + ".sublot_no", "sublot_no"),
				MCItemDef.create("by_prod" + ".sno1", "sno1"),
				MCItemDef.create("by_prod" + ".sno2", "sno2"),
				MCItemDef.create("by_prod" + ".sno3", "sno3"),
				MCItemDef.create("by_prod" + ".sno4", "sno4"),
				MCItemDef.create("by_prod" + ".quality_typ", "quality_typ"),
				MCItemDef.create("by_prod" + ".stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("by_prod" + ".gd_cd", "gd_cd"),
				MCItemDef.create("by_prod" + ".yield_rsn_cd", "yield_rsn_cd"),
				MCItemDef.create("by_prod" + ".yield_loc_cd", "yield_loc_cd"),
				MCItemDef.create("by_prod" + ".yield_str_ln_cd", "yield_str_ln_cd"),
				MCItemDef.create("by_prod" + ".strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("by_prod" + ".strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("by_prod" + ".act_tm", "act_tm"),
				MCItemDef.create("by_prod" + ".ac_dt", "ac_dt"),
				MCItemDef.create("by_prod" + ".bkf_ctl_flg", "bkf_ctl_flg"),
				MCItemDef.create("by_prod" + ".lot_ctl_flg", "lot_ctl_flg"),
				MCItemDef.create("by_prod" + ".sublot_ctl_flg", "sublot_ctl_flg"),
				MCItemDef.create("by_prod" + ".data_no", "data_no"),
				MCItemDef.create("by_prod" + ".mes_id", "mes_id"),
				MCItemDef.create("by_prod" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("by_prod" + ".trd_rmrks", "trd_rmrks"),
				MCItemDef.create("by_prod" + ".sub_char1", "yield_act_sub_char1"),
				MCItemDef.create("by_prod" + ".sub_char2", "yield_act_sub_char2"),
				MCItemDef.create("by_prod" + ".sub_char3", "yield_act_sub_char3"),
				MCItemDef.create("by_prod" + ".mes_flg", "mes_flg"),
				MCItemDef.create("by_prod" + ".ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("by_prod" + ".ext_yield_act_no", "ext_yield_act_no")
			}
			,
			MCBlockDef.create("MfgActTblReg_Upd06_Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

