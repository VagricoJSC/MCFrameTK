package mcframe.serverMGLA.MGLAB0010;

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
 * [MGLAB_CalcRsltSendIfBatch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MG.MGLAB0010.SendIf_Upd01.UP.BLOCK0")){
			return MG_MGLAB0010_SendIf_Upd01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MG_MGLAB0010_SendIf_Upd01_INFO = new MCOperationInfo("MG", "MGLAB0010", "SendIf_Upd01", "000000", new PDef());

	public static MCContainerDef MG_MGLAB0010_SendIf_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGLAB0010", "SendIf_Upd01",
			new MCItemDef[]{
				MCItemDef.create("if_proc_typ", "if_proc_typ"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("calc_no", "calc_no"),
				MCItemDef.create("fix_flg", "fix_flg"),
				MCItemDef.create("co_cd", "co_cd"),
				MCItemDef.create("cfp_flg", "cfp_flg")
			}
			,
			MCBlockDef.create("SendIf_Upd01_Cnd")
		);
	}


	//FMCB DEF_CLASSES END
}

