package mcframe.serverMSBC.MSBCL6110;

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
 * [MSBCL_MfgInstActComService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBCL6110.MfgInstActCom_Sprt01.UP.BLOCK0")){
			return MS_MSBCL6110_MfgInstActCom_Sprt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6110.MfgInstActCom_Sprt01.UP.BLOCK1")){
			return MS_MSBCL6110_MfgInstActCom_Sprt01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL6110.MfgInstActCom_Sprt01.DOWN.BLOCK0")){
			return MS_MSBCL6110_MfgInstActCom_Sprt01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6110.MfgInstActCom_Chk01.UP.BLOCK0")){
			return MS_MSBCL6110_MfgInstActCom_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6110.MfgInstActCom_Chk01.UP.BLOCK1")){
			return MS_MSBCL6110_MfgInstActCom_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL6110.MfgInstActCom_Chk01.DOWN.BLOCK0")){
			return MS_MSBCL6110_MfgInstActCom_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6110.MfgInstActCom_Upd01.UP.BLOCK0")){
			return MS_MSBCL6110_MfgInstActCom_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6110.MfgInstActCom_Upd01.UP.BLOCK1")){
			return MS_MSBCL6110_MfgInstActCom_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL6110.MfgInstActCom_Upd01.DOWN.BLOCK0")){
			return MS_MSBCL6110_MfgInstActCom_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6110.MfgInstActCom_Upd02.UP.BLOCK0")){
			return MS_MSBCL6110_MfgInstActCom_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6110.MfgInstActCom_Upd03.UP.BLOCK0")){
			return MS_MSBCL6110_MfgInstActCom_Upd03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6110.MfgInstActCom_Upd04.UP.BLOCK0")){
			return MS_MSBCL6110_MfgInstActCom_Upd04_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6110.MfgInstActCom_Upd04.UP.BLOCK1")){
			return MS_MSBCL6110_MfgInstActCom_Upd04_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL6110.MfgInstActCom_Upd08.UP.BLOCK0")){
			return MS_MSBCL6110_MfgInstActCom_Upd08_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6110.MfgInstActCom_Upd08.UP.BLOCK1")){
			return MS_MSBCL6110_MfgInstActCom_Upd08_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL6110.MfgInstActCom_Upd08.UP.BLOCK2")){
			return MS_MSBCL6110_MfgInstActCom_Upd08_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBCL6110.MfgInstActCom_Upd08.UP.BLOCK3")){
			return MS_MSBCL6110_MfgInstActCom_Upd08_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBCL6110.MfgInstActCom_Upd08.UP.BLOCK4")){
			return MS_MSBCL6110_MfgInstActCom_Upd08_UP_BLOCK4();
		}
		else if (id.equals("MS.MSBCL6110.MfgInstActCom_Upd08.UP.BLOCK5")){
			return MS_MSBCL6110_MfgInstActCom_Upd08_UP_BLOCK5();
		}
		else if (id.equals("MS.MSBCL6110.MfgInstActCom_Upd08.UP.BLOCK6")){
			return MS_MSBCL6110_MfgInstActCom_Upd08_UP_BLOCK6();
		}
		else if (id.equals("MS.MSBCL6110.MfgInstActCom_Upd08.DOWN.BLOCK0")){
			return MS_MSBCL6110_MfgInstActCom_Upd08_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6110.MfgInstActCom_Upd05.UP.BLOCK0")){
			return MS_MSBCL6110_MfgInstActCom_Upd05_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6110.MfgInstActCom_Upd06.UP.BLOCK0")){
			return MS_MSBCL6110_MfgInstActCom_Upd06_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6110.MfgInstActCom_Upd07.UP.BLOCK0")){
			return MS_MSBCL6110_MfgInstActCom_Upd07_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
										
	
	static final MCOperationInfo MS_MSBCL6110_MfgInstActCom_Sprt01_INFO = new MCOperationInfo("MS", "MSBCL6110", "MfgInstActCom_Sprt01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6110_MfgInstActCom_Sprt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6110", "MfgInstActCom_Sprt01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("lot_issue_flg", "lot_issue_flg"),
				MCItemDef.create("sublot_issue_flg", "sublot_issue_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("lot_no_ptn_cd", "lot_no_ptn_cd"),
				MCItemDef.create("sublot_no_ptn_cd", "sublot_no_ptn_cd"),
				MCItemDef.create("yield_dt_label_nm", "yield_dt_label_nm"),
				MCItemDef.create("yield_dt", "yield_dt"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_wg_cd", "mfg_loc_wg_cd"),
				MCItemDef.create("mfg_loc_site_cd", "mfg_loc_site_cd"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("no_exception_flg", "no_exception_flg"),
				MCItemDef.create("no_err_msg_flg", "no_err_msg_flg")
			}
			,
			MCBlockDef.create("MfgInstActCom_Sprt01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBCL6110_MfgInstActCom_Sprt01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL6110", "MfgInstActCom_Sprt01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("main_itm_flg", "main_itm_flg"),
				MCItemDef.create("vld_dt", "vld_dt"),
				MCItemDef.create("first_gr_dt", "first_gr_dt"),
				MCItemDef.create("lot_seq", "lot_seq")
			}
			,
			MCBlockDef.create("MfgInstActCom_Sprt01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBCL6110_MfgInstActCom_Sprt01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6110", "MfgInstActCom_Sprt01",
			new MCItemDef[]{
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("MfgInstActCom_Sprt01_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBCL6110_MfgInstActCom_Chk01_INFO = new MCOperationInfo("MS", "MSBCL6110", "MfgInstActCom_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6110_MfgInstActCom_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6110", "MfgInstActCom_Chk01",
			new MCItemDef[]{
				MCItemDef.create("lst_reg_flg", "lst_reg_flg"),
				MCItemDef.create("mfg_aprv_sts_typ", "mfg_aprv_sts_typ")
			}
			,
			MCBlockDef.create("MfgInstActCom_Chk01_Ctrl")
		);
	}

	public static MCContainerDef MS_MSBCL6110_MfgInstActCom_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL6110", "MfgInstActCom_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("aprv_dt", "aprv_dt"),
				MCItemDef.create("aprv_usr_cd", "aprv_usr_cd"),
				MCItemDef.create("aprv_dpt_cd", "aprv_dpt_cd"),
				MCItemDef.create("aprv_rsn", "aprv_rsn"),
				MCItemDef.create("mfg_inst_upd_cntr", "mfg_inst_upd_cntr"),
				MCItemDef.create("mfg_act_upd_cntr", "mfg_act_upd_cntr")
			}
			,
			MCBlockDef.create("MfgInstActCom_Chk01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBCL6110_MfgInstActCom_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6110", "MfgInstActCom_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("MfgInstActCom_Chk01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBCL6110_MfgInstActCom_Upd01_INFO = new MCOperationInfo("MS", "MSBCL6110", "MfgInstActCom_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6110_MfgInstActCom_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6110", "MfgInstActCom_Upd01",
			new MCItemDef[]{
				MCItemDef.create("lst_reg_flg", "lst_reg_flg"),
				MCItemDef.create("mfg_aprv_sts_typ", "mfg_aprv_sts_typ")
			}
			,
			MCBlockDef.create("MfgInstActCom_Upd01_Ctrl")
		);
	}

	public static MCContainerDef MS_MSBCL6110_MfgInstActCom_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL6110", "MfgInstActCom_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("aprv_dt", "aprv_dt"),
				MCItemDef.create("aprv_tm", "aprv_tm"),
				MCItemDef.create("aprv_usr_cd", "aprv_usr_cd"),
				MCItemDef.create("aprv_dpt_cd", "aprv_dpt_cd"),
				MCItemDef.create("aprv_rsn", "aprv_rsn"),
				MCItemDef.create("mfg_inst_upd_cntr", "mfg_inst_upd_cntr"),
				MCItemDef.create("mfg_act_upd_cntr", "mfg_act_upd_cntr")
			}
			,
			MCBlockDef.create("MfgInstActCom_Upd01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBCL6110_MfgInstActCom_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6110", "MfgInstActCom_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("mfg_aprv_sts_typ", "mfg_aprv_sts_typ"),
				MCItemDef.create("mfg_aprv_sts_typ_nm", "mfg_aprv_sts_typ_nm"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("MfgInstActCom_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBCL6110_MfgInstActCom_Upd02_INFO = new MCOperationInfo("MS", "MSBCL6110", "MfgInstActCom_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6110_MfgInstActCom_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6110", "MfgInstActCom_Upd02",
			new MCItemDef[]{
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("mfg_act_no", "mfg_act_no")
			}
			,
			MCBlockDef.create("MfgInstActCom_Upd02_Cnd")
		);
	}
	
	static final MCOperationInfo MS_MSBCL6110_MfgInstActCom_Upd03_INFO = new MCOperationInfo("MS", "MSBCL6110", "MfgInstActCom_Upd03", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6110_MfgInstActCom_Upd03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6110", "MfgInstActCom_Upd03",
			new MCItemDef[]{
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("abort_flg", "abort_flg")
			}
			,
			MCBlockDef.create("MfgInstActCom_Upd03_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBCL6110_MfgInstActCom_Upd04_INFO = new MCOperationInfo("MS", "MSBCL6110", "MfgInstActCom_Upd04", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6110_MfgInstActCom_Upd04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6110", "MfgInstActCom_Upd04",
			new MCItemDef[]{
				MCItemDef.create("is_src_mfg_inst_srv_flg", "is_src_mfg_inst_srv_flg")
			}
			,
			MCBlockDef.create("MfgInstActCom_Upd04_Ctrl")
		);
	}

	public static MCContainerDef MS_MSBCL6110_MfgInstActCom_Upd04_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL6110", "MfgInstActCom_Upd04",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("mfg_mtd_typ", "mfg_mtd_typ"),
				MCItemDef.create("st_act_tm", "st_act_tm"),
				MCItemDef.create("base_unit_st_qty", "base_unit_st_qty")
			}
			,
			MCBlockDef.create("MfgInstActCom_Upd04_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBCL6110_MfgInstActCom_Upd08_INFO = new MCOperationInfo("MS", "MSBCL6110", "MfgInstActCom_Upd08", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6110_MfgInstActCom_Upd08_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6110", "MfgInstActCom_Upd08",
			new MCItemDef[]{
				MCItemDef.create("is_src_mfg_inst_srv_flg", "is_src_mfg_inst_srv_flg"),
				MCItemDef.create("is_src_wk_act_reg_flg", "is_src_wk_act_reg_flg")
			}
			,
			MCBlockDef.create("MfgInstActCom_Upd08_Ctrl")
		);
	}

	public static MCContainerDef MS_MSBCL6110_MfgInstActCom_Upd08_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL6110", "MfgInstActCom_Upd08",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("mfg_mtd_typ", "mfg_mtd_typ"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("st_act_tm", "st_act_tm"),
				MCItemDef.create("end_act_tm", "end_act_tm"),
				MCItemDef.create("base_unit_yield_qty", "base_unit_yield_qty"),
				MCItemDef.create("base_unit_dfct_qty", "base_unit_dfct_qty"),
				MCItemDef.create("abort_flg", "abort_flg")
			}
			,
			MCBlockDef.create("MfgInstActCom_Upd08_Hdr")
		);
	}

	public static MCContainerDef MS_MSBCL6110_MfgInstActCom_Upd08_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBCL6110", "MfgInstActCom_Upd08",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("oper_act_no", "oper_act_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("st_act_dt", "st_act_dt"),
				MCItemDef.create("end_act_dt", "end_act_dt"),
				MCItemDef.create("not_cmpl_flg", "not_cmpl_flg")
			}
			,
			MCBlockDef.create("MfgInstActCom_Upd08_DtlOper")
		);
	}

	public static MCContainerDef MS_MSBCL6110_MfgInstActCom_Upd08_UP_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBCL6110", "MfgInstActCom_Upd08",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("yield_act_no", "yield_act_no"),
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("trd_unit_yield_qty", "trd_unit_yield_qty"),
				MCItemDef.create("base_unit_yield_qty", "base_unit_yield_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("abort_flg", "abort_flg")
			}
			,
			MCBlockDef.create("MfgInstActCom_Upd08_DtlYield")
		);
	}

	public static MCContainerDef MS_MSBCL6110_MfgInstActCom_Upd08_UP_BLOCK4() {

		return new MCGeneralContainerDef("MS", "MSBCL6110", "MfgInstActCom_Upd08",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("inpt_act_no", "inpt_act_no"),
				MCItemDef.create("inpt_schd_no", "inpt_schd_no"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("lst_reg_flg", "lst_reg_flg"),
				MCItemDef.create("is_src_batch_flg", "is_src_batch_flg"),
				MCItemDef.create("alt_itm_fix_flg", "alt_itm_fix_flg")
			}
			,
			MCBlockDef.create("MfgInstActCom_Upd08_DtlInpt")
		);
	}

	public static MCContainerDef MS_MSBCL6110_MfgInstActCom_Upd08_UP_BLOCK5() {

		return new MCGeneralContainerDef("MS", "MSBCL6110", "MfgInstActCom_Upd08",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("wk_act_no", "wk_act_no"),
				MCItemDef.create("wk_schd_no", "wk_schd_no"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("act_wk_cost", "act_wk_cost"),
				MCItemDef.create("abort_flg", "abort_flg")
			}
			,
			MCBlockDef.create("MfgInstActCom_Upd08_DtlWk")
		);
	}

	public static MCContainerDef MS_MSBCL6110_MfgInstActCom_Upd08_UP_BLOCK6() {

		return new MCGeneralContainerDef("MS", "MSBCL6110", "MfgInstActCom_Upd08",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("yield_act_no", "yield_act_no"),
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("trd_unit_yield_qty", "trd_unit_yield_qty"),
				MCItemDef.create("base_unit_yield_qty", "base_unit_yield_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("abort_flg", "abort_flg")
			}
			,
			MCBlockDef.create("MfgInstActCom_Upd08_DtlByProd")
		);
	}


	public static MCContainerDef MS_MSBCL6110_MfgInstActCom_Upd08_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6110", "MfgInstActCom_Upd08",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("all_inpt_cmpl_flg", "all_inpt_cmpl_flg")
			}
			,
			MCBlockDef.create("MfgInstActCom_Upd08_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBCL6110_MfgInstActCom_Upd05_INFO = new MCOperationInfo("MS", "MSBCL6110", "MfgInstActCom_Upd05", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6110_MfgInstActCom_Upd05_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6110", "MfgInstActCom_Upd05",
			new MCItemDef[]{
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("mfg_mtd_typ", "mfg_mtd_typ"),
				MCItemDef.create("mfg_inst_unit_typ", "mfg_inst_unit_typ")
			}
			,
			MCBlockDef.create("MfgInstActCom_Upd05_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBCL6110_MfgInstActCom_Upd06_INFO = new MCOperationInfo("MS", "MSBCL6110", "MfgInstActCom_Upd06", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6110_MfgInstActCom_Upd06_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6110", "MfgInstActCom_Upd06",
			new MCItemDef[]{
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("yield_act_no", "yield_act_no")
			}
			,
			MCBlockDef.create("MfgInstActCom_Upd06_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBCL6110_MfgInstActCom_Upd07_INFO = new MCOperationInfo("MS", "MSBCL6110", "MfgInstActCom_Upd07", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6110_MfgInstActCom_Upd07_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6110", "MfgInstActCom_Upd07",
			new MCItemDef[]{
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("closing_flg", "closing_flg")
			}
			,
			MCBlockDef.create("MfgInstActCom_Upd07_Hdr")
		);
	}


	//FMCB DEF_CLASSES END
}

