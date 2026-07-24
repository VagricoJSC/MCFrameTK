package mcframe.serverMSLA.MSLAL6320;

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
 * [MSLAL_SCMActRecvIfService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSLAL6320.SCMActRecvIf_Upd01.UP.BLOCK0")){
			return MS_MSLAL6320_SCMActRecvIf_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL6320.SCMActRecvIf_Upd01.UP.BLOCK1")){
			return MS_MSLAL6320_SCMActRecvIf_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSLAL6320.SCMActRecvIf_Upd01.DOWN.BLOCK0")){
			return MS_MSLAL6320_SCMActRecvIf_Upd01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MS_MSLAL6320_SCMActRecvIf_Upd01_INFO = new MCOperationInfo("MS", "MSLAL6320", "SCMActRecvIf_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSLAL6320_SCMActRecvIf_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL6320", "SCMActRecvIf_Upd01",
			new MCItemDef[]{
				MCItemDef.create("data_lno", "data_lno"),
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("if_proc_typ", "if_proc_typ"),
				MCItemDef.create("ext_data_no", "ext_data_no"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd")
			}
			,
			MCBlockDef.create("SCMActRecvIf_Upd01_Dtl")
		);
	}

	public static MCContainerDef MS_MSLAL6320_SCMActRecvIf_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSLAL6320", "SCMActRecvIf_Upd01",
			new MCItemDef[]{
				MCItemDef.create("exe_unit_lump_flg", "exe_unit_lump_flg"),
				MCItemDef.create("if_upd_typ", "if_upd_typ"),
				MCItemDef.create("src_actlumprecv_flg", "src_actlumprecv_flg")
			}
			,
			MCBlockDef.create("SCMActRecvIf_Upd01_Cnd")
		);
	}


	public static MCContainerDef MS_MSLAL6320_SCMActRecvIf_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL6320", "SCMActRecvIf_Upd01",
			new MCItemDef[]{
				MCItemDef.create("total_num", true, "total_num"),
				MCItemDef.create("ok_num", true, "ok_num"),
				MCItemDef.create("err_num", true, "err_num"),
				MCItemDef.create("skip_num", true, "skip_num")
			}
			,
			MCBlockDef.create("SCMActRecvIf_Upd01_Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

