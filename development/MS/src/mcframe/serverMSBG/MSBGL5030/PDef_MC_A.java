package mcframe.serverMSBG.MSBGL5030;

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
 * [MSBGL_BillClService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBGL5030.BillCl_Upd01.UP.BLOCK0")){
			return MS_MSBGL5030_BillCl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL5030.BillCl_Upd02.UP.BLOCK0")){
			return MS_MSBGL5030_BillCl_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL5030.BillCl_Upd02.DOWN.BLOCK0")){
			return MS_MSBGL5030_BillCl_Upd02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBGL5030.BillCl_Upd03.UP.BLOCK0")){
			return MS_MSBGL5030_BillCl_Upd03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL5030.BillCl_Upd03.DOWN.BLOCK0")){
			return MS_MSBGL5030_BillCl_Upd03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBGL5030.BillCl_Del01.UP.BLOCK0")){
			return MS_MSBGL5030_BillCl_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
				
	
	static final MCOperationInfo MS_MSBGL5030_BillCl_Upd01_INFO = new MCOperationInfo("MS", "MSBGL5030", "BillCl_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBGL5030_BillCl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL5030", "BillCl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("tgt_dt", "tgt_dt")
			}
			,
			MCBlockDef.create("BillCl_Upd01_Cnd")
		);
	}
	
	static final MCOperationInfo MS_MSBGL5030_BillCl_Upd02_INFO = new MCOperationInfo("MS", "MSBGL5030", "BillCl_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBGL5030_BillCl_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL5030", "BillCl_Upd02",
			new MCItemDef[]{
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("bill_d_sel_flg", "bill_d_sel_flg")
			}
			,
			MCBlockDef.create("BillCl_Upd02_Hdr")
		);
	}


	public static MCContainerDef MS_MSBGL5030_BillCl_Upd02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL5030", "BillCl_Upd02",
			new MCItemDef[]{
				MCItemDef.create("bill_no", "bill_no"),
				MCItemDef.create("bill_mng_no", "bill_mng_no"),
				MCItemDef.create("rcv_schd_dt", "rcv_schd_dt")
			}
			,
			MCBlockDef.create("BillCl_Upd02_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBGL5030_BillCl_Upd03_INFO = new MCOperationInfo("MS", "MSBGL5030", "BillCl_Upd03", "000000", new PDef());

	public static MCContainerDef MS_MSBGL5030_BillCl_Upd03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL5030", "BillCl_Upd03",
			new MCItemDef[]{
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("bill_cl_dt", "bill_cl_dt"),
				MCItemDef.create("tgt_dt", "tgt_dt")
			}
			,
			MCBlockDef.create("BillCl_Upd03_Cnd")
		);
	}


	public static MCContainerDef MS_MSBGL5030_BillCl_Upd03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL5030", "BillCl_Upd03",
			new MCItemDef[]{
				MCItemDef.create("total_cnt", "total_cnt"),
				MCItemDef.create("success_cnt", "success_cnt"),
				MCItemDef.create("error_cnt", "error_cnt")
			}
			,
			MCBlockDef.create("BillCl_Upd03_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBGL5030_BillCl_Del01_INFO = new MCOperationInfo("MS", "MSBGL5030", "BillCl_Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBGL5030_BillCl_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL5030", "BillCl_Del01",
			new MCItemDef[]{
				MCItemDef.create("bill_mng_no", "bill_mng_no")
			}
			,
			MCBlockDef.create("BillCl_Del01_Cnd")
		);
	}


	//FMCB DEF_CLASSES END
}

