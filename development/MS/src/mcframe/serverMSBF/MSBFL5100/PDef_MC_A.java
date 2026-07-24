package mcframe.serverMSBF.MSBFL5100;

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
 * [MSBFL_PlntAprvService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBFL5100.PlntAprv_Chk01.UP.BLOCK0")){
			return MS_MSBFL5100_PlntAprv_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5100.PlntAprv_Chk01.DOWN.BLOCK0")){
			return MS_MSBFL5100_PlntAprv_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5100.PlntAprv_Chk02.UP.BLOCK0")){
			return MS_MSBFL5100_PlntAprv_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5100.PlntAprv_Chk02.DOWN.BLOCK0")){
			return MS_MSBFL5100_PlntAprv_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5100.PlntAprv_Upd01.UP.BLOCK0")){
			return MS_MSBFL5100_PlntAprv_Upd01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
			
	
	static final MCOperationInfo MS_MSBFL5100_PlntAprv_Chk01_INFO = new MCOperationInfo("MS", "MSBFL5100", "PlntAprv_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5100_PlntAprv_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5100", "PlntAprv_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("plnt_aprv_no", "plnt_aprv_no"),
				MCItemDef.create("plnt_aprv_d_no", "plnt_aprv_d_no"),
				MCItemDef.create("insp_typ", "insp_typ"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("src_no1", "src_no1"),
				MCItemDef.create("src_no2", "src_no2"),
				MCItemDef.create("src_no3", "src_no3"),
				MCItemDef.create("src_no4", "src_no4"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("insp_schd_no", "insp_schd_no")
			}
			,
			MCBlockDef.create("PlntAprv_Chk01_Rslt")
		);
	}


	public static MCContainerDef MS_MSBFL5100_PlntAprv_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5100", "PlntAprv_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("PlntAprv_Chk01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBFL5100_PlntAprv_Chk02_INFO = new MCOperationInfo("MS", "MSBFL5100", "PlntAprv_Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5100_PlntAprv_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5100", "PlntAprv_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("pre_inst_flg", "pre_inst_flg")
			}
			,
			MCBlockDef.create("PlntAprv_Chk02_Rslt")
		);
	}


	public static MCContainerDef MS_MSBFL5100_PlntAprv_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5100", "PlntAprv_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("PlntAprv_Chk02_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBFL5100_PlntAprv_Upd01_INFO = new MCOperationInfo("MS", "MSBFL5100", "PlntAprv_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5100_PlntAprv_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5100", "PlntAprv_Upd01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("plnt_aprv_no", "plnt_aprv_no"),
				MCItemDef.create("plnt_aprv_d_no", "plnt_aprv_d_no"),
				MCItemDef.create("insp_typ", "insp_typ"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("src_no1", "src_no1"),
				MCItemDef.create("src_no2", "src_no2"),
				MCItemDef.create("src_no3", "src_no3"),
				MCItemDef.create("src_no4", "src_no4"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("insp_act_end_tm", "insp_act_end_tm"),
				MCItemDef.create("insp_act_judg_dt", "insp_act_judg_dt"),
				MCItemDef.create("insp_schd_no", "insp_schd_no")
			}
			,
			MCBlockDef.create("PlntAprv_Upd01_Rslt")
		);
	}


	//FMCB DEF_CLASSES END
}

