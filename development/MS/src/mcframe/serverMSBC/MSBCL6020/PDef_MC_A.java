package mcframe.serverMSBC.MSBCL6020;

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
 * [MSBCL_ReExpService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBCL6020.ReExp_Sprt01.UP.BLOCK0")){
			return MS_MSBCL6020_ReExp_Sprt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6020.ReExp_Sprt01.UP.BLOCK1")){
			return MS_MSBCL6020_ReExp_Sprt01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL6020.ReExp_Sprt01.UP.BLOCK2")){
			return MS_MSBCL6020_ReExp_Sprt01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBCL6020.ReExp_Sprt01.DOWN.BLOCK0")){
			return MS_MSBCL6020_ReExp_Sprt01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6020.ReExp_Sprt01.DOWN.BLOCK1")){
			return MS_MSBCL6020_ReExp_Sprt01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBCL6020.ReExp_Sprt02.UP.BLOCK0")){
			return MS_MSBCL6020_ReExp_Sprt02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6020.ReExp_Sprt02.UP.BLOCK1")){
			return MS_MSBCL6020_ReExp_Sprt02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL6020.ReExp_Sprt02.DOWN.BLOCK0")){
			return MS_MSBCL6020_ReExp_Sprt02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6020.ReExp_Sprt03.UP.BLOCK0")){
			return MS_MSBCL6020_ReExp_Sprt03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6020.ReExp_Sprt03.UP.BLOCK1")){
			return MS_MSBCL6020_ReExp_Sprt03_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL6020.ReExp_Sprt03.UP.BLOCK2")){
			return MS_MSBCL6020_ReExp_Sprt03_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBCL6020.ReExp_Sprt03.DOWN.BLOCK0")){
			return MS_MSBCL6020_ReExp_Sprt03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6020.ReExp_Sprt04.UP.BLOCK0")){
			return MS_MSBCL6020_ReExp_Sprt04_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6020.ReExp_Sprt04.UP.BLOCK1")){
			return MS_MSBCL6020_ReExp_Sprt04_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL6020.ReExp_Sprt04.DOWN.BLOCK0")){
			return MS_MSBCL6020_ReExp_Sprt04_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6020.ReExp_Sprt04.DOWN.BLOCK1")){
			return MS_MSBCL6020_ReExp_Sprt04_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBCL6020.ReExp_Sprt04.DOWN.BLOCK2")){
			return MS_MSBCL6020_ReExp_Sprt04_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBCL6020.ReExp_Sprt04.DOWN.BLOCK3")){
			return MS_MSBCL6020_ReExp_Sprt04_DOWN_BLOCK3();
		}
		else if (id.equals("MS.MSBCL6020.ReExp_Sprt05.UP.BLOCK0")){
			return MS_MSBCL6020_ReExp_Sprt05_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6020.ReExp_Sprt05.UP.BLOCK1")){
			return MS_MSBCL6020_ReExp_Sprt05_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL6020.ReExp_Sprt05.UP.BLOCK2")){
			return MS_MSBCL6020_ReExp_Sprt05_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBCL6020.ReExp_Sprt05.UP.BLOCK3")){
			return MS_MSBCL6020_ReExp_Sprt05_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBCL6020.ReExp_Sprt05.UP.BLOCK4")){
			return MS_MSBCL6020_ReExp_Sprt05_UP_BLOCK4();
		}
		else if (id.equals("MS.MSBCL6020.ReExp_Sprt05.UP.BLOCK5")){
			return MS_MSBCL6020_ReExp_Sprt05_UP_BLOCK5();
		}
		else if (id.equals("MS.MSBCL6020.ReExp_Sprt05.DOWN.BLOCK0")){
			return MS_MSBCL6020_ReExp_Sprt05_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6020.ReExp_Sprt05.DOWN.BLOCK1")){
			return MS_MSBCL6020_ReExp_Sprt05_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBCL6020.ReExp_Sprt05.DOWN.BLOCK2")){
			return MS_MSBCL6020_ReExp_Sprt05_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBCL6020.ReExp_Sprt05.DOWN.BLOCK3")){
			return MS_MSBCL6020_ReExp_Sprt05_DOWN_BLOCK3();
		}
		else if (id.equals("MS.MSBCL6020.ReExp_Sprt05.DOWN.BLOCK4")){
			return MS_MSBCL6020_ReExp_Sprt05_DOWN_BLOCK4();
		}
		else if (id.equals("MS.MSBCL6020.ReExp_Sprt06.UP.BLOCK0")){
			return MS_MSBCL6020_ReExp_Sprt06_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6020.ReExp_Sprt06.UP.BLOCK1")){
			return MS_MSBCL6020_ReExp_Sprt06_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL6020.ReExp_Sprt06.UP.BLOCK2")){
			return MS_MSBCL6020_ReExp_Sprt06_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBCL6020.ReExp_Sprt06.UP.BLOCK3")){
			return MS_MSBCL6020_ReExp_Sprt06_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBCL6020.ReExp_Sprt06.UP.BLOCK4")){
			return MS_MSBCL6020_ReExp_Sprt06_UP_BLOCK4();
		}
		else if (id.equals("MS.MSBCL6020.ReExp_Sprt06.UP.BLOCK5")){
			return MS_MSBCL6020_ReExp_Sprt06_UP_BLOCK5();
		}
		else if (id.equals("MS.MSBCL6020.ReExp_Sprt06.DOWN.BLOCK0")){
			return MS_MSBCL6020_ReExp_Sprt06_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6020.ReExp_Sprt06.DOWN.BLOCK1")){
			return MS_MSBCL6020_ReExp_Sprt06_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBCL6020.ReExp_Sprt06.DOWN.BLOCK2")){
			return MS_MSBCL6020_ReExp_Sprt06_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBCL6020.ReExp_Sprt06.DOWN.BLOCK3")){
			return MS_MSBCL6020_ReExp_Sprt06_DOWN_BLOCK3();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
						
	
	static final MCOperationInfo MS_MSBCL6020_ReExp_Sprt01_INFO = new MCOperationInfo("MS", "MSBCL6020", "ReExp_Sprt01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6020_ReExp_Sprt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6020", "ReExp_Sprt01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("oper_loc_cd", "oper_loc_cd"),
				MCItemDef.create("oper_inst_qty", "oper_inst_qty"),
				MCItemDef.create("mfg_st_schd_dt", "mfg_st_schd_dt"),
				MCItemDef.create("st_schd_dt", "st_schd_dt"),
				MCItemDef.create("end_schd_dt", "end_schd_dt"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("oper_str_ln_cd", "oper_str_ln_cd"),
				MCItemDef.create("oper_str_ln_nm", "oper_str_ln_nm"),
				MCItemDef.create("oper_str_ln_cd_none_flg", "oper_str_ln_cd_none_flg"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("strg_str_ln_nm", "strg_str_ln_nm"),
				MCItemDef.create("strg_str_ln_cd_none_flg", "strg_str_ln_cd_none_flg")
			}
			,
			MCBlockDef.create("ReExp_Sprt01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBCL6020_ReExp_Sprt01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL6020", "ReExp_Sprt01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("inpt_schd_no", "inpt_schd_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("alt_grp_cd", "alt_grp_cd"),
				MCItemDef.create("alt_grp_seq", "alt_grp_seq"),
				MCItemDef.create("alt_qty", "alt_qty"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("inpt_qty", "inpt_qty"),
				MCItemDef.create("rqmt_qty", "rqmt_qty"),
				MCItemDef.create("fxd_rqmt_qty", "fxd_rqmt_qty"),
				MCItemDef.create("total_rqmt_qty", "total_rqmt_qty"),
				MCItemDef.create("cont_inpt_qty", "cont_inpt_qty"),
				MCItemDef.create("cont_rqmt_qty", "cont_rqmt_qty"),
				MCItemDef.create("cont_fxd_rqmt_qty", "cont_fxd_rqmt_qty"),
				MCItemDef.create("sum_cont_rqmt_qty", "sum_cont_rqmt_qty"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("itm_seq", "itm_seq"),
				MCItemDef.create("in_offst_typ", "in_offst_typ"),
				MCItemDef.create("in_offst", "in_offst"),
				MCItemDef.create("par_inst_qty", "par_inst_qty"),
				MCItemDef.create("chd_inpt_qty", "chd_inpt_qty"),
				MCItemDef.create("chd_rqmt_qty", "chd_rqmt_qty"),
				MCItemDef.create("fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("alloc_flg", "alloc_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("first_gr_dt", "first_gr_dt"),
				MCItemDef.create("lot_seq", "lot_seq")
			}
			,
			MCBlockDef.create("ReExp_Sprt01_DtlInpt")
		);
	}

	public static MCContainerDef MS_MSBCL6020_ReExp_Sprt01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBCL6020", "ReExp_Sprt01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("par_inst_qty", "par_inst_qty"),
				MCItemDef.create("chd_inpt_qty", "chd_inpt_qty"),
				MCItemDef.create("chd_rqmt_qty", "chd_rqmt_qty"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_seq", "oper_seq")
			}
			,
			MCBlockDef.create("ReExp_Sprt01_DtlByProd")
		);
	}


	public static MCContainerDef MS_MSBCL6020_ReExp_Sprt01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6020", "ReExp_Sprt01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("inpt_schd_no", "inpt_schd_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("alt_grp_cd", "alt_grp_cd"),
				MCItemDef.create("alt_grp_nm", "alt_grp_nm"),
				MCItemDef.create("alt_grp_seq", "alt_grp_seq"),
				MCItemDef.create("alt_qty", "alt_qty"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("th_image", "th_image"),
				MCItemDef.create("inpt_qty", "inpt_qty"),
				MCItemDef.create("rqmt_qty", "rqmt_qty"),
				MCItemDef.create("fxd_rqmt_qty", "fxd_rqmt_qty"),
				MCItemDef.create("total_rqmt_qty", "total_rqmt_qty"),
				MCItemDef.create("io_schd_rqmt_qty", "io_schd_rqmt_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_dec_place", "base_dec_place"),
				MCItemDef.create("base_unit_conv_rnd_typ", "base_unit_conv_rnd_typ"),
				MCItemDef.create("std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("cont_fctr_rnd_typ", "cont_fctr_rnd_typ"),
				MCItemDef.create("cont_fctr_dec_place", "cont_fctr_dec_place"),
				MCItemDef.create("cont_inpt_qty", "cont_inpt_qty"),
				MCItemDef.create("cont_rqmt_qty", "cont_rqmt_qty"),
				MCItemDef.create("cont_fxd_rqmt_qty", "cont_fxd_rqmt_qty"),
				MCItemDef.create("sum_cont_rqmt_qty", "sum_cont_rqmt_qty"),
				MCItemDef.create("cont_fctr_unit_cd", "cont_fctr_unit_cd"),
				MCItemDef.create("cont_fctr_unit_nm", "cont_fctr_unit_nm"),
				MCItemDef.create("inpt_schd_dt", "inpt_schd_dt"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("inpt_loc_cd", "inpt_loc_cd"),
				MCItemDef.create("inpt_loc_nm", "inpt_loc_nm"),
				MCItemDef.create("inpt_str_ln_tgt_flg", "inpt_str_ln_tgt_flg"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("inst_lot_fix_flg", "inst_lot_fix_flg"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("bom_id", "bom_id"),
				MCItemDef.create("itm_seq", "itm_seq"),
				MCItemDef.create("bkf_typ", "bkf_typ"),
				MCItemDef.create("bkf_typ_nm", "bkf_typ_nm"),
				MCItemDef.create("main_itm_flg", "main_itm_flg"),
				MCItemDef.create("bom_memo1", "bom_memo1"),
				MCItemDef.create("bom_memo2", "bom_memo2"),
				MCItemDef.create("bom_memo3", "bom_memo3"),
				MCItemDef.create("alloc_ctl_typ", "alloc_ctl_typ"),
				MCItemDef.create("inpt_ctl_typ", "inpt_ctl_typ"),
				MCItemDef.create("in_offst_typ", "in_offst_typ"),
				MCItemDef.create("in_offst", "in_offst"),
				MCItemDef.create("lot_mix_flg", "lot_mix_flg"),
				MCItemDef.create("sublot_mix_flg", "sublot_mix_flg"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("prov_upri", "prov_upri"),
				MCItemDef.create("prov_cur_cd", "prov_cur_cd"),
				MCItemDef.create("alt_itm_typ", "alt_itm_typ"),
				MCItemDef.create("alt_alloc_prio", "alt_alloc_prio"),
				MCItemDef.create("alt_itm_ratio", "alt_itm_ratio"),
				MCItemDef.create("par_inst_qty", "par_inst_qty"),
				MCItemDef.create("chd_inpt_qty", "chd_inpt_qty"),
				MCItemDef.create("chd_rqmt_qty", "chd_rqmt_qty"),
				MCItemDef.create("fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty"),
				MCItemDef.create("yield_calc_flg", "yield_calc_flg"),
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
				MCItemDef.create("ver_flg", "ver_flg"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("inpt_str_ln_cd", "inpt_str_ln_cd"),
				MCItemDef.create("inpt_str_ln_nm", "inpt_str_ln_nm"),
				MCItemDef.create("inpt_str_ln_cd_none_flg", "inpt_str_ln_cd_none_flg"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("re_exp_flg", "re_exp_flg")
			}
			,
			MCBlockDef.create("ReExp_Sprt01_RsltInpt")
		);
	}
	public static MCContainerDef MS_MSBCL6020_ReExp_Sprt01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL6020", "ReExp_Sprt01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("th_image", "th_image"),
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
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_dec_place", "trd_dec_place"),
				MCItemDef.create("trd_unit_conv_rnd_typ", "trd_unit_conv_rnd_typ"),
				MCItemDef.create("conv_base_qty", "conv_base_qty"),
				MCItemDef.create("conv_qty", "conv_qty"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_dec_place", "base_dec_place"),
				MCItemDef.create("base_unit_conv_rnd_typ", "base_unit_conv_rnd_typ"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_loc_nm", "strg_loc_nm"),
				MCItemDef.create("strg_str_ln_tgt_flg", "strg_str_ln_tgt_flg"),
				MCItemDef.create("yield_schd_dt", "yield_schd_dt"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("bkf_typ", "bkf_typ"),
				MCItemDef.create("par_inst_qty", "par_inst_qty"),
				MCItemDef.create("chd_inpt_qty", "chd_inpt_qty"),
				MCItemDef.create("chd_rqmt_qty", "chd_rqmt_qty"),
				MCItemDef.create("fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("strg_str_ln_nm", "strg_str_ln_nm"),
				MCItemDef.create("strg_str_ln_cd_none_flg", "strg_str_ln_cd_none_flg"),
				MCItemDef.create("re_exp_flg", "re_exp_flg")
			}
			,
			MCBlockDef.create("ReExp_Sprt01_RsltByProd")
		);
	}
	
	static final MCOperationInfo MS_MSBCL6020_ReExp_Sprt02_INFO = new MCOperationInfo("MS", "MSBCL6020", "ReExp_Sprt02", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6020_ReExp_Sprt02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6020", "ReExp_Sprt02",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("mfg_st_schd_dt", "mfg_st_schd_dt"),
				MCItemDef.create("oper_inst_qty", "oper_inst_qty")
			}
			,
			MCBlockDef.create("ReExp_Sprt02_Hdr")
		);
	}

	public static MCContainerDef MS_MSBCL6020_ReExp_Sprt02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL6020", "ReExp_Sprt02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("wk_schd_no", "wk_schd_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("mst_wk_cost", "mst_wk_cost"),
				MCItemDef.create("mst_fxd_wk_cost", "mst_fxd_wk_cost"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_seq", "oper_seq")
			}
			,
			MCBlockDef.create("ReExp_Sprt02_DtlWk")
		);
	}


	public static MCContainerDef MS_MSBCL6020_ReExp_Sprt02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6020", "ReExp_Sprt02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("wk_schd_no", "wk_schd_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("wk_cost_nm", "wk_cost_nm"),
				MCItemDef.create("wk_cost", "wk_cost"),
				MCItemDef.create("fxd_wk_cost", "fxd_wk_cost"),
				MCItemDef.create("sum_wk_cost", "sum_wk_cost"),
				MCItemDef.create("wk_cost_unit_nm", "wk_cost_unit_nm"),
				MCItemDef.create("wk_cost_calc_flg", "wk_cost_calc_flg"),
				MCItemDef.create("mst_wk_cost", "mst_wk_cost"),
				MCItemDef.create("mst_fxd_wk_cost", "mst_fxd_wk_cost"),
				MCItemDef.create("base_qty", "base_qty"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("rnd_typ", "rnd_typ"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("re_exp_flg", "re_exp_flg")
			}
			,
			MCBlockDef.create("ReExp_Sprt02_RsltWk")
		);
	}
	
	static final MCOperationInfo MS_MSBCL6020_ReExp_Sprt03_INFO = new MCOperationInfo("MS", "MSBCL6020", "ReExp_Sprt03", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6020_ReExp_Sprt03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6020", "ReExp_Sprt03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("mfg_inst_qty", "mfg_inst_qty"),
				MCItemDef.create("yield_schd_qty", "yield_schd_qty"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("strg_str_ln_nm", "strg_str_ln_nm"),
				MCItemDef.create("strg_str_ln_cd_none_flg", "strg_str_ln_cd_none_flg")
			}
			,
			MCBlockDef.create("ReExp_Sprt03_Hdr")
		);
	}

	public static MCContainerDef MS_MSBCL6020_ReExp_Sprt03_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL6020", "ReExp_Sprt03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("end_schd_dt", "end_schd_dt"),
				MCItemDef.create("oper_inst_qty", "oper_inst_qty"),
				MCItemDef.create("yield_oper_flg", "yield_oper_flg"),
				MCItemDef.create("yield_oper_ratio", "yield_oper_ratio")
			}
			,
			MCBlockDef.create("ReExp_Sprt03_DtlOper")
		);
	}

	public static MCContainerDef MS_MSBCL6020_ReExp_Sprt03_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBCL6020", "ReExp_Sprt03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("yield_schd_dt", "yield_schd_dt"),
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no")
			}
			,
			MCBlockDef.create("ReExp_Sprt03_DtlYield")
		);
	}


	public static MCContainerDef MS_MSBCL6020_ReExp_Sprt03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6020", "ReExp_Sprt03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_dec_place", "trd_dec_place"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_dec_place", "base_dec_place"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_conv_rnd_typ", "base_unit_conv_rnd_typ"),
				MCItemDef.create("conv_base_qty", "conv_base_qty"),
				MCItemDef.create("conv_qty", "conv_qty"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_loc_nm", "strg_loc_nm"),
				MCItemDef.create("strg_str_ln_tgt_flg", "strg_str_ln_tgt_flg"),
				MCItemDef.create("strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("strg_str_ln_nm", "strg_str_ln_nm"),
				MCItemDef.create("strg_str_ln_cd_none_flg", "strg_str_ln_cd_none_flg"),
				MCItemDef.create("yield_schd_dt", "yield_schd_dt"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no")
			}
			,
			MCBlockDef.create("ReExp_Sprt03_RsltYield")
		);
	}
	
	static final MCOperationInfo MS_MSBCL6020_ReExp_Sprt04_INFO = new MCOperationInfo("MS", "MSBCL6020", "ReExp_Sprt04", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6020_ReExp_Sprt04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6020", "ReExp_Sprt04",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("yield_schd_qty", "yield_schd_qty"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("mfg_st_schd_dt", "mfg_st_schd_dt"),
				MCItemDef.create("strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("strg_str_ln_nm", "strg_str_ln_nm"),
				MCItemDef.create("strg_str_ln_cd_none_flg", "strg_str_ln_cd_none_flg")
			}
			,
			MCBlockDef.create("ReExp_Sprt04_Hdr")
		);
	}

	public static MCContainerDef MS_MSBCL6020_ReExp_Sprt04_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL6020", "ReExp_Sprt04",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("oper_loc_cd", "oper_loc_cd"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("oper_inst_qty", "oper_inst_qty"),
				MCItemDef.create("st_schd_tm", "st_schd_tm"),
				MCItemDef.create("end_schd_tm", "end_schd_tm"),
				MCItemDef.create("yield_oper_flg", "yield_oper_flg"),
				MCItemDef.create("yield_oper_ratio", "yield_oper_ratio"),
				MCItemDef.create("oper_str_ln_cd", "oper_str_ln_cd"),
				MCItemDef.create("oper_str_ln_nm", "oper_str_ln_nm"),
				MCItemDef.create("oper_str_ln_cd_none_flg", "oper_str_ln_cd_none_flg")
			}
			,
			MCBlockDef.create("ReExp_Sprt04_DtlOper")
		);
	}


	public static MCContainerDef MS_MSBCL6020_ReExp_Sprt04_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6020", "ReExp_Sprt04",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_dec_place", "trd_dec_place"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_dec_place", "base_dec_place"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_conv_rnd_typ", "base_unit_conv_rnd_typ"),
				MCItemDef.create("conv_base_qty", "conv_base_qty"),
				MCItemDef.create("conv_qty", "conv_qty"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_loc_nm", "strg_loc_nm"),
				MCItemDef.create("strg_str_ln_tgt_flg", "strg_str_ln_tgt_flg"),
				MCItemDef.create("strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("strg_str_ln_nm", "strg_str_ln_nm"),
				MCItemDef.create("strg_str_ln_cd_none_flg", "strg_str_ln_cd_none_flg"),
				MCItemDef.create("yield_schd_dt", "yield_schd_dt"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no")
			}
			,
			MCBlockDef.create("ReExp_Sprt03_RsltYield")
		);
	}
	public static MCContainerDef MS_MSBCL6020_ReExp_Sprt04_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL6020", "ReExp_Sprt04",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("inpt_schd_no", "inpt_schd_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("alt_grp_cd", "alt_grp_cd"),
				MCItemDef.create("alt_grp_nm", "alt_grp_nm"),
				MCItemDef.create("alt_grp_seq", "alt_grp_seq"),
				MCItemDef.create("alt_qty", "alt_qty"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("th_image", "th_image"),
				MCItemDef.create("inpt_qty", "inpt_qty"),
				MCItemDef.create("rqmt_qty", "rqmt_qty"),
				MCItemDef.create("fxd_rqmt_qty", "fxd_rqmt_qty"),
				MCItemDef.create("total_rqmt_qty", "total_rqmt_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_dec_place", "base_dec_place"),
				MCItemDef.create("base_unit_conv_rnd_typ", "base_unit_conv_rnd_typ"),
				MCItemDef.create("std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("cont_fctr_rnd_typ", "cont_fctr_rnd_typ"),
				MCItemDef.create("cont_fctr_dec_place", "cont_fctr_dec_place"),
				MCItemDef.create("cont_inpt_qty", "cont_inpt_qty"),
				MCItemDef.create("cont_rqmt_qty", "cont_rqmt_qty"),
				MCItemDef.create("cont_fxd_rqmt_qty", "cont_fxd_rqmt_qty"),
				MCItemDef.create("sum_cont_rqmt_qty", "sum_cont_rqmt_qty"),
				MCItemDef.create("cont_fctr_unit_cd", "cont_fctr_unit_cd"),
				MCItemDef.create("cont_fctr_unit_nm", "cont_fctr_unit_nm"),
				MCItemDef.create("inpt_schd_dt", "inpt_schd_dt"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("inpt_loc_cd", "inpt_loc_cd"),
				MCItemDef.create("inpt_loc_nm", "inpt_loc_nm"),
				MCItemDef.create("inpt_str_ln_tgt_flg", "inpt_str_ln_tgt_flg"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("inst_lot_fix_flg", "inst_lot_fix_flg"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("bom_id", "bom_id"),
				MCItemDef.create("itm_seq", "itm_seq"),
				MCItemDef.create("bkf_typ", "bkf_typ"),
				MCItemDef.create("bkf_typ_nm", "bkf_typ_nm"),
				MCItemDef.create("main_itm_flg", "main_itm_flg"),
				MCItemDef.create("bom_memo1", "bom_memo1"),
				MCItemDef.create("bom_memo2", "bom_memo2"),
				MCItemDef.create("bom_memo3", "bom_memo3"),
				MCItemDef.create("alloc_ctl_typ", "alloc_ctl_typ"),
				MCItemDef.create("inpt_ctl_typ", "inpt_ctl_typ"),
				MCItemDef.create("in_offst_typ", "in_offst_typ"),
				MCItemDef.create("in_offst", "in_offst"),
				MCItemDef.create("lot_mix_flg", "lot_mix_flg"),
				MCItemDef.create("sublot_mix_flg", "sublot_mix_flg"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("prov_upri", "prov_upri"),
				MCItemDef.create("prov_cur_cd", "prov_cur_cd"),
				MCItemDef.create("alt_itm_typ", "alt_itm_typ"),
				MCItemDef.create("alt_alloc_prio", "alt_alloc_prio"),
				MCItemDef.create("alt_itm_ratio", "alt_itm_ratio"),
				MCItemDef.create("par_inst_qty", "par_inst_qty"),
				MCItemDef.create("chd_inpt_qty", "chd_inpt_qty"),
				MCItemDef.create("chd_rqmt_qty", "chd_rqmt_qty"),
				MCItemDef.create("fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty"),
				MCItemDef.create("yield_calc_flg", "yield_calc_flg"),
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
				MCItemDef.create("ver_flg", "ver_flg"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("inpt_str_ln_cd", "inpt_str_ln_cd"),
				MCItemDef.create("inpt_str_ln_nm", "inpt_str_ln_nm"),
				MCItemDef.create("inpt_str_ln_cd_none_flg", "inpt_str_ln_cd_none_flg"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ")
			}
			,
			MCBlockDef.create("ReExp_Sprt01_RsltInpt")
		);
	}
	public static MCContainerDef MS_MSBCL6020_ReExp_Sprt04_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBCL6020", "ReExp_Sprt04",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("th_image", "th_image"),
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
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_dec_place", "trd_dec_place"),
				MCItemDef.create("trd_unit_conv_rnd_typ", "trd_unit_conv_rnd_typ"),
				MCItemDef.create("conv_base_qty", "conv_base_qty"),
				MCItemDef.create("conv_qty", "conv_qty"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_dec_place", "base_dec_place"),
				MCItemDef.create("base_unit_conv_rnd_typ", "base_unit_conv_rnd_typ"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_loc_nm", "strg_loc_nm"),
				MCItemDef.create("strg_str_ln_tgt_flg", "strg_str_ln_tgt_flg"),
				MCItemDef.create("yield_schd_dt", "yield_schd_dt"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("bkf_typ", "bkf_typ"),
				MCItemDef.create("par_inst_qty", "par_inst_qty"),
				MCItemDef.create("chd_inpt_qty", "chd_inpt_qty"),
				MCItemDef.create("chd_rqmt_qty", "chd_rqmt_qty"),
				MCItemDef.create("fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("strg_str_ln_nm", "strg_str_ln_nm"),
				MCItemDef.create("strg_str_ln_cd_none_flg", "strg_str_ln_cd_none_flg")
			}
			,
			MCBlockDef.create("ReExp_Sprt01_RsltByProd")
		);
	}
	public static MCContainerDef MS_MSBCL6020_ReExp_Sprt04_DOWN_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBCL6020", "ReExp_Sprt04",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("wk_schd_no", "wk_schd_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("wk_cost_nm", "wk_cost_nm"),
				MCItemDef.create("wk_cost", "wk_cost"),
				MCItemDef.create("fxd_wk_cost", "fxd_wk_cost"),
				MCItemDef.create("sum_wk_cost", "sum_wk_cost"),
				MCItemDef.create("wk_cost_unit_nm", "wk_cost_unit_nm"),
				MCItemDef.create("wk_cost_calc_flg", "wk_cost_calc_flg"),
				MCItemDef.create("mst_wk_cost", "mst_wk_cost"),
				MCItemDef.create("mst_fxd_wk_cost", "mst_fxd_wk_cost"),
				MCItemDef.create("base_qty", "base_qty"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("rnd_typ", "rnd_typ"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("re_exp_flg", "re_exp_flg")
			}
			,
			MCBlockDef.create("ReExp_Sprt02_RsltWk")
		);
	}
	
	static final MCOperationInfo MS_MSBCL6020_ReExp_Sprt05_INFO = new MCOperationInfo("MS", "MSBCL6020", "ReExp_Sprt05", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6020_ReExp_Sprt05_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6020", "ReExp_Sprt05",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("mfg_inst_qty", "mfg_inst_qty"),
				MCItemDef.create("yield_schd_qty", "yield_schd_qty"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("itm_ord_typ", "itm_ord_typ"),
				MCItemDef.create("mfg_st_schd_dt", "mfg_st_schd_dt"),
				MCItemDef.create("mfg_end_schd_dt", "mfg_end_schd_dt"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("not_bom_exp_flg", "not_bom_exp_flg"),
				MCItemDef.create("not_wk_exp_flg", "not_wk_exp_flg"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("master_dt", "master_dt"),
				MCItemDef.create("mfg_str_ln_cd", "mfg_str_ln_cd"),
				MCItemDef.create("mfg_str_ln_nm", "mfg_str_ln_nm"),
				MCItemDef.create("mfg_str_ln_cd_none_flg", "mfg_str_ln_cd_none_flg"),
				MCItemDef.create("strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("strg_str_ln_nm", "strg_str_ln_nm"),
				MCItemDef.create("strg_str_ln_cd_none_flg", "strg_str_ln_cd_none_flg")
			}
			,
			MCBlockDef.create("ReExp_Sprt05_Hdr")
		);
	}

	public static MCContainerDef MS_MSBCL6020_ReExp_Sprt05_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL6020", "ReExp_Sprt05",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("yield_oper_flg", "yield_oper_flg"),
				MCItemDef.create("st_schd_tm", "st_schd_tm"),
				MCItemDef.create("end_schd_tm", "end_schd_tm"),
				MCItemDef.create("oper_loc_cd", "oper_loc_cd"),
				MCItemDef.create("oper_str_ln_cd", "oper_str_ln_cd"),
				MCItemDef.create("oper_str_ln_nm", "oper_str_ln_nm"),
				MCItemDef.create("oper_str_ln_cd_none_flg", "oper_str_ln_cd_none_flg"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("oper_std_qty", "oper_std_qty"),
				MCItemDef.create("oper_conv_qty", "oper_conv_qty"),
				MCItemDef.create("oper_lt", "oper_lt"),
				MCItemDef.create("oper_lt_add_qty", "oper_lt_add_qty"),
				MCItemDef.create("oper_offst_typ", "oper_offst_typ"),
				MCItemDef.create("oper_offst", "oper_offst"),
				MCItemDef.create("oper_offst_add_qty", "oper_offst_add_qty"),
				MCItemDef.create("yield_oper_ratio", "yield_oper_ratio"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no")
			}
			,
			MCBlockDef.create("ReExp_Sprt05_DtlOper")
		);
	}

	public static MCContainerDef MS_MSBCL6020_ReExp_Sprt05_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBCL6020", "ReExp_Sprt05",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("yield_schd_dt", "yield_schd_dt"),
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no")
			}
			,
			MCBlockDef.create("ReExp_Sprt03_DtlYield")
		);
	}

	public static MCContainerDef MS_MSBCL6020_ReExp_Sprt05_UP_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBCL6020", "ReExp_Sprt05",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("inpt_schd_no", "inpt_schd_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("alt_grp_cd", "alt_grp_cd"),
				MCItemDef.create("alt_grp_seq", "alt_grp_seq"),
				MCItemDef.create("alt_qty", "alt_qty"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("inpt_qty", "inpt_qty"),
				MCItemDef.create("rqmt_qty", "rqmt_qty"),
				MCItemDef.create("fxd_rqmt_qty", "fxd_rqmt_qty"),
				MCItemDef.create("total_rqmt_qty", "total_rqmt_qty"),
				MCItemDef.create("cont_inpt_qty", "cont_inpt_qty"),
				MCItemDef.create("cont_rqmt_qty", "cont_rqmt_qty"),
				MCItemDef.create("cont_fxd_rqmt_qty", "cont_fxd_rqmt_qty"),
				MCItemDef.create("sum_cont_rqmt_qty", "sum_cont_rqmt_qty"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("itm_seq", "itm_seq"),
				MCItemDef.create("in_offst_typ", "in_offst_typ"),
				MCItemDef.create("in_offst", "in_offst"),
				MCItemDef.create("par_inst_qty", "par_inst_qty"),
				MCItemDef.create("chd_inpt_qty", "chd_inpt_qty"),
				MCItemDef.create("chd_rqmt_qty", "chd_rqmt_qty"),
				MCItemDef.create("fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("alloc_flg", "alloc_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("first_gr_dt", "first_gr_dt"),
				MCItemDef.create("lot_seq", "lot_seq")
			}
			,
			MCBlockDef.create("ReExp_Sprt01_DtlInpt")
		);
	}

	public static MCContainerDef MS_MSBCL6020_ReExp_Sprt05_UP_BLOCK4() {

		return new MCGeneralContainerDef("MS", "MSBCL6020", "ReExp_Sprt05",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("par_inst_qty", "par_inst_qty"),
				MCItemDef.create("chd_inpt_qty", "chd_inpt_qty"),
				MCItemDef.create("chd_rqmt_qty", "chd_rqmt_qty"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_seq", "oper_seq")
			}
			,
			MCBlockDef.create("ReExp_Sprt01_DtlByProd")
		);
	}

	public static MCContainerDef MS_MSBCL6020_ReExp_Sprt05_UP_BLOCK5() {

		return new MCGeneralContainerDef("MS", "MSBCL6020", "ReExp_Sprt05",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("wk_schd_no", "wk_schd_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("mst_wk_cost", "mst_wk_cost"),
				MCItemDef.create("mst_fxd_wk_cost", "mst_fxd_wk_cost"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_seq", "oper_seq")
			}
			,
			MCBlockDef.create("ReExp_Sprt02_DtlWk")
		);
	}


	public static MCContainerDef MS_MSBCL6020_ReExp_Sprt05_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6020", "ReExp_Sprt05",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("oper_unit_qty", "oper_unit_qty"),
				MCItemDef.create("oper_unit_cd", "oper_unit_cd"),
				MCItemDef.create("oper_unit_nm", "oper_unit_nm"),
				MCItemDef.create("yield_oper_flg", "yield_oper_flg"),
				MCItemDef.create("st_schd_tm", "st_schd_tm"),
				MCItemDef.create("end_schd_tm", "end_schd_tm"),
				MCItemDef.create("oper_loc_cd", "oper_loc_cd"),
				MCItemDef.create("oper_loc_nm", "oper_loc_nm"),
				MCItemDef.create("oper_str_ln_tgt_flg", "oper_str_ln_tgt_flg"),
				MCItemDef.create("oper_str_ln_cd", "oper_str_ln_cd"),
				MCItemDef.create("oper_str_ln_nm", "oper_str_ln_nm"),
				MCItemDef.create("oper_str_ln_cd_none_flg", "oper_str_ln_cd_none_flg"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("bkf_flg", "bkf_flg"),
				MCItemDef.create("wk_cost_calc_flg", "wk_cost_calc_flg"),
				MCItemDef.create("oper_inst_grp", "oper_inst_grp"),
				MCItemDef.create("wip_rate", "wip_rate"),
				MCItemDef.create("oper_std_qty", "oper_std_qty"),
				MCItemDef.create("oper_conv_qty", "oper_conv_qty"),
				MCItemDef.create("oper_lower_yield", "oper_lower_yield"),
				MCItemDef.create("oper_std_yield", "oper_std_yield"),
				MCItemDef.create("oper_upper_yield", "oper_upper_yield"),
				MCItemDef.create("oper_lt", "oper_lt"),
				MCItemDef.create("oper_lt_add_qty", "oper_lt_add_qty"),
				MCItemDef.create("oper_offst_typ", "oper_offst_typ"),
				MCItemDef.create("oper_offst", "oper_offst"),
				MCItemDef.create("oper_offst_add_qty", "oper_offst_add_qty"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("unit_conv_rnd_typ", "unit_conv_rnd_typ"),
				MCItemDef.create("yield_oper_ratio", "yield_oper_ratio"),
				MCItemDef.create("oper_ord_no", "oper_ord_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("lmt_fr_dt_flg", "lmt_fr_dt_flg"),
				MCItemDef.create("upd_flg", "upd_flg")
			}
			,
			MCBlockDef.create("ReExp_Sprt05_RsltOper")
		);
	}
	public static MCContainerDef MS_MSBCL6020_ReExp_Sprt05_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL6020", "ReExp_Sprt05",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_dec_place", "trd_dec_place"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_dec_place", "base_dec_place"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_conv_rnd_typ", "base_unit_conv_rnd_typ"),
				MCItemDef.create("conv_base_qty", "conv_base_qty"),
				MCItemDef.create("conv_qty", "conv_qty"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_loc_nm", "strg_loc_nm"),
				MCItemDef.create("strg_str_ln_tgt_flg", "strg_str_ln_tgt_flg"),
				MCItemDef.create("strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("strg_str_ln_nm", "strg_str_ln_nm"),
				MCItemDef.create("strg_str_ln_cd_none_flg", "strg_str_ln_cd_none_flg"),
				MCItemDef.create("yield_schd_dt", "yield_schd_dt"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no")
			}
			,
			MCBlockDef.create("ReExp_Sprt03_RsltYield")
		);
	}
	public static MCContainerDef MS_MSBCL6020_ReExp_Sprt05_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBCL6020", "ReExp_Sprt05",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("inpt_schd_no", "inpt_schd_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("alt_grp_cd", "alt_grp_cd"),
				MCItemDef.create("alt_grp_nm", "alt_grp_nm"),
				MCItemDef.create("alt_grp_seq", "alt_grp_seq"),
				MCItemDef.create("alt_qty", "alt_qty"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("th_image", "th_image"),
				MCItemDef.create("inpt_qty", "inpt_qty"),
				MCItemDef.create("rqmt_qty", "rqmt_qty"),
				MCItemDef.create("fxd_rqmt_qty", "fxd_rqmt_qty"),
				MCItemDef.create("total_rqmt_qty", "total_rqmt_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_dec_place", "base_dec_place"),
				MCItemDef.create("base_unit_conv_rnd_typ", "base_unit_conv_rnd_typ"),
				MCItemDef.create("std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("cont_fctr_rnd_typ", "cont_fctr_rnd_typ"),
				MCItemDef.create("cont_fctr_dec_place", "cont_fctr_dec_place"),
				MCItemDef.create("cont_inpt_qty", "cont_inpt_qty"),
				MCItemDef.create("cont_rqmt_qty", "cont_rqmt_qty"),
				MCItemDef.create("cont_fxd_rqmt_qty", "cont_fxd_rqmt_qty"),
				MCItemDef.create("sum_cont_rqmt_qty", "sum_cont_rqmt_qty"),
				MCItemDef.create("cont_fctr_unit_cd", "cont_fctr_unit_cd"),
				MCItemDef.create("cont_fctr_unit_nm", "cont_fctr_unit_nm"),
				MCItemDef.create("inpt_schd_dt", "inpt_schd_dt"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("inpt_loc_cd", "inpt_loc_cd"),
				MCItemDef.create("inpt_loc_nm", "inpt_loc_nm"),
				MCItemDef.create("inpt_str_ln_tgt_flg", "inpt_str_ln_tgt_flg"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("inst_lot_fix_flg", "inst_lot_fix_flg"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("bom_id", "bom_id"),
				MCItemDef.create("itm_seq", "itm_seq"),
				MCItemDef.create("bkf_typ", "bkf_typ"),
				MCItemDef.create("bkf_typ_nm", "bkf_typ_nm"),
				MCItemDef.create("main_itm_flg", "main_itm_flg"),
				MCItemDef.create("bom_memo1", "bom_memo1"),
				MCItemDef.create("bom_memo2", "bom_memo2"),
				MCItemDef.create("bom_memo3", "bom_memo3"),
				MCItemDef.create("alloc_ctl_typ", "alloc_ctl_typ"),
				MCItemDef.create("inpt_ctl_typ", "inpt_ctl_typ"),
				MCItemDef.create("in_offst_typ", "in_offst_typ"),
				MCItemDef.create("in_offst", "in_offst"),
				MCItemDef.create("lot_mix_flg", "lot_mix_flg"),
				MCItemDef.create("sublot_mix_flg", "sublot_mix_flg"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("prov_upri", "prov_upri"),
				MCItemDef.create("prov_cur_cd", "prov_cur_cd"),
				MCItemDef.create("alt_itm_typ", "alt_itm_typ"),
				MCItemDef.create("alt_alloc_prio", "alt_alloc_prio"),
				MCItemDef.create("alt_itm_ratio", "alt_itm_ratio"),
				MCItemDef.create("par_inst_qty", "par_inst_qty"),
				MCItemDef.create("chd_inpt_qty", "chd_inpt_qty"),
				MCItemDef.create("chd_rqmt_qty", "chd_rqmt_qty"),
				MCItemDef.create("fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty"),
				MCItemDef.create("yield_calc_flg", "yield_calc_flg"),
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
				MCItemDef.create("ver_flg", "ver_flg"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("inpt_str_ln_cd", "inpt_str_ln_cd"),
				MCItemDef.create("inpt_str_ln_nm", "inpt_str_ln_nm"),
				MCItemDef.create("inpt_str_ln_cd_none_flg", "inpt_str_ln_cd_none_flg"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("re_exp_flg", "re_exp_flg")
			}
			,
			MCBlockDef.create("ReExp_Sprt01_RsltInpt")
		);
	}
	public static MCContainerDef MS_MSBCL6020_ReExp_Sprt05_DOWN_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBCL6020", "ReExp_Sprt05",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("th_image", "th_image"),
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
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_dec_place", "trd_dec_place"),
				MCItemDef.create("trd_unit_conv_rnd_typ", "trd_unit_conv_rnd_typ"),
				MCItemDef.create("conv_base_qty", "conv_base_qty"),
				MCItemDef.create("conv_qty", "conv_qty"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_dec_place", "base_dec_place"),
				MCItemDef.create("base_unit_conv_rnd_typ", "base_unit_conv_rnd_typ"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_loc_nm", "strg_loc_nm"),
				MCItemDef.create("strg_str_ln_tgt_flg", "strg_str_ln_tgt_flg"),
				MCItemDef.create("yield_schd_dt", "yield_schd_dt"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("bkf_typ", "bkf_typ"),
				MCItemDef.create("par_inst_qty", "par_inst_qty"),
				MCItemDef.create("chd_inpt_qty", "chd_inpt_qty"),
				MCItemDef.create("chd_rqmt_qty", "chd_rqmt_qty"),
				MCItemDef.create("fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("strg_str_ln_nm", "strg_str_ln_nm"),
				MCItemDef.create("strg_str_ln_cd_none_flg", "strg_str_ln_cd_none_flg"),
				MCItemDef.create("re_exp_flg", "re_exp_flg")
			}
			,
			MCBlockDef.create("ReExp_Sprt01_RsltByProd")
		);
	}
	public static MCContainerDef MS_MSBCL6020_ReExp_Sprt05_DOWN_BLOCK4() {

		return new MCGeneralContainerDef("MS", "MSBCL6020", "ReExp_Sprt05",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("wk_schd_no", "wk_schd_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("wk_cost_nm", "wk_cost_nm"),
				MCItemDef.create("wk_cost", "wk_cost"),
				MCItemDef.create("fxd_wk_cost", "fxd_wk_cost"),
				MCItemDef.create("sum_wk_cost", "sum_wk_cost"),
				MCItemDef.create("wk_cost_unit_nm", "wk_cost_unit_nm"),
				MCItemDef.create("wk_cost_calc_flg", "wk_cost_calc_flg"),
				MCItemDef.create("mst_wk_cost", "mst_wk_cost"),
				MCItemDef.create("mst_fxd_wk_cost", "mst_fxd_wk_cost"),
				MCItemDef.create("base_qty", "base_qty"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("rnd_typ", "rnd_typ"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("re_exp_flg", "re_exp_flg")
			}
			,
			MCBlockDef.create("ReExp_Sprt02_RsltWk")
		);
	}
	
	static final MCOperationInfo MS_MSBCL6020_ReExp_Sprt06_INFO = new MCOperationInfo("MS", "MSBCL6020", "ReExp_Sprt06", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6020_ReExp_Sprt06_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6020", "ReExp_Sprt06",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("mfg_inst_qty", "mfg_inst_qty"),
				MCItemDef.create("yield_schd_qty", "yield_schd_qty"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("itm_ord_typ", "itm_ord_typ"),
				MCItemDef.create("mfg_st_schd_dt", "mfg_st_schd_dt"),
				MCItemDef.create("strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("strg_str_ln_nm", "strg_str_ln_nm"),
				MCItemDef.create("strg_str_ln_cd_none_flg", "strg_str_ln_cd_none_flg"),
				MCItemDef.create("exp_yield_flg", "exp_yield_flg")
			}
			,
			MCBlockDef.create("ReExp_Sprt06_Hdr")
		);
	}

	public static MCContainerDef MS_MSBCL6020_ReExp_Sprt06_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL6020", "ReExp_Sprt06",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("tgt_oper_flg", "tgt_oper_flg"),
				MCItemDef.create("oper_ord_no", "oper_ord_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("oper_loc_cd", "oper_loc_cd"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("oper_inst_qty", "oper_inst_qty"),
				MCItemDef.create("st_schd_tm", "st_schd_tm"),
				MCItemDef.create("end_schd_tm", "end_schd_tm"),
				MCItemDef.create("yield_oper_flg", "yield_oper_flg"),
				MCItemDef.create("yield_oper_ratio", "yield_oper_ratio"),
				MCItemDef.create("oper_str_ln_cd", "oper_str_ln_cd"),
				MCItemDef.create("oper_str_ln_nm", "oper_str_ln_nm"),
				MCItemDef.create("oper_str_ln_cd_none_flg", "oper_str_ln_cd_none_flg")
			}
			,
			MCBlockDef.create("ReExp_Sprt06_DtlOper")
		);
	}

	public static MCContainerDef MS_MSBCL6020_ReExp_Sprt06_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBCL6020", "ReExp_Sprt06",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("yield_schd_dt", "yield_schd_dt"),
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no")
			}
			,
			MCBlockDef.create("ReExp_Sprt03_DtlYield")
		);
	}

	public static MCContainerDef MS_MSBCL6020_ReExp_Sprt06_UP_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBCL6020", "ReExp_Sprt06",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("inpt_schd_no", "inpt_schd_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("alt_grp_cd", "alt_grp_cd"),
				MCItemDef.create("alt_grp_seq", "alt_grp_seq"),
				MCItemDef.create("alt_qty", "alt_qty"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("inpt_qty", "inpt_qty"),
				MCItemDef.create("rqmt_qty", "rqmt_qty"),
				MCItemDef.create("fxd_rqmt_qty", "fxd_rqmt_qty"),
				MCItemDef.create("total_rqmt_qty", "total_rqmt_qty"),
				MCItemDef.create("cont_inpt_qty", "cont_inpt_qty"),
				MCItemDef.create("cont_rqmt_qty", "cont_rqmt_qty"),
				MCItemDef.create("cont_fxd_rqmt_qty", "cont_fxd_rqmt_qty"),
				MCItemDef.create("sum_cont_rqmt_qty", "sum_cont_rqmt_qty"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("itm_seq", "itm_seq"),
				MCItemDef.create("in_offst_typ", "in_offst_typ"),
				MCItemDef.create("in_offst", "in_offst"),
				MCItemDef.create("par_inst_qty", "par_inst_qty"),
				MCItemDef.create("chd_inpt_qty", "chd_inpt_qty"),
				MCItemDef.create("chd_rqmt_qty", "chd_rqmt_qty"),
				MCItemDef.create("fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("alloc_flg", "alloc_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("first_gr_dt", "first_gr_dt"),
				MCItemDef.create("lot_seq", "lot_seq")
			}
			,
			MCBlockDef.create("ReExp_Sprt01_DtlInpt")
		);
	}

	public static MCContainerDef MS_MSBCL6020_ReExp_Sprt06_UP_BLOCK4() {

		return new MCGeneralContainerDef("MS", "MSBCL6020", "ReExp_Sprt06",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("par_inst_qty", "par_inst_qty"),
				MCItemDef.create("chd_inpt_qty", "chd_inpt_qty"),
				MCItemDef.create("chd_rqmt_qty", "chd_rqmt_qty"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_seq", "oper_seq")
			}
			,
			MCBlockDef.create("ReExp_Sprt01_DtlByProd")
		);
	}

	public static MCContainerDef MS_MSBCL6020_ReExp_Sprt06_UP_BLOCK5() {

		return new MCGeneralContainerDef("MS", "MSBCL6020", "ReExp_Sprt06",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("wk_schd_no", "wk_schd_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("mst_wk_cost", "mst_wk_cost"),
				MCItemDef.create("mst_fxd_wk_cost", "mst_fxd_wk_cost"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_seq", "oper_seq")
			}
			,
			MCBlockDef.create("ReExp_Sprt02_DtlWk")
		);
	}


	public static MCContainerDef MS_MSBCL6020_ReExp_Sprt06_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6020", "ReExp_Sprt06",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_dec_place", "trd_dec_place"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_dec_place", "base_dec_place"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_conv_rnd_typ", "base_unit_conv_rnd_typ"),
				MCItemDef.create("conv_base_qty", "conv_base_qty"),
				MCItemDef.create("conv_qty", "conv_qty"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_loc_nm", "strg_loc_nm"),
				MCItemDef.create("strg_str_ln_tgt_flg", "strg_str_ln_tgt_flg"),
				MCItemDef.create("strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("strg_str_ln_nm", "strg_str_ln_nm"),
				MCItemDef.create("strg_str_ln_cd_none_flg", "strg_str_ln_cd_none_flg"),
				MCItemDef.create("yield_schd_dt", "yield_schd_dt"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no")
			}
			,
			MCBlockDef.create("ReExp_Sprt03_RsltYield")
		);
	}
	public static MCContainerDef MS_MSBCL6020_ReExp_Sprt06_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL6020", "ReExp_Sprt06",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("inpt_schd_no", "inpt_schd_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("alt_grp_cd", "alt_grp_cd"),
				MCItemDef.create("alt_grp_nm", "alt_grp_nm"),
				MCItemDef.create("alt_grp_seq", "alt_grp_seq"),
				MCItemDef.create("alt_qty", "alt_qty"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("th_image", "th_image"),
				MCItemDef.create("inpt_qty", "inpt_qty"),
				MCItemDef.create("rqmt_qty", "rqmt_qty"),
				MCItemDef.create("fxd_rqmt_qty", "fxd_rqmt_qty"),
				MCItemDef.create("total_rqmt_qty", "total_rqmt_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_dec_place", "base_dec_place"),
				MCItemDef.create("base_unit_conv_rnd_typ", "base_unit_conv_rnd_typ"),
				MCItemDef.create("std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("cont_fctr_rnd_typ", "cont_fctr_rnd_typ"),
				MCItemDef.create("cont_fctr_dec_place", "cont_fctr_dec_place"),
				MCItemDef.create("cont_inpt_qty", "cont_inpt_qty"),
				MCItemDef.create("cont_rqmt_qty", "cont_rqmt_qty"),
				MCItemDef.create("cont_fxd_rqmt_qty", "cont_fxd_rqmt_qty"),
				MCItemDef.create("sum_cont_rqmt_qty", "sum_cont_rqmt_qty"),
				MCItemDef.create("cont_fctr_unit_cd", "cont_fctr_unit_cd"),
				MCItemDef.create("cont_fctr_unit_nm", "cont_fctr_unit_nm"),
				MCItemDef.create("inpt_schd_dt", "inpt_schd_dt"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("inpt_loc_cd", "inpt_loc_cd"),
				MCItemDef.create("inpt_loc_nm", "inpt_loc_nm"),
				MCItemDef.create("inpt_str_ln_tgt_flg", "inpt_str_ln_tgt_flg"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("inst_lot_fix_flg", "inst_lot_fix_flg"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("bom_id", "bom_id"),
				MCItemDef.create("itm_seq", "itm_seq"),
				MCItemDef.create("bkf_typ", "bkf_typ"),
				MCItemDef.create("bkf_typ_nm", "bkf_typ_nm"),
				MCItemDef.create("main_itm_flg", "main_itm_flg"),
				MCItemDef.create("bom_memo1", "bom_memo1"),
				MCItemDef.create("bom_memo2", "bom_memo2"),
				MCItemDef.create("bom_memo3", "bom_memo3"),
				MCItemDef.create("alloc_ctl_typ", "alloc_ctl_typ"),
				MCItemDef.create("inpt_ctl_typ", "inpt_ctl_typ"),
				MCItemDef.create("in_offst_typ", "in_offst_typ"),
				MCItemDef.create("in_offst", "in_offst"),
				MCItemDef.create("lot_mix_flg", "lot_mix_flg"),
				MCItemDef.create("sublot_mix_flg", "sublot_mix_flg"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("prov_upri", "prov_upri"),
				MCItemDef.create("prov_cur_cd", "prov_cur_cd"),
				MCItemDef.create("alt_itm_typ", "alt_itm_typ"),
				MCItemDef.create("alt_alloc_prio", "alt_alloc_prio"),
				MCItemDef.create("alt_itm_ratio", "alt_itm_ratio"),
				MCItemDef.create("par_inst_qty", "par_inst_qty"),
				MCItemDef.create("chd_inpt_qty", "chd_inpt_qty"),
				MCItemDef.create("chd_rqmt_qty", "chd_rqmt_qty"),
				MCItemDef.create("fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty"),
				MCItemDef.create("yield_calc_flg", "yield_calc_flg"),
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
				MCItemDef.create("ver_flg", "ver_flg"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("inpt_str_ln_cd", "inpt_str_ln_cd"),
				MCItemDef.create("inpt_str_ln_nm", "inpt_str_ln_nm"),
				MCItemDef.create("inpt_str_ln_cd_none_flg", "inpt_str_ln_cd_none_flg"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("re_exp_flg", "re_exp_flg")
			}
			,
			MCBlockDef.create("ReExp_Sprt01_RsltInpt")
		);
	}
	public static MCContainerDef MS_MSBCL6020_ReExp_Sprt06_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBCL6020", "ReExp_Sprt06",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("th_image", "th_image"),
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
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_dec_place", "trd_dec_place"),
				MCItemDef.create("trd_unit_conv_rnd_typ", "trd_unit_conv_rnd_typ"),
				MCItemDef.create("conv_base_qty", "conv_base_qty"),
				MCItemDef.create("conv_qty", "conv_qty"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_dec_place", "base_dec_place"),
				MCItemDef.create("base_unit_conv_rnd_typ", "base_unit_conv_rnd_typ"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_loc_nm", "strg_loc_nm"),
				MCItemDef.create("strg_str_ln_tgt_flg", "strg_str_ln_tgt_flg"),
				MCItemDef.create("yield_schd_dt", "yield_schd_dt"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("bkf_typ", "bkf_typ"),
				MCItemDef.create("par_inst_qty", "par_inst_qty"),
				MCItemDef.create("chd_inpt_qty", "chd_inpt_qty"),
				MCItemDef.create("chd_rqmt_qty", "chd_rqmt_qty"),
				MCItemDef.create("fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("strg_str_ln_nm", "strg_str_ln_nm"),
				MCItemDef.create("strg_str_ln_cd_none_flg", "strg_str_ln_cd_none_flg"),
				MCItemDef.create("re_exp_flg", "re_exp_flg")
			}
			,
			MCBlockDef.create("ReExp_Sprt01_RsltByProd")
		);
	}
	public static MCContainerDef MS_MSBCL6020_ReExp_Sprt06_DOWN_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBCL6020", "ReExp_Sprt06",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("wk_schd_no", "wk_schd_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("wk_cost_nm", "wk_cost_nm"),
				MCItemDef.create("wk_cost", "wk_cost"),
				MCItemDef.create("fxd_wk_cost", "fxd_wk_cost"),
				MCItemDef.create("sum_wk_cost", "sum_wk_cost"),
				MCItemDef.create("wk_cost_unit_nm", "wk_cost_unit_nm"),
				MCItemDef.create("wk_cost_calc_flg", "wk_cost_calc_flg"),
				MCItemDef.create("mst_wk_cost", "mst_wk_cost"),
				MCItemDef.create("mst_fxd_wk_cost", "mst_fxd_wk_cost"),
				MCItemDef.create("base_qty", "base_qty"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("rnd_typ", "rnd_typ"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("re_exp_flg", "re_exp_flg")
			}
			,
			MCBlockDef.create("ReExp_Sprt02_RsltWk")
		);
	}
	//FMCB DEF_CLASSES END
}

