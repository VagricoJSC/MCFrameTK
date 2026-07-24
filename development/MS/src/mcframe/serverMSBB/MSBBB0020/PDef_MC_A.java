package mcframe.serverMSBB.MSBBB0020;

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
 * [MSBBB_SlsActRegBatch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBBB0020.SlsActReg_Ins01.UP.BLOCK0")){
			return MS_MSBBB0020_SlsActReg_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBB0020.SlsActReg_Ins02.UP.BLOCK0")){
			return MS_MSBBB0020_SlsActReg_Ins02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBB0020.SlsActReg_Ins02.DOWN.BLOCK0")){
			return MS_MSBBB0020_SlsActReg_Ins02_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo MS_MSBBB0020_SlsActReg_Ins01_INFO = new MCOperationInfo("MS", "MSBBB0020", "SlsActReg_Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBBB0020_SlsActReg_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBB0020", "SlsActReg_Ins01",
			new MCItemDef[]{
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("sls_schd_dt_fr", "sls_schd_dt_fr"),
				MCItemDef.create("sls_schd_dt_to", "sls_schd_dt_to"),
				MCItemDef.create("sls_schd_dt_not_ac_flg", "sls_schd_dt_not_ac_flg"),
				MCItemDef.create("inc_in_basis_flg", "inc_in_basis_flg"),
				MCItemDef.create("inc_partial_sls_flg", "inc_partial_sls_flg"),
				MCItemDef.create("inc_purc_ddlv_flg", "inc_purc_ddlv_flg"),
				MCItemDef.create("non_prnt_dlv_flg", "non_prnt_dlv_flg")
			}
			,
			MCBlockDef.create("SlsActReg_Ins01_Cnd")
		);
	}
	
	static final MCOperationInfo MS_MSBBB0020_SlsActReg_Ins02_INFO = new MCOperationInfo("MS", "MSBBB0020", "SlsActReg_Ins02", "000000", new PDef());

	public static MCContainerDef MS_MSBBB0020_SlsActReg_Ins02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBB0020", "SlsActReg_Ins02",
			new MCItemDef[]{
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("sls_schd_dt_fr", "sls_schd_dt_fr"),
				MCItemDef.create("sls_schd_dt_to", "sls_schd_dt_to"),
				MCItemDef.create("sls_schd_dt_not_ac_flg", "sls_schd_dt_not_ac_flg"),
				MCItemDef.create("inc_in_basis_flg", "inc_in_basis_flg"),
				MCItemDef.create("inc_partial_sls_flg", "inc_partial_sls_flg"),
				MCItemDef.create("inc_purc_ddlv_flg", "inc_purc_ddlv_flg"),
				MCItemDef.create("non_prnt_dlv_flg", "non_prnt_dlv_flg")
			}
			,
			MCBlockDef.create("SlsActReg_Ins02_Cnd")
		);
	}


	public static MCContainerDef MS_MSBBB0020_SlsActReg_Ins02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBB0020", "SlsActReg_Ins02",
			new MCItemDef[]{
				MCItemDef.create("total_num", "total_num"),
				MCItemDef.create("ok_num", "ok_num"),
				MCItemDef.create("err_num", "err_num")
			}
			,
			MCBlockDef.create("SlsActReg_Ins02_Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

