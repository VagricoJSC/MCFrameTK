package mcframe.serverMSBE.MSBEL1410;

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
 * [MSBEL_ShipInstListReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBEL1410.Srch01.UP.BLOCK0")){
			return MS_MSBEL1410_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1410.Srch01.DOWN.BLOCK0")){
			return MS_MSBEL1410_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1410.Srch01.DOWN.BLOCK1")){
			return MS_MSBEL1410_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1410.Chk01.UP.BLOCK0")){
			return MS_MSBEL1410_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1410.Chk01.UP.BLOCK1")){
			return MS_MSBEL1410_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1410.Chk01.DOWN.BLOCK0")){
			return MS_MSBEL1410_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1410.Chk02.UP.BLOCK0")){
			return MS_MSBEL1410_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1410.Chk02.DOWN.BLOCK0")){
			return MS_MSBEL1410_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1410.Ins01.UP.BLOCK0")){
			return MS_MSBEL1410_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1410.Ins01.UP.BLOCK1")){
			return MS_MSBEL1410_Ins01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1410.Ins01.UP.BLOCK2")){
			return MS_MSBEL1410_Ins01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBEL1410.Ins01.DOWN.BLOCK0")){
			return MS_MSBEL1410_Ins01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1410.Del01.UP.BLOCK0")){
			return MS_MSBEL1410_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1410.Del01.UP.BLOCK1")){
			return MS_MSBEL1410_Del01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1410.Del01.DOWN.BLOCK0")){
			return MS_MSBEL1410_Del01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1410.Prnt01.UP.BLOCK0")){
			return MS_MSBEL1410_Prnt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1410.Prnt01.UP.BLOCK1")){
			return MS_MSBEL1410_Prnt01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1410.Prnt01.DOWN.BLOCK0")){
			return MS_MSBEL1410_Prnt01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1410.Chk03.UP.BLOCK0")){
			return MS_MSBEL1410_Chk03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1410.Chk03.DOWN.BLOCK0")){
			return MS_MSBEL1410_Chk03_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
							
	
	static final MCOperationInfo MS_MSBEL1410_Srch01_INFO = new MCOperationInfo("MS", "MSBEL1410", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1410_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1410", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ope", "ope"),
				MCItemDef.create("srch_mode", "srch_mode"),
				MCItemDef.create("uninst", "uninst"),
				MCItemDef.create("inst", "inst"),
				MCItemDef.create("p_ship", "p_ship"),
				MCItemDef.create("ship", "ship"),
				MCItemDef.create("not_alloc_flg", "not_alloc_flg"),
				MCItemDef.create("part_alloc_flg", "part_alloc_flg"),
				MCItemDef.create("all_alloc_flg", "all_alloc_flg"),
				MCItemDef.create("alloc_invalid_flg", "alloc_invalid_flg"),
				MCItemDef.create("late_ship", "late_ship"),
				MCItemDef.create("late_rqst", "late_rqst"),
				MCItemDef.create("pick_not_prnted", "pick_not_prnted"),
				MCItemDef.create("pick_prnted", "pick_prnted"),
				MCItemDef.create("inst_not_prnted", "inst_not_prnted"),
				MCItemDef.create("inst_prnted", "inst_prnted"),
				MCItemDef.create("dlv_not_prnted", "dlv_not_prnted"),
				MCItemDef.create("dlv_prnted", "dlv_prnted"),
				MCItemDef.create("adv_not_prnted", "adv_not_prnted"),
				MCItemDef.create("adv_prnted", "adv_prnted"),
				MCItemDef.create("wms_flg", "wms_flg"),
				MCItemDef.create("not_wms_flg", "not_wms_flg"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("ship_schd_dt_fr", "ship_schd_dt_fr"),
				MCItemDef.create("ship_schd_hm_fr", "ship_schd_hm_fr"),
				MCItemDef.create("ship_schd_dt_to", "ship_schd_dt_to"),
				MCItemDef.create("ship_schd_hm_to", "ship_schd_hm_to"),
				MCItemDef.create("ship_inst_dt_fr", "ship_inst_dt_fr"),
				MCItemDef.create("ship_inst_hm_fr", "ship_inst_hm_fr"),
				MCItemDef.create("ship_inst_dt_to", "ship_inst_dt_to"),
				MCItemDef.create("ship_inst_hm_to", "ship_inst_hm_to"),
				MCItemDef.create("ship_loc_cd", "ship_loc_cd"),
				MCItemDef.create("ship_loc_nm", "ship_loc_nm"),
				MCItemDef.create("ship_str_ln_cd", "ship_str_ln_cd"),
				MCItemDef.create("ship_str_ln_nm", "ship_str_ln_nm"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("ship_to_id_typ", "ship_to_id_typ"),
				MCItemDef.create("ship_to_id_typ_nm", "ship_to_id_typ_nm"),
				MCItemDef.create("ship_to_id_cd", "ship_to_id_cd"),
				MCItemDef.create("ship_to_id_nm", "ship_to_id_nm"),
				MCItemDef.create("dlv_id_typ", "dlv_id_typ"),
				MCItemDef.create("dlv_id_typ_nm", "dlv_id_typ_nm"),
				MCItemDef.create("dlv_id_cd", "dlv_id_cd"),
				MCItemDef.create("dlv_id_nm", "dlv_id_nm"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("ship_term_cd", "ship_term_cd"),
				MCItemDef.create("ship_term_nm", "ship_term_nm"),
				MCItemDef.create("ship_wk_cd", "ship_wk_cd"),
				MCItemDef.create("ship_wk_nm", "ship_wk_nm"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("inst_usr_nm", "inst_usr_nm"),
				MCItemDef.create("inst_dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("inst_dpt_nm", "inst_dpt_nm"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("xfr_schd_no", "xfr_schd_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("inst_rmrks", "inst_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("can_disp_flg", "can_disp_flg"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("d_sub_char1", "d_sub_char1"),
				MCItemDef.create("d_sub_char2", "d_sub_char2"),
				MCItemDef.create("d_sub_char3", "d_sub_char3"),
				MCItemDef.create("ship_to_grp_flg1", "ship_to_grp_flg1"),
				MCItemDef.create("ship_to_grp_cd1", "ship_to_grp_cd1"),
				MCItemDef.create("ship_to_grp_nm1", "ship_to_grp_nm1"),
				MCItemDef.create("ship_to_grp_flg2", "ship_to_grp_flg2"),
				MCItemDef.create("ship_to_grp_cd2", "ship_to_grp_cd2"),
				MCItemDef.create("ship_to_grp_nm2", "ship_to_grp_nm2"),
				MCItemDef.create("ship_to_grp_flg3", "ship_to_grp_flg3"),
				MCItemDef.create("ship_to_grp_cd3", "ship_to_grp_cd3"),
				MCItemDef.create("ship_to_grp_nm3", "ship_to_grp_nm3"),
				MCItemDef.create("ship_to_grp_flg4", "ship_to_grp_flg4"),
				MCItemDef.create("ship_to_grp_cd4", "ship_to_grp_cd4"),
				MCItemDef.create("ship_to_grp_nm4", "ship_to_grp_nm4"),
				MCItemDef.create("ship_to_grp_flg5", "ship_to_grp_flg5"),
				MCItemDef.create("ship_to_grp_cd5", "ship_to_grp_cd5"),
				MCItemDef.create("ship_to_grp_nm5", "ship_to_grp_nm5"),
				MCItemDef.create("ship_to_grp_flg6", "ship_to_grp_flg6"),
				MCItemDef.create("ship_to_grp_cd6", "ship_to_grp_cd6"),
				MCItemDef.create("ship_to_grp_nm6", "ship_to_grp_nm6"),
				MCItemDef.create("ship_to_grp_flg7", "ship_to_grp_flg7"),
				MCItemDef.create("ship_to_grp_cd7", "ship_to_grp_cd7"),
				MCItemDef.create("ship_to_grp_nm7", "ship_to_grp_nm7"),
				MCItemDef.create("ship_to_grp_flg8", "ship_to_grp_flg8"),
				MCItemDef.create("ship_to_grp_cd8", "ship_to_grp_cd8"),
				MCItemDef.create("ship_to_grp_nm8", "ship_to_grp_nm8"),
				MCItemDef.create("ship_to_grp_flg9", "ship_to_grp_flg9"),
				MCItemDef.create("ship_to_grp_cd9", "ship_to_grp_cd9"),
				MCItemDef.create("ship_to_grp_nm9", "ship_to_grp_nm9"),
				MCItemDef.create("ship_to_grp_flg10", "ship_to_grp_flg10"),
				MCItemDef.create("ship_to_grp_cd10", "ship_to_grp_cd10"),
				MCItemDef.create("ship_to_grp_nm10", "ship_to_grp_nm10"),
				MCItemDef.create("dlv_grp_flg1", "dlv_grp_flg1"),
				MCItemDef.create("dlv_grp_cd1", "dlv_grp_cd1"),
				MCItemDef.create("dlv_grp_nm1", "dlv_grp_nm1"),
				MCItemDef.create("dlv_grp_flg2", "dlv_grp_flg2"),
				MCItemDef.create("dlv_grp_cd2", "dlv_grp_cd2"),
				MCItemDef.create("dlv_grp_nm2", "dlv_grp_nm2"),
				MCItemDef.create("dlv_grp_flg3", "dlv_grp_flg3"),
				MCItemDef.create("dlv_grp_cd3", "dlv_grp_cd3"),
				MCItemDef.create("dlv_grp_nm3", "dlv_grp_nm3"),
				MCItemDef.create("dlv_grp_flg4", "dlv_grp_flg4"),
				MCItemDef.create("dlv_grp_cd4", "dlv_grp_cd4"),
				MCItemDef.create("dlv_grp_nm4", "dlv_grp_nm4"),
				MCItemDef.create("dlv_grp_flg5", "dlv_grp_flg5"),
				MCItemDef.create("dlv_grp_cd5", "dlv_grp_cd5"),
				MCItemDef.create("dlv_grp_nm5", "dlv_grp_nm5"),
				MCItemDef.create("dlv_grp_flg6", "dlv_grp_flg6"),
				MCItemDef.create("dlv_grp_cd6", "dlv_grp_cd6"),
				MCItemDef.create("dlv_grp_nm6", "dlv_grp_nm6"),
				MCItemDef.create("dlv_grp_flg7", "dlv_grp_flg7"),
				MCItemDef.create("dlv_grp_cd7", "dlv_grp_cd7"),
				MCItemDef.create("dlv_grp_nm7", "dlv_grp_nm7"),
				MCItemDef.create("dlv_grp_flg8", "dlv_grp_flg8"),
				MCItemDef.create("dlv_grp_cd8", "dlv_grp_cd8"),
				MCItemDef.create("dlv_grp_nm8", "dlv_grp_nm8"),
				MCItemDef.create("dlv_grp_flg9", "dlv_grp_flg9"),
				MCItemDef.create("dlv_grp_cd9", "dlv_grp_cd9"),
				MCItemDef.create("dlv_grp_nm9", "dlv_grp_nm9"),
				MCItemDef.create("dlv_grp_flg10", "dlv_grp_flg10"),
				MCItemDef.create("dlv_grp_cd10", "dlv_grp_cd10"),
				MCItemDef.create("dlv_grp_nm10", "dlv_grp_nm10"),
				MCItemDef.create("cst_grp_flg1", "cst_grp_flg1"),
				MCItemDef.create("cst_grp_cd1", "cst_grp_cd1"),
				MCItemDef.create("cst_grp_nm1", "cst_grp_nm1"),
				MCItemDef.create("cst_grp_flg2", "cst_grp_flg2"),
				MCItemDef.create("cst_grp_cd2", "cst_grp_cd2"),
				MCItemDef.create("cst_grp_nm2", "cst_grp_nm2"),
				MCItemDef.create("cst_grp_flg3", "cst_grp_flg3"),
				MCItemDef.create("cst_grp_cd3", "cst_grp_cd3"),
				MCItemDef.create("cst_grp_nm3", "cst_grp_nm3"),
				MCItemDef.create("cst_grp_flg4", "cst_grp_flg4"),
				MCItemDef.create("cst_grp_cd4", "cst_grp_cd4"),
				MCItemDef.create("cst_grp_nm4", "cst_grp_nm4"),
				MCItemDef.create("cst_grp_flg5", "cst_grp_flg5"),
				MCItemDef.create("cst_grp_cd5", "cst_grp_cd5"),
				MCItemDef.create("cst_grp_nm5", "cst_grp_nm5"),
				MCItemDef.create("cst_grp_flg6", "cst_grp_flg6"),
				MCItemDef.create("cst_grp_cd6", "cst_grp_cd6"),
				MCItemDef.create("cst_grp_nm6", "cst_grp_nm6"),
				MCItemDef.create("cst_grp_flg7", "cst_grp_flg7"),
				MCItemDef.create("cst_grp_cd7", "cst_grp_cd7"),
				MCItemDef.create("cst_grp_nm7", "cst_grp_nm7"),
				MCItemDef.create("cst_grp_flg8", "cst_grp_flg8"),
				MCItemDef.create("cst_grp_cd8", "cst_grp_cd8"),
				MCItemDef.create("cst_grp_nm8", "cst_grp_nm8"),
				MCItemDef.create("cst_grp_flg9", "cst_grp_flg9"),
				MCItemDef.create("cst_grp_cd9", "cst_grp_cd9"),
				MCItemDef.create("cst_grp_nm9", "cst_grp_nm9"),
				MCItemDef.create("cst_grp_flg10", "cst_grp_flg10"),
				MCItemDef.create("cst_grp_cd10", "cst_grp_cd10"),
				MCItemDef.create("cst_grp_nm10", "cst_grp_nm10"),
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


	public static MCContainerDef MS_MSBEL1410_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1410", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("pr_sts_typ", "pr_sts_typ"),
				MCItemDef.create("pr_sts_typ_nm", "pr_sts_typ_nm"),
				MCItemDef.create("ship_abl_flg", "ship_abl_flg"),
				MCItemDef.create("alloc_tgt_flg", "alloc_tgt_flg"),
				MCItemDef.create("pack_flg", "pack_flg"),
				MCItemDef.create("ship_schd_dt", "ship_schd_dt"),
				MCItemDef.create("ship_schd_hm", "ship_schd_hm"),
				MCItemDef.create("ship_schd_time", "ship_schd_time"),
				MCItemDef.create("dlv_rqst_dt", "dlv_rqst_dt"),
				MCItemDef.create("dlv_rqst_hm", "dlv_rqst_hm"),
				MCItemDef.create("dlv_schd_dt", "dlv_schd_dt"),
				MCItemDef.create("dlv_schd_hm", "dlv_schd_hm"),
				MCItemDef.create("ship_inst_dt", "ship_inst_dt"),
				MCItemDef.create("ship_inst_hm", "ship_inst_hm"),
				MCItemDef.create("dlv_rqst_tm", "dlv_rqst_tm"),
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("ship_fr_lg_grp_nm", "ship_fr_lg_grp_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ship_to_lg_grp_cd", "ship_to_lg_grp_cd"),
				MCItemDef.create("ship_to_id_typ", "ship_to_id_typ"),
				MCItemDef.create("ship_to_id_typ_nm", "ship_to_id_typ_nm"),
				MCItemDef.create("ship_to_id_cd", "ship_to_id_cd"),
				MCItemDef.create("ship_to_id_nm", "ship_to_id_nm"),
				MCItemDef.create("ship_to_zip_cd", "ship_to_zip_cd"),
				MCItemDef.create("ship_to_addr1", "ship_to_addr1"),
				MCItemDef.create("ship_to_addr2", "ship_to_addr2"),
				MCItemDef.create("ship_to_addr3", "ship_to_addr3"),
				MCItemDef.create("ship_to_addr4", "ship_to_addr4"),
				MCItemDef.create("ship_to_cntct_dpt", "ship_to_cntct_dpt"),
				MCItemDef.create("ship_to_cntct_psn", "ship_to_cntct_psn"),
				MCItemDef.create("ship_to_tel", "ship_to_tel"),
				MCItemDef.create("ship_to_fax", "ship_to_fax"),
				MCItemDef.create("ship_to_sundry_flg", "ship_to_sundry_flg"),
				MCItemDef.create("via_dlv_typ", "via_dlv_typ"),
				MCItemDef.create("via_dlv_typ_nm", "via_dlv_typ_nm"),
				MCItemDef.create("dlv_id_typ", "dlv_id_typ"),
				MCItemDef.create("dlv_id_typ_nm", "dlv_id_typ_nm"),
				MCItemDef.create("dlv_id_cd", "dlv_id_cd"),
				MCItemDef.create("dlv_id_nm", "dlv_id_nm"),
				MCItemDef.create("ship_term_cd", "ship_term_cd"),
				MCItemDef.create("ship_term_nm", "ship_term_nm"),
				MCItemDef.create("ship_wk_grp_cd", "ship_wk_grp_cd"),
				MCItemDef.create("ship_wk_grp_nm", "ship_wk_grp_nm"),
				MCItemDef.create("ship_wk_cd", "ship_wk_cd"),
				MCItemDef.create("ship_wk_nm", "ship_wk_nm"),
				MCItemDef.create("pick_prnt_flg", "pick_prnt_flg"),
				MCItemDef.create("inst_prnt_flg", "inst_prnt_flg"),
				MCItemDef.create("dlv_prnt_flg", "dlv_prnt_flg"),
				MCItemDef.create("adv_prnt_flg", "adv_prnt_flg"),
				MCItemDef.create("num_of_details", "num_of_details"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("rqst_dpt_cd", "rqst_dpt_cd"),
				MCItemDef.create("rqst_dpt_nm", "rqst_dpt_nm"),
				MCItemDef.create("rqst_usr_cd", "rqst_usr_cd"),
				MCItemDef.create("rqst_usr_nm", "rqst_usr_nm"),
				MCItemDef.create("ship_block_flg", "ship_block_flg"),
				MCItemDef.create("pd_inst_dlv_dt", "pd_inst_dlv_dt"),
				MCItemDef.create("pd_inst_dlv_hm", "pd_inst_dlv_hm"),
				MCItemDef.create("dlv_day_week_typ", "dlv_day_week_typ"),
				MCItemDef.create("dlv_day_week_typ_nm", "dlv_day_week_typ_nm"),
				MCItemDef.create("ship_rqst_dt", "ship_rqst_dt"),
				MCItemDef.create("ship_rqst_hm", "ship_rqst_hm"),
				MCItemDef.create("assort_typ", "assort_typ"),
				MCItemDef.create("assort_typ_nm", "assort_typ_nm"),
				MCItemDef.create("set_itm_grp_no", "set_itm_grp_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_rnd_typ", "trd_unit_rnd_typ"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("act_cont_qty", "act_cont_qty"),
				MCItemDef.create("act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("std_cont_qty", "std_cont_qty"),
				MCItemDef.create("cont_fctr_unit_cd", "cont_fctr_unit_cd"),
				MCItemDef.create("cont_fctr_unit_nm", "cont_fctr_unit_nm"),
				MCItemDef.create("std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("cont_fctr_dec_place", "cont_fctr_dec_place"),
				MCItemDef.create("cont_fctr_rnd_typ", "cont_fctr_rnd_typ"),
				MCItemDef.create("alloc_flg", "alloc_flg"),
				MCItemDef.create("grp_alloc_flg", "grp_alloc_flg"),
				MCItemDef.create("alloc_scope_typ", "alloc_scope_typ"),
				MCItemDef.create("alloc_typ", "alloc_typ"),
				MCItemDef.create("alloc_typ_nm", "alloc_typ_nm"),
				MCItemDef.create("ship_loc_cd", "ship_loc_cd"),
				MCItemDef.create("ship_loc_nm", "ship_loc_nm"),
				MCItemDef.create("ship_str_ln_cd", "ship_str_ln_cd"),
				MCItemDef.create("ship_str_ln_nm", "ship_str_ln_nm"),
				MCItemDef.create("ship_str_ln_cd_none_flg", "ship_str_ln_cd_none_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
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
				MCItemDef.create("ship_act_qty", "ship_act_qty"),
				MCItemDef.create("ship_wt", "ship_wt"),
				MCItemDef.create("ship_dim", "ship_dim"),
				MCItemDef.create("inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("inst_usr_nm", "inst_usr_nm"),
				MCItemDef.create("inst_dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("inst_dpt_nm", "inst_dpt_nm"),
				MCItemDef.create("base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("base_ac_dt", "base_ac_dt"),
				MCItemDef.create("ship_cnt_rmrks", "ship_cnt_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("inst_rmrks", "inst_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("inst_d_rmrks", "inst_d_rmrks"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("d_sub_char1", "d_sub_char1"),
				MCItemDef.create("d_sub_char2", "d_sub_char2"),
				MCItemDef.create("d_sub_char3", "d_sub_char3"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("ship_inst_d_no", "ship_inst_d_no"),
				MCItemDef.create("wms_flg", "wms_flg"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_seq", "dlv_slip_seq"),
				MCItemDef.create("dlv_slip_rev", "dlv_slip_rev"),
				MCItemDef.create("act_split_flg", "act_split_flg"),
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("pick_prnted_flg", "pick_prnted_flg"),
				MCItemDef.create("inst_prnted_flg", "inst_prnted_flg"),
				MCItemDef.create("dlv_prnted_flg", "dlv_prnted_flg"),
				MCItemDef.create("adv_prnted_flg", "adv_prnted_flg"),
				MCItemDef.create("can_flg", "can_flg"),
				MCItemDef.create("pack_disable_flg", "pack_disable_flg"),
				MCItemDef.create("non_dlv_prnt_flg", "non_dlv_prnt_flg"),
				MCItemDef.create("non_adv_prnt_flg", "non_adv_prnt_flg"),
				MCItemDef.create("iv_ship_flg", "iv_ship_flg"),
				MCItemDef.create("ship_to_grp_cd1", "ship_to_grp_cd1"),
				MCItemDef.create("ship_to_grp_nm1", "ship_to_grp_nm1"),
				MCItemDef.create("ship_to_grp_cd2", "ship_to_grp_cd2"),
				MCItemDef.create("ship_to_grp_nm2", "ship_to_grp_nm2"),
				MCItemDef.create("ship_to_grp_cd3", "ship_to_grp_cd3"),
				MCItemDef.create("ship_to_grp_nm3", "ship_to_grp_nm3"),
				MCItemDef.create("ship_to_grp_cd4", "ship_to_grp_cd4"),
				MCItemDef.create("ship_to_grp_nm4", "ship_to_grp_nm4"),
				MCItemDef.create("ship_to_grp_cd5", "ship_to_grp_cd5"),
				MCItemDef.create("ship_to_grp_nm5", "ship_to_grp_nm5"),
				MCItemDef.create("ship_to_grp_cd6", "ship_to_grp_cd6"),
				MCItemDef.create("ship_to_grp_nm6", "ship_to_grp_nm6"),
				MCItemDef.create("ship_to_grp_cd7", "ship_to_grp_cd7"),
				MCItemDef.create("ship_to_grp_nm7", "ship_to_grp_nm7"),
				MCItemDef.create("ship_to_grp_cd8", "ship_to_grp_cd8"),
				MCItemDef.create("ship_to_grp_nm8", "ship_to_grp_nm8"),
				MCItemDef.create("ship_to_grp_cd9", "ship_to_grp_cd9"),
				MCItemDef.create("ship_to_grp_nm9", "ship_to_grp_nm9"),
				MCItemDef.create("ship_to_grp_cd10", "ship_to_grp_cd10"),
				MCItemDef.create("ship_to_grp_nm10", "ship_to_grp_nm10"),
				MCItemDef.create("dlv_grp_cd1", "dlv_grp_cd1"),
				MCItemDef.create("dlv_grp_nm1", "dlv_grp_nm1"),
				MCItemDef.create("dlv_grp_cd2", "dlv_grp_cd2"),
				MCItemDef.create("dlv_grp_nm2", "dlv_grp_nm2"),
				MCItemDef.create("dlv_grp_cd3", "dlv_grp_cd3"),
				MCItemDef.create("dlv_grp_nm3", "dlv_grp_nm3"),
				MCItemDef.create("dlv_grp_cd4", "dlv_grp_cd4"),
				MCItemDef.create("dlv_grp_nm4", "dlv_grp_nm4"),
				MCItemDef.create("dlv_grp_cd5", "dlv_grp_cd5"),
				MCItemDef.create("dlv_grp_nm5", "dlv_grp_nm5"),
				MCItemDef.create("dlv_grp_cd6", "dlv_grp_cd6"),
				MCItemDef.create("dlv_grp_nm6", "dlv_grp_nm6"),
				MCItemDef.create("dlv_grp_cd7", "dlv_grp_cd7"),
				MCItemDef.create("dlv_grp_nm7", "dlv_grp_nm7"),
				MCItemDef.create("dlv_grp_cd8", "dlv_grp_cd8"),
				MCItemDef.create("dlv_grp_nm8", "dlv_grp_nm8"),
				MCItemDef.create("dlv_grp_cd9", "dlv_grp_cd9"),
				MCItemDef.create("dlv_grp_nm9", "dlv_grp_nm9"),
				MCItemDef.create("dlv_grp_cd10", "dlv_grp_cd10"),
				MCItemDef.create("dlv_grp_nm10", "dlv_grp_nm10"),
				MCItemDef.create("cst_grp_cd1", "cst_grp_cd1"),
				MCItemDef.create("cst_grp_nm1", "cst_grp_nm1"),
				MCItemDef.create("cst_grp_cd2", "cst_grp_cd2"),
				MCItemDef.create("cst_grp_nm2", "cst_grp_nm2"),
				MCItemDef.create("cst_grp_cd3", "cst_grp_cd3"),
				MCItemDef.create("cst_grp_nm3", "cst_grp_nm3"),
				MCItemDef.create("cst_grp_cd4", "cst_grp_cd4"),
				MCItemDef.create("cst_grp_nm4", "cst_grp_nm4"),
				MCItemDef.create("cst_grp_cd5", "cst_grp_cd5"),
				MCItemDef.create("cst_grp_nm5", "cst_grp_nm5"),
				MCItemDef.create("cst_grp_cd6", "cst_grp_cd6"),
				MCItemDef.create("cst_grp_nm6", "cst_grp_nm6"),
				MCItemDef.create("cst_grp_cd7", "cst_grp_cd7"),
				MCItemDef.create("cst_grp_nm7", "cst_grp_nm7"),
				MCItemDef.create("cst_grp_cd8", "cst_grp_cd8"),
				MCItemDef.create("cst_grp_nm8", "cst_grp_nm8"),
				MCItemDef.create("cst_grp_cd9", "cst_grp_cd9"),
				MCItemDef.create("cst_grp_nm9", "cst_grp_nm9"),
				MCItemDef.create("cst_grp_cd10", "cst_grp_cd10"),
				MCItemDef.create("cst_grp_nm10", "cst_grp_nm10"),
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
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("ship_inst_upd_cntr", "ship_inst_upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("list_no", "list_no"),
				MCItemDef.create("xfr_schd_no", "xfr_schd_no")
			}
			,
			MCBlockDef.create("Srch01_Rslt")
		);
	}
	public static MCContainerDef MS_MSBEL1410_Srch01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL1410", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("list_no", "list_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ship_schd_upd_cntr", "ship_schd_upd_cntr"),
				MCItemDef.create("ship_pr_no", "ship_pr_no"),
				MCItemDef.create("ship_pr_upd_cntr", "ship_pr_upd_cntr")
			}
			,
			MCBlockDef.create("Srch01_Ctrl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1410_Chk01_INFO = new MCOperationInfo("MS", "MSBEL1410", "Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1410_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1410", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("alloc_tgt_flg", "alloc_tgt_flg"),
				MCItemDef.create("lot_prop_flg", "lot_prop_flg"),
				MCItemDef.create("pack_flg", "pack_flg"),
				MCItemDef.create("ship_schd_tm", "ship_schd_tm"),
				MCItemDef.create("dlv_schd_tm", "dlv_schd_tm"),
				MCItemDef.create("ship_inst_tm", "ship_inst_tm"),
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ship_to_lg_grp_cd", "ship_to_lg_grp_cd"),
				MCItemDef.create("ship_to_id_typ", "ship_to_id_typ"),
				MCItemDef.create("ship_to_id_cd", "ship_to_id_cd"),
				MCItemDef.create("ship_to_id_nm", "ship_to_id_nm"),
				MCItemDef.create("ship_to_zip_cd", "ship_to_zip_cd"),
				MCItemDef.create("ship_to_addr1", "ship_to_addr1"),
				MCItemDef.create("ship_to_addr2", "ship_to_addr2"),
				MCItemDef.create("ship_to_addr3", "ship_to_addr3"),
				MCItemDef.create("ship_to_addr4", "ship_to_addr4"),
				MCItemDef.create("ship_to_cntct_dpt", "ship_to_cntct_dpt"),
				MCItemDef.create("ship_to_cntct_psn", "ship_to_cntct_psn"),
				MCItemDef.create("ship_to_tel", "ship_to_tel"),
				MCItemDef.create("ship_to_fax", "ship_to_fax"),
				MCItemDef.create("ship_to_sundry_flg", "ship_to_sundry_flg"),
				MCItemDef.create("via_dlv_typ", "via_dlv_typ"),
				MCItemDef.create("ship_wk_cd", "ship_wk_cd"),
				MCItemDef.create("ship_term_cd", "ship_term_cd"),
				MCItemDef.create("pick_prnt_flg", "pick_prnt_flg"),
				MCItemDef.create("inst_prnt_flg", "inst_prnt_flg"),
				MCItemDef.create("dlv_prnt_flg", "dlv_prnt_flg"),
				MCItemDef.create("adv_prnt_flg", "adv_prnt_flg"),
				MCItemDef.create("inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("inst_dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("inst_rmrks", "inst_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("ship_inst_upd_cntr", "ship_inst_upd_cntr")
			}
			,
			MCBlockDef.create("Chk01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBEL1410_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL1410", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("list_no", "list_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ship_schd_upd_cntr", "ship_schd_upd_cntr"),
				MCItemDef.create("ship_pr_no", "ship_pr_no"),
				MCItemDef.create("ship_pr_upd_cntr", "ship_pr_upd_cntr")
			}
			,
			MCBlockDef.create("Chk01_Ctrl")
		);
	}


	public static MCContainerDef MS_MSBEL1410_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1410", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("alloc_tgt_flg", "alloc_tgt_flg"),
				MCItemDef.create("lot_prop_flg", "lot_prop_flg"),
				MCItemDef.create("pack_flg", "pack_flg"),
				MCItemDef.create("ship_schd_tm", "ship_schd_tm"),
				MCItemDef.create("dlv_schd_tm", "dlv_schd_tm"),
				MCItemDef.create("ship_inst_tm", "ship_inst_tm"),
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ship_to_lg_grp_cd", "ship_to_lg_grp_cd"),
				MCItemDef.create("ship_to_id_typ", "ship_to_id_typ"),
				MCItemDef.create("ship_to_id_cd", "ship_to_id_cd"),
				MCItemDef.create("ship_to_id_nm", "ship_to_id_nm"),
				MCItemDef.create("ship_to_zip_cd", "ship_to_zip_cd"),
				MCItemDef.create("ship_to_addr1", "ship_to_addr1"),
				MCItemDef.create("ship_to_addr2", "ship_to_addr2"),
				MCItemDef.create("ship_to_addr3", "ship_to_addr3"),
				MCItemDef.create("ship_to_addr4", "ship_to_addr4"),
				MCItemDef.create("ship_to_cntct_dpt", "ship_to_cntct_dpt"),
				MCItemDef.create("ship_to_cntct_psn", "ship_to_cntct_psn"),
				MCItemDef.create("ship_to_tel", "ship_to_tel"),
				MCItemDef.create("ship_to_fax", "ship_to_fax"),
				MCItemDef.create("ship_to_sundry_flg", "ship_to_sundry_flg"),
				MCItemDef.create("via_dlv_typ", "via_dlv_typ"),
				MCItemDef.create("ship_wk_cd", "ship_wk_cd"),
				MCItemDef.create("ship_term_cd", "ship_term_cd"),
				MCItemDef.create("pick_prnt_flg", "pick_prnt_flg"),
				MCItemDef.create("inst_prnt_flg", "inst_prnt_flg"),
				MCItemDef.create("dlv_prnt_flg", "dlv_prnt_flg"),
				MCItemDef.create("adv_prnt_flg", "adv_prnt_flg"),
				MCItemDef.create("inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("inst_dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("inst_rmrks", "inst_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("ship_inst_upd_cntr", "ship_inst_upd_cntr"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Chk01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1410_Chk02_INFO = new MCOperationInfo("MS", "MSBEL1410", "Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1410_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1410", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("dlv_prnt_flg", "dlv_prnt_flg"),
				MCItemDef.create("ship_inst_upd_cntr", "ship_inst_upd_cntr")
			}
			,
			MCBlockDef.create("Chk02_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL1410_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1410", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("dlv_prnt_flg", "dlv_prnt_flg"),
				MCItemDef.create("ship_inst_upd_cntr", "ship_inst_upd_cntr"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Chk02_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1410_Ins01_INFO = new MCOperationInfo("MS", "MSBEL1410", "Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1410_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1410", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("alloc_tgt_flg", "alloc_tgt_flg"),
				MCItemDef.create("lot_prop_flg", "lot_prop_flg"),
				MCItemDef.create("pack_flg", "pack_flg"),
				MCItemDef.create("ship_schd_tm", "ship_schd_tm"),
				MCItemDef.create("dlv_schd_tm", "dlv_schd_tm"),
				MCItemDef.create("ship_inst_tm", "ship_inst_tm"),
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ship_to_lg_grp_cd", "ship_to_lg_grp_cd"),
				MCItemDef.create("ship_to_id_typ", "ship_to_id_typ"),
				MCItemDef.create("ship_to_id_cd", "ship_to_id_cd"),
				MCItemDef.create("ship_to_id_nm", "ship_to_id_nm"),
				MCItemDef.create("ship_to_zip_cd", "ship_to_zip_cd"),
				MCItemDef.create("ship_to_addr1", "ship_to_addr1"),
				MCItemDef.create("ship_to_addr2", "ship_to_addr2"),
				MCItemDef.create("ship_to_addr3", "ship_to_addr3"),
				MCItemDef.create("ship_to_addr4", "ship_to_addr4"),
				MCItemDef.create("ship_to_cntct_dpt", "ship_to_cntct_dpt"),
				MCItemDef.create("ship_to_cntct_psn", "ship_to_cntct_psn"),
				MCItemDef.create("ship_to_tel", "ship_to_tel"),
				MCItemDef.create("ship_to_fax", "ship_to_fax"),
				MCItemDef.create("ship_to_sundry_flg", "ship_to_sundry_flg"),
				MCItemDef.create("via_dlv_typ", "via_dlv_typ"),
				MCItemDef.create("ship_wk_cd", "ship_wk_cd"),
				MCItemDef.create("ship_term_cd", "ship_term_cd"),
				MCItemDef.create("pick_prnt_flg", "pick_prnt_flg"),
				MCItemDef.create("inst_prnt_flg", "inst_prnt_flg"),
				MCItemDef.create("dlv_prnt_flg", "dlv_prnt_flg"),
				MCItemDef.create("adv_prnt_flg", "adv_prnt_flg"),
				MCItemDef.create("inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("inst_dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("inst_rmrks", "inst_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("ship_inst_upd_cntr", "ship_inst_upd_cntr"),
				MCItemDef.create("list_no", "list_no")
			}
			,
			MCBlockDef.create("Ins01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBEL1410_Ins01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL1410", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("list_no", "list_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ship_schd_upd_cntr", "ship_schd_upd_cntr"),
				MCItemDef.create("ship_pr_no", "ship_pr_no"),
				MCItemDef.create("ship_pr_upd_cntr", "ship_pr_upd_cntr")
			}
			,
			MCBlockDef.create("Ins01_Ctrl")
		);
	}

	public static MCContainerDef MS_MSBEL1410_Ins01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL1410", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("indiv_inst_prnt_flg", "indiv_inst_prnt_flg"),
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg")
			}
			,
			MCBlockDef.create("Ins01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL1410_Ins01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1410", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("alloc_tgt_flg", "alloc_tgt_flg"),
				MCItemDef.create("lot_prop_flg", "lot_prop_flg"),
				MCItemDef.create("pack_flg", "pack_flg"),
				MCItemDef.create("ship_schd_tm", "ship_schd_tm"),
				MCItemDef.create("dlv_schd_tm", "dlv_schd_tm"),
				MCItemDef.create("ship_inst_tm", "ship_inst_tm"),
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ship_to_lg_grp_cd", "ship_to_lg_grp_cd"),
				MCItemDef.create("ship_to_id_typ", "ship_to_id_typ"),
				MCItemDef.create("ship_to_id_cd", "ship_to_id_cd"),
				MCItemDef.create("ship_to_id_nm", "ship_to_id_nm"),
				MCItemDef.create("ship_to_zip_cd", "ship_to_zip_cd"),
				MCItemDef.create("ship_to_addr1", "ship_to_addr1"),
				MCItemDef.create("ship_to_addr2", "ship_to_addr2"),
				MCItemDef.create("ship_to_addr3", "ship_to_addr3"),
				MCItemDef.create("ship_to_addr4", "ship_to_addr4"),
				MCItemDef.create("ship_to_cntct_dpt", "ship_to_cntct_dpt"),
				MCItemDef.create("ship_to_cntct_psn", "ship_to_cntct_psn"),
				MCItemDef.create("ship_to_tel", "ship_to_tel"),
				MCItemDef.create("ship_to_fax", "ship_to_fax"),
				MCItemDef.create("ship_to_sundry_flg", "ship_to_sundry_flg"),
				MCItemDef.create("via_dlv_typ", "via_dlv_typ"),
				MCItemDef.create("ship_wk_cd", "ship_wk_cd"),
				MCItemDef.create("ship_term_cd", "ship_term_cd"),
				MCItemDef.create("pick_prnt_flg", "pick_prnt_flg"),
				MCItemDef.create("inst_prnt_flg", "inst_prnt_flg"),
				MCItemDef.create("dlv_prnt_flg", "dlv_prnt_flg"),
				MCItemDef.create("adv_prnt_flg", "adv_prnt_flg"),
				MCItemDef.create("inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("inst_dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("inst_rmrks", "inst_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("ship_inst_upd_cntr", "ship_inst_upd_cntr"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Ins01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1410_Del01_INFO = new MCOperationInfo("MS", "MSBEL1410", "Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1410_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1410", "Del01",
			new MCItemDef[]{
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("dlv_prnt_flg", "dlv_prnt_flg"),
				MCItemDef.create("ship_inst_upd_cntr", "ship_inst_upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBEL1410_Del01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL1410", "Del01",
			new MCItemDef[]{
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg")
			}
			,
			MCBlockDef.create("Del01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL1410_Del01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1410", "Del01",
			new MCItemDef[]{
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("ship_inst_upd_cntr", "ship_inst_upd_cntr"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1410_Prnt01_INFO = new MCOperationInfo("MS", "MSBEL1410", "Prnt01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1410_Prnt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1410", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_seq", "dlv_slip_seq"),
				MCItemDef.create("pick_prnt_flg", "pick_prnt_flg"),
				MCItemDef.create("inst_prnt_flg", "inst_prnt_flg"),
				MCItemDef.create("dlv_prnt_flg", "dlv_prnt_flg"),
				MCItemDef.create("adv_prnt_flg", "adv_prnt_flg"),
				MCItemDef.create("ship_inst_upd_cntr", "ship_inst_upd_cntr")
			}
			,
			MCBlockDef.create("Prnt01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBEL1410_Prnt01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL1410", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("indiv_inst_prnt_flg", "indiv_inst_prnt_flg"),
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg")
			}
			,
			MCBlockDef.create("Prnt01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL1410_Prnt01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1410", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("ship_inst_upd_cntr", "ship_inst_upd_cntr"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Prnt01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1410_Chk03_INFO = new MCOperationInfo("MS", "MSBEL1410", "Chk03", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1410_Chk03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1410", "Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_seq", "dlv_slip_seq"),
				MCItemDef.create("pick_prnt_flg", "pick_prnt_flg"),
				MCItemDef.create("inst_prnt_flg", "inst_prnt_flg"),
				MCItemDef.create("dlv_prnt_flg", "dlv_prnt_flg"),
				MCItemDef.create("adv_prnt_flg", "adv_prnt_flg"),
				MCItemDef.create("ship_inst_upd_cntr", "ship_inst_upd_cntr")
			}
			,
			MCBlockDef.create("Chk03_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL1410_Chk03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1410", "Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_seq", "dlv_slip_seq"),
				MCItemDef.create("ship_inst_upd_cntr", "ship_inst_upd_cntr"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Chk03_Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

