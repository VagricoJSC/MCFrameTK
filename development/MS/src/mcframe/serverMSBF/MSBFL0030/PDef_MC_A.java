package mcframe.serverMSBF.MSBFL0030;

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
 * [MSBFL_InspInstLstReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBFL0030.Srch01.UP.BLOCK0")){
			return MS_MSBFL0030_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0030.Srch01.DOWN.BLOCK0")){
			return MS_MSBFL0030_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0030.Srch01.DOWN.BLOCK1")){
			return MS_MSBFL0030_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBFL0030.Srch02.UP.BLOCK0")){
			return MS_MSBFL0030_Srch02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0030.Srch02.DOWN.BLOCK0")){
			return MS_MSBFL0030_Srch02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0030.Chk01.UP.BLOCK0")){
			return MS_MSBFL0030_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0030.Chk01.DOWN.BLOCK0")){
			return MS_MSBFL0030_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0030.Chk02.UP.BLOCK0")){
			return MS_MSBFL0030_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0030.Chk02.DOWN.BLOCK0")){
			return MS_MSBFL0030_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0030.Chk03.UP.BLOCK0")){
			return MS_MSBFL0030_Chk03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0030.Chk03.UP.BLOCK1")){
			return MS_MSBFL0030_Chk03_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBFL0030.Chk03.DOWN.BLOCK0")){
			return MS_MSBFL0030_Chk03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0030.Chk03.DOWN.BLOCK1")){
			return MS_MSBFL0030_Chk03_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBFL0030.Chk04.UP.BLOCK0")){
			return MS_MSBFL0030_Chk04_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0030.Chk04.DOWN.BLOCK0")){
			return MS_MSBFL0030_Chk04_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0030.Ins01.UP.BLOCK0")){
			return MS_MSBFL0030_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0030.Ins01.DOWN.BLOCK0")){
			return MS_MSBFL0030_Ins01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0030.Upd01.UP.BLOCK0")){
			return MS_MSBFL0030_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0030.Upd01.UP.BLOCK1")){
			return MS_MSBFL0030_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBFL0030.Upd01.DOWN.BLOCK0")){
			return MS_MSBFL0030_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0030.Del01.UP.BLOCK0")){
			return MS_MSBFL0030_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0030.Del01.UP.BLOCK1")){
			return MS_MSBFL0030_Del01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBFL0030.Del01.DOWN.BLOCK0")){
			return MS_MSBFL0030_Del01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0030.Del02.UP.BLOCK0")){
			return MS_MSBFL0030_Del02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0030.Del02.UP.BLOCK1")){
			return MS_MSBFL0030_Del02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBFL0030.Del02.DOWN.BLOCK0")){
			return MS_MSBFL0030_Del02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0030.Prnt01.UP.BLOCK0")){
			return MS_MSBFL0030_Prnt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0030.Prnt01.DOWN.BLOCK0")){
			return MS_MSBFL0030_Prnt01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0030.Prnt02.UP.BLOCK0")){
			return MS_MSBFL0030_Prnt02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0030.Prnt02.DOWN.BLOCK0")){
			return MS_MSBFL0030_Prnt02_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
												
	
	static final MCOperationInfo MS_MSBFL0030_Srch01_INFO = new MCOperationInfo("MS", "MSBFL0030", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0030_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0030", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ope", "ope"),
				MCItemDef.create("insp_sts_typ_schd", "insp_sts_typ_schd"),
				MCItemDef.create("insp_sts_typ_yet", "insp_sts_typ_yet"),
				MCItemDef.create("insp_sts_typ_ord", "insp_sts_typ_ord"),
				MCItemDef.create("insp_sts_typ_str", "insp_sts_typ_str"),
				MCItemDef.create("insp_sts_typ_jdg", "insp_sts_typ_jdg"),
				MCItemDef.create("insp_lst_not_prnt_flg", "insp_lst_not_prnt_flg"),
				MCItemDef.create("insp_lst_prnt_flg", "insp_lst_prnt_flg"),
				MCItemDef.create("insp_rslt_not_prnt_flg", "insp_rslt_not_prnt_flg"),
				MCItemDef.create("insp_rslt_prnt_flg", "insp_rslt_prnt_flg"),
				MCItemDef.create("lims_tgt_flg", "lims_tgt_flg"),
				MCItemDef.create("not_lims_tgt_flg", "not_lims_tgt_flg"),
				MCItemDef.create("schd_st_dt_fr", "schd_st_dt_fr"),
				MCItemDef.create("schd_st_hm_fr", "schd_st_hm_fr"),
				MCItemDef.create("schd_st_dt_to", "schd_st_dt_to"),
				MCItemDef.create("schd_st_hm_to", "schd_st_hm_to"),
				MCItemDef.create("schd_end_dt_fr", "schd_end_dt_fr"),
				MCItemDef.create("schd_end_hm_fr", "schd_end_hm_fr"),
				MCItemDef.create("schd_end_dt_to", "schd_end_dt_to"),
				MCItemDef.create("schd_end_hm_to", "schd_end_hm_to"),
				MCItemDef.create("inst_dt_fr", "inst_dt_fr"),
				MCItemDef.create("inst_dt_to", "inst_dt_to"),
				MCItemDef.create("aprv_dt_fr", "aprv_dt_fr"),
				MCItemDef.create("aprv_dt_to", "aprv_dt_to"),
				MCItemDef.create("upd_ts_fr", "upd_ts_fr"),
				MCItemDef.create("upd_ts_to", "upd_ts_to"),
				MCItemDef.create("st_dt_fr", "st_dt_fr"),
				MCItemDef.create("st_hm_fr", "st_hm_fr"),
				MCItemDef.create("st_dt_to", "st_dt_to"),
				MCItemDef.create("st_hm_to", "st_hm_to"),
				MCItemDef.create("end_dt_fr", "end_dt_fr"),
				MCItemDef.create("end_hm_fr", "end_hm_fr"),
				MCItemDef.create("end_dt_to", "end_dt_to"),
				MCItemDef.create("end_hm_to", "end_hm_to"),
				MCItemDef.create("insp_lst_prnt_tm_fr", "insp_lst_prnt_tm_fr"),
				MCItemDef.create("insp_lst_prnt_tm_to", "insp_lst_prnt_tm_to"),
				MCItemDef.create("insp_rslt_prnt_tm_fr", "insp_rslt_prnt_tm_fr"),
				MCItemDef.create("insp_rslt_prnt_tm_to", "insp_rslt_prnt_tm_to"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_nm", "str_ln_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("mfg_str_ln_cd", "mfg_str_ln_cd"),
				MCItemDef.create("mfg_str_ln_nm", "mfg_str_ln_nm"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("maker_nm", "maker_nm"),
				MCItemDef.create("insp_typ", "insp_typ"),
				MCItemDef.create("insp_ptn_cd", "insp_ptn_cd"),
				MCItemDef.create("insp_ptn_nm", "insp_ptn_nm"),
				MCItemDef.create("insp_mtd_typ", "insp_mtd_typ"),
				MCItemDef.create("insp_aprv_sts_typ", "insp_aprv_sts_typ"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("bp_lot_no", "bp_lot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("inst_usr_nm", "inst_usr_nm"),
				MCItemDef.create("inst_dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("inst_dpt_nm", "inst_dpt_nm"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("insp_schd_no", "insp_schd_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_lst_no", "insp_lst_no"),
				MCItemDef.create("insp_cnt_rmrks", "insp_cnt_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
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
				MCItemDef.create("itm_grp_nm10", "itm_grp_nm10"),
				MCItemDef.create("sppl_grp_flg1", "sppl_grp_flg1"),
				MCItemDef.create("sppl_grp_cd1", "sppl_grp_cd1"),
				MCItemDef.create("sppl_grp_nm1", "sppl_grp_nm1"),
				MCItemDef.create("sppl_grp_flg2", "sppl_grp_flg2"),
				MCItemDef.create("sppl_grp_cd2", "sppl_grp_cd2"),
				MCItemDef.create("sppl_grp_nm2", "sppl_grp_nm2"),
				MCItemDef.create("sppl_grp_flg3", "sppl_grp_flg3"),
				MCItemDef.create("sppl_grp_cd3", "sppl_grp_cd3"),
				MCItemDef.create("sppl_grp_nm3", "sppl_grp_nm3"),
				MCItemDef.create("sppl_grp_flg4", "sppl_grp_flg4"),
				MCItemDef.create("sppl_grp_cd4", "sppl_grp_cd4"),
				MCItemDef.create("sppl_grp_nm4", "sppl_grp_nm4"),
				MCItemDef.create("sppl_grp_flg5", "sppl_grp_flg5"),
				MCItemDef.create("sppl_grp_cd5", "sppl_grp_cd5"),
				MCItemDef.create("sppl_grp_nm5", "sppl_grp_nm5"),
				MCItemDef.create("sppl_grp_flg6", "sppl_grp_flg6"),
				MCItemDef.create("sppl_grp_cd6", "sppl_grp_cd6"),
				MCItemDef.create("sppl_grp_nm6", "sppl_grp_nm6"),
				MCItemDef.create("sppl_grp_flg7", "sppl_grp_flg7"),
				MCItemDef.create("sppl_grp_cd7", "sppl_grp_cd7"),
				MCItemDef.create("sppl_grp_nm7", "sppl_grp_nm7"),
				MCItemDef.create("sppl_grp_flg8", "sppl_grp_flg8"),
				MCItemDef.create("sppl_grp_cd8", "sppl_grp_cd8"),
				MCItemDef.create("sppl_grp_nm8", "sppl_grp_nm8"),
				MCItemDef.create("sppl_grp_flg9", "sppl_grp_flg9"),
				MCItemDef.create("sppl_grp_cd9", "sppl_grp_cd9"),
				MCItemDef.create("sppl_grp_nm9", "sppl_grp_nm9"),
				MCItemDef.create("sppl_grp_flg10", "sppl_grp_flg10"),
				MCItemDef.create("sppl_grp_cd10", "sppl_grp_cd10"),
				MCItemDef.create("sppl_grp_nm10", "sppl_grp_nm10")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBFL0030_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0030", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("insp_sts_typ", "insp_sts_typ"),
				MCItemDef.create("insp_sts_typ_nm", "insp_sts_typ_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("not_yield_qty", "not_yield_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("insp_lt", "insp_lt"),
				MCItemDef.create("vld_dt_now", "vld_dt_now"),
				MCItemDef.create("lmt_up_flg", "lmt_up_flg"),
				MCItemDef.create("lot_rmrks", "lot_rmrks"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("insp_typ", "insp_typ"),
				MCItemDef.create("insp_typ_nm", "insp_typ_nm"),
				MCItemDef.create("insp_ptn_cd", "insp_ptn_cd"),
				MCItemDef.create("insp_ptn_nm", "insp_ptn_nm"),
				MCItemDef.create("insp_mtd_typ", "insp_mtd_typ"),
				MCItemDef.create("insp_mtd_typ_nm", "insp_mtd_typ_nm"),
				MCItemDef.create("to_site_cd", "to_site_cd"),
				MCItemDef.create("to_site_nm", "to_site_nm"),
				MCItemDef.create("from_site_cd", "from_site_cd"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_nm", "str_ln_nm"),
				MCItemDef.create("str_ln_cd_none_flg", "str_ln_cd_none_flg"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("maker_nm", "maker_nm"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("mfg_str_ln_cd", "mfg_str_ln_cd"),
				MCItemDef.create("mfg_str_ln_nm", "mfg_str_ln_nm"),
				MCItemDef.create("mfg_str_ln_cd_none_flg", "mfg_str_ln_cd_none_flg"),
				MCItemDef.create("bp_lot_no", "bp_lot_no"),
				MCItemDef.create("insp_bind_typ", "insp_bind_typ"),
				MCItemDef.create("insp_bind_typ_nm", "insp_bind_typ_nm"),
				MCItemDef.create("in_prmt_insp_flg", "in_prmt_insp_flg"),
				MCItemDef.create("insp_inst_issue_typ", "insp_inst_issue_typ"),
				MCItemDef.create("insp_schd_no", "insp_schd_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("own_insp_no", "own_insp_no"),
				MCItemDef.create("src_no1", "src_no1"),
				MCItemDef.create("src_no2", "src_no2"),
				MCItemDef.create("src_no3", "src_no3"),
				MCItemDef.create("src_no4", "src_no4"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("st_hm", "st_hm"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("end_hm", "end_hm"),
				MCItemDef.create("insp_aprv_flg", "insp_aprv_flg"),
				MCItemDef.create("insp_aprv_sts_typ", "insp_aprv_sts_typ"),
				MCItemDef.create("insp_aprv_sts_typ_nm", "insp_aprv_sts_typ_nm"),
				MCItemDef.create("aprv_dt", "aprv_dt"),
				MCItemDef.create("aprv_usr_cd", "aprv_usr_cd"),
				MCItemDef.create("aprv_usr_nm", "aprv_usr_nm"),
				MCItemDef.create("aprv_dpt_cd", "aprv_dpt_cd"),
				MCItemDef.create("aprv_dpt_nm", "aprv_dpt_nm"),
				MCItemDef.create("aprv_rsn", "aprv_rsn"),
				MCItemDef.create("insp_cnt_rmrks", "insp_cnt_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("std_req_flg", "std_req_flg"),
				MCItemDef.create("std_cnf_req_flg", "std_cnf_req_flg"),
				MCItemDef.create("plnt_aprv_flg", "plnt_aprv_flg"),
				MCItemDef.create("master_plnt_aprv_flg", "master_plnt_aprv_flg"),
				MCItemDef.create("col_schd_flg", "col_schd_flg"),
				MCItemDef.create("inst_dt", "inst_dt"),
				MCItemDef.create("inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("inst_usr_nm", "inst_usr_nm"),
				MCItemDef.create("inst_dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("inst_dpt_nm", "inst_dpt_nm"),
				MCItemDef.create("insp_freq", "insp_freq"),
				MCItemDef.create("insp_lst_prnt_tm", "insp_lst_prnt_tm"),
				MCItemDef.create("insp_lst_prnt_flg", "insp_lst_prnt_flg"),
				MCItemDef.create("insp_rslt_prnt_tm", "insp_rslt_prnt_tm"),
				MCItemDef.create("insp_rslt_prnt_flg", "insp_rslt_prnt_flg"),
				MCItemDef.create("insp_std_no", "insp_std_no"),
				MCItemDef.create("insp_lst_no", "insp_lst_no"),
				MCItemDef.create("schd_upd_cntr", "schd_upd_cntr"),
				MCItemDef.create("inst_upd_cntr", "inst_upd_cntr"),
				MCItemDef.create("is_invalid_insp_ptn_flg", "is_invalid_insp_ptn_flg"),
				MCItemDef.create("for_lims_flg", "for_lims_flg"),
				MCItemDef.create("last_lims_flg", "last_lims_flg"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
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
				MCItemDef.create("sppl_grp_cd1", "sppl_grp_cd1"),
				MCItemDef.create("sppl_grp_nm1", "sppl_grp_nm1"),
				MCItemDef.create("sppl_grp_cd2", "sppl_grp_cd2"),
				MCItemDef.create("sppl_grp_nm2", "sppl_grp_nm2"),
				MCItemDef.create("sppl_grp_cd3", "sppl_grp_cd3"),
				MCItemDef.create("sppl_grp_nm3", "sppl_grp_nm3"),
				MCItemDef.create("sppl_grp_cd4", "sppl_grp_cd4"),
				MCItemDef.create("sppl_grp_nm4", "sppl_grp_nm4"),
				MCItemDef.create("sppl_grp_cd5", "sppl_grp_cd5"),
				MCItemDef.create("sppl_grp_nm5", "sppl_grp_nm5"),
				MCItemDef.create("sppl_grp_cd6", "sppl_grp_cd6"),
				MCItemDef.create("sppl_grp_nm6", "sppl_grp_nm6"),
				MCItemDef.create("sppl_grp_cd7", "sppl_grp_cd7"),
				MCItemDef.create("sppl_grp_nm7", "sppl_grp_nm7"),
				MCItemDef.create("sppl_grp_cd8", "sppl_grp_cd8"),
				MCItemDef.create("sppl_grp_nm8", "sppl_grp_nm8"),
				MCItemDef.create("sppl_grp_cd9", "sppl_grp_cd9"),
				MCItemDef.create("sppl_grp_nm9", "sppl_grp_nm9"),
				MCItemDef.create("sppl_grp_cd10", "sppl_grp_cd10"),
				MCItemDef.create("sppl_grp_nm10", "sppl_grp_nm10"),
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
				MCItemDef.create("master_dt", "master_dt")
			}
			,
			MCBlockDef.create("Srch01_Rslt")
		);
	}
	public static MCContainerDef MS_MSBFL0030_Srch01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL0030", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("insp_schd_no", "insp_schd_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("schd_upd_cntr", "schd_upd_cntr")
			}
			,
			MCBlockDef.create("Srch01_RsltSchd")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0030_Srch02_INFO = new MCOperationInfo("MS", "MSBFL0030", "Srch02", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0030_Srch02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0030", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("master_dt", "master_dt"),
				MCItemDef.create("insp_typ", "insp_typ"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("insp_ptn_cd", "insp_ptn_cd")
			}
			,
			MCBlockDef.create("Srch02_Cnd")
		);
	}


	public static MCContainerDef MS_MSBFL0030_Srch02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0030", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("insp_mtd_typ", "insp_mtd_typ"),
				MCItemDef.create("insp_mtd_typ_nm", "insp_mtd_typ_nm"),
				MCItemDef.create("insp_std_no", "insp_std_no"),
				MCItemDef.create("insp_bind_typ", "insp_bind_typ"),
				MCItemDef.create("std_req_flg", "std_req_flg"),
				MCItemDef.create("std_cnf_req_flg", "std_cnf_req_flg"),
				MCItemDef.create("plnt_aprv_flg", "plnt_aprv_flg"),
				MCItemDef.create("insp_aprv_flg", "insp_aprv_flg")
			}
			,
			MCBlockDef.create("Srch02_Cnd")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0030_Chk01_INFO = new MCOperationInfo("MS", "MSBFL0030", "Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0030_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0030", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_schd_no", "insp_schd_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("inst_dt", "inst_dt"),
				MCItemDef.create("inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("inst_dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("prnt_flg", "prnt_flg"),
				MCItemDef.create("st_tm", "st_tm"),
				MCItemDef.create("end_tm", "end_tm"),
				MCItemDef.create("insp_ptn_cd", "insp_ptn_cd"),
				MCItemDef.create("insp_mtd_typ", "insp_mtd_typ"),
				MCItemDef.create("insp_std_no", "insp_std_no"),
				MCItemDef.create("plnt_aprv_flg", "plnt_aprv_flg"),
				MCItemDef.create("in_prmt_insp_flg", "in_prmt_insp_flg"),
				MCItemDef.create("insp_inst_issue_typ", "insp_inst_issue_typ"),
				MCItemDef.create("lims_flg", "lims_flg"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("schd_upd_cntr", "schd_upd_cntr")
			}
			,
			MCBlockDef.create("Chk01_Rslt")
		);
	}


	public static MCContainerDef MS_MSBFL0030_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0030", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Chk01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0030_Chk02_INFO = new MCOperationInfo("MS", "MSBFL0030", "Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0030_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0030", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("aprv_dt", "aprv_dt"),
				MCItemDef.create("aprv_usr_cd", "aprv_usr_cd"),
				MCItemDef.create("aprv_dpt_cd", "aprv_dpt_cd"),
				MCItemDef.create("aprv_rsn", "aprv_rsn"),
				MCItemDef.create("lims_flg", "lims_flg"),
				MCItemDef.create("inst_upd_cntr", "inst_upd_cntr")
			}
			,
			MCBlockDef.create("Chk02_Rslt")
		);
	}


	public static MCContainerDef MS_MSBFL0030_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0030", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Chk02_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0030_Chk03_INFO = new MCOperationInfo("MS", "MSBFL0030", "Chk03", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0030_Chk03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0030", "Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lims_flg", "lims_flg"),
				MCItemDef.create("insp_freq", "insp_freq"),
				MCItemDef.create("inst_upd_cntr", "inst_upd_cntr")
			}
			,
			MCBlockDef.create("Chk03_Rslt")
		);
	}

	public static MCContainerDef MS_MSBFL0030_Chk03_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL0030", "Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_schd_no", "insp_schd_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("schd_upd_cntr", "schd_upd_cntr")
			}
			,
			MCBlockDef.create("Chk03_RsltSchd")
		);
	}


	public static MCContainerDef MS_MSBFL0030_Chk03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0030", "Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Chk03_Rslt")
		);
	}
	public static MCContainerDef MS_MSBFL0030_Chk03_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL0030", "Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Chk03_RsltSchd")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0030_Chk04_INFO = new MCOperationInfo("MS", "MSBFL0030", "Chk04", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0030_Chk04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0030", "Chk04",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("aprv_rsn", "aprv_rsn"),
				MCItemDef.create("lims_flg", "lims_flg"),
				MCItemDef.create("insp_freq", "insp_freq"),
				MCItemDef.create("inst_upd_cntr", "inst_upd_cntr")
			}
			,
			MCBlockDef.create("Chk04_Rslt")
		);
	}


	public static MCContainerDef MS_MSBFL0030_Chk04_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0030", "Chk04",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Chk04_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0030_Ins01_INFO = new MCOperationInfo("MS", "MSBFL0030", "Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0030_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0030", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("insp_schd_no", "insp_schd_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("inst_dt", "inst_dt"),
				MCItemDef.create("inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("inst_dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("prnt_flg", "prnt_flg"),
				MCItemDef.create("st_tm", "st_tm"),
				MCItemDef.create("end_tm", "end_tm"),
				MCItemDef.create("insp_ptn_cd", "insp_ptn_cd"),
				MCItemDef.create("insp_mtd_typ", "insp_mtd_typ"),
				MCItemDef.create("insp_std_no", "insp_std_no"),
				MCItemDef.create("plnt_aprv_flg", "plnt_aprv_flg"),
				MCItemDef.create("in_prmt_insp_flg", "in_prmt_insp_flg"),
				MCItemDef.create("insp_inst_issue_typ", "insp_inst_issue_typ"),
				MCItemDef.create("lims_flg", "lims_flg"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("schd_upd_cntr", "schd_upd_cntr")
			}
			,
			MCBlockDef.create("Ins01_Rslt")
		);
	}


	public static MCContainerDef MS_MSBFL0030_Ins01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0030", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_sts_typ", "insp_sts_typ"),
				MCItemDef.create("insp_sts_typ_nm", "insp_sts_typ_nm"),
				MCItemDef.create("insp_aprv_flg", "insp_aprv_flg"),
				MCItemDef.create("insp_rslt_prnt_flg", "insp_rslt_prnt_flg"),
				MCItemDef.create("insp_rslt_prnt_tm", "insp_rslt_prnt_tm"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Ins01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0030_Upd01_INFO = new MCOperationInfo("MS", "MSBFL0030", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0030_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0030", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("aprv_dt", "aprv_dt"),
				MCItemDef.create("aprv_usr_cd", "aprv_usr_cd"),
				MCItemDef.create("aprv_dpt_cd", "aprv_dpt_cd"),
				MCItemDef.create("aprv_rsn", "aprv_rsn"),
				MCItemDef.create("lims_flg", "lims_flg"),
				MCItemDef.create("inst_upd_cntr", "inst_upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Rslt")
		);
	}

	public static MCContainerDef MS_MSBFL0030_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL0030", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("aprv_rsn", "aprv_rsn")
			}
			,
			MCBlockDef.create("Upd01_BulkSet")
		);
	}


	public static MCContainerDef MS_MSBFL0030_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0030", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("insp_aprv_sts_typ", "insp_aprv_sts_typ"),
				MCItemDef.create("insp_aprv_sts_typ_nm", "insp_aprv_sts_typ_nm"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Upd01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0030_Del01_INFO = new MCOperationInfo("MS", "MSBFL0030", "Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0030_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0030", "Del01",
			new MCItemDef[]{
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lims_flg", "lims_flg"),
				MCItemDef.create("insp_freq", "insp_freq"),
				MCItemDef.create("inst_upd_cntr", "inst_upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Rslt")
		);
	}

	public static MCContainerDef MS_MSBFL0030_Del01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL0030", "Del01",
			new MCItemDef[]{
				MCItemDef.create("insp_schd_no", "insp_schd_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("schd_upd_cntr", "schd_upd_cntr")
			}
			,
			MCBlockDef.create("Del01_RsltSchd")
		);
	}


	public static MCContainerDef MS_MSBFL0030_Del01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0030", "Del01",
			new MCItemDef[]{
				MCItemDef.create("insp_sts_typ", "insp_sts_typ"),
				MCItemDef.create("insp_sts_typ_nm", "insp_sts_typ_nm"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Del01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0030_Del02_INFO = new MCOperationInfo("MS", "MSBFL0030", "Del02", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0030_Del02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0030", "Del02",
			new MCItemDef[]{
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("aprv_rsn", "aprv_rsn"),
				MCItemDef.create("lims_flg", "lims_flg"),
				MCItemDef.create("insp_freq", "insp_freq"),
				MCItemDef.create("inst_upd_cntr", "inst_upd_cntr")
			}
			,
			MCBlockDef.create("Del02_Rslt")
		);
	}

	public static MCContainerDef MS_MSBFL0030_Del02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL0030", "Del02",
			new MCItemDef[]{
				MCItemDef.create("aprv_rsn", "aprv_rsn")
			}
			,
			MCBlockDef.create("Del02_BulkSet")
		);
	}


	public static MCContainerDef MS_MSBFL0030_Del02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0030", "Del02",
			new MCItemDef[]{
				MCItemDef.create("insp_aprv_sts_typ", "insp_aprv_sts_typ"),
				MCItemDef.create("insp_aprv_sts_typ_nm", "insp_aprv_sts_typ_nm"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Del02_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0030_Prnt01_INFO = new MCOperationInfo("MS", "MSBFL0030", "Prnt01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0030_Prnt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0030", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("insp_no", "insp_no")
			}
			,
			MCBlockDef.create("Prnt01_Rslt")
		);
	}


	public static MCContainerDef MS_MSBFL0030_Prnt01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0030", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_lst_no", "insp_lst_no"),
				MCItemDef.create("insp_lst_prnt_flg", "insp_lst_prnt_flg"),
				MCItemDef.create("insp_lst_prnt_tm", "insp_lst_prnt_tm"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Prnt01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0030_Prnt02_INFO = new MCOperationInfo("MS", "MSBFL0030", "Prnt02", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0030_Prnt02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0030", "Prnt02",
			new MCItemDef[]{
				MCItemDef.create("insp_no", "insp_no")
			}
			,
			MCBlockDef.create("Prnt02_Rslt")
		);
	}


	public static MCContainerDef MS_MSBFL0030_Prnt02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0030", "Prnt02",
			new MCItemDef[]{
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_rslt_prnt_flg", "insp_rslt_prnt_flg"),
				MCItemDef.create("insp_rslt_prnt_tm", "insp_rslt_prnt_tm"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Prnt02_Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

