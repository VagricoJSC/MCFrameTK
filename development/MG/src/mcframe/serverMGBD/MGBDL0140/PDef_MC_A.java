package mcframe.serverMGBD.MGBDL0140;

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
 * [MGBDL_ExpProvSrch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MG.MGBDL0140.Srch01.UP.BLOCK0")){
			return MG_MGBDL0140_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0140.Srch01.DOWN.BLOCK0")){
			return MG_MGBDL0140_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0140.Srch01.DOWN.BLOCK1")){
			return MG_MGBDL0140_Srch01_DOWN_BLOCK1();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MG_MGBDL0140_Srch01_INFO = new MCOperationInfo("MG", "MGBDL0140", "Srch01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0140_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0140", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("calc_no", "calc_no"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_jnl_cd", "itm_jnl_cd"),
				MCItemDef.create("itm_jnl_nm", "itm_jnl_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("mng_dpt_cd", "mng_dpt_cd"),
				MCItemDef.create("mng_dpt_nm", "mng_dpt_nm"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("prsppl_cd", "prsppl_cd"),
				MCItemDef.create("prsppl_nm", "prsppl_nm"),
				MCItemDef.create("prsppl_cntry_cd", "prsppl_cntry_cd"),
				MCItemDef.create("prsppl_cntry_nm", "prsppl_cntry_nm"),
				MCItemDef.create("prsppl_area_cd", "prsppl_area_cd"),
				MCItemDef.create("prsppl_area_nm", "prsppl_area_nm"),
				MCItemDef.create("itm_grp_cd1", "itm_grp_cd1"),
				MCItemDef.create("itm_grp_nm1", "itm_grp_nm1"),
				MCItemDef.create("itm_grp_cd2", "itm_grp_cd2"),
				MCItemDef.create("itm_grp_nm2", "itm_grp_nm2"),
				MCItemDef.create("itm_grp_cd3", "itm_grp_cd3"),
				MCItemDef.create("itm_grp_nm3", "itm_grp_nm3"),
				MCItemDef.create("itm_grp_cd4", "itm_grp_cd4"),
				MCItemDef.create("itm_grp_nm4", "itm_grp_nm4"),
				MCItemDef.create("itm_grp_cd5", "itm_grp_cd5"),
				MCItemDef.create("itm_grp_nm5", "itm_grp_nm5"),
				MCItemDef.create("itm_grp_cd6", "itm_grp_cd6"),
				MCItemDef.create("itm_grp_nm6", "itm_grp_nm6"),
				MCItemDef.create("itm_grp_cd7", "itm_grp_cd7"),
				MCItemDef.create("itm_grp_nm7", "itm_grp_nm7"),
				MCItemDef.create("itm_grp_cd8", "itm_grp_cd8"),
				MCItemDef.create("itm_grp_nm8", "itm_grp_nm8"),
				MCItemDef.create("itm_grp_cd9", "itm_grp_cd9"),
				MCItemDef.create("itm_grp_nm9", "itm_grp_nm9"),
				MCItemDef.create("itm_grp_cd10", "itm_grp_cd10"),
				MCItemDef.create("itm_grp_nm10", "itm_grp_nm10"),
				MCItemDef.create("prsppl_grp_cd1", "prsppl_grp_cd1"),
				MCItemDef.create("prsppl_grp_nm1", "prsppl_grp_nm1"),
				MCItemDef.create("prsppl_grp_cd2", "prsppl_grp_cd2"),
				MCItemDef.create("prsppl_grp_nm2", "prsppl_grp_nm2"),
				MCItemDef.create("prsppl_grp_cd3", "prsppl_grp_cd3"),
				MCItemDef.create("prsppl_grp_nm3", "prsppl_grp_nm3"),
				MCItemDef.create("prsppl_grp_cd4", "prsppl_grp_cd4"),
				MCItemDef.create("prsppl_grp_nm4", "prsppl_grp_nm4"),
				MCItemDef.create("prsppl_grp_cd5", "prsppl_grp_cd5"),
				MCItemDef.create("prsppl_grp_nm5", "prsppl_grp_nm5"),
				MCItemDef.create("prsppl_grp_cd6", "prsppl_grp_cd6"),
				MCItemDef.create("prsppl_grp_nm6", "prsppl_grp_nm6"),
				MCItemDef.create("prsppl_grp_cd7", "prsppl_grp_cd7"),
				MCItemDef.create("prsppl_grp_nm7", "prsppl_grp_nm7"),
				MCItemDef.create("prsppl_grp_cd8", "prsppl_grp_cd8"),
				MCItemDef.create("prsppl_grp_nm8", "prsppl_grp_nm8"),
				MCItemDef.create("prsppl_grp_cd9", "prsppl_grp_cd9"),
				MCItemDef.create("prsppl_grp_nm9", "prsppl_grp_nm9"),
				MCItemDef.create("prsppl_grp_cd10", "prsppl_grp_cd10"),
				MCItemDef.create("prsppl_grp_nm10", "prsppl_grp_nm10"),
				MCItemDef.create("wg_flg", "wg_flg"),
				MCItemDef.create("mng_dpt_flg", "mng_dpt_flg"),
				MCItemDef.create("lot_flg", "lot_flg"),
				MCItemDef.create("sublot_flg", "sublot_flg"),
				MCItemDef.create("sno1_flg", "sno1_flg"),
				MCItemDef.create("sno2_flg", "sno2_flg"),
				MCItemDef.create("sno3_flg", "sno3_flg"),
				MCItemDef.create("sno4_flg", "sno4_flg"),
				MCItemDef.create("prsppl_flg", "prsppl_flg"),
				MCItemDef.create("prov_flg", "prov_flg")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MG_MGBDL0140_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0140", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("mng_dpt_cd", "mng_dpt_cd"),
				MCItemDef.create("mng_dpt_nm", "mng_dpt_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_jnl_cd", "itm_jnl_cd"),
				MCItemDef.create("itm_jnl_nm", "itm_jnl_nm"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("prsppl_cd", "prsppl_cd"),
				MCItemDef.create("prsppl_nm", "prsppl_nm"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("prov_typ_nm", "prov_typ_nm"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("qty", "qty"),
				MCItemDef.create("amt", "amt")
			}
			,
			MCBlockDef.create("Srch01_Rslt")
		);
	}
	public static MCContainerDef MG_MGBDL0140_Srch01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MG", "MGBDL0140", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("st_ym", "st_ym"),
				MCItemDef.create("end_ym", "end_ym")
			}
			,
			MCBlockDef.create("Srch01_Hdr")
		);
	}
	//FMCB DEF_CLASSES END
}

