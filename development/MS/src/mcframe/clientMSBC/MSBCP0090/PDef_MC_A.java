package mcframe.clientMSBC.MSBCP0090;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MSBCP_OperOrdPrgSrch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBCL0090.Srch01.UP.BLOCK0")){
			return MS_MSBCL0090_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0090.Srch01.DOWN.BLOCK0")){
			return MS_MSBCL0090_Srch01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MS_MSBCL0090_Srch01_INFO = new MCOperationInfo("MS", "MSBCL0090", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL0090_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL0090", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("opn_flg", "opn_flg"),
				MCItemDef.create("sav_flg", "sav_flg"),
				MCItemDef.create("fix_flg", "fix_flg"),
				MCItemDef.create("part_inst_flg", "part_inst_flg"),
				MCItemDef.create("inst_flg", "inst_flg"),
				MCItemDef.create("cmpl_flg", "cmpl_flg"),
				MCItemDef.create("ord_rcv_tgt_flg", "ord_rcv_tgt_flg"),
				MCItemDef.create("not_ord_rcv_tgt_flg", "not_ord_rcv_tgt_flg"),
				MCItemDef.create("ord_snd_tgt_flg", "ord_snd_tgt_flg"),
				MCItemDef.create("not_ord_snd_tgt_flg", "not_ord_snd_tgt_flg"),
				MCItemDef.create("stSchd_p" + ".ymd_fr", "st_schd_dt_fr"),
				MCItemDef.create("stSchd_p" + ".hm_fr", "st_schd_hm_fr"),
				MCItemDef.create("stSchd_p" + ".ymd_to", "st_schd_dt_to"),
				MCItemDef.create("stSchd_p" + ".hm_to", "st_schd_hm_to"),
				MCItemDef.create("endSchd_p" + ".ymd_fr", "end_schd_dt_fr"),
				MCItemDef.create("endSchd_p" + ".hm_fr", "end_schd_hm_fr"),
				MCItemDef.create("endSchd_p" + ".ymd_to", "end_schd_dt_to"),
				MCItemDef.create("endSchd_p" + ".hm_to", "end_schd_hm_to"),
				MCItemDef.create("mfg_st_schd_dt_fr", "mfg_st_schd_dt_fr"),
				MCItemDef.create("mfg_st_schd_dt_to", "mfg_st_schd_dt_to"),
				MCItemDef.create("mfg_end_schd_dt_fr", "mfg_end_schd_dt_fr"),
				MCItemDef.create("mfg_end_schd_dt_to", "mfg_end_schd_dt_to"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("mfg_site_cd", "mfg_site_cd"),
				MCItemDef.create("mfg_site_nm", "mfg_site_nm"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("itm_typ_p" + ".itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_p" + ".itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_p" + ".itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("sno_wrk_no_p" + ".sno1", "sno1"),
				MCItemDef.create("sno_wrk_no_p" + ".sno2", "sno2"),
				MCItemDef.create("sno_wrk_no_p" + ".sno3", "sno3"),
				MCItemDef.create("sno_wrk_no_p" + ".sno4", "sno4"),
				MCItemDef.create("sno_wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("sno_wrk_no_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("oper_rsrc", "oper_rsrc"),
				MCItemDef.create("oper_ord_no", "oper_ord_no"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("rmrks", "rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_sys_nm", "ext_sys_nm"),
				MCItemDef.create("ext_itm_ord_no", "ext_itm_ord_no"),
				MCItemDef.create("ext_oper_ord_no", "ext_oper_ord_no"),
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
				MCItemDef.create("oper_qty_red_flg", "oper_qty_red_flg"),
				MCItemDef.create("st_dt_red_flg", "st_dt_red_flg"),
				MCItemDef.create("end_dt_red_flg", "end_dt_red_flg"),
				MCItemDef.create("no_problem_flg", "no_problem_flg")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBCL0090_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL0090", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("oper_ord_no", "oper_ord_no"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("oper_ord_sts_typ", "oper_ord_sts_typ"),
				MCItemDef.create("oper_ord_sts_typ_nm", "oper_ord_sts_typ_nm"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("mfg_st_schd_dt", "mfg_st_schd_dt"),
				MCItemDef.create("mfg_end_schd_dt", "mfg_end_schd_dt"),
				MCItemDef.create("st_schd_tm_p" + ".ymd", "st_schd_dt"),
				MCItemDef.create("st_schd_tm_p" + ".hm", "st_schd_hm"),
				MCItemDef.create("inst_st_schd_tm_p" + ".ymd", "inst_st_schd_dt"),
				MCItemDef.create("inst_st_schd_tm_p" + ".hm", "inst_st_schd_hm"),
				MCItemDef.create("act_st_tm_p" + ".ymd", "act_st_dt"),
				MCItemDef.create("act_st_tm_p" + ".hm", "act_st_hm"),
				MCItemDef.create("end_schd_tm_p" + ".ymd", "end_schd_dt"),
				MCItemDef.create("end_schd_tm_p" + ".hm", "end_schd_hm"),
				MCItemDef.create("inst_end_schd_tm_p" + ".ymd", "inst_end_schd_dt"),
				MCItemDef.create("inst_end_schd_tm_p" + ".hm", "inst_end_schd_hm"),
				MCItemDef.create("act_end_tm_p" + ".ymd", "act_end_dt"),
				MCItemDef.create("act_end_tm_p" + ".hm", "act_end_hm"),
				MCItemDef.create("mfg_site_cd", "mfg_site_cd"),
				MCItemDef.create("mfg_site_nm", "mfg_site_nm"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("oper_schd_qty_p" + ".qty", "oper_schd_qty"),
				MCItemDef.create("oper_int_schd_qty_p" + ".qty", "oper_int_schd_qty"),
				MCItemDef.create("oper_act_qty_p" + ".qty", "oper_act_qty"),
				MCItemDef.create("oper_unit_cd", "oper_unit_cd"),
				MCItemDef.create("oper_unit_nm", "oper_unit_nm"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
				MCItemDef.create("sno_wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("sno_wrk_no_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("oper_rsrc", "oper_rsrc"),
				MCItemDef.create("rmrks", "rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("ord_rcv_flg", "ord_rcv_flg"),
				MCItemDef.create("ord_snd_flg", "ord_snd_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_sys_nm", "ext_sys_nm"),
				MCItemDef.create("ext_itm_ord_no", "ext_itm_ord_no"),
				MCItemDef.create("for_scheduler_frozen_flg", "for_scheduler_frozen_flg"),
				MCItemDef.create("ext_oper_ord_no", "ext_oper_ord_no"),
				MCItemDef.create("scheduler_frozen_flg", "scheduler_frozen_flg"),
				MCItemDef.create("oper_qty_red_flg", "oper_qty_red_flg"),
				MCItemDef.create("st_dt_red_flg", "st_dt_red_flg"),
				MCItemDef.create("end_dt_red_flg", "end_dt_red_flg"),
				MCItemDef.create("no_problem_flg", "no_problem_flg"),
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
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("dec_place", "dec_place")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

