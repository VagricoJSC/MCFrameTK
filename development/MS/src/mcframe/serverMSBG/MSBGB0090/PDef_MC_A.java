package mcframe.serverMSBG.MSBGB0090;

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
 * [MSBGB_RcvAutoAppl]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBGB0090.RcvAutoAppl_Upd02.UP.BLOCK0")){
			return MS_MSBGB0090_RcvAutoAppl_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGB0090.RcvAutoAppl_Upd02.DOWN.BLOCK0")){
			return MS_MSBGB0090_RcvAutoAppl_Upd02_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo MS_MSBGB0090_RcvAutoAppl_Upd01_INFO = new MCOperationInfo("MS", "MSBGB0090", "RcvAutoAppl_Upd01", "000000", new PDef());
	
	static final MCOperationInfo MS_MSBGB0090_RcvAutoAppl_Upd02_INFO = new MCOperationInfo("MS", "MSBGB0090", "RcvAutoAppl_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBGB0090_RcvAutoAppl_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGB0090", "RcvAutoAppl_Upd02",
			new MCItemDef[]{
				MCItemDef.create("rcst_cd", "rcst_cd")
			}
			,
			MCBlockDef.create("RcvAutoAppl_Upd02_Cnd")
		);
	}


	public static MCContainerDef MS_MSBGB0090_RcvAutoAppl_Upd02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGB0090", "RcvAutoAppl_Upd02",
			new MCItemDef[]{
				MCItemDef.create("total_cnt", "total_cnt"),
				MCItemDef.create("error_cnt", "error_cnt"),
				MCItemDef.create("cmpl_cnt", "cmpl_cnt"),
				MCItemDef.create("cmpl_inc_comp_cnt", "cmpl_inc_comp_cnt"),
				MCItemDef.create("cmpl_over_cnt", "cmpl_over_cnt"),
				MCItemDef.create("cmpl_short_cnt", "cmpl_short_cnt"),
				MCItemDef.create("not_appl_cnt", "not_appl_cnt")
			}
			,
			MCBlockDef.create("RcvAutoAppl_Upd02_Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

