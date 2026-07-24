package mcframe.serverMSLA.MSLAL5030;

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
 * [MSLAL_PoPrmsRecvIfService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSLAL5030.PoPrmsRecvIf_Chk01.UP.BLOCK0")){
			return MS_MSLAL5030_PoPrmsRecvIf_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL5030.PoPrmsRecvIf_Chk01.DOWN.BLOCK0")){
			return MS_MSLAL5030_PoPrmsRecvIf_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL5030.PoPrmsRecvIf_Chk01.DOWN.BLOCK1")){
			return MS_MSLAL5030_PoPrmsRecvIf_Chk01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSLAL5030.PoPrmsRecvIf_Chk01.DOWN.BLOCK2")){
			return MS_MSLAL5030_PoPrmsRecvIf_Chk01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSLAL5030.PoPrmsRecvIf_Upd01.UP.BLOCK0")){
			return MS_MSLAL5030_PoPrmsRecvIf_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL5030.PoPrmsRecvIf_Upd02.UP.BLOCK0")){
			return MS_MSLAL5030_PoPrmsRecvIf_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL5030.PoPrmsRecvIf_Upd02.UP.BLOCK1")){
			return MS_MSLAL5030_PoPrmsRecvIf_Upd02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSLAL5030.PoPrmsRecvIf_Upd02.DOWN.BLOCK0")){
			return MS_MSLAL5030_PoPrmsRecvIf_Upd02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL5030.PoPrmsRecvIf_Upd03.UP.BLOCK0")){
			return MS_MSLAL5030_PoPrmsRecvIf_Upd03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL5030.PoPrmsRecvIf_Upd03.DOWN.BLOCK0")){
			return MS_MSLAL5030_PoPrmsRecvIf_Upd03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL5030.PoPrmsRecvIf_Upd04.UP.BLOCK0")){
			return MS_MSLAL5030_PoPrmsRecvIf_Upd04_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL5030.PoPrmsRecvIf_Upd04.DOWN.BLOCK0")){
			return MS_MSLAL5030_PoPrmsRecvIf_Upd04_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
					
	
	static final MCOperationInfo MS_MSLAL5030_PoPrmsRecvIf_Chk01_INFO = new MCOperationInfo("MS", "MSLAL5030", "PoPrmsRecvIf_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSLAL5030_PoPrmsRecvIf_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL5030", "PoPrmsRecvIf_Chk01",
			new MCItemDef[]{
				MCItemDef.create("prms" + ".data_lno", "data_lno"),
				MCItemDef.create("prms" + ".data_no", "data_no"),
				MCItemDef.create("prms" + ".ext_data_no", "ext_data_no"),
				MCItemDef.create("prms" + ".ext_data_lno", "ext_data_lno"),
				MCItemDef.create("prms" + ".data_crud_typ", "data_crud_typ"),
				MCItemDef.create("prms" + ".exe_sts_typ", "exe_sts_typ"),
				MCItemDef.create("prms" + ".po_no", "po_no"),
				MCItemDef.create("prms" + ".po_rev", "po_rev"),
				MCItemDef.create("prms" + ".po_d_no", "po_d_no"),
				MCItemDef.create("prms" + ".sppl_cd", "sppl_cd"),
				MCItemDef.create("prms" + ".itm_cd", "itm_cd"),
				MCItemDef.create("prms" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("prms" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("prms" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("prms" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("prms" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("prms" + ".prms_dlv_tm", "prms_dlv_tm"),
				MCItemDef.create("prms" + ".dlv_inst_rev", "dlv_inst_rev"),
				MCItemDef.create("prms" + ".dlv_inst_no", "dlv_inst_no"),
				MCItemDef.create("prms" + ".dlv_inst_d_no", "dlv_inst_d_no"),
				MCItemDef.create("prms" + ".sub_char1", "sub_char1"),
				MCItemDef.create("prms" + ".sub_char2", "sub_char2"),
				MCItemDef.create("prms" + ".sub_char3", "sub_char3"),
				MCItemDef.create("prms" + ".sub_char4", "sub_char4"),
				MCItemDef.create("prms" + ".sub_char5", "sub_char5"),
				MCItemDef.create("prms" + ".sub_char6", "sub_char6"),
				MCItemDef.create("prms" + ".sub_char7", "sub_char7"),
				MCItemDef.create("prms" + ".sub_char8", "sub_char8"),
				MCItemDef.create("prms" + ".sub_char9", "sub_char9"),
				MCItemDef.create("prms" + ".sub_char10", "sub_char10"),
				MCItemDef.create("prms" + ".sub_char11", "sub_char11"),
				MCItemDef.create("prms" + ".sub_char12", "sub_char12"),
				MCItemDef.create("prms" + ".sub_char13", "sub_char13"),
				MCItemDef.create("prms" + ".sub_char14", "sub_char14"),
				MCItemDef.create("prms" + ".sub_char15", "sub_char15"),
				MCItemDef.create("prms" + ".sub_char16", "sub_char16"),
				MCItemDef.create("prms" + ".sub_char17", "sub_char17"),
				MCItemDef.create("prms" + ".sub_char18", "sub_char18"),
				MCItemDef.create("prms" + ".sub_char19", "sub_char19"),
				MCItemDef.create("prms" + ".sub_char20", "sub_char20"),
				MCItemDef.create("prms" + ".sub_char21", "sub_char21"),
				MCItemDef.create("prms" + ".sub_char22", "sub_char22"),
				MCItemDef.create("prms" + ".sub_char23", "sub_char23"),
				MCItemDef.create("prms" + ".sub_char24", "sub_char24"),
				MCItemDef.create("prms" + ".sub_char25", "sub_char25"),
				MCItemDef.create("prms" + ".sub_char26", "sub_char26"),
				MCItemDef.create("prms" + ".sub_char27", "sub_char27"),
				MCItemDef.create("prms" + ".sub_char28", "sub_char28"),
				MCItemDef.create("prms" + ".sub_char29", "sub_char29"),
				MCItemDef.create("prms" + ".sub_char30", "sub_char30"),
				MCItemDef.create("prms" + ".sub_num1", "sub_num1"),
				MCItemDef.create("prms" + ".sub_num2", "sub_num2"),
				MCItemDef.create("prms" + ".sub_num3", "sub_num3"),
				MCItemDef.create("prms" + ".sub_num4", "sub_num4"),
				MCItemDef.create("prms" + ".sub_num5", "sub_num5"),
				MCItemDef.create("prms" + ".sub_dt1", "sub_dt1"),
				MCItemDef.create("prms" + ".sub_dt2", "sub_dt2"),
				MCItemDef.create("prms" + ".sub_dt3", "sub_dt3"),
				MCItemDef.create("prms" + ".sub_dt4", "sub_dt4"),
				MCItemDef.create("prms" + ".sub_dt5", "sub_dt5"),
				MCItemDef.create("prms" + ".log_sub_key1", "log_sub_key1"),
				MCItemDef.create("prms" + ".log_sub_key2", "log_sub_key2")
			}
			,
			MCBlockDef.create("PoPrmsRecvIf_Chk01_Dtl")
		);
	}


	public static MCContainerDef MS_MSLAL5030_PoPrmsRecvIf_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL5030", "PoPrmsRecvIf_Chk01",
			new MCItemDef[]{
				MCItemDef.create("prms" + ".data_lno", "data_lno"),
				MCItemDef.create("prms" + ".data_no", "data_no"),
				MCItemDef.create("prms" + ".ext_data_no", "ext_data_no"),
				MCItemDef.create("prms" + ".ext_data_lno", "ext_data_lno"),
				MCItemDef.create("prms" + ".data_crud_typ", "data_crud_typ"),
				MCItemDef.create("prms" + ".exe_sts_typ", "exe_sts_typ"),
				MCItemDef.create("prms" + ".po_no", "po_no"),
				MCItemDef.create("prms" + ".po_rev", "po_rev"),
				MCItemDef.create("prms" + ".po_d_no", "po_d_no"),
				MCItemDef.create("prms" + ".sppl_cd", "sppl_cd"),
				MCItemDef.create("prms" + ".itm_cd", "itm_cd"),
				MCItemDef.create("prms" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("prms" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("prms" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("prms" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("prms" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("prms" + ".prms_dlv_tm", "prms_dlv_tm"),
				MCItemDef.create("prms" + ".dlv_inst_rev", "dlv_inst_rev"),
				MCItemDef.create("prms" + ".dlv_inst_no", "dlv_inst_no"),
				MCItemDef.create("prms" + ".dlv_inst_d_no", "dlv_inst_d_no"),
				MCItemDef.create("prms" + ".sub_char1", "sub_char1"),
				MCItemDef.create("prms" + ".sub_char2", "sub_char2"),
				MCItemDef.create("prms" + ".sub_char3", "sub_char3"),
				MCItemDef.create("prms" + ".sub_char4", "sub_char4"),
				MCItemDef.create("prms" + ".sub_char5", "sub_char5"),
				MCItemDef.create("prms" + ".sub_char6", "sub_char6"),
				MCItemDef.create("prms" + ".sub_char7", "sub_char7"),
				MCItemDef.create("prms" + ".sub_char8", "sub_char8"),
				MCItemDef.create("prms" + ".sub_char9", "sub_char9"),
				MCItemDef.create("prms" + ".sub_char10", "sub_char10"),
				MCItemDef.create("prms" + ".sub_char11", "sub_char11"),
				MCItemDef.create("prms" + ".sub_char12", "sub_char12"),
				MCItemDef.create("prms" + ".sub_char13", "sub_char13"),
				MCItemDef.create("prms" + ".sub_char14", "sub_char14"),
				MCItemDef.create("prms" + ".sub_char15", "sub_char15"),
				MCItemDef.create("prms" + ".sub_char16", "sub_char16"),
				MCItemDef.create("prms" + ".sub_char17", "sub_char17"),
				MCItemDef.create("prms" + ".sub_char18", "sub_char18"),
				MCItemDef.create("prms" + ".sub_char19", "sub_char19"),
				MCItemDef.create("prms" + ".sub_char20", "sub_char20"),
				MCItemDef.create("prms" + ".sub_char21", "sub_char21"),
				MCItemDef.create("prms" + ".sub_char22", "sub_char22"),
				MCItemDef.create("prms" + ".sub_char23", "sub_char23"),
				MCItemDef.create("prms" + ".sub_char24", "sub_char24"),
				MCItemDef.create("prms" + ".sub_char25", "sub_char25"),
				MCItemDef.create("prms" + ".sub_char26", "sub_char26"),
				MCItemDef.create("prms" + ".sub_char27", "sub_char27"),
				MCItemDef.create("prms" + ".sub_char28", "sub_char28"),
				MCItemDef.create("prms" + ".sub_char29", "sub_char29"),
				MCItemDef.create("prms" + ".sub_char30", "sub_char30"),
				MCItemDef.create("prms" + ".sub_num1", "sub_num1"),
				MCItemDef.create("prms" + ".sub_num2", "sub_num2"),
				MCItemDef.create("prms" + ".sub_num3", "sub_num3"),
				MCItemDef.create("prms" + ".sub_num4", "sub_num4"),
				MCItemDef.create("prms" + ".sub_num5", "sub_num5"),
				MCItemDef.create("prms" + ".sub_dt1", "sub_dt1"),
				MCItemDef.create("prms" + ".sub_dt2", "sub_dt2"),
				MCItemDef.create("prms" + ".sub_dt3", "sub_dt3"),
				MCItemDef.create("prms" + ".sub_dt4", "sub_dt4"),
				MCItemDef.create("prms" + ".sub_dt5", "sub_dt5"),
				MCItemDef.create("prms" + ".log_sub_key1", "log_sub_key1"),
				MCItemDef.create("prms" + ".log_sub_key2", "log_sub_key2"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("purc_usr_cd", "purc_usr_cd")
			}
			,
			MCBlockDef.create("PoPrmsRecvIf_Chk01_Dtl")
		);
	}
	public static MCContainerDef MS_MSLAL5030_PoPrmsRecvIf_Chk01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSLAL5030", "PoPrmsRecvIf_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("prms_rcpt_no", "prms_rcpt_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("arr_pr_no", "arr_pr_no"),
				MCItemDef.create("arr_schd_refl_flg", "arr_schd_refl_flg"),
				MCItemDef.create("arr_schd_refl_dt", "arr_schd_refl_dt"),
				MCItemDef.create("prms_rcpt_dt", "prms_rcpt_dt"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("arr_pr_upd_cntr", "arr_pr_upd_cntr")
			}
			,
			MCBlockDef.create("PrmsRecvIf_Chk01_Hdr")
		);
	}
	public static MCContainerDef MS_MSLAL5030_PoPrmsRecvIf_Chk01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSLAL5030", "PoPrmsRecvIf_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("prms_rcpt_no", "prms_rcpt_no"),
				MCItemDef.create("prms_rcpt_d_no", "prms_rcpt_d_no"),
				MCItemDef.create("dlv_inst_d_no", "dlv_inst_d_no"),
				MCItemDef.create("purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("prms_dlv_tm", "prms_dlv_tm"),
				MCItemDef.create("purc_schd_dt", "purc_schd_dt"),
				MCItemDef.create("sync_flg", "sync_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("PrmsRecvIf_Chk01_Dtl2")
		);
	}
	
	static final MCOperationInfo MS_MSLAL5030_PoPrmsRecvIf_Upd01_INFO = new MCOperationInfo("MS", "MSLAL5030", "PoPrmsRecvIf_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSLAL5030_PoPrmsRecvIf_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL5030", "PoPrmsRecvIf_Upd01",
			new MCItemDef[]{
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("ext_data_no", "ext_data_no"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("bp_cd", "bp_cd")
			}
			,
			MCBlockDef.create("PoPrmsRecvIf_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSLAL5030_PoPrmsRecvIf_Upd02_INFO = new MCOperationInfo("MS", "MSLAL5030", "PoPrmsRecvIf_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSLAL5030_PoPrmsRecvIf_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL5030", "PoPrmsRecvIf_Upd02",
			new MCItemDef[]{
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("ext_data_no", "ext_data_no"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("bp_cd", "bp_cd")
			}
			,
			MCBlockDef.create("PoPrmsRecvIf_Upd02_Dtl")
		);
	}

	public static MCContainerDef MS_MSLAL5030_PoPrmsRecvIf_Upd02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSLAL5030", "PoPrmsRecvIf_Upd02",
			new MCItemDef[]{
				MCItemDef.create("exe_unit_lump_flg", "exe_unit_lump_flg"),
				MCItemDef.create("if_upd_typ", "if_upd_typ"),
				MCItemDef.create("src_actlumprecv_flg", "src_actlumprecv_flg")
			}
			,
			MCBlockDef.create("PoPrmsRecvIf_Upd02_Cnd")
		);
	}


	public static MCContainerDef MS_MSLAL5030_PoPrmsRecvIf_Upd02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL5030", "PoPrmsRecvIf_Upd02",
			new MCItemDef[]{
				MCItemDef.create("total_num", "total_num"),
				MCItemDef.create("ok_num", "ok_num"),
				MCItemDef.create("err_num", "err_num"),
				MCItemDef.create("skip_num", "skip_num")
			}
			,
			MCBlockDef.create("PoPrmsRecvIf_Upd02_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSLAL5030_PoPrmsRecvIf_Upd03_INFO = new MCOperationInfo("MS", "MSLAL5030", "PoPrmsRecvIf_Upd03", "000000", new PDef());

	public static MCContainerDef MS_MSLAL5030_PoPrmsRecvIf_Upd03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL5030", "PoPrmsRecvIf_Upd03",
			new MCItemDef[]{
				MCItemDef.create("prms" + ".data_lno", "data_lno"),
				MCItemDef.create("prms" + ".data_no", "data_no"),
				MCItemDef.create("prms" + ".ext_data_no", "ext_data_no"),
				MCItemDef.create("prms" + ".ext_data_lno", "ext_data_lno"),
				MCItemDef.create("prms" + ".po_no", "po_no"),
				MCItemDef.create("prms" + ".po_d_no", "po_d_no")
			}
			,
			MCBlockDef.create("PoPrmsRecvIf_Upd03_Dtl")
		);
	}


	public static MCContainerDef MS_MSLAL5030_PoPrmsRecvIf_Upd03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL5030", "PoPrmsRecvIf_Upd03",
			new MCItemDef[]{
				MCItemDef.create("total_num", "total_num"),
				MCItemDef.create("ok_num", "ok_num"),
				MCItemDef.create("err_num", "err_num"),
				MCItemDef.create("skip_num", "skip_num")
			}
			,
			MCBlockDef.create("PoPrmsRecvIf_Upd03_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSLAL5030_PoPrmsRecvIf_Upd04_INFO = new MCOperationInfo("MS", "MSLAL5030", "PoPrmsRecvIf_Upd04", "000000", new PDef());

	public static MCContainerDef MS_MSLAL5030_PoPrmsRecvIf_Upd04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL5030", "PoPrmsRecvIf_Upd04",
			new MCItemDef[]{
				MCItemDef.create("prms" + ".data_lno", "data_lno"),
				MCItemDef.create("prms" + ".data_no", "data_no"),
				MCItemDef.create("prms" + ".ext_data_no", "ext_data_no"),
				MCItemDef.create("prms" + ".ext_data_lno", "ext_data_lno"),
				MCItemDef.create("prms" + ".data_crud_typ", "data_crud_typ"),
				MCItemDef.create("prms" + ".exe_sts_typ", "exe_sts_typ"),
				MCItemDef.create("prms" + ".po_no", "po_no"),
				MCItemDef.create("prms" + ".po_rev", "po_rev"),
				MCItemDef.create("prms" + ".po_d_no", "po_d_no"),
				MCItemDef.create("prms" + ".sppl_cd", "sppl_cd"),
				MCItemDef.create("prms" + ".itm_cd", "itm_cd"),
				MCItemDef.create("prms" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("prms" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("prms" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("prms" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("prms" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("prms" + ".prms_dlv_tm", "prms_dlv_tm"),
				MCItemDef.create("prms" + ".prms_rmrks", "prms_rmrks"),
				MCItemDef.create("prms" + ".dlv_inst_rev", "dlv_inst_rev"),
				MCItemDef.create("prms" + ".dlv_inst_no", "dlv_inst_no"),
				MCItemDef.create("prms" + ".dlv_inst_d_no", "dlv_inst_d_no"),
				MCItemDef.create("prms" + ".sub_char1", "sub_char1"),
				MCItemDef.create("prms" + ".sub_char2", "sub_char2"),
				MCItemDef.create("prms" + ".sub_char3", "sub_char3"),
				MCItemDef.create("prms" + ".sub_char4", "sub_char4"),
				MCItemDef.create("prms" + ".sub_char5", "sub_char5"),
				MCItemDef.create("prms" + ".sub_char6", "sub_char6"),
				MCItemDef.create("prms" + ".sub_char7", "sub_char7"),
				MCItemDef.create("prms" + ".sub_char8", "sub_char8"),
				MCItemDef.create("prms" + ".sub_char9", "sub_char9"),
				MCItemDef.create("prms" + ".sub_char10", "sub_char10"),
				MCItemDef.create("prms" + ".sub_char11", "sub_char11"),
				MCItemDef.create("prms" + ".sub_char12", "sub_char12"),
				MCItemDef.create("prms" + ".sub_char13", "sub_char13"),
				MCItemDef.create("prms" + ".sub_char14", "sub_char14"),
				MCItemDef.create("prms" + ".sub_char15", "sub_char15"),
				MCItemDef.create("prms" + ".sub_char16", "sub_char16"),
				MCItemDef.create("prms" + ".sub_char17", "sub_char17"),
				MCItemDef.create("prms" + ".sub_char18", "sub_char18"),
				MCItemDef.create("prms" + ".sub_char19", "sub_char19"),
				MCItemDef.create("prms" + ".sub_char20", "sub_char20"),
				MCItemDef.create("prms" + ".sub_char21", "sub_char21"),
				MCItemDef.create("prms" + ".sub_char22", "sub_char22"),
				MCItemDef.create("prms" + ".sub_char23", "sub_char23"),
				MCItemDef.create("prms" + ".sub_char24", "sub_char24"),
				MCItemDef.create("prms" + ".sub_char25", "sub_char25"),
				MCItemDef.create("prms" + ".sub_char26", "sub_char26"),
				MCItemDef.create("prms" + ".sub_char27", "sub_char27"),
				MCItemDef.create("prms" + ".sub_char28", "sub_char28"),
				MCItemDef.create("prms" + ".sub_char29", "sub_char29"),
				MCItemDef.create("prms" + ".sub_char30", "sub_char30"),
				MCItemDef.create("prms" + ".sub_num1", "sub_num1"),
				MCItemDef.create("prms" + ".sub_num2", "sub_num2"),
				MCItemDef.create("prms" + ".sub_num3", "sub_num3"),
				MCItemDef.create("prms" + ".sub_num4", "sub_num4"),
				MCItemDef.create("prms" + ".sub_num5", "sub_num5"),
				MCItemDef.create("prms" + ".sub_dt1", "sub_dt1"),
				MCItemDef.create("prms" + ".sub_dt2", "sub_dt2"),
				MCItemDef.create("prms" + ".sub_dt3", "sub_dt3"),
				MCItemDef.create("prms" + ".sub_dt4", "sub_dt4"),
				MCItemDef.create("prms" + ".sub_dt5", "sub_dt5"),
				MCItemDef.create("prms" + ".log_sub_key1", "log_sub_key1"),
				MCItemDef.create("prms" + ".log_sub_key2", "log_sub_key2")
			}
			,
			MCBlockDef.create("PoPrmsRecvIf_Upd04_Dtl")
		);
	}


	public static MCContainerDef MS_MSLAL5030_PoPrmsRecvIf_Upd04_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL5030", "PoPrmsRecvIf_Upd04",
			new MCItemDef[]{
				MCItemDef.create("prms" + ".data_lno", "data_lno"),
				MCItemDef.create("prms" + ".exe_sts_typ", "exe_sts_typ"),
				MCItemDef.create("prms" + ".sppl_cd", "sppl_cd"),
				MCItemDef.create("prms" + ".log_sub_key1", "log_sub_key1"),
				MCItemDef.create("prms" + ".log_sub_key2", "log_sub_key2"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("purc_usr_cd", "purc_usr_cd")
			}
			,
			MCBlockDef.create("PoPrmsRecvIf_Upd04_Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

