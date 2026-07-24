package mcframe.clientMSBF.MSBFP0070;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MSBFP_InspActReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBFL0070.Srch01.UP.BLOCK0")){
			return MS_MSBFL0070_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0070.Srch01.DOWN.BLOCK0")){
			return MS_MSBFL0070_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0070.Srch01.DOWN.BLOCK1")){
			return MS_MSBFL0070_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBFL0070.Srch01.DOWN.BLOCK2")){
			return MS_MSBFL0070_Srch01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBFL0070.Srch02.UP.BLOCK0")){
			return MS_MSBFL0070_Srch02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0070.Srch02.DOWN.BLOCK0")){
			return MS_MSBFL0070_Srch02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0070.Ins01.UP.BLOCK0")){
			return MS_MSBFL0070_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0070.Ins01.UP.BLOCK1")){
			return MS_MSBFL0070_Ins01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBFL0070.Ins01.UP.BLOCK2")){
			return MS_MSBFL0070_Ins01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBFL0070.Ins01.DOWN.BLOCK0")){
			return MS_MSBFL0070_Ins01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0070.Ins01.DOWN.BLOCK1")){
			return MS_MSBFL0070_Ins01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBFL0070.Ins01.DOWN.BLOCK2")){
			return MS_MSBFL0070_Ins01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBFL0070.Upd01.UP.BLOCK0")){
			return MS_MSBFL0070_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0070.Upd01.UP.BLOCK1")){
			return MS_MSBFL0070_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBFL0070.Upd01.UP.BLOCK2")){
			return MS_MSBFL0070_Upd01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBFL0070.Upd01.DOWN.BLOCK0")){
			return MS_MSBFL0070_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0070.Upd01.DOWN.BLOCK1")){
			return MS_MSBFL0070_Upd01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBFL0070.Upd01.DOWN.BLOCK2")){
			return MS_MSBFL0070_Upd01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBFL0070.Upd02.UP.BLOCK0")){
			return MS_MSBFL0070_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0070.Upd02.UP.BLOCK1")){
			return MS_MSBFL0070_Upd02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBFL0070.Upd02.DOWN.BLOCK0")){
			return MS_MSBFL0070_Upd02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0070.Del01.UP.BLOCK0")){
			return MS_MSBFL0070_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0070.Del01.UP.BLOCK1")){
			return MS_MSBFL0070_Del01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBFL0070.Del01.UP.BLOCK2")){
			return MS_MSBFL0070_Del01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBFL0070.Del01.DOWN.BLOCK0")){
			return MS_MSBFL0070_Del01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0070.Del02.UP.BLOCK0")){
			return MS_MSBFL0070_Del02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0070.Del02.UP.BLOCK1")){
			return MS_MSBFL0070_Del02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBFL0070.Del02.DOWN.BLOCK0")){
			return MS_MSBFL0070_Del02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0070.Prnt01.UP.BLOCK0")){
			return MS_MSBFL0070_Prnt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0070.Prnt01.DOWN.BLOCK0")){
			return MS_MSBFL0070_Prnt01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
								
	
	static final MCOperationInfo MS_MSBFL0070_Srch01_INFO = new MCOperationInfo("MS", "MSBFL0070", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0070_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0070", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ope", "ope"),
				MCItemDef.create("insp_no", "insp_no")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBFL0070_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0070", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("lot_no_p" + ".lot_no", "lot_no"),
				MCItemDef.create("lot_no_p" + ".sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("insp_freq", "insp_freq"),
				MCItemDef.create("insp_mtd_typ", "insp_mtd_typ"),
				MCItemDef.create("insp_mtd_typ_nm", "insp_mtd_typ_nm"),
				MCItemDef.create("insp_typ", "insp_typ"),
				MCItemDef.create("insp_typ_nm", "insp_typ_nm"),
				MCItemDef.create("insp_sts_typ", "insp_sts_typ"),
				MCItemDef.create("insp_sts_typ_nm", "insp_sts_typ_nm"),
				MCItemDef.create("insp_aprv_sts_typ", "insp_aprv_sts_typ"),
				MCItemDef.create("insp_aprv_sts_typ_nm", "insp_aprv_sts_typ_nm"),
				MCItemDef.create("inst_pack_unit_qty_p" + ".qty", "inst_pack_unit_qty"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("pack_unit_nm", "pack_unit_nm"),
				MCItemDef.create("pack_unit_dec_place", "pack_unit_dec_place"),
				MCItemDef.create("inst_base_unit_qty_p" + ".qty", "inst_base_unit_qty"),
				MCItemDef.create("rem_base_unit_qty_p" + ".qty", "rem_base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("good_qty_p" + ".qty", "good_qty"),
				MCItemDef.create("dfct_qty_p" + ".qty", "dfct_qty"),
				MCItemDef.create("act_ttl_qty_p" + ".qty", "act_ttl_qty"),
				MCItemDef.create("judg_ttl_qty_p" + ".qty", "judg_ttl_qty"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("maker_nm", "maker_nm"),
				MCItemDef.create("bp_lot_no", "bp_lot_no"),
				MCItemDef.create("std_insp_flg", "std_insp_flg"),
				MCItemDef.create("std_req_flg", "std_req_flg"),
				MCItemDef.create("std_cnf_req_flg", "std_cnf_req_flg"),
				MCItemDef.create("std_cmpl_flg", "std_cmpl_flg"),
				MCItemDef.create("std_cnf_cmpl_flg", "std_cnf_cmpl_flg"),
				MCItemDef.create("insp_rslt_prnt_flg", "insp_rslt_prnt_flg"),
				MCItemDef.create("insp_rslt_prnt_tm", "insp_rslt_prnt_tm"),
				MCItemDef.create("st_dt_p" + ".ymd", "st_dt"),
				MCItemDef.create("st_dt_p" + ".hm", "st_hm"),
				MCItemDef.create("end_dt_p" + ".ymd", "end_dt"),
				MCItemDef.create("end_dt_p" + ".hm", "end_hm"),
				MCItemDef.create("act_usr_dpt_p" + ".usr_cd", "act_usr_cd"),
				MCItemDef.create("act_usr_dpt_p" + ".usr_nm", "act_usr_nm"),
				MCItemDef.create("act_usr_dpt_p" + ".dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_usr_dpt_p" + ".dpt_nm", "act_dpt_nm"),
				MCItemDef.create("insp_judg_rslt_typ", "insp_judg_rslt_typ"),
				MCItemDef.create("insp_judg_rslt_typ_nm", "insp_judg_rslt_typ_nm"),
				MCItemDef.create("judg_dt", "judg_dt"),
				MCItemDef.create("judg_usr_dpt_p" + ".usr_cd", "judg_usr_cd"),
				MCItemDef.create("judg_usr_dpt_p" + ".usr_nm", "judg_usr_nm"),
				MCItemDef.create("judg_usr_dpt_p" + ".dpt_cd", "judg_dpt_cd"),
				MCItemDef.create("judg_usr_dpt_p" + ".dpt_nm", "judg_dpt_nm"),
				MCItemDef.create("judg_rsn_p" + ".txt", "judg_rsn"),
				MCItemDef.create("dfct_rsn_cd", "dfct_rsn_cd"),
				MCItemDef.create("dfct_rsn_nm", "dfct_rsn_nm"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("quality_typ_nm", "quality_typ_nm"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("smpl_inst_qty_p" + ".qty", "smpl_inst_qty"),
				MCItemDef.create("smpl_inst_unit_cd", "smpl_inst_unit_cd"),
				MCItemDef.create("smpl_inst_unit_nm", "smpl_inst_unit_nm"),
				MCItemDef.create("smpl_inst_unit_dec_place", "smpl_inst_unit_dec_place"),
				MCItemDef.create("std_cont_fctrt_p" + ".std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("act_cont_fctr_p" + ".act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("vld_dt_upd_flg", "vld_dt_upd_flg"),
				MCItemDef.create("vld_pd", "vld_pd"),
				MCItemDef.create("lmt_pd", "lmt_pd"),
				MCItemDef.create("calc_pd_typ", "calc_pd_typ"),
				MCItemDef.create("calc_pd_typ_nm", "calc_pd_typ_nm"),
				MCItemDef.create("lmt_dt_frm_typ", "lmt_dt_frm_typ"),
				MCItemDef.create("lmt_dt_frm_typ_nm", "lmt_dt_frm_typ_nm"),
				MCItemDef.create("lmt_up_flg", "lmt_up_flg"),
				MCItemDef.create("lmt_ctl_flg", "lmt_ctl_flg"),
				MCItemDef.create("lmt_ctl_categ", "lmt_ctl_categ"),
				MCItemDef.create("lmt_dt_frm", "lmt_dt_frm"),
				MCItemDef.create("vld_dt", "vld_dt"),
				MCItemDef.create("lmt_dt", "lmt_dt"),
				MCItemDef.create("vld_dt_now", "vld_dt_now"),
				MCItemDef.create("lmt_dt_now", "lmt_dt_now"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("lot_rmrks", "lot_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("in_prmt_insp_flg", "in_prmt_insp_flg"),
				MCItemDef.create("spec_sp_flg", "spec_sp_flg"),
				MCItemDef.create("spec_ng_flg", "spec_ng_flg"),
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
			MCBlockDef.create("Hdr")
		);
	}
	public static MCContainerDef MS_MSBFL0070_Srch01_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0070", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
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
				MCItemDef.create("sno_p" + ".sno1", "sno1"),
				MCItemDef.create("sno_p" + ".sno2", "sno2"),
				MCItemDef.create("sno_p" + ".sno3", "sno3"),
				MCItemDef.create("sno_p" + ".sno4", "sno4"),
				MCItemDef.create("wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("wrk_no_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("fix_no_typ", "fix_no_typ"),
				MCItemDef.create("fix_no_typ_nm", "fix_no_typ_nm"),
				MCItemDef.create("fix_no", "fix_no"),
				MCItemDef.create("stk_pack_unit_qty_p" + ".qty", "stk_pack_unit_qty"),
				MCItemDef.create("stk_pack_unit_cd", "stk_pack_unit_cd"),
				MCItemDef.create("stk_pack_unit_nm", "stk_pack_unit_nm"),
				MCItemDef.create("stk_pack_unit_dec_place", "stk_pack_unit_dec_place"),
				MCItemDef.create("stk_base_unit_qty_p" + ".qty", "stk_base_unit_qty"),
				MCItemDef.create("stk_base_unit_cd", "stk_base_unit_cd"),
				MCItemDef.create("stk_base_unit_nm", "stk_base_unit_nm"),
				MCItemDef.create("stk_base_unit_dec_place", "stk_base_unit_dec_place"),
				MCItemDef.create("pack_unit_qty_p" + ".qty", "pack_unit_qty"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("pack_unit_nm", "pack_unit_nm"),
				MCItemDef.create("pack_unit_dec_place", "pack_unit_dec_place"),
				MCItemDef.create("pack_unit_dmn_qty", "pack_unit_dmn_qty"),
				MCItemDef.create("pack_unit_conv_qty", "pack_unit_conv_qty"),
				MCItemDef.create("base_unit_qty_p" + ".qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("pack_xfr_pack_unit_qty_p" + ".qty", "pack_xfr_pack_unit_qty"),
				MCItemDef.create("pack_xfr_pack_unit_cd", "pack_xfr_pack_unit_cd"),
				MCItemDef.create("pack_xfr_pack_unit_nm", "pack_xfr_pack_unit_nm"),
				MCItemDef.create("pack_xfr_pack_unit_dec_place", "pack_xfr_pack_unit_dec_place"),
				MCItemDef.create("pack_xfr_pack_unit_dmn_qty", "pack_xfr_pack_unit_dmn_qty"),
				MCItemDef.create("pack_xfr_pack_unit_conv_qty", "pack_xfr_pack_unit_conv_qty"),
				MCItemDef.create("pack_xfr_base_unit_qty_p" + ".qty", "pack_xfr_base_unit_qty"),
				MCItemDef.create("pack_xfr_base_unit_cd", "pack_xfr_base_unit_cd"),
				MCItemDef.create("pack_xfr_base_unit_nm", "pack_xfr_base_unit_nm"),
				MCItemDef.create("pack_xfr_base_unit_dec_place", "pack_xfr_base_unit_dec_place"),
				MCItemDef.create("pack_xfr_base_unit_rnd_typ", "pack_xfr_base_unit_rnd_typ"),
				MCItemDef.create("dfct_rsn_cd", "dfct_rsn_cd"),
				MCItemDef.create("dfct_rsn_nm", "dfct_rsn_nm"),
				MCItemDef.create("ac_dt_p" + ".ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt_p" + ".can_ac_dt_for_call", "can_ac_dt"),
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
			MCBlockDef.create("Dtl")
		);
	}
	public static MCContainerDef MS_MSBFL0070_Srch01_DOWN_BLOCK2() {
	/** Ope.のBlock [Srch01_Smpl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0070", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("so_qty_p" + ".qty", "so_qty"),
				MCItemDef.create("smpl_qty_p" + ".qty", "smpl_qty"),
				MCItemDef.create("so_cmpl_flg", "so_cmpl_flg"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("pack_xfr_pack_unit_qty_p" + ".qty", "pack_xfr_pack_unit_qty"),
				MCItemDef.create("pack_xfr_pack_unit_cd", "pack_xfr_pack_unit_cd"),
				MCItemDef.create("pack_xfr_pack_unit_nm", "pack_xfr_pack_unit_nm"),
				MCItemDef.create("pack_xfr_pack_unit_dec_place", "pack_xfr_pack_unit_dec_place"),
				MCItemDef.create("pack_xfr_pack_unit_dmn_qty", "pack_xfr_pack_unit_dmn_qty"),
				MCItemDef.create("pack_xfr_pack_unit_conv_qty", "pack_xfr_pack_unit_conv_qty"),
				MCItemDef.create("pack_xfr_base_unit_qty_p" + ".qty", "pack_xfr_base_unit_qty"),
				MCItemDef.create("pack_xfr_base_unit_cd", "pack_xfr_base_unit_cd"),
				MCItemDef.create("pack_xfr_base_unit_nm", "pack_xfr_base_unit_nm"),
				MCItemDef.create("pack_xfr_base_unit_dec_place", "pack_xfr_base_unit_dec_place"),
				MCItemDef.create("pack_xfr_base_unit_rnd_typ", "pack_xfr_base_unit_rnd_typ"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("str_ln_tgt_flg", "str_ln_tgt_flg"),
				MCItemDef.create("str_ln_p" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_p" + ".str_ln_nm", "str_ln_nm"),
				MCItemDef.create("str_ln_p" + ".str_ln_cd_none_flg", "str_ln_cd_none_flg"),
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
				MCItemDef.create("sno_p" + ".sno1", "sno1"),
				MCItemDef.create("sno_p" + ".sno2", "sno2"),
				MCItemDef.create("sno_p" + ".sno3", "sno3"),
				MCItemDef.create("sno_p" + ".sno4", "sno4"),
				MCItemDef.create("wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("wrk_no_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("fix_no_typ", "fix_no_typ"),
				MCItemDef.create("fix_no_typ_nm", "fix_no_typ_nm"),
				MCItemDef.create("fix_no", "fix_no"),
				MCItemDef.create("act_dt_p" + ".ymd", "act_dt"),
				MCItemDef.create("act_dt_p" + ".hm", "act_hm"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_dpt_nm", "bd_dpt_nm"),
				MCItemDef.create("insp_smpl_act_no", "insp_smpl_act_no"),
				MCItemDef.create("insp_schd_no", "insp_schd_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("lims_flg", "lims_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_sys_nm", "ext_sys_nm"),
				MCItemDef.create("ext_insp_smpl_act_no", "ext_insp_smpl_act_no")
			}
			,
			MCBlockDef.create("Smpl")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0070_Srch02_INFO = new MCOperationInfo("MS", "MSBFL0070", "Srch02", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0070_Srch02_UP_BLOCK0() {
		/** Ope.のBlock [Srch02_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0070", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("lmt_dt_frm", "lmt_dt_frm")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}


	public static MCContainerDef MS_MSBFL0070_Srch02_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch02_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0070", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("lmt_dt_frm", "lmt_dt_frm"),
				MCItemDef.create("vld_dt", "vld_dt"),
				MCItemDef.create("lmt_dt", "lmt_dt")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0070_Ins01_INFO = new MCOperationInfo("MS", "MSBFL0070", "Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0070_Ins01_UP_BLOCK0() {
		/** Ope.のBlock [Ins01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0070", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("dfct_rsn_cd", "dfct_rsn_cd"),
				MCItemDef.create("st_dt_p" + ".ymd", "st_tm"),
				MCItemDef.create("end_dt_p" + ".ymd", "end_tm"),
				MCItemDef.create("act_usr_dpt_p" + ".usr_cd", "act_usr_cd"),
				MCItemDef.create("act_usr_dpt_p" + ".dpt_cd", "act_dpt_cd"),
				MCItemDef.create("lmt_dt_frm_typ", "lmt_dt_frm_typ"),
				MCItemDef.create("lmt_dt_frm", "lmt_dt_frm"),
				MCItemDef.create("vld_dt", "vld_dt"),
				MCItemDef.create("lmt_dt", "lmt_dt"),
				MCItemDef.create("act_cont_fctr_p" + ".act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("lot_rmrks", "lot_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("vld_dt_upd_flg", "vld_dt_upd_flg"),
				MCItemDef.create("inst_upd_cntr", "inst_upd_cntr")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSBFL0070_Ins01_UP_BLOCK1() {
		/** Ope.のBlock [Ins01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0070", "Ins01",
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
				MCItemDef.create("sno_p" + ".sno1", "sno1"),
				MCItemDef.create("sno_p" + ".sno2", "sno2"),
				MCItemDef.create("sno_p" + ".sno3", "sno3"),
				MCItemDef.create("sno_p" + ".sno4", "sno4"),
				MCItemDef.create("fix_no_typ", "fix_no_typ"),
				MCItemDef.create("fix_no", "fix_no"),
				MCItemDef.create("pack_unit_qty_p" + ".qty", "pack_unit_qty"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("base_unit_qty_p" + ".qty", "base_unit_qty"),
				MCItemDef.create("pack_xfr_pack_unit_qty_p" + ".qty", "pack_xfr_pack_unit_qty"),
				MCItemDef.create("pack_xfr_pack_unit_cd", "pack_xfr_pack_unit_cd"),
				MCItemDef.create("pack_xfr_base_unit_qty_p" + ".qty", "pack_xfr_base_unit_qty"),
				MCItemDef.create("dfct_rsn_cd", "dfct_rsn_cd"),
				MCItemDef.create("ac_dt_p" + ".ac_dt", "ac_dt"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}

	public static MCContainerDef MS_MSBFL0070_Ins01_UP_BLOCK2() {
		/** Ope.のBlock [Ins01_Smpl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0070", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_smpl_act_no", "insp_smpl_act_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("insp_schd_no", "insp_schd_no"),
				MCItemDef.create("so_qty_p" + ".qty", "so_qty"),
				MCItemDef.create("smpl_qty_p" + ".qty", "smpl_qty"),
				MCItemDef.create("pack_xfr_pack_unit_qty_p" + ".qty", "pack_xfr_pack_unit_qty"),
				MCItemDef.create("pack_xfr_pack_unit_cd", "pack_xfr_pack_unit_cd"),
				MCItemDef.create("pack_xfr_base_unit_qty_p" + ".qty", "pack_xfr_base_unit_qty"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_p" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("sno_p" + ".sno1", "sno1"),
				MCItemDef.create("sno_p" + ".sno2", "sno2"),
				MCItemDef.create("sno_p" + ".sno3", "sno3"),
				MCItemDef.create("sno_p" + ".sno4", "sno4"),
				MCItemDef.create("fix_no_typ", "fix_no_typ"),
				MCItemDef.create("fix_no", "fix_no"),
				MCItemDef.create("act_dt_p" + ".ymd", "act_tm"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Smpl")
		);
	}


	public static MCContainerDef MS_MSBFL0070_Ins01_DOWN_BLOCK0() {
	/** Ope.のBlock [Ins01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0070", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("insp_sts_typ", "insp_sts_typ"),
				MCItemDef.create("insp_sts_typ_nm", "insp_sts_typ_nm"),
				MCItemDef.create("insp_aprv_sts_typ", "insp_aprv_sts_typ"),
				MCItemDef.create("insp_aprv_sts_typ_nm", "insp_aprv_sts_typ_nm"),
				MCItemDef.create("insp_act_no", "insp_act_no")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	public static MCContainerDef MS_MSBFL0070_Ins01_DOWN_BLOCK1() {
	/** Ope.のBlock [Ins01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0070", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("insp_act_d_no", "insp_act_d_no"),
				MCItemDef.create("insp_act_no", "insp_act_no")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	public static MCContainerDef MS_MSBFL0070_Ins01_DOWN_BLOCK2() {
	/** Ope.のBlock [Ins01_Smpl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0070", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("insp_smpl_act_no", "insp_smpl_act_no"),
				MCItemDef.create("insp_act_no", "insp_act_no")
			}
			,
			MCBlockDef.create("Smpl")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0070_Upd01_INFO = new MCOperationInfo("MS", "MSBFL0070", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0070_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0070", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("dfct_rsn_cd", "dfct_rsn_cd"),
				MCItemDef.create("st_dt_p" + ".ymd", "st_tm"),
				MCItemDef.create("end_dt_p" + ".ymd", "end_tm"),
				MCItemDef.create("act_usr_dpt_p" + ".usr_cd", "act_usr_cd"),
				MCItemDef.create("act_usr_dpt_p" + ".dpt_cd", "act_dpt_cd"),
				MCItemDef.create("lmt_dt_frm_typ", "lmt_dt_frm_typ"),
				MCItemDef.create("lmt_dt_frm", "lmt_dt_frm"),
				MCItemDef.create("vld_dt", "vld_dt"),
				MCItemDef.create("lmt_dt", "lmt_dt"),
				MCItemDef.create("act_cont_fctr_p" + ".act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("stt_can_ac_dt", "stt_can_ac_dt"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("lot_rmrks", "lot_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("vld_dt_upd_flg", "vld_dt_upd_flg"),
				MCItemDef.create("inst_upd_cntr", "inst_upd_cntr"),
				MCItemDef.create("act_upd_cntr", "act_upd_cntr")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSBFL0070_Upd01_UP_BLOCK1() {
		/** Ope.のBlock [Upd01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0070", "Upd01",
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
				MCItemDef.create("sno_p" + ".sno1", "sno1"),
				MCItemDef.create("sno_p" + ".sno2", "sno2"),
				MCItemDef.create("sno_p" + ".sno3", "sno3"),
				MCItemDef.create("sno_p" + ".sno4", "sno4"),
				MCItemDef.create("fix_no_typ", "fix_no_typ"),
				MCItemDef.create("fix_no", "fix_no"),
				MCItemDef.create("pack_unit_qty_p" + ".qty", "pack_unit_qty"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("base_unit_qty_p" + ".qty", "base_unit_qty"),
				MCItemDef.create("pack_xfr_pack_unit_qty_p" + ".qty", "pack_xfr_pack_unit_qty"),
				MCItemDef.create("pack_xfr_pack_unit_cd", "pack_xfr_pack_unit_cd"),
				MCItemDef.create("pack_xfr_base_unit_qty_p" + ".qty", "pack_xfr_base_unit_qty"),
				MCItemDef.create("dfct_rsn_cd", "dfct_rsn_cd"),
				MCItemDef.create("ac_dt_p" + ".ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt_p" + ".can_ac_dt_for_call", "can_ac_dt"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}

	public static MCContainerDef MS_MSBFL0070_Upd01_UP_BLOCK2() {
		/** Ope.のBlock [Upd01_Smpl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0070", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_smpl_act_no", "insp_smpl_act_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("insp_schd_no", "insp_schd_no"),
				MCItemDef.create("so_qty_p" + ".qty", "so_qty"),
				MCItemDef.create("smpl_qty_p" + ".qty", "smpl_qty"),
				MCItemDef.create("pack_xfr_pack_unit_qty_p" + ".qty", "pack_xfr_pack_unit_qty"),
				MCItemDef.create("pack_xfr_pack_unit_cd", "pack_xfr_pack_unit_cd"),
				MCItemDef.create("pack_xfr_base_unit_qty_p" + ".qty", "pack_xfr_base_unit_qty"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_p" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("sno_p" + ".sno1", "sno1"),
				MCItemDef.create("sno_p" + ".sno2", "sno2"),
				MCItemDef.create("sno_p" + ".sno3", "sno3"),
				MCItemDef.create("sno_p" + ".sno4", "sno4"),
				MCItemDef.create("fix_no_typ", "fix_no_typ"),
				MCItemDef.create("fix_no", "fix_no"),
				MCItemDef.create("act_dt_p" + ".ymd", "act_tm"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt_p" + ".can_ac_dt_for_call", "can_ac_dt"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Smpl")
		);
	}


	public static MCContainerDef MS_MSBFL0070_Upd01_DOWN_BLOCK0() {
	/** Ope.のBlock [Upd01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0070", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("insp_sts_typ", "insp_sts_typ"),
				MCItemDef.create("insp_sts_typ_nm", "insp_sts_typ_nm"),
				MCItemDef.create("insp_aprv_sts_typ", "insp_aprv_sts_typ"),
				MCItemDef.create("insp_aprv_sts_typ_nm", "insp_aprv_sts_typ_nm")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	public static MCContainerDef MS_MSBFL0070_Upd01_DOWN_BLOCK1() {
	/** Ope.のBlock [Upd01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0070", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("insp_act_d_no", "insp_act_d_no"),
				MCItemDef.create("insp_act_no", "insp_act_no")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	public static MCContainerDef MS_MSBFL0070_Upd01_DOWN_BLOCK2() {
	/** Ope.のBlock [Upd01_Smpl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0070", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("insp_smpl_act_no", "insp_smpl_act_no"),
				MCItemDef.create("insp_act_no", "insp_act_no")
			}
			,
			MCBlockDef.create("Smpl")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0070_Upd02_INFO = new MCOperationInfo("MS", "MSBFL0070", "Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0070_Upd02_UP_BLOCK0() {
		/** Ope.のBlock [Upd02_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0070", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("judg_dt", "judg_dt"),
				MCItemDef.create("insp_judg_rslt_typ", "insp_judg_rslt_typ"),
				MCItemDef.create("judg_usr_dpt_p" + ".usr_cd", "judg_usr_cd"),
				MCItemDef.create("judg_usr_dpt_p" + ".dpt_cd", "judg_dpt_cd"),
				MCItemDef.create("judg_rsn_p" + ".txt", "judg_rsn"),
				MCItemDef.create("lmt_dt_frm_typ", "lmt_dt_frm_typ"),
				MCItemDef.create("lmt_dt_frm", "lmt_dt_frm"),
				MCItemDef.create("vld_dt", "vld_dt"),
				MCItemDef.create("lmt_dt", "lmt_dt"),
				MCItemDef.create("act_cont_fctr_p" + ".act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("vld_dt_upd_flg", "vld_dt_upd_flg"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("lot_rmrks", "lot_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("inst_upd_cntr", "inst_upd_cntr"),
				MCItemDef.create("act_upd_cntr", "act_upd_cntr")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSBFL0070_Upd02_UP_BLOCK1() {
		/** Ope.のBlock [Upd02_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0070", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("fix_no_typ", "fix_no_typ"),
				MCItemDef.create("fix_no", "fix_no"),
				MCItemDef.create("ac_dt_p" + ".ac_dt", "ac_dt")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	public static MCContainerDef MS_MSBFL0070_Upd02_DOWN_BLOCK0() {
	/** Ope.のBlock [Upd02_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0070", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("insp_aprv_sts_typ", "insp_aprv_sts_typ"),
				MCItemDef.create("insp_aprv_sts_typ_nm", "insp_aprv_sts_typ_nm")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0070_Del01_INFO = new MCOperationInfo("MS", "MSBFL0070", "Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0070_Del01_UP_BLOCK0() {
		/** Ope.のBlock [Del01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0070", "Del01",
			new MCItemDef[]{
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("inst_upd_cntr", "inst_upd_cntr"),
				MCItemDef.create("act_upd_cntr", "act_upd_cntr")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSBFL0070_Del01_UP_BLOCK1() {
		/** Ope.のBlock [Del01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0070", "Del01",
			new MCItemDef[]{
				MCItemDef.create("insp_act_d_no", "insp_act_d_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("can_ac_dt_p" + ".can_ac_dt_for_call", "can_ac_dt"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}

	public static MCContainerDef MS_MSBFL0070_Del01_UP_BLOCK2() {
		/** Ope.のBlock [Del01_Smpl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0070", "Del01",
			new MCItemDef[]{
				MCItemDef.create("insp_smpl_act_no", "insp_smpl_act_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("can_ac_dt_p" + ".can_ac_dt_for_call", "can_ac_dt")
			}
			,
			MCBlockDef.create("Smpl")
		);
	}


	public static MCContainerDef MS_MSBFL0070_Del01_DOWN_BLOCK0() {
	/** Ope.のBlock [Del01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0070", "Del01",
			new MCItemDef[]{
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("insp_sts_typ", "insp_sts_typ"),
				MCItemDef.create("insp_sts_typ_nm", "insp_sts_typ_nm"),
				MCItemDef.create("insp_aprv_sts_typ", "insp_aprv_sts_typ"),
				MCItemDef.create("insp_aprv_sts_typ_nm", "insp_aprv_sts_typ_nm")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0070_Del02_INFO = new MCOperationInfo("MS", "MSBFL0070", "Del02", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0070_Del02_UP_BLOCK0() {
		/** Ope.のBlock [Del02_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0070", "Del02",
			new MCItemDef[]{
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("judg_rsn_p" + ".txt", "judg_rsn"),
				MCItemDef.create("inst_upd_cntr", "inst_upd_cntr"),
				MCItemDef.create("act_upd_cntr", "act_upd_cntr")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSBFL0070_Del02_UP_BLOCK1() {
		/** Ope.のBlock [Del02_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0070", "Del02",
			new MCItemDef[]{
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("fix_no_typ", "fix_no_typ"),
				MCItemDef.create("fix_no", "fix_no"),
				MCItemDef.create("can_ac_dt_p" + ".can_ac_dt_for_call", "can_ac_dt"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	public static MCContainerDef MS_MSBFL0070_Del02_DOWN_BLOCK0() {
	/** Ope.のBlock [Del02_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0070", "Del02",
			new MCItemDef[]{
				MCItemDef.create("insp_sts_typ", "insp_sts_typ"),
				MCItemDef.create("insp_sts_typ_nm", "insp_sts_typ_nm"),
				MCItemDef.create("insp_aprv_sts_typ", "insp_aprv_sts_typ"),
				MCItemDef.create("insp_aprv_sts_typ_nm", "insp_aprv_sts_typ_nm")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0070_Prnt01_INFO = new MCOperationInfo("MS", "MSBFL0070", "Prnt01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0070_Prnt01_UP_BLOCK0() {
		/** Ope.のBlock [Prnt01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0070", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("insp_no", "insp_no")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}


	public static MCContainerDef MS_MSBFL0070_Prnt01_DOWN_BLOCK0() {
	/** Ope.のBlock [Prnt01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0070", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("insp_rslt_prnt_flg", "insp_rslt_prnt_flg"),
				MCItemDef.create("insp_rslt_prnt_tm", "insp_rslt_prnt_tm")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	//FMCB DEF_CLASSES END
}

