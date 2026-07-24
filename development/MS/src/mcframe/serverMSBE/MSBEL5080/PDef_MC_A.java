package mcframe.serverMSBE.MSBEL5080;

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
 * [MSBEL_InptStkRplService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBEL5080.InptStkRpl_Ins01.UP.BLOCK0")){
			return MS_MSBEL5080_InptStkRpl_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5080.InptStkRpl_Ins01.UP.BLOCK1")){
			return MS_MSBEL5080_InptStkRpl_Ins01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5080.InptStkRpl_Ins01.DOWN.BLOCK0")){
			return MS_MSBEL5080_InptStkRpl_Ins01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5080.InptStkRpl_Ins02.UP.BLOCK0")){
			return MS_MSBEL5080_InptStkRpl_Ins02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5080.InptStkRpl_Ins02.UP.BLOCK1")){
			return MS_MSBEL5080_InptStkRpl_Ins02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5080.InptStkRpl_Ins02.DOWN.BLOCK0")){
			return MS_MSBEL5080_InptStkRpl_Ins02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5080.InptStkRpl_Ins03.UP.BLOCK0")){
			return MS_MSBEL5080_InptStkRpl_Ins03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5080.InptStkRpl_Ins03.UP.BLOCK1")){
			return MS_MSBEL5080_InptStkRpl_Ins03_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5080.InptStkRpl_Ins03.DOWN.BLOCK0")){
			return MS_MSBEL5080_InptStkRpl_Ins03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5080.InptStkRpl_Del01.UP.BLOCK0")){
			return MS_MSBEL5080_InptStkRpl_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5080.InptStkRpl_Del01.UP.BLOCK1")){
			return MS_MSBEL5080_InptStkRpl_Del01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5080.InptStkRpl_Del01.DOWN.BLOCK0")){
			return MS_MSBEL5080_InptStkRpl_Del01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5080.InptStkRpl_LstIns01.UP.BLOCK0")){
			return MS_MSBEL5080_InptStkRpl_LstIns01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5080.InptStkRpl_LstIns01.UP.BLOCK1")){
			return MS_MSBEL5080_InptStkRpl_LstIns01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5080.InptStkRpl_LstIns01.DOWN.BLOCK0")){
			return MS_MSBEL5080_InptStkRpl_LstIns01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5080.InptStkRpl_LstIns01.DOWN.BLOCK1")){
			return MS_MSBEL5080_InptStkRpl_LstIns01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5080.InptStkRpl_XfrIns01.UP.BLOCK0")){
			return MS_MSBEL5080_InptStkRpl_XfrIns01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5080.InptStkRpl_XfrIns01.UP.BLOCK1")){
			return MS_MSBEL5080_InptStkRpl_XfrIns01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5080.InptStkRpl_XfrIns01.DOWN.BLOCK0")){
			return MS_MSBEL5080_InptStkRpl_XfrIns01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5080.InptStkRpl_XfrIns01.DOWN.BLOCK1")){
			return MS_MSBEL5080_InptStkRpl_XfrIns01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5080.InptStkRpl_LstDel01.UP.BLOCK0")){
			return MS_MSBEL5080_InptStkRpl_LstDel01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5080.InptStkRpl_LstDel01.DOWN.BLOCK0")){
			return MS_MSBEL5080_InptStkRpl_LstDel01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5080.InptStkRpl_XfrDel01.UP.BLOCK0")){
			return MS_MSBEL5080_InptStkRpl_XfrDel01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5080.InptStkRpl_XfrDel01.UP.BLOCK1")){
			return MS_MSBEL5080_InptStkRpl_XfrDel01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5080.InptStkRpl_XfrDel01.DOWN.BLOCK0")){
			return MS_MSBEL5080_InptStkRpl_XfrDel01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
								
	
	static final MCOperationInfo MS_MSBEL5080_InptStkRpl_Ins01_INFO = new MCOperationInfo("MS", "MSBEL5080", "InptStkRpl_Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5080_InptStkRpl_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5080", "InptStkRpl_Ins01",
			new MCItemDef[]{
				MCItemDef.create("xfr_schd_del_flg", "xfr_schd_del_flg"),
				MCItemDef.create("xfr_schd_crt_flg", "xfr_schd_crt_flg"),
				MCItemDef.create("opn_flg", "opn_flg"),
				MCItemDef.create("ord_sav_flg", "ord_sav_flg"),
				MCItemDef.create("fix_flg", "fix_flg"),
				MCItemDef.create("schd_flg", "schd_flg"),
				MCItemDef.create("mfg_sav_flg", "mfg_sav_flg"),
				MCItemDef.create("ord_flg", "ord_flg"),
				MCItemDef.create("stt_flg", "stt_flg"),
				MCItemDef.create("dt_fr", "dt_fr"),
				MCItemDef.create("dt_to", "dt_to"),
				MCItemDef.create("batch_log_no", "batch_log_no")
			}
			,
			MCBlockDef.create("InptStkRpl_Cnd")
		);
	}

	public static MCContainerDef MS_MSBEL5080_InptStkRpl_Ins01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5080", "InptStkRpl_Ins01",
			new MCItemDef[]{
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd")
			}
			,
			MCBlockDef.create("InptStkRpl_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL5080_InptStkRpl_Ins01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5080", "InptStkRpl_Ins01",
			new MCItemDef[]{
				MCItemDef.create("lst_del_cnt", "lst_del_cnt"),
				MCItemDef.create("xfr_del_cnt", "xfr_del_cnt"),
				MCItemDef.create("inpt_io_schd_cnt", "inpt_io_schd_cnt"),
				MCItemDef.create("lst_crt_cnt", "lst_crt_cnt"),
				MCItemDef.create("lst_del_of_xfr_crt_cnt", "lst_del_of_xfr_crt_cnt"),
				MCItemDef.create("xfr_crt_success_cnt", "xfr_crt_success_cnt"),
				MCItemDef.create("xfr_crt_error_cnt", "xfr_crt_error_cnt")
			}
			,
			MCBlockDef.create("InptStkRpl_Cnt")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5080_InptStkRpl_Ins02_INFO = new MCOperationInfo("MS", "MSBEL5080", "InptStkRpl_Ins02", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5080_InptStkRpl_Ins02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5080", "InptStkRpl_Ins02",
			new MCItemDef[]{
				MCItemDef.create("xfr_schd_del_flg", "xfr_schd_del_flg"),
				MCItemDef.create("xfr_schd_crt_flg", "xfr_schd_crt_flg"),
				MCItemDef.create("opn_flg", "opn_flg"),
				MCItemDef.create("ord_sav_flg", "ord_sav_flg"),
				MCItemDef.create("fix_flg", "fix_flg"),
				MCItemDef.create("schd_flg", "schd_flg"),
				MCItemDef.create("mfg_sav_flg", "mfg_sav_flg"),
				MCItemDef.create("ord_flg", "ord_flg"),
				MCItemDef.create("stt_flg", "stt_flg"),
				MCItemDef.create("dt_fr", "dt_fr"),
				MCItemDef.create("dt_to", "dt_to"),
				MCItemDef.create("batch_log_no", "batch_log_no")
			}
			,
			MCBlockDef.create("InptStkRpl_Cnd")
		);
	}

	public static MCContainerDef MS_MSBEL5080_InptStkRpl_Ins02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5080", "InptStkRpl_Ins02",
			new MCItemDef[]{
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3")
			}
			,
			MCBlockDef.create("InptStkRpl_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL5080_InptStkRpl_Ins02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5080", "InptStkRpl_Ins02",
			new MCItemDef[]{
				MCItemDef.create("xfr_del_cnt", "xfr_del_cnt"),
				MCItemDef.create("inpt_io_schd_cnt", "inpt_io_schd_cnt"),
				MCItemDef.create("lst_crt_cnt", "lst_crt_cnt"),
				MCItemDef.create("lst_del_of_xfr_crt_cnt", "lst_del_of_xfr_crt_cnt"),
				MCItemDef.create("xfr_crt_success_cnt", "xfr_crt_success_cnt"),
				MCItemDef.create("xfr_crt_error_cnt", "xfr_crt_error_cnt")
			}
			,
			MCBlockDef.create("InptStkRpl_Cnt")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5080_InptStkRpl_Ins03_INFO = new MCOperationInfo("MS", "MSBEL5080", "InptStkRpl_Ins03", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5080_InptStkRpl_Ins03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5080", "InptStkRpl_Ins03",
			new MCItemDef[]{
				MCItemDef.create("screen_flg", "screen_flg")
			}
			,
			MCBlockDef.create("InptStkRpl_Cnd")
		);
	}

	public static MCContainerDef MS_MSBEL5080_InptStkRpl_Ins03_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5080", "InptStkRpl_Ins03",
			new MCItemDef[]{
				MCItemDef.create("rl" + ".batch_data_no", "batch_data_no"),
				MCItemDef.create("rl" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("InptStkRpl_Lst")
		);
	}


	public static MCContainerDef MS_MSBEL5080_InptStkRpl_Ins03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5080", "InptStkRpl_Ins03",
			new MCItemDef[]{
				MCItemDef.create("rl" + ".batch_data_no", "batch_data_no"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("InptStkRpl_Lst")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5080_InptStkRpl_Del01_INFO = new MCOperationInfo("MS", "MSBEL5080", "InptStkRpl_Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5080_InptStkRpl_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5080", "InptStkRpl_Del01",
			new MCItemDef[]{
				MCItemDef.create("inpt_stk_rpl_lst_del_flg", "inpt_stk_rpl_lst_del_flg"),
				MCItemDef.create("xfr_schd_del_flg", "xfr_schd_del_flg"),
				MCItemDef.create("dt_fr", "dt_fr"),
				MCItemDef.create("dt_to", "dt_to")
			}
			,
			MCBlockDef.create("InptStkRpl_Cnd")
		);
	}

	public static MCContainerDef MS_MSBEL5080_InptStkRpl_Del01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5080", "InptStkRpl_Del01",
			new MCItemDef[]{
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd")
			}
			,
			MCBlockDef.create("InptStkRpl_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL5080_InptStkRpl_Del01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5080", "InptStkRpl_Del01",
			new MCItemDef[]{
				MCItemDef.create("lst_del_cnt", "lst_del_cnt"),
				MCItemDef.create("xfr_del_cnt", "xfr_del_cnt")
			}
			,
			MCBlockDef.create("InptStkRpl_Cnt")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5080_InptStkRpl_LstIns01_INFO = new MCOperationInfo("MS", "MSBEL5080", "InptStkRpl_LstIns01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5080_InptStkRpl_LstIns01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5080", "InptStkRpl_LstIns01",
			new MCItemDef[]{
				MCItemDef.create("opn_flg", "opn_flg"),
				MCItemDef.create("ord_sav_flg", "ord_sav_flg"),
				MCItemDef.create("fix_flg", "fix_flg"),
				MCItemDef.create("schd_flg", "schd_flg"),
				MCItemDef.create("mfg_sav_flg", "mfg_sav_flg"),
				MCItemDef.create("ord_flg", "ord_flg"),
				MCItemDef.create("stt_flg", "stt_flg"),
				MCItemDef.create("dt_fr", "dt_fr"),
				MCItemDef.create("dt_to", "dt_to"),
				MCItemDef.create("batch_log_no", "batch_log_no")
			}
			,
			MCBlockDef.create("InptStkRpl_Cnd")
		);
	}

	public static MCContainerDef MS_MSBEL5080_InptStkRpl_LstIns01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5080", "InptStkRpl_LstIns01",
			new MCItemDef[]{
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3")
			}
			,
			MCBlockDef.create("InptStkRpl_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL5080_InptStkRpl_LstIns01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5080", "InptStkRpl_LstIns01",
			new MCItemDef[]{
				MCItemDef.create("rl" + ".batch_data_no", "batch_data_no"),
				MCItemDef.create("rl" + ".loc_cd", "loc_cd"),
				MCItemDef.create("rl" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("rl" + ".wg_cd", "wg_cd"),
				MCItemDef.create("rl" + ".itm_cd", "itm_cd"),
				MCItemDef.create("rl" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("rl" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("rl" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("rl" + ".schd_dt", "schd_dt"),
				MCItemDef.create("rl" + ".alt_grp_cd", "alt_grp_cd"),
				MCItemDef.create("rl" + ".alt_grp_id", "alt_grp_id")
			}
			,
			MCBlockDef.create("InptStkRpl_Lst")
		);
	}
	public static MCContainerDef MS_MSBEL5080_InptStkRpl_LstIns01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5080", "InptStkRpl_LstIns01",
			new MCItemDef[]{
				MCItemDef.create("inpt_io_schd_cnt", "inpt_io_schd_cnt"),
				MCItemDef.create("lst_crt_cnt", "lst_crt_cnt")
			}
			,
			MCBlockDef.create("InptStkRpl_Cnt")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5080_InptStkRpl_XfrIns01_INFO = new MCOperationInfo("MS", "MSBEL5080", "InptStkRpl_XfrIns01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5080_InptStkRpl_XfrIns01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5080", "InptStkRpl_XfrIns01",
			new MCItemDef[]{
				MCItemDef.create("screen_flg", "screen_flg")
			}
			,
			MCBlockDef.create("InptStkRpl_Cnd")
		);
	}

	public static MCContainerDef MS_MSBEL5080_InptStkRpl_XfrIns01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5080", "InptStkRpl_XfrIns01",
			new MCItemDef[]{
				MCItemDef.create("rl" + ".batch_data_no", "batch_data_no"),
				MCItemDef.create("rl" + ".loc_cd", "loc_cd"),
				MCItemDef.create("rl" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("rl" + ".wg_cd", "wg_cd"),
				MCItemDef.create("rl" + ".itm_cd", "itm_cd"),
				MCItemDef.create("rl" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("rl" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("rl" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("rl" + ".schd_dt", "schd_dt"),
				MCItemDef.create("rl" + ".alt_grp_id", "alt_grp_id"),
				MCItemDef.create("rl" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("InptStkRpl_Lst")
		);
	}


	public static MCContainerDef MS_MSBEL5080_InptStkRpl_XfrIns01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5080", "InptStkRpl_XfrIns01",
			new MCItemDef[]{
				MCItemDef.create("rl" + ".batch_data_no", "batch_data_no"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("InptStkRpl_Lst")
		);
	}
	public static MCContainerDef MS_MSBEL5080_InptStkRpl_XfrIns01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5080", "InptStkRpl_XfrIns01",
			new MCItemDef[]{
				MCItemDef.create("lst_del_of_xfr_crt_cnt", "lst_del_of_xfr_crt_cnt"),
				MCItemDef.create("xfr_crt_success_cnt", "xfr_crt_success_cnt"),
				MCItemDef.create("xfr_crt_error_cnt", "xfr_crt_error_cnt")
			}
			,
			MCBlockDef.create("InptStkRpl_Cnt")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5080_InptStkRpl_LstDel01_INFO = new MCOperationInfo("MS", "MSBEL5080", "InptStkRpl_LstDel01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5080_InptStkRpl_LstDel01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5080", "InptStkRpl_LstDel01",
			new MCItemDef[]{
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd")
			}
			,
			MCBlockDef.create("InptStkRpl_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL5080_InptStkRpl_LstDel01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5080", "InptStkRpl_LstDel01",
			new MCItemDef[]{
				MCItemDef.create("lst_del_cnt", "lst_del_cnt")
			}
			,
			MCBlockDef.create("InptStkRpl_Cnt")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5080_InptStkRpl_XfrDel01_INFO = new MCOperationInfo("MS", "MSBEL5080", "InptStkRpl_XfrDel01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5080_InptStkRpl_XfrDel01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5080", "InptStkRpl_XfrDel01",
			new MCItemDef[]{
				MCItemDef.create("dt_fr", "dt_fr"),
				MCItemDef.create("dt_to", "dt_to")
			}
			,
			MCBlockDef.create("InptStkRpl_Cnd")
		);
	}

	public static MCContainerDef MS_MSBEL5080_InptStkRpl_XfrDel01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5080", "InptStkRpl_XfrDel01",
			new MCItemDef[]{
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3")
			}
			,
			MCBlockDef.create("InptStkRpl_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL5080_InptStkRpl_XfrDel01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5080", "InptStkRpl_XfrDel01",
			new MCItemDef[]{
				MCItemDef.create("xfr_del_cnt", "xfr_del_cnt")
			}
			,
			MCBlockDef.create("InptStkRpl_Cnt")
		);
	}
	//FMCB DEF_CLASSES END
}

