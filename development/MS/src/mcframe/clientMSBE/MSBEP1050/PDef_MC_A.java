package mcframe.clientMSBE.MSBEP1050;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MSBEP_XfrListReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBEL1050.Srch01.UP.BLOCK0")){
			return MS_MSBEL1050_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1050.Srch01.DOWN.BLOCK0")){
			return MS_MSBEL1050_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1050.Srch02.UP.BLOCK0")){
			return MS_MSBEL1050_Srch02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1050.Srch02.DOWN.BLOCK0")){
			return MS_MSBEL1050_Srch02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1050.Srch03.UP.BLOCK0")){
			return MS_MSBEL1050_Srch03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1050.Srch03.DOWN.BLOCK0")){
			return MS_MSBEL1050_Srch03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1050.Srch04.UP.BLOCK0")){
			return MS_MSBEL1050_Srch04_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1050.Srch04.DOWN.BLOCK0")){
			return MS_MSBEL1050_Srch04_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1050.Srch05.UP.BLOCK0")){
			return MS_MSBEL1050_Srch05_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1050.Srch05.DOWN.BLOCK0")){
			return MS_MSBEL1050_Srch05_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1050.Srch06.UP.BLOCK0")){
			return MS_MSBEL1050_Srch06_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1050.Srch06.DOWN.BLOCK0")){
			return MS_MSBEL1050_Srch06_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1050.Ins01.UP.BLOCK0")){
			return MS_MSBEL1050_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1050.Ins01.UP.BLOCK1")){
			return MS_MSBEL1050_Ins01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1050.Ins01.DOWN.BLOCK0")){
			return MS_MSBEL1050_Ins01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1050.Ins02.UP.BLOCK0")){
			return MS_MSBEL1050_Ins02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1050.Ins02.UP.BLOCK1")){
			return MS_MSBEL1050_Ins02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1050.Ins02.DOWN.BLOCK0")){
			return MS_MSBEL1050_Ins02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1050.Upd01.UP.BLOCK0")){
			return MS_MSBEL1050_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1050.Upd01.DOWN.BLOCK0")){
			return MS_MSBEL1050_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1050.Del01.UP.BLOCK0")){
			return MS_MSBEL1050_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1050.Del01.UP.BLOCK1")){
			return MS_MSBEL1050_Del01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1050.Del01.DOWN.BLOCK0")){
			return MS_MSBEL1050_Del01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1050.Del02.UP.BLOCK0")){
			return MS_MSBEL1050_Del02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1050.Del02.UP.BLOCK1")){
			return MS_MSBEL1050_Del02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1050.Del02.DOWN.BLOCK0")){
			return MS_MSBEL1050_Del02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1050.Alc01.UP.BLOCK0")){
			return MS_MSBEL1050_Alc01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1050.Alc01.DOWN.BLOCK0")){
			return MS_MSBEL1050_Alc01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1050.Alc02.UP.BLOCK0")){
			return MS_MSBEL1050_Alc02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1050.Alc02.DOWN.BLOCK0")){
			return MS_MSBEL1050_Alc02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1050.Prnt01.UP.BLOCK0")){
			return MS_MSBEL1050_Prnt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1050.Prnt01.UP.BLOCK1")){
			return MS_MSBEL1050_Prnt01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1050.Prnt01.DOWN.BLOCK0")){
			return MS_MSBEL1050_Prnt01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1050.Prnt02.UP.BLOCK0")){
			return MS_MSBEL1050_Prnt02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1050.Prnt02.UP.BLOCK1")){
			return MS_MSBEL1050_Prnt02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1050.Prnt02.DOWN.BLOCK0")){
			return MS_MSBEL1050_Prnt02_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
															
	
	static final MCOperationInfo MS_MSBEL1050_Srch01_INFO = new MCOperationInfo("MS", "MSBEL1050", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1050_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1050", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ope", "ope"),
				MCItemDef.create("tgt", "tgt"),
				MCItemDef.create("md", "mode"),
				MCItemDef.create("not_inst_flg", "not_inst_flg"),
				MCItemDef.create("inst_flg", "inst_flg"),
				MCItemDef.create("p_xfr_flg", "p_xfr_flg"),
				MCItemDef.create("sts_cmpl_flg", "sts_cmpl_flg"),
				MCItemDef.create("not_alloc_flg", "not_alloc_flg"),
				MCItemDef.create("alloc_flg", "alloc_flg"),
				MCItemDef.create("schd_not_cmpl_flg", "schd_not_cmpl_flg"),
				MCItemDef.create("schd_cmpl_flg", "schd_cmpl_flg"),
				MCItemDef.create("pick_not_prnt_flg", "pick_not_prnt_flg"),
				MCItemDef.create("pick_prnt_flg", "pick_prnt_flg"),
				MCItemDef.create("inst_not_prnt_flg", "inst_not_prnt_flg"),
				MCItemDef.create("inst_prnt_flg", "inst_prnt_flg"),
				MCItemDef.create("dlv_not_prnt_flg", "dlv_not_prnt_flg"),
				MCItemDef.create("dlv_prnt_flg", "dlv_prnt_flg"),
				MCItemDef.create("wms_flg", "wms_flg"),
				MCItemDef.create("not_wms_flg", "not_wms_flg"),
				MCItemDef.create("xfr_schd_dt_fr", "xfr_schd_dt_fr"),
				MCItemDef.create("xfr_schd_dt_to", "xfr_schd_dt_to"),
				MCItemDef.create("xfr_inst_dt_fr", "xfr_inst_dt_fr"),
				MCItemDef.create("xfr_inst_dt_to", "xfr_inst_dt_to"),
				MCItemDef.create("xfr_act_dt_fr", "xfr_act_dt_fr"),
				MCItemDef.create("xfr_act_dt_to", "xfr_act_dt_to"),
				MCItemDef.create("xfr_ac_dt_fr", "xfr_ac_dt_fr"),
				MCItemDef.create("xfr_ac_dt_to", "xfr_ac_dt_to"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("gi_loc_nm", "gi_loc_nm"),
				MCItemDef.create("gi_str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("gi_str_ln_nm", "gi_str_ln_nm"),
				MCItemDef.create("gi_site_cd", "gi_site_cd"),
				MCItemDef.create("gi_site_nm", "gi_site_nm"),
				MCItemDef.create("gi_stk_arrv_bp_cd", "gi_stk_arrv_bp_cd"),
				MCItemDef.create("gi_stk_arrv_bp_nm", "gi_stk_arrv_bp_nm"),
				MCItemDef.create("gr_loc_cd", "gr_loc_cd"),
				MCItemDef.create("gr_loc_nm", "gr_loc_nm"),
				MCItemDef.create("gr_str_ln_cd", "gr_str_ln_cd"),
				MCItemDef.create("gr_str_ln_nm", "gr_str_ln_nm"),
				MCItemDef.create("gr_site_cd", "gr_site_cd"),
				MCItemDef.create("gr_site_nm", "gr_site_nm"),
				MCItemDef.create("gr_stk_arrv_bp_cd", "gr_stk_arrv_bp_cd"),
				MCItemDef.create("gr_stk_arrv_bp_nm", "gr_stk_arrv_bp_nm"),
				MCItemDef.create("itm_typ_p" + ".itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_p" + ".itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_p" + ".itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("ver_no_p" + ".ver_no", "ver_no"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno_p" + ".sno1", "sno1"),
				MCItemDef.create("sno_p" + ".sno2", "sno2"),
				MCItemDef.create("sno_p" + ".sno3", "sno3"),
				MCItemDef.create("sno_p" + ".sno4", "sno4"),
				MCItemDef.create("sno_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("sno_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("pckg_unit_cd", "pckg_unit_cd"),
				MCItemDef.create("pckg_unit_nm", "pckg_unit_nm"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_bp_nm", "stk_bp_nm"),
				MCItemDef.create("rqst_usr_cd", "rqst_usr_cd"),
				MCItemDef.create("rqst_usr_nm", "rqst_usr_nm"),
				MCItemDef.create("rqst_dpt_cd", "rqst_dpt_cd"),
				MCItemDef.create("rqst_dpt_nm", "rqst_dpt_nm"),
				MCItemDef.create("inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("inst_usr_nm", "inst_usr_nm"),
				MCItemDef.create("inst_dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("inst_dpt_nm", "inst_dpt_nm"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("act_usr_nm", "act_usr_nm"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_dpt_nm", "act_dpt_nm"),
				MCItemDef.create("ship_inst_typ", "ship_inst_typ"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("rsn_nm", "rsn_nm"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_dpt_nm", "bd_dpt_nm"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("rqst_mod_flg", "rqst_mod_flg"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("inst_rmrks", "inst_rmrks"),
				MCItemDef.create("h_sub_char1", "h_sub_char1"),
				MCItemDef.create("h_sub_char2", "h_sub_char2"),
				MCItemDef.create("h_sub_char3", "h_sub_char3"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("inst_d_rmrks", "inst_d_rmrks"),
				MCItemDef.create("d_sub_char1", "d_sub_char1"),
				MCItemDef.create("d_sub_char2", "d_sub_char2"),
				MCItemDef.create("d_sub_char3", "d_sub_char3"),
				MCItemDef.create("rqst_cnt_rmrks", "rqst_cnt_rmrks"),
				MCItemDef.create("ship_cnt_rmrks", "ship_cnt_rmrks"),
				MCItemDef.create("schd_intr_rmrks", "schd_intr_rmrks"),
				MCItemDef.create("xfr_src_typ", "xfr_src_typ"),
				MCItemDef.create("xfr_src_no", "xfr_src_no"),
				MCItemDef.create("xfr_schd_no", "xfr_schd_no"),
				MCItemDef.create("xfr_alloc_sts_no", "xfr_alloc_sts_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("xfr_inst_no", "xfr_inst_no"),
				MCItemDef.create("xfr_inst_d_no", "xfr_inst_d_no"),
				MCItemDef.create("xfr_act_no", "xfr_act_no"),
				MCItemDef.create("xfr_act_d_no", "xfr_act_d_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg1", "itm_grp_flg1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd1", "itm_grp_cd1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm1", "itm_grp_nm1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg2", "itm_grp_flg2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd2", "itm_grp_cd2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm2", "itm_grp_nm2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg3", "itm_grp_flg3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd3", "itm_grp_cd3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm3", "itm_grp_nm3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg4", "itm_grp_flg4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd4", "itm_grp_cd4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm4", "itm_grp_nm4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg5", "itm_grp_flg5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd5", "itm_grp_cd5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm5", "itm_grp_nm5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg6", "itm_grp_flg6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd6", "itm_grp_cd6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm6", "itm_grp_nm6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg7", "itm_grp_flg7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd7", "itm_grp_cd7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm7", "itm_grp_nm7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg8", "itm_grp_flg8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd8", "itm_grp_cd8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm8", "itm_grp_nm8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg9", "itm_grp_flg9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd9", "itm_grp_cd9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm9", "itm_grp_nm9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg10", "itm_grp_flg10"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd10", "itm_grp_cd10"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm10", "itm_grp_nm10")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL1050_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1050", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("pr_sts_typ", "pr_sts_typ"),
				MCItemDef.create("pr_sts_typ_nm", "pr_sts_typ_nm"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("not_lot_mix_flg", "not_lot_mix_flg"),
				MCItemDef.create("not_sublot_mix_flg", "not_sublot_mix_flg"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1_null_flg + "", "sno1_null_flg"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2_null_flg + "", "sno2_null_flg"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3_null_flg + "", "sno3_null_flg"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4_null_flg + "", "sno4_null_flg"),
				MCItemDef.create("sno_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("sno_p" + ".wrk_nm", "wkk_nm"),
				MCItemDef.create("alloc_sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "alloc_sno1"),
				MCItemDef.create("alloc_sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "alloc_sno2"),
				MCItemDef.create("alloc_sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "alloc_sno3"),
				MCItemDef.create("alloc_sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "alloc_sno4"),
				MCItemDef.create("def_ver_flg", "def_ver_flg"),
				MCItemDef.create("ver_no_p" + ".ver_no", "ver_no"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("fix_flg", "fix_flg"),
				MCItemDef.create("cmpl_flg", "cmpl_flg"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_rnd_typ", "trd_unit_rnd_typ"),
				MCItemDef.create("qty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("base_unit_qty_p" + ".qty", "base_unit_qty"),
				MCItemDef.create("schd_qty_p" + ".qty", "base_unit_schd_qty"),
				MCItemDef.create("inst_qty_p" + ".qty", "base_unit_inst_qty"),
				MCItemDef.create("act_qty_p" + ".qty", "base_unit_act_qty"),
				MCItemDef.create("pckg_unit_cd", "pckg_unit_cd"),
				MCItemDef.create("pckg_unit_nm", "pckg_unit_nm"),
				MCItemDef.create("pckg_unit_conv_base_qty", "pckg_unit_conv_base_qty"),
				MCItemDef.create("pckg_unit_conv_qty", "pckg_unit_conv_qty"),
				MCItemDef.create("pckg_unit_dec_place", "pckg_unit_dec_place"),
				MCItemDef.create("pckg_qty_p" + ".qty", "pckg_unit_qty"),
				MCItemDef.create("schd_unit_cd", "schd_unit_cd"),
				MCItemDef.create("schd_unit_nm", "schd_unit_nm"),
				MCItemDef.create("schd_unit_dec_place", "schd_unit_dec_place"),
				MCItemDef.create("xfr_schd_qty_p" + ".qty", "schd_qty"),
				MCItemDef.create("act_fctr_p" + ".act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("act_cont_p" + ".cont_qty", "act_cont_qty"),
				MCItemDef.create("std_fctr_p" + ".std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("std_cont_p" + ".cont_qty", "std_cont_qty"),
				MCItemDef.create("cont_unit_p" + ".cont_fctr_unit_cd", "cont_fctr_unit_cd"),
				MCItemDef.create("cont_unit_p" + ".cont_fctr_unit_nm", "cont_fctr_unit_nm"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("cont_fctr_rnd_typ", "cont_fctr_rnd_typ"),
				MCItemDef.create("cont_fctr_dec_place", "cont_fctr_dec_place"),
				MCItemDef.create("xfr_rqst_dt", "xfr_rqst_dt"),
				MCItemDef.create("xfr_schd_dt", "xfr_schd_dt"),
				MCItemDef.create("xfr_inst_dt", "xfr_inst_dt"),
				MCItemDef.create("xfr_act_dt", "xfr_act_dt"),
				MCItemDef.create("xfr_ac_dt", "xfr_ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("gi_loc_nm", "gi_loc_nm"),
				MCItemDef.create("gi_str_ln_tgt_flg", "gi_str_ln_tgt_flg"),
				MCItemDef.create("gi_str_ln_p" + ".str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("gi_str_ln_p" + ".str_ln_nm", "gi_str_ln_nm"),
				MCItemDef.create("gi_str_ln_p" + ".str_ln_cd_none_flg", "gi_str_ln_cd_none_flg"),
				MCItemDef.create("gi_sppl_cd", "gi_sppl_cd"),
				MCItemDef.create("gi_sppl_nm", "gi_sppl_nm"),
				MCItemDef.create("gi_onr_prsppl_flg", "gi_onr_prsppl_flg"),
				MCItemDef.create("gi_prov_basis_typ", "gi_prov_basis_typ"),
				MCItemDef.create("gi_stk_arrv_bp_cd", "gi_stk_arrv_bp_cd"),
				MCItemDef.create("gi_stk_arrv_bp_nm", "gi_stk_arrv_bp_nm"),
				MCItemDef.create("gi_site_cd", "gi_site_cd"),
				MCItemDef.create("gi_site_nm", "gi_site_nm"),
				MCItemDef.create("gr_loc_cd", "gr_loc_cd"),
				MCItemDef.create("gr_loc_nm", "gr_loc_nm"),
				MCItemDef.create("gr_str_ln_tgt_flg", "gr_str_ln_tgt_flg"),
				MCItemDef.create("gr_str_ln_p" + ".str_ln_cd", "gr_str_ln_cd"),
				MCItemDef.create("gr_str_ln_p" + ".str_ln_nm", "gr_str_ln_nm"),
				MCItemDef.create("gr_str_ln_p" + ".str_ln_cd_none_flg", "gr_str_ln_cd_none_flg"),
				MCItemDef.create("gr_sppl_cd", "gr_sppl_cd"),
				MCItemDef.create("gr_sppl_nm", "gr_sppl_nm"),
				MCItemDef.create("gr_stk_arrv_bp_cd", "gr_stk_arrv_bp_cd"),
				MCItemDef.create("gr_stk_arrv_bp_nm", "gr_stk_arrv_bp_nm"),
				MCItemDef.create("gr_site_cd", "gr_site_cd"),
				MCItemDef.create("gr_site_nm", "gr_site_nm"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("quality_typ_nm", "quality_typ_nm"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_insp_typ_nm", "stk_insp_typ_nm"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_id_typ_nm", "stk_id_typ_nm"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_bp_nm", "stk_bp_nm"),
				MCItemDef.create("rqst_usr_cd", "rqst_usr_cd"),
				MCItemDef.create("rqst_usr_nm", "rqst_usr_nm"),
				MCItemDef.create("rqst_dpt_cd", "rqst_dpt_cd"),
				MCItemDef.create("rqst_dpt_nm", "rqst_dpt_nm"),
				MCItemDef.create("inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("inst_usr_nm", "inst_usr_nm"),
				MCItemDef.create("inst_dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("inst_dpt_nm", "inst_dpt_nm"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("act_usr_nm", "act_usr_nm"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_dpt_nm", "act_dpt_nm"),
				MCItemDef.create("ship_inst_typ", "ship_inst_typ"),
				MCItemDef.create("ship_inst_typ_nm", "ship_inst_typ_nm"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("rsn_nm", "rsn_nm"),
				MCItemDef.create("acxfr_gi_flg", "acxfr_gi_flg"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_dpt_nm", "bd_dpt_nm"),
				MCItemDef.create("immd_pick_prnt_flg", "immd_pick_prnt_flg"),
				MCItemDef.create("immd_inst_prnt_flg", "immd_inst_prnt_flg"),
				MCItemDef.create("immd_dlv_prnt_flg", "immd_dlv_prnt_flg"),
				MCItemDef.create("pick_prnt_flg", "pick_prnt_flg"),
				MCItemDef.create("inst_prnt_flg", "inst_prnt_flg"),
				MCItemDef.create("dlv_prnt_flg", "dlv_prnt_flg"),
				MCItemDef.create("alloc_flg", "alloc_flg"),
				MCItemDef.create("skip_chk_ship_flg", "skip_chk_ship_flg"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("inst_rmrks", "inst_rmrks"),
				MCItemDef.create("h_sub_char1", "h_sub_char1"),
				MCItemDef.create("h_sub_char2", "h_sub_char2"),
				MCItemDef.create("h_sub_char3", "h_sub_char3"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("inst_d_rmrks", "inst_d_rmrks"),
				MCItemDef.create("d_sub_char1", "d_sub_char1"),
				MCItemDef.create("d_sub_char2", "d_sub_char2"),
				MCItemDef.create("d_sub_char3", "d_sub_char3"),
				MCItemDef.create("rqst_cnt_rmrks", "rqst_cnt_rmrks"),
				MCItemDef.create("ship_cnt_rmrks", "ship_cnt_rmrks"),
				MCItemDef.create("schd_intr_rmrks", "schd_intr_rmrks"),
				MCItemDef.create("xfr_src_typ", "xfr_src_typ"),
				MCItemDef.create("xfr_src_typ_nm", "xfr_src_typ_nm"),
				MCItemDef.create("xfr_src_no", "xfr_src_no"),
				MCItemDef.create("xfr_schd_no", "xfr_schd_no"),
				MCItemDef.create("xfr_alloc_sts_no", "xfr_alloc_sts_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("xfr_inst_no", "xfr_inst_no"),
				MCItemDef.create("xfr_inst_d_no", "xfr_inst_d_no"),
				MCItemDef.create("xfr_act_no", "xfr_act_no"),
				MCItemDef.create("xfr_act_d_no", "xfr_act_d_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("prov_typ_nm", "prov_typ_nm"),
				MCItemDef.create("prov_basis_typ", "prov_basis_typ"),
				MCItemDef.create("prov_basis_typ_nm", "prov_basis_typ_nm"),
				MCItemDef.create("ret_prov_typ", "ret_prov_typ"),
				MCItemDef.create("ret_prov_typ_nm", "ret_prov_typ_nm"),
				MCItemDef.create("ret_prov_basis_typ", "ret_prov_basis_typ"),
				MCItemDef.create("ret_prov_basis_typ_nm", "ret_prov_basis_typ_nm"),
				MCItemDef.create("prov_schd_no", "prov_schd_no"),
				MCItemDef.create("ret_prov_schd_no", "ret_prov_schd_no"),
				MCItemDef.create("base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("base_ac_dt", "base_ac_dt"),
				MCItemDef.create("wms_flg", "wms_flg"),
				MCItemDef.create("wms_tgt_flg", "wms_tgt_flg"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd1", "itm_grp_cd1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm1", "itm_grp_nm1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd2", "itm_grp_cd2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm2", "itm_grp_nm2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd3", "itm_grp_cd3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm3", "itm_grp_nm3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd4", "itm_grp_cd4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm4", "itm_grp_nm4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd5", "itm_grp_cd5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm5", "itm_grp_nm5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd6", "itm_grp_cd6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm6", "itm_grp_nm6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd7", "itm_grp_cd7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm7", "itm_grp_nm7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd8", "itm_grp_cd8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm8", "itm_grp_nm8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd9", "itm_grp_cd9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm9", "itm_grp_nm9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd10", "itm_grp_cd10"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm10", "itm_grp_nm10"),
				MCItemDef.create("pack_disable_flg", "pack_disable_flg"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("alloc_sts_upd_cntr", "alloc_sts_upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1050_Srch02_INFO = new MCOperationInfo("MS", "MSBEL1050", "Srch02", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1050_Srch02_UP_BLOCK0() {
		/** Ope.のBlock [Srch02_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1050", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("ope", "ope"),
				MCItemDef.create("tgt", "tgt"),
				MCItemDef.create("md", "mode"),
				MCItemDef.create("not_inst_flg", "not_inst_flg"),
				MCItemDef.create("inst_flg", "inst_flg"),
				MCItemDef.create("p_xfr_flg", "p_xfr_flg"),
				MCItemDef.create("sts_cmpl_flg", "sts_cmpl_flg"),
				MCItemDef.create("not_alloc_flg", "not_alloc_flg"),
				MCItemDef.create("alloc_flg", "alloc_flg"),
				MCItemDef.create("schd_not_cmpl_flg", "schd_not_cmpl_flg"),
				MCItemDef.create("schd_cmpl_flg", "schd_cmpl_flg"),
				MCItemDef.create("pick_not_prnt_flg", "pick_not_prnt_flg"),
				MCItemDef.create("pick_prnt_flg", "pick_prnt_flg"),
				MCItemDef.create("inst_not_prnt_flg", "inst_not_prnt_flg"),
				MCItemDef.create("inst_prnt_flg", "inst_prnt_flg"),
				MCItemDef.create("dlv_not_prnt_flg", "dlv_not_prnt_flg"),
				MCItemDef.create("dlv_prnt_flg", "dlv_prnt_flg"),
				MCItemDef.create("wms_flg", "wms_flg"),
				MCItemDef.create("not_wms_flg", "not_wms_flg"),
				MCItemDef.create("xfr_schd_dt_fr", "xfr_schd_dt_fr"),
				MCItemDef.create("xfr_schd_dt_to", "xfr_schd_dt_to"),
				MCItemDef.create("xfr_inst_dt_fr", "xfr_inst_dt_fr"),
				MCItemDef.create("xfr_inst_dt_to", "xfr_inst_dt_to"),
				MCItemDef.create("xfr_act_dt_fr", "xfr_act_dt_fr"),
				MCItemDef.create("xfr_act_dt_to", "xfr_act_dt_to"),
				MCItemDef.create("xfr_ac_dt_fr", "xfr_ac_dt_fr"),
				MCItemDef.create("xfr_ac_dt_to", "xfr_ac_dt_to"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("gi_loc_nm", "gi_loc_nm"),
				MCItemDef.create("gi_str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("gi_str_ln_nm", "gi_str_ln_nm"),
				MCItemDef.create("gi_site_cd", "gi_site_cd"),
				MCItemDef.create("gi_site_nm", "gi_site_nm"),
				MCItemDef.create("gi_stk_arrv_bp_cd", "gi_stk_arrv_bp_cd"),
				MCItemDef.create("gi_stk_arrv_bp_nm", "gi_stk_arrv_bp_nm"),
				MCItemDef.create("gr_loc_cd", "gr_loc_cd"),
				MCItemDef.create("gr_loc_nm", "gr_loc_nm"),
				MCItemDef.create("gr_str_ln_cd", "gr_str_ln_cd"),
				MCItemDef.create("gr_str_ln_nm", "gr_str_ln_nm"),
				MCItemDef.create("gr_site_cd", "gr_site_cd"),
				MCItemDef.create("gr_site_nm", "gr_site_nm"),
				MCItemDef.create("gr_stk_arrv_bp_cd", "gr_stk_arrv_bp_cd"),
				MCItemDef.create("gr_stk_arrv_bp_nm", "gr_stk_arrv_bp_nm"),
				MCItemDef.create("itm_typ_p" + ".itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_p" + ".itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_p" + ".itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("ver_no_p" + ".ver_no", "ver_no"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno_p" + ".sno1", "sno1"),
				MCItemDef.create("sno_p" + ".sno2", "sno2"),
				MCItemDef.create("sno_p" + ".sno3", "sno3"),
				MCItemDef.create("sno_p" + ".sno4", "sno4"),
				MCItemDef.create("sno_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("sno_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("pckg_unit_cd", "pckg_unit_cd"),
				MCItemDef.create("pckg_unit_nm", "pckg_unit_nm"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_bp_nm", "stk_bp_nm"),
				MCItemDef.create("rqst_usr_cd", "rqst_usr_cd"),
				MCItemDef.create("rqst_usr_nm", "rqst_usr_nm"),
				MCItemDef.create("rqst_dpt_cd", "rqst_dpt_cd"),
				MCItemDef.create("rqst_dpt_nm", "rqst_dpt_nm"),
				MCItemDef.create("inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("inst_usr_nm", "inst_usr_nm"),
				MCItemDef.create("inst_dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("inst_dpt_nm", "inst_dpt_nm"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("act_usr_nm", "act_usr_nm"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_dpt_nm", "act_dpt_nm"),
				MCItemDef.create("ship_inst_typ", "ship_inst_typ"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("rsn_nm", "rsn_nm"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_dpt_nm", "bd_dpt_nm"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("rqst_mod_flg", "rqst_mod_flg"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("inst_rmrks", "inst_rmrks"),
				MCItemDef.create("h_sub_char1", "h_sub_char1"),
				MCItemDef.create("h_sub_char2", "h_sub_char2"),
				MCItemDef.create("h_sub_char3", "h_sub_char3"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("inst_d_rmrks", "inst_d_rmrks"),
				MCItemDef.create("d_sub_char1", "d_sub_char1"),
				MCItemDef.create("d_sub_char2", "d_sub_char2"),
				MCItemDef.create("d_sub_char3", "d_sub_char3"),
				MCItemDef.create("rqst_cnt_rmrks", "rqst_cnt_rmrks"),
				MCItemDef.create("ship_cnt_rmrks", "ship_cnt_rmrks"),
				MCItemDef.create("schd_intr_rmrks", "schd_intr_rmrks"),
				MCItemDef.create("xfr_src_typ", "xfr_src_typ"),
				MCItemDef.create("xfr_src_no", "xfr_src_no"),
				MCItemDef.create("xfr_schd_no", "xfr_schd_no"),
				MCItemDef.create("xfr_alloc_sts_no", "xfr_alloc_sts_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("xfr_inst_no", "xfr_inst_no"),
				MCItemDef.create("xfr_inst_d_no", "xfr_inst_d_no"),
				MCItemDef.create("xfr_act_no", "xfr_act_no"),
				MCItemDef.create("xfr_act_d_no", "xfr_act_d_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg1", "itm_grp_flg1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd1", "itm_grp_cd1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm1", "itm_grp_nm1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg2", "itm_grp_flg2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd2", "itm_grp_cd2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm2", "itm_grp_nm2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg3", "itm_grp_flg3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd3", "itm_grp_cd3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm3", "itm_grp_nm3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg4", "itm_grp_flg4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd4", "itm_grp_cd4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm4", "itm_grp_nm4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg5", "itm_grp_flg5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd5", "itm_grp_cd5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm5", "itm_grp_nm5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg6", "itm_grp_flg6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd6", "itm_grp_cd6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm6", "itm_grp_nm6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg7", "itm_grp_flg7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd7", "itm_grp_cd7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm7", "itm_grp_nm7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg8", "itm_grp_flg8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd8", "itm_grp_cd8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm8", "itm_grp_nm8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg9", "itm_grp_flg9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd9", "itm_grp_cd9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm9", "itm_grp_nm9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg10", "itm_grp_flg10"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd10", "itm_grp_cd10"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm10", "itm_grp_nm10")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL1050_Srch02_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch02_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1050", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("pr_sts_typ", "pr_sts_typ"),
				MCItemDef.create("pr_sts_typ_nm", "pr_sts_typ_nm"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("not_lot_mix_flg", "not_lot_mix_flg"),
				MCItemDef.create("not_sublot_mix_flg", "not_sublot_mix_flg"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1_null_flg + "", "sno1_null_flg"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2_null_flg + "", "sno2_null_flg"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3_null_flg + "", "sno3_null_flg"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4_null_flg + "", "sno4_null_flg"),
				MCItemDef.create("sno_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("sno_p" + ".wrk_nm", "wkk_nm"),
				MCItemDef.create("alloc_sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "alloc_sno1"),
				MCItemDef.create("alloc_sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "alloc_sno2"),
				MCItemDef.create("alloc_sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "alloc_sno3"),
				MCItemDef.create("alloc_sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "alloc_sno4"),
				MCItemDef.create("def_ver_flg", "def_ver_flg"),
				MCItemDef.create("ver_no_p" + ".ver_no", "ver_no"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("fix_flg", "fix_flg"),
				MCItemDef.create("cmpl_flg", "cmpl_flg"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_rnd_typ", "trd_unit_rnd_typ"),
				MCItemDef.create("qty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("base_unit_qty_p" + ".qty", "base_unit_qty"),
				MCItemDef.create("schd_qty_p" + ".qty", "base_unit_schd_qty"),
				MCItemDef.create("inst_qty_p" + ".qty", "base_unit_inst_qty"),
				MCItemDef.create("act_qty_p" + ".qty", "base_unit_act_qty"),
				MCItemDef.create("pckg_unit_cd", "pckg_unit_cd"),
				MCItemDef.create("pckg_unit_nm", "pckg_unit_nm"),
				MCItemDef.create("pckg_unit_conv_base_qty", "pckg_unit_conv_base_qty"),
				MCItemDef.create("pckg_unit_conv_qty", "pckg_unit_conv_qty"),
				MCItemDef.create("pckg_unit_dec_place", "pckg_unit_dec_place"),
				MCItemDef.create("pckg_qty_p" + ".qty", "pckg_unit_qty"),
				MCItemDef.create("schd_unit_cd", "schd_unit_cd"),
				MCItemDef.create("schd_unit_nm", "schd_unit_nm"),
				MCItemDef.create("schd_unit_dec_place", "schd_unit_dec_place"),
				MCItemDef.create("xfr_schd_qty_p" + ".qty", "schd_qty"),
				MCItemDef.create("act_fctr_p" + ".act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("act_cont_p" + ".cont_qty", "act_cont_qty"),
				MCItemDef.create("std_fctr_p" + ".std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("std_cont_p" + ".cont_qty", "std_cont_qty"),
				MCItemDef.create("cont_unit_p" + ".cont_fctr_unit_cd", "cont_fctr_unit_cd"),
				MCItemDef.create("cont_unit_p" + ".cont_fctr_unit_nm", "cont_fctr_unit_nm"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("cont_fctr_rnd_typ", "cont_fctr_rnd_typ"),
				MCItemDef.create("cont_fctr_dec_place", "cont_fctr_dec_place"),
				MCItemDef.create("xfr_rqst_dt", "xfr_rqst_dt"),
				MCItemDef.create("xfr_schd_dt", "xfr_schd_dt"),
				MCItemDef.create("xfr_inst_dt", "xfr_inst_dt"),
				MCItemDef.create("xfr_act_dt", "xfr_act_dt"),
				MCItemDef.create("xfr_ac_dt", "xfr_ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("gi_loc_nm", "gi_loc_nm"),
				MCItemDef.create("gi_str_ln_tgt_flg", "gi_str_ln_tgt_flg"),
				MCItemDef.create("gi_str_ln_p" + ".str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("gi_str_ln_p" + ".str_ln_nm", "gi_str_ln_nm"),
				MCItemDef.create("gi_str_ln_p" + ".str_ln_cd_none_flg", "gi_str_ln_cd_none_flg"),
				MCItemDef.create("gi_sppl_cd", "gi_sppl_cd"),
				MCItemDef.create("gi_sppl_nm", "gi_sppl_nm"),
				MCItemDef.create("gi_onr_prsppl_flg", "gi_onr_prsppl_flg"),
				MCItemDef.create("gi_prov_basis_typ", "gi_prov_basis_typ"),
				MCItemDef.create("gi_stk_arrv_bp_cd", "gi_stk_arrv_bp_cd"),
				MCItemDef.create("gi_stk_arrv_bp_nm", "gi_stk_arrv_bp_nm"),
				MCItemDef.create("gi_site_cd", "gi_site_cd"),
				MCItemDef.create("gi_site_nm", "gi_site_nm"),
				MCItemDef.create("gr_loc_cd", "gr_loc_cd"),
				MCItemDef.create("gr_loc_nm", "gr_loc_nm"),
				MCItemDef.create("gr_str_ln_tgt_flg", "gr_str_ln_tgt_flg"),
				MCItemDef.create("gr_str_ln_p" + ".str_ln_cd", "gr_str_ln_cd"),
				MCItemDef.create("gr_str_ln_p" + ".str_ln_nm", "gr_str_ln_nm"),
				MCItemDef.create("gr_str_ln_p" + ".str_ln_cd_none_flg", "gr_str_ln_cd_none_flg"),
				MCItemDef.create("gr_sppl_cd", "gr_sppl_cd"),
				MCItemDef.create("gr_sppl_nm", "gr_sppl_nm"),
				MCItemDef.create("gr_stk_arrv_bp_cd", "gr_stk_arrv_bp_cd"),
				MCItemDef.create("gr_stk_arrv_bp_nm", "gr_stk_arrv_bp_nm"),
				MCItemDef.create("gr_site_cd", "gr_site_cd"),
				MCItemDef.create("gr_site_nm", "gr_site_nm"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("quality_typ_nm", "quality_typ_nm"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_insp_typ_nm", "stk_insp_typ_nm"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_id_typ_nm", "stk_id_typ_nm"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_bp_nm", "stk_bp_nm"),
				MCItemDef.create("rqst_usr_cd", "rqst_usr_cd"),
				MCItemDef.create("rqst_usr_nm", "rqst_usr_nm"),
				MCItemDef.create("rqst_dpt_cd", "rqst_dpt_cd"),
				MCItemDef.create("rqst_dpt_nm", "rqst_dpt_nm"),
				MCItemDef.create("inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("inst_usr_nm", "inst_usr_nm"),
				MCItemDef.create("inst_dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("inst_dpt_nm", "inst_dpt_nm"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("act_usr_nm", "act_usr_nm"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_dpt_nm", "act_dpt_nm"),
				MCItemDef.create("ship_inst_typ", "ship_inst_typ"),
				MCItemDef.create("ship_inst_typ_nm", "ship_inst_typ_nm"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("rsn_nm", "rsn_nm"),
				MCItemDef.create("acxfr_gi_flg", "acxfr_gi_flg"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_dpt_nm", "bd_dpt_nm"),
				MCItemDef.create("immd_pick_prnt_flg", "immd_pick_prnt_flg"),
				MCItemDef.create("immd_inst_prnt_flg", "immd_inst_prnt_flg"),
				MCItemDef.create("immd_dlv_prnt_flg", "immd_dlv_prnt_flg"),
				MCItemDef.create("pick_prnt_flg", "pick_prnt_flg"),
				MCItemDef.create("inst_prnt_flg", "inst_prnt_flg"),
				MCItemDef.create("dlv_prnt_flg", "dlv_prnt_flg"),
				MCItemDef.create("alloc_flg", "alloc_flg"),
				MCItemDef.create("skip_chk_ship_flg", "skip_chk_ship_flg"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("inst_rmrks", "inst_rmrks"),
				MCItemDef.create("h_sub_char1", "h_sub_char1"),
				MCItemDef.create("h_sub_char2", "h_sub_char2"),
				MCItemDef.create("h_sub_char3", "h_sub_char3"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("inst_d_rmrks", "inst_d_rmrks"),
				MCItemDef.create("d_sub_char1", "d_sub_char1"),
				MCItemDef.create("d_sub_char2", "d_sub_char2"),
				MCItemDef.create("d_sub_char3", "d_sub_char3"),
				MCItemDef.create("rqst_cnt_rmrks", "rqst_cnt_rmrks"),
				MCItemDef.create("ship_cnt_rmrks", "ship_cnt_rmrks"),
				MCItemDef.create("schd_intr_rmrks", "schd_intr_rmrks"),
				MCItemDef.create("xfr_src_typ", "xfr_src_typ"),
				MCItemDef.create("xfr_src_typ_nm", "xfr_src_typ_nm"),
				MCItemDef.create("xfr_src_no", "xfr_src_no"),
				MCItemDef.create("xfr_schd_no", "xfr_schd_no"),
				MCItemDef.create("xfr_alloc_sts_no", "xfr_alloc_sts_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("xfr_inst_no", "xfr_inst_no"),
				MCItemDef.create("xfr_inst_d_no", "xfr_inst_d_no"),
				MCItemDef.create("xfr_act_no", "xfr_act_no"),
				MCItemDef.create("xfr_act_d_no", "xfr_act_d_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("prov_typ_nm", "prov_typ_nm"),
				MCItemDef.create("prov_basis_typ", "prov_basis_typ"),
				MCItemDef.create("prov_basis_typ_nm", "prov_basis_typ_nm"),
				MCItemDef.create("ret_prov_typ", "ret_prov_typ"),
				MCItemDef.create("ret_prov_typ_nm", "ret_prov_typ_nm"),
				MCItemDef.create("ret_prov_basis_typ", "ret_prov_basis_typ"),
				MCItemDef.create("ret_prov_basis_typ_nm", "ret_prov_basis_typ_nm"),
				MCItemDef.create("prov_schd_no", "prov_schd_no"),
				MCItemDef.create("ret_prov_schd_no", "ret_prov_schd_no"),
				MCItemDef.create("base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("base_ac_dt", "base_ac_dt"),
				MCItemDef.create("wms_flg", "wms_flg"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd1", "itm_grp_cd1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm1", "itm_grp_nm1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd2", "itm_grp_cd2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm2", "itm_grp_nm2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd3", "itm_grp_cd3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm3", "itm_grp_nm3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd4", "itm_grp_cd4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm4", "itm_grp_nm4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd5", "itm_grp_cd5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm5", "itm_grp_nm5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd6", "itm_grp_cd6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm6", "itm_grp_nm6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd7", "itm_grp_cd7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm7", "itm_grp_nm7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd8", "itm_grp_cd8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm8", "itm_grp_nm8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd9", "itm_grp_cd9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm9", "itm_grp_nm9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd10", "itm_grp_cd10"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm10", "itm_grp_nm10"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("alloc_sts_upd_cntr", "alloc_sts_upd_cntr"),
				MCItemDef.create("inst_upd_cntr", "inst_upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("inst_disp_seq", "inst_disp_seq"),
				MCItemDef.create("act_disp_seq", "act_disp_seq")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1050_Srch03_INFO = new MCOperationInfo("MS", "MSBEL1050", "Srch03", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1050_Srch03_UP_BLOCK0() {
		/** Ope.のBlock [Srch03_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1050", "Srch03",
			new MCItemDef[]{
				MCItemDef.create("ope", "ope"),
				MCItemDef.create("tgt", "tgt"),
				MCItemDef.create("md", "mode"),
				MCItemDef.create("pick_not_prnt_flg", "pick_not_prnt_flg"),
				MCItemDef.create("pick_prnt_flg", "pick_prnt_flg"),
				MCItemDef.create("inst_not_prnt_flg", "inst_not_prnt_flg"),
				MCItemDef.create("inst_prnt_flg", "inst_prnt_flg"),
				MCItemDef.create("dlv_not_prnt_flg", "dlv_not_prnt_flg"),
				MCItemDef.create("dlv_prnt_flg", "dlv_prnt_flg"),
				MCItemDef.create("xfr_schd_dt_fr", "xfr_schd_dt_fr"),
				MCItemDef.create("xfr_schd_dt_to", "xfr_schd_dt_to"),
				MCItemDef.create("xfr_inst_dt_fr", "xfr_inst_dt_fr"),
				MCItemDef.create("xfr_inst_dt_to", "xfr_inst_dt_to"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("gr_loc_cd", "gr_loc_cd"),
				MCItemDef.create("gr_loc_nm", "gr_loc_nm"),
				MCItemDef.create("gr_site_cd", "gr_site_cd"),
				MCItemDef.create("gr_site_nm", "gr_site_nm"),
				MCItemDef.create("gr_stk_arrv_bp_cd", "gr_stk_arrv_bp_cd"),
				MCItemDef.create("gr_stk_arrv_bp_nm", "gr_stk_arrv_bp_nm"),
				MCItemDef.create("inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("inst_usr_nm", "inst_usr_nm"),
				MCItemDef.create("inst_dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("inst_dpt_nm", "inst_dpt_nm"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("inst_rmrks", "inst_rmrks"),
				MCItemDef.create("h_sub_char1", "h_sub_char1"),
				MCItemDef.create("h_sub_char2", "h_sub_char2"),
				MCItemDef.create("h_sub_char3", "h_sub_char3"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("xfr_inst_no", "xfr_inst_no")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL1050_Srch03_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch03_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1050", "Srch03",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("xfr_rqst_dt", "xfr_rqst_dt"),
				MCItemDef.create("xfr_schd_dt", "xfr_schd_dt"),
				MCItemDef.create("xfr_inst_dt", "xfr_inst_dt"),
				MCItemDef.create("xfr_act_dt", "xfr_act_dt"),
				MCItemDef.create("xfr_ac_dt", "xfr_ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("gr_loc_cd", "gr_loc_cd"),
				MCItemDef.create("gr_loc_nm", "gr_loc_nm"),
				MCItemDef.create("gr_str_ln_tgt_flg", "gr_str_ln_tgt_flg"),
				MCItemDef.create("gr_sppl_cd", "gr_sppl_cd"),
				MCItemDef.create("gr_sppl_nm", "gr_sppl_nm"),
				MCItemDef.create("gr_stk_arrv_bp_cd", "gr_stk_arrv_bp_cd"),
				MCItemDef.create("gr_stk_arrv_bp_nm", "gr_stk_arrv_bp_nm"),
				MCItemDef.create("gr_site_cd", "gr_site_cd"),
				MCItemDef.create("gr_site_nm", "gr_site_nm"),
				MCItemDef.create("inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("inst_usr_nm", "inst_usr_nm"),
				MCItemDef.create("inst_dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("inst_dpt_nm", "inst_dpt_nm"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("act_usr_nm", "act_usr_nm"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_dpt_nm", "act_dpt_nm"),
				MCItemDef.create("immd_pick_prnt_flg", "immd_pick_prnt_flg"),
				MCItemDef.create("immd_inst_prnt_flg", "immd_inst_prnt_flg"),
				MCItemDef.create("immd_dlv_prnt_flg", "immd_dlv_prnt_flg"),
				MCItemDef.create("pick_prnt_flg", "pick_prnt_flg"),
				MCItemDef.create("inst_prnt_flg", "inst_prnt_flg"),
				MCItemDef.create("dlv_prnt_flg", "dlv_prnt_flg"),
				MCItemDef.create("non_dlv_prnt_flg", "non_dlv_prnt_flg"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("inst_rmrks", "inst_rmrks"),
				MCItemDef.create("h_sub_char1", "h_sub_char1"),
				MCItemDef.create("h_sub_char2", "h_sub_char2"),
				MCItemDef.create("h_sub_char3", "h_sub_char3"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("xfr_inst_no", "xfr_inst_no"),
				MCItemDef.create("xfr_act_no", "xfr_act_no"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("inst_upd_cntr", "inst_upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1050_Srch04_INFO = new MCOperationInfo("MS", "MSBEL1050", "Srch04", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1050_Srch04_UP_BLOCK0() {
		/** Ope.のBlock [Srch04_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1050", "Srch04",
			new MCItemDef[]{
				MCItemDef.create("ope", "ope"),
				MCItemDef.create("tgt", "tgt"),
				MCItemDef.create("md", "mode"),
				MCItemDef.create("pick_not_prnt_flg", "pick_not_prnt_flg"),
				MCItemDef.create("pick_prnt_flg", "pick_prnt_flg"),
				MCItemDef.create("inst_not_prnt_flg", "inst_not_prnt_flg"),
				MCItemDef.create("inst_prnt_flg", "inst_prnt_flg"),
				MCItemDef.create("dlv_not_prnt_flg", "dlv_not_prnt_flg"),
				MCItemDef.create("dlv_prnt_flg", "dlv_prnt_flg"),
				MCItemDef.create("wms_flg", "wms_flg"),
				MCItemDef.create("not_wms_flg", "not_wms_flg"),
				MCItemDef.create("xfr_schd_dt_fr", "xfr_schd_dt_fr"),
				MCItemDef.create("xfr_schd_dt_to", "xfr_schd_dt_to"),
				MCItemDef.create("xfr_inst_dt_fr", "xfr_inst_dt_fr"),
				MCItemDef.create("xfr_inst_dt_to", "xfr_inst_dt_to"),
				MCItemDef.create("xfr_act_dt_fr", "xfr_act_dt_fr"),
				MCItemDef.create("xfr_act_dt_to", "xfr_act_dt_to"),
				MCItemDef.create("xfr_ac_dt_fr", "xfr_ac_dt_fr"),
				MCItemDef.create("xfr_ac_dt_to", "xfr_ac_dt_to"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("gr_loc_cd", "gr_loc_cd"),
				MCItemDef.create("gr_loc_nm", "gr_loc_nm"),
				MCItemDef.create("gr_site_cd", "gr_site_cd"),
				MCItemDef.create("gr_site_nm", "gr_site_nm"),
				MCItemDef.create("gr_stk_arrv_bp_cd", "gr_stk_arrv_bp_cd"),
				MCItemDef.create("gr_stk_arrv_bp_nm", "gr_stk_arrv_bp_nm"),
				MCItemDef.create("inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("inst_usr_nm", "inst_usr_nm"),
				MCItemDef.create("inst_dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("inst_dpt_nm", "inst_dpt_nm"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("act_usr_nm", "act_usr_nm"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_dpt_nm", "act_dpt_nm"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("inst_rmrks", "inst_rmrks"),
				MCItemDef.create("h_sub_char1", "h_sub_char1"),
				MCItemDef.create("h_sub_char2", "h_sub_char2"),
				MCItemDef.create("h_sub_char3", "h_sub_char3"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("xfr_inst_no", "xfr_inst_no"),
				MCItemDef.create("xfr_act_no", "xfr_act_no")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL1050_Srch04_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch04_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1050", "Srch04",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("xfr_rqst_dt", "xfr_rqst_dt"),
				MCItemDef.create("xfr_schd_dt", "xfr_schd_dt"),
				MCItemDef.create("xfr_inst_dt", "xfr_inst_dt"),
				MCItemDef.create("xfr_act_dt", "xfr_act_dt"),
				MCItemDef.create("xfr_ac_dt", "xfr_ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("gr_loc_cd", "gr_loc_cd"),
				MCItemDef.create("gr_loc_nm", "gr_loc_nm"),
				MCItemDef.create("gr_str_ln_tgt_flg", "gr_str_ln_tgt_flg"),
				MCItemDef.create("gr_sppl_cd", "gr_sppl_cd"),
				MCItemDef.create("gr_sppl_nm", "gr_sppl_nm"),
				MCItemDef.create("gr_stk_arrv_bp_cd", "gr_stk_arrv_bp_cd"),
				MCItemDef.create("gr_stk_arrv_bp_nm", "gr_stk_arrv_bp_nm"),
				MCItemDef.create("gr_site_cd", "gr_site_cd"),
				MCItemDef.create("gr_site_nm", "gr_site_nm"),
				MCItemDef.create("inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("inst_usr_nm", "inst_usr_nm"),
				MCItemDef.create("inst_dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("inst_dpt_nm", "inst_dpt_nm"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("act_usr_nm", "act_usr_nm"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_dpt_nm", "act_dpt_nm"),
				MCItemDef.create("immd_pick_prnt_flg", "immd_pick_prnt_flg"),
				MCItemDef.create("immd_inst_prnt_flg", "immd_inst_prnt_flg"),
				MCItemDef.create("immd_dlv_prnt_flg", "immd_dlv_prnt_flg"),
				MCItemDef.create("pick_prnt_flg", "pick_prnt_flg"),
				MCItemDef.create("inst_prnt_flg", "inst_prnt_flg"),
				MCItemDef.create("dlv_prnt_flg", "dlv_prnt_flg"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("inst_rmrks", "inst_rmrks"),
				MCItemDef.create("h_sub_char1", "h_sub_char1"),
				MCItemDef.create("h_sub_char2", "h_sub_char2"),
				MCItemDef.create("h_sub_char3", "h_sub_char3"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("xfr_inst_no", "xfr_inst_no"),
				MCItemDef.create("xfr_act_no", "xfr_act_no"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("inst_upd_cntr", "inst_upd_cntr"),
				MCItemDef.create("act_upd_cntr", "act_upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1050_Srch05_INFO = new MCOperationInfo("MS", "MSBEL1050", "Srch05", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1050_Srch05_UP_BLOCK0() {
		/** Ope.のBlock [Srch05_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1050", "Srch05",
			new MCItemDef[]{
				MCItemDef.create("ope", "ope"),
				MCItemDef.create("tgt", "tgt"),
				MCItemDef.create("md", "mode"),
				MCItemDef.create("not_inst_flg", "not_inst_flg"),
				MCItemDef.create("inst_flg", "inst_flg"),
				MCItemDef.create("p_xfr_flg", "p_xfr_flg"),
				MCItemDef.create("sts_cmpl_flg", "sts_cmpl_flg"),
				MCItemDef.create("not_alloc_flg", "not_alloc_flg"),
				MCItemDef.create("alloc_flg", "alloc_flg"),
				MCItemDef.create("schd_not_cmpl_flg", "schd_not_cmpl_flg"),
				MCItemDef.create("schd_cmpl_flg", "schd_cmpl_flg"),
				MCItemDef.create("pick_not_prnt_flg", "pick_not_prnt_flg"),
				MCItemDef.create("pick_prnt_flg", "pick_prnt_flg"),
				MCItemDef.create("inst_not_prnt_flg", "inst_not_prnt_flg"),
				MCItemDef.create("inst_prnt_flg", "inst_prnt_flg"),
				MCItemDef.create("dlv_not_prnt_flg", "dlv_not_prnt_flg"),
				MCItemDef.create("dlv_prnt_flg", "dlv_prnt_flg"),
				MCItemDef.create("wms_flg", "wms_flg"),
				MCItemDef.create("not_wms_flg", "not_wms_flg"),
				MCItemDef.create("xfr_schd_dt_fr", "xfr_schd_dt_fr"),
				MCItemDef.create("xfr_schd_dt_to", "xfr_schd_dt_to"),
				MCItemDef.create("xfr_inst_dt_fr", "xfr_inst_dt_fr"),
				MCItemDef.create("xfr_inst_dt_to", "xfr_inst_dt_to"),
				MCItemDef.create("xfr_act_dt_fr", "xfr_act_dt_fr"),
				MCItemDef.create("xfr_act_dt_to", "xfr_act_dt_to"),
				MCItemDef.create("xfr_ac_dt_fr", "xfr_ac_dt_fr"),
				MCItemDef.create("xfr_ac_dt_to", "xfr_ac_dt_to"),
				MCItemDef.create("pr_rate_fr", "pr_rate_fr"),
				MCItemDef.create("pr_rate_to", "pr_rate_to"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("gi_loc_nm", "gi_loc_nm"),
				MCItemDef.create("gi_str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("gi_str_ln_nm", "gi_str_ln_nm"),
				MCItemDef.create("gi_site_cd", "gi_site_cd"),
				MCItemDef.create("gi_site_nm", "gi_site_nm"),
				MCItemDef.create("gi_stk_arrv_bp_cd", "gi_stk_arrv_bp_cd"),
				MCItemDef.create("gi_stk_arrv_bp_nm", "gi_stk_arrv_bp_nm"),
				MCItemDef.create("gr_loc_cd", "gr_loc_cd"),
				MCItemDef.create("gr_loc_nm", "gr_loc_nm"),
				MCItemDef.create("gr_str_ln_cd", "gr_str_ln_cd"),
				MCItemDef.create("gr_str_ln_nm", "gr_str_ln_nm"),
				MCItemDef.create("gr_site_cd", "gr_site_cd"),
				MCItemDef.create("gr_site_nm", "gr_site_nm"),
				MCItemDef.create("gr_stk_arrv_bp_cd", "gr_stk_arrv_bp_cd"),
				MCItemDef.create("gr_stk_arrv_bp_nm", "gr_stk_arrv_bp_nm"),
				MCItemDef.create("itm_typ_p" + ".itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_p" + ".itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_p" + ".itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("ver_no_p" + ".ver_no", "ver_no"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno_p" + ".sno1", "sno1"),
				MCItemDef.create("sno_p" + ".sno2", "sno2"),
				MCItemDef.create("sno_p" + ".sno3", "sno3"),
				MCItemDef.create("sno_p" + ".sno4", "sno4"),
				MCItemDef.create("sno_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("sno_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("pckg_unit_cd", "pckg_unit_cd"),
				MCItemDef.create("pckg_unit_nm", "pckg_unit_nm"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_bp_nm", "stk_bp_nm"),
				MCItemDef.create("rqst_usr_cd", "rqst_usr_cd"),
				MCItemDef.create("rqst_usr_nm", "rqst_usr_nm"),
				MCItemDef.create("rqst_dpt_cd", "rqst_dpt_cd"),
				MCItemDef.create("rqst_dpt_nm", "rqst_dpt_nm"),
				MCItemDef.create("inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("inst_usr_nm", "inst_usr_nm"),
				MCItemDef.create("inst_dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("inst_dpt_nm", "inst_dpt_nm"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("act_usr_nm", "act_usr_nm"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_dpt_nm", "act_dpt_nm"),
				MCItemDef.create("ship_inst_typ", "ship_inst_typ"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("rsn_nm", "rsn_nm"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_dpt_nm", "bd_dpt_nm"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("rqst_mod_flg", "rqst_mod_flg"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("inst_rmrks", "inst_rmrks"),
				MCItemDef.create("h_sub_char1", "h_sub_char1"),
				MCItemDef.create("h_sub_char2", "h_sub_char2"),
				MCItemDef.create("h_sub_char3", "h_sub_char3"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("inst_d_rmrks", "inst_d_rmrks"),
				MCItemDef.create("d_sub_char1", "d_sub_char1"),
				MCItemDef.create("d_sub_char2", "d_sub_char2"),
				MCItemDef.create("d_sub_char3", "d_sub_char3"),
				MCItemDef.create("rqst_cnt_rmrks", "rqst_cnt_rmrks"),
				MCItemDef.create("ship_cnt_rmrks", "ship_cnt_rmrks"),
				MCItemDef.create("schd_intr_rmrks", "schd_intr_rmrks"),
				MCItemDef.create("xfr_src_typ", "xfr_src_typ"),
				MCItemDef.create("xfr_src_no", "xfr_src_no"),
				MCItemDef.create("xfr_schd_no", "xfr_schd_no"),
				MCItemDef.create("xfr_alloc_sts_no", "xfr_alloc_sts_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("xfr_inst_no", "xfr_inst_no"),
				MCItemDef.create("xfr_inst_d_no", "xfr_inst_d_no"),
				MCItemDef.create("xfr_act_no", "xfr_act_no"),
				MCItemDef.create("xfr_act_d_no", "xfr_act_d_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg1", "itm_grp_flg1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd1", "itm_grp_cd1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm1", "itm_grp_nm1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg2", "itm_grp_flg2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd2", "itm_grp_cd2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm2", "itm_grp_nm2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg3", "itm_grp_flg3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd3", "itm_grp_cd3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm3", "itm_grp_nm3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg4", "itm_grp_flg4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd4", "itm_grp_cd4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm4", "itm_grp_nm4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg5", "itm_grp_flg5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd5", "itm_grp_cd5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm5", "itm_grp_nm5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg6", "itm_grp_flg6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd6", "itm_grp_cd6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm6", "itm_grp_nm6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg7", "itm_grp_flg7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd7", "itm_grp_cd7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm7", "itm_grp_nm7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg8", "itm_grp_flg8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd8", "itm_grp_cd8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm8", "itm_grp_nm8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg9", "itm_grp_flg9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd9", "itm_grp_cd9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm9", "itm_grp_nm9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg10", "itm_grp_flg10"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd10", "itm_grp_cd10"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm10", "itm_grp_nm10")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL1050_Srch05_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch05_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1050", "Srch05",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("pr_sts_typ", "pr_sts_typ"),
				MCItemDef.create("pr_sts_typ_nm", "pr_sts_typ_nm"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("not_lot_mix_flg", "not_lot_mix_flg"),
				MCItemDef.create("not_sublot_mix_flg", "not_sublot_mix_flg"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1_null_flg + "", "sno1_null_flg"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2_null_flg + "", "sno2_null_flg"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3_null_flg + "", "sno3_null_flg"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4_null_flg + "", "sno4_null_flg"),
				MCItemDef.create("sno_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("sno_p" + ".wrk_nm", "wkk_nm"),
				MCItemDef.create("alloc_sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "alloc_sno1"),
				MCItemDef.create("alloc_sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "alloc_sno2"),
				MCItemDef.create("alloc_sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "alloc_sno3"),
				MCItemDef.create("alloc_sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "alloc_sno4"),
				MCItemDef.create("def_ver_flg", "def_ver_flg"),
				MCItemDef.create("ver_no_p" + ".ver_no", "ver_no"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("fix_flg", "fix_flg"),
				MCItemDef.create("cmpl_flg", "cmpl_flg"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_rnd_typ", "trd_unit_rnd_typ"),
				MCItemDef.create("qty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("base_unit_qty_p" + ".qty", "base_unit_qty"),
				MCItemDef.create("schd_qty_p" + ".qty", "base_unit_schd_qty"),
				MCItemDef.create("inst_qty_p" + ".qty", "base_unit_inst_qty"),
				MCItemDef.create("act_qty_p" + ".qty", "base_unit_act_qty"),
				MCItemDef.create("pr_rate", "pr_rate"),
				MCItemDef.create("pckg_unit_cd", "pckg_unit_cd"),
				MCItemDef.create("pckg_unit_nm", "pckg_unit_nm"),
				MCItemDef.create("pckg_unit_conv_base_qty", "pckg_unit_conv_base_qty"),
				MCItemDef.create("pckg_unit_conv_qty", "pckg_unit_conv_qty"),
				MCItemDef.create("pckg_unit_dec_place", "pckg_unit_dec_place"),
				MCItemDef.create("pckg_qty_p" + ".qty", "pckg_unit_qty"),
				MCItemDef.create("schd_unit_cd", "schd_unit_cd"),
				MCItemDef.create("schd_unit_nm", "schd_unit_nm"),
				MCItemDef.create("schd_unit_dec_place", "schd_unit_dec_place"),
				MCItemDef.create("xfr_schd_qty_p" + ".qty", "schd_qty"),
				MCItemDef.create("act_fctr_p" + ".act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("act_cont_p" + ".cont_qty", "act_cont_qty"),
				MCItemDef.create("std_fctr_p" + ".std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("std_cont_p" + ".cont_qty", "std_cont_qty"),
				MCItemDef.create("cont_unit_p" + ".cont_fctr_unit_cd", "cont_fctr_unit_cd"),
				MCItemDef.create("cont_unit_p" + ".cont_fctr_unit_nm", "cont_fctr_unit_nm"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("cont_fctr_rnd_typ", "cont_fctr_rnd_typ"),
				MCItemDef.create("cont_fctr_dec_place", "cont_fctr_dec_place"),
				MCItemDef.create("xfr_rqst_dt", "xfr_rqst_dt"),
				MCItemDef.create("xfr_schd_dt", "xfr_schd_dt"),
				MCItemDef.create("xfr_inst_dt", "xfr_inst_dt"),
				MCItemDef.create("xfr_act_dt", "xfr_act_dt"),
				MCItemDef.create("xfr_ac_dt", "xfr_ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("gi_loc_nm", "gi_loc_nm"),
				MCItemDef.create("gi_str_ln_tgt_flg", "gi_str_ln_tgt_flg"),
				MCItemDef.create("gi_str_ln_p" + ".str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("gi_str_ln_p" + ".str_ln_nm", "gi_str_ln_nm"),
				MCItemDef.create("gi_str_ln_p" + ".str_ln_cd_none_flg", "gi_str_ln_cd_none_flg"),
				MCItemDef.create("gi_sppl_cd", "gi_sppl_cd"),
				MCItemDef.create("gi_sppl_nm", "gi_sppl_nm"),
				MCItemDef.create("gi_onr_prsppl_flg", "gi_onr_prsppl_flg"),
				MCItemDef.create("gi_prov_basis_typ", "gi_prov_basis_typ"),
				MCItemDef.create("gi_stk_arrv_bp_cd", "gi_stk_arrv_bp_cd"),
				MCItemDef.create("gi_stk_arrv_bp_nm", "gi_stk_arrv_bp_nm"),
				MCItemDef.create("gi_site_cd", "gi_site_cd"),
				MCItemDef.create("gi_site_nm", "gi_site_nm"),
				MCItemDef.create("gr_loc_cd", "gr_loc_cd"),
				MCItemDef.create("gr_loc_nm", "gr_loc_nm"),
				MCItemDef.create("gr_str_ln_tgt_flg", "gr_str_ln_tgt_flg"),
				MCItemDef.create("gr_str_ln_p" + ".str_ln_cd", "gr_str_ln_cd"),
				MCItemDef.create("gr_str_ln_p" + ".str_ln_nm", "gr_str_ln_nm"),
				MCItemDef.create("gr_str_ln_p" + ".str_ln_cd_none_flg", "gr_str_ln_cd_none_flg"),
				MCItemDef.create("gr_sppl_cd", "gr_sppl_cd"),
				MCItemDef.create("gr_sppl_nm", "gr_sppl_nm"),
				MCItemDef.create("gr_stk_arrv_bp_cd", "gr_stk_arrv_bp_cd"),
				MCItemDef.create("gr_stk_arrv_bp_nm", "gr_stk_arrv_bp_nm"),
				MCItemDef.create("gr_site_cd", "gr_site_cd"),
				MCItemDef.create("gr_site_nm", "gr_site_nm"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("quality_typ_nm", "quality_typ_nm"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_insp_typ_nm", "stk_insp_typ_nm"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_id_typ_nm", "stk_id_typ_nm"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_bp_nm", "stk_bp_nm"),
				MCItemDef.create("rqst_usr_cd", "rqst_usr_cd"),
				MCItemDef.create("rqst_usr_nm", "rqst_usr_nm"),
				MCItemDef.create("rqst_dpt_cd", "rqst_dpt_cd"),
				MCItemDef.create("rqst_dpt_nm", "rqst_dpt_nm"),
				MCItemDef.create("inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("inst_usr_nm", "inst_usr_nm"),
				MCItemDef.create("inst_dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("inst_dpt_nm", "inst_dpt_nm"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("act_usr_nm", "act_usr_nm"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_dpt_nm", "act_dpt_nm"),
				MCItemDef.create("ship_inst_typ", "ship_inst_typ"),
				MCItemDef.create("ship_inst_typ_nm", "ship_inst_typ_nm"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("rsn_nm", "rsn_nm"),
				MCItemDef.create("acxfr_gi_flg", "acxfr_gi_flg"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_dpt_nm", "bd_dpt_nm"),
				MCItemDef.create("immd_pick_prnt_flg", "immd_pick_prnt_flg"),
				MCItemDef.create("immd_inst_prnt_flg", "immd_inst_prnt_flg"),
				MCItemDef.create("immd_dlv_prnt_flg", "immd_dlv_prnt_flg"),
				MCItemDef.create("pick_prnt_flg", "pick_prnt_flg"),
				MCItemDef.create("inst_prnt_flg", "inst_prnt_flg"),
				MCItemDef.create("dlv_prnt_flg", "dlv_prnt_flg"),
				MCItemDef.create("alloc_flg", "alloc_flg"),
				MCItemDef.create("skip_chk_ship_flg", "skip_chk_ship_flg"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("inst_rmrks", "inst_rmrks"),
				MCItemDef.create("h_sub_char1", "h_sub_char1"),
				MCItemDef.create("h_sub_char2", "h_sub_char2"),
				MCItemDef.create("h_sub_char3", "h_sub_char3"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("inst_d_rmrks", "inst_d_rmrks"),
				MCItemDef.create("d_sub_char1", "d_sub_char1"),
				MCItemDef.create("d_sub_char2", "d_sub_char2"),
				MCItemDef.create("d_sub_char3", "d_sub_char3"),
				MCItemDef.create("rqst_cnt_rmrks", "rqst_cnt_rmrks"),
				MCItemDef.create("ship_cnt_rmrks", "ship_cnt_rmrks"),
				MCItemDef.create("schd_intr_rmrks", "schd_intr_rmrks"),
				MCItemDef.create("xfr_src_typ", "xfr_src_typ"),
				MCItemDef.create("xfr_src_typ_nm", "xfr_src_typ_nm"),
				MCItemDef.create("xfr_src_no", "xfr_src_no"),
				MCItemDef.create("xfr_schd_no", "xfr_schd_no"),
				MCItemDef.create("xfr_alloc_sts_no", "xfr_alloc_sts_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("xfr_inst_no", "xfr_inst_no"),
				MCItemDef.create("xfr_inst_d_no", "xfr_inst_d_no"),
				MCItemDef.create("xfr_act_no", "xfr_act_no"),
				MCItemDef.create("xfr_act_d_no", "xfr_act_d_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("prov_typ_nm", "prov_typ_nm"),
				MCItemDef.create("prov_basis_typ", "prov_basis_typ"),
				MCItemDef.create("prov_basis_typ_nm", "prov_basis_typ_nm"),
				MCItemDef.create("ret_prov_typ", "ret_prov_typ"),
				MCItemDef.create("ret_prov_typ_nm", "ret_prov_typ_nm"),
				MCItemDef.create("ret_prov_basis_typ", "ret_prov_basis_typ"),
				MCItemDef.create("ret_prov_basis_typ_nm", "ret_prov_basis_typ_nm"),
				MCItemDef.create("prov_schd_no", "prov_schd_no"),
				MCItemDef.create("ret_prov_schd_no", "ret_prov_schd_no"),
				MCItemDef.create("base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("base_ac_dt", "base_ac_dt"),
				MCItemDef.create("wms_flg", "wms_flg"),
				MCItemDef.create("wms_tgt_flg", "wms_tgt_flg"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd1", "itm_grp_cd1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm1", "itm_grp_nm1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd2", "itm_grp_cd2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm2", "itm_grp_nm2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd3", "itm_grp_cd3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm3", "itm_grp_nm3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd4", "itm_grp_cd4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm4", "itm_grp_nm4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd5", "itm_grp_cd5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm5", "itm_grp_nm5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd6", "itm_grp_cd6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm6", "itm_grp_nm6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd7", "itm_grp_cd7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm7", "itm_grp_nm7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd8", "itm_grp_cd8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm8", "itm_grp_nm8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd9", "itm_grp_cd9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm9", "itm_grp_nm9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd10", "itm_grp_cd10"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm10", "itm_grp_nm10"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("alloc_sts_upd_cntr", "alloc_sts_upd_cntr"),
				MCItemDef.create("inst_upd_cntr", "inst_upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("inst_disp_seq", "inst_disp_seq"),
				MCItemDef.create("act_disp_seq", "act_disp_seq")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1050_Srch06_INFO = new MCOperationInfo("MS", "MSBEL1050", "Srch06", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1050_Srch06_UP_BLOCK0() {
		/** Ope.のBlock [Srch06_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1050", "Srch06",
			new MCItemDef[]{
				MCItemDef.create("ope", "ope"),
				MCItemDef.create("tgt", "tgt"),
				MCItemDef.create("md", "mode"),
				MCItemDef.create("not_inst_flg", "not_inst_flg"),
				MCItemDef.create("inst_flg", "inst_flg"),
				MCItemDef.create("p_xfr_flg", "p_xfr_flg"),
				MCItemDef.create("sts_cmpl_flg", "sts_cmpl_flg"),
				MCItemDef.create("not_alloc_flg", "not_alloc_flg"),
				MCItemDef.create("alloc_flg", "alloc_flg"),
				MCItemDef.create("schd_not_cmpl_flg", "schd_not_cmpl_flg"),
				MCItemDef.create("schd_cmpl_flg", "schd_cmpl_flg"),
				MCItemDef.create("pick_not_prnt_flg", "pick_not_prnt_flg"),
				MCItemDef.create("pick_prnt_flg", "pick_prnt_flg"),
				MCItemDef.create("inst_not_prnt_flg", "inst_not_prnt_flg"),
				MCItemDef.create("inst_prnt_flg", "inst_prnt_flg"),
				MCItemDef.create("dlv_not_prnt_flg", "dlv_not_prnt_flg"),
				MCItemDef.create("dlv_prnt_flg", "dlv_prnt_flg"),
				MCItemDef.create("wms_flg", "wms_flg"),
				MCItemDef.create("not_wms_flg", "not_wms_flg"),
				MCItemDef.create("xfr_schd_dt_fr", "xfr_schd_dt_fr"),
				MCItemDef.create("xfr_schd_dt_to", "xfr_schd_dt_to"),
				MCItemDef.create("xfr_inst_dt_fr", "xfr_inst_dt_fr"),
				MCItemDef.create("xfr_inst_dt_to", "xfr_inst_dt_to"),
				MCItemDef.create("xfr_act_dt_fr", "xfr_act_dt_fr"),
				MCItemDef.create("xfr_act_dt_to", "xfr_act_dt_to"),
				MCItemDef.create("xfr_ac_dt_fr", "xfr_ac_dt_fr"),
				MCItemDef.create("xfr_ac_dt_to", "xfr_ac_dt_to"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("gi_loc_nm", "gi_loc_nm"),
				MCItemDef.create("gi_str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("gi_str_ln_nm", "gi_str_ln_nm"),
				MCItemDef.create("gi_site_cd", "gi_site_cd"),
				MCItemDef.create("gi_site_nm", "gi_site_nm"),
				MCItemDef.create("gi_stk_arrv_bp_cd", "gi_stk_arrv_bp_cd"),
				MCItemDef.create("gi_stk_arrv_bp_nm", "gi_stk_arrv_bp_nm"),
				MCItemDef.create("gr_loc_cd", "gr_loc_cd"),
				MCItemDef.create("gr_loc_nm", "gr_loc_nm"),
				MCItemDef.create("gr_str_ln_cd", "gr_str_ln_cd"),
				MCItemDef.create("gr_str_ln_nm", "gr_str_ln_nm"),
				MCItemDef.create("gr_site_cd", "gr_site_cd"),
				MCItemDef.create("gr_site_nm", "gr_site_nm"),
				MCItemDef.create("gr_stk_arrv_bp_cd", "gr_stk_arrv_bp_cd"),
				MCItemDef.create("gr_stk_arrv_bp_nm", "gr_stk_arrv_bp_nm"),
				MCItemDef.create("itm_typ_p" + ".itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_p" + ".itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_p" + ".itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("ver_no_p" + ".ver_no", "ver_no"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno_p" + ".sno1", "sno1"),
				MCItemDef.create("sno_p" + ".sno2", "sno2"),
				MCItemDef.create("sno_p" + ".sno3", "sno3"),
				MCItemDef.create("sno_p" + ".sno4", "sno4"),
				MCItemDef.create("sno_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("sno_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("pckg_unit_cd", "pckg_unit_cd"),
				MCItemDef.create("pckg_unit_nm", "pckg_unit_nm"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_bp_nm", "stk_bp_nm"),
				MCItemDef.create("rqst_usr_cd", "rqst_usr_cd"),
				MCItemDef.create("rqst_usr_nm", "rqst_usr_nm"),
				MCItemDef.create("rqst_dpt_cd", "rqst_dpt_cd"),
				MCItemDef.create("rqst_dpt_nm", "rqst_dpt_nm"),
				MCItemDef.create("inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("inst_usr_nm", "inst_usr_nm"),
				MCItemDef.create("inst_dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("inst_dpt_nm", "inst_dpt_nm"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("act_usr_nm", "act_usr_nm"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_dpt_nm", "act_dpt_nm"),
				MCItemDef.create("ship_inst_typ", "ship_inst_typ"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("rsn_nm", "rsn_nm"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_dpt_nm", "bd_dpt_nm"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("rqst_mod_flg", "rqst_mod_flg"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("inst_rmrks", "inst_rmrks"),
				MCItemDef.create("h_sub_char1", "h_sub_char1"),
				MCItemDef.create("h_sub_char2", "h_sub_char2"),
				MCItemDef.create("h_sub_char3", "h_sub_char3"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("inst_d_rmrks", "inst_d_rmrks"),
				MCItemDef.create("d_sub_char1", "d_sub_char1"),
				MCItemDef.create("d_sub_char2", "d_sub_char2"),
				MCItemDef.create("d_sub_char3", "d_sub_char3"),
				MCItemDef.create("rqst_cnt_rmrks", "rqst_cnt_rmrks"),
				MCItemDef.create("ship_cnt_rmrks", "ship_cnt_rmrks"),
				MCItemDef.create("schd_intr_rmrks", "schd_intr_rmrks"),
				MCItemDef.create("xfr_src_typ", "xfr_src_typ"),
				MCItemDef.create("xfr_src_no", "xfr_src_no"),
				MCItemDef.create("xfr_schd_no", "xfr_schd_no"),
				MCItemDef.create("xfr_alloc_sts_no", "xfr_alloc_sts_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("xfr_inst_no", "xfr_inst_no"),
				MCItemDef.create("xfr_inst_d_no", "xfr_inst_d_no"),
				MCItemDef.create("xfr_act_no", "xfr_act_no"),
				MCItemDef.create("xfr_act_d_no", "xfr_act_d_no"),
				MCItemDef.create("ext_xfr_act_no", "ext_xfr_act_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg1", "itm_grp_flg1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd1", "itm_grp_cd1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm1", "itm_grp_nm1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg2", "itm_grp_flg2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd2", "itm_grp_cd2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm2", "itm_grp_nm2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg3", "itm_grp_flg3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd3", "itm_grp_cd3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm3", "itm_grp_nm3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg4", "itm_grp_flg4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd4", "itm_grp_cd4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm4", "itm_grp_nm4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg5", "itm_grp_flg5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd5", "itm_grp_cd5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm5", "itm_grp_nm5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg6", "itm_grp_flg6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd6", "itm_grp_cd6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm6", "itm_grp_nm6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg7", "itm_grp_flg7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd7", "itm_grp_cd7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm7", "itm_grp_nm7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg8", "itm_grp_flg8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd8", "itm_grp_cd8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm8", "itm_grp_nm8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg9", "itm_grp_flg9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd9", "itm_grp_cd9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm9", "itm_grp_nm9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg10", "itm_grp_flg10"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd10", "itm_grp_cd10"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm10", "itm_grp_nm10")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL1050_Srch06_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch06_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1050", "Srch06",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("pr_sts_typ", "pr_sts_typ"),
				MCItemDef.create("pr_sts_typ_nm", "pr_sts_typ_nm"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("not_lot_mix_flg", "not_lot_mix_flg"),
				MCItemDef.create("not_sublot_mix_flg", "not_sublot_mix_flg"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1_null_flg + "", "sno1_null_flg"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2_null_flg + "", "sno2_null_flg"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3_null_flg + "", "sno3_null_flg"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4_null_flg + "", "sno4_null_flg"),
				MCItemDef.create("sno_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("sno_p" + ".wrk_nm", "wkk_nm"),
				MCItemDef.create("alloc_sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "alloc_sno1"),
				MCItemDef.create("alloc_sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "alloc_sno2"),
				MCItemDef.create("alloc_sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "alloc_sno3"),
				MCItemDef.create("alloc_sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "alloc_sno4"),
				MCItemDef.create("def_ver_flg", "def_ver_flg"),
				MCItemDef.create("ver_no_p" + ".ver_no", "ver_no"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("fix_flg", "fix_flg"),
				MCItemDef.create("cmpl_flg", "cmpl_flg"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_rnd_typ", "trd_unit_rnd_typ"),
				MCItemDef.create("qty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("base_unit_qty_p" + ".qty", "base_unit_qty"),
				MCItemDef.create("schd_qty_p" + ".qty", "base_unit_schd_qty"),
				MCItemDef.create("inst_qty_p" + ".qty", "base_unit_inst_qty"),
				MCItemDef.create("act_qty_p" + ".qty", "base_unit_act_qty"),
				MCItemDef.create("pckg_unit_cd", "pckg_unit_cd"),
				MCItemDef.create("pckg_unit_nm", "pckg_unit_nm"),
				MCItemDef.create("pckg_unit_conv_base_qty", "pckg_unit_conv_base_qty"),
				MCItemDef.create("pckg_unit_conv_qty", "pckg_unit_conv_qty"),
				MCItemDef.create("pckg_unit_dec_place", "pckg_unit_dec_place"),
				MCItemDef.create("pckg_qty_p" + ".qty", "pckg_unit_qty"),
				MCItemDef.create("schd_unit_cd", "schd_unit_cd"),
				MCItemDef.create("schd_unit_nm", "schd_unit_nm"),
				MCItemDef.create("schd_unit_dec_place", "schd_unit_dec_place"),
				MCItemDef.create("xfr_schd_qty_p" + ".qty", "schd_qty"),
				MCItemDef.create("act_fctr_p" + ".act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("act_cont_p" + ".cont_qty", "act_cont_qty"),
				MCItemDef.create("std_fctr_p" + ".std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("std_cont_p" + ".cont_qty", "std_cont_qty"),
				MCItemDef.create("cont_unit_p" + ".cont_fctr_unit_cd", "cont_fctr_unit_cd"),
				MCItemDef.create("cont_unit_p" + ".cont_fctr_unit_nm", "cont_fctr_unit_nm"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("cont_fctr_rnd_typ", "cont_fctr_rnd_typ"),
				MCItemDef.create("cont_fctr_dec_place", "cont_fctr_dec_place"),
				MCItemDef.create("xfr_rqst_dt", "xfr_rqst_dt"),
				MCItemDef.create("xfr_schd_dt", "xfr_schd_dt"),
				MCItemDef.create("xfr_inst_dt", "xfr_inst_dt"),
				MCItemDef.create("xfr_act_dt", "xfr_act_dt"),
				MCItemDef.create("xfr_ac_dt", "xfr_ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("gi_loc_nm", "gi_loc_nm"),
				MCItemDef.create("gi_str_ln_tgt_flg", "gi_str_ln_tgt_flg"),
				MCItemDef.create("gi_str_ln_p" + ".str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("gi_str_ln_p" + ".str_ln_nm", "gi_str_ln_nm"),
				MCItemDef.create("gi_str_ln_p" + ".str_ln_cd_none_flg", "gi_str_ln_cd_none_flg"),
				MCItemDef.create("gi_sppl_cd", "gi_sppl_cd"),
				MCItemDef.create("gi_sppl_nm", "gi_sppl_nm"),
				MCItemDef.create("gi_onr_prsppl_flg", "gi_onr_prsppl_flg"),
				MCItemDef.create("gi_prov_basis_typ", "gi_prov_basis_typ"),
				MCItemDef.create("gi_stk_arrv_bp_cd", "gi_stk_arrv_bp_cd"),
				MCItemDef.create("gi_stk_arrv_bp_nm", "gi_stk_arrv_bp_nm"),
				MCItemDef.create("gi_site_cd", "gi_site_cd"),
				MCItemDef.create("gi_site_nm", "gi_site_nm"),
				MCItemDef.create("gr_loc_cd", "gr_loc_cd"),
				MCItemDef.create("gr_loc_nm", "gr_loc_nm"),
				MCItemDef.create("gr_str_ln_tgt_flg", "gr_str_ln_tgt_flg"),
				MCItemDef.create("gr_str_ln_p" + ".str_ln_cd", "gr_str_ln_cd"),
				MCItemDef.create("gr_str_ln_p" + ".str_ln_nm", "gr_str_ln_nm"),
				MCItemDef.create("gr_str_ln_p" + ".str_ln_cd_none_flg", "gr_str_ln_cd_none_flg"),
				MCItemDef.create("gr_sppl_cd", "gr_sppl_cd"),
				MCItemDef.create("gr_sppl_nm", "gr_sppl_nm"),
				MCItemDef.create("gr_stk_arrv_bp_cd", "gr_stk_arrv_bp_cd"),
				MCItemDef.create("gr_stk_arrv_bp_nm", "gr_stk_arrv_bp_nm"),
				MCItemDef.create("gr_site_cd", "gr_site_cd"),
				MCItemDef.create("gr_site_nm", "gr_site_nm"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("quality_typ_nm", "quality_typ_nm"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_insp_typ_nm", "stk_insp_typ_nm"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_id_typ_nm", "stk_id_typ_nm"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_bp_nm", "stk_bp_nm"),
				MCItemDef.create("rqst_usr_cd", "rqst_usr_cd"),
				MCItemDef.create("rqst_usr_nm", "rqst_usr_nm"),
				MCItemDef.create("rqst_dpt_cd", "rqst_dpt_cd"),
				MCItemDef.create("rqst_dpt_nm", "rqst_dpt_nm"),
				MCItemDef.create("inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("inst_usr_nm", "inst_usr_nm"),
				MCItemDef.create("inst_dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("inst_dpt_nm", "inst_dpt_nm"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("act_usr_nm", "act_usr_nm"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_dpt_nm", "act_dpt_nm"),
				MCItemDef.create("ship_inst_typ", "ship_inst_typ"),
				MCItemDef.create("ship_inst_typ_nm", "ship_inst_typ_nm"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("rsn_nm", "rsn_nm"),
				MCItemDef.create("acxfr_gi_flg", "acxfr_gi_flg"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_dpt_nm", "bd_dpt_nm"),
				MCItemDef.create("immd_pick_prnt_flg", "immd_pick_prnt_flg"),
				MCItemDef.create("immd_inst_prnt_flg", "immd_inst_prnt_flg"),
				MCItemDef.create("immd_dlv_prnt_flg", "immd_dlv_prnt_flg"),
				MCItemDef.create("pick_prnt_flg", "pick_prnt_flg"),
				MCItemDef.create("inst_prnt_flg", "inst_prnt_flg"),
				MCItemDef.create("dlv_prnt_flg", "dlv_prnt_flg"),
				MCItemDef.create("alloc_flg", "alloc_flg"),
				MCItemDef.create("skip_chk_ship_flg", "skip_chk_ship_flg"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("inst_rmrks", "inst_rmrks"),
				MCItemDef.create("h_sub_char1", "h_sub_char1"),
				MCItemDef.create("h_sub_char2", "h_sub_char2"),
				MCItemDef.create("h_sub_char3", "h_sub_char3"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("inst_d_rmrks", "inst_d_rmrks"),
				MCItemDef.create("d_sub_char1", "d_sub_char1"),
				MCItemDef.create("d_sub_char2", "d_sub_char2"),
				MCItemDef.create("d_sub_char3", "d_sub_char3"),
				MCItemDef.create("rqst_cnt_rmrks", "rqst_cnt_rmrks"),
				MCItemDef.create("ship_cnt_rmrks", "ship_cnt_rmrks"),
				MCItemDef.create("schd_intr_rmrks", "schd_intr_rmrks"),
				MCItemDef.create("xfr_src_typ", "xfr_src_typ"),
				MCItemDef.create("xfr_src_typ_nm", "xfr_src_typ_nm"),
				MCItemDef.create("xfr_src_no", "xfr_src_no"),
				MCItemDef.create("xfr_schd_no", "xfr_schd_no"),
				MCItemDef.create("xfr_alloc_sts_no", "xfr_alloc_sts_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("xfr_inst_no", "xfr_inst_no"),
				MCItemDef.create("xfr_inst_d_no", "xfr_inst_d_no"),
				MCItemDef.create("xfr_act_no", "xfr_act_no"),
				MCItemDef.create("xfr_act_d_no", "xfr_act_d_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("prov_typ_nm", "prov_typ_nm"),
				MCItemDef.create("prov_basis_typ", "prov_basis_typ"),
				MCItemDef.create("prov_basis_typ_nm", "prov_basis_typ_nm"),
				MCItemDef.create("ret_prov_typ", "ret_prov_typ"),
				MCItemDef.create("ret_prov_typ_nm", "ret_prov_typ_nm"),
				MCItemDef.create("ret_prov_basis_typ", "ret_prov_basis_typ"),
				MCItemDef.create("ret_prov_basis_typ_nm", "ret_prov_basis_typ_nm"),
				MCItemDef.create("prov_schd_no", "prov_schd_no"),
				MCItemDef.create("ret_prov_schd_no", "ret_prov_schd_no"),
				MCItemDef.create("base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("base_ac_dt", "base_ac_dt"),
				MCItemDef.create("wms_flg", "wms_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_sys_nm", "ext_sys_nm"),
				MCItemDef.create("ext_xfr_act_no", "ext_xfr_act_no"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd1", "itm_grp_cd1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm1", "itm_grp_nm1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd2", "itm_grp_cd2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm2", "itm_grp_nm2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd3", "itm_grp_cd3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm3", "itm_grp_nm3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd4", "itm_grp_cd4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm4", "itm_grp_nm4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd5", "itm_grp_cd5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm5", "itm_grp_nm5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd6", "itm_grp_cd6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm6", "itm_grp_nm6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd7", "itm_grp_cd7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm7", "itm_grp_nm7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd8", "itm_grp_cd8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm8", "itm_grp_nm8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd9", "itm_grp_cd9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm9", "itm_grp_nm9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd10", "itm_grp_cd10"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm10", "itm_grp_nm10"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("alloc_sts_upd_cntr", "alloc_sts_upd_cntr"),
				MCItemDef.create("inst_upd_cntr", "inst_upd_cntr"),
				MCItemDef.create("act_upd_cntr", "act_upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("inst_disp_seq", "inst_disp_seq"),
				MCItemDef.create("act_disp_seq", "act_disp_seq")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1050_Ins01_INFO = new MCOperationInfo("MS", "MSBEL1050", "Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1050_Ins01_UP_BLOCK0() {
		/** Ope.のBlock [Ins01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1050", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("pack_tgt_flg", "pack_tgt_flg"),
				MCItemDef.create("xfr_schd_no", "xfr_schd_no"),
				MCItemDef.create("xfr_alloc_sts_no", "xfr_alloc_sts_no"),
				MCItemDef.create("alloc_sts_upd_cntr", "alloc_sts_upd_cntr")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}

	public static MCContainerDef MS_MSBEL1050_Ins01_UP_BLOCK1() {
		/** Ope.のBlock [Ins01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1050", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("xfr_schd_dt", "xfr_schd_dt"),
				MCItemDef.create("xfr_inst_dt", "xfr_inst_dt"),
				MCItemDef.create("inst_usr_dpt_p" + ".usr_cd", "inst_usr_cd"),
				MCItemDef.create("inst_usr_dpt_p" + ".dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("immd_pick_prnt_flg", "immd_pick_prnt_flg"),
				MCItemDef.create("immd_inst_prnt_flg", "immd_inst_prnt_flg"),
				MCItemDef.create("immd_dlv_prnt_flg", "immd_dlv_prnt_flg"),
				MCItemDef.create("indiv_inst_prnt_flg", "indiv_inst_prnt_flg"),
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg"),
				MCItemDef.create("agg_gi_loc_flg", "agg_gi_loc_flg")
			}
			,
			MCBlockDef.create("BulkSet")
		);
	}


	public static MCContainerDef MS_MSBEL1050_Ins01_DOWN_BLOCK0() {
	/** Ope.のBlock [Ins01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1050", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("xfr_inst_no", "xfr_inst_no"),
				MCItemDef.create("xfr_inst_d_no", "xfr_inst_d_no"),
				MCItemDef.create("rts_msg_p" + ".rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1050_Ins02_INFO = new MCOperationInfo("MS", "MSBEL1050", "Ins02", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1050_Ins02_UP_BLOCK0() {
		/** Ope.のBlock [Ins02_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1050", "Ins02",
			new MCItemDef[]{
				MCItemDef.create("xfr_schd_no", "xfr_schd_no"),
				MCItemDef.create("xfr_alloc_sts_no", "xfr_alloc_sts_no"),
				MCItemDef.create("xfr_inst_no", "xfr_inst_no"),
				MCItemDef.create("alloc_sts_upd_cntr", "alloc_sts_upd_cntr"),
				MCItemDef.create("inst_upd_cntr", "inst_upd_cntr")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}

	public static MCContainerDef MS_MSBEL1050_Ins02_UP_BLOCK1() {
		/** Ope.のBlock [Ins02_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1050", "Ins02",
			new MCItemDef[]{
				MCItemDef.create("xfr_act_dt", "xfr_act_dt"),
				MCItemDef.create("ac_dt_p" + ".ac_dt", "xfr_ac_dt"),
				MCItemDef.create("act_usr_dpt_p" + ".usr_cd", "act_usr_cd"),
				MCItemDef.create("act_usr_dpt_p" + ".dpt_cd", "act_dpt_cd"),
				MCItemDef.create("immd_dlv_prnt_flg", "immd_dlv_prnt_flg"),
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg"),
				MCItemDef.create("agg_gi_loc_flg", "agg_gi_loc_flg")
			}
			,
			MCBlockDef.create("BulkSet")
		);
	}


	public static MCContainerDef MS_MSBEL1050_Ins02_DOWN_BLOCK0() {
	/** Ope.のBlock [Ins02_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1050", "Ins02",
			new MCItemDef[]{
				MCItemDef.create("xfr_act_no", "xfr_act_no"),
				MCItemDef.create("xfr_act_d_no", "xfr_act_d_no"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_dpt_nm", "bd_dpt_nm"),
				MCItemDef.create("rts_msg_p" + ".rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1050_Upd01_INFO = new MCOperationInfo("MS", "MSBEL1050", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1050_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1050", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("fix_flg", "fix_flg"),
				MCItemDef.create("xfr_schd_no", "xfr_schd_no"),
				MCItemDef.create("xfr_alloc_sts_no", "xfr_alloc_sts_no"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("qty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("xfr_schd_dt", "xfr_schd_dt"),
				MCItemDef.create("alloc_sts_upd_cntr", "alloc_sts_upd_cntr")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}


	public static MCContainerDef MS_MSBEL1050_Upd01_DOWN_BLOCK0() {
	/** Ope.のBlock [Upd01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1050", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("rts_msg_p" + ".rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1050_Del01_INFO = new MCOperationInfo("MS", "MSBEL1050", "Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1050_Del01_UP_BLOCK0() {
		/** Ope.のBlock [Del01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1050", "Del01",
			new MCItemDef[]{
				MCItemDef.create("xfr_inst_no", "xfr_inst_no"),
				MCItemDef.create("inst_upd_cntr", "inst_upd_cntr")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}

	public static MCContainerDef MS_MSBEL1050_Del01_UP_BLOCK1() {
		/** Ope.のBlock [Del01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1050", "Del01",
			new MCItemDef[]{
				MCItemDef.create("immd_dlv_prnt_flg", "immd_dlv_prnt_flg"),
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg")
			}
			,
			MCBlockDef.create("BulkSet")
		);
	}


	public static MCContainerDef MS_MSBEL1050_Del01_DOWN_BLOCK0() {
	/** Ope.のBlock [Del01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1050", "Del01",
			new MCItemDef[]{
				MCItemDef.create("rts_msg_p" + ".rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1050_Del02_INFO = new MCOperationInfo("MS", "MSBEL1050", "Del02", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1050_Del02_UP_BLOCK0() {
		/** Ope.のBlock [Del02_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1050", "Del02",
			new MCItemDef[]{
				MCItemDef.create("xfr_act_no", "xfr_act_no"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("act_upd_cntr", "act_upd_cntr")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}

	public static MCContainerDef MS_MSBEL1050_Del02_UP_BLOCK1() {
		/** Ope.のBlock [Del02_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1050", "Del02",
			new MCItemDef[]{
				MCItemDef.create("immd_dlv_prnt_flg", "immd_dlv_prnt_flg"),
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg")
			}
			,
			MCBlockDef.create("BulkSet")
		);
	}


	public static MCContainerDef MS_MSBEL1050_Del02_DOWN_BLOCK0() {
	/** Ope.のBlock [Del02_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1050", "Del02",
			new MCItemDef[]{
				MCItemDef.create("rts_msg_p" + ".rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1050_Alc01_INFO = new MCOperationInfo("MS", "MSBEL1050", "Alc01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1050_Alc01_UP_BLOCK0() {
		/** Ope.のBlock [Alc01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1050", "Alc01",
			new MCItemDef[]{
				MCItemDef.create("xfr_schd_no", "xfr_schd_no"),
				MCItemDef.create("xfr_alloc_sts_no", "xfr_alloc_sts_no"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("qty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_qty_p" + ".qty", "base_unit_qty"),
				MCItemDef.create("xfr_schd_dt", "xfr_schd_dt"),
				MCItemDef.create("alloc_sts_upd_cntr", "alloc_sts_upd_cntr"),
				MCItemDef.create("skip_chk_ship_flg", "skip_chk_ship_flg")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}


	public static MCContainerDef MS_MSBEL1050_Alc01_DOWN_BLOCK0() {
	/** Ope.のBlock [Alc01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1050", "Alc01",
			new MCItemDef[]{
				MCItemDef.create("rts_msg_p" + ".rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1050_Alc02_INFO = new MCOperationInfo("MS", "MSBEL1050", "Alc02", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1050_Alc02_UP_BLOCK0() {
		/** Ope.のBlock [Alc02_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1050", "Alc02",
			new MCItemDef[]{
				MCItemDef.create("xfr_schd_no", "xfr_schd_no"),
				MCItemDef.create("xfr_alloc_sts_no", "xfr_alloc_sts_no"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("qty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("xfr_schd_dt", "xfr_schd_dt"),
				MCItemDef.create("alloc_sts_upd_cntr", "alloc_sts_upd_cntr")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}


	public static MCContainerDef MS_MSBEL1050_Alc02_DOWN_BLOCK0() {
	/** Ope.のBlock [Alc02_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1050", "Alc02",
			new MCItemDef[]{
				MCItemDef.create("rts_msg_p" + ".rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1050_Prnt01_INFO = new MCOperationInfo("MS", "MSBEL1050", "Prnt01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1050_Prnt01_UP_BLOCK0() {
		/** Ope.のBlock [Prnt01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1050", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("xfr_inst_no", "xfr_inst_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("inst_upd_cntr", "inst_upd_cntr")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}

	public static MCContainerDef MS_MSBEL1050_Prnt01_UP_BLOCK1() {
		/** Ope.のBlock [Prnt01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1050", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("immd_pick_prnt_flg", "immd_pick_prnt_flg"),
				MCItemDef.create("immd_inst_prnt_flg", "immd_inst_prnt_flg"),
				MCItemDef.create("immd_dlv_prnt_flg", "immd_dlv_prnt_flg"),
				MCItemDef.create("indiv_inst_prnt_flg", "indiv_inst_prnt_flg"),
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg")
			}
			,
			MCBlockDef.create("BulkSet")
		);
	}


	public static MCContainerDef MS_MSBEL1050_Prnt01_DOWN_BLOCK0() {
	/** Ope.のBlock [Prnt01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1050", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("rts_msg_p" + ".rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1050_Prnt02_INFO = new MCOperationInfo("MS", "MSBEL1050", "Prnt02", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1050_Prnt02_UP_BLOCK0() {
		/** Ope.のBlock [Prnt02_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1050", "Prnt02",
			new MCItemDef[]{
				MCItemDef.create("xfr_act_no", "xfr_act_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("act_upd_cntr", "act_upd_cntr")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}

	public static MCContainerDef MS_MSBEL1050_Prnt02_UP_BLOCK1() {
		/** Ope.のBlock [Prnt02_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1050", "Prnt02",
			new MCItemDef[]{
				MCItemDef.create("immd_dlv_prnt_flg", "immd_dlv_prnt_flg"),
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg")
			}
			,
			MCBlockDef.create("BulkSet")
		);
	}


	public static MCContainerDef MS_MSBEL1050_Prnt02_DOWN_BLOCK0() {
	/** Ope.のBlock [Prnt02_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1050", "Prnt02",
			new MCItemDef[]{
				MCItemDef.create("rts_msg_p" + ".rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

