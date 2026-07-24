package mcframe.serverMSBE.MSBEL6610;

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
 * [MSBEL_StktkListPrntService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBEL6610.StktkList_Prnt01.UP.BLOCK0")){
			return MS_MSBEL6610_StktkList_Prnt01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MS_MSBEL6610_StktkList_Prnt01_INFO = new MCOperationInfo("MS", "MSBEL6610", "StktkList_Prnt01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL6610_StktkList_Prnt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL6610", "StktkList_Prnt01",
			new MCItemDef[]{
				MCItemDef.create("ctrl_tgt_dt", "ctrl_tgt_dt"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("stktk_rpt_flg", "stktk_rpt_flg"),
				MCItemDef.create("diff_rpt_flg", "diff_rpt_flg"),
				MCItemDef.create("stktk_typ", "stktk_typ"),
				MCItemDef.create("stktk_rpt_rmrks", "stktk_rpt_rmrks")
			}
			,
			MCBlockDef.create("StktkList_Prnt01_Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

