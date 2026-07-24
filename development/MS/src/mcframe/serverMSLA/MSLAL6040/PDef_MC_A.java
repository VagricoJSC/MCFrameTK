package mcframe.serverMSLA.MSLAL6040;

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
 * [MSLAL_ArrActRecvIfService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSLAL6040.ArrActRecvIf_Upd01.UP.BLOCK0")){
			return MS_MSLAL6040_ArrActRecvIf_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL6040.ArrActRecvIf_Upd02.UP.BLOCK0")){
			return MS_MSLAL6040_ArrActRecvIf_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL6040.ArrActRecvIf_Upd02.UP.BLOCK1")){
			return MS_MSLAL6040_ArrActRecvIf_Upd02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSLAL6040.ArrActRecvIf_Upd02.DOWN.BLOCK0")){
			return MS_MSLAL6040_ArrActRecvIf_Upd02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL6040.ArrActRecvIf_Upd03.UP.BLOCK0")){
			return MS_MSLAL6040_ArrActRecvIf_Upd03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL6040.ArrActRecvIf_Upd03.UP.BLOCK1")){
			return MS_MSLAL6040_ArrActRecvIf_Upd03_UP_BLOCK1();
		}
		else if (id.equals("MS.MSLAL6040.ArrActRecvIf_Upd03.DOWN.BLOCK0")){
			return MS_MSLAL6040_ArrActRecvIf_Upd03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL6040.ArrActRecvIf_Upd04.UP.BLOCK0")){
			return MS_MSLAL6040_ArrActRecvIf_Upd04_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL6040.ArrActRecvIf_Upd04.UP.BLOCK1")){
			return MS_MSLAL6040_ArrActRecvIf_Upd04_UP_BLOCK1();
		}
		else if (id.equals("MS.MSLAL6040.ArrActRecvIf_Upd04.DOWN.BLOCK0")){
			return MS_MSLAL6040_ArrActRecvIf_Upd04_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL6040.ArrActRecvIf_Chk01.UP.BLOCK0")){
			return MS_MSLAL6040_ArrActRecvIf_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL6040.ArrActRecvIf_Chk01.DOWN.BLOCK0")){
			return MS_MSLAL6040_ArrActRecvIf_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL6040.ArrActRecvIf_Chk01.DOWN.BLOCK1")){
			return MS_MSLAL6040_ArrActRecvIf_Chk01_DOWN_BLOCK1();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
					
	
	static final MCOperationInfo MS_MSLAL6040_ArrActRecvIf_Upd01_INFO = new MCOperationInfo("MS", "MSLAL6040", "ArrActRecvIf_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSLAL6040_ArrActRecvIf_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL6040", "ArrActRecvIf_Upd01",
			new MCItemDef[]{
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("ext_data_no", "ext_data_no"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("bp_cd", "bp_cd")
			}
			,
			MCBlockDef.create("ArrActRecvIf_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSLAL6040_ArrActRecvIf_Upd02_INFO = new MCOperationInfo("MS", "MSLAL6040", "ArrActRecvIf_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSLAL6040_ArrActRecvIf_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL6040", "ArrActRecvIf_Upd02",
			new MCItemDef[]{
				MCItemDef.create("data_lno", "data_lno"),
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("ext_data_no", "ext_data_no"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("bp_cd", "bp_cd")
			}
			,
			MCBlockDef.create("ArrActRecvIf_Upd02_Dtl")
		);
	}

	public static MCContainerDef MS_MSLAL6040_ArrActRecvIf_Upd02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSLAL6040", "ArrActRecvIf_Upd02",
			new MCItemDef[]{
				MCItemDef.create("exe_unit_lump_flg", "exe_unit_lump_flg"),
				MCItemDef.create("if_upd_typ", "if_upd_typ"),
				MCItemDef.create("src_actlumprecv_flg", "src_actlumprecv_flg")
			}
			,
			MCBlockDef.create("ArrActRecvIf_Upd02_Cnd")
		);
	}


	public static MCContainerDef MS_MSLAL6040_ArrActRecvIf_Upd02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL6040", "ArrActRecvIf_Upd02",
			new MCItemDef[]{
				MCItemDef.create("total_num", true, "total_num"),
				MCItemDef.create("ok_num", true, "ok_num"),
				MCItemDef.create("err_num", true, "err_num"),
				MCItemDef.create("skip_num", true, "skip_num")
			}
			,
			MCBlockDef.create("ArrActRecvIf_Upd02_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSLAL6040_ArrActRecvIf_Upd03_INFO = new MCOperationInfo("MS", "MSLAL6040", "ArrActRecvIf_Upd03", "000000", new PDef());

	public static MCContainerDef MS_MSLAL6040_ArrActRecvIf_Upd03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL6040", "ArrActRecvIf_Upd03",
			new MCItemDef[]{
				MCItemDef.create("aa" + ".data_lno", "data_lno"),
				MCItemDef.create("aa" + ".data_no", "data_no"),
				MCItemDef.create("aa" + ".exe_sts_typ", "exe_sts_typ"),
				MCItemDef.create("aa" + ".data_crud_typ", "data_crud_typ"),
				MCItemDef.create("aa" + ".ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("aa" + ".ext_data_no", "ext_data_no"),
				MCItemDef.create("aa" + ".ext_data_lno", "ext_data_lno"),
				MCItemDef.create("aa" + ".data_make_dt", "data_make_dt"),
				MCItemDef.create("aa" + ".imp_flg", "imp_flg"),
				MCItemDef.create("aa" + ".recv_dt", "recv_dt"),
				MCItemDef.create("aa" + ".arr_schd_no", "arr_schd_no"),
				MCItemDef.create("aa" + ".po_no", "if_po_no"),
				MCItemDef.create("aa" + ".po_d_no", "po_d_no"),
				MCItemDef.create("aa" + ".prms_rcpt_d_no", "prms_rcpt_d_no"),
				MCItemDef.create("aa" + ".dlv_inst_no", "dlv_inst_no"),
				MCItemDef.create("aa" + ".dlv_inst_d_no", "dlv_inst_d_no"),
				MCItemDef.create("aa" + ".rcpt_iv_d_no", "rcpt_iv_d_no"),
				MCItemDef.create("aa" + ".sls_ret_schd_d_no", "sls_ret_schd_d_no"),
				MCItemDef.create("aa" + ".dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("aa" + ".iv_d_no", "iv_d_no"),
				MCItemDef.create("aa" + ".ext_arr_act_no", "ext_arr_act_no"),
				MCItemDef.create("aa" + ".sppl_cd", "sppl_cd"),
				MCItemDef.create("aa" + ".arr_tm", "arr_tm"),
				MCItemDef.create("aa" + ".arr_dpt_cd", "arr_dpt_cd"),
				MCItemDef.create("aa" + ".arr_usr_cd", "arr_usr_cd"),
				MCItemDef.create("aa" + ".arr_lg_grp_cd", "arr_lg_grp_cd"),
				MCItemDef.create("aa" + ".arr_loc_cd", "arr_loc_cd"),
				MCItemDef.create("aa" + ".arr_str_ln_cd", "arr_str_ln_cd"),
				MCItemDef.create("aa" + ".itm_cd", "itm_cd"),
				MCItemDef.create("aa" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("aa" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("aa" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("aa" + ".lot_no", "lot_no"),
				MCItemDef.create("aa" + ".sublot_no", "sublot_no"),
				MCItemDef.create("aa" + ".ver_no", "ver_no"),
				MCItemDef.create("aa" + ".gd_cd", "gd_cd"),
				MCItemDef.create("aa" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("aa" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("aa" + ".abort_flg", "abort_flg"),
				MCItemDef.create("aa" + ".bp_lot_no", "bp_lot_no"),
				MCItemDef.create("aa" + ".bp_dlv_slip_no", "bp_dlv_slip_no"),
				MCItemDef.create("aa" + ".bp_dlv_slip_d_no", "bp_dlv_slip_d_no"),
				MCItemDef.create("aa" + ".ship_fr_valid_dt", "ship_fr_valid_dt"),
				MCItemDef.create("aa" + ".insp_cnt_rmrks", "insp_cnt_rmrks"),
				MCItemDef.create("aa" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("sls_ret_schd_no", "sls_ret_schd_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no")
			}
			,
			MCBlockDef.create("ArrActRecvIf_Upd03_Dtl")
		);
	}

	public static MCContainerDef MS_MSLAL6040_ArrActRecvIf_Upd03_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSLAL6040", "ArrActRecvIf_Upd03",
			new MCItemDef[]{
				MCItemDef.create("if_upd_typ", "if_upd_typ"),
				MCItemDef.create("src_actlumprecv_flg", "src_actlumprecv_flg")
			}
			,
			MCBlockDef.create("ArrActRecvIf_Upd03_Cnd")
		);
	}


	public static MCContainerDef MS_MSLAL6040_ArrActRecvIf_Upd03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL6040", "ArrActRecvIf_Upd03",
			new MCItemDef[]{
				MCItemDef.create("total_num", true, "total_num"),
				MCItemDef.create("ok_num", true, "ok_num"),
				MCItemDef.create("err_num", true, "err_num"),
				MCItemDef.create("skip_num", true, "skip_num")
			}
			,
			MCBlockDef.create("ArrActRecvIf_Upd03_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSLAL6040_ArrActRecvIf_Upd04_INFO = new MCOperationInfo("MS", "MSLAL6040", "ArrActRecvIf_Upd04", "000000", new PDef());

	public static MCContainerDef MS_MSLAL6040_ArrActRecvIf_Upd04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL6040", "ArrActRecvIf_Upd04",
			new MCItemDef[]{
				MCItemDef.create("aa" + ".data_lno", "data_lno"),
				MCItemDef.create("aa" + ".data_no", "data_no"),
				MCItemDef.create("aa" + ".exe_sts_typ", "exe_sts_typ"),
				MCItemDef.create("aa" + ".data_crud_typ", "data_crud_typ"),
				MCItemDef.create("aa" + ".ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("aa" + ".ext_data_no", "ext_data_no"),
				MCItemDef.create("aa" + ".ext_data_lno", "ext_data_lno"),
				MCItemDef.create("aa" + ".data_make_dt", "data_make_dt"),
				MCItemDef.create("aa" + ".imp_flg", "imp_flg"),
				MCItemDef.create("aa" + ".recv_dt", "recv_dt"),
				MCItemDef.create("aa" + ".arr_schd_no", "arr_schd_no"),
				MCItemDef.create("aa" + ".po_no", "if_po_no"),
				MCItemDef.create("aa" + ".po_d_no", "po_d_no"),
				MCItemDef.create("aa" + ".prms_rcpt_d_no", "prms_rcpt_d_no"),
				MCItemDef.create("aa" + ".dlv_inst_no", "dlv_inst_no"),
				MCItemDef.create("aa" + ".dlv_inst_d_no", "dlv_inst_d_no"),
				MCItemDef.create("aa" + ".rcpt_iv_d_no", "rcpt_iv_d_no"),
				MCItemDef.create("aa" + ".sls_ret_schd_d_no", "sls_ret_schd_d_no"),
				MCItemDef.create("aa" + ".dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("aa" + ".iv_d_no", "iv_d_no"),
				MCItemDef.create("aa" + ".ext_arr_act_no", "ext_arr_act_no"),
				MCItemDef.create("aa" + ".sppl_cd", "sppl_cd"),
				MCItemDef.create("aa" + ".arr_tm", "arr_tm"),
				MCItemDef.create("aa" + ".arr_dpt_cd", "arr_dpt_cd"),
				MCItemDef.create("aa" + ".arr_usr_cd", "arr_usr_cd"),
				MCItemDef.create("aa" + ".arr_lg_grp_cd", "arr_lg_grp_cd"),
				MCItemDef.create("aa" + ".arr_loc_cd", "arr_loc_cd"),
				MCItemDef.create("aa" + ".arr_str_ln_cd", "arr_str_ln_cd"),
				MCItemDef.create("aa" + ".itm_cd", "itm_cd"),
				MCItemDef.create("aa" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("aa" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("aa" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("aa" + ".lot_no", "lot_no"),
				MCItemDef.create("aa" + ".sublot_no", "sublot_no"),
				MCItemDef.create("aa" + ".ver_no", "ver_no"),
				MCItemDef.create("aa" + ".gd_cd", "gd_cd"),
				MCItemDef.create("aa" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("aa" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("aa" + ".abort_flg", "abort_flg"),
				MCItemDef.create("aa" + ".bp_lot_no", "bp_lot_no"),
				MCItemDef.create("aa" + ".bp_dlv_slip_no", "bp_dlv_slip_no"),
				MCItemDef.create("aa" + ".bp_dlv_slip_d_no", "bp_dlv_slip_d_no"),
				MCItemDef.create("aa" + ".ship_fr_valid_dt", "ship_fr_valid_dt"),
				MCItemDef.create("aa" + ".insp_cnt_rmrks", "insp_cnt_rmrks"),
				MCItemDef.create("aa" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("aa" + ".sub_char1", "sub_char1"),
				MCItemDef.create("aa" + ".sub_char2", "sub_char2"),
				MCItemDef.create("aa" + ".sub_char3", "sub_char3"),
				MCItemDef.create("aa" + ".sub_char4", "sub_char4"),
				MCItemDef.create("aa" + ".sub_char5", "sub_char5"),
				MCItemDef.create("aa" + ".sub_char6", "sub_char6"),
				MCItemDef.create("aa" + ".sub_char7", "sub_char7"),
				MCItemDef.create("aa" + ".sub_char8", "sub_char8"),
				MCItemDef.create("aa" + ".sub_char9", "sub_char9"),
				MCItemDef.create("aa" + ".sub_char10", "sub_char10"),
				MCItemDef.create("aa" + ".sub_char11", "sub_char11"),
				MCItemDef.create("aa" + ".sub_char12", "sub_char12"),
				MCItemDef.create("aa" + ".sub_char13", "sub_char13"),
				MCItemDef.create("aa" + ".sub_char14", "sub_char14"),
				MCItemDef.create("aa" + ".sub_char15", "sub_char15"),
				MCItemDef.create("aa" + ".sub_char16", "sub_char16"),
				MCItemDef.create("aa" + ".sub_char17", "sub_char17"),
				MCItemDef.create("aa" + ".sub_char18", "sub_char18"),
				MCItemDef.create("aa" + ".sub_char19", "sub_char19"),
				MCItemDef.create("aa" + ".sub_char20", "sub_char20"),
				MCItemDef.create("aa" + ".sub_char21", "sub_char21"),
				MCItemDef.create("aa" + ".sub_char22", "sub_char22"),
				MCItemDef.create("aa" + ".sub_char23", "sub_char23"),
				MCItemDef.create("aa" + ".sub_char24", "sub_char24"),
				MCItemDef.create("aa" + ".sub_char25", "sub_char25"),
				MCItemDef.create("aa" + ".sub_char26", "sub_char26"),
				MCItemDef.create("aa" + ".sub_char27", "sub_char27"),
				MCItemDef.create("aa" + ".sub_char28", "sub_char28"),
				MCItemDef.create("aa" + ".sub_char29", "sub_char29"),
				MCItemDef.create("aa" + ".sub_char30", "sub_char30"),
				MCItemDef.create("aa" + ".sub_num1", "sub_num1"),
				MCItemDef.create("aa" + ".sub_num2", "sub_num2"),
				MCItemDef.create("aa" + ".sub_num3", "sub_num3"),
				MCItemDef.create("aa" + ".sub_num4", "sub_num4"),
				MCItemDef.create("aa" + ".sub_num5", "sub_num5"),
				MCItemDef.create("aa" + ".sub_dt1", "sub_dt1"),
				MCItemDef.create("aa" + ".sub_dt2", "sub_dt2"),
				MCItemDef.create("aa" + ".sub_dt3", "sub_dt3"),
				MCItemDef.create("aa" + ".sub_dt4", "sub_dt4"),
				MCItemDef.create("aa" + ".sub_dt5", "sub_dt5"),
				MCItemDef.create("aa" + ".log_sub_key1", "log_sub_key1"),
				MCItemDef.create("aa" + ".log_sub_key2", "log_sub_key2"),
				MCItemDef.create("rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("sls_ret_schd_no", "sls_ret_schd_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no")
			}
			,
			MCBlockDef.create("ArrActRecvIf_Upd04_Dtl")
		);
	}

	public static MCContainerDef MS_MSLAL6040_ArrActRecvIf_Upd04_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSLAL6040", "ArrActRecvIf_Upd04",
			new MCItemDef[]{
				MCItemDef.create("if_upd_typ", "if_upd_typ"),
				MCItemDef.create("src_actlumprecv_flg", "src_actlumprecv_flg")
			}
			,
			MCBlockDef.create("ArrActRecvIf_Upd04_Cnd")
		);
	}


	public static MCContainerDef MS_MSLAL6040_ArrActRecvIf_Upd04_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL6040", "ArrActRecvIf_Upd04",
			new MCItemDef[]{
				MCItemDef.create("aa" + ".data_lno", "data_lno"),
				MCItemDef.create("aa" + ".data_no", "data_no"),
				MCItemDef.create("aa" + ".exe_sts_typ", "exe_sts_typ"),
				MCItemDef.create("aa" + ".log_sub_key1", "log_sub_key1"),
				MCItemDef.create("aa" + ".log_sub_key2", "log_sub_key2"),
				MCItemDef.create("push_alert_wg_cd", "push_alert_wg_cd"),
				MCItemDef.create("push_alert_usr_cd", "push_alert_usr_cd")
			}
			,
			MCBlockDef.create("ArrActRecvIf_Upd04_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSLAL6040_ArrActRecvIf_Chk01_INFO = new MCOperationInfo("MS", "MSLAL6040", "ArrActRecvIf_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSLAL6040_ArrActRecvIf_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL6040", "ArrActRecvIf_Chk01",
			new MCItemDef[]{
				MCItemDef.create("aa" + ".data_lno", "data_lno"),
				MCItemDef.create("aa" + ".data_no", "data_no"),
				MCItemDef.create("aa" + ".exe_sts_typ", "exe_sts_typ"),
				MCItemDef.create("aa" + ".data_crud_typ", "data_crud_typ"),
				MCItemDef.create("aa" + ".ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("aa" + ".ext_data_no", "ext_data_no"),
				MCItemDef.create("aa" + ".ext_data_lno", "ext_data_lno"),
				MCItemDef.create("aa" + ".data_make_dt", "data_make_dt"),
				MCItemDef.create("aa" + ".imp_flg", "imp_flg"),
				MCItemDef.create("aa" + ".recv_dt", "recv_dt"),
				MCItemDef.create("aa" + ".arr_schd_no", "arr_schd_no"),
				MCItemDef.create("aa" + ".po_no", "if_po_no"),
				MCItemDef.create("aa" + ".po_d_no", "po_d_no"),
				MCItemDef.create("aa" + ".prms_rcpt_d_no", "prms_rcpt_d_no"),
				MCItemDef.create("aa" + ".dlv_inst_no", "dlv_inst_no"),
				MCItemDef.create("aa" + ".dlv_inst_d_no", "dlv_inst_d_no"),
				MCItemDef.create("aa" + ".rcpt_iv_d_no", "rcpt_iv_d_no"),
				MCItemDef.create("aa" + ".sls_ret_schd_d_no", "sls_ret_schd_d_no"),
				MCItemDef.create("aa" + ".dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("aa" + ".iv_d_no", "iv_d_no"),
				MCItemDef.create("aa" + ".ext_arr_act_no", "ext_arr_act_no"),
				MCItemDef.create("aa" + ".sppl_cd", "sppl_cd"),
				MCItemDef.create("aa" + ".arr_tm", "arr_tm"),
				MCItemDef.create("aa" + ".arr_dpt_cd", "arr_dpt_cd"),
				MCItemDef.create("aa" + ".arr_usr_cd", "arr_usr_cd"),
				MCItemDef.create("aa" + ".arr_lg_grp_cd", "arr_lg_grp_cd"),
				MCItemDef.create("aa" + ".arr_loc_cd", "arr_loc_cd"),
				MCItemDef.create("aa" + ".arr_str_ln_cd", "arr_str_ln_cd"),
				MCItemDef.create("aa" + ".itm_cd", "itm_cd"),
				MCItemDef.create("aa" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("aa" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("aa" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("aa" + ".lot_no", "lot_no"),
				MCItemDef.create("aa" + ".sublot_no", "sublot_no"),
				MCItemDef.create("aa" + ".ver_no", "ver_no"),
				MCItemDef.create("aa" + ".gd_cd", "gd_cd"),
				MCItemDef.create("aa" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("aa" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("aa" + ".abort_flg", "abort_flg"),
				MCItemDef.create("aa" + ".bp_lot_no", "bp_lot_no"),
				MCItemDef.create("aa" + ".bp_dlv_slip_no", "bp_dlv_slip_no"),
				MCItemDef.create("aa" + ".bp_dlv_slip_d_no", "bp_dlv_slip_d_no"),
				MCItemDef.create("aa" + ".ship_fr_valid_dt", "ship_fr_valid_dt"),
				MCItemDef.create("aa" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("aa" + ".insp_cnt_rmrks", "insp_cnt_rmrks"),
				MCItemDef.create("aa" + ".sub_char1", "sub_char1"),
				MCItemDef.create("aa" + ".sub_char2", "sub_char2"),
				MCItemDef.create("aa" + ".sub_char3", "sub_char3"),
				MCItemDef.create("aa" + ".sub_char4", "sub_char4"),
				MCItemDef.create("aa" + ".sub_char5", "sub_char5"),
				MCItemDef.create("aa" + ".sub_char6", "sub_char6"),
				MCItemDef.create("aa" + ".sub_char7", "sub_char7"),
				MCItemDef.create("aa" + ".sub_char8", "sub_char8"),
				MCItemDef.create("aa" + ".sub_char9", "sub_char9"),
				MCItemDef.create("aa" + ".sub_char10", "sub_char10"),
				MCItemDef.create("aa" + ".sub_char11", "sub_char11"),
				MCItemDef.create("aa" + ".sub_char12", "sub_char12"),
				MCItemDef.create("aa" + ".sub_char13", "sub_char13"),
				MCItemDef.create("aa" + ".sub_char14", "sub_char14"),
				MCItemDef.create("aa" + ".sub_char15", "sub_char15"),
				MCItemDef.create("aa" + ".sub_char16", "sub_char16"),
				MCItemDef.create("aa" + ".sub_char17", "sub_char17"),
				MCItemDef.create("aa" + ".sub_char18", "sub_char18"),
				MCItemDef.create("aa" + ".sub_char19", "sub_char19"),
				MCItemDef.create("aa" + ".sub_char20", "sub_char20"),
				MCItemDef.create("aa" + ".sub_char21", "sub_char21"),
				MCItemDef.create("aa" + ".sub_char22", "sub_char22"),
				MCItemDef.create("aa" + ".sub_char23", "sub_char23"),
				MCItemDef.create("aa" + ".sub_char24", "sub_char24"),
				MCItemDef.create("aa" + ".sub_char25", "sub_char25"),
				MCItemDef.create("aa" + ".sub_char26", "sub_char26"),
				MCItemDef.create("aa" + ".sub_char27", "sub_char27"),
				MCItemDef.create("aa" + ".sub_char28", "sub_char28"),
				MCItemDef.create("aa" + ".sub_char29", "sub_char29"),
				MCItemDef.create("aa" + ".sub_char30", "sub_char30"),
				MCItemDef.create("aa" + ".sub_num1", "sub_num1"),
				MCItemDef.create("aa" + ".sub_num2", "sub_num2"),
				MCItemDef.create("aa" + ".sub_num3", "sub_num3"),
				MCItemDef.create("aa" + ".sub_num4", "sub_num4"),
				MCItemDef.create("aa" + ".sub_num5", "sub_num5"),
				MCItemDef.create("aa" + ".sub_dt1", "sub_dt1"),
				MCItemDef.create("aa" + ".sub_dt2", "sub_dt2"),
				MCItemDef.create("aa" + ".sub_dt3", "sub_dt3"),
				MCItemDef.create("aa" + ".sub_dt4", "sub_dt4"),
				MCItemDef.create("aa" + ".sub_dt5", "sub_dt5")
			}
			,
			MCBlockDef.create("ArrActRecvIf_Chk01_Dtl")
		);
	}


	public static MCContainerDef MS_MSLAL6040_ArrActRecvIf_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL6040", "ArrActRecvIf_Chk01",
			new MCItemDef[]{
				MCItemDef.create("aa" + ".data_lno", "data_lno"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("push_alert_wg_cd", "push_alert_wg_cd"),
				MCItemDef.create("push_alert_usr_cd", "push_alert_usr_cd")
			}
			,
			MCBlockDef.create("ArrActRecvIf_Chk01_Dtl")
		);
	}
	public static MCContainerDef MS_MSLAL6040_ArrActRecvIf_Chk01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSLAL6040", "ArrActRecvIf_Chk01",
			new MCItemDef[]{
				MCItemDef.create("data_lno", "data_lno"),
				MCItemDef.create("aaIf" + ".peg_no", "peg_no"),
				MCItemDef.create("aaIf" + ".data_crud_typ", "data_crud_typ"),
				MCItemDef.create("aaIf" + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$arr_act_no + "", "arr_act_no"),
				MCItemDef.create("aaIf" + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$arr_schd_no + "", "arr_schd_no"),
				MCItemDef.create("aaIf" + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$trd_cd + "", "trd_cd"),
				MCItemDef.create("aaIf" + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$trd_ptn_typ + "", "trd_ptn_typ"),
				MCItemDef.create("aaIf" + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$purc_act_io_no + "", "purc_act_io_no"),
				MCItemDef.create("aaIf" + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$arr_tm + "", "arr_tm"),
				MCItemDef.create("aaIf" + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$ac_dt + "", "ac_dt"),
				MCItemDef.create("aaIf" + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$arr_loc_cd + "", "arr_loc_cd"),
				MCItemDef.create("aaIf" + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$str_ln_cd + "", "str_ln_cd"),
				MCItemDef.create("aaIf" + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$arr_dpt_cd + "", "arr_dpt_cd"),
				MCItemDef.create("aaIf" + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$arr_usr_cd + "", "arr_usr_cd"),
				MCItemDef.create("aaIf" + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$itm_cd + "", "itm_cd"),
				MCItemDef.create("aaIf" + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$itm_sub1 + "", "itm_sub1"),
				MCItemDef.create("aaIf" + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$itm_sub2 + "", "itm_sub2"),
				MCItemDef.create("aaIf" + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$itm_sub3 + "", "itm_sub3"),
				MCItemDef.create("aaIf" + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$itm_nm + "", "itm_nm"),
				MCItemDef.create("aaIf" + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$rcpt_iv_itm_nm + "", "rcpt_iv_itm_nm"),
				MCItemDef.create("aaIf" + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$sundry_itm_flg + "", "sundry_itm_flg"),
				MCItemDef.create("aaIf" + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$purc_id_typ + "", "purc_id_typ"),
				MCItemDef.create("aaIf" + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$stk_mng_typ + "", "stk_mng_typ"),
				MCItemDef.create("aaIf" + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$sno1 + "", "sno1"),
				MCItemDef.create("aaIf" + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$sno2 + "", "sno2"),
				MCItemDef.create("aaIf" + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$sno3 + "", "sno3"),
				MCItemDef.create("aaIf" + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$sno4 + "", "sno4"),
				MCItemDef.create("aaIf" + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$lot_no + "", "lot_no"),
				MCItemDef.create("aaIf" + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$sublot_no + "", "sublot_no"),
				MCItemDef.create("aaIf" + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$ver_no + "", "ver_no"),
				MCItemDef.create("aaIf" + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$stk_arrv_bp_cd + "", "stk_arrv_bp_cd"),
				MCItemDef.create("aaIf" + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$gd_cd + "", "gd_cd"),
				MCItemDef.create("aaIf" + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$quality_typ + "", "quality_typ"),
				MCItemDef.create("aaIf" + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$stk_insp_typ + "", "stk_insp_typ"),
				MCItemDef.create("aaIf" + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$stk_id_typ + "", "stk_id_typ"),
				MCItemDef.create("aaIf" + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$stk_bp_cd + "", "stk_bp_cd"),
				MCItemDef.create("aaIf" + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$sppl_itm_cd + "", "sppl_itm_cd"),
				MCItemDef.create("aaIf" + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$sppl_itm_nm + "", "sppl_itm_nm"),
				MCItemDef.create("aaIf" + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$cst_cd + "", "cst_cd"),
				MCItemDef.create("aaIf" + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$sppl_cd + "", "sppl_cd"),
				MCItemDef.create("aaIf" + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$maker_cd + "", "maker_cd"),
				MCItemDef.create("aaIf" + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$bp_lot_no + "", "bp_lot_no"),
				MCItemDef.create("aaIf" + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$bp_dlv_slip_no + "", "bp_dlv_slip_no"),
				MCItemDef.create("aaIf" + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$bp_dlv_slip_d_no + "", "bp_dlv_slip_d_no"),
				MCItemDef.create("aaIf" + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$ship_fr_valid_dt + "", "ship_fr_valid_dt"),
				MCItemDef.create("aaIf" + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$trd_unit_qty + "", "trd_unit_qty"),
				MCItemDef.create("aaIf" + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$trd_unit_cd + "", "trd_unit_cd"),
				MCItemDef.create("aaIf" + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$base_unit_qty + "", "base_unit_qty"),
				MCItemDef.create("aaIf" + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$base_unit_cd + "", "base_unit_cd"),
				MCItemDef.create("aaIf" + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$purc_cont_qty + "", "purc_cont_qty"),
				MCItemDef.create("aaIf" + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$rsn_cd + "", "rsn_cd"),
				MCItemDef.create("aaIf" + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$bd_dpt_cd + "", "bd_dpt_cd"),
				MCItemDef.create("aaIf" + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$sync_flg + "", "sync_flg"),
				MCItemDef.create("aaIf" + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$edi_flg + "", "edi_flg"),
				MCItemDef.create("aaIf" + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$insp_cnt_rmrks + "", "insp_cnt_rmrks"),
				MCItemDef.create("aaIf" + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$intr_rmrks + "", "intr_rmrks"),
				MCItemDef.create("aaIf" + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$trd_rmrks + "", "trd_rmrks"),
				MCItemDef.create("aaIf" + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$trd_d_rmrks + "", "trd_d_rmrks"),
				MCItemDef.create("aaIf" + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$sub_char1 + "", "sub_char1"),
				MCItemDef.create("aaIf" + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$sub_char2 + "", "sub_char2"),
				MCItemDef.create("aaIf" + "." + mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.$sub_char3 + "", "sub_char3"),
				MCItemDef.create("aaIf" + ".can_ac_dt", "can_ac_dt"),
				MCItemDef.create("aaIf" + ".arr_pr_no", "arr_pr_no"),
				MCItemDef.create("aaIf" + ".rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("aaIf" + ".iv_no", "iv_no"),
				MCItemDef.create("aaIf" + ".arr_ptn_typ", "arr_ptn_typ"),
				MCItemDef.create("aaIf" + ".abort_flg", "abort_flg"),
				MCItemDef.create("aaIf" + ".crt_lot_flg", "crt_lot_flg"),
				MCItemDef.create("aaIf" + ".same_lot_flg", "same_lot_flg"),
				MCItemDef.create("aaIf" + ".mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("aaIf" + ".pre_outsrc_act_flg", "pre_outsrc_act_flg"),
				MCItemDef.create("aaIf" + ".prnt_flg", "prnt_flg"),
				MCItemDef.create("aaIf" + ".cststk_flg", "cststk_flg"),
				MCItemDef.create("aaIf" + ".arr_pr_upd_cntr", "arr_pr_upd_cntr"),
				MCItemDef.create("aaIf" + ".arr_act_upd_cntr", "arr_act_upd_cntr"),
				MCItemDef.create("aaIf" + ".arr_dpt_cd_upd_flg", "arr_dpt_cd_upd_flg"),
				MCItemDef.create("aaIf" + ".arr_usr_cd_upd_flg", "arr_usr_cd_upd_flg"),
				MCItemDef.create("aaIf" + ".sno1_upd_flg", "sno1_upd_flg"),
				MCItemDef.create("aaIf" + ".sno2_upd_flg", "sno2_upd_flg"),
				MCItemDef.create("aaIf" + ".sno3_upd_flg", "sno3_upd_flg"),
				MCItemDef.create("aaIf" + ".sno4_upd_flg", "sno4_upd_flg"),
				MCItemDef.create("aaIf" + ".lot_no_upd_flg", "lot_no_upd_flg"),
				MCItemDef.create("aaIf" + ".sublot_no_upd_flg", "sublot_no_upd_flg"),
				MCItemDef.create("aaIf" + ".ver_no_upd_flg", "ver_no_upd_flg"),
				MCItemDef.create("aaIf" + ".stk_arrv_bp_cd_upd_flg", "stk_arrv_bp_cd_upd_flg"),
				MCItemDef.create("aaIf" + ".gd_cd_upd_flg", "gd_cd_upd_flg"),
				MCItemDef.create("aaIf" + ".quality_typ_upd_flg", "quality_typ_upd_flg"),
				MCItemDef.create("aaIf" + ".stk_insp_typ_upd_flg", "stk_insp_typ_upd_flg"),
				MCItemDef.create("aaIf" + ".stk_id_typ_upd_flg", "stk_id_typ_upd_flg"),
				MCItemDef.create("aaIf" + ".stk_bp_cd_upd_flg", "stk_bp_cd_upd_flg"),
				MCItemDef.create("aaIf" + ".sppl_itm_cd_upd_flg", "sppl_itm_cd_upd_flg"),
				MCItemDef.create("aaIf" + ".sppl_itm_nm_upd_flg", "sppl_itm_nm_upd_flg"),
				MCItemDef.create("aaIf" + ".maker_cd_upd_flg", "maker_cd_upd_flg"),
				MCItemDef.create("aaIf" + ".bp_lot_no_upd_flg", "bp_lot_no_upd_flg"),
				MCItemDef.create("aaIf" + ".bp_dlv_slip_no_upd_flg", "bp_dlv_slip_no_upd_flg"),
				MCItemDef.create("aaIf" + ".bp_dlv_slip_d_no_upd_flg", "bp_dlv_slip_d_no_upd_flg"),
				MCItemDef.create("aaIf" + ".ship_fr_valid_dt_upd_flg", "ship_fr_valid_dt_upd_flg"),
				MCItemDef.create("aaIf" + ".purc_cont_qty_upd_flg", "purc_cont_qty_upd_flg"),
				MCItemDef.create("aaIf" + ".insp_cnt_rmrks_upd_flg", "insp_cnt_rmrks_upd_flg"),
				MCItemDef.create("aaIf" + ".intr_rmrks_upd_flg", "intr_rmrks_upd_flg"),
				MCItemDef.create("aaIf" + ".trd_rmrks_upd_flg", "trd_rmrks_upd_flg"),
				MCItemDef.create("aaIf" + ".trd_d_rmrks_upd_flg", "trd_d_rmrks_upd_flg"),
				MCItemDef.create("aaIf" + ".sub_char1_upd_flg", "sub_char1_upd_flg"),
				MCItemDef.create("aaIf" + ".sub_char2_upd_flg", "sub_char2_upd_flg"),
				MCItemDef.create("aaIf" + ".sub_char3_upd_flg", "sub_char3_upd_flg"),
				MCItemDef.create("aaIf" + ".arr_pr_no_upd_flg", "arr_pr_no_upd_flg"),
				MCItemDef.create("aaIf" + ".iv_no_upd_flg", "iv_no_upd_flg")
			}
			,
			MCBlockDef.create("ArrActRecvIf_Chk01_Dtl2")
		);
	}
	//FMCB DEF_CLASSES END
}

