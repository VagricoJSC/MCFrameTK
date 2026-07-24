package mcframe.serverMSBE.MSBEL1420;

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
 * [MSBEL_ShipSchdReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBEL1420.Srch01.UP.BLOCK0")){
			return MS_MSBEL1420_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1420.Srch01.DOWN.BLOCK0")){
			return MS_MSBEL1420_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1420.Chk01.UP.BLOCK0")){
			return MS_MSBEL1420_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1420.Chk01.UP.BLOCK1")){
			return MS_MSBEL1420_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1420.Chk01.DOWN.BLOCK0")){
			return MS_MSBEL1420_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1420.Srch02.UP.BLOCK0")){
			return MS_MSBEL1420_Srch02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1420.Srch02.UP.BLOCK1")){
			return MS_MSBEL1420_Srch02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1420.Srch02.DOWN.BLOCK0")){
			return MS_MSBEL1420_Srch02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1420.Upd01.UP.BLOCK0")){
			return MS_MSBEL1420_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1420.Upd01.UP.BLOCK1")){
			return MS_MSBEL1420_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1420.Upd01.DOWN.BLOCK0")){
			return MS_MSBEL1420_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1420.Sprt01.UP.BLOCK0")){
			return MS_MSBEL1420_Sprt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1420.Sprt01.DOWN.BLOCK0")){
			return MS_MSBEL1420_Sprt01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
					
	
	static final MCOperationInfo MS_MSBEL1420_Srch01_INFO = new MCOperationInfo("MS", "MSBEL1420", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1420_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1420", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ope", "ope"),
				MCItemDef.create("srch_mode", "srch_mode"),
				MCItemDef.create("not_inst_flg", "not_inst_flg"),
				MCItemDef.create("inst_flg", "inst_flg"),
				MCItemDef.create("not_ship_flg", "not_ship_flg"),
				MCItemDef.create("part_ship_flg", "part_ship_flg"),
				MCItemDef.create("ship_flg", "ship_flg"),
				MCItemDef.create("not_alloc_flg", "not_alloc_flg"),
				MCItemDef.create("part_alloc_flg", "part_alloc_flg"),
				MCItemDef.create("all_alloc_flg", "all_alloc_flg"),
				MCItemDef.create("alloc_invalid_flg", "alloc_invalid_flg"),
				MCItemDef.create("ship_block_flg", "ship_block_flg"),
				MCItemDef.create("not_ship_block_flg", "not_ship_block_flg"),
				MCItemDef.create("dlv_rqst_flg", "dlv_rqst_flg"),
				MCItemDef.create("ship_rqst_flg", "ship_rqst_flg"),
				MCItemDef.create("pd_inst_dlv_flg", "pd_inst_dlv_flg"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("ship_schd_dt_fr", "ship_schd_dt_fr"),
				MCItemDef.create("ship_schd_hm_fr", "ship_schd_hm_fr"),
				MCItemDef.create("ship_schd_dt_to", "ship_schd_dt_to"),
				MCItemDef.create("ship_schd_hm_to", "ship_schd_hm_to"),
				MCItemDef.create("dlv_schd_dt_fr", "dlv_schd_dt_fr"),
				MCItemDef.create("dlv_schd_hm_fr", "dlv_schd_hm_fr"),
				MCItemDef.create("dlv_schd_dt_to", "dlv_schd_dt_to"),
				MCItemDef.create("dlv_schd_hm_to", "dlv_schd_hm_to"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_nm", "str_ln_nm"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("ship_to_id_typ", "ship_to_id_typ"),
				MCItemDef.create("ship_to_id_cd", "ship_to_id_cd"),
				MCItemDef.create("ship_to_id_nm", "ship_to_id_nm"),
				MCItemDef.create("dlv_id_typ", "dlv_id_typ"),
				MCItemDef.create("dlv_id_cd", "dlv_id_cd"),
				MCItemDef.create("dlv_id_nm", "dlv_id_nm"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("via_dlv_typ", "via_dlv_typ"),
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
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("rqst_usr_cd", "rqst_usr_cd"),
				MCItemDef.create("rqst_usr_nm", "rqst_usr_nm"),
				MCItemDef.create("rqst_dpt_cd", "rqst_dpt_cd"),
				MCItemDef.create("rqst_dpt_nm", "rqst_dpt_nm"),
				MCItemDef.create("ship_inst_typ", "ship_inst_typ"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("xfr_schd_no", "xfr_schd_no"),
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("ship_inst_d_no", "ship_inst_d_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("ship_cnt_rmrks", "ship_cnt_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
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


	public static MCContainerDef MS_MSBEL1420_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1420", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("pr_sts_typ", "pr_sts_typ"),
				MCItemDef.create("pr_sts_typ_nm", "pr_sts_typ_nm"),
				MCItemDef.create("alloc_sts_typ", "alloc_sts_typ"),
				MCItemDef.create("alloc_sts_typ_nm", "alloc_sts_typ_nm"),
				MCItemDef.create("ship_abl_flg", "ship_abl_flg"),
				MCItemDef.create("fix_flg", "fix_flg"),
				MCItemDef.create("org_fix_flg", "org_fix_flg"),
				MCItemDef.create("dlv_rqst_dt", "dlv_rqst_dt"),
				MCItemDef.create("dlv_rqst_hm", "dlv_rqst_hm"),
				MCItemDef.create("pd_inst_dlv_dt", "pd_inst_dlv_dt"),
				MCItemDef.create("pd_inst_dlv_hm", "pd_inst_dlv_hm"),
				MCItemDef.create("dlv_day_week_typ", "dlv_day_week_typ"),
				MCItemDef.create("dlv_day_week_typ_nm", "dlv_day_week_typ_nm"),
				MCItemDef.create("ship_rqst_dt", "ship_rqst_dt"),
				MCItemDef.create("ship_rqst_hm", "ship_rqst_hm"),
				MCItemDef.create("src_ship_schd_dt", "src_ship_schd_dt"),
				MCItemDef.create("src_ship_schd_hm", "src_ship_schd_hm"),
				MCItemDef.create("ship_schd_dt", "ship_schd_dt"),
				MCItemDef.create("ship_schd_hm", "ship_schd_hm"),
				MCItemDef.create("ship_schd_time", "ship_schd_time"),
				MCItemDef.create("fix_ship_schd_dt", "fix_ship_schd_dt"),
				MCItemDef.create("fix_ship_schd_hm", "fix_ship_schd_hm"),
				MCItemDef.create("dlv_schd_dt", "dlv_schd_dt"),
				MCItemDef.create("dlv_schd_hm", "dlv_schd_hm"),
				MCItemDef.create("fix_dlv_schd_dt", "fix_dlv_schd_dt"),
				MCItemDef.create("fix_dlv_schd_hm", "fix_dlv_schd_hm"),
				MCItemDef.create("ship_block_flg", "ship_block_flg"),
				MCItemDef.create("ship_term_cd", "ship_term_cd"),
				MCItemDef.create("ship_term_nm", "ship_term_nm"),
				MCItemDef.create("ship_wk_grp_cd", "ship_wk_grp_cd"),
				MCItemDef.create("ship_wk_grp_nm", "ship_wk_grp_nm"),
				MCItemDef.create("ship_wk_cd", "ship_wk_cd"),
				MCItemDef.create("ship_wk_nm", "ship_wk_nm"),
				MCItemDef.create("ship_to_id_typ", "ship_to_id_typ"),
				MCItemDef.create("ship_to_id_typ_nm", "ship_to_id_typ_nm"),
				MCItemDef.create("ship_to_id_cd", "ship_to_id_cd"),
				MCItemDef.create("ship_to_id_nm", "ship_to_id_nm"),
				MCItemDef.create("ship_to_zip_cd", "ship_to_zip_cd"),
				MCItemDef.create("ship_to_addr1", "ship_to_addr1"),
				MCItemDef.create("ship_to_addr2", "ship_to_addr2"),
				MCItemDef.create("ship_to_addr3", "ship_to_addr3"),
				MCItemDef.create("ship_to_addr4", "ship_to_addr4"),
				MCItemDef.create("dlv_id_typ", "dlv_id_typ"),
				MCItemDef.create("dlv_id_typ_nm", "dlv_id_typ_nm"),
				MCItemDef.create("dlv_id_cd", "dlv_id_cd"),
				MCItemDef.create("dlv_id_nm", "dlv_id_nm"),
				MCItemDef.create("rqst_usr_cd", "rqst_usr_cd"),
				MCItemDef.create("rqst_usr_nm", "rqst_usr_nm"),
				MCItemDef.create("rqst_dpt_cd", "rqst_dpt_cd"),
				MCItemDef.create("rqst_dpt_nm", "rqst_dpt_nm"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("dscnt_itm_flg", "dscnt_itm_flg"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("alloc_sno1", "alloc_sno1"),
				MCItemDef.create("alloc_sno2", "alloc_sno2"),
				MCItemDef.create("alloc_sno3", "alloc_sno3"),
				MCItemDef.create("alloc_sno4", "alloc_sno4"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("alloc_ent_unit_cd", "alloc_ent_unit_cd"),
				MCItemDef.create("alloc_ent_unit_nm", "alloc_ent_unit_nm"),
				MCItemDef.create("alloc_ent_unit_dec_place", "alloc_ent_unit_dec_place"),
				MCItemDef.create("alloc_ent_unit_conv_base_qty", "alloc_ent_unit_conv_base_qty"),
				MCItemDef.create("alloc_ent_unit_conv_qty", "alloc_ent_unit_conv_qty"),
				MCItemDef.create("alloc_ent_unit_qty", "alloc_ent_unit_qty"),
				MCItemDef.create("alloc_ent_unit_rnd_typ", "alloc_ent_unit_rnd_typ"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_conv_base_qty", "base_unit_conv_base_qty"),
				MCItemDef.create("base_unit_conv_qty", "base_unit_conv_qty"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("alloc_base_unit_qty", "alloc_base_unit_qty"),
				MCItemDef.create("alloc_qty", "alloc_qty"),
				MCItemDef.create("wait_qty", "wait_qty"),
				MCItemDef.create("ship_inst_qty", "ship_inst_qty"),
				MCItemDef.create("ship_act_qty", "ship_act_qty"),
				MCItemDef.create("iv_schd_qty", "iv_schd_qty"),
				MCItemDef.create("iv_act_qty", "iv_act_qty"),
				MCItemDef.create("act_cont_qty", "act_cont_qty"),
				MCItemDef.create("act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("std_cont_qty", "std_cont_qty"),
				MCItemDef.create("std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("cont_fctr_unit_cd", "cont_fctr_unit_cd"),
				MCItemDef.create("cont_fctr_unit_nm", "cont_fctr_unit_nm"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("cont_fctr_rnd_typ", "cont_fctr_rnd_typ"),
				MCItemDef.create("cont_fctr_dec_place", "cont_fctr_dec_place"),
				MCItemDef.create("wt", "wt"),
				MCItemDef.create("dim", "dim"),
				MCItemDef.create("alloc_flg", "alloc_flg"),
				MCItemDef.create("grp_alloc_flg", "grp_alloc_flg"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("str_ln_tgt_flg", "str_ln_tgt_flg"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_nm", "str_ln_nm"),
				MCItemDef.create("str_ln_cd_none_flg", "str_ln_cd_none_flg"),
				MCItemDef.create("lot_none_flg", "lot_none_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("lot_no_typ", "lot_no_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("sublot_no_typ", "sublot_no_typ"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("ver_flg", "ver_flg"),
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
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("def_loc_cd", "def_loc_cd"),
				MCItemDef.create("def_loc_nm", "def_loc_nm"),
				MCItemDef.create("ship_loc_prio_flg", "ship_loc_prio_flg"),
				MCItemDef.create("assort_typ", "assort_typ"),
				MCItemDef.create("assort_typ_nm", "assort_typ_nm"),
				MCItemDef.create("set_itm_grp_no", "set_itm_grp_no"),
				MCItemDef.create("assort_sts_mark", "assort_sts_mark"),
				MCItemDef.create("base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("base_ac_dt", "base_ac_dt"),
				MCItemDef.create("ship_cnt_rmrks", "ship_cnt_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("xfr_schd_no", "xfr_schd_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("iv_trd_flg", "iv_trd_flg"),
				MCItemDef.create("iv_reg_flg", "iv_reg_flg"),
				MCItemDef.create("iv_ship_flg", "iv_ship_flg"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("ship_inst_d_no", "ship_inst_d_no"),
				MCItemDef.create("ship_inst_typ", "ship_inst_typ"),
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("ship_fr_lg_grp_nm", "ship_fr_lg_grp_nm"),
				MCItemDef.create("ship_to_lg_grp_cd", "ship_to_lg_grp_cd"),
				MCItemDef.create("ship_to_lg_grp_nm", "ship_to_lg_grp_nm"),
				MCItemDef.create("ship_to_cntct_dpt", "ship_to_cntct_dpt"),
				MCItemDef.create("ship_to_cntct_psn", "ship_to_cntct_psn"),
				MCItemDef.create("ship_to_tel", "ship_to_tel"),
				MCItemDef.create("ship_to_fax", "ship_to_fax"),
				MCItemDef.create("ship_to_sundry_flg", "ship_to_sundry_flg"),
				MCItemDef.create("ship_to_cntry_cd", "ship_to_cntry_cd"),
				MCItemDef.create("ship_to_cntry_nm", "ship_to_cntry_nm"),
				MCItemDef.create("via_dlv_typ", "via_dlv_typ"),
				MCItemDef.create("via_dlv_typ_nm", "via_dlv_typ_nm"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("ship_pr_no", "ship_pr_no"),
				MCItemDef.create("alloc_typ", "alloc_typ"),
				MCItemDef.create("alloc_typ_nm", "alloc_typ_nm"),
				MCItemDef.create("alloc_scope_typ", "alloc_scope_typ"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("not_lot_mix_flg", "not_lot_mix_flg"),
				MCItemDef.create("not_sublot_mix_flg", "not_sublot_mix_flg"),
				MCItemDef.create("sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
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
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("ship_pr_upd_cntr", "ship_pr_upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("Srch01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1420_Chk01_INFO = new MCOperationInfo("MS", "MSBEL1420", "Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1420_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1420", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("ship_schd_tm", "ship_schd_tm"),
				MCItemDef.create("dlv_schd_tm", "dlv_schd_tm"),
				MCItemDef.create("no_calc_flg", "no_calc_flg"),
				MCItemDef.create("ship_block_flg", "ship_block_flg"),
				MCItemDef.create("cl_time_chk_flg", "cl_time_chk_flg"),
				MCItemDef.create("ship_dt_chk_flg", "ship_dt_chk_flg"),
				MCItemDef.create("ship_term_cd", "ship_term_cd"),
				MCItemDef.create("ship_wk_cd", "ship_wk_cd"),
				MCItemDef.create("alloc_sno1", "alloc_sno1"),
				MCItemDef.create("alloc_sno2", "alloc_sno2"),
				MCItemDef.create("alloc_sno3", "alloc_sno3"),
				MCItemDef.create("alloc_sno4", "alloc_sno4"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("alloc_ent_unit_cd", "alloc_ent_unit_cd"),
				MCItemDef.create("alloc_ent_unit_qty", "alloc_ent_unit_qty"),
				MCItemDef.create("alloc_flg", "alloc_flg"),
				MCItemDef.create("grp_alloc_flg", "grp_alloc_flg"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_cd_none_flg", "str_ln_cd_none_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("not_lot_mix_flg", "not_lot_mix_flg"),
				MCItemDef.create("not_sublot_mix_flg", "not_sublot_mix_flg"),
				MCItemDef.create("base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("base_ac_dt", "base_ac_dt"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("ship_pr_no", "ship_pr_no"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("ship_pr_upd_cntr", "ship_pr_upd_cntr"),
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("ship_to_lg_grp_cd", "ship_to_lg_grp_cd"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("dlv_id_cd", "dlv_id_cd"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("fix_flg", "fix_flg"),
				MCItemDef.create("dlv_lg_grp_cd", "dlv_lg_grp_cd"),
				MCItemDef.create("slo_d_no", "slo_d_no")
			}
			,
			MCBlockDef.create("Chk01_Rslt")
		);
	}

	public static MCContainerDef MS_MSBEL1420_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL1420", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("srch_mode", "srch_mode"),
				MCItemDef.create("no_lot_chk_flg", "no_lot_chk_flg")
			}
			,
			MCBlockDef.create("Upd01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL1420_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1420", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("ship_schd_tm", "ship_schd_tm"),
				MCItemDef.create("dlv_schd_tm", "dlv_schd_tm"),
				MCItemDef.create("no_calc_flg", "no_calc_flg"),
				MCItemDef.create("ship_block_flg", "ship_block_flg"),
				MCItemDef.create("cl_time_chk_flg", "cl_time_chk_flg"),
				MCItemDef.create("ship_dt_chk_flg", "ship_dt_chk_flg"),
				MCItemDef.create("ship_term_cd", "ship_term_cd"),
				MCItemDef.create("ship_wk_cd", "ship_wk_cd"),
				MCItemDef.create("alloc_sno1", "alloc_sno1"),
				MCItemDef.create("alloc_sno2", "alloc_sno2"),
				MCItemDef.create("alloc_sno3", "alloc_sno3"),
				MCItemDef.create("alloc_sno4", "alloc_sno4"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("alloc_ent_unit_cd", "alloc_ent_unit_cd"),
				MCItemDef.create("alloc_ent_unit_qty", "alloc_ent_unit_qty"),
				MCItemDef.create("alloc_flg", "alloc_flg"),
				MCItemDef.create("grp_alloc_flg", "grp_alloc_flg"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_cd_none_flg", "str_ln_cd_none_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("not_lot_mix_flg", "not_lot_mix_flg"),
				MCItemDef.create("not_sublot_mix_flg", "not_sublot_mix_flg"),
				MCItemDef.create("base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("base_ac_dt", "base_ac_dt"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("ship_pr_no", "ship_pr_no"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("ship_pr_upd_cntr", "ship_pr_upd_cntr"),
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("ship_to_lg_grp_cd", "ship_to_lg_grp_cd"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("dlv_id_cd", "dlv_id_cd"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("dlv_lg_grp_cd", "dlv_lg_grp_cd"),
				MCItemDef.create("not_dt_calc_flg", "not_dt_calc_flg"),
				MCItemDef.create("slo_d_no", "slo_d_no")
			}
			,
			MCBlockDef.create("Chk01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1420_Srch02_INFO = new MCOperationInfo("MS", "MSBEL1420", "Srch02", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1420_Srch02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1420", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("ship_schd_tm", "ship_schd_tm"),
				MCItemDef.create("dlv_schd_tm", "dlv_schd_tm"),
				MCItemDef.create("ship_term_cd", "ship_term_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("alloc_sno1", "alloc_sno1"),
				MCItemDef.create("alloc_sno2", "alloc_sno2"),
				MCItemDef.create("alloc_sno3", "alloc_sno3"),
				MCItemDef.create("alloc_sno4", "alloc_sno4"),
				MCItemDef.create("alloc_ent_unit_cd", "alloc_ent_unit_cd"),
				MCItemDef.create("alloc_ent_unit_nm", "alloc_ent_unit_nm"),
				MCItemDef.create("alloc_ent_unit_dec_place", "alloc_ent_unit_dec_place"),
				MCItemDef.create("alloc_ent_unit_conv_base_qty", "alloc_ent_unit_conv_base_qty"),
				MCItemDef.create("alloc_ent_unit_conv_qty", "alloc_ent_unit_conv_qty"),
				MCItemDef.create("alloc_ent_unit_qty", "alloc_ent_unit_qty"),
				MCItemDef.create("alloc_ent_unit_rnd_typ", "alloc_ent_unit_rnd_typ"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("alloc_base_unit_qty", "alloc_base_unit_qty"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("ship_to_lg_grp_cd", "ship_to_lg_grp_cd"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("org_ship_alloc_sts_no", "org_ship_alloc_sts_no"),
				MCItemDef.create("alloc_scope_typ", "alloc_scope_typ"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("str_ln_tgt_flg", "str_ln_tgt_flg"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_nm", "str_ln_nm"),
				MCItemDef.create("str_ln_cd_none_flg", "str_ln_cd_none_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("not_lot_mix_flg", "not_lot_mix_flg"),
				MCItemDef.create("not_sublot_mix_flg", "not_sublot_mix_flg"),
				MCItemDef.create("dlv_id_cd", "dlv_id_cd"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("lot_none_flg", "lot_none_flg")
			}
			,
			MCBlockDef.create("Srch02_Rslt")
		);
	}

	public static MCContainerDef MS_MSBEL1420_Srch02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL1420", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("no_lot_chk_flg", "no_lot_chk_flg")
			}
			,
			MCBlockDef.create("Srch02_Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL1420_Srch02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1420", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("alloc_sno1", "alloc_sno1"),
				MCItemDef.create("alloc_sno2", "alloc_sno2"),
				MCItemDef.create("alloc_sno3", "alloc_sno3"),
				MCItemDef.create("alloc_sno4", "alloc_sno4"),
				MCItemDef.create("alloc_ent_unit_cd", "alloc_ent_unit_cd"),
				MCItemDef.create("alloc_ent_unit_nm", "alloc_ent_unit_nm"),
				MCItemDef.create("alloc_ent_unit_dec_place", "alloc_ent_unit_dec_place"),
				MCItemDef.create("alloc_ent_unit_conv_base_qty", "alloc_ent_unit_conv_base_qty"),
				MCItemDef.create("alloc_ent_unit_conv_qty", "alloc_ent_unit_conv_qty"),
				MCItemDef.create("alloc_ent_unit_qty", "alloc_ent_unit_qty"),
				MCItemDef.create("alloc_ent_unit_rnd_typ", "alloc_ent_unit_rnd_typ"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("alloc_base_unit_qty", "alloc_base_unit_qty"),
				MCItemDef.create("act_cont_qty", "act_cont_qty"),
				MCItemDef.create("act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("std_cont_qty", "std_cont_qty"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("str_ln_tgt_flg", "str_ln_tgt_flg"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_nm", "str_ln_nm"),
				MCItemDef.create("str_ln_cd_none_flg", "str_ln_cd_none_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("no_alloc_flg", "no_alloc_flg")
			}
			,
			MCBlockDef.create("Srch02_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1420_Upd01_INFO = new MCOperationInfo("MS", "MSBEL1420", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1420_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1420", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("ship_schd_tm", "ship_schd_tm"),
				MCItemDef.create("dlv_schd_tm", "dlv_schd_tm"),
				MCItemDef.create("no_calc_flg", "no_calc_flg"),
				MCItemDef.create("ship_block_flg", "ship_block_flg"),
				MCItemDef.create("cl_time_chk_flg", "cl_time_chk_flg"),
				MCItemDef.create("ship_dt_chk_flg", "ship_dt_chk_flg"),
				MCItemDef.create("ship_term_cd", "ship_term_cd"),
				MCItemDef.create("ship_wk_cd", "ship_wk_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("alloc_sno1", "alloc_sno1"),
				MCItemDef.create("alloc_sno2", "alloc_sno2"),
				MCItemDef.create("alloc_sno3", "alloc_sno3"),
				MCItemDef.create("alloc_sno4", "alloc_sno4"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("alloc_ent_unit_cd", "alloc_ent_unit_cd"),
				MCItemDef.create("alloc_ent_unit_qty", "alloc_ent_unit_qty"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("alloc_base_unit_qty", "alloc_base_unit_qty"),
				MCItemDef.create("alloc_flg", "alloc_flg"),
				MCItemDef.create("grp_alloc_flg", "grp_alloc_flg"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_cd_none_flg", "str_ln_cd_none_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("not_lot_mix_flg", "not_lot_mix_flg"),
				MCItemDef.create("not_sublot_mix_flg", "not_sublot_mix_flg"),
				MCItemDef.create("base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("base_ac_dt", "base_ac_dt"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("org_ship_alloc_sts_no", "org_ship_alloc_sts_no"),
				MCItemDef.create("ship_pr_no", "ship_pr_no"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("ship_pr_upd_cntr", "ship_pr_upd_cntr"),
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("ship_to_lg_grp_cd", "ship_to_lg_grp_cd"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("dlv_id_cd", "dlv_id_cd"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("lot_none_flg", "lot_none_flg"),
				MCItemDef.create("fix_flg", "fix_flg")
			}
			,
			MCBlockDef.create("Upd01_Rslt")
		);
	}

	public static MCContainerDef MS_MSBEL1420_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL1420", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("srch_mode", "srch_mode"),
				MCItemDef.create("no_lot_chk_flg", "no_lot_chk_flg")
			}
			,
			MCBlockDef.create("Upd01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL1420_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1420", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("alloc_sts_typ", "alloc_sts_typ"),
				MCItemDef.create("alloc_sts_typ_nm", "alloc_sts_typ_nm"),
				MCItemDef.create("fix_ship_schd_dt", "fix_ship_schd_dt"),
				MCItemDef.create("fix_ship_schd_hm", "fix_ship_schd_hm"),
				MCItemDef.create("fix_dlv_schd_dt", "fix_dlv_schd_dt"),
				MCItemDef.create("fix_dlv_schd_hm", "fix_dlv_schd_hm"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Upd01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1420_Sprt01_INFO = new MCOperationInfo("MS", "MSBEL1420", "Sprt01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1420_Sprt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1420", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("base_ac_dt", "base_ac_dt")
			}
			,
			MCBlockDef.create("Sprt01_Rslt")
		);
	}


	public static MCContainerDef MS_MSBEL1420_Sprt01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1420", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("base_ac_dt", "base_ac_dt")
			}
			,
			MCBlockDef.create("Sprt01_Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

