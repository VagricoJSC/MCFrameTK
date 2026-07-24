package mcframe.serverMSBC.MSBCL0100;

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
 * [MSBCL_OperOrdSrch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBCL0100.Srch01.UP.BLOCK0")){
			return MS_MSBCL0100_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0100.Srch01.DOWN.BLOCK0")){
			return MS_MSBCL0100_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0100.Chk01.UP.BLOCK0")){
			return MS_MSBCL0100_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0100.Chk01.DOWN.BLOCK0")){
			return MS_MSBCL0100_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0100.Chk02.UP.BLOCK0")){
			return MS_MSBCL0100_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0100.Chk02.DOWN.BLOCK0")){
			return MS_MSBCL0100_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0100.Upd01.UP.BLOCK0")){
			return MS_MSBCL0100_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0100.Upd01.DOWN.BLOCK0")){
			return MS_MSBCL0100_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0100.Imp01.UP.BLOCK0")){
			return MS_MSBCL0100_Imp01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0100.Imp01.DOWN.BLOCK0")){
			return MS_MSBCL0100_Imp01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
					
	
	static final MCOperationInfo MS_MSBCL0100_Srch01_INFO = new MCOperationInfo("MS", "MSBCL0100", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL0100_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0100", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ope", "ope"),
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
				MCItemDef.create("st_schd_dt_fr", "st_schd_dt_fr"),
				MCItemDef.create("st_schd_hm_fr", "st_schd_hm_fr"),
				MCItemDef.create("st_schd_dt_to", "st_schd_dt_to"),
				MCItemDef.create("st_schd_hm_to", "st_schd_hm_to"),
				MCItemDef.create("end_schd_dt_fr", "end_schd_dt_fr"),
				MCItemDef.create("end_schd_hm_fr", "end_schd_hm_fr"),
				MCItemDef.create("end_schd_dt_to", "end_schd_dt_to"),
				MCItemDef.create("end_schd_hm_to", "end_schd_hm_to"),
				MCItemDef.create("gi_schd_flg", "gi_schd_flg"),
				MCItemDef.create("gi_schd_dt_fr", "gi_schd_dt_fr"),
				MCItemDef.create("gi_schd_hm_fr", "gi_schd_hm_fr"),
				MCItemDef.create("gi_schd_dt_to", "gi_schd_dt_to"),
				MCItemDef.create("gi_schd_hm_to", "gi_schd_hm_to"),
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
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
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
				MCItemDef.create("itm_grp_flg1", "itm_grp_flg1"),
				MCItemDef.create("itm_grp_cd1", "itm_grp_cd1"),
				MCItemDef.create("itm_grp_nm1", "itm_grp_nm1"),
				MCItemDef.create("itm_grp_flg2", "itm_grp_flg2"),
				MCItemDef.create("itm_grp_cd2", "itm_grp_cd2"),
				MCItemDef.create("itm_grp_nm2", "itm_grp_nm2"),
				MCItemDef.create("itm_grp_flg3", "itm_grp_flg3"),
				MCItemDef.create("itm_grp_cd3", "itm_grp_cd3"),
				MCItemDef.create("itm_grp_nm3", "itm_grp_nm3"),
				MCItemDef.create("itm_grp_flg4", "itm_grp_flg4"),
				MCItemDef.create("itm_grp_cd4", "itm_grp_cd4"),
				MCItemDef.create("itm_grp_nm4", "itm_grp_nm4"),
				MCItemDef.create("itm_grp_flg5", "itm_grp_flg5"),
				MCItemDef.create("itm_grp_cd5", "itm_grp_cd5"),
				MCItemDef.create("itm_grp_nm5", "itm_grp_nm5"),
				MCItemDef.create("itm_grp_flg6", "itm_grp_flg6"),
				MCItemDef.create("itm_grp_cd6", "itm_grp_cd6"),
				MCItemDef.create("itm_grp_nm6", "itm_grp_nm6"),
				MCItemDef.create("itm_grp_flg7", "itm_grp_flg7"),
				MCItemDef.create("itm_grp_cd7", "itm_grp_cd7"),
				MCItemDef.create("itm_grp_nm7", "itm_grp_nm7"),
				MCItemDef.create("itm_grp_flg8", "itm_grp_flg8"),
				MCItemDef.create("itm_grp_cd8", "itm_grp_cd8"),
				MCItemDef.create("itm_grp_nm8", "itm_grp_nm8"),
				MCItemDef.create("itm_grp_flg9", "itm_grp_flg9"),
				MCItemDef.create("itm_grp_cd9", "itm_grp_cd9"),
				MCItemDef.create("itm_grp_nm9", "itm_grp_nm9"),
				MCItemDef.create("itm_grp_flg10", "itm_grp_flg10"),
				MCItemDef.create("itm_grp_cd10", "itm_grp_cd10"),
				MCItemDef.create("itm_grp_nm10", "itm_grp_nm10")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBCL0100_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0100", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("gi_schd_dt", "gi_schd_dt"),
				MCItemDef.create("gi_schd_hm", "gi_schd_hm"),
				MCItemDef.create("oper_ord_no", "oper_ord_no"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("itm_ord_sts_typ", "itm_ord_sts_typ"),
				MCItemDef.create("itm_ord_sts_typ_nm", "itm_ord_sts_typ_nm"),
				MCItemDef.create("oper_ord_sts_typ", "oper_ord_sts_typ"),
				MCItemDef.create("oper_ord_sts_typ_nm", "oper_ord_sts_typ_nm"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("mfg_st_schd_dt", "mfg_st_schd_dt"),
				MCItemDef.create("mfg_end_schd_dt", "mfg_end_schd_dt"),
				MCItemDef.create("st_schd_dt", "st_schd_dt"),
				MCItemDef.create("st_schd_hm", "st_schd_hm"),
				MCItemDef.create("inst_st_schd_dt", "inst_st_schd_dt"),
				MCItemDef.create("inst_st_schd_hm", "inst_st_schd_hm"),
				MCItemDef.create("act_st_dt", "act_st_dt"),
				MCItemDef.create("act_st_hm", "act_st_hm"),
				MCItemDef.create("end_schd_dt", "end_schd_dt"),
				MCItemDef.create("end_schd_hm", "end_schd_hm"),
				MCItemDef.create("inst_end_schd_dt", "inst_end_schd_dt"),
				MCItemDef.create("inst_end_schd_hm", "inst_end_schd_hm"),
				MCItemDef.create("act_end_dt", "act_end_dt"),
				MCItemDef.create("act_end_hm", "act_end_hm"),
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
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("oper_schd_qty", "oper_schd_qty"),
				MCItemDef.create("oper_inst_schd_qty", "oper_inst_schd_qty"),
				MCItemDef.create("oper_act_qty", "oper_act_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_dec_place", "base_dec_place"),
				MCItemDef.create("oper_unit_schd_qty", "oper_unit_schd_qty"),
				MCItemDef.create("oper_unit_cd", "oper_unit_cd"),
				MCItemDef.create("oper_unit_nm", "oper_unit_nm"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
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
				MCItemDef.create("itm_grp_cd1", "itm_grp_cd1"),
				MCItemDef.create("itm_grp_nm1", "itm_grp_nm1"),
				MCItemDef.create("itm_grp_cd2", "itm_grp_cd2"),
				MCItemDef.create("itm_grp_nm2", "itm_grp_nm2"),
				MCItemDef.create("itm_grp_cd3", "itm_grp_cd3"),
				MCItemDef.create("itm_grp_nm3", "itm_grp_nm3"),
				MCItemDef.create("itm_grp_cd4", "itm_grp_cd4"),
				MCItemDef.create("itm_grp_nm4", "itm_grp_nm4"),
				MCItemDef.create("itm_grp_cd5", "itm_grp_cd5"),
				MCItemDef.create("itm_grp_nm5", "itm_grp_nm5"),
				MCItemDef.create("itm_grp_cd6", "itm_grp_cd6"),
				MCItemDef.create("itm_grp_nm6", "itm_grp_nm6"),
				MCItemDef.create("itm_grp_cd7", "itm_grp_cd7"),
				MCItemDef.create("itm_grp_nm7", "itm_grp_nm7"),
				MCItemDef.create("itm_grp_cd8", "itm_grp_cd8"),
				MCItemDef.create("itm_grp_nm8", "itm_grp_nm8"),
				MCItemDef.create("itm_grp_cd9", "itm_grp_cd9"),
				MCItemDef.create("itm_grp_nm9", "itm_grp_nm9"),
				MCItemDef.create("itm_grp_cd10", "itm_grp_cd10"),
				MCItemDef.create("itm_grp_nm10", "itm_grp_nm10"),
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
				MCItemDef.create("oper_inst_std_qty", "oper_inst_std_qty"),
				MCItemDef.create("oper_inst_conv_qty", "oper_inst_conv_qty"),
				MCItemDef.create("oper_unit_conv_rnd_typ", "oper_unit_conv_rnd_typ"),
				MCItemDef.create("oper_unit_dec_place", "oper_unit_dec_place"),
				MCItemDef.create("oper_std_qty", "oper_std_qty"),
				MCItemDef.create("oper_conv_qty", "oper_conv_qty"),
				MCItemDef.create("unit_conv_rnd_typ", "unit_conv_rnd_typ"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("itm_order_upd_cntr", "itm_order_upd_cntr")
			}
			,
			MCBlockDef.create("Srch01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBCL0100_Chk01_INFO = new MCOperationInfo("MS", "MSBCL0100", "Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL0100_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0100", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("ord" + ".itm_ord_no", "itm_ord_no"),
				MCItemDef.create("ord" + ".itm_cd", "itm_cd"),
				MCItemDef.create("ord" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("ord" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("ord" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("ord" + ".oper_ptn", "oper_ptn"),
				MCItemDef.create("ord" + ".upd_cntr", "itm_order_upd_cntr"),
				MCItemDef.create("ord" + ".ord_rcv_flg", "ord_rcv_flg"),
				MCItemDef.create("ord" + ".ord_snd_flg", "ord_snd_flg"),
				MCItemDef.create("ord" + ".ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ord" + ".ext_itm_ord_no", "ext_itm_ord_no"),
				MCItemDef.create("ord" + ".for_scheduler_frozen_flg", "for_scheduler_frozen_flg"),
				MCItemDef.create("peg_no_d", "peg_no_d"),
				MCItemDef.create("oord" + ".oper_ord_no", "oper_ord_no"),
				MCItemDef.create("oord" + ".oper_ord_sts_typ", "oper_ord_sts_typ"),
				MCItemDef.create("oord" + ".oper_cd", "oper_cd"),
				MCItemDef.create("oord" + ".oper_seq", "oper_seq"),
				MCItemDef.create("oord" + ".loc_cd", "loc_cd"),
				MCItemDef.create("oord" + ".oper_schd_qty", "oper_schd_qty"),
				MCItemDef.create("oord" + ".st_schd_tm", "st_schd_tm"),
				MCItemDef.create("oord" + ".end_schd_tm", "end_schd_tm"),
				MCItemDef.create("oord" + ".oper_rsrc", "oper_rsrc"),
				MCItemDef.create("oord" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("oord" + ".sub_char1", "sub_char1"),
				MCItemDef.create("oord" + ".sub_char2", "sub_char2"),
				MCItemDef.create("oord" + ".sub_char3", "sub_char3"),
				MCItemDef.create("oord" + ".ext_oper_ord_no", "ext_oper_ord_no"),
				MCItemDef.create("oord" + ".scheduler_frozen_flg", "scheduler_frozen_flg")
			}
			,
			MCBlockDef.create("Chk01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBCL0100_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0100", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("mrp_typ", "mrp_typ"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("ord" + ".itm_ord_no", "itm_ord_no"),
				MCItemDef.create("ord" + ".itm_ord_typ", "itm_ord_typ"),
				MCItemDef.create("ord" + ".ord_gnrt_typ", "ord_gnrt_typ"),
				MCItemDef.create("ord" + ".itm_cd", "itm_cd"),
				MCItemDef.create("ord" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("ord" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("ord" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("ord" + ".ver_no", "ver_no"),
				MCItemDef.create("ord" + ".strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("ord" + ".mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("ord" + ".mst_mfg_loc_cd", "mst_mfg_loc_cd"),
				MCItemDef.create("ord" + ".sppl_cd", "sppl_cd"),
				MCItemDef.create("ord" + ".maker_cd", "maker_cd"),
				MCItemDef.create("ord" + ".rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("ord" + ".rqst_wg_cd", "rqst_wg_cd"),
				MCItemDef.create("ord" + ".bom_ptn", "bom_ptn"),
				MCItemDef.create("ord" + ".oper_ptn", "oper_ptn"),
				MCItemDef.create("ord" + ".inst_qty", "inst_qty"),
				MCItemDef.create("ord" + ".yield_schd_qty", "yield_schd_qty"),
				MCItemDef.create("ord" + ".nmr_qty", "nmr_qty"),
				MCItemDef.create("ord" + ".dnm_qty", "dnm_qty"),
				MCItemDef.create("ord" + ".fxd_yield_qty", "fxd_yield_qty"),
				MCItemDef.create("ord" + ".itm_ord_sts_typ", "itm_ord_sts_typ"),
				MCItemDef.create("ord" + ".fix_dt", "fix_dt"),
				MCItemDef.create("ord" + ".po_schd_dt", "po_schd_dt"),
				MCItemDef.create("ord" + ".mrp_po_schd_dt", "mrp_po_schd_dt"),
				MCItemDef.create("ord" + ".mrp_purc_lt", "mrp_purc_lt"),
				MCItemDef.create("ord" + ".purc_lt", "purc_lt"),
				MCItemDef.create("ord" + ".mfg_st_schd_dt", "mfg_st_schd_dt"),
				MCItemDef.create("ord" + ".mrp_mfg_st_schd_dt", "mrp_mfg_st_schd_dt"),
				MCItemDef.create("ord" + ".mfg_end_schd_dt", "mfg_end_schd_dt"),
				MCItemDef.create("ord" + ".mrp_mfg_end_schd_dt", "mrp_mfg_end_schd_dt"),
				MCItemDef.create("ord" + ".mrp_mfg_lt", "mrp_mfg_lt"),
				MCItemDef.create("ord" + ".mfg_lt", "mfg_lt"),
				MCItemDef.create("ord" + ".gi_schd_dt", "gi_schd_dt"),
				MCItemDef.create("ord" + ".mrp_gi_schd_dt", "mrp_gi_schd_dt"),
				MCItemDef.create("ord" + ".strg_schd_dt", "strg_schd_dt"),
				MCItemDef.create("ord" + ".mrp_strg_schd_dt", "mrp_strg_schd_dt"),
				MCItemDef.create("ord" + ".xfr_lt", "xfr_lt"),
				MCItemDef.create("ord" + ".accpt_schd_dt", "accpt_schd_dt"),
				MCItemDef.create("ord" + ".mrp_accpt_schd_dt", "mrp_accpt_schd_dt"),
				MCItemDef.create("ord" + ".accpt_insp_lt", "accpt_insp_lt"),
				MCItemDef.create("ord" + ".insp_st_schd_dt", "insp_st_schd_dt"),
				MCItemDef.create("ord" + ".mrp_insp_st_schd_dt", "mrp_insp_st_schd_dt"),
				MCItemDef.create("ord" + ".insp_end_schd_dt", "insp_end_schd_dt"),
				MCItemDef.create("ord" + ".mrp_insp_end_schd_dt", "mrp_insp_end_schd_dt"),
				MCItemDef.create("ord" + ".insp_lt", "insp_lt"),
				MCItemDef.create("ord" + ".insp_offst", "insp_offst"),
				MCItemDef.create("ord" + ".avl_schd_dt", "avl_schd_dt"),
				MCItemDef.create("ord" + ".mrp_avl_schd_dt", "mrp_avl_schd_dt"),
				MCItemDef.create("ord" + ".master_dt", "master_dt"),
				MCItemDef.create("ord" + ".sno1", "sno1"),
				MCItemDef.create("ord" + ".sno_typ1", "sno_typ1"),
				MCItemDef.create("ord" + ".sno2", "sno2"),
				MCItemDef.create("ord" + ".sno_typ2", "sno_typ2"),
				MCItemDef.create("ord" + ".sno3", "sno3"),
				MCItemDef.create("ord" + ".sno_typ3", "sno_typ3"),
				MCItemDef.create("ord" + ".sno4", "sno4"),
				MCItemDef.create("ord" + ".sno_typ4", "sno_typ4"),
				MCItemDef.create("ord" + ".lmt_dt", "lmt_dt"),
				MCItemDef.create("ord" + ".wg_cd", "wg_cd"),
				MCItemDef.create("ord" + ".not_fix_flg", "not_fix_flg"),
				MCItemDef.create("ord" + ".ord_fix_pd", "ord_fix_pd"),
				MCItemDef.create("ord" + ".rqmt_no", "rqmt_no"),
				MCItemDef.create("ord" + ".inst_po_cnt_rmrks", "inst_po_cnt_rmrks"),
				MCItemDef.create("ord" + ".sim_mrp_no", "sim_mrp_no"),
				MCItemDef.create("ord" + ".io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("ord" + ".upd_cntr", "itm_order_upd_cntr"),
				MCItemDef.create("ord" + ".ord_rcv_flg", "ord_rcv_flg"),
				MCItemDef.create("ord" + ".ord_snd_flg", "ord_snd_flg"),
				MCItemDef.create("ord" + ".ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ord" + ".ext_itm_ord_no", "ext_itm_ord_no"),
				MCItemDef.create("ord" + ".for_scheduler_frozen_flg", "for_scheduler_frozen_flg"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("oper_ord_pr_flg", "oper_ord_pr_flg"),
				MCItemDef.create("io_schd_pr_flg", "io_schd_pr_flg"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("peg_no_d", "peg_no_d"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("oord" + ".oper_ord_no", "oper_ord_no"),
				MCItemDef.create("oord" + ".oper_ord_sts_typ", "oper_ord_sts_typ"),
				MCItemDef.create("oord" + ".oper_cd", "oper_cd"),
				MCItemDef.create("oord" + ".oper_seq", "oper_seq"),
				MCItemDef.create("oord" + ".loc_cd", "loc_cd"),
				MCItemDef.create("oord" + ".disp_seq", "disp_seq"),
				MCItemDef.create("oord" + ".oper_schd_qty", "oper_schd_qty"),
				MCItemDef.create("oord" + ".yield_oper_flg", "yield_oper_flg"),
				MCItemDef.create("oord" + ".st_schd_tm", "st_schd_tm"),
				MCItemDef.create("oord" + ".end_schd_tm", "end_schd_tm"),
				MCItemDef.create("oord" + ".oper_lt", "oper_lt"),
				MCItemDef.create("oord" + ".oper_offst_typ", "oper_offst_typ"),
				MCItemDef.create("oord" + ".oper_offst", "oper_offst"),
				MCItemDef.create("oord" + ".oper_rsrc", "oper_rsrc"),
				MCItemDef.create("oord" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("oord" + ".sub_char1", "sub_char1"),
				MCItemDef.create("oord" + ".sub_char2", "sub_char2"),
				MCItemDef.create("oord" + ".sub_char3", "sub_char3"),
				MCItemDef.create("oord" + ".ext_oper_ord_no", "ext_oper_ord_no"),
				MCItemDef.create("oord" + ".scheduler_frozen_flg", "scheduler_frozen_flg")
			}
			,
			MCBlockDef.create("Chk01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBCL0100_Chk02_INFO = new MCOperationInfo("MS", "MSBCL0100", "Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBCL0100_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0100", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("ord" + ".itm_ord_no", "itm_ord_no"),
				MCItemDef.create("ord" + ".itm_cd", "itm_cd"),
				MCItemDef.create("ord" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("ord" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("ord" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("ord" + ".oper_ptn", "oper_ptn"),
				MCItemDef.create("ord" + ".ord_rcv_flg", "ord_rcv_flg"),
				MCItemDef.create("ord" + ".ord_snd_flg", "ord_snd_flg"),
				MCItemDef.create("ord" + ".ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ord" + ".ext_itm_ord_no", "ext_itm_ord_no"),
				MCItemDef.create("ord" + ".for_scheduler_frozen_flg", "ord" + ".for_scheduler_frozen_flg"),
				MCItemDef.create("ext_sys_nm", "ext_sys_nm"),
				MCItemDef.create("oord" + ".oper_ord_sts_typ", "oper_ord_sts_typ"),
				MCItemDef.create("oord" + ".oper_cd", "oper_cd"),
				MCItemDef.create("oord" + ".oper_seq", "oper_seq"),
				MCItemDef.create("oord" + ".loc_cd", "loc_cd"),
				MCItemDef.create("oord" + ".oper_schd_qty", "oper_schd_qty"),
				MCItemDef.create("oord" + ".st_schd_tm", "st_schd_tm"),
				MCItemDef.create("oord" + ".end_schd_tm", "end_schd_tm"),
				MCItemDef.create("oord" + ".oper_rsrc", "oper_rsrc"),
				MCItemDef.create("oord" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("oord" + ".sub_char1", "sub_char1"),
				MCItemDef.create("oord" + ".sub_char2", "sub_char2"),
				MCItemDef.create("oord" + ".sub_char3", "sub_char3"),
				MCItemDef.create("oord" + ".ext_oper_ord_no", "ext_oper_ord_no"),
				MCItemDef.create("oord" + ".scheduler_frozen_flg", "scheduler_frozen_flg")
			}
			,
			MCBlockDef.create("Chk02_Dtl")
		);
	}


	public static MCContainerDef MS_MSBCL0100_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0100", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("ord" + ".itm_ord_no", "itm_ord_no"),
				MCItemDef.create("ord" + ".itm_cd", "itm_cd"),
				MCItemDef.create("ord" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("ord" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("ord" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("ord" + ".oper_ptn", "oper_ptn"),
				MCItemDef.create("ord" + ".mfg_st_schd_dt", "mfg_st_schd_dt"),
				MCItemDef.create("ord" + ".mfg_end_schd_dt", "mfg_end_schd_dt"),
				MCItemDef.create("ord" + ".sno1", "sno1"),
				MCItemDef.create("ord" + ".sno2", "sno2"),
				MCItemDef.create("ord" + ".sno3", "sno3"),
				MCItemDef.create("ord" + ".sno4", "sno4"),
				MCItemDef.create("ord" + ".wg_cd", "wg_cd"),
				MCItemDef.create("ord" + ".upd_cntr", "itm_order_upd_cntr"),
				MCItemDef.create("ord" + ".ord_rcv_flg", "ord_rcv_flg"),
				MCItemDef.create("ord" + ".ord_snd_flg", "ord_snd_flg"),
				MCItemDef.create("ord" + ".ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ord" + ".ext_itm_ord_no", "ext_itm_ord_no"),
				MCItemDef.create("ord" + ".for_scheduler_frozen_flg", "ord" + ".for_scheduler_frozen_flg"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("mfg_site_cd", "mfg_site_cd"),
				MCItemDef.create("mfg_site_nm", "mfg_site_nm"),
				MCItemDef.create("mfg_loc_grp_cd", "mfg_loc_grp_cd"),
				MCItemDef.create("mfg_loc_grp_nm", "mfg_loc_grp_nm"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("ext_sys_nm", "ext_sys_nm"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("oord" + ".oper_ord_sts_typ", "oper_ord_sts_typ"),
				MCItemDef.create("oord" + ".oper_cd", "oper_cd"),
				MCItemDef.create("oord" + ".oper_seq", "oper_seq"),
				MCItemDef.create("oord" + ".loc_cd", "loc_cd"),
				MCItemDef.create("oord" + ".oper_schd_qty", "oper_schd_qty"),
				MCItemDef.create("oord" + ".st_schd_tm", "st_schd_tm"),
				MCItemDef.create("oord" + ".end_schd_tm", "end_schd_tm"),
				MCItemDef.create("oord" + ".oper_rsrc", "oper_rsrc"),
				MCItemDef.create("oord" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("oord" + ".sub_char1", "sub_char1"),
				MCItemDef.create("oord" + ".sub_char2", "sub_char2"),
				MCItemDef.create("oord" + ".sub_char3", "sub_char3"),
				MCItemDef.create("oord" + ".ext_oper_ord_no", "ext_oper_ord_no"),
				MCItemDef.create("oord" + ".scheduler_frozen_flg", "scheduler_frozen_flg"),
				MCItemDef.create("oper_ord_sts_typ_nm", "oper_ord_sts_typ_nm"),
				MCItemDef.create("oper_nm", "oper_nm")
			}
			,
			MCBlockDef.create("Chk02_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBCL0100_Upd01_INFO = new MCOperationInfo("MS", "MSBCL0100", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL0100_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0100", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("ord" + ".itm_ord_no", "itm_ord_no"),
				MCItemDef.create("ord" + ".itm_cd", "itm_cd"),
				MCItemDef.create("ord" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("ord" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("ord" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("ord" + ".oper_ptn", "oper_ptn"),
				MCItemDef.create("ord" + ".upd_cntr", "itm_order_upd_cntr"),
				MCItemDef.create("ord" + ".ord_rcv_flg", "ord_rcv_flg"),
				MCItemDef.create("ord" + ".ord_snd_flg", "ord_snd_flg"),
				MCItemDef.create("ord" + ".ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ord" + ".ext_itm_ord_no", "ext_itm_ord_no"),
				MCItemDef.create("ord" + ".for_scheduler_frozen_flg", "for_scheduler_frozen_flg"),
				MCItemDef.create("oord" + ".oper_ord_no", "oper_ord_no"),
				MCItemDef.create("oord" + ".oper_ord_sts_typ", "oper_ord_sts_typ"),
				MCItemDef.create("oord" + ".oper_cd", "oper_cd"),
				MCItemDef.create("oord" + ".oper_seq", "oper_seq"),
				MCItemDef.create("oord" + ".loc_cd", "loc_cd"),
				MCItemDef.create("oord" + ".oper_schd_qty", "oper_schd_qty"),
				MCItemDef.create("oord" + ".st_schd_tm", "st_schd_tm"),
				MCItemDef.create("oord" + ".end_schd_tm", "end_schd_tm"),
				MCItemDef.create("oord" + ".oper_rsrc", "oper_rsrc"),
				MCItemDef.create("oord" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("oord" + ".sub_char1", "sub_char1"),
				MCItemDef.create("oord" + ".sub_char2", "sub_char2"),
				MCItemDef.create("oord" + ".sub_char3", "sub_char3"),
				MCItemDef.create("oord" + ".ext_oper_ord_no", "ext_oper_ord_no"),
				MCItemDef.create("oord" + ".scheduler_frozen_flg", "scheduler_frozen_flg")
			}
			,
			MCBlockDef.create("Upd01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBCL0100_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0100", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no_d", "peg_no_d"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("oord" + ".oper_ord_no", "oper_ord_no")
			}
			,
			MCBlockDef.create("Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBCL0100_Imp01_INFO = new MCOperationInfo("MS", "MSBCL0100", "Imp01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL0100_Imp01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0100", "Imp01",
			new MCItemDef[]{
				MCItemDef.create("ord" + ".itm_ord_no", "itm_ord_no"),
				MCItemDef.create("ord" + ".itm_cd", "itm_cd"),
				MCItemDef.create("ord" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("ord" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("ord" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("ord" + ".oper_ptn", "oper_ptn"),
				MCItemDef.create("ord" + ".ord_rcv_flg", "ord_rcv_flg"),
				MCItemDef.create("ord" + ".ord_snd_flg", "ord_snd_flg"),
				MCItemDef.create("ord" + ".ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ord" + ".ext_itm_ord_no", "ext_itm_ord_no"),
				MCItemDef.create("ord" + ".for_scheduler_frozen_flg", "for_scheduler_frozen_flg"),
				MCItemDef.create("ext_sys_nm", "ext_sys_nm"),
				MCItemDef.create("oord" + ".oper_ord_sts_typ", "oper_ord_sts_typ"),
				MCItemDef.create("oord" + ".oper_cd", "oper_cd"),
				MCItemDef.create("oord" + ".oper_seq", "oper_seq"),
				MCItemDef.create("oord" + ".loc_cd", "loc_cd"),
				MCItemDef.create("oord" + ".oper_schd_qty", "oper_schd_qty"),
				MCItemDef.create("oord" + ".st_schd_tm", "st_schd_tm"),
				MCItemDef.create("oord" + ".end_schd_tm", "end_schd_tm"),
				MCItemDef.create("oord" + ".oper_rsrc", "oper_rsrc"),
				MCItemDef.create("oord" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("oord" + ".sub_char1", "sub_char1"),
				MCItemDef.create("oord" + ".sub_char2", "sub_char2"),
				MCItemDef.create("oord" + ".sub_char3", "sub_char3"),
				MCItemDef.create("oord" + ".ext_oper_ord_no", "ext_oper_ord_no"),
				MCItemDef.create("oord" + ".scheduler_frozen_flg", "scheduler_frozen_flg")
			}
			,
			MCBlockDef.create("Imp01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBCL0100_Imp01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0100", "Imp01",
			new MCItemDef[]{
				MCItemDef.create("ord" + ".itm_ord_no", "itm_ord_no"),
				MCItemDef.create("ord" + ".itm_cd", "itm_cd"),
				MCItemDef.create("ord" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("ord" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("ord" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("ord" + ".mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("ord" + ".oper_ptn", "oper_ptn"),
				MCItemDef.create("ord" + ".mfg_st_schd_dt", "mfg_st_schd_dt"),
				MCItemDef.create("ord" + ".mfg_end_schd_dt", "mfg_end_schd_dt"),
				MCItemDef.create("ord" + ".sno1", "sno1"),
				MCItemDef.create("ord" + ".sno2", "sno2"),
				MCItemDef.create("ord" + ".sno3", "sno3"),
				MCItemDef.create("ord" + ".sno4", "sno4"),
				MCItemDef.create("ord" + ".wg_cd", "wg_cd"),
				MCItemDef.create("ord" + ".upd_cntr", "itm_order_upd_cntr"),
				MCItemDef.create("ord" + ".ord_rcv_flg", "ord_rcv_flg"),
				MCItemDef.create("ord" + ".ord_snd_flg", "ord_snd_flg"),
				MCItemDef.create("ord" + ".ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ord" + ".ext_itm_ord_no", "ext_itm_ord_no"),
				MCItemDef.create("ord" + ".for_scheduler_frozen_flg", "for_scheduler_frozen_flg"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("mfg_site_cd", "mfg_site_cd"),
				MCItemDef.create("mfg_site_nm", "mfg_site_nm"),
				MCItemDef.create("mfg_loc_grp_cd", "mfg_loc_grp_cd"),
				MCItemDef.create("mfg_loc_grp_nm", "mfg_loc_grp_nm"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("ext_sys_nm", "ext_sys_nm"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("oord" + ".oper_ord_sts_typ", "oper_ord_sts_typ"),
				MCItemDef.create("oord" + ".oper_cd", "oper_cd"),
				MCItemDef.create("oord" + ".oper_seq", "oper_seq"),
				MCItemDef.create("oord" + ".loc_cd", "loc_cd"),
				MCItemDef.create("oord" + ".oper_schd_qty", "oper_schd_qty"),
				MCItemDef.create("oord" + ".st_schd_tm", "st_schd_tm"),
				MCItemDef.create("oord" + ".end_schd_tm", "end_schd_tm"),
				MCItemDef.create("oord" + ".oper_rsrc", "oper_rsrc"),
				MCItemDef.create("oord" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("oord" + ".sub_char1", "sub_char1"),
				MCItemDef.create("oord" + ".sub_char2", "sub_char2"),
				MCItemDef.create("oord" + ".sub_char3", "sub_char3"),
				MCItemDef.create("oord" + ".ext_oper_ord_no", "ext_oper_ord_no"),
				MCItemDef.create("oord" + ".scheduler_frozen_flg", "scheduler_frozen_flg"),
				MCItemDef.create("oper_ord_sts_typ_nm", "oper_ord_sts_typ_nm"),
				MCItemDef.create("oper_nm", "oper_nm")
			}
			,
			MCBlockDef.create("Imp01_Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

