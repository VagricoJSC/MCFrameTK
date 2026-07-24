package mcframe.serverMSLA.MSLAL7030;

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
 * [MSLAL_PoPrmsRcevConvService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSLAL7030.PoPrmsRecvConv_Conv01.UP.BLOCK0")){
			return MS_MSLAL7030_PoPrmsRecvConv_Conv01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL7030.PoPrmsRecvConv_Conv01.DOWN.BLOCK0")){
			return MS_MSLAL7030_PoPrmsRecvConv_Conv01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL7030.PoPrmsRecvConv_Conv02.UP.BLOCK0")){
			return MS_MSLAL7030_PoPrmsRecvConv_Conv02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL7030.PoPrmsRecvConv_Conv02.DOWN.BLOCK0")){
			return MS_MSLAL7030_PoPrmsRecvConv_Conv02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL7030.PoPrmsRecvConv_Conv03.UP.BLOCK0")){
			return MS_MSLAL7030_PoPrmsRecvConv_Conv03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL7030.PoPrmsRecvConv_Conv03.UP.BLOCK1")){
			return MS_MSLAL7030_PoPrmsRecvConv_Conv03_UP_BLOCK1();
		}
		else if (id.equals("MS.MSLAL7030.PoPrmsRecvConv_Conv03.DOWN.BLOCK0")){
			return MS_MSLAL7030_PoPrmsRecvConv_Conv03_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
			
	
	static final MCOperationInfo MS_MSLAL7030_PoPrmsRecvConv_Conv01_INFO = new MCOperationInfo("MS", "MSLAL7030", "PoPrmsRecvConv_Conv01", "000000", new PDef());

	public static MCContainerDef MS_MSLAL7030_PoPrmsRecvConv_Conv01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL7030", "PoPrmsRecvConv_Conv01",
			mcframe.serverPFUD.PFUDL5010.PDef.PF_PFUDL5010_ConvBase01_UP_BLOCK0(),
			new MCItemDef[]{
			}
			,
			MCBlockDef.create("ConvDtl")
		);
	}


	public static MCContainerDef MS_MSLAL7030_PoPrmsRecvConv_Conv01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL7030", "PoPrmsRecvConv_Conv01",
			mcframe.serverPFUD.PFUDL5010.PDef.PF_PFUDL5010_ConvBase01_DOWN_BLOCK0(),
			new MCItemDef[]{
			}
			,
			MCBlockDef.create("ConvDtl")
		);
	}
	
	static final MCOperationInfo MS_MSLAL7030_PoPrmsRecvConv_Conv02_INFO = new MCOperationInfo("MS", "MSLAL7030", "PoPrmsRecvConv_Conv02", "000000", new PDef());

	public static MCContainerDef MS_MSLAL7030_PoPrmsRecvConv_Conv02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL7030", "PoPrmsRecvConv_Conv02",
			mcframe.serverPFUD.PFUDL5010.PDef.PF_PFUDL5010_ConvBase03_UP_BLOCK0(),
			new MCItemDef[]{
			}
			,
			MCBlockDef.create("SdrvDtl")
		);
	}


	public static MCContainerDef MS_MSLAL7030_PoPrmsRecvConv_Conv02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL7030", "PoPrmsRecvConv_Conv02",
			mcframe.serverPFUD.PFUDL5010.PDef.PF_PFUDL5010_ConvBase03_DOWN_BLOCK0(),
			new MCItemDef[]{
			}
			,
			MCBlockDef.create("SdrvDtl")
		);
	}
	
	static final MCOperationInfo MS_MSLAL7030_PoPrmsRecvConv_Conv03_INFO = new MCOperationInfo("MS", "MSLAL7030", "PoPrmsRecvConv_Conv03", "000000", new PDef());

	public static MCContainerDef MS_MSLAL7030_PoPrmsRecvConv_Conv03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL7030", "PoPrmsRecvConv_Conv03",
			mcframe.serverPFUD.PFUDL5010.PDef.PF_PFUDL5010_ConvBase04_UP_BLOCK0(),
			new MCItemDef[]{
			}
			,
			MCBlockDef.create("SdrvDtl")
		);
	}

	public static MCContainerDef MS_MSLAL7030_PoPrmsRecvConv_Conv03_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSLAL7030", "PoPrmsRecvConv_Conv03",
			new MCItemDef[]{
				MCItemDef.create("data_lno", "data_lno"),
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("trd_typ_cd", "trd_typ_cd"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("data_make_dt", "data_make_dt"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("po_rev", "po_rev"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("prms_rev", "prms_rev"),
				MCItemDef.create("po_co_cd", "po_co_cd"),
				MCItemDef.create("po_co_nm", "po_co_nm"),
				MCItemDef.create("po_co_cntry_cd", "po_co_cntry_cd"),
				MCItemDef.create("slo_co_cd", "slo_co_cd"),
				MCItemDef.create("slo_co_nm", "slo_co_nm"),
				MCItemDef.create("slo_co_cntry_cd", "slo_co_cntry_cd"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("sls_dpt_nm", "sls_dpt_nm"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("sls_usr_nm", "sls_usr_nm"),
				MCItemDef.create("slo_co_itm_cd", "slo_co_itm_cd"),
				MCItemDef.create("slo_co_itm_sub1", "slo_co_itm_sub1"),
				MCItemDef.create("slo_co_itm_sub2", "slo_co_itm_sub2"),
				MCItemDef.create("slo_co_itm_sub3", "slo_co_itm_sub3"),
				MCItemDef.create("slo_co_itm_nm", "slo_co_itm_nm"),
				MCItemDef.create("po_co_itm_cd", "po_co_itm_cd"),
				MCItemDef.create("po_co_itm_sub1", "po_co_itm_sub1"),
				MCItemDef.create("po_co_itm_sub2", "po_co_itm_sub2"),
				MCItemDef.create("po_co_itm_sub3", "po_co_itm_sub3"),
				MCItemDef.create("po_co_itm_nm", "po_co_itm_nm"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("prms_dlv_dt", "prms_dlv_dt"),
				MCItemDef.create("prms_dlv_hm", "prms_dlv_hm"),
				MCItemDef.create("prms_rmrks", "prms_rmrks"),
				MCItemDef.create("dlv_inst_no", "dlv_inst_no"),
				MCItemDef.create("dlv_inst_rev", "dlv_inst_rev"),
				MCItemDef.create("dlv_inst_d_no", "dlv_inst_d_no"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("sub_char4", "sub_char4"),
				MCItemDef.create("sub_char5", "sub_char5"),
				MCItemDef.create("sub_char6", "sub_char6"),
				MCItemDef.create("sub_char7", "sub_char7"),
				MCItemDef.create("sub_char8", "sub_char8"),
				MCItemDef.create("sub_char9", "sub_char9"),
				MCItemDef.create("sub_char10", "sub_char10"),
				MCItemDef.create("sub_char11", "sub_char11"),
				MCItemDef.create("sub_char12", "sub_char12"),
				MCItemDef.create("sub_char13", "sub_char13"),
				MCItemDef.create("sub_char14", "sub_char14"),
				MCItemDef.create("sub_char15", "sub_char15"),
				MCItemDef.create("sub_char16", "sub_char16"),
				MCItemDef.create("sub_char17", "sub_char17"),
				MCItemDef.create("sub_char18", "sub_char18"),
				MCItemDef.create("sub_char19", "sub_char19"),
				MCItemDef.create("sub_char20", "sub_char20"),
				MCItemDef.create("sub_char21", "sub_char21"),
				MCItemDef.create("sub_char22", "sub_char22"),
				MCItemDef.create("sub_char23", "sub_char23"),
				MCItemDef.create("sub_char24", "sub_char24"),
				MCItemDef.create("sub_char25", "sub_char25"),
				MCItemDef.create("sub_char26", "sub_char26"),
				MCItemDef.create("sub_char27", "sub_char27"),
				MCItemDef.create("sub_char28", "sub_char28"),
				MCItemDef.create("sub_char29", "sub_char29"),
				MCItemDef.create("sub_char30", "sub_char30"),
				MCItemDef.create("sub_num1", "sub_num1"),
				MCItemDef.create("sub_num2", "sub_num2"),
				MCItemDef.create("sub_num3", "sub_num3"),
				MCItemDef.create("sub_num4", "sub_num4"),
				MCItemDef.create("sub_num5", "sub_num5"),
				MCItemDef.create("sub_dt1", "sub_dt1"),
				MCItemDef.create("sub_dt2", "sub_dt2"),
				MCItemDef.create("sub_dt3", "sub_dt3"),
				MCItemDef.create("sub_dt4", "sub_dt4"),
				MCItemDef.create("sub_dt5", "sub_dt5")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	public static MCContainerDef MS_MSLAL7030_PoPrmsRecvConv_Conv03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL7030", "PoPrmsRecvConv_Conv03",
			mcframe.serverPFUD.PFUDL5010.PDef.PF_PFUDL5010_ConvBase04_DOWN_BLOCK0(),
			new MCItemDef[]{
			}
			,
			MCBlockDef.create("SdrvDtl")
		);
	}
	//FMCB DEF_CLASSES END
}

