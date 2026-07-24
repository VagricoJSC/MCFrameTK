package mcframe.serverMSLA.MSLAL5060;

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
 * [MSLAL_AccptSendIfService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSLAL5060.AccptSendIf_Upd01.UP.BLOCK0")){
			return MS_MSLAL5060_AccptSendIf_Upd01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MS_MSLAL5060_AccptSendIf_Upd01_INFO = new MCOperationInfo("MS", "MSLAL5060", "AccptSendIf_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSLAL5060_AccptSendIf_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL5060", "AccptSendIf_Upd01",
			new MCItemDef[]{
				MCItemDef.create("purc_act_no", "purc_act_no"),
				MCItemDef.create("purc_act_seq", "purc_act_seq"),
				MCItemDef.create("purc_dt", "purc_dt"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("purc_act_d_seq", "purc_act_d_seq"),
				MCItemDef.create("data_crud_typ", "data_crud_typ")
			}
			,
			MCBlockDef.create("AccptSendIf_Upd01_Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

