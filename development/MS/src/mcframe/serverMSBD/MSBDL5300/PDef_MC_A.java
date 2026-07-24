package mcframe.serverMSBD.MSBDL5300;

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
 * [MSBDL_PurcSlipSendIfService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBDL5300.PurcSlipSendIf_Upd01.UP.BLOCK0")){
			return MS_MSBDL5300_PurcSlipSendIf_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5300.PurcSlipSendIf_Upd02.UP.BLOCK0")){
			return MS_MSBDL5300_PurcSlipSendIf_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5300.PurcSlipSendIf_Upd03.UP.BLOCK0")){
			return MS_MSBDL5300_PurcSlipSendIf_Upd03_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
				
	
	static final MCOperationInfo MS_MSBDL5300_PurcSlipSendIf_Upd01_INFO = new MCOperationInfo("MS", "MSBDL5300", "PurcSlipSendIf_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5300_PurcSlipSendIf_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5300", "PurcSlipSendIf_Upd01",
			new MCItemDef[]{
				MCItemDef.create("purc_act_no", "purc_act_no"),
				MCItemDef.create("purc_act_seq", "purc_act_seq"),
				MCItemDef.create("data_crud_typ", "data_crud_typ")
			}
			,
			MCBlockDef.create("PurcSlipSendIf_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBDL5300_PurcSlipSendIf_Upd02_INFO = new MCOperationInfo("MS", "MSBDL5300", "PurcSlipSendIf_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5300_PurcSlipSendIf_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5300", "PurcSlipSendIf_Upd02",
			new MCItemDef[]{
				MCItemDef.create("data_no", "data_no")
			}
			,
			MCBlockDef.create("PurcSlipSendIf_Upd02_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBDL5300_PurcSlipSendIf_Upd03_INFO = new MCOperationInfo("MS", "MSBDL5300", "PurcSlipSendIf_Upd03", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5300_PurcSlipSendIf_Upd03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5300", "PurcSlipSendIf_Upd03",
			new MCItemDef[]{
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("not_snd_flg", "not_snd_flg")
			}
			,
			MCBlockDef.create("PurcSlipSendIf_Upd03_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBDL5300_PurcSlipSendIf_Upd04_INFO = new MCOperationInfo("MS", "MSBDL5300", "PurcSlipSendIf_Upd04", "000000", new PDef());


	//FMCB DEF_CLASSES END
}

