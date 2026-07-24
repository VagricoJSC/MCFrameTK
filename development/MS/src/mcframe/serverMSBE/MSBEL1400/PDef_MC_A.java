package mcframe.serverMSBE.MSBEL1400;

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
 * [MSBEL_ShipInstReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBEL1400.Srch01.UP.BLOCK0")){
			return MS_MSBEL1400_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1400.Srch01.DOWN.BLOCK0")){
			return MS_MSBEL1400_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1400.Srch01.DOWN.BLOCK1")){
			return MS_MSBEL1400_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1400.Srch01.DOWN.BLOCK2")){
			return MS_MSBEL1400_Srch01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBEL1400.Srch02.UP.BLOCK0")){
			return MS_MSBEL1400_Srch02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1400.Srch02.DOWN.BLOCK0")){
			return MS_MSBEL1400_Srch02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1400.Srch02.DOWN.BLOCK1")){
			return MS_MSBEL1400_Srch02_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1400.Srch02.DOWN.BLOCK2")){
			return MS_MSBEL1400_Srch02_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBEL1400.Sprt01.UP.BLOCK0")){
			return MS_MSBEL1400_Sprt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1400.Sprt01.UP.BLOCK1")){
			return MS_MSBEL1400_Sprt01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1400.Sprt01.UP.BLOCK2")){
			return MS_MSBEL1400_Sprt01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBEL1400.Sprt01.DOWN.BLOCK0")){
			return MS_MSBEL1400_Sprt01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1400.Chk01.UP.BLOCK0")){
			return MS_MSBEL1400_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1400.Chk01.UP.BLOCK1")){
			return MS_MSBEL1400_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1400.Chk01.UP.BLOCK2")){
			return MS_MSBEL1400_Chk01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBEL1400.Chk01.DOWN.BLOCK0")){
			return MS_MSBEL1400_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1400.Chk01.DOWN.BLOCK1")){
			return MS_MSBEL1400_Chk01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1400.Ins01.UP.BLOCK0")){
			return MS_MSBEL1400_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1400.Ins01.UP.BLOCK1")){
			return MS_MSBEL1400_Ins01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1400.Ins01.UP.BLOCK2")){
			return MS_MSBEL1400_Ins01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBEL1400.Ins01.UP.BLOCK3")){
			return MS_MSBEL1400_Ins01_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBEL1400.Ins01.DOWN.BLOCK0")){
			return MS_MSBEL1400_Ins01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1400.Ins01.DOWN.BLOCK1")){
			return MS_MSBEL1400_Ins01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1400.Chk02.UP.BLOCK0")){
			return MS_MSBEL1400_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1400.Chk02.UP.BLOCK1")){
			return MS_MSBEL1400_Chk02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1400.Chk02.UP.BLOCK2")){
			return MS_MSBEL1400_Chk02_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBEL1400.Chk02.DOWN.BLOCK0")){
			return MS_MSBEL1400_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1400.Chk02.DOWN.BLOCK1")){
			return MS_MSBEL1400_Chk02_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1400.Upd01.UP.BLOCK0")){
			return MS_MSBEL1400_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1400.Upd01.UP.BLOCK1")){
			return MS_MSBEL1400_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1400.Upd01.UP.BLOCK2")){
			return MS_MSBEL1400_Upd01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBEL1400.Upd01.UP.BLOCK3")){
			return MS_MSBEL1400_Upd01_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBEL1400.Upd01.DOWN.BLOCK0")){
			return MS_MSBEL1400_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1400.Chk03.UP.BLOCK0")){
			return MS_MSBEL1400_Chk03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1400.Chk03.UP.BLOCK1")){
			return MS_MSBEL1400_Chk03_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1400.Chk03.UP.BLOCK2")){
			return MS_MSBEL1400_Chk03_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBEL1400.Chk03.DOWN.BLOCK0")){
			return MS_MSBEL1400_Chk03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1400.Chk03.DOWN.BLOCK1")){
			return MS_MSBEL1400_Chk03_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1400.Del01.UP.BLOCK0")){
			return MS_MSBEL1400_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1400.Del01.UP.BLOCK1")){
			return MS_MSBEL1400_Del01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1400.Del01.UP.BLOCK2")){
			return MS_MSBEL1400_Del01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBEL1400.Del01.UP.BLOCK3")){
			return MS_MSBEL1400_Del01_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBEL1400.Chk04.UP.BLOCK0")){
			return MS_MSBEL1400_Chk04_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1400.Chk04.UP.BLOCK1")){
			return MS_MSBEL1400_Chk04_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1400.Chk04.DOWN.BLOCK0")){
			return MS_MSBEL1400_Chk04_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1400.Prnt01.UP.BLOCK0")){
			return MS_MSBEL1400_Prnt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1400.Prnt01.UP.BLOCK1")){
			return MS_MSBEL1400_Prnt01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1400.Prnt01.UP.BLOCK2")){
			return MS_MSBEL1400_Prnt01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBEL1400.Sprt02.UP.BLOCK0")){
			return MS_MSBEL1400_Sprt02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1400.Sprt02.DOWN.BLOCK0")){
			return MS_MSBEL1400_Sprt02_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
												
	
	static final MCOperationInfo MS_MSBEL1400_Srch01_INFO = new MCOperationInfo("MS", "MSBEL1400", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1400_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1400", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("screen_ope", "screen_ope"),
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("ship_inst_rev", "ship_inst_rev"),
				MCItemDef.create("latest_flg", "latest_flg")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL1400_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1400", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("ship_fr_lg_grp_nm", "ship_fr_lg_grp_nm"),
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("ship_inst_rev", "ship_inst_rev"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("ship_inst_dt", "ship_inst_dt"),
				MCItemDef.create("ship_inst_hm", "ship_inst_hm"),
				MCItemDef.create("ship_schd_dt", "ship_schd_dt"),
				MCItemDef.create("ship_schd_hm", "ship_schd_hm"),
				MCItemDef.create("ship_schd_time", "ship_schd_time"),
				MCItemDef.create("dlv_schd_dt", "dlv_schd_dt"),
				MCItemDef.create("dlv_schd_hm", "dlv_schd_hm"),
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
				MCItemDef.create("ship_to_lg_grp_cd", "ship_to_lg_grp_cd"),
				MCItemDef.create("ship_to_lg_grp_nm", "ship_to_lg_grp_nm"),
				MCItemDef.create("inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("inst_usr_nm", "inst_usr_nm"),
				MCItemDef.create("inst_dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("inst_dpt_nm", "inst_dpt_nm"),
				MCItemDef.create("ship_term_cd", "ship_term_cd"),
				MCItemDef.create("ship_term_nm", "ship_term_nm"),
				MCItemDef.create("ship_wk_grp_cd", "ship_wk_grp_cd"),
				MCItemDef.create("ship_wk_grp_nm", "ship_wk_grp_nm"),
				MCItemDef.create("ship_wk_cd", "ship_wk_cd"),
				MCItemDef.create("ship_wk_nm", "ship_wk_nm"),
				MCItemDef.create("ship_wt", "ship_wt"),
				MCItemDef.create("ship_dim", "ship_dim"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("inst_rmrks", "inst_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("immd_pick_prnt_flg", "immd_pick_prnt_flg"),
				MCItemDef.create("immd_ship_inst_prnt_flg", "immd_ship_inst_prnt_flg"),
				MCItemDef.create("immd_dlv_prnt_flg", "immd_dlv_prnt_flg"),
				MCItemDef.create("immd_ship_adv_prnt_flg", "immd_ship_adv_prnt_flg"),
				MCItemDef.create("pick_prnt_flg", "pick_prnt_flg"),
				MCItemDef.create("ship_inst_prnt_flg", "ship_inst_prnt_flg"),
				MCItemDef.create("dlv_prnt_flg", "dlv_prnt_flg"),
				MCItemDef.create("ship_adv_prnt_flg", "ship_adv_prnt_flg"),
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
				MCItemDef.create("ship_inst_upd_cntr", "ship_inst_upd_cntr"),
				MCItemDef.create("non_dlv_prnt_flg", "non_dlv_prnt_flg"),
				MCItemDef.create("non_adv_prnt_flg", "non_adv_prnt_flg"),
				MCItemDef.create("latest_flg", "latest_flg"),
				MCItemDef.create("can_flg", "can_flg")
			}
			,
			MCBlockDef.create("Srch01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBEL1400_Srch01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL1400", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("dscnt_itm_flg", "dscnt_itm_flg"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("lot_none_flg", "lot_none_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("alloc_ver_no", "alloc_ver_no"),
				MCItemDef.create("ver_flg", "ver_flg"),
				MCItemDef.create("not_lot_mix_flg", "not_lot_mix_flg"),
				MCItemDef.create("not_sublot_mix_flg", "not_sublot_mix_flg"),
				MCItemDef.create("ent_unit_cd", "ent_unit_cd"),
				MCItemDef.create("ent_unit_nm", "ent_unit_nm"),
				MCItemDef.create("ent_unit_dec_place", "ent_unit_dec_place"),
				MCItemDef.create("ent_unit_conv_base_qty", "ent_unit_conv_base_qty"),
				MCItemDef.create("ent_unit_conv_qty", "ent_unit_conv_qty"),
				MCItemDef.create("ent_unit_rnd_typ", "ent_unit_rnd_typ"),
				MCItemDef.create("ent_unit_qty", "ent_unit_qty"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_conv_base_qty", "base_unit_conv_base_qty"),
				MCItemDef.create("base_unit_conv_qty", "base_unit_conv_qty"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("inst_bndl_flg", "inst_bndl_flg"),
				MCItemDef.create("pckg_unit_cd", "pckg_unit_cd"),
				MCItemDef.create("pckg_unit_nm", "pckg_unit_nm"),
				MCItemDef.create("pckg_unit_dec_place", "pckg_unit_dec_place"),
				MCItemDef.create("pckg_unit_conv_base_qty", "pckg_unit_conv_base_qty"),
				MCItemDef.create("pckg_unit_conv_qty", "pckg_unit_conv_qty"),
				MCItemDef.create("pckg_unit_rnd_typ", "pckg_unit_rnd_typ"),
				MCItemDef.create("pckg_unit_qty", "pckg_unit_qty"),
				MCItemDef.create("iv_schd_qty", "iv_schd_qty"),
				MCItemDef.create("ship_act_qty", "ship_act_qty"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("act_cont_qty", "act_cont_qty"),
				MCItemDef.create("act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("std_cont_qty", "std_cont_qty"),
				MCItemDef.create("std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("cont_fctr_unit_cd", "cont_fctr_unit_cd"),
				MCItemDef.create("cont_fctr_unit_nm", "cont_fctr_unit_nm"),
				MCItemDef.create("cont_unit_dec_place", "cont_unit_dec_place"),
				MCItemDef.create("cont_unit_rnd_typ", "cont_unit_rnd_typ"),
				MCItemDef.create("alloc_flg", "alloc_flg"),
				MCItemDef.create("grp_alloc_flg", "grp_alloc_flg"),
				MCItemDef.create("ship_loc_cd", "ship_loc_cd"),
				MCItemDef.create("ship_loc_nm", "ship_loc_nm"),
				MCItemDef.create("ship_site_cd", "ship_site_cd"),
				MCItemDef.create("ship_str_ln_tgt_flg", "ship_str_ln_tgt_flg"),
				MCItemDef.create("ship_str_ln_cd", "ship_str_ln_cd"),
				MCItemDef.create("ship_str_ln_nm", "ship_str_ln_nm"),
				MCItemDef.create("dlv_str_ln_tgt_flg", "dlv_str_ln_tgt_flg"),
				MCItemDef.create("dlv_str_ln_cd", "dlv_str_ln_cd"),
				MCItemDef.create("dlv_str_ln_nm", "dlv_str_ln_nm"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("quality_typ_nm", "quality_typ_nm"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("alloc_sno1", "alloc_sno1"),
				MCItemDef.create("alloc_sno2", "alloc_sno2"),
				MCItemDef.create("alloc_sno3", "alloc_sno3"),
				MCItemDef.create("alloc_sno4", "alloc_sno4"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_insp_typ_nm", "stk_insp_typ_nm"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_id_typ_nm", "stk_id_typ_nm"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_bp_nm", "stk_bp_nm"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("stk_arrv_bp_nm", "stk_arrv_bp_nm"),
				MCItemDef.create("dlv_id_typ", "dlv_id_typ"),
				MCItemDef.create("dlv_id_typ_nm", "dlv_id_typ_nm"),
				MCItemDef.create("dlv_id_cd", "dlv_id_cd"),
				MCItemDef.create("dlv_id_nm", "dlv_id_nm"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("def_loc_cd", "def_loc_cd"),
				MCItemDef.create("def_loc_nm", "def_loc_nm"),
				MCItemDef.create("ship_loc_prio_flg", "ship_loc_prio_flg"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("rsn_nm", "rsn_nm"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_dpt_nm", "bd_dpt_nm"),
				MCItemDef.create("pri_prnt_flg", "pri_prnt_flg"),
				MCItemDef.create("skip_chk_ship_flg", "skip_chk_ship_flg"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("prov_typ_nm", "prov_typ_nm"),
				MCItemDef.create("prov_basis_typ", "prov_basis_typ"),
				MCItemDef.create("prov_basis_typ_nm", "prov_basis_typ_nm"),
				MCItemDef.create("ret_prov_typ", "ret_prov_typ"),
				MCItemDef.create("ret_prov_typ_nm", "ret_prov_typ_nm"),
				MCItemDef.create("ret_prov_basis_typ", "ret_prov_basis_typ"),
				MCItemDef.create("ret_prov_basis_typ_nm", "ret_prov_basis_typ_nm"),
				MCItemDef.create("wms_flg", "wms_flg"),
				MCItemDef.create("last_wms_flg", "last_wms_flg"),
				MCItemDef.create("wms_tgt_flg", "wms_tgt_flg"),
				MCItemDef.create("base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("base_ac_dt", "base_ac_dt"),
				MCItemDef.create("ship_cnt_rmrks", "ship_cnt_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("inst_d_rmrks", "inst_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("xfr_schd_no", "xfr_schd_no"),
				MCItemDef.create("ship_inst_d_no", "ship_inst_d_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("ship_pr_no", "ship_pr_no"),
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("ship_inst_typ", "ship_inst_typ"),
				MCItemDef.create("xfr_src_typ", "xfr_src_typ"),
				MCItemDef.create("iv_trd_flg", "iv_trd_flg"),
				MCItemDef.create("cst_iv_flg", "cst_iv_flg"),
				MCItemDef.create("cststk_flg", "cststk_flg"),
				MCItemDef.create("loan_flg", "loan_flg"),
				MCItemDef.create("ship_wt", "ship_wt"),
				MCItemDef.create("ship_dim", "ship_dim"),
				MCItemDef.create("unit_wt", "unit_wt"),
				MCItemDef.create("unit_dim", "unit_dim"),
				MCItemDef.create("alloc_scope_typ", "alloc_scope_typ"),
				MCItemDef.create("ship_schd_loc_cd", "ship_schd_loc_cd"),
				MCItemDef.create("ship_schd_loc_sppl_cd", "ship_schd_loc_sppl_cd")
			}
			,
			MCBlockDef.create("Srch01_Dtl")
		);
	}
	public static MCContainerDef MS_MSBEL1400_Srch01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL1400", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ship_inst_d_no", "ship_inst_d_no"),
				MCItemDef.create("ship_pr_no", "ship_pr_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("ship_pr_upd_cntr", "ship_pr_upd_cntr"),
				MCItemDef.create("ship_schd_upd_cntr", "ship_schd_upd_cntr")
			}
			,
			MCBlockDef.create("Srch01_ShipSchd_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1400_Srch02_INFO = new MCOperationInfo("MS", "MSBEL1400", "Srch02", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1400_Srch02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1400", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("linked_ship_schd_no", "linked_ship_schd_no")
			}
			,
			MCBlockDef.create("Srch02_Hdr")
		);
	}


	public static MCContainerDef MS_MSBEL1400_Srch02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1400", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("ship_fr_lg_grp_nm", "ship_fr_lg_grp_nm"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("ship_schd_dt", "ship_schd_dt"),
				MCItemDef.create("ship_schd_hm", "ship_schd_hm"),
				MCItemDef.create("ship_schd_time", "ship_schd_time"),
				MCItemDef.create("dlv_schd_dt", "dlv_schd_dt"),
				MCItemDef.create("dlv_schd_hm", "dlv_schd_hm"),
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
				MCItemDef.create("ship_to_lg_grp_cd", "ship_to_lg_grp_cd"),
				MCItemDef.create("ship_to_lg_grp_nm", "ship_to_lg_grp_nm"),
				MCItemDef.create("ship_term_cd", "ship_term_cd"),
				MCItemDef.create("ship_term_nm", "ship_term_nm"),
				MCItemDef.create("ship_wk_grp_cd", "ship_wk_grp_cd"),
				MCItemDef.create("ship_wk_grp_nm", "ship_wk_grp_nm"),
				MCItemDef.create("ship_wk_cd", "ship_wk_cd"),
				MCItemDef.create("ship_wk_nm", "ship_wk_nm"),
				MCItemDef.create("ship_wt", "ship_wt"),
				MCItemDef.create("ship_dim", "ship_dim"),
				MCItemDef.create("immd_pick_prnt_flg", "immd_pick_prnt_flg"),
				MCItemDef.create("immd_ship_inst_prnt_flg", "immd_ship_inst_prnt_flg"),
				MCItemDef.create("immd_dlv_prnt_flg", "immd_dlv_prnt_flg"),
				MCItemDef.create("immd_ship_adv_prnt_flg", "immd_ship_adv_prnt_flg"),
				MCItemDef.create("latest_flg", "latest_flg")
			}
			,
			MCBlockDef.create("Srch02_Hdr")
		);
	}
	public static MCContainerDef MS_MSBEL1400_Srch02_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL1400", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("dscnt_itm_flg", "dscnt_itm_flg"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("lot_none_flg", "lot_none_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("alloc_ver_no", "alloc_ver_no"),
				MCItemDef.create("ver_flg", "ver_flg"),
				MCItemDef.create("not_lot_mix_flg", "not_lot_mix_flg"),
				MCItemDef.create("not_sublot_mix_flg", "not_sublot_mix_flg"),
				MCItemDef.create("ent_unit_cd", "ent_unit_cd"),
				MCItemDef.create("ent_unit_nm", "ent_unit_nm"),
				MCItemDef.create("ent_unit_dec_place", "ent_unit_dec_place"),
				MCItemDef.create("ent_unit_conv_qty", "ent_unit_conv_qty"),
				MCItemDef.create("ent_unit_conv_base_qty", "ent_unit_conv_base_qty"),
				MCItemDef.create("ent_unit_rnd_typ", "ent_unit_rnd_typ"),
				MCItemDef.create("ent_unit_qty", "ent_unit_qty"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_conv_base_qty", "base_unit_conv_base_qty"),
				MCItemDef.create("base_unit_conv_qty", "base_unit_conv_qty"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("inst_bndl_flg", "inst_bndl_flg"),
				MCItemDef.create("pckg_unit_cd", "pckg_unit_cd"),
				MCItemDef.create("pckg_unit_nm", "pckg_unit_nm"),
				MCItemDef.create("pckg_unit_dec_place", "pckg_unit_dec_place"),
				MCItemDef.create("pckg_unit_conv_base_qty", "pckg_unit_conv_base_qty"),
				MCItemDef.create("pckg_unit_conv_qty", "pckg_unit_conv_qty"),
				MCItemDef.create("pckg_unit_rnd_typ", "pckg_unit_rnd_typ"),
				MCItemDef.create("pckg_unit_qty", "pckg_unit_qty"),
				MCItemDef.create("schd_unit_cd", "schd_unit_cd"),
				MCItemDef.create("schd_unit_nm", "schd_unit_nm"),
				MCItemDef.create("schd_unit_dec_place", "schd_unit_dec_place"),
				MCItemDef.create("schd_unit_conv_base_qty", "schd_unit_conv_base_qty"),
				MCItemDef.create("schd_unit_conv_qty", "schd_unit_conv_qty"),
				MCItemDef.create("schd_unit_rnd_typ", "schd_unit_rnd_typ"),
				MCItemDef.create("schd_unit_qty", "schd_unit_qty"),
				MCItemDef.create("iv_schd_qty", "iv_schd_qty"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("act_cont_qty", "act_cont_qty"),
				MCItemDef.create("act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("std_cont_qty", "std_cont_qty"),
				MCItemDef.create("std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("cont_fctr_unit_cd", "cont_fctr_unit_cd"),
				MCItemDef.create("cont_fctr_unit_nm", "cont_fctr_unit_nm"),
				MCItemDef.create("cont_unit_dec_place", "cont_unit_dec_place"),
				MCItemDef.create("cont_unit_rnd_typ", "cont_unit_rnd_typ"),
				MCItemDef.create("alloc_flg", "alloc_flg"),
				MCItemDef.create("grp_alloc_flg", "grp_alloc_flg"),
				MCItemDef.create("ship_loc_cd", "ship_loc_cd"),
				MCItemDef.create("ship_loc_nm", "ship_loc_nm"),
				MCItemDef.create("ship_site_cd", "ship_site_cd"),
				MCItemDef.create("ship_str_ln_tgt_flg", "ship_str_ln_tgt_flg"),
				MCItemDef.create("ship_str_ln_cd", "ship_str_ln_cd"),
				MCItemDef.create("ship_str_ln_nm", "ship_str_ln_nm"),
				MCItemDef.create("dlv_str_ln_tgt_flg", "dlv_str_ln_tgt_flg"),
				MCItemDef.create("dlv_str_ln_cd", "dlv_str_ln_cd"),
				MCItemDef.create("dlv_str_ln_nm", "dlv_str_ln_nm"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("quality_typ_nm", "quality_typ_nm"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("alloc_sno1", "alloc_sno1"),
				MCItemDef.create("alloc_sno2", "alloc_sno2"),
				MCItemDef.create("alloc_sno3", "alloc_sno3"),
				MCItemDef.create("alloc_sno4", "alloc_sno4"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_insp_typ_nm", "stk_insp_typ_nm"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_id_typ_nm", "stk_id_typ_nm"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_bp_nm", "stk_bp_nm"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("stk_arrv_bp_nm", "stk_arrv_bp_nm"),
				MCItemDef.create("dlv_id_typ", "dlv_id_typ"),
				MCItemDef.create("dlv_id_typ_nm", "dlv_id_typ_nm"),
				MCItemDef.create("dlv_id_cd", "dlv_id_cd"),
				MCItemDef.create("dlv_id_nm", "dlv_id_nm"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("def_loc_cd", "def_loc_cd"),
				MCItemDef.create("def_loc_nm", "def_loc_nm"),
				MCItemDef.create("ship_loc_prio_flg", "ship_loc_prio_flg"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("rsn_nm", "rsn_nm"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_dpt_nm", "bd_dpt_nm"),
				MCItemDef.create("pri_prnt_flg", "pri_prnt_flg"),
				MCItemDef.create("skip_chk_ship_flg", "skip_chk_ship_flg"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("prov_typ_nm", "prov_typ_nm"),
				MCItemDef.create("prov_basis_typ", "prov_basis_typ"),
				MCItemDef.create("prov_basis_typ_nm", "prov_basis_typ_nm"),
				MCItemDef.create("ret_prov_typ", "ret_prov_typ"),
				MCItemDef.create("ret_prov_typ_nm", "ret_prov_typ_nm"),
				MCItemDef.create("ret_prov_basis_typ", "ret_prov_basis_typ"),
				MCItemDef.create("ret_prov_basis_typ_nm", "ret_prov_basis_typ_nm"),
				MCItemDef.create("wms_flg", "wms_flg"),
				MCItemDef.create("wms_tgt_flg", "wms_tgt_flg"),
				MCItemDef.create("base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("base_ac_dt", "base_ac_dt"),
				MCItemDef.create("ship_cnt_rmrks", "ship_cnt_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("xfr_schd_no", "xfr_schd_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("ship_pr_no", "ship_pr_no"),
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("ship_inst_typ", "ship_inst_typ"),
				MCItemDef.create("pick_peg_no", "pick_peg_no"),
				MCItemDef.create("xfr_src_typ", "xfr_src_typ"),
				MCItemDef.create("iv_trd_flg", "iv_trd_flg"),
				MCItemDef.create("cst_iv_flg", "cst_iv_flg"),
				MCItemDef.create("cststk_flg", "cststk_flg"),
				MCItemDef.create("loan_flg", "loan_flg"),
				MCItemDef.create("ship_wt", "ship_wt"),
				MCItemDef.create("ship_dim", "ship_dim"),
				MCItemDef.create("unit_wt", "unit_wt"),
				MCItemDef.create("unit_dim", "unit_dim"),
				MCItemDef.create("alloc_scope_typ", "alloc_scope_typ"),
				MCItemDef.create("ship_schd_loc_cd", "ship_schd_loc_cd"),
				MCItemDef.create("ship_schd_loc_sppl_cd", "ship_schd_loc_sppl_cd")
			}
			,
			MCBlockDef.create("Srch02_Dtl")
		);
	}
	public static MCContainerDef MS_MSBEL1400_Srch02_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL1400", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("ship_pr_no", "ship_pr_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("ship_pr_upd_cntr", "ship_pr_upd_cntr"),
				MCItemDef.create("ship_schd_upd_cntr", "ship_schd_upd_cntr")
			}
			,
			MCBlockDef.create("Srch02_ShipSchd_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1400_Sprt01_INFO = new MCOperationInfo("MS", "MSBEL1400", "Sprt01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1400_Sprt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1400", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("lot_peg_no", "lot_peg_no"),
				MCItemDef.create("ship_schd_tm", "ship_schd_tm"),
				MCItemDef.create("dlv_schd_tm", "dlv_schd_tm"),
				MCItemDef.create("ship_term_cd", "ship_term_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("gi_loc_nm", "gi_loc_nm"),
				MCItemDef.create("gi_str_ln_tgt_flg", "gi_str_ln_tgt_flg"),
				MCItemDef.create("gi_str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("gi_str_ln_nm", "gi_str_ln_nm"),
				MCItemDef.create("gi_str_ln_cd_none_flg", "gi_str_ln_cd_none_flg"),
				MCItemDef.create("lot_none_flg", "lot_none_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("alloc_ver_no", "alloc_ver_no"),
				MCItemDef.create("alloc_sno1", "alloc_sno1"),
				MCItemDef.create("alloc_sno2", "alloc_sno2"),
				MCItemDef.create("alloc_sno3", "alloc_sno3"),
				MCItemDef.create("alloc_sno4", "alloc_sno4"),
				MCItemDef.create("not_lot_mix_flg", "not_lot_mix_flg"),
				MCItemDef.create("not_sublot_mix_flg", "not_sublot_mix_flg"),
				MCItemDef.create("ent_unit_cd", "ent_unit_cd"),
				MCItemDef.create("ent_unit_nm", "ent_unit_nm"),
				MCItemDef.create("ent_unit_dec_place", "ent_unit_dec_place"),
				MCItemDef.create("ent_unit_conv_qty", "ent_unit_conv_qty"),
				MCItemDef.create("ent_unit_conv_base_qty", "ent_unit_conv_base_qty"),
				MCItemDef.create("ent_unit_rnd_typ", "ent_unit_rnd_typ"),
				MCItemDef.create("ent_unit_qty", "ent_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("pckg_unit_qty", "pckg_unit_qty"),
				MCItemDef.create("act_cont_qty", "act_cont_qty"),
				MCItemDef.create("act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("std_cont_qty", "std_cont_qty"),
				MCItemDef.create("std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("tmp_inst_d_no", "tmp_inst_d_no"),
				MCItemDef.create("skip_chk_ship_flg", "skip_chk_ship_flg")
			}
			,
			MCBlockDef.create("Sprt01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBEL1400_Sprt01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL1400", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("tmp_inst_d_no", "tmp_inst_d_no"),
				MCItemDef.create("ship_pr_no", "ship_pr_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no")
			}
			,
			MCBlockDef.create("Sprt01_ShipSchd_Dtl")
		);
	}

	public static MCContainerDef MS_MSBEL1400_Sprt01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL1400", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("lot_chk_off_flg", "lot_chk_off_flg")
			}
			,
			MCBlockDef.create("Sprt01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL1400_Sprt01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1400", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("lot_peg_no", "lot_peg_no"),
				MCItemDef.create("gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("gi_loc_nm", "gi_loc_nm"),
				MCItemDef.create("gi_str_ln_tgt_flg", "gi_str_ln_tgt_flg"),
				MCItemDef.create("gi_str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("gi_str_ln_nm", "gi_str_ln_nm"),
				MCItemDef.create("gi_str_ln_cd_none_flg", "gi_str_ln_cd_none_flg"),
				MCItemDef.create("lot_none_flg", "lot_none_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("alloc_ver_no", "alloc_ver_no"),
				MCItemDef.create("alloc_sno1", "alloc_sno1"),
				MCItemDef.create("alloc_sno2", "alloc_sno2"),
				MCItemDef.create("alloc_sno3", "alloc_sno3"),
				MCItemDef.create("alloc_sno4", "alloc_sno4"),
				MCItemDef.create("ent_unit_cd", "ent_unit_cd"),
				MCItemDef.create("ent_unit_nm", "ent_unit_nm"),
				MCItemDef.create("ent_unit_dec_place", "ent_unit_dec_place"),
				MCItemDef.create("ent_unit_conv_qty", "ent_unit_conv_qty"),
				MCItemDef.create("ent_unit_conv_base_qty", "ent_unit_conv_base_qty"),
				MCItemDef.create("ent_unit_rnd_typ", "ent_unit_rnd_typ"),
				MCItemDef.create("ent_unit_qty", "ent_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("pckg_unit_qty", "pckg_unit_qty"),
				MCItemDef.create("act_cont_qty", "act_cont_qty"),
				MCItemDef.create("act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("std_cont_qty", "std_cont_qty"),
				MCItemDef.create("std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("no_alloc_flg", "no_alloc_flg"),
				MCItemDef.create("wms_flg", "wms_flg"),
				MCItemDef.create("wms_tgt_flg", "wms_tgt_flg")
			}
			,
			MCBlockDef.create("Sprt01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1400_Chk01_INFO = new MCOperationInfo("MS", "MSBEL1400", "Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1400_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1400", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("ship_inst_tm", "ship_inst_tm"),
				MCItemDef.create("ship_schd_tm", "ship_schd_tm"),
				MCItemDef.create("dlv_schd_tm", "dlv_schd_tm"),
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
				MCItemDef.create("ship_to_lg_grp_cd", "ship_to_lg_grp_cd"),
				MCItemDef.create("inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("inst_dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("ship_term_cd", "ship_term_cd"),
				MCItemDef.create("ship_wk_cd", "ship_wk_cd"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("inst_rmrks", "inst_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("immd_pick_prnt_flg", "immd_pick_prnt_flg"),
				MCItemDef.create("immd_ship_inst_prnt_flg", "immd_ship_inst_prnt_flg"),
				MCItemDef.create("immd_dlv_prnt_flg", "immd_dlv_prnt_flg"),
				MCItemDef.create("immd_ship_adv_prnt_flg", "immd_ship_adv_prnt_flg"),
				MCItemDef.create("lot_chk_off_flg", "lot_chk_off_flg")
			}
			,
			MCBlockDef.create("Chk01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL1400_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL1400", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ent_unit_cd", "ent_unit_cd"),
				MCItemDef.create("ent_unit_qty", "ent_unit_qty"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("inst_bndl_flg", "inst_bndl_flg"),
				MCItemDef.create("alloc_flg", "alloc_flg"),
				MCItemDef.create("grp_alloc_flg", "grp_alloc_flg"),
				MCItemDef.create("ship_loc_cd", "ship_loc_cd"),
				MCItemDef.create("ship_str_ln_cd", "ship_str_ln_cd"),
				MCItemDef.create("ship_str_ln_cd_none_flg", "ship_str_ln_cd_none_flg"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("skip_chk_ship_flg", "skip_chk_ship_flg"),
				MCItemDef.create("wms_flg", "wms_flg"),
				MCItemDef.create("base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("base_ac_dt", "base_ac_dt"),
				MCItemDef.create("ship_cnt_rmrks", "ship_cnt_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("inst_d_rmrks", "inst_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("tmp_inst_d_no", "tmp_inst_d_no"),
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("alloc_sno1", "alloc_sno1"),
				MCItemDef.create("alloc_sno2", "alloc_sno2"),
				MCItemDef.create("alloc_sno3", "alloc_sno3"),
				MCItemDef.create("alloc_sno4", "alloc_sno4"),
				MCItemDef.create("alloc_ver_no", "alloc_ver_no"),
				MCItemDef.create("alloc_scope_typ", "alloc_scope_typ")
			}
			,
			MCBlockDef.create("Chk01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBEL1400_Chk01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL1400", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("tmp_inst_d_no", "tmp_inst_d_no"),
				MCItemDef.create("ship_pr_no", "ship_pr_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("ship_pr_upd_cntr", "ship_pr_upd_cntr"),
				MCItemDef.create("ship_schd_upd_cntr", "ship_schd_upd_cntr")
			}
			,
			MCBlockDef.create("Chk01_ShipSchd_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL1400_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1400", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("ship_inst_tm", "ship_inst_tm"),
				MCItemDef.create("ship_schd_tm", "ship_schd_tm"),
				MCItemDef.create("dlv_schd_tm", "dlv_schd_tm"),
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
				MCItemDef.create("ship_to_lg_grp_cd", "ship_to_lg_grp_cd"),
				MCItemDef.create("inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("inst_dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("ship_term_cd", "ship_term_cd"),
				MCItemDef.create("ship_wk_cd", "ship_wk_cd"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("inst_rmrks", "inst_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("immd_pick_prnt_flg", "immd_pick_prnt_flg"),
				MCItemDef.create("immd_ship_inst_prnt_flg", "immd_ship_inst_prnt_flg"),
				MCItemDef.create("immd_dlv_prnt_flg", "immd_dlv_prnt_flg"),
				MCItemDef.create("immd_ship_adv_prnt_flg", "immd_ship_adv_prnt_flg"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ship_inst_upd_cntr", "ship_inst_upd_cntr"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("via_dlv_typ", "via_dlv_typ"),
				MCItemDef.create("lot_chk_off_flg", "lot_chk_off_flg")
			}
			,
			MCBlockDef.create("Chk01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBEL1400_Chk01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL1400", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("ent_unit_cd", "ent_unit_cd"),
				MCItemDef.create("ent_unit_dec_place", "ent_unit_dec_place"),
				MCItemDef.create("ent_unit_conv_base_qty", "ent_unit_conv_base_qty"),
				MCItemDef.create("ent_unit_conv_qty", "ent_unit_conv_qty"),
				MCItemDef.create("ent_unit_qty", "ent_unit_qty"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("inst_bndl_flg", "inst_bndl_flg"),
				MCItemDef.create("alloc_flg", "alloc_flg"),
				MCItemDef.create("grp_alloc_flg", "grp_alloc_flg"),
				MCItemDef.create("ship_loc_cd", "ship_loc_cd"),
				MCItemDef.create("ship_sppl_cd", "ship_sppl_cd"),
				MCItemDef.create("ship_str_ln_tgt_flg", "ship_str_ln_tgt_flg"),
				MCItemDef.create("ship_str_ln_cd", "ship_str_ln_cd"),
				MCItemDef.create("ship_str_ln_cd_none_flg", "ship_str_ln_cd_none_flg"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("skip_chk_ship_flg", "skip_chk_ship_flg"),
				MCItemDef.create("wms_flg", "wms_flg"),
				MCItemDef.create("base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("base_ac_dt", "base_ac_dt"),
				MCItemDef.create("ship_cnt_rmrks", "ship_cnt_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("inst_d_rmrks", "inst_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("ship_lg_grp_cd", "ship_lg_grp_cd"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("tmp_inst_d_no", "tmp_inst_d_no"),
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("alloc_loc_cd", "alloc_loc_cd"),
				MCItemDef.create("alloc_str_ln_cd", "alloc_str_ln_cd"),
				MCItemDef.create("dlv_str_ln_cd", "dlv_str_ln_cd"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("alloc_sno1", "alloc_sno1"),
				MCItemDef.create("alloc_sno2", "alloc_sno2"),
				MCItemDef.create("alloc_sno3", "alloc_sno3"),
				MCItemDef.create("alloc_sno4", "alloc_sno4"),
				MCItemDef.create("alloc_lot_no", "alloc_lot_no"),
				MCItemDef.create("alloc_sublot_no", "alloc_sublot_no"),
				MCItemDef.create("alloc_ver_no", "alloc_ver_no"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("alloc_ent_unit_qty", "alloc_ent_unit_qty"),
				MCItemDef.create("alloc_ent_unit_cd", "alloc_ent_unit_cd"),
				MCItemDef.create("alloc_base_unit_qty", "alloc_base_unit_qty"),
				MCItemDef.create("alloc_base_unit_cd", "alloc_base_unit_cd"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("not_lot_mix_flg", "not_lot_mix_flg"),
				MCItemDef.create("not_sublot_mix_flg", "not_sublot_mix_flg"),
				MCItemDef.create("valid_dt_from", "valid_dt_from"),
				MCItemDef.create("valid_dt_to", "valid_dt_to"),
				MCItemDef.create("iv_trd_flg", "iv_trd_flg"),
				MCItemDef.create("cst_iv_flg", "cst_iv_flg"),
				MCItemDef.create("alloc_scope_typ", "alloc_scope_typ"),
				MCItemDef.create("dlv_lg_grp_cd", "dlv_lg_grp_cd")
			}
			,
			MCBlockDef.create("Chk01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1400_Ins01_INFO = new MCOperationInfo("MS", "MSBEL1400", "Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1400_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1400", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("ship_inst_tm", "ship_inst_tm"),
				MCItemDef.create("ship_schd_tm", "ship_schd_tm"),
				MCItemDef.create("dlv_schd_tm", "dlv_schd_tm"),
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
				MCItemDef.create("ship_to_lg_grp_cd", "ship_to_lg_grp_cd"),
				MCItemDef.create("inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("inst_dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("ship_term_cd", "ship_term_cd"),
				MCItemDef.create("ship_wk_cd", "ship_wk_cd"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("inst_rmrks", "inst_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("immd_pick_prnt_flg", "immd_pick_prnt_flg"),
				MCItemDef.create("immd_ship_inst_prnt_flg", "immd_ship_inst_prnt_flg"),
				MCItemDef.create("immd_dlv_prnt_flg", "immd_dlv_prnt_flg"),
				MCItemDef.create("immd_ship_adv_prnt_flg", "immd_ship_adv_prnt_flg"),
				MCItemDef.create("lot_chk_off_flg", "lot_chk_off_flg")
			}
			,
			MCBlockDef.create("Ins01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL1400_Ins01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL1400", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("lot_none_flg", "lot_none_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ent_unit_cd", "ent_unit_cd"),
				MCItemDef.create("ent_unit_qty", "ent_unit_qty"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("inst_bndl_flg", "inst_bndl_flg"),
				MCItemDef.create("alloc_flg", "alloc_flg"),
				MCItemDef.create("grp_alloc_flg", "grp_alloc_flg"),
				MCItemDef.create("ship_loc_cd", "ship_loc_cd"),
				MCItemDef.create("ship_str_ln_cd", "ship_str_ln_cd"),
				MCItemDef.create("ship_str_ln_cd_none_flg", "ship_str_ln_cd_none_flg"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("skip_chk_ship_flg", "skip_chk_ship_flg"),
				MCItemDef.create("wms_flg", "wms_flg"),
				MCItemDef.create("base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("base_ac_dt", "base_ac_dt"),
				MCItemDef.create("ship_cnt_rmrks", "ship_cnt_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("inst_d_rmrks", "inst_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("tmp_inst_d_no", "tmp_inst_d_no"),
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("alloc_sno1", "alloc_sno1"),
				MCItemDef.create("alloc_sno2", "alloc_sno2"),
				MCItemDef.create("alloc_sno3", "alloc_sno3"),
				MCItemDef.create("alloc_sno4", "alloc_sno4"),
				MCItemDef.create("alloc_ver_no", "alloc_ver_no"),
				MCItemDef.create("alloc_scope_typ", "alloc_scope_typ")
			}
			,
			MCBlockDef.create("Ins01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBEL1400_Ins01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL1400", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("tmp_inst_d_no", "tmp_inst_d_no"),
				MCItemDef.create("ship_pr_no", "ship_pr_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("ship_pr_upd_cntr", "ship_pr_upd_cntr"),
				MCItemDef.create("ship_schd_upd_cntr", "ship_schd_upd_cntr")
			}
			,
			MCBlockDef.create("Ins01_ShipSchd_Dtl")
		);
	}

	public static MCContainerDef MS_MSBEL1400_Ins01_UP_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBEL1400", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg")
			}
			,
			MCBlockDef.create("Ins01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL1400_Ins01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1400", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("ship_inst_no", "ship_inst_no")
			}
			,
			MCBlockDef.create("Ins01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBEL1400_Ins01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL1400", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("ship_inst_d_no", "ship_inst_d_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("ship_inst_no", "ship_inst_no")
			}
			,
			MCBlockDef.create("Ins01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1400_Chk02_INFO = new MCOperationInfo("MS", "MSBEL1400", "Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1400_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1400", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("ship_inst_tm", "ship_inst_tm"),
				MCItemDef.create("ship_schd_tm", "ship_schd_tm"),
				MCItemDef.create("dlv_schd_tm", "dlv_schd_tm"),
				MCItemDef.create("ship_to_id_typ", "ship_to_id_typ"),
				MCItemDef.create("ship_to_id_cd", "ship_to_id_cd"),
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
				MCItemDef.create("ship_to_lg_grp_cd", "ship_to_lg_grp_cd"),
				MCItemDef.create("inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("inst_dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("ship_term_cd", "ship_term_cd"),
				MCItemDef.create("ship_wk_cd", "ship_wk_cd"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("inst_rmrks", "inst_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("immd_pick_prnt_flg", "immd_pick_prnt_flg"),
				MCItemDef.create("immd_ship_inst_prnt_flg", "immd_ship_inst_prnt_flg"),
				MCItemDef.create("immd_dlv_prnt_flg", "immd_dlv_prnt_flg"),
				MCItemDef.create("immd_ship_adv_prnt_flg", "immd_ship_adv_prnt_flg"),
				MCItemDef.create("ship_inst_upd_cntr", "ship_inst_upd_cntr"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("via_dlv_typ", "via_dlv_typ"),
				MCItemDef.create("lot_chk_off_flg", "lot_chk_off_flg")
			}
			,
			MCBlockDef.create("Chk02_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL1400_Chk02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL1400", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ent_unit_cd", "ent_unit_cd"),
				MCItemDef.create("ent_unit_qty", "ent_unit_qty"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("alloc_flg", "alloc_flg"),
				MCItemDef.create("grp_alloc_flg", "grp_alloc_flg"),
				MCItemDef.create("ship_loc_cd", "ship_loc_cd"),
				MCItemDef.create("ship_str_ln_cd", "ship_str_ln_cd"),
				MCItemDef.create("ship_str_ln_cd_none_flg", "ship_str_ln_cd_none_flg"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("skip_chk_ship_flg", "skip_chk_ship_flg"),
				MCItemDef.create("wms_flg", "wms_flg"),
				MCItemDef.create("base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("base_ac_dt", "base_ac_dt"),
				MCItemDef.create("ship_cnt_rmrks", "ship_cnt_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("inst_d_rmrks", "inst_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("ship_inst_d_no", "ship_inst_d_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("tmp_inst_d_no", "tmp_inst_d_no"),
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("alloc_sno1", "alloc_sno1"),
				MCItemDef.create("alloc_sno2", "alloc_sno2"),
				MCItemDef.create("alloc_sno3", "alloc_sno3"),
				MCItemDef.create("alloc_sno4", "alloc_sno4"),
				MCItemDef.create("alloc_ver_no", "alloc_ver_no"),
				MCItemDef.create("alloc_scope_typ", "alloc_scope_typ")
			}
			,
			MCBlockDef.create("Chk02_Dtl")
		);
	}

	public static MCContainerDef MS_MSBEL1400_Chk02_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL1400", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("ship_inst_d_no", "ship_inst_d_no"),
				MCItemDef.create("ship_pr_no", "ship_pr_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("ship_pr_upd_cntr", "ship_pr_upd_cntr"),
				MCItemDef.create("ship_schd_upd_cntr", "ship_schd_upd_cntr")
			}
			,
			MCBlockDef.create("Chk02_ShipSchd_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL1400_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1400", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("ship_inst_tm", "ship_inst_tm"),
				MCItemDef.create("ship_schd_tm", "ship_schd_tm"),
				MCItemDef.create("dlv_schd_tm", "dlv_schd_tm"),
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
				MCItemDef.create("ship_to_lg_grp_cd", "ship_to_lg_grp_cd"),
				MCItemDef.create("inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("inst_dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("ship_term_cd", "ship_term_cd"),
				MCItemDef.create("ship_wk_cd", "ship_wk_cd"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("inst_rmrks", "inst_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("immd_pick_prnt_flg", "immd_pick_prnt_flg"),
				MCItemDef.create("immd_ship_inst_prnt_flg", "immd_ship_inst_prnt_flg"),
				MCItemDef.create("immd_dlv_prnt_flg", "immd_dlv_prnt_flg"),
				MCItemDef.create("immd_ship_adv_prnt_flg", "immd_ship_adv_prnt_flg"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ship_inst_upd_cntr", "ship_inst_upd_cntr"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("via_dlv_typ", "via_dlv_typ"),
				MCItemDef.create("lot_chk_off_flg", "lot_chk_off_flg")
			}
			,
			MCBlockDef.create("Chk02_Hdr")
		);
	}
	public static MCContainerDef MS_MSBEL1400_Chk02_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL1400", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("ent_unit_cd", "ent_unit_cd"),
				MCItemDef.create("ent_unit_dec_place", "ent_unit_dec_place"),
				MCItemDef.create("ent_unit_conv_base_qty", "ent_unit_conv_base_qty"),
				MCItemDef.create("ent_unit_conv_qty", "ent_unit_conv_qty"),
				MCItemDef.create("ent_unit_qty", "ent_unit_qty"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("alloc_flg", "alloc_flg"),
				MCItemDef.create("grp_alloc_flg", "grp_alloc_flg"),
				MCItemDef.create("ship_loc_cd", "ship_loc_cd"),
				MCItemDef.create("ship_sppl_cd", "ship_sppl_cd"),
				MCItemDef.create("ship_str_ln_tgt_flg", "ship_str_ln_tgt_flg"),
				MCItemDef.create("ship_str_ln_cd", "ship_str_ln_cd"),
				MCItemDef.create("ship_str_ln_cd_none_flg", "ship_str_ln_cd_none_flg"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("skip_chk_ship_flg", "skip_chk_ship_flg"),
				MCItemDef.create("wms_flg", "wms_flg"),
				MCItemDef.create("base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("base_ac_dt", "base_ac_dt"),
				MCItemDef.create("ship_cnt_rmrks", "ship_cnt_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("inst_d_rmrks", "inst_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("ship_inst_d_no", "ship_inst_d_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("ship_lg_grp_cd", "ship_lg_grp_cd"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("tmp_inst_d_no", "tmp_inst_d_no"),
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("alloc_loc_cd", "alloc_loc_cd"),
				MCItemDef.create("alloc_str_ln_cd", "alloc_str_ln_cd"),
				MCItemDef.create("dlv_str_ln_cd", "dlv_str_ln_cd"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("alloc_sno1", "alloc_sno1"),
				MCItemDef.create("alloc_sno2", "alloc_sno2"),
				MCItemDef.create("alloc_sno3", "alloc_sno3"),
				MCItemDef.create("alloc_sno4", "alloc_sno4"),
				MCItemDef.create("alloc_lot_no", "alloc_lot_no"),
				MCItemDef.create("alloc_sublot_no", "alloc_sublot_no"),
				MCItemDef.create("alloc_ver_no", "alloc_ver_no"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("alloc_ent_unit_qty", "alloc_ent_unit_qty"),
				MCItemDef.create("alloc_ent_unit_cd", "alloc_ent_unit_cd"),
				MCItemDef.create("alloc_base_unit_qty", "alloc_base_unit_qty"),
				MCItemDef.create("alloc_base_unit_cd", "alloc_base_unit_cd"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("not_lot_mix_flg", "not_lot_mix_flg"),
				MCItemDef.create("not_sublot_mix_flg", "not_sublot_mix_flg"),
				MCItemDef.create("valid_dt_from", "valid_dt_from"),
				MCItemDef.create("valid_dt_to", "valid_dt_to"),
				MCItemDef.create("iv_trd_flg", "iv_trd_flg"),
				MCItemDef.create("cst_iv_flg", "cst_iv_flg"),
				MCItemDef.create("alloc_scope_typ", "alloc_scope_typ"),
				MCItemDef.create("dlv_lg_grp_cd", "dlv_lg_grp_cd")
			}
			,
			MCBlockDef.create("Chk02_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1400_Upd01_INFO = new MCOperationInfo("MS", "MSBEL1400", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1400_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1400", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("inst_dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("inst_rmrks", "inst_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("immd_pick_prnt_flg", "immd_pick_prnt_flg"),
				MCItemDef.create("immd_ship_inst_prnt_flg", "immd_ship_inst_prnt_flg"),
				MCItemDef.create("immd_dlv_prnt_flg", "immd_dlv_prnt_flg"),
				MCItemDef.create("immd_ship_adv_prnt_flg", "immd_ship_adv_prnt_flg"),
				MCItemDef.create("ship_inst_upd_cntr", "ship_inst_upd_cntr"),
				MCItemDef.create("lot_chk_off_flg", "lot_chk_off_flg")
			}
			,
			MCBlockDef.create("Upd01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL1400_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL1400", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("lot_none_flg", "lot_none_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ent_unit_cd", "ent_unit_cd"),
				MCItemDef.create("ent_unit_qty", "ent_unit_qty"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("alloc_flg", "alloc_flg"),
				MCItemDef.create("grp_alloc_flg", "grp_alloc_flg"),
				MCItemDef.create("ship_loc_cd", "ship_loc_cd"),
				MCItemDef.create("ship_str_ln_cd", "ship_str_ln_cd"),
				MCItemDef.create("ship_str_ln_cd_none_flg", "ship_str_ln_cd_none_flg"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("skip_chk_ship_flg", "skip_chk_ship_flg"),
				MCItemDef.create("wms_flg", "wms_flg"),
				MCItemDef.create("base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("base_ac_dt", "base_ac_dt"),
				MCItemDef.create("ship_cnt_rmrks", "ship_cnt_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("inst_d_rmrks", "inst_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("ship_inst_d_no", "ship_inst_d_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("tmp_inst_d_no", "tmp_inst_d_no"),
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("alloc_sno1", "alloc_sno1"),
				MCItemDef.create("alloc_sno2", "alloc_sno2"),
				MCItemDef.create("alloc_sno3", "alloc_sno3"),
				MCItemDef.create("alloc_sno4", "alloc_sno4"),
				MCItemDef.create("alloc_ver_no", "alloc_ver_no"),
				MCItemDef.create("alloc_scope_typ", "alloc_scope_typ")
			}
			,
			MCBlockDef.create("Upd01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBEL1400_Upd01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL1400", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("ship_inst_d_no", "ship_inst_d_no"),
				MCItemDef.create("ship_pr_no", "ship_pr_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("ship_pr_upd_cntr", "ship_pr_upd_cntr"),
				MCItemDef.create("ship_schd_upd_cntr", "ship_schd_upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_ShipSchd_Dtl")
		);
	}

	public static MCContainerDef MS_MSBEL1400_Upd01_UP_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBEL1400", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg")
			}
			,
			MCBlockDef.create("Upd01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL1400_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1400", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("ship_inst_d_no", "ship_inst_d_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("ship_inst_no", "ship_inst_no")
			}
			,
			MCBlockDef.create("Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1400_Chk03_INFO = new MCOperationInfo("MS", "MSBEL1400", "Chk03", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1400_Chk03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1400", "Chk03",
			new MCItemDef[]{
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("immd_dlv_prnt_flg", "immd_dlv_prnt_flg"),
				MCItemDef.create("ship_inst_upd_cntr", "ship_inst_upd_cntr")
			}
			,
			MCBlockDef.create("Chk03_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL1400_Chk03_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL1400", "Chk03",
			new MCItemDef[]{
				MCItemDef.create("ship_inst_d_no", "ship_inst_d_no"),
				MCItemDef.create("ship_pr_no", "ship_pr_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("ship_pr_upd_cntr", "ship_pr_upd_cntr"),
				MCItemDef.create("ship_schd_upd_cntr", "ship_schd_upd_cntr")
			}
			,
			MCBlockDef.create("Chk03_ShipSchd_Dtl")
		);
	}

	public static MCContainerDef MS_MSBEL1400_Chk03_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL1400", "Chk03",
			new MCItemDef[]{
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("wms_flg", "wms_flg")
			}
			,
			MCBlockDef.create("Chk03_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL1400_Chk03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1400", "Chk03",
			new MCItemDef[]{
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("immd_dlv_prnt_flg", "immd_dlv_prnt_flg"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Chk03_Hdr")
		);
	}
	public static MCContainerDef MS_MSBEL1400_Chk03_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL1400", "Chk03",
			new MCItemDef[]{
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("wms_flg", "wms_flg")
			}
			,
			MCBlockDef.create("Chk03_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1400_Del01_INFO = new MCOperationInfo("MS", "MSBEL1400", "Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1400_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1400", "Del01",
			new MCItemDef[]{
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("immd_dlv_prnt_flg", "immd_dlv_prnt_flg"),
				MCItemDef.create("ship_inst_upd_cntr", "ship_inst_upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL1400_Del01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL1400", "Del01",
			new MCItemDef[]{
				MCItemDef.create("ship_inst_d_no", "ship_inst_d_no"),
				MCItemDef.create("ship_pr_no", "ship_pr_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("ship_pr_upd_cntr", "ship_pr_upd_cntr"),
				MCItemDef.create("ship_schd_upd_cntr", "ship_schd_upd_cntr")
			}
			,
			MCBlockDef.create("Del01_ShipSchd_Dtl")
		);
	}

	public static MCContainerDef MS_MSBEL1400_Del01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL1400", "Del01",
			new MCItemDef[]{
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("wms_flg", "wms_flg")
			}
			,
			MCBlockDef.create("Del01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBEL1400_Del01_UP_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBEL1400", "Del01",
			new MCItemDef[]{
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg")
			}
			,
			MCBlockDef.create("Del01_Cnd")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1400_Chk04_INFO = new MCOperationInfo("MS", "MSBEL1400", "Chk04", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1400_Chk04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1400", "Chk04",
			new MCItemDef[]{
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("ship_inst_rev", "ship_inst_rev"),
				MCItemDef.create("ship_inst_upd_cntr", "ship_inst_upd_cntr"),
				MCItemDef.create("dlv_prnt_btn_flg", "dlv_prnt_btn_flg"),
				MCItemDef.create("adv_prnt_btn_flg", "adv_prnt_btn_flg"),
				MCItemDef.create("inst_prnt_btn_flg", "inst_prnt_btn_flg"),
				MCItemDef.create("pick_prnt_btn_flg", "pick_prnt_btn_flg")
			}
			,
			MCBlockDef.create("Chk04_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL1400_Chk04_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL1400", "Chk04",
			new MCItemDef[]{
				MCItemDef.create("base_ac_dt", "base_ac_dt"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ")
			}
			,
			MCBlockDef.create("Chk04_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL1400_Chk04_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1400", "Chk04",
			new MCItemDef[]{
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("ship_inst_rev", "ship_inst_rev"),
				MCItemDef.create("dlv_prnt_btn_flg", "dlv_prnt_btn_flg"),
				MCItemDef.create("adv_prnt_btn_flg", "adv_prnt_btn_flg"),
				MCItemDef.create("inst_prnt_btn_flg", "inst_prnt_btn_flg"),
				MCItemDef.create("pick_prnt_btn_flg", "pick_prnt_btn_flg"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Chk04_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1400_Prnt01_INFO = new MCOperationInfo("MS", "MSBEL1400", "Prnt01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1400_Prnt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1400", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("ship_inst_rev", "ship_inst_rev"),
				MCItemDef.create("ship_inst_upd_cntr", "ship_inst_upd_cntr"),
				MCItemDef.create("dlv_prnt_btn_flg", "dlv_prnt_btn_flg"),
				MCItemDef.create("adv_prnt_btn_flg", "adv_prnt_btn_flg"),
				MCItemDef.create("inst_prnt_btn_flg", "inst_prnt_btn_flg"),
				MCItemDef.create("pick_prnt_btn_flg", "pick_prnt_btn_flg")
			}
			,
			MCBlockDef.create("Prnt01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL1400_Prnt01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL1400", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg")
			}
			,
			MCBlockDef.create("Prnt01_Cnd")
		);
	}

	public static MCContainerDef MS_MSBEL1400_Prnt01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL1400", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("base_ac_dt", "base_ac_dt"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ")
			}
			,
			MCBlockDef.create("Prnt01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1400_Sprt02_INFO = new MCOperationInfo("MS", "MSBEL1400", "Sprt02", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1400_Sprt02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1400", "Sprt02",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("base_ac_dt", "base_ac_dt")
			}
			,
			MCBlockDef.create("Sprt02_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL1400_Sprt02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1400", "Sprt02",
			new MCItemDef[]{
				MCItemDef.create("base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("base_ac_dt", "base_ac_dt")
			}
			,
			MCBlockDef.create("Sprt02_Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

