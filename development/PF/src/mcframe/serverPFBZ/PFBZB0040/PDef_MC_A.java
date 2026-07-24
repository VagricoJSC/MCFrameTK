package mcframe.serverPFBZ.PFBZB0040;

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
 * [PFBZB_RecvDataConv]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("PF.PFBZB0040.Upd01.UP.BLOCK0")){
			return PF_PFBZB0040_Upd01_UP_BLOCK0();
		}
		else if (id.equals("PF.PFBZB0040.Upd02.UP.BLOCK0")){
			return PF_PFBZB0040_Upd02_UP_BLOCK0();
		}
		else if (id.equals("PF.PFBZB0040.Upd02.DOWN.BLOCK0")){
			return PF_PFBZB0040_Upd02_DOWN_BLOCK0();
		}
		else if (id.equals("PF.PFBZB0040.Upd03.UP.BLOCK0")){
			return PF_PFBZB0040_Upd03_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
			
	
	static final MCOperationInfo PF_PFBZB0040_Upd01_INFO = new MCOperationInfo("PF", "PFBZB0040", "Upd01", "000000", new PDef());

	public static MCContainerDef PF_PFBZB0040_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("PF", "PFBZB0040", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("if_proc_typ", "if_proc_typ"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}
	
	static final MCOperationInfo PF_PFBZB0040_Upd02_INFO = new MCOperationInfo("PF", "PFBZB0040", "Upd02", "000000", new PDef());

	public static MCContainerDef PF_PFBZB0040_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("PF", "PFBZB0040", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("sdrvIf" + ".if_proc_typ", "if_proc_typ"),
				MCItemDef.create("sdrvIf" + ".sdrv_sts_typ", "sdrv_sts_typ"),
				MCItemDef.create("ifFile" + ".file_path", "file_path"),
				MCItemDef.create("ifFile" + ".file_nm", "file_nm")
			}
			,
			MCBlockDef.create("SdrvDtl")
		);
	}


	public static MCContainerDef PF_PFBZB0040_Upd02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("PF", "PFBZB0040", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("sdrvIf" + ".data_no", "data_no"),
				MCItemDef.create("sdrvIf" + ".sdrv_sts_typ", "sdrv_sts_typ"),
				MCItemDef.create("ifFile" + ".file_path", "file_path"),
				MCItemDef.create("ifFile" + ".file_nm", "file_nm")
			}
			,
			MCBlockDef.create("SdrvDtl")
		);
	}
	
	static final MCOperationInfo PF_PFBZB0040_Upd03_INFO = new MCOperationInfo("PF", "PFBZB0040", "Upd03", "000000", new PDef());

	public static MCContainerDef PF_PFBZB0040_Upd03_UP_BLOCK0() {

		return new MCGeneralContainerDef("PF", "PFBZB0040", "Upd03",
			new MCItemDef[]{
				MCItemDef.create("sdrvIf" + ".if_proc_typ", "if_proc_typ"),
				MCItemDef.create("sdrvIf" + ".data_no", "data_no"),
				MCItemDef.create("sdrvIf" + ".ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("sdrvIf" + ".conv_ope", "conv_ope")
			}
			,
			MCBlockDef.create("SdrvDtl")
		);
	}


	//FMCB DEF_CLASSES END
}

