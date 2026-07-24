package mcframe.serverMSBE.MSBEL5520;

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
 * [MSBEL_ShipLotChkService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBEL5520.ShipLotChk_Chk01.UP.BLOCK0")){
			return MS_MSBEL5520_ShipLotChk_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5520.ShipLotChk_Chk01.DOWN.BLOCK0")){
			return MS_MSBEL5520_ShipLotChk_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5520.ShipLotChk_Srch01.UP.BLOCK0")){
			return MS_MSBEL5520_ShipLotChk_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5520.ShipLotChk_Srch01.DOWN.BLOCK0")){
			return MS_MSBEL5520_ShipLotChk_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5520.ShipLotChk_Upd01.UP.BLOCK0")){
			return MS_MSBEL5520_ShipLotChk_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5520.ShipLotChk_Upd01.DOWN.BLOCK0")){
			return MS_MSBEL5520_ShipLotChk_Upd01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
			
	
	static final MCOperationInfo MS_MSBEL5520_ShipLotChk_Chk01_INFO = new MCOperationInfo("MS", "MSBEL5520", "ShipLotChk_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5520_ShipLotChk_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5520", "ShipLotChk_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("sl" + ".cst_cd", "cst_cd"),
				MCItemDef.create("sl" + ".dlv_cd", "dlv_cd"),
				MCItemDef.create("sl" + ".itm_cd", "itm_cd"),
				MCItemDef.create("sl" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("sl" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("sl" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("sl" + ".base_dt", "base_dt"),
				MCItemDef.create("sl" + ".lot_no", "lot_no"),
				MCItemDef.create("sl" + ".sublot_no", "sublot_no"),
				MCItemDef.create("sl" + ".ship_act_d_no", "ship_act_d_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("dlv_inst_rcpt_no", "dlv_inst_rcpt_no"),
				MCItemDef.create("ship_inst_d_no", "ship_inst_d_no"),
				MCItemDef.create("ship_act_no", "ship_act_no")
			}
			,
			MCBlockDef.create("ShipLot_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL5520_ShipLotChk_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5520", "ShipLotChk_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("ShipLot_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5520_ShipLotChk_Srch01_INFO = new MCOperationInfo("MS", "MSBEL5520", "ShipLotChk_Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5520_ShipLotChk_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5520", "ShipLotChk_Srch01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("sl" + ".cst_cd", "cst_cd"),
				MCItemDef.create("sl" + ".dlv_cd", "dlv_cd"),
				MCItemDef.create("sl" + ".itm_cd", "itm_cd"),
				MCItemDef.create("sl" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("sl" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("sl" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("sl" + ".base_dt", "base_dt"),
				MCItemDef.create("sl" + ".ship_act_d_no", "ship_act_d_no"),
				MCItemDef.create("lock_flg", "lock_flg"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("dlv_inst_rcpt_no", "dlv_inst_rcpt_no"),
				MCItemDef.create("ship_inst_d_no", "ship_inst_d_no"),
				MCItemDef.create("ship_act_no", "ship_act_no")
			}
			,
			MCBlockDef.create("ShipLot_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL5520_ShipLotChk_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5520", "ShipLotChk_Srch01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("valid_dt_fr", "valid_dt_fr"),
				MCItemDef.create("valid_dt_fr_grp", "valid_dt_fr_grp"),
				MCItemDef.create("valid_dt_to", "valid_dt_to")
			}
			,
			MCBlockDef.create("ShipLot_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5520_ShipLotChk_Upd01_INFO = new MCOperationInfo("MS", "MSBEL5520", "ShipLotChk_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5520_ShipLotChk_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5520", "ShipLotChk_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("sl" + ".cst_cd", "cst_cd"),
				MCItemDef.create("sl" + ".dlv_cd", "dlv_cd"),
				MCItemDef.create("sl" + ".itm_cd", "itm_cd"),
				MCItemDef.create("sl" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("sl" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("sl" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("sl" + ".base_dt", "base_dt"),
				MCItemDef.create("sl" + ".lot_no", "lot_no"),
				MCItemDef.create("sl" + ".sublot_no", "sublot_no"),
				MCItemDef.create("sl" + ".ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("sl" + ".ship_act_d_no", "ship_act_d_no"),
				MCItemDef.create("lock_flg", "lock_flg"),
				MCItemDef.create("org_ship_alloc_sts_no", "org_ship_alloc_sts_no"),
				MCItemDef.create("org_ship_act_d_no", "org_ship_act_d_no")
			}
			,
			MCBlockDef.create("ShipLot_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL5520_ShipLotChk_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5520", "ShipLotChk_Upd01",
			new MCItemDef[]{
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("ShipLot_Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

