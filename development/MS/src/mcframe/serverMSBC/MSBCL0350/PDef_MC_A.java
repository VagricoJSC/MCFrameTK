package mcframe.serverMSBC.MSBCL0350;

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
 * [MSBCL_MlyRqmtSchdReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBCL0350.Srch01.UP.BLOCK0")){
			return MS_MSBCL0350_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0350.Srch01.DOWN.BLOCK0")){
			return MS_MSBCL0350_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0350.Srch02.UP.BLOCK0")){
			return MS_MSBCL0350_Srch02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0350.Srch02.DOWN.BLOCK0")){
			return MS_MSBCL0350_Srch02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0350.Chk01.UP.BLOCK0")){
			return MS_MSBCL0350_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0350.Chk01.UP.BLOCK1")){
			return MS_MSBCL0350_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL0350.Chk01.DOWN.BLOCK0")){
			return MS_MSBCL0350_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0350.Upd01.UP.BLOCK0")){
			return MS_MSBCL0350_Upd01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
				
	
	static final MCOperationInfo MS_MSBCL0350_Srch01_INFO = new MCOperationInfo("MS", "MSBCL0350", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL0350_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0350", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("prod_ym_fr", "prod_ym_fr"),
				MCItemDef.create("prod_ym_to", "prod_ym_to"),
				MCItemDef.create("mps_grp_cd", "mps_grp_cd"),
				MCItemDef.create("mps_grp_nm", "mps_grp_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("strg_loc_grp_cd", "strg_loc_grp_cd"),
				MCItemDef.create("strg_loc_grp_nm", "strg_loc_grp_nm"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_loc_nm", "strg_loc_nm")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBCL0350_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0350", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("prod_ym", "prod_ym"),
				MCItemDef.create("mps_grp_cd", "mps_grp_cd"),
				MCItemDef.create("mps_grp_nm", "mps_grp_nm"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_loc_nm", "strg_loc_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("rqst_loc_nm", "rqst_loc_nm"),
				MCItemDef.create("proc_cd", "proc_cd"),
				MCItemDef.create("proc_nm", "proc_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("qty", "qty"),
				MCItemDef.create("pre_qty", "pre_qty"),
				MCItemDef.create("rqmt_qty", "rqmt_qty"),
				MCItemDef.create("fix_rqmt_qty", "fix_rqmt_qty"),
				MCItemDef.create("no_fix_rqmt_qty", "no_fix_rqmt_qty"),
				MCItemDef.create("act_qty", "act_qty"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Srch01_MtrxRslt")
		);
	}
	
	static final MCOperationInfo MS_MSBCL0350_Srch02_INFO = new MCOperationInfo("MS", "MSBCL0350", "Srch02", "000000", new PDef());

	public static MCContainerDef MS_MSBCL0350_Srch02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0350", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("prod_ym_fr", "prod_ym_fr"),
				MCItemDef.create("prod_ym_to", "prod_ym_to"),
				MCItemDef.create("mps_grp_cd", "mps_grp_cd"),
				MCItemDef.create("mps_grp_nm", "mps_grp_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("strg_loc_grp_cd", "strg_loc_grp_cd"),
				MCItemDef.create("strg_loc_grp_nm", "strg_loc_grp_nm"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_loc_nm", "strg_loc_nm")
			}
			,
			MCBlockDef.create("Srch02_Cnd")
		);
	}


	public static MCContainerDef MS_MSBCL0350_Srch02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0350", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("prod_ym", "prod_ym"),
				MCItemDef.create("mps_grp_cd", "mps_grp_cd"),
				MCItemDef.create("mps_grp_nm", "mps_grp_nm"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_loc_nm", "strg_loc_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("rqst_loc_nm", "rqst_loc_nm"),
				MCItemDef.create("proc_cd", "proc_cd"),
				MCItemDef.create("proc_nm", "proc_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("qty", "qty"),
				MCItemDef.create("pre_qty", "pre_qty"),
				MCItemDef.create("rqmt_qty", "rqmt_qty"),
				MCItemDef.create("fix_rqmt_qty", "fix_rqmt_qty"),
				MCItemDef.create("no_fix_rqmt_qty", "no_fix_rqmt_qty"),
				MCItemDef.create("act_qty", "act_qty"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Srch02_MtrxRslt")
		);
	}
	
	static final MCOperationInfo MS_MSBCL0350_Chk01_INFO = new MCOperationInfo("MS", "MSBCL0350", "Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL0350_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0350", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("mps_grp_cd", "mps_grp_cd"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("prod_ym", "prod_ym"),
				MCItemDef.create("qty", "qty"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk01_Rslt")
		);
	}

	public static MCContainerDef MS_MSBCL0350_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL0350", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("file_imp_flg", "file_imp_flg")
			}
			,
			MCBlockDef.create("Chk01_Crtl")
		);
	}


	public static MCContainerDef MS_MSBCL0350_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0350", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("mps_grp_cd", "mps_grp_cd"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("prod_ym", "prod_ym"),
				MCItemDef.create("qty", "qty"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBCL0350_Upd01_INFO = new MCOperationInfo("MS", "MSBCL0350", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL0350_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0350", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("mps_grp_cd", "mps_grp_cd"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("prod_ym", "prod_ym"),
				MCItemDef.create("qty", "qty"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Rslt")
		);
	}


	//FMCB DEF_CLASSES END
}

