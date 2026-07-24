package mcframe.clientPFBZ.PFBZP0020;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [PFBZP_RecvIfSrch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("PF.PFBZL0020.Srch01.UP.BLOCK0")){
			return PF_PFBZL0020_Srch01_UP_BLOCK0();
		}
		else if (id.equals("PF.PFBZL0020.Srch01.DOWN.BLOCK0")){
			return PF_PFBZL0020_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("PF.PFBZL0020.Srch02.UP.BLOCK0")){
			return PF_PFBZL0020_Srch02_UP_BLOCK0();
		}
		else if (id.equals("PF.PFBZL0020.Srch02.DOWN.BLOCK0")){
			return PF_PFBZL0020_Srch02_DOWN_BLOCK0();
		}
		else if (id.equals("PF.PFBZL0020.Conv01.UP.BLOCK0")){
			return PF_PFBZL0020_Conv01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
			
	
	static final MCOperationInfo PF_PFBZL0020_Srch01_INFO = new MCOperationInfo("PF", "PFBZL0020", "Srch01", "000000", new PDef());

	public static MCContainerDef PF_PFBZL0020_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("PF", "PFBZL0020", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("recv_err_flg", "recv_err_flg"),
				MCItemDef.create("recv_ok_flg", "recv_ok_flg"),
				MCItemDef.create("recv_conv_err_flg", "recv_conv_err_flg"),
				MCItemDef.create("recv_conv_ok_flg", "recv_conv_ok_flg"),
				MCItemDef.create("if_proc_typ", "if_proc_typ"),
				MCItemDef.create("data_no_fr", "data_no_fr"),
				MCItemDef.create("data_no_to", "data_no_to"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_sys_nm", "ext_sys_nm"),
				MCItemDef.create("sdrv_tm_fr", "sdrv_tm_fr"),
				MCItemDef.create("sdrv_tm_to", "sdrv_tm_to"),
				MCItemDef.create("file_nm", "file_nm"),
				MCItemDef.create("batch_log_no", "batch_log_no"),
				MCItemDef.create("ins_srv_req_no", "ins_srv_req_no"),
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
				MCItemDef.create("attr_tm5_to", "attr_tm5_to")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef PF_PFBZL0020_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("PF", "PFBZL0020", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("if_proc_typ", "if_proc_typ"),
				MCItemDef.create("if_proc_typ_nm", "if_proc_typ_nm"),
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_sys_nm", "ext_sys_nm"),
				MCItemDef.create("sdrv_sts_typ", "sdrv_sts_typ"),
				MCItemDef.create("sdrv_sts_typ_nm", "sdrv_sts_typ_nm"),
				MCItemDef.create("sdrv_tm", "sdrv_tm"),
				MCItemDef.create("conv_ope", "conv_ope"),
				MCItemDef.create("file_io_ope", "file_io_ope"),
				MCItemDef.create("web_api_ope", "web_api_ope"),
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
				MCItemDef.create("batch_log_no", "batch_log_no"),
				MCItemDef.create("log_sub_key1", "log_sub_key1"),
				MCItemDef.create("log_sub_key2", "log_sub_key2"),
				MCItemDef.create("file_id", "file_id"),
				MCItemDef.create("file_path", "file_path"),
				MCItemDef.create("file_nm", "file_nm")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo PF_PFBZL0020_Srch02_INFO = new MCOperationInfo("PF", "PFBZL0020", "Srch02", "000000", new PDef());

	public static MCContainerDef PF_PFBZL0020_Srch02_UP_BLOCK0() {
		/** Ope.のBlock [Srch02_BatchLogKey] に対する電文項目定義 */
		return new MCGeneralContainerDef("PF", "PFBZL0020", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("batch_log_no", "batch_log_no")
			}
			,
			MCBlockDef.create("BatchLogKey")
		);
	}


	public static MCContainerDef PF_PFBZL0020_Srch02_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch02_BatchLogMsg] に対する電文項目定義 */
		return new MCGeneralContainerDef("PF", "PFBZL0020", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("batch_log_typ", "batch_log_typ"),
				MCItemDef.create("batch_log_typ_nm", "batch_log_typ_nm"),
				MCItemDef.create("msg_id", "msg_id"),
				MCItemDef.create("msg_txt", "msg_txt"),
				MCItemDef.create("msg_lvl", "msg_lvl"),
				MCItemDef.create("log_ts", "log_ts"),
				MCItemDef.create("seq", "seq"),
				MCItemDef.create("batch_log_no", "batch_log_no"),
				MCItemDef.create("log_sub_key1", "log_sub_key1"),
				MCItemDef.create("log_sub_key2", "log_sub_key2")
			}
			,
			MCBlockDef.create("BatchLogMsg")
		);
	}
	
	static final MCOperationInfo PF_PFBZL0020_Conv01_INFO = new MCOperationInfo("PF", "PFBZL0020", "Conv01", "000000", new PDef());

	public static MCContainerDef PF_PFBZL0020_Conv01_UP_BLOCK0() {
		/** Ope.のBlock [Conv01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("PF", "PFBZL0020", "Conv01",
			new MCItemDef[]{
				MCItemDef.create("if_proc_typ", "if_proc_typ"),
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("conv_ope", "conv_ope")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

