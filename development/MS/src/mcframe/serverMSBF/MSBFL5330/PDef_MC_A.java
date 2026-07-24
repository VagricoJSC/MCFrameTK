package mcframe.serverMSBF.MSBFL5330;

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
 * [MSBFL_InspRptService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBFL5330.InspRpt_Prnt01.UP.BLOCK0")){
			return MS_MSBFL5330_InspRpt_Prnt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5330.InspRpt_Prnt01.DOWN.BLOCK0")){
			return MS_MSBFL5330_InspRpt_Prnt01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5330.InspRpt_Prnt02.UP.BLOCK0")){
			return MS_MSBFL5330_InspRpt_Prnt02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5330.InspRpt_Prnt02.DOWN.BLOCK0")){
			return MS_MSBFL5330_InspRpt_Prnt02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5330.InspRpt_Prnt03.UP.BLOCK0")){
			return MS_MSBFL5330_InspRpt_Prnt03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5330.InspRpt_Prnt03.DOWN.BLOCK0")){
			return MS_MSBFL5330_InspRpt_Prnt03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5330.InspRpt_Prnt04.UP.BLOCK0")){
			return MS_MSBFL5330_InspRpt_Prnt04_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5330.InspRpt_Prnt04.DOWN.BLOCK0")){
			return MS_MSBFL5330_InspRpt_Prnt04_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
				
	
	static final MCOperationInfo MS_MSBFL5330_InspRpt_Prnt01_INFO = new MCOperationInfo("MS", "MSBFL5330", "InspRpt_Prnt01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5330_InspRpt_Prnt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5330", "InspRpt_Prnt01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_no", "insp_no")
			}
			,
			MCBlockDef.create("InspRpt_Prnt01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBFL5330_InspRpt_Prnt01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5330", "InspRpt_Prnt01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_lst_no", "insp_lst_no"),
				MCItemDef.create("insp_lst_prnt_flg", "insp_lst_prnt_flg"),
				MCItemDef.create("insp_lst_prnt_tm", "insp_lst_prnt_tm")
			}
			,
			MCBlockDef.create("InspRpt_Prnt01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBFL5330_InspRpt_Prnt02_INFO = new MCOperationInfo("MS", "MSBFL5330", "InspRpt_Prnt02", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5330_InspRpt_Prnt02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5330", "InspRpt_Prnt02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_no", "insp_no")
			}
			,
			MCBlockDef.create("InspRpt_Prnt02_Dtl")
		);
	}


	public static MCContainerDef MS_MSBFL5330_InspRpt_Prnt02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5330", "InspRpt_Prnt02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_rslt_prnt_flg", "insp_rslt_prnt_flg"),
				MCItemDef.create("insp_rslt_prnt_tm", "insp_rslt_prnt_tm")
			}
			,
			MCBlockDef.create("InspRpt_Prnt02_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBFL5330_InspRpt_Prnt03_INFO = new MCOperationInfo("MS", "MSBFL5330", "InspRpt_Prnt03", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5330_InspRpt_Prnt03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5330", "InspRpt_Prnt03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("plnt_aprv_no", "plnt_aprv_no")
			}
			,
			MCBlockDef.create("InspRpt_Prnt03_Dtl")
		);
	}


	public static MCContainerDef MS_MSBFL5330_InspRpt_Prnt03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5330", "InspRpt_Prnt03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("plnt_aprv_no", "plnt_aprv_no"),
				MCItemDef.create("plnt_aprv_prnt_flg", "plnt_aprv_prnt_flg"),
				MCItemDef.create("plnt_aprv_prnt_tm", "plnt_aprv_prnt_tm")
			}
			,
			MCBlockDef.create("InspRpt_Prnt03_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBFL5330_InspRpt_Prnt04_INFO = new MCOperationInfo("MS", "MSBFL5330", "InspRpt_Prnt04", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5330_InspRpt_Prnt04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5330", "InspRpt_Prnt04",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("mrkt_judg_no", "mrkt_judg_no")
			}
			,
			MCBlockDef.create("InspRpt_Prnt04_Dtl")
		);
	}


	public static MCContainerDef MS_MSBFL5330_InspRpt_Prnt04_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5330", "InspRpt_Prnt04",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("mrkt_judg_no", "mrkt_judg_no"),
				MCItemDef.create("mrkt_judg_prnt_flg", "mrkt_judg_prnt_flg"),
				MCItemDef.create("mrkt_judg_prnt_tm", "mrkt_judg_prnt_tm")
			}
			,
			MCBlockDef.create("InspRpt_Prnt04_Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

