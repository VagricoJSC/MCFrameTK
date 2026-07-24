package mcframe.serverMSBH.MSBHB0010;

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
 * [MSBHB_PaySchdClBatch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBHB0010.PaySchdClBatch_Upd01.UP.BLOCK0")){
			return MS_MSBHB0010_PaySchdClBatch_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHB0010.PaySchdClBatch_Upd02.UP.BLOCK0")){
			return MS_MSBHB0010_PaySchdClBatch_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHB0010.PaySchdClBatch_Upd02.DOWN.BLOCK0")){
			return MS_MSBHB0010_PaySchdClBatch_Upd02_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo MS_MSBHB0010_PaySchdClBatch_Upd01_INFO = new MCOperationInfo("MS", "MSBHB0010", "PaySchdClBatch_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBHB0010_PaySchdClBatch_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHB0010", "PaySchdClBatch_Upd01",
			new MCItemDef[]{
				MCItemDef.create("tgt_dt", "tgt_dt"),
				MCItemDef.create("bsppl_cd", "bsppl_cd")
			}
			,
			MCBlockDef.create("PaySchdClBatch_Cnd")
		);
	}
	
	static final MCOperationInfo MS_MSBHB0010_PaySchdClBatch_Upd02_INFO = new MCOperationInfo("MS", "MSBHB0010", "PaySchdClBatch_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBHB0010_PaySchdClBatch_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHB0010", "PaySchdClBatch_Upd02",
			new MCItemDef[]{
				MCItemDef.create("tgt_dt", "tgt_dt"),
				MCItemDef.create("bsppl_cd", "bsppl_cd")
			}
			,
			MCBlockDef.create("PaySchdClBatch_Cnd")
		);
	}


	public static MCContainerDef MS_MSBHB0010_PaySchdClBatch_Upd02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHB0010", "PaySchdClBatch_Upd02",
			new MCItemDef[]{
				MCItemDef.create("total_cnt", "total_cnt"),
				MCItemDef.create("success_cnt", "success_cnt"),
				MCItemDef.create("error_cnt", "error_cnt")
			}
			,
			MCBlockDef.create("PaySchdClBatch_Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

