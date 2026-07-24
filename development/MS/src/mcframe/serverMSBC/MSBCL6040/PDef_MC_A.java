package mcframe.serverMSBC.MSBCL6040;

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
 * [MSBCL_LotPropService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBCL6040.LotProp_Sprt01.UP.BLOCK0")){
			return MS_MSBCL6040_LotProp_Sprt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6040.LotProp_Sprt01.UP.BLOCK1")){
			return MS_MSBCL6040_LotProp_Sprt01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL6040.LotProp_Sprt01.UP.BLOCK2")){
			return MS_MSBCL6040_LotProp_Sprt01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBCL6040.LotProp_Sprt01.UP.BLOCK3")){
			return MS_MSBCL6040_LotProp_Sprt01_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBCL6040.LotProp_Sprt01.DOWN.BLOCK0")){
			return MS_MSBCL6040_LotProp_Sprt01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6040.LotProp_Sprt01.DOWN.BLOCK1")){
			return MS_MSBCL6040_LotProp_Sprt01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBCL6040.LotProp_Sprt01.DOWN.BLOCK2")){
			return MS_MSBCL6040_LotProp_Sprt01_DOWN_BLOCK2();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MS_MSBCL6040_LotProp_Sprt01_INFO = new MCOperationInfo("MS", "MSBCL6040", "LotProp_Sprt01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6040_LotProp_Sprt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6040", "LotProp_Sprt01",
			new MCItemDef[]{
				MCItemDef.create("act_flg", "act_flg"),
				MCItemDef.create("exec_prop_btn_flg", "exec_prop_btn_flg")
			}
			,
			MCBlockDef.create("LotProp_Sprt01_Ctrl")
		);
	}

	public static MCContainerDef MS_MSBCL6040_LotProp_Sprt01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL6040", "LotProp_Sprt01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("inpt_schd_no", "inpt_schd_no"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("inpt_act_no", "inpt_act_no"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("inpt_dt", "inpt_dt"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("alt_grp_cd", "alt_grp_cd"),
				MCItemDef.create("alt_grp_seq", "alt_grp_seq"),
				MCItemDef.create("alt_itm_fix_flg", "alt_itm_fix_flg"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("alt_qty", "alt_qty"),
				MCItemDef.create("alt_itm_typ", "alt_itm_typ"),
				MCItemDef.create("alt_alloc_prio", "alt_alloc_prio"),
				MCItemDef.create("inpt_loc_cd", "inpt_loc_cd"),
				MCItemDef.create("inpt_str_ln_cd", "inpt_str_ln_cd"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("rqst_sno1", "rqst_sno1"),
				MCItemDef.create("sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("rqst_sno2", "rqst_sno2"),
				MCItemDef.create("sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("rqst_sno3", "rqst_sno3"),
				MCItemDef.create("sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("rqst_sno4", "rqst_sno4"),
				MCItemDef.create("sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("cont_qty", "cont_qty"),
				MCItemDef.create("not_lot_fix_flg", "not_lot_fix_flg"),
				MCItemDef.create("vld_dt", "vld_dt"),
				MCItemDef.create("first_gr_dt", "first_gr_dt"),
				MCItemDef.create("lot_seq", "lot_seq"),
				MCItemDef.create("inpt_qty", "inpt_qty"),
				MCItemDef.create("rqmt_qty", "rqmt_qty"),
				MCItemDef.create("fxd_rqmt_qty", "fxd_rqmt_qty"),
				MCItemDef.create("loss_qty", "loss_qty"),
				MCItemDef.create("fxd_loss_qty", "fxd_loss_qty"),
				MCItemDef.create("acxfr_qty", "acxfr_qty"),
				MCItemDef.create("acxfr_rsn_cd", "acxfr_rsn_cd"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("cont_inpt_qty", "cont_inpt_qty"),
				MCItemDef.create("cont_rqmt_qty", "cont_rqmt_qty"),
				MCItemDef.create("cont_fxd_rqmt_qty", "cont_fxd_rqmt_qty"),
				MCItemDef.create("cont_loss_qty", "cont_loss_qty"),
				MCItemDef.create("cont_fxd_loss_qty", "cont_fxd_loss_qty"),
				MCItemDef.create("cont_fctr_unit_cd", "cont_fctr_unit_cd"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("cont_fctr_rnd_typ", "cont_fctr_rnd_typ"),
				MCItemDef.create("cont_fctr_dec_place", "cont_fctr_dec_place"),
				MCItemDef.create("std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("stk_arrv_bp_nm", "stk_arrv_bp_nm"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_bp_nm", "stk_bp_nm"),
				MCItemDef.create("lot_mix_flg", "lot_mix_flg"),
				MCItemDef.create("sublot_mix_flg", "sublot_mix_flg"),
				MCItemDef.create("alloc_flg", "alloc_flg"),
				MCItemDef.create("alloc_ctl_typ", "alloc_ctl_typ"),
				MCItemDef.create("set_stk_str_ln_flg", "set_stk_str_ln_flg"),
				MCItemDef.create("not_pd_chk_flg", "not_pd_chk_flg")
			}
			,
			MCBlockDef.create("LotProp_Sprt01_Dtl1")
		);
	}

	public static MCContainerDef MS_MSBCL6040_LotProp_Sprt01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBCL6040", "LotProp_Sprt01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("pack_flg", "pack_flg")
			}
			,
			MCBlockDef.create("LotProp_Sprt01_Dtl3")
		);
	}

	public static MCContainerDef MS_MSBCL6040_LotProp_Sprt01_UP_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBCL6040", "LotProp_Sprt01",
			new MCItemDef[]{
				MCItemDef.create("inpt_peg_no", "inpt_peg_no"),
				MCItemDef.create("fxd_loss_flg", "fxd_loss_flg"),
				MCItemDef.create("loss_rsn_cd", "loss_rsn_cd"),
				MCItemDef.create("loss_qty", "loss_qty"),
				MCItemDef.create("cont_loss_qty", "cont_loss_qty")
			}
			,
			MCBlockDef.create("LotProp_Sprt01_Dtl4")
		);
	}


	public static MCContainerDef MS_MSBCL6040_LotProp_Sprt01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6040", "LotProp_Sprt01",
			new MCItemDef[]{
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("sum_peg_no", "sum_peg_no"),
				MCItemDef.create("loss_peg_no", "loss_peg_no"),
				MCItemDef.create("add_flg", "add_flg"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("inpt_schd_no", "inpt_schd_no"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("inpt_dt", "inpt_dt"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("alt_grp_cd", "alt_grp_cd"),
				MCItemDef.create("alt_grp_seq", "alt_grp_seq"),
				MCItemDef.create("alt_itm_fix_flg", "alt_itm_fix_flg"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("not_alloc_qty", "not_alloc_qty"),
				MCItemDef.create("not_alloc_cont_qty", "not_alloc_cont_qty"),
				MCItemDef.create("inpt_loc_cd", "inpt_loc_cd"),
				MCItemDef.create("inpt_str_ln_cd", "inpt_str_ln_cd"),
				MCItemDef.create("inpt_sppl_cd", "inpt_sppl_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("rqst_sno1", "rqst_sno1"),
				MCItemDef.create("sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("rqst_sno2", "rqst_sno2"),
				MCItemDef.create("sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("rqst_sno3", "rqst_sno3"),
				MCItemDef.create("sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("rqst_sno4", "rqst_sno4"),
				MCItemDef.create("sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("cont_qty", "cont_qty"),
				MCItemDef.create("not_lot_fix_flg", "not_lot_fix_flg"),
				MCItemDef.create("vld_dt", "vld_dt"),
				MCItemDef.create("first_gr_dt", "first_gr_dt"),
				MCItemDef.create("lot_seq", "lot_seq"),
				MCItemDef.create("inpt_qty", "inpt_qty"),
				MCItemDef.create("rqmt_qty", "rqmt_qty"),
				MCItemDef.create("fxd_rqmt_qty", "fxd_rqmt_qty"),
				MCItemDef.create("loss_qty", "loss_qty"),
				MCItemDef.create("fxd_loss_qty", "fxd_loss_qty"),
				MCItemDef.create("acxfr_qty", "acxfr_qty"),
				MCItemDef.create("acxfr_rsn_cd", "acxfr_rsn_cd"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("cont_inpt_qty", "cont_inpt_qty"),
				MCItemDef.create("cont_rqmt_qty", "cont_rqmt_qty"),
				MCItemDef.create("cont_fxd_rqmt_qty", "cont_fxd_rqmt_qty"),
				MCItemDef.create("cont_loss_qty", "cont_loss_qty"),
				MCItemDef.create("cont_fxd_loss_qty", "cont_fxd_loss_qty"),
				MCItemDef.create("act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("cont_fctr_dec_place", "cont_fctr_dec_place"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("stk_arrv_bp_nm", "stk_arrv_bp_nm"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_bp_nm", "stk_bp_nm"),
				MCItemDef.create("stk_loc_cd", "stk_loc_cd"),
				MCItemDef.create("stk_str_ln_cd", "stk_str_ln_cd"),
				MCItemDef.create("gr_loc_cd", "gr_loc_cd"),
				MCItemDef.create("gr_str_ln_cd", "gr_str_ln_cd"),
				MCItemDef.create("alloc_flg", "alloc_flg")
			}
			,
			MCBlockDef.create("LotProp_Sprt01_Dtl1")
		);
	}
	public static MCContainerDef MS_MSBCL6040_LotProp_Sprt01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL6040", "LotProp_Sprt01",
			new MCItemDef[]{
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("sum_peg_no", "sum_peg_no"),
				MCItemDef.create("add_flg", "add_flg"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("inpt_schd_no", "inpt_schd_no"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("inpt_dt", "inpt_dt"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("alt_grp_cd", "alt_grp_cd"),
				MCItemDef.create("alt_grp_seq", "alt_grp_seq"),
				MCItemDef.create("alt_itm_fix_flg", "alt_itm_fix_flg"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("not_alloc_qty", "not_alloc_qty"),
				MCItemDef.create("not_alloc_cont_qty", "not_alloc_cont_qty"),
				MCItemDef.create("inpt_loc_cd", "inpt_loc_cd"),
				MCItemDef.create("inpt_str_ln_cd", "inpt_str_ln_cd"),
				MCItemDef.create("inpt_sppl_cd", "inpt_sppl_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("rqst_sno1", "rqst_sno1"),
				MCItemDef.create("sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("rqst_sno2", "rqst_sno2"),
				MCItemDef.create("sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("rqst_sno3", "rqst_sno3"),
				MCItemDef.create("sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("rqst_sno4", "rqst_sno4"),
				MCItemDef.create("sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("cont_qty", "cont_qty"),
				MCItemDef.create("not_lot_fix_flg", "not_lot_fix_flg"),
				MCItemDef.create("vld_dt", "vld_dt"),
				MCItemDef.create("first_gr_dt", "first_gr_dt"),
				MCItemDef.create("lot_seq", "lot_seq"),
				MCItemDef.create("inpt_qty", "inpt_qty"),
				MCItemDef.create("rqmt_qty", "rqmt_qty"),
				MCItemDef.create("fxd_rqmt_qty", "fxd_rqmt_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("cont_inpt_qty", "cont_inpt_qty"),
				MCItemDef.create("cont_rqmt_qty", "cont_rqmt_qty"),
				MCItemDef.create("cont_fxd_rqmt_qty", "cont_fxd_rqmt_qty"),
				MCItemDef.create("act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("alloc_flg", "alloc_flg")
			}
			,
			MCBlockDef.create("LotProp_Sprt01_Dtl2")
		);
	}
	public static MCContainerDef MS_MSBCL6040_LotProp_Sprt01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBCL6040", "LotProp_Sprt01",
			new MCItemDef[]{
				MCItemDef.create("inpt_peg_no", "inpt_peg_no"),
				MCItemDef.create("loss_peg_no", "loss_peg_no"),
				MCItemDef.create("loss_rsn_cd", "loss_rsn_cd"),
				MCItemDef.create("loss_qty", "loss_qty"),
				MCItemDef.create("cont_loss_qty", "cont_loss_qty"),
				MCItemDef.create("add_flg", "add_flg")
			}
			,
			MCBlockDef.create("LotProp_Sprt01_Dtl4")
		);
	}
	//FMCB DEF_CLASSES END
}

