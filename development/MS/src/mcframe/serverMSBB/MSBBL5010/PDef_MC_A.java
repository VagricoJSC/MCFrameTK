package mcframe.serverMSBB.MSBBL5010;

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
 * [MSBBL_MlySPlnService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBBL5010.Calc01.UP.BLOCK0")){
			return MS_MSBBL5010_Calc01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL5010.Calc01.DOWN.BLOCK0")){
			return MS_MSBBL5010_Calc01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL5010.Calc01.DOWN.BLOCK1")){
			return MS_MSBBL5010_Calc01_DOWN_BLOCK1();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MS_MSBBL5010_Calc01_INFO = new MCOperationInfo("MS", "MSBBL5010", "Calc01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL5010_Calc01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL5010", "Calc01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("spln_itm_cd", "spln_itm_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("spln_ym", "spln_ym"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("spln_qty", "spln_qty"),
				MCItemDef.create("spln_amt", "spln_amt")
			}
			,
			MCBlockDef.create("Calc01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBBL5010_Calc01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL5010", "Calc01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("spln_itm_cd", "spln_itm_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("spln_ym", "spln_ym"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("spln_qty", "spln_qty"),
				MCItemDef.create("spln_amt", "spln_amt")
			}
			,
			MCBlockDef.create("Calc01_Dtl")
		);
	}
	public static MCContainerDef MS_MSBBL5010_Calc01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBBL5010", "Calc01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("spln_itm_cd", "spln_itm_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("spln_ym", "spln_ym"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("spln_qty", "spln_qty"),
				MCItemDef.create("spln_amt", "spln_amt")
			}
			,
			MCBlockDef.create("Calc01_ItmDtl")
		);
	}
	//FMCB DEF_CLASSES END
}

