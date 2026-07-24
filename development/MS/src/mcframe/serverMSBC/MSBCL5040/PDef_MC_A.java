package mcframe.serverMSBC.MSBCL5040;

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
 * [MSBCL_LdCalcService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBCL5040.ItmOrdLd_Srch01.UP.BLOCK0")){
			return MS_MSBCL5040_ItmOrdLd_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL5040.ItmOrdLd_Srch01.UP.BLOCK1")){
			return MS_MSBCL5040_ItmOrdLd_Srch01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL5040.ItmOrdLd_Srch01.DOWN.BLOCK0")){
			return MS_MSBCL5040_ItmOrdLd_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL5040.ItmOrdLd_Srch01.DOWN.BLOCK1")){
			return MS_MSBCL5040_ItmOrdLd_Srch01_DOWN_BLOCK1();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MS_MSBCL5040_ItmOrdLd_Srch01_INFO = new MCOperationInfo("MS", "MSBCL5040", "ItmOrdLd_Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL5040_ItmOrdLd_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL5040", "ItmOrdLd_Srch01",
			new MCItemDef[]{
				MCItemDef.create("opn_flg", "opn_flg"),
				MCItemDef.create("sav_flg", "sav_flg"),
				MCItemDef.create("fix_flg", "fix_flg"),
				MCItemDef.create("inst_flg", "inst_flg"),
				MCItemDef.create("cmpl_flg", "cmpl_flg"),
				MCItemDef.create("prcd_flg", "prcd_flg"),
				MCItemDef.create("sim_flg", "sim_flg"),
				MCItemDef.create("sim_mrp_no", "sim_mrp_no"),
				MCItemDef.create("dt_fr", "dt_fr"),
				MCItemDef.create("dt_to", "dt_to"),
				MCItemDef.create("period_typ", "period_typ"),
				MCItemDef.create("ld_sub_calc_typ", "ld_sub_calc_typ")
			}
			,
			MCBlockDef.create("ItmOrdLd_Srch01_Cnd")
		);
	}

	public static MCContainerDef MS_MSBCL5040_ItmOrdLd_Srch01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL5040", "ItmOrdLd_Srch01",
			new MCItemDef[]{
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd")
			}
			,
			MCBlockDef.create("ItmOrdLd_Srch01_LocCnd")
		);
	}


	public static MCContainerDef MS_MSBCL5040_ItmOrdLd_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL5040", "ItmOrdLd_Srch01",
			new MCItemDef[]{
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("rsrc_cd", "rsrc_cd"),
				MCItemDef.create("rsrc_nm", "rsrc_nm"),
				MCItemDef.create("rsrc_unit_nm", "rsrc_unit_nm"),
				MCItemDef.create("rsrc_dec_place", "rsrc_dec_place"),
				MCItemDef.create("dt_fr", "dt_fr"),
				MCItemDef.create("dt_to", "dt_to"),
				MCItemDef.create("on_num", "on_num"),
				MCItemDef.create("act_qty", "act_qty"),
				MCItemDef.create("base_qty", "base_qty"),
				MCItemDef.create("alert_qty", "alert_qty"),
				MCItemDef.create("ld_rate", "ld_rate")
			}
			,
			MCBlockDef.create("ItmOrdLd_Srch01_SumRslt")
		);
	}
	public static MCContainerDef MS_MSBCL5040_ItmOrdLd_Srch01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL5040", "ItmOrdLd_Srch01",
			new MCItemDef[]{
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("rsrc_cd", "rsrc_cd"),
				MCItemDef.create("rsrc_nm", "rsrc_nm"),
				MCItemDef.create("rsrc_unit_nm", "rsrc_unit_nm"),
				MCItemDef.create("rsrc_dec_place", "rsrc_dec_place"),
				MCItemDef.create("ld_sub_cd", "ld_sub_cd"),
				MCItemDef.create("ld_sub_nm", "ld_sub_nm"),
				MCItemDef.create("dt_fr", "dt_fr"),
				MCItemDef.create("dt_to", "dt_to"),
				MCItemDef.create("act_qty", "act_qty"),
				MCItemDef.create("ld_rate", "ld_rate")
			}
			,
			MCBlockDef.create("ItmOrdLd_Srch01_SubRslt")
		);
	}
	//FMCB DEF_CLASSES END
}

