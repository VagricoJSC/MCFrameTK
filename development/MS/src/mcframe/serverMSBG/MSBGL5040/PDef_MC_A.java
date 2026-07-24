package mcframe.serverMSBG.MSBGL5040;

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
 * [MSBGL_BillPrntService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBGL5040.Bill_Prnt01.UP.BLOCK0")){
			return MS_MSBGL5040_Bill_Prnt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL5040.Bill_Prnt01.UP.BLOCK1")){
			return MS_MSBGL5040_Bill_Prnt01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBGL5040.Bill_Prnt01.DOWN.BLOCK0")){
			return MS_MSBGL5040_Bill_Prnt01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MS_MSBGL5040_Bill_Prnt01_INFO = new MCOperationInfo("MS", "MSBGL5040", "Bill_Prnt01", "000000", new PDef());

	public static MCContainerDef MS_MSBGL5040_Bill_Prnt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL5040", "Bill_Prnt01",
			new MCItemDef[]{
				MCItemDef.create("bill_mng_no", "bill_mng_no"),
				MCItemDef.create("bill_no", "bill_no")
			}
			,
			MCBlockDef.create("Bill_Prnt01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBGL5040_Bill_Prnt01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBGL5040", "Bill_Prnt01",
			new MCItemDef[]{
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg")
			}
			,
			MCBlockDef.create("Bill_Prnt01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBGL5040_Bill_Prnt01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL5040", "Bill_Prnt01",
			new MCItemDef[]{
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Bill_Prnt01_Hdr")
		);
	}
	//FMCB DEF_CLASSES END
}

