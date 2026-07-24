package mcframe.serverMSBH.MSBHL5070;

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
 * [MSBHL_PayActIfCrtService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBHL5070.PayActIfCrt_Ins01.UP.BLOCK0")){
			return MS_MSBHL5070_PayActIfCrt_Ins01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MS_MSBHL5070_PayActIfCrt_Ins01_INFO = new MCOperationInfo("MS", "MSBHL5070", "PayActIfCrt_Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBHL5070_PayActIfCrt_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5070", "PayActIfCrt_Ins01",
			new MCItemDef[]{
				MCItemDef.create("pay_act_d_no", "pay_act_d_no"),
				MCItemDef.create("pay_act_d_seq", "pay_act_d_seq"),
				MCItemDef.create("adv_pay_act_no", "adv_pay_act_no"),
				MCItemDef.create("adv_pay_act_seq", "adv_pay_act_seq"),
				MCItemDef.create("ap_xrate_rev_his_no", "ap_xrate_rev_his_no"),
				MCItemDef.create("ref_ap_xrate_rev_his_no", "ref_ap_xrate_rev_his_no")
			}
			,
			MCBlockDef.create("PayActIfCrt_Ins01_Cnd")
		);
	}


	//FMCB DEF_CLASSES END
}

