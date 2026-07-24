package mcframe.serverPFUD.PFUDL5010;

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
 * [PFUDL_SendRecvLogicBase]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("PF.PFUDL5010.ConvBase01.UP.BLOCK0")){
			return PF_PFUDL5010_ConvBase01_UP_BLOCK0();
		}
		else if (id.equals("PF.PFUDL5010.ConvBase01.DOWN.BLOCK0")){
			return PF_PFUDL5010_ConvBase01_DOWN_BLOCK0();
		}
		else if (id.equals("PF.PFUDL5010.ConvBase02.UP.BLOCK0")){
			return PF_PFUDL5010_ConvBase02_UP_BLOCK0();
		}
		else if (id.equals("PF.PFUDL5010.ConvBase02.DOWN.BLOCK0")){
			return PF_PFUDL5010_ConvBase02_DOWN_BLOCK0();
		}
		else if (id.equals("PF.PFUDL5010.ConvBase03.UP.BLOCK0")){
			return PF_PFUDL5010_ConvBase03_UP_BLOCK0();
		}
		else if (id.equals("PF.PFUDL5010.ConvBase03.DOWN.BLOCK0")){
			return PF_PFUDL5010_ConvBase03_DOWN_BLOCK0();
		}
		else if (id.equals("PF.PFUDL5010.ConvBase04.UP.BLOCK0")){
			return PF_PFUDL5010_ConvBase04_UP_BLOCK0();
		}
		else if (id.equals("PF.PFUDL5010.ConvBase04.DOWN.BLOCK0")){
			return PF_PFUDL5010_ConvBase04_DOWN_BLOCK0();
		}
		else if (id.equals("PF.PFUDL5010.ConvBase05.UP.BLOCK0")){
			return PF_PFUDL5010_ConvBase05_UP_BLOCK0();
		}
		else if (id.equals("PF.PFUDL5010.ConvBase05.DOWN.BLOCK0")){
			return PF_PFUDL5010_ConvBase05_DOWN_BLOCK0();
		}
		else if (id.equals("PF.PFUDL5010.ConvBase06.UP.BLOCK0")){
			return PF_PFUDL5010_ConvBase06_UP_BLOCK0();
		}
		else if (id.equals("PF.PFUDL5010.ConvBase06.DOWN.BLOCK0")){
			return PF_PFUDL5010_ConvBase06_DOWN_BLOCK0();
		}
		else if (id.equals("PF.PFUDL5010.ConvBase07.UP.BLOCK0")){
			return PF_PFUDL5010_ConvBase07_UP_BLOCK0();
		}
		else if (id.equals("PF.PFUDL5010.ConvBase07.DOWN.BLOCK0")){
			return PF_PFUDL5010_ConvBase07_DOWN_BLOCK0();
		}
		else if (id.equals("PF.PFUDL5010.ConvBase08.UP.BLOCK0")){
			return PF_PFUDL5010_ConvBase08_UP_BLOCK0();
		}
		else if (id.equals("PF.PFUDL5010.ConvBase08.DOWN.BLOCK0")){
			return PF_PFUDL5010_ConvBase08_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
								
	
	static final MCOperationInfo PF_PFUDL5010_ConvBase01_INFO = new MCOperationInfo("PF", "PFUDL5010", "ConvBase01", "000000", new PDef());

	public static MCContainerDef PF_PFUDL5010_ConvBase01_UP_BLOCK0() {

		return new MCGeneralContainerDef("PF", "PFUDL5010", "ConvBase01",
			new MCItemDef[]{
				MCItemDef.create("if_proc_typ", "if_proc_typ"),
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("co_cd", "co_cd")
			}
			,
			MCBlockDef.create("ConvDtl")
		);
	}


	public static MCContainerDef PF_PFUDL5010_ConvBase01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("PF", "PFUDL5010", "ConvBase01",
			new MCItemDef[]{
				MCItemDef.create("if_proc_typ", "if_proc_typ"),
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("sdrv_sts_typ", "sdrv_sts_typ")
			}
			,
			MCBlockDef.create("ConvDtl")
		);
	}
	
	static final MCOperationInfo PF_PFUDL5010_ConvBase02_INFO = new MCOperationInfo("PF", "PFUDL5010", "ConvBase02", "000000", new PDef());

	public static MCContainerDef PF_PFUDL5010_ConvBase02_UP_BLOCK0() {

		return new MCGeneralContainerDef("PF", "PFUDL5010", "ConvBase02",
			new MCItemDef[]{
				MCItemDef.create("sdrvIf" + ".if_proc_typ", "if_proc_typ"),
				MCItemDef.create("sdrvIf" + ".data_no", "data_no"),
				MCItemDef.create("sdrvIf" + ".ext_sys_cd", "ext_sys_cd")
			}
			,
			MCBlockDef.create("SdrvDtl")
		);
	}


	public static MCContainerDef PF_PFUDL5010_ConvBase02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("PF", "PFUDL5010", "ConvBase02",
			new MCItemDef[]{
				MCItemDef.create("sdrvIf" + ".if_proc_typ", "if_proc_typ"),
				MCItemDef.create("sdrvIf" + ".data_no", "data_no"),
				MCItemDef.create("sdrvIf" + ".ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("sdrvIf" + ".sdrv_sts_typ", "sdrv_sts_typ"),
				MCItemDef.create("ifFile" + ".file_path", "file_path"),
				MCItemDef.create("ifFile" + ".file_nm", "file_nm")
			}
			,
			MCBlockDef.create("SdrvDtl")
		);
	}
	
	static final MCOperationInfo PF_PFUDL5010_ConvBase03_INFO = new MCOperationInfo("PF", "PFUDL5010", "ConvBase03", "000000", new PDef());

	public static MCContainerDef PF_PFUDL5010_ConvBase03_UP_BLOCK0() {

		return new MCGeneralContainerDef("PF", "PFUDL5010", "ConvBase03",
			new MCItemDef[]{
				MCItemDef.create("sdrvIf" + ".if_proc_typ", "if_proc_typ"),
				MCItemDef.create("sdrvIf" + ".data_no", "data_no"),
				MCItemDef.create("sdrvIf" + ".ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ifFile" + ".file_path", "file_path"),
				MCItemDef.create("ifFile" + ".file_nm", "file_nm"),
				MCItemDef.create("sts_fsuffix", "sts_fsuffix")
			}
			,
			MCBlockDef.create("SdrvDtl")
		);
	}


	public static MCContainerDef PF_PFUDL5010_ConvBase03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("PF", "PFUDL5010", "ConvBase03",
			new MCItemDef[]{
				MCItemDef.create("sdrvIf" + ".if_proc_typ", "if_proc_typ"),
				MCItemDef.create("sdrvIf" + ".data_no", "data_no"),
				MCItemDef.create("sdrvIf" + ".ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("sdrvIf" + ".sdrv_sts_typ", "sdrv_sts_typ"),
				MCItemDef.create("sdrvIf" + ".attr_char1", "sdrvIf" + ".attr_char1"),
				MCItemDef.create("sdrvIf" + ".attr_char2", "sdrvIf" + ".attr_char2"),
				MCItemDef.create("sdrvIf" + ".attr_char3", "sdrvIf" + ".attr_char3"),
				MCItemDef.create("sdrvIf" + ".attr_char4", "sdrvIf" + ".attr_char4"),
				MCItemDef.create("sdrvIf" + ".attr_char5", "sdrvIf" + ".attr_char5"),
				MCItemDef.create("sdrvIf" + ".attr_char6", "sdrvIf" + ".attr_char6"),
				MCItemDef.create("sdrvIf" + ".attr_char7", "sdrvIf" + ".attr_char7"),
				MCItemDef.create("sdrvIf" + ".attr_char8", "sdrvIf" + ".attr_char8"),
				MCItemDef.create("sdrvIf" + ".attr_char9", "sdrvIf" + ".attr_char9"),
				MCItemDef.create("sdrvIf" + ".attr_char10", "sdrvIf" + ".attr_char10"),
				MCItemDef.create("sdrvIf" + ".attr_num1", "sdrvIf" + ".attr_num1"),
				MCItemDef.create("sdrvIf" + ".attr_num2", "sdrvIf" + ".attr_num2"),
				MCItemDef.create("sdrvIf" + ".attr_num3", "sdrvIf" + ".attr_num3"),
				MCItemDef.create("sdrvIf" + ".attr_num4", "sdrvIf" + ".attr_num4"),
				MCItemDef.create("sdrvIf" + ".attr_num5", "sdrvIf" + ".attr_num5"),
				MCItemDef.create("sdrvIf" + ".attr_dt1", "sdrvIf" + ".attr_dt1"),
				MCItemDef.create("sdrvIf" + ".attr_dt2", "sdrvIf" + ".attr_dt2"),
				MCItemDef.create("sdrvIf" + ".attr_dt3", "sdrvIf" + ".attr_dt3"),
				MCItemDef.create("sdrvIf" + ".attr_dt4", "sdrvIf" + ".attr_dt4"),
				MCItemDef.create("sdrvIf" + ".attr_dt5", "sdrvIf" + ".attr_dt5")
			}
			,
			MCBlockDef.create("SdrvDtl")
		);
	}
	
	static final MCOperationInfo PF_PFUDL5010_ConvBase04_INFO = new MCOperationInfo("PF", "PFUDL5010", "ConvBase04", "000000", new PDef());

	public static MCContainerDef PF_PFUDL5010_ConvBase04_UP_BLOCK0() {

		return new MCGeneralContainerDef("PF", "PFUDL5010", "ConvBase04",
			new MCItemDef[]{
				MCItemDef.create("sdrvIf" + ".if_proc_typ", "if_proc_typ"),
				MCItemDef.create("sdrvIf" + ".data_no", "data_no"),
				MCItemDef.create("sdrvIf" + ".ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ifFile" + ".file_path", "file_path"),
				MCItemDef.create("ifFile" + ".file_nm", "file_nm"),
				MCItemDef.create("sts_fsuffix", "sts_fsuffix"),
				MCItemDef.create("not_coopr_flg", "not_coopr_flg")
			}
			,
			MCBlockDef.create("SdrvDtl")
		);
	}


	public static MCContainerDef PF_PFUDL5010_ConvBase04_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("PF", "PFUDL5010", "ConvBase04",
			new MCItemDef[]{
				MCItemDef.create("sdrvIf" + ".if_proc_typ", "if_proc_typ"),
				MCItemDef.create("sdrvIf" + ".data_no", "data_no"),
				MCItemDef.create("sdrvIf" + ".ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("sdrvIf" + ".sdrv_sts_typ", "sdrv_sts_typ"),
				MCItemDef.create("sdrvIf" + ".attr_char1", "sdrvIf" + ".attr_char1"),
				MCItemDef.create("sdrvIf" + ".attr_char2", "sdrvIf" + ".attr_char2"),
				MCItemDef.create("sdrvIf" + ".attr_char3", "sdrvIf" + ".attr_char3"),
				MCItemDef.create("sdrvIf" + ".attr_char4", "sdrvIf" + ".attr_char4"),
				MCItemDef.create("sdrvIf" + ".attr_char5", "sdrvIf" + ".attr_char5"),
				MCItemDef.create("sdrvIf" + ".attr_char6", "sdrvIf" + ".attr_char6"),
				MCItemDef.create("sdrvIf" + ".attr_char7", "sdrvIf" + ".attr_char7"),
				MCItemDef.create("sdrvIf" + ".attr_char8", "sdrvIf" + ".attr_char8"),
				MCItemDef.create("sdrvIf" + ".attr_char9", "sdrvIf" + ".attr_char9"),
				MCItemDef.create("sdrvIf" + ".attr_char10", "sdrvIf" + ".attr_char10"),
				MCItemDef.create("sdrvIf" + ".attr_num1", "sdrvIf" + ".attr_num1"),
				MCItemDef.create("sdrvIf" + ".attr_num2", "sdrvIf" + ".attr_num2"),
				MCItemDef.create("sdrvIf" + ".attr_num3", "sdrvIf" + ".attr_num3"),
				MCItemDef.create("sdrvIf" + ".attr_num4", "sdrvIf" + ".attr_num4"),
				MCItemDef.create("sdrvIf" + ".attr_num5", "sdrvIf" + ".attr_num5"),
				MCItemDef.create("sdrvIf" + ".attr_dt1", "sdrvIf" + ".attr_dt1"),
				MCItemDef.create("sdrvIf" + ".attr_dt2", "sdrvIf" + ".attr_dt2"),
				MCItemDef.create("sdrvIf" + ".attr_dt3", "sdrvIf" + ".attr_dt3"),
				MCItemDef.create("sdrvIf" + ".attr_dt4", "sdrvIf" + ".attr_dt4"),
				MCItemDef.create("sdrvIf" + ".attr_dt5", "sdrvIf" + ".attr_dt5"),
				MCItemDef.create("if_ins_flg", "if_ins_flg")
			}
			,
			MCBlockDef.create("SdrvDtl")
		);
	}
	
	static final MCOperationInfo PF_PFUDL5010_ConvBase05_INFO = new MCOperationInfo("PF", "PFUDL5010", "ConvBase05", "000000", new PDef());

	public static MCContainerDef PF_PFUDL5010_ConvBase05_UP_BLOCK0() {

		return new MCGeneralContainerDef("PF", "PFUDL5010", "ConvBase05",
			new MCItemDef[]{
				MCItemDef.create("sdrvIf" + ".if_proc_typ", "if_proc_typ"),
				MCItemDef.create("sdrvIf" + ".data_no", "data_no"),
				MCItemDef.create("sdrvIf" + ".ext_sys_cd", "ext_sys_cd")
			}
			,
			MCBlockDef.create("SdrvDtl")
		);
	}


	public static MCContainerDef PF_PFUDL5010_ConvBase05_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("PF", "PFUDL5010", "ConvBase05",
			new MCItemDef[]{
				MCItemDef.create("sdrvIf" + ".if_proc_typ", "if_proc_typ"),
				MCItemDef.create("sdrvIf" + ".data_no", "data_no"),
				MCItemDef.create("sdrvIf" + ".ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("sdrvIf" + ".sdrv_sts_typ", "sdrv_sts_typ"),
				MCItemDef.create("ifFile" + ".file_path", "file_path"),
				MCItemDef.create("ifFile" + ".file_nm", "file_nm")
			}
			,
			MCBlockDef.create("SdrvDtl")
		);
	}
	
	static final MCOperationInfo PF_PFUDL5010_ConvBase06_INFO = new MCOperationInfo("PF", "PFUDL5010", "ConvBase06", "000000", new PDef());

	public static MCContainerDef PF_PFUDL5010_ConvBase06_UP_BLOCK0() {

		return new MCGeneralContainerDef("PF", "PFUDL5010", "ConvBase06",
			new MCItemDef[]{
				MCItemDef.create("sdrvIf" + ".if_proc_typ", "if_proc_typ"),
				MCItemDef.create("sdrvIf" + ".data_no", "data_no"),
				MCItemDef.create("sdrvIf" + ".ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("sts_fsuffix", "sts_fsuffix"),
				MCItemDef.create("not_coopr_flg", "not_coopr_flg")
			}
			,
			MCBlockDef.create("SdrvDtl")
		);
	}


	public static MCContainerDef PF_PFUDL5010_ConvBase06_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("PF", "PFUDL5010", "ConvBase06",
			new MCItemDef[]{
				MCItemDef.create("sdrvIf" + ".if_proc_typ", "if_proc_typ"),
				MCItemDef.create("sdrvIf" + ".data_no", "data_no"),
				MCItemDef.create("sdrvIf" + ".ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("sdrvIf" + ".sdrv_sts_typ", "sdrv_sts_typ"),
				MCItemDef.create("sdrvIf" + ".attr_char1", "sdrvIf" + ".attr_char1"),
				MCItemDef.create("sdrvIf" + ".attr_char2", "sdrvIf" + ".attr_char2"),
				MCItemDef.create("sdrvIf" + ".attr_char3", "sdrvIf" + ".attr_char3"),
				MCItemDef.create("sdrvIf" + ".attr_char4", "sdrvIf" + ".attr_char4"),
				MCItemDef.create("sdrvIf" + ".attr_char5", "sdrvIf" + ".attr_char5"),
				MCItemDef.create("sdrvIf" + ".attr_char6", "sdrvIf" + ".attr_char6"),
				MCItemDef.create("sdrvIf" + ".attr_char7", "sdrvIf" + ".attr_char7"),
				MCItemDef.create("sdrvIf" + ".attr_char8", "sdrvIf" + ".attr_char8"),
				MCItemDef.create("sdrvIf" + ".attr_char9", "sdrvIf" + ".attr_char9"),
				MCItemDef.create("sdrvIf" + ".attr_char10", "sdrvIf" + ".attr_char10"),
				MCItemDef.create("sdrvIf" + ".attr_num1", "sdrvIf" + ".attr_num1"),
				MCItemDef.create("sdrvIf" + ".attr_num2", "sdrvIf" + ".attr_num2"),
				MCItemDef.create("sdrvIf" + ".attr_num3", "sdrvIf" + ".attr_num3"),
				MCItemDef.create("sdrvIf" + ".attr_num4", "sdrvIf" + ".attr_num4"),
				MCItemDef.create("sdrvIf" + ".attr_num5", "sdrvIf" + ".attr_num5"),
				MCItemDef.create("sdrvIf" + ".attr_dt1", "sdrvIf" + ".attr_dt1"),
				MCItemDef.create("sdrvIf" + ".attr_dt2", "sdrvIf" + ".attr_dt2"),
				MCItemDef.create("sdrvIf" + ".attr_dt3", "sdrvIf" + ".attr_dt3"),
				MCItemDef.create("sdrvIf" + ".attr_dt4", "sdrvIf" + ".attr_dt4"),
				MCItemDef.create("sdrvIf" + ".attr_dt5", "sdrvIf" + ".attr_dt5"),
				MCItemDef.create("if_ins_flg", "if_ins_flg")
			}
			,
			MCBlockDef.create("SdrvDtl")
		);
	}
	
	static final MCOperationInfo PF_PFUDL5010_ConvBase07_INFO = new MCOperationInfo("PF", "PFUDL5010", "ConvBase07", "000000", new PDef());

	public static MCContainerDef PF_PFUDL5010_ConvBase07_UP_BLOCK0() {

		return new MCGeneralContainerDef("PF", "PFUDL5010", "ConvBase07",
			new MCItemDef[]{
				MCItemDef.create("sdrvIf" + ".if_proc_typ", "if_proc_typ"),
				MCItemDef.create("sdrvIf" + ".data_no", "data_no"),
				MCItemDef.create("sdrvIf" + ".ext_sys_cd", "ext_sys_cd")
			}
			,
			MCBlockDef.create("SdrvDtl")
		);
	}


	public static MCContainerDef PF_PFUDL5010_ConvBase07_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("PF", "PFUDL5010", "ConvBase07",
			new MCItemDef[]{
				MCItemDef.create("sdrvIf" + ".if_proc_typ", "if_proc_typ"),
				MCItemDef.create("sdrvIf" + ".data_no", "data_no"),
				MCItemDef.create("sdrvIf" + ".ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("sdrvIf" + ".sdrv_sts_typ", "sdrv_sts_typ")
			}
			,
			MCBlockDef.create("SdrvDtl")
		);
	}
	
	static final MCOperationInfo PF_PFUDL5010_ConvBase08_INFO = new MCOperationInfo("PF", "PFUDL5010", "ConvBase08", "000000", new PDef());

	public static MCContainerDef PF_PFUDL5010_ConvBase08_UP_BLOCK0() {

		return new MCGeneralContainerDef("PF", "PFUDL5010", "ConvBase08",
			new MCItemDef[]{
				MCItemDef.create("sdrvIf" + ".if_proc_typ", "if_proc_typ"),
				MCItemDef.create("sdrvIf" + ".data_no", "data_no"),
				MCItemDef.create("sdrvIf" + ".ext_sys_cd", "ext_sys_cd")
			}
			,
			MCBlockDef.create("SdrvDtl")
		);
	}


	public static MCContainerDef PF_PFUDL5010_ConvBase08_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("PF", "PFUDL5010", "ConvBase08",
			new MCItemDef[]{
				MCItemDef.create("sdrvIf" + ".if_proc_typ", "if_proc_typ"),
				MCItemDef.create("sdrvIf" + ".data_no", "data_no"),
				MCItemDef.create("sdrvIf" + ".ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("sdrvIf" + ".sdrv_sts_typ", "sdrv_sts_typ"),
				MCItemDef.create("ifFile" + ".file_path", "file_path"),
				MCItemDef.create("ifFile" + ".file_nm", "file_nm")
			}
			,
			MCBlockDef.create("SdrvDtl")
		);
	}
	//FMCB DEF_CLASSES END
}

