package mcframe.serverMSBD.MSBDB0010;

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
 * [MSBDB_PurcFrcstRegBatch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBDB0010.PurcFrcstReg_Ins01.UP.BLOCK0")){
			return MS_MSBDB0010_PurcFrcstReg_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDB0010.PurcFrcstReg_Ins02.UP.BLOCK0")){
			return MS_MSBDB0010_PurcFrcstReg_Ins02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDB0010.PurcFrcstReg_Ins02.DOWN.BLOCK0")){
			return MS_MSBDB0010_PurcFrcstReg_Ins02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDB0010.PurcFrcstReg_Del01.UP.BLOCK0")){
			return MS_MSBDB0010_PurcFrcstReg_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDB0010.PurcFrcstReg_Del02.UP.BLOCK0")){
			return MS_MSBDB0010_PurcFrcstReg_Del02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDB0010.PurcFrcstReg_Del02.DOWN.BLOCK0")){
			return MS_MSBDB0010_PurcFrcstReg_Del02_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
				
	
	static final MCOperationInfo MS_MSBDB0010_PurcFrcstReg_Ins01_INFO = new MCOperationInfo("MS", "MSBDB0010", "PurcFrcstReg_Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBDB0010_PurcFrcstReg_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDB0010", "PurcFrcstReg_Ins01",
			new MCItemDef[]{
				MCItemDef.create("pf_dt", "pf_dt"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("except_prcd_ord_flg", "except_prcd_ord_flg"),
				MCItemDef.create("except_opn_ord_flg", "except_opn_ord_flg"),
				MCItemDef.create("except_sav_ord_flg", "except_sav_ord_flg")
			}
			,
			MCBlockDef.create("PurcFrcstReg_Ins01_Cnd")
		);
	}
	
	static final MCOperationInfo MS_MSBDB0010_PurcFrcstReg_Ins02_INFO = new MCOperationInfo("MS", "MSBDB0010", "PurcFrcstReg_Ins02", "000000", new PDef());

	public static MCContainerDef MS_MSBDB0010_PurcFrcstReg_Ins02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDB0010", "PurcFrcstReg_Ins02",
			new MCItemDef[]{
				MCItemDef.create("pf_dt", "pf_dt"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("except_prcd_ord_flg", "except_prcd_ord_flg"),
				MCItemDef.create("except_opn_ord_flg", "except_opn_ord_flg"),
				MCItemDef.create("except_sav_ord_flg", "except_sav_ord_flg")
			}
			,
			MCBlockDef.create("PurcFrcstReg_Ins02_Cnd")
		);
	}


	public static MCContainerDef MS_MSBDB0010_PurcFrcstReg_Ins02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDB0010", "PurcFrcstReg_Ins02",
			new MCItemDef[]{
				MCItemDef.create("total_cnt", "total_cnt"),
				MCItemDef.create("success_cnt", "success_cnt"),
				MCItemDef.create("error_cnt", "error_cnt"),
				MCItemDef.create("skip_cnt", "skip_cnt")
			}
			,
			MCBlockDef.create("PurcFrcstReg_Ins02_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBDB0010_PurcFrcstReg_Del01_INFO = new MCOperationInfo("MS", "MSBDB0010", "PurcFrcstReg_Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBDB0010_PurcFrcstReg_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDB0010", "PurcFrcstReg_Del01",
			new MCItemDef[]{
				MCItemDef.create("pf_dt", "pf_dt"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3")
			}
			,
			MCBlockDef.create("PurcFrcstReg_Del01_Cnd")
		);
	}
	
	static final MCOperationInfo MS_MSBDB0010_PurcFrcstReg_Del02_INFO = new MCOperationInfo("MS", "MSBDB0010", "PurcFrcstReg_Del02", "000000", new PDef());

	public static MCContainerDef MS_MSBDB0010_PurcFrcstReg_Del02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDB0010", "PurcFrcstReg_Del02",
			new MCItemDef[]{
				MCItemDef.create("pf_dt", "pf_dt"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd")
			}
			,
			MCBlockDef.create("PurcFrcstReg_Del02_Cnd")
		);
	}


	public static MCContainerDef MS_MSBDB0010_PurcFrcstReg_Del02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDB0010", "PurcFrcstReg_Del02",
			new MCItemDef[]{
				MCItemDef.create("total_cnt", "total_cnt"),
				MCItemDef.create("success_cnt", "success_cnt"),
				MCItemDef.create("error_cnt", "error_cnt")
			}
			,
			MCBlockDef.create("PurcFrcstReg_Del02_Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

