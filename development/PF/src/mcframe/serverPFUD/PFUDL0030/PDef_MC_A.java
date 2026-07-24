package mcframe.serverPFUD.PFUDL0030;

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
 * [PFUDL_ESBSendIf]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("PF.PFUDL0030.Upd01.UP.BLOCK0")){
			return PF_PFUDL0030_Upd01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo PF_PFUDL0030_Upd01_INFO = new MCOperationInfo("PF", "PFUDL0030", "Upd01", "000000", new PDef());

	public static MCContainerDef PF_PFUDL0030_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("PF", "PFUDL0030", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("data_no", true, "data_no"),
				MCItemDef.create("if_proc_typ", true, "if_proc_typ"),
				MCItemDef.create("ext_sys_cd", true, "ext_sys_cd"),
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


	//FMCB DEF_CLASSES END
}

