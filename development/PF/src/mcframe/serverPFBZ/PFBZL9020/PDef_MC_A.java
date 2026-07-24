package mcframe.serverPFBZ.PFBZL9020;

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
 * [PFBZL_FileOutput]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("PF.PFBZL9020.Send01.UP.BLOCK0")){
			return PF_PFBZL9020_Send01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo PF_PFBZL9020_Send01_INFO = new MCOperationInfo("PF", "PFBZL9020", "Send01", "000000", new PDef());

	public static MCContainerDef PF_PFBZL9020_Send01_UP_BLOCK0() {

		return new MCGeneralContainerDef("PF", "PFBZL9020", "Send01",
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
				MCItemDef.create("not_send_flg", "not_send_flg"),
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
			MCBlockDef.create("SendCnd")
		);
	}


	//FMCB DEF_CLASSES END
}

