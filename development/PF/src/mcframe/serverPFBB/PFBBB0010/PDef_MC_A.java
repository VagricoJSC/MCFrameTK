package mcframe.serverPFBB.PFBBB0010;

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
 * [PFBBB_GaBatch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("PF.PFBBB0010.Recv_Upd01.UP.BLOCK0")){
			return PF_PFBBB0010_Recv_Upd01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo PF_PFBBB0010_Recv_Upd01_INFO = new MCOperationInfo("PF", "PFBBB0010", "Recv_Upd01", "000000", new PDef());

	public static MCContainerDef PF_PFBBB0010_Recv_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("PF", "PFBBB0010", "Recv_Upd01",
			new MCItemDef[]{
				MCItemDef.create("if_proc_typ", "if_proc_typ"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("tgt_dt_fr", "tgt_dt_fr"),
				MCItemDef.create("tgt_dt_to", "tgt_dt_to"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("budgetcode", "budgetcode")
			}
			,
			MCBlockDef.create("GaBatch_Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

