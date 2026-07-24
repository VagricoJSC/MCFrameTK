package mcframe.serverMSBB.MSBBL6260;

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
 * [MSBBL_SlsSlipSendIfService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBBL6260.SlsSlipSendIf_Upd01.UP.BLOCK0")){
			return MS_MSBBL6260_SlsSlipSendIf_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL6260.SlsSlipSendIf_Upd02.UP.BLOCK0")){
			return MS_MSBBL6260_SlsSlipSendIf_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL6260.SlsSlipSendIf_Upd03.UP.BLOCK0")){
			return MS_MSBBL6260_SlsSlipSendIf_Upd03_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
				
	
	static final MCOperationInfo MS_MSBBL6260_SlsSlipSendIf_Upd01_INFO = new MCOperationInfo("MS", "MSBBL6260", "SlsSlipSendIf_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL6260_SlsSlipSendIf_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6260", "SlsSlipSendIf_Upd01",
			new MCItemDef[]{
				MCItemDef.create("sls_act_no", "sls_act_no"),
				MCItemDef.create("sls_act_seq", "sls_act_seq"),
				MCItemDef.create("prov_act_no", "prov_act_no"),
				MCItemDef.create("prov_act_seq", "prov_act_seq"),
				MCItemDef.create("data_crud_typ", "data_crud_typ")
			}
			,
			MCBlockDef.create("SlsSlipSendIf_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL6260_SlsSlipSendIf_Upd02_INFO = new MCOperationInfo("MS", "MSBBL6260", "SlsSlipSendIf_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBBL6260_SlsSlipSendIf_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6260", "SlsSlipSendIf_Upd02",
			new MCItemDef[]{
				MCItemDef.create("data_no", "data_no")
			}
			,
			MCBlockDef.create("SlsSlipSendIf_Upd02_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL6260_SlsSlipSendIf_Upd03_INFO = new MCOperationInfo("MS", "MSBBL6260", "SlsSlipSendIf_Upd03", "000000", new PDef());

	public static MCContainerDef MS_MSBBL6260_SlsSlipSendIf_Upd03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6260", "SlsSlipSendIf_Upd03",
			new MCItemDef[]{
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("not_snd_flg", "not_snd_flg")
			}
			,
			MCBlockDef.create("SlsSlipSendIf_Upd03_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL6260_SlsSlipSendIf_Upd04_INFO = new MCOperationInfo("MS", "MSBBL6260", "SlsSlipSendIf_Upd04", "000000", new PDef());


	//FMCB DEF_CLASSES END
}

