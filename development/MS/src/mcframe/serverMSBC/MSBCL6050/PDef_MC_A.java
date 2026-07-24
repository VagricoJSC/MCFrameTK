package mcframe.serverMSBC.MSBCL6050;

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
 * [MSBCL_MfgActRegService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBCL6050.MfgActReg_Chk01.UP.BLOCK0")){
			return MS_MSBCL6050_MfgActReg_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Chk01.UP.BLOCK1")){
			return MS_MSBCL6050_MfgActReg_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Chk01.UP.BLOCK2")){
			return MS_MSBCL6050_MfgActReg_Chk01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Chk01.UP.BLOCK3")){
			return MS_MSBCL6050_MfgActReg_Chk01_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Chk01.UP.BLOCK4")){
			return MS_MSBCL6050_MfgActReg_Chk01_UP_BLOCK4();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Chk01.UP.BLOCK5")){
			return MS_MSBCL6050_MfgActReg_Chk01_UP_BLOCK5();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Chk01.UP.BLOCK6")){
			return MS_MSBCL6050_MfgActReg_Chk01_UP_BLOCK6();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Chk01.DOWN.BLOCK0")){
			return MS_MSBCL6050_MfgActReg_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Chk01.DOWN.BLOCK1")){
			return MS_MSBCL6050_MfgActReg_Chk01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Chk01.DOWN.BLOCK2")){
			return MS_MSBCL6050_MfgActReg_Chk01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Chk01.DOWN.BLOCK3")){
			return MS_MSBCL6050_MfgActReg_Chk01_DOWN_BLOCK3();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Chk01.DOWN.BLOCK4")){
			return MS_MSBCL6050_MfgActReg_Chk01_DOWN_BLOCK4();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Chk01.DOWN.BLOCK5")){
			return MS_MSBCL6050_MfgActReg_Chk01_DOWN_BLOCK5();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Chk01.DOWN.BLOCK6")){
			return MS_MSBCL6050_MfgActReg_Chk01_DOWN_BLOCK6();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Chk02.UP.BLOCK0")){
			return MS_MSBCL6050_MfgActReg_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Chk02.UP.BLOCK1")){
			return MS_MSBCL6050_MfgActReg_Chk02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Chk02.UP.BLOCK2")){
			return MS_MSBCL6050_MfgActReg_Chk02_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Chk02.UP.BLOCK3")){
			return MS_MSBCL6050_MfgActReg_Chk02_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Chk02.UP.BLOCK4")){
			return MS_MSBCL6050_MfgActReg_Chk02_UP_BLOCK4();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Chk02.DOWN.BLOCK0")){
			return MS_MSBCL6050_MfgActReg_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Chk02.DOWN.BLOCK1")){
			return MS_MSBCL6050_MfgActReg_Chk02_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Chk02.DOWN.BLOCK2")){
			return MS_MSBCL6050_MfgActReg_Chk02_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Chk02.DOWN.BLOCK3")){
			return MS_MSBCL6050_MfgActReg_Chk02_DOWN_BLOCK3();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Chk02.DOWN.BLOCK4")){
			return MS_MSBCL6050_MfgActReg_Chk02_DOWN_BLOCK4();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Chk02.DOWN.BLOCK5")){
			return MS_MSBCL6050_MfgActReg_Chk02_DOWN_BLOCK5();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Chk02.DOWN.BLOCK6")){
			return MS_MSBCL6050_MfgActReg_Chk02_DOWN_BLOCK6();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Chk02.DOWN.BLOCK7")){
			return MS_MSBCL6050_MfgActReg_Chk02_DOWN_BLOCK7();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Chk03.UP.BLOCK0")){
			return MS_MSBCL6050_MfgActReg_Chk03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Chk03.UP.BLOCK1")){
			return MS_MSBCL6050_MfgActReg_Chk03_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Chk03.UP.BLOCK2")){
			return MS_MSBCL6050_MfgActReg_Chk03_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Chk03.UP.BLOCK3")){
			return MS_MSBCL6050_MfgActReg_Chk03_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Chk03.DOWN.BLOCK0")){
			return MS_MSBCL6050_MfgActReg_Chk03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Chk03.DOWN.BLOCK1")){
			return MS_MSBCL6050_MfgActReg_Chk03_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Chk04.UP.BLOCK0")){
			return MS_MSBCL6050_MfgActReg_Chk04_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Chk04.UP.BLOCK1")){
			return MS_MSBCL6050_MfgActReg_Chk04_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Chk04.DOWN.BLOCK0")){
			return MS_MSBCL6050_MfgActReg_Chk04_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Chk05.UP.BLOCK0")){
			return MS_MSBCL6050_MfgActReg_Chk05_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Chk05.UP.BLOCK1")){
			return MS_MSBCL6050_MfgActReg_Chk05_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Chk05.DOWN.BLOCK0")){
			return MS_MSBCL6050_MfgActReg_Chk05_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Upd01.UP.BLOCK0")){
			return MS_MSBCL6050_MfgActReg_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Upd01.UP.BLOCK1")){
			return MS_MSBCL6050_MfgActReg_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Upd01.UP.BLOCK2")){
			return MS_MSBCL6050_MfgActReg_Upd01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Upd01.UP.BLOCK3")){
			return MS_MSBCL6050_MfgActReg_Upd01_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Upd01.UP.BLOCK4")){
			return MS_MSBCL6050_MfgActReg_Upd01_UP_BLOCK4();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Upd01.UP.BLOCK5")){
			return MS_MSBCL6050_MfgActReg_Upd01_UP_BLOCK5();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Upd01.UP.BLOCK6")){
			return MS_MSBCL6050_MfgActReg_Upd01_UP_BLOCK6();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Upd01.UP.BLOCK7")){
			return MS_MSBCL6050_MfgActReg_Upd01_UP_BLOCK7();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Upd01.DOWN.BLOCK0")){
			return MS_MSBCL6050_MfgActReg_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Upd01.DOWN.BLOCK1")){
			return MS_MSBCL6050_MfgActReg_Upd01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Upd01.DOWN.BLOCK2")){
			return MS_MSBCL6050_MfgActReg_Upd01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Upd01.DOWN.BLOCK3")){
			return MS_MSBCL6050_MfgActReg_Upd01_DOWN_BLOCK3();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Upd01.DOWN.BLOCK4")){
			return MS_MSBCL6050_MfgActReg_Upd01_DOWN_BLOCK4();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Upd01.DOWN.BLOCK5")){
			return MS_MSBCL6050_MfgActReg_Upd01_DOWN_BLOCK5();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Upd01.DOWN.BLOCK6")){
			return MS_MSBCL6050_MfgActReg_Upd01_DOWN_BLOCK6();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Upd02.UP.BLOCK0")){
			return MS_MSBCL6050_MfgActReg_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Upd02.UP.BLOCK1")){
			return MS_MSBCL6050_MfgActReg_Upd02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Upd02.UP.BLOCK2")){
			return MS_MSBCL6050_MfgActReg_Upd02_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Upd02.UP.BLOCK3")){
			return MS_MSBCL6050_MfgActReg_Upd02_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Upd02.DOWN.BLOCK0")){
			return MS_MSBCL6050_MfgActReg_Upd02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Upd02.DOWN.BLOCK1")){
			return MS_MSBCL6050_MfgActReg_Upd02_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Upd02.DOWN.BLOCK2")){
			return MS_MSBCL6050_MfgActReg_Upd02_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Upd03.UP.BLOCK0")){
			return MS_MSBCL6050_MfgActReg_Upd03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Upd03.UP.BLOCK1")){
			return MS_MSBCL6050_MfgActReg_Upd03_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Upd03.DOWN.BLOCK0")){
			return MS_MSBCL6050_MfgActReg_Upd03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Upd04.UP.BLOCK0")){
			return MS_MSBCL6050_MfgActReg_Upd04_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Upd04.UP.BLOCK1")){
			return MS_MSBCL6050_MfgActReg_Upd04_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Upd04.DOWN.BLOCK0")){
			return MS_MSBCL6050_MfgActReg_Upd04_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Del01.UP.BLOCK0")){
			return MS_MSBCL6050_MfgActReg_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Del01.UP.BLOCK1")){
			return MS_MSBCL6050_MfgActReg_Del01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Del01.UP.BLOCK2")){
			return MS_MSBCL6050_MfgActReg_Del01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Del01.UP.BLOCK3")){
			return MS_MSBCL6050_MfgActReg_Del01_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Del01.UP.BLOCK4")){
			return MS_MSBCL6050_MfgActReg_Del01_UP_BLOCK4();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Del01.DOWN.BLOCK0")){
			return MS_MSBCL6050_MfgActReg_Del01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Del02.UP.BLOCK0")){
			return MS_MSBCL6050_MfgActReg_Del02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Del02.UP.BLOCK1")){
			return MS_MSBCL6050_MfgActReg_Del02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL6050.MfgActReg_Del02.DOWN.BLOCK0")){
			return MS_MSBCL6050_MfgActReg_Del02_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
											
	
	static final MCOperationInfo MS_MSBCL6050_MfgActReg_Chk01_INFO = new MCOperationInfo("MS", "MSBCL6050", "MfgActReg_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6050_MfgActReg_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("st_act_tm", "st_act_tm"),
				MCItemDef.create("st_ac_dt", "st_ac_dt"),
				MCItemDef.create("end_act_tm", "end_act_tm"),
				MCItemDef.create("end_ac_dt", "end_ac_dt"),
				MCItemDef.create("base_unit_st_act_qty", "base_unit_st_act_qty"),
				MCItemDef.create("rem_abort_flg", "rem_abort_flg"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_rpt_rmrks", "act_rpt_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("mfg_act_sub_char1", "mfg_act_sub_char1"),
				MCItemDef.create("mfg_act_sub_char2", "mfg_act_sub_char2"),
				MCItemDef.create("mfg_act_sub_char3", "mfg_act_sub_char3"),
				MCItemDef.create("itm_yield", "itm_yield"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("mfg_inst_upd_cntr", "mfg_inst_upd_cntr"),
				MCItemDef.create("mfg_inst_pr_upd_cntr", "mfg_inst_pr_upd_cntr"),
				MCItemDef.create("mfg_act_upd_cntr", "mfg_act_upd_cntr"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("act_immed_prnt_flg", "act_immed_prnt_flg"),
				MCItemDef.create("not_pd_chk_flg", "not_pd_chk_flg"),
				MCItemDef.create("upd_cntr_chk_flg", "upd_cntr_chk_flg"),
				MCItemDef.create("is_src_batch_flg", "is_src_batch_flg"),
				MCItemDef.create("lst_reg_flg", "lst_reg_flg"),
				MCItemDef.create("bkf_tgt_cnt", "bkf_tgt_cnt"),
				MCItemDef.create("bkf_success_cnt", "bkf_success_cnt"),
				MCItemDef.create("bkf_failure_cnt", "bkf_failure_cnt"),
				MCItemDef.create("is_src_md_mfg_srv_flg", "is_src_md_mfg_srv_flg")
			}
			,
			MCBlockDef.create("MfgActReg_Chk01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBCL6050_MfgActReg_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Chk01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("oper_unit_act_qty", "oper_unit_act_qty"),
				MCItemDef.create("oper_yield", "oper_yield"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("oper_act_intr_rmrks", "oper_act_intr_rmrks"),
				MCItemDef.create("oper_act_rpt_rmrks", "oper_act_rpt_rmrks"),
				MCItemDef.create("oper_act_sub_char1", "oper_act_sub_char1"),
				MCItemDef.create("oper_act_sub_char2", "oper_act_sub_char2"),
				MCItemDef.create("oper_act_sub_char3", "oper_act_sub_char3"),
				MCItemDef.create("bkf_upd_flg", "bkf_upd_flg"),
				MCItemDef.create("wk_cost_upd_calc_flg", "wk_cost_upd_calc_flg"),
				MCItemDef.create("oper_ord_no", "oper_ord_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("oper_act_no", "oper_act_no"),
				MCItemDef.create("st_act_tm", "st_act_tm"),
				MCItemDef.create("end_act_tm", "end_act_tm"),
				MCItemDef.create("bkf_not_ref_flg", "bkf_not_ref_flg"),
				MCItemDef.create("bkf_tgt_cnt", "bkf_tgt_cnt"),
				MCItemDef.create("bkf_success_cnt", "bkf_success_cnt"),
				MCItemDef.create("bkf_failure_cnt", "bkf_failure_cnt"),
				MCItemDef.create("not_cmpl_flg", "not_cmpl_flg"),
				MCItemDef.create("mes_flg", "mes_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_oper_act_no", "ext_oper_act_no"),
				MCItemDef.create("if_auto_reg_flg", "if_auto_reg_flg")
			}
			,
			MCBlockDef.create("MfgActReg_Chk01_DtlOper")
		);
	}

	public static MCContainerDef MS_MSBCL6050_MfgActReg_Chk01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Chk01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("alt_itm_fix_flg", "alt_itm_fix_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("base_unit_inpt_qty", "base_unit_inpt_qty"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("cont_inpt_qty", "cont_inpt_qty"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("acxfr_act_qty", "acxfr_act_qty"),
				MCItemDef.create("acxfr_act_rsn_cd", "acxfr_act_rsn_cd"),
				MCItemDef.create("acxfr_act_bd_dpt_cd", "acxfr_act_bd_dpt_cd"),
				MCItemDef.create("act_tm", "act_tm"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("inpt_rsn_cd", "inpt_rsn_cd"),
				MCItemDef.create("inpt_loc_cd", "inpt_loc_cd"),
				MCItemDef.create("inpt_str_ln_cd", "inpt_str_ln_cd"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("inpt_act_intr_rmrks", "inpt_act_intr_rmrks"),
				MCItemDef.create("inpt_act_rpt_rmrks", "inpt_act_rpt_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("inpt_act_sub_char1", "inpt_act_sub_char1"),
				MCItemDef.create("inpt_act_sub_char2", "inpt_act_sub_char2"),
				MCItemDef.create("inpt_act_sub_char3", "inpt_act_sub_char3"),
				MCItemDef.create("bkf_upd_flg", "bkf_upd_flg"),
				MCItemDef.create("inpt_schd_no", "inpt_schd_no"),
				MCItemDef.create("inpt_act_no", "inpt_act_no"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("inpt_rsn_comp_flg", "inpt_rsn_comp_flg"),
				MCItemDef.create("inpt_rsn_not_comp_flg", "inpt_rsn_not_comp_flg"),
				MCItemDef.create("mes_flg", "mes_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_inpt_act_no", "ext_inpt_act_no"),
				MCItemDef.create("if_auto_reg_flg", "if_auto_reg_flg"),
				MCItemDef.create("is_only_abort_flg", "is_only_abort_flg")
			}
			,
			MCBlockDef.create("MfgActReg_Chk01_DtlInpt")
		);
	}

	public static MCContainerDef MS_MSBCL6050_MfgActReg_Chk01_UP_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Chk01",
			new MCItemDef[]{
				MCItemDef.create("inpt_peg_no", "inpt_peg_no"),
				MCItemDef.create("loss_act_no", "loss_act_no"),
				MCItemDef.create("loss_rsn_cd", "loss_rsn_cd"),
				MCItemDef.create("loss_qty", "loss_qty"),
				MCItemDef.create("cont_loss_qty", "cont_loss_qty"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("MfgActReg_Chk01_DtlLoss")
		);
	}

	public static MCContainerDef MS_MSBCL6050_MfgActReg_Chk01_UP_BLOCK4() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Chk01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("act_wk_cost", "act_wk_cost"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("st_tm", "st_tm"),
				MCItemDef.create("end_tm", "end_tm"),
				MCItemDef.create("brk_pd", "brk_pd"),
				MCItemDef.create("wk_day_cd", "wk_day_cd"),
				MCItemDef.create("wk_rsn_cd", "wk_rsn_cd"),
				MCItemDef.create("wk_usr_cd", "wk_usr_cd"),
				MCItemDef.create("wk_usr_dpt_cd", "wk_usr_dpt_cd"),
				MCItemDef.create("fclty", "fclty"),
				MCItemDef.create("wk_cost_calc_upd_flg", "wk_cost_calc_upd_flg"),
				MCItemDef.create("wk_act_intr_rmrks", "wk_act_intr_rmrks"),
				MCItemDef.create("wk_act_sub_char1", "wk_act_sub_char1"),
				MCItemDef.create("wk_act_sub_char2", "wk_act_sub_char2"),
				MCItemDef.create("wk_act_sub_char3", "wk_act_sub_char3"),
				MCItemDef.create("wk_schd_no", "wk_schd_no"),
				MCItemDef.create("wk_act_no", "wk_act_no"),
				MCItemDef.create("mes_flg", "mes_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_wk_act_no", "ext_wk_act_no")
			}
			,
			MCBlockDef.create("MfgActReg_Chk01_DtlWk")
		);
	}

	public static MCContainerDef MS_MSBCL6050_MfgActReg_Chk01_UP_BLOCK5() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Chk01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("yield_typ", "yield_typ"),
				MCItemDef.create("trd_unit_yield_act_qty", "trd_unit_yield_act_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("act_tm", "act_tm"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("same_lot_flg", "same_lot_flg"),
				MCItemDef.create("yield_rsn_cd", "yield_rsn_cd"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("yield_rate", "yield_rate"),
				MCItemDef.create("insp_cnt_rmrks", "insp_cnt_rmrks"),
				MCItemDef.create("yield_act_intr_rmrks", "yield_act_intr_rmrks"),
				MCItemDef.create("yield_act_rpt_rmrks", "yield_act_rpt_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("yield_act_sub_char1", "yield_act_sub_char1"),
				MCItemDef.create("yield_act_sub_char2", "yield_act_sub_char2"),
				MCItemDef.create("yield_act_sub_char3", "yield_act_sub_char3"),
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("yield_act_no", "yield_act_no"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("mes_flg", "mes_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_yield_act_no", "ext_yield_act_no")
			}
			,
			MCBlockDef.create("MfgActReg_Chk01_DtlYield")
		);
	}

	public static MCContainerDef MS_MSBCL6050_MfgActReg_Chk01_UP_BLOCK6() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Chk01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("trd_unit_yield_act_qty", "trd_unit_yield_act_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("act_tm", "act_tm"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("same_lot_flg", "same_lot_flg"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("yield_rsn_cd", "yield_rsn_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("yield_rate", "yield_rate"),
				MCItemDef.create("yield_act_intr_rmrks", "yield_act_intr_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("yield_act_sub_char1", "yield_act_sub_char1"),
				MCItemDef.create("yield_act_sub_char2", "yield_act_sub_char2"),
				MCItemDef.create("yield_act_sub_char3", "yield_act_sub_char3"),
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("yield_act_no", "yield_act_no"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("mes_flg", "mes_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_yield_act_no", "ext_yield_act_no")
			}
			,
			MCBlockDef.create("MfgActReg_Chk01_DtlByProd")
		);
	}


	public static MCContainerDef MS_MSBCL6050_MfgActReg_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Chk01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("inst_lot_no", "inst_lot_no"),
				MCItemDef.create("inst_sublot_no", "inst_sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("st_act_tm", "st_act_tm"),
				MCItemDef.create("st_ac_dt", "st_ac_dt"),
				MCItemDef.create("end_act_tm", "end_act_tm"),
				MCItemDef.create("end_ac_dt", "end_ac_dt"),
				MCItemDef.create("itm_mfg_inst_qty", "itm_mfg_inst_qty"),
				MCItemDef.create("base_unit_st_act_qty", "base_unit_st_act_qty"),
				MCItemDef.create("base_unit_yield_qty", "base_unit_yield_qty"),
				MCItemDef.create("base_unit_dfct_qty", "base_unit_dfct_qty"),
				MCItemDef.create("rem_abort_flg", "rem_abort_flg"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_conv_rnd_typ", "base_unit_conv_rnd_typ"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_rpt_rmrks", "act_rpt_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("mfg_act_sub_char1", "mfg_act_sub_char1"),
				MCItemDef.create("mfg_act_sub_char2", "mfg_act_sub_char2"),
				MCItemDef.create("mfg_act_sub_char3", "mfg_act_sub_char3"),
				MCItemDef.create("act_prnt_flg", "act_prnt_flg"),
				MCItemDef.create("act_prnt_tm", "act_prnt_tm"),
				MCItemDef.create("prnt_seq", "prnt_seq"),
				MCItemDef.create("itm_yield", "itm_yield"),
				MCItemDef.create("mfg_mtd_typ", "mfg_mtd_typ"),
				MCItemDef.create("mfg_inst_unit_typ", "mfg_inst_unit_typ"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_str_ln_cd", "mfg_str_ln_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("mfg_inst_upd_cntr", "mfg_inst_upd_cntr"),
				MCItemDef.create("mfg_inst_pr_upd_cntr", "mfg_inst_pr_upd_cntr"),
				MCItemDef.create("mfg_act_upd_cntr", "mfg_act_upd_cntr"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("aprv_flg", "aprv_flg"),
				MCItemDef.create("mfg_aprv_role_cd", "mfg_aprv_role_cd"),
				MCItemDef.create("old_mfg_aprv_sts_typ", "old_mfg_aprv_sts_typ"),
				MCItemDef.create("old_end_act_tm", "old_end_act_tm"),
				MCItemDef.create("mfg_aprv_sts_typ", "mfg_aprv_sts_typ"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("lot_no_typ", "lot_no_typ"),
				MCItemDef.create("lot_no_ptn_cd", "lot_no_ptn_cd"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("sublot_no_typ", "sublot_no_typ"),
				MCItemDef.create("sublot_no_ptn_cd", "sublot_no_ptn_cd"),
				MCItemDef.create("arr_purc_auto_reg_flg", "arr_purc_auto_reg_flg"),
				MCItemDef.create("act_immed_prnt_flg", "act_immed_prnt_flg"),
				MCItemDef.create("not_pd_chk_flg", "not_pd_chk_flg"),
				MCItemDef.create("is_src_batch_flg", "is_src_batch_flg"),
				MCItemDef.create("bkf_tgt_cnt", "bkf_tgt_cnt"),
				MCItemDef.create("bkf_success_cnt", "bkf_success_cnt"),
				MCItemDef.create("bkf_failure_cnt", "bkf_failure_cnt"),
				MCItemDef.create("is_src_md_mfg_srv_flg", "is_src_md_mfg_srv_flg")
			}
			,
			MCBlockDef.create("MfgActReg_Chk01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBCL6050_MfgActReg_Chk01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Chk01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_unit_act_qty", "oper_unit_act_qty"),
				MCItemDef.create("oper_std_qty", "oper_std_qty"),
				MCItemDef.create("oper_conv_qty", "oper_conv_qty"),
				MCItemDef.create("oper_unit_conv_rnd_typ", "oper_unit_conv_rnd_typ"),
				MCItemDef.create("oper_unit_dec_place", "oper_unit_dec_place"),
				MCItemDef.create("oper_unit_cd", "oper_unit_cd"),
				MCItemDef.create("oper_yield", "oper_yield"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("oper_act_intr_rmrks", "oper_act_intr_rmrks"),
				MCItemDef.create("oper_act_rpt_rmrks", "oper_act_rpt_rmrks"),
				MCItemDef.create("oper_act_sub_char1", "oper_act_sub_char1"),
				MCItemDef.create("oper_act_sub_char2", "oper_act_sub_char2"),
				MCItemDef.create("oper_act_sub_char3", "oper_act_sub_char3"),
				MCItemDef.create("bkf_flg", "bkf_flg"),
				MCItemDef.create("bkf_upd_flg", "bkf_upd_flg"),
				MCItemDef.create("wk_cost_calc_flg", "wk_cost_calc_flg"),
				MCItemDef.create("wk_cost_upd_calc_flg", "wk_cost_upd_calc_flg"),
				MCItemDef.create("oper_ord_no", "oper_ord_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("oper_act_no", "oper_act_no"),
				MCItemDef.create("mes_id", "mes_id"),
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("arr_act_no", "arr_act_no"),
				MCItemDef.create("purc_act_io_no", "purc_act_io_no"),
				MCItemDef.create("st_act_tm", "st_act_tm"),
				MCItemDef.create("end_act_tm", "end_act_tm"),
				MCItemDef.create("bkf_not_ref_flg", "bkf_not_ref_flg"),
				MCItemDef.create("bkf_tgt_cnt", "bkf_tgt_cnt"),
				MCItemDef.create("bkf_success_cnt", "bkf_success_cnt"),
				MCItemDef.create("bkf_failure_cnt", "bkf_failure_cnt"),
				MCItemDef.create("not_cmpl_flg", "not_cmpl_flg"),
				MCItemDef.create("mes_flg", "mes_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_oper_act_no", "ext_oper_act_no"),
				MCItemDef.create("if_auto_reg_flg", "if_auto_reg_flg"),
				MCItemDef.create("yield_oper_flg", "yield_oper_flg")
			}
			,
			MCBlockDef.create("MfgActReg_Chk01_DtlOper")
		);
	}
	public static MCContainerDef MS_MSBCL6050_MfgActReg_Chk01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Chk01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("alt_grp_cd", "alt_grp_cd"),
				MCItemDef.create("alt_grp_seq", "alt_grp_seq"),
				MCItemDef.create("alt_itm_fix_flg", "alt_itm_fix_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("ver_flg", "ver_flg"),
				MCItemDef.create("base_unit_inpt_qty", "base_unit_inpt_qty"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_conv_rnd_typ", "base_unit_conv_rnd_typ"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("cont_fctr_rnd_typ", "cont_fctr_rnd_typ"),
				MCItemDef.create("cont_fctr_dec_place", "cont_fctr_dec_place"),
				MCItemDef.create("act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("cont_inpt_qty", "cont_inpt_qty"),
				MCItemDef.create("cont_fctr_unit_cd", "cont_fctr_unit_cd"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("inpt_lot_no", "inpt_lot_no"),
				MCItemDef.create("inpt_sublot_no", "inpt_sublot_no"),
				MCItemDef.create("vld_dt", "vld_dt"),
				MCItemDef.create("first_gr_dt", "first_gr_dt"),
				MCItemDef.create("lot_seq", "lot_seq"),
				MCItemDef.create("acxfr_act_qty", "acxfr_act_qty"),
				MCItemDef.create("acxfr_act_rsn_cd", "acxfr_act_rsn_cd"),
				MCItemDef.create("acxfr_act_bd_dpt_cd", "acxfr_act_bd_dpt_cd"),
				MCItemDef.create("act_tm", "act_tm"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("inst_sno1", "inst_sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("inst_sno2", "inst_sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("inst_sno3", "inst_sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("inst_sno4", "inst_sno4"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("inpt_rsn_cd", "inpt_rsn_cd"),
				MCItemDef.create("inpt_loc_cd", "inpt_loc_cd"),
				MCItemDef.create("inpt_str_ln_tgt_flg", "inpt_str_ln_tgt_flg"),
				MCItemDef.create("inpt_str_ln_cd", "inpt_str_ln_cd"),
				MCItemDef.create("inpt_loc_sppl_cd", "inpt_loc_sppl_cd"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("inpt_act_intr_rmrks", "inpt_act_intr_rmrks"),
				MCItemDef.create("inpt_act_rpt_rmrks", "inpt_act_rpt_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("inpt_act_sub_char1", "inpt_act_sub_char1"),
				MCItemDef.create("inpt_act_sub_char2", "inpt_act_sub_char2"),
				MCItemDef.create("inpt_act_sub_char3", "inpt_act_sub_char3"),
				MCItemDef.create("bkf_upd_flg", "bkf_upd_flg"),
				MCItemDef.create("lot_mix_flg", "lot_mix_flg"),
				MCItemDef.create("sublot_mix_flg", "sublot_mix_flg"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("alt_itm_typ", "alt_itm_typ"),
				MCItemDef.create("alt_alloc_prio", "alt_alloc_prio"),
				MCItemDef.create("base_unit_alt_qty", "base_unit_alt_qty"),
				MCItemDef.create("alloc_flg", "alloc_flg"),
				MCItemDef.create("alloc_ctl_typ", "alloc_ctl_typ"),
				MCItemDef.create("inpt_schd_no", "inpt_schd_no"),
				MCItemDef.create("inpt_act_no", "inpt_act_no"),
				MCItemDef.create("mes_id", "mes_id"),
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("slf_support_cur_cd", "slf_support_cur_cd"),
				MCItemDef.create("slf_support_upri", "slf_support_upri"),
				MCItemDef.create("slf_support_tax_cd", "slf_support_tax_cd"),
				MCItemDef.create("slf_support_xrate_cd", "slf_support_xrate_cd"),
				MCItemDef.create("slf_support_xrate", "slf_support_xrate"),
				MCItemDef.create("vmi_interim_flg", "vmi_interim_flg"),
				MCItemDef.create("vmi_upri", "vmi_upri"),
				MCItemDef.create("base_unit_std_qty", "base_unit_std_qty"),
				MCItemDef.create("add_flg", "add_flg"),
				MCItemDef.create("old_ver_no", "old_ver_no"),
				MCItemDef.create("mes_flg", "mes_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_inpt_act_no", "ext_inpt_act_no"),
				MCItemDef.create("if_auto_reg_flg", "if_auto_reg_flg"),
				MCItemDef.create("is_only_abort_flg", "is_only_abort_flg")
			}
			,
			MCBlockDef.create("MfgActReg_Chk01_DtlInpt")
		);
	}
	public static MCContainerDef MS_MSBCL6050_MfgActReg_Chk01_DOWN_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Chk01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("inpt_peg_no", "inpt_peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("fxd_loss_flg", "fxd_loss_flg"),
				MCItemDef.create("loss_act_no", "loss_act_no"),
				MCItemDef.create("loss_rsn_cd", "loss_rsn_cd"),
				MCItemDef.create("loss_qty", "loss_qty"),
				MCItemDef.create("cont_loss_qty", "cont_loss_qty"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("MfgActReg_Chk01_DtlLoss")
		);
	}
	public static MCContainerDef MS_MSBCL6050_MfgActReg_Chk01_DOWN_BLOCK4() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Chk01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("act_wk_cost", "act_wk_cost"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("st_tm", "st_tm"),
				MCItemDef.create("end_tm", "end_tm"),
				MCItemDef.create("brk_pd", "brk_pd"),
				MCItemDef.create("wk_day_cd", "wk_day_cd"),
				MCItemDef.create("wk_rsn_cd", "wk_rsn_cd"),
				MCItemDef.create("wk_usr_cd", "wk_usr_cd"),
				MCItemDef.create("wk_usr_dpt_cd", "wk_usr_dpt_cd"),
				MCItemDef.create("fclty", "fclty"),
				MCItemDef.create("wk_cost_calc_flg", "wk_cost_calc_flg"),
				MCItemDef.create("wk_cost_calc_upd_flg", "wk_cost_calc_upd_flg"),
				MCItemDef.create("wk_act_intr_rmrks", "wk_act_intr_rmrks"),
				MCItemDef.create("wk_act_sub_char1", "wk_act_sub_char1"),
				MCItemDef.create("wk_act_sub_char2", "wk_act_sub_char2"),
				MCItemDef.create("wk_act_sub_char3", "wk_act_sub_char3"),
				MCItemDef.create("wk_schd_no", "wk_schd_no"),
				MCItemDef.create("wk_act_no", "wk_act_no"),
				MCItemDef.create("mes_flg", "mes_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_wk_act_no", "ext_wk_act_no")
			}
			,
			MCBlockDef.create("MfgActReg_Chk01_DtlWk")
		);
	}
	public static MCContainerDef MS_MSBCL6050_MfgActReg_Chk01_DOWN_BLOCK5() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Chk01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("yield_typ", "yield_typ"),
				MCItemDef.create("trd_unit_yield_act_qty", "trd_unit_yield_act_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("base_unit_yield_act_qty", "base_unit_yield_act_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("act_tm", "act_tm"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("same_lot_flg", "same_lot_flg"),
				MCItemDef.create("yield_rsn_cd", "yield_rsn_cd"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("yield_rate", "yield_rate"),
				MCItemDef.create("insp_cnt_rmrks", "insp_cnt_rmrks"),
				MCItemDef.create("yield_act_intr_rmrks", "yield_act_intr_rmrks"),
				MCItemDef.create("yield_act_rpt_rmrks", "yield_act_rpt_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("yield_act_sub_char1", "yield_act_sub_char1"),
				MCItemDef.create("yield_act_sub_char2", "yield_act_sub_char2"),
				MCItemDef.create("yield_act_sub_char3", "yield_act_sub_char3"),
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("yield_act_no", "yield_act_no"),
				MCItemDef.create("stk_lst_prnt_flg", "stk_lst_prnt_flg"),
				MCItemDef.create("mes_id", "mes_id"),
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("pack_flg", "pack_flg"),
				MCItemDef.create("sublot_ctl_flg", "sublot_ctl_flg"),
				MCItemDef.create("not_stk_flg", "not_stk_flg"),
				MCItemDef.create("old_lot_no", "old_lot_no"),
				MCItemDef.create("old_sublot_no", "old_sublot_no"),
				MCItemDef.create("old_yield_typ", "old_yield_typ"),
				MCItemDef.create("old_base_unit_yield_act_qty", "old_base_unit_yield_act_qty"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("mes_flg", "mes_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_yield_act_no", "ext_yield_act_no")
			}
			,
			MCBlockDef.create("MfgActReg_Chk01_DtlYield")
		);
	}
	public static MCContainerDef MS_MSBCL6050_MfgActReg_Chk01_DOWN_BLOCK6() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Chk01",
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
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("trd_unit_yield_act_qty", "trd_unit_yield_act_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("base_unit_yield_act_qty", "base_unit_yield_act_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("act_tm", "act_tm"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("same_lot_flg", "same_lot_flg"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("yield_rsn_cd", "yield_rsn_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("yield_rate", "yield_rate"),
				MCItemDef.create("yield_act_intr_rmrks", "yield_act_intr_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("yield_act_sub_char1", "yield_act_sub_char1"),
				MCItemDef.create("yield_act_sub_char2", "yield_act_sub_char2"),
				MCItemDef.create("yield_act_sub_char3", "yield_act_sub_char3"),
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("yield_act_no", "yield_act_no"),
				MCItemDef.create("stk_lst_prnt_flg", "stk_lst_prnt_flg"),
				MCItemDef.create("mes_id", "mes_id"),
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("pack_flg", "pack_flg"),
				MCItemDef.create("sublot_ctl_flg", "sublot_ctl_flg"),
				MCItemDef.create("old_lot_no", "old_lot_no"),
				MCItemDef.create("old_sublot_no", "old_sublot_no"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("mes_flg", "mes_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_yield_act_no", "ext_yield_act_no")
			}
			,
			MCBlockDef.create("MfgActReg_Chk01_DtlByProd")
		);
	}
	
	static final MCOperationInfo MS_MSBCL6050_MfgActReg_Chk02_INFO = new MCOperationInfo("MS", "MSBCL6050", "MfgActReg_Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6050_MfgActReg_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("mfg_inst_upd_cntr", "mfg_inst_upd_cntr"),
				MCItemDef.create("mfg_inst_pr_upd_cntr", "mfg_inst_pr_upd_cntr"),
				MCItemDef.create("mfg_act_upd_cntr", "mfg_act_upd_cntr"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("upd_cntr_chk_flg", "upd_cntr_chk_flg"),
				MCItemDef.create("lst_del_flg", "lst_del_flg"),
				MCItemDef.create("is_src_batch_flg", "is_src_batch_flg")
			}
			,
			MCBlockDef.create("MfgActReg_Chk02_Hdr")
		);
	}

	public static MCContainerDef MS_MSBCL6050_MfgActReg_Chk02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Chk02",
			new MCItemDef[]{
				MCItemDef.create("inpt_act_no", "inpt_act_no"),
				MCItemDef.create("can_ac_dt", "can_ac_dt")
			}
			,
			MCBlockDef.create("MfgActReg_Chk02_DtlInpt")
		);
	}

	public static MCContainerDef MS_MSBCL6050_MfgActReg_Chk02_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Chk02",
			new MCItemDef[]{
				MCItemDef.create("yield_act_no", "yield_act_no"),
				MCItemDef.create("can_ac_dt", "can_ac_dt")
			}
			,
			MCBlockDef.create("MfgActReg_Chk02_DtlYield")
		);
	}

	public static MCContainerDef MS_MSBCL6050_MfgActReg_Chk02_UP_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Chk02",
			new MCItemDef[]{
				MCItemDef.create("yield_act_no", "yield_act_no"),
				MCItemDef.create("can_ac_dt", "can_ac_dt")
			}
			,
			MCBlockDef.create("MfgActReg_Chk02_DtlByProd")
		);
	}

	public static MCContainerDef MS_MSBCL6050_MfgActReg_Chk02_UP_BLOCK4() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Chk02",
			new MCItemDef[]{
				MCItemDef.create("lst_del_flg", "lst_del_flg"),
				MCItemDef.create("upd_cntr_chk_flg", "upd_cntr_chk_flg"),
				MCItemDef.create("is_src_batch_flg", "is_src_batch_flg")
			}
			,
			MCBlockDef.create("MfgActReg_Chk02_Ctrl")
		);
	}


	public static MCContainerDef MS_MSBCL6050_MfgActReg_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Chk02",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("base_unit_st_act_qty", "base_unit_st_act_qty"),
				MCItemDef.create("base_unit_yield_qty", "base_unit_yield_qty"),
				MCItemDef.create("base_unit_dfct_qty", "base_unit_dfct_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("mfg_mtd_typ", "mfg_mtd_typ"),
				MCItemDef.create("mfg_inst_unit_typ", "mfg_inst_unit_typ"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("aprv_flg", "aprv_flg"),
				MCItemDef.create("mfg_aprv_role_cd", "mfg_aprv_role_cd"),
				MCItemDef.create("old_mfg_aprv_sts_typ", "old_mfg_aprv_sts_typ"),
				MCItemDef.create("old_end_act_tm", "old_end_act_tm"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("mfg_inst_upd_cntr", "mfg_inst_upd_cntr"),
				MCItemDef.create("mfg_inst_pr_upd_cntr", "mfg_inst_pr_upd_cntr"),
				MCItemDef.create("mfg_act_upd_cntr", "mfg_act_upd_cntr"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("is_src_batch_flg", "is_src_batch_flg")
			}
			,
			MCBlockDef.create("MfgActReg_Chk02_Hdr")
		);
	}
	public static MCContainerDef MS_MSBCL6050_MfgActReg_Chk02_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Chk02",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("oper_ord_no", "oper_ord_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("oper_act_no", "oper_act_no")
			}
			,
			MCBlockDef.create("MfgActReg_Chk02_DtlOper")
		);
	}
	public static MCContainerDef MS_MSBCL6050_MfgActReg_Chk02_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Chk02",
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
				MCItemDef.create("old_ver_no", "old_ver_no"),
				MCItemDef.create("inpt_schd_no", "inpt_schd_no"),
				MCItemDef.create("inpt_act_no", "inpt_act_no"),
				MCItemDef.create("can_ac_dt", "can_ac_dt")
			}
			,
			MCBlockDef.create("MfgActReg_Chk02_DtlInpt")
		);
	}
	public static MCContainerDef MS_MSBCL6050_MfgActReg_Chk02_DOWN_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Chk02",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("inpt_peg_no", "inpt_peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("fxd_loss_flg", "fxd_loss_flg"),
				MCItemDef.create("loss_act_no", "loss_act_no"),
				MCItemDef.create("loss_rsn_cd", "loss_rsn_cd")
			}
			,
			MCBlockDef.create("MfgActReg_Chk02_DtlLoss")
		);
	}
	public static MCContainerDef MS_MSBCL6050_MfgActReg_Chk02_DOWN_BLOCK4() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Chk02",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("wk_schd_no", "wk_schd_no"),
				MCItemDef.create("wk_act_no", "wk_act_no")
			}
			,
			MCBlockDef.create("MfgActReg_Chk02_DtlWk")
		);
	}
	public static MCContainerDef MS_MSBCL6050_MfgActReg_Chk02_DOWN_BLOCK5() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Chk02",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("yield_act_no", "yield_act_no"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("not_stk_flg", "not_stk_flg"),
				MCItemDef.create("old_lot_no", "old_lot_no"),
				MCItemDef.create("old_sublot_no", "old_sublot_no"),
				MCItemDef.create("old_yield_typ", "old_yield_typ"),
				MCItemDef.create("old_base_unit_yield_act_qty", "old_base_unit_yield_act_qty")
			}
			,
			MCBlockDef.create("MfgActReg_Chk02_DtlYield")
		);
	}
	public static MCContainerDef MS_MSBCL6050_MfgActReg_Chk02_DOWN_BLOCK6() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Chk02",
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
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("yield_act_no", "yield_act_no"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("old_lot_no", "old_lot_no"),
				MCItemDef.create("old_sublot_no", "old_sublot_no")
			}
			,
			MCBlockDef.create("MfgActReg_Chk02_DtlByProd")
		);
	}
	public static MCContainerDef MS_MSBCL6050_MfgActReg_Chk02_DOWN_BLOCK7() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Chk02",
			new MCItemDef[]{
				MCItemDef.create("lst_del_flg", "lst_del_flg"),
				MCItemDef.create("upd_cntr_chk_flg", "upd_cntr_chk_flg"),
				MCItemDef.create("is_src_batch_flg", "is_src_batch_flg")
			}
			,
			MCBlockDef.create("MfgActReg_Chk02_Ctrl")
		);
	}
	
	static final MCOperationInfo MS_MSBCL6050_MfgActReg_Chk03_INFO = new MCOperationInfo("MS", "MSBCL6050", "MfgActReg_Chk03", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6050_MfgActReg_Chk03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Chk03",
			new MCItemDef[]{
				MCItemDef.create("oper_unit_flg", "oper_unit_flg"),
				MCItemDef.create("is_src_batch_flg", "is_src_batch_flg"),
				MCItemDef.create("upd_cntr_chk_flg", "upd_cntr_chk_flg")
			}
			,
			MCBlockDef.create("MfgActReg_Chk03_Ctrl")
		);
	}

	public static MCContainerDef MS_MSBCL6050_MfgActReg_Chk03_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("st_act_tm", "st_act_tm"),
				MCItemDef.create("st_ac_dt", "st_ac_dt"),
				MCItemDef.create("end_act_tm", "end_act_tm"),
				MCItemDef.create("end_ac_dt", "end_ac_dt"),
				MCItemDef.create("base_unit_st_act_qty", "base_unit_st_act_qty"),
				MCItemDef.create("oper_unit_act_qty", "oper_unit_act_qty"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("mfg_inst_upd_cntr", "mfg_inst_upd_cntr"),
				MCItemDef.create("mfg_inst_pr_upd_cntr", "mfg_inst_pr_upd_cntr"),
				MCItemDef.create("mfg_act_upd_cntr", "mfg_act_upd_cntr")
			}
			,
			MCBlockDef.create("MfgActReg_Chk03_Hdr1")
		);
	}

	public static MCContainerDef MS_MSBCL6050_MfgActReg_Chk03_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("st_act_tm", "st_act_tm"),
				MCItemDef.create("st_ac_dt", "st_ac_dt"),
				MCItemDef.create("end_act_tm", "end_act_tm"),
				MCItemDef.create("end_ac_dt", "end_ac_dt"),
				MCItemDef.create("base_unit_st_act_qty", "base_unit_st_act_qty"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("mfg_inst_upd_cntr", "mfg_inst_upd_cntr"),
				MCItemDef.create("mfg_inst_pr_upd_cntr", "mfg_inst_pr_upd_cntr"),
				MCItemDef.create("mfg_act_upd_cntr", "mfg_act_upd_cntr")
			}
			,
			MCBlockDef.create("MfgActReg_Chk03_Hdr2")
		);
	}

	public static MCContainerDef MS_MSBCL6050_MfgActReg_Chk03_UP_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("yield_typ", "yield_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_yield_act_qty", "trd_unit_yield_act_qty"),
				MCItemDef.create("act_tm", "act_tm"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd")
			}
			,
			MCBlockDef.create("MfgActReg_Chk03_DtlYieldByProd")
		);
	}


	public static MCContainerDef MS_MSBCL6050_MfgActReg_Chk03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("MfgActReg_Chk03_Hdr1")
		);
	}
	public static MCContainerDef MS_MSBCL6050_MfgActReg_Chk03_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ")
			}
			,
			MCBlockDef.create("MfgActReg_Chk03_Hdr2")
		);
	}
	
	static final MCOperationInfo MS_MSBCL6050_MfgActReg_Chk04_INFO = new MCOperationInfo("MS", "MSBCL6050", "MfgActReg_Chk04", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6050_MfgActReg_Chk04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Chk04",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("inst_wk_act_flg", "inst_wk_act_flg"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("st_tm", "st_tm"),
				MCItemDef.create("end_tm", "end_tm"),
				MCItemDef.create("brk_pd", "brk_pd"),
				MCItemDef.create("act_wk_cost", "act_wk_cost"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("wk_day_cd", "wk_day_cd"),
				MCItemDef.create("wk_rsn_cd", "wk_rsn_cd"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("wk_usr_cd", "wk_usr_cd"),
				MCItemDef.create("wk_usr_dpt_cd", "wk_usr_dpt_cd"),
				MCItemDef.create("fclty", "fclty"),
				MCItemDef.create("wk_cost_calc_ctl_flg", "wk_cost_calc_ctl_flg"),
				MCItemDef.create("act_intr_rmrks", "act_intr_rmrks"),
				MCItemDef.create("act_sub_char1", "act_sub_char1"),
				MCItemDef.create("act_sub_char2", "act_sub_char2"),
				MCItemDef.create("act_sub_char3", "act_sub_char3"),
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
				MCItemDef.create("wk_schd_no", "wk_schd_no"),
				MCItemDef.create("wk_act_no", "wk_act_no"),
				MCItemDef.create("mfg_inst_upd_cntr", "mfg_inst_upd_cntr"),
				MCItemDef.create("wk_act_upd_cntr", "wk_act_upd_cntr"),
				MCItemDef.create("mes_flg", "mes_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_wk_act_no", "ext_wk_act_no")
			}
			,
			MCBlockDef.create("MfgActReg_Chk04_Rslt")
		);
	}

	public static MCContainerDef MS_MSBCL6050_MfgActReg_Chk04_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Chk04",
			new MCItemDef[]{
				MCItemDef.create("file_imp_flg", "file_imp_flg"),
				MCItemDef.create("upd_cntr_chk_flg", "upd_cntr_chk_flg"),
				MCItemDef.create("is_src_batch_flg", "is_src_batch_flg")
			}
			,
			MCBlockDef.create("MfgActReg_Chk04_Ctrl")
		);
	}


	public static MCContainerDef MS_MSBCL6050_MfgActReg_Chk04_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Chk04",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("inst_wk_act_flg", "inst_wk_act_flg"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("wk_cost_nm", "wk_cost_nm"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("old_ac_dt", "old_ac_dt"),
				MCItemDef.create("st_tm", "st_tm"),
				MCItemDef.create("end_tm", "end_tm"),
				MCItemDef.create("brk_pd", "brk_pd"),
				MCItemDef.create("act_wk_cost", "act_wk_cost"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("wk_cost_unit_nm", "wk_cost_unit_nm"),
				MCItemDef.create("wk_cost_dec_place", "wk_cost_dec_place"),
				MCItemDef.create("wk_cost_rnd_typ", "wk_cost_rnd_typ"),
				MCItemDef.create("wk_day_cd", "wk_day_cd"),
				MCItemDef.create("wk_day_nm", "wk_day_nm"),
				MCItemDef.create("wk_rsn_cd", "wk_rsn_cd"),
				MCItemDef.create("wk_rsn_nm", "wk_rsn_nm"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("str_ln_tgt_flg", "str_ln_tgt_flg"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_nm", "str_ln_nm"),
				MCItemDef.create("str_ln_cd_none_flg", "str_ln_cd_none_flg"),
				MCItemDef.create("wk_usr_cd", "wk_usr_cd"),
				MCItemDef.create("wk_usr_nm", "wk_usr_nm"),
				MCItemDef.create("wk_usr_dpt_cd", "wk_usr_dpt_cd"),
				MCItemDef.create("wk_usr_dpt_nm", "wk_usr_dpt_nm"),
				MCItemDef.create("fclty", "fclty"),
				MCItemDef.create("wk_cost_calc_ctl_flg", "wk_cost_calc_ctl_flg"),
				MCItemDef.create("act_intr_rmrks", "act_intr_rmrks"),
				MCItemDef.create("act_sub_char1", "act_sub_char1"),
				MCItemDef.create("act_sub_char2", "act_sub_char2"),
				MCItemDef.create("act_sub_char3", "act_sub_char3"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("wk_schd_no", "wk_schd_no"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("oper_act_no", "oper_act_no"),
				MCItemDef.create("wk_act_no", "wk_act_no"),
				MCItemDef.create("dpt_wg_cd", "dpt_wg_cd"),
				MCItemDef.create("dpt_wg_nm", "dpt_wg_nm"),
				MCItemDef.create("loc_wg_cd", "loc_wg_cd"),
				MCItemDef.create("loc_wg_nm", "loc_wg_nm"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("mfg_inst_upd_cntr", "mfg_inst_upd_cntr"),
				MCItemDef.create("wk_act_upd_cntr", "wk_act_upd_cntr"),
				MCItemDef.create("mes_flg", "mes_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_wk_act_no", "ext_wk_act_no")
			}
			,
			MCBlockDef.create("MfgActReg_Chk04_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBCL6050_MfgActReg_Chk05_INFO = new MCOperationInfo("MS", "MSBCL6050", "MfgActReg_Chk05", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6050_MfgActReg_Chk05_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Chk05",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("inst_wk_act_flg", "inst_wk_act_flg"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("wk_schd_no", "wk_schd_no"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("oper_act_no", "oper_act_no"),
				MCItemDef.create("wk_act_no", "wk_act_no"),
				MCItemDef.create("mfg_inst_upd_cntr", "mfg_inst_upd_cntr"),
				MCItemDef.create("wk_act_upd_cntr", "wk_act_upd_cntr")
			}
			,
			MCBlockDef.create("MfgActReg_Chk05_Rslt")
		);
	}

	public static MCContainerDef MS_MSBCL6050_MfgActReg_Chk05_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Chk05",
			new MCItemDef[]{
				MCItemDef.create("upd_cntr_chk_flg", "upd_cntr_chk_flg"),
				MCItemDef.create("is_src_batch_flg", "is_src_batch_flg")
			}
			,
			MCBlockDef.create("MfgActReg_Chk05_Ctrl")
		);
	}


	public static MCContainerDef MS_MSBCL6050_MfgActReg_Chk05_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Chk05",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("inst_wk_act_flg", "inst_wk_act_flg"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("old_ac_dt", "old_ac_dt"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("wk_schd_no", "wk_schd_no"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("oper_act_no", "oper_act_no"),
				MCItemDef.create("wk_act_no", "wk_act_no"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("mfg_inst_upd_cntr", "mfg_inst_upd_cntr"),
				MCItemDef.create("wk_act_upd_cntr", "wk_act_upd_cntr")
			}
			,
			MCBlockDef.create("MfgActReg_Chk05_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBCL6050_MfgActReg_Upd01_INFO = new MCOperationInfo("MS", "MSBCL6050", "MfgActReg_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6050_MfgActReg_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Upd01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("inst_lot_no", "inst_lot_no"),
				MCItemDef.create("inst_sublot_no", "inst_sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("st_act_tm", "st_act_tm"),
				MCItemDef.create("st_ac_dt", "st_ac_dt"),
				MCItemDef.create("end_act_tm", "end_act_tm"),
				MCItemDef.create("end_ac_dt", "end_ac_dt"),
				MCItemDef.create("itm_mfg_inst_qty", "itm_mfg_inst_qty"),
				MCItemDef.create("base_unit_st_act_qty", "base_unit_st_act_qty"),
				MCItemDef.create("rem_abort_flg", "rem_abort_flg"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_conv_rnd_typ", "base_unit_conv_rnd_typ"),
				MCItemDef.create("base_unit_yield_qty", "base_unit_yield_qty"),
				MCItemDef.create("base_unit_dfct_qty", "base_unit_dfct_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_rpt_rmrks", "act_rpt_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("mfg_act_sub_char1", "mfg_act_sub_char1"),
				MCItemDef.create("mfg_act_sub_char2", "mfg_act_sub_char2"),
				MCItemDef.create("mfg_act_sub_char3", "mfg_act_sub_char3"),
				MCItemDef.create("act_prnt_flg", "act_prnt_flg"),
				MCItemDef.create("act_prnt_tm", "act_prnt_tm"),
				MCItemDef.create("prnt_seq", "prnt_seq"),
				MCItemDef.create("itm_yield", "itm_yield"),
				MCItemDef.create("mfg_mtd_typ", "mfg_mtd_typ"),
				MCItemDef.create("mfg_inst_unit_typ", "mfg_inst_unit_typ"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_str_ln_cd", "mfg_str_ln_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("aprv_flg", "aprv_flg"),
				MCItemDef.create("mfg_aprv_role_cd", "mfg_aprv_role_cd"),
				MCItemDef.create("old_mfg_aprv_sts_typ", "old_mfg_aprv_sts_typ"),
				MCItemDef.create("old_end_act_tm", "old_end_act_tm"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("lot_no_typ", "lot_no_typ"),
				MCItemDef.create("lot_no_ptn_cd", "lot_no_ptn_cd"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("sublot_no_typ", "sublot_no_typ"),
				MCItemDef.create("sublot_no_ptn_cd", "sublot_no_ptn_cd"),
				MCItemDef.create("arr_purc_auto_reg_flg", "arr_purc_auto_reg_flg"),
				MCItemDef.create("act_immed_prnt_flg", "act_immed_prnt_flg"),
				MCItemDef.create("is_src_outsrc_srv_flg", "is_src_outsrc_srv_flg"),
				MCItemDef.create("lst_reg_flg", "lst_reg_flg"),
				MCItemDef.create("is_src_batch_flg", "is_src_batch_flg"),
				MCItemDef.create("bkf_tgt_cnt", "bkf_tgt_cnt"),
				MCItemDef.create("bkf_success_cnt", "bkf_success_cnt"),
				MCItemDef.create("bkf_failure_cnt", "bkf_failure_cnt"),
				MCItemDef.create("is_src_md_mfg_srv_flg", "is_src_md_mfg_srv_flg"),
				MCItemDef.create("unschd_act_flg", "unschd_act_flg"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("master_dt", "master_dt"),
				MCItemDef.create("mfg_str_ln_cd_none_flg", "mfg_str_ln_cd_none_flg"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("strg_str_ln_cd_none_flg", "strg_str_ln_cd_none_flg"),
				MCItemDef.create("not_bkf_upd_flg", "not_bkf_upd_flg"),
				MCItemDef.create("not_wk_cost_upd_calc_flg", "not_wk_cost_upd_calc_flg"),
				MCItemDef.create("mes_flg", "mes_flg"),
				MCItemDef.create("not_pd_chk_flg", "not_pd_chk_flg")
			}
			,
			MCBlockDef.create("MfgActReg_Upd01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBCL6050_MfgActReg_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Upd01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_unit_act_qty", "oper_unit_act_qty"),
				MCItemDef.create("oper_std_qty", "oper_std_qty"),
				MCItemDef.create("oper_conv_qty", "oper_conv_qty"),
				MCItemDef.create("oper_unit_conv_rnd_typ", "oper_unit_conv_rnd_typ"),
				MCItemDef.create("oper_unit_dec_place", "oper_unit_dec_place"),
				MCItemDef.create("oper_unit_cd", "oper_unit_cd"),
				MCItemDef.create("oper_yield", "oper_yield"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("oper_act_intr_rmrks", "oper_act_intr_rmrks"),
				MCItemDef.create("oper_act_rpt_rmrks", "oper_act_rpt_rmrks"),
				MCItemDef.create("oper_act_sub_char1", "oper_act_sub_char1"),
				MCItemDef.create("oper_act_sub_char2", "oper_act_sub_char2"),
				MCItemDef.create("oper_act_sub_char3", "oper_act_sub_char3"),
				MCItemDef.create("bkf_flg", "bkf_flg"),
				MCItemDef.create("bkf_upd_flg", "bkf_upd_flg"),
				MCItemDef.create("wk_cost_calc_flg", "wk_cost_calc_flg"),
				MCItemDef.create("wk_cost_upd_calc_flg", "wk_cost_upd_calc_flg"),
				MCItemDef.create("oper_ord_no", "oper_ord_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("oper_act_no", "oper_act_no"),
				MCItemDef.create("mes_id", "mes_id"),
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("arr_act_no", "arr_act_no"),
				MCItemDef.create("purc_act_io_no", "purc_act_io_no"),
				MCItemDef.create("st_act_tm", "st_act_tm"),
				MCItemDef.create("end_act_tm", "end_act_tm"),
				MCItemDef.create("bkf_not_ref_flg", "bkf_not_ref_flg"),
				MCItemDef.create("bkf_tgt_cnt", "bkf_tgt_cnt"),
				MCItemDef.create("bkf_success_cnt", "bkf_success_cnt"),
				MCItemDef.create("bkf_failure_cnt", "bkf_failure_cnt"),
				MCItemDef.create("not_cmpl_flg", "not_cmpl_flg"),
				MCItemDef.create("mes_flg", "mes_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_oper_act_no", "ext_oper_act_no"),
				MCItemDef.create("if_auto_reg_flg", "if_auto_reg_flg")
			}
			,
			MCBlockDef.create("MfgActReg_Upd01_DtlOper")
		);
	}

	public static MCContainerDef MS_MSBCL6050_MfgActReg_Upd01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Upd01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("alt_grp_cd", "alt_grp_cd"),
				MCItemDef.create("alt_grp_seq", "alt_grp_seq"),
				MCItemDef.create("alt_itm_fix_flg", "alt_itm_fix_flg"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("ver_flg", "ver_flg"),
				MCItemDef.create("base_unit_inpt_qty", "base_unit_inpt_qty"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_conv_rnd_typ", "base_unit_conv_rnd_typ"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("cont_fctr_rnd_typ", "cont_fctr_rnd_typ"),
				MCItemDef.create("cont_fctr_dec_place", "cont_fctr_dec_place"),
				MCItemDef.create("act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("cont_inpt_qty", "cont_inpt_qty"),
				MCItemDef.create("cont_fctr_unit_cd", "cont_fctr_unit_cd"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("inpt_lot_no", "inpt_lot_no"),
				MCItemDef.create("inpt_sublot_no", "inpt_sublot_no"),
				MCItemDef.create("vld_dt", "vld_dt"),
				MCItemDef.create("first_gr_dt", "first_gr_dt"),
				MCItemDef.create("lot_seq", "lot_seq"),
				MCItemDef.create("acxfr_act_qty", "acxfr_act_qty"),
				MCItemDef.create("acxfr_act_rsn_cd", "acxfr_act_rsn_cd"),
				MCItemDef.create("acxfr_act_bd_dpt_cd", "acxfr_act_bd_dpt_cd"),
				MCItemDef.create("act_tm", "act_tm"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("inst_sno1", "inst_sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("inst_sno2", "inst_sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("inst_sno3", "inst_sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("inst_sno4", "inst_sno4"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("inpt_rsn_cd", "inpt_rsn_cd"),
				MCItemDef.create("inpt_loc_cd", "inpt_loc_cd"),
				MCItemDef.create("inpt_str_ln_tgt_flg", "inpt_str_ln_tgt_flg"),
				MCItemDef.create("inpt_str_ln_cd", "inpt_str_ln_cd"),
				MCItemDef.create("inpt_loc_sppl_cd", "inpt_loc_sppl_cd"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("inpt_act_intr_rmrks", "inpt_act_intr_rmrks"),
				MCItemDef.create("inpt_act_rpt_rmrks", "inpt_act_rpt_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("inpt_act_sub_char1", "inpt_act_sub_char1"),
				MCItemDef.create("inpt_act_sub_char2", "inpt_act_sub_char2"),
				MCItemDef.create("inpt_act_sub_char3", "inpt_act_sub_char3"),
				MCItemDef.create("bkf_upd_flg", "bkf_upd_flg"),
				MCItemDef.create("lot_mix_flg", "lot_mix_flg"),
				MCItemDef.create("sublot_mix_flg", "sublot_mix_flg"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("alt_itm_typ", "alt_itm_typ"),
				MCItemDef.create("alt_alloc_prio", "alt_alloc_prio"),
				MCItemDef.create("base_unit_alt_qty", "base_unit_alt_qty"),
				MCItemDef.create("alloc_flg", "alloc_flg"),
				MCItemDef.create("alloc_ctl_typ", "alloc_ctl_typ"),
				MCItemDef.create("inpt_schd_no", "inpt_schd_no"),
				MCItemDef.create("inpt_act_no", "inpt_act_no"),
				MCItemDef.create("mes_id", "mes_id"),
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("slf_support_cur_cd", "slf_support_cur_cd"),
				MCItemDef.create("slf_support_upri", "slf_support_upri"),
				MCItemDef.create("slf_support_tax_cd", "slf_support_tax_cd"),
				MCItemDef.create("slf_support_xrate_cd", "slf_support_xrate_cd"),
				MCItemDef.create("slf_support_xrate", "slf_support_xrate"),
				MCItemDef.create("vmi_interim_flg", "vmi_interim_flg"),
				MCItemDef.create("vmi_upri", "vmi_upri"),
				MCItemDef.create("base_unit_std_qty", "base_unit_std_qty"),
				MCItemDef.create("add_flg", "add_flg"),
				MCItemDef.create("old_ver_no", "old_ver_no"),
				MCItemDef.create("mes_flg", "mes_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_inpt_act_no", "ext_inpt_act_no"),
				MCItemDef.create("if_auto_reg_flg", "if_auto_reg_flg"),
				MCItemDef.create("ext_yield_act_no", "ext_yield_act_no"),
				MCItemDef.create("is_only_abort_flg", "is_only_abort_flg")
			}
			,
			MCBlockDef.create("MfgActReg_Upd01_DtlInpt")
		);
	}

	public static MCContainerDef MS_MSBCL6050_MfgActReg_Upd01_UP_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Upd01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("inpt_peg_no", "inpt_peg_no"),
				MCItemDef.create("fxd_loss_flg", "fxd_loss_flg"),
				MCItemDef.create("loss_act_no", "loss_act_no"),
				MCItemDef.create("loss_rsn_cd", "loss_rsn_cd"),
				MCItemDef.create("loss_qty", "loss_qty"),
				MCItemDef.create("cont_loss_qty", "cont_loss_qty"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("MfgActReg_Upd01_DtlLoss")
		);
	}

	public static MCContainerDef MS_MSBCL6050_MfgActReg_Upd01_UP_BLOCK4() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Upd01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("act_wk_cost", "act_wk_cost"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("st_tm", "st_tm"),
				MCItemDef.create("end_tm", "end_tm"),
				MCItemDef.create("brk_pd", "brk_pd"),
				MCItemDef.create("wk_day_cd", "wk_day_cd"),
				MCItemDef.create("wk_rsn_cd", "wk_rsn_cd"),
				MCItemDef.create("wk_usr_cd", "wk_usr_cd"),
				MCItemDef.create("wk_usr_dpt_cd", "wk_usr_dpt_cd"),
				MCItemDef.create("fclty", "fclty"),
				MCItemDef.create("wk_cost_calc_flg", "wk_cost_calc_flg"),
				MCItemDef.create("wk_cost_calc_upd_flg", "wk_cost_calc_upd_flg"),
				MCItemDef.create("wk_act_intr_rmrks", "wk_act_intr_rmrks"),
				MCItemDef.create("wk_act_sub_char1", "wk_act_sub_char1"),
				MCItemDef.create("wk_act_sub_char2", "wk_act_sub_char2"),
				MCItemDef.create("wk_act_sub_char3", "wk_act_sub_char3"),
				MCItemDef.create("wk_schd_no", "wk_schd_no"),
				MCItemDef.create("wk_act_no", "wk_act_no"),
				MCItemDef.create("mes_flg", "mes_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_wk_act_no", "ext_wk_act_no"),
				MCItemDef.create("ext_yield_act_no", "ext_yield_act_no")
			}
			,
			MCBlockDef.create("MfgActReg_Upd01_DtlWk")
		);
	}

	public static MCContainerDef MS_MSBCL6050_MfgActReg_Upd01_UP_BLOCK5() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Upd01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("yield_typ", "yield_typ"),
				MCItemDef.create("trd_unit_yield_act_qty", "trd_unit_yield_act_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("base_unit_yield_act_qty", "base_unit_yield_act_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("act_tm", "act_tm"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("same_lot_flg", "same_lot_flg"),
				MCItemDef.create("yield_rsn_cd", "yield_rsn_cd"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("yield_rate", "yield_rate"),
				MCItemDef.create("insp_cnt_rmrks", "insp_cnt_rmrks"),
				MCItemDef.create("yield_act_intr_rmrks", "yield_act_intr_rmrks"),
				MCItemDef.create("yield_act_rpt_rmrks", "yield_act_rpt_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("yield_act_sub_char1", "yield_act_sub_char1"),
				MCItemDef.create("yield_act_sub_char2", "yield_act_sub_char2"),
				MCItemDef.create("yield_act_sub_char3", "yield_act_sub_char3"),
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("yield_act_no", "yield_act_no"),
				MCItemDef.create("stk_lst_prnt_flg", "stk_lst_prnt_flg"),
				MCItemDef.create("mes_id", "mes_id"),
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("pack_flg", "pack_flg"),
				MCItemDef.create("sublot_ctl_flg", "sublot_ctl_flg"),
				MCItemDef.create("not_stk_flg", "not_stk_flg"),
				MCItemDef.create("old_lot_no", "old_lot_no"),
				MCItemDef.create("old_sublot_no", "old_sublot_no"),
				MCItemDef.create("old_yield_typ", "old_yield_typ"),
				MCItemDef.create("old_base_unit_yield_act_qty", "old_base_unit_yield_act_qty"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("mes_flg", "mes_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_yield_act_no", "ext_yield_act_no")
			}
			,
			MCBlockDef.create("MfgActReg_Upd01_DtlYield")
		);
	}

	public static MCContainerDef MS_MSBCL6050_MfgActReg_Upd01_UP_BLOCK6() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Upd01",
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
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("trd_unit_yield_act_qty", "trd_unit_yield_act_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("base_unit_yield_act_qty", "base_unit_yield_act_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("act_tm", "act_tm"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("same_lot_flg", "same_lot_flg"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("yield_rsn_cd", "yield_rsn_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("yield_rate", "yield_rate"),
				MCItemDef.create("yield_act_intr_rmrks", "yield_act_intr_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("yield_act_sub_char1", "yield_act_sub_char1"),
				MCItemDef.create("yield_act_sub_char2", "yield_act_sub_char2"),
				MCItemDef.create("yield_act_sub_char3", "yield_act_sub_char3"),
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("yield_act_no", "yield_act_no"),
				MCItemDef.create("stk_lst_prnt_flg", "stk_lst_prnt_flg"),
				MCItemDef.create("mes_id", "mes_id"),
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("pack_flg", "pack_flg"),
				MCItemDef.create("sublot_ctl_flg", "sublot_ctl_flg"),
				MCItemDef.create("old_lot_no", "old_lot_no"),
				MCItemDef.create("old_sublot_no", "old_sublot_no"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("mes_flg", "mes_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_yield_act_no", "ext_yield_act_no")
			}
			,
			MCBlockDef.create("MfgActReg_Upd01_DtlByProd")
		);
	}

	public static MCContainerDef MS_MSBCL6050_MfgActReg_Upd01_UP_BLOCK7() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Upd01",
			new MCItemDef[]{
				MCItemDef.create("not_io_act_srv_exec_flg", "not_io_act_srv_exec_flg")
			}
			,
			MCBlockDef.create("MfgActReg_Upd01_Ctrl")
		);
	}


	public static MCContainerDef MS_MSBCL6050_MfgActReg_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("mfg_sts_typ_nm", "mfg_sts_typ_nm"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("bkf_tgt_cnt", "bkf_tgt_cnt"),
				MCItemDef.create("bkf_success_cnt", "bkf_success_cnt"),
				MCItemDef.create("bkf_failure_cnt", "bkf_failure_cnt")
			}
			,
			MCBlockDef.create("MfgActReg_Upd01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBCL6050_MfgActReg_Upd01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Upd01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("oper_act_no", "oper_act_no"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("bkf_tgt_cnt", "bkf_tgt_cnt"),
				MCItemDef.create("bkf_success_cnt", "bkf_success_cnt"),
				MCItemDef.create("bkf_failure_cnt", "bkf_failure_cnt")
			}
			,
			MCBlockDef.create("MfgActReg_Upd01_DtlOper")
		);
	}
	public static MCContainerDef MS_MSBCL6050_MfgActReg_Upd01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Upd01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("inpt_act_no", "inpt_act_no")
			}
			,
			MCBlockDef.create("MfgActReg_Upd01_DtlInpt")
		);
	}
	public static MCContainerDef MS_MSBCL6050_MfgActReg_Upd01_DOWN_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Upd01",
			new MCItemDef[]{
				MCItemDef.create("inpt_peg_no", "inpt_peg_no"),
				MCItemDef.create("loss_act_no", "loss_act_no")
			}
			,
			MCBlockDef.create("MfgActReg_Upd01_DtlLoss")
		);
	}
	public static MCContainerDef MS_MSBCL6050_MfgActReg_Upd01_DOWN_BLOCK4() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Upd01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("wk_act_no", "wk_act_no")
			}
			,
			MCBlockDef.create("MfgActReg_Upd01_DtlWk")
		);
	}
	public static MCContainerDef MS_MSBCL6050_MfgActReg_Upd01_DOWN_BLOCK5() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Upd01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("yield_act_no", "yield_act_no")
			}
			,
			MCBlockDef.create("MfgActReg_Upd01_DtlYield")
		);
	}
	public static MCContainerDef MS_MSBCL6050_MfgActReg_Upd01_DOWN_BLOCK6() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Upd01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("yield_act_no", "yield_act_no")
			}
			,
			MCBlockDef.create("MfgActReg_Upd01_DtlByProd")
		);
	}
	
	static final MCOperationInfo MS_MSBCL6050_MfgActReg_Upd02_INFO = new MCOperationInfo("MS", "MSBCL6050", "MfgActReg_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6050_MfgActReg_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Upd02",
			new MCItemDef[]{
				MCItemDef.create("oper_unit_flg", "oper_unit_flg"),
				MCItemDef.create("act_immed_prnt_flg", "act_immed_prnt_flg"),
				MCItemDef.create("not_bkf_upd_flg", "not_bkf_upd_flg"),
				MCItemDef.create("not_wk_cost_upd_calc_flg", "not_wk_cost_upd_calc_flg"),
				MCItemDef.create("not_io_act_srv_exec_flg", "not_io_act_srv_exec_flg"),
				MCItemDef.create("is_src_batch_flg", "is_src_batch_flg"),
				MCItemDef.create("upd_cntr_chk_flg", "upd_cntr_chk_flg"),
				MCItemDef.create("not_commit_flg", "not_commit_flg"),
				MCItemDef.create("is_oper_act_cmpl_batch_flg", "is_oper_act_cmpl_batch_flg")
			}
			,
			MCBlockDef.create("MfgActReg_Upd02_Ctrl")
		);
	}

	public static MCContainerDef MS_MSBCL6050_MfgActReg_Upd02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Upd02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("st_act_tm", "st_act_tm"),
				MCItemDef.create("st_ac_dt", "st_ac_dt"),
				MCItemDef.create("end_act_tm", "end_act_tm"),
				MCItemDef.create("end_ac_dt", "end_ac_dt"),
				MCItemDef.create("base_unit_st_act_qty", "base_unit_st_act_qty"),
				MCItemDef.create("rem_abort_flg", "rem_abort_flg"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("mfg_act_rpt_rmrks", "mfg_act_rpt_rmrks"),
				MCItemDef.create("mfg_act_intr_rmrks", "mfg_act_intr_rmrks"),
				MCItemDef.create("mfg_act_sub_char1", "mfg_act_sub_char1"),
				MCItemDef.create("mfg_act_sub_char2", "mfg_act_sub_char2"),
				MCItemDef.create("mfg_act_sub_char3", "mfg_act_sub_char3"),
				MCItemDef.create("itm_yield", "itm_yield"),
				MCItemDef.create("oper_unit_act_qty", "oper_unit_act_qty"),
				MCItemDef.create("oper_act_intr_rmrks", "oper_act_intr_rmrks"),
				MCItemDef.create("oper_act_rpt_rmrks", "oper_act_rpt_rmrks"),
				MCItemDef.create("oper_act_sub_char1", "oper_act_sub_char1"),
				MCItemDef.create("oper_act_sub_char2", "oper_act_sub_char2"),
				MCItemDef.create("oper_act_sub_char3", "oper_act_sub_char3"),
				MCItemDef.create("oper_yield", "oper_yield"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("oper_act_no", "oper_act_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("mfg_inst_upd_cntr", "mfg_inst_upd_cntr"),
				MCItemDef.create("mfg_inst_pr_upd_cntr", "mfg_inst_pr_upd_cntr"),
				MCItemDef.create("mfg_act_upd_cntr", "mfg_act_upd_cntr"),
				MCItemDef.create("not_cmpl_flg", "not_cmpl_flg"),
				MCItemDef.create("mes_flg", "mes_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_oper_act_no", "ext_oper_act_no"),
				MCItemDef.create("if_auto_reg_flg", "if_auto_reg_flg")
			}
			,
			MCBlockDef.create("MfgActReg_Upd02_Hdr1")
		);
	}

	public static MCContainerDef MS_MSBCL6050_MfgActReg_Upd02_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Upd02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("st_act_tm", "st_act_tm"),
				MCItemDef.create("st_ac_dt", "st_ac_dt"),
				MCItemDef.create("end_act_tm", "end_act_tm"),
				MCItemDef.create("end_ac_dt", "end_ac_dt"),
				MCItemDef.create("base_unit_st_act_qty", "base_unit_st_act_qty"),
				MCItemDef.create("rem_abort_flg", "rem_abort_flg"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("mfg_act_rpt_rmrks", "mfg_act_rpt_rmrks"),
				MCItemDef.create("mfg_act_intr_rmrks", "mfg_act_intr_rmrks"),
				MCItemDef.create("mfg_act_sub_char1", "mfg_act_sub_char1"),
				MCItemDef.create("mfg_act_sub_char2", "mfg_act_sub_char2"),
				MCItemDef.create("mfg_act_sub_char3", "mfg_act_sub_char3"),
				MCItemDef.create("itm_yield", "itm_yield"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("mfg_inst_upd_cntr", "mfg_inst_upd_cntr"),
				MCItemDef.create("mfg_inst_pr_upd_cntr", "mfg_inst_pr_upd_cntr"),
				MCItemDef.create("mfg_act_upd_cntr", "mfg_act_upd_cntr"),
				MCItemDef.create("not_cmpl_flg", "not_cmpl_flg"),
				MCItemDef.create("mes_flg", "mes_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_oper_act_no", "ext_oper_act_no"),
				MCItemDef.create("if_auto_reg_flg", "if_auto_reg_flg")
			}
			,
			MCBlockDef.create("MfgActReg_Upd02_Hdr2")
		);
	}

	public static MCContainerDef MS_MSBCL6050_MfgActReg_Upd02_UP_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Upd02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("yield_typ", "yield_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_yield_act_qty", "trd_unit_yield_act_qty"),
				MCItemDef.create("act_tm", "act_tm"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("same_lot_flg", "same_lot_flg"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("yield_rsn_cd", "yield_rsn_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("yield_rate", "yield_rate"),
				MCItemDef.create("insp_cnt_rmrks", "insp_cnt_rmrks"),
				MCItemDef.create("yield_act_intr_rmrks", "yield_act_intr_rmrks"),
				MCItemDef.create("yield_act_rpt_rmrks", "yield_act_rpt_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("yield_act_sub_char1", "yield_act_sub_char1"),
				MCItemDef.create("yield_act_sub_char2", "yield_act_sub_char2"),
				MCItemDef.create("yield_act_sub_char3", "yield_act_sub_char3"),
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("yield_act_no", "yield_act_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("oper_act_no", "oper_act_no"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("mes_flg", "mes_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_yield_act_no", "ext_yield_act_no"),
				MCItemDef.create("all_oper_act_reg_flg", "all_oper_act_reg_flg")
			}
			,
			MCBlockDef.create("MfgActReg_Upd02_DtlYieldByProd")
		);
	}


	public static MCContainerDef MS_MSBCL6050_MfgActReg_Upd02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Upd02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("mfg_sts_typ_nm", "mfg_sts_typ_nm"),
				MCItemDef.create("oper_act_no", "oper_act_no"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("bkf_tgt_cnt", "bkf_tgt_cnt"),
				MCItemDef.create("bkf_success_cnt", "bkf_success_cnt"),
				MCItemDef.create("bkf_failure_cnt", "bkf_failure_cnt")
			}
			,
			MCBlockDef.create("MfgActReg_Upd02_Hdr1")
		);
	}
	public static MCContainerDef MS_MSBCL6050_MfgActReg_Upd02_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Upd02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("mfg_sts_typ_nm", "mfg_sts_typ_nm"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("bkf_tgt_cnt", "bkf_tgt_cnt"),
				MCItemDef.create("bkf_success_cnt", "bkf_success_cnt"),
				MCItemDef.create("bkf_failure_cnt", "bkf_failure_cnt")
			}
			,
			MCBlockDef.create("MfgActReg_Upd02_Hdr2")
		);
	}
	public static MCContainerDef MS_MSBCL6050_MfgActReg_Upd02_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Upd02",
			new MCItemDef[]{
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("yield_act_no", "yield_act_no")
			}
			,
			MCBlockDef.create("MfgActReg_Upd02_DtlYieldByProd")
		);
	}
	
	static final MCOperationInfo MS_MSBCL6050_MfgActReg_Upd03_INFO = new MCOperationInfo("MS", "MSBCL6050", "MfgActReg_Upd03", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6050_MfgActReg_Upd03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Upd03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("inst_wk_act_flg", "inst_wk_act_flg"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("wk_cost_nm", "wk_cost_nm"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("old_ac_dt", "old_ac_dt"),
				MCItemDef.create("st_tm", "st_tm"),
				MCItemDef.create("end_tm", "end_tm"),
				MCItemDef.create("brk_pd", "brk_pd"),
				MCItemDef.create("act_wk_cost", "act_wk_cost"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("wk_cost_unit_nm", "wk_cost_unit_nm"),
				MCItemDef.create("wk_cost_dec_place", "wk_cost_dec_place"),
				MCItemDef.create("wk_cost_rnd_typ", "wk_cost_rnd_typ"),
				MCItemDef.create("wk_day_cd", "wk_day_cd"),
				MCItemDef.create("wk_day_nm", "wk_day_nm"),
				MCItemDef.create("wk_rsn_cd", "wk_rsn_cd"),
				MCItemDef.create("wk_rsn_nm", "wk_rsn_nm"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("str_ln_tgt_flg", "str_ln_tgt_flg"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_nm", "str_ln_nm"),
				MCItemDef.create("str_ln_cd_none_flg", "str_ln_cd_none_flg"),
				MCItemDef.create("wk_usr_cd", "wk_usr_cd"),
				MCItemDef.create("wk_usr_nm", "wk_usr_nm"),
				MCItemDef.create("wk_usr_dpt_cd", "wk_usr_dpt_cd"),
				MCItemDef.create("wk_usr_dpt_nm", "wk_usr_dpt_nm"),
				MCItemDef.create("fclty", "fclty"),
				MCItemDef.create("wk_cost_calc_ctl_flg", "wk_cost_calc_ctl_flg"),
				MCItemDef.create("act_intr_rmrks", "act_intr_rmrks"),
				MCItemDef.create("act_sub_char1", "act_sub_char1"),
				MCItemDef.create("act_sub_char2", "act_sub_char2"),
				MCItemDef.create("act_sub_char3", "act_sub_char3"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("wk_schd_no", "wk_schd_no"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("oper_act_no", "oper_act_no"),
				MCItemDef.create("wk_act_no", "wk_act_no"),
				MCItemDef.create("dpt_wg_cd", "dpt_wg_cd"),
				MCItemDef.create("dpt_wg_nm", "dpt_wg_nm"),
				MCItemDef.create("loc_wg_cd", "loc_wg_cd"),
				MCItemDef.create("loc_wg_nm", "loc_wg_nm"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("mfg_inst_upd_cntr", "mfg_inst_upd_cntr"),
				MCItemDef.create("wk_act_upd_cntr", "wk_act_upd_cntr"),
				MCItemDef.create("mes_flg", "mes_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_wk_act_no", "ext_wk_act_no")
			}
			,
			MCBlockDef.create("MfgActReg_Upd03_Rslt")
		);
	}

	public static MCContainerDef MS_MSBCL6050_MfgActReg_Upd03_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Upd03",
			new MCItemDef[]{
				MCItemDef.create("not_commit_flg", "not_commit_flg")
			}
			,
			MCBlockDef.create("MfgActReg_Upd03_Ctrl")
		);
	}


	public static MCContainerDef MS_MSBCL6050_MfgActReg_Upd03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Upd03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("act_wk_cost", "act_wk_cost"),
				MCItemDef.create("wk_act_no", "wk_act_no"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("MfgActReg_Upd03_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBCL6050_MfgActReg_Upd04_INFO = new MCOperationInfo("MS", "MSBCL6050", "MfgActReg_Upd04", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6050_MfgActReg_Upd04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Upd04",
			new MCItemDef[]{
				MCItemDef.create("is_src_batch_flg", "is_src_batch_flg"),
				MCItemDef.create("upd_cntr_chk_flg", "upd_cntr_chk_flg"),
				MCItemDef.create("not_commit_flg", "not_commit_flg"),
				MCItemDef.create("not_wk_cost_upd_calc_flg", "not_wk_cost_upd_calc_flg")
			}
			,
			MCBlockDef.create("MfgActReg_Upd04_Ctrl")
		);
	}

	public static MCContainerDef MS_MSBCL6050_MfgActReg_Upd04_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Upd04",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("oper_act_no", "oper_act_no")
			}
			,
			MCBlockDef.create("MfgActReg_Upd04_DtlOper")
		);
	}


	public static MCContainerDef MS_MSBCL6050_MfgActReg_Upd04_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Upd04",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("MfgActReg_Upd04_DtlOper")
		);
	}
	
	static final MCOperationInfo MS_MSBCL6050_MfgActReg_Del01_INFO = new MCOperationInfo("MS", "MSBCL6050", "MfgActReg_Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6050_MfgActReg_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Del01",
			new MCItemDef[]{
				MCItemDef.create("lst_del_flg", "lst_del_flg"),
				MCItemDef.create("upd_cntr_chk_flg", "upd_cntr_chk_flg"),
				MCItemDef.create("is_src_batch_flg", "is_src_batch_flg"),
				MCItemDef.create("not_commit_flg", "not_commit_flg")
			}
			,
			MCBlockDef.create("MfgActReg_Del01_Ctrl")
		);
	}

	public static MCContainerDef MS_MSBCL6050_MfgActReg_Del01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Del01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("mfg_inst_upd_cntr", "mfg_inst_upd_cntr"),
				MCItemDef.create("mfg_inst_pr_upd_cntr", "mfg_inst_pr_upd_cntr"),
				MCItemDef.create("mfg_act_upd_cntr", "mfg_act_upd_cntr"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("div_seq", "div_seq")
			}
			,
			MCBlockDef.create("MfgActReg_Del01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBCL6050_MfgActReg_Del01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Del01",
			new MCItemDef[]{
				MCItemDef.create("inpt_act_no", "inpt_act_no"),
				MCItemDef.create("can_ac_dt", "can_ac_dt")
			}
			,
			MCBlockDef.create("MfgActReg_Del01_DtlInpt")
		);
	}

	public static MCContainerDef MS_MSBCL6050_MfgActReg_Del01_UP_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Del01",
			new MCItemDef[]{
				MCItemDef.create("yield_act_no", "yield_act_no"),
				MCItemDef.create("can_ac_dt", "can_ac_dt")
			}
			,
			MCBlockDef.create("MfgActReg_Del01_DtlYield")
		);
	}

	public static MCContainerDef MS_MSBCL6050_MfgActReg_Del01_UP_BLOCK4() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Del01",
			new MCItemDef[]{
				MCItemDef.create("yield_act_no", "yield_act_no"),
				MCItemDef.create("can_ac_dt", "can_ac_dt")
			}
			,
			MCBlockDef.create("MfgActReg_Del01_DtlByProd")
		);
	}


	public static MCContainerDef MS_MSBCL6050_MfgActReg_Del01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Del01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("MfgActReg_Del01_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBCL6050_MfgActReg_Del02_INFO = new MCOperationInfo("MS", "MSBCL6050", "MfgActReg_Del02", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6050_MfgActReg_Del02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Del02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("inst_wk_act_flg", "inst_wk_act_flg"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("old_ac_dt", "old_ac_dt"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("wk_schd_no", "wk_schd_no"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("oper_act_no", "oper_act_no"),
				MCItemDef.create("wk_act_no", "wk_act_no"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("mfg_inst_upd_cntr", "mfg_inst_upd_cntr"),
				MCItemDef.create("wk_act_upd_cntr", "wk_act_upd_cntr")
			}
			,
			MCBlockDef.create("MfgActReg_Del02_Rslt")
		);
	}

	public static MCContainerDef MS_MSBCL6050_MfgActReg_Del02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Del02",
			new MCItemDef[]{
				MCItemDef.create("not_commit_flg", "not_commit_flg")
			}
			,
			MCBlockDef.create("MfgActReg_Del02_Ctrl")
		);
	}


	public static MCContainerDef MS_MSBCL6050_MfgActReg_Del02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6050", "MfgActReg_Del02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("wk_act_no", "wk_act_no"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("MfgActReg_Del02_Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

