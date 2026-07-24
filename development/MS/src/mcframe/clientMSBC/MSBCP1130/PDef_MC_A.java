package mcframe.clientMSBC.MSBCP1130;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MSBCP_MfgActListReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBCL1130.Srch01.UP.BLOCK0")){
			return MS_MSBCL1130_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1130.Srch01.DOWN.BLOCK0")){
			return MS_MSBCL1130_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1130.Srch01.DOWN.BLOCK1")){
			return MS_MSBCL1130_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBCL1130.Sprt01.UP.BLOCK0")){
			return MS_MSBCL1130_Sprt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1130.Sprt01.UP.BLOCK1")){
			return MS_MSBCL1130_Sprt01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL1130.Sprt01.UP.BLOCK2")){
			return MS_MSBCL1130_Sprt01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBCL1130.Sprt01.DOWN.BLOCK0")){
			return MS_MSBCL1130_Sprt01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1130.Sprt02.UP.BLOCK0")){
			return MS_MSBCL1130_Sprt02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1130.Sprt02.UP.BLOCK1")){
			return MS_MSBCL1130_Sprt02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL1130.Sprt02.UP.BLOCK2")){
			return MS_MSBCL1130_Sprt02_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBCL1130.Sprt02.DOWN.BLOCK0")){
			return MS_MSBCL1130_Sprt02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1130.Imp01.UP.BLOCK0")){
			return MS_MSBCL1130_Imp01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1130.Imp01.DOWN.BLOCK0")){
			return MS_MSBCL1130_Imp01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1130.Imp01.DOWN.BLOCK1")){
			return MS_MSBCL1130_Imp01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBCL1130.Ins01.UP.BLOCK0")){
			return MS_MSBCL1130_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1130.Ins01.UP.BLOCK1")){
			return MS_MSBCL1130_Ins01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL1130.Ins01.UP.BLOCK2")){
			return MS_MSBCL1130_Ins01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBCL1130.Ins01.DOWN.BLOCK0")){
			return MS_MSBCL1130_Ins01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1130.Ins01.DOWN.BLOCK1")){
			return MS_MSBCL1130_Ins01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBCL1130.Upd01.UP.BLOCK0")){
			return MS_MSBCL1130_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1130.Upd01.UP.BLOCK1")){
			return MS_MSBCL1130_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL1130.Upd01.UP.BLOCK2")){
			return MS_MSBCL1130_Upd01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBCL1130.Upd01.DOWN.BLOCK0")){
			return MS_MSBCL1130_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1130.Upd01.DOWN.BLOCK1")){
			return MS_MSBCL1130_Upd01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBCL1130.Upd02.UP.BLOCK0")){
			return MS_MSBCL1130_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1130.Upd02.UP.BLOCK1")){
			return MS_MSBCL1130_Upd02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL1130.Upd02.DOWN.BLOCK0")){
			return MS_MSBCL1130_Upd02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1130.Del01.UP.BLOCK0")){
			return MS_MSBCL1130_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1130.Del01.DOWN.BLOCK0")){
			return MS_MSBCL1130_Del01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1130.Del02.UP.BLOCK0")){
			return MS_MSBCL1130_Del02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1130.Del02.UP.BLOCK1")){
			return MS_MSBCL1130_Del02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL1130.Del02.DOWN.BLOCK0")){
			return MS_MSBCL1130_Del02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1130.Prnt01.UP.BLOCK0")){
			return MS_MSBCL1130_Prnt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1130.Prnt01.DOWN.BLOCK0")){
			return MS_MSBCL1130_Prnt01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
										
	
	static final MCOperationInfo MS_MSBCL1130_Srch01_INFO = new MCOperationInfo("MS", "MSBCL1130", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL1130_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1130", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ope", "ope"),
				MCItemDef.create("srch_mode", "disp_unit"),
				MCItemDef.create("ord_flg", "ord_flg"),
				MCItemDef.create("stt_flg", "stt_flg"),
				MCItemDef.create("cmpl_flg", "cmpl_flg"),
				MCItemDef.create("act_prnt_flg", "act_prnt_flg"),
				MCItemDef.create("not_act_prnt_flg", "not_act_prnt_flg"),
				MCItemDef.create("stk_lst_issue_flg", "stk_lst_issue_flg"),
				MCItemDef.create("not_stk_lst_issue_flg", "not_stk_lst_issue_flg"),
				MCItemDef.create("mes_tgt_flg", "mes_tgt_flg"),
				MCItemDef.create("not_mes_tgt_flg", "not_mes_tgt_flg"),
				MCItemDef.create("not_unschd_act_flg", "not_unschd_act_flg"),
				MCItemDef.create("unschd_act_flg", "unschd_act_flg"),
				MCItemDef.create("st_schd_dt_p" + ".ymd_fr", "st_schd_dt_fr"),
				MCItemDef.create("st_schd_dt_p" + ".hm_fr", "st_schd_hm_fr"),
				MCItemDef.create("st_schd_dt_p" + ".ymd_to", "st_schd_dt_to"),
				MCItemDef.create("st_schd_dt_p" + ".hm_to", "st_schd_hm_to"),
				MCItemDef.create("end_schd_dt_p" + ".ymd_fr", "end_schd_dt_fr"),
				MCItemDef.create("end_schd_dt_p" + ".hm_fr", "end_schd_hm_fr"),
				MCItemDef.create("end_schd_dt_p" + ".ymd_to", "end_schd_dt_to"),
				MCItemDef.create("end_schd_dt_p" + ".hm_to", "end_schd_hm_to"),
				MCItemDef.create("st_act_dt_p" + ".ymd_fr", "st_act_dt_fr"),
				MCItemDef.create("st_act_dt_p" + ".hm_fr", "st_act_hm_fr"),
				MCItemDef.create("st_act_dt_p" + ".ymd_to", "st_act_dt_to"),
				MCItemDef.create("st_act_dt_p" + ".hm_to", "st_act_hm_to"),
				MCItemDef.create("end_act_dt_p" + ".ymd_fr", "end_act_dt_fr"),
				MCItemDef.create("end_act_dt_p" + ".hm_fr", "end_act_hm_fr"),
				MCItemDef.create("end_act_dt_p" + ".ymd_to", "end_act_dt_to"),
				MCItemDef.create("end_act_dt_p" + ".hm_to", "end_act_hm_to"),
				MCItemDef.create("st_ac_dt_fr", "st_ac_dt_fr"),
				MCItemDef.create("st_ac_dt_to", "st_ac_dt_to"),
				MCItemDef.create("end_ac_dt_fr", "end_ac_dt_fr"),
				MCItemDef.create("end_ac_dt_to", "end_ac_dt_to"),
				MCItemDef.create("inst_dt_fr", "inst_dt_fr"),
				MCItemDef.create("inst_dt_to", "inst_dt_to"),
				MCItemDef.create("aprv_dt_fr", "aprv_dt_fr"),
				MCItemDef.create("aprv_dt_to", "aprv_dt_to"),
				MCItemDef.create("mfg_mtd_typ", "mfg_mtd_typ"),
				MCItemDef.create("bkf_not_ref_flg", "bkf_not_ref_flg"),
				MCItemDef.create("inpt_not_comp_flg", "inpt_not_comp_flg"),
				MCItemDef.create("wk_not_comp_flg", "wk_not_comp_flg"),
				MCItemDef.create("mfg_loc_site_cd", "mfg_loc_site_cd"),
				MCItemDef.create("mfg_loc_site_nm", "mfg_loc_site_nm"),
				MCItemDef.create("mfg_loc_wg_cd", "mfg_loc_wg_cd"),
				MCItemDef.create("mfg_loc_wg_nm", "mfg_loc_wg_nm"),
				MCItemDef.create("mfg_loc_grp_cd", "mfg_loc_grp_cd"),
				MCItemDef.create("mfg_loc_grp_nm", "mfg_loc_grp_nm"),
				MCItemDef.create("strg_loc_grp_cd", "strg_loc_grp_cd"),
				MCItemDef.create("strg_loc_grp_nm", "strg_loc_grp_nm"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("mfg_str_ln_cd", "mfg_str_ln_cd"),
				MCItemDef.create("mfg_str_ln_nm", "mfg_str_ln_nm"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_loc_nm", "strg_loc_nm"),
				MCItemDef.create("strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("strg_str_ln_nm", "strg_str_ln_nm"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("oper_loc_cd", "oper_loc_cd"),
				MCItemDef.create("oper_loc_nm", "oper_loc_nm"),
				MCItemDef.create("oper_str_ln_cd", "oper_str_ln_cd"),
				MCItemDef.create("oper_str_ln_nm", "oper_str_ln_nm"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("mfg_aprv_sts_typ", "mfg_aprv_sts_typ"),
				MCItemDef.create("itm_typ_p" + ".itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_p" + ".itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_p" + ".itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("inst_lot_no", "inst_lot_no"),
				MCItemDef.create("inst_sublot_no", "inst_sublot_no"),
				MCItemDef.create("sno_p" + ".sno1", "sno1"),
				MCItemDef.create("sno_p" + ".sno2", "sno2"),
				MCItemDef.create("sno_p" + ".sno3", "sno3"),
				MCItemDef.create("sno_p" + ".sno4", "sno4"),
				MCItemDef.create("sno_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("sno_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("inst_usr_nm", "inst_usr_nm"),
				MCItemDef.create("inst_dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("inst_dpt_nm", "inst_dpt_nm"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("act_usr_nm", "act_usr_nm"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_dpt_nm", "act_dpt_nm"),
				MCItemDef.create("oper_usr_cd", "oper_usr_cd"),
				MCItemDef.create("oper_usr_nm", "oper_usr_nm"),
				MCItemDef.create("aprv_usr_cd", "aprv_usr_cd"),
				MCItemDef.create("aprv_usr_nm", "aprv_usr_nm"),
				MCItemDef.create("aprv_dpt_cd", "aprv_dpt_cd"),
				MCItemDef.create("aprv_dpt_nm", "aprv_dpt_nm"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("oper_act_no", "oper_act_no"),
				MCItemDef.create("ext_oper_act_no", "ext_oper_act_no"),
				MCItemDef.create("inst_rpt_rmrks", "inst_rpt_rmrks"),
				MCItemDef.create("inst_po_cnt_rmrks", "inst_po_cnt_rmrks"),
				MCItemDef.create("oper_inst_rpt_rmrks", "oper_inst_rpt_rmrks"),
				MCItemDef.create("act_rpt_rmrks", "act_rpt_rmrks"),
				MCItemDef.create("act_intr_rmrks", "act_intr_rmrks"),
				MCItemDef.create("mfg_act_sub_char1", "mfg_act_sub_char1"),
				MCItemDef.create("mfg_act_sub_char2", "mfg_act_sub_char2"),
				MCItemDef.create("mfg_act_sub_char3", "mfg_act_sub_char3"),
				MCItemDef.create("oper_act_intr_rmrks", "oper_act_intr_rmrks"),
				MCItemDef.create("oper_act_rpt_rmrks", "oper_act_rpt_rmrks"),
				MCItemDef.create("oper_act_sub_char1", "oper_act_sub_char1"),
				MCItemDef.create("oper_act_sub_char2", "oper_act_sub_char2"),
				MCItemDef.create("oper_act_sub_char3", "oper_act_sub_char3"),
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
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm10", "itm_grp_nm10"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_flg1", "sppl_grp_flg1"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_cd1", "sppl_grp_cd1"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_nm1", "sppl_grp_nm1"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_flg2", "sppl_grp_flg2"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_cd2", "sppl_grp_cd2"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_nm2", "sppl_grp_nm2"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_flg3", "sppl_grp_flg3"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_cd3", "sppl_grp_cd3"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_nm3", "sppl_grp_nm3"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_flg4", "sppl_grp_flg4"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_cd4", "sppl_grp_cd4"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_nm4", "sppl_grp_nm4"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_flg5", "sppl_grp_flg5"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_cd5", "sppl_grp_cd5"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_nm5", "sppl_grp_nm5"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_flg6", "sppl_grp_flg6"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_cd6", "sppl_grp_cd6"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_nm6", "sppl_grp_nm6"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_flg7", "sppl_grp_flg7"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_cd7", "sppl_grp_cd7"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_nm7", "sppl_grp_nm7"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_flg8", "sppl_grp_flg8"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_cd8", "sppl_grp_cd8"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_nm8", "sppl_grp_nm8"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_flg9", "sppl_grp_flg9"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_cd9", "sppl_grp_cd9"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_nm9", "sppl_grp_nm9"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_flg10", "sppl_grp_flg10"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_cd10", "sppl_grp_cd10"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_nm10", "sppl_grp_nm10")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBCL1130_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1130", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("mfg_sts_typ_nm", "mfg_sts_typ_nm"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("st_act_p" + ".ymd", "st_act_dt"),
				MCItemDef.create("st_act_p" + ".hm", "st_act_hm"),
				MCItemDef.create("st_ac_dt_p" + ".ac_dt", "st_ac_dt"),
				MCItemDef.create("end_act_p" + ".ymd", "end_act_dt"),
				MCItemDef.create("end_act_p" + ".hm", "end_act_hm"),
				MCItemDef.create("end_ac_dt_p" + ".ac_dt", "end_ac_dt"),
				MCItemDef.create("oper_unit_act_qty_p" + ".qty", "oper_unit_act_qty"),
				MCItemDef.create("oper_unit_schd_qty_p" + ".qty", "oper_unit_schd_qty"),
				MCItemDef.create("oper_unit_rem_qty_p" + ".qty", "oper_unit_rem_qty"),
				MCItemDef.create("oper_std_qty", "oper_std_qty"),
				MCItemDef.create("oper_conv_qty", "oper_conv_qty"),
				MCItemDef.create("oper_unit_conv_rnd_typ", "oper_unit_conv_rnd_typ"),
				MCItemDef.create("oper_unit_dec_place", "oper_unit_dec_place"),
				MCItemDef.create("oper_unit_cd", "oper_unit_cd"),
				MCItemDef.create("oper_unit_nm", "oper_unit_nm"),
				MCItemDef.create("base_unit_st_act_qty_p" + ".qty", "base_unit_st_act_qty"),
				MCItemDef.create("rem_abort_flg", "rem_abort_flg"),
				MCItemDef.create("base_unit_mfg_rem_qty_p" + ".qty", "base_unit_mfg_rem_qty"),
				MCItemDef.create("base_unit_mfg_inst_qty_p" + ".qty", "base_unit_mfg_inst_qty"),
				MCItemDef.create("base_unit_yield_schd_qty_p" + ".qty", "base_unit_yield_schd_qty"),
				MCItemDef.create("base_unit_yield_qty_p" + ".qty", "base_unit_yield_qty"),
				MCItemDef.create("base_unit_dfct_qty_p" + ".qty", "base_unit_dfct_qty"),
				MCItemDef.create("base_unit_oper_schd_qty_p" + ".qty", "base_unit_oper_schd_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
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
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("inst_lot_no", "inst_lot_no"),
				MCItemDef.create("inst_sublot_no", "inst_sublot_no"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
				MCItemDef.create("sno_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("sno_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("act_usr_dpt_p" + ".usr_cd", "act_usr_cd"),
				MCItemDef.create("act_usr_dpt_p" + ".usr_nm", "act_usr_nm"),
				MCItemDef.create("act_usr_dpt_p" + ".dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_usr_dpt_p" + ".dpt_nm", "act_dpt_nm"),
				MCItemDef.create("act_rpt_rmrks", "act_rpt_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("mfg_act_sub_char1", "mfg_act_sub_char1"),
				MCItemDef.create("mfg_act_sub_char2", "mfg_act_sub_char2"),
				MCItemDef.create("mfg_act_sub_char3", "mfg_act_sub_char3"),
				MCItemDef.create("act_prnt_flg", "act_prnt_flg"),
				MCItemDef.create("act_prnt_tm", "act_prnt_tm"),
				MCItemDef.create("oper_act_intr_rmrks", "oper_act_intr_rmrks"),
				MCItemDef.create("oper_act_rpt_rmrks", "oper_act_rpt_rmrks"),
				MCItemDef.create("oper_act_sub_char1", "oper_act_sub_char1"),
				MCItemDef.create("oper_act_sub_char2", "oper_act_sub_char2"),
				MCItemDef.create("oper_act_sub_char3", "oper_act_sub_char3"),
				MCItemDef.create("itm_yield", "itm_yield"),
				MCItemDef.create("itm_lower_yield", "itm_lower_yield"),
				MCItemDef.create("itm_std_yield", "itm_std_yield"),
				MCItemDef.create("itm_upper_yield", "itm_upper_yield"),
				MCItemDef.create("oper_yield", "oper_yield"),
				MCItemDef.create("oper_lower_yield", "oper_lower_yield"),
				MCItemDef.create("oper_std_yield", "oper_std_yield"),
				MCItemDef.create("oper_upper_yield", "oper_upper_yield"),
				MCItemDef.create("bkf_flg", "bkf_flg"),
				MCItemDef.create("bkf_upd_flg", "bkf_upd_flg"),
				MCItemDef.create("wk_cost_calc_flg", "wk_cost_calc_flg"),
				MCItemDef.create("wk_cost_upd_calc_flg", "wk_cost_upd_calc_flg"),
				MCItemDef.create("st_schd_dt", "st_schd_dt"),
				MCItemDef.create("st_schd_hm", "st_schd_hm"),
				MCItemDef.create("end_schd_dt", "end_schd_dt"),
				MCItemDef.create("end_schd_hm", "end_schd_hm"),
				MCItemDef.create("mfg_mtd_typ", "mfg_mtd_typ"),
				MCItemDef.create("mfg_mtd_typ_nm", "mfg_mtd_typ_nm"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("mfg_str_ln_tgt_flg", "mfg_str_ln_tgt_flg"),
				MCItemDef.create("mfg_str_ln_cd", "mfg_str_ln_cd"),
				MCItemDef.create("mfg_str_ln_nm", "mfg_str_ln_nm"),
				MCItemDef.create("mfg_str_ln_cd_none_flg", "mfg_str_ln_cd_none_flg"),
				MCItemDef.create("oper_loc_cd", "oper_loc_cd"),
				MCItemDef.create("oper_loc_nm", "oper_loc_nm"),
				MCItemDef.create("oper_str_ln_tgt_flg", "oper_str_ln_tgt_flg"),
				MCItemDef.create("oper_str_ln_cd", "oper_str_ln_cd"),
				MCItemDef.create("oper_str_ln_nm", "oper_str_ln_nm"),
				MCItemDef.create("oper_str_ln_cd_none_flg", "oper_str_ln_cd_none_flg"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_loc_nm", "strg_loc_nm"),
				MCItemDef.create("strg_str_ln_tgt_flg", "strg_str_ln_tgt_flg"),
				MCItemDef.create("strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("strg_str_ln_nm", "strg_str_ln_nm"),
				MCItemDef.create("strg_str_ln_cd_none_flg", "strg_str_ln_cd_none_flg"),
				MCItemDef.create("mfg_loc_grp_cd", "mfg_loc_grp_cd"),
				MCItemDef.create("mfg_loc_grp_nm", "mfg_loc_grp_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("arr_purc_auto_reg_flg", "arr_purc_auto_reg_flg"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("unschd_act_flg", "unschd_act_flg"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("oper_act_no", "oper_act_no"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("wip_rate", "wip_rate"),
				MCItemDef.create("mes_id", "mes_id"),
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("not_cmpl_flg", "not_cmpl_flg"),
				MCItemDef.create("mes_flg", "mes_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_sys_nm", "ext_sys_nm"),
				MCItemDef.create("ext_oper_act_no", "ext_oper_act_no"),
				MCItemDef.create("if_auto_reg_flg", "if_auto_reg_flg"),
				MCItemDef.create("inst_dt", "inst_dt"),
				MCItemDef.create("inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("inst_usr_nm", "inst_usr_nm"),
				MCItemDef.create("inst_dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("inst_dpt_nm", "inst_dpt_nm"),
				MCItemDef.create("inst_rpt_rmrks", "inst_rpt_rmrks"),
				MCItemDef.create("inst_po_cnt_rmrks", "inst_po_cnt_rmrks"),
				MCItemDef.create("oper_usr_cd", "oper_usr_cd"),
				MCItemDef.create("oper_usr_nm", "oper_usr_nm"),
				MCItemDef.create("oper_inst_rpt_rmrks", "oper_inst_rpt_rmrks"),
				MCItemDef.create("mfg_aprv_sts_typ", "mfg_aprv_sts_typ"),
				MCItemDef.create("mfg_aprv_sts_typ_nm", "mfg_aprv_sts_typ_nm"),
				MCItemDef.create("aprv_dt", "aprv_dt"),
				MCItemDef.create("aprv_tm", "aprv_tm"),
				MCItemDef.create("aprv_flg", "aprv_flg"),
				MCItemDef.create("aprv_usr_dpt_p" + ".dpt_cd", "aprv_dpt_cd"),
				MCItemDef.create("aprv_usr_dpt_p" + ".dpt_nm", "aprv_dpt_nm"),
				MCItemDef.create("aprv_usr_dpt_p" + ".usr_cd", "aprv_usr_cd"),
				MCItemDef.create("aprv_usr_dpt_p" + ".usr_nm", "aprv_usr_nm"),
				MCItemDef.create("aprv_rsn_p" + ".txt", "aprv_rsn"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("mfg_inst_upd_cntr", "mfg_inst_upd_cntr"),
				MCItemDef.create("mfg_inst_pr_upd_cntr", "mfg_inst_pr_upd_cntr"),
				MCItemDef.create("mfg_act_upd_cntr", "mfg_act_upd_cntr"),
				MCItemDef.create("peg_no", "peg_no"),
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
				MCItemDef.create("sppl_grp_p" + ".bp_grp_cd1", "sppl_grp_cd1"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_nm1", "sppl_grp_nm1"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_cd2", "sppl_grp_cd2"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_nm2", "sppl_grp_nm2"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_cd3", "sppl_grp_cd3"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_nm3", "sppl_grp_nm3"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_cd4", "sppl_grp_cd4"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_nm4", "sppl_grp_nm4"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_cd5", "sppl_grp_cd5"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_nm5", "sppl_grp_nm5"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_cd6", "sppl_grp_cd6"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_nm6", "sppl_grp_nm6"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_cd7", "sppl_grp_cd7"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_nm7", "sppl_grp_nm7"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_cd8", "sppl_grp_cd8"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_nm8", "sppl_grp_nm8"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_cd9", "sppl_grp_cd9"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_nm9", "sppl_grp_nm9"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_cd10", "sppl_grp_cd10"),
				MCItemDef.create("sppl_grp_p" + ".bp_grp_nm10", "sppl_grp_nm10")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	public static MCContainerDef MS_MSBCL1130_Srch01_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch01_YieldByProdRslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1130", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("yield_typ", "yield_typ"),
				MCItemDef.create("yield_typ_nm", "yield_typ_nm"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("trd_unit_yield_act_qty_p" + ".qty", "trd_unit_yield_act_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_conv_rnd_typ", "trd_unit_conv_rnd_typ"),
				MCItemDef.create("base_unit_yield_act_qty_p" + ".qty", "base_unit_yield_act_qty"),
				MCItemDef.create("base_unit_yield_schd_qty_p" + ".qty", "base_unit_yield_schd_qty"),
				MCItemDef.create("base_unit_yield_rem_qty_p" + ".qty", "base_unit_yield_rem_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_conv_rnd_typ", "base_unit_conv_rnd_typ"),
				MCItemDef.create("conv_base_qty", "conv_base_qty"),
				MCItemDef.create("conv_qty", "conv_qty"),
				MCItemDef.create("act_dt_p" + ".ymd", "act_dt"),
				MCItemDef.create("act_dt_p" + ".hm", "act_hm"),
				MCItemDef.create("ac_dt_p" + ".ac_dt", "ac_dt"),
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
				MCItemDef.create("lot_no_p" + ".lot_no", "lot_no"),
				MCItemDef.create("lot_no_p" + ".sublot_no", "sublot_no"),
				MCItemDef.create("same_lot_flg", "same_lot_flg"),
				MCItemDef.create("sno_p" + ".sno1", "sno1"),
				MCItemDef.create("sno_p" + ".sno2", "sno2"),
				MCItemDef.create("sno_p" + ".sno3", "sno3"),
				MCItemDef.create("sno_p" + ".sno4", "sno4"),
				MCItemDef.create("yield_rsn_cd", "yield_rsn_cd"),
				MCItemDef.create("yield_rsn_nm", "yield_rsn_nm"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("quality_typ_nm", "quality_typ_nm"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_loc_nm", "strg_loc_nm"),
				MCItemDef.create("strg_str_ln_tgt_flg", "strg_str_ln_tgt_flg"),
				MCItemDef.create("strg_str_ln_p" + ".str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("strg_str_ln_p" + ".str_ln_nm", "strg_str_ln_nm"),
				MCItemDef.create("strg_str_ln_p" + ".str_ln_cd_none_flg", "strg_str_ln_cd_none_flg"),
				MCItemDef.create("yield_rate", "yield_rate"),
				MCItemDef.create("inst_rpt_rmrks", "inst_rpt_rmrks"),
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
				MCItemDef.create("stk_lst_prnt_flg", "stk_lst_prnt_flg"),
				MCItemDef.create("mes_id", "mes_id"),
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("mes_flg", "mes_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_sys_nm", "ext_sys_nm"),
				MCItemDef.create("ext_yield_act_no", "ext_yield_act_no"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("mfg_sts_typ_nm", "mfg_sts_typ_nm"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("base_unit_yield_act_qty_bef", "base_unit_yield_act_qty_bef")
			}
			,
			MCBlockDef.create("RsltYieldByProd")
		);
	}
	
	static final MCOperationInfo MS_MSBCL1130_Sprt01_INFO = new MCOperationInfo("MS", "MSBCL1130", "Sprt01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL1130_Sprt01_UP_BLOCK0() {
		/** Ope.のBlock [Sprt01_Ctrl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1130", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("lot_issue_flg", "lot_issue_flg"),
				MCItemDef.create("sublot_issue_flg", "sublot_issue_flg"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("mfg_act_no", "mfg_act_no")
			}
			,
			MCBlockDef.create("RsltYieldByProdBtn")
		);
	}

	public static MCContainerDef MS_MSBCL1130_Sprt01_UP_BLOCK1() {
		/** Ope.のBlock [Sprt01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1130", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("wg_cd", "mfg_loc_wg_cd"),
				MCItemDef.create("site_cd", "mfg_loc_site_cd")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}

	public static MCContainerDef MS_MSBCL1130_Sprt01_UP_BLOCK2() {
		/** Ope.のBlock [Sprt01_DtlYieldByProd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1130", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("sno_p" + ".sno1", "sno1"),
				MCItemDef.create("sno_p" + ".sno2", "sno2"),
				MCItemDef.create("sno_p" + ".sno3", "sno3"),
				MCItemDef.create("sno_p" + ".sno4", "sno4"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("lot_no_ptn_cd", "lot_no_ptn_cd"),
				MCItemDef.create("sublot_no_ptn_cd", "sublot_no_ptn_cd"),
				MCItemDef.create("act_dt_p" + ".ymd", "yield_dt"),
				MCItemDef.create("lot_no_p" + ".lot_no", "lot_no"),
				MCItemDef.create("lot_no_p" + ".sublot_no", "sublot_no")
			}
			,
			MCBlockDef.create("RsltYieldByProd")
		);
	}


	public static MCContainerDef MS_MSBCL1130_Sprt01_DOWN_BLOCK0() {
	/** Ope.のBlock [Sprt01_DtlYieldByProd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1130", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("lot_no_p" + ".lot_no", "lot_no"),
				MCItemDef.create("lot_no_p" + ".sublot_no", "sublot_no")
			}
			,
			MCBlockDef.create("RsltYieldByProd")
		);
	}
	
	static final MCOperationInfo MS_MSBCL1130_Sprt02_INFO = new MCOperationInfo("MS", "MSBCL1130", "Sprt02", "000000", new PDef());

	public static MCContainerDef MS_MSBCL1130_Sprt02_UP_BLOCK0() {
		/** Ope.のBlock [Sprt02_Ctrl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1130", "Sprt02",
			new MCItemDef[]{
				MCItemDef.create("lot_issue_flg", "lot_issue_flg"),
				MCItemDef.create("sublot_issue_flg", "sublot_issue_flg"),
				MCItemDef.create("mfg_act_no", "mfg_act_no")
			}
			,
			MCBlockDef.create("RsltYieldByProdBtn")
		);
	}

	public static MCContainerDef MS_MSBCL1130_Sprt02_UP_BLOCK1() {
		/** Ope.のBlock [Sprt02_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1130", "Sprt02",
			new MCItemDef[]{
				MCItemDef.create("unschd_mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("unschd_mfg_loc_wg_cd", "mfg_loc_wg_cd"),
				MCItemDef.create("unschd_mfg_loc_site_cd", "mfg_loc_site_cd")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}

	public static MCContainerDef MS_MSBCL1130_Sprt02_UP_BLOCK2() {
		/** Ope.のBlock [Sprt02_DtlYieldByProd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1130", "Sprt02",
			new MCItemDef[]{
				MCItemDef.create("unschd_itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("unschd_itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("unschd_itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("unschd_itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("unschd_lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("unschd_sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("unschd_lot_no_ptn_cd", "lot_no_ptn_cd"),
				MCItemDef.create("unschd_sublot_no_ptn_cd", "sublot_no_ptn_cd"),
				MCItemDef.create("unschd_act_dt_p" + ".ymd", "yield_dt"),
				MCItemDef.create("unschd_lot_no_p" + ".lot_no", "lot_no"),
				MCItemDef.create("unschd_lot_no_p" + ".sublot_no", "sublot_no")
			}
			,
			MCBlockDef.create("RsltYieldByProd")
		);
	}


	public static MCContainerDef MS_MSBCL1130_Sprt02_DOWN_BLOCK0() {
	/** Ope.のBlock [Sprt02_DtlYieldByProd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1130", "Sprt02",
			new MCItemDef[]{
				MCItemDef.create("unschd_lot_no_p" + ".lot_no", "lot_no"),
				MCItemDef.create("unschd_lot_no_p" + ".sublot_no", "sublot_no")
			}
			,
			MCBlockDef.create("RsltYieldByProd")
		);
	}
	
	static final MCOperationInfo MS_MSBCL1130_Imp01_INFO = new MCOperationInfo("MS", "MSBCL1130", "Imp01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL1130_Imp01_UP_BLOCK0() {
		/** Ope.のBlock [Imp01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1130", "Imp01",
			new MCItemDef[]{
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("st_act_p" + ".ymd", "st_act_tm"),
				MCItemDef.create("st_ac_dt_p" + ".ac_dt", "st_ac_dt"),
				MCItemDef.create("end_act_p" + ".ymd", "end_act_tm"),
				MCItemDef.create("end_ac_dt_p" + ".ac_dt", "end_ac_dt"),
				MCItemDef.create("unschd_master_dt", "unschd_master_dt"),
				MCItemDef.create("unschd_itm_p" + ".itm_cd", "unschd_itm_cd"),
				MCItemDef.create("unschd_itm_p" + ".itm_sub1", "unschd_itm_sub1"),
				MCItemDef.create("unschd_itm_p" + ".itm_sub2", "unschd_itm_sub2"),
				MCItemDef.create("unschd_itm_p" + ".itm_sub3", "unschd_itm_sub3"),
				MCItemDef.create("unschd_mfg_loc_cd", "unschd_mfg_loc_cd"),
				MCItemDef.create("unschd_mfg_str_ln_p" + ".str_ln_cd", "unschd_mfg_str_ln_cd"),
				MCItemDef.create("unschd_bom_ptn", "unschd_bom_ptn"),
				MCItemDef.create("unschd_strg_loc_cd", "unschd_strg_loc_cd"),
				MCItemDef.create("unschd_strg_str_ln_p" + ".str_ln_cd", "unschd_strg_str_ln_cd"),
				MCItemDef.create("unschd_strg_str_ln_p" + ".str_ln_cd_none_flg", "unschd_strg_str_ln_cd_none_flg"),
				MCItemDef.create("unschd_oper_ptn", "unschd_oper_ptn"),
				MCItemDef.create("unschd_lot_no_p" + ".lot_no", "unschd_lot_no"),
				MCItemDef.create("unschd_lot_no_p" + ".sublot_no", "unschd_sublot_no"),
				MCItemDef.create("unschd_sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "unschd_sno1"),
				MCItemDef.create("unschd_sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "unschd_sno2"),
				MCItemDef.create("unschd_sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "unschd_sno3"),
				MCItemDef.create("unschd_sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "unschd_sno4"),
				MCItemDef.create("unschd_trd_unit_cd", "unschd_trd_unit_cd"),
				MCItemDef.create("unschd_trd_unit_yield_act_qty_p" + ".qty", "unschd_trd_unit_yield_act_qty"),
				MCItemDef.create("act_usr_dpt_p" + ".usr_cd", "act_usr_cd"),
				MCItemDef.create("act_usr_dpt_p" + ".dpt_cd", "act_usr_dpt_cd"),
				MCItemDef.create("act_rpt_rmrks", "mfg_act_rpt_rmrks"),
				MCItemDef.create("intr_rmrks", "mfg_act_intr_rmrks"),
				MCItemDef.create("mfg_act_sub_char1", "mfg_act_sub_char1"),
				MCItemDef.create("mfg_act_sub_char2", "mfg_act_sub_char2"),
				MCItemDef.create("mfg_act_sub_char3", "mfg_act_sub_char3"),
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}


	public static MCContainerDef MS_MSBCL1130_Imp01_DOWN_BLOCK0() {
	/** Ope.のBlock [Imp01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1130", "Imp01",
			new MCItemDef[]{
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("mfg_sts_typ_nm", "mfg_sts_typ_nm"),
				MCItemDef.create("st_act_p" + ".ymd", "st_act_tm"),
				MCItemDef.create("st_ac_dt_p" + ".ac_dt", "st_ac_dt"),
				MCItemDef.create("end_act_p" + ".ymd", "end_act_tm"),
				MCItemDef.create("end_ac_dt_p" + ".ac_dt", "end_ac_dt"),
				MCItemDef.create("unschd_master_dt", "unschd_master_dt"),
				MCItemDef.create("unschd_itm_p" + ".itm_cd", "unschd_itm_cd"),
				MCItemDef.create("unschd_itm_p" + ".itm_sub1", "unschd_itm_sub1"),
				MCItemDef.create("unschd_itm_p" + ".itm_sub2", "unschd_itm_sub2"),
				MCItemDef.create("unschd_itm_p" + ".itm_sub3", "unschd_itm_sub3"),
				MCItemDef.create("unschd_itm_p" + ".itm_nm", "unschd_itm_nm"),
				MCItemDef.create("unschd_lot_mng_typ", "unschd_lot_mng_typ"),
				MCItemDef.create("unschd_lot_no_typ", "unschd_lot_no_typ"),
				MCItemDef.create("unschd_lot_no_ptn_cd", "unschd_lot_no_ptn_cd"),
				MCItemDef.create("unschd_sublot_mng_typ", "unschd_sublot_mng_typ"),
				MCItemDef.create("unschd_sublot_no_typ", "unschd_sublot_no_typ"),
				MCItemDef.create("unschd_sublot_no_ptn_cd", "unschd_sublot_no_ptn_cd"),
				MCItemDef.create("unschd_sno1_mng_typ", "unschd_sno1_mng_typ"),
				MCItemDef.create("unschd_sno2_mng_typ", "unschd_sno2_mng_typ"),
				MCItemDef.create("unschd_sno3_mng_typ", "unschd_sno3_mng_typ"),
				MCItemDef.create("unschd_sno4_mng_typ", "unschd_sno4_mng_typ"),
				MCItemDef.create("unschd_mfg_loc_cd", "unschd_mfg_loc_cd"),
				MCItemDef.create("unschd_mfg_loc_nm", "unschd_mfg_loc_nm"),
				MCItemDef.create("unschd_mfg_str_ln_tgt_flg", "unschd_mfg_str_ln_tgt_flg"),
				MCItemDef.create("unschd_mfg_str_ln_p" + ".str_ln_cd", "unschd_mfg_str_ln_cd"),
				MCItemDef.create("unschd_mfg_str_ln_p" + ".str_ln_nm", "unschd_mfg_str_ln_nm"),
				MCItemDef.create("unschd_mfg_str_ln_p" + ".str_ln_cd_none_flg", "unschd_mfg_str_ln_cd_none_flg"),
				MCItemDef.create("unschd_mfg_loc_site_cd", "unschd_mfg_loc_site_cd"),
				MCItemDef.create("unschd_mfg_loc_site_nm", "unschd_mfg_loc_site_nm"),
				MCItemDef.create("unschd_mfg_loc_wg_cd", "unschd_mfg_loc_wg_cd"),
				MCItemDef.create("unschd_mfg_loc_wg_nm", "unschd_mfg_loc_wg_nm"),
				MCItemDef.create("unschd_bom_ptn", "unschd_bom_ptn"),
				MCItemDef.create("unschd_lot_issue_typ", "unschd_lot_issue_typ"),
				MCItemDef.create("unschd_ln_stk_flg", "unschd_ln_stk_flg"),
				MCItemDef.create("unschd_mst_yield_schd_qty", "unschd_mst_yield_schd_qty"),
				MCItemDef.create("unschd_mst_mfg_inst_qty", "unschd_mst_mfg_inst_qty"),
				MCItemDef.create("unschd_mst_fxd_rqmt_qty", "unschd_mst_fxd_rqmt_qty"),
				MCItemDef.create("unschd_strg_loc_cd", "unschd_strg_loc_cd"),
				MCItemDef.create("unschd_strg_loc_nm", "unschd_strg_loc_nm"),
				MCItemDef.create("unschd_strg_str_ln_tgt_flg", "unschd_strg_str_ln_tgt_flg"),
				MCItemDef.create("unschd_strg_str_ln_p" + ".str_ln_cd", "unschd_strg_str_ln_cd"),
				MCItemDef.create("unschd_strg_str_ln_p" + ".str_ln_nm", "unschd_strg_str_ln_nm"),
				MCItemDef.create("unschd_strg_str_ln_p" + ".str_ln_cd_none_flg", "unschd_strg_str_ln_cd_none_flg"),
				MCItemDef.create("unschd_oper_ptn", "unschd_oper_ptn"),
				MCItemDef.create("unschd_lot_no_p" + ".lot_no", "unschd_lot_no"),
				MCItemDef.create("unschd_lot_no_p" + ".sublot_no", "unschd_sublot_no"),
				MCItemDef.create("unschd_sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "unschd_sno1"),
				MCItemDef.create("unschd_sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "unschd_sno2"),
				MCItemDef.create("unschd_sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "unschd_sno3"),
				MCItemDef.create("unschd_sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "unschd_sno4"),
				MCItemDef.create("unschd_sno_p" + ".wrk_no", "unschd_wrk_no"),
				MCItemDef.create("unschd_sno_p" + ".wrk_nm", "unschd_wrk_nm"),
				MCItemDef.create("unschd_trd_unit_cd", "unschd_trd_unit_cd"),
				MCItemDef.create("unschd_trd_unit_nm", "unschd_trd_unit_nm"),
				MCItemDef.create("unschd_conv_base_qty", "unschd_conv_base_qty"),
				MCItemDef.create("unschd_conv_qty", "unschd_conv_qty"),
				MCItemDef.create("unschd_trd_unit_dec_place", "unschd_trd_unit_dec_place"),
				MCItemDef.create("unschd_trd_unit_rnd_typ", "unschd_trd_unit_rnd_typ"),
				MCItemDef.create("unschd_trd_unit_yield_act_qty_p" + ".qty", "unschd_trd_unit_yield_act_qty"),
				MCItemDef.create("unschd_base_unit_cd", "unschd_base_unit_cd"),
				MCItemDef.create("unschd_base_unit_nm", "unschd_base_unit_nm"),
				MCItemDef.create("unschd_base_unit_dec_place", "unschd_base_unit_dec_place"),
				MCItemDef.create("unschd_base_unit_conv_rnd_typ", "unschd_base_unit_conv_rnd_typ"),
				MCItemDef.create("unschd_base_unit_yield_act_qty_p" + ".qty", "unschd_base_unit_yield_act_qty"),
				MCItemDef.create("act_usr_dpt_p" + ".usr_cd", "act_usr_cd"),
				MCItemDef.create("act_usr_dpt_p" + ".usr_nm", "act_usr_nm"),
				MCItemDef.create("act_usr_dpt_p" + ".dpt_cd", "act_usr_dpt_cd"),
				MCItemDef.create("act_usr_dpt_p" + ".dpt_nm", "act_usr_dpt_nm"),
				MCItemDef.create("act_rpt_rmrks", "mfg_act_rpt_rmrks"),
				MCItemDef.create("intr_rmrks", "mfg_act_intr_rmrks"),
				MCItemDef.create("mfg_act_sub_char1", "mfg_act_sub_char1"),
				MCItemDef.create("mfg_act_sub_char2", "mfg_act_sub_char2"),
				MCItemDef.create("mfg_act_sub_char3", "mfg_act_sub_char3"),
				MCItemDef.create("rtn_msg_p" + ".rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("rtn_msg_p" + ".rtn_sts_typ_nm", "rtn_sts_typ_nm"),
				MCItemDef.create("rtn_msg_p" + ".msg_id", "msg_id"),
				MCItemDef.create("rtn_msg_p" + ".msg", "msg"),
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	public static MCContainerDef MS_MSBCL1130_Imp01_DOWN_BLOCK1() {
	/** Ope.のBlock [Imp01_DtlYieldByProd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1130", "Imp01",
			new MCItemDef[]{
				MCItemDef.create("unschd_yield_typ", "unschd_yield_typ"),
				MCItemDef.create("unschd_yield_typ_nm", "unschd_yield_typ_nm"),
				MCItemDef.create("unschd_itm_p" + ".itm_cd", "unschd_itm_cd"),
				MCItemDef.create("unschd_itm_p" + ".itm_sub1", "unschd_itm_sub1"),
				MCItemDef.create("unschd_itm_p" + ".itm_sub2", "unschd_itm_sub2"),
				MCItemDef.create("unschd_itm_p" + ".itm_sub3", "unschd_itm_sub3"),
				MCItemDef.create("unschd_itm_p" + ".itm_nm", "unschd_itm_nm"),
				MCItemDef.create("unschd_lot_no_p" + ".lot_no", "unschd_lot_no"),
				MCItemDef.create("unschd_lot_no_p" + ".sublot_no", "unschd_sublot_no"),
				MCItemDef.create("unschd_lot_mng_typ", "unschd_lot_mng_typ"),
				MCItemDef.create("unschd_lot_no_typ", "unschd_lot_no_typ"),
				MCItemDef.create("unschd_lot_no_ptn_cd", "unschd_lot_no_ptn_cd"),
				MCItemDef.create("unschd_sublot_mng_typ", "unschd_sublot_mng_typ"),
				MCItemDef.create("unschd_sublot_no_typ", "unschd_sublot_no_typ"),
				MCItemDef.create("unschd_sublot_no_ptn_cd", "unschd_sublot_no_ptn_cd"),
				MCItemDef.create("unschd_trd_unit_cd", "unschd_trd_unit_cd"),
				MCItemDef.create("unschd_trd_unit_nm", "unschd_trd_unit_nm"),
				MCItemDef.create("unschd_trd_unit_yield_act_qty_p" + ".qty", "unschd_trd_unit_yield_act_qty"),
				MCItemDef.create("unschd_trd_unit_dec_place", "unschd_trd_unit_dec_place"),
				MCItemDef.create("unschd_trd_unit_conv_rnd_typ", "unschd_trd_unit_conv_rnd_typ"),
				MCItemDef.create("unschd_base_unit_cd", "unschd_base_unit_cd"),
				MCItemDef.create("unschd_base_unit_nm", "unschd_base_unit_nm"),
				MCItemDef.create("unschd_base_unit_yield_act_qty_p" + ".qty", "unschd_base_unit_yield_act_qty"),
				MCItemDef.create("unschd_base_unit_dec_place", "unschd_base_unit_dec_place"),
				MCItemDef.create("unschd_base_unit_conv_rnd_typ", "unschd_base_unit_conv_rnd_typ"),
				MCItemDef.create("unschd_conv_base_qty", "unschd_conv_base_qty"),
				MCItemDef.create("unschd_conv_qty", "unschd_conv_qty"),
				MCItemDef.create("unschd_act_dt_p" + ".ymd", "unschd_act_tm"),
				MCItemDef.create("unschd_ac_dt_p" + ".ac_dt", "unschd_ac_dt"),
				MCItemDef.create("unschd_yield_rsn_cd", "unschd_yield_rsn_cd"),
				MCItemDef.create("unschd_yield_rsn_nm", "unschd_yield_rsn_nm"),
				MCItemDef.create("unschd_gd_cd", "unschd_gd_cd"),
				MCItemDef.create("unschd_gd_nm", "unschd_gd_nm"),
				MCItemDef.create("unschd_strg_loc_cd", "unschd_strg_loc_cd"),
				MCItemDef.create("unschd_strg_loc_nm", "unschd_strg_loc_nm"),
				MCItemDef.create("unschd_strg_str_ln_tgt_flg", "unschd_strg_str_ln_tgt_flg"),
				MCItemDef.create("unschd_strg_str_ln_p" + ".str_ln_cd", "unschd_strg_str_ln_cd"),
				MCItemDef.create("unschd_strg_str_ln_p" + ".str_ln_nm", "unschd_strg_str_ln_nm"),
				MCItemDef.create("unschd_strg_str_ln_p" + ".str_ln_cd_none_flg", "unschd_strg_str_ln_cd_none_flg"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no")
			}
			,
			MCBlockDef.create("RsltYieldByProd")
		);
	}
	
	static final MCOperationInfo MS_MSBCL1130_Ins01_INFO = new MCOperationInfo("MS", "MSBCL1130", "Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL1130_Ins01_UP_BLOCK0() {
		/** Ope.のBlock [Ins01_Ctrl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1130", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("act_immed_prnt_flg", "act_immed_prnt_flg"),
				MCItemDef.create("not_bkf_upd_flg", "not_bkf_upd_flg"),
				MCItemDef.create("not_wk_cost_upd_calc_flg", "not_wk_cost_upd_calc_flg")
			}
			,
			MCBlockDef.create("UnschdBulkSet")
		);
	}

	public static MCContainerDef MS_MSBCL1130_Ins01_UP_BLOCK1() {
		/** Ope.のBlock [Ins01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1130", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("st_act_p" + ".ymd", "st_act_tm"),
				MCItemDef.create("st_ac_dt_p" + ".ac_dt", "st_ac_dt"),
				MCItemDef.create("end_act_p" + ".ymd", "end_act_tm"),
				MCItemDef.create("end_ac_dt_p" + ".ac_dt", "end_ac_dt"),
				MCItemDef.create("unschd_master_dt", "unschd_master_dt"),
				MCItemDef.create("unschd_itm_p" + ".itm_cd", "unschd_itm_cd"),
				MCItemDef.create("unschd_itm_p" + ".itm_sub1", "unschd_itm_sub1"),
				MCItemDef.create("unschd_itm_p" + ".itm_sub2", "unschd_itm_sub2"),
				MCItemDef.create("unschd_itm_p" + ".itm_sub3", "unschd_itm_sub3"),
				MCItemDef.create("unschd_mfg_loc_cd", "unschd_mfg_loc_cd"),
				MCItemDef.create("unschd_mfg_str_ln_p" + ".str_ln_cd", "unschd_mfg_str_ln_cd"),
				MCItemDef.create("unschd_mfg_str_ln_p" + ".str_ln_cd_none_flg", "unschd_mfg_str_ln_cd_none_flg"),
				MCItemDef.create("unschd_bom_ptn", "unschd_bom_ptn"),
				MCItemDef.create("unschd_strg_loc_cd", "unschd_strg_loc_cd"),
				MCItemDef.create("unschd_strg_str_ln_p" + ".str_ln_cd", "unschd_strg_str_ln_cd"),
				MCItemDef.create("unschd_strg_str_ln_p" + ".str_ln_cd_none_flg", "unschd_strg_str_ln_cd_none_flg"),
				MCItemDef.create("unschd_oper_ptn", "unschd_oper_ptn"),
				MCItemDef.create("unschd_lot_no_p" + ".lot_no", "unschd_lot_no"),
				MCItemDef.create("unschd_lot_no_p" + ".sublot_no", "unschd_sublot_no"),
				MCItemDef.create("unschd_sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "unschd_sno1"),
				MCItemDef.create("unschd_sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "unschd_sno2"),
				MCItemDef.create("unschd_sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "unschd_sno3"),
				MCItemDef.create("unschd_sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "unschd_sno4"),
				MCItemDef.create("unschd_trd_unit_cd", "unschd_trd_unit_cd"),
				MCItemDef.create("unschd_trd_unit_yield_act_qty_p" + ".qty", "unschd_trd_unit_yield_act_qty"),
				MCItemDef.create("act_usr_dpt_p" + ".usr_cd", "act_usr_cd"),
				MCItemDef.create("act_usr_dpt_p" + ".dpt_cd", "act_usr_dpt_cd"),
				MCItemDef.create("act_rpt_rmrks", "mfg_act_rpt_rmrks"),
				MCItemDef.create("intr_rmrks", "mfg_act_intr_rmrks"),
				MCItemDef.create("mfg_act_sub_char1", "mfg_act_sub_char1"),
				MCItemDef.create("mfg_act_sub_char2", "mfg_act_sub_char2"),
				MCItemDef.create("mfg_act_sub_char3", "mfg_act_sub_char3"),
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}

	public static MCContainerDef MS_MSBCL1130_Ins01_UP_BLOCK2() {
		/** Ope.のBlock [Ins01_DtlYieldByProd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1130", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("unschd_yield_typ", "unschd_yield_typ"),
				MCItemDef.create("unschd_itm_p" + ".itm_cd", "unschd_itm_cd"),
				MCItemDef.create("unschd_itm_p" + ".itm_sub1", "unschd_itm_sub1"),
				MCItemDef.create("unschd_itm_p" + ".itm_sub2", "unschd_itm_sub2"),
				MCItemDef.create("unschd_itm_p" + ".itm_sub3", "unschd_itm_sub3"),
				MCItemDef.create("unschd_lot_no_p" + ".lot_no", "unschd_lot_no"),
				MCItemDef.create("unschd_lot_no_p" + ".sublot_no", "unschd_sublot_no"),
				MCItemDef.create("unschd_same_lot_flg", "unschd_same_lot_flg"),
				MCItemDef.create("unschd_trd_unit_cd", "unschd_trd_unit_cd"),
				MCItemDef.create("unschd_trd_unit_yield_act_qty_p" + ".qty", "unschd_trd_unit_yield_act_qty"),
				MCItemDef.create("unschd_act_dt_p" + ".ymd", "unschd_act_tm"),
				MCItemDef.create("unschd_ac_dt_p" + ".ac_dt", "unschd_ac_dt"),
				MCItemDef.create("unschd_yield_rsn_cd", "unschd_yield_rsn_cd"),
				MCItemDef.create("unschd_gd_cd", "unschd_gd_cd"),
				MCItemDef.create("unschd_strg_loc_cd", "unschd_strg_loc_cd"),
				MCItemDef.create("unschd_strg_str_ln_p" + ".str_ln_cd", "unschd_strg_str_ln_cd"),
				MCItemDef.create("unschd_strg_str_ln_p" + ".str_ln_cd_none_flg", "unschd_strg_str_ln_cd_none_flg"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("yield_rate", "yield_rate"),
				MCItemDef.create("insp_cnt_rmrks", "insp_cnt_rmrks"),
				MCItemDef.create("yield_act_intr_rmrks", "yield_act_intr_rmrks"),
				MCItemDef.create("yield_act_rpt_rmrks", "yield_act_rpt_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("yield_act_sub_char1", "yield_act_sub_char1"),
				MCItemDef.create("yield_act_sub_char2", "yield_act_sub_char2"),
				MCItemDef.create("yield_act_sub_char3", "yield_act_sub_char3")
			}
			,
			MCBlockDef.create("RsltYieldByProd")
		);
	}


	public static MCContainerDef MS_MSBCL1130_Ins01_DOWN_BLOCK0() {
	/** Ope.のBlock [Ins01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1130", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("unschd_lot_no_p" + ".lot_no", "unschd_lot_no"),
				MCItemDef.create("unschd_lot_no_p" + ".sublot_no", "unschd_sublot_no"),
				MCItemDef.create("rtn_msg_p" + ".rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("rtn_msg_p" + ".rtn_sts_typ_nm", "rtn_sts_typ_nm"),
				MCItemDef.create("rtn_msg_p" + ".msg_id", "msg_id"),
				MCItemDef.create("rtn_msg_p" + ".msg", "msg"),
				MCItemDef.create("mfg_act_no", "mfg_act_no")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	public static MCContainerDef MS_MSBCL1130_Ins01_DOWN_BLOCK1() {
	/** Ope.のBlock [Ins01_DtlYieldByProd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1130", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("unschd_lot_no_p" + ".lot_no", "unschd_lot_no"),
				MCItemDef.create("unschd_lot_no_p" + ".sublot_no", "unschd_sublot_no"),
				MCItemDef.create("yield_act_no", "yield_act_no"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("RsltYieldByProd")
		);
	}
	
	static final MCOperationInfo MS_MSBCL1130_Upd01_INFO = new MCOperationInfo("MS", "MSBCL1130", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL1130_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Ctrl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1130", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("oper_unit_flg", "oper_unit_flg"),
				MCItemDef.create("act_immed_prnt_flg", "act_immed_prnt_flg"),
				MCItemDef.create("not_bkf_upd_flg", "not_bkf_upd_flg"),
				MCItemDef.create("not_wk_cost_upd_calc_flg", "not_wk_cost_upd_calc_flg")
			}
			,
			MCBlockDef.create("ActBulkSet")
		);
	}

	public static MCContainerDef MS_MSBCL1130_Upd01_UP_BLOCK1() {
		/** Ope.のBlock [Upd01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1130", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("st_act_p" + ".ymd", "st_act_tm"),
				MCItemDef.create("st_ac_dt_p" + ".ac_dt", "st_ac_dt"),
				MCItemDef.create("end_act_p" + ".ymd", "end_act_tm"),
				MCItemDef.create("end_ac_dt_p" + ".ac_dt", "end_ac_dt"),
				MCItemDef.create("base_unit_st_act_qty_p" + ".qty", "base_unit_st_act_qty"),
				MCItemDef.create("rem_abort_flg", "rem_abort_flg"),
				MCItemDef.create("act_usr_dpt_p" + ".usr_cd", "act_usr_cd"),
				MCItemDef.create("act_usr_dpt_p" + ".dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_rpt_rmrks", "mfg_act_rpt_rmrks"),
				MCItemDef.create("intr_rmrks", "mfg_act_intr_rmrks"),
				MCItemDef.create("mfg_act_sub_char1", "mfg_act_sub_char1"),
				MCItemDef.create("mfg_act_sub_char2", "mfg_act_sub_char2"),
				MCItemDef.create("mfg_act_sub_char3", "mfg_act_sub_char3"),
				MCItemDef.create("itm_yield", "itm_yield"),
				MCItemDef.create("oper_unit_act_qty_p" + ".qty", "oper_unit_act_qty"),
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
				MCItemDef.create("not_cmpl_flg", "not_cmpl_flg")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}

	public static MCContainerDef MS_MSBCL1130_Upd01_UP_BLOCK2() {
		/** Ope.のBlock [Upd01_DtlYieldByProd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1130", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("yield_typ", "yield_typ"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_yield_act_qty_p" + ".qty", "trd_unit_yield_act_qty"),
				MCItemDef.create("act_dt_p" + ".ymd", "act_tm"),
				MCItemDef.create("ac_dt_p" + ".ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt_p" + ".can_ac_dt_for_call", "can_ac_dt"),
				MCItemDef.create("lot_no_p" + ".lot_no", "lot_no"),
				MCItemDef.create("lot_no_p" + ".sublot_no", "sublot_no"),
				MCItemDef.create("same_lot_flg", "same_lot_flg"),
				MCItemDef.create("sno_p" + ".sno1", "sno1"),
				MCItemDef.create("sno_p" + ".sno2", "sno2"),
				MCItemDef.create("sno_p" + ".sno3", "sno3"),
				MCItemDef.create("sno_p" + ".sno4", "sno4"),
				MCItemDef.create("yield_rsn_cd", "yield_rsn_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_str_ln_p" + ".str_ln_cd", "strg_str_ln_cd"),
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
				MCItemDef.create("oper_act_no", "oper_act_no")
			}
			,
			MCBlockDef.create("RsltYieldByProd")
		);
	}


	public static MCContainerDef MS_MSBCL1130_Upd01_DOWN_BLOCK0() {
	/** Ope.のBlock [Upd01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1130", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("mfg_sts_typ_nm", "mfg_sts_typ_nm"),
				MCItemDef.create("oper_act_no", "oper_act_no"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("rtn_msg_p" + ".rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	public static MCContainerDef MS_MSBCL1130_Upd01_DOWN_BLOCK1() {
	/** Ope.のBlock [Upd01_DtlYieldByProd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1130", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("lot_no_p" + ".lot_no", "lot_no"),
				MCItemDef.create("lot_no_p" + ".sublot_no", "sublot_no"),
				MCItemDef.create("yield_act_no", "yield_act_no"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("RsltYieldByProd")
		);
	}
	
	static final MCOperationInfo MS_MSBCL1130_Upd02_INFO = new MCOperationInfo("MS", "MSBCL1130", "Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBCL1130_Upd02_UP_BLOCK0() {
		/** Ope.のBlock [Upd02_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1130", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("aprv_dt", "aprv_dt"),
				MCItemDef.create("aprv_tm", "aprv_tm"),
				MCItemDef.create("aprv_usr_dpt_p" + ".dpt_cd", "aprv_dpt_cd"),
				MCItemDef.create("aprv_usr_dpt_p" + ".usr_cd", "aprv_usr_cd"),
				MCItemDef.create("aprv_rsn_p" + ".txt", "aprv_rsn"),
				MCItemDef.create("mfg_inst_upd_cntr", "mfg_inst_upd_cntr"),
				MCItemDef.create("mfg_act_upd_cntr", "mfg_act_upd_cntr"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}

	public static MCContainerDef MS_MSBCL1130_Upd02_UP_BLOCK1() {
		/** Ope.のBlock [Upd02_BulkSet] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1130", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("aprv_rsn_p" + ".txt", "aprv_rsn")
			}
			,
			MCBlockDef.create("AprvBulkSet")
		);
	}


	public static MCContainerDef MS_MSBCL1130_Upd02_DOWN_BLOCK0() {
	/** Ope.のBlock [Upd02_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1130", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("mfg_aprv_sts_typ", "mfg_aprv_sts_typ"),
				MCItemDef.create("mfg_aprv_sts_typ_nm", "mfg_aprv_sts_typ_nm"),
				MCItemDef.create("rtn_msg_p" + ".rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBCL1130_Del01_INFO = new MCOperationInfo("MS", "MSBCL1130", "Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL1130_Del01_UP_BLOCK0() {
		/** Ope.のBlock [Del01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1130", "Del01",
			new MCItemDef[]{
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("mfg_inst_upd_cntr", "mfg_inst_upd_cntr"),
				MCItemDef.create("mfg_inst_pr_upd_cntr", "mfg_inst_pr_upd_cntr"),
				MCItemDef.create("mfg_act_upd_cntr", "mfg_act_upd_cntr"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}


	public static MCContainerDef MS_MSBCL1130_Del01_DOWN_BLOCK0() {
	/** Ope.のBlock [Del01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1130", "Del01",
			new MCItemDef[]{
				MCItemDef.create("rtn_msg_p" + ".rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBCL1130_Del02_INFO = new MCOperationInfo("MS", "MSBCL1130", "Del02", "000000", new PDef());

	public static MCContainerDef MS_MSBCL1130_Del02_UP_BLOCK0() {
		/** Ope.のBlock [Del02_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1130", "Del02",
			new MCItemDef[]{
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("aprv_rsn_p" + ".txt", "aprv_rsn"),
				MCItemDef.create("mfg_inst_upd_cntr", "mfg_inst_upd_cntr"),
				MCItemDef.create("mfg_act_upd_cntr", "mfg_act_upd_cntr"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}

	public static MCContainerDef MS_MSBCL1130_Del02_UP_BLOCK1() {
		/** Ope.のBlock [Del02_BulkSet] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1130", "Del02",
			new MCItemDef[]{
				MCItemDef.create("aprv_rsn_p" + ".txt", "aprv_rsn")
			}
			,
			MCBlockDef.create("AprvBulkSet")
		);
	}


	public static MCContainerDef MS_MSBCL1130_Del02_DOWN_BLOCK0() {
	/** Ope.のBlock [Del02_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1130", "Del02",
			new MCItemDef[]{
				MCItemDef.create("mfg_aprv_sts_typ", "mfg_aprv_sts_typ"),
				MCItemDef.create("mfg_aprv_sts_typ_nm", "mfg_aprv_sts_typ_nm"),
				MCItemDef.create("rtn_msg_p" + ".rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBCL1130_Prnt01_INFO = new MCOperationInfo("MS", "MSBCL1130", "Prnt01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL1130_Prnt01_UP_BLOCK0() {
		/** Ope.のBlock [Prnt01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1130", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("div_seq", "div_seq")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}


	public static MCContainerDef MS_MSBCL1130_Prnt01_DOWN_BLOCK0() {
	/** Ope.のBlock [Prnt01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1130", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("act_prnt_flg", "act_prnt_flg"),
				MCItemDef.create("act_prnt_tm", "act_prnt_tm"),
				MCItemDef.create("rtn_msg_p" + ".rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

