package mcframe.serverMSBC.MSBCL6070;

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
 * [MSBCL_MfgReCalcService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBCL6070.MfgReCalc_Sprt02.UP.BLOCK0")){
			return MS_MSBCL6070_MfgReCalc_Sprt02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6070.MfgReCalc_Sprt02.UP.BLOCK1")){
			return MS_MSBCL6070_MfgReCalc_Sprt02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL6070.MfgReCalc_Sprt02.UP.BLOCK2")){
			return MS_MSBCL6070_MfgReCalc_Sprt02_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBCL6070.MfgReCalc_Sprt02.UP.BLOCK3")){
			return MS_MSBCL6070_MfgReCalc_Sprt02_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBCL6070.MfgReCalc_Sprt02.UP.BLOCK4")){
			return MS_MSBCL6070_MfgReCalc_Sprt02_UP_BLOCK4();
		}
		else if (id.equals("MS.MSBCL6070.MfgReCalc_Sprt02.DOWN.BLOCK0")){
			return MS_MSBCL6070_MfgReCalc_Sprt02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6070.MfgReCalc_Sprt02.DOWN.BLOCK1")){
			return MS_MSBCL6070_MfgReCalc_Sprt02_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBCL6070.MfgReCalc_Sprt03.UP.BLOCK0")){
			return MS_MSBCL6070_MfgReCalc_Sprt03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6070.MfgReCalc_Sprt03.UP.BLOCK1")){
			return MS_MSBCL6070_MfgReCalc_Sprt03_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL6070.MfgReCalc_Sprt03.UP.BLOCK2")){
			return MS_MSBCL6070_MfgReCalc_Sprt03_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBCL6070.MfgReCalc_Sprt03.UP.BLOCK3")){
			return MS_MSBCL6070_MfgReCalc_Sprt03_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBCL6070.MfgReCalc_Sprt03.UP.BLOCK4")){
			return MS_MSBCL6070_MfgReCalc_Sprt03_UP_BLOCK4();
		}
		else if (id.equals("MS.MSBCL6070.MfgReCalc_Sprt03.UP.BLOCK5")){
			return MS_MSBCL6070_MfgReCalc_Sprt03_UP_BLOCK5();
		}
		else if (id.equals("MS.MSBCL6070.MfgReCalc_Sprt03.DOWN.BLOCK0")){
			return MS_MSBCL6070_MfgReCalc_Sprt03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6070.MfgReCalc_Sprt03.DOWN.BLOCK1")){
			return MS_MSBCL6070_MfgReCalc_Sprt03_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBCL6070.MfgReCalc_Sprt03.DOWN.BLOCK2")){
			return MS_MSBCL6070_MfgReCalc_Sprt03_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBCL6070.MfgReCalc_Sprt03.DOWN.BLOCK3")){
			return MS_MSBCL6070_MfgReCalc_Sprt03_DOWN_BLOCK3();
		}
		else if (id.equals("MS.MSBCL6070.MfgReCalc_Sprt03.DOWN.BLOCK4")){
			return MS_MSBCL6070_MfgReCalc_Sprt03_DOWN_BLOCK4();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo MS_MSBCL6070_MfgReCalc_Sprt02_INFO = new MCOperationInfo("MS", "MSBCL6070", "MfgReCalc_Sprt02", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6070_MfgReCalc_Sprt02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6070", "MfgReCalc_Sprt02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("arr_purc_auto_reg_flg", "arr_purc_auto_reg_flg"),
				MCItemDef.create("oper_unit_flg", "oper_unit_flg")
			}
			,
			MCBlockDef.create("MfgReCalc_Sprt02_Hdr")
		);
	}

	public static MCContainerDef MS_MSBCL6070_MfgReCalc_Sprt02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL6070", "MfgReCalc_Sprt02",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("st_act_tm", "st_act_tm"),
				MCItemDef.create("oper_act_no", "oper_act_no"),
				MCItemDef.create("base_unit_st_qty", "base_unit_st_qty"),
				MCItemDef.create("base_unit_act_qty", "base_unit_act_qty")
			}
			,
			MCBlockDef.create("MfgReCalc_Sprt02_DtlOper")
		);
	}

	public static MCContainerDef MS_MSBCL6070_MfgReCalc_Sprt02_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBCL6070", "MfgReCalc_Sprt02",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("base_unit_yield_st_qty", "base_unit_yield_st_qty"),
				MCItemDef.create("base_unit_yield_act_qty", "base_unit_yield_act_qty")
			}
			,
			MCBlockDef.create("MfgReCalc_Sprt02_DtlYield")
		);
	}

	public static MCContainerDef MS_MSBCL6070_MfgReCalc_Sprt02_UP_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBCL6070", "MfgReCalc_Sprt02",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("inpt_schd_no", "inpt_schd_no"),
				MCItemDef.create("inpt_act_no", "inpt_act_no"),
				MCItemDef.create("bkf_typ", "bkf_typ"),
				MCItemDef.create("recalc_grp", "recalc_grp"),
				MCItemDef.create("recalc_grp_seq", "recalc_grp_seq"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("first_gr_dt", "first_gr_dt"),
				MCItemDef.create("lot_seq", "lot_seq"),
				MCItemDef.create("inpt_st_qty", "inpt_st_qty"),
				MCItemDef.create("inpt_act_qty", "inpt_act_qty"),
				MCItemDef.create("dec_place", "dec_place")
			}
			,
			MCBlockDef.create("MfgReCalc_Sprt02_DtlInpt")
		);
	}

	public static MCContainerDef MS_MSBCL6070_MfgReCalc_Sprt02_UP_BLOCK4() {

		return new MCGeneralContainerDef("MS", "MSBCL6070", "MfgReCalc_Sprt02",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("wk_schd_no", "wk_schd_no"),
				MCItemDef.create("wk_act_no", "wk_act_no"),
				MCItemDef.create("st_cost", "st_cost"),
				MCItemDef.create("act_cost", "act_cost"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("st_fxd_cost", "st_fxd_cost")
			}
			,
			MCBlockDef.create("MfgReCalc_Sprt02_DtlWk")
		);
	}


	public static MCContainerDef MS_MSBCL6070_MfgReCalc_Sprt02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6070", "MfgReCalc_Sprt02",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("inpt_act_qty", "inpt_act_qty")
			}
			,
			MCBlockDef.create("MfgReCalc_Sprt02_DtlInpt")
		);
	}
	public static MCContainerDef MS_MSBCL6070_MfgReCalc_Sprt02_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL6070", "MfgReCalc_Sprt02",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("act_cost", "act_cost")
			}
			,
			MCBlockDef.create("MfgReCalc_Sprt02_DtlWk")
		);
	}
	
	static final MCOperationInfo MS_MSBCL6070_MfgReCalc_Sprt03_INFO = new MCOperationInfo("MS", "MSBCL6070", "MfgReCalc_Sprt03", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6070_MfgReCalc_Sprt03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6070", "MfgReCalc_Sprt03",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("base_unit_st_qty", "base_unit_st_qty"),
				MCItemDef.create("is_src_mfg_inst_srv_flg", "is_src_mfg_inst_srv_flg")
			}
			,
			MCBlockDef.create("MfgReCalc_Sprt03_Hdr")
		);
	}

	public static MCContainerDef MS_MSBCL6070_MfgReCalc_Sprt03_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL6070", "MfgReCalc_Sprt03",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no")
			}
			,
			MCBlockDef.create("MfgReCalc_Sprt03_DtlOper")
		);
	}

	public static MCContainerDef MS_MSBCL6070_MfgReCalc_Sprt03_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBCL6070", "MfgReCalc_Sprt03",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("yield_schd_no", "yield_schd_no")
			}
			,
			MCBlockDef.create("MfgReCalc_Sprt03_DtlYield")
		);
	}

	public static MCContainerDef MS_MSBCL6070_MfgReCalc_Sprt03_UP_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBCL6070", "MfgReCalc_Sprt03",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("yield_schd_no", "yield_schd_no")
			}
			,
			MCBlockDef.create("MfgReCalc_Sprt03_DtlByProd")
		);
	}

	public static MCContainerDef MS_MSBCL6070_MfgReCalc_Sprt03_UP_BLOCK4() {

		return new MCGeneralContainerDef("MS", "MSBCL6070", "MfgReCalc_Sprt03",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("inpt_schd_no", "inpt_schd_no"),
				MCItemDef.create("recalc_grp", "recalc_grp"),
				MCItemDef.create("recalc_grp_seq", "recalc_grp_seq")
			}
			,
			MCBlockDef.create("MfgReCalc_Sprt03_DtlInpt")
		);
	}

	public static MCContainerDef MS_MSBCL6070_MfgReCalc_Sprt03_UP_BLOCK5() {

		return new MCGeneralContainerDef("MS", "MSBCL6070", "MfgReCalc_Sprt03",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("wk_schd_no", "wk_schd_no")
			}
			,
			MCBlockDef.create("MfgReCalc_Sprt03_DtlWk")
		);
	}


	public static MCContainerDef MS_MSBCL6070_MfgReCalc_Sprt03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6070", "MfgReCalc_Sprt03",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("oper_unit_conv_rnd_typ", "oper_unit_conv_rnd_typ"),
				MCItemDef.create("oper_unit_dec_place", "oper_unit_dec_place"),
				MCItemDef.create("base_unit_st_qty", "base_unit_st_qty"),
				MCItemDef.create("oper_unit_st_qty", "oper_unit_st_qty")
			}
			,
			MCBlockDef.create("MfgReCalc_Sprt03_DtlOper")
		);
	}
	public static MCContainerDef MS_MSBCL6070_MfgReCalc_Sprt03_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL6070", "MfgReCalc_Sprt03",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("trd_unit_yield_st_qty", "trd_unit_yield_st_qty"),
				MCItemDef.create("base_unit_yield_st_qty", "base_unit_yield_st_qty")
			}
			,
			MCBlockDef.create("MfgReCalc_Sprt03_DtlYield")
		);
	}
	public static MCContainerDef MS_MSBCL6070_MfgReCalc_Sprt03_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBCL6070", "MfgReCalc_Sprt03",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("trd_unit_yield_st_qty", "trd_unit_yield_st_qty"),
				MCItemDef.create("base_unit_yield_st_qty", "base_unit_yield_st_qty")
			}
			,
			MCBlockDef.create("MfgReCalc_Sprt03_DtlByProd")
		);
	}
	public static MCContainerDef MS_MSBCL6070_MfgReCalc_Sprt03_DOWN_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBCL6070", "MfgReCalc_Sprt03",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("inpt_schd_no", "inpt_schd_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("cont_unit_dec_place", "cont_unit_dec_place"),
				MCItemDef.create("base_unit_inpt_st_qty", "base_unit_inpt_st_qty"),
				MCItemDef.create("base_unit_rqmt_st_qty", "base_unit_rqmt_st_qty"),
				MCItemDef.create("base_unit_fxd_rqmt_st_qty", "base_unit_fxd_rqmt_st_qty"),
				MCItemDef.create("cont_inpt_st_qty", "cont_inpt_st_qty"),
				MCItemDef.create("cont_rqmt_st_qty", "cont_rqmt_st_qty"),
				MCItemDef.create("cont_fxd_rqmt_st_qty", "cont_fxd_rqmt_st_qty")
			}
			,
			MCBlockDef.create("MfgReCalc_Sprt03_DtlInpt")
		);
	}
	public static MCContainerDef MS_MSBCL6070_MfgReCalc_Sprt03_DOWN_BLOCK4() {

		return new MCGeneralContainerDef("MS", "MSBCL6070", "MfgReCalc_Sprt03",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("wk_schd_no", "wk_schd_no"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("st_fxd_wk_cost", "st_fxd_wk_cost"),
				MCItemDef.create("st_wk_cost", "st_wk_cost"),
				MCItemDef.create("st_sum_wk_cost", "st_sum_wk_cost")
			}
			,
			MCBlockDef.create("MfgReCalc_Sprt03_DtlWk")
		);
	}
	//FMCB DEF_CLASSES END
}

