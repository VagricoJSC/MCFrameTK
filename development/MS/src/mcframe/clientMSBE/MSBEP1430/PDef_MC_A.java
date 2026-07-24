package mcframe.clientMSBE.MSBEP1430;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MSBEP_ShipPlnSrch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBEL1430.Srch01.UP.BLOCK0")){
			return MS_MSBEL1430_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1430.Srch01.DOWN.BLOCK0")){
			return MS_MSBEL1430_Srch01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MS_MSBEL1430_Srch01_INFO = new MCOperationInfo("MS", "MSBEL1430", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1430_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1430", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("not_alloc_flg", "not_alloc_flg"),
				MCItemDef.create("part_alloc_flg", "part_alloc_flg"),
				MCItemDef.create("all_alloc_flg", "all_alloc_flg"),
				MCItemDef.create("alloc_invalid_flg", "alloc_invalid_flg"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("ship_wk_grp_cd", "ship_wk_grp_cd"),
				MCItemDef.create("ship_wk_grp_nm", "ship_wk_grp_nm"),
				MCItemDef.create("ssdt_p" + ".ymd_fr", "ship_schd_dt_fr"),
				MCItemDef.create("ssdt_p" + ".hm_fr", "ship_schd_hm_fr"),
				MCItemDef.create("ssdt_p" + ".ymd_to", "ship_schd_dt_to"),
				MCItemDef.create("ssdt_p" + ".hm_to", "ship_schd_hm_to"),
				MCItemDef.create("ship_abl_only_flg", "ship_abl_only_flg")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL1430_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1430", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("ship_schd_dt_p" + ".ymd", "ship_schd_dt"),
				MCItemDef.create("ship_schd_dt_p" + ".hm", "ship_schd_hm"),
				MCItemDef.create("dlv_schd_dt_p" + ".ymd", "dlv_schd_dt"),
				MCItemDef.create("dlv_schd_dt_p" + ".hm", "dlv_schd_hm"),
				MCItemDef.create("ship_wk_cd", "ship_wk_cd"),
				MCItemDef.create("ship_wk_nm", "ship_wk_nm"),
				MCItemDef.create("not_inst_ship_to_cnt", "not_inst_ship_to_cnt"),
				MCItemDef.create("not_inst_d_cnt", "not_inst_d_cnt"),
				MCItemDef.create("not_inst_wt", "not_inst_wt"),
				MCItemDef.create("not_inst_dim", "not_inst_dim"),
				MCItemDef.create("inst_ship_to_cnt", "inst_ship_to_cnt"),
				MCItemDef.create("inst_d_cnt", "inst_d_cnt"),
				MCItemDef.create("inst_wt", "inst_wt"),
				MCItemDef.create("inst_dim", "inst_dim")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

