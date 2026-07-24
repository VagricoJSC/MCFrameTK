package mcframe.serverPFBZ.PFBZL9050;

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
 * [PFBZL_SendRecvIfCtrl]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("PF.PFBZL9050.Srch01.UP.BLOCK0")){
			return PF_PFBZL9050_Srch01_UP_BLOCK0();
		}
		else if (id.equals("PF.PFBZL9050.Srch01.DOWN.BLOCK0")){
			return PF_PFBZL9050_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("PF.PFBZL9050.Srch02.UP.BLOCK0")){
			return PF_PFBZL9050_Srch02_UP_BLOCK0();
		}
		else if (id.equals("PF.PFBZL9050.Srch02.DOWN.BLOCK0")){
			return PF_PFBZL9050_Srch02_DOWN_BLOCK0();
		}
		else if (id.equals("PF.PFBZL9050.Ins01.UP.BLOCK0")){
			return PF_PFBZL9050_Ins01_UP_BLOCK0();
		}
		else if (id.equals("PF.PFBZL9050.Upd01.UP.BLOCK0")){
			return PF_PFBZL9050_Upd01_UP_BLOCK0();
		}
		else if (id.equals("PF.PFBZL9050.UpdEsb01.UP.BLOCK0")){
			return PF_PFBZL9050_UpdEsb01_UP_BLOCK0();
		}
		else if (id.equals("PF.PFBZL9050.UpdWk01.UP.BLOCK0")){
			return PF_PFBZL9050_UpdWk01_UP_BLOCK0();
		}
		else if (id.equals("PF.PFBZL9050.Can01.UP.BLOCK0")){
			return PF_PFBZL9050_Can01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
							
	
	static final MCOperationInfo PF_PFBZL9050_Srch01_INFO = new MCOperationInfo("PF", "PFBZL9050", "Srch01", "000000", new PDef());

	public static MCContainerDef PF_PFBZL9050_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("PF", "PFBZL9050", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("notyet_flg", "notyet_flg"),
				MCItemDef.create("send_conv_err_flg", "send_conv_err_flg"),
				MCItemDef.create("send_conv_ok_flg", "send_conv_ok_flg"),
				MCItemDef.create("send_err_flg", "send_err_flg"),
				MCItemDef.create("send_ok_flg", "send_ok_flg"),
				MCItemDef.create("recv_err_flg", "recv_err_flg"),
				MCItemDef.create("recv_ok_flg", "recv_ok_flg"),
				MCItemDef.create("recv_conv_err_flg", "recv_conv_err_flg"),
				MCItemDef.create("recv_conv_ok_flg", "recv_conv_ok_flg"),
				MCItemDef.create("if_proc_typ", "if_proc_typ"),
				MCItemDef.create("data_no_fr", "data_no_fr"),
				MCItemDef.create("data_no_to", "data_no_to"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_sys_nm", "ext_sys_nm"),
				MCItemDef.create("ins_ts_fr", "ins_ts_fr"),
				MCItemDef.create("ins_ts_to", "ins_ts_to"),
				MCItemDef.create("sdrv_tm_fr", "sdrv_tm_fr"),
				MCItemDef.create("sdrv_tm_to", "sdrv_tm_to"),
				MCItemDef.create("file_nm", "file_nm"),
				MCItemDef.create("batch_log_no", "batch_log_no"),
				MCItemDef.create("ins_srv_req_no", "ins_srv_req_no"),
				MCItemDef.create("not_send_flg", "not_send_flg"),
				MCItemDef.create("not_send_upd_flg", "not_send_upd_flg"),
				MCItemDef.create("attr_char1", "attr_char1"),
				MCItemDef.create("attr_char2", "attr_char2"),
				MCItemDef.create("attr_char3", "attr_char3"),
				MCItemDef.create("attr_char4", "attr_char4"),
				MCItemDef.create("attr_char5", "attr_char5"),
				MCItemDef.create("attr_char6", "attr_char6"),
				MCItemDef.create("attr_char7", "attr_char7"),
				MCItemDef.create("attr_char8", "attr_char8"),
				MCItemDef.create("attr_char9", "attr_char9"),
				MCItemDef.create("attr_char10", "attr_char10"),
				MCItemDef.create("attr_char11", "attr_char11"),
				MCItemDef.create("attr_char12", "attr_char12"),
				MCItemDef.create("attr_char13", "attr_char13"),
				MCItemDef.create("attr_char14", "attr_char14"),
				MCItemDef.create("attr_char15", "attr_char15"),
				MCItemDef.create("attr_char16", "attr_char16"),
				MCItemDef.create("attr_char17", "attr_char17"),
				MCItemDef.create("attr_char18", "attr_char18"),
				MCItemDef.create("attr_char19", "attr_char19"),
				MCItemDef.create("attr_char20", "attr_char20"),
				MCItemDef.create("attr_char21", "attr_char21"),
				MCItemDef.create("attr_char22", "attr_char22"),
				MCItemDef.create("attr_char23", "attr_char23"),
				MCItemDef.create("attr_char24", "attr_char24"),
				MCItemDef.create("attr_char25", "attr_char25"),
				MCItemDef.create("attr_char26", "attr_char26"),
				MCItemDef.create("attr_char27", "attr_char27"),
				MCItemDef.create("attr_char28", "attr_char28"),
				MCItemDef.create("attr_char29", "attr_char29"),
				MCItemDef.create("attr_char30", "attr_char30"),
				MCItemDef.create("attr_num1", "attr_num1"),
				MCItemDef.create("attr_num2", "attr_num2"),
				MCItemDef.create("attr_num3", "attr_num3"),
				MCItemDef.create("attr_num4", "attr_num4"),
				MCItemDef.create("attr_num5", "attr_num5"),
				MCItemDef.create("attr_dt1_fr", "attr_dt1_fr"),
				MCItemDef.create("attr_dt1_to", "attr_dt1_to"),
				MCItemDef.create("attr_dt2_fr", "attr_dt2_fr"),
				MCItemDef.create("attr_dt2_to", "attr_dt2_to"),
				MCItemDef.create("attr_dt3_fr", "attr_dt3_fr"),
				MCItemDef.create("attr_dt3_to", "attr_dt3_to"),
				MCItemDef.create("attr_dt4_fr", "attr_dt4_fr"),
				MCItemDef.create("attr_dt4_to", "attr_dt4_to"),
				MCItemDef.create("attr_dt5_fr", "attr_dt5_fr"),
				MCItemDef.create("attr_dt5_to", "attr_dt5_to"),
				MCItemDef.create("attr_tm1_fr", "attr_tm1_fr"),
				MCItemDef.create("attr_tm1_to", "attr_tm1_to"),
				MCItemDef.create("attr_tm2_fr", "attr_tm2_fr"),
				MCItemDef.create("attr_tm2_to", "attr_tm2_to"),
				MCItemDef.create("attr_tm3_fr", "attr_tm3_fr"),
				MCItemDef.create("attr_tm3_to", "attr_tm3_to"),
				MCItemDef.create("attr_tm4_fr", "attr_tm4_fr"),
				MCItemDef.create("attr_tm4_to", "attr_tm4_to"),
				MCItemDef.create("attr_tm5_fr", "attr_tm5_fr"),
				MCItemDef.create("attr_tm5_to", "attr_tm5_to"),
				MCItemDef.create("batch_flg", "batch_flg")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef PF_PFBZL9050_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("PF", "PFBZL9050", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("sdrvIf" + ".not_send_flg", "not_send_flg"),
				MCItemDef.create("sdrvIf" + ".not_send_upd_flg", "not_send_upd_flg"),
				MCItemDef.create("sdrvIf" + ".if_proc_typ", "if_proc_typ"),
				MCItemDef.create("if_proc_typ_nm", "if_proc_typ_nm"),
				MCItemDef.create("sdrvIf" + ".data_no", "data_no"),
				MCItemDef.create("sdrvIf" + ".ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_sys_nm", "ext_sys_nm"),
				MCItemDef.create("sdrvIf" + ".sdrv_if_rmrks", "sdrv_if_rmrks"),
				MCItemDef.create("sdrvIf" + ".sdrv_sts_typ", "sdrv_sts_typ"),
				MCItemDef.create("sdrv_sts_typ_nm", "sdrv_sts_typ_nm"),
				MCItemDef.create("sdrvIf" + ".ins_ts", "ins_ts"),
				MCItemDef.create("sdrvIf" + ".sdrv_tm", "sdrv_tm"),
				MCItemDef.create("sdrvIf" + ".conv_ope", "conv_ope"),
				MCItemDef.create("sdrvIf" + ".file_io_ope", "file_io_ope"),
				MCItemDef.create("sdrvIf" + ".web_api_ope", "web_api_ope"),
				MCItemDef.create("sdrvIf" + ".cmd_exec_ope", "cmd_exec_ope"),
				MCItemDef.create("sdrvIf" + ".sdrv_clt_id", "sdrv_clt_id"),
				MCItemDef.create("sdrvIf" + ".sdrv_usr_id", "sdrv_usr_id"),
				MCItemDef.create("sdrvIf" + ".sdrv_usr_nm", "sdrv_usr_nm"),
				MCItemDef.create("sdrvIf" + ".attr_char1", "attr_char1"),
				MCItemDef.create("sdrvIf" + ".attr_char2", "attr_char2"),
				MCItemDef.create("sdrvIf" + ".attr_char3", "attr_char3"),
				MCItemDef.create("sdrvIf" + ".attr_char4", "attr_char4"),
				MCItemDef.create("sdrvIf" + ".attr_char5", "attr_char5"),
				MCItemDef.create("sdrvIf" + ".attr_char6", "attr_char6"),
				MCItemDef.create("sdrvIf" + ".attr_char7", "attr_char7"),
				MCItemDef.create("sdrvIf" + ".attr_char8", "attr_char8"),
				MCItemDef.create("sdrvIf" + ".attr_char9", "attr_char9"),
				MCItemDef.create("sdrvIf" + ".attr_char10", "attr_char10"),
				MCItemDef.create("sdrvIf" + ".attr_char11", "attr_char11"),
				MCItemDef.create("sdrvIf" + ".attr_char12", "attr_char12"),
				MCItemDef.create("sdrvIf" + ".attr_char13", "attr_char13"),
				MCItemDef.create("sdrvIf" + ".attr_char14", "attr_char14"),
				MCItemDef.create("sdrvIf" + ".attr_char15", "attr_char15"),
				MCItemDef.create("sdrvIf" + ".attr_char16", "attr_char16"),
				MCItemDef.create("sdrvIf" + ".attr_char17", "attr_char17"),
				MCItemDef.create("sdrvIf" + ".attr_char18", "attr_char18"),
				MCItemDef.create("sdrvIf" + ".attr_char19", "attr_char19"),
				MCItemDef.create("sdrvIf" + ".attr_char20", "attr_char20"),
				MCItemDef.create("sdrvIf" + ".attr_char21", "attr_char21"),
				MCItemDef.create("sdrvIf" + ".attr_char22", "attr_char22"),
				MCItemDef.create("sdrvIf" + ".attr_char23", "attr_char23"),
				MCItemDef.create("sdrvIf" + ".attr_char24", "attr_char24"),
				MCItemDef.create("sdrvIf" + ".attr_char25", "attr_char25"),
				MCItemDef.create("sdrvIf" + ".attr_char26", "attr_char26"),
				MCItemDef.create("sdrvIf" + ".attr_char27", "attr_char27"),
				MCItemDef.create("sdrvIf" + ".attr_char28", "attr_char28"),
				MCItemDef.create("sdrvIf" + ".attr_char29", "attr_char29"),
				MCItemDef.create("sdrvIf" + ".attr_char30", "attr_char30"),
				MCItemDef.create("sdrvIf" + ".attr_num1", "attr_num1"),
				MCItemDef.create("sdrvIf" + ".attr_num2", "attr_num2"),
				MCItemDef.create("sdrvIf" + ".attr_num3", "attr_num3"),
				MCItemDef.create("sdrvIf" + ".attr_num4", "attr_num4"),
				MCItemDef.create("sdrvIf" + ".attr_num5", "attr_num5"),
				MCItemDef.create("sdrvIf" + ".attr_dt1", "attr_dt1"),
				MCItemDef.create("sdrvIf" + ".attr_dt2", "attr_dt2"),
				MCItemDef.create("sdrvIf" + ".attr_dt3", "attr_dt3"),
				MCItemDef.create("sdrvIf" + ".attr_dt4", "attr_dt4"),
				MCItemDef.create("sdrvIf" + ".attr_dt5", "attr_dt5"),
				MCItemDef.create("sdrvIf" + ".attr_tm1", "attr_tm1"),
				MCItemDef.create("sdrvIf" + ".attr_tm2", "attr_tm2"),
				MCItemDef.create("sdrvIf" + ".attr_tm3", "attr_tm3"),
				MCItemDef.create("sdrvIf" + ".attr_tm4", "attr_tm4"),
				MCItemDef.create("sdrvIf" + ".attr_tm5", "attr_tm5"),
				MCItemDef.create("sdrvIf" + ".batch_log_no", "batch_log_no"),
				MCItemDef.create("sdrvIf" + ".log_sub_key1", "log_sub_key1"),
				MCItemDef.create("sdrvIf" + ".log_sub_key2", "log_sub_key2"),
				MCItemDef.create("ifFile" + ".file_id", "file_id"),
				MCItemDef.create("ifFile" + ".file_path", "file_path"),
				MCItemDef.create("ifFile" + ".file_nm", "file_nm"),
				MCItemDef.create("real_imp_flg", "real_imp_flg")
			}
			,
			MCBlockDef.create("Srch01_Dtl")
		);
	}
	
	static final MCOperationInfo PF_PFBZL9050_Srch02_INFO = new MCOperationInfo("PF", "PFBZL9050", "Srch02", "000000", new PDef());

	public static MCContainerDef PF_PFBZL9050_Srch02_UP_BLOCK0() {

		return new MCGeneralContainerDef("PF", "PFBZL9050", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("if_proc_typ", "if_proc_typ"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd")
			}
			,
			MCBlockDef.create("Srch02_Cnd")
		);
	}


	public static MCContainerDef PF_PFBZL9050_Srch02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("PF", "PFBZL9050", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("sdrvIf" + ".if_proc_typ", "if_proc_typ"),
				MCItemDef.create("sdrvIf" + ".data_no", "data_no"),
				MCItemDef.create("sdrvIf" + ".ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("sdrvIf" + ".sdrv_sts_typ", "sdrv_sts_typ"),
				MCItemDef.create("ifFile" + ".file_id", "file_id"),
				MCItemDef.create("ifFile" + ".file_path", "file_path"),
				MCItemDef.create("ifFile" + ".file_nm", "file_nm"),
				MCItemDef.create("remote_dir", "remote_dir"),
				MCItemDef.create("transfer_lock_typ", "transfer_lock_typ"),
				MCItemDef.create("sts_fsuffix", "sts_fsuffix"),
				MCItemDef.create("ftp_host", "ftp_host"),
				MCItemDef.create("ftp_user", "ftp_user"),
				MCItemDef.create("ftp_password", "ftp_password"),
				MCItemDef.create("ftp_port", "ftp_port"),
				MCItemDef.create("ftp_mode", "ftp_mode"),
				MCItemDef.create("ftp_opts", "ftp_opts"),
				MCItemDef.create("sftp_host", "sftp_host"),
				MCItemDef.create("sftp_user", "sftp_user"),
				MCItemDef.create("sftp_password", "sftp_password"),
				MCItemDef.create("sftp_port", "sftp_port"),
				MCItemDef.create("sftp_key_file_path", "sftp_key_file_path")
			}
			,
			MCBlockDef.create("Srch02_Dtl")
		);
	}
	
	static final MCOperationInfo PF_PFBZL9050_Ins01_INFO = new MCOperationInfo("PF", "PFBZL9050", "Ins01", "000000", new PDef());

	public static MCContainerDef PF_PFBZL9050_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("PF", "PFBZL9050", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("if_proc_typ", "if_proc_typ"),
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("not_send_upd_flg", "not_send_upd_flg"),
				MCItemDef.create("sdrv_clt_id", "sdrv_clt_id"),
				MCItemDef.create("sdrv_usr_id", "sdrv_usr_id"),
				MCItemDef.create("sdrv_usr_nm", "sdrv_usr_nm"),
				MCItemDef.create("attr_char1", "attr_char1"),
				MCItemDef.create("attr_char2", "attr_char2"),
				MCItemDef.create("attr_char3", "attr_char3"),
				MCItemDef.create("attr_char4", "attr_char4"),
				MCItemDef.create("attr_char5", "attr_char5"),
				MCItemDef.create("attr_char6", "attr_char6"),
				MCItemDef.create("attr_char7", "attr_char7"),
				MCItemDef.create("attr_char8", "attr_char8"),
				MCItemDef.create("attr_char9", "attr_char9"),
				MCItemDef.create("attr_char10", "attr_char10"),
				MCItemDef.create("attr_char11", "attr_char11"),
				MCItemDef.create("attr_char12", "attr_char12"),
				MCItemDef.create("attr_char13", "attr_char13"),
				MCItemDef.create("attr_char14", "attr_char14"),
				MCItemDef.create("attr_char15", "attr_char15"),
				MCItemDef.create("attr_char16", "attr_char16"),
				MCItemDef.create("attr_char17", "attr_char17"),
				MCItemDef.create("attr_char18", "attr_char18"),
				MCItemDef.create("attr_char19", "attr_char19"),
				MCItemDef.create("attr_char20", "attr_char20"),
				MCItemDef.create("attr_char21", "attr_char21"),
				MCItemDef.create("attr_char22", "attr_char22"),
				MCItemDef.create("attr_char23", "attr_char23"),
				MCItemDef.create("attr_char24", "attr_char24"),
				MCItemDef.create("attr_char25", "attr_char25"),
				MCItemDef.create("attr_char26", "attr_char26"),
				MCItemDef.create("attr_char27", "attr_char27"),
				MCItemDef.create("attr_char28", "attr_char28"),
				MCItemDef.create("attr_char29", "attr_char29"),
				MCItemDef.create("attr_char30", "attr_char30"),
				MCItemDef.create("attr_num1", "attr_num1"),
				MCItemDef.create("attr_num2", "attr_num2"),
				MCItemDef.create("attr_num3", "attr_num3"),
				MCItemDef.create("attr_num4", "attr_num4"),
				MCItemDef.create("attr_num5", "attr_num5"),
				MCItemDef.create("attr_dt1", "attr_dt1"),
				MCItemDef.create("attr_dt2", "attr_dt2"),
				MCItemDef.create("attr_dt3", "attr_dt3"),
				MCItemDef.create("attr_dt4", "attr_dt4"),
				MCItemDef.create("attr_dt5", "attr_dt5"),
				MCItemDef.create("attr_tm1", "attr_tm1"),
				MCItemDef.create("attr_tm2", "attr_tm2"),
				MCItemDef.create("attr_tm3", "attr_tm3"),
				MCItemDef.create("attr_tm4", "attr_tm4"),
				MCItemDef.create("attr_tm5", "attr_tm5"),
				MCItemDef.create("webapi_not_link_flg", "webapi_not_link_flg")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo PF_PFBZL9050_Upd01_INFO = new MCOperationInfo("PF", "PFBZL9050", "Upd01", "000000", new PDef());

	public static MCContainerDef PF_PFBZL9050_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("PF", "PFBZL9050", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("sdrvIf" + ".data_no", "data_no"),
				MCItemDef.create("sdrvIf" + ".not_send_flg", "not_send_flg"),
				MCItemDef.create("sdrvIf" + ".not_send_upd_flg", "not_send_upd_flg"),
				MCItemDef.create("sdrvIf" + ".sdrv_if_rmrks", "sdrv_if_rmrks")
			}
			,
			MCBlockDef.create("Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo PF_PFBZL9050_UpdEsb01_INFO = new MCOperationInfo("PF", "PFBZL9050", "UpdEsb01", "000000", new PDef());

	public static MCContainerDef PF_PFBZL9050_UpdEsb01_UP_BLOCK0() {

		return new MCGeneralContainerDef("PF", "PFBZL9050", "UpdEsb01",
			new MCItemDef[]{
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("sdrv_sts_typ", "sdrv_sts_typ")
			}
			,
			MCBlockDef.create("UpdEsb01_Dtl")
		);
	}
	
	static final MCOperationInfo PF_PFBZL9050_UpdWk01_INFO = new MCOperationInfo("PF", "PFBZL9050", "UpdWk01", "000000", new PDef());

	public static MCContainerDef PF_PFBZL9050_UpdWk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("PF", "PFBZL9050", "UpdWk01",
			new MCItemDef[]{
				MCItemDef.create("sdrvIfWk" + ".data_no", "data_no"),
				MCItemDef.create("sdrvIfWk" + ".if_proc_typ", "if_proc_typ"),
				MCItemDef.create("sdrvIfWk" + ".ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("sdrvIfWk" + ".sdrv_clt_id", "sdrvIfWk" + ".sdrv_clt_id"),
				MCItemDef.create("sdrvIfWk" + ".sdrv_usr_id", "sdrvIfWk" + ".sdrv_usr_id"),
				MCItemDef.create("sdrvIfWk" + ".sdrv_usr_nm", "sdrvIfWk" + ".sdrv_usr_nm"),
				MCItemDef.create("sdrvIfWk" + ".attr_char1", "sdrvIfWk" + ".attr_char1"),
				MCItemDef.create("sdrvIfWk" + ".attr_char2", "sdrvIfWk" + ".attr_char2"),
				MCItemDef.create("sdrvIfWk" + ".attr_char3", "sdrvIfWk" + ".attr_char3"),
				MCItemDef.create("sdrvIfWk" + ".attr_char4", "sdrvIfWk" + ".attr_char4"),
				MCItemDef.create("sdrvIfWk" + ".attr_char5", "sdrvIfWk" + ".attr_char5"),
				MCItemDef.create("sdrvIfWk" + ".attr_char6", "sdrvIfWk" + ".attr_char6"),
				MCItemDef.create("sdrvIfWk" + ".attr_char7", "sdrvIfWk" + ".attr_char7"),
				MCItemDef.create("sdrvIfWk" + ".attr_char8", "sdrvIfWk" + ".attr_char8"),
				MCItemDef.create("sdrvIfWk" + ".attr_char9", "sdrvIfWk" + ".attr_char9"),
				MCItemDef.create("sdrvIfWk" + ".attr_char10", "sdrvIfWk" + ".attr_char10"),
				MCItemDef.create("sdrvIfWk" + ".attr_char11", "sdrvIfWk" + ".attr_char11"),
				MCItemDef.create("sdrvIfWk" + ".attr_char12", "sdrvIfWk" + ".attr_char12"),
				MCItemDef.create("sdrvIfWk" + ".attr_char13", "sdrvIfWk" + ".attr_char13"),
				MCItemDef.create("sdrvIfWk" + ".attr_char14", "sdrvIfWk" + ".attr_char14"),
				MCItemDef.create("sdrvIfWk" + ".attr_char15", "sdrvIfWk" + ".attr_char15"),
				MCItemDef.create("sdrvIfWk" + ".attr_char16", "sdrvIfWk" + ".attr_char16"),
				MCItemDef.create("sdrvIfWk" + ".attr_char17", "sdrvIfWk" + ".attr_char17"),
				MCItemDef.create("sdrvIfWk" + ".attr_char18", "sdrvIfWk" + ".attr_char18"),
				MCItemDef.create("sdrvIfWk" + ".attr_char19", "sdrvIfWk" + ".attr_char19"),
				MCItemDef.create("sdrvIfWk" + ".attr_char20", "sdrvIfWk" + ".attr_char20"),
				MCItemDef.create("sdrvIfWk" + ".attr_char21", "sdrvIfWk" + ".attr_char21"),
				MCItemDef.create("sdrvIfWk" + ".attr_char22", "sdrvIfWk" + ".attr_char22"),
				MCItemDef.create("sdrvIfWk" + ".attr_char23", "sdrvIfWk" + ".attr_char23"),
				MCItemDef.create("sdrvIfWk" + ".attr_char24", "sdrvIfWk" + ".attr_char24"),
				MCItemDef.create("sdrvIfWk" + ".attr_char25", "sdrvIfWk" + ".attr_char25"),
				MCItemDef.create("sdrvIfWk" + ".attr_char26", "sdrvIfWk" + ".attr_char26"),
				MCItemDef.create("sdrvIfWk" + ".attr_char27", "sdrvIfWk" + ".attr_char27"),
				MCItemDef.create("sdrvIfWk" + ".attr_char28", "sdrvIfWk" + ".attr_char28"),
				MCItemDef.create("sdrvIfWk" + ".attr_char29", "sdrvIfWk" + ".attr_char29"),
				MCItemDef.create("sdrvIfWk" + ".attr_char30", "sdrvIfWk" + ".attr_char30"),
				MCItemDef.create("sdrvIfWk" + ".attr_num1", "sdrvIfWk" + ".attr_num1"),
				MCItemDef.create("sdrvIfWk" + ".attr_num2", "sdrvIfWk" + ".attr_num2"),
				MCItemDef.create("sdrvIfWk" + ".attr_num3", "sdrvIfWk" + ".attr_num3"),
				MCItemDef.create("sdrvIfWk" + ".attr_num4", "sdrvIfWk" + ".attr_num4"),
				MCItemDef.create("sdrvIfWk" + ".attr_num5", "sdrvIfWk" + ".attr_num5"),
				MCItemDef.create("sdrvIfWk" + ".attr_dt1", "sdrvIfWk" + ".attr_dt1"),
				MCItemDef.create("sdrvIfWk" + ".attr_dt2", "sdrvIfWk" + ".attr_dt2"),
				MCItemDef.create("sdrvIfWk" + ".attr_dt3", "sdrvIfWk" + ".attr_dt3"),
				MCItemDef.create("sdrvIfWk" + ".attr_dt4", "sdrvIfWk" + ".attr_dt4"),
				MCItemDef.create("sdrvIfWk" + ".attr_dt5", "sdrvIfWk" + ".attr_dt5"),
				MCItemDef.create("sdrvIfWk" + ".attr_tm1", "sdrvIfWk" + ".attr_tm1"),
				MCItemDef.create("sdrvIfWk" + ".attr_tm2", "sdrvIfWk" + ".attr_tm2"),
				MCItemDef.create("sdrvIfWk" + ".attr_tm3", "sdrvIfWk" + ".attr_tm3"),
				MCItemDef.create("sdrvIfWk" + ".attr_tm4", "sdrvIfWk" + ".attr_tm4"),
				MCItemDef.create("sdrvIfWk" + ".attr_tm5", "sdrvIfWk" + ".attr_tm5")
			}
			,
			MCBlockDef.create("UpdWk01_Dtl")
		);
	}
	
	static final MCOperationInfo PF_PFBZL9050_Can01_INFO = new MCOperationInfo("PF", "PFBZL9050", "Can01", "000000", new PDef());

	public static MCContainerDef PF_PFBZL9050_Can01_UP_BLOCK0() {

		return new MCGeneralContainerDef("PF", "PFBZL9050", "Can01",
			new MCItemDef[]{
				MCItemDef.create("sdrvIf" + ".if_proc_typ", "if_proc_typ"),
				MCItemDef.create("sdrvIf" + ".data_no", "data_no"),
				MCItemDef.create("ifFile" + ".file_id", "file_id")
			}
			,
			MCBlockDef.create("Can01_Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

