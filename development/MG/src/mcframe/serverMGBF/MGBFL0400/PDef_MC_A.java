package mcframe.serverMGBF.MGBFL0400;

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
 * [MGBFL_MlyRptSrch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MG.MGBFL0400.Srch01.UP.BLOCK0")){
			return MG_MGBFL0400_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBFL0400.Srch01.DOWN.BLOCK0")){
			return MG_MGBFL0400_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBFL0400.Srch01.DOWN.BLOCK1")){
			return MG_MGBFL0400_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MG.MGBFL0400.Srch01.DOWN.BLOCK2")){
			return MG_MGBFL0400_Srch01_DOWN_BLOCK2();
		}
		else if (id.equals("MG.MGBFL0400.Srch01.DOWN.BLOCK3")){
			return MG_MGBFL0400_Srch01_DOWN_BLOCK3();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MG_MGBFL0400_Srch01_INFO = new MCOperationInfo("MG", "MGBFL0400", "Srch01", "000000", new PDef());

	public static MCContainerDef MG_MGBFL0400_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBFL0400", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("ym_fr", "ym_fr"),
				MCItemDef.create("ym_to", "ym_to"),
				MCItemDef.create("rpt_ptn_cd", "rpt_ptn_cd"),
				MCItemDef.create("rpt_key_cd", "rpt_key_cd"),
				MCItemDef.create("rpt_key_typ", "rpt_key_typ"),
				MCItemDef.create("mng_dpt_cd", "mng_dpt_cd"),
				MCItemDef.create("mng_dpt_nm", "mng_dpt_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("itm_jnl_cd", "itm_jnl_cd"),
				MCItemDef.create("itm_jnl_nm", "itm_jnl_nm"),
				MCItemDef.create("itm_grp_cd", "itm_grp_cd"),
				MCItemDef.create("itm_grp_nm", "itm_grp_nm"),
				MCItemDef.create("itm_grp_typ", "itm_grp_typ"),
				MCItemDef.create("wg_cd", "wg_cd")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MG_MGBFL0400_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBFL0400", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("rpt_tgt_typ", "rpt_tgt_typ"),
				MCItemDef.create("rpt_seq", "rpt_seq"),
				MCItemDef.create("fg_r", "fg_r"),
				MCItemDef.create("fg_g", "fg_g"),
				MCItemDef.create("fg_b", "fg_b"),
				MCItemDef.create("bg_r", "bg_r"),
				MCItemDef.create("bg_g", "bg_g"),
				MCItemDef.create("bg_b", "bg_b"),
				MCItemDef.create("qty_unit_typ", "qty_unit_typ"),
				MCItemDef.create("rpt_row_view", "rpt_row_view"),
				MCItemDef.create("col_all", "col_all")
			}
			,
			MCBlockDef.create("Srch01_Dtl")
		);
	}
	public static MCContainerDef MG_MGBFL0400_Srch01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MG", "MGBFL0400", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("cd", "cd"),
				MCItemDef.create("nm", "nm")
			}
			,
			MCBlockDef.create("Srch01_Key")
		);
	}
	public static MCContainerDef MG_MGBFL0400_Srch01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MG", "MGBFL0400", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("max_month", "max_month")
			}
			,
			MCBlockDef.create("Srch01_Hdr")
		);
	}
	public static MCContainerDef MG_MGBFL0400_Srch01_DOWN_BLOCK3() {

		return new MCGeneralContainerDef("MG", "MGBFL0400", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("calc_no", "calc_no")
			}
			,
			MCBlockDef.create("Srch01_CalcNo")
		);
	}
	//FMCB DEF_CLASSES END
}

