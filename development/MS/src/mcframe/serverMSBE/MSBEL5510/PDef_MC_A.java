package mcframe.serverMSBE.MSBEL5510;

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
 * [MSBEL_ShipSchdDtCalcService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBEL5510.ShipSchdDt_Srch01.UP.BLOCK0")){
			return MS_MSBEL5510_ShipSchdDt_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5510.ShipSchdDt_Srch01.DOWN.BLOCK0")){
			return MS_MSBEL5510_ShipSchdDt_Srch01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MS_MSBEL5510_ShipSchdDt_Srch01_INFO = new MCOperationInfo("MS", "MSBEL5510", "ShipSchdDt_Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5510_ShipSchdDt_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5510", "ShipSchdDt_Srch01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("ship_to_id_typ", "ship_to_id_typ"),
				MCItemDef.create("ship_to_id_cd", "ship_to_id_cd"),
				MCItemDef.create("ship_to_lg_grp_cd", "ship_to_lg_grp_cd"),
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("ship_term_cd", "ship_term_cd"),
				MCItemDef.create("dlv_rqst_tm", "dlv_rqst_tm"),
				MCItemDef.create("dlv_day_week_typ", "dlv_day_week_typ"),
				MCItemDef.create("ship_rqst_tm", "ship_rqst_tm"),
				MCItemDef.create("base_dt", "base_dt"),
				MCItemDef.create("ship_inst_typ", "ship_inst_typ"),
				MCItemDef.create("cl_time_chk_flg", "cl_time_chk_flg"),
				MCItemDef.create("ship_dt_chk_flg", "ship_dt_chk_flg"),
				MCItemDef.create("ship_cal_cd_chk_flg", "ship_cal_cd_chk_flg"),
				MCItemDef.create("early_ship_dt_add_days_chk_flg", "early_ship_dt_add_days_chk_flg")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL5510_ShipSchdDt_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5510", "ShipSchdDt_Srch01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("ship_schd_tm", "ship_schd_tm"),
				MCItemDef.create("dlv_schd_tm", "dlv_schd_tm"),
				MCItemDef.create("ship_wk_grp_cd", "ship_wk_grp_cd"),
				MCItemDef.create("ship_wk_cd", "ship_wk_cd")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}
	//FMCB DEF_CLASSES END
}

