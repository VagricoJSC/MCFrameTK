package mcframe.serverMSBC.MSBCL6000;

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
 * [MSBCL_MfgInstRegService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBCL6000.MfgInstReg_Chk01.UP.BLOCK0")){
			return MS_MSBCL6000_MfgInstReg_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6000.MfgInstReg_Chk01.UP.BLOCK1")){
			return MS_MSBCL6000_MfgInstReg_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL6000.MfgInstReg_Chk01.UP.BLOCK2")){
			return MS_MSBCL6000_MfgInstReg_Chk01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBCL6000.MfgInstReg_Chk01.UP.BLOCK3")){
			return MS_MSBCL6000_MfgInstReg_Chk01_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBCL6000.MfgInstReg_Chk01.UP.BLOCK4")){
			return MS_MSBCL6000_MfgInstReg_Chk01_UP_BLOCK4();
		}
		else if (id.equals("MS.MSBCL6000.MfgInstReg_Chk01.UP.BLOCK5")){
			return MS_MSBCL6000_MfgInstReg_Chk01_UP_BLOCK5();
		}
		else if (id.equals("MS.MSBCL6000.MfgInstReg_Chk01.UP.BLOCK6")){
			return MS_MSBCL6000_MfgInstReg_Chk01_UP_BLOCK6();
		}
		else if (id.equals("MS.MSBCL6000.MfgInstReg_Chk01.DOWN.BLOCK0")){
			return MS_MSBCL6000_MfgInstReg_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6000.MfgInstReg_Chk01.DOWN.BLOCK1")){
			return MS_MSBCL6000_MfgInstReg_Chk01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBCL6000.MfgInstReg_Chk01.DOWN.BLOCK2")){
			return MS_MSBCL6000_MfgInstReg_Chk01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBCL6000.MfgInstReg_Chk01.DOWN.BLOCK3")){
			return MS_MSBCL6000_MfgInstReg_Chk01_DOWN_BLOCK3();
		}
		else if (id.equals("MS.MSBCL6000.MfgInstReg_Chk01.DOWN.BLOCK4")){
			return MS_MSBCL6000_MfgInstReg_Chk01_DOWN_BLOCK4();
		}
		else if (id.equals("MS.MSBCL6000.MfgInstReg_Chk01.DOWN.BLOCK5")){
			return MS_MSBCL6000_MfgInstReg_Chk01_DOWN_BLOCK5();
		}
		else if (id.equals("MS.MSBCL6000.MfgInstReg_Chk01.DOWN.BLOCK6")){
			return MS_MSBCL6000_MfgInstReg_Chk01_DOWN_BLOCK6();
		}
		else if (id.equals("MS.MSBCL6000.MfgInstReg_Chk02.UP.BLOCK0")){
			return MS_MSBCL6000_MfgInstReg_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6000.MfgInstReg_Chk02.UP.BLOCK1")){
			return MS_MSBCL6000_MfgInstReg_Chk02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL6000.MfgInstReg_Chk02.DOWN.BLOCK0")){
			return MS_MSBCL6000_MfgInstReg_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6000.MfgInstReg_Chk02.DOWN.BLOCK1")){
			return MS_MSBCL6000_MfgInstReg_Chk02_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBCL6000.MfgInstReg_Chk02.DOWN.BLOCK2")){
			return MS_MSBCL6000_MfgInstReg_Chk02_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBCL6000.MfgInstReg_Chk02.DOWN.BLOCK3")){
			return MS_MSBCL6000_MfgInstReg_Chk02_DOWN_BLOCK3();
		}
		else if (id.equals("MS.MSBCL6000.MfgInstReg_Chk02.DOWN.BLOCK4")){
			return MS_MSBCL6000_MfgInstReg_Chk02_DOWN_BLOCK4();
		}
		else if (id.equals("MS.MSBCL6000.MfgInstReg_Chk02.DOWN.BLOCK5")){
			return MS_MSBCL6000_MfgInstReg_Chk02_DOWN_BLOCK5();
		}
		else if (id.equals("MS.MSBCL6000.MfgInstReg_Chk02.DOWN.BLOCK6")){
			return MS_MSBCL6000_MfgInstReg_Chk02_DOWN_BLOCK6();
		}
		else if (id.equals("MS.MSBCL6000.MfgInstReg_Chk03.UP.BLOCK0")){
			return MS_MSBCL6000_MfgInstReg_Chk03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6000.MfgInstReg_Chk03.UP.BLOCK1")){
			return MS_MSBCL6000_MfgInstReg_Chk03_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL6000.MfgInstReg_Chk03.UP.BLOCK2")){
			return MS_MSBCL6000_MfgInstReg_Chk03_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBCL6000.MfgInstReg_Chk03.DOWN.BLOCK0")){
			return MS_MSBCL6000_MfgInstReg_Chk03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6000.MfgInstReg_Chk03.DOWN.BLOCK1")){
			return MS_MSBCL6000_MfgInstReg_Chk03_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBCL6000.MfgInstReg_Upd01.UP.BLOCK0")){
			return MS_MSBCL6000_MfgInstReg_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6000.MfgInstReg_Upd01.UP.BLOCK1")){
			return MS_MSBCL6000_MfgInstReg_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL6000.MfgInstReg_Upd01.UP.BLOCK2")){
			return MS_MSBCL6000_MfgInstReg_Upd01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBCL6000.MfgInstReg_Upd01.UP.BLOCK3")){
			return MS_MSBCL6000_MfgInstReg_Upd01_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBCL6000.MfgInstReg_Upd01.UP.BLOCK4")){
			return MS_MSBCL6000_MfgInstReg_Upd01_UP_BLOCK4();
		}
		else if (id.equals("MS.MSBCL6000.MfgInstReg_Upd01.UP.BLOCK5")){
			return MS_MSBCL6000_MfgInstReg_Upd01_UP_BLOCK5();
		}
		else if (id.equals("MS.MSBCL6000.MfgInstReg_Upd01.UP.BLOCK6")){
			return MS_MSBCL6000_MfgInstReg_Upd01_UP_BLOCK6();
		}
		else if (id.equals("MS.MSBCL6000.MfgInstReg_Upd01.DOWN.BLOCK0")){
			return MS_MSBCL6000_MfgInstReg_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6000.MfgInstReg_Upd01.DOWN.BLOCK1")){
			return MS_MSBCL6000_MfgInstReg_Upd01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBCL6000.MfgInstReg_Upd01.DOWN.BLOCK2")){
			return MS_MSBCL6000_MfgInstReg_Upd01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBCL6000.MfgInstReg_Upd01.DOWN.BLOCK3")){
			return MS_MSBCL6000_MfgInstReg_Upd01_DOWN_BLOCK3();
		}
		else if (id.equals("MS.MSBCL6000.MfgInstReg_Upd01.DOWN.BLOCK4")){
			return MS_MSBCL6000_MfgInstReg_Upd01_DOWN_BLOCK4();
		}
		else if (id.equals("MS.MSBCL6000.MfgInstReg_Upd01.DOWN.BLOCK5")){
			return MS_MSBCL6000_MfgInstReg_Upd01_DOWN_BLOCK5();
		}
		else if (id.equals("MS.MSBCL6000.MfgInstReg_Upd02.UP.BLOCK0")){
			return MS_MSBCL6000_MfgInstReg_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6000.MfgInstReg_Upd02.UP.BLOCK1")){
			return MS_MSBCL6000_MfgInstReg_Upd02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL6000.MfgInstReg_Upd02.UP.BLOCK2")){
			return MS_MSBCL6000_MfgInstReg_Upd02_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBCL6000.MfgInstReg_Upd02.DOWN.BLOCK0")){
			return MS_MSBCL6000_MfgInstReg_Upd02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6000.MfgInstReg_Upd02.DOWN.BLOCK1")){
			return MS_MSBCL6000_MfgInstReg_Upd02_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBCL6000.MfgInstReg_Del01.UP.BLOCK0")){
			return MS_MSBCL6000_MfgInstReg_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6000.MfgInstReg_Del01.UP.BLOCK1")){
			return MS_MSBCL6000_MfgInstReg_Del01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL6000.MfgInstReg_Del01.UP.BLOCK2")){
			return MS_MSBCL6000_MfgInstReg_Del01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBCL6000.MfgInstReg_Del01.DOWN.BLOCK0")){
			return MS_MSBCL6000_MfgInstReg_Del01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6000.MfgInstReg_RevUpd01.UP.BLOCK0")){
			return MS_MSBCL6000_MfgInstReg_RevUpd01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
							
	
	static final MCOperationInfo MS_MSBCL6000_MfgInstReg_Chk01_INFO = new MCOperationInfo("MS", "MSBCL6000", "MfgInstReg_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6000_MfgInstReg_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6000", "MfgInstReg_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("mfg_mtd_typ", "mfg_mtd_typ"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("master_dt", "master_dt"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("base_unit_inst_qty", "base_unit_inst_qty"),
				MCItemDef.create("base_unit_yield_qty", "base_unit_yield_qty"),
				MCItemDef.create("inst_dt", "inst_dt"),
				MCItemDef.create("inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("inst_dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("rqst_dlv_rqst_tm", "rqst_dlv_rqst_tm"),
				MCItemDef.create("st_schd_tm", "st_schd_tm"),
				MCItemDef.create("end_schd_tm", "end_schd_tm"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("mfg_str_ln_cd", "mfg_str_ln_cd"),
				MCItemDef.create("strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("po_locked_flg", "po_locked_flg"),
				MCItemDef.create("inst_abort_flg", "inst_abort_flg"),
				MCItemDef.create("inst_rpt_rmrks", "inst_rpt_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("inst_po_cnt_rmrks", "inst_po_cnt_rmrks"),
				MCItemDef.create("disp_pd", "disp_pd"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("mfg_inst_rev", "mfg_inst_rev"),
				MCItemDef.create("inst_immed_prnt_flg", "inst_immed_prnt_flg"),
				MCItemDef.create("chg_list_immed_prnt_flg", "chg_list_immed_prnt_flg"),
				MCItemDef.create("xfr_inst_del_enable_flg", "xfr_inst_del_enable_flg"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("unschd_act_flg", "unschd_act_flg"),
				MCItemDef.create("ord_abort_flg", "ord_abort_flg"),
				MCItemDef.create("itm_mfg_inst_sub_char1", "itm_mfg_inst_sub_char1"),
				MCItemDef.create("itm_mfg_inst_sub_char2", "itm_mfg_inst_sub_char2"),
				MCItemDef.create("itm_mfg_inst_sub_char3", "itm_mfg_inst_sub_char3"),
				MCItemDef.create("mfg_inst_sub_char1", "mfg_inst_sub_char1"),
				MCItemDef.create("mfg_inst_sub_char2", "mfg_inst_sub_char2"),
				MCItemDef.create("mfg_inst_sub_char3", "mfg_inst_sub_char3"),
				MCItemDef.create("itm_ord_upd_cntr", "itm_ord_upd_cntr"),
				MCItemDef.create("itm_mfg_inst_upd_cntr", "itm_mfg_inst_upd_cntr"),
				MCItemDef.create("mfg_inst_upd_cntr", "mfg_inst_upd_cntr"),
				MCItemDef.create("upd_cntr_chk_flg", "upd_cntr_chk_flg"),
				MCItemDef.create("is_src_batch_flg", "is_src_batch_flg"),
				MCItemDef.create("lst_reg_flg", "lst_reg_flg"),
				MCItemDef.create("not_frst_inst_reg_oper_flg", "not_frst_inst_reg_oper_flg"),
				MCItemDef.create("comp_dt_from_oper_flg", "comp_dt_from_oper_flg"),
				MCItemDef.create("is_src_alloc_flg", "is_src_alloc_flg")
			}
			,
			MCBlockDef.create("MfgInstReg_Chk01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBCL6000_MfgInstReg_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL6000", "MfgInstReg_Chk01",
			new MCItemDef[]{
				MCItemDef.create("tgt_oper_flg", "tgt_oper_flg"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("st_schd_tm", "st_schd_tm"),
				MCItemDef.create("end_schd_tm", "end_schd_tm"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("oper_loc_cd", "oper_loc_cd"),
				MCItemDef.create("oper_str_ln_cd", "oper_str_ln_cd"),
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("oper_abort_flg", "oper_abort_flg"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("oper_rsrc", "oper_rsrc"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("inst_rpt_rmrks", "inst_rpt_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("bkf_flg", "bkf_flg"),
				MCItemDef.create("wk_cost_calc_flg", "wk_cost_calc_flg"),
				MCItemDef.create("oper_inst_grp", "oper_inst_grp"),
				MCItemDef.create("oper_ord_no", "oper_ord_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("unschd_act_flg", "unschd_act_flg"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("mes_flg", "mes_flg")
			}
			,
			MCBlockDef.create("MfgInstReg_Chk01_DtlOper")
		);
	}

	public static MCContainerDef MS_MSBCL6000_MfgInstReg_Chk01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBCL6000", "MfgInstReg_Chk01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("alt_grp_cd", "alt_grp_cd"),
				MCItemDef.create("alt_grp_seq", "alt_grp_seq"),
				MCItemDef.create("alt_itm_fix_flg", "alt_itm_fix_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("base_unit_alt_qty", "base_unit_alt_qty"),
				MCItemDef.create("base_unit_inpt_qty", "base_unit_inpt_qty"),
				MCItemDef.create("base_unit_rqmt_qty", "base_unit_rqmt_qty"),
				MCItemDef.create("base_unit_fxd_rqmt_qty", "base_unit_fxd_rqmt_qty"),
				MCItemDef.create("cont_inpt_qty", "cont_inpt_qty"),
				MCItemDef.create("cont_rqmt_qty", "cont_rqmt_qty"),
				MCItemDef.create("cont_fxd_rqmt_qty", "cont_fxd_rqmt_qty"),
				MCItemDef.create("schd_tm", "schd_tm"),
				MCItemDef.create("alloc_flg", "alloc_flg"),
				MCItemDef.create("no_lot_fix_flg", "no_lot_fix_flg"),
				MCItemDef.create("inst_lot_fix_flg", "inst_lot_fix_flg"),
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
				MCItemDef.create("inpt_loc_cd", "inpt_loc_cd"),
				MCItemDef.create("inpt_str_ln_cd", "inpt_str_ln_cd"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("inpt_rsn_cd", "inpt_rsn_cd"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("inst_rpt_rmrks", "inst_rpt_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("bkf_typ", "bkf_typ"),
				MCItemDef.create("par_inst_qty", "par_inst_qty"),
				MCItemDef.create("chd_inpt_qty", "chd_inpt_qty"),
				MCItemDef.create("chd_rqmt_qty", "chd_rqmt_qty"),
				MCItemDef.create("fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty"),
				MCItemDef.create("main_itm_flg", "main_itm_flg"),
				MCItemDef.create("bom_id_no", "bom_id_no"),
				MCItemDef.create("chd_itm_seq", "chd_itm_seq"),
				MCItemDef.create("bom_memo1", "bom_memo1"),
				MCItemDef.create("bom_memo2", "bom_memo2"),
				MCItemDef.create("bom_memo3", "bom_memo3"),
				MCItemDef.create("yield_calc_flg", "yield_calc_flg"),
				MCItemDef.create("alloc_ctl_typ", "alloc_ctl_typ"),
				MCItemDef.create("inpt_ctl_typ", "inpt_ctl_typ"),
				MCItemDef.create("in_offst_typ", "in_offst_typ"),
				MCItemDef.create("in_offst", "in_offst"),
				MCItemDef.create("lot_mix_flg", "lot_mix_flg"),
				MCItemDef.create("sublot_mix_flg", "sublot_mix_flg"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("alt_itm_typ", "alt_itm_typ"),
				MCItemDef.create("alt_alloc_prio", "alt_alloc_prio"),
				MCItemDef.create("alt_itm_ratio", "alt_itm_ratio"),
				MCItemDef.create("inpt_schd_no", "inpt_schd_no"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("disp_seq_upd_flg", "disp_seq_upd_flg")
			}
			,
			MCBlockDef.create("MfgInstReg_Chk01_DtlInpt")
		);
	}

	public static MCContainerDef MS_MSBCL6000_MfgInstReg_Chk01_UP_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBCL6000", "MfgInstReg_Chk01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("wk_cost", "wk_cost"),
				MCItemDef.create("fxd_wk_cost", "fxd_wk_cost"),
				MCItemDef.create("wk_cost_calc_flg", "wk_cost_calc_flg"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("wk_schd_no", "wk_schd_no"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("disp_seq_upd_flg", "disp_seq_upd_flg")
			}
			,
			MCBlockDef.create("MfgInstReg_Chk01_DtlWk")
		);
	}

	public static MCContainerDef MS_MSBCL6000_MfgInstReg_Chk01_UP_BLOCK4() {

		return new MCGeneralContainerDef("MS", "MSBCL6000", "MfgInstReg_Chk01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_yield_qty", "trd_unit_yield_qty"),
				MCItemDef.create("schd_tm", "schd_tm"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("inst_rpt_rmrks", "inst_rpt_rmrks"),
				MCItemDef.create("insp_cnt_rmrks", "insp_cnt_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("disp_seq_upd_flg", "disp_seq_upd_flg")
			}
			,
			MCBlockDef.create("MfgInstReg_Chk01_DtlYield")
		);
	}

	public static MCContainerDef MS_MSBCL6000_MfgInstReg_Chk01_UP_BLOCK5() {

		return new MCGeneralContainerDef("MS", "MSBCL6000", "MfgInstReg_Chk01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_yield_qty", "trd_unit_yield_qty"),
				MCItemDef.create("schd_tm", "schd_tm"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("bkf_typ", "bkf_typ"),
				MCItemDef.create("par_inst_qty", "par_inst_qty"),
				MCItemDef.create("chd_inpt_qty", "chd_inpt_qty"),
				MCItemDef.create("chd_rqmt_qty", "chd_rqmt_qty"),
				MCItemDef.create("fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("inst_rpt_rmrks", "inst_rpt_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("disp_seq_upd_flg", "disp_seq_upd_flg")
			}
			,
			MCBlockDef.create("MfgInstReg_Chk01_DtlByProd")
		);
	}

	public static MCContainerDef MS_MSBCL6000_MfgInstReg_Chk01_UP_BLOCK6() {

		return new MCGeneralContainerDef("MS", "MSBCL6000", "MfgInstReg_Chk01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("ref_ord", "ref_ord"),
				MCItemDef.create("re_ext_typ", "re_ext_typ"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("MfgInstReg_Chk01_DtlReExt")
		);
	}


	public static MCContainerDef MS_MSBCL6000_MfgInstReg_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6000", "MfgInstReg_Chk01",
			new MCItemDef[]{
				MCItemDef.create("mfg_inst_data_crud_typ", "mfg_inst_data_crud_typ"),
				MCItemDef.create("itm_mfg_inst_data_crud_typ", "itm_mfg_inst_data_crud_typ"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("mfg_mtd_typ", "mfg_mtd_typ"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("master_dt", "master_dt"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("lot_no_typ", "lot_no_typ"),
				MCItemDef.create("lot_no_ptn_cd", "lot_no_ptn_cd"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("sublot_no_typ", "sublot_no_typ"),
				MCItemDef.create("sublot_no_ptn_cd", "sublot_no_ptn_cd"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("lot_issue_typ", "lot_issue_typ"),
				MCItemDef.create("base_unit_inst_qty", "base_unit_inst_qty"),
				MCItemDef.create("base_unit_yield_qty", "base_unit_yield_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("inst_dt", "inst_dt"),
				MCItemDef.create("inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("inst_dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("rqst_dlv_rqst_tm", "rqst_dlv_rqst_tm"),
				MCItemDef.create("st_schd_tm", "st_schd_tm"),
				MCItemDef.create("end_schd_tm", "end_schd_tm"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("mfg_str_ln_cd", "mfg_str_ln_cd"),
				MCItemDef.create("strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("po_locked_flg", "po_locked_flg"),
				MCItemDef.create("inst_abort_flg", "inst_abort_flg"),
				MCItemDef.create("inst_rpt_rmrks", "inst_rpt_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("inst_po_cnt_rmrks", "inst_po_cnt_rmrks"),
				MCItemDef.create("disp_pd", "disp_pd"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("mfg_inst_rev", "mfg_inst_rev"),
				MCItemDef.create("inst_prnt_tm", "inst_prnt_tm"),
				MCItemDef.create("inst_prnt_flg", "inst_prnt_flg"),
				MCItemDef.create("inst_immed_prnt_flg", "inst_immed_prnt_flg"),
				MCItemDef.create("chg_list_immed_prnt_flg", "chg_list_immed_prnt_flg"),
				MCItemDef.create("xfr_inst_del_enable_flg", "xfr_inst_del_enable_flg"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("frst_mfg_inst_no", "frst_mfg_inst_no"),
				MCItemDef.create("io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("mfg_inst_unit_typ", "mfg_inst_unit_typ"),
				MCItemDef.create("unschd_inst_flg", "unschd_inst_flg"),
				MCItemDef.create("unschd_act_flg", "unschd_act_flg"),
				MCItemDef.create("schd_chg_flg", "schd_chg_flg"),
				MCItemDef.create("base_unit_ord_qty", "base_unit_ord_qty"),
				MCItemDef.create("base_unit_not_inst_qty", "base_unit_not_inst_qty"),
				MCItemDef.create("ord_abort_flg", "ord_abort_flg"),
				MCItemDef.create("mfg_loc_wg_cd", "mfg_loc_wg_cd"),
				MCItemDef.create("mfg_loc_site_cd", "mfg_loc_site_cd"),
				MCItemDef.create("itm_lower_yield", "itm_lower_yield"),
				MCItemDef.create("itm_std_yield", "itm_std_yield"),
				MCItemDef.create("itm_upper_yield", "itm_upper_yield"),
				MCItemDef.create("inst_rec_issue_flg", "inst_rec_issue_flg"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("po_auto_reg_flg", "po_auto_reg_flg"),
				MCItemDef.create("po_schd_src_typ", "po_schd_src_typ"),
				MCItemDef.create("po_schd_src_no", "po_schd_src_no"),
				MCItemDef.create("po_schd_data_crud_typ", "po_schd_data_crud_typ"),
				MCItemDef.create("itm_mfg_inst_sub_char1", "itm_mfg_inst_sub_char1"),
				MCItemDef.create("itm_mfg_inst_sub_char2", "itm_mfg_inst_sub_char2"),
				MCItemDef.create("itm_mfg_inst_sub_char3", "itm_mfg_inst_sub_char3"),
				MCItemDef.create("mfg_inst_sub_char1", "mfg_inst_sub_char1"),
				MCItemDef.create("mfg_inst_sub_char2", "mfg_inst_sub_char2"),
				MCItemDef.create("mfg_inst_sub_char3", "mfg_inst_sub_char3"),
				MCItemDef.create("no_mfg_aprv_flg", "no_mfg_aprv_flg"),
				MCItemDef.create("itm_ord_upd_cntr", "itm_ord_upd_cntr"),
				MCItemDef.create("itm_mfg_inst_upd_cntr", "itm_mfg_inst_upd_cntr"),
				MCItemDef.create("mfg_inst_upd_cntr", "mfg_inst_upd_cntr"),
				MCItemDef.create("old_mfg_sts_typ", "old_mfg_sts_typ"),
				MCItemDef.create("old_mfg_aprv_sts_typ", "old_mfg_aprv_sts_typ"),
				MCItemDef.create("old_aprv_flg", "old_aprv_flg"),
				MCItemDef.create("old_mfg_aprv_role_cd", "old_mfg_aprv_role_cd"),
				MCItemDef.create("old_inst_dt", "old_inst_dt"),
				MCItemDef.create("old_lot_no", "old_lot_no"),
				MCItemDef.create("old_sublot_no", "old_sublot_no"),
				MCItemDef.create("old_bom_ptn", "old_bom_ptn"),
				MCItemDef.create("old_inst_abort_flg", "old_inst_abort_flg"),
				MCItemDef.create("lst_reg_flg", "lst_reg_flg"),
				MCItemDef.create("not_frst_inst_can_flg", "not_frst_inst_can_flg"),
				MCItemDef.create("not_frst_inst_reg_oper_flg", "not_frst_inst_reg_oper_flg"),
				MCItemDef.create("old_mfg_inst_rev", "old_mfg_inst_rev")
			}
			,
			MCBlockDef.create("MfgInstReg_Chk01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBCL6000_MfgInstReg_Chk01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL6000", "MfgInstReg_Chk01",
			new MCItemDef[]{
				MCItemDef.create("tgt_oper_flg", "tgt_oper_flg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("st_schd_tm", "st_schd_tm"),
				MCItemDef.create("end_schd_tm", "end_schd_tm"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("oper_std_qty", "oper_std_qty"),
				MCItemDef.create("oper_conv_qty", "oper_conv_qty"),
				MCItemDef.create("oper_unit_conv_rnd_typ", "oper_unit_conv_rnd_typ"),
				MCItemDef.create("oper_unit_dec_place", "oper_unit_dec_place"),
				MCItemDef.create("oper_unit_cd", "oper_unit_cd"),
				MCItemDef.create("oper_loc_cd", "oper_loc_cd"),
				MCItemDef.create("oper_str_ln_cd", "oper_str_ln_cd"),
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("oper_abort_flg", "oper_abort_flg"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("oper_rsrc", "oper_rsrc"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("inst_rpt_rmrks", "inst_rpt_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("bkf_flg", "bkf_flg"),
				MCItemDef.create("wk_cost_calc_flg", "wk_cost_calc_flg"),
				MCItemDef.create("oper_inst_grp", "oper_inst_grp"),
				MCItemDef.create("oper_lt", "oper_lt"),
				MCItemDef.create("oper_lt_add_qty", "oper_lt_add_qty"),
				MCItemDef.create("oper_offst_typ", "oper_offst_typ"),
				MCItemDef.create("oper_offst", "oper_offst"),
				MCItemDef.create("oper_offst_add_qty", "oper_offst_add_qty"),
				MCItemDef.create("lmt_fr_dt_flg", "lmt_fr_dt_flg"),
				MCItemDef.create("oper_lower_yield", "oper_lower_yield"),
				MCItemDef.create("oper_std_yield", "oper_std_yield"),
				MCItemDef.create("oper_upper_yield", "oper_upper_yield"),
				MCItemDef.create("wip_rate", "wip_rate"),
				MCItemDef.create("oper_ord_no", "oper_ord_no"),
				MCItemDef.create("not_oper_schd_qty", "not_oper_schd_qty"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("unschd_inst_flg", "unschd_inst_flg"),
				MCItemDef.create("unschd_act_flg", "unschd_act_flg"),
				MCItemDef.create("hdr_mfg_sts_typ", "hdr_mfg_sts_typ"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("yield_oper_flg", "yield_oper_flg"),
				MCItemDef.create("yield_oper_ratio", "yield_oper_ratio"),
				MCItemDef.create("inst_abort_flg", "inst_abort_flg"),
				MCItemDef.create("old_inst_abort_flg", "old_inst_abort_flg"),
				MCItemDef.create("not_frst_inst_can_flg", "not_frst_inst_can_flg"),
				MCItemDef.create("mes_flg", "mes_flg")
			}
			,
			MCBlockDef.create("MfgInstReg_Chk01_DtlOper")
		);
	}
	public static MCContainerDef MS_MSBCL6000_MfgInstReg_Chk01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBCL6000", "MfgInstReg_Chk01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("alt_grp_cd", "alt_grp_cd"),
				MCItemDef.create("alt_grp_seq", "alt_grp_seq"),
				MCItemDef.create("alt_itm_fix_flg", "alt_itm_fix_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("old_ver_no", "old_ver_no"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("base_unit_alt_qty", "base_unit_alt_qty"),
				MCItemDef.create("base_unit_inpt_qty", "base_unit_inpt_qty"),
				MCItemDef.create("base_unit_rqmt_qty", "base_unit_rqmt_qty"),
				MCItemDef.create("base_unit_fxd_rqmt_qty", "base_unit_fxd_rqmt_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("cont_inpt_qty", "cont_inpt_qty"),
				MCItemDef.create("cont_rqmt_qty", "cont_rqmt_qty"),
				MCItemDef.create("cont_fxd_rqmt_qty", "cont_fxd_rqmt_qty"),
				MCItemDef.create("cont_fctr_unit_cd", "cont_fctr_unit_cd"),
				MCItemDef.create("std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("schd_tm", "schd_tm"),
				MCItemDef.create("alloc_flg", "alloc_flg"),
				MCItemDef.create("no_lot_fix_flg", "no_lot_fix_flg"),
				MCItemDef.create("inst_lot_fix_flg", "inst_lot_fix_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("vld_dt", "vld_dt"),
				MCItemDef.create("first_gr_dt", "first_gr_dt"),
				MCItemDef.create("lot_seq", "lot_seq"),
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
				MCItemDef.create("inpt_loc_cd", "inpt_loc_cd"),
				MCItemDef.create("inpt_str_ln_cd", "inpt_str_ln_cd"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("inpt_rsn_cd", "inpt_rsn_cd"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("inst_rpt_rmrks", "inst_rpt_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("bkf_typ", "bkf_typ"),
				MCItemDef.create("par_inst_qty", "par_inst_qty"),
				MCItemDef.create("chd_inpt_qty", "chd_inpt_qty"),
				MCItemDef.create("chd_rqmt_qty", "chd_rqmt_qty"),
				MCItemDef.create("fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty"),
				MCItemDef.create("main_itm_flg", "main_itm_flg"),
				MCItemDef.create("bom_id_no", "bom_id_no"),
				MCItemDef.create("chd_itm_seq", "chd_itm_seq"),
				MCItemDef.create("bom_memo1", "bom_memo1"),
				MCItemDef.create("bom_memo2", "bom_memo2"),
				MCItemDef.create("bom_memo3", "bom_memo3"),
				MCItemDef.create("yield_calc_flg", "yield_calc_flg"),
				MCItemDef.create("alloc_ctl_typ", "alloc_ctl_typ"),
				MCItemDef.create("inpt_ctl_typ", "inpt_ctl_typ"),
				MCItemDef.create("in_offst_typ", "in_offst_typ"),
				MCItemDef.create("in_offst", "in_offst"),
				MCItemDef.create("lot_mix_flg", "lot_mix_flg"),
				MCItemDef.create("sublot_mix_flg", "sublot_mix_flg"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("alt_itm_typ", "alt_itm_typ"),
				MCItemDef.create("alt_alloc_prio", "alt_alloc_prio"),
				MCItemDef.create("alt_itm_ratio", "alt_itm_ratio"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("inpt_schd_no", "inpt_schd_no"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("old_mfg_sts_typ", "old_mfg_sts_typ"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("disp_seq_upd_flg", "disp_seq_upd_flg"),
				MCItemDef.create("xfr_inst_err_flg", "xfr_inst_err_flg"),
				MCItemDef.create("inst_abort_flg", "inst_abort_flg"),
				MCItemDef.create("old_inst_abort_flg", "old_inst_abort_flg"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("not_frst_inst_can_flg", "not_frst_inst_can_flg")
			}
			,
			MCBlockDef.create("MfgInstReg_Chk01_DtlInpt")
		);
	}
	public static MCContainerDef MS_MSBCL6000_MfgInstReg_Chk01_DOWN_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBCL6000", "MfgInstReg_Chk01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("wk_cost", "wk_cost"),
				MCItemDef.create("fxd_wk_cost", "fxd_wk_cost"),
				MCItemDef.create("mst_wk_cost", "mst_wk_cost"),
				MCItemDef.create("mst_fxd_wk_cost", "mst_fxd_wk_cost"),
				MCItemDef.create("wk_cost_calc_flg", "wk_cost_calc_flg"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("wk_schd_no", "wk_schd_no"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("disp_seq_upd_flg", "disp_seq_upd_flg"),
				MCItemDef.create("inst_abort_flg", "inst_abort_flg"),
				MCItemDef.create("old_inst_abort_flg", "old_inst_abort_flg"),
				MCItemDef.create("not_frst_inst_can_flg", "not_frst_inst_can_flg")
			}
			,
			MCBlockDef.create("MfgInstReg_Chk01_DtlWk")
		);
	}
	public static MCContainerDef MS_MSBCL6000_MfgInstReg_Chk01_DOWN_BLOCK4() {

		return new MCGeneralContainerDef("MS", "MSBCL6000", "MfgInstReg_Chk01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_yield_qty", "trd_unit_yield_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_yield_qty", "base_unit_yield_qty"),
				MCItemDef.create("schd_tm", "schd_tm"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("inst_rpt_rmrks", "inst_rpt_rmrks"),
				MCItemDef.create("insp_cnt_rmrks", "insp_cnt_rmrks"),
				MCItemDef.create("stk_lst_prnt_flg", "stk_lst_prnt_flg"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("old_mfg_sts_typ", "old_mfg_sts_typ"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("disp_seq_upd_flg", "disp_seq_upd_flg"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_aprv_sts_typ", "mfg_aprv_sts_typ"),
				MCItemDef.create("inst_abort_flg", "inst_abort_flg"),
				MCItemDef.create("old_inst_abort_flg", "old_inst_abort_flg"),
				MCItemDef.create("not_frst_inst_can_flg", "not_frst_inst_can_flg")
			}
			,
			MCBlockDef.create("MfgInstReg_Chk01_DtlYield")
		);
	}
	public static MCContainerDef MS_MSBCL6000_MfgInstReg_Chk01_DOWN_BLOCK5() {

		return new MCGeneralContainerDef("MS", "MSBCL6000", "MfgInstReg_Chk01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("lot_no_typ", "lot_no_typ"),
				MCItemDef.create("lot_no_ptn_cd", "lot_no_ptn_cd"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("sublot_no_typ", "sublot_no_typ"),
				MCItemDef.create("sublot_no_ptn_cd", "sublot_no_ptn_cd"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_yield_qty", "trd_unit_yield_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_yield_qty", "base_unit_yield_qty"),
				MCItemDef.create("schd_tm", "schd_tm"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("bkf_typ", "bkf_typ"),
				MCItemDef.create("par_inst_qty", "par_inst_qty"),
				MCItemDef.create("chd_inpt_qty", "chd_inpt_qty"),
				MCItemDef.create("chd_rqmt_qty", "chd_rqmt_qty"),
				MCItemDef.create("fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("inst_rpt_rmrks", "inst_rpt_rmrks"),
				MCItemDef.create("stk_lst_prnt_flg", "stk_lst_prnt_flg"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("old_mfg_sts_typ", "old_mfg_sts_typ"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("disp_seq_upd_flg", "disp_seq_upd_flg"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("old_itm_cd", "old_itm_cd"),
				MCItemDef.create("old_itm_sub1", "old_itm_sub1"),
				MCItemDef.create("old_itm_sub2", "old_itm_sub2"),
				MCItemDef.create("old_itm_sub3", "old_itm_sub3"),
				MCItemDef.create("old_lot_no", "old_lot_no"),
				MCItemDef.create("old_sublot_no", "old_sublot_no"),
				MCItemDef.create("inst_abort_flg", "inst_abort_flg"),
				MCItemDef.create("old_inst_abort_flg", "old_inst_abort_flg"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("not_frst_inst_can_flg", "not_frst_inst_can_flg")
			}
			,
			MCBlockDef.create("MfgInstReg_Chk01_DtlByProd")
		);
	}
	public static MCContainerDef MS_MSBCL6000_MfgInstReg_Chk01_DOWN_BLOCK6() {

		return new MCGeneralContainerDef("MS", "MSBCL6000", "MfgInstReg_Chk01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("mfg_inst_rev", "mfg_inst_rev"),
				MCItemDef.create("ref_ord", "ref_ord"),
				MCItemDef.create("re_ext_typ", "re_ext_typ"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("MfgInstReg_Chk01_DtlReExt")
		);
	}
	
	static final MCOperationInfo MS_MSBCL6000_MfgInstReg_Chk02_INFO = new MCOperationInfo("MS", "MSBCL6000", "MfgInstReg_Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6000_MfgInstReg_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6000", "MfgInstReg_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("itm_ord_upd_cntr", "itm_ord_upd_cntr"),
				MCItemDef.create("itm_mfg_inst_upd_cntr", "itm_mfg_inst_upd_cntr"),
				MCItemDef.create("mfg_inst_upd_cntr", "mfg_inst_upd_cntr"),
				MCItemDef.create("xfr_inst_del_enable_flg", "xfr_inst_del_enable_flg"),
				MCItemDef.create("lst_reg_flg", "lst_reg_flg"),
				MCItemDef.create("upd_cntr_chk_flg", "upd_cntr_chk_flg")
			}
			,
			MCBlockDef.create("MfgInstReg_Chk02_Hdr")
		);
	}

	public static MCContainerDef MS_MSBCL6000_MfgInstReg_Chk02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL6000", "MfgInstReg_Chk02",
			new MCItemDef[]{
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("mes_flg", "mes_flg")
			}
			,
			MCBlockDef.create("MfgInstReg_Chk02_DtlOper")
		);
	}


	public static MCContainerDef MS_MSBCL6000_MfgInstReg_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6000", "MfgInstReg_Chk02",
			new MCItemDef[]{
				MCItemDef.create("mfg_inst_data_crud_typ", "mfg_inst_data_crud_typ"),
				MCItemDef.create("itm_mfg_inst_data_crud_typ", "itm_mfg_inst_data_crud_typ"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("mfg_mtd_typ", "mfg_mtd_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("frst_mfg_inst_no", "frst_mfg_inst_no"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("mfg_inst_unit_typ", "mfg_inst_unit_typ"),
				MCItemDef.create("unschd_inst_flg", "unschd_inst_flg"),
				MCItemDef.create("base_unit_not_inst_qty", "base_unit_not_inst_qty"),
				MCItemDef.create("mfg_loc_wg_cd", "mfg_loc_wg_cd"),
				MCItemDef.create("mfg_loc_site_cd", "mfg_loc_site_cd"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("po_schd_src_typ", "po_schd_src_typ"),
				MCItemDef.create("po_schd_src_no", "po_schd_src_no"),
				MCItemDef.create("po_schd_data_crud_typ", "po_schd_data_crud_typ"),
				MCItemDef.create("old_lot_no", "old_lot_no"),
				MCItemDef.create("old_sublot_no", "old_sublot_no"),
				MCItemDef.create("old_mfg_sts_typ", "old_mfg_sts_typ"),
				MCItemDef.create("old_mfg_aprv_sts_typ", "old_mfg_aprv_sts_typ"),
				MCItemDef.create("old_aprv_flg", "old_aprv_flg"),
				MCItemDef.create("old_mfg_aprv_role_cd", "old_mfg_aprv_role_cd"),
				MCItemDef.create("old_inst_dt", "old_inst_dt"),
				MCItemDef.create("old_bom_ptn", "old_bom_ptn"),
				MCItemDef.create("itm_ord_upd_cntr", "itm_ord_upd_cntr"),
				MCItemDef.create("itm_mfg_inst_upd_cntr", "itm_mfg_inst_upd_cntr"),
				MCItemDef.create("mfg_inst_upd_cntr", "mfg_inst_upd_cntr"),
				MCItemDef.create("xfr_inst_del_enable_flg", "xfr_inst_del_enable_flg"),
				MCItemDef.create("lst_reg_flg", "lst_reg_flg"),
				MCItemDef.create("not_frst_inst_can_flg", "not_frst_inst_can_flg")
			}
			,
			MCBlockDef.create("MfgInstReg_Chk02_Hdr")
		);
	}
	public static MCContainerDef MS_MSBCL6000_MfgInstReg_Chk02_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL6000", "MfgInstReg_Chk02",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("oper_ord_no", "oper_ord_no"),
				MCItemDef.create("not_oper_schd_qty", "not_oper_schd_qty"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("unschd_inst_flg", "unschd_inst_flg"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("not_frst_inst_can_flg", "not_frst_inst_can_flg"),
				MCItemDef.create("mes_flg", "mes_flg")
			}
			,
			MCBlockDef.create("MfgInstReg_Chk02_DtlOper")
		);
	}
	public static MCContainerDef MS_MSBCL6000_MfgInstReg_Chk02_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBCL6000", "MfgInstReg_Chk02",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("old_ver_no", "old_ver_no"),
				MCItemDef.create("inpt_ctl_typ", "inpt_ctl_typ"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("inpt_schd_no", "inpt_schd_no"),
				MCItemDef.create("old_mfg_sts_typ", "old_mfg_sts_typ"),
				MCItemDef.create("xfr_inst_err_flg", "xfr_inst_err_flg"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("not_frst_inst_can_flg", "not_frst_inst_can_flg")
			}
			,
			MCBlockDef.create("MfgInstReg_Chk02_DtlInpt")
		);
	}
	public static MCContainerDef MS_MSBCL6000_MfgInstReg_Chk02_DOWN_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBCL6000", "MfgInstReg_Chk02",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("wk_schd_no", "wk_schd_no"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("not_frst_inst_can_flg", "not_frst_inst_can_flg")
			}
			,
			MCBlockDef.create("MfgInstReg_Chk02_DtlWk")
		);
	}
	public static MCContainerDef MS_MSBCL6000_MfgInstReg_Chk02_DOWN_BLOCK4() {

		return new MCGeneralContainerDef("MS", "MSBCL6000", "MfgInstReg_Chk02",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("old_mfg_sts_typ", "old_mfg_sts_typ"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("not_frst_inst_can_flg", "not_frst_inst_can_flg"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("schd_tm", "schd_tm"),
				MCItemDef.create("base_unit_yield_qty", "base_unit_yield_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("trd_unit_yield_qty", "trd_unit_yield_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("insp_cnt_rmrks", "insp_cnt_rmrks")
			}
			,
			MCBlockDef.create("MfgInstReg_Chk02_DtlYield")
		);
	}
	public static MCContainerDef MS_MSBCL6000_MfgInstReg_Chk02_DOWN_BLOCK5() {

		return new MCGeneralContainerDef("MS", "MSBCL6000", "MfgInstReg_Chk02",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("old_mfg_sts_typ", "old_mfg_sts_typ"),
				MCItemDef.create("old_itm_cd", "old_itm_cd"),
				MCItemDef.create("old_itm_sub1", "old_itm_sub1"),
				MCItemDef.create("old_itm_sub2", "old_itm_sub2"),
				MCItemDef.create("old_itm_sub3", "old_itm_sub3"),
				MCItemDef.create("old_lot_no", "old_lot_no"),
				MCItemDef.create("old_sublot_no", "old_sublot_no"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("not_frst_inst_can_flg", "not_frst_inst_can_flg")
			}
			,
			MCBlockDef.create("MfgInstReg_Chk02_DtlByProd")
		);
	}
	public static MCContainerDef MS_MSBCL6000_MfgInstReg_Chk02_DOWN_BLOCK6() {

		return new MCGeneralContainerDef("MS", "MSBCL6000", "MfgInstReg_Chk02",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("ref_ord", "ref_ord")
			}
			,
			MCBlockDef.create("MfgInstReg_Chk02_DtlReExt")
		);
	}
	
	static final MCOperationInfo MS_MSBCL6000_MfgInstReg_Chk03_INFO = new MCOperationInfo("MS", "MSBCL6000", "MfgInstReg_Chk03", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6000_MfgInstReg_Chk03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6000", "MfgInstReg_Chk03",
			new MCItemDef[]{
				MCItemDef.create("oper_unit_flg", "oper_unit_flg"),
				MCItemDef.create("is_src_batch_flg", "is_src_batch_flg"),
				MCItemDef.create("upd_cntr_chk_flg", "upd_cntr_chk_flg")
			}
			,
			MCBlockDef.create("MfgInstReg_Chk03_Ctrl")
		);
	}

	public static MCContainerDef MS_MSBCL6000_MfgInstReg_Chk03_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL6000", "MfgInstReg_Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("base_unit_inst_qty", "base_unit_inst_qty"),
				MCItemDef.create("base_unit_yield_qty", "base_unit_yield_qty"),
				MCItemDef.create("oper_base_unit_qty", "oper_base_unit_qty"),
				MCItemDef.create("st_schd_tm", "st_schd_tm"),
				MCItemDef.create("end_schd_tm", "end_schd_tm"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("oper_loc_cd", "oper_loc_cd"),
				MCItemDef.create("oper_inst_grp", "oper_inst_grp"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("itm_ord_upd_cntr", "itm_ord_upd_cntr"),
				MCItemDef.create("itm_mfg_inst_upd_cntr", "itm_mfg_inst_upd_cntr"),
				MCItemDef.create("mfg_inst_upd_cntr", "mfg_inst_upd_cntr")
			}
			,
			MCBlockDef.create("MfgInstReg_Chk03_Hdr1")
		);
	}

	public static MCContainerDef MS_MSBCL6000_MfgInstReg_Chk03_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBCL6000", "MfgInstReg_Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("base_unit_inst_qty", "base_unit_inst_qty"),
				MCItemDef.create("base_unit_yield_qty", "base_unit_yield_qty"),
				MCItemDef.create("st_schd_tm", "st_schd_tm"),
				MCItemDef.create("end_schd_tm", "end_schd_tm"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("itm_ord_upd_cntr", "itm_ord_upd_cntr"),
				MCItemDef.create("itm_mfg_inst_upd_cntr", "itm_mfg_inst_upd_cntr"),
				MCItemDef.create("mfg_inst_upd_cntr", "mfg_inst_upd_cntr")
			}
			,
			MCBlockDef.create("MfgInstReg_Chk03_Hdr2")
		);
	}


	public static MCContainerDef MS_MSBCL6000_MfgInstReg_Chk03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6000", "MfgInstReg_Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("MfgInstReg_Chk03_Hdr1")
		);
	}
	public static MCContainerDef MS_MSBCL6000_MfgInstReg_Chk03_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL6000", "MfgInstReg_Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("MfgInstReg_Chk03_Hdr2")
		);
	}
	
	static final MCOperationInfo MS_MSBCL6000_MfgInstReg_Upd01_INFO = new MCOperationInfo("MS", "MSBCL6000", "MfgInstReg_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6000_MfgInstReg_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6000", "MfgInstReg_Upd01",
			new MCItemDef[]{
				MCItemDef.create("mfg_inst_data_crud_typ", "mfg_inst_data_crud_typ"),
				MCItemDef.create("itm_mfg_inst_data_crud_typ", "itm_mfg_inst_data_crud_typ"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("mfg_mtd_typ", "mfg_mtd_typ"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("master_dt", "master_dt"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("lot_no_typ", "lot_no_typ"),
				MCItemDef.create("lot_no_ptn_cd", "lot_no_ptn_cd"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("sublot_no_typ", "sublot_no_typ"),
				MCItemDef.create("sublot_no_ptn_cd", "sublot_no_ptn_cd"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("lot_issue_typ", "lot_issue_typ"),
				MCItemDef.create("base_unit_inst_qty", "base_unit_inst_qty"),
				MCItemDef.create("base_unit_yield_qty", "base_unit_yield_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("inst_dt", "inst_dt"),
				MCItemDef.create("inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("inst_dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("rqst_dlv_rqst_tm", "rqst_dlv_rqst_tm"),
				MCItemDef.create("st_schd_tm", "st_schd_tm"),
				MCItemDef.create("end_schd_tm", "end_schd_tm"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("mfg_str_ln_cd", "mfg_str_ln_cd"),
				MCItemDef.create("strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("po_locked_flg", "po_locked_flg"),
				MCItemDef.create("inst_abort_flg", "inst_abort_flg"),
				MCItemDef.create("inst_rpt_rmrks", "inst_rpt_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("inst_po_cnt_rmrks", "inst_po_cnt_rmrks"),
				MCItemDef.create("disp_pd", "disp_pd"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("mfg_inst_rev", "mfg_inst_rev"),
				MCItemDef.create("inst_prnt_tm", "inst_prnt_tm"),
				MCItemDef.create("inst_prnt_flg", "inst_prnt_flg"),
				MCItemDef.create("inst_immed_prnt_flg", "inst_immed_prnt_flg"),
				MCItemDef.create("chg_list_immed_prnt_flg", "chg_list_immed_prnt_flg"),
				MCItemDef.create("xfr_inst_del_enable_flg", "xfr_inst_del_enable_flg"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("frst_mfg_inst_no", "frst_mfg_inst_no"),
				MCItemDef.create("io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("mfg_inst_unit_typ", "mfg_inst_unit_typ"),
				MCItemDef.create("unschd_inst_flg", "unschd_inst_flg"),
				MCItemDef.create("unschd_act_flg", "unschd_act_flg"),
				MCItemDef.create("schd_chg_flg", "schd_chg_flg"),
				MCItemDef.create("base_unit_ord_qty", "base_unit_ord_qty"),
				MCItemDef.create("base_unit_not_inst_qty", "base_unit_not_inst_qty"),
				MCItemDef.create("ord_abort_flg", "ord_abort_flg"),
				MCItemDef.create("mfg_loc_wg_cd", "mfg_loc_wg_cd"),
				MCItemDef.create("mfg_loc_site_cd", "mfg_loc_site_cd"),
				MCItemDef.create("itm_lower_yield", "itm_lower_yield"),
				MCItemDef.create("itm_std_yield", "itm_std_yield"),
				MCItemDef.create("itm_upper_yield", "itm_upper_yield"),
				MCItemDef.create("inst_rec_issue_flg", "inst_rec_issue_flg"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("po_auto_reg_flg", "po_auto_reg_flg"),
				MCItemDef.create("po_schd_src_typ", "po_schd_src_typ"),
				MCItemDef.create("po_schd_src_no", "po_schd_src_no"),
				MCItemDef.create("po_schd_data_crud_typ", "po_schd_data_crud_typ"),
				MCItemDef.create("itm_mfg_inst_sub_char1", "itm_mfg_inst_sub_char1"),
				MCItemDef.create("itm_mfg_inst_sub_char2", "itm_mfg_inst_sub_char2"),
				MCItemDef.create("itm_mfg_inst_sub_char3", "itm_mfg_inst_sub_char3"),
				MCItemDef.create("mfg_inst_sub_char1", "mfg_inst_sub_char1"),
				MCItemDef.create("mfg_inst_sub_char2", "mfg_inst_sub_char2"),
				MCItemDef.create("mfg_inst_sub_char3", "mfg_inst_sub_char3"),
				MCItemDef.create("no_mfg_aprv_flg", "no_mfg_aprv_flg"),
				MCItemDef.create("old_mfg_sts_typ", "old_mfg_sts_typ"),
				MCItemDef.create("old_mfg_aprv_sts_typ", "old_mfg_aprv_sts_typ"),
				MCItemDef.create("old_aprv_flg", "old_aprv_flg"),
				MCItemDef.create("old_mfg_aprv_role_cd", "old_mfg_aprv_role_cd"),
				MCItemDef.create("old_inst_dt", "old_inst_dt"),
				MCItemDef.create("old_lot_no", "old_lot_no"),
				MCItemDef.create("old_sublot_no", "old_sublot_no"),
				MCItemDef.create("old_bom_ptn", "old_bom_ptn"),
				MCItemDef.create("old_inst_abort_flg", "old_inst_abort_flg"),
				MCItemDef.create("is_src_outsrc_srv_flg", "is_src_outsrc_srv_flg"),
				MCItemDef.create("lst_reg_flg", "lst_reg_flg"),
				MCItemDef.create("not_frst_inst_can_flg", "not_frst_inst_can_flg"),
				MCItemDef.create("not_frst_inst_reg_oper_flg", "not_frst_inst_reg_oper_flg"),
				MCItemDef.create("re_alloc_mode_flg", "re_alloc_mode_flg"),
				MCItemDef.create("is_src_alloc_flg", "is_src_alloc_flg"),
				MCItemDef.create("old_mfg_inst_rev", "old_mfg_inst_rev"),
				MCItemDef.create("is_src_batch_flg", "is_src_batch_flg")
			}
			,
			MCBlockDef.create("MfgInstReg_Upd01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBCL6000_MfgInstReg_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL6000", "MfgInstReg_Upd01",
			new MCItemDef[]{
				MCItemDef.create("tgt_oper_flg", "tgt_oper_flg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("st_schd_tm", "st_schd_tm"),
				MCItemDef.create("end_schd_tm", "end_schd_tm"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("oper_std_qty", "oper_std_qty"),
				MCItemDef.create("oper_conv_qty", "oper_conv_qty"),
				MCItemDef.create("oper_unit_conv_rnd_typ", "oper_unit_conv_rnd_typ"),
				MCItemDef.create("oper_unit_dec_place", "oper_unit_dec_place"),
				MCItemDef.create("oper_unit_cd", "oper_unit_cd"),
				MCItemDef.create("oper_loc_cd", "oper_loc_cd"),
				MCItemDef.create("oper_str_ln_cd", "oper_str_ln_cd"),
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("oper_abort_flg", "oper_abort_flg"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("oper_rsrc", "oper_rsrc"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("inst_rpt_rmrks", "inst_rpt_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("bkf_flg", "bkf_flg"),
				MCItemDef.create("wk_cost_calc_flg", "wk_cost_calc_flg"),
				MCItemDef.create("oper_inst_grp", "oper_inst_grp"),
				MCItemDef.create("oper_lt", "oper_lt"),
				MCItemDef.create("oper_lt_add_qty", "oper_lt_add_qty"),
				MCItemDef.create("oper_offst_typ", "oper_offst_typ"),
				MCItemDef.create("oper_offst", "oper_offst"),
				MCItemDef.create("oper_offst_add_qty", "oper_offst_add_qty"),
				MCItemDef.create("lmt_fr_dt_flg", "lmt_fr_dt_flg"),
				MCItemDef.create("oper_lower_yield", "oper_lower_yield"),
				MCItemDef.create("oper_std_yield", "oper_std_yield"),
				MCItemDef.create("oper_upper_yield", "oper_upper_yield"),
				MCItemDef.create("wip_rate", "wip_rate"),
				MCItemDef.create("oper_ord_no", "oper_ord_no"),
				MCItemDef.create("not_oper_schd_qty", "not_oper_schd_qty"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("unschd_inst_flg", "unschd_inst_flg"),
				MCItemDef.create("unschd_act_flg", "unschd_act_flg"),
				MCItemDef.create("hdr_mfg_sts_typ", "hdr_mfg_sts_typ"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("yield_oper_flg", "yield_oper_flg"),
				MCItemDef.create("yield_oper_ratio", "yield_oper_ratio"),
				MCItemDef.create("inst_abort_flg", "inst_abort_flg"),
				MCItemDef.create("old_inst_abort_flg", "old_inst_abort_flg"),
				MCItemDef.create("not_frst_inst_can_flg", "not_frst_inst_can_flg"),
				MCItemDef.create("mes_flg", "mes_flg")
			}
			,
			MCBlockDef.create("MfgInstReg_Upd01_DtlOper")
		);
	}

	public static MCContainerDef MS_MSBCL6000_MfgInstReg_Upd01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBCL6000", "MfgInstReg_Upd01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("alt_grp_cd", "alt_grp_cd"),
				MCItemDef.create("alt_grp_seq", "alt_grp_seq"),
				MCItemDef.create("alt_itm_fix_flg", "alt_itm_fix_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("old_ver_no", "old_ver_no"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("base_unit_alt_qty", "base_unit_alt_qty"),
				MCItemDef.create("base_unit_inpt_qty", "base_unit_inpt_qty"),
				MCItemDef.create("base_unit_rqmt_qty", "base_unit_rqmt_qty"),
				MCItemDef.create("base_unit_fxd_rqmt_qty", "base_unit_fxd_rqmt_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("cont_inpt_qty", "cont_inpt_qty"),
				MCItemDef.create("cont_rqmt_qty", "cont_rqmt_qty"),
				MCItemDef.create("cont_fxd_rqmt_qty", "cont_fxd_rqmt_qty"),
				MCItemDef.create("cont_fctr_unit_cd", "cont_fctr_unit_cd"),
				MCItemDef.create("std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("schd_tm", "schd_tm"),
				MCItemDef.create("alloc_flg", "alloc_flg"),
				MCItemDef.create("no_lot_fix_flg", "no_lot_fix_flg"),
				MCItemDef.create("inst_lot_fix_flg", "inst_lot_fix_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("vld_dt", "vld_dt"),
				MCItemDef.create("first_gr_dt", "first_gr_dt"),
				MCItemDef.create("lot_seq", "lot_seq"),
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
				MCItemDef.create("inpt_loc_cd", "inpt_loc_cd"),
				MCItemDef.create("inpt_str_ln_cd", "inpt_str_ln_cd"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("inpt_rsn_cd", "inpt_rsn_cd"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("inst_rpt_rmrks", "inst_rpt_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("bkf_typ", "bkf_typ"),
				MCItemDef.create("par_inst_qty", "par_inst_qty"),
				MCItemDef.create("chd_inpt_qty", "chd_inpt_qty"),
				MCItemDef.create("chd_rqmt_qty", "chd_rqmt_qty"),
				MCItemDef.create("fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty"),
				MCItemDef.create("main_itm_flg", "main_itm_flg"),
				MCItemDef.create("bom_id_no", "bom_id_no"),
				MCItemDef.create("chd_itm_seq", "chd_itm_seq"),
				MCItemDef.create("bom_memo1", "bom_memo1"),
				MCItemDef.create("bom_memo2", "bom_memo2"),
				MCItemDef.create("bom_memo3", "bom_memo3"),
				MCItemDef.create("yield_calc_flg", "yield_calc_flg"),
				MCItemDef.create("alloc_ctl_typ", "alloc_ctl_typ"),
				MCItemDef.create("inpt_ctl_typ", "inpt_ctl_typ"),
				MCItemDef.create("in_offst_typ", "in_offst_typ"),
				MCItemDef.create("in_offst", "in_offst"),
				MCItemDef.create("lot_mix_flg", "lot_mix_flg"),
				MCItemDef.create("sublot_mix_flg", "sublot_mix_flg"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("alt_itm_typ", "alt_itm_typ"),
				MCItemDef.create("alt_alloc_prio", "alt_alloc_prio"),
				MCItemDef.create("alt_itm_ratio", "alt_itm_ratio"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("inpt_schd_no", "inpt_schd_no"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("old_mfg_sts_typ", "old_mfg_sts_typ"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("disp_seq_upd_flg", "disp_seq_upd_flg"),
				MCItemDef.create("xfr_inst_err_flg", "xfr_inst_err_flg"),
				MCItemDef.create("inst_abort_flg", "inst_abort_flg"),
				MCItemDef.create("old_inst_abort_flg", "old_inst_abort_flg"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("inst_dt", "inst_dt"),
				MCItemDef.create("inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("inst_dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("not_frst_inst_can_flg", "not_frst_inst_can_flg")
			}
			,
			MCBlockDef.create("MfgInstReg_Upd01_DtlInpt")
		);
	}

	public static MCContainerDef MS_MSBCL6000_MfgInstReg_Upd01_UP_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBCL6000", "MfgInstReg_Upd01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("wk_cost", "wk_cost"),
				MCItemDef.create("fxd_wk_cost", "fxd_wk_cost"),
				MCItemDef.create("mst_wk_cost", "mst_wk_cost"),
				MCItemDef.create("mst_fxd_wk_cost", "mst_fxd_wk_cost"),
				MCItemDef.create("wk_cost_calc_flg", "wk_cost_calc_flg"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("wk_schd_no", "wk_schd_no"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("disp_seq_upd_flg", "disp_seq_upd_flg"),
				MCItemDef.create("inst_abort_flg", "inst_abort_flg"),
				MCItemDef.create("old_inst_abort_flg", "old_inst_abort_flg"),
				MCItemDef.create("not_frst_inst_can_flg", "not_frst_inst_can_flg")
			}
			,
			MCBlockDef.create("MfgInstReg_Upd01_DtlWk")
		);
	}

	public static MCContainerDef MS_MSBCL6000_MfgInstReg_Upd01_UP_BLOCK4() {

		return new MCGeneralContainerDef("MS", "MSBCL6000", "MfgInstReg_Upd01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_yield_qty", "trd_unit_yield_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_yield_qty", "base_unit_yield_qty"),
				MCItemDef.create("schd_tm", "schd_tm"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("inst_rpt_rmrks", "inst_rpt_rmrks"),
				MCItemDef.create("insp_cnt_rmrks", "insp_cnt_rmrks"),
				MCItemDef.create("stk_lst_prnt_flg", "stk_lst_prnt_flg"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("old_mfg_sts_typ", "old_mfg_sts_typ"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("disp_seq_upd_flg", "disp_seq_upd_flg"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("mfg_loc_site_cd", "mfg_loc_site_cd"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_aprv_sts_typ", "mfg_aprv_sts_typ"),
				MCItemDef.create("inst_abort_flg", "inst_abort_flg"),
				MCItemDef.create("old_inst_abort_flg", "old_inst_abort_flg"),
				MCItemDef.create("not_frst_inst_can_flg", "not_frst_inst_can_flg")
			}
			,
			MCBlockDef.create("MfgInstReg_Upd01_DtlYield")
		);
	}

	public static MCContainerDef MS_MSBCL6000_MfgInstReg_Upd01_UP_BLOCK5() {

		return new MCGeneralContainerDef("MS", "MSBCL6000", "MfgInstReg_Upd01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("lot_no_typ", "lot_no_typ"),
				MCItemDef.create("lot_no_ptn_cd", "lot_no_ptn_cd"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("sublot_no_typ", "sublot_no_typ"),
				MCItemDef.create("sublot_no_ptn_cd", "sublot_no_ptn_cd"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_yield_qty", "trd_unit_yield_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_yield_qty", "base_unit_yield_qty"),
				MCItemDef.create("schd_tm", "schd_tm"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("bkf_typ", "bkf_typ"),
				MCItemDef.create("par_inst_qty", "par_inst_qty"),
				MCItemDef.create("chd_inpt_qty", "chd_inpt_qty"),
				MCItemDef.create("chd_rqmt_qty", "chd_rqmt_qty"),
				MCItemDef.create("fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("inst_rpt_rmrks", "inst_rpt_rmrks"),
				MCItemDef.create("stk_lst_prnt_flg", "stk_lst_prnt_flg"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("old_mfg_sts_typ", "old_mfg_sts_typ"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("disp_seq_upd_flg", "disp_seq_upd_flg"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("old_itm_cd", "old_itm_cd"),
				MCItemDef.create("old_itm_sub1", "old_itm_sub1"),
				MCItemDef.create("old_itm_sub2", "old_itm_sub2"),
				MCItemDef.create("old_itm_sub3", "old_itm_sub3"),
				MCItemDef.create("old_lot_no", "old_lot_no"),
				MCItemDef.create("old_sublot_no", "old_sublot_no"),
				MCItemDef.create("inst_abort_flg", "inst_abort_flg"),
				MCItemDef.create("old_inst_abort_flg", "old_inst_abort_flg"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("not_frst_inst_can_flg", "not_frst_inst_can_flg")
			}
			,
			MCBlockDef.create("MfgInstReg_Upd01_DtlByProd")
		);
	}

	public static MCContainerDef MS_MSBCL6000_MfgInstReg_Upd01_UP_BLOCK6() {

		return new MCGeneralContainerDef("MS", "MSBCL6000", "MfgInstReg_Upd01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("mfg_inst_rev", "mfg_inst_rev"),
				MCItemDef.create("ref_ord", "ref_ord"),
				MCItemDef.create("re_ext_typ", "re_ext_typ"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("MfgInstReg_Upd01_DtlReExt")
		);
	}


	public static MCContainerDef MS_MSBCL6000_MfgInstReg_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6000", "MfgInstReg_Upd01",
			new MCItemDef[]{
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("mfg_sts_typ_nm", "mfg_sts_typ_nm"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("mfg_inst_rev", "mfg_inst_rev"),
				MCItemDef.create("inst_prnt_tm", "inst_prnt_tm"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("alloc_tgt_cnt", "alloc_tgt_cnt"),
				MCItemDef.create("alloc_success_cnt", "alloc_success_cnt"),
				MCItemDef.create("alloc_failure_cnt", "alloc_failure_cnt"),
				MCItemDef.create("lot_inh_err_flg", "lot_inh_err_flg")
			}
			,
			MCBlockDef.create("MfgInstReg_Upd01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBCL6000_MfgInstReg_Upd01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL6000", "MfgInstReg_Upd01",
			new MCItemDef[]{
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("alloc_tgt_cnt", "alloc_tgt_cnt"),
				MCItemDef.create("alloc_success_cnt", "alloc_success_cnt"),
				MCItemDef.create("alloc_failure_cnt", "alloc_failure_cnt"),
				MCItemDef.create("lot_inh_err_flg", "lot_inh_err_flg")
			}
			,
			MCBlockDef.create("MfgInstReg_Upd01_DtlOper")
		);
	}
	public static MCContainerDef MS_MSBCL6000_MfgInstReg_Upd01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBCL6000", "MfgInstReg_Upd01",
			new MCItemDef[]{
				MCItemDef.create("inpt_loc_cd", "inpt_loc_cd"),
				MCItemDef.create("inpt_str_ln_cd", "inpt_str_ln_cd"),
				MCItemDef.create("inpt_schd_no", "inpt_schd_no"),
				MCItemDef.create("disp_seq", "disp_seq")
			}
			,
			MCBlockDef.create("MfgInstReg_Upd01_DtlInpt")
		);
	}
	public static MCContainerDef MS_MSBCL6000_MfgInstReg_Upd01_DOWN_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBCL6000", "MfgInstReg_Upd01",
			new MCItemDef[]{
				MCItemDef.create("wk_schd_no", "wk_schd_no"),
				MCItemDef.create("disp_seq", "disp_seq")
			}
			,
			MCBlockDef.create("MfgInstReg_Upd01_DtlWk")
		);
	}
	public static MCContainerDef MS_MSBCL6000_MfgInstReg_Upd01_DOWN_BLOCK4() {

		return new MCGeneralContainerDef("MS", "MSBCL6000", "MfgInstReg_Upd01",
			new MCItemDef[]{
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("disp_seq", "disp_seq")
			}
			,
			MCBlockDef.create("MfgInstReg_Upd01_DtlYield")
		);
	}
	public static MCContainerDef MS_MSBCL6000_MfgInstReg_Upd01_DOWN_BLOCK5() {

		return new MCGeneralContainerDef("MS", "MSBCL6000", "MfgInstReg_Upd01",
			new MCItemDef[]{
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("disp_seq", "disp_seq")
			}
			,
			MCBlockDef.create("MfgInstReg_Upd01_DtlByProd")
		);
	}
	
	static final MCOperationInfo MS_MSBCL6000_MfgInstReg_Upd02_INFO = new MCOperationInfo("MS", "MSBCL6000", "MfgInstReg_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6000_MfgInstReg_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6000", "MfgInstReg_Upd02",
			new MCItemDef[]{
				MCItemDef.create("oper_unit_flg", "oper_unit_flg"),
				MCItemDef.create("re_alloc_mode_flg", "re_alloc_mode_flg"),
				MCItemDef.create("is_src_alloc_flg", "is_src_alloc_flg"),
				MCItemDef.create("is_src_batch_flg", "is_src_batch_flg"),
				MCItemDef.create("upd_cntr_chk_flg", "upd_cntr_chk_flg")
			}
			,
			MCBlockDef.create("MfgInstReg_Upd02_Ctrl")
		);
	}

	public static MCContainerDef MS_MSBCL6000_MfgInstReg_Upd02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL6000", "MfgInstReg_Upd02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_str_ln_cd", "mfg_str_ln_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("base_unit_inst_qty", "base_unit_inst_qty"),
				MCItemDef.create("base_unit_yield_qty", "base_unit_yield_qty"),
				MCItemDef.create("oper_base_unit_qty", "oper_base_unit_qty"),
				MCItemDef.create("rqst_dlv_rqst_tm", "rqst_dlv_rqst_tm"),
				MCItemDef.create("st_schd_tm", "st_schd_tm"),
				MCItemDef.create("end_schd_tm", "end_schd_tm"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("oper_loc_cd", "oper_loc_cd"),
				MCItemDef.create("oper_str_ln_cd", "oper_str_ln_cd"),
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("oper_rsrc", "oper_rsrc"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("inst_dt", "inst_dt"),
				MCItemDef.create("inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("inst_dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("po_locked_flg", "po_locked_flg"),
				MCItemDef.create("ord_abort_flg", "ord_abort_flg"),
				MCItemDef.create("inst_rpt_rmrks", "inst_rpt_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("oper_inst_rpt_rmrks", "oper_inst_rpt_rmrks"),
				MCItemDef.create("oper_intr_rmrks", "oper_intr_rmrks"),
				MCItemDef.create("disp_pd", "disp_pd"),
				MCItemDef.create("bkf_flg", "bkf_flg"),
				MCItemDef.create("wk_cost_calc_flg", "wk_cost_calc_flg"),
				MCItemDef.create("mes_flg", "mes_flg"),
				MCItemDef.create("oper_inst_grp", "oper_inst_grp"),
				MCItemDef.create("itm_mfg_inst_sub_char1", "itm_mfg_inst_sub_char1"),
				MCItemDef.create("itm_mfg_inst_sub_char2", "itm_mfg_inst_sub_char2"),
				MCItemDef.create("itm_mfg_inst_sub_char3", "itm_mfg_inst_sub_char3"),
				MCItemDef.create("mfg_inst_sub_char1", "mfg_inst_sub_char1"),
				MCItemDef.create("mfg_inst_sub_char2", "mfg_inst_sub_char2"),
				MCItemDef.create("mfg_inst_sub_char3", "mfg_inst_sub_char3"),
				MCItemDef.create("oper_inst_sub_char1", "oper_inst_sub_char1"),
				MCItemDef.create("oper_inst_sub_char2", "oper_inst_sub_char2"),
				MCItemDef.create("oper_inst_sub_char3", "oper_inst_sub_char3"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("oper_ord_no", "oper_ord_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("inst_immed_prnt_flg", "inst_immed_prnt_flg"),
				MCItemDef.create("itm_ord_upd_cntr", "itm_ord_upd_cntr"),
				MCItemDef.create("itm_mfg_inst_upd_cntr", "itm_mfg_inst_upd_cntr"),
				MCItemDef.create("mfg_inst_upd_cntr", "mfg_inst_upd_cntr")
			}
			,
			MCBlockDef.create("MfgInstReg_Upd02_Hdr1")
		);
	}

	public static MCContainerDef MS_MSBCL6000_MfgInstReg_Upd02_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBCL6000", "MfgInstReg_Upd02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_str_ln_cd", "mfg_str_ln_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("base_unit_inst_qty", "base_unit_inst_qty"),
				MCItemDef.create("base_unit_yield_qty", "base_unit_yield_qty"),
				MCItemDef.create("rqst_dlv_rqst_tm", "rqst_dlv_rqst_tm"),
				MCItemDef.create("st_schd_tm", "st_schd_tm"),
				MCItemDef.create("end_schd_tm", "end_schd_tm"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("inst_dt", "inst_dt"),
				MCItemDef.create("inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("inst_dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("po_locked_flg", "po_locked_flg"),
				MCItemDef.create("ord_abort_flg", "ord_abort_flg"),
				MCItemDef.create("inst_rpt_rmrks", "inst_rpt_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("disp_pd", "disp_pd"),
				MCItemDef.create("itm_mfg_inst_sub_char1", "itm_mfg_inst_sub_char1"),
				MCItemDef.create("itm_mfg_inst_sub_char2", "itm_mfg_inst_sub_char2"),
				MCItemDef.create("itm_mfg_inst_sub_char3", "itm_mfg_inst_sub_char3"),
				MCItemDef.create("mfg_inst_sub_char1", "mfg_inst_sub_char1"),
				MCItemDef.create("mfg_inst_sub_char2", "mfg_inst_sub_char2"),
				MCItemDef.create("mfg_inst_sub_char3", "mfg_inst_sub_char3"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("inst_immed_prnt_flg", "inst_immed_prnt_flg"),
				MCItemDef.create("itm_ord_upd_cntr", "itm_ord_upd_cntr"),
				MCItemDef.create("itm_mfg_inst_upd_cntr", "itm_mfg_inst_upd_cntr"),
				MCItemDef.create("mfg_inst_upd_cntr", "mfg_inst_upd_cntr"),
				MCItemDef.create("batch_data_no", "batch_data_no"),
				MCItemDef.create("batch_log_no", "batch_log_no"),
				MCItemDef.create("log_sub_key1", "log_sub_key1"),
				MCItemDef.create("log_sub_key2", "log_sub_key2")
			}
			,
			MCBlockDef.create("MfgInstReg_Upd02_Hdr2")
		);
	}


	public static MCContainerDef MS_MSBCL6000_MfgInstReg_Upd02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6000", "MfgInstReg_Upd02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("mfg_sts_typ_nm", "mfg_sts_typ_nm"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("mfg_inst_rev", "mfg_inst_rev"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("alloc_tgt_cnt", "alloc_tgt_cnt"),
				MCItemDef.create("alloc_success_cnt", "alloc_success_cnt"),
				MCItemDef.create("alloc_failure_cnt", "alloc_failure_cnt"),
				MCItemDef.create("lot_inh_err_flg", "lot_inh_err_flg")
			}
			,
			MCBlockDef.create("MfgInstReg_Upd02_Hdr1")
		);
	}
	public static MCContainerDef MS_MSBCL6000_MfgInstReg_Upd02_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL6000", "MfgInstReg_Upd02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("mfg_sts_typ_nm", "mfg_sts_typ_nm"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("mfg_inst_rev", "mfg_inst_rev"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("batch_data_no", "batch_data_no"),
				MCItemDef.create("batch_log_no", "batch_log_no"),
				MCItemDef.create("log_sub_key1", "log_sub_key1"),
				MCItemDef.create("log_sub_key2", "log_sub_key2"),
				MCItemDef.create("alloc_tgt_cnt", "alloc_tgt_cnt"),
				MCItemDef.create("alloc_success_cnt", "alloc_success_cnt"),
				MCItemDef.create("alloc_failure_cnt", "alloc_failure_cnt"),
				MCItemDef.create("lot_inh_err_flg", "lot_inh_err_flg")
			}
			,
			MCBlockDef.create("MfgInstReg_Upd02_Hdr2")
		);
	}
	
	static final MCOperationInfo MS_MSBCL6000_MfgInstReg_Del01_INFO = new MCOperationInfo("MS", "MSBCL6000", "MfgInstReg_Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6000_MfgInstReg_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6000", "MfgInstReg_Del01",
			new MCItemDef[]{
				MCItemDef.create("lst_del_flg", "lst_del_flg"),
				MCItemDef.create("not_commit_flg", "not_commit_flg"),
				MCItemDef.create("not_chk_cntr_flg", "not_chk_cntr_flg")
			}
			,
			MCBlockDef.create("MfgInstReg_Del01_Ctrl")
		);
	}

	public static MCContainerDef MS_MSBCL6000_MfgInstReg_Del01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL6000", "MfgInstReg_Del01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("itm_ord_upd_cntr", "itm_ord_upd_cntr"),
				MCItemDef.create("itm_mfg_inst_upd_cntr", "itm_mfg_inst_upd_cntr"),
				MCItemDef.create("mfg_inst_upd_cntr", "mfg_inst_upd_cntr"),
				MCItemDef.create("xfr_inst_del_enable_flg", "xfr_inst_del_enable_flg")
			}
			,
			MCBlockDef.create("MfgInstReg_Del01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBCL6000_MfgInstReg_Del01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBCL6000", "MfgInstReg_Del01",
			new MCItemDef[]{
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("mes_flg", "mes_flg")
			}
			,
			MCBlockDef.create("MfgInstReg_Del01_DtlOper")
		);
	}


	public static MCContainerDef MS_MSBCL6000_MfgInstReg_Del01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6000", "MfgInstReg_Del01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("MfgInstReg_Del01_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBCL6000_MfgInstReg_RevUpd01_INFO = new MCOperationInfo("MS", "MSBCL6000", "MfgInstReg_RevUpd01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6000_MfgInstReg_RevUpd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6000", "MfgInstReg_RevUpd01",
			new MCItemDef[]{
				MCItemDef.create("rev_data_src_no", "rev_data_src_no"),
				MCItemDef.create("rev_no", "rev_no")
			}
			,
			MCBlockDef.create("MfgInstReg_RevUpd01_Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

