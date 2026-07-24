package mcframe.serverMSBC.MSBCL5050;

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
 * [MSBCL_MrpExecService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBCL5050.MRP_Upd01.UP.BLOCK0")){
			return MS_MSBCL5050_MRP_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL5050.MRP_Upd01.DOWN.BLOCK0")){
			return MS_MSBCL5050_MRP_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL5050.MRP_Upd02.UP.BLOCK0")){
			return MS_MSBCL5050_MRP_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL5050.MRP_Upd02.DOWN.BLOCK0")){
			return MS_MSBCL5050_MRP_Upd02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL5050.MRP_Upd03.UP.BLOCK0")){
			return MS_MSBCL5050_MRP_Upd03_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
			
	
	static final MCOperationInfo MS_MSBCL5050_MRP_Upd01_INFO = new MCOperationInfo("MS", "MSBCL5050", "MRP_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL5050_MRP_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL5050", "MRP_Upd01",
			new MCItemDef[]{
				MCItemDef.create("mrp_typ", "mrp_typ"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("gi_schd_fr", "gi_schd_fr"),
				MCItemDef.create("irqmt_fr", "irqmt_fr"),
				MCItemDef.create("sim_mrp_no", "sim_mrp_no"),
				MCItemDef.create("sim_mrp_typ", "sim_mrp_typ"),
				MCItemDef.create("sch_flg", "sch_flg")
			}
			,
			MCBlockDef.create("Mrp_Upd01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBCL5050_MRP_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL5050", "MRP_Upd01",
			new MCItemDef[]{
				MCItemDef.create("mrp_typ", "mrp_typ"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("sim_mrp_no", "sim_mrp_no"),
				MCItemDef.create("sim_mrp_typ", "sim_mrp_typ"),
				MCItemDef.create("mrp_calc_no", "mrp_calc_no")
			}
			,
			MCBlockDef.create("Mrp_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBCL5050_MRP_Upd02_INFO = new MCOperationInfo("MS", "MSBCL5050", "MRP_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBCL5050_MRP_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL5050", "MRP_Upd02",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("sim_mrp_no", "sim_mrp_no"),
				MCItemDef.create("tree_lvl", "tree_lvl")
			}
			,
			MCBlockDef.create("Mrp_Upd02_Dtl")
		);
	}


	public static MCContainerDef MS_MSBCL5050_MRP_Upd02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL5050", "MRP_Upd02",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("sim_mrp_no", "sim_mrp_no")
			}
			,
			MCBlockDef.create("Mrp_Upd02_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBCL5050_MRP_Upd03_INFO = new MCOperationInfo("MS", "MSBCL5050", "MRP_Upd03", "000000", new PDef());

	public static MCContainerDef MS_MSBCL5050_MRP_Upd03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL5050", "MRP_Upd03",
			new MCItemDef[]{
				MCItemDef.create("rqmt_no", "rqmt_no"),
				MCItemDef.create("sim_mrp_no", "sim_mrp_no"),
				MCItemDef.create("tree_lvl", "tree_lvl"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_rqst_typ", "wg_rqst_typ"),
				MCItemDef.create("wg_rqst_no", "wg_rqst_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("io_schd_no", "io_schd_no"),
				MCItemDef.create("io_schd_typ", "io_schd_typ"),
				MCItemDef.create("io_schd_sts_typ", "io_schd_sts_typ")
			}
			,
			MCBlockDef.create("Mrp_Upd03_Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

