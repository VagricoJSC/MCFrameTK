package mcframe.serverMSLA.MSLAL5150;

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
 * [MSLAL_ShipActSendIfService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSLAL5150.ShipActSendIf_Upd01.UP.BLOCK0")){
			return MS_MSLAL5150_ShipActSendIf_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL5150.ShipActSendIf_Upd01.UP.BLOCK1")){
			return MS_MSLAL5150_ShipActSendIf_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSLAL5150.ShipActSendIf_Upd01.UP.BLOCK2")){
			return MS_MSLAL5150_ShipActSendIf_Upd01_UP_BLOCK2();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MS_MSLAL5150_ShipActSendIf_Upd01_INFO = new MCOperationInfo("MS", "MSLAL5150", "ShipActSendIf_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSLAL5150_ShipActSendIf_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL5150", "ShipActSendIf_Upd01",
			new MCItemDef[]{
				MCItemDef.create("ship_act_no", "ship_act_no"),
				MCItemDef.create("sls_act_no", "sls_act_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ")
			}
			,
			MCBlockDef.create("ShipActSendIf_Upd01_Dtl")
		);
	}

	public static MCContainerDef MS_MSLAL5150_ShipActSendIf_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSLAL5150", "ShipActSendIf_Upd01",
			new MCItemDef[]{
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("upded_flg", "upded_flg")
			}
			,
			MCBlockDef.create("ShipActSendIf_Upd01_Dlv")
		);
	}

	public static MCContainerDef MS_MSLAL5150_ShipActSendIf_Upd01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSLAL5150", "ShipActSendIf_Upd01",
			new MCItemDef[]{
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("iv_no", "iv_no")
			}
			,
			MCBlockDef.create("ShipActSendIf_Upd01_IvDlv")
		);
	}


	//FMCB DEF_CLASSES END
}

