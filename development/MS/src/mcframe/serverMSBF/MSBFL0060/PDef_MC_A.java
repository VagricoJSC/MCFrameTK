package mcframe.serverMSBF.MSBFL0060;

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
 * [MSBFL_InspActLstReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBFL0060.Srch01.UP.BLOCK0")){
			return MS_MSBFL0060_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0060.Srch01.DOWN.BLOCK0")){
			return MS_MSBFL0060_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0060.Srch01.DOWN.BLOCK1")){
			return MS_MSBFL0060_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBFL0060.Srch01.DOWN.BLOCK2")){
			return MS_MSBFL0060_Srch01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBFL0060.Srch02.UP.BLOCK0")){
			return MS_MSBFL0060_Srch02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0060.Srch02.DOWN.BLOCK0")){
			return MS_MSBFL0060_Srch02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0060.Chk01.UP.BLOCK0")){
			return MS_MSBFL0060_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0060.Chk01.UP.BLOCK1")){
			return MS_MSBFL0060_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBFL0060.Chk01.UP.BLOCK2")){
			return MS_MSBFL0060_Chk01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBFL0060.Chk01.DOWN.BLOCK0")){
			return MS_MSBFL0060_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0060.Chk01.DOWN.BLOCK1")){
			return MS_MSBFL0060_Chk01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBFL0060.Chk01.DOWN.BLOCK2")){
			return MS_MSBFL0060_Chk01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBFL0060.Chk02.UP.BLOCK0")){
			return MS_MSBFL0060_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0060.Chk02.UP.BLOCK1")){
			return MS_MSBFL0060_Chk02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBFL0060.Chk02.DOWN.BLOCK0")){
			return MS_MSBFL0060_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0060.Chk02.DOWN.BLOCK1")){
			return MS_MSBFL0060_Chk02_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBFL0060.Chk03.UP.BLOCK0")){
			return MS_MSBFL0060_Chk03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0060.Chk03.DOWN.BLOCK0")){
			return MS_MSBFL0060_Chk03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0060.Chk04.UP.BLOCK0")){
			return MS_MSBFL0060_Chk04_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0060.Chk04.DOWN.BLOCK0")){
			return MS_MSBFL0060_Chk04_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0060.Upd01.UP.BLOCK0")){
			return MS_MSBFL0060_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0060.Upd01.UP.BLOCK1")){
			return MS_MSBFL0060_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBFL0060.Upd01.UP.BLOCK2")){
			return MS_MSBFL0060_Upd01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBFL0060.Upd01.DOWN.BLOCK0")){
			return MS_MSBFL0060_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0060.Upd01.DOWN.BLOCK1")){
			return MS_MSBFL0060_Upd01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBFL0060.Upd01.DOWN.BLOCK2")){
			return MS_MSBFL0060_Upd01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBFL0060.Upd02.UP.BLOCK0")){
			return MS_MSBFL0060_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0060.Upd02.UP.BLOCK1")){
			return MS_MSBFL0060_Upd02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBFL0060.Upd02.DOWN.BLOCK0")){
			return MS_MSBFL0060_Upd02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0060.Del01.UP.BLOCK0")){
			return MS_MSBFL0060_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0060.Del01.DOWN.BLOCK0")){
			return MS_MSBFL0060_Del01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0060.Del02.UP.BLOCK0")){
			return MS_MSBFL0060_Del02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0060.Del02.UP.BLOCK1")){
			return MS_MSBFL0060_Del02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBFL0060.Del02.DOWN.BLOCK0")){
			return MS_MSBFL0060_Del02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0060.Prnt01.UP.BLOCK0")){
			return MS_MSBFL0060_Prnt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0060.Prnt01.DOWN.BLOCK0")){
			return MS_MSBFL0060_Prnt01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
											
	
	static final MCOperationInfo MS_MSBFL0060_Srch01_INFO = new MCOperationInfo("MS", "MSBFL0060", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0060_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0060", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ope", "ope"),
				MCItemDef.create("ord_flg", "ord_flg"),
				MCItemDef.create("stt_flg", "stt_flg"),
				MCItemDef.create("cmpl_flg", "cmpl_flg"),
				MCItemDef.create("insp_rslt_prnt_flg", "insp_rslt_prnt_flg"),
				MCItemDef.create("insp_rslt_not_prnt_flg", "insp_rslt_not_prnt_flg"),
				MCItemDef.create("cnf_cmpl_flg", "cnf_cmpl_flg"),
				MCItemDef.create("cnf_not_cmpl_flg", "cnf_not_cmpl_flg"),
				MCItemDef.create("inst_st_dt_fr", "inst_st_dt_fr"),
				MCItemDef.create("inst_st_hm_fr", "inst_st_hm_fr"),
				MCItemDef.create("inst_st_dt_to", "inst_st_dt_to"),
				MCItemDef.create("inst_st_hm_to", "inst_st_hm_to"),
				MCItemDef.create("inst_end_dt_fr", "inst_end_dt_fr"),
				MCItemDef.create("inst_end_hm_fr", "inst_end_hm_fr"),
				MCItemDef.create("inst_end_dt_to", "inst_end_dt_to"),
				MCItemDef.create("inst_end_hm_to", "inst_end_hm_to"),
				MCItemDef.create("inst_dt_fr", "inst_dt_fr"),
				MCItemDef.create("inst_dt_to", "inst_dt_to"),
				MCItemDef.create("judg_dt_fr", "judg_dt_fr"),
				MCItemDef.create("judg_dt_to", "judg_dt_to"),
				MCItemDef.create("st_dt_fr", "st_dt_fr"),
				MCItemDef.create("st_hm_fr", "st_hm_fr"),
				MCItemDef.create("st_dt_to", "st_dt_to"),
				MCItemDef.create("st_hm_to", "st_hm_to"),
				MCItemDef.create("end_dt_fr", "end_dt_fr"),
				MCItemDef.create("end_hm_fr", "end_hm_fr"),
				MCItemDef.create("end_dt_to", "end_dt_to"),
				MCItemDef.create("end_hm_to", "end_hm_to"),
				MCItemDef.create("insp_rslt_prnt_tm_fr", "insp_rslt_prnt_tm_fr"),
				MCItemDef.create("insp_rslt_prnt_tm_to", "insp_rslt_prnt_tm_to"),
				MCItemDef.create("upd_ts_fr", "upd_ts_fr"),
				MCItemDef.create("upd_ts_to", "upd_ts_to"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
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
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("bp_lot_no", "bp_lot_no"),
				MCItemDef.create("inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("inst_usr_nm", "inst_usr_nm"),
				MCItemDef.create("inst_dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("inst_dpt_nm", "inst_dpt_nm"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("act_usr_nm", "act_usr_nm"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_dpt_nm", "act_dpt_nm"),
				MCItemDef.create("judg_usr_cd", "judg_usr_cd"),
				MCItemDef.create("judg_usr_nm", "judg_usr_nm"),
				MCItemDef.create("judg_dpt_cd", "judg_dpt_cd"),
				MCItemDef.create("judg_dpt_nm", "judg_dpt_nm"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
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
				MCItemDef.create("sppl_grp_nm10", "sppl_grp_nm10"),
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
				MCItemDef.create("lims_flg", "lims_flg"),
				MCItemDef.create("not_lims_flg", "not_lims_flg"),
				MCItemDef.create("ext_insp_act_no", "ext_insp_act_no")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBFL0060_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0060", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("insp_sts_typ", "insp_sts_typ"),
				MCItemDef.create("insp_sts_typ_nm", "insp_sts_typ_nm"),
				MCItemDef.create("insp_aprv_sts_typ", "insp_aprv_sts_typ"),
				MCItemDef.create("insp_aprv_sts_typ_nm", "insp_aprv_sts_typ_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("insp_freq", "insp_freq"),
				MCItemDef.create("insp_typ", "insp_typ"),
				MCItemDef.create("insp_typ_nm", "insp_typ_nm"),
				MCItemDef.create("insp_mtd_typ", "insp_mtd_typ"),
				MCItemDef.create("insp_mtd_typ_nm", "insp_mtd_typ_nm"),
				MCItemDef.create("insp_ptn_cd", "insp_ptn_cd"),
				MCItemDef.create("insp_ptn_nm", "insp_ptn_nm"),
				MCItemDef.create("inst_pack_unit_qty", "inst_pack_unit_qty"),
				MCItemDef.create("inst_pack_unit_cd", "inst_pack_unit_cd"),
				MCItemDef.create("inst_pack_unit_nm", "inst_pack_unit_nm"),
				MCItemDef.create("inst_pack_unit_dec_place", "inst_pack_unit_dec_place"),
				MCItemDef.create("inst_base_unit_qty", "inst_base_unit_qty"),
				MCItemDef.create("inst_base_unit_cd", "inst_base_unit_cd"),
				MCItemDef.create("inst_base_unit_nm", "inst_base_unit_nm"),
				MCItemDef.create("inst_base_unit_dec_place", "inst_base_unit_dec_place"),
				MCItemDef.create("inst_base_unit_rnd_typ", "inst_base_unit_rnd_typ"),
				MCItemDef.create("act_ttl_qty", "act_ttl_qty"),
				MCItemDef.create("std_insp_flg", "std_insp_flg"),
				MCItemDef.create("std_req_flg", "std_req_flg"),
				MCItemDef.create("std_cnf_req_flg", "std_cnf_req_flg"),
				MCItemDef.create("std_cmpl_flg", "std_cmpl_flg"),
				MCItemDef.create("std_cnf_cmpl_flg", "std_cnf_cmpl_flg"),
				MCItemDef.create("std_insp_point_cnt", "std_insp_point_cnt"),
				MCItemDef.create("std_insp_cmpl_cnt", "std_insp_cmpl_cnt"),
				MCItemDef.create("std_insp_cnf_cmpl_cnt", "std_insp_cnf_cmpl_cnt"),
				MCItemDef.create("insp_rslt_prnt_flg", "insp_rslt_prnt_flg"),
				MCItemDef.create("insp_rslt_prnt_tm", "insp_rslt_prnt_tm"),
				MCItemDef.create("inst_dt", "inst_dt"),
				MCItemDef.create("inst_st_dt", "inst_st_dt"),
				MCItemDef.create("inst_st_hm", "inst_st_hm"),
				MCItemDef.create("inst_end_dt", "inst_end_dt"),
				MCItemDef.create("inst_end_hm", "inst_end_hm"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("st_hm", "st_hm"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("end_hm", "end_hm"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("act_usr_nm", "act_usr_nm"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_dpt_nm", "act_dpt_nm"),
				MCItemDef.create("insp_judg_rslt_typ", "insp_judg_rslt_typ"),
				MCItemDef.create("insp_judg_rslt_typ_nm", "insp_judg_rslt_typ_nm"),
				MCItemDef.create("judg_dt", "judg_dt"),
				MCItemDef.create("judg_usr_cd", "judg_usr_cd"),
				MCItemDef.create("judg_usr_nm", "judg_usr_nm"),
				MCItemDef.create("judg_dpt_cd", "judg_dpt_cd"),
				MCItemDef.create("judg_dpt_nm", "judg_dpt_nm"),
				MCItemDef.create("judg_rsn", "judg_rsn"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("quality_typ_nm", "quality_typ_nm"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("dfct_rsn_cd", "dfct_rsn_cd"),
				MCItemDef.create("dfct_rsn_nm", "dfct_rsn_nm"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("smpl_inst_qty", "smpl_inst_qty"),
				MCItemDef.create("smpl_inst_unit_cd", "smpl_inst_unit_cd"),
				MCItemDef.create("smpl_inst_unit_nm", "smpl_inst_unit_nm"),
				MCItemDef.create("smpl_inst_unit_dec_place", "smpl_inst_unit_dec_place"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("vld_pd", "vld_pd"),
				MCItemDef.create("lmt_pd", "lmt_pd"),
				MCItemDef.create("calc_pd_typ", "calc_pd_typ"),
				MCItemDef.create("calc_pd_typ_nm", "calc_pd_typ_nm"),
				MCItemDef.create("lmt_dt_frm_typ", "lmt_dt_frm_typ"),
				MCItemDef.create("lmt_dt_frm_typ_nm", "lmt_dt_frm_typ_nm"),
				MCItemDef.create("vld_dt_now", "vld_dt_now"),
				MCItemDef.create("lmt_dt_frm", "lmt_dt_frm"),
				MCItemDef.create("lmt_dt_now", "lmt_dt_now"),
				MCItemDef.create("vld_dt", "vld_dt"),
				MCItemDef.create("lmt_dt", "lmt_dt"),
				MCItemDef.create("lmt_up_flg", "lmt_up_flg"),
				MCItemDef.create("lmt_ctl_flg", "lmt_ctl_flg"),
				MCItemDef.create("lmt_ctl_categ", "lmt_ctl_categ"),
				MCItemDef.create("insp_bind_typ", "insp_bind_typ"),
				MCItemDef.create("insp_bind_typ_nm", "insp_bind_typ_nm"),
				MCItemDef.create("in_prmt_insp_flg", "in_prmt_insp_flg"),
				MCItemDef.create("rem_base_unit_qty", "rem_base_unit_qty"),
				MCItemDef.create("good_qty", "good_qty"),
				MCItemDef.create("dfct_qty", "dfct_qty"),
				MCItemDef.create("insp_std_no", "insp_std_no"),
				MCItemDef.create("act_intr_rmrks", "act_intr_rmrks"),
				MCItemDef.create("lot_rmrks", "lot_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("maker_nm", "maker_nm"),
				MCItemDef.create("to_site_cd", "to_site_cd"),
				MCItemDef.create("to_site_nm", "to_site_nm"),
				MCItemDef.create("bp_lot_no", "bp_lot_no"),
				MCItemDef.create("src_no1", "src_no1"),
				MCItemDef.create("src_no2", "src_no2"),
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
				MCItemDef.create("inst_upd_cntr", "inst_upd_cntr"),
				MCItemDef.create("act_upd_cntr", "act_upd_cntr"),
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
				MCItemDef.create("std_insp_ng_flg", "std_insp_ng_flg"),
				MCItemDef.create("std_insp_sp_flg", "std_insp_sp_flg"),
				MCItemDef.create("lims_flg", "lims_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_sys_nm", "ext_sys_nm"),
				MCItemDef.create("ext_insp_act_no", "ext_insp_act_no")
			}
			,
			MCBlockDef.create("Srch01_Rslt")
		);
	}
	public static MCContainerDef MS_MSBFL0060_Srch01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL0060", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("str_ln_tgt_flg", "str_ln_tgt_flg"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_nm", "str_ln_nm"),
				MCItemDef.create("str_ln_cd_none_flg", "str_ln_cd_none_flg"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("stk_arrv_bp_nm", "stk_arrv_bp_nm"),
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
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("fix_no_typ", "fix_no_typ"),
				MCItemDef.create("fix_no_typ_nm", "fix_no_typ_nm"),
				MCItemDef.create("fix_no", "fix_no"),
				MCItemDef.create("stk_pack_unit_qty", "stk_pack_unit_qty"),
				MCItemDef.create("stk_pack_unit_cd", "stk_pack_unit_cd"),
				MCItemDef.create("stk_pack_unit_nm", "stk_pack_unit_nm"),
				MCItemDef.create("stk_pack_unit_dec_place", "stk_pack_unit_dec_place"),
				MCItemDef.create("stk_base_unit_qty", "stk_base_unit_qty"),
				MCItemDef.create("stk_base_unit_cd", "stk_base_unit_cd"),
				MCItemDef.create("stk_base_unit_nm", "stk_base_unit_nm"),
				MCItemDef.create("stk_base_unit_dec_place", "stk_base_unit_dec_place"),
				MCItemDef.create("pack_unit_qty", "pack_unit_qty"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("pack_unit_nm", "pack_unit_nm"),
				MCItemDef.create("pack_unit_dec_place", "pack_unit_dec_place"),
				MCItemDef.create("pack_unit_dmn_qty", "pack_unit_dmn_qty"),
				MCItemDef.create("pack_unit_conv_qty", "pack_unit_conv_qty"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("pack_xfr_pack_unit_qty", "pack_xfr_pack_unit_qty"),
				MCItemDef.create("pack_xfr_pack_unit_cd", "pack_xfr_pack_unit_cd"),
				MCItemDef.create("pack_xfr_pack_unit_nm", "pack_xfr_pack_unit_nm"),
				MCItemDef.create("pack_xfr_pack_unit_dec_place", "pack_xfr_pack_unit_dec_place"),
				MCItemDef.create("pack_xfr_pack_unit_dmn_qty", "pack_xfr_pack_unit_dmn_qty"),
				MCItemDef.create("pack_xfr_pack_unit_conv_qty", "pack_xfr_pack_unit_conv_qty"),
				MCItemDef.create("pack_xfr_base_unit_qty", "pack_xfr_base_unit_qty"),
				MCItemDef.create("pack_xfr_base_unit_cd", "pack_xfr_base_unit_cd"),
				MCItemDef.create("pack_xfr_base_unit_nm", "pack_xfr_base_unit_nm"),
				MCItemDef.create("pack_xfr_base_unit_dec_place", "pack_xfr_base_unit_dec_place"),
				MCItemDef.create("pack_xfr_base_unit_rnd_typ", "pack_xfr_base_unit_rnd_typ"),
				MCItemDef.create("dfct_rsn_cd", "dfct_rsn_cd"),
				MCItemDef.create("dfct_rsn_nm", "dfct_rsn_nm"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("insp_act_d_no", "insp_act_d_no"),
				MCItemDef.create("insp_judg_d_no", "insp_judg_d_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("lims_flg", "lims_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_sys_nm", "ext_sys_nm"),
				MCItemDef.create("ext_insp_act_d_no", "ext_insp_act_d_no")
			}
			,
			MCBlockDef.create("Srch01_RsltTtl")
		);
	}
	public static MCContainerDef MS_MSBFL0060_Srch01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBFL0060", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("so_qty", "so_qty"),
				MCItemDef.create("smpl_qty", "smpl_qty"),
				MCItemDef.create("so_cmpl_flg", "so_cmpl_flg"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("pack_xfr_pack_unit_qty", "pack_xfr_pack_unit_qty"),
				MCItemDef.create("pack_xfr_pack_unit_cd", "pack_xfr_pack_unit_cd"),
				MCItemDef.create("pack_xfr_pack_unit_nm", "pack_xfr_pack_unit_nm"),
				MCItemDef.create("pack_xfr_pack_unit_dec_place", "pack_xfr_pack_unit_dec_place"),
				MCItemDef.create("pack_xfr_pack_unit_dmn_qty", "pack_xfr_pack_unit_dmn_qty"),
				MCItemDef.create("pack_xfr_pack_unit_conv_qty", "pack_xfr_pack_unit_conv_qty"),
				MCItemDef.create("pack_xfr_base_unit_qty", "pack_xfr_base_unit_qty"),
				MCItemDef.create("pack_xfr_base_unit_cd", "pack_xfr_base_unit_cd"),
				MCItemDef.create("pack_xfr_base_unit_nm", "pack_xfr_base_unit_nm"),
				MCItemDef.create("pack_xfr_base_unit_dec_place", "pack_xfr_base_unit_dec_place"),
				MCItemDef.create("pack_xfr_base_unit_rnd_typ", "pack_xfr_base_unit_rnd_typ"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("str_ln_tgt_flg", "str_ln_tgt_flg"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_nm", "str_ln_nm"),
				MCItemDef.create("str_ln_cd_none_flg", "str_ln_cd_none_flg"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("stk_arrv_bp_nm", "stk_arrv_bp_nm"),
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
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("fix_no_typ", "fix_no_typ"),
				MCItemDef.create("fix_no_typ_nm", "fix_no_typ_nm"),
				MCItemDef.create("fix_no", "fix_no"),
				MCItemDef.create("act_dt", "act_dt"),
				MCItemDef.create("act_hm", "act_hm"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_dpt_nm", "bd_dpt_nm"),
				MCItemDef.create("insp_smpl_act_no", "insp_smpl_act_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_schd_no", "insp_schd_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("lims_flg", "lims_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_sys_nm", "ext_sys_nm"),
				MCItemDef.create("ext_insp_smpl_act_no", "ext_insp_smpl_act_no")
			}
			,
			MCBlockDef.create("Srch01_RsltSmpl")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0060_Srch02_INFO = new MCOperationInfo("MS", "MSBFL0060", "Srch02", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0060_Srch02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0060", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("row_idx", "row_idx"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("lmt_dt_frm", "lmt_dt_frm")
			}
			,
			MCBlockDef.create("Srch02_Cnd")
		);
	}


	public static MCContainerDef MS_MSBFL0060_Srch02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0060", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("row_idx", "row_idx"),
				MCItemDef.create("lmt_dt_frm", "lmt_dt_frm"),
				MCItemDef.create("vld_dt", "vld_dt"),
				MCItemDef.create("lmt_dt", "lmt_dt")
			}
			,
			MCBlockDef.create("Srch02_Cnd")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0060_Chk01_INFO = new MCOperationInfo("MS", "MSBFL0060", "Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0060_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0060", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("dfct_rsn_cd", "dfct_rsn_cd"),
				MCItemDef.create("st_tm", "st_tm"),
				MCItemDef.create("end_tm", "end_tm"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("lmt_dt_frm_typ", "lmt_dt_frm_typ"),
				MCItemDef.create("lmt_dt_frm", "lmt_dt_frm"),
				MCItemDef.create("vld_dt", "vld_dt"),
				MCItemDef.create("lmt_dt", "lmt_dt"),
				MCItemDef.create("act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("act_intr_rmrks", "act_intr_rmrks"),
				MCItemDef.create("lot_rmrks", "lot_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("vld_dt_upd_flg", "vld_dt_upd_flg"),
				MCItemDef.create("inst_upd_cntr", "inst_upd_cntr"),
				MCItemDef.create("act_upd_cntr", "act_upd_cntr")
			}
			,
			MCBlockDef.create("Chk01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBFL0060_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL0060", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("insp_act_d_no", "insp_act_d_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("fix_no_typ", "fix_no_typ"),
				MCItemDef.create("fix_no", "fix_no"),
				MCItemDef.create("pack_unit_qty", "pack_unit_qty"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("pack_xfr_pack_unit_qty", "pack_xfr_pack_unit_qty"),
				MCItemDef.create("pack_xfr_pack_unit_cd", "pack_xfr_pack_unit_cd"),
				MCItemDef.create("pack_xfr_base_unit_qty", "pack_xfr_base_unit_qty"),
				MCItemDef.create("dfct_rsn_cd", "dfct_rsn_cd"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Chk01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBFL0060_Chk01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBFL0060", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("so_qty", "so_qty"),
				MCItemDef.create("smpl_qty", "smpl_qty"),
				MCItemDef.create("pack_xfr_pack_unit_qty", "pack_xfr_pack_unit_qty"),
				MCItemDef.create("pack_xfr_pack_unit_cd", "pack_xfr_pack_unit_cd"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("act_tm", "act_tm"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Chk01_RsltSmpl")
		);
	}


	public static MCContainerDef MS_MSBFL0060_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0060", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Chk01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBFL0060_Chk01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL0060", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("insp_act_d_no", "insp_act_d_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("fix_no_typ", "fix_no_typ"),
				MCItemDef.create("fix_no", "fix_no"),
				MCItemDef.create("pack_unit_qty", "pack_unit_qty"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("pack_xfr_pack_unit_qty", "pack_xfr_pack_unit_qty"),
				MCItemDef.create("pack_xfr_pack_unit_cd", "pack_xfr_pack_unit_cd"),
				MCItemDef.create("pack_xfr_base_unit_qty", "pack_xfr_base_unit_qty"),
				MCItemDef.create("pack_xfr_base_unit_cd", "pack_xfr_base_unit_cd"),
				MCItemDef.create("dfct_rsn_cd", "dfct_rsn_cd"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Chk01_Dtl")
		);
	}
	public static MCContainerDef MS_MSBFL0060_Chk01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBFL0060", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Chk01_RsltSmpl")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0060_Chk02_INFO = new MCOperationInfo("MS", "MSBFL0060", "Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0060_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0060", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("insp_judg_rslt_typ", "insp_judg_rslt_typ"),
				MCItemDef.create("judg_dt", "judg_dt"),
				MCItemDef.create("judg_usr_cd", "judg_usr_cd"),
				MCItemDef.create("judg_dpt_cd", "judg_dpt_cd"),
				MCItemDef.create("judg_rsn", "judg_rsn"),
				MCItemDef.create("lmt_dt_frm_typ", "lmt_dt_frm_typ"),
				MCItemDef.create("lmt_dt_frm", "lmt_dt_frm"),
				MCItemDef.create("vld_dt", "vld_dt"),
				MCItemDef.create("lmt_dt", "lmt_dt"),
				MCItemDef.create("act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("vld_dt_upd_flg", "vld_dt_upd_flg"),
				MCItemDef.create("act_intr_rmrks", "act_intr_rmrks"),
				MCItemDef.create("lot_rmrks", "lot_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("inst_upd_cntr", "inst_upd_cntr"),
				MCItemDef.create("act_upd_cntr", "act_upd_cntr")
			}
			,
			MCBlockDef.create("Chk02_Hdr")
		);
	}

	public static MCContainerDef MS_MSBFL0060_Chk02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL0060", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("fix_no_typ", "fix_no_typ"),
				MCItemDef.create("fix_no", "fix_no"),
				MCItemDef.create("pack_unit_qty", "pack_unit_qty"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Chk02_Dtl")
		);
	}


	public static MCContainerDef MS_MSBFL0060_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0060", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Chk02_Hdr")
		);
	}
	public static MCContainerDef MS_MSBFL0060_Chk02_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL0060", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Chk02_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0060_Chk03_INFO = new MCOperationInfo("MS", "MSBFL0060", "Chk03", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0060_Chk03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0060", "Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("inst_upd_cntr", "inst_upd_cntr"),
				MCItemDef.create("act_upd_cntr", "act_upd_cntr")
			}
			,
			MCBlockDef.create("Chk03_Hdr")
		);
	}


	public static MCContainerDef MS_MSBFL0060_Chk03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0060", "Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("insp_sts_typ", "insp_sts_typ"),
				MCItemDef.create("insp_sts_typ_nm", "insp_sts_typ_nm"),
				MCItemDef.create("insp_aprv_sts_typ", "insp_aprv_sts_typ"),
				MCItemDef.create("insp_aprv_sts_typ_nm", "insp_aprv_sts_typ_nm"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Chk03_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0060_Chk04_INFO = new MCOperationInfo("MS", "MSBFL0060", "Chk04", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0060_Chk04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0060", "Chk04",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("insp_sts_typ", "insp_sts_typ"),
				MCItemDef.create("judg_rsn", "judg_rsn"),
				MCItemDef.create("inst_upd_cntr", "inst_upd_cntr"),
				MCItemDef.create("act_upd_cntr", "act_upd_cntr")
			}
			,
			MCBlockDef.create("Chk04_Hdr")
		);
	}


	public static MCContainerDef MS_MSBFL0060_Chk04_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0060", "Chk04",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("insp_aprv_sts_typ", "insp_aprv_sts_typ"),
				MCItemDef.create("insp_aprv_sts_typ_nm", "insp_aprv_sts_typ_nm"),
				MCItemDef.create("insp_judg_rslt_typ", "insp_judg_rslt_typ"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Chk04_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0060_Upd01_INFO = new MCOperationInfo("MS", "MSBFL0060", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0060_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0060", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("dfct_rsn_cd", "dfct_rsn_cd"),
				MCItemDef.create("st_tm", "st_tm"),
				MCItemDef.create("end_tm", "end_tm"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("lmt_dt_frm_typ", "lmt_dt_frm_typ"),
				MCItemDef.create("lmt_dt_frm", "lmt_dt_frm"),
				MCItemDef.create("vld_dt", "vld_dt"),
				MCItemDef.create("lmt_dt", "lmt_dt"),
				MCItemDef.create("act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("act_intr_rmrks", "act_intr_rmrks"),
				MCItemDef.create("lot_rmrks", "lot_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("vld_dt_upd_flg", "vld_dt_upd_flg"),
				MCItemDef.create("inst_upd_cntr", "inst_upd_cntr"),
				MCItemDef.create("act_upd_cntr", "act_upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBFL0060_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL0060", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_act_d_no", "insp_act_d_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("fix_no_typ", "fix_no_typ"),
				MCItemDef.create("fix_no", "fix_no"),
				MCItemDef.create("pack_unit_qty", "pack_unit_qty"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("pack_xfr_pack_unit_qty", "pack_xfr_pack_unit_qty"),
				MCItemDef.create("pack_xfr_pack_unit_cd", "pack_xfr_pack_unit_cd"),
				MCItemDef.create("pack_xfr_base_unit_qty", "pack_xfr_base_unit_qty"),
				MCItemDef.create("dfct_rsn_cd", "dfct_rsn_cd"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Upd01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBFL0060_Upd01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBFL0060", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_smpl_act_no", "insp_smpl_act_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("insp_schd_no", "insp_schd_no"),
				MCItemDef.create("so_qty", "so_qty"),
				MCItemDef.create("smpl_qty", "smpl_qty"),
				MCItemDef.create("pack_xfr_pack_unit_qty", "pack_xfr_pack_unit_qty"),
				MCItemDef.create("pack_xfr_pack_unit_cd", "pack_xfr_pack_unit_cd"),
				MCItemDef.create("pack_xfr_base_unit_qty", "pack_xfr_base_unit_qty"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("act_tm", "act_tm"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Upd01_RsltSmpl")
		);
	}


	public static MCContainerDef MS_MSBFL0060_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0060", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("insp_sts_typ", "insp_sts_typ"),
				MCItemDef.create("insp_sts_typ_nm", "insp_sts_typ_nm"),
				MCItemDef.create("insp_aprv_sts_typ", "insp_aprv_sts_typ"),
				MCItemDef.create("insp_aprv_sts_typ_nm", "insp_aprv_sts_typ_nm"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Upd01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBFL0060_Upd01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL0060", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("insp_act_d_no", "insp_act_d_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Upd01_Dtl")
		);
	}
	public static MCContainerDef MS_MSBFL0060_Upd01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBFL0060", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("insp_smpl_act_no", "insp_smpl_act_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Upd01_RsltSmpl")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0060_Upd02_INFO = new MCOperationInfo("MS", "MSBFL0060", "Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0060_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0060", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("insp_judg_rslt_typ", "insp_judg_rslt_typ"),
				MCItemDef.create("judg_dt", "judg_dt"),
				MCItemDef.create("judg_usr_cd", "judg_usr_cd"),
				MCItemDef.create("judg_dpt_cd", "judg_dpt_cd"),
				MCItemDef.create("judg_rsn", "judg_rsn"),
				MCItemDef.create("lmt_dt_frm_typ", "lmt_dt_frm_typ"),
				MCItemDef.create("lmt_dt_frm", "lmt_dt_frm"),
				MCItemDef.create("vld_dt", "vld_dt"),
				MCItemDef.create("lmt_dt", "lmt_dt"),
				MCItemDef.create("act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("vld_dt_upd_flg", "vld_dt_upd_flg"),
				MCItemDef.create("act_intr_rmrks", "act_intr_rmrks"),
				MCItemDef.create("lot_rmrks", "lot_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("inst_upd_cntr", "inst_upd_cntr"),
				MCItemDef.create("act_upd_cntr", "act_upd_cntr")
			}
			,
			MCBlockDef.create("Upd02_Hdr")
		);
	}

	public static MCContainerDef MS_MSBFL0060_Upd02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL0060", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("judg_rsn", "judg_rsn")
			}
			,
			MCBlockDef.create("Upd02_BulkSet")
		);
	}


	public static MCContainerDef MS_MSBFL0060_Upd02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0060", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("insp_aprv_sts_typ", "insp_aprv_sts_typ"),
				MCItemDef.create("insp_aprv_sts_typ_nm", "insp_aprv_sts_typ_nm"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Upd02_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0060_Del01_INFO = new MCOperationInfo("MS", "MSBFL0060", "Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0060_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0060", "Del01",
			new MCItemDef[]{
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("inst_upd_cntr", "inst_upd_cntr"),
				MCItemDef.create("act_upd_cntr", "act_upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Hdr")
		);
	}


	public static MCContainerDef MS_MSBFL0060_Del01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0060", "Del01",
			new MCItemDef[]{
				MCItemDef.create("insp_sts_typ", "insp_sts_typ"),
				MCItemDef.create("insp_sts_typ_nm", "insp_sts_typ_nm"),
				MCItemDef.create("insp_aprv_sts_typ", "insp_aprv_sts_typ"),
				MCItemDef.create("insp_aprv_sts_typ_nm", "insp_aprv_sts_typ_nm"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Del01_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0060_Del02_INFO = new MCOperationInfo("MS", "MSBFL0060", "Del02", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0060_Del02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0060", "Del02",
			new MCItemDef[]{
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("judg_rsn", "judg_rsn"),
				MCItemDef.create("inst_upd_cntr", "inst_upd_cntr"),
				MCItemDef.create("act_upd_cntr", "act_upd_cntr")
			}
			,
			MCBlockDef.create("Del02_Hdr")
		);
	}

	public static MCContainerDef MS_MSBFL0060_Del02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL0060", "Del02",
			new MCItemDef[]{
				MCItemDef.create("judg_rsn", "judg_rsn")
			}
			,
			MCBlockDef.create("Del02_BulkSet")
		);
	}


	public static MCContainerDef MS_MSBFL0060_Del02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0060", "Del02",
			new MCItemDef[]{
				MCItemDef.create("insp_aprv_sts_typ", "insp_aprv_sts_typ"),
				MCItemDef.create("insp_aprv_sts_typ_nm", "insp_aprv_sts_typ_nm"),
				MCItemDef.create("insp_judg_rslt_typ", "insp_judg_rslt_typ"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Del02_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0060_Prnt01_INFO = new MCOperationInfo("MS", "MSBFL0060", "Prnt01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0060_Prnt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0060", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("insp_no", "insp_no")
			}
			,
			MCBlockDef.create("Prnt01_Hdr")
		);
	}


	public static MCContainerDef MS_MSBFL0060_Prnt01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0060", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_rslt_prnt_flg", "insp_rslt_prnt_flg"),
				MCItemDef.create("insp_rslt_prnt_tm", "insp_rslt_prnt_tm"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Prnt01_Hdr")
		);
	}
	//FMCB DEF_CLASSES END
}

