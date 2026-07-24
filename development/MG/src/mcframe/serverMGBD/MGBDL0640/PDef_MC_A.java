package mcframe.serverMGBD.MGBDL0640;

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
 * [MGBDL_CostItmCopyReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MG.MGBDL0640.CostItmCopy_Chk01.UP.BLOCK0")){
			return MG_MGBDL0640_CostItmCopy_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0640.CostItmCopy_Chk01.DOWN.BLOCK0")){
			return MG_MGBDL0640_CostItmCopy_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0640.CostItmCopy_Chk02.UP.BLOCK0")){
			return MG_MGBDL0640_CostItmCopy_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0640.CostItmCopy_Chk02.DOWN.BLOCK0")){
			return MG_MGBDL0640_CostItmCopy_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0640.CostItmCopy_Ins01.UP.BLOCK0")){
			return MG_MGBDL0640_CostItmCopy_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0640.CostItmCopy_Ins01.DOWN.BLOCK0")){
			return MG_MGBDL0640_CostItmCopy_Ins01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0640.CostItmCopy_Del01.UP.BLOCK0")){
			return MG_MGBDL0640_CostItmCopy_Del01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0640.CostItmCopy_Del01.DOWN.BLOCK0")){
			return MG_MGBDL0640_CostItmCopy_Del01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0640.Ins01.UP.BLOCK0")){
			return MG_MGBDL0640_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0640.Del01.UP.BLOCK0")){
			return MG_MGBDL0640_Del01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0640.Del01.DOWN.BLOCK0")){
			return MG_MGBDL0640_Del01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0640.Srch01.UP.BLOCK0")){
			return MG_MGBDL0640_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0640.Srch01.DOWN.BLOCK0")){
			return MG_MGBDL0640_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0640.Srch02.UP.BLOCK0")){
			return MG_MGBDL0640_Srch02_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0640.Srch02.DOWN.BLOCK0")){
			return MG_MGBDL0640_Srch02_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
								
	
	static final MCOperationInfo MG_MGBDL0640_CostItmCopy_Chk01_INFO = new MCOperationInfo("MG", "MGBDL0640", "CostItmCopy_Chk01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0640_CostItmCopy_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0640", "CostItmCopy_Chk01",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("term", "term"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("dest_itm_cd", "dest_itm_cd"),
				MCItemDef.create("dest_itm_sub1", "dest_itm_sub1"),
				MCItemDef.create("dest_itm_sub2", "dest_itm_sub2"),
				MCItemDef.create("dest_itm_sub3", "dest_itm_sub3"),
				MCItemDef.create("copy_mgt_itm", "copy_mgt_itm"),
				MCItemDef.create("copy_mgt_itm_dtl", "copy_mgt_itm_dtl"),
				MCItemDef.create("copy_mgt_itm_oper", "copy_mgt_itm_oper"),
				MCItemDef.create("copy_mgt_bom", "copy_mgt_bom"),
				MCItemDef.create("copy_mgt_itm_wk", "copy_mgt_itm_wk"),
				MCItemDef.create("copy_mgt_itm_purc", "copy_mgt_itm_purc"),
				MCItemDef.create("copy_mgt_itm_proc", "copy_mgt_itm_proc"),
				MCItemDef.create("copy_mgt_itm_prov", "copy_mgt_itm_prov"),
				MCItemDef.create("copy_mgt_itm_sls", "copy_mgt_itm_sls"),
				MCItemDef.create("copy_mgt_itm_fix", "copy_mgt_itm_fix")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	public static MCContainerDef MG_MGBDL0640_CostItmCopy_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0640", "CostItmCopy_Chk01",
			new MCItemDef[]{
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("dest_stk_mng_typ", "dest_stk_mng_typ"),
				MCItemDef.create("dest_asset_mng_typ", "dest_asset_mng_typ"),
				MCItemDef.create("dest_base_unit_cd", "dest_base_unit_cd"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0640_CostItmCopy_Chk02_INFO = new MCOperationInfo("MG", "MGBDL0640", "CostItmCopy_Chk02", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0640_CostItmCopy_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0640", "CostItmCopy_Chk02",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("term", "term"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("copy_mgt_itm", "copy_mgt_itm"),
				MCItemDef.create("copy_mgt_itm_dtl", "copy_mgt_itm_dtl"),
				MCItemDef.create("copy_mgt_itm_oper", "copy_mgt_itm_oper"),
				MCItemDef.create("copy_mgt_bom", "copy_mgt_bom"),
				MCItemDef.create("copy_mgt_itm_wk", "copy_mgt_itm_wk"),
				MCItemDef.create("copy_mgt_itm_purc", "copy_mgt_itm_purc"),
				MCItemDef.create("copy_mgt_itm_proc", "copy_mgt_itm_proc"),
				MCItemDef.create("copy_mgt_itm_prov", "copy_mgt_itm_prov"),
				MCItemDef.create("copy_mgt_itm_sls", "copy_mgt_itm_sls"),
				MCItemDef.create("copy_mgt_itm_fix", "copy_mgt_itm_fix")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	public static MCContainerDef MG_MGBDL0640_CostItmCopy_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0640", "CostItmCopy_Chk02",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("term", "term"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("copy_mgt_itm", "copy_mgt_itm"),
				MCItemDef.create("copy_mgt_itm_dtl", "copy_mgt_itm_dtl"),
				MCItemDef.create("copy_mgt_itm_oper", "copy_mgt_itm_oper"),
				MCItemDef.create("copy_mgt_bom", "copy_mgt_bom"),
				MCItemDef.create("copy_mgt_itm_wk", "copy_mgt_itm_wk"),
				MCItemDef.create("copy_mgt_itm_purc", "copy_mgt_itm_purc"),
				MCItemDef.create("copy_mgt_itm_proc", "copy_mgt_itm_proc"),
				MCItemDef.create("copy_mgt_itm_prov", "copy_mgt_itm_prov"),
				MCItemDef.create("copy_mgt_itm_sls", "copy_mgt_itm_sls"),
				MCItemDef.create("copy_mgt_itm_fix", "copy_mgt_itm_fix"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0640_CostItmCopy_Ins01_INFO = new MCOperationInfo("MG", "MGBDL0640", "CostItmCopy_Ins01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0640_CostItmCopy_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0640", "CostItmCopy_Ins01",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("term", "term"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("dest_itm_cd", "dest_itm_cd"),
				MCItemDef.create("dest_itm_sub1", "dest_itm_sub1"),
				MCItemDef.create("dest_itm_sub2", "dest_itm_sub2"),
				MCItemDef.create("dest_itm_sub3", "dest_itm_sub3"),
				MCItemDef.create("copy_mgt_itm", "copy_mgt_itm"),
				MCItemDef.create("copy_mgt_itm_dtl", "copy_mgt_itm_dtl"),
				MCItemDef.create("copy_mgt_itm_oper", "copy_mgt_itm_oper"),
				MCItemDef.create("copy_mgt_bom", "copy_mgt_bom"),
				MCItemDef.create("copy_mgt_itm_wk", "copy_mgt_itm_wk"),
				MCItemDef.create("copy_mgt_itm_purc", "copy_mgt_itm_purc"),
				MCItemDef.create("copy_mgt_itm_proc", "copy_mgt_itm_proc"),
				MCItemDef.create("copy_mgt_itm_prov", "copy_mgt_itm_prov"),
				MCItemDef.create("copy_mgt_itm_sls", "copy_mgt_itm_sls"),
				MCItemDef.create("copy_mgt_itm_fix", "copy_mgt_itm_fix")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	public static MCContainerDef MG_MGBDL0640_CostItmCopy_Ins01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0640", "CostItmCopy_Ins01",
			new MCItemDef[]{
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("dest_base_unit_cd", "dest_base_unit_cd"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0640_CostItmCopy_Del01_INFO = new MCOperationInfo("MG", "MGBDL0640", "CostItmCopy_Del01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0640_CostItmCopy_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0640", "CostItmCopy_Del01",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("term", "term"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	public static MCContainerDef MG_MGBDL0640_CostItmCopy_Del01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0640", "CostItmCopy_Del01",
			new MCItemDef[]{
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("dest_base_unit_cd", "dest_base_unit_cd"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0640_Ins01_INFO = new MCOperationInfo("MG", "MGBDL0640", "Ins01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0640_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0640", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("term", "term"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("dest_itm_cd", "dest_itm_cd"),
				MCItemDef.create("dest_itm_sub1", "dest_itm_sub1"),
				MCItemDef.create("dest_itm_sub2", "dest_itm_sub2"),
				MCItemDef.create("dest_itm_sub3", "dest_itm_sub3"),
				MCItemDef.create("copy_mgt_itm", "copy_mgt_itm"),
				MCItemDef.create("copy_mgt_itm_dtl", "copy_mgt_itm_dtl"),
				MCItemDef.create("copy_mgt_itm_oper", "copy_mgt_itm_oper"),
				MCItemDef.create("copy_mgt_bom", "copy_mgt_bom"),
				MCItemDef.create("copy_mgt_itm_wk", "copy_mgt_itm_wk"),
				MCItemDef.create("copy_mgt_itm_purc", "copy_mgt_itm_purc"),
				MCItemDef.create("copy_mgt_itm_proc", "copy_mgt_itm_proc"),
				MCItemDef.create("copy_mgt_itm_prov", "copy_mgt_itm_prov"),
				MCItemDef.create("copy_mgt_itm_sls", "copy_mgt_itm_sls"),
				MCItemDef.create("copy_mgt_itm_fix", "copy_mgt_itm_fix")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0640_Del01_INFO = new MCOperationInfo("MG", "MGBDL0640", "Del01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0640_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0640", "Del01",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("term", "term"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	public static MCContainerDef MG_MGBDL0640_Del01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0640", "Del01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0640_Srch01_INFO = new MCOperationInfo("MG", "MGBDL0640", "Srch01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0640_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0640", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("term", "term"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("del_flg_on", "del_flg_on"),
				MCItemDef.create("del_flg_off", "del_flg_off"),
				MCItemDef.create("release_flg_on", "release_flg_on"),
				MCItemDef.create("release_flg_off", "release_flg_off"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
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
				MCItemDef.create("itm_jnl_cd", "itm_jnl_cd"),
				MCItemDef.create("itm_jnl_nm", "itm_jnl_nm")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MG_MGBDL0640_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0640", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("term", "term"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("base_itm_nm", "base_itm_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_jnl_cd", "itm_jnl_cd"),
				MCItemDef.create("itm_jnl_nm", "itm_jnl_nm"),
				MCItemDef.create("mam_itm_", "mam_itm_"),
				MCItemDef.create("mgt_itm", "mgt_itm"),
				MCItemDef.create("mgt_itm_dtl", "mgt_itm_dtl"),
				MCItemDef.create("mgt_itm_oper", "mgt_itm_oper"),
				MCItemDef.create("mgt_bom", "mgt_bom"),
				MCItemDef.create("mgt_itm_wk", "mgt_itm_wk"),
				MCItemDef.create("mgt_itm_purc", "mgt_itm_purc"),
				MCItemDef.create("mgt_itm_proc", "mgt_itm_proc"),
				MCItemDef.create("mgt_itm_prov", "mgt_itm_prov"),
				MCItemDef.create("mgt_itm_sls", "mgt_itm_sls"),
				MCItemDef.create("mgt_itm_fix", "mgt_itm_fix"),
				MCItemDef.create("copy_mam_itm_", "copy_mam_itm_"),
				MCItemDef.create("copy_mgt_itm", "copy_mgt_itm"),
				MCItemDef.create("copy_mgt_itm_dtl", "copy_mgt_itm_dtl"),
				MCItemDef.create("copy_mgt_itm_oper", "copy_mgt_itm_oper"),
				MCItemDef.create("copy_mgt_bom", "copy_mgt_bom"),
				MCItemDef.create("copy_mgt_itm_wk", "copy_mgt_itm_wk"),
				MCItemDef.create("copy_mgt_itm_purc", "copy_mgt_itm_purc"),
				MCItemDef.create("copy_mgt_itm_proc", "copy_mgt_itm_proc"),
				MCItemDef.create("copy_mgt_itm_prov", "copy_mgt_itm_prov"),
				MCItemDef.create("copy_mgt_itm_sls", "copy_mgt_itm_sls"),
				MCItemDef.create("copy_mgt_itm_fix", "copy_mgt_itm_fix")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0640_Srch02_INFO = new MCOperationInfo("MG", "MGBDL0640", "Srch02", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0640_Srch02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0640", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("term", "term"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("del_flg_on", "del_flg_on"),
				MCItemDef.create("del_flg_off", "del_flg_off"),
				MCItemDef.create("release_flg_on", "release_flg_on"),
				MCItemDef.create("release_flg_off", "release_flg_off"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
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
				MCItemDef.create("itm_jnl_cd", "itm_jnl_cd"),
				MCItemDef.create("itm_jnl_nm", "itm_jnl_nm")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MG_MGBDL0640_Srch02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0640", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("term", "term"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("base_itm_nm", "base_itm_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_jnl_cd", "itm_jnl_cd"),
				MCItemDef.create("itm_jnl_nm", "itm_jnl_nm"),
				MCItemDef.create("dest_itm_cd", "dest_itm_cd"),
				MCItemDef.create("dest_itm_sub1", "dest_itm_sub1"),
				MCItemDef.create("dest_itm_sub2", "dest_itm_sub2"),
				MCItemDef.create("dest_itm_sub3", "dest_itm_sub3"),
				MCItemDef.create("dest_itm_nm", "dest_itm_nm"),
				MCItemDef.create("mam_itm_", "mam_itm_"),
				MCItemDef.create("mgt_itm", "mgt_itm"),
				MCItemDef.create("mgt_itm_dtl", "mgt_itm_dtl"),
				MCItemDef.create("mgt_itm_oper", "mgt_itm_oper"),
				MCItemDef.create("mgt_bom", "mgt_bom"),
				MCItemDef.create("mgt_itm_wk", "mgt_itm_wk"),
				MCItemDef.create("mgt_itm_purc", "mgt_itm_purc"),
				MCItemDef.create("mgt_itm_proc", "mgt_itm_proc"),
				MCItemDef.create("mgt_itm_prov", "mgt_itm_prov"),
				MCItemDef.create("mgt_itm_sls", "mgt_itm_sls"),
				MCItemDef.create("mgt_itm_fix", "mgt_itm_fix"),
				MCItemDef.create("copy_mam_itm_", "copy_mam_itm_"),
				MCItemDef.create("copy_mgt_itm", "copy_mgt_itm"),
				MCItemDef.create("copy_mgt_itm_dtl", "copy_mgt_itm_dtl"),
				MCItemDef.create("copy_mgt_itm_oper", "copy_mgt_itm_oper"),
				MCItemDef.create("copy_mgt_bom", "copy_mgt_bom"),
				MCItemDef.create("copy_mgt_itm_wk", "copy_mgt_itm_wk"),
				MCItemDef.create("copy_mgt_itm_purc", "copy_mgt_itm_purc"),
				MCItemDef.create("copy_mgt_itm_proc", "copy_mgt_itm_proc"),
				MCItemDef.create("copy_mgt_itm_prov", "copy_mgt_itm_prov"),
				MCItemDef.create("copy_mgt_itm_sls", "copy_mgt_itm_sls"),
				MCItemDef.create("copy_mgt_itm_fix", "copy_mgt_itm_fix")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

